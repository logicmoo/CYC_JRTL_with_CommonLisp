package  com.cyc.baseclient.cycobject;

import java.math.BigDecimal;

/**
 * Represents a quantity or range with a CycFort unit of measure, a minimum numeric
 * value, and a maximum numeric value.
 *
 * @version $Id: CycQuantity.java 150787 2014-04-26 01:55:03Z nwinant $
 * @author David Baxter
 */
public class CycQuantity implements Comparable<CycQuantity> {
  private CycQuantity(final CycFort unitOfMeasure, final Number minValue, final Number maxValue) {
    this.unitOfMeasure = unitOfMeasure;
    this.minValue = minValue;
    this.maxValue = maxValue;
  }
  
  /** Create a new CycQuantity from its CycArrayList representation.
   * @deprecated Use CycNaut version.
   */
  public static CycQuantity valueOf(final CycArrayList cycList) {
    if (cycList.size() < 2) {
      return null;
    } else if (cycList.size() > 3) {
      return null;
    } else {
      final Object unit = cycList.first();
      if (unit instanceof CycFort) { //@stub -- should check for UnitOfMeasure
        final Object min = cycList.second();
        if (min instanceof Number) {
          final Object max = (cycList.size() > 2) ? cycList.third() : min;
          if (max instanceof Number) {
            return new CycQuantity((CycFort)unit, (Number)min, (Number)max);
          }
        }
      }
    }
    return null;
  }

  /** Create a new CycQuantity from its CycNaut representation.
   */
  public static CycQuantity valueOf(final CycNaut naut) {
    if (naut.getArity() < 1) {
      return null;
    } else if (naut.getArity() > 2) {
      return null;
    } else {
      final Object unit = naut.getOperator();
      if (unit instanceof CycFort) { //@stub -- should check for UnitOfMeasure
        final Object min = naut.getArg1();
        if (min instanceof Number) {
          final Object max = (naut.getArity() > 1) ? naut.getArg2() : min;
          if (max instanceof Number) {
            return new CycQuantity((CycFort)unit, (Number)min, (Number)max);
          }
        }
      }
    }
    return null;
  }
  
  public String toString() {
    if (minValue.equals(maxValue)) {
      return "(" + unitOfMeasure + " " + minValue + ")";
    } else {
      return "(" + unitOfMeasure + " " + minValue + " " + maxValue + ")";
    }
  }
  
  
  public int compareTo(CycQuantity o) {
    if (o.unitOfMeasure.equals(unitOfMeasure)) {
      if (o.minValue.equals(minValue)) {
        return compare(maxValue, o.maxValue);
      } else {
        return compare(minValue, o.minValue);
      }
    } else {
      // @stub -- Use conversion factors to compare comparable quantities with different units.
      return unitOfMeasure.compareTo(o.unitOfMeasure);
    }
  }
  
  private static int compare(final Number num1, final Number num2) {
    if (num1 instanceof Integer && num2 instanceof Integer) {
      return ((Integer)num1).compareTo((Integer)num2);
    } else if (num1 instanceof Long && num2 instanceof Long) {
      return ((Long)num1).compareTo((Long)num2);
    } else {
      final int intResult = Integer.valueOf(num1.intValue()).compareTo(num2.intValue());
      if (intResult != 0) {
        return intResult;
      } else {
        return Double.compare(num1.doubleValue(), num2.doubleValue());
      }
    }
  }
  
  private final CycFort unitOfMeasure;
  private final Number minValue;
  private final Number maxValue;
}

