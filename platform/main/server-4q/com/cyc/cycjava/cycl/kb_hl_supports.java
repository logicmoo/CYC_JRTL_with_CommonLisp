/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;
import static com.cyc.cycjava.cycl.cfasl.cfasl_input;
import static com.cyc.cycjava.cycl.cfasl.cfasl_output;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.append;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.listS;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.nconc;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.bind;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.currentBinding;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.rebind;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.identity;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks.make_lock;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks.release_lock;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks.seize_lock;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.ceiling;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.max;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.subtract;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.length;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.nreverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.nsubstitute;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.remove;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.remove_if;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.def_csetf;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.makeStructDeclNative;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.register_method;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.boundp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.current_process;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time.get_universal_time;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.integerp;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeInteger;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.cdestructuring_bind_error;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.property_list_member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cadr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cddr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.$print_object_method_table$;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.bq_cons;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.declareMacro;
import static com.cyc.tool.subl.util.SubLFiles.defconstant;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;

import org.armedbear.lisp.Lisp;

import com.cyc.cycjava.cycl.sbhl.sbhl_marking_vars;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Storage;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.StreamsLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sxhash;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 *  module:      KB-HL-SUPPORTS
 *  source file: /cyc/top/cycl/kb-hl-supports.lisp
 *  created:     2019/07/03 17:37:21
 */
public final class kb_hl_supports extends SubLTranslatedFile implements V02 {
    // // Constructor
    private kb_hl_supports() {
    }

    public static final SubLFile me = new kb_hl_supports();


    // // Definitions
    public static final SubLObject find_kb_hl_support(SubLObject hl_support) {
        {
            SubLObject kb_hl_support = find_kb_hl_support_during_creation(hl_support);
            return NIL != kb_hl_support ? ((SubLObject) (kb_hl_support)) : lookup_kb_hl_support(hl_support);
        }
    }

    public static final SubLObject find_kb_hl_support_by_id(SubLObject id) {
        return lookup_kb_hl_support_by_id(id);
    }

    public static final SubLObject find_kb_hl_supports_mentioning_term(SubLObject v_term) {
        return lookup_kb_hl_supports_mentioning_term(v_term);
    }

    public static final SubLObject kb_hl_support_count() {
        return NIL != $kb_hl_supports_from_ids$.getGlobalValue() ? ((SubLObject) (id_index.id_index_count($kb_hl_supports_from_ids$.getGlobalValue()))) : ZERO_INTEGER;
    }

    /**
     * Return the total number of 'old' kb-hl-supports.
     */
    public static final SubLObject old_kb_hl_support_count() {
        return id_index.id_index_old_object_count($kb_hl_supports_from_ids$.getGlobalValue());
    }

    public static final SubLObject new_kb_hl_support_count() {
        return subtract(kb_hl_support_count(), old_kb_hl_support_count());
    }

    public static final SubLObject kb_hl_support_id(SubLObject kb_hl_support) {
        return kb_hl_support_get_id(kb_hl_support);
    }

    public static final SubLObject kb_hl_support_arguments(SubLObject kb_hl_support) {
        {
            SubLObject content = kb_hl_support_content(kb_hl_support);
            SubLObject argument = kb_hl_support_content_get_argument(content);
            return list(argument);
        }
    }

