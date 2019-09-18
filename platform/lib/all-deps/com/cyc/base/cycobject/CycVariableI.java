package com.cyc.base.cycobject;

import java.io.Serializable;

/**
 *
 * @author nwinant
 */
public interface CycVariableI extends CycObject, Serializable {
  
  /**
   * Returns the Cyc representation of the <tt>CycVariable</tt>
   *
   * @return the Cyc representation of the <tt>CycVariable</tt> as a
   * <tt>String</tt> prefixed by "?"
   */
  public String cyclify();

  public boolean isDontCareVariable();

  /**
   * Returns whether this is an HL variable.
   *
   * @return whether this is an HL variable
   */
  public boolean isHLVariable();

  /**
   * Returns whether this is a meta variable.
   *
   * @return whether this is a meta variable
   */
  public boolean isMetaVariable();

  /**
   * Is <code>name</code> a valid Cyc variable name?
   */
  public boolean isValidName(String name);

  public String toCanonicalString();
  
  public String getName();
}
