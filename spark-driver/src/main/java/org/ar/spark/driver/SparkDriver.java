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

    private JavaSparkContext sparkContext;

    public SparkDriver(){
        SparkConf sparkConf = new SparkConf().setAppName("SparkForNooobie").setMaster("local");
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
