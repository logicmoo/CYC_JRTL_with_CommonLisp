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

package com.cyc.tool.subl.jrtl.nativeCode.type.core;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLFixnum;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;

public class SubLRegexPattern extends AbstractSubLObject implements SubLObject, CommonSymbols {

	public static String REGEX_PATTERN_NAME = "REGEX-PATTERN";

	//// Constructors

	// @Note These are really defined in regular-expressions.lisp.
	private static int REGEX_COMPOPT_ANCHORED = 0x0010;

	//// Public Area

	private static int REGEX_COMPOPT_CASELESS = 0x0001;

	private static int REGEX_COMPOPT_DOLLAR_END_ONLY = 0x0020;

	private static int REGEX_COMPOPT_DOTALL = 0x0004;

	private static int REGEX_COMPOPT_EXTEND = 0x0008;

	private static int REGEX_COMPOPT_MULTILINE = 0x0002;

	private static int REGEX_COMPOPT_EXTRA = 0x0040;

	private static int REGEX_COMPOPT_UNGREEDY = 0x0200;

	private static int REGEX_COMPOPT_UTF8 = 0x0800;

	private static int REGEX_COMPOPT_NO_AUTO_CAPTURE = 0x1000;

	private static int REGEX_COMPOPT_NO_UTF8_CHECK = 0x2000;

	private String patternStr;

	private Pattern pattern;

	private Matcher matcher;

	/** Creates a new instance of SubLProcess. */
	public SubLRegexPattern(String patternStr, int options) {
		int newOptions = 0;
		if ((options & SubLRegexPattern.REGEX_COMPOPT_ANCHORED) != 0)
			Errors.error("*regex-comopt-anchored* is not supported.");
		if ((options & SubLRegexPattern.REGEX_COMPOPT_CASELESS) != 0)
			newOptions = newOptions | Pattern.CASE_INSENSITIVE;
		if ((options & SubLRegexPattern.REGEX_COMPOPT_DOLLAR_END_ONLY) != 0)
			Errors.error("*regex-compopt-dollar-endonly* is not supported.");
		if ((options & SubLRegexPattern.REGEX_COMPOPT_DOTALL) != 0)
			newOptions = newOptions | Pattern.DOTALL;
		if ((options & SubLRegexPattern.REGEX_COMPOPT_EXTEND) != 0)
			newOptions = newOptions | Pattern.COMMENTS;
		if ((options & SubLRegexPattern.REGEX_COMPOPT_MULTILINE) != 0)
			newOptions = newOptions | Pattern.MULTILINE;
		if ((options & SubLRegexPattern.REGEX_COMPOPT_EXTRA) != 0)
			Errors.error("*regex-compopt-extra* is not supported.");
		if ((options & SubLRegexPattern.REGEX_COMPOPT_UNGREEDY) != 0)
			Errors.error("*regex-compopt-ungreedy* is not supported.");
		if ((options & SubLRegexPattern.REGEX_COMPOPT_UTF8) != 0)
			; // ignore
		if ((options & SubLRegexPattern.REGEX_COMPOPT_NO_AUTO_CAPTURE) != 0)
			Errors.error("*regex-compopt-no-auto-capture* is not supported.");
		if ((options & SubLRegexPattern.REGEX_COMPOPT_NO_UTF8_CHECK) != 0)
			Errors.error("*regex-compopt-no-utf8-check* is not supported.");
		this.patternStr = patternStr;
		this.pattern = Pattern.compile(patternStr, newOptions);
		this.matcher = this.pattern.matcher("");
	}

	public boolean canFastHash() {
		return true;
	}

	public ArrayList<String> getAllMatches(CharSequence str, int options, int maxNumMatches) {
		if (options != 0)
			Errors.error("No options supported on regex match under this implementation.");
		this.matcher.reset(str);
		ArrayList<String> result = new ArrayList<String>();
		int nFound = 0;
		while (nFound < maxNumMatches && this.matcher.find()) {
			int start = this.matcher.start();
			int end = this.matcher.end();
			result.add(str.subSequence(start, end).toString());
			nFound++;
			for (int i = 1, size = this.matcher.groupCount(); i <= size && nFound < maxNumMatches; i++) {
				start = this.matcher.start(i);
				end = this.matcher.end(i);
				result.add(str.subSequence(start, end).toString());
				nFound++;
			}
		}
		return result;
	}

