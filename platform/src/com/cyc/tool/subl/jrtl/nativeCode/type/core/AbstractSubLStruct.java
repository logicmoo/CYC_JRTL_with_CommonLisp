/***
 *   Copyright (c) 1995-2009 Cycorp Inc.
 *
 *   Licensed under the Apache License, Version 2.0 (the "License");
 *   you may not use this file except in compliance with the License.
 *   You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *   limitations under the License.
 *
 *  Substantial portions of this code were developed by the Cyc project
 *  and by Cycorp Inc, whose contribution is gratefully acknowledged.
*/

package com.cyc.tool.subl.jrtl.nativeCode.type.core;

import java.util.Collections;
import java.util.Map;
import java.util.WeakHashMap;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
//import com.cyc.tool.subl.jrtl.nativeCode.subLisp.DiskDumper;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sxhash;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLFixnum;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;

public abstract class AbstractSubLStruct extends AbstractSubLObject implements SubLStruct {

	public static String STRUCT_TYPE_NAME = "STRUCT";

	//// Constructors

	/** Creates a new instance of SubLStruct. */
	AbstractSubLStruct() {
		// TODO = DiskDumper.addThis(this);
	}

	//// Public Area

	/** Two structs are equalp iff all their fields are equalp. */
	public boolean equalp(SubLObject obj) {
		if (obj == this)
			return true;
		if (this.getStructDecl().isInterned)
			return false;
		if (obj == null)
			return false;
		if (!obj.isStructure())
			return false;
		SubLStruct otherStuct = obj.toStruct();
		if (this.getStructDecl() != otherStuct.getStructDecl())
			return false;
		int fieldCount = this.getFieldCount();
		switch (fieldCount) {
		case 19:
			if (!this.getField20().equalp(otherStuct.getField20()))
				return false;
		case 18:
			if (!this.getField19().equalp(otherStuct.getField19()))
				return false;
		case 17:
			if (!this.getField18().equalp(otherStuct.getField18()))
				return false;
		case 16:
			if (!this.getField17().equalp(otherStuct.getField17()))
				return false;
		case 15:
			if (!this.getField16().equalp(otherStuct.getField16()))
				return false;
		case 14:
			if (!this.getField15().equalp(otherStuct.getField15()))
				return false;
		case 13:
			if (!this.getField14().equalp(otherStuct.getField14()))
				return false;
		case 12:
			if (!this.getField13().equalp(otherStuct.getField13()))
				return false;
		case 11:
			if (!this.getField12().equalp(otherStuct.getField12()))
				return false;
		case 10:
			if (!this.getField11().equalp(otherStuct.getField11()))
				return false;
		case 9:
			if (!this.getField10().equalp(otherStuct.getField10()))
				return false;
		case 8:
			if (!this.getField9().equalp(otherStuct.getField9()))
				return false;
		case 7:
			if (!this.getField8().equalp(otherStuct.getField8()))
				return false;
		case 6:
			if (!this.getField7().equalp(otherStuct.getField7()))
				return false;
		case 5:
			if (!this.getField6().equalp(otherStuct.getField6()))
				return false;
		case 4:
			if (!this.getField5().equalp(otherStuct.getField5()))
				return false;
		case 3:
			if (!this.getField4().equalp(otherStuct.getField4()))
				return false;
		case 2:
			if (!this.getField3().equalp(otherStuct.getField3()))
				return false;
		case 1:
			if (!this.getField2().equalp(otherStuct.getField2()))
				return false;
		}
		if (fieldCount >= 20)
			for (int i = 19; i < fieldCount; i++) {
				int index = i + 1;
				if (!this.getField(index).equalp(otherStuct.getField(index)))
					return false;
			}
		return true;
	}

	public boolean equals(Object obj) {
		if (obj == this)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof SubLObject))
			return false;
		SubLObject sublObj = (SubLObject) obj;
		if (!sublObj.isStructure())
			return false;
		SubLStruct other = sublObj.toStruct();
		if (this.getName() != other.getName())
			return false;
		if (this.getFieldCount() != other.getFieldCount())
			return false;
		for (int i = 0, size = this.getFieldCount(); i < size; i++) {
			int index = i + 2;
			Object io = this.getField(index);
			if (io == null)
				return false;
			Object oo = other.getField(index);
			if (oo == null)
				return false;
			if (!io.equals(oo))
				return false;

		}
		return true;
	}

	public SubLObject getField(SubLSymbol fieldName) {
		int fieldNum = this.getStructDecl().getFieldNumForSymbol(fieldName);
		return this.getField(fieldNum);
	}

	// @note make this once StructDecls start getting set properly
	public int getFieldCount() {
		SubLStructDecl decl = this.getStructDecl();
		if (decl == null)
			return 0;
		return decl.getFieldCount();
	}

	public SubLSymbol getName() {
		return this.getStructDecl().getStructName();
	}

	public SubLSymbol getType() {
		return this.getName();
	}

	public SubLFixnum getTypeCode() {
		return CommonSymbols.TWO_HUNDRED_FIFTY_FOUR_INTEGER;
	}

	public int hashCode(int currentDepth) {
		return Sxhash.sxhash(this).intValue();
	}

	/*
	 * public SubLObject eval(SubLEnvironment env) throws
	 * InvalidSubLExpressionException { throw new
	 * InvalidSubLExpressionException("Error: Attempt to take the " +
	 * "value of a structure '" + this + "'."); }
	 */

	public int id() {
		return this.getStructDecl().getId();
	}

	public void init(int size) {
	}

	public void setField(SubLSymbol fieldName, SubLObject value) {
		int fieldNum = this.getStructDecl().getFieldNumForSymbol(fieldName);
		this.setField(fieldNum, value);
	}

	public String toString() {
		try {
			return print_high.princ_to_string(this).getString();
		} catch (Exception e) {
			return "#<" + this.toTypeName() + " " + this.getName() + " @ " + this.hashCode() + ">";
		}
	}

	/** Method created to avoid casting */
	public SubLStruct toStruct() { // SubLStruct
		return this;
	}

	public String toTypeName() {
		return AbstractSubLStruct.STRUCT_TYPE_NAME;
	}

	public String writeToString() {
		// TODO Auto-generated method stub
		return this.toString();
	}

	//// Protected Area

	//// Private Area

	//// Internal Rep

}
