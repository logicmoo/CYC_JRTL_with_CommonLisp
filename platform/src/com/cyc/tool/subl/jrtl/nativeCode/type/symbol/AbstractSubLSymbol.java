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

package com.cyc.tool.subl.jrtl.nativeCode.type.symbol;

import java.util.LinkedHashMap;
import java.util.Map;

import com.cyc.tool.subl.jrtl.nativeCode.commonLisp.LispSymbolImpl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLFixnum;
import com.cyc.tool.subl.jrtl.nativeCode.type.operator.SubLFunction;
import com.cyc.tool.subl.jrtl.nativeCode.type.operator.SubLOperator;
import com.cyc.tool.subl.jrtl.nativeCode.type.stream.SubLInputBinaryStream;
import com.cyc.tool.subl.jrtl.nativeCode.type.stream.SubLInputStream;
import com.cyc.tool.subl.jrtl.nativeCode.type.stream.SubLInputTextStream;
import com.cyc.tool.subl.jrtl.nativeCode.type.stream.SubLOutputBinaryStream;
import com.cyc.tool.subl.jrtl.nativeCode.type.stream.SubLOutputStream;
import com.cyc.tool.subl.jrtl.nativeCode.type.stream.SubLOutputTextStream;
import com.cyc.tool.subl.jrtl.nativeCode.type.stream.SubLStream;

public abstract class AbstractSubLSymbol extends LispSymbolImpl implements SubLSymbol {

	//// Constructors

	private static int MAX_CANONICALIZER_CACHE_SIZE = 5000;

	//// Public Area

	private static SubLString GENTEMP_PREFIX = SubLObjectFactory.makeString("T");

	private static SubLString GENSYM_PREFIX = SubLObjectFactory.makeString("G");

	// @note if this cache is to be used in multiple threads then a synchronized
	// version must be made -APB
	private static Map<String, String> symbolCanonicalizerCache = new LinkedHashMap<String, String>(
			AbstractSubLSymbol.MAX_CANONICALIZER_CACHE_SIZE + 1, .75F, true) {
		// This method is called just after a new entry has been added
		public boolean removeEldestEntry(Map.Entry eldest) {
			return this.size() > AbstractSubLSymbol.MAX_CANONICALIZER_CACHE_SIZE;
		}
	};

	private static char[] printableNonStandardSymbolChars = { '#', ':', ';', '|', '"', '\'', '`', ',', '(', ')', '\\' };

	/**
	 * this function strips symbol name quotes "|" when they are not necessary
	 * -- assumes that the name given is a valid symbol name in all other
	 * respects also deals with backslashes and adds "|" when necessary average
	 * case should be 2 passes and 1 memory alloc
	 */
	public static String canonicalizeName(String name) {
		String canonicalizedName = AbstractSubLSymbol.symbolCanonicalizerCache.get(name);
		if (canonicalizedName != null)
			return canonicalizedName;
		canonicalizedName = name;
		if (!AbstractSubLSymbol.doesSymbolNameNeedQuotes(canonicalizedName)) { // 1
																				// pass
			AbstractSubLSymbol.symbolCanonicalizerCache.put(name, canonicalizedName.toUpperCase()); // 1
			// pass
			// 1
			// mem
			return canonicalizedName;
		}
		boolean hasExplicitQuotes = canonicalizedName.charAt(0) == SubLSymbol.SYMBOL_NAME_QUOTE;
		boolean hasQuotes = hasExplicitQuotes;
		if (canonicalizedName.indexOf('\\') >= 0) { // 1 pass
			char[] origChars = canonicalizedName.toCharArray(); // 1 pass 1 mem
			char curChar = '\uFFFF', prevChar = '\uFFFF';
			int newSize = 0;
			for (int i = 0, size = origChars.length; i < size; i++) { // 1 pass
				curChar = origChars[i];
				if (prevChar != '\\')
					origChars[newSize++] = Character.toUpperCase(curChar);
				else {
					origChars[newSize - 1] = curChar;
					if (!AbstractSubLSymbol.isConstituentUpperCaseChar(curChar) && !hasQuotes)
						hasQuotes = true;
				}
				prevChar = curChar;
			}
			canonicalizedName = new String(origChars, 0, newSize); // 1 pass 1
																	// mem
		} else if (!hasExplicitQuotes)
			canonicalizedName = canonicalizedName.toUpperCase();
		if (hasQuotes && !hasExplicitQuotes)
			canonicalizedName = "|" + canonicalizedName + "|"; // 2 mem
		if (hasQuotes) {
			String innerName = canonicalizedName.substring(1, canonicalizedName.length() - 1);
			if (!AbstractSubLSymbol.doesSymbolNameNeedQuotes(innerName))
				canonicalizedName = innerName;
		}
		AbstractSubLSymbol.symbolCanonicalizerCache.put(name, canonicalizedName);
		return canonicalizedName; // 7 passes and 5 memory allocs
	}

