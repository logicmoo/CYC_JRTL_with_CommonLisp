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


import static com.cyc.tool.subl.jrtl.nativeCode.commonLisp.Lisp.*;
import static com.cyc.tool.subl.jrtl.nativeCode.commonLisp.LispObjectFactory.*;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLPackage;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;

public class LispSymbolImpl extends AbstractLispObject implements SubLSymbol
{
  public boolean isKeyword() {
		return pkg == PACKAGE_KEYWORD;
	}
  
  @Override
  public SubLSymbol toSymbol() {
  	return this;
  }
  
  @Override
  public boolean isSymbol() {
  	return true;
  }
  
  // Bit flags.
  private static final int FLAG_SPECIAL           = 0x0001;
  private static final int FLAG_CONSTANT          = 0x0002;
  private static final int FLAG_BUILT_IN_FUNCTION = 0x0004;

  public static final SubLSymbol addFunction(String name, SubLObject obj)
  {
  	LispSymbolImpl symbol = (LispSymbolImpl)PACKAGE_CL.internAndExport(name);
    symbol.function = obj;
    return symbol;
  }

  public final SubLString name;
  private int hash = -1;

  /** To be accessed by LispThread only:
   * used to find the index in the LispThread.specials array
   */  
  private int specialIndex = LispThread.UNASSIGNED_SPECIAL_INDEX;
  private SubLObject pkg; // Either a package object or NIL.
  private SubLObject value;
  private SubLObject function;
  private SubLObject propertyList;
  public boolean neverInline = false;
  public boolean hasInlined = false;
  private int flags;

  // Construct an uninterned symbol.
  public LispSymbolImpl(String s)
  {
    name = makeString(s);
    pkg = NIL;
  }

  public LispSymbolImpl(SubLString string)
  {
    name = string;
    pkg = NIL;
  }

  public LispSymbolImpl(String s, SubLPackage pkg)
  {
    name = makeString(s);
    this.pkg = pkg;
  }

  public LispSymbolImpl(SubLString string, SubLPackage pkg)
  {
    name = string;
    this.pkg = pkg;
  }

  public LispSymbolImpl(SubLString string, int hash, SubLPackage pkg)
  {
    name = string;
    this.hash = hash;
    this.pkg = pkg;
  }

  @Override
  public SubLSymbol typeOf()
  {
    if (isKeyword())
      return LispSymbols.KEYWORD;
    if (this == T)
      return LispSymbols.BOOLEAN;
    return LispSymbols.SYMBOL;
  }

  @Override
  public SubLObject classOf()
  {
    return BuiltInClass.SYMBOL;
  }

  @Override
  public SubLObject getDescription()
  {
    final LispThread thread = LispThread.currentThread();
    final SpecialBindingsMark mark = thread.markSpecialBindings();
    thread.bindSpecial(LispSymbols.PRINT_ESCAPE, NIL);
    try
      {
        StringBuilder sb = new StringBuilder("The symbol ");
        sb.append(name.writeToString());
        sb.append(" at #x");
        sb.append(Integer.toHexString(System.identityHashCode(this)).toUpperCase());
        if (pkg instanceof SubLPackage)
          {
            sb.append(", an ");
            SubLSymbol sym = ((SubLPackage)pkg).findExternalSymbol(name);
            sb.append(sym == this ? "external" : "internal");
            sb.append(" symbol in the ");
            sb.append(((SubLPackage)pkg).getJavaName());
            sb.append(" package");
          }
        return makeString(sb);
      }
    finally
      {
        thread.resetSpecialBindings(mark);
      }
  }

  @Override
  public SubLObject getParts()
  {
    SubLObject parts = NIL;
    parts = parts.push(makeCons("name", name));
    parts = parts.push(makeCons("package", pkg));
    parts = parts.push(makeCons("value", value));
    parts = parts.push(makeCons("function", function));
    parts = parts.push(makeCons("plist", propertyList));
    parts = parts.push(makeCons("flags", LispObjectFactory.makeInteger(flags)));
    parts = parts.push(makeCons("hash", LispObjectFactory.makeInteger(hash)));
    return parts.nreverse();
  }

