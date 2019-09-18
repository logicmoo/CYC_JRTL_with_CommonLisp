package com.cyc.base.cycobject;

/**
 *
 * @author nwinant
 */
public interface CycNumberI extends DenotationalTerm {

  Object cycExpressionApiValue();

  /**
   * Returns this object in a form suitable for use as an <tt>CycList</tt> api expression value.
   *
   * @return this object in a form suitable for use as an <tt>CycList</tt> api expression value
   */
  Object cycListApiValue();

  /**
   * Returns <tt>true</tt> some object equals this <tt>CycNumber</tt>.
   * In constrast to equals(), this will also return true if a java Number
   * is equals() to the number encapsulated by this CycNumber.
   *
   * @param object the <tt>Object</tt> for equality comparison
   * @return equals <tt>boolean</tt> value indicating equality or non-equality.
   */
  boolean equalsAtEL(Object object);

  /**
   * Gets the value of this CycNumber as a java Number.
   *
   * @return the number as a java Number
   */
  Number getNumber();

  /**
   * Convenience method to compare two CycNumbers numerically.
   * @param other
   * @return true iff this CycNumber is numerically larger than other.
   */
  boolean isGreaterThan(CycNumberI other);
}