	public static boolean doesSymbolNameNeedQuotes(String symbolName) {
		char curChar;
		for (int i = 0, size = symbolName.length(); i < size; i++) {
			curChar = symbolName.charAt(i);
			if (!AbstractSubLSymbol.isConstituentUpperCaseChar(curChar))
				return true;
		}
		return false;
	}

	public static SubLObject gensym(SubLObject val) {
		StringBuilder buf = new StringBuilder();
		if (val == SubLNil.NIL) {
			buf.append(AbstractSubLSymbol.GENSYM_PREFIX.getString());
			buf.append(Symbols.$gensym_counter$.getValue().intValue());
			Symbols.$gensym_counter$.setValue(Numbers.inc(Symbols.$gensym_counter$.getValue()));
		} else if (val.isString()) {
			buf.append(val.getString());
			buf.append(Symbols.$gensym_counter$.getValue().intValue());
			Symbols.$gensym_counter$.setValue(Numbers.inc(Symbols.$gensym_counter$.getValue()));
		} else if (val.isFixnum()) {
			buf.append(AbstractSubLSymbol.GENSYM_PREFIX.getString());
			buf.append(val.intValue());
			Symbols.$gensym_counter$.setValue(val);
		} else
			Errors.error("Invalid argument to gensym -- exptected " + "NIL, a string or a fixnum.\n Got: " + val + ".");
		SubLSymbol symbol = SubLObjectFactory.makeUninternedSymbol(buf.toString());
		return symbol;
	}

	public static synchronized SubLObject gentemp(SubLObject prefix, SubLPackage thePackage) {
		SubLString prefixTyped = prefix == SubLNil.NIL ? AbstractSubLSymbol.GENTEMP_PREFIX : prefix.toStr();
		int counterVal = Symbols.$gentemp_counter$.getValue().intValue();
		String pre = prefixTyped.getString();
		SubLSymbol symbol = null;
		String curSymbolName;
		do
			curSymbolName = pre + counterVal++;
		while (null != (symbol = thePackage.retrieveSymbol(curSymbolName)));
		Symbols.$gentemp_counter$.setValue(SubLObjectFactory.makeInteger(counterVal));
		return SubLObjectFactory.makeSymbol(curSymbolName, thePackage);
	}

	private static CharSequence getSymbolStringRep(String str, boolean isSpecial) {
		if (isSpecial)
			new StringBuilder(SubLSymbol.SYMBOL_NAME_QUOTE).append(str).append(SubLSymbol.SYMBOL_NAME_QUOTE).toString();
		return str;
	}

	public static boolean isConstituentChar(char curChar) {
		if (curChar <= ' ' || curChar >= '\u007F')
			return false;
		for (int j = 0, size2 = AbstractSubLSymbol.printableNonStandardSymbolChars.length; j < size2; j++)
			if (curChar == AbstractSubLSymbol.printableNonStandardSymbolChars[j])
				return false;
		return true;
	}

	public static boolean isConstituentUpperCaseChar(char curChar) {
		if (!AbstractSubLSymbol.isConstituentChar(curChar))
			return false;
		if (curChar >= 'a' && curChar <= 'z')
			return false;
		return true;
	}

	private int hashCode = -1;

	// @todo volatile is probably overkill here
	// @todo definitely don't need volatile for constants!!!
	

	private SubLPackage thePackage; // this should be volatile, but in general
									// it almost never changes so not doing so
									// for performance reasons

