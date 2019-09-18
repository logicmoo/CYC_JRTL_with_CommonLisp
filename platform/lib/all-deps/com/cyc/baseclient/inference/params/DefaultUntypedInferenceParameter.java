package com.cyc.baseclient.inference.params;

import com.cyc.base.cycobject.CycSymbolI;
import java.util.Map;

/**
 * <P>DefaultUntypedInferenceParameter is designed to...
 *
 * <P>Copyright (c) 2004 - 2009 Cycorp, Inc.  All rights reserved.
 * <BR>This software is the proprietary information of Cycorp, Inc.
 * <P>Use is subject to license terms.
 *
 * @author baxter
 * @date June 19, 2009
 * @version $Id: DefaultUntypedInferenceParameter.java 150536 2014-04-15 20:54:59Z nwinant $
 */
class DefaultUntypedInferenceParameter extends AbstractInferenceParameter {

  public DefaultUntypedInferenceParameter(Map<CycSymbolI, Object> propertyMap) {
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
