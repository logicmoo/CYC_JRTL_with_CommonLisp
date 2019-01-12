package org.opencyc.util;

import java.util.Date;
import org.opencyc.cycobject.CycConstant;
import org.opencyc.cycobject.CycNaut;
import org.opencyc.cycobject.CycObject;
import org.opencyc.cycobject.Guid;
import org.opencyc.util.TimePoint.FixedTimePoint;

/**
 * A Java representation of continuous time intervals.
 * <p>
 * Continuous time intervals are defined in terms of a start and an end, and
 * either include or do not include each endpoint.
 *
 * @author baxter
 */
public class ContinuousTimeInterval extends AbstractTimeInterval {

  /**
   * Create a new time interval that includes its start and its end.
   *
   * @param start
   * @param end
   */
  public ContinuousTimeInterval(Date start, Date end) {
    this(start, end, true, true);
  }

  /**
   * Create a new time interval that includes its start and its end.
   *
   * @param start
   * @param end
   */
  public ContinuousTimeInterval(TimePoint start, TimePoint end) {
    this(start, end, true, true);
  }

  /**
   * Create a new time interval.
   *
   * @param start
   * @param end
   * @param includesStart
   * @param includesEnd
   */
  public ContinuousTimeInterval(Date start, Date end, boolean includesStart,
          boolean includesEnd) {
    this(new FixedTimePoint(start), new FixedTimePoint(end), includesStart, includesEnd);
  }

  /**
   * Create a new time interval.
   *
   * @param startPoint
   * @param endPoint
   * @param includesStart
   * @param includesEnd
   */
  public ContinuousTimeInterval(TimePoint startPoint, TimePoint endPoint, boolean includesStart,
          boolean includesEnd) {
    if (startPoint == null) {
      throw new IllegalArgumentException("Start must not be null.");
    }
    if (endPoint == null) {
      throw new IllegalArgumentException("End must not be null.");
    }
    if (FixedTimePoint.BEGINNING_OF_TIME == startPoint && !includesStart) {
      throw new IllegalArgumentException("Time interval starting at beginning of time must include its start.");
    }
    if (FixedTimePoint.END_OF_TIME == endPoint && !includesEnd) {
      throw new IllegalArgumentException("Time interval ending at end of time must include its end.");
    }
    this.startPoint = startPoint;
    this.endPoint = endPoint;
    this.includesStart = includesStart;
    this.includesEnd = includesEnd;
    if (endBeforeStart()) {
      throw new IllegalArgumentException("End must not be before start.");
    }
  }

  private boolean endBeforeStart() {
    try {
      return getEnd().before(getStart());
    } catch (Exception e) {
      throw new RuntimeException(e);
    }
  }

  @Override
  public String toString() {
    return "TimeInterval{" + "start=" + startPoint + ", end=" + endPoint
            + ", includesStart=" + includesStart + ", includesEnd=" + includesEnd + '}';
  }

  /**
   * Returns the starting date of the interval.
   *
   * @return the starting date of the interval.
   */
  @Override
  public Date getStart() {
    return startPoint.asDate();
  }

  /**
   * Does this time interval include its start? If so, it begins when its start
   * begins. If not, it begins immediately startsAfterEndingOf.
   *
   * @return true iff this time interval includes its start.
   */
  @Override
  public boolean getIncludesStart() {
    return includesStart;
  }

  /**
   * Returns the ending date of the interval.
   *
   * @return the ending date of the interval.
   */
  @Override
  public Date getEnd() {
    return endPoint.asDate();
  }

  /**
   * Does this time interval include its end? If so, it ends when its end ends.
   * If not, it ends immediately endsBeforeStartingOf.
   *
   * @return true iff this time interval includes its end.St
   */
  @Override
  public boolean getIncludesEnd() {
    return includesEnd;
  }

  @Override
  public int hashCode() {
    int hash = 7;
    hash = 97 * hash + (this.startPoint != null ? this.startPoint.hashCode() : 0);
    hash = 97 * hash + (this.endPoint != null ? this.endPoint.hashCode() : 0);
    hash = 97 * hash + (this.includesStart ? 1 : 0);
    hash = 97 * hash + (this.includesEnd ? 1 : 0);
    return hash;
  }

  /**
   * Return the CycObject corresponding to this time interval.
   *
   * @return the corresponding CycObject
   * @see org.opencyc.cycobject.CycObject
   */
  public CycObject toCycTerm() {
    //@TODO -- Handle Terminus start/ends.
    try {
      return new CycNaut(getCycFunctor(), getCycTermForStart(),
              getCycTermForEnd());
    } catch (ParseException ex) {
      throw new RuntimeException(ex);
    }
  }

  private CycConstant getCycFunctor() {
    return TimeIntervalFunction.getCycFunctor(includesStart, includesEnd);
  }

  private CycObject getCycTermForStart() throws ParseException {
    return startPoint.toCycTerm();
  }

