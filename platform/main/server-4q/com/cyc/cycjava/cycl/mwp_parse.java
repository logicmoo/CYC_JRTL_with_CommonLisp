package com.cyc.cycjava.cycl;


import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.append;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.listS;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.cdestructuring_bind_error;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.copy_list;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.getf;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.declareMacro;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class mwp_parse extends SubLTranslatedFile {
    public static final SubLFile me = new mwp_parse();

    public static final String myName = "com.cyc.cycjava.cycl.mwp_parse";

    public static final String myFingerPrint = "921fd79759a98a8deac852060ad70d2fe9e69a15b6ece7b9cf0ee0216f10b465";

    // Internal Constants
    public static final SubLList $list0 = list(makeKeyword("ALLOW-OTHER-KEYS"), T);

    public static final SubLSymbol MWP_PARSE_P = makeSymbol("MWP-PARSE-P");

    public static final SubLList $list2 = list(makeSymbol("MWP-PARSE"), makeSymbol("KEY"), makeSymbol("VALUE"));











    public static final SubLList $list8 = list(makeSymbol("PATTERN"), makeSymbol("PARSE"), makeSymbol("&BODY"), makeSymbol("BODY"));



    public static final SubLSymbol MWP_PARSE_SET_P = makeSymbol("MWP-PARSE-SET-P");

    public static SubLObject mwp_parse_p(final SubLObject obj) {
        return list_utilities.property_list_p(obj);
    }

    public static SubLObject new_mwp_parse() {
        return mwp_parse_copy($list0);
    }

    public static SubLObject mwp_parse_copy(final SubLObject parse) {
        assert NIL != mwp_parse_p(parse) : "mwp_parse.mwp_parse_p(parse) " + "CommonSymbols.NIL != mwp_parse.mwp_parse_p(parse) " + parse;
        return copy_list(parse);
    }

    public static SubLObject mwp_parse_lookup(final SubLObject v_mwp_parse, final SubLObject key) {
        return getf(v_mwp_parse, key, NIL);
    }

    public static SubLObject mwp_parse_update(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject v_mwp_parse = NIL;
        SubLObject key = NIL;
        SubLObject value = NIL;
        destructuring_bind_must_consp(current, datum, $list2);
        v_mwp_parse = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list2);
        key = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list2);
        value = current.first();
        current = current.rest();
        if (NIL == current) {
            return list(CSETQ, v_mwp_parse, list(PUTF, v_mwp_parse, key, value));
        }
        cdestructuring_bind_error(datum, $list2);
        return NIL;
    }

    public static SubLObject mwp_parse_type(final SubLObject v_mwp_parse) {
        assert NIL != mwp_parse_p(v_mwp_parse) : "mwp_parse.mwp_parse_p(v_mwp_parse) " + "CommonSymbols.NIL != mwp_parse.mwp_parse_p(v_mwp_parse) " + v_mwp_parse;
        return getf(v_mwp_parse, $TYPE, UNPROVIDED);
    }

    public static SubLObject mwp_parse_denot(final SubLObject v_mwp_parse) {
        assert NIL != mwp_parse_p(v_mwp_parse) : "mwp_parse.mwp_parse_p(v_mwp_parse) " + "CommonSymbols.NIL != mwp_parse.mwp_parse_p(v_mwp_parse) " + v_mwp_parse;
        return getf(v_mwp_parse, $DENOT, UNPROVIDED);
    }

    public static SubLObject mwp_parse_pos_pred(final SubLObject v_mwp_parse) {
        assert NIL != mwp_parse_p(v_mwp_parse) : "mwp_parse.mwp_parse_p(v_mwp_parse) " + "CommonSymbols.NIL != mwp_parse.mwp_parse_p(v_mwp_parse) " + v_mwp_parse;
        return getf(v_mwp_parse, $POS_PRED, UNPROVIDED);
    }

    public static SubLObject mwp_parse_destructuring_bind(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject pattern = NIL;
        SubLObject parse = NIL;
        destructuring_bind_must_consp(current, datum, $list8);
        pattern = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list8);
        parse = current.first();
        final SubLObject body;
        current = body = current.rest();
        return listS(CDESTRUCTURING_BIND, pattern, parse, append(body, NIL));
    }

    public static SubLObject mwp_parse_set_p(final SubLObject obj) {
        return set.set_p(obj);
    }

    public static SubLObject new_mwp_parse_set() {
        return set.new_set(symbol_function(EQUAL), UNPROVIDED);
    }

    public static SubLObject mwp_parse_set_add(final SubLObject v_set, final SubLObject parse) {
        return set.set_add(parse, v_set);
    }

    public static SubLObject mwp_parse_set_union(final SubLObject sets) {
        final SubLObject ok_sets = list_utilities.remove_if_not(MWP_PARSE_SET_P, sets, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        return NIL != ok_sets ? set_utilities.set_union(ok_sets, symbol_function(EQUAL)) : new_mwp_parse_set();
    }

    public static SubLObject mwp_parse_set_copy(final SubLObject v_set) {
        return set_utilities.construct_set_from_list(set.set_element_list(v_set), symbol_function(EQUAL), UNPROVIDED);
    }

    public static SubLObject declare_mwp_parse_file() {
        declareFunction(me, "mwp_parse_p", "MWP-PARSE-P", 1, 0, false);
        declareFunction(me, "new_mwp_parse", "NEW-MWP-PARSE", 0, 0, false);
        declareFunction(me, "mwp_parse_copy", "MWP-PARSE-COPY", 1, 0, false);
        declareFunction(me, "mwp_parse_lookup", "MWP-PARSE-LOOKUP", 2, 0, false);
        declareMacro(me, "mwp_parse_update", "MWP-PARSE-UPDATE");
        declareFunction(me, "mwp_parse_type", "MWP-PARSE-TYPE", 1, 0, false);
        declareFunction(me, "mwp_parse_denot", "MWP-PARSE-DENOT", 1, 0, false);
        declareFunction(me, "mwp_parse_pos_pred", "MWP-PARSE-POS-PRED", 1, 0, false);
        declareMacro(me, "mwp_parse_destructuring_bind", "MWP-PARSE-DESTRUCTURING-BIND");
        declareFunction(me, "mwp_parse_set_p", "MWP-PARSE-SET-P", 1, 0, false);
        declareFunction(me, "new_mwp_parse_set", "NEW-MWP-PARSE-SET", 0, 0, false);
        declareFunction(me, "mwp_parse_set_add", "MWP-PARSE-SET-ADD", 2, 0, false);
        declareFunction(me, "mwp_parse_set_union", "MWP-PARSE-SET-UNION", 1, 0, false);
        declareFunction(me, "mwp_parse_set_copy", "MWP-PARSE-SET-COPY", 1, 0, false);
        return NIL;
    }

    public static SubLObject init_mwp_parse_file() {
        return NIL;
    }

    public static SubLObject setup_mwp_parse_file() {
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_mwp_parse_file();
    }

    @Override
    public void initializeVariables() {
        init_mwp_parse_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_mwp_parse_file();
    }

    
}

/**
 * Total time: 94 ms
 */
