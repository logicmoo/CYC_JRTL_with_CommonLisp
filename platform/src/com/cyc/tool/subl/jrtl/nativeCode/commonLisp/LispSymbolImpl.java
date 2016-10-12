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

package com.cyc.tool.subl.jrtl.nativeCode.commonLisp;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLPackage;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;

public class LispSymbolImpl extends AbstractLispObject implements SubLSymbol {
	// Bit flags.
	private static int FLAG_SPECIAL = 0x0001;

	private static int FLAG_CONSTANT = 0x0002;

	private static int FLAG_BUILT_IN_FUNCTION = 0x0004;

	public static SubLSymbol addFunction(String name, SubLObject obj) {
		LispSymbolImpl symbol = (LispSymbolImpl) Lisp.PACKAGE_CL.internAndExport(name);
		symbol.function = obj;
		return symbol;
	}

	private static String capitalize(String s, SubLObject readtableCase) {
		if (readtableCase == Keyword.INVERT || readtableCase == Keyword.PRESERVE)
			return s;
		int limit = s.length();
		StringBuilder sb = new StringBuilder(limit);
		boolean lastCharWasAlphanumeric = false;
		for (int i = 0; i < limit; i++) {
			char c = s.charAt(i);
			if (Character.isLowerCase(c)) {
				if (readtableCase == Keyword.UPCASE)
					sb.append(c);
				else // DOWNCASE
					sb.append(lastCharWasAlphanumeric ? c : CharacterFunctions.toUpperCase(c));
				lastCharWasAlphanumeric = true;
			} else if (Character.isUpperCase(c)) {
				if (readtableCase == Keyword.UPCASE)
					sb.append(lastCharWasAlphanumeric ? CharacterFunctions.toLowerCase(c) : c);
				else // DOWNCASE
					sb.append(c);
				lastCharWasAlphanumeric = true;
			} else {
				sb.append(c);
				lastCharWasAlphanumeric = Character.isDigit(c);
			}
		}
		return sb.toString();
	}

	private static String invert(String s) {
		// "When the readtable case is :INVERT, the case of all alphabetic
		// characters in single case symbol names is inverted. Mixed-case
		// symbol names are printed as is." (22.1.3.3.2)
		int limit = s.length();
		int LOWER = 1;
		int UPPER = 2;
		int state = 0;
		for (int i = 0; i < limit; i++) {
			char c = s.charAt(i);
			if (Character.isUpperCase(c)) {
				if (state == LOWER)
					return s; // Mixed case.
				state = UPPER;
			}
			if (Character.isLowerCase(c)) {
				if (state == UPPER)
					return s; // Mixed case.
				state = LOWER;
			}
		}
		StringBuilder sb = new StringBuilder(limit);
		for (int i = 0; i < limit; i++) {
			char c = s.charAt(i);
			if (Character.isUpperCase(c))
				sb.append(Character.toLowerCase(c));
			else if (Character.isLowerCase(c))
				sb.append(Character.toUpperCase(c));
			else
				sb.append(c);
		}
		return sb.toString();
	}

	private static String multipleEscape(String s) {
		StringBuilder sb = new StringBuilder("|");
		int limit = s.length();
		for (int i = 0; i < limit; i++) {
			char c = s.charAt(i);
			if (c == '|' || c == '\\')
				sb.append('\\');
			sb.append(c);
		}
		sb.append('|');
		return sb.toString();
	}

	private static boolean needsEscape(String s, SubLObject readtableCase, LispThread thread)

