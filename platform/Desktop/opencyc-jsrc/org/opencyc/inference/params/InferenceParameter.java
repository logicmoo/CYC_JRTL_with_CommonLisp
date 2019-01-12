/* $Id: InferenceParameter.java 143897 2013-03-05 22:14:32Z baxter $
 *
 * Copyright (c) 2004 - 2006 Cycorp, Inc.  All rights reserved.
 * This software is the proprietary information of Cycorp, Inc.
 * Use is subject to license terms.
 */
package org.opencyc.inference.params;

//// Internal Imports
import org.opencyc.cycobject.CycFort;
import org.opencyc.cycobject.CycSymbol;


//// External Imports
/**
 * <P>InferenceParameter is designed to...
 *
 * <P>Copyright (c) 2004 - 2006 Cycorp, Inc.  All rights reserved.
 * <BR>This software is the proprietary information of Cycorp, Inc.
 * <P>Use is subject to license terms.
 *
 * @author tbrussea
 * @date August 2, 2005, 10:25 AM
 * @version $Id: InferenceParameter.java 143897 2013-03-05 22:14:32Z baxter $
 */
public interface InferenceParameter {

  /* @return the CycList API value for val qua value for this parameter. */
  Object parameterValueCycListApiValue(Object val);

  /**
   * Canonicalize a value for this parameter.
   * @param value
   * @return the canonical form of the value.
   */
  Object canonicalizeValue(Object value);

  /**
   * Get the Cyc term that represents this parameter.
   * @return the Cyc term.
   */
  CycFort getId();

  /**
   * Get the Cyc symbol that represents this parameter.
   * @return the Cyc symbol.
   */
  CycSymbol getKeyword();

  /**
   * Get a short description of this parameter.
   * @return the description
   */
  String getShortDescription();

  /**
   * Get a long description of this parameter.
   * @return the description.
   */
  String getLongDescription();

  /**
   * Get a human-friendly string representation of the specified value.
   * @param value
   * @return a pretty representation of the value.
   */
  String getPrettyRepresentation(Object value);

  InferenceParameterValueDescription getAlternateValue();

  boolean isAlternateValue(Object value);

  /**
   * Determine whether the specified value is valid for this parameter.
   * @param potentialValue
   * @return true if it is a valid value.
   */
  boolean isValidValue(Object potentialValue);

  /**
   * 
   * @return true if this is a basic parameter.
   */
  boolean isBasicParameter();

  /**
   * 
   * @return true if this is a query static parameter.
   */
  boolean isQueryStaticParameter();

  /**
   * Get the default value for this parameter.
   * @return the default value.
   */
  Object getDefaultValue();
}
