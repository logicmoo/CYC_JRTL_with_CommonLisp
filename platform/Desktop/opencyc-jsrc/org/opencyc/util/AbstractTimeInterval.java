package org.opencyc.util;

import java.util.Date;

/**
 * Implementation of high-level time interval methods.
 * @author baxter
 */
public abstract class AbstractTimeInterval implements TimeInterval {

  /**
   * Do this interval and the specified interval start simultaneously?
   *
   * @param interval
   * @return true iff this interval and the specified interval start
   * simultaneously.
   */
  @Override
public boolean cooriginatesWith(AbstractTimeInterval interval) {
    return !startsBeforeStartingOf(interval) && !startsAfterStartingOf(interval);
  }

  /**
   * Do this interval and the specified interval end simultaneously?
   *
   * @param interval
   * @return true iff this interval and the specified interval end
   * simultaneously.
   */
  @Override
public boolean coterminatesWith(AbstractTimeInterval interval) {
    return !endsBeforeEndingOf(interval) && !endsAfterEndingOf(interval);
  }

  /**
   * Does this interval end after the specified date?
   *
   * @param date
   * @return true iff this interval ends after date.
   */
  @Override
public boolean endsAfter(Date date) {
    return getEnd().after(date);
  }

  /**
   * Does this interval end after the specified interval ends?
   *
   * @param interval
   * @return true iff this interval ends after the specified interval ends.
   */
  @Override
public boolean endsAfterEndingOf(AbstractTimeInterval interval) {
    return endsAfter(interval.getEnd()) || (endsOn(interval.getEnd()) && !interval.getIncludesEnd());
  }

  /**
   * Does this interval end after the specified interval starts?
   *
   * @param interval
   * @return true iff this interval ends after the specified interval starts.
   */
  @Override
public boolean endsAfterStartingOf(AbstractTimeInterval interval) {
    return endsAfter(interval.getStart());
  }

  /**
   * Does this interval end before the specified date?
   *
   * @param date
   * @return true iff this interval ends before date.
   */
  @Override
public boolean endsBefore(Date date) {
    return !endsAfter(date) && !endsOn(date);
  }

  /**
   * Does this interval end before the specified interval ends?
   *
   * @param interval
   * @return true iff this interval ends before the specified interval ends.
   */
  @Override
public boolean endsBeforeEndingOf(AbstractTimeInterval interval) {
    if (this.getEnd().before(interval.getEnd())) {
      return true;
    } else if (this.getEnd().equals(interval.getEnd())) {
      return !this.getIncludesEnd() && interval.getIncludesEnd();
    } else {
      return false;
    }
  }

  /**
   * Does this interval end before the specified interval starts?
   *
   * @param interval
   * @return true iff this interval ends before the specified interval starts.
   */
  @Override
public boolean endsBeforeStartingOf(AbstractTimeInterval interval) {
    return endsBefore(interval.getStart()) || (endsOn(interval.getStart()) && !this.getIncludesEnd());
  }

  /**
   * Does this interval end during the specified interval?
   *
   * @param interval
   * @return true iff this interval's end is subsumed by interval.
   */
  @Override
public boolean endsDuring(AbstractTimeInterval interval) {
    return interval.subsumes(getEnd()) || coterminatesWith(interval);
  }

  /**
   * Does this interval end on the specified date?
   *
   * @param date
   * @return true iff this interval ends on date.
   */
  @Override
public boolean endsOn(Date date) {
    return getEnd().equals(date) && getIncludesEnd();
  }

  @Override
  public boolean equals(Object obj) {
    if (obj == null) {
      return false;
    }
    if (getClass() != obj.getClass()) {
      return false;
    }
    final ContinuousTimeInterval other = (ContinuousTimeInterval) obj;
    return this.cooriginatesWith(other) && this.coterminatesWith(other);
  }

  /**
   * Does this interval start after the specified date?
   *
   * @param date
   * @return true iff this interval starts after date.
   */
  @Override
public boolean startsAfter(Date date) {
    return !startsBefore(date) && !startsOn(date);
  }

  /**
   * Does this interval start after the specified interval ends?
   *
   * @param interval
   * @return true iff this interval starts after the specified interval ends.
   */
  @Override
public boolean startsAfterEndingOf(AbstractTimeInterval interval) {
    return startsAfter(interval.getEnd()) || (startsOn(interval.getEnd()) && !interval.getIncludesEnd());
  }

  /**
   * Does this interval start after the specified interval starts?
   *
   * @param interval
   * @return true iff this interval starts after the specified interval starts.
   */
  @Override
public boolean startsAfterStartingOf(AbstractTimeInterval interval) {
    if (this.getStart().after(interval.getStart())) {
      return true;
    } else if (this.getStart().equals(interval.getStart())) {
      return !this.getIncludesStart() && interval.getIncludesStart();
    } else {
      return false;
    }
  }

  /**
   * Does this interval start before the specified date?
   *
   * @param date
   * @return true iff this interval starts before date.
   */
  @Override
public boolean startsBefore(Date date) {
    return getStart().before(date);
  }

  /**
   * Does this interval start before the specified interval ends?
   *
   * @param interval
   * @return true iff this interval starts before the specified interval ends.
   */
  @Override
public boolean startsBeforeEndingOf(AbstractTimeInterval interval) {
    return startsBefore(interval.getEnd());
  }

  /**
   * Does this interval start before the specified interval starts?
   *
   * @param interval
   * @return true iff this interval starts before the specified interval starts.
   */
  @Override
public boolean startsBeforeStartingOf(AbstractTimeInterval interval) {
    return startsBefore(interval.getStart()) || (startsOn(interval.getStart()) && !interval.getIncludesStart());
  }

  /**
   * Does this interval start during the specified interval?
   *
   * @param interval
   * @return true iff this interval's start is subsumed by interval.
   */
  @Override
public boolean startsDuring(AbstractTimeInterval interval) {
    return interval.subsumes(getStart()) || cooriginatesWith(interval);
  }

  /**
   * Does this interval start on the specified date?
   *
   * @param date
   * @return true iff this interval starts on date.
   */
  @Override
public boolean startsOn(Date date) {
    return getStart().equals(date) && getIncludesStart();
  }

  /**
   * Does this interval subsume the specified date?
   *
   * @param date
   * @return true iff date falls within this interval.
   */
  @Override
public boolean subsumes(Date date) {
    return !startsAfter(date) && !endsBefore(date);
  }

  /**
   * Does this interval subsume the specified interval?
   *
   * @param interval
   * @return true iff interval starts and ends during this interval.
   */
  @Override
public boolean subsumes(AbstractTimeInterval interval) {
    return interval.startsDuring(this) && interval.endsDuring(this);
  }
  
}
