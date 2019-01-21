package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.random;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class constant_completion_high extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.constant_completion_high";
    public static final String myFingerPrint = "01d102641265db1a0c59048ec1c0f1f2bd9ac2c3e4867cb66af5c31d5c07f569";
    @SubLTranslatedFile.SubL(source = "cycl/constant-completion-high.lisp", position = 2607L)
    public static SubLSymbol $require_case_insensitive_name_uniqueness$;
    @SubLTranslatedFile.SubL(source = "cycl/constant-completion-high.lisp", position = 4382L)
    private static SubLSymbol $last_known_index_for_constant_prefix_dict$;
    private static final SubLSymbol $sym0$CHARACTERP;
    private static final SubLSymbol $sym1$VALID_CONSTANT_NAME_CHAR;
    private static final SubLList $list2;
    private static final SubLList $list3;
    private static final SubLString $str4$Deprecated_in_favor_of_valid_cons;
    private static final SubLList $list5;
    private static final SubLList $list6;
    private static final SubLString $str7$___;
    private static final SubLSymbol $sym8$VALID_CONSTANT_NAME_CHAR_P;
    private static final SubLString $str9$Return_T_iff_CHAR_is_a_character_;
    private static final SubLSymbol $sym10$VALID_CONSTANT_NAME;
    private static final SubLList $list11;
    private static final SubLList $list12;
    private static final SubLString $str13$Deprecated_in_favor_of_valid_cons;
    private static final SubLSymbol $sym14$INVALID_CONSTANT_NAME_CHAR_P;
    private static final SubLSymbol $sym15$VALID_CONSTANT_NAME_P;
    private static final SubLString $str16$Return_T_iff_STRING_is_a_valid_na;
    private static final SubLSymbol $kw17$UNNAMED;
    private static final SubLSymbol $sym18$STRINGP;
    private static final SubLSymbol $sym19$CONSTANT_NAME_AVAILABLE;
    private static final SubLList $list20;
    private static final SubLString $str21$Return_T_iff_NAME_is_a_valid_cons;
    private static final SubLList $list22;
    private static final SubLSymbol $sym23$BOOLEANP;
    private static final SubLString $str24$_;
    private static final SubLSymbol $sym25$UNIQUIFY_CONSTANT_NAME;
    private static final SubLList $list26;
    private static final SubLString $str27$Return_a_unique__currently_unused;
    private static final SubLList $list28;
    private static final SubLList $list29;
    private static final SubLSymbol $sym30$CONSTANT_NAME;
    private static final SubLSymbol $sym31$CONSTANT_NAME_CASE_COLLISIONS;
    private static final SubLString $str32$Return_a_list_of_constants_whose_;
    private static final SubLList $list33;
    private static final SubLList $list34;
    private static final SubLSymbol $sym35$CONSTANT_NAME_CASE_COLLISION;
    private static final SubLString $str36$Return_a_constant_whose_name_diff;
    private static final SubLList $list37;
    private static final SubLSymbol $sym38$FIXNUMP;
    private static final SubLSymbol $sym39$CONSTANT_COMPLETE_EXACT;
    private static final SubLList $list40;
    private static final SubLString $str41$Return_a_valid_constant_whose_nam;
    private static final SubLList $list42;
    private static final SubLSymbol $sym43$CONSTANT_COMPLETE;
    private static final SubLList $list44;
    private static final SubLString $str45$Return_all_valid_constants_with_P;
    private static final SubLList $list46;
    private static final SubLSymbol $sym47$CONSTANT_APROPOS;
    private static final SubLList $list48;
    private static final SubLString $str49$Return_all_valid_constants_with_S;
    private static final SubLList $list50;
    private static final SubLSymbol $sym51$CONSTANT_POSTFIX;
    private static final SubLList $list52;
    private static final SubLString $str53$Return_all_valid_constants_with_P;
    private static final SubLList $list54;
    private static final SubLList $list55;
    private static final SubLList $list56;
    private static final SubLSymbol $kw57$ALLOW_OTHER_KEYS;
    private static final SubLSymbol $kw58$DONE;
    private static final SubLSymbol $kw59$FORWARD;
    private static final SubLSymbol $sym60$ITERATOR;
    private static final SubLSymbol $sym61$CLET;
    private static final SubLSymbol $sym62$NEW_CONSTANT_COMPLETION_ITERATOR;
    private static final SubLSymbol $sym63$DO_ITERATOR;
    private static final SubLSymbol $sym64$ITERATION_FINALIZE;
    private static final SubLList $list65;
    private static final SubLList $list66;
    private static final SubLSymbol $kw67$CASE_SENSITIVE;
    private static final SubLSymbol $kw68$START;
    private static final SubLSymbol $kw69$END;
    private static final SubLSymbol $sym70$ITERATOR;
    private static final SubLSymbol $sym71$NEW_DIRECTED_CONSTANT_COMPLETION_ITERATOR;

    @SubLTranslatedFile.SubL(source = "cycl/constant-completion-high.lisp", position = 849L)
    public static SubLObject valid_constant_name_char(final SubLObject v_char) {
        enforceType(v_char, constant_completion_high.$sym0$CHARACTERP);
        return valid_constant_name_char_p(v_char);
    }

    @SubLTranslatedFile.SubL(source = "cycl/constant-completion-high.lisp", position = 1323L)
    public static SubLObject valid_constant_name_char_p(final SubLObject v_char) {
        enforceType(v_char, constant_completion_high.$sym0$CHARACTERP);
        return (SubLObject)SubLObjectFactory.makeBoolean((constant_completion_high.NIL != Characters.alphanumericp(v_char) && constant_completion_high.NIL != unicode_strings.ascii_char_p(v_char)) || constant_completion_high.NIL != Sequences.find(v_char, (SubLObject)constant_completion_high.$str7$___, (SubLObject)constant_completion_high.UNPROVIDED, (SubLObject)constant_completion_high.UNPROVIDED, (SubLObject)constant_completion_high.UNPROVIDED, (SubLObject)constant_completion_high.UNPROVIDED));
    }

    @SubLTranslatedFile.SubL(source = "cycl/constant-completion-high.lisp", position = 1662L)
    public static SubLObject valid_constant_name(final SubLObject string) {
        return valid_constant_name_p(string);
    }

    @SubLTranslatedFile.SubL(source = "cycl/constant-completion-high.lisp", position = 1927L)
    public static SubLObject valid_constant_name_p(final SubLObject string) {
        return (SubLObject)SubLObjectFactory.makeBoolean(string.isString() && Sequences.length(string).numGE((SubLObject)constant_completion_high.TWO_INTEGER) && constant_completion_high.NIL == Sequences.find_if(Symbols.symbol_function((SubLObject)constant_completion_high.$sym14$INVALID_CONSTANT_NAME_CHAR_P), string, (SubLObject)constant_completion_high.UNPROVIDED, (SubLObject)constant_completion_high.UNPROVIDED, (SubLObject)constant_completion_high.UNPROVIDED));
    }

    @SubLTranslatedFile.SubL(source = "cycl/constant-completion-high.lisp", position = 2179L)
    public static SubLObject invalid_constant_name_char_p(final SubLObject v_char) {
        return (SubLObject)SubLObjectFactory.makeBoolean(constant_completion_high.NIL == valid_constant_name_char_p(v_char));
    }

    @SubLTranslatedFile.SubL(source = "cycl/constant-completion-high.lisp", position = 2365L)
    public static SubLObject constant_name_spec_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(constant_completion_high.$kw17$UNNAMED == v_object || constant_completion_high.NIL != valid_constant_name_p(v_object));
    }

    @SubLTranslatedFile.SubL(source = "cycl/constant-completion-high.lisp", position = 2860L)
    public static SubLObject constant_name_available(final SubLObject name) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        enforceType(name, constant_completion_high.$sym18$STRINGP);
        if (constant_completion_high.NIL == valid_constant_name_p(name)) {
            return (SubLObject)constant_completion_high.NIL;
        }
        if (constant_completion_high.NIL != constant_completion_high.$require_case_insensitive_name_uniqueness$.getDynamicValue(thread)) {
            return Types.sublisp_null(constant_complete(name, (SubLObject)constant_completion_high.NIL, (SubLObject)constant_completion_high.T, (SubLObject)constant_completion_high.UNPROVIDED, (SubLObject)constant_completion_high.UNPROVIDED));
        }
        return Types.sublisp_null(constant_complete_exact(name, (SubLObject)constant_completion_high.UNPROVIDED, (SubLObject)constant_completion_high.UNPROVIDED));
    }

    @SubLTranslatedFile.SubL(source = "cycl/constant-completion-high.lisp", position = 3266L)
    public static SubLObject uniquify_constant_name(final SubLObject name, SubLObject sequentialP) {
        if (sequentialP == constant_completion_high.UNPROVIDED) {
            sequentialP = (SubLObject)constant_completion_high.NIL;
        }
        enforceType(name, constant_completion_high.$sym15$VALID_CONSTANT_NAME_P);
        enforceType(sequentialP, constant_completion_high.$sym23$BOOLEANP);
        if (constant_completion_high.NIL != constant_name_available(name)) {
            return name;
        }
        if (constant_completion_high.NIL != sequentialP) {
            final SubLObject known_previous_index = get_last_known_index_for_constant_prefix(name);
            SubLObject index = (SubLObject)constant_completion_high.NIL;
            index = known_previous_index;
            SubLObject new_name;
            while (true) {
                new_name = Sequences.cconcatenate(format_nil.format_nil_a_no_copy(name), new SubLObject[] { constant_completion_high.$str24$_, format_nil.format_nil_a_no_copy(index) });
                if (constant_completion_high.NIL != constant_name_available(new_name)) {
                    break;
                }
                index = number_utilities.f_1X(index);
            }
            set_last_known_index_for_constant_prefix(name, index);
            return new_name;
        }
        SubLObject suffix;
        SubLObject new_name2;
        for (suffix = number_utilities.f_1X(random.random((SubLObject)constant_completion_high.NINE_INTEGER)), new_name2 = Sequences.cconcatenate(format_nil.format_nil_a_no_copy(name), new SubLObject[] { constant_completion_high.$str24$_, format_nil.format_nil_a_no_copy(suffix) }); constant_completion_high.NIL == constant_name_available(new_name2); new_name2 = Sequences.cconcatenate(format_nil.format_nil_a_no_copy(name), new SubLObject[] { constant_completion_high.$str24$_, format_nil.format_nil_a_no_copy(suffix) })) {
            suffix = Numbers.add(Numbers.multiply((SubLObject)constant_completion_high.TEN_INTEGER, suffix), random.random((SubLObject)constant_completion_high.TEN_INTEGER));
        }
        return new_name2;
    }

    @SubLTranslatedFile.SubL(source = "cycl/constant-completion-high.lisp", position = 4475L)
    public static SubLObject get_last_known_index_for_constant_prefix(final SubLObject prefix) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return dictionary.dictionary_lookup(constant_completion_high.$last_known_index_for_constant_prefix_dict$.getDynamicValue(thread), prefix, (SubLObject)constant_completion_high.ONE_INTEGER);
    }

    @SubLTranslatedFile.SubL(source = "cycl/constant-completion-high.lisp", position = 4623L)
    public static SubLObject set_last_known_index_for_constant_prefix(final SubLObject prefix, final SubLObject value) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return dictionary.dictionary_enter(constant_completion_high.$last_known_index_for_constant_prefix_dict$.getDynamicValue(thread), prefix, value);
    }

    @SubLTranslatedFile.SubL(source = "cycl/constant-completion-high.lisp", position = 4780L)
    public static SubLObject constant_name_case_collisions(final SubLObject string) {
        enforceType(string, constant_completion_high.$sym15$VALID_CONSTANT_NAME_P);
        SubLObject uses = constant_complete(string, (SubLObject)constant_completion_high.NIL, (SubLObject)constant_completion_high.T, (SubLObject)constant_completion_high.UNPROVIDED, (SubLObject)constant_completion_high.UNPROVIDED);
        uses = Sequences.delete(string, uses, Symbols.symbol_function((SubLObject)constant_completion_high.EQUAL), Symbols.symbol_function((SubLObject)constant_completion_high.$sym30$CONSTANT_NAME), (SubLObject)constant_completion_high.UNPROVIDED, (SubLObject)constant_completion_high.UNPROVIDED, (SubLObject)constant_completion_high.UNPROVIDED);
        return uses;
    }

    @SubLTranslatedFile.SubL(source = "cycl/constant-completion-high.lisp", position = 5224L)
    public static SubLObject constant_name_case_collision(final SubLObject string) {
        enforceType(string, constant_completion_high.$sym15$VALID_CONSTANT_NAME_P);
        return constant_name_case_collisions(string).first();
    }

    @SubLTranslatedFile.SubL(source = "cycl/constant-completion-high.lisp", position = 5485L)
    public static SubLObject constant_complete_exact(final SubLObject string, SubLObject start, SubLObject end) {
        if (start == constant_completion_high.UNPROVIDED) {
            start = (SubLObject)constant_completion_high.ZERO_INTEGER;
        }
        if (end == constant_completion_high.UNPROVIDED) {
            end = (SubLObject)constant_completion_high.NIL;
        }
       //com.cyc.cycjava.cycl.constants_low.lookup_constant_by_guid();
        enforceType(string, constant_completion_high.$sym18$STRINGP);
        enforceType(start, constant_completion_high.$sym38$FIXNUMP);
        return constant_completion_interface.kb_constant_complete_exact(string, start, end);
    }

    @SubLTranslatedFile.SubL(source = "cycl/constant-completion-high.lisp", position = 6002L)
    public static SubLObject constant_complete(final SubLObject prefix, SubLObject case_sensitiveP, SubLObject exact_lengthP, SubLObject start, SubLObject end) {
        if (case_sensitiveP == constant_completion_high.UNPROVIDED) {
            case_sensitiveP = (SubLObject)constant_completion_high.NIL;
        }
        if (exact_lengthP == constant_completion_high.UNPROVIDED) {
            exact_lengthP = (SubLObject)constant_completion_high.NIL;
        }
        if (start == constant_completion_high.UNPROVIDED) {
            start = (SubLObject)constant_completion_high.ZERO_INTEGER;
        }
        if (end == constant_completion_high.UNPROVIDED) {
            end = (SubLObject)constant_completion_high.NIL;
        }
        enforceType(prefix, constant_completion_high.$sym18$STRINGP);
        enforceType(case_sensitiveP, constant_completion_high.$sym23$BOOLEANP);
        enforceType(exact_lengthP, constant_completion_high.$sym23$BOOLEANP);
        enforceType(start, constant_completion_high.$sym38$FIXNUMP);
        return constant_completion_interface.kb_constant_complete(prefix, case_sensitiveP, exact_lengthP, start, end);
    }

    @SubLTranslatedFile.SubL(source = "cycl/constant-completion-high.lisp", position = 6697L)
    public static SubLObject constant_apropos(final SubLObject substring, SubLObject case_sensitiveP, SubLObject start, SubLObject end) {
        if (case_sensitiveP == constant_completion_high.UNPROVIDED) {
            case_sensitiveP = (SubLObject)constant_completion_high.NIL;
        }
        if (start == constant_completion_high.UNPROVIDED) {
            start = (SubLObject)constant_completion_high.ZERO_INTEGER;
        }
        if (end == constant_completion_high.UNPROVIDED) {
            end = (SubLObject)constant_completion_high.NIL;
        }
        enforceType(substring, constant_completion_high.$sym18$STRINGP);
        enforceType(case_sensitiveP, constant_completion_high.$sym23$BOOLEANP);
        enforceType(start, constant_completion_high.$sym38$FIXNUMP);
        return constant_completion_interface.kb_constant_apropos(substring, case_sensitiveP, start, end);
    }

    @SubLTranslatedFile.SubL(source = "cycl/constant-completion-high.lisp", position = 7278L)
    public static SubLObject constant_postfix(final SubLObject postfix, SubLObject case_sensitiveP, SubLObject start, SubLObject end) {
        if (case_sensitiveP == constant_completion_high.UNPROVIDED) {
            case_sensitiveP = (SubLObject)constant_completion_high.NIL;
        }
        if (start == constant_completion_high.UNPROVIDED) {
            start = (SubLObject)constant_completion_high.ZERO_INTEGER;
        }
        if (end == constant_completion_high.UNPROVIDED) {
            end = (SubLObject)constant_completion_high.NIL;
        }
        enforceType(postfix, constant_completion_high.$sym18$STRINGP);
        enforceType(case_sensitiveP, constant_completion_high.$sym23$BOOLEANP);
        enforceType(start, constant_completion_high.$sym38$FIXNUMP);
        return constant_completion_interface.kb_constant_postfix(postfix, case_sensitiveP, start, end);
    }

    @SubLTranslatedFile.SubL(source = "cycl/constant-completion-high.lisp", position = 7854L)
    public static SubLObject n_constants_before(final SubLObject n, final SubLObject string, SubLObject case_sensitiveP, SubLObject start, SubLObject end, SubLObject strictP) {
        if (case_sensitiveP == constant_completion_high.UNPROVIDED) {
            case_sensitiveP = (SubLObject)constant_completion_high.NIL;
        }
        if (start == constant_completion_high.UNPROVIDED) {
            start = (SubLObject)constant_completion_high.ZERO_INTEGER;
        }
        if (end == constant_completion_high.UNPROVIDED) {
            end = (SubLObject)constant_completion_high.NIL;
        }
        if (strictP == constant_completion_high.UNPROVIDED) {
            strictP = (SubLObject)constant_completion_high.NIL;
        }
        return constant_completion_interface.kb_n_constants_before(n, string, case_sensitiveP, start, end, strictP);
    }

    @SubLTranslatedFile.SubL(source = "cycl/constant-completion-high.lisp", position = 8397L)
    public static SubLObject n_constants_after(final SubLObject n, final SubLObject string, SubLObject case_sensitiveP, SubLObject start, SubLObject end, SubLObject strictP) {
        if (case_sensitiveP == constant_completion_high.UNPROVIDED) {
            case_sensitiveP = (SubLObject)constant_completion_high.NIL;
        }
        if (start == constant_completion_high.UNPROVIDED) {
            start = (SubLObject)constant_completion_high.ZERO_INTEGER;
        }
        if (end == constant_completion_high.UNPROVIDED) {
            end = (SubLObject)constant_completion_high.NIL;
        }
        if (strictP == constant_completion_high.UNPROVIDED) {
            strictP = (SubLObject)constant_completion_high.NIL;
        }
        return constant_completion_interface.kb_n_constants_after(n, string, case_sensitiveP, start, end, strictP);
    }

    @SubLTranslatedFile.SubL(source = "cycl/constant-completion-high.lisp", position = 8935L)
    public static SubLObject new_constant_completion_iterator(SubLObject forwardP, SubLObject buffer_size) {
        if (forwardP == constant_completion_high.UNPROVIDED) {
            forwardP = (SubLObject)constant_completion_high.T;
        }
        if (buffer_size == constant_completion_high.UNPROVIDED) {
            buffer_size = (SubLObject)constant_completion_high.ONE_INTEGER;
        }
        return constant_completion_interface.kb_new_constant_completion_iterator(forwardP, buffer_size);
    }

    @SubLTranslatedFile.SubL(source = "cycl/constant-completion-high.lisp", position = 9094L)
    public static SubLObject new_directed_constant_completion_iterator(final SubLObject string, SubLObject case_sensitiveP, SubLObject start, SubLObject end, SubLObject forwardP, SubLObject buffer_size) {
        if (case_sensitiveP == constant_completion_high.UNPROVIDED) {
            case_sensitiveP = (SubLObject)constant_completion_high.T;
        }
        if (start == constant_completion_high.UNPROVIDED) {
            start = (SubLObject)constant_completion_high.ZERO_INTEGER;
        }
        if (end == constant_completion_high.UNPROVIDED) {
            end = (SubLObject)constant_completion_high.NIL;
        }
        if (forwardP == constant_completion_high.UNPROVIDED) {
            forwardP = (SubLObject)constant_completion_high.T;
        }
        if (buffer_size == constant_completion_high.UNPROVIDED) {
            buffer_size = (SubLObject)constant_completion_high.ONE_INTEGER;
        }
        return constant_completion_interface.kb_new_directed_constant_completion_iterator(string, case_sensitiveP, start, end, forwardP, buffer_size);
    }

    @SubLTranslatedFile.SubL(source = "cycl/constant-completion-high.lisp", position = 9353L)
    public static SubLObject map_constants_in_completions(final SubLObject function) {
        final SubLObject iterator = new_constant_completion_iterator((SubLObject)constant_completion_high.UNPROVIDED, (SubLObject)constant_completion_high.UNPROVIDED);
        return iteration.map_iterator(function, iterator);
    }

    @SubLTranslatedFile.SubL(source = "cycl/constant-completion-high.lisp", position = 9570L)
    public static SubLObject map_constant_completions_around(final SubLObject function, final SubLObject string, SubLObject v_forward, SubLObject start, SubLObject end) {
        if (v_forward == constant_completion_high.UNPROVIDED) {
            v_forward = (SubLObject)constant_completion_high.T;
        }
        if (start == constant_completion_high.UNPROVIDED) {
            start = (SubLObject)constant_completion_high.ZERO_INTEGER;
        }
        if (end == constant_completion_high.UNPROVIDED) {
            end = (SubLObject)constant_completion_high.NIL;
        }
        final SubLObject iterator = new_directed_constant_completion_iterator(string, (SubLObject)constant_completion_high.T, start, end, v_forward, (SubLObject)constant_completion_high.UNPROVIDED);
        return iteration.map_iterator(function, iterator);
    }

    @SubLTranslatedFile.SubL(source = "cycl/constant-completion-high.lisp", position = 9962L)
    public static SubLObject do_constants_in_completions(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)constant_completion_high.$list55);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject constant = (SubLObject)constant_completion_high.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)constant_completion_high.$list55);
        constant = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = (SubLObject)constant_completion_high.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)constant_completion_high.NIL;
        SubLObject current_$1 = (SubLObject)constant_completion_high.NIL;
        while (constant_completion_high.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)constant_completion_high.$list55);
            current_$1 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)constant_completion_high.$list55);
            if (constant_completion_high.NIL == conses_high.member(current_$1, (SubLObject)constant_completion_high.$list56, (SubLObject)constant_completion_high.UNPROVIDED, (SubLObject)constant_completion_high.UNPROVIDED)) {
                bad = (SubLObject)constant_completion_high.T;
            }
            if (current_$1 == constant_completion_high.$kw57$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (constant_completion_high.NIL != bad && constant_completion_high.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)constant_completion_high.$list55);
        }
        final SubLObject done_tail = cdestructuring_bind.property_list_member((SubLObject)constant_completion_high.$kw58$DONE, current);
        final SubLObject done = (SubLObject)((constant_completion_high.NIL != done_tail) ? conses_high.cadr(done_tail) : constant_completion_high.NIL);
        final SubLObject forward_tail = cdestructuring_bind.property_list_member((SubLObject)constant_completion_high.$kw59$FORWARD, current);
        final SubLObject v_forward = (SubLObject)((constant_completion_high.NIL != forward_tail) ? conses_high.cadr(forward_tail) : constant_completion_high.T);
        final SubLObject body;
        current = (body = temp);
        final SubLObject iterator = (SubLObject)constant_completion_high.$sym60$ITERATOR;
        return (SubLObject)ConsesLow.list((SubLObject)constant_completion_high.$sym61$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(iterator, (SubLObject)ConsesLow.list((SubLObject)constant_completion_high.$sym62$NEW_CONSTANT_COMPLETION_ITERATOR, v_forward))), (SubLObject)ConsesLow.listS((SubLObject)constant_completion_high.$sym63$DO_ITERATOR, (SubLObject)ConsesLow.list(constant, iterator, (SubLObject)constant_completion_high.$kw58$DONE, done), ConsesLow.append(body, (SubLObject)constant_completion_high.NIL)), (SubLObject)ConsesLow.list((SubLObject)constant_completion_high.$sym64$ITERATION_FINALIZE, iterator));
    }

    @SubLTranslatedFile.SubL(source = "cycl/constant-completion-high.lisp", position = 10265L)
    public static SubLObject do_constant_completions_around(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)constant_completion_high.$list65);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject constant = (SubLObject)constant_completion_high.NIL;
        SubLObject string = (SubLObject)constant_completion_high.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)constant_completion_high.$list65);
        constant = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)constant_completion_high.$list65);
        string = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = (SubLObject)constant_completion_high.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)constant_completion_high.NIL;
        SubLObject current_$2 = (SubLObject)constant_completion_high.NIL;
        while (constant_completion_high.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)constant_completion_high.$list65);
            current_$2 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)constant_completion_high.$list65);
            if (constant_completion_high.NIL == conses_high.member(current_$2, (SubLObject)constant_completion_high.$list66, (SubLObject)constant_completion_high.UNPROVIDED, (SubLObject)constant_completion_high.UNPROVIDED)) {
                bad = (SubLObject)constant_completion_high.T;
            }
            if (current_$2 == constant_completion_high.$kw57$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (constant_completion_high.NIL != bad && constant_completion_high.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)constant_completion_high.$list65);
        }
        final SubLObject done_tail = cdestructuring_bind.property_list_member((SubLObject)constant_completion_high.$kw58$DONE, current);
        final SubLObject done = (SubLObject)((constant_completion_high.NIL != done_tail) ? conses_high.cadr(done_tail) : constant_completion_high.NIL);
        final SubLObject forward_tail = cdestructuring_bind.property_list_member((SubLObject)constant_completion_high.$kw59$FORWARD, current);
        final SubLObject v_forward = (SubLObject)((constant_completion_high.NIL != forward_tail) ? conses_high.cadr(forward_tail) : constant_completion_high.T);
        final SubLObject case_sensitive_tail = cdestructuring_bind.property_list_member((SubLObject)constant_completion_high.$kw67$CASE_SENSITIVE, current);
        final SubLObject case_sensitive = (SubLObject)((constant_completion_high.NIL != case_sensitive_tail) ? conses_high.cadr(case_sensitive_tail) : constant_completion_high.T);
        final SubLObject start_tail = cdestructuring_bind.property_list_member((SubLObject)constant_completion_high.$kw68$START, current);
        final SubLObject start = (SubLObject)((constant_completion_high.NIL != start_tail) ? conses_high.cadr(start_tail) : constant_completion_high.ZERO_INTEGER);
        final SubLObject end_tail = cdestructuring_bind.property_list_member((SubLObject)constant_completion_high.$kw69$END, current);
        final SubLObject end = (SubLObject)((constant_completion_high.NIL != end_tail) ? conses_high.cadr(end_tail) : constant_completion_high.NIL);
        final SubLObject body;
        current = (body = temp);
        final SubLObject iterator = (SubLObject)constant_completion_high.$sym70$ITERATOR;
        return (SubLObject)ConsesLow.list((SubLObject)constant_completion_high.$sym61$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(iterator, (SubLObject)ConsesLow.list((SubLObject)constant_completion_high.$sym71$NEW_DIRECTED_CONSTANT_COMPLETION_ITERATOR, string, case_sensitive, start, end, v_forward))), (SubLObject)ConsesLow.listS((SubLObject)constant_completion_high.$sym63$DO_ITERATOR, (SubLObject)ConsesLow.list(constant, iterator, (SubLObject)constant_completion_high.$kw58$DONE, done), ConsesLow.append(body, (SubLObject)constant_completion_high.NIL)), (SubLObject)ConsesLow.list((SubLObject)constant_completion_high.$sym64$ITERATION_FINALIZE, iterator));
    }

    public static SubLObject declare_constant_completion_high_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.constant_completion_high", "valid_constant_name_char", "VALID-CONSTANT-NAME-CHAR", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.constant_completion_high", "valid_constant_name_char_p", "VALID-CONSTANT-NAME-CHAR-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.constant_completion_high", "valid_constant_name", "VALID-CONSTANT-NAME", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.constant_completion_high", "valid_constant_name_p", "VALID-CONSTANT-NAME-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.constant_completion_high", "invalid_constant_name_char_p", "INVALID-CONSTANT-NAME-CHAR-P", 1, 0, false);
        new $invalid_constant_name_char_p$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.constant_completion_high", "constant_name_spec_p", "CONSTANT-NAME-SPEC-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.constant_completion_high", "constant_name_available", "CONSTANT-NAME-AVAILABLE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.constant_completion_high", "uniquify_constant_name", "UNIQUIFY-CONSTANT-NAME", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.constant_completion_high", "get_last_known_index_for_constant_prefix", "GET-LAST-KNOWN-INDEX-FOR-CONSTANT-PREFIX", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.constant_completion_high", "set_last_known_index_for_constant_prefix", "SET-LAST-KNOWN-INDEX-FOR-CONSTANT-PREFIX", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.constant_completion_high", "constant_name_case_collisions", "CONSTANT-NAME-CASE-COLLISIONS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.constant_completion_high", "constant_name_case_collision", "CONSTANT-NAME-CASE-COLLISION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.constant_completion_high", "constant_complete_exact", "CONSTANT-COMPLETE-EXACT", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.constant_completion_high", "constant_complete", "CONSTANT-COMPLETE", 1, 4, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.constant_completion_high", "constant_apropos", "CONSTANT-APROPOS", 1, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.constant_completion_high", "constant_postfix", "CONSTANT-POSTFIX", 1, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.constant_completion_high", "n_constants_before", "N-CONSTANTS-BEFORE", 2, 4, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.constant_completion_high", "n_constants_after", "N-CONSTANTS-AFTER", 2, 4, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.constant_completion_high", "new_constant_completion_iterator", "NEW-CONSTANT-COMPLETION-ITERATOR", 0, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.constant_completion_high", "new_directed_constant_completion_iterator", "NEW-DIRECTED-CONSTANT-COMPLETION-ITERATOR", 1, 5, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.constant_completion_high", "map_constants_in_completions", "MAP-CONSTANTS-IN-COMPLETIONS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.constant_completion_high", "map_constant_completions_around", "MAP-CONSTANT-COMPLETIONS-AROUND", 2, 3, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.constant_completion_high", "do_constants_in_completions", "DO-CONSTANTS-IN-COMPLETIONS");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.constant_completion_high", "do_constant_completions_around", "DO-CONSTANT-COMPLETIONS-AROUND");
        return (SubLObject)constant_completion_high.NIL;
    }

    public static SubLObject init_constant_completion_high_file() {
        constant_completion_high.$require_case_insensitive_name_uniqueness$ = SubLFiles.defparameter("*REQUIRE-CASE-INSENSITIVE-NAME-UNIQUENESS*", (SubLObject)constant_completion_high.T);
        constant_completion_high.$last_known_index_for_constant_prefix_dict$ = SubLFiles.defparameter("*LAST-KNOWN-INDEX-FOR-CONSTANT-PREFIX-DICT*", dictionary.new_dictionary(Symbols.symbol_function((SubLObject)constant_completion_high.EQUAL), (SubLObject)constant_completion_high.UNPROVIDED));
        return (SubLObject)constant_completion_high.NIL;
    }

    public static SubLObject setup_constant_completion_high_file() {
        utilities_macros.register_obsolete_cyc_api_function((SubLObject)constant_completion_high.$sym1$VALID_CONSTANT_NAME_CHAR, (SubLObject)constant_completion_high.$list2, (SubLObject)constant_completion_high.$list3, (SubLObject)constant_completion_high.$str4$Deprecated_in_favor_of_valid_cons, (SubLObject)constant_completion_high.$list5, (SubLObject)constant_completion_high.$list6);
        utilities_macros.register_cyc_api_function((SubLObject)constant_completion_high.$sym8$VALID_CONSTANT_NAME_CHAR_P, (SubLObject)constant_completion_high.$list3, (SubLObject)constant_completion_high.$str9$Return_T_iff_CHAR_is_a_character_, (SubLObject)constant_completion_high.$list5, (SubLObject)constant_completion_high.$list6);
        utilities_macros.register_obsolete_cyc_api_function((SubLObject)constant_completion_high.$sym10$VALID_CONSTANT_NAME, (SubLObject)constant_completion_high.$list11, (SubLObject)constant_completion_high.$list12, (SubLObject)constant_completion_high.$str13$Deprecated_in_favor_of_valid_cons, (SubLObject)constant_completion_high.NIL, (SubLObject)constant_completion_high.$list6);
        utilities_macros.register_cyc_api_function((SubLObject)constant_completion_high.$sym15$VALID_CONSTANT_NAME_P, (SubLObject)constant_completion_high.$list12, (SubLObject)constant_completion_high.$str16$Return_T_iff_STRING_is_a_valid_na, (SubLObject)constant_completion_high.NIL, (SubLObject)constant_completion_high.$list6);
        utilities_macros.register_cyc_api_function((SubLObject)constant_completion_high.$sym19$CONSTANT_NAME_AVAILABLE, (SubLObject)constant_completion_high.$list20, (SubLObject)constant_completion_high.$str21$Return_T_iff_NAME_is_a_valid_cons, (SubLObject)constant_completion_high.$list22, (SubLObject)constant_completion_high.$list6);
        utilities_macros.register_cyc_api_function((SubLObject)constant_completion_high.$sym25$UNIQUIFY_CONSTANT_NAME, (SubLObject)constant_completion_high.$list26, (SubLObject)constant_completion_high.$str27$Return_a_unique__currently_unused, (SubLObject)constant_completion_high.$list28, (SubLObject)constant_completion_high.$list29);
        utilities_macros.register_cyc_api_function((SubLObject)constant_completion_high.$sym31$CONSTANT_NAME_CASE_COLLISIONS, (SubLObject)constant_completion_high.$list12, (SubLObject)constant_completion_high.$str32$Return_a_list_of_constants_whose_, (SubLObject)constant_completion_high.$list33, (SubLObject)constant_completion_high.$list34);
        utilities_macros.register_cyc_api_function((SubLObject)constant_completion_high.$sym35$CONSTANT_NAME_CASE_COLLISION, (SubLObject)constant_completion_high.$list12, (SubLObject)constant_completion_high.$str36$Return_a_constant_whose_name_diff, (SubLObject)constant_completion_high.$list33, (SubLObject)constant_completion_high.$list37);
        utilities_macros.register_cyc_api_function((SubLObject)constant_completion_high.$sym39$CONSTANT_COMPLETE_EXACT, (SubLObject)constant_completion_high.$list40, (SubLObject)constant_completion_high.$str41$Return_a_valid_constant_whose_nam, (SubLObject)constant_completion_high.$list42, (SubLObject)constant_completion_high.NIL);
        utilities_macros.register_cyc_api_function((SubLObject)constant_completion_high.$sym43$CONSTANT_COMPLETE, (SubLObject)constant_completion_high.$list44, (SubLObject)constant_completion_high.$str45$Return_all_valid_constants_with_P, (SubLObject)constant_completion_high.$list46, (SubLObject)constant_completion_high.NIL);
        utilities_macros.register_cyc_api_function((SubLObject)constant_completion_high.$sym47$CONSTANT_APROPOS, (SubLObject)constant_completion_high.$list48, (SubLObject)constant_completion_high.$str49$Return_all_valid_constants_with_S, (SubLObject)constant_completion_high.$list50, (SubLObject)constant_completion_high.NIL);
        utilities_macros.register_cyc_api_function((SubLObject)constant_completion_high.$sym51$CONSTANT_POSTFIX, (SubLObject)constant_completion_high.$list52, (SubLObject)constant_completion_high.$str53$Return_all_valid_constants_with_P, (SubLObject)constant_completion_high.$list54, (SubLObject)constant_completion_high.NIL);
        return (SubLObject)constant_completion_high.NIL;
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

    static {
        me = (SubLFile)new constant_completion_high();
        constant_completion_high.$require_case_insensitive_name_uniqueness$ = null;
        constant_completion_high.$last_known_index_for_constant_prefix_dict$ = null;
        $sym0$CHARACTERP = SubLObjectFactory.makeSymbol("CHARACTERP");
        $sym1$VALID_CONSTANT_NAME_CHAR = SubLObjectFactory.makeSymbol("VALID-CONSTANT-NAME-CHAR");
        $list2 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("VALID-CONSTANT-NAME-CHAR-P"));
        $list3 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CHAR"));
        $str4$Deprecated_in_favor_of_valid_cons = SubLObjectFactory.makeString("Deprecated in favor of valid-constant-name-char-p\n   Return T iff CHAR is a character which is allowed in a valid constant name.");
        $list5 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CHAR"), (SubLObject)SubLObjectFactory.makeSymbol("CHARACTERP")));
        $list6 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("BOOLEANP"));
        $str7$___ = SubLObjectFactory.makeString("-_:");
        $sym8$VALID_CONSTANT_NAME_CHAR_P = SubLObjectFactory.makeSymbol("VALID-CONSTANT-NAME-CHAR-P");
        $str9$Return_T_iff_CHAR_is_a_character_ = SubLObjectFactory.makeString("Return T iff CHAR is a character which is allowed in a valid constant name.");
        $sym10$VALID_CONSTANT_NAME = SubLObjectFactory.makeSymbol("VALID-CONSTANT-NAME");
        $list11 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("VALID-CONSTANT-NAME-P"));
        $list12 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("STRING"));
        $str13$Deprecated_in_favor_of_valid_cons = SubLObjectFactory.makeString("Deprecated in favor of valid-constant-name-p\n   Return T iff STRING is a valid name for a constant.");
        $sym14$INVALID_CONSTANT_NAME_CHAR_P = SubLObjectFactory.makeSymbol("INVALID-CONSTANT-NAME-CHAR-P");
        $sym15$VALID_CONSTANT_NAME_P = SubLObjectFactory.makeSymbol("VALID-CONSTANT-NAME-P");
        $str16$Return_T_iff_STRING_is_a_valid_na = SubLObjectFactory.makeString("Return T iff STRING is a valid name for a constant.");
        $kw17$UNNAMED = SubLObjectFactory.makeKeyword("UNNAMED");
        $sym18$STRINGP = SubLObjectFactory.makeSymbol("STRINGP");
        $sym19$CONSTANT_NAME_AVAILABLE = SubLObjectFactory.makeSymbol("CONSTANT-NAME-AVAILABLE");
        $list20 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NAME"));
        $str21$Return_T_iff_NAME_is_a_valid_cons = SubLObjectFactory.makeString("Return T iff NAME is a valid constant name currently available for use.");
        $list22 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NAME"), (SubLObject)SubLObjectFactory.makeSymbol("STRINGP")));
        $sym23$BOOLEANP = SubLObjectFactory.makeSymbol("BOOLEANP");
        $str24$_ = SubLObjectFactory.makeString("-");
        $sym25$UNIQUIFY_CONSTANT_NAME = SubLObjectFactory.makeSymbol("UNIQUIFY-CONSTANT-NAME");
        $list26 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NAME"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SEQUENTIAL?"), (SubLObject)constant_completion_high.NIL));
        $str27$Return_a_unique__currently_unused = SubLObjectFactory.makeString("Return a unique, currently unused constant name based on NAME, which must be a valid constant name. If sequential is set to true it picks the first available sequential digit if NAME is already in use (default is false).");
        $list28 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NAME"), (SubLObject)SubLObjectFactory.makeSymbol("VALID-CONSTANT-NAME-P")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SEQUENTIAL?"), (SubLObject)SubLObjectFactory.makeSymbol("BOOLEANP")));
        $list29 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("STRINGP"));
        $sym30$CONSTANT_NAME = SubLObjectFactory.makeSymbol("CONSTANT-NAME");
        $sym31$CONSTANT_NAME_CASE_COLLISIONS = SubLObjectFactory.makeSymbol("CONSTANT-NAME-CASE-COLLISIONS");
        $str32$Return_a_list_of_constants_whose_ = SubLObjectFactory.makeString("Return a list of constants whose names differ from STRING only by case.");
        $list33 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("STRING"), (SubLObject)SubLObjectFactory.makeSymbol("VALID-CONSTANT-NAME-P")));
        $list34 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LISTP"));
        $sym35$CONSTANT_NAME_CASE_COLLISION = SubLObjectFactory.makeSymbol("CONSTANT-NAME-CASE-COLLISION");
        $str36$Return_a_constant_whose_name_diff = SubLObjectFactory.makeString("Return a constant whose name differs from STRING only by case.");
        $list37 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CONSTANT-P"));
        $sym38$FIXNUMP = SubLObjectFactory.makeSymbol("FIXNUMP");
        $sym39$CONSTANT_COMPLETE_EXACT = SubLObjectFactory.makeSymbol("CONSTANT-COMPLETE-EXACT");
        $list40 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("STRING"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("START"), (SubLObject)constant_completion_high.ZERO_INTEGER), (SubLObject)SubLObjectFactory.makeSymbol("END"));
        $str41$Return_a_valid_constant_whose_nam = SubLObjectFactory.makeString("Return a valid constant whose name exactly matches STRING.\nOptionally the START and END character positions can be\nspecified, such that the STRING matches characters between the START and \nEND range.  If no constant exists, return NIL.");
        $list42 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("STRING"), (SubLObject)SubLObjectFactory.makeSymbol("STRINGP")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("START"), (SubLObject)SubLObjectFactory.makeSymbol("FIXNUMP")));
        $sym43$CONSTANT_COMPLETE = SubLObjectFactory.makeSymbol("CONSTANT-COMPLETE");
        $list44 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PREFIX"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("CASE-SENSITIVE?"), (SubLObject)SubLObjectFactory.makeSymbol("EXACT-LENGTH?"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("START"), (SubLObject)constant_completion_high.ZERO_INTEGER), (SubLObject)SubLObjectFactory.makeSymbol("END"));
        $str45$Return_all_valid_constants_with_P = SubLObjectFactory.makeString("Return all valid constants with PREFIX as a prefix of their name\nWhen CASE-SENSITIVE? is non-nil, the comparison is done in a case-sensitive fashion.\nWhen EXACT-LENGTH? is non-nil, the prefix must be the entire string\nOptionally the START and END character positions can be\nspecified, such that the PREFIX matches characters between the START and \nEND range.  If no constant exists, return NIL.");
        $list46 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PREFIX"), (SubLObject)SubLObjectFactory.makeSymbol("STRINGP")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CASE-SENSITIVE?"), (SubLObject)SubLObjectFactory.makeSymbol("BOOLEANP")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("EXACT-LENGTH?"), (SubLObject)SubLObjectFactory.makeSymbol("BOOLEANP")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("START"), (SubLObject)SubLObjectFactory.makeSymbol("FIXNUMP")));
        $sym47$CONSTANT_APROPOS = SubLObjectFactory.makeSymbol("CONSTANT-APROPOS");
        $list48 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SUBSTRING"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("CASE-SENSITIVE?"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("START"), (SubLObject)constant_completion_high.ZERO_INTEGER), (SubLObject)SubLObjectFactory.makeSymbol("END"));
        $str49$Return_all_valid_constants_with_S = SubLObjectFactory.makeString("Return all valid constants with SUBSTRING somewhere in their name\nWhen CASE-SENSITIVE? is non-nil, the comparison is done in a case-sensitive fashion.\nOptionally the START and END character positions can be\nspecified, such that the SUBSTRING matches characters between the START and \nEND range.  If no constant exists, return NIL.");
        $list50 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SUBSTRING"), (SubLObject)SubLObjectFactory.makeSymbol("STRINGP")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CASE-SENSITIVE?"), (SubLObject)SubLObjectFactory.makeSymbol("BOOLEANP")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("START"), (SubLObject)SubLObjectFactory.makeSymbol("FIXNUMP")));
        $sym51$CONSTANT_POSTFIX = SubLObjectFactory.makeSymbol("CONSTANT-POSTFIX");
        $list52 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("POSTFIX"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("CASE-SENSITIVE?"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("START"), (SubLObject)constant_completion_high.ZERO_INTEGER), (SubLObject)SubLObjectFactory.makeSymbol("END"));
        $str53$Return_all_valid_constants_with_P = SubLObjectFactory.makeString("Return all valid constants with POSTFIX as a postfix of their name\nWhen CASE-SENSITIVE? is non-nil, the comparison is done in a case-sensitive fashion.\nOptionally the START and END character positions can be\nspecified, such that the SUBSTRING matches characters between the START and \nEND range.  If no constant exists, return NIL.");
        $list54 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("POSTFIX"), (SubLObject)SubLObjectFactory.makeSymbol("STRINGP")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CASE-SENSITIVE?"), (SubLObject)SubLObjectFactory.makeSymbol("BOOLEANP")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("START"), (SubLObject)SubLObjectFactory.makeSymbol("FIXNUMP")));
        $list55 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CONSTANT"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("DONE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FORWARD"), (SubLObject)constant_completion_high.T)), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $list56 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("DONE"), (SubLObject)SubLObjectFactory.makeKeyword("FORWARD"));
        $kw57$ALLOW_OTHER_KEYS = SubLObjectFactory.makeKeyword("ALLOW-OTHER-KEYS");
        $kw58$DONE = SubLObjectFactory.makeKeyword("DONE");
        $kw59$FORWARD = SubLObjectFactory.makeKeyword("FORWARD");
        $sym60$ITERATOR = SubLObjectFactory.makeUninternedSymbol("ITERATOR");
        $sym61$CLET = SubLObjectFactory.makeSymbol("CLET");
        $sym62$NEW_CONSTANT_COMPLETION_ITERATOR = SubLObjectFactory.makeSymbol("NEW-CONSTANT-COMPLETION-ITERATOR");
        $sym63$DO_ITERATOR = SubLObjectFactory.makeSymbol("DO-ITERATOR");
        $sym64$ITERATION_FINALIZE = SubLObjectFactory.makeSymbol("ITERATION-FINALIZE");
        $list65 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CONSTANT"), (SubLObject)SubLObjectFactory.makeSymbol("STRING"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("DONE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FORWARD"), (SubLObject)constant_completion_high.T), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CASE-SENSITIVE"), (SubLObject)constant_completion_high.T), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("START"), (SubLObject)constant_completion_high.ZERO_INTEGER), (SubLObject)SubLObjectFactory.makeSymbol("END")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $list66 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("DONE"), (SubLObject)SubLObjectFactory.makeKeyword("FORWARD"), (SubLObject)SubLObjectFactory.makeKeyword("CASE-SENSITIVE"), (SubLObject)SubLObjectFactory.makeKeyword("START"), (SubLObject)SubLObjectFactory.makeKeyword("END"));
        $kw67$CASE_SENSITIVE = SubLObjectFactory.makeKeyword("CASE-SENSITIVE");
        $kw68$START = SubLObjectFactory.makeKeyword("START");
        $kw69$END = SubLObjectFactory.makeKeyword("END");
        $sym70$ITERATOR = SubLObjectFactory.makeUninternedSymbol("ITERATOR");
        $sym71$NEW_DIRECTED_CONSTANT_COMPLETION_ITERATOR = SubLObjectFactory.makeSymbol("NEW-DIRECTED-CONSTANT-COMPLETION-ITERATOR");
    }

    public static final class $invalid_constant_name_char_p$UnaryFunction extends UnaryFunction
    {
        public $invalid_constant_name_char_p$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("INVALID-CONSTANT-NAME-CHAR-P"));
        }

        @Override
		public SubLObject processItem(final SubLObject arg1) {
            return constant_completion_high.invalid_constant_name_char_p(arg1);
        }
    }
}

/*

	Total time: 100 ms

*/