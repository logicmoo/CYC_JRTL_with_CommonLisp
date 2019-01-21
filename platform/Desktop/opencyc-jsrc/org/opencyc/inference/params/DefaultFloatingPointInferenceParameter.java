/* $Id: DefaultFloatingPointInferenceParameter.java 142849 2013-01-14 22:40:04Z baxter $
 *
 * Copyright (c) 2004 - 2006 Cycorp, Inc.  All rights reserved.
 * This software is the proprietary information of Cycorp, Inc.
 * Use is subject to license terms.
 */
package org.opencyc.inference.params;

//// External Imports
import java.util.Map;

//// Internal Imports
import org.opencyc.api.CycApiException;
import org.opencyc.api.CycObjectFactory;
import org.opencyc.cycobject.CycList;
import org.opencyc.cycobject.CycSymbol;

/**
 * <P>DefaultBooleanInferenceParameter is designed to...
 *
 * <P>Copyright (c) 2004 - 2009 Cycorp, Inc.  All rights reserved.
 * <BR>This software is the proprietary information of Cycorp, Inc.
 * <P>Use is subject to license terms.
 *
 * @author zelal
 * @date August 9, 2005, 9:09 PM
 * @version $Id: DefaultFloatingPointInferenceParameter.java 142849 2013-01-14 22:40:04Z baxter $
 */
public class DefaultFloatingPointInferenceParameter extends AbstractInferenceParameter implements FloatingPointInferenceParameter {

  //// Constructors
  /** Creates a new instance of DefaultBooleanInferenceParameter. */
  public DefaultFloatingPointInferenceParameter(Map propertyMap) {
    super(propertyMap);
    for (int i = 0, size = REQUIRED_SYMBOLS.length; i < size; i++) {
      if (propertyMap.get(REQUIRED_SYMBOLS[i]) == null) {
        throw new RuntimeException("Expected key not found in map " +
                REQUIRED_SYMBOLS[i] +
                " for inference parameter " + propertyMap.get(AbstractInferenceParameter.ID_SYMBOL));
      }
    }
    Object maxValueObj = DefaultInferenceParameterValueDescription.verifyObjectType(propertyMap, MAX_VALUE_SYMBOL, Number.class);
    Object minValueObj = DefaultInferenceParameterValueDescription.verifyObjectType(propertyMap, MIN_VALUE_SYMBOL, Number.class);
    init(((Number) maxValueObj).doubleValue(), ((Number) minValueObj).doubleValue());
  }

  //// Public Area
  @Override
public boolean isValidValue(Object potentialValue) {
    if (isAlternateValue(potentialValue)) {
      return true;
    } else if (DefaultInferenceParameters.isInfiniteValue(potentialValue)) {
      return true;
    } else if (!(potentialValue instanceof Number)) {
      return false;
    }
    double potentialDouble = ((Number) potentialValue).doubleValue();
    if (potentialDouble > maxValue) {
      return false;
    } else if (potentialDouble < minValue) {
      return false;
    } else {
      return true;
    }
  }

  @Override
public double getMaxValue() {
    return maxValue;
  }

  @Override
public double getMinValue() {
    return minValue;
  }

  @Override
public String toString() {
    return super.toString() + " min=" + minValue + " max=" + maxValue;
  }

  @Override
  public Object canonicalizeValue(final Object value) {
    if (value != null && "PlusInfinity".equals(value.toString()) ||
            CycObjectFactory.nil.equals(value)) {
      return DefaultInferenceParameters.getInfiniteValue();
    } else {
      return super.canonicalizeValue(value);
    }
  }


  @Override
public Object parameterValueCycListApiValue(Object val) {
    return val;
  }

  //// Protected Area

  //// Private Area
  private void init(double maxValue, double minValue) {
    this.maxValue = maxValue;
    this.minValue = minValue;
  }
  //// Internal Rep
  private double maxValue;
  private double minValue;
  private final static CycSymbol MAX_VALUE_SYMBOL = new CycSymbol(":MAX-VALUE");
  private final static CycSymbol MIN_VALUE_SYMBOL = new CycSymbol(":MIN-VALUE");
  private final static CycSymbol[] REQUIRED_SYMBOLS = {MAX_VALUE_SYMBOL,
    MIN_VALUE_SYMBOL};

  //// Main
  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
  }
}
