package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.utilities_macros.register_cyc_api_function;
import static com.cyc.cycjava.cycl.utilities_macros.register_obsolete_cyc_api_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.alphanumericp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.append;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.listS;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.multiply;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.cconcatenate;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.delete;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.find;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.find_if;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.length;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.sublisp_null;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeUninternedSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.cdestructuring_bind_error;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.property_list_member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cadr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.member;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.declareMacro;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.random;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLSystemTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class constant_completion_high extends SubLTranslatedFile {
    public static final SubLFile me = new constant_completion_high();

    public static final String myName = "com.cyc.cycjava.cycl.constant_completion_high";

    public static final String myFingerPrint = "01d102641265db1a0c59048ec1c0f1f2bd9ac2c3e4867cb66af5c31d5c07f569";

    // defparameter
    // Do we require that constant names be case-insensitively unique?
    public static final SubLSymbol $require_case_insensitive_name_uniqueness$ = makeSymbol("*REQUIRE-CASE-INSENSITIVE-NAME-UNIQUENESS*");

    // defparameter
    private static final SubLSymbol $last_known_index_for_constant_prefix_dict$ = makeSymbol("*LAST-KNOWN-INDEX-FOR-CONSTANT-PREFIX-DICT*");



    public static final SubLSymbol VALID_CONSTANT_NAME_CHAR = makeSymbol("VALID-CONSTANT-NAME-CHAR");

    public static final SubLList $list2 = list(makeSymbol("VALID-CONSTANT-NAME-CHAR-P"));

    public static final SubLList $list3 = list(makeSymbol("CHAR"));

    public static final SubLString $str4$Deprecated_in_favor_of_valid_cons = makeString("Deprecated in favor of valid-constant-name-char-p\n   Return T iff CHAR is a character which is allowed in a valid constant name.");

    public static final SubLList $list5 = list(list(makeSymbol("CHAR"), makeSymbol("CHARACTERP")));

    public static final SubLList $list6 = list(makeSymbol("BOOLEANP"));

    public static final SubLString $str7$___ = makeString("-_:");



    public static final SubLString $str9$Return_T_iff_CHAR_is_a_character_ = makeString("Return T iff CHAR is a character which is allowed in a valid constant name.");

    public static final SubLSymbol VALID_CONSTANT_NAME = makeSymbol("VALID-CONSTANT-NAME");

    public static final SubLList $list11 = list(makeSymbol("VALID-CONSTANT-NAME-P"));

    public static final SubLList $list12 = list(makeSymbol("STRING"));

    public static final SubLString $str13$Deprecated_in_favor_of_valid_cons = makeString("Deprecated in favor of valid-constant-name-p\n   Return T iff STRING is a valid name for a constant.");

    public static final SubLSymbol INVALID_CONSTANT_NAME_CHAR_P = makeSymbol("INVALID-CONSTANT-NAME-CHAR-P");



    public static final SubLString $str16$Return_T_iff_STRING_is_a_valid_na = makeString("Return T iff STRING is a valid name for a constant.");





    public static final SubLSymbol CONSTANT_NAME_AVAILABLE = makeSymbol("CONSTANT-NAME-AVAILABLE");

    public static final SubLList $list20 = list(makeSymbol("NAME"));

    public static final SubLString $str21$Return_T_iff_NAME_is_a_valid_cons = makeString("Return T iff NAME is a valid constant name currently available for use.");

    public static final SubLList $list22 = list(list(makeSymbol("NAME"), makeSymbol("STRINGP")));



    private static final SubLString $str24$_ = makeString("-");

    private static final SubLSymbol UNIQUIFY_CONSTANT_NAME = makeSymbol("UNIQUIFY-CONSTANT-NAME");

    public static final SubLList $list26 = list(makeSymbol("NAME"), makeSymbol("&OPTIONAL"), list(makeSymbol("SEQUENTIAL?"), NIL));

    private static final SubLString $str27$Return_a_unique__currently_unused = makeString("Return a unique, currently unused constant name based on NAME, which must be a valid constant name. If sequential is set to true it picks the first available sequential digit if NAME is already in use (default is false).");

    private static final SubLList $list28 = list(list(makeSymbol("NAME"), makeSymbol("VALID-CONSTANT-NAME-P")), list(makeSymbol("SEQUENTIAL?"), makeSymbol("BOOLEANP")));

    private static final SubLList $list29 = list(makeSymbol("STRINGP"));



    private static final SubLSymbol CONSTANT_NAME_CASE_COLLISIONS = makeSymbol("CONSTANT-NAME-CASE-COLLISIONS");

    private static final SubLString $str32$Return_a_list_of_constants_whose_ = makeString("Return a list of constants whose names differ from STRING only by case.");

    private static final SubLList $list33 = list(list(makeSymbol("STRING"), makeSymbol("VALID-CONSTANT-NAME-P")));

    private static final SubLList $list34 = list(makeSymbol("LISTP"));

    private static final SubLSymbol CONSTANT_NAME_CASE_COLLISION = makeSymbol("CONSTANT-NAME-CASE-COLLISION");

    private static final SubLString $str36$Return_a_constant_whose_name_diff = makeString("Return a constant whose name differs from STRING only by case.");

    private static final SubLList $list37 = list(makeSymbol("CONSTANT-P"));



    private static final SubLSymbol CONSTANT_COMPLETE_EXACT = makeSymbol("CONSTANT-COMPLETE-EXACT");

    public static final SubLList $list40 = list(makeSymbol("STRING"), makeSymbol("&OPTIONAL"), list(makeSymbol("START"), ZERO_INTEGER), makeSymbol("END"));

    private static final SubLString $str41$Return_a_valid_constant_whose_nam = makeString("Return a valid constant whose name exactly matches STRING.\nOptionally the START and END character positions can be\nspecified, such that the STRING matches characters between the START and \nEND range.  If no constant exists, return NIL.");

    private static final SubLList $list42 = list(list(makeSymbol("STRING"), makeSymbol("STRINGP")), list(makeSymbol("START"), makeSymbol("FIXNUMP")));

    private static final SubLSymbol CONSTANT_COMPLETE = makeSymbol("CONSTANT-COMPLETE");

    private static final SubLList $list44 = list(makeSymbol("PREFIX"), makeSymbol("&OPTIONAL"), makeSymbol("CASE-SENSITIVE?"), makeSymbol("EXACT-LENGTH?"), list(makeSymbol("START"), ZERO_INTEGER), makeSymbol("END"));

    private static final SubLString $str45$Return_all_valid_constants_with_P = makeString("Return all valid constants with PREFIX as a prefix of their name\nWhen CASE-SENSITIVE? is non-nil, the comparison is done in a case-sensitive fashion.\nWhen EXACT-LENGTH? is non-nil, the prefix must be the entire string\nOptionally the START and END character positions can be\nspecified, such that the PREFIX matches characters between the START and \nEND range.  If no constant exists, return NIL.");

    private static final SubLList $list46 = list(list(makeSymbol("PREFIX"), makeSymbol("STRINGP")), list(makeSymbol("CASE-SENSITIVE?"), makeSymbol("BOOLEANP")), list(makeSymbol("EXACT-LENGTH?"), makeSymbol("BOOLEANP")), list(makeSymbol("START"), makeSymbol("FIXNUMP")));

    private static final SubLSymbol CONSTANT_APROPOS = makeSymbol("CONSTANT-APROPOS");

    private static final SubLList $list48 = list(makeSymbol("SUBSTRING"), makeSymbol("&OPTIONAL"), makeSymbol("CASE-SENSITIVE?"), list(makeSymbol("START"), ZERO_INTEGER), makeSymbol("END"));

    private static final SubLString $str49$Return_all_valid_constants_with_S = makeString("Return all valid constants with SUBSTRING somewhere in their name\nWhen CASE-SENSITIVE? is non-nil, the comparison is done in a case-sensitive fashion.\nOptionally the START and END character positions can be\nspecified, such that the SUBSTRING matches characters between the START and \nEND range.  If no constant exists, return NIL.");

    private static final SubLList $list50 = list(list(makeSymbol("SUBSTRING"), makeSymbol("STRINGP")), list(makeSymbol("CASE-SENSITIVE?"), makeSymbol("BOOLEANP")), list(makeSymbol("START"), makeSymbol("FIXNUMP")));

    private static final SubLSymbol CONSTANT_POSTFIX = makeSymbol("CONSTANT-POSTFIX");

    private static final SubLList $list52 = list(makeSymbol("POSTFIX"), makeSymbol("&OPTIONAL"), makeSymbol("CASE-SENSITIVE?"), list(makeSymbol("START"), ZERO_INTEGER), makeSymbol("END"));

    private static final SubLString $str53$Return_all_valid_constants_with_P = makeString("Return all valid constants with POSTFIX as a postfix of their name\nWhen CASE-SENSITIVE? is non-nil, the comparison is done in a case-sensitive fashion.\nOptionally the START and END character positions can be\nspecified, such that the SUBSTRING matches characters between the START and \nEND range.  If no constant exists, return NIL.");

    public static final SubLList $list54 = list(list(makeSymbol("POSTFIX"), makeSymbol("STRINGP")), list(makeSymbol("CASE-SENSITIVE?"), makeSymbol("BOOLEANP")), list(makeSymbol("START"), makeSymbol("FIXNUMP")));

    public static final SubLList $list55 = list(list(makeSymbol("CONSTANT"), makeSymbol("&KEY"), makeSymbol("DONE"), list(makeSymbol("FORWARD"), T)), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLList $list56 = list(makeKeyword("DONE"), makeKeyword("FORWARD"));

    private static final SubLSymbol $ALLOW_OTHER_KEYS = makeKeyword("ALLOW-OTHER-KEYS");





    private static final SubLSymbol $sym60$ITERATOR = makeUninternedSymbol("ITERATOR");



    private static final SubLSymbol NEW_CONSTANT_COMPLETION_ITERATOR = makeSymbol("NEW-CONSTANT-COMPLETION-ITERATOR");



    private static final SubLSymbol ITERATION_FINALIZE = makeSymbol("ITERATION-FINALIZE");

    public static final SubLList $list65 = list(list(makeSymbol("CONSTANT"), makeSymbol("STRING"), makeSymbol("&KEY"), makeSymbol("DONE"), list(makeSymbol("FORWARD"), T), list(makeSymbol("CASE-SENSITIVE"), T), list(makeSymbol("START"), ZERO_INTEGER), makeSymbol("END")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLList $list66 = list(makeKeyword("DONE"), makeKeyword("FORWARD"), makeKeyword("CASE-SENSITIVE"), makeKeyword("START"), makeKeyword("END"));







    private static final SubLSymbol $sym70$ITERATOR = makeUninternedSymbol("ITERATOR");

    private static final SubLSymbol NEW_DIRECTED_CONSTANT_COMPLETION_ITERATOR = makeSymbol("NEW-DIRECTED-CONSTANT-COMPLETION-ITERATOR");

    public static SubLObject valid_constant_name_char(final SubLObject v_char) {
        SubLSystemTrampolineFile.enforceType(v_char, CHARACTERP);
        return valid_constant_name_char_p(v_char);
    }

    public static SubLObject valid_constant_name_char_p(final SubLObject v_char) {
        SubLSystemTrampolineFile.enforceType(v_char, CHARACTERP);
        return makeBoolean(((NIL != alphanumericp(v_char)) && (NIL != unicode_strings.ascii_char_p(v_char))) || (NIL != find(v_char, $str7$___, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)));
    }

    public static SubLObject valid_constant_name(final SubLObject string) {
        return valid_constant_name_p(string);
    }

    public static SubLObject valid_constant_name_p(final SubLObject string) {
        return makeBoolean((string.isString() && length(string).numGE(TWO_INTEGER)) && (NIL == find_if(symbol_function(INVALID_CONSTANT_NAME_CHAR_P), string, UNPROVIDED, UNPROVIDED, UNPROVIDED)));
    }

    public static SubLObject invalid_constant_name_char_p(final SubLObject v_char) {
        return makeBoolean(NIL == valid_constant_name_char_p(v_char));
    }

    public static SubLObject constant_name_spec_p(final SubLObject v_object) {
        return makeBoolean(($UNNAMED == v_object) || (NIL != valid_constant_name_p(v_object)));
    }

    public static SubLObject constant_name_available(final SubLObject name) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLSystemTrampolineFile.enforceType(name, STRINGP);
        if (NIL == valid_constant_name_p(name)) {
            return NIL;
        }
        if (NIL != $require_case_insensitive_name_uniqueness$.getDynamicValue(thread)) {
            return sublisp_null(constant_complete(name, NIL, T, UNPROVIDED, UNPROVIDED));
        }
        return sublisp_null(constant_complete_exact(name, UNPROVIDED, UNPROVIDED));
    }

    public static SubLObject uniquify_constant_name(final SubLObject name, SubLObject sequentialP) {
        if (sequentialP == UNPROVIDED) {
            sequentialP = NIL;
        }
        SubLSystemTrampolineFile.enforceType(name, VALID_CONSTANT_NAME_P);
        SubLSystemTrampolineFile.enforceType(sequentialP, BOOLEANP);
        if (NIL != constant_name_available(name)) {
            return name;
        }
        if (NIL != sequentialP) {
            final SubLObject known_previous_index = get_last_known_index_for_constant_prefix(name);
            SubLObject index = NIL;
            index = known_previous_index;
            SubLObject new_name;
            while (true) {
                new_name = cconcatenate(format_nil.format_nil_a_no_copy(name), new SubLObject[]{ $str24$_, format_nil.format_nil_a_no_copy(index) });
                if (NIL != constant_name_available(new_name)) {
                    break;
                }
                index = number_utilities.f_1X(index);
            } 
            set_last_known_index_for_constant_prefix(name, index);
            return new_name;
        }
        SubLObject suffix;
        SubLObject new_name2;
        for (suffix = number_utilities.f_1X(random.random(NINE_INTEGER)), new_name2 = cconcatenate(format_nil.format_nil_a_no_copy(name), new SubLObject[]{ $str24$_, format_nil.format_nil_a_no_copy(suffix) }); NIL == constant_name_available(new_name2); new_name2 = cconcatenate(format_nil.format_nil_a_no_copy(name), new SubLObject[]{ $str24$_, format_nil.format_nil_a_no_copy(suffix) })) {
            suffix = add(multiply(TEN_INTEGER, suffix), random.random(TEN_INTEGER));
        }
        return new_name2;
    }

    public static SubLObject get_last_known_index_for_constant_prefix(final SubLObject prefix) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return dictionary.dictionary_lookup($last_known_index_for_constant_prefix_dict$.getDynamicValue(thread), prefix, ONE_INTEGER);
    }

    public static SubLObject set_last_known_index_for_constant_prefix(final SubLObject prefix, final SubLObject value) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return dictionary.dictionary_enter($last_known_index_for_constant_prefix_dict$.getDynamicValue(thread), prefix, value);
    }

    public static SubLObject constant_name_case_collisions(final SubLObject string) {
        SubLSystemTrampolineFile.enforceType(string, VALID_CONSTANT_NAME_P);
        SubLObject uses = constant_complete(string, NIL, T, UNPROVIDED, UNPROVIDED);
        uses = delete(string, uses, symbol_function(EQUAL), symbol_function(CONSTANT_NAME), UNPROVIDED, UNPROVIDED, UNPROVIDED);
        return uses;
    }

    public static SubLObject constant_name_case_collision(final SubLObject string) {
        SubLSystemTrampolineFile.enforceType(string, VALID_CONSTANT_NAME_P);
        return constant_name_case_collisions(string).first();
    }

    public static SubLObject constant_complete_exact(final SubLObject string, SubLObject start, SubLObject end) {
        if (start == UNPROVIDED) {
            start = ZERO_INTEGER;
        }
        if (end == UNPROVIDED) {
            end = NIL;
        }
        // com.cyc.cycjava.cycl.constants_low.lookup_constant_by_guid();
        SubLSystemTrampolineFile.enforceType(string, STRINGP);
        SubLSystemTrampolineFile.enforceType(start, FIXNUMP);
        return constant_completion_interface.kb_constant_complete_exact(string, start, end);
    }

    public static SubLObject constant_complete(final SubLObject prefix, SubLObject case_sensitiveP, SubLObject exact_lengthP, SubLObject start, SubLObject end) {
        if (case_sensitiveP == UNPROVIDED) {
            case_sensitiveP = NIL;
        }
        if (exact_lengthP == UNPROVIDED) {
            exact_lengthP = NIL;
        }
        if (start == UNPROVIDED) {
            start = ZERO_INTEGER;
        }
        if (end == UNPROVIDED) {
            end = NIL;
        }
        SubLSystemTrampolineFile.enforceType(prefix, STRINGP);
        SubLSystemTrampolineFile.enforceType(case_sensitiveP, BOOLEANP);
        SubLSystemTrampolineFile.enforceType(exact_lengthP, BOOLEANP);
        SubLSystemTrampolineFile.enforceType(start, FIXNUMP);
        return constant_completion_interface.kb_constant_complete(prefix, case_sensitiveP, exact_lengthP, start, end);
    }

    public static SubLObject constant_apropos(final SubLObject substring, SubLObject case_sensitiveP, SubLObject start, SubLObject end) {
        if (case_sensitiveP == UNPROVIDED) {
            case_sensitiveP = NIL;
        }
        if (start == UNPROVIDED) {
            start = ZERO_INTEGER;
        }
        if (end == UNPROVIDED) {
            end = NIL;
        }
        SubLSystemTrampolineFile.enforceType(substring, STRINGP);
        SubLSystemTrampolineFile.enforceType(case_sensitiveP, BOOLEANP);
        SubLSystemTrampolineFile.enforceType(start, FIXNUMP);
        return constant_completion_interface.kb_constant_apropos(substring, case_sensitiveP, start, end);
    }

    public static SubLObject constant_postfix(final SubLObject postfix, SubLObject case_sensitiveP, SubLObject start, SubLObject end) {
        if (case_sensitiveP == UNPROVIDED) {
            case_sensitiveP = NIL;
        }
        if (start == UNPROVIDED) {
            start = ZERO_INTEGER;
        }
        if (end == UNPROVIDED) {
            end = NIL;
        }
        SubLSystemTrampolineFile.enforceType(postfix, STRINGP);
        SubLSystemTrampolineFile.enforceType(case_sensitiveP, BOOLEANP);
        SubLSystemTrampolineFile.enforceType(start, FIXNUMP);
        return constant_completion_interface.kb_constant_postfix(postfix, case_sensitiveP, start, end);
    }

    public static SubLObject n_constants_before(final SubLObject n, final SubLObject string, SubLObject case_sensitiveP, SubLObject start, SubLObject end, SubLObject strictP) {
        if (case_sensitiveP == UNPROVIDED) {
            case_sensitiveP = NIL;
        }
        if (start == UNPROVIDED) {
            start = ZERO_INTEGER;
        }
        if (end == UNPROVIDED) {
            end = NIL;
        }
        if (strictP == UNPROVIDED) {
            strictP = NIL;
        }
        return constant_completion_interface.kb_n_constants_before(n, string, case_sensitiveP, start, end, strictP);
    }

    public static SubLObject n_constants_after(final SubLObject n, final SubLObject string, SubLObject case_sensitiveP, SubLObject start, SubLObject end, SubLObject strictP) {
        if (case_sensitiveP == UNPROVIDED) {
            case_sensitiveP = NIL;
        }
        if (start == UNPROVIDED) {
            start = ZERO_INTEGER;
        }
        if (end == UNPROVIDED) {
            end = NIL;
        }
        if (strictP == UNPROVIDED) {
            strictP = NIL;
        }
        return constant_completion_interface.kb_n_constants_after(n, string, case_sensitiveP, start, end, strictP);
    }

    public static SubLObject new_constant_completion_iterator(SubLObject forwardP, SubLObject buffer_size) {
        if (forwardP == UNPROVIDED) {
            forwardP = T;
        }
        if (buffer_size == UNPROVIDED) {
            buffer_size = ONE_INTEGER;
        }
        return constant_completion_interface.kb_new_constant_completion_iterator(forwardP, buffer_size);
    }

    public static SubLObject new_directed_constant_completion_iterator(final SubLObject string, SubLObject case_sensitiveP, SubLObject start, SubLObject end, SubLObject forwardP, SubLObject buffer_size) {
        if (case_sensitiveP == UNPROVIDED) {
            case_sensitiveP = T;
        }
        if (start == UNPROVIDED) {
            start = ZERO_INTEGER;
        }
        if (end == UNPROVIDED) {
            end = NIL;
        }
        if (forwardP == UNPROVIDED) {
            forwardP = T;
        }
        if (buffer_size == UNPROVIDED) {
            buffer_size = ONE_INTEGER;
        }
        return constant_completion_interface.kb_new_directed_constant_completion_iterator(string, case_sensitiveP, start, end, forwardP, buffer_size);
    }

    public static SubLObject map_constants_in_completions(final SubLObject function) {
        final SubLObject iterator = new_constant_completion_iterator(UNPROVIDED, UNPROVIDED);
        return iteration.map_iterator(function, iterator);
    }

    public static SubLObject map_constant_completions_around(final SubLObject function, final SubLObject string, SubLObject v_forward, SubLObject start, SubLObject end) {
        if (v_forward == UNPROVIDED) {
            v_forward = T;
        }
        if (start == UNPROVIDED) {
            start = ZERO_INTEGER;
        }
        if (end == UNPROVIDED) {
            end = NIL;
        }
        final SubLObject iterator = new_directed_constant_completion_iterator(string, T, start, end, v_forward, UNPROVIDED);
        return iteration.map_iterator(function, iterator);
    }

    public static SubLObject do_constants_in_completions(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list55);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject constant = NIL;
        destructuring_bind_must_consp(current, datum, $list55);
        constant = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$1 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list55);
            current_$1 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list55);
            if (NIL == member(current_$1, $list56, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$1 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list55);
        }
        final SubLObject done_tail = property_list_member($DONE, current);
        final SubLObject done = (NIL != done_tail) ? cadr(done_tail) : NIL;
        final SubLObject forward_tail = property_list_member($FORWARD, current);
        final SubLObject v_forward = (NIL != forward_tail) ? cadr(forward_tail) : T;
        final SubLObject body;
        current = body = temp;
        final SubLObject iterator = $sym60$ITERATOR;
        return list(CLET, list(list(iterator, list(NEW_CONSTANT_COMPLETION_ITERATOR, v_forward))), listS(DO_ITERATOR, list(constant, iterator, $DONE, done), append(body, NIL)), list(ITERATION_FINALIZE, iterator));
    }

    public static SubLObject do_constant_completions_around(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list65);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject constant = NIL;
        SubLObject string = NIL;
        destructuring_bind_must_consp(current, datum, $list65);
        constant = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list65);
        string = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$2 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list65);
            current_$2 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list65);
            if (NIL == member(current_$2, $list66, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$2 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list65);
        }
        final SubLObject done_tail = property_list_member($DONE, current);
        final SubLObject done = (NIL != done_tail) ? cadr(done_tail) : NIL;
        final SubLObject forward_tail = property_list_member($FORWARD, current);
        final SubLObject v_forward = (NIL != forward_tail) ? cadr(forward_tail) : T;
        final SubLObject case_sensitive_tail = property_list_member($CASE_SENSITIVE, current);
        final SubLObject case_sensitive = (NIL != case_sensitive_tail) ? cadr(case_sensitive_tail) : T;
        final SubLObject start_tail = property_list_member($START, current);
        final SubLObject start = (NIL != start_tail) ? cadr(start_tail) : ZERO_INTEGER;
        final SubLObject end_tail = property_list_member($END, current);
        final SubLObject end = (NIL != end_tail) ? cadr(end_tail) : NIL;
        final SubLObject body;
        current = body = temp;
        final SubLObject iterator = $sym70$ITERATOR;
        return list(CLET, list(list(iterator, list(NEW_DIRECTED_CONSTANT_COMPLETION_ITERATOR, string, case_sensitive, start, end, v_forward))), listS(DO_ITERATOR, list(constant, iterator, $DONE, done), append(body, NIL)), list(ITERATION_FINALIZE, iterator));
    }

    public static SubLObject declare_constant_completion_high_file() {
        declareFunction(me, "valid_constant_name_char", "VALID-CONSTANT-NAME-CHAR", 1, 0, false);
        declareFunction(me, "valid_constant_name_char_p", "VALID-CONSTANT-NAME-CHAR-P", 1, 0, false);
        declareFunction(me, "valid_constant_name", "VALID-CONSTANT-NAME", 1, 0, false);
        declareFunction(me, "valid_constant_name_p", "VALID-CONSTANT-NAME-P", 1, 0, false);
        declareFunction(me, "invalid_constant_name_char_p", "INVALID-CONSTANT-NAME-CHAR-P", 1, 0, false);
        new constant_completion_high.$invalid_constant_name_char_p$UnaryFunction();
        declareFunction(me, "constant_name_spec_p", "CONSTANT-NAME-SPEC-P", 1, 0, false);
        declareFunction(me, "constant_name_available", "CONSTANT-NAME-AVAILABLE", 1, 0, false);
        declareFunction(me, "uniquify_constant_name", "UNIQUIFY-CONSTANT-NAME", 1, 1, false);
        declareFunction(me, "get_last_known_index_for_constant_prefix", "GET-LAST-KNOWN-INDEX-FOR-CONSTANT-PREFIX", 1, 0, false);
        declareFunction(me, "set_last_known_index_for_constant_prefix", "SET-LAST-KNOWN-INDEX-FOR-CONSTANT-PREFIX", 2, 0, false);
        declareFunction(me, "constant_name_case_collisions", "CONSTANT-NAME-CASE-COLLISIONS", 1, 0, false);
        declareFunction(me, "constant_name_case_collision", "CONSTANT-NAME-CASE-COLLISION", 1, 0, false);
        declareFunction(me, "constant_complete_exact", "CONSTANT-COMPLETE-EXACT", 1, 2, false);
        declareFunction(me, "constant_complete", "CONSTANT-COMPLETE", 1, 4, false);
        declareFunction(me, "constant_apropos", "CONSTANT-APROPOS", 1, 3, false);
        declareFunction(me, "constant_postfix", "CONSTANT-POSTFIX", 1, 3, false);
        declareFunction(me, "n_constants_before", "N-CONSTANTS-BEFORE", 2, 4, false);
        declareFunction(me, "n_constants_after", "N-CONSTANTS-AFTER", 2, 4, false);
        declareFunction(me, "new_constant_completion_iterator", "NEW-CONSTANT-COMPLETION-ITERATOR", 0, 2, false);
        declareFunction(me, "new_directed_constant_completion_iterator", "NEW-DIRECTED-CONSTANT-COMPLETION-ITERATOR", 1, 5, false);
        declareFunction(me, "map_constants_in_completions", "MAP-CONSTANTS-IN-COMPLETIONS", 1, 0, false);
        declareFunction(me, "map_constant_completions_around", "MAP-CONSTANT-COMPLETIONS-AROUND", 2, 3, false);
        declareMacro(me, "do_constants_in_completions", "DO-CONSTANTS-IN-COMPLETIONS");
        declareMacro(me, "do_constant_completions_around", "DO-CONSTANT-COMPLETIONS-AROUND");
        return NIL;
    }

    public static SubLObject init_constant_completion_high_file() {
        defparameter("*REQUIRE-CASE-INSENSITIVE-NAME-UNIQUENESS*", T);
        defparameter("*LAST-KNOWN-INDEX-FOR-CONSTANT-PREFIX-DICT*", dictionary.new_dictionary(symbol_function(EQUAL), UNPROVIDED));
        return NIL;
    }

    public static SubLObject setup_constant_completion_high_file() {
        register_obsolete_cyc_api_function(VALID_CONSTANT_NAME_CHAR, $list2, $list3, $str4$Deprecated_in_favor_of_valid_cons, $list5, $list6);
        register_cyc_api_function(VALID_CONSTANT_NAME_CHAR_P, $list3, $str9$Return_T_iff_CHAR_is_a_character_, $list5, $list6);
        register_obsolete_cyc_api_function(VALID_CONSTANT_NAME, $list11, $list12, $str13$Deprecated_in_favor_of_valid_cons, NIL, $list6);
        register_cyc_api_function(VALID_CONSTANT_NAME_P, $list12, $str16$Return_T_iff_STRING_is_a_valid_na, NIL, $list6);
        register_cyc_api_function(CONSTANT_NAME_AVAILABLE, $list20, $str21$Return_T_iff_NAME_is_a_valid_cons, $list22, $list6);
        register_cyc_api_function(UNIQUIFY_CONSTANT_NAME, $list26, $str27$Return_a_unique__currently_unused, $list28, $list29);
        register_cyc_api_function(CONSTANT_NAME_CASE_COLLISIONS, $list12, $str32$Return_a_list_of_constants_whose_, $list33, $list34);
        register_cyc_api_function(CONSTANT_NAME_CASE_COLLISION, $list12, $str36$Return_a_constant_whose_name_diff, $list33, $list37);
        register_cyc_api_function(CONSTANT_COMPLETE_EXACT, $list40, $str41$Return_a_valid_constant_whose_nam, $list42, NIL);
        register_cyc_api_function(CONSTANT_COMPLETE, $list44, $str45$Return_all_valid_constants_with_P, $list46, NIL);
        register_cyc_api_function(CONSTANT_APROPOS, $list48, $str49$Return_all_valid_constants_with_S, $list50, NIL);
        register_cyc_api_function(CONSTANT_POSTFIX, $list52, $str53$Return_all_valid_constants_with_P, $list54, NIL);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_constant_completion_high_file();
    }

    @Override
    public void initializeVariables() {
        init_constant_completion_high_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_constant_completion_high_file();
    }

    

    public static final class $invalid_constant_name_char_p$UnaryFunction extends UnaryFunction {
        public $invalid_constant_name_char_p$UnaryFunction() {
            super(extractFunctionNamed("INVALID-CONSTANT-NAME-CHAR-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return invalid_constant_name_char_p(arg1);
        }
    }
}

/**
 * Total time: 100 ms
 */
