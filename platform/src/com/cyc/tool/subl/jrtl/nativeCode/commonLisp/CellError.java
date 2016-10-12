/*
 * CellError.java
 *
 * Copyright (C) 2003-2005 Peter Graves
 * $Id: CellError.java 12512 2010-02-28 15:54:17Z vvoutilainen $
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

public class CellError extends LispError {
	protected CellError(LispClass cls) {
		super(cls);
	}

	public CellError(SubLObject initArgs) {
		super(StandardClass.CELL_ERROR);
		this.initialize(initArgs);
	}

	public SubLObject classOf() {
		return StandardClass.CELL_ERROR;
	}

	public SubLObject getCellName() {
		return this.getInstanceSlotValue(LispSymbols.NAME);
	}

	public String getMessage() {
		if (LispSymbols.PRINT_ESCAPE.symbolValue() == Lisp.NIL)
			return super.getMessage();
		StringBuffer sb = new StringBuffer(this.typeOf().writeToString());
		sb.append(' ');
		sb.append(this.getCellName().writeToString());
		return this.unreadableString(sb.toString());
	}

	protected void initialize(SubLObject initArgs) {
		super.initialize(initArgs);
		SubLObject name = Lisp.NIL;
		while (initArgs != Lisp.NIL) {
			SubLObject first = initArgs.first();
			initArgs = initArgs.rest();
			if (first == Keyword.NAME) {
				name = initArgs.first();
				break;
			}
			initArgs = initArgs.rest();
		}
		this.setCellName(name);
	}

	protected void setCellName(SubLObject name) {
		this.setInstanceSlotValue(LispSymbols.NAME, name);
	}

	public SubLObject typeOf() {
		return LispSymbols.CELL_ERROR;
	}

	public SubLObject typep(SubLObject type) {
		if (type == LispSymbols.CELL_ERROR)
			return Lisp.T;
		if (type == StandardClass.CELL_ERROR)
			return Lisp.T;
		return super.typep(type);
	}
}
