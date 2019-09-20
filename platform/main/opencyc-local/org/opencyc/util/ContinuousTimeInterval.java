package org.opencyc.util;

import org.opencyc.cycobject.Guid;
import org.opencyc.cycobject.CycDenotationalTerm;
import org.opencyc.cycobject.CycObject;
import java.util.Date;
import org.opencyc.cycobject.CycNaut;
import org.opencyc.cycobject.CycConstant;

public class ContinuousTimeInterval extends AbstractTimeInterval {
	public static final ContinuousTimeInterval ALWAYS;
	private final TimePoint startPoint;
	private final TimePoint endPoint;
	private final boolean includesStart;
	private final boolean includesEnd;
	private static final CycConstant CYC_ALWAYS;
	static final CycConstant CYC_NOW;
	static final CycNaut CYC_BEGINNING_OF_TIME;
	static final CycNaut CYC_END_OF_TIME;

	public ContinuousTimeInterval(final Date start, final Date end) {
		this(start, end, true, true);
	}

	public ContinuousTimeInterval(final TimePoint start, final TimePoint end) {
		this(start, end, true, true);
	}

	public ContinuousTimeInterval(final Date start, final Date end, final boolean includesStart, final boolean includesEnd) {
		this((TimePoint) new TimePoint.FixedTimePoint(start), (TimePoint) new TimePoint.FixedTimePoint(end), includesStart, includesEnd);
	}

	public ContinuousTimeInterval(final TimePoint startPoint, final TimePoint endPoint, final boolean includesStart, final boolean includesEnd) {
		if (startPoint == null) {
			throw new IllegalArgumentException("Start must not be null.");
		}
		if (endPoint == null) {
			throw new IllegalArgumentException("End must not be null.");
		}
		if (TimePoint.FixedTimePoint.BEGINNING_OF_TIME == startPoint && !includesStart) {
			throw new IllegalArgumentException("Time interval starting at beginning of time must include its start.");
		}
		if (TimePoint.FixedTimePoint.END_OF_TIME == endPoint && !includesEnd) {
			throw new IllegalArgumentException("Time interval ending at end of time must include its end.");
		}
		this.startPoint = startPoint;
		this.endPoint = endPoint;
		this.includesStart = includesStart;
		this.includesEnd = includesEnd;
		if (this.getEnd().before(this.getStart())) {
			throw new IllegalArgumentException("End must not be before start.");
		}
	}

	public String toString() {
		return "TimeInterval{start=" + this.startPoint + ", end=" + this.endPoint + ", includesStart=" + this.includesStart + ", includesEnd=" + this.includesEnd + '}';
	}

	public Date getStart() {
		return this.startPoint.asDate();
	}

	public boolean getIncludesStart() {
		return this.includesStart;
	}

	public Date getEnd() {
		return this.endPoint.asDate();
	}

	public boolean getIncludesEnd() {
		return this.includesEnd;
	}

	public int hashCode() {
		int hash = 7;
		hash = 97 * hash + ((this.startPoint != null) ? this.startPoint.hashCode() : 0);
		hash = 97 * hash + ((this.endPoint != null) ? this.endPoint.hashCode() : 0);
		hash = 97 * hash + (this.includesStart ? 1 : 0);
		hash = 97 * hash + (this.includesEnd ? 1 : 0);
		return hash;
	}

	public CycObject toCycTerm() {
		try {
			return new CycNaut((CycDenotationalTerm) this.getCycFunctor(), new Object[] { this.getCycTermForStart(), this.getCycTermForEnd() });
		} catch (ParseException ex) {
			throw new RuntimeException((Throwable) ex);
		}
	}

	private CycDenotationalTerm getCycFunctor() {
		return TimeIntervalFunction.getCycFunctor(this.includesStart, this.includesEnd);
	}

	private CycObject getCycTermForStart() throws ParseException {
		return this.startPoint.toCycTerm();
	}

	private CycObject getCycTermForEnd() throws ParseException {
		return this.endPoint.toCycTerm();
	}

	static {
		ALWAYS = new ContinuousTimeInterval((TimePoint) TimePoint.FixedTimePoint.BEGINNING_OF_TIME, (TimePoint) TimePoint.FixedTimePoint.END_OF_TIME, true, true) {
			@Override
			public CycObject toCycTerm() {
				return (CycObject) ContinuousTimeInterval.CYC_ALWAYS;
			}
		};
		CYC_ALWAYS = new CycConstant("Always-TimeInterval", new Guid("c0ea3419-9c29-11b1-9dad-c379636f7270"));
		CYC_NOW = new CycConstant("Now", new Guid("bd58a068-9c29-11b1-9dad-c379636f7270"));
		CYC_BEGINNING_OF_TIME = new CycNaut((CycDenotationalTerm) new CycConstant("StartFn", new Guid("be010fc3-9c29-11b1-9dad-c379636f7270")), new Object[] { ContinuousTimeInterval.CYC_ALWAYS });
		CYC_END_OF_TIME = new CycNaut((CycDenotationalTerm) new CycConstant("EndFn", new Guid("be01123d-9c29-11b1-9dad-c379636f7270")), new Object[] { ContinuousTimeInterval.CYC_ALWAYS });
	}

	static public enum TimeIntervalFunction {
		INCL_INCL("TimeIntervalInclusiveFn", "c08aa1d2-9c29-11b1-9dad-c379636f7270", true, true), EXCL_EXCL("TimeIntervalBetweenFn", "bd58ce20-9c29-11b1-9dad-c379636f7270", false, false), INCL_EXCL("TimeInterval-Incl-Excl-Fn", "4cb5b2d6-2733-41d7-802c-cf187fc10915", true, false), EXCL_INCL("TimeInterval-Excl-Incl-Fn", "4c68f680-2733-41d7-886f-91075f140655", false, true);

		public final boolean includesStart;
		public final boolean includesEnd;
		public final CycConstant cycConstant;

		private static CycConstant getCycFunctor(final boolean includesStart, final boolean includesEnd) {
			for (final TimeIntervalFunction tifn : values()) {
				if (tifn.includesStart == includesStart && tifn.includesEnd == includesEnd) {
					return tifn.cycConstant;
				}
			}
			throw new AssertionError((Object) ("start = " + includesStart + " end = " + includesEnd));
		}

		private TimeIntervalFunction(final String name, final String guid, final boolean includesStart, final boolean includesEnd) {
			this.includesStart = includesStart;
			this.includesEnd = includesEnd;
			this.cycConstant = new CycConstant(name, new Guid(guid));
		}

		public ContinuousTimeInterval constructTimeInterval(final Date start, final Date end) {
			return new ContinuousTimeInterval(start, end, this.includesStart, this.includesEnd);
		}

		public ContinuousTimeInterval constructTimeInterval(final CycNaut naut) {
			if (!this.cycConstant.equals((Object) naut.getFunctor())) {
				throw new IllegalArgumentException();
			}
			final Date start = DateConverter.parseCycDate((CycNaut) naut.getArg(1));
			final Date end = DateConverter.parseCycDate((CycNaut) naut.getArg(2));
			return this.constructTimeInterval(start, end);
		}
	}
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\client-lib\opencyc-0.0.1-SNAPSHOT.jar
	Total time: 100 ms
	
	Decompiled with Procyon 0.5.32.
*/