  @Override
  public SubLObject typep(SubLObject type)
  {
    if (type == LispSymbols.SYMBOL)
      return T;
    if (type == BuiltInClass.SYMBOL)
      return T;
    if (type == LispSymbols.KEYWORD)
      return isKeyword() ? T : NIL;
    if (type == LispSymbols.BOOLEAN)
      return this == T ? T : NIL;
    return super.typep(type);
  }

  @Override
  public final SubLObject SYMBOLP()
  {
    return T;
  }

  @Override
  public boolean constantp()
  {
    return (flags & FLAG_CONSTANT) != 0;
  }

  @Override
  public final SubLObject STRING()
  {
    return name;
  }

  public final SubLObject getLispPackage()
  {
    return pkg;
  }

  public final void setLispPackage(SubLObject obj)
  {
    pkg = obj;
  }

  @Override
  public final boolean isSpecialOperator()
  {
    return (function instanceof SpecialOperator);
  }

  @Override
  public final boolean isSpecialVariable()
  {
    return (flags & FLAG_SPECIAL) != 0;
  }

  public final void setSpecial(boolean b)
  {
    if (b)
      flags |= FLAG_SPECIAL;
    else
      flags &= ~FLAG_SPECIAL;
  }

  public final void initializeSpecial(SubLObject value)
  {
    flags |= FLAG_SPECIAL;
    this.value = value;
  }

  public final boolean isConstant()
  {
    return (flags & FLAG_CONSTANT) != 0;
  }

  public final void initializeConstant(SubLObject value)
  {
    flags |= (FLAG_SPECIAL | FLAG_CONSTANT);
    this.value = value;
  }

  public final boolean isBuiltInFunction()
  {
    return (flags & FLAG_BUILT_IN_FUNCTION) != 0;
  }

  public final void setBuiltInFunction(boolean b)
  {
    if (b)
      flags |= FLAG_BUILT_IN_FUNCTION;
    else
      flags &= ~FLAG_BUILT_IN_FUNCTION;
  }

  public final String getJavaSymbolName()
  {
    return name.getString();
  }
  public SubLString getSubLName()
  {
    return name;
  }

  public final String getQualifiedName()
  {
    final String n = name.getString();
    if (pkg == NIL)
      return("#:".concat(n));
    if (isKeyword())
      return ":".concat(n);
    StringBuilder sb = new StringBuilder(((SubLPackage)pkg).getJavaName());
    if (((SubLPackage)pkg).findExternalSymbol(name) != null)
      sb.append(':');
    else
      sb.append("::");
    sb.append(n);
    return sb.toString();
  }

  @Override
  public String toString() {
      return getQualifiedName();
  }

  /** Gets the value associated with the symbol
   * as set by SYMBOL-VALUE.
   *
   * @return The associated value, or null if unbound.
   *
   * @see SubLSymbol#symbolValue
   */
  @Override
  public SubLObject getSymbolValue()
  {
    return value;
  }

  /** Sets the value associated with the symbol
   * as if set by SYMBOL-VALUE.
   *
   * @return The associated value, or null if unbound.
   *
   * @see SubLSymbol#symbolValue
   */
  public final void setSymbolValue(SubLObject value)
  {
    this.value = value;
  }

  /** Returns the value associated with this symbol in the current
   * thread context when it is treated as a special variable.
   *
   * A lisp error is thrown if the symbol is unbound.
   *
   * @return The associated value
   *
   * @see LispThread#lookupSpecial
   * @see SubLSymbol#getSymbolValue()
   *
   */
  public final SubLObject symbolValue()
  {
    return symbolValue(LispThread.currentThread());
  }

