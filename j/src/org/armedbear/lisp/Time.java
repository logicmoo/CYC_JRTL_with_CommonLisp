/*
 * Time.java
 *
 * Copyright (C) 2003-2004 Peter Graves
 * $Id: Time.java,v 1.20 2004-01-28 20:19:22 piso Exp $
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License
 * as published by the Free Software Foundation; either version 2
 * of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place - Suite 330, Boston, MA  02111-1307, USA.
 */

package org.armedbear.lisp;

import java.util.Date;
import java.util.TimeZone;

public final class Time extends Lisp
{
    // ### %time
    private static final Primitive1 _TIME =
        new Primitive1("%time", PACKAGE_SYS, false)
    {
        public LispObject execute(LispObject arg) throws ConditionThrowable
        {
            Cons.setCount(0);
            long start = System.currentTimeMillis();
            LispObject result = arg.execute(new LispObject[0]);
            long elapsed = System.currentTimeMillis() - start;
            long count = Cons.getCount();
            Stream out = getTraceOutput();
            out.freshLine();
            StringBuffer sb =
                new StringBuffer(String.valueOf((float)elapsed/1000));
            sb.append(" seconds");
            sb.append(System.getProperty("line.separator"));
            if (count > 0) {
                sb.append(count);
                sb.append(" cons cell");
                if (count > 1)
                    sb.append('s');
                sb.append(System.getProperty("line.separator"));
            }
            out._writeString(sb.toString());
            out._finishOutput();
            return result;
        }
    };

    // ### get-internal-real-time
    private static final Primitive0 GET_INTERNAL_REAL_TIME =
        new Primitive0("get-internal-real-time","") {
        public LispObject execute() throws ConditionThrowable
        {
            return number(System.currentTimeMillis());
        }
    };

    // ### get-internal-run-time
    private static final Primitive0 GET_INTERNAL_RUN_TIME =
        new Primitive0("get-internal-run-time","") {
        public LispObject execute() throws ConditionThrowable
        {
            return number(System.currentTimeMillis()); // FIXME
        }
    };

    // ### get-universal-time
    private static final Primitive0 GET_UNIVERSAL_TIME =
        new Primitive0("get-universal-time","") {
        public LispObject execute()
        {
            return number(System.currentTimeMillis() / 1000 + 2208988800L);
        }
    };

    // ### default-time-zone
    private static final Primitive0 DEFAULT_TIME_ZONE =
        new Primitive0("default-time-zone", PACKAGE_SYS, false)
    {
        public LispObject execute() throws ConditionThrowable
        {
            TimeZone tz = TimeZone.getDefault();
            //int offset = tz.getOffset(System.currentTimeMillis());
            // Classpath hasn't implemented TimeZone.getOffset(long).
            int rawOffset = tz.getRawOffset();
            if (tz.inDaylightTime(new Date(System.currentTimeMillis())))
                rawOffset += tz.getDSTSavings();
            // "Time zone values increase with motion to the west..."
            // Convert milliseconds to hours.
            return new Fixnum(- rawOffset).divideBy(new Fixnum(3600000));
        }
    };
}
