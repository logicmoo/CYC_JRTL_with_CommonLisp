package com.cyc.cycjava.cycl.nl_stats;

import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.cycjava.cycl.stacks;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.cycjava.cycl.pph_utilities;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.parser;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.cycjava.cycl.lexicon_utilities;
import com.cyc.cycjava.cycl.lexicon_accessors;
import com.cyc.cycjava.cycl.subl_promotions;
import com.cyc.cycjava.cycl.string_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.cycjava.cycl.morphology;
import com.cyc.cycjava.cycl.lexification_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.cycjava.cycl.word_tree;
import com.cyc.cycjava.cycl.number_utilities;
import com.cyc.cycjava.cycl.methods;
import com.cyc.cycjava.cycl.parse_tree;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class parse_tree_utilities extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.nl_stats.parse_tree_utilities";
    public static final String myFingerPrint = "990bbcc4faf1827edd531dd6a1754f0acbc5cff82fea5e75706b4188c46435e0";
    @SubLTranslatedFile.SubL(source = "cycl/nl-stats/parse-tree-utilities.lisp", position = 1358L)
    private static SubLSymbol $parse_tree_utilities_use_this_parser$;
    @SubLTranslatedFile.SubL(source = "cycl/nl-stats/parse-tree-utilities.lisp", position = 1655L)
    private static SubLSymbol $parse_tree_utilities_parser_constructor$;
    @SubLTranslatedFile.SubL(source = "cycl/nl-stats/parse-tree-utilities.lisp", position = 2274L)
    private static SubLSymbol $tolerate_phraseless_charniak_heads$;
    private static final SubLSymbol $sym0$NEW_CHARNIAK_PARSER;
    private static final SubLList $list1;
    private static final SubLSymbol $sym2$CLET;
    private static final SubLSymbol $sym3$_PARSE_TREE_UTILITIES_USE_THIS_PARSER_;
    private static final SubLSymbol $sym4$FIF;
    private static final SubLList $list5;
    private static final SubLList $list6;
    private static final SubLList $list7;
    private static final SubLSymbol $sym8$NOMINAL_PHRASE_TREE_P;
    private static final SubLSymbol $sym9$GET_HEAD;
    private static final SubLSymbol $sym10$GET_DAUGHTER;
    private static final SubLSymbol $sym11$DAUGHTER_COUNT;
    private static final SubLSymbol $sym12$GET_STRING;
    private static final SubLSymbol $sym13$GET_SISTER;
    private static final SubLString $str14$of;
    private static final SubLSymbol $sym15$STRING_DOWNCASE;
    private static final SubLSymbol $sym16$WORD_TREE_P;
    private static final SubLString $str17$_A__A;
    private static final SubLSymbol $sym18$GET_CATEGORY;
    private static final SubLString $str19$;
    private static final SubLSymbol $kw20$NPS;
    private static final SubLSymbol $kw21$NNPS;
    private static final SubLSymbol $kw22$PHRASELESS;
    private static final SubLSymbol $sym23$FIND_LAST;
    private static final SubLSymbol $sym24$COORDINATE_WORD_TREE_P;
    private static final SubLSymbol $sym25$GET_HEAD_DAUGHTER;
    private static final SubLSymbol $sym26$FIND_FIRST;
    private static final SubLSymbol $sym27$DETERMINER_WORD_TREE_P;
    private static final SubLSymbol $sym28$CARDINAL_WORD_TREE_P;
    private static final SubLList $list29;
    private static final SubLSymbol $sym30$PARSE;
    private static final SubLSymbol $sym31$FIND_ALL;
    private static final SubLSymbol $sym32$NP_TREE_P;
    private static final SubLSymbol $kw33$NOUN;
    private static final SubLSymbol $sym34$STRING_EQUAL;
    private static final SubLObject $const35$CountNoun;
    private static final SubLSymbol $kw36$SUBJECT;
    private static final SubLSymbol $kw37$OBJECT;
    private static final SubLSymbol $sym38$LISTP;
    private static final SubLString $str39$extract_verbal_match_from_source_;
    private static final SubLString $str40$don_t_know_what_to_do_with__S__sk;
    private static final SubLSymbol $sym41$CHARNIAK_PARSER_P;
    private static final SubLString $str42$_S_is_neither_a_STRINGP_nor_a_PAR;
    private static final SubLString $str43$Role__S_not_understood;
    private static final SubLSymbol $sym44$VP_TREE_P;
    private static final SubLSymbol $sym45$DUMMY_TO_P;
    private static final SubLSymbol $sym46$COPULA_P;
    private static final SubLSymbol $sym47$GET_SEMANTIC_SUBJECT;
    private static final SubLSymbol $sym48$GET_SUBJECT;
    private static final SubLSymbol $kw49$PROBLEM;
    private static final SubLSymbol $kw50$SUBJ;
    private static final SubLSymbol $sym51$GET_SEMANTIC_OBJECTS;
    private static final SubLSymbol $kw52$DOUBLE;
    private static final SubLSymbol $kw53$SINGLE;
    private static final SubLObject $const54$Date;
    private static final SubLSymbol $kw55$QP_TREE;
    private static final SubLList $list56;
    private static final SubLSymbol $sym57$PRT_TREE_P;
    private static final SubLString $str58$_A_A_VB;
    private static final SubLSymbol $kw59$VERB;
    private static final SubLString $str60$__A;
    private static final SubLList $list61;
    private static final SubLString $str62$P;
    private static final SubLString $str63$_A_NP;
    private static final SubLString $str64$_A_NN;
    private static final SubLSymbol $kw65$IGNORE_ERRORS_TARGET;
    private static final SubLSymbol $sym66$IGNORE_ERRORS_HANDLER;
    private static final SubLList $list67;
    private static final SubLSymbol $kw68$DFR2L;
    private static final SubLSymbol $kw69$DFL2R;
    private static final SubLString $str70$_S_is_not_one_of__S;
    private static final SubLSymbol $kw71$ALL;
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-stats/parse-tree-utilities.lisp", position = 1742L)
    public static SubLObject new_parse_tree_utilities_parser() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return Functions.funcall(parse_tree_utilities.$parse_tree_utilities_parser_constructor$.getDynamicValue(thread));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-stats/parse-tree-utilities.lisp", position = 1855L)
    public static SubLObject get_parse_tree_utilities_parser() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return (parse_tree_utilities.NIL != parse_tree_utilities.$parse_tree_utilities_use_this_parser$.getDynamicValue(thread)) ? parse_tree_utilities.$parse_tree_utilities_use_this_parser$.getDynamicValue(thread) : new_parse_tree_utilities_parser();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-stats/parse-tree-utilities.lisp", position = 2043L)
    public static SubLObject with_parse_tree_utilities_parser(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject v_parser = (SubLObject)parse_tree_utilities.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)parse_tree_utilities.$list1);
        v_parser = current.first();
        final SubLObject body;
        current = (body = current.rest());
        return (SubLObject)ConsesLow.listS((SubLObject)parse_tree_utilities.$sym2$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)parse_tree_utilities.$sym3$_PARSE_TREE_UTILITIES_USE_THIS_PARSER_, (SubLObject)ConsesLow.list((SubLObject)parse_tree_utilities.$sym4$FIF, (SubLObject)ConsesLow.listS((SubLObject)parse_tree_utilities.EQL, v_parser, (SubLObject)parse_tree_utilities.$list5), (SubLObject)parse_tree_utilities.$list6, v_parser))), ConsesLow.append(body, (SubLObject)parse_tree_utilities.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-stats/parse-tree-utilities.lisp", position = 2410L)
    public static SubLObject while_tolerating_phraseless_heads(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return (SubLObject)ConsesLow.listS((SubLObject)parse_tree_utilities.$sym2$CLET, (SubLObject)parse_tree_utilities.$list7, ConsesLow.append(body, (SubLObject)parse_tree_utilities.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-stats/parse-tree-utilities.lisp", position = 2545L)
    public static SubLObject get_complex_noun_from_phrase_tree(final SubLObject the_tree, SubLObject skip_downcaseP) {
        if (skip_downcaseP == parse_tree_utilities.UNPROVIDED) {
            skip_downcaseP = (SubLObject)parse_tree_utilities.NIL;
        }
        assert parse_tree_utilities.NIL != parse_tree.nominal_phrase_tree_p(the_tree) : the_tree;
        final SubLObject the_head = methods.funcall_instance_method_with_0_args(the_tree, (SubLObject)parse_tree_utilities.$sym9$GET_HEAD);
        if (parse_tree_utilities.NIL == the_head) {
            return (SubLObject)parse_tree_utilities.NIL;
        }
        final SubLObject possible_pp = methods.funcall_instance_method_with_1_args(the_tree, (SubLObject)parse_tree_utilities.$sym10$GET_DAUGHTER, number_utilities.f_1_(methods.funcall_instance_method_with_0_args(the_tree, (SubLObject)parse_tree_utilities.$sym11$DAUGHTER_COUNT)));
        final SubLObject pp_head = (SubLObject)((parse_tree_utilities.NIL != parse_tree.prepositional_phrase_tree_p(possible_pp)) ? methods.funcall_instance_method_with_0_args(possible_pp, (SubLObject)parse_tree_utilities.$sym9$GET_HEAD) : parse_tree_utilities.NIL);
        SubLObject the_compound = (SubLObject)ConsesLow.list(methods.funcall_instance_method_with_0_args(the_head, (SubLObject)parse_tree_utilities.$sym12$GET_STRING));
        SubLObject lefty;
        for (lefty = (SubLObject)parse_tree_utilities.NIL, lefty = methods.funcall_instance_method_with_1_args(the_head, (SubLObject)parse_tree_utilities.$sym13$GET_SISTER, (SubLObject)parse_tree_utilities.MINUS_ONE_INTEGER); parse_tree_utilities.NIL != lefty && (parse_tree_utilities.NIL != word_tree.adjectival_word_tree_p(lefty) || parse_tree_utilities.NIL != word_tree.nominal_word_tree_p(lefty)); lefty = methods.funcall_instance_method_with_1_args(lefty, (SubLObject)parse_tree_utilities.$sym13$GET_SISTER, (SubLObject)parse_tree_utilities.MINUS_ONE_INTEGER)) {
            if (parse_tree_utilities.NIL != word_tree.adjectival_word_tree_p(lefty) || parse_tree_utilities.NIL != word_tree.nominal_word_tree_p(lefty)) {
                the_compound = (SubLObject)ConsesLow.cons(methods.funcall_instance_method_with_0_args(lefty, (SubLObject)parse_tree_utilities.$sym12$GET_STRING), the_compound);
            }
        }
        if (parse_tree_utilities.NIL != pp_head && parse_tree_utilities.NIL != Strings.string_equal(methods.funcall_instance_method_with_0_args(pp_head, (SubLObject)parse_tree_utilities.$sym12$GET_STRING), (SubLObject)parse_tree_utilities.$str14$of, (SubLObject)parse_tree_utilities.UNPROVIDED, (SubLObject)parse_tree_utilities.UNPROVIDED, (SubLObject)parse_tree_utilities.UNPROVIDED, (SubLObject)parse_tree_utilities.UNPROVIDED)) {
            the_compound = ConsesLow.append(the_compound, (SubLObject)ConsesLow.list(methods.funcall_instance_method_with_0_args(possible_pp, (SubLObject)parse_tree_utilities.$sym12$GET_STRING)));
        }
        if (Sequences.length(the_compound).numL((SubLObject)parse_tree_utilities.TWO_INTEGER)) {
            return (SubLObject)parse_tree_utilities.NIL;
        }
        if (parse_tree_utilities.NIL != skip_downcaseP) {
            return the_compound;
        }
        if (parse_tree_utilities.NIL != word_tree.name_word_tree_p(the_head)) {
            return the_compound;
        }
        return Mapping.mapcar(Symbols.symbol_function((SubLObject)parse_tree_utilities.$sym15$STRING_DOWNCASE), the_compound);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-stats/parse-tree-utilities.lisp", position = 4477L)
    public static SubLObject combine_head_string_and_category(final SubLObject the_tree, SubLObject normalizeP) {
        if (normalizeP == parse_tree_utilities.UNPROVIDED) {
            normalizeP = (SubLObject)parse_tree_utilities.NIL;
        }
        if (parse_tree_utilities.NIL != parse_tree.phrase_tree_p(the_tree)) {
            final SubLObject the_head = methods.funcall_instance_method_with_0_args(the_tree, (SubLObject)parse_tree_utilities.$sym9$GET_HEAD);
            return (SubLObject)((parse_tree_utilities.NIL != the_head) ? combine_head_string_and_category(the_head, normalizeP) : parse_tree_utilities.NIL);
        }
        assert parse_tree_utilities.NIL != word_tree.word_tree_p(the_tree) : the_tree;
        return PrintLow.format((SubLObject)parse_tree_utilities.NIL, (SubLObject)parse_tree_utilities.$str17$_A__A, (parse_tree_utilities.NIL != normalizeP) ? get_normalized_head_string(the_tree) : methods.funcall_instance_method_with_0_args(the_tree, (SubLObject)parse_tree_utilities.$sym12$GET_STRING), methods.funcall_instance_method_with_0_args(the_tree, (SubLObject)parse_tree_utilities.$sym18$GET_CATEGORY));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-stats/parse-tree-utilities.lisp", position = 5250L)
    public static SubLObject get_normalized_head_string(final SubLObject the_tree) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (parse_tree_utilities.NIL == the_tree) {
            return (SubLObject)parse_tree_utilities.NIL;
        }
        final SubLObject head_element = methods.funcall_instance_method_with_0_args(the_tree, (SubLObject)parse_tree_utilities.$sym9$GET_HEAD);
        if (parse_tree_utilities.NIL == head_element) {
            return (SubLObject)parse_tree_utilities.$str19$;
        }
        if (parse_tree_utilities.NIL != word_tree.nominal_word_tree_p(head_element)) {
            if (parse_tree_utilities.NIL == word_tree.name_word_tree_p(head_element)) {
                return lexification_utilities.singularize_word(methods.funcall_instance_method_with_0_args(head_element, (SubLObject)parse_tree_utilities.$sym12$GET_STRING), (SubLObject)parse_tree_utilities.UNPROVIDED);
            }
            final SubLObject pcase_var = methods.funcall_instance_method_with_0_args(head_element, (SubLObject)parse_tree_utilities.$sym18$GET_CATEGORY);
            if (pcase_var.eql((SubLObject)parse_tree_utilities.$kw20$NPS) || pcase_var.eql((SubLObject)parse_tree_utilities.$kw21$NNPS)) {
                SubLObject word = (SubLObject)parse_tree_utilities.NIL;
                final SubLObject _prev_bind_0 = morphology.$preserve_case_in_singular_regP$.currentBinding(thread);
                try {
                    morphology.$preserve_case_in_singular_regP$.bind((SubLObject)parse_tree_utilities.T, thread);
                    word = lexification_utilities.singularize_word(methods.funcall_instance_method_with_0_args(head_element, (SubLObject)parse_tree_utilities.$sym12$GET_STRING), (SubLObject)parse_tree_utilities.UNPROVIDED);
                }
                finally {
                    morphology.$preserve_case_in_singular_regP$.rebind(_prev_bind_0, thread);
                }
                return word;
            }
            return methods.funcall_instance_method_with_0_args(head_element, (SubLObject)parse_tree_utilities.$sym12$GET_STRING);
        }
        else {
            if (parse_tree_utilities.NIL != parse_tree.nominal_phrase_tree_p(the_tree)) {
                return get_normalized_head_string(head_element);
            }
            if (parse_tree_utilities.NIL != word_tree.verbal_word_tree_p(head_element)) {
                return morphology.get_root(methods.funcall_instance_method_with_0_args(head_element, (SubLObject)parse_tree_utilities.$sym12$GET_STRING), (SubLObject)parse_tree_utilities.UNPROVIDED);
            }
            if (parse_tree_utilities.NIL != parse_tree.verbal_phrase_tree_p(the_tree)) {
                return get_normalized_head_string(head_element);
            }
            return methods.funcall_instance_method_with_0_args(head_element, (SubLObject)parse_tree_utilities.$sym12$GET_STRING);
        }
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-stats/parse-tree-utilities.lisp", position = 6408L)
    public static SubLObject get_head_string_if_any(final SubLObject the_tree, SubLObject normalizeP) {
        if (normalizeP == parse_tree_utilities.UNPROVIDED) {
            normalizeP = (SubLObject)parse_tree_utilities.NIL;
        }
        final SubLObject the_head = methods.funcall_instance_method_with_0_args(the_tree, (SubLObject)parse_tree_utilities.$sym9$GET_HEAD);
        if (parse_tree_utilities.NIL == the_head) {
            return (SubLObject)parse_tree_utilities.$str19$;
        }
        if (parse_tree_utilities.NIL != normalizeP) {
            return get_normalized_head_string(the_head);
        }
        return methods.funcall_instance_method_with_0_args(the_head, (SubLObject)parse_tree_utilities.$sym12$GET_STRING);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-stats/parse-tree-utilities.lisp", position = 6950L)
    public static SubLObject get_nominal_head_strings(final SubLObject the_nominal, SubLObject with_posP, SubLObject normalizeP) {
        if (with_posP == parse_tree_utilities.UNPROVIDED) {
            with_posP = (SubLObject)parse_tree_utilities.NIL;
        }
        if (normalizeP == parse_tree_utilities.UNPROVIDED) {
            normalizeP = with_posP;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (parse_tree_utilities.NIL != parse_tree_utilities.$tolerate_phraseless_charniak_heads$.getDynamicValue(thread) && parse_tree_utilities.NIL != word_tree.nominal_word_tree_p(the_nominal)) {
            return Values.values((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((parse_tree_utilities.NIL != with_posP) ? combine_head_string_and_category(the_nominal, normalizeP) : get_head_string_if_any(the_nominal, normalizeP), methods.funcall_instance_method_with_0_args(the_nominal, (SubLObject)parse_tree_utilities.$sym12$GET_STRING), (SubLObject)parse_tree_utilities.$str19$)), (SubLObject)parse_tree_utilities.$kw22$PHRASELESS);
        }
        assert parse_tree_utilities.NIL != parse_tree.nominal_phrase_tree_p(the_nominal) : the_nominal;
        final SubLObject det_string = get_nominal_tree_determiner_string(the_nominal);
        if (parse_tree_utilities.NIL != methods.funcall_instance_method_with_1_args(the_nominal, (SubLObject)parse_tree_utilities.$sym23$FIND_LAST, (SubLObject)parse_tree_utilities.$sym24$COORDINATE_WORD_TREE_P)) {
            SubLObject the_results = (SubLObject)parse_tree_utilities.NIL;
            final SubLObject vector_var = parse_tree.get_phrase_tree_daughters(the_nominal);
            final SubLObject backwardP_var = (SubLObject)parse_tree_utilities.NIL;
            SubLObject length;
            SubLObject v_iteration;
            SubLObject element_num;
            SubLObject this_daughter;
            SubLObject this_det_string;
            for (length = Sequences.length(vector_var), v_iteration = (SubLObject)parse_tree_utilities.NIL, v_iteration = (SubLObject)parse_tree_utilities.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)parse_tree_utilities.ONE_INTEGER)) {
                element_num = ((parse_tree_utilities.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)parse_tree_utilities.ONE_INTEGER) : v_iteration);
                this_daughter = Vectors.aref(vector_var, element_num);
                if (parse_tree_utilities.NIL != word_tree.nominal_word_tree_p(this_daughter)) {
                    the_results = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((parse_tree_utilities.NIL != with_posP) ? combine_head_string_and_category(this_daughter, normalizeP) : get_head_string_if_any(this_daughter, normalizeP), methods.funcall_instance_method_with_0_args(this_daughter, (SubLObject)parse_tree_utilities.$sym12$GET_STRING), det_string), the_results);
                }
                else if (parse_tree_utilities.NIL != parse_tree.nominal_phrase_tree_p(this_daughter)) {
                    this_det_string = (SubLObject)((parse_tree_utilities.NIL != string_utilities.empty_string_p(det_string)) ? ((parse_tree_utilities.NIL != get_nominal_tree_determiner_string(this_daughter)) ? get_nominal_tree_determiner_string(this_daughter) : parse_tree_utilities.$str19$) : det_string);
                    the_results = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((parse_tree_utilities.NIL != with_posP) ? combine_head_string_and_category(this_daughter, normalizeP) : get_head_string_if_any(this_daughter, normalizeP), get_longest_nominal_string(this_daughter), this_det_string), the_results);
                }
            }
            return Values.values(Sequences.reverse(the_results), (SubLObject)parse_tree_utilities.NIL);
        }
        final SubLObject complex_string = get_longest_nominal_string(the_nominal);
        final SubLObject head_string = (parse_tree_utilities.NIL != with_posP) ? combine_head_string_and_category(the_nominal, normalizeP) : get_head_string_if_any(the_nominal, normalizeP);
        return Values.values((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(head_string, complex_string, det_string)), (SubLObject)parse_tree_utilities.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-stats/parse-tree-utilities.lisp", position = 9635L)
    public static SubLObject get_nominal_tree_determiner_string(final SubLObject the_nominal) {
        assert parse_tree_utilities.NIL != parse_tree.nominal_phrase_tree_p(the_nominal) : the_nominal;
        final SubLObject true_head = methods.funcall_instance_method_with_0_args(the_nominal, (SubLObject)parse_tree_utilities.$sym25$GET_HEAD_DAUGHTER);
        if (parse_tree_utilities.NIL != parse_tree.nominal_phrase_tree_p(true_head)) {
            final SubLObject the_det = get_nominal_tree_determiner_string(true_head);
            if (parse_tree_utilities.NIL == string_utilities.empty_string_p(the_det)) {
                return the_det;
            }
        }
        final SubLObject the_det = (parse_tree_utilities.NIL != methods.funcall_instance_method_with_1_args(the_nominal, (SubLObject)parse_tree_utilities.$sym26$FIND_FIRST, (SubLObject)parse_tree_utilities.$sym27$DETERMINER_WORD_TREE_P)) ? methods.funcall_instance_method_with_1_args(the_nominal, (SubLObject)parse_tree_utilities.$sym26$FIND_FIRST, (SubLObject)parse_tree_utilities.$sym27$DETERMINER_WORD_TREE_P) : methods.funcall_instance_method_with_1_args(the_nominal, (SubLObject)parse_tree_utilities.$sym26$FIND_FIRST, (SubLObject)parse_tree_utilities.$sym28$CARDINAL_WORD_TREE_P);
        return (SubLObject)((parse_tree_utilities.NIL != the_det) ? Strings.string_downcase(methods.funcall_instance_method_with_0_args(the_det, (SubLObject)parse_tree_utilities.$sym12$GET_STRING), (SubLObject)parse_tree_utilities.UNPROVIDED, (SubLObject)parse_tree_utilities.UNPROVIDED) : parse_tree_utilities.$str19$);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-stats/parse-tree-utilities.lisp", position = 10368L)
    public static SubLObject get_longest_nominal_string(final SubLObject the_tree) {
        final SubLObject head_dtr = methods.funcall_instance_method_with_0_args(the_tree, (SubLObject)parse_tree_utilities.$sym25$GET_HEAD_DAUGHTER);
        if (parse_tree_utilities.NIL == head_dtr) {
            return (SubLObject)parse_tree_utilities.$str19$;
        }
        if (parse_tree_utilities.NIL != parse_tree.qp_tree_p(head_dtr)) {
            return (SubLObject)parse_tree_utilities.NIL;
        }
        return (parse_tree_utilities.NIL != get_complex_noun_from_phrase_tree(the_tree, (SubLObject)parse_tree_utilities.T)) ? get_complex_noun_from_phrase_tree(the_tree, (SubLObject)parse_tree_utilities.T) : ((parse_tree_utilities.NIL != word_tree.word_tree_p(head_dtr)) ? get_head_string_if_any(the_tree, (SubLObject)parse_tree_utilities.UNPROVIDED) : get_longest_nominal_string(head_dtr));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-stats/parse-tree-utilities.lisp", position = 11211L)
    public static SubLObject extract_all_complex_nouns_from_text(final SubLObject the_text, SubLObject key_string, SubLObject mergeP) {
        if (key_string == parse_tree_utilities.UNPROVIDED) {
            key_string = (SubLObject)parse_tree_utilities.$str19$;
        }
        if (mergeP == parse_tree_utilities.UNPROVIDED) {
            mergeP = (SubLObject)parse_tree_utilities.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (parse_tree_utilities.NIL == key_string) {
            key_string = (SubLObject)parse_tree_utilities.$str19$;
        }
        thread.resetMultipleValues();
        final SubLObject headed = extract_matching_complex_nouns_from_text(the_text, key_string);
        final SubLObject unheaded = thread.secondMultipleValue();
        final SubLObject the_parse = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        SubLObject head_matches = (SubLObject)parse_tree_utilities.NIL;
        SubLObject nonhead_matches = (SubLObject)parse_tree_utilities.NIL;
        SubLObject cdolist_list_var = headed;
        SubLObject this_pair = (SubLObject)parse_tree_utilities.NIL;
        this_pair = cdolist_list_var.first();
        while (parse_tree_utilities.NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = this_pair;
            SubLObject the_strings = (SubLObject)parse_tree_utilities.NIL;
            SubLObject the_head = (SubLObject)parse_tree_utilities.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)parse_tree_utilities.$list29);
            the_strings = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)parse_tree_utilities.$list29);
            the_head = current.first();
            current = current.rest();
            if (parse_tree_utilities.NIL == current) {
                if (parse_tree_utilities.NIL != mergeP) {
                    head_matches = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(string_utilities.bunge(the_strings, (SubLObject)parse_tree_utilities.UNPROVIDED), the_head), head_matches);
                }
                else {
                    head_matches = (SubLObject)ConsesLow.cons(the_strings, head_matches);
                }
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)parse_tree_utilities.$list29);
            }
            cdolist_list_var = cdolist_list_var.rest();
            this_pair = cdolist_list_var.first();
        }
        cdolist_list_var = unheaded;
        this_pair = (SubLObject)parse_tree_utilities.NIL;
        this_pair = cdolist_list_var.first();
        while (parse_tree_utilities.NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = this_pair;
            SubLObject the_strings = (SubLObject)parse_tree_utilities.NIL;
            SubLObject the_head = (SubLObject)parse_tree_utilities.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)parse_tree_utilities.$list29);
            the_strings = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)parse_tree_utilities.$list29);
            the_head = current.first();
            current = current.rest();
            if (parse_tree_utilities.NIL == current) {
                if (parse_tree_utilities.NIL != mergeP) {
                    head_matches = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(string_utilities.bunge(the_strings, (SubLObject)parse_tree_utilities.UNPROVIDED), the_head), head_matches);
                }
                else {
                    nonhead_matches = (SubLObject)ConsesLow.cons(the_strings, nonhead_matches);
                }
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)parse_tree_utilities.$list29);
            }
            cdolist_list_var = cdolist_list_var.rest();
            this_pair = cdolist_list_var.first();
        }
        return (parse_tree_utilities.NIL != mergeP) ? Values.values(head_matches, the_parse) : Values.values(head_matches, nonhead_matches, the_parse);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-stats/parse-tree-utilities.lisp", position = 12425L)
    public static SubLObject extract_matching_complex_nouns_from_text(final SubLObject the_text, final SubLObject key_string) {
        final SubLObject my_parser = get_parse_tree_utilities_parser();
        final SubLObject the_parse = methods.funcall_instance_method_with_1_args(my_parser, (SubLObject)parse_tree_utilities.$sym30$PARSE, the_text);
        final SubLObject the_nps = (SubLObject)((parse_tree_utilities.NIL != the_parse) ? methods.funcall_instance_method_with_1_args(the_parse, (SubLObject)parse_tree_utilities.$sym31$FIND_ALL, (SubLObject)parse_tree_utilities.$sym32$NP_TREE_P) : parse_tree_utilities.NIL);
        SubLObject headed_matches = (SubLObject)parse_tree_utilities.NIL;
        SubLObject other_matches = (SubLObject)parse_tree_utilities.NIL;
        if (parse_tree_utilities.NIL == the_nps) {
            return (SubLObject)parse_tree_utilities.NIL;
        }
        SubLObject cdolist_list_var = the_nps;
        SubLObject this_np = (SubLObject)parse_tree_utilities.NIL;
        this_np = cdolist_list_var.first();
        while (parse_tree_utilities.NIL != cdolist_list_var) {
            final SubLObject the_strings = get_complex_noun_from_phrase_tree(this_np, (SubLObject)parse_tree_utilities.UNPROVIDED);
            final SubLObject head_string = get_head_string_if_any(this_np, (SubLObject)parse_tree_utilities.UNPROVIDED);
            if (parse_tree_utilities.NIL != the_strings) {
                if (parse_tree_utilities.NIL != string_utilities.empty_string_p(key_string)) {
                    headed_matches = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(the_strings, head_string), headed_matches);
                }
                else {
                    final SubLObject variants = acceptable_variations_for_extraction(key_string, (SubLObject)parse_tree_utilities.$kw33$NOUN, this_np);
                    SubLObject doneP = (SubLObject)parse_tree_utilities.NIL;
                    if (parse_tree_utilities.NIL != subl_promotions.memberP(head_string, variants, Symbols.symbol_function((SubLObject)parse_tree_utilities.$sym34$STRING_EQUAL), (SubLObject)parse_tree_utilities.UNPROVIDED)) {
                        headed_matches = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(the_strings, head_string), headed_matches);
                    }
                    else if (parse_tree_utilities.NIL == doneP) {
                        SubLObject csome_list_var = variants;
                        SubLObject this_variant = (SubLObject)parse_tree_utilities.NIL;
                        this_variant = csome_list_var.first();
                        while (parse_tree_utilities.NIL == doneP && parse_tree_utilities.NIL != csome_list_var) {
                            if (parse_tree_utilities.NIL == doneP) {
                                SubLObject csome_list_var_$1 = the_strings;
                                SubLObject this_string = (SubLObject)parse_tree_utilities.NIL;
                                this_string = csome_list_var_$1.first();
                                while (parse_tree_utilities.NIL == doneP && parse_tree_utilities.NIL != csome_list_var_$1) {
                                    if (parse_tree_utilities.NIL != Strings.string_equal(this_string, this_variant, (SubLObject)parse_tree_utilities.UNPROVIDED, (SubLObject)parse_tree_utilities.UNPROVIDED, (SubLObject)parse_tree_utilities.UNPROVIDED, (SubLObject)parse_tree_utilities.UNPROVIDED)) {
                                        other_matches = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(the_strings, head_string), other_matches);
                                        doneP = (SubLObject)parse_tree_utilities.T;
                                    }
                                    csome_list_var_$1 = csome_list_var_$1.rest();
                                    this_string = csome_list_var_$1.first();
                                }
                            }
                            csome_list_var = csome_list_var.rest();
                            this_variant = csome_list_var.first();
                        }
                    }
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            this_np = cdolist_list_var.first();
        }
        return Values.values(headed_matches, other_matches, the_parse);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-stats/parse-tree-utilities.lisp", position = 14285L)
    public static SubLObject acceptable_variations_for_extraction(final SubLObject base_string, final SubLObject pos, SubLObject tree) {
        if (tree == parse_tree_utilities.UNPROVIDED) {
            tree = (SubLObject)parse_tree_utilities.NIL;
        }
        if (!pos.eql((SubLObject)parse_tree_utilities.$kw33$NOUN)) {
            return (SubLObject)parse_tree_utilities.NIL;
        }
        if (parse_tree_utilities.NIL != tree && parse_tree_utilities.NIL != word_tree.name_word_tree_p(methods.funcall_instance_method_with_0_args(tree, (SubLObject)parse_tree_utilities.$sym9$GET_HEAD))) {
            return (SubLObject)ConsesLow.list(base_string, lexification_utilities.singularize_word(base_string, (SubLObject)parse_tree_utilities.UNPROVIDED), lexification_utilities.pluralize_word(base_string, (SubLObject)parse_tree_utilities.UNPROVIDED));
        }
        if (parse_tree_utilities.NIL != subl_promotions.memberP(parse_tree_utilities.$const35$CountNoun, lexicon_accessors.pos_of_string(base_string, (SubLObject)parse_tree_utilities.UNPROVIDED, (SubLObject)parse_tree_utilities.UNPROVIDED, (SubLObject)parse_tree_utilities.UNPROVIDED), (SubLObject)parse_tree_utilities.UNPROVIDED, (SubLObject)parse_tree_utilities.UNPROVIDED)) {
            return lexicon_utilities.word_variants(base_string, (SubLObject)parse_tree_utilities.$kw33$NOUN, (SubLObject)parse_tree_utilities.UNPROVIDED, (SubLObject)parse_tree_utilities.UNPROVIDED, (SubLObject)parse_tree_utilities.UNPROVIDED);
        }
        return (SubLObject)ConsesLow.list(lexification_utilities.singularize_word(base_string, (SubLObject)parse_tree_utilities.UNPROVIDED), lexification_utilities.pluralize_word(base_string, (SubLObject)parse_tree_utilities.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-stats/parse-tree-utilities.lisp", position = 14997L)
    public static SubLObject extract_verbal_matches_from_source(final SubLObject the_source, SubLObject list_of_roles) {
        if (list_of_roles == parse_tree_utilities.UNPROVIDED) {
            list_of_roles = (SubLObject)ConsesLow.list((SubLObject)parse_tree_utilities.$kw36$SUBJECT, (SubLObject)parse_tree_utilities.$kw37$OBJECT);
        }
        assert parse_tree_utilities.NIL != Types.listp(list_of_roles) : list_of_roles;
        SubLObject the_lists = (SubLObject)parse_tree_utilities.NIL;
        final SubLObject v_parser = (SubLObject)(the_source.isString() ? get_parse_tree_utilities_parser() : parse_tree_utilities.NIL);
        final SubLObject the_parse = (parse_tree_utilities.NIL != v_parser) ? methods.funcall_instance_method_with_1_args(v_parser, (SubLObject)parse_tree_utilities.$sym30$PARSE, the_source) : the_source;
        SubLObject cdolist_list_var = list_of_roles;
        SubLObject this_role = (SubLObject)parse_tree_utilities.NIL;
        this_role = cdolist_list_var.first();
        while (parse_tree_utilities.NIL != cdolist_list_var) {
            final SubLObject ret_value = extract_verbal_matches_from_source_int(the_parse, this_role);
            if (ret_value.isList()) {
                the_lists = (SubLObject)ConsesLow.cons(ret_value, the_lists);
            }
            else if (ret_value.isString()) {
                Errors.error((SubLObject)parse_tree_utilities.$str39$extract_verbal_match_from_source_, ret_value);
            }
            else if (parse_tree_utilities.NIL == ret_value) {
                Errors.warn((SubLObject)parse_tree_utilities.$str40$don_t_know_what_to_do_with__S__sk, ret_value);
            }
            else {
                the_lists = (SubLObject)ConsesLow.cons((SubLObject)parse_tree_utilities.NIL, the_lists);
            }
            cdolist_list_var = cdolist_list_var.rest();
            this_role = cdolist_list_var.first();
        }
        return Sequences.reverse(the_lists);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-stats/parse-tree-utilities.lisp", position = 16139L)
    public static SubLObject extract_verbal_matches_downcase_first_word(final SubLObject sentence_or_parse_tree, SubLObject v_parser) {
        if (v_parser == parse_tree_utilities.UNPROVIDED) {
            v_parser = (SubLObject)parse_tree_utilities.NIL;
        }
        SubLObject sentence = (SubLObject)parse_tree_utilities.NIL;
        SubLObject v_parse_tree = (SubLObject)parse_tree_utilities.NIL;
        if (sentence_or_parse_tree.isString()) {
            if (parse_tree_utilities.NIL != v_parser) {
                assert parse_tree_utilities.NIL != parser.charniak_parser_p(v_parser) : v_parser;
            }
            else {
                v_parser = parser.new_charniak_parser((SubLObject)parse_tree_utilities.UNPROVIDED, (SubLObject)parse_tree_utilities.UNPROVIDED);
            }
            sentence = sentence_or_parse_tree;
            v_parse_tree = methods.funcall_instance_method_with_1_args(v_parser, (SubLObject)parse_tree_utilities.$sym30$PARSE, sentence);
        }
        else if (parse_tree_utilities.NIL != parse_tree.parse_tree_p(sentence_or_parse_tree)) {
            v_parse_tree = sentence_or_parse_tree;
            sentence = methods.funcall_instance_method_with_0_args(v_parse_tree, (SubLObject)parse_tree_utilities.$sym12$GET_STRING);
        }
        else {
            Errors.error((SubLObject)parse_tree_utilities.$str42$_S_is_neither_a_STRINGP_nor_a_PAR, sentence_or_parse_tree);
        }
        final SubLObject first_word = string_utilities.first_word(sentence, (SubLObject)parse_tree_utilities.UNPROVIDED);
        SubLObject cdolist_list_var;
        final SubLObject matches = cdolist_list_var = extract_verbal_matches_from_source(v_parse_tree, (SubLObject)parse_tree_utilities.UNPROVIDED);
        SubLObject matches_for_role = (SubLObject)parse_tree_utilities.NIL;
        matches_for_role = cdolist_list_var.first();
        while (parse_tree_utilities.NIL != cdolist_list_var) {
            SubLObject cdolist_list_var_$2 = matches_for_role;
            SubLObject match = (SubLObject)parse_tree_utilities.NIL;
            match = cdolist_list_var_$2.first();
            while (parse_tree_utilities.NIL != cdolist_list_var_$2) {
                final SubLObject whole_noun = ConsesLow.nth((SubLObject)parse_tree_utilities.TWO_INTEGER, match);
                if (whole_noun.equal(first_word)) {
                    ConsesLow.set_nth((SubLObject)parse_tree_utilities.TWO_INTEGER, match, Strings.string_downcase(whole_noun, (SubLObject)parse_tree_utilities.UNPROVIDED, (SubLObject)parse_tree_utilities.UNPROVIDED));
                }
                cdolist_list_var_$2 = cdolist_list_var_$2.rest();
                match = cdolist_list_var_$2.first();
            }
            cdolist_list_var = cdolist_list_var.rest();
            matches_for_role = cdolist_list_var.first();
        }
        return matches;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-stats/parse-tree-utilities.lisp", position = 17270L)
    public static SubLObject extract_verbal_matches_from_source_int(final SubLObject the_source, final SubLObject the_role) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (!the_source.isString() && parse_tree_utilities.NIL == parse_tree.phrase_tree_p(the_source)) {
            return (SubLObject)parse_tree_utilities.NIL;
        }
        if (parse_tree_utilities.NIL == subl_promotions.memberP(the_role, (SubLObject)ConsesLow.list((SubLObject)parse_tree_utilities.$kw36$SUBJECT, (SubLObject)parse_tree_utilities.$kw37$OBJECT), (SubLObject)parse_tree_utilities.UNPROVIDED, (SubLObject)parse_tree_utilities.UNPROVIDED)) {
            return PrintLow.format((SubLObject)parse_tree_utilities.NIL, (SubLObject)parse_tree_utilities.$str43$Role__S_not_understood, the_role);
        }
        final SubLObject my_parser = (SubLObject)(the_source.isString() ? get_parse_tree_utilities_parser() : parse_tree_utilities.NIL);
        final SubLObject the_parse = (parse_tree_utilities.NIL != my_parser) ? methods.funcall_instance_method_with_1_args(my_parser, (SubLObject)parse_tree_utilities.$sym30$PARSE, the_source) : the_source;
        final SubLObject the_vps = (SubLObject)((parse_tree_utilities.NIL != the_parse) ? methods.funcall_instance_method_with_1_args(the_parse, (SubLObject)parse_tree_utilities.$sym31$FIND_ALL, (SubLObject)parse_tree_utilities.$sym44$VP_TREE_P) : parse_tree_utilities.NIL);
        SubLObject the_matches = (SubLObject)parse_tree_utilities.NIL;
        SubLObject this_subject = (SubLObject)parse_tree_utilities.NIL;
        SubLObject preserve_subject = (SubLObject)parse_tree_utilities.NIL;
        if (parse_tree_utilities.NIL == the_vps) {
            return (SubLObject)parse_tree_utilities.NIL;
        }
        SubLObject cdolist_list_var = the_vps;
        SubLObject this_vp = (SubLObject)parse_tree_utilities.NIL;
        this_vp = cdolist_list_var.first();
        while (parse_tree_utilities.NIL != cdolist_list_var) {
            if (parse_tree_utilities.NIL == methods.funcall_instance_method_with_0_args(this_vp, (SubLObject)parse_tree_utilities.$sym45$DUMMY_TO_P) && parse_tree_utilities.NIL != methods.funcall_instance_method_with_0_args(this_vp, (SubLObject)parse_tree_utilities.$sym9$GET_HEAD) && (parse_tree_utilities.NIL == word_tree.aux_verb_tree_p(methods.funcall_instance_method_with_0_args(this_vp, (SubLObject)parse_tree_utilities.$sym9$GET_HEAD)) || parse_tree_utilities.NIL != methods.funcall_instance_method_with_0_args(methods.funcall_instance_method_with_0_args(this_vp, (SubLObject)parse_tree_utilities.$sym9$GET_HEAD), (SubLObject)parse_tree_utilities.$sym46$COPULA_P)) && parse_tree_utilities.NIL == methods.funcall_instance_method_with_1_args(this_vp, (SubLObject)parse_tree_utilities.$sym26$FIND_FIRST, (SubLObject)parse_tree_utilities.$sym24$COORDINATE_WORD_TREE_P)) {
                if (the_role.eql((SubLObject)parse_tree_utilities.$kw36$SUBJECT)) {
                    this_subject = (SubLObject)((parse_tree_utilities.NIL != methods.funcall_instance_method_with_0_args(this_vp, (SubLObject)parse_tree_utilities.$sym47$GET_SEMANTIC_SUBJECT)) ? methods.funcall_instance_method_with_0_args(this_vp, (SubLObject)parse_tree_utilities.$sym47$GET_SEMANTIC_SUBJECT) : ((parse_tree_utilities.NIL != methods.funcall_instance_method_with_0_args(this_vp, (SubLObject)parse_tree_utilities.$sym48$GET_SUBJECT)) ? parse_tree_utilities.NIL : preserve_subject));
                    if (parse_tree_utilities.NIL != (preserve_subject = this_subject)) {
                        final SubLObject _prev_bind_0 = parse_tree_utilities.$tolerate_phraseless_charniak_heads$.currentBinding(thread);
                        try {
                            parse_tree_utilities.$tolerate_phraseless_charniak_heads$.bind((SubLObject)parse_tree_utilities.T, thread);
                            thread.resetMultipleValues();
                            final SubLObject the_strings = get_nominal_head_strings(this_subject, (SubLObject)parse_tree_utilities.T, (SubLObject)parse_tree_utilities.UNPROVIDED);
                            final SubLObject problemP = thread.secondMultipleValue();
                            thread.resetMultipleValues();
                            SubLObject cdolist_list_var_$3 = extract_verbal_matches_get_triples(this_vp, the_strings);
                            SubLObject this_match = (SubLObject)parse_tree_utilities.NIL;
                            this_match = cdolist_list_var_$3.first();
                            while (parse_tree_utilities.NIL != cdolist_list_var_$3) {
                                the_matches = (SubLObject)ConsesLow.cons(list_utilities.flatten((SubLObject)ConsesLow.list(this_match, (SubLObject)((parse_tree_utilities.NIL != problemP) ? parse_tree_utilities.$kw49$PROBLEM : parse_tree_utilities.$kw50$SUBJ))), the_matches);
                                cdolist_list_var_$3 = cdolist_list_var_$3.rest();
                                this_match = cdolist_list_var_$3.first();
                            }
                        }
                        finally {
                            parse_tree_utilities.$tolerate_phraseless_charniak_heads$.rebind(_prev_bind_0, thread);
                        }
                    }
                }
                else if (the_role.eql((SubLObject)parse_tree_utilities.$kw37$OBJECT)) {
                    final SubLObject all_objects = punt_date_adjuncts(methods.funcall_instance_method_with_0_args(this_vp, (SubLObject)parse_tree_utilities.$sym51$GET_SEMANTIC_OBJECTS));
                    final SubLObject subcat_frame = (SubLObject)(Sequences.length(all_objects).numG((SubLObject)parse_tree_utilities.ONE_INTEGER) ? parse_tree_utilities.$kw52$DOUBLE : parse_tree_utilities.$kw53$SINGLE);
                    final SubLObject key_object = all_objects.first();
                    if (parse_tree_utilities.NIL != key_object) {
                        final SubLObject _prev_bind_2 = parse_tree_utilities.$tolerate_phraseless_charniak_heads$.currentBinding(thread);
                        try {
                            parse_tree_utilities.$tolerate_phraseless_charniak_heads$.bind((SubLObject)parse_tree_utilities.T, thread);
                            thread.resetMultipleValues();
                            final SubLObject the_strings2 = get_nominal_head_strings(key_object, (SubLObject)parse_tree_utilities.T, (SubLObject)parse_tree_utilities.UNPROVIDED);
                            final SubLObject problemP2 = thread.secondMultipleValue();
                            thread.resetMultipleValues();
                            SubLObject cdolist_list_var_$4 = extract_verbal_matches_get_triples(this_vp, the_strings2);
                            SubLObject this_match2 = (SubLObject)parse_tree_utilities.NIL;
                            this_match2 = cdolist_list_var_$4.first();
                            while (parse_tree_utilities.NIL != cdolist_list_var_$4) {
                                the_matches = (SubLObject)ConsesLow.cons(list_utilities.flatten((SubLObject)ConsesLow.list(this_match2, keyword_for_verbal_triple(subcat_frame, problemP2, key_object))), the_matches);
                                cdolist_list_var_$4 = cdolist_list_var_$4.rest();
                                this_match2 = cdolist_list_var_$4.first();
                            }
                        }
                        finally {
                            parse_tree_utilities.$tolerate_phraseless_charniak_heads$.rebind(_prev_bind_2, thread);
                        }
                    }
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            this_vp = cdolist_list_var.first();
        }
        return Sequences.reverse(the_matches);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-stats/parse-tree-utilities.lisp", position = 20226L)
    public static SubLObject punt_date_adjuncts(final SubLObject the_objects) {
        SubLObject not_dates = (SubLObject)parse_tree_utilities.NIL;
        SubLObject cdolist_list_var = the_objects;
        SubLObject this_object = (SubLObject)parse_tree_utilities.NIL;
        this_object = cdolist_list_var.first();
        while (parse_tree_utilities.NIL != cdolist_list_var) {
            final SubLObject the_head = get_head_string_if_any(this_object, (SubLObject)parse_tree_utilities.UNPROVIDED);
            SubLObject dateP = (SubLObject)parse_tree_utilities.NIL;
            if (parse_tree_utilities.NIL != the_head) {
                if (parse_tree_utilities.NIL == dateP) {
                    SubLObject csome_list_var;
                    SubLObject this_denot;
                    for (csome_list_var = lexicon_accessors.denots_of_string(the_head, (SubLObject)parse_tree_utilities.UNPROVIDED, (SubLObject)parse_tree_utilities.UNPROVIDED, (SubLObject)parse_tree_utilities.UNPROVIDED, (SubLObject)parse_tree_utilities.UNPROVIDED, (SubLObject)parse_tree_utilities.UNPROVIDED, (SubLObject)parse_tree_utilities.UNPROVIDED, (SubLObject)parse_tree_utilities.UNPROVIDED, (SubLObject)parse_tree_utilities.UNPROVIDED), this_denot = (SubLObject)parse_tree_utilities.NIL, this_denot = csome_list_var.first(); parse_tree_utilities.NIL == dateP && parse_tree_utilities.NIL != csome_list_var; dateP = (SubLObject)SubLObjectFactory.makeBoolean(parse_tree_utilities.NIL != pph_utilities.pph_genlP(this_denot, parse_tree_utilities.$const54$Date, (SubLObject)parse_tree_utilities.UNPROVIDED) || parse_tree_utilities.NIL != pph_utilities.pph_isaP(this_denot, parse_tree_utilities.$const54$Date, (SubLObject)parse_tree_utilities.UNPROVIDED)), csome_list_var = csome_list_var.rest(), this_denot = csome_list_var.first()) {}
                }
                if (parse_tree_utilities.NIL == dateP) {
                    not_dates = (SubLObject)ConsesLow.cons(this_object, not_dates);
                }
                else if (parse_tree_utilities.NIL != parse_tree.np_tree_p(methods.funcall_instance_method_with_1_args(this_object, (SubLObject)parse_tree_utilities.$sym10$GET_DAUGHTER, (SubLObject)parse_tree_utilities.ZERO_INTEGER))) {
                    not_dates = (SubLObject)ConsesLow.cons(methods.funcall_instance_method_with_1_args(this_object, (SubLObject)parse_tree_utilities.$sym10$GET_DAUGHTER, (SubLObject)parse_tree_utilities.ZERO_INTEGER), not_dates);
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            this_object = cdolist_list_var.first();
        }
        return Sequences.reverse(not_dates);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-stats/parse-tree-utilities.lisp", position = 22115L)
    public static SubLObject keyword_for_verbal_triple(final SubLObject preferred, final SubLObject problemP, SubLObject check_tree) {
        if (check_tree == parse_tree_utilities.UNPROVIDED) {
            check_tree = (SubLObject)parse_tree_utilities.NIL;
        }
        final SubLObject its_dtr = (SubLObject)((parse_tree_utilities.NIL != parse_tree.phrase_tree_p(check_tree)) ? methods.funcall_instance_method_with_0_args(check_tree, (SubLObject)parse_tree_utilities.$sym25$GET_HEAD_DAUGHTER) : parse_tree_utilities.NIL);
        return (SubLObject)((parse_tree_utilities.NIL != ((parse_tree_utilities.NIL != problemP) ? (problemP.isKeyword() ? problemP : parse_tree_utilities.$kw49$PROBLEM) : parse_tree_utilities.NIL)) ? ((parse_tree_utilities.NIL != problemP) ? (problemP.isKeyword() ? problemP : parse_tree_utilities.$kw49$PROBLEM) : parse_tree_utilities.NIL) : ((parse_tree_utilities.NIL != ((parse_tree_utilities.NIL != parse_tree.phrase_tree_p(its_dtr)) ? keyword_for_verbal_triple(preferred, problemP, its_dtr) : parse_tree_utilities.NIL)) ? ((parse_tree_utilities.NIL != parse_tree.phrase_tree_p(its_dtr)) ? keyword_for_verbal_triple(preferred, problemP, its_dtr) : parse_tree_utilities.NIL) : ((parse_tree_utilities.NIL != ((parse_tree_utilities.NIL != parse_tree.qp_tree_p(check_tree)) ? parse_tree_utilities.$kw55$QP_TREE : parse_tree_utilities.NIL)) ? ((parse_tree_utilities.NIL != parse_tree.qp_tree_p(check_tree)) ? parse_tree_utilities.$kw55$QP_TREE : parse_tree_utilities.NIL) : preferred)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-stats/parse-tree-utilities.lisp", position = 22967L)
    public static SubLObject extract_verbal_matches_get_triples(final SubLObject vp, final SubLObject the_nps) {
        SubLObject the_triples = (SubLObject)parse_tree_utilities.NIL;
        SubLObject cdolist_list_var = the_nps;
        SubLObject this_np = (SubLObject)parse_tree_utilities.NIL;
        this_np = cdolist_list_var.first();
        while (parse_tree_utilities.NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = this_np;
            SubLObject the_head = (SubLObject)parse_tree_utilities.NIL;
            SubLObject all_strings = (SubLObject)parse_tree_utilities.NIL;
            SubLObject the_det = (SubLObject)parse_tree_utilities.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)parse_tree_utilities.$list56);
            the_head = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)parse_tree_utilities.$list56);
            all_strings = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)parse_tree_utilities.$list56);
            the_det = current.first();
            current = current.rest();
            if (parse_tree_utilities.NIL == current) {
                if (parse_tree_utilities.NIL != the_head) {
                    final SubLObject head_suf = just_the_nn_or_np_suffix(the_head);
                    final SubLObject vstring = get_head_string_if_any(vp, (SubLObject)parse_tree_utilities.UNPROVIDED);
                    final SubLObject the_particle = methods.funcall_instance_method_with_1_args(vp, (SubLObject)parse_tree_utilities.$sym26$FIND_FIRST, (SubLObject)parse_tree_utilities.$sym57$PRT_TREE_P);
                    the_triples = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(head_suf.isList() ? head_suf.first() : head_suf, PrintLow.format((SubLObject)parse_tree_utilities.NIL, (SubLObject)parse_tree_utilities.$str58$_A_A_VB, morphology.get_root_of_head(vstring, (SubLObject)parse_tree_utilities.$kw59$VERB), (SubLObject)((parse_tree_utilities.NIL != the_particle) ? PrintLow.format((SubLObject)parse_tree_utilities.NIL, (SubLObject)parse_tree_utilities.$str60$__A, methods.funcall_instance_method_with_0_args(the_particle, (SubLObject)parse_tree_utilities.$sym12$GET_STRING)) : parse_tree_utilities.$str19$)), all_strings.isList() ? string_utilities.bunge(all_strings, (SubLObject)parse_tree_utilities.UNPROVIDED) : all_strings, the_det), the_triples);
                }
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)parse_tree_utilities.$list56);
            }
            cdolist_list_var = cdolist_list_var.rest();
            this_np = cdolist_list_var.first();
        }
        return Sequences.reverse(the_triples);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-stats/parse-tree-utilities.lisp", position = 23689L)
    public static SubLObject just_the_nn_or_np_suffix(final SubLObject string_cat) {
        SubLObject current;
        final SubLObject datum = current = string_utilities.split_string(string_cat, (SubLObject)ConsesLow.list((SubLObject)Characters.CHAR_underbar));
        SubLObject the_string = (SubLObject)parse_tree_utilities.NIL;
        SubLObject the_cat = (SubLObject)parse_tree_utilities.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)parse_tree_utilities.$list61);
        the_string = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)parse_tree_utilities.$list61);
        the_cat = current.first();
        current = current.rest();
        if (parse_tree_utilities.NIL != current) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)parse_tree_utilities.$list61);
            return (SubLObject)parse_tree_utilities.NIL;
        }
        if (parse_tree_utilities.NIL != string_utilities.substringP((SubLObject)parse_tree_utilities.$str62$P, the_cat, (SubLObject)parse_tree_utilities.UNPROVIDED, (SubLObject)parse_tree_utilities.UNPROVIDED, (SubLObject)parse_tree_utilities.UNPROVIDED)) {
            return PrintLow.format((SubLObject)parse_tree_utilities.NIL, (SubLObject)parse_tree_utilities.$str63$_A_NP, the_string);
        }
        return PrintLow.format((SubLObject)parse_tree_utilities.NIL, (SubLObject)parse_tree_utilities.$str64$_A_NN, Strings.string_downcase(the_string, (SubLObject)parse_tree_utilities.UNPROVIDED, (SubLObject)parse_tree_utilities.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-stats/parse-tree-utilities.lisp", position = 23960L)
    public static SubLObject syntactic_xps(final SubLObject string) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (parse_tree_utilities.NIL == parser.stanford_parser_availableP((SubLObject)parse_tree_utilities.UNPROVIDED)) {
            return (SubLObject)parse_tree_utilities.NIL;
        }
        SubLObject xps = (SubLObject)parse_tree_utilities.NIL;
        final SubLObject v_parser = parser.new_stanford_parser((SubLObject)parse_tree_utilities.UNPROVIDED, (SubLObject)parse_tree_utilities.UNPROVIDED);
        final SubLObject tree = methods.funcall_instance_method_with_1_args(v_parser, (SubLObject)parse_tree_utilities.$sym30$PARSE, string);
        SubLObject ignore_errors_tag = (SubLObject)parse_tree_utilities.NIL;
        try {
            thread.throwStack.push(parse_tree_utilities.$kw65$IGNORE_ERRORS_TARGET);
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind(Symbols.symbol_function((SubLObject)parse_tree_utilities.$sym66$IGNORE_ERRORS_HANDLER), thread);
                try {
                    final SubLObject categories_var = (SubLObject)parse_tree_utilities.$list67;
                    final SubLObject stack = stacks.create_stack();
                    final SubLObject order_var = (SubLObject)parse_tree_utilities.$kw68$DFR2L;
                    final SubLObject possible_orders = (SubLObject)ConsesLow.list((SubLObject)parse_tree_utilities.$kw69$DFL2R, (SubLObject)parse_tree_utilities.$kw68$DFR2L);
                    SubLObject daughter = (SubLObject)parse_tree_utilities.NIL;
                    if (parse_tree_utilities.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && parse_tree_utilities.NIL == subl_promotions.memberP(order_var, possible_orders, Symbols.symbol_function((SubLObject)parse_tree_utilities.EQ), (SubLObject)parse_tree_utilities.UNPROVIDED)) {
                        Errors.error((SubLObject)parse_tree_utilities.$str70$_S_is_not_one_of__S, order_var, possible_orders);
                    }
                    stacks.stack_push(tree, stack);
                    while (parse_tree_utilities.NIL == stacks.stack_empty_p(stack)) {
                        daughter = stacks.stack_pop(stack);
                        if (categories_var == parse_tree_utilities.$kw71$ALL || parse_tree_utilities.NIL != subl_promotions.memberP(methods.funcall_instance_method_with_0_args(daughter, (SubLObject)parse_tree_utilities.$sym18$GET_CATEGORY), categories_var, (SubLObject)parse_tree_utilities.UNPROVIDED, (SubLObject)parse_tree_utilities.UNPROVIDED)) {
                            xps = (SubLObject)ConsesLow.cons(daughter, xps);
                        }
                        if (parse_tree_utilities.NIL != parse_tree.phrase_tree_p(daughter)) {
                            final SubLObject vector_var = parse_tree.get_phrase_tree_daughters(daughter);
                            final SubLObject backwardP_var = Equality.eq(order_var, (SubLObject)parse_tree_utilities.$kw69$DFL2R);
                            SubLObject length;
                            SubLObject v_iteration;
                            SubLObject element_num;
                            SubLObject daughter_$5;
                            for (length = Sequences.length(vector_var), v_iteration = (SubLObject)parse_tree_utilities.NIL, v_iteration = (SubLObject)parse_tree_utilities.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)parse_tree_utilities.ONE_INTEGER)) {
                                element_num = ((parse_tree_utilities.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)parse_tree_utilities.ONE_INTEGER) : v_iteration);
                                daughter_$5 = Vectors.aref(vector_var, element_num);
                                stacks.stack_push(daughter_$5, stack);
                            }
                        }
                    }
                }
                catch (Throwable catch_var) {
                    Errors.handleThrowable(catch_var, (SubLObject)parse_tree_utilities.NIL);
                }
            }
            finally {
                Errors.$error_handler$.rebind(_prev_bind_0, thread);
            }
        }
        catch (Throwable ccatch_env_var) {
            ignore_errors_tag = Errors.handleThrowable(ccatch_env_var, (SubLObject)parse_tree_utilities.$kw65$IGNORE_ERRORS_TARGET);
        }
        finally {
            thread.throwStack.pop();
        }
        return Values.values(xps, tree);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/nl-stats/parse-tree-utilities.lisp", position = 24421L)
    public static SubLObject parse_tree_string(final SubLObject tree) {
        return methods.funcall_instance_method_with_0_args(tree, (SubLObject)parse_tree_utilities.$sym12$GET_STRING);
    }
    
    public static SubLObject declare_parse_tree_utilities_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_stats.parse_tree_utilities", "new_parse_tree_utilities_parser", "NEW-PARSE-TREE-UTILITIES-PARSER", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_stats.parse_tree_utilities", "get_parse_tree_utilities_parser", "GET-PARSE-TREE-UTILITIES-PARSER", 0, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.nl_stats.parse_tree_utilities", "with_parse_tree_utilities_parser", "WITH-PARSE-TREE-UTILITIES-PARSER");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.nl_stats.parse_tree_utilities", "while_tolerating_phraseless_heads", "WHILE-TOLERATING-PHRASELESS-HEADS");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_stats.parse_tree_utilities", "get_complex_noun_from_phrase_tree", "GET-COMPLEX-NOUN-FROM-PHRASE-TREE", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_stats.parse_tree_utilities", "combine_head_string_and_category", "COMBINE-HEAD-STRING-AND-CATEGORY", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_stats.parse_tree_utilities", "get_normalized_head_string", "GET-NORMALIZED-HEAD-STRING", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_stats.parse_tree_utilities", "get_head_string_if_any", "GET-HEAD-STRING-IF-ANY", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_stats.parse_tree_utilities", "get_nominal_head_strings", "GET-NOMINAL-HEAD-STRINGS", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_stats.parse_tree_utilities", "get_nominal_tree_determiner_string", "GET-NOMINAL-TREE-DETERMINER-STRING", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_stats.parse_tree_utilities", "get_longest_nominal_string", "GET-LONGEST-NOMINAL-STRING", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_stats.parse_tree_utilities", "extract_all_complex_nouns_from_text", "EXTRACT-ALL-COMPLEX-NOUNS-FROM-TEXT", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_stats.parse_tree_utilities", "extract_matching_complex_nouns_from_text", "EXTRACT-MATCHING-COMPLEX-NOUNS-FROM-TEXT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_stats.parse_tree_utilities", "acceptable_variations_for_extraction", "ACCEPTABLE-VARIATIONS-FOR-EXTRACTION", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_stats.parse_tree_utilities", "extract_verbal_matches_from_source", "EXTRACT-VERBAL-MATCHES-FROM-SOURCE", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_stats.parse_tree_utilities", "extract_verbal_matches_downcase_first_word", "EXTRACT-VERBAL-MATCHES-DOWNCASE-FIRST-WORD", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_stats.parse_tree_utilities", "extract_verbal_matches_from_source_int", "EXTRACT-VERBAL-MATCHES-FROM-SOURCE-INT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_stats.parse_tree_utilities", "punt_date_adjuncts", "PUNT-DATE-ADJUNCTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_stats.parse_tree_utilities", "keyword_for_verbal_triple", "KEYWORD-FOR-VERBAL-TRIPLE", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_stats.parse_tree_utilities", "extract_verbal_matches_get_triples", "EXTRACT-VERBAL-MATCHES-GET-TRIPLES", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_stats.parse_tree_utilities", "just_the_nn_or_np_suffix", "JUST-THE-NN-OR-NP-SUFFIX", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_stats.parse_tree_utilities", "syntactic_xps", "SYNTACTIC-XPS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.nl_stats.parse_tree_utilities", "parse_tree_string", "PARSE-TREE-STRING", 1, 0, false);
        return (SubLObject)parse_tree_utilities.NIL;
    }
    
    public static SubLObject init_parse_tree_utilities_file() {
        parse_tree_utilities.$parse_tree_utilities_use_this_parser$ = SubLFiles.defparameter("*PARSE-TREE-UTILITIES-USE-THIS-PARSER*", (SubLObject)parse_tree_utilities.NIL);
        parse_tree_utilities.$parse_tree_utilities_parser_constructor$ = SubLFiles.defparameter("*PARSE-TREE-UTILITIES-PARSER-CONSTRUCTOR*", Symbols.symbol_function((SubLObject)parse_tree_utilities.$sym0$NEW_CHARNIAK_PARSER));
        parse_tree_utilities.$tolerate_phraseless_charniak_heads$ = SubLFiles.defparameter("*TOLERATE-PHRASELESS-CHARNIAK-HEADS*", (SubLObject)parse_tree_utilities.NIL);
        return (SubLObject)parse_tree_utilities.NIL;
    }
    
    public static SubLObject setup_parse_tree_utilities_file() {
        return (SubLObject)parse_tree_utilities.NIL;
    }
    
    @Override
	public void declareFunctions() {
        declare_parse_tree_utilities_file();
    }
    
    @Override
	public void initializeVariables() {
        init_parse_tree_utilities_file();
    }
    
    @Override
	public void runTopLevelForms() {
        setup_parse_tree_utilities_file();
    }
    
    static {
        me = (SubLFile)new parse_tree_utilities();
        parse_tree_utilities.$parse_tree_utilities_use_this_parser$ = null;
        parse_tree_utilities.$parse_tree_utilities_parser_constructor$ = null;
        parse_tree_utilities.$tolerate_phraseless_charniak_heads$ = null;
        $sym0$NEW_CHARNIAK_PARSER = SubLObjectFactory.makeSymbol("NEW-CHARNIAK-PARSER");
        $list1 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PARSER"), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym2$CLET = SubLObjectFactory.makeSymbol("CLET");
        $sym3$_PARSE_TREE_UTILITIES_USE_THIS_PARSER_ = SubLObjectFactory.makeSymbol("*PARSE-TREE-UTILITIES-USE-THIS-PARSER*");
        $sym4$FIF = SubLObjectFactory.makeSymbol("FIF");
        $list5 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NEW"));
        $list6 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-PARSE-TREE-UTILITIES-PARSER"));
        $list7 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*TOLERATE-PHRASELESS-CHARNIAK-HEADS*"), (SubLObject)parse_tree_utilities.T));
        $sym8$NOMINAL_PHRASE_TREE_P = SubLObjectFactory.makeSymbol("NOMINAL-PHRASE-TREE-P");
        $sym9$GET_HEAD = SubLObjectFactory.makeSymbol("GET-HEAD");
        $sym10$GET_DAUGHTER = SubLObjectFactory.makeSymbol("GET-DAUGHTER");
        $sym11$DAUGHTER_COUNT = SubLObjectFactory.makeSymbol("DAUGHTER-COUNT");
        $sym12$GET_STRING = SubLObjectFactory.makeSymbol("GET-STRING");
        $sym13$GET_SISTER = SubLObjectFactory.makeSymbol("GET-SISTER");
        $str14$of = SubLObjectFactory.makeString("of");
        $sym15$STRING_DOWNCASE = SubLObjectFactory.makeSymbol("STRING-DOWNCASE");
        $sym16$WORD_TREE_P = SubLObjectFactory.makeSymbol("WORD-TREE-P");
        $str17$_A__A = SubLObjectFactory.makeString("~A_~A");
        $sym18$GET_CATEGORY = SubLObjectFactory.makeSymbol("GET-CATEGORY");
        $str19$ = SubLObjectFactory.makeString("");
        $kw20$NPS = SubLObjectFactory.makeKeyword("NPS");
        $kw21$NNPS = SubLObjectFactory.makeKeyword("NNPS");
        $kw22$PHRASELESS = SubLObjectFactory.makeKeyword("PHRASELESS");
        $sym23$FIND_LAST = SubLObjectFactory.makeSymbol("FIND-LAST");
        $sym24$COORDINATE_WORD_TREE_P = SubLObjectFactory.makeSymbol("COORDINATE-WORD-TREE-P");
        $sym25$GET_HEAD_DAUGHTER = SubLObjectFactory.makeSymbol("GET-HEAD-DAUGHTER");
        $sym26$FIND_FIRST = SubLObjectFactory.makeSymbol("FIND-FIRST");
        $sym27$DETERMINER_WORD_TREE_P = SubLObjectFactory.makeSymbol("DETERMINER-WORD-TREE-P");
        $sym28$CARDINAL_WORD_TREE_P = SubLObjectFactory.makeSymbol("CARDINAL-WORD-TREE-P");
        $list29 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("THE-STRINGS"), (SubLObject)SubLObjectFactory.makeSymbol("THE-HEAD"));
        $sym30$PARSE = SubLObjectFactory.makeSymbol("PARSE");
        $sym31$FIND_ALL = SubLObjectFactory.makeSymbol("FIND-ALL");
        $sym32$NP_TREE_P = SubLObjectFactory.makeSymbol("NP-TREE-P");
        $kw33$NOUN = SubLObjectFactory.makeKeyword("NOUN");
        $sym34$STRING_EQUAL = SubLObjectFactory.makeSymbol("STRING-EQUAL");
        $const35$CountNoun = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CountNoun"));
        $kw36$SUBJECT = SubLObjectFactory.makeKeyword("SUBJECT");
        $kw37$OBJECT = SubLObjectFactory.makeKeyword("OBJECT");
        $sym38$LISTP = SubLObjectFactory.makeSymbol("LISTP");
        $str39$extract_verbal_match_from_source_ = SubLObjectFactory.makeString("extract-verbal-match-from-source-int returned ~S");
        $str40$don_t_know_what_to_do_with__S__sk = SubLObjectFactory.makeString("don't know what to do with ~S, skipping");
        $sym41$CHARNIAK_PARSER_P = SubLObjectFactory.makeSymbol("CHARNIAK-PARSER-P");
        $str42$_S_is_neither_a_STRINGP_nor_a_PAR = SubLObjectFactory.makeString("~S is neither a STRINGP nor a PARSE-TREE-P.");
        $str43$Role__S_not_understood = SubLObjectFactory.makeString("Role ~S not understood");
        $sym44$VP_TREE_P = SubLObjectFactory.makeSymbol("VP-TREE-P");
        $sym45$DUMMY_TO_P = SubLObjectFactory.makeSymbol("DUMMY-TO-P");
        $sym46$COPULA_P = SubLObjectFactory.makeSymbol("COPULA-P");
        $sym47$GET_SEMANTIC_SUBJECT = SubLObjectFactory.makeSymbol("GET-SEMANTIC-SUBJECT");
        $sym48$GET_SUBJECT = SubLObjectFactory.makeSymbol("GET-SUBJECT");
        $kw49$PROBLEM = SubLObjectFactory.makeKeyword("PROBLEM");
        $kw50$SUBJ = SubLObjectFactory.makeKeyword("SUBJ");
        $sym51$GET_SEMANTIC_OBJECTS = SubLObjectFactory.makeSymbol("GET-SEMANTIC-OBJECTS");
        $kw52$DOUBLE = SubLObjectFactory.makeKeyword("DOUBLE");
        $kw53$SINGLE = SubLObjectFactory.makeKeyword("SINGLE");
        $const54$Date = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Date"));
        $kw55$QP_TREE = SubLObjectFactory.makeKeyword("QP-TREE");
        $list56 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("THE-HEAD"), (SubLObject)SubLObjectFactory.makeSymbol("ALL-STRINGS"), (SubLObject)SubLObjectFactory.makeSymbol("THE-DET"));
        $sym57$PRT_TREE_P = SubLObjectFactory.makeSymbol("PRT-TREE-P");
        $str58$_A_A_VB = SubLObjectFactory.makeString("~A~A_VB");
        $kw59$VERB = SubLObjectFactory.makeKeyword("VERB");
        $str60$__A = SubLObjectFactory.makeString("_~A");
        $list61 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("THE-STRING"), (SubLObject)SubLObjectFactory.makeSymbol("THE-CAT"));
        $str62$P = SubLObjectFactory.makeString("P");
        $str63$_A_NP = SubLObjectFactory.makeString("~A_NP");
        $str64$_A_NN = SubLObjectFactory.makeString("~A_NN");
        $kw65$IGNORE_ERRORS_TARGET = SubLObjectFactory.makeKeyword("IGNORE-ERRORS-TARGET");
        $sym66$IGNORE_ERRORS_HANDLER = SubLObjectFactory.makeSymbol("IGNORE-ERRORS-HANDLER", "SUBLISP");
        $list67 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NP"), (SubLObject)SubLObjectFactory.makeKeyword("VP"));
        $kw68$DFR2L = SubLObjectFactory.makeKeyword("DFR2L");
        $kw69$DFL2R = SubLObjectFactory.makeKeyword("DFL2R");
        $str70$_S_is_not_one_of__S = SubLObjectFactory.makeString("~S is not one of ~S");
        $kw71$ALL = SubLObjectFactory.makeKeyword("ALL");
    }
}

/*

	Total time: 201 ms
	
*/