	{
		boolean escape = false;
		int length = s.length();
		if (length == 0)
			return true;
		if (s.charAt(0) == '#')
			return true;
		int radix;
		SubLObject printBaseBinding = LispSymbols.PRINT_BASE.symbolValue(thread);
		if (printBaseBinding instanceof Fixnum)
			radix = ((Fixnum) printBaseBinding).value;
		else {
			Lisp.error(new TypeError("The value of *PRINT-BASE* is not of type (INTEGER 2 36)."));
			// Not reached.
			return false;
		}
		if (radix < 2 || radix > 36) {
			Lisp.error(new TypeError("The value of *PRINT-BASE* is not of type (INTEGER 2 36)."));
			// Not reached.
			return false;
		}
		boolean seenNonDigit = false;
		for (int i = length; i-- > 0;) {
			char c = s.charAt(i);
			if ("(),|\\`'\";:".indexOf(c) >= 0)
				return true;
			if (Character.isWhitespace(c))
				return true;
			if (readtableCase == Keyword.UPCASE) {
				if (Character.isLowerCase(c))
					return true;
			} else if (readtableCase == Keyword.DOWNCASE)
				if (Character.isUpperCase(c))
					return true;
			if (!escape && !seenNonDigit)
				if (Character.digit(c, radix) < 0)
					seenNonDigit = true;
		}
		if (!seenNonDigit)
			return true;
		if (s.charAt(0) == '.') {
			boolean allDots = true;
			for (int i = length; i-- > 1;)
				if (s.charAt(i) != '.') {
					allDots = false;
					break;
				}
			if (allDots)
				return true;
		}
		return false;
	}

	public SubLString name;

	public int hash = -1;
	/**
	 * To be accessed by LispThread only: used to find the index in the
	 * LispThread.specials array
	 */
	public int specialIndex = LispThread.UNASSIGNED_SPECIAL_INDEX;
	public SubLObject pkg; // Either a package object or NIL.
	public volatile SubLObject value = SubLSymbol.UNBOUND;
	public SubLObject function;
	public SubLObject propertyList;
	public boolean neverInline = false;
	public boolean hasInlined = false;

	public int flags;

	// Construct an uninterned symbol.
	public LispSymbolImpl(String s) {
		this.name = LispObjectFactory.makeString(s);
		this.pkg = Lisp.NIL;
	}

	public LispSymbolImpl(String s, SubLPackage pkg) {
		this.name = LispObjectFactory.makeString(s);
		this.pkg = pkg;
	}

	public LispSymbolImpl(SubLString string) {
		this.name = string;
		this.pkg = Lisp.NIL;
	}

	public LispSymbolImpl(SubLString string, int hash, SubLPackage pkg) {
		this.name = string;
		this.hash = hash;
		this.pkg = pkg;
	}

	public LispSymbolImpl(SubLString string, SubLPackage pkg) {
		this.name = string;
		this.pkg = pkg;
	}

	public SubLObject classOf() {
		return BuiltInClass.SYMBOL;
	}

	public boolean constantp() {
		return (this.flags & LispSymbolImpl.FLAG_CONSTANT) != 0;
	}

	public SubLObject execute() {
		SubLObject fun;
		if ((fun = this.function) == null)
			return this.undefinedFunction(Lisp.NIL);

		return fun.execute();
	}

	public SubLObject execute(SubLObject arg) {
		SubLObject fun;
		if ((fun = this.function) == null)
			return this.undefinedFunction(Lisp.list(arg));

		return fun.execute(arg);
	}

	public SubLObject execute(SubLObject first, SubLObject second)

	{
		SubLObject fun;
		if ((fun = this.function) == null)
			return this.undefinedFunction(Lisp.list(first, second));

		return fun.execute(first, second);
	}

	public SubLObject execute(SubLObject first, SubLObject second, SubLObject third)

	{
		SubLObject fun;
		if ((fun = this.function) == null)
			return this.undefinedFunction(Lisp.list(first, second, third));

		return fun.execute(first, second, third);
	}

	public SubLObject execute(SubLObject first, SubLObject second, SubLObject third, SubLObject fourth)

	{
		SubLObject fun;
		if ((fun = this.function) == null)
			return this.undefinedFunction(Lisp.list(first, second, third, fourth));

		return fun.execute(first, second, third, fourth);
	}

	public SubLObject execute(SubLObject first, SubLObject second, SubLObject third, SubLObject fourth,
			SubLObject fifth)

	{
		SubLObject fun;
		if ((fun = this.function) == null)
			return this.undefinedFunction(Lisp.list(first, second, third, fourth, fifth));

		return fun.execute(first, second, third, fourth, fifth);
	}

	public SubLObject execute(SubLObject first, SubLObject second, SubLObject third, SubLObject fourth,
			SubLObject fifth, SubLObject sixth)