  /** Returns the value associated with this symbol in the specified
   * thread context when it is treated as a special variable.
   *
   * A lisp error is thrown if the symbol is unbound.
   *
   * @return The associated value
   *
   * @see LispThread#lookupSpecial
   * @see SubLSymbol#getSymbolValue()
   *
   */
  public final SubLObject symbolValue(LispThread thread)
  {
    SubLObject val = thread.lookupSpecial(this);
    if (val != null)
      return val;
    if (value != null)
      return value;
    return error(new UnboundVariable(this));
  }

  /** Returns the value of the symbol in the current thread context;
   * if the symbol has been declared special, the value of the innermost
   * binding is returned. Otherwise, the SYMBOL-VALUE is returned, or
   * null if unbound.
   *
   * @return A lisp object, or null if unbound
   *
   * @see LispThread#lookupSpecial
   * @see SubLSymbol#getSymbolValue()
   *
   */
  public final SubLObject symbolValueNoThrow()
  {
    return symbolValueNoThrow(LispThread.currentThread());
  }

  /** Returns the value of the symbol in the current thread context;
   * if the symbol has been declared special, the value of the innermost
   * binding is returned. Otherwise, the SYMBOL-VALUE is returned, or
   * null if unbound.
   *
   * @return A lisp object, or null if unbound
   *
   * @see LispThread#lookupSpecial
   * @see SubLSymbol#getSymbolValue()
   *
   */
  public final SubLObject symbolValueNoThrow(LispThread thread)
  {
    if ((flags & FLAG_SPECIAL) != 0)
      {
        SubLObject val = thread.lookupSpecial(this);
        if (val != null)
          return val;
      }
    return value;
  }

  @Override
  public SubLObject getSymbolFunction()
  {
    return function;
  }

  @Override
  public final SubLObject getSymbolFunctionOrDie()
  {
    if (function == null)
      return error(new UndefinedFunction(this));
    if (function instanceof Autoload)
      {
        Autoload autoload = (Autoload) function;
        autoload.load();
      }
    return function;
  }

  public final SubLObject getSymbolSetfFunctionOrDie()

  {
    SubLObject obj = Lisp.get(this, LispSymbols.SETF_FUNCTION, null);
    if (obj == null)
      error(new UndefinedFunction(list(Keyword.NAME,
                                         list(LispSymbols.SETF,
                                               this))));
    return obj;
  }

  public final void setSymbolFunction(SubLObject obj)
  {
  	if (this.function==obj) return;
  	if (obj instanceof JavaPrimitive) {
  		this.function = obj;
  		return;
  	}
		if (obj == null) {
			//fmkunbound
			setNeverInline();
			this.function = obj;
			return;
		}
		if (obj instanceof SpecialOperator) {
			setNeverInline();
			this.function = obj;
			return;
		}
		if (obj instanceof CompiledClosure) {
			setNeverInline();
			this.function = obj;
			return;
		}
		if (obj instanceof MacroObject) {
			MacroObject aobj = (MacroObject) obj;
			setNeverInline();
			this.function = obj;
			return;
		}
	SubLObject plist = obj.getPropertyList();
	if (plist==NIL) {
		if (obj==T) {
			//wierd?
  		setNeverInline();
  		this.function = obj;
  		return;
		}
		this.function = obj;
		return;
	}
	if (plist!=null) {
	SubLObject bytes = Lisp.getf(plist,LispSymbols.CLASS_BYTES,NIL);
	if (bytes instanceof JavaObject || bytes==T) {
		setNeverInline();
		this.function = obj;
		return;  		
	}
	}
  	if (this.function instanceof JavaPrimitive) {
  		setNeverInline();
  		this.function = obj;  		
  		return;
  	}
//
//  	if (this.function instanceof Autoload) {
//  		this.function = obj;
//  		return;
//  	}
//  	if (obj instanceof Autoload) {
//  		Autoload aobj = (Autoload)obj;
//  		if (aobj.fileName!=null) {
//  			setNeverInline();
//  		}
//  		this.function = obj;
//  		return;
//  	}
//  	if (obj instanceof Closure) {
//  		Closure aobj = (Closure)obj;
//  		setNeverInline();
//  		this.function = obj;
//  		return;
//  	}

//  	if (obj instanceof AutoloadedFunctionProxy) {
//  		AutoloadedFunctionProxy aobj = (AutoloadedFunctionProxy)obj;
//  		setNeverInline();
//  		this.function = obj;
//  		return;
//  	}  	
//  	if (obj instanceof ReaderMacroFunction || this.function instanceof ReaderMacroFunction
//  			||obj instanceof DispatchMacroFunction || this.function instanceof DispatchMacroFunction
//  			) {
//  		setNeverInline();
//  		this.function = obj;
//  		return;
//  	}
//  	

//

//		Class claz = obj.getClass();
//  	if (this.function==null||this.function==NIL) {
//
//  		claz = claz.getDeclaringClass();
//  		if (claz==null) {
//    		setNeverInline();
//    		this.function = obj;
//    		return;
//  		}
//  		this.function = obj;
//  		return;
//  	}
//  	claz = claz.getSuperclass();
		this.function = obj;
  }

