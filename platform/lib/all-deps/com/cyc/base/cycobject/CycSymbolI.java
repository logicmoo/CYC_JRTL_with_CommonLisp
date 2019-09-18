package com.cyc.base.cycobject;

import java.io.Serializable;

/**
 *
 * @author nwinant
 */
public interface CycSymbolI extends CycObject, Serializable {

  public String getPackageName();

  public String getPackageNamePrecise();

  public String getSymbolName();

  public String getSymbolNamePrecise();

  /**
   * Returns <tt>true</tt> iff this symbol is a SubL keyword.
   *
   * @return <tt>true</tt> iff this symbol is a SubL keyword
   */
  public boolean isKeyword();

  /**
   * Returns <tt>true</tt> iff this symbol should be quoted.
   *
   * @return <tt>true</tt> iff this symbol should be quoted.
   */
  public boolean shouldQuote();

  public boolean toBoolean();

  public String toCanonicalString();

  public String toFullString();

  public String toFullString(String relativePackageName);

  public String toFullStringForced();
}
