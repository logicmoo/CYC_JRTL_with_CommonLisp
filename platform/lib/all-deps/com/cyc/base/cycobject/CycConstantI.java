package com.cyc.base.cycobject;

import java.io.Serializable;

/**
 *
 * @author nwinant
 */
public interface CycConstantI extends Fort, Serializable {
  
  /**
   * Returns this object in a form suitable for use as an <tt>CycList</tt> api expression value.
   *
   * @return this object in a form suitable for use as an <tt>CycList</tt> api expression value
   */
 // Object cycListApiValue();
  
  /**
   * Returns the name of the <tt>CycConstant</tt> with "#$" prefixed.
   *
   * @return the name of the <tt>CycConstant</tt> with "#$" prefixed.
   */
 // String cyclify();
  
  /**
   * Returns <tt>true</tt> some object equals this <tt>CycConstant</tt>. The equality check uses only the guid.
   *
   * @param object the <tt>Object</tt> for equality comparison
   * @return equals <tt>boolean</tt> value indicating equality or non-equality.
   */
//  boolean equals(Object object);
  
  /**
   * Returns <tt>true</tt> some object equals this <tt>CycConstant</tt>. The equality check uses only the guid.
   *
   * @param object the <tt>Object</tt> for equality comparison
   * @return equals <tt>boolean</tt> value indicating equality or non-equality.
   */
//  boolean equalsAtEL(Object object);
  
  /**
   * Gets the guid
   *
   * @return the guid
   */
  public Guid getGuid();

  /**
   * Gets the name
   *
   * @return the name
   */
  public String getName();

  /**
   * Sets the guid
   */
  public void setGuid(Guid newGuid);

  /**
   * Sets the name, which should only be called to update a renamed constant.
   *
   * @param name the name
   */
  public String setName(final String name);
}
