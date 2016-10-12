/*
 * Function.java
 *
 * Copyright (C) 2002-2005 Peter Graves
 * $Id: Function.java 12288 2009-11-29 22:00:12Z vvoutilainen $
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

public abstract class Function extends Operator {
	private SubLObject propertyList = Lisp.NIL;
	private int hotCount;

	// Profiling.
	public int[] callCount = new int[12];

	protected Function() {
	}

	public Function(String name) {
		if (name != null) {
			SubLSymbol symbol = LispSymbolImpl.addFunction(name.toUpperCase(), this);
			if (Lisp.cold)
				symbol.setBuiltInFunction(true);
			this.setLambdaName(symbol);
		}
	}

	public Function(String name, String arglist) {
		this(name);
		this.setLambdaList(LispObjectFactory.makeString(arglist));
	}

	public Function(String name, SubLPackage pkg) {
		this(name, pkg, false);
	}

	public Function(String name, SubLPackage pkg, boolean exported) {
		this(name, pkg, exported, null, null);
	}

	public Function(String name, SubLPackage pkg, boolean exported, String arglist) {
		this(name, pkg, exported, arglist, null);
	}

	public Function(String name, SubLPackage pkg, boolean exported, String arglist, String docstring) {
		if (arglist instanceof String)
			this.setLambdaList(LispObjectFactory.makeString(arglist));
		if (name != null) {
			SubLSymbol symbol;
			if (exported)
				symbol = pkg.internAndExport(name.toUpperCase());
			else
				symbol = pkg.intern(name.toUpperCase());
			symbol.setSymbolFunction(this);
			if (Lisp.cold)
				symbol.setBuiltInFunction(true);
			this.setLambdaName(symbol);
			if (docstring != null)
				symbol.setDocumentation(LispSymbols.FUNCTION, LispObjectFactory.makeString(docstring));
		}
	}

	public Function(SubLObject name) {
		this.setLambdaName(name);
	}

	public Function(SubLObject name, SubLObject lambdaList) {
		this.setLambdaName(name);
		this.setLambdaList(lambdaList);
	}

	public Function(SubLSymbol symbol, String arglist) {
		symbol.setSymbolFunction(this);
		if (Lisp.cold)
			symbol.setBuiltInFunction(true);
		this.setLambdaName(symbol);
		this.setLambdaList(LispObjectFactory.makeString(arglist));
	}

	public Function(SubLSymbol symbol, String arglist, String docstring) {
		symbol.setSymbolFunction(this);
		if (Lisp.cold)
			symbol.setBuiltInFunction(true);
		this.setLambdaName(symbol);
		this.setLambdaList(LispObjectFactory.makeString(arglist));
		if (docstring != null)
			symbol.setDocumentation(LispSymbols.FUNCTION, LispObjectFactory.makeString(docstring));
	}

	// Used by the JVM compiler.
	public void argCountError() {
		Lisp.error(new WrongNumberOfArgumentsException(this));
	}

	public SubLObject classOf() {
		return BuiltInClass.FUNCTION;
	}

	public SubLObject execute() {
		return Lisp.error(new WrongNumberOfArgumentsException(this));
	}

	public SubLObject execute(SubLObject arg) {
		return Lisp.error(new WrongNumberOfArgumentsException(this));
	}

	public SubLObject execute(SubLObject first, SubLObject second)

	{
		return Lisp.error(new WrongNumberOfArgumentsException(this));
	}

	public SubLObject execute(SubLObject first, SubLObject second, SubLObject third)

	{
		return Lisp.error(new WrongNumberOfArgumentsException(this));
	}

	public SubLObject execute(SubLObject first, SubLObject second, SubLObject third, SubLObject fourth)

	{
		return Lisp.error(new WrongNumberOfArgumentsException(this));
	}

	public SubLObject execute(SubLObject first, SubLObject second, SubLObject third, SubLObject fourth,
			SubLObject fifth)

	{
		return Lisp.error(new WrongNumberOfArgumentsException(this));
	}

	public SubLObject execute(SubLObject first, SubLObject second, SubLObject third, SubLObject fourth,
			SubLObject fifth, SubLObject sixth)

	{
		return Lisp.error(new WrongNumberOfArgumentsException(this));
	}

	public SubLObject execute(SubLObject first, SubLObject second, SubLObject third, SubLObject fourth,
			SubLObject fifth, SubLObject sixth, SubLObject seventh)

	{
		return Lisp.error(new WrongNumberOfArgumentsException(this));
	}

	public SubLObject execute(SubLObject first, SubLObject second, SubLObject third, SubLObject fourth,
			SubLObject fifth, SubLObject sixth, SubLObject seventh, SubLObject eighth)

	{
		return Lisp.error(new WrongNumberOfArgumentsException(this));
	}

	public SubLObject execute(SubLObject[] args) {
		return Lisp.error(new WrongNumberOfArgumentsException(this));
	}

	public SubLObject getCallCount() {
		return Profiler.makeCallCounts(this.callCount);
	}

	public int getHotCount() {
		return this.hotCount;
	}

	public SubLObject getPropertyList() {
		if (this.propertyList == null)
			this.propertyList = Lisp.NIL;
		return this.propertyList;
	}

	public void incrementCallCount(int arity) {
		if (arity > 10)
			arity = -1;
		this.callCount[arity + 1]++;
	}

	public void incrementHotCount() {
		++this.hotCount;
	}

	private String javaTypeOf() {
		Class c = this.getClass();
		String s = c.getSimpleName();
		if (s == null || s.length() == 0) {
			s = c.getName();
			int li = s.lastIndexOf('.');
			if (li > 2)
				s = s.substring(li + 1);
		}
		return s + " as " + c.getSuperclass().getSimpleName();
	}

	public void setCallCount(int n) {
		this.callCount[0] = n;
	}

	public void setClassBytes(byte[] bytes) {
		this.propertyList = Lisp.putf(this.propertyList, LispSymbols.CLASS_BYTES, new ABCLJavaObject(bytes)
		// T
		);
	}

	public void setHotCount(int n) {
		this.hotCount = n;
	}

	public void setPropertyList(SubLObject obj) {
		if (obj == null)
			throw new NullPointerException();
		this.propertyList = obj;
	}

	public SubLObject typeOf() {
		return LispSymbols.FUNCTION;
	}

	public SubLObject typep(SubLObject typeSpecifier) {
		if (typeSpecifier == LispSymbols.FUNCTION)
			return Lisp.T;
		if (typeSpecifier == LispSymbols.COMPILED_FUNCTION)
			return Lisp.T;
		if (typeSpecifier == BuiltInClass.FUNCTION)
			return Lisp.T;
		return super.typep(typeSpecifier);
	}

	public String writeToString() {
		SubLObject name = this.getLambdaName();
		String typeOfName = " " + this.javaTypeOf();
		if (name != null && name != Lisp.NIL) {
			StringBuffer sb = new StringBuffer("#<FUNCTION ");
			sb.append(name.writeToString());
			sb.append(" {");
			sb.append(Integer.toHexString(System.identityHashCode(this)).toUpperCase());
			sb.append(typeOfName);
			sb.append("}>");
			return sb.toString();
		}
		// No name.
		SubLObject lambdaList = this.getLambdaList();
		if (lambdaList != null) {
			StringBuffer sb = new StringBuffer("#<FUNCTION ");
			sb.append("(LAMBDA ");
			if (lambdaList == Lisp.NIL)
				sb.append("()");
			else {
				LispThread thread = LispThread.currentThread();
				SpecialBindingsMark mark = thread.markSpecialBindings();
				thread.bindSpecial(LispSymbols.PRINT_LENGTH, Fixnum.THREE);
				try {
					sb.append(lambdaList.writeToString());
				} finally {
					thread.resetSpecialBindings(mark);
				}
			}
			sb.append(")");
			sb.append(" {");
			sb.append(Integer.toHexString(System.identityHashCode(this)).toUpperCase());
			sb.append(typeOfName);
			sb.append("}>");
			return sb.toString();
		}
		return this.unreadableString("FUNCTION" + typeOfName);
	}
}
