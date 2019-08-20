/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.constant_handles.reader_make_constant_shell;
import static com.cyc.cycjava.cycl.el_utilities.closedP;
import static com.cyc.cycjava.cycl.format_nil.format_nil_a_no_copy;
import static com.cyc.cycjava.cycl.format_nil.format_nil_s_no_copy;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.listS;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.eql;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.equal;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.identity;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.funcall;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.cconcatenate;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.delete;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.delete_duplicates;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.find;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.find_if;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.length;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.remove;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.def_csetf;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.makeStructDeclNative;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.register_method;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cadr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cddr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.$print_object_method_table$;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.defconstant;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;

import org.armedbear.lisp.Lisp;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.util.SubLFiles.LispMethod;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      PPH-DRS
 * source file: /cyc/top/cycl/pph-drs.lisp
 * created:     2019/07/03 17:38:18
 */
public final class pph_drs extends SubLTranslatedFile implements V12 {
    public static final class $pph_rm_native extends SubLStructNative {
        public SubLStructDecl getStructDecl() {
            return structDecl;
        }

        public SubLObject getField2() {
            return com.cyc.cycjava.cycl.pph_drs.$pph_rm_native.this.$cycl;
        }

        public SubLObject getField3() {
            return com.cyc.cycjava.cycl.pph_drs.$pph_rm_native.this.$agr;
        }

        public SubLObject getField4() {
            return com.cyc.cycjava.cycl.pph_drs.$pph_rm_native.this.$phrases;
        }

        public SubLObject setField2(SubLObject value) {
            return com.cyc.cycjava.cycl.pph_drs.$pph_rm_native.this.$cycl = value;
        }

        public SubLObject setField3(SubLObject value) {
            return com.cyc.cycjava.cycl.pph_drs.$pph_rm_native.this.$agr = value;
        }

        public SubLObject setField4(SubLObject value) {
            return com.cyc.cycjava.cycl.pph_drs.$pph_rm_native.this.$phrases = value;
        }

        public SubLObject $cycl = Lisp.NIL;

        public SubLObject $agr = Lisp.NIL;

        public SubLObject $phrases = Lisp.NIL;

        private static final SubLStructDeclNative structDecl = makeStructDeclNative(com.cyc.cycjava.cycl.pph_drs.$pph_rm_native.class, PPH_RM, PPH_RM_P, $list_alt14, $list_alt15, new String[]{ "$cycl", "$agr", "$phrases" }, $list_alt16, $list_alt17, PPH_PPRINT_RM);
    }

    public static final SubLFile me = new pph_drs();



    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $pph_drs_id_generator$ = makeSymbol("*PPH-DRS-ID-GENERATOR*");

    // defconstant
    @LispMethod(comment = "defconstant")
    public static final SubLSymbol $dtp_pph_rm$ = makeSymbol("*DTP-PPH-RM*");

    // defconstant
    @LispMethod(comment = "defconstant")
    public static final SubLSymbol $dtp_pph_drs$ = makeSymbol("*DTP-PPH-DRS*");

    private static final SubLSymbol $BACKWARD_LOOKING_CENTER = makeKeyword("BACKWARD-LOOKING-CENTER");

    static private final SubLString $str2$__Not_adding__S_to_the_discourse_ = makeString("~&Not adding ~S to the discourse context because *pph-track-discourse-referents?* is NIL~%");

    static private final SubLString $str3$__Not_adding__S_to_the_discourse_ = makeString("~&Not adding ~S to the discourse context because *pph-discourse-context* is not initialized~%");

    static private final SubLString $str4$__Not_adding__S_to_the_discourse_ = makeString("~&Not adding ~S to the discourse context because it is already there~%");

    private static final SubLString $str5$__Not_adding__S_to_the_discourse_ = makeString("~&Not adding ~S to the discourse context because it is not valid discourse-referent cycl");

    private static final SubLList $list6 = list(reader_make_constant_shell("FirstPerson-NLAttr"), reader_make_constant_shell("SecondPerson-NLAttr"));

    private static final SubLSymbol PPH_RM_CYCL = makeSymbol("PPH-RM-CYCL");

    private static final SubLString $str10$__Looking_for_rival_for__S__S____ = makeString("~&Looking for rival for ~S ~S...~%");

    private static final SubLString $str11$__Checking__S_____ = makeString("~&Checking ~S...~%");

    private static final SubLString $str12$___S_has_a_possible_antecedent_am = makeString("~&~S has a possible antecedent ambiguity: ~S with~% RM ~S~%");

    private static final SubLSymbol PPH_RM = makeSymbol("PPH-RM");

    private static final SubLSymbol PPH_RM_P = makeSymbol("PPH-RM-P");

    static private final SubLList $list15 = list(makeSymbol("CYCL"), makeSymbol("AGR"), makeSymbol("PHRASES"));

    static private final SubLList $list16 = list($CYCL, makeKeyword("AGR"), makeKeyword("PHRASES"));

    static private final SubLList $list17 = list(makeSymbol("PPH-RM-CYCL"), makeSymbol("PPH-RM-AGR"), makeSymbol("PPH-RM-PHRASES"));

    private static final SubLList $list18 = list(makeSymbol("_CSETF-PPH-RM-CYCL"), makeSymbol("_CSETF-PPH-RM-AGR"), makeSymbol("_CSETF-PPH-RM-PHRASES"));

    private static final SubLSymbol PPH_PPRINT_RM = makeSymbol("PPH-PPRINT-RM");

