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

package com.cyc.tool.subl.jrtl.nativeCode.subLisp;

import java.util.ArrayList;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLCons;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLRegexPattern;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLNumberFactory;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.util.SubLTrampolineFile;

//// Internal Imports

//// External Imports

public class Regex extends SubLTrampolineFile {

	//// Constructors

	public static SubLTrampolineFile me = new Regex();

	private static SubLString REGEX_VERSION = SubLObjectFactory.makeString("Native Java Regular Expressions");

	//// Public Area

	public static SubLObject compile_regular_expression_impl(SubLObject regularExpressionString, SubLObject options) {
		int optionsTyped = options.intValue();
		String patternTyped = regularExpressionString.getString();
		return SubLObjectFactory.makeRegexPattern(patternTyped, optionsTyped);
	}

	public static SubLObject discard_regular_expression_pattern_impl(SubLObject a) {
		return CommonSymbols.NIL;
	}

	public static SubLObject get_regex_errormsg(SubLObject a) {
		return Errors.unimplementedMethod("get-regex-errormsg.");
	}

	public static SubLObject is_regex_implementation_availableP() {
		return CommonSymbols.T;
	}

	/** @note maxNumMatches is currently ignored. */
	public static SubLObject match_regular_expression_pattern_offsets_impl(SubLObject regexPattern, SubLObject string,
			SubLObject maxNumMatches, SubLObject options, SubLObject start, SubLObject end) {
		SubLRegexPattern regexPatternTyped = regexPattern.toRegexPattern();
		CharSequence stringTyped = string.getString();
		int maxNumMatchesTyped = maxNumMatches.intValue();
		if (options == CommonSymbols.UNPROVIDED)
			options = CommonSymbols.ZERO_INTEGER;
		int optionsTyped = options.intValue();
		int startTyped = SubLTrampolineFile.extractStart(start);
		int endTyped = SubLTrampolineFile.extractEnd(end);
		if (startTyped < 0)
			startTyped = 0;
		if (endTyped > stringTyped.length())
			endTyped = stringTyped.length();
		stringTyped = stringTyped.subSequence(startTyped, endTyped);
		ArrayList matches = regexPatternTyped.getAllMatchesOffsets(stringTyped, optionsTyped, maxNumMatchesTyped);
		if (matches == null || matches.size() == 0)
			return SubLObjectFactory.makeCons(
					SubLObjectFactory.makeCons(SubLNumberFactory.makeInteger(-1), SubLNumberFactory.makeInteger(-1)),
					CommonSymbols.NIL);
		SubLList result = CommonSymbols.NIL;
		for (int i = 0, size = matches.size(); i < size; i += 2) {
			SubLCons curOffsets = SubLObjectFactory.makeCons(
					SubLNumberFactory.makeInteger(((Integer) matches.get(i)).intValue() + startTyped),
					SubLNumberFactory.makeInteger(((Integer) matches.get(i + 1)).intValue() + startTyped));
			result = SubLObjectFactory.makeCons(curOffsets, result);
		}
		return result.reverse(true);
	}

	public static SubLObject regex_pattern_p_impl(SubLObject possibleRegexPattern) {
		if (possibleRegexPattern.getClass() == SubLRegexPattern.class)
			return CommonSymbols.T;
		return CommonSymbols.NIL;
	}

	public static SubLObject regex_version() {
		return Regex.REGEX_VERSION;
	}

	//// Initializers

	/** Creates a new instance of Environment. */
	private Regex() {
	}

	public void declareFunctions() {
		SubLFiles.declareFunction(Regex.me, "regex_version", "REGEX-VERSION", 0, 0, false);
		SubLFiles.declareFunction(Regex.me, "compile_regular_expression_impl", "COMPILE-REGULAR-EXPRESSION-IMPL", 2, 0,
				false);
		SubLFiles.declareFunction(Regex.me, "regex_pattern_p_impl", "REGEX-PATTERN-P-IMPL", 1, 0, false);
		SubLFiles.declareFunction(Regex.me, "match_regular_expression_pattern_offsets_impl",
				"MATCH-REGULAR-EXPRESSION-PATTERN-OFFSETS-IMPL", 3, 3, false);
		SubLFiles.declareFunction(Regex.me, "discard_regular_expression_pattern_impl",
				"DISCARD-REGULAR-EXPRESSION-PATTERN-IMPL", 1, 0, false);
		SubLFiles.declareFunction(Regex.me, "get_regex_errormsg", "GET-REGEX-ERRORMSG", 1, 0, false);
		SubLFiles.declareFunction(Regex.me, "is_regex_implementation_availableP", "IS-REGEX-IMPLEMENTATION-AVAILABLE?",
				0, 0, false);
	}

	public void initializeVariables() {
	}

	//// Protected Area

	//// Private Area

	public void runTopLevelForms() {
	}

	//// Internal Rep

	//// Main

}
