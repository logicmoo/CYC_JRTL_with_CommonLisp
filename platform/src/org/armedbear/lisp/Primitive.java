/*
 * Primitive.java
 *
 * Copyright (C) 2002-2005 Peter Graves
 * $Id: Primitive.java 12254 2009-11-06 20:07:54Z ehuelsmann $
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

class JavaPrimitive extends Primitive {
	public JavaPrimitive(String name) {
		super(name);
	}

	public JavaPrimitive(String name, String arglist) {
		super(name, arglist);
	}

	public JavaPrimitive(String name, SubLPackage pkg) {
		super(name, pkg);
	}

	public JavaPrimitive(String name, SubLPackage pkg, boolean exported) {
		super(name, pkg, exported);
	}

	public JavaPrimitive(String name, SubLPackage pkg, boolean exported, String arglist) {
		super(name, pkg, exported, arglist);
	}

	public JavaPrimitive(String name, SubLPackage pkg, boolean exported, String arglist, String docstring) {
		super(name, pkg, exported, arglist, docstring);
	}

	public JavaPrimitive(SubLObject name) {
		super(name);
	}

	public JavaPrimitive(SubLObject name, SubLObject lambdaList) {
		super(name, lambdaList);
	}

	public JavaPrimitive(SubLSymbol symbol, String arglist) {
		super(symbol, arglist);
	}

	public JavaPrimitive(SubLSymbol symbol, String arglist, String docstring) {
		super(symbol, arglist, docstring);
	}

	public SubLObject typeOf() {
		return LispSymbols.JAVA_COMPILED_FUNCTION;
	}

	public SubLObject typep(SubLObject typeSpecifier) {
		if (typeSpecifier == LispSymbols.JAVA_COMPILED_FUNCTION)
			return Lisp.T;
		return super.typep(typeSpecifier);
	}
}

public class Primitive extends Function {

	public Primitive(String name) {
		super(name);
	}

	public Primitive(String name, String arglist) {
		super(name, arglist);
	}

	public Primitive(String name, SubLPackage pkg) {
		super(name, pkg);
	}

	public Primitive(String name, SubLPackage pkg, boolean exported) {
		super(name, pkg, exported);
	}

	public Primitive(String name, SubLPackage pkg, boolean exported, String arglist) {
		super(name, pkg, exported, arglist);
	}

	public Primitive(String name, SubLPackage pkg, boolean exported, String arglist, String docstring) {
		super(name, pkg, exported, arglist, docstring);
	}

	public Primitive(SubLObject name) {
		super(name);
	}

	public Primitive(SubLObject name, SubLObject lambdaList) {
		super(name, lambdaList);
	}

	public Primitive(SubLSymbol symbol, String arglist) {
		super(symbol, arglist);
	}

	public Primitive(SubLSymbol symbol, String arglist, String docstring) {
		super(symbol, arglist, docstring);
	}

	public SubLObject execute() {
		SubLObject[] args = LispObjectFactory.makeLispObjectArray(0);
		return this.execute(args);
	}

	public SubLObject execute(SubLObject arg) {
		SubLObject[] args = LispObjectFactory.makeLispObjectArray(1);
		args[0] = arg;
		return this.execute(args);
	}

	public SubLObject execute(SubLObject first, SubLObject second)

	{
		SubLObject[] args = LispObjectFactory.makeLispObjectArray(2);
		args[0] = first;
		args[1] = second;
		return this.execute(args);
	}

	public SubLObject execute(SubLObject first, SubLObject second, SubLObject third)

	{
		SubLObject[] args = LispObjectFactory.makeLispObjectArray(3);
		args[0] = first;
		args[1] = second;
		args[2] = third;
		return this.execute(args);
	}

	public SubLObject execute(SubLObject first, SubLObject second, SubLObject third, SubLObject fourth)

	{
		SubLObject[] args = LispObjectFactory.makeLispObjectArray(4);
		args[0] = first;
		args[1] = second;
		args[2] = third;
		args[3] = fourth;
		return this.execute(args);
	}

	public SubLObject execute(SubLObject first, SubLObject second, SubLObject third, SubLObject fourth,
			SubLObject fifth)

	{
		SubLObject[] args = LispObjectFactory.makeLispObjectArray(5);
		args[0] = first;
		args[1] = second;
		args[2] = third;
		args[3] = fourth;
		args[4] = fifth;
		return this.execute(args);
	}

	public SubLObject execute(SubLObject first, SubLObject second, SubLObject third, SubLObject fourth,
			SubLObject fifth, SubLObject sixth)

	{
		SubLObject[] args = LispObjectFactory.makeLispObjectArray(6);
		args[0] = first;
		args[1] = second;
		args[2] = third;
		args[3] = fourth;
		args[4] = fifth;
		args[5] = sixth;
		return this.execute(args);
	}

	public SubLObject execute(SubLObject first, SubLObject second, SubLObject third, SubLObject fourth,
			SubLObject fifth, SubLObject sixth, SubLObject seventh)

	{
		SubLObject[] args = LispObjectFactory.makeLispObjectArray(7);
		args[0] = first;
		args[1] = second;
		args[2] = third;
		args[3] = fourth;
		args[4] = fifth;
		args[5] = sixth;
		args[6] = seventh;
		return this.execute(args);
	}

	public SubLObject execute(SubLObject first, SubLObject second, SubLObject third, SubLObject fourth,
			SubLObject fifth, SubLObject sixth, SubLObject seventh, SubLObject eighth)

	{
		SubLObject[] args = LispObjectFactory.makeLispObjectArray(8);
		args[0] = first;
		args[1] = second;
		args[2] = third;
		args[3] = fourth;
		args[4] = fifth;
		args[5] = sixth;
		args[6] = seventh;
		args[7] = eighth;
		return this.execute(args);
	}

	public SubLObject typeOf() {
		return LispSymbols.COMPILED_FUNCTION;
	}
}
