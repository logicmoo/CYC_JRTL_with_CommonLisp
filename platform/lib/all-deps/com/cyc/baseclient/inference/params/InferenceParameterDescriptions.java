package com.cyc.baseclient.inference.params;

//// External Imports
import com.cyc.base.CycAccess;
import com.cyc.base.cycobject.CycSymbolI;
import com.cyc.base.inference.InferenceParameters;
import java.util.Map;

/**
 * <P>InferenceParameterDescriptions maps the Cyc symbols representing
 * inference parameters to their InferenceParameter versions.
 *
 * @see InferenceParameter.
 *
 * <P>Copyright (c) 2004 - 2006 Cycorp, Inc. All rights reserved.
 <BR>This software is the proprietary information of Cycorp, Inc.
 <P>Use is subject to license terms.
 *
 * @author tbrussea
 * @date August 2, 2005, 10:21 AM
 * @version $Id: InferenceParameterDescriptions.java 150783 2014-04-26 00:53:01Z nwinant $
 */
public interface InferenceParameterDescriptions extends Map<CycSymbolI, InferenceParameter> {

  /**
   * Get the string API representation for this map.
   *
   * @return the string API representation.
   */
  String stringApiValue();

  /**
   * Get the Cyc access used by this map.
   *
   * @return the Cyc access.
   */
  CycAccess getCycAccess();

  /**
   * Get the default inference parameters for this map.
   *
   * @return the default parameters
   */
  InferenceParameters getDefaultInferenceParameters();
}