	private SubLString symbolName;

	private boolean isSpecialSymbolName = false;

	private boolean hasCheckedSymbolStatus = false;

	protected SubLOperator operator; // this should be volatile, but in general
										// it almost never changes so not doing
										// so
										// for performance reasons

	private SubLList plist = SubLNil.NIL; // all references to this should be
											// explicitly synchronized

	/**
	 * Creates a new instance of SubLSymbol. symbolName must already be
	 * canonicalized before calling this constructor SubLPackage are allowed to
	 * use this constructor.
	 */
	AbstractSubLSymbol(SubLString symbolName, SubLPackage thePackage) {
		super(symbolName, thePackage);
		this.thePackage = thePackage;
		this.symbolName = symbolName;
		this.hashCode = (thePackage == null ? 0 : thePackage.hashCode()) ^ symbolName.hashCode();
		if (thePackage != null && thePackage == SubLPackage.KEYWORD_PACKAGE && !this.isKeyword())
			// get
			// rid
			// of
			// this
			// test
			Errors.error("Got invalid keyword: '" + thePackage + ":" + symbolName + "'");
	}

	public boolean boundp() {
		return this.value != SubLSymbol.UNBOUND || this.thePackage == SubLPackage.KEYWORD_PACKAGE;
	}

	public boolean canFastHash() {
		return true;
	}

	public Object clone() {
		return this;
	}

	public boolean fboundp() {
		return this.operator != SubLSymbol.UNBOUND;
	}

	public void forceGlobalValue(SubLObject newValue) {
		this.value = newValue;
	}

	protected SubLSymbol getBindingType() {
		return CommonSymbols.LEXICAL;
	}

	public SubLFunction getFunc() {
		if (this.operator == SubLSymbol.UNBOUND)
			Errors.error(this + " is not fboundp.");
		return this.operator.getFunc();
	}

	public SubLOperator getFunction() {
		if (this.operator == SubLSymbol.UNBOUND)
			Errors.error(this + " is not fboundp.");
		return this.operator;
	}

	public String getName() {
		return this.symbolName.getString();
	}

	public SubLPackage getPackage() {
		return this.thePackage;
	}

	//// Protected Area

	/** this version will not contain outer symbol quotes ("|") */
	// @ToDo get rid of me --APB
	private CharSequence getPackageName() {
		return this.thePackage == null ? "#" : this.thePackage.getName();
	}

	//// Private Area

	/** this version will include "|" around name when needed */
	// @ToDo get rid of me --APB
	private CharSequence getPackageNamePrecise() {
		return this.getPackageName();
	}

	public SubLList getPlist() {
		synchronized (this.plist) {
			return this.plist;
		}
	}

	public SubLObject getProperty(SubLObject indicator) {
		synchronized (this.plist) {
			return this.plist.getf(indicator, null);
		}
	}

	public SubLStream getStream(boolean followSynonymStream) { // SubLStream
		return this.getValue().getStream(followSynonymStream);
	}

	public SubLString getSubLName() {
		return this.symbolName;
	}

	/** this version will not contain outer symbol quotes ("|") */
	// @ToDo get rid of me --APB
	private SubLString getSymbolName() {
		return (SubLString) AbstractSubLSymbol.getSymbolStringRep(this.getName(), this.isSpecialSymbol(this.getName()));
	}

	/* this version will include "|" aruond name when needed */
	// @ToDo get rid of me --APB
	private CharSequence getSymbolNamePrecise() {
		return AbstractSubLSymbol.getSymbolStringRep(this.getName(), this.isSpecialSymbol(this.getName()));
	}

	public SubLSymbol getType() {
		return Types.$dtp_symbol$;
	}

	public SubLFixnum getTypeCode() {
		return CommonSymbols.TWO_INTEGER;
	}

	public int hashCode(int currentDepth) {
		return this.hashCode;
	}

	abstract public boolean isDynamic();

