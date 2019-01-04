package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.BinaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.cycjava.cycl.inference.ask_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class rbp_rule_bank extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.rbp_rule_bank";
    public static final String myFingerPrint = "2d8253fbc35a694810e8de3de5cdc1b3367ea1fdad21efb89f05c7822b41f457";
    @SubLTranslatedFile.SubL(source = "cycl/rbp-rule-bank.lisp", position = 1923L)
    private static SubLSymbol $rbp_rule_bank$;
    @SubLTranslatedFile.SubL(source = "cycl/rbp-rule-bank.lisp", position = 1980L)
    private static SubLSymbol $rbp_rule_index$;
    @SubLTranslatedFile.SubL(source = "cycl/rbp-rule-bank.lisp", position = 2070L)
    private static SubLSymbol $rbp_rb_initializedP$;
    @SubLTranslatedFile.SubL(source = "cycl/rbp-rule-bank.lisp", position = 2224L)
    private static SubLSymbol $rbp_rule_bank_lock$;
    @SubLTranslatedFile.SubL(source = "cycl/rbp-rule-bank.lisp", position = 2419L)
    public static SubLSymbol $rbp_syntactic_constraint_types$;
    @SubLTranslatedFile.SubL(source = "cycl/rbp-rule-bank.lisp", position = 2495L)
    public static SubLSymbol $rbp_semantic_constraint_types$;
    @SubLTranslatedFile.SubL(source = "cycl/rbp-rule-bank.lisp", position = 2581L)
    public static SubLSymbol $rbp_open_class_constraint_types$;
    @SubLTranslatedFile.SubL(source = "cycl/rbp-rule-bank.lisp", position = 2673L)
    public static SubLSymbol $rbp_closed_class_constraint_types$;
    @SubLTranslatedFile.SubL(source = "cycl/rbp-rule-bank.lisp", position = 3644L)
    public static SubLSymbol $rbp_constrained_types$;
    @SubLTranslatedFile.SubL(source = "cycl/rbp-rule-bank.lisp", position = 4492L)
    public static SubLSymbol $dtp_recursive_block_parser_rule$;
    @SubLTranslatedFile.SubL(source = "cycl/rbp-rule-bank.lisp", position = 6823L)
    private static SubLSymbol $rbp_rb_all_rules_sorted_caching_state$;
    @SubLTranslatedFile.SubL(source = "cycl/rbp-rule-bank.lisp", position = 17231L)
    private static SubLSymbol $rbp_term_keyword_map$;
    @SubLTranslatedFile.SubL(source = "cycl/rbp-rule-bank.lisp", position = 21598L)
    private static SubLSymbol $rbp_lambda_layer$;
    @SubLTranslatedFile.SubL(source = "cycl/rbp-rule-bank.lisp", position = 25231L)
    private static SubLSymbol $noun_compound_constraint_string_specs_caching_state$;
    private static final SubLSymbol $sym0$_RBP_RULE_BANK_;
    private static final SubLSymbol $sym1$_RBP_RULE_INDEX_;
    private static final SubLSymbol $sym2$_RBP_RB_INITIALIZED__;
    private static final SubLString $str3$RBP_Rule_Bank_Lock;
    private static final SubLSymbol $sym4$WITH_LOCK_HELD;
    private static final SubLList $list5;
    private static final SubLList $list6;
    private static final SubLList $list7;
    private static final SubLList $list8;
    private static final SubLList $list9;
    private static final SubLList $list10;
    private static final SubLList $list11;
    private static final SubLSymbol $kw12$ALLOW_OTHER_KEYS;
    private static final SubLSymbol $kw13$DONE;
    private static final SubLSymbol $kw14$MODE;
    private static final SubLSymbol $kw15$ALL;
    private static final SubLSymbol $sym16$SYNTACTIC_TYPES;
    private static final SubLSymbol $sym17$SEMANTIC_TYPES;
    private static final SubLSymbol $sym18$OPEN_TYPES;
    private static final SubLSymbol $sym19$CLOSED_TYPES;
    private static final SubLSymbol $sym20$CLET;
    private static final SubLList $list21;
    private static final SubLList $list22;
    private static final SubLList $list23;
    private static final SubLList $list24;
    private static final SubLSymbol $sym25$PWHEN;
    private static final SubLSymbol $sym26$COR;
    private static final SubLList $list27;
    private static final SubLList $list28;
    private static final SubLSymbol $sym29$CSOME;
    private static final SubLList $list30;
    private static final SubLList $list31;
    private static final SubLList $list32;
    private static final SubLList $list33;
    private static final SubLList $list34;
    private static final SubLList $list35;
    private static final SubLList $list36;
    private static final SubLSymbol $sym37$RECURSIVE_BLOCK_PARSER_RULE;
    private static final SubLSymbol $sym38$RECURSIVE_BLOCK_PARSER_RULE_P;
    private static final SubLList $list39;
    private static final SubLList $list40;
    private static final SubLList $list41;
    private static final SubLList $list42;
    private static final SubLSymbol $sym43$PPRINT_RBP_RULE;
    private static final SubLSymbol $sym44$RECURSIVE_BLOCK_PARSER_RULE_PRINT_FUNCTION_TRAMPOLINE;
    private static final SubLList $list45;
    private static final SubLSymbol $sym46$RBP_RULE_CYCL;
    private static final SubLSymbol $sym47$_CSETF_RBP_RULE_CYCL;
    private static final SubLSymbol $sym48$RBP_RULE_FILTER_LAYERS;
    private static final SubLSymbol $sym49$_CSETF_RBP_RULE_FILTER_LAYERS;
    private static final SubLSymbol $kw50$CYCL;
    private static final SubLSymbol $kw51$FILTER_LAYERS;
    private static final SubLString $str52$Invalid_slot__S_for_construction_;
    private static final SubLSymbol $kw53$BEGIN;
    private static final SubLSymbol $sym54$MAKE_RECURSIVE_BLOCK_PARSER_RULE;
    private static final SubLSymbol $kw55$SLOT;
    private static final SubLSymbol $kw56$END;
    private static final SubLSymbol $sym57$VISIT_DEFSTRUCT_OBJECT_RECURSIVE_BLOCK_PARSER_RULE_METHOD;
    private static final SubLString $str58$__RBP_RULE__S_;
    private static final SubLSymbol $sym59$RBP_RB_ALL_RULES_SORTED;
    private static final SubLSymbol $sym60$_RBP_RB_ALL_RULES_SORTED_CACHING_STATE_;
    private static final SubLSymbol $sym61$RBP_RULE__;
    private static final SubLSymbol $kw62$NO_EXCLUSIONS;
    private static final SubLSymbol $kw63$PRED;
    private static final SubLSymbol $sym64$ALL_GENL_PREDS;
    private static final SubLSymbol $kw65$POS;
    private static final SubLSymbol $kw66$GENL;
    private static final SubLSymbol $sym67$RBP_RB_ALL_GENLS;
    private static final SubLSymbol $kw68$TYPE_GENL;
    private static final SubLSymbol $sym69$RBP_RB_ALL_TYPE_GENLS;
    private static final SubLSymbol $kw70$ISA;
    private static final SubLSymbol $sym71$RBP_RB_ALL_ISA;
    private static final SubLSymbol $sym72$LIST;
    private static final SubLInteger $int73$256;
    private static final SubLSymbol $kw74$NOTED;
    private static final SubLSymbol $sym75$RBP_WFF_ISA_;
    private static final SubLSymbol $sym76$NPP_GENL_;
    private static final SubLObject $const77$NounCompoundRule;
    private static final SubLSymbol $kw78$SYNTACTIC;
    private static final SubLSymbol $kw79$SEMANTIC;
    private static final SubLSymbol $kw80$OPEN_CLASS;
    private static final SubLSymbol $kw81$CLOSED_CLASS;
    private static final SubLList $list82;
    private static final SubLSymbol $kw83$EXCLUDE;
    private static final SubLSymbol $sym84$INDEXED_TERM_P;
    private static final SubLObject $const85$ncRuleConstraint;
    private static final SubLList $list86;
    private static final SubLList $list87;
    private static final SubLSymbol $sym88$RBP_FORTS_TO_KEYWORDS;
    private static final SubLSymbol $kw89$UNINITIALIZED;
    private static final SubLList $list90;
    private static final SubLList $list91;
    private static final SubLString $str92$NCWordUnitConstraintFn;
    private static final SubLSymbol $kw93$WU;
    private static final SubLString $str94$NCTypeGenlsConstraintFn;
    private static final SubLList $list95;
    private static final SubLObject $const96$IndeterminateTerm;
    private static final SubLString $str97$__Passed_all__S_constraints_for__;
    private static final SubLSymbol $sym98$RBP_RB_LAYER_EXEMPT_RULE_LAMBDA_;
    private static final SubLString $str99$__The__S_block_s__S_value__S__did;
    private static final SubLSymbol $kw100$ORIGINAL_STRING;
    private static final SubLSymbol $sym101$RELEVANT_MT_IS_EVERYTHING;
    private static final SubLObject $const102$EverythingPSC;
    private static final SubLSymbol $sym103$RBP_RB_KEYS_FROM_BASE_INT;
    private static final SubLObject $const104$CollectionType;
    private static final SubLSymbol $sym105$_TYPE;
    private static final SubLObject $const106$and;
    private static final SubLObject $const107$typeGenls;
    private static final SubLList $list108;
    private static final SubLList $list109;
    private static final SubLObject $const110$PositiveInteger;
    private static final SubLObject $const111$ProperNameString;
    private static final SubLSymbol $sym112$NOUN_COMPOUND_CONSTRAINT_STRING_SPECS;
    private static final SubLSymbol $sym113$_COL;
    private static final SubLList $list114;
    private static final SubLObject $const115$InferencePSC;
    private static final SubLSymbol $sym116$_NOUN_COMPOUND_CONSTRAINT_STRING_SPECS_CACHING_STATE_;
    
    @SubLTranslatedFile.SubL(source = "cycl/rbp-rule-bank.lisp", position = 1786L)
    public static SubLObject rbp_new_rule_bank() {
        return dictionary.new_dictionary(Symbols.symbol_function((SubLObject)rbp_rule_bank.EQUAL), (SubLObject)rbp_rule_bank.SIXTEEN_INTEGER);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rbp-rule-bank.lisp", position = 2116L)
    public static SubLObject note_rbp_rb_initialized() {
        rbp_rule_bank.$rbp_rb_initializedP$.setGlobalValue((SubLObject)rbp_rule_bank.T);
        return rbp_rule_bank.$rbp_rb_initializedP$.getGlobalValue();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rbp-rule-bank.lisp", position = 2299L)
    public static SubLObject with_rbp_rule_bank_lock_held(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return (SubLObject)ConsesLow.listS((SubLObject)rbp_rule_bank.$sym4$WITH_LOCK_HELD, (SubLObject)rbp_rule_bank.$list5, ConsesLow.append(body, (SubLObject)rbp_rule_bank.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rbp-rule-bank.lisp", position = 2747L)
    public static SubLObject do_rbp_constraint_types(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)rbp_rule_bank.$list10);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject type = (SubLObject)rbp_rule_bank.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)rbp_rule_bank.$list10);
        type = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = (SubLObject)rbp_rule_bank.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)rbp_rule_bank.NIL;
        SubLObject current_$1 = (SubLObject)rbp_rule_bank.NIL;
        while (rbp_rule_bank.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)rbp_rule_bank.$list10);
            current_$1 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)rbp_rule_bank.$list10);
            if (rbp_rule_bank.NIL == conses_high.member(current_$1, (SubLObject)rbp_rule_bank.$list11, (SubLObject)rbp_rule_bank.UNPROVIDED, (SubLObject)rbp_rule_bank.UNPROVIDED)) {
                bad = (SubLObject)rbp_rule_bank.T;
            }
            if (current_$1 == rbp_rule_bank.$kw12$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (rbp_rule_bank.NIL != bad && rbp_rule_bank.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)rbp_rule_bank.$list10);
        }
        final SubLObject done_tail = cdestructuring_bind.property_list_member((SubLObject)rbp_rule_bank.$kw13$DONE, current);
        final SubLObject done = (SubLObject)((rbp_rule_bank.NIL != done_tail) ? conses_high.cadr(done_tail) : rbp_rule_bank.NIL);
        final SubLObject mode_tail = cdestructuring_bind.property_list_member((SubLObject)rbp_rule_bank.$kw14$MODE, current);
        final SubLObject mode = (SubLObject)((rbp_rule_bank.NIL != mode_tail) ? conses_high.cadr(mode_tail) : rbp_rule_bank.$kw15$ALL);
        final SubLObject body;
        current = (body = temp);
        final SubLObject syntactic_types = (SubLObject)rbp_rule_bank.$sym16$SYNTACTIC_TYPES;
        final SubLObject semantic_types = (SubLObject)rbp_rule_bank.$sym17$SEMANTIC_TYPES;
        final SubLObject open_types = (SubLObject)rbp_rule_bank.$sym18$OPEN_TYPES;
        final SubLObject closed_types = (SubLObject)rbp_rule_bank.$sym19$CLOSED_TYPES;
        return (SubLObject)ConsesLow.list((SubLObject)rbp_rule_bank.$sym20$CLET, (SubLObject)ConsesLow.list(reader.bq_cons(syntactic_types, (SubLObject)rbp_rule_bank.$list21), reader.bq_cons(semantic_types, (SubLObject)rbp_rule_bank.$list22), reader.bq_cons(open_types, (SubLObject)rbp_rule_bank.$list23), reader.bq_cons(closed_types, (SubLObject)rbp_rule_bank.$list24)), (SubLObject)ConsesLow.list((SubLObject)rbp_rule_bank.$sym25$PWHEN, (SubLObject)ConsesLow.list((SubLObject)rbp_rule_bank.$sym26$COR, (SubLObject)ConsesLow.listS((SubLObject)rbp_rule_bank.EQL, mode, (SubLObject)rbp_rule_bank.$list27), (SubLObject)ConsesLow.listS((SubLObject)rbp_rule_bank.EQL, mode, (SubLObject)rbp_rule_bank.$list28)), (SubLObject)ConsesLow.listS((SubLObject)rbp_rule_bank.$sym29$CSOME, (SubLObject)ConsesLow.list(type, syntactic_types, done), ConsesLow.append(body, (SubLObject)rbp_rule_bank.NIL))), (SubLObject)ConsesLow.list((SubLObject)rbp_rule_bank.$sym25$PWHEN, (SubLObject)ConsesLow.list((SubLObject)rbp_rule_bank.$sym26$COR, (SubLObject)ConsesLow.listS((SubLObject)rbp_rule_bank.EQL, mode, (SubLObject)rbp_rule_bank.$list27), (SubLObject)ConsesLow.listS((SubLObject)rbp_rule_bank.EQL, mode, (SubLObject)rbp_rule_bank.$list30)), (SubLObject)ConsesLow.listS((SubLObject)rbp_rule_bank.$sym29$CSOME, (SubLObject)ConsesLow.list(type, semantic_types, done), ConsesLow.append(body, (SubLObject)rbp_rule_bank.NIL))), (SubLObject)ConsesLow.list((SubLObject)rbp_rule_bank.$sym25$PWHEN, (SubLObject)ConsesLow.listS((SubLObject)rbp_rule_bank.EQL, mode, (SubLObject)rbp_rule_bank.$list31), (SubLObject)ConsesLow.listS((SubLObject)rbp_rule_bank.$sym29$CSOME, (SubLObject)ConsesLow.list(type, open_types, done), ConsesLow.append(body, (SubLObject)rbp_rule_bank.NIL))), (SubLObject)ConsesLow.list((SubLObject)rbp_rule_bank.$sym25$PWHEN, (SubLObject)ConsesLow.listS((SubLObject)rbp_rule_bank.EQL, mode, (SubLObject)rbp_rule_bank.$list32), (SubLObject)ConsesLow.listS((SubLObject)rbp_rule_bank.$sym29$CSOME, (SubLObject)ConsesLow.list(type, closed_types, done), ConsesLow.append(body, (SubLObject)rbp_rule_bank.NIL))));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rbp-rule-bank.lisp", position = 3714L)
    public static SubLObject rbp_syntactic_constraint_type_p(final SubLObject v_object) {
        return subl_promotions.memberP(v_object, rbp_rule_bank.$rbp_syntactic_constraint_types$.getGlobalValue(), (SubLObject)rbp_rule_bank.UNPROVIDED, (SubLObject)rbp_rule_bank.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rbp-rule-bank.lisp", position = 3833L)
    public static SubLObject rbp_semantic_constraint_type_p(final SubLObject v_object) {
        return subl_promotions.memberP(v_object, rbp_rule_bank.$rbp_semantic_constraint_types$.getGlobalValue(), (SubLObject)rbp_rule_bank.UNPROVIDED, (SubLObject)rbp_rule_bank.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rbp-rule-bank.lisp", position = 3950L)
    public static SubLObject rbp_syntactic_constraint_p(final SubLObject v_object) {
        return formula_pattern_match.formula_matches_pattern(v_object, (SubLObject)rbp_rule_bank.$list34);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rbp-rule-bank.lisp", position = 4112L)
    public static SubLObject rbp_word_unit_constraint_p(final SubLObject v_object) {
        return formula_pattern_match.formula_matches_pattern(v_object, (SubLObject)rbp_rule_bank.$list35);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rbp-rule-bank.lisp", position = 4238L)
    public static SubLObject rbp_semantic_constraint_p(final SubLObject v_object) {
        return formula_pattern_match.formula_matches_pattern(v_object, (SubLObject)rbp_rule_bank.$list36);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rbp-rule-bank.lisp", position = 4492L)
    public static SubLObject recursive_block_parser_rule_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        pprint_rbp_rule(v_object, stream, (SubLObject)rbp_rule_bank.ZERO_INTEGER);
        return (SubLObject)rbp_rule_bank.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rbp-rule-bank.lisp", position = 4492L)
    public static SubLObject recursive_block_parser_rule_p(final SubLObject v_object) {
        return (SubLObject)((v_object.getClass() == $recursive_block_parser_rule_native.class) ? rbp_rule_bank.T : rbp_rule_bank.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rbp-rule-bank.lisp", position = 4492L)
    public static SubLObject rbp_rule_cycl(final SubLObject v_object) {
        assert rbp_rule_bank.NIL != recursive_block_parser_rule_p(v_object) : v_object;
        return v_object.getField2();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rbp-rule-bank.lisp", position = 4492L)
    public static SubLObject rbp_rule_filter_layers(final SubLObject v_object) {
        assert rbp_rule_bank.NIL != recursive_block_parser_rule_p(v_object) : v_object;
        return v_object.getField3();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rbp-rule-bank.lisp", position = 4492L)
    public static SubLObject _csetf_rbp_rule_cycl(final SubLObject v_object, final SubLObject value) {
        assert rbp_rule_bank.NIL != recursive_block_parser_rule_p(v_object) : v_object;
        return v_object.setField2(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rbp-rule-bank.lisp", position = 4492L)
    public static SubLObject _csetf_rbp_rule_filter_layers(final SubLObject v_object, final SubLObject value) {
        assert rbp_rule_bank.NIL != recursive_block_parser_rule_p(v_object) : v_object;
        return v_object.setField3(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rbp-rule-bank.lisp", position = 4492L)
    public static SubLObject make_recursive_block_parser_rule(SubLObject arglist) {
        if (arglist == rbp_rule_bank.UNPROVIDED) {
            arglist = (SubLObject)rbp_rule_bank.NIL;
        }
        final SubLObject v_new = (SubLObject)new $recursive_block_parser_rule_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = (SubLObject)rbp_rule_bank.NIL, next = arglist; rbp_rule_bank.NIL != next; next = conses_high.cddr(next)) {
            current_arg = next.first();
            current_value = conses_high.cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql((SubLObject)rbp_rule_bank.$kw50$CYCL)) {
                _csetf_rbp_rule_cycl(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)rbp_rule_bank.$kw51$FILTER_LAYERS)) {
                _csetf_rbp_rule_filter_layers(v_new, current_value);
            }
            else {
                Errors.error((SubLObject)rbp_rule_bank.$str52$Invalid_slot__S_for_construction_, current_arg);
            }
        }
        return v_new;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rbp-rule-bank.lisp", position = 4492L)
    public static SubLObject visit_defstruct_recursive_block_parser_rule(final SubLObject obj, final SubLObject visitor_fn) {
        Functions.funcall(visitor_fn, obj, (SubLObject)rbp_rule_bank.$kw53$BEGIN, (SubLObject)rbp_rule_bank.$sym54$MAKE_RECURSIVE_BLOCK_PARSER_RULE, (SubLObject)rbp_rule_bank.TWO_INTEGER);
        Functions.funcall(visitor_fn, obj, (SubLObject)rbp_rule_bank.$kw55$SLOT, (SubLObject)rbp_rule_bank.$kw50$CYCL, rbp_rule_cycl(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)rbp_rule_bank.$kw55$SLOT, (SubLObject)rbp_rule_bank.$kw51$FILTER_LAYERS, rbp_rule_filter_layers(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)rbp_rule_bank.$kw56$END, (SubLObject)rbp_rule_bank.$sym54$MAKE_RECURSIVE_BLOCK_PARSER_RULE, (SubLObject)rbp_rule_bank.TWO_INTEGER);
        return obj;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rbp-rule-bank.lisp", position = 4492L)
    public static SubLObject visit_defstruct_object_recursive_block_parser_rule_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_recursive_block_parser_rule(obj, visitor_fn);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rbp-rule-bank.lisp", position = 4765L)
    public static SubLObject pprint_rbp_rule(final SubLObject rbp_rule, SubLObject stream, SubLObject depth) {
        if (stream == rbp_rule_bank.UNPROVIDED) {
            stream = (SubLObject)rbp_rule_bank.NIL;
        }
        if (depth == rbp_rule_bank.UNPROVIDED) {
            depth = (SubLObject)rbp_rule_bank.NIL;
        }
        PrintLow.format(stream, (SubLObject)rbp_rule_bank.$str58$__RBP_RULE__S_, rbp_rule_cycl(rbp_rule));
        return rbp_rule;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rbp-rule-bank.lisp", position = 4927L)
    public static SubLObject new_rbp_rule(final SubLObject cycl) {
        final SubLObject rule = make_recursive_block_parser_rule((SubLObject)ConsesLow.list((SubLObject)rbp_rule_bank.$kw50$CYCL, cycl, (SubLObject)rbp_rule_bank.$kw51$FILTER_LAYERS, set.new_set(Symbols.symbol_function((SubLObject)rbp_rule_bank.EQL), (SubLObject)rbp_rule_bank.UNPROVIDED)));
        rbp_rule_note_cycl(rule, cycl);
        return rule;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rbp-rule-bank.lisp", position = 5129L)
    public static SubLObject rbp_rule_note_cycl(final SubLObject rbp_rule, final SubLObject cycl) {
        return dictionary.dictionary_enter(rbp_rule_bank.$rbp_rule_index$.getGlobalValue(), cycl, rbp_rule);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rbp-rule-bank.lisp", position = 5240L)
    public static SubLObject rbp_find_or_create_rule_from_cycl(final SubLObject rule_cycl) {
        final SubLObject found = rbp_find_rule_from_cycl(rule_cycl, (SubLObject)rbp_rule_bank.NIL);
        return (rbp_rule_bank.NIL != recursive_block_parser_rule_p(found)) ? found : new_rbp_rule(rule_cycl);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rbp-rule-bank.lisp", position = 5522L)
    public static SubLObject rbp_find_rule_from_cycl(final SubLObject rule_cycl, SubLObject check_initializationP) {
        if (check_initializationP == rbp_rule_bank.UNPROVIDED) {
            check_initializationP = (SubLObject)rbp_rule_bank.T;
        }
        if (rbp_rule_bank.NIL != check_initializationP) {
            rbp_rb_check_initialization();
        }
        return dictionary.dictionary_lookup(rbp_rule_bank.$rbp_rule_index$.getGlobalValue(), narts_high.nart_substitute(rule_cycl), (SubLObject)rbp_rule_bank.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rbp-rule-bank.lisp", position = 5811L)
    public static SubLObject rbp_find_rule_from_cycl_w_initialized_rb(final SubLObject rule_cycl) {
        rbp_rb_check_initialization();
        return rbp_find_rule_from_cycl(rule_cycl, (SubLObject)rbp_rule_bank.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rbp-rule-bank.lisp", position = 6018L)
    public static SubLObject rbp_find_cycl_from_rule(final SubLObject rule) {
        return dictionary_utilities.dictionary_reverse_lookup(rbp_rule_bank.$rbp_rule_index$.getGlobalValue(), rule, (SubLObject)rbp_rule_bank.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rbp-rule-bank.lisp", position = 6190L)
    public static SubLObject rbp_rb_filters() {
        return rbp_rule_bank.$rbp_rule_bank$.getGlobalValue();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rbp-rule-bank.lisp", position = 6333L)
    public static SubLObject rbp_rb_add_filter(final SubLObject filter, final SubLObject filter_key) {
        return dictionary.dictionary_enter(rbp_rb_filters(), filter_key, filter);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rbp-rule-bank.lisp", position = 6451L)
    public static SubLObject rbp_rb_rule_count() {
        SubLObject count = (SubLObject)rbp_rule_bank.NIL;
        SubLObject release = (SubLObject)rbp_rule_bank.NIL;
        try {
            release = Locks.seize_lock(rbp_rule_bank.$rbp_rule_bank_lock$.getGlobalValue());
            count = dictionary.dictionary_length(rbp_rule_bank.$rbp_rule_index$.getGlobalValue());
        }
        finally {
            if (rbp_rule_bank.NIL != release) {
                Locks.release_lock(rbp_rule_bank.$rbp_rule_bank_lock$.getGlobalValue());
            }
        }
        return count;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rbp-rule-bank.lisp", position = 6658L)
    public static SubLObject rbp_rb_all_rules() {
        SubLObject rules = (SubLObject)rbp_rule_bank.NIL;
        SubLObject release = (SubLObject)rbp_rule_bank.NIL;
        try {
            release = Locks.seize_lock(rbp_rule_bank.$rbp_rule_bank_lock$.getGlobalValue());
            rules = dictionary.dictionary_values(rbp_rule_bank.$rbp_rule_index$.getGlobalValue());
        }
        finally {
            if (rbp_rule_bank.NIL != release) {
                Locks.release_lock(rbp_rule_bank.$rbp_rule_bank_lock$.getGlobalValue());
            }
        }
        return rules;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rbp-rule-bank.lisp", position = 6823L)
    public static SubLObject clear_rbp_rb_all_rules_sorted() {
        final SubLObject cs = rbp_rule_bank.$rbp_rb_all_rules_sorted_caching_state$.getGlobalValue();
        if (rbp_rule_bank.NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return (SubLObject)rbp_rule_bank.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rbp-rule-bank.lisp", position = 6823L)
    public static SubLObject remove_rbp_rb_all_rules_sorted() {
        return memoization_state.caching_state_remove_function_results_with_args(rbp_rule_bank.$rbp_rb_all_rules_sorted_caching_state$.getGlobalValue(), (SubLObject)ConsesLow.list(rbp_rule_bank.EMPTY_SUBL_OBJECT_ARRAY), (SubLObject)rbp_rule_bank.UNPROVIDED, (SubLObject)rbp_rule_bank.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rbp-rule-bank.lisp", position = 6823L)
    public static SubLObject rbp_rb_all_rules_sorted_internal() {
        return sort_rbp_rules(rbp_rb_all_rules());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rbp-rule-bank.lisp", position = 6823L)
    public static SubLObject rbp_rb_all_rules_sorted() {
        SubLObject caching_state = rbp_rule_bank.$rbp_rb_all_rules_sorted_caching_state$.getGlobalValue();
        if (rbp_rule_bank.NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name((SubLObject)rbp_rule_bank.$sym59$RBP_RB_ALL_RULES_SORTED, (SubLObject)rbp_rule_bank.$sym60$_RBP_RB_ALL_RULES_SORTED_CACHING_STATE_, (SubLObject)rbp_rule_bank.NIL, (SubLObject)rbp_rule_bank.EQL, (SubLObject)rbp_rule_bank.ZERO_INTEGER, (SubLObject)rbp_rule_bank.ZERO_INTEGER);
        }
        SubLObject results = memoization_state.caching_state_get_zero_arg_results(caching_state, (SubLObject)rbp_rule_bank.UNPROVIDED);
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(rbp_rb_all_rules_sorted_internal()));
            memoization_state.caching_state_set_zero_arg_results(caching_state, results, (SubLObject)rbp_rule_bank.UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rbp-rule-bank.lisp", position = 6920L)
    public static SubLObject sort_rbp_rules(final SubLObject rules) {
        return Sort.sort(rules, (SubLObject)rbp_rule_bank.$sym61$RBP_RULE__, (SubLObject)rbp_rule_bank.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rbp-rule-bank.lisp", position = 6994L)
    public static SubLObject rbp_rule_L(final SubLObject rule1, final SubLObject rule2) {
        return kb_utilities.term_L(rbp_rule_cycl(rule1), rbp_rule_cycl(rule2), (SubLObject)rbp_rule_bank.NIL, (SubLObject)rbp_rule_bank.NIL, (SubLObject)rbp_rule_bank.T);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rbp-rule-bank.lisp", position = 7108L)
    public static SubLObject rbp_rules_sortedP(final SubLObject rules) {
        SubLObject problemP = (SubLObject)rbp_rule_bank.NIL;
        final SubLObject prev = (SubLObject)rbp_rule_bank.NIL;
        if (rbp_rule_bank.NIL == problemP) {
            SubLObject csome_list_var;
            SubLObject rule;
            for (csome_list_var = rules, rule = (SubLObject)rbp_rule_bank.NIL, rule = csome_list_var.first(); rbp_rule_bank.NIL == problemP && rbp_rule_bank.NIL != csome_list_var; problemP = (SubLObject)SubLObjectFactory.makeBoolean(rbp_rule_bank.NIL != prev && rbp_rule_bank.NIL == rbp_rule_L(prev, rule)), csome_list_var = csome_list_var.rest(), rule = csome_list_var.first()) {}
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(rbp_rule_bank.NIL == problemP);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rbp-rule-bank.lisp", position = 7322L)
    public static SubLObject rbp_rb_new_filter(final SubLObject filter_key) {
        return (SubLObject)ConsesLow.list(set_utilities.new_singleton_set(rbp_rb_new_layer(), Symbols.symbol_function((SubLObject)rbp_rule_bank.EQUAL)), (SubLObject)rbp_rule_bank.$kw62$NO_EXCLUSIONS, rbp_rb_fn_for_filter_key(filter_key));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rbp-rule-bank.lisp", position = 7536L)
    public static SubLObject rbp_rb_filter_layers_set(final SubLObject filter) {
        return filter.first();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rbp-rule-bank.lisp", position = 7611L)
    public static SubLObject rbp_rb_filter_exclusions_layer(final SubLObject filter) {
        return conses_high.second(filter);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rbp-rule-bank.lisp", position = 7693L)
    public static SubLObject rbp_rb_filter_has_exclusions_p(final SubLObject filter) {
        return dictionary.dictionary_p(rbp_rb_filter_exclusions_layer(filter));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rbp-rule-bank.lisp", position = 7814L)
    public static SubLObject rbp_rb_filter_layers_list(final SubLObject filter) {
        return set.set_element_list(rbp_rb_filter_layers_set(filter));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rbp-rule-bank.lisp", position = 7928L)
    public static SubLObject rbp_rb_filter_add_layer(final SubLObject filter, final SubLObject new_layer) {
        return set.set_add(new_layer, rbp_rb_filter_layers_set(filter));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rbp-rule-bank.lisp", position = 8051L)
    public static SubLObject rbp_rb_filter_add_excluded_value(final SubLObject filter, final SubLObject v_term, final SubLObject rbp_rule) {
        SubLObject exclusions_layer = rbp_rb_filter_exclusions_layer(filter);
        if (rbp_rule_bank.NIL == dictionary.dictionary_p(exclusions_layer)) {
            exclusions_layer = rbp_rb_new_layer();
            ConsesLow.set_nth((SubLObject)rbp_rule_bank.ONE_INTEGER, filter, exclusions_layer);
        }
        rbp_rb_layer_add_excluded_value(exclusions_layer, v_term, rbp_rule);
        return filter;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rbp-rule-bank.lisp", position = 8417L)
    public static SubLObject rbp_rb_find_or_create_filter_for_key(final SubLObject filter_key) {
        SubLObject filter = dictionary.dictionary_lookup(rbp_rb_filters(), filter_key, (SubLObject)rbp_rule_bank.UNPROVIDED);
        if (rbp_rule_bank.NIL == filter) {
            filter = rbp_rb_new_filter(filter_key);
            rbp_rb_add_filter(filter, filter_key);
        }
        return filter;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rbp-rule-bank.lisp", position = 8687L)
    public static SubLObject rbp_rb_fn_for_filter_key(final SubLObject filter_key) {
        final SubLObject pcase_var = filter_key.first();
        if (pcase_var.eql((SubLObject)rbp_rule_bank.$kw63$PRED)) {
            return (SubLObject)rbp_rule_bank.$sym64$ALL_GENL_PREDS;
        }
        if (pcase_var.eql((SubLObject)rbp_rule_bank.$kw65$POS) || pcase_var.eql((SubLObject)rbp_rule_bank.$kw66$GENL)) {
            return (SubLObject)rbp_rule_bank.$sym67$RBP_RB_ALL_GENLS;
        }
        if (pcase_var.eql((SubLObject)rbp_rule_bank.$kw68$TYPE_GENL)) {
            return (SubLObject)rbp_rule_bank.$sym69$RBP_RB_ALL_TYPE_GENLS;
        }
        if (pcase_var.eql((SubLObject)rbp_rule_bank.$kw70$ISA)) {
            return (SubLObject)rbp_rule_bank.$sym71$RBP_RB_ALL_ISA;
        }
        return (SubLObject)rbp_rule_bank.$sym72$LIST;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rbp-rule-bank.lisp", position = 8978L)
    public static SubLObject rbp_rb_new_layer() {
        return dictionary.new_dictionary(Symbols.symbol_function((SubLObject)rbp_rule_bank.EQUALP), (SubLObject)rbp_rule_bank.$int73$256);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rbp-rule-bank.lisp", position = 9084L)
    public static SubLObject rbp_rb_layer_dictionary(final SubLObject layer) {
        return layer;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rbp-rule-bank.lisp", position = 9148L)
    public static SubLObject rbp_rb_layer_note_rule_to_check(final SubLObject layer, final SubLObject rbp_rule) {
        set.set_add(layer, rbp_rule_filter_layers(rbp_rule));
        return (SubLObject)rbp_rule_bank.$kw74$NOTED;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rbp-rule-bank.lisp", position = 9282L)
    public static SubLObject rbp_rb_layer_exempt_ruleP(final SubLObject layer, final SubLObject rule) {
        return (SubLObject)SubLObjectFactory.makeBoolean(rbp_rule_bank.NIL == set.set_memberP(layer, rbp_rule_filter_layers(rule)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rbp-rule-bank.lisp", position = 9404L)
    public static SubLObject rbp_rb_layer_search(final SubLObject keys_to_check, final SubLObject layer) {
        final SubLObject v_dictionary = rbp_rb_layer_dictionary(layer);
        SubLObject hits = (SubLObject)rbp_rule_bank.NIL;
        SubLObject cdolist_list_var = keys_to_check;
        SubLObject key = (SubLObject)rbp_rule_bank.NIL;
        key = cdolist_list_var.first();
        while (rbp_rule_bank.NIL != cdolist_list_var) {
            SubLObject cdolist_list_var_$2 = rbp_rb_layer_search_one(key, v_dictionary);
            SubLObject hit = (SubLObject)rbp_rule_bank.NIL;
            hit = cdolist_list_var_$2.first();
            while (rbp_rule_bank.NIL != cdolist_list_var_$2) {
                final SubLObject item_var = hit;
                if (rbp_rule_bank.NIL == conses_high.member(item_var, hits, Symbols.symbol_function((SubLObject)rbp_rule_bank.EQL), Symbols.symbol_function((SubLObject)rbp_rule_bank.IDENTITY))) {
                    hits = (SubLObject)ConsesLow.cons(item_var, hits);
                }
                cdolist_list_var_$2 = cdolist_list_var_$2.rest();
                hit = cdolist_list_var_$2.first();
            }
            cdolist_list_var = cdolist_list_var.rest();
            key = cdolist_list_var.first();
        }
        return sort_rbp_rules(hits);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rbp-rule-bank.lisp", position = 9825L)
    public static SubLObject rbp_rb_layer_search_indeterminate(final SubLObject indeterminate_term, final SubLObject c_type, final SubLObject layer) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_dictionary = rbp_rb_layer_dictionary(layer);
        SubLObject hits = (SubLObject)rbp_rule_bank.NIL;
        SubLObject iteration_state;
        for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(v_dictionary)); rbp_rule_bank.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
            thread.resetMultipleValues();
            final SubLObject key = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
            final SubLObject rules = thread.secondMultipleValue();
            thread.resetMultipleValues();
            SubLObject okP = (SubLObject)rbp_rule_bank.NIL;
            final SubLObject key_defining_mts = rbp_wff.rbp_defining_mts((SubLObject)ConsesLow.list(indeterminate_term, key));
            if (rbp_rule_bank.NIL == okP) {
                SubLObject csome_list_var = key_defining_mts;
                SubLObject mt = (SubLObject)rbp_rule_bank.NIL;
                mt = csome_list_var.first();
                while (rbp_rule_bank.NIL == okP && rbp_rule_bank.NIL != csome_list_var) {
                    if (c_type.eql((SubLObject)rbp_rule_bank.$kw70$ISA)) {
                        if (rbp_rule_bank.NIL == rbp_wff.rbp_wff_test_failsP((SubLObject)rbp_rule_bank.$sym75$RBP_WFF_ISA_, indeterminate_term, key, mt)) {
                            okP = (SubLObject)rbp_rule_bank.T;
                        }
                    }
                    else if (c_type.eql((SubLObject)rbp_rule_bank.$kw66$GENL) && rbp_rule_bank.NIL == rbp_wff.rbp_wff_test_failsP((SubLObject)rbp_rule_bank.$sym76$NPP_GENL_, indeterminate_term, key, (SubLObject)rbp_rule_bank.UNPROVIDED)) {
                        okP = (SubLObject)rbp_rule_bank.T;
                    }
                    csome_list_var = csome_list_var.rest();
                    mt = csome_list_var.first();
                }
            }
            if (rbp_rule_bank.NIL != okP) {
                SubLObject cdolist_list_var = rules;
                SubLObject rule = (SubLObject)rbp_rule_bank.NIL;
                rule = cdolist_list_var.first();
                while (rbp_rule_bank.NIL != cdolist_list_var) {
                    final SubLObject item_var = rule;
                    if (rbp_rule_bank.NIL == conses_high.member(item_var, hits, Symbols.symbol_function((SubLObject)rbp_rule_bank.EQL), Symbols.symbol_function((SubLObject)rbp_rule_bank.IDENTITY))) {
                        hits = (SubLObject)ConsesLow.cons(item_var, hits);
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    rule = cdolist_list_var.first();
                }
            }
        }
        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
        return sort_rbp_rules(hits);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rbp-rule-bank.lisp", position = 10652L)
    public static SubLObject rbp_rb_layer_search_one(final SubLObject key, final SubLObject v_dictionary) {
        return dictionary.dictionary_lookup(v_dictionary, key, (SubLObject)rbp_rule_bank.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rbp-rule-bank.lisp", position = 10859L)
    public static SubLObject rbp_rb_layer_note_value(final SubLObject layer, final SubLObject v_term, final SubLObject rbp_rule) {
        final SubLObject fort = function_terms.naut_to_nart(v_term);
        final SubLObject v_dictionary = rbp_rb_layer_dictionary(layer);
        dictionary_utilities.dictionary_push(v_dictionary, fort, rbp_rule);
        rbp_rb_layer_note_rule_to_check(layer, rbp_rule);
        return layer;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rbp-rule-bank.lisp", position = 11120L)
    public static SubLObject rbp_rb_layer_add_ok_value(final SubLObject layer, final SubLObject v_term, final SubLObject rbp_rule) {
        return rbp_rb_layer_note_value(layer, v_term, rbp_rule);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rbp-rule-bank.lisp", position = 11326L)
    public static SubLObject rbp_rb_layer_add_excluded_value(final SubLObject layer, final SubLObject v_term, final SubLObject rbp_rule) {
        return rbp_rb_layer_note_value(layer, v_term, rbp_rule);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rbp-rule-bank.lisp", position = 11542L)
    public static SubLObject rbp_rb_check_initialization() {
        SubLObject initializedP = (SubLObject)rbp_rule_bank.NIL;
        SubLObject release = (SubLObject)rbp_rule_bank.NIL;
        try {
            release = Locks.seize_lock(rbp_rule_bank.$rbp_rule_bank_lock$.getGlobalValue());
            initializedP = rbp_rule_bank.$rbp_rb_initializedP$.getGlobalValue();
        }
        finally {
            if (rbp_rule_bank.NIL != release) {
                Locks.release_lock(rbp_rule_bank.$rbp_rule_bank_lock$.getGlobalValue());
            }
        }
        if (rbp_rule_bank.NIL == initializedP) {
            rbp_rb_initialize();
        }
        return rbp_rb_rule_count();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rbp-rule-bank.lisp", position = 11934L)
    public static SubLObject rbp_clear_rule_bank() {
        SubLObject release = (SubLObject)rbp_rule_bank.NIL;
        try {
            release = Locks.seize_lock(rbp_rule_bank.$rbp_rule_bank_lock$.getGlobalValue());
            rbp_clear_rule_bank_internal();
        }
        finally {
            if (rbp_rule_bank.NIL != release) {
                Locks.release_lock(rbp_rule_bank.$rbp_rule_bank_lock$.getGlobalValue());
            }
        }
        return rbp_rb_rule_count();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rbp-rule-bank.lisp", position = 12193L)
    public static SubLObject rbp_clear_rule_bank_internal() {
        rbp_rule_bank.$rbp_rb_initializedP$.setGlobalValue((SubLObject)rbp_rule_bank.NIL);
        rbp_rule_bank.$rbp_rule_bank$.setGlobalValue(rbp_new_rule_bank());
        dictionary.clear_dictionary(rbp_rule_bank.$rbp_rule_index$.getGlobalValue());
        clear_rbp_rb_all_rules_sorted();
        noun_compound_parser.clear_rbp_rb_rules_matching_closed_specs();
        noun_compound_parser.rbp_untrace_all_rules();
        psp_main.clear_psp_caches();
        return rbp_rb_rule_count();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rbp-rule-bank.lisp", position = 12582L)
    public static SubLObject rbp_rb_initialize() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject release = (SubLObject)rbp_rule_bank.NIL;
        try {
            release = Locks.seize_lock(rbp_rule_bank.$rbp_rule_bank_lock$.getGlobalValue());
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
                final SubLObject rules = cdolist_list_var = isa.all_fort_instances(rbp_rule_bank.$const77$NounCompoundRule, (SubLObject)rbp_rule_bank.UNPROVIDED, (SubLObject)rbp_rule_bank.UNPROVIDED);
                SubLObject rule = (SubLObject)rbp_rule_bank.NIL;
                rule = cdolist_list_var.first();
                while (rbp_rule_bank.NIL != cdolist_list_var) {
                    rbp_rb_update(rule);
                    cdolist_list_var = cdolist_list_var.rest();
                    rule = cdolist_list_var.first();
                }
            }
            finally {
                mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
            }
            note_rbp_rb_initialized();
        }
        finally {
            if (rbp_rule_bank.NIL != release) {
                Locks.release_lock(rbp_rule_bank.$rbp_rule_bank_lock$.getGlobalValue());
            }
        }
        return rbp_rb_rule_count();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rbp-rule-bank.lisp", position = 12986L)
    public static SubLObject rbp_rb_update(final SubLObject rule_cycl) {
        if (rbp_rule_bank.NIL == noun_compound_parser.rbp_rule_okP(rule_cycl)) {
            return (SubLObject)rbp_rule_bank.NIL;
        }
        rbp_rb_update_all_filters(rule_cycl);
        return rbp_rule_bank.$rbp_rule_bank$.getGlobalValue();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rbp-rule-bank.lisp", position = 13305L)
    public static SubLObject rbp_rb_update_all_filters(final SubLObject rule_cycl) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject rule_term_table = rbp_rb_rule_term_table(rule_cycl);
        final SubLObject syntactic_types = rbp_rule_bank.$rbp_syntactic_constraint_types$.getGlobalValue();
        final SubLObject semantic_types = rbp_rule_bank.$rbp_semantic_constraint_types$.getGlobalValue();
        final SubLObject open_types = rbp_rule_bank.$rbp_open_class_constraint_types$.getGlobalValue();
        final SubLObject closed_types = rbp_rule_bank.$rbp_closed_class_constraint_types$.getGlobalValue();
        if (rbp_rule_bank.$kw15$ALL.eql((SubLObject)rbp_rule_bank.$kw15$ALL) || rbp_rule_bank.$kw15$ALL.eql((SubLObject)rbp_rule_bank.$kw78$SYNTACTIC)) {
            SubLObject csome_list_var = syntactic_types;
            SubLObject c_type = (SubLObject)rbp_rule_bank.NIL;
            c_type = csome_list_var.first();
            while (rbp_rule_bank.NIL != csome_list_var) {
                SubLObject cdolist_list_var = rbp_rule_bank.$rbp_constrained_types$.getDynamicValue(thread);
                SubLObject o_type = (SubLObject)rbp_rule_bank.NIL;
                o_type = cdolist_list_var.first();
                while (rbp_rule_bank.NIL != cdolist_list_var) {
                    final SubLObject filter_key = (SubLObject)ConsesLow.list(c_type, o_type);
                    rbp_rb_update_filter(filter_key, rule_cycl, rule_term_table);
                    cdolist_list_var = cdolist_list_var.rest();
                    o_type = cdolist_list_var.first();
                }
                csome_list_var = csome_list_var.rest();
                c_type = csome_list_var.first();
            }
        }
        if (rbp_rule_bank.$kw15$ALL.eql((SubLObject)rbp_rule_bank.$kw15$ALL) || rbp_rule_bank.$kw15$ALL.eql((SubLObject)rbp_rule_bank.$kw79$SEMANTIC)) {
            SubLObject csome_list_var = semantic_types;
            SubLObject c_type = (SubLObject)rbp_rule_bank.NIL;
            c_type = csome_list_var.first();
            while (rbp_rule_bank.NIL != csome_list_var) {
                SubLObject cdolist_list_var = rbp_rule_bank.$rbp_constrained_types$.getDynamicValue(thread);
                SubLObject o_type = (SubLObject)rbp_rule_bank.NIL;
                o_type = cdolist_list_var.first();
                while (rbp_rule_bank.NIL != cdolist_list_var) {
                    final SubLObject filter_key = (SubLObject)ConsesLow.list(c_type, o_type);
                    rbp_rb_update_filter(filter_key, rule_cycl, rule_term_table);
                    cdolist_list_var = cdolist_list_var.rest();
                    o_type = cdolist_list_var.first();
                }
                csome_list_var = csome_list_var.rest();
                c_type = csome_list_var.first();
            }
        }
        if (rbp_rule_bank.$kw15$ALL.eql((SubLObject)rbp_rule_bank.$kw80$OPEN_CLASS)) {
            SubLObject csome_list_var = open_types;
            SubLObject c_type = (SubLObject)rbp_rule_bank.NIL;
            c_type = csome_list_var.first();
            while (rbp_rule_bank.NIL != csome_list_var) {
                SubLObject cdolist_list_var = rbp_rule_bank.$rbp_constrained_types$.getDynamicValue(thread);
                SubLObject o_type = (SubLObject)rbp_rule_bank.NIL;
                o_type = cdolist_list_var.first();
                while (rbp_rule_bank.NIL != cdolist_list_var) {
                    final SubLObject filter_key = (SubLObject)ConsesLow.list(c_type, o_type);
                    rbp_rb_update_filter(filter_key, rule_cycl, rule_term_table);
                    cdolist_list_var = cdolist_list_var.rest();
                    o_type = cdolist_list_var.first();
                }
                csome_list_var = csome_list_var.rest();
                c_type = csome_list_var.first();
            }
        }
        if (rbp_rule_bank.$kw15$ALL.eql((SubLObject)rbp_rule_bank.$kw81$CLOSED_CLASS)) {
            SubLObject csome_list_var = closed_types;
            SubLObject c_type = (SubLObject)rbp_rule_bank.NIL;
            c_type = csome_list_var.first();
            while (rbp_rule_bank.NIL != csome_list_var) {
                SubLObject cdolist_list_var = rbp_rule_bank.$rbp_constrained_types$.getDynamicValue(thread);
                SubLObject o_type = (SubLObject)rbp_rule_bank.NIL;
                o_type = cdolist_list_var.first();
                while (rbp_rule_bank.NIL != cdolist_list_var) {
                    final SubLObject filter_key = (SubLObject)ConsesLow.list(c_type, o_type);
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
    
    @SubLTranslatedFile.SubL(source = "cycl/rbp-rule-bank.lisp", position = 13645L)
    public static SubLObject rbp_rb_update_filter(final SubLObject filter_key, final SubLObject rule_cycl, SubLObject table) {
        if (table == rbp_rule_bank.UNPROVIDED) {
            table = (SubLObject)rbp_rule_bank.NIL;
        }
        final SubLObject filter = rbp_rb_find_or_create_filter_for_key(filter_key);
        final SubLObject filter_layers = rbp_rb_filter_layers_list(filter);
        final SubLObject rule_term_table = (rbp_rule_bank.NIL != table) ? table : rbp_rb_rule_term_table(rule_cycl);
        final SubLObject values = rbp_rb_rule_term_table_lookup(rule_term_table, filter_key);
        final SubLObject rbp_rule = rbp_find_or_create_rule_from_cycl(rule_cycl);
        SubLObject new_layers = (SubLObject)rbp_rule_bank.NIL;
        SubLObject value = (SubLObject)rbp_rule_bank.NIL;
        SubLObject value_$3 = (SubLObject)rbp_rule_bank.NIL;
        SubLObject this_layer = (SubLObject)rbp_rule_bank.NIL;
        SubLObject this_layer_$4 = (SubLObject)rbp_rule_bank.NIL;
        value = values;
        value_$3 = value.first();
        this_layer = filter_layers;
        this_layer_$4 = this_layer.first();
        while (rbp_rule_bank.NIL != this_layer || rbp_rule_bank.NIL != value) {
            if (rbp_rule_bank.NIL == value_$3) {
                new_layers = (SubLObject)ConsesLow.cons(this_layer_$4, new_layers);
            }
            else if (rbp_rule_bank.NIL != rbp_rb_excluded_value_p(value_$3)) {
                final SubLObject excluded = rbp_rb_excluded_value_term(value_$3);
                rbp_rb_filter_add_excluded_value(filter, excluded, rbp_rule);
            }
            else {
                if (rbp_rule_bank.NIL == this_layer_$4) {
                    this_layer_$4 = rbp_rb_new_layer();
                    rbp_rb_filter_add_layer(filter, this_layer_$4);
                }
                new_layers = (SubLObject)ConsesLow.cons(rbp_rb_layer_add_ok_value(this_layer_$4, value_$3, rbp_rule), new_layers);
            }
            value = value.rest();
            value_$3 = value.first();
            this_layer = this_layer.rest();
            this_layer_$4 = this_layer.first();
        }
        return filter;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rbp-rule-bank.lisp", position = 14759L)
    public static SubLObject rbp_rb_excluded_value_p(final SubLObject v_object) {
        return pattern_match.tree_matches_pattern(v_object, (SubLObject)rbp_rule_bank.$list82);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rbp-rule-bank.lisp", position = 14874L)
    public static SubLObject rbp_rb_make_excluded_value(final SubLObject v_term) {
        return (SubLObject)ConsesLow.list((SubLObject)rbp_rule_bank.$kw83$EXCLUDE, v_term);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rbp-rule-bank.lisp", position = 14952L)
    public static SubLObject rbp_rb_excluded_value_term(final SubLObject value) {
        return conses_high.second(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rbp-rule-bank.lisp", position = 15028L)
    public static SubLObject rbp_rule_constraints(final SubLObject rule_cycl) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert rbp_rule_bank.NIL != kb_indexing_datastructures.indexed_term_p(rule_cycl) : rule_cycl;
        if (rbp_rule_bank.NIL == rule_cycl) {
            return (SubLObject)rbp_rule_bank.NIL;
        }
        SubLObject ans = (SubLObject)rbp_rule_bank.NIL;
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(parsing_vars.$rbp_rule_lookup_mt$.getGlobalValue());
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            SubLObject cdolist_list_var = kb_mapping_utilities.pred_values(rule_cycl, rbp_rule_bank.$const85$ncRuleConstraint, (SubLObject)rbp_rule_bank.UNPROVIDED, (SubLObject)rbp_rule_bank.UNPROVIDED, (SubLObject)rbp_rule_bank.UNPROVIDED);
            SubLObject raw_constraint = (SubLObject)rbp_rule_bank.NIL;
            raw_constraint = cdolist_list_var.first();
            while (rbp_rule_bank.NIL != cdolist_list_var) {
                ans = (SubLObject)ConsesLow.cons(rbp_forts_to_keywords(rbp_canonicalize_constraint(raw_constraint)), ans);
                cdolist_list_var = cdolist_list_var.rest();
                raw_constraint = cdolist_list_var.first();
            }
        }
        finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return ans;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rbp-rule-bank.lisp", position = 15522L)
    public static SubLObject rbp_canonicalize_constraint(final SubLObject raw_constraint) {
        SubLObject naut = function_terms.nart_to_naut(raw_constraint);
        final SubLObject fn = cycl_utilities.nat_functor(naut);
        if (rbp_rule_bank.NIL != rbp_negative_constraint_fn_p(fn)) {
            naut = rbp_canonicalize_negative_constraint(naut);
        }
        return naut;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rbp-rule-bank.lisp", position = 15783L)
    public static SubLObject rbp_negative_constraint_fn_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(rbp_rule_bank.NIL != constant_handles.constant_p(v_object) && rbp_rule_bank.NIL != conses_high.member(constants_high.constant_name(v_object), (SubLObject)rbp_rule_bank.$list86, Symbols.symbol_function((SubLObject)rbp_rule_bank.EQUAL), (SubLObject)rbp_rule_bank.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rbp-rule-bank.lisp", position = 16022L)
    public static SubLObject rbp_positive_correlate_of_negative_constraint_fn(final SubLObject negative_fn) {
        return list_utilities.alist_lookup((SubLObject)rbp_rule_bank.$list87, constants_high.constant_name(negative_fn), Symbols.symbol_function((SubLObject)rbp_rule_bank.EQUAL), (SubLObject)rbp_rule_bank.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rbp-rule-bank.lisp", position = 16325L)
    public static SubLObject rbp_canonicalize_negative_constraint(final SubLObject naut) {
        final SubLObject negative_fn = cycl_utilities.nat_functor(naut);
        final SubLObject positive_fn = rbp_positive_correlate_of_negative_constraint_fn(negative_fn);
        final SubLObject value = cycl_utilities.nat_arg2(naut, (SubLObject)rbp_rule_bank.UNPROVIDED);
        final SubLObject excluded_value = rbp_rb_make_excluded_value(value);
        return el_utilities.replace_formula_arg((SubLObject)rbp_rule_bank.ZERO_INTEGER, positive_fn, el_utilities.replace_formula_arg((SubLObject)rbp_rule_bank.TWO_INTEGER, excluded_value, naut));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rbp-rule-bank.lisp", position = 16690L)
    public static SubLObject rbp_forts_to_keywords(final SubLObject formula) {
        return formula.isAtom() ? rbp_fort_to_keyword(formula) : Mapping.mapcar((SubLObject)rbp_rule_bank.$sym88$RBP_FORTS_TO_KEYWORDS, formula);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rbp-rule-bank.lisp", position = 16996L)
    public static SubLObject rbp_fort_to_keyword(final SubLObject v_term) {
        final SubLObject associated_keyword = rbp_keyword_for_term(v_term);
        return (rbp_rule_bank.NIL != associated_keyword) ? associated_keyword : v_term;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rbp-rule-bank.lisp", position = 17291L)
    public static SubLObject rbp_term_keyword_map() {
        if (!rbp_rule_bank.$rbp_term_keyword_map$.getGlobalValue().isList()) {
            initialize_rbp_term_keyword_map();
        }
        return rbp_rule_bank.$rbp_term_keyword_map$.getGlobalValue();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rbp-rule-bank.lisp", position = 17445L)
    public static SubLObject initialize_rbp_term_keyword_map() {
        SubLObject map = (SubLObject)rbp_rule_bank.$list90;
        SubLObject cdolist_list_var = (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constants_high.find_constant((SubLObject)rbp_rule_bank.$str92$NCWordUnitConstraintFn), (SubLObject)rbp_rule_bank.$kw93$WU), (SubLObject)ConsesLow.list(constants_high.find_constant((SubLObject)rbp_rule_bank.$str94$NCTypeGenlsConstraintFn), (SubLObject)rbp_rule_bank.$kw68$TYPE_GENL));
        SubLObject pair = (SubLObject)rbp_rule_bank.NIL;
        pair = cdolist_list_var.first();
        while (rbp_rule_bank.NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = pair;
            SubLObject new_constraint_type = (SubLObject)rbp_rule_bank.NIL;
            SubLObject keyword = (SubLObject)rbp_rule_bank.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)rbp_rule_bank.$list91);
            new_constraint_type = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)rbp_rule_bank.$list91);
            keyword = current.first();
            current = current.rest();
            if (rbp_rule_bank.NIL == current) {
                if (rbp_rule_bank.NIL != constant_handles.valid_constantP(new_constraint_type, (SubLObject)rbp_rule_bank.UNPROVIDED)) {
                    map = list_utilities.alist_enter(map, new_constraint_type, keyword, (SubLObject)rbp_rule_bank.UNPROVIDED);
                }
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)rbp_rule_bank.$list91);
            }
            cdolist_list_var = cdolist_list_var.rest();
            pair = cdolist_list_var.first();
        }
        rbp_rule_bank.$rbp_term_keyword_map$.setGlobalValue(map);
        return rbp_rule_bank.$rbp_term_keyword_map$.getGlobalValue();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rbp-rule-bank.lisp", position = 18258L)
    public static SubLObject rbp_keyword_for_term(final SubLObject v_term) {
        return list_utilities.alist_lookup(rbp_term_keyword_map(), v_term, (SubLObject)rbp_rule_bank.UNPROVIDED, (SubLObject)rbp_rule_bank.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rbp-rule-bank.lisp", position = 18483L)
    public static SubLObject rbp_rb_filter_rules(SubLObject candidate_matches, SubLObject surviving_traced_rules, final SubLObject filter_key, final SubLObject base) {
        rbp_rb_check_initialization();
        if (!candidate_matches.isList()) {
            candidate_matches = conses_high.copy_list(rbp_rb_all_rules_sorted());
        }
        final SubLObject filter = rbp_rb_find_or_create_filter_for_key(filter_key);
        final SubLObject c_type = filter_key.first();
        final SubLObject keys_to_check = rbp_rb_keys_from_base(base, filter);
        final SubLObject indeterminateP = (SubLObject)SubLObjectFactory.makeBoolean(rbp_rule_bank.NIL != subl_promotions.memberP(c_type, (SubLObject)rbp_rule_bank.$list95, (SubLObject)rbp_rule_bank.UNPROVIDED, (SubLObject)rbp_rule_bank.UNPROVIDED) && rbp_rule_bank.NIL != conses_high.member(rbp_rule_bank.$const96$IndeterminateTerm, keys_to_check, (SubLObject)rbp_rule_bank.UNPROVIDED, (SubLObject)rbp_rule_bank.UNPROVIDED));
        final SubLObject report_failuresP = (SubLObject)rbp_rule_bank.NIL;
        SubLObject no_matchP = (SubLObject)rbp_rule_bank.NIL;
        final SubLObject set_var = rbp_rb_filter_layers_set(filter);
        final SubLObject set_contents_var = set.do_set_internal(set_var);
        SubLObject basis_object;
        SubLObject state;
        SubLObject layer;
        SubLObject filter_passers;
        SubLObject survivors;
        SubLObject exempt;
        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)rbp_rule_bank.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); rbp_rule_bank.NIL == no_matchP && rbp_rule_bank.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
            layer = set_contents.do_set_contents_next(basis_object, state);
            if (rbp_rule_bank.NIL != set_contents.do_set_contents_element_validP(state, layer)) {
                filter_passers = ((rbp_rule_bank.NIL != indeterminateP) ? rbp_rb_layer_search_indeterminate(base, c_type, layer) : rbp_rb_layer_search(keys_to_check, layer));
                survivors = list_utilities.nintersect_sorted_destroy_first_only(filter_passers, candidate_matches, (SubLObject)rbp_rule_bank.$sym61$RBP_RULE__, (SubLObject)rbp_rule_bank.UNPROVIDED);
                exempt = ((rbp_rule_bank.NIL != report_failuresP) ? rbp_rb_exempt_rules_reporting_failures(candidate_matches, surviving_traced_rules, filter_key, base, survivors, layer) : rbp_rb_exempt_rules(candidate_matches, layer));
                candidate_matches = list_utilities.nunion_sorted(survivors, exempt, (SubLObject)rbp_rule_bank.$sym61$RBP_RULE__, (SubLObject)rbp_rule_bank.UNPROVIDED);
                if (rbp_rule_bank.NIL == candidate_matches) {
                    no_matchP = (SubLObject)rbp_rule_bank.T;
                }
            }
        }
        if (rbp_rule_bank.NIL != candidate_matches && rbp_rule_bank.NIL != rbp_rb_filter_has_exclusions_p(filter)) {
            layer = rbp_rb_filter_exclusions_layer(filter);
            final SubLObject exclusions = (rbp_rule_bank.NIL != indeterminateP) ? rbp_rb_layer_search_indeterminate(base, c_type, layer) : rbp_rb_layer_search(keys_to_check, layer);
            if (rbp_rule_bank.NIL != exclusions) {
                final SubLObject new_candidate_matches = list_utilities.difference_sorted(candidate_matches, exclusions, (SubLObject)rbp_rule_bank.$sym61$RBP_RULE__, (SubLObject)rbp_rule_bank.UNPROVIDED);
                if (rbp_rule_bank.NIL == list_utilities.same_length_p(candidate_matches, new_candidate_matches)) {
                    candidate_matches = new_candidate_matches;
                }
            }
        }
        SubLObject new_survivors = surviving_traced_rules;
        SubLObject cdolist_list_var = surviving_traced_rules;
        SubLObject traced_rule = (SubLObject)rbp_rule_bank.NIL;
        traced_rule = cdolist_list_var.first();
        while (rbp_rule_bank.NIL != cdolist_list_var) {
            if (rbp_rule_bank.NIL != subl_promotions.memberP(traced_rule, candidate_matches, (SubLObject)rbp_rule_bank.UNPROVIDED, (SubLObject)rbp_rule_bank.UNPROVIDED)) {
                PrintLow.format((SubLObject)rbp_rule_bank.T, (SubLObject)rbp_rule_bank.$str97$__Passed_all__S_constraints_for__, filter_key, rbp_rule_cycl(traced_rule));
            }
            else {
                new_survivors = Sequences.remove(traced_rule, new_survivors, (SubLObject)rbp_rule_bank.UNPROVIDED, (SubLObject)rbp_rule_bank.UNPROVIDED, (SubLObject)rbp_rule_bank.UNPROVIDED, (SubLObject)rbp_rule_bank.UNPROVIDED, (SubLObject)rbp_rule_bank.UNPROVIDED);
                rbp_report_failed_rule(traced_rule, filter_key, base);
            }
            cdolist_list_var = cdolist_list_var.rest();
            traced_rule = cdolist_list_var.first();
        }
        surviving_traced_rules = new_survivors;
        return Values.values(candidate_matches, surviving_traced_rules);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rbp-rule-bank.lisp", position = 21645L)
    public static SubLObject rbp_rb_layer_exempt_rule_lambdaP(final SubLObject candidate_match) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return rbp_rb_layer_exempt_ruleP(rbp_rule_bank.$rbp_lambda_layer$.getDynamicValue(thread), candidate_match);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rbp-rule-bank.lisp", position = 21784L)
    public static SubLObject rbp_rb_exempt_rules(final SubLObject candidate_matches, final SubLObject layer) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject exempt = (SubLObject)rbp_rule_bank.NIL;
        final SubLObject _prev_bind_0 = rbp_rule_bank.$rbp_lambda_layer$.currentBinding(thread);
        try {
            rbp_rule_bank.$rbp_lambda_layer$.bind(layer, thread);
            exempt = list_utilities.delete_if_not((SubLObject)rbp_rule_bank.$sym98$RBP_RB_LAYER_EXEMPT_RULE_LAMBDA_, candidate_matches, (SubLObject)rbp_rule_bank.UNPROVIDED, (SubLObject)rbp_rule_bank.UNPROVIDED, (SubLObject)rbp_rule_bank.UNPROVIDED, (SubLObject)rbp_rule_bank.UNPROVIDED);
        }
        finally {
            rbp_rule_bank.$rbp_lambda_layer$.rebind(_prev_bind_0, thread);
        }
        return exempt;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rbp-rule-bank.lisp", position = 22017L)
    public static SubLObject rbp_rb_exempt_rules_reporting_failures(final SubLObject candidate_matches, final SubLObject surviving_traced_rules, final SubLObject filter_key, final SubLObject base, final SubLObject survivors, final SubLObject layer) {
        SubLObject exempt = (SubLObject)rbp_rule_bank.NIL;
        SubLObject cdolist_list_var = candidate_matches;
        SubLObject candidate_match = (SubLObject)rbp_rule_bank.NIL;
        candidate_match = cdolist_list_var.first();
        while (rbp_rule_bank.NIL != cdolist_list_var) {
            if (rbp_rule_bank.NIL != rbp_rb_layer_exempt_ruleP(layer, candidate_match)) {
                if (rbp_rule_bank.NIL != subl_promotions.memberP(candidate_match, surviving_traced_rules, (SubLObject)rbp_rule_bank.UNPROVIDED, (SubLObject)rbp_rule_bank.UNPROVIDED)) {}
                exempt = (SubLObject)ConsesLow.cons(candidate_match, exempt);
            }
            else if (rbp_rule_bank.NIL == subl_promotions.memberP(candidate_match, survivors, (SubLObject)rbp_rule_bank.UNPROVIDED, (SubLObject)rbp_rule_bank.UNPROVIDED)) {
                rbp_report_failed_rule(candidate_match, filter_key, base);
            }
            cdolist_list_var = cdolist_list_var.rest();
            candidate_match = cdolist_list_var.first();
        }
        exempt = Sequences.nreverse(exempt);
        return exempt;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rbp-rule-bank.lisp", position = 22628L)
    public static SubLObject rbp_report_failed_rule(final SubLObject rbp_rule, final SubLObject filter_key, final SubLObject base) {
        final SubLObject rule_cycl = rbp_rule_cycl(rbp_rule);
        final SubLObject rule_term_table = rbp_rb_rule_term_table(rule_cycl);
        final SubLObject constraint_forts = rbp_rb_rule_term_table_lookup(rule_term_table, filter_key);
        PrintLow.format((SubLObject)rbp_rule_bank.T, (SubLObject)rbp_rule_bank.$str99$__The__S_block_s__S_value__S__did, new SubLObject[] { conses_high.second(filter_key), filter_key.first(), base, constraint_forts, rbp_rule });
        return rbp_rule;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rbp-rule-bank.lisp", position = 23092L)
    public static SubLObject rbp_rb_keys_from_base(final SubLObject base, final SubLObject filter) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (base.eql((SubLObject)rbp_rule_bank.$kw100$ORIGINAL_STRING)) {
            return (SubLObject)rbp_rule_bank.NIL;
        }
        final SubLObject filter_fn = conses_high.third(filter);
        SubLObject keys = (SubLObject)rbp_rule_bank.NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)rbp_rule_bank.$sym101$RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind(rbp_rule_bank.$const102$EverythingPSC, thread);
            keys = rbp_rb_keys_from_base_int(filter_fn, base);
        }
        finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return keys;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rbp-rule-bank.lisp", position = 23557L)
    public static SubLObject rbp_rb_keys_from_base_int_internal(final SubLObject filter_fn, final SubLObject base) {
        return Functions.funcall(filter_fn, base);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rbp-rule-bank.lisp", position = 23557L)
    public static SubLObject rbp_rb_keys_from_base_int(final SubLObject filter_fn, final SubLObject base) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = (SubLObject)rbp_rule_bank.NIL;
        if (rbp_rule_bank.NIL == v_memoization_state) {
            return rbp_rb_keys_from_base_int_internal(filter_fn, base);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, (SubLObject)rbp_rule_bank.$sym103$RBP_RB_KEYS_FROM_BASE_INT, (SubLObject)rbp_rule_bank.UNPROVIDED);
        if (rbp_rule_bank.NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), (SubLObject)rbp_rule_bank.$sym103$RBP_RB_KEYS_FROM_BASE_INT, (SubLObject)rbp_rule_bank.TWO_INTEGER, (SubLObject)rbp_rule_bank.NIL, (SubLObject)rbp_rule_bank.EQUAL, (SubLObject)rbp_rule_bank.UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, (SubLObject)rbp_rule_bank.$sym103$RBP_RB_KEYS_FROM_BASE_INT, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(filter_fn, base);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, (SubLObject)rbp_rule_bank.UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = (SubLObject)rbp_rule_bank.NIL;
            collision = cdolist_list_var.first();
            while (rbp_rule_bank.NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = conses_high.second(collision);
                if (filter_fn.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (rbp_rule_bank.NIL != cached_args && rbp_rule_bank.NIL == cached_args.rest() && base.equal(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            }
        }
        final SubLObject results3 = Values.arg2(thread.resetMultipleValues(), (SubLObject)Values.multiple_value_list(rbp_rb_keys_from_base_int_internal(filter_fn, base)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, (SubLObject)ConsesLow.list(filter_fn, base));
        return memoization_state.caching_results(results3);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rbp-rule-bank.lisp", position = 23670L)
    public static SubLObject rbp_rb_rule_term_table(final SubLObject rule_cycl) {
        final SubLObject table = Hashtables.make_hash_table((SubLObject)rbp_rule_bank.SIXTEEN_INTEGER, Symbols.symbol_function((SubLObject)rbp_rule_bank.EQUALP), (SubLObject)rbp_rule_bank.UNPROVIDED);
        SubLObject cdolist_list_var;
        final SubLObject constraints = cdolist_list_var = rbp_rule_constraints(rule_cycl);
        SubLObject clause = (SubLObject)rbp_rule_bank.NIL;
        clause = cdolist_list_var.first();
        while (rbp_rule_bank.NIL != cdolist_list_var) {
            final SubLObject key = conses_high.butlast(clause, (SubLObject)rbp_rule_bank.UNPROVIDED);
            final SubLObject new_value = list_utilities.last_one(clause);
            if (!new_value.isKeyword()) {
                hash_table_utilities.push_hash(key, new_value, table);
            }
            cdolist_list_var = cdolist_list_var.rest();
            clause = cdolist_list_var.first();
        }
        return table;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rbp-rule-bank.lisp", position = 24205L)
    public static SubLObject rbp_rb_rule_term_table_lookup(final SubLObject rule_term_table, final SubLObject filter_key) {
        return Hashtables.gethash(filter_key, rule_term_table, (SubLObject)rbp_rule_bank.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rbp-rule-bank.lisp", position = 24327L)
    public static SubLObject rbp_rb_all_genls(final SubLObject obj) {
        return (SubLObject)((rbp_rule_bank.NIL != term.el_fort_p(obj)) ? genls.all_genls(obj, (SubLObject)rbp_rule_bank.UNPROVIDED, (SubLObject)rbp_rule_bank.UNPROVIDED) : rbp_rule_bank.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rbp-rule-bank.lisp", position = 24416L)
    public static SubLObject rbp_rb_all_type_genls(final SubLObject obj) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ans = (SubLObject)rbp_rule_bank.NIL;
        if (rbp_rule_bank.NIL != isa.isaP(obj, rbp_rule_bank.$const104$CollectionType, (SubLObject)rbp_rule_bank.UNPROVIDED, (SubLObject)rbp_rule_bank.UNPROVIDED)) {
            ans = ask_utilities.query_variable((SubLObject)rbp_rule_bank.$sym105$_TYPE, (SubLObject)ConsesLow.listS(rbp_rule_bank.$const106$and, (SubLObject)ConsesLow.listS(rbp_rule_bank.$const107$typeGenls, obj, (SubLObject)rbp_rule_bank.$list108), (SubLObject)rbp_rule_bank.$list109), parsing_vars.$parsing_domain_mt$.getDynamicValue(thread), (SubLObject)rbp_rule_bank.UNPROVIDED);
        }
        return ans;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rbp-rule-bank.lisp", position = 24747L)
    public static SubLObject rbp_rb_all_isa(final SubLObject obj) {
        SubLObject isas = isa.all_isa(obj, (SubLObject)rbp_rule_bank.UNPROVIDED, (SubLObject)rbp_rule_bank.UNPROVIDED);
        if (rbp_rule_bank.NIL == isas) {
            if (rbp_rule_bank.NIL != subl_promotions.positive_integer_p(obj)) {
                isas = genls.all_genls(rbp_rule_bank.$const110$PositiveInteger, (SubLObject)rbp_rule_bank.UNPROVIDED, (SubLObject)rbp_rule_bank.UNPROVIDED);
            }
            else if (obj.isString()) {
                SubLObject cdolist_list_var = noun_compound_constraint_string_specs();
                SubLObject col = (SubLObject)rbp_rule_bank.NIL;
                col = cdolist_list_var.first();
                while (rbp_rule_bank.NIL != cdolist_list_var) {
                    if (col.eql(rbp_rule_bank.$const111$ProperNameString)) {
                        if (rbp_rule_bank.NIL != Characters.upper_case_p(string_utilities.first_char(obj)) || rbp_rule_bank.NIL != list_utilities.empty_list_p(lexicon_cache.words_of_string(obj, (SubLObject)rbp_rule_bank.UNPROVIDED, (SubLObject)rbp_rule_bank.UNPROVIDED, (SubLObject)rbp_rule_bank.UNPROVIDED))) {
                            isas = (SubLObject)ConsesLow.cons(col, isas);
                        }
                    }
                    else if (rbp_rule_bank.NIL != at_defns.quiet_has_typeP(obj, col, (SubLObject)rbp_rule_bank.UNPROVIDED)) {
                        isas = (SubLObject)ConsesLow.cons(col, isas);
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    col = cdolist_list_var.first();
                }
            }
        }
        return isas;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rbp-rule-bank.lisp", position = 25231L)
    public static SubLObject clear_noun_compound_constraint_string_specs() {
        final SubLObject cs = rbp_rule_bank.$noun_compound_constraint_string_specs_caching_state$.getGlobalValue();
        if (rbp_rule_bank.NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return (SubLObject)rbp_rule_bank.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rbp-rule-bank.lisp", position = 25231L)
    public static SubLObject remove_noun_compound_constraint_string_specs() {
        return memoization_state.caching_state_remove_function_results_with_args(rbp_rule_bank.$noun_compound_constraint_string_specs_caching_state$.getGlobalValue(), (SubLObject)ConsesLow.list(rbp_rule_bank.EMPTY_SUBL_OBJECT_ARRAY), (SubLObject)rbp_rule_bank.UNPROVIDED, (SubLObject)rbp_rule_bank.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rbp-rule-bank.lisp", position = 25231L)
    public static SubLObject noun_compound_constraint_string_specs_internal() {
        return ask_utilities.query_variable((SubLObject)rbp_rule_bank.$sym113$_COL, (SubLObject)rbp_rule_bank.$list114, rbp_rule_bank.$const115$InferencePSC, (SubLObject)rbp_rule_bank.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rbp-rule-bank.lisp", position = 25231L)
    public static SubLObject noun_compound_constraint_string_specs() {
        SubLObject caching_state = rbp_rule_bank.$noun_compound_constraint_string_specs_caching_state$.getGlobalValue();
        if (rbp_rule_bank.NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name((SubLObject)rbp_rule_bank.$sym112$NOUN_COMPOUND_CONSTRAINT_STRING_SPECS, (SubLObject)rbp_rule_bank.$sym116$_NOUN_COMPOUND_CONSTRAINT_STRING_SPECS_CACHING_STATE_, (SubLObject)rbp_rule_bank.NIL, (SubLObject)rbp_rule_bank.EQL, (SubLObject)rbp_rule_bank.ZERO_INTEGER, (SubLObject)rbp_rule_bank.ZERO_INTEGER);
        }
        SubLObject results = memoization_state.caching_state_get_zero_arg_results(caching_state, (SubLObject)rbp_rule_bank.UNPROVIDED);
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(noun_compound_constraint_string_specs_internal()));
            memoization_state.caching_state_set_zero_arg_results(caching_state, results, (SubLObject)rbp_rule_bank.UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }
    
    public static SubLObject declare_rbp_rule_bank_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rbp_rule_bank", "rbp_new_rule_bank", "RBP-NEW-RULE-BANK", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rbp_rule_bank", "note_rbp_rb_initialized", "NOTE-RBP-RB-INITIALIZED", 0, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.rbp_rule_bank", "with_rbp_rule_bank_lock_held", "WITH-RBP-RULE-BANK-LOCK-HELD");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.rbp_rule_bank", "do_rbp_constraint_types", "DO-RBP-CONSTRAINT-TYPES");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rbp_rule_bank", "rbp_syntactic_constraint_type_p", "RBP-SYNTACTIC-CONSTRAINT-TYPE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rbp_rule_bank", "rbp_semantic_constraint_type_p", "RBP-SEMANTIC-CONSTRAINT-TYPE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rbp_rule_bank", "rbp_syntactic_constraint_p", "RBP-SYNTACTIC-CONSTRAINT-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rbp_rule_bank", "rbp_word_unit_constraint_p", "RBP-WORD-UNIT-CONSTRAINT-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rbp_rule_bank", "rbp_semantic_constraint_p", "RBP-SEMANTIC-CONSTRAINT-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rbp_rule_bank", "recursive_block_parser_rule_print_function_trampoline", "RECURSIVE-BLOCK-PARSER-RULE-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rbp_rule_bank", "recursive_block_parser_rule_p", "RECURSIVE-BLOCK-PARSER-RULE-P", 1, 0, false);
        new $recursive_block_parser_rule_p$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rbp_rule_bank", "rbp_rule_cycl", "RBP-RULE-CYCL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rbp_rule_bank", "rbp_rule_filter_layers", "RBP-RULE-FILTER-LAYERS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rbp_rule_bank", "_csetf_rbp_rule_cycl", "_CSETF-RBP-RULE-CYCL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rbp_rule_bank", "_csetf_rbp_rule_filter_layers", "_CSETF-RBP-RULE-FILTER-LAYERS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rbp_rule_bank", "make_recursive_block_parser_rule", "MAKE-RECURSIVE-BLOCK-PARSER-RULE", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rbp_rule_bank", "visit_defstruct_recursive_block_parser_rule", "VISIT-DEFSTRUCT-RECURSIVE-BLOCK-PARSER-RULE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rbp_rule_bank", "visit_defstruct_object_recursive_block_parser_rule_method", "VISIT-DEFSTRUCT-OBJECT-RECURSIVE-BLOCK-PARSER-RULE-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rbp_rule_bank", "pprint_rbp_rule", "PPRINT-RBP-RULE", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rbp_rule_bank", "new_rbp_rule", "NEW-RBP-RULE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rbp_rule_bank", "rbp_rule_note_cycl", "RBP-RULE-NOTE-CYCL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rbp_rule_bank", "rbp_find_or_create_rule_from_cycl", "RBP-FIND-OR-CREATE-RULE-FROM-CYCL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rbp_rule_bank", "rbp_find_rule_from_cycl", "RBP-FIND-RULE-FROM-CYCL", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rbp_rule_bank", "rbp_find_rule_from_cycl_w_initialized_rb", "RBP-FIND-RULE-FROM-CYCL-W-INITIALIZED-RB", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rbp_rule_bank", "rbp_find_cycl_from_rule", "RBP-FIND-CYCL-FROM-RULE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rbp_rule_bank", "rbp_rb_filters", "RBP-RB-FILTERS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rbp_rule_bank", "rbp_rb_add_filter", "RBP-RB-ADD-FILTER", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rbp_rule_bank", "rbp_rb_rule_count", "RBP-RB-RULE-COUNT", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rbp_rule_bank", "rbp_rb_all_rules", "RBP-RB-ALL-RULES", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rbp_rule_bank", "clear_rbp_rb_all_rules_sorted", "CLEAR-RBP-RB-ALL-RULES-SORTED", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rbp_rule_bank", "remove_rbp_rb_all_rules_sorted", "REMOVE-RBP-RB-ALL-RULES-SORTED", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rbp_rule_bank", "rbp_rb_all_rules_sorted_internal", "RBP-RB-ALL-RULES-SORTED-INTERNAL", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rbp_rule_bank", "rbp_rb_all_rules_sorted", "RBP-RB-ALL-RULES-SORTED", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rbp_rule_bank", "sort_rbp_rules", "SORT-RBP-RULES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rbp_rule_bank", "rbp_rule_L", "RBP-RULE-<", 2, 0, false);
        new $rbp_rule_L$BinaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rbp_rule_bank", "rbp_rules_sortedP", "RBP-RULES-SORTED?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rbp_rule_bank", "rbp_rb_new_filter", "RBP-RB-NEW-FILTER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rbp_rule_bank", "rbp_rb_filter_layers_set", "RBP-RB-FILTER-LAYERS-SET", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rbp_rule_bank", "rbp_rb_filter_exclusions_layer", "RBP-RB-FILTER-EXCLUSIONS-LAYER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rbp_rule_bank", "rbp_rb_filter_has_exclusions_p", "RBP-RB-FILTER-HAS-EXCLUSIONS-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rbp_rule_bank", "rbp_rb_filter_layers_list", "RBP-RB-FILTER-LAYERS-LIST", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rbp_rule_bank", "rbp_rb_filter_add_layer", "RBP-RB-FILTER-ADD-LAYER", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rbp_rule_bank", "rbp_rb_filter_add_excluded_value", "RBP-RB-FILTER-ADD-EXCLUDED-VALUE", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rbp_rule_bank", "rbp_rb_find_or_create_filter_for_key", "RBP-RB-FIND-OR-CREATE-FILTER-FOR-KEY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rbp_rule_bank", "rbp_rb_fn_for_filter_key", "RBP-RB-FN-FOR-FILTER-KEY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rbp_rule_bank", "rbp_rb_new_layer", "RBP-RB-NEW-LAYER", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rbp_rule_bank", "rbp_rb_layer_dictionary", "RBP-RB-LAYER-DICTIONARY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rbp_rule_bank", "rbp_rb_layer_note_rule_to_check", "RBP-RB-LAYER-NOTE-RULE-TO-CHECK", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rbp_rule_bank", "rbp_rb_layer_exempt_ruleP", "RBP-RB-LAYER-EXEMPT-RULE?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rbp_rule_bank", "rbp_rb_layer_search", "RBP-RB-LAYER-SEARCH", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rbp_rule_bank", "rbp_rb_layer_search_indeterminate", "RBP-RB-LAYER-SEARCH-INDETERMINATE", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rbp_rule_bank", "rbp_rb_layer_search_one", "RBP-RB-LAYER-SEARCH-ONE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rbp_rule_bank", "rbp_rb_layer_note_value", "RBP-RB-LAYER-NOTE-VALUE", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rbp_rule_bank", "rbp_rb_layer_add_ok_value", "RBP-RB-LAYER-ADD-OK-VALUE", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rbp_rule_bank", "rbp_rb_layer_add_excluded_value", "RBP-RB-LAYER-ADD-EXCLUDED-VALUE", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rbp_rule_bank", "rbp_rb_check_initialization", "RBP-RB-CHECK-INITIALIZATION", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rbp_rule_bank", "rbp_clear_rule_bank", "RBP-CLEAR-RULE-BANK", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rbp_rule_bank", "rbp_clear_rule_bank_internal", "RBP-CLEAR-RULE-BANK-INTERNAL", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rbp_rule_bank", "rbp_rb_initialize", "RBP-RB-INITIALIZE", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rbp_rule_bank", "rbp_rb_update", "RBP-RB-UPDATE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rbp_rule_bank", "rbp_rb_update_all_filters", "RBP-RB-UPDATE-ALL-FILTERS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rbp_rule_bank", "rbp_rb_update_filter", "RBP-RB-UPDATE-FILTER", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rbp_rule_bank", "rbp_rb_excluded_value_p", "RBP-RB-EXCLUDED-VALUE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rbp_rule_bank", "rbp_rb_make_excluded_value", "RBP-RB-MAKE-EXCLUDED-VALUE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rbp_rule_bank", "rbp_rb_excluded_value_term", "RBP-RB-EXCLUDED-VALUE-TERM", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rbp_rule_bank", "rbp_rule_constraints", "RBP-RULE-CONSTRAINTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rbp_rule_bank", "rbp_canonicalize_constraint", "RBP-CANONICALIZE-CONSTRAINT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rbp_rule_bank", "rbp_negative_constraint_fn_p", "RBP-NEGATIVE-CONSTRAINT-FN-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rbp_rule_bank", "rbp_positive_correlate_of_negative_constraint_fn", "RBP-POSITIVE-CORRELATE-OF-NEGATIVE-CONSTRAINT-FN", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rbp_rule_bank", "rbp_canonicalize_negative_constraint", "RBP-CANONICALIZE-NEGATIVE-CONSTRAINT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rbp_rule_bank", "rbp_forts_to_keywords", "RBP-FORTS-TO-KEYWORDS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rbp_rule_bank", "rbp_fort_to_keyword", "RBP-FORT-TO-KEYWORD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rbp_rule_bank", "rbp_term_keyword_map", "RBP-TERM-KEYWORD-MAP", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rbp_rule_bank", "initialize_rbp_term_keyword_map", "INITIALIZE-RBP-TERM-KEYWORD-MAP", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rbp_rule_bank", "rbp_keyword_for_term", "RBP-KEYWORD-FOR-TERM", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rbp_rule_bank", "rbp_rb_filter_rules", "RBP-RB-FILTER-RULES", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rbp_rule_bank", "rbp_rb_layer_exempt_rule_lambdaP", "RBP-RB-LAYER-EXEMPT-RULE-LAMBDA?", 1, 0, false);
        new $rbp_rb_layer_exempt_rule_lambdaP$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rbp_rule_bank", "rbp_rb_exempt_rules", "RBP-RB-EXEMPT-RULES", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rbp_rule_bank", "rbp_rb_exempt_rules_reporting_failures", "RBP-RB-EXEMPT-RULES-REPORTING-FAILURES", 6, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rbp_rule_bank", "rbp_report_failed_rule", "RBP-REPORT-FAILED-RULE", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rbp_rule_bank", "rbp_rb_keys_from_base", "RBP-RB-KEYS-FROM-BASE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rbp_rule_bank", "rbp_rb_keys_from_base_int_internal", "RBP-RB-KEYS-FROM-BASE-INT-INTERNAL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rbp_rule_bank", "rbp_rb_keys_from_base_int", "RBP-RB-KEYS-FROM-BASE-INT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rbp_rule_bank", "rbp_rb_rule_term_table", "RBP-RB-RULE-TERM-TABLE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rbp_rule_bank", "rbp_rb_rule_term_table_lookup", "RBP-RB-RULE-TERM-TABLE-LOOKUP", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rbp_rule_bank", "rbp_rb_all_genls", "RBP-RB-ALL-GENLS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rbp_rule_bank", "rbp_rb_all_type_genls", "RBP-RB-ALL-TYPE-GENLS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rbp_rule_bank", "rbp_rb_all_isa", "RBP-RB-ALL-ISA", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rbp_rule_bank", "clear_noun_compound_constraint_string_specs", "CLEAR-NOUN-COMPOUND-CONSTRAINT-STRING-SPECS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rbp_rule_bank", "remove_noun_compound_constraint_string_specs", "REMOVE-NOUN-COMPOUND-CONSTRAINT-STRING-SPECS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rbp_rule_bank", "noun_compound_constraint_string_specs_internal", "NOUN-COMPOUND-CONSTRAINT-STRING-SPECS-INTERNAL", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rbp_rule_bank", "noun_compound_constraint_string_specs", "NOUN-COMPOUND-CONSTRAINT-STRING-SPECS", 0, 0, false);
        return (SubLObject)rbp_rule_bank.NIL;
    }
    
    public static SubLObject init_rbp_rule_bank_file() {
        rbp_rule_bank.$rbp_rule_bank$ = SubLFiles.deflexical("*RBP-RULE-BANK*", (rbp_rule_bank.NIL != Symbols.boundp((SubLObject)rbp_rule_bank.$sym0$_RBP_RULE_BANK_)) ? rbp_rule_bank.$rbp_rule_bank$.getGlobalValue() : rbp_new_rule_bank());
        rbp_rule_bank.$rbp_rule_index$ = SubLFiles.deflexical("*RBP-RULE-INDEX*", (rbp_rule_bank.NIL != Symbols.boundp((SubLObject)rbp_rule_bank.$sym1$_RBP_RULE_INDEX_)) ? rbp_rule_bank.$rbp_rule_index$.getGlobalValue() : dictionary.new_dictionary((SubLObject)rbp_rule_bank.UNPROVIDED, (SubLObject)rbp_rule_bank.UNPROVIDED));
        rbp_rule_bank.$rbp_rb_initializedP$ = SubLFiles.deflexical("*RBP-RB-INITIALIZED?*", (SubLObject)((rbp_rule_bank.NIL != Symbols.boundp((SubLObject)rbp_rule_bank.$sym2$_RBP_RB_INITIALIZED__)) ? rbp_rule_bank.$rbp_rb_initializedP$.getGlobalValue() : rbp_rule_bank.NIL));
        rbp_rule_bank.$rbp_rule_bank_lock$ = SubLFiles.deflexical("*RBP-RULE-BANK-LOCK*", Locks.make_lock((SubLObject)rbp_rule_bank.$str3$RBP_Rule_Bank_Lock));
        rbp_rule_bank.$rbp_syntactic_constraint_types$ = SubLFiles.defconstant("*RBP-SYNTACTIC-CONSTRAINT-TYPES*", (SubLObject)rbp_rule_bank.$list6);
        rbp_rule_bank.$rbp_semantic_constraint_types$ = SubLFiles.defconstant("*RBP-SEMANTIC-CONSTRAINT-TYPES*", (SubLObject)rbp_rule_bank.$list7);
        rbp_rule_bank.$rbp_open_class_constraint_types$ = SubLFiles.defconstant("*RBP-OPEN-CLASS-CONSTRAINT-TYPES*", (SubLObject)rbp_rule_bank.$list8);
        rbp_rule_bank.$rbp_closed_class_constraint_types$ = SubLFiles.defconstant("*RBP-CLOSED-CLASS-CONSTRAINT-TYPES*", (SubLObject)rbp_rule_bank.$list9);
        rbp_rule_bank.$rbp_constrained_types$ = SubLFiles.defparameter("*RBP-CONSTRAINED-TYPES*", (SubLObject)rbp_rule_bank.$list33);
        rbp_rule_bank.$dtp_recursive_block_parser_rule$ = SubLFiles.defconstant("*DTP-RECURSIVE-BLOCK-PARSER-RULE*", (SubLObject)rbp_rule_bank.$sym37$RECURSIVE_BLOCK_PARSER_RULE);
        rbp_rule_bank.$rbp_rb_all_rules_sorted_caching_state$ = SubLFiles.deflexical("*RBP-RB-ALL-RULES-SORTED-CACHING-STATE*", (SubLObject)rbp_rule_bank.NIL);
        rbp_rule_bank.$rbp_term_keyword_map$ = SubLFiles.deflexical("*RBP-TERM-KEYWORD-MAP*", (SubLObject)rbp_rule_bank.$kw89$UNINITIALIZED);
        rbp_rule_bank.$rbp_lambda_layer$ = SubLFiles.defparameter("*RBP-LAMBDA-LAYER*", (SubLObject)rbp_rule_bank.NIL);
        rbp_rule_bank.$noun_compound_constraint_string_specs_caching_state$ = SubLFiles.deflexical("*NOUN-COMPOUND-CONSTRAINT-STRING-SPECS-CACHING-STATE*", (SubLObject)rbp_rule_bank.NIL);
        return (SubLObject)rbp_rule_bank.NIL;
    }
    
    public static SubLObject setup_rbp_rule_bank_file() {
        subl_macro_promotions.declare_defglobal((SubLObject)rbp_rule_bank.$sym0$_RBP_RULE_BANK_);
        subl_macro_promotions.declare_defglobal((SubLObject)rbp_rule_bank.$sym1$_RBP_RULE_INDEX_);
        subl_macro_promotions.declare_defglobal((SubLObject)rbp_rule_bank.$sym2$_RBP_RB_INITIALIZED__);
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), rbp_rule_bank.$dtp_recursive_block_parser_rule$.getGlobalValue(), Symbols.symbol_function((SubLObject)rbp_rule_bank.$sym44$RECURSIVE_BLOCK_PARSER_RULE_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)rbp_rule_bank.$list45);
        Structures.def_csetf((SubLObject)rbp_rule_bank.$sym46$RBP_RULE_CYCL, (SubLObject)rbp_rule_bank.$sym47$_CSETF_RBP_RULE_CYCL);
        Structures.def_csetf((SubLObject)rbp_rule_bank.$sym48$RBP_RULE_FILTER_LAYERS, (SubLObject)rbp_rule_bank.$sym49$_CSETF_RBP_RULE_FILTER_LAYERS);
        Equality.identity((SubLObject)rbp_rule_bank.$sym37$RECURSIVE_BLOCK_PARSER_RULE);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), rbp_rule_bank.$dtp_recursive_block_parser_rule$.getGlobalValue(), Symbols.symbol_function((SubLObject)rbp_rule_bank.$sym57$VISIT_DEFSTRUCT_OBJECT_RECURSIVE_BLOCK_PARSER_RULE_METHOD));
        memoization_state.note_globally_cached_function((SubLObject)rbp_rule_bank.$sym59$RBP_RB_ALL_RULES_SORTED);
        memoization_state.note_memoized_function((SubLObject)rbp_rule_bank.$sym103$RBP_RB_KEYS_FROM_BASE_INT);
        memoization_state.note_globally_cached_function((SubLObject)rbp_rule_bank.$sym112$NOUN_COMPOUND_CONSTRAINT_STRING_SPECS);
        return (SubLObject)rbp_rule_bank.NIL;
    }
    
    public void declareFunctions() {
        declare_rbp_rule_bank_file();
    }
    
    public void initializeVariables() {
        init_rbp_rule_bank_file();
    }
    
    public void runTopLevelForms() {
        setup_rbp_rule_bank_file();
    }
    
    static {
        me = (SubLFile)new rbp_rule_bank();
        rbp_rule_bank.$rbp_rule_bank$ = null;
        rbp_rule_bank.$rbp_rule_index$ = null;
        rbp_rule_bank.$rbp_rb_initializedP$ = null;
        rbp_rule_bank.$rbp_rule_bank_lock$ = null;
        rbp_rule_bank.$rbp_syntactic_constraint_types$ = null;
        rbp_rule_bank.$rbp_semantic_constraint_types$ = null;
        rbp_rule_bank.$rbp_open_class_constraint_types$ = null;
        rbp_rule_bank.$rbp_closed_class_constraint_types$ = null;
        rbp_rule_bank.$rbp_constrained_types$ = null;
        rbp_rule_bank.$dtp_recursive_block_parser_rule$ = null;
        rbp_rule_bank.$rbp_rb_all_rules_sorted_caching_state$ = null;
        rbp_rule_bank.$rbp_term_keyword_map$ = null;
        rbp_rule_bank.$rbp_lambda_layer$ = null;
        rbp_rule_bank.$noun_compound_constraint_string_specs_caching_state$ = null;
        $sym0$_RBP_RULE_BANK_ = SubLObjectFactory.makeSymbol("*RBP-RULE-BANK*");
        $sym1$_RBP_RULE_INDEX_ = SubLObjectFactory.makeSymbol("*RBP-RULE-INDEX*");
        $sym2$_RBP_RB_INITIALIZED__ = SubLObjectFactory.makeSymbol("*RBP-RB-INITIALIZED?*");
        $str3$RBP_Rule_Bank_Lock = SubLObjectFactory.makeString("RBP Rule Bank Lock");
        $sym4$WITH_LOCK_HELD = SubLObjectFactory.makeSymbol("WITH-LOCK-HELD");
        $list5 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*RBP-RULE-BANK-LOCK*"));
        $list6 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("PRED"), (SubLObject)SubLObjectFactory.makeKeyword("POS"), (SubLObject)SubLObjectFactory.makeKeyword("WU"));
        $list7 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("GENL"), (SubLObject)SubLObjectFactory.makeKeyword("TYPE-GENL"), (SubLObject)SubLObjectFactory.makeKeyword("ISA"), (SubLObject)SubLObjectFactory.makeKeyword("EQL"));
        $list8 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("WU"), (SubLObject)SubLObjectFactory.makeKeyword("GENL"), (SubLObject)SubLObjectFactory.makeKeyword("TYPE-GENL"), (SubLObject)SubLObjectFactory.makeKeyword("ISA"), (SubLObject)SubLObjectFactory.makeKeyword("EQL"));
        $list9 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("POS"), (SubLObject)SubLObjectFactory.makeKeyword("PRED"));
        $list10 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TYPE"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("DONE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MODE"), (SubLObject)SubLObjectFactory.makeKeyword("ALL"))), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $list11 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("DONE"), (SubLObject)SubLObjectFactory.makeKeyword("MODE"));
        $kw12$ALLOW_OTHER_KEYS = SubLObjectFactory.makeKeyword("ALLOW-OTHER-KEYS");
        $kw13$DONE = SubLObjectFactory.makeKeyword("DONE");
        $kw14$MODE = SubLObjectFactory.makeKeyword("MODE");
        $kw15$ALL = SubLObjectFactory.makeKeyword("ALL");
        $sym16$SYNTACTIC_TYPES = SubLObjectFactory.makeUninternedSymbol("SYNTACTIC-TYPES");
        $sym17$SEMANTIC_TYPES = SubLObjectFactory.makeUninternedSymbol("SEMANTIC-TYPES");
        $sym18$OPEN_TYPES = SubLObjectFactory.makeUninternedSymbol("OPEN-TYPES");
        $sym19$CLOSED_TYPES = SubLObjectFactory.makeUninternedSymbol("CLOSED-TYPES");
        $sym20$CLET = SubLObjectFactory.makeSymbol("CLET");
        $list21 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*RBP-SYNTACTIC-CONSTRAINT-TYPES*"));
        $list22 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*RBP-SEMANTIC-CONSTRAINT-TYPES*"));
        $list23 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*RBP-OPEN-CLASS-CONSTRAINT-TYPES*"));
        $list24 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*RBP-CLOSED-CLASS-CONSTRAINT-TYPES*"));
        $sym25$PWHEN = SubLObjectFactory.makeSymbol("PWHEN");
        $sym26$COR = SubLObjectFactory.makeSymbol("COR");
        $list27 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("ALL"));
        $list28 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("SYNTACTIC"));
        $sym29$CSOME = SubLObjectFactory.makeSymbol("CSOME");
        $list30 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("SEMANTIC"));
        $list31 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("OPEN-CLASS"));
        $list32 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CLOSED-CLASS"));
        $list33 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("HEAD"), (SubLObject)SubLObjectFactory.makeKeyword("MODIFIER"));
        $list34 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("RBP-SYNTACTIC-CONSTRAINT-TYPE-P")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"));
        $list35 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("WU"), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"));
        $list36 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("OR"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("RBP-SEMANTIC-CONSTRAINT-TYPE-P")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("FormulaArgFn")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("POSITIVE-INTEGER-P")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("RBP-SEMANTIC-CONSTRAINT-P"))));
        $sym37$RECURSIVE_BLOCK_PARSER_RULE = SubLObjectFactory.makeSymbol("RECURSIVE-BLOCK-PARSER-RULE");
        $sym38$RECURSIVE_BLOCK_PARSER_RULE_P = SubLObjectFactory.makeSymbol("RECURSIVE-BLOCK-PARSER-RULE-P");
        $list39 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CYCL"), (SubLObject)SubLObjectFactory.makeSymbol("FILTER-LAYERS"));
        $list40 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CYCL"), (SubLObject)SubLObjectFactory.makeKeyword("FILTER-LAYERS"));
        $list41 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RBP-RULE-CYCL"), (SubLObject)SubLObjectFactory.makeSymbol("RBP-RULE-FILTER-LAYERS"));
        $list42 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("_CSETF-RBP-RULE-CYCL"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-RBP-RULE-FILTER-LAYERS"));
        $sym43$PPRINT_RBP_RULE = SubLObjectFactory.makeSymbol("PPRINT-RBP-RULE");
        $sym44$RECURSIVE_BLOCK_PARSER_RULE_PRINT_FUNCTION_TRAMPOLINE = SubLObjectFactory.makeSymbol("RECURSIVE-BLOCK-PARSER-RULE-PRINT-FUNCTION-TRAMPOLINE");
        $list45 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("RECURSIVE-BLOCK-PARSER-RULE-P"));
        $sym46$RBP_RULE_CYCL = SubLObjectFactory.makeSymbol("RBP-RULE-CYCL");
        $sym47$_CSETF_RBP_RULE_CYCL = SubLObjectFactory.makeSymbol("_CSETF-RBP-RULE-CYCL");
        $sym48$RBP_RULE_FILTER_LAYERS = SubLObjectFactory.makeSymbol("RBP-RULE-FILTER-LAYERS");
        $sym49$_CSETF_RBP_RULE_FILTER_LAYERS = SubLObjectFactory.makeSymbol("_CSETF-RBP-RULE-FILTER-LAYERS");
        $kw50$CYCL = SubLObjectFactory.makeKeyword("CYCL");
        $kw51$FILTER_LAYERS = SubLObjectFactory.makeKeyword("FILTER-LAYERS");
        $str52$Invalid_slot__S_for_construction_ = SubLObjectFactory.makeString("Invalid slot ~S for construction function");
        $kw53$BEGIN = SubLObjectFactory.makeKeyword("BEGIN");
        $sym54$MAKE_RECURSIVE_BLOCK_PARSER_RULE = SubLObjectFactory.makeSymbol("MAKE-RECURSIVE-BLOCK-PARSER-RULE");
        $kw55$SLOT = SubLObjectFactory.makeKeyword("SLOT");
        $kw56$END = SubLObjectFactory.makeKeyword("END");
        $sym57$VISIT_DEFSTRUCT_OBJECT_RECURSIVE_BLOCK_PARSER_RULE_METHOD = SubLObjectFactory.makeSymbol("VISIT-DEFSTRUCT-OBJECT-RECURSIVE-BLOCK-PARSER-RULE-METHOD");
        $str58$__RBP_RULE__S_ = SubLObjectFactory.makeString("#<RBP-RULE ~S>");
        $sym59$RBP_RB_ALL_RULES_SORTED = SubLObjectFactory.makeSymbol("RBP-RB-ALL-RULES-SORTED");
        $sym60$_RBP_RB_ALL_RULES_SORTED_CACHING_STATE_ = SubLObjectFactory.makeSymbol("*RBP-RB-ALL-RULES-SORTED-CACHING-STATE*");
        $sym61$RBP_RULE__ = SubLObjectFactory.makeSymbol("RBP-RULE-<");
        $kw62$NO_EXCLUSIONS = SubLObjectFactory.makeKeyword("NO-EXCLUSIONS");
        $kw63$PRED = SubLObjectFactory.makeKeyword("PRED");
        $sym64$ALL_GENL_PREDS = SubLObjectFactory.makeSymbol("ALL-GENL-PREDS");
        $kw65$POS = SubLObjectFactory.makeKeyword("POS");
        $kw66$GENL = SubLObjectFactory.makeKeyword("GENL");
        $sym67$RBP_RB_ALL_GENLS = SubLObjectFactory.makeSymbol("RBP-RB-ALL-GENLS");
        $kw68$TYPE_GENL = SubLObjectFactory.makeKeyword("TYPE-GENL");
        $sym69$RBP_RB_ALL_TYPE_GENLS = SubLObjectFactory.makeSymbol("RBP-RB-ALL-TYPE-GENLS");
        $kw70$ISA = SubLObjectFactory.makeKeyword("ISA");
        $sym71$RBP_RB_ALL_ISA = SubLObjectFactory.makeSymbol("RBP-RB-ALL-ISA");
        $sym72$LIST = SubLObjectFactory.makeSymbol("LIST");
        $int73$256 = SubLObjectFactory.makeInteger(256);
        $kw74$NOTED = SubLObjectFactory.makeKeyword("NOTED");
        $sym75$RBP_WFF_ISA_ = SubLObjectFactory.makeSymbol("RBP-WFF-ISA?");
        $sym76$NPP_GENL_ = SubLObjectFactory.makeSymbol("NPP-GENL?");
        $const77$NounCompoundRule = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("NounCompoundRule"));
        $kw78$SYNTACTIC = SubLObjectFactory.makeKeyword("SYNTACTIC");
        $kw79$SEMANTIC = SubLObjectFactory.makeKeyword("SEMANTIC");
        $kw80$OPEN_CLASS = SubLObjectFactory.makeKeyword("OPEN-CLASS");
        $kw81$CLOSED_CLASS = SubLObjectFactory.makeKeyword("CLOSED-CLASS");
        $list82 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("EXCLUDE"), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"));
        $kw83$EXCLUDE = SubLObjectFactory.makeKeyword("EXCLUDE");
        $sym84$INDEXED_TERM_P = SubLObjectFactory.makeSymbol("INDEXED-TERM-P");
        $const85$ncRuleConstraint = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ncRuleConstraint"));
        $list86 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("NCNotEqualsConstraintFn"), (SubLObject)SubLObjectFactory.makeString("NCNotIsaConstraintFn"), (SubLObject)SubLObjectFactory.makeString("NCNotGenlsConstraintFn"));
        $list87 = ConsesLow.list((SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("NCNotEqualsConstraintFn"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("NCEqualsConstraintFn"))), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("NCNotIsaConstraintFn"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("NCIsaConstraintFn"))), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("NCNotGenlsConstraintFn"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("NCGenlsConstraintFn"))));
        $sym88$RBP_FORTS_TO_KEYWORDS = SubLObjectFactory.makeSymbol("RBP-FORTS-TO-KEYWORDS");
        $kw89$UNINITIALIZED = SubLObjectFactory.makeKeyword("UNINITIALIZED");
        $list90 = ConsesLow.list((SubLObject)ConsesLow.cons(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("NCPOSConstraintFn")), (SubLObject)SubLObjectFactory.makeKeyword("POS")), (SubLObject)ConsesLow.cons(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("NCPOSPredConstraintFn")), (SubLObject)SubLObjectFactory.makeKeyword("PRED")), (SubLObject)ConsesLow.cons(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("NCEqualsConstraintFn")), (SubLObject)SubLObjectFactory.makeKeyword("EQL")), (SubLObject)ConsesLow.cons(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("NCGenlsConstraintFn")), (SubLObject)SubLObjectFactory.makeKeyword("GENL")), (SubLObject)ConsesLow.cons(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("NCIsaConstraintFn")), (SubLObject)SubLObjectFactory.makeKeyword("ISA")), (SubLObject)ConsesLow.cons(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TheNCHead")), (SubLObject)SubLObjectFactory.makeKeyword("HEAD")), (SubLObject)ConsesLow.cons(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TheNCModifier")), (SubLObject)SubLObjectFactory.makeKeyword("MODIFIER")));
        $list91 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-CONSTRAINT-TYPE"), (SubLObject)SubLObjectFactory.makeSymbol("KEYWORD"));
        $str92$NCWordUnitConstraintFn = SubLObjectFactory.makeString("NCWordUnitConstraintFn");
        $kw93$WU = SubLObjectFactory.makeKeyword("WU");
        $str94$NCTypeGenlsConstraintFn = SubLObjectFactory.makeString("NCTypeGenlsConstraintFn");
        $list95 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("ISA"), (SubLObject)SubLObjectFactory.makeKeyword("GENL"));
        $const96$IndeterminateTerm = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("IndeterminateTerm"));
        $str97$__Passed_all__S_constraints_for__ = SubLObjectFactory.makeString("~&Passed all ~S constraints for~% ~S~%");
        $sym98$RBP_RB_LAYER_EXEMPT_RULE_LAMBDA_ = SubLObjectFactory.makeSymbol("RBP-RB-LAYER-EXEMPT-RULE-LAMBDA?");
        $str99$__The__S_block_s__S_value__S__did = SubLObjectFactory.makeString("~%The ~S block's ~S value ~S\n did not satisfy the constraints ~S\n on the rule ~S~%~%");
        $kw100$ORIGINAL_STRING = SubLObjectFactory.makeKeyword("ORIGINAL-STRING");
        $sym101$RELEVANT_MT_IS_EVERYTHING = SubLObjectFactory.makeSymbol("RELEVANT-MT-IS-EVERYTHING");
        $const102$EverythingPSC = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("EverythingPSC"));
        $sym103$RBP_RB_KEYS_FROM_BASE_INT = SubLObjectFactory.makeSymbol("RBP-RB-KEYS-FROM-BASE-INT");
        $const104$CollectionType = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CollectionType"));
        $sym105$_TYPE = SubLObjectFactory.makeSymbol("?TYPE");
        $const106$and = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("and"));
        $const107$typeGenls = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("typeGenls"));
        $list108 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("?SPEC"));
        $list109 = ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genls")), (SubLObject)SubLObjectFactory.makeSymbol("?SPEC"), (SubLObject)SubLObjectFactory.makeSymbol("?TYPE")));
        $const110$PositiveInteger = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("PositiveInteger"));
        $const111$ProperNameString = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ProperNameString"));
        $sym112$NOUN_COMPOUND_CONSTRAINT_STRING_SPECS = SubLObjectFactory.makeSymbol("NOUN-COMPOUND-CONSTRAINT-STRING-SPECS");
        $sym113$_COL = SubLObjectFactory.makeSymbol("?COL");
        $list114 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("and")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("assertedSentence")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isaConstraintForNCR")), (SubLObject)SubLObjectFactory.makeSymbol("?RULE"), (SubLObject)SubLObjectFactory.makeSymbol("?INDEXICAL"), (SubLObject)SubLObjectFactory.makeSymbol("?COL"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genls")), (SubLObject)SubLObjectFactory.makeSymbol("?COL"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CharacterString"))));
        $const115$InferencePSC = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("InferencePSC"));
        $sym116$_NOUN_COMPOUND_CONSTRAINT_STRING_SPECS_CACHING_STATE_ = SubLObjectFactory.makeSymbol("*NOUN-COMPOUND-CONSTRAINT-STRING-SPECS-CACHING-STATE*");
    }
    
    public static final class $recursive_block_parser_rule_native extends SubLStructNative
    {
        public SubLObject $cycl;
        public SubLObject $filter_layers;
        private static final SubLStructDeclNative structDecl;
        
        public $recursive_block_parser_rule_native() {
            this.$cycl = (SubLObject)CommonSymbols.NIL;
            this.$filter_layers = (SubLObject)CommonSymbols.NIL;
        }
        
        public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$recursive_block_parser_rule_native.structDecl;
        }
        
        public SubLObject getField2() {
            return this.$cycl;
        }
        
        public SubLObject getField3() {
            return this.$filter_layers;
        }
        
        public SubLObject setField2(final SubLObject value) {
            return this.$cycl = value;
        }
        
        public SubLObject setField3(final SubLObject value) {
            return this.$filter_layers = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$recursive_block_parser_rule_native.class, rbp_rule_bank.$sym37$RECURSIVE_BLOCK_PARSER_RULE, rbp_rule_bank.$sym38$RECURSIVE_BLOCK_PARSER_RULE_P, rbp_rule_bank.$list39, rbp_rule_bank.$list40, new String[] { "$cycl", "$filter_layers" }, rbp_rule_bank.$list41, rbp_rule_bank.$list42, rbp_rule_bank.$sym43$PPRINT_RBP_RULE);
        }
    }
    
    public static final class $recursive_block_parser_rule_p$UnaryFunction extends UnaryFunction
    {
        public $recursive_block_parser_rule_p$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("RECURSIVE-BLOCK-PARSER-RULE-P"));
        }
        
        public SubLObject processItem(final SubLObject arg1) {
            return rbp_rule_bank.recursive_block_parser_rule_p(arg1);
        }
    }
    
    public static final class $rbp_rule_L$BinaryFunction extends BinaryFunction
    {
        public $rbp_rule_L$BinaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("RBP-RULE-<"));
        }
        
        public SubLObject processItem(final SubLObject arg1, final SubLObject arg2) {
            return rbp_rule_bank.rbp_rule_L(arg1, arg2);
        }
    }
    
    public static final class $rbp_rb_layer_exempt_rule_lambdaP$UnaryFunction extends UnaryFunction
    {
        public $rbp_rb_layer_exempt_rule_lambdaP$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("RBP-RB-LAYER-EXEMPT-RULE-LAMBDA?"));
        }
        
        public SubLObject processItem(final SubLObject arg1) {
            return rbp_rule_bank.rbp_rb_layer_exempt_rule_lambdaP(arg1);
        }
    }
}

/*

	Total time: 292 ms
	
*/