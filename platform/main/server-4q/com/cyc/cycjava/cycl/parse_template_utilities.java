package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.constant_handles.reader_make_constant_shell;
import static com.cyc.cycjava.cycl.el_utilities.el_formula_p;
import static com.cyc.cycjava.cycl.subl_macro_promotions.declare_defglobal;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.append;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.eql;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.equal;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.equalp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.funcall;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.max;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.find_if;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.remove;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.cdestructuring_bind_error;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.second;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.subst;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.force_output;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;

import com.cyc.cycjava.cycl.rtp.rtp_type_checkers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.StreamsLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class parse_template_utilities extends SubLTranslatedFile {
    public static final SubLFile me = new parse_template_utilities();

    public static final String myName = "com.cyc.cycjava.cycl.parse_template_utilities";

    public static final String myFingerPrint = "3e7f7488288049754d5079a49ba9b077c8d994340a8ad14d3dd58506431e6ba8";

    // deflexical
    private static final SubLSymbol $apply_old_template_transforms$ = makeSymbol("*APPLY-OLD-TEMPLATE-TRANSFORMS*");

    // deflexical
    // Should the current template transformations be applied?
    private static final SubLSymbol $apply_new_template_transforms$ = makeSymbol("*APPLY-NEW-TEMPLATE-TRANSFORMS*");

    // deflexical
    // CycL specification for '?' in parse templates
    private static final SubLSymbol $question_mark_expression$ = makeSymbol("*QUESTION-MARK-EXPRESSION*");

    // deflexical
    // Template element used in wh-questions for subjects
    private static final SubLSymbol $who_what_expression$ = makeSymbol("*WHO-WHAT-EXPRESSION*");





    // Internal Constants
    public static final SubLList $list0 = list(reader_make_constant_shell(makeString("OptionalOne")), reader_make_constant_shell(makeString("TemplateQuestionMarkMarker")));

    public static final SubLList $list1 = list(reader_make_constant_shell(makeString("RequireOne")), makeString("who"), makeString("what"));

    public static final SubLSymbol $be_wordforms$ = makeSymbol("*BE-WORDFORMS*");

    public static final SubLList $list3 = list(new SubLObject[]{ makeString("is"), makeString("was"), makeString("am"), makeString("will be"), makeString("were"), makeString("are"), makeString("being"), makeString("been"), makeString("be") });

    public static final SubLSymbol $do_wordforms$ = makeSymbol("*DO-WORDFORMS*");

    public static final SubLList $list5 = list(makeString("do"), makeString("does"));

    private static final SubLObject $$Be_TheWord = reader_make_constant_shell(makeString("Be-TheWord"));

    private static final SubLObject $$BeAux = reader_make_constant_shell(makeString("BeAux"));

    private static final SubLObject $$AuxVerb = reader_make_constant_shell(makeString("AuxVerb"));

    public static final SubLList $list9 = list(reader_make_constant_shell(makeString("NPTemplate")), makeKeyword("SUBJECT"));

    public static final SubLList $list10 = list(reader_make_constant_shell(makeString("Do-TheWord")), reader_make_constant_shell(makeString("DoAux")));

    public static final SubLList $list11 = list(reader_make_constant_shell(makeString("RequireOne")), makeString("does"), makeString("do"));

    public static final SubLList $list12 = list(reader_make_constant_shell(makeString("Be-TheWord")), reader_make_constant_shell(makeString("Can-TheWord")), reader_make_constant_shell(makeString("May-TheWord")));

    public static final SubLList $list13 = list(reader_make_constant_shell(makeString("BeAux")), reader_make_constant_shell(makeString("AuxVerb")), reader_make_constant_shell(makeString("Modal")), reader_make_constant_shell(makeString("Verb")));

    public static final SubLList $list14 = list(makeString("can"), makeString("is"), makeString("are"), makeString("may"));



    public static final SubLList $list16 = list(reader_make_constant_shell(makeString("Can-TheWord")), reader_make_constant_shell(makeString("May-TheWord")), reader_make_constant_shell(makeString("Might-TheWord")));

    public static final SubLList $list17 = list(reader_make_constant_shell(makeString("AuxVerb")), reader_make_constant_shell(makeString("Modal")), reader_make_constant_shell(makeString("Verb")));

    public static final SubLList $list18 = list(makeString("can"), makeString("may"), makeString("might"));

    public static final SubLList $list19 = list(reader_make_constant_shell(makeString("Be-TheWord")), reader_make_constant_shell(makeString("Verb")));

    public static final SubLList $list20 = list(reader_make_constant_shell(makeString("Be-TheWord")), reader_make_constant_shell(makeString("BeAux")));

    public static final SubLList $list21 = list(reader_make_constant_shell(makeString("Do-TheWord")), reader_make_constant_shell(makeString("Verb")));

    private static final SubLObject $$Verb = reader_make_constant_shell(makeString("Verb"));

    public static final SubLList $list23 = list(reader_make_constant_shell(makeString("OptionalOne")), reader_make_constant_shell(makeString("OptionalSome")), reader_make_constant_shell(makeString("RequireOne")), reader_make_constant_shell(makeString("RequireSome")));

    public static final SubLSymbol $sym24$FORM_OF_AUXILIARY_VERB_ = makeSymbol("FORM-OF-AUXILIARY-VERB?");

    public static final SubLSymbol $sym25$FORM_OF_MODAL_VERB_ = makeSymbol("FORM-OF-MODAL-VERB?");

    public static final SubLSymbol $sym26$FORM_OF_BE_VERB_ = makeSymbol("FORM-OF-BE-VERB?");

    public static final SubLSymbol $sym27$FORM_OF_DO_VERB_ = makeSymbol("FORM-OF-DO-VERB?");

    public static final SubLSymbol $sym28$FORM_OF_ANY_VERB_ = makeSymbol("FORM-OF-ANY-VERB?");



    private static final SubLObject $$TheSentenceSubject = reader_make_constant_shell(makeString("TheSentenceSubject"));

    public static final SubLList $list31 = list(makeSymbol("RULE"), makeSymbol("CATEGORY"), makeSymbol("PREDICATE"), makeSymbol("PATTERN"), makeSymbol("SEMANTICS"));

    public static final SubLSymbol $sym32$IS_SUBJECT_ = makeSymbol("IS-SUBJECT?");

    public static final SubLSymbol $sym33$_WHAT = makeSymbol("?WHAT");

    private static final SubLObject $$NPTemplate = reader_make_constant_shell(makeString("NPTemplate"));

    public static final SubLList $list35 = list(makeSymbol("CLASS"), makeSymbol("CATEGORY"), makeSymbol("PREDICATE"), makeSymbol("EXPRESSION"), makeSymbol("SEMANTICS"));

    private static final SubLObject $$STemplate = reader_make_constant_shell(makeString("STemplate"));



    private static final SubLObject $$VPTemplate = reader_make_constant_shell(makeString("VPTemplate"));

    public static final SubLString $str39$syntactic_template____s__ = makeString("syntactic-template = ~s~%");

    private static final SubLObject $$queryTemplate_Reln = reader_make_constant_shell(makeString("queryTemplate-Reln"));

    private static final SubLObject $$QuestionTemplate = reader_make_constant_shell(makeString("QuestionTemplate"));

    public static final SubLString $str42$formula1____s__ = makeString("formula1 = ~s~%");

    public static final SubLString $str43$formula2____s__ = makeString("formula2 = ~s~%");

    public static SubLObject transformed_word_form(final SubLObject word_form) {
        final SubLObject word = word_form.first();
        final SubLObject modification = second(word_form);
        return list(word, word.eql($$Be_TheWord) ? $$BeAux : $$AuxVerb);
    }

    public static SubLObject simple_auxiliary_to_yXn_query(final SubLObject formula) {
        final SubLObject word_form = formula.first();
        SubLObject query = formula.rest();
        query = cons($list9, query);
        if (word_form.isList()) {
            query = cons(transformed_word_form(word_form), query);
        } else {
            query = cons(word_form, query);
        }
        query = append(query, list($question_mark_expression$.getGlobalValue()));
        return query;
    }

    public static SubLObject simple_non_auxiliary_to_yXn_query(final SubLObject formula) {
        SubLObject query = cons($list9, formula);
        query = cons($list10, query);
        query = append(query, list($question_mark_expression$.getGlobalValue()));
        return query;
    }

    public static SubLObject simple_auxiliary_to_who_query(final SubLObject formula) {
        final SubLObject aux_word_form = formula.first();
        SubLObject query = formula.rest();
        query = cons(aux_word_form, query);
        query = cons($who_what_expression$.getGlobalValue(), query);
        query = append(query, list($question_mark_expression$.getGlobalValue()));
        return query;
    }

    public static SubLObject simple_auxiliary_to_does_query(final SubLObject formula) {
        final SubLObject aux_word_form = formula.first();
        SubLObject query = formula.rest();
        query = cons($list9, query);
        query = cons($list11, query);
        query = append(query, list($question_mark_expression$.getGlobalValue()));
        return query;
    }

    public static SubLObject form_of_to_beP(final SubLObject head) {
        return eql($$Be_TheWord, head.first());
    }

    public static SubLObject form_of_auxiliary_verbP(final SubLObject form) {
        if (form.isList()) {
            return makeBoolean((NIL != subl_promotions.memberP(form.first(), $list12, UNPROVIDED, UNPROVIDED)) && (NIL != subl_promotions.memberP(second(form), $list13, UNPROVIDED, UNPROVIDED)));
        }
        if (form.isString()) {
            return subl_promotions.memberP(form, $list14, symbol_function(STRING_EQUAL), UNPROVIDED);
        }
        return NIL;
    }

    public static SubLObject form_of_modal_verbP(final SubLObject form) {
        if (form.isList()) {
            return makeBoolean((NIL != subl_promotions.memberP(form.first(), $list16, UNPROVIDED, UNPROVIDED)) && (NIL != subl_promotions.memberP(second(form), $list17, UNPROVIDED, UNPROVIDED)));
        }
        if (form.isString()) {
            return subl_promotions.memberP(form, $list18, symbol_function(STRING_EQUAL), UNPROVIDED);
        }
        return NIL;
    }

    public static SubLObject form_of_be_verbP(final SubLObject form) {
        if (form.isList()) {
            return makeBoolean(form.equal($list19) || form.equal($list20));
        }
        if (form.isString()) {
            return subl_promotions.memberP(form, $be_wordforms$.getGlobalValue(), symbol_function(STRING_EQUAL), UNPROVIDED);
        }
        return NIL;
    }

    public static SubLObject form_of_do_verbP(final SubLObject form) {
        if (form.isList()) {
            return makeBoolean(form.equal($list21) || form.equal($list10));
        }
        if (form.isString()) {
            return subl_promotions.memberP(form, $do_wordforms$.getGlobalValue(), symbol_function(STRING_EQUAL), UNPROVIDED);
        }
        return NIL;
    }

    public static SubLObject form_of_any_verbP(final SubLObject form) {
        if (form.isList()) {
            return equal(second(form), $$Verb);
        }
        if (form.isString()) {
            return form_of_verbP(form);
        }
        return NIL;
    }

    public static SubLObject form_of_verbP(final SubLObject form) {
        return rkf_string_weeders.rkf_verb_stringP(form);
    }

    public static SubLObject form_of_adverbP(final SubLObject form) {
        return rkf_string_weeders.rkf_adverb_stringP(form);
    }

    public static SubLObject old_compute_query_template(final SubLObject template) {
        final SubLObject head_form = template.first();
        SubLObject new_templates = NIL;
        if (head_form.isString()) {
            if (NIL != form_of_auxiliary_verbP(head_form)) {
                new_templates = cons(simple_auxiliary_to_yXn_query(template), new_templates);
            } else
                if (NIL != form_of_verbP(head_form)) {
                    new_templates = cons(simple_non_auxiliary_to_yXn_query(template), new_templates);
                } else
                    if (NIL != form_of_adverbP(head_form)) {
                        new_templates = cons(simple_non_auxiliary_to_yXn_query(template), new_templates);
                    }


        } else
            if (NIL != rtp_type_checkers.rtp_word_itemP(head_form)) {
                if (NIL != form_of_to_beP(head_form)) {
                    new_templates = cons(simple_auxiliary_to_yXn_query(template), new_templates);
                } else {
                    new_templates = cons(simple_non_auxiliary_to_yXn_query(template), new_templates);
                }
            } else
                if (NIL != rtp_type_checkers.rtp_require_one_itemP(head_form)) {
                    final SubLObject one_required = second(head_form);
                    if (NIL != rtp_type_checkers.rtp_word_itemP(one_required)) {
                        new_templates = cons(simple_non_auxiliary_to_yXn_query(template), new_templates);
                    }
                } else {
                    if (NIL == rtp_type_checkers.rtp_optional_one_itemP(head_form)) {
                        return NIL;
                    }
                    final SubLObject one_optional = second(head_form);
                    if (one_optional.isString() && (NIL != rkf_string_weeders.rkf_adverb_stringP(one_optional))) {
                        new_templates = cons(simple_non_auxiliary_to_yXn_query(template), new_templates);
                    }
                }


        return new_templates;
    }

    public static SubLObject is_element_xP(final SubLObject element, final SubLObject x_typeP) {
        if (element.isList() && (NIL != member(element.first(), $list23, UNPROVIDED, UNPROVIDED))) {
            return find_if(x_typeP, element.rest(), UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        return funcall(x_typeP, element);
    }

    public static SubLObject is_aux_elementP(final SubLObject element) {
        return is_element_xP(element, symbol_function($sym24$FORM_OF_AUXILIARY_VERB_));
    }

    public static SubLObject is_modal_elementP(final SubLObject element) {
        return is_element_xP(element, symbol_function($sym25$FORM_OF_MODAL_VERB_));
    }

    public static SubLObject is_be_elementP(final SubLObject element) {
        return is_element_xP(element, symbol_function($sym26$FORM_OF_BE_VERB_));
    }

    public static SubLObject is_do_elementP(final SubLObject element) {
        return is_element_xP(element, symbol_function($sym27$FORM_OF_DO_VERB_));
    }

    public static SubLObject is_verb_elementP(final SubLObject element) {
        return is_element_xP(element, symbol_function($sym28$FORM_OF_ANY_VERB_));
    }

    public static SubLObject compute_query_template(final SubLObject template) {
        final SubLObject head_form = template.first();
        final SubLObject other_forms = template.rest();
        final SubLObject starts_with_auxP = is_aux_elementP(head_form);
        final SubLObject starts_with_modalP = is_modal_elementP(head_form);
        final SubLObject starts_with_beP = is_be_elementP(head_form);
        SubLObject new_templates = NIL;
        if (NIL != $apply_old_template_transforms$.getGlobalValue()) {
            new_templates = append(new_templates, old_compute_query_template(template));
        }
        if (NIL == $apply_new_template_transforms$.getGlobalValue()) {
            return new_templates;
        }
        if (NIL != starts_with_modalP) {
            new_templates = cons(simple_auxiliary_to_who_query(template), new_templates);
        }
        if (((NIL != starts_with_auxP) && (NIL == starts_with_beP)) && (NIL != is_verb_elementP(other_forms.first()))) {
            new_templates = cons(simple_auxiliary_to_does_query(template), new_templates);
        }
        return new_templates;
    }

    public static SubLObject compute_query_semantics(final SubLObject semantics) {
        return subst($SUBJECT, $$TheSentenceSubject, semantics, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject wh_question_style_formula(final SubLObject formula) {
        SubLObject rule = NIL;
        SubLObject category = NIL;
        SubLObject predicate = NIL;
        SubLObject pattern = NIL;
        SubLObject semantics = NIL;
        destructuring_bind_must_consp(formula, formula, $list31);
        rule = formula.first();
        SubLObject current = formula.rest();
        destructuring_bind_must_consp(current, formula, $list31);
        category = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, formula, $list31);
        predicate = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, formula, $list31);
        pattern = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, formula, $list31);
        semantics = current.first();
        current = current.rest();
        if (NIL == current) {
            if (NIL != is_do_elementP(pattern.first())) {
                pattern = pattern.rest();
            }
            pattern = cons($who_what_expression$.getGlobalValue(), pattern);
            pattern = list_utilities.tree_remove_all_if($sym32$IS_SUBJECT_, pattern, UNPROVIDED);
            semantics = subst($sym33$_WHAT, $SUBJECT, semantics, UNPROVIDED, UNPROVIDED);
            return list(rule, category, predicate, pattern, semantics);
        }
        cdestructuring_bind_error(formula, $list31);
        return NIL;
    }

    public static SubLObject is_subjectP(final SubLObject x) {
        return equalp(x, $list9);
    }

    public static SubLObject is_an_np_formP(final SubLObject expression) {
        return makeBoolean(expression.isList() && expression.first().eql($$NPTemplate));
    }

    public static SubLObject convert_s_template_to_vp_template(final SubLObject formula) {
        SubLObject new_formula = formula;
        SubLObject first_np = NIL;
        SubLObject new_expression = NIL;
        SubLObject new_semantics = NIL;
        SubLObject v_class = NIL;
        SubLObject category = NIL;
        SubLObject predicate = NIL;
        SubLObject expression = NIL;
        SubLObject semantics = NIL;
        destructuring_bind_must_consp(formula, formula, $list35);
        v_class = formula.first();
        SubLObject current = formula.rest();
        destructuring_bind_must_consp(current, formula, $list35);
        category = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, formula, $list35);
        predicate = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, formula, $list35);
        expression = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, formula, $list35);
        semantics = current.first();
        current = current.rest();
        if (NIL == current) {
            if (((!category.eql($$STemplate)) || (!expression.isList())) || (NIL == is_an_np_formP(expression.first()))) {
                return $ERROR;
            }
            final SubLObject datum_evaluated_var = expression;
            first_np = datum_evaluated_var.first();
            expression = datum_evaluated_var.rest();
            if (NIL != is_an_np_formP(first_np)) {
                final SubLObject argument = second(first_np);
                new_expression = remove(first_np, expression, EQUALP, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                new_semantics = subst($$TheSentenceSubject, argument, semantics, UNPROVIDED, UNPROVIDED);
                new_formula = list(v_class, $$VPTemplate, predicate, new_expression, new_semantics);
            }
        } else {
            cdestructuring_bind_error(formula, $list35);
        }
        return new_formula;
    }

    public static SubLObject convert_assert_to_query_template(final SubLObject formula) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject normalized_formula = convert_s_template_to_vp_template(formula);
        SubLObject new_formulas = NIL;
        if (NIL != el_formula_p(normalized_formula)) {
            final SubLObject predicate = cycl_utilities.formula_arg2(normalized_formula, UNPROVIDED);
            final SubLObject template = cycl_utilities.formula_arg3(normalized_formula, UNPROVIDED);
            final SubLObject semantics = cycl_utilities.formula_arg4(normalized_formula, UNPROVIDED);
            final SubLObject new_syntactic_templates = compute_query_template(template);
            final SubLObject new_semantics = compute_query_semantics(semantics);
            if (NIL != new_semantics) {
                SubLObject cdolist_list_var = new_syntactic_templates;
                SubLObject syntactic_template = NIL;
                syntactic_template = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    if (lexification_utilities.$lex_trace_level$.getDynamicValue(thread).numGE(max(lexification_utilities.$lex_trace_level$.getDynamicValue(thread), lexification_utilities.$lex_verbose$.getGlobalValue()))) {
                        format(StreamsLow.$trace_output$.getDynamicValue(thread), $str39$syntactic_template____s__, syntactic_template);
                        force_output(StreamsLow.$trace_output$.getDynamicValue(thread));
                    }
                    final SubLObject formula_$1 = list($$queryTemplate_Reln, $$QuestionTemplate, predicate, syntactic_template, new_semantics);
                    if (lexification_utilities.$lex_trace_level$.getDynamicValue(thread).numGE(max(lexification_utilities.$lex_trace_level$.getDynamicValue(thread), lexification_utilities.$lex_verbose$.getGlobalValue()))) {
                        format(StreamsLow.$trace_output$.getDynamicValue(thread), $str42$formula1____s__, formula_$1);
                        force_output(StreamsLow.$trace_output$.getDynamicValue(thread));
                    }
                    new_formulas = cons(formula_$1, new_formulas);
                    if (NIL == subl_promotions.memberP($who_what_expression$.getGlobalValue(), syntactic_template, symbol_function(EQUAL), UNPROVIDED)) {
                        new_formulas = cons(wh_question_style_formula(formula_$1), new_formulas);
                        if (lexification_utilities.$lex_trace_level$.getDynamicValue(thread).numGE(max(lexification_utilities.$lex_trace_level$.getDynamicValue(thread), lexification_utilities.$lex_verbose$.getGlobalValue()))) {
                            format(StreamsLow.$trace_output$.getDynamicValue(thread), $str43$formula2____s__, wh_question_style_formula(formula_$1));
                            force_output(StreamsLow.$trace_output$.getDynamicValue(thread));
                        }
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    syntactic_template = cdolist_list_var.first();
                } 
            }
        }
        return new_formulas;
    }

    public static SubLObject declare_parse_template_utilities_file() {
        declareFunction(me, "transformed_word_form", "TRANSFORMED-WORD-FORM", 1, 0, false);
        declareFunction(me, "simple_auxiliary_to_yXn_query", "SIMPLE-AUXILIARY-TO-Y/N-QUERY", 1, 0, false);
        declareFunction(me, "simple_non_auxiliary_to_yXn_query", "SIMPLE-NON-AUXILIARY-TO-Y/N-QUERY", 1, 0, false);
        declareFunction(me, "simple_auxiliary_to_who_query", "SIMPLE-AUXILIARY-TO-WHO-QUERY", 1, 0, false);
        declareFunction(me, "simple_auxiliary_to_does_query", "SIMPLE-AUXILIARY-TO-DOES-QUERY", 1, 0, false);
        declareFunction(me, "form_of_to_beP", "FORM-OF-TO-BE?", 1, 0, false);
        declareFunction(me, "form_of_auxiliary_verbP", "FORM-OF-AUXILIARY-VERB?", 1, 0, false);
        declareFunction(me, "form_of_modal_verbP", "FORM-OF-MODAL-VERB?", 1, 0, false);
        declareFunction(me, "form_of_be_verbP", "FORM-OF-BE-VERB?", 1, 0, false);
        declareFunction(me, "form_of_do_verbP", "FORM-OF-DO-VERB?", 1, 0, false);
        declareFunction(me, "form_of_any_verbP", "FORM-OF-ANY-VERB?", 1, 0, false);
        declareFunction(me, "form_of_verbP", "FORM-OF-VERB?", 1, 0, false);
        declareFunction(me, "form_of_adverbP", "FORM-OF-ADVERB?", 1, 0, false);
        declareFunction(me, "old_compute_query_template", "OLD-COMPUTE-QUERY-TEMPLATE", 1, 0, false);
        declareFunction(me, "is_element_xP", "IS-ELEMENT-X?", 2, 0, false);
        declareFunction(me, "is_aux_elementP", "IS-AUX-ELEMENT?", 1, 0, false);
        declareFunction(me, "is_modal_elementP", "IS-MODAL-ELEMENT?", 1, 0, false);
        declareFunction(me, "is_be_elementP", "IS-BE-ELEMENT?", 1, 0, false);
        declareFunction(me, "is_do_elementP", "IS-DO-ELEMENT?", 1, 0, false);
        declareFunction(me, "is_verb_elementP", "IS-VERB-ELEMENT?", 1, 0, false);
        declareFunction(me, "compute_query_template", "COMPUTE-QUERY-TEMPLATE", 1, 0, false);
        declareFunction(me, "compute_query_semantics", "COMPUTE-QUERY-SEMANTICS", 1, 0, false);
        declareFunction(me, "wh_question_style_formula", "WH-QUESTION-STYLE-FORMULA", 1, 0, false);
        declareFunction(me, "is_subjectP", "IS-SUBJECT?", 1, 0, false);
        declareFunction(me, "is_an_np_formP", "IS-AN-NP-FORM?", 1, 0, false);
        declareFunction(me, "convert_s_template_to_vp_template", "CONVERT-S-TEMPLATE-TO-VP-TEMPLATE", 1, 0, false);
        declareFunction(me, "convert_assert_to_query_template", "CONVERT-ASSERT-TO-QUERY-TEMPLATE", 1, 0, false);
        return NIL;
    }

    public static SubLObject init_parse_template_utilities_file() {
        deflexical("*APPLY-OLD-TEMPLATE-TRANSFORMS*", T);
        deflexical("*APPLY-NEW-TEMPLATE-TRANSFORMS*", T);
        deflexical("*QUESTION-MARK-EXPRESSION*", $list0);
        deflexical("*WHO-WHAT-EXPRESSION*", $list1);
        deflexical("*BE-WORDFORMS*", SubLTrampolineFile.maybeDefault($be_wordforms$, $be_wordforms$, $list3));
        deflexical("*DO-WORDFORMS*", SubLTrampolineFile.maybeDefault($do_wordforms$, $do_wordforms$, $list5));
        return NIL;
    }

    public static SubLObject setup_parse_template_utilities_file() {
        declare_defglobal($be_wordforms$);
        declare_defglobal($do_wordforms$);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_parse_template_utilities_file();
    }

    @Override
    public void initializeVariables() {
        init_parse_template_utilities_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_parse_template_utilities_file();
    }

    
}

/**
 * Total time: 226 ms
 */
