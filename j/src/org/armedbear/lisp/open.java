/*
 * open.java
 *
 * Copyright (C) 2003 Peter Graves
 * $Id: open.java,v 1.3 2003-09-19 01:46:43 piso Exp $
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
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public final class open extends Lisp
{
    // ### %open-output-file
    private static final Primitive3 _OPEN_OUTPUT_FILE =
        new Primitive3("%open-output-file", PACKAGE_SYS, false) {
        public LispObject execute (LispObject first, LispObject second,
                                   LispObject third)
            throws ConditionThrowable
        {
            String namestring;
            if (first instanceof LispString)
                namestring = ((LispString)first).getValue();
            else if (first instanceof Pathname)
                namestring = ((Pathname)first).getNamestring();
            else
                throw new TypeError(first, "pathname designator");
            boolean binary;
            LispObject elementType = second;
            if (elementType == Symbol.BASE_CHAR || elementType == Symbol.CHARACTER)
                binary = false;
            else if (elementType == Symbol.UNSIGNED_BYTE)
                binary = true;
            else
                throw new LispError(String.valueOf(elementType).concat(
                    " is not a valid stream element type"));
            File file = new File(namestring);
            LispObject ifExists = third;
            if (ifExists == Keyword.SUPERSEDE) {
                ;
            } else if (ifExists == Keyword.ERROR) {
                if (file.exists())
                    throw new LispError("file already exists: " + first);
            } else if (ifExists == NIL) {
                if (file.exists())
                    return NIL;
            } else {
                // FIXME
                throw new LispError(String.valueOf(ifExists) +
                                    " is not a recognized value for :IF-EXISTS");
            }
            try {
                if (binary)
                    return new BinaryOutputStream(new FileOutputStream(file));
                else
                    return new CharacterOutputStream(new FileOutputStream(file));
            }
            catch (FileNotFoundException e) {
                throw new LispError("unable to create file: " + first);
            }
        }
    };

    // ### %open-input-file
    private static final Primitive2 _OPEN_INPUT_FILE =
        new Primitive2("%open-input-file", PACKAGE_SYS, false) {
        public LispObject execute (LispObject first, LispObject second)
            throws ConditionThrowable
        {
            String namestring;
            if (first instanceof LispString)
                namestring = ((LispString)first).getValue();
            else if (first instanceof Pathname)
                namestring = ((Pathname)first).getNamestring();
            else
                throw new TypeError(first, "pathname designator");
            boolean binary;
            LispObject elementType = second;
            if (elementType == Symbol.BASE_CHAR || elementType == Symbol.CHARACTER)
                binary = false;
            else if (elementType == Symbol.UNSIGNED_BYTE)
                binary = true;
            else
                throw new LispError(String.valueOf(elementType).concat(
                    " is not a valid stream element type"));
            try {
                if (binary)
                    return new BinaryInputStream(new FileInputStream(namestring));
                else
                    return new CharacterInputStream(new FileInputStream(namestring));
            }
            catch (FileNotFoundException e) {
                throw new LispError(" file not found: " + first);
            }
        }
    };
}