  private void setNeverInline() {
  	if (this.function instanceof JavaPrimitive) {
  		InlinedPrimitiveRegistry.debugInline(";; Removing inlineability for " + this);
  	}
  	if (hasInlined) {
  		throw new Error("setNeverInline " + this);
  	}
  	neverInline = true;
	}

	/** See LispObject.getStringValue() */
  @Override
  public String getString()
  {
    return name.getString();
  }

  @Override
  public final SubLObject getPropertyList()
  {
    if (propertyList == null)
      propertyList = NIL;
    return propertyList;
  }

  @Override
  public final void setPropertyList(SubLObject obj)
  {
    if (obj == null)
      throw new NullPointerException();
    propertyList = obj;
  }

  @Override
  public String writeToString()
  {
    final String n = name.getString();
    final LispThread thread = LispThread.currentThread();
    boolean printEscape = (LispSymbols.PRINT_ESCAPE.symbolValue(thread) != NIL);
    SubLObject printCase = LispSymbols.PRINT_CASE.symbolValue(thread);
    final SubLObject readtableCase =
      ((Readtable)LispSymbols.CURRENT_READTABLE.symbolValue(thread)).getReadtableCase();
    boolean printReadably = (LispSymbols.PRINT_READABLY.symbolValue(thread) != NIL);
    if (printReadably)
      {
        if (readtableCase != Keyword.UPCASE ||
            printCase != Keyword.UPCASE)
          {
            StringBuilder sb = new StringBuilder();
            if (isKeyword())
              {
                sb.append(':');
              }
            else if (pkg instanceof SubLPackage)
              {
                sb.append(multipleEscape(((SubLPackage)pkg).getJavaName()));
                sb.append("::");
              }
            else
              {
                sb.append("#:");
              }
            sb.append(multipleEscape(n));
            return sb.toString();
          }
        else
          printEscape = true;
      }
    if (!printEscape)
      {
        if (isKeyword())
          {
            if (printCase == Keyword.DOWNCASE)
              return n.toLowerCase();
            if (printCase == Keyword.CAPITALIZE)
              return capitalize(n, readtableCase);
            return n;
          }
        // Printer escaping is disabled.
        if (readtableCase == Keyword.UPCASE)
          {
            if (printCase == Keyword.DOWNCASE)
              return n.toLowerCase();
            if (printCase == Keyword.CAPITALIZE)
              return capitalize(n, readtableCase);
            return n;
          }
        else if (readtableCase == Keyword.DOWNCASE)
          {
            // "When the readtable case is :DOWNCASE, uppercase characters
            // are printed in their own case, and lowercase characters are
            // printed in the case specified by *PRINT-CASE*." (22.1.3.3.2)
            if (printCase == Keyword.DOWNCASE)
              return n;
            if (printCase == Keyword.UPCASE)
              return n.toUpperCase();
            if (printCase == Keyword.CAPITALIZE)
              return capitalize(n, readtableCase);
            return n;
          }
        else if (readtableCase == Keyword.PRESERVE)
          {
            return n;
          }
        else // INVERT
          return invert(n);
      }
    // Printer escaping is enabled.
    final boolean escapeSymbolName = needsEscape(n, readtableCase, thread);
    String symbolName = escapeSymbolName ? multipleEscape(n) : n;
    if (!escapeSymbolName)
      {
        if (readtableCase == Keyword.PRESERVE) { }
        else if (readtableCase == Keyword.INVERT)
          symbolName = invert(symbolName);
        else if (printCase == Keyword.DOWNCASE)
          symbolName = symbolName.toLowerCase();
        else if (printCase == Keyword.UPCASE)
          symbolName = symbolName.toUpperCase();
        else if (printCase == Keyword.CAPITALIZE)
          symbolName = capitalize(symbolName, readtableCase);
      }
    if (pkg == NIL)
      {
        if (printReadably || LispSymbols.PRINT_GENSYM.symbolValue(thread) != NIL)
          return "#:".concat(symbolName);
        else
          return symbolName;
      }
    if (isKeyword())
      return ":".concat(symbolName);
    // "Package prefixes are printed if necessary." (22.1.3.3.1)
    final SubLPackage currentPackage = (SubLPackage) LispSymbols._PACKAGE_.symbolValue(thread);
    if (pkg == currentPackage)
      return symbolName;
    if (currentPackage != null && currentPackage.uses(pkg))
      {
        // Check for name conflict in current package.
        if (currentPackage.findExternalSymbol(name) == null)
          if (currentPackage.findInternalSymbol(name) == null)
            if (((SubLPackage)pkg).findExternalSymbol(name) != null)
              return symbolName;
      }
    // Has this symbol been imported into the current package?
    if (currentPackage.findExternalSymbol(name) == this)
      return symbolName;
    if (currentPackage.findInternalSymbol(name) == this)
      return symbolName;
    // Package prefix is necessary.
    String packageName = ((SubLPackage)pkg).getJavaName();
    final boolean escapePackageName = needsEscape(packageName, readtableCase, thread);
    if (escapePackageName)
      {
        packageName = multipleEscape(packageName);
      }
    else
      {
        if (readtableCase == Keyword.UPCASE)
          {
            if (printCase == Keyword.DOWNCASE)
              packageName = packageName.toLowerCase();
            else if (printCase == Keyword.CAPITALIZE)
              packageName = capitalize(packageName, readtableCase);
          }
        else if (readtableCase == Keyword.DOWNCASE)
          {
            if (printCase == Keyword.UPCASE)
              packageName = packageName.toUpperCase();
            else if (printCase == Keyword.CAPITALIZE)
              packageName = capitalize(packageName, readtableCase);
          }
        else if (readtableCase == Keyword.INVERT)
          {
            packageName = invert(packageName);
          }
      }
    StringBuilder sb = new StringBuilder(packageName);
    if (((SubLPackage)pkg).findExternalSymbol(name) != null
        && DOUBLE_COLON_PACKAGE_SEPARATORS.symbolValue(thread) == NIL)
      sb.append(':');
    else
      sb.append("::");
    sb.append(symbolName);
    return sb.toString();
  }

