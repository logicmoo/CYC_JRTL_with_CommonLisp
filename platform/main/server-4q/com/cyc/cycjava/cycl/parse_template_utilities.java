/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.constant_handles.reader_make_constant_shell;
import static com.cyc.cycjava.cycl.el_utilities.el_formula_p;
import static com.cyc.cycjava.cycl.subl_macro_promotions.declare_defglobal;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.append;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.eq;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.eql;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.equal;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.equalp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.funcall;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.max;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.find_if;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.remove;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.boundp;
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
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.util.SubLFiles.LispMethod;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      PARSE-TEMPLATE-UTILITIES
 * source file: /cyc/top/cycl/parse-template-utilities.lisp
 * created:     2019/07/03 17:38:22
 */
public final class parse_template_utilities extends SubLTranslatedFile implements V12 {
    public static final SubLFile me = new parse_template_utilities();

 public static final String myName = "com.cyc.cycjava.cycl.parse_template_utilities";


    // deflexical
    // Definitions
    @LispMethod(comment = "Should the previous template transformations be applied?\ndeflexical")
    private static final SubLSymbol $apply_old_template_transforms$ = makeSymbol("*APPLY-OLD-TEMPLATE-TRANSFORMS*");

    // deflexical
    // Should the current template transformations be applied?
    /**
     * Should the current template transformations be applied?
     */
    @LispMethod(comment = "Should the current template transformations be applied?\ndeflexical")
    private static final SubLSymbol $apply_new_template_transforms$ = makeSymbol("*APPLY-NEW-TEMPLATE-TRANSFORMS*");

    // deflexical
    // CycL specification for '?' in parse templates
    /**
     * CycL specification for '?' in parse templates
     */
    @LispMethod(comment = "CycL specification for \'?\' in parse templates\ndeflexical")
    private static final SubLSymbol $question_mark_expression$ = makeSymbol("*QUESTION-MARK-EXPRESSION*");

    // deflexical
    // Template element used in wh-questions for subjects
    /**
     * Template element used in wh-questions for subjects
     */
    @LispMethod(comment = "Template element used in wh-questions for subjects\ndeflexical")
    private static final SubLSymbol $who_what_expression$ = makeSymbol("*WHO-WHAT-EXPRESSION*");

    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    static private final SubLList $list0 = list(reader_make_constant_shell("OptionalOne"), reader_make_constant_shell("TemplateQuestionMarkMarker"));

    static private final SubLList $list1 = list(reader_make_constant_shell("RequireOne"), makeString("who"), makeString("what"));

    public static final SubLSymbol $be_wordforms$ = makeSymbol("*BE-WORDFORMS*");

    static private final SubLList $list3 = list(new SubLObject[]{ makeString("is"), makeString("was"), makeString("am"), makeString("will be"), makeString("were"), makeString("are"), makeString("being"), makeString("been"), makeString("be") });

    public static final SubLSymbol $do_wordforms$ = makeSymbol("*DO-WORDFORMS*");

    static private final SubLList $list5 = list(makeString("do"), makeString("does"));

    private static final SubLObject $$Be_TheWord = reader_make_constant_shell("Be-TheWord");





    static private final SubLList $list9 = list(reader_make_constant_shell("NPTemplate"), makeKeyword("SUBJECT"));

    static private final SubLList $list10 = list(reader_make_constant_shell("Do-TheWord"), reader_make_constant_shell("DoAux"));

    static private final SubLList $list11 = list(reader_make_constant_shell("RequireOne"), makeString("does"), makeString("do"));

    static private final SubLList $list12 = list(reader_make_constant_shell("Be-TheWord"), reader_make_constant_shell("Can-TheWord"), reader_make_constant_shell("May-TheWord"));

    static private final SubLList $list13 = list(reader_make_constant_shell("BeAux"), reader_make_constant_shell("AuxVerb"), reader_make_constant_shell("Modal"), reader_make_constant_shell("Verb"));

    static private final SubLList $list14 = list(makeString("can"), makeString("is"), makeString("are"), makeString("may"));

    static private final SubLList $list16 = list(reader_make_constant_shell("Can-TheWord"), reader_make_constant_shell("May-TheWord"), reader_make_constant_shell("Might-TheWord"));

    static private final SubLList $list17 = list(reader_make_constant_shell("AuxVerb"), reader_make_constant_shell("Modal"), reader_make_constant_shell("Verb"));

    static private final SubLList $list18 = list(makeString("can"), makeString("may"), makeString("might"));

    static private final SubLList $list19 = list(reader_make_constant_shell("Be-TheWord"), reader_make_constant_shell("Verb"));

    static private final SubLList $list20 = list(reader_make_constant_shell("Be-TheWord"), reader_make_constant_shell("BeAux"));

    static private final SubLList $list21 = list(reader_make_constant_shell("Do-TheWord"), reader_make_constant_shell("Verb"));



    static private final SubLList $list23 = list(reader_make_constant_shell("OptionalOne"), reader_make_constant_shell("OptionalSome"), reader_make_constant_shell("RequireOne"), reader_make_constant_shell("RequireSome"));

    static private final SubLSymbol $sym24$FORM_OF_AUXILIARY_VERB_ = makeSymbol("FORM-OF-AUXILIARY-VERB?");

    static private final SubLSymbol $sym25$FORM_OF_MODAL_VERB_ = makeSymbol("FORM-OF-MODAL-VERB?");

    static private final SubLSymbol $sym26$FORM_OF_BE_VERB_ = makeSymbol("FORM-OF-BE-VERB?");

    static private final SubLSymbol $sym27$FORM_OF_DO_VERB_ = makeSymbol("FORM-OF-DO-VERB?");

    static private final SubLSymbol $sym28$FORM_OF_ANY_VERB_ = makeSymbol("FORM-OF-ANY-VERB?");



    static private final SubLList $list31 = list(makeSymbol("RULE"), makeSymbol("CATEGORY"), makeSymbol("PREDICATE"), makeSymbol("PATTERN"), makeSymbol("SEMANTICS"));

    static private final SubLSymbol $sym32$IS_SUBJECT_ = makeSymbol("IS-SUBJECT?");

    static private final SubLSymbol $sym33$_WHAT = makeSymbol("?WHAT");



    static private final SubLList $list35 = list(makeSymbol("CLASS"), makeSymbol("CATEGORY"), makeSymbol("PREDICATE"), makeSymbol("EXPRESSION"), makeSymbol("SEMANTICS"));