    public static final SubLObject do_kb_hl_support_arguments(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt0);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject argument_var = NIL;
                    SubLObject kb_hl_support = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt0);
                    argument_var = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt0);
                    kb_hl_support = current.first();
                    current = current.rest();
                    {
                        SubLObject allow_other_keys_p = NIL;
                        SubLObject rest = current;
                        SubLObject bad = NIL;
                        SubLObject current_1 = NIL;
                        for (; NIL != rest;) {
                            destructuring_bind_must_consp(rest, datum, $list_alt0);
                            current_1 = rest.first();
                            rest = rest.rest();
                            destructuring_bind_must_consp(rest, datum, $list_alt0);
                            if (NIL == member(current_1, $list_alt1, UNPROVIDED, UNPROVIDED)) {
                                bad = T;
                            }
                            if (current_1 == $ALLOW_OTHER_KEYS) {
                                allow_other_keys_p = rest.first();
                            }
                            rest = rest.rest();
                        }
                        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                            cdestructuring_bind_error(datum, $list_alt0);
                        }
                        {
                            SubLObject done_tail = property_list_member($DONE, current);
                            SubLObject done = (NIL != done_tail) ? ((SubLObject) (cadr(done_tail))) : NIL;
                            current = temp;
                            {
                                SubLObject body = current;
                                return listS(DO_LIST, list(argument_var, list(KB_HL_SUPPORT_ARGUMENTS, kb_hl_support), $DONE, done), append(body, NIL));
                            }
                        }
                    }
                }
            }
        }
    }

    public static final SubLObject kb_hl_support_dependents(SubLObject kb_hl_support) {
        {
            SubLObject content = kb_hl_support_content(kb_hl_support);
            SubLObject dependents = kb_hl_support_content_get_dependents(content);
            return set_contents.set_contents_element_list(dependents);
        }
    }

    public static final SubLObject do_kb_hl_support_dependents(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt6);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject dependent_var = NIL;
                    SubLObject kb_hl_support = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt6);
                    dependent_var = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt6);
                    kb_hl_support = current.first();
                    current = current.rest();
                    {
                        SubLObject allow_other_keys_p = NIL;
                        SubLObject rest = current;
                        SubLObject bad = NIL;
                        SubLObject current_2 = NIL;
                        for (; NIL != rest;) {
                            destructuring_bind_must_consp(rest, datum, $list_alt6);
                            current_2 = rest.first();
                            rest = rest.rest();
                            destructuring_bind_must_consp(rest, datum, $list_alt6);
                            if (NIL == member(current_2, $list_alt1, UNPROVIDED, UNPROVIDED)) {
                                bad = T;
                            }
                            if (current_2 == $ALLOW_OTHER_KEYS) {
                                allow_other_keys_p = rest.first();
                            }
                            rest = rest.rest();
                        }
                        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                            cdestructuring_bind_error(datum, $list_alt6);
                        }
                        {
                            SubLObject done_tail = property_list_member($DONE, current);
                            SubLObject done = (NIL != done_tail) ? ((SubLObject) (cadr(done_tail))) : NIL;
                            current = temp;
                            {
                                SubLObject body = current;
                                return listS(DO_SET_CONTENTS, list(dependent_var, list(DO_KB_HL_SUPPORT_DEPENDENTS_HELPER, kb_hl_support), $DONE, done), append(body, NIL));
                            }
                        }
                    }
                }
            }
        }
    }

    public static final SubLObject do_kb_hl_support_dependents_helper(SubLObject kb_hl_support) {
        {
            SubLObject content = kb_hl_support_content(kb_hl_support);
            return kb_hl_support_content_get_dependents(content);
        }
    }

    public static final SubLObject kb_hl_support_justification(SubLObject kb_hl_support) {
        {
            SubLObject content = kb_hl_support_content(kb_hl_support);
            SubLObject argument = kb_hl_support_content_get_argument(content);
            SubLObject justification = NIL;
            if (NIL != deduction_handles.deduction_p(argument)) {
                justification = deductions_high.deduction_supports(argument);
            }
            return justification;
        }
    }

    public static final SubLObject do_kb_hl_support_supports(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt10);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject support_var = NIL;
                    SubLObject kb_hl_support = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt10);
                    support_var = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt10);
                    kb_hl_support = current.first();
                    current = current.rest();
                    {
                        SubLObject allow_other_keys_p = NIL;
                        SubLObject rest = current;
                        SubLObject bad = NIL;
                        SubLObject current_3 = NIL;
                        for (; NIL != rest;) {
                            destructuring_bind_must_consp(rest, datum, $list_alt10);
                            current_3 = rest.first();
                            rest = rest.rest();
                            destructuring_bind_must_consp(rest, datum, $list_alt10);
                            if (NIL == member(current_3, $list_alt1, UNPROVIDED, UNPROVIDED)) {
                                bad = T;
                            }
                            if (current_3 == $ALLOW_OTHER_KEYS) {
                                allow_other_keys_p = rest.first();
                            }
                            rest = rest.rest();
                        }
                        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                            cdestructuring_bind_error(datum, $list_alt10);
                        }
                        {
                            SubLObject done_tail = property_list_member($DONE, current);
                            SubLObject done = (NIL != done_tail) ? ((SubLObject) (cadr(done_tail))) : NIL;
                            current = temp;
                            {
                                SubLObject body = current;
                                return listS(DO_LIST, list(support_var, list(KB_HL_SUPPORT_JUSTIFICATION, kb_hl_support), $DONE, done), append(body, NIL));
                            }
                        }
                    }
                }
            }
        }
    }

    public static final SubLObject kb_hl_support_hl_support(SubLObject kb_hl_support) {
        {
            SubLObject content = kb_hl_support_content(kb_hl_support);
            SubLObject argument = kb_hl_support_content_get_argument(content);
            SubLObject hl_support = NIL;
            if (NIL != deduction_handles.deduction_p(argument)) {
                hl_support = deductions_high.deduction_assertion(argument);
            } else
                if (NIL != arguments.hl_support_p(argument)) {
                    hl_support = argument;
                }

            return hl_support;
        }
    }

    public static final SubLObject kb_hl_support_module(SubLObject kb_hl_support) {
        {
            SubLObject hl_support = kb_hl_support_hl_support(kb_hl_support);
            return NIL != arguments.hl_support_p(hl_support) ? ((SubLObject) (arguments.hl_support_module(hl_support))) : NIL;
        }
    }

    public static final SubLObject kb_hl_support_sentence(SubLObject kb_hl_support) {
        {
            SubLObject hl_support = kb_hl_support_hl_support(kb_hl_support);
            return NIL != arguments.hl_support_p(hl_support) ? ((SubLObject) (arguments.hl_support_sentence(hl_support))) : NIL;
        }
    }

    public static final SubLObject kb_hl_support_mt(SubLObject kb_hl_support) {
        {
            SubLObject hl_support = kb_hl_support_hl_support(kb_hl_support);
            return NIL != arguments.hl_support_p(hl_support) ? ((SubLObject) (arguments.hl_support_mt(hl_support))) : NIL;
        }
    }

    public static final SubLObject kb_hl_support_tv(SubLObject kb_hl_support) {
        {
            SubLObject hl_support = kb_hl_support_hl_support(kb_hl_support);
            return NIL != arguments.hl_support_p(hl_support) ? ((SubLObject) (arguments.hl_support_tv(hl_support))) : NIL;
        }
    }

    public static final SubLObject kb_hl_support_el_sentence(SubLObject kb_hl_support) {
        return cycl_utilities.hl_to_el(kb_hl_support_sentence(kb_hl_support));
    }

    public static final SubLObject kb_hl_support_ist_sentence(SubLObject kb_hl_support) {
        {
            SubLObject sentence = kb_hl_support_sentence(kb_hl_support);
            return NIL != el_utilities.ist_sentence_p(sentence) ? ((SubLObject) (sentence)) : el_utilities.make_ist_sentence(kb_hl_support_mt(kb_hl_support), sentence);
        }
    }

    public static final SubLObject kb_hl_support_el_ist_sentence(SubLObject kb_hl_support) {
        {
            SubLObject sentence = kb_hl_support_el_sentence(kb_hl_support);
            return NIL != el_utilities.ist_sentence_p(sentence) ? ((SubLObject) (sentence)) : el_utilities.make_ist_sentence(kb_hl_support_mt(kb_hl_support), sentence);
        }
    }

    public static final SubLObject kb_hl_support_elmt(SubLObject kb_hl_support) {
        return cycl_utilities.hl_to_el(kb_hl_support_mt(kb_hl_support));
    }

    public static final SubLObject kb_hl_support_cons(SubLObject kb_hl_support) {
        return el_utilities.elf_to_list(kb_hl_support_sentence(kb_hl_support));
    }

    public static final SubLObject find_or_possibly_create_kb_hl_support(SubLObject hl_support) {
        {
            SubLObject kb_hl_support = find_kb_hl_support(hl_support);
            if (NIL == kb_hl_support) {
                kb_hl_support = possibly_create_kb_hl_support(hl_support);
            }
            return kb_hl_support;
        }
    }

    public static final SubLObject possibly_create_kb_hl_support(SubLObject hl_support) {
        {
            SubLObject justification = hl_justify_for_kb_hl_support(hl_support);
            SubLObject kb_hl_support = NIL;
            if (NIL != arguments.non_empty_hl_justification_p(justification)) {
                kb_hl_support = create_kb_hl_support(hl_support, justification);
            }
            return kb_hl_support;
        }
    }

    public static final class $kb_hl_support_native extends SubLStructNative {
        public SubLStructDecl getStructDecl() {
            return kb_hl_supports.$kb_hl_support_native.structDecl;
        }

        public SubLObject getField2() {
            return $id;
        }

        public SubLObject setField2(SubLObject value) {
            return $id = value;
        }

        public SubLObject $id = Lisp.NIL;

        private static final SubLStructDeclNative structDecl = makeStructDeclNative(kb_hl_supports.$kb_hl_support_native.class, KB_HL_SUPPORT, KB_HL_SUPPORT_P, $list_alt14, $list_alt15, new String[]{ "$id" }, $list_alt16, $list_alt17, PRINT_KB_HL_SUPPORT);
    }

    // defconstant
    public static final SubLSymbol $dtp_kb_hl_support$ = makeSymbol("*DTP-KB-HL-SUPPORT*");

    public static final SubLObject kb_hl_support_print_function_trampoline(SubLObject v_object, SubLObject stream) {
        print_kb_hl_support(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject kb_hl_support_p(SubLObject v_object) {
        return v_object.getClass() == kb_hl_supports.$kb_hl_support_native.class ? ((SubLObject) (T)) : NIL;
    }

    public static final class $kb_hl_support_p$UnaryFunction extends UnaryFunction {
        public $kb_hl_support_p$UnaryFunction() {
            super(extractFunctionNamed("KB-HL-SUPPORT-P"));
        }

        public SubLObject processItem(SubLObject arg1) {
            return kb_hl_support_p(arg1);
        }
    }

    public static final SubLObject kb_hls_id(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, KB_HL_SUPPORT_P);
        return v_object.getField2();
    }

    public static final SubLObject _csetf_kb_hls_id(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, KB_HL_SUPPORT_P);
        return v_object.setField2(value);
    }

    public static final SubLObject make_kb_hl_support(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        {
            SubLObject v_new = new kb_hl_supports.$kb_hl_support_native();
            SubLObject next = NIL;
            for (next = arglist; NIL != next; next = cddr(next)) {
                {
                    SubLObject current_arg = next.first();
                    SubLObject current_value = cadr(next);
                    SubLObject pcase_var = current_arg;
                    if (pcase_var.eql($ID)) {
                        _csetf_kb_hls_id(v_new, current_value);
                    } else {
                        Errors.error($str_alt23$Invalid_slot__S_for_construction_, current_arg);
                    }
                }
            }
            return v_new;
        }
    }

    // defparameter
    public static final SubLSymbol $print_kb_hl_support_hl_supportP$ = makeSymbol("*PRINT-KB-HL-SUPPORT-HL-SUPPORT?*");

    public static final SubLObject print_kb_hl_support(SubLObject v_object, SubLObject stream, SubLObject depth) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (v_object == cfasl_kb_methods.cfasl_invalid_kb_hl_support()) {
                format(stream, $str_alt24$_The_CFASL_invalid_KB_HL_support_);
            } else
                if ((NIL != $print_kb_hl_support_hl_supportP$.getDynamicValue(thread)) && (NIL != valid_kb_hl_supportP(v_object, UNPROVIDED))) {
                    format(stream, $str_alt25$___s_, kb_hl_support_hl_support(v_object));
                } else {
                    format(stream, $str_alt26$__KB_HL_SUPPORT__s_, kb_hls_id(v_object));
                }

            return v_object;
        }
    }

    public static final SubLObject sxhash_kb_hl_support_method(SubLObject v_object) {
        {
            SubLObject id = kb_hls_id(v_object);
            return id.isInteger() ? ((SubLObject) (id)) : $int$787;
        }
    }

    public static final class $sxhash_kb_hl_support_method$UnaryFunction extends UnaryFunction {
        public $sxhash_kb_hl_support_method$UnaryFunction() {
            super(extractFunctionNamed("SXHASH-KB-HL-SUPPORT-METHOD"));
        }

        public SubLObject processItem(SubLObject arg1) {
            return sxhash_kb_hl_support_method(arg1);
        }
    }

    public static final SubLObject new_kb_hl_support(SubLObject id) {
        {
            SubLObject kb_hl_support = NIL;
            kb_hl_support = make_kb_hl_support(UNPROVIDED);
            _csetf_kb_hls_id(kb_hl_support, id);
            return kb_hl_support;
        }
    }

    public static final SubLObject free_kb_hl_support(SubLObject kb_hl_support) {
        _csetf_kb_hls_id(kb_hl_support, NIL);
        return kb_hl_support;
    }

    public static final SubLObject kb_hl_support_get_id(SubLObject kb_hl_support) {
        return kb_hls_id(kb_hl_support);
    }

    public static final class $kb_hl_support_content_native extends SubLStructNative {
        public SubLStructDecl getStructDecl() {
            return kb_hl_supports.$kb_hl_support_content_native.structDecl;
        }

        public SubLObject getField2() {
            return $argument;
        }

        public SubLObject getField3() {
            return $dependents;
        }

        public SubLObject setField2(SubLObject value) {
            return $argument = value;
        }

        public SubLObject setField3(SubLObject value) {
            return $dependents = value;
        }

        public SubLObject $argument = Lisp.NIL;

        public SubLObject $dependents = Lisp.NIL;

        private static final SubLStructDeclNative structDecl = makeStructDeclNative(kb_hl_supports.$kb_hl_support_content_native.class, KB_HL_SUPPORT_CONTENT, KB_HL_SUPPORT_CONTENT_P, $list_alt31, $list_alt32, new String[]{ "$argument", "$dependents" }, $list_alt33, $list_alt34, DEFAULT_STRUCT_PRINT_FUNCTION);
    }

    // defconstant
    public static final SubLSymbol $dtp_kb_hl_support_content$ = makeSymbol("*DTP-KB-HL-SUPPORT-CONTENT*");

    public static final SubLObject kb_hl_support_content_print_function_trampoline(SubLObject v_object, SubLObject stream) {
        compatibility.default_struct_print_function(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject kb_hl_support_content_p(SubLObject v_object) {
        return v_object.getClass() == kb_hl_supports.$kb_hl_support_content_native.class ? ((SubLObject) (T)) : NIL;
    }

    public static final class $kb_hl_support_content_p$UnaryFunction extends UnaryFunction {
        public $kb_hl_support_content_p$UnaryFunction() {
            super(extractFunctionNamed("KB-HL-SUPPORT-CONTENT-P"));
        }

        public SubLObject processItem(SubLObject arg1) {
            return kb_hl_support_content_p(arg1);
        }
    }

    public static final SubLObject kb_hlsc_argument(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, KB_HL_SUPPORT_CONTENT_P);
        return v_object.getField2();
    }

    public static final SubLObject kb_hlsc_dependents(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, KB_HL_SUPPORT_CONTENT_P);
        return v_object.getField3();
    }

    public static final SubLObject _csetf_kb_hlsc_argument(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, KB_HL_SUPPORT_CONTENT_P);
        return v_object.setField2(value);
    }

    public static final SubLObject _csetf_kb_hlsc_dependents(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, KB_HL_SUPPORT_CONTENT_P);
        return v_object.setField3(value);
    }

    public static final SubLObject make_kb_hl_support_content(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        {
            SubLObject v_new = new kb_hl_supports.$kb_hl_support_content_native();
            SubLObject next = NIL;
            for (next = arglist; NIL != next; next = cddr(next)) {
                {
                    SubLObject current_arg = next.first();
                    SubLObject current_value = cadr(next);
                    SubLObject pcase_var = current_arg;
                    if (pcase_var.eql($ARGUMENT)) {
                        _csetf_kb_hlsc_argument(v_new, current_value);
                    } else
                        if (pcase_var.eql($DEPENDENTS)) {
                            _csetf_kb_hlsc_dependents(v_new, current_value);
                        } else {
                            Errors.error($str_alt23$Invalid_slot__S_for_construction_, current_arg);
                        }

                }
            }
            return v_new;
        }
    }

    public static final SubLObject new_kb_hl_support_content() {
        {
            SubLObject kb_hl_support_content = NIL;
            kb_hl_support_content = make_kb_hl_support_content(UNPROVIDED);
            return kb_hl_support_content;
        }
    }

    public static final SubLObject free_kb_hl_support_content(SubLObject kb_hl_support_content) {
        _csetf_kb_hlsc_argument(kb_hl_support_content, NIL);
        _csetf_kb_hlsc_dependents(kb_hl_support_content, NIL);
        return kb_hl_support_content;
    }

    public static final SubLObject kb_hl_support_content_get_argument(SubLObject kb_hl_support_content) {
        return kb_hlsc_argument(kb_hl_support_content);
    }

    public static final SubLObject kb_hl_support_content_get_dependents(SubLObject kb_hl_support_content) {
        return kb_hlsc_dependents(kb_hl_support_content);
    }

    public static final SubLObject kb_hl_support_content_set_argument(SubLObject kb_hl_support_content, SubLObject deduction) {
        _csetf_kb_hlsc_argument(kb_hl_support_content, deduction);
        return kb_hl_support_content;
    }

    public static final SubLObject kb_hl_support_content_set_dependents(SubLObject kb_hl_support_content, SubLObject dependents) {
        _csetf_kb_hlsc_dependents(kb_hl_support_content, dependents);
        return kb_hl_support_content;
    }

    public static final SubLObject make_kb_hl_support_shell(SubLObject id) {
        {
            SubLObject kb_hl_support = new_kb_hl_support(id);
            register_kb_hl_support_id(id, kb_hl_support);
            return kb_hl_support;
        }
    }

    public static final SubLObject kb_hl_support_content(SubLObject kb_hl_support) {
        return kb_hl_support_manager.lookup_kb_hl_support_content(kb_hl_support_get_id(kb_hl_support));
    }

    public static final SubLObject kb_hl_support_add_dependent(SubLObject kb_hl_support, SubLObject deduction) {
        {
            SubLObject content = kb_hl_support_content(kb_hl_support);
            SubLObject old_dependents = kb_hl_support_content_get_dependents(content);
            SubLObject new_dependents = set_contents.set_contents_add(deduction, old_dependents, symbol_function(EQ));
            kb_hl_support_content_set_dependents(content, new_dependents);
            kb_hl_support_manager.mark_kb_hl_support_content_as_muted(kb_hl_support_id(kb_hl_support));
        }
        return kb_hl_support;
    }

    public static final SubLObject kb_hl_support_remove_dependent(SubLObject kb_hl_support, SubLObject deduction) {
        {
            SubLObject content = kb_hl_support_content(kb_hl_support);
            SubLObject old_dependents = kb_hl_support_content_get_dependents(content);
            SubLObject new_dependents = set_contents.set_contents_delete(deduction, old_dependents, symbol_function(EQ));
            kb_hl_support_content_set_dependents(content, new_dependents);
            kb_hl_support_manager.mark_kb_hl_support_content_as_muted(kb_hl_support_id(kb_hl_support));
        }
        return kb_hl_support;
    }

    public static final SubLObject kb_hl_support_clear_dependents(SubLObject kb_hl_support) {
        {
            SubLObject content = kb_hl_support_content(kb_hl_support);
            kb_hl_support_content_set_dependents(content, set_contents.new_set_contents(ZERO_INTEGER, symbol_function(EQ)));
            kb_hl_support_manager.mark_kb_hl_support_content_as_muted(kb_hl_support_id(kb_hl_support));
        }
        return kb_hl_support;
    }

    public static final SubLObject kb_hl_support_remove_argument(SubLObject kb_hl_support) {
        {
            SubLObject hl_support = kb_hl_support_hl_support(kb_hl_support);
            SubLObject content = kb_hl_support_content(kb_hl_support);
            kb_hl_support_content_set_argument(content, hl_support);
            kb_hl_support_manager.mark_kb_hl_support_content_as_muted(kb_hl_support_id(kb_hl_support));
        }
        return kb_hl_support;
    }

    public static final SubLObject kb_hl_support_reset_argument(SubLObject kb_hl_support, SubLObject new_argument) {
        {
            SubLObject content = kb_hl_support_content(kb_hl_support);
            SubLObject old_argument = kb_hl_support_content_get_argument(content);
            if (NIL != deduction_handles.valid_deductionP(old_argument, UNPROVIDED)) {
                deductions_high.remove_deduction(old_argument);
            }
            kb_hl_support_content_set_argument(content, new_argument);
            kb_hl_support_manager.mark_kb_hl_support_content_as_muted(kb_hl_support_id(kb_hl_support));
        }
        return kb_hl_support;
    }

    public static final SubLObject kb_hl_support_reset_justification(SubLObject kb_hl_support, SubLObject new_justification) {
        {
            SubLObject hl_support = kb_hl_support_hl_support(kb_hl_support);
            SubLObject new_argument = deductions_high.create_deduction_for_hl_support(hl_support, new_justification);
            kb_hl_support_reset_argument(kb_hl_support, new_argument);
        }
        return kb_hl_support;
    }

    public static final SubLObject rejustify_kb_hl_support(SubLObject kb_hl_support) {
        {
            SubLObject hl_support = kb_hl_support_hl_support(kb_hl_support);
            SubLObject justification = hl_justify_for_kb_hl_support(hl_support);
            kb_hl_support_reset_justification(kb_hl_support, justification);
        }
        return kb_hl_support;
    }

    public static final SubLObject remove_kb_hl_support(SubLObject kb_hl_support) {
        {
            SubLObject content = kb_hl_support_content(kb_hl_support);
            SubLObject argument = kb_hl_support_content_get_argument(content);
            if (NIL != deduction_handles.valid_deductionP(argument, UNPROVIDED)) {
                deductions_high.remove_deduction(argument);
            }
            free_kb_hl_support(kb_hl_support);
            free_kb_hl_support_content(content);
            return kb_hl_support;
        }
    }

    public static final SubLObject hl_justify_for_kb_hl_support(SubLObject hl_support) {
        return remove(hl_support, hl_supports.hl_support_justify(hl_support), symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject valid_kb_hl_supportP(SubLObject v_object, SubLObject robustP) {
        if (robustP == UNPROVIDED) {
            robustP = NIL;
        }
        return makeBoolean((NIL != valid_kb_hl_support_handleP(v_object)) && ((NIL == robustP) || (NIL != valid_kb_hl_support_contentP(kb_hl_support_content(v_object), robustP))));
    }

    public static final SubLObject valid_kb_hl_support_handleP(SubLObject v_object) {
        return makeBoolean((NIL != kb_hl_support_p(v_object)) && (NIL != kb_hl_support_handle_validP(v_object)));
    }

    public static final SubLObject kb_hl_support_handle_validP(SubLObject kb_hl_support) {
        return integerp(kb_hl_support_get_id(kb_hl_support));
    }

    public static final SubLObject valid_kb_hl_support_contentP(SubLObject v_object, SubLObject robustP) {
        if (robustP == UNPROVIDED) {
            robustP = NIL;
        }
        return makeBoolean((NIL != kb_hl_support_content_p(v_object)) && (NIL != kb_hl_support_content_validP(v_object, robustP)));
    }

    public static final SubLObject kb_hl_support_content_validP(SubLObject kb_hl_support_content, SubLObject robustP) {
        if (robustP == UNPROVIDED) {
            robustP = NIL;
        }
        {
            SubLObject argument = kb_hl_support_content_get_argument(kb_hl_support_content);
            SubLObject dependents = kb_hl_support_content_get_dependents(kb_hl_support_content);
            SubLObject validP = NIL;
            if (NIL != deduction_handles.valid_deductionP(argument, robustP)) {
                {
                    SubLObject invalidP = NIL;
                    SubLObject set_contents_var = dependents;
                    SubLObject basis_object = set_contents.do_set_contents_basis_object(set_contents_var);
                    SubLObject state = NIL;
                    for (state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); !((NIL != invalidP) || (NIL != set_contents.do_set_contents_doneP(basis_object, state))); state = set_contents.do_set_contents_update_state(state)) {
                        {
                            SubLObject dependent = set_contents.do_set_contents_next(basis_object, state);
                            if (NIL != set_contents.do_set_contents_element_validP(state, dependent)) {
                                if (NIL == deduction_handles.valid_deductionP(dependent, robustP)) {
                                    invalidP = T;
                                }
                            }
                        }
                    }
                    validP = makeBoolean(NIL == invalidP);
                }
            }
            return validP;
        }
    }

    public static final SubLObject kb_hl_support_uselessP(SubLObject kb_hl_support) {
        {
            SubLObject content = kb_hl_support_content(kb_hl_support);
            SubLObject dependents = kb_hl_support_content_get_dependents(content);
            return set_contents.set_contents_emptyP(dependents);
        }
    }

    public static final SubLObject kb_hl_support_unjustifiedP(SubLObject kb_hl_support) {
        {
            SubLObject content = kb_hl_support_content(kb_hl_support);
            SubLObject argument = kb_hl_support_content_get_argument(content);
            return makeBoolean(NIL == deduction_handles.deduction_p(argument));
        }
    }

    public static final SubLObject possibly_destroy_kb_hl_support(SubLObject kb_hl_support) {
        {
            SubLObject destroyedP = NIL;
            if ((NIL != kb_hl_support_unjustifiedP(kb_hl_support)) || (NIL != kb_hl_support_uselessP(kb_hl_support))) {
                destroy_kb_hl_support(kb_hl_support);
                destroyedP = T;
            }
            return destroyedP;
        }
    }

    public static final SubLObject tms_remove_kb_hl_supports_mentioning_term(SubLObject v_term) {
        {
            SubLObject removed_count = ZERO_INTEGER;
            SubLObject cdolist_list_var = find_kb_hl_supports_mentioning_term(v_term);
            SubLObject kb_hl_support = NIL;
            for (kb_hl_support = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , kb_hl_support = cdolist_list_var.first()) {
                if (NIL != arguments.valid_supportP(kb_hl_support, UNPROVIDED)) {
                    tms_remove_kb_hl_support(kb_hl_support);
                }
                removed_count = add(removed_count, ONE_INTEGER);
            }
            return removed_count;
        }
    }

    public static final SubLObject setup_kb_hl_support_tables(SubLObject size, SubLObject exactP) {
        setup_kb_hl_support_id_tables(size, exactP);
        setup_kb_hl_support_index_table();
        return NIL;
    }

    public static final SubLObject finalize_kb_hl_supports(SubLObject max_kb_hl_support_id) {
        if (max_kb_hl_support_id == UNPROVIDED) {
            max_kb_hl_support_id = NIL;
        }
        set_next_kb_hl_support_id(max_kb_hl_support_id);
        if (NIL == max_kb_hl_support_id) {
            optimize_kb_hl_support_id_tables();
        }
        return NIL;
    }



    public static final SubLObject do_kb_hl_supports(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt44);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject var = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt44);
                    var = current.first();
                    current = current.rest();
                    {
                        SubLObject allow_other_keys_p = NIL;
                        SubLObject rest = current;
                        SubLObject bad = NIL;
                        SubLObject current_4 = NIL;
                        for (; NIL != rest;) {
                            destructuring_bind_must_consp(rest, datum, $list_alt44);
                            current_4 = rest.first();
                            rest = rest.rest();
                            destructuring_bind_must_consp(rest, datum, $list_alt44);
                            if (NIL == member(current_4, $list_alt45, UNPROVIDED, UNPROVIDED)) {
                                bad = T;
                            }
                            if (current_4 == $ALLOW_OTHER_KEYS) {
                                allow_other_keys_p = rest.first();
                            }
                            rest = rest.rest();
                        }
                        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                            cdestructuring_bind_error(datum, $list_alt44);
                        }
                        {
                            SubLObject progress_message_tail = property_list_member($PROGRESS_MESSAGE, current);
                            SubLObject progress_message = (NIL != progress_message_tail) ? ((SubLObject) (cadr(progress_message_tail))) : $$$mapping_Cyc_KB_HL_supports;
                            SubLObject done_tail = property_list_member($DONE, current);
                            SubLObject done = (NIL != done_tail) ? ((SubLObject) (cadr(done_tail))) : NIL;
                            current = temp;
                            {
                                SubLObject body = current;
                                return listS(DO_KB_SUID_TABLE, list(var, $list_alt49, $PROGRESS_MESSAGE, progress_message, $DONE, done), append(body, NIL));
                            }
                        }
                    }
                }
            }
        }
    }

    public static final SubLObject do_old_kb_hl_supports(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt50);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject var = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt50);
                    var = current.first();
                    current = current.rest();
                    {
                        SubLObject allow_other_keys_p = NIL;
                        SubLObject rest = current;
                        SubLObject bad = NIL;
                        SubLObject current_5 = NIL;
                        for (; NIL != rest;) {
                            destructuring_bind_must_consp(rest, datum, $list_alt50);
                            current_5 = rest.first();
                            rest = rest.rest();
                            destructuring_bind_must_consp(rest, datum, $list_alt50);
                            if (NIL == member(current_5, $list_alt45, UNPROVIDED, UNPROVIDED)) {
                                bad = T;
                            }
                            if (current_5 == $ALLOW_OTHER_KEYS) {
                                allow_other_keys_p = rest.first();
                            }
                            rest = rest.rest();
                        }
                        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                            cdestructuring_bind_error(datum, $list_alt50);
                        }
                        {
                            SubLObject progress_message_tail = property_list_member($PROGRESS_MESSAGE, current);
                            SubLObject progress_message = (NIL != progress_message_tail) ? ((SubLObject) (cadr(progress_message_tail))) : NIL;
                            SubLObject done_tail = property_list_member($DONE, current);
                            SubLObject done = (NIL != done_tail) ? ((SubLObject) (cadr(done_tail))) : NIL;
                            current = temp;
                            {
                                SubLObject body = current;
                                return listS(DO_KB_SUID_TABLE_OLD_OBJECTS, list(var, $list_alt49, $PROGRESS_MESSAGE, progress_message, $DONE, done), append(body, NIL));
                            }
                        }
                    }
                }
            }
        }
    }

    public static final SubLObject do_new_kb_hl_supports(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt50);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject var = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt50);
                    var = current.first();
                    current = current.rest();
                    {
                        SubLObject allow_other_keys_p = NIL;
                        SubLObject rest = current;
                        SubLObject bad = NIL;
                        SubLObject current_6 = NIL;
                        for (; NIL != rest;) {
                            destructuring_bind_must_consp(rest, datum, $list_alt50);
                            current_6 = rest.first();
                            rest = rest.rest();
                            destructuring_bind_must_consp(rest, datum, $list_alt50);
                            if (NIL == member(current_6, $list_alt45, UNPROVIDED, UNPROVIDED)) {
                                bad = T;
                            }
                            if (current_6 == $ALLOW_OTHER_KEYS) {
                                allow_other_keys_p = rest.first();
                            }
                            rest = rest.rest();
                        }
                        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                            cdestructuring_bind_error(datum, $list_alt50);
                        }
                        {
                            SubLObject progress_message_tail = property_list_member($PROGRESS_MESSAGE, current);
                            SubLObject progress_message = (NIL != progress_message_tail) ? ((SubLObject) (cadr(progress_message_tail))) : NIL;
                            SubLObject done_tail = property_list_member($DONE, current);
                            SubLObject done = (NIL != done_tail) ? ((SubLObject) (cadr(done_tail))) : NIL;
                            current = temp;
                            {
                                SubLObject body = current;
                                return listS(DO_KB_SUID_TABLE_NEW_OBJECTS, list(var, $list_alt49, $PROGRESS_MESSAGE, progress_message, $DONE, done), append(body, NIL));
                            }
                        }
                    }
                }
            }
        }
    }

    public static final SubLObject do_kb_hl_supports_table() {
        return $kb_hl_supports_from_ids$.getGlobalValue();
    }

    public static final SubLObject setup_kb_hl_support_id_tables(SubLObject size, SubLObject exactP) {
        if (NIL == $kb_hl_supports_from_ids$.getGlobalValue()) {
            $kb_hl_supports_from_ids$.setGlobalValue(id_index.new_id_index(size, ZERO_INTEGER));
        }
        kb_hl_support_manager.setup_kb_hl_support_content_table(size, exactP);
        return NIL;
    }

    public static final SubLObject optimize_kb_hl_support_id_tables() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject _prev_bind_0 = Storage.$current_area$.currentBinding(thread);
                try {
                    Storage.$current_area$.bind(Storage.get_static_area(), thread);
                    id_index.optimize_id_index($kb_hl_supports_from_ids$.getGlobalValue(), UNPROVIDED);
                    kb_hl_support_manager.optimize_kb_hl_support_content_table(id_index.id_index_count($kb_hl_supports_from_ids$.getGlobalValue()));
                } finally {
                    Storage.$current_area$.rebind(_prev_bind_0, thread);
                }
            }
            return NIL;
        }
    }

    public static final SubLObject lookup_kb_hl_support_by_id(SubLObject id) {
        return id_index.id_index_lookup($kb_hl_supports_from_ids$.getGlobalValue(), id, UNPROVIDED);
    }

    public static final SubLObject next_kb_hl_support_id() {
        return id_index.id_index_next_id($kb_hl_supports_from_ids$.getGlobalValue());
    }

    public static final SubLObject register_kb_hl_support_id(SubLObject id, SubLObject kb_hl_support) {
        return id_index.id_index_enter($kb_hl_supports_from_ids$.getGlobalValue(), id, kb_hl_support);
    }

    public static final SubLObject deregister_kb_hl_support_id(SubLObject id) {
        return id_index.id_index_remove($kb_hl_supports_from_ids$.getGlobalValue(), id);
    }

    public static final SubLObject set_next_kb_hl_support_id(SubLObject max_kb_hl_support_id) {
        if (max_kb_hl_support_id == UNPROVIDED) {
            max_kb_hl_support_id = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject max = MINUS_ONE_INTEGER;
                if (NIL != max_kb_hl_support_id) {
                    max = max_kb_hl_support_id;
                } else {
                    {
                        SubLObject idx = do_kb_hl_supports_table();
                        SubLObject total = id_index.id_index_count(idx);
                        SubLObject sofar = ZERO_INTEGER;
                        SubLTrampolineFile.checkType($str_alt55$Determining_maximum_KB_HL_support, STRINGP);
                        {
                            SubLObject _prev_bind_0 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
                            SubLObject _prev_bind_1 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
                            SubLObject _prev_bind_2 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
                            SubLObject _prev_bind_3 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
                            try {
                                utilities_macros.$last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                                utilities_macros.$last_percent_progress_prediction$.bind(NIL, thread);
                                utilities_macros.$within_noting_percent_progress$.bind(T, thread);
                                utilities_macros.$percent_progress_start_time$.bind(get_universal_time(), thread);
                                utilities_macros.noting_percent_progress_preamble($str_alt55$Determining_maximum_KB_HL_support);
                                if (NIL == id_index.do_id_index_empty_p(idx, $SKIP)) {
                                    {
                                        SubLObject id = id_index.do_id_index_next_id(idx, T, NIL, NIL);
                                        SubLObject state_var = id_index.do_id_index_next_state(idx, T, id, NIL);
                                        SubLObject kb_hl_support = NIL;
                                        while (NIL != id) {
                                            kb_hl_support = id_index.do_id_index_state_object(idx, $SKIP, id, state_var);
                                            if (NIL != id_index.do_id_index_id_and_object_validP(id, kb_hl_support, $SKIP)) {
                                                utilities_macros.note_percent_progress(sofar, total);
                                                sofar = add(sofar, ONE_INTEGER);
                                                max = max(max, kb_hl_support_id(kb_hl_support));
                                            }
                                            id = id_index.do_id_index_next_id(idx, T, id, state_var);
                                            state_var = id_index.do_id_index_next_state(idx, T, id, state_var);
                                        } 
                                    }
                                }
                                utilities_macros.noting_percent_progress_postamble();
                            } finally {
                                utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_3, thread);
                                utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_2, thread);
                                utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_1, thread);
                                utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                }
                {
                    SubLObject next_id = add(max, ONE_INTEGER);
                    id_index.set_id_index_next_id($kb_hl_supports_from_ids$.getGlobalValue(), next_id);
                    return next_id;
                }
            }
        }
    }

    public static final SubLObject increment_next_kb_hl_support_id() {
        {
            SubLObject id = next_kb_hl_support_id();
            return id_index.set_id_index_next_id($kb_hl_supports_from_ids$.getGlobalValue(), add(ONE_INTEGER, id));
        }
    }

    public static final SubLObject clear_kb_hl_support_id_tables() {
        id_index.clear_id_index($kb_hl_supports_from_ids$.getGlobalValue());
        kb_hl_support_manager.clear_kb_hl_support_content_table();
        return NIL;
    }



    // deflexical
    private static final SubLSymbol $kb_hl_support_index_lock$ = makeSymbol("*KB-HL-SUPPORT-INDEX-LOCK*");

    // deflexical
    private static final SubLSymbol $kb_hl_support_index_unindexed_terms$ = makeSymbol("*KB-HL-SUPPORT-INDEX-UNINDEXED-TERMS*");

    public static final SubLObject kb_hl_support_index_unindexed_termP(SubLObject v_term) {
        return list_utilities.member_equalP(v_term, $kb_hl_support_index_unindexed_terms$.getGlobalValue());
    }

    public static final class $kb_hl_support_index_unindexed_termP$UnaryFunction extends UnaryFunction {
        public $kb_hl_support_index_unindexed_termP$UnaryFunction() {
            super(extractFunctionNamed("KB-HL-SUPPORT-INDEX-UNINDEXED-TERM?"));
        }

        public SubLObject processItem(SubLObject arg1) {
            return kb_hl_support_index_unindexed_termP(arg1);
        }
    }

    public static final SubLObject kb_hl_support_index_indexed_term_p(SubLObject v_term) {
        return makeBoolean((NIL != kb_indexing_datastructures.indexed_term_p(v_term)) && (NIL == kb_hl_support_index_unindexed_termP(v_term)));
    }

    public static final SubLObject kb_hl_support_index_indexed_terms(SubLObject sentence) {
        {
            SubLObject terms = cycl_utilities.expression_gather(sentence, INDEXED_TERM_P, NIL, symbol_function(EQUAL), UNPROVIDED, UNPROVIDED);
            return NIL != list_utilities.find_if_not($sym62$KB_HL_SUPPORT_INDEX_UNINDEXED_TERM_, terms, UNPROVIDED, UNPROVIDED, UNPROVIDED) ? ((SubLObject) (remove_if($sym62$KB_HL_SUPPORT_INDEX_UNINDEXED_TERM_, terms, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED))) : terms;
        }
    }

    public static final SubLObject setup_kb_hl_support_index_table() {
        if (NIL != $kb_hl_support_index$.getGlobalValue()) {
            return NIL;
        } else {
            $kb_hl_support_index$.setGlobalValue(dictionary.new_dictionary(symbol_function(EQ), UNPROVIDED));
            return T;
        }
    }

    public static final SubLObject lookup_kb_hl_support(SubLObject hl_support) {
        {
            SubLObject support_sets = NIL;
            SubLObject kb_hl_support = NIL;
            SubLObject datum = hl_support;
            SubLObject current = datum;
            SubLObject module = NIL;
            SubLObject sentence = NIL;
            SubLObject mt = NIL;
            SubLObject tv = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt63);
            module = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt63);
            sentence = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt63);
            mt = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt63);
            tv = current.first();
            current = current.rest();
            if (NIL == current) {
                {
                    SubLObject lock = $kb_hl_support_index_lock$.getGlobalValue();
                    SubLObject release = NIL;
                    try {
                        release = seize_lock(lock);
                        {
                            SubLObject mt_index = dictionary.dictionary_lookup_without_values($kb_hl_support_index$.getGlobalValue(), module, UNPROVIDED);
                            if (NIL != dictionary.dictionary_p(mt_index)) {
                                {
                                    SubLObject tv_index = dictionary.dictionary_lookup_without_values(mt_index, mt, UNPROVIDED);
                                    if (NIL != dictionary.dictionary_p(tv_index)) {
                                        {
                                            SubLObject term_index = dictionary.dictionary_lookup_without_values(tv_index, tv, UNPROVIDED);
                                            if (NIL != dictionary.dictionary_p(term_index)) {
                                                {
                                                    SubLObject indexed_terms = kb_hl_support_index_indexed_terms(sentence);
                                                    SubLObject doneP = NIL;
                                                    if (NIL == doneP) {
                                                        {
                                                            SubLObject csome_list_var = indexed_terms;
                                                            SubLObject v_term = NIL;
                                                            for (v_term = csome_list_var.first(); !((NIL != doneP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , v_term = csome_list_var.first()) {
                                                                {
                                                                    SubLObject support_set = dictionary.dictionary_lookup_without_values(term_index, v_term, UNPROVIDED);
                                                                    if (NIL != set_contents.set_contents_emptyP(support_set)) {
                                                                        support_sets = NIL;
                                                                        doneP = T;
                                                                    } else
                                                                        if (NIL != set_contents.set_contents_singletonP(support_set)) {
                                                                            support_sets = list(support_set);
                                                                            doneP = T;
                                                                        } else {
                                                                            support_sets = cons(support_set, support_sets);
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
                            }
                        }
                    } finally {
                        if (NIL != release) {
                            release_lock(lock);
                        }
                    }
                }
                if (NIL != support_sets) {
                    {
                        SubLObject candidate_kb_hl_supports = (NIL != list_utilities.singletonP(support_sets)) ? ((SubLObject) (support_sets.first())) : set_utilities.set_contents_intersection(support_sets, symbol_function(EQ));
                        if (NIL == set_contents.set_contents_emptyP(candidate_kb_hl_supports)) {
                            {
                                SubLObject set_contents_var = candidate_kb_hl_supports;
                                SubLObject basis_object = set_contents.do_set_contents_basis_object(set_contents_var);
                                SubLObject state = NIL;
                                for (state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); !((NIL != kb_hl_support) || (NIL != set_contents.do_set_contents_doneP(basis_object, state))); state = set_contents.do_set_contents_update_state(state)) {
                                    {
                                        SubLObject candidate_kb_hl_support = set_contents.do_set_contents_next(basis_object, state);
                                        if (NIL != set_contents.do_set_contents_element_validP(state, candidate_kb_hl_support)) {
                                            {
                                                SubLObject candidate_sentence = kb_hl_support_sentence(candidate_kb_hl_support);
                                                if (candidate_sentence.equal(sentence)) {
                                                    kb_hl_support = candidate_kb_hl_support;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            } else {
                cdestructuring_bind_error(datum, $list_alt63);
            }
            return kb_hl_support;
        }
    }

    public static final SubLObject lookup_kb_hl_supports_mentioning_term(SubLObject v_term) {
        {
            SubLObject sentence_kb_hl_supports = lookup_kb_hl_supports_mentioning_term_in_sentence(v_term);
            SubLObject mt_kb_hl_supports = lookup_kb_hl_supports_mentioning_term_in_mt(v_term);
            return set_contents.set_contents_element_list(set_utilities.set_contents_union(list(sentence_kb_hl_supports, mt_kb_hl_supports), symbol_function(EQ)));
        }
    }

    public static final SubLObject lookup_kb_hl_supports_mentioning_term_in_sentence(SubLObject v_term) {
        return NIL != kb_hl_support_index_indexed_term_p(v_term) ? ((SubLObject) (lookup_kb_hl_supports_mentioning_indexed_term_in_sentence(v_term))) : lookup_kb_hl_supports_mentioning_unindexed_term_in_sentence(v_term);
    }

    public static final SubLObject lookup_kb_hl_supports_mentioning_indexed_term_in_sentence(SubLObject v_term) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject support_sets = NIL;
                SubLObject lock = $kb_hl_support_index_lock$.getGlobalValue();
                SubLObject release = NIL;
                try {
                    release = seize_lock(lock);
                    {
                        SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents($kb_hl_support_index$.getGlobalValue()));
                        while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)) {
                            thread.resetMultipleValues();
                            {
                                SubLObject key = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                SubLObject mt_index = thread.secondMultipleValue();
                                thread.resetMultipleValues();
                                {
                                    SubLObject iteration_state_7 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_index));
                                    while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_7)) {
                                        thread.resetMultipleValues();
                                        {
                                            SubLObject key_8 = dictionary_contents.do_dictionary_contents_key_value(iteration_state_7);
                                            SubLObject tv_index = thread.secondMultipleValue();
                                            thread.resetMultipleValues();
                                            {
                                                SubLObject iteration_state_9 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_index));
                                                while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_9)) {
                                                    thread.resetMultipleValues();
                                                    {
                                                        SubLObject key_10 = dictionary_contents.do_dictionary_contents_key_value(iteration_state_9);
                                                        SubLObject term_index = thread.secondMultipleValue();
                                                        thread.resetMultipleValues();
                                                        {
                                                            SubLObject support_set = dictionary.dictionary_lookup_without_values(term_index, v_term, UNPROVIDED);
                                                            if ((NIL != set_contents.set_contents_p(support_set)) && (NIL == set_contents.set_contents_emptyP(support_set))) {
                                                                support_sets = cons(support_set, support_sets);
                                                            }
                                                        }
                                                        iteration_state_9 = dictionary_contents.do_dictionary_contents_next(iteration_state_9);
                                                    }
                                                } 
                                                dictionary_contents.do_dictionary_contents_finalize(iteration_state_9);
                                            }
                                            iteration_state_7 = dictionary_contents.do_dictionary_contents_next(iteration_state_7);
                                        }
                                    } 
                                    dictionary_contents.do_dictionary_contents_finalize(iteration_state_7);
                                }
                                iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state);
                            }
                        } 
                        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                    }
                } finally {
                    if (NIL != release) {
                        release_lock(lock);
                    }
                }
                return set_utilities.set_contents_union(support_sets, symbol_function(EQ));
            }
        }
    }

    public static final SubLObject lookup_kb_hl_supports_mentioning_unindexed_term_in_sentence(SubLObject v_term) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_kb_hl_supports = set_contents.new_set_contents(ZERO_INTEGER, symbol_function(EQ));
                SubLObject idx = do_kb_hl_supports_table();
                SubLObject total = id_index.id_index_count(idx);
                SubLObject sofar = ZERO_INTEGER;
                SubLTrampolineFile.checkType($$$mapping_Cyc_KB_HL_supports, STRINGP);
                {
                    SubLObject _prev_bind_0 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
                    SubLObject _prev_bind_1 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
                    SubLObject _prev_bind_2 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
                    SubLObject _prev_bind_3 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
                    try {
                        utilities_macros.$last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                        utilities_macros.$last_percent_progress_prediction$.bind(NIL, thread);
                        utilities_macros.$within_noting_percent_progress$.bind(T, thread);
                        utilities_macros.$percent_progress_start_time$.bind(get_universal_time(), thread);
                        utilities_macros.noting_percent_progress_preamble($$$mapping_Cyc_KB_HL_supports);
                        if (NIL == id_index.do_id_index_empty_p(idx, $SKIP)) {
                            {
                                SubLObject id = id_index.do_id_index_next_id(idx, T, NIL, NIL);
                                SubLObject state_var = id_index.do_id_index_next_state(idx, T, id, NIL);
                                SubLObject kb_hl_support = NIL;
                                while (NIL != id) {
                                    kb_hl_support = id_index.do_id_index_state_object(idx, $SKIP, id, state_var);
                                    if (NIL != id_index.do_id_index_id_and_object_validP(id, kb_hl_support, $SKIP)) {
                                        utilities_macros.note_percent_progress(sofar, total);
                                        sofar = add(sofar, ONE_INTEGER);
                                        {
                                            SubLObject sentence = kb_hl_support_sentence(kb_hl_support);
                                            if (NIL != list_utilities.simple_tree_find_via_equalP(v_term, sentence)) {
                                                set_contents.set_contents_add(kb_hl_support, v_kb_hl_supports, symbol_function(EQ));
                                            }
                                        }
                                    }
                                    id = id_index.do_id_index_next_id(idx, T, id, state_var);
                                    state_var = id_index.do_id_index_next_state(idx, T, id, state_var);
                                } 
                            }
                        }
                        utilities_macros.noting_percent_progress_postamble();
                    } finally {
                        utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_3, thread);
                        utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_2, thread);
                        utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_1, thread);
                        utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_0, thread);
                    }
                }
                return v_kb_hl_supports;
            }
        }
    }

    public static final SubLObject lookup_kb_hl_supports_mentioning_term_in_mt(SubLObject v_term) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject support_sets = NIL;
                SubLObject lock = $kb_hl_support_index_lock$.getGlobalValue();
                SubLObject release = NIL;
                try {
                    release = seize_lock(lock);
                    {
                        SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents($kb_hl_support_index$.getGlobalValue()));
                        while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)) {
                            thread.resetMultipleValues();
                            {
                                SubLObject key = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                SubLObject mt_index = thread.secondMultipleValue();
                                thread.resetMultipleValues();
                                {
                                    SubLObject iteration_state_11 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_index));
                                    while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_11)) {
                                        thread.resetMultipleValues();
                                        {
                                            SubLObject mt = dictionary_contents.do_dictionary_contents_key_value(iteration_state_11);
                                            SubLObject tv_index = thread.secondMultipleValue();
                                            thread.resetMultipleValues();
                                            if (NIL != list_utilities.simple_tree_find_via_equalP(v_term, mt)) {
                                                {
                                                    SubLObject iteration_state_12 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_index));
                                                    while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_12)) {
                                                        thread.resetMultipleValues();
                                                        {
                                                            SubLObject key_13 = dictionary_contents.do_dictionary_contents_key_value(iteration_state_12);
                                                            SubLObject term_index = thread.secondMultipleValue();
                                                            thread.resetMultipleValues();
                                                            {
                                                                SubLObject iteration_state_14 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(term_index));
                                                                while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_14)) {
                                                                    thread.resetMultipleValues();
                                                                    {
                                                                        SubLObject key_15 = dictionary_contents.do_dictionary_contents_key_value(iteration_state_14);
                                                                        SubLObject support_set = thread.secondMultipleValue();
                                                                        thread.resetMultipleValues();
                                                                        support_sets = cons(support_set, support_sets);
                                                                        iteration_state_14 = dictionary_contents.do_dictionary_contents_next(iteration_state_14);
                                                                    }
                                                                } 
                                                                dictionary_contents.do_dictionary_contents_finalize(iteration_state_14);
                                                            }
                                                            iteration_state_12 = dictionary_contents.do_dictionary_contents_next(iteration_state_12);
                                                        }
                                                    } 
                                                    dictionary_contents.do_dictionary_contents_finalize(iteration_state_12);
                                                }
                                            }
                                            iteration_state_11 = dictionary_contents.do_dictionary_contents_next(iteration_state_11);
                                        }
                                    } 
                                    dictionary_contents.do_dictionary_contents_finalize(iteration_state_11);
                                }
                                iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state);
                            }
                        } 
                        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                    }
                } finally {
                    if (NIL != release) {
                        release_lock(lock);
                    }
                }
                return set_utilities.set_contents_union(support_sets, symbol_function(EQ));
            }
        }
    }

    public static final SubLObject index_kb_hl_support(SubLObject kb_hl_support, SubLObject hl_support) {
        {
            SubLObject datum = hl_support;
            SubLObject current = datum;
            SubLObject module = NIL;
            SubLObject sentence = NIL;
            SubLObject mt = NIL;
            SubLObject tv = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt63);
            module = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt63);
            sentence = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt63);
            mt = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt63);
            tv = current.first();
            current = current.rest();
            if (NIL == current) {
                {
                    SubLObject lock = $kb_hl_support_index_lock$.getGlobalValue();
                    SubLObject release = NIL;
                    try {
                        release = seize_lock(lock);
                        {
                            SubLObject mt_index = dictionary.dictionary_lookup_without_values($kb_hl_support_index$.getGlobalValue(), module, UNPROVIDED);
                            if (NIL == dictionary.dictionary_p(mt_index)) {
                                mt_index = dictionary.new_dictionary(symbol_function(EQUAL), UNPROVIDED);
                                dictionary.dictionary_enter($kb_hl_support_index$.getGlobalValue(), module, mt_index);
                            }
                            {
                                SubLObject tv_index = dictionary.dictionary_lookup_without_values(mt_index, mt, UNPROVIDED);
                                if (NIL == dictionary.dictionary_p(tv_index)) {
                                    tv_index = dictionary.new_dictionary(symbol_function(EQ), UNPROVIDED);
                                    dictionary.dictionary_enter(mt_index, mt, tv_index);
                                }
                                {
                                    SubLObject term_index = dictionary.dictionary_lookup_without_values(tv_index, tv, UNPROVIDED);
                                    if (NIL == dictionary.dictionary_p(term_index)) {
                                        term_index = dictionary.new_dictionary(symbol_function(EQUAL), UNPROVIDED);
                                        dictionary.dictionary_enter(tv_index, tv, term_index);
                                    }
                                    {
                                        SubLObject indexed_terms = kb_hl_support_index_indexed_terms(sentence);
                                        SubLObject cdolist_list_var = indexed_terms;
                                        SubLObject v_term = NIL;
                                        for (v_term = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , v_term = cdolist_list_var.first()) {
                                            {
                                                SubLObject old_supports = dictionary.dictionary_lookup_without_values(term_index, v_term, UNPROVIDED);
                                                SubLObject new_supports = set_contents.set_contents_add(kb_hl_support, old_supports, symbol_function(EQ));
                                                dictionary.dictionary_enter(term_index, v_term, new_supports);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    } finally {
                        if (NIL != release) {
                            release_lock(lock);
                        }
                    }
                }
            } else {
                cdestructuring_bind_error(datum, $list_alt63);
            }
        }
        return kb_hl_support;
    }

    public static final SubLObject unindex_kb_hl_support(SubLObject kb_hl_support, SubLObject robustP) {
        if (robustP == UNPROVIDED) {
            robustP = NIL;
        }
        if (NIL != robustP) {
            unindex_kb_hl_support_without_hl_support(kb_hl_support);
        } else {
            {
                SubLObject hl_support = kb_hl_support_hl_support(kb_hl_support);
                if (NIL != arguments.hl_support_p(hl_support)) {
                    unindex_kb_hl_support_with_hl_support(kb_hl_support, hl_support);
                } else {
                    unindex_kb_hl_support_without_hl_support(kb_hl_support);
                }
            }
        }
        return kb_hl_support;
    }

    public static final SubLObject unindex_kb_hl_support_with_hl_support(SubLObject kb_hl_support, SubLObject hl_support) {
        {
            SubLObject datum = hl_support;
            SubLObject current = datum;
            SubLObject module = NIL;
            SubLObject sentence = NIL;
            SubLObject mt = NIL;
            SubLObject tv = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt63);
            module = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt63);
            sentence = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt63);
            mt = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt63);
            tv = current.first();
            current = current.rest();
            if (NIL == current) {
                {
                    SubLObject lock = $kb_hl_support_index_lock$.getGlobalValue();
                    SubLObject release = NIL;
                    try {
                        release = seize_lock(lock);
                        {
                            SubLObject mt_index = dictionary.dictionary_lookup_without_values($kb_hl_support_index$.getGlobalValue(), module, UNPROVIDED);
                            if (NIL != dictionary.dictionary_p(mt_index)) {
                                {
                                    SubLObject tv_index = dictionary.dictionary_lookup_without_values(mt_index, mt, UNPROVIDED);
                                    if (NIL != dictionary.dictionary_p(tv_index)) {
                                        {
                                            SubLObject term_index = dictionary.dictionary_lookup_without_values(tv_index, tv, UNPROVIDED);
                                            if (NIL != dictionary.dictionary_p(term_index)) {
                                                {
                                                    SubLObject indexed_terms = kb_hl_support_index_indexed_terms(sentence);
                                                    SubLObject cdolist_list_var = indexed_terms;
                                                    SubLObject v_term = NIL;
                                                    for (v_term = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , v_term = cdolist_list_var.first()) {
                                                        {
                                                            SubLObject old_supports = dictionary.dictionary_lookup_without_values(term_index, v_term, UNPROVIDED);
                                                            SubLObject new_supports = set_contents.set_contents_delete(kb_hl_support, old_supports, symbol_function(EQ));
                                                            if (NIL != set_contents.set_contents_emptyP(new_supports)) {
                                                                dictionary.dictionary_remove(term_index, v_term);
                                                            } else {
                                                                dictionary.dictionary_enter(term_index, v_term, new_supports);
                                                            }
                                                        }
                                                    }
                                                }
                                                if (NIL != dictionary.dictionary_empty_p(term_index)) {
                                                    dictionary.dictionary_remove(tv_index, tv);
                                                }
                                            }
                                        }
                                        if (NIL != dictionary.dictionary_empty_p(tv_index)) {
                                            dictionary.dictionary_remove(mt_index, mt);
                                        }
                                    }
                                }
                                if (NIL != dictionary.dictionary_empty_p(mt_index)) {
                                    dictionary.dictionary_remove($kb_hl_support_index$.getGlobalValue(), module);
                                }
                            }
                        }
                    } finally {
                        if (NIL != release) {
                            release_lock(lock);
                        }
                    }
                }
            } else {
                cdestructuring_bind_error(datum, $list_alt63);
            }
        }
        return kb_hl_support;
    }

    public static final SubLObject unindex_kb_hl_support_without_hl_support(SubLObject kb_hl_support) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject lock = $kb_hl_support_index_lock$.getGlobalValue();
                SubLObject release = NIL;
                try {
                    release = seize_lock(lock);
                    {
                        SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents($kb_hl_support_index$.getGlobalValue()));
                        while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)) {
                            thread.resetMultipleValues();
                            {
                                SubLObject module = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                SubLObject mt_index = thread.secondMultipleValue();
                                thread.resetMultipleValues();
                                {
                                    SubLObject iteration_state_16 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_index));
                                    while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_16)) {
                                        thread.resetMultipleValues();
                                        {
                                            SubLObject mt = dictionary_contents.do_dictionary_contents_key_value(iteration_state_16);
                                            SubLObject tv_index = thread.secondMultipleValue();
                                            thread.resetMultipleValues();
                                            {
                                                SubLObject iteration_state_17 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_index));
                                                while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_17)) {
                                                    thread.resetMultipleValues();
                                                    {
                                                        SubLObject tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_17);
                                                        SubLObject term_index = thread.secondMultipleValue();
                                                        thread.resetMultipleValues();
                                                        {
                                                            SubLObject iteration_state_18 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(term_index));
                                                            while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_18)) {
                                                                thread.resetMultipleValues();
                                                                {
                                                                    SubLObject v_term = dictionary_contents.do_dictionary_contents_key_value(iteration_state_18);
                                                                    SubLObject supports = thread.secondMultipleValue();
                                                                    thread.resetMultipleValues();
                                                                    {
                                                                        SubLObject new_supports = set_contents.set_contents_delete(kb_hl_support, supports, symbol_function(EQ));
                                                                        if (NIL != set_contents.set_contents_emptyP(new_supports)) {
                                                                            dictionary.dictionary_remove(term_index, v_term);
                                                                        } else {
                                                                            dictionary.dictionary_enter(term_index, v_term, new_supports);
                                                                        }
                                                                    }
                                                                    iteration_state_18 = dictionary_contents.do_dictionary_contents_next(iteration_state_18);
                                                                }
                                                            } 
                                                            dictionary_contents.do_dictionary_contents_finalize(iteration_state_18);
                                                        }
                                                        if (NIL != dictionary.dictionary_empty_p(term_index)) {
                                                            dictionary.dictionary_remove(tv_index, tv);
                                                        }
                                                        iteration_state_17 = dictionary_contents.do_dictionary_contents_next(iteration_state_17);
                                                    }
                                                } 
                                                dictionary_contents.do_dictionary_contents_finalize(iteration_state_17);
                                            }
                                            if (NIL != dictionary.dictionary_empty_p(tv_index)) {
                                                dictionary.dictionary_remove(mt_index, mt);
                                            }
                                            iteration_state_16 = dictionary_contents.do_dictionary_contents_next(iteration_state_16);
                                        }
                                    } 
                                    dictionary_contents.do_dictionary_contents_finalize(iteration_state_16);
                                }
                                if (NIL != dictionary.dictionary_empty_p(mt_index)) {
                                    dictionary.dictionary_remove($kb_hl_support_index$.getGlobalValue(), module);
                                }
                                iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state);
                            }
                        } 
                        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                    }
                } finally {
                    if (NIL != release) {
                        release_lock(lock);
                    }
                }
            }
            return kb_hl_support;
        }
    }

    public static final SubLObject clear_kb_hl_support_index() {
        dictionary.clear_dictionary($kb_hl_support_index$.getGlobalValue());
        return NIL;
    }

    public static final SubLObject reindex_all_kb_hl_supports() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            clear_kb_hl_support_index();
            {
                SubLObject idx = do_kb_hl_supports_table();
                SubLObject total = id_index.id_index_count(idx);
                SubLObject sofar = ZERO_INTEGER;
                SubLTrampolineFile.checkType($$$reindexing_KB_HL_supports, STRINGP);
                {
                    SubLObject _prev_bind_0 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
                    SubLObject _prev_bind_1 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
                    SubLObject _prev_bind_2 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
                    SubLObject _prev_bind_3 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
                    try {
                        utilities_macros.$last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                        utilities_macros.$last_percent_progress_prediction$.bind(NIL, thread);
                        utilities_macros.$within_noting_percent_progress$.bind(T, thread);
                        utilities_macros.$percent_progress_start_time$.bind(get_universal_time(), thread);
                        utilities_macros.noting_percent_progress_preamble($$$reindexing_KB_HL_supports);
                        if (NIL == id_index.do_id_index_empty_p(idx, $SKIP)) {
                            {
                                SubLObject id = id_index.do_id_index_next_id(idx, T, NIL, NIL);
                                SubLObject state_var = id_index.do_id_index_next_state(idx, T, id, NIL);
                                SubLObject kb_hl_support = NIL;
                                while (NIL != id) {
                                    kb_hl_support = id_index.do_id_index_state_object(idx, $SKIP, id, state_var);
                                    if (NIL != id_index.do_id_index_id_and_object_validP(id, kb_hl_support, $SKIP)) {
                                        utilities_macros.note_percent_progress(sofar, total);
                                        sofar = add(sofar, ONE_INTEGER);
                                        {
                                            SubLObject hl_support = kb_hl_support_hl_support(kb_hl_support);
                                            index_kb_hl_support(kb_hl_support, hl_support);
                                        }
                                    }
                                    id = id_index.do_id_index_next_id(idx, T, id, state_var);
                                    state_var = id_index.do_id_index_next_state(idx, T, id, state_var);
                                } 
                            }
                        }
                        utilities_macros.noting_percent_progress_postamble();
                    } finally {
                        utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_3, thread);
                        utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_2, thread);
                        utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_1, thread);
                        utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_0, thread);
                    }
                }
            }
            return NIL;
        }
    }



    public static final SubLObject note_kb_hl_support_creation_started(SubLObject hl_support, SubLObject kb_hl_support) {
        if (NIL == dictionary.dictionary_p($kb_hl_supports_being_created$.getGlobalValue())) {
            $kb_hl_supports_being_created$.setGlobalValue(dictionary.new_dictionary(symbol_function(EQUAL), UNPROVIDED));
        }
        dictionary.dictionary_enter($kb_hl_supports_being_created$.getGlobalValue(), hl_support, kb_hl_support);
        return hl_support;
    }

    public static final SubLObject note_kb_hl_support_creation_complete(SubLObject hl_support) {
        if (NIL != dictionary.dictionary_p($kb_hl_supports_being_created$.getGlobalValue())) {
            dictionary.dictionary_remove($kb_hl_supports_being_created$.getGlobalValue(), hl_support);
        }
        return hl_support;
    }

    public static final SubLObject find_kb_hl_support_during_creation(SubLObject hl_support) {
        {
            SubLObject kb_hl_support = NIL;
            if (NIL != dictionary.dictionary_p($kb_hl_supports_being_created$.getGlobalValue())) {
                kb_hl_support = dictionary.dictionary_lookup_without_values($kb_hl_supports_being_created$.getGlobalValue(), hl_support, UNPROVIDED);
            }
            return kb_hl_support;
        }
    }

    public static final SubLObject find_or_create_kb_hl_support(SubLObject hl_support, SubLObject justification) {
        {
            SubLObject kb_hl_support = find_kb_hl_support(hl_support);
            if (NIL == kb_hl_support) {
                kb_hl_support = create_kb_hl_support(hl_support, justification);
            }
            return kb_hl_support;
        }
    }

    public static final SubLObject create_kb_hl_support(SubLObject hl_support, SubLObject justification) {
        {
            SubLObject id = next_kb_hl_support_id();
            SubLObject kb_hl_support = new_kb_hl_support(id);
            SubLObject kb_hl_support_content = new_kb_hl_support_content();
            note_kb_hl_support_creation_started(hl_support, kb_hl_support);
            increment_next_kb_hl_support_id();
            register_kb_hl_support_id(id, kb_hl_support);
            kb_hl_support_manager.register_kb_hl_support_content(id, kb_hl_support_content);
            {
                SubLObject canon_just = arguments.canonicalize_supports(justification, T);
                SubLObject deduction = deductions_high.create_deduction_for_hl_support(hl_support, canon_just);
                kb_hl_support_content_set_argument(kb_hl_support_content, deduction);
            }
            index_kb_hl_support(kb_hl_support, hl_support);
            note_kb_hl_support_creation_complete(hl_support);
            return kb_hl_support;
        }
    }

    public static final SubLObject destroy_kb_hl_support(SubLObject kb_hl_support) {
        unindex_kb_hl_support(kb_hl_support, UNPROVIDED);
        {
            SubLObject id = kb_hl_support_id(kb_hl_support);
            remove_kb_hl_support(kb_hl_support);
            deregister_kb_hl_support_id(id);
            kb_hl_support_manager.deregister_kb_hl_support_content(id);
        }
        return kb_hl_support;
    }

    public static final SubLObject free_all_kb_hl_support() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            clear_kb_hl_support_index();
            {
                SubLObject idx = do_kb_hl_supports_table();
                SubLObject total = id_index.id_index_count(idx);
                SubLObject sofar = ZERO_INTEGER;
                SubLTrampolineFile.checkType($$$Freeing_KB_HL_supports, STRINGP);
                {
                    SubLObject _prev_bind_0 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
                    SubLObject _prev_bind_1 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
                    SubLObject _prev_bind_2 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
                    SubLObject _prev_bind_3 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
                    try {
                        utilities_macros.$last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                        utilities_macros.$last_percent_progress_prediction$.bind(NIL, thread);
                        utilities_macros.$within_noting_percent_progress$.bind(T, thread);
                        utilities_macros.$percent_progress_start_time$.bind(get_universal_time(), thread);
                        utilities_macros.noting_percent_progress_preamble($$$Freeing_KB_HL_supports);
                        if (NIL == id_index.do_id_index_empty_p(idx, $SKIP)) {
                            {
                                SubLObject id = id_index.do_id_index_next_id(idx, T, NIL, NIL);
                                SubLObject state_var = id_index.do_id_index_next_state(idx, T, id, NIL);
                                SubLObject kb_hl_support = NIL;
                                while (NIL != id) {
                                    kb_hl_support = id_index.do_id_index_state_object(idx, $SKIP, id, state_var);
                                    if (NIL != id_index.do_id_index_id_and_object_validP(id, kb_hl_support, $SKIP)) {
                                        utilities_macros.note_percent_progress(sofar, total);
                                        sofar = add(sofar, ONE_INTEGER);
                                        {
                                            SubLObject content = kb_hl_support_content(kb_hl_support);
                                            free_kb_hl_support(kb_hl_support);
                                            free_kb_hl_support_content(content);
                                        }
                                    }
                                    id = id_index.do_id_index_next_id(idx, T, id, state_var);
                                    state_var = id_index.do_id_index_next_state(idx, T, id, state_var);
                                } 
                            }
                        }
                        utilities_macros.noting_percent_progress_postamble();
                    } finally {
                        utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_3, thread);
                        utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_2, thread);
                        utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_1, thread);
                        utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_0, thread);
                    }
                }
            }
            clear_kb_hl_support_id_tables();
            return NIL;
        }
    }

    public static final SubLObject possibly_reify_hl_supports(SubLObject justification) {
        return Mapping.mapcar(POSSIBLY_REIFY_HL_SUPPORT, justification);
    }

    public static final SubLObject possibly_reify_hl_support(SubLObject support) {
        if (NIL != assertion_handles.assertion_p(support)) {
            return support;
        } else
            if (NIL != kb_hl_support_p(support)) {
                return support;
            } else {
                {
                    SubLObject kb_hl_support = find_or_possibly_create_kb_hl_support(support);
                    return NIL != kb_hl_support ? ((SubLObject) (kb_hl_support)) : support;
                }
            }

    }

    // defparameter
    public static final SubLSymbol $unreify_kb_hl_supportsP$ = makeSymbol("*UNREIFY-KB-HL-SUPPORTS?*");

    public static final SubLObject possibly_unreify_kb_hl_supports(SubLObject justification) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return NIL != $unreify_kb_hl_supportsP$.getDynamicValue(thread) ? ((SubLObject) (unreify_kb_hl_supports(justification))) : justification;
        }
    }

    public static final SubLObject unreify_kb_hl_supports(SubLObject justification) {
        return Mapping.mapcar(UNREIFY_KB_HL_SUPPORT, justification);
    }

    public static final SubLObject unreify_kb_hl_support(SubLObject support) {
        return NIL != kb_hl_support_p(support) ? ((SubLObject) (kb_hl_support_hl_support(support))) : support;
    }

    // defparameter
    public static final SubLSymbol $tms_kb_hl_support_queue$ = makeSymbol("*TMS-KB-HL-SUPPORT-QUEUE*");

    public static final SubLObject enqueueing_kb_hl_supports_for_tmsP() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return queues.queue_p($tms_kb_hl_support_queue$.getDynamicValue(thread));
        }
    }

    public static final SubLObject with_kb_hl_support_rejustification(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject body = current;
            return list(PIF, $list_alt70, bq_cons(PROGN, append(body, NIL)), listS(CLET, $list_alt73, append(body, $list_alt74)));
        }
    }

    public static final SubLObject process_tms_kb_hl_support_queue() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            while (NIL == queues.queue_empty_p($tms_kb_hl_support_queue$.getDynamicValue(thread))) {
                {
                    SubLObject kb_hl_support = queues.dequeue($tms_kb_hl_support_queue$.getDynamicValue(thread));
                    if (kb_hl_support_id(kb_hl_support).isInteger()) {
                        rejustify_or_remove_kb_hl_support(kb_hl_support);
                    }
                }
            } 
            return NIL;
        }
    }

    public static final SubLObject rejustify_or_remove_kb_hl_support(SubLObject kb_hl_support) {
        {
            SubLObject hl_support = kb_hl_support_hl_support(kb_hl_support);
            SubLObject rejustifiedP = NIL;
            if (NIL != hl_supports.hl_verify(hl_support)) {
                rejustify_kb_hl_support(kb_hl_support);
                rejustifiedP = T;
            } else {
                tms_remove_kb_hl_support(kb_hl_support);
            }
            return rejustifiedP;
        }
    }

    public static final SubLObject tms_possibly_rejustify_kb_hl_support(SubLObject kb_hl_support) {
        return NIL != enqueueing_kb_hl_supports_for_tmsP() ? ((SubLObject) (enqueue_kb_hl_support_for_tms(kb_hl_support))) : makeBoolean(NIL == possibly_rejustify_kb_hl_support(kb_hl_support));
    }

    public static final SubLObject enqueue_kb_hl_support_for_tms(SubLObject kb_hl_support) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject hl_support = kb_hl_support_hl_support(kb_hl_support);
                SubLObject content = kb_hl_support_content(kb_hl_support);
                kb_hl_support_content_set_argument(content, hl_support);
                kb_hl_support_manager.mark_kb_hl_support_content_as_muted(kb_hl_support_id(kb_hl_support));
            }
            queues.enqueue(kb_hl_support, $tms_kb_hl_support_queue$.getDynamicValue(thread));
            return NIL;
        }
    }

    public static final SubLObject possibly_rejustify_kb_hl_support(SubLObject kb_hl_support) {
        {
            SubLObject hl_support = kb_hl_support_hl_support(kb_hl_support);
            SubLObject rejustifiedP = NIL;
            if (NIL != hl_supports.hl_verify(hl_support)) {
                rejustify_kb_hl_support(kb_hl_support);
                rejustifiedP = T;
            } else {
                handle_unverifiable_kb_hl_support(kb_hl_support);
            }
            return rejustifiedP;
        }
    }

    public static final SubLObject tms_remove_kb_hl_support(SubLObject kb_hl_support) {
        {
            SubLObject set_contents_var = do_kb_hl_support_dependents_helper(kb_hl_support);
            SubLObject basis_object = set_contents.do_set_contents_basis_object(set_contents_var);
            SubLObject state = NIL;
            for (state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                {
                    SubLObject deduction = set_contents.do_set_contents_next(basis_object, state);
                    if (NIL != set_contents.do_set_contents_element_validP(state, deduction)) {
                        tms.tms_remove_deduction(deduction);
                    }
                }
            }
        }
        destroy_kb_hl_support(kb_hl_support);
        return kb_hl_support;
    }

    public static final SubLObject verify_kb_hl_support(SubLObject kb_hl_support) {
        {
            SubLObject hl_support = kb_hl_support_hl_support(kb_hl_support);
            SubLObject verifiedP = hl_supports.hl_verify(hl_support);
            if (NIL == verifiedP) {
                handle_unverifiable_kb_hl_support(kb_hl_support);
            }
            return verifiedP;
        }
    }

    public static final SubLObject handle_unverifiable_kb_hl_support(SubLObject kb_hl_support) {
        {
            SubLObject content = kb_hl_support_content(kb_hl_support);
            SubLObject argument = kb_hl_support_content_get_argument(content);
            if (NIL != deduction_handles.deduction_p(argument)) {
                if (NIL != tms.tms_argument_being_removedP(argument)) {
                    tms_remove_kb_hl_support(kb_hl_support);
                } else {
                    tms.tms_remove_deduction(argument);
                }
            } else {
                tms_remove_kb_hl_support(kb_hl_support);
            }
        }
        return NIL;
    }

    public static final SubLObject partition_create_invalid_kb_hl_support() {
        return make_kb_hl_support(UNPROVIDED);
    }

    /**
     * Create a sample invalid KB HL support.
     */
    public static final SubLObject create_sample_invalid_kb_hl_support() {
        return make_kb_hl_support(UNPROVIDED);
    }

    // defparameter
    public static final SubLSymbol $kb_hl_support_dump_id_table$ = makeSymbol("*KB-HL-SUPPORT-DUMP-ID-TABLE*");

    /**
     * Return the id of KB-HL-SUPPORT to use during a KB dump.
     */
    public static final SubLObject kb_hl_support_dump_id(SubLObject kb_hl_support) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject id = kb_hl_support_id(kb_hl_support);
                SubLObject dump_table = $kb_hl_support_dump_id_table$.getDynamicValue(thread);
                if (NIL != dump_table) {
                    id = id_index.id_index_lookup(dump_table, id, UNPROVIDED);
                }
                return id;
            }
        }
    }

    public static final SubLObject find_kb_hl_support_by_dump_id(SubLObject dump_id) {
        return find_kb_hl_support_by_id(dump_id);
    }

    public static final SubLObject with_kb_hl_support_dump_id_table(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject body = current;
            return listS(CLET, $list_alt77, append(body, NIL));
        }
    }

    public static final SubLObject create_kb_hl_support_dump_id_table() {
        return id_index.new_indirect_compact_id_index($kb_hl_supports_from_ids$.getGlobalValue());
    }

    public static final SubLObject dump_kb_hl_support_content(SubLObject kb_hl_support, SubLObject stream) {
        {
            SubLObject content = kb_hl_support_content(kb_hl_support);
            cfasl_output(kb_hl_support_content_get_argument(content), stream);
            cfasl_output(kb_hl_support_content_get_dependents(content), stream);
        }
        return kb_hl_support;
    }

    public static final SubLObject load_kb_hl_support_content(SubLObject kb_hl_support, SubLObject stream) {
        {
            SubLObject id = kb_hl_support_id(kb_hl_support);
            SubLObject argument = cfasl_input(stream, NIL, UNPROVIDED);
            SubLObject dependents = cfasl_input(stream, NIL, UNPROVIDED);
            SubLObject content = new_kb_hl_support_content();
            kb_hl_support_content_set_argument(content, argument);
            kb_hl_support_content_set_dependents(content, dependents);
            kb_hl_support_manager.register_kb_hl_support_content(id, content);
            return id;
        }
    }

    public static final SubLObject dump_kb_hl_support_indexing_int(SubLObject filename) {
        cfasl_utilities.cfasl_save($kb_hl_support_index$.getGlobalValue(), filename);
        return NIL;
    }

    public static final SubLObject load_kb_hl_support_indexing_int(SubLObject filename) {
        $kb_hl_support_index$.setGlobalValue(cfasl_utilities.cfasl_load(filename));
        return NIL;
    }

    public static final SubLObject kb_hl_support_not_findable_by_hl_supportP(SubLObject kb_hl_support) {
        {
            SubLObject hl_support = kb_hl_support_hl_support(kb_hl_support);
            return makeBoolean(kb_hl_support != find_kb_hl_support(hl_support));
        }
    }

    public static final SubLObject kb_hl_support_circularP(SubLObject kb_hl_support) {
        {
            SubLObject justification = kb_hl_support_justification(kb_hl_support);
            return kb_hl_support_circularP_int(list(kb_hl_support), justification);
        }
    }

    public static final SubLObject kb_hl_support_circularP_int(SubLObject v_kb_hl_supports, SubLObject justification) {
        {
            SubLObject circularP = keyhash_utilities.fast_intersectP(v_kb_hl_supports, justification, symbol_function(EQ), UNPROVIDED, UNPROVIDED);
            if (NIL == circularP) {
                {
                    SubLObject csome_list_var = justification;
                    SubLObject support = NIL;
                    for (support = csome_list_var.first(); !((NIL != circularP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , support = csome_list_var.first()) {
                        if (NIL != kb_hl_support_p(support)) {
                            {
                                SubLObject new_kb_hl_supports = cons(support, v_kb_hl_supports);
                                SubLObject new_justification = kb_hl_support_justification(support);
                                if (NIL != kb_hl_support_circularP_int(new_kb_hl_supports, new_justification)) {
                                    circularP = T;
                                }
                            }
                        }
                    }
                }
            }
            return circularP;
        }
    }

    public static final SubLObject kb_hl_support_has_invalid_dependentP(SubLObject kb_hl_support, SubLObject robustP) {
        if (robustP == UNPROVIDED) {
            robustP = NIL;
        }
        {
            SubLObject invalid_dependentP = NIL;
            SubLObject set_contents_var = do_kb_hl_support_dependents_helper(kb_hl_support);
            SubLObject basis_object = set_contents.do_set_contents_basis_object(set_contents_var);
            SubLObject state = NIL;
            for (state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); !((NIL != invalid_dependentP) || (NIL != set_contents.do_set_contents_doneP(basis_object, state))); state = set_contents.do_set_contents_update_state(state)) {
                {
                    SubLObject dependent = set_contents.do_set_contents_next(basis_object, state);
                    if (NIL != set_contents.do_set_contents_element_validP(state, dependent)) {
                        if (NIL == deduction_handles.valid_deductionP(dependent, robustP)) {
                            invalid_dependentP = T;
                        }
                    }
                }
            }
            return invalid_dependentP;
        }
    }

    public static final SubLObject kb_hl_support_has_invalid_argumentP(SubLObject kb_hl_support, SubLObject robustP) {
        if (robustP == UNPROVIDED) {
            robustP = NIL;
        }
        {
            SubLObject invalid_argumentP = NIL;
            SubLObject rest = NIL;
            for (rest = kb_hl_support_arguments(kb_hl_support); !((NIL != invalid_argumentP) || (NIL == rest)); rest = rest.rest()) {
                {
                    SubLObject argument = rest.first();
                    if (NIL == deduction_handles.valid_deductionP(argument, robustP)) {
                        invalid_argumentP = T;
                    }
                }
            }
            return invalid_argumentP;
        }
    }

    public static final SubLObject kb_hl_support_has_invalid_hl_supportP(SubLObject kb_hl_support) {
        {
            SubLObject hl_support = kb_hl_support_hl_support(kb_hl_support);
            return makeBoolean(NIL == arguments.valid_hl_supportP(hl_support));
        }
    }

    public static final SubLObject kb_hl_support_has_missing_backpointerP(SubLObject kb_hl_support) {
        {
            SubLObject missing_backpointerP = NIL;
            SubLObject set_contents_var = do_kb_hl_support_dependents_helper(kb_hl_support);
            SubLObject basis_object = set_contents.do_set_contents_basis_object(set_contents_var);
            SubLObject state = NIL;
            for (state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); !((NIL != missing_backpointerP) || (NIL != set_contents.do_set_contents_doneP(basis_object, state))); state = set_contents.do_set_contents_update_state(state)) {
                {
                    SubLObject dependent = set_contents.do_set_contents_next(basis_object, state);
                    if (NIL != set_contents.do_set_contents_element_validP(state, dependent)) {
                        if (NIL != deduction_handles.valid_deductionP(dependent, UNPROVIDED)) {
                            {
                                SubLObject backpointerP = NIL;
                                if (NIL == backpointerP) {
                                    {
                                        SubLObject csome_list_var = deductions_high.deduction_supports(dependent);
                                        SubLObject support = NIL;
                                        for (support = csome_list_var.first(); !((NIL != backpointerP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , support = csome_list_var.first()) {
                                            if (support == kb_hl_support) {
                                                backpointerP = T;
                                            }
                                        }
                                    }
                                }
                                if (NIL == backpointerP) {
                                    missing_backpointerP = T;
                                }
                            }
                        }
                    }
                }
            }
            return missing_backpointerP;
        }
    }

    public static final SubLObject kb_hl_supports_not_findable_by_hl_support() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject failures = NIL;
                SubLObject idx = do_kb_hl_supports_table();
                SubLObject total = id_index.id_index_count(idx);
                SubLObject sofar = ZERO_INTEGER;
                SubLTrampolineFile.checkType($$$Verifying_KB_HL_support_indexing, STRINGP);
                {
                    SubLObject _prev_bind_0 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
                    SubLObject _prev_bind_1 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
                    SubLObject _prev_bind_2 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
                    SubLObject _prev_bind_3 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
                    try {
                        utilities_macros.$last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                        utilities_macros.$last_percent_progress_prediction$.bind(NIL, thread);
                        utilities_macros.$within_noting_percent_progress$.bind(T, thread);
                        utilities_macros.$percent_progress_start_time$.bind(get_universal_time(), thread);
                        utilities_macros.noting_percent_progress_preamble($$$Verifying_KB_HL_support_indexing);
                        if (NIL == id_index.do_id_index_empty_p(idx, $SKIP)) {
                            {
                                SubLObject id = id_index.do_id_index_next_id(idx, T, NIL, NIL);
                                SubLObject state_var = id_index.do_id_index_next_state(idx, T, id, NIL);
                                SubLObject kb_hl_support = NIL;
                                while (NIL != id) {
                                    kb_hl_support = id_index.do_id_index_state_object(idx, $SKIP, id, state_var);
                                    if (NIL != id_index.do_id_index_id_and_object_validP(id, kb_hl_support, $SKIP)) {
                                        utilities_macros.note_percent_progress(sofar, total);
                                        sofar = add(sofar, ONE_INTEGER);
                                        if (NIL != kb_hl_support_not_findable_by_hl_supportP(kb_hl_support)) {
                                            failures = cons(kb_hl_support, failures);
                                        }
                                    }
                                    id = id_index.do_id_index_next_id(idx, T, id, state_var);
                                    state_var = id_index.do_id_index_next_state(idx, T, id, state_var);
                                } 
                            }
                        }
                        utilities_macros.noting_percent_progress_postamble();
                    } finally {
                        utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_3, thread);
                        utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_2, thread);
                        utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_1, thread);
                        utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_0, thread);
                    }
                }
                return nreverse(failures);
            }
        }
    }

    public static final SubLObject circular_kb_hl_supports() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject circular_supports = NIL;
                SubLObject idx = do_kb_hl_supports_table();
                SubLObject total = id_index.id_index_count(idx);
                SubLObject sofar = ZERO_INTEGER;
                SubLTrampolineFile.checkType($str_alt81$Searching_for_circular_KB_HL_supp, STRINGP);
                {
                    SubLObject _prev_bind_0 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
                    SubLObject _prev_bind_1 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
                    SubLObject _prev_bind_2 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
                    SubLObject _prev_bind_3 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
                    try {
                        utilities_macros.$last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                        utilities_macros.$last_percent_progress_prediction$.bind(NIL, thread);
                        utilities_macros.$within_noting_percent_progress$.bind(T, thread);
                        utilities_macros.$percent_progress_start_time$.bind(get_universal_time(), thread);
                        utilities_macros.noting_percent_progress_preamble($str_alt81$Searching_for_circular_KB_HL_supp);
                        if (NIL == id_index.do_id_index_empty_p(idx, $SKIP)) {
                            {
                                SubLObject id = id_index.do_id_index_next_id(idx, T, NIL, NIL);
                                SubLObject state_var = id_index.do_id_index_next_state(idx, T, id, NIL);
                                SubLObject kb_hl_support = NIL;
                                while (NIL != id) {
                                    kb_hl_support = id_index.do_id_index_state_object(idx, $SKIP, id, state_var);
                                    if (NIL != id_index.do_id_index_id_and_object_validP(id, kb_hl_support, $SKIP)) {
                                        utilities_macros.note_percent_progress(sofar, total);
                                        sofar = add(sofar, ONE_INTEGER);
                                        if (NIL != kb_hl_support_circularP(kb_hl_support)) {
                                            circular_supports = cons(kb_hl_support, circular_supports);
                                        }
                                    }
                                    id = id_index.do_id_index_next_id(idx, T, id, state_var);
                                    state_var = id_index.do_id_index_next_state(idx, T, id, state_var);
                                } 
                            }
                        }
                        utilities_macros.noting_percent_progress_postamble();
                    } finally {
                        utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_3, thread);
                        utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_2, thread);
                        utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_1, thread);
                        utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_0, thread);
                    }
                }
                return nreverse(circular_supports);
            }
        }
    }

    public static final SubLObject duplicate_kb_hl_supports() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_hl_supports = dictionary.new_dictionary(symbol_function(EQUAL), UNPROVIDED);
                SubLObject duplicate_supports = NIL;
                SubLObject idx = do_kb_hl_supports_table();
                SubLObject total = id_index.id_index_count(idx);
                SubLObject sofar = ZERO_INTEGER;
                SubLTrampolineFile.checkType($str_alt82$Searching_for_duplicate_KB_HL_sup, STRINGP);
                {
                    SubLObject _prev_bind_0 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
                    SubLObject _prev_bind_1 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
                    SubLObject _prev_bind_2 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
                    SubLObject _prev_bind_3 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
                    try {
                        utilities_macros.$last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                        utilities_macros.$last_percent_progress_prediction$.bind(NIL, thread);
                        utilities_macros.$within_noting_percent_progress$.bind(T, thread);
                        utilities_macros.$percent_progress_start_time$.bind(get_universal_time(), thread);
                        utilities_macros.noting_percent_progress_preamble($str_alt82$Searching_for_duplicate_KB_HL_sup);
                        if (NIL == id_index.do_id_index_empty_p(idx, $SKIP)) {
                            {
                                SubLObject id = id_index.do_id_index_next_id(idx, T, NIL, NIL);
                                SubLObject state_var = id_index.do_id_index_next_state(idx, T, id, NIL);
                                SubLObject kb_hl_support = NIL;
                                while (NIL != id) {
                                    kb_hl_support = id_index.do_id_index_state_object(idx, $SKIP, id, state_var);
                                    if (NIL != id_index.do_id_index_id_and_object_validP(id, kb_hl_support, $SKIP)) {
                                        utilities_macros.note_percent_progress(sofar, total);
                                        sofar = add(sofar, ONE_INTEGER);
                                        {
                                            SubLObject hl_support = kb_hl_support_hl_support(kb_hl_support);
                                            dictionary_utilities.dictionary_push(v_hl_supports, hl_support, kb_hl_support);
                                        }
                                    }
                                    id = id_index.do_id_index_next_id(idx, T, id, state_var);
                                    state_var = id_index.do_id_index_next_state(idx, T, id, state_var);
                                } 
                            }
                        }
                        utilities_macros.noting_percent_progress_postamble();
                    } finally {
                        utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_3, thread);
                        utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_2, thread);
                        utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_1, thread);
                        utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_0, thread);
                    }
                }
                {
                    SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(v_hl_supports));
                    while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)) {
                        thread.resetMultipleValues();
                        {
                            SubLObject hl_support = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                            SubLObject v_kb_hl_supports = thread.secondMultipleValue();
                            thread.resetMultipleValues();
                            if (NIL != list_utilities.lengthG(v_kb_hl_supports, ONE_INTEGER, UNPROVIDED)) {
                                duplicate_supports = nconc(duplicate_supports, v_kb_hl_supports);
                            }
                            iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state);
                        }
                    } 
                    dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                }
                return Sort.sort(duplicate_supports, symbol_function($sym83$_), KB_HL_SUPPORT_ID);
            }
        }
    }

    public static final SubLObject kb_hl_supports_with_invalid_dependents(SubLObject robustP) {
        if (robustP == UNPROVIDED) {
            robustP = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result = NIL;
                SubLObject idx = do_kb_hl_supports_table();
                SubLObject total = id_index.id_index_count(idx);
                SubLObject sofar = ZERO_INTEGER;
                SubLTrampolineFile.checkType($str_alt85$Searching_for_KB_HL_supports_with, STRINGP);
                {
                    SubLObject _prev_bind_0 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
                    SubLObject _prev_bind_1 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
                    SubLObject _prev_bind_2 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
                    SubLObject _prev_bind_3 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
                    try {
                        utilities_macros.$last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                        utilities_macros.$last_percent_progress_prediction$.bind(NIL, thread);
                        utilities_macros.$within_noting_percent_progress$.bind(T, thread);
                        utilities_macros.$percent_progress_start_time$.bind(get_universal_time(), thread);
                        utilities_macros.noting_percent_progress_preamble($str_alt85$Searching_for_KB_HL_supports_with);
                        if (NIL == id_index.do_id_index_empty_p(idx, $SKIP)) {
                            {
                                SubLObject id = id_index.do_id_index_next_id(idx, T, NIL, NIL);
                                SubLObject state_var = id_index.do_id_index_next_state(idx, T, id, NIL);
                                SubLObject kb_hl_support = NIL;
                                while (NIL != id) {
                                    kb_hl_support = id_index.do_id_index_state_object(idx, $SKIP, id, state_var);
                                    if (NIL != id_index.do_id_index_id_and_object_validP(id, kb_hl_support, $SKIP)) {
                                        utilities_macros.note_percent_progress(sofar, total);
                                        sofar = add(sofar, ONE_INTEGER);
                                        if (NIL != kb_hl_support_has_invalid_dependentP(kb_hl_support, robustP)) {
                                            result = cons(kb_hl_support, result);
                                        }
                                    }
                                    id = id_index.do_id_index_next_id(idx, T, id, state_var);
                                    state_var = id_index.do_id_index_next_state(idx, T, id, state_var);
                                } 
                            }
                        }
                        utilities_macros.noting_percent_progress_postamble();
                    } finally {
                        utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_3, thread);
                        utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_2, thread);
                        utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_1, thread);
                        utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_0, thread);
                    }
                }
                return nreverse(result);
            }
        }
    }

    public static final SubLObject kb_hl_supports_with_invalid_arguments(SubLObject robustP) {
        if (robustP == UNPROVIDED) {
            robustP = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result = NIL;
                SubLObject idx = do_kb_hl_supports_table();
                SubLObject total = id_index.id_index_count(idx);
                SubLObject sofar = ZERO_INTEGER;
                SubLTrampolineFile.checkType($str_alt86$Searching_for_KB_HL_supports_with, STRINGP);
                {
                    SubLObject _prev_bind_0 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
                    SubLObject _prev_bind_1 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
                    SubLObject _prev_bind_2 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
                    SubLObject _prev_bind_3 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
                    try {
                        utilities_macros.$last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                        utilities_macros.$last_percent_progress_prediction$.bind(NIL, thread);
                        utilities_macros.$within_noting_percent_progress$.bind(T, thread);
                        utilities_macros.$percent_progress_start_time$.bind(get_universal_time(), thread);
                        utilities_macros.noting_percent_progress_preamble($str_alt86$Searching_for_KB_HL_supports_with);
                        if (NIL == id_index.do_id_index_empty_p(idx, $SKIP)) {
                            {
                                SubLObject id = id_index.do_id_index_next_id(idx, T, NIL, NIL);
                                SubLObject state_var = id_index.do_id_index_next_state(idx, T, id, NIL);
                                SubLObject kb_hl_support = NIL;
                                while (NIL != id) {
                                    kb_hl_support = id_index.do_id_index_state_object(idx, $SKIP, id, state_var);
                                    if (NIL != id_index.do_id_index_id_and_object_validP(id, kb_hl_support, $SKIP)) {
                                        utilities_macros.note_percent_progress(sofar, total);
                                        sofar = add(sofar, ONE_INTEGER);
                                        if (NIL != kb_hl_support_has_invalid_argumentP(kb_hl_support, robustP)) {
                                            result = cons(kb_hl_support, result);
                                        }
                                    }
                                    id = id_index.do_id_index_next_id(idx, T, id, state_var);
                                    state_var = id_index.do_id_index_next_state(idx, T, id, state_var);
                                } 
                            }
                        }
                        utilities_macros.noting_percent_progress_postamble();
                    } finally {
                        utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_3, thread);
                        utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_2, thread);
                        utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_1, thread);
                        utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_0, thread);
                    }
                }
                return nreverse(result);
            }
        }
    }

    public static final SubLObject kb_hl_supports_with_invalid_hl_supports() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result = NIL;
                SubLObject idx = do_kb_hl_supports_table();
                SubLObject total = id_index.id_index_count(idx);
                SubLObject sofar = ZERO_INTEGER;
                SubLTrampolineFile.checkType($str_alt87$Searching_for_KB_HL_supports_with, STRINGP);
                {
                    SubLObject _prev_bind_0 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
                    SubLObject _prev_bind_1 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
                    SubLObject _prev_bind_2 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
                    SubLObject _prev_bind_3 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
                    try {
                        utilities_macros.$last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                        utilities_macros.$last_percent_progress_prediction$.bind(NIL, thread);
                        utilities_macros.$within_noting_percent_progress$.bind(T, thread);
                        utilities_macros.$percent_progress_start_time$.bind(get_universal_time(), thread);
                        utilities_macros.noting_percent_progress_preamble($str_alt87$Searching_for_KB_HL_supports_with);
                        if (NIL == id_index.do_id_index_empty_p(idx, $SKIP)) {
                            {
                                SubLObject id = id_index.do_id_index_next_id(idx, T, NIL, NIL);
                                SubLObject state_var = id_index.do_id_index_next_state(idx, T, id, NIL);
                                SubLObject kb_hl_support = NIL;
                                while (NIL != id) {
                                    kb_hl_support = id_index.do_id_index_state_object(idx, $SKIP, id, state_var);
                                    if (NIL != id_index.do_id_index_id_and_object_validP(id, kb_hl_support, $SKIP)) {
                                        utilities_macros.note_percent_progress(sofar, total);
                                        sofar = add(sofar, ONE_INTEGER);
                                        if (NIL != kb_hl_support_has_invalid_hl_supportP(kb_hl_support)) {
                                            result = cons(kb_hl_support, result);
                                        }
                                    }
                                    id = id_index.do_id_index_next_id(idx, T, id, state_var);
                                    state_var = id_index.do_id_index_next_state(idx, T, id, state_var);
                                } 
                            }
                        }
                        utilities_macros.noting_percent_progress_postamble();
                    } finally {
                        utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_3, thread);
                        utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_2, thread);
                        utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_1, thread);
                        utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_0, thread);
                    }
                }
                return nreverse(result);
            }
        }
    }

    public static final SubLObject kb_hl_supports_with_missing_backpointers() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result = NIL;
                SubLObject idx = do_kb_hl_supports_table();
                SubLObject total = id_index.id_index_count(idx);
                SubLObject sofar = ZERO_INTEGER;
                SubLTrampolineFile.checkType($str_alt88$Searching_for_KB_HL_supports_with, STRINGP);
                {
                    SubLObject _prev_bind_0 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
                    SubLObject _prev_bind_1 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
                    SubLObject _prev_bind_2 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
                    SubLObject _prev_bind_3 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
                    try {
                        utilities_macros.$last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                        utilities_macros.$last_percent_progress_prediction$.bind(NIL, thread);
                        utilities_macros.$within_noting_percent_progress$.bind(T, thread);
                        utilities_macros.$percent_progress_start_time$.bind(get_universal_time(), thread);
                        utilities_macros.noting_percent_progress_preamble($str_alt88$Searching_for_KB_HL_supports_with);
                        if (NIL == id_index.do_id_index_empty_p(idx, $SKIP)) {
                            {
                                SubLObject id = id_index.do_id_index_next_id(idx, T, NIL, NIL);
                                SubLObject state_var = id_index.do_id_index_next_state(idx, T, id, NIL);
                                SubLObject kb_hl_support = NIL;
                                while (NIL != id) {
                                    kb_hl_support = id_index.do_id_index_state_object(idx, $SKIP, id, state_var);
                                    if (NIL != id_index.do_id_index_id_and_object_validP(id, kb_hl_support, $SKIP)) {
                                        utilities_macros.note_percent_progress(sofar, total);
                                        sofar = add(sofar, ONE_INTEGER);
                                        if (NIL != kb_hl_support_has_missing_backpointerP(kb_hl_support)) {
                                            result = cons(kb_hl_support, result);
                                        }
                                    }
                                    id = id_index.do_id_index_next_id(idx, T, id, state_var);
                                    state_var = id_index.do_id_index_next_state(idx, T, id, state_var);
                                } 
                            }
                        }
                        utilities_macros.noting_percent_progress_postamble();
                    } finally {
                        utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_3, thread);
                        utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_2, thread);
                        utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_1, thread);
                        utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_0, thread);
                    }
                }
                return nreverse(result);
            }
        }
    }

    public static final SubLObject verify_kb_hl_supports(SubLObject stream, SubLObject verboseP) {
        if (stream == UNPROVIDED) {
            stream = StreamsLow.$standard_output$.getDynamicValue();
        }
        if (verboseP == UNPROVIDED) {
            verboseP = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_hl_supports = dictionary.new_dictionary(symbol_function(EQUAL), UNPROVIDED);
                SubLObject indexing_failures = NIL;
                SubLObject circular_kb_hl_supports = NIL;
                SubLObject duplicate_kb_hl_supports = NIL;
                SubLObject kb_hl_supports_with_invalid_dependents = NIL;
                SubLObject kb_hl_supports_with_invalid_arguments = NIL;
                SubLObject kb_hl_supports_with_invalid_hl_supports = NIL;
                SubLObject kb_hl_supports_with_missing_backpointers = NIL;
                SubLObject error_message = NIL;
                try {
                    {
                        SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
                        try {
                            Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                            try {
                                {
                                    SubLObject idx = do_kb_hl_supports_table();
                                    SubLObject total = id_index.id_index_count(idx);
                                    SubLObject sofar = ZERO_INTEGER;
                                    SubLTrampolineFile.checkType($$$Verifying_KB_HL_supports, STRINGP);
                                    {
                                        SubLObject _prev_bind_0_19 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
                                        SubLObject _prev_bind_1 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
                                        SubLObject _prev_bind_2 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
                                        SubLObject _prev_bind_3 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
                                        try {
                                            utilities_macros.$last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                                            utilities_macros.$last_percent_progress_prediction$.bind(NIL, thread);
                                            utilities_macros.$within_noting_percent_progress$.bind(T, thread);
                                            utilities_macros.$percent_progress_start_time$.bind(get_universal_time(), thread);
                                            utilities_macros.noting_percent_progress_preamble($$$Verifying_KB_HL_supports);
                                            if (NIL == id_index.do_id_index_empty_p(idx, $SKIP)) {
                                                {
                                                    SubLObject id = id_index.do_id_index_next_id(idx, T, NIL, NIL);
                                                    SubLObject state_var = id_index.do_id_index_next_state(idx, T, id, NIL);
                                                    SubLObject kb_hl_support = NIL;
                                                    while (NIL != id) {
                                                        kb_hl_support = id_index.do_id_index_state_object(idx, $SKIP, id, state_var);
                                                        if (NIL != id_index.do_id_index_id_and_object_validP(id, kb_hl_support, $SKIP)) {
                                                            utilities_macros.note_percent_progress(sofar, total);
                                                            sofar = add(sofar, ONE_INTEGER);
                                                            {
                                                                SubLObject hl_support = kb_hl_support_hl_support(kb_hl_support);
                                                                dictionary_utilities.dictionary_push(v_hl_supports, hl_support, kb_hl_support);
                                                            }
                                                            if (NIL != kb_hl_support_not_findable_by_hl_supportP(kb_hl_support)) {
                                                                indexing_failures = cons(kb_hl_support, indexing_failures);
                                                            }
                                                            if (NIL != kb_hl_support_circularP(kb_hl_support)) {
                                                                circular_kb_hl_supports = cons(kb_hl_support, circular_kb_hl_supports);
                                                            }
                                                            if (NIL != kb_hl_support_has_invalid_dependentP(kb_hl_support, UNPROVIDED)) {
                                                                kb_hl_supports_with_invalid_dependents = cons(kb_hl_support, kb_hl_supports_with_invalid_dependents);
                                                            }
                                                            if (NIL != kb_hl_support_has_invalid_argumentP(kb_hl_support, UNPROVIDED)) {
                                                                kb_hl_supports_with_invalid_arguments = cons(kb_hl_support, kb_hl_supports_with_invalid_arguments);
                                                            }
                                                            if (NIL != kb_hl_support_has_invalid_hl_supportP(kb_hl_support)) {
                                                                kb_hl_supports_with_invalid_hl_supports = cons(kb_hl_support, kb_hl_supports_with_invalid_hl_supports);
                                                            }
                                                            if (NIL != kb_hl_support_has_missing_backpointerP(kb_hl_support)) {
                                                                kb_hl_supports_with_missing_backpointers = cons(kb_hl_support, kb_hl_supports_with_missing_backpointers);
                                                            }
                                                        }
                                                        id = id_index.do_id_index_next_id(idx, T, id, state_var);
                                                        state_var = id_index.do_id_index_next_state(idx, T, id, state_var);
                                                    } 
                                                }
                                            }
                                            utilities_macros.noting_percent_progress_postamble();
                                        } finally {
                                            utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_3, thread);
                                            utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_2, thread);
                                            utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_1, thread);
                                            utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_0_19, thread);
                                        }
                                    }
                                }
                                {
                                    SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(v_hl_supports));
                                    while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)) {
                                        thread.resetMultipleValues();
                                        {
                                            SubLObject hl_support = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                            SubLObject v_kb_hl_supports = thread.secondMultipleValue();
                                            thread.resetMultipleValues();
                                            if (NIL != list_utilities.lengthG(v_kb_hl_supports, ONE_INTEGER, UNPROVIDED)) {
                                                duplicate_kb_hl_supports = nconc(duplicate_kb_hl_supports, v_kb_hl_supports);
                                            }
                                            iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state);
                                        }
                                    } 
                                    dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                }
                                indexing_failures = nreverse(indexing_failures);
                                circular_kb_hl_supports = nreverse(circular_kb_hl_supports);
                                duplicate_kb_hl_supports = Sort.sort(duplicate_kb_hl_supports, symbol_function($sym83$_), KB_HL_SUPPORT_ID);
                                kb_hl_supports_with_invalid_dependents = nreverse(kb_hl_supports_with_invalid_dependents);
                                kb_hl_supports_with_invalid_arguments = nreverse(kb_hl_supports_with_invalid_arguments);
                                kb_hl_supports_with_invalid_hl_supports = nreverse(kb_hl_supports_with_invalid_hl_supports);
                                kb_hl_supports_with_missing_backpointers = nreverse(kb_hl_supports_with_missing_backpointers);
                            } catch (Throwable catch_var) {
                                Errors.handleThrowable(catch_var, NIL);
                            }
                        } finally {
                            Errors.$error_handler$.rebind(_prev_bind_0, thread);
                        }
                    }
                } catch (Throwable ccatch_env_var) {
                    error_message = Errors.handleThrowable(ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
                }
                if (NIL != stream) {
                    if (NIL != error_message) {
                        format(stream, $str_alt91$__Error_during_KB_HL_support_veri, error_message);
                    }
                    if (NIL != indexing_failures) {
                        report_kb_hl_support_indexing_failures(stream, indexing_failures, verboseP);
                    }
                    if (NIL != circular_kb_hl_supports) {
                        report_circular_kb_hl_supports(stream, circular_kb_hl_supports, verboseP);
                    }
                    if (NIL != duplicate_kb_hl_supports) {
                        report_duplicate_kb_hl_supports(stream, duplicate_kb_hl_supports, verboseP);
                    }
                    if (NIL != kb_hl_supports_with_invalid_dependents) {
                        report_kb_hl_supports_with_invalid_dependents(stream, kb_hl_supports_with_invalid_dependents, verboseP);
                    }
                    if (NIL != kb_hl_supports_with_invalid_arguments) {
                        report_kb_hl_supports_with_invalid_arguments(stream, kb_hl_supports_with_invalid_arguments, verboseP);
                    }
                    if (NIL != kb_hl_supports_with_invalid_hl_supports) {
                        report_kb_hl_supports_with_invalid_hl_supports(stream, kb_hl_supports_with_invalid_hl_supports, verboseP);
                    }
                    if (NIL != kb_hl_supports_with_missing_backpointers) {
                        report_kb_hl_supports_with_missing_backpointers(stream, kb_hl_supports_with_missing_backpointers, verboseP);
                    }
                }
                return makeBoolean(!((((((((NIL != indexing_failures) || (NIL != circular_kb_hl_supports)) || (NIL != duplicate_kb_hl_supports)) || (NIL != kb_hl_supports_with_invalid_dependents)) || (NIL != kb_hl_supports_with_invalid_arguments)) || (NIL != kb_hl_supports_with_invalid_hl_supports)) || (NIL != kb_hl_supports_with_missing_backpointers)) || (NIL != error_message)));
            }
        }
    }

    public static final SubLObject verify_kb_hl_support_indexing(SubLObject stream) {
        if (stream == UNPROVIDED) {
            stream = StreamsLow.$standard_output$.getDynamicValue();
        }
        {
            SubLObject failures = NIL;
            SubLObject error_message = NIL;
            try {
                {
                    SubLObject _prev_bind_0 = currentBinding(Errors.$error_handler$);
                    try {
                        bind(Errors.$error_handler$, CATCH_ERROR_MESSAGE_HANDLER);
                        try {
                            failures = kb_hl_supports_not_findable_by_hl_support();
                        } catch (Throwable catch_var) {
                            Errors.handleThrowable(catch_var, NIL);
                        }
                    } finally {
                        rebind(Errors.$error_handler$, _prev_bind_0);
                    }
                }
            } catch (Throwable ccatch_env_var) {
                error_message = Errors.handleThrowable(ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
            }
            if (NIL != stream) {
                if (NIL != error_message) {
                    format(stream, $str_alt92$__Error_during_indexing_verificat, error_message);
                }
                if (NIL != failures) {
                    report_kb_hl_support_indexing_failures(stream, failures, UNPROVIDED);
                }
            }
            return makeBoolean((NIL == failures) && (NIL == error_message));
        }
    }

    public static final SubLObject report_kb_hl_support_indexing_failures(SubLObject stream, SubLObject failures, SubLObject verboseP) {
        if (verboseP == UNPROVIDED) {
            verboseP = NIL;
        }
        if (NIL != verboseP) {
            format(stream, $str_alt93$__The_following_KB_HL_supports_we, length(failures));
            {
                SubLObject cdolist_list_var = failures;
                SubLObject failure = NIL;
                for (failure = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , failure = cdolist_list_var.first()) {
                    format(stream, $str_alt94$__s__s__, kb_hl_support_id(failure), failure);
                }
            }
        } else {
            format(stream, $str_alt95$___s_KB_HL_supports_are_not_finab, length(failures));
        }
        return NIL;
    }

    public static final SubLObject verify_kb_hl_supports_non_circular(SubLObject stream) {
        if (stream == UNPROVIDED) {
            stream = StreamsLow.$standard_output$.getDynamicValue();
        }
        {
            SubLObject failures = NIL;
            SubLObject error_message = NIL;
            try {
                {
                    SubLObject _prev_bind_0 = currentBinding(Errors.$error_handler$);
                    try {
                        bind(Errors.$error_handler$, CATCH_ERROR_MESSAGE_HANDLER);
                        try {
                            failures = circular_kb_hl_supports();
                        } catch (Throwable catch_var) {
                            Errors.handleThrowable(catch_var, NIL);
                        }
                    } finally {
                        rebind(Errors.$error_handler$, _prev_bind_0);
                    }
                }
            } catch (Throwable ccatch_env_var) {
                error_message = Errors.handleThrowable(ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
            }
            if (NIL != stream) {
                if (NIL != error_message) {
                    format(stream, $str_alt96$__Error_during_non_circularity_ve, error_message);
                }
                if (NIL != failures) {
                    report_circular_kb_hl_supports(stream, failures, UNPROVIDED);
                }
            }
            return makeBoolean((NIL == failures) && (NIL == error_message));
        }
    }

    public static final SubLObject report_circular_kb_hl_supports(SubLObject stream, SubLObject circular_kb_hl_supports, SubLObject verboseP) {
        if (verboseP == UNPROVIDED) {
            verboseP = NIL;
        }
        if (NIL != verboseP) {
            format(stream, $str_alt97$__The_following_KB_HL_supports_ar, length(circular_kb_hl_supports));
            {
                SubLObject cdolist_list_var = circular_kb_hl_supports;
                SubLObject kb_hl_support = NIL;
                for (kb_hl_support = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , kb_hl_support = cdolist_list_var.first()) {
                    format(stream, $str_alt94$__s__s__, kb_hl_support_id(kb_hl_support), kb_hl_support);
                }
            }
        } else {
            format(stream, $str_alt98$___s_KB_HL_supports_are_circular_, length(circular_kb_hl_supports));
        }
        return NIL;
    }

    public static final SubLObject verify_kb_hl_support_uniqueness(SubLObject stream) {
        if (stream == UNPROVIDED) {
            stream = StreamsLow.$standard_output$.getDynamicValue();
        }
        {
            SubLObject failures = NIL;
            SubLObject error_message = NIL;
            try {
                {
                    SubLObject _prev_bind_0 = currentBinding(Errors.$error_handler$);
                    try {
                        bind(Errors.$error_handler$, CATCH_ERROR_MESSAGE_HANDLER);
                        try {
                            failures = duplicate_kb_hl_supports();
                        } catch (Throwable catch_var) {
                            Errors.handleThrowable(catch_var, NIL);
                        }
                    } finally {
                        rebind(Errors.$error_handler$, _prev_bind_0);
                    }
                }
            } catch (Throwable ccatch_env_var) {
                error_message = Errors.handleThrowable(ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
            }
            if (NIL != stream) {
                if (NIL != error_message) {
                    format(stream, $str_alt99$__Error_during_uniqueness_verific, error_message);
                }
                if (NIL != failures) {
                    report_duplicate_kb_hl_supports(stream, failures, UNPROVIDED);
                }
            }
            return makeBoolean((NIL == failures) && (NIL == error_message));
        }
    }

    public static final SubLObject report_duplicate_kb_hl_supports(SubLObject stream, SubLObject v_kb_hl_supports, SubLObject verboseP) {
        if (verboseP == UNPROVIDED) {
            verboseP = NIL;
        }
        if (NIL != verboseP) {
            format(stream, $str_alt100$__The_following_KB_HL_supports_ha, length(v_kb_hl_supports));
            {
                SubLObject cdolist_list_var = v_kb_hl_supports;
                SubLObject kb_hl_support = NIL;
                for (kb_hl_support = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , kb_hl_support = cdolist_list_var.first()) {
                    format(stream, $str_alt94$__s__s__, kb_hl_support_id(kb_hl_support), kb_hl_support);
                }
            }
        } else {
            format(stream, $str_alt101$___s_KB_HL_supports_have_duplicat, length(v_kb_hl_supports));
        }
        return NIL;
    }

    public static final SubLObject verify_kb_hl_support_dependents(SubLObject stream) {
        if (stream == UNPROVIDED) {
            stream = StreamsLow.$standard_output$.getDynamicValue();
        }
        {
            SubLObject failures = NIL;
            SubLObject error_message = NIL;
            try {
                {
                    SubLObject _prev_bind_0 = currentBinding(Errors.$error_handler$);
                    try {
                        bind(Errors.$error_handler$, CATCH_ERROR_MESSAGE_HANDLER);
                        try {
                            failures = kb_hl_supports_with_invalid_dependents(UNPROVIDED);
                        } catch (Throwable catch_var) {
                            Errors.handleThrowable(catch_var, NIL);
                        }
                    } finally {
                        rebind(Errors.$error_handler$, _prev_bind_0);
                    }
                }
            } catch (Throwable ccatch_env_var) {
                error_message = Errors.handleThrowable(ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
            }
            if (NIL != stream) {
                if (NIL != error_message) {
                    format(stream, $str_alt102$__Error_during_dependent_verifica, error_message);
                }
                if (NIL != failures) {
                    report_kb_hl_supports_with_invalid_dependents(stream, failures, UNPROVIDED);
                }
            }
            return makeBoolean((NIL == failures) && (NIL == error_message));
        }
    }

    public static final SubLObject report_kb_hl_supports_with_invalid_dependents(SubLObject stream, SubLObject v_kb_hl_supports, SubLObject verboseP) {
        if (verboseP == UNPROVIDED) {
            verboseP = NIL;
        }
        if (NIL != verboseP) {
            format(stream, $str_alt103$__The_following_KB_HL_supports_ha, length(v_kb_hl_supports));
            {
                SubLObject cdolist_list_var = v_kb_hl_supports;
                SubLObject kb_hl_support = NIL;
                for (kb_hl_support = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , kb_hl_support = cdolist_list_var.first()) {
                    format(stream, $str_alt94$__s__s__, kb_hl_support_id(kb_hl_support), kb_hl_support);
                }
            }
        } else {
            format(stream, $str_alt104$___s_KB_HL_supports_have_invalid_, length(v_kb_hl_supports));
        }
        return NIL;
    }

    public static final SubLObject verify_kb_hl_support_arguments(SubLObject stream) {
        if (stream == UNPROVIDED) {
            stream = StreamsLow.$standard_output$.getDynamicValue();
        }
        {
            SubLObject failures = NIL;
            SubLObject error_message = NIL;
            try {
                {
                    SubLObject _prev_bind_0 = currentBinding(Errors.$error_handler$);
                    try {
                        bind(Errors.$error_handler$, CATCH_ERROR_MESSAGE_HANDLER);
                        try {
                            failures = kb_hl_supports_with_invalid_arguments(UNPROVIDED);
                        } catch (Throwable catch_var) {
                            Errors.handleThrowable(catch_var, NIL);
                        }
                    } finally {
                        rebind(Errors.$error_handler$, _prev_bind_0);
                    }
                }
            } catch (Throwable ccatch_env_var) {
                error_message = Errors.handleThrowable(ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
            }
            if (NIL != stream) {
                if (NIL != error_message) {
                    format(stream, $str_alt105$__Error_during_argument_verificat, error_message);
                }
                if (NIL != failures) {
                    report_kb_hl_supports_with_invalid_arguments(stream, failures, UNPROVIDED);
                }
            }
            return makeBoolean((NIL == failures) && (NIL == error_message));
        }
    }

    public static final SubLObject report_kb_hl_supports_with_invalid_arguments(SubLObject stream, SubLObject v_kb_hl_supports, SubLObject verboseP) {
        if (verboseP == UNPROVIDED) {
            verboseP = NIL;
        }
        if (NIL != verboseP) {
            format(stream, $str_alt106$__The_following_KB_HL_supports_ha, length(v_kb_hl_supports));
            {
                SubLObject cdolist_list_var = v_kb_hl_supports;
                SubLObject kb_hl_support = NIL;
                for (kb_hl_support = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , kb_hl_support = cdolist_list_var.first()) {
                    format(stream, $str_alt94$__s__s__, kb_hl_support_id(kb_hl_support), kb_hl_support);
                }
            }
        } else {
            format(stream, $str_alt107$___s_KB_HL_supports_have_invalid_, length(v_kb_hl_supports));
        }
        return NIL;
    }

    public static final SubLObject verify_kb_hl_support_hl_supports(SubLObject stream) {
        if (stream == UNPROVIDED) {
            stream = StreamsLow.$standard_output$.getDynamicValue();
        }
        {
            SubLObject failures = NIL;
            SubLObject error_message = NIL;
            try {
                {
                    SubLObject _prev_bind_0 = currentBinding(Errors.$error_handler$);
                    try {
                        bind(Errors.$error_handler$, CATCH_ERROR_MESSAGE_HANDLER);
                        try {
                            failures = kb_hl_supports_with_invalid_hl_supports();
                        } catch (Throwable catch_var) {
                            Errors.handleThrowable(catch_var, NIL);
                        }
                    } finally {
                        rebind(Errors.$error_handler$, _prev_bind_0);
                    }
                }
            } catch (Throwable ccatch_env_var) {
                error_message = Errors.handleThrowable(ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
            }
            if (NIL != stream) {
                if (NIL != error_message) {
                    format(stream, $str_alt108$__Error_during_HL_support_verific, error_message);
                }
                if (NIL != failures) {
                    report_kb_hl_supports_with_invalid_hl_supports(stream, failures, UNPROVIDED);
                }
            }
            return makeBoolean((NIL == failures) && (NIL == error_message));
        }
    }

    public static final SubLObject report_kb_hl_supports_with_invalid_hl_supports(SubLObject stream, SubLObject v_kb_hl_supports, SubLObject verboseP) {
        if (verboseP == UNPROVIDED) {
            verboseP = NIL;
        }
        if (NIL != verboseP) {
            format(stream, $str_alt109$__The_following_KB_HL_supports_ha, length(v_kb_hl_supports));
            {
                SubLObject cdolist_list_var = v_kb_hl_supports;
                SubLObject kb_hl_support = NIL;
                for (kb_hl_support = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , kb_hl_support = cdolist_list_var.first()) {
                    format(stream, $str_alt94$__s__s__, kb_hl_support_id(kb_hl_support), kb_hl_support);
                }
            }
        } else {
            format(stream, $str_alt110$___s_KB_HL_supports_have_invalid_, length(v_kb_hl_supports));
        }
        return NIL;
    }

    public static final SubLObject verify_kb_hl_support_backpointers(SubLObject stream) {
        if (stream == UNPROVIDED) {
            stream = StreamsLow.$standard_output$.getDynamicValue();
        }
        {
            SubLObject failures = NIL;
            SubLObject error_message = NIL;
            try {
                {
                    SubLObject _prev_bind_0 = currentBinding(Errors.$error_handler$);
                    try {
                        bind(Errors.$error_handler$, CATCH_ERROR_MESSAGE_HANDLER);
                        try {
                            failures = kb_hl_supports_with_missing_backpointers();
                        } catch (Throwable catch_var) {
                            Errors.handleThrowable(catch_var, NIL);
                        }
                    } finally {
                        rebind(Errors.$error_handler$, _prev_bind_0);
                    }
                }
            } catch (Throwable ccatch_env_var) {
                error_message = Errors.handleThrowable(ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
            }
            if (NIL != stream) {
                if (NIL != error_message) {
                    format(stream, $str_alt111$__Error_during_KB_HL_support_back, error_message);
                }
                if (NIL != failures) {
                    report_kb_hl_supports_with_missing_backpointers(stream, failures, UNPROVIDED);
                }
            }
            return makeBoolean((NIL == failures) && (NIL == error_message));
        }
    }

    public static final SubLObject report_kb_hl_supports_with_missing_backpointers(SubLObject stream, SubLObject v_kb_hl_supports, SubLObject verboseP) {
        if (verboseP == UNPROVIDED) {
            verboseP = NIL;
        }
        if (NIL != verboseP) {
            format(stream, $str_alt112$__The_following_KB_HL_supports_ha, length(v_kb_hl_supports));
            {
                SubLObject cdolist_list_var = v_kb_hl_supports;
                SubLObject kb_hl_support = NIL;
                for (kb_hl_support = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , kb_hl_support = cdolist_list_var.first()) {
                    format(stream, $str_alt94$__s__s__, kb_hl_support_id(kb_hl_support), kb_hl_support);
                }
            }
        } else {
            format(stream, $str_alt113$___s_KB_HL_supports_have_missing_, length(v_kb_hl_supports));
        }
        return NIL;
    }

    /**
     * Remove all duplicate KB HL supports.  Supports with lower ids will be kept
     * in favor of those with higher ids.
     */
    public static final SubLObject destroy_duplicate_kb_hl_supports() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_hl_supports = dictionary.new_dictionary(symbol_function(EQUAL), UNPROVIDED);
                SubLObject destroyed_count = ZERO_INTEGER;
                SubLObject idx = do_kb_hl_supports_table();
                SubLObject total = id_index.id_index_count(idx);
                SubLObject sofar = ZERO_INTEGER;
                SubLTrampolineFile.checkType($str_alt114$Eliminating_duplicate_KB_HL_suppo, STRINGP);
                {
                    SubLObject _prev_bind_0 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
                    SubLObject _prev_bind_1 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
                    SubLObject _prev_bind_2 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
                    SubLObject _prev_bind_3 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
                    try {
                        utilities_macros.$last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                        utilities_macros.$last_percent_progress_prediction$.bind(NIL, thread);
                        utilities_macros.$within_noting_percent_progress$.bind(T, thread);
                        utilities_macros.$percent_progress_start_time$.bind(get_universal_time(), thread);
                        utilities_macros.noting_percent_progress_preamble($str_alt114$Eliminating_duplicate_KB_HL_suppo);
                        if (NIL == id_index.do_id_index_empty_p(idx, $SKIP)) {
                            {
                                SubLObject id = id_index.do_id_index_next_id(idx, T, NIL, NIL);
                                SubLObject state_var = id_index.do_id_index_next_state(idx, T, id, NIL);
                                SubLObject kb_hl_support = NIL;
                                while (NIL != id) {
                                    kb_hl_support = id_index.do_id_index_state_object(idx, $SKIP, id, state_var);
                                    if (NIL != id_index.do_id_index_id_and_object_validP(id, kb_hl_support, $SKIP)) {
                                        utilities_macros.note_percent_progress(sofar, total);
                                        sofar = add(sofar, ONE_INTEGER);
                                        {
                                            SubLObject hl_support = kb_hl_support_hl_support(kb_hl_support);
                                            SubLObject preferred_kb_hl_support = dictionary.dictionary_lookup_without_values(v_hl_supports, hl_support, UNPROVIDED);
                                            if (NIL != preferred_kb_hl_support) {
                                                destroy_duplicate_kb_hl_support(preferred_kb_hl_support, kb_hl_support);
                                                destroyed_count = add(destroyed_count, ONE_INTEGER);
                                            } else {
                                                dictionary.dictionary_enter(v_hl_supports, hl_support, kb_hl_support);
                                            }
                                        }
                                    }
                                    id = id_index.do_id_index_next_id(idx, T, id, state_var);
                                    state_var = id_index.do_id_index_next_state(idx, T, id, state_var);
                                } 
                            }
                        }
                        utilities_macros.noting_percent_progress_postamble();
                    } finally {
                        utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_3, thread);
                        utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_2, thread);
                        utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_1, thread);
                        utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_0, thread);
                    }
                }
                return destroyed_count;
            }
        }
    }

    public static final SubLObject destroy_duplicate_kb_hl_support(SubLObject preferred_kb_hl_support, SubLObject duplicate_kb_hl_support) {
        {
            SubLObject dependents = kb_hl_support_dependents(duplicate_kb_hl_support);
            SubLObject cdolist_list_var = dependents;
            SubLObject dependent = NIL;
            for (dependent = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , dependent = cdolist_list_var.first()) {
                kb_hl_support_remove_dependent(duplicate_kb_hl_support, dependent);
                {
                    SubLObject old_supports = deductions_high.deduction_supports(dependent);
                    SubLObject new_supports = nsubstitute(preferred_kb_hl_support, duplicate_kb_hl_support, old_supports, symbol_function(EQ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    deductions_low.reset_deduction_supports(dependent, new_supports);
                }
                kb_hl_support_add_dependent(preferred_kb_hl_support, dependent);
            }
            destroy_kb_hl_support(duplicate_kb_hl_support);
        }
        return preferred_kb_hl_support;
    }

    /**
     * Remove all invalid dependents for all KB HL supports.
     */
    public static final SubLObject eliminate_kb_hl_supports_invalid_dependents(SubLObject robustP) {
        if (robustP == UNPROVIDED) {
            robustP = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject removed_countP = ZERO_INTEGER;
                SubLObject idx = do_kb_hl_supports_table();
                SubLObject total = id_index.id_index_count(idx);
                SubLObject sofar = ZERO_INTEGER;
                SubLTrampolineFile.checkType($str_alt115$Eliminating_invalid_KB_HL_support, STRINGP);
                {
                    SubLObject _prev_bind_0 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
                    SubLObject _prev_bind_1 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
                    SubLObject _prev_bind_2 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
                    SubLObject _prev_bind_3 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
                    try {
                        utilities_macros.$last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                        utilities_macros.$last_percent_progress_prediction$.bind(NIL, thread);
                        utilities_macros.$within_noting_percent_progress$.bind(T, thread);
                        utilities_macros.$percent_progress_start_time$.bind(get_universal_time(), thread);
                        utilities_macros.noting_percent_progress_preamble($str_alt115$Eliminating_invalid_KB_HL_support);
                        if (NIL == id_index.do_id_index_empty_p(idx, $SKIP)) {
                            {
                                SubLObject id = id_index.do_id_index_next_id(idx, T, NIL, NIL);
                                SubLObject state_var = id_index.do_id_index_next_state(idx, T, id, NIL);
                                SubLObject kb_hl_support = NIL;
                                while (NIL != id) {
                                    kb_hl_support = id_index.do_id_index_state_object(idx, $SKIP, id, state_var);
                                    if (NIL != id_index.do_id_index_id_and_object_validP(id, kb_hl_support, $SKIP)) {
                                        utilities_macros.note_percent_progress(sofar, total);
                                        sofar = add(sofar, ONE_INTEGER);
                                        removed_countP = add(removed_countP, eliminate_kb_hl_support_invalid_dependents(kb_hl_support, robustP));
                                    }
                                    id = id_index.do_id_index_next_id(idx, T, id, state_var);
                                    state_var = id_index.do_id_index_next_state(idx, T, id, state_var);
                                } 
                            }
                        }
                        utilities_macros.noting_percent_progress_postamble();
                    } finally {
                        utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_3, thread);
                        utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_2, thread);
                        utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_1, thread);
                        utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_0, thread);
                    }
                }
                return removed_countP;
            }
        }
    }

    /**
     * Remove all invalid dependents for KB-HL-SUPPORT.  Return the number of invalid dependents removed.
     */
    public static final SubLObject eliminate_kb_hl_support_invalid_dependents(SubLObject kb_hl_support, SubLObject robustP) {
        if (robustP == UNPROVIDED) {
            robustP = NIL;
        }
        {
            SubLObject dependents = kb_hl_support_dependents(kb_hl_support);
            SubLObject count = list_utilities.count_if_not($sym116$VALID_DEDUCTION_, dependents, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            if (count.numG(ZERO_INTEGER)) {
                {
                    SubLObject content = kb_hl_support_content(kb_hl_support);
                    SubLObject new_dependents = set_contents.new_set_contents(UNPROVIDED, UNPROVIDED);
                    SubLObject cdolist_list_var = dependents;
                    SubLObject dependent = NIL;
                    for (dependent = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , dependent = cdolist_list_var.first()) {
                        if (NIL != deduction_handles.valid_deductionP(dependent, robustP)) {
                            new_dependents = set_contents.set_contents_add(dependent, new_dependents, symbol_function(EQ));
                        }
                    }
                    kb_hl_support_content_set_dependents(content, new_dependents);
                    kb_hl_support_manager.mark_kb_hl_support_content_as_muted(kb_hl_support_id(kb_hl_support));
                }
            }
            return count;
        }
    }

    public static final SubLObject destroy_kb_hl_supports_with_invalid_hl_supports() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject destroyed_count = ZERO_INTEGER;
                SubLObject idx = do_kb_hl_supports_table();
                SubLObject total = id_index.id_index_count(idx);
                SubLObject sofar = ZERO_INTEGER;
                SubLTrampolineFile.checkType($str_alt117$Eliminating_KB_HL_supports_with_i, STRINGP);
                {
                    SubLObject _prev_bind_0 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
                    SubLObject _prev_bind_1 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
                    SubLObject _prev_bind_2 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
                    SubLObject _prev_bind_3 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
                    try {
                        utilities_macros.$last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                        utilities_macros.$last_percent_progress_prediction$.bind(NIL, thread);
                        utilities_macros.$within_noting_percent_progress$.bind(T, thread);
                        utilities_macros.$percent_progress_start_time$.bind(get_universal_time(), thread);
                        utilities_macros.noting_percent_progress_preamble($str_alt117$Eliminating_KB_HL_supports_with_i);
                        if (NIL == id_index.do_id_index_empty_p(idx, $SKIP)) {
                            {
                                SubLObject id = id_index.do_id_index_next_id(idx, T, NIL, NIL);
                                SubLObject state_var = id_index.do_id_index_next_state(idx, T, id, NIL);
                                SubLObject kb_hl_support = NIL;
                                while (NIL != id) {
                                    kb_hl_support = id_index.do_id_index_state_object(idx, $SKIP, id, state_var);
                                    if (NIL != id_index.do_id_index_id_and_object_validP(id, kb_hl_support, $SKIP)) {
                                        utilities_macros.note_percent_progress(sofar, total);
                                        sofar = add(sofar, ONE_INTEGER);
                                        {
                                            SubLObject hl_support = kb_hl_support_hl_support(kb_hl_support);
                                            if (NIL == arguments.valid_hl_supportP(hl_support)) {
                                                destroy_kb_hl_support(kb_hl_support);
                                                destroyed_count = add(destroyed_count, ONE_INTEGER);
                                            }
                                        }
                                    }
                                    id = id_index.do_id_index_next_id(idx, T, id, state_var);
                                    state_var = id_index.do_id_index_next_state(idx, T, id, state_var);
                                } 
                            }
                        }
                        utilities_macros.noting_percent_progress_postamble();
                    } finally {
                        utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_3, thread);
                        utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_2, thread);
                        utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_1, thread);
                        utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_0, thread);
                    }
                }
                return destroyed_count;
            }
        }
    }

    public static final SubLObject bootstrap_kb_hl_supports(SubLObject reconsider_deductionsP) {
        if (reconsider_deductionsP == UNPROVIDED) {
            reconsider_deductionsP = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject size = ceiling(deduction_handles.deduction_count(), kb_utilities.estimated_deductions_per_hl_support());
                setup_kb_hl_support_tables(size, NIL);
                {
                    SubLObject _prev_bind_0 = control_vars.$save_asked_queriesP$.currentBinding(thread);
                    try {
                        control_vars.$save_asked_queriesP$.bind(NIL, thread);
                        {
                            SubLObject state = memoization_state.possibly_new_memoization_state();
                            SubLObject local_state = state;
                            {
                                SubLObject _prev_bind_0_20 = memoization_state.$memoization_state$.currentBinding(thread);
                                try {
                                    memoization_state.$memoization_state$.bind(local_state, thread);
                                    {
                                        SubLObject original_memoization_process = NIL;
                                        if ((NIL != local_state) && (NIL == memoization_state.memoization_state_lock(local_state))) {
                                            original_memoization_process = memoization_state.memoization_state_get_current_process_internal(local_state);
                                            {
                                                SubLObject current_proc = current_process();
                                                if (NIL == original_memoization_process) {
                                                    memoization_state.memoization_state_set_current_process_internal(local_state, current_proc);
                                                } else {
                                                    if (original_memoization_process != current_proc) {
                                                        Errors.error($str_alt118$Invalid_attempt_to_reuse_memoizat);
                                                    }
                                                }
                                            }
                                        }
                                        try {
                                            {
                                                SubLObject already_resourcing_p = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.getDynamicValue(thread);
                                                {
                                                    SubLObject _prev_bind_0_21 = sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.currentBinding(thread);
                                                    SubLObject _prev_bind_1 = sbhl_marking_vars.$resourced_sbhl_marking_spaces$.currentBinding(thread);
                                                    SubLObject _prev_bind_2 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding(thread);
                                                    try {
                                                        sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.bind(sbhl_marking_vars.determine_resource_limit(already_resourcing_p, SIX_INTEGER), thread);
                                                        sbhl_marking_vars.$resourced_sbhl_marking_spaces$.bind(sbhl_marking_vars.possibly_new_marking_resource(already_resourcing_p), thread);
                                                        sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind(T, thread);
                                                        utilities_macros.$progress_note$.setDynamicValue($$$Bootstrapping_KB_HL_supports, thread);
                                                        utilities_macros.$progress_start_time$.setDynamicValue(get_universal_time(), thread);
                                                        utilities_macros.$progress_total$.setDynamicValue(deduction_handles.deduction_count(), thread);
                                                        utilities_macros.$progress_sofar$.setDynamicValue(ZERO_INTEGER, thread);
                                                        {
                                                            SubLObject _prev_bind_0_22 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
                                                            SubLObject _prev_bind_1_23 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
                                                            SubLObject _prev_bind_2_24 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
                                                            SubLObject _prev_bind_3 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
                                                            try {
                                                                utilities_macros.$last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                                                                utilities_macros.$last_percent_progress_prediction$.bind(NIL, thread);
                                                                utilities_macros.$within_noting_percent_progress$.bind(T, thread);
                                                                utilities_macros.$percent_progress_start_time$.bind(get_universal_time(), thread);
                                                                utilities_macros.noting_percent_progress_preamble(utilities_macros.$progress_note$.getDynamicValue(thread));
                                                                {
                                                                    SubLObject id = NIL;
                                                                    for (id = ZERO_INTEGER; id.numL(utilities_macros.$progress_total$.getDynamicValue(thread)); id = add(id, ONE_INTEGER)) {
                                                                        utilities_macros.note_percent_progress(utilities_macros.$progress_sofar$.getDynamicValue(thread), utilities_macros.$progress_total$.getDynamicValue(thread));
                                                                        utilities_macros.$progress_sofar$.setDynamicValue(add(utilities_macros.$progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                                                                        {
                                                                            SubLObject deduction = deduction_handles.find_deduction_by_id(id);
                                                                            if (NIL != deduction_handles.deduction_p(deduction)) {
                                                                                if (!((NIL != reconsider_deductionsP) && (NIL != tms.tms_reconsider_deduction(deduction)))) {
                                                                                    bootstrap_kb_hl_supports_for_deduction(deduction);
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                                utilities_macros.noting_percent_progress_postamble();
                                                            } finally {
                                                                utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_3, thread);
                                                                utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_2_24, thread);
                                                                utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_1_23, thread);
                                                                utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_0_22, thread);
                                                            }
                                                        }
                                                    } finally {
                                                        sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind(_prev_bind_2, thread);
                                                        sbhl_marking_vars.$resourced_sbhl_marking_spaces$.rebind(_prev_bind_1, thread);
                                                        sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.rebind(_prev_bind_0_21, thread);
                                                    }
                                                }
                                            }
                                        } finally {
                                            {
                                                SubLObject _prev_bind_0_25 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                try {
                                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                                    if ((NIL != local_state) && (NIL == original_memoization_process)) {
                                                        memoization_state.memoization_state_set_current_process_internal(local_state, NIL);
                                                    }
                                                } finally {
                                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_25, thread);
                                                }
                                            }
                                        }
                                    }
                                } finally {
                                    memoization_state.$memoization_state$.rebind(_prev_bind_0_20, thread);
                                }
                            }
                        }
                    } finally {
                        control_vars.$save_asked_queriesP$.rebind(_prev_bind_0, thread);
                    }
                }
                finalize_kb_hl_supports(UNPROVIDED);
                return kb_hl_support_count();
            }
        }
    }

    public static final SubLObject bootstrap_kb_hl_supports_for_deduction(SubLObject deduction) {
        {
            SubLObject old_supports = deductions_high.deduction_supports(deduction);
            SubLObject new_supports = NIL;
            SubLObject cdolist_list_var = old_supports;
            SubLObject support = NIL;
            for (support = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , support = cdolist_list_var.first()) {
                {
                    SubLObject error_message = NIL;
                    SubLObject new_support = NIL;
                    try {
                        {
                            SubLObject _prev_bind_0 = currentBinding(Errors.$error_handler$);
                            try {
                                bind(Errors.$error_handler$, CATCH_ERROR_MESSAGE_HANDLER);
                                try {
                                    new_support = possibly_reify_hl_support(support);
                                } catch (Throwable catch_var) {
                                    Errors.handleThrowable(catch_var, NIL);
                                }
                            } finally {
                                rebind(Errors.$error_handler$, _prev_bind_0);
                            }
                        }
                    } catch (Throwable ccatch_env_var) {
                        error_message = Errors.handleThrowable(ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
                    }
                    if (NIL != error_message) {
                        Errors.warn($str_alt120$Could_not_create_KB_HL_support_fo, support, error_message);
                    } else
                        if (NIL != valid_kb_hl_supportP(new_support, UNPROVIDED)) {
                            kb_hl_support_add_dependent(new_support, deduction);
                        }

                    new_supports = cons(NIL != new_support ? ((SubLObject) (new_support)) : support, new_supports);
                }
            }
            deductions_low.reset_deduction_supports(deduction, nreverse(new_supports));
        }
        return NIL;
    }

    public static final SubLObject declare_kb_hl_supports_file() {
        declareFunction("find_kb_hl_support", "FIND-KB-HL-SUPPORT", 1, 0, false);
        declareFunction("find_kb_hl_support_by_id", "FIND-KB-HL-SUPPORT-BY-ID", 1, 0, false);
        declareFunction("find_kb_hl_supports_mentioning_term", "FIND-KB-HL-SUPPORTS-MENTIONING-TERM", 1, 0, false);
        declareFunction("kb_hl_support_count", "KB-HL-SUPPORT-COUNT", 0, 0, false);
        declareFunction("old_kb_hl_support_count", "OLD-KB-HL-SUPPORT-COUNT", 0, 0, false);
        declareFunction("new_kb_hl_support_count", "NEW-KB-HL-SUPPORT-COUNT", 0, 0, false);
        declareFunction("kb_hl_support_id", "KB-HL-SUPPORT-ID", 1, 0, false);
        declareFunction("kb_hl_support_arguments", "KB-HL-SUPPORT-ARGUMENTS", 1, 0, false);
        declareMacro("do_kb_hl_support_arguments", "DO-KB-HL-SUPPORT-ARGUMENTS");
        declareFunction("kb_hl_support_dependents", "KB-HL-SUPPORT-DEPENDENTS", 1, 0, false);
        declareMacro("do_kb_hl_support_dependents", "DO-KB-HL-SUPPORT-DEPENDENTS");
        declareFunction("do_kb_hl_support_dependents_helper", "DO-KB-HL-SUPPORT-DEPENDENTS-HELPER", 1, 0, false);
        declareFunction("kb_hl_support_justification", "KB-HL-SUPPORT-JUSTIFICATION", 1, 0, false);
        declareMacro("do_kb_hl_support_supports", "DO-KB-HL-SUPPORT-SUPPORTS");
        declareFunction("kb_hl_support_hl_support", "KB-HL-SUPPORT-HL-SUPPORT", 1, 0, false);
        declareFunction("kb_hl_support_module", "KB-HL-SUPPORT-MODULE", 1, 0, false);
        declareFunction("kb_hl_support_sentence", "KB-HL-SUPPORT-SENTENCE", 1, 0, false);
        declareFunction("kb_hl_support_mt", "KB-HL-SUPPORT-MT", 1, 0, false);
        declareFunction("kb_hl_support_tv", "KB-HL-SUPPORT-TV", 1, 0, false);
        declareFunction("kb_hl_support_el_sentence", "KB-HL-SUPPORT-EL-SENTENCE", 1, 0, false);
        declareFunction("kb_hl_support_ist_sentence", "KB-HL-SUPPORT-IST-SENTENCE", 1, 0, false);
        declareFunction("kb_hl_support_el_ist_sentence", "KB-HL-SUPPORT-EL-IST-SENTENCE", 1, 0, false);
        declareFunction("kb_hl_support_elmt", "KB-HL-SUPPORT-ELMT", 1, 0, false);
        declareFunction("kb_hl_support_cons", "KB-HL-SUPPORT-CONS", 1, 0, false);
        declareFunction("find_or_possibly_create_kb_hl_support", "FIND-OR-POSSIBLY-CREATE-KB-HL-SUPPORT", 1, 0, false);
        declareFunction("possibly_create_kb_hl_support", "POSSIBLY-CREATE-KB-HL-SUPPORT", 1, 0, false);
        declareFunction("kb_hl_support_print_function_trampoline", "KB-HL-SUPPORT-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction("kb_hl_support_p", "KB-HL-SUPPORT-P", 1, 0, false);
        new kb_hl_supports.$kb_hl_support_p$UnaryFunction();
        declareFunction("kb_hls_id", "KB-HLS-ID", 1, 0, false);
        declareFunction("_csetf_kb_hls_id", "_CSETF-KB-HLS-ID", 2, 0, false);
        declareFunction("make_kb_hl_support", "MAKE-KB-HL-SUPPORT", 0, 1, false);
        declareFunction("print_kb_hl_support", "PRINT-KB-HL-SUPPORT", 3, 0, false);
        declareFunction("sxhash_kb_hl_support_method", "SXHASH-KB-HL-SUPPORT-METHOD", 1, 0, false);
        new kb_hl_supports.$sxhash_kb_hl_support_method$UnaryFunction();
        declareFunction("new_kb_hl_support", "NEW-KB-HL-SUPPORT", 1, 0, false);
        declareFunction("free_kb_hl_support", "FREE-KB-HL-SUPPORT", 1, 0, false);
        declareFunction("kb_hl_support_get_id", "KB-HL-SUPPORT-GET-ID", 1, 0, false);
        declareFunction("kb_hl_support_content_print_function_trampoline", "KB-HL-SUPPORT-CONTENT-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction("kb_hl_support_content_p", "KB-HL-SUPPORT-CONTENT-P", 1, 0, false);
        new kb_hl_supports.$kb_hl_support_content_p$UnaryFunction();
        declareFunction("kb_hlsc_argument", "KB-HLSC-ARGUMENT", 1, 0, false);
        declareFunction("kb_hlsc_dependents", "KB-HLSC-DEPENDENTS", 1, 0, false);
        declareFunction("_csetf_kb_hlsc_argument", "_CSETF-KB-HLSC-ARGUMENT", 2, 0, false);
        declareFunction("_csetf_kb_hlsc_dependents", "_CSETF-KB-HLSC-DEPENDENTS", 2, 0, false);
        declareFunction("make_kb_hl_support_content", "MAKE-KB-HL-SUPPORT-CONTENT", 0, 1, false);
        declareFunction("new_kb_hl_support_content", "NEW-KB-HL-SUPPORT-CONTENT", 0, 0, false);
        declareFunction("free_kb_hl_support_content", "FREE-KB-HL-SUPPORT-CONTENT", 1, 0, false);
        declareFunction("kb_hl_support_content_get_argument", "KB-HL-SUPPORT-CONTENT-GET-ARGUMENT", 1, 0, false);
        declareFunction("kb_hl_support_content_get_dependents", "KB-HL-SUPPORT-CONTENT-GET-DEPENDENTS", 1, 0, false);
        declareFunction("kb_hl_support_content_set_argument", "KB-HL-SUPPORT-CONTENT-SET-ARGUMENT", 2, 0, false);
        declareFunction("kb_hl_support_content_set_dependents", "KB-HL-SUPPORT-CONTENT-SET-DEPENDENTS", 2, 0, false);
        declareFunction("make_kb_hl_support_shell", "MAKE-KB-HL-SUPPORT-SHELL", 1, 0, false);
        declareFunction("kb_hl_support_content", "KB-HL-SUPPORT-CONTENT", 1, 0, false);
        declareFunction("kb_hl_support_add_dependent", "KB-HL-SUPPORT-ADD-DEPENDENT", 2, 0, false);
        declareFunction("kb_hl_support_remove_dependent", "KB-HL-SUPPORT-REMOVE-DEPENDENT", 2, 0, false);
        declareFunction("kb_hl_support_clear_dependents", "KB-HL-SUPPORT-CLEAR-DEPENDENTS", 1, 0, false);
        declareFunction("kb_hl_support_remove_argument", "KB-HL-SUPPORT-REMOVE-ARGUMENT", 1, 0, false);
        declareFunction("kb_hl_support_reset_argument", "KB-HL-SUPPORT-RESET-ARGUMENT", 2, 0, false);
        declareFunction("kb_hl_support_reset_justification", "KB-HL-SUPPORT-RESET-JUSTIFICATION", 2, 0, false);
        declareFunction("rejustify_kb_hl_support", "REJUSTIFY-KB-HL-SUPPORT", 1, 0, false);
        declareFunction("remove_kb_hl_support", "REMOVE-KB-HL-SUPPORT", 1, 0, false);
        declareFunction("hl_justify_for_kb_hl_support", "HL-JUSTIFY-FOR-KB-HL-SUPPORT", 1, 0, false);
        declareFunction("valid_kb_hl_supportP", "VALID-KB-HL-SUPPORT?", 1, 1, false);
        declareFunction("valid_kb_hl_support_handleP", "VALID-KB-HL-SUPPORT-HANDLE?", 1, 0, false);
        declareFunction("kb_hl_support_handle_validP", "KB-HL-SUPPORT-HANDLE-VALID?", 1, 0, false);
        declareFunction("valid_kb_hl_support_contentP", "VALID-KB-HL-SUPPORT-CONTENT?", 1, 1, false);
        declareFunction("kb_hl_support_content_validP", "KB-HL-SUPPORT-CONTENT-VALID?", 1, 1, false);
        declareFunction("kb_hl_support_uselessP", "KB-HL-SUPPORT-USELESS?", 1, 0, false);
        declareFunction("kb_hl_support_unjustifiedP", "KB-HL-SUPPORT-UNJUSTIFIED?", 1, 0, false);
        declareFunction("possibly_destroy_kb_hl_support", "POSSIBLY-DESTROY-KB-HL-SUPPORT", 1, 0, false);
        declareFunction("tms_remove_kb_hl_supports_mentioning_term", "TMS-REMOVE-KB-HL-SUPPORTS-MENTIONING-TERM", 1, 0, false);
        declareFunction("setup_kb_hl_support_tables", "SETUP-KB-HL-SUPPORT-TABLES", 2, 0, false);
        declareFunction("finalize_kb_hl_supports", "FINALIZE-KB-HL-SUPPORTS", 0, 1, false);
        declareMacro("do_kb_hl_supports", "DO-KB-HL-SUPPORTS");
        declareMacro("do_old_kb_hl_supports", "DO-OLD-KB-HL-SUPPORTS");
        declareMacro("do_new_kb_hl_supports", "DO-NEW-KB-HL-SUPPORTS");
        declareFunction("do_kb_hl_supports_table", "DO-KB-HL-SUPPORTS-TABLE", 0, 0, false);
        declareFunction("setup_kb_hl_support_id_tables", "SETUP-KB-HL-SUPPORT-ID-TABLES", 2, 0, false);
        declareFunction("optimize_kb_hl_support_id_tables", "OPTIMIZE-KB-HL-SUPPORT-ID-TABLES", 0, 0, false);
        declareFunction("lookup_kb_hl_support_by_id", "LOOKUP-KB-HL-SUPPORT-BY-ID", 1, 0, false);
        declareFunction("next_kb_hl_support_id", "NEXT-KB-HL-SUPPORT-ID", 0, 0, false);
        declareFunction("register_kb_hl_support_id", "REGISTER-KB-HL-SUPPORT-ID", 2, 0, false);
        declareFunction("deregister_kb_hl_support_id", "DEREGISTER-KB-HL-SUPPORT-ID", 1, 0, false);
        declareFunction("set_next_kb_hl_support_id", "SET-NEXT-KB-HL-SUPPORT-ID", 0, 1, false);
        declareFunction("increment_next_kb_hl_support_id", "INCREMENT-NEXT-KB-HL-SUPPORT-ID", 0, 0, false);
        declareFunction("clear_kb_hl_support_id_tables", "CLEAR-KB-HL-SUPPORT-ID-TABLES", 0, 0, false);
        declareFunction("kb_hl_support_index_unindexed_termP", "KB-HL-SUPPORT-INDEX-UNINDEXED-TERM?", 1, 0, false);
        new kb_hl_supports.$kb_hl_support_index_unindexed_termP$UnaryFunction();
        declareFunction("kb_hl_support_index_indexed_term_p", "KB-HL-SUPPORT-INDEX-INDEXED-TERM-P", 1, 0, false);
        declareFunction("kb_hl_support_index_indexed_terms", "KB-HL-SUPPORT-INDEX-INDEXED-TERMS", 1, 0, false);
        declareFunction("setup_kb_hl_support_index_table", "SETUP-KB-HL-SUPPORT-INDEX-TABLE", 0, 0, false);
        declareFunction("lookup_kb_hl_support", "LOOKUP-KB-HL-SUPPORT", 1, 0, false);
        declareFunction("lookup_kb_hl_supports_mentioning_term", "LOOKUP-KB-HL-SUPPORTS-MENTIONING-TERM", 1, 0, false);
        declareFunction("lookup_kb_hl_supports_mentioning_term_in_sentence", "LOOKUP-KB-HL-SUPPORTS-MENTIONING-TERM-IN-SENTENCE", 1, 0, false);
        declareFunction("lookup_kb_hl_supports_mentioning_indexed_term_in_sentence", "LOOKUP-KB-HL-SUPPORTS-MENTIONING-INDEXED-TERM-IN-SENTENCE", 1, 0, false);
        declareFunction("lookup_kb_hl_supports_mentioning_unindexed_term_in_sentence", "LOOKUP-KB-HL-SUPPORTS-MENTIONING-UNINDEXED-TERM-IN-SENTENCE", 1, 0, false);
        declareFunction("lookup_kb_hl_supports_mentioning_term_in_mt", "LOOKUP-KB-HL-SUPPORTS-MENTIONING-TERM-IN-MT", 1, 0, false);
        declareFunction("index_kb_hl_support", "INDEX-KB-HL-SUPPORT", 2, 0, false);
        declareFunction("unindex_kb_hl_support", "UNINDEX-KB-HL-SUPPORT", 1, 1, false);
        declareFunction("unindex_kb_hl_support_with_hl_support", "UNINDEX-KB-HL-SUPPORT-WITH-HL-SUPPORT", 2, 0, false);
        declareFunction("unindex_kb_hl_support_without_hl_support", "UNINDEX-KB-HL-SUPPORT-WITHOUT-HL-SUPPORT", 1, 0, false);
        declareFunction("clear_kb_hl_support_index", "CLEAR-KB-HL-SUPPORT-INDEX", 0, 0, false);
        declareFunction("reindex_all_kb_hl_supports", "REINDEX-ALL-KB-HL-SUPPORTS", 0, 0, false);
        declareFunction("note_kb_hl_support_creation_started", "NOTE-KB-HL-SUPPORT-CREATION-STARTED", 2, 0, false);
        declareFunction("note_kb_hl_support_creation_complete", "NOTE-KB-HL-SUPPORT-CREATION-COMPLETE", 1, 0, false);
        declareFunction("find_kb_hl_support_during_creation", "FIND-KB-HL-SUPPORT-DURING-CREATION", 1, 0, false);
        declareFunction("find_or_create_kb_hl_support", "FIND-OR-CREATE-KB-HL-SUPPORT", 2, 0, false);
        declareFunction("create_kb_hl_support", "CREATE-KB-HL-SUPPORT", 2, 0, false);
        declareFunction("destroy_kb_hl_support", "DESTROY-KB-HL-SUPPORT", 1, 0, false);
        declareFunction("free_all_kb_hl_support", "FREE-ALL-KB-HL-SUPPORT", 0, 0, false);
        declareFunction("possibly_reify_hl_supports", "POSSIBLY-REIFY-HL-SUPPORTS", 1, 0, false);
        declareFunction("possibly_reify_hl_support", "POSSIBLY-REIFY-HL-SUPPORT", 1, 0, false);
        declareFunction("possibly_unreify_kb_hl_supports", "POSSIBLY-UNREIFY-KB-HL-SUPPORTS", 1, 0, false);
        declareFunction("unreify_kb_hl_supports", "UNREIFY-KB-HL-SUPPORTS", 1, 0, false);
        declareFunction("unreify_kb_hl_support", "UNREIFY-KB-HL-SUPPORT", 1, 0, false);
        declareFunction("enqueueing_kb_hl_supports_for_tmsP", "ENQUEUEING-KB-HL-SUPPORTS-FOR-TMS?", 0, 0, false);
        declareMacro("with_kb_hl_support_rejustification", "WITH-KB-HL-SUPPORT-REJUSTIFICATION");
        declareFunction("process_tms_kb_hl_support_queue", "PROCESS-TMS-KB-HL-SUPPORT-QUEUE", 0, 0, false);
        declareFunction("rejustify_or_remove_kb_hl_support", "REJUSTIFY-OR-REMOVE-KB-HL-SUPPORT", 1, 0, false);
        declareFunction("tms_possibly_rejustify_kb_hl_support", "TMS-POSSIBLY-REJUSTIFY-KB-HL-SUPPORT", 1, 0, false);
        declareFunction("enqueue_kb_hl_support_for_tms", "ENQUEUE-KB-HL-SUPPORT-FOR-TMS", 1, 0, false);
        declareFunction("possibly_rejustify_kb_hl_support", "POSSIBLY-REJUSTIFY-KB-HL-SUPPORT", 1, 0, false);
        declareFunction("tms_remove_kb_hl_support", "TMS-REMOVE-KB-HL-SUPPORT", 1, 0, false);
        declareFunction("verify_kb_hl_support", "VERIFY-KB-HL-SUPPORT", 1, 0, false);
        declareFunction("handle_unverifiable_kb_hl_support", "HANDLE-UNVERIFIABLE-KB-HL-SUPPORT", 1, 0, false);
        declareFunction("partition_create_invalid_kb_hl_support", "PARTITION-CREATE-INVALID-KB-HL-SUPPORT", 0, 0, false);
        declareFunction("create_sample_invalid_kb_hl_support", "CREATE-SAMPLE-INVALID-KB-HL-SUPPORT", 0, 0, false);
        declareFunction("kb_hl_support_dump_id", "KB-HL-SUPPORT-DUMP-ID", 1, 0, false);
        declareFunction("find_kb_hl_support_by_dump_id", "FIND-KB-HL-SUPPORT-BY-DUMP-ID", 1, 0, false);
        declareMacro("with_kb_hl_support_dump_id_table", "WITH-KB-HL-SUPPORT-DUMP-ID-TABLE");
        declareFunction("create_kb_hl_support_dump_id_table", "CREATE-KB-HL-SUPPORT-DUMP-ID-TABLE", 0, 0, false);
        declareFunction("dump_kb_hl_support_content", "DUMP-KB-HL-SUPPORT-CONTENT", 2, 0, false);
        declareFunction("load_kb_hl_support_content", "LOAD-KB-HL-SUPPORT-CONTENT", 2, 0, false);
        declareFunction("dump_kb_hl_support_indexing_int", "DUMP-KB-HL-SUPPORT-INDEXING-INT", 1, 0, false);
        declareFunction("load_kb_hl_support_indexing_int", "LOAD-KB-HL-SUPPORT-INDEXING-INT", 1, 0, false);
        declareFunction("kb_hl_support_not_findable_by_hl_supportP", "KB-HL-SUPPORT-NOT-FINDABLE-BY-HL-SUPPORT?", 1, 0, false);
        declareFunction("kb_hl_support_circularP", "KB-HL-SUPPORT-CIRCULAR?", 1, 0, false);
        declareFunction("kb_hl_support_circularP_int", "KB-HL-SUPPORT-CIRCULAR?-INT", 2, 0, false);
        declareFunction("kb_hl_support_has_invalid_dependentP", "KB-HL-SUPPORT-HAS-INVALID-DEPENDENT?", 1, 1, false);
        declareFunction("kb_hl_support_has_invalid_argumentP", "KB-HL-SUPPORT-HAS-INVALID-ARGUMENT?", 1, 1, false);
        declareFunction("kb_hl_support_has_invalid_hl_supportP", "KB-HL-SUPPORT-HAS-INVALID-HL-SUPPORT?", 1, 0, false);
        declareFunction("kb_hl_support_has_missing_backpointerP", "KB-HL-SUPPORT-HAS-MISSING-BACKPOINTER?", 1, 0, false);
        declareFunction("kb_hl_supports_not_findable_by_hl_support", "KB-HL-SUPPORTS-NOT-FINDABLE-BY-HL-SUPPORT", 0, 0, false);
        declareFunction("circular_kb_hl_supports", "CIRCULAR-KB-HL-SUPPORTS", 0, 0, false);
        declareFunction("duplicate_kb_hl_supports", "DUPLICATE-KB-HL-SUPPORTS", 0, 0, false);
        declareFunction("kb_hl_supports_with_invalid_dependents", "KB-HL-SUPPORTS-WITH-INVALID-DEPENDENTS", 0, 1, false);
        declareFunction("kb_hl_supports_with_invalid_arguments", "KB-HL-SUPPORTS-WITH-INVALID-ARGUMENTS", 0, 1, false);
        declareFunction("kb_hl_supports_with_invalid_hl_supports", "KB-HL-SUPPORTS-WITH-INVALID-HL-SUPPORTS", 0, 0, false);
        declareFunction("kb_hl_supports_with_missing_backpointers", "KB-HL-SUPPORTS-WITH-MISSING-BACKPOINTERS", 0, 0, false);
        declareFunction("verify_kb_hl_supports", "VERIFY-KB-HL-SUPPORTS", 0, 2, false);
        declareFunction("verify_kb_hl_support_indexing", "VERIFY-KB-HL-SUPPORT-INDEXING", 0, 1, false);
        declareFunction("report_kb_hl_support_indexing_failures", "REPORT-KB-HL-SUPPORT-INDEXING-FAILURES", 2, 1, false);
        declareFunction("verify_kb_hl_supports_non_circular", "VERIFY-KB-HL-SUPPORTS-NON-CIRCULAR", 0, 1, false);
        declareFunction("report_circular_kb_hl_supports", "REPORT-CIRCULAR-KB-HL-SUPPORTS", 2, 1, false);
        declareFunction("verify_kb_hl_support_uniqueness", "VERIFY-KB-HL-SUPPORT-UNIQUENESS", 0, 1, false);
        declareFunction("report_duplicate_kb_hl_supports", "REPORT-DUPLICATE-KB-HL-SUPPORTS", 2, 1, false);
        declareFunction("verify_kb_hl_support_dependents", "VERIFY-KB-HL-SUPPORT-DEPENDENTS", 0, 1, false);
        declareFunction("report_kb_hl_supports_with_invalid_dependents", "REPORT-KB-HL-SUPPORTS-WITH-INVALID-DEPENDENTS", 2, 1, false);
        declareFunction("verify_kb_hl_support_arguments", "VERIFY-KB-HL-SUPPORT-ARGUMENTS", 0, 1, false);
        declareFunction("report_kb_hl_supports_with_invalid_arguments", "REPORT-KB-HL-SUPPORTS-WITH-INVALID-ARGUMENTS", 2, 1, false);
        declareFunction("verify_kb_hl_support_hl_supports", "VERIFY-KB-HL-SUPPORT-HL-SUPPORTS", 0, 1, false);
        declareFunction("report_kb_hl_supports_with_invalid_hl_supports", "REPORT-KB-HL-SUPPORTS-WITH-INVALID-HL-SUPPORTS", 2, 1, false);
        declareFunction("verify_kb_hl_support_backpointers", "VERIFY-KB-HL-SUPPORT-BACKPOINTERS", 0, 1, false);
        declareFunction("report_kb_hl_supports_with_missing_backpointers", "REPORT-KB-HL-SUPPORTS-WITH-MISSING-BACKPOINTERS", 2, 1, false);
        declareFunction("destroy_duplicate_kb_hl_supports", "DESTROY-DUPLICATE-KB-HL-SUPPORTS", 0, 0, false);
        declareFunction("destroy_duplicate_kb_hl_support", "DESTROY-DUPLICATE-KB-HL-SUPPORT", 2, 0, false);
        declareFunction("eliminate_kb_hl_supports_invalid_dependents", "ELIMINATE-KB-HL-SUPPORTS-INVALID-DEPENDENTS", 0, 1, false);
        declareFunction("eliminate_kb_hl_support_invalid_dependents", "ELIMINATE-KB-HL-SUPPORT-INVALID-DEPENDENTS", 1, 1, false);
        declareFunction("destroy_kb_hl_supports_with_invalid_hl_supports", "DESTROY-KB-HL-SUPPORTS-WITH-INVALID-HL-SUPPORTS", 0, 0, false);
        declareFunction("bootstrap_kb_hl_supports", "BOOTSTRAP-KB-HL-SUPPORTS", 0, 1, false);
        declareFunction("bootstrap_kb_hl_supports_for_deduction", "BOOTSTRAP-KB-HL-SUPPORTS-FOR-DEDUCTION", 1, 0, false);
        return NIL;
    }

    public static final SubLObject init_kb_hl_supports_file() {
        defconstant("*DTP-KB-HL-SUPPORT*", KB_HL_SUPPORT);
        defparameter("*PRINT-KB-HL-SUPPORT-HL-SUPPORT?*", T);
        defconstant("*DTP-KB-HL-SUPPORT-CONTENT*", KB_HL_SUPPORT_CONTENT);
        deflexical("*KB-HL-SUPPORTS-FROM-IDS*", NIL != boundp($kb_hl_supports_from_ids$) ? ((SubLObject) ($kb_hl_supports_from_ids$.getGlobalValue())) : NIL);
        deflexical("*KB-HL-SUPPORT-INDEX*", NIL != boundp($kb_hl_support_index$) ? ((SubLObject) ($kb_hl_support_index$.getGlobalValue())) : NIL);
        deflexical("*KB-HL-SUPPORT-INDEX-LOCK*", make_lock($$$KB_HL_support_indexing_lock));
        deflexical("*KB-HL-SUPPORT-INDEX-UNINDEXED-TERMS*", $list_alt60);
        deflexical("*KB-HL-SUPPORTS-BEING-CREATED*", NIL != boundp($kb_hl_supports_being_created$) ? ((SubLObject) ($kb_hl_supports_being_created$.getGlobalValue())) : NIL);
        defparameter("*UNREIFY-KB-HL-SUPPORTS?*", NIL);
        defparameter("*TMS-KB-HL-SUPPORT-QUEUE*", NIL);
        defparameter("*KB-HL-SUPPORT-DUMP-ID-TABLE*", NIL);
        return NIL;
    }

    public static final SubLObject setup_kb_hl_supports_file() {
                access_macros.register_macro_helper(DO_KB_HL_SUPPORT_DEPENDENTS_HELPER, DO_KB_HL_SUPPORT_DEPENDENTS);
        register_method($print_object_method_table$.getGlobalValue(), $dtp_kb_hl_support$.getGlobalValue(), symbol_function(KB_HL_SUPPORT_PRINT_FUNCTION_TRAMPOLINE));
        def_csetf(KB_HLS_ID, _CSETF_KB_HLS_ID);
        identity(KB_HL_SUPPORT);
        register_method(Sxhash.$sxhash_method_table$.getGlobalValue(), $dtp_kb_hl_support$.getGlobalValue(), symbol_function(SXHASH_KB_HL_SUPPORT_METHOD));
        register_method($print_object_method_table$.getGlobalValue(), $dtp_kb_hl_support_content$.getGlobalValue(), symbol_function(KB_HL_SUPPORT_CONTENT_PRINT_FUNCTION_TRAMPOLINE));
        def_csetf(KB_HLSC_ARGUMENT, _CSETF_KB_HLSC_ARGUMENT);
        def_csetf(KB_HLSC_DEPENDENTS, _CSETF_KB_HLSC_DEPENDENTS);
        identity(KB_HL_SUPPORT_CONTENT);
        subl_macro_promotions.declare_defglobal($kb_hl_supports_from_ids$);
        access_macros.register_macro_helper(DO_KB_HL_SUPPORTS_TABLE, DO_KB_HL_SUPPORTS);
        subl_macro_promotions.declare_defglobal($kb_hl_support_index$);
        subl_macro_promotions.declare_defglobal($kb_hl_supports_being_created$);
        access_macros.register_macro_helper(PROCESS_TMS_KB_HL_SUPPORT_QUEUE, WITH_KB_HL_SUPPORT_REJUSTIFICATION);
        access_macros.register_macro_helper(CREATE_KB_HL_SUPPORT_DUMP_ID_TABLE, WITH_KB_HL_SUPPORT_DUMP_ID_TABLE);
        return NIL;
    }

    // // Internal Constants
    static private final SubLList $list_alt0 = list(list(makeSymbol("ARGUMENT-VAR"), makeSymbol("KB-HL-SUPPORT"), makeSymbol("&KEY"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list_alt1 = list($DONE);

    private static final SubLSymbol $ALLOW_OTHER_KEYS = makeKeyword("ALLOW-OTHER-KEYS");





    private static final SubLSymbol KB_HL_SUPPORT_ARGUMENTS = makeSymbol("KB-HL-SUPPORT-ARGUMENTS");

    static private final SubLList $list_alt6 = list(list(makeSymbol("DEPENDENT-VAR"), makeSymbol("KB-HL-SUPPORT"), makeSymbol("&KEY"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));



    private static final SubLSymbol DO_KB_HL_SUPPORT_DEPENDENTS_HELPER = makeSymbol("DO-KB-HL-SUPPORT-DEPENDENTS-HELPER");

    private static final SubLSymbol DO_KB_HL_SUPPORT_DEPENDENTS = makeSymbol("DO-KB-HL-SUPPORT-DEPENDENTS");

    static private final SubLList $list_alt10 = list(list(makeSymbol("SUPPORT-VAR"), makeSymbol("KB-HL-SUPPORT"), makeSymbol("&KEY"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLSymbol KB_HL_SUPPORT_JUSTIFICATION = makeSymbol("KB-HL-SUPPORT-JUSTIFICATION");





    static private final SubLList $list_alt14 = list(makeSymbol("ID"));

    static private final SubLList $list_alt15 = list(makeKeyword("ID"));

    static private final SubLList $list_alt16 = list(makeSymbol("KB-HLS-ID"));

    static private final SubLList $list_alt17 = list(makeSymbol("_CSETF-KB-HLS-ID"));

    private static final SubLSymbol PRINT_KB_HL_SUPPORT = makeSymbol("PRINT-KB-HL-SUPPORT");

    private static final SubLSymbol KB_HL_SUPPORT_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("KB-HL-SUPPORT-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLSymbol KB_HLS_ID = makeSymbol("KB-HLS-ID");

    public static final SubLSymbol _CSETF_KB_HLS_ID = makeSymbol("_CSETF-KB-HLS-ID");



    static private final SubLString $str_alt23$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");

    static private final SubLString $str_alt24$_The_CFASL_invalid_KB_HL_support_ = makeString("<The CFASL invalid KB HL support>");

    static private final SubLString $str_alt25$___s_ = makeString("#<~s>");

    static private final SubLString $str_alt26$__KB_HL_SUPPORT__s_ = makeString("#<KB HL SUPPORT ~s>");

    public static final SubLInteger $int$787 = makeInteger(787);

    private static final SubLSymbol SXHASH_KB_HL_SUPPORT_METHOD = makeSymbol("SXHASH-KB-HL-SUPPORT-METHOD");

    private static final SubLSymbol KB_HL_SUPPORT_CONTENT = makeSymbol("KB-HL-SUPPORT-CONTENT");

    private static final SubLSymbol KB_HL_SUPPORT_CONTENT_P = makeSymbol("KB-HL-SUPPORT-CONTENT-P");

    static private final SubLList $list_alt31 = list(makeSymbol("ARGUMENT"), makeSymbol("DEPENDENTS"));

    static private final SubLList $list_alt32 = list(makeKeyword("ARGUMENT"), makeKeyword("DEPENDENTS"));

    static private final SubLList $list_alt33 = list(makeSymbol("KB-HLSC-ARGUMENT"), makeSymbol("KB-HLSC-DEPENDENTS"));

    static private final SubLList $list_alt34 = list(makeSymbol("_CSETF-KB-HLSC-ARGUMENT"), makeSymbol("_CSETF-KB-HLSC-DEPENDENTS"));



    private static final SubLSymbol KB_HL_SUPPORT_CONTENT_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("KB-HL-SUPPORT-CONTENT-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLSymbol KB_HLSC_ARGUMENT = makeSymbol("KB-HLSC-ARGUMENT");

    public static final SubLSymbol _CSETF_KB_HLSC_ARGUMENT = makeSymbol("_CSETF-KB-HLSC-ARGUMENT");

    private static final SubLSymbol KB_HLSC_DEPENDENTS = makeSymbol("KB-HLSC-DEPENDENTS");

    public static final SubLSymbol _CSETF_KB_HLSC_DEPENDENTS = makeSymbol("_CSETF-KB-HLSC-DEPENDENTS");





    public static final SubLSymbol $kb_hl_supports_from_ids$ = makeSymbol("*KB-HL-SUPPORTS-FROM-IDS*");

    static private final SubLList $list_alt44 = list(list(makeSymbol("VAR"), makeSymbol("&KEY"), list(makeSymbol("PROGRESS-MESSAGE"), makeString("mapping Cyc KB HL supports")), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list_alt45 = list(makeKeyword("PROGRESS-MESSAGE"), $DONE);



    static private final SubLString $$$mapping_Cyc_KB_HL_supports = makeString("mapping Cyc KB HL supports");



    static private final SubLList $list_alt49 = list(makeSymbol("DO-KB-HL-SUPPORTS-TABLE"));

    static private final SubLList $list_alt50 = list(list(makeSymbol("VAR"), makeSymbol("&KEY"), makeSymbol("PROGRESS-MESSAGE"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLSymbol DO_KB_SUID_TABLE_OLD_OBJECTS = makeSymbol("DO-KB-SUID-TABLE-OLD-OBJECTS");

    private static final SubLSymbol DO_KB_SUID_TABLE_NEW_OBJECTS = makeSymbol("DO-KB-SUID-TABLE-NEW-OBJECTS");

    private static final SubLSymbol DO_KB_HL_SUPPORTS_TABLE = makeSymbol("DO-KB-HL-SUPPORTS-TABLE");

    private static final SubLSymbol DO_KB_HL_SUPPORTS = makeSymbol("DO-KB-HL-SUPPORTS");

    static private final SubLString $str_alt55$Determining_maximum_KB_HL_support = makeString("Determining maximum KB HL support ID");





    public static final SubLSymbol $kb_hl_support_index$ = makeSymbol("*KB-HL-SUPPORT-INDEX*");

    static private final SubLString $$$KB_HL_support_indexing_lock = makeString("KB HL support indexing lock");

    static private final SubLList $list_alt60 = list(new SubLObject[]{ constant_handles.reader_make_constant_shell(makeString("isa")), constant_handles.reader_make_constant_shell(makeString("DefaultSemanticsForStringFn")), constant_handles.reader_make_constant_shell(makeString("evaluate")), constant_handles.reader_make_constant_shell(makeString("genlInverse")), constant_handles.reader_make_constant_shell(makeString("genlPreds")), constant_handles.reader_make_constant_shell(makeString("genls")), constant_handles.reader_make_constant_shell(makeString("ist")), constant_handles.reader_make_constant_shell(makeString("ist-Asserted")), constant_handles.reader_make_constant_shell(makeString("SubLStringConcatenationFn")), constant_handles.reader_make_constant_shell(makeString("TheList")), constant_handles.reader_make_constant_shell(makeString("TheSet")) });



    static private final SubLSymbol $sym62$KB_HL_SUPPORT_INDEX_UNINDEXED_TERM_ = makeSymbol("KB-HL-SUPPORT-INDEX-UNINDEXED-TERM?");

    static private final SubLList $list_alt63 = list(makeSymbol("MODULE"), makeSymbol("SENTENCE"), makeSymbol("MT"), makeSymbol("TV"));

    static private final SubLString $$$reindexing_KB_HL_supports = makeString("reindexing KB HL supports");

    public static final SubLSymbol $kb_hl_supports_being_created$ = makeSymbol("*KB-HL-SUPPORTS-BEING-CREATED*");

    static private final SubLString $$$Freeing_KB_HL_supports = makeString("Freeing KB HL supports");

    private static final SubLSymbol POSSIBLY_REIFY_HL_SUPPORT = makeSymbol("POSSIBLY-REIFY-HL-SUPPORT");

    private static final SubLSymbol UNREIFY_KB_HL_SUPPORT = makeSymbol("UNREIFY-KB-HL-SUPPORT");



    static private final SubLList $list_alt70 = list(makeSymbol("ENQUEUEING-KB-HL-SUPPORTS-FOR-TMS?"));





    static private final SubLList $list_alt73 = list(list(makeSymbol("*TMS-KB-HL-SUPPORT-QUEUE*"), list(makeSymbol("CREATE-QUEUE"))));

    static private final SubLList $list_alt74 = list(list(makeSymbol("PROCESS-TMS-KB-HL-SUPPORT-QUEUE")));

    private static final SubLSymbol PROCESS_TMS_KB_HL_SUPPORT_QUEUE = makeSymbol("PROCESS-TMS-KB-HL-SUPPORT-QUEUE");

    private static final SubLSymbol WITH_KB_HL_SUPPORT_REJUSTIFICATION = makeSymbol("WITH-KB-HL-SUPPORT-REJUSTIFICATION");

    static private final SubLList $list_alt77 = list(list(makeSymbol("*KB-HL-SUPPORT-DUMP-ID-TABLE*"), list(makeSymbol("CREATE-KB-HL-SUPPORT-DUMP-ID-TABLE"))), list(makeSymbol("*CFASL-KB-HL-SUPPORT-HANDLE-FUNC*"), list(QUOTE, makeSymbol("KB-HL-SUPPORT-DUMP-ID"))));

    private static final SubLSymbol CREATE_KB_HL_SUPPORT_DUMP_ID_TABLE = makeSymbol("CREATE-KB-HL-SUPPORT-DUMP-ID-TABLE");

    private static final SubLSymbol WITH_KB_HL_SUPPORT_DUMP_ID_TABLE = makeSymbol("WITH-KB-HL-SUPPORT-DUMP-ID-TABLE");

    static private final SubLString $$$Verifying_KB_HL_support_indexing = makeString("Verifying KB HL support indexing");

    static private final SubLString $str_alt81$Searching_for_circular_KB_HL_supp = makeString("Searching for circular KB HL supports");

    static private final SubLString $str_alt82$Searching_for_duplicate_KB_HL_sup = makeString("Searching for duplicate KB HL supports");

    static private final SubLSymbol $sym83$_ = makeSymbol("<");

    private static final SubLSymbol KB_HL_SUPPORT_ID = makeSymbol("KB-HL-SUPPORT-ID");

    static private final SubLString $str_alt85$Searching_for_KB_HL_supports_with = makeString("Searching for KB HL supports with invalid dependents");

    static private final SubLString $str_alt86$Searching_for_KB_HL_supports_with = makeString("Searching for KB HL supports with invalid arguments");

    static private final SubLString $str_alt87$Searching_for_KB_HL_supports_with = makeString("Searching for KB HL supports with invalid HL supports");

    static private final SubLString $str_alt88$Searching_for_KB_HL_supports_with = makeString("Searching for KB HL supports with missing backpointers");



    static private final SubLString $$$Verifying_KB_HL_supports = makeString("Verifying KB HL supports");

    static private final SubLString $str_alt91$__Error_during_KB_HL_support_veri = makeString("~&Error during KB HL support verification: ~a~%");

    static private final SubLString $str_alt92$__Error_during_indexing_verificat = makeString("~&Error during indexing verification: ~a~%");

    static private final SubLString $str_alt93$__The_following_KB_HL_supports_we = makeString("~&The following KB HL supports were not findable via their HL supports (~s in total):~%");

    static private final SubLString $str_alt94$__s__s__ = makeString(" ~s ~s~%");

    static private final SubLString $str_alt95$___s_KB_HL_supports_are_not_finab = makeString("~&~s KB HL supports are not finable via their HL supports.~%");

    static private final SubLString $str_alt96$__Error_during_non_circularity_ve = makeString("~&Error during non-circularity verification: ~a~%");

    static private final SubLString $str_alt97$__The_following_KB_HL_supports_ar = makeString("~&The following KB HL supports are circular (~s in total):~%");

    static private final SubLString $str_alt98$___s_KB_HL_supports_are_circular_ = makeString("~&~s KB HL supports are circular.~%");

    static private final SubLString $str_alt99$__Error_during_uniqueness_verific = makeString("~&Error during uniqueness verification: ~a~%");

    static private final SubLString $str_alt100$__The_following_KB_HL_supports_ha = makeString("~&The following KB HL supports have duplicates (~s in total):~%");

    static private final SubLString $str_alt101$___s_KB_HL_supports_have_duplicat = makeString("~&~s KB HL supports have duplicates.~%");

    static private final SubLString $str_alt102$__Error_during_dependent_verifica = makeString("~&Error during dependent verification: ~a~%");

    static private final SubLString $str_alt103$__The_following_KB_HL_supports_ha = makeString("~&The following KB HL supports have invalid dependents (~s in total):~%");

    static private final SubLString $str_alt104$___s_KB_HL_supports_have_invalid_ = makeString("~&~s KB HL supports have invalid dependents.~%");

    static private final SubLString $str_alt105$__Error_during_argument_verificat = makeString("~&Error during argument verification: ~a~%");

    static private final SubLString $str_alt106$__The_following_KB_HL_supports_ha = makeString("~&The following KB HL supports have invalid arguments (~s in total):~%");

    static private final SubLString $str_alt107$___s_KB_HL_supports_have_invalid_ = makeString("~&~s KB HL supports have invalid arguments.~%");

    static private final SubLString $str_alt108$__Error_during_HL_support_verific = makeString("~&Error during HL support verification: ~a~%");

    static private final SubLString $str_alt109$__The_following_KB_HL_supports_ha = makeString("~&The following KB HL supports have invalid HL supports (~s in total):~%");

    static private final SubLString $str_alt110$___s_KB_HL_supports_have_invalid_ = makeString("~&~s KB HL supports have invalid HL supports.~%");

    static private final SubLString $str_alt111$__Error_during_KB_HL_support_back = makeString("~&Error during KB HL support backpointer verification: ~a~%");

    static private final SubLString $str_alt112$__The_following_KB_HL_supports_ha = makeString("~&The following KB HL supports have missing backpointers (~s in total):~%");

    static private final SubLString $str_alt113$___s_KB_HL_supports_have_missing_ = makeString("~&~s KB HL supports have missing backpointers.~%");

    static private final SubLString $str_alt114$Eliminating_duplicate_KB_HL_suppo = makeString("Eliminating duplicate KB HL supports");

    static private final SubLString $str_alt115$Eliminating_invalid_KB_HL_support = makeString("Eliminating invalid KB HL support dependents");

    static private final SubLSymbol $sym116$VALID_DEDUCTION_ = makeSymbol("VALID-DEDUCTION?");

    static private final SubLString $str_alt117$Eliminating_KB_HL_supports_with_i = makeString("Eliminating KB HL supports with invalid HL supports");

    static private final SubLString $str_alt118$Invalid_attempt_to_reuse_memoizat = makeString("Invalid attempt to reuse memoization state in multiple threads simultaneously.");

    static private final SubLString $$$Bootstrapping_KB_HL_supports = makeString("Bootstrapping KB HL supports");

    static private final SubLString $str_alt120$Could_not_create_KB_HL_support_fo = makeString("Could not create KB HL support for ~s because ~a");

    // // Initializers
    public void declareFunctions() {
        declare_kb_hl_supports_file();
    }

    public void initializeVariables() {
        init_kb_hl_supports_file();
    }

    public void runTopLevelForms() {
        setup_kb_hl_supports_file();
    }
}

