/*
 * FileStream.java
 *
 * Copyright (C) 2004-2006 Peter Graves
 * Copyright (C) 2008 Hideo at Yokohama
 * $Id: FileStream.java 12422 2010-02-06 10:52:32Z mevenson $
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
 *
 * As a special exception, the copyright holders of this library give you
 * permission to link this library with independent modules to produce an
 * executable, regardless of the license terms of these independent
 * modules, and to copy and distribute the resulting executable under
 * terms of your choice, provided that you also meet, for each linked
 * independent module, the terms and conditions of the license of that
 * module.  An independent module is a module which is not derived from
 * or based on this library.  If you modify this library, you may extend
 * this exception to your version of the library, but you are not
 * obligated to do so.  If you do not wish to do so, delete this
 * exception statement from your version.
 */

package com.cyc.tool.subl.jrtl.nativeCode.commonLisp;

import static com.cyc.tool.subl.jrtl.nativeCode.commonLisp.Lisp.*;
import static com.cyc.tool.subl.jrtl.nativeCode.commonLisp.LispObjectFactory.*;

import java.io.File;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Writer;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

import com.cyc.tool.subl.jrtl.nativeCode.commonLisp.util.RandomAccessCharacterFile;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;

public final class FileStream extends Stream
{
    private final RandomAccessCharacterFile racf;
    private final Pathname pathname;
    private final int bytesPerUnit;

    public FileStream(Pathname pathname, String namestring,
                      SubLObject elementType, SubLObject direction,
                      SubLObject ifExists, SubLObject format)
        throws IOException
    {
        /* externalFormat is a LispObject of which the first char is a
         * name of a character encoding (such as :UTF-8 or :ISO-8859-1), used
         * by ABCL as a string designator, unless the name is :CODE-PAGE.
         * A real string is (thus) also allowed.
         * 
         * Then, a property list follows with 3 possible keys:
         *   :ID (values: code page numbers supported by MS-DOS/IBM-DOS/MS-Windows
         *   :EOL-STYLE (values: :CR / :LF / :CRLF [none means native])
         *   :LITTLE-ENDIAN (values: NIL / T)
         * 
         * These definitions have been taken from FLEXI-STREAMS:
         *    http://www.weitz.de/flexi-streams/#make-external-format
         */
        super(LispSymbols.FILE_STREAM);
        final File file = new File(namestring);
        String mode = null;
        if (direction == Keyword.INPUT) {
            mode = "r";
            isInputStream = true;
        } else if (direction == Keyword.OUTPUT) {
            mode = "rw";
            isOutputStream = true;
        } else if (direction == Keyword.IO) {
            mode = "rw";
            isInputStream = true;
            isOutputStream = true;
        }
        
        Debug.assertTrue(mode != null);
        RandomAccessFile raf = new RandomAccessFile(file, mode);
	
        // ifExists is ignored unless we have an output stream.
        if (isOutputStream) {
            final long length = file.isFile() ? file.length() : 0;
            if (length > 0) {
                if (ifExists == Keyword.OVERWRITE)
                    raf.seek(0);
                else if (ifExists == Keyword.APPEND)
                    raf.seek(raf.length());
                else
                    raf.setLength(0);
            }
        }
        setExternalFormat(format);
        
	// don't touch raf directly after passing it to racf.
	// the state will become inconsistent if you do that.
        racf = new RandomAccessCharacterFile(raf, encoding);

        this.pathname = pathname;
        this.elementType = elementType;
        if (elementType == LispSymbols.CHARACTER || elementType == LispSymbols.BASE_CHAR) {
            isCharacterStream = true;
            bytesPerUnit = 1;
	    if (isInputStream) {
		initAsCharacterInputStream(racf.getReader());
	    }
	    if (isOutputStream) {
		initAsCharacterOutputStream(racf.getWriter());
	    }
        } else {
            isBinaryStream = true;
            int width = elementType.second().intValue();
            bytesPerUnit = width / 8;
	    if (isInputStream) {
		initAsBinaryInputStream(racf.getInputStream());
	    }
	    if (isOutputStream) {
		initAsBinaryOutputStream(racf.getOutputStream());
	    }
        }
    }

    @Override
    public SubLObject typeOf()
    {
        return LispSymbols.FILE_STREAM;
    }

    @Override
    public SubLObject classOf()
    {
        return BuiltInClass.FILE_STREAM;
    }

    @Override
    public SubLObject typep(SubLObject typeSpecifier)
    {
        if (typeSpecifier == LispSymbols.FILE_STREAM)
            return T;
        if (typeSpecifier == BuiltInClass.FILE_STREAM)
            return T;
        return super.typep(typeSpecifier);
    }

    @Override
    public void setExternalFormat(SubLObject format) {
        super.setExternalFormat(format);

        if (racf != null)
            // setExternalFormat also called before 'racf' is set up
            racf.setEncoding(encoding);
    }

    public Pathname getPathname()
    {
        return pathname;
    }

    @Override
    public SubLObject fileLength()
    {
        final long length;
        if (isOpen()) {
            try {
                length = racf.length();
            }
            catch (IOException e) {
                error(new StreamError(this, e));
                // Not reached.
                return NIL;
            }
        } else {
            String namestring = pathname.getNamestring();
            if (namestring == null)
                return error(new SimpleError("Pathname has no namestring: " +
                                              pathname.writeToString()));
            File file = new File(namestring);
            length = file.length(); // in 8-bit bytes
        }
        if (isCharacterStream)
            return number(length);
        // "For a binary file, the length is measured in units of the
        // element type of the stream."
        return number(length / bytesPerUnit);
    }

    @Override
    public boolean _charReady()
    {
        return true;
    }

    @Override
    public void _clearInput()
    {
        try {
	    if (isInputStream) {
		racf.position(racf.length());
	    } else {
		streamNotInputStream();
	    }
        }
        catch (IOException e) {
            error(new StreamError(this, e));
        }
    }

    @Override
    public long _getFilePosition()
    {
        try {
            long pos = racf.position();
            return pos / bytesPerUnit;
        }
        catch (IOException e) {
            error(new StreamError(this, e));
            // Not reached.
            return -1;
        }
    }

    @Override
    public boolean _setFilePosition(SubLObject arg)
    {
        try {
            long pos;
            if (arg == Keyword.START)
                pos = 0;
            else if (arg == Keyword.END)
                pos = racf.length();
            else {
                long n = arg.intValue(); // FIXME arg might be a bignum
                pos = n * bytesPerUnit;
            }
            racf.position(pos);
        }
        catch (IOException e) {
            error(new StreamError(this, e));
        }
        return true;
    }

    @Override
    public void _close()
    {
        try {
            racf.close();
            setOpen(false);
        }
        catch (IOException e) {
            error(new StreamError(this, e));
        }
    }

    @Override
    public String writeToString()
    {
        return unreadableString(LispSymbols.FILE_STREAM);
    }

 }
