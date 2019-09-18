/* $Id: EnumerationInferenceParameter.java 150536 2014-04-15 20:54:59Z nwinant $
 *
 * Copyright (c) 2004 - 2006 Cycorp, Inc.  All rights reserved.
 * This software is the proprietary information of Cycorp, Inc.
 * Use is subject to license terms.
 */
package com.cyc.baseclient.inference.params;

//// Internal Imports
//// External Imports
import com.cyc.base.inference.InferenceParameterValueDescription;
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
 * @version $Id: EnumerationInferenceParameter.java 150536 2014-04-15 20:54:59Z nwinant $
 */
public interface EnumerationInferenceParameter extends InferenceParameter {

  public List<InferenceParameterValueDescription> getPotentialValues();
}