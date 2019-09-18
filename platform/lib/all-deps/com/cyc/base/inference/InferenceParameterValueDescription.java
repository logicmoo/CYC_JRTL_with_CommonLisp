package com.cyc.base.inference;

//// Internal Imports

/**
 * <P>InferenceParameterValueDescription is designed to...
 *
 * @author zelal
 * @date August 14, 2005, 12:47 PM
 * @version $Id: InferenceParameterValueDescription.java 150059 2014-03-26 23:43:49Z nwinant $
 */
public interface InferenceParameterValueDescription {

  void setValue(Object value);
  Object getValue();
  String getShortDescription();
  String getLongDescription();
}
