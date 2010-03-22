/*
 * LispSymbols.java
 *
 * Copyright (C) 2002-2007 Peter Graves
 * $Id: LispSymbols.java 12515 2010-03-03 19:14:56Z vvoutilainen $
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
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301, USA.
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

package com.cyc.tool.subl.jrtl.nativeCode.type.symbol;


import static com.cyc.tool.subl.jrtl.nativeCode.commonLisp.Lisp.*;
import static com.cyc.tool.subl.jrtl.nativeCode.commonLisp.LispObjectFactory.*;

import com.cyc.tool.subl.jrtl.nativeCode.commonLisp.LispThread;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.*;

public interface LispSymbol extends SubLObject
{
  public boolean isKeyword();
  
  public boolean isSymbol();

	public SubLObject symbolValue(LispThread thread);

	public SubLObject symbolValue();

	public void setSymbolValue(SubLObject arglist);

	public void setSymbolFunction(SubLObject standardGenericFunction);

	public void setBuiltInFunction(boolean b);

	public void initializeSpecial(SubLObject t);

	public void setLispPackage(SubLObject nil);

	public void initializeConstant(SubLObject makeSingle);

	public String getQualifiedName();

	public SubLObject symbolValueNoThrow();

	public String getJavaSymbolName();

	public boolean isBuiltInFunction();

	public SubLObject getLispPackage();

	public void setSpecial(boolean b);

	public boolean isConstant();

	public SubLString getSubLName();
	
	public SubLObject getSymbolSetfFunctionOrDie();

	public int getSpecialIndex();

	public void setSpecialIndex(int n);

	//public Symbol addFunction(String upperCase, LispObject function);
}