    static private final SubLString $str39$syntactic_template____s__ = makeString("syntactic-template = ~s~%");

    private static final SubLObject $$queryTemplate_Reln = reader_make_constant_shell("queryTemplate-Reln");



    static private final SubLString $str42$formula1____s__ = makeString("formula1 = ~s~%");

    static private final SubLString $str43$formula2____s__ = makeString("formula2 = ~s~%");

    /**
     *
     *
     * @return : converts the word-form type to AuxVerb (with BeAux used for Be-TheWord)
     */
    @LispMethod(comment = "@return : converts the word-form type to AuxVerb (with BeAux used for Be-TheWord)")
    public static final SubLObject transformed_word_form_alt(SubLObject word_form) {
        {
            SubLObject word = word_form.first();
            SubLObject modification = second(word_form);
            return list(word, word == $$Be_TheWord ? ((SubLObject) ($$BeAux)) : $$AuxVerb);
        }
    }

    /**
     *
     *
     * @return : converts the word-form type to AuxVerb (with BeAux used for Be-TheWord)
     */
    @LispMethod(comment = "@return : converts the word-form type to AuxVerb (with BeAux used for Be-TheWord)")
    public static SubLObject transformed_word_form(final SubLObject word_form) {
        final SubLObject word = word_form.first();
        final SubLObject modification = second(word_form);
        return list(word, word.eql($$Be_TheWord) ? $$BeAux : $$AuxVerb);
    }

    /**
     * Convert templates from 'is/be/can ...' to 'Is :SUBJECT ...'
     * and ':SUBJECT who/what is ...:'
     */
    @LispMethod(comment = "Convert templates from \'is/be/can ...\' to \'Is :SUBJECT ...\'\r\nand \':SUBJECT who/what is ...:\'\nConvert templates from \'is/be/can ...\' to \'Is :SUBJECT ...\'\nand \':SUBJECT who/what is ...:\'")
    public static final SubLObject simple_auxiliary_to_yXn_query_alt(SubLObject formula) {
        {
            SubLObject word_form = formula.first();
            SubLObject query = formula.rest();
            query = cons($list_alt9, query);
            if (word_form.isList()) {
                query = cons(com.cyc.cycjava.cycl.parse_template_utilities.transformed_word_form(word_form), query);
            } else {
                query = cons(word_form, query);
            }
            query = append(query, list($question_mark_expression$.getGlobalValue()));
            return query;
        }
    }

    /**
     * Convert templates from 'is/be/can ...' to 'Is :SUBJECT ...'
     * and ':SUBJECT who/what is ...:'
     */
    @LispMethod(comment = "Convert templates from \'is/be/can ...\' to \'Is :SUBJECT ...\'\r\nand \':SUBJECT who/what is ...:\'\nConvert templates from \'is/be/can ...\' to \'Is :SUBJECT ...\'\nand \':SUBJECT who/what is ...:\'")
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

    /**
     * Convert templates from '<verb> ...' to 'Do/does :SUBJECT ...'
     * and ':SUBJECT ... who do/does'
     */
    @LispMethod(comment = "Convert templates from \'<verb> ...\' to \'Do/does :SUBJECT ...\'\r\nand \':SUBJECT ... who do/does\'\nConvert templates from \'<verb> ...\' to \'Do/does :SUBJECT ...\'\nand \':SUBJECT ... who do/does\'")
    public static final SubLObject simple_non_auxiliary_to_yXn_query_alt(SubLObject formula) {
        {
            SubLObject query = formula;
            query = cons($list_alt9, query);
            query = cons($list_alt10, query);
            query = append(query, list($question_mark_expression$.getGlobalValue()));
            return query;
        }
    }

    /**
     * Convert templates from '<verb> ...' to 'Do/does :SUBJECT ...'
     * and ':SUBJECT ... who do/does'
     */
    @LispMethod(comment = "Convert templates from \'<verb> ...\' to \'Do/does :SUBJECT ...\'\r\nand \':SUBJECT ... who do/does\'\nConvert templates from \'<verb> ...\' to \'Do/does :SUBJECT ...\'\nand \':SUBJECT ... who do/does\'")
    public static SubLObject simple_non_auxiliary_to_yXn_query(final SubLObject formula) {
        SubLObject query = cons($list9, formula);
        query = cons($list10, query);
        query = append(query, list($question_mark_expression$.getGlobalValue()));
        return query;
    }

    /**
     * Convert templates from 'Can/may ...' to 'Can/may :SUBJECT...'
     * but not ':SUBJECT who.can/may ...'
     */
    @LispMethod(comment = "Convert templates from \'Can/may ...\' to \'Can/may :SUBJECT...\'\r\nbut not \':SUBJECT who.can/may ...\'\nConvert templates from \'Can/may ...\' to \'Can/may :SUBJECT...\'\nbut not \':SUBJECT who.can/may ...\'")
    public static final SubLObject simple_auxiliary_to_who_query_alt(SubLObject formula) {
        {
            SubLObject aux_word_form = formula.first();
            SubLObject query = formula.rest();
            query = cons(aux_word_form, query);
            query = cons($who_what_expression$.getGlobalValue(), query);
            query = append(query, list($question_mark_expression$.getGlobalValue()));
            return query;
        }
    }

    /**
     * Convert templates from 'Can/may ...' to 'Can/may :SUBJECT...'
     * but not ':SUBJECT who.can/may ...'
     */
    @LispMethod(comment = "Convert templates from \'Can/may ...\' to \'Can/may :SUBJECT...\'\r\nbut not \':SUBJECT who.can/may ...\'\nConvert templates from \'Can/may ...\' to \'Can/may :SUBJECT...\'\nbut not \':SUBJECT who.can/may ...\'")
    public static SubLObject simple_auxiliary_to_who_query(final SubLObject formula) {
        final SubLObject aux_word_form = formula.first();
        SubLObject query = formula.rest();
        query = cons(aux_word_form, query);
        query = cons($who_what_expression$.getGlobalValue(), query);
        query = append(query, list($question_mark_expression$.getGlobalValue()));
        return query;
    }