	private boolean isSpecialSymbol(CharSequence str) {
		if (hasCheckedSymbolStatus) {
			return isSpecialSymbolName;
		}
		for (int i = 0, size = str.length(); i < size; ++i) {
			char curChar = str.charAt(i);
			if ((i == 0) && (curChar == '?')) {
				int j = 0;
			}
			if ((curChar == '#') || (curChar == '\"') || (curChar == '\'') || (curChar == '(') || (curChar == ')')
					|| (curChar == ',') || (curChar == ';') || (curChar == '\\') || (curChar == '`')) {
				boolean b = true;
				hasCheckedSymbolStatus = b;
				return isSpecialSymbolName = b;
			}
			if (Character.isWhitespace(curChar)) {
				boolean b2 = true;
				hasCheckedSymbolStatus = b2;
				return isSpecialSymbolName = b2;
			}
			if (Character.isLetter(curChar) && Character.isLowerCase(curChar)) {
				boolean b3 = true;
				hasCheckedSymbolStatus = b3;
				return isSpecialSymbolName = b3;
		}
		}
		hasCheckedSymbolStatus = true;
		return isSpecialSymbolName = false;
	}

	public SubLObject makeCopy() {
		return this;
	}

	public SubLObject makeDeepCopy() {
		return this;
	}

	public String possiblyToFullString() {
		SubLPackage pack = getPackage();
		if (pack == null)
			return getSymbolNamePrecise().toString();
		boolean isInPackage = SubLPackage.getCurrentPackage() == pack;
		boolean isExported = pack.isExported(this);
		if (!isInPackage)
			for (SubLList cur = SubLPackage.getCurrentPackage().getUsesPackagesList(); cur != SubLNil.NIL; cur = cur
					.rest().toList())
				if (cur.first().toPackage().isExported(this)) {
					isInPackage = true;
					isExported = true;
					break;
				}
		if (isInPackage)
			return getSymbolNamePrecise().toString();
		if (isExported)
			return getPackageNamePrecise() + ":" + getSymbolNamePrecise();
		return getPackageNamePrecise() + ":" + ":" + getSymbolNamePrecise();
	}

	public void removeProperty(SubLObject indicator) {
		SubLList thePlist = plist;
		synchronized (thePlist) {
			plist = thePlist.remf(indicator);
		}
	}

	public void setConstantValue(SubLObject value) {
		Errors.error("Can't set the value of a constant symbol: " + this);
	}

	public void setFunction(SubLOperator func) {
		this.operator = func;
	}

	public void setPackage(SubLPackage thePackage) {
		this.thePackage = thePackage;
	}

	public void setProperty(SubLObject indicator, SubLObject value) {
		synchronized (this.plist) {
			this.plist = this.plist.putf(indicator, value);
		}
	}

	public String toFullString() {
		return this.getPackageNamePrecise() + SubLSymbol.PACKAGE_SEPARATOR + this.getSymbolNamePrecise();
	}

	public SubLInputBinaryStream toInputBinaryStream() { // SubLStream
		return this.getStream(false).toInputBinaryStream();
	}

	public SubLInputStream toInputStream() { // SubLStream
		return this.getStream(false).toInputStream();
	}

	public SubLInputTextStream toInputTextStream() { // SubLStream
		return this.getStream(false).toInputTextStream();
	}

	public SubLOutputBinaryStream toOutputBinaryStream() { // SubLStream
		return this.getStream(false).toOutputBinaryStream();
	}

	public SubLOutputStream toOutputStream() { // SubLStream
		return this.getStream(false).toOutputStream();
	}

	public SubLOutputTextStream toOutputTextStream() { // SubLStream
		return this.getStream(false).toOutputTextStream();
	}

	public String toString() {
		if (this.isKeyword())
			return SubLSymbol.PACKAGE_SEPARATOR + this.getSymbolNamePrecise();
		SubLPackage thePackage = null;
		try {
			thePackage = SubLPackage.getCurrentPackage();
		} catch (Exception e) {
			return this.getPackageNamePrecise() + ":" + this.getSymbolNamePrecise();
		}
		if (thePackage == null)
			return "#:" + this.getSymbolNamePrecise();
		else if (thePackage.retrieveSymbol(this.getName()) == null)
			return this.getPackageNamePrecise() + ":" + this.getSymbolNamePrecise();
		return this.getSymbolNamePrecise().toString();
	}

}
