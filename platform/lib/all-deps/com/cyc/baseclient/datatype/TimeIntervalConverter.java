/*
 * A converter utility for time intervals.
 */
package com.cyc.baseclient.datatype;

import com.cyc.baseclient.datatype.TimePoint;
import com.cyc.baseclient.datatype.DataTypeConverter;
import com.cyc.baseclient.cycobject.CycNaut;
import com.cyc.base.cycobject.CycObject;
import com.cyc.baseclient.datatype.ContinuousTimeInterval.TimeIntervalFunction;
import com.cyc.baseclient.util.ParseException;

/**
 *
 * @author baxter
 */
public class TimeIntervalConverter extends DataTypeConverter<TimeInterval> {

  //// Constructors
  /** Creates a new instance of TimeIntervalConverter. */
  private TimeIntervalConverter() {
  }

  //// Public Area
  /** Returns an instance of
   * <code>TimeIntervalConverter</code>.
   *
   * If an instance has already been created, the existing one will be returned.
   * Otherwise, a new one will be created.
   *
   * @return The singleton instance of this class.
   */
  public static TimeIntervalConverter getInstance() {
    return SHARED_INSTANCE;
  }

  public static TimeInterval parseCycInterval(CycObject cycObject) throws ParseException {
    return getInstance().fromCycTerm(cycObject);
  }

  @Override
  protected CycObject toCycTerm(TimeInterval obj) throws ParseException {
    return obj.toCycTerm();
  }

  @Override
  protected TimeInterval fromCycTerm(CycObject cycObject) throws ParseException {
    if (ContinuousTimeInterval.ALWAYS.toCycTerm().equals(cycObject)) {
      return ContinuousTimeInterval.ALWAYS;
    } else if (TimePoint.NonFixedTimePoint.NOW.toCycTerm().equals(cycObject)) {
      return TimePoint.NonFixedTimePoint.NOW;
    } else {
      try {
        final CycNaut naut = (CycNaut) CycNaut.convertIfPromising(cycObject);
        for (final ContinuousTimeInterval.TimeIntervalFunction tifn : TimeIntervalFunction.values()) {
          if (naut.getFunctor().equals(tifn.cycConstant)) {
            return tifn.constructTimeInterval(naut);
          }
        }
      } catch (ClassCastException ex) {
      }
      throw new ParseException("Couldn't convert " + cycObject);
    }
  }
  private static final TimeIntervalConverter SHARED_INSTANCE = new TimeIntervalConverter();
}