    /**
     * Convert templates '<aux> <verb> NP' to 'Does :SUBJECT <verb> ...?'
     * and ':SUBJECT who/what does <verb> ...'
     */
    @LispMethod(comment = "Convert templates \'<aux> <verb> NP\' to \'Does :SUBJECT <verb> ...?\'\r\nand \':SUBJECT who/what does <verb> ...\'\nConvert templates \'<aux> <verb> NP\' to \'Does :SUBJECT <verb> ...?\'\nand \':SUBJECT who/what does <verb> ...\'")
    public static final SubLObject simple_auxiliary_to_does_query_alt(SubLObject formula) {
        {
            SubLObject aux_word_form = formula.first();
            SubLObject query = formula.rest();
            query = cons($list_alt9, query);
            query = cons($list_alt11, query);
            query = append(query, list($question_mark_expression$.getGlobalValue()));
            return query;
        }
    }

    /**
     * Convert templates '<aux> <verb> NP' to 'Does :SUBJECT <verb> ...?'
     * and ':SUBJECT who/what does <verb> ...'
     */
    @LispMethod(comment = "Convert templates \'<aux> <verb> NP\' to \'Does :SUBJECT <verb> ...?\'\r\nand \':SUBJECT who/what does <verb> ...\'\nConvert templates \'<aux> <verb> NP\' to \'Does :SUBJECT <verb> ...?\'\nand \':SUBJECT who/what does <verb> ...\'")
    public static SubLObject simple_auxiliary_to_does_query(final SubLObject formula) {
        final SubLObject aux_word_form = formula.first();
        SubLObject query = formula.rest();
        query = cons($list9, query);
        query = cons($list11, query);
        query = append(query, list($question_mark_expression$.getGlobalValue()));
        return query;
    }

    /**
     * T iff head is a wordform specification with Be-TheWord
     */
    @LispMethod(comment = "T iff head is a wordform specification with Be-TheWord")
    public static final SubLObject form_of_to_beP_alt(SubLObject head) {
        return eq($$Be_TheWord, head.first());
    }

    /**
     * T iff head is a wordform specification with Be-TheWord
     */
    @LispMethod(comment = "T iff head is a wordform specification with Be-TheWord")
    public static SubLObject form_of_to_beP(final SubLObject head) {
        return eql($$Be_TheWord, head.first());
    }

    /**
     * Is the wordform (or wordunit specification) for an auxiliary verb
     */
    @LispMethod(comment = "Is the wordform (or wordunit specification) for an auxiliary verb")
    public static final SubLObject form_of_auxiliary_verbP_alt(SubLObject form) {
        if (form.isList()) {
            return makeBoolean((NIL != subl_promotions.memberP(form.first(), $list_alt12, UNPROVIDED, UNPROVIDED)) && (NIL != subl_promotions.memberP(second(form), $list_alt13, UNPROVIDED, UNPROVIDED)));
        } else {
            if (form.isString()) {
                return subl_promotions.memberP(form, $list_alt14, symbol_function(STRING_EQUAL), UNPROVIDED);
            } else {
                return NIL;
            }
        }
    }

    /**
     * Is the wordform (or wordunit specification) for an auxiliary verb
     */
    @LispMethod(comment = "Is the wordform (or wordunit specification) for an auxiliary verb")
    public static SubLObject form_of_auxiliary_verbP(final SubLObject form) {
        if (form.isList()) {
            return makeBoolean((NIL != subl_promotions.memberP(form.first(), $list12, UNPROVIDED, UNPROVIDED)) && (NIL != subl_promotions.memberP(second(form), $list13, UNPROVIDED, UNPROVIDED)));
        }
        if (form.isString()) {
            return subl_promotions.memberP(form, $list14, symbol_function(STRING_EQUAL), UNPROVIDED);
        }
        return NIL;
    }

    /**
     * Is the wordform (or wordunit specification) for a modal verb
     */
    @LispMethod(comment = "Is the wordform (or wordunit specification) for a modal verb")
    public static final SubLObject form_of_modal_verbP_alt(SubLObject form) {
        if (form.isList()) {
            return makeBoolean((NIL != subl_promotions.memberP(form.first(), $list_alt16, UNPROVIDED, UNPROVIDED)) && (NIL != subl_promotions.memberP(second(form), $list_alt17, UNPROVIDED, UNPROVIDED)));
        } else {
            if (form.isString()) {
                return subl_promotions.memberP(form, $list_alt18, symbol_function(STRING_EQUAL), UNPROVIDED);
            } else {
                return NIL;
            }
        }
    }

    /**
     * Is the wordform (or wordunit specification) for a modal verb
     */
    @LispMethod(comment = "Is the wordform (or wordunit specification) for a modal verb")
    public static SubLObject form_of_modal_verbP(final SubLObject form) {
        if (form.isList()) {
            return makeBoolean((NIL != subl_promotions.memberP(form.first(), $list16, UNPROVIDED, UNPROVIDED)) && (NIL != subl_promotions.memberP(second(form), $list17, UNPROVIDED, UNPROVIDED)));
        }
        if (form.isString()) {
            return subl_promotions.memberP(form, $list18, symbol_function(STRING_EQUAL), UNPROVIDED);
        }
        return NIL;
    }

    /**
     * Is the wordform (or wordunit specification) for an a form of 'be'
     */
    @LispMethod(comment = "Is the wordform (or wordunit specification) for an a form of \'be\'")
    public static final SubLObject form_of_be_verbP_alt(SubLObject form) {
        if (form.isList()) {
            return makeBoolean(form.equal($list_alt19) || form.equal($list_alt20));
        } else {
            if (form.isString()) {
                return subl_promotions.memberP(form, $be_wordforms$.getGlobalValue(), symbol_function(STRING_EQUAL), UNPROVIDED);
            } else {
                return NIL;
            }
        }
    }

    /**
     * Is the wordform (or wordunit specification) for an a form of 'be'
     */
    @LispMethod(comment = "Is the wordform (or wordunit specification) for an a form of \'be\'")
    public static SubLObject form_of_be_verbP(final SubLObject form) {
        if (form.isList()) {
            return makeBoolean(form.equal($list19) || form.equal($list20));
        }
        if (form.isString()) {
            return subl_promotions.memberP(form, $be_wordforms$.getGlobalValue(), symbol_function(STRING_EQUAL), UNPROVIDED);
        }
        return NIL;
    }

    /**
     * Is the wordform (or wordunit specification) for an a form of 'do'
     */
    @LispMethod(comment = "Is the wordform (or wordunit specification) for an a form of \'do\'")
    public static final SubLObject form_of_do_verbP_alt(SubLObject form) {
        if (form.isList()) {
            return makeBoolean(form.equal($list_alt21) || form.equal($list_alt10));
        } else {
            if (form.isString()) {
                return subl_promotions.memberP(form, $do_wordforms$.getGlobalValue(), symbol_function(STRING_EQUAL), UNPROVIDED);
            } else {
                return NIL;
            }
        }
    }

