/* $Id: EnumerationInferenceParameter.java 142849 2013-01-14 22:40:04Z baxter $
 *
 * Copyright (c) 2004 - 2006 Cycorp, Inc.  All rights reserved.
 * This software is the proprietary information of Cycorp, Inc.
 * Use is subject to license terms.
 */
package org.opencyc.inference.params;

//// Internal Imports
//// External Imports
import java.util.List;

/**
 * <P>InferenceParameter is designed to...
 *
 * <P>Copyright (c) 2004 - 2006 Cycorp, Inc.  All rights reserved.
 * <BR>This software is the proprietary information of Cycorp, Inc.
 * <P>Use is subject to license terms.
 *
 * @author tbrussea
 * @date August 2, 2005, 10:25 AM
 * @version $Id: EnumerationInferenceParameter.java 142849 2013-01-14 22:40:04Z baxter $
 */
public interface EnumerationInferenceParameter extends InferenceParameter {

  public List<InferenceParameterValueDescription> getPotentialValues();
}