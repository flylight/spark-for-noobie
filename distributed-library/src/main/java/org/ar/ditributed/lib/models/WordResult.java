package org.ar.ditributed.lib.models;

/**
 * Word counting result.
 */
public class WordResult {
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
