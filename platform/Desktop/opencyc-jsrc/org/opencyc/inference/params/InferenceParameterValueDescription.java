/* $Id: InferenceParameterValueDescription.java 143897 2013-03-05 22:14:32Z baxter $
 *
 * Copyright (c) 2004 - 2006 Cycorp, Inc.  All rights reserved.
 * This software is the proprietary information of Cycorp, Inc.
 * Use is subject to license terms.
 */

package org.opencyc.inference.params;

//// Internal Imports

/**
 * <P>InferenceParameterValueDescription is designed to...
 *
 * <P>Copyright (c) 2004 - 2006 Cycorp, Inc.  All rights reserved.
 * <BR>This software is the proprietary information of Cycorp, Inc.
 * <P>Use is subject to license terms.
 *
 * @author zelal
 * @date August 14, 2005, 12:47 PM
 * @version $Id: InferenceParameterValueDescription.java 143897 2013-03-05 22:14:32Z baxter $
 */
public interface InferenceParameterValueDescription {

  void setValue(Object value);
  Object getValue();
  String getShortDescription();
  String getLongDescription();
}
