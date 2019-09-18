/*
 */
package com.cyc.nl;

/*
 * #%L
 * Query API
 * %%
 * Copyright (C) 1995 - 2014 Cycorp, Inc
 * %%
 * This software is the proprietary information of Cycorp, Inc.
 * Use is subject to license terms.
 * #L%
 */

/**
 * A class to represent a sub-sequence location specified by offset and end indices.
 * <code>Span</code>s are used to represent the locations of terms and queries in natural language Strings.
 * @author baxter
 */
public class Span {
  final private int offset;
  final private int end;

  @Override
  public String toString() {
    return "Span{" + "offset=" + offset + ", end=" + end + '}';
  }

  @Override
  public boolean equals(Object obj) {
    if (obj == null) {
      return false;
    }
    if (getClass() != obj.getClass()) {
      return false;
    }
    final Span other = (Span) obj;
    if (this.offset != other.offset) {
      return false;
    }
    if (this.end != other.end) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    int hash = 5;
    hash = 17 * hash + this.offset;
    hash = 17 * hash + this.end;
    return hash;
  }

  /**
   * Get the end index of this span.
   * @return the end index
   */
  public int getEnd() {
    return end;
  }

  /**
   * Get the offset of this span.
   * @return the offset.
   */
  public int getOffset() {
    return offset;
  }

  /**
   *
   * @param offset
   * @param end
   */
  public Span(int offset, int end) {
    this.offset = offset;
    this.end = end;
  }
  
}
