/* For LarKC */
package com.cyc.tool.subl.jrtl.nativeCode.subLisp;

import java.util.ArrayDeque;
import java.util.Date;
import java.util.Deque;
import java.util.TimeZone;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLNil;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbolFactory;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.time_high;
import com.cyc.tool.subl.util.SafeRunnable;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.util.SubLTrampolineFile;

public class Time extends SubLTrampolineFile {
	public static SubLObject compute_with_process_resource_tracking_results(SubLObject resourceSpec) {
		SubLObject now = get_time();
		SubLObject delta = Numbers.subtract(now, resourceSpec);
		SubLObject hundredsOfNanos = Numbers.multiply(delta, CommonSymbols.TEN_INTEGER);
		Object[] listItems = { SubLObjectFactory.makeKeyword("SYSTEM-TIME"), CommonSymbols.ZERO_INTEGER,
				SubLObjectFactory.makeKeyword("USER-TIME"), hundredsOfNanos };
		SubLObject result = SubLObjectFactory.makeList(listItems);
		return result;
	}

	public static SubLObject decode_universal_time(SubLObject universalTime, SubLObject timeZone) {
		return time_high.decode_universal_time(universalTime, timeZone);
	}

	public static SubLObject encode_universal_time(SubLObject second, SubLObject minute, SubLObject hour,
			SubLObject day, SubLObject month, SubLObject year, SubLObject time_zone) {
		return time_high.encode_universal_time(second, minute, hour, day, month, year, time_zone);
	}

	public static SubLObject ensure_current_process_timeout_is_cancelled() {
		Deque<Object> timeouts = Time.timeoutsTL.get();
		if (timeouts.isEmpty())
			Errors.warn("Trying to cancel a timeout that no longer apears on the timeout stack.");
		Object timeoutObj = timeouts.isEmpty() ? SubLNil.NIL : timeouts.pop();
		if (timeoutObj == SubLNil.NIL)
			return SubLNil.NIL;
		ScheduledFuture<?> timeout = (ScheduledFuture<?>) timeoutObj;
		synchronized (timeout) {
			if (timeout == null || timeout.isCancelled() || timeout.isDone())
				return SubLNil.NIL;
			timeout.cancel(false);
		}
		return SubLNil.NIL;
	}

	public static SubLObject get_decoded_time() {
		return time_high.get_decoded_time();
	}

	public static SubLObject get_internal_real_time() {
		return time_high.get_internal_real_time();
	}

	public static SubLObject get_internal_run_time() {
		return time_high.get_internal_run_time();
	}

	public static SubLObject get_time() {
		return SubLObjectFactory.makeInteger(get_time_internal());
	}

	public static long get_time_internal() {
		return fromPlatformTimeMicroSecs(Math.round(getCurrentNanoTimeAlignedWithMilliTime() / 1000.0));
	}

	public static SubLObject get_timezone(SubLObject universalTime) {
		long elapsedMillis = universalTimeToUnixTime(universalTime);
		TimeZone localTZ = TimeZone.getDefault();
		long offsetMillis = localTZ.getOffset(elapsedMillis);
		int offsetSeconds = (int) (offsetMillis / 1000L);
		int offsetWestSeconds = -offsetSeconds;
		boolean wasDST = localTZ.inDaylightTime(new Date(elapsedMillis));
		return Values.values(SubLObjectFactory.makeInteger(offsetWestSeconds), SubLObjectFactory.makeBoolean(wasDST));
	}

	public static SubLObject get_universal_time() {
		return time_high.get_universal_time();
	}

	public static long getCurrentNanoTimeAlignedWithMilliTime() {
		return System.nanoTime() - Time.INITIAL_NANO_TIME + Time.INITIAL_NANO_TIME_CONVERTED_FROM_MILLI_TIME;
	}

	public static SubLObject internal_real_time_has_arrivedP(SubLObject internal_real_time) {
		long epochMicrosNow = get_time_internal();
		long epochMicrosExpected = internal_real_time.longValue();
		boolean hasArrived = epochMicrosNow >= epochMicrosExpected;
		return SubLObjectFactory.makeBoolean(hasArrived);
	}

	public static void main(String[] args) {
		TimeZone tz = TimeZone.getDefault();
		System.out.println("Got default time-zone " + tz);
		System.out.println("The offset for this timezone is: " + tz.getRawOffset());
		System.out.println("The daylight savings information for this timezone is: " + tz.getDSTSavings());
		System.out.println(
				"The offset for this timezone via the current time is: " + tz.getOffset(System.currentTimeMillis()));
		System.out
				.println("The daylight savings information via the current time is: " + tz.inDaylightTime(new Date()));
	}

	public static long scaleInternalToUniversalTime(long epochMicros) {
		long epochSeconds = epochMicros / 1000L / 1000L;
		return epochSeconds;
	}

	public static long scaleUniversalToInternalTime(long epochSeconds) {
		long epochMicros = epochSeconds * 1000L * 1000L;
		return epochMicros;
	}