    /**
     * Is the wordform (or wordunit specification) for an a form of 'do'
     */
    @LispMethod(comment = "Is the wordform (or wordunit specification) for an a form of \'do\'")
    public static SubLObject form_of_do_verbP(final SubLObject form) {
        if (form.isList()) {
            return makeBoolean(form.equal($list21) || form.equal($list10));
        }
        if (form.isString()) {
            return subl_promotions.memberP(form, $do_wordforms$.getGlobalValue(), symbol_function(STRING_EQUAL), UNPROVIDED);
        }
        return NIL;
    }

    /**
     * Is the wordform (or wordunit specification) for any verb
     */
    @LispMethod(comment = "Is the wordform (or wordunit specification) for any verb")
    public static final SubLObject form_of_any_verbP_alt(SubLObject form) {
        if (form.isList()) {
            return equal(second(form), $$Verb);
        } else {
            if (form.isString()) {
                return com.cyc.cycjava.cycl.parse_template_utilities.form_of_verbP(form);
            } else {
                return NIL;
            }
        }
    }

    /**
     * Is the wordform (or wordunit specification) for any verb
     */
    @LispMethod(comment = "Is the wordform (or wordunit specification) for any verb")
    public static SubLObject form_of_any_verbP(final SubLObject form) {
        if (form.isList()) {
            return equal(second(form), $$Verb);
        }
        if (form.isString()) {
            return form_of_verbP(form);
        }
        return NIL;
    }

    /**
     * T iff wordform FORM is a verb in Cyc's lexicon
     */
    @LispMethod(comment = "T iff wordform FORM is a verb in Cyc\'s lexicon")
    public static final SubLObject form_of_verbP_alt(SubLObject form) {
        return rkf_string_weeders.rkf_verb_stringP(form);
    }

    /**
     * T iff wordform FORM is a verb in Cyc's lexicon
     */
    @LispMethod(comment = "T iff wordform FORM is a verb in Cyc\'s lexicon")
    public static SubLObject form_of_verbP(final SubLObject form) {
        return rkf_string_weeders.rkf_verb_stringP(form);
    }

    /**
     * T iff wordform FORM is a adverb in Cyc's lexicon
     */
    @LispMethod(comment = "T iff wordform FORM is a adverb in Cyc\'s lexicon")
    public static final SubLObject form_of_adverbP_alt(SubLObject form) {
        return rkf_string_weeders.rkf_adverb_stringP(form);
    }

    /**
     * T iff wordform FORM is a adverb in Cyc's lexicon
     */
    @LispMethod(comment = "T iff wordform FORM is a adverb in Cyc\'s lexicon")
    public static SubLObject form_of_adverbP(final SubLObject form) {
        return rkf_string_weeders.rkf_adverb_stringP(form);
    }

    /**
     * Convert the parse template into queries of the form 'Is <Subj> <VP>'
     * and 'Does '<Subj> <VP>?'
     *
     * @unknown combine with the (new) @xref compute-query-template
     */
    @LispMethod(comment = "Convert the parse template into queries of the form \'Is <Subj> <VP>\'\r\nand \'Does \'<Subj> <VP>?\'\r\n\r\n@unknown combine with the (new) @xref compute-query-template\nConvert the parse template into queries of the form \'Is <Subj> <VP>\'\nand \'Does \'<Subj> <VP>?\'")
    public static final SubLObject old_compute_query_template_alt(SubLObject template) {
        {
            SubLObject head_form = template.first();
            SubLObject new_templates = NIL;
            if (head_form.isString()) {
                if (NIL != com.cyc.cycjava.cycl.parse_template_utilities.form_of_auxiliary_verbP(head_form)) {
                    new_templates = cons(com.cyc.cycjava.cycl.parse_template_utilities.simple_auxiliary_to_yXn_query(template), new_templates);
                } else {
                    if (NIL != com.cyc.cycjava.cycl.parse_template_utilities.form_of_verbP(head_form)) {
                        new_templates = cons(com.cyc.cycjava.cycl.parse_template_utilities.simple_non_auxiliary_to_yXn_query(template), new_templates);
                    } else {
                        if (NIL != com.cyc.cycjava.cycl.parse_template_utilities.form_of_adverbP(head_form)) {
                            new_templates = cons(com.cyc.cycjava.cycl.parse_template_utilities.simple_non_auxiliary_to_yXn_query(template), new_templates);
                        }
                    }
                }
            } else {
                if (NIL != rtp_type_checkers.rtp_word_itemP(head_form)) {
                    if (NIL != com.cyc.cycjava.cycl.parse_template_utilities.form_of_to_beP(head_form)) {
                        new_templates = cons(com.cyc.cycjava.cycl.parse_template_utilities.simple_auxiliary_to_yXn_query(template), new_templates);
                    } else {
                        new_templates = cons(com.cyc.cycjava.cycl.parse_template_utilities.simple_non_auxiliary_to_yXn_query(template), new_templates);
                    }
                } else {
                    if (NIL != rtp_type_checkers.rtp_require_one_itemP(head_form)) {
                        {
                            SubLObject one_required = second(head_form);
                            if (NIL != rtp_type_checkers.rtp_word_itemP(one_required)) {
                                new_templates = cons(com.cyc.cycjava.cycl.parse_template_utilities.simple_non_auxiliary_to_yXn_query(template), new_templates);
                            }
                        }
                    } else {
                        if (NIL != rtp_type_checkers.rtp_optional_one_itemP(head_form)) {
                            {
                                SubLObject one_optional = second(head_form);
                                if (one_optional.isString() && (NIL != rkf_string_weeders.rkf_adverb_stringP(one_optional))) {
                                    new_templates = cons(com.cyc.cycjava.cycl.parse_template_utilities.simple_non_auxiliary_to_yXn_query(template), new_templates);
                                }
                            }
                        } else {
                            return NIL;
                        }
                    }
                }
            }
            return new_templates;
        }
    }