	{
		SubLObject fun;
		if ((fun = this.function) == null)
			return this.undefinedFunction(Lisp.list(first, second, third, fourth, fifth, sixth));

		return fun.execute(first, second, third, fourth, fifth, sixth);
	}

	public SubLObject execute(SubLObject first, SubLObject second, SubLObject third, SubLObject fourth,
			SubLObject fifth, SubLObject sixth, SubLObject seventh)

	{
		SubLObject fun;
		if ((fun = this.function) == null)
			return this.undefinedFunction(Lisp.list(first, second, third, fourth, fifth, sixth, seventh));

		return fun.execute(first, second, third, fourth, fifth, sixth, seventh);
	}

	public SubLObject execute(SubLObject first, SubLObject second, SubLObject third, SubLObject fourth,
			SubLObject fifth, SubLObject sixth, SubLObject seventh, SubLObject eighth)

	{
		SubLObject fun;
		if ((fun = this.function) == null)
			return this.undefinedFunction(Lisp.list(first, second, third, fourth, fifth, sixth, seventh, eighth));

		return fun.execute(first, second, third, fourth, fifth, sixth, seventh, eighth);
	}

	public SubLObject execute(SubLObject[] args) {
		SubLObject fun;
		if ((fun = this.function) == null) {
			SubLObject list = Lisp.NIL;
			for (int i = args.length; i-- > 0;)
				list = LispObjectFactory.makeCons(args[i], list);
			return this.undefinedFunction(list);
		}

		return fun.execute(args);
	}

	public SubLObject getCallCount() {
		// (prof:show-call-count-arities 'EQL 0)
		// (prof:show-call-count-arities 'MEMBER 0)
		try {
			SubLObject CC = function_info.coerce_function(LispObjectFactory.makeCons(this, Lisp.NIL), new Environment(),
					true);
			if (CC != Lisp.NIL)
				return CC.getCallCount();
			return super.getCallCount();
		} catch (Throwable e) {
			try {
				if (this.function != null)
					this.function.getCallCount();
				return super.getCallCount();
			} catch (Throwable e2) {
				// TODO: handle exception
				return Lisp.NIL;
			}
		}
	}

	public SubLObject getDescription() {
		LispThread thread = LispThread.currentThread();
		SpecialBindingsMark mark = thread.markSpecialBindings();
		thread.bindSpecial(LispSymbols.PRINT_ESCAPE, Lisp.NIL);
		try {
			StringBuilder sb = new StringBuilder("The symbol ");
			sb.append(this.name.writeToString());
			sb.append(" at #x");
			sb.append(Integer.toHexString(System.identityHashCode(this)).toUpperCase());
			if (this.pkg instanceof SubLPackage) {
				sb.append(", an ");
				SubLSymbol sym = ((SubLPackage) this.pkg).findExternalSymbol(this.name);
				sb.append(sym == this ? "external" : "internal");
				sb.append(" symbol in the ");
				sb.append(((SubLPackage) this.pkg).getJavaName());
				sb.append(" package");
			}
			return LispObjectFactory.makeString(sb);
		} finally {
			thread.resetSpecialBindings(mark);
		}
	}

	public String getJavaSymbolName() {
		return this.name.getString();
	}

	public SubLObject getLispPackage() {
		return this.pkg;
	}

	public String getName() {
		return this.getJavaSymbolName();
	}

	public SubLObject getParts() {
		SubLObject parts = Lisp.NIL;
		parts = parts.push(LispObjectFactory.makeCons("name", this.name));
		parts = parts.push(LispObjectFactory.makeCons("package", this.pkg));
		parts = parts.push(LispObjectFactory.makeCons("value", this.value));
		parts = parts.push(LispObjectFactory.makeCons("function", this.function));
		parts = parts.push(LispObjectFactory.makeCons("plist", this.propertyList));
		parts = parts.push(LispObjectFactory.makeCons("flags", LispObjectFactory.makeInteger(this.flags)));
		parts = parts.push(LispObjectFactory.makeCons("hash", LispObjectFactory.makeInteger(this.hash)));
		return parts.nreverse();
	}