    private static final SubLSymbol PPH_RM_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("PPH-RM-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLList $list21 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("PPH-RM-P"));

    private static final SubLSymbol _CSETF_PPH_RM_CYCL = makeSymbol("_CSETF-PPH-RM-CYCL");

    private static final SubLSymbol PPH_RM_AGR = makeSymbol("PPH-RM-AGR");

    private static final SubLSymbol _CSETF_PPH_RM_AGR = makeSymbol("_CSETF-PPH-RM-AGR");

    private static final SubLSymbol PPH_RM_PHRASES = makeSymbol("PPH-RM-PHRASES");

    private static final SubLSymbol _CSETF_PPH_RM_PHRASES = makeSymbol("_CSETF-PPH-RM-PHRASES");

    private static final SubLString $str30$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");

    private static final SubLSymbol MAKE_PPH_RM = makeSymbol("MAKE-PPH-RM");

    private static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_PPH_RM_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-PPH-RM-METHOD");

    private static final SubLString $str36$__PPH_RM___S__S__S_ = makeString("#<PPH-RM: ~S ~S ~S>");

    private static final SubLSymbol PPH_STRING_IF_NON_NULL_TO_OUTPUT_FORMAT = makeSymbol("PPH-STRING-IF-NON-NULL-TO-OUTPUT-FORMAT");

    private static final SubLSymbol PPH_PHRASE_STRING = makeSymbol("PPH-PHRASE-STRING");

    private static final SubLSymbol VALID_PPH_PHRASE_P = makeSymbol("VALID-PPH-PHRASE-P");

    private static final SubLSymbol PPH_DRS = makeSymbol("PPH-DRS");

    private static final SubLSymbol PPH_DRS_P = makeSymbol("PPH-DRS-P");

    static private final SubLList $list42 = list(makeSymbol("RMS"), makeSymbol("BACKWARD-LOOKING-CENTER"), makeSymbol("ID"));

    static private final SubLList $list43 = list(makeKeyword("RMS"), makeKeyword("BACKWARD-LOOKING-CENTER"), makeKeyword("ID"));

    static private final SubLList $list44 = list(makeSymbol("PPH-DRS-RMS"), makeSymbol("PPH-DRS-BACKWARD-LOOKING-CENTER"), makeSymbol("PPH-DRS-ID"));

    private static final SubLList $list45 = list(makeSymbol("_CSETF-PPH-DRS-RMS"), makeSymbol("_CSETF-PPH-DRS-BACKWARD-LOOKING-CENTER"), makeSymbol("_CSETF-PPH-DRS-ID"));

    private static final SubLSymbol PPRINT_PPH_DRS = makeSymbol("PPRINT-PPH-DRS");

    private static final SubLSymbol PPH_DRS_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("PPH-DRS-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLList $list48 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("PPH-DRS-P"));

    private static final SubLSymbol PPH_DRS_RMS = makeSymbol("PPH-DRS-RMS");

    private static final SubLSymbol _CSETF_PPH_DRS_RMS = makeSymbol("_CSETF-PPH-DRS-RMS");

    private static final SubLSymbol PPH_DRS_BACKWARD_LOOKING_CENTER = makeSymbol("PPH-DRS-BACKWARD-LOOKING-CENTER");

    private static final SubLSymbol _CSETF_PPH_DRS_BACKWARD_LOOKING_CENTER = makeSymbol("_CSETF-PPH-DRS-BACKWARD-LOOKING-CENTER");

    private static final SubLSymbol PPH_DRS_ID = makeSymbol("PPH-DRS-ID");

    private static final SubLSymbol _CSETF_PPH_DRS_ID = makeSymbol("_CSETF-PPH-DRS-ID");

    private static final SubLSymbol MAKE_PPH_DRS = makeSymbol("MAKE-PPH-DRS");

    private static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_PPH_DRS_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-PPH-DRS-METHOD");

    private static final SubLString $str58$__PPH_DRS__S___S___S__ = makeString("#<PPH-DRS ~S: ~S (~S)>");

    private static final SubLString $str59$Setting_BLC_for_DRS__S_____S = makeString("Setting BLC for DRS ~S:~% ~S");

    private static final SubLString $str60$_PPH_error_level_ = makeString("(PPH error level ");

    private static final SubLString $str61$Setting_backward_looking_center_t = makeString("Setting backward looking center to ~S but it's not in the discourse context!");

    private static final SubLString $str62$__ = makeString(") ");

    private static final SubLString $str63$Set_backward_looking_center_to__S = makeString("Set backward-looking center to ~S~%");

    private static final SubLString $str64$Removing_BLC_for_DRS__S = makeString("Removing BLC for DRS ~S");

    private static final SubLString $str65$Removing_rm__S_from__pph_discours = makeString("Removing rm ~S from *pph-discourse-context* ~S");

    private static final SubLString $str68$Getting_CycL_for_NP_from_head_dtr = makeString("Getting CycL for NP from head dtr:~% ~S");

    private static final SubLString $str69$Setting_number_of_reference_marke = makeString("Setting number of reference marker ~S to ~S");

    private static final SubLSymbol $sym71$_NUM = makeSymbol("?NUM");



    private static final SubLList $list73 = list(makeSymbol("?NUM"));



    // Definitions
    public static final SubLObject pph_discourse_context_p_alt(SubLObject v_object) {
        return pph_drs_p(v_object);
    }

    // Definitions
    public static SubLObject pph_discourse_context_p(final SubLObject v_object) {
        return pph_drs_p(v_object);
    }

    public static final SubLObject new_pph_discourse_context_alt() {
        return make_pph_drs(UNPROVIDED);
    }

    public static SubLObject new_pph_discourse_context() {
        return make_pph_drs_with_id(UNPROVIDED);
    }

    /**
     *
     *
     * @return PPH-DISCOURSE-CONTEXT-P, a copy of the current discourse context.
     */
    @LispMethod(comment = "@return PPH-DISCOURSE-CONTEXT-P, a copy of the current discourse context.")
    public static final SubLObject pph_discourse_context_copy_alt() {
        return make_pph_drs(list($RMS, pph_discourse_context_rms(UNPROVIDED)));
    }

    /**
     *
     *
     * @return PPH-DISCOURSE-CONTEXT-P, a copy of the current discourse context.
     */
    @LispMethod(comment = "@return PPH-DISCOURSE-CONTEXT-P, a copy of the current discourse context.")
    public static SubLObject pph_discourse_context_copy() {
        return make_pph_drs_with_id(list($RMS, pph_discourse_context_rms(UNPROVIDED), $BACKWARD_LOOKING_CENTER, get_pph_drs_backward_looking_center(UNPROVIDED)));
    }

    /**
     * Add CYCL to the current discourse context only if it should be added.
     */
    @LispMethod(comment = "Add CYCL to the current discourse context only if it should be added.")
    public static final SubLObject pph_possibly_add_reference_marker_alt(SubLObject cycl) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == pph_vars.$pph_track_discourse_referentsP$.getDynamicValue(thread)) {
                if (NIL != pph_error.pph_trace_level_exceeds_minimumP(THREE_INTEGER)) {
                    format(T, $str_alt1$__Not_adding__S_to_the_discourse_, cycl);
                }
            } else {
                if (NIL == pph_drs_p(pph_vars.$pph_discourse_context$.getDynamicValue(thread))) {
                    if (NIL != pph_error.pph_trace_level_exceeds_minimumP(THREE_INTEGER)) {
                        format(T, $str_alt2$__Not_adding__S_to_the_discourse_, cycl);
                    }
                } else {
                    if (NIL != pph_discourse_referentP(cycl)) {
                        if (NIL != pph_error.pph_trace_level_exceeds_minimumP(THREE_INTEGER)) {
                            format(T, $str_alt3$__Not_adding__S_to_the_discourse_, cycl);
                        }
                    } else {
                        if ((NIL != pph_phrase.pph_unknown_cycl_p(cycl)) || ((NIL == closedP(cycl, UNPROVIDED)) && (NIL == cycl_grammar.cycl_variable_p(cycl)))) {
                            if (NIL != pph_error.pph_trace_level_exceeds_minimumP(THREE_INTEGER)) {
                                format(T, $str_alt4$__Not_adding__S_to_the_discourse_, cycl);
                            }
                        } else {
                            pph_add_reference_marker(cycl, UNPROVIDED);
                        }
                    }
                }
            }
            return pph_vars.$pph_discourse_context$.getDynamicValue(thread);
        }
    }

    /**
     * Add CYCL to the current discourse context only if it should be added.
     */
    @LispMethod(comment = "Add CYCL to the current discourse context only if it should be added.")
    public static SubLObject pph_possibly_add_reference_marker(final SubLObject cycl) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == pph_vars.$pph_track_discourse_referentsP$.getDynamicValue(thread)) {
            if (NIL != pph_error.pph_trace_level_exceeds_minimumP(THREE_INTEGER)) {
                format_nil.force_format(T, $str2$__Not_adding__S_to_the_discourse_, cycl, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            }
        } else
            if (NIL == pph_drs_p(pph_vars.$pph_discourse_context$.getDynamicValue(thread))) {
                if (NIL != pph_error.pph_trace_level_exceeds_minimumP(THREE_INTEGER)) {
                    format_nil.force_format(T, $str3$__Not_adding__S_to_the_discourse_, cycl, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                }
            } else
                if (NIL != pph_discourse_referentP(cycl)) {
                    if (NIL != pph_error.pph_trace_level_exceeds_minimumP(THREE_INTEGER)) {
                        format_nil.force_format(T, $str4$__Not_adding__S_to_the_discourse_, cycl, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    }
                } else
                    if ((NIL != pph_phrase.pph_unknown_cycl_p(cycl)) || ((NIL == closedP(cycl, UNPROVIDED)) && (NIL == cycl_grammar.cycl_variable_p(cycl)))) {
                        if (NIL != pph_error.pph_trace_level_exceeds_minimumP(THREE_INTEGER)) {
                            format_nil.force_format(T, $str5$__Not_adding__S_to_the_discourse_, cycl, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        }
                    } else {
                        pph_add_reference_marker(cycl, UNPROVIDED);
                    }



        return pph_vars.$pph_discourse_context$.getDynamicValue(thread);
    }

    /**
     * Make sure the speaker and addressee are registered, if known.
     */
    @LispMethod(comment = "Make sure the speaker and addressee are registered, if known.")
    public static final SubLObject pph_ensure_discourse_participant_rms_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject participant = NIL;
                SubLObject participant_1 = NIL;
                SubLObject person = NIL;
                SubLObject person_2 = NIL;
                for (participant = list(pph_vars.$pph_speaker$.getDynamicValue(thread), pph_vars.$pph_addressee$.getDynamicValue(thread)), participant_1 = participant.first(), person = $list_alt5, person_2 = person.first(); !((NIL == person) && (NIL == participant)); participant = participant.rest() , participant_1 = participant.first() , person = person.rest() , person_2 = person.first()) {
                    if ($UNKNOWN != participant_1) {
                        pph_ensure_discourse_participant_rm(participant_1, person_2);
                    }
                }
                return $ENSURED;
            }
        }
    }

    /**
     * Make sure the speaker and addressee are registered, if known.
     */
    @LispMethod(comment = "Make sure the speaker and addressee are registered, if known.")
    public static SubLObject pph_ensure_discourse_participant_rms() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject participant = NIL;
        SubLObject participant_$1 = NIL;
        SubLObject person = NIL;
        SubLObject person_$2 = NIL;
        participant = list(pph_vars.$pph_speaker$.getDynamicValue(thread), pph_vars.$pph_addressee$.getDynamicValue(thread));
        participant_$1 = participant.first();
        person = $list6;
        person_$2 = person.first();
        while ((NIL != person) || (NIL != participant)) {
            if ($UNKNOWN != participant_$1) {
                pph_ensure_discourse_participant_rm(participant_$1, person_$2);
            }
            participant = participant.rest();
            participant_$1 = participant.first();
            person = person.rest();
            person_$2 = person.first();
        } 
        return $ENSURED;
    }

    /**
     * Return person info for CYCL, from lookup or based on semantics
     */
    @LispMethod(comment = "Return person info for CYCL, from lookup or based on semantics")
    public static final SubLObject pph_discourse_person_for_cycl_alt(SubLObject cycl) {
        {
            SubLObject ans = NIL;
            SubLObject rm = pph_discourse_rm_lookup(cycl);
            if (NIL != rm) {
                ans = pph_rm_person(rm, T);
            }
            return ans;
        }
    }

    /**
     * Return person info for CYCL, from lookup or based on semantics
     */
    @LispMethod(comment = "Return person info for CYCL, from lookup or based on semantics")
    public static SubLObject pph_discourse_person_for_cycl(final SubLObject cycl) {
        SubLObject ans = NIL;
        final SubLObject rm = pph_discourse_rm_lookup(cycl);
        if (NIL != rm) {
            ans = pph_rm_person(rm, T);
        }
        return ans;
    }

    /**
     * Return number info for CYCL, from lookup or based on semantics
     */
    @LispMethod(comment = "Return number info for CYCL, from lookup or based on semantics")
    public static final SubLObject pph_discourse_number_for_cycl_alt(SubLObject cycl) {
        {
            SubLObject ans = NIL;
            SubLObject rm = pph_discourse_rm_lookup(cycl);
            if (NIL != rm) {
                ans = pph_rm_number(rm, T);
            }
            return ans;
        }
    }

    /**
     * Return number info for CYCL, from lookup or based on semantics
     */
    @LispMethod(comment = "Return number info for CYCL, from lookup or based on semantics")
    public static SubLObject pph_discourse_number_for_cycl(final SubLObject cycl) {
        SubLObject ans = NIL;
        final SubLObject rm = pph_discourse_rm_lookup(cycl);
        if (NIL != rm) {
            ans = pph_rm_number(rm, T);
        }
        return ans;
    }

    public static SubLObject pph_discourse_phrases_for_cycl(final SubLObject cycl) {
        SubLObject ans = NIL;
        final SubLObject rm = pph_discourse_rm_lookup(cycl);
        if (NIL != rm) {
            ans = pph_rm_phrases(rm);
        }
        return ans;
    }

    public static SubLObject pph_count_previous_paraphrases(final SubLObject obj) {
        return length(pph_discourse_phrases_for_cycl(obj));
    }

    /**
     *
     *
     * @return BOOLEAN; Has CYCL been registered in the current discourse context?
     */
    @LispMethod(comment = "@return BOOLEAN; Has CYCL been registered in the current discourse context?")
    public static final SubLObject pph_discourse_referentP_alt(SubLObject cycl) {
        return subl_promotions.memberP(cycl, pph_discourse_context_rms(UNPROVIDED), symbol_function(EQUAL), PPH_RM_CYCL);
    }

    /**
     *
     *
     * @return BOOLEAN; Has CYCL been registered in the current discourse context?
     */
    @LispMethod(comment = "@return BOOLEAN; Has CYCL been registered in the current discourse context?")
    public static SubLObject pph_discourse_referentP(final SubLObject cycl) {
        return subl_promotions.memberP(cycl, pph_discourse_context_rms(UNPROVIDED), symbol_function(EQUAL), PPH_RM_CYCL);
    }

    /**
     * Is there an element of the current discourse context with the same person/number/gender as CYCL?
     */
    @LispMethod(comment = "Is there an element of the current discourse context with the same person/number/gender as CYCL?")
    public static final SubLObject any_competing_pph_rmP_alt(SubLObject cycl, SubLObject agr) {
        if (agr == UNPROVIDED) {
            agr = NIL;
        }
        return list_utilities.sublisp_boolean(find_competing_pph_rm(cycl, agr));
    }

    /**
     * Is there an element of the current discourse context with the same person/number/gender as CYCL?
     */
    @LispMethod(comment = "Is there an element of the current discourse context with the same person/number/gender as CYCL?")
    public static SubLObject any_competing_pph_rmP(final SubLObject cycl, SubLObject agr) {
        if (agr == UNPROVIDED) {
            agr = NIL;
        }
        return list_utilities.sublisp_boolean(find_competing_pph_rm(cycl, agr));
    }

    public static final SubLObject find_competing_pph_rm_alt(SubLObject cycl, SubLObject agr) {
        {
            SubLObject rival = NIL;
            if (NIL != pph_error.pph_trace_level_exceeds_minimumP(THREE_INTEGER)) {
                format(T, $str_alt9$__Looking_for_rival_for__S__S____, cycl, agr);
            }
            if (NIL == pph_methods_lexicon.pph_pronoun_agr_p(agr)) {
                agr = pph_methods_lexicon.new_unspecified_pph_pronoun_agr();
            }
            if (NIL == rival) {
                {
                    SubLObject csome_list_var = pph_discourse_context_rms(UNPROVIDED);
                    SubLObject rm = NIL;
                    for (rm = csome_list_var.first(); !((NIL != rival) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , rm = csome_list_var.first()) {
                        if (NIL != pph_error.pph_trace_level_exceeds_minimumP(THREE_INTEGER)) {
                            format(T, $str_alt10$__Checking__S_____, rm);
                        }
                        if ((NIL == pph_rm_has_cyclP(rm, cycl)) && (NIL != pph_rm_has_compatible_phi_featuresP(rm, cycl, agr))) {
                            rival = rm;
                            if (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) {
                                format(T, $str_alt11$___S_has_a_possible_antecedent_am, new SubLObject[]{ cycl, pph_rm_cycl(rm), rm });
                            }
                        }
                    }
                }
            }
            return rival;
        }
    }

    public static SubLObject find_competing_pph_rm(final SubLObject cycl, SubLObject agr) {
        SubLObject rival = NIL;
        if (NIL != pph_error.pph_trace_level_exceeds_minimumP(THREE_INTEGER)) {
            format_nil.force_format(T, $str10$__Looking_for_rival_for__S__S____, cycl, agr, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        if (NIL == pph_methods_lexicon.pph_pronoun_agr_p(agr)) {
            agr = pph_methods_lexicon.new_unspecified_pph_pronoun_agr();
        }
        if (NIL == rival) {
            SubLObject csome_list_var = pph_discourse_context_rms(UNPROVIDED);
            SubLObject rm = NIL;
            rm = csome_list_var.first();
            while ((NIL == rival) && (NIL != csome_list_var)) {
                if (NIL != pph_error.pph_trace_level_exceeds_minimumP(THREE_INTEGER)) {
                    format_nil.force_format(T, $str11$__Checking__S_____, rm, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                }
                if ((NIL == pph_rm_has_cyclP(rm, cycl)) && (NIL != pph_rm_has_compatible_phi_featuresP(rm, cycl, agr))) {
                    rival = rm;
                    if (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) {
                        format_nil.force_format(T, $str12$___S_has_a_possible_antecedent_am, cycl, pph_rm_cycl(rm), rm, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    }
                }
                csome_list_var = csome_list_var.rest();
                rm = csome_list_var.first();
            } 
        }
        return rival;
    }

    public static final SubLObject pph_rm_print_function_trampoline_alt(SubLObject v_object, SubLObject stream) {
        pph_pprint_rm(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject pph_rm_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        pph_pprint_rm(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject pph_rm_p_alt(SubLObject v_object) {
        return v_object.getClass() == com.cyc.cycjava.cycl.pph_drs.$pph_rm_native.class ? ((SubLObject) (T)) : NIL;
    }

    public static SubLObject pph_rm_p(final SubLObject v_object) {
        return v_object.getClass() == com.cyc.cycjava.cycl.pph_drs.$pph_rm_native.class ? T : NIL;
    }

    public static final SubLObject pph_rm_cycl_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, PPH_RM_P);
        return v_object.getField2();
    }

    public static SubLObject pph_rm_cycl(final SubLObject v_object) {
        assert NIL != pph_rm_p(v_object) : "! pph_drs.pph_rm_p(v_object) " + "pph_drs.pph_rm_p error :" + v_object;
        return v_object.getField2();
    }

    public static final SubLObject pph_rm_agr_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, PPH_RM_P);
        return v_object.getField3();
    }

    public static SubLObject pph_rm_agr(final SubLObject v_object) {
        assert NIL != pph_rm_p(v_object) : "! pph_drs.pph_rm_p(v_object) " + "pph_drs.pph_rm_p error :" + v_object;
        return v_object.getField3();
    }

    public static final SubLObject pph_rm_phrases_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, PPH_RM_P);
        return v_object.getField4();
    }

    public static SubLObject pph_rm_phrases(final SubLObject v_object) {
        assert NIL != pph_rm_p(v_object) : "! pph_drs.pph_rm_p(v_object) " + "pph_drs.pph_rm_p error :" + v_object;
        return v_object.getField4();
    }

    public static final SubLObject _csetf_pph_rm_cycl_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, PPH_RM_P);
        return v_object.setField2(value);
    }

    public static SubLObject _csetf_pph_rm_cycl(final SubLObject v_object, final SubLObject value) {
        assert NIL != pph_rm_p(v_object) : "! pph_drs.pph_rm_p(v_object) " + "pph_drs.pph_rm_p error :" + v_object;
        return v_object.setField2(value);
    }

    public static final SubLObject _csetf_pph_rm_agr_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, PPH_RM_P);
        return v_object.setField3(value);
    }

    public static SubLObject _csetf_pph_rm_agr(final SubLObject v_object, final SubLObject value) {
        assert NIL != pph_rm_p(v_object) : "! pph_drs.pph_rm_p(v_object) " + "pph_drs.pph_rm_p error :" + v_object;
        return v_object.setField3(value);
    }

    public static final SubLObject _csetf_pph_rm_phrases_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, PPH_RM_P);
        return v_object.setField4(value);
    }

    public static SubLObject _csetf_pph_rm_phrases(final SubLObject v_object, final SubLObject value) {
        assert NIL != pph_rm_p(v_object) : "! pph_drs.pph_rm_p(v_object) " + "pph_drs.pph_rm_p error :" + v_object;
        return v_object.setField4(value);
    }

    public static final SubLObject make_pph_rm_alt(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        {
            SubLObject v_new = new com.cyc.cycjava.cycl.pph_drs.$pph_rm_native();
            SubLObject next = NIL;
            for (next = arglist; NIL != next; next = cddr(next)) {
                {
                    SubLObject current_arg = next.first();
                    SubLObject current_value = cadr(next);
                    SubLObject pcase_var = current_arg;
                    if (pcase_var.eql($CYCL)) {
                        _csetf_pph_rm_cycl(v_new, current_value);
                    } else {
                        if (pcase_var.eql($AGR)) {
                            _csetf_pph_rm_agr(v_new, current_value);
                        } else {
                            if (pcase_var.eql($PHRASES)) {
                                _csetf_pph_rm_phrases(v_new, current_value);
                            } else {
                                Errors.error($str_alt28$Invalid_slot__S_for_construction_, current_arg);
                            }
                        }
                    }
                }
            }
            return v_new;
        }
    }

    public static SubLObject make_pph_rm(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new com.cyc.cycjava.cycl.pph_drs.$pph_rm_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
            current_arg = next.first();
            current_value = cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql($CYCL)) {
                _csetf_pph_rm_cycl(v_new, current_value);
            } else
                if (pcase_var.eql($AGR)) {
                    _csetf_pph_rm_agr(v_new, current_value);
                } else
                    if (pcase_var.eql($PHRASES)) {
                        _csetf_pph_rm_phrases(v_new, current_value);
                    } else {
                        Errors.error($str30$Invalid_slot__S_for_construction_, current_arg);
                    }


        }
        return v_new;
    }

    public static SubLObject visit_defstruct_pph_rm(final SubLObject obj, final SubLObject visitor_fn) {
        funcall(visitor_fn, obj, $BEGIN, MAKE_PPH_RM, THREE_INTEGER);
        funcall(visitor_fn, obj, $SLOT, $CYCL, pph_rm_cycl(obj));
        funcall(visitor_fn, obj, $SLOT, $AGR, pph_rm_agr(obj));
        funcall(visitor_fn, obj, $SLOT, $PHRASES, pph_rm_phrases(obj));
        funcall(visitor_fn, obj, $END, MAKE_PPH_RM, THREE_INTEGER);
        return obj;
    }

    public static SubLObject visit_defstruct_object_pph_rm_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_pph_rm(obj, visitor_fn);
    }

    public static final SubLObject pph_pprint_rm_alt(SubLObject rm, SubLObject stream, SubLObject depth) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (!((NIL != pph_error.$suspend_pph_type_checkingP$.getDynamicValue(thread)) || (NIL != pph_rm_p(rm)))) {
                {
                    SubLObject new_format_string = cconcatenate($str_alt29$_PPH_error_level_, new SubLObject[]{ format_nil_s_no_copy(ONE_INTEGER), $str_alt30$__, format_nil_a_no_copy(cconcatenate(format_nil_s_no_copy(rm), new SubLObject[]{ $str_alt31$_is_not_a_, format_nil_s_no_copy(PPH_RM_P) })) });
                    pph_error.pph_handle_error(new_format_string, list(EMPTY_SUBL_OBJECT_ARRAY));
                }
            }
            format(stream, $str_alt32$__PPH_RM___S__S__S_, new SubLObject[]{ pph_rm_cycl(rm), pph_rm_agr(rm), Mapping.mapcar(PPH_PHRASE_STRING, pph_rm_phrases(rm)) });
            return rm;
        }
    }

    public static SubLObject pph_pprint_rm(final SubLObject rm, final SubLObject stream, final SubLObject depth) {
        format(stream, $str36$__PPH_RM___S__S__S_, new SubLObject[]{ pph_rm_cycl(rm), pph_rm_agr(rm), Mapping.mapcar(PPH_STRING_IF_NON_NULL_TO_OUTPUT_FORMAT, Mapping.mapcar(PPH_PHRASE_STRING, list_utilities.remove_if_not(VALID_PPH_PHRASE_P, pph_rm_phrases(rm), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED))) });
        return rm;
    }

    public static final SubLObject new_pph_rm_alt(SubLObject cycl, SubLObject agr) {
        if (cycl == UNPROVIDED) {
            cycl = NIL;
        }
        if (agr == UNPROVIDED) {
            agr = NIL;
        }
        {
            SubLObject rm = make_pph_rm(UNPROVIDED);
            pph_rm_set_cycl(rm, cycl);
            if (NIL != agr) {
                pph_rm_set_agr(rm, agr);
            }
            return rm;
        }
    }

    public static SubLObject new_pph_rm(SubLObject cycl, SubLObject agr) {
        if (cycl == UNPROVIDED) {
            cycl = NIL;
        }
        if (agr == UNPROVIDED) {
            agr = NIL;
        }
        final SubLObject rm = make_pph_rm(UNPROVIDED);
        pph_rm_set_cycl(rm, cycl);
        if (NIL != agr) {
            pph_rm_set_agr(rm, agr);
        }
        return rm;
    }

    public static final SubLObject pph_rm_set_cycl_alt(SubLObject pph_rm, SubLObject cycl) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (!((NIL != pph_error.$suspend_pph_type_checkingP$.getDynamicValue(thread)) || (NIL != pph_rm_p(pph_rm)))) {
                {
                    SubLObject new_format_string = cconcatenate($str_alt29$_PPH_error_level_, new SubLObject[]{ format_nil_s_no_copy(ONE_INTEGER), $str_alt30$__, format_nil_a_no_copy(cconcatenate(format_nil_s_no_copy(pph_rm), new SubLObject[]{ $str_alt31$_is_not_a_, format_nil_s_no_copy(PPH_RM_P) })) });
                    pph_error.pph_handle_error(new_format_string, list(EMPTY_SUBL_OBJECT_ARRAY));
                }
            }
            _csetf_pph_rm_cycl(pph_rm, cycl);
            return pph_rm;
        }
    }

    public static SubLObject pph_rm_set_cycl(final SubLObject pph_rm, final SubLObject cycl) {
        _csetf_pph_rm_cycl(pph_rm, cycl);
        return pph_rm;
    }

    public static final SubLObject pph_rm_set_agr_alt(SubLObject pph_rm, SubLObject agr) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (!((NIL != pph_error.$suspend_pph_type_checkingP$.getDynamicValue(thread)) || (NIL != pph_rm_p(pph_rm)))) {
                {
                    SubLObject new_format_string = cconcatenate($str_alt29$_PPH_error_level_, new SubLObject[]{ format_nil_s_no_copy(ONE_INTEGER), $str_alt30$__, format_nil_a_no_copy(cconcatenate(format_nil_s_no_copy(pph_rm), new SubLObject[]{ $str_alt31$_is_not_a_, format_nil_s_no_copy(PPH_RM_P) })) });
                    pph_error.pph_handle_error(new_format_string, list(EMPTY_SUBL_OBJECT_ARRAY));
                }
            }
            if (!((NIL != pph_error.$suspend_pph_type_checkingP$.getDynamicValue(thread)) || (NIL != pph_methods_lexicon.pph_pronoun_agr_p(agr)))) {
                {
                    SubLObject new_format_string = cconcatenate($str_alt29$_PPH_error_level_, new SubLObject[]{ format_nil_s_no_copy(ONE_INTEGER), $str_alt30$__, format_nil_a_no_copy(cconcatenate(format_nil_s_no_copy(agr), new SubLObject[]{ $str_alt31$_is_not_a_, format_nil_s_no_copy(PPH_PRONOUN_AGR_P) })) });
                    pph_error.pph_handle_error(new_format_string, list(EMPTY_SUBL_OBJECT_ARRAY));
                }
            }
            _csetf_pph_rm_agr(pph_rm, agr);
            return pph_rm;
        }
    }

    public static SubLObject pph_rm_set_agr(final SubLObject pph_rm, final SubLObject agr) {
        _csetf_pph_rm_agr(pph_rm, agr);
        return pph_rm;
    }

    public static final SubLObject pph_rm_set_number_alt(SubLObject pph_rm, SubLObject number) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (!((NIL != pph_error.$suspend_pph_type_checkingP$.getDynamicValue(thread)) || (NIL != pph_rm_p(pph_rm)))) {
                {
                    SubLObject new_format_string = cconcatenate($str_alt29$_PPH_error_level_, new SubLObject[]{ format_nil_s_no_copy(ONE_INTEGER), $str_alt30$__, format_nil_a_no_copy(cconcatenate(format_nil_s_no_copy(pph_rm), new SubLObject[]{ $str_alt31$_is_not_a_, format_nil_s_no_copy(PPH_RM_P) })) });
                    pph_error.pph_handle_error(new_format_string, list(EMPTY_SUBL_OBJECT_ARRAY));
                }
            }
            if (!((NIL != pph_error.$suspend_pph_type_checkingP$.getDynamicValue(thread)) || (NIL != pph_methods_lexicon.pph_pronoun_agr_numberP(number)))) {
                {
                    SubLObject new_format_string = cconcatenate($str_alt29$_PPH_error_level_, new SubLObject[]{ format_nil_s_no_copy(ONE_INTEGER), $str_alt30$__, format_nil_a_no_copy(cconcatenate(format_nil_s_no_copy(number), new SubLObject[]{ $str_alt31$_is_not_a_, format_nil_s_no_copy($sym35$PPH_PRONOUN_AGR_NUMBER_) })) });
                    pph_error.pph_handle_error(new_format_string, list(EMPTY_SUBL_OBJECT_ARRAY));
                }
            }
            {
                SubLObject agr = pph_rm_agr(pph_rm);
                if (NIL != agr) {
                    pph_methods_lexicon.pph_pronoun_agr_set_number(agr, number);
                } else {
                    _csetf_pph_rm_agr(pph_rm, pph_methods_lexicon.new_pph_pronoun_agr(NIL, number, NIL));
                }
            }
            return pph_rm;
        }
    }

    public static SubLObject pph_rm_set_number(final SubLObject pph_rm, final SubLObject number) {
        final SubLObject agr = pph_rm_agr(pph_rm);
        if (NIL != agr) {
            pph_methods_lexicon.pph_pronoun_agr_set_number(agr, number);
        } else {
            _csetf_pph_rm_agr(pph_rm, pph_methods_lexicon.new_pph_pronoun_agr(NIL, number, NIL));
        }
        return pph_rm;
    }

    public static final SubLObject pph_rm_set_gender_alt(SubLObject pph_rm, SubLObject gender) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (!((NIL != pph_error.$suspend_pph_type_checkingP$.getDynamicValue(thread)) || (NIL != pph_rm_p(pph_rm)))) {
                {
                    SubLObject new_format_string = cconcatenate($str_alt29$_PPH_error_level_, new SubLObject[]{ format_nil_s_no_copy(ONE_INTEGER), $str_alt30$__, format_nil_a_no_copy(cconcatenate(format_nil_s_no_copy(pph_rm), new SubLObject[]{ $str_alt31$_is_not_a_, format_nil_s_no_copy(PPH_RM_P) })) });
                    pph_error.pph_handle_error(new_format_string, list(EMPTY_SUBL_OBJECT_ARRAY));
                }
            }
            if (!((NIL != pph_error.$suspend_pph_type_checkingP$.getDynamicValue(thread)) || (NIL != pph_methods_lexicon.pph_pronoun_agr_genderP(gender)))) {
                {
                    SubLObject new_format_string = cconcatenate($str_alt29$_PPH_error_level_, new SubLObject[]{ format_nil_s_no_copy(ONE_INTEGER), $str_alt30$__, format_nil_a_no_copy(cconcatenate(format_nil_s_no_copy(gender), new SubLObject[]{ $str_alt31$_is_not_a_, format_nil_s_no_copy($sym36$PPH_PRONOUN_AGR_GENDER_) })) });
                    pph_error.pph_handle_error(new_format_string, list(EMPTY_SUBL_OBJECT_ARRAY));
                }
            }
            {
                SubLObject agr = pph_rm_agr(pph_rm);
                if (NIL != agr) {
                    pph_methods_lexicon.pph_pronoun_agr_set_gender(agr, gender);
                } else {
                    _csetf_pph_rm_agr(pph_rm, pph_methods_lexicon.new_pph_pronoun_agr(NIL, NIL, gender));
                }
            }
            return pph_rm;
        }
    }

    public static SubLObject pph_rm_set_gender(final SubLObject pph_rm, final SubLObject gender) {
        final SubLObject agr = pph_rm_agr(pph_rm);
        if (NIL != agr) {
            pph_methods_lexicon.pph_pronoun_agr_set_gender(agr, gender);
        } else {
            _csetf_pph_rm_agr(pph_rm, pph_methods_lexicon.new_pph_pronoun_agr(NIL, NIL, gender));
        }
        return pph_rm;
    }

    public static final SubLObject pph_rm_set_person_alt(SubLObject pph_rm, SubLObject person) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (!((NIL != pph_error.$suspend_pph_type_checkingP$.getDynamicValue(thread)) || (NIL != pph_rm_p(pph_rm)))) {
                {
                    SubLObject new_format_string = cconcatenate($str_alt29$_PPH_error_level_, new SubLObject[]{ format_nil_s_no_copy(ONE_INTEGER), $str_alt30$__, format_nil_a_no_copy(cconcatenate(format_nil_s_no_copy(pph_rm), new SubLObject[]{ $str_alt31$_is_not_a_, format_nil_s_no_copy(PPH_RM_P) })) });
                    pph_error.pph_handle_error(new_format_string, list(EMPTY_SUBL_OBJECT_ARRAY));
                }
            }
            if (!((NIL != pph_error.$suspend_pph_type_checkingP$.getDynamicValue(thread)) || (NIL != pph_methods_lexicon.pph_pronoun_agr_personP(person)))) {
                {
                    SubLObject new_format_string = cconcatenate($str_alt29$_PPH_error_level_, new SubLObject[]{ format_nil_s_no_copy(ONE_INTEGER), $str_alt30$__, format_nil_a_no_copy(cconcatenate(format_nil_s_no_copy(person), new SubLObject[]{ $str_alt31$_is_not_a_, format_nil_s_no_copy($sym37$PPH_PRONOUN_AGR_PERSON_) })) });
                    pph_error.pph_handle_error(new_format_string, list(EMPTY_SUBL_OBJECT_ARRAY));
                }
            }
            {
                SubLObject agr = pph_rm_agr(pph_rm);
                if (NIL != agr) {
                    pph_methods_lexicon.pph_pronoun_agr_set_person(agr, person);
                } else {
                    _csetf_pph_rm_agr(pph_rm, pph_methods_lexicon.new_pph_pronoun_agr(person, NIL, NIL));
                }
            }
            return pph_rm;
        }
    }

    public static SubLObject pph_rm_set_person(final SubLObject pph_rm, final SubLObject person) {
        final SubLObject agr = pph_rm_agr(pph_rm);
        if (NIL != agr) {
            pph_methods_lexicon.pph_pronoun_agr_set_person(agr, person);
        } else {
            _csetf_pph_rm_agr(pph_rm, pph_methods_lexicon.new_pph_pronoun_agr(person, NIL, NIL));
        }
        return pph_rm;
    }

    public static final SubLObject pph_rm_add_phrase_alt(SubLObject pph_rm, SubLObject phrase) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (!((NIL != pph_error.$suspend_pph_type_checkingP$.getDynamicValue(thread)) || (NIL != pph_rm_p(pph_rm)))) {
                {
                    SubLObject new_format_string = cconcatenate($str_alt29$_PPH_error_level_, new SubLObject[]{ format_nil_s_no_copy(ONE_INTEGER), $str_alt30$__, format_nil_a_no_copy(cconcatenate(format_nil_s_no_copy(pph_rm), new SubLObject[]{ $str_alt31$_is_not_a_, format_nil_s_no_copy(PPH_RM_P) })) });
                    pph_error.pph_handle_error(new_format_string, list(EMPTY_SUBL_OBJECT_ARRAY));
                }
            }
            if (!((NIL != pph_error.$suspend_pph_type_checkingP$.getDynamicValue(thread)) || (NIL != pph_phrase.pph_phrase_p(phrase, UNPROVIDED)))) {
                {
                    SubLObject new_format_string = cconcatenate($str_alt29$_PPH_error_level_, new SubLObject[]{ format_nil_s_no_copy(ONE_INTEGER), $str_alt30$__, format_nil_a_no_copy(cconcatenate(format_nil_s_no_copy(phrase), new SubLObject[]{ $str_alt31$_is_not_a_, format_nil_s_no_copy(PPH_PHRASE_P) })) });
                    pph_error.pph_handle_error(new_format_string, list(EMPTY_SUBL_OBJECT_ARRAY));
                }
            }
            _csetf_pph_rm_phrases(pph_rm, cons(phrase, pph_rm_phrases(pph_rm)));
            return pph_rm;
        }
    }

    public static SubLObject pph_rm_add_phrase(final SubLObject pph_rm, final SubLObject phrase) {
        _csetf_pph_rm_phrases(pph_rm, cons(phrase, pph_rm_phrases(pph_rm)));
        _csetf_pph_rm_phrases(pph_rm, delete_duplicates(pph_rm_phrases(pph_rm), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
        return pph_rm;
    }

    public static SubLObject pph_rm_remove_phrase(final SubLObject pph_rm, final SubLObject phrase) {
        _csetf_pph_rm_phrases(pph_rm, delete(phrase, pph_rm_phrases(pph_rm), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
        return pph_rm;
    }

    /**
     *
     *
     * @return PPH-PRONOUN-AGR-PERSON?; the person agreement feature value of RM.
     */
    @LispMethod(comment = "@return PPH-PRONOUN-AGR-PERSON?; the person agreement feature value of RM.")
    public static final SubLObject pph_rm_person_alt(SubLObject rm, SubLObject compute_if_unknownP) {
        if (compute_if_unknownP == UNPROVIDED) {
            compute_if_unknownP = T;
        }
        if ((NIL != compute_if_unknownP) && (NIL != pph_rm_person_unknown_p(rm))) {
            pph_rm_update_agr_person(rm);
        }
        {
            SubLObject rm_agr = pph_rm_agr(rm);
            return pph_methods_lexicon.pph_pronoun_agr_person(rm_agr);
        }
    }

    /**
     *
     *
     * @return PPH-PRONOUN-AGR-PERSON?; the person agreement feature value of RM.
     */
    @LispMethod(comment = "@return PPH-PRONOUN-AGR-PERSON?; the person agreement feature value of RM.")
    public static SubLObject pph_rm_person(final SubLObject rm, SubLObject compute_if_unknownP) {
        if (compute_if_unknownP == UNPROVIDED) {
            compute_if_unknownP = T;
        }
        if ((NIL != compute_if_unknownP) && (NIL != pph_rm_person_unknown_p(rm))) {
            pph_rm_update_agr_person(rm);
        }
        final SubLObject rm_agr = pph_rm_agr(rm);
        return pph_methods_lexicon.pph_pronoun_agr_person(rm_agr);
    }

    public static final SubLObject pph_rm_person_unknown_p_alt(SubLObject rm) {
        {
            SubLObject rm_agr = pph_rm_agr(rm);
            return makeBoolean(NIL == pph_methods_lexicon.pph_pronoun_agr_personP(pph_methods_lexicon.pph_pronoun_agr_person(rm_agr)));
        }
    }

    public static SubLObject pph_rm_person_unknown_p(final SubLObject rm) {
        final SubLObject rm_agr = pph_rm_agr(rm);
        return makeBoolean(NIL == pph_methods_lexicon.pph_known_pronoun_agr_personP(pph_methods_lexicon.pph_pronoun_agr_person(rm_agr)));
    }

    public static final SubLObject pph_rm_update_agr_person_alt(SubLObject rm) {
        {
            SubLObject rm_agr = pph_rm_agr(rm);
            SubLObject rm_cycl = pph_rm_cycl(rm);
            SubLObject new_agr = pph_update_pronoun_agr_person_from_cycl(rm_agr, rm_cycl);
            pph_rm_set_agr(rm, new_agr);
        }
        return rm;
    }

    public static SubLObject pph_rm_update_agr_person(final SubLObject rm) {
        final SubLObject rm_agr = pph_rm_agr(rm);
        final SubLObject rm_cycl = pph_rm_cycl(rm);
        final SubLObject new_agr = pph_update_pronoun_agr_person_from_cycl(rm_agr, rm_cycl);
        pph_rm_set_agr(rm, new_agr);
        return rm;
    }

    public static final SubLObject pph_update_pronoun_agr_person_from_cycl_if_unknown_alt(SubLObject agr, SubLObject cycl) {
        if (NIL == pph_methods_lexicon.pph_pronoun_agr_personP(pph_methods_lexicon.pph_pronoun_agr_person(agr))) {
            pph_update_pronoun_agr_person_from_cycl(agr, cycl);
        }
        return agr;
    }

    public static SubLObject pph_update_pronoun_agr_person_from_cycl_if_unknown(final SubLObject agr, final SubLObject cycl) {
        if (NIL == pph_methods_lexicon.pph_pronoun_agr_personP(pph_methods_lexicon.pph_pronoun_agr_person(agr))) {
            pph_update_pronoun_agr_person_from_cycl(agr, cycl);
        }
        return agr;
    }

    /**
     *
     *
     * @return PPH-PRONOUN-AGR-P; Updating person slot on AGR based on CYCL.
     */
    @LispMethod(comment = "@return PPH-PRONOUN-AGR-P; Updating person slot on AGR based on CYCL.")
    public static final SubLObject pph_update_pronoun_agr_person_from_cycl_alt(SubLObject agr, SubLObject cycl) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (!((NIL != pph_error.$suspend_pph_type_checkingP$.getDynamicValue(thread)) || (NIL != pph_methods_lexicon.pph_pronoun_agr_p(agr)))) {
                {
                    SubLObject new_format_string = cconcatenate($str_alt29$_PPH_error_level_, new SubLObject[]{ format_nil_s_no_copy(ONE_INTEGER), $str_alt30$__, format_nil_a_no_copy(cconcatenate(format_nil_s_no_copy(agr), new SubLObject[]{ $str_alt31$_is_not_a_, format_nil_s_no_copy(PPH_PRONOUN_AGR_P) })) });
                    pph_error.pph_handle_error(new_format_string, list(EMPTY_SUBL_OBJECT_ARRAY));
                }
            }
            pph_methods_lexicon.pph_pronoun_agr_set_person(agr, pph_methods.pph_default_person());
            return agr;
        }
    }

    /**
     *
     *
     * @return PPH-PRONOUN-AGR-P; Updating person slot on AGR based on CYCL.
     */
    @LispMethod(comment = "@return PPH-PRONOUN-AGR-P; Updating person slot on AGR based on CYCL.")
    public static SubLObject pph_update_pronoun_agr_person_from_cycl(final SubLObject agr, final SubLObject cycl) {
        pph_methods_lexicon.pph_pronoun_agr_set_person(agr, pph_methods.pph_default_person());
        return agr;
    }

    /**
     *
     *
     * @return PPH-PRONOUN-AGR-NUMBER?; the number agreement feature value of RM.
     */
    @LispMethod(comment = "@return PPH-PRONOUN-AGR-NUMBER?; the number agreement feature value of RM.")
    public static final SubLObject pph_rm_number_alt(SubLObject rm, SubLObject compute_if_unknownP) {
        if (compute_if_unknownP == UNPROVIDED) {
            compute_if_unknownP = T;
        }
        if ((NIL != compute_if_unknownP) && (NIL != pph_rm_number_unknown_p(rm))) {
            pph_rm_update_agr_number(rm);
        }
        {
            SubLObject rm_agr = pph_rm_agr(rm);
            return pph_methods_lexicon.pph_pronoun_agr_number(rm_agr);
        }
    }

    /**
     *
     *
     * @return PPH-PRONOUN-AGR-NUMBER?; the number agreement feature value of RM.
     */
    @LispMethod(comment = "@return PPH-PRONOUN-AGR-NUMBER?; the number agreement feature value of RM.")
    public static SubLObject pph_rm_number(final SubLObject rm, SubLObject compute_if_unknownP) {
        if (compute_if_unknownP == UNPROVIDED) {
            compute_if_unknownP = T;
        }
        if ((NIL != compute_if_unknownP) && (NIL != pph_rm_number_unknown_p(rm))) {
            pph_rm_update_agr_number(rm);
        }
        final SubLObject rm_agr = pph_rm_agr(rm);
        return pph_methods_lexicon.pph_pronoun_agr_number(rm_agr);
    }

    public static final SubLObject pph_rm_number_unknown_p_alt(SubLObject rm) {
        {
            SubLObject rm_agr = pph_rm_agr(rm);
            return makeBoolean(NIL == pph_methods_lexicon.pph_pronoun_agr_numberP(pph_methods_lexicon.pph_pronoun_agr_number(rm_agr)));
        }
    }

    public static SubLObject pph_rm_number_unknown_p(final SubLObject rm) {
        final SubLObject rm_agr = pph_rm_agr(rm);
        return makeBoolean(NIL == pph_methods_lexicon.pph_known_pronoun_agr_numberP(pph_methods_lexicon.pph_pronoun_agr_number(rm_agr)));
    }

    public static final SubLObject pph_rm_update_agr_number_alt(SubLObject rm) {
        {
            SubLObject rm_agr = pph_rm_agr(rm);
            SubLObject rm_cycl = pph_rm_cycl(rm);
            SubLObject new_agr = pph_update_pronoun_agr_number_from_cycl(rm_agr, rm_cycl);
            pph_rm_set_agr(rm, new_agr);
        }
        return rm;
    }

    public static SubLObject pph_rm_update_agr_number(final SubLObject rm) {
        final SubLObject rm_agr = pph_rm_agr(rm);
        final SubLObject rm_cycl = pph_rm_cycl(rm);
        final SubLObject new_agr = pph_update_pronoun_agr_number_from_cycl(rm_agr, rm_cycl);
        pph_rm_set_agr(rm, new_agr);
        return rm;
    }

    public static final SubLObject pph_update_pronoun_agr_number_from_cycl_if_unknown_alt(SubLObject agr, SubLObject cycl) {
        if (NIL == pph_methods_lexicon.pph_pronoun_agr_numberP(pph_methods_lexicon.pph_pronoun_agr_number(agr))) {
            pph_update_pronoun_agr_number_from_cycl(agr, cycl);
        }
        return agr;
    }

    public static SubLObject pph_update_pronoun_agr_number_from_cycl_if_unknown(final SubLObject agr, final SubLObject cycl) {
        if (NIL == pph_methods_lexicon.pph_pronoun_agr_numberP(pph_methods_lexicon.pph_pronoun_agr_number(agr))) {
            pph_update_pronoun_agr_number_from_cycl(agr, cycl);
        }
        return agr;
    }

    /**
     *
     *
     * @return PPH-PRONOUN-AGR-P; Updating number slot on AGR based on CYCL.
     */
    @LispMethod(comment = "@return PPH-PRONOUN-AGR-P; Updating number slot on AGR based on CYCL.")
    public static final SubLObject pph_update_pronoun_agr_number_from_cycl_alt(SubLObject agr, SubLObject cycl) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (!((NIL != pph_error.$suspend_pph_type_checkingP$.getDynamicValue(thread)) || (NIL != pph_methods_lexicon.pph_pronoun_agr_p(agr)))) {
                {
                    SubLObject new_format_string = cconcatenate($str_alt29$_PPH_error_level_, new SubLObject[]{ format_nil_s_no_copy(ONE_INTEGER), $str_alt30$__, format_nil_a_no_copy(cconcatenate(format_nil_s_no_copy(agr), new SubLObject[]{ $str_alt31$_is_not_a_, format_nil_s_no_copy(PPH_PRONOUN_AGR_P) })) });
                    pph_error.pph_handle_error(new_format_string, list(EMPTY_SUBL_OBJECT_ARRAY));
                }
            }
            pph_methods_lexicon.pph_pronoun_agr_set_number(agr, pph_methods.pph_number_from_cycl(cycl));
            return agr;
        }
    }

    /**
     *
     *
     * @return PPH-PRONOUN-AGR-P; Updating number slot on AGR based on CYCL.
     */
    @LispMethod(comment = "@return PPH-PRONOUN-AGR-P; Updating number slot on AGR based on CYCL.")
    public static SubLObject pph_update_pronoun_agr_number_from_cycl(final SubLObject agr, final SubLObject cycl) {
        pph_methods_lexicon.pph_pronoun_agr_set_number(agr, pph_methods.pph_number_from_cycl(cycl));
        return agr;
    }

    /**
     *
     *
     * @return PPH-PRONOUN-AGR-GENDER?; the gender agreement feature value of RM.
     */
    @LispMethod(comment = "@return PPH-PRONOUN-AGR-GENDER?; the gender agreement feature value of RM.")
    public static final SubLObject pph_rm_gender_alt(SubLObject rm, SubLObject compute_if_unknownP) {
        if (compute_if_unknownP == UNPROVIDED) {
            compute_if_unknownP = T;
        }
        if ((NIL != compute_if_unknownP) && (NIL != pph_rm_gender_unknown_p(rm))) {
            pph_rm_update_agr_gender(rm);
        }
        {
            SubLObject rm_agr = pph_rm_agr(rm);
            return pph_methods_lexicon.pph_pronoun_agr_gender(rm_agr);
        }
    }

    /**
     *
     *
     * @return PPH-PRONOUN-AGR-GENDER?; the gender agreement feature value of RM.
     */
    @LispMethod(comment = "@return PPH-PRONOUN-AGR-GENDER?; the gender agreement feature value of RM.")
    public static SubLObject pph_rm_gender(final SubLObject rm, SubLObject compute_if_unknownP) {
        if (compute_if_unknownP == UNPROVIDED) {
            compute_if_unknownP = T;
        }
        if ((NIL != compute_if_unknownP) && (NIL != pph_rm_gender_unknown_p(rm))) {
            pph_rm_update_agr_gender(rm);
        }
        final SubLObject rm_agr = pph_rm_agr(rm);
        return pph_methods_lexicon.pph_pronoun_agr_gender(rm_agr);
    }

    public static final SubLObject pph_rm_gender_unknown_p_alt(SubLObject rm) {
        {
            SubLObject rm_agr = pph_rm_agr(rm);
            return makeBoolean(NIL == pph_methods_lexicon.pph_pronoun_agr_genderP(pph_methods_lexicon.pph_pronoun_agr_gender(rm_agr)));
        }
    }

    public static SubLObject pph_rm_gender_unknown_p(final SubLObject rm) {
        final SubLObject rm_agr = pph_rm_agr(rm);
        return makeBoolean(NIL == pph_methods_lexicon.pph_known_pronoun_agr_genderP(pph_methods_lexicon.pph_pronoun_agr_gender(rm_agr)));
    }

    public static final SubLObject pph_rm_update_agr_gender_alt(SubLObject rm) {
        {
            SubLObject rm_agr = pph_rm_agr(rm);
            SubLObject rm_cycl = pph_rm_cycl(rm);
            SubLObject new_agr = pph_update_pronoun_agr_gender_from_cycl(rm_agr, rm_cycl);
            pph_rm_set_agr(rm, new_agr);
        }
        return rm;
    }

    public static SubLObject pph_rm_update_agr_gender(final SubLObject rm) {
        final SubLObject rm_agr = pph_rm_agr(rm);
        final SubLObject rm_cycl = pph_rm_cycl(rm);
        final SubLObject new_agr = pph_update_pronoun_agr_gender_from_cycl(rm_agr, rm_cycl);
        pph_rm_set_agr(rm, new_agr);
        return rm;
    }

    public static final SubLObject pph_update_pronoun_agr_gender_from_cycl_if_unknown_alt(SubLObject agr, SubLObject cycl) {
        if (NIL == pph_methods_lexicon.pph_pronoun_agr_genderP(pph_methods_lexicon.pph_pronoun_agr_gender(agr))) {
            pph_update_pronoun_agr_gender_from_cycl(agr, cycl);
        }
        return agr;
    }

    public static SubLObject pph_update_pronoun_agr_gender_from_cycl_if_unknown(final SubLObject agr, final SubLObject cycl) {
        if (NIL == pph_methods_lexicon.pph_pronoun_agr_genderP(pph_methods_lexicon.pph_pronoun_agr_gender(agr))) {
            pph_update_pronoun_agr_gender_from_cycl(agr, cycl);
        }
        return agr;
    }

    /**
     *
     *
     * @return PPH-PRONOUN-AGR-P; Updating gender slot on AGR based on CYCL.
     */
    @LispMethod(comment = "@return PPH-PRONOUN-AGR-P; Updating gender slot on AGR based on CYCL.")
    public static final SubLObject pph_update_pronoun_agr_gender_from_cycl_alt(SubLObject agr, SubLObject cycl) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (!((NIL != pph_error.$suspend_pph_type_checkingP$.getDynamicValue(thread)) || (NIL != pph_methods_lexicon.pph_pronoun_agr_p(agr)))) {
                {
                    SubLObject new_format_string = cconcatenate($str_alt29$_PPH_error_level_, new SubLObject[]{ format_nil_s_no_copy(ONE_INTEGER), $str_alt30$__, format_nil_a_no_copy(cconcatenate(format_nil_s_no_copy(agr), new SubLObject[]{ $str_alt31$_is_not_a_, format_nil_s_no_copy(PPH_PRONOUN_AGR_P) })) });
                    pph_error.pph_handle_error(new_format_string, list(EMPTY_SUBL_OBJECT_ARRAY));
                }
            }
            pph_methods_lexicon.pph_pronoun_agr_set_gender(agr, pph_methods.pph_gender(cycl));
            return agr;
        }
    }

    /**
     *
     *
     * @return PPH-PRONOUN-AGR-P; Updating gender slot on AGR based on CYCL.
     */
    @LispMethod(comment = "@return PPH-PRONOUN-AGR-P; Updating gender slot on AGR based on CYCL.")
    public static SubLObject pph_update_pronoun_agr_gender_from_cycl(final SubLObject agr, final SubLObject cycl) {
        pph_methods_lexicon.pph_pronoun_agr_set_gender(agr, pph_methods.pph_gender(cycl));
        return agr;
    }

    public static final SubLObject pph_drs_print_function_trampoline_alt(SubLObject v_object, SubLObject stream) {
        pprint_pph_drs(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject pph_drs_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        pprint_pph_drs(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject pph_drs_p_alt(SubLObject v_object) {
        return v_object.getClass() == com.cyc.cycjava.cycl.pph_drs.$pph_drs_native.class ? ((SubLObject) (T)) : NIL;
    }

    public static SubLObject pph_drs_p(final SubLObject v_object) {
        return v_object.getClass() == com.cyc.cycjava.cycl.pph_drs.$pph_drs_native.class ? T : NIL;
    }

    public static final SubLObject pph_drs_rms_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, pph_drs.PPH_DRS_P);
        return (($pph_drs_native)v_object).$rms;
    }

    public static SubLObject pph_drs_rms(final SubLObject v_object) {
        assert NIL != pph_drs_p(v_object) : "! pph_drs.pph_drs_p(v_object) " + "pph_drs.pph_drs_p error :" + v_object;
        return v_object.getField2();
    }

    public static final SubLObject pph_drs_backward_looking_center_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, pph_drs.PPH_DRS_P);
        return (($pph_drs_native)v_object).$backward_looking_center;
    }

    public static SubLObject pph_drs_backward_looking_center(final SubLObject v_object) {
        assert NIL != pph_drs_p(v_object) : "! pph_drs.pph_drs_p(v_object) " + "pph_drs.pph_drs_p error :" + v_object;
        return v_object.getField3();
    }

    public static SubLObject pph_drs_id(final SubLObject v_object) {
        assert NIL != pph_drs_p(v_object) : "! pph_drs.pph_drs_p(v_object) " + "pph_drs.pph_drs_p error :" + v_object;
        return v_object.getField4();
    }

    public static final SubLObject _csetf_pph_drs_rms_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, pph_drs.PPH_DRS_P);
        return (($pph_drs_native)v_object).$rms = (value);
    }

    public static SubLObject _csetf_pph_drs_rms(final SubLObject v_object, final SubLObject value) {
        assert NIL != pph_drs_p(v_object) : "! pph_drs.pph_drs_p(v_object) " + "pph_drs.pph_drs_p error :" + v_object;
        return v_object.setField2(value);
    }

    public static final SubLObject _csetf_pph_drs_backward_looking_center_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, pph_drs.PPH_DRS_P);
        return (($pph_drs_native)v_object).$backward_looking_center = (value);
    }

    public static SubLObject _csetf_pph_drs_backward_looking_center(final SubLObject v_object, final SubLObject value) {
        assert NIL != pph_drs_p(v_object) : "! pph_drs.pph_drs_p(v_object) " + "pph_drs.pph_drs_p error :" + v_object;
        return v_object.setField3(value);
    }

    public static SubLObject _csetf_pph_drs_id(final SubLObject v_object, final SubLObject value) {
        assert NIL != pph_drs_p(v_object) : "! pph_drs.pph_drs_p(v_object) " + "pph_drs.pph_drs_p error :" + v_object;
        return v_object.setField4(value);
    }

    public static final SubLObject make_pph_drs_alt(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        {
            SubLObject v_new = new com.cyc.cycjava.cycl.pph_drs.$pph_drs_native();
            SubLObject next = NIL;
            for (next = arglist; NIL != next; next = cddr(next)) {
                {
                    SubLObject current_arg = next.first();
                    SubLObject current_value = cadr(next);
                    SubLObject pcase_var = current_arg;
                    if (pcase_var.eql($RMS)) {
                        _csetf_pph_drs_rms(v_new, current_value);
                    } else {
                        if (pcase_var.eql($BACKWARD_LOOKING_CENTER)) {
                            _csetf_pph_drs_backward_looking_center(v_new, current_value);
                        } else {
                            Errors.error($str_alt28$Invalid_slot__S_for_construction_, current_arg);
                        }
                    }
                }
            }
            return v_new;
        }
    }

    public static SubLObject make_pph_drs(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new com.cyc.cycjava.cycl.pph_drs.$pph_drs_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
            current_arg = next.first();
            current_value = cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql($RMS)) {
                _csetf_pph_drs_rms(v_new, current_value);
            } else
                if (pcase_var.eql($BACKWARD_LOOKING_CENTER)) {
                    _csetf_pph_drs_backward_looking_center(v_new, current_value);
                } else
                    if (pcase_var.eql($ID)) {
                        _csetf_pph_drs_id(v_new, current_value);
                    } else {
                        Errors.error($str30$Invalid_slot__S_for_construction_, current_arg);
                    }


        }
        return v_new;
    }

    public static SubLObject visit_defstruct_pph_drs(final SubLObject obj, final SubLObject visitor_fn) {
        funcall(visitor_fn, obj, $BEGIN, MAKE_PPH_DRS, THREE_INTEGER);
        funcall(visitor_fn, obj, $SLOT, $RMS, pph_drs_rms(obj));
        funcall(visitor_fn, obj, $SLOT, $BACKWARD_LOOKING_CENTER, pph_drs_backward_looking_center(obj));
        funcall(visitor_fn, obj, $SLOT, $ID, pph_drs_id(obj));
        funcall(visitor_fn, obj, $END, MAKE_PPH_DRS, THREE_INTEGER);
        return obj;
    }

    public static SubLObject visit_defstruct_object_pph_drs_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_pph_drs(obj, visitor_fn);
    }

    public static final SubLObject pprint_pph_drs_alt(SubLObject drs, SubLObject stream, SubLObject depth) {
        format(stream, $str_alt52$__PPH_DRS___S___S__, pph_drs_rms(drs), pph_drs_backward_looking_center(drs));
        return drs;
    }

    public static SubLObject pprint_pph_drs(final SubLObject drs, final SubLObject stream, final SubLObject depth) {
        format(stream, $str58$__PPH_DRS__S___S___S__, new SubLObject[]{ pph_drs_id(drs), pph_drs_rms(drs), pph_drs_backward_looking_center(drs) });
        return drs;
    }

    public static SubLObject make_pph_drs_with_id(SubLObject plist) {
        if (plist == UNPROVIDED) {
            plist = NIL;
        }
        final SubLObject drs = make_pph_drs(plist);
        _csetf_pph_drs_id(drs, integer_sequence_generator.integer_sequence_generator_next($pph_drs_id_generator$.getGlobalValue()));
        return drs;
    }

    public static final SubLObject set_pph_drs_backward_looking_center(SubLObject rm) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (!((NIL != pph_error.$suspend_pph_type_checkingP$.getDynamicValue(thread)) || (NIL != pph_rm_p(rm)))) {
                {
                    SubLObject new_format_string = cconcatenate($str_alt29$_PPH_error_level_, new SubLObject[]{ format_nil_s_no_copy(ONE_INTEGER), $str_alt30$__, format_nil_a_no_copy(cconcatenate(format_nil_s_no_copy(rm), new SubLObject[]{ $str_alt31$_is_not_a_, format_nil_s_no_copy(PPH_RM_P) })) });
                    pph_error.pph_handle_error(new_format_string, list(EMPTY_SUBL_OBJECT_ARRAY));
                }
            }
            if (NIL == subl_promotions.memberP(rm, pph_drs_rms(pph_vars.$pph_discourse_context$.getDynamicValue(thread)), UNPROVIDED, UNPROVIDED)) {
                {
                    SubLObject new_format_string = cconcatenate($str_alt29$_PPH_error_level_, new SubLObject[]{ format_nil_s_no_copy($str_alt53$Setting_backward_looking_center_t), $str_alt30$__, format_nil_a_no_copy(rm) });
                    pph_error.pph_handle_error(new_format_string, list(EMPTY_SUBL_OBJECT_ARRAY));
                }
            }
            _csetf_pph_drs_backward_looking_center(pph_vars.$pph_discourse_context$.getDynamicValue(thread), rm);
            if (NIL != pph_error.pph_trace_level_exceeds_minimumP(TWO_INTEGER)) {
                format(T, $str_alt54$Set_backward_looking_center_to__S, rm);
            }
            return pph_vars.$pph_discourse_context$.getDynamicValue(thread);
        }
    }

    public static SubLObject set_pph_drs_backward_looking_center(final SubLObject rm, SubLObject discourse_context) {
        if (discourse_context == UNPROVIDED) {
            discourse_context = pph_vars.$pph_discourse_context$.getDynamicValue();
        }
        if (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) {
            format_nil.force_format(T, $str59$Setting_BLC_for_DRS__S_____S, pph_drs_id(discourse_context), rm, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        if (NIL == subl_promotions.memberP(rm, pph_drs_rms(discourse_context), UNPROVIDED, UNPROVIDED)) {
            final SubLObject new_format_string = cconcatenate($str60$_PPH_error_level_, new SubLObject[]{ format_nil.format_nil_s_no_copy($str61$Setting_backward_looking_center_t), $str62$__, format_nil.format_nil_a_no_copy(rm) });
            pph_error.pph_handle_error(new_format_string, list(EMPTY_SUBL_OBJECT_ARRAY));
        }
        _csetf_pph_drs_backward_looking_center(discourse_context, rm);
        if (NIL != pph_error.pph_trace_level_exceeds_minimumP(TWO_INTEGER)) {
            format_nil.force_format(T, $str63$Set_backward_looking_center_to__S, rm, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        return discourse_context;
    }

    public static SubLObject remove_pph_drs_backward_looking_center(SubLObject discourse_context) {
        if (discourse_context == UNPROVIDED) {
            discourse_context = pph_vars.$pph_discourse_context$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) {
            format_nil.force_format(T, $str64$Removing_BLC_for_DRS__S, pph_drs_id(discourse_context), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        _csetf_pph_drs_backward_looking_center(discourse_context, NIL);
        return pph_vars.$pph_discourse_context$.getDynamicValue(thread);
    }

    public static final SubLObject get_pph_drs_backward_looking_center() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return pph_drs_backward_looking_center(pph_vars.$pph_discourse_context$.getDynamicValue(thread));
        }
    }

    public static SubLObject get_pph_drs_backward_looking_center(SubLObject discourse_context) {
        if (discourse_context == UNPROVIDED) {
            discourse_context = pph_vars.$pph_discourse_context$.getDynamicValue();
        }
        final SubLObject center_rm = pph_drs_backward_looking_center(discourse_context);
        final SubLObject center_rm_phrase = (NIL != center_rm) ? find_if(VALID_PPH_PHRASE_P, pph_rm_phrases(center_rm), UNPROVIDED, UNPROVIDED, UNPROVIDED) : NIL;
        if (NIL != center_rm_phrase) {
            return center_rm;
        }
        return NIL;
    }

    /**
     *
     *
     * @return LISTP of PPH-RMs.
     */
    @LispMethod(comment = "@return LISTP of PPH-RMs.")
    public static final SubLObject pph_discourse_context_rms_alt(SubLObject v_context) {
        if (v_context == UNPROVIDED) {
            v_context = pph_vars.$pph_discourse_context$.getDynamicValue();
        }
        return NIL != pph_drs_p(v_context) ? ((SubLObject) (pph_drs_rms(v_context))) : NIL;
    }

    /**
     *
     *
     * @return LISTP of PPH-RMs.
     */
    @LispMethod(comment = "@return LISTP of PPH-RMs.")
    public static SubLObject pph_discourse_context_rms(SubLObject v_context) {
        if (v_context == UNPROVIDED) {
            v_context = pph_vars.$pph_discourse_context$.getDynamicValue();
        }
        return NIL != pph_drs_p(v_context) ? pph_drs_rms(v_context) : NIL;
    }

    /**
     *
     *
     * @return PPH-RM or NIL for CYCL
     */
    @LispMethod(comment = "@return PPH-RM or NIL for CYCL")
    public static final SubLObject pph_discourse_rm_lookup_alt(SubLObject cycl) {
        return find(cycl, pph_discourse_context_rms(UNPROVIDED), symbol_function(EQUAL), PPH_RM_CYCL, UNPROVIDED, UNPROVIDED);
    }

    /**
     *
     *
     * @return PPH-RM or NIL for CYCL
     */
    @LispMethod(comment = "@return PPH-RM or NIL for CYCL")
    public static SubLObject pph_discourse_rm_lookup(final SubLObject cycl) {
        return find(cycl, pph_discourse_context_rms(UNPROVIDED), symbol_function(EQUAL), PPH_RM_CYCL, UNPROVIDED, UNPROVIDED);
    }

    /**
     * Make a new PPH-RM for CYCL, and add it to *pph-discourse-context*
     */
    @LispMethod(comment = "Make a new PPH-RM for CYCL, and add it to *pph-discourse-context*")
    public static final SubLObject pph_add_reference_marker_alt(SubLObject cycl, SubLObject agr) {
        if (agr == UNPROVIDED) {
            agr = pph_methods_lexicon.new_unspecified_pph_pronoun_agr();
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            pph_add_rm(new_pph_rm(cycl, agr));
            return pph_vars.$pph_discourse_context$.getDynamicValue(thread);
        }
    }

    @LispMethod(comment = "Make a new PPH-RM for CYCL, and add it to *pph-discourse-context*")
    public static SubLObject pph_add_reference_marker(final SubLObject cycl, SubLObject agr) {
        if (agr == UNPROVIDED) {
            agr = pph_methods_lexicon.new_unspecified_pph_pronoun_agr();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        pph_add_rm(new_pph_rm(cycl, agr));
        return pph_vars.$pph_discourse_context$.getDynamicValue(thread);
    }/**
     * Make a new PPH-RM for CYCL, and add it to *pph-discourse-context*
     */


    public static final SubLObject pph_ensure_rms_are_in_discourse_context_alt(SubLObject rms) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject cdolist_list_var = rms;
                SubLObject rm = NIL;
                for (rm = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , rm = cdolist_list_var.first()) {
                    pph_add_rm(rm);
                }
            }
            return pph_vars.$pph_discourse_context$.getDynamicValue(thread);
        }
    }

    public static SubLObject pph_ensure_rms_are_in_discourse_context(final SubLObject rms) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject cdolist_list_var = rms;
        SubLObject rm = NIL;
        rm = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            pph_add_rm(rm);
            cdolist_list_var = cdolist_list_var.rest();
            rm = cdolist_list_var.first();
        } 
        return pph_vars.$pph_discourse_context$.getDynamicValue(thread);
    }

    /**
     * Add RM to *pph-discourse-context*
     */
    @LispMethod(comment = "Add RM to *pph-discourse-context*")
    public static final SubLObject pph_add_rm_alt(SubLObject rm) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (!((NIL != pph_error.$suspend_pph_type_checkingP$.getDynamicValue(thread)) || (NIL != pph_drs_p(pph_vars.$pph_discourse_context$.getDynamicValue(thread))))) {
                {
                    SubLObject new_format_string = cconcatenate($str_alt29$_PPH_error_level_, new SubLObject[]{ format_nil_s_no_copy(ONE_INTEGER), $str_alt30$__, format_nil_a_no_copy(cconcatenate(format_nil_s_no_copy(pph_vars.$pph_discourse_context$.getDynamicValue(thread)), new SubLObject[]{ $str_alt31$_is_not_a_, format_nil_s_no_copy(PPH_DRS_P) })) });
                    pph_error.pph_handle_error(new_format_string, list(EMPTY_SUBL_OBJECT_ARRAY));
                }
            }
            {
                SubLObject item_var = rm;
                if (NIL == member(item_var, pph_drs_rms(pph_vars.$pph_discourse_context$.getDynamicValue(thread)), symbol_function(EQUALP), symbol_function(IDENTITY))) {
                    _csetf_pph_drs_rms(pph_vars.$pph_discourse_context$.getDynamicValue(thread), cons(item_var, pph_drs_rms(pph_vars.$pph_discourse_context$.getDynamicValue(thread))));
                }
            }
            return pph_vars.$pph_discourse_context$.getDynamicValue(thread);
        }
    }

    @LispMethod(comment = "Add RM to *pph-discourse-context*")
    public static SubLObject pph_add_rm(final SubLObject rm) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == member(rm, pph_drs_rms(pph_vars.$pph_discourse_context$.getDynamicValue(thread)), symbol_function(EQUALP), symbol_function(IDENTITY))) {
            _csetf_pph_drs_rms(pph_vars.$pph_discourse_context$.getDynamicValue(thread), cons(rm, pph_drs_rms(pph_vars.$pph_discourse_context$.getDynamicValue(thread))));
        }
        return pph_vars.$pph_discourse_context$.getDynamicValue(thread);
    }/**
     * Add RM to *pph-discourse-context*
     */


    public static final SubLObject pph_remove_rm_alt(SubLObject rm) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject rms = pph_discourse_context_rms(UNPROVIDED);
                SubLObject new_rms = remove(rm, rms, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                if (NIL != pph_drs_p(pph_vars.$pph_discourse_context$.getDynamicValue(thread))) {
                    if (NIL != pph_error.pph_trace_level_exceeds_minimumP(THREE_INTEGER)) {
                        format(T, $str_alt55$Removing_rm__S_from__pph_discours, rm, pph_vars.$pph_discourse_context$.getDynamicValue(thread));
                    }
                    _csetf_pph_drs_rms(pph_vars.$pph_discourse_context$.getDynamicValue(thread), new_rms);
                }
            }
            return pph_vars.$pph_discourse_context$.getDynamicValue(thread);
        }
    }

    public static SubLObject pph_remove_rm(final SubLObject rm) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject rms = pph_discourse_context_rms(UNPROVIDED);
        final SubLObject new_rms = remove(rm, rms, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        if (NIL != pph_drs_p(pph_vars.$pph_discourse_context$.getDynamicValue(thread))) {
            if (NIL != pph_error.pph_trace_level_exceeds_minimumP(THREE_INTEGER)) {
                format_nil.force_format(T, $str65$Removing_rm__S_from__pph_discours, rm, pph_vars.$pph_discourse_context$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            }
            _csetf_pph_drs_rms(pph_vars.$pph_discourse_context$.getDynamicValue(thread), new_rms);
        }
        return pph_vars.$pph_discourse_context$.getDynamicValue(thread);
    }

    public static final SubLObject pph_remove_rm_with_cycl_alt(SubLObject cycl) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject rm = pph_discourse_rm_lookup(cycl);
                pph_remove_rm(rm);
            }
            return pph_vars.$pph_discourse_context$.getDynamicValue(thread);
        }
    }

    public static SubLObject pph_remove_rm_with_cycl(final SubLObject cycl) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject rm = pph_discourse_rm_lookup(cycl);
        pph_remove_rm(rm);
        return pph_vars.$pph_discourse_context$.getDynamicValue(thread);
    }

    public static SubLObject remove_phrase_from_discourse_context(final SubLObject v_pph_phrase, SubLObject discourse_context) {
        if (discourse_context == UNPROVIDED) {
            discourse_context = pph_vars.$pph_discourse_context$.getDynamicValue();
        }
        if (NIL != discourse_context) {
            SubLObject doomed_rms = NIL;
            SubLObject cdolist_list_var = pph_drs_rms(discourse_context);
            SubLObject rm = NIL;
            rm = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if (NIL != subl_promotions.memberP(v_pph_phrase, pph_rm_phrases(rm), UNPROVIDED, UNPROVIDED)) {
                    pph_rm_remove_phrase(rm, v_pph_phrase);
                    if (NIL != list_utilities.empty_list_p(pph_rm_phrases(rm))) {
                        if (rm.eql(pph_drs_backward_looking_center(discourse_context))) {
                            remove_pph_drs_backward_looking_center(discourse_context);
                        }
                        doomed_rms = cons(rm, doomed_rms);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                rm = cdolist_list_var.first();
            } 
            cdolist_list_var = doomed_rms;
            rm = NIL;
            rm = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                pph_remove_rm(rm);
                cdolist_list_var = cdolist_list_var.rest();
                rm = cdolist_list_var.first();
            } 
        }
        return NIL;
    }

    /**
     * Ensure PARTICIPANT is registered with PERSON
     */
    @LispMethod(comment = "Ensure PARTICIPANT is registered with PERSON")
    public static final SubLObject pph_ensure_discourse_participant_rm_alt(SubLObject participant, SubLObject person) {
        if (NIL != pph_discourse_referentP(participant)) {
            {
                SubLObject rm = pph_discourse_rm_lookup(participant);
                SubLObject agr = pph_rm_agr(rm);
                SubLObject existing_person_info = (NIL != pph_methods_lexicon.pph_pronoun_agr_p(agr)) ? ((SubLObject) (pph_methods_lexicon.pph_pronoun_agr_person(agr))) : NIL;
                if (existing_person_info.equal(person)) {
                    return $ALREADY_REGISTERED;
                }
            }
        }
        return pph_add_discourse_participant_rm(participant, person);
    }

    @LispMethod(comment = "Ensure PARTICIPANT is registered with PERSON")
    public static SubLObject pph_ensure_discourse_participant_rm(final SubLObject participant, final SubLObject person) {
        if (NIL != pph_discourse_referentP(participant)) {
            final SubLObject rm = pph_discourse_rm_lookup(participant);
            final SubLObject agr = pph_rm_agr(rm);
            final SubLObject existing_person_info = (NIL != pph_methods_lexicon.pph_pronoun_agr_p(agr)) ? pph_methods_lexicon.pph_pronoun_agr_person(agr) : NIL;
            if (existing_person_info.equal(person)) {
                return $ALREADY_REGISTERED;
            }
        }
        return pph_add_discourse_participant_rm(participant, person);
    }/**
     * Ensure PARTICIPANT is registered with PERSON
     */


    /**
     * Register PARTICIPANT with PERSON
     */
    @LispMethod(comment = "Register PARTICIPANT with PERSON")
    public static final SubLObject pph_add_discourse_participant_rm_alt(SubLObject participant, SubLObject person) {
        {
            SubLObject number = NIL;
            SubLObject gender = NIL;
            SubLObject participant_agr = pph_methods_lexicon.new_pph_pronoun_agr(person, number, gender);
            pph_add_reference_marker(participant, participant_agr);
        }
        return $ADDED;
    }

    @LispMethod(comment = "Register PARTICIPANT with PERSON")
    public static SubLObject pph_add_discourse_participant_rm(final SubLObject participant, final SubLObject person) {
        final SubLObject number = NIL;
        final SubLObject gender = NIL;
        final SubLObject participant_agr = pph_methods_lexicon.new_pph_pronoun_agr(person, number, gender);
        pph_add_reference_marker(participant, participant_agr);
        return $ADDED;
    }/**
     * Register PARTICIPANT with PERSON
     */


    /**
     * Does AGR (updated as necessary from CYCL) have essentially the same phi features as RM, to the
     * extent that using a pronoun with AGR could be taken to refer to RM?
     */
    @LispMethod(comment = "Does AGR (updated as necessary from CYCL) have essentially the same phi features as RM, to the\r\nextent that using a pronoun with AGR could be taken to refer to RM?\nDoes AGR (updated as necessary from CYCL) have essentially the same phi features as RM, to the\nextent that using a pronoun with AGR could be taken to refer to RM?")
    public static final SubLObject pph_rm_has_compatible_phi_featuresP_alt(SubLObject rm, SubLObject cycl, SubLObject agr) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (!((NIL != pph_error.$suspend_pph_type_checkingP$.getDynamicValue(thread)) || (NIL != pph_methods_lexicon.pph_pronoun_agr_p(agr)))) {
                {
                    SubLObject new_format_string = cconcatenate($str_alt29$_PPH_error_level_, new SubLObject[]{ format_nil_s_no_copy(ONE_INTEGER), $str_alt30$__, format_nil_a_no_copy(cconcatenate(format_nil_s_no_copy(agr), new SubLObject[]{ $str_alt31$_is_not_a_, format_nil_s_no_copy(PPH_PRONOUN_AGR_P) })) });
                    pph_error.pph_handle_error(new_format_string, list(EMPTY_SUBL_OBJECT_ARRAY));
                }
            }
            if (NIL != pph_utilities.pph_english_contextP(UNPROVIDED)) {
                return makeBoolean(((NIL != pph_rm_has_compatible_personP(rm, cycl, agr)) && (NIL != pph_rm_has_compatible_numberP(rm, cycl, agr))) && (NIL != pph_rm_has_compatible_genderP(rm, cycl, agr)));
            } else {
                return NIL;
            }
        }
    }

    @LispMethod(comment = "Does AGR (updated as necessary from CYCL) have essentially the same phi features as RM, to the\r\nextent that using a pronoun with AGR could be taken to refer to RM?\nDoes AGR (updated as necessary from CYCL) have essentially the same phi features as RM, to the\nextent that using a pronoun with AGR could be taken to refer to RM?")
    public static SubLObject pph_rm_has_compatible_phi_featuresP(final SubLObject rm, final SubLObject cycl, final SubLObject agr) {
        if (NIL != pph_utilities.pph_english_contextP(UNPROVIDED)) {
            return makeBoolean(((NIL != pph_rm_has_compatible_personP(rm, cycl, agr)) && (NIL != pph_rm_has_compatible_numberP(rm, cycl, agr))) && (NIL != pph_rm_has_compatible_genderP(rm, cycl, agr)));
        }
        return NIL;
    }/**
     * Does AGR (updated as necessary from CYCL) have essentially the same phi features as RM, to the
     * extent that using a pronoun with AGR could be taken to refer to RM?
     */


    public static final SubLObject pph_rm_has_compatible_personP_alt(SubLObject rm, SubLObject cycl, SubLObject agr) {
        pph_update_pronoun_agr_person_from_cycl_if_unknown(agr, cycl);
        return eql(pph_rm_person(rm, UNPROVIDED), pph_methods_lexicon.pph_pronoun_agr_person(agr));
    }

    public static SubLObject pph_rm_has_compatible_personP(final SubLObject rm, final SubLObject cycl, final SubLObject agr) {
        pph_update_pronoun_agr_person_from_cycl_if_unknown(agr, cycl);
        return eql(pph_rm_person(rm, UNPROVIDED), pph_methods_lexicon.pph_pronoun_agr_person(agr));
    }

    public static final SubLObject pph_rm_has_compatible_numberP_alt(SubLObject rm, SubLObject cycl, SubLObject agr) {
        pph_update_pronoun_agr_number_from_cycl_if_unknown(agr, cycl);
        return eql(pph_rm_number(rm, UNPROVIDED), pph_methods_lexicon.pph_pronoun_agr_number(agr));
    }

    public static SubLObject pph_rm_has_compatible_numberP(final SubLObject rm, final SubLObject cycl, final SubLObject agr) {
        pph_update_pronoun_agr_number_from_cycl_if_unknown(agr, cycl);
        return eql(pph_rm_number(rm, UNPROVIDED), pph_methods_lexicon.pph_pronoun_agr_number(agr));
    }

    public static final SubLObject pph_rm_has_compatible_genderP_alt(SubLObject rm, SubLObject cycl, SubLObject agr) {
        pph_update_pronoun_agr_gender_from_cycl_if_unknown(agr, cycl);
        return pph_methods_lexicon.pph_genders_compatibleP(pph_rm_gender(rm, UNPROVIDED), pph_methods_lexicon.pph_pronoun_agr_gender(agr));
    }

    public static SubLObject pph_rm_has_compatible_genderP(final SubLObject rm, final SubLObject cycl, final SubLObject agr) {
        pph_update_pronoun_agr_gender_from_cycl_if_unknown(agr, cycl);
        return pph_methods_lexicon.pph_genders_compatibleP(pph_rm_gender(rm, UNPROVIDED), pph_methods_lexicon.pph_pronoun_agr_gender(agr));
    }

    public static final SubLObject pph_rm_has_cyclP_alt(SubLObject rm, SubLObject cycl) {
        return equal(cycl, pph_rm_cycl(rm));
    }

    public static SubLObject pph_rm_has_cyclP(final SubLObject rm, final SubLObject cycl) {
        return equal(cycl, pph_rm_cycl(rm));
    }

    public static final SubLObject pph_possibly_update_np_index_alt(SubLObject phrase) {
        {
            SubLObject cycl = pph_phrase.pph_phrase_cycl(phrase, UNPROVIDED);
            SubLObject category = pph_phrase.pph_phrase_category(phrase, UNPROVIDED);
            if ((NIL != pph_phrase_resolution.pph_category_ok_for_anaphorP(category)) || (NIL != cycl_grammar.cycl_variable_p(cycl))) {
                pph_possibly_add_reference_marker(cycl);
                {
                    SubLObject rm = pph_discourse_rm_lookup(cycl);
                    if (NIL != rm) {
                        pph_rm_add_phrase(rm, phrase);
                        if (NIL != pph_phrase.pph_phrase_subjectP(phrase)) {
                            set_pph_drs_backward_looking_center(rm);
                        }
                        {
                            SubLObject number = pph_number_attribute_from_phrase(phrase);
                            if (NIL != pph_error.pph_trace_level_exceeds_minimumP(TWO_INTEGER)) {
                                format(T, $str_alt58$Setting_number_of_reference_marke, rm, number);
                            }
                            pph_rm_set_number(rm, number);
                            pph_data_structures.pph_phrase_info_set(phrase, $INDEX, pph_rm_agr(rm));
                        }
                    }
                }
            }
            return phrase;
        }
    }

    public static SubLObject pph_possibly_update_np_index(final SubLObject phrase) {
        SubLObject cycl = pph_phrase.pph_phrase_cycl(phrase, UNPROVIDED);
        final SubLObject category = pph_phrase.pph_phrase_category(phrase, UNPROVIDED);
        if ((NIL != pph_utilities.pph_npP(category)) && (NIL != pph_phrase.pph_unknown_cycl_p(cycl))) {
            final SubLObject head = pph_phrase.pph_phrase_head_dtr(phrase);
            if (NIL != pph_phrase.pph_phrase_p(head, UNPROVIDED)) {
                if (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) {
                    format_nil.force_format(T, $str68$Getting_CycL_for_NP_from_head_dtr, pph_phrase.pph_phrase_cycl(head, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                }
                cycl = pph_phrase.pph_phrase_cycl(head, UNPROVIDED);
            }
        }
        if ((NIL != pph_phrase_resolution.pph_category_ok_for_anaphorP(category)) || (NIL != cycl_grammar.cycl_variable_p(cycl))) {
            pph_possibly_add_reference_marker(cycl);
            final SubLObject rm = pph_discourse_rm_lookup(cycl);
            if (NIL != rm) {
                pph_rm_add_phrase(rm, phrase);
                if ((NIL != pph_phrase.pph_phrase_subjectP(phrase)) || (NIL != pph_phrase.pph_phrase_subjectP(pph_phrase.pph_phrase_mother(phrase)))) {
                    set_pph_drs_backward_looking_center(rm, UNPROVIDED);
                }
                final SubLObject number = pph_number_attribute_from_phrase(phrase);
                if (NIL != pph_error.pph_trace_level_exceeds_minimumP(TWO_INTEGER)) {
                    format_nil.force_format(T, $str69$Setting_number_of_reference_marke, rm, number, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                }
                pph_rm_set_number(rm, number);
                pph_data_structures.pph_phrase_info_set(phrase, $INDEX, pph_rm_agr(rm));
            }
        }
        return phrase;
    }

    public static final SubLObject pph_anaphoric_to_backward_looking_centerP_alt(SubLObject cycl) {
        {
            SubLObject rm = pph_discourse_rm_lookup(cycl);
            return equal(rm, get_pph_drs_backward_looking_center());
        }
    }

    public static SubLObject pph_anaphoric_to_backward_looking_centerP(final SubLObject phrase) {
        final SubLObject cycl = pph_phrase.pph_phrase_cycl(phrase, UNPROVIDED);
        final SubLObject rm = pph_discourse_rm_lookup(cycl);
        final SubLObject blc = get_pph_drs_backward_looking_center(UNPROVIDED);
        return makeBoolean(rm.equal(blc) && (NIL != find_if(VALID_PPH_PHRASE_P, remove(phrase, pph_rm_phrases(rm), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED)));
    }

    public static final SubLObject pph_number_attribute_from_phrase_alt(SubLObject phrase) {
        {
            SubLObject agr_preds = pph_phrase.pph_phrase_agr_preds(phrase, UNPROVIDED);
            SubLObject numbers = NIL;
            if (agr_preds.isList()) {
                {
                    SubLObject cdolist_list_var = agr_preds;
                    SubLObject pred = NIL;
                    for (pred = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , pred = cdolist_list_var.first()) {
                        {
                            SubLObject number = pph_number_attribute_for_pred(pred);
                            if (NIL != number) {
                                numbers = cons(number, numbers);
                            }
                        }
                    }
                }
                numbers = delete_duplicates(numbers, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            }
            return NIL != list_utilities.singletonP(numbers) ? ((SubLObject) (numbers.first())) : NIL;
        }
    }

    public static SubLObject pph_number_attribute_from_phrase(final SubLObject phrase) {
        final SubLObject agr_preds = pph_phrase.pph_phrase_agr_preds(phrase, UNPROVIDED);
        SubLObject numbers = NIL;
        if (agr_preds.isList()) {
            SubLObject cdolist_list_var = agr_preds;
            SubLObject pred = NIL;
            pred = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                final SubLObject number = pph_number_attribute_for_pred(pred);
                if (NIL != number) {
                    numbers = cons(number, numbers);
                }
                cdolist_list_var = cdolist_list_var.rest();
                pred = cdolist_list_var.first();
            } 
            numbers = delete_duplicates(numbers, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        return NIL != list_utilities.singletonP(numbers) ? numbers.first() : NIL;
    }

    public static final SubLObject pph_number_attribute_for_pred_alt(SubLObject pred) {
        {
            SubLObject numbers = pph_utilities.pph_removal_ask_variable($sym60$_NUM, listS($$agrPredNumber, pred, $list_alt62), $$GeneralLexiconMt, UNPROVIDED);
            return NIL != numbers ? ((SubLObject) (numbers.first())) : NIL;
        }
    }

    public static SubLObject pph_number_attribute_for_pred(final SubLObject pred) {
        final SubLObject numbers = pph_utilities.pph_removal_ask_variable($sym71$_NUM, listS($$agrPredNumber, pred, $list73), $$GeneralLexiconMt, UNPROVIDED);
        return NIL != numbers ? numbers.first() : NIL;
    }

    public static final SubLObject declare_pph_drs_file_alt() {
        declareFunction("pph_discourse_context_p", "PPH-DISCOURSE-CONTEXT-P", 1, 0, false);
        declareFunction("new_pph_discourse_context", "NEW-PPH-DISCOURSE-CONTEXT", 0, 0, false);
        declareFunction("pph_discourse_context_copy", "PPH-DISCOURSE-CONTEXT-COPY", 0, 0, false);
        declareFunction("pph_possibly_add_reference_marker", "PPH-POSSIBLY-ADD-REFERENCE-MARKER", 1, 0, false);
        declareFunction("pph_ensure_discourse_participant_rms", "PPH-ENSURE-DISCOURSE-PARTICIPANT-RMS", 0, 0, false);
        declareFunction("pph_discourse_person_for_cycl", "PPH-DISCOURSE-PERSON-FOR-CYCL", 1, 0, false);
        declareFunction("pph_discourse_number_for_cycl", "PPH-DISCOURSE-NUMBER-FOR-CYCL", 1, 0, false);
        declareFunction("pph_discourse_referentP", "PPH-DISCOURSE-REFERENT?", 1, 0, false);
        declareFunction("any_competing_pph_rmP", "ANY-COMPETING-PPH-RM?", 1, 1, false);
        declareFunction("find_competing_pph_rm", "FIND-COMPETING-PPH-RM", 2, 0, false);
        declareFunction("pph_rm_print_function_trampoline", "PPH-RM-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction("pph_rm_p", "PPH-RM-P", 1, 0, false);
        new com.cyc.cycjava.cycl.pph_drs.$pph_rm_p$UnaryFunction();
        declareFunction("pph_rm_cycl", "PPH-RM-CYCL", 1, 0, false);
        new com.cyc.cycjava.cycl.pph_drs.$pph_rm_cycl$UnaryFunction();
        declareFunction("pph_rm_agr", "PPH-RM-AGR", 1, 0, false);
        declareFunction("pph_rm_phrases", "PPH-RM-PHRASES", 1, 0, false);
        declareFunction("_csetf_pph_rm_cycl", "_CSETF-PPH-RM-CYCL", 2, 0, false);
        declareFunction("_csetf_pph_rm_agr", "_CSETF-PPH-RM-AGR", 2, 0, false);
        declareFunction("_csetf_pph_rm_phrases", "_CSETF-PPH-RM-PHRASES", 2, 0, false);
        declareFunction("make_pph_rm", "MAKE-PPH-RM", 0, 1, false);
        declareFunction("pph_pprint_rm", "PPH-PPRINT-RM", 3, 0, false);
        declareFunction("new_pph_rm", "NEW-PPH-RM", 0, 2, false);
        declareFunction("pph_rm_set_cycl", "PPH-RM-SET-CYCL", 2, 0, false);
        declareFunction("pph_rm_set_agr", "PPH-RM-SET-AGR", 2, 0, false);
        declareFunction("pph_rm_set_number", "PPH-RM-SET-NUMBER", 2, 0, false);
        declareFunction("pph_rm_set_gender", "PPH-RM-SET-GENDER", 2, 0, false);
        declareFunction("pph_rm_set_person", "PPH-RM-SET-PERSON", 2, 0, false);
        declareFunction("pph_rm_add_phrase", "PPH-RM-ADD-PHRASE", 2, 0, false);
        declareFunction("pph_rm_person", "PPH-RM-PERSON", 1, 1, false);
        declareFunction("pph_rm_person_unknown_p", "PPH-RM-PERSON-UNKNOWN-P", 1, 0, false);
        declareFunction("pph_rm_update_agr_person", "PPH-RM-UPDATE-AGR-PERSON", 1, 0, false);
        declareFunction("pph_update_pronoun_agr_person_from_cycl_if_unknown", "PPH-UPDATE-PRONOUN-AGR-PERSON-FROM-CYCL-IF-UNKNOWN", 2, 0, false);
        declareFunction("pph_update_pronoun_agr_person_from_cycl", "PPH-UPDATE-PRONOUN-AGR-PERSON-FROM-CYCL", 2, 0, false);
        declareFunction("pph_rm_number", "PPH-RM-NUMBER", 1, 1, false);
        declareFunction("pph_rm_number_unknown_p", "PPH-RM-NUMBER-UNKNOWN-P", 1, 0, false);
        declareFunction("pph_rm_update_agr_number", "PPH-RM-UPDATE-AGR-NUMBER", 1, 0, false);
        declareFunction("pph_update_pronoun_agr_number_from_cycl_if_unknown", "PPH-UPDATE-PRONOUN-AGR-NUMBER-FROM-CYCL-IF-UNKNOWN", 2, 0, false);
        declareFunction("pph_update_pronoun_agr_number_from_cycl", "PPH-UPDATE-PRONOUN-AGR-NUMBER-FROM-CYCL", 2, 0, false);
        declareFunction("pph_rm_gender", "PPH-RM-GENDER", 1, 1, false);
        declareFunction("pph_rm_gender_unknown_p", "PPH-RM-GENDER-UNKNOWN-P", 1, 0, false);
        declareFunction("pph_rm_update_agr_gender", "PPH-RM-UPDATE-AGR-GENDER", 1, 0, false);
        declareFunction("pph_update_pronoun_agr_gender_from_cycl_if_unknown", "PPH-UPDATE-PRONOUN-AGR-GENDER-FROM-CYCL-IF-UNKNOWN", 2, 0, false);
        declareFunction("pph_update_pronoun_agr_gender_from_cycl", "PPH-UPDATE-PRONOUN-AGR-GENDER-FROM-CYCL", 2, 0, false);
        declareFunction("pph_drs_print_function_trampoline", "PPH-DRS-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction("pph_drs_p", "PPH-DRS-P", 1, 0, false);
        new com.cyc.cycjava.cycl.pph_drs.$pph_drs_p$UnaryFunction();
        declareFunction("pph_drs_rms", "PPH-DRS-RMS", 1, 0, false);
        declareFunction("pph_drs_backward_looking_center", "PPH-DRS-BACKWARD-LOOKING-CENTER", 1, 0, false);
        declareFunction("_csetf_pph_drs_rms", "_CSETF-PPH-DRS-RMS", 2, 0, false);
        declareFunction("_csetf_pph_drs_backward_looking_center", "_CSETF-PPH-DRS-BACKWARD-LOOKING-CENTER", 2, 0, false);
        declareFunction("make_pph_drs", "MAKE-PPH-DRS", 0, 1, false);
        declareFunction("pprint_pph_drs", "PPRINT-PPH-DRS", 3, 0, false);
        declareFunction("set_pph_drs_backward_looking_center", "SET-PPH-DRS-BACKWARD-LOOKING-CENTER", 1, 0, false);
        declareFunction("get_pph_drs_backward_looking_center", "GET-PPH-DRS-BACKWARD-LOOKING-CENTER", 0, 0, false);
        declareFunction("pph_discourse_context_rms", "PPH-DISCOURSE-CONTEXT-RMS", 0, 1, false);
        declareFunction("pph_discourse_rm_lookup", "PPH-DISCOURSE-RM-LOOKUP", 1, 0, false);
        declareFunction("pph_add_reference_marker", "PPH-ADD-REFERENCE-MARKER", 1, 1, false);
        declareFunction("pph_ensure_rms_are_in_discourse_context", "PPH-ENSURE-RMS-ARE-IN-DISCOURSE-CONTEXT", 1, 0, false);
        declareFunction("pph_add_rm", "PPH-ADD-RM", 1, 0, false);
        declareFunction("pph_remove_rm", "PPH-REMOVE-RM", 1, 0, false);
        declareFunction("pph_remove_rm_with_cycl", "PPH-REMOVE-RM-WITH-CYCL", 1, 0, false);
        declareFunction("pph_ensure_discourse_participant_rm", "PPH-ENSURE-DISCOURSE-PARTICIPANT-RM", 2, 0, false);
        declareFunction("pph_add_discourse_participant_rm", "PPH-ADD-DISCOURSE-PARTICIPANT-RM", 2, 0, false);
        declareFunction("pph_rm_has_compatible_phi_featuresP", "PPH-RM-HAS-COMPATIBLE-PHI-FEATURES?", 3, 0, false);
        declareFunction("pph_rm_has_compatible_personP", "PPH-RM-HAS-COMPATIBLE-PERSON?", 3, 0, false);
        declareFunction("pph_rm_has_compatible_numberP", "PPH-RM-HAS-COMPATIBLE-NUMBER?", 3, 0, false);
        declareFunction("pph_rm_has_compatible_genderP", "PPH-RM-HAS-COMPATIBLE-GENDER?", 3, 0, false);
        declareFunction("pph_rm_has_cyclP", "PPH-RM-HAS-CYCL?", 2, 0, false);
        declareFunction("pph_possibly_update_np_index", "PPH-POSSIBLY-UPDATE-NP-INDEX", 1, 0, false);
        declareFunction("pph_anaphoric_to_backward_looking_centerP", "PPH-ANAPHORIC-TO-BACKWARD-LOOKING-CENTER?", 1, 0, false);
        declareFunction("pph_number_attribute_from_phrase", "PPH-NUMBER-ATTRIBUTE-FROM-PHRASE", 1, 0, false);
        declareFunction("pph_number_attribute_for_pred", "PPH-NUMBER-ATTRIBUTE-FOR-PRED", 1, 0, false);
        return NIL;
    }

    public static SubLObject declare_pph_drs_file() {
        if (SubLFiles.USE_V1) {
            declareFunction("pph_discourse_context_p", "PPH-DISCOURSE-CONTEXT-P", 1, 0, false);
            declareFunction("new_pph_discourse_context", "NEW-PPH-DISCOURSE-CONTEXT", 0, 0, false);
            declareFunction("pph_discourse_context_copy", "PPH-DISCOURSE-CONTEXT-COPY", 0, 0, false);
            declareFunction("pph_possibly_add_reference_marker", "PPH-POSSIBLY-ADD-REFERENCE-MARKER", 1, 0, false);
            declareFunction("pph_ensure_discourse_participant_rms", "PPH-ENSURE-DISCOURSE-PARTICIPANT-RMS", 0, 0, false);
            declareFunction("pph_discourse_person_for_cycl", "PPH-DISCOURSE-PERSON-FOR-CYCL", 1, 0, false);
            declareFunction("pph_discourse_number_for_cycl", "PPH-DISCOURSE-NUMBER-FOR-CYCL", 1, 0, false);
            declareFunction("pph_discourse_phrases_for_cycl", "PPH-DISCOURSE-PHRASES-FOR-CYCL", 1, 0, false);
            declareFunction("pph_count_previous_paraphrases", "PPH-COUNT-PREVIOUS-PARAPHRASES", 1, 0, false);
            declareFunction("pph_discourse_referentP", "PPH-DISCOURSE-REFERENT?", 1, 0, false);
            declareFunction("any_competing_pph_rmP", "ANY-COMPETING-PPH-RM?", 1, 1, false);
            declareFunction("find_competing_pph_rm", "FIND-COMPETING-PPH-RM", 2, 0, false);
            declareFunction("pph_rm_print_function_trampoline", "PPH-RM-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
            declareFunction("pph_rm_p", "PPH-RM-P", 1, 0, false);
            new pph_drs.$pph_rm_p$UnaryFunction();
            declareFunction("pph_rm_cycl", "PPH-RM-CYCL", 1, 0, false);
            new pph_drs.$pph_rm_cycl$UnaryFunction();
            declareFunction("pph_rm_agr", "PPH-RM-AGR", 1, 0, false);
            declareFunction("pph_rm_phrases", "PPH-RM-PHRASES", 1, 0, false);
            declareFunction("_csetf_pph_rm_cycl", "_CSETF-PPH-RM-CYCL", 2, 0, false);
            declareFunction("_csetf_pph_rm_agr", "_CSETF-PPH-RM-AGR", 2, 0, false);
            declareFunction("_csetf_pph_rm_phrases", "_CSETF-PPH-RM-PHRASES", 2, 0, false);
            declareFunction("make_pph_rm", "MAKE-PPH-RM", 0, 1, false);
            declareFunction("visit_defstruct_pph_rm", "VISIT-DEFSTRUCT-PPH-RM", 2, 0, false);
            declareFunction("visit_defstruct_object_pph_rm_method", "VISIT-DEFSTRUCT-OBJECT-PPH-RM-METHOD", 2, 0, false);
            declareFunction("pph_pprint_rm", "PPH-PPRINT-RM", 3, 0, false);
            declareFunction("new_pph_rm", "NEW-PPH-RM", 0, 2, false);
            declareFunction("pph_rm_set_cycl", "PPH-RM-SET-CYCL", 2, 0, false);
            declareFunction("pph_rm_set_agr", "PPH-RM-SET-AGR", 2, 0, false);
            declareFunction("pph_rm_set_number", "PPH-RM-SET-NUMBER", 2, 0, false);
            declareFunction("pph_rm_set_gender", "PPH-RM-SET-GENDER", 2, 0, false);
            declareFunction("pph_rm_set_person", "PPH-RM-SET-PERSON", 2, 0, false);
            declareFunction("pph_rm_add_phrase", "PPH-RM-ADD-PHRASE", 2, 0, false);
            declareFunction("pph_rm_remove_phrase", "PPH-RM-REMOVE-PHRASE", 2, 0, false);
            declareFunction("pph_rm_person", "PPH-RM-PERSON", 1, 1, false);
            declareFunction("pph_rm_person_unknown_p", "PPH-RM-PERSON-UNKNOWN-P", 1, 0, false);
            declareFunction("pph_rm_update_agr_person", "PPH-RM-UPDATE-AGR-PERSON", 1, 0, false);
            declareFunction("pph_update_pronoun_agr_person_from_cycl_if_unknown", "PPH-UPDATE-PRONOUN-AGR-PERSON-FROM-CYCL-IF-UNKNOWN", 2, 0, false);
            declareFunction("pph_update_pronoun_agr_person_from_cycl", "PPH-UPDATE-PRONOUN-AGR-PERSON-FROM-CYCL", 2, 0, false);
            declareFunction("pph_rm_number", "PPH-RM-NUMBER", 1, 1, false);
            declareFunction("pph_rm_number_unknown_p", "PPH-RM-NUMBER-UNKNOWN-P", 1, 0, false);
            declareFunction("pph_rm_update_agr_number", "PPH-RM-UPDATE-AGR-NUMBER", 1, 0, false);
            declareFunction("pph_update_pronoun_agr_number_from_cycl_if_unknown", "PPH-UPDATE-PRONOUN-AGR-NUMBER-FROM-CYCL-IF-UNKNOWN", 2, 0, false);
            declareFunction("pph_update_pronoun_agr_number_from_cycl", "PPH-UPDATE-PRONOUN-AGR-NUMBER-FROM-CYCL", 2, 0, false);
            declareFunction("pph_rm_gender", "PPH-RM-GENDER", 1, 1, false);
            declareFunction("pph_rm_gender_unknown_p", "PPH-RM-GENDER-UNKNOWN-P", 1, 0, false);
            declareFunction("pph_rm_update_agr_gender", "PPH-RM-UPDATE-AGR-GENDER", 1, 0, false);
            declareFunction("pph_update_pronoun_agr_gender_from_cycl_if_unknown", "PPH-UPDATE-PRONOUN-AGR-GENDER-FROM-CYCL-IF-UNKNOWN", 2, 0, false);
            declareFunction("pph_update_pronoun_agr_gender_from_cycl", "PPH-UPDATE-PRONOUN-AGR-GENDER-FROM-CYCL", 2, 0, false);
            declareFunction("pph_drs_print_function_trampoline", "PPH-DRS-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
            declareFunction("pph_drs_p", "PPH-DRS-P", 1, 0, false);
            new pph_drs.$pph_drs_p$UnaryFunction();
            declareFunction("pph_drs_rms", "PPH-DRS-RMS", 1, 0, false);
            declareFunction("pph_drs_backward_looking_center", "PPH-DRS-BACKWARD-LOOKING-CENTER", 1, 0, false);
            declareFunction("pph_drs_id", "PPH-DRS-ID", 1, 0, false);
            declareFunction("_csetf_pph_drs_rms", "_CSETF-PPH-DRS-RMS", 2, 0, false);
            declareFunction("_csetf_pph_drs_backward_looking_center", "_CSETF-PPH-DRS-BACKWARD-LOOKING-CENTER", 2, 0, false);
            declareFunction("_csetf_pph_drs_id", "_CSETF-PPH-DRS-ID", 2, 0, false);
            declareFunction("make_pph_drs", "MAKE-PPH-DRS", 0, 1, false);
            declareFunction("visit_defstruct_pph_drs", "VISIT-DEFSTRUCT-PPH-DRS", 2, 0, false);
            declareFunction("visit_defstruct_object_pph_drs_method", "VISIT-DEFSTRUCT-OBJECT-PPH-DRS-METHOD", 2, 0, false);
            declareFunction("pprint_pph_drs", "PPRINT-PPH-DRS", 3, 0, false);
            declareFunction("make_pph_drs_with_id", "MAKE-PPH-DRS-WITH-ID", 0, 1, false);
            declareFunction("set_pph_drs_backward_looking_center", "SET-PPH-DRS-BACKWARD-LOOKING-CENTER", 1, 1, false);
            declareFunction("remove_pph_drs_backward_looking_center", "REMOVE-PPH-DRS-BACKWARD-LOOKING-CENTER", 0, 1, false);
            declareFunction("get_pph_drs_backward_looking_center", "GET-PPH-DRS-BACKWARD-LOOKING-CENTER", 0, 1, false);
            declareFunction("pph_discourse_context_rms", "PPH-DISCOURSE-CONTEXT-RMS", 0, 1, false);
            declareFunction("pph_discourse_rm_lookup", "PPH-DISCOURSE-RM-LOOKUP", 1, 0, false);
            declareFunction("pph_add_reference_marker", "PPH-ADD-REFERENCE-MARKER", 1, 1, false);
            declareFunction("pph_ensure_rms_are_in_discourse_context", "PPH-ENSURE-RMS-ARE-IN-DISCOURSE-CONTEXT", 1, 0, false);
            declareFunction("pph_add_rm", "PPH-ADD-RM", 1, 0, false);
            declareFunction("pph_remove_rm", "PPH-REMOVE-RM", 1, 0, false);
            declareFunction("pph_remove_rm_with_cycl", "PPH-REMOVE-RM-WITH-CYCL", 1, 0, false);
            declareFunction("remove_phrase_from_discourse_context", "REMOVE-PHRASE-FROM-DISCOURSE-CONTEXT", 1, 1, false);
            declareFunction("pph_ensure_discourse_participant_rm", "PPH-ENSURE-DISCOURSE-PARTICIPANT-RM", 2, 0, false);
            declareFunction("pph_add_discourse_participant_rm", "PPH-ADD-DISCOURSE-PARTICIPANT-RM", 2, 0, false);
            declareFunction("pph_rm_has_compatible_phi_featuresP", "PPH-RM-HAS-COMPATIBLE-PHI-FEATURES?", 3, 0, false);
            declareFunction("pph_rm_has_compatible_personP", "PPH-RM-HAS-COMPATIBLE-PERSON?", 3, 0, false);
            declareFunction("pph_rm_has_compatible_numberP", "PPH-RM-HAS-COMPATIBLE-NUMBER?", 3, 0, false);
            declareFunction("pph_rm_has_compatible_genderP", "PPH-RM-HAS-COMPATIBLE-GENDER?", 3, 0, false);
            declareFunction("pph_rm_has_cyclP", "PPH-RM-HAS-CYCL?", 2, 0, false);
            declareFunction("pph_possibly_update_np_index", "PPH-POSSIBLY-UPDATE-NP-INDEX", 1, 0, false);
            declareFunction("pph_anaphoric_to_backward_looking_centerP", "PPH-ANAPHORIC-TO-BACKWARD-LOOKING-CENTER?", 1, 0, false);
            declareFunction("pph_number_attribute_from_phrase", "PPH-NUMBER-ATTRIBUTE-FROM-PHRASE", 1, 0, false);
            declareFunction("pph_number_attribute_for_pred", "PPH-NUMBER-ATTRIBUTE-FOR-PRED", 1, 0, false);
        }
        if (SubLFiles.USE_V2) {
            declareFunction("set_pph_drs_backward_looking_center", "SET-PPH-DRS-BACKWARD-LOOKING-CENTER", 1, 0, false);
            declareFunction("get_pph_drs_backward_looking_center", "GET-PPH-DRS-BACKWARD-LOOKING-CENTER", 0, 0, false);
        }
        return NIL;
    }

    public static SubLObject declare_pph_drs_file_Previous() {
        declareFunction("pph_discourse_context_p", "PPH-DISCOURSE-CONTEXT-P", 1, 0, false);
        declareFunction("new_pph_discourse_context", "NEW-PPH-DISCOURSE-CONTEXT", 0, 0, false);
        declareFunction("pph_discourse_context_copy", "PPH-DISCOURSE-CONTEXT-COPY", 0, 0, false);
        declareFunction("pph_possibly_add_reference_marker", "PPH-POSSIBLY-ADD-REFERENCE-MARKER", 1, 0, false);
        declareFunction("pph_ensure_discourse_participant_rms", "PPH-ENSURE-DISCOURSE-PARTICIPANT-RMS", 0, 0, false);
        declareFunction("pph_discourse_person_for_cycl", "PPH-DISCOURSE-PERSON-FOR-CYCL", 1, 0, false);
        declareFunction("pph_discourse_number_for_cycl", "PPH-DISCOURSE-NUMBER-FOR-CYCL", 1, 0, false);
        declareFunction("pph_discourse_phrases_for_cycl", "PPH-DISCOURSE-PHRASES-FOR-CYCL", 1, 0, false);
        declareFunction("pph_count_previous_paraphrases", "PPH-COUNT-PREVIOUS-PARAPHRASES", 1, 0, false);
        declareFunction("pph_discourse_referentP", "PPH-DISCOURSE-REFERENT?", 1, 0, false);
        declareFunction("any_competing_pph_rmP", "ANY-COMPETING-PPH-RM?", 1, 1, false);
        declareFunction("find_competing_pph_rm", "FIND-COMPETING-PPH-RM", 2, 0, false);
        declareFunction("pph_rm_print_function_trampoline", "PPH-RM-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction("pph_rm_p", "PPH-RM-P", 1, 0, false);
        new pph_drs.$pph_rm_p$UnaryFunction();
        declareFunction("pph_rm_cycl", "PPH-RM-CYCL", 1, 0, false);
        new pph_drs.$pph_rm_cycl$UnaryFunction();
        declareFunction("pph_rm_agr", "PPH-RM-AGR", 1, 0, false);
        declareFunction("pph_rm_phrases", "PPH-RM-PHRASES", 1, 0, false);
        declareFunction("_csetf_pph_rm_cycl", "_CSETF-PPH-RM-CYCL", 2, 0, false);
        declareFunction("_csetf_pph_rm_agr", "_CSETF-PPH-RM-AGR", 2, 0, false);
        declareFunction("_csetf_pph_rm_phrases", "_CSETF-PPH-RM-PHRASES", 2, 0, false);
        declareFunction("make_pph_rm", "MAKE-PPH-RM", 0, 1, false);
        declareFunction("visit_defstruct_pph_rm", "VISIT-DEFSTRUCT-PPH-RM", 2, 0, false);
        declareFunction("visit_defstruct_object_pph_rm_method", "VISIT-DEFSTRUCT-OBJECT-PPH-RM-METHOD", 2, 0, false);
        declareFunction("pph_pprint_rm", "PPH-PPRINT-RM", 3, 0, false);
        declareFunction("new_pph_rm", "NEW-PPH-RM", 0, 2, false);
        declareFunction("pph_rm_set_cycl", "PPH-RM-SET-CYCL", 2, 0, false);
        declareFunction("pph_rm_set_agr", "PPH-RM-SET-AGR", 2, 0, false);
        declareFunction("pph_rm_set_number", "PPH-RM-SET-NUMBER", 2, 0, false);
        declareFunction("pph_rm_set_gender", "PPH-RM-SET-GENDER", 2, 0, false);
        declareFunction("pph_rm_set_person", "PPH-RM-SET-PERSON", 2, 0, false);
        declareFunction("pph_rm_add_phrase", "PPH-RM-ADD-PHRASE", 2, 0, false);
        declareFunction("pph_rm_remove_phrase", "PPH-RM-REMOVE-PHRASE", 2, 0, false);
        declareFunction("pph_rm_person", "PPH-RM-PERSON", 1, 1, false);
        declareFunction("pph_rm_person_unknown_p", "PPH-RM-PERSON-UNKNOWN-P", 1, 0, false);
        declareFunction("pph_rm_update_agr_person", "PPH-RM-UPDATE-AGR-PERSON", 1, 0, false);
        declareFunction("pph_update_pronoun_agr_person_from_cycl_if_unknown", "PPH-UPDATE-PRONOUN-AGR-PERSON-FROM-CYCL-IF-UNKNOWN", 2, 0, false);
        declareFunction("pph_update_pronoun_agr_person_from_cycl", "PPH-UPDATE-PRONOUN-AGR-PERSON-FROM-CYCL", 2, 0, false);
        declareFunction("pph_rm_number", "PPH-RM-NUMBER", 1, 1, false);
        declareFunction("pph_rm_number_unknown_p", "PPH-RM-NUMBER-UNKNOWN-P", 1, 0, false);
        declareFunction("pph_rm_update_agr_number", "PPH-RM-UPDATE-AGR-NUMBER", 1, 0, false);
        declareFunction("pph_update_pronoun_agr_number_from_cycl_if_unknown", "PPH-UPDATE-PRONOUN-AGR-NUMBER-FROM-CYCL-IF-UNKNOWN", 2, 0, false);
        declareFunction("pph_update_pronoun_agr_number_from_cycl", "PPH-UPDATE-PRONOUN-AGR-NUMBER-FROM-CYCL", 2, 0, false);
        declareFunction("pph_rm_gender", "PPH-RM-GENDER", 1, 1, false);
        declareFunction("pph_rm_gender_unknown_p", "PPH-RM-GENDER-UNKNOWN-P", 1, 0, false);
        declareFunction("pph_rm_update_agr_gender", "PPH-RM-UPDATE-AGR-GENDER", 1, 0, false);
        declareFunction("pph_update_pronoun_agr_gender_from_cycl_if_unknown", "PPH-UPDATE-PRONOUN-AGR-GENDER-FROM-CYCL-IF-UNKNOWN", 2, 0, false);
        declareFunction("pph_update_pronoun_agr_gender_from_cycl", "PPH-UPDATE-PRONOUN-AGR-GENDER-FROM-CYCL", 2, 0, false);
        declareFunction("pph_drs_print_function_trampoline", "PPH-DRS-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction("pph_drs_p", "PPH-DRS-P", 1, 0, false);
        new pph_drs.$pph_drs_p$UnaryFunction();
        declareFunction("pph_drs_rms", "PPH-DRS-RMS", 1, 0, false);
        declareFunction("pph_drs_backward_looking_center", "PPH-DRS-BACKWARD-LOOKING-CENTER", 1, 0, false);
        declareFunction("pph_drs_id", "PPH-DRS-ID", 1, 0, false);
        declareFunction("_csetf_pph_drs_rms", "_CSETF-PPH-DRS-RMS", 2, 0, false);
        declareFunction("_csetf_pph_drs_backward_looking_center", "_CSETF-PPH-DRS-BACKWARD-LOOKING-CENTER", 2, 0, false);
        declareFunction("_csetf_pph_drs_id", "_CSETF-PPH-DRS-ID", 2, 0, false);
        declareFunction("make_pph_drs", "MAKE-PPH-DRS", 0, 1, false);
        declareFunction("visit_defstruct_pph_drs", "VISIT-DEFSTRUCT-PPH-DRS", 2, 0, false);
        declareFunction("visit_defstruct_object_pph_drs_method", "VISIT-DEFSTRUCT-OBJECT-PPH-DRS-METHOD", 2, 0, false);
        declareFunction("pprint_pph_drs", "PPRINT-PPH-DRS", 3, 0, false);
        declareFunction("make_pph_drs_with_id", "MAKE-PPH-DRS-WITH-ID", 0, 1, false);
        declareFunction("set_pph_drs_backward_looking_center", "SET-PPH-DRS-BACKWARD-LOOKING-CENTER", 1, 1, false);
        declareFunction("remove_pph_drs_backward_looking_center", "REMOVE-PPH-DRS-BACKWARD-LOOKING-CENTER", 0, 1, false);
        declareFunction("get_pph_drs_backward_looking_center", "GET-PPH-DRS-BACKWARD-LOOKING-CENTER", 0, 1, false);
        declareFunction("pph_discourse_context_rms", "PPH-DISCOURSE-CONTEXT-RMS", 0, 1, false);
        declareFunction("pph_discourse_rm_lookup", "PPH-DISCOURSE-RM-LOOKUP", 1, 0, false);
        declareFunction("pph_add_reference_marker", "PPH-ADD-REFERENCE-MARKER", 1, 1, false);
        declareFunction("pph_ensure_rms_are_in_discourse_context", "PPH-ENSURE-RMS-ARE-IN-DISCOURSE-CONTEXT", 1, 0, false);
        declareFunction("pph_add_rm", "PPH-ADD-RM", 1, 0, false);
        declareFunction("pph_remove_rm", "PPH-REMOVE-RM", 1, 0, false);
        declareFunction("pph_remove_rm_with_cycl", "PPH-REMOVE-RM-WITH-CYCL", 1, 0, false);
        declareFunction("remove_phrase_from_discourse_context", "REMOVE-PHRASE-FROM-DISCOURSE-CONTEXT", 1, 1, false);
        declareFunction("pph_ensure_discourse_participant_rm", "PPH-ENSURE-DISCOURSE-PARTICIPANT-RM", 2, 0, false);
        declareFunction("pph_add_discourse_participant_rm", "PPH-ADD-DISCOURSE-PARTICIPANT-RM", 2, 0, false);
        declareFunction("pph_rm_has_compatible_phi_featuresP", "PPH-RM-HAS-COMPATIBLE-PHI-FEATURES?", 3, 0, false);
        declareFunction("pph_rm_has_compatible_personP", "PPH-RM-HAS-COMPATIBLE-PERSON?", 3, 0, false);
        declareFunction("pph_rm_has_compatible_numberP", "PPH-RM-HAS-COMPATIBLE-NUMBER?", 3, 0, false);
        declareFunction("pph_rm_has_compatible_genderP", "PPH-RM-HAS-COMPATIBLE-GENDER?", 3, 0, false);
        declareFunction("pph_rm_has_cyclP", "PPH-RM-HAS-CYCL?", 2, 0, false);
        declareFunction("pph_possibly_update_np_index", "PPH-POSSIBLY-UPDATE-NP-INDEX", 1, 0, false);
        declareFunction("pph_anaphoric_to_backward_looking_centerP", "PPH-ANAPHORIC-TO-BACKWARD-LOOKING-CENTER?", 1, 0, false);
        declareFunction("pph_number_attribute_from_phrase", "PPH-NUMBER-ATTRIBUTE-FROM-PHRASE", 1, 0, false);
        declareFunction("pph_number_attribute_for_pred", "PPH-NUMBER-ATTRIBUTE-FOR-PRED", 1, 0, false);
        return NIL;
    }

    public static SubLObject init_pph_drs_file() {
        deflexical("*PPH-DRS-ID-GENERATOR*", integer_sequence_generator.new_integer_sequence_generator(UNPROVIDED, UNPROVIDED, UNPROVIDED));
        defconstant("*DTP-PPH-RM*", PPH_RM);
        defconstant("*DTP-PPH-DRS*", PPH_DRS);
        return NIL;
    }

    public static SubLObject setup_pph_drs_file() {
        register_method($print_object_method_table$.getGlobalValue(), $dtp_pph_rm$.getGlobalValue(), symbol_function(PPH_RM_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim($list21);
        def_csetf(PPH_RM_CYCL, _CSETF_PPH_RM_CYCL);
        def_csetf(PPH_RM_AGR, _CSETF_PPH_RM_AGR);
        def_csetf(PPH_RM_PHRASES, _CSETF_PPH_RM_PHRASES);
        identity(PPH_RM);
        register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_pph_rm$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_PPH_RM_METHOD));
        register_method($print_object_method_table$.getGlobalValue(), $dtp_pph_drs$.getGlobalValue(), symbol_function(PPH_DRS_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim($list48);
        def_csetf(PPH_DRS_RMS, _CSETF_PPH_DRS_RMS);
        def_csetf(PPH_DRS_BACKWARD_LOOKING_CENTER, _CSETF_PPH_DRS_BACKWARD_LOOKING_CENTER);
        def_csetf(PPH_DRS_ID, _CSETF_PPH_DRS_ID);
        identity(PPH_DRS);
        register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_pph_drs$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_PPH_DRS_METHOD));
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_pph_drs_file();
    }

    @Override
    public void initializeVariables() {
        init_pph_drs_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_pph_drs_file();
    }

    static {
    }

    public static final class $pph_rm_p$UnaryFunction extends UnaryFunction {
        public $pph_rm_p$UnaryFunction() {
            super(extractFunctionNamed("PPH-RM-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return pph_rm_p(arg1);
        }
    }

    static private final SubLString $str_alt1$__Not_adding__S_to_the_discourse_ = makeString("~&Not adding ~S to the discourse context because *pph-track-discourse-referents?* is NIL~%");

    public static final class $pph_rm_cycl$UnaryFunction extends UnaryFunction {
        public $pph_rm_cycl$UnaryFunction() {
            super(extractFunctionNamed("PPH-RM-CYCL"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return pph_rm_cycl(arg1);
        }
    }

    static private final SubLString $str_alt2$__Not_adding__S_to_the_discourse_ = makeString("~&Not adding ~S to the discourse context because *pph-discourse-context* is not initialized~%");

    static private final SubLString $str_alt3$__Not_adding__S_to_the_discourse_ = makeString("~&Not adding ~S to the discourse context because it is already there~%");

    public static final class $pph_drs_native extends SubLStructNative {
        public SubLObject $rms;

        public SubLObject $backward_looking_center;

        public SubLObject $id;

        private static final SubLStructDeclNative structDecl;

        public $pph_drs_native() {
            pph_drs.$pph_drs_native.this.$rms = Lisp.NIL;
            pph_drs.$pph_drs_native.this.$backward_looking_center = Lisp.NIL;
            pph_drs.$pph_drs_native.this.$id = Lisp.NIL;
        }

        @Override
        public SubLStructDecl getStructDecl() {
            return structDecl;
        }

        @Override
        public SubLObject getField2() {
            return pph_drs.$pph_drs_native.this.$rms;
        }

        @Override
        public SubLObject getField3() {
            return pph_drs.$pph_drs_native.this.$backward_looking_center;
        }

        @Override
        public SubLObject getField4() {
            return pph_drs.$pph_drs_native.this.$id;
        }

        @Override
        public SubLObject setField2(final SubLObject value) {
            return pph_drs.$pph_drs_native.this.$rms = value;
        }

        @Override
        public SubLObject setField3(final SubLObject value) {
            return pph_drs.$pph_drs_native.this.$backward_looking_center = value;
        }

        @Override
        public SubLObject setField4(final SubLObject value) {
            return pph_drs.$pph_drs_native.this.$id = value;
        }

        static {
            structDecl = makeStructDeclNative(com.cyc.cycjava.cycl.pph_drs.$pph_drs_native.class, PPH_DRS, PPH_DRS_P, $list42, $list43, new String[]{ "$rms", "$backward_looking_center", "$id" }, $list44, $list45, PPRINT_PPH_DRS);
        }
    }

    static private final SubLString $str_alt4$__Not_adding__S_to_the_discourse_ = makeString("~&Not adding ~S to the discourse context because it is not valid discourse-referent cycl");

    static private final SubLList $list_alt5 = list(reader_make_constant_shell("FirstPerson-NLAttr"), reader_make_constant_shell("SecondPerson-NLAttr"));

    static private final SubLString $str_alt9$__Looking_for_rival_for__S__S____ = makeString("~&Looking for rival for ~S ~S...~%");

    static private final SubLString $str_alt10$__Checking__S_____ = makeString("~&Checking ~S...~%");

    static private final SubLString $str_alt11$___S_has_a_possible_antecedent_am = makeString("~&~S has a possible antecedent ambiguity: ~S with~% RM ~S~%");

    static private final SubLList $list_alt14 = list(makeSymbol("CYCL"), makeSymbol("AGR"), makeSymbol("PHRASES"));

    static private final SubLList $list_alt15 = list($CYCL, makeKeyword("AGR"), makeKeyword("PHRASES"));

    static private final SubLList $list_alt16 = list(makeSymbol("PPH-RM-CYCL"), makeSymbol("PPH-RM-AGR"), makeSymbol("PPH-RM-PHRASES"));

    static private final SubLList $list_alt17 = list(makeSymbol("_CSETF-PPH-RM-CYCL"), makeSymbol("_CSETF-PPH-RM-AGR"), makeSymbol("_CSETF-PPH-RM-PHRASES"));

    public static final class $pph_drs_p$UnaryFunction extends UnaryFunction {
        public $pph_drs_p$UnaryFunction() {
            super(extractFunctionNamed("PPH-DRS-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return pph_drs_p(arg1);
        }
    }

    static private final SubLString $str_alt28$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");

    static private final SubLString $str_alt29$_PPH_error_level_ = makeString("(PPH error level ");

    static private final SubLString $str_alt30$__ = makeString(") ");

    static private final SubLString $str_alt31$_is_not_a_ = makeString(" is not a ");

    static private final SubLString $str_alt32$__PPH_RM___S__S__S_ = makeString("#<PPH-RM: ~S ~S ~S>");

    private static final SubLSymbol PPH_PRONOUN_AGR_P = makeSymbol("PPH-PRONOUN-AGR-P");

    static private final SubLSymbol $sym35$PPH_PRONOUN_AGR_NUMBER_ = makeSymbol("PPH-PRONOUN-AGR-NUMBER?");

    static private final SubLSymbol $sym36$PPH_PRONOUN_AGR_GENDER_ = makeSymbol("PPH-PRONOUN-AGR-GENDER?");

    static private final SubLSymbol $sym37$PPH_PRONOUN_AGR_PERSON_ = makeSymbol("PPH-PRONOUN-AGR-PERSON?");

    private static final SubLSymbol PPH_PHRASE_P = makeSymbol("PPH-PHRASE-P");

    static private final SubLList $list_alt41 = list(makeSymbol("RMS"), makeSymbol("BACKWARD-LOOKING-CENTER"));

    static private final SubLList $list_alt42 = list(makeKeyword("RMS"), makeKeyword("BACKWARD-LOOKING-CENTER"));

    static private final SubLList $list_alt43 = list(makeSymbol("PPH-DRS-RMS"), makeSymbol("PPH-DRS-BACKWARD-LOOKING-CENTER"));

    static private final SubLList $list_alt44 = list(makeSymbol("_CSETF-PPH-DRS-RMS"), makeSymbol("_CSETF-PPH-DRS-BACKWARD-LOOKING-CENTER"));

    static private final SubLString $str_alt52$__PPH_DRS___S___S__ = makeString("#<PPH-DRS: ~S (~S)>");

    static private final SubLString $str_alt53$Setting_backward_looking_center_t = makeString("Setting backward looking center to ~S but it's not in the discourse context!");

    static private final SubLString $str_alt54$Set_backward_looking_center_to__S = makeString("Set backward-looking center to ~S~%");

    static private final SubLString $str_alt55$Removing_rm__S_from__pph_discours = makeString("Removing rm ~S from *pph-discourse-context* ~S");

    static private final SubLString $str_alt58$Setting_number_of_reference_marke = makeString("Setting number of reference marker ~S to ~S");

    static private final SubLSymbol $sym60$_NUM = makeSymbol("?NUM");

    static private final SubLList $list_alt62 = list(makeSymbol("?NUM"));
}

/**
 * Total time: 283 ms
 */