    /**
     * Convert the parse template into queries of the form 'Is <Subj> <VP>'
     * and 'Does '<Subj> <VP>?'
     *
     * @unknown combine with the (new) @xref compute-query-template
     */
    @LispMethod(comment = "Convert the parse template into queries of the form \'Is <Subj> <VP>\'\r\nand \'Does \'<Subj> <VP>?\'\r\n\r\n@unknown combine with the (new) @xref compute-query-template\nConvert the parse template into queries of the form \'Is <Subj> <VP>\'\nand \'Does \'<Subj> <VP>?\'")
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

    /**
     *
     *
     * @return boolean ; does ELEMENT satisfy criteria defined by function X-TYPE?
     * @unknown X-TYPE? is a boolean function that applies to either a raw wordform or a wordunit&POS
    specification (e.g., (Can-TheWord #$Noun))
     */
    @LispMethod(comment = "@return boolean ; does ELEMENT satisfy criteria defined by function X-TYPE?\r\n@unknown X-TYPE? is a boolean function that applies to either a raw wordform or a wordunit&POS\r\nspecification (e.g., (Can-TheWord #$Noun))")
    public static final SubLObject is_element_xP_alt(SubLObject element, SubLObject x_typeP) {
        if (element.isList() && (NIL != member(element.first(), $list_alt23, UNPROVIDED, UNPROVIDED))) {
            return find_if(x_typeP, element.rest(), UNPROVIDED, UNPROVIDED, UNPROVIDED);
        } else {
            return funcall(x_typeP, element);
        }
    }

