/*
 * open.java
 *
 * Copyright (C) 2003 Peter Graves
 * $Id: open.java,v 1.9 2003-12-13 00:58:51 piso Exp $
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
            File file = Utilities.getFile(first);
            boolean binary = checkBinaryElementType(second);
            LispObject ifExists = third;
            if (ifExists == Keyword.SUPERSEDE) {
                ;
            } else if (ifExists == Keyword.ERROR) {
                if (file.exists())
                    return signal(new LispError("file already exists: " + first));
            } else if (ifExists == NIL) {
                if (file.exists())
                    return NIL;
            } else {
                // FIXME
                return signal(new LispError(String.valueOf(ifExists) +
                                            " is not a recognized value for :IF-EXISTS"));
            }
            try {
                if (binary)
                    return new BinaryOutputStream(new FileOutputStream(file));
                else
                    return new CharacterOutputStream(new FileOutputStream(file));
            }
            catch (FileNotFoundException e) {
                return signal(new LispError("unable to create file: " + first));
            }
        }
    };

    // ### %open-input-file
    private static final Primitive2 _OPEN_INPUT_FILE =
        new Primitive2("%open-input-file", PACKAGE_SYS, false) {
        public LispObject execute (LispObject first, LispObject second)
            throws ConditionThrowable
        {
            File file = Utilities.getFile(first);
            boolean binary = checkBinaryElementType(second);
            try {
                if (binary)
                    return new BinaryInputStream(new FileInputStream(file));
                else
                    return new CharacterInputStream(new FileInputStream(file));
            }
            catch (FileNotFoundException e) {
                return signal(new LispError("file not found: " + first));
            }
        }
    };

    private static final boolean checkBinaryElementType(LispObject elementType)
        throws ConditionThrowable
    {
        if (elementType == Symbol.BASE_CHAR || elementType == Symbol.CHARACTER)
            return false;
        if (elementType == Symbol.UNSIGNED_BYTE)
            return true;
        if (elementType instanceof Cons) {
            if (elementType.car() == Symbol.UNSIGNED_BYTE) {
                if (elementType.length() == 2) {
                    if (elementType.cadr() instanceof Fixnum) {
                        if (((Fixnum)elementType.cadr()).getValue() == 8)
                            return true;
                    }
                }
            }
        }
        signal(new LispError(String.valueOf(elementType) + " is not a valid stream element type"));
        // Not reached.
        return false;
    }
}