	public SubLObject getPropertyList() {
		if (this.propertyList == null)
			this.propertyList = Lisp.NIL;
		return this.propertyList;
	}

	public String getQualifiedName() {
		String n = this.name.getString();
		if (this.pkg == Lisp.NIL)
			return "#:".concat(n);
		if (this.isKeyword())
			return ":".concat(n);
		StringBuilder sb = new StringBuilder(((SubLPackage) this.pkg).getJavaName());
		if (((SubLPackage) this.pkg).findExternalSymbol(this.name) != null)
			sb.append(':');
		else
			sb.append("::");
		sb.append(n);
		return sb.toString();
	}

	public int getSpecialIndex() {
		return this.specialIndex;
	}

	/** See LispObject.getStringValue() */

	public String getString() {
		return this.name.getString();
	}

	public SubLString getSubLName() {
		return this.name;
	}

	public SubLObject getSymbolFunction() {
		return this.function;
	}

	public SubLObject getSymbolFunctionOrDie() {
		if (this.function == null)
			return Lisp.error(new UndefinedFunction(this));
		if (this.function instanceof Autoload) {
			Autoload autoload = (Autoload) this.function;
			autoload.load();
		}
		return this.function;
	}

	public SubLObject getSymbolSetfFunctionOrDie()

	{
		SubLObject obj = Lisp.get(this, LispSymbols.SETF_FUNCTION, null);
		if (obj == null)
			Lisp.error(new UndefinedFunction(Lisp.list(Keyword.NAME, Lisp.list(LispSymbols.SETF, this))));
		return obj;
	}

	/**
	 * Gets the value associated with the symbol as set by SYMBOL-VALUE.
	 *
	 * @return The associated value, or null if unbound.
	 *
	 * @see SubLSymbol#symbolValue
	 */

	public SubLObject getSymbolValue() {
		return this.value;
	}

	public void incrementCallCount(int n) {
		if (this.function != null)
			this.function.incrementCallCount(n);
		else
			super.incrementCallCount(n);
	}

	public void incrementHotCount() {
		if (this.function != null)
			this.function.incrementHotCount();
	}

	public void initializeConstant(SubLObject value) {
		this.flags |= LispSymbolImpl.FLAG_SPECIAL | LispSymbolImpl.FLAG_CONSTANT;
		this.value = value;
	}

	public void initializeSpecial(SubLObject value) {
		this.flags |= LispSymbolImpl.FLAG_SPECIAL;
		this.value = value;
	}

	public boolean isBuiltInFunction() {
		return (this.flags & LispSymbolImpl.FLAG_BUILT_IN_FUNCTION) != 0;
	}

	public boolean isConstant() {
		return (this.flags & LispSymbolImpl.FLAG_CONSTANT) != 0;
	}

	public boolean isKeyword() {
		return this.pkg == Lisp.PACKAGE_KEYWORD;
	}

	public boolean isSpecialOperator() {
		return this.function instanceof SpecialOperator;
	}

	public boolean isSpecialVariable() {
		return (this.flags & LispSymbolImpl.FLAG_SPECIAL) != 0;
	}

	public boolean isSymbol() {
		return true;
	}

	public void setBuiltInFunction(boolean b) {
		if (b)
			this.flags |= LispSymbolImpl.FLAG_BUILT_IN_FUNCTION;
		else
			this.flags &= ~LispSymbolImpl.FLAG_BUILT_IN_FUNCTION;
	}

	public void setLispPackage(SubLObject obj) {
		this.pkg = obj;
	}

	private void setNeverInline() {
		if (this.function instanceof JavaPrimitive)
			InlinedPrimitiveRegistry.debugInline(";; Removing inlineability for " + this);
		if (this.hasInlined)
			throw new Error("setNeverInline " + this);
		this.neverInline = true;
	}

	public void setPropertyList(SubLObject obj) {
		if (obj == null)
			throw new NullPointerException();
		this.propertyList = obj;
	}

	public void setSpecial(boolean b) {
		if (b)
			this.flags |= LispSymbolImpl.FLAG_SPECIAL;
		else
			this.flags &= ~LispSymbolImpl.FLAG_SPECIAL;
	}

