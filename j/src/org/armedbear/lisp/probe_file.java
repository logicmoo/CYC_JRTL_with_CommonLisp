/*
 * probe_file.java
 *
 * Copyright (C) 2003 Peter Graves
 * $Id: probe_file.java,v 1.1 2003-08-10 00:54:52 piso Exp $
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
import java.io.IOException;

public final class probe_file extends Lisp
{
    // ### probe-file
    private static final Primitive1 PROBE_FILE = new Primitive1("probe-file") {
        public LispObject execute(LispObject arg) throws LispError
        {
            String pathname = LispString.getValue(arg);
            boolean absolute = false;
            if (System.getProperty("os.name").startsWith("Windows")) {
                if (pathname.length() >= 3) {
                    if (pathname.charAt(1) == ':')
                        if (pathname.charAt(2) == '\\')
                            absolute = true;
                }
            } else if (pathname.length() > 0) {
                if (pathname.charAt(0) == '/')
                    absolute = true;
            }
            final File file;
            if (absolute)
                file = new File(pathname);
            else {
                String dirname =
                    LispString.getValue(_DEFAULT_PATHNAME_DEFAULTS_.symbolValue());
                file = new File(dirname, pathname);
            }
            if (!file.exists())
                return NIL;
            try {
                return new LispString(file.getCanonicalPath());
            }
            catch (IOException e) {
                throw new LispError(e.getMessage());
            }
        }
    };
}
