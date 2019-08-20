/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.constant_handles.reader_make_constant_shell;
import static com.cyc.cycjava.cycl.control_vars.$mapping_answer$;
import static com.cyc.cycjava.cycl.el_utilities.el_conjunction_p;
import static com.cyc.cycjava.cycl.el_utilities.el_formula_p;
import static com.cyc.cycjava.cycl.el_utilities.formula_arityE;
import static com.cyc.cycjava.cycl.el_utilities.make_el_formula;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_colon;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_space;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.append;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.listS;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.nconc;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.rplaca;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.rplacd;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.eq;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.equalp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.identity;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.apply;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.funcall;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks.make_lock;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks.release_lock;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks.seize_lock;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.numG;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.subtract;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.cconcatenate;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.count;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.delete;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.find;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.length;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.nreverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.position;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.remove;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.reverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.subseq;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.def_csetf;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.makeStructDeclNative;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.register_method;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.consp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.keywordp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.listp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.stringp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.sublisp_null;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.vectorp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.arg2;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.multiple_value_list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.resetMultipleValues;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.values;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors.aref;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeInteger;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.cdestructuring_bind_error;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.assoc;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.caar;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cadr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cddr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.copy_list;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.copy_tree;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.last;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.second;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.subsetp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.subst;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.subst_if;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.$print_object_method_table$;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.bq_cons;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.write_char;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.write_string;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.declareMacro;
import static com.cyc.tool.subl.util.SubLFiles.defconstant;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;
import static com.cyc.tool.subl.util.SubLFiles.defvar;

import org.armedbear.lisp.Lisp;

import com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_admitted_formula;
import com.cyc.cycjava.cycl.rtp.rtp_constituent_weeders;
import com.cyc.cycjava.cycl.rtp.rtp_initialize;
import com.cyc.cycjava.cycl.rtp.rtp_iterators;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
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
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.util.SubLFiles.LispMethod;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      RKF-ASSISTED-READER
 * source file: /cyc/top/cycl/rkf-assisted-reader.lisp
 * created:     2019/07/03 17:38:00
 */
public final class rkf_assisted_reader extends SubLTranslatedFile implements V12 {
    public static final class $ar_template_native extends SubLStructNative {
        public SubLStructDecl getStructDecl() {
            return structDecl;
        }

        public SubLObject getField2() {
            return com.cyc.cycjava.cycl.rkf_assisted_reader.$ar_template_native.this.$id;
        }

        public SubLObject getField3() {
            return com.cyc.cycjava.cycl.rkf_assisted_reader.$ar_template_native.this.$concept;
        }

        public SubLObject getField4() {
            return com.cyc.cycjava.cycl.rkf_assisted_reader.$ar_template_native.this.$formula;
        }

        public SubLObject getField5() {
            return com.cyc.cycjava.cycl.rkf_assisted_reader.$ar_template_native.this.$prompt;
        }

        public SubLObject getField6() {
            return com.cyc.cycjava.cycl.rkf_assisted_reader.$ar_template_native.this.$choice_table;
        }

        public SubLObject getField7() {
            return com.cyc.cycjava.cycl.rkf_assisted_reader.$ar_template_native.this.$agglomerations;
        }

        public SubLObject setField2(SubLObject value) {
            return com.cyc.cycjava.cycl.rkf_assisted_reader.$ar_template_native.this.$id = value;
        }

        public SubLObject setField3(SubLObject value) {
            return com.cyc.cycjava.cycl.rkf_assisted_reader.$ar_template_native.this.$concept = value;
        }

        public SubLObject setField4(SubLObject value) {
            return com.cyc.cycjava.cycl.rkf_assisted_reader.$ar_template_native.this.$formula = value;
        }

        public SubLObject setField5(SubLObject value) {
            return com.cyc.cycjava.cycl.rkf_assisted_reader.$ar_template_native.this.$prompt = value;
        }

        public SubLObject setField6(SubLObject value) {
            return com.cyc.cycjava.cycl.rkf_assisted_reader.$ar_template_native.this.$choice_table = value;
        }

        public SubLObject setField7(SubLObject value) {
            return com.cyc.cycjava.cycl.rkf_assisted_reader.$ar_template_native.this.$agglomerations = value;
        }

        public SubLObject $id = Lisp.NIL;

        public SubLObject $concept = Lisp.NIL;

        public SubLObject $formula = Lisp.NIL;

        public SubLObject $prompt = Lisp.NIL;

        public SubLObject $choice_table = Lisp.NIL;

        public SubLObject $agglomerations = Lisp.NIL;

        private static final SubLStructDeclNative structDecl = makeStructDeclNative(com.cyc.cycjava.cycl.rkf_assisted_reader.$ar_template_native.class, AR_TEMPLATE, AR_TEMPLATE_P, $list_alt138, $list_alt139, new String[]{ "$id", "$concept", "$formula", "$prompt", "$choice_table", "$agglomerations" }, $list_alt140, $list_alt141, DEFAULT_STRUCT_PRINT_FUNCTION);
    }

    public static final class $ar_sentence_native extends SubLStructNative {
        public SubLStructDecl getStructDecl() {
            return structDecl;
        }

        public SubLObject getField2() {
            return com.cyc.cycjava.cycl.rkf_assisted_reader.$ar_sentence_native.this.$id;
        }

        public SubLObject getField3() {
            return com.cyc.cycjava.cycl.rkf_assisted_reader.$ar_sentence_native.this.$plaintext;
        }

        public SubLObject getField4() {
            return com.cyc.cycjava.cycl.rkf_assisted_reader.$ar_sentence_native.this.$token_vector;
        }

        public SubLObject getField5() {
            return com.cyc.cycjava.cycl.rkf_assisted_reader.$ar_sentence_native.this.$clarifications;
        }

        public SubLObject getField6() {
            return com.cyc.cycjava.cycl.rkf_assisted_reader.$ar_sentence_native.this.$source_sentence;
        }

        public SubLObject getField7() {
            return com.cyc.cycjava.cycl.rkf_assisted_reader.$ar_sentence_native.this.$phrases;
        }

        public SubLObject setField2(SubLObject value) {
            return com.cyc.cycjava.cycl.rkf_assisted_reader.$ar_sentence_native.this.$id = value;
        }

        public SubLObject setField3(SubLObject value) {
            return com.cyc.cycjava.cycl.rkf_assisted_reader.$ar_sentence_native.this.$plaintext = value;
        }

        public SubLObject setField4(SubLObject value) {
            return com.cyc.cycjava.cycl.rkf_assisted_reader.$ar_sentence_native.this.$token_vector = value;
        }

        public SubLObject setField5(SubLObject value) {
            return com.cyc.cycjava.cycl.rkf_assisted_reader.$ar_sentence_native.this.$clarifications = value;
        }

        public SubLObject setField6(SubLObject value) {
            return com.cyc.cycjava.cycl.rkf_assisted_reader.$ar_sentence_native.this.$source_sentence = value;
        }

        public SubLObject setField7(SubLObject value) {
            return com.cyc.cycjava.cycl.rkf_assisted_reader.$ar_sentence_native.this.$phrases = value;
        }

        public SubLObject $id = Lisp.NIL;

        public SubLObject $plaintext = Lisp.NIL;

        public SubLObject $token_vector = Lisp.NIL;

        public SubLObject $clarifications = Lisp.NIL;

        public SubLObject $source_sentence = Lisp.NIL;

        public SubLObject $phrases = Lisp.NIL;

        private static final SubLStructDeclNative structDecl = makeStructDeclNative(com.cyc.cycjava.cycl.rkf_assisted_reader.$ar_sentence_native.class, AR_SENTENCE, AR_SENTENCE_P, $list_alt5, $list_alt6, new String[]{ "$id", "$plaintext", "$token_vector", "$clarifications", "$source_sentence", "$phrases" }, $list_alt7, $list_alt8, DEFAULT_STRUCT_PRINT_FUNCTION);
    }

    public static final class $ar_phrase_native extends SubLStructNative {
        public SubLStructDecl getStructDecl() {
            return structDecl;
        }

        public SubLObject getField2() {
            return com.cyc.cycjava.cycl.rkf_assisted_reader.$ar_phrase_native.this.$id;
        }

        public SubLObject getField3() {
            return com.cyc.cycjava.cycl.rkf_assisted_reader.$ar_phrase_native.this.$status;
        }

        public SubLObject getField4() {
            return com.cyc.cycjava.cycl.rkf_assisted_reader.$ar_phrase_native.this.$token_list;
        }

        public SubLObject getField5() {
            return com.cyc.cycjava.cycl.rkf_assisted_reader.$ar_phrase_native.this.$sentence;
        }

        public SubLObject getField6() {
            return com.cyc.cycjava.cycl.rkf_assisted_reader.$ar_phrase_native.this.$concepts;
        }

        public SubLObject getField7() {
            return com.cyc.cycjava.cycl.rkf_assisted_reader.$ar_phrase_native.this.$rejected_concepts;
        }

        public SubLObject getField8() {
            return com.cyc.cycjava.cycl.rkf_assisted_reader.$ar_phrase_native.this.$disambiguated_concept;
        }

        public SubLObject getField9() {
            return com.cyc.cycjava.cycl.rkf_assisted_reader.$ar_phrase_native.this.$surrogate;
        }

        public SubLObject getField10() {
            return com.cyc.cycjava.cycl.rkf_assisted_reader.$ar_phrase_native.this.$constraint;
        }

        public SubLObject getField11() {
            return com.cyc.cycjava.cycl.rkf_assisted_reader.$ar_phrase_native.this.$force;
        }

        public SubLObject setField2(SubLObject value) {
            return com.cyc.cycjava.cycl.rkf_assisted_reader.$ar_phrase_native.this.$id = value;
        }

        public SubLObject setField3(SubLObject value) {
            return com.cyc.cycjava.cycl.rkf_assisted_reader.$ar_phrase_native.this.$status = value;
        }

        public SubLObject setField4(SubLObject value) {
            return com.cyc.cycjava.cycl.rkf_assisted_reader.$ar_phrase_native.this.$token_list = value;
        }

        public SubLObject setField5(SubLObject value) {
            return com.cyc.cycjava.cycl.rkf_assisted_reader.$ar_phrase_native.this.$sentence = value;
        }

        public SubLObject setField6(SubLObject value) {
            return com.cyc.cycjava.cycl.rkf_assisted_reader.$ar_phrase_native.this.$concepts = value;
        }

        public SubLObject setField7(SubLObject value) {
            return com.cyc.cycjava.cycl.rkf_assisted_reader.$ar_phrase_native.this.$rejected_concepts = value;
        }

        public SubLObject setField8(SubLObject value) {
            return com.cyc.cycjava.cycl.rkf_assisted_reader.$ar_phrase_native.this.$disambiguated_concept = value;
        }

        public SubLObject setField9(SubLObject value) {
            return com.cyc.cycjava.cycl.rkf_assisted_reader.$ar_phrase_native.this.$surrogate = value;
        }

        public SubLObject setField10(SubLObject value) {
            return com.cyc.cycjava.cycl.rkf_assisted_reader.$ar_phrase_native.this.$constraint = value;
        }

        public SubLObject setField11(SubLObject value) {
            return com.cyc.cycjava.cycl.rkf_assisted_reader.$ar_phrase_native.this.$force = value;
        }

        public SubLObject $id = Lisp.NIL;

        public SubLObject $status = Lisp.NIL;

        public SubLObject $token_list = Lisp.NIL;

        public SubLObject $sentence = Lisp.NIL;

        public SubLObject $concepts = Lisp.NIL;

        public SubLObject $rejected_concepts = Lisp.NIL;

        public SubLObject $disambiguated_concept = Lisp.NIL;

        public SubLObject $surrogate = Lisp.NIL;

        public SubLObject $constraint = Lisp.NIL;

        public SubLObject $force = Lisp.NIL;

        private static final SubLStructDeclNative structDecl = makeStructDeclNative(com.cyc.cycjava.cycl.rkf_assisted_reader.$ar_phrase_native.class, AR_PHRASE, AR_PHRASE_P, $list_alt57, $list_alt58, new String[]{ "$id", "$status", "$token_list", "$sentence", "$concepts", "$rejected_concepts", "$disambiguated_concept", "$surrogate", "$constraint", "$force" }, $list_alt59, $list_alt60, PRINT_AR_PHRASE);
    }

    public static final class $ar_concept_native extends SubLStructNative {
        public SubLStructDecl getStructDecl() {
            return structDecl;
        }

        public SubLObject getField2() {
            return com.cyc.cycjava.cycl.rkf_assisted_reader.$ar_concept_native.this.$id;
        }

        public SubLObject getField3() {
            return com.cyc.cycjava.cycl.rkf_assisted_reader.$ar_concept_native.this.$cycl;
        }

        public SubLObject getField4() {
            return com.cyc.cycjava.cycl.rkf_assisted_reader.$ar_concept_native.this.$disambiguation_text;
        }

        public SubLObject getField5() {
            return com.cyc.cycjava.cycl.rkf_assisted_reader.$ar_concept_native.this.$phrases;
        }

        public SubLObject getField6() {
            return com.cyc.cycjava.cycl.rkf_assisted_reader.$ar_concept_native.this.$parts;
        }

        public SubLObject getField7() {
            return com.cyc.cycjava.cycl.rkf_assisted_reader.$ar_concept_native.this.$agglomerations;
        }

        public SubLObject getField8() {
            return com.cyc.cycjava.cycl.rkf_assisted_reader.$ar_concept_native.this.$force;
        }

        public SubLObject getField9() {
            return com.cyc.cycjava.cycl.rkf_assisted_reader.$ar_concept_native.this.$confidence;
        }

        public SubLObject getField10() {
            return com.cyc.cycjava.cycl.rkf_assisted_reader.$ar_concept_native.this.$open_term_score;
        }

        public SubLObject setField2(SubLObject value) {
            return com.cyc.cycjava.cycl.rkf_assisted_reader.$ar_concept_native.this.$id = value;
        }

        public SubLObject setField3(SubLObject value) {
            return com.cyc.cycjava.cycl.rkf_assisted_reader.$ar_concept_native.this.$cycl = value;
        }

        public SubLObject setField4(SubLObject value) {
            return com.cyc.cycjava.cycl.rkf_assisted_reader.$ar_concept_native.this.$disambiguation_text = value;
        }

        public SubLObject setField5(SubLObject value) {
            return com.cyc.cycjava.cycl.rkf_assisted_reader.$ar_concept_native.this.$phrases = value;
        }

        public SubLObject setField6(SubLObject value) {
            return com.cyc.cycjava.cycl.rkf_assisted_reader.$ar_concept_native.this.$parts = value;
        }

        public SubLObject setField7(SubLObject value) {
            return com.cyc.cycjava.cycl.rkf_assisted_reader.$ar_concept_native.this.$agglomerations = value;
        }

        public SubLObject setField8(SubLObject value) {
            return com.cyc.cycjava.cycl.rkf_assisted_reader.$ar_concept_native.this.$force = value;
        }

        public SubLObject setField9(SubLObject value) {
            return com.cyc.cycjava.cycl.rkf_assisted_reader.$ar_concept_native.this.$confidence = value;
        }

        public SubLObject setField10(SubLObject value) {
            return com.cyc.cycjava.cycl.rkf_assisted_reader.$ar_concept_native.this.$open_term_score = value;
        }

        public SubLObject $id = Lisp.NIL;

        public SubLObject $cycl = Lisp.NIL;

        public SubLObject $disambiguation_text = Lisp.NIL;

        public SubLObject $phrases = Lisp.NIL;

        public SubLObject $parts = Lisp.NIL;

        public SubLObject $agglomerations = Lisp.NIL;

        public SubLObject $force = Lisp.NIL;

        public SubLObject $confidence = Lisp.NIL;

        public SubLObject $open_term_score = Lisp.NIL;

        private static final SubLStructDeclNative structDecl = makeStructDeclNative(com.cyc.cycjava.cycl.rkf_assisted_reader.$ar_concept_native.class, AR_CONCEPT, AR_CONCEPT_P, $list_alt103, $list_alt104, new String[]{ "$id", "$cycl", "$disambiguation_text", "$phrases", "$parts", "$agglomerations", "$force", "$confidence", "$open_term_score" }, $list_alt105, $list_alt106, PRINT_AR_CONCEPT);
    }

    public static final SubLFile me = new rkf_assisted_reader();



    // deflexical
    // Definitions
    // Lock for controlling modifications in the assisted reader.
    /**
     * Lock for controlling modifications in the assisted reader.
     */
    @LispMethod(comment = "Lock for controlling modifications in the assisted reader.\ndeflexical")
    private static final SubLSymbol $ar_lock$ = makeSymbol("*AR-LOCK*");

    // defconstant
    @LispMethod(comment = "defconstant")
    public static final SubLSymbol $dtp_ar_sentence$ = makeSymbol("*DTP-AR-SENTENCE*");

    // defconstant
    @LispMethod(comment = "defconstant")
    public static final SubLSymbol $dtp_ar_token$ = makeSymbol("*DTP-AR-TOKEN*");

    // defconstant
    @LispMethod(comment = "defconstant")
    public static final SubLSymbol $dtp_ar_phrase$ = makeSymbol("*DTP-AR-PHRASE*");

    // defconstant
    @LispMethod(comment = "defconstant")
    public static final SubLSymbol $dtp_ar_concept$ = makeSymbol("*DTP-AR-CONCEPT*");

    // defconstant
    @LispMethod(comment = "defconstant")
    public static final SubLSymbol $dtp_ar_template$ = makeSymbol("*DTP-AR-TEMPLATE*");

    // defconstant
    @LispMethod(comment = "defconstant")
    public static final SubLSymbol $dtp_ar_state$ = makeSymbol("*DTP-AR-STATE*");

    // defconstant
    /**
     * The maximum depth that the reader is allowed to chain through surrogates--if
     * over this number, the system is almost certainly in infinite recursion.
     */
    @LispMethod(comment = "The maximum depth that the reader is allowed to chain through surrogates--if\r\nover this number, the system is almost certainly in infinite recursion.\ndefconstant\nThe maximum depth that the reader is allowed to chain through surrogates--if\nover this number, the system is almost certainly in infinite recursion.")
    private static final SubLSymbol $max_surrogate_chain_length$ = makeSymbol("*MAX-SURROGATE-CHAIN-LENGTH*");

    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $ar_concept_grounding_map$ = makeSymbol("*AR-CONCEPT-GROUNDING-MAP*");

    // deflexical
    @LispMethod(comment = "deflexical")
    public static final SubLSymbol $ar_concept_cycle_count$ = makeSymbol("*AR-CONCEPT-CYCLE-COUNT*");

    // defvar
    /**
     * what's the open-term-score for the best term--use that as a pivot for
     * dividing the good and the bad parses
     */
    @LispMethod(comment = "what\'s the open-term-score for the best term--use that as a pivot for\r\ndividing the good and the bad parses\ndefvar\nwhat\'s the open-term-score for the best term--use that as a pivot for\ndividing the good and the bad parses")
    private static final SubLSymbol $ar_divide_best$ = makeSymbol("*AR-DIVIDE-BEST*");

    // defparameter
    /**
     * The MT that combines the view of the knowledge world with the linguistic
     * world.
     */
    @LispMethod(comment = "The MT that combines the view of the knowledge world with the linguistic\r\nworld.\ndefparameter\nThe MT that combines the view of the knowledge world with the linguistic\nworld.")
    public static final SubLSymbol $rkf_ar_parsing_mt$ = makeSymbol("*RKF-AR-PARSING-MT*");

    // defparameter
    // The MT that has view of the knowledge world only.
    /**
     * The MT that has view of the knowledge world only.
     */
    @LispMethod(comment = "The MT that has view of the knowledge world only.\ndefparameter")
    public static final SubLSymbol $rkf_ar_semantics_mt$ = makeSymbol("*RKF-AR-SEMANTICS-MT*");

    // defparameter
    // The Constant name of the rkf tool user
    /**
     * The Constant name of the rkf tool user
     */
    @LispMethod(comment = "The Constant name of the rkf tool user\ndefparameter")
    public static final SubLSymbol $rkf_user$ = makeSymbol("*RKF-USER*");

    // deflexical
    @LispMethod(comment = "deflexical")
    public static final SubLSymbol $rkf_ar_text_processor$ = makeSymbol("*RKF-AR-TEXT-PROCESSOR*");

    // deflexical
    @LispMethod(comment = "deflexical")
    public static final SubLSymbol $rkf_ar_question_processor$ = makeSymbol("*RKF-AR-QUESTION-PROCESSOR*");

    // deflexical
    @LispMethod(comment = "deflexical")
    public static final SubLSymbol $rkf_ar_concept_harvester$ = makeSymbol("*RKF-AR-CONCEPT-HARVESTER*");

    // deflexical
    @LispMethod(comment = "deflexical")
    public static final SubLSymbol $rfk_ar_template_category_map$ = makeSymbol("*RFK-AR-TEMPLATE-CATEGORY-MAP*");

    // defparameter
    @LispMethod(comment = "defparameter")
    public static final SubLSymbol $rkf_ar_processing_mode$ = makeSymbol("*RKF-AR-PROCESSING-MODE*");

    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $rkf_ar_logging_default_parser$ = makeSymbol("*RKF-AR-LOGGING-DEFAULT-PARSER*");

    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $rkf_ar_logging_default_project$ = makeSymbol("*RKF-AR-LOGGING-DEFAULT-PROJECT*");

    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $rkf_ar_logging_default_priority$ = makeSymbol("*RKF-AR-LOGGING-DEFAULT-PRIORITY*");

    // defparameter
    // a list of terms that the reformulator might try to remove
    /**
     * a list of terms that the reformulator might try to remove
     */
    @LispMethod(comment = "a list of terms that the reformulator might try to remove\ndefparameter")
    private static final SubLSymbol $rkf_reformulatable_terms$ = makeSymbol("*RKF-REFORMULATABLE-TERMS*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $ar_pragmatic_relations$ = makeSymbol("*AR-PRAGMATIC-RELATIONS*");

    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    static private final SubLString $$$Assisted_Reader_lock = makeString("Assisted Reader lock");

    static private final SubLList $list2 = list(makeSymbol("*AR-LOCK*"));

    private static final SubLSymbol AR_SENTENCE = makeSymbol("AR-SENTENCE");

    private static final SubLSymbol AR_SENTENCE_P = makeSymbol("AR-SENTENCE-P");

    static private final SubLList $list5 = list(makeSymbol("ID"), makeSymbol("PLAINTEXT"), makeSymbol("TOKEN-VECTOR"), makeSymbol("CLARIFICATIONS"), makeSymbol("SOURCE-SENTENCE"), makeSymbol("PHRASES"));

    static private final SubLList $list6 = list(makeKeyword("ID"), makeKeyword("PLAINTEXT"), makeKeyword("TOKEN-VECTOR"), makeKeyword("CLARIFICATIONS"), makeKeyword("SOURCE-SENTENCE"), makeKeyword("PHRASES"));

    static private final SubLList $list7 = list(makeSymbol("AR-SENTENCE-ID"), makeSymbol("AR-SENTENCE-PLAINTEXT"), makeSymbol("AR-SENTENCE-TOKEN-VECTOR"), makeSymbol("AR-SENTENCE-CLARIFICATIONS"), makeSymbol("AR-SENTENCE-SOURCE-SENTENCE"), makeSymbol("AR-SENTENCE-PHRASES"));

    static private final SubLList $list8 = list(makeSymbol("_CSETF-AR-SENTENCE-ID"), makeSymbol("_CSETF-AR-SENTENCE-PLAINTEXT"), makeSymbol("_CSETF-AR-SENTENCE-TOKEN-VECTOR"), makeSymbol("_CSETF-AR-SENTENCE-CLARIFICATIONS"), makeSymbol("_CSETF-AR-SENTENCE-SOURCE-SENTENCE"), makeSymbol("_CSETF-AR-SENTENCE-PHRASES"));

    private static final SubLSymbol AR_SENTENCE_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("AR-SENTENCE-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLList $list11 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("AR-SENTENCE-P"));

    private static final SubLSymbol AR_SENTENCE_ID = makeSymbol("AR-SENTENCE-ID");

    private static final SubLSymbol _CSETF_AR_SENTENCE_ID = makeSymbol("_CSETF-AR-SENTENCE-ID");

    private static final SubLSymbol AR_SENTENCE_PLAINTEXT = makeSymbol("AR-SENTENCE-PLAINTEXT");

    private static final SubLSymbol _CSETF_AR_SENTENCE_PLAINTEXT = makeSymbol("_CSETF-AR-SENTENCE-PLAINTEXT");

    private static final SubLSymbol AR_SENTENCE_TOKEN_VECTOR = makeSymbol("AR-SENTENCE-TOKEN-VECTOR");

    private static final SubLSymbol _CSETF_AR_SENTENCE_TOKEN_VECTOR = makeSymbol("_CSETF-AR-SENTENCE-TOKEN-VECTOR");

    private static final SubLSymbol AR_SENTENCE_CLARIFICATIONS = makeSymbol("AR-SENTENCE-CLARIFICATIONS");

    private static final SubLSymbol _CSETF_AR_SENTENCE_CLARIFICATIONS = makeSymbol("_CSETF-AR-SENTENCE-CLARIFICATIONS");

    private static final SubLSymbol AR_SENTENCE_SOURCE_SENTENCE = makeSymbol("AR-SENTENCE-SOURCE-SENTENCE");

    private static final SubLSymbol _CSETF_AR_SENTENCE_SOURCE_SENTENCE = makeSymbol("_CSETF-AR-SENTENCE-SOURCE-SENTENCE");

    private static final SubLSymbol AR_SENTENCE_PHRASES = makeSymbol("AR-SENTENCE-PHRASES");

    private static final SubLSymbol _CSETF_AR_SENTENCE_PHRASES = makeSymbol("_CSETF-AR-SENTENCE-PHRASES");

    private static final SubLString $str30$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");

    private static final SubLSymbol MAKE_AR_SENTENCE = makeSymbol("MAKE-AR-SENTENCE");

    private static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_AR_SENTENCE_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-AR-SENTENCE-METHOD");

    private static final SubLSymbol SXHASH_AR_SENTENCE_METHOD = makeSymbol("SXHASH-AR-SENTENCE-METHOD");

    private static final SubLSymbol AR_PHRASE_P = makeSymbol("AR-PHRASE-P");

    private static final SubLSymbol AR_TOKEN = makeSymbol("AR-TOKEN");

    private static final SubLSymbol AR_TOKEN_P = makeSymbol("AR-TOKEN-P");

    private static final SubLList $list41 = list(makeSymbol("ID"), makeSymbol("TEXT"), makeSymbol("SENTENCE"), makeSymbol("NUMBER"), makeSymbol("PHRASES"));

    private static final SubLList $list42 = list(makeKeyword("ID"), $TEXT, makeKeyword("SENTENCE"), makeKeyword("NUMBER"), makeKeyword("PHRASES"));

    private static final SubLList $list43 = list(makeSymbol("AR-TOKEN-ID"), makeSymbol("AR-TOKEN-TEXT"), makeSymbol("AR-TOKEN-SENTENCE"), makeSymbol("AR-TOKEN-NUMBER"), makeSymbol("AR-TOKEN-PHRASES"));

    private static final SubLList $list44 = list(makeSymbol("_CSETF-AR-TOKEN-ID"), makeSymbol("_CSETF-AR-TOKEN-TEXT"), makeSymbol("_CSETF-AR-TOKEN-SENTENCE"), makeSymbol("_CSETF-AR-TOKEN-NUMBER"), makeSymbol("_CSETF-AR-TOKEN-PHRASES"));

    private static final SubLSymbol PRINT_AR_TOKEN = makeSymbol("PRINT-AR-TOKEN");

    private static final SubLSymbol AR_TOKEN_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("AR-TOKEN-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLList $list47 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("AR-TOKEN-P"));

    private static final SubLSymbol AR_TOKEN_ID = makeSymbol("AR-TOKEN-ID");

    private static final SubLSymbol _CSETF_AR_TOKEN_ID = makeSymbol("_CSETF-AR-TOKEN-ID");

    private static final SubLSymbol AR_TOKEN_TEXT = makeSymbol("AR-TOKEN-TEXT");

    private static final SubLSymbol _CSETF_AR_TOKEN_TEXT = makeSymbol("_CSETF-AR-TOKEN-TEXT");

    private static final SubLSymbol AR_TOKEN_SENTENCE = makeSymbol("AR-TOKEN-SENTENCE");

    private static final SubLSymbol _CSETF_AR_TOKEN_SENTENCE = makeSymbol("_CSETF-AR-TOKEN-SENTENCE");

    private static final SubLSymbol AR_TOKEN_NUMBER = makeSymbol("AR-TOKEN-NUMBER");

    private static final SubLSymbol _CSETF_AR_TOKEN_NUMBER = makeSymbol("_CSETF-AR-TOKEN-NUMBER");

    private static final SubLSymbol AR_TOKEN_PHRASES = makeSymbol("AR-TOKEN-PHRASES");

    private static final SubLSymbol _CSETF_AR_TOKEN_PHRASES = makeSymbol("_CSETF-AR-TOKEN-PHRASES");

    private static final SubLSymbol MAKE_AR_TOKEN = makeSymbol("MAKE-AR-TOKEN");

    private static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_AR_TOKEN_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-AR-TOKEN-METHOD");

    private static final SubLString $str63$_A_ = makeString("~A ");

    private static final SubLSymbol SXHASH_AR_TOKEN_METHOD = makeSymbol("SXHASH-AR-TOKEN-METHOD");

    private static final SubLSymbol AR_PHRASE = makeSymbol("AR-PHRASE");

    private static final SubLList $list66 = list(new SubLObject[]{ makeSymbol("ID"), makeSymbol("STATUS"), makeSymbol("TOKEN-LIST"), makeSymbol("SENTENCE"), makeSymbol("CONCEPTS"), makeSymbol("REJECTED-CONCEPTS"), makeSymbol("DISAMBIGUATED-CONCEPT"), makeSymbol("SURROGATE"), makeSymbol("CONSTRAINT"), makeSymbol("FORCE") });

    private static final SubLList $list67 = list(new SubLObject[]{ makeKeyword("ID"), makeKeyword("STATUS"), makeKeyword("TOKEN-LIST"), makeKeyword("SENTENCE"), makeKeyword("CONCEPTS"), makeKeyword("REJECTED-CONCEPTS"), makeKeyword("DISAMBIGUATED-CONCEPT"), makeKeyword("SURROGATE"), makeKeyword("CONSTRAINT"), makeKeyword("FORCE") });

    private static final SubLList $list68 = list(new SubLObject[]{ makeSymbol("AR-PHRASE-ID"), makeSymbol("AR-PHRASE-STATUS"), makeSymbol("AR-PHRASE-TOKEN-LIST"), makeSymbol("AR-PHRASE-SENTENCE"), makeSymbol("AR-PHRASE-CONCEPTS"), makeSymbol("AR-PHRASE-REJECTED-CONCEPTS"), makeSymbol("AR-PHRASE-DISAMBIGUATED-CONCEPT"), makeSymbol("AR-PHRASE-SURROGATE"), makeSymbol("AR-PHRASE-CONSTRAINT"), makeSymbol("AR-PHRASE-FORCE") });

    private static final SubLList $list69 = list(new SubLObject[]{ makeSymbol("_CSETF-AR-PHRASE-ID"), makeSymbol("_CSETF-AR-PHRASE-STATUS"), makeSymbol("_CSETF-AR-PHRASE-TOKEN-LIST"), makeSymbol("_CSETF-AR-PHRASE-SENTENCE"), makeSymbol("_CSETF-AR-PHRASE-CONCEPTS"), makeSymbol("_CSETF-AR-PHRASE-REJECTED-CONCEPTS"), makeSymbol("_CSETF-AR-PHRASE-DISAMBIGUATED-CONCEPT"), makeSymbol("_CSETF-AR-PHRASE-SURROGATE"), makeSymbol("_CSETF-AR-PHRASE-CONSTRAINT"), makeSymbol("_CSETF-AR-PHRASE-FORCE") });

    private static final SubLSymbol PRINT_AR_PHRASE = makeSymbol("PRINT-AR-PHRASE");

    private static final SubLSymbol AR_PHRASE_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("AR-PHRASE-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLList $list72 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("AR-PHRASE-P"));

    private static final SubLSymbol AR_PHRASE_ID = makeSymbol("AR-PHRASE-ID");

    private static final SubLSymbol _CSETF_AR_PHRASE_ID = makeSymbol("_CSETF-AR-PHRASE-ID");

    private static final SubLSymbol AR_PHRASE_STATUS = makeSymbol("AR-PHRASE-STATUS");

    private static final SubLSymbol _CSETF_AR_PHRASE_STATUS = makeSymbol("_CSETF-AR-PHRASE-STATUS");

    private static final SubLSymbol AR_PHRASE_TOKEN_LIST = makeSymbol("AR-PHRASE-TOKEN-LIST");

    private static final SubLSymbol _CSETF_AR_PHRASE_TOKEN_LIST = makeSymbol("_CSETF-AR-PHRASE-TOKEN-LIST");

    private static final SubLSymbol AR_PHRASE_SENTENCE = makeSymbol("AR-PHRASE-SENTENCE");

    private static final SubLSymbol _CSETF_AR_PHRASE_SENTENCE = makeSymbol("_CSETF-AR-PHRASE-SENTENCE");

    private static final SubLSymbol AR_PHRASE_CONCEPTS = makeSymbol("AR-PHRASE-CONCEPTS");

    private static final SubLSymbol _CSETF_AR_PHRASE_CONCEPTS = makeSymbol("_CSETF-AR-PHRASE-CONCEPTS");

    private static final SubLSymbol AR_PHRASE_REJECTED_CONCEPTS = makeSymbol("AR-PHRASE-REJECTED-CONCEPTS");

    private static final SubLSymbol _CSETF_AR_PHRASE_REJECTED_CONCEPTS = makeSymbol("_CSETF-AR-PHRASE-REJECTED-CONCEPTS");

    private static final SubLSymbol AR_PHRASE_DISAMBIGUATED_CONCEPT = makeSymbol("AR-PHRASE-DISAMBIGUATED-CONCEPT");

    private static final SubLSymbol _CSETF_AR_PHRASE_DISAMBIGUATED_CONCEPT = makeSymbol("_CSETF-AR-PHRASE-DISAMBIGUATED-CONCEPT");

    private static final SubLSymbol AR_PHRASE_SURROGATE = makeSymbol("AR-PHRASE-SURROGATE");

    private static final SubLSymbol _CSETF_AR_PHRASE_SURROGATE = makeSymbol("_CSETF-AR-PHRASE-SURROGATE");

    private static final SubLSymbol AR_PHRASE_CONSTRAINT = makeSymbol("AR-PHRASE-CONSTRAINT");

    private static final SubLSymbol _CSETF_AR_PHRASE_CONSTRAINT = makeSymbol("_CSETF-AR-PHRASE-CONSTRAINT");

    private static final SubLSymbol AR_PHRASE_FORCE = makeSymbol("AR-PHRASE-FORCE");

    private static final SubLSymbol _CSETF_AR_PHRASE_FORCE = makeSymbol("_CSETF-AR-PHRASE-FORCE");

    private static final SubLSymbol MAKE_AR_PHRASE = makeSymbol("MAKE-AR-PHRASE");

    private static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_AR_PHRASE_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-AR-PHRASE-METHOD");

    private static final SubLString $str103$_AR_PHRASE__D_ = makeString("<AR-PHRASE ~D ");

    private static final SubLString $str104$_ = makeString(">");

    private static final SubLSymbol SXHASH_AR_PHRASE_METHOD = makeSymbol("SXHASH-AR-PHRASE-METHOD");

    private static final SubLSymbol AR_CONCEPT_P = makeSymbol("AR-CONCEPT-P");

    private static final SubLString $str109$_ = makeString("?");

    private static final SubLString $str111$_ = makeString(".");

    private static final SubLSymbol AR_CONCEPT = makeSymbol("AR-CONCEPT");

    private static final SubLList $list115 = list(new SubLObject[]{ makeSymbol("ID"), makeSymbol("CYCL"), makeSymbol("DISAMBIGUATION-TEXT"), makeSymbol("PHRASES"), makeSymbol("PARTS"), makeSymbol("AGGLOMERATIONS"), makeSymbol("FORCE"), makeSymbol("CONFIDENCE"), makeSymbol("OPEN-TERM-SCORE") });

    private static final SubLList $list116 = list(new SubLObject[]{ makeKeyword("ID"), $CYCL, makeKeyword("DISAMBIGUATION-TEXT"), makeKeyword("PHRASES"), makeKeyword("PARTS"), makeKeyword("AGGLOMERATIONS"), makeKeyword("FORCE"), makeKeyword("CONFIDENCE"), makeKeyword("OPEN-TERM-SCORE") });

    private static final SubLList $list117 = list(new SubLObject[]{ makeSymbol("AR-CONCEPT-ID"), makeSymbol("AR-CONCEPT-CYCL"), makeSymbol("AR-CONCEPT-DISAMBIGUATION-TEXT"), makeSymbol("AR-CONCEPT-PHRASES"), makeSymbol("AR-CONCEPT-PARTS"), makeSymbol("AR-CONCEPT-AGGLOMERATIONS"), makeSymbol("AR-CONCEPT-FORCE"), makeSymbol("AR-CONCEPT-CONFIDENCE"), makeSymbol("AR-CONCEPT-OPEN-TERM-SCORE") });

    private static final SubLList $list118 = list(new SubLObject[]{ makeSymbol("_CSETF-AR-CONCEPT-ID"), makeSymbol("_CSETF-AR-CONCEPT-CYCL"), makeSymbol("_CSETF-AR-CONCEPT-DISAMBIGUATION-TEXT"), makeSymbol("_CSETF-AR-CONCEPT-PHRASES"), makeSymbol("_CSETF-AR-CONCEPT-PARTS"), makeSymbol("_CSETF-AR-CONCEPT-AGGLOMERATIONS"), makeSymbol("_CSETF-AR-CONCEPT-FORCE"), makeSymbol("_CSETF-AR-CONCEPT-CONFIDENCE"), makeSymbol("_CSETF-AR-CONCEPT-OPEN-TERM-SCORE") });

    private static final SubLSymbol PRINT_AR_CONCEPT = makeSymbol("PRINT-AR-CONCEPT");

    private static final SubLSymbol AR_CONCEPT_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("AR-CONCEPT-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLList $list121 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("AR-CONCEPT-P"));

    private static final SubLSymbol AR_CONCEPT_ID = makeSymbol("AR-CONCEPT-ID");

    private static final SubLSymbol _CSETF_AR_CONCEPT_ID = makeSymbol("_CSETF-AR-CONCEPT-ID");

    private static final SubLSymbol AR_CONCEPT_CYCL = makeSymbol("AR-CONCEPT-CYCL");

    private static final SubLSymbol _CSETF_AR_CONCEPT_CYCL = makeSymbol("_CSETF-AR-CONCEPT-CYCL");

    private static final SubLSymbol AR_CONCEPT_DISAMBIGUATION_TEXT = makeSymbol("AR-CONCEPT-DISAMBIGUATION-TEXT");

    private static final SubLSymbol _CSETF_AR_CONCEPT_DISAMBIGUATION_TEXT = makeSymbol("_CSETF-AR-CONCEPT-DISAMBIGUATION-TEXT");

    private static final SubLSymbol AR_CONCEPT_PHRASES = makeSymbol("AR-CONCEPT-PHRASES");

    private static final SubLSymbol _CSETF_AR_CONCEPT_PHRASES = makeSymbol("_CSETF-AR-CONCEPT-PHRASES");

    private static final SubLSymbol AR_CONCEPT_PARTS = makeSymbol("AR-CONCEPT-PARTS");

    private static final SubLSymbol _CSETF_AR_CONCEPT_PARTS = makeSymbol("_CSETF-AR-CONCEPT-PARTS");

    private static final SubLSymbol AR_CONCEPT_AGGLOMERATIONS = makeSymbol("AR-CONCEPT-AGGLOMERATIONS");

    private static final SubLSymbol _CSETF_AR_CONCEPT_AGGLOMERATIONS = makeSymbol("_CSETF-AR-CONCEPT-AGGLOMERATIONS");

    private static final SubLSymbol AR_CONCEPT_FORCE = makeSymbol("AR-CONCEPT-FORCE");

    private static final SubLSymbol _CSETF_AR_CONCEPT_FORCE = makeSymbol("_CSETF-AR-CONCEPT-FORCE");

    private static final SubLSymbol AR_CONCEPT_CONFIDENCE = makeSymbol("AR-CONCEPT-CONFIDENCE");

    private static final SubLSymbol _CSETF_AR_CONCEPT_CONFIDENCE = makeSymbol("_CSETF-AR-CONCEPT-CONFIDENCE");

    private static final SubLSymbol AR_CONCEPT_OPEN_TERM_SCORE = makeSymbol("AR-CONCEPT-OPEN-TERM-SCORE");

    private static final SubLSymbol _CSETF_AR_CONCEPT_OPEN_TERM_SCORE = makeSymbol("_CSETF-AR-CONCEPT-OPEN-TERM-SCORE");

    private static final SubLSymbol $OPEN_TERM_SCORE = makeKeyword("OPEN-TERM-SCORE");

    private static final SubLSymbol MAKE_AR_CONCEPT = makeSymbol("MAKE-AR-CONCEPT");

    private static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_AR_CONCEPT_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-AR-CONCEPT-METHOD");

    private static final SubLString $str148$__AR_CONCEPT__S__S_ = makeString("#<AR-CONCEPT ~S ~S>");

    private static final SubLSymbol SXHASH_AR_CONCEPT_METHOD = makeSymbol("SXHASH-AR-CONCEPT-METHOD");

    private static final SubLSymbol AR_TEMPLATE = makeSymbol("AR-TEMPLATE");

    private static final SubLSymbol AR_TEMPLATE_P = makeSymbol("AR-TEMPLATE-P");

    private static final SubLList $list153 = list(makeSymbol("ID"), makeSymbol("CONCEPT"), makeSymbol("FORMULA"), makeSymbol("PROMPT"), makeSymbol("CHOICE-TABLE"), makeSymbol("AGGLOMERATIONS"));

    private static final SubLList $list154 = list(makeKeyword("ID"), makeKeyword("CONCEPT"), makeKeyword("FORMULA"), makeKeyword("PROMPT"), makeKeyword("CHOICE-TABLE"), makeKeyword("AGGLOMERATIONS"));

    private static final SubLList $list155 = list(makeSymbol("AR-TEMPLATE-ID"), makeSymbol("AR-TEMPLATE-CONCEPT"), makeSymbol("AR-TEMPLATE-FORMULA"), makeSymbol("AR-TEMPLATE-PROMPT"), makeSymbol("AR-TEMPLATE-CHOICE-TABLE"), makeSymbol("AR-TEMPLATE-AGGLOMERATIONS"));

    private static final SubLList $list156 = list(makeSymbol("_CSETF-AR-TEMPLATE-ID"), makeSymbol("_CSETF-AR-TEMPLATE-CONCEPT"), makeSymbol("_CSETF-AR-TEMPLATE-FORMULA"), makeSymbol("_CSETF-AR-TEMPLATE-PROMPT"), makeSymbol("_CSETF-AR-TEMPLATE-CHOICE-TABLE"), makeSymbol("_CSETF-AR-TEMPLATE-AGGLOMERATIONS"));

    private static final SubLSymbol AR_TEMPLATE_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("AR-TEMPLATE-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLList $list158 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("AR-TEMPLATE-P"));

    private static final SubLSymbol AR_TEMPLATE_ID = makeSymbol("AR-TEMPLATE-ID");

    private static final SubLSymbol _CSETF_AR_TEMPLATE_ID = makeSymbol("_CSETF-AR-TEMPLATE-ID");

    private static final SubLSymbol AR_TEMPLATE_CONCEPT = makeSymbol("AR-TEMPLATE-CONCEPT");

    private static final SubLSymbol _CSETF_AR_TEMPLATE_CONCEPT = makeSymbol("_CSETF-AR-TEMPLATE-CONCEPT");

    private static final SubLSymbol AR_TEMPLATE_FORMULA = makeSymbol("AR-TEMPLATE-FORMULA");

    private static final SubLSymbol _CSETF_AR_TEMPLATE_FORMULA = makeSymbol("_CSETF-AR-TEMPLATE-FORMULA");

    private static final SubLSymbol AR_TEMPLATE_PROMPT = makeSymbol("AR-TEMPLATE-PROMPT");

    private static final SubLSymbol _CSETF_AR_TEMPLATE_PROMPT = makeSymbol("_CSETF-AR-TEMPLATE-PROMPT");

    private static final SubLSymbol AR_TEMPLATE_CHOICE_TABLE = makeSymbol("AR-TEMPLATE-CHOICE-TABLE");

    private static final SubLSymbol _CSETF_AR_TEMPLATE_CHOICE_TABLE = makeSymbol("_CSETF-AR-TEMPLATE-CHOICE-TABLE");

    private static final SubLSymbol AR_TEMPLATE_AGGLOMERATIONS = makeSymbol("AR-TEMPLATE-AGGLOMERATIONS");

    private static final SubLSymbol _CSETF_AR_TEMPLATE_AGGLOMERATIONS = makeSymbol("_CSETF-AR-TEMPLATE-AGGLOMERATIONS");

    private static final SubLSymbol MAKE_AR_TEMPLATE = makeSymbol("MAKE-AR-TEMPLATE");

    private static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_AR_TEMPLATE_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-AR-TEMPLATE-METHOD");

    private static final SubLSymbol SXHASH_AR_TEMPLATE_METHOD = makeSymbol("SXHASH-AR-TEMPLATE-METHOD");

    private static final SubLSymbol AR_STATE = makeSymbol("AR-STATE");

    private static final SubLSymbol AR_STATE_P = makeSymbol("AR-STATE-P");

    private static final SubLList $list181 = list(new SubLObject[]{ makeSymbol("ISG"), makeSymbol("INDEX"), makeSymbol("SOURCE-SENTENCES"), makeSymbol("FOCUS-SENTENCE"), makeSymbol("COMPLETED-SENTENCES"), makeSymbol("UNKNOWN-PHRASES"), makeSymbol("REJECTED-PHRASES"), makeSymbol("IRRELEVANT-PHRASES"), makeSymbol("AMBIGUOUS-PHRASES"), makeSymbol("ASSUMED-PHRASES"), makeSymbol("PENDING-PHRASES"), makeSymbol("ACCEPTED-PHRASES"), makeSymbol("PENDING-CONCEPTS"), makeSymbol("ACCEPTED-CONCEPTS"), makeSymbol("CANDIDATE-CYCLS"), makeSymbol("ASSERTED-ASSERTIONS"), makeSymbol("TERM-TEMPLATES"), makeSymbol("ASSERT-TEMPLATES") });

    private static final SubLList $list182 = list(new SubLObject[]{ makeKeyword("ISG"), makeKeyword("INDEX"), makeKeyword("SOURCE-SENTENCES"), makeKeyword("FOCUS-SENTENCE"), makeKeyword("COMPLETED-SENTENCES"), makeKeyword("UNKNOWN-PHRASES"), makeKeyword("REJECTED-PHRASES"), makeKeyword("IRRELEVANT-PHRASES"), makeKeyword("AMBIGUOUS-PHRASES"), makeKeyword("ASSUMED-PHRASES"), makeKeyword("PENDING-PHRASES"), makeKeyword("ACCEPTED-PHRASES"), makeKeyword("PENDING-CONCEPTS"), makeKeyword("ACCEPTED-CONCEPTS"), makeKeyword("CANDIDATE-CYCLS"), makeKeyword("ASSERTED-ASSERTIONS"), makeKeyword("TERM-TEMPLATES"), makeKeyword("ASSERT-TEMPLATES") });

    private static final SubLList $list183 = list(new SubLObject[]{ makeSymbol("AR-STATE-ISG"), makeSymbol("AR-STATE-INDEX"), makeSymbol("AR-STATE-SOURCE-SENTENCES"), makeSymbol("AR-STATE-FOCUS-SENTENCE"), makeSymbol("AR-STATE-COMPLETED-SENTENCES"), makeSymbol("AR-STATE-UNKNOWN-PHRASES"), makeSymbol("AR-STATE-REJECTED-PHRASES"), makeSymbol("AR-STATE-IRRELEVANT-PHRASES"), makeSymbol("AR-STATE-AMBIGUOUS-PHRASES"), makeSymbol("AR-STATE-ASSUMED-PHRASES"), makeSymbol("AR-STATE-PENDING-PHRASES"), makeSymbol("AR-STATE-ACCEPTED-PHRASES"), makeSymbol("AR-STATE-PENDING-CONCEPTS"), makeSymbol("AR-STATE-ACCEPTED-CONCEPTS"), makeSymbol("AR-STATE-CANDIDATE-CYCLS"), makeSymbol("AR-STATE-ASSERTED-ASSERTIONS"), makeSymbol("AR-STATE-TERM-TEMPLATES"), makeSymbol("AR-STATE-ASSERT-TEMPLATES") });

    private static final SubLList $list184 = list(new SubLObject[]{ makeSymbol("_CSETF-AR-STATE-ISG"), makeSymbol("_CSETF-AR-STATE-INDEX"), makeSymbol("_CSETF-AR-STATE-SOURCE-SENTENCES"), makeSymbol("_CSETF-AR-STATE-FOCUS-SENTENCE"), makeSymbol("_CSETF-AR-STATE-COMPLETED-SENTENCES"), makeSymbol("_CSETF-AR-STATE-UNKNOWN-PHRASES"), makeSymbol("_CSETF-AR-STATE-REJECTED-PHRASES"), makeSymbol("_CSETF-AR-STATE-IRRELEVANT-PHRASES"), makeSymbol("_CSETF-AR-STATE-AMBIGUOUS-PHRASES"), makeSymbol("_CSETF-AR-STATE-ASSUMED-PHRASES"), makeSymbol("_CSETF-AR-STATE-PENDING-PHRASES"), makeSymbol("_CSETF-AR-STATE-ACCEPTED-PHRASES"), makeSymbol("_CSETF-AR-STATE-PENDING-CONCEPTS"), makeSymbol("_CSETF-AR-STATE-ACCEPTED-CONCEPTS"), makeSymbol("_CSETF-AR-STATE-CANDIDATE-CYCLS"), makeSymbol("_CSETF-AR-STATE-ASSERTED-ASSERTIONS"), makeSymbol("_CSETF-AR-STATE-TERM-TEMPLATES"), makeSymbol("_CSETF-AR-STATE-ASSERT-TEMPLATES") });

    private static final SubLSymbol AR_STATE_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("AR-STATE-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLList $list186 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("AR-STATE-P"));

    private static final SubLSymbol AR_STATE_ISG = makeSymbol("AR-STATE-ISG");

    private static final SubLSymbol _CSETF_AR_STATE_ISG = makeSymbol("_CSETF-AR-STATE-ISG");

    private static final SubLSymbol AR_STATE_INDEX = makeSymbol("AR-STATE-INDEX");

    private static final SubLSymbol _CSETF_AR_STATE_INDEX = makeSymbol("_CSETF-AR-STATE-INDEX");

    private static final SubLSymbol AR_STATE_SOURCE_SENTENCES = makeSymbol("AR-STATE-SOURCE-SENTENCES");

    private static final SubLSymbol _CSETF_AR_STATE_SOURCE_SENTENCES = makeSymbol("_CSETF-AR-STATE-SOURCE-SENTENCES");

    private static final SubLSymbol AR_STATE_FOCUS_SENTENCE = makeSymbol("AR-STATE-FOCUS-SENTENCE");

    private static final SubLSymbol _CSETF_AR_STATE_FOCUS_SENTENCE = makeSymbol("_CSETF-AR-STATE-FOCUS-SENTENCE");

    private static final SubLSymbol AR_STATE_COMPLETED_SENTENCES = makeSymbol("AR-STATE-COMPLETED-SENTENCES");

    private static final SubLSymbol _CSETF_AR_STATE_COMPLETED_SENTENCES = makeSymbol("_CSETF-AR-STATE-COMPLETED-SENTENCES");

    private static final SubLSymbol AR_STATE_UNKNOWN_PHRASES = makeSymbol("AR-STATE-UNKNOWN-PHRASES");

    private static final SubLSymbol _CSETF_AR_STATE_UNKNOWN_PHRASES = makeSymbol("_CSETF-AR-STATE-UNKNOWN-PHRASES");

    private static final SubLSymbol AR_STATE_REJECTED_PHRASES = makeSymbol("AR-STATE-REJECTED-PHRASES");

    private static final SubLSymbol _CSETF_AR_STATE_REJECTED_PHRASES = makeSymbol("_CSETF-AR-STATE-REJECTED-PHRASES");

    private static final SubLSymbol AR_STATE_IRRELEVANT_PHRASES = makeSymbol("AR-STATE-IRRELEVANT-PHRASES");

    private static final SubLSymbol _CSETF_AR_STATE_IRRELEVANT_PHRASES = makeSymbol("_CSETF-AR-STATE-IRRELEVANT-PHRASES");

    private static final SubLSymbol AR_STATE_AMBIGUOUS_PHRASES = makeSymbol("AR-STATE-AMBIGUOUS-PHRASES");

    private static final SubLSymbol _CSETF_AR_STATE_AMBIGUOUS_PHRASES = makeSymbol("_CSETF-AR-STATE-AMBIGUOUS-PHRASES");

    private static final SubLSymbol AR_STATE_ASSUMED_PHRASES = makeSymbol("AR-STATE-ASSUMED-PHRASES");

    private static final SubLSymbol _CSETF_AR_STATE_ASSUMED_PHRASES = makeSymbol("_CSETF-AR-STATE-ASSUMED-PHRASES");

    private static final SubLSymbol AR_STATE_PENDING_PHRASES = makeSymbol("AR-STATE-PENDING-PHRASES");

    private static final SubLSymbol _CSETF_AR_STATE_PENDING_PHRASES = makeSymbol("_CSETF-AR-STATE-PENDING-PHRASES");

    private static final SubLSymbol AR_STATE_ACCEPTED_PHRASES = makeSymbol("AR-STATE-ACCEPTED-PHRASES");

    private static final SubLSymbol _CSETF_AR_STATE_ACCEPTED_PHRASES = makeSymbol("_CSETF-AR-STATE-ACCEPTED-PHRASES");

    private static final SubLSymbol AR_STATE_PENDING_CONCEPTS = makeSymbol("AR-STATE-PENDING-CONCEPTS");

    private static final SubLSymbol _CSETF_AR_STATE_PENDING_CONCEPTS = makeSymbol("_CSETF-AR-STATE-PENDING-CONCEPTS");

    private static final SubLSymbol AR_STATE_ACCEPTED_CONCEPTS = makeSymbol("AR-STATE-ACCEPTED-CONCEPTS");

    private static final SubLSymbol _CSETF_AR_STATE_ACCEPTED_CONCEPTS = makeSymbol("_CSETF-AR-STATE-ACCEPTED-CONCEPTS");

    private static final SubLSymbol AR_STATE_CANDIDATE_CYCLS = makeSymbol("AR-STATE-CANDIDATE-CYCLS");

    private static final SubLSymbol _CSETF_AR_STATE_CANDIDATE_CYCLS = makeSymbol("_CSETF-AR-STATE-CANDIDATE-CYCLS");

    private static final SubLSymbol AR_STATE_ASSERTED_ASSERTIONS = makeSymbol("AR-STATE-ASSERTED-ASSERTIONS");

    private static final SubLSymbol _CSETF_AR_STATE_ASSERTED_ASSERTIONS = makeSymbol("_CSETF-AR-STATE-ASSERTED-ASSERTIONS");

    private static final SubLSymbol AR_STATE_TERM_TEMPLATES = makeSymbol("AR-STATE-TERM-TEMPLATES");

    private static final SubLSymbol _CSETF_AR_STATE_TERM_TEMPLATES = makeSymbol("_CSETF-AR-STATE-TERM-TEMPLATES");

    private static final SubLSymbol AR_STATE_ASSERT_TEMPLATES = makeSymbol("AR-STATE-ASSERT-TEMPLATES");

    private static final SubLSymbol _CSETF_AR_STATE_ASSERT_TEMPLATES = makeSymbol("_CSETF-AR-STATE-ASSERT-TEMPLATES");

    private static final SubLSymbol MAKE_AR_STATE = makeSymbol("MAKE-AR-STATE");

    private static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_AR_STATE_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-AR-STATE-METHOD");

    private static final SubLSymbol $sym243$AR_PHRASE_SPAN_LENGTH_ = makeSymbol("AR-PHRASE-SPAN-LENGTH>");

    private static final SubLSymbol $sym244$AR_CONCEPT_ASSERTION_ = makeSymbol("AR-CONCEPT-ASSERTION?");

    private static final SubLSymbol $sym245$AR_CONCEPT_QUERY_ = makeSymbol("AR-CONCEPT-QUERY?");

    private static final SubLSymbol $sym246$_ = makeSymbol("<");

    private static final SubLSymbol NOT_EQL = makeSymbol("NOT-EQL");

    private static final SubLString $str250$no_discourse_context = makeString("no discourse-context");

    private static final SubLSymbol $sym252$RKF_DISC_IMPLIED_INDEXICALS_FORMULA_ = makeSymbol("RKF-DISC-IMPLIED-INDEXICALS-FORMULA?");

    private static final SubLSymbol AR_DETERMINE_CONCEPT_SENTENCES = makeSymbol("AR-DETERMINE-CONCEPT-SENTENCES");

    private static final SubLList $list257 = list(list(makeSymbol("*AR-CONCEPT-GROUNDING-MAP*"), NIL));

    private static final SubLList $list258 = list(makeSymbol("ENSURE-AR-CONCEPT-GROUNDING-MAP"));

    private static final SubLInteger $int$10000 = makeInteger(10000);



    private static final SubLSymbol $sym265$_ = makeSymbol(">");

    private static final SubLSymbol AR_CONCEPT_COMPLEXITY = makeSymbol("AR-CONCEPT-COMPLEXITY");

    private static final SubLSymbol AR_PHRASE_DIVIDE_EQ_BEST_LAMBDA_SUBSTITUTE = makeSymbol("AR-PHRASE-DIVIDE-EQ-BEST-LAMBDA-SUBSTITUTE");





    private static final SubLString $$$Assisted_Reader_reading_texts = makeString("Assisted Reader reading texts");

    private static final SubLSymbol RKF_AR_ACT_ADD_SOURCE_TEXTS_BACKGROUND_INTERNAL = makeSymbol("RKF-AR-ACT-ADD-SOURCE-TEXTS-BACKGROUND-INTERNAL");

    private static final SubLSymbol $IGNORE_ERRORS_TARGET = makeKeyword("IGNORE-ERRORS-TARGET");

    private static final SubLSymbol IGNORE_ERRORS_HANDLER = makeSymbol("IGNORE-ERRORS-HANDLER", "SUBLISP");

    private static final SubLString $str276$Assisted_Reader_rewriting_a_sente = makeString("Assisted Reader rewriting a sentence");

    private static final SubLSymbol RKF_AR_ACT_ADD_REWRITE_TEXTS_BACKGROUND_INTERNAL = makeSymbol("RKF-AR-ACT-ADD-REWRITE-TEXTS-BACKGROUND-INTERNAL");

    private static final SubLSymbol RKF_SENTENCE_READER = makeSymbol("RKF-SENTENCE-READER");

    private static final SubLSymbol RKF_QUESTION_READER = makeSymbol("RKF-QUESTION-READER");

    private static final SubLSymbol RKF_CONCEPT_HARVESTER = makeSymbol("RKF-CONCEPT-HARVESTER");

    private static final SubLList $list281 = list(list(makeSymbol("RKF-QUESTION-READER"), reader_make_constant_shell("QuestionTemplate")), list(makeSymbol("RKF-SENTENCE-READER"), reader_make_constant_shell("STemplate")));

    private static final SubLSymbol $sym286$RTP_TEMPLATE_CATEGORY_ = makeSymbol("RTP-TEMPLATE-CATEGORY?");



    private static final SubLSymbol $sym288$UNKNOWN_INSTANCE_INDEXED_EXPRESSION_ = makeSymbol("UNKNOWN-INSTANCE-INDEXED-EXPRESSION?");

    private static final SubLSymbol ROP_FROM_UNKNOWN_INSTANCE_INDEXED_FN = makeSymbol("ROP-FROM-UNKNOWN-INSTANCE-INDEXED-FN");

    private static final SubLSymbol ITP_SEQUEL = makeSymbol("ITP-SEQUEL");

    private static final SubLString $str291$UIA_use = makeString("UIA-use");

    private static final SubLString $$$Medium = makeString("Medium");











    private static final SubLSymbol $sym302$RKF_REFORMULATABLE_TERM_ = makeSymbol("RKF-REFORMULATABLE-TERM?");

    private static final SubLList $list304 = list(reader_make_constant_shell("VariableFn"), reader_make_constant_shell("TheVPParse"), reader_make_constant_shell("SomeFn"), reader_make_constant_shell("TheActiveSubject"), reader_make_constant_shell("TheResultOfParsing"));







    private static final SubLList $list309 = list(list(makeSymbol("CONSTRAINTS")), makeSymbol("&BODY"), makeSymbol("BODY"));

    public static final SubLSymbol $rkf_ar_additional_constraints$ = makeSymbol("*RKF-AR-ADDITIONAL-CONSTRAINTS*");

    private static final SubLSymbol KEYWORD_IMPOSTOR_P = makeSymbol("KEYWORD-IMPOSTOR-P");

    private static final SubLSymbol KEYWORD_FROM_IMPOSTOR = makeSymbol("KEYWORD-FROM-IMPOSTOR");

    private static final SubLList $list313 = list(reader_make_constant_shell("TheResultOfParsing"), reader_make_constant_shell("TheCoordinationSet"), reader_make_constant_shell("RewriteSequenceFn"), reader_make_constant_shell("TheSpec"), reader_make_constant_shell("TheInstance"), reader_make_constant_shell("The"));

    private static final SubLSymbol RKF_AR_PHRASE_SUBSUMED = makeSymbol("RKF-AR-PHRASE-SUBSUMED");



    private static final SubLList $list316 = list(reader_make_constant_shell("TheSpec"), reader_make_constant_shell("TheInstance"));

    private static final SubLSymbol RKF_AR_CONTEXT_REFERENCE_P = makeSymbol("RKF-AR-CONTEXT-REFERENCE-P");





    private static final SubLSymbol RELATION_ARGS_SORTED_BY_RESTRICTION = makeSymbol("RELATION-ARGS-SORTED-BY-RESTRICTION");

    private static final SubLSymbol $relation_args_sorted_by_restriction_caching_state$ = makeSymbol("*RELATION-ARGS-SORTED-BY-RESTRICTION-CACHING-STATE*");

    private static final SubLSymbol ALL_RELATION_ARGS = makeSymbol("ALL-RELATION-ARGS");



    private static final SubLSymbol $all_relation_args_caching_state$ = makeSymbol("*ALL-RELATION-ARGS-CACHING-STATE*");

    public static final SubLObject with_ar_lock_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject body = current;
            return listS(WITH_LOCK_HELD, $list_alt2, append(body, NIL));
        }
    }

    public static SubLObject with_ar_lock(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(WITH_LOCK_HELD, $list2, append(body, NIL));
    }

    public static final SubLObject ar_sentence_print_function_trampoline_alt(SubLObject v_object, SubLObject stream) {
        compatibility.default_struct_print_function(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject ar_sentence_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        compatibility.default_struct_print_function(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject ar_sentence_p_alt(SubLObject v_object) {
        return v_object.getClass() == com.cyc.cycjava.cycl.rkf_assisted_reader.$ar_sentence_native.class ? ((SubLObject) (T)) : NIL;
    }

    public static SubLObject ar_sentence_p(final SubLObject v_object) {
        return v_object.getClass() == com.cyc.cycjava.cycl.rkf_assisted_reader.$ar_sentence_native.class ? T : NIL;
    }

    public static final SubLObject ar_sentence_id_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, AR_SENTENCE_P);
        return v_object.getField2();
    }

    public static SubLObject ar_sentence_id(final SubLObject v_object) {
        assert NIL != ar_sentence_p(v_object) : "! rkf_assisted_reader.ar_sentence_p(v_object) " + "rkf_assisted_reader.ar_sentence_p error :" + v_object;
        return v_object.getField2();
    }

    public static final SubLObject ar_sentence_plaintext_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, AR_SENTENCE_P);
        return v_object.getField3();
    }

    public static SubLObject ar_sentence_plaintext(final SubLObject v_object) {
        assert NIL != ar_sentence_p(v_object) : "! rkf_assisted_reader.ar_sentence_p(v_object) " + "rkf_assisted_reader.ar_sentence_p error :" + v_object;
        return v_object.getField3();
    }

    public static final SubLObject ar_sentence_token_vector_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, AR_SENTENCE_P);
        return v_object.getField4();
    }

    public static SubLObject ar_sentence_token_vector(final SubLObject v_object) {
        assert NIL != ar_sentence_p(v_object) : "! rkf_assisted_reader.ar_sentence_p(v_object) " + "rkf_assisted_reader.ar_sentence_p error :" + v_object;
        return v_object.getField4();
    }

    public static final SubLObject ar_sentence_clarifications_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, AR_SENTENCE_P);
        return v_object.getField5();
    }

    public static SubLObject ar_sentence_clarifications(final SubLObject v_object) {
        assert NIL != ar_sentence_p(v_object) : "! rkf_assisted_reader.ar_sentence_p(v_object) " + "rkf_assisted_reader.ar_sentence_p error :" + v_object;
        return v_object.getField5();
    }

    public static final SubLObject ar_sentence_source_sentence_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, AR_SENTENCE_P);
        return v_object.getField6();
    }

    public static SubLObject ar_sentence_source_sentence(final SubLObject v_object) {
        assert NIL != ar_sentence_p(v_object) : "! rkf_assisted_reader.ar_sentence_p(v_object) " + "rkf_assisted_reader.ar_sentence_p error :" + v_object;
        return v_object.getField6();
    }

    public static final SubLObject ar_sentence_phrases_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, AR_SENTENCE_P);
        return v_object.getField7();
    }

    public static SubLObject ar_sentence_phrases(final SubLObject v_object) {
        assert NIL != ar_sentence_p(v_object) : "! rkf_assisted_reader.ar_sentence_p(v_object) " + "rkf_assisted_reader.ar_sentence_p error :" + v_object;
        return v_object.getField7();
    }

    public static final SubLObject _csetf_ar_sentence_id_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, AR_SENTENCE_P);
        return v_object.setField2(value);
    }

    public static SubLObject _csetf_ar_sentence_id(final SubLObject v_object, final SubLObject value) {
        assert NIL != ar_sentence_p(v_object) : "! rkf_assisted_reader.ar_sentence_p(v_object) " + "rkf_assisted_reader.ar_sentence_p error :" + v_object;
        return v_object.setField2(value);
    }

    public static final SubLObject _csetf_ar_sentence_plaintext_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, AR_SENTENCE_P);
        return v_object.setField3(value);
    }

    public static SubLObject _csetf_ar_sentence_plaintext(final SubLObject v_object, final SubLObject value) {
        assert NIL != ar_sentence_p(v_object) : "! rkf_assisted_reader.ar_sentence_p(v_object) " + "rkf_assisted_reader.ar_sentence_p error :" + v_object;
        return v_object.setField3(value);
    }

    public static final SubLObject _csetf_ar_sentence_token_vector_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, AR_SENTENCE_P);
        return v_object.setField4(value);
    }

    public static SubLObject _csetf_ar_sentence_token_vector(final SubLObject v_object, final SubLObject value) {
        assert NIL != ar_sentence_p(v_object) : "! rkf_assisted_reader.ar_sentence_p(v_object) " + "rkf_assisted_reader.ar_sentence_p error :" + v_object;
        return v_object.setField4(value);
    }

    public static final SubLObject _csetf_ar_sentence_clarifications_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, AR_SENTENCE_P);
        return v_object.setField5(value);
    }

    public static SubLObject _csetf_ar_sentence_clarifications(final SubLObject v_object, final SubLObject value) {
        assert NIL != ar_sentence_p(v_object) : "! rkf_assisted_reader.ar_sentence_p(v_object) " + "rkf_assisted_reader.ar_sentence_p error :" + v_object;
        return v_object.setField5(value);
    }

    public static final SubLObject _csetf_ar_sentence_source_sentence_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, AR_SENTENCE_P);
        return v_object.setField6(value);
    }

    public static SubLObject _csetf_ar_sentence_source_sentence(final SubLObject v_object, final SubLObject value) {
        assert NIL != ar_sentence_p(v_object) : "! rkf_assisted_reader.ar_sentence_p(v_object) " + "rkf_assisted_reader.ar_sentence_p error :" + v_object;
        return v_object.setField6(value);
    }

    public static final SubLObject _csetf_ar_sentence_phrases_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, AR_SENTENCE_P);
        return v_object.setField7(value);
    }

    public static SubLObject _csetf_ar_sentence_phrases(final SubLObject v_object, final SubLObject value) {
        assert NIL != ar_sentence_p(v_object) : "! rkf_assisted_reader.ar_sentence_p(v_object) " + "rkf_assisted_reader.ar_sentence_p error :" + v_object;
        return v_object.setField7(value);
    }

    public static final SubLObject make_ar_sentence_alt(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        {
            SubLObject v_new = new com.cyc.cycjava.cycl.rkf_assisted_reader.$ar_sentence_native();
            SubLObject next = NIL;
            for (next = arglist; NIL != next; next = cddr(next)) {
                {
                    SubLObject current_arg = next.first();
                    SubLObject current_value = cadr(next);
                    SubLObject pcase_var = current_arg;
                    if (pcase_var.eql($ID)) {
                        _csetf_ar_sentence_id(v_new, current_value);
                    } else {
                        if (pcase_var.eql($PLAINTEXT)) {
                            _csetf_ar_sentence_plaintext(v_new, current_value);
                        } else {
                            if (pcase_var.eql($TOKEN_VECTOR)) {
                                _csetf_ar_sentence_token_vector(v_new, current_value);
                            } else {
                                if (pcase_var.eql($CLARIFICATIONS)) {
                                    _csetf_ar_sentence_clarifications(v_new, current_value);
                                } else {
                                    if (pcase_var.eql($SOURCE_SENTENCE)) {
                                        _csetf_ar_sentence_source_sentence(v_new, current_value);
                                    } else {
                                        if (pcase_var.eql($PHRASES)) {
                                            _csetf_ar_sentence_phrases(v_new, current_value);
                                        } else {
                                            Errors.error($str_alt29$Invalid_slot__S_for_construction_, current_arg);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return v_new;
        }
    }

    public static SubLObject make_ar_sentence(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new com.cyc.cycjava.cycl.rkf_assisted_reader.$ar_sentence_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
            current_arg = next.first();
            current_value = cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql($ID)) {
                _csetf_ar_sentence_id(v_new, current_value);
            } else
                if (pcase_var.eql($PLAINTEXT)) {
                    _csetf_ar_sentence_plaintext(v_new, current_value);
                } else
                    if (pcase_var.eql($TOKEN_VECTOR)) {
                        _csetf_ar_sentence_token_vector(v_new, current_value);
                    } else
                        if (pcase_var.eql($CLARIFICATIONS)) {
                            _csetf_ar_sentence_clarifications(v_new, current_value);
                        } else
                            if (pcase_var.eql($SOURCE_SENTENCE)) {
                                _csetf_ar_sentence_source_sentence(v_new, current_value);
                            } else
                                if (pcase_var.eql($PHRASES)) {
                                    _csetf_ar_sentence_phrases(v_new, current_value);
                                } else {
                                    Errors.error($str30$Invalid_slot__S_for_construction_, current_arg);
                                }





        }
        return v_new;
    }

    public static SubLObject visit_defstruct_ar_sentence(final SubLObject obj, final SubLObject visitor_fn) {
        funcall(visitor_fn, obj, $BEGIN, MAKE_AR_SENTENCE, SIX_INTEGER);
        funcall(visitor_fn, obj, $SLOT, $ID, ar_sentence_id(obj));
        funcall(visitor_fn, obj, $SLOT, $PLAINTEXT, ar_sentence_plaintext(obj));
        funcall(visitor_fn, obj, $SLOT, $TOKEN_VECTOR, ar_sentence_token_vector(obj));
        funcall(visitor_fn, obj, $SLOT, $CLARIFICATIONS, ar_sentence_clarifications(obj));
        funcall(visitor_fn, obj, $SLOT, $SOURCE_SENTENCE, ar_sentence_source_sentence(obj));
        funcall(visitor_fn, obj, $SLOT, $PHRASES, ar_sentence_phrases(obj));
        funcall(visitor_fn, obj, $END, MAKE_AR_SENTENCE, SIX_INTEGER);
        return obj;
    }

    public static SubLObject visit_defstruct_object_ar_sentence_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_ar_sentence(obj, visitor_fn);
    }

    public static final SubLObject sxhash_ar_sentence_method_alt(SubLObject v_object) {
        return Sxhash.sxhash(ar_sentence_id(v_object));
    }

    public static SubLObject sxhash_ar_sentence_method(final SubLObject v_object) {
        return Sxhash.sxhash(ar_sentence_id(v_object));
    }

    public static final SubLObject new_ar_sentence_alt(SubLObject state, SubLObject plaintext) {
        {
            SubLObject sentence = make_ar_sentence(UNPROVIDED);
            SubLObject lock = $ar_lock$.getGlobalValue();
            SubLObject release = NIL;
            try {
                release = seize_lock(lock);
                {
                    SubLObject id = next_ar_state_id(state);
                    _csetf_ar_sentence_id(sentence, id);
                    _csetf_ar_sentence_plaintext(sentence, plaintext);
                    add_ar_object_index(state, id, sentence);
                }
            } finally {
                if (NIL != release) {
                    release_lock(lock);
                }
            }
            return sentence;
        }
    }

    public static SubLObject new_ar_sentence(final SubLObject state, final SubLObject plaintext) {
        final SubLObject sentence = make_ar_sentence(UNPROVIDED);
        SubLObject release = NIL;
        try {
            release = seize_lock($ar_lock$.getGlobalValue());
            final SubLObject id = next_ar_state_id(state);
            _csetf_ar_sentence_id(sentence, id);
            _csetf_ar_sentence_plaintext(sentence, plaintext);
            add_ar_object_index(state, id, sentence);
        } finally {
            if (NIL != release) {
                release_lock($ar_lock$.getGlobalValue());
            }
        }
        return sentence;
    }

    public static final SubLObject note_ar_sentence_token_vector_alt(SubLObject sentence, SubLObject token_vector) {
        SubLTrampolineFile.checkType(sentence, AR_SENTENCE_P);
        SubLTrampolineFile.checkType(token_vector, VECTORP);
        {
            SubLObject lock = $ar_lock$.getGlobalValue();
            SubLObject release = NIL;
            try {
                release = seize_lock(lock);
                _csetf_ar_sentence_token_vector(sentence, token_vector);
            } finally {
                if (NIL != release) {
                    release_lock(lock);
                }
            }
        }
        return sentence;
    }

    public static SubLObject note_ar_sentence_token_vector(final SubLObject sentence, final SubLObject token_vector) {
        assert NIL != ar_sentence_p(sentence) : "! rkf_assisted_reader.ar_sentence_p(sentence) " + ("rkf_assisted_reader.ar_sentence_p(sentence) " + "CommonSymbols.NIL != rkf_assisted_reader.ar_sentence_p(sentence) ") + sentence;
        assert NIL != vectorp(token_vector) : "! vectorp(token_vector) " + ("Types.vectorp(token_vector) " + "CommonSymbols.NIL != Types.vectorp(token_vector) ") + token_vector;
        SubLObject release = NIL;
        try {
            release = seize_lock($ar_lock$.getGlobalValue());
            _csetf_ar_sentence_token_vector(sentence, token_vector);
        } finally {
            if (NIL != release) {
                release_lock($ar_lock$.getGlobalValue());
            }
        }
        return sentence;
    }

    public static final SubLObject add_ar_sentence_phrase_alt(SubLObject sentence, SubLObject phrase) {
        SubLTrampolineFile.checkType(sentence, AR_SENTENCE_P);
        SubLTrampolineFile.checkType(phrase, AR_PHRASE_P);
        {
            SubLObject lock = $ar_lock$.getGlobalValue();
            SubLObject release = NIL;
            try {
                release = seize_lock(lock);
                {
                    SubLObject item_var = phrase;
                    if (NIL == member(item_var, ar_sentence_phrases(sentence), symbol_function(EQL), symbol_function(IDENTITY))) {
                        _csetf_ar_sentence_phrases(sentence, cons(item_var, ar_sentence_phrases(sentence)));
                    }
                }
            } finally {
                if (NIL != release) {
                    release_lock(lock);
                }
            }
        }
        return sentence;
    }

    public static SubLObject add_ar_sentence_phrase(final SubLObject sentence, final SubLObject phrase) {
        assert NIL != ar_sentence_p(sentence) : "! rkf_assisted_reader.ar_sentence_p(sentence) " + ("rkf_assisted_reader.ar_sentence_p(sentence) " + "CommonSymbols.NIL != rkf_assisted_reader.ar_sentence_p(sentence) ") + sentence;
        assert NIL != ar_phrase_p(phrase) : "! rkf_assisted_reader.ar_phrase_p(phrase) " + ("rkf_assisted_reader.ar_phrase_p(phrase) " + "CommonSymbols.NIL != rkf_assisted_reader.ar_phrase_p(phrase) ") + phrase;
        SubLObject release = NIL;
        try {
            release = seize_lock($ar_lock$.getGlobalValue());
            if (NIL == member(phrase, ar_sentence_phrases(sentence), symbol_function(EQL), symbol_function(IDENTITY))) {
                _csetf_ar_sentence_phrases(sentence, cons(phrase, ar_sentence_phrases(sentence)));
            }
        } finally {
            if (NIL != release) {
                release_lock($ar_lock$.getGlobalValue());
            }
        }
        return sentence;
    }

    public static final SubLObject add_ar_sentence_clarification_alt(SubLObject sentence, SubLObject clarification) {
        SubLTrampolineFile.checkType(sentence, AR_SENTENCE_P);
        SubLTrampolineFile.checkType(clarification, AR_SENTENCE_P);
        {
            SubLObject lock = $ar_lock$.getGlobalValue();
            SubLObject release = NIL;
            try {
                release = seize_lock(lock);
                {
                    SubLObject item_var = clarification;
                    if (NIL == member(item_var, ar_sentence_clarifications(sentence), symbol_function(EQL), symbol_function(IDENTITY))) {
                        _csetf_ar_sentence_clarifications(sentence, cons(item_var, ar_sentence_clarifications(sentence)));
                    }
                }
            } finally {
                if (NIL != release) {
                    release_lock(lock);
                }
            }
        }
        return sentence;
    }

    public static SubLObject add_ar_sentence_clarification(final SubLObject sentence, final SubLObject clarification) {
        assert NIL != ar_sentence_p(sentence) : "! rkf_assisted_reader.ar_sentence_p(sentence) " + ("rkf_assisted_reader.ar_sentence_p(sentence) " + "CommonSymbols.NIL != rkf_assisted_reader.ar_sentence_p(sentence) ") + sentence;
        assert NIL != ar_sentence_p(clarification) : "! rkf_assisted_reader.ar_sentence_p(clarification) " + ("rkf_assisted_reader.ar_sentence_p(clarification) " + "CommonSymbols.NIL != rkf_assisted_reader.ar_sentence_p(clarification) ") + clarification;
        SubLObject release = NIL;
        try {
            release = seize_lock($ar_lock$.getGlobalValue());
            if (NIL == member(clarification, ar_sentence_clarifications(sentence), symbol_function(EQL), symbol_function(IDENTITY))) {
                _csetf_ar_sentence_clarifications(sentence, cons(clarification, ar_sentence_clarifications(sentence)));
            }
        } finally {
            if (NIL != release) {
                release_lock($ar_lock$.getGlobalValue());
            }
        }
        return sentence;
    }

    public static final SubLObject note_ar_sentence_source_sentence_alt(SubLObject clarification, SubLObject sentence) {
        SubLTrampolineFile.checkType(clarification, AR_SENTENCE_P);
        SubLTrampolineFile.checkType(sentence, AR_SENTENCE_P);
        {
            SubLObject lock = $ar_lock$.getGlobalValue();
            SubLObject release = NIL;
            try {
                release = seize_lock(lock);
                _csetf_ar_sentence_source_sentence(clarification, sentence);
            } finally {
                if (NIL != release) {
                    release_lock(lock);
                }
            }
        }
        return clarification;
    }

    public static SubLObject note_ar_sentence_source_sentence(final SubLObject clarification, final SubLObject sentence) {
        assert NIL != ar_sentence_p(clarification) : "! rkf_assisted_reader.ar_sentence_p(clarification) " + ("rkf_assisted_reader.ar_sentence_p(clarification) " + "CommonSymbols.NIL != rkf_assisted_reader.ar_sentence_p(clarification) ") + clarification;
        assert NIL != ar_sentence_p(sentence) : "! rkf_assisted_reader.ar_sentence_p(sentence) " + ("rkf_assisted_reader.ar_sentence_p(sentence) " + "CommonSymbols.NIL != rkf_assisted_reader.ar_sentence_p(sentence) ") + sentence;
        SubLObject release = NIL;
        try {
            release = seize_lock($ar_lock$.getGlobalValue());
            _csetf_ar_sentence_source_sentence(clarification, sentence);
        } finally {
            if (NIL != release) {
                release_lock($ar_lock$.getGlobalValue());
            }
        }
        return clarification;
    }

    public static final SubLObject ar_token_print_function_trampoline_alt(SubLObject v_object, SubLObject stream) {
        print_ar_token(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject ar_token_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        print_ar_token(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject ar_token_p_alt(SubLObject v_object) {
        return v_object.getClass() == com.cyc.cycjava.cycl.rkf_assisted_reader.$ar_token_native.class ? ((SubLObject) (T)) : NIL;
    }

    public static SubLObject ar_token_p(final SubLObject v_object) {
        return v_object.getClass() == com.cyc.cycjava.cycl.rkf_assisted_reader.$ar_token_native.class ? T : NIL;
    }

    public static final SubLObject ar_token_id_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, AR_TOKEN_P);
        return v_object.getField2();
    }

    public static SubLObject ar_token_id(final SubLObject v_object) {
        assert NIL != ar_token_p(v_object) : "! rkf_assisted_reader.ar_token_p(v_object) " + "rkf_assisted_reader.ar_token_p error :" + v_object;
        return v_object.getField2();
    }

    public static final SubLObject ar_token_text_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, AR_TOKEN_P);
        return v_object.getField3();
    }

    public static SubLObject ar_token_text(final SubLObject v_object) {
        assert NIL != ar_token_p(v_object) : "! rkf_assisted_reader.ar_token_p(v_object) " + "rkf_assisted_reader.ar_token_p error :" + v_object;
        return v_object.getField3();
    }

    public static final SubLObject ar_token_sentence_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, AR_TOKEN_P);
        return v_object.getField4();
    }

    public static SubLObject ar_token_sentence(final SubLObject v_object) {
        assert NIL != ar_token_p(v_object) : "! rkf_assisted_reader.ar_token_p(v_object) " + "rkf_assisted_reader.ar_token_p error :" + v_object;
        return v_object.getField4();
    }

    public static final SubLObject ar_token_number_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, AR_TOKEN_P);
        return v_object.getField5();
    }

    public static SubLObject ar_token_number(final SubLObject v_object) {
        assert NIL != ar_token_p(v_object) : "! rkf_assisted_reader.ar_token_p(v_object) " + "rkf_assisted_reader.ar_token_p error :" + v_object;
        return v_object.getField5();
    }

    public static final SubLObject ar_token_phrases_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, AR_TOKEN_P);
        return v_object.getField6();
    }

    public static SubLObject ar_token_phrases(final SubLObject v_object) {
        assert NIL != ar_token_p(v_object) : "! rkf_assisted_reader.ar_token_p(v_object) " + "rkf_assisted_reader.ar_token_p error :" + v_object;
        return v_object.getField6();
    }

    public static final SubLObject _csetf_ar_token_id_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, AR_TOKEN_P);
        return v_object.setField2(value);
    }

    public static SubLObject _csetf_ar_token_id(final SubLObject v_object, final SubLObject value) {
        assert NIL != ar_token_p(v_object) : "! rkf_assisted_reader.ar_token_p(v_object) " + "rkf_assisted_reader.ar_token_p error :" + v_object;
        return v_object.setField2(value);
    }

    public static final SubLObject _csetf_ar_token_text_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, AR_TOKEN_P);
        return v_object.setField3(value);
    }

    public static SubLObject _csetf_ar_token_text(final SubLObject v_object, final SubLObject value) {
        assert NIL != ar_token_p(v_object) : "! rkf_assisted_reader.ar_token_p(v_object) " + "rkf_assisted_reader.ar_token_p error :" + v_object;
        return v_object.setField3(value);
    }

    public static final SubLObject _csetf_ar_token_sentence_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, AR_TOKEN_P);
        return v_object.setField4(value);
    }

    public static SubLObject _csetf_ar_token_sentence(final SubLObject v_object, final SubLObject value) {
        assert NIL != ar_token_p(v_object) : "! rkf_assisted_reader.ar_token_p(v_object) " + "rkf_assisted_reader.ar_token_p error :" + v_object;
        return v_object.setField4(value);
    }

    public static final SubLObject _csetf_ar_token_number_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, AR_TOKEN_P);
        return v_object.setField5(value);
    }

    public static SubLObject _csetf_ar_token_number(final SubLObject v_object, final SubLObject value) {
        assert NIL != ar_token_p(v_object) : "! rkf_assisted_reader.ar_token_p(v_object) " + "rkf_assisted_reader.ar_token_p error :" + v_object;
        return v_object.setField5(value);
    }

    public static final SubLObject _csetf_ar_token_phrases_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, AR_TOKEN_P);
        return v_object.setField6(value);
    }

    public static SubLObject _csetf_ar_token_phrases(final SubLObject v_object, final SubLObject value) {
        assert NIL != ar_token_p(v_object) : "! rkf_assisted_reader.ar_token_p(v_object) " + "rkf_assisted_reader.ar_token_p error :" + v_object;
        return v_object.setField6(value);
    }

    public static final SubLObject make_ar_token_alt(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        {
            SubLObject v_new = new com.cyc.cycjava.cycl.rkf_assisted_reader.$ar_token_native();
            SubLObject next = NIL;
            for (next = arglist; NIL != next; next = cddr(next)) {
                {
                    SubLObject current_arg = next.first();
                    SubLObject current_value = cadr(next);
                    SubLObject pcase_var = current_arg;
                    if (pcase_var.eql($ID)) {
                        _csetf_ar_token_id(v_new, current_value);
                    } else {
                        if (pcase_var.eql($TEXT)) {
                            _csetf_ar_token_text(v_new, current_value);
                        } else {
                            if (pcase_var.eql($SENTENCE)) {
                                _csetf_ar_token_sentence(v_new, current_value);
                            } else {
                                if (pcase_var.eql($NUMBER)) {
                                    _csetf_ar_token_number(v_new, current_value);
                                } else {
                                    if (pcase_var.eql($PHRASES)) {
                                        _csetf_ar_token_phrases(v_new, current_value);
                                    } else {
                                        Errors.error($str_alt29$Invalid_slot__S_for_construction_, current_arg);
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return v_new;
        }
    }

    public static SubLObject make_ar_token(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new com.cyc.cycjava.cycl.rkf_assisted_reader.$ar_token_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
            current_arg = next.first();
            current_value = cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql($ID)) {
                _csetf_ar_token_id(v_new, current_value);
            } else
                if (pcase_var.eql($TEXT)) {
                    _csetf_ar_token_text(v_new, current_value);
                } else
                    if (pcase_var.eql($SENTENCE)) {
                        _csetf_ar_token_sentence(v_new, current_value);
                    } else
                        if (pcase_var.eql($NUMBER)) {
                            _csetf_ar_token_number(v_new, current_value);
                        } else
                            if (pcase_var.eql($PHRASES)) {
                                _csetf_ar_token_phrases(v_new, current_value);
                            } else {
                                Errors.error($str30$Invalid_slot__S_for_construction_, current_arg);
                            }




        }
        return v_new;
    }

    public static SubLObject visit_defstruct_ar_token(final SubLObject obj, final SubLObject visitor_fn) {
        funcall(visitor_fn, obj, $BEGIN, MAKE_AR_TOKEN, FIVE_INTEGER);
        funcall(visitor_fn, obj, $SLOT, $ID, ar_token_id(obj));
        funcall(visitor_fn, obj, $SLOT, $TEXT, ar_token_text(obj));
        funcall(visitor_fn, obj, $SLOT, $SENTENCE, ar_token_sentence(obj));
        funcall(visitor_fn, obj, $SLOT, $NUMBER, ar_token_number(obj));
        funcall(visitor_fn, obj, $SLOT, $PHRASES, ar_token_phrases(obj));
        funcall(visitor_fn, obj, $END, MAKE_AR_TOKEN, FIVE_INTEGER);
        return obj;
    }

    public static SubLObject visit_defstruct_object_ar_token_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_ar_token(obj, visitor_fn);
    }

    public static final SubLObject print_ar_token_alt(SubLObject v_object, SubLObject stream, SubLObject depth) {
        format(stream, $str_alt54$_A_, ar_token_text(v_object));
        return v_object;
    }

    public static SubLObject print_ar_token(final SubLObject v_object, final SubLObject stream, final SubLObject depth) {
        format(stream, $str63$_A_, ar_token_text(v_object));
        return v_object;
    }

    public static final SubLObject sxhash_ar_token_method_alt(SubLObject v_object) {
        return Sxhash.sxhash(ar_token_id(v_object));
    }

    public static SubLObject sxhash_ar_token_method(final SubLObject v_object) {
        return Sxhash.sxhash(ar_token_id(v_object));
    }

    public static final SubLObject new_ar_token_alt(SubLObject state, SubLObject text, SubLObject sentence, SubLObject number) {
        {
            SubLObject token = make_ar_token(UNPROVIDED);
            SubLObject lock = $ar_lock$.getGlobalValue();
            SubLObject release = NIL;
            try {
                release = seize_lock(lock);
                {
                    SubLObject id = next_ar_state_id(state);
                    _csetf_ar_token_id(token, id);
                    _csetf_ar_token_text(token, text);
                    _csetf_ar_token_sentence(token, sentence);
                    _csetf_ar_token_number(token, number);
                    add_ar_object_index(state, id, token);
                }
            } finally {
                if (NIL != release) {
                    release_lock(lock);
                }
            }
            return token;
        }
    }

    public static SubLObject new_ar_token(final SubLObject state, final SubLObject text, final SubLObject sentence, final SubLObject number) {
        final SubLObject token = make_ar_token(UNPROVIDED);
        SubLObject release = NIL;
        try {
            release = seize_lock($ar_lock$.getGlobalValue());
            final SubLObject id = next_ar_state_id(state);
            _csetf_ar_token_id(token, id);
            _csetf_ar_token_text(token, text);
            _csetf_ar_token_sentence(token, sentence);
            _csetf_ar_token_number(token, number);
            add_ar_object_index(state, id, token);
        } finally {
            if (NIL != release) {
                release_lock($ar_lock$.getGlobalValue());
            }
        }
        return token;
    }

    public static final SubLObject add_ar_token_phrase_alt(SubLObject token, SubLObject phrase) {
        SubLTrampolineFile.checkType(token, AR_TOKEN_P);
        SubLTrampolineFile.checkType(phrase, AR_PHRASE_P);
        {
            SubLObject lock = $ar_lock$.getGlobalValue();
            SubLObject release = NIL;
            try {
                release = seize_lock(lock);
                {
                    SubLObject item_var = phrase;
                    if (NIL == member(item_var, ar_token_phrases(token), symbol_function(EQL), symbol_function(IDENTITY))) {
                        _csetf_ar_token_phrases(token, cons(item_var, ar_token_phrases(token)));
                    }
                }
            } finally {
                if (NIL != release) {
                    release_lock(lock);
                }
            }
        }
        return token;
    }

    public static SubLObject add_ar_token_phrase(final SubLObject token, final SubLObject phrase) {
        assert NIL != ar_token_p(token) : "! rkf_assisted_reader.ar_token_p(token) " + ("rkf_assisted_reader.ar_token_p(token) " + "CommonSymbols.NIL != rkf_assisted_reader.ar_token_p(token) ") + token;
        assert NIL != ar_phrase_p(phrase) : "! rkf_assisted_reader.ar_phrase_p(phrase) " + ("rkf_assisted_reader.ar_phrase_p(phrase) " + "CommonSymbols.NIL != rkf_assisted_reader.ar_phrase_p(phrase) ") + phrase;
        SubLObject release = NIL;
        try {
            release = seize_lock($ar_lock$.getGlobalValue());
            if (NIL == member(phrase, ar_token_phrases(token), symbol_function(EQL), symbol_function(IDENTITY))) {
                _csetf_ar_token_phrases(token, cons(phrase, ar_token_phrases(token)));
            }
        } finally {
            if (NIL != release) {
                release_lock($ar_lock$.getGlobalValue());
            }
        }
        return token;
    }

    public static final SubLObject ar_phrase_print_function_trampoline_alt(SubLObject v_object, SubLObject stream) {
        print_ar_phrase(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject ar_phrase_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        print_ar_phrase(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject ar_phrase_p_alt(SubLObject v_object) {
        return v_object.getClass() == com.cyc.cycjava.cycl.rkf_assisted_reader.$ar_phrase_native.class ? ((SubLObject) (T)) : NIL;
    }

    public static SubLObject ar_phrase_p(final SubLObject v_object) {
        return v_object.getClass() == com.cyc.cycjava.cycl.rkf_assisted_reader.$ar_phrase_native.class ? T : NIL;
    }

    public static final SubLObject ar_phrase_id_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, AR_PHRASE_P);
        return v_object.getField2();
    }

    public static SubLObject ar_phrase_id(final SubLObject v_object) {
        assert NIL != ar_phrase_p(v_object) : "! rkf_assisted_reader.ar_phrase_p(v_object) " + "rkf_assisted_reader.ar_phrase_p error :" + v_object;
        return v_object.getField2();
    }

    public static final SubLObject ar_phrase_status_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, AR_PHRASE_P);
        return v_object.getField3();
    }

    public static SubLObject ar_phrase_status(final SubLObject v_object) {
        assert NIL != ar_phrase_p(v_object) : "! rkf_assisted_reader.ar_phrase_p(v_object) " + "rkf_assisted_reader.ar_phrase_p error :" + v_object;
        return v_object.getField3();
    }

    public static final SubLObject ar_phrase_token_list_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, AR_PHRASE_P);
        return v_object.getField4();
    }

    public static SubLObject ar_phrase_token_list(final SubLObject v_object) {
        assert NIL != ar_phrase_p(v_object) : "! rkf_assisted_reader.ar_phrase_p(v_object) " + "rkf_assisted_reader.ar_phrase_p error :" + v_object;
        return v_object.getField4();
    }

    public static final SubLObject ar_phrase_sentence_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, AR_PHRASE_P);
        return v_object.getField5();
    }

    public static SubLObject ar_phrase_sentence(final SubLObject v_object) {
        assert NIL != ar_phrase_p(v_object) : "! rkf_assisted_reader.ar_phrase_p(v_object) " + "rkf_assisted_reader.ar_phrase_p error :" + v_object;
        return v_object.getField5();
    }

    public static final SubLObject ar_phrase_concepts_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, AR_PHRASE_P);
        return v_object.getField6();
    }

    public static SubLObject ar_phrase_concepts(final SubLObject v_object) {
        assert NIL != ar_phrase_p(v_object) : "! rkf_assisted_reader.ar_phrase_p(v_object) " + "rkf_assisted_reader.ar_phrase_p error :" + v_object;
        return v_object.getField6();
    }

    public static final SubLObject ar_phrase_rejected_concepts_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, AR_PHRASE_P);
        return v_object.getField7();
    }

    public static SubLObject ar_phrase_rejected_concepts(final SubLObject v_object) {
        assert NIL != ar_phrase_p(v_object) : "! rkf_assisted_reader.ar_phrase_p(v_object) " + "rkf_assisted_reader.ar_phrase_p error :" + v_object;
        return v_object.getField7();
    }

    public static final SubLObject ar_phrase_disambiguated_concept_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, AR_PHRASE_P);
        return v_object.getField8();
    }

    public static SubLObject ar_phrase_disambiguated_concept(final SubLObject v_object) {
        assert NIL != ar_phrase_p(v_object) : "! rkf_assisted_reader.ar_phrase_p(v_object) " + "rkf_assisted_reader.ar_phrase_p error :" + v_object;
        return v_object.getField8();
    }

    public static final SubLObject ar_phrase_surrogate_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, AR_PHRASE_P);
        return v_object.getField9();
    }

    public static SubLObject ar_phrase_surrogate(final SubLObject v_object) {
        assert NIL != ar_phrase_p(v_object) : "! rkf_assisted_reader.ar_phrase_p(v_object) " + "rkf_assisted_reader.ar_phrase_p error :" + v_object;
        return v_object.getField9();
    }

    public static final SubLObject ar_phrase_constraint_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, AR_PHRASE_P);
        return v_object.getField10();
    }

    public static SubLObject ar_phrase_constraint(final SubLObject v_object) {
        assert NIL != ar_phrase_p(v_object) : "! rkf_assisted_reader.ar_phrase_p(v_object) " + "rkf_assisted_reader.ar_phrase_p error :" + v_object;
        return v_object.getField10();
    }

    public static final SubLObject ar_phrase_force_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, AR_PHRASE_P);
        return v_object.getField11();
    }

    public static SubLObject ar_phrase_force(final SubLObject v_object) {
        assert NIL != ar_phrase_p(v_object) : "! rkf_assisted_reader.ar_phrase_p(v_object) " + "rkf_assisted_reader.ar_phrase_p error :" + v_object;
        return v_object.getField11();
    }

    public static final SubLObject _csetf_ar_phrase_id_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, AR_PHRASE_P);
        return v_object.setField2(value);
    }

    public static SubLObject _csetf_ar_phrase_id(final SubLObject v_object, final SubLObject value) {
        assert NIL != ar_phrase_p(v_object) : "! rkf_assisted_reader.ar_phrase_p(v_object) " + "rkf_assisted_reader.ar_phrase_p error :" + v_object;
        return v_object.setField2(value);
    }

    public static final SubLObject _csetf_ar_phrase_status_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, AR_PHRASE_P);
        return v_object.setField3(value);
    }

    public static SubLObject _csetf_ar_phrase_status(final SubLObject v_object, final SubLObject value) {
        assert NIL != ar_phrase_p(v_object) : "! rkf_assisted_reader.ar_phrase_p(v_object) " + "rkf_assisted_reader.ar_phrase_p error :" + v_object;
        return v_object.setField3(value);
    }

    public static final SubLObject _csetf_ar_phrase_token_list_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, AR_PHRASE_P);
        return v_object.setField4(value);
    }

    public static SubLObject _csetf_ar_phrase_token_list(final SubLObject v_object, final SubLObject value) {
        assert NIL != ar_phrase_p(v_object) : "! rkf_assisted_reader.ar_phrase_p(v_object) " + "rkf_assisted_reader.ar_phrase_p error :" + v_object;
        return v_object.setField4(value);
    }

    public static final SubLObject _csetf_ar_phrase_sentence_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, AR_PHRASE_P);
        return v_object.setField5(value);
    }

    public static SubLObject _csetf_ar_phrase_sentence(final SubLObject v_object, final SubLObject value) {
        assert NIL != ar_phrase_p(v_object) : "! rkf_assisted_reader.ar_phrase_p(v_object) " + "rkf_assisted_reader.ar_phrase_p error :" + v_object;
        return v_object.setField5(value);
    }

    public static final SubLObject _csetf_ar_phrase_concepts_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, AR_PHRASE_P);
        return v_object.setField6(value);
    }

    public static SubLObject _csetf_ar_phrase_concepts(final SubLObject v_object, final SubLObject value) {
        assert NIL != ar_phrase_p(v_object) : "! rkf_assisted_reader.ar_phrase_p(v_object) " + "rkf_assisted_reader.ar_phrase_p error :" + v_object;
        return v_object.setField6(value);
    }

    public static final SubLObject _csetf_ar_phrase_rejected_concepts_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, AR_PHRASE_P);
        return v_object.setField7(value);
    }

    public static SubLObject _csetf_ar_phrase_rejected_concepts(final SubLObject v_object, final SubLObject value) {
        assert NIL != ar_phrase_p(v_object) : "! rkf_assisted_reader.ar_phrase_p(v_object) " + "rkf_assisted_reader.ar_phrase_p error :" + v_object;
        return v_object.setField7(value);
    }

    public static final SubLObject _csetf_ar_phrase_disambiguated_concept_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, AR_PHRASE_P);
        return v_object.setField8(value);
    }

    public static SubLObject _csetf_ar_phrase_disambiguated_concept(final SubLObject v_object, final SubLObject value) {
        assert NIL != ar_phrase_p(v_object) : "! rkf_assisted_reader.ar_phrase_p(v_object) " + "rkf_assisted_reader.ar_phrase_p error :" + v_object;
        return v_object.setField8(value);
    }

    public static final SubLObject _csetf_ar_phrase_surrogate_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, AR_PHRASE_P);
        return v_object.setField9(value);
    }

    public static SubLObject _csetf_ar_phrase_surrogate(final SubLObject v_object, final SubLObject value) {
        assert NIL != ar_phrase_p(v_object) : "! rkf_assisted_reader.ar_phrase_p(v_object) " + "rkf_assisted_reader.ar_phrase_p error :" + v_object;
        return v_object.setField9(value);
    }

    public static final SubLObject _csetf_ar_phrase_constraint_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, AR_PHRASE_P);
        return v_object.setField10(value);
    }

    public static SubLObject _csetf_ar_phrase_constraint(final SubLObject v_object, final SubLObject value) {
        assert NIL != ar_phrase_p(v_object) : "! rkf_assisted_reader.ar_phrase_p(v_object) " + "rkf_assisted_reader.ar_phrase_p error :" + v_object;
        return v_object.setField10(value);
    }

    public static final SubLObject _csetf_ar_phrase_force_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, AR_PHRASE_P);
        return v_object.setField11(value);
    }

    public static SubLObject _csetf_ar_phrase_force(final SubLObject v_object, final SubLObject value) {
        assert NIL != ar_phrase_p(v_object) : "! rkf_assisted_reader.ar_phrase_p(v_object) " + "rkf_assisted_reader.ar_phrase_p error :" + v_object;
        return v_object.setField11(value);
    }

    public static final SubLObject make_ar_phrase_alt(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        {
            SubLObject v_new = new com.cyc.cycjava.cycl.rkf_assisted_reader.$ar_phrase_native();
            SubLObject next = NIL;
            for (next = arglist; NIL != next; next = cddr(next)) {
                {
                    SubLObject current_arg = next.first();
                    SubLObject current_value = cadr(next);
                    SubLObject pcase_var = current_arg;
                    if (pcase_var.eql($ID)) {
                        _csetf_ar_phrase_id(v_new, current_value);
                    } else {
                        if (pcase_var.eql($STATUS)) {
                            _csetf_ar_phrase_status(v_new, current_value);
                        } else {
                            if (pcase_var.eql($TOKEN_LIST)) {
                                _csetf_ar_phrase_token_list(v_new, current_value);
                            } else {
                                if (pcase_var.eql($SENTENCE)) {
                                    _csetf_ar_phrase_sentence(v_new, current_value);
                                } else {
                                    if (pcase_var.eql($CONCEPTS)) {
                                        _csetf_ar_phrase_concepts(v_new, current_value);
                                    } else {
                                        if (pcase_var.eql($REJECTED_CONCEPTS)) {
                                            _csetf_ar_phrase_rejected_concepts(v_new, current_value);
                                        } else {
                                            if (pcase_var.eql($DISAMBIGUATED_CONCEPT)) {
                                                _csetf_ar_phrase_disambiguated_concept(v_new, current_value);
                                            } else {
                                                if (pcase_var.eql($SURROGATE)) {
                                                    _csetf_ar_phrase_surrogate(v_new, current_value);
                                                } else {
                                                    if (pcase_var.eql($CONSTRAINT)) {
                                                        _csetf_ar_phrase_constraint(v_new, current_value);
                                                    } else {
                                                        if (pcase_var.eql($FORCE)) {
                                                            _csetf_ar_phrase_force(v_new, current_value);
                                                        } else {
                                                            Errors.error($str_alt29$Invalid_slot__S_for_construction_, current_arg);
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
            return v_new;
        }
    }

    public static SubLObject make_ar_phrase(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new com.cyc.cycjava.cycl.rkf_assisted_reader.$ar_phrase_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
            current_arg = next.first();
            current_value = cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql($ID)) {
                _csetf_ar_phrase_id(v_new, current_value);
            } else
                if (pcase_var.eql($STATUS)) {
                    _csetf_ar_phrase_status(v_new, current_value);
                } else
                    if (pcase_var.eql($TOKEN_LIST)) {
                        _csetf_ar_phrase_token_list(v_new, current_value);
                    } else
                        if (pcase_var.eql($SENTENCE)) {
                            _csetf_ar_phrase_sentence(v_new, current_value);
                        } else
                            if (pcase_var.eql($CONCEPTS)) {
                                _csetf_ar_phrase_concepts(v_new, current_value);
                            } else
                                if (pcase_var.eql($REJECTED_CONCEPTS)) {
                                    _csetf_ar_phrase_rejected_concepts(v_new, current_value);
                                } else
                                    if (pcase_var.eql($DISAMBIGUATED_CONCEPT)) {
                                        _csetf_ar_phrase_disambiguated_concept(v_new, current_value);
                                    } else
                                        if (pcase_var.eql($SURROGATE)) {
                                            _csetf_ar_phrase_surrogate(v_new, current_value);
                                        } else
                                            if (pcase_var.eql($CONSTRAINT)) {
                                                _csetf_ar_phrase_constraint(v_new, current_value);
                                            } else
                                                if (pcase_var.eql($FORCE)) {
                                                    _csetf_ar_phrase_force(v_new, current_value);
                                                } else {
                                                    Errors.error($str30$Invalid_slot__S_for_construction_, current_arg);
                                                }









        }
        return v_new;
    }

    public static SubLObject visit_defstruct_ar_phrase(final SubLObject obj, final SubLObject visitor_fn) {
        funcall(visitor_fn, obj, $BEGIN, MAKE_AR_PHRASE, TEN_INTEGER);
        funcall(visitor_fn, obj, $SLOT, $ID, ar_phrase_id(obj));
        funcall(visitor_fn, obj, $SLOT, $STATUS, ar_phrase_status(obj));
        funcall(visitor_fn, obj, $SLOT, $TOKEN_LIST, ar_phrase_token_list(obj));
        funcall(visitor_fn, obj, $SLOT, $SENTENCE, ar_phrase_sentence(obj));
        funcall(visitor_fn, obj, $SLOT, $CONCEPTS, ar_phrase_concepts(obj));
        funcall(visitor_fn, obj, $SLOT, $REJECTED_CONCEPTS, ar_phrase_rejected_concepts(obj));
        funcall(visitor_fn, obj, $SLOT, $DISAMBIGUATED_CONCEPT, ar_phrase_disambiguated_concept(obj));
        funcall(visitor_fn, obj, $SLOT, $SURROGATE, ar_phrase_surrogate(obj));
        funcall(visitor_fn, obj, $SLOT, $CONSTRAINT, ar_phrase_constraint(obj));
        funcall(visitor_fn, obj, $SLOT, $FORCE, ar_phrase_force(obj));
        funcall(visitor_fn, obj, $END, MAKE_AR_PHRASE, TEN_INTEGER);
        return obj;
    }

    public static SubLObject visit_defstruct_object_ar_phrase_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_ar_phrase(obj, visitor_fn);
    }

    public static final SubLObject print_ar_phrase_alt(SubLObject v_object, SubLObject stream, SubLObject depth) {
        {
            SubLObject token_list = ar_phrase_token_list(v_object);
            format(stream, $str_alt91$_AR_PHRASE__D_, ar_phrase_id(v_object));
            {
                SubLObject cdolist_list_var = token_list;
                SubLObject token = NIL;
                for (token = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , token = cdolist_list_var.first()) {
                    write_string(ar_token_text(token), stream, UNPROVIDED, UNPROVIDED);
                    write_char(CHAR_space, stream);
                }
            }
            write_string($str_alt92$_, stream, UNPROVIDED, UNPROVIDED);
        }
        return v_object;
    }

    public static SubLObject print_ar_phrase(final SubLObject v_object, final SubLObject stream, final SubLObject depth) {
        final SubLObject token_list = ar_phrase_token_list(v_object);
        format(stream, $str103$_AR_PHRASE__D_, ar_phrase_id(v_object));
        SubLObject cdolist_list_var = token_list;
        SubLObject token = NIL;
        token = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            write_string(ar_token_text(token), stream, UNPROVIDED, UNPROVIDED);
            write_char(CHAR_space, stream);
            cdolist_list_var = cdolist_list_var.rest();
            token = cdolist_list_var.first();
        } 
        write_string($str104$_, stream, UNPROVIDED, UNPROVIDED);
        return v_object;
    }

    public static final SubLObject sxhash_ar_phrase_method_alt(SubLObject v_object) {
        return Sxhash.sxhash(ar_phrase_id(v_object));
    }

    public static SubLObject sxhash_ar_phrase_method(final SubLObject v_object) {
        return Sxhash.sxhash(ar_phrase_id(v_object));
    }

    public static final SubLObject new_ar_phrase_alt(SubLObject state, SubLObject sentence, SubLObject token_list) {
        SubLTrampolineFile.checkType(sentence, AR_SENTENCE_P);
        SubLTrampolineFile.checkType(token_list, LISTP);
        {
            SubLObject phrase = make_ar_phrase(UNPROVIDED);
            SubLObject lock = $ar_lock$.getGlobalValue();
            SubLObject release = NIL;
            try {
                release = seize_lock(lock);
                {
                    SubLObject id = next_ar_state_id(state);
                    _csetf_ar_phrase_id(phrase, id);
                    _csetf_ar_phrase_sentence(phrase, sentence);
                    _csetf_ar_phrase_token_list(phrase, token_list);
                    _csetf_ar_phrase_force(phrase, compute_ar_phrase_force(phrase, UNPROVIDED, UNPROVIDED));
                    add_ar_object_index(state, id, phrase);
                }
            } finally {
                if (NIL != release) {
                    release_lock(lock);
                }
            }
            clear_ar_phrase_disambiguated_concept(phrase);
            {
                SubLObject cdolist_list_var = token_list;
                SubLObject token = NIL;
                for (token = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , token = cdolist_list_var.first()) {
                    add_ar_token_phrase(token, phrase);
                }
            }
            return phrase;
        }
    }

    public static SubLObject new_ar_phrase(final SubLObject state, final SubLObject sentence, final SubLObject token_list) {
        assert NIL != ar_sentence_p(sentence) : "! rkf_assisted_reader.ar_sentence_p(sentence) " + ("rkf_assisted_reader.ar_sentence_p(sentence) " + "CommonSymbols.NIL != rkf_assisted_reader.ar_sentence_p(sentence) ") + sentence;
        assert NIL != listp(token_list) : "! listp(token_list) " + ("Types.listp(token_list) " + "CommonSymbols.NIL != Types.listp(token_list) ") + token_list;
        final SubLObject phrase = make_ar_phrase(UNPROVIDED);
        SubLObject release = NIL;
        try {
            release = seize_lock($ar_lock$.getGlobalValue());
            final SubLObject id = next_ar_state_id(state);
            _csetf_ar_phrase_id(phrase, id);
            _csetf_ar_phrase_sentence(phrase, sentence);
            _csetf_ar_phrase_token_list(phrase, token_list);
            _csetf_ar_phrase_force(phrase, compute_ar_phrase_force(phrase, UNPROVIDED, UNPROVIDED));
            add_ar_object_index(state, id, phrase);
        } finally {
            if (NIL != release) {
                release_lock($ar_lock$.getGlobalValue());
            }
        }
        clear_ar_phrase_disambiguated_concept(phrase);
        SubLObject cdolist_list_var = token_list;
        SubLObject token = NIL;
        token = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            add_ar_token_phrase(token, phrase);
            cdolist_list_var = cdolist_list_var.rest();
            token = cdolist_list_var.first();
        } 
        return phrase;
    }

    public static final SubLObject add_ar_phrase_concept_alt(SubLObject phrase, SubLObject concept) {
        SubLTrampolineFile.checkType(phrase, AR_PHRASE_P);
        SubLTrampolineFile.checkType(concept, AR_CONCEPT_P);
        {
            SubLObject lock = $ar_lock$.getGlobalValue();
            SubLObject release = NIL;
            try {
                release = seize_lock(lock);
                {
                    SubLObject item_var = concept;
                    if (NIL == member(item_var, ar_phrase_concepts(phrase), symbol_function(EQL), symbol_function(IDENTITY))) {
                        _csetf_ar_phrase_concepts(phrase, cons(item_var, ar_phrase_concepts(phrase)));
                    }
                }
            } finally {
                if (NIL != release) {
                    release_lock(lock);
                }
            }
        }
        return phrase;
    }

    public static SubLObject add_ar_phrase_concept(final SubLObject phrase, final SubLObject concept) {
        assert NIL != ar_phrase_p(phrase) : "! rkf_assisted_reader.ar_phrase_p(phrase) " + ("rkf_assisted_reader.ar_phrase_p(phrase) " + "CommonSymbols.NIL != rkf_assisted_reader.ar_phrase_p(phrase) ") + phrase;
        assert NIL != ar_concept_p(concept) : "! rkf_assisted_reader.ar_concept_p(concept) " + ("rkf_assisted_reader.ar_concept_p(concept) " + "CommonSymbols.NIL != rkf_assisted_reader.ar_concept_p(concept) ") + concept;
        SubLObject release = NIL;
        try {
            release = seize_lock($ar_lock$.getGlobalValue());
            if (NIL == member(concept, ar_phrase_concepts(phrase), symbol_function(EQL), symbol_function(IDENTITY))) {
                _csetf_ar_phrase_concepts(phrase, cons(concept, ar_phrase_concepts(phrase)));
            }
        } finally {
            if (NIL != release) {
                release_lock($ar_lock$.getGlobalValue());
            }
        }
        return phrase;
    }

    public static final SubLObject remove_ar_phrase_concept_alt(SubLObject phrase, SubLObject concept) {
        SubLTrampolineFile.checkType(phrase, AR_PHRASE_P);
        SubLTrampolineFile.checkType(concept, AR_CONCEPT_P);
        {
            SubLObject lock = $ar_lock$.getGlobalValue();
            SubLObject release = NIL;
            try {
                release = seize_lock(lock);
                _csetf_ar_phrase_concepts(phrase, remove(concept, ar_phrase_concepts(phrase), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
            } finally {
                if (NIL != release) {
                    release_lock(lock);
                }
            }
        }
        return phrase;
    }

    public static SubLObject remove_ar_phrase_concept(final SubLObject phrase, final SubLObject concept) {
        assert NIL != ar_phrase_p(phrase) : "! rkf_assisted_reader.ar_phrase_p(phrase) " + ("rkf_assisted_reader.ar_phrase_p(phrase) " + "CommonSymbols.NIL != rkf_assisted_reader.ar_phrase_p(phrase) ") + phrase;
        assert NIL != ar_concept_p(concept) : "! rkf_assisted_reader.ar_concept_p(concept) " + ("rkf_assisted_reader.ar_concept_p(concept) " + "CommonSymbols.NIL != rkf_assisted_reader.ar_concept_p(concept) ") + concept;
        SubLObject release = NIL;
        try {
            release = seize_lock($ar_lock$.getGlobalValue());
            _csetf_ar_phrase_concepts(phrase, remove(concept, ar_phrase_concepts(phrase), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
        } finally {
            if (NIL != release) {
                release_lock($ar_lock$.getGlobalValue());
            }
        }
        return phrase;
    }

    public static final SubLObject add_ar_phrase_rejected_concept_alt(SubLObject phrase, SubLObject concept) {
        SubLTrampolineFile.checkType(phrase, AR_PHRASE_P);
        SubLTrampolineFile.checkType(concept, AR_CONCEPT_P);
        {
            SubLObject lock = $ar_lock$.getGlobalValue();
            SubLObject release = NIL;
            try {
                release = seize_lock(lock);
                {
                    SubLObject item_var = concept;
                    if (NIL == member(item_var, ar_phrase_rejected_concepts(phrase), symbol_function(EQL), symbol_function(IDENTITY))) {
                        _csetf_ar_phrase_rejected_concepts(phrase, cons(item_var, ar_phrase_rejected_concepts(phrase)));
                    }
                }
            } finally {
                if (NIL != release) {
                    release_lock(lock);
                }
            }
        }
        return phrase;
    }

    public static SubLObject add_ar_phrase_rejected_concept(final SubLObject phrase, final SubLObject concept) {
        assert NIL != ar_phrase_p(phrase) : "! rkf_assisted_reader.ar_phrase_p(phrase) " + ("rkf_assisted_reader.ar_phrase_p(phrase) " + "CommonSymbols.NIL != rkf_assisted_reader.ar_phrase_p(phrase) ") + phrase;
        assert NIL != ar_concept_p(concept) : "! rkf_assisted_reader.ar_concept_p(concept) " + ("rkf_assisted_reader.ar_concept_p(concept) " + "CommonSymbols.NIL != rkf_assisted_reader.ar_concept_p(concept) ") + concept;
        SubLObject release = NIL;
        try {
            release = seize_lock($ar_lock$.getGlobalValue());
            if (NIL == member(concept, ar_phrase_rejected_concepts(phrase), symbol_function(EQL), symbol_function(IDENTITY))) {
                _csetf_ar_phrase_rejected_concepts(phrase, cons(concept, ar_phrase_rejected_concepts(phrase)));
            }
        } finally {
            if (NIL != release) {
                release_lock($ar_lock$.getGlobalValue());
            }
        }
        return phrase;
    }

    public static final SubLObject clear_ar_phrase_disambiguated_concept_alt(SubLObject phrase) {
        SubLTrampolineFile.checkType(phrase, AR_PHRASE_P);
        {
            SubLObject lock = $ar_lock$.getGlobalValue();
            SubLObject release = NIL;
            try {
                release = seize_lock(lock);
                _csetf_ar_phrase_disambiguated_concept(phrase, NIL);
            } finally {
                if (NIL != release) {
                    release_lock(lock);
                }
            }
        }
        return phrase;
    }

    public static SubLObject clear_ar_phrase_disambiguated_concept(final SubLObject phrase) {
        assert NIL != ar_phrase_p(phrase) : "! rkf_assisted_reader.ar_phrase_p(phrase) " + ("rkf_assisted_reader.ar_phrase_p(phrase) " + "CommonSymbols.NIL != rkf_assisted_reader.ar_phrase_p(phrase) ") + phrase;
        SubLObject release = NIL;
        try {
            release = seize_lock($ar_lock$.getGlobalValue());
            _csetf_ar_phrase_disambiguated_concept(phrase, NIL);
        } finally {
            if (NIL != release) {
                release_lock($ar_lock$.getGlobalValue());
            }
        }
        return phrase;
    }

    public static final SubLObject note_ar_phrase_disambiguated_concept_alt(SubLObject phrase, SubLObject concept) {
        SubLTrampolineFile.checkType(phrase, AR_PHRASE_P);
        SubLTrampolineFile.checkType(concept, AR_CONCEPT_P);
        {
            SubLObject lock = $ar_lock$.getGlobalValue();
            SubLObject release = NIL;
            try {
                release = seize_lock(lock);
                _csetf_ar_phrase_disambiguated_concept(phrase, concept);
            } finally {
                if (NIL != release) {
                    release_lock(lock);
                }
            }
        }
        return phrase;
    }

    public static SubLObject note_ar_phrase_disambiguated_concept(final SubLObject phrase, final SubLObject concept) {
        assert NIL != ar_phrase_p(phrase) : "! rkf_assisted_reader.ar_phrase_p(phrase) " + ("rkf_assisted_reader.ar_phrase_p(phrase) " + "CommonSymbols.NIL != rkf_assisted_reader.ar_phrase_p(phrase) ") + phrase;
        assert NIL != ar_concept_p(concept) : "! rkf_assisted_reader.ar_concept_p(concept) " + ("rkf_assisted_reader.ar_concept_p(concept) " + "CommonSymbols.NIL != rkf_assisted_reader.ar_concept_p(concept) ") + concept;
        SubLObject release = NIL;
        try {
            release = seize_lock($ar_lock$.getGlobalValue());
            _csetf_ar_phrase_disambiguated_concept(phrase, concept);
        } finally {
            if (NIL != release) {
                release_lock($ar_lock$.getGlobalValue());
            }
        }
        return phrase;
    }

    public static final SubLObject note_ar_phrase_status_alt(SubLObject phrase, SubLObject status) {
        SubLTrampolineFile.checkType(phrase, AR_PHRASE_P);
        SubLTrampolineFile.checkType(status, KEYWORDP);
        {
            SubLObject lock = $ar_lock$.getGlobalValue();
            SubLObject release = NIL;
            try {
                release = seize_lock(lock);
                _csetf_ar_phrase_status(phrase, status);
            } finally {
                if (NIL != release) {
                    release_lock(lock);
                }
            }
        }
        return phrase;
    }

    public static SubLObject note_ar_phrase_status(final SubLObject phrase, final SubLObject status) {
        assert NIL != ar_phrase_p(phrase) : "! rkf_assisted_reader.ar_phrase_p(phrase) " + ("rkf_assisted_reader.ar_phrase_p(phrase) " + "CommonSymbols.NIL != rkf_assisted_reader.ar_phrase_p(phrase) ") + phrase;
        assert NIL != keywordp(status) : "! keywordp(status) " + ("Types.keywordp(status) " + "CommonSymbols.NIL != Types.keywordp(status) ") + status;
        SubLObject release = NIL;
        try {
            release = seize_lock($ar_lock$.getGlobalValue());
            _csetf_ar_phrase_status(phrase, status);
        } finally {
            if (NIL != release) {
                release_lock($ar_lock$.getGlobalValue());
            }
        }
        return phrase;
    }

    public static final SubLObject note_ar_phrase_force_alt(SubLObject phrase, SubLObject force) {
        SubLTrampolineFile.checkType(phrase, AR_PHRASE_P);
        SubLTrampolineFile.checkType(force, KEYWORDP);
        {
            SubLObject lock = $ar_lock$.getGlobalValue();
            SubLObject release = NIL;
            try {
                release = seize_lock(lock);
                _csetf_ar_phrase_force(phrase, force);
            } finally {
                if (NIL != release) {
                    release_lock(lock);
                }
            }
        }
        return phrase;
    }

    public static SubLObject note_ar_phrase_force(final SubLObject phrase, final SubLObject force) {
        assert NIL != ar_phrase_p(phrase) : "! rkf_assisted_reader.ar_phrase_p(phrase) " + ("rkf_assisted_reader.ar_phrase_p(phrase) " + "CommonSymbols.NIL != rkf_assisted_reader.ar_phrase_p(phrase) ") + phrase;
        assert NIL != keywordp(force) : "! keywordp(force) " + ("Types.keywordp(force) " + "CommonSymbols.NIL != Types.keywordp(force) ") + force;
        SubLObject release = NIL;
        try {
            release = seize_lock($ar_lock$.getGlobalValue());
            _csetf_ar_phrase_force(phrase, force);
        } finally {
            if (NIL != release) {
                release_lock($ar_lock$.getGlobalValue());
            }
        }
        return phrase;
    }

    public static final SubLObject note_ar_phrase_surrogate_alt(SubLObject phrase, SubLObject surrogate) {
        SubLTrampolineFile.checkType(phrase, AR_PHRASE_P);
        SubLTrampolineFile.checkType(surrogate, AR_CONCEPT_P);
        {
            SubLObject lock = $ar_lock$.getGlobalValue();
            SubLObject release = NIL;
            try {
                release = seize_lock(lock);
                {
                    SubLObject surrogates = ar_phrase_surrogate(phrase);
                    surrogates = cons(surrogate, surrogates);
                    _csetf_ar_phrase_surrogate(phrase, surrogates);
                }
            } finally {
                if (NIL != release) {
                    release_lock(lock);
                }
            }
        }
        return phrase;
    }

    public static SubLObject note_ar_phrase_surrogate(final SubLObject phrase, final SubLObject surrogate) {
        assert NIL != ar_phrase_p(phrase) : "! rkf_assisted_reader.ar_phrase_p(phrase) " + ("rkf_assisted_reader.ar_phrase_p(phrase) " + "CommonSymbols.NIL != rkf_assisted_reader.ar_phrase_p(phrase) ") + phrase;
        assert NIL != ar_concept_p(surrogate) : "! rkf_assisted_reader.ar_concept_p(surrogate) " + ("rkf_assisted_reader.ar_concept_p(surrogate) " + "CommonSymbols.NIL != rkf_assisted_reader.ar_concept_p(surrogate) ") + surrogate;
        SubLObject release = NIL;
        try {
            release = seize_lock($ar_lock$.getGlobalValue());
            SubLObject surrogates = ar_phrase_surrogate(phrase);
            surrogates = cons(surrogate, surrogates);
            _csetf_ar_phrase_surrogate(phrase, surrogates);
        } finally {
            if (NIL != release) {
                release_lock($ar_lock$.getGlobalValue());
            }
        }
        return phrase;
    }

    public static final SubLObject note_ar_phrase_constraint_alt(SubLObject phrase, SubLObject constraint) {
        SubLTrampolineFile.checkType(phrase, AR_PHRASE_P);
        {
            SubLObject lock = $ar_lock$.getGlobalValue();
            SubLObject release = NIL;
            try {
                release = seize_lock(lock);
                _csetf_ar_phrase_constraint(phrase, constraint);
            } finally {
                if (NIL != release) {
                    release_lock(lock);
                }
            }
        }
        return phrase;
    }

    public static SubLObject note_ar_phrase_constraint(final SubLObject phrase, final SubLObject constraint) {
        assert NIL != ar_phrase_p(phrase) : "! rkf_assisted_reader.ar_phrase_p(phrase) " + ("rkf_assisted_reader.ar_phrase_p(phrase) " + "CommonSymbols.NIL != rkf_assisted_reader.ar_phrase_p(phrase) ") + phrase;
        SubLObject release = NIL;
        try {
            release = seize_lock($ar_lock$.getGlobalValue());
            _csetf_ar_phrase_constraint(phrase, constraint);
        } finally {
            if (NIL != release) {
                release_lock($ar_lock$.getGlobalValue());
            }
        }
        return phrase;
    }

    /**
     *
     *
     * @param PHRASE
    ar-phrase
     * 		
     * @param DEFAULT-SENTENCE
     * 		boolean; is the phrase thought to be a complete sentence (that can have a real force)
     * @param MT
    microtheory
     * 		
     */
    @LispMethod(comment = "@param PHRASE\nar-phrase\r\n\t\t\r\n@param DEFAULT-SENTENCE\r\n\t\tboolean; is the phrase thought to be a complete sentence (that can have a real force)\r\n@param MT\nmicrotheory")
    public static final SubLObject compute_ar_phrase_force_alt(SubLObject phrase, SubLObject default_sentenceP, SubLObject mt) {
        if (default_sentenceP == UNPROVIDED) {
            default_sentenceP = T;
        }
        if (mt == UNPROVIDED) {
            mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject token_list = ar_phrase_token_list(phrase);
                SubLObject first_token = ar_token_text(token_list.first());
                SubLObject last_token = ar_token_text(last(token_list, UNPROVIDED).first());
                SubLObject result = NIL;
                {
                    SubLObject _prev_bind_0 = lexicon_vars.$lexicon_lookup_mt$.currentBinding(thread);
                    try {
                        lexicon_vars.$lexicon_lookup_mt$.bind(mt, thread);
                        if (NIL != string_utilities.ends_with(last_token, $str_alt97$_, UNPROVIDED)) {
                            result = $QUESTION;
                        } else {
                            if (NIL != string_utilities.ends_with(last_token, $str_alt99$_, UNPROVIDED)) {
                                result = $DECLARATIVE;
                            } else {
                                if (NIL != uia_trampolines.uia_wh_wordP(NIL, first_token)) {
                                    result = $QUESTION;
                                } else {
                                    if ((NIL != default_sentenceP) && (NIL != lexicon_accessors.string_is_form_of_aux_verbP(first_token, UNPROVIDED, UNPROVIDED))) {
                                        result = $QUESTION;
                                    } else {
                                        if (NIL != default_sentenceP) {
                                            result = $DECLARATIVE;
                                        } else {
                                            result = $NONE;
                                        }
                                    }
                                }
                            }
                        }
                    } finally {
                        lexicon_vars.$lexicon_lookup_mt$.rebind(_prev_bind_0, thread);
                    }
                }
                return result;
            }
        }
    }

    /**
     *
     *
     * @param PHRASE
    ar-phrase
     * 		
     * @param DEFAULT-SENTENCE
     * 		boolean; is the phrase thought to be a complete sentence (that can have a real force)
     * @param MT
    microtheory
     * 		
     */
    @LispMethod(comment = "@param PHRASE\nar-phrase\r\n\t\t\r\n@param DEFAULT-SENTENCE\r\n\t\tboolean; is the phrase thought to be a complete sentence (that can have a real force)\r\n@param MT\nmicrotheory")
    public static SubLObject compute_ar_phrase_force(final SubLObject phrase, SubLObject default_sentenceP, SubLObject mt) {
        if (default_sentenceP == UNPROVIDED) {
            default_sentenceP = T;
        }
        if (mt == UNPROVIDED) {
            mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject token_list = ar_phrase_token_list(phrase);
        final SubLObject first_token = ar_token_text(token_list.first());
        final SubLObject last_token = ar_token_text(last(token_list, UNPROVIDED).first());
        SubLObject result = NIL;
        final SubLObject _prev_bind_0 = lexicon_vars.$lexicon_lookup_mt$.currentBinding(thread);
        try {
            lexicon_vars.$lexicon_lookup_mt$.bind(mt, thread);
            if (NIL != string_utilities.ends_with(last_token, $str109$_, UNPROVIDED)) {
                result = $QUESTION;
            } else
                if (NIL != string_utilities.ends_with(last_token, $str111$_, UNPROVIDED)) {
                    result = $DECLARATIVE;
                } else
                    if ((NIL != default_sentenceP) && (NIL != lexicon_accessors.string_is_form_of_aux_verbP(first_token, UNPROVIDED, UNPROVIDED))) {
                        result = $QUESTION;
                    } else
                        if (NIL != default_sentenceP) {
                            result = $DECLARATIVE;
                        } else {
                            result = $NONE;
                        }



        } finally {
            lexicon_vars.$lexicon_lookup_mt$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    /**
     *
     *
     * @unknown should really be recursive, following any surrogates to see if they have non-surrogate children
     */
    @LispMethod(comment = "@unknown should really be recursive, following any surrogates to see if they have non-surrogate children")
    public static final SubLObject ar_phrase_has_non_surrogate_conceptsP_alt(SubLObject phrase) {
        SubLTrampolineFile.checkType(phrase, AR_PHRASE_P);
        return makeBoolean(((NIL != ar_phrase_concepts(phrase)) || (NIL != ar_phrase_rejected_concepts(phrase))) || (NIL != ar_phrase_disambiguated_concept(phrase)));
    }

    /**
     *
     *
     * @unknown should really be recursive, following any surrogates to see if they have non-surrogate children
     */
    @LispMethod(comment = "@unknown should really be recursive, following any surrogates to see if they have non-surrogate children")
    public static SubLObject ar_phrase_has_non_surrogate_conceptsP(final SubLObject phrase) {
        assert NIL != ar_phrase_p(phrase) : "! rkf_assisted_reader.ar_phrase_p(phrase) " + ("rkf_assisted_reader.ar_phrase_p(phrase) " + "CommonSymbols.NIL != rkf_assisted_reader.ar_phrase_p(phrase) ") + phrase;
        return makeBoolean(((NIL != ar_phrase_concepts(phrase)) || (NIL != ar_phrase_rejected_concepts(phrase))) || (NIL != ar_phrase_disambiguated_concept(phrase)));
    }

    /**
     * how many tokens are in phrase
     */
    @LispMethod(comment = "how many tokens are in phrase")
    public static final SubLObject ar_phrase_token_count_alt(SubLObject phrase) {
        return length(ar_phrase_token_list(phrase));
    }

    /**
     * how many tokens are in phrase
     */
    @LispMethod(comment = "how many tokens are in phrase")
    public static SubLObject ar_phrase_token_count(final SubLObject phrase) {
        return length(ar_phrase_token_list(phrase));
    }

    public static final SubLObject ar_concept_print_function_trampoline_alt(SubLObject v_object, SubLObject stream) {
        print_ar_concept(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject ar_concept_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        print_ar_concept(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject ar_concept_p_alt(SubLObject v_object) {
        return v_object.getClass() == com.cyc.cycjava.cycl.rkf_assisted_reader.$ar_concept_native.class ? ((SubLObject) (T)) : NIL;
    }

    public static SubLObject ar_concept_p(final SubLObject v_object) {
        return v_object.getClass() == com.cyc.cycjava.cycl.rkf_assisted_reader.$ar_concept_native.class ? T : NIL;
    }

    public static final SubLObject ar_concept_id_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, AR_CONCEPT_P);
        return v_object.getField2();
    }

    public static SubLObject ar_concept_id(final SubLObject v_object) {
        assert NIL != ar_concept_p(v_object) : "! rkf_assisted_reader.ar_concept_p(v_object) " + "rkf_assisted_reader.ar_concept_p error :" + v_object;
        return v_object.getField2();
    }

    public static final SubLObject ar_concept_cycl_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, AR_CONCEPT_P);
        return v_object.getField3();
    }

    public static SubLObject ar_concept_cycl(final SubLObject v_object) {
        assert NIL != ar_concept_p(v_object) : "! rkf_assisted_reader.ar_concept_p(v_object) " + "rkf_assisted_reader.ar_concept_p error :" + v_object;
        return v_object.getField3();
    }

    public static final SubLObject ar_concept_disambiguation_text_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, AR_CONCEPT_P);
        return v_object.getField4();
    }

    public static SubLObject ar_concept_disambiguation_text(final SubLObject v_object) {
        assert NIL != ar_concept_p(v_object) : "! rkf_assisted_reader.ar_concept_p(v_object) " + "rkf_assisted_reader.ar_concept_p error :" + v_object;
        return v_object.getField4();
    }

    public static final SubLObject ar_concept_phrases_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, AR_CONCEPT_P);
        return v_object.getField5();
    }

    public static SubLObject ar_concept_phrases(final SubLObject v_object) {
        assert NIL != ar_concept_p(v_object) : "! rkf_assisted_reader.ar_concept_p(v_object) " + "rkf_assisted_reader.ar_concept_p error :" + v_object;
        return v_object.getField5();
    }

    public static final SubLObject ar_concept_parts_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, AR_CONCEPT_P);
        return v_object.getField6();
    }

    public static SubLObject ar_concept_parts(final SubLObject v_object) {
        assert NIL != ar_concept_p(v_object) : "! rkf_assisted_reader.ar_concept_p(v_object) " + "rkf_assisted_reader.ar_concept_p error :" + v_object;
        return v_object.getField6();
    }

    public static final SubLObject ar_concept_agglomerations_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, AR_CONCEPT_P);
        return v_object.getField7();
    }

    public static SubLObject ar_concept_agglomerations(final SubLObject v_object) {
        assert NIL != ar_concept_p(v_object) : "! rkf_assisted_reader.ar_concept_p(v_object) " + "rkf_assisted_reader.ar_concept_p error :" + v_object;
        return v_object.getField7();
    }

    public static final SubLObject ar_concept_force_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, AR_CONCEPT_P);
        return v_object.getField8();
    }

    public static SubLObject ar_concept_force(final SubLObject v_object) {
        assert NIL != ar_concept_p(v_object) : "! rkf_assisted_reader.ar_concept_p(v_object) " + "rkf_assisted_reader.ar_concept_p error :" + v_object;
        return v_object.getField8();
    }

    public static final SubLObject ar_concept_confidence_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, AR_CONCEPT_P);
        return v_object.getField9();
    }

    public static SubLObject ar_concept_confidence(final SubLObject v_object) {
        assert NIL != ar_concept_p(v_object) : "! rkf_assisted_reader.ar_concept_p(v_object) " + "rkf_assisted_reader.ar_concept_p error :" + v_object;
        return v_object.getField9();
    }

    public static final SubLObject ar_concept_open_term_score_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, AR_CONCEPT_P);
        return v_object.getField10();
    }

    public static SubLObject ar_concept_open_term_score(final SubLObject v_object) {
        assert NIL != ar_concept_p(v_object) : "! rkf_assisted_reader.ar_concept_p(v_object) " + "rkf_assisted_reader.ar_concept_p error :" + v_object;
        return v_object.getField10();
    }

    public static final SubLObject _csetf_ar_concept_id_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, AR_CONCEPT_P);
        return v_object.setField2(value);
    }

    public static SubLObject _csetf_ar_concept_id(final SubLObject v_object, final SubLObject value) {
        assert NIL != ar_concept_p(v_object) : "! rkf_assisted_reader.ar_concept_p(v_object) " + "rkf_assisted_reader.ar_concept_p error :" + v_object;
        return v_object.setField2(value);
    }

    public static final SubLObject _csetf_ar_concept_cycl_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, AR_CONCEPT_P);
        return v_object.setField3(value);
    }

    public static SubLObject _csetf_ar_concept_cycl(final SubLObject v_object, final SubLObject value) {
        assert NIL != ar_concept_p(v_object) : "! rkf_assisted_reader.ar_concept_p(v_object) " + "rkf_assisted_reader.ar_concept_p error :" + v_object;
        return v_object.setField3(value);
    }

    public static final SubLObject _csetf_ar_concept_disambiguation_text_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, AR_CONCEPT_P);
        return v_object.setField4(value);
    }

    public static SubLObject _csetf_ar_concept_disambiguation_text(final SubLObject v_object, final SubLObject value) {
        assert NIL != ar_concept_p(v_object) : "! rkf_assisted_reader.ar_concept_p(v_object) " + "rkf_assisted_reader.ar_concept_p error :" + v_object;
        return v_object.setField4(value);
    }

    public static final SubLObject _csetf_ar_concept_phrases_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, AR_CONCEPT_P);
        return v_object.setField5(value);
    }

    public static SubLObject _csetf_ar_concept_phrases(final SubLObject v_object, final SubLObject value) {
        assert NIL != ar_concept_p(v_object) : "! rkf_assisted_reader.ar_concept_p(v_object) " + "rkf_assisted_reader.ar_concept_p error :" + v_object;
        return v_object.setField5(value);
    }

    public static final SubLObject _csetf_ar_concept_parts_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, AR_CONCEPT_P);
        return v_object.setField6(value);
    }

    public static SubLObject _csetf_ar_concept_parts(final SubLObject v_object, final SubLObject value) {
        assert NIL != ar_concept_p(v_object) : "! rkf_assisted_reader.ar_concept_p(v_object) " + "rkf_assisted_reader.ar_concept_p error :" + v_object;
        return v_object.setField6(value);
    }

    public static final SubLObject _csetf_ar_concept_agglomerations_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, AR_CONCEPT_P);
        return v_object.setField7(value);
    }

    public static SubLObject _csetf_ar_concept_agglomerations(final SubLObject v_object, final SubLObject value) {
        assert NIL != ar_concept_p(v_object) : "! rkf_assisted_reader.ar_concept_p(v_object) " + "rkf_assisted_reader.ar_concept_p error :" + v_object;
        return v_object.setField7(value);
    }

    public static final SubLObject _csetf_ar_concept_force_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, AR_CONCEPT_P);
        return v_object.setField8(value);
    }

    public static SubLObject _csetf_ar_concept_force(final SubLObject v_object, final SubLObject value) {
        assert NIL != ar_concept_p(v_object) : "! rkf_assisted_reader.ar_concept_p(v_object) " + "rkf_assisted_reader.ar_concept_p error :" + v_object;
        return v_object.setField8(value);
    }

    public static final SubLObject _csetf_ar_concept_confidence_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, AR_CONCEPT_P);
        return v_object.setField9(value);
    }

    public static SubLObject _csetf_ar_concept_confidence(final SubLObject v_object, final SubLObject value) {
        assert NIL != ar_concept_p(v_object) : "! rkf_assisted_reader.ar_concept_p(v_object) " + "rkf_assisted_reader.ar_concept_p error :" + v_object;
        return v_object.setField9(value);
    }

    public static final SubLObject _csetf_ar_concept_open_term_score_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, AR_CONCEPT_P);
        return v_object.setField10(value);
    }

    public static SubLObject _csetf_ar_concept_open_term_score(final SubLObject v_object, final SubLObject value) {
        assert NIL != ar_concept_p(v_object) : "! rkf_assisted_reader.ar_concept_p(v_object) " + "rkf_assisted_reader.ar_concept_p error :" + v_object;
        return v_object.setField10(value);
    }

    public static final SubLObject make_ar_concept_alt(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        {
            SubLObject v_new = new com.cyc.cycjava.cycl.rkf_assisted_reader.$ar_concept_native();
            SubLObject next = NIL;
            for (next = arglist; NIL != next; next = cddr(next)) {
                {
                    SubLObject current_arg = next.first();
                    SubLObject current_value = cadr(next);
                    SubLObject pcase_var = current_arg;
                    if (pcase_var.eql($ID)) {
                        _csetf_ar_concept_id(v_new, current_value);
                    } else {
                        if (pcase_var.eql($CYCL)) {
                            _csetf_ar_concept_cycl(v_new, current_value);
                        } else {
                            if (pcase_var.eql($DISAMBIGUATION_TEXT)) {
                                _csetf_ar_concept_disambiguation_text(v_new, current_value);
                            } else {
                                if (pcase_var.eql($PHRASES)) {
                                    _csetf_ar_concept_phrases(v_new, current_value);
                                } else {
                                    if (pcase_var.eql($PARTS)) {
                                        _csetf_ar_concept_parts(v_new, current_value);
                                    } else {
                                        if (pcase_var.eql($AGGLOMERATIONS)) {
                                            _csetf_ar_concept_agglomerations(v_new, current_value);
                                        } else {
                                            if (pcase_var.eql($FORCE)) {
                                                _csetf_ar_concept_force(v_new, current_value);
                                            } else {
                                                if (pcase_var.eql($CONFIDENCE)) {
                                                    _csetf_ar_concept_confidence(v_new, current_value);
                                                } else {
                                                    if (pcase_var.eql($OPEN_TERM_SCORE)) {
                                                        _csetf_ar_concept_open_term_score(v_new, current_value);
                                                    } else {
                                                        Errors.error($str_alt29$Invalid_slot__S_for_construction_, current_arg);
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
            return v_new;
        }
    }

    public static SubLObject make_ar_concept(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new com.cyc.cycjava.cycl.rkf_assisted_reader.$ar_concept_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
            current_arg = next.first();
            current_value = cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql($ID)) {
                _csetf_ar_concept_id(v_new, current_value);
            } else
                if (pcase_var.eql($CYCL)) {
                    _csetf_ar_concept_cycl(v_new, current_value);
                } else
                    if (pcase_var.eql($DISAMBIGUATION_TEXT)) {
                        _csetf_ar_concept_disambiguation_text(v_new, current_value);
                    } else
                        if (pcase_var.eql($PHRASES)) {
                            _csetf_ar_concept_phrases(v_new, current_value);
                        } else
                            if (pcase_var.eql($PARTS)) {
                                _csetf_ar_concept_parts(v_new, current_value);
                            } else
                                if (pcase_var.eql($AGGLOMERATIONS)) {
                                    _csetf_ar_concept_agglomerations(v_new, current_value);
                                } else
                                    if (pcase_var.eql($FORCE)) {
                                        _csetf_ar_concept_force(v_new, current_value);
                                    } else
                                        if (pcase_var.eql($CONFIDENCE)) {
                                            _csetf_ar_concept_confidence(v_new, current_value);
                                        } else
                                            if (pcase_var.eql($OPEN_TERM_SCORE)) {
                                                _csetf_ar_concept_open_term_score(v_new, current_value);
                                            } else {
                                                Errors.error($str30$Invalid_slot__S_for_construction_, current_arg);
                                            }








        }
        return v_new;
    }

    public static SubLObject visit_defstruct_ar_concept(final SubLObject obj, final SubLObject visitor_fn) {
        funcall(visitor_fn, obj, $BEGIN, MAKE_AR_CONCEPT, NINE_INTEGER);
        funcall(visitor_fn, obj, $SLOT, $ID, ar_concept_id(obj));
        funcall(visitor_fn, obj, $SLOT, $CYCL, ar_concept_cycl(obj));
        funcall(visitor_fn, obj, $SLOT, $DISAMBIGUATION_TEXT, ar_concept_disambiguation_text(obj));
        funcall(visitor_fn, obj, $SLOT, $PHRASES, ar_concept_phrases(obj));
        funcall(visitor_fn, obj, $SLOT, $PARTS, ar_concept_parts(obj));
        funcall(visitor_fn, obj, $SLOT, $AGGLOMERATIONS, ar_concept_agglomerations(obj));
        funcall(visitor_fn, obj, $SLOT, $FORCE, ar_concept_force(obj));
        funcall(visitor_fn, obj, $SLOT, $CONFIDENCE, ar_concept_confidence(obj));
        funcall(visitor_fn, obj, $SLOT, $OPEN_TERM_SCORE, ar_concept_open_term_score(obj));
        funcall(visitor_fn, obj, $END, MAKE_AR_CONCEPT, NINE_INTEGER);
        return obj;
    }

    public static SubLObject visit_defstruct_object_ar_concept_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_ar_concept(obj, visitor_fn);
    }

    public static final SubLObject print_ar_concept_alt(SubLObject v_object, SubLObject stream, SubLObject depth) {
        format(stream, $str_alt133$__AR_CONCEPT__S__S_, ar_concept_id(v_object), ar_concept_cycl(v_object));
        return v_object;
    }

    public static SubLObject print_ar_concept(final SubLObject v_object, final SubLObject stream, final SubLObject depth) {
        format(stream, $str148$__AR_CONCEPT__S__S_, ar_concept_id(v_object), ar_concept_cycl(v_object));
        return v_object;
    }

    public static final SubLObject sxhash_ar_concept_method_alt(SubLObject v_object) {
        return Sxhash.sxhash(ar_concept_id(v_object));
    }

    public static SubLObject sxhash_ar_concept_method(final SubLObject v_object) {
        return Sxhash.sxhash(ar_concept_id(v_object));
    }

    public static final SubLObject new_ar_concept_alt(SubLObject state, SubLObject cycl) {
        {
            SubLObject concept = make_ar_concept(UNPROVIDED);
            SubLObject lock = $ar_lock$.getGlobalValue();
            SubLObject release = NIL;
            try {
                release = seize_lock(lock);
                {
                    SubLObject id = next_ar_state_id(state);
                    _csetf_ar_concept_id(concept, id);
                    _csetf_ar_concept_cycl(concept, cycl);
                    _csetf_ar_concept_parts(concept, NIL);
                    _csetf_ar_concept_phrases(concept, NIL);
                    _csetf_ar_concept_disambiguation_text(concept, NIL);
                    _csetf_ar_concept_force(concept, NIL);
                    _csetf_ar_concept_confidence(concept, ZERO_INTEGER);
                    _csetf_ar_concept_open_term_score(concept, ZERO_INTEGER);
                    add_ar_object_index(state, id, concept);
                }
            } finally {
                if (NIL != release) {
                    release_lock(lock);
                }
            }
            return concept;
        }
    }

    public static SubLObject new_ar_concept(final SubLObject state, final SubLObject cycl) {
        final SubLObject concept = make_ar_concept(UNPROVIDED);
        SubLObject release = NIL;
        try {
            release = seize_lock($ar_lock$.getGlobalValue());
            final SubLObject id = next_ar_state_id(state);
            _csetf_ar_concept_id(concept, id);
            _csetf_ar_concept_cycl(concept, cycl);
            _csetf_ar_concept_parts(concept, NIL);
            _csetf_ar_concept_phrases(concept, NIL);
            _csetf_ar_concept_disambiguation_text(concept, NIL);
            _csetf_ar_concept_force(concept, NIL);
            _csetf_ar_concept_confidence(concept, ZERO_INTEGER);
            _csetf_ar_concept_open_term_score(concept, ZERO_INTEGER);
            add_ar_object_index(state, id, concept);
        } finally {
            if (NIL != release) {
                release_lock($ar_lock$.getGlobalValue());
            }
        }
        return concept;
    }

    public static final SubLObject clone_ar_concept_alt(SubLObject state, SubLObject src_concept, SubLObject new_cycl) {
        {
            SubLObject concept = make_ar_concept(UNPROVIDED);
            SubLObject lock = $ar_lock$.getGlobalValue();
            SubLObject release = NIL;
            try {
                release = seize_lock(lock);
                {
                    SubLObject id = next_ar_state_id(state);
                    _csetf_ar_concept_id(concept, id);
                    _csetf_ar_concept_cycl(concept, new_cycl);
                    _csetf_ar_concept_parts(concept, copy_list(ar_concept_parts(src_concept)));
                    _csetf_ar_concept_phrases(concept, copy_list(ar_concept_phrases(src_concept)));
                    _csetf_ar_concept_disambiguation_text(concept, ar_concept_disambiguation_text(src_concept));
                    _csetf_ar_concept_force(concept, ar_concept_force(src_concept));
                    _csetf_ar_concept_confidence(concept, ar_concept_confidence(src_concept));
                    _csetf_ar_concept_open_term_score(concept, ar_concept_open_term_score(src_concept));
                    add_ar_object_index(state, id, concept);
                }
            } finally {
                if (NIL != release) {
                    release_lock(lock);
                }
            }
            return concept;
        }
    }

    public static SubLObject clone_ar_concept(final SubLObject state, final SubLObject src_concept, final SubLObject new_cycl) {
        final SubLObject concept = make_ar_concept(UNPROVIDED);
        SubLObject release = NIL;
        try {
            release = seize_lock($ar_lock$.getGlobalValue());
            final SubLObject id = next_ar_state_id(state);
            _csetf_ar_concept_id(concept, id);
            _csetf_ar_concept_cycl(concept, new_cycl);
            _csetf_ar_concept_parts(concept, copy_list(ar_concept_parts(src_concept)));
            _csetf_ar_concept_phrases(concept, copy_list(ar_concept_phrases(src_concept)));
            _csetf_ar_concept_disambiguation_text(concept, ar_concept_disambiguation_text(src_concept));
            _csetf_ar_concept_force(concept, ar_concept_force(src_concept));
            _csetf_ar_concept_confidence(concept, ar_concept_confidence(src_concept));
            _csetf_ar_concept_open_term_score(concept, ar_concept_open_term_score(src_concept));
            add_ar_object_index(state, id, concept);
        } finally {
            if (NIL != release) {
                release_lock($ar_lock$.getGlobalValue());
            }
        }
        return concept;
    }

    /**
     *
     *
     * @unknown If you ever have any problems cloning a conept, try using this smarter form
    of cloning a concept.
     */
    @LispMethod(comment = "@unknown If you ever have any problems cloning a conept, try using this smarter form\r\nof cloning a concept.")
    public static final SubLObject rkf_ar_act_clone_augment_concept_alt(SubLObject state, SubLObject src_concept, SubLObject interpretation) {
        {
            SubLObject concept = clone_ar_concept(state, src_concept, interpretation);
            SubLObject things_to_toss = NIL;
            {
                SubLObject cdolist_list_var = ar_concept_parts(concept);
                SubLObject part = NIL;
                for (part = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , part = cdolist_list_var.first()) {
                    {
                        SubLObject subpart = ar_concept_cycl(part);
                        if (NIL == cycl_utilities.expression_find(subpart, interpretation, T, EQUALP, UNPROVIDED)) {
                            things_to_toss = cons(part, things_to_toss);
                        }
                    }
                }
            }
            {
                SubLObject cdolist_list_var = things_to_toss;
                SubLObject weakest_link = NIL;
                for (weakest_link = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , weakest_link = cdolist_list_var.first()) {
                    rem_ar_concept_part(concept, weakest_link);
                }
            }
            return concept;
        }
    }

    /**
     *
     *
     * @unknown If you ever have any problems cloning a conept, try using this smarter form
    of cloning a concept.
     */
    @LispMethod(comment = "@unknown If you ever have any problems cloning a conept, try using this smarter form\r\nof cloning a concept.")
    public static SubLObject rkf_ar_act_clone_augment_concept(final SubLObject state, final SubLObject src_concept, final SubLObject interpretation) {
        final SubLObject concept = clone_ar_concept(state, src_concept, interpretation);
        SubLObject things_to_toss = NIL;
        SubLObject cdolist_list_var = ar_concept_parts(concept);
        SubLObject part = NIL;
        part = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject subpart = ar_concept_cycl(part);
            if (NIL == cycl_utilities.expression_find(subpart, interpretation, T, EQUALP, UNPROVIDED)) {
                things_to_toss = cons(part, things_to_toss);
            }
            cdolist_list_var = cdolist_list_var.rest();
            part = cdolist_list_var.first();
        } 
        cdolist_list_var = things_to_toss;
        SubLObject weakest_link = NIL;
        weakest_link = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            rem_ar_concept_part(concept, weakest_link);
            cdolist_list_var = cdolist_list_var.rest();
            weakest_link = cdolist_list_var.first();
        } 
        return concept;
    }

    public static final SubLObject add_ar_concept_phrase_alt(SubLObject concept, SubLObject phrase) {
        SubLTrampolineFile.checkType(concept, AR_CONCEPT_P);
        SubLTrampolineFile.checkType(phrase, AR_PHRASE_P);
        {
            SubLObject lock = $ar_lock$.getGlobalValue();
            SubLObject release = NIL;
            try {
                release = seize_lock(lock);
                {
                    SubLObject item_var = phrase;
                    if (NIL == member(item_var, ar_concept_phrases(concept), symbol_function(EQL), symbol_function(IDENTITY))) {
                        _csetf_ar_concept_phrases(concept, cons(item_var, ar_concept_phrases(concept)));
                    }
                }
            } finally {
                if (NIL != release) {
                    release_lock(lock);
                }
            }
        }
        return concept;
    }

    public static SubLObject add_ar_concept_phrase(final SubLObject concept, final SubLObject phrase) {
        assert NIL != ar_concept_p(concept) : "! rkf_assisted_reader.ar_concept_p(concept) " + ("rkf_assisted_reader.ar_concept_p(concept) " + "CommonSymbols.NIL != rkf_assisted_reader.ar_concept_p(concept) ") + concept;
        assert NIL != ar_phrase_p(phrase) : "! rkf_assisted_reader.ar_phrase_p(phrase) " + ("rkf_assisted_reader.ar_phrase_p(phrase) " + "CommonSymbols.NIL != rkf_assisted_reader.ar_phrase_p(phrase) ") + phrase;
        SubLObject release = NIL;
        try {
            release = seize_lock($ar_lock$.getGlobalValue());
            if (NIL == member(phrase, ar_concept_phrases(concept), symbol_function(EQL), symbol_function(IDENTITY))) {
                _csetf_ar_concept_phrases(concept, cons(phrase, ar_concept_phrases(concept)));
            }
        } finally {
            if (NIL != release) {
                release_lock($ar_lock$.getGlobalValue());
            }
        }
        return concept;
    }

    public static final SubLObject add_ar_concept_part_alt(SubLObject concept, SubLObject part_concept) {
        SubLTrampolineFile.checkType(concept, AR_CONCEPT_P);
        SubLTrampolineFile.checkType(part_concept, AR_CONCEPT_P);
        {
            SubLObject lock = $ar_lock$.getGlobalValue();
            SubLObject release = NIL;
            try {
                release = seize_lock(lock);
                {
                    SubLObject item_var = part_concept;
                    if (NIL == member(item_var, ar_concept_parts(concept), symbol_function(EQL), symbol_function(IDENTITY))) {
                        _csetf_ar_concept_parts(concept, cons(item_var, ar_concept_parts(concept)));
                    }
                }
            } finally {
                if (NIL != release) {
                    release_lock(lock);
                }
            }
        }
        return concept;
    }

    public static SubLObject add_ar_concept_part(final SubLObject concept, final SubLObject part_concept) {
        assert NIL != ar_concept_p(concept) : "! rkf_assisted_reader.ar_concept_p(concept) " + ("rkf_assisted_reader.ar_concept_p(concept) " + "CommonSymbols.NIL != rkf_assisted_reader.ar_concept_p(concept) ") + concept;
        assert NIL != ar_concept_p(part_concept) : "! rkf_assisted_reader.ar_concept_p(part_concept) " + ("rkf_assisted_reader.ar_concept_p(part_concept) " + "CommonSymbols.NIL != rkf_assisted_reader.ar_concept_p(part_concept) ") + part_concept;
        SubLObject release = NIL;
        try {
            release = seize_lock($ar_lock$.getGlobalValue());
            if (NIL == member(part_concept, ar_concept_parts(concept), symbol_function(EQL), symbol_function(IDENTITY))) {
                _csetf_ar_concept_parts(concept, cons(part_concept, ar_concept_parts(concept)));
            }
        } finally {
            if (NIL != release) {
                release_lock($ar_lock$.getGlobalValue());
            }
        }
        return concept;
    }

    public static final SubLObject rem_ar_concept_part_alt(SubLObject concept, SubLObject part_concept) {
        SubLTrampolineFile.checkType(concept, AR_CONCEPT_P);
        SubLTrampolineFile.checkType(part_concept, AR_CONCEPT_P);
        {
            SubLObject lock = $ar_lock$.getGlobalValue();
            SubLObject release = NIL;
            try {
                release = seize_lock(lock);
                _csetf_ar_concept_parts(concept, delete(part_concept, ar_concept_parts(concept), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
            } finally {
                if (NIL != release) {
                    release_lock(lock);
                }
            }
        }
        return concept;
    }

    public static SubLObject rem_ar_concept_part(final SubLObject concept, final SubLObject part_concept) {
        assert NIL != ar_concept_p(concept) : "! rkf_assisted_reader.ar_concept_p(concept) " + ("rkf_assisted_reader.ar_concept_p(concept) " + "CommonSymbols.NIL != rkf_assisted_reader.ar_concept_p(concept) ") + concept;
        assert NIL != ar_concept_p(part_concept) : "! rkf_assisted_reader.ar_concept_p(part_concept) " + ("rkf_assisted_reader.ar_concept_p(part_concept) " + "CommonSymbols.NIL != rkf_assisted_reader.ar_concept_p(part_concept) ") + part_concept;
        SubLObject release = NIL;
        try {
            release = seize_lock($ar_lock$.getGlobalValue());
            _csetf_ar_concept_parts(concept, delete(part_concept, ar_concept_parts(concept), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
        } finally {
            if (NIL != release) {
                release_lock($ar_lock$.getGlobalValue());
            }
        }
        return concept;
    }

    public static final SubLObject add_ar_concept_agglomeration_alt(SubLObject concept, SubLObject agglomeration) {
        SubLTrampolineFile.checkType(concept, AR_CONCEPT_P);
        SubLTrampolineFile.checkType(agglomeration, AR_CONCEPT_P);
        {
            SubLObject lock = $ar_lock$.getGlobalValue();
            SubLObject release = NIL;
            try {
                release = seize_lock(lock);
                {
                    SubLObject item_var = agglomeration;
                    if (NIL == member(item_var, ar_concept_agglomerations(concept), symbol_function(EQL), symbol_function(IDENTITY))) {
                        _csetf_ar_concept_agglomerations(concept, cons(item_var, ar_concept_agglomerations(concept)));
                    }
                }
            } finally {
                if (NIL != release) {
                    release_lock(lock);
                }
            }
        }
        return concept;
    }

    public static SubLObject add_ar_concept_agglomeration(final SubLObject concept, final SubLObject agglomeration) {
        assert NIL != ar_concept_p(concept) : "! rkf_assisted_reader.ar_concept_p(concept) " + ("rkf_assisted_reader.ar_concept_p(concept) " + "CommonSymbols.NIL != rkf_assisted_reader.ar_concept_p(concept) ") + concept;
        assert NIL != ar_concept_p(agglomeration) : "! rkf_assisted_reader.ar_concept_p(agglomeration) " + ("rkf_assisted_reader.ar_concept_p(agglomeration) " + "CommonSymbols.NIL != rkf_assisted_reader.ar_concept_p(agglomeration) ") + agglomeration;
        SubLObject release = NIL;
        try {
            release = seize_lock($ar_lock$.getGlobalValue());
            if (NIL == member(agglomeration, ar_concept_agglomerations(concept), symbol_function(EQL), symbol_function(IDENTITY))) {
                _csetf_ar_concept_agglomerations(concept, cons(agglomeration, ar_concept_agglomerations(concept)));
            }
        } finally {
            if (NIL != release) {
                release_lock($ar_lock$.getGlobalValue());
            }
        }
        return concept;
    }

    public static final SubLObject rem_ar_concept_agglomeration_alt(SubLObject concept, SubLObject agglomeration) {
        SubLTrampolineFile.checkType(concept, AR_CONCEPT_P);
        SubLTrampolineFile.checkType(agglomeration, AR_CONCEPT_P);
        {
            SubLObject lock = $ar_lock$.getGlobalValue();
            SubLObject release = NIL;
            try {
                release = seize_lock(lock);
                _csetf_ar_concept_agglomerations(concept, delete(agglomeration, ar_concept_agglomerations(concept), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
            } finally {
                if (NIL != release) {
                    release_lock(lock);
                }
            }
        }
        return concept;
    }

    public static SubLObject rem_ar_concept_agglomeration(final SubLObject concept, final SubLObject agglomeration) {
        assert NIL != ar_concept_p(concept) : "! rkf_assisted_reader.ar_concept_p(concept) " + ("rkf_assisted_reader.ar_concept_p(concept) " + "CommonSymbols.NIL != rkf_assisted_reader.ar_concept_p(concept) ") + concept;
        assert NIL != ar_concept_p(agglomeration) : "! rkf_assisted_reader.ar_concept_p(agglomeration) " + ("rkf_assisted_reader.ar_concept_p(agglomeration) " + "CommonSymbols.NIL != rkf_assisted_reader.ar_concept_p(agglomeration) ") + agglomeration;
        SubLObject release = NIL;
        try {
            release = seize_lock($ar_lock$.getGlobalValue());
            _csetf_ar_concept_agglomerations(concept, delete(agglomeration, ar_concept_agglomerations(concept), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
        } finally {
            if (NIL != release) {
                release_lock($ar_lock$.getGlobalValue());
            }
        }
        return concept;
    }

    public static final SubLObject note_ar_concept_disambiguation_text_alt(SubLObject concept, SubLObject text) {
        SubLTrampolineFile.checkType(concept, AR_CONCEPT_P);
        SubLTrampolineFile.checkType(text, STRINGP);
        {
            SubLObject lock = $ar_lock$.getGlobalValue();
            SubLObject release = NIL;
            try {
                release = seize_lock(lock);
                _csetf_ar_concept_disambiguation_text(concept, text);
            } finally {
                if (NIL != release) {
                    release_lock(lock);
                }
            }
        }
        return concept;
    }

    public static SubLObject note_ar_concept_disambiguation_text(final SubLObject concept, final SubLObject text) {
        assert NIL != ar_concept_p(concept) : "! rkf_assisted_reader.ar_concept_p(concept) " + ("rkf_assisted_reader.ar_concept_p(concept) " + "CommonSymbols.NIL != rkf_assisted_reader.ar_concept_p(concept) ") + concept;
        assert NIL != stringp(text) : "! stringp(text) " + ("Types.stringp(text) " + "CommonSymbols.NIL != Types.stringp(text) ") + text;
        SubLObject release = NIL;
        try {
            release = seize_lock($ar_lock$.getGlobalValue());
            _csetf_ar_concept_disambiguation_text(concept, text);
        } finally {
            if (NIL != release) {
                release_lock($ar_lock$.getGlobalValue());
            }
        }
        return concept;
    }

    public static final SubLObject replace_ar_concept_cycl_alt(SubLObject concept, SubLObject new_cycl) {
        SubLTrampolineFile.checkType(concept, AR_CONCEPT_P);
        {
            SubLObject lock = $ar_lock$.getGlobalValue();
            SubLObject release = NIL;
            try {
                release = seize_lock(lock);
                _csetf_ar_concept_cycl(concept, new_cycl);
            } finally {
                if (NIL != release) {
                    release_lock(lock);
                }
            }
        }
        return concept;
    }

    public static SubLObject replace_ar_concept_cycl(final SubLObject concept, final SubLObject new_cycl) {
        assert NIL != ar_concept_p(concept) : "! rkf_assisted_reader.ar_concept_p(concept) " + ("rkf_assisted_reader.ar_concept_p(concept) " + "CommonSymbols.NIL != rkf_assisted_reader.ar_concept_p(concept) ") + concept;
        SubLObject release = NIL;
        try {
            release = seize_lock($ar_lock$.getGlobalValue());
            _csetf_ar_concept_cycl(concept, new_cycl);
        } finally {
            if (NIL != release) {
                release_lock($ar_lock$.getGlobalValue());
            }
        }
        return concept;
    }

    /**
     * Substitute NEW for OLD in the CycL for CONCEPT
     */
    @LispMethod(comment = "Substitute NEW for OLD in the CycL for CONCEPT")
    public static final SubLObject subst_ar_concept_cycl_alt(SubLObject concept, SubLObject v_new, SubLObject old) {
        SubLTrampolineFile.checkType(concept, AR_CONCEPT_P);
        {
            SubLObject original_cycl = ar_concept_cycl(concept);
            SubLObject new_cycl = subst(v_new, old, original_cycl, symbol_function(EQUAL), UNPROVIDED);
            replace_ar_concept_cycl(concept, new_cycl);
        }
        return concept;
    }

    /**
     * Substitute NEW for OLD in the CycL for CONCEPT
     */
    @LispMethod(comment = "Substitute NEW for OLD in the CycL for CONCEPT")
    public static SubLObject subst_ar_concept_cycl(final SubLObject concept, final SubLObject v_new, final SubLObject old) {
        assert NIL != ar_concept_p(concept) : "! rkf_assisted_reader.ar_concept_p(concept) " + ("rkf_assisted_reader.ar_concept_p(concept) " + "CommonSymbols.NIL != rkf_assisted_reader.ar_concept_p(concept) ") + concept;
        final SubLObject original_cycl = ar_concept_cycl(concept);
        final SubLObject new_cycl = subst(v_new, old, original_cycl, symbol_function(EQUAL), UNPROVIDED);
        replace_ar_concept_cycl(concept, new_cycl);
        return concept;
    }

    public static final SubLObject note_ar_concept_force_alt(SubLObject concept, SubLObject force) {
        SubLTrampolineFile.checkType(concept, AR_CONCEPT_P);
        if (force.isKeyword()) {
            {
                SubLObject lock = $ar_lock$.getGlobalValue();
                SubLObject release = NIL;
                try {
                    release = seize_lock(lock);
                    _csetf_ar_concept_force(concept, force);
                } finally {
                    if (NIL != release) {
                        release_lock(lock);
                    }
                }
            }
        }
        return concept;
    }

    public static SubLObject note_ar_concept_force(final SubLObject concept, final SubLObject force) {
        assert NIL != ar_concept_p(concept) : "! rkf_assisted_reader.ar_concept_p(concept) " + ("rkf_assisted_reader.ar_concept_p(concept) " + "CommonSymbols.NIL != rkf_assisted_reader.ar_concept_p(concept) ") + concept;
        if (force.isKeyword()) {
            SubLObject release = NIL;
            try {
                release = seize_lock($ar_lock$.getGlobalValue());
                _csetf_ar_concept_force(concept, force);
            } finally {
                if (NIL != release) {
                    release_lock($ar_lock$.getGlobalValue());
                }
            }
        }
        return concept;
    }

    public static final SubLObject ar_concept_queryP_alt(SubLObject concept) {
        return ar_concept_force(concept) == $QUESTION ? ((SubLObject) ($QUESTION)) : NIL;
    }

    public static SubLObject ar_concept_queryP(final SubLObject concept) {
        return ar_concept_force(concept) == $QUESTION ? $QUESTION : NIL;
    }

    public static final SubLObject ar_concept_assertionP_alt(SubLObject concept) {
        return ar_concept_force(concept) == $DECLARATIVE ? ((SubLObject) ($DECLARATIVE)) : NIL;
    }

    public static SubLObject ar_concept_assertionP(final SubLObject concept) {
        return ar_concept_force(concept) == $DECLARATIVE ? $DECLARATIVE : NIL;
    }

    /**
     *
     *
     * @param CONCEPT
    ar-concept
     * 		
     * @param CONFIDENCE
     * 		real; between 0 and 1 (inclusive)
     */
    @LispMethod(comment = "@param CONCEPT\nar-concept\r\n\t\t\r\n@param CONFIDENCE\r\n\t\treal; between 0 and 1 (inclusive)")
    public static final SubLObject note_ar_concept_confidence_alt(SubLObject concept, SubLObject confidence) {
        SubLTrampolineFile.checkType(concept, AR_CONCEPT_P);
        if (confidence.isNumber() && ZERO_INTEGER.numGE(confidence)) {
            {
                SubLObject lock = $ar_lock$.getGlobalValue();
                SubLObject release = NIL;
                try {
                    release = seize_lock(lock);
                    _csetf_ar_concept_confidence(concept, confidence);
                } finally {
                    if (NIL != release) {
                        release_lock(lock);
                    }
                }
            }
        }
        return concept;
    }

    /**
     *
     *
     * @param CONCEPT
    ar-concept
     * 		
     * @param CONFIDENCE
     * 		real; between 0 and 1 (inclusive)
     */
    @LispMethod(comment = "@param CONCEPT\nar-concept\r\n\t\t\r\n@param CONFIDENCE\r\n\t\treal; between 0 and 1 (inclusive)")
    public static SubLObject note_ar_concept_confidence(final SubLObject concept, final SubLObject confidence) {
        assert NIL != ar_concept_p(concept) : "! rkf_assisted_reader.ar_concept_p(concept) " + ("rkf_assisted_reader.ar_concept_p(concept) " + "CommonSymbols.NIL != rkf_assisted_reader.ar_concept_p(concept) ") + concept;
        if (confidence.isNumber() && ZERO_INTEGER.numGE(confidence)) {
            SubLObject release = NIL;
            try {
                release = seize_lock($ar_lock$.getGlobalValue());
                _csetf_ar_concept_confidence(concept, confidence);
            } finally {
                if (NIL != release) {
                    release_lock($ar_lock$.getGlobalValue());
                }
            }
        }
        return concept;
    }

    /**
     *
     *
     * @param CONCEPT
    ar-concept
     * 		
     * @param OPEN-TERM-SCORE
     * 		integer; <= 0, corresponds to the number of open terms
     */
    @LispMethod(comment = "@param CONCEPT\nar-concept\r\n\t\t\r\n@param OPEN-TERM-SCORE\r\n\t\tinteger; <= 0, corresponds to the number of open terms")
    public static final SubLObject note_ar_concept_open_term_score_alt(SubLObject concept, SubLObject open_term_score) {
        SubLTrampolineFile.checkType(concept, AR_CONCEPT_P);
        if (open_term_score.isNumber() && ZERO_INTEGER.numLE(open_term_score)) {
            {
                SubLObject lock = $ar_lock$.getGlobalValue();
                SubLObject release = NIL;
                try {
                    release = seize_lock(lock);
                    _csetf_ar_concept_open_term_score(concept, open_term_score);
                } finally {
                    if (NIL != release) {
                        release_lock(lock);
                    }
                }
            }
        }
        return concept;
    }

    /**
     *
     *
     * @param CONCEPT
    ar-concept
     * 		
     * @param OPEN-TERM-SCORE
     * 		integer; <= 0, corresponds to the number of open terms
     */
    @LispMethod(comment = "@param CONCEPT\nar-concept\r\n\t\t\r\n@param OPEN-TERM-SCORE\r\n\t\tinteger; <= 0, corresponds to the number of open terms")
    public static SubLObject note_ar_concept_open_term_score(final SubLObject concept, final SubLObject open_term_score) {
        assert NIL != ar_concept_p(concept) : "! rkf_assisted_reader.ar_concept_p(concept) " + ("rkf_assisted_reader.ar_concept_p(concept) " + "CommonSymbols.NIL != rkf_assisted_reader.ar_concept_p(concept) ") + concept;
        if (open_term_score.isNumber() && ZERO_INTEGER.numLE(open_term_score)) {
            SubLObject release = NIL;
            try {
                release = seize_lock($ar_lock$.getGlobalValue());
                _csetf_ar_concept_open_term_score(concept, open_term_score);
            } finally {
                if (NIL != release) {
                    release_lock($ar_lock$.getGlobalValue());
                }
            }
        }
        return concept;
    }

    public static final SubLObject ar_template_print_function_trampoline_alt(SubLObject v_object, SubLObject stream) {
        compatibility.default_struct_print_function(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject ar_template_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        compatibility.default_struct_print_function(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject ar_template_p_alt(SubLObject v_object) {
        return v_object.getClass() == com.cyc.cycjava.cycl.rkf_assisted_reader.$ar_template_native.class ? ((SubLObject) (T)) : NIL;
    }

    public static SubLObject ar_template_p(final SubLObject v_object) {
        return v_object.getClass() == com.cyc.cycjava.cycl.rkf_assisted_reader.$ar_template_native.class ? T : NIL;
    }

    public static final SubLObject ar_template_id_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, AR_TEMPLATE_P);
        return v_object.getField2();
    }

    public static SubLObject ar_template_id(final SubLObject v_object) {
        assert NIL != ar_template_p(v_object) : "! rkf_assisted_reader.ar_template_p(v_object) " + "rkf_assisted_reader.ar_template_p error :" + v_object;
        return v_object.getField2();
    }

    public static final SubLObject ar_template_concept_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, AR_TEMPLATE_P);
        return v_object.getField3();
    }

    public static SubLObject ar_template_concept(final SubLObject v_object) {
        assert NIL != ar_template_p(v_object) : "! rkf_assisted_reader.ar_template_p(v_object) " + "rkf_assisted_reader.ar_template_p error :" + v_object;
        return v_object.getField3();
    }

    public static final SubLObject ar_template_formula_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, AR_TEMPLATE_P);
        return v_object.getField4();
    }

    public static SubLObject ar_template_formula(final SubLObject v_object) {
        assert NIL != ar_template_p(v_object) : "! rkf_assisted_reader.ar_template_p(v_object) " + "rkf_assisted_reader.ar_template_p error :" + v_object;
        return v_object.getField4();
    }

    public static final SubLObject ar_template_prompt_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, AR_TEMPLATE_P);
        return v_object.getField5();
    }

    public static SubLObject ar_template_prompt(final SubLObject v_object) {
        assert NIL != ar_template_p(v_object) : "! rkf_assisted_reader.ar_template_p(v_object) " + "rkf_assisted_reader.ar_template_p error :" + v_object;
        return v_object.getField5();
    }

    public static final SubLObject ar_template_choice_table_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, AR_TEMPLATE_P);
        return v_object.getField6();
    }

    public static SubLObject ar_template_choice_table(final SubLObject v_object) {
        assert NIL != ar_template_p(v_object) : "! rkf_assisted_reader.ar_template_p(v_object) " + "rkf_assisted_reader.ar_template_p error :" + v_object;
        return v_object.getField6();
    }

    public static final SubLObject ar_template_agglomerations_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, AR_TEMPLATE_P);
        return v_object.getField7();
    }

    public static SubLObject ar_template_agglomerations(final SubLObject v_object) {
        assert NIL != ar_template_p(v_object) : "! rkf_assisted_reader.ar_template_p(v_object) " + "rkf_assisted_reader.ar_template_p error :" + v_object;
        return v_object.getField7();
    }

    public static final SubLObject _csetf_ar_template_id_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, AR_TEMPLATE_P);
        return v_object.setField2(value);
    }

    public static SubLObject _csetf_ar_template_id(final SubLObject v_object, final SubLObject value) {
        assert NIL != ar_template_p(v_object) : "! rkf_assisted_reader.ar_template_p(v_object) " + "rkf_assisted_reader.ar_template_p error :" + v_object;
        return v_object.setField2(value);
    }

    public static final SubLObject _csetf_ar_template_concept_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, AR_TEMPLATE_P);
        return v_object.setField3(value);
    }

    public static SubLObject _csetf_ar_template_concept(final SubLObject v_object, final SubLObject value) {
        assert NIL != ar_template_p(v_object) : "! rkf_assisted_reader.ar_template_p(v_object) " + "rkf_assisted_reader.ar_template_p error :" + v_object;
        return v_object.setField3(value);
    }

    public static final SubLObject _csetf_ar_template_formula_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, AR_TEMPLATE_P);
        return v_object.setField4(value);
    }

    public static SubLObject _csetf_ar_template_formula(final SubLObject v_object, final SubLObject value) {
        assert NIL != ar_template_p(v_object) : "! rkf_assisted_reader.ar_template_p(v_object) " + "rkf_assisted_reader.ar_template_p error :" + v_object;
        return v_object.setField4(value);
    }

    public static final SubLObject _csetf_ar_template_prompt_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, AR_TEMPLATE_P);
        return v_object.setField5(value);
    }

    public static SubLObject _csetf_ar_template_prompt(final SubLObject v_object, final SubLObject value) {
        assert NIL != ar_template_p(v_object) : "! rkf_assisted_reader.ar_template_p(v_object) " + "rkf_assisted_reader.ar_template_p error :" + v_object;
        return v_object.setField5(value);
    }

    public static final SubLObject _csetf_ar_template_choice_table_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, AR_TEMPLATE_P);
        return v_object.setField6(value);
    }

    public static SubLObject _csetf_ar_template_choice_table(final SubLObject v_object, final SubLObject value) {
        assert NIL != ar_template_p(v_object) : "! rkf_assisted_reader.ar_template_p(v_object) " + "rkf_assisted_reader.ar_template_p error :" + v_object;
        return v_object.setField6(value);
    }

    public static final SubLObject _csetf_ar_template_agglomerations_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, AR_TEMPLATE_P);
        return v_object.setField7(value);
    }

    public static SubLObject _csetf_ar_template_agglomerations(final SubLObject v_object, final SubLObject value) {
        assert NIL != ar_template_p(v_object) : "! rkf_assisted_reader.ar_template_p(v_object) " + "rkf_assisted_reader.ar_template_p error :" + v_object;
        return v_object.setField7(value);
    }

    public static final SubLObject make_ar_template_alt(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        {
            SubLObject v_new = new com.cyc.cycjava.cycl.rkf_assisted_reader.$ar_template_native();
            SubLObject next = NIL;
            for (next = arglist; NIL != next; next = cddr(next)) {
                {
                    SubLObject current_arg = next.first();
                    SubLObject current_value = cadr(next);
                    SubLObject pcase_var = current_arg;
                    if (pcase_var.eql($ID)) {
                        _csetf_ar_template_id(v_new, current_value);
                    } else {
                        if (pcase_var.eql($CONCEPT)) {
                            _csetf_ar_template_concept(v_new, current_value);
                        } else {
                            if (pcase_var.eql($FORMULA)) {
                                _csetf_ar_template_formula(v_new, current_value);
                            } else {
                                if (pcase_var.eql($PROMPT)) {
                                    _csetf_ar_template_prompt(v_new, current_value);
                                } else {
                                    if (pcase_var.eql($CHOICE_TABLE)) {
                                        _csetf_ar_template_choice_table(v_new, current_value);
                                    } else {
                                        if (pcase_var.eql($AGGLOMERATIONS)) {
                                            _csetf_ar_template_agglomerations(v_new, current_value);
                                        } else {
                                            Errors.error($str_alt29$Invalid_slot__S_for_construction_, current_arg);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return v_new;
        }
    }

    public static SubLObject make_ar_template(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new com.cyc.cycjava.cycl.rkf_assisted_reader.$ar_template_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
            current_arg = next.first();
            current_value = cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql($ID)) {
                _csetf_ar_template_id(v_new, current_value);
            } else
                if (pcase_var.eql($CONCEPT)) {
                    _csetf_ar_template_concept(v_new, current_value);
                } else
                    if (pcase_var.eql($FORMULA)) {
                        _csetf_ar_template_formula(v_new, current_value);
                    } else
                        if (pcase_var.eql($PROMPT)) {
                            _csetf_ar_template_prompt(v_new, current_value);
                        } else
                            if (pcase_var.eql($CHOICE_TABLE)) {
                                _csetf_ar_template_choice_table(v_new, current_value);
                            } else
                                if (pcase_var.eql($AGGLOMERATIONS)) {
                                    _csetf_ar_template_agglomerations(v_new, current_value);
                                } else {
                                    Errors.error($str30$Invalid_slot__S_for_construction_, current_arg);
                                }





        }
        return v_new;
    }

    public static SubLObject visit_defstruct_ar_template(final SubLObject obj, final SubLObject visitor_fn) {
        funcall(visitor_fn, obj, $BEGIN, MAKE_AR_TEMPLATE, SIX_INTEGER);
        funcall(visitor_fn, obj, $SLOT, $ID, ar_template_id(obj));
        funcall(visitor_fn, obj, $SLOT, $CONCEPT, ar_template_concept(obj));
        funcall(visitor_fn, obj, $SLOT, $FORMULA, ar_template_formula(obj));
        funcall(visitor_fn, obj, $SLOT, $PROMPT, ar_template_prompt(obj));
        funcall(visitor_fn, obj, $SLOT, $CHOICE_TABLE, ar_template_choice_table(obj));
        funcall(visitor_fn, obj, $SLOT, $AGGLOMERATIONS, ar_template_agglomerations(obj));
        funcall(visitor_fn, obj, $END, MAKE_AR_TEMPLATE, SIX_INTEGER);
        return obj;
    }

    public static SubLObject visit_defstruct_object_ar_template_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_ar_template(obj, visitor_fn);
    }

    public static final SubLObject sxhash_ar_template_method_alt(SubLObject v_object) {
        return Sxhash.sxhash(ar_template_id(v_object));
    }

    public static SubLObject sxhash_ar_template_method(final SubLObject v_object) {
        return Sxhash.sxhash(ar_template_id(v_object));
    }

    public static final SubLObject new_ar_template_alt(SubLObject state, SubLObject concept) {
        {
            SubLObject template = make_ar_template(UNPROVIDED);
            SubLObject lock = $ar_lock$.getGlobalValue();
            SubLObject release = NIL;
            try {
                release = seize_lock(lock);
                {
                    SubLObject id = next_ar_state_id(state);
                    _csetf_ar_template_id(template, id);
                    _csetf_ar_template_concept(template, concept);
                    add_ar_object_index(state, id, template);
                }
            } finally {
                if (NIL != release) {
                    release_lock(lock);
                }
            }
            return template;
        }
    }

    public static SubLObject new_ar_template(final SubLObject state, final SubLObject concept) {
        final SubLObject template = make_ar_template(UNPROVIDED);
        SubLObject release = NIL;
        try {
            release = seize_lock($ar_lock$.getGlobalValue());
            final SubLObject id = next_ar_state_id(state);
            _csetf_ar_template_id(template, id);
            _csetf_ar_template_concept(template, concept);
            add_ar_object_index(state, id, template);
        } finally {
            if (NIL != release) {
                release_lock($ar_lock$.getGlobalValue());
            }
        }
        return template;
    }

    public static final SubLObject note_ar_template_formula_alt(SubLObject template, SubLObject formula) {
        SubLTrampolineFile.checkType(template, AR_TEMPLATE_P);
        SubLTrampolineFile.checkType(formula, CONSP);
        {
            SubLObject lock = $ar_lock$.getGlobalValue();
            SubLObject release = NIL;
            try {
                release = seize_lock(lock);
                _csetf_ar_template_formula(template, formula);
            } finally {
                if (NIL != release) {
                    release_lock(lock);
                }
            }
        }
        return template;
    }

    public static SubLObject note_ar_template_formula(final SubLObject template, final SubLObject formula) {
        assert NIL != ar_template_p(template) : "! rkf_assisted_reader.ar_template_p(template) " + ("rkf_assisted_reader.ar_template_p(template) " + "CommonSymbols.NIL != rkf_assisted_reader.ar_template_p(template) ") + template;
        assert NIL != consp(formula) : "! consp(formula) " + ("Types.consp(formula) " + "CommonSymbols.NIL != Types.consp(formula) ") + formula;
        SubLObject release = NIL;
        try {
            release = seize_lock($ar_lock$.getGlobalValue());
            _csetf_ar_template_formula(template, formula);
        } finally {
            if (NIL != release) {
                release_lock($ar_lock$.getGlobalValue());
            }
        }
        return template;
    }

    public static final SubLObject note_ar_template_prompt_alt(SubLObject template, SubLObject prompt) {
        SubLTrampolineFile.checkType(template, AR_TEMPLATE_P);
        SubLTrampolineFile.checkType(prompt, CONSP);
        {
            SubLObject lock = $ar_lock$.getGlobalValue();
            SubLObject release = NIL;
            try {
                release = seize_lock(lock);
                _csetf_ar_template_prompt(template, prompt);
            } finally {
                if (NIL != release) {
                    release_lock(lock);
                }
            }
        }
        return template;
    }

    public static SubLObject note_ar_template_prompt(final SubLObject template, final SubLObject prompt) {
        assert NIL != ar_template_p(template) : "! rkf_assisted_reader.ar_template_p(template) " + ("rkf_assisted_reader.ar_template_p(template) " + "CommonSymbols.NIL != rkf_assisted_reader.ar_template_p(template) ") + template;
        assert NIL != consp(prompt) : "! consp(prompt) " + ("Types.consp(prompt) " + "CommonSymbols.NIL != Types.consp(prompt) ") + prompt;
        SubLObject release = NIL;
        try {
            release = seize_lock($ar_lock$.getGlobalValue());
            _csetf_ar_template_prompt(template, prompt);
        } finally {
            if (NIL != release) {
                release_lock($ar_lock$.getGlobalValue());
            }
        }
        return template;
    }

    public static final SubLObject note_ar_template_choice_table_alt(SubLObject template, SubLObject choice_table) {
        SubLTrampolineFile.checkType(template, AR_TEMPLATE_P);
        SubLTrampolineFile.checkType(choice_table, CONSP);
        {
            SubLObject lock = $ar_lock$.getGlobalValue();
            SubLObject release = NIL;
            try {
                release = seize_lock(lock);
                _csetf_ar_template_choice_table(template, choice_table);
            } finally {
                if (NIL != release) {
                    release_lock(lock);
                }
            }
        }
        return template;
    }

    public static SubLObject note_ar_template_choice_table(final SubLObject template, final SubLObject choice_table) {
        assert NIL != ar_template_p(template) : "! rkf_assisted_reader.ar_template_p(template) " + ("rkf_assisted_reader.ar_template_p(template) " + "CommonSymbols.NIL != rkf_assisted_reader.ar_template_p(template) ") + template;
        assert NIL != consp(choice_table) : "! consp(choice_table) " + ("Types.consp(choice_table) " + "CommonSymbols.NIL != Types.consp(choice_table) ") + choice_table;
        SubLObject release = NIL;
        try {
            release = seize_lock($ar_lock$.getGlobalValue());
            _csetf_ar_template_choice_table(template, choice_table);
        } finally {
            if (NIL != release) {
                release_lock($ar_lock$.getGlobalValue());
            }
        }
        return template;
    }

    public static final SubLObject add_ar_template_agglomeration_alt(SubLObject template, SubLObject agglomeration) {
        SubLTrampolineFile.checkType(template, AR_TEMPLATE_P);
        SubLTrampolineFile.checkType(agglomeration, AR_CONCEPT_P);
        {
            SubLObject lock = $ar_lock$.getGlobalValue();
            SubLObject release = NIL;
            try {
                release = seize_lock(lock);
                {
                    SubLObject item_var = agglomeration;
                    if (NIL == member(item_var, ar_template_agglomerations(template), symbol_function(EQL), symbol_function(IDENTITY))) {
                        _csetf_ar_template_agglomerations(template, cons(item_var, ar_template_agglomerations(template)));
                    }
                }
            } finally {
                if (NIL != release) {
                    release_lock(lock);
                }
            }
        }
        return template;
    }

    public static SubLObject add_ar_template_agglomeration(final SubLObject template, final SubLObject agglomeration) {
        assert NIL != ar_template_p(template) : "! rkf_assisted_reader.ar_template_p(template) " + ("rkf_assisted_reader.ar_template_p(template) " + "CommonSymbols.NIL != rkf_assisted_reader.ar_template_p(template) ") + template;
        assert NIL != ar_concept_p(agglomeration) : "! rkf_assisted_reader.ar_concept_p(agglomeration) " + ("rkf_assisted_reader.ar_concept_p(agglomeration) " + "CommonSymbols.NIL != rkf_assisted_reader.ar_concept_p(agglomeration) ") + agglomeration;
        SubLObject release = NIL;
        try {
            release = seize_lock($ar_lock$.getGlobalValue());
            if (NIL == member(agglomeration, ar_template_agglomerations(template), symbol_function(EQL), symbol_function(IDENTITY))) {
                _csetf_ar_template_agglomerations(template, cons(agglomeration, ar_template_agglomerations(template)));
            }
        } finally {
            if (NIL != release) {
                release_lock($ar_lock$.getGlobalValue());
            }
        }
        return template;
    }

    public static final SubLObject ar_state_print_function_trampoline_alt(SubLObject v_object, SubLObject stream) {
        compatibility.default_struct_print_function(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject ar_state_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        compatibility.default_struct_print_function(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject ar_state_p_alt(SubLObject v_object) {
        return v_object.getClass() == com.cyc.cycjava.cycl.rkf_assisted_reader.$ar_state_native.class ? ((SubLObject) (T)) : NIL;
    }

    public static SubLObject ar_state_p(final SubLObject v_object) {
        return v_object.getClass() == com.cyc.cycjava.cycl.rkf_assisted_reader.$ar_state_native.class ? T : NIL;
    }

    public static final SubLObject ar_state_isg_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, AR_STATE_P);
        return v_object.getField2();
    }

    public static SubLObject ar_state_isg(final SubLObject v_object) {
        assert NIL != ar_state_p(v_object) : "! rkf_assisted_reader.ar_state_p(v_object) " + "rkf_assisted_reader.ar_state_p error :" + v_object;
        return v_object.getField2();
    }

    public static final SubLObject ar_state_index_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, AR_STATE_P);
        return v_object.getField3();
    }

    public static SubLObject ar_state_index(final SubLObject v_object) {
        assert NIL != ar_state_p(v_object) : "! rkf_assisted_reader.ar_state_p(v_object) " + "rkf_assisted_reader.ar_state_p error :" + v_object;
        return v_object.getField3();
    }

    public static final SubLObject ar_state_source_sentences_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, AR_STATE_P);
        return v_object.getField4();
    }

    public static SubLObject ar_state_source_sentences(final SubLObject v_object) {
        assert NIL != ar_state_p(v_object) : "! rkf_assisted_reader.ar_state_p(v_object) " + "rkf_assisted_reader.ar_state_p error :" + v_object;
        return v_object.getField4();
    }

    public static final SubLObject ar_state_focus_sentence_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, AR_STATE_P);
        return v_object.getField5();
    }

    public static SubLObject ar_state_focus_sentence(final SubLObject v_object) {
        assert NIL != ar_state_p(v_object) : "! rkf_assisted_reader.ar_state_p(v_object) " + "rkf_assisted_reader.ar_state_p error :" + v_object;
        return v_object.getField5();
    }

    public static final SubLObject ar_state_completed_sentences_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, AR_STATE_P);
        return v_object.getField6();
    }

    public static SubLObject ar_state_completed_sentences(final SubLObject v_object) {
        assert NIL != ar_state_p(v_object) : "! rkf_assisted_reader.ar_state_p(v_object) " + "rkf_assisted_reader.ar_state_p error :" + v_object;
        return v_object.getField6();
    }

    public static final SubLObject ar_state_unknown_phrases_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, AR_STATE_P);
        return v_object.getField7();
    }

    public static SubLObject ar_state_unknown_phrases(final SubLObject v_object) {
        assert NIL != ar_state_p(v_object) : "! rkf_assisted_reader.ar_state_p(v_object) " + "rkf_assisted_reader.ar_state_p error :" + v_object;
        return v_object.getField7();
    }

    public static final SubLObject ar_state_rejected_phrases_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, AR_STATE_P);
        return v_object.getField8();
    }

    public static SubLObject ar_state_rejected_phrases(final SubLObject v_object) {
        assert NIL != ar_state_p(v_object) : "! rkf_assisted_reader.ar_state_p(v_object) " + "rkf_assisted_reader.ar_state_p error :" + v_object;
        return v_object.getField8();
    }

    public static final SubLObject ar_state_irrelevant_phrases_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, AR_STATE_P);
        return v_object.getField9();
    }

    public static SubLObject ar_state_irrelevant_phrases(final SubLObject v_object) {
        assert NIL != ar_state_p(v_object) : "! rkf_assisted_reader.ar_state_p(v_object) " + "rkf_assisted_reader.ar_state_p error :" + v_object;
        return v_object.getField9();
    }

    public static final SubLObject ar_state_ambiguous_phrases_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, AR_STATE_P);
        return v_object.getField10();
    }

    public static SubLObject ar_state_ambiguous_phrases(final SubLObject v_object) {
        assert NIL != ar_state_p(v_object) : "! rkf_assisted_reader.ar_state_p(v_object) " + "rkf_assisted_reader.ar_state_p error :" + v_object;
        return v_object.getField10();
    }

    public static final SubLObject ar_state_assumed_phrases_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, AR_STATE_P);
        return v_object.getField11();
    }

    public static SubLObject ar_state_assumed_phrases(final SubLObject v_object) {
        assert NIL != ar_state_p(v_object) : "! rkf_assisted_reader.ar_state_p(v_object) " + "rkf_assisted_reader.ar_state_p error :" + v_object;
        return v_object.getField11();
    }

    public static final SubLObject ar_state_pending_phrases_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, AR_STATE_P);
        return v_object.getField12();
    }

    public static SubLObject ar_state_pending_phrases(final SubLObject v_object) {
        assert NIL != ar_state_p(v_object) : "! rkf_assisted_reader.ar_state_p(v_object) " + "rkf_assisted_reader.ar_state_p error :" + v_object;
        return v_object.getField12();
    }

    public static final SubLObject ar_state_accepted_phrases_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, AR_STATE_P);
        return v_object.getField13();
    }

    public static SubLObject ar_state_accepted_phrases(final SubLObject v_object) {
        assert NIL != ar_state_p(v_object) : "! rkf_assisted_reader.ar_state_p(v_object) " + "rkf_assisted_reader.ar_state_p error :" + v_object;
        return v_object.getField13();
    }

    public static final SubLObject ar_state_pending_concepts_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, AR_STATE_P);
        return v_object.getField14();
    }

    public static SubLObject ar_state_pending_concepts(final SubLObject v_object) {
        assert NIL != ar_state_p(v_object) : "! rkf_assisted_reader.ar_state_p(v_object) " + "rkf_assisted_reader.ar_state_p error :" + v_object;
        return v_object.getField14();
    }

    public static final SubLObject ar_state_accepted_concepts_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, AR_STATE_P);
        return v_object.getField15();
    }

    public static SubLObject ar_state_accepted_concepts(final SubLObject v_object) {
        assert NIL != ar_state_p(v_object) : "! rkf_assisted_reader.ar_state_p(v_object) " + "rkf_assisted_reader.ar_state_p error :" + v_object;
        return v_object.getField15();
    }

    public static final SubLObject ar_state_candidate_cycls_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, AR_STATE_P);
        return v_object.getField16();
    }

    public static SubLObject ar_state_candidate_cycls(final SubLObject v_object) {
        assert NIL != ar_state_p(v_object) : "! rkf_assisted_reader.ar_state_p(v_object) " + "rkf_assisted_reader.ar_state_p error :" + v_object;
        return v_object.getField16();
    }

    public static final SubLObject ar_state_asserted_assertions_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, AR_STATE_P);
        return v_object.getField17();
    }

    public static SubLObject ar_state_asserted_assertions(final SubLObject v_object) {
        assert NIL != ar_state_p(v_object) : "! rkf_assisted_reader.ar_state_p(v_object) " + "rkf_assisted_reader.ar_state_p error :" + v_object;
        return v_object.getField17();
    }

    public static final SubLObject ar_state_term_templates_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, AR_STATE_P);
        return v_object.getField18();
    }

    public static SubLObject ar_state_term_templates(final SubLObject v_object) {
        assert NIL != ar_state_p(v_object) : "! rkf_assisted_reader.ar_state_p(v_object) " + "rkf_assisted_reader.ar_state_p error :" + v_object;
        return v_object.getField18();
    }

    public static final SubLObject ar_state_assert_templates_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, AR_STATE_P);
        return v_object.getField19();
    }

    public static SubLObject ar_state_assert_templates(final SubLObject v_object) {
        assert NIL != ar_state_p(v_object) : "! rkf_assisted_reader.ar_state_p(v_object) " + "rkf_assisted_reader.ar_state_p error :" + v_object;
        return v_object.getField19();
    }

    public static final SubLObject _csetf_ar_state_isg_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, AR_STATE_P);
        return v_object.setField2(value);
    }

    public static SubLObject _csetf_ar_state_isg(final SubLObject v_object, final SubLObject value) {
        assert NIL != ar_state_p(v_object) : "! rkf_assisted_reader.ar_state_p(v_object) " + "rkf_assisted_reader.ar_state_p error :" + v_object;
        return v_object.setField2(value);
    }

    public static final SubLObject _csetf_ar_state_index_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, AR_STATE_P);
        return v_object.setField3(value);
    }

    public static SubLObject _csetf_ar_state_index(final SubLObject v_object, final SubLObject value) {
        assert NIL != ar_state_p(v_object) : "! rkf_assisted_reader.ar_state_p(v_object) " + "rkf_assisted_reader.ar_state_p error :" + v_object;
        return v_object.setField3(value);
    }

    public static final SubLObject _csetf_ar_state_source_sentences_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, AR_STATE_P);
        return v_object.setField4(value);
    }

    public static SubLObject _csetf_ar_state_source_sentences(final SubLObject v_object, final SubLObject value) {
        assert NIL != ar_state_p(v_object) : "! rkf_assisted_reader.ar_state_p(v_object) " + "rkf_assisted_reader.ar_state_p error :" + v_object;
        return v_object.setField4(value);
    }

    public static final SubLObject _csetf_ar_state_focus_sentence_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, AR_STATE_P);
        return v_object.setField5(value);
    }

    public static SubLObject _csetf_ar_state_focus_sentence(final SubLObject v_object, final SubLObject value) {
        assert NIL != ar_state_p(v_object) : "! rkf_assisted_reader.ar_state_p(v_object) " + "rkf_assisted_reader.ar_state_p error :" + v_object;
        return v_object.setField5(value);
    }

    public static final SubLObject _csetf_ar_state_completed_sentences_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, AR_STATE_P);
        return v_object.setField6(value);
    }

    public static SubLObject _csetf_ar_state_completed_sentences(final SubLObject v_object, final SubLObject value) {
        assert NIL != ar_state_p(v_object) : "! rkf_assisted_reader.ar_state_p(v_object) " + "rkf_assisted_reader.ar_state_p error :" + v_object;
        return v_object.setField6(value);
    }

    public static final SubLObject _csetf_ar_state_unknown_phrases_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, AR_STATE_P);
        return v_object.setField7(value);
    }

    public static SubLObject _csetf_ar_state_unknown_phrases(final SubLObject v_object, final SubLObject value) {
        assert NIL != ar_state_p(v_object) : "! rkf_assisted_reader.ar_state_p(v_object) " + "rkf_assisted_reader.ar_state_p error :" + v_object;
        return v_object.setField7(value);
    }

    public static final SubLObject _csetf_ar_state_rejected_phrases_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, AR_STATE_P);
        return v_object.setField8(value);
    }

    public static SubLObject _csetf_ar_state_rejected_phrases(final SubLObject v_object, final SubLObject value) {
        assert NIL != ar_state_p(v_object) : "! rkf_assisted_reader.ar_state_p(v_object) " + "rkf_assisted_reader.ar_state_p error :" + v_object;
        return v_object.setField8(value);
    }

    public static final SubLObject _csetf_ar_state_irrelevant_phrases_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, AR_STATE_P);
        return v_object.setField9(value);
    }

    public static SubLObject _csetf_ar_state_irrelevant_phrases(final SubLObject v_object, final SubLObject value) {
        assert NIL != ar_state_p(v_object) : "! rkf_assisted_reader.ar_state_p(v_object) " + "rkf_assisted_reader.ar_state_p error :" + v_object;
        return v_object.setField9(value);
    }

    public static final SubLObject _csetf_ar_state_ambiguous_phrases_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, AR_STATE_P);
        return v_object.setField10(value);
    }

    public static SubLObject _csetf_ar_state_ambiguous_phrases(final SubLObject v_object, final SubLObject value) {
        assert NIL != ar_state_p(v_object) : "! rkf_assisted_reader.ar_state_p(v_object) " + "rkf_assisted_reader.ar_state_p error :" + v_object;
        return v_object.setField10(value);
    }

    public static final SubLObject _csetf_ar_state_assumed_phrases_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, AR_STATE_P);
        return v_object.setField11(value);
    }

    public static SubLObject _csetf_ar_state_assumed_phrases(final SubLObject v_object, final SubLObject value) {
        assert NIL != ar_state_p(v_object) : "! rkf_assisted_reader.ar_state_p(v_object) " + "rkf_assisted_reader.ar_state_p error :" + v_object;
        return v_object.setField11(value);
    }

    public static final SubLObject _csetf_ar_state_pending_phrases_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, AR_STATE_P);
        return v_object.setField12(value);
    }

    public static SubLObject _csetf_ar_state_pending_phrases(final SubLObject v_object, final SubLObject value) {
        assert NIL != ar_state_p(v_object) : "! rkf_assisted_reader.ar_state_p(v_object) " + "rkf_assisted_reader.ar_state_p error :" + v_object;
        return v_object.setField12(value);
    }

    public static final SubLObject _csetf_ar_state_accepted_phrases_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, AR_STATE_P);
        return v_object.setField13(value);
    }

    public static SubLObject _csetf_ar_state_accepted_phrases(final SubLObject v_object, final SubLObject value) {
        assert NIL != ar_state_p(v_object) : "! rkf_assisted_reader.ar_state_p(v_object) " + "rkf_assisted_reader.ar_state_p error :" + v_object;
        return v_object.setField13(value);
    }

    public static final SubLObject _csetf_ar_state_pending_concepts_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, AR_STATE_P);
        return v_object.setField14(value);
    }

    public static SubLObject _csetf_ar_state_pending_concepts(final SubLObject v_object, final SubLObject value) {
        assert NIL != ar_state_p(v_object) : "! rkf_assisted_reader.ar_state_p(v_object) " + "rkf_assisted_reader.ar_state_p error :" + v_object;
        return v_object.setField14(value);
    }

    public static final SubLObject _csetf_ar_state_accepted_concepts_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, AR_STATE_P);
        return v_object.setField15(value);
    }

    public static SubLObject _csetf_ar_state_accepted_concepts(final SubLObject v_object, final SubLObject value) {
        assert NIL != ar_state_p(v_object) : "! rkf_assisted_reader.ar_state_p(v_object) " + "rkf_assisted_reader.ar_state_p error :" + v_object;
        return v_object.setField15(value);
    }

    public static final SubLObject _csetf_ar_state_candidate_cycls_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, AR_STATE_P);
        return v_object.setField16(value);
    }

    public static SubLObject _csetf_ar_state_candidate_cycls(final SubLObject v_object, final SubLObject value) {
        assert NIL != ar_state_p(v_object) : "! rkf_assisted_reader.ar_state_p(v_object) " + "rkf_assisted_reader.ar_state_p error :" + v_object;
        return v_object.setField16(value);
    }

    public static final SubLObject _csetf_ar_state_asserted_assertions_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, AR_STATE_P);
        return v_object.setField17(value);
    }

    public static SubLObject _csetf_ar_state_asserted_assertions(final SubLObject v_object, final SubLObject value) {
        assert NIL != ar_state_p(v_object) : "! rkf_assisted_reader.ar_state_p(v_object) " + "rkf_assisted_reader.ar_state_p error :" + v_object;
        return v_object.setField17(value);
    }

    public static final SubLObject _csetf_ar_state_term_templates_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, AR_STATE_P);
        return v_object.setField18(value);
    }

    public static SubLObject _csetf_ar_state_term_templates(final SubLObject v_object, final SubLObject value) {
        assert NIL != ar_state_p(v_object) : "! rkf_assisted_reader.ar_state_p(v_object) " + "rkf_assisted_reader.ar_state_p error :" + v_object;
        return v_object.setField18(value);
    }

    public static final SubLObject _csetf_ar_state_assert_templates_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, AR_STATE_P);
        return v_object.setField19(value);
    }

    public static SubLObject _csetf_ar_state_assert_templates(final SubLObject v_object, final SubLObject value) {
        assert NIL != ar_state_p(v_object) : "! rkf_assisted_reader.ar_state_p(v_object) " + "rkf_assisted_reader.ar_state_p error :" + v_object;
        return v_object.setField19(value);
    }

    public static final SubLObject make_ar_state_alt(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        {
            SubLObject v_new = new com.cyc.cycjava.cycl.rkf_assisted_reader.$ar_state_native();
            SubLObject next = NIL;
            for (next = arglist; NIL != next; next = cddr(next)) {
                {
                    SubLObject current_arg = next.first();
                    SubLObject current_value = cadr(next);
                    SubLObject pcase_var = current_arg;
                    if (pcase_var.eql($ISG)) {
                        _csetf_ar_state_isg(v_new, current_value);
                    } else {
                        if (pcase_var.eql($INDEX)) {
                            _csetf_ar_state_index(v_new, current_value);
                        } else {
                            if (pcase_var.eql($SOURCE_SENTENCES)) {
                                _csetf_ar_state_source_sentences(v_new, current_value);
                            } else {
                                if (pcase_var.eql($FOCUS_SENTENCE)) {
                                    _csetf_ar_state_focus_sentence(v_new, current_value);
                                } else {
                                    if (pcase_var.eql($COMPLETED_SENTENCES)) {
                                        _csetf_ar_state_completed_sentences(v_new, current_value);
                                    } else {
                                        if (pcase_var.eql($UNKNOWN_PHRASES)) {
                                            _csetf_ar_state_unknown_phrases(v_new, current_value);
                                        } else {
                                            if (pcase_var.eql($REJECTED_PHRASES)) {
                                                _csetf_ar_state_rejected_phrases(v_new, current_value);
                                            } else {
                                                if (pcase_var.eql($IRRELEVANT_PHRASES)) {
                                                    _csetf_ar_state_irrelevant_phrases(v_new, current_value);
                                                } else {
                                                    if (pcase_var.eql($AMBIGUOUS_PHRASES)) {
                                                        _csetf_ar_state_ambiguous_phrases(v_new, current_value);
                                                    } else {
                                                        if (pcase_var.eql($ASSUMED_PHRASES)) {
                                                            _csetf_ar_state_assumed_phrases(v_new, current_value);
                                                        } else {
                                                            if (pcase_var.eql($PENDING_PHRASES)) {
                                                                _csetf_ar_state_pending_phrases(v_new, current_value);
                                                            } else {
                                                                if (pcase_var.eql($ACCEPTED_PHRASES)) {
                                                                    _csetf_ar_state_accepted_phrases(v_new, current_value);
                                                                } else {
                                                                    if (pcase_var.eql($PENDING_CONCEPTS)) {
                                                                        _csetf_ar_state_pending_concepts(v_new, current_value);
                                                                    } else {
                                                                        if (pcase_var.eql($ACCEPTED_CONCEPTS)) {
                                                                            _csetf_ar_state_accepted_concepts(v_new, current_value);
                                                                        } else {
                                                                            if (pcase_var.eql($CANDIDATE_CYCLS)) {
                                                                                _csetf_ar_state_candidate_cycls(v_new, current_value);
                                                                            } else {
                                                                                if (pcase_var.eql($ASSERTED_ASSERTIONS)) {
                                                                                    _csetf_ar_state_asserted_assertions(v_new, current_value);
                                                                                } else {
                                                                                    if (pcase_var.eql($TERM_TEMPLATES)) {
                                                                                        _csetf_ar_state_term_templates(v_new, current_value);
                                                                                    } else {
                                                                                        if (pcase_var.eql($ASSERT_TEMPLATES)) {
                                                                                            _csetf_ar_state_assert_templates(v_new, current_value);
                                                                                        } else {
                                                                                            Errors.error($str_alt29$Invalid_slot__S_for_construction_, current_arg);
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
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return v_new;
        }
    }

    public static SubLObject make_ar_state(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new com.cyc.cycjava.cycl.rkf_assisted_reader.$ar_state_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
            current_arg = next.first();
            current_value = cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql($ISG)) {
                _csetf_ar_state_isg(v_new, current_value);
            } else
                if (pcase_var.eql($INDEX)) {
                    _csetf_ar_state_index(v_new, current_value);
                } else
                    if (pcase_var.eql($SOURCE_SENTENCES)) {
                        _csetf_ar_state_source_sentences(v_new, current_value);
                    } else
                        if (pcase_var.eql($FOCUS_SENTENCE)) {
                            _csetf_ar_state_focus_sentence(v_new, current_value);
                        } else
                            if (pcase_var.eql($COMPLETED_SENTENCES)) {
                                _csetf_ar_state_completed_sentences(v_new, current_value);
                            } else
                                if (pcase_var.eql($UNKNOWN_PHRASES)) {
                                    _csetf_ar_state_unknown_phrases(v_new, current_value);
                                } else
                                    if (pcase_var.eql($REJECTED_PHRASES)) {
                                        _csetf_ar_state_rejected_phrases(v_new, current_value);
                                    } else
                                        if (pcase_var.eql($IRRELEVANT_PHRASES)) {
                                            _csetf_ar_state_irrelevant_phrases(v_new, current_value);
                                        } else
                                            if (pcase_var.eql($AMBIGUOUS_PHRASES)) {
                                                _csetf_ar_state_ambiguous_phrases(v_new, current_value);
                                            } else
                                                if (pcase_var.eql($ASSUMED_PHRASES)) {
                                                    _csetf_ar_state_assumed_phrases(v_new, current_value);
                                                } else
                                                    if (pcase_var.eql($PENDING_PHRASES)) {
                                                        _csetf_ar_state_pending_phrases(v_new, current_value);
                                                    } else
                                                        if (pcase_var.eql($ACCEPTED_PHRASES)) {
                                                            _csetf_ar_state_accepted_phrases(v_new, current_value);
                                                        } else
                                                            if (pcase_var.eql($PENDING_CONCEPTS)) {
                                                                _csetf_ar_state_pending_concepts(v_new, current_value);
                                                            } else
                                                                if (pcase_var.eql($ACCEPTED_CONCEPTS)) {
                                                                    _csetf_ar_state_accepted_concepts(v_new, current_value);
                                                                } else
                                                                    if (pcase_var.eql($CANDIDATE_CYCLS)) {
                                                                        _csetf_ar_state_candidate_cycls(v_new, current_value);
                                                                    } else
                                                                        if (pcase_var.eql($ASSERTED_ASSERTIONS)) {
                                                                            _csetf_ar_state_asserted_assertions(v_new, current_value);
                                                                        } else
                                                                            if (pcase_var.eql($TERM_TEMPLATES)) {
                                                                                _csetf_ar_state_term_templates(v_new, current_value);
                                                                            } else
                                                                                if (pcase_var.eql($ASSERT_TEMPLATES)) {
                                                                                    _csetf_ar_state_assert_templates(v_new, current_value);
                                                                                } else {
                                                                                    Errors.error($str30$Invalid_slot__S_for_construction_, current_arg);
                                                                                }

















        }
        return v_new;
    }

    public static SubLObject visit_defstruct_ar_state(final SubLObject obj, final SubLObject visitor_fn) {
        funcall(visitor_fn, obj, $BEGIN, MAKE_AR_STATE, EIGHTEEN_INTEGER);
        funcall(visitor_fn, obj, $SLOT, $ISG, ar_state_isg(obj));
        funcall(visitor_fn, obj, $SLOT, $INDEX, ar_state_index(obj));
        funcall(visitor_fn, obj, $SLOT, $SOURCE_SENTENCES, ar_state_source_sentences(obj));
        funcall(visitor_fn, obj, $SLOT, $FOCUS_SENTENCE, ar_state_focus_sentence(obj));
        funcall(visitor_fn, obj, $SLOT, $COMPLETED_SENTENCES, ar_state_completed_sentences(obj));
        funcall(visitor_fn, obj, $SLOT, $UNKNOWN_PHRASES, ar_state_unknown_phrases(obj));
        funcall(visitor_fn, obj, $SLOT, $REJECTED_PHRASES, ar_state_rejected_phrases(obj));
        funcall(visitor_fn, obj, $SLOT, $IRRELEVANT_PHRASES, ar_state_irrelevant_phrases(obj));
        funcall(visitor_fn, obj, $SLOT, $AMBIGUOUS_PHRASES, ar_state_ambiguous_phrases(obj));
        funcall(visitor_fn, obj, $SLOT, $ASSUMED_PHRASES, ar_state_assumed_phrases(obj));
        funcall(visitor_fn, obj, $SLOT, $PENDING_PHRASES, ar_state_pending_phrases(obj));
        funcall(visitor_fn, obj, $SLOT, $ACCEPTED_PHRASES, ar_state_accepted_phrases(obj));
        funcall(visitor_fn, obj, $SLOT, $PENDING_CONCEPTS, ar_state_pending_concepts(obj));
        funcall(visitor_fn, obj, $SLOT, $ACCEPTED_CONCEPTS, ar_state_accepted_concepts(obj));
        funcall(visitor_fn, obj, $SLOT, $CANDIDATE_CYCLS, ar_state_candidate_cycls(obj));
        funcall(visitor_fn, obj, $SLOT, $ASSERTED_ASSERTIONS, ar_state_asserted_assertions(obj));
        funcall(visitor_fn, obj, $SLOT, $TERM_TEMPLATES, ar_state_term_templates(obj));
        funcall(visitor_fn, obj, $SLOT, $ASSERT_TEMPLATES, ar_state_assert_templates(obj));
        funcall(visitor_fn, obj, $END, MAKE_AR_STATE, EIGHTEEN_INTEGER);
        return obj;
    }

    public static SubLObject visit_defstruct_object_ar_state_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_ar_state(obj, visitor_fn);
    }

    public static final SubLObject new_ar_state_alt() {
        {
            SubLObject state = make_ar_state(UNPROVIDED);
            SubLObject isg = integer_sequence_generator.new_integer_sequence_generator(UNPROVIDED, UNPROVIDED, UNPROVIDED);
            SubLObject index = dictionary.new_dictionary(UNPROVIDED, UNPROVIDED);
            SubLObject lock = $ar_lock$.getGlobalValue();
            SubLObject release = NIL;
            try {
                release = seize_lock(lock);
                _csetf_ar_state_isg(state, isg);
                _csetf_ar_state_index(state, index);
            } finally {
                if (NIL != release) {
                    release_lock(lock);
                }
            }
            return state;
        }
    }

    public static SubLObject new_ar_state() {
        final SubLObject state = make_ar_state(UNPROVIDED);
        final SubLObject isg = integer_sequence_generator.new_integer_sequence_generator(UNPROVIDED, UNPROVIDED, UNPROVIDED);
        final SubLObject index = dictionary.new_dictionary(UNPROVIDED, UNPROVIDED);
        SubLObject release = NIL;
        try {
            release = seize_lock($ar_lock$.getGlobalValue());
            _csetf_ar_state_isg(state, isg);
            _csetf_ar_state_index(state, index);
        } finally {
            if (NIL != release) {
                release_lock($ar_lock$.getGlobalValue());
            }
        }
        return state;
    }

    public static final SubLObject ar_reset_alt(SubLObject state) {
        {
            SubLObject lock = $ar_lock$.getGlobalValue();
            SubLObject release = NIL;
            try {
                release = seize_lock(lock);
                state = new_ar_state();
            } finally {
                if (NIL != release) {
                    release_lock(lock);
                }
            }
        }
        if (NIL == rtp_initialize.rtp_initializedP()) {
            rtp_initialize.reset_rtp_completely();
        }
        return state;
    }

    public static SubLObject ar_reset(SubLObject state) {
        SubLObject release = NIL;
        try {
            release = seize_lock($ar_lock$.getGlobalValue());
            state = new_ar_state();
        } finally {
            if (NIL != release) {
                release_lock($ar_lock$.getGlobalValue());
            }
        }
        if (NIL == rtp_initialize.rtp_initializedP()) {
            rtp_initialize.reset_rtp_completely();
        }
        return state;
    }

    public static final SubLObject next_ar_state_id_alt(SubLObject state) {
        SubLTrampolineFile.checkType(state, AR_STATE_P);
        return integer_sequence_generator.integer_sequence_generator_next(ar_state_isg(state));
    }

    public static SubLObject next_ar_state_id(final SubLObject state) {
        assert NIL != ar_state_p(state) : "! rkf_assisted_reader.ar_state_p(state) " + ("rkf_assisted_reader.ar_state_p(state) " + "CommonSymbols.NIL != rkf_assisted_reader.ar_state_p(state) ") + state;
        return integer_sequence_generator.integer_sequence_generator_next(ar_state_isg(state));
    }

    public static final SubLObject add_ar_object_index_alt(SubLObject state, SubLObject id, SubLObject v_object) {
        SubLTrampolineFile.checkType(state, AR_STATE_P);
        return dictionary.dictionary_enter(ar_state_index(state), id, v_object);
    }

    public static SubLObject add_ar_object_index(final SubLObject state, final SubLObject id, final SubLObject v_object) {
        assert NIL != ar_state_p(state) : "! rkf_assisted_reader.ar_state_p(state) " + ("rkf_assisted_reader.ar_state_p(state) " + "CommonSymbols.NIL != rkf_assisted_reader.ar_state_p(state) ") + state;
        return dictionary.dictionary_enter(ar_state_index(state), id, v_object);
    }

    public static final SubLObject find_ar_object_alt(SubLObject state, SubLObject id) {
        SubLTrampolineFile.checkType(state, AR_STATE_P);
        return dictionary.dictionary_lookup(ar_state_index(state), id, UNPROVIDED);
    }

    public static SubLObject find_ar_object(final SubLObject state, final SubLObject id) {
        assert NIL != ar_state_p(state) : "! rkf_assisted_reader.ar_state_p(state) " + ("rkf_assisted_reader.ar_state_p(state) " + "CommonSymbols.NIL != rkf_assisted_reader.ar_state_p(state) ") + state;
        return dictionary.dictionary_lookup(ar_state_index(state), id, UNPROVIDED);
    }

    public static final SubLObject find_ar_sentence_alt(SubLObject state, SubLObject id) {
        return find_ar_object(state, id);
    }

    public static SubLObject find_ar_sentence(final SubLObject state, final SubLObject id) {
        return find_ar_object(state, id);
    }

    public static final SubLObject find_ar_token_alt(SubLObject state, SubLObject id) {
        return find_ar_object(state, id);
    }

    public static SubLObject find_ar_token(final SubLObject state, final SubLObject id) {
        return find_ar_object(state, id);
    }

    public static final SubLObject find_ar_phrase_alt(SubLObject state, SubLObject id) {
        return find_ar_object(state, id);
    }

    public static SubLObject find_ar_phrase(final SubLObject state, final SubLObject id) {
        return find_ar_object(state, id);
    }

    public static final SubLObject find_ar_concept_alt(SubLObject state, SubLObject id) {
        return find_ar_object(state, id);
    }

    public static SubLObject find_ar_concept(final SubLObject state, final SubLObject id) {
        return find_ar_object(state, id);
    }

    public static final SubLObject find_ar_template_alt(SubLObject state, SubLObject id) {
        return find_ar_object(state, id);
    }

    public static SubLObject find_ar_template(final SubLObject state, final SubLObject id) {
        return find_ar_object(state, id);
    }

    public static final SubLObject add_ar_state_source_sentence_alt(SubLObject state, SubLObject sentence) {
        SubLTrampolineFile.checkType(state, AR_STATE_P);
        SubLTrampolineFile.checkType(sentence, AR_SENTENCE_P);
        {
            SubLObject lock = $ar_lock$.getGlobalValue();
            SubLObject release = NIL;
            try {
                release = seize_lock(lock);
                {
                    SubLObject item_var = sentence;
                    if (NIL == member(item_var, ar_state_source_sentences(state), symbol_function(EQL), symbol_function(IDENTITY))) {
                        _csetf_ar_state_source_sentences(state, cons(item_var, ar_state_source_sentences(state)));
                    }
                }
            } finally {
                if (NIL != release) {
                    release_lock(lock);
                }
            }
        }
        return state;
    }

    public static SubLObject add_ar_state_source_sentence(final SubLObject state, final SubLObject sentence) {
        assert NIL != ar_state_p(state) : "! rkf_assisted_reader.ar_state_p(state) " + ("rkf_assisted_reader.ar_state_p(state) " + "CommonSymbols.NIL != rkf_assisted_reader.ar_state_p(state) ") + state;
        assert NIL != ar_sentence_p(sentence) : "! rkf_assisted_reader.ar_sentence_p(sentence) " + ("rkf_assisted_reader.ar_sentence_p(sentence) " + "CommonSymbols.NIL != rkf_assisted_reader.ar_sentence_p(sentence) ") + sentence;
        SubLObject release = NIL;
        try {
            release = seize_lock($ar_lock$.getGlobalValue());
            if (NIL == member(sentence, ar_state_source_sentences(state), symbol_function(EQL), symbol_function(IDENTITY))) {
                _csetf_ar_state_source_sentences(state, cons(sentence, ar_state_source_sentences(state)));
            }
        } finally {
            if (NIL != release) {
                release_lock($ar_lock$.getGlobalValue());
            }
        }
        return state;
    }

    public static final SubLObject clear_ar_state_focus_sentence_alt(SubLObject state) {
        SubLTrampolineFile.checkType(state, AR_STATE_P);
        {
            SubLObject lock = $ar_lock$.getGlobalValue();
            SubLObject release = NIL;
            try {
                release = seize_lock(lock);
                _csetf_ar_state_focus_sentence(state, NIL);
            } finally {
                if (NIL != release) {
                    release_lock(lock);
                }
            }
        }
        return state;
    }

    public static SubLObject clear_ar_state_focus_sentence(final SubLObject state) {
        assert NIL != ar_state_p(state) : "! rkf_assisted_reader.ar_state_p(state) " + ("rkf_assisted_reader.ar_state_p(state) " + "CommonSymbols.NIL != rkf_assisted_reader.ar_state_p(state) ") + state;
        SubLObject release = NIL;
        try {
            release = seize_lock($ar_lock$.getGlobalValue());
            _csetf_ar_state_focus_sentence(state, NIL);
        } finally {
            if (NIL != release) {
                release_lock($ar_lock$.getGlobalValue());
            }
        }
        return state;
    }

    public static final SubLObject note_ar_state_focus_sentence_alt(SubLObject state, SubLObject sentence) {
        SubLTrampolineFile.checkType(state, AR_STATE_P);
        SubLTrampolineFile.checkType(sentence, AR_SENTENCE_P);
        {
            SubLObject lock = $ar_lock$.getGlobalValue();
            SubLObject release = NIL;
            try {
                release = seize_lock(lock);
                _csetf_ar_state_focus_sentence(state, sentence);
            } finally {
                if (NIL != release) {
                    release_lock(lock);
                }
            }
        }
        return state;
    }

    public static SubLObject note_ar_state_focus_sentence(final SubLObject state, final SubLObject sentence) {
        assert NIL != ar_state_p(state) : "! rkf_assisted_reader.ar_state_p(state) " + ("rkf_assisted_reader.ar_state_p(state) " + "CommonSymbols.NIL != rkf_assisted_reader.ar_state_p(state) ") + state;
        assert NIL != ar_sentence_p(sentence) : "! rkf_assisted_reader.ar_sentence_p(sentence) " + ("rkf_assisted_reader.ar_sentence_p(sentence) " + "CommonSymbols.NIL != rkf_assisted_reader.ar_sentence_p(sentence) ") + sentence;
        SubLObject release = NIL;
        try {
            release = seize_lock($ar_lock$.getGlobalValue());
            _csetf_ar_state_focus_sentence(state, sentence);
        } finally {
            if (NIL != release) {
                release_lock($ar_lock$.getGlobalValue());
            }
        }
        return state;
    }

    /**
     * given an ar-state, determine the sentential force of that state by finding the force of the largest
     * constituent in that state
     */
    @LispMethod(comment = "given an ar-state, determine the sentential force of that state by finding the force of the largest\r\nconstituent in that state\ngiven an ar-state, determine the sentential force of that state by finding the force of the largest\nconstituent in that state")
    public static final SubLObject ar_state_force_alt(SubLObject state) {
        {
            SubLObject force = NIL;
            SubLObject phrases = ar_sentence_phrases(ar_state_focus_sentence(state));
            SubLObject sorted_phrases = Sort.sort(copy_list(phrases), $sym222$AR_PHRASE_SPAN_LENGTH_, UNPROVIDED);
            if (NIL == force) {
                {
                    SubLObject csome_list_var = sorted_phrases;
                    SubLObject phrase = NIL;
                    for (phrase = csome_list_var.first(); !((NIL != force) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , phrase = csome_list_var.first()) {
                        {
                            SubLObject phrase_force = ar_phrase_force(phrase);
                            if ((NIL != phrase_force) && (phrase_force != $NONE)) {
                                force = phrase_force;
                            }
                        }
                    }
                }
            }
            return force;
        }
    }

    @LispMethod(comment = "given an ar-state, determine the sentential force of that state by finding the force of the largest\r\nconstituent in that state\ngiven an ar-state, determine the sentential force of that state by finding the force of the largest\nconstituent in that state")
    public static SubLObject ar_state_force(final SubLObject state) {
        SubLObject force = NIL;
        final SubLObject phrases = ar_sentence_phrases(ar_state_focus_sentence(state));
        final SubLObject sorted_phrases = Sort.sort(copy_list(phrases), $sym243$AR_PHRASE_SPAN_LENGTH_, UNPROVIDED);
        if (NIL == force) {
            SubLObject csome_list_var = sorted_phrases;
            SubLObject phrase = NIL;
            phrase = csome_list_var.first();
            while ((NIL == force) && (NIL != csome_list_var)) {
                final SubLObject phrase_force = ar_phrase_force(phrase);
                if ((NIL != phrase_force) && (phrase_force != $NONE)) {
                    force = phrase_force;
                }
                csome_list_var = csome_list_var.rest();
                phrase = csome_list_var.first();
            } 
        }
        return force;
    }

    /**
     *
     *
     * @param PHRASE1
    ar-phrase
     * 		
     * @param PHRASE2
    ar-phrase
     * 		
     * @return boolean
     */
    @LispMethod(comment = "@param PHRASE1\nar-phrase\r\n\t\t\r\n@param PHRASE2\nar-phrase\r\n\t\t\r\n@return boolean")
    public static final SubLObject ar_phrase_span_lengthG_alt(SubLObject phrase1, SubLObject phrase2) {
        return numG(length(ar_phrase_token_list(phrase1)), length(ar_phrase_token_list(phrase2)));
    }

    /**
     *
     *
     * @param PHRASE1
    ar-phrase
     * 		
     * @param PHRASE2
    ar-phrase
     * 		
     * @return boolean
     */
    @LispMethod(comment = "@param PHRASE1\nar-phrase\r\n\t\t\r\n@param PHRASE2\nar-phrase\r\n\t\t\r\n@return boolean")
    public static SubLObject ar_phrase_span_lengthG(final SubLObject phrase1, final SubLObject phrase2) {
        return numG(length(ar_phrase_token_list(phrase1)), length(ar_phrase_token_list(phrase2)));
    }

    public static final SubLObject add_ar_state_completed_sentence_alt(SubLObject state, SubLObject sentence) {
        SubLTrampolineFile.checkType(state, AR_STATE_P);
        SubLTrampolineFile.checkType(sentence, AR_SENTENCE_P);
        {
            SubLObject lock = $ar_lock$.getGlobalValue();
            SubLObject release = NIL;
            try {
                release = seize_lock(lock);
                {
                    SubLObject item_var = sentence;
                    if (NIL == member(item_var, ar_state_completed_sentences(state), symbol_function(EQL), symbol_function(IDENTITY))) {
                        _csetf_ar_state_completed_sentences(state, cons(item_var, ar_state_completed_sentences(state)));
                    }
                }
            } finally {
                if (NIL != release) {
                    release_lock(lock);
                }
            }
        }
        return state;
    }

    public static SubLObject add_ar_state_completed_sentence(final SubLObject state, final SubLObject sentence) {
        assert NIL != ar_state_p(state) : "! rkf_assisted_reader.ar_state_p(state) " + ("rkf_assisted_reader.ar_state_p(state) " + "CommonSymbols.NIL != rkf_assisted_reader.ar_state_p(state) ") + state;
        assert NIL != ar_sentence_p(sentence) : "! rkf_assisted_reader.ar_sentence_p(sentence) " + ("rkf_assisted_reader.ar_sentence_p(sentence) " + "CommonSymbols.NIL != rkf_assisted_reader.ar_sentence_p(sentence) ") + sentence;
        SubLObject release = NIL;
        try {
            release = seize_lock($ar_lock$.getGlobalValue());
            if (NIL == member(sentence, ar_state_completed_sentences(state), symbol_function(EQL), symbol_function(IDENTITY))) {
                _csetf_ar_state_completed_sentences(state, cons(sentence, ar_state_completed_sentences(state)));
            }
        } finally {
            if (NIL != release) {
                release_lock($ar_lock$.getGlobalValue());
            }
        }
        return state;
    }

    public static final SubLObject add_ar_state_unknown_phrase_alt(SubLObject state, SubLObject phrase) {
        SubLTrampolineFile.checkType(state, AR_STATE_P);
        SubLTrampolineFile.checkType(phrase, AR_PHRASE_P);
        {
            SubLObject lock = $ar_lock$.getGlobalValue();
            SubLObject release = NIL;
            try {
                release = seize_lock(lock);
                {
                    SubLObject item_var = phrase;
                    if (NIL == member(item_var, ar_state_unknown_phrases(state), symbol_function(EQL), symbol_function(IDENTITY))) {
                        _csetf_ar_state_unknown_phrases(state, cons(item_var, ar_state_unknown_phrases(state)));
                    }
                }
            } finally {
                if (NIL != release) {
                    release_lock(lock);
                }
            }
        }
        return state;
    }

    public static SubLObject add_ar_state_unknown_phrase(final SubLObject state, final SubLObject phrase) {
        assert NIL != ar_state_p(state) : "! rkf_assisted_reader.ar_state_p(state) " + ("rkf_assisted_reader.ar_state_p(state) " + "CommonSymbols.NIL != rkf_assisted_reader.ar_state_p(state) ") + state;
        assert NIL != ar_phrase_p(phrase) : "! rkf_assisted_reader.ar_phrase_p(phrase) " + ("rkf_assisted_reader.ar_phrase_p(phrase) " + "CommonSymbols.NIL != rkf_assisted_reader.ar_phrase_p(phrase) ") + phrase;
        SubLObject release = NIL;
        try {
            release = seize_lock($ar_lock$.getGlobalValue());
            if (NIL == member(phrase, ar_state_unknown_phrases(state), symbol_function(EQL), symbol_function(IDENTITY))) {
                _csetf_ar_state_unknown_phrases(state, cons(phrase, ar_state_unknown_phrases(state)));
            }
        } finally {
            if (NIL != release) {
                release_lock($ar_lock$.getGlobalValue());
            }
        }
        return state;
    }

    public static final SubLObject rem_ar_state_unknown_phrase_alt(SubLObject state, SubLObject phrase) {
        SubLTrampolineFile.checkType(state, AR_STATE_P);
        SubLTrampolineFile.checkType(phrase, AR_PHRASE_P);
        {
            SubLObject lock = $ar_lock$.getGlobalValue();
            SubLObject release = NIL;
            try {
                release = seize_lock(lock);
                _csetf_ar_state_unknown_phrases(state, delete(phrase, ar_state_unknown_phrases(state), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
            } finally {
                if (NIL != release) {
                    release_lock(lock);
                }
            }
        }
        return state;
    }

    public static SubLObject rem_ar_state_unknown_phrase(final SubLObject state, final SubLObject phrase) {
        assert NIL != ar_state_p(state) : "! rkf_assisted_reader.ar_state_p(state) " + ("rkf_assisted_reader.ar_state_p(state) " + "CommonSymbols.NIL != rkf_assisted_reader.ar_state_p(state) ") + state;
        assert NIL != ar_phrase_p(phrase) : "! rkf_assisted_reader.ar_phrase_p(phrase) " + ("rkf_assisted_reader.ar_phrase_p(phrase) " + "CommonSymbols.NIL != rkf_assisted_reader.ar_phrase_p(phrase) ") + phrase;
        SubLObject release = NIL;
        try {
            release = seize_lock($ar_lock$.getGlobalValue());
            _csetf_ar_state_unknown_phrases(state, delete(phrase, ar_state_unknown_phrases(state), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
        } finally {
            if (NIL != release) {
                release_lock($ar_lock$.getGlobalValue());
            }
        }
        return state;
    }

    public static final SubLObject add_ar_state_rejected_phrase_alt(SubLObject state, SubLObject phrase) {
        SubLTrampolineFile.checkType(state, AR_STATE_P);
        SubLTrampolineFile.checkType(phrase, AR_PHRASE_P);
        {
            SubLObject lock = $ar_lock$.getGlobalValue();
            SubLObject release = NIL;
            try {
                release = seize_lock(lock);
                {
                    SubLObject item_var = phrase;
                    if (NIL == member(item_var, ar_state_rejected_phrases(state), symbol_function(EQL), symbol_function(IDENTITY))) {
                        _csetf_ar_state_rejected_phrases(state, cons(item_var, ar_state_rejected_phrases(state)));
                    }
                }
            } finally {
                if (NIL != release) {
                    release_lock(lock);
                }
            }
        }
        return state;
    }

    public static SubLObject add_ar_state_rejected_phrase(final SubLObject state, final SubLObject phrase) {
        assert NIL != ar_state_p(state) : "! rkf_assisted_reader.ar_state_p(state) " + ("rkf_assisted_reader.ar_state_p(state) " + "CommonSymbols.NIL != rkf_assisted_reader.ar_state_p(state) ") + state;
        assert NIL != ar_phrase_p(phrase) : "! rkf_assisted_reader.ar_phrase_p(phrase) " + ("rkf_assisted_reader.ar_phrase_p(phrase) " + "CommonSymbols.NIL != rkf_assisted_reader.ar_phrase_p(phrase) ") + phrase;
        SubLObject release = NIL;
        try {
            release = seize_lock($ar_lock$.getGlobalValue());
            if (NIL == member(phrase, ar_state_rejected_phrases(state), symbol_function(EQL), symbol_function(IDENTITY))) {
                _csetf_ar_state_rejected_phrases(state, cons(phrase, ar_state_rejected_phrases(state)));
            }
        } finally {
            if (NIL != release) {
                release_lock($ar_lock$.getGlobalValue());
            }
        }
        return state;
    }

    public static final SubLObject rem_ar_state_rejected_phrase_alt(SubLObject state, SubLObject phrase) {
        SubLTrampolineFile.checkType(state, AR_STATE_P);
        SubLTrampolineFile.checkType(phrase, AR_PHRASE_P);
        {
            SubLObject lock = $ar_lock$.getGlobalValue();
            SubLObject release = NIL;
            try {
                release = seize_lock(lock);
                _csetf_ar_state_rejected_phrases(state, delete(phrase, ar_state_rejected_phrases(state), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
            } finally {
                if (NIL != release) {
                    release_lock(lock);
                }
            }
        }
        return state;
    }

    public static SubLObject rem_ar_state_rejected_phrase(final SubLObject state, final SubLObject phrase) {
        assert NIL != ar_state_p(state) : "! rkf_assisted_reader.ar_state_p(state) " + ("rkf_assisted_reader.ar_state_p(state) " + "CommonSymbols.NIL != rkf_assisted_reader.ar_state_p(state) ") + state;
        assert NIL != ar_phrase_p(phrase) : "! rkf_assisted_reader.ar_phrase_p(phrase) " + ("rkf_assisted_reader.ar_phrase_p(phrase) " + "CommonSymbols.NIL != rkf_assisted_reader.ar_phrase_p(phrase) ") + phrase;
        SubLObject release = NIL;
        try {
            release = seize_lock($ar_lock$.getGlobalValue());
            _csetf_ar_state_rejected_phrases(state, delete(phrase, ar_state_rejected_phrases(state), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
        } finally {
            if (NIL != release) {
                release_lock($ar_lock$.getGlobalValue());
            }
        }
        return state;
    }

    public static final SubLObject add_ar_state_irrelevant_phrase_alt(SubLObject state, SubLObject phrase) {
        SubLTrampolineFile.checkType(state, AR_STATE_P);
        SubLTrampolineFile.checkType(phrase, AR_PHRASE_P);
        {
            SubLObject lock = $ar_lock$.getGlobalValue();
            SubLObject release = NIL;
            try {
                release = seize_lock(lock);
                {
                    SubLObject item_var = phrase;
                    if (NIL == member(item_var, ar_state_irrelevant_phrases(state), symbol_function(EQL), symbol_function(IDENTITY))) {
                        _csetf_ar_state_irrelevant_phrases(state, cons(item_var, ar_state_irrelevant_phrases(state)));
                    }
                }
            } finally {
                if (NIL != release) {
                    release_lock(lock);
                }
            }
        }
        return state;
    }

    public static SubLObject add_ar_state_irrelevant_phrase(final SubLObject state, final SubLObject phrase) {
        assert NIL != ar_state_p(state) : "! rkf_assisted_reader.ar_state_p(state) " + ("rkf_assisted_reader.ar_state_p(state) " + "CommonSymbols.NIL != rkf_assisted_reader.ar_state_p(state) ") + state;
        assert NIL != ar_phrase_p(phrase) : "! rkf_assisted_reader.ar_phrase_p(phrase) " + ("rkf_assisted_reader.ar_phrase_p(phrase) " + "CommonSymbols.NIL != rkf_assisted_reader.ar_phrase_p(phrase) ") + phrase;
        SubLObject release = NIL;
        try {
            release = seize_lock($ar_lock$.getGlobalValue());
            if (NIL == member(phrase, ar_state_irrelevant_phrases(state), symbol_function(EQL), symbol_function(IDENTITY))) {
                _csetf_ar_state_irrelevant_phrases(state, cons(phrase, ar_state_irrelevant_phrases(state)));
            }
        } finally {
            if (NIL != release) {
                release_lock($ar_lock$.getGlobalValue());
            }
        }
        return state;
    }

    public static final SubLObject rem_ar_state_irrelevant_phrase_alt(SubLObject state, SubLObject phrase) {
        SubLTrampolineFile.checkType(state, AR_STATE_P);
        SubLTrampolineFile.checkType(phrase, AR_PHRASE_P);
        {
            SubLObject lock = $ar_lock$.getGlobalValue();
            SubLObject release = NIL;
            try {
                release = seize_lock(lock);
                _csetf_ar_state_irrelevant_phrases(state, delete(phrase, ar_state_irrelevant_phrases(state), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
            } finally {
                if (NIL != release) {
                    release_lock(lock);
                }
            }
        }
        return state;
    }

    public static SubLObject rem_ar_state_irrelevant_phrase(final SubLObject state, final SubLObject phrase) {
        assert NIL != ar_state_p(state) : "! rkf_assisted_reader.ar_state_p(state) " + ("rkf_assisted_reader.ar_state_p(state) " + "CommonSymbols.NIL != rkf_assisted_reader.ar_state_p(state) ") + state;
        assert NIL != ar_phrase_p(phrase) : "! rkf_assisted_reader.ar_phrase_p(phrase) " + ("rkf_assisted_reader.ar_phrase_p(phrase) " + "CommonSymbols.NIL != rkf_assisted_reader.ar_phrase_p(phrase) ") + phrase;
        SubLObject release = NIL;
        try {
            release = seize_lock($ar_lock$.getGlobalValue());
            _csetf_ar_state_irrelevant_phrases(state, delete(phrase, ar_state_irrelevant_phrases(state), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
        } finally {
            if (NIL != release) {
                release_lock($ar_lock$.getGlobalValue());
            }
        }
        return state;
    }

    public static final SubLObject add_ar_state_ambiguous_phrase_alt(SubLObject state, SubLObject phrase) {
        SubLTrampolineFile.checkType(state, AR_STATE_P);
        SubLTrampolineFile.checkType(phrase, AR_PHRASE_P);
        {
            SubLObject lock = $ar_lock$.getGlobalValue();
            SubLObject release = NIL;
            try {
                release = seize_lock(lock);
                {
                    SubLObject item_var = phrase;
                    if (NIL == member(item_var, ar_state_ambiguous_phrases(state), symbol_function(EQL), symbol_function(IDENTITY))) {
                        _csetf_ar_state_ambiguous_phrases(state, cons(item_var, ar_state_ambiguous_phrases(state)));
                    }
                }
            } finally {
                if (NIL != release) {
                    release_lock(lock);
                }
            }
        }
        return state;
    }

    public static SubLObject add_ar_state_ambiguous_phrase(final SubLObject state, final SubLObject phrase) {
        assert NIL != ar_state_p(state) : "! rkf_assisted_reader.ar_state_p(state) " + ("rkf_assisted_reader.ar_state_p(state) " + "CommonSymbols.NIL != rkf_assisted_reader.ar_state_p(state) ") + state;
        assert NIL != ar_phrase_p(phrase) : "! rkf_assisted_reader.ar_phrase_p(phrase) " + ("rkf_assisted_reader.ar_phrase_p(phrase) " + "CommonSymbols.NIL != rkf_assisted_reader.ar_phrase_p(phrase) ") + phrase;
        SubLObject release = NIL;
        try {
            release = seize_lock($ar_lock$.getGlobalValue());
            if (NIL == member(phrase, ar_state_ambiguous_phrases(state), symbol_function(EQL), symbol_function(IDENTITY))) {
                _csetf_ar_state_ambiguous_phrases(state, cons(phrase, ar_state_ambiguous_phrases(state)));
            }
        } finally {
            if (NIL != release) {
                release_lock($ar_lock$.getGlobalValue());
            }
        }
        return state;
    }

    public static final SubLObject rem_ar_state_ambiguous_phrase_alt(SubLObject state, SubLObject phrase) {
        SubLTrampolineFile.checkType(state, AR_STATE_P);
        SubLTrampolineFile.checkType(phrase, AR_PHRASE_P);
        {
            SubLObject lock = $ar_lock$.getGlobalValue();
            SubLObject release = NIL;
            try {
                release = seize_lock(lock);
                _csetf_ar_state_ambiguous_phrases(state, delete(phrase, ar_state_ambiguous_phrases(state), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
            } finally {
                if (NIL != release) {
                    release_lock(lock);
                }
            }
        }
        return state;
    }

    public static SubLObject rem_ar_state_ambiguous_phrase(final SubLObject state, final SubLObject phrase) {
        assert NIL != ar_state_p(state) : "! rkf_assisted_reader.ar_state_p(state) " + ("rkf_assisted_reader.ar_state_p(state) " + "CommonSymbols.NIL != rkf_assisted_reader.ar_state_p(state) ") + state;
        assert NIL != ar_phrase_p(phrase) : "! rkf_assisted_reader.ar_phrase_p(phrase) " + ("rkf_assisted_reader.ar_phrase_p(phrase) " + "CommonSymbols.NIL != rkf_assisted_reader.ar_phrase_p(phrase) ") + phrase;
        SubLObject release = NIL;
        try {
            release = seize_lock($ar_lock$.getGlobalValue());
            _csetf_ar_state_ambiguous_phrases(state, delete(phrase, ar_state_ambiguous_phrases(state), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
        } finally {
            if (NIL != release) {
                release_lock($ar_lock$.getGlobalValue());
            }
        }
        return state;
    }

    public static final SubLObject add_ar_state_assumed_phrase_alt(SubLObject state, SubLObject phrase) {
        SubLTrampolineFile.checkType(state, AR_STATE_P);
        SubLTrampolineFile.checkType(phrase, AR_PHRASE_P);
        {
            SubLObject lock = $ar_lock$.getGlobalValue();
            SubLObject release = NIL;
            try {
                release = seize_lock(lock);
                {
                    SubLObject item_var = phrase;
                    if (NIL == member(item_var, ar_state_assumed_phrases(state), symbol_function(EQL), symbol_function(IDENTITY))) {
                        _csetf_ar_state_assumed_phrases(state, cons(item_var, ar_state_assumed_phrases(state)));
                    }
                }
            } finally {
                if (NIL != release) {
                    release_lock(lock);
                }
            }
        }
        return state;
    }

    public static SubLObject add_ar_state_assumed_phrase(final SubLObject state, final SubLObject phrase) {
        assert NIL != ar_state_p(state) : "! rkf_assisted_reader.ar_state_p(state) " + ("rkf_assisted_reader.ar_state_p(state) " + "CommonSymbols.NIL != rkf_assisted_reader.ar_state_p(state) ") + state;
        assert NIL != ar_phrase_p(phrase) : "! rkf_assisted_reader.ar_phrase_p(phrase) " + ("rkf_assisted_reader.ar_phrase_p(phrase) " + "CommonSymbols.NIL != rkf_assisted_reader.ar_phrase_p(phrase) ") + phrase;
        SubLObject release = NIL;
        try {
            release = seize_lock($ar_lock$.getGlobalValue());
            if (NIL == member(phrase, ar_state_assumed_phrases(state), symbol_function(EQL), symbol_function(IDENTITY))) {
                _csetf_ar_state_assumed_phrases(state, cons(phrase, ar_state_assumed_phrases(state)));
            }
        } finally {
            if (NIL != release) {
                release_lock($ar_lock$.getGlobalValue());
            }
        }
        return state;
    }

    public static final SubLObject rem_ar_state_assumed_phrase_alt(SubLObject state, SubLObject phrase) {
        SubLTrampolineFile.checkType(state, AR_STATE_P);
        SubLTrampolineFile.checkType(phrase, AR_PHRASE_P);
        {
            SubLObject lock = $ar_lock$.getGlobalValue();
            SubLObject release = NIL;
            try {
                release = seize_lock(lock);
                _csetf_ar_state_assumed_phrases(state, delete(phrase, ar_state_assumed_phrases(state), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
            } finally {
                if (NIL != release) {
                    release_lock(lock);
                }
            }
        }
        return state;
    }

    public static SubLObject rem_ar_state_assumed_phrase(final SubLObject state, final SubLObject phrase) {
        assert NIL != ar_state_p(state) : "! rkf_assisted_reader.ar_state_p(state) " + ("rkf_assisted_reader.ar_state_p(state) " + "CommonSymbols.NIL != rkf_assisted_reader.ar_state_p(state) ") + state;
        assert NIL != ar_phrase_p(phrase) : "! rkf_assisted_reader.ar_phrase_p(phrase) " + ("rkf_assisted_reader.ar_phrase_p(phrase) " + "CommonSymbols.NIL != rkf_assisted_reader.ar_phrase_p(phrase) ") + phrase;
        SubLObject release = NIL;
        try {
            release = seize_lock($ar_lock$.getGlobalValue());
            _csetf_ar_state_assumed_phrases(state, delete(phrase, ar_state_assumed_phrases(state), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
        } finally {
            if (NIL != release) {
                release_lock($ar_lock$.getGlobalValue());
            }
        }
        return state;
    }

    public static final SubLObject add_ar_state_pending_phrase_alt(SubLObject state, SubLObject phrase) {
        SubLTrampolineFile.checkType(state, AR_STATE_P);
        SubLTrampolineFile.checkType(phrase, AR_PHRASE_P);
        {
            SubLObject lock = $ar_lock$.getGlobalValue();
            SubLObject release = NIL;
            try {
                release = seize_lock(lock);
                {
                    SubLObject item_var = phrase;
                    if (NIL == member(item_var, ar_state_pending_phrases(state), symbol_function(EQL), symbol_function(IDENTITY))) {
                        _csetf_ar_state_pending_phrases(state, cons(item_var, ar_state_pending_phrases(state)));
                    }
                }
            } finally {
                if (NIL != release) {
                    release_lock(lock);
                }
            }
        }
        return state;
    }

    public static SubLObject add_ar_state_pending_phrase(final SubLObject state, final SubLObject phrase) {
        assert NIL != ar_state_p(state) : "! rkf_assisted_reader.ar_state_p(state) " + ("rkf_assisted_reader.ar_state_p(state) " + "CommonSymbols.NIL != rkf_assisted_reader.ar_state_p(state) ") + state;
        assert NIL != ar_phrase_p(phrase) : "! rkf_assisted_reader.ar_phrase_p(phrase) " + ("rkf_assisted_reader.ar_phrase_p(phrase) " + "CommonSymbols.NIL != rkf_assisted_reader.ar_phrase_p(phrase) ") + phrase;
        SubLObject release = NIL;
        try {
            release = seize_lock($ar_lock$.getGlobalValue());
            if (NIL == member(phrase, ar_state_pending_phrases(state), symbol_function(EQL), symbol_function(IDENTITY))) {
                _csetf_ar_state_pending_phrases(state, cons(phrase, ar_state_pending_phrases(state)));
            }
        } finally {
            if (NIL != release) {
                release_lock($ar_lock$.getGlobalValue());
            }
        }
        return state;
    }

    public static final SubLObject rem_ar_state_pending_phrase_alt(SubLObject state, SubLObject phrase) {
        SubLTrampolineFile.checkType(state, AR_STATE_P);
        SubLTrampolineFile.checkType(phrase, AR_PHRASE_P);
        {
            SubLObject lock = $ar_lock$.getGlobalValue();
            SubLObject release = NIL;
            try {
                release = seize_lock(lock);
                _csetf_ar_state_pending_phrases(state, delete(phrase, ar_state_pending_phrases(state), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
            } finally {
                if (NIL != release) {
                    release_lock(lock);
                }
            }
        }
        return state;
    }

    public static SubLObject rem_ar_state_pending_phrase(final SubLObject state, final SubLObject phrase) {
        assert NIL != ar_state_p(state) : "! rkf_assisted_reader.ar_state_p(state) " + ("rkf_assisted_reader.ar_state_p(state) " + "CommonSymbols.NIL != rkf_assisted_reader.ar_state_p(state) ") + state;
        assert NIL != ar_phrase_p(phrase) : "! rkf_assisted_reader.ar_phrase_p(phrase) " + ("rkf_assisted_reader.ar_phrase_p(phrase) " + "CommonSymbols.NIL != rkf_assisted_reader.ar_phrase_p(phrase) ") + phrase;
        SubLObject release = NIL;
        try {
            release = seize_lock($ar_lock$.getGlobalValue());
            _csetf_ar_state_pending_phrases(state, delete(phrase, ar_state_pending_phrases(state), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
        } finally {
            if (NIL != release) {
                release_lock($ar_lock$.getGlobalValue());
            }
        }
        return state;
    }

    public static final SubLObject add_ar_state_accepted_phrase_alt(SubLObject state, SubLObject phrase) {
        SubLTrampolineFile.checkType(state, AR_STATE_P);
        SubLTrampolineFile.checkType(phrase, AR_PHRASE_P);
        {
            SubLObject lock = $ar_lock$.getGlobalValue();
            SubLObject release = NIL;
            try {
                release = seize_lock(lock);
                {
                    SubLObject item_var = phrase;
                    if (NIL == member(item_var, ar_state_accepted_phrases(state), symbol_function(EQL), symbol_function(IDENTITY))) {
                        _csetf_ar_state_accepted_phrases(state, cons(item_var, ar_state_accepted_phrases(state)));
                    }
                }
            } finally {
                if (NIL != release) {
                    release_lock(lock);
                }
            }
        }
        return state;
    }

    public static SubLObject add_ar_state_accepted_phrase(final SubLObject state, final SubLObject phrase) {
        assert NIL != ar_state_p(state) : "! rkf_assisted_reader.ar_state_p(state) " + ("rkf_assisted_reader.ar_state_p(state) " + "CommonSymbols.NIL != rkf_assisted_reader.ar_state_p(state) ") + state;
        assert NIL != ar_phrase_p(phrase) : "! rkf_assisted_reader.ar_phrase_p(phrase) " + ("rkf_assisted_reader.ar_phrase_p(phrase) " + "CommonSymbols.NIL != rkf_assisted_reader.ar_phrase_p(phrase) ") + phrase;
        SubLObject release = NIL;
        try {
            release = seize_lock($ar_lock$.getGlobalValue());
            if (NIL == member(phrase, ar_state_accepted_phrases(state), symbol_function(EQL), symbol_function(IDENTITY))) {
                _csetf_ar_state_accepted_phrases(state, cons(phrase, ar_state_accepted_phrases(state)));
            }
        } finally {
            if (NIL != release) {
                release_lock($ar_lock$.getGlobalValue());
            }
        }
        return state;
    }

    public static final SubLObject rem_ar_state_accepted_phrase_alt(SubLObject state, SubLObject phrase) {
        SubLTrampolineFile.checkType(state, AR_STATE_P);
        SubLTrampolineFile.checkType(phrase, AR_PHRASE_P);
        {
            SubLObject lock = $ar_lock$.getGlobalValue();
            SubLObject release = NIL;
            try {
                release = seize_lock(lock);
                _csetf_ar_state_accepted_phrases(state, delete(phrase, ar_state_accepted_phrases(state), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
            } finally {
                if (NIL != release) {
                    release_lock(lock);
                }
            }
        }
        return state;
    }

    public static SubLObject rem_ar_state_accepted_phrase(final SubLObject state, final SubLObject phrase) {
        assert NIL != ar_state_p(state) : "! rkf_assisted_reader.ar_state_p(state) " + ("rkf_assisted_reader.ar_state_p(state) " + "CommonSymbols.NIL != rkf_assisted_reader.ar_state_p(state) ") + state;
        assert NIL != ar_phrase_p(phrase) : "! rkf_assisted_reader.ar_phrase_p(phrase) " + ("rkf_assisted_reader.ar_phrase_p(phrase) " + "CommonSymbols.NIL != rkf_assisted_reader.ar_phrase_p(phrase) ") + phrase;
        SubLObject release = NIL;
        try {
            release = seize_lock($ar_lock$.getGlobalValue());
            _csetf_ar_state_accepted_phrases(state, delete(phrase, ar_state_accepted_phrases(state), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
        } finally {
            if (NIL != release) {
                release_lock($ar_lock$.getGlobalValue());
            }
        }
        return state;
    }

    public static final SubLObject add_ar_state_accepted_concept_alt(SubLObject state, SubLObject concept) {
        SubLTrampolineFile.checkType(state, AR_STATE_P);
        SubLTrampolineFile.checkType(concept, AR_CONCEPT_P);
        {
            SubLObject lock = $ar_lock$.getGlobalValue();
            SubLObject release = NIL;
            try {
                release = seize_lock(lock);
                {
                    SubLObject item_var = concept;
                    if (NIL == member(item_var, ar_state_accepted_concepts(state), symbol_function(EQL), symbol_function(IDENTITY))) {
                        _csetf_ar_state_accepted_concepts(state, cons(item_var, ar_state_accepted_concepts(state)));
                    }
                }
            } finally {
                if (NIL != release) {
                    release_lock(lock);
                }
            }
        }
        return state;
    }

    public static SubLObject add_ar_state_accepted_concept(final SubLObject state, final SubLObject concept) {
        assert NIL != ar_state_p(state) : "! rkf_assisted_reader.ar_state_p(state) " + ("rkf_assisted_reader.ar_state_p(state) " + "CommonSymbols.NIL != rkf_assisted_reader.ar_state_p(state) ") + state;
        assert NIL != ar_concept_p(concept) : "! rkf_assisted_reader.ar_concept_p(concept) " + ("rkf_assisted_reader.ar_concept_p(concept) " + "CommonSymbols.NIL != rkf_assisted_reader.ar_concept_p(concept) ") + concept;
        SubLObject release = NIL;
        try {
            release = seize_lock($ar_lock$.getGlobalValue());
            if (NIL == member(concept, ar_state_accepted_concepts(state), symbol_function(EQL), symbol_function(IDENTITY))) {
                _csetf_ar_state_accepted_concepts(state, cons(concept, ar_state_accepted_concepts(state)));
            }
        } finally {
            if (NIL != release) {
                release_lock($ar_lock$.getGlobalValue());
            }
        }
        return state;
    }

    public static final SubLObject rem_ar_state_accepted_concept_alt(SubLObject state, SubLObject concept) {
        SubLTrampolineFile.checkType(state, AR_STATE_P);
        SubLTrampolineFile.checkType(concept, AR_CONCEPT_P);
        {
            SubLObject lock = $ar_lock$.getGlobalValue();
            SubLObject release = NIL;
            try {
                release = seize_lock(lock);
                _csetf_ar_state_accepted_concepts(state, delete(concept, ar_state_accepted_concepts(state), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
            } finally {
                if (NIL != release) {
                    release_lock(lock);
                }
            }
        }
        return state;
    }

    public static SubLObject rem_ar_state_accepted_concept(final SubLObject state, final SubLObject concept) {
        assert NIL != ar_state_p(state) : "! rkf_assisted_reader.ar_state_p(state) " + ("rkf_assisted_reader.ar_state_p(state) " + "CommonSymbols.NIL != rkf_assisted_reader.ar_state_p(state) ") + state;
        assert NIL != ar_concept_p(concept) : "! rkf_assisted_reader.ar_concept_p(concept) " + ("rkf_assisted_reader.ar_concept_p(concept) " + "CommonSymbols.NIL != rkf_assisted_reader.ar_concept_p(concept) ") + concept;
        SubLObject release = NIL;
        try {
            release = seize_lock($ar_lock$.getGlobalValue());
            _csetf_ar_state_accepted_concepts(state, delete(concept, ar_state_accepted_concepts(state), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
        } finally {
            if (NIL != release) {
                release_lock($ar_lock$.getGlobalValue());
            }
        }
        return state;
    }

    public static final SubLObject add_ar_state_pending_concept_alt(SubLObject state, SubLObject concept) {
        SubLTrampolineFile.checkType(state, AR_STATE_P);
        SubLTrampolineFile.checkType(concept, AR_CONCEPT_P);
        {
            SubLObject lock = $ar_lock$.getGlobalValue();
            SubLObject release = NIL;
            try {
                release = seize_lock(lock);
                {
                    SubLObject item_var = concept;
                    if (NIL == member(item_var, ar_state_pending_concepts(state), symbol_function(EQL), symbol_function(IDENTITY))) {
                        _csetf_ar_state_pending_concepts(state, cons(item_var, ar_state_pending_concepts(state)));
                    }
                }
            } finally {
                if (NIL != release) {
                    release_lock(lock);
                }
            }
        }
        return state;
    }

    public static SubLObject add_ar_state_pending_concept(final SubLObject state, final SubLObject concept) {
        assert NIL != ar_state_p(state) : "! rkf_assisted_reader.ar_state_p(state) " + ("rkf_assisted_reader.ar_state_p(state) " + "CommonSymbols.NIL != rkf_assisted_reader.ar_state_p(state) ") + state;
        assert NIL != ar_concept_p(concept) : "! rkf_assisted_reader.ar_concept_p(concept) " + ("rkf_assisted_reader.ar_concept_p(concept) " + "CommonSymbols.NIL != rkf_assisted_reader.ar_concept_p(concept) ") + concept;
        SubLObject release = NIL;
        try {
            release = seize_lock($ar_lock$.getGlobalValue());
            if (NIL == member(concept, ar_state_pending_concepts(state), symbol_function(EQL), symbol_function(IDENTITY))) {
                _csetf_ar_state_pending_concepts(state, cons(concept, ar_state_pending_concepts(state)));
            }
        } finally {
            if (NIL != release) {
                release_lock($ar_lock$.getGlobalValue());
            }
        }
        return state;
    }

    public static final SubLObject rem_ar_state_pending_concept_alt(SubLObject state, SubLObject concept) {
        SubLTrampolineFile.checkType(state, AR_STATE_P);
        SubLTrampolineFile.checkType(concept, AR_CONCEPT_P);
        {
            SubLObject lock = $ar_lock$.getGlobalValue();
            SubLObject release = NIL;
            try {
                release = seize_lock(lock);
                _csetf_ar_state_pending_concepts(state, delete(concept, ar_state_pending_concepts(state), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
            } finally {
                if (NIL != release) {
                    release_lock(lock);
                }
            }
        }
        return state;
    }

    public static SubLObject rem_ar_state_pending_concept(final SubLObject state, final SubLObject concept) {
        assert NIL != ar_state_p(state) : "! rkf_assisted_reader.ar_state_p(state) " + ("rkf_assisted_reader.ar_state_p(state) " + "CommonSymbols.NIL != rkf_assisted_reader.ar_state_p(state) ") + state;
        assert NIL != ar_concept_p(concept) : "! rkf_assisted_reader.ar_concept_p(concept) " + ("rkf_assisted_reader.ar_concept_p(concept) " + "CommonSymbols.NIL != rkf_assisted_reader.ar_concept_p(concept) ") + concept;
        SubLObject release = NIL;
        try {
            release = seize_lock($ar_lock$.getGlobalValue());
            _csetf_ar_state_pending_concepts(state, delete(concept, ar_state_pending_concepts(state), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
        } finally {
            if (NIL != release) {
                release_lock($ar_lock$.getGlobalValue());
            }
        }
        return state;
    }

    public static final SubLObject ar_state_candidate_assertions_alt(SubLObject state) {
        {
            SubLObject result = list_utilities.remove_if_not($sym223$AR_CONCEPT_ASSERTION_, ar_state_candidate_cycls(state), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            return result;
        }
    }

    public static SubLObject ar_state_candidate_assertions(final SubLObject state) {
        final SubLObject result = list_utilities.remove_if_not($sym244$AR_CONCEPT_ASSERTION_, ar_state_candidate_cycls(state), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        return result;
    }

    public static final SubLObject ar_state_candidate_queries_alt(SubLObject state) {
        {
            SubLObject result = list_utilities.remove_if_not($sym224$AR_CONCEPT_QUERY_, ar_state_candidate_cycls(state), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            return result;
        }
    }

    public static SubLObject ar_state_candidate_queries(final SubLObject state) {
        final SubLObject result = list_utilities.remove_if_not($sym245$AR_CONCEPT_QUERY_, ar_state_candidate_cycls(state), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        return result;
    }

    public static final SubLObject add_ar_state_candidate_cycl_alt(SubLObject state, SubLObject concept) {
        SubLTrampolineFile.checkType(state, AR_STATE_P);
        SubLTrampolineFile.checkType(concept, AR_CONCEPT_P);
        {
            SubLObject lock = $ar_lock$.getGlobalValue();
            SubLObject release = NIL;
            try {
                release = seize_lock(lock);
                {
                    SubLObject item_var = concept;
                    if (NIL == member(item_var, ar_state_candidate_cycls(state), symbol_function(EQL), symbol_function(IDENTITY))) {
                        _csetf_ar_state_candidate_cycls(state, cons(item_var, ar_state_candidate_cycls(state)));
                    }
                }
            } finally {
                if (NIL != release) {
                    release_lock(lock);
                }
            }
        }
        return state;
    }

    public static SubLObject add_ar_state_candidate_cycl(final SubLObject state, final SubLObject concept) {
        assert NIL != ar_state_p(state) : "! rkf_assisted_reader.ar_state_p(state) " + ("rkf_assisted_reader.ar_state_p(state) " + "CommonSymbols.NIL != rkf_assisted_reader.ar_state_p(state) ") + state;
        assert NIL != ar_concept_p(concept) : "! rkf_assisted_reader.ar_concept_p(concept) " + ("rkf_assisted_reader.ar_concept_p(concept) " + "CommonSymbols.NIL != rkf_assisted_reader.ar_concept_p(concept) ") + concept;
        SubLObject release = NIL;
        try {
            release = seize_lock($ar_lock$.getGlobalValue());
            if (NIL == member(concept, ar_state_candidate_cycls(state), symbol_function(EQL), symbol_function(IDENTITY))) {
                _csetf_ar_state_candidate_cycls(state, cons(concept, ar_state_candidate_cycls(state)));
            }
        } finally {
            if (NIL != release) {
                release_lock($ar_lock$.getGlobalValue());
            }
        }
        return state;
    }

    public static final SubLObject add_ar_state_candidate_assertion_alt(SubLObject state, SubLObject concept) {
        SubLTrampolineFile.checkType(state, AR_STATE_P);
        SubLTrampolineFile.checkType(concept, AR_CONCEPT_P);
        _csetf_ar_concept_force(concept, $DECLARATIVE);
        {
            SubLObject lock = $ar_lock$.getGlobalValue();
            SubLObject release = NIL;
            try {
                release = seize_lock(lock);
                {
                    SubLObject item_var = concept;
                    if (NIL == member(item_var, ar_state_candidate_cycls(state), symbol_function(EQL), symbol_function(IDENTITY))) {
                        _csetf_ar_state_candidate_cycls(state, cons(item_var, ar_state_candidate_cycls(state)));
                    }
                }
            } finally {
                if (NIL != release) {
                    release_lock(lock);
                }
            }
        }
        return state;
    }

    public static SubLObject add_ar_state_candidate_assertion(final SubLObject state, final SubLObject concept) {
        assert NIL != ar_state_p(state) : "! rkf_assisted_reader.ar_state_p(state) " + ("rkf_assisted_reader.ar_state_p(state) " + "CommonSymbols.NIL != rkf_assisted_reader.ar_state_p(state) ") + state;
        assert NIL != ar_concept_p(concept) : "! rkf_assisted_reader.ar_concept_p(concept) " + ("rkf_assisted_reader.ar_concept_p(concept) " + "CommonSymbols.NIL != rkf_assisted_reader.ar_concept_p(concept) ") + concept;
        _csetf_ar_concept_force(concept, $DECLARATIVE);
        SubLObject release = NIL;
        try {
            release = seize_lock($ar_lock$.getGlobalValue());
            if (NIL == member(concept, ar_state_candidate_cycls(state), symbol_function(EQL), symbol_function(IDENTITY))) {
                _csetf_ar_state_candidate_cycls(state, cons(concept, ar_state_candidate_cycls(state)));
            }
        } finally {
            if (NIL != release) {
                release_lock($ar_lock$.getGlobalValue());
            }
        }
        return state;
    }

    public static final SubLObject add_ar_state_candidate_query_alt(SubLObject state, SubLObject concept) {
        SubLTrampolineFile.checkType(state, AR_STATE_P);
        SubLTrampolineFile.checkType(concept, AR_CONCEPT_P);
        _csetf_ar_concept_force(concept, $QUESTION);
        {
            SubLObject lock = $ar_lock$.getGlobalValue();
            SubLObject release = NIL;
            try {
                release = seize_lock(lock);
                {
                    SubLObject item_var = concept;
                    if (NIL == member(item_var, ar_state_candidate_cycls(state), symbol_function(EQL), symbol_function(IDENTITY))) {
                        _csetf_ar_state_candidate_cycls(state, cons(item_var, ar_state_candidate_cycls(state)));
                    }
                }
            } finally {
                if (NIL != release) {
                    release_lock(lock);
                }
            }
        }
        return state;
    }

    public static SubLObject add_ar_state_candidate_query(final SubLObject state, final SubLObject concept) {
        assert NIL != ar_state_p(state) : "! rkf_assisted_reader.ar_state_p(state) " + ("rkf_assisted_reader.ar_state_p(state) " + "CommonSymbols.NIL != rkf_assisted_reader.ar_state_p(state) ") + state;
        assert NIL != ar_concept_p(concept) : "! rkf_assisted_reader.ar_concept_p(concept) " + ("rkf_assisted_reader.ar_concept_p(concept) " + "CommonSymbols.NIL != rkf_assisted_reader.ar_concept_p(concept) ") + concept;
        _csetf_ar_concept_force(concept, $QUESTION);
        SubLObject release = NIL;
        try {
            release = seize_lock($ar_lock$.getGlobalValue());
            if (NIL == member(concept, ar_state_candidate_cycls(state), symbol_function(EQL), symbol_function(IDENTITY))) {
                _csetf_ar_state_candidate_cycls(state, cons(concept, ar_state_candidate_cycls(state)));
            }
        } finally {
            if (NIL != release) {
                release_lock($ar_lock$.getGlobalValue());
            }
        }
        return state;
    }

    public static final SubLObject rem_ar_state_candidate_assertion_alt(SubLObject state, SubLObject concept) {
        SubLTrampolineFile.checkType(state, AR_STATE_P);
        SubLTrampolineFile.checkType(concept, AR_CONCEPT_P);
        {
            SubLObject lock = $ar_lock$.getGlobalValue();
            SubLObject release = NIL;
            try {
                release = seize_lock(lock);
                _csetf_ar_state_candidate_cycls(state, delete(concept, ar_state_candidate_cycls(state), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
            } finally {
                if (NIL != release) {
                    release_lock(lock);
                }
            }
        }
        return state;
    }

    public static SubLObject rem_ar_state_candidate_assertion(final SubLObject state, final SubLObject concept) {
        assert NIL != ar_state_p(state) : "! rkf_assisted_reader.ar_state_p(state) " + ("rkf_assisted_reader.ar_state_p(state) " + "CommonSymbols.NIL != rkf_assisted_reader.ar_state_p(state) ") + state;
        assert NIL != ar_concept_p(concept) : "! rkf_assisted_reader.ar_concept_p(concept) " + ("rkf_assisted_reader.ar_concept_p(concept) " + "CommonSymbols.NIL != rkf_assisted_reader.ar_concept_p(concept) ") + concept;
        SubLObject release = NIL;
        try {
            release = seize_lock($ar_lock$.getGlobalValue());
            _csetf_ar_state_candidate_cycls(state, delete(concept, ar_state_candidate_cycls(state), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
        } finally {
            if (NIL != release) {
                release_lock($ar_lock$.getGlobalValue());
            }
        }
        return state;
    }

    public static final SubLObject rem_ar_state_candidate_query_alt(SubLObject state, SubLObject concept) {
        SubLTrampolineFile.checkType(state, AR_STATE_P);
        SubLTrampolineFile.checkType(concept, AR_CONCEPT_P);
        {
            SubLObject lock = $ar_lock$.getGlobalValue();
            SubLObject release = NIL;
            try {
                release = seize_lock(lock);
                _csetf_ar_state_candidate_cycls(state, delete(concept, ar_state_candidate_cycls(state), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
            } finally {
                if (NIL != release) {
                    release_lock(lock);
                }
            }
        }
        return state;
    }

    public static SubLObject rem_ar_state_candidate_query(final SubLObject state, final SubLObject concept) {
        assert NIL != ar_state_p(state) : "! rkf_assisted_reader.ar_state_p(state) " + ("rkf_assisted_reader.ar_state_p(state) " + "CommonSymbols.NIL != rkf_assisted_reader.ar_state_p(state) ") + state;
        assert NIL != ar_concept_p(concept) : "! rkf_assisted_reader.ar_concept_p(concept) " + ("rkf_assisted_reader.ar_concept_p(concept) " + "CommonSymbols.NIL != rkf_assisted_reader.ar_concept_p(concept) ") + concept;
        SubLObject release = NIL;
        try {
            release = seize_lock($ar_lock$.getGlobalValue());
            _csetf_ar_state_candidate_cycls(state, delete(concept, ar_state_candidate_cycls(state), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
        } finally {
            if (NIL != release) {
                release_lock($ar_lock$.getGlobalValue());
            }
        }
        return state;
    }

    public static final SubLObject add_ar_state_asserted_assertion_alt(SubLObject state, SubLObject concept) {
        SubLTrampolineFile.checkType(state, AR_STATE_P);
        SubLTrampolineFile.checkType(concept, AR_CONCEPT_P);
        {
            SubLObject lock = $ar_lock$.getGlobalValue();
            SubLObject release = NIL;
            try {
                release = seize_lock(lock);
                {
                    SubLObject item_var = concept;
                    if (NIL == member(item_var, ar_state_asserted_assertions(state), symbol_function(EQL), symbol_function(IDENTITY))) {
                        _csetf_ar_state_asserted_assertions(state, cons(item_var, ar_state_asserted_assertions(state)));
                    }
                }
            } finally {
                if (NIL != release) {
                    release_lock(lock);
                }
            }
        }
        return state;
    }

    public static SubLObject add_ar_state_asserted_assertion(final SubLObject state, final SubLObject concept) {
        assert NIL != ar_state_p(state) : "! rkf_assisted_reader.ar_state_p(state) " + ("rkf_assisted_reader.ar_state_p(state) " + "CommonSymbols.NIL != rkf_assisted_reader.ar_state_p(state) ") + state;
        assert NIL != ar_concept_p(concept) : "! rkf_assisted_reader.ar_concept_p(concept) " + ("rkf_assisted_reader.ar_concept_p(concept) " + "CommonSymbols.NIL != rkf_assisted_reader.ar_concept_p(concept) ") + concept;
        SubLObject release = NIL;
        try {
            release = seize_lock($ar_lock$.getGlobalValue());
            if (NIL == member(concept, ar_state_asserted_assertions(state), symbol_function(EQL), symbol_function(IDENTITY))) {
                _csetf_ar_state_asserted_assertions(state, cons(concept, ar_state_asserted_assertions(state)));
            }
        } finally {
            if (NIL != release) {
                release_lock($ar_lock$.getGlobalValue());
            }
        }
        return state;
    }

    public static final SubLObject rem_ar_state_asserted_assertion_alt(SubLObject state, SubLObject concept) {
        SubLTrampolineFile.checkType(state, AR_STATE_P);
        SubLTrampolineFile.checkType(concept, AR_CONCEPT_P);
        {
            SubLObject lock = $ar_lock$.getGlobalValue();
            SubLObject release = NIL;
            try {
                release = seize_lock(lock);
                _csetf_ar_state_asserted_assertions(state, delete(concept, ar_state_asserted_assertions(state), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
            } finally {
                if (NIL != release) {
                    release_lock(lock);
                }
            }
        }
        return state;
    }

    public static SubLObject rem_ar_state_asserted_assertion(final SubLObject state, final SubLObject concept) {
        assert NIL != ar_state_p(state) : "! rkf_assisted_reader.ar_state_p(state) " + ("rkf_assisted_reader.ar_state_p(state) " + "CommonSymbols.NIL != rkf_assisted_reader.ar_state_p(state) ") + state;
        assert NIL != ar_concept_p(concept) : "! rkf_assisted_reader.ar_concept_p(concept) " + ("rkf_assisted_reader.ar_concept_p(concept) " + "CommonSymbols.NIL != rkf_assisted_reader.ar_concept_p(concept) ") + concept;
        SubLObject release = NIL;
        try {
            release = seize_lock($ar_lock$.getGlobalValue());
            _csetf_ar_state_asserted_assertions(state, delete(concept, ar_state_asserted_assertions(state), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
        } finally {
            if (NIL != release) {
                release_lock($ar_lock$.getGlobalValue());
            }
        }
        return state;
    }

    public static final SubLObject add_ar_state_term_template_alt(SubLObject state, SubLObject template) {
        SubLTrampolineFile.checkType(state, AR_STATE_P);
        SubLTrampolineFile.checkType(template, AR_TEMPLATE_P);
        {
            SubLObject lock = $ar_lock$.getGlobalValue();
            SubLObject release = NIL;
            try {
                release = seize_lock(lock);
                {
                    SubLObject item_var = template;
                    if (NIL == member(item_var, ar_state_term_templates(state), symbol_function(EQL), symbol_function(IDENTITY))) {
                        _csetf_ar_state_term_templates(state, cons(item_var, ar_state_term_templates(state)));
                    }
                }
            } finally {
                if (NIL != release) {
                    release_lock(lock);
                }
            }
        }
        return state;
    }

    public static SubLObject add_ar_state_term_template(final SubLObject state, final SubLObject template) {
        assert NIL != ar_state_p(state) : "! rkf_assisted_reader.ar_state_p(state) " + ("rkf_assisted_reader.ar_state_p(state) " + "CommonSymbols.NIL != rkf_assisted_reader.ar_state_p(state) ") + state;
        assert NIL != ar_template_p(template) : "! rkf_assisted_reader.ar_template_p(template) " + ("rkf_assisted_reader.ar_template_p(template) " + "CommonSymbols.NIL != rkf_assisted_reader.ar_template_p(template) ") + template;
        SubLObject release = NIL;
        try {
            release = seize_lock($ar_lock$.getGlobalValue());
            if (NIL == member(template, ar_state_term_templates(state), symbol_function(EQL), symbol_function(IDENTITY))) {
                _csetf_ar_state_term_templates(state, cons(template, ar_state_term_templates(state)));
            }
        } finally {
            if (NIL != release) {
                release_lock($ar_lock$.getGlobalValue());
            }
        }
        return state;
    }

    public static final SubLObject rem_ar_state_term_template_alt(SubLObject state, SubLObject template) {
        SubLTrampolineFile.checkType(state, AR_STATE_P);
        SubLTrampolineFile.checkType(template, AR_TEMPLATE_P);
        {
            SubLObject lock = $ar_lock$.getGlobalValue();
            SubLObject release = NIL;
            try {
                release = seize_lock(lock);
                _csetf_ar_state_term_templates(state, delete(template, ar_state_term_templates(state), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
            } finally {
                if (NIL != release) {
                    release_lock(lock);
                }
            }
        }
        return state;
    }

    public static SubLObject rem_ar_state_term_template(final SubLObject state, final SubLObject template) {
        assert NIL != ar_state_p(state) : "! rkf_assisted_reader.ar_state_p(state) " + ("rkf_assisted_reader.ar_state_p(state) " + "CommonSymbols.NIL != rkf_assisted_reader.ar_state_p(state) ") + state;
        assert NIL != ar_template_p(template) : "! rkf_assisted_reader.ar_template_p(template) " + ("rkf_assisted_reader.ar_template_p(template) " + "CommonSymbols.NIL != rkf_assisted_reader.ar_template_p(template) ") + template;
        SubLObject release = NIL;
        try {
            release = seize_lock($ar_lock$.getGlobalValue());
            _csetf_ar_state_term_templates(state, delete(template, ar_state_term_templates(state), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
        } finally {
            if (NIL != release) {
                release_lock($ar_lock$.getGlobalValue());
            }
        }
        return state;
    }

    public static final SubLObject add_ar_state_assert_template_alt(SubLObject state, SubLObject template) {
        SubLTrampolineFile.checkType(state, AR_STATE_P);
        SubLTrampolineFile.checkType(template, AR_TEMPLATE_P);
        {
            SubLObject lock = $ar_lock$.getGlobalValue();
            SubLObject release = NIL;
            try {
                release = seize_lock(lock);
                {
                    SubLObject item_var = template;
                    if (NIL == member(item_var, ar_state_assert_templates(state), symbol_function(EQL), symbol_function(IDENTITY))) {
                        _csetf_ar_state_assert_templates(state, cons(item_var, ar_state_assert_templates(state)));
                    }
                }
            } finally {
                if (NIL != release) {
                    release_lock(lock);
                }
            }
        }
        return state;
    }

    public static SubLObject add_ar_state_assert_template(final SubLObject state, final SubLObject template) {
        assert NIL != ar_state_p(state) : "! rkf_assisted_reader.ar_state_p(state) " + ("rkf_assisted_reader.ar_state_p(state) " + "CommonSymbols.NIL != rkf_assisted_reader.ar_state_p(state) ") + state;
        assert NIL != ar_template_p(template) : "! rkf_assisted_reader.ar_template_p(template) " + ("rkf_assisted_reader.ar_template_p(template) " + "CommonSymbols.NIL != rkf_assisted_reader.ar_template_p(template) ") + template;
        SubLObject release = NIL;
        try {
            release = seize_lock($ar_lock$.getGlobalValue());
            if (NIL == member(template, ar_state_assert_templates(state), symbol_function(EQL), symbol_function(IDENTITY))) {
                _csetf_ar_state_assert_templates(state, cons(template, ar_state_assert_templates(state)));
            }
        } finally {
            if (NIL != release) {
                release_lock($ar_lock$.getGlobalValue());
            }
        }
        return state;
    }

    public static final SubLObject rem_ar_state_assert_template_alt(SubLObject state, SubLObject template) {
        SubLTrampolineFile.checkType(state, AR_STATE_P);
        SubLTrampolineFile.checkType(template, AR_TEMPLATE_P);
        {
            SubLObject lock = $ar_lock$.getGlobalValue();
            SubLObject release = NIL;
            try {
                release = seize_lock(lock);
                _csetf_ar_state_assert_templates(state, delete(template, ar_state_assert_templates(state), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
            } finally {
                if (NIL != release) {
                    release_lock(lock);
                }
            }
        }
        return state;
    }

    public static SubLObject rem_ar_state_assert_template(final SubLObject state, final SubLObject template) {
        assert NIL != ar_state_p(state) : "! rkf_assisted_reader.ar_state_p(state) " + ("rkf_assisted_reader.ar_state_p(state) " + "CommonSymbols.NIL != rkf_assisted_reader.ar_state_p(state) ") + state;
        assert NIL != ar_template_p(template) : "! rkf_assisted_reader.ar_template_p(template) " + ("rkf_assisted_reader.ar_template_p(template) " + "CommonSymbols.NIL != rkf_assisted_reader.ar_template_p(template) ") + template;
        SubLObject release = NIL;
        try {
            release = seize_lock($ar_lock$.getGlobalValue());
            _csetf_ar_state_assert_templates(state, delete(template, ar_state_assert_templates(state), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
        } finally {
            if (NIL != release) {
                release_lock($ar_lock$.getGlobalValue());
            }
        }
        return state;
    }

    /**
     *
     *
     * @param STATE
    ar-state
     * 		
     * @return boolean; does STATE have any parses that cover the entire input?
     */
    @LispMethod(comment = "@param STATE\nar-state\r\n\t\t\r\n@return boolean; does STATE have any parses that cover the entire input?")
    public static final SubLObject ar_state_top_level_parsesP_alt(SubLObject state) {
        {
            SubLObject focus_sentence = ar_state_focus_sentence(state);
            SubLObject doneP = NIL;
            if (NIL != ar_sentence_p(focus_sentence)) {
                {
                    SubLObject focus_sentence_length = length(ar_sentence_token_vector(focus_sentence));
                    SubLObject phrases = cconcatenate(ar_state_ambiguous_phrases(state), new SubLObject[]{ ar_state_pending_phrases(state), ar_state_assumed_phrases(state) });
                    if (NIL == doneP) {
                        {
                            SubLObject csome_list_var = phrases;
                            SubLObject phrase = NIL;
                            for (phrase = csome_list_var.first(); !((NIL != doneP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , phrase = csome_list_var.first()) {
                                if (focus_sentence_length.numE(ar_phrase_token_count(phrase))) {
                                    doneP = T;
                                }
                            }
                        }
                    }
                }
            }
            return doneP;
        }
    }

    /**
     *
     *
     * @param STATE
    ar-state
     * 		
     * @return boolean; does STATE have any parses that cover the entire input?
     */
    @LispMethod(comment = "@param STATE\nar-state\r\n\t\t\r\n@return boolean; does STATE have any parses that cover the entire input?")
    public static SubLObject ar_state_top_level_parsesP(final SubLObject state) {
        final SubLObject focus_sentence = ar_state_focus_sentence(state);
        SubLObject doneP = NIL;
        if (NIL != ar_sentence_p(focus_sentence)) {
            final SubLObject focus_sentence_length = length(ar_sentence_token_vector(focus_sentence));
            final SubLObject phrases = cconcatenate(ar_state_ambiguous_phrases(state), new SubLObject[]{ ar_state_pending_phrases(state), ar_state_assumed_phrases(state) });
            if (NIL == doneP) {
                SubLObject csome_list_var = phrases;
                SubLObject phrase = NIL;
                phrase = csome_list_var.first();
                while ((NIL == doneP) && (NIL != csome_list_var)) {
                    if (focus_sentence_length.numE(ar_phrase_token_count(phrase))) {
                        doneP = T;
                    }
                    csome_list_var = csome_list_var.rest();
                    phrase = csome_list_var.first();
                } 
            }
        }
        return doneP;
    }

    public static final SubLObject ar_sentence_completed_p_alt(SubLObject state, SubLObject sentence) {
        return subl_promotions.memberP(sentence, ar_state_completed_sentences(state), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject ar_sentence_completed_p(final SubLObject state, final SubLObject sentence) {
        return subl_promotions.memberP(sentence, ar_state_completed_sentences(state), UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject ar_source_sentence_p_alt(SubLObject sentence) {
        return makeBoolean((NIL != ar_sentence_p(sentence)) && (NIL == ar_clarification_sentence_p(sentence)));
    }

    public static SubLObject ar_source_sentence_p(final SubLObject sentence) {
        return makeBoolean((NIL != ar_sentence_p(sentence)) && (NIL == ar_clarification_sentence_p(sentence)));
    }

    public static final SubLObject ar_clarification_sentence_p_alt(SubLObject sentence) {
        return makeBoolean((NIL != ar_sentence_p(sentence)) && (NIL != ar_sentence_source_sentence(sentence)));
    }

    public static SubLObject ar_clarification_sentence_p(final SubLObject sentence) {
        return makeBoolean((NIL != ar_sentence_p(sentence)) && (NIL != ar_sentence_source_sentence(sentence)));
    }

    public static final SubLObject ar_source_sentence_number_alt(SubLObject state, SubLObject sentence) {
        if (NIL != ar_source_sentence_p(sentence)) {
            {
                SubLObject source_sentences = ar_state_source_sentences(state);
                SubLObject total = length(source_sentences);
                return subtract(total, position(sentence, source_sentences, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
            }
        }
        return NIL;
    }

    public static SubLObject ar_source_sentence_number(final SubLObject state, final SubLObject sentence) {
        if (NIL != ar_source_sentence_p(sentence)) {
            final SubLObject source_sentences = ar_state_source_sentences(state);
            final SubLObject total = length(source_sentences);
            return subtract(total, position(sentence, source_sentences, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
        }
        return NIL;
    }

    public static final SubLObject ar_clarification_sentence_number_alt(SubLObject state, SubLObject clarification) {
        if (NIL != ar_clarification_sentence_p(clarification)) {
            {
                SubLObject sentence = ar_sentence_source_sentence(clarification);
                SubLObject clarifications = ar_sentence_clarifications(sentence);
                SubLObject total = length(clarifications);
                return subtract(total, position(clarification, clarifications, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
            }
        }
        return NIL;
    }

    public static SubLObject ar_clarification_sentence_number(final SubLObject state, final SubLObject clarification) {
        if (NIL != ar_clarification_sentence_p(clarification)) {
            final SubLObject sentence = ar_sentence_source_sentence(clarification);
            final SubLObject clarifications = ar_sentence_clarifications(sentence);
            final SubLObject total = length(clarifications);
            return subtract(total, position(clarification, clarifications, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
        }
        return NIL;
    }

    public static final SubLObject ar_determine_source_sentence_alt(SubLObject sentence) {
        if (NIL != ar_source_sentence_p(sentence)) {
            return sentence;
        } else {
            if (NIL != ar_clarification_sentence_p(sentence)) {
                return ar_sentence_source_sentence(sentence);
            } else {
                return NIL;
            }
        }
    }

    public static SubLObject ar_determine_source_sentence(final SubLObject sentence) {
        if (NIL != ar_source_sentence_p(sentence)) {
            return sentence;
        }
        if (NIL != ar_clarification_sentence_p(sentence)) {
            return ar_sentence_source_sentence(sentence);
        }
        return NIL;
    }

    public static final SubLObject ar_determine_concept_sentences_alt(SubLObject concept) {
        {
            SubLObject sentences = ar_determine_concept_sentences_recursive(concept, NIL);
            sentences = Sort.sort(sentences, symbol_function($sym225$_), symbol_function(AR_SENTENCE_ID));
            return sentences;
        }
    }

    public static SubLObject ar_determine_concept_sentences(final SubLObject concept) {
        SubLObject sentences = ar_determine_concept_sentences_recursive(concept, NIL);
        sentences = Sort.sort(sentences, symbol_function($sym246$_), symbol_function(AR_SENTENCE_ID));
        return sentences;
    }

    public static final SubLObject ar_determine_concept_sentences_recursive_alt(SubLObject concept, SubLObject sentences) {
        {
            SubLObject cdolist_list_var = ar_concept_phrases(concept);
            SubLObject phrase = NIL;
            for (phrase = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , phrase = cdolist_list_var.first()) {
                {
                    SubLObject item_var = ar_phrase_sentence(phrase);
                    if (NIL == member(item_var, sentences, symbol_function(EQL), symbol_function(IDENTITY))) {
                        sentences = cons(item_var, sentences);
                    }
                }
            }
        }
        {
            SubLObject cdolist_list_var = ar_concept_parts(concept);
            SubLObject part = NIL;
            for (part = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , part = cdolist_list_var.first()) {
                sentences = ar_determine_concept_sentences_recursive(part, sentences);
            }
        }
        return sentences;
    }

    public static SubLObject ar_determine_concept_sentences_recursive(final SubLObject concept, SubLObject sentences) {
        SubLObject cdolist_list_var = ar_concept_phrases(concept);
        SubLObject phrase = NIL;
        phrase = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject item_var = ar_phrase_sentence(phrase);
            if (NIL == member(item_var, sentences, symbol_function(EQL), symbol_function(IDENTITY))) {
                sentences = cons(item_var, sentences);
            }
            cdolist_list_var = cdolist_list_var.rest();
            phrase = cdolist_list_var.first();
        } 
        cdolist_list_var = ar_concept_parts(concept);
        SubLObject part = NIL;
        part = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            sentences = ar_determine_concept_sentences_recursive(part, sentences);
            cdolist_list_var = cdolist_list_var.rest();
            part = cdolist_list_var.first();
        } 
        return sentences;
    }

    public static final SubLObject ar_sentence_assumed_phrase_count_alt(SubLObject state, SubLObject sentence) {
        return count(sentence, ar_state_assumed_phrases(state), symbol_function(EQL), symbol_function(AR_PHRASE_SENTENCE), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject ar_sentence_assumed_phrase_count(final SubLObject state, final SubLObject sentence) {
        return count(sentence, ar_state_assumed_phrases(state), symbol_function(EQL), symbol_function(AR_PHRASE_SENTENCE), UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject ar_state_next_assumed_phrase_alt(SubLObject state) {
        {
            SubLObject sentence = ar_state_focus_sentence(state);
            if (NIL != sentence) {
                {
                    SubLObject phrases = ar_sentence_phrases(sentence);
                    if (NIL != find($ASSUMED, phrases, symbol_function(EQL), symbol_function(AR_PHRASE_STATUS), UNPROVIDED, UNPROVIDED)) {
                        return list_utilities.extremal(remove($ASSUMED, phrases, symbol_function(NOT_EQL), symbol_function(AR_PHRASE_STATUS), UNPROVIDED, UNPROVIDED, UNPROVIDED), symbol_function($sym225$_), symbol_function(AR_PHRASE_ID));
                    }
                }
            }
        }
        return NIL;
    }

    public static SubLObject ar_state_next_assumed_phrase(final SubLObject state) {
        final SubLObject sentence = ar_state_focus_sentence(state);
        if (NIL != sentence) {
            final SubLObject phrases = ar_sentence_phrases(sentence);
            if (NIL != find($ASSUMED, phrases, symbol_function(EQL), symbol_function(AR_PHRASE_STATUS), UNPROVIDED, UNPROVIDED)) {
                return list_utilities.extremal(remove($ASSUMED, phrases, symbol_function(NOT_EQL), symbol_function(AR_PHRASE_STATUS), UNPROVIDED, UNPROVIDED, UNPROVIDED), symbol_function($sym246$_), symbol_function(AR_PHRASE_ID));
            }
        }
        return NIL;
    }

    public static final SubLObject ar_state_next_unknown_phrase_alt(SubLObject state) {
        {
            SubLObject sentence = ar_state_focus_sentence(state);
            if (NIL != sentence) {
                {
                    SubLObject phrases = ar_sentence_phrases(sentence);
                    if (NIL != find($UNKNOWN, phrases, symbol_function(EQL), symbol_function(AR_PHRASE_STATUS), UNPROVIDED, UNPROVIDED)) {
                        return list_utilities.extremal(remove($UNKNOWN, phrases, symbol_function(NOT_EQL), symbol_function(AR_PHRASE_STATUS), UNPROVIDED, UNPROVIDED, UNPROVIDED), symbol_function($sym225$_), symbol_function(AR_PHRASE_ID));
                    }
                }
            }
        }
        return NIL;
    }

    public static SubLObject ar_state_next_unknown_phrase(final SubLObject state) {
        final SubLObject sentence = ar_state_focus_sentence(state);
        if (NIL != sentence) {
            final SubLObject phrases = ar_sentence_phrases(sentence);
            if (NIL != find($UNKNOWN, phrases, symbol_function(EQL), symbol_function(AR_PHRASE_STATUS), UNPROVIDED, UNPROVIDED)) {
                return list_utilities.extremal(remove($UNKNOWN, phrases, symbol_function(NOT_EQL), symbol_function(AR_PHRASE_STATUS), UNPROVIDED, UNPROVIDED, UNPROVIDED), symbol_function($sym246$_), symbol_function(AR_PHRASE_ID));
            }
        }
        return NIL;
    }

    /**
     * The most promising unknown phrase is the one being subsumed by pending
     * phrases because that advances the solution state.
     */
    @LispMethod(comment = "The most promising unknown phrase is the one being subsumed by pending\r\nphrases because that advances the solution state.\nThe most promising unknown phrase is the one being subsumed by pending\nphrases because that advances the solution state.")
    public static final SubLObject ar_state_select_most_promising_unknown_phrase_alt(SubLObject state) {
        {
            SubLObject sentence = ar_state_focus_sentence(state);
            if (NIL != sentence) {
                {
                    SubLObject phrases = ar_sentence_phrases(sentence);
                    if (NIL != find($UNKNOWN, phrases, symbol_function(EQL), symbol_function(AR_PHRASE_STATUS), UNPROVIDED, UNPROVIDED)) {
                        {
                            SubLObject unknown_phrases = remove($UNKNOWN, phrases, symbol_function(NOT_EQL), symbol_function(AR_PHRASE_STATUS), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            SubLObject pending_concepts = ar_state_pending_concepts(state);
                            SubLObject choices = NIL;
                            SubLObject cdolist_list_var = unknown_phrases;
                            SubLObject unknown_phrase = NIL;
                            for (unknown_phrase = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , unknown_phrase = cdolist_list_var.first()) {
                                {
                                    SubLObject surrogates = ar_phrase_surrogate(unknown_phrase);
                                    SubLObject cdolist_list_var_1 = surrogates;
                                    SubLObject surrogate = NIL;
                                    for (surrogate = cdolist_list_var_1.first(); NIL != cdolist_list_var_1; cdolist_list_var_1 = cdolist_list_var_1.rest() , surrogate = cdolist_list_var_1.first()) {
                                        {
                                            SubLObject cdolist_list_var_2 = pending_concepts;
                                            SubLObject pending_concept = NIL;
                                            for (pending_concept = cdolist_list_var_2.first(); NIL != cdolist_list_var_2; cdolist_list_var_2 = cdolist_list_var_2.rest() , pending_concept = cdolist_list_var_2.first()) {
                                                if (NIL != subl_promotions.memberP(pending_concept, ar_concept_agglomerations(surrogate), UNPROVIDED, UNPROVIDED)) {
                                                    {
                                                        SubLObject item_var = unknown_phrase;
                                                        if (NIL == member(item_var, choices, symbol_function(EQL), symbol_function(IDENTITY))) {
                                                            choices = cons(item_var, choices);
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            if (NIL == choices) {
                                return ar_state_next_unknown_phrase(state);
                            }
                            return choices.first();
                        }
                    }
                }
            }
        }
        return NIL;
    }

    @LispMethod(comment = "The most promising unknown phrase is the one being subsumed by pending\r\nphrases because that advances the solution state.\nThe most promising unknown phrase is the one being subsumed by pending\nphrases because that advances the solution state.")
    public static SubLObject ar_state_select_most_promising_unknown_phrase(final SubLObject state) {
        final SubLObject sentence = ar_state_focus_sentence(state);
        if (NIL != sentence) {
            final SubLObject phrases = ar_sentence_phrases(sentence);
            if (NIL != find($UNKNOWN, phrases, symbol_function(EQL), symbol_function(AR_PHRASE_STATUS), UNPROVIDED, UNPROVIDED)) {
                final SubLObject unknown_phrases = remove($UNKNOWN, phrases, symbol_function(NOT_EQL), symbol_function(AR_PHRASE_STATUS), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                final SubLObject pending_concepts = ar_state_pending_concepts(state);
                SubLObject choices = NIL;
                SubLObject cdolist_list_var = unknown_phrases;
                SubLObject unknown_phrase = NIL;
                unknown_phrase = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    SubLObject cdolist_list_var_$1;
                    final SubLObject surrogates = cdolist_list_var_$1 = ar_phrase_surrogate(unknown_phrase);
                    SubLObject surrogate = NIL;
                    surrogate = cdolist_list_var_$1.first();
                    while (NIL != cdolist_list_var_$1) {
                        SubLObject cdolist_list_var_$2 = pending_concepts;
                        SubLObject pending_concept = NIL;
                        pending_concept = cdolist_list_var_$2.first();
                        while (NIL != cdolist_list_var_$2) {
                            if (NIL != subl_promotions.memberP(pending_concept, ar_concept_agglomerations(surrogate), UNPROVIDED, UNPROVIDED)) {
                                final SubLObject item_var = unknown_phrase;
                                if (NIL == member(item_var, choices, symbol_function(EQL), symbol_function(IDENTITY))) {
                                    choices = cons(item_var, choices);
                                }
                            }
                            cdolist_list_var_$2 = cdolist_list_var_$2.rest();
                            pending_concept = cdolist_list_var_$2.first();
                        } 
                        cdolist_list_var_$1 = cdolist_list_var_$1.rest();
                        surrogate = cdolist_list_var_$1.first();
                    } 
                    cdolist_list_var = cdolist_list_var.rest();
                    unknown_phrase = cdolist_list_var.first();
                } 
                if (NIL == choices) {
                    return ar_state_next_unknown_phrase(state);
                }
                return choices.first();
            }
        }
        return NIL;
    }

    public static final SubLObject ar_state_pending_implied_indexicals_alt(SubLObject state) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject sentence = ar_state_focus_sentence(state);
                SubLObject discourse_context = rkf_discourse_tracking.$rkf_discourse_context$.getDynamicValue(thread);
                if (NIL == discourse_context) {
                    Errors.warn($str_alt229$no_discourse_context);
                }
                if (!((NIL != sentence) && (NIL != discourse_context))) {
                    return NIL;
                }
                {
                    SubLObject phrases = ar_sentence_phrases(sentence);
                    if (NIL != find($PENDING, phrases, EQL, AR_PHRASE_STATUS, UNPROVIDED, UNPROVIDED)) {
                        {
                            SubLObject pending_phrases = remove($PENDING, phrases, NOT_EQL, AR_PHRASE_STATUS, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            SubLObject choices = NIL;
                            SubLObject cdolist_list_var = pending_phrases;
                            SubLObject phrase = NIL;
                            for (phrase = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , phrase = cdolist_list_var.first()) {
                                {
                                    SubLObject concept = ar_phrase_disambiguated_concept(phrase);
                                    SubLObject cycl = ar_concept_cycl(concept);
                                    SubLObject entity = cycl_utilities.expression_find_if($sym231$RKF_DISC_IMPLIED_INDEXICALS_FORMULA_, cycl, UNPROVIDED, UNPROVIDED);
                                    if (((NIL != entity) && (!entity.equal(cycl))) && (NIL != rkf_discourse_tracking.rkf_disc_potentially_resolvable_entityP(entity, discourse_context))) {
                                        choices = cons(list(concept, entity, rkf_discourse_tracking.rkf_disc_resolve_entity(entity, cycl, discourse_context)), choices);
                                    }
                                }
                            }
                            return choices;
                        }
                    }
                }
            }
            return NIL;
        }
    }

    public static SubLObject ar_state_pending_implied_indexicals(final SubLObject state) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject sentence = ar_state_focus_sentence(state);
        final SubLObject discourse_context = rkf_discourse_tracking.$rkf_discourse_context$.getDynamicValue(thread);
        if (NIL == discourse_context) {
            Errors.warn($str250$no_discourse_context);
        }
        if ((NIL == sentence) || (NIL == discourse_context)) {
            return NIL;
        }
        final SubLObject phrases = ar_sentence_phrases(sentence);
        if (NIL != find($PENDING, phrases, EQL, AR_PHRASE_STATUS, UNPROVIDED, UNPROVIDED)) {
            final SubLObject pending_phrases = remove($PENDING, phrases, NOT_EQL, AR_PHRASE_STATUS, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            SubLObject choices = NIL;
            SubLObject cdolist_list_var = pending_phrases;
            SubLObject phrase = NIL;
            phrase = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                final SubLObject concept = ar_phrase_disambiguated_concept(phrase);
                final SubLObject cycl = ar_concept_cycl(concept);
                final SubLObject entity = cycl_utilities.expression_find_if($sym252$RKF_DISC_IMPLIED_INDEXICALS_FORMULA_, cycl, UNPROVIDED, UNPROVIDED);
                if (((NIL != entity) && (!entity.equal(cycl))) && (NIL != rkf_discourse_tracking.rkf_disc_potentially_resolvable_entityP(entity, discourse_context))) {
                    choices = cons(list(concept, entity, rkf_discourse_tracking.rkf_disc_resolve_entity(entity, cycl, discourse_context)), choices);
                }
                cdolist_list_var = cdolist_list_var.rest();
                phrase = cdolist_list_var.first();
            } 
            return choices;
        }
        return NIL;
    }

    public static final SubLObject ar_state_next_implied_indexical_alt(SubLObject state) {
        return ar_state_pending_implied_indexicals(state).first();
    }

    public static SubLObject ar_state_next_implied_indexical(final SubLObject state) {
        return ar_state_pending_implied_indexicals(state).first();
    }

    public static final SubLObject ar_sentence_ambiguous_phrase_count_alt(SubLObject state, SubLObject sentence) {
        return count(sentence, ar_state_ambiguous_phrases(state), symbol_function(EQL), symbol_function(AR_PHRASE_SENTENCE), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject ar_sentence_ambiguous_phrase_count(final SubLObject state, final SubLObject sentence) {
        return count(sentence, ar_state_ambiguous_phrases(state), symbol_function(EQL), symbol_function(AR_PHRASE_SENTENCE), UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject ar_state_next_ambiguous_phrase_alt(SubLObject state) {
        {
            SubLObject sentence = ar_state_focus_sentence(state);
            if (NIL != sentence) {
                {
                    SubLObject phrases = ar_sentence_phrases(sentence);
                    if (NIL != find($AMBIGUOUS, phrases, symbol_function(EQL), symbol_function(AR_PHRASE_STATUS), UNPROVIDED, UNPROVIDED)) {
                        return list_utilities.extremal(remove($AMBIGUOUS, phrases, symbol_function(NOT_EQL), symbol_function(AR_PHRASE_STATUS), UNPROVIDED, UNPROVIDED, UNPROVIDED), symbol_function($sym225$_), symbol_function(AR_PHRASE_ID));
                    }
                }
            }
        }
        return NIL;
    }

    public static SubLObject ar_state_next_ambiguous_phrase(final SubLObject state) {
        final SubLObject sentence = ar_state_focus_sentence(state);
        if (NIL != sentence) {
            final SubLObject phrases = ar_sentence_phrases(sentence);
            if (NIL != find($AMBIGUOUS, phrases, symbol_function(EQL), symbol_function(AR_PHRASE_STATUS), UNPROVIDED, UNPROVIDED)) {
                return list_utilities.extremal(remove($AMBIGUOUS, phrases, symbol_function(NOT_EQL), symbol_function(AR_PHRASE_STATUS), UNPROVIDED, UNPROVIDED, UNPROVIDED), symbol_function($sym246$_), symbol_function(AR_PHRASE_ID));
            }
        }
        return NIL;
    }

    public static final SubLObject ar_sentence_candidate_assertion_count_alt(SubLObject state, SubLObject sentence) {
        return count(sentence, ar_state_candidate_assertions(state), symbol_function(MEMBER), symbol_function(AR_DETERMINE_CONCEPT_SENTENCES), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject ar_sentence_candidate_assertion_count(final SubLObject state, final SubLObject sentence) {
        return count(sentence, ar_state_candidate_assertions(state), symbol_function(MEMBER), symbol_function(AR_DETERMINE_CONCEPT_SENTENCES), UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject ar_sentence_candidate_query_count_alt(SubLObject state, SubLObject sentence) {
        return count(sentence, ar_state_candidate_queries(state), symbol_function(MEMBER), symbol_function(AR_DETERMINE_CONCEPT_SENTENCES), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject ar_sentence_candidate_query_count(final SubLObject state, final SubLObject sentence) {
        return count(sentence, ar_state_candidate_queries(state), symbol_function(MEMBER), symbol_function(AR_DETERMINE_CONCEPT_SENTENCES), UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject ar_sentence_asserted_assertion_count_alt(SubLObject state, SubLObject sentence) {
        return count(sentence, ar_state_asserted_assertions(state), symbol_function(MEMBER), symbol_function(AR_DETERMINE_CONCEPT_SENTENCES), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject ar_sentence_asserted_assertion_count(final SubLObject state, final SubLObject sentence) {
        return count(sentence, ar_state_asserted_assertions(state), symbol_function(MEMBER), symbol_function(AR_DETERMINE_CONCEPT_SENTENCES), UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject ar_state_determine_focus_sentence_alt(SubLObject state) {
        {
            SubLObject current_focus = ar_state_focus_sentence(state);
            SubLObject cdolist_list_var = reverse(ar_state_source_sentences(state));
            SubLObject sentence = NIL;
            for (sentence = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , sentence = cdolist_list_var.first()) {
                if (sentence != current_focus) {
                    if (NIL == ar_sentence_completed_p(state, sentence)) {
                        return sentence;
                    }
                }
                {
                    SubLObject cdolist_list_var_3 = reverse(ar_sentence_clarifications(sentence));
                    SubLObject clarification = NIL;
                    for (clarification = cdolist_list_var_3.first(); NIL != cdolist_list_var_3; cdolist_list_var_3 = cdolist_list_var_3.rest() , clarification = cdolist_list_var_3.first()) {
                        if (clarification != current_focus) {
                            if (NIL == ar_sentence_completed_p(state, clarification)) {
                                return clarification;
                            }
                        }
                    }
                }
            }
        }
        return NIL;
    }

    public static SubLObject ar_state_determine_focus_sentence(final SubLObject state) {
        final SubLObject current_focus = ar_state_focus_sentence(state);
        SubLObject cdolist_list_var = reverse(ar_state_source_sentences(state));
        SubLObject sentence = NIL;
        sentence = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if ((!sentence.eql(current_focus)) && (NIL == ar_sentence_completed_p(state, sentence))) {
                return sentence;
            }
            SubLObject cdolist_list_var_$3 = reverse(ar_sentence_clarifications(sentence));
            SubLObject clarification = NIL;
            clarification = cdolist_list_var_$3.first();
            while (NIL != cdolist_list_var_$3) {
                if ((!clarification.eql(current_focus)) && (NIL == ar_sentence_completed_p(state, clarification))) {
                    return clarification;
                }
                cdolist_list_var_$3 = cdolist_list_var_$3.rest();
                clarification = cdolist_list_var_$3.first();
            } 
            cdolist_list_var = cdolist_list_var.rest();
            sentence = cdolist_list_var.first();
        } 
        return NIL;
    }

    public static final SubLObject ar_surrogate_concept_p_alt(SubLObject concept) {
        if (NIL != ar_concept_p(concept)) {
            {
                SubLObject cycl = ar_concept_cycl(concept);
                return rkf_concept_harvester.rkf_ch_parsing_surrogate_p(cycl);
            }
        }
        return NIL;
    }

    public static SubLObject ar_surrogate_concept_p(final SubLObject concept) {
        if (NIL != ar_concept_p(concept)) {
            final SubLObject cycl = ar_concept_cycl(concept);
            return rkf_concept_harvester.rkf_ch_parsing_surrogate_p(cycl);
        }
        return NIL;
    }

    public static final SubLObject ar_concept_dependent_on_surrogate_p_alt(SubLObject concept, SubLObject depth) {
        if (depth == UNPROVIDED) {
            depth = ZERO_INTEGER;
        }
        if (NIL != ar_surrogate_concept_p(concept)) {
            return T;
        }
        if (depth.numG($max_surrogate_chain_length$.getGlobalValue())) {
            return NIL;
        }
        {
            SubLObject cdolist_list_var = ar_concept_parts(concept);
            SubLObject part = NIL;
            for (part = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , part = cdolist_list_var.first()) {
                if (NIL != ar_concept_dependent_on_surrogate_p(part, add(ONE_INTEGER, depth))) {
                    return T;
                }
            }
        }
        return NIL;
    }

    public static SubLObject ar_concept_dependent_on_surrogate_p(final SubLObject concept, SubLObject depth) {
        if (depth == UNPROVIDED) {
            depth = ZERO_INTEGER;
        }
        if (NIL != ar_surrogate_concept_p(concept)) {
            return T;
        }
        if (depth.numG($max_surrogate_chain_length$.getGlobalValue())) {
            return NIL;
        }
        SubLObject cdolist_list_var = ar_concept_parts(concept);
        SubLObject part = NIL;
        part = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != ar_concept_dependent_on_surrogate_p(part, add(ONE_INTEGER, depth))) {
                return T;
            }
            cdolist_list_var = cdolist_list_var.rest();
            part = cdolist_list_var.first();
        } 
        return NIL;
    }

    public static final SubLObject current_ar_concept_grounding_map_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return $ar_concept_grounding_map$.getDynamicValue(thread);
        }
    }

    public static SubLObject current_ar_concept_grounding_map() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return $ar_concept_grounding_map$.getDynamicValue(thread);
    }

    public static final SubLObject ensure_ar_concept_grounding_map_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == dictionary.dictionary_p($ar_concept_grounding_map$.getDynamicValue(thread))) {
                $ar_concept_grounding_map$.setDynamicValue(dictionary.new_dictionary(UNPROVIDED, UNPROVIDED), thread);
            }
            return current_ar_concept_grounding_map();
        }
    }

    public static SubLObject ensure_ar_concept_grounding_map() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == dictionary.dictionary_p($ar_concept_grounding_map$.getDynamicValue(thread))) {
            $ar_concept_grounding_map$.setDynamicValue(dictionary.new_dictionary(UNPROVIDED, UNPROVIDED), thread);
        }
        return current_ar_concept_grounding_map();
    }

    public static final SubLObject with_new_ar_concept_grounding_map_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject body = current;
            return list(CLET, $list_alt236, $list_alt237, bq_cons(PROGN, append(body, NIL)));
        }
    }

    public static SubLObject with_new_ar_concept_grounding_map(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return list(CLET, $list257, $list258, bq_cons(PROGN, append(body, NIL)));
    }

    public static final SubLObject ar_concept_grounding_computedP_alt(SubLObject map, SubLObject concept) {
        {
            SubLObject mark = dictionary.dictionary_lookup(map, concept, UNPROVIDED);
            return makeBoolean(($GROUNDED == mark) || ($UNGROUNDED == mark));
        }
    }

    public static SubLObject ar_concept_grounding_computedP(final SubLObject map, final SubLObject concept) {
        final SubLObject mark = dictionary.dictionary_lookup(map, concept, UNPROVIDED);
        return makeBoolean(($GROUNDED == mark) || ($UNGROUNDED == mark));
    }

    public static final SubLObject ar_concept_grounding_groundedP_alt(SubLObject map, SubLObject concept) {
        return eq($GROUNDED, dictionary.dictionary_lookup(map, concept, UNPROVIDED));
    }

    public static SubLObject ar_concept_grounding_groundedP(final SubLObject map, final SubLObject concept) {
        return eq($GROUNDED, dictionary.dictionary_lookup(map, concept, UNPROVIDED));
    }

    public static final SubLObject ar_concept_grounding_ungroundedP_alt(SubLObject map, SubLObject concept) {
        return eq($UNGROUNDED, dictionary.dictionary_lookup(map, concept, UNPROVIDED));
    }

    public static SubLObject ar_concept_grounding_ungroundedP(final SubLObject map, final SubLObject concept) {
        return eq($UNGROUNDED, dictionary.dictionary_lookup(map, concept, UNPROVIDED));
    }

    public static final SubLObject ar_concept_grounding_in_progressP_alt(SubLObject map, SubLObject concept) {
        return eq($IN_PROGRESS, dictionary.dictionary_lookup(map, concept, UNPROVIDED));
    }

    public static SubLObject ar_concept_grounding_in_progressP(final SubLObject map, final SubLObject concept) {
        return eq($IN_PROGRESS, dictionary.dictionary_lookup(map, concept, UNPROVIDED));
    }

    public static final SubLObject ar_concept_grounding_map_mark_alt(SubLObject map, SubLObject concept, SubLObject mark) {
        return dictionary.dictionary_enter(map, concept, mark);
    }

    public static SubLObject ar_concept_grounding_map_mark(final SubLObject map, final SubLObject concept, final SubLObject mark) {
        return dictionary.dictionary_enter(map, concept, mark);
    }

    public static final SubLObject ar_concept_dependent_on_ungrounded_surrogate_p_alt(SubLObject concept) {
        return makeBoolean(!ar_concept_dependent_on_ungrounded_surrogate_count(concept).isZero());
    }

    public static SubLObject ar_concept_dependent_on_ungrounded_surrogate_p(final SubLObject concept) {
        return makeBoolean(!ar_concept_dependent_on_ungrounded_surrogate_count(concept).isZero());
    }

    /**
     * is there a way through parsing this concept that will lead to real cycl?  If so, return nil, otherwise T
     *
     * @param CONCEPT
    ar-concept
     * 		
     * @return boolean
     */
    @LispMethod(comment = "is there a way through parsing this concept that will lead to real cycl?  If so, return nil, otherwise T\r\n\r\n@param CONCEPT\nar-concept\r\n\t\t\r\n@return boolean")
    public static final SubLObject ar_concept_dependent_on_ungrounded_surrogate_count_alt(SubLObject concept) {
        SubLTrampolineFile.checkType(concept, AR_CONCEPT_P);
        ensure_ar_concept_grounding_map();
        {
            SubLObject map = current_ar_concept_grounding_map();
            SubLObject cycl = ar_concept_cycl(concept);
            if (NIL == cycl_utilities.expression_find($$TheResultOfParsing, cycl, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                ar_concept_grounding_map_mark(map, concept, $GROUNDED);
                return ZERO_INTEGER;
            }
            if (NIL != ar_concept_grounding_computedP(map, concept)) {
                return NIL != ar_concept_grounding_ungroundedP(map, concept) ? ((SubLObject) (ONE_INTEGER)) : ZERO_INTEGER;
            } else {
                if (NIL != ar_concept_grounding_in_progressP(map, concept)) {
                    ar_concept_grounding_map_mark(map, concept, $UNGROUNDED);
                    return $ar_concept_cycle_count$.getGlobalValue();
                }
            }
            ar_concept_grounding_map_mark(map, concept, $IN_PROGRESS);
            if (NIL != parsing_utilities.result_of_parsing_formulaP(cycl)) {
                {
                    SubLObject groundedP = NIL;
                    if (NIL == groundedP) {
                        {
                            SubLObject csome_list_var = ar_concept_phrases(concept);
                            SubLObject phrase = NIL;
                            for (phrase = csome_list_var.first(); !((NIL != groundedP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , phrase = csome_list_var.first()) {
                                groundedP = makeBoolean(NIL == ar_phrase_dependent_on_ungrounded_surrogate_p(phrase));
                            }
                        }
                    }
                    {
                        SubLObject value = (NIL != groundedP) ? ((SubLObject) (ZERO_INTEGER)) : ONE_INTEGER;
                        SubLObject mark = (NIL != groundedP) ? ((SubLObject) ($GROUNDED)) : $UNGROUNDED;
                        ar_concept_grounding_map_mark(map, concept, mark);
                        return value;
                    }
                }
            }
            {
                SubLObject ungrounded_part_count = ZERO_INTEGER;
                SubLObject cdolist_list_var = ar_concept_parts(concept);
                SubLObject part = NIL;
                for (part = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , part = cdolist_list_var.first()) {
                    if (NIL != ar_concept_dependent_on_ungrounded_surrogate_p(part)) {
                        ungrounded_part_count = add(ungrounded_part_count, ONE_INTEGER);
                    }
                }
                ar_concept_grounding_map_mark(map, concept, ungrounded_part_count.isZero() ? ((SubLObject) ($GROUNDED)) : $UNGROUNDED);
                return ungrounded_part_count;
            }
        }
    }

    @LispMethod(comment = "is there a way through parsing this concept that will lead to real cycl?  If so, return nil, otherwise T\r\n\r\n@param CONCEPT\n\t\tar-concept\r\n\t\t\r\n@return boolean")
    public static SubLObject ar_concept_dependent_on_ungrounded_surrogate_count(final SubLObject concept) {
        assert NIL != ar_concept_p(concept) : "! rkf_assisted_reader.ar_concept_p(concept) " + ("rkf_assisted_reader.ar_concept_p(concept) " + "CommonSymbols.NIL != rkf_assisted_reader.ar_concept_p(concept) ") + concept;
        ensure_ar_concept_grounding_map();
        final SubLObject map = current_ar_concept_grounding_map();
        final SubLObject cycl = ar_concept_cycl(concept);
        if (NIL == cycl_utilities.expression_find($$TheResultOfParsing, cycl, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
            ar_concept_grounding_map_mark(map, concept, $GROUNDED);
            return ZERO_INTEGER;
        }
        if (NIL != ar_concept_grounding_computedP(map, concept)) {
            return NIL != ar_concept_grounding_ungroundedP(map, concept) ? ONE_INTEGER : ZERO_INTEGER;
        }
        if (NIL != ar_concept_grounding_in_progressP(map, concept)) {
            ar_concept_grounding_map_mark(map, concept, $UNGROUNDED);
            return $ar_concept_cycle_count$.getGlobalValue();
        }
        ar_concept_grounding_map_mark(map, concept, $IN_PROGRESS);
        if (NIL != parsing_utilities.result_of_parsing_formulaP(cycl)) {
            SubLObject groundedP = NIL;
            if (NIL == groundedP) {
                SubLObject csome_list_var;
                SubLObject phrase;
                for (csome_list_var = ar_concept_phrases(concept), phrase = NIL, phrase = csome_list_var.first(); (NIL == groundedP) && (NIL != csome_list_var); groundedP = makeBoolean(NIL == ar_phrase_dependent_on_ungrounded_surrogate_p(phrase)) , csome_list_var = csome_list_var.rest() , phrase = csome_list_var.first()) {
                }
            }
            final SubLObject value = (NIL != groundedP) ? ZERO_INTEGER : ONE_INTEGER;
            final SubLObject mark = (NIL != groundedP) ? $GROUNDED : $UNGROUNDED;
            ar_concept_grounding_map_mark(map, concept, mark);
            return value;
        }
        SubLObject ungrounded_part_count = ZERO_INTEGER;
        SubLObject cdolist_list_var = ar_concept_parts(concept);
        SubLObject part = NIL;
        part = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != ar_concept_dependent_on_ungrounded_surrogate_p(part)) {
                ungrounded_part_count = add(ungrounded_part_count, ONE_INTEGER);
            }
            cdolist_list_var = cdolist_list_var.rest();
            part = cdolist_list_var.first();
        } 
        ar_concept_grounding_map_mark(map, concept, ungrounded_part_count.isZero() ? $GROUNDED : $UNGROUNDED);
        return ungrounded_part_count;
    }

    /**
     * is there a way through parsing this phrase that will lead to real cycl?
     * If so, return nil, otherwise T
     *
     * @param PHRASE
    ar-phrase
     * 		
     * @return boolean
     */
    @LispMethod(comment = "is there a way through parsing this phrase that will lead to real cycl?\r\nIf so, return nil, otherwise T\r\n\r\n@param PHRASE\nar-phrase\r\n\t\t\r\n@return boolean\nis there a way through parsing this phrase that will lead to real cycl?\nIf so, return nil, otherwise T")
    public static final SubLObject ar_phrase_dependent_on_ungrounded_surrogate_p_alt(SubLObject phrase) {
        {
            SubLObject groundedP = NIL;
            if (NIL == groundedP) {
                {
                    SubLObject csome_list_var = cconcatenate(ar_phrase_rejected_concepts(phrase), ar_phrase_concepts(phrase));
                    SubLObject concept = NIL;
                    for (concept = csome_list_var.first(); !((NIL != groundedP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , concept = csome_list_var.first()) {
                        groundedP = ar_concept_dependent_on_ungrounded_surrogate_p(concept);
                        groundedP = makeBoolean(NIL == groundedP);
                    }
                }
            }
            return makeBoolean(NIL == groundedP);
        }
    }

    @LispMethod(comment = "is there a way through parsing this phrase that will lead to real cycl?\r\nIf so, return nil, otherwise T\r\n\r\n@param PHRASE\n\t\tar-phrase\r\n\t\t\r\n@return boolean\nis there a way through parsing this phrase that will lead to real cycl?\nIf so, return nil, otherwise T")
    public static SubLObject ar_phrase_dependent_on_ungrounded_surrogate_p(final SubLObject phrase) {
        SubLObject groundedP = NIL;
        if (NIL == groundedP) {
            SubLObject csome_list_var;
            SubLObject concept;
            for (csome_list_var = cconcatenate(ar_phrase_rejected_concepts(phrase), ar_phrase_concepts(phrase)), concept = NIL, concept = csome_list_var.first(); (NIL == groundedP) && (NIL != csome_list_var); groundedP = ar_concept_dependent_on_ungrounded_surrogate_p(concept) , groundedP = makeBoolean(NIL == groundedP) , csome_list_var = csome_list_var.rest() , concept = csome_list_var.first()) {
            }
        }
        return makeBoolean(NIL == groundedP);
    }

    public static final SubLObject ar_phrase_divide_eq_best_lambda_substitute_alt(SubLObject num) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return eq(num, $ar_divide_best$.getDynamicValue(thread));
        }
    }

    public static SubLObject ar_phrase_divide_eq_best_lambda_substitute(final SubLObject num) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return eq(num, $ar_divide_best$.getDynamicValue(thread));
    }

    /**
     *
     *
     * @param PHRASE
    ar-phrase
     * 		
     * @param INDEXICALS
     * 		list; an indexical map
     * @return 0 list; a list of likely concepts for the phrase
     * @return 1 list; a list of unlikely concepts for the phrase
    sort the concepts (several times), then divide them up
     */
    @LispMethod(comment = "@param PHRASE\nar-phrase\r\n\t\t\r\n@param INDEXICALS\r\n\t\tlist; an indexical map\r\n@return 0 list; a list of likely concepts for the phrase\r\n@return 1 list; a list of unlikely concepts for the phrase\r\nsort the concepts (several times), then divide them up")
    public static final SubLObject ar_phrase_divide_concepts_alt(SubLObject phrase, SubLObject indexicals) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject likely = NIL;
                SubLObject unlikely = NIL;
                SubLObject sorted = NIL;
                SubLObject nthfn_terms = NIL;
                if (NIL == ar_phrase_concepts(phrase)) {
                    return values(NIL, NIL);
                }
                sorted = Sort.stable_sort(copy_list(ar_phrase_concepts(phrase)), $sym225$_, AR_CONCEPT_CONFIDENCE);
                sorted = Sort.stable_sort(sorted, $sym244$_, AR_CONCEPT_COMPLEXITY);
                sorted = Sort.stable_sort(sorted, $sym225$_, AR_CONCEPT_OPEN_TERM_SCORE);
                if (NIL != indexicals) {
                    {
                        SubLObject temp_rest = NIL;
                        SubLObject cdolist_list_var = sorted;
                        SubLObject concept = NIL;
                        for (concept = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , concept = cdolist_list_var.first()) {
                            if (NIL != rkf_ar_concept_is_nthfn_termP(concept)) {
                                nthfn_terms = cons(concept, nthfn_terms);
                            } else {
                                temp_rest = cons(concept, temp_rest);
                            }
                        }
                        if (NIL != nthfn_terms) {
                            likely = nreverse(nthfn_terms);
                            unlikely = nreverse(temp_rest);
                        }
                    }
                }
                if (NIL == likely) {
                    {
                        SubLObject _prev_bind_0 = $ar_divide_best$.currentBinding(thread);
                        try {
                            $ar_divide_best$.bind(ar_concept_open_term_score(sorted.first()), thread);
                            {
                                SubLObject best_index = list_utilities.position_if_not(AR_PHRASE_DIVIDE_EQ_BEST_LAMBDA_SUBSTITUTE, sorted, AR_CONCEPT_OPEN_TERM_SCORE, UNPROVIDED, UNPROVIDED);
                                if (NIL != best_index) {
                                    likely = subseq(sorted, ZERO_INTEGER, best_index);
                                    unlikely = subseq(sorted, best_index, UNPROVIDED);
                                } else {
                                    likely = sorted;
                                    unlikely = NIL;
                                }
                                thread.resetMultipleValues();
                                {
                                    SubLObject v_forts = ar_concept_separate_out_forts(likely);
                                    SubLObject others = thread.secondMultipleValue();
                                    thread.resetMultipleValues();
                                    if (NIL != others) {
                                        likely = v_forts;
                                        unlikely = cconcatenate(others, unlikely);
                                    }
                                }
                            }
                        } finally {
                            $ar_divide_best$.rebind(_prev_bind_0, thread);
                        }
                    }
                }
                return values(likely, unlikely);
            }
        }
    }

    /**
     *
     *
     * @param PHRASE
    ar-phrase
     * 		
     * @param INDEXICALS
     * 		list; an indexical map
     * @return 0 list; a list of likely concepts for the phrase
     * @return 1 list; a list of unlikely concepts for the phrase
    sort the concepts (several times), then divide them up
     */
    @LispMethod(comment = "@param PHRASE\nar-phrase\r\n\t\t\r\n@param INDEXICALS\r\n\t\tlist; an indexical map\r\n@return 0 list; a list of likely concepts for the phrase\r\n@return 1 list; a list of unlikely concepts for the phrase\r\nsort the concepts (several times), then divide them up")
    public static SubLObject ar_phrase_divide_concepts(final SubLObject phrase, final SubLObject indexicals) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject likely = NIL;
        SubLObject unlikely = NIL;
        SubLObject sorted = NIL;
        SubLObject nthfn_terms = NIL;
        if (NIL == ar_phrase_concepts(phrase)) {
            return values(NIL, NIL);
        }
        sorted = Sort.stable_sort(copy_list(ar_phrase_concepts(phrase)), $sym246$_, AR_CONCEPT_CONFIDENCE);
        sorted = Sort.stable_sort(sorted, $sym265$_, AR_CONCEPT_COMPLEXITY);
        sorted = Sort.stable_sort(sorted, $sym246$_, AR_CONCEPT_OPEN_TERM_SCORE);
        if (NIL != indexicals) {
            SubLObject temp_rest = NIL;
            SubLObject cdolist_list_var = sorted;
            SubLObject concept = NIL;
            concept = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if (NIL != rkf_ar_concept_is_nthfn_termP(concept)) {
                    nthfn_terms = cons(concept, nthfn_terms);
                } else {
                    temp_rest = cons(concept, temp_rest);
                }
                cdolist_list_var = cdolist_list_var.rest();
                concept = cdolist_list_var.first();
            } 
            if (NIL != nthfn_terms) {
                likely = nreverse(nthfn_terms);
                unlikely = nreverse(temp_rest);
            }
        }
        if (NIL == likely) {
            final SubLObject _prev_bind_0 = $ar_divide_best$.currentBinding(thread);
            try {
                $ar_divide_best$.bind(ar_concept_open_term_score(sorted.first()), thread);
                final SubLObject best_index = list_utilities.position_if_not(AR_PHRASE_DIVIDE_EQ_BEST_LAMBDA_SUBSTITUTE, sorted, AR_CONCEPT_OPEN_TERM_SCORE, UNPROVIDED, UNPROVIDED);
                if (NIL != best_index) {
                    likely = subseq(sorted, ZERO_INTEGER, best_index);
                    unlikely = subseq(sorted, best_index, UNPROVIDED);
                } else {
                    likely = sorted;
                    unlikely = NIL;
                }
                thread.resetMultipleValues();
                final SubLObject v_forts = ar_concept_separate_out_forts(likely);
                final SubLObject others = thread.secondMultipleValue();
                thread.resetMultipleValues();
                if (NIL != others) {
                    likely = v_forts;
                    unlikely = cconcatenate(others, unlikely);
                }
            } finally {
                $ar_divide_best$.rebind(_prev_bind_0, thread);
            }
        }
        return values(likely, unlikely);
    }

    /**
     * if some of the terms are forts (or formulas for forts), return them first. If there are no forts,
     * return everything as the preferred value.
     *
     * @param TERMS
     * 		list; list of cycl terms
     * @return 0 list; the preferred terms
     * @return 1 list; the dis-preferred terms
     */
    @LispMethod(comment = "if some of the terms are forts (or formulas for forts), return them first. If there are no forts,\r\nreturn everything as the preferred value.\r\n\r\n@param TERMS\r\n\t\tlist; list of cycl terms\r\n@return 0 list; the preferred terms\r\n@return 1 list; the dis-preferred terms\nif some of the terms are forts (or formulas for forts), return them first. If there are no forts,\nreturn everything as the preferred value.")
    public static final SubLObject ar_concept_separate_out_forts_alt(SubLObject terms) {
        {
            SubLObject v_forts = NIL;
            SubLObject others = NIL;
            SubLObject cdolist_list_var = terms;
            SubLObject v_term = NIL;
            for (v_term = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , v_term = cdolist_list_var.first()) {
                {
                    SubLObject term_cycl = parsing_utilities.strip_nl_tags(ar_concept_cycl(v_term), UNPROVIDED);
                    if (((NIL != forts.fort_p(term_cycl)) || term_cycl.isNumber()) || ((NIL != function_terms.nat_formula_p(term_cycl)) && (NIL != narts_high.find_nart(term_cycl)))) {
                        v_forts = cons(v_term, v_forts);
                    } else {
                        others = cons(v_term, others);
                    }
                }
            }
            if (NIL != v_forts) {
                return values(nreverse(v_forts), nreverse(others));
            } else {
                return values(nreverse(others), NIL);
            }
        }
    }

    @LispMethod(comment = "if some of the terms are forts (or formulas for forts), return them first. If there are no forts,\r\nreturn everything as the preferred value.\r\n\r\n@param TERMS\r\n\t\tlist; list of cycl terms\r\n@return 0 list; the preferred terms\r\n@return 1 list; the dis-preferred terms\nif some of the terms are forts (or formulas for forts), return them first. If there are no forts,\nreturn everything as the preferred value.")
    public static SubLObject ar_concept_separate_out_forts(final SubLObject terms) {
        SubLObject v_forts = NIL;
        SubLObject others = NIL;
        SubLObject cdolist_list_var = terms;
        SubLObject v_term = NIL;
        v_term = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject term_cycl = parsing_utilities.strip_nl_tags(ar_concept_cycl(v_term), UNPROVIDED);
            if (((NIL != forts.fort_p(term_cycl)) || term_cycl.isNumber()) || ((NIL != function_terms.nat_formula_p(term_cycl)) && (NIL != narts_high.find_nart(term_cycl)))) {
                v_forts = cons(v_term, v_forts);
            } else {
                others = cons(v_term, others);
            }
            cdolist_list_var = cdolist_list_var.rest();
            v_term = cdolist_list_var.first();
        } 
        if (NIL != v_forts) {
            return values(nreverse(v_forts), nreverse(others));
        }
        return values(nreverse(others), NIL);
    }

    /**
     *
     *
     * @param CONCEPT
    ar-concept
     * 		
     * @return INTEGER the complexity of the cycl for the concept
     */
    @LispMethod(comment = "@param CONCEPT\nar-concept\r\n\t\t\r\n@return INTEGER the complexity of the cycl for the concept")
    public static final SubLObject ar_concept_complexity_alt(SubLObject concept) {
        return ar_formula_complexity(ar_concept_cycl(concept));
    }

    /**
     *
     *
     * @param CONCEPT
    ar-concept
     * 		
     * @return INTEGER the complexity of the cycl for the concept
     */
    @LispMethod(comment = "@param CONCEPT\nar-concept\r\n\t\t\r\n@return INTEGER the complexity of the cycl for the concept")
    public static SubLObject ar_concept_complexity(final SubLObject concept) {
        return ar_formula_complexity(ar_concept_cycl(concept));
    }

    /**
     * find the complexity of a formula--for now this is just the nesting-depth
     * of the formula
     */
    @LispMethod(comment = "find the complexity of a formula--for now this is just the nesting-depth\r\nof the formula\nfind the complexity of a formula--for now this is just the nesting-depth\nof the formula")
    public static final SubLObject ar_formula_complexity_alt(SubLObject formula) {
        if (NIL != forts.fort_p(formula)) {
            return ONE_INTEGER;
        }
        {
            SubLObject highest_complexity = ZERO_INTEGER;
            SubLObject term_complexity = NIL;
            SubLObject cdolist_list_var = cycl_utilities.formula_terms(formula, UNPROVIDED);
            SubLObject v_term = NIL;
            for (v_term = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , v_term = cdolist_list_var.first()) {
                term_complexity = ar_formula_complexity(v_term);
                if (term_complexity.numG(highest_complexity)) {
                    highest_complexity = term_complexity;
                }
            }
            return number_utilities.f_1X(highest_complexity);
        }
    }

    @LispMethod(comment = "find the complexity of a formula--for now this is just the nesting-depth\r\nof the formula\nfind the complexity of a formula--for now this is just the nesting-depth\nof the formula")
    public static SubLObject ar_formula_complexity(final SubLObject formula) {
        if (NIL != forts.fort_p(formula)) {
            return ONE_INTEGER;
        }
        SubLObject highest_complexity = ZERO_INTEGER;
        SubLObject term_complexity = NIL;
        SubLObject cdolist_list_var = cycl_utilities.formula_terms(formula, UNPROVIDED);
        SubLObject v_term = NIL;
        v_term = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            term_complexity = ar_formula_complexity(v_term);
            if (term_complexity.numG(highest_complexity)) {
                highest_complexity = term_complexity;
            }
            cdolist_list_var = cdolist_list_var.rest();
            v_term = cdolist_list_var.first();
        } 
        return number_utilities.f_1X(highest_complexity);
    }

    /**
     * Compute a set of constraints for the unknown phrase based on the
     * superset of parses that the phrase participates in. Return that
     * constraint formula to the caller.
     */
    @LispMethod(comment = "Compute a set of constraints for the unknown phrase based on the\r\nsuperset of parses that the phrase participates in. Return that\r\nconstraint formula to the caller.\nCompute a set of constraints for the unknown phrase based on the\nsuperset of parses that the phrase participates in. Return that\nconstraint formula to the caller.")
    public static final SubLObject ar_phrase_constraints_for_unknown_alt(SubLObject state, SubLObject unknown_phrase, SubLObject domain_mt) {
        {
            SubLObject surrogates = ar_phrase_surrogate(unknown_phrase);
            SubLObject isas = NIL;
            SubLObject v_genls = NIL;
            SubLObject cdolist_list_var = surrogates;
            SubLObject surrogate = NIL;
            for (surrogate = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , surrogate = cdolist_list_var.first()) {
                {
                    SubLObject cdolist_list_var_4 = ar_concept_agglomerations(surrogate);
                    SubLObject agglomerated = NIL;
                    for (agglomerated = cdolist_list_var_4.first(); NIL != cdolist_list_var_4; cdolist_list_var_4 = cdolist_list_var_4.rest() , agglomerated = cdolist_list_var_4.first()) {
                        if (NIL != subl_promotions.memberP(agglomerated, ar_state_pending_concepts(state), UNPROVIDED, UNPROVIDED)) {
                            {
                                SubLObject formula = ar_concept_cycl(agglomerated);
                                SubLObject v_term = ar_concept_cycl(surrogate);
                                SubLObject constrained_by = rkf_tools.rkf_type_constraints(v_term, formula, domain_mt);
                                if (NIL == el_conjunction_p(constrained_by)) {
                                    constrained_by = simplifier.nconjoin(list(constrained_by), UNPROVIDED);
                                }
                                {
                                    SubLObject args = cycl_utilities.formula_args(constrained_by, $IGNORE);
                                    SubLObject cdolist_list_var_5 = args;
                                    SubLObject conjunct = NIL;
                                    for (conjunct = cdolist_list_var_5.first(); NIL != cdolist_list_var_5; cdolist_list_var_5 = cdolist_list_var_5.rest() , conjunct = cdolist_list_var_5.first()) {
                                        if ($$isa.equal(cycl_utilities.formula_arg0(conjunct))) {
                                            {
                                                SubLObject collection = cycl_utilities.formula_arg2(conjunct, UNPROVIDED);
                                                if (NIL == rkf_relevance_utilities.rkf_irrelevant_arg_constraint(collection, domain_mt)) {
                                                    {
                                                        SubLObject item_var = collection;
                                                        if (NIL == member(item_var, isas, symbol_function(EQL), symbol_function(IDENTITY))) {
                                                            isas = cons(item_var, isas);
                                                        }
                                                    }
                                                }
                                            }
                                        } else {
                                            if ($$genls.equal(cycl_utilities.formula_arg0(conjunct))) {
                                                {
                                                    SubLObject collection = cycl_utilities.formula_arg2(conjunct, UNPROVIDED);
                                                    if (NIL == rkf_relevance_utilities.rkf_irrelevant_arg_constraint(collection, domain_mt)) {
                                                        {
                                                            SubLObject item_var = collection;
                                                            if (NIL == member(item_var, v_genls, symbol_function(EQL), symbol_function(IDENTITY))) {
                                                                v_genls = cons(item_var, v_genls);
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
            }
            return values(isas, v_genls);
        }
    }

    @LispMethod(comment = "Compute a set of constraints for the unknown phrase based on the\r\nsuperset of parses that the phrase participates in. Return that\r\nconstraint formula to the caller.\nCompute a set of constraints for the unknown phrase based on the\nsuperset of parses that the phrase participates in. Return that\nconstraint formula to the caller.")
    public static SubLObject ar_phrase_constraints_for_unknown(final SubLObject state, final SubLObject unknown_phrase, final SubLObject domain_mt) {
        final SubLObject surrogates = ar_phrase_surrogate(unknown_phrase);
        SubLObject isas = NIL;
        SubLObject v_genls = NIL;
        SubLObject cdolist_list_var = surrogates;
        SubLObject surrogate = NIL;
        surrogate = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject cdolist_list_var_$4 = ar_concept_agglomerations(surrogate);
            SubLObject agglomerated = NIL;
            agglomerated = cdolist_list_var_$4.first();
            while (NIL != cdolist_list_var_$4) {
                if (NIL != subl_promotions.memberP(agglomerated, ar_state_pending_concepts(state), UNPROVIDED, UNPROVIDED)) {
                    final SubLObject formula = ar_concept_cycl(agglomerated);
                    final SubLObject v_term = ar_concept_cycl(surrogate);
                    SubLObject constrained_by = rkf_tools.rkf_type_constraints(v_term, formula, domain_mt);
                    if (NIL == el_conjunction_p(constrained_by)) {
                        constrained_by = simplifier.nconjoin(list(constrained_by), UNPROVIDED);
                    }
                    SubLObject cdolist_list_var_$5;
                    final SubLObject args = cdolist_list_var_$5 = cycl_utilities.formula_args(constrained_by, $IGNORE);
                    SubLObject conjunct = NIL;
                    conjunct = cdolist_list_var_$5.first();
                    while (NIL != cdolist_list_var_$5) {
                        if ($$isa.equal(cycl_utilities.formula_arg0(conjunct))) {
                            final SubLObject collection = cycl_utilities.formula_arg2(conjunct, UNPROVIDED);
                            if (NIL == rkf_relevance_utilities.rkf_irrelevant_arg_constraint(collection, domain_mt)) {
                                final SubLObject item_var = collection;
                                if (NIL == member(item_var, isas, symbol_function(EQL), symbol_function(IDENTITY))) {
                                    isas = cons(item_var, isas);
                                }
                            }
                        } else
                            if ($$genls.equal(cycl_utilities.formula_arg0(conjunct))) {
                                final SubLObject collection = cycl_utilities.formula_arg2(conjunct, UNPROVIDED);
                                if (NIL == rkf_relevance_utilities.rkf_irrelevant_arg_constraint(collection, domain_mt)) {
                                    final SubLObject item_var = collection;
                                    if (NIL == member(item_var, v_genls, symbol_function(EQL), symbol_function(IDENTITY))) {
                                        v_genls = cons(item_var, v_genls);
                                    }
                                }
                            }

                        cdolist_list_var_$5 = cdolist_list_var_$5.rest();
                        conjunct = cdolist_list_var_$5.first();
                    } 
                }
                cdolist_list_var_$4 = cdolist_list_var_$4.rest();
                agglomerated = cdolist_list_var_$4.first();
            } 
            cdolist_list_var = cdolist_list_var.rest();
            surrogate = cdolist_list_var.first();
        } 
        return values(isas, v_genls);
    }

    public static final SubLObject rkf_ar_act_add_source_texts_background_alt(SubLObject state, SubLObject texts) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            subl_promotions.make_process_with_args($$$Assisted_Reader_reading_texts, symbol_function(RKF_AR_ACT_ADD_SOURCE_TEXTS_BACKGROUND_INTERNAL), list(state, texts, $rkf_ar_parsing_mt$.getDynamicValue(thread)));
            return NIL;
        }
    }

    public static SubLObject rkf_ar_act_add_source_texts_background(final SubLObject state, final SubLObject texts) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        subl_promotions.make_process_with_args($$$Assisted_Reader_reading_texts, symbol_function(RKF_AR_ACT_ADD_SOURCE_TEXTS_BACKGROUND_INTERNAL), list(state, texts, $rkf_ar_parsing_mt$.getDynamicValue(thread)));
        return NIL;
    }

    public static final SubLObject rkf_ar_act_add_source_texts_background_internal_alt(SubLObject state, SubLObject texts, SubLObject mt) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject ignore_errors_tag = NIL;
                try {
                    {
                        SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
                        try {
                            Errors.$error_handler$.bind(symbol_function(IGNORE_ERRORS_HANDLER), thread);
                            try {
                                SubLTrampolineFile.checkType(mt, HLMT_P);
                                {
                                    SubLObject _prev_bind_0_6 = $rkf_ar_parsing_mt$.currentBinding(thread);
                                    try {
                                        $rkf_ar_parsing_mt$.bind(mt, thread);
                                        rkf_ar_act_add_source_texts(state, texts);
                                    } finally {
                                        $rkf_ar_parsing_mt$.rebind(_prev_bind_0_6, thread);
                                    }
                                }
                            } catch (Throwable catch_var) {
                                Errors.handleThrowable(catch_var, NIL);
                            }
                        } finally {
                            Errors.$error_handler$.rebind(_prev_bind_0, thread);
                        }
                    }
                } catch (Throwable ccatch_env_var) {
                    ignore_errors_tag = Errors.handleThrowable(ccatch_env_var, $IGNORE_ERRORS_TARGET);
                }
            }
            return NIL;
        }
    }

    public static SubLObject rkf_ar_act_add_source_texts_background_internal(final SubLObject state, final SubLObject texts, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ignore_errors_tag = NIL;
        try {
            thread.throwStack.push($IGNORE_ERRORS_TARGET);
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind(symbol_function(IGNORE_ERRORS_HANDLER), thread);
                try {
                    assert NIL != hlmt.hlmt_p(mt) : "! hlmt.hlmt_p(mt) " + ("hlmt.hlmt_p(mt) " + "CommonSymbols.NIL != hlmt.hlmt_p(mt) ") + mt;
                    final SubLObject _prev_bind_0_$6 = $rkf_ar_parsing_mt$.currentBinding(thread);
                    try {
                        $rkf_ar_parsing_mt$.bind(mt, thread);
                        rkf_ar_act_add_source_texts(state, texts);
                    } finally {
                        $rkf_ar_parsing_mt$.rebind(_prev_bind_0_$6, thread);
                    }
                } catch (final Throwable catch_var) {
                    Errors.handleThrowable(catch_var, NIL);
                }
            } finally {
                Errors.$error_handler$.rebind(_prev_bind_0, thread);
            }
        } catch (final Throwable ccatch_env_var) {
            ignore_errors_tag = Errors.handleThrowable(ccatch_env_var, $IGNORE_ERRORS_TARGET);
        } finally {
            thread.throwStack.pop();
        }
        return NIL;
    }

    public static final SubLObject rkf_ar_act_add_source_texts_alt(SubLObject state, SubLObject texts) {
        SubLTrampolineFile.checkType(state, AR_STATE_P);
        SubLTrampolineFile.checkType(texts, LISTP);
        {
            SubLObject cdolist_list_var = texts;
            SubLObject text = NIL;
            for (text = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , text = cdolist_list_var.first()) {
                rkf_ar_act_add_source_text(state, text, UNPROVIDED);
            }
        }
        return NIL;
    }

    public static SubLObject rkf_ar_act_add_source_texts(final SubLObject state, final SubLObject texts) {
        assert NIL != ar_state_p(state) : "! rkf_assisted_reader.ar_state_p(state) " + ("rkf_assisted_reader.ar_state_p(state) " + "CommonSymbols.NIL != rkf_assisted_reader.ar_state_p(state) ") + state;
        assert NIL != listp(texts) : "! listp(texts) " + ("Types.listp(texts) " + "CommonSymbols.NIL != Types.listp(texts) ") + texts;
        SubLObject cdolist_list_var = texts;
        SubLObject text = NIL;
        text = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            rkf_ar_act_add_source_text(state, text, UNPROVIDED);
            cdolist_list_var = cdolist_list_var.rest();
            text = cdolist_list_var.first();
        } 
        return NIL;
    }

    public static final SubLObject rkf_ar_act_add_rewrite_texts_background_alt(SubLObject state, SubLObject sentence, SubLObject texts) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != texts) {
                {
                    SubLObject first_text = texts.first();
                    SubLObject rest_texts = texts.rest();
                    SubLObject rewrite = rkf_ar_act_add_rewrite_text(state, first_text, sentence);
                    rkf_ar_act_focus_sentence(state, rewrite);
                    if (NIL != rest_texts) {
                        subl_promotions.make_process_with_args($str_alt255$Assisted_Reader_rewriting_a_sente, symbol_function(RKF_AR_ACT_ADD_REWRITE_TEXTS_BACKGROUND_INTERNAL), list(state, sentence, rest_texts, $rkf_ar_parsing_mt$.getDynamicValue(thread)));
                    }
                }
            }
            return NIL;
        }
    }

    public static SubLObject rkf_ar_act_add_rewrite_texts_background(final SubLObject state, final SubLObject sentence, final SubLObject texts) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != texts) {
            final SubLObject first_text = texts.first();
            final SubLObject rest_texts = texts.rest();
            final SubLObject rewrite = rkf_ar_act_add_rewrite_text(state, first_text, sentence);
            rkf_ar_act_focus_sentence(state, rewrite);
            if (NIL != rest_texts) {
                subl_promotions.make_process_with_args($str276$Assisted_Reader_rewriting_a_sente, symbol_function(RKF_AR_ACT_ADD_REWRITE_TEXTS_BACKGROUND_INTERNAL), list(state, sentence, rest_texts, $rkf_ar_parsing_mt$.getDynamicValue(thread)));
            }
        }
        return NIL;
    }

    public static final SubLObject rkf_ar_act_add_rewrite_texts_background_internal_alt(SubLObject state, SubLObject sentence, SubLObject texts, SubLObject mt) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject ignore_errors_tag = NIL;
                try {
                    {
                        SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
                        try {
                            Errors.$error_handler$.bind(symbol_function(IGNORE_ERRORS_HANDLER), thread);
                            try {
                                SubLTrampolineFile.checkType(mt, HLMT_P);
                                {
                                    SubLObject _prev_bind_0_7 = $rkf_ar_parsing_mt$.currentBinding(thread);
                                    try {
                                        $rkf_ar_parsing_mt$.bind(mt, thread);
                                        rkf_ar_act_add_rewrite_texts(state, sentence, texts);
                                    } finally {
                                        $rkf_ar_parsing_mt$.rebind(_prev_bind_0_7, thread);
                                    }
                                }
                            } catch (Throwable catch_var) {
                                Errors.handleThrowable(catch_var, NIL);
                            }
                        } finally {
                            Errors.$error_handler$.rebind(_prev_bind_0, thread);
                        }
                    }
                } catch (Throwable ccatch_env_var) {
                    ignore_errors_tag = Errors.handleThrowable(ccatch_env_var, $IGNORE_ERRORS_TARGET);
                }
            }
            return NIL;
        }
    }

    public static SubLObject rkf_ar_act_add_rewrite_texts_background_internal(final SubLObject state, final SubLObject sentence, final SubLObject texts, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ignore_errors_tag = NIL;
        try {
            thread.throwStack.push($IGNORE_ERRORS_TARGET);
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind(symbol_function(IGNORE_ERRORS_HANDLER), thread);
                try {
                    assert NIL != hlmt.hlmt_p(mt) : "! hlmt.hlmt_p(mt) " + ("hlmt.hlmt_p(mt) " + "CommonSymbols.NIL != hlmt.hlmt_p(mt) ") + mt;
                    final SubLObject _prev_bind_0_$7 = $rkf_ar_parsing_mt$.currentBinding(thread);
                    try {
                        $rkf_ar_parsing_mt$.bind(mt, thread);
                        rkf_ar_act_add_rewrite_texts(state, sentence, texts);
                    } finally {
                        $rkf_ar_parsing_mt$.rebind(_prev_bind_0_$7, thread);
                    }
                } catch (final Throwable catch_var) {
                    Errors.handleThrowable(catch_var, NIL);
                }
            } finally {
                Errors.$error_handler$.rebind(_prev_bind_0, thread);
            }
        } catch (final Throwable ccatch_env_var) {
            ignore_errors_tag = Errors.handleThrowable(ccatch_env_var, $IGNORE_ERRORS_TARGET);
        } finally {
            thread.throwStack.pop();
        }
        return NIL;
    }

    public static final SubLObject rkf_ar_act_add_rewrite_texts_alt(SubLObject state, SubLObject sentence, SubLObject texts) {
        SubLTrampolineFile.checkType(state, AR_STATE_P);
        SubLTrampolineFile.checkType(sentence, AR_SENTENCE_P);
        SubLTrampolineFile.checkType(texts, LISTP);
        {
            SubLObject cdolist_list_var = texts;
            SubLObject text = NIL;
            for (text = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , text = cdolist_list_var.first()) {
                rkf_ar_act_add_rewrite_text(state, text, sentence);
            }
        }
        return NIL;
    }

    public static SubLObject rkf_ar_act_add_rewrite_texts(final SubLObject state, final SubLObject sentence, final SubLObject texts) {
        assert NIL != ar_state_p(state) : "! rkf_assisted_reader.ar_state_p(state) " + ("rkf_assisted_reader.ar_state_p(state) " + "CommonSymbols.NIL != rkf_assisted_reader.ar_state_p(state) ") + state;
        assert NIL != ar_sentence_p(sentence) : "! rkf_assisted_reader.ar_sentence_p(sentence) " + ("rkf_assisted_reader.ar_sentence_p(sentence) " + "CommonSymbols.NIL != rkf_assisted_reader.ar_sentence_p(sentence) ") + sentence;
        assert NIL != listp(texts) : "! listp(texts) " + ("Types.listp(texts) " + "CommonSymbols.NIL != Types.listp(texts) ") + texts;
        SubLObject cdolist_list_var = texts;
        SubLObject text = NIL;
        text = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            rkf_ar_act_add_rewrite_text(state, text, sentence);
            cdolist_list_var = cdolist_list_var.rest();
            text = cdolist_list_var.first();
        } 
        return NIL;
    }

    /**
     * Add TEXT as a new source text
     */
    @LispMethod(comment = "Add TEXT as a new source text")
    public static final SubLObject rkf_ar_act_add_source_text_alt(SubLObject state, SubLObject text, SubLObject v_parse_tree) {
        if (v_parse_tree == UNPROVIDED) {
            v_parse_tree = NIL;
        }
        return rkf_ar_act_add_text(state, text, NIL, v_parse_tree);
    }

    @LispMethod(comment = "Add TEXT as a new source text")
    public static SubLObject rkf_ar_act_add_source_text(final SubLObject state, final SubLObject text, SubLObject v_parse_tree) {
        if (v_parse_tree == UNPROVIDED) {
            v_parse_tree = NIL;
        }
        return rkf_ar_act_add_text(state, text, NIL, v_parse_tree);
    }

    /**
     * Add TEXT as one rewrite of SENTENCE
     */
    @LispMethod(comment = "Add TEXT as one rewrite of SENTENCE")
    public static final SubLObject rkf_ar_act_add_rewrite_text_alt(SubLObject state, SubLObject text, SubLObject sentence) {
        return rkf_ar_act_add_text(state, text, sentence, UNPROVIDED);
    }

    @LispMethod(comment = "Add TEXT as one rewrite of SENTENCE")
    public static SubLObject rkf_ar_act_add_rewrite_text(final SubLObject state, final SubLObject text, final SubLObject sentence) {
        return rkf_ar_act_add_text(state, text, sentence, UNPROVIDED);
    }

    /**
     * Add TEXT as a clarification of SENTENCE
     */
    @LispMethod(comment = "Add TEXT as a clarification of SENTENCE")
    public static final SubLObject rkf_ar_act_add_clarification_alt(SubLObject state, SubLObject text, SubLObject sentence) {
        {
            SubLObject clarification = rkf_ar_act_add_text(state, text, sentence, UNPROVIDED);
            rkf_ar_act_focus_sentence(state, clarification);
        }
        return NIL;
    }

    @LispMethod(comment = "Add TEXT as a clarification of SENTENCE")
    public static SubLObject rkf_ar_act_add_clarification(final SubLObject state, final SubLObject text, final SubLObject sentence) {
        final SubLObject clarification = rkf_ar_act_add_text(state, text, sentence, UNPROVIDED);
        rkf_ar_act_focus_sentence(state, clarification);
        return NIL;
    }

    public static final SubLObject rkf_ar_select_processing_method_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject pcase_var = $rkf_ar_processing_mode$.getDynamicValue(thread);
                if (pcase_var.eql($TEXT_PROCESSING)) {
                    return values($rkf_ar_text_processor$.getGlobalValue(), list($rkf_ar_parsing_mt$.getDynamicValue(thread), $rkf_ar_semantics_mt$.getDynamicValue(thread)));
                } else {
                    if (pcase_var.eql($QUESTION_PROCESSING)) {
                        return values($rkf_ar_question_processor$.getGlobalValue(), list($rkf_ar_parsing_mt$.getDynamicValue(thread), $rkf_ar_semantics_mt$.getDynamicValue(thread)));
                    } else {
                        return values($rkf_ar_concept_harvester$.getGlobalValue(), NIL);
                    }
                }
            }
        }
    }

    public static SubLObject rkf_ar_select_processing_method() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject pcase_var = $rkf_ar_processing_mode$.getDynamicValue(thread);
        if (pcase_var.eql($TEXT_PROCESSING)) {
            return values($rkf_ar_text_processor$.getGlobalValue(), list($rkf_ar_parsing_mt$.getDynamicValue(thread), $rkf_ar_semantics_mt$.getDynamicValue(thread)));
        }
        if (pcase_var.eql($QUESTION_PROCESSING)) {
            return values($rkf_ar_question_processor$.getGlobalValue(), list($rkf_ar_parsing_mt$.getDynamicValue(thread), $rkf_ar_semantics_mt$.getDynamicValue(thread)));
        }
        return values($rkf_ar_concept_harvester$.getGlobalValue(), NIL);
    }

    public static final SubLObject rkf_ar_act_process_input_sentence_alt(SubLObject text) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            thread.resetMultipleValues();
            {
                SubLObject function = rkf_ar_select_processing_method();
                SubLObject args = thread.secondMultipleValue();
                thread.resetMultipleValues();
                return values(apply(function, cons(text, args)), rkf_ar_template_category_for_processor(function));
            }
        }
    }

    public static SubLObject rkf_ar_act_process_input_sentence(final SubLObject text) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject function = rkf_ar_select_processing_method();
        final SubLObject args = thread.secondMultipleValue();
        thread.resetMultipleValues();
        return values(apply(function, cons(text, args)), rkf_ar_template_category_for_processor(function));
    }

    /**
     * What template category does FUNCTION generally parse?
     */
    @LispMethod(comment = "What template category does FUNCTION generally parse?")
    public static final SubLObject rkf_ar_template_category_for_processor_alt(SubLObject function) {
        {
            SubLObject alist = $rfk_ar_template_category_map$.getGlobalValue();
            return second(assoc(function, alist, UNPROVIDED, UNPROVIDED));
        }
    }

    @LispMethod(comment = "What template category does FUNCTION generally parse?")
    public static SubLObject rkf_ar_template_category_for_processor(final SubLObject function) {
        final SubLObject alist = $rfk_ar_template_category_map$.getGlobalValue();
        return second(assoc(function, alist, UNPROVIDED, UNPROVIDED));
    }

    public static final SubLObject rkf_ar_act_add_text_alt(SubLObject state, SubLObject text, SubLObject source_sentence, SubLObject v_parse_tree) {
        if (source_sentence == UNPROVIDED) {
            source_sentence = NIL;
        }
        if (v_parse_tree == UNPROVIDED) {
            v_parse_tree = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(state, AR_STATE_P);
            SubLTrampolineFile.checkType(text, STRINGP);
            SubLTrampolineFile.checkType(v_parse_tree, LISTP);
            {
                SubLObject sentence = new_ar_sentence(state, text);
                SubLObject new_phrases = NIL;
                SubLObject new_concepts = NIL;
                {
                    SubLObject token_strings = rkf_concept_harvester.rkf_ch_string_tokenize(text);
                    SubLObject token_list = NIL;
                    SubLObject token_number = ZERO_INTEGER;
                    SubLObject cdolist_list_var = token_strings;
                    SubLObject token_string = NIL;
                    for (token_string = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , token_string = cdolist_list_var.first()) {
                        {
                            SubLObject token = new_ar_token(state, token_string, sentence, token_number);
                            token_list = cons(token, token_list);
                            token_number = add(token_number, ONE_INTEGER);
                        }
                    }
                    token_list = nreverse(token_list);
                    {
                        SubLObject token_vector = apply(symbol_function(VECTOR), token_list);
                        note_ar_sentence_token_vector(sentence, token_vector);
                    }
                }
                thread.resetMultipleValues();
                {
                    SubLObject phrases = rkf_ar_harvest_for_phrases_and_concepts(state, sentence, text, v_parse_tree);
                    SubLObject concepts = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    new_phrases = phrases;
                    new_concepts = concepts;
                }
                rkf_ar_add_any_surrogates(state, sentence, new_concepts, new_phrases);
                new_phrases = nreverse(new_phrases);
                if (NIL != source_sentence) {
                    add_ar_sentence_clarification(source_sentence, sentence);
                    note_ar_sentence_source_sentence(sentence, source_sentence);
                } else {
                    add_ar_state_source_sentence(state, sentence);
                }
                {
                    SubLObject cdolist_list_var = new_phrases;
                    SubLObject phrase = NIL;
                    for (phrase = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , phrase = cdolist_list_var.first()) {
                        rkf_ar_act_add_phrase(state, phrase);
                    }
                }
                if (NIL != new_phrases) {
                    rkf_ar_ensure_focus_sentence(state, sentence);
                    rkf_ar_set_open_term_scores(state);
                }
                return sentence;
            }
        }
    }

    public static SubLObject rkf_ar_act_add_text(final SubLObject state, final SubLObject text, SubLObject source_sentence, SubLObject v_parse_tree) {
        if (source_sentence == UNPROVIDED) {
            source_sentence = NIL;
        }
        if (v_parse_tree == UNPROVIDED) {
            v_parse_tree = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != ar_state_p(state) : "! rkf_assisted_reader.ar_state_p(state) " + ("rkf_assisted_reader.ar_state_p(state) " + "CommonSymbols.NIL != rkf_assisted_reader.ar_state_p(state) ") + state;
        assert NIL != stringp(text) : "! stringp(text) " + ("Types.stringp(text) " + "CommonSymbols.NIL != Types.stringp(text) ") + text;
        assert NIL != listp(v_parse_tree) : "! listp(v_parse_tree) " + ("Types.listp(v_parse_tree) " + "CommonSymbols.NIL != Types.listp(v_parse_tree) ") + v_parse_tree;
        final SubLObject sentence = new_ar_sentence(state, text);
        SubLObject new_phrases = NIL;
        SubLObject new_concepts = NIL;
        final SubLObject token_strings = rkf_concept_harvester.rkf_ch_string_tokenize(text);
        SubLObject token_list = NIL;
        SubLObject token_number = ZERO_INTEGER;
        SubLObject cdolist_list_var = token_strings;
        SubLObject token_string = NIL;
        token_string = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject token = new_ar_token(state, token_string, sentence, token_number);
            token_list = cons(token, token_list);
            token_number = add(token_number, ONE_INTEGER);
            cdolist_list_var = cdolist_list_var.rest();
            token_string = cdolist_list_var.first();
        } 
        token_list = nreverse(token_list);
        final SubLObject token_vector = apply(symbol_function(VECTOR), token_list);
        note_ar_sentence_token_vector(sentence, token_vector);
        thread.resetMultipleValues();
        final SubLObject phrases = rkf_ar_harvest_for_phrases_and_concepts(state, sentence, text, v_parse_tree);
        final SubLObject concepts = thread.secondMultipleValue();
        thread.resetMultipleValues();
        new_phrases = phrases;
        new_concepts = concepts;
        rkf_ar_add_any_surrogates(state, sentence, new_concepts, new_phrases);
        new_phrases = nreverse(new_phrases);
        if (NIL != source_sentence) {
            add_ar_sentence_clarification(source_sentence, sentence);
            note_ar_sentence_source_sentence(sentence, source_sentence);
        } else {
            add_ar_state_source_sentence(state, sentence);
        }
        SubLObject cdolist_list_var2 = new_phrases;
        SubLObject phrase = NIL;
        phrase = cdolist_list_var2.first();
        while (NIL != cdolist_list_var2) {
            rkf_ar_act_add_phrase(state, phrase);
            cdolist_list_var2 = cdolist_list_var2.rest();
            phrase = cdolist_list_var2.first();
        } 
        if (NIL != new_phrases) {
            rkf_ar_ensure_focus_sentence(state, sentence);
            rkf_ar_set_open_term_scores(state);
        }
        return sentence;
    }

    /**
     *
     *
     * @unknown this should be done through much more sophisticated means, including
    information received directly from the parser.  Alas, at this time, it
    doesn't do so 9/2001
     * @unknown should really abstract out something to find all the concepts from a given
    state.
     */
    @LispMethod(comment = "@unknown this should be done through much more sophisticated means, including\r\ninformation received directly from the parser.  Alas, at this time, it\r\ndoesn\'t do so 9/2001\r\n@unknown should really abstract out something to find all the concepts from a given\r\nstate.")
    public static final SubLObject rkf_ar_set_open_term_scores_alt(SubLObject state) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject focus = ar_state_focus_sentence(state);
                if (NIL != ar_sentence_p(focus)) {
                    rkf_ar_reset_open_term_counts_for_sentence(focus);
                    {
                        SubLObject all_phrases = ar_sentence_phrases(focus);
                        SubLObject cdolist_list_var = all_phrases;
                        SubLObject phrase = NIL;
                        for (phrase = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , phrase = cdolist_list_var.first()) {
                            {
                                SubLObject all_concepts = cconcatenate(ar_phrase_surrogate(phrase), new SubLObject[]{ ar_phrase_concepts(phrase), ar_phrase_rejected_concepts(phrase) });
                                SubLObject already_seen_cycls = NIL;
                                {
                                    SubLObject _prev_bind_0 = $ar_concept_grounding_map$.currentBinding(thread);
                                    try {
                                        $ar_concept_grounding_map$.bind(NIL, thread);
                                        ensure_ar_concept_grounding_map();
                                        {
                                            SubLObject cdolist_list_var_8 = all_concepts;
                                            SubLObject concept = NIL;
                                            for (concept = cdolist_list_var_8.first(); NIL != cdolist_list_var_8; cdolist_list_var_8 = cdolist_list_var_8.rest() , concept = cdolist_list_var_8.first()) {
                                                {
                                                    SubLObject ungrounded_count = ar_concept_dependent_on_ungrounded_surrogate_count(concept);
                                                    if (NIL != ungrounded_count) {
                                                        note_ar_concept_open_term_score(concept, add(ungrounded_count, ar_concept_open_term_score(concept)));
                                                    }
                                                    already_seen_cycls = rkf_ar_concept_check_trivial_differences(already_seen_cycls, concept);
                                                }
                                            }
                                        }
                                    } finally {
                                        $ar_concept_grounding_map$.rebind(_prev_bind_0, thread);
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return state;
        }
    }

    /**
     *
     *
     * @unknown this should be done through much more sophisticated means, including
    information received directly from the parser.  Alas, at this time, it
    doesn't do so 9/2001
     * @unknown should really abstract out something to find all the concepts from a given
    state.
     */
    @LispMethod(comment = "@unknown this should be done through much more sophisticated means, including\r\ninformation received directly from the parser.  Alas, at this time, it\r\ndoesn\'t do so 9/2001\r\n@unknown should really abstract out something to find all the concepts from a given\r\nstate.")
    public static SubLObject rkf_ar_set_open_term_scores(final SubLObject state) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject focus = ar_state_focus_sentence(state);
        if (NIL != ar_sentence_p(focus)) {
            rkf_ar_reset_open_term_counts_for_sentence(focus);
            SubLObject cdolist_list_var;
            final SubLObject all_phrases = cdolist_list_var = ar_sentence_phrases(focus);
            SubLObject phrase = NIL;
            phrase = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                final SubLObject all_concepts = cconcatenate(ar_phrase_surrogate(phrase), new SubLObject[]{ ar_phrase_concepts(phrase), ar_phrase_rejected_concepts(phrase) });
                SubLObject already_seen_cycls = NIL;
                final SubLObject _prev_bind_0 = $ar_concept_grounding_map$.currentBinding(thread);
                try {
                    $ar_concept_grounding_map$.bind(NIL, thread);
                    ensure_ar_concept_grounding_map();
                    SubLObject cdolist_list_var_$8 = all_concepts;
                    SubLObject concept = NIL;
                    concept = cdolist_list_var_$8.first();
                    while (NIL != cdolist_list_var_$8) {
                        final SubLObject ungrounded_count = ar_concept_dependent_on_ungrounded_surrogate_count(concept);
                        if (NIL != ungrounded_count) {
                            note_ar_concept_open_term_score(concept, add(ungrounded_count, ar_concept_open_term_score(concept)));
                        }
                        already_seen_cycls = rkf_ar_concept_check_trivial_differences(already_seen_cycls, concept);
                        cdolist_list_var_$8 = cdolist_list_var_$8.rest();
                        concept = cdolist_list_var_$8.first();
                    } 
                } finally {
                    $ar_concept_grounding_map$.rebind(_prev_bind_0, thread);
                }
                cdolist_list_var = cdolist_list_var.rest();
                phrase = cdolist_list_var.first();
            } 
        }
        return state;
    }

    public static final SubLObject rkf_ar_reset_open_term_counts_for_sentence_alt(SubLObject sentence) {
        {
            SubLObject all_phrases = ar_sentence_phrases(sentence);
            SubLObject cdolist_list_var = all_phrases;
            SubLObject phrase = NIL;
            for (phrase = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , phrase = cdolist_list_var.first()) {
                {
                    SubLObject cdolist_list_var_9 = ar_phrase_surrogate(phrase);
                    SubLObject concept = NIL;
                    for (concept = cdolist_list_var_9.first(); NIL != cdolist_list_var_9; cdolist_list_var_9 = cdolist_list_var_9.rest() , concept = cdolist_list_var_9.first()) {
                        note_ar_concept_open_term_score(concept, ZERO_INTEGER);
                    }
                }
                {
                    SubLObject cdolist_list_var_10 = ar_phrase_concepts(phrase);
                    SubLObject concept = NIL;
                    for (concept = cdolist_list_var_10.first(); NIL != cdolist_list_var_10; cdolist_list_var_10 = cdolist_list_var_10.rest() , concept = cdolist_list_var_10.first()) {
                        note_ar_concept_open_term_score(concept, ZERO_INTEGER);
                    }
                }
                {
                    SubLObject cdolist_list_var_11 = ar_phrase_rejected_concepts(phrase);
                    SubLObject concept = NIL;
                    for (concept = cdolist_list_var_11.first(); NIL != cdolist_list_var_11; cdolist_list_var_11 = cdolist_list_var_11.rest() , concept = cdolist_list_var_11.first()) {
                        note_ar_concept_open_term_score(concept, ZERO_INTEGER);
                    }
                }
            }
        }
        return sentence;
    }

    public static SubLObject rkf_ar_reset_open_term_counts_for_sentence(final SubLObject sentence) {
        SubLObject cdolist_list_var;
        final SubLObject all_phrases = cdolist_list_var = ar_sentence_phrases(sentence);
        SubLObject phrase = NIL;
        phrase = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject cdolist_list_var_$9 = ar_phrase_surrogate(phrase);
            SubLObject concept = NIL;
            concept = cdolist_list_var_$9.first();
            while (NIL != cdolist_list_var_$9) {
                note_ar_concept_open_term_score(concept, ZERO_INTEGER);
                cdolist_list_var_$9 = cdolist_list_var_$9.rest();
                concept = cdolist_list_var_$9.first();
            } 
            SubLObject cdolist_list_var_$10 = ar_phrase_concepts(phrase);
            concept = NIL;
            concept = cdolist_list_var_$10.first();
            while (NIL != cdolist_list_var_$10) {
                note_ar_concept_open_term_score(concept, ZERO_INTEGER);
                cdolist_list_var_$10 = cdolist_list_var_$10.rest();
                concept = cdolist_list_var_$10.first();
            } 
            SubLObject cdolist_list_var_$11 = ar_phrase_rejected_concepts(phrase);
            concept = NIL;
            concept = cdolist_list_var_$11.first();
            while (NIL != cdolist_list_var_$11) {
                note_ar_concept_open_term_score(concept, ZERO_INTEGER);
                cdolist_list_var_$11 = cdolist_list_var_$11.rest();
                concept = cdolist_list_var_$11.first();
            } 
            cdolist_list_var = cdolist_list_var.rest();
            phrase = cdolist_list_var.first();
        } 
        return sentence;
    }

    /**
     *
     *
     * @param ALIST
     * 		a-list; a list composed of (Modified) CycL/AR-CONCEPT pairs
     * @param CONCEPT
    ar-concept
     * 		
     * @return alist
    check to see if the CycL in CONCEPT is trivially different from any that
    have already been seen.  If there is such a trivial difference, raise the
    OPEN-TERM-SCORE on the one with the lower probability so that it will show
    up in the assisted-reader as an unlikely concept
     */
    @LispMethod(comment = "@param ALIST\r\n\t\ta-list; a list composed of (Modified) CycL/AR-CONCEPT pairs\r\n@param CONCEPT\nar-concept\r\n\t\t\r\n@return alist\r\ncheck to see if the CycL in CONCEPT is trivially different from any that\r\nhave already been seen.  If there is such a trivial difference, raise the\r\nOPEN-TERM-SCORE on the one with the lower probability so that it will show\r\nup in the assisted-reader as an unlikely concept")
    public static final SubLObject rkf_ar_concept_check_trivial_differences_alt(SubLObject alist, SubLObject concept) {
        {
            SubLObject cleaned_concept = rkf_ar_mask_trivial_differences(ar_concept_cycl(concept));
            SubLObject associate = assoc(cleaned_concept, alist, EQUALP, UNPROVIDED);
            if (NIL != associate) {
                if (ar_concept_confidence(second(associate)).numG(ar_concept_confidence(concept))) {
                    note_ar_concept_open_term_score(concept, number_utilities.f_1X(ar_concept_open_term_score(concept)));
                } else {
                    note_ar_concept_open_term_score(second(associate), number_utilities.f_1X(ar_concept_open_term_score(concept)));
                    rplacd(associate, list(concept));
                }
            } else {
                alist = cons(list(cleaned_concept, concept), alist);
            }
        }
        return alist;
    }

    /**
     *
     *
     * @param ALIST
     * 		a-list; a list composed of (Modified) CycL/AR-CONCEPT pairs
     * @param CONCEPT
    ar-concept
     * 		
     * @return alist
    check to see if the CycL in CONCEPT is trivially different from any that
    have already been seen.  If there is such a trivial difference, raise the
    OPEN-TERM-SCORE on the one with the lower probability so that it will show
    up in the assisted-reader as an unlikely concept
     */
    @LispMethod(comment = "@param ALIST\r\n\t\ta-list; a list composed of (Modified) CycL/AR-CONCEPT pairs\r\n@param CONCEPT\nar-concept\r\n\t\t\r\n@return alist\r\ncheck to see if the CycL in CONCEPT is trivially different from any that\r\nhave already been seen.  If there is such a trivial difference, raise the\r\nOPEN-TERM-SCORE on the one with the lower probability so that it will show\r\nup in the assisted-reader as an unlikely concept")
    public static SubLObject rkf_ar_concept_check_trivial_differences(SubLObject alist, final SubLObject concept) {
        final SubLObject cleaned_concept = rkf_ar_mask_trivial_differences(ar_concept_cycl(concept));
        final SubLObject associate = assoc(cleaned_concept, alist, EQUALP, UNPROVIDED);
        if (NIL != associate) {
            if (ar_concept_confidence(second(associate)).numG(ar_concept_confidence(concept))) {
                note_ar_concept_open_term_score(concept, number_utilities.f_1X(ar_concept_open_term_score(concept)));
            } else {
                note_ar_concept_open_term_score(second(associate), number_utilities.f_1X(ar_concept_open_term_score(concept)));
                rplacd(associate, list(concept));
            }
        } else {
            alist = cons(list(cleaned_concept, concept), alist);
        }
        return alist;
    }

    /**
     * substitute :uninteresting into the cycl of any term that is thought to
     * be uninteresting to UIA users.
     *
     * @param CYCL
     * 		cycl term
     * @return cycl term
     */
    @LispMethod(comment = "substitute :uninteresting into the cycl of any term that is thought to\r\nbe uninteresting to UIA users.\r\n\r\n@param CYCL\r\n\t\tcycl term\r\n@return cycl term\nsubstitute :uninteresting into the cycl of any term that is thought to\nbe uninteresting to UIA users.")
    public static final SubLObject rkf_ar_mask_trivial_differences_alt(SubLObject cycl) {
        return subst_if($UNINTERESTING, $sym265$RTP_TEMPLATE_CATEGORY_, cycl, UNPROVIDED);
    }

    @LispMethod(comment = "substitute :uninteresting into the cycl of any term that is thought to\r\nbe uninteresting to UIA users.\r\n\r\n@param CYCL\r\n\t\tcycl term\r\n@return cycl term\nsubstitute :uninteresting into the cycl of any term that is thought to\nbe uninteresting to UIA users.")
    public static SubLObject rkf_ar_mask_trivial_differences(final SubLObject cycl) {
        return subst_if($UNINTERESTING, $sym286$RTP_TEMPLATE_CATEGORY_, cycl, UNPROVIDED);
    }

    /**
     * Perform the harvesting of concepts and phrases from the parse tree.
     */
    @LispMethod(comment = "Perform the harvesting of concepts and phrases from the parse tree.")
    public static final SubLObject rkf_ar_harvest_for_phrases_and_concepts_alt(SubLObject state, SubLObject sentence, SubLObject text, SubLObject v_parse_tree) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject new_phrases = NIL;
                SubLObject new_concepts = NIL;
                SubLObject parses = NIL;
                SubLObject category = NIL;
                if (NIL != v_parse_tree) {
                    parses = v_parse_tree;
                    category = $$STemplate;
                } else {
                    thread.resetMultipleValues();
                    {
                        SubLObject parses_12 = rkf_ar_act_process_input_sentence(text);
                        SubLObject category_13 = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        parses = parses_12;
                        category = category_13;
                    }
                }
                parses = rkf_ar_transform_unknown_instances(parses);
                rkf_ar_log_parsing_event(text, parses, category);
                {
                    SubLObject ranked_parses = rkf_ar_rank_parses(text, parses);
                    SubLObject result_iterator = rtp_iterators.new_itp_result_iterator(ranked_parses, UNPROVIDED, UNPROVIDED);
                    SubLObject visited = set.new_set(symbol_function(EQUALP), UNPROVIDED);
                    SubLObject iterator_stack = list(rtp_iterators.new_itp_root_children_iterator(result_iterator));
                    while (NIL != iterator_stack) {
                        {
                            SubLObject child_iterator = iterator_stack.first();
                            iterator_stack = iterator_stack.rest();
                            if (NIL == rtp_iterators.itp_child_iterator_doneP(child_iterator)) {
                                {
                                    SubLObject token_index_list = rtp_iterators.itp_child_iterator_curr_span(child_iterator);
                                    SubLObject token_list = ar_sentence_tokens_from_index_list(sentence, token_index_list);
                                    SubLObject phrase = new_ar_phrase(state, sentence, token_list);
                                    SubLObject top_level_parseP = rtp_iterators.is_itp_root_children_iteratorP(child_iterator);
                                    new_phrases = cons(phrase, new_phrases);
                                    add_ar_sentence_phrase(sentence, phrase);
                                    while (NIL == rtp_iterators.itp_child_iterator_doneP(child_iterator)) {
                                        {
                                            SubLObject candidate_cycl_item = rtp_iterators.itp_child_iterator_curr_cycl(child_iterator);
                                            SubLObject rop_formulas = parsing_utilities.formulas_containing_results_of_parsing(candidate_cycl_item);
                                            SubLObject candidate_cycl_confidence = rtp_iterators.itp_child_iterator_curr_confidence(child_iterator);
                                            SubLObject cdolist_list_var = rop_formulas;
                                            SubLObject rop_formula = NIL;
                                            for (rop_formula = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , rop_formula = cdolist_list_var.first()) {
                                                if ((NIL != rop_formula) && (NIL == set.set_memberP(rop_formula, visited))) {
                                                    iterator_stack = cons(rtp_iterators.new_itp_child_iterator(result_iterator, rop_formula), iterator_stack);
                                                    set.set_add(rop_formula, visited);
                                                }
                                            }
                                            {
                                                SubLObject concept = new_ar_concept(state, candidate_cycl_item);
                                                note_ar_concept_confidence(concept, candidate_cycl_confidence);
                                                new_concepts = cons(concept, new_concepts);
                                                add_ar_concept_phrase(concept, phrase);
                                                if (NIL != ar_concept_is_surrogateP(concept)) {
                                                    note_ar_phrase_surrogate(phrase, concept);
                                                } else {
                                                    add_ar_phrase_concept(phrase, concept);
                                                }
                                            }
                                        }
                                        note_ar_phrase_status(phrase, $NONE);
                                        note_ar_phrase_force(phrase, compute_ar_phrase_force(phrase, top_level_parseP, UNPROVIDED));
                                        rtp_iterators.itp_child_iterator_next(child_iterator);
                                    } 
                                }
                            }
                        }
                    } 
                }
                return values(new_phrases, new_concepts);
            }
        }
    }

    @LispMethod(comment = "Perform the harvesting of concepts and phrases from the parse tree.")
    public static SubLObject rkf_ar_harvest_for_phrases_and_concepts(final SubLObject state, final SubLObject sentence, final SubLObject text, final SubLObject v_parse_tree) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject new_phrases = NIL;
        SubLObject new_concepts = NIL;
        SubLObject parses = NIL;
        SubLObject category = NIL;
        if (NIL != v_parse_tree) {
            parses = v_parse_tree;
            category = $$STemplate;
        } else {
            thread.resetMultipleValues();
            final SubLObject parses_$12 = rkf_ar_act_process_input_sentence(text);
            final SubLObject category_$13 = thread.secondMultipleValue();
            thread.resetMultipleValues();
            parses = parses_$12;
            category = category_$13;
        }
        parses = rkf_ar_transform_unknown_instances(parses);
        rkf_ar_log_parsing_event(text, parses, category);
        final SubLObject ranked_parses = rkf_ar_rank_parses(text, parses);
        final SubLObject result_iterator = rtp_iterators.new_itp_result_iterator(ranked_parses, UNPROVIDED, UNPROVIDED);
        final SubLObject visited = set.new_set(symbol_function(EQUALP), UNPROVIDED);
        SubLObject iterator_stack = list(rtp_iterators.new_itp_root_children_iterator(result_iterator));
        while (NIL != iterator_stack) {
            final SubLObject child_iterator = iterator_stack.first();
            iterator_stack = iterator_stack.rest();
            if (NIL == rtp_iterators.itp_child_iterator_doneP(child_iterator)) {
                final SubLObject token_index_list = rtp_iterators.itp_child_iterator_curr_span(child_iterator);
                final SubLObject token_list = ar_sentence_tokens_from_index_list(sentence, token_index_list);
                final SubLObject phrase = new_ar_phrase(state, sentence, token_list);
                final SubLObject top_level_parseP = rtp_iterators.is_itp_root_children_iteratorP(child_iterator);
                new_phrases = cons(phrase, new_phrases);
                add_ar_sentence_phrase(sentence, phrase);
                while (NIL == rtp_iterators.itp_child_iterator_doneP(child_iterator)) {
                    final SubLObject candidate_cycl_item = rtp_iterators.itp_child_iterator_curr_cycl(child_iterator);
                    final SubLObject rop_formulas = parsing_utilities.formulas_containing_results_of_parsing(candidate_cycl_item);
                    final SubLObject candidate_cycl_confidence = rtp_iterators.itp_child_iterator_curr_confidence(child_iterator);
                    SubLObject cdolist_list_var = rop_formulas;
                    SubLObject rop_formula = NIL;
                    rop_formula = cdolist_list_var.first();
                    while (NIL != cdolist_list_var) {
                        if ((NIL != rop_formula) && (NIL == set.set_memberP(rop_formula, visited))) {
                            iterator_stack = cons(rtp_iterators.new_itp_child_iterator(result_iterator, rop_formula), iterator_stack);
                            set.set_add(rop_formula, visited);
                        }
                        cdolist_list_var = cdolist_list_var.rest();
                        rop_formula = cdolist_list_var.first();
                    } 
                    final SubLObject concept = new_ar_concept(state, candidate_cycl_item);
                    note_ar_concept_confidence(concept, candidate_cycl_confidence);
                    new_concepts = cons(concept, new_concepts);
                    add_ar_concept_phrase(concept, phrase);
                    if (NIL != ar_concept_is_surrogateP(concept)) {
                        note_ar_phrase_surrogate(phrase, concept);
                    } else {
                        add_ar_phrase_concept(phrase, concept);
                    }
                    note_ar_phrase_status(phrase, $NONE);
                    note_ar_phrase_force(phrase, compute_ar_phrase_force(phrase, top_level_parseP, UNPROVIDED));
                    rtp_iterators.itp_child_iterator_next(child_iterator);
                } 
            }
        } 
        return values(new_phrases, new_concepts);
    }

    public static final SubLObject rkf_ar_transform_unknown_instances_alt(SubLObject cycl) {
        return transform_list_utilities.transform(cycl, $sym267$UNKNOWN_INSTANCE_INDEXED_EXPRESSION_, ROP_FROM_UNKNOWN_INSTANCE_INDEXED_FN, UNPROVIDED);
    }

    public static SubLObject rkf_ar_transform_unknown_instances(final SubLObject cycl) {
        return transform_list_utilities.transform(cycl, $sym288$UNKNOWN_INSTANCE_INDEXED_EXPRESSION_, ROP_FROM_UNKNOWN_INSTANCE_INDEXED_FN, UNPROVIDED);
    }

    /**
     * Wrapper around the LOGing of the parsing event.
     */
    @LispMethod(comment = "Wrapper around the LOGing of the parsing event.")
    public static final SubLObject rkf_ar_log_parsing_event_alt(SubLObject text, SubLObject parses, SubLObject category) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return nl_logging.log_parsing_event(text, parses, NIL, NIL, NIL, NIL, NIL, $rkf_ar_logging_default_project$.getDynamicValue(thread), $rkf_ar_logging_default_priority$.getDynamicValue(thread), $rkf_ar_logging_default_parser$.getDynamicValue(thread), category, $rkf_ar_parsing_mt$.getDynamicValue(thread), $rkf_ar_semantics_mt$.getDynamicValue(thread), UNPROVIDED);
        }
    }

    @LispMethod(comment = "Wrapper around the LOGing of the parsing event.")
    public static SubLObject rkf_ar_log_parsing_event(final SubLObject text, final SubLObject parses, final SubLObject category) {
        return NIL;
    }

    public static final SubLObject rkf_ar_rank_parses_alt(SubLObject text, SubLObject parses) {
        return rtp_constituent_weeders.rtp_rank_parses(text, parses);
    }

    public static SubLObject rkf_ar_rank_parses(final SubLObject text, final SubLObject parses) {
        return rtp_constituent_weeders.rtp_rank_parses(text, parses);
    }

    public static final SubLObject ar_concept_is_surrogateP_alt(SubLObject concept) {
        return rkf_concept_harvester.rkf_ch_parsing_surrogate_p(ar_concept_cycl(concept));
    }

    public static SubLObject ar_concept_is_surrogateP(final SubLObject concept) {
        return rkf_concept_harvester.rkf_ch_parsing_surrogate_p(ar_concept_cycl(concept));
    }

    public static final SubLObject rkf_ar_add_any_surrogates_alt(SubLObject state, SubLObject sentence, SubLObject new_concepts, SubLObject new_phrases) {
        {
            SubLObject new_surrogates = NIL;
            SubLObject cdolist_list_var = new_concepts;
            SubLObject concept = NIL;
            for (concept = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , concept = cdolist_list_var.first()) {
                {
                    SubLObject cycl = ar_concept_cycl(concept);
                    SubLObject surrogate_cycl_terms = rkf_concept_harvester.rkf_ch_gather_parsing_surrogates(cycl);
                    if (NIL != surrogate_cycl_terms) {
                        {
                            SubLObject cdolist_list_var_14 = surrogate_cycl_terms;
                            SubLObject surrogate_cycl = NIL;
                            for (surrogate_cycl = cdolist_list_var_14.first(); NIL != cdolist_list_var_14; cdolist_list_var_14 = cdolist_list_var_14.rest() , surrogate_cycl = cdolist_list_var_14.first()) {
                                {
                                    SubLObject surrogate = rkf_ar_check_for_existing_surrogate(surrogate_cycl, new_surrogates);
                                    if (NIL == surrogate) {
                                        {
                                            SubLObject token_index_list = rkf_concept_harvester.rkf_ch_parsing_surrogate_token_index_list(surrogate_cycl);
                                            SubLObject surrogate_tokens = ar_sentence_tokens_from_index_list(sentence, token_index_list);
                                            SubLObject phrase = rkf_ar_locate_appropriate_phrase(surrogate_tokens, new_phrases);
                                            surrogate = new_ar_concept(state, surrogate_cycl);
                                            new_surrogates = cons(surrogate, new_surrogates);
                                            if ((NIL != phrase) && (NIL != ar_phrase_has_non_surrogate_conceptsP(phrase))) {
                                                rkf_ar_update_surrogates(surrogate, phrase);
                                            } else {
                                                rkf_ar_add_surrogate_sans_children(state, sentence, surrogate_tokens, surrogate);
                                            }
                                        }
                                    }
                                    add_ar_concept_part(concept, surrogate);
                                    add_ar_concept_agglomeration(surrogate, concept);
                                }
                            }
                        }
                    }
                }
            }
        }
        return state;
    }

    public static SubLObject rkf_ar_add_any_surrogates(final SubLObject state, final SubLObject sentence, final SubLObject new_concepts, final SubLObject new_phrases) {
        SubLObject new_surrogates = NIL;
        SubLObject cdolist_list_var = new_concepts;
        SubLObject concept = NIL;
        concept = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject cycl = ar_concept_cycl(concept);
            final SubLObject surrogate_cycl_terms = rkf_concept_harvester.rkf_ch_gather_parsing_surrogates(cycl);
            if (NIL != surrogate_cycl_terms) {
                SubLObject cdolist_list_var_$14 = surrogate_cycl_terms;
                SubLObject surrogate_cycl = NIL;
                surrogate_cycl = cdolist_list_var_$14.first();
                while (NIL != cdolist_list_var_$14) {
                    SubLObject surrogate = rkf_ar_check_for_existing_surrogate(surrogate_cycl, new_surrogates);
                    if (NIL == surrogate) {
                        final SubLObject token_index_list = rkf_concept_harvester.rkf_ch_parsing_surrogate_token_index_list(surrogate_cycl);
                        final SubLObject surrogate_tokens = ar_sentence_tokens_from_index_list(sentence, token_index_list);
                        final SubLObject phrase = rkf_ar_locate_appropriate_phrase(surrogate_tokens, new_phrases);
                        surrogate = new_ar_concept(state, surrogate_cycl);
                        new_surrogates = cons(surrogate, new_surrogates);
                        if ((NIL != phrase) && (NIL != ar_phrase_has_non_surrogate_conceptsP(phrase))) {
                            rkf_ar_update_surrogates(surrogate, phrase);
                        } else {
                            rkf_ar_add_surrogate_sans_children(state, sentence, surrogate_tokens, surrogate);
                        }
                    }
                    add_ar_concept_part(concept, surrogate);
                    add_ar_concept_agglomeration(surrogate, concept);
                    cdolist_list_var_$14 = cdolist_list_var_$14.rest();
                    surrogate_cycl = cdolist_list_var_$14.first();
                } 
            }
            cdolist_list_var = cdolist_list_var.rest();
            concept = cdolist_list_var.first();
        } 
        return state;
    }

    public static final SubLObject rkf_ar_locate_appropriate_phrase_alt(SubLObject tokens, SubLObject new_phrases) {
        return find(tokens, new_phrases, symbol_function(EQUAL), symbol_function(AR_PHRASE_TOKEN_LIST), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject rkf_ar_locate_appropriate_phrase(final SubLObject tokens, final SubLObject new_phrases) {
        return find(tokens, new_phrases, symbol_function(EQUAL), symbol_function(AR_PHRASE_TOKEN_LIST), UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject rkf_ar_check_for_existing_surrogate_alt(SubLObject surrogate_cycl, SubLObject new_surrogates) {
        return find(surrogate_cycl, new_surrogates, symbol_function(EQUALP), symbol_function(AR_CONCEPT_CYCL), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject rkf_ar_check_for_existing_surrogate(final SubLObject surrogate_cycl, final SubLObject new_surrogates) {
        return find(surrogate_cycl, new_surrogates, symbol_function(EQUALP), symbol_function(AR_CONCEPT_CYCL), UNPROVIDED, UNPROVIDED);
    }

    /**
     * Make sure that surrogates have not already been identified as
     * concepts, which can happen if there are alternate ways to parse
     * the same thing.
     */
    @LispMethod(comment = "Make sure that surrogates have not already been identified as\r\nconcepts, which can happen if there are alternate ways to parse\r\nthe same thing.\nMake sure that surrogates have not already been identified as\nconcepts, which can happen if there are alternate ways to parse\nthe same thing.")
    public static final SubLObject rkf_ar_update_surrogates_alt(SubLObject surrogate, SubLObject phrase) {
        {
            SubLObject fake_concept = NIL;
            SubLObject foundP = NIL;
            add_ar_concept_phrase(surrogate, phrase);
            note_ar_phrase_surrogate(phrase, surrogate);
            if (NIL != rkf_concept_harvester.rkf_ch_gather_parsing_surrogates(ar_concept_cycl(surrogate))) {
                if (NIL == foundP) {
                    {
                        SubLObject csome_list_var = ar_phrase_concepts(phrase);
                        SubLObject concept = NIL;
                        for (concept = csome_list_var.first(); !((NIL != foundP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , concept = csome_list_var.first()) {
                            fake_concept = concept;
                            foundP = equalp(ar_concept_cycl(surrogate), ar_concept_cycl(concept));
                        }
                    }
                }
                if (NIL != foundP) {
                    remove_ar_phrase_concept(phrase, fake_concept);
                }
            }
        }
        return NIL;
    }

    @LispMethod(comment = "Make sure that surrogates have not already been identified as\r\nconcepts, which can happen if there are alternate ways to parse\r\nthe same thing.\nMake sure that surrogates have not already been identified as\nconcepts, which can happen if there are alternate ways to parse\nthe same thing.")
    public static SubLObject rkf_ar_update_surrogates(final SubLObject surrogate, final SubLObject phrase) {
        SubLObject fake_concept = NIL;
        SubLObject foundP = NIL;
        add_ar_concept_phrase(surrogate, phrase);
        note_ar_phrase_surrogate(phrase, surrogate);
        if (NIL != rkf_concept_harvester.rkf_ch_gather_parsing_surrogates(ar_concept_cycl(surrogate))) {
            if (NIL == foundP) {
                SubLObject csome_list_var;
                SubLObject concept;
                for (csome_list_var = ar_phrase_concepts(phrase), concept = NIL, concept = csome_list_var.first(); (NIL == foundP) && (NIL != csome_list_var); foundP = equalp(ar_concept_cycl(surrogate), ar_concept_cycl(concept)) , csome_list_var = csome_list_var.rest() , concept = csome_list_var.first()) {
                    fake_concept = concept;
                }
            }
            if (NIL != foundP) {
                remove_ar_phrase_concept(phrase, fake_concept);
            }
        }
        return NIL;
    }

    /**
     * If we have a surrogate with no 'child', should still add the child so that we can then say that we don't know anything about it.
     */
    @LispMethod(comment = "If we have a surrogate with no \'child\', should still add the child so that we can then say that we don\'t know anything about it.")
    public static final SubLObject rkf_ar_add_surrogate_sans_children_alt(SubLObject state, SubLObject sentence, SubLObject surrogate_tokens, SubLObject surrogate) {
        {
            SubLObject unknown_phrase = new_ar_phrase(state, sentence, surrogate_tokens);
            note_ar_phrase_status(unknown_phrase, $UNKNOWN);
            add_ar_concept_phrase(surrogate, unknown_phrase);
            note_ar_phrase_surrogate(unknown_phrase, surrogate);
            add_ar_sentence_phrase(sentence, unknown_phrase);
            add_ar_state_unknown_phrase(state, unknown_phrase);
        }
        return state;
    }

    @LispMethod(comment = "If we have a surrogate with no \'child\', should still add the child so that we can then say that we don\'t know anything about it.")
    public static SubLObject rkf_ar_add_surrogate_sans_children(final SubLObject state, final SubLObject sentence, final SubLObject surrogate_tokens, final SubLObject surrogate) {
        final SubLObject unknown_phrase = new_ar_phrase(state, sentence, surrogate_tokens);
        note_ar_phrase_status(unknown_phrase, $UNKNOWN);
        add_ar_concept_phrase(surrogate, unknown_phrase);
        note_ar_phrase_surrogate(unknown_phrase, surrogate);
        add_ar_sentence_phrase(sentence, unknown_phrase);
        add_ar_state_unknown_phrase(state, unknown_phrase);
        return state;
    }

    public static final SubLObject rkf_ar_act_focus_sentence_alt(SubLObject state, SubLObject sentence) {
        note_ar_state_focus_sentence(state, sentence);
        return NIL;
    }

    public static SubLObject rkf_ar_act_focus_sentence(final SubLObject state, final SubLObject sentence) {
        note_ar_state_focus_sentence(state, sentence);
        return NIL;
    }

    public static final SubLObject rkf_ar_ensure_focus_sentence_alt(SubLObject state, SubLObject sentence) {
        {
            SubLObject focus = ar_state_focus_sentence(state);
            if (NIL == focus) {
                rkf_ar_act_focus_sentence(state, sentence);
            }
        }
        return NIL;
    }

    public static SubLObject rkf_ar_ensure_focus_sentence(final SubLObject state, final SubLObject sentence) {
        final SubLObject focus = ar_state_focus_sentence(state);
        if (NIL == focus) {
            rkf_ar_act_focus_sentence(state, sentence);
        }
        return NIL;
    }

    public static final SubLObject rkf_ar_act_augment_sentence_alt(SubLObject state, SubLObject string, SubLObject interpretation) {
        {
            SubLObject sentence = ar_state_focus_sentence(state);
            if (NIL != ar_sentence_p(sentence)) {
                {
                    SubLObject cdolist_list_var = ar_sentence_phrases(sentence);
                    SubLObject phrase = NIL;
                    for (phrase = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , phrase = cdolist_list_var.first()) {
                        {
                            SubLObject surrogates = ar_phrase_surrogate(phrase);
                            SubLObject cdolist_list_var_15 = surrogates;
                            SubLObject surrogate = NIL;
                            for (surrogate = cdolist_list_var_15.first(); NIL != cdolist_list_var_15; cdolist_list_var_15 = cdolist_list_var_15.rest() , surrogate = cdolist_list_var_15.first()) {
                                if ((NIL != surrogate) && (NIL != rkf_concept_harvester.rkf_ch_parsing_surrogate_p(ar_concept_cycl(surrogate)))) {
                                    {
                                        SubLObject utterance = cycl_utilities.formula_arg1(ar_concept_cycl(surrogate), UNPROVIDED);
                                        if (NIL != Strings.string_equal(utterance, string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                                            {
                                                SubLObject src_concept = ar_phrase_concepts(phrase).first();
                                                SubLObject existing_concept = rkf_ar_act_find_concept(state, interpretation);
                                                SubLObject concept = NIL;
                                                if (NIL != existing_concept) {
                                                    concept = existing_concept;
                                                } else {
                                                    if (NIL != src_concept) {
                                                        concept = rkf_ar_act_clone_augment_concept(state, src_concept, interpretation);
                                                    } else {
                                                        concept = new_ar_concept(state, interpretation);
                                                        add_ar_concept_phrase(concept, phrase);
                                                    }
                                                }
                                                add_ar_phrase_concept(phrase, concept);
                                                if ($UNKNOWN == ar_phrase_status(phrase)) {
                                                    rem_ar_state_unknown_phrase(state, phrase);
                                                    note_ar_phrase_disambiguated_concept(phrase, concept);
                                                    rkf_ar_act_note_accepted_phrase(state, phrase);
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
        return state;
    }

    public static SubLObject rkf_ar_act_augment_sentence(final SubLObject state, final SubLObject string, final SubLObject interpretation) {
        final SubLObject sentence = ar_state_focus_sentence(state);
        if (NIL != ar_sentence_p(sentence)) {
            SubLObject cdolist_list_var = ar_sentence_phrases(sentence);
            SubLObject phrase = NIL;
            phrase = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cdolist_list_var_$15;
                final SubLObject surrogates = cdolist_list_var_$15 = ar_phrase_surrogate(phrase);
                SubLObject surrogate = NIL;
                surrogate = cdolist_list_var_$15.first();
                while (NIL != cdolist_list_var_$15) {
                    if ((NIL != surrogate) && (NIL != rkf_concept_harvester.rkf_ch_parsing_surrogate_p(ar_concept_cycl(surrogate)))) {
                        final SubLObject utterance = cycl_utilities.formula_arg1(ar_concept_cycl(surrogate), UNPROVIDED);
                        if (NIL != Strings.string_equal(utterance, string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                            final SubLObject src_concept = ar_phrase_concepts(phrase).first();
                            final SubLObject existing_concept = rkf_ar_act_find_concept(state, interpretation);
                            SubLObject concept = NIL;
                            if (NIL != existing_concept) {
                                concept = existing_concept;
                            } else
                                if (NIL != src_concept) {
                                    concept = rkf_ar_act_clone_augment_concept(state, src_concept, interpretation);
                                } else {
                                    concept = new_ar_concept(state, interpretation);
                                    add_ar_concept_phrase(concept, phrase);
                                }

                            add_ar_phrase_concept(phrase, concept);
                            if ($UNKNOWN == ar_phrase_status(phrase)) {
                                rem_ar_state_unknown_phrase(state, phrase);
                                note_ar_phrase_disambiguated_concept(phrase, concept);
                                rkf_ar_act_note_accepted_phrase(state, phrase);
                            }
                        }
                    }
                    cdolist_list_var_$15 = cdolist_list_var_$15.rest();
                    surrogate = cdolist_list_var_$15.first();
                } 
                cdolist_list_var = cdolist_list_var.rest();
                phrase = cdolist_list_var.first();
            } 
        }
        return state;
    }

    public static final SubLObject rkf_ar_act_complete_augmentation_alt(SubLObject state) {
        rkf_ar_set_open_term_scores(state);
        return state;
    }

    public static SubLObject rkf_ar_act_complete_augmentation(final SubLObject state) {
        rkf_ar_set_open_term_scores(state);
        return state;
    }

    public static final SubLObject rkf_ar_act_find_concept_alt(SubLObject state, SubLObject cycl) {
        {
            SubLObject sentence = ar_state_focus_sentence(state);
            SubLObject phrases = ar_sentence_phrases(sentence);
            SubLObject cdolist_list_var = phrases;
            SubLObject phrase = NIL;
            for (phrase = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , phrase = cdolist_list_var.first()) {
                {
                    SubLObject cdolist_list_var_16 = cconcatenate(ar_phrase_concepts(phrase), new SubLObject[]{ ar_phrase_rejected_concepts(phrase), ar_phrase_surrogate(phrase) });
                    SubLObject concept = NIL;
                    for (concept = cdolist_list_var_16.first(); NIL != cdolist_list_var_16; cdolist_list_var_16 = cdolist_list_var_16.rest() , concept = cdolist_list_var_16.first()) {
                        if (ar_concept_cycl(concept).equal(cycl)) {
                            return concept;
                        }
                    }
                }
            }
        }
        return NIL;
    }

    public static SubLObject rkf_ar_act_find_concept(final SubLObject state, final SubLObject cycl) {
        final SubLObject sentence = ar_state_focus_sentence(state);
        SubLObject cdolist_list_var;
        final SubLObject phrases = cdolist_list_var = ar_sentence_phrases(sentence);
        SubLObject phrase = NIL;
        phrase = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject cdolist_list_var_$16 = cconcatenate(ar_phrase_concepts(phrase), new SubLObject[]{ ar_phrase_rejected_concepts(phrase), ar_phrase_surrogate(phrase) });
            SubLObject concept = NIL;
            concept = cdolist_list_var_$16.first();
            while (NIL != cdolist_list_var_$16) {
                if (ar_concept_cycl(concept).equal(cycl)) {
                    return concept;
                }
                cdolist_list_var_$16 = cdolist_list_var_$16.rest();
                concept = cdolist_list_var_$16.first();
            } 
            cdolist_list_var = cdolist_list_var.rest();
            phrase = cdolist_list_var.first();
        } 
        return NIL;
    }

    public static final SubLObject rkf_ar_act_augment_phrase_alt(SubLObject state, SubLObject phrase, SubLObject interpretation) {
        if (ar_phrase_status(phrase) == $ASSUMED) {
            rem_ar_state_assumed_phrase(state, phrase);
            rkf_ar_act_note_ambiguous(state, phrase);
        }
        if (ar_phrase_status(phrase) == $AMBIGUOUS) {
            {
                SubLObject concept = ar_phrase_concepts(phrase).first();
                SubLObject existing_concept = rkf_ar_act_find_concept(phrase, interpretation);
                SubLObject new_concept = (NIL != existing_concept) ? ((SubLObject) (existing_concept)) : rkf_ar_act_clone_augment_concept(state, concept, interpretation);
                add_ar_phrase_concept(phrase, new_concept);
                rkf_ar_act_note_disambiguation(state, phrase, new_concept);
            }
        }
        if (ar_phrase_status(phrase) == $UNKNOWN) {
            rem_ar_state_unknown_phrase(state, phrase);
            add_ar_state_assumed_phrase(state, phrase);
            {
                SubLObject existing_concept = rkf_ar_act_find_concept(state, interpretation);
                SubLObject new_concept = (NIL != existing_concept) ? ((SubLObject) (existing_concept)) : new_ar_concept(state, interpretation);
                add_ar_phrase_concept(phrase, new_concept);
            }
        }
        return state;
    }

    public static SubLObject rkf_ar_act_augment_phrase(final SubLObject state, final SubLObject phrase, final SubLObject interpretation) {
        if (ar_phrase_status(phrase) == $ASSUMED) {
            rem_ar_state_assumed_phrase(state, phrase);
            rkf_ar_act_note_ambiguous(state, phrase);
        }
        if (ar_phrase_status(phrase) == $AMBIGUOUS) {
            final SubLObject concept = ar_phrase_concepts(phrase).first();
            final SubLObject existing_concept = rkf_ar_act_find_concept(phrase, interpretation);
            final SubLObject new_concept = (NIL != existing_concept) ? existing_concept : rkf_ar_act_clone_augment_concept(state, concept, interpretation);
            add_ar_phrase_concept(phrase, new_concept);
            rkf_ar_act_note_disambiguation(state, phrase, new_concept);
        }
        if (ar_phrase_status(phrase) == $UNKNOWN) {
            rem_ar_state_unknown_phrase(state, phrase);
            add_ar_state_assumed_phrase(state, phrase);
            final SubLObject existing_concept2 = rkf_ar_act_find_concept(state, interpretation);
            final SubLObject new_concept2 = (NIL != existing_concept2) ? existing_concept2 : new_ar_concept(state, interpretation);
            add_ar_phrase_concept(phrase, new_concept2);
        }
        return state;
    }

    public static final SubLObject rkf_ar_act_add_phrase_alt(SubLObject state, SubLObject phrase) {
        if (((((NIL != rkf_ar_some_subsuming_phrase(phrase, ar_state_accepted_phrases(state))) || (NIL != rkf_ar_some_subsuming_phrase(phrase, ar_state_assumed_phrases(state)))) || (NIL != rkf_ar_some_subsuming_phrase(phrase, ar_state_ambiguous_phrases(state)))) || (NIL != rkf_ar_some_subsuming_phrase(phrase, ar_state_irrelevant_phrases(state)))) || (NIL != rkf_ar_some_subsuming_phrase(phrase, ar_state_pending_phrases(state)))) {
            rkf_ar_act_note_irrelevant(state, phrase);
            return state;
        }
        return rkf_ar_act_add_relevant_phrase(state, phrase);
    }

    public static SubLObject rkf_ar_act_add_phrase(final SubLObject state, final SubLObject phrase) {
        if (((((NIL != rkf_ar_some_subsuming_phrase(phrase, ar_state_accepted_phrases(state))) || (NIL != rkf_ar_some_subsuming_phrase(phrase, ar_state_assumed_phrases(state)))) || (NIL != rkf_ar_some_subsuming_phrase(phrase, ar_state_ambiguous_phrases(state)))) || (NIL != rkf_ar_some_subsuming_phrase(phrase, ar_state_irrelevant_phrases(state)))) || (NIL != rkf_ar_some_subsuming_phrase(phrase, ar_state_pending_phrases(state)))) {
            rkf_ar_act_note_irrelevant(state, phrase);
            return state;
        }
        return rkf_ar_act_add_relevant_phrase(state, phrase);
    }

    public static final SubLObject rkf_ar_act_add_relevant_phrase_alt(SubLObject state, SubLObject phrase) {
        {
            SubLObject concepts = ar_phrase_concepts(phrase);
            if (NIL != list_utilities.singletonP(concepts)) {
                rkf_ar_act_note_assumed(state, phrase, concepts.first());
                return state;
            }
        }
        rkf_ar_act_note_ambiguous(state, phrase);
        return state;
    }

    public static SubLObject rkf_ar_act_add_relevant_phrase(final SubLObject state, final SubLObject phrase) {
        final SubLObject concepts = ar_phrase_concepts(phrase);
        if (NIL != list_utilities.singletonP(concepts)) {
            rkf_ar_act_note_assumed(state, phrase, concepts.first());
            return state;
        }
        rkf_ar_act_note_ambiguous(state, phrase);
        return state;
    }

    public static final SubLObject rkf_ar_act_note_irrelevant_alt(SubLObject state, SubLObject phrase) {
        note_ar_phrase_status(phrase, $IRRELEVANT);
        add_ar_state_irrelevant_phrase(state, phrase);
        return state;
    }

    public static SubLObject rkf_ar_act_note_irrelevant(final SubLObject state, final SubLObject phrase) {
        note_ar_phrase_status(phrase, $IRRELEVANT);
        add_ar_state_irrelevant_phrase(state, phrase);
        return state;
    }

    public static final SubLObject rkf_ar_act_note_assumed_alt(SubLObject state, SubLObject phrase, SubLObject concept) {
        note_ar_phrase_disambiguated_concept(phrase, concept);
        note_ar_phrase_status(phrase, $ASSUMED);
        add_ar_state_assumed_phrase(state, phrase);
        return state;
    }

    public static SubLObject rkf_ar_act_note_assumed(final SubLObject state, final SubLObject phrase, final SubLObject concept) {
        note_ar_phrase_disambiguated_concept(phrase, concept);
        note_ar_phrase_status(phrase, $ASSUMED);
        add_ar_state_assumed_phrase(state, phrase);
        return state;
    }

    public static final SubLObject rkf_ar_act_note_ambiguous_alt(SubLObject state, SubLObject phrase) {
        clear_ar_phrase_disambiguated_concept(phrase);
        note_ar_phrase_status(phrase, $AMBIGUOUS);
        add_ar_state_ambiguous_phrase(state, phrase);
        return state;
    }

    public static SubLObject rkf_ar_act_note_ambiguous(final SubLObject state, final SubLObject phrase) {
        clear_ar_phrase_disambiguated_concept(phrase);
        note_ar_phrase_status(phrase, $AMBIGUOUS);
        add_ar_state_ambiguous_phrase(state, phrase);
        return state;
    }

    public static final SubLObject rkf_ar_act_note_disambiguation_alt(SubLObject state, SubLObject phrase, SubLObject concept) {
        rem_ar_state_ambiguous_phrase(state, phrase);
        note_ar_phrase_disambiguated_concept(phrase, concept);
        rkf_ar_act_note_accepted_phrase(state, phrase);
        return state;
    }

    public static SubLObject rkf_ar_act_note_disambiguation(final SubLObject state, final SubLObject phrase, final SubLObject concept) {
        rem_ar_state_ambiguous_phrase(state, phrase);
        note_ar_phrase_disambiguated_concept(phrase, concept);
        rkf_ar_act_note_accepted_phrase(state, phrase);
        return state;
    }

    public static final SubLObject rkf_ar_act_note_accept_assumed_alt(SubLObject state, SubLObject phrase) {
        rem_ar_state_assumed_phrase(state, phrase);
        rkf_ar_act_note_accepted_phrase(state, phrase);
        return state;
    }

    public static SubLObject rkf_ar_act_note_accept_assumed(final SubLObject state, final SubLObject phrase) {
        rem_ar_state_assumed_phrase(state, phrase);
        rkf_ar_act_note_accepted_phrase(state, phrase);
        return state;
    }

    public static final SubLObject rkf_ar_act_handle_accept_assumed_alt(SubLObject state, SubLObject phrase, SubLObject v_term) {
        {
            SubLObject assumed_concept = ar_phrase_concepts(phrase).first();
            if (v_term == ar_concept_cycl(assumed_concept)) {
                rkf_ar_act_note_accept_assumed(state, phrase);
            } else {
                rkf_ar_act_augment_phrase(state, phrase, v_term);
            }
        }
        return state;
    }

    public static SubLObject rkf_ar_act_handle_accept_assumed(final SubLObject state, final SubLObject phrase, final SubLObject v_term) {
        final SubLObject assumed_concept = ar_phrase_concepts(phrase).first();
        if (v_term.eql(ar_concept_cycl(assumed_concept))) {
            rkf_ar_act_note_accept_assumed(state, phrase);
        } else {
            rkf_ar_act_augment_phrase(state, phrase, v_term);
        }
        return state;
    }

    public static final SubLObject rkf_ar_act_note_accepted_phrase_alt(SubLObject state, SubLObject phrase) {
        {
            SubLObject concept = ar_phrase_disambiguated_concept(phrase);
            if (NIL != ar_sentence_rewrite_cycl_p(ar_concept_cycl(concept))) {
                {
                    SubLObject sentence = ar_phrase_sentence(phrase);
                    rkf_ar_act_note_rewrite_sentence(state, sentence, concept);
                }
            } else {
                if (NIL != ar_concept_dependent_on_surrogate_p(concept, UNPROVIDED)) {
                    add_ar_state_pending_phrase(state, phrase);
                    rkf_ar_act_note_pending_concept(state, concept);
                    rkf_ar_act_reconsider_irrelevant(state, phrase);
                    note_ar_phrase_status(phrase, $PENDING);
                    if (NIL != ar_phrase_surrogate(phrase)) {
                        rkf_ar_act_note_surrogate_replacement(state, phrase, concept);
                    }
                } else {
                    note_ar_phrase_status(phrase, $ACCEPTED);
                    add_ar_state_accepted_phrase(state, phrase);
                    rkf_ar_act_note_accepted_concept(state, concept, phrase);
                    if (NIL != ar_phrase_surrogate(phrase)) {
                        rkf_ar_act_note_surrogate_replacement(state, phrase, concept);
                    }
                }
            }
        }
        return state;
    }

    public static SubLObject rkf_ar_act_note_accepted_phrase(final SubLObject state, final SubLObject phrase) {
        final SubLObject concept = ar_phrase_disambiguated_concept(phrase);
        if (NIL != ar_sentence_rewrite_cycl_p(ar_concept_cycl(concept))) {
            final SubLObject sentence = ar_phrase_sentence(phrase);
            rkf_ar_act_note_rewrite_sentence(state, sentence, concept);
        } else
            if (NIL != ar_concept_dependent_on_surrogate_p(concept, UNPROVIDED)) {
                add_ar_state_pending_phrase(state, phrase);
                rkf_ar_act_note_pending_concept(state, concept);
                rkf_ar_act_reconsider_irrelevant(state, phrase);
                note_ar_phrase_status(phrase, $PENDING);
                if (NIL != ar_phrase_surrogate(phrase)) {
                    rkf_ar_act_note_surrogate_replacement(state, phrase, concept);
                }
            } else {
                note_ar_phrase_status(phrase, $ACCEPTED);
                add_ar_state_accepted_phrase(state, phrase);
                rkf_ar_act_note_accepted_concept(state, concept, phrase);
                if (NIL != ar_phrase_surrogate(phrase)) {
                    rkf_ar_act_note_surrogate_replacement(state, phrase, concept);
                }
            }

        return state;
    }

    public static final SubLObject rkf_ar_act_note_rejected_phrase_alt(SubLObject state, SubLObject phrase) {
        if ($ASSUMED == ar_phrase_status(phrase)) {
            rem_ar_state_assumed_phrase(state, phrase);
            {
                SubLObject concepts = ar_phrase_concepts(phrase);
                if (NIL != list_utilities.singletonP(concepts)) {
                    clear_ar_phrase_disambiguated_concept(phrase);
                    note_ar_phrase_status(phrase, $REJECTED);
                    add_ar_state_rejected_phrase(state, phrase);
                    rkf_ar_act_reconsider_irrelevant(state, phrase);
                } else {
                    rkf_ar_act_note_ambiguous(state, phrase);
                }
            }
        } else {
            if ($AMBIGUOUS == ar_phrase_status(phrase)) {
                rem_ar_state_ambiguous_phrase(state, phrase);
                note_ar_phrase_status(phrase, $REJECTED);
                add_ar_state_rejected_phrase(state, phrase);
            }
        }
        return state;
    }

    public static SubLObject rkf_ar_act_note_rejected_phrase(final SubLObject state, final SubLObject phrase) {
        if ($ASSUMED == ar_phrase_status(phrase)) {
            rem_ar_state_assumed_phrase(state, phrase);
            final SubLObject concepts = ar_phrase_concepts(phrase);
            if (NIL != list_utilities.singletonP(concepts)) {
                clear_ar_phrase_disambiguated_concept(phrase);
                note_ar_phrase_status(phrase, $REJECTED);
                add_ar_state_rejected_phrase(state, phrase);
                rkf_ar_act_reconsider_irrelevant(state, phrase);
            } else {
                rkf_ar_act_note_ambiguous(state, phrase);
            }
        } else
            if ($AMBIGUOUS == ar_phrase_status(phrase)) {
                rem_ar_state_ambiguous_phrase(state, phrase);
                note_ar_phrase_status(phrase, $REJECTED);
                add_ar_state_rejected_phrase(state, phrase);
            }

        return state;
    }

    public static final SubLObject rkf_ar_act_reconsider_irrelevant_alt(SubLObject state, SubLObject phrase) {
        {
            SubLObject irrelevant_phrases = ar_state_irrelevant_phrases(state);
            SubLObject reconsider_phrases = NIL;
            {
                SubLObject cdolist_list_var = irrelevant_phrases;
                SubLObject irrelevant_phrase = NIL;
                for (irrelevant_phrase = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , irrelevant_phrase = cdolist_list_var.first()) {
                    if (NIL != rkf_ar_phrase_subsumed(irrelevant_phrase, phrase)) {
                        reconsider_phrases = cons(irrelevant_phrase, reconsider_phrases);
                    }
                }
            }
            {
                SubLObject cdolist_list_var = reconsider_phrases;
                SubLObject reconsider_phrase = NIL;
                for (reconsider_phrase = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , reconsider_phrase = cdolist_list_var.first()) {
                    rem_ar_state_irrelevant_phrase(state, reconsider_phrase);
                    note_ar_phrase_status(phrase, $NONE);
                }
            }
            {
                SubLObject cdolist_list_var = reconsider_phrases;
                SubLObject reconsider_phrase = NIL;
                for (reconsider_phrase = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , reconsider_phrase = cdolist_list_var.first()) {
                    rkf_ar_act_add_phrase(state, reconsider_phrase);
                }
            }
        }
        return NIL;
    }

    public static SubLObject rkf_ar_act_reconsider_irrelevant(final SubLObject state, final SubLObject phrase) {
        final SubLObject irrelevant_phrases = ar_state_irrelevant_phrases(state);
        SubLObject reconsider_phrases = NIL;
        SubLObject cdolist_list_var = irrelevant_phrases;
        SubLObject irrelevant_phrase = NIL;
        irrelevant_phrase = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != rkf_ar_phrase_subsumed(irrelevant_phrase, phrase)) {
                reconsider_phrases = cons(irrelevant_phrase, reconsider_phrases);
            }
            cdolist_list_var = cdolist_list_var.rest();
            irrelevant_phrase = cdolist_list_var.first();
        } 
        cdolist_list_var = reconsider_phrases;
        SubLObject reconsider_phrase = NIL;
        reconsider_phrase = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            rem_ar_state_irrelevant_phrase(state, reconsider_phrase);
            note_ar_phrase_status(phrase, $NONE);
            cdolist_list_var = cdolist_list_var.rest();
            reconsider_phrase = cdolist_list_var.first();
        } 
        cdolist_list_var = reconsider_phrases;
        reconsider_phrase = NIL;
        reconsider_phrase = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            rkf_ar_act_add_phrase(state, reconsider_phrase);
            cdolist_list_var = cdolist_list_var.rest();
            reconsider_phrase = cdolist_list_var.first();
        } 
        return NIL;
    }

    public static final SubLObject rkf_ar_act_understand_unknown_phrase_alt(SubLObject state, SubLObject phrase, SubLObject v_term) {
        {
            SubLObject concept = new_ar_concept(state, v_term);
            add_ar_concept_phrase(concept, phrase);
            add_ar_phrase_concept(phrase, concept);
            rem_ar_state_unknown_phrase(state, phrase);
            note_ar_phrase_status(phrase, $ACCEPTED);
            add_ar_state_accepted_phrase(state, phrase);
            if (NIL != ar_phrase_surrogate(phrase)) {
                rkf_ar_act_note_surrogate_replacement(state, phrase, concept);
            }
        }
        return state;
    }

    public static SubLObject rkf_ar_act_understand_unknown_phrase(final SubLObject state, final SubLObject phrase, final SubLObject v_term) {
        final SubLObject concept = new_ar_concept(state, v_term);
        add_ar_concept_phrase(concept, phrase);
        add_ar_phrase_concept(phrase, concept);
        rem_ar_state_unknown_phrase(state, phrase);
        note_ar_phrase_status(phrase, $ACCEPTED);
        add_ar_state_accepted_phrase(state, phrase);
        if (NIL != ar_phrase_surrogate(phrase)) {
            rkf_ar_act_note_surrogate_replacement(state, phrase, concept);
        }
        return state;
    }

    public static final SubLObject rkf_ar_act_reject_unknown_phrase_alt(SubLObject state, SubLObject phrase) {
        rem_ar_state_unknown_phrase(state, phrase);
        note_ar_phrase_status(phrase, $REJECTED);
        add_ar_state_rejected_phrase(state, phrase);
        return state;
    }

    public static SubLObject rkf_ar_act_reject_unknown_phrase(final SubLObject state, final SubLObject phrase) {
        rem_ar_state_unknown_phrase(state, phrase);
        note_ar_phrase_status(phrase, $REJECTED);
        add_ar_state_rejected_phrase(state, phrase);
        return state;
    }

    public static final SubLObject rkf_ar_act_note_rewrite_sentence_alt(SubLObject state, SubLObject old_sentence, SubLObject concept) {
        rkf_ar_act_note_sentence_completed(state, old_sentence);
        {
            SubLObject source_sentence = ar_determine_source_sentence(old_sentence);
            SubLObject rewrite_cycl = ar_concept_cycl(concept);
            SubLObject new_texts = ar_compute_sentence_rewrites(rewrite_cycl);
            rkf_ar_act_add_rewrite_texts_background(state, source_sentence, new_texts);
        }
        return state;
    }

    public static SubLObject rkf_ar_act_note_rewrite_sentence(final SubLObject state, final SubLObject old_sentence, final SubLObject concept) {
        rkf_ar_act_note_sentence_completed(state, old_sentence);
        final SubLObject source_sentence = ar_determine_source_sentence(old_sentence);
        final SubLObject rewrite_cycl = ar_concept_cycl(concept);
        final SubLObject new_texts = ar_compute_sentence_rewrites(rewrite_cycl);
        rkf_ar_act_add_rewrite_texts_background(state, source_sentence, new_texts);
        return state;
    }

    public static final SubLObject ar_sentence_rewrite_cycl_p_alt(SubLObject cycl) {
        return makeBoolean(cycl.isCons() && ($$RewriteSequenceFn == cycl_utilities.formula_operator(cycl)));
    }

    public static SubLObject ar_sentence_rewrite_cycl_p(final SubLObject cycl) {
        return makeBoolean(cycl.isCons() && $$RewriteSequenceFn.eql(cycl_utilities.formula_operator(cycl)));
    }

    public static final SubLObject ar_compute_sentence_rewrites_alt(SubLObject rewrite_cycl) {
        {
            SubLObject phrase_texts = cycl_utilities.formula_args(rewrite_cycl, UNPROVIDED);
            return copy_list(phrase_texts);
        }
    }

    public static SubLObject ar_compute_sentence_rewrites(final SubLObject rewrite_cycl) {
        final SubLObject phrase_texts = cycl_utilities.formula_args(rewrite_cycl, UNPROVIDED);
        return copy_list(phrase_texts);
    }

    public static final SubLObject rkf_ar_act_note_sentence_completed_alt(SubLObject state, SubLObject sentence) {
        {
            SubLObject clarifications = ar_sentence_clarifications(sentence);
            SubLObject cdolist_list_var = clarifications;
            SubLObject clarification = NIL;
            for (clarification = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , clarification = cdolist_list_var.first()) {
                rkf_ar_act_note_sentence_completed(state, clarification);
            }
        }
        {
            SubLObject phrases = ar_sentence_phrases(sentence);
            SubLObject cdolist_list_var = phrases;
            SubLObject phrase = NIL;
            for (phrase = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , phrase = cdolist_list_var.first()) {
                rkf_ar_act_note_phrase_completed(state, phrase);
            }
        }
        add_ar_state_completed_sentence(state, sentence);
        clear_ar_state_focus_sentence(state);
        return NIL;
    }

    public static SubLObject rkf_ar_act_note_sentence_completed(final SubLObject state, final SubLObject sentence) {
        SubLObject cdolist_list_var;
        final SubLObject clarifications = cdolist_list_var = ar_sentence_clarifications(sentence);
        SubLObject clarification = NIL;
        clarification = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            rkf_ar_act_note_sentence_completed(state, clarification);
            cdolist_list_var = cdolist_list_var.rest();
            clarification = cdolist_list_var.first();
        } 
        final SubLObject phrases = cdolist_list_var = ar_sentence_phrases(sentence);
        SubLObject phrase = NIL;
        phrase = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            rkf_ar_act_note_phrase_completed(state, phrase);
            cdolist_list_var = cdolist_list_var.rest();
            phrase = cdolist_list_var.first();
        } 
        add_ar_state_completed_sentence(state, sentence);
        clear_ar_state_focus_sentence(state);
        return NIL;
    }

    public static final SubLObject rkf_ar_act_note_sentence_completed_and_refocus_alt(SubLObject state) {
        {
            SubLObject sentence = ar_state_focus_sentence(state);
            SubLObject next_sentence = ar_state_determine_focus_sentence(state);
            if (NIL != sentence) {
                rkf_ar_act_note_sentence_completed(state, sentence);
            }
            if (NIL != next_sentence) {
                rkf_ar_act_focus_sentence(state, next_sentence);
            }
        }
        return NIL;
    }

    public static SubLObject rkf_ar_act_note_sentence_completed_and_refocus(final SubLObject state) {
        final SubLObject sentence = ar_state_focus_sentence(state);
        final SubLObject next_sentence = ar_state_determine_focus_sentence(state);
        if (NIL != sentence) {
            rkf_ar_act_note_sentence_completed(state, sentence);
        }
        if (NIL != next_sentence) {
            rkf_ar_act_focus_sentence(state, next_sentence);
        }
        return NIL;
    }

    public static final SubLObject rkf_ar_act_note_phrase_completed_alt(SubLObject state, SubLObject phrase) {
        {
            SubLObject concept = ar_phrase_disambiguated_concept(phrase);
            if (NIL != concept) {
                rkf_ar_act_note_concept_completed(state, concept);
            }
        }
        {
            SubLObject pcase_var = ar_phrase_status(phrase);
            if (pcase_var.eql($UNKNOWN)) {
                rem_ar_state_unknown_phrase(state, phrase);
            } else {
                if (pcase_var.eql($REJECTED)) {
                    rem_ar_state_rejected_phrase(state, phrase);
                } else {
                    if (pcase_var.eql($IRRELEVANT)) {
                        rem_ar_state_irrelevant_phrase(state, phrase);
                    } else {
                        if (pcase_var.eql($AMBIGUOUS)) {
                            rem_ar_state_ambiguous_phrase(state, phrase);
                        } else {
                            if (pcase_var.eql($ASSUMED)) {
                                rem_ar_state_assumed_phrase(state, phrase);
                            } else {
                                if (pcase_var.eql($PENDING)) {
                                    rem_ar_state_pending_phrase(state, phrase);
                                } else {
                                    if (pcase_var.eql($ACCEPTED)) {
                                        rem_ar_state_accepted_phrase(state, phrase);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return NIL;
    }

    public static SubLObject rkf_ar_act_note_phrase_completed(final SubLObject state, final SubLObject phrase) {
        final SubLObject concept = ar_phrase_disambiguated_concept(phrase);
        if (NIL != concept) {
            rkf_ar_act_note_concept_completed(state, concept);
        }
        final SubLObject pcase_var = ar_phrase_status(phrase);
        if (pcase_var.eql($UNKNOWN)) {
            rem_ar_state_unknown_phrase(state, phrase);
        } else
            if (pcase_var.eql($REJECTED)) {
                rem_ar_state_rejected_phrase(state, phrase);
            } else
                if (pcase_var.eql($IRRELEVANT)) {
                    rem_ar_state_irrelevant_phrase(state, phrase);
                } else
                    if (pcase_var.eql($AMBIGUOUS)) {
                        rem_ar_state_ambiguous_phrase(state, phrase);
                    } else
                        if (pcase_var.eql($ASSUMED)) {
                            rem_ar_state_assumed_phrase(state, phrase);
                        } else
                            if (pcase_var.eql($PENDING)) {
                                rem_ar_state_pending_phrase(state, phrase);
                            } else
                                if (pcase_var.eql($ACCEPTED)) {
                                    rem_ar_state_accepted_phrase(state, phrase);
                                }






        return NIL;
    }

    public static final SubLObject rkf_ar_act_note_concept_completed_alt(SubLObject state, SubLObject concept) {
        {
            SubLObject agglomerations = ar_concept_agglomerations(concept);
            SubLObject cdolist_list_var = agglomerations;
            SubLObject agglomeration = NIL;
            for (agglomeration = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , agglomeration = cdolist_list_var.first()) {
                rkf_ar_act_note_concept_completed(state, agglomeration);
            }
        }
        rem_ar_state_pending_concept(state, concept);
        return NIL;
    }

    public static SubLObject rkf_ar_act_note_concept_completed(final SubLObject state, final SubLObject concept) {
        SubLObject cdolist_list_var;
        final SubLObject agglomerations = cdolist_list_var = ar_concept_agglomerations(concept);
        SubLObject agglomeration = NIL;
        agglomeration = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            rkf_ar_act_note_concept_completed(state, agglomeration);
            cdolist_list_var = cdolist_list_var.rest();
            agglomeration = cdolist_list_var.first();
        } 
        rem_ar_state_pending_concept(state, concept);
        return NIL;
    }

    public static final SubLObject rkf_ar_act_note_pending_concept_alt(SubLObject state, SubLObject concept) {
        add_ar_state_pending_concept(state, concept);
        {
            SubLObject cdolist_list_var = ar_concept_parts(concept);
            SubLObject part = NIL;
            for (part = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , part = cdolist_list_var.first()) {
                if (NIL != ar_surrogate_concept_p(part)) {
                    {
                        SubLObject surrogate_phrase = ar_concept_phrases(part).first();
                        if (NIL != ar_phrase_p(surrogate_phrase)) {
                            if ($IRRELEVANT == ar_phrase_status(surrogate_phrase)) {
                                rem_ar_state_irrelevant_phrase(state, surrogate_phrase);
                                rkf_ar_act_add_relevant_phrase(state, surrogate_phrase);
                                rkf_ar_act_propagate_surrogate_constraint(state, surrogate_phrase, concept);
                            }
                        }
                    }
                }
            }
        }
        {
            SubLObject cycl = ar_concept_cycl(concept);
            if (cycl.isCons()) {
                {
                    SubLObject relation = cycl_utilities.formula_operator(cycl);
                    if (NIL != rkf_ar_ensure_relation_is_goodP(relation)) {
                        {
                            SubLObject relation_concept = new_ar_concept(state, relation);
                            add_ar_concept_part(concept, relation_concept);
                            add_ar_concept_agglomeration(relation_concept, concept);
                            rkf_ar_act_note_accepted_concept(state, relation_concept, UNPROVIDED);
                        }
                    }
                }
            }
        }
        return state;
    }

    public static SubLObject rkf_ar_act_note_pending_concept(final SubLObject state, final SubLObject concept) {
        add_ar_state_pending_concept(state, concept);
        SubLObject cdolist_list_var = ar_concept_parts(concept);
        SubLObject part = NIL;
        part = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != ar_surrogate_concept_p(part)) {
                final SubLObject surrogate_phrase = ar_concept_phrases(part).first();
                if ((NIL != ar_phrase_p(surrogate_phrase)) && ($IRRELEVANT == ar_phrase_status(surrogate_phrase))) {
                    rem_ar_state_irrelevant_phrase(state, surrogate_phrase);
                    rkf_ar_act_add_relevant_phrase(state, surrogate_phrase);
                    rkf_ar_act_propagate_surrogate_constraint(state, surrogate_phrase, concept);
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            part = cdolist_list_var.first();
        } 
        final SubLObject cycl = ar_concept_cycl(concept);
        if (cycl.isCons()) {
            final SubLObject relation = cycl_utilities.formula_operator(cycl);
            if (NIL != rkf_ar_ensure_relation_is_goodP(relation)) {
                final SubLObject relation_concept = new_ar_concept(state, relation);
                add_ar_concept_part(concept, relation_concept);
                add_ar_concept_agglomeration(relation_concept, concept);
                rkf_ar_act_note_accepted_concept(state, relation_concept, UNPROVIDED);
            }
        }
        return state;
    }

    public static final SubLObject rkf_ar_ensure_relation_is_goodP_alt(SubLObject relation) {
        return makeBoolean(((NIL != fort_types_interface.predicateP(relation)) || (NIL != fort_types_interface.functionP(relation))) && (NIL == ar_pragmatic_relation_p(relation)));
    }

    public static SubLObject rkf_ar_ensure_relation_is_goodP(final SubLObject relation) {
        return makeBoolean(((NIL != fort_types_interface.predicateP(relation)) || (NIL != fort_types_interface.functionP(relation))) && (NIL == ar_pragmatic_relation_p(relation)));
    }

    public static final SubLObject rkf_ar_act_propagate_surrogate_constraint_alt(SubLObject state, SubLObject phrase, SubLObject agglomeration) {
        {
            SubLObject cdolist_list_var = ar_phrase_surrogate(phrase);
            SubLObject surrogate = NIL;
            for (surrogate = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , surrogate = cdolist_list_var.first()) {
                rkf_ar_act_propagate_one_surrogate_constraint(state, phrase, agglomeration, surrogate);
            }
        }
        return phrase;
    }

    public static SubLObject rkf_ar_act_propagate_surrogate_constraint(final SubLObject state, final SubLObject phrase, final SubLObject agglomeration) {
        SubLObject cdolist_list_var = ar_phrase_surrogate(phrase);
        SubLObject surrogate = NIL;
        surrogate = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            rkf_ar_act_propagate_one_surrogate_constraint(state, phrase, agglomeration, surrogate);
            cdolist_list_var = cdolist_list_var.rest();
            surrogate = cdolist_list_var.first();
        } 
        return phrase;
    }

    public static final SubLObject rkf_ar_act_propagate_one_surrogate_constraint_alt(SubLObject state, SubLObject phrase, SubLObject agglomeration, SubLObject surrogate) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject surrogate_cycl = ar_concept_cycl(surrogate);
                SubLObject agglomeration_cycl = ar_concept_cycl(agglomeration);
                SubLObject constraint = rkf_tools.rkf_type_constraint_set(surrogate_cycl, agglomeration_cycl, UNPROVIDED);
                note_ar_phrase_constraint(phrase, constraint);
                if ($AMBIGUOUS == ar_phrase_status(phrase)) {
                    {
                        SubLObject rejected_concepts = NIL;
                        SubLObject cdolist_list_var = ar_phrase_concepts(phrase);
                        SubLObject concept = NIL;
                        for (concept = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , concept = cdolist_list_var.first()) {
                            {
                                SubLObject concept_cycl = ar_concept_cycl(concept);
                                if (!(((((NIL != rkf_ar_nthfn_termP(concept_cycl)) || (NIL != rkf_ar_unfailable_constraintP(constraint))) || (NIL != rkf_ar_possibly_reformulatableP(concept_cycl))) || (NIL != rkf_ar_possibly_reformulatableP(agglomeration_cycl))) || (NIL != backward.removal_ask(list($$elementOf, concept_cycl, constraint), $rkf_ar_parsing_mt$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED)))) {
                                    rejected_concepts = cons(concept, rejected_concepts);
                                }
                            }
                        }
                        if (NIL != rejected_concepts) {
                            rkf_ar_act_note_rejected_concepts(state, phrase, rejected_concepts);
                        }
                    }
                }
                if (!((NIL != ar_phrase_rejected_concepts(phrase)) || (NIL != ar_phrase_concepts(phrase)))) {
                    note_ar_phrase_status(phrase, $NO_DISAMBIGS);
                }
                return phrase;
            }
        }
    }

    public static SubLObject rkf_ar_act_propagate_one_surrogate_constraint(final SubLObject state, final SubLObject phrase, final SubLObject agglomeration, final SubLObject surrogate) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject surrogate_cycl = ar_concept_cycl(surrogate);
        final SubLObject agglomeration_cycl = ar_concept_cycl(agglomeration);
        final SubLObject constraint = rkf_tools.rkf_type_constraint_set(surrogate_cycl, agglomeration_cycl, UNPROVIDED);
        note_ar_phrase_constraint(phrase, constraint);
        if ($AMBIGUOUS == ar_phrase_status(phrase)) {
            SubLObject rejected_concepts = NIL;
            SubLObject cdolist_list_var = ar_phrase_concepts(phrase);
            SubLObject concept = NIL;
            concept = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                final SubLObject concept_cycl = ar_concept_cycl(concept);
                if (((((NIL == rkf_ar_nthfn_termP(concept_cycl)) && (NIL == rkf_ar_unfailable_constraintP(constraint))) && (NIL == rkf_ar_possibly_reformulatableP(concept_cycl))) && (NIL == rkf_ar_possibly_reformulatableP(agglomeration_cycl))) && (NIL == backward.removal_ask(list($$elementOf, concept_cycl, constraint), $rkf_ar_parsing_mt$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED))) {
                    rejected_concepts = cons(concept, rejected_concepts);
                }
                cdolist_list_var = cdolist_list_var.rest();
                concept = cdolist_list_var.first();
            } 
            if (NIL != rejected_concepts) {
                rkf_ar_act_note_rejected_concepts(state, phrase, rejected_concepts);
            }
        }
        if ((NIL == ar_phrase_rejected_concepts(phrase)) && (NIL == ar_phrase_concepts(phrase))) {
            note_ar_phrase_status(phrase, $NO_DISAMBIGS);
        }
        return phrase;
    }

    /**
     *
     *
     * @param CONCEPT
    ar-concept-p
     * 		
     * @return boolean; is CONCEPT a TheNthFn term?
     */
    @LispMethod(comment = "@param CONCEPT\nar-concept-p\r\n\t\t\r\n@return boolean; is CONCEPT a TheNthFn term?")
    public static final SubLObject rkf_ar_concept_is_nthfn_termP_alt(SubLObject concept) {
        return rkf_ar_nthfn_termP(ar_concept_cycl(concept));
    }

    /**
     *
     *
     * @param CONCEPT
    ar-concept-p
     * 		
     * @return boolean; is CONCEPT a TheNthFn term?
     */
    @LispMethod(comment = "@param CONCEPT\nar-concept-p\r\n\t\t\r\n@return boolean; is CONCEPT a TheNthFn term?")
    public static SubLObject rkf_ar_concept_is_nthfn_termP(final SubLObject concept) {
        return rkf_ar_nthfn_termP(ar_concept_cycl(concept));
    }

    public static final SubLObject rkf_ar_nthfn_termP_alt(SubLObject cycl) {
        {
            SubLObject stripped_cycl = parsing_utilities.strip_nl_tags(cycl, UNPROVIDED);
            SubLObject formula = cycl_utilities.hl_term_to_el_term(stripped_cycl);
            return eq(cycl_utilities.formula_arg0(formula), $$TheNthFn);
        }
    }

    public static SubLObject rkf_ar_nthfn_termP(final SubLObject cycl) {
        final SubLObject stripped_cycl = parsing_utilities.strip_nl_tags(cycl, UNPROVIDED);
        final SubLObject formula = cycl_utilities.hl_term_to_el_term(stripped_cycl);
        return eq(cycl_utilities.formula_arg0(formula), $$TheNthFn);
    }

    /**
     * the constraint (TheSetOf ?X (isa ?X Thing)) should always be true.  Therefore,
     * bother doing an ask for it.
     */
    @LispMethod(comment = "the constraint (TheSetOf ?X (isa ?X Thing)) should always be true.  Therefore,\r\nbother doing an ask for it.\nthe constraint (TheSetOf ?X (isa ?X Thing)) should always be true.  Therefore,\nbother doing an ask for it.")
    public static final SubLObject rkf_ar_unfailable_constraintP_alt(SubLObject constraint) {
        return makeBoolean((((NIL != formula_arityE(constraint, TWO_INTEGER, UNPROVIDED)) && (cycl_utilities.formula_arg0(constraint) == $$TheSetOf)) && (cycl_utilities.formula_arg0(cycl_utilities.formula_arg2(constraint, UNPROVIDED)) == $$isa)) && (cycl_utilities.formula_arg2(cycl_utilities.formula_arg2(constraint, UNPROVIDED), UNPROVIDED) == $$Thing));
    }

    @LispMethod(comment = "the constraint (TheSetOf ?X (isa ?X Thing)) should always be true.  Therefore,\r\nbother doing an ask for it.\nthe constraint (TheSetOf ?X (isa ?X Thing)) should always be true.  Therefore,\nbother doing an ask for it.")
    public static SubLObject rkf_ar_unfailable_constraintP(final SubLObject constraint) {
        return makeBoolean((((NIL != formula_arityE(constraint, TWO_INTEGER, UNPROVIDED)) && cycl_utilities.formula_arg0(constraint).eql($$TheSetOf)) && cycl_utilities.formula_arg0(cycl_utilities.formula_arg2(constraint, UNPROVIDED)).eql($$isa)) && cycl_utilities.formula_arg2(cycl_utilities.formula_arg2(constraint, UNPROVIDED), UNPROVIDED).eql($$Thing));
    }

    public static final SubLObject rkf_ar_possibly_reformulatableP_alt(SubLObject cycl) {
        return list_utilities.sublisp_boolean(list_utilities.tree_find_if($sym281$RKF_REFORMULATABLE_TERM_, cycl, UNPROVIDED));
    }

    public static SubLObject rkf_ar_possibly_reformulatableP(final SubLObject cycl) {
        return list_utilities.sublisp_boolean(list_utilities.tree_find_if($sym302$RKF_REFORMULATABLE_TERM_, cycl, UNPROVIDED));
    }

    public static final SubLObject rkf_reformulatable_termP_alt(SubLObject v_term) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == $rkf_reformulatable_terms$.getDynamicValue(thread)) {
                initialize_rkf_reformulatable_terms();
            }
            return set.set_memberP(v_term, $rkf_reformulatable_terms$.getDynamicValue(thread));
        }
    }

    public static SubLObject rkf_reformulatable_termP(final SubLObject v_term) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == $rkf_reformulatable_terms$.getDynamicValue(thread)) {
            initialize_rkf_reformulatable_terms();
        }
        return set.set_memberP(v_term, $rkf_reformulatable_terms$.getDynamicValue(thread));
    }

    public static final SubLObject initialize_rkf_reformulatable_terms_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            $rkf_reformulatable_terms$.setDynamicValue(set.new_set(EQ, UNPROVIDED), thread);
            {
                SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                try {
                    mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_GENL_MT, thread);
                    mt_relevance_macros.$mt$.bind($rkf_ar_parsing_mt$.getDynamicValue(thread), thread);
                    {
                        SubLObject terms = nconc($list_alt283, gt_methods.gt_all_inferiors($$genlFunctions, $$NLTagFn, UNPROVIDED), isa.all_fort_instances($$NLUtteranceAttribute, UNPROVIDED, UNPROVIDED));
                        SubLObject cdolist_list_var = terms;
                        SubLObject v_term = NIL;
                        for (v_term = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , v_term = cdolist_list_var.first()) {
                            set.set_add(v_term, $rkf_reformulatable_terms$.getDynamicValue(thread));
                        }
                    }
                } finally {
                    mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                }
            }
            return $INITIALIZED;
        }
    }

    public static SubLObject initialize_rkf_reformulatable_terms() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        $rkf_reformulatable_terms$.setDynamicValue(set.new_set(EQ, UNPROVIDED), thread);
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_GENL_MT, thread);
            mt_relevance_macros.$mt$.bind($rkf_ar_parsing_mt$.getDynamicValue(thread), thread);
            SubLObject cdolist_list_var;
            final SubLObject terms = cdolist_list_var = nconc($list304, gt_methods.gt_all_inferiors($$genlFunctions, $$NLTagFn, UNPROVIDED), isa.all_fort_instances($$NLUtteranceAttribute, UNPROVIDED, UNPROVIDED));
            SubLObject v_term = NIL;
            v_term = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                set.set_add(v_term, $rkf_reformulatable_terms$.getDynamicValue(thread));
                cdolist_list_var = cdolist_list_var.rest();
                v_term = cdolist_list_var.first();
            } 
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return $INITIALIZED;
    }

    public static final SubLObject rkf_ar_act_note_rejected_concepts_alt(SubLObject state, SubLObject phrase, SubLObject rejected_concepts) {
        {
            SubLObject cdolist_list_var = rejected_concepts;
            SubLObject rejected_concept = NIL;
            for (rejected_concept = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , rejected_concept = cdolist_list_var.first()) {
                user_interaction_agenda.uia_act_new_comment(cb_user_interaction_agenda.cb_current_uia(), format(NIL, $str_alt288$Important__Assuming_you_didn_t_me, rejected_concept, phrase));
                add_ar_phrase_rejected_concept(phrase, rejected_concept);
                remove_ar_phrase_concept(phrase, rejected_concept);
            }
        }
        {
            SubLObject concepts = ar_phrase_concepts(phrase);
            if (NIL != list_utilities.singletonP(concepts)) {
                rem_ar_state_ambiguous_phrase(state, phrase);
                rkf_ar_act_note_assumed(state, phrase, concepts.first());
            }
        }
        return state;
    }

    public static SubLObject rkf_ar_act_note_rejected_concepts(final SubLObject state, final SubLObject phrase, final SubLObject rejected_concepts) {
        SubLObject cdolist_list_var = rejected_concepts;
        SubLObject rejected_concept = NIL;
        rejected_concept = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            add_ar_phrase_rejected_concept(phrase, rejected_concept);
            remove_ar_phrase_concept(phrase, rejected_concept);
            cdolist_list_var = cdolist_list_var.rest();
            rejected_concept = cdolist_list_var.first();
        } 
        final SubLObject concepts = ar_phrase_concepts(phrase);
        if (NIL != list_utilities.singletonP(concepts)) {
            rem_ar_state_ambiguous_phrase(state, phrase);
            rkf_ar_act_note_assumed(state, phrase, concepts.first());
        }
        return state;
    }

    /**
     * Note that the concept REPLACEMENT is the replacement for the surrogate of PHRASE
     */
    @LispMethod(comment = "Note that the concept REPLACEMENT is the replacement for the surrogate of PHRASE")
    public static final SubLObject rkf_ar_act_note_surrogate_replacement_alt(SubLObject state, SubLObject phrase, SubLObject replacement) {
        {
            SubLObject cdolist_list_var = ar_phrase_surrogate(phrase);
            SubLObject surrogate = NIL;
            for (surrogate = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , surrogate = cdolist_list_var.first()) {
                rkf_ar_act_note_one_surrogate_replacement(state, phrase, replacement, surrogate);
            }
        }
        return state;
    }

    @LispMethod(comment = "Note that the concept REPLACEMENT is the replacement for the surrogate of PHRASE")
    public static SubLObject rkf_ar_act_note_surrogate_replacement(final SubLObject state, final SubLObject phrase, final SubLObject replacement) {
        SubLObject cdolist_list_var = ar_phrase_surrogate(phrase);
        SubLObject surrogate = NIL;
        surrogate = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            rkf_ar_act_note_one_surrogate_replacement(state, phrase, replacement, surrogate);
            cdolist_list_var = cdolist_list_var.rest();
            surrogate = cdolist_list_var.first();
        } 
        return state;
    }

    public static final SubLObject rkf_ar_act_note_one_surrogate_replacement_alt(SubLObject state, SubLObject phrase, SubLObject replacement, SubLObject surrogate) {
        {
            SubLObject surrogate_cycl = ar_concept_cycl(surrogate);
            SubLObject replacement_cycl = ar_concept_cycl(replacement);
            SubLObject cdolist_list_var = ar_concept_agglomerations(surrogate);
            SubLObject agglomeration = NIL;
            for (agglomeration = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , agglomeration = cdolist_list_var.first()) {
                rem_ar_concept_part(agglomeration, surrogate);
                rem_ar_concept_agglomeration(surrogate, agglomeration);
                add_ar_concept_part(agglomeration, replacement);
                add_ar_concept_agglomeration(replacement, agglomeration);
                rkf_ar_act_propagate_surrogate_replacement(state, replacement_cycl, surrogate_cycl, agglomeration);
            }
        }
        return state;
    }

    public static SubLObject rkf_ar_act_note_one_surrogate_replacement(final SubLObject state, final SubLObject phrase, final SubLObject replacement, final SubLObject surrogate) {
        final SubLObject surrogate_cycl = ar_concept_cycl(surrogate);
        final SubLObject replacement_cycl = ar_concept_cycl(replacement);
        SubLObject cdolist_list_var = ar_concept_agglomerations(surrogate);
        SubLObject agglomeration = NIL;
        agglomeration = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            rem_ar_concept_part(agglomeration, surrogate);
            rem_ar_concept_agglomeration(surrogate, agglomeration);
            add_ar_concept_part(agglomeration, replacement);
            add_ar_concept_agglomeration(replacement, agglomeration);
            rkf_ar_act_propagate_surrogate_replacement(state, replacement_cycl, surrogate_cycl, agglomeration);
            cdolist_list_var = cdolist_list_var.rest();
            agglomeration = cdolist_list_var.first();
        } 
        return state;
    }

    /**
     * Propagate that REPLACEMENT-CYCL is the choice for SURROGATE-CYCL in AGGLOMERATION
     */
    @LispMethod(comment = "Propagate that REPLACEMENT-CYCL is the choice for SURROGATE-CYCL in AGGLOMERATION")
    public static final SubLObject rkf_ar_act_propagate_surrogate_replacement_alt(SubLObject state, SubLObject replacement_cycl, SubLObject surrogate_cycl, SubLObject agglomeration) {
        if (NIL != list_utilities.tree_find(surrogate_cycl, replacement_cycl, EQUAL, UNPROVIDED)) {
            return state;
        } else {
            subst_ar_concept_cycl(agglomeration, replacement_cycl, surrogate_cycl);
        }
        if (NIL != subl_promotions.memberP(agglomeration, ar_state_pending_concepts(state), UNPROVIDED, UNPROVIDED)) {
            if (NIL == ar_concept_dependent_on_surrogate_p(agglomeration, UNPROVIDED)) {
                rem_ar_state_pending_concept(state, agglomeration);
                rkf_ar_act_note_accepted_concept(state, agglomeration, UNPROVIDED);
            }
        }
        {
            SubLObject cdolist_list_var = ar_concept_agglomerations(agglomeration);
            SubLObject super_agglomeration = NIL;
            for (super_agglomeration = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , super_agglomeration = cdolist_list_var.first()) {
                rkf_ar_act_propagate_surrogate_replacement(state, replacement_cycl, surrogate_cycl, super_agglomeration);
            }
        }
        return state;
    }

    @LispMethod(comment = "Propagate that REPLACEMENT-CYCL is the choice for SURROGATE-CYCL in AGGLOMERATION")
    public static SubLObject rkf_ar_act_propagate_surrogate_replacement(final SubLObject state, final SubLObject replacement_cycl, final SubLObject surrogate_cycl, final SubLObject agglomeration) {
        if (NIL != list_utilities.tree_find(surrogate_cycl, replacement_cycl, EQUAL, UNPROVIDED)) {
            return state;
        }
        subst_ar_concept_cycl(agglomeration, replacement_cycl, surrogate_cycl);
        if ((NIL != subl_promotions.memberP(agglomeration, ar_state_pending_concepts(state), UNPROVIDED, UNPROVIDED)) && (NIL == ar_concept_dependent_on_surrogate_p(agglomeration, UNPROVIDED))) {
            rem_ar_state_pending_concept(state, agglomeration);
            rkf_ar_act_note_accepted_concept(state, agglomeration, UNPROVIDED);
        }
        SubLObject cdolist_list_var = ar_concept_agglomerations(agglomeration);
        SubLObject super_agglomeration = NIL;
        super_agglomeration = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            rkf_ar_act_propagate_surrogate_replacement(state, replacement_cycl, surrogate_cycl, super_agglomeration);
            cdolist_list_var = cdolist_list_var.rest();
            super_agglomeration = cdolist_list_var.first();
        } 
        return state;
    }

    public static final SubLObject rkf_ar_with_additional_constraints_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt289);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject constraints = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt289);
                    constraints = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        current = temp;
                        {
                            SubLObject body = current;
                            return listS(CLET, list(list($rkf_ar_additional_constraints$, constraints)), append(body, NIL));
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list_alt289);
                    }
                }
            }
        }
        return NIL;
    }

    public static SubLObject rkf_ar_with_additional_constraints(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list309);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject constraints = NIL;
        destructuring_bind_must_consp(current, datum, $list309);
        constraints = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            return listS(CLET, list(list($rkf_ar_additional_constraints$, constraints)), append(body, NIL));
        }
        cdestructuring_bind_error(datum, $list309);
        return NIL;
    }

    public static final SubLObject rkf_ar_has_additional_constraintsP_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return $rkf_ar_additional_constraints$.getDynamicValue(thread);
        }
    }

    public static SubLObject rkf_ar_has_additional_constraintsP() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return $rkf_ar_additional_constraints$.getDynamicValue(thread);
    }

    /**
     *
     *
     * @param STATE
    ar-state
     * 		
     * @param CONCEPT
    ar-concept
     * 		
     * @param PHRASE
     * 		ar-phrase; the ar-phrase that the concept is related to, if there is one.
     * 		the phrase is used to set the force on the concept.  If there is
     * 		no phrase, the force of the state (i.e. the sentence) will be used instead.
     */
    @LispMethod(comment = "@param STATE\nar-state\r\n\t\t\r\n@param CONCEPT\nar-concept\r\n\t\t\r\n@param PHRASE\r\n\t\tar-phrase; the ar-phrase that the concept is related to, if there is one.\r\n\t\tthe phrase is used to set the force on the concept.  If there is\r\n\t\tno phrase, the force of the state (i.e. the sentence) will be used instead.")
    public static final SubLObject rkf_ar_act_note_accepted_concept_alt(SubLObject state, SubLObject concept, SubLObject phrase) {
        if (phrase == UNPROVIDED) {
            phrase = NIL;
        }
        {
            SubLObject force = (NIL != phrase) ? ((SubLObject) (ar_phrase_force(phrase))) : ar_state_force(state);
            if (NIL != rkf_ar_assertible_concept(concept, UNPROVIDED)) {
                note_ar_concept_force(concept, force);
            }
            {
                SubLObject concepts = rkf_ar_act_optimize_concept_cycl(state, concept);
                if (NIL != list_utilities.singletonP(concepts)) {
                    {
                        SubLObject concept_17 = concepts.first();
                        SubLObject cycl = ar_concept_cycl(concept_17);
                        SubLObject existing = find(cycl, ar_state_accepted_concepts(state), symbol_function(EQUAL), symbol_function(AR_CONCEPT_CYCL), UNPROVIDED, UNPROVIDED);
                        if (NIL == existing) {
                            add_ar_state_accepted_concept(state, concept_17);
                            note_ar_concept_force(concept_17, force);
                            {
                                SubLObject cycl_18 = ar_concept_cycl(concept_17);
                                if ((NIL != forts.fort_p(cycl_18)) && (NIL != kb_accessors.relationP(cycl_18))) {
                                    rkf_ar_act_add_template(state, concept_17);
                                } else {
                                    rkf_ar_act_update_templates(state, concept_17);
                                }
                            }
                            if ((NIL != rkf_ar_assertible_concept(concept_17, UNPROVIDED)) && (NIL != rkf_ar_concept_covers_entire_phraseP(state, concept_17))) {
                                rkf_ar_act_note_candidate_cycl(state, concept_17);
                            }
                        }
                    }
                    return state;
                }
                {
                    SubLObject phrase_19 = ar_concept_phrases(concept).first();
                    SubLObject cdolist_list_var = concepts;
                    SubLObject newbie = NIL;
                    for (newbie = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , newbie = cdolist_list_var.first()) {
                        if (concept != newbie) {
                            add_ar_phrase_concept(phrase_19, newbie);
                        }
                        if (NIL != rkf_ar_assertible_concept(newbie, UNPROVIDED)) {
                            rkf_ar_act_note_candidate_cycl(state, newbie);
                        }
                    }
                }
            }
        }
        return state;
    }

    /**
     *
     *
     * @param STATE
    ar-state
     * 		
     * @param CONCEPT
    ar-concept
     * 		
     * @param PHRASE
     * 		ar-phrase; the ar-phrase that the concept is related to, if there is one.
     * 		the phrase is used to set the force on the concept.  If there is
     * 		no phrase, the force of the state (i.e. the sentence) will be used instead.
     */
    @LispMethod(comment = "@param STATE\nar-state\r\n\t\t\r\n@param CONCEPT\nar-concept\r\n\t\t\r\n@param PHRASE\r\n\t\tar-phrase; the ar-phrase that the concept is related to, if there is one.\r\n\t\tthe phrase is used to set the force on the concept.  If there is\r\n\t\tno phrase, the force of the state (i.e. the sentence) will be used instead.")
    public static SubLObject rkf_ar_act_note_accepted_concept(final SubLObject state, final SubLObject concept, SubLObject phrase) {
        if (phrase == UNPROVIDED) {
            phrase = NIL;
        }
        final SubLObject force = (NIL != phrase) ? ar_phrase_force(phrase) : ar_state_force(state);
        if (NIL != rkf_ar_assertible_concept(concept, UNPROVIDED)) {
            note_ar_concept_force(concept, force);
        }
        final SubLObject concepts = rkf_ar_act_optimize_concept_cycl(state, concept);
        if (NIL != list_utilities.singletonP(concepts)) {
            final SubLObject concept_$17 = concepts.first();
            final SubLObject cycl = ar_concept_cycl(concept_$17);
            final SubLObject existing = find(cycl, ar_state_accepted_concepts(state), symbol_function(EQUAL), symbol_function(AR_CONCEPT_CYCL), UNPROVIDED, UNPROVIDED);
            if (NIL == existing) {
                add_ar_state_accepted_concept(state, concept_$17);
                note_ar_concept_force(concept_$17, force);
                final SubLObject cycl_$18 = ar_concept_cycl(concept_$17);
                if ((NIL != forts.fort_p(cycl_$18)) && (NIL != kb_accessors.relationP(cycl_$18))) {
                    rkf_ar_act_add_template(state, concept_$17);
                } else {
                    rkf_ar_act_update_templates(state, concept_$17);
                }
                if ((NIL != rkf_ar_assertible_concept(concept_$17, UNPROVIDED)) && (NIL != rkf_ar_concept_covers_entire_phraseP(state, concept_$17))) {
                    rkf_ar_act_note_candidate_cycl(state, concept_$17);
                }
            }
            return state;
        }
        final SubLObject phrase_$19 = ar_concept_phrases(concept).first();
        SubLObject cdolist_list_var = concepts;
        SubLObject newbie = NIL;
        newbie = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (!concept.eql(newbie)) {
                add_ar_phrase_concept(phrase_$19, newbie);
            }
            if (NIL != rkf_ar_assertible_concept(newbie, UNPROVIDED)) {
                rkf_ar_act_note_candidate_cycl(state, newbie);
            }
            cdolist_list_var = cdolist_list_var.rest();
            newbie = cdolist_list_var.first();
        } 
        return state;
    }

    /**
     * does the phrase associated with the concept in question cover the entire input phrase (e.g. the sentence)?
     */
    @LispMethod(comment = "does the phrase associated with the concept in question cover the entire input phrase (e.g. the sentence)?")
    public static final SubLObject rkf_ar_concept_covers_entire_phraseP_alt(SubLObject state, SubLObject concept) {
        {
            SubLObject first_phrase = ar_concept_phrases(concept).first();
            SubLObject focus_sentence = ar_state_focus_sentence(state);
            if (!((NIL != ar_phrase_p(first_phrase)) && (NIL != ar_sentence_p(focus_sentence)))) {
                return NIL;
            }
            return eq(length(ar_phrase_token_list(first_phrase)), length(ar_sentence_token_vector(focus_sentence)));
        }
    }

    @LispMethod(comment = "does the phrase associated with the concept in question cover the entire input phrase (e.g. the sentence)?")
    public static SubLObject rkf_ar_concept_covers_entire_phraseP(final SubLObject state, final SubLObject concept) {
        final SubLObject first_phrase = ar_concept_phrases(concept).first();
        final SubLObject focus_sentence = ar_state_focus_sentence(state);
        if ((NIL == ar_phrase_p(first_phrase)) || (NIL == ar_sentence_p(focus_sentence))) {
            return NIL;
        }
        return eq(length(ar_phrase_token_list(first_phrase)), length(ar_sentence_token_vector(focus_sentence)));
    }

    public static final SubLObject rkf_ar_act_resolve_context_references_alt(SubLObject state, SubLObject concept) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject original_cycl = ar_concept_cycl(concept);
                SubLObject resolved_cycl = original_cycl;
                if (NIL != el_formula_p(original_cycl)) {
                    resolved_cycl = rkf_ar_resolve_context_references(state, resolved_cycl, $rkf_ar_parsing_mt$.getDynamicValue(thread));
                }
                if (!resolved_cycl.equal(original_cycl)) {
                    replace_ar_concept_cycl(concept, resolved_cycl);
                }
            }
            return state;
        }
    }

    public static SubLObject rkf_ar_act_resolve_context_references(final SubLObject state, final SubLObject concept) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject resolved_cycl;
        final SubLObject original_cycl = resolved_cycl = ar_concept_cycl(concept);
        if (NIL != el_formula_p(original_cycl)) {
            resolved_cycl = rkf_ar_resolve_context_references(state, resolved_cycl, $rkf_ar_parsing_mt$.getDynamicValue(thread));
        }
        if (!resolved_cycl.equal(original_cycl)) {
            replace_ar_concept_cycl(concept, resolved_cycl);
        }
        return state;
    }

    public static final SubLObject rkf_ar_act_optimize_concept_cycl_alt(SubLObject state, SubLObject concept) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject original_cycl = ar_concept_cycl(concept);
                SubLObject optimized_cycl = original_cycl;
                SubLObject concepts = list(concept);
                SubLObject force = ar_concept_force(concept);
                if (NIL != el_formula_p(original_cycl)) {
                    if (NIL != fort_types_interface.predicateP(cycl_utilities.formula_arg0(original_cycl))) {
                        {
                            SubLObject optimizations = (force == $QUESTION) ? ((SubLObject) (rkf_formula_optimizer.rkf_reformulate_query_formula(optimized_cycl, $rkf_ar_parsing_mt$.getDynamicValue(thread), $rkf_ar_additional_constraints$.getDynamicValue(thread)))) : rkf_formula_optimizer.rkf_reformulate_assert_formula(optimized_cycl, $rkf_ar_parsing_mt$.getDynamicValue(thread), $rkf_ar_additional_constraints$.getDynamicValue(thread));
                            SubLObject doneP = NIL;
                            while (NIL == doneP) {
                                {
                                    SubLObject optimization = optimizations.first();
                                    optimizations = optimizations.rest();
                                    if (!optimization.equal(original_cycl)) {
                                        replace_ar_concept_cycl(concept, optimization);
                                        doneP = T;
                                    } else {
                                        doneP = sublisp_null(optimizations);
                                    }
                                }
                            } 
                            {
                                SubLObject cdolist_list_var = optimizations;
                                SubLObject optimized = NIL;
                                for (optimized = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , optimized = cdolist_list_var.first()) {
                                    {
                                        SubLObject new_concept = rkf_ar_act_clone_augment_concept(state, concept, optimized);
                                        concepts = cons(new_concept, concepts);
                                    }
                                }
                            }
                        }
                    } else {
                        optimized_cycl = rkf_formula_optimizer.rkf_optimize_assert_formula(optimized_cycl, $rkf_ar_parsing_mt$.getDynamicValue(thread));
                        if (!optimized_cycl.equal(original_cycl)) {
                            replace_ar_concept_cycl(concept, optimized_cycl);
                        }
                    }
                }
                return concepts;
            }
        }
    }

    public static SubLObject rkf_ar_act_optimize_concept_cycl(final SubLObject state, final SubLObject concept) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject optimized_cycl;
        final SubLObject original_cycl = optimized_cycl = ar_concept_cycl(concept);
        SubLObject concepts = list(concept);
        final SubLObject force = ar_concept_force(concept);
        if (NIL != el_formula_p(original_cycl)) {
            if (NIL != fort_types_interface.predicateP(cycl_utilities.formula_arg0(original_cycl))) {
                SubLObject optimizations = (force == $QUESTION) ? rkf_formula_optimizer.rkf_reformulate_query_formula(optimized_cycl, $rkf_ar_parsing_mt$.getDynamicValue(thread), $rkf_ar_additional_constraints$.getDynamicValue(thread)) : rkf_formula_optimizer.rkf_reformulate_assert_formula(optimized_cycl, $rkf_ar_parsing_mt$.getDynamicValue(thread), $rkf_ar_additional_constraints$.getDynamicValue(thread));
                SubLObject doneP = NIL;
                while (NIL == doneP) {
                    final SubLObject optimization = optimizations.first();
                    optimizations = optimizations.rest();
                    if (!optimization.equal(original_cycl)) {
                        replace_ar_concept_cycl(concept, optimization);
                        doneP = T;
                    } else {
                        doneP = sublisp_null(optimizations);
                    }
                } 
                SubLObject cdolist_list_var = optimizations;
                SubLObject optimized = NIL;
                optimized = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    final SubLObject new_concept = rkf_ar_act_clone_augment_concept(state, concept, optimized);
                    concepts = cons(new_concept, concepts);
                    cdolist_list_var = cdolist_list_var.rest();
                    optimized = cdolist_list_var.first();
                } 
            } else {
                optimized_cycl = rkf_formula_optimizer.rkf_optimize_assert_formula(optimized_cycl, $rkf_ar_parsing_mt$.getDynamicValue(thread));
                if (!optimized_cycl.equal(original_cycl)) {
                    replace_ar_concept_cycl(concept, optimized_cycl);
                }
            }
        }
        return concepts;
    }

    public static final SubLObject rkf_ar_act_instantiate_template_alt(SubLObject state, SubLObject template, SubLObject formula, SubLObject parts) {
        {
            SubLObject agglomeration = new_ar_concept(state, formula);
            SubLObject cdolist_list_var = parts;
            SubLObject part = NIL;
            for (part = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , part = cdolist_list_var.first()) {
                add_ar_concept_agglomeration(part, agglomeration);
                add_ar_concept_part(agglomeration, part);
            }
            add_ar_template_agglomeration(template, agglomeration);
            rkf_ar_act_note_accepted_concept(state, agglomeration, UNPROVIDED);
        }
        return state;
    }

    public static SubLObject rkf_ar_act_instantiate_template(final SubLObject state, final SubLObject template, final SubLObject formula, final SubLObject parts) {
        final SubLObject agglomeration = new_ar_concept(state, formula);
        SubLObject cdolist_list_var = parts;
        SubLObject part = NIL;
        part = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            add_ar_concept_agglomeration(part, agglomeration);
            add_ar_concept_part(agglomeration, part);
            cdolist_list_var = cdolist_list_var.rest();
            part = cdolist_list_var.first();
        } 
        add_ar_template_agglomeration(template, agglomeration);
        rkf_ar_act_note_accepted_concept(state, agglomeration, UNPROVIDED);
        return state;
    }

    public static final SubLObject rkf_ar_act_add_template_alt(SubLObject state, SubLObject concept) {
        {
            SubLObject template = new_ar_template(state, concept);
            SubLObject relation = ar_concept_cycl(concept);
            if (arity.arity_min(relation).isInteger()) {
                {
                    SubLObject formula = rkf_relation_template(relation);
                    SubLObject prompt = rkf_ar_formula_choice_template(formula);
                    note_ar_template_formula(template, formula);
                    note_ar_template_prompt(template, prompt);
                    if (NIL != fort_types_interface.functionP(relation)) {
                        add_ar_state_term_template(state, template);
                    } else {
                        add_ar_state_assert_template(state, template);
                    }
                    rkf_ar_update_template_choices_for_template(state, template);
                }
            }
            return state;
        }
    }

    public static SubLObject rkf_ar_act_add_template(final SubLObject state, final SubLObject concept) {
        final SubLObject template = new_ar_template(state, concept);
        final SubLObject relation = ar_concept_cycl(concept);
        if (arity.arity_min(relation).isInteger()) {
            final SubLObject formula = rkf_relation_template(relation);
            final SubLObject prompt = rkf_ar_formula_choice_template(formula);
            note_ar_template_formula(template, formula);
            note_ar_template_prompt(template, prompt);
            if (NIL != fort_types_interface.functionP(relation)) {
                add_ar_state_term_template(state, template);
            } else {
                add_ar_state_assert_template(state, template);
            }
            rkf_ar_update_template_choices_for_template(state, template);
        }
        return state;
    }

    public static final SubLObject rkf_ar_formula_choice_template_alt(SubLObject formula) {
        {
            SubLObject formatted_formula = rkf_concept_communicator.rkf_term_string(formula, UNPROVIDED, UNPROVIDED);
            if (formatted_formula.isString()) {
                {
                    SubLObject choice_template = list_utilities.parse_to_list_of_strings(formatted_formula, CHAR_colon, CHAR_space);
                    choice_template = transform_list_utilities.transform(choice_template, symbol_function(KEYWORD_IMPOSTOR_P), symbol_function(KEYWORD_FROM_IMPOSTOR), UNPROVIDED);
                    return choice_template;
                }
            }
        }
        return NIL;
    }

    public static SubLObject rkf_ar_formula_choice_template(final SubLObject formula) {
        final SubLObject formatted_formula = rkf_concept_communicator.rkf_term_string(formula, UNPROVIDED, UNPROVIDED);
        if (formatted_formula.isString()) {
            SubLObject choice_template = list_utilities.parse_to_list_of_strings(formatted_formula, CHAR_colon, CHAR_space);
            choice_template = transform_list_utilities.transform(choice_template, symbol_function(KEYWORD_IMPOSTOR_P), symbol_function(KEYWORD_FROM_IMPOSTOR), UNPROVIDED);
            return choice_template;
        }
        return NIL;
    }

    public static final SubLObject rkf_ar_act_update_templates_alt(SubLObject state, SubLObject concept) {
        rkf_ar_update_template_choices_for_concept(state, concept);
        return state;
    }

    public static SubLObject rkf_ar_act_update_templates(final SubLObject state, final SubLObject concept) {
        rkf_ar_update_template_choices_for_concept(state, concept);
        return state;
    }

    public static final SubLObject rkf_ar_act_note_candidate_cycl_alt(SubLObject state, SubLObject concept) {
        add_ar_state_candidate_cycl(state, concept);
        return state;
    }

    public static SubLObject rkf_ar_act_note_candidate_cycl(final SubLObject state, final SubLObject concept) {
        add_ar_state_candidate_cycl(state, concept);
        return state;
    }

    public static final SubLObject rkf_ar_act_note_candidate_assertion_alt(SubLObject state, SubLObject concept) {
        add_ar_state_candidate_assertion(state, concept);
        return state;
    }

    public static SubLObject rkf_ar_act_note_candidate_assertion(final SubLObject state, final SubLObject concept) {
        add_ar_state_candidate_assertion(state, concept);
        return state;
    }

    public static final SubLObject rkf_ar_act_note_candidate_query_alt(SubLObject state, SubLObject concept) {
        add_ar_state_candidate_query(state, concept);
        return state;
    }

    public static SubLObject rkf_ar_act_note_candidate_query(final SubLObject state, final SubLObject concept) {
        add_ar_state_candidate_query(state, concept);
        return state;
    }

    public static final SubLObject rkf_ar_act_assert_concept_alt(SubLObject state, SubLObject concept) {
        add_ar_state_asserted_assertion(state, concept);
        rem_ar_state_candidate_assertion(state, concept);
        rkf_ar_act_note_sentence_completed_and_refocus(state);
        return NIL;
    }

    public static SubLObject rkf_ar_act_assert_concept(final SubLObject state, final SubLObject concept) {
        add_ar_state_asserted_assertion(state, concept);
        rem_ar_state_candidate_assertion(state, concept);
        rkf_ar_act_note_sentence_completed_and_refocus(state);
        return NIL;
    }

    public static final SubLObject rkf_ar_act_reject_assert_concept_alt(SubLObject state, SubLObject concept) {
        rem_ar_state_candidate_assertion(state, concept);
        return NIL;
    }

    public static SubLObject rkf_ar_act_reject_assert_concept(final SubLObject state, final SubLObject concept) {
        rem_ar_state_candidate_assertion(state, concept);
        return NIL;
    }

    public static final SubLObject ar_pragmatic_relation_p_alt(SubLObject relation) {
        return subl_promotions.memberP(relation, $ar_pragmatic_relations$.getGlobalValue(), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject ar_pragmatic_relation_p(final SubLObject relation) {
        return subl_promotions.memberP(relation, $ar_pragmatic_relations$.getGlobalValue(), UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject ar_sentence_tokens_from_index_list_alt(SubLObject sentence, SubLObject token_index_list) {
        {
            SubLObject token_vector = ar_sentence_token_vector(sentence);
            SubLObject token_list = NIL;
            SubLObject cdolist_list_var = token_index_list;
            SubLObject token_index = NIL;
            for (token_index = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , token_index = cdolist_list_var.first()) {
                {
                    SubLObject token = aref(token_vector, token_index);
                    token_list = cons(token, token_list);
                }
            }
            token_list = nreverse(token_list);
            return token_list;
        }
    }

    public static SubLObject ar_sentence_tokens_from_index_list(final SubLObject sentence, final SubLObject token_index_list) {
        final SubLObject token_vector = ar_sentence_token_vector(sentence);
        SubLObject token_list = NIL;
        SubLObject cdolist_list_var = token_index_list;
        SubLObject token_index = NIL;
        token_index = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject token = aref(token_vector, token_index);
            token_list = cons(token, token_list);
            cdolist_list_var = cdolist_list_var.rest();
            token_index = cdolist_list_var.first();
        } 
        token_list = nreverse(token_list);
        return token_list;
    }

    public static final SubLObject rkf_ar_some_subsuming_phrase_alt(SubLObject phrase, SubLObject other_phrases) {
        return find(phrase, other_phrases, symbol_function(RKF_AR_PHRASE_SUBSUMED), UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject rkf_ar_some_subsuming_phrase(final SubLObject phrase, final SubLObject other_phrases) {
        return find(phrase, other_phrases, symbol_function(RKF_AR_PHRASE_SUBSUMED), UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject rkf_ar_phrase_subsumed_alt(SubLObject phrase, SubLObject other_phrase) {
        {
            SubLObject phrase_token_list = ar_phrase_token_list(phrase);
            if (NIL != phrase_token_list) {
                {
                    SubLObject other_phrase_token_list = ar_phrase_token_list(other_phrase);
                    if (NIL != other_phrase_token_list) {
                        return subsetp(phrase_token_list, other_phrase_token_list, UNPROVIDED, UNPROVIDED);
                    }
                }
            }
        }
        return NIL;
    }

    public static SubLObject rkf_ar_phrase_subsumed(final SubLObject phrase, final SubLObject other_phrase) {
        final SubLObject phrase_token_list = ar_phrase_token_list(phrase);
        if (NIL != phrase_token_list) {
            final SubLObject other_phrase_token_list = ar_phrase_token_list(other_phrase);
            if (NIL != other_phrase_token_list) {
                return subsetp(phrase_token_list, other_phrase_token_list, UNPROVIDED, UNPROVIDED);
            }
        }
        return NIL;
    }

    public static final SubLObject rkf_ar_assertible_concept_alt(SubLObject concept, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = $rkf_ar_parsing_mt$.getDynamicValue();
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_answer = NIL;
                SubLObject mt_var = mt;
                {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt_var), thread);
                        mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt_var), thread);
                        v_answer = rkf_ar_assertible_cycl(ar_concept_cycl(concept), mt);
                    } finally {
                        mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                    }
                }
                return v_answer;
            }
        }
    }

    public static SubLObject rkf_ar_assertible_concept(final SubLObject concept, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = $rkf_ar_parsing_mt$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject v_answer = NIL;
        final SubLObject mt_var = mt;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt_var), thread);
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt_var), thread);
            v_answer = rkf_ar_assertible_cycl(ar_concept_cycl(concept), mt);
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return v_answer;
    }

    public static final SubLObject rkf_ar_assertible_cycl_alt(SubLObject v_term, SubLObject mt) {
        return makeBoolean((NIL != el_formula_p(v_term)) && (NIL != isa.isaP(cycl_utilities.formula_arg0(v_term), $$TruthFunction, mt, UNPROVIDED)));
    }

    public static SubLObject rkf_ar_assertible_cycl(final SubLObject v_term, final SubLObject mt) {
        return makeBoolean((NIL != el_formula_p(v_term)) && (NIL != isa.isaP(cycl_utilities.formula_arg0(v_term), $$TruthFunction, mt, UNPROVIDED)));
    }

    public static final SubLObject rkf_relation_template_alt(SubLObject relation) {
        return rkf_predicate_creator.generic_relation_template(relation);
    }

    public static SubLObject rkf_relation_template(final SubLObject relation) {
        return rkf_predicate_creator.generic_relation_template(relation);
    }

    public static final SubLObject rkf_ar_update_all_template_choices_alt(SubLObject state) {
        {
            SubLObject cdolist_list_var = ar_state_term_templates(state);
            SubLObject template = NIL;
            for (template = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , template = cdolist_list_var.first()) {
                rkf_ar_update_template_choices_for_template(state, template);
            }
        }
        {
            SubLObject cdolist_list_var = ar_state_assert_templates(state);
            SubLObject template = NIL;
            for (template = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , template = cdolist_list_var.first()) {
                rkf_ar_update_template_choices_for_template(state, template);
            }
        }
        return NIL;
    }

    public static SubLObject rkf_ar_update_all_template_choices(final SubLObject state) {
        SubLObject cdolist_list_var = ar_state_term_templates(state);
        SubLObject template = NIL;
        template = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            rkf_ar_update_template_choices_for_template(state, template);
            cdolist_list_var = cdolist_list_var.rest();
            template = cdolist_list_var.first();
        } 
        cdolist_list_var = ar_state_assert_templates(state);
        template = NIL;
        template = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            rkf_ar_update_template_choices_for_template(state, template);
            cdolist_list_var = cdolist_list_var.rest();
            template = cdolist_list_var.first();
        } 
        return NIL;
    }

    public static final SubLObject rkf_ar_update_template_choices_for_template_alt(SubLObject state, SubLObject template) {
        {
            SubLObject cdolist_list_var = ar_state_accepted_concepts(state);
            SubLObject concept = NIL;
            for (concept = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , concept = cdolist_list_var.first()) {
                rkf_ar_update_template_choices_for_template_and_concept(state, template, concept);
            }
        }
        return NIL;
    }

    public static SubLObject rkf_ar_update_template_choices_for_template(final SubLObject state, final SubLObject template) {
        SubLObject cdolist_list_var = ar_state_accepted_concepts(state);
        SubLObject concept = NIL;
        concept = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            rkf_ar_update_template_choices_for_template_and_concept(state, template, concept);
            cdolist_list_var = cdolist_list_var.rest();
            concept = cdolist_list_var.first();
        } 
        return NIL;
    }

    public static final SubLObject rkf_ar_update_template_choices_for_concept_alt(SubLObject state, SubLObject concept) {
        {
            SubLObject cdolist_list_var = ar_state_term_templates(state);
            SubLObject template = NIL;
            for (template = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , template = cdolist_list_var.first()) {
                rkf_ar_update_template_choices_for_template_and_concept(state, template, concept);
            }
        }
        {
            SubLObject cdolist_list_var = ar_state_assert_templates(state);
            SubLObject template = NIL;
            for (template = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , template = cdolist_list_var.first()) {
                rkf_ar_update_template_choices_for_template_and_concept(state, template, concept);
            }
        }
        return NIL;
    }

    public static SubLObject rkf_ar_update_template_choices_for_concept(final SubLObject state, final SubLObject concept) {
        SubLObject cdolist_list_var = ar_state_term_templates(state);
        SubLObject template = NIL;
        template = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            rkf_ar_update_template_choices_for_template_and_concept(state, template, concept);
            cdolist_list_var = cdolist_list_var.rest();
            template = cdolist_list_var.first();
        } 
        cdolist_list_var = ar_state_assert_templates(state);
        template = NIL;
        template = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            rkf_ar_update_template_choices_for_template_and_concept(state, template, concept);
            cdolist_list_var = cdolist_list_var.rest();
            template = cdolist_list_var.first();
        } 
        return NIL;
    }

    public static final SubLObject rkf_ar_update_template_choices_for_template_and_concept_alt(SubLObject state, SubLObject template, SubLObject concept) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject template_concept = ar_template_concept(template);
                SubLObject relation = ar_concept_cycl(template_concept);
                SubLObject v_arity = arity.min_arity(relation);
                SubLObject old_choice_table = ar_template_choice_table(template);
                SubLObject new_choice_table = NIL;
                SubLObject v_term = ar_concept_cycl(concept);
                SubLObject i = NIL;
                for (i = ZERO_INTEGER; i.numL(v_arity); i = add(i, ONE_INTEGER)) {
                    {
                        SubLObject arg = add(i, ONE_INTEGER);
                        SubLObject arg_keyword = rkf_predicate_creator.generic_keyword_arg(arg);
                        SubLObject assoc_list_for_arg = assoc(arg_keyword, old_choice_table, UNPROVIDED, UNPROVIDED);
                        SubLObject choice_table_list_for_arg = NIL;
                        if (assoc_list_for_arg.isCons()) {
                            choice_table_list_for_arg = second(assoc_list_for_arg);
                        }
                        if (NIL != rkf_ar_ta_admitted_argument(v_term, arg, relation, $rkf_ar_parsing_mt$.getDynamicValue(thread))) {
                            {
                                SubLObject item_var = concept;
                                if (NIL == member(item_var, choice_table_list_for_arg, symbol_function(EQL), symbol_function(IDENTITY))) {
                                    choice_table_list_for_arg = cons(item_var, choice_table_list_for_arg);
                                }
                            }
                        }
                        new_choice_table = cons(list(arg_keyword, choice_table_list_for_arg), new_choice_table);
                    }
                }
                new_choice_table = nreverse(new_choice_table);
                note_ar_template_choice_table(template, new_choice_table);
                return NIL;
            }
        }
    }

    public static SubLObject rkf_ar_update_template_choices_for_template_and_concept(final SubLObject state, final SubLObject template, final SubLObject concept) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject template_concept = ar_template_concept(template);
        final SubLObject relation = ar_concept_cycl(template_concept);
        final SubLObject v_arity = arity.min_arity(relation);
        final SubLObject old_choice_table = ar_template_choice_table(template);
        SubLObject new_choice_table = NIL;
        final SubLObject v_term = ar_concept_cycl(concept);
        SubLObject i;
        SubLObject arg;
        SubLObject arg_keyword;
        SubLObject assoc_list_for_arg;
        SubLObject choice_table_list_for_arg;
        for (i = NIL, i = ZERO_INTEGER; i.numL(v_arity); i = add(i, ONE_INTEGER)) {
            arg = add(i, ONE_INTEGER);
            arg_keyword = rkf_predicate_creator.generic_keyword_arg(arg);
            assoc_list_for_arg = assoc(arg_keyword, old_choice_table, UNPROVIDED, UNPROVIDED);
            choice_table_list_for_arg = NIL;
            if (assoc_list_for_arg.isCons()) {
                choice_table_list_for_arg = second(assoc_list_for_arg);
            }
            if ((NIL != rkf_ar_ta_admitted_argument(v_term, arg, relation, $rkf_ar_parsing_mt$.getDynamicValue(thread))) && (NIL == member(concept, choice_table_list_for_arg, symbol_function(EQL), symbol_function(IDENTITY)))) {
                choice_table_list_for_arg = cons(concept, choice_table_list_for_arg);
            }
            new_choice_table = cons(list(arg_keyword, choice_table_list_for_arg), new_choice_table);
        }
        new_choice_table = nreverse(new_choice_table);
        note_ar_template_choice_table(template, new_choice_table);
        return NIL;
    }

    /**
     * Resolve all the context reference in CYCL, assuming STATE provides the context.
     */
    @LispMethod(comment = "Resolve all the context reference in CYCL, assuming STATE provides the context.")
    public static final SubLObject rkf_ar_resolve_context_references_alt(SubLObject state, SubLObject cycl, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = $rkf_ar_parsing_mt$.getDynamicValue();
        }
        {
            SubLObject context_references = rkf_ar_gather_context_references(cycl);
            SubLObject cdolist_list_var = context_references;
            SubLObject context_reference = NIL;
            for (context_reference = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , context_reference = cdolist_list_var.first()) {
                {
                    SubLObject referent = rkf_ar_resolve_one_context_reference(state, context_reference, mt);
                    if (NIL != referent) {
                        cycl = subst(referent, context_reference, cycl, symbol_function(EQUAL), UNPROVIDED);
                    }
                }
            }
            return cycl;
        }
    }

    @LispMethod(comment = "Resolve all the context reference in CYCL, assuming STATE provides the context.")
    public static SubLObject rkf_ar_resolve_context_references(final SubLObject state, SubLObject cycl, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = $rkf_ar_parsing_mt$.getDynamicValue();
        }
        SubLObject cdolist_list_var;
        final SubLObject context_references = cdolist_list_var = rkf_ar_gather_context_references(cycl);
        SubLObject context_reference = NIL;
        context_reference = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject referent = rkf_ar_resolve_one_context_reference(state, context_reference, mt);
            if (NIL != referent) {
                cycl = subst(referent, context_reference, cycl, symbol_function(EQUAL), UNPROVIDED);
            }
            cdolist_list_var = cdolist_list_var.rest();
            context_reference = cdolist_list_var.first();
        } 
        return cycl;
    }

    /**
     * Return T iff OBJ is a context reference we can try to resolve
     */
    @LispMethod(comment = "Return T iff OBJ is a context reference we can try to resolve")
    public static final SubLObject rkf_ar_context_reference_p_alt(SubLObject obj) {
        if (NIL != el_formula_p(obj)) {
            {
                SubLObject operator = cycl_utilities.formula_operator(obj);
                if (NIL != subl_promotions.memberP(operator, $list_alt296, UNPROVIDED, UNPROVIDED)) {
                    {
                        SubLObject constraint = cycl_utilities.formula_arg1(obj, UNPROVIDED);
                        return makeBoolean(NIL == rkf_ar_contains_context_references(constraint));
                    }
                }
            }
        }
        return NIL;
    }

    @LispMethod(comment = "Return T iff OBJ is a context reference we can try to resolve")
    public static SubLObject rkf_ar_context_reference_p(final SubLObject obj) {
        if (NIL != el_formula_p(obj)) {
            final SubLObject operator = cycl_utilities.formula_operator(obj);
            if (NIL != subl_promotions.memberP(operator, $list316, UNPROVIDED, UNPROVIDED)) {
                final SubLObject constraint = cycl_utilities.formula_arg1(obj, UNPROVIDED);
                return makeBoolean(NIL == rkf_ar_contains_context_references(constraint));
            }
        }
        return NIL;
    }

    /**
     * Return T iff OBJ contains any context references
     */
    @LispMethod(comment = "Return T iff OBJ contains any context references")
    public static final SubLObject rkf_ar_contains_context_references_alt(SubLObject obj) {
        return list_utilities.tree_find_if(symbol_function(RKF_AR_CONTEXT_REFERENCE_P), obj, UNPROVIDED);
    }

    @LispMethod(comment = "Return T iff OBJ contains any context references")
    public static SubLObject rkf_ar_contains_context_references(final SubLObject obj) {
        return list_utilities.tree_find_if(symbol_function(RKF_AR_CONTEXT_REFERENCE_P), obj, UNPROVIDED);
    }

    /**
     * Return a list of all the context references in OBJ
     */
    @LispMethod(comment = "Return a list of all the context references in OBJ")
    public static final SubLObject rkf_ar_gather_context_references_alt(SubLObject obj) {
        return list_utilities.tree_gather(obj, symbol_function(RKF_AR_CONTEXT_REFERENCE_P), symbol_function(EQUAL), UNPROVIDED, UNPROVIDED);
    }

    @LispMethod(comment = "Return a list of all the context references in OBJ")
    public static SubLObject rkf_ar_gather_context_references(final SubLObject obj) {
        return list_utilities.tree_gather(obj, symbol_function(RKF_AR_CONTEXT_REFERENCE_P), symbol_function(EQUAL), UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject rkf_ar_resolve_one_context_reference_alt(SubLObject state, SubLObject context_reference, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = $rkf_ar_parsing_mt$.getDynamicValue();
        }
        {
            SubLObject operator = cycl_utilities.formula_operator(context_reference);
            SubLObject pcase_var = operator;
            if (pcase_var.eql($$TheSpec)) {
                return rkf_ar_resolve_the_spec_reference(state, context_reference, mt);
            } else {
                if (pcase_var.eql($$TheInstance)) {
                    return rkf_ar_resolve_the_instance_reference(state, context_reference, mt);
                }
            }
        }
        return NIL;
    }

    public static SubLObject rkf_ar_resolve_one_context_reference(final SubLObject state, final SubLObject context_reference, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = $rkf_ar_parsing_mt$.getDynamicValue();
        }
        final SubLObject pcase_var;
        final SubLObject operator = pcase_var = cycl_utilities.formula_operator(context_reference);
        if (pcase_var.eql($$TheSpec)) {
            return rkf_ar_resolve_the_spec_reference(state, context_reference, mt);
        }
        if (pcase_var.eql($$TheInstance)) {
            return rkf_ar_resolve_the_instance_reference(state, context_reference, mt);
        }
        return NIL;
    }

    public static final SubLObject rkf_ar_resolve_the_spec_reference_alt(SubLObject state, SubLObject context_reference, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = $rkf_ar_parsing_mt$.getDynamicValue();
        }
        {
            SubLObject col = cycl_utilities.formula_arg1(context_reference, UNPROVIDED);
            if (NIL != forts.fort_p(col)) {
                {
                    SubLObject accepted_concepts = ar_state_accepted_concepts(state);
                    SubLObject cdolist_list_var = accepted_concepts;
                    SubLObject accepted_concept = NIL;
                    for (accepted_concept = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , accepted_concept = cdolist_list_var.first()) {
                        {
                            SubLObject accepted_cycl = ar_concept_cycl(accepted_concept);
                            if (NIL != term.el_fort_p(accepted_cycl)) {
                                if (!accepted_cycl.equal(context_reference)) {
                                    if ((!accepted_cycl.equal(col)) && (NIL != genls.genlsP(accepted_cycl, col, mt, UNPROVIDED))) {
                                        return accepted_cycl;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return NIL;
    }

    public static SubLObject rkf_ar_resolve_the_spec_reference(final SubLObject state, final SubLObject context_reference, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = $rkf_ar_parsing_mt$.getDynamicValue();
        }
        final SubLObject col = cycl_utilities.formula_arg1(context_reference, UNPROVIDED);
        if (NIL != forts.fort_p(col)) {
            SubLObject cdolist_list_var;
            final SubLObject accepted_concepts = cdolist_list_var = ar_state_accepted_concepts(state);
            SubLObject accepted_concept = NIL;
            accepted_concept = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                final SubLObject accepted_cycl = ar_concept_cycl(accepted_concept);
                if ((((NIL != term.el_fort_p(accepted_cycl)) && (!accepted_cycl.equal(context_reference))) && (!accepted_cycl.equal(col))) && (NIL != genls.genlsP(accepted_cycl, col, mt, UNPROVIDED))) {
                    return accepted_cycl;
                }
                cdolist_list_var = cdolist_list_var.rest();
                accepted_concept = cdolist_list_var.first();
            } 
        }
        return NIL;
    }

    public static final SubLObject rkf_ar_resolve_the_instance_reference_alt(SubLObject state, SubLObject context_reference, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = $rkf_ar_parsing_mt$.getDynamicValue();
        }
        {
            SubLObject col = cycl_utilities.formula_arg1(context_reference, UNPROVIDED);
            if (NIL != forts.fort_p(col)) {
                {
                    SubLObject accepted_concepts = ar_state_accepted_concepts(state);
                    SubLObject cdolist_list_var = accepted_concepts;
                    SubLObject accepted_concept = NIL;
                    for (accepted_concept = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , accepted_concept = cdolist_list_var.first()) {
                        {
                            SubLObject accepted_cycl = ar_concept_cycl(accepted_concept);
                            if (NIL != term.el_fort_p(accepted_cycl)) {
                                if (!accepted_cycl.equal(context_reference)) {
                                    if (NIL != isa.isaP(accepted_cycl, col, mt, UNPROVIDED)) {
                                        return accepted_cycl;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return NIL;
    }

    public static SubLObject rkf_ar_resolve_the_instance_reference(final SubLObject state, final SubLObject context_reference, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = $rkf_ar_parsing_mt$.getDynamicValue();
        }
        final SubLObject col = cycl_utilities.formula_arg1(context_reference, UNPROVIDED);
        if (NIL != forts.fort_p(col)) {
            SubLObject cdolist_list_var;
            final SubLObject accepted_concepts = cdolist_list_var = ar_state_accepted_concepts(state);
            SubLObject accepted_concept = NIL;
            accepted_concept = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                final SubLObject accepted_cycl = ar_concept_cycl(accepted_concept);
                if (((NIL != term.el_fort_p(accepted_cycl)) && (!accepted_cycl.equal(context_reference))) && (NIL != isa.isaP(accepted_cycl, col, mt, UNPROVIDED))) {
                    return accepted_cycl;
                }
                cdolist_list_var = cdolist_list_var.rest();
                accepted_concept = cdolist_list_var.first();
            } 
        }
        return NIL;
    }

    /**
     * The entry point from the Assisted Reader into the Term Agglomerator.
     */
    @LispMethod(comment = "The entry point from the Assisted Reader into the Term Agglomerator.")
    public static final SubLObject rkf_ar_term_agglomerator_alt(SubLObject new_term, SubLObject old_terms, SubLObject mt) {
        if (old_terms == UNPROVIDED) {
            old_terms = NIL;
        }
        if (mt == UNPROVIDED) {
            mt = $rkf_ar_parsing_mt$.getDynamicValue();
        }
        return rkf_ar_ta_internal(new_term, old_terms, mt);
    }

    @LispMethod(comment = "The entry point from the Assisted Reader into the Term Agglomerator.")
    public static SubLObject rkf_ar_term_agglomerator(final SubLObject new_term, SubLObject old_terms, SubLObject mt) {
        if (old_terms == UNPROVIDED) {
            old_terms = NIL;
        }
        if (mt == UNPROVIDED) {
            mt = $rkf_ar_parsing_mt$.getDynamicValue();
        }
        return rkf_ar_ta_internal(new_term, old_terms, mt);
    }

    /**
     * Return all new agglomerations using NEW-TERM and any number of OLD-TERMS.
     */
    @LispMethod(comment = "Return all new agglomerations using NEW-TERM and any number of OLD-TERMS.")
    public static final SubLObject rkf_ar_ta_internal_alt(SubLObject new_term, SubLObject old_terms, SubLObject mt) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject agglomerations = NIL;
                {
                    SubLObject _prev_bind_0 = $mapping_answer$.currentBinding(thread);
                    try {
                        $mapping_answer$.bind(NIL, thread);
                        {
                            SubLObject mt_var = mt;
                            {
                                SubLObject _prev_bind_0_20 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                                SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                                try {
                                    mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt_var), thread);
                                    mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt_var), thread);
                                    if ((NIL != rkf_ar_assertible_cycl(new_term, mt)) && (NIL != rkf_ar_ta_admitted_formula(new_term, mt))) {
                                    } else {
                                        if ((NIL != forts.fort_p(new_term)) && (NIL != kb_accessors.relationP(new_term))) {
                                            rkf_ar_ta_new_relation(new_term, old_terms, mt);
                                        } else {
                                            {
                                                SubLObject cdolist_list_var = old_terms;
                                                SubLObject relation = NIL;
                                                for (relation = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , relation = cdolist_list_var.first()) {
                                                    if ((NIL != forts.fort_p(relation)) && (NIL != kb_accessors.relationP(relation))) {
                                                        {
                                                            SubLObject other_terms = remove(relation, old_terms, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                            rkf_ar_ta_new_term(relation, new_term, other_terms, mt);
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                } finally {
                                    mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0_20, thread);
                                }
                            }
                            agglomerations = nreverse(copy_tree($mapping_answer$.getDynamicValue(thread)));
                        }
                    } finally {
                        $mapping_answer$.rebind(_prev_bind_0, thread);
                    }
                }
                return agglomerations;
            }
        }
    }

    @LispMethod(comment = "Return all new agglomerations using NEW-TERM and any number of OLD-TERMS.")
    public static SubLObject rkf_ar_ta_internal(final SubLObject new_term, final SubLObject old_terms, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject agglomerations = NIL;
        final SubLObject _prev_bind_0 = $mapping_answer$.currentBinding(thread);
        try {
            $mapping_answer$.bind(NIL, thread);
            final SubLObject _prev_bind_0_$20 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
            try {
                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt), thread);
                mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt), thread);
                if ((NIL == rkf_ar_assertible_cycl(new_term, mt)) || (NIL == rkf_ar_ta_admitted_formula(new_term, mt))) {
                    if ((NIL != forts.fort_p(new_term)) && (NIL != kb_accessors.relationP(new_term))) {
                        rkf_ar_ta_new_relation(new_term, old_terms, mt);
                    } else {
                        SubLObject cdolist_list_var = old_terms;
                        SubLObject relation = NIL;
                        relation = cdolist_list_var.first();
                        while (NIL != cdolist_list_var) {
                            if ((NIL != forts.fort_p(relation)) && (NIL != kb_accessors.relationP(relation))) {
                                final SubLObject other_terms = remove(relation, old_terms, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                rkf_ar_ta_new_term(relation, new_term, other_terms, mt);
                            }
                            cdolist_list_var = cdolist_list_var.rest();
                            relation = cdolist_list_var.first();
                        } 
                    }
                }
            } finally {
                mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0_$20, thread);
            }
            agglomerations = nreverse(copy_tree($mapping_answer$.getDynamicValue(thread)));
        } finally {
            $mapping_answer$.rebind(_prev_bind_0, thread);
        }
        return agglomerations;
    }

    /**
     * Compute agglomerations for new RELATION and OLD-TERMS
     */
    @LispMethod(comment = "Compute agglomerations for new RELATION and OLD-TERMS")
    public static final SubLObject rkf_ar_ta_new_relation_alt(SubLObject relation, SubLObject old_terms, SubLObject mt) {
        {
            SubLObject arg = relationship_generality_estimates.relation_most_restricted_arg(relation);
            if (NIL != arg) {
                {
                    SubLObject cdolist_list_var = old_terms;
                    SubLObject old_term = NIL;
                    for (old_term = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , old_term = cdolist_list_var.first()) {
                        if (NIL != rkf_ar_ta_admitted_argument(old_term, arg, relation, mt)) {
                            {
                                SubLObject other_terms = remove(old_term, old_terms, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                rkf_ar_ta_new_relation_arg(relation, arg, old_term, other_terms, mt);
                            }
                        }
                    }
                }
            }
        }
        return NIL;
    }

    @LispMethod(comment = "Compute agglomerations for new RELATION and OLD-TERMS")
    public static SubLObject rkf_ar_ta_new_relation(final SubLObject relation, final SubLObject old_terms, final SubLObject mt) {
        final SubLObject arg = relationship_generality_estimates.relation_most_restricted_arg(relation);
        if (NIL != arg) {
            SubLObject cdolist_list_var = old_terms;
            SubLObject old_term = NIL;
            old_term = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if (NIL != rkf_ar_ta_admitted_argument(old_term, arg, relation, mt)) {
                    final SubLObject other_terms = remove(old_term, old_terms, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    rkf_ar_ta_new_relation_arg(relation, arg, old_term, other_terms, mt);
                }
                cdolist_list_var = cdolist_list_var.rest();
                old_term = cdolist_list_var.first();
            } 
        }
        return NIL;
    }

    /**
     * Compute agglomerations for NEW-TERM using RELATION and OLD-TERMS
     */
    @LispMethod(comment = "Compute agglomerations for NEW-TERM using RELATION and OLD-TERMS")
    public static final SubLObject rkf_ar_ta_new_term_alt(SubLObject relation, SubLObject new_term, SubLObject old_terms, SubLObject mt) {
        {
            SubLObject v_arity = arity.arity(relation);
            if (NIL == v_arity) {
                v_arity = arity.min_arity(relation);
            }
            if (NIL != v_arity) {
                {
                    SubLObject index = NIL;
                    for (index = ZERO_INTEGER; index.numL(v_arity); index = add(index, ONE_INTEGER)) {
                        {
                            SubLObject arg = add(index, ONE_INTEGER);
                            if (NIL != rkf_ar_ta_admitted_argument(new_term, arg, relation, mt)) {
                                rkf_ar_ta_new_relation_arg(relation, arg, new_term, old_terms, mt);
                            }
                        }
                    }
                }
            }
        }
        return NIL;
    }

    @LispMethod(comment = "Compute agglomerations for NEW-TERM using RELATION and OLD-TERMS")
    public static SubLObject rkf_ar_ta_new_term(final SubLObject relation, final SubLObject new_term, final SubLObject old_terms, final SubLObject mt) {
        SubLObject v_arity = arity.arity(relation);
        if (NIL == v_arity) {
            v_arity = arity.min_arity(relation);
        }
        if (NIL != v_arity) {
            SubLObject index;
            SubLObject arg;
            for (index = NIL, index = ZERO_INTEGER; index.numL(v_arity); index = add(index, ONE_INTEGER)) {
                arg = add(index, ONE_INTEGER);
                if (NIL != rkf_ar_ta_admitted_argument(new_term, arg, relation, mt)) {
                    rkf_ar_ta_new_relation_arg(relation, arg, new_term, old_terms, mt);
                }
            }
        }
        return NIL;
    }

    /**
     * Compute agglomerations for TERM as argument ARG of RELATION using OLD-TERMS
     */
    @LispMethod(comment = "Compute agglomerations for TERM as argument ARG of RELATION using OLD-TERMS")
    public static final SubLObject rkf_ar_ta_new_relation_arg_alt(SubLObject relation, SubLObject arg, SubLObject v_term, SubLObject other_terms, SubLObject mt) {
        {
            SubLObject relation_arguments = relation_args_sorted_by_restriction(relation);
            SubLObject other_args = remove(arg, relation_arguments, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            SubLObject initial_assignments = list(cons(v_term, arg));
            rkf_ar_ta_assign_args_recursive(relation, other_terms, other_args, initial_assignments, mt);
        }
        return NIL;
    }

    @LispMethod(comment = "Compute agglomerations for TERM as argument ARG of RELATION using OLD-TERMS")
    public static SubLObject rkf_ar_ta_new_relation_arg(final SubLObject relation, final SubLObject arg, final SubLObject v_term, final SubLObject other_terms, final SubLObject mt) {
        final SubLObject relation_arguments = relation_args_sorted_by_restriction(relation);
        final SubLObject other_args = remove(arg, relation_arguments, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        final SubLObject initial_assignments = list(cons(v_term, arg));
        rkf_ar_ta_assign_args_recursive(relation, other_terms, other_args, initial_assignments, mt);
        return NIL;
    }

    /**
     * Recursively compute agglomerations RELATION by assiging TERMS to ARGS.
     * ASSIGNMENTS include already assumed term/arg assignments for the other arg positions.
     */
    @LispMethod(comment = "Recursively compute agglomerations RELATION by assiging TERMS to ARGS.\r\nASSIGNMENTS include already assumed term/arg assignments for the other arg positions.\nRecursively compute agglomerations RELATION by assiging TERMS to ARGS.\nASSIGNMENTS include already assumed term/arg assignments for the other arg positions.")
    public static final SubLObject rkf_ar_ta_assign_args_recursive_alt(SubLObject relation, SubLObject terms, SubLObject args, SubLObject assignments, SubLObject mt) {
        if (NIL == args) {
            rkf_ar_ta_answer(relation, assignments, mt);
        } else {
            if (NIL == terms) {
            } else {
                {
                    SubLObject next_arg = args.first();
                    SubLObject other_args = args.rest();
                    SubLObject cdolist_list_var = terms;
                    SubLObject v_term = NIL;
                    for (v_term = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , v_term = cdolist_list_var.first()) {
                        if (NIL != rkf_ar_ta_admitted_argument(v_term, next_arg, relation, mt)) {
                            {
                                SubLObject assignment = cons(v_term, next_arg);
                                SubLObject other_terms = remove(v_term, terms, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                SubLObject new_assignments = cons(assignment, assignments);
                                rkf_ar_ta_assign_args_recursive(relation, other_terms, other_args, new_assignments, mt);
                            }
                        }
                    }
                }
            }
        }
        return NIL;
    }

    @LispMethod(comment = "Recursively compute agglomerations RELATION by assiging TERMS to ARGS.\r\nASSIGNMENTS include already assumed term/arg assignments for the other arg positions.\nRecursively compute agglomerations RELATION by assiging TERMS to ARGS.\nASSIGNMENTS include already assumed term/arg assignments for the other arg positions.")
    public static SubLObject rkf_ar_ta_assign_args_recursive(final SubLObject relation, final SubLObject terms, final SubLObject args, final SubLObject assignments, final SubLObject mt) {
        if (NIL == args) {
            rkf_ar_ta_answer(relation, assignments, mt);
        } else
            if (NIL != terms) {
                final SubLObject next_arg = args.first();
                final SubLObject other_args = args.rest();
                SubLObject cdolist_list_var = terms;
                SubLObject v_term = NIL;
                v_term = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    if (NIL != rkf_ar_ta_admitted_argument(v_term, next_arg, relation, mt)) {
                        final SubLObject assignment = cons(v_term, next_arg);
                        final SubLObject other_terms = remove(v_term, terms, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        final SubLObject new_assignments = cons(assignment, assignments);
                        rkf_ar_ta_assign_args_recursive(relation, other_terms, other_args, new_assignments, mt);
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    v_term = cdolist_list_var.first();
                } 
            }

        return NIL;
    }

    /**
     * Note one successful agglomeration for RELATION using the argument ASSIGNMENTS.
     */
    @LispMethod(comment = "Note one successful agglomeration for RELATION using the argument ASSIGNMENTS.")
    public static final SubLObject rkf_ar_ta_answer_alt(SubLObject relation, SubLObject assignments, SubLObject mt) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            assignments = copy_list(assignments);
            assignments = Sort.sort(assignments, symbol_function($sym225$_), symbol_function(CDR));
            {
                SubLObject formula_args = Mapping.mapcar(symbol_function(CAR), assignments);
                SubLObject formula = make_el_formula(relation, formula_args, UNPROVIDED);
                if (NIL == list_utilities.tree_find(relation, formula_args, symbol_function(EQUAL), UNPROVIDED)) {
                    if (NIL != rkf_ar_ta_admitted_formula(formula, mt)) {
                        $mapping_answer$.setDynamicValue(cons(formula, $mapping_answer$.getDynamicValue(thread)), thread);
                    }
                }
            }
            return NIL;
        }
    }

    @LispMethod(comment = "Note one successful agglomeration for RELATION using the argument ASSIGNMENTS.")
    public static SubLObject rkf_ar_ta_answer(final SubLObject relation, SubLObject assignments, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assignments = copy_list(assignments);
        assignments = Sort.sort(assignments, symbol_function($sym246$_), symbol_function(CDR));
        final SubLObject formula_args = Mapping.mapcar(symbol_function(CAR), assignments);
        final SubLObject formula = make_el_formula(relation, formula_args, UNPROVIDED);
        if ((NIL == list_utilities.tree_find(relation, formula_args, symbol_function(EQUAL), UNPROVIDED)) && (NIL != rkf_ar_ta_admitted_formula(formula, mt))) {
            $mapping_answer$.setDynamicValue(cons(formula, $mapping_answer$.getDynamicValue(thread)), thread);
        }
        return NIL;
    }

    /**
     * Method used within the Term Agglomerator to validate TERM as ARG to RELATION in MT
     */
    @LispMethod(comment = "Method used within the Term Agglomerator to validate TERM as ARG to RELATION in MT")
    public static final SubLObject rkf_ar_ta_admitted_argument_alt(SubLObject v_term, SubLObject arg, SubLObject relation, SubLObject mt) {
        return removal_modules_admitted_formula.inference_admitted_argument(v_term, arg, relation, mt);
    }

    @LispMethod(comment = "Method used within the Term Agglomerator to validate TERM as ARG to RELATION in MT")
    public static SubLObject rkf_ar_ta_admitted_argument(final SubLObject v_term, final SubLObject arg, final SubLObject relation, final SubLObject mt) {
        return removal_modules_admitted_formula.inference_admitted_argument(v_term, arg, relation, mt);
    }

    /**
     * Method used within the Term Agglomerator to validate FORMULA in MT
     */
    @LispMethod(comment = "Method used within the Term Agglomerator to validate FORMULA in MT")
    public static final SubLObject rkf_ar_ta_admitted_formula_alt(SubLObject formula, SubLObject mt) {
        return removal_modules_admitted_formula.inference_admitted_formula(formula, mt);
    }

    @LispMethod(comment = "Method used within the Term Agglomerator to validate FORMULA in MT")
    public static SubLObject rkf_ar_ta_admitted_formula(final SubLObject formula, final SubLObject mt) {
        return removal_modules_admitted_formula.inference_admitted_formula(formula, mt);
    }

    public static final SubLObject clear_relation_args_sorted_by_restriction_alt() {
        {
            SubLObject cs = $relation_args_sorted_by_restriction_caching_state$.getGlobalValue();
            if (NIL != cs) {
                memoization_state.caching_state_clear(cs);
            }
        }
        return NIL;
    }

    public static SubLObject clear_relation_args_sorted_by_restriction() {
        final SubLObject cs = $relation_args_sorted_by_restriction_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static final SubLObject remove_relation_args_sorted_by_restriction_alt(SubLObject relation) {
        return memoization_state.caching_state_remove_function_results_with_args($relation_args_sorted_by_restriction_caching_state$.getGlobalValue(), list(relation), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject remove_relation_args_sorted_by_restriction(final SubLObject relation) {
        return memoization_state.caching_state_remove_function_results_with_args($relation_args_sorted_by_restriction_caching_state$.getGlobalValue(), list(relation), UNPROVIDED, UNPROVIDED);
    }

    /**
     * Return a list of the arg-positions of RELATION, sorted from most to least restrictive.
     */
    @LispMethod(comment = "Return a list of the arg-positions of RELATION, sorted from most to least restrictive.")
    public static final SubLObject relation_args_sorted_by_restriction_internal_alt(SubLObject relation) {
        {
            SubLObject args = all_relation_args(relation);
            SubLObject arg_pairs = NIL;
            SubLObject cdolist_list_var = args;
            SubLObject arg = NIL;
            for (arg = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , arg = cdolist_list_var.first()) {
                {
                    SubLObject arg_generality = relationship_generality_estimates.relation_arg_cardinality(relation, arg, UNPROVIDED);
                    arg_pairs = cons(list(arg, arg_generality), arg_pairs);
                }
            }
            arg_pairs = Sort.sort(arg_pairs, symbol_function($sym225$_), symbol_function(SECOND));
            {
                SubLObject rest_arg_pairs = NIL;
                for (rest_arg_pairs = arg_pairs; !rest_arg_pairs.isAtom(); rest_arg_pairs = rest_arg_pairs.rest()) {
                    rplaca(rest_arg_pairs, caar(rest_arg_pairs));
                }
            }
            return arg_pairs;
        }
    }

    @LispMethod(comment = "Return a list of the arg-positions of RELATION, sorted from most to least restrictive.")
    public static SubLObject relation_args_sorted_by_restriction_internal(final SubLObject relation) {
        final SubLObject args = all_relation_args(relation);
        SubLObject arg_pairs = NIL;
        SubLObject cdolist_list_var = args;
        SubLObject arg = NIL;
        arg = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject arg_generality = relationship_generality_estimates.relation_arg_cardinality(relation, arg, UNPROVIDED);
            arg_pairs = cons(list(arg, arg_generality), arg_pairs);
            cdolist_list_var = cdolist_list_var.rest();
            arg = cdolist_list_var.first();
        } 
        arg_pairs = Sort.sort(arg_pairs, symbol_function($sym246$_), symbol_function(SECOND));
        SubLObject rest_arg_pairs;
        for (rest_arg_pairs = NIL, rest_arg_pairs = arg_pairs; !rest_arg_pairs.isAtom(); rest_arg_pairs = rest_arg_pairs.rest()) {
            rplaca(rest_arg_pairs, caar(rest_arg_pairs));
        }
        return arg_pairs;
    }

    public static final SubLObject relation_args_sorted_by_restriction_alt(SubLObject relation) {
        {
            SubLObject caching_state = $relation_args_sorted_by_restriction_caching_state$.getGlobalValue();
            if (NIL == caching_state) {
                caching_state = memoization_state.create_global_caching_state_for_name(RELATION_ARGS_SORTED_BY_RESTRICTION, $relation_args_sorted_by_restriction_caching_state$, NIL, EQL, ONE_INTEGER, TEN_INTEGER);
            }
            {
                SubLObject results = memoization_state.caching_state_lookup(caching_state, relation, $kw305$_MEMOIZED_ITEM_NOT_FOUND_);
                if (results == $kw305$_MEMOIZED_ITEM_NOT_FOUND_) {
                    results = arg2(resetMultipleValues(), multiple_value_list(relation_args_sorted_by_restriction_internal(relation)));
                    memoization_state.caching_state_put(caching_state, relation, results, UNPROVIDED);
                }
                return memoization_state.caching_results(results);
            }
        }
    }

    public static SubLObject relation_args_sorted_by_restriction(final SubLObject relation) {
        SubLObject caching_state = $relation_args_sorted_by_restriction_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(RELATION_ARGS_SORTED_BY_RESTRICTION, $relation_args_sorted_by_restriction_caching_state$, $int$64, EQL, ONE_INTEGER, TEN_INTEGER);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, relation, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(resetMultipleValues(), multiple_value_list(relation_args_sorted_by_restriction_internal(relation)));
            memoization_state.caching_state_put(caching_state, relation, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    public static final SubLObject clear_all_relation_args_alt() {
        {
            SubLObject cs = $all_relation_args_caching_state$.getGlobalValue();
            if (NIL != cs) {
                memoization_state.caching_state_clear(cs);
            }
        }
        return NIL;
    }

    public static SubLObject clear_all_relation_args() {
        final SubLObject cs = $all_relation_args_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static final SubLObject remove_all_relation_args_alt(SubLObject relation) {
        return memoization_state.caching_state_remove_function_results_with_args($all_relation_args_caching_state$.getGlobalValue(), list(relation), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject remove_all_relation_args(final SubLObject relation) {
        return memoization_state.caching_state_remove_function_results_with_args($all_relation_args_caching_state$.getGlobalValue(), list(relation), UNPROVIDED, UNPROVIDED);
    }

    /**
     * Return a list of all the arg-positions of RELATION.
     */
    @LispMethod(comment = "Return a list of all the arg-positions of RELATION.")
    public static final SubLObject all_relation_args_internal_alt(SubLObject relation) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_answer = NIL;
                {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                        mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                        {
                            SubLObject v_arity = arity.arity(relation);
                            if (NIL == v_arity) {
                                v_arity = arity.min_arity(relation);
                            }
                            if (NIL != v_arity) {
                                {
                                    SubLObject i = NIL;
                                    for (i = ZERO_INTEGER; i.numL(v_arity); i = add(i, ONE_INTEGER)) {
                                        v_answer = cons(add(i, ONE_INTEGER), v_answer);
                                    }
                                }
                            }
                        }
                    } finally {
                        mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                    }
                }
                return nreverse(v_answer);
            }
        }
    }

    @LispMethod(comment = "Return a list of all the arg-positions of RELATION.")
    public static SubLObject all_relation_args_internal(final SubLObject relation) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject v_answer = NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
            SubLObject v_arity = arity.arity(relation);
            if (NIL == v_arity) {
                v_arity = arity.min_arity(relation);
            }
            if (NIL != v_arity) {
                SubLObject i;
                for (i = NIL, i = ZERO_INTEGER; i.numL(v_arity); i = add(i, ONE_INTEGER)) {
                    v_answer = cons(add(i, ONE_INTEGER), v_answer);
                }
            }
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return nreverse(v_answer);
    }

    public static final SubLObject all_relation_args_alt(SubLObject relation) {
        {
            SubLObject caching_state = $all_relation_args_caching_state$.getGlobalValue();
            if (NIL == caching_state) {
                caching_state = memoization_state.create_global_caching_state_for_name(ALL_RELATION_ARGS, $all_relation_args_caching_state$, NIL, EQL, ONE_INTEGER, TEN_INTEGER);
            }
            {
                SubLObject results = memoization_state.caching_state_lookup(caching_state, relation, $kw305$_MEMOIZED_ITEM_NOT_FOUND_);
                if (results == $kw305$_MEMOIZED_ITEM_NOT_FOUND_) {
                    results = arg2(resetMultipleValues(), multiple_value_list(all_relation_args_internal(relation)));
                    memoization_state.caching_state_put(caching_state, relation, results, UNPROVIDED);
                }
                return memoization_state.caching_results(results);
            }
        }
    }

    public static SubLObject all_relation_args(final SubLObject relation) {
        SubLObject caching_state = $all_relation_args_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(ALL_RELATION_ARGS, $all_relation_args_caching_state$, $int$64, EQL, ONE_INTEGER, TEN_INTEGER);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, relation, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(resetMultipleValues(), multiple_value_list(all_relation_args_internal(relation)));
            memoization_state.caching_state_put(caching_state, relation, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    public static SubLObject declare_rkf_assisted_reader_file() {
        declareMacro("with_ar_lock", "WITH-AR-LOCK");
        declareFunction("ar_sentence_print_function_trampoline", "AR-SENTENCE-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction("ar_sentence_p", "AR-SENTENCE-P", 1, 0, false);
        new rkf_assisted_reader.$ar_sentence_p$UnaryFunction();
        declareFunction("ar_sentence_id", "AR-SENTENCE-ID", 1, 0, false);
        declareFunction("ar_sentence_plaintext", "AR-SENTENCE-PLAINTEXT", 1, 0, false);
        declareFunction("ar_sentence_token_vector", "AR-SENTENCE-TOKEN-VECTOR", 1, 0, false);
        declareFunction("ar_sentence_clarifications", "AR-SENTENCE-CLARIFICATIONS", 1, 0, false);
        declareFunction("ar_sentence_source_sentence", "AR-SENTENCE-SOURCE-SENTENCE", 1, 0, false);
        declareFunction("ar_sentence_phrases", "AR-SENTENCE-PHRASES", 1, 0, false);
        declareFunction("_csetf_ar_sentence_id", "_CSETF-AR-SENTENCE-ID", 2, 0, false);
        declareFunction("_csetf_ar_sentence_plaintext", "_CSETF-AR-SENTENCE-PLAINTEXT", 2, 0, false);
        declareFunction("_csetf_ar_sentence_token_vector", "_CSETF-AR-SENTENCE-TOKEN-VECTOR", 2, 0, false);
        declareFunction("_csetf_ar_sentence_clarifications", "_CSETF-AR-SENTENCE-CLARIFICATIONS", 2, 0, false);
        declareFunction("_csetf_ar_sentence_source_sentence", "_CSETF-AR-SENTENCE-SOURCE-SENTENCE", 2, 0, false);
        declareFunction("_csetf_ar_sentence_phrases", "_CSETF-AR-SENTENCE-PHRASES", 2, 0, false);
        declareFunction("make_ar_sentence", "MAKE-AR-SENTENCE", 0, 1, false);
        declareFunction("visit_defstruct_ar_sentence", "VISIT-DEFSTRUCT-AR-SENTENCE", 2, 0, false);
        declareFunction("visit_defstruct_object_ar_sentence_method", "VISIT-DEFSTRUCT-OBJECT-AR-SENTENCE-METHOD", 2, 0, false);
        declareFunction("sxhash_ar_sentence_method", "SXHASH-AR-SENTENCE-METHOD", 1, 0, false);
        declareFunction("new_ar_sentence", "NEW-AR-SENTENCE", 2, 0, false);
        declareFunction("note_ar_sentence_token_vector", "NOTE-AR-SENTENCE-TOKEN-VECTOR", 2, 0, false);
        declareFunction("add_ar_sentence_phrase", "ADD-AR-SENTENCE-PHRASE", 2, 0, false);
        declareFunction("add_ar_sentence_clarification", "ADD-AR-SENTENCE-CLARIFICATION", 2, 0, false);
        declareFunction("note_ar_sentence_source_sentence", "NOTE-AR-SENTENCE-SOURCE-SENTENCE", 2, 0, false);
        declareFunction("ar_token_print_function_trampoline", "AR-TOKEN-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction("ar_token_p", "AR-TOKEN-P", 1, 0, false);
        new rkf_assisted_reader.$ar_token_p$UnaryFunction();
        declareFunction("ar_token_id", "AR-TOKEN-ID", 1, 0, false);
        declareFunction("ar_token_text", "AR-TOKEN-TEXT", 1, 0, false);
        declareFunction("ar_token_sentence", "AR-TOKEN-SENTENCE", 1, 0, false);
        declareFunction("ar_token_number", "AR-TOKEN-NUMBER", 1, 0, false);
        declareFunction("ar_token_phrases", "AR-TOKEN-PHRASES", 1, 0, false);
        declareFunction("_csetf_ar_token_id", "_CSETF-AR-TOKEN-ID", 2, 0, false);
        declareFunction("_csetf_ar_token_text", "_CSETF-AR-TOKEN-TEXT", 2, 0, false);
        declareFunction("_csetf_ar_token_sentence", "_CSETF-AR-TOKEN-SENTENCE", 2, 0, false);
        declareFunction("_csetf_ar_token_number", "_CSETF-AR-TOKEN-NUMBER", 2, 0, false);
        declareFunction("_csetf_ar_token_phrases", "_CSETF-AR-TOKEN-PHRASES", 2, 0, false);
        declareFunction("make_ar_token", "MAKE-AR-TOKEN", 0, 1, false);
        declareFunction("visit_defstruct_ar_token", "VISIT-DEFSTRUCT-AR-TOKEN", 2, 0, false);
        declareFunction("visit_defstruct_object_ar_token_method", "VISIT-DEFSTRUCT-OBJECT-AR-TOKEN-METHOD", 2, 0, false);
        declareFunction("print_ar_token", "PRINT-AR-TOKEN", 3, 0, false);
        declareFunction("sxhash_ar_token_method", "SXHASH-AR-TOKEN-METHOD", 1, 0, false);
        declareFunction("new_ar_token", "NEW-AR-TOKEN", 4, 0, false);
        declareFunction("add_ar_token_phrase", "ADD-AR-TOKEN-PHRASE", 2, 0, false);
        declareFunction("ar_phrase_print_function_trampoline", "AR-PHRASE-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction("ar_phrase_p", "AR-PHRASE-P", 1, 0, false);
        new rkf_assisted_reader.$ar_phrase_p$UnaryFunction();
        declareFunction("ar_phrase_id", "AR-PHRASE-ID", 1, 0, false);
        declareFunction("ar_phrase_status", "AR-PHRASE-STATUS", 1, 0, false);
        declareFunction("ar_phrase_token_list", "AR-PHRASE-TOKEN-LIST", 1, 0, false);
        declareFunction("ar_phrase_sentence", "AR-PHRASE-SENTENCE", 1, 0, false);
        declareFunction("ar_phrase_concepts", "AR-PHRASE-CONCEPTS", 1, 0, false);
        declareFunction("ar_phrase_rejected_concepts", "AR-PHRASE-REJECTED-CONCEPTS", 1, 0, false);
        declareFunction("ar_phrase_disambiguated_concept", "AR-PHRASE-DISAMBIGUATED-CONCEPT", 1, 0, false);
        declareFunction("ar_phrase_surrogate", "AR-PHRASE-SURROGATE", 1, 0, false);
        declareFunction("ar_phrase_constraint", "AR-PHRASE-CONSTRAINT", 1, 0, false);
        declareFunction("ar_phrase_force", "AR-PHRASE-FORCE", 1, 0, false);
        declareFunction("_csetf_ar_phrase_id", "_CSETF-AR-PHRASE-ID", 2, 0, false);
        declareFunction("_csetf_ar_phrase_status", "_CSETF-AR-PHRASE-STATUS", 2, 0, false);
        declareFunction("_csetf_ar_phrase_token_list", "_CSETF-AR-PHRASE-TOKEN-LIST", 2, 0, false);
        declareFunction("_csetf_ar_phrase_sentence", "_CSETF-AR-PHRASE-SENTENCE", 2, 0, false);
        declareFunction("_csetf_ar_phrase_concepts", "_CSETF-AR-PHRASE-CONCEPTS", 2, 0, false);
        declareFunction("_csetf_ar_phrase_rejected_concepts", "_CSETF-AR-PHRASE-REJECTED-CONCEPTS", 2, 0, false);
        declareFunction("_csetf_ar_phrase_disambiguated_concept", "_CSETF-AR-PHRASE-DISAMBIGUATED-CONCEPT", 2, 0, false);
        declareFunction("_csetf_ar_phrase_surrogate", "_CSETF-AR-PHRASE-SURROGATE", 2, 0, false);
        declareFunction("_csetf_ar_phrase_constraint", "_CSETF-AR-PHRASE-CONSTRAINT", 2, 0, false);
        declareFunction("_csetf_ar_phrase_force", "_CSETF-AR-PHRASE-FORCE", 2, 0, false);
        declareFunction("make_ar_phrase", "MAKE-AR-PHRASE", 0, 1, false);
        declareFunction("visit_defstruct_ar_phrase", "VISIT-DEFSTRUCT-AR-PHRASE", 2, 0, false);
        declareFunction("visit_defstruct_object_ar_phrase_method", "VISIT-DEFSTRUCT-OBJECT-AR-PHRASE-METHOD", 2, 0, false);
        declareFunction("print_ar_phrase", "PRINT-AR-PHRASE", 3, 0, false);
        declareFunction("sxhash_ar_phrase_method", "SXHASH-AR-PHRASE-METHOD", 1, 0, false);
        declareFunction("new_ar_phrase", "NEW-AR-PHRASE", 3, 0, false);
        declareFunction("add_ar_phrase_concept", "ADD-AR-PHRASE-CONCEPT", 2, 0, false);
        declareFunction("remove_ar_phrase_concept", "REMOVE-AR-PHRASE-CONCEPT", 2, 0, false);
        declareFunction("add_ar_phrase_rejected_concept", "ADD-AR-PHRASE-REJECTED-CONCEPT", 2, 0, false);
        declareFunction("clear_ar_phrase_disambiguated_concept", "CLEAR-AR-PHRASE-DISAMBIGUATED-CONCEPT", 1, 0, false);
        declareFunction("note_ar_phrase_disambiguated_concept", "NOTE-AR-PHRASE-DISAMBIGUATED-CONCEPT", 2, 0, false);
        declareFunction("note_ar_phrase_status", "NOTE-AR-PHRASE-STATUS", 2, 0, false);
        declareFunction("note_ar_phrase_force", "NOTE-AR-PHRASE-FORCE", 2, 0, false);
        declareFunction("note_ar_phrase_surrogate", "NOTE-AR-PHRASE-SURROGATE", 2, 0, false);
        declareFunction("note_ar_phrase_constraint", "NOTE-AR-PHRASE-CONSTRAINT", 2, 0, false);
        declareFunction("compute_ar_phrase_force", "COMPUTE-AR-PHRASE-FORCE", 1, 2, false);
        declareFunction("ar_phrase_has_non_surrogate_conceptsP", "AR-PHRASE-HAS-NON-SURROGATE-CONCEPTS?", 1, 0, false);
        declareFunction("ar_phrase_token_count", "AR-PHRASE-TOKEN-COUNT", 1, 0, false);
        declareFunction("ar_concept_print_function_trampoline", "AR-CONCEPT-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction("ar_concept_p", "AR-CONCEPT-P", 1, 0, false);
        new rkf_assisted_reader.$ar_concept_p$UnaryFunction();
        declareFunction("ar_concept_id", "AR-CONCEPT-ID", 1, 0, false);
        declareFunction("ar_concept_cycl", "AR-CONCEPT-CYCL", 1, 0, false);
        declareFunction("ar_concept_disambiguation_text", "AR-CONCEPT-DISAMBIGUATION-TEXT", 1, 0, false);
        declareFunction("ar_concept_phrases", "AR-CONCEPT-PHRASES", 1, 0, false);
        declareFunction("ar_concept_parts", "AR-CONCEPT-PARTS", 1, 0, false);
        declareFunction("ar_concept_agglomerations", "AR-CONCEPT-AGGLOMERATIONS", 1, 0, false);
        declareFunction("ar_concept_force", "AR-CONCEPT-FORCE", 1, 0, false);
        declareFunction("ar_concept_confidence", "AR-CONCEPT-CONFIDENCE", 1, 0, false);
        declareFunction("ar_concept_open_term_score", "AR-CONCEPT-OPEN-TERM-SCORE", 1, 0, false);
        declareFunction("_csetf_ar_concept_id", "_CSETF-AR-CONCEPT-ID", 2, 0, false);
        declareFunction("_csetf_ar_concept_cycl", "_CSETF-AR-CONCEPT-CYCL", 2, 0, false);
        declareFunction("_csetf_ar_concept_disambiguation_text", "_CSETF-AR-CONCEPT-DISAMBIGUATION-TEXT", 2, 0, false);
        declareFunction("_csetf_ar_concept_phrases", "_CSETF-AR-CONCEPT-PHRASES", 2, 0, false);
        declareFunction("_csetf_ar_concept_parts", "_CSETF-AR-CONCEPT-PARTS", 2, 0, false);
        declareFunction("_csetf_ar_concept_agglomerations", "_CSETF-AR-CONCEPT-AGGLOMERATIONS", 2, 0, false);
        declareFunction("_csetf_ar_concept_force", "_CSETF-AR-CONCEPT-FORCE", 2, 0, false);
        declareFunction("_csetf_ar_concept_confidence", "_CSETF-AR-CONCEPT-CONFIDENCE", 2, 0, false);
        declareFunction("_csetf_ar_concept_open_term_score", "_CSETF-AR-CONCEPT-OPEN-TERM-SCORE", 2, 0, false);
        declareFunction("make_ar_concept", "MAKE-AR-CONCEPT", 0, 1, false);
        declareFunction("visit_defstruct_ar_concept", "VISIT-DEFSTRUCT-AR-CONCEPT", 2, 0, false);
        declareFunction("visit_defstruct_object_ar_concept_method", "VISIT-DEFSTRUCT-OBJECT-AR-CONCEPT-METHOD", 2, 0, false);
        declareFunction("print_ar_concept", "PRINT-AR-CONCEPT", 3, 0, false);
        declareFunction("sxhash_ar_concept_method", "SXHASH-AR-CONCEPT-METHOD", 1, 0, false);
        declareFunction("new_ar_concept", "NEW-AR-CONCEPT", 2, 0, false);
        declareFunction("clone_ar_concept", "CLONE-AR-CONCEPT", 3, 0, false);
        declareFunction("rkf_ar_act_clone_augment_concept", "RKF-AR-ACT-CLONE-AUGMENT-CONCEPT", 3, 0, false);
        declareFunction("add_ar_concept_phrase", "ADD-AR-CONCEPT-PHRASE", 2, 0, false);
        declareFunction("add_ar_concept_part", "ADD-AR-CONCEPT-PART", 2, 0, false);
        declareFunction("rem_ar_concept_part", "REM-AR-CONCEPT-PART", 2, 0, false);
        declareFunction("add_ar_concept_agglomeration", "ADD-AR-CONCEPT-AGGLOMERATION", 2, 0, false);
        declareFunction("rem_ar_concept_agglomeration", "REM-AR-CONCEPT-AGGLOMERATION", 2, 0, false);
        declareFunction("note_ar_concept_disambiguation_text", "NOTE-AR-CONCEPT-DISAMBIGUATION-TEXT", 2, 0, false);
        declareFunction("replace_ar_concept_cycl", "REPLACE-AR-CONCEPT-CYCL", 2, 0, false);
        declareFunction("subst_ar_concept_cycl", "SUBST-AR-CONCEPT-CYCL", 3, 0, false);
        declareFunction("note_ar_concept_force", "NOTE-AR-CONCEPT-FORCE", 2, 0, false);
        declareFunction("ar_concept_queryP", "AR-CONCEPT-QUERY?", 1, 0, false);
        declareFunction("ar_concept_assertionP", "AR-CONCEPT-ASSERTION?", 1, 0, false);
        declareFunction("note_ar_concept_confidence", "NOTE-AR-CONCEPT-CONFIDENCE", 2, 0, false);
        declareFunction("note_ar_concept_open_term_score", "NOTE-AR-CONCEPT-OPEN-TERM-SCORE", 2, 0, false);
        declareFunction("ar_template_print_function_trampoline", "AR-TEMPLATE-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction("ar_template_p", "AR-TEMPLATE-P", 1, 0, false);
        new rkf_assisted_reader.$ar_template_p$UnaryFunction();
        declareFunction("ar_template_id", "AR-TEMPLATE-ID", 1, 0, false);
        declareFunction("ar_template_concept", "AR-TEMPLATE-CONCEPT", 1, 0, false);
        declareFunction("ar_template_formula", "AR-TEMPLATE-FORMULA", 1, 0, false);
        declareFunction("ar_template_prompt", "AR-TEMPLATE-PROMPT", 1, 0, false);
        declareFunction("ar_template_choice_table", "AR-TEMPLATE-CHOICE-TABLE", 1, 0, false);
        declareFunction("ar_template_agglomerations", "AR-TEMPLATE-AGGLOMERATIONS", 1, 0, false);
        declareFunction("_csetf_ar_template_id", "_CSETF-AR-TEMPLATE-ID", 2, 0, false);
        declareFunction("_csetf_ar_template_concept", "_CSETF-AR-TEMPLATE-CONCEPT", 2, 0, false);
        declareFunction("_csetf_ar_template_formula", "_CSETF-AR-TEMPLATE-FORMULA", 2, 0, false);
        declareFunction("_csetf_ar_template_prompt", "_CSETF-AR-TEMPLATE-PROMPT", 2, 0, false);
        declareFunction("_csetf_ar_template_choice_table", "_CSETF-AR-TEMPLATE-CHOICE-TABLE", 2, 0, false);
        declareFunction("_csetf_ar_template_agglomerations", "_CSETF-AR-TEMPLATE-AGGLOMERATIONS", 2, 0, false);
        declareFunction("make_ar_template", "MAKE-AR-TEMPLATE", 0, 1, false);
        declareFunction("visit_defstruct_ar_template", "VISIT-DEFSTRUCT-AR-TEMPLATE", 2, 0, false);
        declareFunction("visit_defstruct_object_ar_template_method", "VISIT-DEFSTRUCT-OBJECT-AR-TEMPLATE-METHOD", 2, 0, false);
        declareFunction("sxhash_ar_template_method", "SXHASH-AR-TEMPLATE-METHOD", 1, 0, false);
        declareFunction("new_ar_template", "NEW-AR-TEMPLATE", 2, 0, false);
        declareFunction("note_ar_template_formula", "NOTE-AR-TEMPLATE-FORMULA", 2, 0, false);
        declareFunction("note_ar_template_prompt", "NOTE-AR-TEMPLATE-PROMPT", 2, 0, false);
        declareFunction("note_ar_template_choice_table", "NOTE-AR-TEMPLATE-CHOICE-TABLE", 2, 0, false);
        declareFunction("add_ar_template_agglomeration", "ADD-AR-TEMPLATE-AGGLOMERATION", 2, 0, false);
        declareFunction("ar_state_print_function_trampoline", "AR-STATE-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction("ar_state_p", "AR-STATE-P", 1, 0, false);
        new rkf_assisted_reader.$ar_state_p$UnaryFunction();
        declareFunction("ar_state_isg", "AR-STATE-ISG", 1, 0, false);
        declareFunction("ar_state_index", "AR-STATE-INDEX", 1, 0, false);
        declareFunction("ar_state_source_sentences", "AR-STATE-SOURCE-SENTENCES", 1, 0, false);
        declareFunction("ar_state_focus_sentence", "AR-STATE-FOCUS-SENTENCE", 1, 0, false);
        declareFunction("ar_state_completed_sentences", "AR-STATE-COMPLETED-SENTENCES", 1, 0, false);
        declareFunction("ar_state_unknown_phrases", "AR-STATE-UNKNOWN-PHRASES", 1, 0, false);
        declareFunction("ar_state_rejected_phrases", "AR-STATE-REJECTED-PHRASES", 1, 0, false);
        declareFunction("ar_state_irrelevant_phrases", "AR-STATE-IRRELEVANT-PHRASES", 1, 0, false);
        declareFunction("ar_state_ambiguous_phrases", "AR-STATE-AMBIGUOUS-PHRASES", 1, 0, false);
        declareFunction("ar_state_assumed_phrases", "AR-STATE-ASSUMED-PHRASES", 1, 0, false);
        declareFunction("ar_state_pending_phrases", "AR-STATE-PENDING-PHRASES", 1, 0, false);
        declareFunction("ar_state_accepted_phrases", "AR-STATE-ACCEPTED-PHRASES", 1, 0, false);
        declareFunction("ar_state_pending_concepts", "AR-STATE-PENDING-CONCEPTS", 1, 0, false);
        declareFunction("ar_state_accepted_concepts", "AR-STATE-ACCEPTED-CONCEPTS", 1, 0, false);
        declareFunction("ar_state_candidate_cycls", "AR-STATE-CANDIDATE-CYCLS", 1, 0, false);
        declareFunction("ar_state_asserted_assertions", "AR-STATE-ASSERTED-ASSERTIONS", 1, 0, false);
        declareFunction("ar_state_term_templates", "AR-STATE-TERM-TEMPLATES", 1, 0, false);
        declareFunction("ar_state_assert_templates", "AR-STATE-ASSERT-TEMPLATES", 1, 0, false);
        declareFunction("_csetf_ar_state_isg", "_CSETF-AR-STATE-ISG", 2, 0, false);
        declareFunction("_csetf_ar_state_index", "_CSETF-AR-STATE-INDEX", 2, 0, false);
        declareFunction("_csetf_ar_state_source_sentences", "_CSETF-AR-STATE-SOURCE-SENTENCES", 2, 0, false);
        declareFunction("_csetf_ar_state_focus_sentence", "_CSETF-AR-STATE-FOCUS-SENTENCE", 2, 0, false);
        declareFunction("_csetf_ar_state_completed_sentences", "_CSETF-AR-STATE-COMPLETED-SENTENCES", 2, 0, false);
        declareFunction("_csetf_ar_state_unknown_phrases", "_CSETF-AR-STATE-UNKNOWN-PHRASES", 2, 0, false);
        declareFunction("_csetf_ar_state_rejected_phrases", "_CSETF-AR-STATE-REJECTED-PHRASES", 2, 0, false);
        declareFunction("_csetf_ar_state_irrelevant_phrases", "_CSETF-AR-STATE-IRRELEVANT-PHRASES", 2, 0, false);
        declareFunction("_csetf_ar_state_ambiguous_phrases", "_CSETF-AR-STATE-AMBIGUOUS-PHRASES", 2, 0, false);
        declareFunction("_csetf_ar_state_assumed_phrases", "_CSETF-AR-STATE-ASSUMED-PHRASES", 2, 0, false);
        declareFunction("_csetf_ar_state_pending_phrases", "_CSETF-AR-STATE-PENDING-PHRASES", 2, 0, false);
        declareFunction("_csetf_ar_state_accepted_phrases", "_CSETF-AR-STATE-ACCEPTED-PHRASES", 2, 0, false);
        declareFunction("_csetf_ar_state_pending_concepts", "_CSETF-AR-STATE-PENDING-CONCEPTS", 2, 0, false);
        declareFunction("_csetf_ar_state_accepted_concepts", "_CSETF-AR-STATE-ACCEPTED-CONCEPTS", 2, 0, false);
        declareFunction("_csetf_ar_state_candidate_cycls", "_CSETF-AR-STATE-CANDIDATE-CYCLS", 2, 0, false);
        declareFunction("_csetf_ar_state_asserted_assertions", "_CSETF-AR-STATE-ASSERTED-ASSERTIONS", 2, 0, false);
        declareFunction("_csetf_ar_state_term_templates", "_CSETF-AR-STATE-TERM-TEMPLATES", 2, 0, false);
        declareFunction("_csetf_ar_state_assert_templates", "_CSETF-AR-STATE-ASSERT-TEMPLATES", 2, 0, false);
        declareFunction("make_ar_state", "MAKE-AR-STATE", 0, 1, false);
        declareFunction("visit_defstruct_ar_state", "VISIT-DEFSTRUCT-AR-STATE", 2, 0, false);
        declareFunction("visit_defstruct_object_ar_state_method", "VISIT-DEFSTRUCT-OBJECT-AR-STATE-METHOD", 2, 0, false);
        declareFunction("new_ar_state", "NEW-AR-STATE", 0, 0, false);
        declareFunction("ar_reset", "AR-RESET", 1, 0, false);
        declareFunction("next_ar_state_id", "NEXT-AR-STATE-ID", 1, 0, false);
        declareFunction("add_ar_object_index", "ADD-AR-OBJECT-INDEX", 3, 0, false);
        declareFunction("find_ar_object", "FIND-AR-OBJECT", 2, 0, false);
        declareFunction("find_ar_sentence", "FIND-AR-SENTENCE", 2, 0, false);
        declareFunction("find_ar_token", "FIND-AR-TOKEN", 2, 0, false);
        declareFunction("find_ar_phrase", "FIND-AR-PHRASE", 2, 0, false);
        declareFunction("find_ar_concept", "FIND-AR-CONCEPT", 2, 0, false);
        declareFunction("find_ar_template", "FIND-AR-TEMPLATE", 2, 0, false);
        declareFunction("add_ar_state_source_sentence", "ADD-AR-STATE-SOURCE-SENTENCE", 2, 0, false);
        declareFunction("clear_ar_state_focus_sentence", "CLEAR-AR-STATE-FOCUS-SENTENCE", 1, 0, false);
        declareFunction("note_ar_state_focus_sentence", "NOTE-AR-STATE-FOCUS-SENTENCE", 2, 0, false);
        declareFunction("ar_state_force", "AR-STATE-FORCE", 1, 0, false);
        declareFunction("ar_phrase_span_lengthG", "AR-PHRASE-SPAN-LENGTH>", 2, 0, false);
        declareFunction("add_ar_state_completed_sentence", "ADD-AR-STATE-COMPLETED-SENTENCE", 2, 0, false);
        declareFunction("add_ar_state_unknown_phrase", "ADD-AR-STATE-UNKNOWN-PHRASE", 2, 0, false);
        declareFunction("rem_ar_state_unknown_phrase", "REM-AR-STATE-UNKNOWN-PHRASE", 2, 0, false);
        declareFunction("add_ar_state_rejected_phrase", "ADD-AR-STATE-REJECTED-PHRASE", 2, 0, false);
        declareFunction("rem_ar_state_rejected_phrase", "REM-AR-STATE-REJECTED-PHRASE", 2, 0, false);
        declareFunction("add_ar_state_irrelevant_phrase", "ADD-AR-STATE-IRRELEVANT-PHRASE", 2, 0, false);
        declareFunction("rem_ar_state_irrelevant_phrase", "REM-AR-STATE-IRRELEVANT-PHRASE", 2, 0, false);
        declareFunction("add_ar_state_ambiguous_phrase", "ADD-AR-STATE-AMBIGUOUS-PHRASE", 2, 0, false);
        declareFunction("rem_ar_state_ambiguous_phrase", "REM-AR-STATE-AMBIGUOUS-PHRASE", 2, 0, false);
        declareFunction("add_ar_state_assumed_phrase", "ADD-AR-STATE-ASSUMED-PHRASE", 2, 0, false);
        declareFunction("rem_ar_state_assumed_phrase", "REM-AR-STATE-ASSUMED-PHRASE", 2, 0, false);
        declareFunction("add_ar_state_pending_phrase", "ADD-AR-STATE-PENDING-PHRASE", 2, 0, false);
        declareFunction("rem_ar_state_pending_phrase", "REM-AR-STATE-PENDING-PHRASE", 2, 0, false);
        declareFunction("add_ar_state_accepted_phrase", "ADD-AR-STATE-ACCEPTED-PHRASE", 2, 0, false);
        declareFunction("rem_ar_state_accepted_phrase", "REM-AR-STATE-ACCEPTED-PHRASE", 2, 0, false);
        declareFunction("add_ar_state_accepted_concept", "ADD-AR-STATE-ACCEPTED-CONCEPT", 2, 0, false);
        declareFunction("rem_ar_state_accepted_concept", "REM-AR-STATE-ACCEPTED-CONCEPT", 2, 0, false);
        declareFunction("add_ar_state_pending_concept", "ADD-AR-STATE-PENDING-CONCEPT", 2, 0, false);
        declareFunction("rem_ar_state_pending_concept", "REM-AR-STATE-PENDING-CONCEPT", 2, 0, false);
        declareFunction("ar_state_candidate_assertions", "AR-STATE-CANDIDATE-ASSERTIONS", 1, 0, false);
        declareFunction("ar_state_candidate_queries", "AR-STATE-CANDIDATE-QUERIES", 1, 0, false);
        declareFunction("add_ar_state_candidate_cycl", "ADD-AR-STATE-CANDIDATE-CYCL", 2, 0, false);
        declareFunction("add_ar_state_candidate_assertion", "ADD-AR-STATE-CANDIDATE-ASSERTION", 2, 0, false);
        declareFunction("add_ar_state_candidate_query", "ADD-AR-STATE-CANDIDATE-QUERY", 2, 0, false);
        declareFunction("rem_ar_state_candidate_assertion", "REM-AR-STATE-CANDIDATE-ASSERTION", 2, 0, false);
        declareFunction("rem_ar_state_candidate_query", "REM-AR-STATE-CANDIDATE-QUERY", 2, 0, false);
        declareFunction("add_ar_state_asserted_assertion", "ADD-AR-STATE-ASSERTED-ASSERTION", 2, 0, false);
        declareFunction("rem_ar_state_asserted_assertion", "REM-AR-STATE-ASSERTED-ASSERTION", 2, 0, false);
        declareFunction("add_ar_state_term_template", "ADD-AR-STATE-TERM-TEMPLATE", 2, 0, false);
        declareFunction("rem_ar_state_term_template", "REM-AR-STATE-TERM-TEMPLATE", 2, 0, false);
        declareFunction("add_ar_state_assert_template", "ADD-AR-STATE-ASSERT-TEMPLATE", 2, 0, false);
        declareFunction("rem_ar_state_assert_template", "REM-AR-STATE-ASSERT-TEMPLATE", 2, 0, false);
        declareFunction("ar_state_top_level_parsesP", "AR-STATE-TOP-LEVEL-PARSES?", 1, 0, false);
        declareFunction("ar_sentence_completed_p", "AR-SENTENCE-COMPLETED-P", 2, 0, false);
        declareFunction("ar_source_sentence_p", "AR-SOURCE-SENTENCE-P", 1, 0, false);
        declareFunction("ar_clarification_sentence_p", "AR-CLARIFICATION-SENTENCE-P", 1, 0, false);
        declareFunction("ar_source_sentence_number", "AR-SOURCE-SENTENCE-NUMBER", 2, 0, false);
        declareFunction("ar_clarification_sentence_number", "AR-CLARIFICATION-SENTENCE-NUMBER", 2, 0, false);
        declareFunction("ar_determine_source_sentence", "AR-DETERMINE-SOURCE-SENTENCE", 1, 0, false);
        declareFunction("ar_determine_concept_sentences", "AR-DETERMINE-CONCEPT-SENTENCES", 1, 0, false);
        declareFunction("ar_determine_concept_sentences_recursive", "AR-DETERMINE-CONCEPT-SENTENCES-RECURSIVE", 2, 0, false);
        declareFunction("ar_sentence_assumed_phrase_count", "AR-SENTENCE-ASSUMED-PHRASE-COUNT", 2, 0, false);
        declareFunction("ar_state_next_assumed_phrase", "AR-STATE-NEXT-ASSUMED-PHRASE", 1, 0, false);
        declareFunction("ar_state_next_unknown_phrase", "AR-STATE-NEXT-UNKNOWN-PHRASE", 1, 0, false);
        declareFunction("ar_state_select_most_promising_unknown_phrase", "AR-STATE-SELECT-MOST-PROMISING-UNKNOWN-PHRASE", 1, 0, false);
        declareFunction("ar_state_pending_implied_indexicals", "AR-STATE-PENDING-IMPLIED-INDEXICALS", 1, 0, false);
        declareFunction("ar_state_next_implied_indexical", "AR-STATE-NEXT-IMPLIED-INDEXICAL", 1, 0, false);
        declareFunction("ar_sentence_ambiguous_phrase_count", "AR-SENTENCE-AMBIGUOUS-PHRASE-COUNT", 2, 0, false);
        declareFunction("ar_state_next_ambiguous_phrase", "AR-STATE-NEXT-AMBIGUOUS-PHRASE", 1, 0, false);
        declareFunction("ar_sentence_candidate_assertion_count", "AR-SENTENCE-CANDIDATE-ASSERTION-COUNT", 2, 0, false);
        declareFunction("ar_sentence_candidate_query_count", "AR-SENTENCE-CANDIDATE-QUERY-COUNT", 2, 0, false);
        declareFunction("ar_sentence_asserted_assertion_count", "AR-SENTENCE-ASSERTED-ASSERTION-COUNT", 2, 0, false);
        declareFunction("ar_state_determine_focus_sentence", "AR-STATE-DETERMINE-FOCUS-SENTENCE", 1, 0, false);
        declareFunction("ar_surrogate_concept_p", "AR-SURROGATE-CONCEPT-P", 1, 0, false);
        declareFunction("ar_concept_dependent_on_surrogate_p", "AR-CONCEPT-DEPENDENT-ON-SURROGATE-P", 1, 1, false);
        declareFunction("current_ar_concept_grounding_map", "CURRENT-AR-CONCEPT-GROUNDING-MAP", 0, 0, false);
        declareFunction("ensure_ar_concept_grounding_map", "ENSURE-AR-CONCEPT-GROUNDING-MAP", 0, 0, false);
        declareMacro("with_new_ar_concept_grounding_map", "WITH-NEW-AR-CONCEPT-GROUNDING-MAP");
        declareFunction("ar_concept_grounding_computedP", "AR-CONCEPT-GROUNDING-COMPUTED?", 2, 0, false);
        declareFunction("ar_concept_grounding_groundedP", "AR-CONCEPT-GROUNDING-GROUNDED?", 2, 0, false);
        declareFunction("ar_concept_grounding_ungroundedP", "AR-CONCEPT-GROUNDING-UNGROUNDED?", 2, 0, false);
        declareFunction("ar_concept_grounding_in_progressP", "AR-CONCEPT-GROUNDING-IN-PROGRESS?", 2, 0, false);
        declareFunction("ar_concept_grounding_map_mark", "AR-CONCEPT-GROUNDING-MAP-MARK", 3, 0, false);
        declareFunction("ar_concept_dependent_on_ungrounded_surrogate_p", "AR-CONCEPT-DEPENDENT-ON-UNGROUNDED-SURROGATE-P", 1, 0, false);
        declareFunction("ar_concept_dependent_on_ungrounded_surrogate_count", "AR-CONCEPT-DEPENDENT-ON-UNGROUNDED-SURROGATE-COUNT", 1, 0, false);
        declareFunction("ar_phrase_dependent_on_ungrounded_surrogate_p", "AR-PHRASE-DEPENDENT-ON-UNGROUNDED-SURROGATE-P", 1, 0, false);
        declareFunction("ar_phrase_divide_eq_best_lambda_substitute", "AR-PHRASE-DIVIDE-EQ-BEST-LAMBDA-SUBSTITUTE", 1, 0, false);
        declareFunction("ar_phrase_divide_concepts", "AR-PHRASE-DIVIDE-CONCEPTS", 2, 0, false);
        declareFunction("ar_concept_separate_out_forts", "AR-CONCEPT-SEPARATE-OUT-FORTS", 1, 0, false);
        declareFunction("ar_concept_complexity", "AR-CONCEPT-COMPLEXITY", 1, 0, false);
        declareFunction("ar_formula_complexity", "AR-FORMULA-COMPLEXITY", 1, 0, false);
        declareFunction("ar_phrase_constraints_for_unknown", "AR-PHRASE-CONSTRAINTS-FOR-UNKNOWN", 3, 0, false);
        declareFunction("rkf_ar_act_add_source_texts_background", "RKF-AR-ACT-ADD-SOURCE-TEXTS-BACKGROUND", 2, 0, false);
        declareFunction("rkf_ar_act_add_source_texts_background_internal", "RKF-AR-ACT-ADD-SOURCE-TEXTS-BACKGROUND-INTERNAL", 3, 0, false);
        declareFunction("rkf_ar_act_add_source_texts", "RKF-AR-ACT-ADD-SOURCE-TEXTS", 2, 0, false);
        declareFunction("rkf_ar_act_add_rewrite_texts_background", "RKF-AR-ACT-ADD-REWRITE-TEXTS-BACKGROUND", 3, 0, false);
        declareFunction("rkf_ar_act_add_rewrite_texts_background_internal", "RKF-AR-ACT-ADD-REWRITE-TEXTS-BACKGROUND-INTERNAL", 4, 0, false);
        declareFunction("rkf_ar_act_add_rewrite_texts", "RKF-AR-ACT-ADD-REWRITE-TEXTS", 3, 0, false);
        declareFunction("rkf_ar_act_add_source_text", "RKF-AR-ACT-ADD-SOURCE-TEXT", 2, 1, false);
        declareFunction("rkf_ar_act_add_rewrite_text", "RKF-AR-ACT-ADD-REWRITE-TEXT", 3, 0, false);
        declareFunction("rkf_ar_act_add_clarification", "RKF-AR-ACT-ADD-CLARIFICATION", 3, 0, false);
        declareFunction("rkf_ar_select_processing_method", "RKF-AR-SELECT-PROCESSING-METHOD", 0, 0, false);
        declareFunction("rkf_ar_act_process_input_sentence", "RKF-AR-ACT-PROCESS-INPUT-SENTENCE", 1, 0, false);
        declareFunction("rkf_ar_template_category_for_processor", "RKF-AR-TEMPLATE-CATEGORY-FOR-PROCESSOR", 1, 0, false);
        declareFunction("rkf_ar_act_add_text", "RKF-AR-ACT-ADD-TEXT", 2, 2, false);
        declareFunction("rkf_ar_set_open_term_scores", "RKF-AR-SET-OPEN-TERM-SCORES", 1, 0, false);
        declareFunction("rkf_ar_reset_open_term_counts_for_sentence", "RKF-AR-RESET-OPEN-TERM-COUNTS-FOR-SENTENCE", 1, 0, false);
        declareFunction("rkf_ar_concept_check_trivial_differences", "RKF-AR-CONCEPT-CHECK-TRIVIAL-DIFFERENCES", 2, 0, false);
        declareFunction("rkf_ar_mask_trivial_differences", "RKF-AR-MASK-TRIVIAL-DIFFERENCES", 1, 0, false);
        declareFunction("rkf_ar_harvest_for_phrases_and_concepts", "RKF-AR-HARVEST-FOR-PHRASES-AND-CONCEPTS", 4, 0, false);
        declareFunction("rkf_ar_transform_unknown_instances", "RKF-AR-TRANSFORM-UNKNOWN-INSTANCES", 1, 0, false);
        declareFunction("rkf_ar_log_parsing_event", "RKF-AR-LOG-PARSING-EVENT", 3, 0, false);
        declareFunction("rkf_ar_rank_parses", "RKF-AR-RANK-PARSES", 2, 0, false);
        declareFunction("ar_concept_is_surrogateP", "AR-CONCEPT-IS-SURROGATE?", 1, 0, false);
        declareFunction("rkf_ar_add_any_surrogates", "RKF-AR-ADD-ANY-SURROGATES", 4, 0, false);
        declareFunction("rkf_ar_locate_appropriate_phrase", "RKF-AR-LOCATE-APPROPRIATE-PHRASE", 2, 0, false);
        declareFunction("rkf_ar_check_for_existing_surrogate", "RKF-AR-CHECK-FOR-EXISTING-SURROGATE", 2, 0, false);
        declareFunction("rkf_ar_update_surrogates", "RKF-AR-UPDATE-SURROGATES", 2, 0, false);
        declareFunction("rkf_ar_add_surrogate_sans_children", "RKF-AR-ADD-SURROGATE-SANS-CHILDREN", 4, 0, false);
        declareFunction("rkf_ar_act_focus_sentence", "RKF-AR-ACT-FOCUS-SENTENCE", 2, 0, false);
        declareFunction("rkf_ar_ensure_focus_sentence", "RKF-AR-ENSURE-FOCUS-SENTENCE", 2, 0, false);
        declareFunction("rkf_ar_act_augment_sentence", "RKF-AR-ACT-AUGMENT-SENTENCE", 3, 0, false);
        declareFunction("rkf_ar_act_complete_augmentation", "RKF-AR-ACT-COMPLETE-AUGMENTATION", 1, 0, false);
        declareFunction("rkf_ar_act_find_concept", "RKF-AR-ACT-FIND-CONCEPT", 2, 0, false);
        declareFunction("rkf_ar_act_augment_phrase", "RKF-AR-ACT-AUGMENT-PHRASE", 3, 0, false);
        declareFunction("rkf_ar_act_add_phrase", "RKF-AR-ACT-ADD-PHRASE", 2, 0, false);
        declareFunction("rkf_ar_act_add_relevant_phrase", "RKF-AR-ACT-ADD-RELEVANT-PHRASE", 2, 0, false);
        declareFunction("rkf_ar_act_note_irrelevant", "RKF-AR-ACT-NOTE-IRRELEVANT", 2, 0, false);
        declareFunction("rkf_ar_act_note_assumed", "RKF-AR-ACT-NOTE-ASSUMED", 3, 0, false);
        declareFunction("rkf_ar_act_note_ambiguous", "RKF-AR-ACT-NOTE-AMBIGUOUS", 2, 0, false);
        declareFunction("rkf_ar_act_note_disambiguation", "RKF-AR-ACT-NOTE-DISAMBIGUATION", 3, 0, false);
        declareFunction("rkf_ar_act_note_accept_assumed", "RKF-AR-ACT-NOTE-ACCEPT-ASSUMED", 2, 0, false);
        declareFunction("rkf_ar_act_handle_accept_assumed", "RKF-AR-ACT-HANDLE-ACCEPT-ASSUMED", 3, 0, false);
        declareFunction("rkf_ar_act_note_accepted_phrase", "RKF-AR-ACT-NOTE-ACCEPTED-PHRASE", 2, 0, false);
        declareFunction("rkf_ar_act_note_rejected_phrase", "RKF-AR-ACT-NOTE-REJECTED-PHRASE", 2, 0, false);
        declareFunction("rkf_ar_act_reconsider_irrelevant", "RKF-AR-ACT-RECONSIDER-IRRELEVANT", 2, 0, false);
        declareFunction("rkf_ar_act_understand_unknown_phrase", "RKF-AR-ACT-UNDERSTAND-UNKNOWN-PHRASE", 3, 0, false);
        declareFunction("rkf_ar_act_reject_unknown_phrase", "RKF-AR-ACT-REJECT-UNKNOWN-PHRASE", 2, 0, false);
        declareFunction("rkf_ar_act_note_rewrite_sentence", "RKF-AR-ACT-NOTE-REWRITE-SENTENCE", 3, 0, false);
        declareFunction("ar_sentence_rewrite_cycl_p", "AR-SENTENCE-REWRITE-CYCL-P", 1, 0, false);
        declareFunction("ar_compute_sentence_rewrites", "AR-COMPUTE-SENTENCE-REWRITES", 1, 0, false);
        declareFunction("rkf_ar_act_note_sentence_completed", "RKF-AR-ACT-NOTE-SENTENCE-COMPLETED", 2, 0, false);
        declareFunction("rkf_ar_act_note_sentence_completed_and_refocus", "RKF-AR-ACT-NOTE-SENTENCE-COMPLETED-AND-REFOCUS", 1, 0, false);
        declareFunction("rkf_ar_act_note_phrase_completed", "RKF-AR-ACT-NOTE-PHRASE-COMPLETED", 2, 0, false);
        declareFunction("rkf_ar_act_note_concept_completed", "RKF-AR-ACT-NOTE-CONCEPT-COMPLETED", 2, 0, false);
        declareFunction("rkf_ar_act_note_pending_concept", "RKF-AR-ACT-NOTE-PENDING-CONCEPT", 2, 0, false);
        declareFunction("rkf_ar_ensure_relation_is_goodP", "RKF-AR-ENSURE-RELATION-IS-GOOD?", 1, 0, false);
        declareFunction("rkf_ar_act_propagate_surrogate_constraint", "RKF-AR-ACT-PROPAGATE-SURROGATE-CONSTRAINT", 3, 0, false);
        declareFunction("rkf_ar_act_propagate_one_surrogate_constraint", "RKF-AR-ACT-PROPAGATE-ONE-SURROGATE-CONSTRAINT", 4, 0, false);
        declareFunction("rkf_ar_concept_is_nthfn_termP", "RKF-AR-CONCEPT-IS-NTHFN-TERM?", 1, 0, false);
        declareFunction("rkf_ar_nthfn_termP", "RKF-AR-NTHFN-TERM?", 1, 0, false);
        declareFunction("rkf_ar_unfailable_constraintP", "RKF-AR-UNFAILABLE-CONSTRAINT?", 1, 0, false);
        declareFunction("rkf_ar_possibly_reformulatableP", "RKF-AR-POSSIBLY-REFORMULATABLE?", 1, 0, false);
        declareFunction("rkf_reformulatable_termP", "RKF-REFORMULATABLE-TERM?", 1, 0, false);
        declareFunction("initialize_rkf_reformulatable_terms", "INITIALIZE-RKF-REFORMULATABLE-TERMS", 0, 0, false);
        declareFunction("rkf_ar_act_note_rejected_concepts", "RKF-AR-ACT-NOTE-REJECTED-CONCEPTS", 3, 0, false);
        declareFunction("rkf_ar_act_note_surrogate_replacement", "RKF-AR-ACT-NOTE-SURROGATE-REPLACEMENT", 3, 0, false);
        declareFunction("rkf_ar_act_note_one_surrogate_replacement", "RKF-AR-ACT-NOTE-ONE-SURROGATE-REPLACEMENT", 4, 0, false);
        declareFunction("rkf_ar_act_propagate_surrogate_replacement", "RKF-AR-ACT-PROPAGATE-SURROGATE-REPLACEMENT", 4, 0, false);
        declareMacro("rkf_ar_with_additional_constraints", "RKF-AR-WITH-ADDITIONAL-CONSTRAINTS");
        declareFunction("rkf_ar_has_additional_constraintsP", "RKF-AR-HAS-ADDITIONAL-CONSTRAINTS?", 0, 0, false);
        declareFunction("rkf_ar_act_note_accepted_concept", "RKF-AR-ACT-NOTE-ACCEPTED-CONCEPT", 2, 1, false);
        declareFunction("rkf_ar_concept_covers_entire_phraseP", "RKF-AR-CONCEPT-COVERS-ENTIRE-PHRASE?", 2, 0, false);
        declareFunction("rkf_ar_act_resolve_context_references", "RKF-AR-ACT-RESOLVE-CONTEXT-REFERENCES", 2, 0, false);
        declareFunction("rkf_ar_act_optimize_concept_cycl", "RKF-AR-ACT-OPTIMIZE-CONCEPT-CYCL", 2, 0, false);
        declareFunction("rkf_ar_act_instantiate_template", "RKF-AR-ACT-INSTANTIATE-TEMPLATE", 4, 0, false);
        declareFunction("rkf_ar_act_add_template", "RKF-AR-ACT-ADD-TEMPLATE", 2, 0, false);
        declareFunction("rkf_ar_formula_choice_template", "RKF-AR-FORMULA-CHOICE-TEMPLATE", 1, 0, false);
        declareFunction("rkf_ar_act_update_templates", "RKF-AR-ACT-UPDATE-TEMPLATES", 2, 0, false);
        declareFunction("rkf_ar_act_note_candidate_cycl", "RKF-AR-ACT-NOTE-CANDIDATE-CYCL", 2, 0, false);
        declareFunction("rkf_ar_act_note_candidate_assertion", "RKF-AR-ACT-NOTE-CANDIDATE-ASSERTION", 2, 0, false);
        declareFunction("rkf_ar_act_note_candidate_query", "RKF-AR-ACT-NOTE-CANDIDATE-QUERY", 2, 0, false);
        declareFunction("rkf_ar_act_assert_concept", "RKF-AR-ACT-ASSERT-CONCEPT", 2, 0, false);
        declareFunction("rkf_ar_act_reject_assert_concept", "RKF-AR-ACT-REJECT-ASSERT-CONCEPT", 2, 0, false);
        declareFunction("ar_pragmatic_relation_p", "AR-PRAGMATIC-RELATION-P", 1, 0, false);
        declareFunction("ar_sentence_tokens_from_index_list", "AR-SENTENCE-TOKENS-FROM-INDEX-LIST", 2, 0, false);
        declareFunction("rkf_ar_some_subsuming_phrase", "RKF-AR-SOME-SUBSUMING-PHRASE", 2, 0, false);
        declareFunction("rkf_ar_phrase_subsumed", "RKF-AR-PHRASE-SUBSUMED", 2, 0, false);
        declareFunction("rkf_ar_assertible_concept", "RKF-AR-ASSERTIBLE-CONCEPT", 1, 1, false);
        declareFunction("rkf_ar_assertible_cycl", "RKF-AR-ASSERTIBLE-CYCL", 2, 0, false);
        declareFunction("rkf_relation_template", "RKF-RELATION-TEMPLATE", 1, 0, false);
        declareFunction("rkf_ar_update_all_template_choices", "RKF-AR-UPDATE-ALL-TEMPLATE-CHOICES", 1, 0, false);
        declareFunction("rkf_ar_update_template_choices_for_template", "RKF-AR-UPDATE-TEMPLATE-CHOICES-FOR-TEMPLATE", 2, 0, false);
        declareFunction("rkf_ar_update_template_choices_for_concept", "RKF-AR-UPDATE-TEMPLATE-CHOICES-FOR-CONCEPT", 2, 0, false);
        declareFunction("rkf_ar_update_template_choices_for_template_and_concept", "RKF-AR-UPDATE-TEMPLATE-CHOICES-FOR-TEMPLATE-AND-CONCEPT", 3, 0, false);
        declareFunction("rkf_ar_resolve_context_references", "RKF-AR-RESOLVE-CONTEXT-REFERENCES", 2, 1, false);
        declareFunction("rkf_ar_context_reference_p", "RKF-AR-CONTEXT-REFERENCE-P", 1, 0, false);
        declareFunction("rkf_ar_contains_context_references", "RKF-AR-CONTAINS-CONTEXT-REFERENCES", 1, 0, false);
        declareFunction("rkf_ar_gather_context_references", "RKF-AR-GATHER-CONTEXT-REFERENCES", 1, 0, false);
        declareFunction("rkf_ar_resolve_one_context_reference", "RKF-AR-RESOLVE-ONE-CONTEXT-REFERENCE", 2, 1, false);
        declareFunction("rkf_ar_resolve_the_spec_reference", "RKF-AR-RESOLVE-THE-SPEC-REFERENCE", 2, 1, false);
        declareFunction("rkf_ar_resolve_the_instance_reference", "RKF-AR-RESOLVE-THE-INSTANCE-REFERENCE", 2, 1, false);
        declareFunction("rkf_ar_term_agglomerator", "RKF-AR-TERM-AGGLOMERATOR", 1, 2, false);
        declareFunction("rkf_ar_ta_internal", "RKF-AR-TA-INTERNAL", 3, 0, false);
        declareFunction("rkf_ar_ta_new_relation", "RKF-AR-TA-NEW-RELATION", 3, 0, false);
        declareFunction("rkf_ar_ta_new_term", "RKF-AR-TA-NEW-TERM", 4, 0, false);
        declareFunction("rkf_ar_ta_new_relation_arg", "RKF-AR-TA-NEW-RELATION-ARG", 5, 0, false);
        declareFunction("rkf_ar_ta_assign_args_recursive", "RKF-AR-TA-ASSIGN-ARGS-RECURSIVE", 5, 0, false);
        declareFunction("rkf_ar_ta_answer", "RKF-AR-TA-ANSWER", 3, 0, false);
        declareFunction("rkf_ar_ta_admitted_argument", "RKF-AR-TA-ADMITTED-ARGUMENT", 4, 0, false);
        declareFunction("rkf_ar_ta_admitted_formula", "RKF-AR-TA-ADMITTED-FORMULA", 2, 0, false);
        declareFunction("clear_relation_args_sorted_by_restriction", "CLEAR-RELATION-ARGS-SORTED-BY-RESTRICTION", 0, 0, false);
        declareFunction("remove_relation_args_sorted_by_restriction", "REMOVE-RELATION-ARGS-SORTED-BY-RESTRICTION", 1, 0, false);
        declareFunction("relation_args_sorted_by_restriction_internal", "RELATION-ARGS-SORTED-BY-RESTRICTION-INTERNAL", 1, 0, false);
        declareFunction("relation_args_sorted_by_restriction", "RELATION-ARGS-SORTED-BY-RESTRICTION", 1, 0, false);
        declareFunction("clear_all_relation_args", "CLEAR-ALL-RELATION-ARGS", 0, 0, false);
        declareFunction("remove_all_relation_args", "REMOVE-ALL-RELATION-ARGS", 1, 0, false);
        declareFunction("all_relation_args_internal", "ALL-RELATION-ARGS-INTERNAL", 1, 0, false);
        declareFunction("all_relation_args", "ALL-RELATION-ARGS", 1, 0, false);
        return NIL;
    }

    public static final SubLObject init_rkf_assisted_reader_file_alt() {
        deflexical("*AR-LOCK*", make_lock($$$Assisted_Reader_lock));
        defconstant("*DTP-AR-SENTENCE*", AR_SENTENCE);
        defconstant("*DTP-AR-TOKEN*", AR_TOKEN);
        defconstant("*DTP-AR-PHRASE*", AR_PHRASE);
        defconstant("*DTP-AR-CONCEPT*", AR_CONCEPT);
        defconstant("*DTP-AR-TEMPLATE*", AR_TEMPLATE);
        defconstant("*DTP-AR-STATE*", AR_STATE);
        defconstant("*MAX-SURROGATE-CHAIN-LENGTH*", FIVE_INTEGER);
        defparameter("*AR-CONCEPT-GROUNDING-MAP*", NIL);
        deflexical("*AR-CONCEPT-CYCLE-COUNT*", $int$10000);
        defvar("*AR-DIVIDE-BEST*", NIL);
        defparameter("*RKF-AR-PARSING-MT*", NIL);
        defparameter("*RKF-AR-SEMANTICS-MT*", NIL);
        defparameter("*RKF-USER*", NIL);
        deflexical("*RKF-AR-TEXT-PROCESSOR*", RKF_SENTENCE_READER);
        deflexical("*RKF-AR-QUESTION-PROCESSOR*", RKF_QUESTION_READER);
        deflexical("*RKF-AR-CONCEPT-HARVESTER*", RKF_CONCEPT_HARVESTER);
        deflexical("*RFK-AR-TEMPLATE-CATEGORY-MAP*", $list_alt260);
        defparameter("*RKF-AR-PROCESSING-MODE*", $TEXT_PROCESSING);
        defparameter("*RKF-AR-LOGGING-DEFAULT-PARSER*", ITP_SEQUEL);
        defparameter("*RKF-AR-LOGGING-DEFAULT-PROJECT*", $str_alt270$UIA_use);
        defparameter("*RKF-AR-LOGGING-DEFAULT-PRIORITY*", $$$Medium);
        defparameter("*RKF-REFORMULATABLE-TERMS*", NIL);
        defparameter("*RKF-AR-ADDITIONAL-CONSTRAINTS*", NIL);
        deflexical("*AR-PRAGMATIC-RELATIONS*", $list_alt293);
        deflexical("*RELATION-ARGS-SORTED-BY-RESTRICTION-CACHING-STATE*", NIL);
        deflexical("*ALL-RELATION-ARGS-CACHING-STATE*", NIL);
        return NIL;
    }

    public static SubLObject init_rkf_assisted_reader_file() {
        if (SubLFiles.USE_V1) {
            deflexical("*AR-LOCK*", make_lock($$$Assisted_Reader_lock));
            defconstant("*DTP-AR-SENTENCE*", AR_SENTENCE);
            defconstant("*DTP-AR-TOKEN*", AR_TOKEN);
            defconstant("*DTP-AR-PHRASE*", AR_PHRASE);
            defconstant("*DTP-AR-CONCEPT*", AR_CONCEPT);
            defconstant("*DTP-AR-TEMPLATE*", AR_TEMPLATE);
            defconstant("*DTP-AR-STATE*", AR_STATE);
            defconstant("*MAX-SURROGATE-CHAIN-LENGTH*", FIVE_INTEGER);
            defparameter("*AR-CONCEPT-GROUNDING-MAP*", NIL);
            deflexical("*AR-CONCEPT-CYCLE-COUNT*", $int$10000);
            defvar("*AR-DIVIDE-BEST*", NIL);
            defparameter("*RKF-AR-PARSING-MT*", NIL);
            defparameter("*RKF-AR-SEMANTICS-MT*", NIL);
            defparameter("*RKF-USER*", NIL);
            deflexical("*RKF-AR-TEXT-PROCESSOR*", RKF_SENTENCE_READER);
            deflexical("*RKF-AR-QUESTION-PROCESSOR*", RKF_QUESTION_READER);
            deflexical("*RKF-AR-CONCEPT-HARVESTER*", RKF_CONCEPT_HARVESTER);
            deflexical("*RFK-AR-TEMPLATE-CATEGORY-MAP*", $list281);
            defparameter("*RKF-AR-PROCESSING-MODE*", $TEXT_PROCESSING);
            defparameter("*RKF-AR-LOGGING-DEFAULT-PARSER*", ITP_SEQUEL);
            defparameter("*RKF-AR-LOGGING-DEFAULT-PROJECT*", $str291$UIA_use);
            defparameter("*RKF-AR-LOGGING-DEFAULT-PRIORITY*", $$$Medium);
            defparameter("*RKF-REFORMULATABLE-TERMS*", NIL);
            defparameter("*RKF-AR-ADDITIONAL-CONSTRAINTS*", NIL);
            deflexical("*AR-PRAGMATIC-RELATIONS*", $list313);
            deflexical("*RELATION-ARGS-SORTED-BY-RESTRICTION-CACHING-STATE*", NIL);
            deflexical("*ALL-RELATION-ARGS-CACHING-STATE*", NIL);
        }
        if (SubLFiles.USE_V2) {
            deflexical("*RFK-AR-TEMPLATE-CATEGORY-MAP*", $list_alt260);
            defparameter("*RKF-AR-LOGGING-DEFAULT-PROJECT*", $str_alt270$UIA_use);
            deflexical("*AR-PRAGMATIC-RELATIONS*", $list_alt293);
        }
        return NIL;
    }

    public static SubLObject init_rkf_assisted_reader_file_Previous() {
        deflexical("*AR-LOCK*", make_lock($$$Assisted_Reader_lock));
        defconstant("*DTP-AR-SENTENCE*", AR_SENTENCE);
        defconstant("*DTP-AR-TOKEN*", AR_TOKEN);
        defconstant("*DTP-AR-PHRASE*", AR_PHRASE);
        defconstant("*DTP-AR-CONCEPT*", AR_CONCEPT);
        defconstant("*DTP-AR-TEMPLATE*", AR_TEMPLATE);
        defconstant("*DTP-AR-STATE*", AR_STATE);
        defconstant("*MAX-SURROGATE-CHAIN-LENGTH*", FIVE_INTEGER);
        defparameter("*AR-CONCEPT-GROUNDING-MAP*", NIL);
        deflexical("*AR-CONCEPT-CYCLE-COUNT*", $int$10000);
        defvar("*AR-DIVIDE-BEST*", NIL);
        defparameter("*RKF-AR-PARSING-MT*", NIL);
        defparameter("*RKF-AR-SEMANTICS-MT*", NIL);
        defparameter("*RKF-USER*", NIL);
        deflexical("*RKF-AR-TEXT-PROCESSOR*", RKF_SENTENCE_READER);
        deflexical("*RKF-AR-QUESTION-PROCESSOR*", RKF_QUESTION_READER);
        deflexical("*RKF-AR-CONCEPT-HARVESTER*", RKF_CONCEPT_HARVESTER);
        deflexical("*RFK-AR-TEMPLATE-CATEGORY-MAP*", $list281);
        defparameter("*RKF-AR-PROCESSING-MODE*", $TEXT_PROCESSING);
        defparameter("*RKF-AR-LOGGING-DEFAULT-PARSER*", ITP_SEQUEL);
        defparameter("*RKF-AR-LOGGING-DEFAULT-PROJECT*", $str291$UIA_use);
        defparameter("*RKF-AR-LOGGING-DEFAULT-PRIORITY*", $$$Medium);
        defparameter("*RKF-REFORMULATABLE-TERMS*", NIL);
        defparameter("*RKF-AR-ADDITIONAL-CONSTRAINTS*", NIL);
        deflexical("*AR-PRAGMATIC-RELATIONS*", $list313);
        deflexical("*RELATION-ARGS-SORTED-BY-RESTRICTION-CACHING-STATE*", NIL);
        deflexical("*ALL-RELATION-ARGS-CACHING-STATE*", NIL);
        return NIL;
    }

    public static SubLObject setup_rkf_assisted_reader_file() {
        register_method($print_object_method_table$.getGlobalValue(), $dtp_ar_sentence$.getGlobalValue(), symbol_function(AR_SENTENCE_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim($list11);
        def_csetf(AR_SENTENCE_ID, _CSETF_AR_SENTENCE_ID);
        def_csetf(AR_SENTENCE_PLAINTEXT, _CSETF_AR_SENTENCE_PLAINTEXT);
        def_csetf(AR_SENTENCE_TOKEN_VECTOR, _CSETF_AR_SENTENCE_TOKEN_VECTOR);
        def_csetf(AR_SENTENCE_CLARIFICATIONS, _CSETF_AR_SENTENCE_CLARIFICATIONS);
        def_csetf(AR_SENTENCE_SOURCE_SENTENCE, _CSETF_AR_SENTENCE_SOURCE_SENTENCE);
        def_csetf(AR_SENTENCE_PHRASES, _CSETF_AR_SENTENCE_PHRASES);
        identity(AR_SENTENCE);
        register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_ar_sentence$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_AR_SENTENCE_METHOD));
        register_method(Sxhash.$sxhash_method_table$.getGlobalValue(), $dtp_ar_sentence$.getGlobalValue(), symbol_function(SXHASH_AR_SENTENCE_METHOD));
        register_method($print_object_method_table$.getGlobalValue(), $dtp_ar_token$.getGlobalValue(), symbol_function(AR_TOKEN_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim($list47);
        def_csetf(AR_TOKEN_ID, _CSETF_AR_TOKEN_ID);
        def_csetf(AR_TOKEN_TEXT, _CSETF_AR_TOKEN_TEXT);
        def_csetf(AR_TOKEN_SENTENCE, _CSETF_AR_TOKEN_SENTENCE);
        def_csetf(AR_TOKEN_NUMBER, _CSETF_AR_TOKEN_NUMBER);
        def_csetf(AR_TOKEN_PHRASES, _CSETF_AR_TOKEN_PHRASES);
        identity(AR_TOKEN);
        register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_ar_token$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_AR_TOKEN_METHOD));
        register_method(Sxhash.$sxhash_method_table$.getGlobalValue(), $dtp_ar_token$.getGlobalValue(), symbol_function(SXHASH_AR_TOKEN_METHOD));
        register_method($print_object_method_table$.getGlobalValue(), $dtp_ar_phrase$.getGlobalValue(), symbol_function(AR_PHRASE_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim($list72);
        def_csetf(AR_PHRASE_ID, _CSETF_AR_PHRASE_ID);
        def_csetf(AR_PHRASE_STATUS, _CSETF_AR_PHRASE_STATUS);
        def_csetf(AR_PHRASE_TOKEN_LIST, _CSETF_AR_PHRASE_TOKEN_LIST);
        def_csetf(AR_PHRASE_SENTENCE, _CSETF_AR_PHRASE_SENTENCE);
        def_csetf(AR_PHRASE_CONCEPTS, _CSETF_AR_PHRASE_CONCEPTS);
        def_csetf(AR_PHRASE_REJECTED_CONCEPTS, _CSETF_AR_PHRASE_REJECTED_CONCEPTS);
        def_csetf(AR_PHRASE_DISAMBIGUATED_CONCEPT, _CSETF_AR_PHRASE_DISAMBIGUATED_CONCEPT);
        def_csetf(AR_PHRASE_SURROGATE, _CSETF_AR_PHRASE_SURROGATE);
        def_csetf(AR_PHRASE_CONSTRAINT, _CSETF_AR_PHRASE_CONSTRAINT);
        def_csetf(AR_PHRASE_FORCE, _CSETF_AR_PHRASE_FORCE);
        identity(AR_PHRASE);
        register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_ar_phrase$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_AR_PHRASE_METHOD));
        register_method(Sxhash.$sxhash_method_table$.getGlobalValue(), $dtp_ar_phrase$.getGlobalValue(), symbol_function(SXHASH_AR_PHRASE_METHOD));
        register_method($print_object_method_table$.getGlobalValue(), $dtp_ar_concept$.getGlobalValue(), symbol_function(AR_CONCEPT_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim($list121);
        def_csetf(AR_CONCEPT_ID, _CSETF_AR_CONCEPT_ID);
        def_csetf(AR_CONCEPT_CYCL, _CSETF_AR_CONCEPT_CYCL);
        def_csetf(AR_CONCEPT_DISAMBIGUATION_TEXT, _CSETF_AR_CONCEPT_DISAMBIGUATION_TEXT);
        def_csetf(AR_CONCEPT_PHRASES, _CSETF_AR_CONCEPT_PHRASES);
        def_csetf(AR_CONCEPT_PARTS, _CSETF_AR_CONCEPT_PARTS);
        def_csetf(AR_CONCEPT_AGGLOMERATIONS, _CSETF_AR_CONCEPT_AGGLOMERATIONS);
        def_csetf(AR_CONCEPT_FORCE, _CSETF_AR_CONCEPT_FORCE);
        def_csetf(AR_CONCEPT_CONFIDENCE, _CSETF_AR_CONCEPT_CONFIDENCE);
        def_csetf(AR_CONCEPT_OPEN_TERM_SCORE, _CSETF_AR_CONCEPT_OPEN_TERM_SCORE);
        identity(AR_CONCEPT);
        register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_ar_concept$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_AR_CONCEPT_METHOD));
        register_method(Sxhash.$sxhash_method_table$.getGlobalValue(), $dtp_ar_concept$.getGlobalValue(), symbol_function(SXHASH_AR_CONCEPT_METHOD));
        register_method($print_object_method_table$.getGlobalValue(), $dtp_ar_template$.getGlobalValue(), symbol_function(AR_TEMPLATE_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim($list158);
        def_csetf(AR_TEMPLATE_ID, _CSETF_AR_TEMPLATE_ID);
        def_csetf(AR_TEMPLATE_CONCEPT, _CSETF_AR_TEMPLATE_CONCEPT);
        def_csetf(AR_TEMPLATE_FORMULA, _CSETF_AR_TEMPLATE_FORMULA);
        def_csetf(AR_TEMPLATE_PROMPT, _CSETF_AR_TEMPLATE_PROMPT);
        def_csetf(AR_TEMPLATE_CHOICE_TABLE, _CSETF_AR_TEMPLATE_CHOICE_TABLE);
        def_csetf(AR_TEMPLATE_AGGLOMERATIONS, _CSETF_AR_TEMPLATE_AGGLOMERATIONS);
        identity(AR_TEMPLATE);
        register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_ar_template$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_AR_TEMPLATE_METHOD));
        register_method(Sxhash.$sxhash_method_table$.getGlobalValue(), $dtp_ar_template$.getGlobalValue(), symbol_function(SXHASH_AR_TEMPLATE_METHOD));
        register_method($print_object_method_table$.getGlobalValue(), $dtp_ar_state$.getGlobalValue(), symbol_function(AR_STATE_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim($list186);
        def_csetf(AR_STATE_ISG, _CSETF_AR_STATE_ISG);
        def_csetf(AR_STATE_INDEX, _CSETF_AR_STATE_INDEX);
        def_csetf(AR_STATE_SOURCE_SENTENCES, _CSETF_AR_STATE_SOURCE_SENTENCES);
        def_csetf(AR_STATE_FOCUS_SENTENCE, _CSETF_AR_STATE_FOCUS_SENTENCE);
        def_csetf(AR_STATE_COMPLETED_SENTENCES, _CSETF_AR_STATE_COMPLETED_SENTENCES);
        def_csetf(AR_STATE_UNKNOWN_PHRASES, _CSETF_AR_STATE_UNKNOWN_PHRASES);
        def_csetf(AR_STATE_REJECTED_PHRASES, _CSETF_AR_STATE_REJECTED_PHRASES);
        def_csetf(AR_STATE_IRRELEVANT_PHRASES, _CSETF_AR_STATE_IRRELEVANT_PHRASES);
        def_csetf(AR_STATE_AMBIGUOUS_PHRASES, _CSETF_AR_STATE_AMBIGUOUS_PHRASES);
        def_csetf(AR_STATE_ASSUMED_PHRASES, _CSETF_AR_STATE_ASSUMED_PHRASES);
        def_csetf(AR_STATE_PENDING_PHRASES, _CSETF_AR_STATE_PENDING_PHRASES);
        def_csetf(AR_STATE_ACCEPTED_PHRASES, _CSETF_AR_STATE_ACCEPTED_PHRASES);
        def_csetf(AR_STATE_PENDING_CONCEPTS, _CSETF_AR_STATE_PENDING_CONCEPTS);
        def_csetf(AR_STATE_ACCEPTED_CONCEPTS, _CSETF_AR_STATE_ACCEPTED_CONCEPTS);
        def_csetf(AR_STATE_CANDIDATE_CYCLS, _CSETF_AR_STATE_CANDIDATE_CYCLS);
        def_csetf(AR_STATE_ASSERTED_ASSERTIONS, _CSETF_AR_STATE_ASSERTED_ASSERTIONS);
        def_csetf(AR_STATE_TERM_TEMPLATES, _CSETF_AR_STATE_TERM_TEMPLATES);
        def_csetf(AR_STATE_ASSERT_TEMPLATES, _CSETF_AR_STATE_ASSERT_TEMPLATES);
        identity(AR_STATE);
        register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_ar_state$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_AR_STATE_METHOD));
        memoization_state.note_globally_cached_function(RELATION_ARGS_SORTED_BY_RESTRICTION);
        memoization_state.note_globally_cached_function(ALL_RELATION_ARGS);
        return NIL;
    }

    static private final SubLList $list_alt2 = list(makeSymbol("*AR-LOCK*"));

    static private final SubLList $list_alt5 = list(makeSymbol("ID"), makeSymbol("PLAINTEXT"), makeSymbol("TOKEN-VECTOR"), makeSymbol("CLARIFICATIONS"), makeSymbol("SOURCE-SENTENCE"), makeSymbol("PHRASES"));

    static private final SubLList $list_alt6 = list(makeKeyword("ID"), makeKeyword("PLAINTEXT"), makeKeyword("TOKEN-VECTOR"), makeKeyword("CLARIFICATIONS"), makeKeyword("SOURCE-SENTENCE"), makeKeyword("PHRASES"));

    static private final SubLList $list_alt7 = list(makeSymbol("AR-SENTENCE-ID"), makeSymbol("AR-SENTENCE-PLAINTEXT"), makeSymbol("AR-SENTENCE-TOKEN-VECTOR"), makeSymbol("AR-SENTENCE-CLARIFICATIONS"), makeSymbol("AR-SENTENCE-SOURCE-SENTENCE"), makeSymbol("AR-SENTENCE-PHRASES"));

    static private final SubLList $list_alt8 = list(makeSymbol("_CSETF-AR-SENTENCE-ID"), makeSymbol("_CSETF-AR-SENTENCE-PLAINTEXT"), makeSymbol("_CSETF-AR-SENTENCE-TOKEN-VECTOR"), makeSymbol("_CSETF-AR-SENTENCE-CLARIFICATIONS"), makeSymbol("_CSETF-AR-SENTENCE-SOURCE-SENTENCE"), makeSymbol("_CSETF-AR-SENTENCE-PHRASES"));

    static private final SubLString $str_alt29$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");

    static private final SubLList $list_alt35 = list(makeSymbol("ID"), makeSymbol("TEXT"), makeSymbol("SENTENCE"), makeSymbol("NUMBER"), makeSymbol("PHRASES"));

    static private final SubLList $list_alt36 = list(makeKeyword("ID"), $TEXT, makeKeyword("SENTENCE"), makeKeyword("NUMBER"), makeKeyword("PHRASES"));

    static private final SubLList $list_alt37 = list(makeSymbol("AR-TOKEN-ID"), makeSymbol("AR-TOKEN-TEXT"), makeSymbol("AR-TOKEN-SENTENCE"), makeSymbol("AR-TOKEN-NUMBER"), makeSymbol("AR-TOKEN-PHRASES"));

    static private final SubLList $list_alt38 = list(makeSymbol("_CSETF-AR-TOKEN-ID"), makeSymbol("_CSETF-AR-TOKEN-TEXT"), makeSymbol("_CSETF-AR-TOKEN-SENTENCE"), makeSymbol("_CSETF-AR-TOKEN-NUMBER"), makeSymbol("_CSETF-AR-TOKEN-PHRASES"));

    static private final SubLString $str_alt54$_A_ = makeString("~A ");

    static private final SubLList $list_alt57 = list(new SubLObject[]{ makeSymbol("ID"), makeSymbol("STATUS"), makeSymbol("TOKEN-LIST"), makeSymbol("SENTENCE"), makeSymbol("CONCEPTS"), makeSymbol("REJECTED-CONCEPTS"), makeSymbol("DISAMBIGUATED-CONCEPT"), makeSymbol("SURROGATE"), makeSymbol("CONSTRAINT"), makeSymbol("FORCE") });

    static private final SubLList $list_alt58 = list(new SubLObject[]{ makeKeyword("ID"), makeKeyword("STATUS"), makeKeyword("TOKEN-LIST"), makeKeyword("SENTENCE"), makeKeyword("CONCEPTS"), makeKeyword("REJECTED-CONCEPTS"), makeKeyword("DISAMBIGUATED-CONCEPT"), makeKeyword("SURROGATE"), makeKeyword("CONSTRAINT"), makeKeyword("FORCE") });

    @Override
    public void declareFunctions() {
        declare_rkf_assisted_reader_file();
    }

    @Override
    public void initializeVariables() {
        init_rkf_assisted_reader_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_rkf_assisted_reader_file();
    }

    static private final SubLList $list_alt59 = list(new SubLObject[]{ makeSymbol("AR-PHRASE-ID"), makeSymbol("AR-PHRASE-STATUS"), makeSymbol("AR-PHRASE-TOKEN-LIST"), makeSymbol("AR-PHRASE-SENTENCE"), makeSymbol("AR-PHRASE-CONCEPTS"), makeSymbol("AR-PHRASE-REJECTED-CONCEPTS"), makeSymbol("AR-PHRASE-DISAMBIGUATED-CONCEPT"), makeSymbol("AR-PHRASE-SURROGATE"), makeSymbol("AR-PHRASE-CONSTRAINT"), makeSymbol("AR-PHRASE-FORCE") });

    static {
    }

    static private final SubLList $list_alt60 = list(new SubLObject[]{ makeSymbol("_CSETF-AR-PHRASE-ID"), makeSymbol("_CSETF-AR-PHRASE-STATUS"), makeSymbol("_CSETF-AR-PHRASE-TOKEN-LIST"), makeSymbol("_CSETF-AR-PHRASE-SENTENCE"), makeSymbol("_CSETF-AR-PHRASE-CONCEPTS"), makeSymbol("_CSETF-AR-PHRASE-REJECTED-CONCEPTS"), makeSymbol("_CSETF-AR-PHRASE-DISAMBIGUATED-CONCEPT"), makeSymbol("_CSETF-AR-PHRASE-SURROGATE"), makeSymbol("_CSETF-AR-PHRASE-CONSTRAINT"), makeSymbol("_CSETF-AR-PHRASE-FORCE") });

    static private final SubLString $str_alt91$_AR_PHRASE__D_ = makeString("<AR-PHRASE ~D ");

    static private final SubLString $str_alt92$_ = makeString(">");

    public static final class $ar_sentence_p$UnaryFunction extends UnaryFunction {
        public $ar_sentence_p$UnaryFunction() {
            super(extractFunctionNamed("AR-SENTENCE-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return ar_sentence_p(arg1);
        }
    }

    static private final SubLString $str_alt97$_ = makeString("?");

    static private final SubLString $str_alt99$_ = makeString(".");

    public static final class $ar_token_native extends SubLStructNative {
        public SubLObject $id;

        public SubLObject $text;

        public SubLObject $sentence;

        public SubLObject $number;

        public SubLObject $phrases;

        private static final SubLStructDeclNative structDecl;

        public $ar_token_native() {
            rkf_assisted_reader.$ar_token_native.this.$id = Lisp.NIL;
            rkf_assisted_reader.$ar_token_native.this.$text = Lisp.NIL;
            rkf_assisted_reader.$ar_token_native.this.$sentence = Lisp.NIL;
            rkf_assisted_reader.$ar_token_native.this.$number = Lisp.NIL;
            rkf_assisted_reader.$ar_token_native.this.$phrases = Lisp.NIL;
        }

        @Override
        public SubLStructDecl getStructDecl() {
            return structDecl;
        }

        @Override
        public SubLObject getField2() {
            return rkf_assisted_reader.$ar_token_native.this.$id;
        }

        @Override
        public SubLObject getField3() {
            return rkf_assisted_reader.$ar_token_native.this.$text;
        }

        @Override
        public SubLObject getField4() {
            return rkf_assisted_reader.$ar_token_native.this.$sentence;
        }

        @Override
        public SubLObject getField5() {
            return rkf_assisted_reader.$ar_token_native.this.$number;
        }

        @Override
        public SubLObject getField6() {
            return rkf_assisted_reader.$ar_token_native.this.$phrases;
        }

        @Override
        public SubLObject setField2(final SubLObject value) {
            return rkf_assisted_reader.$ar_token_native.this.$id = value;
        }

        @Override
        public SubLObject setField3(final SubLObject value) {
            return rkf_assisted_reader.$ar_token_native.this.$text = value;
        }

        @Override
        public SubLObject setField4(final SubLObject value) {
            return rkf_assisted_reader.$ar_token_native.this.$sentence = value;
        }

        @Override
        public SubLObject setField5(final SubLObject value) {
            return rkf_assisted_reader.$ar_token_native.this.$number = value;
        }

        @Override
        public SubLObject setField6(final SubLObject value) {
            return rkf_assisted_reader.$ar_token_native.this.$phrases = value;
        }

        static {
            structDecl = makeStructDeclNative(com.cyc.cycjava.cycl.rkf_assisted_reader.$ar_token_native.class, AR_TOKEN, AR_TOKEN_P, $list41, $list42, new String[]{ "$id", "$text", "$sentence", "$number", "$phrases" }, $list43, $list44, PRINT_AR_TOKEN);
        }
    }

    static private final SubLList $list_alt103 = list(new SubLObject[]{ makeSymbol("ID"), makeSymbol("CYCL"), makeSymbol("DISAMBIGUATION-TEXT"), makeSymbol("PHRASES"), makeSymbol("PARTS"), makeSymbol("AGGLOMERATIONS"), makeSymbol("FORCE"), makeSymbol("CONFIDENCE"), makeSymbol("OPEN-TERM-SCORE") });

    static private final SubLList $list_alt104 = list(new SubLObject[]{ makeKeyword("ID"), $CYCL, makeKeyword("DISAMBIGUATION-TEXT"), makeKeyword("PHRASES"), makeKeyword("PARTS"), makeKeyword("AGGLOMERATIONS"), makeKeyword("FORCE"), makeKeyword("CONFIDENCE"), makeKeyword("OPEN-TERM-SCORE") });

    static private final SubLList $list_alt105 = list(new SubLObject[]{ makeSymbol("AR-CONCEPT-ID"), makeSymbol("AR-CONCEPT-CYCL"), makeSymbol("AR-CONCEPT-DISAMBIGUATION-TEXT"), makeSymbol("AR-CONCEPT-PHRASES"), makeSymbol("AR-CONCEPT-PARTS"), makeSymbol("AR-CONCEPT-AGGLOMERATIONS"), makeSymbol("AR-CONCEPT-FORCE"), makeSymbol("AR-CONCEPT-CONFIDENCE"), makeSymbol("AR-CONCEPT-OPEN-TERM-SCORE") });

    static private final SubLList $list_alt106 = list(new SubLObject[]{ makeSymbol("_CSETF-AR-CONCEPT-ID"), makeSymbol("_CSETF-AR-CONCEPT-CYCL"), makeSymbol("_CSETF-AR-CONCEPT-DISAMBIGUATION-TEXT"), makeSymbol("_CSETF-AR-CONCEPT-PHRASES"), makeSymbol("_CSETF-AR-CONCEPT-PARTS"), makeSymbol("_CSETF-AR-CONCEPT-AGGLOMERATIONS"), makeSymbol("_CSETF-AR-CONCEPT-FORCE"), makeSymbol("_CSETF-AR-CONCEPT-CONFIDENCE"), makeSymbol("_CSETF-AR-CONCEPT-OPEN-TERM-SCORE") });

    public static final class $ar_token_p$UnaryFunction extends UnaryFunction {
        public $ar_token_p$UnaryFunction() {
            super(extractFunctionNamed("AR-TOKEN-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return ar_token_p(arg1);
        }
    }

    static private final SubLString $str_alt133$__AR_CONCEPT__S__S_ = makeString("#<AR-CONCEPT ~S ~S>");

    static private final SubLList $list_alt138 = list(makeSymbol("ID"), makeSymbol("CONCEPT"), makeSymbol("FORMULA"), makeSymbol("PROMPT"), makeSymbol("CHOICE-TABLE"), makeSymbol("AGGLOMERATIONS"));

    static private final SubLList $list_alt139 = list(makeKeyword("ID"), makeKeyword("CONCEPT"), makeKeyword("FORMULA"), makeKeyword("PROMPT"), makeKeyword("CHOICE-TABLE"), makeKeyword("AGGLOMERATIONS"));

    static private final SubLList $list_alt140 = list(makeSymbol("AR-TEMPLATE-ID"), makeSymbol("AR-TEMPLATE-CONCEPT"), makeSymbol("AR-TEMPLATE-FORMULA"), makeSymbol("AR-TEMPLATE-PROMPT"), makeSymbol("AR-TEMPLATE-CHOICE-TABLE"), makeSymbol("AR-TEMPLATE-AGGLOMERATIONS"));

    static private final SubLList $list_alt141 = list(makeSymbol("_CSETF-AR-TEMPLATE-ID"), makeSymbol("_CSETF-AR-TEMPLATE-CONCEPT"), makeSymbol("_CSETF-AR-TEMPLATE-FORMULA"), makeSymbol("_CSETF-AR-TEMPLATE-PROMPT"), makeSymbol("_CSETF-AR-TEMPLATE-CHOICE-TABLE"), makeSymbol("_CSETF-AR-TEMPLATE-AGGLOMERATIONS"));

    public static final class $ar_phrase_p$UnaryFunction extends UnaryFunction {
        public $ar_phrase_p$UnaryFunction() {
            super(extractFunctionNamed("AR-PHRASE-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return ar_phrase_p(arg1);
        }
    }

    static private final SubLList $list_alt163 = list(new SubLObject[]{ makeSymbol("ISG"), makeSymbol("INDEX"), makeSymbol("SOURCE-SENTENCES"), makeSymbol("FOCUS-SENTENCE"), makeSymbol("COMPLETED-SENTENCES"), makeSymbol("UNKNOWN-PHRASES"), makeSymbol("REJECTED-PHRASES"), makeSymbol("IRRELEVANT-PHRASES"), makeSymbol("AMBIGUOUS-PHRASES"), makeSymbol("ASSUMED-PHRASES"), makeSymbol("PENDING-PHRASES"), makeSymbol("ACCEPTED-PHRASES"), makeSymbol("PENDING-CONCEPTS"), makeSymbol("ACCEPTED-CONCEPTS"), makeSymbol("CANDIDATE-CYCLS"), makeSymbol("ASSERTED-ASSERTIONS"), makeSymbol("TERM-TEMPLATES"), makeSymbol("ASSERT-TEMPLATES") });

    static private final SubLList $list_alt164 = list(new SubLObject[]{ makeKeyword("ISG"), makeKeyword("INDEX"), makeKeyword("SOURCE-SENTENCES"), makeKeyword("FOCUS-SENTENCE"), makeKeyword("COMPLETED-SENTENCES"), makeKeyword("UNKNOWN-PHRASES"), makeKeyword("REJECTED-PHRASES"), makeKeyword("IRRELEVANT-PHRASES"), makeKeyword("AMBIGUOUS-PHRASES"), makeKeyword("ASSUMED-PHRASES"), makeKeyword("PENDING-PHRASES"), makeKeyword("ACCEPTED-PHRASES"), makeKeyword("PENDING-CONCEPTS"), makeKeyword("ACCEPTED-CONCEPTS"), makeKeyword("CANDIDATE-CYCLS"), makeKeyword("ASSERTED-ASSERTIONS"), makeKeyword("TERM-TEMPLATES"), makeKeyword("ASSERT-TEMPLATES") });

    static private final SubLList $list_alt165 = list(new SubLObject[]{ makeSymbol("AR-STATE-ISG"), makeSymbol("AR-STATE-INDEX"), makeSymbol("AR-STATE-SOURCE-SENTENCES"), makeSymbol("AR-STATE-FOCUS-SENTENCE"), makeSymbol("AR-STATE-COMPLETED-SENTENCES"), makeSymbol("AR-STATE-UNKNOWN-PHRASES"), makeSymbol("AR-STATE-REJECTED-PHRASES"), makeSymbol("AR-STATE-IRRELEVANT-PHRASES"), makeSymbol("AR-STATE-AMBIGUOUS-PHRASES"), makeSymbol("AR-STATE-ASSUMED-PHRASES"), makeSymbol("AR-STATE-PENDING-PHRASES"), makeSymbol("AR-STATE-ACCEPTED-PHRASES"), makeSymbol("AR-STATE-PENDING-CONCEPTS"), makeSymbol("AR-STATE-ACCEPTED-CONCEPTS"), makeSymbol("AR-STATE-CANDIDATE-CYCLS"), makeSymbol("AR-STATE-ASSERTED-ASSERTIONS"), makeSymbol("AR-STATE-TERM-TEMPLATES"), makeSymbol("AR-STATE-ASSERT-TEMPLATES") });

    static private final SubLList $list_alt166 = list(new SubLObject[]{ makeSymbol("_CSETF-AR-STATE-ISG"), makeSymbol("_CSETF-AR-STATE-INDEX"), makeSymbol("_CSETF-AR-STATE-SOURCE-SENTENCES"), makeSymbol("_CSETF-AR-STATE-FOCUS-SENTENCE"), makeSymbol("_CSETF-AR-STATE-COMPLETED-SENTENCES"), makeSymbol("_CSETF-AR-STATE-UNKNOWN-PHRASES"), makeSymbol("_CSETF-AR-STATE-REJECTED-PHRASES"), makeSymbol("_CSETF-AR-STATE-IRRELEVANT-PHRASES"), makeSymbol("_CSETF-AR-STATE-AMBIGUOUS-PHRASES"), makeSymbol("_CSETF-AR-STATE-ASSUMED-PHRASES"), makeSymbol("_CSETF-AR-STATE-PENDING-PHRASES"), makeSymbol("_CSETF-AR-STATE-ACCEPTED-PHRASES"), makeSymbol("_CSETF-AR-STATE-PENDING-CONCEPTS"), makeSymbol("_CSETF-AR-STATE-ACCEPTED-CONCEPTS"), makeSymbol("_CSETF-AR-STATE-CANDIDATE-CYCLS"), makeSymbol("_CSETF-AR-STATE-ASSERTED-ASSERTIONS"), makeSymbol("_CSETF-AR-STATE-TERM-TEMPLATES"), makeSymbol("_CSETF-AR-STATE-ASSERT-TEMPLATES") });

    public static final class $ar_concept_p$UnaryFunction extends UnaryFunction {
        public $ar_concept_p$UnaryFunction() {
            super(extractFunctionNamed("AR-CONCEPT-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return ar_concept_p(arg1);
        }
    }

    public static final class $ar_template_p$UnaryFunction extends UnaryFunction {
        public $ar_template_p$UnaryFunction() {
            super(extractFunctionNamed("AR-TEMPLATE-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return ar_template_p(arg1);
        }
    }

    public static final class $ar_state_native extends SubLStructNative {
        public SubLObject $isg;

        public SubLObject $index;

        public SubLObject $source_sentences;

        public SubLObject $focus_sentence;

        public SubLObject $completed_sentences;

        public SubLObject $unknown_phrases;

        public SubLObject $rejected_phrases;

        public SubLObject $irrelevant_phrases;

        public SubLObject $ambiguous_phrases;

        public SubLObject $assumed_phrases;

        public SubLObject $pending_phrases;

        public SubLObject $accepted_phrases;

        public SubLObject $pending_concepts;

        public SubLObject $accepted_concepts;

        public SubLObject $candidate_cycls;

        public SubLObject $asserted_assertions;

        public SubLObject $term_templates;

        public SubLObject $assert_templates;

        private static final SubLStructDeclNative structDecl;

        public $ar_state_native() {
            rkf_assisted_reader.$ar_state_native.this.$isg = Lisp.NIL;
            rkf_assisted_reader.$ar_state_native.this.$index = Lisp.NIL;
            rkf_assisted_reader.$ar_state_native.this.$source_sentences = Lisp.NIL;
            rkf_assisted_reader.$ar_state_native.this.$focus_sentence = Lisp.NIL;
            rkf_assisted_reader.$ar_state_native.this.$completed_sentences = Lisp.NIL;
            rkf_assisted_reader.$ar_state_native.this.$unknown_phrases = Lisp.NIL;
            rkf_assisted_reader.$ar_state_native.this.$rejected_phrases = Lisp.NIL;
            rkf_assisted_reader.$ar_state_native.this.$irrelevant_phrases = Lisp.NIL;
            rkf_assisted_reader.$ar_state_native.this.$ambiguous_phrases = Lisp.NIL;
            rkf_assisted_reader.$ar_state_native.this.$assumed_phrases = Lisp.NIL;
            rkf_assisted_reader.$ar_state_native.this.$pending_phrases = Lisp.NIL;
            rkf_assisted_reader.$ar_state_native.this.$accepted_phrases = Lisp.NIL;
            rkf_assisted_reader.$ar_state_native.this.$pending_concepts = Lisp.NIL;
            rkf_assisted_reader.$ar_state_native.this.$accepted_concepts = Lisp.NIL;
            rkf_assisted_reader.$ar_state_native.this.$candidate_cycls = Lisp.NIL;
            rkf_assisted_reader.$ar_state_native.this.$asserted_assertions = Lisp.NIL;
            rkf_assisted_reader.$ar_state_native.this.$term_templates = Lisp.NIL;
            rkf_assisted_reader.$ar_state_native.this.$assert_templates = Lisp.NIL;
        }

        @Override
        public SubLStructDecl getStructDecl() {
            return structDecl;
        }

        @Override
        public SubLObject getField2() {
            return rkf_assisted_reader.$ar_state_native.this.$isg;
        }

        @Override
        public SubLObject getField3() {
            return rkf_assisted_reader.$ar_state_native.this.$index;
        }

        @Override
        public SubLObject getField4() {
            return rkf_assisted_reader.$ar_state_native.this.$source_sentences;
        }

        @Override
        public SubLObject getField5() {
            return rkf_assisted_reader.$ar_state_native.this.$focus_sentence;
        }

        @Override
        public SubLObject getField6() {
            return rkf_assisted_reader.$ar_state_native.this.$completed_sentences;
        }

        @Override
        public SubLObject getField7() {
            return rkf_assisted_reader.$ar_state_native.this.$unknown_phrases;
        }

        @Override
        public SubLObject getField8() {
            return rkf_assisted_reader.$ar_state_native.this.$rejected_phrases;
        }

        @Override
        public SubLObject getField9() {
            return rkf_assisted_reader.$ar_state_native.this.$irrelevant_phrases;
        }

        @Override
        public SubLObject getField10() {
            return rkf_assisted_reader.$ar_state_native.this.$ambiguous_phrases;
        }

        @Override
        public SubLObject getField11() {
            return rkf_assisted_reader.$ar_state_native.this.$assumed_phrases;
        }

        @Override
        public SubLObject getField12() {
            return rkf_assisted_reader.$ar_state_native.this.$pending_phrases;
        }

        @Override
        public SubLObject getField13() {
            return rkf_assisted_reader.$ar_state_native.this.$accepted_phrases;
        }

        @Override
        public SubLObject getField14() {
            return rkf_assisted_reader.$ar_state_native.this.$pending_concepts;
        }

        @Override
        public SubLObject getField15() {
            return rkf_assisted_reader.$ar_state_native.this.$accepted_concepts;
        }

        @Override
        public SubLObject getField16() {
            return rkf_assisted_reader.$ar_state_native.this.$candidate_cycls;
        }

        @Override
        public SubLObject getField17() {
            return rkf_assisted_reader.$ar_state_native.this.$asserted_assertions;
        }

        @Override
        public SubLObject getField18() {
            return rkf_assisted_reader.$ar_state_native.this.$term_templates;
        }

        @Override
        public SubLObject getField19() {
            return rkf_assisted_reader.$ar_state_native.this.$assert_templates;
        }

        @Override
        public SubLObject setField2(final SubLObject value) {
            return rkf_assisted_reader.$ar_state_native.this.$isg = value;
        }

        @Override
        public SubLObject setField3(final SubLObject value) {
            return rkf_assisted_reader.$ar_state_native.this.$index = value;
        }

        @Override
        public SubLObject setField4(final SubLObject value) {
            return rkf_assisted_reader.$ar_state_native.this.$source_sentences = value;
        }

        @Override
        public SubLObject setField5(final SubLObject value) {
            return rkf_assisted_reader.$ar_state_native.this.$focus_sentence = value;
        }

        @Override
        public SubLObject setField6(final SubLObject value) {
            return rkf_assisted_reader.$ar_state_native.this.$completed_sentences = value;
        }

        @Override
        public SubLObject setField7(final SubLObject value) {
            return rkf_assisted_reader.$ar_state_native.this.$unknown_phrases = value;
        }

        @Override
        public SubLObject setField8(final SubLObject value) {
            return rkf_assisted_reader.$ar_state_native.this.$rejected_phrases = value;
        }

        @Override
        public SubLObject setField9(final SubLObject value) {
            return rkf_assisted_reader.$ar_state_native.this.$irrelevant_phrases = value;
        }

        @Override
        public SubLObject setField10(final SubLObject value) {
            return rkf_assisted_reader.$ar_state_native.this.$ambiguous_phrases = value;
        }

        @Override
        public SubLObject setField11(final SubLObject value) {
            return rkf_assisted_reader.$ar_state_native.this.$assumed_phrases = value;
        }

        @Override
        public SubLObject setField12(final SubLObject value) {
            return rkf_assisted_reader.$ar_state_native.this.$pending_phrases = value;
        }

        @Override
        public SubLObject setField13(final SubLObject value) {
            return rkf_assisted_reader.$ar_state_native.this.$accepted_phrases = value;
        }

        @Override
        public SubLObject setField14(final SubLObject value) {
            return rkf_assisted_reader.$ar_state_native.this.$pending_concepts = value;
        }

        @Override
        public SubLObject setField15(final SubLObject value) {
            return rkf_assisted_reader.$ar_state_native.this.$accepted_concepts = value;
        }

        @Override
        public SubLObject setField16(final SubLObject value) {
            return rkf_assisted_reader.$ar_state_native.this.$candidate_cycls = value;
        }

        @Override
        public SubLObject setField17(final SubLObject value) {
            return rkf_assisted_reader.$ar_state_native.this.$asserted_assertions = value;
        }

        @Override
        public SubLObject setField18(final SubLObject value) {
            return rkf_assisted_reader.$ar_state_native.this.$term_templates = value;
        }

        @Override
        public SubLObject setField19(final SubLObject value) {
            return rkf_assisted_reader.$ar_state_native.this.$assert_templates = value;
        }

        static {
            structDecl = makeStructDeclNative(com.cyc.cycjava.cycl.rkf_assisted_reader.$ar_state_native.class, AR_STATE, AR_STATE_P, $list181, $list182, new String[]{ "$isg", "$index", "$source_sentences", "$focus_sentence", "$completed_sentences", "$unknown_phrases", "$rejected_phrases", "$irrelevant_phrases", "$ambiguous_phrases", "$assumed_phrases", "$pending_phrases", "$accepted_phrases", "$pending_concepts", "$accepted_concepts", "$candidate_cycls", "$asserted_assertions", "$term_templates", "$assert_templates" }, $list183, $list184, DEFAULT_STRUCT_PRINT_FUNCTION);
        }
    }

    static private final SubLSymbol $sym222$AR_PHRASE_SPAN_LENGTH_ = makeSymbol("AR-PHRASE-SPAN-LENGTH>");

    static private final SubLSymbol $sym223$AR_CONCEPT_ASSERTION_ = makeSymbol("AR-CONCEPT-ASSERTION?");

    static private final SubLSymbol $sym224$AR_CONCEPT_QUERY_ = makeSymbol("AR-CONCEPT-QUERY?");

    static private final SubLSymbol $sym225$_ = makeSymbol("<");

    static private final SubLString $str_alt229$no_discourse_context = makeString("no discourse-context");

    static private final SubLSymbol $sym231$RKF_DISC_IMPLIED_INDEXICALS_FORMULA_ = makeSymbol("RKF-DISC-IMPLIED-INDEXICALS-FORMULA?");

    static private final SubLList $list_alt236 = list(list(makeSymbol("*AR-CONCEPT-GROUNDING-MAP*"), NIL));

    static private final SubLList $list_alt237 = list(makeSymbol("ENSURE-AR-CONCEPT-GROUNDING-MAP"));

    static private final SubLSymbol $sym244$_ = makeSymbol(">");

    static private final SubLString $str_alt255$Assisted_Reader_rewriting_a_sente = makeString("Assisted Reader rewriting a sentence");

    static private final SubLList $list_alt260 = list(list(makeSymbol("RKF-QUESTION-READER"), reader_make_constant_shell("QuestionTemplate")), list(makeSymbol("RKF-SENTENCE-READER"), reader_make_constant_shell("STemplate")));

    static private final SubLSymbol $sym265$RTP_TEMPLATE_CATEGORY_ = makeSymbol("RTP-TEMPLATE-CATEGORY?");

    static private final SubLSymbol $sym267$UNKNOWN_INSTANCE_INDEXED_EXPRESSION_ = makeSymbol("UNKNOWN-INSTANCE-INDEXED-EXPRESSION?");

    static private final SubLString $str_alt270$UIA_use = makeString("UIA-use");

    static private final SubLSymbol $sym281$RKF_REFORMULATABLE_TERM_ = makeSymbol("RKF-REFORMULATABLE-TERM?");

    static private final SubLList $list_alt283 = list(reader_make_constant_shell("VariableFn"), reader_make_constant_shell("TheVPParse"), reader_make_constant_shell("SomeFn"), reader_make_constant_shell("TheActiveSubject"), reader_make_constant_shell("TheResultOfParsing"));

    static private final SubLString $str_alt288$Important__Assuming_you_didn_t_me = makeString("Important: Assuming you didn't mean ~a by ~S.");

    static private final SubLList $list_alt289 = list(list(makeSymbol("CONSTRAINTS")), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list_alt293 = list(reader_make_constant_shell("TheResultOfParsing"), reader_make_constant_shell("TheCoordinationSet"), reader_make_constant_shell("RewriteSequenceFn"), reader_make_constant_shell("TheSpec"), reader_make_constant_shell("TheInstance"), reader_make_constant_shell("The"));

    static private final SubLList $list_alt296 = list(reader_make_constant_shell("TheSpec"), reader_make_constant_shell("TheInstance"));

    public static final class $ar_state_p$UnaryFunction extends UnaryFunction {
        public $ar_state_p$UnaryFunction() {
            super(extractFunctionNamed("AR-STATE-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return ar_state_p(arg1);
        }
    }

    public static final SubLSymbol $kw305$_MEMOIZED_ITEM_NOT_FOUND_ = makeKeyword("&MEMOIZED-ITEM-NOT-FOUND&");
}

/**
 * Total time: 1772 ms
 */