	public void setSpecialIndex(int specialIndex) {
		this.specialIndex = specialIndex;
	}

	public void setSymbolFunction(SubLObject obj) {
		if (this.function == obj)
			return;
		if (obj instanceof JavaPrimitive) {
			this.function = obj;
			return;
		}
		if (obj == null) {
			// fmkunbound
			this.setNeverInline();
			this.function = obj;
			return;
		}
		if (obj instanceof SpecialOperator) {
			this.setNeverInline();
			this.function = obj;
			return;
		}
		if (obj instanceof CompiledClosure) {
			this.setNeverInline();
			this.function = obj;
			return;
		}
		if (obj instanceof MacroObject) {
			MacroObject aobj = (MacroObject) obj;
			this.setNeverInline();
			this.function = obj;
			return;
		}
		SubLObject plist = obj.getPropertyList();
		if (plist == Lisp.NIL) {
			if (obj == Lisp.T) {
				// wierd?
				this.setNeverInline();
				this.function = obj;
				return;
			}
			this.function = obj;
			return;
		}
		if (plist != null) {
			SubLObject bytes = Lisp.getf(plist, LispSymbols.CLASS_BYTES, Lisp.NIL);
			if (bytes instanceof JavaObject || bytes == Lisp.T) {
				this.setNeverInline();
				this.function = obj;
				return;
			}
		}
		if (this.function instanceof JavaPrimitive) {
			this.setNeverInline();
			this.function = obj;
			return;
		}
		//
		// if (this.function instanceof Autoload) {
		// this.function = obj;
		// return;
		// }
		// if (obj instanceof Autoload) {
		// Autoload aobj = (Autoload)obj;
		// if (aobj.fileName!=null) {
		// setNeverInline();
		// }
		// this.function = obj;
		// return;
		// }
		// if (obj instanceof Closure) {
		// Closure aobj = (Closure)obj;
		// setNeverInline();
		// this.function = obj;
		// return;
		// }

		// if (obj instanceof AutoloadedFunctionProxy) {
		// AutoloadedFunctionProxy aobj = (AutoloadedFunctionProxy)obj;
		// setNeverInline();
		// this.function = obj;
		// return;
		// }
		// if (obj instanceof ReaderMacroFunction || this.function instanceof
		// ReaderMacroFunction
		// ||obj instanceof DispatchMacroFunction || this.function instanceof
		// DispatchMacroFunction
		// ) {
		// setNeverInline();
		// this.function = obj;
		// return;
		// }
		//

		//

		// Class claz = obj.getClass();
		// if (this.function==null||this.function==NIL) {
		//
		// claz = claz.getDeclaringClass();
		// if (claz==null) {
		// setNeverInline();
		// this.function = obj;
		// return;
		// }
		// this.function = obj;
		// return;
		// }
		// claz = claz.getSuperclass();
		this.function = obj;
	}

	/**
	 * Sets the value associated with the symbol as if set by SYMBOL-VALUE.
	 *
	 * @return The associated value, or null if unbound.
	 *
	 * @see SubLSymbol#symbolValue
	 */
	public void setSymbolValue(SubLObject value) {
		this.value = value;
	}

	public SubLObject STRING() {
		return this.name;
	}

	public int sxhash() {
		int h = this.hash;
		if (h < 0) {
			h = this.name.sxhash();
			this.hash = h;
		}
		return h;
	}

	public SubLObject SYMBOLP() {
		return Lisp.T;
	}

	/**
	 * Returns the value associated with this symbol in the current thread
	 * context when it is treated as a special variable.
	 *
	 * A lisp error is thrown if the symbol is unbound.
	 *
	 * @return The associated value
	 *
	 * @see LispThread#lookupSpecial
	 * @see SubLSymbol#getSymbolValue()
	 *
	 */
	public SubLObject symbolValue() {
		return this.symbolValue(LispThread.currentThread());
	}

