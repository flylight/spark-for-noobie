package org.ar.spark.driver;

import org.apache.spark.SparkConf;
import org.apache.spark.api.java.JavaRDD;
import org.apache.spark.api.java.JavaSparkContext;
import org.ar.ditributed.lib.functions.MapKeyValueWordsToWrapperObject;
import org.ar.ditributed.lib.functions.MapWordLinesToSingleWordsList;
import org.ar.ditributed.lib.functions.MapWordsToValueFunction;
import org.ar.ditributed.lib.functions.ReduceKeyValueWordsByKey;
import org.ar.ditributed.lib.models.WordResult;

import java.util.List;

/**
 * This is Apache Spark driver.
 */
public class SparkDriver {

    private String[] distributedJars = new String[]{"/workspace/projects/spark-for-noobie/distributed-library/target/distributed-library-1.0-SNAPSHOT.jar"};

    private JavaSparkContext sparkContext;

    public SparkDriver(){
        SparkConf sparkConf = new SparkConf().setAppName("SparkForNoobie")
            .setJars(distributedJars).setMaster("spark://127.0.0.1:7077");
        this.sparkContext = new JavaSparkContext(sparkConf);
    }

    public List<WordResult> countWordsFromFile(String filePath){
        JavaRDD<String> words = sparkContext.textFile(filePath);
        return words
            .flatMap(new MapWordLinesToSingleWordsList())
            .mapToPair(new MapWordsToValueFunction())
            .reduceByKey(new ReduceKeyValueWordsByKey())
            .map(new MapKeyValueWordsToWrapperObject())
            .collect();
    }
}
