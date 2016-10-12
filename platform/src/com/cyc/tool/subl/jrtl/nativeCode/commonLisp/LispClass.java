/*
 * LispClass.java
 *
 * Copyright (C) 2003-2005 Peter Graves
 * $Id: LispClass.java 12481 2010-02-14 21:29:58Z ehuelsmann $
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

public abstract class LispClass extends StandardObject {

	private static EqHashTable map = new EqHashTable(256, Lisp.NIL, Lisp.NIL);

	private static boolean debugClassLayout = false;

	// ### find-class symbol &optional errorp environment => class
	private static Primitive FIND_CLASS = new JavaPrimitive(LispSymbols.FIND_CLASS,
			"symbol &optional errorp environment") {

		public SubLObject execute(SubLObject arg) {
			return LispClass.findClass(arg, true);
		}

		public SubLObject execute(SubLObject first, SubLObject second)

		{
			return LispClass.findClass(first, second != Lisp.NIL);
		}

		public SubLObject execute(SubLObject first, SubLObject second, SubLObject third)

		{
			// FIXME Use environment!
			return LispClass.findClass(first, second != Lisp.NIL);
		}
	};

	// ### %set-find-class
	private static Primitive _SET_FIND_CLASS = new JavaPrimitive("%set-find-class", Lisp.PACKAGE_SYS, true) {

		public SubLObject execute(SubLObject first, SubLObject second)

		{
			SubLSymbol name = Lisp.checkSymbol(first);
			if (second == Lisp.NIL) {
				LispClass.removeClass(name);
				return second;
			}
			LispClass c = Lisp.checkClass(second);
			LispClass.addClass(name, c);
			return second;
		}
	};

	// ### subclassp
	private static Primitive SUBCLASSP = new JavaPrimitive(LispSymbols.SUBCLASSP, "class") {

		public SubLObject execute(SubLObject first, SubLObject second)

		{
			LispClass c = Lisp.checkClass(first);
			return c.subclassp(second) ? Lisp.T : Lisp.NIL;
		}
	};

	public static LispClass addClass(SubLSymbol symbol, LispClass c) {
		synchronized (LispClass.map) {
			LispClass.map.putVoid(symbol, c);
		}
		return c;
	}

	public static SubLObject findClass(SubLObject name, boolean errorp)

	{
		SubLSymbol symbol = Lisp.checkSymbol(name);
		LispClass c;
		synchronized (LispClass.map) {
			c = (LispClass) LispClass.map.getHT(symbol);
		}
		if (c != null)
			return c;
		if (errorp) {
			StringBuilder sb = new StringBuilder("There is no class named ");
			sb.append(name.writeToString());
			sb.append('.');
			return Lisp.error(new LispError(sb.toString()));
		}
		return Lisp.NIL;
	}

	public static LispClass findClass(SubLSymbol symbol) {
		synchronized (LispClass.map) {
			return (LispClass) LispClass.map.getHT(symbol);
		}
	}

	public static void removeClass(SubLSymbol symbol) {
		synchronized (LispClass.map) {
			LispClass.map.removeHT(symbol);
		}
	}

	private int sxhash;
	private SubLObject name;
	private SubLObject propertyList;
	private Layout classLayout;
	private SubLObject directSuperclasses = Lisp.NIL;
	private SubLObject directSubclasses = Lisp.NIL;
	private SubLObject classPrecedenceList = Lisp.NIL;
	private SubLObject directMethods = Lisp.NIL;

	private SubLObject documentation = Lisp.NIL;

	private boolean finalized;

	protected LispClass(Layout layout) {
		super(layout, layout == null ? 0 : layout.getLength());
		this.sxhash = this.hashCodeLisp() & 0x7fffffff;
		// classLayout = layout;
	}

	protected LispClass(Layout layout, SubLSymbol symbol) {
		super(layout, layout == null ? 0 : layout.getLength());
		this.setLispClassName(symbol);
		this.sxhash = this.hashCodeLisp() & 0x7fffffff;
	}

	protected LispClass(Layout layout, SubLSymbol symbol, SubLObject directSuperclasses) {
		super(layout, layout == null ? 0 : layout.getLength());
		this.sxhash = this.hashCodeLisp() & 0x7fffffff;
		this.setLispClassName(symbol);
		this.setDirectSuperclasses(directSuperclasses);
	}

	protected LispClass(SubLSymbol symbol) {
		this(null, symbol);
	}

	public SubLObject classOf() {
		return StandardClass.CLASS;
	}

	public Layout getClassLayout() {
		// Layout classLayout = layout;
		if (this.classLayout == null && LispClass.debugClassLayout) {
			String str = this.writeToString() + this.getDebugParts().writeToString();
			Debug.trace(";; WARNING NULL CLASSLAYOUT " + str);
			return this.classLayout;
		}
		return this.classLayout;
	}

	public SubLObject getCPL() {
		return this.classPrecedenceList;
	}

	public SubLObject getDebugParts() {
		SubLObject result = Lisp.NIL;
		result = result.push(LispObjectFactory.makeCons("NAME", this.name != null ? this.name : Lisp.NIL));
		result = result
				.push(LispObjectFactory.makeCons("LAYOUT", this.classLayout != null ? this.classLayout : Lisp.NIL));
		result = result.push(LispObjectFactory.makeCons("DIRECT-SUPERCLASSES", this.getDirectSuperclasses()));
		result = result.push(LispObjectFactory.makeCons("DIRECT-SUBCLASSES", this.getDirectSubclasses()));
		result = result.push(LispObjectFactory.makeCons("CLASS-PRECEDENCE-LIST", this.getCPL()));
		result = result.push(LispObjectFactory.makeCons("DIRECT-METHODS", this.getDirectMethods()));
		result = result.push(LispObjectFactory.makeCons("DOCUMENTATION", this.getDocumentation()));
		return result.nreverse();
	}

	public SubLObject getDirectMethods() {
		return this.directMethods;
	}

	public SubLObject getDirectSubclasses() {
		return this.directSubclasses;
	}

	public SubLObject getDirectSuperclasses() {
		return this.directSuperclasses;
	}

	public SubLObject getDocumentation() {
		return this.documentation;
	}

	public int getLayoutLength() {
		if (this.layout == null)
			return 0;
		return this.layout.getLength();
	}

	public SubLObject getLispClassName() {
		return this.name;
	}

	public SubLObject getParts() {
		SubLObject result = Lisp.NIL;
		result = result.push(LispObjectFactory.makeCons("NAME", this.name != null ? this.name : Lisp.NIL));
		result = result.push(
				LispObjectFactory.makeCons("LAYOUT", this.getClassLayout() != null ? this.getClassLayout() : Lisp.NIL));
		result = result.push(LispObjectFactory.makeCons("DIRECT-SUPERCLASSES", this.getDirectSuperclasses()));
		result = result.push(LispObjectFactory.makeCons("DIRECT-SUBCLASSES", this.getDirectSubclasses()));
		result = result.push(LispObjectFactory.makeCons("CLASS-PRECEDENCE-LIST", this.getCPL()));
		result = result.push(LispObjectFactory.makeCons("DIRECT-METHODS", this.getDirectMethods()));
		result = result.push(LispObjectFactory.makeCons("DOCUMENTATION", this.getDocumentation()));
		return result.nreverse();
	}

	public SubLObject getPropertyList() {
		if (this.propertyList == null)
			this.propertyList = Lisp.NIL;
		return this.propertyList;
	}

	public boolean isFinalized() {
		return this.finalized;
	}

	public void setClassLayout(Layout layout) {
		this.classLayout = layout;
		// this.layout = layout;
	}

	public void setCPL(SubLObject... cpl) {
		SubLObject obj1 = cpl[0];
		if (obj1 instanceof SubLCons && cpl.length == 1)
			this.classPrecedenceList = obj1;
		else {
			Debug.assertTrue(obj1 == this);
			SubLObject l = Lisp.NIL;
			for (int i = cpl.length; i-- > 0;)
				l = LispObjectFactory.makeCons(cpl[i], l);
			this.classPrecedenceList = l;
		}
	}

	public void setDirectMethods(SubLObject methods) {
		this.directMethods = methods;
	}

	public void setDirectSubclasses(SubLObject directSubclasses) {
		this.directSubclasses = directSubclasses;
	}

	// When there's only one direct superclass...
	public void setDirectSuperclass(SubLObject superclass) {
		this.setDirectSuperclasses(LispObjectFactory.makeCons(superclass));
	}

	public void setDirectSuperclasses(SubLObject directSuperclasses) {
		this.directSuperclasses = directSuperclasses;
	}

	public void setDocumentation(SubLObject doc) {
		this.documentation = doc;
	}

	public void setFinalized(boolean b) {
		this.finalized = b;
	}

	public void setLispClassName(SubLObject name) {
		this.name = name;
	}

	public void setPropertyList(SubLObject obj) {
		if (obj == null)
			throw new NullPointerException();
		this.propertyList = obj;
	}

	public boolean subclassp(SubLObject obj) {
		SubLObject cpl = this.getCPL();
		while (cpl != Lisp.NIL) {
			if (cpl.first() == obj)
				return true;
			cpl = ((SubLCons) cpl).rest();
		}
		return false;
	}

	public int sxhash() {
		return this.sxhash;
	}

	public String toString() {
		try {
			return this.writeToString();
		} catch (Throwable e) {
			return super.toString();
		}
	}

	public SubLObject typeOf() {
		return LispSymbols.CLASS;
	}

	public SubLObject typep(SubLObject type) {
		if (type == LispSymbols.CLASS)
			return Lisp.T;
		if (type == StandardClass.CLASS)
			return Lisp.T;
		return super.typep(type);
	}
}
