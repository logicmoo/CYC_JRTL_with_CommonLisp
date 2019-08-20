/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.constant_handles.constant_p;
import static com.cyc.cycjava.cycl.constant_handles.reader_make_constant_shell;
import static com.cyc.cycjava.cycl.constant_handles.valid_constantP;
import static com.cyc.cycjava.cycl.el_utilities.replace_formula_arg;
import static com.cyc.cycjava.cycl.kb_indexing_datastructures.indexed_term_p;
import static com.cyc.cycjava.cycl.subl_macro_promotions.declare_defglobal;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.upper_case_p;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.append;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.listS;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.set_nth;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.identity;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.funcall;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.gethash;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.make_hash_table;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks.make_lock;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks.release_lock;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks.seize_lock;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.nreverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.remove;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.def_csetf;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.makeStructDeclNative;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.register_method;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.boundp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.arg2;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.multiple_value_list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.resetMultipleValues;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.values;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeUninternedSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.cdestructuring_bind_error;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.property_list_member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.butlast;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cadr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cddr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.copy_list;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.second;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.third;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.$print_object_method_table$;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.bq_cons;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.declareMacro;
import static com.cyc.tool.subl.util.SubLFiles.defconstant;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;

import org.armedbear.lisp.Lisp;

import com.cyc.cycjava.cycl.inference.ask_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.BinaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
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
 * module:      RBP-RULE-BANK
 * source file: /cyc/top/cycl/rbp-rule-bank.lisp
 * created:     2019/07/03 17:38:24
 */
public final class rbp_rule_bank extends SubLTranslatedFile implements V12 {
    public static final class $recursive_block_parser_rule_native extends SubLStructNative {
        public SubLStructDecl getStructDecl() {
            return structDecl;
        }

        public SubLObject getField2() {
            return com.cyc.cycjava.cycl.rbp_rule_bank.$recursive_block_parser_rule_native.this.$cycl;
        }

        public SubLObject getField3() {
            return com.cyc.cycjava.cycl.rbp_rule_bank.$recursive_block_parser_rule_native.this.$filter_layers;
        }

        public SubLObject setField2(SubLObject value) {
            return com.cyc.cycjava.cycl.rbp_rule_bank.$recursive_block_parser_rule_native.this.$cycl = value;
        }

        public SubLObject setField3(SubLObject value) {
            return com.cyc.cycjava.cycl.rbp_rule_bank.$recursive_block_parser_rule_native.this.$filter_layers = value;
        }

        public SubLObject $cycl = Lisp.NIL;

        public SubLObject $filter_layers = Lisp.NIL;

        private static final SubLStructDeclNative structDecl = makeStructDeclNative(com.cyc.cycjava.cycl.rbp_rule_bank.$recursive_block_parser_rule_native.class, RECURSIVE_BLOCK_PARSER_RULE, RECURSIVE_BLOCK_PARSER_RULE_P, $list_alt39, $list_alt40, new String[]{ "$cycl", "$filter_layers" }, $list_alt41, $list_alt42, PPRINT_RBP_RULE);
    }

    public static final SubLFile me = new rbp_rule_bank();





    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $rbp_rule_bank_lock$ = makeSymbol("*RBP-RULE-BANK-LOCK*");

    // defconstant
    @LispMethod(comment = "defconstant")
    public static final SubLSymbol $rbp_syntactic_constraint_types$ = makeSymbol("*RBP-SYNTACTIC-CONSTRAINT-TYPES*");

    // defconstant
    @LispMethod(comment = "defconstant")
    public static final SubLSymbol $rbp_semantic_constraint_types$ = makeSymbol("*RBP-SEMANTIC-CONSTRAINT-TYPES*");

    // defconstant
    @LispMethod(comment = "defconstant")
    public static final SubLSymbol $rbp_open_class_constraint_types$ = makeSymbol("*RBP-OPEN-CLASS-CONSTRAINT-TYPES*");

    // defconstant
    @LispMethod(comment = "defconstant")
    public static final SubLSymbol $rbp_closed_class_constraint_types$ = makeSymbol("*RBP-CLOSED-CLASS-CONSTRAINT-TYPES*");

    // defparameter
    @LispMethod(comment = "defparameter")
    public static final SubLSymbol $rbp_constrained_types$ = makeSymbol("*RBP-CONSTRAINED-TYPES*");

