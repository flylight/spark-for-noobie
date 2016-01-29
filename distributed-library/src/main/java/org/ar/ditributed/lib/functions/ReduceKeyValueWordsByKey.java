package org.ar.ditributed.lib.functions;

import org.apache.spark.api.java.function.Function2;

/**
 * Reduce key value words by Key and summarize their value.
 */
public class ReduceKeyValueWordsByKey implements Function2<Integer, Integer, Integer> {
  @Override public Integer call(Integer intVal1, Integer intVal2) throws Exception {
    return intVal1 + intVal2;
  }
}
