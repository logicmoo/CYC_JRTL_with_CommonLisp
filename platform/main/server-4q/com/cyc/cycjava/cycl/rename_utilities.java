/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_hash;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.alpha_char_p;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.rplaca;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.subtract;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.length;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.nreverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.search;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.values;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors.aref;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.print;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.read;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.force_output;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.terpri;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 *  module:      RENAME-UTILITIES
 *  source file: /cyc/top/cycl/rename-utilities.lisp
 *  created:     2019/07/03 17:39:07
 */
public final class rename_utilities extends SubLTranslatedFile implements V02 {
    // // Constructor
    private rename_utilities() {
    }

    public static final SubLFile me = new rename_utilities();


    // // Definitions
    public static final SubLObject optionally_rename_constants_in_string_assertions(SubLObject path_string) {
        return optionally_rename_in_string_assertions(dictionary_utilities.make_dictionary_from_text(path_string), UNPROVIDED);
    }

    public static final SubLObject optionally_rename_in_string_assertions(SubLObject dict, SubLObject assertions_mentioning_constants) {
        if (assertions_mentioning_constants == UNPROVIDED) {
            assertions_mentioning_constants = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject count = ZERO_INTEGER;
                SubLObject constants = dictionary.dictionary_keys(dict);
                SubLObject assertions = (NIL != assertions_mentioning_constants) ? ((SubLObject) (assertions_mentioning_constants)) : kb_accessors.constants_in_string_assertions(constants);
                SubLObject cdolist_list_var = assertions;
                SubLObject ass = NIL;
                for (ass = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , ass = cdolist_list_var.first()) {
                    if (NIL != assertions_high.valid_assertion(ass, UNPROVIDED)) {
                        {
                            SubLObject new_args = NIL;
                            SubLObject args_changedP = NIL;
                            SubLObject new_formula = NIL;
                            SubLObject args = cycl_utilities.formula_args(assertions_high.gaf_formula(ass), $IGNORE);
                            SubLObject cdolist_list_var_1 = args;
                            SubLObject arg = NIL;
                            for (arg = cdolist_list_var_1.first(); NIL != cdolist_list_var_1; cdolist_list_var_1 = cdolist_list_var_1.rest() , arg = cdolist_list_var_1.first()) {
                                {
                                    SubLObject new_arg = arg;
                                    if (arg.isString()) {
                                        thread.resetMultipleValues();
                                        {
                                            SubLObject new_string = optionally_rename_string(arg, dict);
                                            SubLObject num_renames = thread.secondMultipleValue();
                                            thread.resetMultipleValues();
                                            if (num_renames.isPositive()) {
                                                count = add(count, num_renames);
                                                args_changedP = T;
                                                new_arg = new_string;
                                            }
                                        }
                                    } else {
                                        {
                                            SubLObject _prev_bind_0 = czer_vars.$assertion_key$.currentBinding(thread);
                                            try {
                                                czer_vars.$assertion_key$.bind(ASSERTION_EL_FORMULA, thread);
                                                new_arg = cycl_utilities.hl_to_el(arg);
                                            } finally {
                                                czer_vars.$assertion_key$.rebind(_prev_bind_0, thread);
                                            }
                                        }
                                    }
                                    new_args = cons(new_arg, new_args);
                                }
                            }
                            if (NIL != args_changedP) {
                                new_formula = el_utilities.make_formula(assertions_high.gaf_arg0(ass), nreverse(new_args), UNPROVIDED);
                                ke.ke_edit_assertion_strings(ass, new_formula, UNPROVIDED);
                            }
                        }
                    }
                }
                return count;
            }
        }
    }

    public static final SubLObject optionally_rename_string(SubLObject string, SubLObject dict) {
        {
            SubLObject num_renames = ZERO_INTEGER;
            SubLObject result = string;
            SubLObject constants = dictionary.dictionary_keys(dict);
            SubLObject cdolist_list_var = constants;
            SubLObject v_const = NIL;
            for (v_const = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , v_const = cdolist_list_var.first()) {
                {
                    SubLObject name = constants_high.constant_name(v_const);
                    SubLObject positions = string_utilities.search_all(name, result, UNPROVIDED, UNPROVIDED);
                    SubLObject cdolist_list_var_2 = positions;
                    SubLObject pos = NIL;
                    for (pos = cdolist_list_var_2.first(); NIL != cdolist_list_var_2; cdolist_list_var_2 = cdolist_list_var_2.rest() , pos = cdolist_list_var_2.first()) {
                        if (pos.isInteger()) {
                            {
                                SubLObject do_itP = NIL;
                                SubLObject new_name = dictionary.dictionary_lookup(dict, v_const, UNPROVIDED);
                                SubLObject new_string = string_utilities.replace_substring_once(result, name, new_name, pos);
                                if (NIL != safely_renamable_constant_referenceP(result, name, pos)) {
                                    do_itP = T;
                                } else {
                                    print(result, UNPROVIDED);
                                    print(new_string, UNPROVIDED);
                                    terpri(UNPROVIDED);
                                    {
                                        SubLObject input = NIL;
                                        while (!(input.equalp($$$Y) || input.equalp($$$N))) {
                                            format(T, $str_alt4$Rename__a_to__a_as_in_the_above_l, name, new_name);
                                            force_output(UNPROVIDED);
                                            input = string_utilities.str(read(UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
                                        } 
                                        if (input.equalp($$$Y)) {
                                            do_itP = T;
                                        }
                                    }
                                }
                                if (NIL != do_itP) {
                                    num_renames = add(num_renames, ONE_INTEGER);
                                    result = new_string;
                                    {
                                        SubLObject increment = subtract(length(new_name), length(name));
                                        if (!ZERO_INTEGER.numE(increment)) {
                                            {
                                                SubLObject pos_list = NIL;
                                                SubLObject pos_3 = NIL;
                                                for (pos_list = positions, pos_3 = pos_list.first(); NIL != pos_list; pos_list = pos_list.rest() , pos_3 = pos_list.first()) {
                                                    rplaca(pos_list, add(pos_3, increment));
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return values(result, num_renames);
        }
    }

    /**
     *
     *
     * @param POS
     * 		integerp; the position of CONSTANT-NAME in STRING.
     */
    public static final SubLObject safely_renamable_constant_referenceP(SubLObject string, SubLObject constant_name, SubLObject pos) {
        if (pos == UNPROVIDED) {
            pos = NIL;
        }
        {
            SubLObject position = (NIL != pos) ? ((SubLObject) (pos)) : search(constant_name, string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            return makeBoolean((((position.isInteger() && position.numGE(TWO_INTEGER)) && (CHAR_hash == aref(string, subtract(position, TWO_INTEGER)))) && (constant_reader.constant_reader_macro_char() == aref(string, subtract(position, ONE_INTEGER)))) && (add(position, length(constant_name)).numGE(length(string)) || (NIL == alpha_char_p(aref(string, add(position, length(constant_name)))))));
        }
    }

    public static final SubLObject declare_rename_utilities_file() {
        declareFunction("optionally_rename_constants_in_string_assertions", "OPTIONALLY-RENAME-CONSTANTS-IN-STRING-ASSERTIONS", 1, 0, false);
        declareFunction("optionally_rename_in_string_assertions", "OPTIONALLY-RENAME-IN-STRING-ASSERTIONS", 1, 1, false);
        declareFunction("optionally_rename_string", "OPTIONALLY-RENAME-STRING", 2, 0, false);
        declareFunction("safely_renamable_constant_referenceP", "SAFELY-RENAMABLE-CONSTANT-REFERENCE?", 2, 1, false);
        return NIL;
    }

    public static final SubLObject init_rename_utilities_file() {
        return NIL;
    }

    public static final SubLObject setup_rename_utilities_file() {
                return NIL;
    }



    private static final SubLSymbol ASSERTION_EL_FORMULA = makeSymbol("ASSERTION-EL-FORMULA");

    static private final SubLString $$$Y = makeString("Y");

    static private final SubLString $$$N = makeString("N");

    static private final SubLString $str_alt4$Rename__a_to__a_as_in_the_above_l = makeString("Rename ~a to ~a as in the above line? (y=yes, n=no) ");

    // // Initializers
    public void declareFunctions() {
        declare_rename_utilities_file();
    }

    public void initializeVariables() {
        init_rename_utilities_file();
    }

    public void runTopLevelForms() {
        setup_rename_utilities_file();
    }
}

