package org.ar.ditributed.lib.models;

import java.io.Serializable;

/**
 * Word counting result.
 */
public class WordResult implements Serializable{
  private String word;
  private int count;

  public WordResult(String word, int count) {
    this.word = word;
    this.count = count;
  }

  public String getWord() {
    return word;
  }

  public int getCount() {
    return count;
  }

  @Override
  public String toString() {
    return word + " - " + count;
  }
}
