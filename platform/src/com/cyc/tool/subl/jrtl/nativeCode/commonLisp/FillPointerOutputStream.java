/*
 * FillPointerOutputStream.java
 *
 * Copyright (C) 2003-2005 Peter Graves
 * $Id: FillPointerOutputStream.java 12513 2010-03-02 22:35:36Z ehuelsmann $
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

public class FillPointerOutputStream extends Stream {
	class Writer extends java.io.Writer {

		public void close() {
		}

		public void flush() {
		}

		public void write(char cbuf[], int off, int len) {
			int fp = FillPointerOutputStream.this.string.getFillPointer();
			if (fp >= 0) {
				int limit = Math.min(cbuf.length, off + len);
				FillPointerOutputStream.this.string.ensureCapacity(fp + limit);
				for (int i = off; i < limit; i++) {
					FillPointerOutputStream.this.string.setChar(fp, cbuf[i]);
					++fp;
				}
			}
			FillPointerOutputStream.this.string.setFillPointer(fp);
		}
	}

	ComplexString string;

	FillPointerOutputStream(ComplexString string) {
		super(LispSymbols.SYSTEM_STREAM);
		this.elementType = LispSymbols.CHARACTER;
		this.isOutputStream = true;
		this.isInputStream = false;
		this.isCharacterStream = true;
		this.isBinaryStream = false;
		this.string = string;
		this.setWriter(new Writer());
	}
}
