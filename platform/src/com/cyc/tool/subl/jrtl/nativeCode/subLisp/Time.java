/***
 *   Copyright (c) 1995-2009 Cycorp Inc.
 *
 *   Licensed under the Apache License, Version 2.0 (the "License");
 *   you may not use this file except in compliance with the License.
 *   You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *   limitations under the License.
 *
 *  Substantial portions of this code were developed by the Cyc project
 *  and by Cycorp Inc, whose contribution is gratefully acknowledged.
*/

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
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbolFactory;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.time_high;
import com.cyc.tool.subl.util.SafeRunnable;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.util.SubLTrampolineFile;

public class Time extends SubLTrampolineFile {
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
		Time.me = new Time();
		Time.scheduler = Executors.newScheduledThreadPool(2, SubLThreadPool.DEFAULT_THREAD_FACTORY);
		Time.INITIAL_NANO_TIME = System.nanoTime();
		Time.INITIAL_MILLI_TIME = System.currentTimeMillis();
		Time.INITIAL_MICRO_TIME_CONVERTED_FROM_MILLI_TIME = Time.INITIAL_MILLI_TIME * 1000L;
		Time.INITIAL_NANO_TIME_CONVERTED_FROM_MILLI_TIME = Time.INITIAL_MICRO_TIME_CONVERTED_FROM_MILLI_TIME * 1000L;
		Time.timeoutsTL = new ThreadLocal<Deque<Object>>() {

			protected Deque<Object> initialValue() {
				return new ArrayDeque<Object>();
			}
		};
		Time.startTime = System.currentTimeMillis();
	}

	public static SubLObject compute_with_process_resource_tracking_results(SubLObject resourceSpec) {
		SubLObject now = Time.get_time();
		SubLObject delta = Numbers.subtract(now, resourceSpec);
		SubLObject hundredsOfNanos = Numbers.multiply(delta, CommonSymbols.TEN_INTEGER);
		Object[] listItems = {
				// we have no clue, so assume it is all our fault
				SubLObjectFactory.makeKeyword("SYSTEM-TIME"), CommonSymbols.ZERO_INTEGER,
				SubLObjectFactory.makeKeyword("USER-TIME"), hundredsOfNanos };
		SubLObject result = SubLObjectFactory.makeList(listItems);
		return result;
	}

	/*
	 * @deprecated use time-high.decode_universal_time() instead
	 */
	public static SubLObject decode_universal_time(SubLObject universalTime, SubLObject timeZone) {
		return time_high.decode_universal_time(universalTime, timeZone);
	}

	/*
	 * get the timezone and the daylight-savings time flag optionally take a
	 * universal time, which is going to be in seconds (so work backward to
	 * platform time)
	 *
	 * @return the timezone as an offset in seconds west (i.e. CDT is 5,
	 * expressed as 18000
	 *
	 * @return whether daylight savings time was active or not, i.e. T or NIL
	 * (e.g. T for Summer 2006 in CDT)
	 */

	/*
	 * @deprecated use time-high.encode_universal_time() instead
	 */
	public static SubLObject encode_universal_time(SubLObject second, SubLObject minute, SubLObject hour,
			SubLObject day, SubLObject month, SubLObject year, SubLObject time_zone) {
		return time_high.encode_universal_time(second, minute, hour, day, month, year, time_zone);
	}

	public static SubLObject ensure_current_process_timeout_is_cancelled() {
		Deque<Object> timeouts = Time.timeoutsTL.get();
		if (timeouts.isEmpty())
			Errors.warn("Trying to cancel a timeout that no longer apears on the timeout stack.");
		Object timeoutObj = timeouts.isEmpty() ? CommonSymbols.NIL : timeouts.pop();
		if (timeoutObj == CommonSymbols.NIL)
			return CommonSymbols.NIL;
		ScheduledFuture<?> timeout = (ScheduledFuture<?>) timeoutObj;
		synchronized (timeout) {
			if (timeout == null || timeout.isCancelled() || timeout.isDone())
				return CommonSymbols.NIL;
			timeout.cancel(false);
		}
		return CommonSymbols.NIL;
	}

	protected static long fromPlatformTime(long elapsedMillis) {
		long epochMillis = elapsedMillis + 2208988800000L;
		long epochMicros = epochMillis * 1000L;
		return epochMicros;
	}

	protected static long fromPlatformTimeMicroSecs(long elapsedMicros) {
		return elapsedMicros + 2208988800000000L;
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

	/*
	 * get the time in the JRTL's epoch date of 1900-01-01 00:00:00 GMT in
	 * microseconds, as a SubL data type
	 *
	 * @note since Java's resolution is milli-seconds at best, the precision
	 * will be in milli-secconds as well
	 *
	 * @return SubLObject the current time in JRTL's epoch representation
	 */
	public static SubLObject get_time() {
		return SubLObjectFactory.makeInteger(Time.get_time_internal());
	}

	/*
	 * get the time in the JRTL's epoch date of 1900-01-01 00:00:00 GMT in
	 * microseconds, as a Java data type
	 *
	 * @note since Java's resolution is milli-seconds at best, the precision
	 * will be in milli-secconds as well
	 *
	 * @return long the current time micro-seconds in JRTL's epoch
	 * representation
	 */
	public static long get_time_internal() {
		return Time.fromPlatformTimeMicroSecs(Math.round(Time.getCurrentNanoTimeAlignedWithMilliTime() / 1000.0));
	}

	public static SubLObject get_timezone(SubLObject universalTime) {
		long elapsedMillis = Time.universalTimeToUnixTime(universalTime);
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
		long epochMicrosNow = Time.get_time_internal();
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
		if (secondsBeforeTimeout == CommonSymbols.NIL) {
			Time.timeoutsTL.get().push(CommonSymbols.NIL);
			return CommonSymbols.NIL;
		}
		final SubLProcess proc = SubLProcess.currentProcess();
		secondsBeforeTimeout.enforceType(CommonSymbols.NON_NEGATIVE_NUMBER_P);
		SafeRunnable safeRunnable = new SafeRunnable() {

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
				Time.timeoutsTL.get().push(CommonSymbols.NIL);
		}
		return CommonSymbols.NIL;
	}

	public static SubLObject time_has_arrivedP(SubLObject universal_time) {
		long epochMicrosNow = Time.get_time_internal();
		long universalTimeTyped = universal_time.longValue();
		long epochMicrosExpected = Time.scaleUniversalToInternalTime(universalTimeTyped);
		boolean hasArrived = epochMicrosNow >= epochMicrosExpected;
		return SubLObjectFactory.makeBoolean(hasArrived);
	}

	protected static long toPlatformTime(long epochMicros) {
		long epochMillis = epochMicros / 1000L;
		long elapsedMillis = epochMillis - 2208988800000L;
		return elapsedMillis;
	}

	public static long universalTimeToUnixTime(SubLObject universalTime) {
		if (universalTime == CommonSymbols.UNPROVIDED)
			return System.currentTimeMillis();
		long epochSeconds = universalTime.longValue();
		long epochMicros = Time.scaleUniversalToInternalTime(epochSeconds);
		return Time.toPlatformTime(epochMicros);
	}

	/*
	 * @note in some sense this should be in time-high, but time-high has no way
	 * of accepting a UNIX time ... this is used by the file-sys code to convert
	 * file time into universal time
	 */
	public static SubLObject unixTimeToUniversalTime(long elapsedMillis) {
		long epochMicros = Time.fromPlatformTime(elapsedMillis);
		long epochSeconds = Time.scaleInternalToUniversalTime(epochMicros);
		SubLObject result = SubLObjectFactory.makeInteger(epochSeconds);
		return result;
	}

	public void declareFunctions() {
		/*
		 * -- this is here in error -- it is actually in time-high.java
		 * SubLFiles.declareFunction(me, "get_universal_time",
		 * "GET-UNIVERSAL-TIME", 0, 0, false); SubLFiles.declareFunction(me,
		 * "get_decoded_time", "GET-DECODED-TIME", 0, 0, false);
		 */
		SubLFiles.declareFunction(Time.me, "get_time", "GET-TIME", 0, 0, false);
		SubLFiles.declareFunction(Time.me, "get_timezone", "GET-TIMEZONE", 1, 0, false);
		/*
		 * -- this is here in error -- it is actually in time-high.java
		 * SubLFiles.declareFunction(me, "decode_universal_time",
		 * "DECODE-UNIVERSAL-TIME", 1, 1, false); SubLFiles.declareFunction(me,
		 * "encode_universal_time", "ENCODE-UNIVERSAL-TIME", 6, 1, false);
		 * SubLFiles.declareFunction(me, "get_internal_real_time",
		 * "GET-INTERNAL-REAL-TIME", 0, 0, false); SubLFiles.declareFunction(me,
		 * "get_internal_run_time", "GET-INTERNAL-RUN-TIME", 0, 0, false); --
		 */
		SubLFiles.declareFunction(Time.me, "internal_real_time_has_arrivedP", "INTERNAL-REAL-TIME-HAS-ARRIVED?", 1, 0,
				false);
		SubLFiles.declareFunction(Time.me, "time_has_arrivedP", "TIME-HAS-ARRIVED?", 1, 0, false);
		SubLFiles.declareFunction(Time.me, "schedule_current_process_for_timeout",
				"SCHEDULE-CURRENT-PROCESS-FOR-TIMEOUT", 2, 0, false);
		SubLFiles.declareFunction(Time.me, "ensure_current_process_timeout_is_cancelled",
				"ENSURE-CURRENT-PROCESS-TIMEOUT-IS-CANCELLED", 0, 0, false);
	}

	public void initializeVariables() {
	}

	public void runTopLevelForms() {
	}
}
