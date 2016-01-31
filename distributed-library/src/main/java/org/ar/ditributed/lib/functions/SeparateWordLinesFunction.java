package org.ar.ditributed.lib.functions;

import org.apache.spark.api.java.function.FlatMapFunction;

import java.util.Arrays;

/**
 * Function to map words lines from file to single word list.
 */
public class SeparateWordLinesFunction implements FlatMapFunction<String, String> {
  @Override
  public Iterable<String> call(String s) throws Exception {
    return Arrays.asList(s.split(" "));
  }
}
