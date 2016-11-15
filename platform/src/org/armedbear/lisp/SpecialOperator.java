/*
 * SpecialOperator.java
 *
 * Copyright (C) 2002-2005 Peter Graves
 * $Id: SpecialOperator.java 12288 2009-11-29 22:00:12Z vvoutilainen $
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
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLPackage;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;

public class SpecialOperator extends Operator {
	private int[] callCount = new int[12];
	private int hotCount;

	public SpecialOperator(String name, SubLPackage pkg, boolean exported, String arglist) {
		SubLSymbol symbol;
		if (exported)
			symbol = pkg.internAndExport(name.toUpperCase());
		else
			symbol = pkg.intern(name.toUpperCase());
		symbol.setSymbolFunction(this);
		this.setLambdaName(symbol);
		this.setLambdaList(LispObjectFactory.makeString(arglist));
	}

	public SpecialOperator(SubLSymbol symbol) {
		symbol.setSymbolFunction(this);
		this.setLambdaName(symbol);
	}

	public SpecialOperator(SubLSymbol symbol, String arglist) {
		symbol.setSymbolFunction(this);
		this.setLambdaName(symbol);
		this.setLambdaList(LispObjectFactory.makeString(arglist));
	}

	public SubLObject execute() {
		return Lisp.error(new UndefinedFunction(this.getLambdaName()));
	}

	public SubLObject execute(SubLObject arg) {
		return Lisp.error(new UndefinedFunction(this.getLambdaName()));
	}

	public SubLObject execute(SubLObject first, SubLObject second)

	{
		return Lisp.error(new UndefinedFunction(this.getLambdaName()));
	}

	public SubLObject execute(SubLObject first, SubLObject second, SubLObject third)

	{
		return Lisp.error(new UndefinedFunction(this.getLambdaName()));
	}

	public SubLObject execute(SubLObject first, SubLObject second, SubLObject third, SubLObject fourth)

	{
		return Lisp.error(new UndefinedFunction(this.getLambdaName()));
	}

	public SubLObject execute(SubLObject first, SubLObject second, SubLObject third, SubLObject fourth,
			SubLObject fifth)

	{
		return Lisp.error(new UndefinedFunction(this.getLambdaName()));
	}

	public SubLObject execute(SubLObject first, SubLObject second, SubLObject third, SubLObject fourth,
			SubLObject fifth, SubLObject sixth)

	{
		return Lisp.error(new UndefinedFunction(this.getLambdaName()));
	}

	public SubLObject execute(SubLObject first, SubLObject second, SubLObject third, SubLObject fourth,
			SubLObject fifth, SubLObject sixth, SubLObject seventh)

	{
		return Lisp.error(new UndefinedFunction(this.getLambdaName()));
	}

	public SubLObject execute(SubLObject first, SubLObject second, SubLObject third, SubLObject fourth,
			SubLObject fifth, SubLObject sixth, SubLObject seventh, SubLObject eighth)

	{
		return Lisp.error(new UndefinedFunction(this.getLambdaName()));
	}

	public SubLObject execute(SubLObject[] args) {
		return Lisp.error(new UndefinedFunction(this.getLambdaName()));
	}

	// Profiling.

	public SubLObject getCallCount() {
		return Profiler.makeCallCounts(this.callCount);
	}

	public int getHotCount() {
		return this.hotCount;
	}

	public void incrementCallCount(int arity) {
		if (arity > 10)
			arity = -1;
		++this.callCount[arity + 1];
	}

	public void incrementHotCount() {
		++this.hotCount;
	}

	public void setCallCount(int n) {
		this.callCount[0] = n;
	}

	public void setHotCount(int n) {
		this.hotCount = n;
	}

	public String writeToString() {
		StringBuffer sb = new StringBuffer("#<SPECIAL-OPERATOR ");
		sb.append(this.lambdaName.writeToString());
		sb.append(">");
		return sb.toString();
	}
}