	public static SubLObject schedule_current_process_for_timeout(final SubLObject tag,
			SubLObject secondsBeforeTimeout) {
		if (secondsBeforeTimeout == SubLNil.NIL) {
			Time.timeoutsTL.get().push(SubLNil.NIL);
			return SubLNil.NIL;
		}
		final SubLProcess proc = SubLProcess.currentProcess();
		secondsBeforeTimeout.enforceType(CommonSymbols.NON_NEGATIVE_NUMBER_P);
		SafeRunnable safeRunnable = new SafeRunnable() {
			@Override
			public void safeRun() {
				SubLSymbol with_timeout_signal_timeout = SubLSymbolFactory.makeSymbol("WITH-TIMEOUT-SIGNAL-TIMEOUT");
				Functions.funcall(with_timeout_signal_timeout, proc, tag);
			}
		};
		long nanos = (long) (secondsBeforeTimeout.doubleValue() * 1.0E9);
		ScheduledFuture<?> timeout = null;
		try {
			timeout = Time.scheduler.schedule(safeRunnable, nanos, TimeUnit.NANOSECONDS);
		} finally {
			if (timeout != null)
				Time.timeoutsTL.get().push(timeout);
			else
				Time.timeoutsTL.get().push(SubLNil.NIL);
		}
		return SubLNil.NIL;
	}

	public static SubLObject time_has_arrivedP(SubLObject universal_time) {
		long epochMicrosNow = get_time_internal();
		long universalTimeTyped = universal_time.longValue();
		long epochMicrosExpected = scaleUniversalToInternalTime(universalTimeTyped);
		boolean hasArrived = epochMicrosNow >= epochMicrosExpected;
		return SubLObjectFactory.makeBoolean(hasArrived);
	}

	public static long universalTimeToUnixTime(SubLObject universalTime) {
		if (universalTime == CommonSymbols.UNPROVIDED)
			return System.currentTimeMillis();
		long epochSeconds = universalTime.longValue();
		long epochMicros = scaleUniversalToInternalTime(epochSeconds);
		return toPlatformTime(epochMicros);
	}

	public static SubLObject unixTimeToUniversalTime(long elapsedMillis) {
		long epochMicros = fromPlatformTime(elapsedMillis);
		long epochSeconds = scaleInternalToUniversalTime(epochMicros);
		SubLObject result = SubLObjectFactory.makeInteger(epochSeconds);
		return result;
	}

	protected static long fromPlatformTime(long elapsedMillis) {
		long epochMillis = elapsedMillis + 2208988800000L;
		long epochMicros = epochMillis * 1000L;
		return epochMicros;
	}

	protected static long fromPlatformTimeMicroSecs(long elapsedMicros) {
		return elapsedMicros + 2208988800000000L;
	}

	protected static long toPlatformTime(long epochMicros) {
		long epochMillis = epochMicros / 1000L;
		long elapsedMillis = epochMillis - 2208988800000L;
		return elapsedMillis;
	}

	public static SubLFile me;
	private static ScheduledExecutorService scheduler;
	public static long EPOCH_OFFSET = 2208988800L;
	public static long EPOCH_OFFSET_MILLIS = 2208988800000L;
	public static long EPOCH_OFFSET_MICROS = 2208988800000000L;
	public static long INITIAL_NANO_TIME;
	public static long INITIAL_MILLI_TIME;
	public static long INITIAL_MICRO_TIME_CONVERTED_FROM_MILLI_TIME;
	public static long INITIAL_NANO_TIME_CONVERTED_FROM_MILLI_TIME;
	private static ThreadLocal<Deque<Object>> timeoutsTL;
	private static boolean DISABLE_TIMEOUTS = false;
	private static long startTime;
	static {
		me = new Time();
		scheduler = Executors.newScheduledThreadPool(2, SubLThreadPool.DEFAULT_THREAD_FACTORY);
		INITIAL_NANO_TIME = System.nanoTime();
		INITIAL_MILLI_TIME = System.currentTimeMillis();
		INITIAL_MICRO_TIME_CONVERTED_FROM_MILLI_TIME = Time.INITIAL_MILLI_TIME * 1000L;
		INITIAL_NANO_TIME_CONVERTED_FROM_MILLI_TIME = Time.INITIAL_MICRO_TIME_CONVERTED_FROM_MILLI_TIME * 1000L;
		timeoutsTL = new ThreadLocal<Deque<Object>>() {
			@Override
			protected Deque<Object> initialValue() {
				return new ArrayDeque<Object>();
			}
		};
		startTime = System.currentTimeMillis();
	}

	@Override
	public void declareFunctions() {
		SubLFiles.declareFunction(Time.me, "get_time", "GET-TIME", 0, 0, false);
		SubLFiles.declareFunction(Time.me, "get_timezone", "GET-TIMEZONE", 1, 0, false);
		SubLFiles.declareFunction(Time.me, "internal_real_time_has_arrivedP", "INTERNAL-REAL-TIME-HAS-ARRIVED?", 1, 0,
				false);
		SubLFiles.declareFunction(Time.me, "time_has_arrivedP", "TIME-HAS-ARRIVED?", 1, 0, false);
		SubLFiles.declareFunction(Time.me, "schedule_current_process_for_timeout",
				"SCHEDULE-CURRENT-PROCESS-FOR-TIMEOUT", 2, 0, false);
		SubLFiles.declareFunction(Time.me, "ensure_current_process_timeout_is_cancelled",
				"ENSURE-CURRENT-PROCESS-TIMEOUT-IS-CANCELLED", 0, 0, false);
	}

	@Override
	public void initializeVariables() {
	}

	@Override
	public void runTopLevelForms() {
	}
}
