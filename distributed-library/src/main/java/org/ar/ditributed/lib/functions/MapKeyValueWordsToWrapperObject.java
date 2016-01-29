package org.ar.ditributed.lib.functions;

import org.apache.spark.api.java.function.Function;
import org.ar.ditributed.lib.models.WordResult;
import scala.Tuple2;

/**
 * Map key value words result to wrapper object.
 */
public class MapKeyValueWordsToWrapperObject implements Function<Tuple2<String,Integer>, WordResult> {
  @Override public WordResult call(Tuple2<String, Integer> stringIntegerTuple2) throws Exception {
    return new WordResult(stringIntegerTuple2._1, stringIntegerTuple2._2);
  }
}
