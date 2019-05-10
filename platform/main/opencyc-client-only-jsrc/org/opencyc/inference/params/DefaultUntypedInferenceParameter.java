/* $Id: DefaultUntypedInferenceParameter.java 143897 2013-03-05 22:14:32Z baxter $
 *
 * Copyright (c) 2004 - 2009 Cycorp, Inc.  All rights reserved.
 * This software is the proprietary information of Cycorp, Inc.
 * Use is subject to license terms.
 */
package org.opencyc.inference.params;

import java.util.Map;
import org.opencyc.cycobject.CycSymbol;

/**
 * <P>DefaultUntypedInferenceParameter is designed to...
 *
 * <P>Copyright (c) 2004 - 2009 Cycorp, Inc.  All rights reserved.
 * <BR>This software is the proprietary information of Cycorp, Inc.
 * <P>Use is subject to license terms.
 *
 * @author baxter
 * @date June 19, 2009
 * @version $Id: DefaultUntypedInferenceParameter.java 143897 2013-03-05 22:14:32Z baxter $
 */
class DefaultUntypedInferenceParameter extends AbstractInferenceParameter {

  public DefaultUntypedInferenceParameter(Map<CycSymbol, Object> propertyMap) {
    super(propertyMap);
  }

  @Override
  public boolean isValidValue(Object potentialValue) {
    return true;
  }

 
  @Override
  public Object parameterValueCycListApiValue(Object val) {
    return val;
  }
}
