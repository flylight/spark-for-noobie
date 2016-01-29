package org.ar.ditributed.lib.functions;

import org.apache.spark.api.java.function.PairFunction;
import scala.Tuple2;

/**
 * This function map words to key value pair : Key : word , Value : 1
 */
public class MapWordsToValueFunction implements PairFunction<String, String, Integer> {
  @Override
  public Tuple2<String, Integer> call(String s) throws Exception {
    return new Tuple2<String, Integer>(s, 1);
  }
}
