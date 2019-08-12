/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;


import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import org.logicmoo.system.BeanShellCntrl;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      MWP-PARSE
 * source file: /cyc/top/cycl/mwp-parse.lisp
 * created:     2019/07/03 17:38:23
 */
public final class mwp_parse extends SubLTranslatedFile implements V12 {
    public static final SubLFile me = new mwp_parse();

 public static final String myName = "com.cyc.cycjava.cycl.mwp_parse";


    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    static private final SubLList $list0 = list(makeKeyword("ALLOW-OTHER-KEYS"), T);

    private static final SubLSymbol MWP_PARSE_P = makeSymbol("MWP-PARSE-P");

    static private final SubLList $list2 = list(makeSymbol("MWP-PARSE"), makeSymbol("KEY"), makeSymbol("VALUE"));

    static private final SubLList $list8 = list(makeSymbol("PATTERN"), makeSymbol("PARSE"), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLSymbol MWP_PARSE_SET_P = makeSymbol("MWP-PARSE-SET-P");

    // Definitions
    public static final SubLObject mwp_parse_p_alt(SubLObject obj) {
        return list_utilities.property_list_p(obj);
    }

    // Definitions
    public static SubLObject mwp_parse_p(final SubLObject obj) {
        return list_utilities.property_list_p(obj);
    }

    public static final SubLObject new_mwp_parse_alt() {
        return com.cyc.cycjava.cycl.mwp_parse.mwp_parse_copy($list_alt0);
    }

    public static SubLObject new_mwp_parse() {
        return mwp_parse_copy($list0);
    }

    public static final SubLObject mwp_parse_copy_alt(SubLObject parse) {
        SubLTrampolineFile.checkType(parse, MWP_PARSE_P);
        return copy_list(parse);
    }

    public static SubLObject mwp_parse_copy(final SubLObject parse) {
        assert NIL != mwp_parse_p(parse) : "! mwp_parse.mwp_parse_p(parse) " + ("mwp_parse.mwp_parse_p(parse) " + "CommonSymbols.NIL != mwp_parse.mwp_parse_p(parse) ") + parse;
        return copy_list(parse);
    }

    /**
     * Get the KEY slot of MWP-PARSE.
     */
    @LispMethod(comment = "Get the KEY slot of MWP-PARSE.")
    public static final SubLObject mwp_parse_lookup_alt(SubLObject v_mwp_parse, SubLObject key) {
        return getf(v_mwp_parse, key, NIL);
    }

    /**
     * Get the KEY slot of MWP-PARSE.
     */
    @LispMethod(comment = "Get the KEY slot of MWP-PARSE.")
    public static SubLObject mwp_parse_lookup(final SubLObject v_mwp_parse, final SubLObject key) {
        return getf(v_mwp_parse, key, NIL);
    }

    /**
     * Set the KEY slot of MWP-PARSE to be VALUE.
     *
     * @unknown overwrites any existing value for KEY on MWP-PARSE.
     */
    @LispMethod(comment = "Set the KEY slot of MWP-PARSE to be VALUE.\r\n\r\n@unknown overwrites any existing value for KEY on MWP-PARSE.")
    public static final SubLObject mwp_parse_update_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject v_mwp_parse = NIL;
            SubLObject key = NIL;
            SubLObject value = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt2);
            v_mwp_parse = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt2);
            key = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt2);
            value = current.first();
            current = current.rest();
            if (NIL == current) {
                return list(CSETQ, v_mwp_parse, list(PUTF, v_mwp_parse, key, value));
            } else {
                cdestructuring_bind_error(datum, $list_alt2);
            }
        }
        return NIL;
    }

    /**
     * Set the KEY slot of MWP-PARSE to be VALUE.
     *
     * @unknown overwrites any existing value for KEY on MWP-PARSE.
     */
    @LispMethod(comment = "Set the KEY slot of MWP-PARSE to be VALUE.\r\n\r\n@unknown overwrites any existing value for KEY on MWP-PARSE.")
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

    public static final SubLObject mwp_parse_type_alt(SubLObject v_mwp_parse) {
        SubLTrampolineFile.checkType(v_mwp_parse, MWP_PARSE_P);
        return getf(v_mwp_parse, $TYPE, UNPROVIDED);
    }

    public static SubLObject mwp_parse_type(final SubLObject v_mwp_parse) {
        assert NIL != mwp_parse_p(v_mwp_parse) : "! mwp_parse.mwp_parse_p(v_mwp_parse) " + ("mwp_parse.mwp_parse_p(v_mwp_parse) " + "CommonSymbols.NIL != mwp_parse.mwp_parse_p(v_mwp_parse) ") + v_mwp_parse;
        return getf(v_mwp_parse, $TYPE, UNPROVIDED);
    }

    public static final SubLObject mwp_parse_denot_alt(SubLObject v_mwp_parse) {
        SubLTrampolineFile.checkType(v_mwp_parse, MWP_PARSE_P);
        return getf(v_mwp_parse, $DENOT, UNPROVIDED);
    }

    public static SubLObject mwp_parse_denot(final SubLObject v_mwp_parse) {
        assert NIL != mwp_parse_p(v_mwp_parse) : "! mwp_parse.mwp_parse_p(v_mwp_parse) " + ("mwp_parse.mwp_parse_p(v_mwp_parse) " + "CommonSymbols.NIL != mwp_parse.mwp_parse_p(v_mwp_parse) ") + v_mwp_parse;
        return getf(v_mwp_parse, $DENOT, UNPROVIDED);
    }

    public static final SubLObject mwp_parse_pos_pred_alt(SubLObject v_mwp_parse) {
        SubLTrampolineFile.checkType(v_mwp_parse, MWP_PARSE_P);
        return getf(v_mwp_parse, $POS_PRED, UNPROVIDED);
    }

    public static SubLObject mwp_parse_pos_pred(final SubLObject v_mwp_parse) {
        assert NIL != mwp_parse_p(v_mwp_parse) : "! mwp_parse.mwp_parse_p(v_mwp_parse) " + ("mwp_parse.mwp_parse_p(v_mwp_parse) " + "CommonSymbols.NIL != mwp_parse.mwp_parse_p(v_mwp_parse) ") + v_mwp_parse;
        return getf(v_mwp_parse, $POS_PRED, UNPROVIDED);
    }

    public static final SubLObject mwp_parse_destructuring_bind_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject pattern = NIL;
            SubLObject parse = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt8);
            pattern = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt8);
            parse = current.first();
            current = current.rest();
            {
                SubLObject body = current;
                return listS(CDESTRUCTURING_BIND, pattern, parse, append(body, NIL));
            }
        }
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

    /**
     *
     *
     * @return BOOLEAN; Is OBJ a set of MWP-PARSE-P objects?
     */
    @LispMethod(comment = "@return BOOLEAN; Is OBJ a set of MWP-PARSE-P objects?")
    public static final SubLObject mwp_parse_set_p_alt(SubLObject obj) {
        return set.set_p(obj);
    }

    /**
     *
     *
     * @return BOOLEAN; Is OBJ a set of MWP-PARSE-P objects?
     */
    @LispMethod(comment = "@return BOOLEAN; Is OBJ a set of MWP-PARSE-P objects?")
    public static SubLObject mwp_parse_set_p(final SubLObject obj) {
        return set.set_p(obj);
    }

    public static final SubLObject new_mwp_parse_set_alt() {
        return set.new_set(symbol_function(EQUAL), UNPROVIDED);
    }

    public static SubLObject new_mwp_parse_set() {
        return set.new_set(symbol_function(EQUAL), UNPROVIDED);
    }

    /**
     * Add PARSE to SET
     *
     * @return boolean; Is PARSE a new element?
     */
    @LispMethod(comment = "Add PARSE to SET\r\n\r\n@return boolean; Is PARSE a new element?")
    public static final SubLObject mwp_parse_set_add_alt(SubLObject v_set, SubLObject parse) {
        return set.set_add(parse, v_set);
    }

    @LispMethod(comment = "Add PARSE to SET\r\n\r\n@return boolean; Is PARSE a new element?")
    public static SubLObject mwp_parse_set_add(final SubLObject v_set, final SubLObject parse) {
        return set.set_add(parse, v_set);
    }

    public static final SubLObject mwp_parse_set_union_alt(SubLObject sets) {
        {
            SubLObject ok_sets = list_utilities.remove_if_not(MWP_PARSE_SET_P, sets, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            return NIL != ok_sets ? ((SubLObject) (set_utilities.set_union(ok_sets, symbol_function(EQUAL)))) : com.cyc.cycjava.cycl.mwp_parse.new_mwp_parse_set();
        }
    }

    public static SubLObject mwp_parse_set_union(final SubLObject sets) {
        final SubLObject ok_sets = list_utilities.remove_if_not(MWP_PARSE_SET_P, sets, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        return NIL != ok_sets ? set_utilities.set_union(ok_sets, symbol_function(EQUAL)) : new_mwp_parse_set();
    }

    public static final SubLObject mwp_parse_set_copy_alt(SubLObject v_set) {
        return set_utilities.construct_set_from_list(set.set_element_list(v_set), symbol_function(EQUAL), UNPROVIDED);
    }

    public static SubLObject mwp_parse_set_copy(final SubLObject v_set) {
        return set_utilities.construct_set_from_list(set.set_element_list(v_set), symbol_function(EQUAL), UNPROVIDED);
    }

    public static SubLObject declare_mwp_parse_file() {
        declareFunction("mwp_parse_p", "MWP-PARSE-P", 1, 0, false);
        declareFunction("new_mwp_parse", "NEW-MWP-PARSE", 0, 0, false);
        declareFunction("mwp_parse_copy", "MWP-PARSE-COPY", 1, 0, false);
        declareFunction("mwp_parse_lookup", "MWP-PARSE-LOOKUP", 2, 0, false);
        declareMacro("mwp_parse_update", "MWP-PARSE-UPDATE");
        declareFunction("mwp_parse_type", "MWP-PARSE-TYPE", 1, 0, false);
        declareFunction("mwp_parse_denot", "MWP-PARSE-DENOT", 1, 0, false);
        declareFunction("mwp_parse_pos_pred", "MWP-PARSE-POS-PRED", 1, 0, false);
        declareMacro("mwp_parse_destructuring_bind", "MWP-PARSE-DESTRUCTURING-BIND");
        declareFunction("mwp_parse_set_p", "MWP-PARSE-SET-P", 1, 0, false);
        declareFunction("new_mwp_parse_set", "NEW-MWP-PARSE-SET", 0, 0, false);
        declareFunction("mwp_parse_set_add", "MWP-PARSE-SET-ADD", 2, 0, false);
        declareFunction("mwp_parse_set_union", "MWP-PARSE-SET-UNION", 1, 0, false);
        declareFunction("mwp_parse_set_copy", "MWP-PARSE-SET-COPY", 1, 0, false);
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

    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    static private final SubLList $list_alt0 = list(makeKeyword("ALLOW-OTHER-KEYS"), T);

    @Override
    public void initializeVariables() {
        init_mwp_parse_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_mwp_parse_file();
    }

    static private final SubLList $list_alt2 = list(makeSymbol("MWP-PARSE"), makeSymbol("KEY"), makeSymbol("VALUE"));

    static {
    }

    static private final SubLList $list_alt8 = list(makeSymbol("PATTERN"), makeSymbol("PARSE"), makeSymbol("&BODY"), makeSymbol("BODY"));
}

/**
 * Total time: 94 ms
 */
