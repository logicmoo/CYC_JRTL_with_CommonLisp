/* $Id: InferenceParameterDescriptions.java 143897 2013-03-05 22:14:32Z baxter $
 *
 * Copyright (c) 2004 - 2006 Cycorp, Inc.  All rights reserved.
 * This software is the proprietary information of Cycorp, Inc.
 * Use is subject to license terms.
 */
package org.opencyc.inference.params;

//// External Imports
import java.util.Map;
import org.opencyc.api.CycAccess;
import org.opencyc.cycobject.CycSymbol;

/**
 * <P>InferenceParameterDescriptions maps the Cyc symbols representing
 * inference parameters to their InferenceParameter versions.
 *
 * @see InferenceParameter.
 *
 * <P>Copyright (c) 2004 - 2006 Cycorp, Inc. All rights reserved.
 * <BR>This software is the proprietary information of Cycorp, Inc.
 * <P>Use is subject to license terms.
 *
 * @author tbrussea
 * @date August 2, 2005, 10:21 AM
 * @version $Id: InferenceParameterDescriptions.java 143897 2013-03-05 22:14:32Z baxter $
 */
public interface InferenceParameterDescriptions extends Map<CycSymbol, InferenceParameter> {

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