    // defconstant
    @LispMethod(comment = "defconstant")
    public static final SubLSymbol $dtp_recursive_block_parser_rule$ = makeSymbol("*DTP-RECURSIVE-BLOCK-PARSER-RULE*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $rbp_term_keyword_map$ = makeSymbol("*RBP-TERM-KEYWORD-MAP*");

    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $rbp_lambda_layer$ = makeSymbol("*RBP-LAMBDA-LAYER*");

    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    public static final SubLSymbol $rbp_rule_bank$ = makeSymbol("*RBP-RULE-BANK*");

    public static final SubLSymbol $rbp_rule_index$ = makeSymbol("*RBP-RULE-INDEX*");

    public static final SubLSymbol $rbp_rb_initializedP$ = makeSymbol("*RBP-RB-INITIALIZED?*");

    static private final SubLString $$$RBP_Rule_Bank_Lock = makeString("RBP Rule Bank Lock");

    static private final SubLList $list5 = list(makeSymbol("*RBP-RULE-BANK-LOCK*"));

    static private final SubLList $list6 = list($PRED, makeKeyword("POS"), makeKeyword("WU"));

    static private final SubLList $list7 = list($GENL, makeKeyword("TYPE-GENL"), makeKeyword("ISA"), makeKeyword("EQL"));

    static private final SubLList $list8 = list(makeKeyword("WU"), $GENL, makeKeyword("TYPE-GENL"), makeKeyword("ISA"), makeKeyword("EQL"));

    static private final SubLList $list9 = list(makeKeyword("POS"), $PRED);

    static private final SubLList $list10 = list(list(makeSymbol("TYPE"), makeSymbol("&KEY"), makeSymbol("DONE"), list(makeSymbol("MODE"), makeKeyword("ALL"))), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list11 = list($DONE, $MODE);

    private static final SubLSymbol $ALLOW_OTHER_KEYS = makeKeyword("ALLOW-OTHER-KEYS");

    static private final SubLSymbol $sym16$SYNTACTIC_TYPES = makeUninternedSymbol("SYNTACTIC-TYPES");

    static private final SubLSymbol $sym17$SEMANTIC_TYPES = makeUninternedSymbol("SEMANTIC-TYPES");

    static private final SubLSymbol $sym18$OPEN_TYPES = makeUninternedSymbol("OPEN-TYPES");

    static private final SubLSymbol $sym19$CLOSED_TYPES = makeUninternedSymbol("CLOSED-TYPES");

    static private final SubLList $list21 = list(makeSymbol("*RBP-SYNTACTIC-CONSTRAINT-TYPES*"));

    static private final SubLList $list22 = list(makeSymbol("*RBP-SEMANTIC-CONSTRAINT-TYPES*"));

    static private final SubLList $list23 = list(makeSymbol("*RBP-OPEN-CLASS-CONSTRAINT-TYPES*"));

    static private final SubLList $list24 = list(makeSymbol("*RBP-CLOSED-CLASS-CONSTRAINT-TYPES*"));

    static private final SubLList $list27 = list(makeKeyword("ALL"));

    static private final SubLList $list28 = list(makeKeyword("SYNTACTIC"));

    static private final SubLList $list30 = list(makeKeyword("SEMANTIC"));

    static private final SubLList $list31 = list(makeKeyword("OPEN-CLASS"));

    static private final SubLList $list32 = list(makeKeyword("CLOSED-CLASS"));

    static private final SubLList $list33 = list($HEAD, makeKeyword("MODIFIER"));

    static private final SubLList $list34 = list(list($TEST, makeSymbol("RBP-SYNTACTIC-CONSTRAINT-TYPE-P")), makeKeyword("ANYTHING"), makeKeyword("ANYTHING"));

    static private final SubLList $list35 = list(makeKeyword("WU"), makeKeyword("ANYTHING"), makeKeyword("ANYTHING"));

    static private final SubLList $list36 = list(makeKeyword("OR"), list(list($TEST, makeSymbol("RBP-SEMANTIC-CONSTRAINT-TYPE-P")), makeKeyword("ANYTHING"), makeKeyword("ANYTHING")), list(reader_make_constant_shell("FormulaArgFn"), list($TEST, makeSymbol("POSITIVE-INTEGER-P")), list($TEST, makeSymbol("RBP-SEMANTIC-CONSTRAINT-P"))));

    private static final SubLSymbol RECURSIVE_BLOCK_PARSER_RULE = makeSymbol("RECURSIVE-BLOCK-PARSER-RULE");

    private static final SubLSymbol RECURSIVE_BLOCK_PARSER_RULE_P = makeSymbol("RECURSIVE-BLOCK-PARSER-RULE-P");

    static private final SubLList $list39 = list(makeSymbol("CYCL"), makeSymbol("FILTER-LAYERS"));

    static private final SubLList $list40 = list($CYCL, makeKeyword("FILTER-LAYERS"));

    static private final SubLList $list41 = list(makeSymbol("RBP-RULE-CYCL"), makeSymbol("RBP-RULE-FILTER-LAYERS"));

    static private final SubLList $list42 = list(makeSymbol("_CSETF-RBP-RULE-CYCL"), makeSymbol("_CSETF-RBP-RULE-FILTER-LAYERS"));

    private static final SubLSymbol PPRINT_RBP_RULE = makeSymbol("PPRINT-RBP-RULE");

    private static final SubLSymbol RECURSIVE_BLOCK_PARSER_RULE_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("RECURSIVE-BLOCK-PARSER-RULE-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLList $list45 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("RECURSIVE-BLOCK-PARSER-RULE-P"));

    private static final SubLSymbol RBP_RULE_CYCL = makeSymbol("RBP-RULE-CYCL");

    private static final SubLSymbol _CSETF_RBP_RULE_CYCL = makeSymbol("_CSETF-RBP-RULE-CYCL");

    private static final SubLSymbol RBP_RULE_FILTER_LAYERS = makeSymbol("RBP-RULE-FILTER-LAYERS");

    private static final SubLSymbol _CSETF_RBP_RULE_FILTER_LAYERS = makeSymbol("_CSETF-RBP-RULE-FILTER-LAYERS");

    private static final SubLString $str52$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");

    private static final SubLSymbol MAKE_RECURSIVE_BLOCK_PARSER_RULE = makeSymbol("MAKE-RECURSIVE-BLOCK-PARSER-RULE");

    private static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_RECURSIVE_BLOCK_PARSER_RULE_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-RECURSIVE-BLOCK-PARSER-RULE-METHOD");

    private static final SubLString $str58$__RBP_RULE__S_ = makeString("#<RBP-RULE ~S>");

    private static final SubLSymbol RBP_RB_ALL_RULES_SORTED = makeSymbol("RBP-RB-ALL-RULES-SORTED");

    private static final SubLSymbol $rbp_rb_all_rules_sorted_caching_state$ = makeSymbol("*RBP-RB-ALL-RULES-SORTED-CACHING-STATE*");

    private static final SubLSymbol $sym61$RBP_RULE__ = makeSymbol("RBP-RULE-<");

    private static final SubLSymbol ALL_GENL_PREDS = makeSymbol("ALL-GENL-PREDS");

    private static final SubLSymbol RBP_RB_ALL_GENLS = makeSymbol("RBP-RB-ALL-GENLS");

    private static final SubLSymbol RBP_RB_ALL_TYPE_GENLS = makeSymbol("RBP-RB-ALL-TYPE-GENLS");

    private static final SubLSymbol RBP_RB_ALL_ISA = makeSymbol("RBP-RB-ALL-ISA");

    private static final SubLSymbol $sym75$RBP_WFF_ISA_ = makeSymbol("RBP-WFF-ISA?");

    private static final SubLSymbol $sym76$NPP_GENL_ = makeSymbol("NPP-GENL?");



    static private final SubLList $list82 = list(makeKeyword("EXCLUDE"), makeKeyword("ANYTHING"));



    static private final SubLList $list86 = list(makeString("NCNotEqualsConstraintFn"), makeString("NCNotIsaConstraintFn"), makeString("NCNotGenlsConstraintFn"));

    private static final SubLList $list87 = list(cons(makeString("NCNotEqualsConstraintFn"), reader_make_constant_shell("NCEqualsConstraintFn")), cons(makeString("NCNotIsaConstraintFn"), reader_make_constant_shell("NCIsaConstraintFn")), cons(makeString("NCNotGenlsConstraintFn"), reader_make_constant_shell("NCGenlsConstraintFn")));

    private static final SubLSymbol RBP_FORTS_TO_KEYWORDS = makeSymbol("RBP-FORTS-TO-KEYWORDS");

    static private final SubLList $list90 = list(cons(reader_make_constant_shell("NCPOSConstraintFn"), makeKeyword("POS")), cons(reader_make_constant_shell("NCPOSPredConstraintFn"), $PRED), cons(reader_make_constant_shell("NCEqualsConstraintFn"), makeKeyword("EQL")), cons(reader_make_constant_shell("NCGenlsConstraintFn"), $GENL), cons(reader_make_constant_shell("NCIsaConstraintFn"), makeKeyword("ISA")), cons(reader_make_constant_shell("TheNCHead"), $HEAD), cons(reader_make_constant_shell("TheNCModifier"), makeKeyword("MODIFIER")));

    private static final SubLList $list91 = list(makeSymbol("NEW-CONSTRAINT-TYPE"), makeSymbol("KEYWORD"));

    private static final SubLString $$$NCWordUnitConstraintFn = makeString("NCWordUnitConstraintFn");

    private static final SubLString $$$NCTypeGenlsConstraintFn = makeString("NCTypeGenlsConstraintFn");

    private static final SubLList $list95 = list(makeKeyword("ISA"), $GENL);



    private static final SubLString $str97$__Passed_all__S_constraints_for__ = makeString("~&Passed all ~S constraints for~% ~S~%");

    private static final SubLSymbol $sym98$RBP_RB_LAYER_EXEMPT_RULE_LAMBDA_ = makeSymbol("RBP-RB-LAYER-EXEMPT-RULE-LAMBDA?");

    private static final SubLString $str99$__The__S_block_s__S_value__S__did = makeString("~%The ~S block\'s ~S value ~S\n did not satisfy the constraints ~S\n on the rule ~S~%~%");



    private static final SubLSymbol RBP_RB_KEYS_FROM_BASE_INT = makeSymbol("RBP-RB-KEYS-FROM-BASE-INT");



    private static final SubLSymbol $sym105$_TYPE = makeSymbol("?TYPE");





    private static final SubLList $list108 = list(makeSymbol("?SPEC"));

    static private final SubLList $list109 = list(list(reader_make_constant_shell("genls"), makeSymbol("?SPEC"), makeSymbol("?TYPE")));





    private static final SubLSymbol NOUN_COMPOUND_CONSTRAINT_STRING_SPECS = makeSymbol("NOUN-COMPOUND-CONSTRAINT-STRING-SPECS");

    private static final SubLSymbol $sym113$_COL = makeSymbol("?COL");

    private static final SubLList $list114 = list(reader_make_constant_shell("and"), list(reader_make_constant_shell("assertedSentence"), list(reader_make_constant_shell("isaConstraintForNCR"), makeSymbol("?RULE"), makeSymbol("?INDEXICAL"), makeSymbol("?COL"))), list(reader_make_constant_shell("genls"), makeSymbol("?COL"), reader_make_constant_shell("CharacterString")));



    private static final SubLSymbol $noun_compound_constraint_string_specs_caching_state$ = makeSymbol("*NOUN-COMPOUND-CONSTRAINT-STRING-SPECS-CACHING-STATE*");

    // Definitions
    public static final SubLObject rbp_new_rule_bank_alt() {
        return dictionary.new_dictionary(symbol_function(EQUAL), SIXTEEN_INTEGER);
    }

    // Definitions
    public static SubLObject rbp_new_rule_bank() {
        return dictionary.new_dictionary(symbol_function(EQUAL), SIXTEEN_INTEGER);
    }

    public static final SubLObject note_rbp_rb_initialized_alt() {
        $rbp_rb_initializedP$.setGlobalValue(T);
        return $rbp_rb_initializedP$.getGlobalValue();
    }

    public static SubLObject note_rbp_rb_initialized() {
        $rbp_rb_initializedP$.setGlobalValue(T);
        return $rbp_rb_initializedP$.getGlobalValue();
    }

    public static final SubLObject with_rbp_rule_bank_lock_held_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject body = current;
            return listS(WITH_LOCK_HELD, $list_alt5, append(body, NIL));
        }
    }

    public static SubLObject with_rbp_rule_bank_lock_held(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(WITH_LOCK_HELD, $list5, append(body, NIL));
    }

    /**
     *
     *
     * @unknown mode keywordp equals :all, :semantic, :syntactic, :closed-class, or :open-class
     */
    @LispMethod(comment = "@unknown mode keywordp equals :all, :semantic, :syntactic, :closed-class, or :open-class")
    public static final SubLObject do_rbp_constraint_types_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt10);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject type = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt10);
                    type = current.first();
                    current = current.rest();
                    {
                        SubLObject allow_other_keys_p = NIL;
                        SubLObject rest = current;
                        SubLObject bad = NIL;
                        SubLObject current_1 = NIL;
                        for (; NIL != rest;) {
                            destructuring_bind_must_consp(rest, datum, $list_alt10);
                            current_1 = rest.first();
                            rest = rest.rest();
                            destructuring_bind_must_consp(rest, datum, $list_alt10);
                            if (NIL == member(current_1, $list_alt11, UNPROVIDED, UNPROVIDED)) {
                                bad = T;
                            }
                            if (current_1 == $ALLOW_OTHER_KEYS) {
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
                            SubLObject mode_tail = property_list_member($MODE, current);
                            SubLObject mode = (NIL != mode_tail) ? ((SubLObject) (cadr(mode_tail))) : $ALL;
                            current = temp;
                            {
                                SubLObject body = current;
                                SubLObject syntactic_types = $sym16$SYNTACTIC_TYPES;
                                SubLObject semantic_types = $sym17$SEMANTIC_TYPES;
                                SubLObject open_types = $sym18$OPEN_TYPES;
                                SubLObject closed_types = $sym19$CLOSED_TYPES;
                                return list(CLET, list(bq_cons(syntactic_types, $list_alt21), bq_cons(semantic_types, $list_alt22), bq_cons(open_types, $list_alt23), bq_cons(closed_types, $list_alt24)), list(PWHEN, list(COR, listS(EQL, mode, $list_alt27), listS(EQL, mode, $list_alt28)), listS(CSOME, list(type, syntactic_types, done), append(body, NIL))), list(PWHEN, list(COR, listS(EQL, mode, $list_alt27), listS(EQL, mode, $list_alt30)), listS(CSOME, list(type, semantic_types, done), append(body, NIL))), list(PWHEN, listS(EQL, mode, $list_alt31), listS(CSOME, list(type, open_types, done), append(body, NIL))), list(PWHEN, listS(EQL, mode, $list_alt32), listS(CSOME, list(type, closed_types, done), append(body, NIL))));
                            }
                        }
                    }
                }
            }
        }
    }

    /**
     *
     *
     * @unknown mode keywordp equals :all, :semantic, :syntactic, :closed-class, or :open-class
     */
    @LispMethod(comment = "@unknown mode keywordp equals :all, :semantic, :syntactic, :closed-class, or :open-class")
    public static SubLObject do_rbp_constraint_types(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list10);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject type = NIL;
        destructuring_bind_must_consp(current, datum, $list10);
        type = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$1 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list10);
            current_$1 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list10);
            if (NIL == member(current_$1, $list11, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$1 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list10);
        }
        final SubLObject done_tail = property_list_member($DONE, current);
        final SubLObject done = (NIL != done_tail) ? cadr(done_tail) : NIL;
        final SubLObject mode_tail = property_list_member($MODE, current);
        final SubLObject mode = (NIL != mode_tail) ? cadr(mode_tail) : $ALL;
        final SubLObject body;
        current = body = temp;
        final SubLObject syntactic_types = $sym16$SYNTACTIC_TYPES;
        final SubLObject semantic_types = $sym17$SEMANTIC_TYPES;
        final SubLObject open_types = $sym18$OPEN_TYPES;
        final SubLObject closed_types = $sym19$CLOSED_TYPES;
        return list(CLET, list(bq_cons(syntactic_types, $list21), bq_cons(semantic_types, $list22), bq_cons(open_types, $list23), bq_cons(closed_types, $list24)), list(PWHEN, list(COR, listS(EQL, mode, $list27), listS(EQL, mode, $list28)), listS(CSOME, list(type, syntactic_types, done), append(body, NIL))), list(PWHEN, list(COR, listS(EQL, mode, $list27), listS(EQL, mode, $list30)), listS(CSOME, list(type, semantic_types, done), append(body, NIL))), list(PWHEN, listS(EQL, mode, $list31), listS(CSOME, list(type, open_types, done), append(body, NIL))), list(PWHEN, listS(EQL, mode, $list32), listS(CSOME, list(type, closed_types, done), append(body, NIL))));
    }

    public static final SubLObject rbp_syntactic_constraint_type_p_alt(SubLObject v_object) {
        return subl_promotions.memberP(v_object, $rbp_syntactic_constraint_types$.getGlobalValue(), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject rbp_syntactic_constraint_type_p(final SubLObject v_object) {
        return subl_promotions.memberP(v_object, $rbp_syntactic_constraint_types$.getGlobalValue(), UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject rbp_semantic_constraint_type_p_alt(SubLObject v_object) {
        return subl_promotions.memberP(v_object, $rbp_semantic_constraint_types$.getGlobalValue(), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject rbp_semantic_constraint_type_p(final SubLObject v_object) {
        return subl_promotions.memberP(v_object, $rbp_semantic_constraint_types$.getGlobalValue(), UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject rbp_syntactic_constraint_p_alt(SubLObject v_object) {
        return formula_pattern_match.formula_matches_pattern(v_object, $list_alt34);
    }

    public static SubLObject rbp_syntactic_constraint_p(final SubLObject v_object) {
        return formula_pattern_match.formula_matches_pattern(v_object, $list34);
    }

    public static final SubLObject rbp_word_unit_constraint_p_alt(SubLObject v_object) {
        return formula_pattern_match.formula_matches_pattern(v_object, $list_alt35);
    }

    public static SubLObject rbp_word_unit_constraint_p(final SubLObject v_object) {
        return formula_pattern_match.formula_matches_pattern(v_object, $list35);
    }

    public static final SubLObject rbp_semantic_constraint_p_alt(SubLObject v_object) {
        return formula_pattern_match.formula_matches_pattern(v_object, $list_alt36);
    }

    public static SubLObject rbp_semantic_constraint_p(final SubLObject v_object) {
        return formula_pattern_match.formula_matches_pattern(v_object, $list36);
    }

    public static final SubLObject recursive_block_parser_rule_print_function_trampoline_alt(SubLObject v_object, SubLObject stream) {
        pprint_rbp_rule(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject recursive_block_parser_rule_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        pprint_rbp_rule(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject recursive_block_parser_rule_p_alt(SubLObject v_object) {
        return v_object.getClass() == com.cyc.cycjava.cycl.rbp_rule_bank.$recursive_block_parser_rule_native.class ? ((SubLObject) (T)) : NIL;
    }

    public static SubLObject recursive_block_parser_rule_p(final SubLObject v_object) {
        return v_object.getClass() == com.cyc.cycjava.cycl.rbp_rule_bank.$recursive_block_parser_rule_native.class ? T : NIL;
    }

    public static final SubLObject rbp_rule_cycl_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, RECURSIVE_BLOCK_PARSER_RULE_P);
        return v_object.getField2();
    }

    public static SubLObject rbp_rule_cycl(final SubLObject v_object) {
        assert NIL != recursive_block_parser_rule_p(v_object) : "! rbp_rule_bank.recursive_block_parser_rule_p(v_object) " + "rbp_rule_bank.recursive_block_parser_rule_p error :" + v_object;
        return v_object.getField2();
    }

    public static final SubLObject rbp_rule_filter_layers_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, RECURSIVE_BLOCK_PARSER_RULE_P);
        return v_object.getField3();
    }

    public static SubLObject rbp_rule_filter_layers(final SubLObject v_object) {
        assert NIL != recursive_block_parser_rule_p(v_object) : "! rbp_rule_bank.recursive_block_parser_rule_p(v_object) " + "rbp_rule_bank.recursive_block_parser_rule_p error :" + v_object;
        return v_object.getField3();
    }

    public static final SubLObject _csetf_rbp_rule_cycl_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, RECURSIVE_BLOCK_PARSER_RULE_P);
        return v_object.setField2(value);
    }

    public static SubLObject _csetf_rbp_rule_cycl(final SubLObject v_object, final SubLObject value) {
        assert NIL != recursive_block_parser_rule_p(v_object) : "! rbp_rule_bank.recursive_block_parser_rule_p(v_object) " + "rbp_rule_bank.recursive_block_parser_rule_p error :" + v_object;
        return v_object.setField2(value);
    }

    public static final SubLObject _csetf_rbp_rule_filter_layers_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, RECURSIVE_BLOCK_PARSER_RULE_P);
        return v_object.setField3(value);
    }

    public static SubLObject _csetf_rbp_rule_filter_layers(final SubLObject v_object, final SubLObject value) {
        assert NIL != recursive_block_parser_rule_p(v_object) : "! rbp_rule_bank.recursive_block_parser_rule_p(v_object) " + "rbp_rule_bank.recursive_block_parser_rule_p error :" + v_object;
        return v_object.setField3(value);
    }

    public static final SubLObject make_recursive_block_parser_rule_alt(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        {
            SubLObject v_new = new com.cyc.cycjava.cycl.rbp_rule_bank.$recursive_block_parser_rule_native();
            SubLObject next = NIL;
            for (next = arglist; NIL != next; next = cddr(next)) {
                {
                    SubLObject current_arg = next.first();
                    SubLObject current_value = cadr(next);
                    SubLObject pcase_var = current_arg;
                    if (pcase_var.eql($CYCL)) {
                        _csetf_rbp_rule_cycl(v_new, current_value);
                    } else {
                        if (pcase_var.eql($FILTER_LAYERS)) {
                            _csetf_rbp_rule_filter_layers(v_new, current_value);
                        } else {
                            Errors.error($str_alt51$Invalid_slot__S_for_construction_, current_arg);
                        }
                    }
                }
            }
            return v_new;
        }
    }

    public static SubLObject make_recursive_block_parser_rule(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new com.cyc.cycjava.cycl.rbp_rule_bank.$recursive_block_parser_rule_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
            current_arg = next.first();
            current_value = cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql($CYCL)) {
                _csetf_rbp_rule_cycl(v_new, current_value);
            } else
                if (pcase_var.eql($FILTER_LAYERS)) {
                    _csetf_rbp_rule_filter_layers(v_new, current_value);
                } else {
                    Errors.error($str52$Invalid_slot__S_for_construction_, current_arg);
                }

        }
        return v_new;
    }

    public static SubLObject visit_defstruct_recursive_block_parser_rule(final SubLObject obj, final SubLObject visitor_fn) {
        funcall(visitor_fn, obj, $BEGIN, MAKE_RECURSIVE_BLOCK_PARSER_RULE, TWO_INTEGER);
        funcall(visitor_fn, obj, $SLOT, $CYCL, rbp_rule_cycl(obj));
        funcall(visitor_fn, obj, $SLOT, $FILTER_LAYERS, rbp_rule_filter_layers(obj));
        funcall(visitor_fn, obj, $END, MAKE_RECURSIVE_BLOCK_PARSER_RULE, TWO_INTEGER);
        return obj;
    }

    public static SubLObject visit_defstruct_object_recursive_block_parser_rule_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_recursive_block_parser_rule(obj, visitor_fn);
    }

    public static final SubLObject pprint_rbp_rule_alt(SubLObject rbp_rule, SubLObject stream, SubLObject depth) {
        if (stream == UNPROVIDED) {
            stream = NIL;
        }
        if (depth == UNPROVIDED) {
            depth = NIL;
        }
        format(stream, $str_alt52$__RBP_RULE__S_, rbp_rule_cycl(rbp_rule));
        return rbp_rule;
    }

    public static SubLObject pprint_rbp_rule(final SubLObject rbp_rule, SubLObject stream, SubLObject depth) {
        if (stream == UNPROVIDED) {
            stream = NIL;
        }
        if (depth == UNPROVIDED) {
            depth = NIL;
        }
        format(stream, $str58$__RBP_RULE__S_, rbp_rule_cycl(rbp_rule));
        return rbp_rule;
    }

    public static final SubLObject new_rbp_rule_alt(SubLObject cycl) {
        {
            SubLObject rule = make_recursive_block_parser_rule(list($CYCL, cycl, $FILTER_LAYERS, set.new_set(symbol_function(EQL), UNPROVIDED)));
            rbp_rule_note_cycl(rule, cycl);
            return rule;
        }
    }

    public static SubLObject new_rbp_rule(final SubLObject cycl) {
        final SubLObject rule = make_recursive_block_parser_rule(list($CYCL, cycl, $FILTER_LAYERS, set.new_set(symbol_function(EQL), UNPROVIDED)));
        rbp_rule_note_cycl(rule, cycl);
        return rule;
    }

    public static final SubLObject rbp_rule_note_cycl_alt(SubLObject rbp_rule, SubLObject cycl) {
        return dictionary.dictionary_enter($rbp_rule_index$.getGlobalValue(), cycl, rbp_rule);
    }

    public static SubLObject rbp_rule_note_cycl(final SubLObject rbp_rule, final SubLObject cycl) {
        return dictionary.dictionary_enter($rbp_rule_index$.getGlobalValue(), cycl, rbp_rule);
    }

    /**
     * Given RULE-CYCL, return the RBP-RULE derived from it.
     */
    @LispMethod(comment = "Given RULE-CYCL, return the RBP-RULE derived from it.")
    public static final SubLObject rbp_find_or_create_rule_from_cycl_alt(SubLObject rule_cycl) {
        {
            SubLObject found = rbp_find_rule_from_cycl(rule_cycl, NIL);
            return NIL != recursive_block_parser_rule_p(found) ? ((SubLObject) (found)) : new_rbp_rule(rule_cycl);
        }
    }

    /**
     * Given RULE-CYCL, return the RBP-RULE derived from it.
     */
    @LispMethod(comment = "Given RULE-CYCL, return the RBP-RULE derived from it.")
    public static SubLObject rbp_find_or_create_rule_from_cycl(final SubLObject rule_cycl) {
        final SubLObject found = rbp_find_rule_from_cycl(rule_cycl, NIL);
        return NIL != recursive_block_parser_rule_p(found) ? found : new_rbp_rule(rule_cycl);
    }

    /**
     * Given RULE-CYCL, return the RBP-RULE derived from it.
     */
    @LispMethod(comment = "Given RULE-CYCL, return the RBP-RULE derived from it.")
    public static final SubLObject rbp_find_rule_from_cycl_alt(SubLObject rule_cycl, SubLObject check_initializationP) {
        if (check_initializationP == UNPROVIDED) {
            check_initializationP = T;
        }
        if (NIL != check_initializationP) {
            rbp_rb_check_initialization();
        }
        return dictionary.dictionary_lookup($rbp_rule_index$.getGlobalValue(), narts_high.nart_substitute(rule_cycl), UNPROVIDED);
    }

    /**
     * Given RULE-CYCL, return the RBP-RULE derived from it.
     */
    @LispMethod(comment = "Given RULE-CYCL, return the RBP-RULE derived from it.")
    public static SubLObject rbp_find_rule_from_cycl(final SubLObject rule_cycl, SubLObject check_initializationP) {
        if (check_initializationP == UNPROVIDED) {
            check_initializationP = T;
        }
        if (NIL != check_initializationP) {
            rbp_rb_check_initialization();
        }
        return dictionary.dictionary_lookup($rbp_rule_index$.getGlobalValue(), narts_high.nart_substitute(rule_cycl), UNPROVIDED);
    }

    /**
     * Given RULE-CYCL, return the RBP-RULE derived from it.
     */
    @LispMethod(comment = "Given RULE-CYCL, return the RBP-RULE derived from it.")
    public static final SubLObject rbp_find_rule_from_cycl_w_initialized_rb_alt(SubLObject rule_cycl) {
        rbp_rb_check_initialization();
        return rbp_find_rule_from_cycl(rule_cycl, UNPROVIDED);
    }

    /**
     * Given RULE-CYCL, return the RBP-RULE derived from it.
     */
    @LispMethod(comment = "Given RULE-CYCL, return the RBP-RULE derived from it.")
    public static SubLObject rbp_find_rule_from_cycl_w_initialized_rb(final SubLObject rule_cycl) {
        rbp_rb_check_initialization();
        return rbp_find_rule_from_cycl(rule_cycl, UNPROVIDED);
    }

    /**
     * Given RULE, return the RULE-CYCL from which it is derived.
     */
    @LispMethod(comment = "Given RULE, return the RULE-CYCL from which it is derived.")
    public static final SubLObject rbp_find_cycl_from_rule_alt(SubLObject rule) {
        return dictionary_utilities.dictionary_reverse_lookup($rbp_rule_index$.getGlobalValue(), rule, UNPROVIDED);
    }

    /**
     * Given RULE, return the RULE-CYCL from which it is derived.
     */
    @LispMethod(comment = "Given RULE, return the RULE-CYCL from which it is derived.")
    public static SubLObject rbp_find_cycl_from_rule(final SubLObject rule) {
        return dictionary_utilities.dictionary_reverse_lookup($rbp_rule_index$.getGlobalValue(), rule, UNPROVIDED);
    }

    /**
     *
     *
     * @return DICTIONARY-P; key: FILTER-KEY, value: FILTER
     */
    @LispMethod(comment = "@return DICTIONARY-P; key: FILTER-KEY, value: FILTER")
    public static final SubLObject rbp_rb_filters_alt() {
        return $rbp_rule_bank$.getGlobalValue();
    }

    /**
     *
     *
     * @return DICTIONARY-P; key: FILTER-KEY, value: FILTER
     */
    @LispMethod(comment = "@return DICTIONARY-P; key: FILTER-KEY, value: FILTER")
    public static SubLObject rbp_rb_filters() {
        return $rbp_rule_bank$.getGlobalValue();
    }

    public static final SubLObject rbp_rb_add_filter_alt(SubLObject filter, SubLObject filter_key) {
        return dictionary.dictionary_enter(rbp_rb_filters(), filter_key, filter);
    }

    public static SubLObject rbp_rb_add_filter(final SubLObject filter, final SubLObject filter_key) {
        return dictionary.dictionary_enter(rbp_rb_filters(), filter_key, filter);
    }

    /**
     * How many rules are in the rule bank?
     */
    @LispMethod(comment = "How many rules are in the rule bank?")
    public static final SubLObject rbp_rb_rule_count_alt() {
        {
            SubLObject count = NIL;
            SubLObject lock = $rbp_rule_bank_lock$.getGlobalValue();
            SubLObject release = NIL;
            try {
                release = seize_lock(lock);
                count = dictionary.dictionary_length($rbp_rule_index$.getGlobalValue());
            } finally {
                if (NIL != release) {
                    release_lock(lock);
                }
            }
            return count;
        }
    }

    /**
     * How many rules are in the rule bank?
     */
    @LispMethod(comment = "How many rules are in the rule bank?")
    public static SubLObject rbp_rb_rule_count() {
        SubLObject count = NIL;
        SubLObject release = NIL;
        try {
            release = seize_lock($rbp_rule_bank_lock$.getGlobalValue());
            count = dictionary.dictionary_length($rbp_rule_index$.getGlobalValue());
        } finally {
            if (NIL != release) {
                release_lock($rbp_rule_bank_lock$.getGlobalValue());
            }
        }
        return count;
    }

    public static final SubLObject rbp_rb_all_rules_alt() {
        {
            SubLObject rules = NIL;
            SubLObject lock = $rbp_rule_bank_lock$.getGlobalValue();
            SubLObject release = NIL;
            try {
                release = seize_lock(lock);
                rules = dictionary.dictionary_values($rbp_rule_index$.getGlobalValue());
            } finally {
                if (NIL != release) {
                    release_lock(lock);
                }
            }
            return rules;
        }
    }

    public static SubLObject rbp_rb_all_rules() {
        SubLObject rules = NIL;
        SubLObject release = NIL;
        try {
            release = seize_lock($rbp_rule_bank_lock$.getGlobalValue());
            rules = dictionary.dictionary_values($rbp_rule_index$.getGlobalValue());
        } finally {
            if (NIL != release) {
                release_lock($rbp_rule_bank_lock$.getGlobalValue());
            }
        }
        return rules;
    }

    public static final SubLObject clear_rbp_rb_all_rules_sorted_alt() {
        {
            SubLObject cs = $rbp_rb_all_rules_sorted_caching_state$.getGlobalValue();
            if (NIL != cs) {
                memoization_state.caching_state_clear(cs);
            }
        }
        return NIL;
    }

    public static SubLObject clear_rbp_rb_all_rules_sorted() {
        final SubLObject cs = $rbp_rb_all_rules_sorted_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static final SubLObject remove_rbp_rb_all_rules_sorted_alt() {
        return memoization_state.caching_state_remove_function_results_with_args($rbp_rb_all_rules_sorted_caching_state$.getGlobalValue(), list(EMPTY_SUBL_OBJECT_ARRAY), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject remove_rbp_rb_all_rules_sorted() {
        return memoization_state.caching_state_remove_function_results_with_args($rbp_rb_all_rules_sorted_caching_state$.getGlobalValue(), list(EMPTY_SUBL_OBJECT_ARRAY), UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject rbp_rb_all_rules_sorted_internal_alt() {
        return sort_rbp_rules(rbp_rb_all_rules());
    }

    public static SubLObject rbp_rb_all_rules_sorted_internal() {
        return sort_rbp_rules(rbp_rb_all_rules());
    }

    public static final SubLObject rbp_rb_all_rules_sorted_alt() {
        {
            SubLObject caching_state = $rbp_rb_all_rules_sorted_caching_state$.getGlobalValue();
            if (NIL == caching_state) {
                caching_state = memoization_state.create_global_caching_state_for_name(RBP_RB_ALL_RULES_SORTED, $rbp_rb_all_rules_sorted_caching_state$, NIL, EQL, ZERO_INTEGER, ZERO_INTEGER);
            }
            {
                SubLObject results = memoization_state.caching_state_get_zero_arg_results(caching_state, UNPROVIDED);
                if (results == $kw55$_MEMOIZED_ITEM_NOT_FOUND_) {
                    results = arg2(resetMultipleValues(), multiple_value_list(rbp_rb_all_rules_sorted_internal()));
                    memoization_state.caching_state_set_zero_arg_results(caching_state, results, UNPROVIDED);
                }
                return memoization_state.caching_results(results);
            }
        }
    }

    public static SubLObject rbp_rb_all_rules_sorted() {
        SubLObject caching_state = $rbp_rb_all_rules_sorted_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(RBP_RB_ALL_RULES_SORTED, $rbp_rb_all_rules_sorted_caching_state$, NIL, EQL, ZERO_INTEGER, ZERO_INTEGER);
        }
        SubLObject results = memoization_state.caching_state_get_zero_arg_results(caching_state, UNPROVIDED);
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(resetMultipleValues(), multiple_value_list(rbp_rb_all_rules_sorted_internal()));
            memoization_state.caching_state_set_zero_arg_results(caching_state, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    public static final SubLObject sort_rbp_rules_alt(SubLObject rules) {
        return Sort.sort(rules, $sym56$RBP_RULE__, UNPROVIDED);
    }

    public static SubLObject sort_rbp_rules(final SubLObject rules) {
        return Sort.sort(rules, $sym61$RBP_RULE__, UNPROVIDED);
    }

    public static final SubLObject rbp_rule_L_alt(SubLObject rule1, SubLObject rule2) {
        return kb_utilities.term_L(rbp_rule_cycl(rule1), rbp_rule_cycl(rule2), NIL, NIL, T);
    }

    public static SubLObject rbp_rule_L(final SubLObject rule1, final SubLObject rule2) {
        return kb_utilities.term_L(rbp_rule_cycl(rule1), rbp_rule_cycl(rule2), NIL, NIL, T);
    }

    public static final SubLObject rbp_rules_sortedP_alt(SubLObject rules) {
        {
            SubLObject problemP = NIL;
            SubLObject prev = NIL;
            if (NIL == problemP) {
                {
                    SubLObject csome_list_var = rules;
                    SubLObject rule = NIL;
                    for (rule = csome_list_var.first(); !((NIL != problemP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , rule = csome_list_var.first()) {
                        problemP = makeBoolean((NIL != prev) && (NIL == rbp_rule_L(prev, rule)));
                    }
                }
            }
            return makeBoolean(NIL == problemP);
        }
    }

    public static SubLObject rbp_rules_sortedP(final SubLObject rules) {
        SubLObject problemP = NIL;
        final SubLObject prev = NIL;
        if (NIL == problemP) {
            SubLObject csome_list_var;
            SubLObject rule;
            for (csome_list_var = rules, rule = NIL, rule = csome_list_var.first(); (NIL == problemP) && (NIL != csome_list_var); problemP = makeBoolean((NIL != prev) && (NIL == rbp_rule_L(prev, rule))) , csome_list_var = csome_list_var.rest() , rule = csome_list_var.first()) {
            }
        }
        return makeBoolean(NIL == problemP);
    }

    public static final SubLObject rbp_rb_new_filter_alt(SubLObject filter_key) {
        return list(set_utilities.new_singleton_set(rbp_rb_new_layer(), symbol_function(EQUAL)), $NO_EXCLUSIONS, rbp_rb_fn_for_filter_key(filter_key));
    }

    public static SubLObject rbp_rb_new_filter(final SubLObject filter_key) {
        return list(set_utilities.new_singleton_set(rbp_rb_new_layer(), symbol_function(EQUAL)), $NO_EXCLUSIONS, rbp_rb_fn_for_filter_key(filter_key));
    }

    public static final SubLObject rbp_rb_filter_layers_set_alt(SubLObject filter) {
        return filter.first();
    }

    public static SubLObject rbp_rb_filter_layers_set(final SubLObject filter) {
        return filter.first();
    }

    public static final SubLObject rbp_rb_filter_exclusions_layer_alt(SubLObject filter) {
        return second(filter);
    }

    public static SubLObject rbp_rb_filter_exclusions_layer(final SubLObject filter) {
        return second(filter);
    }

    public static final SubLObject rbp_rb_filter_has_exclusions_p_alt(SubLObject filter) {
        return dictionary.dictionary_p(rbp_rb_filter_exclusions_layer(filter));
    }

    public static SubLObject rbp_rb_filter_has_exclusions_p(final SubLObject filter) {
        return dictionary.dictionary_p(rbp_rb_filter_exclusions_layer(filter));
    }

    public static final SubLObject rbp_rb_filter_layers_list_alt(SubLObject filter) {
        return set.set_element_list(rbp_rb_filter_layers_set(filter));
    }

    public static SubLObject rbp_rb_filter_layers_list(final SubLObject filter) {
        return set.set_element_list(rbp_rb_filter_layers_set(filter));
    }

    public static final SubLObject rbp_rb_filter_add_layer_alt(SubLObject filter, SubLObject new_layer) {
        return set.set_add(new_layer, rbp_rb_filter_layers_set(filter));
    }

    public static SubLObject rbp_rb_filter_add_layer(final SubLObject filter, final SubLObject new_layer) {
        return set.set_add(new_layer, rbp_rb_filter_layers_set(filter));
    }

    public static final SubLObject rbp_rb_filter_add_excluded_value_alt(SubLObject filter, SubLObject v_term, SubLObject rbp_rule) {
        {
            SubLObject exclusions_layer = rbp_rb_filter_exclusions_layer(filter);
            if (NIL == dictionary.dictionary_p(exclusions_layer)) {
                exclusions_layer = rbp_rb_new_layer();
                set_nth(ONE_INTEGER, filter, exclusions_layer);
            }
            rbp_rb_layer_add_excluded_value(exclusions_layer, v_term, rbp_rule);
        }
        return filter;
    }

    public static SubLObject rbp_rb_filter_add_excluded_value(final SubLObject filter, final SubLObject v_term, final SubLObject rbp_rule) {
        SubLObject exclusions_layer = rbp_rb_filter_exclusions_layer(filter);
        if (NIL == dictionary.dictionary_p(exclusions_layer)) {
            exclusions_layer = rbp_rb_new_layer();
            set_nth(ONE_INTEGER, filter, exclusions_layer);
        }
        rbp_rb_layer_add_excluded_value(exclusions_layer, v_term, rbp_rule);
        return filter;
    }

    public static final SubLObject rbp_rb_find_or_create_filter_for_key_alt(SubLObject filter_key) {
        {
            SubLObject filter = dictionary.dictionary_lookup(rbp_rb_filters(), filter_key, UNPROVIDED);
            if (NIL == filter) {
                filter = rbp_rb_new_filter(filter_key);
                rbp_rb_add_filter(filter, filter_key);
            }
            return filter;
        }
    }

    public static SubLObject rbp_rb_find_or_create_filter_for_key(final SubLObject filter_key) {
        SubLObject filter = dictionary.dictionary_lookup(rbp_rb_filters(), filter_key, UNPROVIDED);
        if (NIL == filter) {
            filter = rbp_rb_new_filter(filter_key);
            rbp_rb_add_filter(filter, filter_key);
        }
        return filter;
    }

    public static final SubLObject rbp_rb_fn_for_filter_key_alt(SubLObject filter_key) {
        {
            SubLObject pcase_var = filter_key.first();
            if (pcase_var.eql($PRED)) {
                return ALL_GENL_PREDS;
            } else {
                if (pcase_var.eql($POS) || pcase_var.eql($GENL)) {
                    return RBP_RB_ALL_GENLS;
                } else {
                    if (pcase_var.eql($TYPE_GENL)) {
                        return RBP_RB_ALL_TYPE_GENLS;
                    } else {
                        if (pcase_var.eql($ISA)) {
                            return RBP_RB_ALL_ISA;
                        } else {
                            return LIST;
                        }
                    }
                }
            }
        }
    }

    public static SubLObject rbp_rb_fn_for_filter_key(final SubLObject filter_key) {
        final SubLObject pcase_var = filter_key.first();
        if (pcase_var.eql($PRED)) {
            return ALL_GENL_PREDS;
        }
        if (pcase_var.eql($POS) || pcase_var.eql($GENL)) {
            return RBP_RB_ALL_GENLS;
        }
        if (pcase_var.eql($TYPE_GENL)) {
            return RBP_RB_ALL_TYPE_GENLS;
        }
        if (pcase_var.eql($ISA)) {
            return RBP_RB_ALL_ISA;
        }
        return LIST;
    }

    public static final SubLObject rbp_rb_new_layer_alt() {
        return dictionary.new_dictionary(symbol_function(EQUALP), $int$256);
    }

    public static SubLObject rbp_rb_new_layer() {
        return dictionary.new_dictionary(symbol_function(EQUALP), $int$256);
    }

    public static final SubLObject rbp_rb_layer_dictionary_alt(SubLObject layer) {
        return layer;
    }

    public static SubLObject rbp_rb_layer_dictionary(final SubLObject layer) {
        return layer;
    }

    public static final SubLObject rbp_rb_layer_note_rule_to_check_alt(SubLObject layer, SubLObject rbp_rule) {
        set.set_add(layer, rbp_rule_filter_layers(rbp_rule));
        return $NOTED;
    }

    public static SubLObject rbp_rb_layer_note_rule_to_check(final SubLObject layer, final SubLObject rbp_rule) {
        set.set_add(layer, rbp_rule_filter_layers(rbp_rule));
        return $NOTED;
    }

    public static final SubLObject rbp_rb_layer_exempt_ruleP_alt(SubLObject layer, SubLObject rule) {
        return makeBoolean(NIL == set.set_memberP(layer, rbp_rule_filter_layers(rule)));
    }

    public static SubLObject rbp_rb_layer_exempt_ruleP(final SubLObject layer, final SubLObject rule) {
        return makeBoolean(NIL == set.set_memberP(layer, rbp_rule_filter_layers(rule)));
    }

    /**
     *
     *
     * @param KEYS-TO-CHECK;
     * 		listp of values that the current block has wrt LAYER.
     * @return LISTP of rules which KEYS-TO-CHECK allow to pass LAYER
     */
    @LispMethod(comment = "@param KEYS-TO-CHECK;\r\n\t\tlistp of values that the current block has wrt LAYER.\r\n@return LISTP of rules which KEYS-TO-CHECK allow to pass LAYER")
    public static final SubLObject rbp_rb_layer_search_alt(SubLObject keys_to_check, SubLObject layer) {
        {
            SubLObject v_dictionary = rbp_rb_layer_dictionary(layer);
            SubLObject hits = NIL;
            SubLObject cdolist_list_var = keys_to_check;
            SubLObject key = NIL;
            for (key = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , key = cdolist_list_var.first()) {
                {
                    SubLObject cdolist_list_var_2 = rbp_rb_layer_search_one(key, v_dictionary);
                    SubLObject hit = NIL;
                    for (hit = cdolist_list_var_2.first(); NIL != cdolist_list_var_2; cdolist_list_var_2 = cdolist_list_var_2.rest() , hit = cdolist_list_var_2.first()) {
                        {
                            SubLObject item_var = hit;
                            if (NIL == member(item_var, hits, symbol_function(EQL), symbol_function(IDENTITY))) {
                                hits = cons(item_var, hits);
                            }
                        }
                    }
                }
            }
            return sort_rbp_rules(hits);
        }
    }

    /**
     *
     *
     * @param KEYS-TO-CHECK;
     * 		listp of values that the current block has wrt LAYER.
     * @return LISTP of rules which KEYS-TO-CHECK allow to pass LAYER
     */
    @LispMethod(comment = "@param KEYS-TO-CHECK;\r\n\t\tlistp of values that the current block has wrt LAYER.\r\n@return LISTP of rules which KEYS-TO-CHECK allow to pass LAYER")
    public static SubLObject rbp_rb_layer_search(final SubLObject keys_to_check, final SubLObject layer) {
        final SubLObject v_dictionary = rbp_rb_layer_dictionary(layer);
        SubLObject hits = NIL;
        SubLObject cdolist_list_var = keys_to_check;
        SubLObject key = NIL;
        key = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject cdolist_list_var_$2 = rbp_rb_layer_search_one(key, v_dictionary);
            SubLObject hit = NIL;
            hit = cdolist_list_var_$2.first();
            while (NIL != cdolist_list_var_$2) {
                final SubLObject item_var = hit;
                if (NIL == member(item_var, hits, symbol_function(EQL), symbol_function(IDENTITY))) {
                    hits = cons(item_var, hits);
                }
                cdolist_list_var_$2 = cdolist_list_var_$2.rest();
                hit = cdolist_list_var_$2.first();
            } 
            cdolist_list_var = cdolist_list_var.rest();
            key = cdolist_list_var.first();
        } 
        return sort_rbp_rules(hits);
    }

    /**
     *
     *
     * @return LISTP of RBP-RULEs.
    For an indeterminate term, instead of ruling *in* rules that we know are okay,
    we can only rule *out* rules that we know are not.
     */
    @LispMethod(comment = "@return LISTP of RBP-RULEs.\r\nFor an indeterminate term, instead of ruling *in* rules that we know are okay,\r\nwe can only rule *out* rules that we know are not.")
    public static final SubLObject rbp_rb_layer_search_indeterminate_alt(SubLObject indeterminate_term, SubLObject c_type, SubLObject layer) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_dictionary = rbp_rb_layer_dictionary(layer);
                SubLObject hits = NIL;
                SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(v_dictionary));
                while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)) {
                    thread.resetMultipleValues();
                    {
                        SubLObject key = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                        SubLObject rules = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        {
                            SubLObject okP = NIL;
                            SubLObject key_defining_mts = rbp_wff.rbp_defining_mts(list(indeterminate_term, key));
                            if (NIL == okP) {
                                {
                                    SubLObject csome_list_var = key_defining_mts;
                                    SubLObject mt = NIL;
                                    for (mt = csome_list_var.first(); !((NIL != okP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , mt = csome_list_var.first()) {
                                        {
                                            SubLObject pcase_var = c_type;
                                            if (pcase_var.eql($ISA)) {
                                                if (NIL == rbp_wff.rbp_wff_test_failsP($sym70$RBP_WFF_ISA_, indeterminate_term, key, mt)) {
                                                    okP = T;
                                                }
                                            } else {
                                                if (pcase_var.eql($GENL)) {
                                                    if (NIL == rbp_wff.rbp_wff_test_failsP($sym71$NPP_GENL_, indeterminate_term, key, UNPROVIDED)) {
                                                        okP = T;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            if (NIL != okP) {
                                {
                                    SubLObject cdolist_list_var = rules;
                                    SubLObject rule = NIL;
                                    for (rule = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , rule = cdolist_list_var.first()) {
                                        {
                                            SubLObject item_var = rule;
                                            if (NIL == member(item_var, hits, symbol_function(EQL), symbol_function(IDENTITY))) {
                                                hits = cons(item_var, hits);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state);
                    }
                } 
                dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                return sort_rbp_rules(hits);
            }
        }
    }

    /**
     *
     *
     * @return LISTP of RBP-RULEs.
    For an indeterminate term, instead of ruling *in* rules that we know are okay,
    we can only rule *out* rules that we know are not.
     */
    @LispMethod(comment = "@return LISTP of RBP-RULEs.\r\nFor an indeterminate term, instead of ruling *in* rules that we know are okay,\r\nwe can only rule *out* rules that we know are not.")
    public static SubLObject rbp_rb_layer_search_indeterminate(final SubLObject indeterminate_term, final SubLObject c_type, final SubLObject layer) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_dictionary = rbp_rb_layer_dictionary(layer);
        SubLObject hits = NIL;
        SubLObject iteration_state;
        for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(v_dictionary)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
            thread.resetMultipleValues();
            final SubLObject key = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
            final SubLObject rules = thread.secondMultipleValue();
            thread.resetMultipleValues();
            SubLObject okP = NIL;
            final SubLObject key_defining_mts = rbp_wff.rbp_defining_mts(list(indeterminate_term, key));
            if (NIL == okP) {
                SubLObject csome_list_var = key_defining_mts;
                SubLObject mt = NIL;
                mt = csome_list_var.first();
                while ((NIL == okP) && (NIL != csome_list_var)) {
                    if (c_type.eql($ISA)) {
                        if (NIL == rbp_wff.rbp_wff_test_failsP($sym75$RBP_WFF_ISA_, indeterminate_term, key, mt)) {
                            okP = T;
                        }
                    } else
                        if (c_type.eql($GENL) && (NIL == rbp_wff.rbp_wff_test_failsP($sym76$NPP_GENL_, indeterminate_term, key, UNPROVIDED))) {
                            okP = T;
                        }

                    csome_list_var = csome_list_var.rest();
                    mt = csome_list_var.first();
                } 
            }
            if (NIL != okP) {
                SubLObject cdolist_list_var = rules;
                SubLObject rule = NIL;
                rule = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    final SubLObject item_var = rule;
                    if (NIL == member(item_var, hits, symbol_function(EQL), symbol_function(IDENTITY))) {
                        hits = cons(item_var, hits);
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    rule = cdolist_list_var.first();
                } 
            }
        }
        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
        return sort_rbp_rules(hits);
    }

    /**
     *
     *
     * @return LISTP of RPB rules licensed by KEY,
    or LISTP of 2 LISTP: licensed rules and excluded rules.
     */
    @LispMethod(comment = "@return LISTP of RPB rules licensed by KEY,\r\nor LISTP of 2 LISTP: licensed rules and excluded rules.")
    public static final SubLObject rbp_rb_layer_search_one_alt(SubLObject key, SubLObject v_dictionary) {
        return dictionary.dictionary_lookup(v_dictionary, key, UNPROVIDED);
    }

    /**
     *
     *
     * @return LISTP of RPB rules licensed by KEY,
    or LISTP of 2 LISTP: licensed rules and excluded rules.
     */
    @LispMethod(comment = "@return LISTP of RPB rules licensed by KEY,\r\nor LISTP of 2 LISTP: licensed rules and excluded rules.")
    public static SubLObject rbp_rb_layer_search_one(final SubLObject key, final SubLObject v_dictionary) {
        return dictionary.dictionary_lookup(v_dictionary, key, UNPROVIDED);
    }

    public static final SubLObject rbp_rb_layer_note_value_alt(SubLObject layer, SubLObject v_term, SubLObject rbp_rule) {
        {
            SubLObject fort = function_terms.naut_to_nart(v_term);
            SubLObject v_dictionary = rbp_rb_layer_dictionary(layer);
            dictionary_utilities.dictionary_push(v_dictionary, fort, rbp_rule);
        }
        rbp_rb_layer_note_rule_to_check(layer, rbp_rule);
        return layer;
    }

    public static SubLObject rbp_rb_layer_note_value(final SubLObject layer, final SubLObject v_term, final SubLObject rbp_rule) {
        final SubLObject fort = function_terms.naut_to_nart(v_term);
        final SubLObject v_dictionary = rbp_rb_layer_dictionary(layer);
        dictionary_utilities.dictionary_push(v_dictionary, fort, rbp_rule);
        rbp_rb_layer_note_rule_to_check(layer, rbp_rule);
        return layer;
    }

    /**
     * Encode in LAYER the information that TERM is a valid value for RBP-RULE in LAYER.
     */
    @LispMethod(comment = "Encode in LAYER the information that TERM is a valid value for RBP-RULE in LAYER.")
    public static final SubLObject rbp_rb_layer_add_ok_value_alt(SubLObject layer, SubLObject v_term, SubLObject rbp_rule) {
        return rbp_rb_layer_note_value(layer, v_term, rbp_rule);
    }

    /**
     * Encode in LAYER the information that TERM is a valid value for RBP-RULE in LAYER.
     */
    @LispMethod(comment = "Encode in LAYER the information that TERM is a valid value for RBP-RULE in LAYER.")
    public static SubLObject rbp_rb_layer_add_ok_value(final SubLObject layer, final SubLObject v_term, final SubLObject rbp_rule) {
        return rbp_rb_layer_note_value(layer, v_term, rbp_rule);
    }

    /**
     * Encode in LAYER the information that TERM is an excluded value for RBP-RULE in LAYER.
     */
    @LispMethod(comment = "Encode in LAYER the information that TERM is an excluded value for RBP-RULE in LAYER.")
    public static final SubLObject rbp_rb_layer_add_excluded_value_alt(SubLObject layer, SubLObject v_term, SubLObject rbp_rule) {
        return rbp_rb_layer_note_value(layer, v_term, rbp_rule);
    }

    /**
     * Encode in LAYER the information that TERM is an excluded value for RBP-RULE in LAYER.
     */
    @LispMethod(comment = "Encode in LAYER the information that TERM is an excluded value for RBP-RULE in LAYER.")
    public static SubLObject rbp_rb_layer_add_excluded_value(final SubLObject layer, final SubLObject v_term, final SubLObject rbp_rule) {
        return rbp_rb_layer_note_value(layer, v_term, rbp_rule);
    }

    /**
     * Make sure that *RBP-RULE-BANK* is initialized, initializing it if necessary.
     */
    @LispMethod(comment = "Make sure that *RBP-RULE-BANK* is initialized, initializing it if necessary.")
    public static final SubLObject rbp_rb_check_initialization_alt() {
        {
            SubLObject initializedP = NIL;
            SubLObject lock = $rbp_rule_bank_lock$.getGlobalValue();
            SubLObject release = NIL;
            try {
                release = seize_lock(lock);
                initializedP = $rbp_rb_initializedP$.getGlobalValue();
            } finally {
                if (NIL != release) {
                    release_lock(lock);
                }
            }
            if (NIL == initializedP) {
                rbp_rb_initialize();
            }
        }
        return rbp_rb_rule_count();
    }

    /**
     * Make sure that *RBP-RULE-BANK* is initialized, initializing it if necessary.
     */
    @LispMethod(comment = "Make sure that *RBP-RULE-BANK* is initialized, initializing it if necessary.")
    public static SubLObject rbp_rb_check_initialization() {
        SubLObject initializedP = NIL;
        SubLObject release = NIL;
        try {
            release = seize_lock($rbp_rule_bank_lock$.getGlobalValue());
            initializedP = $rbp_rb_initializedP$.getGlobalValue();
        } finally {
            if (NIL != release) {
                release_lock($rbp_rule_bank_lock$.getGlobalValue());
            }
        }
        if (NIL == initializedP) {
            rbp_rb_initialize();
        }
        return rbp_rb_rule_count();
    }

    /**
     * Wipe the rule bank slate clean. To be performed whenever it becomes stale,
     * e.g. when the rules in the KB have changed.
     */
    @LispMethod(comment = "Wipe the rule bank slate clean. To be performed whenever it becomes stale,\r\ne.g. when the rules in the KB have changed.\nWipe the rule bank slate clean. To be performed whenever it becomes stale,\ne.g. when the rules in the KB have changed.")
    public static final SubLObject rbp_clear_rule_bank_alt() {
        {
            SubLObject lock = $rbp_rule_bank_lock$.getGlobalValue();
            SubLObject release = NIL;
            try {
                release = seize_lock(lock);
                rbp_clear_rule_bank_internal();
            } finally {
                if (NIL != release) {
                    release_lock(lock);
                }
            }
        }
        return rbp_rb_rule_count();
    }

    /**
     * Wipe the rule bank slate clean. To be performed whenever it becomes stale,
     * e.g. when the rules in the KB have changed.
     */
    @LispMethod(comment = "Wipe the rule bank slate clean. To be performed whenever it becomes stale,\r\ne.g. when the rules in the KB have changed.\nWipe the rule bank slate clean. To be performed whenever it becomes stale,\ne.g. when the rules in the KB have changed.")
    public static SubLObject rbp_clear_rule_bank() {
        SubLObject release = NIL;
        try {
            release = seize_lock($rbp_rule_bank_lock$.getGlobalValue());
            rbp_clear_rule_bank_internal();
        } finally {
            if (NIL != release) {
                release_lock($rbp_rule_bank_lock$.getGlobalValue());
            }
        }
        return rbp_rb_rule_count();
    }

    public static final SubLObject rbp_clear_rule_bank_internal_alt() {
        $rbp_rb_initializedP$.setGlobalValue(NIL);
        $rbp_rule_bank$.setGlobalValue(rbp_new_rule_bank());
        dictionary.clear_dictionary($rbp_rule_index$.getGlobalValue());
        clear_rbp_rb_all_rules_sorted();
        noun_compound_parser.clear_rbp_rb_rules_matching_closed_specs();
        noun_compound_parser.rbp_untrace_all_rules();
        psp_main.clear_psp_caches();
        return rbp_rb_rule_count();
    }

    public static SubLObject rbp_clear_rule_bank_internal() {
        $rbp_rb_initializedP$.setGlobalValue(NIL);
        $rbp_rule_bank$.setGlobalValue(rbp_new_rule_bank());
        dictionary.clear_dictionary($rbp_rule_index$.getGlobalValue());
        clear_rbp_rb_all_rules_sorted();
        noun_compound_parser.clear_rbp_rb_rules_matching_closed_specs();
        noun_compound_parser.rbp_untrace_all_rules();
        psp_main.clear_psp_caches();
        return rbp_rb_rule_count();
    }

    /**
     * Initialize and populate *RBP-RULE-BANK* from *RBP-RULE-LOOKUP-MT*
     */
    @LispMethod(comment = "Initialize and populate *RBP-RULE-BANK* from *RBP-RULE-LOOKUP-MT*")
    public static final SubLObject rbp_rb_initialize_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject lock = $rbp_rule_bank_lock$.getGlobalValue();
                SubLObject release = NIL;
                try {
                    release = seize_lock(lock);
                    rbp_clear_rule_bank_internal();
                    {
                        SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(parsing_vars.$rbp_rule_lookup_mt$.getGlobalValue());
                        {
                            SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
                            SubLObject _prev_bind_1 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                            SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                            try {
                                mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                                mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                                {
                                    SubLObject rules = isa.all_fort_instances($$NounCompoundRule, UNPROVIDED, UNPROVIDED);
                                    SubLObject cdolist_list_var = rules;
                                    SubLObject rule = NIL;
                                    for (rule = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , rule = cdolist_list_var.first()) {
                                        rbp_rb_update(rule);
                                    }
                                }
                            } finally {
                                mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2, thread);
                                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1, thread);
                                mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                    note_rbp_rb_initialized();
                } finally {
                    if (NIL != release) {
                        release_lock(lock);
                    }
                }
            }
            return rbp_rb_rule_count();
        }
    }

    /**
     * Initialize and populate *RBP-RULE-BANK* from *RBP-RULE-LOOKUP-MT*
     */
    @LispMethod(comment = "Initialize and populate *RBP-RULE-BANK* from *RBP-RULE-LOOKUP-MT*")
    public static SubLObject rbp_rb_initialize() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject release = NIL;
        try {
            release = seize_lock($rbp_rule_bank_lock$.getGlobalValue());
            rbp_clear_rule_bank_internal();
            final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(parsing_vars.$rbp_rule_lookup_mt$.getGlobalValue());
            final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
            try {
                mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                SubLObject cdolist_list_var;
                final SubLObject rules = cdolist_list_var = isa.all_fort_instances($$NounCompoundRule, UNPROVIDED, UNPROVIDED);
                SubLObject rule = NIL;
                rule = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    rbp_rb_update(rule);
                    cdolist_list_var = cdolist_list_var.rest();
                    rule = cdolist_list_var.first();
                } 
            } finally {
                mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
            }
            note_rbp_rb_initialized();
        } finally {
            if (NIL != release) {
                release_lock($rbp_rule_bank_lock$.getGlobalValue());
            }
        }
        return rbp_rb_rule_count();
    }

    /**
     *
     *
     * @param RULE-CYCL;
     * 		a noun compound rule from the KB.
     * 		Update *RBP-RULE-BANK* for a single RULE-CYCL.
     */
    @LispMethod(comment = "@param RULE-CYCL;\r\n\t\ta noun compound rule from the KB.\r\n\t\tUpdate *RBP-RULE-BANK* for a single RULE-CYCL.")
    public static final SubLObject rbp_rb_update_alt(SubLObject rule_cycl) {
        if (NIL == noun_compound_parser.rbp_rule_okP(rule_cycl)) {
            return NIL;
        }
        rbp_rb_update_all_filters(rule_cycl);
        return $rbp_rule_bank$.getGlobalValue();
    }

    /**
     *
     *
     * @param RULE-CYCL;
     * 		a noun compound rule from the KB.
     * 		Update *RBP-RULE-BANK* for a single RULE-CYCL.
     */
    @LispMethod(comment = "@param RULE-CYCL;\r\n\t\ta noun compound rule from the KB.\r\n\t\tUpdate *RBP-RULE-BANK* for a single RULE-CYCL.")
    public static SubLObject rbp_rb_update(final SubLObject rule_cycl) {
        if (NIL == noun_compound_parser.rbp_rule_okP(rule_cycl)) {
            return NIL;
        }
        rbp_rb_update_all_filters(rule_cycl);
        return $rbp_rule_bank$.getGlobalValue();
    }

    public static final SubLObject rbp_rb_update_all_filters_alt(SubLObject rule_cycl) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject rule_term_table = rbp_rb_rule_term_table(rule_cycl);
                SubLObject syntactic_types = $rbp_syntactic_constraint_types$.getGlobalValue();
                SubLObject semantic_types = $rbp_semantic_constraint_types$.getGlobalValue();
                SubLObject open_types = $rbp_open_class_constraint_types$.getGlobalValue();
                SubLObject closed_types = $rbp_closed_class_constraint_types$.getGlobalValue();
                if ($ALL.eql($ALL) || $ALL.eql($SYNTACTIC)) {
                    {
                        SubLObject csome_list_var = syntactic_types;
                        SubLObject c_type = NIL;
                        for (c_type = csome_list_var.first(); NIL != csome_list_var; csome_list_var = csome_list_var.rest() , c_type = csome_list_var.first()) {
                            {
                                SubLObject cdolist_list_var = $rbp_constrained_types$.getDynamicValue(thread);
                                SubLObject o_type = NIL;
                                for (o_type = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , o_type = cdolist_list_var.first()) {
                                    {
                                        SubLObject filter_key = list(c_type, o_type);
                                        rbp_rb_update_filter(filter_key, rule_cycl, rule_term_table);
                                    }
                                }
                            }
                        }
                    }
                }
                if ($ALL.eql($ALL) || $ALL.eql($SEMANTIC)) {
                    {
                        SubLObject csome_list_var = semantic_types;
                        SubLObject c_type = NIL;
                        for (c_type = csome_list_var.first(); NIL != csome_list_var; csome_list_var = csome_list_var.rest() , c_type = csome_list_var.first()) {
                            {
                                SubLObject cdolist_list_var = $rbp_constrained_types$.getDynamicValue(thread);
                                SubLObject o_type = NIL;
                                for (o_type = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , o_type = cdolist_list_var.first()) {
                                    {
                                        SubLObject filter_key = list(c_type, o_type);
                                        rbp_rb_update_filter(filter_key, rule_cycl, rule_term_table);
                                    }
                                }
                            }
                        }
                    }
                }
                if ($ALL.eql($OPEN_CLASS)) {
                    {
                        SubLObject csome_list_var = open_types;
                        SubLObject c_type = NIL;
                        for (c_type = csome_list_var.first(); NIL != csome_list_var; csome_list_var = csome_list_var.rest() , c_type = csome_list_var.first()) {
                            {
                                SubLObject cdolist_list_var = $rbp_constrained_types$.getDynamicValue(thread);
                                SubLObject o_type = NIL;
                                for (o_type = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , o_type = cdolist_list_var.first()) {
                                    {
                                        SubLObject filter_key = list(c_type, o_type);
                                        rbp_rb_update_filter(filter_key, rule_cycl, rule_term_table);
                                    }
                                }
                            }
                        }
                    }
                }
                if ($ALL.eql($CLOSED_CLASS)) {
                    {
                        SubLObject csome_list_var = closed_types;
                        SubLObject c_type = NIL;
                        for (c_type = csome_list_var.first(); NIL != csome_list_var; csome_list_var = csome_list_var.rest() , c_type = csome_list_var.first()) {
                            {
                                SubLObject cdolist_list_var = $rbp_constrained_types$.getDynamicValue(thread);
                                SubLObject o_type = NIL;
                                for (o_type = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , o_type = cdolist_list_var.first()) {
                                    {
                                        SubLObject filter_key = list(c_type, o_type);
                                        rbp_rb_update_filter(filter_key, rule_cycl, rule_term_table);
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return rbp_rb_filters();
        }
    }

    public static SubLObject rbp_rb_update_all_filters(final SubLObject rule_cycl) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject rule_term_table = rbp_rb_rule_term_table(rule_cycl);
        final SubLObject syntactic_types = $rbp_syntactic_constraint_types$.getGlobalValue();
        final SubLObject semantic_types = $rbp_semantic_constraint_types$.getGlobalValue();
        final SubLObject open_types = $rbp_open_class_constraint_types$.getGlobalValue();
        final SubLObject closed_types = $rbp_closed_class_constraint_types$.getGlobalValue();
        if ($ALL.eql($ALL) || $ALL.eql($SYNTACTIC)) {
            SubLObject csome_list_var = syntactic_types;
            SubLObject c_type = NIL;
            c_type = csome_list_var.first();
            while (NIL != csome_list_var) {
                SubLObject cdolist_list_var = $rbp_constrained_types$.getDynamicValue(thread);
                SubLObject o_type = NIL;
                o_type = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    final SubLObject filter_key = list(c_type, o_type);
                    rbp_rb_update_filter(filter_key, rule_cycl, rule_term_table);
                    cdolist_list_var = cdolist_list_var.rest();
                    o_type = cdolist_list_var.first();
                } 
                csome_list_var = csome_list_var.rest();
                c_type = csome_list_var.first();
            } 
        }
        if ($ALL.eql($ALL) || $ALL.eql($SEMANTIC)) {
            SubLObject csome_list_var = semantic_types;
            SubLObject c_type = NIL;
            c_type = csome_list_var.first();
            while (NIL != csome_list_var) {
                SubLObject cdolist_list_var = $rbp_constrained_types$.getDynamicValue(thread);
                SubLObject o_type = NIL;
                o_type = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    final SubLObject filter_key = list(c_type, o_type);
                    rbp_rb_update_filter(filter_key, rule_cycl, rule_term_table);
                    cdolist_list_var = cdolist_list_var.rest();
                    o_type = cdolist_list_var.first();
                } 
                csome_list_var = csome_list_var.rest();
                c_type = csome_list_var.first();
            } 
        }
        if ($ALL.eql($OPEN_CLASS)) {
            SubLObject csome_list_var = open_types;
            SubLObject c_type = NIL;
            c_type = csome_list_var.first();
            while (NIL != csome_list_var) {
                SubLObject cdolist_list_var = $rbp_constrained_types$.getDynamicValue(thread);
                SubLObject o_type = NIL;
                o_type = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    final SubLObject filter_key = list(c_type, o_type);
                    rbp_rb_update_filter(filter_key, rule_cycl, rule_term_table);
                    cdolist_list_var = cdolist_list_var.rest();
                    o_type = cdolist_list_var.first();
                } 
                csome_list_var = csome_list_var.rest();
                c_type = csome_list_var.first();
            } 
        }
        if ($ALL.eql($CLOSED_CLASS)) {
            SubLObject csome_list_var = closed_types;
            SubLObject c_type = NIL;
            c_type = csome_list_var.first();
            while (NIL != csome_list_var) {
                SubLObject cdolist_list_var = $rbp_constrained_types$.getDynamicValue(thread);
                SubLObject o_type = NIL;
                o_type = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    final SubLObject filter_key = list(c_type, o_type);
                    rbp_rb_update_filter(filter_key, rule_cycl, rule_term_table);
                    cdolist_list_var = cdolist_list_var.rest();
                    o_type = cdolist_list_var.first();
                } 
                csome_list_var = csome_list_var.rest();
                c_type = csome_list_var.first();
            } 
        }
        return rbp_rb_filters();
    }

    /**
     * Update filter specified by FILTER-KEY for RULE-CYCL
     */
    @LispMethod(comment = "Update filter specified by FILTER-KEY for RULE-CYCL")
    public static final SubLObject rbp_rb_update_filter_alt(SubLObject filter_key, SubLObject rule_cycl, SubLObject table) {
        if (table == UNPROVIDED) {
            table = NIL;
        }
        {
            SubLObject filter = rbp_rb_find_or_create_filter_for_key(filter_key);
            SubLObject filter_layers = rbp_rb_filter_layers_list(filter);
            SubLObject rule_term_table = (NIL != table) ? ((SubLObject) (table)) : rbp_rb_rule_term_table(rule_cycl);
            SubLObject values = rbp_rb_rule_term_table_lookup(rule_term_table, filter_key);
            SubLObject rbp_rule = rbp_find_or_create_rule_from_cycl(rule_cycl);
            SubLObject new_layers = NIL;
            SubLObject value = NIL;
            SubLObject value_3 = NIL;
            SubLObject this_layer = NIL;
            SubLObject this_layer_4 = NIL;
            for (value = values, value_3 = value.first(), this_layer = filter_layers, this_layer_4 = this_layer.first(); !((NIL == this_layer) && (NIL == value)); value = value.rest() , value_3 = value.first() , this_layer = this_layer.rest() , this_layer_4 = this_layer.first()) {
                if (NIL == value_3) {
                    new_layers = cons(this_layer_4, new_layers);
                } else {
                    if (NIL != rbp_rb_excluded_value_p(value_3)) {
                        {
                            SubLObject excluded = rbp_rb_excluded_value_term(value_3);
                            rbp_rb_filter_add_excluded_value(filter, excluded, rbp_rule);
                        }
                    } else {
                        if (NIL == this_layer_4) {
                            this_layer_4 = rbp_rb_new_layer();
                            rbp_rb_filter_add_layer(filter, this_layer_4);
                        }
                        new_layers = cons(rbp_rb_layer_add_ok_value(this_layer_4, value_3, rbp_rule), new_layers);
                    }
                }
            }
            return filter;
        }
    }

    /**
     * Update filter specified by FILTER-KEY for RULE-CYCL
     */
    @LispMethod(comment = "Update filter specified by FILTER-KEY for RULE-CYCL")
    public static SubLObject rbp_rb_update_filter(final SubLObject filter_key, final SubLObject rule_cycl, SubLObject table) {
        if (table == UNPROVIDED) {
            table = NIL;
        }
        final SubLObject filter = rbp_rb_find_or_create_filter_for_key(filter_key);
        final SubLObject filter_layers = rbp_rb_filter_layers_list(filter);
        final SubLObject rule_term_table = (NIL != table) ? table : rbp_rb_rule_term_table(rule_cycl);
        final SubLObject values = rbp_rb_rule_term_table_lookup(rule_term_table, filter_key);
        final SubLObject rbp_rule = rbp_find_or_create_rule_from_cycl(rule_cycl);
        SubLObject new_layers = NIL;
        SubLObject value = NIL;
        SubLObject value_$3 = NIL;
        SubLObject this_layer = NIL;
        SubLObject this_layer_$4 = NIL;
        value = values;
        value_$3 = value.first();
        this_layer = filter_layers;
        this_layer_$4 = this_layer.first();
        while ((NIL != this_layer) || (NIL != value)) {
            if (NIL == value_$3) {
                new_layers = cons(this_layer_$4, new_layers);
            } else
                if (NIL != rbp_rb_excluded_value_p(value_$3)) {
                    final SubLObject excluded = rbp_rb_excluded_value_term(value_$3);
                    rbp_rb_filter_add_excluded_value(filter, excluded, rbp_rule);
                } else {
                    if (NIL == this_layer_$4) {
                        this_layer_$4 = rbp_rb_new_layer();
                        rbp_rb_filter_add_layer(filter, this_layer_$4);
                    }
                    new_layers = cons(rbp_rb_layer_add_ok_value(this_layer_$4, value_$3, rbp_rule), new_layers);
                }

            value = value.rest();
            value_$3 = value.first();
            this_layer = this_layer.rest();
            this_layer_$4 = this_layer.first();
        } 
        return filter;
    }

    public static final SubLObject rbp_rb_excluded_value_p_alt(SubLObject v_object) {
        return pattern_match.tree_matches_pattern(v_object, $list_alt77);
    }

    public static SubLObject rbp_rb_excluded_value_p(final SubLObject v_object) {
        return pattern_match.tree_matches_pattern(v_object, $list82);
    }

    public static final SubLObject rbp_rb_make_excluded_value_alt(SubLObject v_term) {
        return list($EXCLUDE, v_term);
    }

    public static SubLObject rbp_rb_make_excluded_value(final SubLObject v_term) {
        return list($EXCLUDE, v_term);
    }

    public static final SubLObject rbp_rb_excluded_value_term_alt(SubLObject value) {
        return second(value);
    }

    public static SubLObject rbp_rb_excluded_value_term(final SubLObject value) {
        return second(value);
    }

    /**
     *
     *
     * @param RULE-CYCL
     * 		INDEXED-TERM-P; a #$NounCompoundRule
     * @return LISTP of (<c-type> <o-type> target) constraints
     */
    @LispMethod(comment = "@param RULE-CYCL\r\n\t\tINDEXED-TERM-P; a #$NounCompoundRule\r\n@return LISTP of (<c-type> <o-type> target) constraints")
    public static final SubLObject rbp_rule_constraints_alt(SubLObject rule_cycl) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(rule_cycl, INDEXED_TERM_P);
            if (NIL == rule_cycl) {
                return NIL;
            }
            {
                SubLObject ans = NIL;
                SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(parsing_vars.$rbp_rule_lookup_mt$.getGlobalValue());
                {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
                    SubLObject _prev_bind_1 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                        mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                        mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                        {
                            SubLObject cdolist_list_var = kb_mapping_utilities.pred_values(rule_cycl, $$ncRuleConstraint, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            SubLObject raw_constraint = NIL;
                            for (raw_constraint = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , raw_constraint = cdolist_list_var.first()) {
                                ans = cons(rbp_forts_to_keywords(rbp_canonicalize_constraint(raw_constraint)), ans);
                            }
                        }
                    } finally {
                        mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1, thread);
                        mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
                    }
                }
                return ans;
            }
        }
    }

    /**
     *
     *
     * @param RULE-CYCL
     * 		INDEXED-TERM-P; a #$NounCompoundRule
     * @return LISTP of (<c-type> <o-type> target) constraints
     */
    @LispMethod(comment = "@param RULE-CYCL\r\n\t\tINDEXED-TERM-P; a #$NounCompoundRule\r\n@return LISTP of (<c-type> <o-type> target) constraints")
    public static SubLObject rbp_rule_constraints(final SubLObject rule_cycl) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != indexed_term_p(rule_cycl) : "! kb_indexing_datastructures.indexed_term_p(rule_cycl) " + ("kb_indexing_datastructures.indexed_term_p(rule_cycl) " + "CommonSymbols.NIL != kb_indexing_datastructures.indexed_term_p(rule_cycl) ") + rule_cycl;
        if (NIL == rule_cycl) {
            return NIL;
        }
        SubLObject ans = NIL;
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(parsing_vars.$rbp_rule_lookup_mt$.getGlobalValue());
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            SubLObject cdolist_list_var = kb_mapping_utilities.pred_values(rule_cycl, $$ncRuleConstraint, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            SubLObject raw_constraint = NIL;
            raw_constraint = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                ans = cons(rbp_forts_to_keywords(rbp_canonicalize_constraint(raw_constraint)), ans);
                cdolist_list_var = cdolist_list_var.rest();
                raw_constraint = cdolist_list_var.first();
            } 
        } finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return ans;
    }

    public static final SubLObject rbp_canonicalize_constraint_alt(SubLObject raw_constraint) {
        {
            SubLObject naut = function_terms.nart_to_naut(raw_constraint);
            SubLObject fn = cycl_utilities.nat_functor(naut);
            if (NIL != rbp_negative_constraint_fn_p(fn)) {
                naut = rbp_canonicalize_negative_constraint(naut);
            }
            return naut;
        }
    }

    public static SubLObject rbp_canonicalize_constraint(final SubLObject raw_constraint) {
        SubLObject naut = function_terms.nart_to_naut(raw_constraint);
        final SubLObject fn = cycl_utilities.nat_functor(naut);
        if (NIL != rbp_negative_constraint_fn_p(fn)) {
            naut = rbp_canonicalize_negative_constraint(naut);
        }
        return naut;
    }

    public static final SubLObject rbp_negative_constraint_fn_p_alt(SubLObject v_object) {
        return makeBoolean((NIL != constant_p(v_object)) && (NIL != member(constants_high.constant_name(v_object), $list_alt81, symbol_function(EQUAL), UNPROVIDED)));
    }

    public static SubLObject rbp_negative_constraint_fn_p(final SubLObject v_object) {
        return makeBoolean((NIL != constant_p(v_object)) && (NIL != member(constants_high.constant_name(v_object), $list86, symbol_function(EQUAL), UNPROVIDED)));
    }

    public static final SubLObject rbp_positive_correlate_of_negative_constraint_fn_alt(SubLObject negative_fn) {
        return list_utilities.alist_lookup($list_alt82, constants_high.constant_name(negative_fn), symbol_function(EQUAL), UNPROVIDED);
    }

    public static SubLObject rbp_positive_correlate_of_negative_constraint_fn(final SubLObject negative_fn) {
        return list_utilities.alist_lookup($list87, constants_high.constant_name(negative_fn), symbol_function(EQUAL), UNPROVIDED);
    }

    public static final SubLObject rbp_canonicalize_negative_constraint_alt(SubLObject naut) {
        {
            SubLObject negative_fn = cycl_utilities.nat_functor(naut);
            SubLObject positive_fn = rbp_positive_correlate_of_negative_constraint_fn(negative_fn);
            SubLObject value = cycl_utilities.nat_arg2(naut, UNPROVIDED);
            SubLObject excluded_value = rbp_rb_make_excluded_value(value);
            return replace_formula_arg(ZERO_INTEGER, positive_fn, replace_formula_arg(TWO_INTEGER, excluded_value, naut));
        }
    }

    public static SubLObject rbp_canonicalize_negative_constraint(final SubLObject naut) {
        final SubLObject negative_fn = cycl_utilities.nat_functor(naut);
        final SubLObject positive_fn = rbp_positive_correlate_of_negative_constraint_fn(negative_fn);
        final SubLObject value = cycl_utilities.nat_arg2(naut, UNPROVIDED);
        final SubLObject excluded_value = rbp_rb_make_excluded_value(value);
        return replace_formula_arg(ZERO_INTEGER, positive_fn, replace_formula_arg(TWO_INTEGER, excluded_value, naut));
    }

    /**
     * Convert all special RBP terms in FORMULA into keywords for internal use.
     */
    @LispMethod(comment = "Convert all special RBP terms in FORMULA into keywords for internal use.")
    public static final SubLObject rbp_forts_to_keywords_alt(SubLObject formula) {
        return formula.isAtom() ? ((SubLObject) (rbp_fort_to_keyword(formula))) : Mapping.mapcar(RBP_FORTS_TO_KEYWORDS, formula);
    }

    /**
     * Convert all special RBP terms in FORMULA into keywords for internal use.
     */
    @LispMethod(comment = "Convert all special RBP terms in FORMULA into keywords for internal use.")
    public static SubLObject rbp_forts_to_keywords(final SubLObject formula) {
        return formula.isAtom() ? rbp_fort_to_keyword(formula) : Mapping.mapcar(RBP_FORTS_TO_KEYWORDS, formula);
    }

    /**
     *
     *
     * @return keyword (if there is a corresponding keyword for TERM, else TERM itself.
     */
    @LispMethod(comment = "@return keyword (if there is a corresponding keyword for TERM, else TERM itself.")
    public static final SubLObject rbp_fort_to_keyword_alt(SubLObject v_term) {
        {
            SubLObject associated_keyword = rbp_keyword_for_term(v_term);
            return NIL != associated_keyword ? ((SubLObject) (associated_keyword)) : v_term;
        }
    }

    /**
     *
     *
     * @return keyword (if there is a corresponding keyword for TERM, else TERM itself.
     */
    @LispMethod(comment = "@return keyword (if there is a corresponding keyword for TERM, else TERM itself.")
    public static SubLObject rbp_fort_to_keyword(final SubLObject v_term) {
        final SubLObject associated_keyword = rbp_keyword_for_term(v_term);
        return NIL != associated_keyword ? associated_keyword : v_term;
    }

    public static final SubLObject rbp_term_keyword_map_alt() {
        if (!$rbp_term_keyword_map$.getGlobalValue().isList()) {
            initialize_rbp_term_keyword_map();
        }
        return $rbp_term_keyword_map$.getGlobalValue();
    }

    public static SubLObject rbp_term_keyword_map() {
        if (!$rbp_term_keyword_map$.getGlobalValue().isList()) {
            initialize_rbp_term_keyword_map();
        }
        return $rbp_term_keyword_map$.getGlobalValue();
    }

    public static final SubLObject initialize_rbp_term_keyword_map_alt() {
        {
            SubLObject map = $list_alt85;
            SubLObject cdolist_list_var = list(list(constants_high.find_constant($$$NCWordUnitConstraintFn), $WU), list(constants_high.find_constant($$$NCTypeGenlsConstraintFn), $TYPE_GENL));
            SubLObject pair = NIL;
            for (pair = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , pair = cdolist_list_var.first()) {
                {
                    SubLObject datum = pair;
                    SubLObject current = datum;
                    SubLObject new_constraint_type = NIL;
                    SubLObject keyword = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt86);
                    new_constraint_type = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt86);
                    keyword = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        if (NIL != valid_constantP(new_constraint_type, UNPROVIDED)) {
                            map = list_utilities.alist_enter(map, new_constraint_type, keyword, UNPROVIDED);
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list_alt86);
                    }
                }
            }
            $rbp_term_keyword_map$.setGlobalValue(map);
        }
        return $rbp_term_keyword_map$.getGlobalValue();
    }

    public static SubLObject initialize_rbp_term_keyword_map() {
        SubLObject map = $list90;
        SubLObject cdolist_list_var = list(list(constants_high.find_constant($$$NCWordUnitConstraintFn), $WU), list(constants_high.find_constant($$$NCTypeGenlsConstraintFn), $TYPE_GENL));
        SubLObject pair = NIL;
        pair = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = pair;
            SubLObject new_constraint_type = NIL;
            SubLObject keyword = NIL;
            destructuring_bind_must_consp(current, datum, $list91);
            new_constraint_type = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list91);
            keyword = current.first();
            current = current.rest();
            if (NIL == current) {
                if (NIL != valid_constantP(new_constraint_type, UNPROVIDED)) {
                    map = list_utilities.alist_enter(map, new_constraint_type, keyword, UNPROVIDED);
                }
            } else {
                cdestructuring_bind_error(datum, $list91);
            }
            cdolist_list_var = cdolist_list_var.rest();
            pair = cdolist_list_var.first();
        } 
        $rbp_term_keyword_map$.setGlobalValue(map);
        return $rbp_term_keyword_map$.getGlobalValue();
    }

    public static final SubLObject rbp_keyword_for_term_alt(SubLObject v_term) {
        return list_utilities.alist_lookup(rbp_term_keyword_map(), v_term, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject rbp_keyword_for_term(final SubLObject v_term) {
        return list_utilities.alist_lookup(rbp_term_keyword_map(), v_term, UNPROVIDED, UNPROVIDED);
    }

    /**
     * Filter CANDIDATE-MATCHES and SURVIVING-TRACED-RULES based on FILTER-KEY and BASE.
     *
     * @param CANDIDATE-MATCHES
     * 		will be destructively modified.
     * @return 0 LISTP; new candidate matches
     * @return 1 LISTP; new surviving traced rules
     */
    @LispMethod(comment = "Filter CANDIDATE-MATCHES and SURVIVING-TRACED-RULES based on FILTER-KEY and BASE.\r\n\r\n@param CANDIDATE-MATCHES\r\n\t\twill be destructively modified.\r\n@return 0 LISTP; new candidate matches\r\n@return 1 LISTP; new surviving traced rules")
    public static final SubLObject rbp_rb_filter_rules_alt(SubLObject candidate_matches, SubLObject surviving_traced_rules, SubLObject filter_key, SubLObject base) {
        rbp_rb_check_initialization();
        if (!candidate_matches.isList()) {
            candidate_matches = copy_list(rbp_rb_all_rules_sorted());
        }
        {
            SubLObject filter = rbp_rb_find_or_create_filter_for_key(filter_key);
            SubLObject c_type = filter_key.first();
            SubLObject keys_to_check = rbp_rb_keys_from_base(base, filter);
            SubLObject indeterminateP = makeBoolean((NIL != subl_promotions.memberP(c_type, $list_alt90, UNPROVIDED, UNPROVIDED)) && (NIL != member($$IndeterminateTerm, keys_to_check, UNPROVIDED, UNPROVIDED)));
            SubLObject report_failuresP = NIL;
            SubLObject no_matchP = NIL;
            SubLObject set_contents_var = set.do_set_internal(rbp_rb_filter_layers_set(filter));
            SubLObject basis_object = set_contents.do_set_contents_basis_object(set_contents_var);
            SubLObject state = NIL;
            for (state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); !((NIL != no_matchP) || (NIL != set_contents.do_set_contents_doneP(basis_object, state))); state = set_contents.do_set_contents_update_state(state)) {
                {
                    SubLObject layer = set_contents.do_set_contents_next(basis_object, state);
                    if (NIL != set_contents.do_set_contents_element_validP(state, layer)) {
                        {
                            SubLObject filter_passers = (NIL != indeterminateP) ? ((SubLObject) (rbp_rb_layer_search_indeterminate(base, c_type, layer))) : rbp_rb_layer_search(keys_to_check, layer);
                            SubLObject survivors = list_utilities.nintersect_sorted_destroy_first_only(filter_passers, candidate_matches, $sym56$RBP_RULE__, UNPROVIDED);
                            SubLObject exempt = (NIL != report_failuresP) ? ((SubLObject) (rbp_rb_exempt_rules_reporting_failures(candidate_matches, surviving_traced_rules, filter_key, base, survivors, layer))) : rbp_rb_exempt_rules(candidate_matches, layer);
                            candidate_matches = list_utilities.nunion_sorted(survivors, exempt, $sym56$RBP_RULE__, UNPROVIDED);
                        }
                        if (NIL == candidate_matches) {
                            no_matchP = T;
                        }
                    }
                }
            }
            if ((NIL != candidate_matches) && (NIL != rbp_rb_filter_has_exclusions_p(filter))) {
                {
                    SubLObject layer = rbp_rb_filter_exclusions_layer(filter);
                    SubLObject exclusions = (NIL != indeterminateP) ? ((SubLObject) (rbp_rb_layer_search_indeterminate(base, c_type, layer))) : rbp_rb_layer_search(keys_to_check, layer);
                    if (NIL != exclusions) {
                        {
                            SubLObject new_candidate_matches = list_utilities.difference_sorted(candidate_matches, exclusions, $sym56$RBP_RULE__, UNPROVIDED);
                            if (NIL == list_utilities.same_length_p(candidate_matches, new_candidate_matches)) {
                                candidate_matches = new_candidate_matches;
                            }
                        }
                    }
                }
            }
        }
        {
            SubLObject new_survivors = surviving_traced_rules;
            SubLObject cdolist_list_var = surviving_traced_rules;
            SubLObject traced_rule = NIL;
            for (traced_rule = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , traced_rule = cdolist_list_var.first()) {
                if (NIL != subl_promotions.memberP(traced_rule, candidate_matches, UNPROVIDED, UNPROVIDED)) {
                    format(T, $str_alt92$__Passed_all__S_constraints_for__, filter_key, rbp_rule_cycl(traced_rule));
                } else {
                    new_survivors = remove(traced_rule, new_survivors, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    rbp_report_failed_rule(traced_rule, filter_key, base);
                }
            }
            surviving_traced_rules = new_survivors;
        }
        return values(candidate_matches, surviving_traced_rules);
    }

    /**
     * Filter CANDIDATE-MATCHES and SURVIVING-TRACED-RULES based on FILTER-KEY and BASE.
     *
     * @param CANDIDATE-MATCHES
     * 		will be destructively modified.
     * @return 0 LISTP; new candidate matches
     * @return 1 LISTP; new surviving traced rules
     */
    @LispMethod(comment = "Filter CANDIDATE-MATCHES and SURVIVING-TRACED-RULES based on FILTER-KEY and BASE.\r\n\r\n@param CANDIDATE-MATCHES\r\n\t\twill be destructively modified.\r\n@return 0 LISTP; new candidate matches\r\n@return 1 LISTP; new surviving traced rules")
    public static SubLObject rbp_rb_filter_rules(SubLObject candidate_matches, SubLObject surviving_traced_rules, final SubLObject filter_key, final SubLObject base) {
        rbp_rb_check_initialization();
        if (!candidate_matches.isList()) {
            candidate_matches = copy_list(rbp_rb_all_rules_sorted());
        }
        final SubLObject filter = rbp_rb_find_or_create_filter_for_key(filter_key);
        final SubLObject c_type = filter_key.first();
        final SubLObject keys_to_check = rbp_rb_keys_from_base(base, filter);
        final SubLObject indeterminateP = makeBoolean((NIL != subl_promotions.memberP(c_type, $list95, UNPROVIDED, UNPROVIDED)) && (NIL != member($$IndeterminateTerm, keys_to_check, UNPROVIDED, UNPROVIDED)));
        final SubLObject report_failuresP = NIL;
        SubLObject no_matchP = NIL;
        final SubLObject set_var = rbp_rb_filter_layers_set(filter);
        final SubLObject set_contents_var = set.do_set_internal(set_var);
        SubLObject basis_object;
        SubLObject state;
        SubLObject layer;
        SubLObject filter_passers;
        SubLObject survivors;
        SubLObject exempt;
        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); (NIL == no_matchP) && (NIL == set_contents.do_set_contents_doneP(basis_object, state)); state = set_contents.do_set_contents_update_state(state)) {
            layer = set_contents.do_set_contents_next(basis_object, state);
            if (NIL != set_contents.do_set_contents_element_validP(state, layer)) {
                filter_passers = (NIL != indeterminateP) ? rbp_rb_layer_search_indeterminate(base, c_type, layer) : rbp_rb_layer_search(keys_to_check, layer);
                survivors = list_utilities.nintersect_sorted_destroy_first_only(filter_passers, candidate_matches, $sym61$RBP_RULE__, UNPROVIDED);
                exempt = (NIL != report_failuresP) ? rbp_rb_exempt_rules_reporting_failures(candidate_matches, surviving_traced_rules, filter_key, base, survivors, layer) : rbp_rb_exempt_rules(candidate_matches, layer);
                candidate_matches = list_utilities.nunion_sorted(survivors, exempt, $sym61$RBP_RULE__, UNPROVIDED);
                if (NIL == candidate_matches) {
                    no_matchP = T;
                }
            }
        }
        if ((NIL != candidate_matches) && (NIL != rbp_rb_filter_has_exclusions_p(filter))) {
            layer = rbp_rb_filter_exclusions_layer(filter);
            final SubLObject exclusions = (NIL != indeterminateP) ? rbp_rb_layer_search_indeterminate(base, c_type, layer) : rbp_rb_layer_search(keys_to_check, layer);
            if (NIL != exclusions) {
                final SubLObject new_candidate_matches = list_utilities.difference_sorted(candidate_matches, exclusions, $sym61$RBP_RULE__, UNPROVIDED);
                if (NIL == list_utilities.same_length_p(candidate_matches, new_candidate_matches)) {
                    candidate_matches = new_candidate_matches;
                }
            }
        }
        SubLObject new_survivors = surviving_traced_rules;
        SubLObject cdolist_list_var = surviving_traced_rules;
        SubLObject traced_rule = NIL;
        traced_rule = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != subl_promotions.memberP(traced_rule, candidate_matches, UNPROVIDED, UNPROVIDED)) {
                format(T, $str97$__Passed_all__S_constraints_for__, filter_key, rbp_rule_cycl(traced_rule));
            } else {
                new_survivors = remove(traced_rule, new_survivors, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                rbp_report_failed_rule(traced_rule, filter_key, base);
            }
            cdolist_list_var = cdolist_list_var.rest();
            traced_rule = cdolist_list_var.first();
        } 
        surviving_traced_rules = new_survivors;
        return values(candidate_matches, surviving_traced_rules);
    }

    public static final SubLObject rbp_rb_layer_exempt_rule_lambdaP_alt(SubLObject candidate_match) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return rbp_rb_layer_exempt_ruleP($rbp_lambda_layer$.getDynamicValue(thread), candidate_match);
        }
    }

    public static SubLObject rbp_rb_layer_exempt_rule_lambdaP(final SubLObject candidate_match) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return rbp_rb_layer_exempt_ruleP($rbp_lambda_layer$.getDynamicValue(thread), candidate_match);
    }

    public static final SubLObject rbp_rb_exempt_rules_alt(SubLObject candidate_matches, SubLObject layer) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject exempt = NIL;
                {
                    SubLObject _prev_bind_0 = $rbp_lambda_layer$.currentBinding(thread);
                    try {
                        $rbp_lambda_layer$.bind(layer, thread);
                        exempt = list_utilities.delete_if_not($sym93$RBP_RB_LAYER_EXEMPT_RULE_LAMBDA_, candidate_matches, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    } finally {
                        $rbp_lambda_layer$.rebind(_prev_bind_0, thread);
                    }
                }
                return exempt;
            }
        }
    }

    public static SubLObject rbp_rb_exempt_rules(final SubLObject candidate_matches, final SubLObject layer) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject exempt = NIL;
        final SubLObject _prev_bind_0 = $rbp_lambda_layer$.currentBinding(thread);
        try {
            $rbp_lambda_layer$.bind(layer, thread);
            exempt = list_utilities.delete_if_not($sym98$RBP_RB_LAYER_EXEMPT_RULE_LAMBDA_, candidate_matches, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        } finally {
            $rbp_lambda_layer$.rebind(_prev_bind_0, thread);
        }
        return exempt;
    }

    public static final SubLObject rbp_rb_exempt_rules_reporting_failures_alt(SubLObject candidate_matches, SubLObject surviving_traced_rules, SubLObject filter_key, SubLObject base, SubLObject survivors, SubLObject layer) {
        {
            SubLObject exempt = NIL;
            SubLObject cdolist_list_var = candidate_matches;
            SubLObject candidate_match = NIL;
            for (candidate_match = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , candidate_match = cdolist_list_var.first()) {
                if (NIL != rbp_rb_layer_exempt_ruleP(layer, candidate_match)) {
                    if (NIL != subl_promotions.memberP(candidate_match, surviving_traced_rules, UNPROVIDED, UNPROVIDED)) {
                    }
                    exempt = cons(candidate_match, exempt);
                } else {
                    if (NIL == subl_promotions.memberP(candidate_match, survivors, UNPROVIDED, UNPROVIDED)) {
                        rbp_report_failed_rule(candidate_match, filter_key, base);
                    }
                }
            }
            exempt = nreverse(exempt);
            return exempt;
        }
    }

    public static SubLObject rbp_rb_exempt_rules_reporting_failures(final SubLObject candidate_matches, final SubLObject surviving_traced_rules, final SubLObject filter_key, final SubLObject base, final SubLObject survivors, final SubLObject layer) {
        SubLObject exempt = NIL;
        SubLObject cdolist_list_var = candidate_matches;
        SubLObject candidate_match = NIL;
        candidate_match = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != rbp_rb_layer_exempt_ruleP(layer, candidate_match)) {
                if (NIL != subl_promotions.memberP(candidate_match, surviving_traced_rules, UNPROVIDED, UNPROVIDED)) {
                }
                exempt = cons(candidate_match, exempt);
            } else
                if (NIL == subl_promotions.memberP(candidate_match, survivors, UNPROVIDED, UNPROVIDED)) {
                    rbp_report_failed_rule(candidate_match, filter_key, base);
                }

            cdolist_list_var = cdolist_list_var.rest();
            candidate_match = cdolist_list_var.first();
        } 
        exempt = nreverse(exempt);
        return exempt;
    }

    public static final SubLObject rbp_report_failed_rule_alt(SubLObject rbp_rule, SubLObject filter_key, SubLObject base) {
        {
            SubLObject rule_cycl = rbp_rule_cycl(rbp_rule);
            SubLObject rule_term_table = rbp_rb_rule_term_table(rule_cycl);
            SubLObject constraint_forts = rbp_rb_rule_term_table_lookup(rule_term_table, filter_key);
            format(T, $str_alt94$__The__S_block_s__S_value__S__did, new SubLObject[]{ second(filter_key), filter_key.first(), base, constraint_forts, rbp_rule });
        }
        return rbp_rule;
    }

    public static SubLObject rbp_report_failed_rule(final SubLObject rbp_rule, final SubLObject filter_key, final SubLObject base) {
        final SubLObject rule_cycl = rbp_rule_cycl(rbp_rule);
        final SubLObject rule_term_table = rbp_rb_rule_term_table(rule_cycl);
        final SubLObject constraint_forts = rbp_rb_rule_term_table_lookup(rule_term_table, filter_key);
        format(T, $str99$__The__S_block_s__S_value__S__did, new SubLObject[]{ second(filter_key), filter_key.first(), base, constraint_forts, rbp_rule });
        return rbp_rule;
    }

    /**
     *
     *
     * @param BASE;
     * 		a value from a noun compound block, e.g. the POS pred or CycL or WU
     * @param FILTER;
     * 		a rule bank filter
     */
    @LispMethod(comment = "@param BASE;\r\n\t\ta value from a noun compound block, e.g. the POS pred or CycL or WU\r\n@param FILTER;\r\n\t\ta rule bank filter")
    public static final SubLObject rbp_rb_keys_from_base_alt(SubLObject base, SubLObject filter) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (base.eql($ORIGINAL_STRING)) {
                return NIL;
            }
            {
                SubLObject filter_fn = third(filter);
                SubLObject keys = NIL;
                {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                        mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                        keys = rbp_rb_keys_from_base_int(filter_fn, base);
                    } finally {
                        mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                    }
                }
                return keys;
            }
        }
    }

    /**
     *
     *
     * @param BASE;
     * 		a value from a noun compound block, e.g. the POS pred or CycL or WU
     * @param FILTER;
     * 		a rule bank filter
     */
    @LispMethod(comment = "@param BASE;\r\n\t\ta value from a noun compound block, e.g. the POS pred or CycL or WU\r\n@param FILTER;\r\n\t\ta rule bank filter")
    public static SubLObject rbp_rb_keys_from_base(final SubLObject base, final SubLObject filter) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (base.eql($ORIGINAL_STRING)) {
            return NIL;
        }
        final SubLObject filter_fn = third(filter);
        SubLObject keys = NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
            keys = rbp_rb_keys_from_base_int(filter_fn, base);
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return keys;
    }

    public static final SubLObject rbp_rb_keys_from_base_int_internal_alt(SubLObject filter_fn, SubLObject base) {
        return funcall(filter_fn, base);
    }

    public static SubLObject rbp_rb_keys_from_base_int_internal(final SubLObject filter_fn, final SubLObject base) {
        return funcall(filter_fn, base);
    }

    public static final SubLObject rbp_rb_keys_from_base_int_alt(SubLObject filter_fn, SubLObject base) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
                SubLObject caching_state = NIL;
                if (NIL == v_memoization_state) {
                    return rbp_rb_keys_from_base_int_internal(filter_fn, base);
                }
                caching_state = memoization_state.memoization_state_lookup(v_memoization_state, RBP_RB_KEYS_FROM_BASE_INT, UNPROVIDED);
                if (NIL == caching_state) {
                    caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), RBP_RB_KEYS_FROM_BASE_INT, TWO_INTEGER, NIL, EQUAL, UNPROVIDED);
                    memoization_state.memoization_state_put(v_memoization_state, RBP_RB_KEYS_FROM_BASE_INT, caching_state);
                }
                {
                    SubLObject sxhash = memoization_state.sxhash_calc_2(filter_fn, base);
                    SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
                    if (collisions != $kw55$_MEMOIZED_ITEM_NOT_FOUND_) {
                        {
                            SubLObject cdolist_list_var = collisions;
                            SubLObject collision = NIL;
                            for (collision = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , collision = cdolist_list_var.first()) {
                                {
                                    SubLObject cached_args = collision.first();
                                    SubLObject results2 = second(collision);
                                    if (filter_fn.equal(cached_args.first())) {
                                        cached_args = cached_args.rest();
                                        if (((NIL != cached_args) && (NIL == cached_args.rest())) && base.equal(cached_args.first())) {
                                            return memoization_state.caching_results(results2);
                                        }
                                    }
                                }
                            }
                        }
                    }
                    {
                        SubLObject results = arg2(thread.resetMultipleValues(), multiple_value_list(rbp_rb_keys_from_base_int_internal(filter_fn, base)));
                        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results, list(filter_fn, base));
                        return memoization_state.caching_results(results);
                    }
                }
            }
        }
    }

    public static SubLObject rbp_rb_keys_from_base_int(final SubLObject filter_fn, final SubLObject base) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return rbp_rb_keys_from_base_int_internal(filter_fn, base);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, RBP_RB_KEYS_FROM_BASE_INT, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), RBP_RB_KEYS_FROM_BASE_INT, TWO_INTEGER, NIL, EQUAL, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, RBP_RB_KEYS_FROM_BASE_INT, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(filter_fn, base);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (filter_fn.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (((NIL != cached_args) && (NIL == cached_args.rest())) && base.equal(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(thread.resetMultipleValues(), multiple_value_list(rbp_rb_keys_from_base_int_internal(filter_fn, base)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(filter_fn, base));
        return memoization_state.caching_results(results3);
    }

    /**
     *
     *
     * @param RULE-CYCL;
     * 		a noun compound rule from the KB.
     * @return HASH-TABLE-P; key: FILTER-KEY value: FORTS. A straightforward representation
    of the #$ncRuleConstraint assertions on RULE-CYCL.
     */
    @LispMethod(comment = "@param RULE-CYCL;\r\n\t\ta noun compound rule from the KB.\r\n@return HASH-TABLE-P; key: FILTER-KEY value: FORTS. A straightforward representation\r\nof the #$ncRuleConstraint assertions on RULE-CYCL.")
    public static final SubLObject rbp_rb_rule_term_table_alt(SubLObject rule_cycl) {
        {
            SubLObject table = make_hash_table(SIXTEEN_INTEGER, symbol_function(EQUALP), UNPROVIDED);
            SubLObject constraints = rbp_rule_constraints(rule_cycl);
            SubLObject cdolist_list_var = constraints;
            SubLObject clause = NIL;
            for (clause = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , clause = cdolist_list_var.first()) {
                {
                    SubLObject key = butlast(clause, UNPROVIDED);
                    SubLObject new_value = list_utilities.last_one(clause);
                    if (!new_value.isKeyword()) {
                        hash_table_utilities.push_hash(key, new_value, table);
                    }
                }
            }
            return table;
        }
    }

    /**
     *
     *
     * @param RULE-CYCL;
     * 		a noun compound rule from the KB.
     * @return HASH-TABLE-P; key: FILTER-KEY value: FORTS. A straightforward representation
    of the #$ncRuleConstraint assertions on RULE-CYCL.
     */
    @LispMethod(comment = "@param RULE-CYCL;\r\n\t\ta noun compound rule from the KB.\r\n@return HASH-TABLE-P; key: FILTER-KEY value: FORTS. A straightforward representation\r\nof the #$ncRuleConstraint assertions on RULE-CYCL.")
    public static SubLObject rbp_rb_rule_term_table(final SubLObject rule_cycl) {
        final SubLObject table = make_hash_table(SIXTEEN_INTEGER, symbol_function(EQUALP), UNPROVIDED);
        SubLObject cdolist_list_var;
        final SubLObject constraints = cdolist_list_var = rbp_rule_constraints(rule_cycl);
        SubLObject clause = NIL;
        clause = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject key = butlast(clause, UNPROVIDED);
            final SubLObject new_value = list_utilities.last_one(clause);
            if (!new_value.isKeyword()) {
                hash_table_utilities.push_hash(key, new_value, table);
            }
            cdolist_list_var = cdolist_list_var.rest();
            clause = cdolist_list_var.first();
        } 
        return table;
    }

    public static final SubLObject rbp_rb_rule_term_table_lookup_alt(SubLObject rule_term_table, SubLObject filter_key) {
        return gethash(filter_key, rule_term_table, UNPROVIDED);
    }

    public static SubLObject rbp_rb_rule_term_table_lookup(final SubLObject rule_term_table, final SubLObject filter_key) {
        return gethash(filter_key, rule_term_table, UNPROVIDED);
    }

    public static final SubLObject rbp_rb_all_genls_alt(SubLObject obj) {
        return NIL != term.el_fort_p(obj) ? ((SubLObject) (genls.all_genls(obj, UNPROVIDED, UNPROVIDED))) : NIL;
    }

    public static SubLObject rbp_rb_all_genls(final SubLObject obj) {
        return NIL != term.el_fort_p(obj) ? genls.all_genls(obj, UNPROVIDED, UNPROVIDED) : NIL;
    }

    public static final SubLObject rbp_rb_all_type_genls_alt(SubLObject obj) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject ans = NIL;
                if (NIL != isa.isaP(obj, $$CollectionType, UNPROVIDED, UNPROVIDED)) {
                    ans = ask_utilities.query_variable($sym100$_TYPE, listS($$and, listS($$typeGenls, obj, $list_alt103), $list_alt104), parsing_vars.$parsing_domain_mt$.getDynamicValue(thread), UNPROVIDED);
                }
                return ans;
            }
        }
    }

    public static SubLObject rbp_rb_all_type_genls(final SubLObject obj) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ans = NIL;
        if (NIL != isa.isaP(obj, $$CollectionType, UNPROVIDED, UNPROVIDED)) {
            ans = ask_utilities.query_variable($sym105$_TYPE, listS($$and, listS($$typeGenls, obj, $list108), $list109), parsing_vars.$parsing_domain_mt$.getDynamicValue(thread), UNPROVIDED);
        }
        return ans;
    }

    public static final SubLObject rbp_rb_all_isa_alt(SubLObject obj) {
        {
            SubLObject isas = isa.all_isa(obj, UNPROVIDED, UNPROVIDED);
            if (NIL == isas) {
                if (NIL != subl_promotions.positive_integer_p(obj)) {
                    isas = genls.all_genls($$PositiveInteger, UNPROVIDED, UNPROVIDED);
                } else {
                    if (obj.isString()) {
                        {
                            SubLObject cdolist_list_var = noun_compound_constraint_string_specs();
                            SubLObject col = NIL;
                            for (col = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , col = cdolist_list_var.first()) {
                                if (col.eql($$ProperNameString)) {
                                    if ((NIL != upper_case_p(string_utilities.first_char(obj))) || (NIL != list_utilities.empty_list_p(lexicon_cache.words_of_string(obj, UNPROVIDED, UNPROVIDED, UNPROVIDED)))) {
                                        isas = cons(col, isas);
                                    }
                                } else {
                                    if (NIL != at_defns.quiet_has_typeP(obj, col, UNPROVIDED)) {
                                        isas = cons(col, isas);
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return isas;
        }
    }

    public static SubLObject rbp_rb_all_isa(final SubLObject obj) {
        SubLObject isas = isa.all_isa(obj, UNPROVIDED, UNPROVIDED);
        if (NIL == isas) {
            if (NIL != subl_promotions.positive_integer_p(obj)) {
                isas = genls.all_genls($$PositiveInteger, UNPROVIDED, UNPROVIDED);
            } else
                if (obj.isString()) {
                    SubLObject cdolist_list_var = noun_compound_constraint_string_specs();
                    SubLObject col = NIL;
                    col = cdolist_list_var.first();
                    while (NIL != cdolist_list_var) {
                        if (col.eql($$ProperNameString)) {
                            if ((NIL != upper_case_p(string_utilities.first_char(obj))) || (NIL != list_utilities.empty_list_p(lexicon_cache.words_of_string(obj, UNPROVIDED, UNPROVIDED, UNPROVIDED)))) {
                                isas = cons(col, isas);
                            }
                        } else
                            if (NIL != at_defns.quiet_has_typeP(obj, col, UNPROVIDED)) {
                                isas = cons(col, isas);
                            }

                        cdolist_list_var = cdolist_list_var.rest();
                        col = cdolist_list_var.first();
                    } 
                }

        }
        return isas;
    }

    public static final SubLObject clear_noun_compound_constraint_string_specs_alt() {
        {
            SubLObject cs = $noun_compound_constraint_string_specs_caching_state$.getGlobalValue();
            if (NIL != cs) {
                memoization_state.caching_state_clear(cs);
            }
        }
        return NIL;
    }

    public static SubLObject clear_noun_compound_constraint_string_specs() {
        final SubLObject cs = $noun_compound_constraint_string_specs_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static final SubLObject remove_noun_compound_constraint_string_specs_alt() {
        return memoization_state.caching_state_remove_function_results_with_args($noun_compound_constraint_string_specs_caching_state$.getGlobalValue(), list(EMPTY_SUBL_OBJECT_ARRAY), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject remove_noun_compound_constraint_string_specs() {
        return memoization_state.caching_state_remove_function_results_with_args($noun_compound_constraint_string_specs_caching_state$.getGlobalValue(), list(EMPTY_SUBL_OBJECT_ARRAY), UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject noun_compound_constraint_string_specs_internal_alt() {
        return ask_utilities.query_variable($sym108$_COL, $list_alt109, $$InferencePSC, UNPROVIDED);
    }

    public static SubLObject noun_compound_constraint_string_specs_internal() {
        return ask_utilities.query_variable($sym113$_COL, $list114, $$InferencePSC, UNPROVIDED);
    }

    public static final SubLObject noun_compound_constraint_string_specs_alt() {
        {
            SubLObject caching_state = $noun_compound_constraint_string_specs_caching_state$.getGlobalValue();
            if (NIL == caching_state) {
                caching_state = memoization_state.create_global_caching_state_for_name(NOUN_COMPOUND_CONSTRAINT_STRING_SPECS, $noun_compound_constraint_string_specs_caching_state$, NIL, EQL, ZERO_INTEGER, ZERO_INTEGER);
            }
            {
                SubLObject results = memoization_state.caching_state_get_zero_arg_results(caching_state, UNPROVIDED);
                if (results == $kw55$_MEMOIZED_ITEM_NOT_FOUND_) {
                    results = arg2(resetMultipleValues(), multiple_value_list(noun_compound_constraint_string_specs_internal()));
                    memoization_state.caching_state_set_zero_arg_results(caching_state, results, UNPROVIDED);
                }
                return memoization_state.caching_results(results);
            }
        }
    }

    public static SubLObject noun_compound_constraint_string_specs() {
        SubLObject caching_state = $noun_compound_constraint_string_specs_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(NOUN_COMPOUND_CONSTRAINT_STRING_SPECS, $noun_compound_constraint_string_specs_caching_state$, NIL, EQL, ZERO_INTEGER, ZERO_INTEGER);
        }
        SubLObject results = memoization_state.caching_state_get_zero_arg_results(caching_state, UNPROVIDED);
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(resetMultipleValues(), multiple_value_list(noun_compound_constraint_string_specs_internal()));
            memoization_state.caching_state_set_zero_arg_results(caching_state, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    public static SubLObject declare_rbp_rule_bank_file() {
        declareFunction("rbp_new_rule_bank", "RBP-NEW-RULE-BANK", 0, 0, false);
        declareFunction("note_rbp_rb_initialized", "NOTE-RBP-RB-INITIALIZED", 0, 0, false);
        declareMacro("with_rbp_rule_bank_lock_held", "WITH-RBP-RULE-BANK-LOCK-HELD");
        declareMacro("do_rbp_constraint_types", "DO-RBP-CONSTRAINT-TYPES");
        declareFunction("rbp_syntactic_constraint_type_p", "RBP-SYNTACTIC-CONSTRAINT-TYPE-P", 1, 0, false);
        declareFunction("rbp_semantic_constraint_type_p", "RBP-SEMANTIC-CONSTRAINT-TYPE-P", 1, 0, false);
        declareFunction("rbp_syntactic_constraint_p", "RBP-SYNTACTIC-CONSTRAINT-P", 1, 0, false);
        declareFunction("rbp_word_unit_constraint_p", "RBP-WORD-UNIT-CONSTRAINT-P", 1, 0, false);
        declareFunction("rbp_semantic_constraint_p", "RBP-SEMANTIC-CONSTRAINT-P", 1, 0, false);
        declareFunction("recursive_block_parser_rule_print_function_trampoline", "RECURSIVE-BLOCK-PARSER-RULE-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction("recursive_block_parser_rule_p", "RECURSIVE-BLOCK-PARSER-RULE-P", 1, 0, false);
        new rbp_rule_bank.$recursive_block_parser_rule_p$UnaryFunction();
        declareFunction("rbp_rule_cycl", "RBP-RULE-CYCL", 1, 0, false);
        declareFunction("rbp_rule_filter_layers", "RBP-RULE-FILTER-LAYERS", 1, 0, false);
        declareFunction("_csetf_rbp_rule_cycl", "_CSETF-RBP-RULE-CYCL", 2, 0, false);
        declareFunction("_csetf_rbp_rule_filter_layers", "_CSETF-RBP-RULE-FILTER-LAYERS", 2, 0, false);
        declareFunction("make_recursive_block_parser_rule", "MAKE-RECURSIVE-BLOCK-PARSER-RULE", 0, 1, false);
        declareFunction("visit_defstruct_recursive_block_parser_rule", "VISIT-DEFSTRUCT-RECURSIVE-BLOCK-PARSER-RULE", 2, 0, false);
        declareFunction("visit_defstruct_object_recursive_block_parser_rule_method", "VISIT-DEFSTRUCT-OBJECT-RECURSIVE-BLOCK-PARSER-RULE-METHOD", 2, 0, false);
        declareFunction("pprint_rbp_rule", "PPRINT-RBP-RULE", 1, 2, false);
        declareFunction("new_rbp_rule", "NEW-RBP-RULE", 1, 0, false);
        declareFunction("rbp_rule_note_cycl", "RBP-RULE-NOTE-CYCL", 2, 0, false);
        declareFunction("rbp_find_or_create_rule_from_cycl", "RBP-FIND-OR-CREATE-RULE-FROM-CYCL", 1, 0, false);
        declareFunction("rbp_find_rule_from_cycl", "RBP-FIND-RULE-FROM-CYCL", 1, 1, false);
        declareFunction("rbp_find_rule_from_cycl_w_initialized_rb", "RBP-FIND-RULE-FROM-CYCL-W-INITIALIZED-RB", 1, 0, false);
        declareFunction("rbp_find_cycl_from_rule", "RBP-FIND-CYCL-FROM-RULE", 1, 0, false);
        declareFunction("rbp_rb_filters", "RBP-RB-FILTERS", 0, 0, false);
        declareFunction("rbp_rb_add_filter", "RBP-RB-ADD-FILTER", 2, 0, false);
        declareFunction("rbp_rb_rule_count", "RBP-RB-RULE-COUNT", 0, 0, false);
        declareFunction("rbp_rb_all_rules", "RBP-RB-ALL-RULES", 0, 0, false);
        declareFunction("clear_rbp_rb_all_rules_sorted", "CLEAR-RBP-RB-ALL-RULES-SORTED", 0, 0, false);
        declareFunction("remove_rbp_rb_all_rules_sorted", "REMOVE-RBP-RB-ALL-RULES-SORTED", 0, 0, false);
        declareFunction("rbp_rb_all_rules_sorted_internal", "RBP-RB-ALL-RULES-SORTED-INTERNAL", 0, 0, false);
        declareFunction("rbp_rb_all_rules_sorted", "RBP-RB-ALL-RULES-SORTED", 0, 0, false);
        declareFunction("sort_rbp_rules", "SORT-RBP-RULES", 1, 0, false);
        declareFunction("rbp_rule_L", "RBP-RULE-<", 2, 0, false);
        new rbp_rule_bank.$rbp_rule_L$BinaryFunction();
        declareFunction("rbp_rules_sortedP", "RBP-RULES-SORTED?", 1, 0, false);
        declareFunction("rbp_rb_new_filter", "RBP-RB-NEW-FILTER", 1, 0, false);
        declareFunction("rbp_rb_filter_layers_set", "RBP-RB-FILTER-LAYERS-SET", 1, 0, false);
        declareFunction("rbp_rb_filter_exclusions_layer", "RBP-RB-FILTER-EXCLUSIONS-LAYER", 1, 0, false);
        declareFunction("rbp_rb_filter_has_exclusions_p", "RBP-RB-FILTER-HAS-EXCLUSIONS-P", 1, 0, false);
        declareFunction("rbp_rb_filter_layers_list", "RBP-RB-FILTER-LAYERS-LIST", 1, 0, false);
        declareFunction("rbp_rb_filter_add_layer", "RBP-RB-FILTER-ADD-LAYER", 2, 0, false);
        declareFunction("rbp_rb_filter_add_excluded_value", "RBP-RB-FILTER-ADD-EXCLUDED-VALUE", 3, 0, false);
        declareFunction("rbp_rb_find_or_create_filter_for_key", "RBP-RB-FIND-OR-CREATE-FILTER-FOR-KEY", 1, 0, false);
        declareFunction("rbp_rb_fn_for_filter_key", "RBP-RB-FN-FOR-FILTER-KEY", 1, 0, false);
        declareFunction("rbp_rb_new_layer", "RBP-RB-NEW-LAYER", 0, 0, false);
        declareFunction("rbp_rb_layer_dictionary", "RBP-RB-LAYER-DICTIONARY", 1, 0, false);
        declareFunction("rbp_rb_layer_note_rule_to_check", "RBP-RB-LAYER-NOTE-RULE-TO-CHECK", 2, 0, false);
        declareFunction("rbp_rb_layer_exempt_ruleP", "RBP-RB-LAYER-EXEMPT-RULE?", 2, 0, false);
        declareFunction("rbp_rb_layer_search", "RBP-RB-LAYER-SEARCH", 2, 0, false);
        declareFunction("rbp_rb_layer_search_indeterminate", "RBP-RB-LAYER-SEARCH-INDETERMINATE", 3, 0, false);
        declareFunction("rbp_rb_layer_search_one", "RBP-RB-LAYER-SEARCH-ONE", 2, 0, false);
        declareFunction("rbp_rb_layer_note_value", "RBP-RB-LAYER-NOTE-VALUE", 3, 0, false);
        declareFunction("rbp_rb_layer_add_ok_value", "RBP-RB-LAYER-ADD-OK-VALUE", 3, 0, false);
        declareFunction("rbp_rb_layer_add_excluded_value", "RBP-RB-LAYER-ADD-EXCLUDED-VALUE", 3, 0, false);
        declareFunction("rbp_rb_check_initialization", "RBP-RB-CHECK-INITIALIZATION", 0, 0, false);
        declareFunction("rbp_clear_rule_bank", "RBP-CLEAR-RULE-BANK", 0, 0, false);
        declareFunction("rbp_clear_rule_bank_internal", "RBP-CLEAR-RULE-BANK-INTERNAL", 0, 0, false);
        declareFunction("rbp_rb_initialize", "RBP-RB-INITIALIZE", 0, 0, false);
        declareFunction("rbp_rb_update", "RBP-RB-UPDATE", 1, 0, false);
        declareFunction("rbp_rb_update_all_filters", "RBP-RB-UPDATE-ALL-FILTERS", 1, 0, false);
        declareFunction("rbp_rb_update_filter", "RBP-RB-UPDATE-FILTER", 2, 1, false);
        declareFunction("rbp_rb_excluded_value_p", "RBP-RB-EXCLUDED-VALUE-P", 1, 0, false);
        declareFunction("rbp_rb_make_excluded_value", "RBP-RB-MAKE-EXCLUDED-VALUE", 1, 0, false);
        declareFunction("rbp_rb_excluded_value_term", "RBP-RB-EXCLUDED-VALUE-TERM", 1, 0, false);
        declareFunction("rbp_rule_constraints", "RBP-RULE-CONSTRAINTS", 1, 0, false);
        declareFunction("rbp_canonicalize_constraint", "RBP-CANONICALIZE-CONSTRAINT", 1, 0, false);
        declareFunction("rbp_negative_constraint_fn_p", "RBP-NEGATIVE-CONSTRAINT-FN-P", 1, 0, false);
        declareFunction("rbp_positive_correlate_of_negative_constraint_fn", "RBP-POSITIVE-CORRELATE-OF-NEGATIVE-CONSTRAINT-FN", 1, 0, false);
        declareFunction("rbp_canonicalize_negative_constraint", "RBP-CANONICALIZE-NEGATIVE-CONSTRAINT", 1, 0, false);
        declareFunction("rbp_forts_to_keywords", "RBP-FORTS-TO-KEYWORDS", 1, 0, false);
        declareFunction("rbp_fort_to_keyword", "RBP-FORT-TO-KEYWORD", 1, 0, false);
        declareFunction("rbp_term_keyword_map", "RBP-TERM-KEYWORD-MAP", 0, 0, false);
        declareFunction("initialize_rbp_term_keyword_map", "INITIALIZE-RBP-TERM-KEYWORD-MAP", 0, 0, false);
        declareFunction("rbp_keyword_for_term", "RBP-KEYWORD-FOR-TERM", 1, 0, false);
        declareFunction("rbp_rb_filter_rules", "RBP-RB-FILTER-RULES", 4, 0, false);
        declareFunction("rbp_rb_layer_exempt_rule_lambdaP", "RBP-RB-LAYER-EXEMPT-RULE-LAMBDA?", 1, 0, false);
        new rbp_rule_bank.$rbp_rb_layer_exempt_rule_lambdaP$UnaryFunction();
        declareFunction("rbp_rb_exempt_rules", "RBP-RB-EXEMPT-RULES", 2, 0, false);
        declareFunction("rbp_rb_exempt_rules_reporting_failures", "RBP-RB-EXEMPT-RULES-REPORTING-FAILURES", 6, 0, false);
        declareFunction("rbp_report_failed_rule", "RBP-REPORT-FAILED-RULE", 3, 0, false);
        declareFunction("rbp_rb_keys_from_base", "RBP-RB-KEYS-FROM-BASE", 2, 0, false);
        declareFunction("rbp_rb_keys_from_base_int_internal", "RBP-RB-KEYS-FROM-BASE-INT-INTERNAL", 2, 0, false);
        declareFunction("rbp_rb_keys_from_base_int", "RBP-RB-KEYS-FROM-BASE-INT", 2, 0, false);
        declareFunction("rbp_rb_rule_term_table", "RBP-RB-RULE-TERM-TABLE", 1, 0, false);
        declareFunction("rbp_rb_rule_term_table_lookup", "RBP-RB-RULE-TERM-TABLE-LOOKUP", 2, 0, false);
        declareFunction("rbp_rb_all_genls", "RBP-RB-ALL-GENLS", 1, 0, false);
        declareFunction("rbp_rb_all_type_genls", "RBP-RB-ALL-TYPE-GENLS", 1, 0, false);
        declareFunction("rbp_rb_all_isa", "RBP-RB-ALL-ISA", 1, 0, false);
        declareFunction("clear_noun_compound_constraint_string_specs", "CLEAR-NOUN-COMPOUND-CONSTRAINT-STRING-SPECS", 0, 0, false);
        declareFunction("remove_noun_compound_constraint_string_specs", "REMOVE-NOUN-COMPOUND-CONSTRAINT-STRING-SPECS", 0, 0, false);
        declareFunction("noun_compound_constraint_string_specs_internal", "NOUN-COMPOUND-CONSTRAINT-STRING-SPECS-INTERNAL", 0, 0, false);
        declareFunction("noun_compound_constraint_string_specs", "NOUN-COMPOUND-CONSTRAINT-STRING-SPECS", 0, 0, false);
        return NIL;
    }

    public static final SubLObject init_rbp_rule_bank_file_alt() {
        deflexical("*RBP-RULE-BANK*", NIL != boundp($rbp_rule_bank$) ? ((SubLObject) ($rbp_rule_bank$.getGlobalValue())) : rbp_new_rule_bank());
        deflexical("*RBP-RULE-INDEX*", NIL != boundp($rbp_rule_index$) ? ((SubLObject) ($rbp_rule_index$.getGlobalValue())) : dictionary.new_dictionary(UNPROVIDED, UNPROVIDED));
        deflexical("*RBP-RB-INITIALIZED?*", NIL != boundp($rbp_rb_initializedP$) ? ((SubLObject) ($rbp_rb_initializedP$.getGlobalValue())) : NIL);
        deflexical("*RBP-RULE-BANK-LOCK*", make_lock($$$RBP_Rule_Bank_Lock));
        defconstant("*RBP-SYNTACTIC-CONSTRAINT-TYPES*", $list_alt6);
        defconstant("*RBP-SEMANTIC-CONSTRAINT-TYPES*", $list_alt7);
        defconstant("*RBP-OPEN-CLASS-CONSTRAINT-TYPES*", $list_alt8);
        defconstant("*RBP-CLOSED-CLASS-CONSTRAINT-TYPES*", $list_alt9);
        defparameter("*RBP-CONSTRAINED-TYPES*", $list_alt33);
        defconstant("*DTP-RECURSIVE-BLOCK-PARSER-RULE*", RECURSIVE_BLOCK_PARSER_RULE);
        deflexical("*RBP-RB-ALL-RULES-SORTED-CACHING-STATE*", NIL);
        deflexical("*RBP-TERM-KEYWORD-MAP*", $UNINITIALIZED);
        defparameter("*RBP-LAMBDA-LAYER*", NIL);
        deflexical("*NOUN-COMPOUND-CONSTRAINT-STRING-SPECS-CACHING-STATE*", NIL);
        return NIL;
    }

    public static SubLObject init_rbp_rule_bank_file() {
        if (SubLFiles.USE_V1) {
            deflexical("*RBP-RULE-BANK*", SubLTrampolineFile.maybeDefault($rbp_rule_bank$, $rbp_rule_bank$, () -> rbp_new_rule_bank()));
            deflexical("*RBP-RULE-INDEX*", SubLTrampolineFile.maybeDefault($rbp_rule_index$, $rbp_rule_index$, () -> dictionary.new_dictionary(UNPROVIDED, UNPROVIDED)));
            deflexical("*RBP-RB-INITIALIZED?*", SubLTrampolineFile.maybeDefault($rbp_rb_initializedP$, $rbp_rb_initializedP$, NIL));
            deflexical("*RBP-RULE-BANK-LOCK*", make_lock($$$RBP_Rule_Bank_Lock));
            defconstant("*RBP-SYNTACTIC-CONSTRAINT-TYPES*", $list6);
            defconstant("*RBP-SEMANTIC-CONSTRAINT-TYPES*", $list7);
            defconstant("*RBP-OPEN-CLASS-CONSTRAINT-TYPES*", $list8);
            defconstant("*RBP-CLOSED-CLASS-CONSTRAINT-TYPES*", $list9);
            defparameter("*RBP-CONSTRAINED-TYPES*", $list33);
            defconstant("*DTP-RECURSIVE-BLOCK-PARSER-RULE*", RECURSIVE_BLOCK_PARSER_RULE);
            deflexical("*RBP-RB-ALL-RULES-SORTED-CACHING-STATE*", NIL);
            deflexical("*RBP-TERM-KEYWORD-MAP*", $UNINITIALIZED);
            defparameter("*RBP-LAMBDA-LAYER*", NIL);
            deflexical("*NOUN-COMPOUND-CONSTRAINT-STRING-SPECS-CACHING-STATE*", NIL);
        }
        if (SubLFiles.USE_V2) {
            deflexical("*RBP-RULE-BANK*", NIL != boundp($rbp_rule_bank$) ? ((SubLObject) ($rbp_rule_bank$.getGlobalValue())) : rbp_new_rule_bank());
            deflexical("*RBP-RULE-INDEX*", NIL != boundp($rbp_rule_index$) ? ((SubLObject) ($rbp_rule_index$.getGlobalValue())) : dictionary.new_dictionary(UNPROVIDED, UNPROVIDED));
            deflexical("*RBP-RB-INITIALIZED?*", NIL != boundp($rbp_rb_initializedP$) ? ((SubLObject) ($rbp_rb_initializedP$.getGlobalValue())) : NIL);
        }
        return NIL;
    }

    public static SubLObject init_rbp_rule_bank_file_Previous() {
        deflexical("*RBP-RULE-BANK*", SubLTrampolineFile.maybeDefault($rbp_rule_bank$, $rbp_rule_bank$, () -> rbp_new_rule_bank()));
        deflexical("*RBP-RULE-INDEX*", SubLTrampolineFile.maybeDefault($rbp_rule_index$, $rbp_rule_index$, () -> dictionary.new_dictionary(UNPROVIDED, UNPROVIDED)));
        deflexical("*RBP-RB-INITIALIZED?*", SubLTrampolineFile.maybeDefault($rbp_rb_initializedP$, $rbp_rb_initializedP$, NIL));
        deflexical("*RBP-RULE-BANK-LOCK*", make_lock($$$RBP_Rule_Bank_Lock));
        defconstant("*RBP-SYNTACTIC-CONSTRAINT-TYPES*", $list6);
        defconstant("*RBP-SEMANTIC-CONSTRAINT-TYPES*", $list7);
        defconstant("*RBP-OPEN-CLASS-CONSTRAINT-TYPES*", $list8);
        defconstant("*RBP-CLOSED-CLASS-CONSTRAINT-TYPES*", $list9);
        defparameter("*RBP-CONSTRAINED-TYPES*", $list33);
        defconstant("*DTP-RECURSIVE-BLOCK-PARSER-RULE*", RECURSIVE_BLOCK_PARSER_RULE);
        deflexical("*RBP-RB-ALL-RULES-SORTED-CACHING-STATE*", NIL);
        deflexical("*RBP-TERM-KEYWORD-MAP*", $UNINITIALIZED);
        defparameter("*RBP-LAMBDA-LAYER*", NIL);
        deflexical("*NOUN-COMPOUND-CONSTRAINT-STRING-SPECS-CACHING-STATE*", NIL);
        return NIL;
    }

    public static SubLObject setup_rbp_rule_bank_file() {
        declare_defglobal($rbp_rule_bank$);
        declare_defglobal($rbp_rule_index$);
        declare_defglobal($rbp_rb_initializedP$);
        register_method($print_object_method_table$.getGlobalValue(), $dtp_recursive_block_parser_rule$.getGlobalValue(), symbol_function(RECURSIVE_BLOCK_PARSER_RULE_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim($list45);
        def_csetf(RBP_RULE_CYCL, _CSETF_RBP_RULE_CYCL);
        def_csetf(RBP_RULE_FILTER_LAYERS, _CSETF_RBP_RULE_FILTER_LAYERS);
        identity(RECURSIVE_BLOCK_PARSER_RULE);
        register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_recursive_block_parser_rule$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_RECURSIVE_BLOCK_PARSER_RULE_METHOD));
        memoization_state.note_globally_cached_function(RBP_RB_ALL_RULES_SORTED);
        memoization_state.note_memoized_function(RBP_RB_KEYS_FROM_BASE_INT);
        memoization_state.note_globally_cached_function(NOUN_COMPOUND_CONSTRAINT_STRING_SPECS);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_rbp_rule_bank_file();
    }

    @Override
    public void initializeVariables() {
        init_rbp_rule_bank_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_rbp_rule_bank_file();
    }

    static {
    }

    static private final SubLList $list_alt5 = list(makeSymbol("*RBP-RULE-BANK-LOCK*"));

    static private final SubLList $list_alt6 = list($PRED, makeKeyword("POS"), makeKeyword("WU"));

    static private final SubLList $list_alt7 = list($GENL, makeKeyword("TYPE-GENL"), makeKeyword("ISA"), makeKeyword("EQL"));

    static private final SubLList $list_alt8 = list(makeKeyword("WU"), $GENL, makeKeyword("TYPE-GENL"), makeKeyword("ISA"), makeKeyword("EQL"));

    static private final SubLList $list_alt9 = list(makeKeyword("POS"), $PRED);

    static private final SubLList $list_alt10 = list(list(makeSymbol("TYPE"), makeSymbol("&KEY"), makeSymbol("DONE"), list(makeSymbol("MODE"), makeKeyword("ALL"))), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list_alt11 = list($DONE, $MODE);

    public static final class $recursive_block_parser_rule_p$UnaryFunction extends UnaryFunction {
        public $recursive_block_parser_rule_p$UnaryFunction() {
            super(extractFunctionNamed("RECURSIVE-BLOCK-PARSER-RULE-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return recursive_block_parser_rule_p(arg1);
        }
    }

    static private final SubLList $list_alt21 = list(makeSymbol("*RBP-SYNTACTIC-CONSTRAINT-TYPES*"));

    static private final SubLList $list_alt22 = list(makeSymbol("*RBP-SEMANTIC-CONSTRAINT-TYPES*"));

    public static final class $rbp_rule_L$BinaryFunction extends BinaryFunction {
        public $rbp_rule_L$BinaryFunction() {
            super(extractFunctionNamed("RBP-RULE-<"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1, final SubLObject arg2) {
            return rbp_rule_L(arg1, arg2);
        }
    }

    static private final SubLList $list_alt23 = list(makeSymbol("*RBP-OPEN-CLASS-CONSTRAINT-TYPES*"));

    static private final SubLList $list_alt24 = list(makeSymbol("*RBP-CLOSED-CLASS-CONSTRAINT-TYPES*"));

    static private final SubLList $list_alt27 = list(makeKeyword("ALL"));

    static private final SubLList $list_alt28 = list(makeKeyword("SYNTACTIC"));

    public static final class $rbp_rb_layer_exempt_rule_lambdaP$UnaryFunction extends UnaryFunction {
        public $rbp_rb_layer_exempt_rule_lambdaP$UnaryFunction() {
            super(extractFunctionNamed("RBP-RB-LAYER-EXEMPT-RULE-LAMBDA?"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return rbp_rb_layer_exempt_rule_lambdaP(arg1);
        }
    }

    static private final SubLList $list_alt30 = list(makeKeyword("SEMANTIC"));

    static private final SubLList $list_alt31 = list(makeKeyword("OPEN-CLASS"));

    static private final SubLList $list_alt32 = list(makeKeyword("CLOSED-CLASS"));

    static private final SubLList $list_alt33 = list($HEAD, makeKeyword("MODIFIER"));

    static private final SubLList $list_alt34 = list(list($TEST, makeSymbol("RBP-SYNTACTIC-CONSTRAINT-TYPE-P")), makeKeyword("ANYTHING"), makeKeyword("ANYTHING"));

    static private final SubLList $list_alt35 = list(makeKeyword("WU"), makeKeyword("ANYTHING"), makeKeyword("ANYTHING"));

    static private final SubLList $list_alt36 = list(makeKeyword("OR"), list(list($TEST, makeSymbol("RBP-SEMANTIC-CONSTRAINT-TYPE-P")), makeKeyword("ANYTHING"), makeKeyword("ANYTHING")), list(reader_make_constant_shell("FormulaArgFn"), list($TEST, makeSymbol("POSITIVE-INTEGER-P")), list($TEST, makeSymbol("RBP-SEMANTIC-CONSTRAINT-P"))));

    static private final SubLList $list_alt39 = list(makeSymbol("CYCL"), makeSymbol("FILTER-LAYERS"));

    static private final SubLList $list_alt40 = list($CYCL, makeKeyword("FILTER-LAYERS"));

    static private final SubLList $list_alt41 = list(makeSymbol("RBP-RULE-CYCL"), makeSymbol("RBP-RULE-FILTER-LAYERS"));

    static private final SubLList $list_alt42 = list(makeSymbol("_CSETF-RBP-RULE-CYCL"), makeSymbol("_CSETF-RBP-RULE-FILTER-LAYERS"));

    static private final SubLString $str_alt51$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");

    static private final SubLString $str_alt52$__RBP_RULE__S_ = makeString("#<RBP-RULE ~S>");

    public static final SubLSymbol $kw55$_MEMOIZED_ITEM_NOT_FOUND_ = makeKeyword("&MEMOIZED-ITEM-NOT-FOUND&");

    static private final SubLSymbol $sym56$RBP_RULE__ = makeSymbol("RBP-RULE-<");

    static private final SubLSymbol $sym70$RBP_WFF_ISA_ = makeSymbol("RBP-WFF-ISA?");

    static private final SubLSymbol $sym71$NPP_GENL_ = makeSymbol("NPP-GENL?");

    static private final SubLList $list_alt77 = list(makeKeyword("EXCLUDE"), makeKeyword("ANYTHING"));

    static private final SubLList $list_alt81 = list(makeString("NCNotEqualsConstraintFn"), makeString("NCNotIsaConstraintFn"), makeString("NCNotGenlsConstraintFn"));

    static private final SubLList $list_alt82 = list(cons(makeString("NCNotEqualsConstraintFn"), reader_make_constant_shell("NCEqualsConstraintFn")), cons(makeString("NCNotIsaConstraintFn"), reader_make_constant_shell("NCIsaConstraintFn")), cons(makeString("NCNotGenlsConstraintFn"), reader_make_constant_shell("NCGenlsConstraintFn")));

    static private final SubLList $list_alt85 = list(cons(reader_make_constant_shell("NCPOSConstraintFn"), makeKeyword("POS")), cons(reader_make_constant_shell("NCPOSPredConstraintFn"), $PRED), cons(reader_make_constant_shell("NCEqualsConstraintFn"), makeKeyword("EQL")), cons(reader_make_constant_shell("NCGenlsConstraintFn"), $GENL), cons(reader_make_constant_shell("NCIsaConstraintFn"), makeKeyword("ISA")), cons(reader_make_constant_shell("TheNCHead"), $HEAD), cons(reader_make_constant_shell("TheNCModifier"), makeKeyword("MODIFIER")));

    static private final SubLList $list_alt86 = list(makeSymbol("NEW-CONSTRAINT-TYPE"), makeSymbol("KEYWORD"));

    static private final SubLList $list_alt90 = list(makeKeyword("ISA"), $GENL);

    static private final SubLString $str_alt92$__Passed_all__S_constraints_for__ = makeString("~&Passed all ~S constraints for~% ~S~%");

    static private final SubLSymbol $sym93$RBP_RB_LAYER_EXEMPT_RULE_LAMBDA_ = makeSymbol("RBP-RB-LAYER-EXEMPT-RULE-LAMBDA?");

    static private final SubLString $str_alt94$__The__S_block_s__S_value__S__did = makeString("~%The ~S block\'s ~S value ~S\n did not satisfy the constraints ~S\n on the rule ~S~%~%");

    static private final SubLSymbol $sym100$_TYPE = makeSymbol("?TYPE");

    static private final SubLList $list_alt103 = list(makeSymbol("?SPEC"));

    static private final SubLList $list_alt104 = list(list(reader_make_constant_shell("genls"), makeSymbol("?SPEC"), makeSymbol("?TYPE")));

    static private final SubLSymbol $sym108$_COL = makeSymbol("?COL");

    static private final SubLList $list_alt109 = list(reader_make_constant_shell("and"), list(reader_make_constant_shell("assertedSentence"), list(reader_make_constant_shell("isaConstraintForNCR"), makeSymbol("?RULE"), makeSymbol("?INDEXICAL"), makeSymbol("?COL"))), list(reader_make_constant_shell("genls"), makeSymbol("?COL"), reader_make_constant_shell("CharacterString")));
}

/**
 * Total time: 292 ms
 */
