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

package  com.cyc.tool.subl.jrtl.nativeCode.subLisp;

//// Internal Imports
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.type.exception.SubLException;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLNumber;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.time_high;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.util.SubLTrampolineFile;

//// External Imports
import java.util.TimeZone;
import java.util.Date;

public  class Time extends SubLTrampolineFile {
  
  //// Constructors
  
  /** Creates a new instance of Time. */
  public Time() {}
  public static final SubLFile me = new Time();
  
  //// Public Area
  
  public static final long EPOCH_OFFSET = ((365L * 70L) + 17L) * 24L * 60L * 60L;
  public static final long EPOCH_OFFSET_MILLIS = EPOCH_OFFSET * 1000L;
  
  
  /*
   * get the time in the JRTL's epoch date of 1900-01-01 00:00:00 GMT
   * in microseconds, as a Java data type
   * @note since Java's resolution is milli-seconds at best, the
   * precision will be in milli-secconds as well
   * @return long the current time micro-seconds in JRTL's epoch representation
   */
  public static final long get_time_internal() {
    final long elapsedMillis  = System.currentTimeMillis();
    final long epochMicros = fromPlatformTime(elapsedMillis);
    return epochMicros;
  }
  
  /*
   * get the time in the JRTL's epoch date of 1900-01-01 00:00:00 GMT
   * in microseconds, as a SubL data type
   * @note since Java's resolution is milli-seconds at best, the
   * precision will be in milli-secconds as well
   * @return SubLObject the current time in JRTL's epoch representation
   */
  public static final SubLObject get_time() {
    final long epochMicros = get_time_internal();
    final SubLObject result = SubLObjectFactory.makeInteger(epochMicros);
    return result;
  }
  
  /* get the timezone and the daylight-savings time flag
   * optionally take a universal time, which is going to be in
   * seconds (so work backward to platform time)
   * @return the timezone as an offset in seconds west (i.e. CDT
   * is 5, expressed as 18000
   * @return whether daylight savings time was active or not, i.e.
   * T or NIL (e.g. T for Summer 2006 in CDT)
   */
  
  public static final SubLObject get_timezone(SubLObject universalTime) {
    // pass through UNPROVIDED args -- universalTimeToUnixTime knows how to handle this
    final long elapsedMillis = universalTimeToUnixTime(universalTime);
    final TimeZone localTZ = TimeZone.getDefault();
    final long offsetMillis = localTZ.getOffset(elapsedMillis);
    final int offsetSeconds = (int)(offsetMillis/1000L);
    // west seconds are sign inverted offset seconds?
    final int offsetWestSeconds = -offsetSeconds;
    final boolean wasDST = localTZ.inDaylightTime(new Date(elapsedMillis));
    return Values.values( SubLObjectFactory.makeInteger(offsetWestSeconds),
            SubLObjectFactory.makeBoolean(wasDST));
  }
  
  public static final SubLObject internal_real_time_has_arrivedP(SubLObject internal_real_time) {
    final long epochMicrosNow = get_time_internal();
    final long epochMicrosExpected = internal_real_time.longValue();
    final boolean hasArrived = (epochMicrosNow >= epochMicrosExpected) ? true : false;
    return SubLObjectFactory.makeBoolean(hasArrived);
  }
  
  public static final SubLObject time_has_arrivedP(SubLObject universal_time) {
    final long epochMicrosNow = get_time_internal();
    final long universalTimeTyped = universal_time.longValue();
    final long epochMicrosExpected = scaleUniversalToInternalTime(universalTimeTyped);
    final boolean hasArrived = (epochMicrosNow >= epochMicrosExpected) ? true : false;
    return SubLObjectFactory.makeBoolean(hasArrived);
  }
  
  /*
   * @note in some sense this should be in time-high, but time-high
   * has no way of accepting a UNIX time ...
   * this is used by the file-sys code to convert file time
   * into universal time
   */
  public static final SubLObject unixTimeToUniversalTime( long elapsedMillis) {
    final long epochMicros = fromPlatformTime(elapsedMillis);
    final long epochSeconds = scaleInternalToUniversalTime(epochMicros);
    final SubLObject result = SubLObjectFactory.makeInteger(epochSeconds);
    return result;
  }
  
  public static final long universalTimeToUnixTime(SubLObject universalTime) {
    if (universalTime == UNPROVIDED) {
      return System.currentTimeMillis();
    } else {
      final long epochSeconds = universalTime.longValue();
      final long epochMicros = scaleUniversalToInternalTime(epochSeconds);
      return toPlatformTime(epochMicros);
    }
  }
  
  public static final long scaleInternalToUniversalTime(long epochMicros) {
    final long epochSeconds = (epochMicros/1000L)/1000L;
    return epochSeconds;
  }
  
  public static final long scaleUniversalToInternalTime(long epochSeconds) {
    final long epochMicros = epochSeconds * 1000L * 1000L;
    return epochMicros;
  }
  
