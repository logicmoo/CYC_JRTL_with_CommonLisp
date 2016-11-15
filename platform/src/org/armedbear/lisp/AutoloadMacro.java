/*
 * AutoloadMacro.java
 *
 * Copyright (C) 2003-2004 Peter Graves
 * $Id: AutoloadMacro.java 12513 2010-03-02 22:35:36Z ehuelsmann $
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

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLCons;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;

public class AutoloadMacro extends Autoload {
	// ### autoload-macro
	private static Primitive AUTOLOAD_MACRO = new JavaPrimitive("autoload-macro", Lisp.PACKAGE_EXT, true) {

		public SubLObject execute(SubLObject first) {
			if (first instanceof SubLSymbol) {
				SubLSymbol symbol = (SubLSymbol) first;
				AutoloadMacro.installAutoloadMacro(symbol, null);
				return Lisp.T;
			}
			if (first instanceof SubLCons) {
				for (SubLObject list = first; list != Lisp.NIL; list = list.rest()) {
					SubLSymbol symbol = Lisp.checkSymbol(list.first());
					AutoloadMacro.installAutoloadMacro(symbol, null);
				}
				return Lisp.T;
			}
			return Lisp.error(new TypeError(first));
		}

		public SubLObject execute(SubLObject first, SubLObject second)

		{
			String fileName = second.getString();
			if (first instanceof SubLSymbol) {
				SubLSymbol symbol = (SubLSymbol) first;
				AutoloadMacro.installAutoloadMacro(symbol, fileName);
				return Lisp.T;
			}
			if (first instanceof SubLCons) {
				for (SubLObject list = first; list != Lisp.NIL; list = list.rest()) {
					SubLSymbol symbol = Lisp.checkSymbol(list.first());
					AutoloadMacro.installAutoloadMacro(symbol, fileName);
				}
				return Lisp.T;
			}
			return Lisp.error(new TypeError(first));
		}
	};

	static void installAutoloadMacro(SubLSymbol symbol, String fileName)

	{
		AutoloadMacro am = new AutoloadMacro(symbol, fileName);
		if (symbol.getSymbolFunction() instanceof SpecialOperator)
			Lisp.put(symbol, LispSymbols.MACROEXPAND_MACRO, am);
		else
			symbol.setSymbolFunction(am);
	}

	private AutoloadMacro(SubLSymbol symbol) {
		super(symbol);
	}

	private AutoloadMacro(SubLSymbol symbol, String fileName) {
		super(symbol, fileName, null);
	}

	public void load() {
		Load.loadSystemFile(this.getFileName(), true);
	}

	public String writeToString() {
		StringBuffer sb = new StringBuffer("#<AUTOLOAD-MACRO ");
		sb.append(this.getSymbol().writeToString());
		sb.append(" \"");
		sb.append(this.getFileName());
		sb.append("\">");
		return sb.toString();
	}
}
