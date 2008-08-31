/*
 * disassemble_class_bytes.java
 *
 * Copyright (C) 2005 Peter Graves
 * $Id$
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
import java.io.FileOutputStream;
import java.io.IOException;

// ### disassemble-class-bytes
public final class disassemble_class_bytes extends Primitive
{
    private disassemble_class_bytes()
    {
        super("disassemble-class-bytes", PACKAGE_SYS, true, "java-object");
    }

    public LispObject execute(LispObject arg) throws ConditionThrowable
    {
        if (arg instanceof JavaObject) {
            byte[] bytes = (byte[]) ((JavaObject)arg).getObject();
            try {
                File file = File.createTempFile("abcl", null, null);
                FileOutputStream out = new FileOutputStream(file);
                out.write(bytes);
                out.close();
                LispObject disassembler = _DISASSEMBLER_.symbolValue();
                if (disassembler instanceof AbstractString) {
                    StringBuffer sb = new StringBuffer(disassembler.getStringValue());
                    sb.append(' ');
                    sb.append(file.getPath());
                    ShellCommand sc = new ShellCommand(sb.toString(), null, null);
                    sc.run();
                    file.delete();
                    return new SimpleString(sc.getOutput());
                } else
                    return new SimpleString("No disassembler is available.");
            }
            catch (IOException e) {
                Debug.trace(e);
            }
        }
        return NIL;
    }

    private static final Primitive DISASSEMBLE_CLASS_BYTES =
        new disassemble_class_bytes();
}