	/**
	 * Returns the value associated with this symbol in the specified thread
	 * context when it is treated as a special variable.
	 *
	 * A lisp error is thrown if the symbol is unbound.
	 *
	 * @return The associated value
	 *
	 * @see LispThread#lookupSpecial
	 * @see SubLSymbol#getSymbolValue()
	 *
	 */
	public SubLObject symbolValue(LispThread thread) {
		SubLObject val = thread.lookupSpecial(this);
		if (val != null)
			return val;
		if (this.value != null)
			return this.value;
		return Lisp.error(new UnboundVariable(this));
	}

	/**
	 * Returns the value of the symbol in the current thread context; if the
	 * symbol has been declared special, the value of the innermost binding is
	 * returned. Otherwise, the SYMBOL-VALUE is returned, or null if unbound.
	 *
	 * @return A lisp object, or null if unbound
	 *
	 * @see LispThread#lookupSpecial
	 * @see SubLSymbol#getSymbolValue()
	 *
	 */
	public SubLObject symbolValueNoThrow() {
		return this.symbolValueNoThrow(LispThread.currentThread());
	}

	/**
	 * Returns the value of the symbol in the current thread context; if the
	 * symbol has been declared special, the value of the innermost binding is
	 * returned. Otherwise, the SYMBOL-VALUE is returned, or null if unbound.
	 *
	 * @return A lisp object, or null if unbound
	 *
	 * @see LispThread#lookupSpecial
	 * @see SubLSymbol#getSymbolValue()
	 *
	 */
	public SubLObject symbolValueNoThrow(LispThread thread) {
		if ((this.flags & LispSymbolImpl.FLAG_SPECIAL) != 0) {
			SubLObject val = thread.lookupSpecial(this);
			if (val != null)
				return val;
		}
		return this.value;
	}

	public String toString() {
		return this.getQualifiedName();
	}

	public SubLSymbol toSymbol() {
		return this;
	}

	public SubLSymbol typeOf() {
		if (this.isKeyword())
			return LispSymbols.KEYWORD;
		if (this == Lisp.T)
			return LispSymbols.BOOLEAN;
		return LispSymbols.SYMBOL;
	}

	public SubLObject typep(SubLObject type) {
		if (type == LispSymbols.SYMBOL)
			return Lisp.T;
		if (type == BuiltInClass.SYMBOL)
			return Lisp.T;
		if (type == LispSymbols.KEYWORD)
			return this.isKeyword() ? Lisp.T : Lisp.NIL;
		if (type == LispSymbols.BOOLEAN)
			return this == Lisp.T ? Lisp.T : Lisp.NIL;
		return super.typep(type);
	}

	private SubLObject undefinedFunction(SubLObject args)

	{
		return LispThread.currentThread().execute(LispSymbols.UNDEFINED_FUNCTION_CALLED, this, args);
	}