  private CycObject getCycTermForEnd() throws ParseException {
    return endPoint.toCycTerm();
  }
  /**
   * The time interval that includes every time point.
   */
  public static final ContinuousTimeInterval ALWAYS = new ContinuousTimeInterval(FixedTimePoint.BEGINNING_OF_TIME,
          FixedTimePoint.END_OF_TIME, true, true) {

            @Override
            public CycObject toCycTerm() {
              return CYC_ALWAYS;
            }
          };
  private final TimePoint startPoint;
  private final TimePoint endPoint;
  private final boolean includesStart;
  private final boolean includesEnd;
  private static final CycConstant CYC_ALWAYS = new CycConstant(
          "Always-TimeInterval",
          new Guid("c0ea3419-9c29-11b1-9dad-c379636f7270"));
  static final CycConstant CYC_NOW = new CycConstant("Now", new Guid(
          "bd58a068-9c29-11b1-9dad-c379636f7270"));
  static final CycNaut CYC_BEGINNING_OF_TIME = new CycNaut(
          new CycConstant("StartFn", new Guid("be010fc3-9c29-11b1-9dad-c379636f7270")),
          CYC_ALWAYS);
  static final CycNaut CYC_END_OF_TIME = new CycNaut(
          new CycConstant("EndFn", new Guid("be01123d-9c29-11b1-9dad-c379636f7270")),
          CYC_ALWAYS);

  public enum TimeIntervalFunction {

    INCL_INCL("TimeIntervalInclusiveFn", "c08aa1d2-9c29-11b1-9dad-c379636f7270",
            true, true),
    EXCL_EXCL("TimeIntervalBetweenFn", "bd58ce20-9c29-11b1-9dad-c379636f7270",
            false, false),
    INCL_EXCL("TimeInterval-Incl-Excl-Fn",
            "4cb5b2d6-2733-41d7-802c-cf187fc10915",
            true, false),
    EXCL_INCL("TimeInterval-Excl-Incl-Fn",
            "4c68f680-2733-41d7-886f-91075f140655",
            false, true);

    private static CycConstant getCycFunctor(boolean includesStart,
            boolean includesEnd) {
      for (final TimeIntervalFunction tifn : values()) {
        if (tifn.includesStart == includesStart && tifn.includesEnd == includesEnd) {
          return tifn.cycConstant;
        }
      }
      throw new AssertionError(
              "start = " + includesStart + " end = " + includesEnd);
    }
    public final boolean includesStart;
    public final boolean includesEnd;
    public final CycConstant cycConstant;

    private TimeIntervalFunction(final String name, final String guid,
            final boolean includesStart, final boolean includesEnd) {
      this.includesStart = includesStart;
      this.includesEnd = includesEnd;
      this.cycConstant = new CycConstant(name, new Guid(guid));
    }

    public ContinuousTimeInterval constructTimeInterval(final Date start, final Date end) {
      return new ContinuousTimeInterval(start, end, includesStart, includesEnd);
    }

    public ContinuousTimeInterval constructTimeInterval(CycNaut naut) {
      if (!cycConstant.equals(naut.getFunctor())) {
        throw new IllegalArgumentException();
      }
      CycNaut startNaut = (CycNaut) naut.getArg(1);
      final boolean inFactExcludesStart = includesStart && oneSecondAfter(startNaut);
      if (inFactExcludesStart) {
        startNaut = (CycNaut) startNaut.getArg1();
      }
      final Date startDate = parseDate(startNaut);
      CycNaut endNaut = (CycNaut) naut.getArg(2);
      final boolean inFactExcludesEnd = includesEnd && oneSecondBefore(endNaut);
      if (inFactExcludesEnd) {
        endNaut = (CycNaut) endNaut.getArg1();
      }
      final Date endDate = parseDate(endNaut);
      return new ContinuousTimeInterval(startDate, endDate,
              (includesStart && !inFactExcludesStart),
              (includesEnd && !inFactExcludesEnd));
    }

    private Date parseDate(final CycNaut naut) {
      final Date date = DateConverter.parseCycDate(naut);
      if (date == null) {
        throw new UnsupportedOperationException("Can't parse NAUT as date " + naut);
      }
      return date;
    }
    private static final CycConstant INTERVAL_BEFORE_FN
            = new CycConstant("IntervalBeforeFn", new Guid("bd58fa99-9c29-11b1-9dad-c379636f7270"));
    private static final CycConstant INTERVAL_AFTER_FN
            = new CycConstant("IntervalAfterFn", new Guid("bd58a0a0-9c29-11b1-9dad-c379636f7270"));

    private static final CycConstant SECONDS_DURATION
            = new CycConstant("SecondsDuration", new Guid("bd58ebb1-9c29-11b1-9dad-c379636f7270"));
    private static final CycNaut ONE_SECOND
            = new CycNaut(SECONDS_DURATION, 1);

    private boolean oneSecondBefore(final CycNaut naut) {
      return INTERVAL_BEFORE_FN.equals(naut.getFunctor())
              && ONE_SECOND.equals(naut.getArg2());
    }

    private boolean oneSecondAfter(final CycNaut naut) {
      return INTERVAL_AFTER_FN.equals(naut.getFunctor())
              && ONE_SECOND.equals(naut.getArg2());
    }
  }
}