	public ArrayList<Integer> getAllMatchesOffsets(CharSequence str, int options, int maxNumMatches) {
		if (options != 0)
			Errors.error("No options supported on regex match under this implementation.");
		this.matcher.reset(str);
		ArrayList<Integer> result = new ArrayList<Integer>();
		int nFound = 0;
		while (nFound < maxNumMatches && this.matcher.find()) {
			int start = this.matcher.start();
			int end = this.matcher.end();
			result.add(new Integer(start));
			result.add(new Integer(end));
			nFound++;
			for (int i = 1, size = this.matcher.groupCount(); i <= size && nFound < maxNumMatches; i++) {
				start = this.matcher.start(i);
				end = this.matcher.end(i);
				result.add(new Integer(start));
				result.add(new Integer(end));
				nFound++;
			}
		}
		return result;
	}

	public SubLSymbol getType() {
		return Types.$dtp_alien$; // @hack to minimize Java/C differences
	}

	public SubLFixnum getTypeCode() {
		return CommonSymbols.THIRTEEN_INTEGER; // @hack to minimize Java/C
												// differences
	}

	public int hashCode(int depth) {
		return super.superHash();
	}

	public boolean isAlien() {
		return false;
	}

	public boolean isAtom() {
		return true;
	}

	public boolean isBigIntegerBignum() {
		return false;
	}

	public boolean isBignum() {
		return false;
	}

	public boolean isBoolean() {
		return false;
	}

	public boolean isChar() {
		return false;
	}

	public boolean isCons() {
		return false;
	}

	public boolean isDouble() {
		return false;
	}

	public boolean isEnvironment() {
		return false;
	}

	public boolean isError() {
		return false;
	}

	public boolean isFixnum() {
		return false;
	}

	public boolean isFunction() {
		return false;
	}

	public boolean isFunctionSpec() {
		return false;
	}

	public boolean isGuid() {
		return false;
	}

	public boolean isHashtable() {
		return false;
	}

	public boolean isHashtableIterator() {
		return false;
	}

	public boolean isIntBignum() {
		return false;
	}

	public boolean isInteger() {
		return false;
	}

	public boolean isKeyhash() {
		return false;
	}

	public boolean isKeyhashIterator() {
		return false;
	}

	public boolean isKeyword() {
		return false;
	}

	public boolean isList() {
		return false;
	}

	public boolean isLock() {
		return false;
	}

	public boolean isLongBignum() {
		return false;
	}

	public boolean isMacroOperator() {
		return false;
	}

	public boolean isNil() {
		return false;
	}

	public boolean isNumber() {
		return false;
	}

	public boolean isPackage() {
		return false;
	}

	//// Protected Area

	//// Private Area

	public boolean isProcess() {
		return false;
	}

	public boolean isReadWriteLock() {
		return false;
	}

	public boolean isRegexPattern() {
		return true;
	}

	public boolean isSemaphore() {
		return false;
	}

	public boolean isSequence() {
		return false;
	}

	public boolean isStream() {
		return false;
	}

	public boolean isString() {
		return false;
	}

	public boolean isStructure() {
		return false;
	}

	public boolean isSymbol() {
		return false;
	}

	public boolean isVector() {
		return false;
	}

	public SubLRegexPattern toRegexPattern() {
		return this;
	}

	public String toString() {
		return new String(
				"<#" + this.toTypeName() + " pattern: \"" + this.patternStr + "\" @" + this.hashCode(0) + ">");
	}

	public String toTypeName() {
		return SubLRegexPattern.REGEX_PATTERN_NAME;
	}

	// common lisp additions

	public String writeToString() {
		// TODO Auto-generated method stub
		return this.toString();
	}

	//// Internal Rep

}