	public String writeToString() {
		String n = this.name.getString();
		LispThread thread = LispThread.currentThread();
		boolean printEscape = LispSymbols.PRINT_ESCAPE.symbolValue(thread) != Lisp.NIL;
		SubLObject printCase = LispSymbols.PRINT_CASE.symbolValue(thread);
		SubLObject readtableCase = ((Readtable) LispSymbols.CURRENT_READTABLE.symbolValue(thread)).getReadtableCase();
		boolean printReadably = LispSymbols.PRINT_READABLY.symbolValue(thread) != Lisp.NIL;
		if (printReadably)
			if (readtableCase != Keyword.UPCASE || printCase != Keyword.UPCASE) {
				StringBuilder sb = new StringBuilder();
				if (this.isKeyword())
					sb.append(':');
				else if (this.pkg instanceof SubLPackage) {
					sb.append(LispSymbolImpl.multipleEscape(((SubLPackage) this.pkg).getJavaName()));
					sb.append("::");
				} else
					sb.append("#:");
				sb.append(LispSymbolImpl.multipleEscape(n));
				return sb.toString();
			} else
				printEscape = true;
		if (!printEscape) {
			if (this.isKeyword()) {
				if (printCase == Keyword.DOWNCASE)
					return n.toLowerCase();
				if (printCase == Keyword.CAPITALIZE)
					return LispSymbolImpl.capitalize(n, readtableCase);
				return n;
			}
			// Printer escaping is disabled.
			if (readtableCase == Keyword.UPCASE) {
				if (printCase == Keyword.DOWNCASE)
					return n.toLowerCase();
				if (printCase == Keyword.CAPITALIZE)
					return LispSymbolImpl.capitalize(n, readtableCase);
				return n;
			} else if (readtableCase == Keyword.DOWNCASE) {
				// "When the readtable case is :DOWNCASE, uppercase characters
				// are printed in their own case, and lowercase characters are
				// printed in the case specified by *PRINT-CASE*." (22.1.3.3.2)
				if (printCase == Keyword.DOWNCASE)
					return n;
				if (printCase == Keyword.UPCASE)
					return n.toUpperCase();
				if (printCase == Keyword.CAPITALIZE)
					return LispSymbolImpl.capitalize(n, readtableCase);
				return n;
			} else if (readtableCase == Keyword.PRESERVE)
				return n;
			else // INVERT
				return LispSymbolImpl.invert(n);
		}
		// Printer escaping is enabled.
		boolean escapeSymbolName = LispSymbolImpl.needsEscape(n, readtableCase, thread);
		String symbolName = escapeSymbolName ? LispSymbolImpl.multipleEscape(n) : n;
		if (!escapeSymbolName)
			if (readtableCase == Keyword.PRESERVE) {
			} else if (readtableCase == Keyword.INVERT)
				symbolName = LispSymbolImpl.invert(symbolName);
			else if (printCase == Keyword.DOWNCASE)
				symbolName = symbolName.toLowerCase();
			else if (printCase == Keyword.UPCASE)
				symbolName = symbolName.toUpperCase();
			else if (printCase == Keyword.CAPITALIZE)
				symbolName = LispSymbolImpl.capitalize(symbolName, readtableCase);
		if (this.pkg == Lisp.NIL)
			if (printReadably || LispSymbols.PRINT_GENSYM.symbolValue(thread) != Lisp.NIL)
				return "#:".concat(symbolName);
			else
				return symbolName;
		if (this.isKeyword())
			return ":".concat(symbolName);
		// "Package prefixes are printed if necessary." (22.1.3.3.1)
		SubLPackage currentPackage = (SubLPackage) LispSymbols._PACKAGE_.symbolValue(thread);
		if (this.pkg == currentPackage)
			return symbolName;
		if (currentPackage != null && currentPackage.uses(this.pkg))
			// Check for name conflict in current package.
			if (currentPackage.findExternalSymbol(this.name) == null)
			if (currentPackage.findInternalSymbol(this.name) == null)
			if (((SubLPackage) this.pkg).findExternalSymbol(this.name) != null)
			return symbolName;
		// Has this symbol been imported into the current package?
		if (currentPackage.findExternalSymbol(this.name) == this)
			return symbolName;
		if (currentPackage.findInternalSymbol(this.name) == this)
			return symbolName;
		// Package prefix is necessary.
		String packageName = ((SubLPackage) this.pkg).getJavaName();
		boolean escapePackageName = LispSymbolImpl.needsEscape(packageName, readtableCase, thread);
		if (escapePackageName)
			packageName = LispSymbolImpl.multipleEscape(packageName);
		else if (readtableCase == Keyword.UPCASE) {
			if (printCase == Keyword.DOWNCASE)
				packageName = packageName.toLowerCase();
			else if (printCase == Keyword.CAPITALIZE)
				packageName = LispSymbolImpl.capitalize(packageName, readtableCase);
		} else if (readtableCase == Keyword.DOWNCASE) {
			if (printCase == Keyword.UPCASE)
				packageName = packageName.toUpperCase();
			else if (printCase == Keyword.CAPITALIZE)
				packageName = LispSymbolImpl.capitalize(packageName, readtableCase);
		} else if (readtableCase == Keyword.INVERT)
			packageName = LispSymbolImpl.invert(packageName);
		StringBuilder sb = new StringBuilder(packageName);
		if (((SubLPackage) this.pkg).findExternalSymbol(this.name) != null
				&& Lisp.DOUBLE_COLON_PACKAGE_SEPARATORS.symbolValue(thread) == Lisp.NIL)
			sb.append(':');
		else
			sb.append("::");
		sb.append(symbolName);
		return sb.toString();
	}
}
