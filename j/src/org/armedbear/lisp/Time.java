/*
 * Time.java
 *
 * Copyright (C) 2003 Peter Graves
 * $Id: Time.java,v 1.2 2003-07-02 15:47:48 piso Exp $
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

import java.io.File;

public final class Time extends Lisp
{
    // ### %time
    private static final Primitive1 _TIME =
        new Primitive1("%time", PACKAGE_SYS, true) {
        public LispObject execute(LispObject arg) throws Condition
        {
            Cons.setCount(0);
            long start = System.currentTimeMillis();
            LispObject result = arg.execute(new LispObject[0]);
            long elapsed = System.currentTimeMillis() - start;
            long count = Cons.getCount();
            CharacterOutputStream out = getTraceOutput();
            out.freshLine();
            StringBuffer sb =
                new StringBuffer(String.valueOf((float)elapsed/1000));
            sb.append(" seconds");
            if (count > 0) {
                sb.append(System.getProperty("line.separator"));
                sb.append(count);
                sb.append(" cons cell");
                if (count > 1)
                    sb.append('s');
            }
            out.writeString(sb.toString());
            out.finishOutput();
            return result;
        }
    };

    private static final Primitive0 GET_INTERNAL_REAL_TIME =
        new Primitive0("get-internal-real-time") {
        public LispObject execute() throws Condition
        {
            return number(System.currentTimeMillis());
        }
    };

    // ### get-universal-time
    private static final Primitive0 GET_UNIVERSAL_TIME =
        new Primitive0("get-universal-time") {
        public LispObject execute()
        {
            return number(System.currentTimeMillis() / 1000 + 2208988800L);
        }
    };

    // ### file-write-date
    private static final Primitive1 FILE_WRITE_DATE =
        new Primitive1("file-write-date") {
        public LispObject execute(LispObject arg) throws LispError
        {
            String pathname = LispString.getValue(arg);
            File file = new File(pathname);
            long lastModified = file.lastModified();
            if (lastModified == 0)
                return NIL;
            return number(lastModified / 1000 + 2208988800L);
        }
    };
}
