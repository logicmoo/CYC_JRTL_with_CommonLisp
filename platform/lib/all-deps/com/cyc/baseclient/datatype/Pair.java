package com.cyc.baseclient.datatype;

import com.cyc.baseclient.datatype.AbstractPair;
import java.util.StringTokenizer;

/**
 * Implements an ordered pair, two associated <code>Object</code>s.<p>
 *
 * @version $Id: Pair.java 150787 2014-04-26 01:55:03Z nwinant $
 * @author Bjorn Aldag
 */
public class Pair extends AbstractPair{

  /**
   * Constructs a new Pair object.
   */
  public Pair(){
    }

  /**
   * Constructs a new Pair object given two components.
   *
   * @param component1 the first component of the Pair
   * @param component2 the second component of the Pair
   */
  public Pair(Object component1, Object component2) {super(component1, component2);}

  /**
   * Returns a <code>Pair</code> representation of a <code>String</code>.
   *
   * @param pairString the string to be parsed into a Pair object
   * @return a <coe>Pair</code> representation of a <code>String</code>.
   * @throws DataFormatException when the given string is not parsable to a
   *         <code>Pair</code>
   */
  public static Pair parsePair(String pairString) {
    StringTokenizer components = new StringTokenizer(pairString, separators);
    return new Pair(components.nextToken(), components.nextToken());
    }
}
