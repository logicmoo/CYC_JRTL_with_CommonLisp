/*
 * NilVector.java
 *
 * Copyright (C) 2004-2005 Peter Graves
 * $Id: NilVector.java 12288 2009-11-29 22:00:12Z vvoutilainen $
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
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;

public class NilVector extends SubLString {
	private int capacity;

	public NilVector(int capacity) {
		this.capacity = capacity;
	}

	public SubLObject accessError() {
		return Lisp.error(new TypeError("Attempt to access an array of element type NIL."));
	}

	public AbstractVector adjustArray(int size, AbstractArray displacedTo, int displacement)

	{
		this.accessError();
		// Not reached.
		return null;
	}

	public AbstractVector adjustArray(int newCapacity, SubLObject initialElement, SubLObject initialContents)

	{
		this.accessError();
		// Not reached.
		return null;
	}

	public SubLObject AREF(int index) {
		return this.accessError();
	}

	public void aset(int index, SubLObject newValue) {
		this.storeError(newValue);
	}

	public int capacity() {
		return this.capacity;
	}

	public SubLObject CHAR(int index) {
		return this.accessError();
	}

	public char charAt(int index) {
		this.accessError();
		// Not reached.
		return 0;
	}

	// public String getValue()
	// {
	// if (capacity == 0)
	// return "";
	// accessError();
	// // Not reached.
	// return null;
	// }

	public char[] charsOld() {
		if (this.capacity != 0)
			this.accessError();
		return new char[0];
	}

	public int cl_length() {
		return this.capacity;
	}

	public SubLObject classOf() {
		return BuiltInClass.NIL_VECTOR;
	}

	public boolean equal(SubLObject obj) {
		if (obj instanceof NilVector) {
			if (this.capacity != ((NilVector) obj).capacity)
				return false;
			if (this.capacity != 0) {
				this.accessError();
				// Not reached.
				return false;
			}
			return true;
		}
		if (obj instanceof SubLString) {
			if (this.capacity != obj.cl_length())
				return false;
			if (this.capacity != 0) {
				this.accessError();
				// Not reached.
				return false;
			}
			return true;
		}
		return false;
	}

	public void fill(char c) {
		this.storeError(LispCharacter.makeChar(c));
	}

	public void fillVoid(SubLObject obj) {
		this.storeError(obj);
	}

	public SubLObject getElementType() {
		return Lisp.NIL;
	}

	public String getString() {
		if (this.capacity != 0)
			this.accessError();
		return "";
	}

	public char[] getStringChars() {
		if (this.capacity != 0)
			this.accessError();
		return new char[0];
	}

	public SubLObject reverse() {
		return this.accessError();
	}

	public SubLObject SCHAR(int index) {
		return this.accessError();
	}

	public void setChar(int index, char c) {
		this.storeError(LispCharacter.makeChar(c));
	}

	public void shrink(int n) {
	}

	public SubLObject SIMPLE_STRING_P() {
		return Lisp.T;
	}

	private void storeError(SubLObject obj) {
		Lisp.error(new TypeError(String.valueOf(obj) + " is not of type NIL."));
	}

	public SubLObject subseq(int start, int end) {
		if (this.capacity == 0 && start == 0 && end == 0)
			return this;
		return this.accessError();
	}

	public int sxhash() {
		return 0;
	}

	public String toString() {
		return this.unreadableString("NIL-VECTOR");
	}

	public SubLObject typeOf() {
		return Lisp.list(LispSymbols.NIL_VECTOR, LispObjectFactory.makeInteger(this.capacity));
	}

	public SubLObject typep(SubLObject type) {
		if (type == LispSymbols.NIL_VECTOR)
			return Lisp.T;
		if (type == LispSymbols.SIMPLE_STRING)
			return Lisp.T;
		if (type == LispSymbols.SIMPLE_ARRAY)
			return Lisp.T;
		if (type == BuiltInClass.NIL_VECTOR)
			return Lisp.T;
		if (type == BuiltInClass.SIMPLE_STRING)
			return Lisp.T;
		if (type == BuiltInClass.SIMPLE_ARRAY)
			return Lisp.T;
		return super.typep(type);
	}
}
