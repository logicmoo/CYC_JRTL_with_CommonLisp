/* For LarKC */
package com.cyc.tool.subl.jrtl.nativeCode.subLisp;

import java.util.ArrayList;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLCons;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLRegexPattern;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLNumberFactory;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLNil;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.util.SubLSystemTrampolineFile;

public class Regex extends SubLSystemTrampolineFile {
    public static SubLObject compile_regular_expression_impl(SubLObject regularExpressionString, SubLObject options) {
        int optionsTyped = options.intValue();
        String patternTyped = regularExpressionString.getStringValue();
        return SubLObjectFactory.makeRegexPattern(patternTyped, optionsTyped);
    }

    public static SubLObject discard_regular_expression_pattern_impl(SubLObject a) {
        return SubLNil.NIL;
    }

    public static SubLObject get_regex_errormsg(SubLObject a) {
        if (SubLMain.OPENCYC)
            return SubLRegexPattern.lastRegExError;
        return Errors.unimplementedMethod("get-regex-errormsg.");
    }

    public static SubLObject is_regex_implementation_availableP() {
        return CommonSymbols.T;
    }

    public static SubLObject match_regular_expression_pattern_offsets_impl(SubLObject regexPattern, SubLObject string, SubLObject maxNumMatches, SubLObject options, SubLObject start, SubLObject end) {
        SubLRegexPattern regexPatternTyped = regexPattern.toRegexPattern();
        CharSequence stringTyped = string.getStringValue();
        int maxNumMatchesTyped = maxNumMatches.intValue();
        if (options == CommonSymbols.UNPROVIDED)
            options = CommonSymbols.ZERO_INTEGER;
        int optionsTyped = options.intValue();
        int startTyped = SubLSystemTrampolineFile.extractStart(start);
        int endTyped = SubLSystemTrampolineFile.extractEnd(end);
        if (startTyped < 0)
            startTyped = 0;
        if (endTyped > stringTyped.length())
            endTyped = stringTyped.length();
        stringTyped = stringTyped.subSequence(startTyped, endTyped);
        ArrayList matches = regexPatternTyped.getAllMatchesOffsets(stringTyped, optionsTyped, maxNumMatchesTyped);
        if (matches == null || matches.size() == 0)
            return SubLObjectFactory.makeCons(SubLObjectFactory.makeCons(SubLNumberFactory.makeInteger(-1), SubLNumberFactory.makeInteger(-1)), SubLNil.NIL);
        SubLList result = SubLNil.NIL;
        for (int i = 0, size = matches.size(); i < size; i += 2) {
            SubLCons curOffsets = SubLObjectFactory
                    .makeCons(SubLNumberFactory.makeInteger((Integer) matches.get(i) + startTyped), SubLNumberFactory.makeInteger((Integer) matches.get(i + 1) + startTyped));
            result = SubLObjectFactory.makeCons(curOffsets, result);
        }
        return result.reverse(true);
    }

    public static SubLObject regex_pattern_p_impl(SubLObject possibleRegexPattern) {
        if (possibleRegexPattern.getClass() == SubLRegexPattern.class)
            return CommonSymbols.T;
        return SubLNil.NIL;
    }

    public static SubLObject regex_version() {
        return Regex.REGEX_VERSION;
    }

    public static SubLSystemTrampolineFile me;
    private static SubLString REGEX_VERSION;
    static {
        me = new Regex();
        REGEX_VERSION = SubLObjectFactory.makeString("Native Java Regular Expressions");
    }

    @Override
    public void declareFunctions() {
        SubLFiles.declareFunction(Regex.me, "regex_version", "REGEX-VERSION", 0, 0, false);
        SubLFiles.declareFunction(Regex.me, "compile_regular_expression_impl", "COMPILE-REGULAR-EXPRESSION-IMPL", 2, 0, false);
        SubLFiles.declareFunction(Regex.me, "regex_pattern_p_impl", "REGEX-PATTERN-P-IMPL", 1, 0, false);
        SubLFiles.declareFunction(Regex.me, "match_regular_expression_pattern_offsets_impl", "MATCH-REGULAR-EXPRESSION-PATTERN-OFFSETS-IMPL", 3, 3, false);
        SubLFiles.declareFunction(Regex.me, "discard_regular_expression_pattern_impl", "DISCARD-REGULAR-EXPRESSION-PATTERN-IMPL", 1, 0, false);
        SubLFiles.declareFunction(Regex.me, "get_regex_errormsg", "GET-REGEX-ERRORMSG", 1, 0, false);
        SubLFiles.declareFunction(Regex.me, "is_regex_implementation_availableP", "IS-REGEX-IMPLEMENTATION-AVAILABLE?", 0, 0, false);
    }

    @Override
    public void initializeVariables() {
    }

    @Override
    public void runTopLevelForms() {
    }
}
