/**
 *
 */
/**
 * For LarKC
 */
/**
 *
 */
package com.cyc.tool.subl.jrtl.translatedCode.sublisp;


import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLNil;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.EQ;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.T;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.UNPROVIDED;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.*;
import static com.cyc.tool.subl.util.SubLFiles.*;
import static com.cyc.tool.subl.util.SubLTranslatedFile.*;


public class cdestructuring_bind extends SubLTranslatedFile {
    public static SubLObject bogus_unless(SubLObject macroform, SubLObject environment) {
        SubLObject current;
        SubLObject datum = current = macroform.rest();
        SubLObject form = SubLNil.NIL;
        destructuring_bind_must_consp(current, datum, $list11);
        form = current.first();
        current = current.rest();
        if (SubLNil.NIL == current)
            return listS(PUNLESS, form, $list12);

        cdestructuring_bind_error(datum, $list11);
        return SubLNil.NIL;
    }

    public static SubLObject cdestructuring_bind(SubLObject macroform, SubLObject environment) {
        SubLObject current;
        SubLObject datum = current = macroform.rest();
        SubLObject pattern = SubLNil.NIL;
        SubLObject datum_$1 = SubLNil.NIL;
        destructuring_bind_must_consp(current, datum, $list0);
        pattern = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list0);
        datum_$1 = current.first();
        SubLObject body;
        current = body = current.rest();
        if (SubLNil.NIL == pattern) {
            SubLObject datum_var = make_symbol($$$DATUM);
            return listS(CLET, list(list(datum_var, datum_$1)), list(PUNLESS, list(NULL, datum_var), listS(CDESTRUCTURING_BIND_ERROR, datum_var, $list6)), append(body, SubLNil.NIL));
        }
        SubLObject original = make_symbol($$$DATUM);
        SubLObject datum_var2 = make_symbol($$$CURRENT);
        return listS(CLET, list(list(original, datum_$1), list(datum_var2, original)), append(destructuring_bind_Xwhole(pattern, datum_var2, list(CDESTRUCTURING_BIND_ERROR, original, list(QUOTE, pattern)), body), SubLNil.NIL));
    }

    public static SubLObject cdestructuring_bind_error(SubLObject original, SubLObject pattern) {
        return Errors.error($str9$The_value__S_failed_to_match_the_, original, CDESTRUCTURING_BIND, pattern);
    }

    public static SubLObject declare_cdestructuring_bind_file() {
        declareMacro("cdestructuring_bind", "CDESTRUCTURING-BIND");
        declareFunction("cdestructuring_bind_error", "CDESTRUCTURING-BIND-ERROR", 2, 0, false);
        declareFunction("destructuring_bind_must_consp", "DESTRUCTURING-BIND-MUST-CONSP", 3, 0, false);
        declareFunction("destructuring_bind_must_listp", "DESTRUCTURING-BIND-MUST-LISTP", 3, 0, false);
        declareFunction("property_list_member", "PROPERTY-LIST-MEMBER", 2, 0, false);
        declareMacro("bogus_unless", "BOGUS-UNLESS");
        declareFunction("destructuring_bind_Xwhole", "DESTRUCTURING-BIND-&WHOLE", 4, 0, false);
        declareFunction("destructuring_bind_required_args", "DESTRUCTURING-BIND-REQUIRED-ARGS", 4, 0, false);
        declareFunction("destructuring_bind_Xoptional", "DESTRUCTURING-BIND-&OPTIONAL", 4, 0, false);
        declareFunction("destructuring_bind_end_of_the_line", "DESTRUCTURING-BIND-END-OF-THE-LINE", 3, 0, false);
        declareFunction("destructuring_bind_more_Xoptional", "DESTRUCTURING-BIND-MORE-&OPTIONAL", 4, 0, false);
        declareFunction("destructuring_bind_Xrest", "DESTRUCTURING-BIND-&REST", 4, 0, false);
        declareFunction("destructuring_bind_Xkey", "DESTRUCTURING-BIND-&KEY", 4, 0, false);
        declareFunction("destructuring_bind_more_Xkey", "DESTRUCTURING-BIND-MORE-&KEY", 4, 0, false);
        declareFunction("destructuring_bind_Xaux", "DESTRUCTURING-BIND-&AUX", 4, 0, false);
        declareFunction("destructuring_bind_more_Xaux", "DESTRUCTURING-BIND-MORE-&AUX", 4, 0, false);
        return SubLNil.NIL;
    }

    public static SubLObject destructuring_bind_end_of_the_line(SubLObject datum, SubLObject error, SubLObject body) {
        return list(list(PCOND, bq_cons(list(NULL, datum), append(body, SubLNil.NIL)), list(T, error)));
    }

    public static SubLObject destructuring_bind_more_Xaux(SubLObject pattern, SubLObject datum, SubLObject error, SubLObject body) {
        if (SubLNil.NIL == pattern)
            return body;

        if (pattern.isCons()) {
            SubLObject current = pattern.first();
            SubLObject var = SubLNil.NIL;
            SubLObject init = SubLNil.NIL;
            if (current.isCons()) {
                var = current.first();
                current = current.rest();
                if (SubLNil.NIL != current) {
                    if (!current.isCons())
                        Errors.error($str13$Malformed_pattern__S_, pattern);

                    init = current.first();
                    if (SubLNil.NIL != current.rest())
                        Errors.error($str13$Malformed_pattern__S_, pattern);

                }
            } else
                var = current;

            if (!var.isSymbol())
                Errors.error($str13$Malformed_pattern__S_, pattern);

            return list(listS(CLET, list(list(var, init)), append(destructuring_bind_more_Xaux(pattern.rest(), datum, error, body), SubLNil.NIL)));
        }
        Errors.error($str13$Malformed_pattern__S_, pattern);
        return SubLNil.NIL;
    }

    public static SubLObject destructuring_bind_more_Xkey(SubLObject pattern, SubLObject datum, SubLObject error, SubLObject body) {
        SubLThread thread = SubLProcess.currentSubLThread();
        if (SubLNil.NIL == pattern)
            return values(body, SubLNil.NIL);

        if (!pattern.isCons()) {
            Errors.error($str13$Malformed_pattern__S_, pattern);
            return SubLNil.NIL;
        }
        SubLObject current = pattern.first();
        if (SubLNil.NIL != member(current, $list43, UNPROVIDED, UNPROVIDED))
            return destructuring_bind_Xaux(pattern, datum, error, body);

        SubLObject var = SubLNil.NIL;
        SubLObject v_default = SubLNil.NIL;
        SubLObject keyword = SubLNil.NIL;
        SubLObject suppliedp = SubLNil.NIL;
        pattern = pattern.rest();
        if (current.isCons()) {
            var = current.first();
            if (var.isCons()) {
                keyword = var.first();
                if (!keyword.isSymbol())
                    Errors.error($str13$Malformed_pattern__S_, pattern);

                if (!var.rest().isCons())
                    Errors.error($str13$Malformed_pattern__S_, pattern);

                var = second(var);
            } else
                keyword = make_keyword(var);

            current = current.rest();
            if (SubLNil.NIL != current) {
                if (!current.isCons())
                    Errors.error($str13$Malformed_pattern__S_, pattern);

                v_default = current.first();
                current = current.rest();
                if (SubLNil.NIL != current) {
                    if (!current.isCons())
                        Errors.error($str13$Malformed_pattern__S_, pattern);

                    suppliedp = current.first();
                    if (!suppliedp.isSymbol())
                        Errors.error($str13$Malformed_pattern__S_, pattern);

                }
            }
        } else {
            var = current;
            keyword = make_keyword(var);
        }
        if (!var.isSymbol())
            Errors.error($str13$Malformed_pattern__S_, pattern);

        thread.resetMultipleValues();
        SubLObject form = destructuring_bind_more_Xkey(pattern, datum, error, body);
        SubLObject keywords = thread.secondMultipleValue();
        thread.resetMultipleValues();
        SubLObject var_tail = make_symbol(cconcatenate(symbol_name(var), $str44$_TAIL));
        if (SubLNil.NIL != suppliedp) {
            SubLObject temp = make_symbol($$$TEMP);
            return values(list(list(CLET, list(list(var_tail, list(PROPERTY_LIST_MEMBER, list(QUOTE, keyword), datum)), list(var, list(FIF, var_tail, list(CADR, var_tail), v_default)), list(temp, var_tail)), listS(CLET, list(list(suppliedp, listS(FIF, temp, $list47))), append(form, SubLNil.NIL)))), cons(keyword, keywords));
        }
        return values(list(listS(CLET, list(list(var_tail, list(PROPERTY_LIST_MEMBER, list(QUOTE, keyword), datum)), list(var, list(FIF, var_tail, list(CADR, var_tail), v_default))), append(form, SubLNil.NIL))), cons(keyword, keywords));
    }

    public static SubLObject destructuring_bind_more_Xoptional(SubLObject pattern, SubLObject datum, SubLObject error, SubLObject body) {
        if (SubLNil.NIL == pattern)
            return destructuring_bind_end_of_the_line(datum, error, body);

        if (pattern.isCons()) {
            SubLObject current = pattern.first();
            if (SubLNil.NIL != member(current, $list25, UNPROVIDED, UNPROVIDED))
                return destructuring_bind_Xrest(pattern, datum, error, body);

            SubLObject var = SubLNil.NIL;
            SubLObject v_default = SubLNil.NIL;
            SubLObject suppliedp = SubLNil.NIL;
            if (current.isCons()) {
                var = current.first();
                current = current.rest();
                if (SubLNil.NIL != current) {
                    if (!current.isCons())
                        Errors.error($str13$Malformed_pattern__S_, pattern);

                    v_default = current.first();
                    current = current.rest();
                    if (SubLNil.NIL != current) {
                        if (!current.isCons())
                            Errors.error($str13$Malformed_pattern__S_, pattern);

                        suppliedp = current.first();
                        if (!suppliedp.isSymbol())
                            Errors.error($str13$Malformed_pattern__S_, pattern);

                    }
                }
            } else
                var = current;

            if (!var.isSymbol())
                Errors.error($str13$Malformed_pattern__S_, pattern);

            return list(listS(CLET, bq_cons(list(var, list(FIF, list(CONSP, datum), list(FIRST, datum), v_default)), append(SubLNil.NIL != suppliedp ? list(list(suppliedp, list(CONSP, datum))) : SubLNil.NIL, SubLNil.NIL)), listS(DESTRUCTURING_BIND_MUST_LISTP, datum, append(error.rest(), SubLNil.NIL)), list(CPOP, datum), append(destructuring_bind_more_Xoptional(pattern.rest(), datum, error, body), SubLNil.NIL)));
        } else {
            if (pattern.isSymbol())
                return list(listS(CLET, list(list(pattern, datum)), append(body, SubLNil.NIL)));

            Errors.error($str13$Malformed_pattern__S_, pattern);
            return SubLNil.NIL;
        }
    }

    public static SubLObject destructuring_bind_must_consp(SubLObject object, SubLObject original, SubLObject pattern) {
        if (!object.isCons())
            return cdestructuring_bind_error(original, pattern);

        return SubLNil.NIL;
    }

    public static SubLObject destructuring_bind_must_listp(SubLObject object, SubLObject original, SubLObject pattern) {
        if (!object.isList())
            return cdestructuring_bind_error(original, pattern);

        return SubLNil.NIL;
    }

    public static SubLObject destructuring_bind_required_args(SubLObject pattern, SubLObject datum, SubLObject error, SubLObject body) {
        SubLObject vars = SubLNil.NIL;
        SubLObject setqs = SubLNil.NIL;
        SubLObject done = SubLNil.NIL;
        while ((SubLNil.NIL == done) && pattern.isCons()) {
            SubLObject current = pattern.first();
            if (SubLNil.NIL != member(current, $list15, UNPROVIDED, UNPROVIDED))
                done = T;
            else {
                if (!current.isSymbol()) {
                    SubLObject temp = make_symbol($$$TEMP);
                    return list(listS(CLET, nreverse(vars), append(nreverse(setqs), list(listS(DESTRUCTURING_BIND_MUST_CONSP, datum, append(error.rest(), SubLNil.NIL)), listS(CLET, list(list(temp, list(REST, datum))), list(CSETQ, datum, list(FIRST, datum)), append(destructuring_bind_Xwhole(pattern.first(), datum, error, bq_cons(list(CSETQ, datum, temp), append(destructuring_bind_required_args(pattern.rest(), datum, error, body), SubLNil.NIL))), SubLNil.NIL))))));
                }
                vars = cons(current, vars);
                setqs = cons(list(PROGN, listS(DESTRUCTURING_BIND_MUST_CONSP, datum, append(error.rest(), SubLNil.NIL)), list(CSETQ, current, list(FIRST, datum)), list(CPOP, datum)), setqs);
                pattern = pattern.rest();
            }
        } 
        vars = nreverse(vars);
        setqs = nreverse(setqs);
        if (SubLNil.NIL == vars)
            return destructuring_bind_Xoptional(pattern, datum, error, body);

        if (pattern.isList())
            return list(listS(CLET, vars, append(setqs, destructuring_bind_Xoptional(pattern, datum, error, body), SubLNil.NIL)));

        if (pattern.isSymbol())
            return list(listS(CLET, append(vars, list(pattern)), append(setqs, bq_cons(list(CSETQ, pattern, datum), append(body, SubLNil.NIL)))));

        Errors.error($str13$Malformed_pattern__S_, pattern);
        return SubLNil.NIL;
    }

    public static SubLObject destructuring_bind_Xaux(SubLObject pattern, SubLObject datum, SubLObject error, SubLObject body) {
        if (SubLNil.NIL == pattern)
            return body;

        if (pattern.isCons()) {
            if (pattern.first() == $sym32$_AUX) {
                pattern = pattern.rest();
                if (!pattern.isCons())
                    Errors.error($str13$Malformed_pattern__S_, pattern);

                return destructuring_bind_more_Xaux(pattern, datum, error, body);
            }
            Errors.error($str13$Malformed_pattern__S_, pattern);
        } else
            Errors.error($str13$Malformed_pattern__S_, pattern);

        return SubLNil.NIL;
    }

    public static SubLObject destructuring_bind_Xkey(SubLObject pattern, SubLObject datum, SubLObject error, SubLObject body) {
        SubLThread thread = SubLProcess.currentSubLThread();
        if (SubLNil.NIL == pattern)
            return destructuring_bind_end_of_the_line(datum, error, body);

        if (!pattern.isCons()) {
            Errors.error($str13$Malformed_pattern__S_, pattern);
            return SubLNil.NIL;
        }
        if (pattern.first() != $sym30$_KEY)
            return destructuring_bind_Xaux(pattern, datum, error, body);

        pattern = pattern.rest();
        if (!pattern.isCons())
            Errors.error($str13$Malformed_pattern__S_, pattern);

        SubLObject allow_other_keys_p;
        SubLObject done;
        SubLObject rest;
        for (allow_other_keys_p = SubLNil.NIL, done = SubLNil.NIL, rest = SubLNil.NIL, rest = pattern; ((SubLNil.NIL == done) && (SubLNil.NIL == allow_other_keys_p)) && (SubLNil.NIL != rest); rest = rest.rest()) {
            if (!rest.isCons())
                Errors.error($str13$Malformed_pattern__S_, pattern);

            if (rest.first() == $sym31$_ALLOW_OTHER_KEYS)
                allow_other_keys_p = T;

            if (rest.first() == $sym32$_AUX)
                done = T;

        }
        if (SubLNil.NIL != allow_other_keys_p)
            return destructuring_bind_more_Xkey(remove($sym31$_ALLOW_OTHER_KEYS, pattern, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), datum, error, body);

        thread.resetMultipleValues();
        SubLObject form = destructuring_bind_more_Xkey(pattern, datum, error, body);
        SubLObject keywords = thread.secondMultipleValue();
        thread.resetMultipleValues();
        SubLObject allow_other_keys_var = make_symbol($str33$ALLOW_OTHER_KEYS_P);
        SubLObject rest2 = make_symbol($$$REST);
        SubLObject bad = make_symbol($$$BAD);
        SubLObject current = make_symbol($$$CURRENT);
        return list(listS(CLET, list(bq_cons(allow_other_keys_var, $list6)), list(CLET, list(list(rest2, datum), bq_cons(bad, $list6), current), list(new SubLObject[]{ CDO, SubLNil.NIL, list(list(NULL, rest2)), listS(DESTRUCTURING_BIND_MUST_CONSP, rest2, append(error.rest(), SubLNil.NIL)), list(CSETQ, current, list(FIRST, rest2)), list(CPOP, rest2), listS(DESTRUCTURING_BIND_MUST_CONSP, rest2, append(error.rest(), SubLNil.NIL)), list(PUNLESS, list(MEMBER, current, list(QUOTE, keywords)), listS(CSETQ, bad, $list38)), list(PWHEN, listS(EQ, current, $list40), list(CSETQ, allow_other_keys_var, list(FIRST, rest2))), list(CPOP, rest2) }), list(PWHEN, list(CAND, bad, list(CNOT, allow_other_keys_var)), error)), append(form, SubLNil.NIL)));
    }

    public static SubLObject destructuring_bind_Xoptional(SubLObject pattern, SubLObject datum, SubLObject error, SubLObject body) {
        if (SubLNil.NIL == pattern)
            return destructuring_bind_end_of_the_line(datum, error, body);

        if (pattern.isCons()) {
            if (pattern.first() == $sym23$_OPTIONAL) {
                pattern = pattern.rest();
                if (!pattern.isCons())
                    Errors.error($str13$Malformed_pattern__S_, pattern);

                return destructuring_bind_more_Xoptional(pattern, datum, error, body);
            }
            return destructuring_bind_Xrest(pattern, datum, error, body);
        } else {
            if (pattern.isSymbol())
                return list(listS(CLET, list(list(pattern, datum)), append(body, SubLNil.NIL)));

            Errors.error($str13$Malformed_pattern__S_, pattern);
            return SubLNil.NIL;
        }
    }

    public static SubLObject destructuring_bind_Xrest(SubLObject pattern, SubLObject datum, SubLObject error, SubLObject body) {
        if (SubLNil.NIL == pattern)
            return destructuring_bind_end_of_the_line(datum, error, body);

        if (!pattern.isCons()) {
            Errors.error($str13$Malformed_pattern__S_, pattern);
            return SubLNil.NIL;
        }
        if (SubLNil.NIL != member(pattern.first(), $list29, UNPROVIDED, UNPROVIDED)) {
            pattern = pattern.rest();
            if (!pattern.isCons())
                Errors.error($str13$Malformed_pattern__S_, pattern);

            return list(listS(CLET, list(list(pattern.first(), datum)), append(SubLNil.NIL != pattern.rest() ? destructuring_bind_Xkey(pattern.rest(), datum, error, body) : body, SubLNil.NIL)));
        }
        return destructuring_bind_Xkey(pattern, datum, error, body);
    }

    public static SubLObject destructuring_bind_Xwhole(SubLObject pattern, SubLObject datum, SubLObject error, SubLObject body) {
        if (!pattern.isCons())
            Errors.error($str13$Malformed_pattern__S_, pattern);

        if (pattern.first() == $sym14$_WHOLE) {
            pattern = pattern.rest();
            SubLObject var = pattern.first();
            if (!var.isSymbol())
                Errors.error($str13$Malformed_pattern__S_, pattern);

            pattern = pattern.rest();
            return list(listS(CLET, list(list(var, datum)), append(SubLNil.NIL != pattern ? destructuring_bind_required_args(pattern, datum, error, body) : body, SubLNil.NIL)));
        }
        return destructuring_bind_required_args(pattern, datum, error, body);
    }

    public static SubLObject init_cdestructuring_bind_file() {
        return SubLNil.NIL;
    }

    public static SubLObject property_list_member(SubLObject property, SubLObject plist) {
        SubLObject rest;
        SubLObject candidate_property;
        for (rest = SubLNil.NIL, rest = plist; SubLNil.NIL != rest; rest = cddr(rest)) {
            candidate_property = rest.first();
            if (property.eql(candidate_property))
                return rest;

        }
        return SubLNil.NIL;
    }

    public static SubLObject setup_cdestructuring_bind_file() {
        return SubLNil.NIL;
    }

    public static final SubLFile me = new cdestructuring_bind();

    public static final String myName = "com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind";

    // Internal Constants
    public static final SubLList $list0 = list(makeSymbol("PATTERN"), makeSymbol("DATUM"), makeSymbol("&BODY"), makeSymbol("BODY"));

    public static final SubLString $$$DATUM = makeString("DATUM");







    public static final SubLSymbol CDESTRUCTURING_BIND_ERROR = makeSymbol("CDESTRUCTURING-BIND-ERROR");

    public static final SubLList $list6 = list(SubLNil.NIL);

    public static final SubLString $$$CURRENT = makeString("CURRENT");



    public static final SubLString $str9$The_value__S_failed_to_match_the_ = makeString("The value ~S failed to match the ~S pattern ~S.");



    public static final SubLList $list11 = list(makeSymbol("FORM"));

    public static final SubLList $list12 = list(list(makeSymbol("ERROR"), makeString("Malformed pattern ~S."), makeSymbol("PATTERN")));

    public static final SubLString $str13$Malformed_pattern__S_ = makeString("Malformed pattern ~S.");

    public static final SubLSymbol $sym14$_WHOLE = makeSymbol("&WHOLE");

    public static final SubLList $list15 = list(makeSymbol("&OPTIONAL"), makeSymbol("&REST"), makeSymbol("&BODY"), makeSymbol("&KEY"), makeSymbol("&AUX"));



    public static final SubLSymbol DESTRUCTURING_BIND_MUST_CONSP = makeSymbol("DESTRUCTURING-BIND-MUST-CONSP");







    public static final SubLString $$$TEMP = makeString("TEMP");



    public static final SubLSymbol $sym23$_OPTIONAL = makeSymbol("&OPTIONAL");



    public static final SubLList $list25 = list(makeSymbol("&REST"), makeSymbol("&BODY"), makeSymbol("&KEY"), makeSymbol("&AUX"));





    public static final SubLSymbol DESTRUCTURING_BIND_MUST_LISTP = makeSymbol("DESTRUCTURING-BIND-MUST-LISTP");

    public static final SubLList $list29 = list(makeSymbol("&REST"), makeSymbol("&BODY"));

    public static final SubLSymbol $sym30$_KEY = makeSymbol("&KEY");

    public static final SubLSymbol $sym31$_ALLOW_OTHER_KEYS = makeSymbol("&ALLOW-OTHER-KEYS");

    public static final SubLSymbol $sym32$_AUX = makeSymbol("&AUX");

    public static final SubLString $str33$ALLOW_OTHER_KEYS_P = makeString("ALLOW-OTHER-KEYS-P");

    public static final SubLString $$$REST = makeString("REST");

    public static final SubLString $$$BAD = makeString("BAD");





    public static final SubLList $list38 = list(T);



    public static final SubLList $list40 = list(makeKeyword("ALLOW-OTHER-KEYS"));





    public static final SubLList $list43 = list(makeSymbol("&AUX"));

    public static final SubLString $str44$_TAIL = makeString("-TAIL");

    public static final SubLSymbol PROPERTY_LIST_MEMBER = makeSymbol("PROPERTY-LIST-MEMBER");



    public static final SubLList $list47 = list(T, SubLNil.NIL);

    static {

















































    }

    @Override
    public void declareFunctions() {
        declare_cdestructuring_bind_file();
    }

    @Override
    public void initializeVariables() {
        init_cdestructuring_bind_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_cdestructuring_bind_file();
    }
}

