package org.ar.spark.noobie.services;

import org.ar.ditributed.lib.models.WordResult;
import org.ar.spark.driver.SparkDriver;

import java.util.List;

/**
 * Service that use our Spark Driver and declare text file path constant.
 */
public class DataService {

  private static final String TEXT_FILE_PATH = "";
  private SparkDriver sparkDriver = new SparkDriver();

  public List<WordResult> countWords(){
    return sparkDriver.countWordsFromFile(TEXT_FILE_PATH);
  }

}
