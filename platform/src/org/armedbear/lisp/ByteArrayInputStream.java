/*
 * ByteArrayInputStream.java
 *
 * Copyright (C) 2010 Alessio Stalla
 * $Id: ByteArrayInputStream.java 12513 2010-03-02 22:35:36Z ehuelsmann $
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

public class ByteArrayInputStream extends Stream {
	// ### %make-byte-array-input-stream
	// %make-byte-array-input-stream bytes &optional element-type =>
	// byte-array-input-stream
	private static Primitive MAKE_BYTE_ARRAY_INPUT_STREAM = new Primitive("%make-byte-array-input-stream",
			Lisp.PACKAGE_SYS, false, "bytes &optional element-type") {

		public SubLObject execute(SubLObject bytes) {
			return new ByteArrayInputStream((byte[]) bytes.javaInstance(byte[].class));
		}

		public SubLObject execute(SubLObject bytes, SubLObject elementType) {
			return new ByteArrayInputStream((byte[]) bytes.javaInstance(byte[].class), elementType);
		}
	};

	private java.io.ByteArrayInputStream byteArrayInputStream;

	public ByteArrayInputStream(byte[] bytes) {
		this(bytes, Lisp.UNSIGNED_BYTE_8); // Declared in Stream.java
	}

	ByteArrayInputStream(byte[] bytes, SubLObject elementType) {
		super(LispSymbols.SYSTEM_STREAM);
		this.elementType = elementType;
		this.initAsBinaryInputStream(this.byteArrayInputStream = new java.io.ByteArrayInputStream(bytes));
	}

	public SubLObject classOf() {
		return BuiltInClass.STREAM; // TODO
	}

	public String toString() {
		return this.unreadableString("BYTE-ARRAY-INPUT-STREAM");
	}

	public SubLObject typeOf() {
		return LispSymbols.STREAM; // TODO
	}

	public SubLObject typep(SubLObject type) {
		return super.typep(type); // TODO
	}

}