  /*
   * @deprecated This should probably be somewhere else.
   */
  public static final SubLObject compute_with_process_resource_tracking_results(SubLObject resourceSpec) {
    final SubLObject now = get_internal_real_time();
    // since we are already in microseconds, hundreds of nanos are only one factor away
    final SubLObject delta = Numbers.subtract(now, resourceSpec);
    final SubLObject hundredsOfNanos = Numbers.multiply(delta,TEN_INTEGER);
    final Object[] listItems = {
      // we have no clue, so assume it is all our fault
      SubLObjectFactory.makeKeyword("SYSTEM-TIME"), ZERO_INTEGER,
      SubLObjectFactory.makeKeyword("USER-TIME"), hundredsOfNanos
    };
    final SubLObject result = SubLObjectFactory.makeList( listItems);
    return result;
  }
  
  
  /* @deprecated
   * use time-high.get_universal_time() instead
   */
  public static final SubLObject get_universal_time() {
    long elapsedMillis  = System.currentTimeMillis();
    final SubLObject universalTime = unixTimeToUniversalTime(elapsedMillis);
    return universalTime;
  }
  
  /*
   * @deprecated
   * use time-high.get_decoded_time() instead
   */
  public static final SubLObject get_decoded_time() {
    return time_high.get_decoded_time();
  }
  
  /*
   * @deprecated
   * use time-high.decode_universal_time() instead
   */
  public static final SubLObject decode_universal_time(SubLObject universalTime, SubLObject timeZone) {
    return time_high.decode_universal_time(universalTime,timeZone);
  }
  
  /*
   * @deprecated
   * use time-high.encode_universal_time() instead
   */
  public static final SubLObject encode_universal_time(SubLObject second, SubLObject minute, SubLObject hour,
          SubLObject day, SubLObject month, SubLObject year, SubLObject time_zone) {
    return time_high.encode_universal_time(second, minute,hour, day, month, year, time_zone);
  }
  
  /* @deprecated
   * use time-high.get_internal_real_time() instead
   */
  public static final SubLObject get_internal_real_time() {
    return time_high.get_internal_real_time();
  }
  
  /* @deprecated
   * use time-high.get_internal_run_time() instead
   */
  public static final SubLObject get_internal_run_time() {
    return time_high.get_internal_run_time();
  }
  
  
  //// Initializations
  
  public void declareFunctions() {
    /* -- this is here in error -- it is actually in time-high.java
    SubLFiles.declareFunction(me, "get_universal_time",     "GET-UNIVERSAL-TIME",     0, 0, false);
    SubLFiles.declareFunction(me, "get_decoded_time",       "GET-DECODED-TIME",       0, 0, false);
     */
    SubLFiles.declareFunction(me, "get_time",     "GET-TIME",     0, 0, false);
    SubLFiles.declareFunction(me, "get_timezone", "GET-TIMEZONE", 1, 0, false);
    /* -- this is here in error -- it is actually in time-high.java
    SubLFiles.declareFunction(me, "decode_universal_time",  "DECODE-UNIVERSAL-TIME",  1, 1, false);
    SubLFiles.declareFunction(me, "encode_universal_time", "ENCODE-UNIVERSAL-TIME", 6, 1, false);
    SubLFiles.declareFunction(me, "get_internal_real_time", "GET-INTERNAL-REAL-TIME", 0, 0, false);
    SubLFiles.declareFunction(me, "get_internal_run_time", "GET-INTERNAL-RUN-TIME", 0, 0, false);
     -- */
    SubLFiles.declareFunction(me, "internal_real_time_has_arrivedP", "INTERNAL-REAL-TIME-HAS-ARRIVED?", 1, 0, false);
    SubLFiles.declareFunction(me, "time_has_arrivedP", "TIME-HAS-ARRIVED?", 1, 0, false);
  }
  
  public void initializeVariables() {
  }
  
  public void runTopLevelForms() {
  }
  
  //// Protected Area
  protected static final long fromPlatformTime( long elapsedMillis) {
    final long epochMillis = elapsedMillis + EPOCH_OFFSET_MILLIS;
    final long epochMicros = epochMillis * 1000L;
    return epochMicros;
  }
  
  protected static final long toPlatformTime( long epochMicros) {
    final long epochMillis = epochMicros / 1000L;
    final long elapsedMillis = epochMillis - EPOCH_OFFSET_MILLIS;
    return elapsedMillis;
  }
  
  
  //// Private Area
  private static final long startTime = System.currentTimeMillis();
  
  //// Internal Rep
  
  //// Main
  static public void main(String[] args) {
    TimeZone tz = TimeZone.getDefault();
    System.out.println("Got default time-zone " + tz);
    System.out.println("The offset for this timezone is: " + tz.getRawOffset());
    System.out.println("The daylight savings information for this timezone is: " + tz.getDSTSavings());
    System.out.println("The offset for this timezone via the current time is: " + tz.getOffset(System.currentTimeMillis()));
    System.out.println("The daylight savings information via the current time is: " + tz.inDaylightTime(new java.util.Date()));
  }
  
}