    /**
     *
     *
     * @return boolean ; does ELEMENT satisfy criteria defined by function X-TYPE?
     * @unknown X-TYPE? is a boolean function that applies to either a raw wordform or a wordunit&POS
    specification (e.g., (Can-TheWord #$Noun))
     */
    @LispMethod(comment = "@return boolean ; does ELEMENT satisfy criteria defined by function X-TYPE?\r\n@unknown X-TYPE? is a boolean function that applies to either a raw wordform or a wordunit&POS\r\nspecification (e.g., (Can-TheWord #$Noun))")
    public static SubLObject is_element_xP(final SubLObject element, final SubLObject x_typeP) {
        if (element.isList() && (NIL != member(element.first(), $list23, UNPROVIDED, UNPROVIDED))) {
            return find_if(x_typeP, element.rest(), UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        return funcall(x_typeP, element);
    }

    /**
     *
     *
     * @return boolean ; does ELEMENT specify an auxiliary word
     */
    @LispMethod(comment = "@return boolean ; does ELEMENT specify an auxiliary word")
    public static final SubLObject is_aux_elementP_alt(SubLObject element) {
        return com.cyc.cycjava.cycl.parse_template_utilities.is_element_xP(element, symbol_function($sym24$FORM_OF_AUXILIARY_VERB_));
    }

    /**
     *
     *
     * @return boolean ; does ELEMENT specify an auxiliary word
     */
    @LispMethod(comment = "@return boolean ; does ELEMENT specify an auxiliary word")
    public static SubLObject is_aux_elementP(final SubLObject element) {
        return is_element_xP(element, symbol_function($sym24$FORM_OF_AUXILIARY_VERB_));
    }

    /**
     *
     *
     * @return boolean ; does ELEMENT specify an auxiliary word
     */
    @LispMethod(comment = "@return boolean ; does ELEMENT specify an auxiliary word")
    public static final SubLObject is_modal_elementP_alt(SubLObject element) {
        return com.cyc.cycjava.cycl.parse_template_utilities.is_element_xP(element, symbol_function($sym25$FORM_OF_MODAL_VERB_));
    }

    /**
     *
     *
     * @return boolean ; does ELEMENT specify an auxiliary word
     */
    @LispMethod(comment = "@return boolean ; does ELEMENT specify an auxiliary word")
    public static SubLObject is_modal_elementP(final SubLObject element) {
        return is_element_xP(element, symbol_function($sym25$FORM_OF_MODAL_VERB_));
    }

    /**
     *
     *
     * @return boolean ; does ELEMENT specify an auxiliary word
     */
    @LispMethod(comment = "@return boolean ; does ELEMENT specify an auxiliary word")
    public static final SubLObject is_be_elementP_alt(SubLObject element) {
        return com.cyc.cycjava.cycl.parse_template_utilities.is_element_xP(element, symbol_function($sym26$FORM_OF_BE_VERB_));
    }

    /**
     *
     *
     * @return boolean ; does ELEMENT specify an auxiliary word
     */
    @LispMethod(comment = "@return boolean ; does ELEMENT specify an auxiliary word")
    public static SubLObject is_be_elementP(final SubLObject element) {
        return is_element_xP(element, symbol_function($sym26$FORM_OF_BE_VERB_));
    }

    /**
     *
     *
     * @return boolean ; does ELEMENT specify a do-form
     */
    @LispMethod(comment = "@return boolean ; does ELEMENT specify a do-form")
    public static final SubLObject is_do_elementP_alt(SubLObject element) {
        return com.cyc.cycjava.cycl.parse_template_utilities.is_element_xP(element, symbol_function($sym27$FORM_OF_DO_VERB_));
    }

    /**
     *
     *
     * @return boolean ; does ELEMENT specify a do-form
     */
    @LispMethod(comment = "@return boolean ; does ELEMENT specify a do-form")
    public static SubLObject is_do_elementP(final SubLObject element) {
        return is_element_xP(element, symbol_function($sym27$FORM_OF_DO_VERB_));
    }

    /**
     *
     *
     * @return boolean ; does ELEMENT specify an auxiliary word
     */
    @LispMethod(comment = "@return boolean ; does ELEMENT specify an auxiliary word")
    public static final SubLObject is_verb_elementP_alt(SubLObject element) {
        return com.cyc.cycjava.cycl.parse_template_utilities.is_element_xP(element, symbol_function($sym28$FORM_OF_ANY_VERB_));
    }

    /**
     *
     *
     * @return boolean ; does ELEMENT specify an auxiliary word
     */
    @LispMethod(comment = "@return boolean ; does ELEMENT specify an auxiliary word")
    public static SubLObject is_verb_elementP(final SubLObject element) {
        return is_element_xP(element, symbol_function($sym28$FORM_OF_ANY_VERB_));
    }

    /**
     * Create a series of parse template from the parse template
     */
    @LispMethod(comment = "Create a series of parse template from the parse template")
    public static final SubLObject compute_query_template_alt(SubLObject template) {
        {
            SubLObject head_form = template.first();
            SubLObject other_forms = template.rest();
            SubLObject starts_with_auxP = com.cyc.cycjava.cycl.parse_template_utilities.is_aux_elementP(head_form);
            SubLObject starts_with_modalP = com.cyc.cycjava.cycl.parse_template_utilities.is_modal_elementP(head_form);
            SubLObject starts_with_beP = com.cyc.cycjava.cycl.parse_template_utilities.is_be_elementP(head_form);
            SubLObject new_templates = NIL;
            if (NIL != $apply_old_template_transforms$.getGlobalValue()) {
                new_templates = append(new_templates, com.cyc.cycjava.cycl.parse_template_utilities.old_compute_query_template(template));
            }
            if (NIL == $apply_new_template_transforms$.getGlobalValue()) {
                return new_templates;
            }
            if (NIL != starts_with_modalP) {
                new_templates = cons(com.cyc.cycjava.cycl.parse_template_utilities.simple_auxiliary_to_who_query(template), new_templates);
            }
            if (((NIL != starts_with_auxP) && (NIL == starts_with_beP)) && (NIL != com.cyc.cycjava.cycl.parse_template_utilities.is_verb_elementP(other_forms.first()))) {
                new_templates = cons(com.cyc.cycjava.cycl.parse_template_utilities.simple_auxiliary_to_does_query(template), new_templates);
            }
            return new_templates;
        }
    }

    @LispMethod(comment = "Create a series of parse template from the parse template")
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

    /**
     * performs fix-ups for semantic templates (e.g., #$TheSentenceSubject => :SUBJECT)
     */
    @LispMethod(comment = "performs fix-ups for semantic templates (e.g., #$TheSentenceSubject => :SUBJECT)")
    public static final SubLObject compute_query_semantics_alt(SubLObject semantics) {
        return subst($SUBJECT, $$TheSentenceSubject, semantics, UNPROVIDED, UNPROVIDED);
    }

    @LispMethod(comment = "performs fix-ups for semantic templates (e.g., #$TheSentenceSubject => :SUBJECT)")
    public static SubLObject compute_query_semantics(final SubLObject semantics) {
        return subst($SUBJECT, $$TheSentenceSubject, semantics, UNPROVIDED, UNPROVIDED);
    }

    /**
     * Converts the sentential template into a question one:
     * - all references of :SUBJECT are converted into ?WHAT
     */
    @LispMethod(comment = "Converts the sentential template into a question one:\r\n- all references of :SUBJECT are converted into ?WHAT\nConverts the sentential template into a question one:\n- all references of :SUBJECT are converted into ?WHAT")
    public static final SubLObject wh_question_style_formula_alt(SubLObject formula) {
        {
            SubLObject datum = formula;
            SubLObject current = datum;
            SubLObject rule = NIL;
            SubLObject category = NIL;
            SubLObject predicate = NIL;
            SubLObject pattern = NIL;
            SubLObject semantics = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt31);
            rule = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt31);
            category = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt31);
            predicate = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt31);
            pattern = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt31);
            semantics = current.first();
            current = current.rest();
            if (NIL == current) {
                if (NIL != com.cyc.cycjava.cycl.parse_template_utilities.is_do_elementP(pattern.first())) {
                    pattern = pattern.rest();
                }
                pattern = cons($who_what_expression$.getGlobalValue(), pattern);
                pattern = list_utilities.tree_remove_all_if($sym32$IS_SUBJECT_, pattern, UNPROVIDED);
                semantics = subst($sym33$_WHAT, $SUBJECT, semantics, UNPROVIDED, UNPROVIDED);
                return list(rule, category, predicate, pattern, semantics);
            } else {
                cdestructuring_bind_error(datum, $list_alt31);
            }
        }
        return NIL;
    }

    @LispMethod(comment = "Converts the sentential template into a question one:\r\n- all references of :SUBJECT are converted into ?WHAT\nConverts the sentential template into a question one:\n- all references of :SUBJECT are converted into ?WHAT")
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

    /**
     * T iff template element X is a placeholder for the subject
     */
    @LispMethod(comment = "T iff template element X is a placeholder for the subject")
    public static final SubLObject is_subjectP_alt(SubLObject x) {
        return equalp(x, $list_alt9);
    }

    @LispMethod(comment = "T iff template element X is a placeholder for the subject")
    public static SubLObject is_subjectP(final SubLObject x) {
        return equalp(x, $list9);
    }

    /**
     *
     *
     * @return boolean : whether template EXPRESSION refers to an NP
     */
    @LispMethod(comment = "@return boolean : whether template EXPRESSION refers to an NP")
    public static final SubLObject is_an_np_formP_alt(SubLObject expression) {
        return makeBoolean(expression.isList() && (expression.first() == $$NPTemplate));
    }

    /**
     *
     *
     * @return boolean : whether template EXPRESSION refers to an NP
     */
    @LispMethod(comment = "@return boolean : whether template EXPRESSION refers to an NP")
    public static SubLObject is_an_np_formP(final SubLObject expression) {
        return makeBoolean(expression.isList() && expression.first().eql($$NPTemplate));
    }

    /**
     *
     *
     * @return formula or :ERROR: VPTemplate version of STemplate given by FORMULA
     * @unknown If the template is already an STemplate or can't be converted, :ERROR is returned
     */
    @LispMethod(comment = "@return formula or :ERROR: VPTemplate version of STemplate given by FORMULA\r\n@unknown If the template is already an STemplate or can\'t be converted, :ERROR is returned")
    public static final SubLObject convert_s_template_to_vp_template_alt(SubLObject formula) {
        {
            SubLObject new_formula = formula;
            SubLObject first_np = NIL;
            SubLObject new_expression = NIL;
            SubLObject new_semantics = NIL;
            SubLObject datum = formula;
            SubLObject current = datum;
            SubLObject v_class = NIL;
            SubLObject category = NIL;
            SubLObject predicate = NIL;
            SubLObject expression = NIL;
            SubLObject semantics = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt35);
            v_class = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt35);
            category = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt35);
            predicate = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt35);
            expression = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt35);
            semantics = current.first();
            current = current.rest();
            if (NIL == current) {
                if (!(((category == $$STemplate) && expression.isList()) && (NIL != com.cyc.cycjava.cycl.parse_template_utilities.is_an_np_formP(expression.first())))) {
                    return $ERROR;
                }
                {
                    SubLObject datum_evaluated_var = expression;
                    first_np = datum_evaluated_var.first();
                    expression = datum_evaluated_var.rest();
                }
                if (NIL != com.cyc.cycjava.cycl.parse_template_utilities.is_an_np_formP(first_np)) {
                    {
                        SubLObject argument = second(first_np);
                        new_expression = remove(first_np, expression, EQUALP, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        new_semantics = subst($$TheSentenceSubject, argument, semantics, UNPROVIDED, UNPROVIDED);
                        new_formula = list(v_class, $$VPTemplate, predicate, new_expression, new_semantics);
                    }
                }
            } else {
                cdestructuring_bind_error(datum, $list_alt35);
            }
            return new_formula;
        }
    }

    /**
     *
     *
     * @return formula or :ERROR: VPTemplate version of STemplate given by FORMULA
     * @unknown If the template is already an STemplate or can't be converted, :ERROR is returned
     */
    @LispMethod(comment = "@return formula or :ERROR: VPTemplate version of STemplate given by FORMULA\r\n@unknown If the template is already an STemplate or can\'t be converted, :ERROR is returned")
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

    public static final SubLObject convert_assert_to_query_template_alt(SubLObject formula) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject normalized_formula = com.cyc.cycjava.cycl.parse_template_utilities.convert_s_template_to_vp_template(formula);
                SubLObject new_formulas = NIL;
                if (NIL != el_formula_p(normalized_formula)) {
                    {
                        SubLObject predicate = cycl_utilities.formula_arg2(normalized_formula, UNPROVIDED);
                        SubLObject template = cycl_utilities.formula_arg3(normalized_formula, UNPROVIDED);
                        SubLObject semantics = cycl_utilities.formula_arg4(normalized_formula, UNPROVIDED);
                        SubLObject new_syntactic_templates = com.cyc.cycjava.cycl.parse_template_utilities.compute_query_template(template);
                        SubLObject new_semantics = com.cyc.cycjava.cycl.parse_template_utilities.compute_query_semantics(semantics);
                        if (NIL != new_semantics) {
                            {
                                SubLObject cdolist_list_var = new_syntactic_templates;
                                SubLObject syntactic_template = NIL;
                                for (syntactic_template = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , syntactic_template = cdolist_list_var.first()) {
                                    if (lexification_utilities.$lex_trace_level$.getDynamicValue(thread).numGE(max(lexification_utilities.$lex_trace_level$.getDynamicValue(thread), lexification_utilities.$lex_verbose$.getGlobalValue()))) {
                                        format(StreamsLow.$trace_output$.getDynamicValue(thread), $str_alt39$syntactic_template____s__, syntactic_template);
                                        force_output(StreamsLow.$trace_output$.getDynamicValue(thread));
                                    }
                                    {
                                        SubLObject formula_1 = list($$queryTemplate_Reln, $$QuestionTemplate, predicate, syntactic_template, new_semantics);
                                        if (lexification_utilities.$lex_trace_level$.getDynamicValue(thread).numGE(max(lexification_utilities.$lex_trace_level$.getDynamicValue(thread), lexification_utilities.$lex_verbose$.getGlobalValue()))) {
                                            format(StreamsLow.$trace_output$.getDynamicValue(thread), $str_alt42$formula1____s__, formula_1);
                                            force_output(StreamsLow.$trace_output$.getDynamicValue(thread));
                                        }
                                        new_formulas = cons(formula_1, new_formulas);
                                        if (NIL == subl_promotions.memberP($who_what_expression$.getGlobalValue(), syntactic_template, symbol_function(EQUAL), UNPROVIDED)) {
                                            new_formulas = cons(com.cyc.cycjava.cycl.parse_template_utilities.wh_question_style_formula(formula_1), new_formulas);
                                            if (lexification_utilities.$lex_trace_level$.getDynamicValue(thread).numGE(max(lexification_utilities.$lex_trace_level$.getDynamicValue(thread), lexification_utilities.$lex_verbose$.getGlobalValue()))) {
                                                format(StreamsLow.$trace_output$.getDynamicValue(thread), $str_alt43$formula2____s__, com.cyc.cycjava.cycl.parse_template_utilities.wh_question_style_formula(formula_1));
                                                force_output(StreamsLow.$trace_output$.getDynamicValue(thread));
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                return new_formulas;
            }
        }
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
        declareFunction("transformed_word_form", "TRANSFORMED-WORD-FORM", 1, 0, false);
        declareFunction("simple_auxiliary_to_yXn_query", "SIMPLE-AUXILIARY-TO-Y/N-QUERY", 1, 0, false);
        declareFunction("simple_non_auxiliary_to_yXn_query", "SIMPLE-NON-AUXILIARY-TO-Y/N-QUERY", 1, 0, false);
        declareFunction("simple_auxiliary_to_who_query", "SIMPLE-AUXILIARY-TO-WHO-QUERY", 1, 0, false);
        declareFunction("simple_auxiliary_to_does_query", "SIMPLE-AUXILIARY-TO-DOES-QUERY", 1, 0, false);
        declareFunction("form_of_to_beP", "FORM-OF-TO-BE?", 1, 0, false);
        declareFunction("form_of_auxiliary_verbP", "FORM-OF-AUXILIARY-VERB?", 1, 0, false);
        declareFunction("form_of_modal_verbP", "FORM-OF-MODAL-VERB?", 1, 0, false);
        declareFunction("form_of_be_verbP", "FORM-OF-BE-VERB?", 1, 0, false);
        declareFunction("form_of_do_verbP", "FORM-OF-DO-VERB?", 1, 0, false);
        declareFunction("form_of_any_verbP", "FORM-OF-ANY-VERB?", 1, 0, false);
        declareFunction("form_of_verbP", "FORM-OF-VERB?", 1, 0, false);
        declareFunction("form_of_adverbP", "FORM-OF-ADVERB?", 1, 0, false);
        declareFunction("old_compute_query_template", "OLD-COMPUTE-QUERY-TEMPLATE", 1, 0, false);
        declareFunction("is_element_xP", "IS-ELEMENT-X?", 2, 0, false);
        declareFunction("is_aux_elementP", "IS-AUX-ELEMENT?", 1, 0, false);
        declareFunction("is_modal_elementP", "IS-MODAL-ELEMENT?", 1, 0, false);
        declareFunction("is_be_elementP", "IS-BE-ELEMENT?", 1, 0, false);
        declareFunction("is_do_elementP", "IS-DO-ELEMENT?", 1, 0, false);
        declareFunction("is_verb_elementP", "IS-VERB-ELEMENT?", 1, 0, false);
        declareFunction("compute_query_template", "COMPUTE-QUERY-TEMPLATE", 1, 0, false);
        declareFunction("compute_query_semantics", "COMPUTE-QUERY-SEMANTICS", 1, 0, false);
        declareFunction("wh_question_style_formula", "WH-QUESTION-STYLE-FORMULA", 1, 0, false);
        declareFunction("is_subjectP", "IS-SUBJECT?", 1, 0, false);
        declareFunction("is_an_np_formP", "IS-AN-NP-FORM?", 1, 0, false);
        declareFunction("convert_s_template_to_vp_template", "CONVERT-S-TEMPLATE-TO-VP-TEMPLATE", 1, 0, false);
        declareFunction("convert_assert_to_query_template", "CONVERT-ASSERT-TO-QUERY-TEMPLATE", 1, 0, false);
        return NIL;
    }

    public static final SubLObject init_parse_template_utilities_file_alt() {
        deflexical("*APPLY-OLD-TEMPLATE-TRANSFORMS*", T);
        deflexical("*APPLY-NEW-TEMPLATE-TRANSFORMS*", T);
        deflexical("*QUESTION-MARK-EXPRESSION*", $list_alt0);
        deflexical("*WHO-WHAT-EXPRESSION*", $list_alt1);
        deflexical("*BE-WORDFORMS*", NIL != boundp($be_wordforms$) ? ((SubLObject) ($be_wordforms$.getGlobalValue())) : $list_alt3);
        deflexical("*DO-WORDFORMS*", NIL != boundp($do_wordforms$) ? ((SubLObject) ($do_wordforms$.getGlobalValue())) : $list_alt5);
        return NIL;
    }

    public static SubLObject init_parse_template_utilities_file() {
        if (SubLFiles.USE_V1) {
            deflexical("*APPLY-OLD-TEMPLATE-TRANSFORMS*", T);
            deflexical("*APPLY-NEW-TEMPLATE-TRANSFORMS*", T);
            deflexical("*QUESTION-MARK-EXPRESSION*", $list0);
            deflexical("*WHO-WHAT-EXPRESSION*", $list1);
            deflexical("*BE-WORDFORMS*", SubLTrampolineFile.maybeDefault($be_wordforms$, $be_wordforms$, $list3));
            deflexical("*DO-WORDFORMS*", SubLTrampolineFile.maybeDefault($do_wordforms$, $do_wordforms$, $list5));
        }
        if (SubLFiles.USE_V2) {
            deflexical("*BE-WORDFORMS*", NIL != boundp($be_wordforms$) ? ((SubLObject) ($be_wordforms$.getGlobalValue())) : $list_alt3);
            deflexical("*DO-WORDFORMS*", NIL != boundp($do_wordforms$) ? ((SubLObject) ($do_wordforms$.getGlobalValue())) : $list_alt5);
        }
        return NIL;
    }

    public static SubLObject init_parse_template_utilities_file_Previous() {
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

    static {
    }

    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    static private final SubLList $list_alt0 = list(reader_make_constant_shell("OptionalOne"), reader_make_constant_shell("TemplateQuestionMarkMarker"));

    static private final SubLList $list_alt1 = list(reader_make_constant_shell("RequireOne"), makeString("who"), makeString("what"));

    static private final SubLList $list_alt3 = list(new SubLObject[]{ makeString("is"), makeString("was"), makeString("am"), makeString("will be"), makeString("were"), makeString("are"), makeString("being"), makeString("been"), makeString("be") });

    static private final SubLList $list_alt5 = list(makeString("do"), makeString("does"));

    static private final SubLList $list_alt9 = list(reader_make_constant_shell("NPTemplate"), makeKeyword("SUBJECT"));

    static private final SubLList $list_alt10 = list(reader_make_constant_shell("Do-TheWord"), reader_make_constant_shell("DoAux"));

    static private final SubLList $list_alt11 = list(reader_make_constant_shell("RequireOne"), makeString("does"), makeString("do"));

    static private final SubLList $list_alt12 = list(reader_make_constant_shell("Be-TheWord"), reader_make_constant_shell("Can-TheWord"), reader_make_constant_shell("May-TheWord"));

    static private final SubLList $list_alt13 = list(reader_make_constant_shell("BeAux"), reader_make_constant_shell("AuxVerb"), reader_make_constant_shell("Modal"), reader_make_constant_shell("Verb"));

    static private final SubLList $list_alt14 = list(makeString("can"), makeString("is"), makeString("are"), makeString("may"));

    static private final SubLList $list_alt16 = list(reader_make_constant_shell("Can-TheWord"), reader_make_constant_shell("May-TheWord"), reader_make_constant_shell("Might-TheWord"));

    static private final SubLList $list_alt17 = list(reader_make_constant_shell("AuxVerb"), reader_make_constant_shell("Modal"), reader_make_constant_shell("Verb"));

    static private final SubLList $list_alt18 = list(makeString("can"), makeString("may"), makeString("might"));

    static private final SubLList $list_alt19 = list(reader_make_constant_shell("Be-TheWord"), reader_make_constant_shell("Verb"));

    static private final SubLList $list_alt20 = list(reader_make_constant_shell("Be-TheWord"), reader_make_constant_shell("BeAux"));

    static private final SubLList $list_alt21 = list(reader_make_constant_shell("Do-TheWord"), reader_make_constant_shell("Verb"));

    static private final SubLList $list_alt23 = list(reader_make_constant_shell("OptionalOne"), reader_make_constant_shell("OptionalSome"), reader_make_constant_shell("RequireOne"), reader_make_constant_shell("RequireSome"));

    static private final SubLList $list_alt31 = list(makeSymbol("RULE"), makeSymbol("CATEGORY"), makeSymbol("PREDICATE"), makeSymbol("PATTERN"), makeSymbol("SEMANTICS"));

    static private final SubLList $list_alt35 = list(makeSymbol("CLASS"), makeSymbol("CATEGORY"), makeSymbol("PREDICATE"), makeSymbol("EXPRESSION"), makeSymbol("SEMANTICS"));

    static private final SubLString $str_alt39$syntactic_template____s__ = makeString("syntactic-template = ~s~%");

    static private final SubLString $str_alt42$formula1____s__ = makeString("formula1 = ~s~%");

    static private final SubLString $str_alt43$formula2____s__ = makeString("formula2 = ~s~%");
}

/**
 * Total time: 226 ms
 */