	private static final String invert(String s)
  {
    // "When the readtable case is :INVERT, the case of all alphabetic
    // characters in single case symbol names is inverted. Mixed-case
    // symbol names are printed as is." (22.1.3.3.2)
    final int limit = s.length();
    final int LOWER = 1;
    final int UPPER = 2;
    int state = 0;
    for (int i = 0; i < limit; i++)
      {
        char c = s.charAt(i);
        if (Character.isUpperCase(c))
          {
            if (state == LOWER)
              return s; // Mixed case.
            state = UPPER;
          }
        if (Character.isLowerCase(c))
          {
            if (state == UPPER)
              return s; // Mixed case.
            state = LOWER;
          }
      }
    StringBuilder sb = new StringBuilder(limit);
    for (int i = 0; i < limit; i++)
      {
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

  private static final boolean needsEscape(String s,
                                           SubLObject readtableCase,
                                           LispThread thread)

  {
    boolean escape = false;
    final int length = s.length();
    if (length == 0)
      return true;
    if (s.charAt(0) == '#')
      return true;
    int radix;
    SubLObject printBaseBinding = LispSymbols.PRINT_BASE.symbolValue(thread); 
    if (printBaseBinding instanceof Fixnum)
      {
        radix = ((Fixnum)printBaseBinding).value;
      }
    else
      {
        error(new TypeError("The value of *PRINT-BASE* is not of type (INTEGER 2 36)."));
        // Not reached.
        return false;
      }
    if (radix < 2 || radix > 36)
      {
        error(new TypeError("The value of *PRINT-BASE* is not of type (INTEGER 2 36)."));
        // Not reached.
        return false;
      }
    boolean seenNonDigit = false;
    for (int i = length; i-- > 0;)
      {
        char c = s.charAt(i);
        if ("(),|\\`'\";:".indexOf(c) >= 0)
          return true;
        if (Character.isWhitespace(c))
          return true;
        if (readtableCase == Keyword.UPCASE)
          {
            if (Character.isLowerCase(c))
              return true;
          }
        else if (readtableCase == Keyword.DOWNCASE)
          {
            if (Character.isUpperCase(c))
              return true;
          }
        if (!escape && !seenNonDigit)
          {
            if (Character.digit(c, radix) < 0)
              seenNonDigit = true;
          }
      }
    if (!seenNonDigit)
      return true;
    if (s.charAt(0) == '.')
      {
        boolean allDots = true;
        for (int i = length; i-- > 1;)
          {
            if (s.charAt(i) != '.')
              {
                allDots = false;
                break;
              }
          }
        if (allDots)
          return true;
      }
    return false;
  }

  private static final String multipleEscape(String s)
  {
    StringBuilder sb = new StringBuilder("|");
    final int limit = s.length();
    for (int i = 0; i < limit; i++)
      {
        char c = s.charAt(i);
        if (c == '|' || c == '\\')
          sb.append('\\');
        sb.append(c);
      }
    sb.append('|');
    return sb.toString();
  }

  private static final String capitalize(String s, SubLObject readtableCase)
  {
    if (readtableCase == Keyword.INVERT || readtableCase == Keyword.PRESERVE)
      return s;
    final int limit = s.length();
    StringBuilder sb = new StringBuilder(limit);
    boolean lastCharWasAlphanumeric = false;
    for (int i = 0; i < limit; i++)
      {
        char c = s.charAt(i);
        if (Character.isLowerCase(c))
          {
            if (readtableCase == Keyword.UPCASE)
              sb.append(c);
            else // DOWNCASE
              sb.append(lastCharWasAlphanumeric ? c : CharacterFunctions.toUpperCase(c));
            lastCharWasAlphanumeric = true;
          }
        else if (Character.isUpperCase(c))
          {
            if (readtableCase == Keyword.UPCASE)
              sb.append(lastCharWasAlphanumeric ? CharacterFunctions.toLowerCase(c) : c);
            else // DOWNCASE
              sb.append(c);
            lastCharWasAlphanumeric = true;
          }
        else
          {
            sb.append(c);
            lastCharWasAlphanumeric = Character.isDigit(c);
          }
      }
    return sb.toString();
  }

  @Override
  public final int sxhash()
  {
    int h = hash;
    if (h < 0)
      {
        h = name.sxhash();
        hash = h;
      }
    return h;
  }

  @Override
  final public SubLObject execute()
  {
    SubLObject fun;
    if ((fun = function) == null)
        return undefinedFunction(NIL);

    return fun.execute();
  }

  @Override
  final public SubLObject execute(SubLObject arg)
  {
    SubLObject fun;
    if ((fun = function) == null)
        return undefinedFunction(list(arg));

    return fun.execute(arg);
  }

  @Override
  final public SubLObject execute(SubLObject first, SubLObject second)

  {
    SubLObject fun;
    if ((fun = function) == null)
        return undefinedFunction(list(first, second));

    return fun.execute(first, second);
  }

  @Override
  final public SubLObject execute(SubLObject first, SubLObject second,
                            SubLObject third)

  {
    SubLObject fun;
    if ((fun = function) == null)
        return undefinedFunction(list(first, second, third));

    return fun.execute(first, second, third);
  }

  @Override
  final public SubLObject execute(SubLObject first, SubLObject second,
                            SubLObject third, SubLObject fourth)

  {
    SubLObject fun;
    if ((fun = function) == null)
        return undefinedFunction(list(first, second, third, fourth));

    return fun.execute(first, second, third, fourth);
  }

  @Override
  final public SubLObject execute(SubLObject first, SubLObject second,
                            SubLObject third, SubLObject fourth,
                            SubLObject fifth)

  {
    SubLObject fun;
    if ((fun = function) == null)
        return undefinedFunction(list(first, second, third, fourth,
                                      fifth));

    return fun.execute(first, second, third, fourth,
                       fifth);
  }

  @Override
  final public SubLObject execute(SubLObject first, SubLObject second,
                            SubLObject third, SubLObject fourth,
                            SubLObject fifth, SubLObject sixth)

  {
    SubLObject fun;
    if ((fun = function) == null)
        return undefinedFunction(list(first, second, third, fourth,
                                      fifth, sixth));

    return fun.execute(first, second, third, fourth,
                       fifth, sixth);
  }

  @Override
  final public SubLObject execute(SubLObject first, SubLObject second,
                            SubLObject third, SubLObject fourth,
                            SubLObject fifth, SubLObject sixth,
                            SubLObject seventh)

  {
    SubLObject fun;
    if ((fun = function) == null)
        return undefinedFunction(list(first, second, third, fourth,
                                      fifth, sixth, seventh));

    return fun.execute(first, second, third, fourth,
                       fifth, sixth, seventh);
  }

  @Override
  final public SubLObject execute(SubLObject first, SubLObject second,
                            SubLObject third, SubLObject fourth,
                            SubLObject fifth, SubLObject sixth,
                            SubLObject seventh, SubLObject eighth)

  {
    SubLObject fun;
    if ((fun = function) == null)
        return undefinedFunction(list(first, second, third, fourth,
                                      fifth, sixth, seventh, eighth));

    return fun.execute(first, second, third, fourth,
                       fifth, sixth, seventh, eighth);
  }

  @Override
  final public SubLObject execute(SubLObject[] args)
  {
    SubLObject fun;
    if ((fun = function) == null) {
        SubLObject list = NIL;
        for (int i = args.length; i-- > 0;)
          list = makeCons(args[i], list);
        return undefinedFunction(list);
    }

    return fun.execute(args);
  }

  private final SubLObject undefinedFunction(SubLObject args)

  {
    return LispThread.currentThread().execute(LispSymbols.UNDEFINED_FUNCTION_CALLED,
                                              this, args);
  }

  @Override
  public void incrementCallCount(int n)
  {
    if (function != null)
      function.incrementCallCount(n);
    else super.incrementCallCount(n);
  }
  
  public SubLObject getCallCount() {
  	//(prof:show-call-count-arities 'EQL 0)
  	//(prof:show-call-count-arities 'MEMBER 0)
  	try {
  	SubLObject CC = function_info.coerce_function(makeCons(this,NIL), new Environment(), true);
  	if (CC!=NIL) return CC.getCallCount();
    return super.getCallCount();
  	} catch (Throwable e) {
    	try {
        if (function != null)
          function.getCallCount();
        return super.getCallCount();
      	} catch (Throwable e2) {
    			// TODO: handle exception
      		return NIL;
    		}
		}
  }

  @Override
  public void incrementHotCount()
  {
    if (function != null)
      function.incrementHotCount();
  }

	public int getSpecialIndex() {
		return specialIndex;
	}

	public void setSpecialIndex(int specialIndex) {
		this.specialIndex = specialIndex;
	}

	@Override
	public String getName() {
		return getJavaSymbolName();
	}
}
