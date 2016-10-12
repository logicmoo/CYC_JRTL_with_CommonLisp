/*
 * ByteArrayOutputStream.java
 *
 * Copyright (C) 2009 Alessio Stalla
 * $Id: ByteArrayOutputStream.java 12513 2010-03-02 22:35:36Z ehuelsmann $
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

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;

public class ByteArrayOutputStream extends Stream {
	private java.io.ByteArrayOutputStream byteArrayOutputStream;

	public ByteArrayOutputStream() {
		this(Lisp.UNSIGNED_BYTE_8); // Declared in Stream.java
	}

	ByteArrayOutputStream(SubLObject elementType) {
		super(LispSymbols.SYSTEM_STREAM);
		this.elementType = elementType;
		this.initAsBinaryOutputStream(this.byteArrayOutputStream = new java.io.ByteArrayOutputStream(2048));
		// based on statistics of ABCL's own .cls files
		// as per 20100111, 2048 is the 70th percentile,
		// meaning that only 30% of all .cls files is bigger

		// However, *every* .cls file is bigger than 32 bytes;
		// we want to prevent buffer resizing
	}

	public long _getFilePosition() {
		if (this.elementType == Lisp.NIL)
			return 0;
		return this.byteArrayOutputStream.size();
	}

	public SubLObject classOf() {
		return BuiltInClass.STREAM; // TODO
	}

	public byte[] getByteArray() {
		if (this.elementType == Lisp.NIL)
			return new byte[0];
		else
			return this.byteArrayOutputStream.toByteArray();
	}

	public String toString() {
		return this.unreadableString("BYTE-ARRAY-OUTPUT-STREAM");
	}

	public SubLObject typeOf() {
		return LispSymbols.STREAM; // TODO
	}

	public SubLObject typep(SubLObject type) {
		return super.typep(type); // TODO
	}

}
