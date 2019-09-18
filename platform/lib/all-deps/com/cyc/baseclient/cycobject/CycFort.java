package com.cyc.baseclient.cycobject;

import com.cyc.base.cycobject.DenotationalTerm;
import com.cyc.base.cycobject.Fort;
import java.io.*;

/**
 * This class implements a Cyc Fort (First Order Reified Term).
 *
 * @version $Id: CycFort.java 150787 2014-04-26 01:55:03Z nwinant $
 * @author Stephen L. Reed
 */
public abstract class CycFort extends DefaultCycObject implements Fort, DenotationalTerm, Serializable {
  
  /**
   * Compares this object with the specified object for order.
   * Returns a negative integer, zero, or a positive integer as this
   * object is less than, equal to, or greater than the specified object.
   *
   * @param object the reference object with which to compare.
   * @return a negative integer, zero, or a positive integer as this
   * object is less than, equal to, or greater than the specified object
   */
  public int compareTo(Object object) {
    if (this instanceof CycConstant) {
      if (object instanceof CycConstant)
        return this.toString().compareTo(object.toString());
      else if (object instanceof CycNart)
        return this.toString().compareTo(object.toString().substring(1));
      else
        throw new ClassCastException("Must be a CycFort object");
    }
    else {
      if (object instanceof CycNart)
        return this.toString().compareTo(object.toString());
      else if (object instanceof CycConstant)
        return this.toString().substring(1).compareTo(object.toString());
      else
        throw new ClassCastException("Must be a CycFort object");
    }
  }
  
  /**
   * Returns <tt>true</tt> some object equals this <tt>CycConstant</tt>. The equality check uses only the guid.
   *
   * @param object the <tt>Object</tt> for equality comparison
   * @return equals <tt>boolean</tt> value indicating equality or non-equality.
   */
  abstract public boolean equals(Object object);
  
  /**
   * Returns <tt>true</tt> some object equals this <tt>CycFort</tt> at the EL level.
   *
   * @param object the <tt>Object</tt> for equality comparison
   * @return equals <tt>boolean</tt> value indicating equality or non-equality.
   */
  abstract public boolean equalsAtEL(Object object);
  
  /**
   * When true, indicates that the fort is invalid.
   */
  protected boolean isInvalid = false;
  
}

