/*
 * FileStream.java
 *
 * Copyright (C) 2004 Peter Graves
 * $Id: FileStream.java,v 1.2 2004-01-26 00:28:52 piso Exp $
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
import java.io.InputStream;
import java.io.OutputStream;

public final class FileStream extends Stream
{
    public FileStream(InputStream inputStream, LispObject elementType,
                      Pathname pathname)
    {
        super(inputStream, elementType, pathname);
    }

    public FileStream(OutputStream outputStream, LispObject elementType,
                      Pathname pathname)
    {
        super(outputStream, elementType, pathname);
    }

    public LispObject typeOf()
    {
        return Symbol.FILE_STREAM;
    }

    public LispObject typep(LispObject typeSpecifier) throws ConditionThrowable
    {
        if (typeSpecifier == Symbol.FILE_STREAM)
            return T;
        if (typeSpecifier == BuiltInClass.FILE_STREAM)
            return T;
        return super.typep(typeSpecifier);
    }

    // ### make-file-input-stream pathname element-type => stream
    private static final Primitive2 MAKE_FILE_INPUT_STREAM =
        new Primitive2("make-file-input-stream", PACKAGE_SYS, false,
                       "pathname element-type")
    {
        public LispObject execute(LispObject first, LispObject second)
            throws ConditionThrowable
        {
            Pathname pathname = Pathname.coerceToPathname(first);
            String namestring = pathname.getNamestring();
            File file = new File(namestring);
            try {
                return new FileStream(new FileInputStream(file),
                                      second,
                                      pathname);
            }
            catch (FileNotFoundException e) {
                return NIL;
            }
        }
    };

    // ### make-file-output-stream namestring element-type => stream
    private static final Primitive2 MAKE_FILE_OUTPUT_STREAM =
        new Primitive2("make-file-output-stream", PACKAGE_SYS, false,
                       "pathname element-type")
    {
        public LispObject execute(LispObject first, LispObject second)
            throws ConditionThrowable
        {
            Pathname pathname = Pathname.coerceToPathname(first);
            String namestring = pathname.getNamestring();
            File file = new File(namestring);
            try {
                return new FileStream(new FileOutputStream(file),
                                      second,
                                      pathname);
            }
            catch (FileNotFoundException e) {
                return NIL;
            }
        }
    };
}
