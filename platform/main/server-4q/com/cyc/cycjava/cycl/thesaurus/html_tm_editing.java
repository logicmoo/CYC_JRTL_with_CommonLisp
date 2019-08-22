/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl.thesaurus;

import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.eq;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.values;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors.set_aref;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.*;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;

import java.util.Iterator;
import java.util.Map;

import com.cyc.cycjava.cycl.V02;
import com.cyc.cycjava.cycl.arity;
import com.cyc.cycjava.cycl.assertion_handles;
import com.cyc.cycjava.cycl.assertions_high;
import com.cyc.cycjava.cycl.at_vars;
import com.cyc.cycjava.cycl.cb_utilities;
import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.cycjava.cycl.constants_high;
import com.cyc.cycjava.cycl.el_utilities;
import com.cyc.cycjava.cycl.file_utilities;
import com.cyc.cycjava.cycl.forts;
import com.cyc.cycjava.cycl.gt_modules;
import com.cyc.cycjava.cycl.hash_table_utilities;
import com.cyc.cycjava.cycl.html_macros;
import com.cyc.cycjava.cycl.html_utilities;
import com.cyc.cycjava.cycl.isa;
import com.cyc.cycjava.cycl.kb_accessors;
import com.cyc.cycjava.cycl.kb_mapping;
import com.cyc.cycjava.cycl.kb_mapping_utilities;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.mt_relevance_macros;
import com.cyc.cycjava.cycl.narts_high;
import com.cyc.cycjava.cycl.pph_main;
import com.cyc.cycjava.cycl.search;
import com.cyc.cycjava.cycl.string_utilities;
import com.cyc.cycjava.cycl.subl_promotions;
import com.cyc.cycjava.cycl.system_parameters;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 *  module:      HTML-TM-EDITING
 *  source file: /cyc/top/cycl/thesaurus/html-tm-editing.lisp
 *  created:     2019/07/03 17:38:32
 */
public final class html_tm_editing extends SubLTranslatedFile implements V02 {
    // // Constructor
    private html_tm_editing() {
    }

    public static final SubLFile me = new html_tm_editing();


    // // Definitions
    public static final SubLObject html_show_tm_arg(SubLObject arg) {
	if (NIL != tm_datastructures.signp(arg)) {
	    html_thesaurus.tm_link($HIERARCHICAL, cb_utilities.cb_fort_identifier(tm_datastructures.sign_concept(arg)), tm_datastructures.sign_term(arg), UNPROVIDED);
	} else if (NIL != forts.fort_p(arg)) {
	    html_thesaurus.tm_link($HIERARCHICAL, cb_utilities.cb_fort_identifier(arg), pph_main.generate_phrase(arg, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), UNPROVIDED);
	} else {
	    html_utilities.html_princ(arg);
	}

	return NIL;
    }

    public static final SubLObject tm_generate_arg_string(SubLObject arg) {
	{
	    SubLObject string = NIL;
	    if (NIL != tm_datastructures.signp(arg)) {
		string = format(NIL, $str_alt1$_a, tm_datastructures.sign_term(arg));
	    } else if (NIL != forts.fort_p(arg)) {
		string = pph_main.generate_phrase(arg, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
	    } else {
		string = format(NIL, $str_alt1$_a, arg);
	    }

	    return string;
	}
    }

    public static final SubLObject string_for_broader_terms(SubLObject broaders) {
	{
	    SubLObject string = $str_alt2$;
	    SubLObject len = length(broaders);
	    SubLObject first = broaders.first();
	    SubLObject last = last(broaders, UNPROVIDED).first();
	    if (NIL != broaders) {
		string = format(NIL, $str_alt3$with_broader_term_a, len.numE(ONE_INTEGER) ? ((SubLObject) ($str_alt2$)) : $$$s);
		{
		    SubLObject cdolist_list_var = broaders;
		    SubLObject b = NIL;
		    for (b = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), b = cdolist_list_var.first()) {
			if (b.equalp(first)) {
			    if (NIL != tm_datastructures.signp(b)) {
				b = tm_datastructures.sign_term(b);
			    }
			    string = format(NIL, $str_alt5$_a___a_, string, b);
			} else if (b.equalp(last)) {
			    if (NIL != tm_datastructures.signp(b)) {
				b = tm_datastructures.sign_term(b);
			    }
			    string = format(NIL, $str_alt6$_a_a_and___a_, new SubLObject[] { string, format(NIL, len.numG(TWO_INTEGER) ? ((SubLObject) ($str_alt7$_)) : $str_alt2$), b });
			} else {
			    if (NIL != tm_datastructures.signp(b)) {
				b = tm_datastructures.sign_term(b);
			    }
			    string = format(NIL, $str_alt8$_a____a_, string, b);
			}

		    }
		}
	    }
	    return string;
	}
    }

    public static final SubLObject tm_generate_create_string(SubLObject op, SubLObject args) {
	return format(NIL, $str_alt9$ADD_TERM___A__in__A__a, new SubLObject[] { args.first(), tm_datastructures.tm_op_thesaurus_name(op), string_for_broader_terms(third(args)) });
    }

    public static final SubLObject tm_generate_replace_string(SubLObject op, SubLObject args, SubLObject relation) {
	{
	    SubLObject thesaurus = tm_datastructures.tm_op_thesaurus(op);
	    SubLObject string = $str_alt2$;
	    SubLObject pcase_var = relation;
	    if (pcase_var.eql($$comment)) {
		string = string_utilities.strcat(list($str_alt11$Change_Comment_from__, second(args), $str_alt12$__to__, third(args), $str_alt13$_));
	    } else if ((pcase_var.eql($$preferredTerm) || pcase_var.eql($$nameString)) || pcase_var.eql($tm_name_pred$)) {
		string = format(NIL, $str_alt17$Change_Name__S_to__S, second(args), third(args));
	    } else if (pcase_var.eql($$tmSymbol) || pcase_var.eql($$tmInverseSymbol)) {
		if (NIL != tm_internals.thesaurus_predicateP(args.first())) {
		    string = format(NIL, $str_alt20$Rename_Relation__S_to__S, second(args), third(args));
		} else {
		    string = format(NIL, $str_alt21$Change_Abbreviation__S_to__S, second(args), third(args));
		}
	    } else if (pcase_var.eql($$tmUserType)) {
		string = format(NIL, $str_alt23$Change__A_s_level_from__S_to__S, new SubLObject[] { tm_internals.user_name(args.first()), second(args), third(args) });
	    } else if (pcase_var.eql($$arg1Format) || pcase_var.eql($$arg2Format)) {
		if (NIL != tm_datastructures.tm_op_english(op)) {
		    string = tm_datastructures.tm_op_english(op);
		} else {
		    string = format(NIL, $$$Change_Cardinality_of_relation);
		}
	    } else {
		{
		    SubLObject relation_1 = tm_datastructures.tm_op_relation_abbrev(op);
		    SubLObject v_term = args.first();
		    if (NIL != forts.fort_p(v_term)) {
			v_term = tm_internals.tm_pt_or_string_in_thesaurus(v_term, thesaurus);
		    }
		    string = format(NIL, $str_alt27$For___a___a___, v_term, relation_1);
		}
		{
		    SubLObject old = second(args);
		    SubLObject v_new = third(args);
		    if (NIL != forts.fort_p(old)) {
			old = tm_datastructures.concept_term(old, thesaurus);
		    }
		    if (NIL != forts.fort_p(v_new)) {
			v_new = tm_datastructures.concept_term(v_new, thesaurus);
		    }
		    string = cconcatenate(string, string_utilities.strcat(list($str_alt28$Replace_, old, $str_alt29$_with_, v_new)));
		}
	    }

	    if (NIL != tm_internals.thesaurusP(thesaurus)) {
		string = cconcatenate(string, format(NIL, $str_alt30$_in__A, NIL != forts.fort_p(thesaurus) ? ((SubLObject) (tm_internals.thesaurus_name(thesaurus))) : thesaurus));
	    }
	    return string;
	}
    }

    public static final SubLObject tm_generate_splice_or_nuke_string(SubLObject op, SubLObject args) {
	return format(NIL, $str_alt31$DELETE_TERM___A__in__A, args.first(), tm_datastructures.tm_op_thesaurus_name(op));
    }

    public static final SubLObject tm_generate_convert_nt_uf_string(SubLObject op, SubLObject args) {
	return format(NIL, $str_alt32$CONVERT_NTs_of___A__to_UFs_in__A, tm_datastructures.arg_string(args.first()), tm_datastructures.tm_op_thesaurus_name(op));
    }

    public static final SubLObject tm_generate_swap_pt_uf_string(SubLObject op, SubLObject args) {
	return format(NIL, $str_alt33$SWAP_PT___A__with_UF__S_in__A, new SubLObject[] { tm_datastructures.arg_string(second(args)), third(args), tm_datastructures.tm_op_thesaurus_name(op) });
    }

    public static final SubLObject tm_generate_relation_name(SubLObject op, SubLObject relation) {
	{
	    SubLObject name = NIL;
	    if (relation.isString()) {
		name = relation;
	    } else if (NIL != forts.fort_p(relation)) {
		name = tm_datastructures.tm_op_relation_abbrev(op);
	    }

	    if (!name.isString()) {
		name = princ_to_string(relation);
	    }
	    return name;
	}
    }

    public static final SubLObject tm_generate_edit_string(SubLObject op, SubLObject args, SubLObject opcode, SubLObject relation, SubLObject relation_name) {
	{
	    SubLObject string = NIL;
	    if (relation == $$topInThesaurus) {
		string = format(NIL, $str_alt35$__A__as_a_top_term_in__A, tm_datastructures.concept_term(args.first(), second(args)), tm_internals.thesaurus_name(second(args)));
	    } else if (relation == $$preferredTerm) {
		string = format(NIL, $str_alt36$__A__as_a_preferred_term, second(args));
	    } else if (relation == tm_datastructures.$tm_unary_active_pred$.getGlobalValue()) {
		string = format(NIL, $str_alt37$_A_and_its_inverse___A___A_the_se, new SubLObject[] { tm_internals.tm_pred_arg_symbol(args.first(), ONE_INTEGER), tm_internals.tm_pred_arg_symbol(args.first(), TWO_INTEGER), opcode == $ADD ? ((SubLObject) ($$$to)) : $$$from });
	    } else {
		{
		    SubLObject op_thesaurus = tm_datastructures.tm_op_thesaurus(op);
		    SubLObject thesaurus = (op_thesaurus.isString()) ? ((SubLObject) (tm_internals.thesaurus_constant_from_string(op_thesaurus))) : op_thesaurus;
		    SubLObject v_term = tm_datastructures.tm_op_term(op);
		    SubLObject val = tm_datastructures.tm_op_value(op);
		    SubLObject s1 = tm_internals.tm_string_for_constant(v_term, NIL, list(thesaurus), UNPROVIDED);
		    SubLObject s2 = tm_internals.tm_string_for_constant(val, NIL, list(thesaurus), UNPROVIDED);
		    string = cconcatenate(format(NIL, $str_alt1$_a, s1), new SubLObject[] { format(NIL, $str_alt41$__A_, relation_name), format(NIL, $str_alt1$_a, s2) });
		}
	    }

	    return string;
	}
    }

    public static final SubLObject tm_generate_stoplist_string(SubLObject opcode, SubLObject word) {
	return format(NIL, $str_alt42$_S__A_the_stoplist, word, opcode == $ADD ? ((SubLObject) ($$$to)) : $$$from);
    }

    public static final SubLObject tm_generate_cycl_string(SubLObject args, SubLObject relation, SubLObject relation_name) {
	{
	    SubLObject string = NIL;
	    if (NIL != forts.valid_fortP(relation)) {
		string = pph_main.generate_phrase(bq_cons(relation, append(args, NIL)), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
	    }
	    if (!string.isString()) {
		string = format(NIL, $str_alt43$__A, relation_name);
		{
		    SubLObject cdolist_list_var = args;
		    SubLObject arg = NIL;
		    for (arg = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), arg = cdolist_list_var.first()) {
			string = cconcatenate(string, new SubLObject[] { $str_alt44$_, tm_generate_arg_string(arg) });
		    }
		}
		string = cconcatenate(string, $str_alt45$_);
	    }
	    return string;
	}
    }

    public static final SubLObject tm_generate_complex_string(SubLObject op, SubLObject args, SubLObject opcode, SubLObject relation) {
	{
	    SubLObject relation_name = tm_generate_relation_name(op, relation);
	    SubLObject string = $str_alt2$;
	    string = format(NIL, $str_alt46$_A_, opcode);
	    if (relation == $$tmStoplistWord) {
		string = cconcatenate(string, tm_generate_stoplist_string(opcode, args.first()));
		return string;
	    }
	    if (length(args).numE(TWO_INTEGER)) {
		string = cconcatenate(string, tm_generate_edit_string(op, args, opcode, relation, relation_name));
	    } else {
		string = cconcatenate(string, tm_generate_cycl_string(args, relation, relation_name));
	    }
	    if (tm_datastructures.tm_op_thesaurus(op) != tm_datastructures.$tm_mt$.getGlobalValue()) {
		string = cconcatenate(string, new SubLObject[] { $str_alt48$_in_, format(NIL, $str_alt1$_a, tm_datastructures.tm_op_thesaurus_name(op)) });
	    }
	    return string;
	}
    }

    public static final SubLObject tm_generate_operation_string(SubLObject op) {
	{
	    SubLObject args = tm_datastructures.tm_op_args(op);
	    SubLObject opcode = tm_datastructures.tm_op_opcode(op);
	    SubLObject relation = tm_datastructures.tm_op_relation(op);
	    SubLObject string = $str_alt2$;
	    SubLObject pcase_var = opcode;
	    if (pcase_var.eql($CREATE)) {
		string = tm_generate_create_string(op, args);
	    } else if (pcase_var.eql($REPLACE)) {
		string = tm_generate_replace_string(op, args, relation);
	    } else if (pcase_var.eql($SPLICE_OUT)) {
		string = tm_generate_splice_or_nuke_string(op, args);
	    } else if (pcase_var.eql($NUKE)) {
		string = tm_generate_splice_or_nuke_string(op, args);
	    } else if (pcase_var.eql($CONVERT_NT_UF)) {
		string = tm_generate_convert_nt_uf_string(op, args);
	    } else if (pcase_var.eql($SWAP)) {
		string = tm_generate_swap_pt_uf_string(op, args);
	    } else {
		string = tm_generate_complex_string(op, args, opcode, relation);
	    }

	    return string;
	}
    }

    public static final SubLObject set_op_english(SubLObject op, SubLObject string) {
	if (string == UNPROVIDED) {
	    string = NIL;
	}
	{
	    SubLObject english = (string.isString()) ? ((SubLObject) (string)) : tm_generate_operation_string(op);
	    tm_datastructures._csetf_tm_op_english(op, english);
	    return english;
	}
    }

    public static final SubLObject html_show_tm_op(SubLObject op) {
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    {
		SubLObject args = tm_datastructures.tm_op_args(op);
		SubLObject opcode = tm_datastructures.tm_op_opcode(op);
		SubLObject relation = tm_datastructures.tm_op_relation(op);
		SubLObject english = tm_datastructures.tm_op_english(op);
		SubLObject pcase_var = opcode;
		if (pcase_var.eql($CREATE)) {
		    format(html_macros.$html_stream$.getDynamicValue(thread), NIL != string_utilities.non_empty_stringP(english) ? ((SubLObject) (english)) : tm_generate_create_string(op, args));
		} else if (pcase_var.eql($REPLACE)) {
		    format(html_macros.$html_stream$.getDynamicValue(thread), tm_generate_replace_string(op, args, relation));
		} else if (pcase_var.eql($SPLICE_OUT)) {
		    format(html_macros.$html_stream$.getDynamicValue(thread), tm_generate_splice_or_nuke_string(op, args));
		} else if (pcase_var.eql($NUKE)) {
		    format(html_macros.$html_stream$.getDynamicValue(thread), tm_generate_splice_or_nuke_string(op, args));
		} else if (pcase_var.eql($CONVERT_NT_UF)) {
		    format(html_macros.$html_stream$.getDynamicValue(thread), tm_generate_convert_nt_uf_string(op, args));
		} else if (pcase_var.eql($SWAP)) {
		    format(html_macros.$html_stream$.getDynamicValue(thread), tm_datastructures.tm_op_english(op));
		} else {
		    if (relation == $$tmRelationRestrictedFrom) {
			format(html_macros.$html_stream$.getDynamicValue(thread), tm_datastructures.tm_op_english(op));
		    } else {
			{
			    SubLObject relation_name = tm_generate_relation_name(op, relation);
			    if (!(relation.eql($$arg1Format) || relation.eql($$arg2Format))) {
				format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt46$_A_, opcode);
			    }
			    if (length(args).numE(TWO_INTEGER)) {
				if (relation == $$topInThesaurus) {
				    format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt35$__A__as_a_top_term_in__A, tm_datastructures.concept_term(args.first(), second(args)), tm_internals.thesaurus_name(second(args)));
				} else if (relation == $$preferredTerm) {
				    format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt36$__A__as_a_preferred_term, second(args));
				} else if (relation == $$comment) {
				    format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt56$this_comment_about__A___S, NIL != tm_internals.thesaurusP(args.first()) ? ((SubLObject) (tm_internals.thesaurus_name(args.first()))) : args.first(), second(args));
				} else if ((relation == $$arg1Format) || (relation == $$arg2Format)) {
				    if (NIL != tm_datastructures.tm_op_english(op)) {
					format(html_macros.$html_stream$.getDynamicValue(thread), tm_datastructures.tm_op_english(op));
				    } else {
					html_utilities.html_princ($$$Change_Cardinality_of_relation);
				    }
				} else {
				    html_show_tm_arg(tm_datastructures.tm_op_term(op));
				    format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt41$__A_, relation_name);
				    html_show_tm_arg(tm_datastructures.tm_op_value(op));
				}

			    } else {
				if (relation == $$tmStoplistWord) {
				    format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt42$_S__A_the_stoplist, args.first(), opcode == $ADD ? ((SubLObject) ($$$to)) : $$$from);
				} else if ((relation == $$tmRelationOrderList) && (NIL != english)) {
				    format(html_macros.$html_stream$.getDynamicValue(thread), english);
				} else if (relation == tm_datastructures.$tm_unary_active_pred$.getGlobalValue()) {
				    {
					SubLObject rel_symbol = tm_internals.tm_pred_arg_symbol(args.first(), ONE_INTEGER);
					SubLObject inv_symbol = tm_internals.tm_pred_arg_symbol(args.first(), TWO_INTEGER);
					if (NIL != inv_symbol) {
					    format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt37$_A_and_its_inverse___A___A_the_se, new SubLObject[] { rel_symbol, inv_symbol, opcode == $ADD ? ((SubLObject) ($$$to)) : $$$from });
					} else {
					    format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt58$_A__A_the_set_of_active_relations, rel_symbol, opcode == $ADD ? ((SubLObject) ($$$to)) : $$$from);
					}
				    }
				} else {
				    format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt43$__A, relation_name);
				    {
					SubLObject cdolist_list_var = args;
					SubLObject arg = NIL;
					for (arg = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), arg = cdolist_list_var.first()) {
					    html_utilities.html_princ($str_alt44$_);
					    html_show_tm_arg(arg);
					}
				    }
				    html_utilities.html_princ($str_alt45$_);
				}

			    }
			    if (tm_datastructures.tm_op_thesaurus(op) != tm_datastructures.$tm_mt$.getGlobalValue()) {
				format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt48$_in_);
				html_utilities.html_princ(tm_datastructures.tm_op_thesaurus_name(op));
			    }
			}
		    }
		}

	    }
	    return op;
	}
    }

    public static final SubLObject html_show_tm_op_description(SubLObject op) {
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    apply(symbol_function(FORMAT), html_macros.$html_stream$.getDynamicValue(thread), new SubLObject[] { tm_datastructures.tm_op_description(op), tm_datastructures.tm_op_description_args(op) });
	    return NIL;
	}
    }

    public static final SubLObject html_show_tm_op_descriptions(SubLObject ops) {
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    html_utilities.html_markup(html_macros.$html_unordered_list_head$.getGlobalValue());
	    html_utilities.html_char(CHAR_greater, UNPROVIDED);
	    {
		SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
		try {
		    html_macros.$html_safe_print$.bind(T, thread);
		    {
			SubLObject cdolist_list_var = ops;
			SubLObject op = NIL;
			for (op = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), op = cdolist_list_var.first()) {
			    html_utilities.html_markup(html_macros.$html_list_item_head$.getGlobalValue());
			    html_utilities.html_char(CHAR_greater, UNPROVIDED);
			    {
				SubLObject _prev_bind_0_2 = html_macros.$html_safe_print$.currentBinding(thread);
				try {
				    html_macros.$html_safe_print$.bind(T, thread);
				    html_utilities.html_markup(html_macros.$html_paragraph_head$.getGlobalValue());
				    html_show_tm_op(op);
				    html_utilities.html_princ($str_alt60$__);
				    html_utilities.html_br();
				    html_show_tm_op_description(op);
				    html_utilities.html_markup(html_macros.$html_paragraph_tail$.getGlobalValue());
				} finally {
				    html_macros.$html_safe_print$.rebind(_prev_bind_0_2, thread);
				}
			    }
			    html_utilities.html_markup(html_macros.$html_list_item_tail$.getGlobalValue());
			}
		    }
		} finally {
		    html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
		}
	    }
	    html_utilities.html_markup(html_macros.$html_unordered_list_tail$.getGlobalValue());
	    return NIL;
	}
    }

    public static final SubLObject html_show_nondependent_nt_ops(SubLObject ops) {
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    if (NIL != ops) {
		html_utilities.html_markup(html_macros.$html_paragraph_head$.getGlobalValue());
		format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt61$The_following_NTs_cannot_be_conve, tm_datastructures.sign_term(tm_datastructures.tm_op_args(ops.first()).first()));
		html_utilities.html_br();
		html_utilities.html_br();
		{
		    SubLObject cdolist_list_var = ops;
		    SubLObject op = NIL;
		    for (op = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), op = cdolist_list_var.first()) {
			{
			    SubLObject thesaurus = tm_datastructures.tm_op_thesaurus(op);
			    SubLObject thesaurus_name = tm_datastructures.tm_op_thesaurus_name(op);
			    SubLObject non_dependents = set_difference(gt_modules.all_narrower_terms(tm_datastructures.sign_concept(tm_datastructures.tm_op_args(op).first()), thesaurus), gt_modules.tm_dependents(tm_datastructures.sign_concept(tm_datastructures.tm_op_args(op).first()), thesaurus),
				    UNPROVIDED, UNPROVIDED);
			    html_utilities.html_markup(html_macros.$html_list_item_head$.getGlobalValue());
			    html_utilities.html_char(CHAR_greater, UNPROVIDED);
			    {
				SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
				try {
				    html_macros.$html_safe_print$.bind(T, thread);
				    format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt62$In_Thesaurus__A, thesaurus_name);
				    html_utilities.html_markup(html_macros.$html_unordered_list_head$.getGlobalValue());
				    html_utilities.html_simple_attribute(html_macros.$html_list_plain$.getGlobalValue());
				    html_utilities.html_char(CHAR_greater, UNPROVIDED);
				    {
					SubLObject _prev_bind_0_3 = html_macros.$html_safe_print$.currentBinding(thread);
					try {
					    html_macros.$html_safe_print$.bind(T, thread);
					    {
						SubLObject cdolist_list_var_4 = non_dependents;
						SubLObject non_dependent = NIL;
						for (non_dependent = cdolist_list_var_4.first(); NIL != cdolist_list_var_4; cdolist_list_var_4 = cdolist_list_var_4.rest(), non_dependent = cdolist_list_var_4.first()) {
						    html_utilities.html_markup(html_macros.$html_list_item_head$.getGlobalValue());
						    html_utilities.html_char(CHAR_greater, UNPROVIDED);
						    {
							SubLObject _prev_bind_0_5 = html_macros.$html_safe_print$.currentBinding(thread);
							try {
							    html_macros.$html_safe_print$.bind(T, thread);
							    html_utilities.html_princ(tm_datastructures.concept_term(non_dependent, thesaurus));
							} finally {
							    html_macros.$html_safe_print$.rebind(_prev_bind_0_5, thread);
							}
						    }
						    html_utilities.html_markup(html_macros.$html_list_item_tail$.getGlobalValue());
						}
					    }
					} finally {
					    html_macros.$html_safe_print$.rebind(_prev_bind_0_3, thread);
					}
				    }
				    html_utilities.html_markup(html_macros.$html_unordered_list_tail$.getGlobalValue());
				} finally {
				    html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
				}
			    }
			    html_utilities.html_markup(html_macros.$html_list_item_tail$.getGlobalValue());
			}
		    }
		}
		html_utilities.html_markup(html_macros.$html_paragraph_tail$.getGlobalValue());
	    }
	    return NIL;
	}
    }

    public static final SubLObject html_show_bad_ops(SubLObject ops) {
	if (NIL != ops) {
	    html_utilities.html_markup(html_macros.$html_paragraph_head$.getGlobalValue());
	    html_utilities.html_princ($str_alt63$The_following_operations_could_no);
	    html_utilities.html_markup(html_macros.$html_paragraph_tail$.getGlobalValue());
	    html_show_tm_op_descriptions(ops);
	}
	return NIL;
    }

    public static final SubLObject html_show_bad_ops_page(SubLObject ops) {
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    {
		SubLObject color_value = tm_datastructures.$tm_bg_color_default$.getDynamicValue(thread);
		html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
		html_utilities.html_markup(html_macros.$html_head_head$.getGlobalValue());
		html_macros.html_head_content_type();
		html_utilities.html_source_readability_terpri(UNPROVIDED);
		html_utilities.html_markup(html_macros.$html_title_head$.getGlobalValue());
		html_utilities.html_princ($$$Operation_Results);
		html_utilities.html_markup(html_macros.$html_title_tail$.getGlobalValue());
		html_utilities.html_markup(html_macros.$html_head_tail$.getGlobalValue());
		html_utilities.html_source_readability_terpri(UNPROVIDED);
		{
		    SubLObject _prev_bind_0 = html_macros.$html_inside_bodyP$.currentBinding(thread);
		    try {
			html_macros.$html_inside_bodyP$.bind(T, thread);
			html_utilities.html_markup(html_macros.$html_body_head$.getGlobalValue());
			if (NIL != color_value) {
			    html_utilities.html_markup(html_macros.$html_body_bgcolor$.getGlobalValue());
			    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
			    html_utilities.html_markup(html_utilities.html_color(color_value));
			    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
			}
			html_utilities.html_char(CHAR_greater, UNPROVIDED);
			{
			    SubLObject _prev_bind_0_6 = html_macros.$html_safe_print$.currentBinding(thread);
			    try {
				html_macros.$html_safe_print$.bind(T, thread);
				html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
				html_utilities.html_markup(ONE_INTEGER);
				html_utilities.html_char(CHAR_greater, UNPROVIDED);
				if ((NIL != tm_control_vars.$client_thes_home_page$.getDynamicValue(thread)) && (NIL != tm_control_vars.$client_mini_logo$.getDynamicValue(thread))) {
				    html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
				    html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
				    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
				    html_utilities.html_markup(tm_control_vars.$client_thes_home_page$.getDynamicValue(thread));
				    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
				    html_utilities.html_char(CHAR_greater, UNPROVIDED);
				    {
					SubLObject _prev_bind_0_7 = html_macros.$html_safe_print$.currentBinding(thread);
					try {
					    html_macros.$html_safe_print$.bind(T, thread);
					    html_utilities.html_markup(html_macros.$html_image_head$.getGlobalValue());
					    html_utilities.html_markup(html_macros.$html_image_src$.getGlobalValue());
					    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
					    html_utilities.html_markup(tm_control_vars.$client_mini_logo$.getDynamicValue(thread));
					    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
					    if (NIL != tm_control_vars.$client_name$.getDynamicValue(thread)) {
						html_utilities.html_markup(html_macros.$html_image_alt$.getGlobalValue());
						html_utilities.html_char(CHAR_quotation, UNPROVIDED);
						html_utilities.html_markup(tm_control_vars.$client_name$.getDynamicValue(thread));
						html_utilities.html_char(CHAR_quotation, UNPROVIDED);
					    }
					    if (true) {
						html_utilities.html_markup(html_macros.$html_image_border$.getGlobalValue());
						html_utilities.html_char(CHAR_quotation, UNPROVIDED);
						html_utilities.html_markup(ZERO_INTEGER);
						html_utilities.html_char(CHAR_quotation, UNPROVIDED);
					    }
					    html_utilities.html_char(CHAR_greater, UNPROVIDED);
					    {
						SubLObject _prev_bind_0_8 = html_macros.$html_safe_print$.currentBinding(thread);
						try {
						    html_macros.$html_safe_print$.bind(T, thread);
						} finally {
						    html_macros.$html_safe_print$.rebind(_prev_bind_0_8, thread);
						}
					    }
					    html_utilities.html_markup(html_macros.$html_image_tail$.getGlobalValue());
					} finally {
					    html_macros.$html_safe_print$.rebind(_prev_bind_0_7, thread);
					}
				    }
				    html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
				}
				html_utilities.html_princ($$$Operation_Results);
				html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
				html_utilities.html_markup(ONE_INTEGER);
				html_utilities.html_char(CHAR_greater, UNPROVIDED);
				tm_logging.tm_enqueue_event($$$Operation_Results);
				html_show_bad_ops(ops);
				html_thesaurus.tm_footer();
				html_utilities.html_source_readability_terpri(UNPROVIDED);
			    } finally {
				html_macros.$html_safe_print$.rebind(_prev_bind_0_6, thread);
			    }
			}
			html_utilities.html_markup(html_macros.$html_body_tail$.getGlobalValue());
			html_utilities.html_source_readability_terpri(UNPROVIDED);
		    } finally {
			html_macros.$html_inside_bodyP$.rebind(_prev_bind_0, thread);
		    }
		}
		html_utilities.html_markup(html_macros.$html_html_tail$.getGlobalValue());
		html_utilities.html_source_readability_terpri(UNPROVIDED);
	    }
	    return NIL;
	}
    }

    /**
     * Prints a preferredTerm assertion readably.
     */
    public static final SubLObject html_print_pt_assertion(SubLObject assertion) {
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    {
		SubLObject thesaurus = assertions_high.assertion_mt(assertion);
		SubLObject arg1 = assertions_high.gaf_arg1(assertion);
		SubLObject arg2 = assertions_high.gaf_arg2(assertion);
		html_utilities.html_princ($str_alt65$_The_preferred_term_for_Cyc_conce);
		html_thesaurus.tm_link($CONCEPT_DESCRIPTION, arg1, UNPROVIDED, UNPROVIDED);
		format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt67$_is__S_in__A_, arg2, tm_internals.thesaurus_name(thesaurus));
	    }
	    return NIL;
	}
    }

    /**
     * Prints a topInThesaurus assertion readably
     */
    public static final SubLObject html_print_top_assertion(SubLObject assertion) {
	{
	    SubLObject v_term = assertions_high.gaf_arg1(assertion);
	    SubLObject thesaurus = assertions_high.gaf_arg2(assertion);
	    html_utilities.html_princ($str_alt68$__);
	    html_thesaurus.tm_link($HIERARCHICAL, cb_utilities.cb_fort_identifier(v_term), tm_datastructures.concept_term(v_term, thesaurus), UNPROVIDED);
	    html_utilities.html_princ($str_alt69$__is_a_top_term_in);
	    html_utilities.html_princ(tm_internals.thesaurus_name(thesaurus));
	}
	return NIL;
    }

    /**
     * print an assertion using thesaurus vocab, using infix notation and with
     * links to the thesaurus terms
     */
    public static final SubLObject html_print_thesaurus_assertion(SubLObject assertion) {
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    {
		SubLObject thesaurus = assertions_high.assertion_mt(assertion);
		SubLObject predicate = assertions_high.gaf_arg0(assertion);
		SubLObject arg1 = assertions_high.gaf_arg1(assertion);
		SubLObject arg2 = assertions_high.gaf_arg2(assertion);
		SubLObject arg1type = tm_internals.tm_relation_argtype(predicate, ONE_INTEGER);
		SubLObject arg2type = tm_internals.tm_relation_argtype(predicate, TWO_INTEGER);
		if (predicate == $$preferredTerm) {
		    return html_print_pt_assertion(assertion);
		}
		if (predicate == $$topInThesaurus) {
		    return html_print_top_assertion(assertion);
		}
		html_utilities.html_princ($str_alt70$_);
		{
		    SubLObject pcase_var = arg1type;
		    if (pcase_var.eql($STRING)) {
			format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt72$_S_, arg1);
		    } else if (pcase_var.eql($CONSTANT)) {
			html_utilities.html_princ($str_alt74$_);
			html_thesaurus.tm_link($HIERARCHICAL, cb_utilities.cb_fort_identifier(arg1), tm_datastructures.concept_term(arg1, thesaurus), UNPROVIDED);
			html_utilities.html_princ($str_alt75$__);
		    } else {
			html_utilities.html_princ(arg1);
		    }

		}
		html_thesaurus.tm_link($RELATION, tm_internals.tm_pred_arg_symbol(predicate, ONE_INTEGER), UNPROVIDED, UNPROVIDED);
		{
		    SubLObject pcase_var = arg2type;
		    if (pcase_var.eql($STRING)) {
			format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt77$__S, arg2);
		    } else if (pcase_var.eql($CONSTANT)) {
			html_utilities.html_princ($str_alt78$__);
			html_thesaurus.tm_link($HIERARCHICAL, cb_utilities.cb_fort_identifier(arg2), tm_datastructures.concept_term(arg2, thesaurus), UNPROVIDED);
			html_utilities.html_princ($str_alt79$_);
		    } else {
			html_utilities.html_princ(arg2);
		    }

		}
		format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt80$__in__A, tm_internals.thesaurus_name(thesaurus));
	    }
	    return NIL;
	}
    }

    /**
     * returns a plain string printing ASSERTION using thesaurus vocabulary and infix notation.
     */
    public static final SubLObject tm_format_thesaurus_assertion(SubLObject assertion) {
	{
	    SubLObject thesaurus = assertions_high.assertion_mt(assertion);
	    SubLObject predicate = assertions_high.gaf_arg0(assertion);
	    SubLObject arg1 = assertions_high.gaf_arg1(assertion);
	    SubLObject arg2 = assertions_high.gaf_arg2(assertion);
	    SubLObject arg1type = tm_internals.tm_relation_argtype(predicate, ONE_INTEGER);
	    SubLObject arg2type = tm_internals.tm_relation_argtype(predicate, TWO_INTEGER);
	    SubLObject result = NIL;
	    result = $str_alt70$_;
	    {
		SubLObject pcase_var = arg1type;
		if (pcase_var.eql($STRING)) {
		    if (arg1.isString()) {
			result = cconcatenate(result, arg1);
		    } else {
			result = cconcatenate(result, format(NIL, $str_alt72$_S_, arg1));
		    }
		} else if (pcase_var.eql($CONSTANT)) {
		    result = cconcatenate(result, format(NIL, $str_alt81$__A__, tm_datastructures.concept_term(arg1, thesaurus)));
		} else {
		    result = cconcatenate(result, princ(arg1, NIL));
		}

	    }
	    result = cconcatenate(result, tm_internals.tm_pred_arg_symbol(predicate, ONE_INTEGER));
	    {
		SubLObject pcase_var = arg2type;
		if (pcase_var.eql($STRING)) {
		    result = cconcatenate(result, format(NIL, $str_alt77$__S, arg2));
		} else if (pcase_var.eql($CONSTANT)) {
		    result = cconcatenate(result, format(NIL, $str_alt82$___A_, tm_datastructures.concept_term(arg2, thesaurus)));
		} else {
		    result = cconcatenate(result, princ(arg2, NIL));
		}

	    }
	    result = cconcatenate(result, $str_alt83$_);
	    return result;
	}
    }

    public static final SubLObject html_verify_ops(SubLObject ops) {
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    html_utilities.html_markup(html_macros.$html_unordered_list_head$.getGlobalValue());
	    html_utilities.html_char(CHAR_greater, UNPROVIDED);
	    {
		SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
		try {
		    html_macros.$html_safe_print$.bind(T, thread);
		    {
			SubLObject cdolist_list_var = ops;
			SubLObject op = NIL;
			for (op = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), op = cdolist_list_var.first()) {
			    {
				SubLObject key = tm_datastructures.cache_operation(op);
				html_utilities.html_markup(html_macros.$html_list_item_head$.getGlobalValue());
				html_utilities.html_char(CHAR_greater, UNPROVIDED);
				{
				    SubLObject _prev_bind_0_9 = html_macros.$html_safe_print$.currentBinding(thread);
				    try {
					html_macros.$html_safe_print$.bind(T, thread);
					if (NIL == tm_datastructures.tm_op_hiddenP(op)) {
					    html_utilities.html_checkbox_input($$$operation, key, makeBoolean(NIL == tm_datastructures.tm_op_verifyP(op)), UNPROVIDED, UNPROVIDED, UNPROVIDED);
					    html_utilities.html_princ($str_alt44$_);
					    html_show_tm_op(op);
					    if ((NIL != tm_datastructures.tm_op_verifyP(op)) && (NIL != tm_datastructures.tm_op_description(op))) {
						html_utilities.html_br();
						html_utilities.html_princ($str_alt85$Note__);
						html_show_tm_op_description(op);
					    }
					    html_utilities.html_hidden_input($str_alt86$cache_key, key, UNPROVIDED);
					}
				    } finally {
					html_macros.$html_safe_print$.rebind(_prev_bind_0_9, thread);
				    }
				}
				html_utilities.html_markup(html_macros.$html_list_item_tail$.getGlobalValue());
			    }
			}
		    }
		} finally {
		    html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
		}
	    }
	    html_utilities.html_markup(html_macros.$html_unordered_list_tail$.getGlobalValue());
	    return NIL;
	}
    }

    public static final SubLObject html_verify_ops_page(SubLObject handler, SubLObject bad, SubLObject good) {
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    {
		SubLObject color_value = tm_datastructures.$tm_bg_color_default$.getDynamicValue(thread);
		html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
		html_utilities.html_markup(html_macros.$html_head_head$.getGlobalValue());
		html_macros.html_head_content_type();
		html_utilities.html_source_readability_terpri(UNPROVIDED);
		html_utilities.html_markup(html_macros.$html_title_head$.getGlobalValue());
		html_utilities.html_princ($$$Verify_Operations);
		html_utilities.html_markup(html_macros.$html_title_tail$.getGlobalValue());
		html_utilities.html_markup(html_macros.$html_head_tail$.getGlobalValue());
		html_utilities.html_source_readability_terpri(UNPROVIDED);
		{
		    SubLObject _prev_bind_0 = html_macros.$html_inside_bodyP$.currentBinding(thread);
		    try {
			html_macros.$html_inside_bodyP$.bind(T, thread);
			html_utilities.html_markup(html_macros.$html_body_head$.getGlobalValue());
			if (NIL != color_value) {
			    html_utilities.html_markup(html_macros.$html_body_bgcolor$.getGlobalValue());
			    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
			    html_utilities.html_markup(html_utilities.html_color(color_value));
			    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
			}
			html_utilities.html_char(CHAR_greater, UNPROVIDED);
			{
			    SubLObject _prev_bind_0_10 = html_macros.$html_safe_print$.currentBinding(thread);
			    try {
				html_macros.$html_safe_print$.bind(T, thread);
				html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
				html_utilities.html_markup(ONE_INTEGER);
				html_utilities.html_char(CHAR_greater, UNPROVIDED);
				if ((NIL != tm_control_vars.$client_thes_home_page$.getDynamicValue(thread)) && (NIL != tm_control_vars.$client_mini_logo$.getDynamicValue(thread))) {
				    html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
				    html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
				    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
				    html_utilities.html_markup(tm_control_vars.$client_thes_home_page$.getDynamicValue(thread));
				    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
				    html_utilities.html_char(CHAR_greater, UNPROVIDED);
				    {
					SubLObject _prev_bind_0_11 = html_macros.$html_safe_print$.currentBinding(thread);
					try {
					    html_macros.$html_safe_print$.bind(T, thread);
					    html_utilities.html_markup(html_macros.$html_image_head$.getGlobalValue());
					    html_utilities.html_markup(html_macros.$html_image_src$.getGlobalValue());
					    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
					    html_utilities.html_markup(tm_control_vars.$client_mini_logo$.getDynamicValue(thread));
					    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
					    if (NIL != tm_control_vars.$client_name$.getDynamicValue(thread)) {
						html_utilities.html_markup(html_macros.$html_image_alt$.getGlobalValue());
						html_utilities.html_char(CHAR_quotation, UNPROVIDED);
						html_utilities.html_markup(tm_control_vars.$client_name$.getDynamicValue(thread));
						html_utilities.html_char(CHAR_quotation, UNPROVIDED);
					    }
					    if (true) {
						html_utilities.html_markup(html_macros.$html_image_border$.getGlobalValue());
						html_utilities.html_char(CHAR_quotation, UNPROVIDED);
						html_utilities.html_markup(ZERO_INTEGER);
						html_utilities.html_char(CHAR_quotation, UNPROVIDED);
					    }
					    html_utilities.html_char(CHAR_greater, UNPROVIDED);
					    {
						SubLObject _prev_bind_0_12 = html_macros.$html_safe_print$.currentBinding(thread);
						try {
						    html_macros.$html_safe_print$.bind(T, thread);
						} finally {
						    html_macros.$html_safe_print$.rebind(_prev_bind_0_12, thread);
						}
					    }
					    html_utilities.html_markup(html_macros.$html_image_tail$.getGlobalValue());
					} finally {
					    html_macros.$html_safe_print$.rebind(_prev_bind_0_11, thread);
					}
				    }
				    html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
				}
				html_utilities.html_princ($$$Verify_Operations);
				html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
				html_utilities.html_markup(ONE_INTEGER);
				html_utilities.html_char(CHAR_greater, UNPROVIDED);
				tm_logging.tm_enqueue_event($$$Verify_Operations);
				if (NIL != bad) {
				    html_show_bad_ops(bad);
				}
				html_utilities.html_markup(html_macros.$html_paragraph_head$.getGlobalValue());
				html_utilities.html_princ($str_alt88$Please_verify_the_following_opera);
				html_utilities.html_markup(html_macros.$html_paragraph_tail$.getGlobalValue());
				html_utilities.html_markup(html_macros.$html_form_head$.getGlobalValue());
				html_utilities.html_markup(html_macros.$html_form_action$.getGlobalValue());
				html_utilities.html_char(CHAR_quotation, UNPROVIDED);
				html_utilities.html_markup(system_parameters.$cyc_cgi_program$.getDynamicValue(thread));
				html_utilities.html_char(CHAR_quotation, UNPROVIDED);
				if (NIL != html_macros.$html_form_method_post$.getGlobalValue()) {
				    html_utilities.html_markup(html_macros.$html_form_method$.getGlobalValue());
				    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
				    html_utilities.html_markup(html_macros.$html_form_method_post$.getGlobalValue());
				    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
				}
				html_utilities.html_char(CHAR_greater, UNPROVIDED);
				{
				    SubLObject _prev_bind_0_13 = html_macros.$html_safe_print$.currentBinding(thread);
				    SubLObject _prev_bind_1 = html_macros.$within_html_form$.currentBinding(thread);
				    SubLObject _prev_bind_2 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
				    try {
					html_macros.$html_safe_print$.bind(T, thread);
					html_macros.$within_html_form$.bind(T, thread);
					html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
					html_utilities.html_hidden_input(handler, T, UNPROVIDED);
					html_verify_ops(good);
					html_utilities.html_princ($str_alt44$_);
					html_utilities.html_submit_input($$$Perform_selected_operations, UNPROVIDED, UNPROVIDED);
					html_utilities.html_reset_input($$$Reset);
					html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
				    } finally {
					html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_2, thread);
					html_macros.$within_html_form$.rebind(_prev_bind_1, thread);
					html_macros.$html_safe_print$.rebind(_prev_bind_0_13, thread);
				    }
				}
				html_utilities.html_markup(html_macros.$html_form_tail$.getGlobalValue());
				html_thesaurus.tm_footer();
				html_utilities.html_source_readability_terpri(UNPROVIDED);
			    } finally {
				html_macros.$html_safe_print$.rebind(_prev_bind_0_10, thread);
			    }
			}
			html_utilities.html_markup(html_macros.$html_body_tail$.getGlobalValue());
			html_utilities.html_source_readability_terpri(UNPROVIDED);
		    } finally {
			html_macros.$html_inside_bodyP$.rebind(_prev_bind_0, thread);
		    }
		}
		html_utilities.html_markup(html_macros.$html_html_tail$.getGlobalValue());
		html_utilities.html_source_readability_terpri(UNPROVIDED);
	    }
	    return NIL;
	}
    }

    /**
     * Performs ops and returns a list of triples.  Each triple consists of the op
     * performed, the result indicator (keyword) returned by perform-operation, and
     * the diagnostic (if any) returned by perform-operation.
     */
    public static final SubLObject perform_operations_guts(SubLObject ops) {
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    {
		SubLObject result_triples = NIL;
		SubLObject cdolist_list_var = ops;
		SubLObject op = NIL;
		for (op = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), op = cdolist_list_var.first()) {
		    thread.resetMultipleValues();
		    {
			SubLObject result = tm_internals.perform_operation(op);
			SubLObject diagnostic = thread.secondMultipleValue();
			thread.resetMultipleValues();
			result_triples = cons(list(op, result, diagnostic), result_triples);
		    }
		}
		tm_logging.tm_save_ops_to_log();
		return nreverse(result_triples);
	    }
	}
    }

    public static final SubLObject print_operations_results(SubLObject op_triples) {
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    {
		SubLObject some_visibleP = NIL;
		if (NIL == some_visibleP) {
		    {
			SubLObject csome_list_var = op_triples;
			SubLObject triple = NIL;
			for (triple = csome_list_var.first(); !((NIL != some_visibleP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest(), triple = csome_list_var.first()) {
			    if (NIL == tm_datastructures.tm_op_hiddenP(triple.first())) {
				some_visibleP = T;
			    }
			}
		    }
		}
		if (NIL != some_visibleP) {
		    html_utilities.html_princ($str_alt91$The_following_operations_were_att);
		}
		html_utilities.html_markup(html_macros.$html_unordered_list_head$.getGlobalValue());
		html_utilities.html_char(CHAR_greater, UNPROVIDED);
		{
		    SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
		    try {
			html_macros.$html_safe_print$.bind(T, thread);
			{
			    SubLObject cdolist_list_var = op_triples;
			    SubLObject triple = NIL;
			    for (triple = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), triple = cdolist_list_var.first()) {
				{
				    SubLObject op = triple.first();
				    SubLObject result = second(triple);
				    SubLObject diagnostic = third(triple);
				    if (NIL == tm_datastructures.tm_op_hiddenP(op)) {
					html_utilities.html_markup(html_macros.$html_list_item_head$.getGlobalValue());
					html_utilities.html_char(CHAR_greater, UNPROVIDED);
					{
					    SubLObject _prev_bind_0_14 = html_macros.$html_safe_print$.currentBinding(thread);
					    try {
						html_macros.$html_safe_print$.bind(T, thread);
						html_show_tm_op(op);
						{
						    SubLObject pcase_var = result;
						    if (pcase_var.eql($OK)) {
							format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt93$_succeeded_);
						    } else if (pcase_var.eql($WARNING)) {
							html_utilities.html_princ($str_alt95$_succeeded_with_the_warning_);
							html_utilities.html_br();
							format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt96$_A, diagnostic);
						    } else if (pcase_var.eql($ERROR)) {
							html_utilities.html_princ($str_alt98$_failed_);
							html_utilities.html_br();
							format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt96$_A, diagnostic);
						    } else {
							format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt99$Implementation_error__Unkown_resu, result);
						    }

						}
					    } finally {
						html_macros.$html_safe_print$.rebind(_prev_bind_0_14, thread);
					    }
					}
					html_utilities.html_markup(html_macros.$html_list_item_tail$.getGlobalValue());
					html_utilities.html_terpri(TWO_INTEGER);
				    }
				    tm_datastructures.free_tm_op(op);
				}
			    }
			}
		    } finally {
			html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
		    }
		}
		html_utilities.html_markup(html_macros.$html_unordered_list_tail$.getGlobalValue());
		return NIL;
	    }
	}
    }

    public static final SubLObject perform_operations(SubLObject ops) {
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    {
		SubLObject op_triples = perform_operations_guts(ops);
		SubLObject color_value = tm_datastructures.$tm_bg_color_default$.getDynamicValue(thread);
		html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
		html_utilities.html_markup(html_macros.$html_head_head$.getGlobalValue());
		html_macros.html_head_content_type();
		html_utilities.html_source_readability_terpri(UNPROVIDED);
		html_utilities.html_markup(html_macros.$html_title_head$.getGlobalValue());
		html_utilities.html_princ($$$Operation_Results);
		html_utilities.html_markup(html_macros.$html_title_tail$.getGlobalValue());
		html_utilities.html_markup(html_macros.$html_head_tail$.getGlobalValue());
		html_utilities.html_source_readability_terpri(UNPROVIDED);
		{
		    SubLObject _prev_bind_0 = html_macros.$html_inside_bodyP$.currentBinding(thread);
		    try {
			html_macros.$html_inside_bodyP$.bind(T, thread);
			html_utilities.html_markup(html_macros.$html_body_head$.getGlobalValue());
			if (NIL != color_value) {
			    html_utilities.html_markup(html_macros.$html_body_bgcolor$.getGlobalValue());
			    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
			    html_utilities.html_markup(html_utilities.html_color(color_value));
			    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
			}
			html_utilities.html_char(CHAR_greater, UNPROVIDED);
			{
			    SubLObject _prev_bind_0_15 = html_macros.$html_safe_print$.currentBinding(thread);
			    try {
				html_macros.$html_safe_print$.bind(T, thread);
				html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
				html_utilities.html_markup(ONE_INTEGER);
				html_utilities.html_char(CHAR_greater, UNPROVIDED);
				if ((NIL != tm_control_vars.$client_thes_home_page$.getDynamicValue(thread)) && (NIL != tm_control_vars.$client_mini_logo$.getDynamicValue(thread))) {
				    html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
				    html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
				    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
				    html_utilities.html_markup(tm_control_vars.$client_thes_home_page$.getDynamicValue(thread));
				    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
				    html_utilities.html_char(CHAR_greater, UNPROVIDED);
				    {
					SubLObject _prev_bind_0_16 = html_macros.$html_safe_print$.currentBinding(thread);
					try {
					    html_macros.$html_safe_print$.bind(T, thread);
					    html_utilities.html_markup(html_macros.$html_image_head$.getGlobalValue());
					    html_utilities.html_markup(html_macros.$html_image_src$.getGlobalValue());
					    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
					    html_utilities.html_markup(tm_control_vars.$client_mini_logo$.getDynamicValue(thread));
					    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
					    if (NIL != tm_control_vars.$client_name$.getDynamicValue(thread)) {
						html_utilities.html_markup(html_macros.$html_image_alt$.getGlobalValue());
						html_utilities.html_char(CHAR_quotation, UNPROVIDED);
						html_utilities.html_markup(tm_control_vars.$client_name$.getDynamicValue(thread));
						html_utilities.html_char(CHAR_quotation, UNPROVIDED);
					    }
					    if (true) {
						html_utilities.html_markup(html_macros.$html_image_border$.getGlobalValue());
						html_utilities.html_char(CHAR_quotation, UNPROVIDED);
						html_utilities.html_markup(ZERO_INTEGER);
						html_utilities.html_char(CHAR_quotation, UNPROVIDED);
					    }
					    html_utilities.html_char(CHAR_greater, UNPROVIDED);
					    {
						SubLObject _prev_bind_0_17 = html_macros.$html_safe_print$.currentBinding(thread);
						try {
						    html_macros.$html_safe_print$.bind(T, thread);
						} finally {
						    html_macros.$html_safe_print$.rebind(_prev_bind_0_17, thread);
						}
					    }
					    html_utilities.html_markup(html_macros.$html_image_tail$.getGlobalValue());
					} finally {
					    html_macros.$html_safe_print$.rebind(_prev_bind_0_16, thread);
					}
				    }
				    html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
				}
				html_utilities.html_princ($$$Operation_Results);
				html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
				html_utilities.html_markup(ONE_INTEGER);
				html_utilities.html_char(CHAR_greater, UNPROVIDED);
				tm_logging.tm_enqueue_event($$$Operation_Results);
				html_thesaurus.thesaurus_heading($str_alt100$perform_operations);
				print_operations_results(op_triples);
				if (NIL == ops) {
				    html_utilities.html_princ($str_alt101$No_operations_were_performed_);
				}
				html_thesaurus.tm_footer();
				html_utilities.html_source_readability_terpri(UNPROVIDED);
			    } finally {
				html_macros.$html_safe_print$.rebind(_prev_bind_0_15, thread);
			    }
			}
			html_utilities.html_markup(html_macros.$html_body_tail$.getGlobalValue());
			html_utilities.html_source_readability_terpri(UNPROVIDED);
		    } finally {
			html_macros.$html_inside_bodyP$.rebind(_prev_bind_0, thread);
		    }
		}
		html_utilities.html_markup(html_macros.$html_html_tail$.getGlobalValue());
		html_utilities.html_source_readability_terpri(UNPROVIDED);
	    }
	    return NIL;
	}
    }

    public static final SubLObject check_and_perform_operation(SubLObject op) {
	tm_internals.check_operation_syntax(op);
	if (tm_datastructures.tm_op_status(op) == $OK) {
	    tm_internals.check_operation_semantics(op);
	    if (tm_datastructures.tm_op_status(op) == $OK) {
		tm_internals.perform_operation(op);
	    }
	}
	return op;
    }

    /**
     * Check OPS and generate appropriate pages.  Handles verification.
     */
    public static final SubLObject do_operations(SubLObject ops, SubLObject verify_anywayP) {
	if (verify_anywayP == UNPROVIDED) {
	    verify_anywayP = NIL;
	}
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    if (NIL == ops) {
		report_no_operations();
	    }
	    thread.resetMultipleValues();
	    {
		SubLObject bad = tm_internals.check_operations(ops);
		SubLObject good = thread.secondMultipleValue();
		SubLObject verifyP = thread.thirdMultipleValue();
		thread.resetMultipleValues();
		if (NIL == good) {
		    html_show_bad_ops_page(bad);
		} else if ((NIL != verifyP) || (NIL != verify_anywayP)) {
		    html_verify_ops_page($str_alt102$tm_handle_do_operations, bad, good);
		} else {
		    really_do_operations(bad, good);
		}

	    }
	    return NIL;
	}
    }

    public static final SubLObject report_no_operations() {
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    {
		SubLObject color_value = tm_datastructures.$tm_bg_color_default$.getDynamicValue(thread);
		html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
		html_utilities.html_markup(html_macros.$html_head_head$.getGlobalValue());
		html_macros.html_head_content_type();
		html_utilities.html_source_readability_terpri(UNPROVIDED);
		html_utilities.html_markup(html_macros.$html_title_head$.getGlobalValue());
		html_utilities.html_princ($$$No_Operations_To_Perform);
		html_utilities.html_markup(html_macros.$html_title_tail$.getGlobalValue());
		html_utilities.html_markup(html_macros.$html_head_tail$.getGlobalValue());
		html_utilities.html_source_readability_terpri(UNPROVIDED);
		{
		    SubLObject _prev_bind_0 = html_macros.$html_inside_bodyP$.currentBinding(thread);
		    try {
			html_macros.$html_inside_bodyP$.bind(T, thread);
			html_utilities.html_markup(html_macros.$html_body_head$.getGlobalValue());
			if (NIL != color_value) {
			    html_utilities.html_markup(html_macros.$html_body_bgcolor$.getGlobalValue());
			    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
			    html_utilities.html_markup(html_utilities.html_color(color_value));
			    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
			}
			html_utilities.html_char(CHAR_greater, UNPROVIDED);
			{
			    SubLObject _prev_bind_0_18 = html_macros.$html_safe_print$.currentBinding(thread);
			    try {
				html_macros.$html_safe_print$.bind(T, thread);
				html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
				html_utilities.html_markup(ONE_INTEGER);
				html_utilities.html_char(CHAR_greater, UNPROVIDED);
				if ((NIL != tm_control_vars.$client_thes_home_page$.getDynamicValue(thread)) && (NIL != tm_control_vars.$client_mini_logo$.getDynamicValue(thread))) {
				    html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
				    html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
				    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
				    html_utilities.html_markup(tm_control_vars.$client_thes_home_page$.getDynamicValue(thread));
				    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
				    html_utilities.html_char(CHAR_greater, UNPROVIDED);
				    {
					SubLObject _prev_bind_0_19 = html_macros.$html_safe_print$.currentBinding(thread);
					try {
					    html_macros.$html_safe_print$.bind(T, thread);
					    html_utilities.html_markup(html_macros.$html_image_head$.getGlobalValue());
					    html_utilities.html_markup(html_macros.$html_image_src$.getGlobalValue());
					    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
					    html_utilities.html_markup(tm_control_vars.$client_mini_logo$.getDynamicValue(thread));
					    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
					    if (NIL != tm_control_vars.$client_name$.getDynamicValue(thread)) {
						html_utilities.html_markup(html_macros.$html_image_alt$.getGlobalValue());
						html_utilities.html_char(CHAR_quotation, UNPROVIDED);
						html_utilities.html_markup(tm_control_vars.$client_name$.getDynamicValue(thread));
						html_utilities.html_char(CHAR_quotation, UNPROVIDED);
					    }
					    if (true) {
						html_utilities.html_markup(html_macros.$html_image_border$.getGlobalValue());
						html_utilities.html_char(CHAR_quotation, UNPROVIDED);
						html_utilities.html_markup(ZERO_INTEGER);
						html_utilities.html_char(CHAR_quotation, UNPROVIDED);
					    }
					    html_utilities.html_char(CHAR_greater, UNPROVIDED);
					    {
						SubLObject _prev_bind_0_20 = html_macros.$html_safe_print$.currentBinding(thread);
						try {
						    html_macros.$html_safe_print$.bind(T, thread);
						} finally {
						    html_macros.$html_safe_print$.rebind(_prev_bind_0_20, thread);
						}
					    }
					    html_utilities.html_markup(html_macros.$html_image_tail$.getGlobalValue());
					} finally {
					    html_macros.$html_safe_print$.rebind(_prev_bind_0_19, thread);
					}
				    }
				    html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
				}
				html_utilities.html_princ($$$No_Operations_To_Perform);
				html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
				html_utilities.html_markup(ONE_INTEGER);
				html_utilities.html_char(CHAR_greater, UNPROVIDED);
				tm_logging.tm_enqueue_event($$$No_Operations_To_Perform);
				html_thesaurus.thesaurus_heading($str_alt104$report_no_operations);
				html_thesaurus.tm_footer();
				html_utilities.html_source_readability_terpri(UNPROVIDED);
			    } finally {
				html_macros.$html_safe_print$.rebind(_prev_bind_0_18, thread);
			    }
			}
			html_utilities.html_markup(html_macros.$html_body_tail$.getGlobalValue());
			html_utilities.html_source_readability_terpri(UNPROVIDED);
		    } finally {
			html_macros.$html_inside_bodyP$.rebind(_prev_bind_0, thread);
		    }
		}
		html_utilities.html_markup(html_macros.$html_html_tail$.getGlobalValue());
		html_utilities.html_source_readability_terpri(UNPROVIDED);
	    }
	    return NIL;
	}
    }

    public static final SubLObject tm_handle_do_operations(SubLObject args) {
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    {
		SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
		SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
		try {
		    mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_GENL_MT, thread);
		    mt_relevance_macros.$mt$.bind(tm_datastructures.$tm_mt$.getGlobalValue(), thread);
		    {
			SubLObject cache_keys = Mapping.mapcar(symbol_function(READ_FROM_STRING_IGNORING_ERRORS), html_utilities.html_extract_input_values($str_alt86$cache_key, args));
			SubLObject op_keys = Mapping.mapcar(symbol_function(READ_FROM_STRING_IGNORING_ERRORS), html_utilities.html_extract_input_values($$$operation, args));
			SubLObject ops = Mapping.mapcar(symbol_function(LOOKUP_OPERATION), op_keys);
			if (NIL != remove_if(symbol_function($sym108$VALID_TM_OP_), ops, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
			    html_thesaurus.tm_error($str_alt109$Some_operation_was_not_found__hen, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
			} else {
			    really_do_operations(NIL, ops);
			    Mapping.mapc(symbol_function(DECACHE_OPERATION), cache_keys, EMPTY_SUBL_OBJECT_ARRAY);
			}
		    }
		} finally {
		    mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
		    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
		}
	    }
	    return NIL;
	}
    }

    public static final SubLObject really_do_operations(SubLObject bad, SubLObject ops) {
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    if ((NIL != ops) && (tm_datastructures.tm_op_opcode(ops.first()) == $EDIT)) {
		tm_edit(ops);
	    } else {
		{
		    SubLObject op_triples = perform_operations_guts(ops);
		    SubLObject violations = tm_integrity_check_ops(ops);
		    SubLObject color_value = tm_datastructures.$tm_bg_color_default$.getDynamicValue(thread);
		    html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
		    html_utilities.html_markup(html_macros.$html_head_head$.getGlobalValue());
		    html_macros.html_head_content_type();
		    html_utilities.html_source_readability_terpri(UNPROVIDED);
		    html_utilities.html_markup(html_macros.$html_title_head$.getGlobalValue());
		    html_utilities.html_princ($$$Operation_Results);
		    html_utilities.html_markup(html_macros.$html_title_tail$.getGlobalValue());
		    html_utilities.html_markup(html_macros.$html_head_tail$.getGlobalValue());
		    html_utilities.html_source_readability_terpri(UNPROVIDED);
		    {
			SubLObject _prev_bind_0 = html_macros.$html_inside_bodyP$.currentBinding(thread);
			try {
			    html_macros.$html_inside_bodyP$.bind(T, thread);
			    html_utilities.html_markup(html_macros.$html_body_head$.getGlobalValue());
			    if (NIL != color_value) {
				html_utilities.html_markup(html_macros.$html_body_bgcolor$.getGlobalValue());
				html_utilities.html_char(CHAR_quotation, UNPROVIDED);
				html_utilities.html_markup(html_utilities.html_color(color_value));
				html_utilities.html_char(CHAR_quotation, UNPROVIDED);
			    }
			    html_utilities.html_char(CHAR_greater, UNPROVIDED);
			    {
				SubLObject _prev_bind_0_21 = html_macros.$html_safe_print$.currentBinding(thread);
				try {
				    html_macros.$html_safe_print$.bind(T, thread);
				    html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
				    html_utilities.html_markup(ONE_INTEGER);
				    html_utilities.html_char(CHAR_greater, UNPROVIDED);
				    if ((NIL != tm_control_vars.$client_thes_home_page$.getDynamicValue(thread)) && (NIL != tm_control_vars.$client_mini_logo$.getDynamicValue(thread))) {
					html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
					html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
					html_utilities.html_char(CHAR_quotation, UNPROVIDED);
					html_utilities.html_markup(tm_control_vars.$client_thes_home_page$.getDynamicValue(thread));
					html_utilities.html_char(CHAR_quotation, UNPROVIDED);
					html_utilities.html_char(CHAR_greater, UNPROVIDED);
					{
					    SubLObject _prev_bind_0_22 = html_macros.$html_safe_print$.currentBinding(thread);
					    try {
						html_macros.$html_safe_print$.bind(T, thread);
						html_utilities.html_markup(html_macros.$html_image_head$.getGlobalValue());
						html_utilities.html_markup(html_macros.$html_image_src$.getGlobalValue());
						html_utilities.html_char(CHAR_quotation, UNPROVIDED);
						html_utilities.html_markup(tm_control_vars.$client_mini_logo$.getDynamicValue(thread));
						html_utilities.html_char(CHAR_quotation, UNPROVIDED);
						if (NIL != tm_control_vars.$client_name$.getDynamicValue(thread)) {
						    html_utilities.html_markup(html_macros.$html_image_alt$.getGlobalValue());
						    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
						    html_utilities.html_markup(tm_control_vars.$client_name$.getDynamicValue(thread));
						    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
						}
						if (true) {
						    html_utilities.html_markup(html_macros.$html_image_border$.getGlobalValue());
						    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
						    html_utilities.html_markup(ZERO_INTEGER);
						    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
						}
						html_utilities.html_char(CHAR_greater, UNPROVIDED);
						{
						    SubLObject _prev_bind_0_23 = html_macros.$html_safe_print$.currentBinding(thread);
						    try {
							html_macros.$html_safe_print$.bind(T, thread);
						    } finally {
							html_macros.$html_safe_print$.rebind(_prev_bind_0_23, thread);
						    }
						}
						html_utilities.html_markup(html_macros.$html_image_tail$.getGlobalValue());
					    } finally {
						html_macros.$html_safe_print$.rebind(_prev_bind_0_22, thread);
					    }
					}
					html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
				    }
				    html_utilities.html_princ($$$Operation_Results);
				    html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
				    html_utilities.html_markup(ONE_INTEGER);
				    html_utilities.html_char(CHAR_greater, UNPROVIDED);
				    tm_logging.tm_enqueue_event($$$Operation_Results);
				    html_thesaurus.thesaurus_heading($str_alt113$really_do_operations);
				    html_show_bad_ops(bad);
				    print_operations_results(op_triples);
				    tm_fix_or_print_violation_choices(violations);
				    if (NIL == ops) {
					html_utilities.html_princ($str_alt101$No_operations_were_performed_);
				    }
				    html_thesaurus.tm_footer();
				    html_utilities.html_source_readability_terpri(UNPROVIDED);
				} finally {
				    html_macros.$html_safe_print$.rebind(_prev_bind_0_21, thread);
				}
			    }
			    html_utilities.html_markup(html_macros.$html_body_tail$.getGlobalValue());
			    html_utilities.html_source_readability_terpri(UNPROVIDED);
			} finally {
			    html_macros.$html_inside_bodyP$.rebind(_prev_bind_0, thread);
			}
		    }
		    html_utilities.html_markup(html_macros.$html_html_tail$.getGlobalValue());
		    html_utilities.html_source_readability_terpri(UNPROVIDED);
		}
	    }
	    return NIL;
	}
    }

    public static final SubLObject do_good_ops_results(SubLObject bad, SubLObject good, SubLObject result_function, SubLObject args, SubLObject operation_string, SubLObject integrity_checkP) {
	if (integrity_checkP == UNPROVIDED) {
	    integrity_checkP = NIL;
	}
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    {
		SubLObject op_triples = perform_operations_guts(good);
		SubLObject violations = (NIL != integrity_checkP) ? ((SubLObject) (tm_integrity_check_ops(good))) : NIL;
		SubLObject color_value = tm_datastructures.$tm_bg_color_default$.getDynamicValue(thread);
		html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
		html_utilities.html_markup(html_macros.$html_head_head$.getGlobalValue());
		html_macros.html_head_content_type();
		html_utilities.html_source_readability_terpri(UNPROVIDED);
		html_utilities.html_markup(html_macros.$html_title_head$.getGlobalValue());
		html_utilities.html_princ(format(NIL, $str_alt114$_a_Results, operation_string));
		html_utilities.html_markup(html_macros.$html_title_tail$.getGlobalValue());
		html_utilities.html_markup(html_macros.$html_head_tail$.getGlobalValue());
		html_utilities.html_source_readability_terpri(UNPROVIDED);
		{
		    SubLObject _prev_bind_0 = html_macros.$html_inside_bodyP$.currentBinding(thread);
		    try {
			html_macros.$html_inside_bodyP$.bind(T, thread);
			html_utilities.html_markup(html_macros.$html_body_head$.getGlobalValue());
			if (NIL != color_value) {
			    html_utilities.html_markup(html_macros.$html_body_bgcolor$.getGlobalValue());
			    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
			    html_utilities.html_markup(html_utilities.html_color(color_value));
			    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
			}
			html_utilities.html_char(CHAR_greater, UNPROVIDED);
			{
			    SubLObject _prev_bind_0_24 = html_macros.$html_safe_print$.currentBinding(thread);
			    try {
				html_macros.$html_safe_print$.bind(T, thread);
				html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
				html_utilities.html_markup(ONE_INTEGER);
				html_utilities.html_char(CHAR_greater, UNPROVIDED);
				if ((NIL != tm_control_vars.$client_thes_home_page$.getDynamicValue(thread)) && (NIL != tm_control_vars.$client_mini_logo$.getDynamicValue(thread))) {
				    html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
				    html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
				    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
				    html_utilities.html_markup(tm_control_vars.$client_thes_home_page$.getDynamicValue(thread));
				    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
				    html_utilities.html_char(CHAR_greater, UNPROVIDED);
				    {
					SubLObject _prev_bind_0_25 = html_macros.$html_safe_print$.currentBinding(thread);
					try {
					    html_macros.$html_safe_print$.bind(T, thread);
					    html_utilities.html_markup(html_macros.$html_image_head$.getGlobalValue());
					    html_utilities.html_markup(html_macros.$html_image_src$.getGlobalValue());
					    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
					    html_utilities.html_markup(tm_control_vars.$client_mini_logo$.getDynamicValue(thread));
					    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
					    if (NIL != tm_control_vars.$client_name$.getDynamicValue(thread)) {
						html_utilities.html_markup(html_macros.$html_image_alt$.getGlobalValue());
						html_utilities.html_char(CHAR_quotation, UNPROVIDED);
						html_utilities.html_markup(tm_control_vars.$client_name$.getDynamicValue(thread));
						html_utilities.html_char(CHAR_quotation, UNPROVIDED);
					    }
					    if (true) {
						html_utilities.html_markup(html_macros.$html_image_border$.getGlobalValue());
						html_utilities.html_char(CHAR_quotation, UNPROVIDED);
						html_utilities.html_markup(ZERO_INTEGER);
						html_utilities.html_char(CHAR_quotation, UNPROVIDED);
					    }
					    html_utilities.html_char(CHAR_greater, UNPROVIDED);
					    {
						SubLObject _prev_bind_0_26 = html_macros.$html_safe_print$.currentBinding(thread);
						try {
						    html_macros.$html_safe_print$.bind(T, thread);
						} finally {
						    html_macros.$html_safe_print$.rebind(_prev_bind_0_26, thread);
						}
					    }
					    html_utilities.html_markup(html_macros.$html_image_tail$.getGlobalValue());
					} finally {
					    html_macros.$html_safe_print$.rebind(_prev_bind_0_25, thread);
					}
				    }
				    html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
				}
				html_utilities.html_princ(format(NIL, $str_alt114$_a_Results, operation_string));
				html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
				html_utilities.html_markup(ONE_INTEGER);
				html_utilities.html_char(CHAR_greater, UNPROVIDED);
				tm_logging.tm_enqueue_event(format(NIL, $str_alt114$_a_Results, operation_string));
				html_thesaurus.thesaurus_heading($str_alt115$do_good_ops_results);
				html_show_bad_ops(bad);
				if ((NIL != good) && (NIL != op_triples)) {
				    print_operations_results(op_triples);
				    if (NIL != integrity_checkP) {
					tm_fix_or_print_violation_choices(violations);
				    }
				    if (NIL != result_function) {
					apply(result_function, args);
				    }
				} else {
				    html_utilities.html_markup(html_macros.$html_paragraph_head$.getGlobalValue());
				    html_utilities.html_princ($str_alt101$No_operations_were_performed_);
				    html_utilities.html_markup(html_macros.$html_paragraph_tail$.getGlobalValue());
				}
				html_thesaurus.tm_footer();
				html_utilities.html_source_readability_terpri(UNPROVIDED);
			    } finally {
				html_macros.$html_safe_print$.rebind(_prev_bind_0_24, thread);
			    }
			}
			html_utilities.html_markup(html_macros.$html_body_tail$.getGlobalValue());
			html_utilities.html_source_readability_terpri(UNPROVIDED);
		    } finally {
			html_macros.$html_inside_bodyP$.rebind(_prev_bind_0, thread);
		    }
		}
		html_utilities.html_markup(html_macros.$html_html_tail$.getGlobalValue());
		html_utilities.html_source_readability_terpri(UNPROVIDED);
	    }
	    return NIL;
	}
    }

    public static final SubLObject do_good_edit_relation_ops_results(SubLObject bad, SubLObject good, SubLObject result_function, SubLObject args, SubLObject operation_string, SubLObject integrity_checkP) {
	if (integrity_checkP == UNPROVIDED) {
	    integrity_checkP = NIL;
	}
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    {
		SubLObject op_triples = perform_operations_guts(good);
		SubLObject color_value = tm_datastructures.$tm_bg_color_default$.getDynamicValue(thread);
		html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
		html_utilities.html_markup(html_macros.$html_head_head$.getGlobalValue());
		html_macros.html_head_content_type();
		html_utilities.html_source_readability_terpri(UNPROVIDED);
		html_utilities.html_markup(html_macros.$html_title_head$.getGlobalValue());
		html_utilities.html_princ(format(NIL, $str_alt114$_a_Results, operation_string));
		html_utilities.html_markup(html_macros.$html_title_tail$.getGlobalValue());
		html_utilities.html_markup(html_macros.$html_head_tail$.getGlobalValue());
		html_utilities.html_source_readability_terpri(UNPROVIDED);
		{
		    SubLObject _prev_bind_0 = html_macros.$html_inside_bodyP$.currentBinding(thread);
		    try {
			html_macros.$html_inside_bodyP$.bind(T, thread);
			html_utilities.html_markup(html_macros.$html_body_head$.getGlobalValue());
			if (NIL != color_value) {
			    html_utilities.html_markup(html_macros.$html_body_bgcolor$.getGlobalValue());
			    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
			    html_utilities.html_markup(html_utilities.html_color(color_value));
			    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
			}
			html_utilities.html_char(CHAR_greater, UNPROVIDED);
			{
			    SubLObject _prev_bind_0_27 = html_macros.$html_safe_print$.currentBinding(thread);
			    try {
				html_macros.$html_safe_print$.bind(T, thread);
				html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
				html_utilities.html_markup(ONE_INTEGER);
				html_utilities.html_char(CHAR_greater, UNPROVIDED);
				if ((NIL != tm_control_vars.$client_thes_home_page$.getDynamicValue(thread)) && (NIL != tm_control_vars.$client_mini_logo$.getDynamicValue(thread))) {
				    html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
				    html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
				    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
				    html_utilities.html_markup(tm_control_vars.$client_thes_home_page$.getDynamicValue(thread));
				    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
				    html_utilities.html_char(CHAR_greater, UNPROVIDED);
				    {
					SubLObject _prev_bind_0_28 = html_macros.$html_safe_print$.currentBinding(thread);
					try {
					    html_macros.$html_safe_print$.bind(T, thread);
					    html_utilities.html_markup(html_macros.$html_image_head$.getGlobalValue());
					    html_utilities.html_markup(html_macros.$html_image_src$.getGlobalValue());
					    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
					    html_utilities.html_markup(tm_control_vars.$client_mini_logo$.getDynamicValue(thread));
					    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
					    if (NIL != tm_control_vars.$client_name$.getDynamicValue(thread)) {
						html_utilities.html_markup(html_macros.$html_image_alt$.getGlobalValue());
						html_utilities.html_char(CHAR_quotation, UNPROVIDED);
						html_utilities.html_markup(tm_control_vars.$client_name$.getDynamicValue(thread));
						html_utilities.html_char(CHAR_quotation, UNPROVIDED);
					    }
					    if (true) {
						html_utilities.html_markup(html_macros.$html_image_border$.getGlobalValue());
						html_utilities.html_char(CHAR_quotation, UNPROVIDED);
						html_utilities.html_markup(ZERO_INTEGER);
						html_utilities.html_char(CHAR_quotation, UNPROVIDED);
					    }
					    html_utilities.html_char(CHAR_greater, UNPROVIDED);
					    {
						SubLObject _prev_bind_0_29 = html_macros.$html_safe_print$.currentBinding(thread);
						try {
						    html_macros.$html_safe_print$.bind(T, thread);
						} finally {
						    html_macros.$html_safe_print$.rebind(_prev_bind_0_29, thread);
						}
					    }
					    html_utilities.html_markup(html_macros.$html_image_tail$.getGlobalValue());
					} finally {
					    html_macros.$html_safe_print$.rebind(_prev_bind_0_28, thread);
					}
				    }
				    html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
				}
				html_utilities.html_princ(format(NIL, $str_alt114$_a_Results, operation_string));
				html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
				html_utilities.html_markup(ONE_INTEGER);
				html_utilities.html_char(CHAR_greater, UNPROVIDED);
				tm_logging.tm_enqueue_event(format(NIL, $str_alt114$_a_Results, operation_string));
				html_thesaurus.thesaurus_heading($str_alt115$do_good_ops_results);
				html_show_bad_ops(bad);
				if ((NIL != good) && (NIL != op_triples)) {
				    print_operations_results(op_triples);
				    tm_internals.tm_update_all_cached_filters();
				    if (NIL != result_function) {
					apply(result_function, args);
				    }
				} else {
				    html_utilities.html_markup(html_macros.$html_paragraph_head$.getGlobalValue());
				    html_utilities.html_princ($str_alt101$No_operations_were_performed_);
				    html_utilities.html_markup(html_macros.$html_paragraph_tail$.getGlobalValue());
				}
				html_thesaurus.tm_footer();
				html_utilities.html_source_readability_terpri(UNPROVIDED);
			    } finally {
				html_macros.$html_safe_print$.rebind(_prev_bind_0_27, thread);
			    }
			}
			html_utilities.html_markup(html_macros.$html_body_tail$.getGlobalValue());
			html_utilities.html_source_readability_terpri(UNPROVIDED);
		    } finally {
			html_macros.$html_inside_bodyP$.rebind(_prev_bind_0, thread);
		    }
		}
		html_utilities.html_markup(html_macros.$html_html_tail$.getGlobalValue());
		html_utilities.html_source_readability_terpri(UNPROVIDED);
	    }
	    return NIL;
	}
    }

    /**
     * Gathers and returns list of assertions relevant to OPS, i.e., assertions which
     * should be checked for integrity after OPS are done.
     */
    public static final SubLObject relevant_assertions_of_ops(SubLObject ops) {
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    {
		SubLObject assertions = NIL;
		SubLObject cdolist_list_var = ops;
		SubLObject op = NIL;
		for (op = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), op = cdolist_list_var.first()) {
		    {
			SubLObject thesaurus = tm_datastructures.tm_op_thesaurus(op);
			SubLObject predicate = tm_datastructures.tm_op_relation(op);
			SubLObject arg1 = tm_datastructures.tm_op_args(op).first();
			SubLObject arg2 = second(tm_datastructures.tm_op_args(op));
			SubLObject arg3 = third(tm_datastructures.tm_op_args(op));
			{
			    SubLObject cdolist_list_var_30 = tm_datastructures.tm_op_args(op);
			    SubLObject arg = NIL;
			    for (arg = cdolist_list_var_30.first(); NIL != cdolist_list_var_30; cdolist_list_var_30 = cdolist_list_var_30.rest(), arg = cdolist_list_var_30.first()) {
				if (NIL != forts.valid_fortP(arg)) {
				    assertions = nconc(tm_datastructures.signs_from_concept(arg, $$preferredTerm, thesaurus), assertions);
				} else if (NIL != tm_datastructures.signp(arg)) {
				    if (tm_datastructures.sign_relation(arg) == $$preferredTerm) {
					assertions = nconc(list(arg), assertions);
				    } else {
					assertions = nconc(tm_datastructures.signs_from_concept(tm_datastructures.sign_concept(arg), $$preferredTerm, thesaurus), assertions);
				    }
				}

			    }
			}
			{
			    SubLObject pcase_var = tm_datastructures.tm_op_opcode(op);
			    if ((pcase_var.eql($ADD) || pcase_var.eql($DELETE)) || pcase_var.eql($REPLACE)) {
				if (NIL != forts.valid_fortP(predicate)) {
				    {
					SubLObject index1 = (NIL != tm_datastructures.tm_op_inverseP(op)) ? ((SubLObject) (TWO_INTEGER)) : ONE_INTEGER;
					SubLObject index2 = (NIL != tm_datastructures.tm_op_inverseP(op)) ? ((SubLObject) (ONE_INTEGER)) : TWO_INTEGER;
					if (NIL != forts.valid_fortP(arg1)) {
					    assertions = nconc(kb_mapping.gather_gaf_arg_index(arg1, index1, predicate, thesaurus, UNPROVIDED), assertions);
					    if (NIL != kb_accessors.symmetric_predicateP(predicate)) {
						assertions = nconc(kb_mapping.gather_gaf_arg_index(arg1, index2, predicate, thesaurus, UNPROVIDED), assertions);
					    }
					} else if (NIL != tm_datastructures.signp(arg1)) {
					    assertions = nconc(kb_mapping.gather_gaf_arg_index(tm_datastructures.sign_concept(arg1), index1, predicate, thesaurus, UNPROVIDED), assertions);
					    if (NIL != kb_accessors.symmetric_predicateP(predicate)) {
						assertions = nconc(kb_mapping.gather_gaf_arg_index(tm_datastructures.sign_concept(arg1), index2, predicate, thesaurus, UNPROVIDED), assertions);
					    }
					}

					if ((NIL != forts.valid_fortP(arg2)) && (predicate != $$topInThesaurus)) {
					    assertions = nconc(kb_mapping.gather_gaf_arg_index(arg2, index2, predicate, thesaurus, UNPROVIDED), assertions);
					    if (NIL != kb_accessors.symmetric_predicateP(predicate)) {
						assertions = nconc(kb_mapping.gather_gaf_arg_index(arg2, index1, predicate, thesaurus, UNPROVIDED), assertions);
					    }
					} else if (NIL != tm_datastructures.signp(arg2)) {
					    assertions = nconc(kb_mapping.gather_gaf_arg_index(tm_datastructures.sign_concept(arg2), index2, predicate, thesaurus, UNPROVIDED), assertions);
					    if (NIL != kb_accessors.symmetric_predicateP(predicate)) {
						assertions = nconc(kb_mapping.gather_gaf_arg_index(tm_datastructures.sign_concept(arg2), index1, predicate, thesaurus, UNPROVIDED), assertions);
					    }
					}

					if (NIL != forts.valid_fortP(arg3)) {
					    assertions = nconc(kb_mapping.gather_gaf_arg_index(arg3, index2, predicate, thesaurus, UNPROVIDED), assertions);
					    if (NIL != kb_accessors.symmetric_predicateP(predicate)) {
						assertions = nconc(kb_mapping.gather_gaf_arg_index(arg3, index1, predicate, thesaurus, UNPROVIDED), assertions);
					    }
					} else if (NIL != tm_datastructures.signp(arg3)) {
					    assertions = nconc(kb_mapping.gather_gaf_arg_index(tm_datastructures.sign_concept(arg3), index2, predicate, thesaurus, UNPROVIDED), assertions);
					    if (NIL != kb_accessors.symmetric_predicateP(predicate)) {
						assertions = nconc(kb_mapping.gather_gaf_arg_index(tm_datastructures.sign_concept(arg3), index1, predicate, thesaurus, UNPROVIDED), assertions);
					    }
					}

				    }
				}
			    } else if (pcase_var.eql($CREATE)) {
				{
				    SubLObject datum = tm_datastructures.tm_op_args(op);
				    SubLObject current = datum;
				    SubLObject v_term = NIL;
				    destructuring_bind_must_consp(current, datum, $list_alt117);
				    v_term = current.first();
				    current = current.rest();
				    destructuring_bind_must_consp(current, datum, $list_alt117);
				    {
					SubLObject temp = current.rest();
					current = current.first();
					{
					    SubLObject concept = NIL;
					    destructuring_bind_must_consp(current, datum, $list_alt117);
					    concept = current.first();
					    current = current.rest();
					    if (NIL == current) {
						current = temp;
						{
						    SubLObject broader_terms = NIL;
						    destructuring_bind_must_consp(current, datum, $list_alt117);
						    broader_terms = current.first();
						    current = current.rest();
						    if (NIL == current) {
							if (NIL != forts.valid_fortP(concept)) {
							    assertions = nconc(tm_datastructures.signs_from_concept(concept, $$preferredTerm, thesaurus), assertions);
							    {
								SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
								SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
								try {
								    mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EQ, thread);
								    mt_relevance_macros.$mt$.bind(thesaurus, thread);
								    assertions = nconc(kb_mapping.gather_gaf_arg_index(concept, ONE_INTEGER, UNPROVIDED, UNPROVIDED, UNPROVIDED), assertions);
								    assertions = nconc(kb_mapping.gather_gaf_arg_index(concept, TWO_INTEGER, UNPROVIDED, UNPROVIDED, UNPROVIDED), assertions);
								} finally {
								    mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
								    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
								}
							    }
							}
							{
							    SubLObject cdolist_list_var_31 = broader_terms;
							    SubLObject broader = NIL;
							    for (broader = cdolist_list_var_31.first(); NIL != cdolist_list_var_31; cdolist_list_var_31 = cdolist_list_var_31.rest(), broader = cdolist_list_var_31.first()) {
								if (NIL != forts.valid_fortP(broader)) {
								    assertions = nconc(tm_datastructures.signs_from_concept(broader, $$preferredTerm, thesaurus), assertions);
								} else if (NIL != tm_datastructures.signp(broader)) {
								    assertions = nconc(tm_datastructures.signs_from_concept(tm_datastructures.sign_concept(broader), $$preferredTerm, thesaurus), assertions);
								}

							    }
							}
						    } else {
							cdestructuring_bind_error(datum, $list_alt117);
						    }
						}
					    } else {
						cdestructuring_bind_error(datum, $list_alt117);
					    }
					}
				    }
				}
			    } else if (pcase_var.eql($SWAP)) {
				assertions = nconc(kb_mapping.gather_gaf_arg_index(arg1, ONE_INTEGER, $$useFor, thesaurus, UNPROVIDED), assertions);
			    } else if (pcase_var.eql($CONVERT_NT_UF)) {
				assertions = nconc(kb_mapping.gather_gaf_arg_index(arg1, ONE_INTEGER, $$useFor, thesaurus, UNPROVIDED), assertions);
				assertions = nconc(kb_mapping.gather_gaf_arg_index(arg1, TWO_INTEGER, $$broaderTerm, thesaurus, UNPROVIDED), assertions);
			    }

			}
		    }
		}
		return remove_duplicates(assertions, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
	    }
	}
    }

    /**
     * Perform integrity checking of the assertions relevant to OPS, and return a
     * list of violations.
     */
    public static final SubLObject tm_integrity_check_ops(SubLObject ops) {
	{
	    SubLObject assertions = relevant_assertions_of_ops(ops);
	    SubLObject violations = NIL;
	    SubLObject cdolist_list_var = assertions;
	    SubLObject assertion = NIL;
	    for (assertion = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), assertion = cdolist_list_var.first()) {
		violations = nconc(violations, tm_integrity.tm_diagnose_one_thesaurus_object(assertion));
	    }
	    violations = remove_duplicates(violations, symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED);
	    return violations;
	}
    }

    public static final SubLObject print_operations_violations(SubLObject violations) {
	if (NIL == violations) {
	    html_utilities.html_princ($str_alt121$No_integrity_violations_were_enco);
	} else {
	    html_utilities.html_princ($str_alt122$These_integrity_violations_involv);
	    html_utilities.html_br();
	    {
		SubLObject cdolist_list_var = violations;
		SubLObject violation = NIL;
		for (violation = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), violation = cdolist_list_var.first()) {
		    {
			SubLObject message = tm_integrity.tm_integrity_violation_message(violation);
			if (NIL != message) {
			    html_utilities.html_princ(message);
			} else {
			    html_utilities.html_princ($str_alt123$_Trouble_printing_message_);
			}
		    }
		    html_utilities.html_br();
		}
	    }
	}
	return NIL;
    }

    /**
     * Notifies the user of no violations if there are none, and otherwise prints info about each, fixes automatically if possible, and lets the user choose among possible fixes if necessary.
     */
    public static final SubLObject tm_fix_or_print_violation_choices(SubLObject violations) {
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    if (NIL == violations) {
		html_utilities.html_princ($str_alt121$No_integrity_violations_were_enco);
	    } else {
		html_utilities.html_markup(html_macros.$html_form_head$.getGlobalValue());
		html_utilities.html_markup(html_macros.$html_form_action$.getGlobalValue());
		html_utilities.html_char(CHAR_quotation, UNPROVIDED);
		html_utilities.html_markup(system_parameters.$cyc_cgi_program$.getDynamicValue(thread));
		html_utilities.html_char(CHAR_quotation, UNPROVIDED);
		if (NIL != html_macros.$html_form_method_post$.getGlobalValue()) {
		    html_utilities.html_markup(html_macros.$html_form_method$.getGlobalValue());
		    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
		    html_utilities.html_markup(html_macros.$html_form_method_post$.getGlobalValue());
		    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
		}
		html_utilities.html_char(CHAR_greater, UNPROVIDED);
		{
		    SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
		    SubLObject _prev_bind_1 = html_macros.$within_html_form$.currentBinding(thread);
		    SubLObject _prev_bind_2 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
		    try {
			html_macros.$html_safe_print$.bind(T, thread);
			html_macros.$within_html_form$.bind(T, thread);
			html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
			html_utilities.html_hidden_input($str_alt124$tm_handle_user_fixes, T, UNPROVIDED);
			{
			    SubLObject choices_to_makeP = NIL;
			    html_utilities.html_princ($str_alt122$These_integrity_violations_involv);
			    html_utilities.html_br();
			    choices_to_makeP = tm_list_of_violation_choices(violations);
			    if (NIL != choices_to_makeP) {
				html_utilities.html_br();
				html_utilities.html_submit_input($$$Perform_Selected_Fixes, UNPROVIDED, UNPROVIDED);
				html_utilities.html_reset_input(UNPROVIDED);
			    }
			}
			html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
		    } finally {
			html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_2, thread);
			html_macros.$within_html_form$.rebind(_prev_bind_1, thread);
			html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
		    }
		}
		html_utilities.html_markup(html_macros.$html_form_tail$.getGlobalValue());
	    }
	    return NIL;
	}
    }

    /**
     * Prints bulleted list of violations & fix choices.  Returns T IFF there are choices to make.
     */
    public static final SubLObject tm_list_of_violation_choices(SubLObject violations) {
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    {
		SubLObject violation_number = ZERO_INTEGER;
		SubLObject choices_to_makeP = NIL;
		html_utilities.html_hidden_input($str_alt126$number_of_violations, length(violations), UNPROVIDED);
		html_utilities.html_markup(html_macros.$html_unordered_list_head$.getGlobalValue());
		html_utilities.html_char(CHAR_greater, UNPROVIDED);
		{
		    SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
		    try {
			html_macros.$html_safe_print$.bind(T, thread);
			{
			    SubLObject cdolist_list_var = violations;
			    SubLObject violation = NIL;
			    for (violation = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), violation = cdolist_list_var.first()) {
				violation_number = add(violation_number, ONE_INTEGER);
				html_utilities.html_markup(html_macros.$html_list_item_head$.getGlobalValue());
				html_utilities.html_char(CHAR_greater, UNPROVIDED);
				{
				    SubLObject _prev_bind_0_32 = html_macros.$html_safe_print$.currentBinding(thread);
				    try {
					html_macros.$html_safe_print$.bind(T, thread);
					if (NIL != tm_fix_or_print_one_violation(violation, violation_number)) {
					    choices_to_makeP = T;
					}
				    } finally {
					html_macros.$html_safe_print$.rebind(_prev_bind_0_32, thread);
				    }
				}
				html_utilities.html_markup(html_macros.$html_list_item_tail$.getGlobalValue());
			    }
			}
		    } finally {
			html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
		    }
		}
		html_utilities.html_markup(html_macros.$html_unordered_list_tail$.getGlobalValue());
		return choices_to_makeP;
	    }
	}
    }

    /**
     * Prints a message describing VIOLATION and either fixes it automatically, returning NIL, or prints a set of choices that the user can pick from to accomplish a fix, returning T. VIOLATION-NUMBER is used as an id in html forms.
     */
    public static final SubLObject tm_fix_or_print_one_violation(SubLObject violation, SubLObject violation_number) {
	if (NIL != tm_integrity.tm_violation_still_thereP(violation)) {
	    {
		SubLObject message = tm_integrity.tm_integrity_violation_message(violation);
		if (NIL != message) {
		    html_utilities.html_princ(message);
		} else {
		    html_utilities.html_princ($str_alt123$_Trouble_printing_message_);
		}
		html_utilities.html_br();
		{
		    SubLObject module = tm_integrity.tm_violation_module(violation);
		    SubLObject data = tm_integrity.tm_violation_data(violation);
		    SubLObject fixer = tm_integrity.tm_integrity_module_fixer(module);
		    SubLObject user_fixer = tm_integrity.tm_integrity_module_user_fixer(module);
		    SubLObject fixes = NIL;
		    if (NIL != fixer) {
			tm_integrity.tm_remove_violation_from_unique_hash(violation);
			{
			    SubLObject fixed_how = funcall(fixer, data);
			    if (NIL != fixed_how) {
				html_utilities.html_princ($str_alt127$Automatic_fix____);
				html_utilities.html_princ(fixed_how);
				tm_integrity.tm_remove_violation_from_unique_hash(violation);
				return NIL;
			    }
			    html_utilities.html_princ($str_alt128$Automatic_fix_failed_);
			    tm_integrity.tm_record_violation(violation, tm_integrity.tm_violation_index(violation));
			    return NIL;
			}
		    }
		    if (NIL != user_fixer) {
			fixes = funcall(user_fixer, data);
			html_utilities.html_princ($str_alt129$Choose_one_of_these_fixes_);
			html_utilities.html_br();
			if (fixes.isCons()) {
			    {
				SubLObject choice_to_makeP = NIL;
				SubLObject cdolist_list_var = fixes;
				SubLObject fix = NIL;
				for (fix = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), fix = cdolist_list_var.first()) {
				    if (NIL != tm_integrity.tm_fix_still_relevantP(fix)) {
					tm_show_fix_choices(fix, violation_number, UNPROVIDED);
					choice_to_makeP = T;
					html_utilities.html_br();
				    }
				}
				return choice_to_makeP;
			    }
			} else if (NIL != tm_integrity.tmi_fix_p(fixes)) {
			    if (NIL != tm_integrity.tm_fix_still_relevantP(fixes)) {
				tm_show_fix_choices(fixes, violation_number, T);
				return T;
			    }
			} else {
			    html_utilities.html_princ($str_alt130$No_possible_fixes_generated__fix_);
			    return NIL;
			}

		    }
		}
	    }
	}
	html_utilities.html_princ($str_alt131$This_violation_is_no_longer_prese);
	return NIL;
    }

    public static final SubLObject tm_show_remove_all_fix(SubLObject fix, SubLObject violation_number, SubLObject singleP) {
	if (singleP == UNPROVIDED) {
	    singleP = NIL;
	}
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    {
		SubLObject id = tm_integrity.tmi_fix_id(fix);
		SubLObject data = tm_integrity.tmi_fix_data(fix);
		html_utilities.html_radio_input(format(NIL, $str_alt132$fix_id__A, violation_number), id, singleP);
		html_utilities.html_princ($str_alt133$Delete_all_of_the_following_);
		html_utilities.html_markup(html_macros.$html_unordered_list_head$.getGlobalValue());
		html_utilities.html_simple_attribute(html_macros.$html_list_plain$.getGlobalValue());
		html_utilities.html_char(CHAR_greater, UNPROVIDED);
		{
		    SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
		    try {
			html_macros.$html_safe_print$.bind(T, thread);
			{
			    SubLObject cdolist_list_var = data;
			    SubLObject assertion = NIL;
			    for (assertion = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), assertion = cdolist_list_var.first()) {
				html_utilities.html_markup(html_macros.$html_list_item_head$.getGlobalValue());
				html_utilities.html_char(CHAR_greater, UNPROVIDED);
				{
				    SubLObject _prev_bind_0_33 = html_macros.$html_safe_print$.currentBinding(thread);
				    try {
					html_macros.$html_safe_print$.bind(T, thread);
					html_print_thesaurus_assertion(assertion);
				    } finally {
					html_macros.$html_safe_print$.rebind(_prev_bind_0_33, thread);
				    }
				}
				html_utilities.html_markup(html_macros.$html_list_item_tail$.getGlobalValue());
			    }
			}
		    } finally {
			html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
		    }
		}
		html_utilities.html_markup(html_macros.$html_unordered_list_tail$.getGlobalValue());
	    }
	    return NIL;
	}
    }

    public static final SubLObject tm_show_remove_one_fix(SubLObject fix, SubLObject violation_number, SubLObject singleP) {
	if (singleP == UNPROVIDED) {
	    singleP = NIL;
	}
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    {
		SubLObject id = tm_integrity.tmi_fix_id(fix);
		SubLObject data = tm_integrity.tmi_fix_data(fix);
		SubLObject tag = format(NIL, $str_alt134$info__A, id);
		html_utilities.html_radio_input(format(NIL, $str_alt132$fix_id__A, violation_number), id, singleP);
		html_utilities.html_princ($str_alt135$Choose_one_of_the_following_to_);
		html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
		html_utilities.html_princ($str_alt136$delete_);
		html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
		html_utilities.html_markup(html_macros.$html_unordered_list_head$.getGlobalValue());
		html_utilities.html_simple_attribute(html_macros.$html_list_plain$.getGlobalValue());
		html_utilities.html_char(CHAR_greater, UNPROVIDED);
		{
		    SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
		    try {
			html_macros.$html_safe_print$.bind(T, thread);
			{
			    SubLObject cdolist_list_var = data;
			    SubLObject assertion = NIL;
			    for (assertion = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), assertion = cdolist_list_var.first()) {
				html_utilities.html_markup(html_macros.$html_list_item_head$.getGlobalValue());
				html_utilities.html_char(CHAR_greater, UNPROVIDED);
				{
				    SubLObject _prev_bind_0_34 = html_macros.$html_safe_print$.currentBinding(thread);
				    try {
					html_macros.$html_safe_print$.bind(T, thread);
					html_utilities.html_radio_input(tag, assertion_handles.assertion_id(assertion), UNPROVIDED);
					html_utilities.html_princ($str_alt137$Delete__);
					html_print_thesaurus_assertion(assertion);
				    } finally {
					html_macros.$html_safe_print$.rebind(_prev_bind_0_34, thread);
				    }
				}
				html_utilities.html_markup(html_macros.$html_list_item_tail$.getGlobalValue());
			    }
			}
		    } finally {
			html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
		    }
		}
		html_utilities.html_markup(html_macros.$html_unordered_list_tail$.getGlobalValue());
	    }
	    return NIL;
	}
    }

    public static final SubLObject tm_show_retain_one_fix(SubLObject fix, SubLObject violation_number, SubLObject singleP) {
	if (singleP == UNPROVIDED) {
	    singleP = NIL;
	}
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    {
		SubLObject id = tm_integrity.tmi_fix_id(fix);
		SubLObject data = tm_integrity.tmi_fix_data(fix);
		SubLObject tag = format(NIL, $str_alt134$info__A, id);
		html_utilities.html_radio_input(format(NIL, $str_alt132$fix_id__A, violation_number), id, singleP);
		html_utilities.html_princ($str_alt135$Choose_one_of_the_following_to_);
		html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
		html_utilities.html_princ($str_alt138$retain_);
		html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
		html_utilities.html_markup(html_macros.$html_unordered_list_head$.getGlobalValue());
		html_utilities.html_simple_attribute(html_macros.$html_list_plain$.getGlobalValue());
		html_utilities.html_char(CHAR_greater, UNPROVIDED);
		{
		    SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
		    try {
			html_macros.$html_safe_print$.bind(T, thread);
			{
			    SubLObject cdolist_list_var = data;
			    SubLObject assertion = NIL;
			    for (assertion = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), assertion = cdolist_list_var.first()) {
				html_utilities.html_markup(html_macros.$html_list_item_head$.getGlobalValue());
				html_utilities.html_char(CHAR_greater, UNPROVIDED);
				{
				    SubLObject _prev_bind_0_35 = html_macros.$html_safe_print$.currentBinding(thread);
				    try {
					html_macros.$html_safe_print$.bind(T, thread);
					html_utilities.html_radio_input(tag, assertion_handles.assertion_id(assertion), UNPROVIDED);
					html_utilities.html_princ($str_alt139$Keep__);
					html_print_thesaurus_assertion(assertion);
				    } finally {
					html_macros.$html_safe_print$.rebind(_prev_bind_0_35, thread);
				    }
				}
				html_utilities.html_markup(html_macros.$html_list_item_tail$.getGlobalValue());
			    }
			}
		    } finally {
			html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
		    }
		}
		html_utilities.html_markup(html_macros.$html_unordered_list_tail$.getGlobalValue());
	    }
	    return NIL;
	}
    }

    public static final SubLObject tm_show_merge_all_fix(SubLObject fix, SubLObject violation_number, SubLObject singleP) {
	if (singleP == UNPROVIDED) {
	    singleP = NIL;
	}
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    {
		SubLObject id = tm_integrity.tmi_fix_id(fix);
		SubLObject data = tm_integrity.tmi_fix_data(fix);
		html_utilities.html_radio_input(format(NIL, $str_alt132$fix_id__A, violation_number), id, singleP);
		html_utilities.html_princ($str_alt140$Merge_all_of_the_following_into_o);
		html_utilities.html_markup(html_macros.$html_unordered_list_head$.getGlobalValue());
		html_utilities.html_simple_attribute(html_macros.$html_list_plain$.getGlobalValue());
		html_utilities.html_char(CHAR_greater, UNPROVIDED);
		{
		    SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
		    try {
			html_macros.$html_safe_print$.bind(T, thread);
			{
			    SubLObject cdolist_list_var = data;
			    SubLObject sign = NIL;
			    for (sign = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), sign = cdolist_list_var.first()) {
				html_utilities.html_markup(html_macros.$html_list_item_head$.getGlobalValue());
				html_utilities.html_char(CHAR_greater, UNPROVIDED);
				{
				    SubLObject _prev_bind_0_36 = html_macros.$html_safe_print$.currentBinding(thread);
				    try {
					html_macros.$html_safe_print$.bind(T, thread);
					html_tm_browsing.tm_thesaurus_constant(tm_datastructures.sign_concept(sign), NIL, NIL, NIL, UNPROVIDED, UNPROVIDED, UNPROVIDED);
				    } finally {
					html_macros.$html_safe_print$.rebind(_prev_bind_0_36, thread);
				    }
				}
				html_utilities.html_markup(html_macros.$html_list_item_tail$.getGlobalValue());
			    }
			}
		    } finally {
			html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
		    }
		}
		html_utilities.html_markup(html_macros.$html_unordered_list_tail$.getGlobalValue());
	    }
	    return NIL;
	}
    }

    public static final SubLObject tm_show_remove_fix(SubLObject fix, SubLObject violation_number, SubLObject singleP) {
	if (singleP == UNPROVIDED) {
	    singleP = NIL;
	}
	{
	    SubLObject id = tm_integrity.tmi_fix_id(fix);
	    SubLObject data = tm_integrity.tmi_fix_data(fix);
	    html_utilities.html_radio_input(format(NIL, $str_alt132$fix_id__A, violation_number), id, singleP);
	    html_utilities.html_princ($str_alt141$Delete_);
	    html_print_thesaurus_assertion(data);
	}
	return NIL;
    }

    public static final SubLObject tm_show_remove_stoplist_fix(SubLObject fix, SubLObject violation_number, SubLObject singleP) {
	if (singleP == UNPROVIDED) {
	    singleP = NIL;
	}
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    {
		SubLObject id = tm_integrity.tmi_fix_id(fix);
		SubLObject data = tm_integrity.tmi_fix_data(fix);
		html_utilities.html_radio_input(format(NIL, $str_alt132$fix_id__A, violation_number), id, singleP);
		format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt142$Delete__S_from_the_stoplist_, data);
	    }
	    return NIL;
	}
    }

    public static final SubLObject tm_show_rename_term_fix(SubLObject fix, SubLObject violation_number, SubLObject singleP) {
	if (singleP == UNPROVIDED) {
	    singleP = NIL;
	}
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    {
		SubLObject id = tm_integrity.tmi_fix_id(fix);
		SubLObject data = tm_integrity.tmi_fix_data(fix);
		SubLObject tag = format(NIL, $str_alt134$info__A, id);
		SubLObject thesaurus = tm_integrity.tmi_fix_mt(fix);
		html_utilities.html_radio_input(format(NIL, $str_alt132$fix_id__A, violation_number), id, singleP);
		format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt143$Rename___A__in__A_to_, tm_datastructures.concept_term(data, thesaurus), tm_internals.thesaurus_name(thesaurus));
		html_utilities.html_br();
		html_utilities.html_text_input(tag, tm_datastructures.concept_term(data, thesaurus), $int$40);
	    }
	    return NIL;
	}
    }

    public static final SubLObject tm_show_splice_out_term_fix(SubLObject fix, SubLObject violation_number, SubLObject singleP) {
	if (singleP == UNPROVIDED) {
	    singleP = NIL;
	}
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    {
		SubLObject id = tm_integrity.tmi_fix_id(fix);
		SubLObject data = tm_integrity.tmi_fix_data(fix);
		SubLObject thesaurus = tm_integrity.tmi_fix_mt(fix);
		html_utilities.html_radio_input(format(NIL, $str_alt132$fix_id__A, violation_number), id, singleP);
		format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt145$Delete_term___A___term_only__from, tm_datastructures.concept_term(data, thesaurus), tm_internals.thesaurus_name(thesaurus));
	    }
	    return NIL;
	}
    }

    public static final SubLObject tm_show_retain_one_term_fix(SubLObject fix, SubLObject violation_number, SubLObject singleP) {
	if (singleP == UNPROVIDED) {
	    singleP = NIL;
	}
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    {
		SubLObject id = tm_integrity.tmi_fix_id(fix);
		SubLObject data = tm_integrity.tmi_fix_data(fix);
		SubLObject tag = format(NIL, $str_alt134$info__A, id);
		html_utilities.html_radio_input(format(NIL, $str_alt132$fix_id__A, violation_number), id, singleP);
		html_utilities.html_princ($str_alt146$Choose_one_term_to_retain__and_);
		html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
		html_utilities.html_princ($$$delete);
		html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
		html_utilities.html_princ($str_alt148$_the_rest_);
		html_utilities.html_markup(html_macros.$html_unordered_list_head$.getGlobalValue());
		html_utilities.html_simple_attribute(html_macros.$html_list_plain$.getGlobalValue());
		html_utilities.html_char(CHAR_greater, UNPROVIDED);
		{
		    SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
		    try {
			html_macros.$html_safe_print$.bind(T, thread);
			{
			    SubLObject cdolist_list_var = data;
			    SubLObject sign = NIL;
			    for (sign = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), sign = cdolist_list_var.first()) {
				{
				    SubLObject v_term = tm_datastructures.sign_concept(sign);
				    SubLObject term_id = cb_utilities.cb_fort_identifier(v_term);
				    html_utilities.html_markup(html_macros.$html_list_item_head$.getGlobalValue());
				    html_utilities.html_char(CHAR_greater, UNPROVIDED);
				    {
					SubLObject _prev_bind_0_37 = html_macros.$html_safe_print$.currentBinding(thread);
					try {
					    html_macros.$html_safe_print$.bind(T, thread);
					    html_utilities.html_radio_input(tag, term_id, UNPROVIDED);
					    html_utilities.html_princ($str_alt139$Keep__);
					    html_tm_browsing.tm_thesaurus_constant(v_term, NIL, NIL, NIL, UNPROVIDED, UNPROVIDED, UNPROVIDED);
					} finally {
					    html_macros.$html_safe_print$.rebind(_prev_bind_0_37, thread);
					}
				    }
				    html_utilities.html_markup(html_macros.$html_list_item_tail$.getGlobalValue());
				}
			    }
			}
		    } finally {
			html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
		    }
		}
		html_utilities.html_markup(html_macros.$html_unordered_list_tail$.getGlobalValue());
	    }
	    return NIL;
	}
    }

    public static final SubLObject tm_show_delete_all_terms_fix(SubLObject fix, SubLObject violation_number, SubLObject singleP) {
	if (singleP == UNPROVIDED) {
	    singleP = NIL;
	}
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    {
		SubLObject id = tm_integrity.tmi_fix_id(fix);
		SubLObject data = tm_integrity.tmi_fix_data(fix);
		SubLObject thesaurus = tm_integrity.tmi_fix_mt(fix);
		html_utilities.html_radio_input(format(NIL, $str_alt132$fix_id__A, violation_number), id, singleP);
		format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt149$Delete_all_of_these_terms_from__A, tm_internals.thesaurus_name(thesaurus));
		html_utilities.html_markup(html_macros.$html_unordered_list_head$.getGlobalValue());
		html_utilities.html_simple_attribute(html_macros.$html_list_plain$.getGlobalValue());
		html_utilities.html_char(CHAR_greater, UNPROVIDED);
		{
		    SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
		    try {
			html_macros.$html_safe_print$.bind(T, thread);
			{
			    SubLObject cdolist_list_var = data;
			    SubLObject sign = NIL;
			    for (sign = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), sign = cdolist_list_var.first()) {
				{
				    SubLObject v_term = tm_datastructures.sign_concept(sign);
				    html_utilities.html_markup(html_macros.$html_list_item_head$.getGlobalValue());
				    html_utilities.html_char(CHAR_greater, UNPROVIDED);
				    {
					SubLObject _prev_bind_0_38 = html_macros.$html_safe_print$.currentBinding(thread);
					try {
					    html_macros.$html_safe_print$.bind(T, thread);
					    html_tm_browsing.tm_thesaurus_constant(v_term, NIL, NIL, NIL, UNPROVIDED, UNPROVIDED, UNPROVIDED);
					} finally {
					    html_macros.$html_safe_print$.rebind(_prev_bind_0_38, thread);
					}
				    }
				    html_utilities.html_markup(html_macros.$html_list_item_tail$.getGlobalValue());
				}
			    }
			}
		    } finally {
			html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
		    }
		}
		html_utilities.html_markup(html_macros.$html_unordered_list_tail$.getGlobalValue());
	    }
	    return NIL;
	}
    }

    public static final SubLObject tm_show_unrestrict_fix(SubLObject fix, SubLObject violation_number, SubLObject singleP) {
	if (singleP == UNPROVIDED) {
	    singleP = NIL;
	}
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    {
		SubLObject id = tm_integrity.tmi_fix_id(fix);
		SubLObject data = tm_integrity.tmi_fix_data(fix);
		SubLObject tag = format(NIL, $str_alt134$info__A, id);
		html_utilities.html_radio_input(format(NIL, $str_alt132$fix_id__A, violation_number), id, singleP);
		html_utilities.html_princ($str_alt150$Choose_one_of_the_following_to_pe);
		html_utilities.html_markup(html_macros.$html_unordered_list_head$.getGlobalValue());
		html_utilities.html_simple_attribute(html_macros.$html_list_plain$.getGlobalValue());
		html_utilities.html_char(CHAR_greater, UNPROVIDED);
		{
		    SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
		    try {
			html_macros.$html_safe_print$.bind(T, thread);
			{
			    SubLObject assertion1 = data.first();
			    SubLObject assertion2 = second(data);
			    SubLObject arg1 = assertions_high.gaf_arg1(assertion2);
			    SubLObject arg2 = assertions_high.gaf_arg2(assertion2);
			    html_utilities.html_markup(html_macros.$html_list_item_head$.getGlobalValue());
			    html_utilities.html_char(CHAR_greater, UNPROVIDED);
			    {
				SubLObject _prev_bind_0_39 = html_macros.$html_safe_print$.currentBinding(thread);
				try {
				    html_macros.$html_safe_print$.bind(T, thread);
				    html_utilities.html_radio_input(tag, assertion_handles.assertion_id(assertion1), UNPROVIDED);
				    html_utilities.html_princ($str_alt151$Remove__);
				    html_print_thesaurus_assertion(assertion1);
				} finally {
				    html_macros.$html_safe_print$.rebind(_prev_bind_0_39, thread);
				}
			    }
			    html_utilities.html_markup(html_macros.$html_list_item_tail$.getGlobalValue());
			    html_utilities.html_markup(html_macros.$html_list_item_head$.getGlobalValue());
			    html_utilities.html_char(CHAR_greater, UNPROVIDED);
			    {
				SubLObject _prev_bind_0_40 = html_macros.$html_safe_print$.currentBinding(thread);
				try {
				    html_macros.$html_safe_print$.bind(T, thread);
				    html_utilities.html_radio_input(tag, assertion_handles.assertion_id(assertion2), UNPROVIDED);
				    format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt152$Allow_relation__A_to_be_used_in_t, tm_internals.tm_pred_arg_symbol(arg1, ONE_INTEGER), tm_internals.thesaurus_name(arg2));
				} finally {
				    html_macros.$html_safe_print$.rebind(_prev_bind_0_40, thread);
				}
			    }
			    html_utilities.html_markup(html_macros.$html_list_item_tail$.getGlobalValue());
			}
		    } finally {
			html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
		    }
		}
		html_utilities.html_markup(html_macros.$html_unordered_list_tail$.getGlobalValue());
	    }
	    return NIL;
	}
    }

    /**
     * Show a FIX, with radio button and input form for any other required info.  The name of any additional html arg needed will be info-xxxx, where xxxx is the id of the fix. VIOLATION-NUMBER is used to uniqify the name of the radio button.  If FIX is the only one (SINGLE?), have it selected by default.
     */
    public static final SubLObject tm_show_fix_choices(SubLObject fix, SubLObject violation_number, SubLObject singleP) {
	if (singleP == UNPROVIDED) {
	    singleP = NIL;
	}
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    html_utilities.html_hidden_input($str_alt153$fix_id, tm_integrity.tmi_fix_id(fix), UNPROVIDED);
	    if (NIL != subl_promotions.memberP(tm_integrity.tmi_fix_op(fix), $list_alt154, UNPROVIDED, UNPROVIDED)) {
		html_utilities.html_radio_input(format(NIL, $str_alt132$fix_id__A, violation_number), NIL, NIL);
		html_utilities.html_princ($$$Ignore_this_violation_for_now);
		html_utilities.html_br();
	    }
	    {
		SubLObject pcase_var = tm_integrity.tmi_fix_op(fix);
		if (pcase_var.eql($UNRESTRICT)) {
		    tm_show_unrestrict_fix(fix, violation_number, singleP);
		} else if (pcase_var.eql($REMOVE_ALL)) {
		    tm_show_remove_all_fix(fix, violation_number, singleP);
		} else if (pcase_var.eql($REMOVE_ONE)) {
		    tm_show_remove_one_fix(fix, violation_number, singleP);
		} else if (pcase_var.eql($RETAIN_ONE)) {
		    tm_show_retain_one_fix(fix, violation_number, singleP);
		} else if (pcase_var.eql($MERGE_ALL)) {
		    tm_show_merge_all_fix(fix, violation_number, singleP);
		} else if (pcase_var.eql($REMOVE)) {
		    tm_show_remove_fix(fix, violation_number, singleP);
		} else if (pcase_var.eql($REMOVE_STOPLIST_WORD)) {
		    tm_show_remove_stoplist_fix(fix, violation_number, singleP);
		} else if (pcase_var.eql($RENAME_TERM)) {
		    tm_show_rename_term_fix(fix, violation_number, singleP);
		} else if (pcase_var.eql($SPLICE_OUT_TERM)) {
		    tm_show_splice_out_term_fix(fix, violation_number, singleP);
		} else if (pcase_var.eql($RETAIN_ONE_TERM)) {
		    tm_show_retain_one_term_fix(fix, violation_number, singleP);
		} else if (pcase_var.eql($DELETE_ALL_TERMS)) {
		    tm_show_delete_all_terms_fix(fix, violation_number, singleP);
		} else {
		    format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt167$Unknown_fix_type__A, tm_integrity.tmi_fix_op(fix));
		}

	    }
	    return NIL;
	}
    }

    public static final SubLObject tm_handle_and_perform_user_fixes(SubLObject args) {
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    {
		SubLObject number_of_violations = read_from_string_ignoring_errors(html_utilities.html_extract_input($str_alt126$number_of_violations, args), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
		SubLObject all_fix_ids = Mapping.mapcar(symbol_function(READ_FROM_STRING_IGNORING_ERRORS), html_utilities.html_extract_input_values($str_alt153$fix_id, args));
		SubLObject fixed_violation_messages = NIL;
		SubLObject outstanding_violations = NIL;
		SubLObject n = NIL;
		for (n = ZERO_INTEGER; n.numL(number_of_violations); n = add(n, ONE_INTEGER)) {
		    {
			SubLObject fix_id = html_utilities.html_extract_input(format(NIL, $str_alt132$fix_id__A, add(n, ONE_INTEGER)), args);
			SubLObject fix = NIL;
			if (fix_id.isString()) {
			    fix_id = read_from_string_ignoring_errors(fix_id, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
			}
			if (fix_id.isFixnum()) {
			    fix = tm_integrity.find_tmi_fix_by_id(fix_id);
			}
			if (NIL != fix) {
			    {
				SubLObject info_tag = format(NIL, $str_alt134$info__A, fix_id);
				SubLObject other_fix_info = html_utilities.html_extract_input(info_tag, args);
				SubLObject alternates = tm_integrity.tmi_fix_alternates(fix);
				SubLObject module = tm_integrity.tmi_fix_module(fix);
				SubLObject v_data = tm_integrity.tmi_fix_v_data(fix);
				SubLObject unique_index = (NIL != tm_integrity.$tm_unique_violation_hashes_index_object$.getDynamicValue(thread)) ? ((SubLObject) (tm_integrity.$tm_unique_violation_hashes_index_object$.getDynamicValue(thread))) : tm_integrity.tmi_fix_mt(fix);
				SubLObject violation = tm_integrity.tm_make_violation(module, v_data, unique_index);
				SubLObject message = NIL;
				if ((NIL != fix) && (NIL != tm_integrity.tm_fix_still_relevantP(fix))) {
				    message = tm_integrity.tm_integrity_violation_message(violation);
				    tm_integrity.tm_remove_violation_from_unique_hash(violation);
				    tm_integrity.tm_perform_fix(fix, other_fix_info);
				    if (NIL != tm_integrity.tm_fix_still_relevantP(fix)) {
					outstanding_violations = cons(violation, outstanding_violations);
					tm_integrity.tm_record_violation(violation, unique_index);
				    } else {
					fixed_violation_messages = cons(message, fixed_violation_messages);
					{
					    SubLObject cdolist_list_var = alternates;
					    SubLObject alternate = NIL;
					    for (alternate = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), alternate = cdolist_list_var.first()) {
						{
						    SubLObject alternate_fix = tm_integrity.find_tmi_fix_by_id(alternate);
						    tm_integrity.tm_remove_integrity_fix(alternate_fix);
						}
					    }
					}
					tm_integrity.tm_remove_integrity_fix(fix);
				    }
				}
			    }
			}
		    }
		}
		{
		    SubLObject cdolist_list_var = all_fix_ids;
		    SubLObject fix_id = NIL;
		    for (fix_id = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), fix_id = cdolist_list_var.first()) {
			{
			    SubLObject fix = tm_integrity.find_tmi_fix_by_id(fix_id);
			    if ((NIL != fix) && (NIL != tm_integrity.tm_fix_still_relevantP(fix))) {
				{
				    SubLObject module = tm_integrity.tmi_fix_module(fix);
				    SubLObject v_data = tm_integrity.tmi_fix_v_data(fix);
				    SubLObject unique_index = (NIL != tm_integrity.$tm_unique_violation_hashes_index_object$.getDynamicValue(thread)) ? ((SubLObject) (tm_integrity.$tm_unique_violation_hashes_index_object$.getDynamicValue(thread))) : tm_integrity.tmi_fix_mt(fix);
				    SubLObject violation = tm_integrity.tm_make_violation(module, v_data, unique_index);
				    SubLObject item_var = violation;
				    if (NIL == member(item_var, outstanding_violations, symbol_function(EQUAL), symbol_function(IDENTITY))) {
					outstanding_violations = cons(item_var, outstanding_violations);
				    }
				}
			    }
			}
		    }
		}
		return values(fixed_violation_messages, outstanding_violations);
	    }
	}
    }

    /**
     * Call within an HTML document.  Prints FIXED-VIOLATION-MESSAGES and messages for
     * OUTSTANDING-VIOLATIONS
     */
    public static final SubLObject tm_present_integrity_outcome(SubLObject fixed_violation_messages, SubLObject outstanding_violations) {
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    if (NIL != fixed_violation_messages) {
		html_utilities.html_princ($str_alt168$The_following_violations_were_fix);
		html_utilities.html_markup(html_macros.$html_unordered_list_head$.getGlobalValue());
		html_utilities.html_simple_attribute(html_macros.$html_list_plain$.getGlobalValue());
		html_utilities.html_char(CHAR_greater, UNPROVIDED);
		{
		    SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
		    try {
			html_macros.$html_safe_print$.bind(T, thread);
			{
			    SubLObject cdolist_list_var = fixed_violation_messages;
			    SubLObject message = NIL;
			    for (message = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), message = cdolist_list_var.first()) {
				html_utilities.html_markup(html_macros.$html_list_item_head$.getGlobalValue());
				html_utilities.html_char(CHAR_greater, UNPROVIDED);
				{
				    SubLObject _prev_bind_0_41 = html_macros.$html_safe_print$.currentBinding(thread);
				    try {
					html_macros.$html_safe_print$.bind(T, thread);
					html_utilities.html_princ(message);
				    } finally {
					html_macros.$html_safe_print$.rebind(_prev_bind_0_41, thread);
				    }
				}
				html_utilities.html_markup(html_macros.$html_list_item_tail$.getGlobalValue());
			    }
			}
		    } finally {
			html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
		    }
		}
		html_utilities.html_markup(html_macros.$html_unordered_list_tail$.getGlobalValue());
	    }
	    if (NIL != outstanding_violations) {
		html_utilities.html_princ($str_alt169$These_violations_were_not_fixed_);
		html_utilities.html_markup(html_macros.$html_unordered_list_head$.getGlobalValue());
		html_utilities.html_simple_attribute(html_macros.$html_list_plain$.getGlobalValue());
		html_utilities.html_char(CHAR_greater, UNPROVIDED);
		{
		    SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
		    try {
			html_macros.$html_safe_print$.bind(T, thread);
			{
			    SubLObject cdolist_list_var = outstanding_violations;
			    SubLObject outstanding_violation = NIL;
			    for (outstanding_violation = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), outstanding_violation = cdolist_list_var.first()) {
				{
				    SubLObject message = tm_integrity.tm_integrity_violation_message(outstanding_violation);
				    html_utilities.html_markup(html_macros.$html_list_item_head$.getGlobalValue());
				    html_utilities.html_char(CHAR_greater, UNPROVIDED);
				    {
					SubLObject _prev_bind_0_42 = html_macros.$html_safe_print$.currentBinding(thread);
					try {
					    html_macros.$html_safe_print$.bind(T, thread);
					    if (NIL != message) {
						html_utilities.html_princ(message);
					    } else {
						html_utilities.html_princ($str_alt123$_Trouble_printing_message_);
					    }
					} finally {
					    html_macros.$html_safe_print$.rebind(_prev_bind_0_42, thread);
					}
				    }
				    html_utilities.html_markup(html_macros.$html_list_item_tail$.getGlobalValue());
				}
			    }
			}
		    } finally {
			html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
		    }
		}
		html_utilities.html_markup(html_macros.$html_unordered_list_tail$.getGlobalValue());
	    }
	    return NIL;
	}
    }

    public static final SubLObject tm_integrity_check_guts() {
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    html_utilities.html_markup(html_macros.$html_table_head$.getGlobalValue());
	    if (true) {
		html_utilities.html_markup(html_macros.$html_table_border$.getGlobalValue());
		html_utilities.html_char(CHAR_quotation, UNPROVIDED);
		html_utilities.html_markup(ZERO_INTEGER);
		html_utilities.html_char(CHAR_quotation, UNPROVIDED);
	    }
	    html_utilities.html_char(CHAR_greater, UNPROVIDED);
	    {
		SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
		try {
		    html_macros.$html_safe_print$.bind(T, thread);
		    {
			SubLObject existing_search = tm_integrity.tm_integrity_search(tm_datastructures.tm_value(tm_datastructures.$tm_user$.getDynamicValue(thread), $INTEGRITY_THESAURUS));
			html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
			html_utilities.html_char(CHAR_greater, UNPROVIDED);
			{
			    SubLObject _prev_bind_0_43 = html_macros.$html_safe_print$.currentBinding(thread);
			    try {
				html_macros.$html_safe_print$.bind(T, thread);
				html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
				html_utilities.html_char(CHAR_greater, UNPROVIDED);
				{
				    SubLObject _prev_bind_0_44 = html_macros.$html_safe_print$.currentBinding(thread);
				    try {
					html_macros.$html_safe_print$.bind(T, thread);
					html_utilities.html_radio_input($$$type, $$$new, makeBoolean(NIL == existing_search));
				    } finally {
					html_macros.$html_safe_print$.rebind(_prev_bind_0_44, thread);
				    }
				}
				html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
				html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
				html_utilities.html_char(CHAR_greater, UNPROVIDED);
				{
				    SubLObject _prev_bind_0_45 = html_macros.$html_safe_print$.currentBinding(thread);
				    try {
					html_macros.$html_safe_print$.bind(T, thread);
					html_utilities.html_princ($$$Start_a_New_Integrity_Check);
				    } finally {
					html_macros.$html_safe_print$.rebind(_prev_bind_0_45, thread);
				    }
				}
				html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
			    } finally {
				html_macros.$html_safe_print$.rebind(_prev_bind_0_43, thread);
			    }
			}
			html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
			html_utilities.html_source_readability_terpri(UNPROVIDED);
			html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
			html_utilities.html_char(CHAR_greater, UNPROVIDED);
			{
			    SubLObject _prev_bind_0_46 = html_macros.$html_safe_print$.currentBinding(thread);
			    try {
				html_macros.$html_safe_print$.bind(T, thread);
				html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
				html_utilities.html_char(CHAR_greater, UNPROVIDED);
				{
				    SubLObject _prev_bind_0_47 = html_macros.$html_safe_print$.currentBinding(thread);
				    try {
					html_macros.$html_safe_print$.bind(T, thread);
				    } finally {
					html_macros.$html_safe_print$.rebind(_prev_bind_0_47, thread);
				    }
				}
				html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
				html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
				html_utilities.html_char(CHAR_greater, UNPROVIDED);
				{
				    SubLObject _prev_bind_0_48 = html_macros.$html_safe_print$.currentBinding(thread);
				    try {
					html_macros.$html_safe_print$.bind(T, thread);
					html_utilities.html_princ($str_alt174$Enter_Term_as_Starting_Point__opt);
				    } finally {
					html_macros.$html_safe_print$.rebind(_prev_bind_0_48, thread);
				    }
				}
				html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
			    } finally {
				html_macros.$html_safe_print$.rebind(_prev_bind_0_46, thread);
			    }
			}
			html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
			html_utilities.html_source_readability_terpri(UNPROVIDED);
			html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
			html_utilities.html_char(CHAR_greater, UNPROVIDED);
			{
			    SubLObject _prev_bind_0_49 = html_macros.$html_safe_print$.currentBinding(thread);
			    try {
				html_macros.$html_safe_print$.bind(T, thread);
				html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
				html_utilities.html_char(CHAR_greater, UNPROVIDED);
				{
				    SubLObject _prev_bind_0_50 = html_macros.$html_safe_print$.currentBinding(thread);
				    try {
					html_macros.$html_safe_print$.bind(T, thread);
				    } finally {
					html_macros.$html_safe_print$.rebind(_prev_bind_0_50, thread);
				    }
				}
				html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
				html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
				html_utilities.html_char(CHAR_greater, UNPROVIDED);
				{
				    SubLObject _prev_bind_0_51 = html_macros.$html_safe_print$.currentBinding(thread);
				    try {
					html_macros.$html_safe_print$.bind(T, thread);
					html_utilities.html_text_input($str_alt175$start_term, $str_alt2$, $int$40);
				    } finally {
					html_macros.$html_safe_print$.rebind(_prev_bind_0_51, thread);
				    }
				}
				html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
			    } finally {
				html_macros.$html_safe_print$.rebind(_prev_bind_0_49, thread);
			    }
			}
			html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
			html_utilities.html_source_readability_terpri(UNPROVIDED);
			if (NIL != tm_integrity.tm_integrity_searches_in_progress()) {
			    html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
			    html_utilities.html_char(CHAR_greater, UNPROVIDED);
			    {
				SubLObject _prev_bind_0_52 = html_macros.$html_safe_print$.currentBinding(thread);
				try {
				    html_macros.$html_safe_print$.bind(T, thread);
				    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
				    html_utilities.html_char(CHAR_greater, UNPROVIDED);
				    {
					SubLObject _prev_bind_0_53 = html_macros.$html_safe_print$.currentBinding(thread);
					try {
					    html_macros.$html_safe_print$.bind(T, thread);
					    html_utilities.html_radio_input($$$type, $$$continue, existing_search);
					} finally {
					    html_macros.$html_safe_print$.rebind(_prev_bind_0_53, thread);
					}
				    }
				    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
				    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
				    html_utilities.html_char(CHAR_greater, UNPROVIDED);
				    {
					SubLObject _prev_bind_0_54 = html_macros.$html_safe_print$.currentBinding(thread);
					try {
					    html_macros.$html_safe_print$.bind(T, thread);
					    html_utilities.html_princ($$$Continue_Existing_Integrity_Check);
					} finally {
					    html_macros.$html_safe_print$.rebind(_prev_bind_0_54, thread);
					}
				    }
				    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
				} finally {
				    html_macros.$html_safe_print$.rebind(_prev_bind_0_52, thread);
				}
			    }
			    html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
			    html_utilities.html_source_readability_terpri(UNPROVIDED);
			}
		    }
		} finally {
		    html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
		}
	    }
	    html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
	    html_utilities.html_br();
	    html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
	    html_utilities.html_princ($str_alt178$Choose_Thesaurus_to_Check_);
	    html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
	    html_utilities.html_br();
	    {
		SubLObject all_thesauri = tm_internals.all_thesauri_sorted();
		html_utilities.html_markup(html_macros.$html_table_head$.getGlobalValue());
		if (true) {
		    html_utilities.html_markup(html_macros.$html_table_border$.getGlobalValue());
		    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
		    html_utilities.html_markup(ZERO_INTEGER);
		    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
		}
		html_utilities.html_char(CHAR_greater, UNPROVIDED);
		{
		    SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
		    try {
			html_macros.$html_safe_print$.bind(T, thread);
			{
			    SubLObject cdolist_list_var = all_thesauri;
			    SubLObject thesaurus = NIL;
			    for (thesaurus = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), thesaurus = cdolist_list_var.first()) {
				{
				    SubLObject v_search = tm_integrity.tm_integrity_search(thesaurus);
				    html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
				    html_utilities.html_char(CHAR_greater, UNPROVIDED);
				    {
					SubLObject _prev_bind_0_55 = html_macros.$html_safe_print$.currentBinding(thread);
					try {
					    html_macros.$html_safe_print$.bind(T, thread);
					    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
					    html_utilities.html_char(CHAR_greater, UNPROVIDED);
					    {
						SubLObject _prev_bind_0_56 = html_macros.$html_safe_print$.currentBinding(thread);
						try {
						    html_macros.$html_safe_print$.bind(T, thread);
						    html_utilities.html_radio_input($$$thesaurus, tm_internals.thesaurus_name(thesaurus), eq(thesaurus, tm_datastructures.tm_value(tm_datastructures.$tm_user$.getDynamicValue(thread), $INTEGRITY_THESAURUS)));
						} finally {
						    html_macros.$html_safe_print$.rebind(_prev_bind_0_56, thread);
						}
					    }
					    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
					    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
					    html_utilities.html_char(CHAR_greater, UNPROVIDED);
					    {
						SubLObject _prev_bind_0_57 = html_macros.$html_safe_print$.currentBinding(thread);
						try {
						    html_macros.$html_safe_print$.bind(T, thread);
						    html_utilities.html_princ(tm_internals.thesaurus_name(thesaurus));
						} finally {
						    html_macros.$html_safe_print$.rebind(_prev_bind_0_57, thread);
						}
					    }
					    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
					    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
					    html_utilities.html_char(CHAR_greater, UNPROVIDED);
					    {
						SubLObject _prev_bind_0_58 = html_macros.$html_safe_print$.currentBinding(thread);
						try {
						    html_macros.$html_safe_print$.bind(T, thread);
						    if (NIL != v_search) {
							{
							    SubLObject datum = search.search_state(v_search);
							    SubLObject current = datum;
							    SubLObject thes = NIL;
							    SubLObject total = NIL;
							    SubLObject seen = NIL;
							    destructuring_bind_must_consp(current, datum, $list_alt180);
							    thes = current.first();
							    current = current.rest();
							    destructuring_bind_must_consp(current, datum, $list_alt180);
							    total = current.first();
							    current = current.rest();
							    destructuring_bind_must_consp(current, datum, $list_alt180);
							    seen = current.first();
							    current = current.rest();
							    if (NIL == current) {
								format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt181$___in_progress___A, ceiling(multiply($int$100, divide(seen, total)), UNPROVIDED));
								html_utilities.html_princ($str_alt183$__);
							    } else {
								cdestructuring_bind_error(datum, $list_alt180);
							    }
							}
						    }
						} finally {
						    html_macros.$html_safe_print$.rebind(_prev_bind_0_58, thread);
						}
					    }
					    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
					} finally {
					    html_macros.$html_safe_print$.rebind(_prev_bind_0_55, thread);
					}
				    }
				    html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
				    html_utilities.html_source_readability_terpri(UNPROVIDED);
				}
			    }
			}
		    } finally {
			html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
		    }
		}
		html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
	    }
	    html_utilities.html_br();
	    return NIL;
	}
    }

    public static final SubLObject tm_integrity_check(SubLObject args) {
	if (args == UNPROVIDED) {
	    args = NIL;
	}
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    {
		SubLObject color_value = tm_datastructures.$tm_bg_color_default$.getDynamicValue(thread);
		html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
		html_utilities.html_markup(html_macros.$html_head_head$.getGlobalValue());
		html_macros.html_head_content_type();
		html_utilities.html_source_readability_terpri(UNPROVIDED);
		html_utilities.html_markup(html_macros.$html_title_head$.getGlobalValue());
		html_utilities.html_princ($$$Integrity_Check_Thesaurus);
		html_utilities.html_markup(html_macros.$html_title_tail$.getGlobalValue());
		html_utilities.html_markup(html_macros.$html_head_tail$.getGlobalValue());
		html_utilities.html_source_readability_terpri(UNPROVIDED);
		{
		    SubLObject _prev_bind_0 = html_macros.$html_inside_bodyP$.currentBinding(thread);
		    try {
			html_macros.$html_inside_bodyP$.bind(T, thread);
			html_utilities.html_markup(html_macros.$html_body_head$.getGlobalValue());
			if (NIL != color_value) {
			    html_utilities.html_markup(html_macros.$html_body_bgcolor$.getGlobalValue());
			    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
			    html_utilities.html_markup(html_utilities.html_color(color_value));
			    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
			}
			html_utilities.html_char(CHAR_greater, UNPROVIDED);
			{
			    SubLObject _prev_bind_0_59 = html_macros.$html_safe_print$.currentBinding(thread);
			    try {
				html_macros.$html_safe_print$.bind(T, thread);
				html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
				html_utilities.html_markup(ONE_INTEGER);
				html_utilities.html_char(CHAR_greater, UNPROVIDED);
				if ((NIL != tm_control_vars.$client_thes_home_page$.getDynamicValue(thread)) && (NIL != tm_control_vars.$client_mini_logo$.getDynamicValue(thread))) {
				    html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
				    html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
				    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
				    html_utilities.html_markup(tm_control_vars.$client_thes_home_page$.getDynamicValue(thread));
				    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
				    html_utilities.html_char(CHAR_greater, UNPROVIDED);
				    {
					SubLObject _prev_bind_0_60 = html_macros.$html_safe_print$.currentBinding(thread);
					try {
					    html_macros.$html_safe_print$.bind(T, thread);
					    html_utilities.html_markup(html_macros.$html_image_head$.getGlobalValue());
					    html_utilities.html_markup(html_macros.$html_image_src$.getGlobalValue());
					    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
					    html_utilities.html_markup(tm_control_vars.$client_mini_logo$.getDynamicValue(thread));
					    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
					    if (NIL != tm_control_vars.$client_name$.getDynamicValue(thread)) {
						html_utilities.html_markup(html_macros.$html_image_alt$.getGlobalValue());
						html_utilities.html_char(CHAR_quotation, UNPROVIDED);
						html_utilities.html_markup(tm_control_vars.$client_name$.getDynamicValue(thread));
						html_utilities.html_char(CHAR_quotation, UNPROVIDED);
					    }
					    if (true) {
						html_utilities.html_markup(html_macros.$html_image_border$.getGlobalValue());
						html_utilities.html_char(CHAR_quotation, UNPROVIDED);
						html_utilities.html_markup(ZERO_INTEGER);
						html_utilities.html_char(CHAR_quotation, UNPROVIDED);
					    }
					    html_utilities.html_char(CHAR_greater, UNPROVIDED);
					    {
						SubLObject _prev_bind_0_61 = html_macros.$html_safe_print$.currentBinding(thread);
						try {
						    html_macros.$html_safe_print$.bind(T, thread);
						} finally {
						    html_macros.$html_safe_print$.rebind(_prev_bind_0_61, thread);
						}
					    }
					    html_utilities.html_markup(html_macros.$html_image_tail$.getGlobalValue());
					} finally {
					    html_macros.$html_safe_print$.rebind(_prev_bind_0_60, thread);
					}
				    }
				    html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
				}
				html_utilities.html_princ($$$Integrity_Check_Thesaurus);
				html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
				html_utilities.html_markup(ONE_INTEGER);
				html_utilities.html_char(CHAR_greater, UNPROVIDED);
				tm_logging.tm_enqueue_event($$$Integrity_Check_Thesaurus);
				if (!(true && (NIL != tm_internals.privelegedP(tm_datastructures.$tm_user$.getDynamicValue(thread), $str_alt185$full_editor)))) {
				    html_utilities.html_princ($str_alt186$Sorry__you_do_not_have_permission);
				} else {
				    html_thesaurus.thesaurus_heading($str_alt187$tm_integrity_check);
				    html_utilities.html_markup(html_macros.$html_form_head$.getGlobalValue());
				    html_utilities.html_markup(html_macros.$html_form_action$.getGlobalValue());
				    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
				    html_utilities.html_markup(system_parameters.$cyc_cgi_program$.getDynamicValue(thread));
				    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
				    if (NIL != html_macros.$html_form_method_post$.getGlobalValue()) {
					html_utilities.html_markup(html_macros.$html_form_method$.getGlobalValue());
					html_utilities.html_char(CHAR_quotation, UNPROVIDED);
					html_utilities.html_markup(html_macros.$html_form_method_post$.getGlobalValue());
					html_utilities.html_char(CHAR_quotation, UNPROVIDED);
				    }
				    html_utilities.html_char(CHAR_greater, UNPROVIDED);
				    {
					SubLObject _prev_bind_0_62 = html_macros.$html_safe_print$.currentBinding(thread);
					SubLObject _prev_bind_1 = html_macros.$within_html_form$.currentBinding(thread);
					SubLObject _prev_bind_2 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
					try {
					    html_macros.$html_safe_print$.bind(T, thread);
					    html_macros.$within_html_form$.bind(T, thread);
					    html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
					    html_utilities.html_hidden_input($str_alt188$tm_handle_integrity_check, T, UNPROVIDED);
					    tm_integrity_check_guts();
					    html_utilities.html_br();
					    html_utilities.html_submit_input($$$Integrity_Check, UNPROVIDED, UNPROVIDED);
					    html_utilities.html_reset_input(UNPROVIDED);
					    html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
					} finally {
					    html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_2, thread);
					    html_macros.$within_html_form$.rebind(_prev_bind_1, thread);
					    html_macros.$html_safe_print$.rebind(_prev_bind_0_62, thread);
					}
				    }
				    html_utilities.html_markup(html_macros.$html_form_tail$.getGlobalValue());
				}
				html_thesaurus.tm_footer();
				html_utilities.html_source_readability_terpri(UNPROVIDED);
			    } finally {
				html_macros.$html_safe_print$.rebind(_prev_bind_0_59, thread);
			    }
			}
			html_utilities.html_markup(html_macros.$html_body_tail$.getGlobalValue());
			html_utilities.html_source_readability_terpri(UNPROVIDED);
		    } finally {
			html_macros.$html_inside_bodyP$.rebind(_prev_bind_0, thread);
		    }
		}
		html_utilities.html_markup(html_macros.$html_html_tail$.getGlobalValue());
		html_utilities.html_source_readability_terpri(UNPROVIDED);
	    }
	    return NIL;
	}
    }

    public static final SubLObject tm_handle_integrity_check(SubLObject args) {
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    {
		SubLObject type = html_utilities.html_extract_input($$$type, args);
		SubLObject start_term = tm_internals.canonicalize_lexical_term(html_utilities.html_extract_input($str_alt175$start_term, args));
		SubLObject thesaurus_name = html_utilities.html_extract_input($$$thesaurus, args);
		SubLObject start_concept = NIL;
		SubLObject thesaurus = NIL;
		SubLObject v_search = NIL;
		SubLObject lexpred = NIL;
		if (NIL == type) {
		    return html_thesaurus.tm_error($str_alt191$You_must_choose_either_to_start_a, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
		}
		if (NIL == thesaurus_name) {
		    return html_thesaurus.tm_error($str_alt192$You_must_choose_a_thesaurus_on_wh, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
		}
		thesaurus = tm_internals.thesaurus_constant_from_name(thesaurus_name);
		if (NIL == tm_internals.thesaurusP(thesaurus)) {
		    return html_thesaurus.tm_error($str_alt193$Could_not_determine_a_valid_thesa, thesaurus_name, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
		}
		if (NIL == subl_promotions.memberP(thesaurus, tm_datastructures.tm_value(tm_datastructures.$tm_user$.getDynamicValue(thread), $THESAURI), UNPROVIDED, UNPROVIDED)) {
		    tm_datastructures.change_tm_value(tm_datastructures.$tm_user$.getDynamicValue(thread), $THESAURI, thesaurus, $CONS);
		}
		if (type.equalp($$$new)) {
		    if ((NIL != start_term) && (NIL != string_utilities.non_empty_stringP(start_term))) {
			try {
			    start_concept = tm_internals.concept_from_term_lexpred_in_thesaurus(start_term, $$preferredTerm, thesaurus);
			} catch (Throwable ccatch_env_var) {
			    lexpred = Errors.handleThrowable(ccatch_env_var, $MULTIPLE_LEXPRED);
			}
			if (NIL != lexpred) {
			    return html_thesaurus.tm_error($str_alt197$_A_has_multiple_preferred_term_st, start_term, tm_internals.thesaurus_name(thesaurus), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
			}
			if (NIL == forts.valid_fortP(start_concept)) {
			    return html_thesaurus.tm_error($str_alt198$You_have_specified_a_Starting_Ter, start_term, tm_internals.thesaurus_name(thesaurus), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
			}
		    }
		    v_search = tm_integrity.tm_new_integrity_search(thesaurus, start_concept);
		    if (NIL == v_search) {
			return html_thesaurus.tm_error($str_alt199$Implementation_error__Start_integ, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
		    }
		    tm_datastructures.change_tm_value(tm_datastructures.$tm_user$.getDynamicValue(thread), $INTEGRITY_THESAURUS, thesaurus, UNPROVIDED);
		} else if (type.equalp($$$continue)) {
		    v_search = tm_integrity.tm_integrity_search(thesaurus);
		    if (NIL == v_search) {
			return html_thesaurus.tm_error($str_alt200$No_integrity_check_is_in_progress, tm_internals.thesaurus_name(thesaurus), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
		    }
		    tm_datastructures.change_tm_value(tm_datastructures.$tm_user$.getDynamicValue(thread), $INTEGRITY_THESAURUS, thesaurus, UNPROVIDED);
		} else {
		    return html_thesaurus.tm_error($str_alt201$Implementation_error___S_is_not_a, type, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
		}

		tm_do_integrity_check(v_search);
	    }
	    return NIL;
	}
    }

    public static final SubLObject tm_do_integrity_check(SubLObject v_search) {
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    thread.resetMultipleValues();
	    {
		SubLObject violations = tm_integrity.tm_continue_integrity_search(v_search, UNPROVIDED, UNPROVIDED);
		SubLObject reason = thread.secondMultipleValue();
		thread.resetMultipleValues();
		{
		    SubLObject failedP = NIL;
		    SubLObject color_value = tm_datastructures.$tm_bg_color_default$.getDynamicValue(thread);
		    html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
		    html_utilities.html_markup(html_macros.$html_head_head$.getGlobalValue());
		    html_macros.html_head_content_type();
		    html_utilities.html_source_readability_terpri(UNPROVIDED);
		    html_utilities.html_markup(html_macros.$html_title_head$.getGlobalValue());
		    html_utilities.html_princ($$$Integrity_Check_Thesaurus_Results);
		    html_utilities.html_markup(html_macros.$html_title_tail$.getGlobalValue());
		    html_utilities.html_markup(html_macros.$html_head_tail$.getGlobalValue());
		    html_utilities.html_source_readability_terpri(UNPROVIDED);
		    {
			SubLObject _prev_bind_0 = html_macros.$html_inside_bodyP$.currentBinding(thread);
			try {
			    html_macros.$html_inside_bodyP$.bind(T, thread);
			    html_utilities.html_markup(html_macros.$html_body_head$.getGlobalValue());
			    if (NIL != color_value) {
				html_utilities.html_markup(html_macros.$html_body_bgcolor$.getGlobalValue());
				html_utilities.html_char(CHAR_quotation, UNPROVIDED);
				html_utilities.html_markup(html_utilities.html_color(color_value));
				html_utilities.html_char(CHAR_quotation, UNPROVIDED);
			    }
			    html_utilities.html_char(CHAR_greater, UNPROVIDED);
			    {
				SubLObject _prev_bind_0_63 = html_macros.$html_safe_print$.currentBinding(thread);
				try {
				    html_macros.$html_safe_print$.bind(T, thread);
				    html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
				    html_utilities.html_markup(ONE_INTEGER);
				    html_utilities.html_char(CHAR_greater, UNPROVIDED);
				    if ((NIL != tm_control_vars.$client_thes_home_page$.getDynamicValue(thread)) && (NIL != tm_control_vars.$client_mini_logo$.getDynamicValue(thread))) {
					html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
					html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
					html_utilities.html_char(CHAR_quotation, UNPROVIDED);
					html_utilities.html_markup(tm_control_vars.$client_thes_home_page$.getDynamicValue(thread));
					html_utilities.html_char(CHAR_quotation, UNPROVIDED);
					html_utilities.html_char(CHAR_greater, UNPROVIDED);
					{
					    SubLObject _prev_bind_0_64 = html_macros.$html_safe_print$.currentBinding(thread);
					    try {
						html_macros.$html_safe_print$.bind(T, thread);
						html_utilities.html_markup(html_macros.$html_image_head$.getGlobalValue());
						html_utilities.html_markup(html_macros.$html_image_src$.getGlobalValue());
						html_utilities.html_char(CHAR_quotation, UNPROVIDED);
						html_utilities.html_markup(tm_control_vars.$client_mini_logo$.getDynamicValue(thread));
						html_utilities.html_char(CHAR_quotation, UNPROVIDED);
						if (NIL != tm_control_vars.$client_name$.getDynamicValue(thread)) {
						    html_utilities.html_markup(html_macros.$html_image_alt$.getGlobalValue());
						    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
						    html_utilities.html_markup(tm_control_vars.$client_name$.getDynamicValue(thread));
						    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
						}
						if (true) {
						    html_utilities.html_markup(html_macros.$html_image_border$.getGlobalValue());
						    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
						    html_utilities.html_markup(ZERO_INTEGER);
						    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
						}
						html_utilities.html_char(CHAR_greater, UNPROVIDED);
						{
						    SubLObject _prev_bind_0_65 = html_macros.$html_safe_print$.currentBinding(thread);
						    try {
							html_macros.$html_safe_print$.bind(T, thread);
						    } finally {
							html_macros.$html_safe_print$.rebind(_prev_bind_0_65, thread);
						    }
						}
						html_utilities.html_markup(html_macros.$html_image_tail$.getGlobalValue());
					    } finally {
						html_macros.$html_safe_print$.rebind(_prev_bind_0_64, thread);
					    }
					}
					html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
				    }
				    html_utilities.html_princ($$$Integrity_Check_Thesaurus_Results);
				    html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
				    html_utilities.html_markup(ONE_INTEGER);
				    html_utilities.html_char(CHAR_greater, UNPROVIDED);
				    tm_logging.tm_enqueue_event($$$Integrity_Check_Thesaurus_Results);
				    if (!(true && (NIL != tm_internals.privelegedP(tm_datastructures.$tm_user$.getDynamicValue(thread), $str_alt185$full_editor)))) {
					html_utilities.html_princ($str_alt186$Sorry__you_do_not_have_permission);
				    } else {
					html_thesaurus.thesaurus_heading($str_alt204$tm_do_integrity_check);
					html_utilities.html_princ($str_alt205$The_search_for_integrity_violatio);
					{
					    SubLObject pcase_var = reason;
					    if (pcase_var.eql($NUMBER)) {
						format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt207$the_default_number___A__of_violat, tm_integrity.$tm_integrity_number_cutoff$.getDynamicValue(thread));
					    } else if (pcase_var.eql($TIME)) {
						format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt209$it_timed_out_at__A_seconds_, tm_integrity.$tm_integrity_time_cutoff$.getDynamicValue(thread));
					    } else if (pcase_var.eql($EXHAUST)) {
						html_utilities.html_princ($str_alt211$the_entire_thesaurus_has_been_sea);
					    } else {
						failedP = T;
						format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt212$of_an_unknown_halt_reason__A, reason);
					    }

					}
					if (NIL == failedP) {
					    html_utilities.html_hr(UNPROVIDED, UNPROVIDED);
					    {
						SubLObject choices_to_makeP = NIL;
						if (NIL == violations) {
						    html_utilities.html_princ($str_alt213$No_integrity_violations_were_foun);
						    html_utilities.html_br();
						} else {
						    html_utilities.html_markup(html_macros.$html_form_head$.getGlobalValue());
						    html_utilities.html_markup(html_macros.$html_form_action$.getGlobalValue());
						    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
						    html_utilities.html_markup(system_parameters.$cyc_cgi_program$.getDynamicValue(thread));
						    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
						    if (NIL != html_macros.$html_form_method_post$.getGlobalValue()) {
							html_utilities.html_markup(html_macros.$html_form_method$.getGlobalValue());
							html_utilities.html_char(CHAR_quotation, UNPROVIDED);
							html_utilities.html_markup(html_macros.$html_form_method_post$.getGlobalValue());
							html_utilities.html_char(CHAR_quotation, UNPROVIDED);
						    }
						    html_utilities.html_char(CHAR_greater, UNPROVIDED);
						    {
							SubLObject _prev_bind_0_66 = html_macros.$html_safe_print$.currentBinding(thread);
							SubLObject _prev_bind_1 = html_macros.$within_html_form$.currentBinding(thread);
							SubLObject _prev_bind_2 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
							try {
							    html_macros.$html_safe_print$.bind(T, thread);
							    html_macros.$within_html_form$.bind(T, thread);
							    html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
							    html_utilities.html_hidden_input($str_alt214$tm_handle_do_integrity_check, T, UNPROVIDED);
							    {
								SubLObject violation_number = ZERO_INTEGER;
								html_utilities.html_hidden_input($str_alt126$number_of_violations, length(violations), UNPROVIDED);
								html_utilities.html_princ($str_alt215$For_each_of_the_outstanding_viola);
								html_utilities.html_br();
								html_utilities.html_markup(html_macros.$html_unordered_list_head$.getGlobalValue());
								html_utilities.html_char(CHAR_greater, UNPROVIDED);
								{
								    SubLObject _prev_bind_0_67 = html_macros.$html_safe_print$.currentBinding(thread);
								    try {
									html_macros.$html_safe_print$.bind(T, thread);
									{
									    SubLObject cdolist_list_var = violations;
									    SubLObject violation = NIL;
									    for (violation = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), violation = cdolist_list_var.first()) {
										violation_number = add(violation_number, ONE_INTEGER);
										html_utilities.html_markup(html_macros.$html_list_item_head$.getGlobalValue());
										html_utilities.html_char(CHAR_greater, UNPROVIDED);
										{
										    SubLObject _prev_bind_0_68 = html_macros.$html_safe_print$.currentBinding(thread);
										    try {
											html_macros.$html_safe_print$.bind(T, thread);
											if (NIL != tm_fix_or_print_one_violation(violation, violation_number)) {
											    choices_to_makeP = T;
											}
										    } finally {
											html_macros.$html_safe_print$.rebind(_prev_bind_0_68, thread);
										    }
										}
										html_utilities.html_markup(html_macros.$html_list_item_tail$.getGlobalValue());
									    }
									}
								    } finally {
									html_macros.$html_safe_print$.rebind(_prev_bind_0_67, thread);
								    }
								}
								html_utilities.html_markup(html_macros.$html_unordered_list_tail$.getGlobalValue());
								if (NIL != choices_to_makeP) {
								    html_utilities.html_br();
								    html_utilities.html_submit_input($$$Perform_Selected_Fixes, UNPROVIDED, UNPROVIDED);
								    html_utilities.html_reset_input(UNPROVIDED);
								}
							    }
							    html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
							} finally {
							    html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_2, thread);
							    html_macros.$within_html_form$.rebind(_prev_bind_1, thread);
							    html_macros.$html_safe_print$.rebind(_prev_bind_0_66, thread);
							}
						    }
						    html_utilities.html_markup(html_macros.$html_form_tail$.getGlobalValue());
						}
						if (NIL == choices_to_makeP) {
						    html_utilities.html_markup(html_macros.$html_form_head$.getGlobalValue());
						    html_utilities.html_markup(html_macros.$html_form_action$.getGlobalValue());
						    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
						    html_utilities.html_markup(system_parameters.$cyc_cgi_program$.getDynamicValue(thread));
						    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
						    if (NIL != html_macros.$html_form_method_post$.getGlobalValue()) {
							html_utilities.html_markup(html_macros.$html_form_method$.getGlobalValue());
							html_utilities.html_char(CHAR_quotation, UNPROVIDED);
							html_utilities.html_markup(html_macros.$html_form_method_post$.getGlobalValue());
							html_utilities.html_char(CHAR_quotation, UNPROVIDED);
						    }
						    html_utilities.html_char(CHAR_greater, UNPROVIDED);
						    {
							SubLObject _prev_bind_0_69 = html_macros.$html_safe_print$.currentBinding(thread);
							SubLObject _prev_bind_1 = html_macros.$within_html_form$.currentBinding(thread);
							SubLObject _prev_bind_2 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
							try {
							    html_macros.$html_safe_print$.bind(T, thread);
							    html_macros.$within_html_form$.bind(T, thread);
							    html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
							    html_utilities.html_hidden_input($str_alt188$tm_handle_integrity_check, T, UNPROVIDED);
							    html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
							    html_utilities.html_princ($str_alt216$If_you_wish_to_continue_checking_);
							    html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
							    html_utilities.html_br();
							    tm_integrity_check_guts();
							    html_utilities.html_br();
							    html_utilities.html_submit_input($$$Integrity_Check, UNPROVIDED, UNPROVIDED);
							    html_utilities.html_reset_input(UNPROVIDED);
							    html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
							} finally {
							    html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_2, thread);
							    html_macros.$within_html_form$.rebind(_prev_bind_1, thread);
							    html_macros.$html_safe_print$.rebind(_prev_bind_0_69, thread);
							}
						    }
						    html_utilities.html_markup(html_macros.$html_form_tail$.getGlobalValue());
						}
					    }
					}
				    }
				    html_thesaurus.tm_footer();
				    html_utilities.html_source_readability_terpri(UNPROVIDED);
				} finally {
				    html_macros.$html_safe_print$.rebind(_prev_bind_0_63, thread);
				}
			    }
			    html_utilities.html_markup(html_macros.$html_body_tail$.getGlobalValue());
			    html_utilities.html_source_readability_terpri(UNPROVIDED);
			} finally {
			    html_macros.$html_inside_bodyP$.rebind(_prev_bind_0, thread);
			}
		    }
		    html_utilities.html_markup(html_macros.$html_html_tail$.getGlobalValue());
		    html_utilities.html_source_readability_terpri(UNPROVIDED);
		}
	    }
	    return NIL;
	}
    }

    public static final SubLObject tm_handle_do_integrity_check(SubLObject args) {
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    thread.resetMultipleValues();
	    {
		SubLObject fixed_violations = tm_handle_and_perform_user_fixes(args);
		SubLObject outstanding_violations = thread.secondMultipleValue();
		thread.resetMultipleValues();
		{
		    SubLObject color_value = tm_datastructures.$tm_bg_color_default$.getDynamicValue(thread);
		    html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
		    html_utilities.html_markup(html_macros.$html_head_head$.getGlobalValue());
		    html_macros.html_head_content_type();
		    html_utilities.html_source_readability_terpri(UNPROVIDED);
		    html_utilities.html_markup(html_macros.$html_title_head$.getGlobalValue());
		    html_utilities.html_princ($str_alt217$Integrity_Check_Thesaurus_Fix_Res);
		    html_utilities.html_markup(html_macros.$html_title_tail$.getGlobalValue());
		    html_utilities.html_markup(html_macros.$html_head_tail$.getGlobalValue());
		    html_utilities.html_source_readability_terpri(UNPROVIDED);
		    {
			SubLObject _prev_bind_0 = html_macros.$html_inside_bodyP$.currentBinding(thread);
			try {
			    html_macros.$html_inside_bodyP$.bind(T, thread);
			    html_utilities.html_markup(html_macros.$html_body_head$.getGlobalValue());
			    if (NIL != color_value) {
				html_utilities.html_markup(html_macros.$html_body_bgcolor$.getGlobalValue());
				html_utilities.html_char(CHAR_quotation, UNPROVIDED);
				html_utilities.html_markup(html_utilities.html_color(color_value));
				html_utilities.html_char(CHAR_quotation, UNPROVIDED);
			    }
			    html_utilities.html_char(CHAR_greater, UNPROVIDED);
			    {
				SubLObject _prev_bind_0_70 = html_macros.$html_safe_print$.currentBinding(thread);
				try {
				    html_macros.$html_safe_print$.bind(T, thread);
				    html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
				    html_utilities.html_markup(ONE_INTEGER);
				    html_utilities.html_char(CHAR_greater, UNPROVIDED);
				    if ((NIL != tm_control_vars.$client_thes_home_page$.getDynamicValue(thread)) && (NIL != tm_control_vars.$client_mini_logo$.getDynamicValue(thread))) {
					html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
					html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
					html_utilities.html_char(CHAR_quotation, UNPROVIDED);
					html_utilities.html_markup(tm_control_vars.$client_thes_home_page$.getDynamicValue(thread));
					html_utilities.html_char(CHAR_quotation, UNPROVIDED);
					html_utilities.html_char(CHAR_greater, UNPROVIDED);
					{
					    SubLObject _prev_bind_0_71 = html_macros.$html_safe_print$.currentBinding(thread);
					    try {
						html_macros.$html_safe_print$.bind(T, thread);
						html_utilities.html_markup(html_macros.$html_image_head$.getGlobalValue());
						html_utilities.html_markup(html_macros.$html_image_src$.getGlobalValue());
						html_utilities.html_char(CHAR_quotation, UNPROVIDED);
						html_utilities.html_markup(tm_control_vars.$client_mini_logo$.getDynamicValue(thread));
						html_utilities.html_char(CHAR_quotation, UNPROVIDED);
						if (NIL != tm_control_vars.$client_name$.getDynamicValue(thread)) {
						    html_utilities.html_markup(html_macros.$html_image_alt$.getGlobalValue());
						    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
						    html_utilities.html_markup(tm_control_vars.$client_name$.getDynamicValue(thread));
						    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
						}
						if (true) {
						    html_utilities.html_markup(html_macros.$html_image_border$.getGlobalValue());
						    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
						    html_utilities.html_markup(ZERO_INTEGER);
						    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
						}
						html_utilities.html_char(CHAR_greater, UNPROVIDED);
						{
						    SubLObject _prev_bind_0_72 = html_macros.$html_safe_print$.currentBinding(thread);
						    try {
							html_macros.$html_safe_print$.bind(T, thread);
						    } finally {
							html_macros.$html_safe_print$.rebind(_prev_bind_0_72, thread);
						    }
						}
						html_utilities.html_markup(html_macros.$html_image_tail$.getGlobalValue());
					    } finally {
						html_macros.$html_safe_print$.rebind(_prev_bind_0_71, thread);
					    }
					}
					html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
				    }
				    html_utilities.html_princ($str_alt217$Integrity_Check_Thesaurus_Fix_Res);
				    html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
				    html_utilities.html_markup(ONE_INTEGER);
				    html_utilities.html_char(CHAR_greater, UNPROVIDED);
				    tm_logging.tm_enqueue_event($str_alt217$Integrity_Check_Thesaurus_Fix_Res);
				    html_thesaurus.thesaurus_heading($str_alt214$tm_handle_do_integrity_check);
				    tm_present_integrity_outcome(fixed_violations, outstanding_violations);
				    html_utilities.html_hr(UNPROVIDED, UNPROVIDED);
				    html_utilities.html_princ($str_alt218$If_you_wish_to_continue_integrity);
				    html_utilities.html_markup(html_macros.$html_form_head$.getGlobalValue());
				    html_utilities.html_markup(html_macros.$html_form_action$.getGlobalValue());
				    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
				    html_utilities.html_markup(system_parameters.$cyc_cgi_program$.getDynamicValue(thread));
				    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
				    if (NIL != html_macros.$html_form_method_post$.getGlobalValue()) {
					html_utilities.html_markup(html_macros.$html_form_method$.getGlobalValue());
					html_utilities.html_char(CHAR_quotation, UNPROVIDED);
					html_utilities.html_markup(html_macros.$html_form_method_post$.getGlobalValue());
					html_utilities.html_char(CHAR_quotation, UNPROVIDED);
				    }
				    html_utilities.html_char(CHAR_greater, UNPROVIDED);
				    {
					SubLObject _prev_bind_0_73 = html_macros.$html_safe_print$.currentBinding(thread);
					SubLObject _prev_bind_1 = html_macros.$within_html_form$.currentBinding(thread);
					SubLObject _prev_bind_2 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
					try {
					    html_macros.$html_safe_print$.bind(T, thread);
					    html_macros.$within_html_form$.bind(T, thread);
					    html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
					    html_utilities.html_hidden_input($str_alt188$tm_handle_integrity_check, T, UNPROVIDED);
					    tm_integrity_check_guts();
					    html_utilities.html_br();
					    html_utilities.html_submit_input($$$Integrity_Check, UNPROVIDED, UNPROVIDED);
					    html_utilities.html_reset_input(UNPROVIDED);
					    html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
					} finally {
					    html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_2, thread);
					    html_macros.$within_html_form$.rebind(_prev_bind_1, thread);
					    html_macros.$html_safe_print$.rebind(_prev_bind_0_73, thread);
					}
				    }
				    html_utilities.html_markup(html_macros.$html_form_tail$.getGlobalValue());
				    html_thesaurus.tm_footer();
				    html_utilities.html_source_readability_terpri(UNPROVIDED);
				} finally {
				    html_macros.$html_safe_print$.rebind(_prev_bind_0_70, thread);
				}
			    }
			    html_utilities.html_markup(html_macros.$html_body_tail$.getGlobalValue());
			    html_utilities.html_source_readability_terpri(UNPROVIDED);
			} finally {
			    html_macros.$html_inside_bodyP$.rebind(_prev_bind_0, thread);
			}
		    }
		    html_utilities.html_markup(html_macros.$html_html_tail$.getGlobalValue());
		    html_utilities.html_source_readability_terpri(UNPROVIDED);
		}
	    }
	    return NIL;
	}
    }

    public static final SubLObject tm_handle_user_fixes(SubLObject args) {
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    thread.resetMultipleValues();
	    {
		SubLObject fixed_violations = tm_handle_and_perform_user_fixes(args);
		SubLObject outstanding_violations = thread.secondMultipleValue();
		thread.resetMultipleValues();
		{
		    SubLObject color_value = tm_datastructures.$tm_bg_color_default$.getDynamicValue(thread);
		    html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
		    html_utilities.html_markup(html_macros.$html_head_head$.getGlobalValue());
		    html_macros.html_head_content_type();
		    html_utilities.html_source_readability_terpri(UNPROVIDED);
		    html_utilities.html_markup(html_macros.$html_title_head$.getGlobalValue());
		    html_utilities.html_princ($$$Fix_Integrity_Violations_Results);
		    html_utilities.html_markup(html_macros.$html_title_tail$.getGlobalValue());
		    html_utilities.html_markup(html_macros.$html_head_tail$.getGlobalValue());
		    html_utilities.html_source_readability_terpri(UNPROVIDED);
		    {
			SubLObject _prev_bind_0 = html_macros.$html_inside_bodyP$.currentBinding(thread);
			try {
			    html_macros.$html_inside_bodyP$.bind(T, thread);
			    html_utilities.html_markup(html_macros.$html_body_head$.getGlobalValue());
			    if (NIL != color_value) {
				html_utilities.html_markup(html_macros.$html_body_bgcolor$.getGlobalValue());
				html_utilities.html_char(CHAR_quotation, UNPROVIDED);
				html_utilities.html_markup(html_utilities.html_color(color_value));
				html_utilities.html_char(CHAR_quotation, UNPROVIDED);
			    }
			    html_utilities.html_char(CHAR_greater, UNPROVIDED);
			    {
				SubLObject _prev_bind_0_74 = html_macros.$html_safe_print$.currentBinding(thread);
				try {
				    html_macros.$html_safe_print$.bind(T, thread);
				    html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
				    html_utilities.html_markup(ONE_INTEGER);
				    html_utilities.html_char(CHAR_greater, UNPROVIDED);
				    if ((NIL != tm_control_vars.$client_thes_home_page$.getDynamicValue(thread)) && (NIL != tm_control_vars.$client_mini_logo$.getDynamicValue(thread))) {
					html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
					html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
					html_utilities.html_char(CHAR_quotation, UNPROVIDED);
					html_utilities.html_markup(tm_control_vars.$client_thes_home_page$.getDynamicValue(thread));
					html_utilities.html_char(CHAR_quotation, UNPROVIDED);
					html_utilities.html_char(CHAR_greater, UNPROVIDED);
					{
					    SubLObject _prev_bind_0_75 = html_macros.$html_safe_print$.currentBinding(thread);
					    try {
						html_macros.$html_safe_print$.bind(T, thread);
						html_utilities.html_markup(html_macros.$html_image_head$.getGlobalValue());
						html_utilities.html_markup(html_macros.$html_image_src$.getGlobalValue());
						html_utilities.html_char(CHAR_quotation, UNPROVIDED);
						html_utilities.html_markup(tm_control_vars.$client_mini_logo$.getDynamicValue(thread));
						html_utilities.html_char(CHAR_quotation, UNPROVIDED);
						if (NIL != tm_control_vars.$client_name$.getDynamicValue(thread)) {
						    html_utilities.html_markup(html_macros.$html_image_alt$.getGlobalValue());
						    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
						    html_utilities.html_markup(tm_control_vars.$client_name$.getDynamicValue(thread));
						    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
						}
						if (true) {
						    html_utilities.html_markup(html_macros.$html_image_border$.getGlobalValue());
						    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
						    html_utilities.html_markup(ZERO_INTEGER);
						    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
						}
						html_utilities.html_char(CHAR_greater, UNPROVIDED);
						{
						    SubLObject _prev_bind_0_76 = html_macros.$html_safe_print$.currentBinding(thread);
						    try {
							html_macros.$html_safe_print$.bind(T, thread);
						    } finally {
							html_macros.$html_safe_print$.rebind(_prev_bind_0_76, thread);
						    }
						}
						html_utilities.html_markup(html_macros.$html_image_tail$.getGlobalValue());
					    } finally {
						html_macros.$html_safe_print$.rebind(_prev_bind_0_75, thread);
					    }
					}
					html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
				    }
				    html_utilities.html_princ($$$Fix_Integrity_Violations_Results);
				    html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
				    html_utilities.html_markup(ONE_INTEGER);
				    html_utilities.html_char(CHAR_greater, UNPROVIDED);
				    tm_logging.tm_enqueue_event($$$Fix_Integrity_Violations_Results);
				    html_thesaurus.thesaurus_heading($str_alt124$tm_handle_user_fixes);
				    tm_present_integrity_outcome(fixed_violations, outstanding_violations);
				    html_thesaurus.tm_footer();
				    html_utilities.html_source_readability_terpri(UNPROVIDED);
				} finally {
				    html_macros.$html_safe_print$.rebind(_prev_bind_0_74, thread);
				}
			    }
			    html_utilities.html_markup(html_macros.$html_body_tail$.getGlobalValue());
			    html_utilities.html_source_readability_terpri(UNPROVIDED);
			} finally {
			    html_macros.$html_inside_bodyP$.rebind(_prev_bind_0, thread);
			}
		    }
		    html_utilities.html_markup(html_macros.$html_html_tail$.getGlobalValue());
		    html_utilities.html_source_readability_terpri(UNPROVIDED);
		}
	    }
	    return NIL;
	}
    }

    public static final SubLObject tm_relation_integrity_check(SubLObject args) {
	if (args == UNPROVIDED) {
	    args = NIL;
	}
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    {
		SubLObject relation = html_utilities.html_extract_input($$$rel, args);
		SubLObject arg_index = html_utilities.html_extract_input($str_alt223$arg_index, args);
		if (NIL != relation) {
		    relation = read_from_string_ignoring_errors(relation, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
		    if (relation.isInteger()) {
			relation = html_thesaurus.tm_guess_fort(relation);
		    }
		}
		if (!((NIL != forts.valid_fortP(relation)) && (NIL != tm_internals.thesaurus_predicateP(relation)))) {
		    relation = get_default_integrity_check_relation(UNPROVIDED);
		}
		if (NIL != arg_index) {
		    arg_index = read_from_string_ignoring_errors(arg_index, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
		}
		if (!(arg_index.isInteger() && (arg_index.eql(ONE_INTEGER) || arg_index.eql(TWO_INTEGER)))) {
		    arg_index = ONE_INTEGER;
		}
		{
		    SubLObject color_value = tm_datastructures.$tm_bg_color_default$.getDynamicValue(thread);
		    html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
		    html_utilities.html_markup(html_macros.$html_head_head$.getGlobalValue());
		    html_macros.html_head_content_type();
		    html_utilities.html_source_readability_terpri(UNPROVIDED);
		    html_utilities.html_markup(html_macros.$html_title_head$.getGlobalValue());
		    html_utilities.html_princ($$$Integrity_Check_Relation);
		    html_utilities.html_markup(html_macros.$html_title_tail$.getGlobalValue());
		    html_utilities.html_markup(html_macros.$html_head_tail$.getGlobalValue());
		    html_utilities.html_source_readability_terpri(UNPROVIDED);
		    {
			SubLObject _prev_bind_0 = html_macros.$html_inside_bodyP$.currentBinding(thread);
			try {
			    html_macros.$html_inside_bodyP$.bind(T, thread);
			    html_utilities.html_markup(html_macros.$html_body_head$.getGlobalValue());
			    if (NIL != color_value) {
				html_utilities.html_markup(html_macros.$html_body_bgcolor$.getGlobalValue());
				html_utilities.html_char(CHAR_quotation, UNPROVIDED);
				html_utilities.html_markup(html_utilities.html_color(color_value));
				html_utilities.html_char(CHAR_quotation, UNPROVIDED);
			    }
			    html_utilities.html_char(CHAR_greater, UNPROVIDED);
			    {
				SubLObject _prev_bind_0_77 = html_macros.$html_safe_print$.currentBinding(thread);
				try {
				    html_macros.$html_safe_print$.bind(T, thread);
				    html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
				    html_utilities.html_markup(ONE_INTEGER);
				    html_utilities.html_char(CHAR_greater, UNPROVIDED);
				    if ((NIL != tm_control_vars.$client_thes_home_page$.getDynamicValue(thread)) && (NIL != tm_control_vars.$client_mini_logo$.getDynamicValue(thread))) {
					html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
					html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
					html_utilities.html_char(CHAR_quotation, UNPROVIDED);
					html_utilities.html_markup(tm_control_vars.$client_thes_home_page$.getDynamicValue(thread));
					html_utilities.html_char(CHAR_quotation, UNPROVIDED);
					html_utilities.html_char(CHAR_greater, UNPROVIDED);
					{
					    SubLObject _prev_bind_0_78 = html_macros.$html_safe_print$.currentBinding(thread);
					    try {
						html_macros.$html_safe_print$.bind(T, thread);
						html_utilities.html_markup(html_macros.$html_image_head$.getGlobalValue());
						html_utilities.html_markup(html_macros.$html_image_src$.getGlobalValue());
						html_utilities.html_char(CHAR_quotation, UNPROVIDED);
						html_utilities.html_markup(tm_control_vars.$client_mini_logo$.getDynamicValue(thread));
						html_utilities.html_char(CHAR_quotation, UNPROVIDED);
						if (NIL != tm_control_vars.$client_name$.getDynamicValue(thread)) {
						    html_utilities.html_markup(html_macros.$html_image_alt$.getGlobalValue());
						    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
						    html_utilities.html_markup(tm_control_vars.$client_name$.getDynamicValue(thread));
						    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
						}
						if (true) {
						    html_utilities.html_markup(html_macros.$html_image_border$.getGlobalValue());
						    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
						    html_utilities.html_markup(ZERO_INTEGER);
						    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
						}
						html_utilities.html_char(CHAR_greater, UNPROVIDED);
						{
						    SubLObject _prev_bind_0_79 = html_macros.$html_safe_print$.currentBinding(thread);
						    try {
							html_macros.$html_safe_print$.bind(T, thread);
						    } finally {
							html_macros.$html_safe_print$.rebind(_prev_bind_0_79, thread);
						    }
						}
						html_utilities.html_markup(html_macros.$html_image_tail$.getGlobalValue());
					    } finally {
						html_macros.$html_safe_print$.rebind(_prev_bind_0_78, thread);
					    }
					}
					html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
				    }
				    html_utilities.html_princ($$$Integrity_Check_Relation);
				    html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
				    html_utilities.html_markup(ONE_INTEGER);
				    html_utilities.html_char(CHAR_greater, UNPROVIDED);
				    tm_logging.tm_enqueue_event($$$Integrity_Check_Relation);
				    if (!(true && (NIL != tm_internals.privelegedP(tm_datastructures.$tm_user$.getDynamicValue(thread), $$$administrator)))) {
					html_utilities.html_princ($str_alt186$Sorry__you_do_not_have_permission);
				    } else {
					html_thesaurus.thesaurus_heading($str_alt226$tm_relation_integrity_check);
					html_utilities.html_markup(html_macros.$html_form_head$.getGlobalValue());
					html_utilities.html_markup(html_macros.$html_form_action$.getGlobalValue());
					html_utilities.html_char(CHAR_quotation, UNPROVIDED);
					html_utilities.html_markup(system_parameters.$cyc_cgi_program$.getDynamicValue(thread));
					html_utilities.html_char(CHAR_quotation, UNPROVIDED);
					if (NIL != html_macros.$html_form_method_post$.getGlobalValue()) {
					    html_utilities.html_markup(html_macros.$html_form_method$.getGlobalValue());
					    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
					    html_utilities.html_markup(html_macros.$html_form_method_post$.getGlobalValue());
					    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
					}
					html_utilities.html_char(CHAR_greater, UNPROVIDED);
					{
					    SubLObject _prev_bind_0_80 = html_macros.$html_safe_print$.currentBinding(thread);
					    SubLObject _prev_bind_1 = html_macros.$within_html_form$.currentBinding(thread);
					    SubLObject _prev_bind_2 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
					    try {
						html_macros.$html_safe_print$.bind(T, thread);
						html_macros.$within_html_form$.bind(T, thread);
						html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
						html_utilities.html_hidden_input($str_alt227$tm_handle_relation_integrity_chec, T, UNPROVIDED);
						tm_relation_integrity_check_guts(relation, arg_index);
						html_utilities.html_br();
						html_utilities.html_br();
						html_utilities.html_br();
						html_utilities.html_submit_input($$$Integrity_Check, $str_alt228$relation_check_action, UNPROVIDED);
						html_utilities.html_submit_input($str_alt229$Abort_Integrity_Check_and_Quit_Bo, $str_alt228$relation_check_action, UNPROVIDED);
						html_utilities.html_reset_input(UNPROVIDED);
						html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
					    } finally {
						html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_2, thread);
						html_macros.$within_html_form$.rebind(_prev_bind_1, thread);
						html_macros.$html_safe_print$.rebind(_prev_bind_0_80, thread);
					    }
					}
					html_utilities.html_markup(html_macros.$html_form_tail$.getGlobalValue());
				    }
				    html_thesaurus.tm_footer();
				    html_utilities.html_source_readability_terpri(UNPROVIDED);
				} finally {
				    html_macros.$html_safe_print$.rebind(_prev_bind_0_77, thread);
				}
			    }
			    html_utilities.html_markup(html_macros.$html_body_tail$.getGlobalValue());
			    html_utilities.html_source_readability_terpri(UNPROVIDED);
			} finally {
			    html_macros.$html_inside_bodyP$.rebind(_prev_bind_0, thread);
			}
		    }
		    html_utilities.html_markup(html_macros.$html_html_tail$.getGlobalValue());
		    html_utilities.html_source_readability_terpri(UNPROVIDED);
		}
	    }
	    return NIL;
	}
    }

    /**
     * Relation-Constant and Arg-Index controls what symbol is printed for the integrity check of
     * the thesaurus. Arg-index should be 1 or 2.  If it is not it is assumed to be 1.
     */
    public static final SubLObject tm_relation_integrity_check_guts(SubLObject relation_constant, SubLObject arg_index) {
	if (arg_index == UNPROVIDED) {
	    arg_index = ONE_INTEGER;
	}
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    {
		SubLObject empty_string = $str_alt2$;
		SubLObject relation_string = NIL;
		SubLObject relation_searches = tm_integrity.tm_relation_integrity_searches_in_progress();
		SubLObject relation_searches_needed = tm_integrity.tm_relation_integrity_searches_needed();
		SubLObject thesaurus_searches = tm_integrity.tm_integrity_searches_in_progress();
		if (NIL != relation_constant) {
		    if (NIL == forts.valid_fortP(relation_constant)) {
			return html_thesaurus.tm_error($str_alt231$Could_not_determine_a_constant__a, relation_constant, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
		    }
		    if (!(arg_index.eql(ONE_INTEGER) || arg_index.eql(TWO_INTEGER))) {
			arg_index = ONE_INTEGER;
		    }
		    relation_string = tm_internals.tm_pred_arg_symbol(relation_constant, arg_index);
		} else {
		    relation_string = empty_string;
		}
		if (!relation_string.isString()) {
		    return html_thesaurus.tm_error($str_alt232$Could_not_determine_a_relation_, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
		}
		html_utilities.html_markup(html_macros.$html_table_head$.getGlobalValue());
		if (true) {
		    html_utilities.html_markup(html_macros.$html_table_border$.getGlobalValue());
		    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
		    html_utilities.html_markup(ZERO_INTEGER);
		    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
		}
		html_utilities.html_char(CHAR_greater, UNPROVIDED);
		{
		    SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
		    try {
			html_macros.$html_safe_print$.bind(T, thread);
			{
			    SubLObject existing_search = makeBoolean((NIL != relation_constant) && (NIL != tm_integrity.integrity_check_in_progress_for_relationP(relation_constant)));
			    html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
			    html_utilities.html_char(CHAR_greater, UNPROVIDED);
			    {
				SubLObject _prev_bind_0_81 = html_macros.$html_safe_print$.currentBinding(thread);
				try {
				    html_macros.$html_safe_print$.bind(T, thread);
				    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
				    html_utilities.html_char(CHAR_greater, UNPROVIDED);
				    {
					SubLObject _prev_bind_0_82 = html_macros.$html_safe_print$.currentBinding(thread);
					try {
					    html_macros.$html_safe_print$.bind(T, thread);
					    html_utilities.html_radio_input($$$type, $$$new, makeBoolean(NIL == existing_search));
					} finally {
					    html_macros.$html_safe_print$.rebind(_prev_bind_0_82, thread);
					}
				    }
				    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
				    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
				    html_utilities.html_char(CHAR_greater, UNPROVIDED);
				    {
					SubLObject _prev_bind_0_83 = html_macros.$html_safe_print$.currentBinding(thread);
					try {
					    html_macros.$html_safe_print$.bind(T, thread);
					    html_utilities.html_princ($str_alt233$Start_a_New_Relation_Integrity_Ch);
					} finally {
					    html_macros.$html_safe_print$.rebind(_prev_bind_0_83, thread);
					}
				    }
				    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
				} finally {
				    html_macros.$html_safe_print$.rebind(_prev_bind_0_81, thread);
				}
			    }
			    html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
			    html_utilities.html_source_readability_terpri(UNPROVIDED);
			    html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
			    html_utilities.html_char(CHAR_greater, UNPROVIDED);
			    {
				SubLObject _prev_bind_0_84 = html_macros.$html_safe_print$.currentBinding(thread);
				try {
				    html_macros.$html_safe_print$.bind(T, thread);
				    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
				    html_utilities.html_char(CHAR_greater, UNPROVIDED);
				    {
					SubLObject _prev_bind_0_85 = html_macros.$html_safe_print$.currentBinding(thread);
					try {
					    html_macros.$html_safe_print$.bind(T, thread);
					    html_utilities.html_radio_input($$$type, $$$continue, existing_search);
					} finally {
					    html_macros.$html_safe_print$.rebind(_prev_bind_0_85, thread);
					}
				    }
				    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
				    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
				    html_utilities.html_char(CHAR_greater, UNPROVIDED);
				    {
					SubLObject _prev_bind_0_86 = html_macros.$html_safe_print$.currentBinding(thread);
					try {
					    html_macros.$html_safe_print$.bind(T, thread);
					    html_utilities.html_princ($str_alt234$Continue_Existing_Relation_Integr);
					} finally {
					    html_macros.$html_safe_print$.rebind(_prev_bind_0_86, thread);
					}
				    }
				    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
				} finally {
				    html_macros.$html_safe_print$.rebind(_prev_bind_0_84, thread);
				}
			    }
			    html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
			    html_utilities.html_source_readability_terpri(UNPROVIDED);
			    html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
			    html_utilities.html_char(CHAR_greater, UNPROVIDED);
			    {
				SubLObject _prev_bind_0_87 = html_macros.$html_safe_print$.currentBinding(thread);
				try {
				    html_macros.$html_safe_print$.bind(T, thread);
				    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
				    html_utilities.html_char(CHAR_greater, UNPROVIDED);
				    {
					SubLObject _prev_bind_0_88 = html_macros.$html_safe_print$.currentBinding(thread);
					try {
					    html_macros.$html_safe_print$.bind(T, thread);
					    html_utilities.html_br();
					} finally {
					    html_macros.$html_safe_print$.rebind(_prev_bind_0_88, thread);
					}
				    }
				    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
				} finally {
				    html_macros.$html_safe_print$.rebind(_prev_bind_0_87, thread);
				}
			    }
			    html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
			    html_utilities.html_source_readability_terpri(UNPROVIDED);
			    html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
			    html_utilities.html_char(CHAR_greater, UNPROVIDED);
			    {
				SubLObject _prev_bind_0_89 = html_macros.$html_safe_print$.currentBinding(thread);
				try {
				    html_macros.$html_safe_print$.bind(T, thread);
				    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
				    html_utilities.html_char(CHAR_greater, UNPROVIDED);
				    {
					SubLObject _prev_bind_0_90 = html_macros.$html_safe_print$.currentBinding(thread);
					try {
					    html_macros.$html_safe_print$.bind(T, thread);
					} finally {
					    html_macros.$html_safe_print$.rebind(_prev_bind_0_90, thread);
					}
				    }
				    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
				    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
				    html_utilities.html_char(CHAR_greater, UNPROVIDED);
				    {
					SubLObject _prev_bind_0_91 = html_macros.$html_safe_print$.currentBinding(thread);
					try {
					    html_macros.$html_safe_print$.bind(T, thread);
					    html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
					    html_utilities.html_princ($str_alt235$Choose_Relation_to_Check_);
					    html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
					} finally {
					    html_macros.$html_safe_print$.rebind(_prev_bind_0_91, thread);
					}
				    }
				    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
				} finally {
				    html_macros.$html_safe_print$.rebind(_prev_bind_0_89, thread);
				}
			    }
			    html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
			    html_utilities.html_source_readability_terpri(UNPROVIDED);
			    html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
			    html_utilities.html_char(CHAR_greater, UNPROVIDED);
			    {
				SubLObject _prev_bind_0_92 = html_macros.$html_safe_print$.currentBinding(thread);
				try {
				    html_macros.$html_safe_print$.bind(T, thread);
				    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
				    html_utilities.html_char(CHAR_greater, UNPROVIDED);
				    {
					SubLObject _prev_bind_0_93 = html_macros.$html_safe_print$.currentBinding(thread);
					try {
					    html_macros.$html_safe_print$.bind(T, thread);
					} finally {
					    html_macros.$html_safe_print$.rebind(_prev_bind_0_93, thread);
					}
				    }
				    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
				    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
				    html_utilities.html_char(CHAR_greater, UNPROVIDED);
				    {
					SubLObject _prev_bind_0_94 = html_macros.$html_safe_print$.currentBinding(thread);
					try {
					    html_macros.$html_safe_print$.bind(T, thread);
					    html_utilities.html_text_input($str_alt236$relation_to_check, relation_string, $int$50);
					} finally {
					    html_macros.$html_safe_print$.rebind(_prev_bind_0_94, thread);
					}
				    }
				    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
				} finally {
				    html_macros.$html_safe_print$.rebind(_prev_bind_0_92, thread);
				}
			    }
			    html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
			    html_utilities.html_source_readability_terpri(UNPROVIDED);
			}
		    } finally {
			html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
		    }
		}
		html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
		html_utilities.html_br();
		if ((NIL != thesaurus_searches) || (NIL != relation_searches)) {
		    html_utilities.html_br();
		    if (NIL != relation_searches) {
			html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
			html_utilities.html_princ($str_alt238$Relation_Integrity_Checks_in_Prog);
			html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
			html_utilities.html_br();
			{
			    SubLObject cdolist_list_var = relation_searches;
			    SubLObject relation = NIL;
			    for (relation = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), relation = cdolist_list_var.first()) {
				{
				    SubLObject relation_symbol = tm_internals.tm_pred_arg_symbol(relation, ONE_INTEGER);
				    SubLObject relation_inverse_symbol = tm_internals.tm_pred_arg_symbol(relation, TWO_INTEGER);
				    SubLObject v_search = tm_integrity.tm_relation_integrity_search(relation);
				    SubLObject percent = ZERO_INTEGER;
				    html_utilities.html_br();
				    html_utilities.html_princ($str_alt239$A_check_on_);
				    html_thesaurus.tm_link($RELATION, relation_symbol, UNPROVIDED, UNPROVIDED);
				    html_utilities.html_indent(UNPROVIDED);
				    if (NIL == kb_accessors.symmetric_predicateP(relation)) {
					html_utilities.html_princ($str_alt240$_and_its_inverse_);
					html_thesaurus.tm_link($RELATION, relation_inverse_symbol, UNPROVIDED, UNPROVIDED);
					html_utilities.html_indent(UNPROVIDED);
				    }
				    if (NIL != v_search) {
					{
					    SubLObject datum = search.search_state(v_search);
					    SubLObject current = datum;
					    SubLObject relation_95 = NIL;
					    SubLObject total = NIL;
					    SubLObject seen = NIL;
					    destructuring_bind_must_consp(current, datum, $list_alt241);
					    relation_95 = current.first();
					    current = current.rest();
					    destructuring_bind_must_consp(current, datum, $list_alt241);
					    total = current.first();
					    current = current.rest();
					    destructuring_bind_must_consp(current, datum, $list_alt241);
					    seen = current.first();
					    current = current.rest();
					    if (NIL == current) {
						percent = ceiling(multiply($int$100, divide(seen, total)), UNPROVIDED);
					    } else {
						cdestructuring_bind_error(datum, $list_alt241);
					    }
					}
				    }
				    format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt242$_is_being_performed_by__a_and_is_, tm_integrity.tm_relation_integrity_search_user(relation), percent);
				}
			    }
			}
		    } else {
			html_utilities.html_princ($str_alt243$There_are_no_);
			html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
			html_utilities.html_princ($$$relation);
			html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
			html_utilities.html_princ($str_alt245$_integrity_checks_in_progress_);
		    }
		    html_utilities.html_br();
		} else {
		    html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
		    html_utilities.html_princ($str_alt246$There_are_no_integrity_checks_in_);
		    html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
		}
		html_utilities.html_br();
		html_utilities.html_br();
		if (NIL != relation_searches_needed) {
		    html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
		    html_utilities.html_princ($str_alt247$Integrity_Checks_Needed_for_the_F);
		    html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
		    html_utilities.html_br();
		    {
			SubLObject cdolist_list_var = relation_searches_needed;
			SubLObject relation = NIL;
			for (relation = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), relation = cdolist_list_var.first()) {
			    {
				SubLObject relation_symbol = tm_internals.tm_pred_arg_symbol(relation, ONE_INTEGER);
				SubLObject relation_inverse_symbol = tm_internals.tm_pred_arg_symbol(relation, TWO_INTEGER);
				html_utilities.html_br();
				html_utilities.html_princ($str_alt239$A_check_on_);
				html_thesaurus.tm_link($RELATION, relation_symbol, UNPROVIDED, UNPROVIDED);
				if (NIL == kb_accessors.symmetric_predicateP(relation)) {
				    html_utilities.html_princ($str_alt240$_and_its_inverse_);
				    html_thesaurus.tm_link($RELATION, relation_inverse_symbol, UNPROVIDED, UNPROVIDED);
				}
				format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt248$_needs_to_be_performed_because_of, tm_integrity.tm_relation_integrity_search_user(relation));
			    }
			}
		    }
		} else {
		    html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
		    html_utilities.html_princ($str_alt249$There_are_no_relations_which_need);
		    html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
		}
		html_utilities.html_br();
	    }
	    return NIL;
	}
    }

    public static final SubLObject tm_handle_relation_integrity_check(SubLObject args) {
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    {
		SubLObject type = html_utilities.html_extract_input($$$type, args);
		SubLObject relation_name = string_utilities.reduce_whitespace(html_utilities.html_extract_input($str_alt236$relation_to_check, args));
		SubLObject action_type = html_utilities.html_extract_input($str_alt228$relation_check_action, args);
		SubLObject relation = NIL;
		SubLObject v_search = NIL;
		SubLObject thesauri = tm_internals.all_thesauri_sorted();
		if (NIL == tm_internals.privelegedP(tm_datastructures.$tm_user$.getDynamicValue(thread), $$$administrator)) {
		    return html_thesaurus.tm_error($str_alt250$You_do_not_have_the_access_level_, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
		}
		if (NIL == type) {
		    return html_thesaurus.tm_error($str_alt191$You_must_choose_either_to_start_a, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
		}
		if (action_type.equalp($$$Integrity_Check)) {
		    if (NIL == string_utilities.non_empty_stringP(relation_name)) {
			return html_thesaurus.tm_error($str_alt251$You_must_enter_a_relation_on_whic, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
		    }
		    relation = tm_internals.thesaurus_constant_from_abbreviation(relation_name);
		    if (NIL == tm_internals.thesaurus_predicateP(relation)) {
			return html_thesaurus.tm_error($str_alt252$Could_not_determine_a_valid_relat, relation_name, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
		    }
		    tm_datastructures.change_tm_value(tm_datastructures.$tm_user$.getDynamicValue(thread), $THESAURI, thesauri, UNPROVIDED);
		    if (type.equalp($$$new)) {
			v_search = tm_integrity.tm_new_relation_integrity_search(relation, $ALL);
			if (NIL == v_search) {
			    return html_thesaurus.tm_error($str_alt199$Implementation_error__Start_integ, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
			}
			tm_integrity.tm_update_state_relation_integrity_search(relation, v_search, $IN_PROGRESS, UNPROVIDED);
		    } else if (type.equalp($$$continue)) {
			v_search = tm_integrity.tm_relation_integrity_search(relation);
			if (NIL == v_search) {
			    return html_thesaurus.tm_error($str_alt255$No_integrity_check_is_in_progress, relation_name, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
			}
			tm_integrity.tm_update_state_relation_integrity_search(relation, v_search, $IN_PROGRESS, UNPROVIDED);
		    } else {
			return html_thesaurus.tm_error($str_alt201$Implementation_error___S_is_not_a, type, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
		    }

		    {
			SubLObject _prev_bind_0 = tm_integrity.$tm_unique_violation_hashes_index_object$.currentBinding(thread);
			try {
			    tm_integrity.$tm_unique_violation_hashes_index_object$.bind(relation, thread);
			    tm_do_relation_integrity_check(v_search);
			} finally {
			    tm_integrity.$tm_unique_violation_hashes_index_object$.rebind(_prev_bind_0, thread);
			}
		    }
		    return NIL;
		} else if (action_type.equalp($str_alt229$Abort_Integrity_Check_and_Quit_Bo)) {
		    if (NIL == string_utilities.non_empty_stringP(relation_name)) {
			html_tm_browsing.tm_browse_relations_entry(UNPROVIDED);
			return NIL;
		    }
		    relation = tm_internals.thesaurus_constant_from_abbreviation(relation_name);
		    if (NIL == tm_internals.thesaurus_predicateP(relation)) {
			return html_thesaurus.tm_error($str_alt252$Could_not_determine_a_valid_relat, relation_name, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
		    }
		    if (NIL != tm_integrity.integrity_check_needed_for_relationP(relation)) {
			tm_integrity.tm_clear_relation_integrity_search_needed(relation);
		    } else if (NIL != tm_integrity.integrity_check_in_progress_for_relationP(relation)) {
			tm_integrity.tm_clear_integrity_search(relation);
		    }

		    html_tm_browsing.tm_browse_relations_entry(UNPROVIDED);
		    return NIL;
		} else {
		    html_thesaurus.tm_error($str_alt256$Unrecognized_Action_Type_, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
		}

	    }
	    return NIL;
	}
    }

    public static final SubLObject tm_do_relation_integrity_check(SubLObject v_search) {
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    thread.resetMultipleValues();
	    {
		SubLObject violations = tm_integrity.tm_continue_integrity_search(v_search, UNPROVIDED, UNPROVIDED);
		SubLObject reason = thread.secondMultipleValue();
		thread.resetMultipleValues();
		{
		    SubLObject failedP = NIL;
		    SubLObject color_value = tm_datastructures.$tm_bg_color_default$.getDynamicValue(thread);
		    html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
		    html_utilities.html_markup(html_macros.$html_head_head$.getGlobalValue());
		    html_macros.html_head_content_type();
		    html_utilities.html_source_readability_terpri(UNPROVIDED);
		    html_utilities.html_markup(html_macros.$html_title_head$.getGlobalValue());
		    html_utilities.html_princ($$$Relation_Integrity_Check_Results);
		    html_utilities.html_markup(html_macros.$html_title_tail$.getGlobalValue());
		    html_utilities.html_markup(html_macros.$html_head_tail$.getGlobalValue());
		    html_utilities.html_source_readability_terpri(UNPROVIDED);
		    {
			SubLObject _prev_bind_0 = html_macros.$html_inside_bodyP$.currentBinding(thread);
			try {
			    html_macros.$html_inside_bodyP$.bind(T, thread);
			    html_utilities.html_markup(html_macros.$html_body_head$.getGlobalValue());
			    if (NIL != color_value) {
				html_utilities.html_markup(html_macros.$html_body_bgcolor$.getGlobalValue());
				html_utilities.html_char(CHAR_quotation, UNPROVIDED);
				html_utilities.html_markup(html_utilities.html_color(color_value));
				html_utilities.html_char(CHAR_quotation, UNPROVIDED);
			    }
			    html_utilities.html_char(CHAR_greater, UNPROVIDED);
			    {
				SubLObject _prev_bind_0_96 = html_macros.$html_safe_print$.currentBinding(thread);
				try {
				    html_macros.$html_safe_print$.bind(T, thread);
				    html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
				    html_utilities.html_markup(ONE_INTEGER);
				    html_utilities.html_char(CHAR_greater, UNPROVIDED);
				    if ((NIL != tm_control_vars.$client_thes_home_page$.getDynamicValue(thread)) && (NIL != tm_control_vars.$client_mini_logo$.getDynamicValue(thread))) {
					html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
					html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
					html_utilities.html_char(CHAR_quotation, UNPROVIDED);
					html_utilities.html_markup(tm_control_vars.$client_thes_home_page$.getDynamicValue(thread));
					html_utilities.html_char(CHAR_quotation, UNPROVIDED);
					html_utilities.html_char(CHAR_greater, UNPROVIDED);
					{
					    SubLObject _prev_bind_0_97 = html_macros.$html_safe_print$.currentBinding(thread);
					    try {
						html_macros.$html_safe_print$.bind(T, thread);
						html_utilities.html_markup(html_macros.$html_image_head$.getGlobalValue());
						html_utilities.html_markup(html_macros.$html_image_src$.getGlobalValue());
						html_utilities.html_char(CHAR_quotation, UNPROVIDED);
						html_utilities.html_markup(tm_control_vars.$client_mini_logo$.getDynamicValue(thread));
						html_utilities.html_char(CHAR_quotation, UNPROVIDED);
						if (NIL != tm_control_vars.$client_name$.getDynamicValue(thread)) {
						    html_utilities.html_markup(html_macros.$html_image_alt$.getGlobalValue());
						    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
						    html_utilities.html_markup(tm_control_vars.$client_name$.getDynamicValue(thread));
						    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
						}
						if (true) {
						    html_utilities.html_markup(html_macros.$html_image_border$.getGlobalValue());
						    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
						    html_utilities.html_markup(ZERO_INTEGER);
						    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
						}
						html_utilities.html_char(CHAR_greater, UNPROVIDED);
						{
						    SubLObject _prev_bind_0_98 = html_macros.$html_safe_print$.currentBinding(thread);
						    try {
							html_macros.$html_safe_print$.bind(T, thread);
						    } finally {
							html_macros.$html_safe_print$.rebind(_prev_bind_0_98, thread);
						    }
						}
						html_utilities.html_markup(html_macros.$html_image_tail$.getGlobalValue());
					    } finally {
						html_macros.$html_safe_print$.rebind(_prev_bind_0_97, thread);
					    }
					}
					html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
				    }
				    html_utilities.html_princ($$$Relation_Integrity_Check_Results);
				    html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
				    html_utilities.html_markup(ONE_INTEGER);
				    html_utilities.html_char(CHAR_greater, UNPROVIDED);
				    tm_logging.tm_enqueue_event($$$Relation_Integrity_Check_Results);
				    if (!(true && (NIL != tm_internals.privelegedP(tm_datastructures.$tm_user$.getDynamicValue(thread), $$$administrator)))) {
					html_utilities.html_princ($str_alt186$Sorry__you_do_not_have_permission);
				    } else {
					html_thesaurus.thesaurus_heading($str_alt259$tm_do_relation_integrity_check);
					html_utilities.html_princ($str_alt205$The_search_for_integrity_violatio);
					{
					    SubLObject pcase_var = reason;
					    if (pcase_var.eql($NUMBER)) {
						format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt207$the_default_number___A__of_violat, tm_integrity.$tm_integrity_number_cutoff$.getDynamicValue(thread));
					    } else if (pcase_var.eql($TIME)) {
						format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt209$it_timed_out_at__A_seconds_, tm_integrity.$tm_integrity_time_cutoff$.getDynamicValue(thread));
					    } else if (pcase_var.eql($EXHAUST)) {
						html_utilities.html_princ($str_alt260$all_relation_uses_have_been_searc);
					    } else {
						failedP = T;
						format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt212$of_an_unknown_halt_reason__A, reason);
					    }

					}
					if (NIL == failedP) {
					    html_utilities.html_hr(UNPROVIDED, UNPROVIDED);
					    {
						SubLObject choices_to_makeP = NIL;
						if (NIL == violations) {
						    html_utilities.html_princ($str_alt213$No_integrity_violations_were_foun);
						    html_utilities.html_br();
						} else {
						    html_utilities.html_markup(html_macros.$html_form_head$.getGlobalValue());
						    html_utilities.html_markup(html_macros.$html_form_action$.getGlobalValue());
						    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
						    html_utilities.html_markup(system_parameters.$cyc_cgi_program$.getDynamicValue(thread));
						    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
						    if (NIL != html_macros.$html_form_method_post$.getGlobalValue()) {
							html_utilities.html_markup(html_macros.$html_form_method$.getGlobalValue());
							html_utilities.html_char(CHAR_quotation, UNPROVIDED);
							html_utilities.html_markup(html_macros.$html_form_method_post$.getGlobalValue());
							html_utilities.html_char(CHAR_quotation, UNPROVIDED);
						    }
						    html_utilities.html_char(CHAR_greater, UNPROVIDED);
						    {
							SubLObject _prev_bind_0_99 = html_macros.$html_safe_print$.currentBinding(thread);
							SubLObject _prev_bind_1 = html_macros.$within_html_form$.currentBinding(thread);
							SubLObject _prev_bind_2 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
							try {
							    html_macros.$html_safe_print$.bind(T, thread);
							    html_macros.$within_html_form$.bind(T, thread);
							    html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
							    html_utilities.html_hidden_input($str_alt261$tm_handle_do_relation_integrity_c, T, UNPROVIDED);
							    {
								SubLObject violation_number = ZERO_INTEGER;
								html_utilities.html_hidden_input($str_alt126$number_of_violations, length(violations), UNPROVIDED);
								html_utilities.html_hidden_input($$$index, cb_utilities.cb_fort_identifier(tm_integrity.$tm_unique_violation_hashes_index_object$.getDynamicValue(thread)), UNPROVIDED);
								html_utilities.html_princ($str_alt215$For_each_of_the_outstanding_viola);
								html_utilities.html_br();
								html_utilities.html_markup(html_macros.$html_unordered_list_head$.getGlobalValue());
								html_utilities.html_char(CHAR_greater, UNPROVIDED);
								{
								    SubLObject _prev_bind_0_100 = html_macros.$html_safe_print$.currentBinding(thread);
								    try {
									html_macros.$html_safe_print$.bind(T, thread);
									{
									    SubLObject cdolist_list_var = violations;
									    SubLObject violation = NIL;
									    for (violation = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), violation = cdolist_list_var.first()) {
										violation_number = add(violation_number, ONE_INTEGER);
										html_utilities.html_markup(html_macros.$html_list_item_head$.getGlobalValue());
										html_utilities.html_char(CHAR_greater, UNPROVIDED);
										{
										    SubLObject _prev_bind_0_101 = html_macros.$html_safe_print$.currentBinding(thread);
										    try {
											html_macros.$html_safe_print$.bind(T, thread);
											if (NIL != tm_fix_or_print_one_violation(violation, violation_number)) {
											    choices_to_makeP = T;
											}
										    } finally {
											html_macros.$html_safe_print$.rebind(_prev_bind_0_101, thread);
										    }
										}
										html_utilities.html_markup(html_macros.$html_list_item_tail$.getGlobalValue());
									    }
									}
								    } finally {
									html_macros.$html_safe_print$.rebind(_prev_bind_0_100, thread);
								    }
								}
								html_utilities.html_markup(html_macros.$html_unordered_list_tail$.getGlobalValue());
								if (NIL != choices_to_makeP) {
								    html_utilities.html_br();
								    html_utilities.html_submit_input($$$Perform_Selected_Fixes, UNPROVIDED, UNPROVIDED);
								    html_utilities.html_reset_input(UNPROVIDED);
								}
							    }
							    html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
							} finally {
							    html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_2, thread);
							    html_macros.$within_html_form$.rebind(_prev_bind_1, thread);
							    html_macros.$html_safe_print$.rebind(_prev_bind_0_99, thread);
							}
						    }
						    html_utilities.html_markup(html_macros.$html_form_tail$.getGlobalValue());
						}
						if (NIL == choices_to_makeP) {
						    html_utilities.html_markup(html_macros.$html_form_head$.getGlobalValue());
						    html_utilities.html_markup(html_macros.$html_form_action$.getGlobalValue());
						    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
						    html_utilities.html_markup(system_parameters.$cyc_cgi_program$.getDynamicValue(thread));
						    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
						    if (NIL != html_macros.$html_form_method_post$.getGlobalValue()) {
							html_utilities.html_markup(html_macros.$html_form_method$.getGlobalValue());
							html_utilities.html_char(CHAR_quotation, UNPROVIDED);
							html_utilities.html_markup(html_macros.$html_form_method_post$.getGlobalValue());
							html_utilities.html_char(CHAR_quotation, UNPROVIDED);
						    }
						    html_utilities.html_char(CHAR_greater, UNPROVIDED);
						    {
							SubLObject _prev_bind_0_102 = html_macros.$html_safe_print$.currentBinding(thread);
							SubLObject _prev_bind_1 = html_macros.$within_html_form$.currentBinding(thread);
							SubLObject _prev_bind_2 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
							try {
							    html_macros.$html_safe_print$.bind(T, thread);
							    html_macros.$within_html_form$.bind(T, thread);
							    html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
							    html_utilities.html_hidden_input($str_alt227$tm_handle_relation_integrity_chec, T, UNPROVIDED);
							    html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
							    html_utilities.html_princ($str_alt216$If_you_wish_to_continue_checking_);
							    html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
							    html_utilities.html_br();
							    tm_relation_integrity_check_guts(get_default_integrity_check_relation(UNPROVIDED), UNPROVIDED);
							    html_utilities.html_br();
							    html_utilities.html_submit_input($$$Integrity_Check, $str_alt228$relation_check_action, UNPROVIDED);
							    html_utilities.html_submit_input($str_alt229$Abort_Integrity_Check_and_Quit_Bo, $str_alt228$relation_check_action, UNPROVIDED);
							    html_utilities.html_reset_input(UNPROVIDED);
							    html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
							} finally {
							    html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_2, thread);
							    html_macros.$within_html_form$.rebind(_prev_bind_1, thread);
							    html_macros.$html_safe_print$.rebind(_prev_bind_0_102, thread);
							}
						    }
						    html_utilities.html_markup(html_macros.$html_form_tail$.getGlobalValue());
						}
					    }
					}
				    }
				    html_thesaurus.tm_footer();
				    html_utilities.html_source_readability_terpri(UNPROVIDED);
				} finally {
				    html_macros.$html_safe_print$.rebind(_prev_bind_0_96, thread);
				}
			    }
			    html_utilities.html_markup(html_macros.$html_body_tail$.getGlobalValue());
			    html_utilities.html_source_readability_terpri(UNPROVIDED);
			} finally {
			    html_macros.$html_inside_bodyP$.rebind(_prev_bind_0, thread);
			}
		    }
		    html_utilities.html_markup(html_macros.$html_html_tail$.getGlobalValue());
		    html_utilities.html_source_readability_terpri(UNPROVIDED);
		}
	    }
	    return NIL;
	}
    }

    public static final SubLObject tm_handle_do_relation_integrity_check(SubLObject args) {
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    {
		SubLObject index_object = html_thesaurus.tm_guess_fort(read_from_string_ignoring_errors(html_utilities.html_extract_input($$$index, args), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
		{
		    SubLObject _prev_bind_0 = tm_integrity.$tm_unique_violation_hashes_index_object$.currentBinding(thread);
		    try {
			tm_integrity.$tm_unique_violation_hashes_index_object$.bind(index_object, thread);
			thread.resetMultipleValues();
			{
			    SubLObject fixed_violations = tm_handle_and_perform_user_fixes(args);
			    SubLObject outstanding_violations = thread.secondMultipleValue();
			    thread.resetMultipleValues();
			    {
				SubLObject color_value = tm_datastructures.$tm_bg_color_default$.getDynamicValue(thread);
				html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
				html_utilities.html_markup(html_macros.$html_head_head$.getGlobalValue());
				html_macros.html_head_content_type();
				html_utilities.html_source_readability_terpri(UNPROVIDED);
				html_utilities.html_markup(html_macros.$html_title_head$.getGlobalValue());
				html_utilities.html_princ($str_alt263$Integrity_Check_Relation_Fix_Resu);
				html_utilities.html_markup(html_macros.$html_title_tail$.getGlobalValue());
				html_utilities.html_markup(html_macros.$html_head_tail$.getGlobalValue());
				html_utilities.html_source_readability_terpri(UNPROVIDED);
				{
				    SubLObject _prev_bind_0_103 = html_macros.$html_inside_bodyP$.currentBinding(thread);
				    try {
					html_macros.$html_inside_bodyP$.bind(T, thread);
					html_utilities.html_markup(html_macros.$html_body_head$.getGlobalValue());
					if (NIL != color_value) {
					    html_utilities.html_markup(html_macros.$html_body_bgcolor$.getGlobalValue());
					    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
					    html_utilities.html_markup(html_utilities.html_color(color_value));
					    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
					}
					html_utilities.html_char(CHAR_greater, UNPROVIDED);
					{
					    SubLObject _prev_bind_0_104 = html_macros.$html_safe_print$.currentBinding(thread);
					    try {
						html_macros.$html_safe_print$.bind(T, thread);
						html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
						html_utilities.html_markup(ONE_INTEGER);
						html_utilities.html_char(CHAR_greater, UNPROVIDED);
						if ((NIL != tm_control_vars.$client_thes_home_page$.getDynamicValue(thread)) && (NIL != tm_control_vars.$client_mini_logo$.getDynamicValue(thread))) {
						    html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
						    html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
						    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
						    html_utilities.html_markup(tm_control_vars.$client_thes_home_page$.getDynamicValue(thread));
						    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
						    html_utilities.html_char(CHAR_greater, UNPROVIDED);
						    {
							SubLObject _prev_bind_0_105 = html_macros.$html_safe_print$.currentBinding(thread);
							try {
							    html_macros.$html_safe_print$.bind(T, thread);
							    html_utilities.html_markup(html_macros.$html_image_head$.getGlobalValue());
							    html_utilities.html_markup(html_macros.$html_image_src$.getGlobalValue());
							    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
							    html_utilities.html_markup(tm_control_vars.$client_mini_logo$.getDynamicValue(thread));
							    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
							    if (NIL != tm_control_vars.$client_name$.getDynamicValue(thread)) {
								html_utilities.html_markup(html_macros.$html_image_alt$.getGlobalValue());
								html_utilities.html_char(CHAR_quotation, UNPROVIDED);
								html_utilities.html_markup(tm_control_vars.$client_name$.getDynamicValue(thread));
								html_utilities.html_char(CHAR_quotation, UNPROVIDED);
							    }
							    if (true) {
								html_utilities.html_markup(html_macros.$html_image_border$.getGlobalValue());
								html_utilities.html_char(CHAR_quotation, UNPROVIDED);
								html_utilities.html_markup(ZERO_INTEGER);
								html_utilities.html_char(CHAR_quotation, UNPROVIDED);
							    }
							    html_utilities.html_char(CHAR_greater, UNPROVIDED);
							    {
								SubLObject _prev_bind_0_106 = html_macros.$html_safe_print$.currentBinding(thread);
								try {
								    html_macros.$html_safe_print$.bind(T, thread);
								} finally {
								    html_macros.$html_safe_print$.rebind(_prev_bind_0_106, thread);
								}
							    }
							    html_utilities.html_markup(html_macros.$html_image_tail$.getGlobalValue());
							} finally {
							    html_macros.$html_safe_print$.rebind(_prev_bind_0_105, thread);
							}
						    }
						    html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
						}
						html_utilities.html_princ($str_alt263$Integrity_Check_Relation_Fix_Resu);
						html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
						html_utilities.html_markup(ONE_INTEGER);
						html_utilities.html_char(CHAR_greater, UNPROVIDED);
						tm_logging.tm_enqueue_event($str_alt263$Integrity_Check_Relation_Fix_Resu);
						html_thesaurus.thesaurus_heading($str_alt261$tm_handle_do_relation_integrity_c);
						tm_present_integrity_outcome(fixed_violations, outstanding_violations);
						html_utilities.html_hr(UNPROVIDED, UNPROVIDED);
						html_utilities.html_princ($str_alt218$If_you_wish_to_continue_integrity);
						html_utilities.html_markup(html_macros.$html_form_head$.getGlobalValue());
						html_utilities.html_markup(html_macros.$html_form_action$.getGlobalValue());
						html_utilities.html_char(CHAR_quotation, UNPROVIDED);
						html_utilities.html_markup(system_parameters.$cyc_cgi_program$.getDynamicValue(thread));
						html_utilities.html_char(CHAR_quotation, UNPROVIDED);
						if (NIL != html_macros.$html_form_method_post$.getGlobalValue()) {
						    html_utilities.html_markup(html_macros.$html_form_method$.getGlobalValue());
						    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
						    html_utilities.html_markup(html_macros.$html_form_method_post$.getGlobalValue());
						    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
						}
						html_utilities.html_char(CHAR_greater, UNPROVIDED);
						{
						    SubLObject _prev_bind_0_107 = html_macros.$html_safe_print$.currentBinding(thread);
						    SubLObject _prev_bind_1 = html_macros.$within_html_form$.currentBinding(thread);
						    SubLObject _prev_bind_2 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
						    try {
							html_macros.$html_safe_print$.bind(T, thread);
							html_macros.$within_html_form$.bind(T, thread);
							html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
							html_utilities.html_hidden_input($str_alt227$tm_handle_relation_integrity_chec, T, UNPROVIDED);
							html_utilities.html_br();
							tm_relation_integrity_check_guts(get_default_integrity_check_relation(UNPROVIDED), UNPROVIDED);
							html_utilities.html_br();
							html_utilities.html_submit_input($$$Integrity_Check, $str_alt228$relation_check_action, UNPROVIDED);
							html_utilities.html_submit_input($str_alt229$Abort_Integrity_Check_and_Quit_Bo, $str_alt228$relation_check_action, UNPROVIDED);
							html_utilities.html_reset_input(UNPROVIDED);
							html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
						    } finally {
							html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_2, thread);
							html_macros.$within_html_form$.rebind(_prev_bind_1, thread);
							html_macros.$html_safe_print$.rebind(_prev_bind_0_107, thread);
						    }
						}
						html_utilities.html_markup(html_macros.$html_form_tail$.getGlobalValue());
						html_thesaurus.tm_footer();
						html_utilities.html_source_readability_terpri(UNPROVIDED);
					    } finally {
						html_macros.$html_safe_print$.rebind(_prev_bind_0_104, thread);
					    }
					}
					html_utilities.html_markup(html_macros.$html_body_tail$.getGlobalValue());
					html_utilities.html_source_readability_terpri(UNPROVIDED);
				    } finally {
					html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_103, thread);
				    }
				}
				html_utilities.html_markup(html_macros.$html_html_tail$.getGlobalValue());
				html_utilities.html_source_readability_terpri(UNPROVIDED);
			    }
			}
		    } finally {
			tm_integrity.$tm_unique_violation_hashes_index_object$.rebind(_prev_bind_0, thread);
		    }
		}
	    }
	    return NIL;
	}
    }

    /**
     * Prints a message that a relation integrity check is needed for relation.
     * It is assumed that relation has an entry in the list of tm relation
     * integrity checks.  index should be one or two and controls if the relation
     * symbol or inverse symbol is brought up in the integrity checker.
     */
    public static final SubLObject tm_message_integrity_check_needed_for_relation(SubLObject relation, SubLObject index) {
	if (index == UNPROVIDED) {
	    index = ONE_INTEGER;
	}
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    SubLTrampolineFile.checkType(relation, $sym265$THESAURUS_PREDICATE_);
	    {
		SubLObject arg_index = (index.eql(ONE_INTEGER) || index.eql(TWO_INTEGER)) ? ((SubLObject) (index)) : ONE_INTEGER;
		SubLObject inv_index = (arg_index.eql(ONE_INTEGER)) ? ((SubLObject) (TWO_INTEGER)) : ONE_INTEGER;
		SubLObject relation_symbol = tm_internals.tm_pred_arg_symbol(relation, arg_index);
		SubLObject relation_inverse_symbol = tm_internals.tm_pred_arg_symbol(relation, inv_index);
		html_utilities.html_br();
		html_utilities.html_princ($str_alt239$A_check_on_);
		html_thesaurus.tm_link($RELATION, relation_symbol, UNPROVIDED, UNPROVIDED);
		if (NIL == kb_accessors.symmetric_predicateP(relation)) {
		    html_utilities.html_princ($str_alt240$_and_its_inverse_);
		    html_thesaurus.tm_link($RELATION, relation_inverse_symbol, UNPROVIDED, UNPROVIDED);
		}
		format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt248$_needs_to_be_performed_because_of, tm_integrity.tm_relation_integrity_search_user(relation));
		html_utilities.html_br();
		html_utilities.html_princ($str_alt266$To_go_to_the_page_to_start_an_int);
		html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
		html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
		html_utilities.html_char(CHAR_quotation, UNPROVIDED);
		format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt267$_A_, system_parameters.$cyc_cgi_program$.getDynamicValue(thread));
		format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt268$tm_relation_integrity_check_rel__, cb_utilities.cb_fort_identifier(relation), arg_index);
		html_utilities.html_char(CHAR_quotation, UNPROVIDED);
		html_utilities.html_char(CHAR_greater, UNPROVIDED);
		{
		    SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
		    try {
			html_macros.$html_safe_print$.bind(T, thread);
			html_utilities.html_princ($str_alt269$here_);
		    } finally {
			html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
		    }
		}
		html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
	    }
	    return NIL;
	}
    }

    /**
     * Prints a message that a relation integrity check is in progress for relation.
     * It is assumed that relation has an entry in the list of tm relation
     * integrity checks.  index should be one or two and controls if the relation
     * symbol or inverse symbol is brought up in the integrity checker.
     */
    public static final SubLObject tm_message_integrity_check_in_progress_for_relation(SubLObject relation, SubLObject index) {
	if (index == UNPROVIDED) {
	    index = ONE_INTEGER;
	}
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    SubLTrampolineFile.checkType(relation, $sym265$THESAURUS_PREDICATE_);
	    {
		SubLObject arg_index = (index.eql(ONE_INTEGER) || index.eql(TWO_INTEGER)) ? ((SubLObject) (index)) : ONE_INTEGER;
		SubLObject inv_index = (arg_index.eql(ONE_INTEGER)) ? ((SubLObject) (TWO_INTEGER)) : ONE_INTEGER;
		SubLObject relation_symbol = tm_internals.tm_pred_arg_symbol(relation, arg_index);
		SubLObject relation_inverse_symbol = tm_internals.tm_pred_arg_symbol(relation, inv_index);
		SubLObject percent = ZERO_INTEGER;
		SubLObject v_search = tm_integrity.tm_relation_integrity_search(relation);
		html_utilities.html_br();
		html_utilities.html_princ($str_alt239$A_check_on_);
		html_thesaurus.tm_link($RELATION, relation_symbol, UNPROVIDED, UNPROVIDED);
		if (NIL == kb_accessors.symmetric_predicateP(relation)) {
		    html_utilities.html_princ($str_alt240$_and_its_inverse_);
		    html_thesaurus.tm_link($RELATION, relation_inverse_symbol, UNPROVIDED, UNPROVIDED);
		}
		if (NIL != v_search) {
		    {
			SubLObject datum = search.search_state(v_search);
			SubLObject current = datum;
			SubLObject relation_108 = NIL;
			SubLObject total = NIL;
			SubLObject seen = NIL;
			destructuring_bind_must_consp(current, datum, $list_alt241);
			relation_108 = current.first();
			current = current.rest();
			destructuring_bind_must_consp(current, datum, $list_alt241);
			total = current.first();
			current = current.rest();
			destructuring_bind_must_consp(current, datum, $list_alt241);
			seen = current.first();
			current = current.rest();
			if (NIL == current) {
			    percent = ceiling(multiply($int$100, divide(seen, total)), UNPROVIDED);
			} else {
			    cdestructuring_bind_error(datum, $list_alt241);
			}
		    }
		}
		format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt242$_is_being_performed_by__a_and_is_, tm_integrity.tm_relation_integrity_search_user(relation), percent);
		html_utilities.html_br();
		html_utilities.html_princ($str_alt270$To_go_to_the_relation_integrity_c);
		html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
		html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
		html_utilities.html_char(CHAR_quotation, UNPROVIDED);
		format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt267$_A_, system_parameters.$cyc_cgi_program$.getDynamicValue(thread));
		format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt268$tm_relation_integrity_check_rel__, cb_utilities.cb_fort_identifier(relation), arg_index);
		html_utilities.html_char(CHAR_quotation, UNPROVIDED);
		html_utilities.html_char(CHAR_greater, UNPROVIDED);
		{
		    SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
		    try {
			html_macros.$html_safe_print$.bind(T, thread);
			html_utilities.html_princ($str_alt269$here_);
		    } finally {
			html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
		    }
		}
		html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
	    }
	    return NIL;
	}
    }

    public static final SubLObject get_default_integrity_check_relation(SubLObject user) {
	if (user == UNPROVIDED) {
	    user = tm_datastructures.$tm_user$.getDynamicValue();
	}
	{
	    SubLObject needed = NIL;
	    SubLObject in_progress = NIL;
	    SubLObject v_default = NIL;
	    in_progress = tm_integrity.tm_relation_integrity_searches_in_progress();
	    if (NIL == v_default) {
		{
		    SubLObject csome_list_var = in_progress;
		    SubLObject relation = NIL;
		    for (relation = csome_list_var.first(); !((NIL != v_default) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest(), relation = csome_list_var.first()) {
			if (user.equalp(tm_integrity.tm_relation_integrity_search_user(relation))) {
			    v_default = relation;
			}
		    }
		}
	    }
	    if (NIL == v_default) {
		needed = tm_integrity.tm_relation_integrity_searches_needed();
		if (NIL == v_default) {
		    {
			SubLObject csome_list_var = needed;
			SubLObject relation = NIL;
			for (relation = csome_list_var.first(); !((NIL != v_default) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest(), relation = csome_list_var.first()) {
			    if (user.equalp(tm_integrity.tm_relation_integrity_search_user(relation))) {
				v_default = relation;
			    }
			}
		    }
		}
	    }
	    if (NIL == v_default) {
		v_default = needed.first();
	    }
	    return v_default;
	}
    }

    public static final SubLObject tm_integrity_check_concept_chooser(SubLObject args) {
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    {
		SubLObject color_value = tm_datastructures.$tm_bg_color_default$.getDynamicValue(thread);
		html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
		html_utilities.html_markup(html_macros.$html_head_head$.getGlobalValue());
		html_macros.html_head_content_type();
		html_utilities.html_source_readability_terpri(UNPROVIDED);
		html_utilities.html_markup(html_macros.$html_title_head$.getGlobalValue());
		html_utilities.html_princ($$$Integrity_Check_Term);
		html_utilities.html_markup(html_macros.$html_title_tail$.getGlobalValue());
		html_utilities.html_markup(html_macros.$html_head_tail$.getGlobalValue());
		html_utilities.html_source_readability_terpri(UNPROVIDED);
		{
		    SubLObject _prev_bind_0 = html_macros.$html_inside_bodyP$.currentBinding(thread);
		    try {
			html_macros.$html_inside_bodyP$.bind(T, thread);
			html_utilities.html_markup(html_macros.$html_body_head$.getGlobalValue());
			if (NIL != color_value) {
			    html_utilities.html_markup(html_macros.$html_body_bgcolor$.getGlobalValue());
			    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
			    html_utilities.html_markup(html_utilities.html_color(color_value));
			    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
			}
			html_utilities.html_char(CHAR_greater, UNPROVIDED);
			{
			    SubLObject _prev_bind_0_109 = html_macros.$html_safe_print$.currentBinding(thread);
			    try {
				html_macros.$html_safe_print$.bind(T, thread);
				html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
				html_utilities.html_markup(ONE_INTEGER);
				html_utilities.html_char(CHAR_greater, UNPROVIDED);
				if ((NIL != tm_control_vars.$client_thes_home_page$.getDynamicValue(thread)) && (NIL != tm_control_vars.$client_mini_logo$.getDynamicValue(thread))) {
				    html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
				    html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
				    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
				    html_utilities.html_markup(tm_control_vars.$client_thes_home_page$.getDynamicValue(thread));
				    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
				    html_utilities.html_char(CHAR_greater, UNPROVIDED);
				    {
					SubLObject _prev_bind_0_110 = html_macros.$html_safe_print$.currentBinding(thread);
					try {
					    html_macros.$html_safe_print$.bind(T, thread);
					    html_utilities.html_markup(html_macros.$html_image_head$.getGlobalValue());
					    html_utilities.html_markup(html_macros.$html_image_src$.getGlobalValue());
					    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
					    html_utilities.html_markup(tm_control_vars.$client_mini_logo$.getDynamicValue(thread));
					    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
					    if (NIL != tm_control_vars.$client_name$.getDynamicValue(thread)) {
						html_utilities.html_markup(html_macros.$html_image_alt$.getGlobalValue());
						html_utilities.html_char(CHAR_quotation, UNPROVIDED);
						html_utilities.html_markup(tm_control_vars.$client_name$.getDynamicValue(thread));
						html_utilities.html_char(CHAR_quotation, UNPROVIDED);
					    }
					    if (true) {
						html_utilities.html_markup(html_macros.$html_image_border$.getGlobalValue());
						html_utilities.html_char(CHAR_quotation, UNPROVIDED);
						html_utilities.html_markup(ZERO_INTEGER);
						html_utilities.html_char(CHAR_quotation, UNPROVIDED);
					    }
					    html_utilities.html_char(CHAR_greater, UNPROVIDED);
					    {
						SubLObject _prev_bind_0_111 = html_macros.$html_safe_print$.currentBinding(thread);
						try {
						    html_macros.$html_safe_print$.bind(T, thread);
						} finally {
						    html_macros.$html_safe_print$.rebind(_prev_bind_0_111, thread);
						}
					    }
					    html_utilities.html_markup(html_macros.$html_image_tail$.getGlobalValue());
					} finally {
					    html_macros.$html_safe_print$.rebind(_prev_bind_0_110, thread);
					}
				    }
				    html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
				}
				html_utilities.html_princ($$$Integrity_Check_Term);
				html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
				html_utilities.html_markup(ONE_INTEGER);
				html_utilities.html_char(CHAR_greater, UNPROVIDED);
				tm_logging.tm_enqueue_event($$$Integrity_Check_Term);
				if (!(true && (NIL != tm_internals.privelegedP(tm_datastructures.$tm_user$.getDynamicValue(thread), $$$administrator)))) {
				    html_utilities.html_princ($str_alt186$Sorry__you_do_not_have_permission);
				} else {
				    html_thesaurus.thesaurus_heading($str_alt272$tm_integrity_check_concept_choose);
				    html_utilities.html_markup(html_macros.$html_form_head$.getGlobalValue());
				    html_utilities.html_markup(html_macros.$html_form_action$.getGlobalValue());
				    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
				    html_utilities.html_markup(system_parameters.$cyc_cgi_program$.getDynamicValue(thread));
				    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
				    if (NIL != html_macros.$html_form_method_post$.getGlobalValue()) {
					html_utilities.html_markup(html_macros.$html_form_method$.getGlobalValue());
					html_utilities.html_char(CHAR_quotation, UNPROVIDED);
					html_utilities.html_markup(html_macros.$html_form_method_post$.getGlobalValue());
					html_utilities.html_char(CHAR_quotation, UNPROVIDED);
				    }
				    html_utilities.html_char(CHAR_greater, UNPROVIDED);
				    {
					SubLObject _prev_bind_0_112 = html_macros.$html_safe_print$.currentBinding(thread);
					SubLObject _prev_bind_1 = html_macros.$within_html_form$.currentBinding(thread);
					SubLObject _prev_bind_2 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
					try {
					    html_macros.$html_safe_print$.bind(T, thread);
					    html_macros.$within_html_form$.bind(T, thread);
					    html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
					    html_utilities.html_hidden_input($str_alt273$tm_integrity_check_concept_choose, T, UNPROVIDED);
					    html_utilities.html_princ($str_alt274$Enter_a_term_and_thesaurus_to_ide);
					    html_utilities.html_br();
					    {
						SubLObject v_term = tm_datastructures.tm_value(tm_datastructures.$tm_user$.getDynamicValue(thread), $TERM);
						SubLObject string_to_show = (NIL != v_term) ? ((SubLObject) (tm_internals.tm_string_for_constant(v_term, NIL, NIL, T))) : $str_alt2$;
						SubLObject length = max($int$40, length(string_to_show));
						html_utilities.html_text_input($$$string, string_to_show, length);
					    }
					    html_utilities.html_br();
					    html_thesaurus.tm_edit_thesaurus_selection(NIL, NIL, $$$thesaurus, T);
					    html_utilities.html_br();
					    html_utilities.html_submit_input($$$Check, UNPROVIDED, UNPROVIDED);
					    html_utilities.html_reset_input(UNPROVIDED);
					    html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
					} finally {
					    html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_2, thread);
					    html_macros.$within_html_form$.rebind(_prev_bind_1, thread);
					    html_macros.$html_safe_print$.rebind(_prev_bind_0_112, thread);
					}
				    }
				    html_utilities.html_markup(html_macros.$html_form_tail$.getGlobalValue());
				}
				html_thesaurus.tm_footer();
				html_utilities.html_source_readability_terpri(UNPROVIDED);
			    } finally {
				html_macros.$html_safe_print$.rebind(_prev_bind_0_109, thread);
			    }
			}
			html_utilities.html_markup(html_macros.$html_body_tail$.getGlobalValue());
			html_utilities.html_source_readability_terpri(UNPROVIDED);
		    } finally {
			html_macros.$html_inside_bodyP$.rebind(_prev_bind_0, thread);
		    }
		}
		html_utilities.html_markup(html_macros.$html_html_tail$.getGlobalValue());
		html_utilities.html_source_readability_terpri(UNPROVIDED);
	    }
	    return NIL;
	}
    }

    public static final SubLObject tm_integrity_check_concept_chooser_handler(SubLObject args) {
	{
	    SubLObject string = html_utilities.html_extract_input($$$string, args);
	    SubLObject thesaurus_name = html_utilities.html_extract_input($$$thesaurus, args);
	    SubLObject thesaurus = NIL;
	    if (NIL == string) {
		return html_thesaurus.tm_error($str_alt279$You_must_enter_a_term_to_integrit, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
	    }
	    string = tm_internals.canonicalize_lexical_term(string);
	    if (string.equalp($str_alt2$)) {
		return html_thesaurus.tm_error($str_alt280$You_must_enter_a_non_empty_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
	    }
	    {
		SubLObject signs = tm_lexical_index.lexpred_signs_all_thesauri(string, $$preferredTerm);
		SubLObject concept = NIL;
		if (NIL != list_utilities.singletonP(signs)) {
		    concept = tm_datastructures.sign_concept(signs.first());
		} else {
		    if (NIL == thesaurus_name) {
			return html_thesaurus.tm_error($str_alt281$You_must_choose_a_thesaurus_to_un, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
		    }
		    thesaurus = tm_internals.thesaurus_constant_from_name(thesaurus_name);
		    if (NIL == tm_internals.thesaurusP(thesaurus)) {
			return html_thesaurus.tm_error($str_alt282$Could_not_determine_a_valid_thesa, thesaurus_name, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
		    }
		    {
			SubLObject sign = tm_lexical_index.lexpred_signs_in_thesaurus(string, $$preferredTerm, thesaurus).first();
			if (NIL == tm_datastructures.signp(sign)) {
			    return html_thesaurus.tm_error($str_alt283$_S_is_not_a_term_in__A, string, thesaurus_name, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
			}
			concept = tm_datastructures.sign_concept(sign);
		    }
		}
		tm_integrity_check_concept_page(list(cb_utilities.cb_fort_identifier(concept)));
	    }
	}
	return NIL;
    }

    public static final SubLObject tm_integrity_check_concept_page(SubLObject args) {
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    {
		SubLObject id = args.first();
		SubLObject thesauri = tm_datastructures.tm_value(tm_datastructures.$tm_user$.getDynamicValue(thread), $EDIT_THESAURI);
		SubLObject concept = NIL;
		SubLObject violations = NIL;
		SubLObject choices_to_makeP = NIL;
		if (NIL == cb_utilities.cb_valid_fort_identifierP(id)) {
		    return html_thesaurus.tm_error($str_alt286$Implementation_error__id__A_is_no, id, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
		}
		concept = html_thesaurus.tm_guess_fort(id);
		if (NIL == forts.valid_fortP(concept)) {
		    return html_thesaurus.tm_error($str_alt287$No_concept_found_by_id__A___Perha, id, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
		}
		{
		    SubLObject cdolist_list_var = thesauri;
		    SubLObject thesaurus = NIL;
		    for (thesaurus = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), thesaurus = cdolist_list_var.first()) {
			violations = nconc(violations, tm_integrity.tm_integrity_check_concept(concept, thesaurus));
		    }
		}
		if (NIL == violations) {
		    return html_thesaurus.tm_message_to_user($$$Integrity_Check_Term_Results, $str_alt289$No_integrity_violations_were_foun);
		}
		{
		    SubLObject color_value = tm_datastructures.$tm_bg_color_default$.getDynamicValue(thread);
		    html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
		    html_utilities.html_markup(html_macros.$html_head_head$.getGlobalValue());
		    html_macros.html_head_content_type();
		    html_utilities.html_source_readability_terpri(UNPROVIDED);
		    html_utilities.html_markup(html_macros.$html_title_head$.getGlobalValue());
		    html_utilities.html_princ($$$Integrity_Check_Term_Results);
		    html_utilities.html_markup(html_macros.$html_title_tail$.getGlobalValue());
		    html_utilities.html_markup(html_macros.$html_head_tail$.getGlobalValue());
		    html_utilities.html_source_readability_terpri(UNPROVIDED);
		    {
			SubLObject _prev_bind_0 = html_macros.$html_inside_bodyP$.currentBinding(thread);
			try {
			    html_macros.$html_inside_bodyP$.bind(T, thread);
			    html_utilities.html_markup(html_macros.$html_body_head$.getGlobalValue());
			    if (NIL != color_value) {
				html_utilities.html_markup(html_macros.$html_body_bgcolor$.getGlobalValue());
				html_utilities.html_char(CHAR_quotation, UNPROVIDED);
				html_utilities.html_markup(html_utilities.html_color(color_value));
				html_utilities.html_char(CHAR_quotation, UNPROVIDED);
			    }
			    html_utilities.html_char(CHAR_greater, UNPROVIDED);
			    {
				SubLObject _prev_bind_0_113 = html_macros.$html_safe_print$.currentBinding(thread);
				try {
				    html_macros.$html_safe_print$.bind(T, thread);
				    html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
				    html_utilities.html_markup(ONE_INTEGER);
				    html_utilities.html_char(CHAR_greater, UNPROVIDED);
				    if ((NIL != tm_control_vars.$client_thes_home_page$.getDynamicValue(thread)) && (NIL != tm_control_vars.$client_mini_logo$.getDynamicValue(thread))) {
					html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
					html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
					html_utilities.html_char(CHAR_quotation, UNPROVIDED);
					html_utilities.html_markup(tm_control_vars.$client_thes_home_page$.getDynamicValue(thread));
					html_utilities.html_char(CHAR_quotation, UNPROVIDED);
					html_utilities.html_char(CHAR_greater, UNPROVIDED);
					{
					    SubLObject _prev_bind_0_114 = html_macros.$html_safe_print$.currentBinding(thread);
					    try {
						html_macros.$html_safe_print$.bind(T, thread);
						html_utilities.html_markup(html_macros.$html_image_head$.getGlobalValue());
						html_utilities.html_markup(html_macros.$html_image_src$.getGlobalValue());
						html_utilities.html_char(CHAR_quotation, UNPROVIDED);
						html_utilities.html_markup(tm_control_vars.$client_mini_logo$.getDynamicValue(thread));
						html_utilities.html_char(CHAR_quotation, UNPROVIDED);
						if (NIL != tm_control_vars.$client_name$.getDynamicValue(thread)) {
						    html_utilities.html_markup(html_macros.$html_image_alt$.getGlobalValue());
						    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
						    html_utilities.html_markup(tm_control_vars.$client_name$.getDynamicValue(thread));
						    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
						}
						if (true) {
						    html_utilities.html_markup(html_macros.$html_image_border$.getGlobalValue());
						    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
						    html_utilities.html_markup(ZERO_INTEGER);
						    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
						}
						html_utilities.html_char(CHAR_greater, UNPROVIDED);
						{
						    SubLObject _prev_bind_0_115 = html_macros.$html_safe_print$.currentBinding(thread);
						    try {
							html_macros.$html_safe_print$.bind(T, thread);
						    } finally {
							html_macros.$html_safe_print$.rebind(_prev_bind_0_115, thread);
						    }
						}
						html_utilities.html_markup(html_macros.$html_image_tail$.getGlobalValue());
					    } finally {
						html_macros.$html_safe_print$.rebind(_prev_bind_0_114, thread);
					    }
					}
					html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
				    }
				    html_utilities.html_princ($$$Integrity_Check_Term_Results);
				    html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
				    html_utilities.html_markup(ONE_INTEGER);
				    html_utilities.html_char(CHAR_greater, UNPROVIDED);
				    tm_logging.tm_enqueue_event($$$Integrity_Check_Term_Results);
				    html_thesaurus.thesaurus_heading($str_alt290$tm_integrity_check_concept_page);
				    html_utilities.html_princ($str_alt291$Integrity_violations_were_found_i);
				    html_utilities.html_markup(html_macros.$html_form_head$.getGlobalValue());
				    html_utilities.html_markup(html_macros.$html_form_action$.getGlobalValue());
				    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
				    html_utilities.html_markup(system_parameters.$cyc_cgi_program$.getDynamicValue(thread));
				    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
				    if (NIL != html_macros.$html_form_method_post$.getGlobalValue()) {
					html_utilities.html_markup(html_macros.$html_form_method$.getGlobalValue());
					html_utilities.html_char(CHAR_quotation, UNPROVIDED);
					html_utilities.html_markup(html_macros.$html_form_method_post$.getGlobalValue());
					html_utilities.html_char(CHAR_quotation, UNPROVIDED);
				    }
				    html_utilities.html_char(CHAR_greater, UNPROVIDED);
				    {
					SubLObject _prev_bind_0_116 = html_macros.$html_safe_print$.currentBinding(thread);
					SubLObject _prev_bind_1 = html_macros.$within_html_form$.currentBinding(thread);
					SubLObject _prev_bind_2 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
					try {
					    html_macros.$html_safe_print$.bind(T, thread);
					    html_macros.$within_html_form$.bind(T, thread);
					    html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
					    html_utilities.html_hidden_input($str_alt292$tm_handle_integrity_check_concept, T, UNPROVIDED);
					    {
						SubLObject violation_number = ZERO_INTEGER;
						html_utilities.html_hidden_input($str_alt126$number_of_violations, length(violations), UNPROVIDED);
						html_utilities.html_princ($str_alt215$For_each_of_the_outstanding_viola);
						html_utilities.html_br();
						html_utilities.html_markup(html_macros.$html_unordered_list_head$.getGlobalValue());
						html_utilities.html_char(CHAR_greater, UNPROVIDED);
						{
						    SubLObject _prev_bind_0_117 = html_macros.$html_safe_print$.currentBinding(thread);
						    try {
							html_macros.$html_safe_print$.bind(T, thread);
							{
							    SubLObject cdolist_list_var = violations;
							    SubLObject violation = NIL;
							    for (violation = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), violation = cdolist_list_var.first()) {
								violation_number = add(violation_number, ONE_INTEGER);
								html_utilities.html_markup(html_macros.$html_list_item_head$.getGlobalValue());
								html_utilities.html_char(CHAR_greater, UNPROVIDED);
								{
								    SubLObject _prev_bind_0_118 = html_macros.$html_safe_print$.currentBinding(thread);
								    try {
									html_macros.$html_safe_print$.bind(T, thread);
									if (NIL != tm_fix_or_print_one_violation(violation, violation_number)) {
									    choices_to_makeP = T;
									}
								    } finally {
									html_macros.$html_safe_print$.rebind(_prev_bind_0_118, thread);
								    }
								}
								html_utilities.html_markup(html_macros.$html_list_item_tail$.getGlobalValue());
							    }
							}
						    } finally {
							html_macros.$html_safe_print$.rebind(_prev_bind_0_117, thread);
						    }
						}
						html_utilities.html_markup(html_macros.$html_unordered_list_tail$.getGlobalValue());
						if (NIL != choices_to_makeP) {
						    html_utilities.html_br();
						    html_utilities.html_submit_input($$$Perform_Selected_Fixes, UNPROVIDED, UNPROVIDED);
						    html_utilities.html_reset_input(UNPROVIDED);
						}
					    }
					    html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
					} finally {
					    html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_2, thread);
					    html_macros.$within_html_form$.rebind(_prev_bind_1, thread);
					    html_macros.$html_safe_print$.rebind(_prev_bind_0_116, thread);
					}
				    }
				    html_utilities.html_markup(html_macros.$html_form_tail$.getGlobalValue());
				    html_thesaurus.tm_footer();
				    html_utilities.html_source_readability_terpri(UNPROVIDED);
				} finally {
				    html_macros.$html_safe_print$.rebind(_prev_bind_0_113, thread);
				}
			    }
			    html_utilities.html_markup(html_macros.$html_body_tail$.getGlobalValue());
			    html_utilities.html_source_readability_terpri(UNPROVIDED);
			} finally {
			    html_macros.$html_inside_bodyP$.rebind(_prev_bind_0, thread);
			}
		    }
		    html_utilities.html_markup(html_macros.$html_html_tail$.getGlobalValue());
		    html_utilities.html_source_readability_terpri(UNPROVIDED);
		}
	    }
	    return NIL;
	}
    }

    public static final SubLObject tm_handle_integrity_check_concept(SubLObject args) {
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    thread.resetMultipleValues();
	    {
		SubLObject fixed_violations = tm_handle_and_perform_user_fixes(args);
		SubLObject outstanding_violations = thread.secondMultipleValue();
		thread.resetMultipleValues();
		{
		    SubLObject color_value = tm_datastructures.$tm_bg_color_default$.getDynamicValue(thread);
		    html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
		    html_utilities.html_markup(html_macros.$html_head_head$.getGlobalValue());
		    html_macros.html_head_content_type();
		    html_utilities.html_source_readability_terpri(UNPROVIDED);
		    html_utilities.html_markup(html_macros.$html_title_head$.getGlobalValue());
		    html_utilities.html_princ($$$Integrity_Check_Term_Fix_Results);
		    html_utilities.html_markup(html_macros.$html_title_tail$.getGlobalValue());
		    html_utilities.html_markup(html_macros.$html_head_tail$.getGlobalValue());
		    html_utilities.html_source_readability_terpri(UNPROVIDED);
		    {
			SubLObject _prev_bind_0 = html_macros.$html_inside_bodyP$.currentBinding(thread);
			try {
			    html_macros.$html_inside_bodyP$.bind(T, thread);
			    html_utilities.html_markup(html_macros.$html_body_head$.getGlobalValue());
			    if (NIL != color_value) {
				html_utilities.html_markup(html_macros.$html_body_bgcolor$.getGlobalValue());
				html_utilities.html_char(CHAR_quotation, UNPROVIDED);
				html_utilities.html_markup(html_utilities.html_color(color_value));
				html_utilities.html_char(CHAR_quotation, UNPROVIDED);
			    }
			    html_utilities.html_char(CHAR_greater, UNPROVIDED);
			    {
				SubLObject _prev_bind_0_119 = html_macros.$html_safe_print$.currentBinding(thread);
				try {
				    html_macros.$html_safe_print$.bind(T, thread);
				    html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
				    html_utilities.html_markup(ONE_INTEGER);
				    html_utilities.html_char(CHAR_greater, UNPROVIDED);
				    if ((NIL != tm_control_vars.$client_thes_home_page$.getDynamicValue(thread)) && (NIL != tm_control_vars.$client_mini_logo$.getDynamicValue(thread))) {
					html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
					html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
					html_utilities.html_char(CHAR_quotation, UNPROVIDED);
					html_utilities.html_markup(tm_control_vars.$client_thes_home_page$.getDynamicValue(thread));
					html_utilities.html_char(CHAR_quotation, UNPROVIDED);
					html_utilities.html_char(CHAR_greater, UNPROVIDED);
					{
					    SubLObject _prev_bind_0_120 = html_macros.$html_safe_print$.currentBinding(thread);
					    try {
						html_macros.$html_safe_print$.bind(T, thread);
						html_utilities.html_markup(html_macros.$html_image_head$.getGlobalValue());
						html_utilities.html_markup(html_macros.$html_image_src$.getGlobalValue());
						html_utilities.html_char(CHAR_quotation, UNPROVIDED);
						html_utilities.html_markup(tm_control_vars.$client_mini_logo$.getDynamicValue(thread));
						html_utilities.html_char(CHAR_quotation, UNPROVIDED);
						if (NIL != tm_control_vars.$client_name$.getDynamicValue(thread)) {
						    html_utilities.html_markup(html_macros.$html_image_alt$.getGlobalValue());
						    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
						    html_utilities.html_markup(tm_control_vars.$client_name$.getDynamicValue(thread));
						    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
						}
						if (true) {
						    html_utilities.html_markup(html_macros.$html_image_border$.getGlobalValue());
						    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
						    html_utilities.html_markup(ZERO_INTEGER);
						    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
						}
						html_utilities.html_char(CHAR_greater, UNPROVIDED);
						{
						    SubLObject _prev_bind_0_121 = html_macros.$html_safe_print$.currentBinding(thread);
						    try {
							html_macros.$html_safe_print$.bind(T, thread);
						    } finally {
							html_macros.$html_safe_print$.rebind(_prev_bind_0_121, thread);
						    }
						}
						html_utilities.html_markup(html_macros.$html_image_tail$.getGlobalValue());
					    } finally {
						html_macros.$html_safe_print$.rebind(_prev_bind_0_120, thread);
					    }
					}
					html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
				    }
				    html_utilities.html_princ($$$Integrity_Check_Term_Fix_Results);
				    html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
				    html_utilities.html_markup(ONE_INTEGER);
				    html_utilities.html_char(CHAR_greater, UNPROVIDED);
				    tm_logging.tm_enqueue_event($$$Integrity_Check_Term_Fix_Results);
				    html_thesaurus.thesaurus_heading($str_alt292$tm_handle_integrity_check_concept);
				    tm_present_integrity_outcome(fixed_violations, outstanding_violations);
				    html_thesaurus.tm_footer();
				    html_utilities.html_source_readability_terpri(UNPROVIDED);
				} finally {
				    html_macros.$html_safe_print$.rebind(_prev_bind_0_119, thread);
				}
			    }
			    html_utilities.html_markup(html_macros.$html_body_tail$.getGlobalValue());
			    html_utilities.html_source_readability_terpri(UNPROVIDED);
			} finally {
			    html_macros.$html_inside_bodyP$.rebind(_prev_bind_0, thread);
			}
		    }
		    html_utilities.html_markup(html_macros.$html_html_tail$.getGlobalValue());
		    html_utilities.html_source_readability_terpri(UNPROVIDED);
		}
	    }
	    return NIL;
	}
    }

    public static final SubLObject tm_quick_edit_page(SubLObject args) {
	if (args == UNPROVIDED) {
	    args = NIL;
	}
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    {
		SubLObject v_term = tm_datastructures.tm_value(tm_datastructures.$tm_user$.getDynamicValue(thread), $TERM);
		SubLObject string_to_show = (NIL != v_term) ? ((SubLObject) (tm_internals.tm_string_for_constant(v_term, NIL, NIL, T))) : $str_alt2$;
		SubLObject length = max($int$40, length(string_to_show));
		SubLObject color_value = tm_datastructures.$tm_bg_color_default$.getDynamicValue(thread);
		html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
		html_utilities.html_markup(html_macros.$html_head_head$.getGlobalValue());
		html_macros.html_head_content_type();
		html_utilities.html_source_readability_terpri(UNPROVIDED);
		html_utilities.html_markup(html_macros.$html_title_head$.getGlobalValue());
		html_utilities.html_princ($$$Thesaurus_Quick_Edit);
		html_utilities.html_markup(html_macros.$html_title_tail$.getGlobalValue());
		html_utilities.html_markup(html_macros.$html_head_tail$.getGlobalValue());
		html_utilities.html_source_readability_terpri(UNPROVIDED);
		{
		    SubLObject _prev_bind_0 = html_macros.$html_inside_bodyP$.currentBinding(thread);
		    try {
			html_macros.$html_inside_bodyP$.bind(T, thread);
			html_utilities.html_markup(html_macros.$html_body_head$.getGlobalValue());
			if (NIL != color_value) {
			    html_utilities.html_markup(html_macros.$html_body_bgcolor$.getGlobalValue());
			    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
			    html_utilities.html_markup(html_utilities.html_color(color_value));
			    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
			}
			html_utilities.html_char(CHAR_greater, UNPROVIDED);
			{
			    SubLObject _prev_bind_0_122 = html_macros.$html_safe_print$.currentBinding(thread);
			    try {
				html_macros.$html_safe_print$.bind(T, thread);
				html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
				html_utilities.html_markup(ONE_INTEGER);
				html_utilities.html_char(CHAR_greater, UNPROVIDED);
				if ((NIL != tm_control_vars.$client_thes_home_page$.getDynamicValue(thread)) && (NIL != tm_control_vars.$client_mini_logo$.getDynamicValue(thread))) {
				    html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
				    html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
				    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
				    html_utilities.html_markup(tm_control_vars.$client_thes_home_page$.getDynamicValue(thread));
				    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
				    html_utilities.html_char(CHAR_greater, UNPROVIDED);
				    {
					SubLObject _prev_bind_0_123 = html_macros.$html_safe_print$.currentBinding(thread);
					try {
					    html_macros.$html_safe_print$.bind(T, thread);
					    html_utilities.html_markup(html_macros.$html_image_head$.getGlobalValue());
					    html_utilities.html_markup(html_macros.$html_image_src$.getGlobalValue());
					    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
					    html_utilities.html_markup(tm_control_vars.$client_mini_logo$.getDynamicValue(thread));
					    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
					    if (NIL != tm_control_vars.$client_name$.getDynamicValue(thread)) {
						html_utilities.html_markup(html_macros.$html_image_alt$.getGlobalValue());
						html_utilities.html_char(CHAR_quotation, UNPROVIDED);
						html_utilities.html_markup(tm_control_vars.$client_name$.getDynamicValue(thread));
						html_utilities.html_char(CHAR_quotation, UNPROVIDED);
					    }
					    if (true) {
						html_utilities.html_markup(html_macros.$html_image_border$.getGlobalValue());
						html_utilities.html_char(CHAR_quotation, UNPROVIDED);
						html_utilities.html_markup(ZERO_INTEGER);
						html_utilities.html_char(CHAR_quotation, UNPROVIDED);
					    }
					    html_utilities.html_char(CHAR_greater, UNPROVIDED);
					    {
						SubLObject _prev_bind_0_124 = html_macros.$html_safe_print$.currentBinding(thread);
						try {
						    html_macros.$html_safe_print$.bind(T, thread);
						} finally {
						    html_macros.$html_safe_print$.rebind(_prev_bind_0_124, thread);
						}
					    }
					    html_utilities.html_markup(html_macros.$html_image_tail$.getGlobalValue());
					} finally {
					    html_macros.$html_safe_print$.rebind(_prev_bind_0_123, thread);
					}
				    }
				    html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
				}
				html_utilities.html_princ($$$Thesaurus_Quick_Edit);
				html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
				html_utilities.html_markup(ONE_INTEGER);
				html_utilities.html_char(CHAR_greater, UNPROVIDED);
				tm_logging.tm_enqueue_event($$$Thesaurus_Quick_Edit);
				if (!(true && (NIL != tm_internals.privelegedP(tm_datastructures.$tm_user$.getDynamicValue(thread), $str_alt297$limited_editor)))) {
				    html_utilities.html_princ($str_alt186$Sorry__you_do_not_have_permission);
				} else {
				    html_thesaurus.thesaurus_heading($str_alt298$tm_quick_edit_page);
				    if (NIL != tm_internals.editing_allowedP()) {
					html_utilities.html_markup(html_macros.$html_form_head$.getGlobalValue());
					html_utilities.html_markup(html_macros.$html_form_action$.getGlobalValue());
					html_utilities.html_char(CHAR_quotation, UNPROVIDED);
					html_utilities.html_markup(system_parameters.$cyc_cgi_program$.getDynamicValue(thread));
					html_utilities.html_char(CHAR_quotation, UNPROVIDED);
					if (NIL != html_macros.$html_form_method_post$.getGlobalValue()) {
					    html_utilities.html_markup(html_macros.$html_form_method$.getGlobalValue());
					    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
					    html_utilities.html_markup(html_macros.$html_form_method_post$.getGlobalValue());
					    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
					}
					html_utilities.html_char(CHAR_greater, UNPROVIDED);
					{
					    SubLObject _prev_bind_0_125 = html_macros.$html_safe_print$.currentBinding(thread);
					    SubLObject _prev_bind_1 = html_macros.$within_html_form$.currentBinding(thread);
					    SubLObject _prev_bind_2 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
					    try {
						html_macros.$html_safe_print$.bind(T, thread);
						html_macros.$within_html_form$.bind(T, thread);
						html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
						html_utilities.html_hidden_input($str_alt299$tm_handle_quick_edit, T, UNPROVIDED);
						html_utilities.html_submit_input($$$Go, UNPROVIDED, UNPROVIDED);
						html_utilities.html_reset_input($$$Reset);
						html_utilities.html_br();
						html_utilities.html_markup(html_macros.$html_table_head$.getGlobalValue());
						if (true) {
						    html_utilities.html_markup(html_macros.$html_table_border$.getGlobalValue());
						    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
						    html_utilities.html_markup(ZERO_INTEGER);
						    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
						}
						html_utilities.html_char(CHAR_greater, UNPROVIDED);
						{
						    SubLObject _prev_bind_0_126 = html_macros.$html_safe_print$.currentBinding(thread);
						    try {
							html_macros.$html_safe_print$.bind(T, thread);
							html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
							html_utilities.html_char(CHAR_greater, UNPROVIDED);
							{
							    SubLObject _prev_bind_0_127 = html_macros.$html_safe_print$.currentBinding(thread);
							    try {
								html_macros.$html_safe_print$.bind(T, thread);
								html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
								html_utilities.html_char(CHAR_greater, UNPROVIDED);
								{
								    SubLObject _prev_bind_0_128 = html_macros.$html_safe_print$.currentBinding(thread);
								    try {
									html_macros.$html_safe_print$.bind(T, thread);
									html_utilities.html_princ($str_alt301$Thesauri_);
								    } finally {
									html_macros.$html_safe_print$.rebind(_prev_bind_0_128, thread);
								    }
								}
								html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
								html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
								html_utilities.html_char(CHAR_greater, UNPROVIDED);
								{
								    SubLObject _prev_bind_0_129 = html_macros.$html_safe_print$.currentBinding(thread);
								    try {
									html_macros.$html_safe_print$.bind(T, thread);
									html_macros.verify_not_within_html_pre();
									html_utilities.html_markup(html_macros.$html_preformatted_head$.getGlobalValue());
									{
									    SubLObject _prev_bind_0_130 = html_macros.$within_html_pre$.currentBinding(thread);
									    try {
										html_macros.$within_html_pre$.bind(T, thread);
										html_utilities.html_princ($str_alt302$__);
									    } finally {
										html_macros.$within_html_pre$.rebind(_prev_bind_0_130, thread);
									    }
									}
									html_utilities.html_markup(html_macros.$html_preformatted_tail$.getGlobalValue());
								    } finally {
									html_macros.$html_safe_print$.rebind(_prev_bind_0_129, thread);
								    }
								}
								html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
								html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
								html_utilities.html_char(CHAR_greater, UNPROVIDED);
								{
								    SubLObject _prev_bind_0_131 = html_macros.$html_safe_print$.currentBinding(thread);
								    try {
									html_macros.$html_safe_print$.bind(T, thread);
									html_utilities.html_princ($str_alt303$Term_to_edit_);
								    } finally {
									html_macros.$html_safe_print$.rebind(_prev_bind_0_131, thread);
								    }
								}
								html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
							    } finally {
								html_macros.$html_safe_print$.rebind(_prev_bind_0_127, thread);
							    }
							}
							html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
							html_utilities.html_source_readability_terpri(UNPROVIDED);
							html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
							html_utilities.html_char(CHAR_greater, UNPROVIDED);
							{
							    SubLObject _prev_bind_0_132 = html_macros.$html_safe_print$.currentBinding(thread);
							    try {
								html_macros.$html_safe_print$.bind(T, thread);
								html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
								if (true) {
								    html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
								    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
								    html_utilities.html_markup(html_utilities.html_align($TOP));
								    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
								}
								html_utilities.html_char(CHAR_greater, UNPROVIDED);
								{
								    SubLObject _prev_bind_0_133 = html_macros.$html_safe_print$.currentBinding(thread);
								    try {
									html_macros.$html_safe_print$.bind(T, thread);
									html_thesaurus.tm_edit_thesaurus_selection(T, UNPROVIDED, UNPROVIDED, UNPROVIDED);
								    } finally {
									html_macros.$html_safe_print$.rebind(_prev_bind_0_133, thread);
								    }
								}
								html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
								html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
								html_utilities.html_char(CHAR_greater, UNPROVIDED);
								{
								    SubLObject _prev_bind_0_134 = html_macros.$html_safe_print$.currentBinding(thread);
								    try {
									html_macros.$html_safe_print$.bind(T, thread);
									html_macros.verify_not_within_html_pre();
									html_utilities.html_markup(html_macros.$html_preformatted_head$.getGlobalValue());
									{
									    SubLObject _prev_bind_0_135 = html_macros.$within_html_pre$.currentBinding(thread);
									    try {
										html_macros.$within_html_pre$.bind(T, thread);
										html_utilities.html_princ($str_alt302$__);
									    } finally {
										html_macros.$within_html_pre$.rebind(_prev_bind_0_135, thread);
									    }
									}
									html_utilities.html_markup(html_macros.$html_preformatted_tail$.getGlobalValue());
								    } finally {
									html_macros.$html_safe_print$.rebind(_prev_bind_0_134, thread);
								    }
								}
								html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
								html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
								if (true) {
								    html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
								    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
								    html_utilities.html_markup(html_utilities.html_align($TOP));
								    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
								}
								html_utilities.html_char(CHAR_greater, UNPROVIDED);
								{
								    SubLObject _prev_bind_0_136 = html_macros.$html_safe_print$.currentBinding(thread);
								    try {
									html_macros.$html_safe_print$.bind(T, thread);
									html_utilities.html_text_input($str_alt305$term_string, string_to_show, length);
									html_utilities.html_br();
									html_utilities.html_markup(html_macros.$html_table_head$.getGlobalValue());
									if (true) {
									    html_utilities.html_markup(html_macros.$html_table_border$.getGlobalValue());
									    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
									    html_utilities.html_markup(ZERO_INTEGER);
									    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
									}
									html_utilities.html_char(CHAR_greater, UNPROVIDED);
									{
									    SubLObject _prev_bind_0_137 = html_macros.$html_safe_print$.currentBinding(thread);
									    try {
										html_macros.$html_safe_print$.bind(T, thread);
										html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
										html_utilities.html_char(CHAR_greater, UNPROVIDED);
										{
										    SubLObject _prev_bind_0_138 = html_macros.$html_safe_print$.currentBinding(thread);
										    try {
											html_macros.$html_safe_print$.bind(T, thread);
											html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
											if (true) {
											    html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
											    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
											    html_utilities.html_markup(html_utilities.html_align($TOP));
											    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
											}
											html_utilities.html_char(CHAR_greater, UNPROVIDED);
											{
											    SubLObject _prev_bind_0_139 = html_macros.$html_safe_print$.currentBinding(thread);
											    try {
												html_macros.$html_safe_print$.bind(T, thread);
												html_utilities.html_princ($str_alt306$Operation_);
											    } finally {
												html_macros.$html_safe_print$.rebind(_prev_bind_0_139, thread);
											    }
											}
											html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
											html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
											if (true) {
											    html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
											    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
											    html_utilities.html_markup(html_utilities.html_align($TOP));
											    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
											}
											html_utilities.html_char(CHAR_greater, UNPROVIDED);
											{
											    SubLObject _prev_bind_0_140 = html_macros.$html_safe_print$.currentBinding(thread);
											    try {
												html_macros.$html_safe_print$.bind(T, thread);
												html_utilities.html_princ($str_alt307$Relation_);
											    } finally {
												html_macros.$html_safe_print$.rebind(_prev_bind_0_140, thread);
											    }
											}
											html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
										    } finally {
											html_macros.$html_safe_print$.rebind(_prev_bind_0_138, thread);
										    }
										}
										html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
										html_utilities.html_source_readability_terpri(UNPROVIDED);
										html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
										html_utilities.html_char(CHAR_greater, UNPROVIDED);
										{
										    SubLObject _prev_bind_0_141 = html_macros.$html_safe_print$.currentBinding(thread);
										    try {
											html_macros.$html_safe_print$.bind(T, thread);
											html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
											if (true) {
											    html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
											    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
											    html_utilities.html_markup(html_utilities.html_align($TOP));
											    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
											}
											html_utilities.html_char(CHAR_greater, UNPROVIDED);
											{
											    SubLObject _prev_bind_0_142 = html_macros.$html_safe_print$.currentBinding(thread);
											    try {
												html_macros.$html_safe_print$.bind(T, thread);
												html_utilities.html_markup(html_macros.$html_select_head$.getGlobalValue());
												{
												    SubLObject _prev_bind_0_143 = html_macros.$html_safe_print$.currentBinding(thread);
												    try {
													html_macros.$html_safe_print$.bind(NIL, thread);
													html_utilities.html_markup(html_macros.$html_select_name$.getGlobalValue());
													html_utilities.html_princ($$$operation);
													html_utilities.html_char(CHAR_greater, UNPROVIDED);
													{
													    SubLObject _prev_bind_0_144 = html_macros.$html_safe_print$.currentBinding(thread);
													    try {
														html_macros.$html_safe_print$.bind(T, thread);
														{
														    SubLObject cdolist_list_var = tm_datastructures.$tm_operations$.getGlobalValue();
														    SubLObject operation = NIL;
														    for (operation = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), operation = cdolist_list_var.first()) {
															html_utilities.html_markup(html_macros.$html_option_head$.getGlobalValue());
															{
															    SubLObject _prev_bind_0_145 = html_macros.$html_safe_print$.currentBinding(thread);
															    try {
																html_macros.$html_safe_print$.bind(NIL, thread);
																if (operation.equal(tm_datastructures.tm_value(tm_datastructures.$tm_user$.getDynamicValue(thread), $DEFAULT_OPERATION))) {
																    html_utilities.html_princ(html_macros.$html_option_selected$.getGlobalValue());
																}
																html_utilities.html_char(CHAR_greater, UNPROVIDED);
																{
																    SubLObject _prev_bind_0_146 = html_macros.$html_safe_print$.currentBinding(thread);
																    try {
																	html_macros.$html_safe_print$.bind(T, thread);
																	format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt309$_S, operation);
																    } finally {
																	html_macros.$html_safe_print$.rebind(_prev_bind_0_146, thread);
																    }
																}
															    } finally {
																html_macros.$html_safe_print$.rebind(_prev_bind_0_145, thread);
															    }
															}
															html_utilities.html_markup(html_macros.$html_option_tail$.getGlobalValue());
														    }
														}
													    } finally {
														html_macros.$html_safe_print$.rebind(_prev_bind_0_144, thread);
													    }
													}
												    } finally {
													html_macros.$html_safe_print$.rebind(_prev_bind_0_143, thread);
												    }
												}
												html_utilities.html_markup(html_macros.$html_select_tail$.getGlobalValue());
											    } finally {
												html_macros.$html_safe_print$.rebind(_prev_bind_0_142, thread);
											    }
											}
											html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
											html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
											if (true) {
											    html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
											    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
											    html_utilities.html_markup(html_utilities.html_align($TOP));
											    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
											}
											html_utilities.html_char(CHAR_greater, UNPROVIDED);
											{
											    SubLObject _prev_bind_0_147 = html_macros.$html_safe_print$.currentBinding(thread);
											    try {
												html_macros.$html_safe_print$.bind(T, thread);
												html_utilities.html_markup(html_macros.$html_select_head$.getGlobalValue());
												{
												    SubLObject _prev_bind_0_148 = html_macros.$html_safe_print$.currentBinding(thread);
												    try {
													html_macros.$html_safe_print$.bind(NIL, thread);
													html_utilities.html_markup(html_macros.$html_select_name$.getGlobalValue());
													html_utilities.html_princ($$$relation);
													html_utilities.html_char(CHAR_greater, UNPROVIDED);
													{
													    SubLObject _prev_bind_0_149 = html_macros.$html_safe_print$.currentBinding(thread);
													    try {
														html_macros.$html_safe_print$.bind(T, thread);
														{
														    SubLObject cdolist_list_var = tm_internals.tm_active_relation_symbols_sorted();
														    SubLObject rel_symbol = NIL;
														    for (rel_symbol = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), rel_symbol = cdolist_list_var.first()) {
															html_utilities.html_markup(html_macros.$html_option_head$.getGlobalValue());
															{
															    SubLObject _prev_bind_0_150 = html_macros.$html_safe_print$.currentBinding(thread);
															    try {
																html_macros.$html_safe_print$.bind(NIL, thread);
																if (rel_symbol.equal(tm_datastructures.tm_value(tm_datastructures.$tm_user$.getDynamicValue(thread), $DEFAULT_RELATION))) {
																    html_utilities.html_princ(html_macros.$html_option_selected$.getGlobalValue());
																}
																html_utilities.html_char(CHAR_greater, UNPROVIDED);
																{
																    SubLObject _prev_bind_0_151 = html_macros.$html_safe_print$.currentBinding(thread);
																    try {
																	html_macros.$html_safe_print$.bind(T, thread);
																	html_utilities.html_princ(rel_symbol);
																    } finally {
																	html_macros.$html_safe_print$.rebind(_prev_bind_0_151, thread);
																    }
																}
															    } finally {
																html_macros.$html_safe_print$.rebind(_prev_bind_0_150, thread);
															    }
															}
															html_utilities.html_markup(html_macros.$html_option_tail$.getGlobalValue());
														    }
														}
													    } finally {
														html_macros.$html_safe_print$.rebind(_prev_bind_0_149, thread);
													    }
													}
												    } finally {
													html_macros.$html_safe_print$.rebind(_prev_bind_0_148, thread);
												    }
												}
												html_utilities.html_markup(html_macros.$html_select_tail$.getGlobalValue());
											    } finally {
												html_macros.$html_safe_print$.rebind(_prev_bind_0_147, thread);
											    }
											}
											html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
										    } finally {
											html_macros.$html_safe_print$.rebind(_prev_bind_0_141, thread);
										    }
										}
										html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
										html_utilities.html_source_readability_terpri(UNPROVIDED);
									    } finally {
										html_macros.$html_safe_print$.rebind(_prev_bind_0_137, thread);
									    }
									}
									html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
									html_utilities.html_checkbox_input($str_alt311$override_default_case, $$$T, NIL == tm_internals.$tm_use_default_case_for_strings$.getDynamicValue(thread) ? ((SubLObject) (T)) : NIL, UNPROVIDED, UNPROVIDED, UNPROVIDED);
									html_utilities.html_princ($$$Override_Default_Case);
								    } finally {
									html_macros.$html_safe_print$.rebind(_prev_bind_0_136, thread);
								    }
								}
								html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
							    } finally {
								html_macros.$html_safe_print$.rebind(_prev_bind_0_132, thread);
							    }
							}
							html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
							html_utilities.html_source_readability_terpri(UNPROVIDED);
						    } finally {
							html_macros.$html_safe_print$.rebind(_prev_bind_0_126, thread);
						    }
						}
						html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
						html_utilities.html_br();
						html_utilities.html_princ($str_alt314$For_ADD_or_DELETE__please_specify);
						html_utilities.html_br();
						html_utilities.html_markup(html_macros.$html_textarea_head$.getGlobalValue());
						html_utilities.html_markup(html_macros.$html_textarea_name$.getGlobalValue());
						html_utilities.html_char(CHAR_quotation, UNPROVIDED);
						html_utilities.html_markup($$$value);
						html_utilities.html_char(CHAR_quotation, UNPROVIDED);
						if (true) {
						    html_utilities.html_markup(html_macros.$html_textarea_cols$.getGlobalValue());
						    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
						    html_utilities.html_markup($int$60);
						    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
						}
						if (true) {
						    html_utilities.html_markup(html_macros.$html_textarea_rows$.getGlobalValue());
						    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
						    html_utilities.html_markup(THREE_INTEGER);
						    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
						}
						html_utilities.html_char(CHAR_greater, UNPROVIDED);
						{
						    SubLObject _prev_bind_0_152 = html_macros.$html_safe_print$.currentBinding(thread);
						    try {
							html_macros.$html_safe_print$.bind(T, thread);
						    } finally {
							html_macros.$html_safe_print$.rebind(_prev_bind_0_152, thread);
						    }
						}
						html_utilities.html_markup(html_macros.$html_textarea_tail$.getGlobalValue());
						html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
					    } finally {
						html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_2, thread);
						html_macros.$within_html_form$.rebind(_prev_bind_1, thread);
						html_macros.$html_safe_print$.rebind(_prev_bind_0_125, thread);
					    }
					}
					html_utilities.html_markup(html_macros.$html_form_tail$.getGlobalValue());
				    } else {
					html_thesaurus.tm_report_editing_disabled();
				    }
				}
				html_thesaurus.tm_footer();
				html_utilities.html_source_readability_terpri(UNPROVIDED);
			    } finally {
				html_macros.$html_safe_print$.rebind(_prev_bind_0_122, thread);
			    }
			}
			html_utilities.html_markup(html_macros.$html_body_tail$.getGlobalValue());
			html_utilities.html_source_readability_terpri(UNPROVIDED);
		    } finally {
			html_macros.$html_inside_bodyP$.rebind(_prev_bind_0, thread);
		    }
		}
		html_utilities.html_markup(html_macros.$html_html_tail$.getGlobalValue());
		html_utilities.html_source_readability_terpri(UNPROVIDED);
	    }
	    return NIL;
	}
    }

    public static final SubLObject tm_handle_quick_edit(SubLObject args) {
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    {
		SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
		SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
		try {
		    mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_GENL_MT, thread);
		    mt_relevance_macros.$mt$.bind(tm_datastructures.$tm_mt$.getGlobalValue(), thread);
		    {
			SubLObject v_term = tm_internals.canonicalize_lexical_term(html_utilities.html_extract_input($str_alt305$term_string, args));
			SubLObject opcode_ind = html_utilities.html_extract_input($$$operation, args);
			SubLObject override_default_case = html_utilities.html_extract_input($str_alt311$override_default_case, args);
			SubLObject len = length(opcode_ind);
			SubLObject opcode = (opcode_ind.isString() && len.numG(ZERO_INTEGER)) ? ((SubLObject) (read_from_string_ignoring_errors(opcode_ind, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED))) : NIL;
			SubLObject relation = html_utilities.html_extract_input($$$relation, args);
			SubLObject thesaurus_names = html_utilities.html_extract_input_values($$$thesauri, args);
			SubLObject values = html_utilities.html_extract_input($$$value, args);
			SubLObject relation_constant = tm_internals.relation_constant_from_abbreviation(relation);
			SubLObject value_arg = tm_internals.relation_value_arg_from_abbreviation(relation);
			if ((relation.equalp($$$SN) || (NIL != tm_utilities.tm_single_entry_formatP(relation_constant, value_arg, UNPROVIDED))) || (opcode == $EDIT)) {
			    values = list(tm_strip_garbage_chars(values, UNPROVIDED));
			} else {
			    values = string_utilities.extract_lines(values);
			}
			if (NIL == thesaurus_names) {
			    html_thesaurus.tm_error($str_alt320$No_thesauri_were_specified_, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
			} else {
			    tm_datastructures.change_tm_value(tm_datastructures.$tm_user$.getDynamicValue(thread), $DEFAULT_OPERATION, opcode, UNPROVIDED);
			    tm_datastructures.change_tm_value(tm_datastructures.$tm_user$.getDynamicValue(thread), $DEFAULT_RELATION, relation, UNPROVIDED);
			    {
				SubLObject ops = NIL;
				SubLObject cdolist_list_var = values;
				SubLObject value = NIL;
				for (value = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), value = cdolist_list_var.first()) {
				    if (value.isString()) {
					value = string_utilities.trim_whitespace(value);
				    }
				    {
					SubLObject cdolist_list_var_153 = thesaurus_names;
					SubLObject thesaurus_name = NIL;
					for (thesaurus_name = cdolist_list_var_153.first(); NIL != cdolist_list_var_153; cdolist_list_var_153 = cdolist_list_var_153.rest(), thesaurus_name = cdolist_list_var_153.first()) {
					    {
						SubLObject op = tm_datastructures.get_tm_op();
						SubLObject op_154 = op;
						tm_datastructures._csetf_tm_op_opcode(op_154, opcode);
						tm_datastructures._csetf_tm_op_relation(op_154, relation);
						tm_datastructures._csetf_tm_op_inverseP(op_154, NIL);
						tm_datastructures._csetf_tm_op_args(op_154, list(v_term, value));
						tm_datastructures._csetf_tm_op_thesaurus(op_154, thesaurus_name);
						tm_datastructures._csetf_tm_op_status(op_154, NIL);
						tm_datastructures._csetf_tm_op_verifyP(op_154, NIL);
						tm_datastructures._csetf_tm_op_hiddenP(op_154, NIL);
						tm_datastructures._csetf_tm_op_description(op_154, NIL);
						tm_datastructures._csetf_tm_op_description_args(op_154, NIL);
						if (NIL.isString()) {
						    set_op_english(op_154, NIL);
						} else {
						    set_op_english(op_154, UNPROVIDED);
						}
						ops = cons(op, ops);
					    }
					}
				    }
				}
				{
				    SubLObject _prev_bind_0_155 = tm_internals.$tm_use_default_case_for_strings$.currentBinding(thread);
				    try {
					tm_internals.$tm_use_default_case_for_strings$.bind(NIL != override_default_case ? ((SubLObject) (NIL)) : T, thread);
					do_operations(ops, UNPROVIDED);
				    } finally {
					tm_internals.$tm_use_default_case_for_strings$.rebind(_prev_bind_0_155, thread);
				    }
				}
			    }
			}
		    }
		} finally {
		    mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
		    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
		}
	    }
	    return NIL;
	}
    }

    public static final SubLObject tm_edit(SubLObject ops) {
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    if (NIL == ops) {
		html_thesaurus.tm_error($str_alt322$No_operations_were_specified_, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
	    } else if (NIL != ops.rest()) {
		html_thesaurus.tm_error($str_alt323$Sorry__the_EDIT_operation_is_not_, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
	    } else {
		{
		    SubLObject color_value = tm_datastructures.$tm_bg_color_default$.getDynamicValue(thread);
		    html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
		    html_utilities.html_markup(html_macros.$html_head_head$.getGlobalValue());
		    html_macros.html_head_content_type();
		    html_utilities.html_source_readability_terpri(UNPROVIDED);
		    html_utilities.html_markup(html_macros.$html_title_head$.getGlobalValue());
		    html_utilities.html_princ($$$Edit);
		    html_utilities.html_markup(html_macros.$html_title_tail$.getGlobalValue());
		    html_utilities.html_markup(html_macros.$html_head_tail$.getGlobalValue());
		    html_utilities.html_source_readability_terpri(UNPROVIDED);
		    {
			SubLObject _prev_bind_0 = html_macros.$html_inside_bodyP$.currentBinding(thread);
			try {
			    html_macros.$html_inside_bodyP$.bind(T, thread);
			    html_utilities.html_markup(html_macros.$html_body_head$.getGlobalValue());
			    if (NIL != color_value) {
				html_utilities.html_markup(html_macros.$html_body_bgcolor$.getGlobalValue());
				html_utilities.html_char(CHAR_quotation, UNPROVIDED);
				html_utilities.html_markup(html_utilities.html_color(color_value));
				html_utilities.html_char(CHAR_quotation, UNPROVIDED);
			    }
			    html_utilities.html_char(CHAR_greater, UNPROVIDED);
			    {
				SubLObject _prev_bind_0_156 = html_macros.$html_safe_print$.currentBinding(thread);
				try {
				    html_macros.$html_safe_print$.bind(T, thread);
				    html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
				    html_utilities.html_markup(ONE_INTEGER);
				    html_utilities.html_char(CHAR_greater, UNPROVIDED);
				    if ((NIL != tm_control_vars.$client_thes_home_page$.getDynamicValue(thread)) && (NIL != tm_control_vars.$client_mini_logo$.getDynamicValue(thread))) {
					html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
					html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
					html_utilities.html_char(CHAR_quotation, UNPROVIDED);
					html_utilities.html_markup(tm_control_vars.$client_thes_home_page$.getDynamicValue(thread));
					html_utilities.html_char(CHAR_quotation, UNPROVIDED);
					html_utilities.html_char(CHAR_greater, UNPROVIDED);
					{
					    SubLObject _prev_bind_0_157 = html_macros.$html_safe_print$.currentBinding(thread);
					    try {
						html_macros.$html_safe_print$.bind(T, thread);
						html_utilities.html_markup(html_macros.$html_image_head$.getGlobalValue());
						html_utilities.html_markup(html_macros.$html_image_src$.getGlobalValue());
						html_utilities.html_char(CHAR_quotation, UNPROVIDED);
						html_utilities.html_markup(tm_control_vars.$client_mini_logo$.getDynamicValue(thread));
						html_utilities.html_char(CHAR_quotation, UNPROVIDED);
						if (NIL != tm_control_vars.$client_name$.getDynamicValue(thread)) {
						    html_utilities.html_markup(html_macros.$html_image_alt$.getGlobalValue());
						    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
						    html_utilities.html_markup(tm_control_vars.$client_name$.getDynamicValue(thread));
						    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
						}
						if (true) {
						    html_utilities.html_markup(html_macros.$html_image_border$.getGlobalValue());
						    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
						    html_utilities.html_markup(ZERO_INTEGER);
						    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
						}
						html_utilities.html_char(CHAR_greater, UNPROVIDED);
						{
						    SubLObject _prev_bind_0_158 = html_macros.$html_safe_print$.currentBinding(thread);
						    try {
							html_macros.$html_safe_print$.bind(T, thread);
						    } finally {
							html_macros.$html_safe_print$.rebind(_prev_bind_0_158, thread);
						    }
						}
						html_utilities.html_markup(html_macros.$html_image_tail$.getGlobalValue());
					    } finally {
						html_macros.$html_safe_print$.rebind(_prev_bind_0_157, thread);
					    }
					}
					html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
				    }
				    html_utilities.html_princ($$$Edit);
				    html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
				    html_utilities.html_markup(ONE_INTEGER);
				    html_utilities.html_char(CHAR_greater, UNPROVIDED);
				    tm_logging.tm_enqueue_event($$$Edit);
				    if (!(true && (NIL != tm_internals.privelegedP(tm_datastructures.$tm_user$.getDynamicValue(thread), $str_alt297$limited_editor)))) {
					html_utilities.html_princ($str_alt186$Sorry__you_do_not_have_permission);
				    } else {
					html_thesaurus.thesaurus_heading($str_alt325$tm_edit);
					{
					    SubLObject op = ops.first();
					    SubLObject args = tm_datastructures.tm_op_args(op);
					    SubLObject term_idx = (NIL != tm_datastructures.tm_op_inverseP(op)) ? ((SubLObject) (TWO_INTEGER)) : ONE_INTEGER;
					    SubLObject value_idx = (term_idx.numE(TWO_INTEGER)) ? ((SubLObject) (ONE_INTEGER)) : TWO_INTEGER;
					    SubLObject term_sign = nth(subtract(term_idx, ONE_INTEGER), args);
					    SubLObject value = nth(subtract(value_idx, ONE_INTEGER), args);
					    SubLObject v_term = tm_datastructures.arg_string(term_sign);
					    SubLObject thesaurus_name = tm_datastructures.tm_op_thesaurus_name(op);
					    SubLObject relation_name = tm_datastructures.tm_op_relation_abbrev(op);
					    html_utilities.html_markup(html_macros.$html_paragraph_head$.getGlobalValue());
					    format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt326$Edit__A__A_in__A_, new SubLObject[] { v_term, relation_name, thesaurus_name });
					    html_utilities.html_markup(html_macros.$html_paragraph_tail$.getGlobalValue());
					    html_utilities.html_br();
					    html_utilities.html_markup(html_macros.$html_form_head$.getGlobalValue());
					    html_utilities.html_markup(html_macros.$html_form_action$.getGlobalValue());
					    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
					    html_utilities.html_markup(system_parameters.$cyc_cgi_program$.getDynamicValue(thread));
					    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
					    if (NIL != html_macros.$html_form_method_post$.getGlobalValue()) {
						html_utilities.html_markup(html_macros.$html_form_method$.getGlobalValue());
						html_utilities.html_char(CHAR_quotation, UNPROVIDED);
						html_utilities.html_markup(html_macros.$html_form_method_post$.getGlobalValue());
						html_utilities.html_char(CHAR_quotation, UNPROVIDED);
					    }
					    html_utilities.html_char(CHAR_greater, UNPROVIDED);
					    {
						SubLObject _prev_bind_0_159 = html_macros.$html_safe_print$.currentBinding(thread);
						SubLObject _prev_bind_1 = html_macros.$within_html_form$.currentBinding(thread);
						SubLObject _prev_bind_2 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
						try {
						    html_macros.$html_safe_print$.bind(T, thread);
						    html_macros.$within_html_form$.bind(T, thread);
						    html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
						    html_utilities.html_hidden_input($str_alt327$tm_handle_edit, T, UNPROVIDED);
						    html_utilities.html_hidden_input($$$thesaurus, thesaurus_name, UNPROVIDED);
						    html_utilities.html_hidden_input($$$term, v_term, UNPROVIDED);
						    html_utilities.html_hidden_input($$$relation, relation_name, UNPROVIDED);
						    html_utilities.html_hidden_input($$$original, value, UNPROVIDED);
						    html_utilities.html_checkbox_input($str_alt311$override_default_case, $$$T, NIL == tm_internals.$tm_use_default_case_for_strings$.getDynamicValue(thread) ? ((SubLObject) (T)) : NIL, UNPROVIDED, UNPROVIDED, UNPROVIDED);
						    html_utilities.html_princ($$$Override_Default_Case);
						    html_utilities.html_br();
						    html_utilities.html_br();
						    html_utilities.html_markup(html_macros.$html_textarea_head$.getGlobalValue());
						    html_utilities.html_markup(html_macros.$html_textarea_name$.getGlobalValue());
						    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
						    html_utilities.html_markup($$$value);
						    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
						    if (true) {
							html_utilities.html_markup(html_macros.$html_textarea_cols$.getGlobalValue());
							html_utilities.html_char(CHAR_quotation, UNPROVIDED);
							html_utilities.html_markup($int$60);
							html_utilities.html_char(CHAR_quotation, UNPROVIDED);
						    }
						    if (true) {
							html_utilities.html_markup(html_macros.$html_textarea_rows$.getGlobalValue());
							html_utilities.html_char(CHAR_quotation, UNPROVIDED);
							html_utilities.html_markup(THREE_INTEGER);
							html_utilities.html_char(CHAR_quotation, UNPROVIDED);
						    }
						    html_utilities.html_char(CHAR_greater, UNPROVIDED);
						    {
							SubLObject _prev_bind_0_160 = html_macros.$html_safe_print$.currentBinding(thread);
							try {
							    html_macros.$html_safe_print$.bind(T, thread);
							    html_utilities.html_princ(value);
							} finally {
							    html_macros.$html_safe_print$.rebind(_prev_bind_0_160, thread);
							}
						    }
						    html_utilities.html_markup(html_macros.$html_textarea_tail$.getGlobalValue());
						    html_utilities.html_br();
						    html_utilities.html_submit_input($$$Go, UNPROVIDED, UNPROVIDED);
						    html_utilities.html_reset_input($$$Reset);
						    html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
						} finally {
						    html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_2, thread);
						    html_macros.$within_html_form$.rebind(_prev_bind_1, thread);
						    html_macros.$html_safe_print$.rebind(_prev_bind_0_159, thread);
						}
					    }
					    html_utilities.html_markup(html_macros.$html_form_tail$.getGlobalValue());
					}
				    }
				    html_thesaurus.tm_footer();
				    html_utilities.html_source_readability_terpri(UNPROVIDED);
				} finally {
				    html_macros.$html_safe_print$.rebind(_prev_bind_0_156, thread);
				}
			    }
			    html_utilities.html_markup(html_macros.$html_body_tail$.getGlobalValue());
			    html_utilities.html_source_readability_terpri(UNPROVIDED);
			} finally {
			    html_macros.$html_inside_bodyP$.rebind(_prev_bind_0, thread);
			}
		    }
		    html_utilities.html_markup(html_macros.$html_html_tail$.getGlobalValue());
		    html_utilities.html_source_readability_terpri(UNPROVIDED);
		}
	    }

	    return NIL;
	}
    }

    public static final SubLObject make_edit_op(SubLObject opcode, SubLObject v_term, SubLObject relation, SubLObject arg, SubLObject thesaurus) {
	{
	    SubLObject op = tm_datastructures.get_tm_op();
	    SubLObject op_161 = op;
	    tm_datastructures._csetf_tm_op_opcode(op_161, opcode);
	    tm_datastructures._csetf_tm_op_relation(op_161, relation);
	    tm_datastructures._csetf_tm_op_inverseP(op_161, NIL);
	    tm_datastructures._csetf_tm_op_args(op_161, list(v_term, arg));
	    tm_datastructures._csetf_tm_op_thesaurus(op_161, thesaurus);
	    tm_datastructures._csetf_tm_op_status(op_161, NIL);
	    tm_datastructures._csetf_tm_op_verifyP(op_161, NIL);
	    tm_datastructures._csetf_tm_op_hiddenP(op_161, NIL);
	    tm_datastructures._csetf_tm_op_description(op_161, NIL);
	    tm_datastructures._csetf_tm_op_description_args(op_161, NIL);
	    if (NIL.isString()) {
		set_op_english(op_161, NIL);
	    } else {
		set_op_english(op_161, UNPROVIDED);
	    }
	    return op;
	}
    }

    public static final SubLObject tm_handle_edit(SubLObject args) {
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    {
		SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
		SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
		try {
		    mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_GENL_MT, thread);
		    mt_relevance_macros.$mt$.bind(tm_datastructures.$tm_mt$.getGlobalValue(), thread);
		    {
			SubLObject relation_symbol = html_utilities.html_extract_input($$$relation, args);
			SubLObject relation = tm_internals.relation_constant_from_abbreviation(relation_symbol);
			SubLObject value_arg = tm_internals.relation_value_arg_from_abbreviation(relation_symbol);
			if (NIL != tm_utilities.tm_single_entry_formatP(relation, value_arg, UNPROVIDED)) {
			    tm_handle_single_entry_edit(args);
			} else {
			    tm_handle_regular_edit(args);
			}
		    }
		} finally {
		    mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
		    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
		}
	    }
	    return NIL;
	}
    }

    public static final SubLObject tm_printable_ascii_charP(SubLObject character) {
	{
	    SubLObject code = char_code(character);
	    return makeBoolean(code.numG($int$31) && code.numL($int$127));
	}
    }

    /**
     * Substitute a space for every garbage character in string
     * that is not inside an embedded string
     */
    public static final SubLObject tm_strip_garbage_chars(SubLObject string, SubLObject embedded_strings_tooP) {
	if (embedded_strings_tooP == UNPROVIDED) {
	    embedded_strings_tooP = NIL;
	}
	{
	    SubLObject inside_dqP = NIL;
	    SubLObject cdotimes_end_var = length(string);
	    SubLObject i = NIL;
	    for (i = ZERO_INTEGER; i.numL(cdotimes_end_var); i = add(i, ONE_INTEGER)) {
		{
		    SubLObject ch = Strings.sublisp_char(string, i);
		    SubLObject code = char_code(ch);
		    if (NIL != charE(ch, CHAR_quotation)) {
			inside_dqP = makeBoolean(NIL == inside_dqP);
		    }
		    if (!((NIL != tm_printable_ascii_charP(ch)) || (((NIL != inside_dqP) && (NIL != member(code, $list_alt333, UNPROVIDED, UNPROVIDED))) && (NIL == embedded_strings_tooP)))) {
			set_aref(string, i, CHAR_space);
		    }
		}
	    }
	}
	return string;
    }

    public static final SubLObject tm_handle_single_entry_edit(SubLObject args) {
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    {
		SubLObject v_term = html_utilities.html_extract_input($$$term, args);
		SubLObject thesaurus = html_utilities.html_extract_input($$$thesaurus, args);
		SubLObject relation_symbol = html_utilities.html_extract_input($$$relation, args);
		SubLObject original = html_utilities.html_extract_input($$$original, args);
		SubLObject override_default_case = html_utilities.html_extract_input($str_alt311$override_default_case, args);
		SubLObject value = html_utilities.html_extract_input($$$value, args);
		SubLObject relation_value_arg_type = tm_internals.tm_relation_argtype(tm_internals.relation_constant_from_abbreviation(relation_symbol), tm_internals.relation_value_arg_from_abbreviation(relation_symbol));
		SubLObject bind_value_for_check_single_entry = at_vars.$at_check_arg_formatP$.getDynamicValue(thread);
		SubLObject ops = NIL;
		original = string_utilities.trim_whitespace(original);
		value = tm_strip_garbage_chars(string_utilities.trim_whitespace(value), UNPROVIDED);
		if (original.equalp($str_alt2$) && (!value.equalp($str_alt2$))) {
		    ops = cons(make_edit_op($ADD, v_term, relation_symbol, value, thesaurus), ops);
		} else if (value.equalp($str_alt2$) && (!original.equalp($str_alt2$))) {
		    ops = cons(make_edit_op($DELETE, v_term, relation_symbol, original, thesaurus), ops);
		} else if ((!original.equalp(value)) || ((!relation_value_arg_type.eql($CONSTANT)) && (!original.equal(value)))) {
		    bind_value_for_check_single_entry = NIL;
		    {
			SubLObject op = tm_datastructures.get_tm_op();
			SubLObject op_162 = op;
			tm_datastructures._csetf_tm_op_opcode(op_162, $REPLACE);
			tm_datastructures._csetf_tm_op_relation(op_162, relation_symbol);
			tm_datastructures._csetf_tm_op_inverseP(op_162, NIL);
			tm_datastructures._csetf_tm_op_args(op_162, list(v_term, original, value));
			tm_datastructures._csetf_tm_op_thesaurus(op_162, thesaurus);
			tm_datastructures._csetf_tm_op_status(op_162, NIL);
			tm_datastructures._csetf_tm_op_verifyP(op_162, NIL);
			tm_datastructures._csetf_tm_op_hiddenP(op_162, NIL);
			tm_datastructures._csetf_tm_op_description(op_162, NIL);
			tm_datastructures._csetf_tm_op_description_args(op_162, NIL);
			if (NIL.isString()) {
			    set_op_english(op_162, NIL);
			} else {
			    set_op_english(op_162, UNPROVIDED);
			}
			ops = cons(op, ops);
		    }
		}

		if (NIL != ops) {
		    {
			SubLObject _prev_bind_0 = at_vars.$at_check_arg_formatP$.currentBinding(thread);
			SubLObject _prev_bind_1 = tm_internals.$tm_use_default_case_for_strings$.currentBinding(thread);
			try {
			    at_vars.$at_check_arg_formatP$.bind(bind_value_for_check_single_entry, thread);
			    tm_internals.$tm_use_default_case_for_strings$.bind(NIL != override_default_case ? ((SubLObject) (NIL)) : T, thread);
			    do_operations(ops, UNPROVIDED);
			} finally {
			    tm_internals.$tm_use_default_case_for_strings$.rebind(_prev_bind_1, thread);
			    at_vars.$at_check_arg_formatP$.rebind(_prev_bind_0, thread);
			}
		    }
		} else {
		    html_thesaurus.tm_error($str_alt322$No_operations_were_specified_, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
		}
	    }
	    return NIL;
	}
    }

    public static final SubLObject tm_handle_regular_edit(SubLObject args) {
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    {
		SubLObject v_term = html_utilities.html_extract_input($$$term, args);
		SubLObject thesaurus = html_utilities.html_extract_input($$$thesaurus, args);
		SubLObject relation_symbol = html_utilities.html_extract_input($$$relation, args);
		SubLObject original = html_utilities.html_extract_input($$$original, args);
		SubLObject override_default_case = html_utilities.html_extract_input($str_alt311$override_default_case, args);
		SubLObject value = html_utilities.html_extract_input($$$value, args);
		SubLObject relation_value_arg_type = tm_internals.tm_relation_argtype(tm_internals.relation_constant_from_abbreviation(relation_symbol), tm_internals.relation_value_arg_from_abbreviation(relation_symbol));
		SubLObject before = string_utilities.extract_lines(original);
		SubLObject after = string_utilities.extract_lines(value);
		if (!relation_value_arg_type.eql($CONSTANT)) {
		    if (NIL == override_default_case) {
			{
			    SubLObject thesaurus_constant = tm_internals.thesaurus_constant_from_abbreviation(thesaurus);
			    SubLObject temp = NIL;
			    if (NIL != thesaurus_constant) {
				{
				    SubLObject cdolist_list_var = after;
				    SubLObject item = NIL;
				    for (item = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), item = cdolist_list_var.first()) {
					temp = cons(tm_internals.canonicalize_string_case_for_thesaurus(item, thesaurus_constant), temp);
				    }
				}
				after = temp;
			    }
			}
		    }
		}
		{
		    SubLObject deletes = set_difference(before, after, symbol_function(EQUALP), UNPROVIDED);
		    SubLObject adds = set_difference(after, before, symbol_function(EQUALP), UNPROVIDED);
		    SubLObject replaces = NIL;
		    if (!relation_value_arg_type.eql($CONSTANT)) {
			deletes = set_difference(before, after, symbol_function(EQUAL), UNPROVIDED);
			adds = set_difference(after, before, symbol_function(EQUAL), UNPROVIDED);
			{
			    SubLObject cdolist_list_var = adds;
			    SubLObject add_case = NIL;
			    for (add_case = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), add_case = cdolist_list_var.first()) {
				{
				    SubLObject delete_case = find(add_case, deletes, symbol_function(EQUALP), UNPROVIDED, UNPROVIDED, UNPROVIDED);
				    if (NIL != delete_case) {
					replaces = cons(list(delete_case, add_case), replaces);
					deletes = remove(delete_case, deletes, symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
				    }
				}
			    }
			}
			{
			    SubLObject add_cases = Mapping.mapcar(symbol_function(SECOND), replaces);
			    adds = set_difference(adds, add_cases, symbol_function(EQUAL), UNPROVIDED);
			}
		    }
		    if (((NIL != adds) || (NIL != deletes)) || (NIL != replaces)) {
			{
			    SubLObject ops = NIL;
			    {
				SubLObject cdolist_list_var = adds;
				SubLObject add = NIL;
				for (add = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), add = cdolist_list_var.first()) {
				    ops = cons(make_edit_op($ADD, v_term, relation_symbol, add, thesaurus), ops);
				}
			    }
			    {
				SubLObject cdolist_list_var = deletes;
				SubLObject delete = NIL;
				for (delete = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), delete = cdolist_list_var.first()) {
				    ops = cons(make_edit_op($DELETE, v_term, relation_symbol, delete, thesaurus), ops);
				}
			    }
			    {
				SubLObject cdolist_list_var = replaces;
				SubLObject replace = NIL;
				for (replace = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), replace = cdolist_list_var.first()) {
				    {
					SubLObject op = tm_datastructures.get_tm_op();
					SubLObject op_163 = op;
					tm_datastructures._csetf_tm_op_opcode(op_163, $REPLACE);
					tm_datastructures._csetf_tm_op_relation(op_163, relation_symbol);
					tm_datastructures._csetf_tm_op_inverseP(op_163, NIL);
					tm_datastructures._csetf_tm_op_args(op_163, cons(v_term, replace));
					tm_datastructures._csetf_tm_op_thesaurus(op_163, thesaurus);
					tm_datastructures._csetf_tm_op_status(op_163, NIL);
					tm_datastructures._csetf_tm_op_verifyP(op_163, NIL);
					tm_datastructures._csetf_tm_op_hiddenP(op_163, NIL);
					tm_datastructures._csetf_tm_op_description(op_163, NIL);
					tm_datastructures._csetf_tm_op_description_args(op_163, NIL);
					if (NIL.isString()) {
					    set_op_english(op_163, NIL);
					} else {
					    set_op_english(op_163, UNPROVIDED);
					}
					ops = cons(op, ops);
				    }
				}
			    }
			    {
				SubLObject _prev_bind_0 = tm_internals.$tm_use_default_case_for_strings$.currentBinding(thread);
				try {
				    tm_internals.$tm_use_default_case_for_strings$.bind(NIL != override_default_case ? ((SubLObject) (NIL)) : T, thread);
				    do_operations(ops, UNPROVIDED);
				} finally {
				    tm_internals.$tm_use_default_case_for_strings$.rebind(_prev_bind_0, thread);
				}
			    }
			}
		    } else {
			html_thesaurus.tm_error($str_alt336$No_operations_were_specified___Yo, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
		    }
		}
	    }
	    return NIL;
	}
    }

    public static final SubLObject tm_full_record_string(SubLObject constant) {
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    {
		SubLObject ans = $str_alt2$;
		SubLObject cdolist_list_var = tm_internals.thesauri_of_concept(constant);
		SubLObject thesaurus = NIL;
		for (thesaurus = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), thesaurus = cdolist_list_var.first()) {
		    if ((NIL != subl_promotions.memberP(thesaurus, tm_datastructures.tm_value(tm_datastructures.$tm_user$.getDynamicValue(thread), $EDIT_THESAURI), UNPROVIDED, UNPROVIDED))
			    && ((tm_datastructures.tm_value(tm_datastructures.$tm_user$.getDynamicValue(thread), $EDITABLE_THESAURI) == $ALL) || (NIL != member(thesaurus, tm_datastructures.tm_value(tm_datastructures.$tm_user$.getDynamicValue(thread), $EDITABLE_THESAURI), UNPROVIDED, UNPROVIDED)))) {
			ans = cconcatenate(ans, format(NIL, $str_alt339$In_Thesaurus____a__, tm_internals.thesaurus_name(thesaurus)));
			{
			    SubLObject relation_specs = tm_io.tm_output_item(constant, list(thesaurus), NIL, NIL, NIL);
			    SubLObject cdolist_list_var_164 = relation_specs;
			    SubLObject relation_spec = NIL;
			    for (relation_spec = cdolist_list_var_164.first(); NIL != cdolist_list_var_164; cdolist_list_var_164 = cdolist_list_var_164.rest(), relation_spec = cdolist_list_var_164.first()) {
				{
				    SubLObject rel_symbol = relation_spec.first();
				    SubLObject value_list = second(relation_spec);
				    if (!rel_symbol.equalp($$$LT)) {
					if (NIL != tm_internals.tm_active_relation_p(tm_internals.relation_constant_from_abbreviation(rel_symbol))) {
					    if (NIL != value_list) {
						ans = cconcatenate(ans, format(NIL, $str_alt341$_a____, rel_symbol));
						value_list = html_tm_browsing.tm_sort_full_record_value_list(value_list);
						{
						    SubLObject cdolist_list_var_165 = value_list;
						    SubLObject value_spec = NIL;
						    for (value_spec = cdolist_list_var_165.first(); NIL != cdolist_list_var_165; cdolist_list_var_165 = cdolist_list_var_165.rest(), value_spec = cdolist_list_var_165.first()) {
							{
							    SubLObject value = value_spec.first();
							    ans = cconcatenate(ans, value.isString() ? ((SubLObject) (format(NIL, $str_alt342$_a__, value))) : format(NIL, $str_alt342$_a__, NIL != forts.fort_p(value) ? ((SubLObject) (tm_datastructures.concept_term(value, thesaurus))) : value));
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
		return ans;
	    }
	}
    }

    /**
     * Prints full record info for CONSTANT from all thesauri which are active for editing and are
     * editable by the user, in separate sections.
     */
    public static final SubLObject tm_full_record_guts_editable(SubLObject constant) {
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    {
		SubLObject omitted_rels = NIL;
		SubLObject cdolist_list_var = tm_internals.thesauri_of_concept(constant);
		SubLObject thesaurus = NIL;
		for (thesaurus = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), thesaurus = cdolist_list_var.first()) {
		    if ((NIL != subl_promotions.memberP(thesaurus, tm_datastructures.tm_value(tm_datastructures.$tm_user$.getDynamicValue(thread), $EDIT_THESAURI), UNPROVIDED, UNPROVIDED))
			    && ((tm_datastructures.tm_value(tm_datastructures.$tm_user$.getDynamicValue(thread), $EDITABLE_THESAURI) == $ALL) || (NIL != member(thesaurus, tm_datastructures.tm_value(tm_datastructures.$tm_user$.getDynamicValue(thread), $EDITABLE_THESAURI), UNPROVIDED, UNPROVIDED)))) {
			format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt343$In_Thesaurus___a, tm_internals.thesaurus_name(thesaurus));
			html_utilities.html_terpri(TWO_INTEGER);
			{
			    SubLObject relation_specs = tm_io.tm_output_item(constant, list(thesaurus), NIL, NIL, NIL);
			    SubLObject cdolist_list_var_166 = relation_specs;
			    SubLObject relation_spec = NIL;
			    for (relation_spec = cdolist_list_var_166.first(); NIL != cdolist_list_var_166; cdolist_list_var_166 = cdolist_list_var_166.rest(), relation_spec = cdolist_list_var_166.first()) {
				{
				    SubLObject rel_symbol = relation_spec.first();
				    SubLObject value_list = second(relation_spec);
				    if (!rel_symbol.equalp($$$LT)) {
					if (NIL != tm_internals.tm_active_relation_p(tm_internals.relation_constant_from_abbreviation(rel_symbol))) {
					    if (NIL != value_list) {
						format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt344$_a__, rel_symbol);
						html_utilities.html_terpri(UNPROVIDED);
						value_list = html_tm_browsing.tm_sort_full_record_value_list(value_list);
						{
						    SubLObject cdolist_list_var_167 = value_list;
						    SubLObject value_spec = NIL;
						    for (value_spec = cdolist_list_var_167.first(); NIL != cdolist_list_var_167; cdolist_list_var_167 = cdolist_list_var_167.rest(), value_spec = cdolist_list_var_167.first()) {
							{
							    SubLObject value = value_spec.first();
							    SubLObject preferred = (NIL != forts.fort_p(value)) ? ((SubLObject) (tm_datastructures.concept_term(value, thesaurus))) : NIL;
							    if (preferred.isString()) {
								preferred = preferred;
							    } else if (value.isString()) {
								value = value;
							    }

							    if (NIL != forts.fort_p(value)) {
								if (preferred.isString()) {
								    html_utilities.html_princ(preferred);
								} else if (value.isString()) {
								    html_utilities.html_princ(value);
								}

							    } else {
								html_utilities.html_princ(value);
							    }
							    html_utilities.html_terpri(UNPROVIDED);
							}
						    }
						}
						html_utilities.html_terpri(UNPROVIDED);
					    }
					} else {
					    omitted_rels = cons(rel_symbol, omitted_rels);
					}
				    }
				}
			    }
			}
		    }
		}
		return omitted_rels;
	    }
	}
    }

    public static final SubLObject tm_full_record_with_editing(SubLObject args) {
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    {
		SubLObject id_string = args.first();
		SubLObject constant = (NIL != string_utilities.non_empty_stringP(id_string)) ? ((SubLObject) (html_thesaurus.tm_guess_fort(id_string))) : NIL;
		SubLObject omitted_rels = NIL;
		SubLObject space_between_gif_and_case_check_box = FIFTEEN_INTEGER;
		tm_datastructures.change_tm_value(tm_datastructures.$tm_user$.getDynamicValue(thread), $TERM, constant, UNPROVIDED);
		{
		    SubLObject color_value = tm_datastructures.tm_value(tm_datastructures.$tm_user$.getDynamicValue(thread), $BG_COLOR_FULL_RECORD);
		    html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
		    html_utilities.html_markup(html_macros.$html_head_head$.getGlobalValue());
		    html_macros.html_head_content_type();
		    html_utilities.html_source_readability_terpri(UNPROVIDED);
		    html_utilities.html_markup(html_macros.$html_title_head$.getGlobalValue());
		    html_utilities.html_princ($$$Thesaurus_Full_Term_Edit);
		    html_utilities.html_markup(html_macros.$html_title_tail$.getGlobalValue());
		    html_utilities.html_markup(html_macros.$html_head_tail$.getGlobalValue());
		    html_utilities.html_source_readability_terpri(UNPROVIDED);
		    {
			SubLObject _prev_bind_0 = html_macros.$html_inside_bodyP$.currentBinding(thread);
			try {
			    html_macros.$html_inside_bodyP$.bind(T, thread);
			    html_utilities.html_markup(html_macros.$html_body_head$.getGlobalValue());
			    if (NIL != color_value) {
				html_utilities.html_markup(html_macros.$html_body_bgcolor$.getGlobalValue());
				html_utilities.html_char(CHAR_quotation, UNPROVIDED);
				html_utilities.html_markup(html_utilities.html_color(color_value));
				html_utilities.html_char(CHAR_quotation, UNPROVIDED);
			    }
			    html_utilities.html_char(CHAR_greater, UNPROVIDED);
			    {
				SubLObject _prev_bind_0_168 = html_macros.$html_safe_print$.currentBinding(thread);
				try {
				    html_macros.$html_safe_print$.bind(T, thread);
				    html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
				    html_utilities.html_markup(ONE_INTEGER);
				    html_utilities.html_char(CHAR_greater, UNPROVIDED);
				    if ((NIL != tm_control_vars.$client_thes_home_page$.getDynamicValue(thread)) && (NIL != tm_control_vars.$client_mini_logo$.getDynamicValue(thread))) {
					html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
					html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
					html_utilities.html_char(CHAR_quotation, UNPROVIDED);
					html_utilities.html_markup(tm_control_vars.$client_thes_home_page$.getDynamicValue(thread));
					html_utilities.html_char(CHAR_quotation, UNPROVIDED);
					html_utilities.html_char(CHAR_greater, UNPROVIDED);
					{
					    SubLObject _prev_bind_0_169 = html_macros.$html_safe_print$.currentBinding(thread);
					    try {
						html_macros.$html_safe_print$.bind(T, thread);
						html_utilities.html_markup(html_macros.$html_image_head$.getGlobalValue());
						html_utilities.html_markup(html_macros.$html_image_src$.getGlobalValue());
						html_utilities.html_char(CHAR_quotation, UNPROVIDED);
						html_utilities.html_markup(tm_control_vars.$client_mini_logo$.getDynamicValue(thread));
						html_utilities.html_char(CHAR_quotation, UNPROVIDED);
						if (NIL != tm_control_vars.$client_name$.getDynamicValue(thread)) {
						    html_utilities.html_markup(html_macros.$html_image_alt$.getGlobalValue());
						    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
						    html_utilities.html_markup(tm_control_vars.$client_name$.getDynamicValue(thread));
						    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
						}
						if (true) {
						    html_utilities.html_markup(html_macros.$html_image_border$.getGlobalValue());
						    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
						    html_utilities.html_markup(ZERO_INTEGER);
						    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
						}
						html_utilities.html_char(CHAR_greater, UNPROVIDED);
						{
						    SubLObject _prev_bind_0_170 = html_macros.$html_safe_print$.currentBinding(thread);
						    try {
							html_macros.$html_safe_print$.bind(T, thread);
						    } finally {
							html_macros.$html_safe_print$.rebind(_prev_bind_0_170, thread);
						    }
						}
						html_utilities.html_markup(html_macros.$html_image_tail$.getGlobalValue());
					    } finally {
						html_macros.$html_safe_print$.rebind(_prev_bind_0_169, thread);
					    }
					}
					html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
				    }
				    html_utilities.html_princ($$$Thesaurus_Full_Term_Edit);
				    html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
				    html_utilities.html_markup(ONE_INTEGER);
				    html_utilities.html_char(CHAR_greater, UNPROVIDED);
				    tm_logging.tm_enqueue_event($$$Thesaurus_Full_Term_Edit);
				    if (!(true && (NIL != tm_internals.privelegedP(tm_datastructures.$tm_user$.getDynamicValue(thread), $str_alt297$limited_editor)))) {
					html_utilities.html_princ($str_alt186$Sorry__you_do_not_have_permission);
				    } else {
					html_thesaurus.thesaurus_heading($str_alt347$tm_full_record_with_editing);
					html_utilities.html_hr(UNPROVIDED, UNPROVIDED);
					if (NIL != tm_internals.editing_allowedP()) {
					    html_utilities.html_markup(html_macros.$html_form_head$.getGlobalValue());
					    html_utilities.html_markup(html_macros.$html_form_action$.getGlobalValue());
					    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
					    html_utilities.html_markup(system_parameters.$cyc_cgi_program$.getDynamicValue(thread));
					    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
					    if (NIL != html_macros.$html_form_method_post$.getGlobalValue()) {
						html_utilities.html_markup(html_macros.$html_form_method$.getGlobalValue());
						html_utilities.html_char(CHAR_quotation, UNPROVIDED);
						html_utilities.html_markup(html_macros.$html_form_method_post$.getGlobalValue());
						html_utilities.html_char(CHAR_quotation, UNPROVIDED);
					    }
					    html_utilities.html_char(CHAR_greater, UNPROVIDED);
					    {
						SubLObject _prev_bind_0_171 = html_macros.$html_safe_print$.currentBinding(thread);
						SubLObject _prev_bind_1 = html_macros.$within_html_form$.currentBinding(thread);
						SubLObject _prev_bind_2 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
						try {
						    html_macros.$html_safe_print$.bind(T, thread);
						    html_macros.$within_html_form$.bind(T, thread);
						    html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
						    html_utilities.html_hidden_input($str_alt348$tm_handle_edit_record, T, UNPROVIDED);
						    html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
						    html_tm_browsing.tm_thesaurus_constant(constant, NIL, T, NIL, UNPROVIDED, UNPROVIDED, UNPROVIDED);
						    html_utilities.html_br();
						    html_utilities.html_br();
						    html_utilities.html_princ($str_alt349$Edit_information_about_the_term_i);
						    html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
						    html_utilities.html_br();
						    html_utilities.html_submit_input($$$Submit_Changes, UNPROVIDED, UNPROVIDED);
						    html_utilities.html_reset_input($$$Reset);
						    html_thesaurus.tm_link($VIEW_RELATIONS, UNPROVIDED, UNPROVIDED, UNPROVIDED);
						    html_utilities.html_indent(space_between_gif_and_case_check_box);
						    html_utilities.html_checkbox_input($str_alt311$override_default_case, $$$T, NIL == tm_internals.$tm_use_default_case_for_strings$.getDynamicValue(thread) ? ((SubLObject) (T)) : NIL, UNPROVIDED, UNPROVIDED, UNPROVIDED);
						    html_utilities.html_princ($$$Override_Default_Case);
						    html_utilities.html_br();
						    html_utilities.html_hidden_input($str_alt352$id_string, id_string, UNPROVIDED);
						    html_utilities.html_markup(html_macros.$html_textarea_head$.getGlobalValue());
						    html_utilities.html_markup(html_macros.$html_textarea_name$.getGlobalValue());
						    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
						    html_utilities.html_markup($str_alt353$full_edit_info);
						    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
						    if (true) {
							html_utilities.html_markup(html_macros.$html_textarea_cols$.getGlobalValue());
							html_utilities.html_char(CHAR_quotation, UNPROVIDED);
							html_utilities.html_markup($int$60);
							html_utilities.html_char(CHAR_quotation, UNPROVIDED);
						    }
						    if (true) {
							html_utilities.html_markup(html_macros.$html_textarea_rows$.getGlobalValue());
							html_utilities.html_char(CHAR_quotation, UNPROVIDED);
							html_utilities.html_markup(TWENTY_INTEGER);
							html_utilities.html_char(CHAR_quotation, UNPROVIDED);
						    }
						    html_utilities.html_char(CHAR_greater, UNPROVIDED);
						    {
							SubLObject _prev_bind_0_172 = html_macros.$html_safe_print$.currentBinding(thread);
							try {
							    html_macros.$html_safe_print$.bind(T, thread);
							    omitted_rels = tm_full_record_guts_editable(constant);
							} finally {
							    html_macros.$html_safe_print$.rebind(_prev_bind_0_172, thread);
							}
						    }
						    html_utilities.html_markup(html_macros.$html_textarea_tail$.getGlobalValue());
						    html_utilities.html_br();
						    if (NIL != omitted_rels) {
							format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt354$Note__Facts_involving_these_inact, string_utilities.stringify_items(omitted_rels, symbol_function(IDENTITY), $str_alt355$__, UNPROVIDED));
						    }
						    html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
						} finally {
						    html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_2, thread);
						    html_macros.$within_html_form$.rebind(_prev_bind_1, thread);
						    html_macros.$html_safe_print$.rebind(_prev_bind_0_171, thread);
						}
					    }
					    html_utilities.html_markup(html_macros.$html_form_tail$.getGlobalValue());
					} else {
					    html_thesaurus.tm_report_editing_disabled();
					}
				    }
				    html_thesaurus.tm_footer();
				    html_utilities.html_source_readability_terpri(UNPROVIDED);
				} finally {
				    html_macros.$html_safe_print$.rebind(_prev_bind_0_168, thread);
				}
			    }
			    html_utilities.html_markup(html_macros.$html_body_tail$.getGlobalValue());
			    html_utilities.html_source_readability_terpri(UNPROVIDED);
			} finally {
			    html_macros.$html_inside_bodyP$.rebind(_prev_bind_0, thread);
			}
		    }
		    html_utilities.html_markup(html_macros.$html_html_tail$.getGlobalValue());
		    html_utilities.html_source_readability_terpri(UNPROVIDED);
		}
	    }
	    return NIL;
	}
    }

    public static final SubLObject tm_tokenizer_test_1(SubLObject ch) {
	return makeBoolean(NIL == find(char_code(ch), $list_alt333, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
    }

    public static final SubLObject tm_tokenizer_test_2(SubLObject ch) {
	return makeBoolean(ch != CHAR_space);
    }

    public static final SubLObject tm_tokenizer_test_3(SubLObject ch) {
	return makeBoolean(ch != CHAR_colon);
    }

    public static final SubLObject tm_reduce_predicate_string(SubLObject directive_strings, SubLObject string) {
	{
	    SubLObject v_new = string_utilities.copy_string(string);
	    v_new = string_utilities.string_subst($str_alt2$, $str_alt357$_, v_new, UNPROVIDED);
	    v_new = string_utilities.string_subst($str_alt2$, $str_alt44$_, v_new, UNPROVIDED);
	    if (NIL != find(v_new, directive_strings, symbol_function(EQUALP), UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
		return v_new;
	    } else {
		return string;
	    }
	}
    }

    public static final SubLObject tm_reduce_predicates(SubLObject directive_string_list, SubLObject string_list) {
	{
	    SubLObject ans = NIL;
	    SubLObject cdolist_list_var = string_list;
	    SubLObject string = NIL;
	    for (string = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), string = cdolist_list_var.first()) {
		ans = cons(tm_reduce_predicate_string(directive_string_list, string), ans);
	    }
	    return nreverse(ans);
	}
    }

    public static final SubLObject tm_reduce_in_thesaurus_directive(SubLObject string) {
	if (NIL == string_utilities.substringP($$$thesaurus, string, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
	    return list(string);
	}
	{
	    SubLObject tokens = Mapping.mapcar(symbol_function(TRIM_SIDES), string_utilities.break_words(string, symbol_function(TM_TOKENIZER_TEST_2), UNPROVIDED));
	    SubLObject s1 = tokens.first();
	    SubLObject s2 = second(tokens);
	    SubLObject ans = NIL;
	    if (s1.equalp($$$In) && (NIL != string_utilities.substringP($$$thesaurus, s2, UNPROVIDED, UNPROVIDED, UNPROVIDED))) {
		tokens = remove($str_alt357$_, tokens, symbol_function(EQUALP), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
		ans = cons($$$In_Thesaurus, ans);
		ans = cons(string_utilities.bunge(nthcdr(TWO_INTEGER, tokens), UNPROVIDED), ans);
	    } else {
		ans = list(string);
	    }
	    return nreverse(ans);
	}
    }

    public static final SubLObject tm_reduce_thesaurus_directives(SubLObject token_strings) {
	{
	    SubLObject ans = NIL;
	    SubLObject cdolist_list_var = token_strings;
	    SubLObject string = NIL;
	    for (string = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), string = cdolist_list_var.first()) {
		{
		    SubLObject processed = tm_reduce_in_thesaurus_directive(string);
		    SubLObject cdolist_list_var_173 = processed;
		    SubLObject p = NIL;
		    for (p = cdolist_list_var_173.first(); NIL != cdolist_list_var_173; cdolist_list_var_173 = cdolist_list_var_173.rest(), p = cdolist_list_var_173.first()) {
			ans = cons(p, ans);
		    }
		}
	    }
	    return nreverse(ans);
	}
    }

    public static final SubLObject tm_tokenize_input(SubLObject text) {
	{
	    SubLObject directive_strings = Mapping.mapcar(symbol_function(CAR), tm_datastructures.$tm_relation_predicate_map$.getGlobalValue());
	    SubLObject strings_to_return = NIL;
	    strings_to_return = tm_tokenize_1(text);
	    strings_to_return = tm_reduce_predicates(directive_strings, strings_to_return);
	    strings_to_return = tm_reduce_thesaurus_directives(strings_to_return);
	    strings_to_return = tm_tokenize_3(directive_strings, strings_to_return);
	    strings_to_return = remove($str_alt2$, strings_to_return, symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
	    return strings_to_return;
	}
    }

    /**
     * Break into strings by #tab, #linefeed, or #return
     */
    public static final SubLObject tm_tokenize_1(SubLObject text) {
	return list_utilities.delete_if_not(symbol_function(STRINGP), Mapping.mapcar(symbol_function(TRIM_SIDES), string_utilities.break_words(text, symbol_function(TM_TOKENIZER_TEST_1), UNPROVIDED)), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    /**
     * Final processing step, to reassemble scope notes and do the
     * right thing with embedded colons
     */
    public static final SubLObject tm_tokenize_3(SubLObject directive_strings, SubLObject string_list) {
	{
	    SubLObject ans = NIL;
	    SubLObject inside_scope_noteP = NIL;
	    SubLObject temp = NIL;
	    SubLObject done = NIL;
	    SubLObject sl = NIL;
	    SubLObject string = NIL;
	    for (sl = string_list, string = sl.first(); NIL == done; sl = sl.rest(), string = sl.first()) {
		if (NIL == string) {
		    if (NIL != temp) {
			ans = cons(string_utilities.bunge(nreverse(temp), UNPROVIDED), ans);
			temp = NIL;
		    }
		    inside_scope_noteP = NIL;
		    done = T;
		} else if (string.equalp($$$SN)) {
		    ans = cons(string, ans);
		    inside_scope_noteP = T;
		} else if ((NIL != find(string, directive_strings, symbol_function(EQUALP), UNPROVIDED, UNPROVIDED, UNPROVIDED)) || string.equalp($$$In_Thesaurus)) {
		    if (NIL != temp) {
			ans = cons(string_utilities.bunge(nreverse(temp), UNPROVIDED), ans);
			temp = NIL;
		    }
		    inside_scope_noteP = NIL;
		    ans = cons(string, ans);
		} else if (NIL != inside_scope_noteP) {
		    temp = cons(string_utilities.trim_sides(string_utilities.string_subst($str_alt357$_, $str_alt365$__, string, UNPROVIDED), UNPROVIDED), temp);
		} else {
		    ans = cons(string, ans);
		}

	    }
	    return nreverse(ans);
	}
    }

    public static final SubLObject abbrev_triple(SubLObject string) {
	return find(string, tm_datastructures.$tm_relation_predicate_map$.getGlobalValue(), symbol_function(EQUALP), symbol_function(CAR), UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject isa_or_defnP(SubLObject v_object, SubLObject collection, SubLObject mt) {
	if (mt == UNPROVIDED) {
	    mt = mt_relevance_macros.$mt$.getDynamicValue();
	}
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    {
		SubLObject defn = NIL;
		SubLObject ans = NIL;
		{
		    SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
		    SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
		    try {
			mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
			mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
			if (NIL == defn) {
			    {
				SubLObject csome_list_var = $list_alt368;
				SubLObject p = NIL;
				for (p = csome_list_var.first(); !((NIL != defn) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest(), p = csome_list_var.first()) {
				    defn = el_utilities.cycl_subl_symbol_symbol(kb_mapping_utilities.fpred_value(collection, p, UNPROVIDED, UNPROVIDED, UNPROVIDED));
				}
			    }
			}
		    } finally {
			mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
			mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
		    }
		}
		if (NIL != fboundp(defn)) {
		    ans = funcall(defn, v_object);
		} else {
		    {
			SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
			SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
			try {
			    mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_GENL_MT, thread);
			    mt_relevance_macros.$mt$.bind(mt, thread);
			    ans = isa.isaP(v_object, collection, UNPROVIDED, UNPROVIDED);
			} finally {
			    mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
			    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
			}
		    }
		}
		return ans;
	    }
	}
    }

    public static final SubLObject maybe_set_current_relation_map(SubLObject string) {
	{
	    SubLObject form = abbrev_triple(string);
	    if (NIL != form) {
		html_thesaurus.$tm_current_relation_map$.setDynamicValue(form);
	    }
	    return form;
	}
    }

    public static final SubLObject tm_parse_non_directive(SubLObject constant, SubLObject string) {
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    {
		SubLObject relation_string = html_thesaurus.$tm_current_relation_map$.getDynamicValue(thread).first();
		SubLObject mt = tm_internals.thesaurus_constant_from_string(html_thesaurus.$tm_editing_mt_string$.getDynamicValue(thread));
		SubLObject term_string = (NIL != forts.valid_fortP(constant)) ? ((SubLObject) (tm_datastructures.concept_term(constant, mt))) : NIL;
		SubLObject ans = NIL;
		if ((NIL != relation_string) && term_string.isString()) {
		    ans = cons(list(relation_string, term_string, string), list(html_thesaurus.$tm_editing_mt_string$.getDynamicValue(thread)));
		} else if (!((NIL != relation_string) || term_string.isString())) {
		    ans = cons(list($UNKNOWN_RELATION, $UNKNOWN_TERM, string), list(html_thesaurus.$tm_editing_mt_string$.getDynamicValue(thread)));
		} else if (NIL != relation_string) {
		    ans = cons(list(relation_string, $UNKNOWN_TERM, string), list(html_thesaurus.$tm_editing_mt_string$.getDynamicValue(thread)));
		} else if (term_string.isString()) {
		    ans = cons(list($UNKNOWN_RELATION, term_string), list(html_thesaurus.$tm_editing_mt_string$.getDynamicValue(thread)));
		}

		return ans;
	    }
	}
    }

    public static final SubLObject tm_parse_token_list(SubLObject constant, SubLObject token_list) {
	{
	    SubLObject ans = NIL;
	    for (; NIL != token_list;) {
		{
		    SubLObject s1 = token_list.first();
		    SubLObject s2 = second(token_list);
		    if (s1.equalp($$$In_Thesaurus) && s2.isString()) {
			html_thesaurus.$tm_editing_mt_string$.setDynamicValue(s2);
			token_list = cddr(token_list);
		    } else if (NIL != maybe_set_current_relation_map(s1)) {
			token_list = token_list.rest();
		    } else {
			ans = cons(tm_parse_non_directive(constant, s1), ans);
			token_list = token_list.rest();
		    }

		}
	    }
	    ans = nreverse(ans);
	    return ans;
	}
    }

    public static final SubLObject tm_handle_edit_record(SubLObject args) {
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    {
		SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
		SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
		try {
		    mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_GENL_MT, thread);
		    mt_relevance_macros.$mt$.bind(tm_datastructures.$tm_mt$.getGlobalValue(), thread);
		    {
			SubLObject ops = NIL;
			SubLObject override_default_case = html_utilities.html_extract_input($str_alt311$override_default_case, args);
			SubLObject id_string = html_utilities.html_extract_input($str_alt352$id_string, args);
			SubLObject id = (NIL != string_utilities.non_empty_stringP(id_string)) ? ((SubLObject) (read_from_string_ignoring_errors(id_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED))) : NIL;
			SubLObject constant = html_thesaurus.tm_guess_fort(id);
			SubLObject old = hash_table_utilities.hash_list_elements(tm_parse_token_list(constant, tm_tokenize_input(tm_full_record_string(constant))), UNPROVIDED, UNPROVIDED, UNPROVIDED);
			SubLObject v_new = hash_table_utilities.hash_list_elements(tm_parse_token_list(constant, tm_tokenize_input(html_utilities.html_extract_input($str_alt353$full_edit_info, args))), UNPROVIDED, UNPROVIDED, UNPROVIDED);
			{
			    SubLObject spec = NIL;
			    SubLObject val = NIL;
			    {
				final Iterator cdohash_iterator = getEntrySetIterator(old);
				try {
				    while (iteratorHasNext(cdohash_iterator)) {
					final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
					spec = getEntryKey(cdohash_entry);
					val = getEntryValue(cdohash_entry);
					if (NIL == gethash(spec, v_new, UNPROVIDED)) {
					    {
						SubLObject datum = spec;
						SubLObject current = datum;
						destructuring_bind_must_consp(current, datum, $list_alt371);
						{
						    SubLObject temp = current.rest();
						    current = current.first();
						    {
							SubLObject relation = NIL;
							destructuring_bind_must_consp(current, datum, $list_alt371);
							relation = current.first();
							current = current.rest();
							{
							    SubLObject args_174 = current;
							    current = temp;
							    {
								SubLObject mt = NIL;
								destructuring_bind_must_consp(current, datum, $list_alt371);
								mt = current.first();
								current = current.rest();
								if (NIL == current) {
								    {
									SubLObject pred = tm_internals.relation_constant_from_abbreviation(relation);
									SubLObject deleteP = NIL;
									if ((NIL != forts.fort_p(pred)) && arity.arity(pred).eql(TWO_INTEGER)) {
									    if (NIL != tm_utilities.tm_single_entry_formatP(pred, ONE_INTEGER, UNPROVIDED)) {
										{
										    SubLObject replacedP = NIL;
										    SubLObject spec2 = NIL;
										    SubLObject val2 = NIL;
										    {
											final Iterator cdohash_iterator_175 = getEntrySetIterator(v_new);
											try {
											    while (iteratorHasNext(cdohash_iterator_175)) {
												final Map.Entry cdohash_entry_176 = iteratorNextEntry(cdohash_iterator_175);
												spec2 = getEntryKey(cdohash_entry_176);
												val2 = getEntryValue(cdohash_entry_176);
												{
												    SubLObject datum_177 = spec2;
												    SubLObject current_178 = datum_177;
												    destructuring_bind_must_consp(current_178, datum_177, $list_alt372);
												    {
													SubLObject temp_179 = current_178.rest();
													current_178 = current_178.first();
													{
													    SubLObject relation2 = NIL;
													    destructuring_bind_must_consp(current_178, datum_177, $list_alt372);
													    relation2 = current_178.first();
													    current_178 = current_178.rest();
													    {
														SubLObject args2 = current_178;
														current_178 = temp_179;
														{
														    SubLObject mt2 = NIL;
														    destructuring_bind_must_consp(current_178, datum_177, $list_alt372);
														    mt2 = current_178.first();
														    current_178 = current_178.rest();
														    if (NIL == current_178) {
															if ((relation.equal(relation2) && mt.equal(mt2)) && second(args_174).equal(second(args2))) {
															    {
																SubLObject op = tm_datastructures.make_tm_op(UNPROVIDED);
																SubLObject op_180 = op;
																tm_datastructures._csetf_tm_op_opcode(op_180, $REPLACE);
																tm_datastructures._csetf_tm_op_relation(op_180, relation);
																tm_datastructures._csetf_tm_op_inverseP(op_180, NIL);
																tm_datastructures._csetf_tm_op_args(op_180, list(second(args_174), args_174.first(), args2.first()));
																tm_datastructures._csetf_tm_op_thesaurus(op_180, mt);
																tm_datastructures._csetf_tm_op_status(op_180, NIL);
																tm_datastructures._csetf_tm_op_verifyP(op_180, NIL);
																tm_datastructures._csetf_tm_op_hiddenP(op_180, NIL);
																tm_datastructures._csetf_tm_op_description(op_180, NIL);
																tm_datastructures._csetf_tm_op_description_args(op_180, NIL);
																if (NIL.isString()) {
																    set_op_english(op_180, NIL);
																} else {
																    set_op_english(op_180, UNPROVIDED);
																}
																ops = cons(op, ops);
															    }
															    remhash(spec2, v_new);
															    replacedP = T;
															}
														    } else {
															cdestructuring_bind_error(datum_177, $list_alt372);
														    }
														}
													    }
													}
												    }
												}
											    }
											} finally {
											    releaseEntrySetIterator(cdohash_iterator_175);
											}
										    }
										    if (NIL == replacedP) {
											deleteP = T;
										    }
										}
									    } else if (NIL != tm_utilities.tm_single_entry_formatP(pred, TWO_INTEGER, UNPROVIDED)) {
										{
										    SubLObject replacedP = NIL;
										    SubLObject spec2 = NIL;
										    SubLObject val2 = NIL;
										    {
											final Iterator cdohash_iterator_181 = getEntrySetIterator(v_new);
											try {
											    while (iteratorHasNext(cdohash_iterator_181)) {
												final Map.Entry cdohash_entry_182 = iteratorNextEntry(cdohash_iterator_181);
												spec2 = getEntryKey(cdohash_entry_182);
												val2 = getEntryValue(cdohash_entry_182);
												{
												    SubLObject datum_183 = spec2;
												    SubLObject current_184 = datum_183;
												    destructuring_bind_must_consp(current_184, datum_183, $list_alt372);
												    {
													SubLObject temp_185 = current_184.rest();
													current_184 = current_184.first();
													{
													    SubLObject relation2 = NIL;
													    destructuring_bind_must_consp(current_184, datum_183, $list_alt372);
													    relation2 = current_184.first();
													    current_184 = current_184.rest();
													    {
														SubLObject args2 = current_184;
														current_184 = temp_185;
														{
														    SubLObject mt2 = NIL;
														    destructuring_bind_must_consp(current_184, datum_183, $list_alt372);
														    mt2 = current_184.first();
														    current_184 = current_184.rest();
														    if (NIL == current_184) {
															if ((relation.equal(relation2) && mt.equal(mt2)) && args_174.first().equal(args2.first())) {
															    {
																SubLObject op = tm_datastructures.make_tm_op(UNPROVIDED);
																SubLObject op_186 = op;
																tm_datastructures._csetf_tm_op_opcode(op_186, $REPLACE);
																tm_datastructures._csetf_tm_op_relation(op_186, relation);
																tm_datastructures._csetf_tm_op_inverseP(op_186, NIL);
																tm_datastructures._csetf_tm_op_args(op_186, list(args_174.first(), second(args_174), second(args2)));
																tm_datastructures._csetf_tm_op_thesaurus(op_186, mt);
																tm_datastructures._csetf_tm_op_status(op_186, NIL);
																tm_datastructures._csetf_tm_op_verifyP(op_186, NIL);
																tm_datastructures._csetf_tm_op_hiddenP(op_186, NIL);
																tm_datastructures._csetf_tm_op_description(op_186, NIL);
																tm_datastructures._csetf_tm_op_description_args(op_186, NIL);
																if (NIL.isString()) {
																    set_op_english(op_186, NIL);
																} else {
																    set_op_english(op_186, UNPROVIDED);
																}
																ops = cons(op, ops);
															    }
															    remhash(spec2, v_new);
															    replacedP = T;
															}
														    } else {
															cdestructuring_bind_error(datum_183, $list_alt372);
														    }
														}
													    }
													}
												    }
												}
											    }
											} finally {
											    releaseEntrySetIterator(cdohash_iterator_181);
											}
										    }
										    if (NIL == replacedP) {
											deleteP = T;
										    }
										}
									    } else {
										deleteP = T;
									    }

									} else {
									    deleteP = T;
									}
									if (NIL != deleteP) {
									    {
										SubLObject op = tm_datastructures.make_tm_op(UNPROVIDED);
										SubLObject op_187 = op;
										tm_datastructures._csetf_tm_op_opcode(op_187, $DELETE);
										tm_datastructures._csetf_tm_op_relation(op_187, relation);
										tm_datastructures._csetf_tm_op_inverseP(op_187, NIL);
										tm_datastructures._csetf_tm_op_args(op_187, args_174);
										tm_datastructures._csetf_tm_op_thesaurus(op_187, mt);
										tm_datastructures._csetf_tm_op_status(op_187, NIL);
										tm_datastructures._csetf_tm_op_verifyP(op_187, NIL);
										tm_datastructures._csetf_tm_op_hiddenP(op_187, NIL);
										tm_datastructures._csetf_tm_op_description(op_187, NIL);
										tm_datastructures._csetf_tm_op_description_args(op_187, NIL);
										if (NIL.isString()) {
										    set_op_english(op_187, NIL);
										} else {
										    set_op_english(op_187, UNPROVIDED);
										}
										ops = cons(op, ops);
									    }
									}
								    }
								} else {
								    cdestructuring_bind_error(datum, $list_alt371);
								}
							    }
							}
						    }
						}
					    }
					}
				    }
				} finally {
				    releaseEntrySetIterator(cdohash_iterator);
				}
			    }
			}
			{
			    SubLObject spec = NIL;
			    SubLObject val = NIL;
			    {
				final Iterator cdohash_iterator = getEntrySetIterator(v_new);
				try {
				    while (iteratorHasNext(cdohash_iterator)) {
					final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
					spec = getEntryKey(cdohash_entry);
					val = getEntryValue(cdohash_entry);
					if (NIL == gethash(spec, old, UNPROVIDED)) {
					    {
						SubLObject datum = spec;
						SubLObject current = datum;
						destructuring_bind_must_consp(current, datum, $list_alt371);
						{
						    SubLObject temp = current.rest();
						    current = current.first();
						    {
							SubLObject relation = NIL;
							destructuring_bind_must_consp(current, datum, $list_alt371);
							relation = current.first();
							current = current.rest();
							{
							    SubLObject args_188 = current;
							    current = temp;
							    {
								SubLObject mt = NIL;
								destructuring_bind_must_consp(current, datum, $list_alt371);
								mt = current.first();
								current = current.rest();
								if (NIL == current) {
								    {
									SubLObject op = tm_datastructures.make_tm_op(UNPROVIDED);
									SubLObject op_189 = op;
									tm_datastructures._csetf_tm_op_opcode(op_189, $ADD);
									tm_datastructures._csetf_tm_op_relation(op_189, relation);
									tm_datastructures._csetf_tm_op_inverseP(op_189, NIL);
									tm_datastructures._csetf_tm_op_args(op_189, args_188);
									tm_datastructures._csetf_tm_op_thesaurus(op_189, mt);
									tm_datastructures._csetf_tm_op_status(op_189, NIL);
									tm_datastructures._csetf_tm_op_verifyP(op_189, NIL);
									tm_datastructures._csetf_tm_op_hiddenP(op_189, NIL);
									tm_datastructures._csetf_tm_op_description(op_189, NIL);
									tm_datastructures._csetf_tm_op_description_args(op_189, NIL);
									if (NIL.isString()) {
									    set_op_english(op_189, NIL);
									} else {
									    set_op_english(op_189, UNPROVIDED);
									}
									ops = cons(op, ops);
								    }
								} else {
								    cdestructuring_bind_error(datum, $list_alt371);
								}
							    }
							}
						    }
						}
					    }
					}
				    }
				} finally {
				    releaseEntrySetIterator(cdohash_iterator);
				}
			    }
			}
			{
			    SubLObject _prev_bind_0_190 = tm_internals.$tm_use_default_case_for_strings$.currentBinding(thread);
			    try {
				tm_internals.$tm_use_default_case_for_strings$.bind(NIL != override_default_case ? ((SubLObject) (NIL)) : T, thread);
				do_operations(ops, T);
			    } finally {
				tm_internals.$tm_use_default_case_for_strings$.rebind(_prev_bind_0_190, thread);
			    }
			}
		    }
		} finally {
		    mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
		    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
		}
	    }
	    return NIL;
	}
    }

    /**
     * Produce a page to enable user to specify term to delete
     */
    public static final SubLObject tm_delete_term(SubLObject args) {
	if (args == UNPROVIDED) {
	    args = NIL;
	}
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    {
		SubLObject color_value = tm_datastructures.$tm_bg_color_default$.getDynamicValue(thread);
		html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
		html_utilities.html_markup(html_macros.$html_head_head$.getGlobalValue());
		html_macros.html_head_content_type();
		html_utilities.html_source_readability_terpri(UNPROVIDED);
		html_utilities.html_markup(html_macros.$html_title_head$.getGlobalValue());
		html_utilities.html_princ($$$Delete_Term);
		html_utilities.html_markup(html_macros.$html_title_tail$.getGlobalValue());
		html_utilities.html_markup(html_macros.$html_head_tail$.getGlobalValue());
		html_utilities.html_source_readability_terpri(UNPROVIDED);
		{
		    SubLObject _prev_bind_0 = html_macros.$html_inside_bodyP$.currentBinding(thread);
		    try {
			html_macros.$html_inside_bodyP$.bind(T, thread);
			html_utilities.html_markup(html_macros.$html_body_head$.getGlobalValue());
			if (NIL != color_value) {
			    html_utilities.html_markup(html_macros.$html_body_bgcolor$.getGlobalValue());
			    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
			    html_utilities.html_markup(html_utilities.html_color(color_value));
			    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
			}
			html_utilities.html_char(CHAR_greater, UNPROVIDED);
			{
			    SubLObject _prev_bind_0_191 = html_macros.$html_safe_print$.currentBinding(thread);
			    try {
				html_macros.$html_safe_print$.bind(T, thread);
				html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
				html_utilities.html_markup(ONE_INTEGER);
				html_utilities.html_char(CHAR_greater, UNPROVIDED);
				if ((NIL != tm_control_vars.$client_thes_home_page$.getDynamicValue(thread)) && (NIL != tm_control_vars.$client_mini_logo$.getDynamicValue(thread))) {
				    html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
				    html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
				    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
				    html_utilities.html_markup(tm_control_vars.$client_thes_home_page$.getDynamicValue(thread));
				    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
				    html_utilities.html_char(CHAR_greater, UNPROVIDED);
				    {
					SubLObject _prev_bind_0_192 = html_macros.$html_safe_print$.currentBinding(thread);
					try {
					    html_macros.$html_safe_print$.bind(T, thread);
					    html_utilities.html_markup(html_macros.$html_image_head$.getGlobalValue());
					    html_utilities.html_markup(html_macros.$html_image_src$.getGlobalValue());
					    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
					    html_utilities.html_markup(tm_control_vars.$client_mini_logo$.getDynamicValue(thread));
					    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
					    if (NIL != tm_control_vars.$client_name$.getDynamicValue(thread)) {
						html_utilities.html_markup(html_macros.$html_image_alt$.getGlobalValue());
						html_utilities.html_char(CHAR_quotation, UNPROVIDED);
						html_utilities.html_markup(tm_control_vars.$client_name$.getDynamicValue(thread));
						html_utilities.html_char(CHAR_quotation, UNPROVIDED);
					    }
					    if (true) {
						html_utilities.html_markup(html_macros.$html_image_border$.getGlobalValue());
						html_utilities.html_char(CHAR_quotation, UNPROVIDED);
						html_utilities.html_markup(ZERO_INTEGER);
						html_utilities.html_char(CHAR_quotation, UNPROVIDED);
					    }
					    html_utilities.html_char(CHAR_greater, UNPROVIDED);
					    {
						SubLObject _prev_bind_0_193 = html_macros.$html_safe_print$.currentBinding(thread);
						try {
						    html_macros.$html_safe_print$.bind(T, thread);
						} finally {
						    html_macros.$html_safe_print$.rebind(_prev_bind_0_193, thread);
						}
					    }
					    html_utilities.html_markup(html_macros.$html_image_tail$.getGlobalValue());
					} finally {
					    html_macros.$html_safe_print$.rebind(_prev_bind_0_192, thread);
					}
				    }
				    html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
				}
				html_utilities.html_princ($$$Delete_Term);
				html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
				html_utilities.html_markup(ONE_INTEGER);
				html_utilities.html_char(CHAR_greater, UNPROVIDED);
				tm_logging.tm_enqueue_event($$$Delete_Term);
				if (!(true && (NIL != tm_internals.privelegedP(tm_datastructures.$tm_user$.getDynamicValue(thread), $str_alt297$limited_editor)))) {
				    html_utilities.html_princ($str_alt186$Sorry__you_do_not_have_permission);
				} else {
				    html_thesaurus.thesaurus_heading($str_alt375$tm_delete_term);
				    html_utilities.html_hr(UNPROVIDED, UNPROVIDED);
				    if (NIL != tm_internals.editing_allowedP()) {
					html_utilities.html_markup(html_macros.$html_form_head$.getGlobalValue());
					html_utilities.html_markup(html_macros.$html_form_action$.getGlobalValue());
					html_utilities.html_char(CHAR_quotation, UNPROVIDED);
					html_utilities.html_markup(system_parameters.$cyc_cgi_program$.getDynamicValue(thread));
					html_utilities.html_char(CHAR_quotation, UNPROVIDED);
					if (NIL != html_macros.$html_form_method_post$.getGlobalValue()) {
					    html_utilities.html_markup(html_macros.$html_form_method$.getGlobalValue());
					    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
					    html_utilities.html_markup(html_macros.$html_form_method_post$.getGlobalValue());
					    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
					}
					html_utilities.html_char(CHAR_greater, UNPROVIDED);
					{
					    SubLObject _prev_bind_0_194 = html_macros.$html_safe_print$.currentBinding(thread);
					    SubLObject _prev_bind_1 = html_macros.$within_html_form$.currentBinding(thread);
					    SubLObject _prev_bind_2 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
					    try {
						html_macros.$html_safe_print$.bind(T, thread);
						html_macros.$within_html_form$.bind(T, thread);
						html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
						html_utilities.html_hidden_input($str_alt376$tm_handle_delete_term, T, UNPROVIDED);
						html_utilities.html_princ($str_alt377$Delete_Term_);
						html_utilities.html_br();
						{
						    SubLObject v_term = tm_datastructures.tm_value(tm_datastructures.$tm_user$.getDynamicValue(thread), $TERM);
						    SubLObject string_to_show = (NIL != v_term) ? ((SubLObject) (tm_internals.tm_string_for_constant(v_term, NIL, NIL, T))) : $str_alt2$;
						    SubLObject length = max($int$40, length(string_to_show));
						    html_utilities.html_text_input($str_alt378$delete_term, string_to_show, length);
						}
						html_utilities.html_br();
						html_utilities.html_br();
						html_utilities.html_princ($str_alt379$In_Thesauri__);
						html_utilities.html_br();
						html_thesaurus.tm_edit_thesaurus_selection(T, UNPROVIDED, UNPROVIDED, UNPROVIDED);
						html_utilities.html_br();
						html_utilities.html_br();
						html_utilities.html_radio_input($str_alt380$how_much, $str_alt381$_splice_out, T);
						html_utilities.html_princ($str_alt382$Delete_term_only_);
						html_utilities.html_br();
						html_utilities.html_radio_input($str_alt380$how_much, $str_alt383$_nuke, UNPROVIDED);
						html_utilities.html_princ($str_alt384$Delete_term_and_all_dependent_nar);
						html_utilities.html_br();
						html_utilities.html_br();
						html_utilities.html_submit_input($$$Delete, UNPROVIDED, UNPROVIDED);
						html_utilities.html_reset_input(UNPROVIDED);
						html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
					    } finally {
						html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_2, thread);
						html_macros.$within_html_form$.rebind(_prev_bind_1, thread);
						html_macros.$html_safe_print$.rebind(_prev_bind_0_194, thread);
					    }
					}
					html_utilities.html_markup(html_macros.$html_form_tail$.getGlobalValue());
				    } else {
					html_thesaurus.tm_report_editing_disabled();
				    }
				}
				html_thesaurus.tm_footer();
				html_utilities.html_source_readability_terpri(UNPROVIDED);
			    } finally {
				html_macros.$html_safe_print$.rebind(_prev_bind_0_191, thread);
			    }
			}
			html_utilities.html_markup(html_macros.$html_body_tail$.getGlobalValue());
			html_utilities.html_source_readability_terpri(UNPROVIDED);
		    } finally {
			html_macros.$html_inside_bodyP$.rebind(_prev_bind_0, thread);
		    }
		}
		html_utilities.html_markup(html_macros.$html_html_tail$.getGlobalValue());
		html_utilities.html_source_readability_terpri(UNPROVIDED);
	    }
	    return NIL;
	}
    }

    public static final SubLObject tm_handle_delete_term(SubLObject args) {
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    {
		SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
		SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
		try {
		    mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_GENL_MT, thread);
		    mt_relevance_macros.$mt$.bind(tm_datastructures.$tm_mt$.getGlobalValue(), thread);
		    {
			SubLObject how_much_ind = html_utilities.html_extract_input($str_alt380$how_much, args);
			SubLObject len = length(how_much_ind);
			SubLObject how_much = (how_much_ind.isString() && len.numG(ZERO_INTEGER)) ? ((SubLObject) (read_from_string_ignoring_errors(how_much_ind, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED))) : how_much_ind;
			SubLObject thesaurus_names = html_utilities.html_extract_input_values($$$thesauri, args);
			SubLObject delete_term = tm_internals.canonicalize_lexical_term(html_utilities.html_extract_input($str_alt378$delete_term, args));
			if (NIL == thesaurus_names) {
			    html_thesaurus.tm_error($str_alt320$No_thesauri_were_specified_, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
			} else if (delete_term.equalp($str_alt2$)) {
			    html_thesaurus.tm_error($str_alt387$No_term_to_delete_was_specified_, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
			} else {
			    {
				SubLObject ops = NIL;
				SubLObject cdolist_list_var = thesaurus_names;
				SubLObject thesaurus_name = NIL;
				for (thesaurus_name = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), thesaurus_name = cdolist_list_var.first()) {
				    {
					SubLObject op = tm_datastructures.get_tm_op();
					SubLObject op_195 = op;
					tm_datastructures._csetf_tm_op_opcode(op_195, how_much);
					tm_datastructures._csetf_tm_op_relation(op_195, $$preferredTerm);
					tm_datastructures._csetf_tm_op_inverseP(op_195, NIL);
					tm_datastructures._csetf_tm_op_args(op_195, list(delete_term));
					tm_datastructures._csetf_tm_op_thesaurus(op_195, thesaurus_name);
					tm_datastructures._csetf_tm_op_status(op_195, NIL);
					tm_datastructures._csetf_tm_op_verifyP(op_195, NIL);
					tm_datastructures._csetf_tm_op_hiddenP(op_195, NIL);
					tm_datastructures._csetf_tm_op_description(op_195, NIL);
					tm_datastructures._csetf_tm_op_description_args(op_195, NIL);
					if (NIL.isString()) {
					    set_op_english(op_195, NIL);
					} else {
					    set_op_english(op_195, UNPROVIDED);
					}
					ops = cons(op, ops);
				    }
				}
				thread.resetMultipleValues();
				{
				    SubLObject bad = tm_internals.check_operations(ops);
				    SubLObject good = thread.secondMultipleValue();
				    SubLObject verifyP = thread.thirdMultipleValue();
				    thread.resetMultipleValues();
				    if (NIL == good) {
					html_show_bad_ops_page(bad);
				    } else if (NIL != verifyP) {
					tm_verify_delete_term(bad, good);
				    } else {
					really_delete_term(bad, good);
				    }

				}
			    }
			}

		    }
		} finally {
		    mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
		    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
		}
	    }
	    return NIL;
	}
    }

    public static final SubLObject tm_verify_delete_term(SubLObject bad, SubLObject good) {
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    {
		SubLObject color_value = tm_datastructures.$tm_bg_color_default$.getDynamicValue(thread);
		html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
		html_utilities.html_markup(html_macros.$html_head_head$.getGlobalValue());
		html_macros.html_head_content_type();
		html_utilities.html_source_readability_terpri(UNPROVIDED);
		html_utilities.html_markup(html_macros.$html_title_head$.getGlobalValue());
		html_utilities.html_princ($$$Verify_Operations);
		html_utilities.html_markup(html_macros.$html_title_tail$.getGlobalValue());
		html_utilities.html_markup(html_macros.$html_head_tail$.getGlobalValue());
		html_utilities.html_source_readability_terpri(UNPROVIDED);
		{
		    SubLObject _prev_bind_0 = html_macros.$html_inside_bodyP$.currentBinding(thread);
		    try {
			html_macros.$html_inside_bodyP$.bind(T, thread);
			html_utilities.html_markup(html_macros.$html_body_head$.getGlobalValue());
			if (NIL != color_value) {
			    html_utilities.html_markup(html_macros.$html_body_bgcolor$.getGlobalValue());
			    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
			    html_utilities.html_markup(html_utilities.html_color(color_value));
			    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
			}
			html_utilities.html_char(CHAR_greater, UNPROVIDED);
			{
			    SubLObject _prev_bind_0_196 = html_macros.$html_safe_print$.currentBinding(thread);
			    try {
				html_macros.$html_safe_print$.bind(T, thread);
				html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
				html_utilities.html_markup(ONE_INTEGER);
				html_utilities.html_char(CHAR_greater, UNPROVIDED);
				if ((NIL != tm_control_vars.$client_thes_home_page$.getDynamicValue(thread)) && (NIL != tm_control_vars.$client_mini_logo$.getDynamicValue(thread))) {
				    html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
				    html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
				    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
				    html_utilities.html_markup(tm_control_vars.$client_thes_home_page$.getDynamicValue(thread));
				    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
				    html_utilities.html_char(CHAR_greater, UNPROVIDED);
				    {
					SubLObject _prev_bind_0_197 = html_macros.$html_safe_print$.currentBinding(thread);
					try {
					    html_macros.$html_safe_print$.bind(T, thread);
					    html_utilities.html_markup(html_macros.$html_image_head$.getGlobalValue());
					    html_utilities.html_markup(html_macros.$html_image_src$.getGlobalValue());
					    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
					    html_utilities.html_markup(tm_control_vars.$client_mini_logo$.getDynamicValue(thread));
					    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
					    if (NIL != tm_control_vars.$client_name$.getDynamicValue(thread)) {
						html_utilities.html_markup(html_macros.$html_image_alt$.getGlobalValue());
						html_utilities.html_char(CHAR_quotation, UNPROVIDED);
						html_utilities.html_markup(tm_control_vars.$client_name$.getDynamicValue(thread));
						html_utilities.html_char(CHAR_quotation, UNPROVIDED);
					    }
					    if (true) {
						html_utilities.html_markup(html_macros.$html_image_border$.getGlobalValue());
						html_utilities.html_char(CHAR_quotation, UNPROVIDED);
						html_utilities.html_markup(ZERO_INTEGER);
						html_utilities.html_char(CHAR_quotation, UNPROVIDED);
					    }
					    html_utilities.html_char(CHAR_greater, UNPROVIDED);
					    {
						SubLObject _prev_bind_0_198 = html_macros.$html_safe_print$.currentBinding(thread);
						try {
						    html_macros.$html_safe_print$.bind(T, thread);
						} finally {
						    html_macros.$html_safe_print$.rebind(_prev_bind_0_198, thread);
						}
					    }
					    html_utilities.html_markup(html_macros.$html_image_tail$.getGlobalValue());
					} finally {
					    html_macros.$html_safe_print$.rebind(_prev_bind_0_197, thread);
					}
				    }
				    html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
				}
				html_utilities.html_princ($$$Verify_Operations);
				html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
				html_utilities.html_markup(ONE_INTEGER);
				html_utilities.html_char(CHAR_greater, UNPROVIDED);
				tm_logging.tm_enqueue_event($$$Verify_Operations);
				html_utilities.html_markup(html_macros.$html_paragraph_head$.getGlobalValue());
				format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt389$Operation_DELETE_TERM__A, tm_datastructures.tm_op_args(good.first()).first());
				html_utilities.html_markup(html_macros.$html_paragraph_tail$.getGlobalValue());
				if (NIL != bad) {
				    html_show_bad_ops(bad);
				}
				html_utilities.html_markup(html_macros.$html_form_head$.getGlobalValue());
				html_utilities.html_markup(html_macros.$html_form_action$.getGlobalValue());
				html_utilities.html_char(CHAR_quotation, UNPROVIDED);
				html_utilities.html_markup(system_parameters.$cyc_cgi_program$.getDynamicValue(thread));
				html_utilities.html_char(CHAR_quotation, UNPROVIDED);
				if (NIL != html_macros.$html_form_method_post$.getGlobalValue()) {
				    html_utilities.html_markup(html_macros.$html_form_method$.getGlobalValue());
				    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
				    html_utilities.html_markup(html_macros.$html_form_method_post$.getGlobalValue());
				    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
				}
				html_utilities.html_char(CHAR_greater, UNPROVIDED);
				{
				    SubLObject _prev_bind_0_199 = html_macros.$html_safe_print$.currentBinding(thread);
				    SubLObject _prev_bind_1 = html_macros.$within_html_form$.currentBinding(thread);
				    SubLObject _prev_bind_2 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
				    try {
					html_macros.$html_safe_print$.bind(T, thread);
					html_macros.$within_html_form$.bind(T, thread);
					html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
					html_utilities.html_hidden_input($str_alt390$tm_handle_verify_delete_term, T, UNPROVIDED);
					if (NIL != good) {
					    html_utilities.html_princ($str_alt391$The_following_operations_can_be_a);
					}
					html_utilities.html_markup(html_macros.$html_unordered_list_head$.getGlobalValue());
					html_utilities.html_simple_attribute(html_macros.$html_list_plain$.getGlobalValue());
					html_utilities.html_char(CHAR_greater, UNPROVIDED);
					{
					    SubLObject _prev_bind_0_200 = html_macros.$html_safe_print$.currentBinding(thread);
					    try {
						html_macros.$html_safe_print$.bind(T, thread);
						{
						    SubLObject cdolist_list_var = good;
						    SubLObject op = NIL;
						    for (op = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), op = cdolist_list_var.first()) {
							{
							    SubLObject thesaurus = tm_datastructures.tm_op_thesaurus(op);
							    SubLObject thesaurus_name = tm_datastructures.tm_op_thesaurus_name(op);
							    SubLObject v_term = tm_datastructures.tm_op_args(op).first();
							    SubLObject sign = tm_datastructures.term_sign(v_term, thesaurus);
							    SubLObject concept = tm_datastructures.sign_concept(sign);
							    SubLObject p_term = tm_datastructures.concept_term(concept, thesaurus);
							    SubLObject key = tm_datastructures.cache_operation(op);
							    html_utilities.html_markup(html_macros.$html_list_item_head$.getGlobalValue());
							    html_utilities.html_char(CHAR_greater, UNPROVIDED);
							    {
								SubLObject _prev_bind_0_201 = html_macros.$html_safe_print$.currentBinding(thread);
								try {
								    html_macros.$html_safe_print$.bind(T, thread);
								    format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt392$Thesaurus__A, thesaurus_name);
								    html_utilities.html_br();
								    html_utilities.html_br();
								    {
									SubLObject v_default = T;
									if ((NIL != tm_internals.declarative_top_in_thesaurusP(concept, thesaurus)) && (tm_datastructures.tm_op_opcode(op) == $SPLICE_OUT)) {
									    v_default = NIL;
									    format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt393$__A__is_a_top_term___, v_term);
									    if (tm_internals.tm_use_integrity_module_for_thesaurusP(thesaurus, $TM_NOT_BT_NOT_TOP).eql($TM_DO_NOT_USE_INTEGRITY_MODULE)) {
										html_utilities.html_princ($str_alt396$Its_narrower_terms_will_be_left_w);
									    } else {
										html_utilities.html_princ($str_alt397$Its_narrower_terms_will_become_to);
									    }
									    html_utilities.html_br();
									}
									if (tm_datastructures.sign_relation(sign) == $$useFor) {
									    v_default = NIL;
									    format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt398$__A__USE___A______A__will_be_dele, new SubLObject[] { v_term, p_term, p_term });
									    html_utilities.html_br();
									    tm_datastructures._csetf_tm_op_args(op, list(p_term));
									}
									if (tm_datastructures.tm_op_opcode(op) == $NUKE) {
									    {
										SubLObject narrowers = remove(concept, gt_modules.tm_dependents(concept, thesaurus), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
										html_utilities.html_princ($str_alt399$The_following_narrower_terms_will);
										html_utilities.html_br();
										html_utilities.html_markup(html_macros.$html_unordered_list_head$.getGlobalValue());
										html_utilities.html_simple_attribute(html_macros.$html_list_plain$.getGlobalValue());
										html_utilities.html_char(CHAR_greater, UNPROVIDED);
										{
										    SubLObject _prev_bind_0_202 = html_macros.$html_safe_print$.currentBinding(thread);
										    try {
											html_macros.$html_safe_print$.bind(T, thread);
											if (NIL == narrowers) {
											    html_utilities.html_markup(html_macros.$html_list_item_head$.getGlobalValue());
											    html_utilities.html_char(CHAR_greater, UNPROVIDED);
											    {
												SubLObject _prev_bind_0_203 = html_macros.$html_safe_print$.currentBinding(thread);
												try {
												    html_macros.$html_safe_print$.bind(T, thread);
												    html_utilities.html_princ($str_alt400$There_are_no_dependent_narrower_t);
												} finally {
												    html_macros.$html_safe_print$.rebind(_prev_bind_0_203, thread);
												}
											    }
											    html_utilities.html_markup(html_macros.$html_list_item_tail$.getGlobalValue());
											}
											{
											    SubLObject cdolist_list_var_204 = narrowers;
											    SubLObject narrower = NIL;
											    for (narrower = cdolist_list_var_204.first(); NIL != cdolist_list_var_204; cdolist_list_var_204 = cdolist_list_var_204.rest(), narrower = cdolist_list_var_204.first()) {
												html_utilities.html_markup(html_macros.$html_list_item_head$.getGlobalValue());
												html_utilities.html_char(CHAR_greater, UNPROVIDED);
												{
												    SubLObject _prev_bind_0_205 = html_macros.$html_safe_print$.currentBinding(thread);
												    try {
													html_macros.$html_safe_print$.bind(T, thread);
													html_utilities.html_princ(tm_datastructures.concept_term(narrower, thesaurus));
												    } finally {
													html_macros.$html_safe_print$.rebind(_prev_bind_0_205, thread);
												    }
												}
												html_utilities.html_markup(html_macros.$html_list_item_tail$.getGlobalValue());
											    }
											}
										    } finally {
											html_macros.$html_safe_print$.rebind(_prev_bind_0_202, thread);
										    }
										}
										html_utilities.html_markup(html_macros.$html_unordered_list_tail$.getGlobalValue());
									    }
									}
									html_utilities.html_checkbox_input($$$operation, key, v_default, UNPROVIDED, UNPROVIDED, UNPROVIDED);
									html_utilities.html_princ($str_alt401$_Perform_operation);
									html_utilities.html_br();
									html_utilities.html_br();
									html_utilities.html_hidden_input($str_alt86$cache_key, key, UNPROVIDED);
								    }
								} finally {
								    html_macros.$html_safe_print$.rebind(_prev_bind_0_201, thread);
								}
							    }
							    html_utilities.html_markup(html_macros.$html_list_item_tail$.getGlobalValue());
							}
						    }
						}
					    } finally {
						html_macros.$html_safe_print$.rebind(_prev_bind_0_200, thread);
					    }
					}
					html_utilities.html_markup(html_macros.$html_unordered_list_tail$.getGlobalValue());
					html_utilities.html_br();
					html_utilities.html_submit_input($$$Go, UNPROVIDED, UNPROVIDED);
					html_utilities.html_reset_input($$$Reset);
					html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
				    } finally {
					html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_2, thread);
					html_macros.$within_html_form$.rebind(_prev_bind_1, thread);
					html_macros.$html_safe_print$.rebind(_prev_bind_0_199, thread);
				    }
				}
				html_utilities.html_markup(html_macros.$html_form_tail$.getGlobalValue());
				html_thesaurus.tm_footer();
				html_utilities.html_source_readability_terpri(UNPROVIDED);
			    } finally {
				html_macros.$html_safe_print$.rebind(_prev_bind_0_196, thread);
			    }
			}
			html_utilities.html_markup(html_macros.$html_body_tail$.getGlobalValue());
			html_utilities.html_source_readability_terpri(UNPROVIDED);
		    } finally {
			html_macros.$html_inside_bodyP$.rebind(_prev_bind_0, thread);
		    }
		}
		html_utilities.html_markup(html_macros.$html_html_tail$.getGlobalValue());
		html_utilities.html_source_readability_terpri(UNPROVIDED);
	    }
	    return NIL;
	}
    }

    public static final SubLObject tm_handle_verify_delete_term(SubLObject args) {
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    {
		SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
		SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
		try {
		    mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_GENL_MT, thread);
		    mt_relevance_macros.$mt$.bind(tm_datastructures.$tm_mt$.getGlobalValue(), thread);
		    {
			SubLObject op_keys = Mapping.mapcar(symbol_function(READ_FROM_STRING_IGNORING_ERRORS), html_utilities.html_extract_input_values($$$operation, args));
			SubLObject cache_keys = Mapping.mapcar(symbol_function(READ_FROM_STRING_IGNORING_ERRORS), html_utilities.html_extract_input_values($str_alt86$cache_key, args));
			SubLObject ops = Mapping.mapcar(symbol_function(LOOKUP_OPERATION), op_keys);
			if (NIL != remove_if(symbol_function($sym108$VALID_TM_OP_), ops, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
			    html_thesaurus.tm_error($str_alt109$Some_operation_was_not_found__hen, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
			} else {
			    really_delete_term(NIL, ops);
			    Mapping.mapc(symbol_function(DECACHE_OPERATION), cache_keys, EMPTY_SUBL_OBJECT_ARRAY);
			}
		    }
		} finally {
		    mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
		    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
		}
	    }
	    return NIL;
	}
    }

    public static final SubLObject really_delete_term(SubLObject bad, SubLObject good) {
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    {
		SubLObject op_triples = NIL;
		SubLObject broaders = NIL;
		SubLObject some_not_okP = NIL;
		{
		    SubLObject cdolist_list_var = good;
		    SubLObject op = NIL;
		    for (op = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), op = cdolist_list_var.first()) {
			{
			    SubLObject thesaurus = tm_datastructures.tm_op_thesaurus(op);
			    broaders = append(gt_modules.broader_terms(tm_datastructures.term_concept(tm_datastructures.tm_op_args(op).first(), thesaurus), thesaurus), broaders);
			}
		    }
		}
		broaders = delete_duplicates(broaders, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
		op_triples = perform_operations_guts(good);
		if (NIL == some_not_okP) {
		    {
			SubLObject csome_list_var = op_triples;
			SubLObject triple = NIL;
			for (triple = csome_list_var.first(); !((NIL != some_not_okP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest(), triple = csome_list_var.first()) {
			    if (second(triple) == $ERROR) {
				some_not_okP = T;
			    }
			}
		    }
		}
		if (NIL == some_not_okP) {
		    tm_datastructures.change_tm_value(tm_datastructures.$tm_user$.getDynamicValue(thread), $TERM, NIL, UNPROVIDED);
		}
		{
		    SubLObject color_value = tm_datastructures.$tm_bg_color_default$.getDynamicValue(thread);
		    html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
		    html_utilities.html_markup(html_macros.$html_head_head$.getGlobalValue());
		    html_macros.html_head_content_type();
		    html_utilities.html_source_readability_terpri(UNPROVIDED);
		    html_utilities.html_markup(html_macros.$html_title_head$.getGlobalValue());
		    html_utilities.html_princ($$$Delete_Term_Results);
		    html_utilities.html_markup(html_macros.$html_title_tail$.getGlobalValue());
		    html_utilities.html_markup(html_macros.$html_head_tail$.getGlobalValue());
		    html_utilities.html_source_readability_terpri(UNPROVIDED);
		    {
			SubLObject _prev_bind_0 = html_macros.$html_inside_bodyP$.currentBinding(thread);
			try {
			    html_macros.$html_inside_bodyP$.bind(T, thread);
			    html_utilities.html_markup(html_macros.$html_body_head$.getGlobalValue());
			    if (NIL != color_value) {
				html_utilities.html_markup(html_macros.$html_body_bgcolor$.getGlobalValue());
				html_utilities.html_char(CHAR_quotation, UNPROVIDED);
				html_utilities.html_markup(html_utilities.html_color(color_value));
				html_utilities.html_char(CHAR_quotation, UNPROVIDED);
			    }
			    html_utilities.html_char(CHAR_greater, UNPROVIDED);
			    {
				SubLObject _prev_bind_0_206 = html_macros.$html_safe_print$.currentBinding(thread);
				try {
				    html_macros.$html_safe_print$.bind(T, thread);
				    html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
				    html_utilities.html_markup(ONE_INTEGER);
				    html_utilities.html_char(CHAR_greater, UNPROVIDED);
				    if ((NIL != tm_control_vars.$client_thes_home_page$.getDynamicValue(thread)) && (NIL != tm_control_vars.$client_mini_logo$.getDynamicValue(thread))) {
					html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
					html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
					html_utilities.html_char(CHAR_quotation, UNPROVIDED);
					html_utilities.html_markup(tm_control_vars.$client_thes_home_page$.getDynamicValue(thread));
					html_utilities.html_char(CHAR_quotation, UNPROVIDED);
					html_utilities.html_char(CHAR_greater, UNPROVIDED);
					{
					    SubLObject _prev_bind_0_207 = html_macros.$html_safe_print$.currentBinding(thread);
					    try {
						html_macros.$html_safe_print$.bind(T, thread);
						html_utilities.html_markup(html_macros.$html_image_head$.getGlobalValue());
						html_utilities.html_markup(html_macros.$html_image_src$.getGlobalValue());
						html_utilities.html_char(CHAR_quotation, UNPROVIDED);
						html_utilities.html_markup(tm_control_vars.$client_mini_logo$.getDynamicValue(thread));
						html_utilities.html_char(CHAR_quotation, UNPROVIDED);
						if (NIL != tm_control_vars.$client_name$.getDynamicValue(thread)) {
						    html_utilities.html_markup(html_macros.$html_image_alt$.getGlobalValue());
						    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
						    html_utilities.html_markup(tm_control_vars.$client_name$.getDynamicValue(thread));
						    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
						}
						if (true) {
						    html_utilities.html_markup(html_macros.$html_image_border$.getGlobalValue());
						    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
						    html_utilities.html_markup(ZERO_INTEGER);
						    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
						}
						html_utilities.html_char(CHAR_greater, UNPROVIDED);
						{
						    SubLObject _prev_bind_0_208 = html_macros.$html_safe_print$.currentBinding(thread);
						    try {
							html_macros.$html_safe_print$.bind(T, thread);
						    } finally {
							html_macros.$html_safe_print$.rebind(_prev_bind_0_208, thread);
						    }
						}
						html_utilities.html_markup(html_macros.$html_image_tail$.getGlobalValue());
					    } finally {
						html_macros.$html_safe_print$.rebind(_prev_bind_0_207, thread);
					    }
					}
					html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
				    }
				    html_utilities.html_princ($$$Delete_Term_Results);
				    html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
				    html_utilities.html_markup(ONE_INTEGER);
				    html_utilities.html_char(CHAR_greater, UNPROVIDED);
				    tm_logging.tm_enqueue_event($$$Delete_Term_Results);
				    html_thesaurus.thesaurus_heading($str_alt404$really_delete_term);
				    html_show_bad_ops(bad);
				    if ((NIL != good) && (NIL != op_triples)) {
					print_operations_results(op_triples);
					html_utilities.html_markup(html_macros.$html_unordered_list_head$.getGlobalValue());
					html_utilities.html_simple_attribute(html_macros.$html_list_plain$.getGlobalValue());
					html_utilities.html_char(CHAR_greater, UNPROVIDED);
					{
					    SubLObject _prev_bind_0_209 = html_macros.$html_safe_print$.currentBinding(thread);
					    try {
						html_macros.$html_safe_print$.bind(T, thread);
						{
						    SubLObject cdolist_list_var = broaders;
						    SubLObject broader = NIL;
						    for (broader = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), broader = cdolist_list_var.first()) {
							html_utilities.html_markup(html_macros.$html_list_item_head$.getGlobalValue());
							html_utilities.html_char(CHAR_greater, UNPROVIDED);
							{
							    SubLObject _prev_bind_0_210 = html_macros.$html_safe_print$.currentBinding(thread);
							    try {
								html_macros.$html_safe_print$.bind(T, thread);
								html_tm_browsing.tm_thesaurus_constant(broader, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
							    } finally {
								html_macros.$html_safe_print$.rebind(_prev_bind_0_210, thread);
							    }
							}
							html_utilities.html_markup(html_macros.$html_list_item_tail$.getGlobalValue());
						    }
						}
					    } finally {
						html_macros.$html_safe_print$.rebind(_prev_bind_0_209, thread);
					    }
					}
					html_utilities.html_markup(html_macros.$html_unordered_list_tail$.getGlobalValue());
				    } else {
					html_utilities.html_markup(html_macros.$html_paragraph_head$.getGlobalValue());
					html_utilities.html_princ($str_alt101$No_operations_were_performed_);
					html_utilities.html_markup(html_macros.$html_paragraph_tail$.getGlobalValue());
				    }
				    html_thesaurus.tm_footer();
				    html_utilities.html_source_readability_terpri(UNPROVIDED);
				} finally {
				    html_macros.$html_safe_print$.rebind(_prev_bind_0_206, thread);
				}
			    }
			    html_utilities.html_markup(html_macros.$html_body_tail$.getGlobalValue());
			    html_utilities.html_source_readability_terpri(UNPROVIDED);
			} finally {
			    html_macros.$html_inside_bodyP$.rebind(_prev_bind_0, thread);
			}
		    }
		    html_utilities.html_markup(html_macros.$html_html_tail$.getGlobalValue());
		    html_utilities.html_source_readability_terpri(UNPROVIDED);
		}
	    }
	    return NIL;
	}
    }

    public static final SubLObject tm_add_term(SubLObject args) {
	if (args == UNPROVIDED) {
	    args = NIL;
	}
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    {
		SubLObject color_value = tm_datastructures.$tm_bg_color_default$.getDynamicValue(thread);
		html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
		html_utilities.html_markup(html_macros.$html_head_head$.getGlobalValue());
		html_macros.html_head_content_type();
		html_utilities.html_source_readability_terpri(UNPROVIDED);
		html_utilities.html_markup(html_macros.$html_title_head$.getGlobalValue());
		html_utilities.html_princ($$$Add_New_Term);
		html_utilities.html_markup(html_macros.$html_title_tail$.getGlobalValue());
		html_utilities.html_markup(html_macros.$html_head_tail$.getGlobalValue());
		html_utilities.html_source_readability_terpri(UNPROVIDED);
		{
		    SubLObject _prev_bind_0 = html_macros.$html_inside_bodyP$.currentBinding(thread);
		    try {
			html_macros.$html_inside_bodyP$.bind(T, thread);
			html_utilities.html_markup(html_macros.$html_body_head$.getGlobalValue());
			if (NIL != color_value) {
			    html_utilities.html_markup(html_macros.$html_body_bgcolor$.getGlobalValue());
			    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
			    html_utilities.html_markup(html_utilities.html_color(color_value));
			    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
			}
			html_utilities.html_char(CHAR_greater, UNPROVIDED);
			{
			    SubLObject _prev_bind_0_211 = html_macros.$html_safe_print$.currentBinding(thread);
			    try {
				html_macros.$html_safe_print$.bind(T, thread);
				html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
				html_utilities.html_markup(ONE_INTEGER);
				html_utilities.html_char(CHAR_greater, UNPROVIDED);
				if ((NIL != tm_control_vars.$client_thes_home_page$.getDynamicValue(thread)) && (NIL != tm_control_vars.$client_mini_logo$.getDynamicValue(thread))) {
				    html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
				    html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
				    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
				    html_utilities.html_markup(tm_control_vars.$client_thes_home_page$.getDynamicValue(thread));
				    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
				    html_utilities.html_char(CHAR_greater, UNPROVIDED);
				    {
					SubLObject _prev_bind_0_212 = html_macros.$html_safe_print$.currentBinding(thread);
					try {
					    html_macros.$html_safe_print$.bind(T, thread);
					    html_utilities.html_markup(html_macros.$html_image_head$.getGlobalValue());
					    html_utilities.html_markup(html_macros.$html_image_src$.getGlobalValue());
					    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
					    html_utilities.html_markup(tm_control_vars.$client_mini_logo$.getDynamicValue(thread));
					    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
					    if (NIL != tm_control_vars.$client_name$.getDynamicValue(thread)) {
						html_utilities.html_markup(html_macros.$html_image_alt$.getGlobalValue());
						html_utilities.html_char(CHAR_quotation, UNPROVIDED);
						html_utilities.html_markup(tm_control_vars.$client_name$.getDynamicValue(thread));
						html_utilities.html_char(CHAR_quotation, UNPROVIDED);
					    }
					    if (true) {
						html_utilities.html_markup(html_macros.$html_image_border$.getGlobalValue());
						html_utilities.html_char(CHAR_quotation, UNPROVIDED);
						html_utilities.html_markup(ZERO_INTEGER);
						html_utilities.html_char(CHAR_quotation, UNPROVIDED);
					    }
					    html_utilities.html_char(CHAR_greater, UNPROVIDED);
					    {
						SubLObject _prev_bind_0_213 = html_macros.$html_safe_print$.currentBinding(thread);
						try {
						    html_macros.$html_safe_print$.bind(T, thread);
						} finally {
						    html_macros.$html_safe_print$.rebind(_prev_bind_0_213, thread);
						}
					    }
					    html_utilities.html_markup(html_macros.$html_image_tail$.getGlobalValue());
					} finally {
					    html_macros.$html_safe_print$.rebind(_prev_bind_0_212, thread);
					}
				    }
				    html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
				}
				html_utilities.html_princ($$$Add_New_Term);
				html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
				html_utilities.html_markup(ONE_INTEGER);
				html_utilities.html_char(CHAR_greater, UNPROVIDED);
				tm_logging.tm_enqueue_event($$$Add_New_Term);
				if (!(true && (NIL != tm_internals.privelegedP(tm_datastructures.$tm_user$.getDynamicValue(thread), $str_alt297$limited_editor)))) {
				    html_utilities.html_princ($str_alt186$Sorry__you_do_not_have_permission);
				} else {
				    html_thesaurus.thesaurus_heading($str_alt406$tm_add_term);
				    if (NIL != tm_internals.editing_allowedP()) {
					html_utilities.html_markup(html_macros.$html_form_head$.getGlobalValue());
					html_utilities.html_markup(html_macros.$html_form_action$.getGlobalValue());
					html_utilities.html_char(CHAR_quotation, UNPROVIDED);
					html_utilities.html_markup(system_parameters.$cyc_cgi_program$.getDynamicValue(thread));
					html_utilities.html_char(CHAR_quotation, UNPROVIDED);
					if (NIL != html_macros.$html_form_method_post$.getGlobalValue()) {
					    html_utilities.html_markup(html_macros.$html_form_method$.getGlobalValue());
					    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
					    html_utilities.html_markup(html_macros.$html_form_method_post$.getGlobalValue());
					    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
					}
					html_utilities.html_char(CHAR_greater, UNPROVIDED);
					{
					    SubLObject _prev_bind_0_214 = html_macros.$html_safe_print$.currentBinding(thread);
					    SubLObject _prev_bind_1 = html_macros.$within_html_form$.currentBinding(thread);
					    SubLObject _prev_bind_2 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
					    try {
						html_macros.$html_safe_print$.bind(T, thread);
						html_macros.$within_html_form$.bind(T, thread);
						html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
						html_utilities.html_hidden_input($str_alt407$tm_handle_add_term, T, UNPROVIDED);
						html_utilities.html_princ($str_alt408$Add_New_Preferred_Term_);
						html_utilities.html_br();
						html_utilities.html_text_input($$$name, NIL, $int$40);
						html_utilities.html_br();
						html_utilities.html_br();
						html_utilities.html_markup(html_macros.$html_table_head$.getGlobalValue());
						if (true) {
						    html_utilities.html_markup(html_macros.$html_table_border$.getGlobalValue());
						    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
						    html_utilities.html_markup(ZERO_INTEGER);
						    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
						}
						html_utilities.html_char(CHAR_greater, UNPROVIDED);
						{
						    SubLObject _prev_bind_0_215 = html_macros.$html_safe_print$.currentBinding(thread);
						    try {
							html_macros.$html_safe_print$.bind(T, thread);
							html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
							html_utilities.html_char(CHAR_greater, UNPROVIDED);
							{
							    SubLObject _prev_bind_0_216 = html_macros.$html_safe_print$.currentBinding(thread);
							    try {
								html_macros.$html_safe_print$.bind(T, thread);
								html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
								if (true) {
								    html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
								    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
								    html_utilities.html_markup(html_utilities.html_align($TOP));
								    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
								}
								html_utilities.html_char(CHAR_greater, UNPROVIDED);
								{
								    SubLObject _prev_bind_0_217 = html_macros.$html_safe_print$.currentBinding(thread);
								    try {
									html_macros.$html_safe_print$.bind(T, thread);
									html_utilities.html_princ($str_alt410$Choose_Thesauri_for_Term_);
									html_utilities.html_br();
									html_thesaurus.tm_edit_thesaurus_selection(T, NIL, $$$thesaurus, UNPROVIDED);
								    } finally {
									html_macros.$html_safe_print$.rebind(_prev_bind_0_217, thread);
								    }
								}
								html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
								html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
								html_utilities.html_char(CHAR_greater, UNPROVIDED);
								{
								    SubLObject _prev_bind_0_218 = html_macros.$html_safe_print$.currentBinding(thread);
								    try {
									html_macros.$html_safe_print$.bind(T, thread);
									html_macros.verify_not_within_html_pre();
									html_utilities.html_markup(html_macros.$html_preformatted_head$.getGlobalValue());
									{
									    SubLObject _prev_bind_0_219 = html_macros.$within_html_pre$.currentBinding(thread);
									    try {
										html_macros.$within_html_pre$.bind(T, thread);
										html_utilities.html_princ($str_alt302$__);
									    } finally {
										html_macros.$within_html_pre$.rebind(_prev_bind_0_219, thread);
									    }
									}
									html_utilities.html_markup(html_macros.$html_preformatted_tail$.getGlobalValue());
								    } finally {
									html_macros.$html_safe_print$.rebind(_prev_bind_0_218, thread);
								    }
								}
								html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
								html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
								if (true) {
								    html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
								    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
								    html_utilities.html_markup(html_utilities.html_align($TOP));
								    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
								}
								html_utilities.html_char(CHAR_greater, UNPROVIDED);
								{
								    SubLObject _prev_bind_0_220 = html_macros.$html_safe_print$.currentBinding(thread);
								    try {
									html_macros.$html_safe_print$.bind(T, thread);
									html_utilities.html_princ($str_alt411$Enter_Broader_Terms__each_on_sepa);
									html_utilities.html_br();
									html_utilities.html_princ($str_alt412$Don_t_enter_BTs_if_the_term_will_);
									html_utilities.html_br();
									html_utilities.html_markup(html_macros.$html_textarea_head$.getGlobalValue());
									html_utilities.html_markup(html_macros.$html_textarea_name$.getGlobalValue());
									html_utilities.html_char(CHAR_quotation, UNPROVIDED);
									html_utilities.html_markup($$$broaders);
									html_utilities.html_char(CHAR_quotation, UNPROVIDED);
									if (true) {
									    html_utilities.html_markup(html_macros.$html_textarea_cols$.getGlobalValue());
									    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
									    html_utilities.html_markup($int$40);
									    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
									}
									if (true) {
									    html_utilities.html_markup(html_macros.$html_textarea_rows$.getGlobalValue());
									    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
									    html_utilities.html_markup(FIVE_INTEGER);
									    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
									}
									html_utilities.html_char(CHAR_greater, UNPROVIDED);
									{
									    SubLObject _prev_bind_0_221 = html_macros.$html_safe_print$.currentBinding(thread);
									    SubLObject _prev_bind_1_222 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
									    SubLObject _prev_bind_2_223 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
									    try {
										html_macros.$html_safe_print$.bind(T, thread);
										mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_IN_LIST, thread);
										mt_relevance_macros.$relevant_mts$.bind(tm_datastructures.tm_value(tm_datastructures.$tm_user$.getDynamicValue(thread), $THESAURI), thread);
										{
										    SubLObject v_term = tm_datastructures.tm_value(tm_datastructures.$tm_user$.getDynamicValue(thread), $TERM);
										    SubLObject preferred = tm_internals.preferred_terms(v_term);
										    if (NIL != preferred) {
											preferred = Sort.sort(preferred, symbol_function(STRING_LESSP), UNPROVIDED);
											html_utilities.html_princ(preferred.first());
										    }
										}
									    } finally {
										mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2_223, thread);
										mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1_222, thread);
										html_macros.$html_safe_print$.rebind(_prev_bind_0_221, thread);
									    }
									}
									html_utilities.html_markup(html_macros.$html_textarea_tail$.getGlobalValue());
									html_utilities.html_br();
									html_utilities.html_checkbox_input($str_alt311$override_default_case, $$$T, NIL == tm_internals.$tm_use_default_case_for_strings$.getDynamicValue(thread) ? ((SubLObject) (T)) : NIL, UNPROVIDED, UNPROVIDED, UNPROVIDED);
									html_utilities.html_princ($$$Override_Default_Case);
								    } finally {
									html_macros.$html_safe_print$.rebind(_prev_bind_0_220, thread);
								    }
								}
								html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
							    } finally {
								html_macros.$html_safe_print$.rebind(_prev_bind_0_216, thread);
							    }
							}
							html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
							html_utilities.html_source_readability_terpri(UNPROVIDED);
						    } finally {
							html_macros.$html_safe_print$.rebind(_prev_bind_0_215, thread);
						    }
						}
						html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
						html_utilities.html_submit_input($$$Add, UNPROVIDED, UNPROVIDED);
						html_utilities.html_reset_input($$$Reset);
						html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
					    } finally {
						html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_2, thread);
						html_macros.$within_html_form$.rebind(_prev_bind_1, thread);
						html_macros.$html_safe_print$.rebind(_prev_bind_0_214, thread);
					    }
					}
					html_utilities.html_markup(html_macros.$html_form_tail$.getGlobalValue());
				    } else {
					html_thesaurus.tm_report_editing_disabled();
				    }
				}
				html_thesaurus.tm_footer();
				html_utilities.html_source_readability_terpri(UNPROVIDED);
			    } finally {
				html_macros.$html_safe_print$.rebind(_prev_bind_0_211, thread);
			    }
			}
			html_utilities.html_markup(html_macros.$html_body_tail$.getGlobalValue());
			html_utilities.html_source_readability_terpri(UNPROVIDED);
		    } finally {
			html_macros.$html_inside_bodyP$.rebind(_prev_bind_0, thread);
		    }
		}
		html_utilities.html_markup(html_macros.$html_html_tail$.getGlobalValue());
		html_utilities.html_source_readability_terpri(UNPROVIDED);
	    }
	    return NIL;
	}
    }

    public static final SubLObject tm_handle_add_term(SubLObject args) {
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    {
		SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
		SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
		try {
		    mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_GENL_MT, thread);
		    mt_relevance_macros.$mt$.bind(tm_datastructures.$tm_mt$.getGlobalValue(), thread);
		    {
			SubLObject v_term = html_utilities.html_extract_input($$$name, args);
			SubLObject override_default_case = html_utilities.html_extract_input($str_alt311$override_default_case, args);
			SubLObject broaders = html_utilities.html_extract_input($$$broaders, args);
			SubLObject thesaurus_abbrevs = html_utilities.html_extract_input_values($$$thesaurus, args);
			if (NIL == thesaurus_abbrevs) {
			    html_thesaurus.tm_error($str_alt320$No_thesauri_were_specified_, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
			} else if ((NIL == v_term) || v_term.equal($str_alt2$)) {
			    html_thesaurus.tm_error($str_alt418$No_term_was_specified_, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
			} else {
			    v_term = tm_internals.canonicalize_lexical_term(v_term);
			    {
				SubLObject broader_terms = NIL;
				SubLObject ops = NIL;
				SubLObject new_concept = NIL;
				if (NIL != broaders) {
				    broader_terms = Mapping.mapcar(symbol_function(CANONICALIZE_LEXICAL_TERM), string_utilities.extract_lines(broaders));
				}
				if (NIL != find(v_term, broader_terms, symbol_function(EQUALP), UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
				    html_thesaurus.tm_error($str_alt420$A_Term_Cannot_be_a_Broader_Term_o, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
				} else {
				    new_concept = tm_io.tm_generate_concept(v_term);
				    {
					SubLObject cdolist_list_var = thesaurus_abbrevs;
					SubLObject thesaurus_abbrev = NIL;
					for (thesaurus_abbrev = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), thesaurus_abbrev = cdolist_list_var.first()) {
					    {
						SubLObject op = tm_datastructures.get_tm_op();
						{
						    SubLObject _prev_bind_0_224 = tm_internals.$tm_use_default_case_for_strings$.currentBinding(thread);
						    try {
							tm_internals.$tm_use_default_case_for_strings$.bind(NIL != override_default_case ? ((SubLObject) (NIL)) : T, thread);
							{
							    SubLObject thesaurus = tm_internals.thesaurus_constant_from_abbreviation(thesaurus_abbrev);
							    SubLObject op_225 = op;
							    tm_datastructures._csetf_tm_op_opcode(op_225, $CREATE);
							    tm_datastructures._csetf_tm_op_relation(op_225, NIL);
							    tm_datastructures._csetf_tm_op_inverseP(op_225, NIL);
							    tm_datastructures._csetf_tm_op_args(op_225, list(NIL != tm_internals.thesaurusP(thesaurus) ? ((SubLObject) (tm_internals.canonicalize_string_case_for_thesaurus(v_term, thesaurus))) : v_term, list(new_concept), broader_terms));
							    tm_datastructures._csetf_tm_op_thesaurus(op_225, thesaurus_abbrev);
							    tm_datastructures._csetf_tm_op_status(op_225, NIL);
							    tm_datastructures._csetf_tm_op_verifyP(op_225, NIL);
							    tm_datastructures._csetf_tm_op_hiddenP(op_225, NIL);
							    tm_datastructures._csetf_tm_op_description(op_225, NIL);
							    tm_datastructures._csetf_tm_op_description_args(op_225, NIL);
							    if (NIL.isString()) {
								set_op_english(op_225, NIL);
							    } else {
								set_op_english(op_225, UNPROVIDED);
							    }
							    ops = cons(op, ops);
							}
						    } finally {
							tm_internals.$tm_use_default_case_for_strings$.rebind(_prev_bind_0_224, thread);
						    }
						}
					    }
					}
				    }
				    ops = nreverse(ops);
				    {
					SubLObject _prev_bind_0_226 = tm_internals.$tm_use_default_case_for_strings$.currentBinding(thread);
					try {
					    tm_internals.$tm_use_default_case_for_strings$.bind(NIL != override_default_case ? ((SubLObject) (NIL)) : T, thread);
					    thread.resetMultipleValues();
					    {
						SubLObject bad = tm_internals.check_operations(ops);
						SubLObject good = thread.secondMultipleValue();
						SubLObject verifyP = thread.thirdMultipleValue();
						thread.resetMultipleValues();
						if (NIL == good) {
						    html_show_bad_ops_page(bad);
						} else if (NIL != verifyP) {
						    tm_verify_add_term(bad, good);
						} else {
						    really_add_term(bad, good);
						}

					    }
					} finally {
					    tm_internals.$tm_use_default_case_for_strings$.rebind(_prev_bind_0_226, thread);
					}
				    }
				}
			    }
			}

		    }
		} finally {
		    mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
		    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
		}
	    }
	    return NIL;
	}
    }

    public static final SubLObject tm_verify_add_term(SubLObject bad, SubLObject good) {
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    {
		SubLObject v_term = tm_datastructures.tm_op_args(good.first()).first();
		SubLObject editable_thesauri = tm_datastructures.tm_value(tm_datastructures.$tm_user$.getDynamicValue(thread), $EDITABLE_THESAURI);
		if (editable_thesauri == $ALL) {
		    editable_thesauri = tm_internals.all_thesauri();
		}
		{
		    SubLObject color_value = tm_datastructures.$tm_bg_color_default$.getDynamicValue(thread);
		    html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
		    html_utilities.html_markup(html_macros.$html_head_head$.getGlobalValue());
		    html_macros.html_head_content_type();
		    html_utilities.html_source_readability_terpri(UNPROVIDED);
		    html_utilities.html_markup(html_macros.$html_title_head$.getGlobalValue());
		    html_utilities.html_princ($$$Verify_Operations);
		    html_utilities.html_markup(html_macros.$html_title_tail$.getGlobalValue());
		    html_utilities.html_markup(html_macros.$html_head_tail$.getGlobalValue());
		    html_utilities.html_source_readability_terpri(UNPROVIDED);
		    {
			SubLObject _prev_bind_0 = html_macros.$html_inside_bodyP$.currentBinding(thread);
			try {
			    html_macros.$html_inside_bodyP$.bind(T, thread);
			    html_utilities.html_markup(html_macros.$html_body_head$.getGlobalValue());
			    if (NIL != color_value) {
				html_utilities.html_markup(html_macros.$html_body_bgcolor$.getGlobalValue());
				html_utilities.html_char(CHAR_quotation, UNPROVIDED);
				html_utilities.html_markup(html_utilities.html_color(color_value));
				html_utilities.html_char(CHAR_quotation, UNPROVIDED);
			    }
			    html_utilities.html_char(CHAR_greater, UNPROVIDED);
			    {
				SubLObject _prev_bind_0_227 = html_macros.$html_safe_print$.currentBinding(thread);
				try {
				    html_macros.$html_safe_print$.bind(T, thread);
				    html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
				    html_utilities.html_markup(ONE_INTEGER);
				    html_utilities.html_char(CHAR_greater, UNPROVIDED);
				    if ((NIL != tm_control_vars.$client_thes_home_page$.getDynamicValue(thread)) && (NIL != tm_control_vars.$client_mini_logo$.getDynamicValue(thread))) {
					html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
					html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
					html_utilities.html_char(CHAR_quotation, UNPROVIDED);
					html_utilities.html_markup(tm_control_vars.$client_thes_home_page$.getDynamicValue(thread));
					html_utilities.html_char(CHAR_quotation, UNPROVIDED);
					html_utilities.html_char(CHAR_greater, UNPROVIDED);
					{
					    SubLObject _prev_bind_0_228 = html_macros.$html_safe_print$.currentBinding(thread);
					    try {
						html_macros.$html_safe_print$.bind(T, thread);
						html_utilities.html_markup(html_macros.$html_image_head$.getGlobalValue());
						html_utilities.html_markup(html_macros.$html_image_src$.getGlobalValue());
						html_utilities.html_char(CHAR_quotation, UNPROVIDED);
						html_utilities.html_markup(tm_control_vars.$client_mini_logo$.getDynamicValue(thread));
						html_utilities.html_char(CHAR_quotation, UNPROVIDED);
						if (NIL != tm_control_vars.$client_name$.getDynamicValue(thread)) {
						    html_utilities.html_markup(html_macros.$html_image_alt$.getGlobalValue());
						    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
						    html_utilities.html_markup(tm_control_vars.$client_name$.getDynamicValue(thread));
						    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
						}
						if (true) {
						    html_utilities.html_markup(html_macros.$html_image_border$.getGlobalValue());
						    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
						    html_utilities.html_markup(ZERO_INTEGER);
						    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
						}
						html_utilities.html_char(CHAR_greater, UNPROVIDED);
						{
						    SubLObject _prev_bind_0_229 = html_macros.$html_safe_print$.currentBinding(thread);
						    try {
							html_macros.$html_safe_print$.bind(T, thread);
						    } finally {
							html_macros.$html_safe_print$.rebind(_prev_bind_0_229, thread);
						    }
						}
						html_utilities.html_markup(html_macros.$html_image_tail$.getGlobalValue());
					    } finally {
						html_macros.$html_safe_print$.rebind(_prev_bind_0_228, thread);
					    }
					}
					html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
				    }
				    html_utilities.html_princ($$$Verify_Operations);
				    html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
				    html_utilities.html_markup(ONE_INTEGER);
				    html_utilities.html_char(CHAR_greater, UNPROVIDED);
				    tm_logging.tm_enqueue_event($$$Verify_Operations);
				    html_utilities.html_markup(html_macros.$html_paragraph_head$.getGlobalValue());
				    format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt422$Operation_ADD_TERM___A_, v_term);
				    html_utilities.html_markup(html_macros.$html_paragraph_tail$.getGlobalValue());
				    if (NIL != bad) {
					html_show_bad_ops(bad);
				    }
				    html_utilities.html_markup(html_macros.$html_form_head$.getGlobalValue());
				    html_utilities.html_markup(html_macros.$html_form_action$.getGlobalValue());
				    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
				    html_utilities.html_markup(system_parameters.$cyc_cgi_program$.getDynamicValue(thread));
				    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
				    if (NIL != html_macros.$html_form_method_post$.getGlobalValue()) {
					html_utilities.html_markup(html_macros.$html_form_method$.getGlobalValue());
					html_utilities.html_char(CHAR_quotation, UNPROVIDED);
					html_utilities.html_markup(html_macros.$html_form_method_post$.getGlobalValue());
					html_utilities.html_char(CHAR_quotation, UNPROVIDED);
				    }
				    html_utilities.html_char(CHAR_greater, UNPROVIDED);
				    {
					SubLObject _prev_bind_0_230 = html_macros.$html_safe_print$.currentBinding(thread);
					SubLObject _prev_bind_1 = html_macros.$within_html_form$.currentBinding(thread);
					SubLObject _prev_bind_2 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
					try {
					    html_macros.$html_safe_print$.bind(T, thread);
					    html_macros.$within_html_form$.bind(T, thread);
					    html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
					    html_utilities.html_hidden_input($str_alt423$tm_handle_verify_add_term, T, UNPROVIDED);
					    html_utilities.html_markup(html_macros.$html_unordered_list_head$.getGlobalValue());
					    html_utilities.html_simple_attribute(html_macros.$html_list_plain$.getGlobalValue());
					    html_utilities.html_char(CHAR_greater, UNPROVIDED);
					    {
						SubLObject _prev_bind_0_231 = html_macros.$html_safe_print$.currentBinding(thread);
						try {
						    html_macros.$html_safe_print$.bind(T, thread);
						    {
							SubLObject cdolist_list_var = good;
							SubLObject op = NIL;
							for (op = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), op = cdolist_list_var.first()) {
							    {
								SubLObject thesaurus_abbrev = tm_datastructures.tm_op_thesaurus_name(op);
								SubLObject id = tm_datastructures.cache_operation(op);
								html_utilities.html_hidden_input($$$operation, id, UNPROVIDED);
								{
								    SubLObject datum = tm_datastructures.tm_op_args(op);
								    SubLObject current = datum;
								    SubLObject v_term_232 = NIL;
								    destructuring_bind_must_consp(current, datum, $list_alt424);
								    v_term_232 = current.first();
								    current = current.rest();
								    destructuring_bind_must_consp(current, datum, $list_alt424);
								    {
									SubLObject temp = current.rest();
									current = current.first();
									{
									    SubLObject gensymmed_concept = NIL;
									    destructuring_bind_must_consp(current, datum, $list_alt424);
									    gensymmed_concept = current.first();
									    current = current.rest();
									    {
										SubLObject more_concepts = current;
										current = temp;
										{
										    SubLObject broader_terms = NIL;
										    destructuring_bind_must_consp(current, datum, $list_alt424);
										    broader_terms = current.first();
										    current = current.rest();
										    if (NIL == current) {
											html_utilities.html_markup(html_macros.$html_list_item_head$.getGlobalValue());
											html_utilities.html_char(CHAR_greater, UNPROVIDED);
											{
											    SubLObject _prev_bind_0_233 = html_macros.$html_safe_print$.currentBinding(thread);
											    try {
												html_macros.$html_safe_print$.bind(T, thread);
												format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt392$Thesaurus__A, thesaurus_abbrev);
												html_utilities.html_br();
												html_utilities.html_princ($str_alt425$Select_a_concept_to_use_);
												html_utilities.html_markup(html_macros.$html_blockquote_head$.getGlobalValue());
												{
												    SubLObject cdolist_list_var_234 = more_concepts;
												    SubLObject item = NIL;
												    for (item = cdolist_list_var_234.first(); NIL != cdolist_list_var_234; cdolist_list_var_234 = cdolist_list_var_234.rest(), item = cdolist_list_var_234.first()) {
													html_utilities.html_radio_input(id, cb_utilities.cb_fort_identifier(item), UNPROVIDED);
													html_utilities.html_princ($str_alt426$_Use_the_same_concept_as_);
													{
													    SubLObject _prev_bind_0_235 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
													    SubLObject _prev_bind_1_236 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
													    try {
														mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_IN_LIST, thread);
														mt_relevance_macros.$relevant_mts$.bind(editable_thesauri, thread);
														if (NIL != tm_internals.preferred_terms(item)) {
														    html_tm_browsing.tm_thesaurus_constant(item, NIL, NIL, NIL, UNPROVIDED, UNPROVIDED, UNPROVIDED);
														}
													    } finally {
														mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_1_236, thread);
														mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0_235, thread);
													    }
													}
													if (NIL == tm_internals.thesaurus_gensymP(item)) {
													    html_utilities.html_princ($str_alt427$__Cyc_term_);
													    html_thesaurus.tm_link($CONCEPT_DESCRIPTION, item, UNPROVIDED, UNPROVIDED);
													    html_utilities.html_princ($str_alt83$_);
													}
													html_utilities.html_br();
												    }
												}
												html_utilities.html_radio_input(id, cb_utilities.cb_fort_identifier(gensymmed_concept), T);
												format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt428$_Create_a_separate_concept_for___, v_term_232);
												html_utilities.html_br();
												html_utilities.html_radio_input(id, $$$nil, UNPROVIDED);
												html_utilities.html_princ($str_alt430$_Ignore_operation_in_this_thesaur);
												html_utilities.html_br();
												html_utilities.html_markup(html_macros.$html_blockquote_tail$.getGlobalValue());
												{
												    SubLObject valid_broader_termP = NIL;
												    SubLObject bad_terms = NIL;
												    SubLObject good_terms = NIL;
												    SubLObject cdolist_list_var_237 = broader_terms;
												    SubLObject broader_term = NIL;
												    for (broader_term = cdolist_list_var_237.first(); NIL != cdolist_list_var_237; cdolist_list_var_237 = cdolist_list_var_237.rest(), broader_term = cdolist_list_var_237.first()) {
													if (NIL != tm_datastructures.signp(broader_term)) {
													    good_terms = cons(broader_term, good_terms);
													    valid_broader_termP = T;
													} else {
													    bad_terms = cons(broader_term, bad_terms);
													}
												    }
												    if (NIL != bad_terms) {
													format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt431$Note___A__A_in__A_, new SubLObject[] { list_utilities.format_item_list(bad_terms),
														NIL != bad_terms.rest() ? ((SubLObject) ($str_alt432$_are_not_preferred_terms)) : $str_alt433$_is_not_a_preferred_term, thesaurus_abbrev });
													html_utilities.html_br();
												    }
												    tm_datastructures._csetf_tm_op_args(op, list(v_term_232, bq_cons(gensymmed_concept, append(more_concepts, NIL)), good_terms));
												    if (NIL == valid_broader_termP) {
													html_utilities.html_checkbox_input(format(NIL, $str_alt434$_D_top, id), $$$t, T, UNPROVIDED, UNPROVIDED, UNPROVIDED);
													format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt436$_Make___A__a_top_term_in__A_, v_term_232, thesaurus_abbrev);
													html_utilities.html_br();
												    }
												    set_op_english(op, UNPROVIDED);
												}
												html_utilities.html_br();
											    } finally {
												html_macros.$html_safe_print$.rebind(_prev_bind_0_233, thread);
											    }
											}
											html_utilities.html_markup(html_macros.$html_list_item_tail$.getGlobalValue());
										    } else {
											cdestructuring_bind_error(datum, $list_alt424);
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
						    html_macros.$html_safe_print$.rebind(_prev_bind_0_231, thread);
						}
					    }
					    html_utilities.html_markup(html_macros.$html_unordered_list_tail$.getGlobalValue());
					    html_utilities.html_submit_input($$$Add, UNPROVIDED, UNPROVIDED);
					    html_utilities.html_reset_input($$$Reset);
					    html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
					} finally {
					    html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_2, thread);
					    html_macros.$within_html_form$.rebind(_prev_bind_1, thread);
					    html_macros.$html_safe_print$.rebind(_prev_bind_0_230, thread);
					}
				    }
				    html_utilities.html_markup(html_macros.$html_form_tail$.getGlobalValue());
				    html_thesaurus.tm_footer();
				    html_utilities.html_source_readability_terpri(UNPROVIDED);
				} finally {
				    html_macros.$html_safe_print$.rebind(_prev_bind_0_227, thread);
				}
			    }
			    html_utilities.html_markup(html_macros.$html_body_tail$.getGlobalValue());
			    html_utilities.html_source_readability_terpri(UNPROVIDED);
			} finally {
			    html_macros.$html_inside_bodyP$.rebind(_prev_bind_0, thread);
			}
		    }
		    html_utilities.html_markup(html_macros.$html_html_tail$.getGlobalValue());
		    html_utilities.html_source_readability_terpri(UNPROVIDED);
		}
	    }
	    return NIL;
	}
    }

    public static final SubLObject tm_handle_verify_add_term(SubLObject args) {
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    {
		SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
		SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
		try {
		    mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_GENL_MT, thread);
		    mt_relevance_macros.$mt$.bind(tm_datastructures.$tm_mt$.getGlobalValue(), thread);
		    {
			SubLObject op_ids = Mapping.mapcar(symbol_function(READ_FROM_STRING_IGNORING_ERRORS), html_utilities.html_extract_input_values($$$operation, args));
			SubLObject ops_okP = T;
			SubLObject ops = NIL;
			SubLObject cdolist_list_var = op_ids;
			SubLObject id = NIL;
			for (id = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), id = cdolist_list_var.first()) {
			    {
				SubLObject op = tm_datastructures.lookup_operation(id);
				SubLObject key = princ_to_string(id);
				SubLObject concept = NIL;
				if (NIL != tm_datastructures.valid_tm_opP(op)) {
				    {
					SubLObject datum = tm_datastructures.tm_op_args(op);
					SubLObject current = datum;
					SubLObject v_term = NIL;
					SubLObject concepts = NIL;
					SubLObject broader_terms = NIL;
					destructuring_bind_must_consp(current, datum, $list_alt437);
					v_term = current.first();
					current = current.rest();
					destructuring_bind_must_consp(current, datum, $list_alt437);
					concepts = current.first();
					current = current.rest();
					destructuring_bind_must_consp(current, datum, $list_alt437);
					broader_terms = current.first();
					current = current.rest();
					if (NIL == current) {
					    {
						SubLObject concept_spec = html_utilities.html_extract_input(key, args);
						SubLObject topP = html_utilities.html_extract_input(format(NIL, $str_alt438$_A_top, key), args);
						if (!concept_spec.equalp($$$nil)) {
						    concept = html_thesaurus.tm_guess_fort(concept_spec);
						    tm_datastructures._csetf_tm_op_args(op, list(v_term, list(concept), broader_terms));
						    ops = cons(op, ops);
						    if (NIL != topP) {
							{
							    SubLObject new_op = tm_datastructures.get_tm_op();
							    SubLObject op_238 = new_op;
							    tm_datastructures._csetf_tm_op_opcode(op_238, $ADD);
							    tm_datastructures._csetf_tm_op_relation(op_238, $$topInThesaurus);
							    tm_datastructures._csetf_tm_op_inverseP(op_238, NIL);
							    tm_datastructures._csetf_tm_op_args(op_238, list(concept, tm_datastructures.tm_op_thesaurus(op)));
							    tm_datastructures._csetf_tm_op_thesaurus(op_238, tm_datastructures.$tm_mt$.getGlobalValue());
							    tm_datastructures._csetf_tm_op_status(op_238, NIL);
							    tm_datastructures._csetf_tm_op_verifyP(op_238, NIL);
							    tm_datastructures._csetf_tm_op_hiddenP(op_238, NIL);
							    tm_datastructures._csetf_tm_op_description(op_238, NIL);
							    tm_datastructures._csetf_tm_op_description_args(op_238, NIL);
							    if (NIL.isString()) {
								set_op_english(op_238, NIL);
							    } else {
								set_op_english(op_238, UNPROVIDED);
							    }
							    set_op_english(new_op, format(NIL, $str_alt439$ADD___a__as_a_top_term_in__a, v_term, tm_internals.thesaurus_name(tm_datastructures.tm_op_thesaurus(op))));
							    ops = cons(new_op, ops);
							}
						    }
						}
					    }
					} else {
					    cdestructuring_bind_error(datum, $list_alt437);
					}
				    }
				} else {
				    ops_okP = NIL;
				    html_thesaurus.tm_error($str_alt440$Some_operation_was_not_found__hen, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
				}
			    }
			}
			if (NIL != ops_okP) {
			    really_add_term(NIL, nreverse(ops));
			}
		    }
		} finally {
		    mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
		    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
		}
	    }
	    return NIL;
	}
    }

    public static final SubLObject really_add_term(SubLObject bad, SubLObject good) {
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    {
		SubLObject op_triples = perform_operations_guts(good);
		SubLObject violations = tm_integrity_check_ops(good);
		SubLObject some_okP = NIL;
		SubLObject constant = NIL;
		if (NIL == some_okP) {
		    {
			SubLObject csome_list_var = op_triples;
			SubLObject triple = NIL;
			for (triple = csome_list_var.first(); !((NIL != some_okP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest(), triple = csome_list_var.first()) {
			    if (second(triple) == $OK) {
				some_okP = T;
			    }
			}
		    }
		}
		if (NIL != some_okP) {
		    constant = second(tm_datastructures.tm_op_args(good.first())).first();
		    tm_datastructures.change_tm_value(tm_datastructures.$tm_user$.getDynamicValue(thread), $TERM, constant, UNPROVIDED);
		}
		{
		    SubLObject color_value = tm_datastructures.$tm_bg_color_default$.getDynamicValue(thread);
		    html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
		    html_utilities.html_markup(html_macros.$html_head_head$.getGlobalValue());
		    html_macros.html_head_content_type();
		    html_utilities.html_source_readability_terpri(UNPROVIDED);
		    html_utilities.html_markup(html_macros.$html_title_head$.getGlobalValue());
		    html_utilities.html_princ($$$Operation_Results);
		    html_utilities.html_markup(html_macros.$html_title_tail$.getGlobalValue());
		    html_utilities.html_markup(html_macros.$html_head_tail$.getGlobalValue());
		    html_utilities.html_source_readability_terpri(UNPROVIDED);
		    {
			SubLObject _prev_bind_0 = html_macros.$html_inside_bodyP$.currentBinding(thread);
			try {
			    html_macros.$html_inside_bodyP$.bind(T, thread);
			    html_utilities.html_markup(html_macros.$html_body_head$.getGlobalValue());
			    if (NIL != color_value) {
				html_utilities.html_markup(html_macros.$html_body_bgcolor$.getGlobalValue());
				html_utilities.html_char(CHAR_quotation, UNPROVIDED);
				html_utilities.html_markup(html_utilities.html_color(color_value));
				html_utilities.html_char(CHAR_quotation, UNPROVIDED);
			    }
			    html_utilities.html_char(CHAR_greater, UNPROVIDED);
			    {
				SubLObject _prev_bind_0_239 = html_macros.$html_safe_print$.currentBinding(thread);
				try {
				    html_macros.$html_safe_print$.bind(T, thread);
				    html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
				    html_utilities.html_markup(ONE_INTEGER);
				    html_utilities.html_char(CHAR_greater, UNPROVIDED);
				    if ((NIL != tm_control_vars.$client_thes_home_page$.getDynamicValue(thread)) && (NIL != tm_control_vars.$client_mini_logo$.getDynamicValue(thread))) {
					html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
					html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
					html_utilities.html_char(CHAR_quotation, UNPROVIDED);
					html_utilities.html_markup(tm_control_vars.$client_thes_home_page$.getDynamicValue(thread));
					html_utilities.html_char(CHAR_quotation, UNPROVIDED);
					html_utilities.html_char(CHAR_greater, UNPROVIDED);
					{
					    SubLObject _prev_bind_0_240 = html_macros.$html_safe_print$.currentBinding(thread);
					    try {
						html_macros.$html_safe_print$.bind(T, thread);
						html_utilities.html_markup(html_macros.$html_image_head$.getGlobalValue());
						html_utilities.html_markup(html_macros.$html_image_src$.getGlobalValue());
						html_utilities.html_char(CHAR_quotation, UNPROVIDED);
						html_utilities.html_markup(tm_control_vars.$client_mini_logo$.getDynamicValue(thread));
						html_utilities.html_char(CHAR_quotation, UNPROVIDED);
						if (NIL != tm_control_vars.$client_name$.getDynamicValue(thread)) {
						    html_utilities.html_markup(html_macros.$html_image_alt$.getGlobalValue());
						    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
						    html_utilities.html_markup(tm_control_vars.$client_name$.getDynamicValue(thread));
						    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
						}
						if (true) {
						    html_utilities.html_markup(html_macros.$html_image_border$.getGlobalValue());
						    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
						    html_utilities.html_markup(ZERO_INTEGER);
						    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
						}
						html_utilities.html_char(CHAR_greater, UNPROVIDED);
						{
						    SubLObject _prev_bind_0_241 = html_macros.$html_safe_print$.currentBinding(thread);
						    try {
							html_macros.$html_safe_print$.bind(T, thread);
						    } finally {
							html_macros.$html_safe_print$.rebind(_prev_bind_0_241, thread);
						    }
						}
						html_utilities.html_markup(html_macros.$html_image_tail$.getGlobalValue());
					    } finally {
						html_macros.$html_safe_print$.rebind(_prev_bind_0_240, thread);
					    }
					}
					html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
				    }
				    html_utilities.html_princ($$$Operation_Results);
				    html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
				    html_utilities.html_markup(ONE_INTEGER);
				    html_utilities.html_char(CHAR_greater, UNPROVIDED);
				    tm_logging.tm_enqueue_event($$$Operation_Results);
				    html_thesaurus.thesaurus_heading($str_alt442$really_add_term);
				    html_show_bad_ops(bad);
				    if ((NIL != good) && (NIL != op_triples)) {
					print_operations_results(op_triples);
					tm_fix_or_print_violation_choices(violations);
					html_tm_browsing.tm_full_record_info_merged(constant, tm_datastructures.tm_value(tm_datastructures.$tm_user$.getDynamicValue(thread), $THESAURI));
				    } else {
					html_utilities.html_markup(html_macros.$html_paragraph_head$.getGlobalValue());
					html_utilities.html_princ($str_alt101$No_operations_were_performed_);
					html_utilities.html_markup(html_macros.$html_paragraph_tail$.getGlobalValue());
				    }
				    html_thesaurus.tm_footer();
				    html_utilities.html_source_readability_terpri(UNPROVIDED);
				} finally {
				    html_macros.$html_safe_print$.rebind(_prev_bind_0_239, thread);
				}
			    }
			    html_utilities.html_markup(html_macros.$html_body_tail$.getGlobalValue());
			    html_utilities.html_source_readability_terpri(UNPROVIDED);
			} finally {
			    html_macros.$html_inside_bodyP$.rebind(_prev_bind_0, thread);
			}
		    }
		    html_utilities.html_markup(html_macros.$html_html_tail$.getGlobalValue());
		    html_utilities.html_source_readability_terpri(UNPROVIDED);
		}
	    }
	    return NIL;
	}
    }

    public static final SubLObject tm_concept_description(SubLObject args) {
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    {
		SubLObject id = html_utilities.html_extract_input($$$id, args);
		SubLObject concept = html_thesaurus.tm_guess_fort(id);
		if (NIL != concept) {
		    {
			SubLObject text = pph_main.generate_phrase(concept, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
			if (NIL == text) {
			    text = (NIL != constant_handles.constant_p(concept)) ? ((SubLObject) (constants_high.constant_name(concept))) : string_utilities.object_to_string(narts_high.nart_el_formula(concept));
			}
			{
			    SubLObject color_value = tm_datastructures.$tm_bg_color_default$.getDynamicValue(thread);
			    html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
			    html_utilities.html_markup(html_macros.$html_head_head$.getGlobalValue());
			    html_macros.html_head_content_type();
			    html_utilities.html_source_readability_terpri(UNPROVIDED);
			    html_utilities.html_markup(html_macros.$html_title_head$.getGlobalValue());
			    html_utilities.html_princ(format(NIL, $str_alt444$Description_of_the_Cyc_concept___, text));
			    html_utilities.html_markup(html_macros.$html_title_tail$.getGlobalValue());
			    html_utilities.html_markup(html_macros.$html_head_tail$.getGlobalValue());
			    html_utilities.html_source_readability_terpri(UNPROVIDED);
			    {
				SubLObject _prev_bind_0 = html_macros.$html_inside_bodyP$.currentBinding(thread);
				try {
				    html_macros.$html_inside_bodyP$.bind(T, thread);
				    html_utilities.html_markup(html_macros.$html_body_head$.getGlobalValue());
				    if (NIL != color_value) {
					html_utilities.html_markup(html_macros.$html_body_bgcolor$.getGlobalValue());
					html_utilities.html_char(CHAR_quotation, UNPROVIDED);
					html_utilities.html_markup(html_utilities.html_color(color_value));
					html_utilities.html_char(CHAR_quotation, UNPROVIDED);
				    }
				    html_utilities.html_char(CHAR_greater, UNPROVIDED);
				    {
					SubLObject _prev_bind_0_242 = html_macros.$html_safe_print$.currentBinding(thread);
					try {
					    html_macros.$html_safe_print$.bind(T, thread);
					    html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
					    html_utilities.html_markup(ONE_INTEGER);
					    html_utilities.html_char(CHAR_greater, UNPROVIDED);
					    if ((NIL != tm_control_vars.$client_thes_home_page$.getDynamicValue(thread)) && (NIL != tm_control_vars.$client_mini_logo$.getDynamicValue(thread))) {
						html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
						html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
						html_utilities.html_char(CHAR_quotation, UNPROVIDED);
						html_utilities.html_markup(tm_control_vars.$client_thes_home_page$.getDynamicValue(thread));
						html_utilities.html_char(CHAR_quotation, UNPROVIDED);
						html_utilities.html_char(CHAR_greater, UNPROVIDED);
						{
						    SubLObject _prev_bind_0_243 = html_macros.$html_safe_print$.currentBinding(thread);
						    try {
							html_macros.$html_safe_print$.bind(T, thread);
							html_utilities.html_markup(html_macros.$html_image_head$.getGlobalValue());
							html_utilities.html_markup(html_macros.$html_image_src$.getGlobalValue());
							html_utilities.html_char(CHAR_quotation, UNPROVIDED);
							html_utilities.html_markup(tm_control_vars.$client_mini_logo$.getDynamicValue(thread));
							html_utilities.html_char(CHAR_quotation, UNPROVIDED);
							if (NIL != tm_control_vars.$client_name$.getDynamicValue(thread)) {
							    html_utilities.html_markup(html_macros.$html_image_alt$.getGlobalValue());
							    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
							    html_utilities.html_markup(tm_control_vars.$client_name$.getDynamicValue(thread));
							    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
							}
							if (true) {
							    html_utilities.html_markup(html_macros.$html_image_border$.getGlobalValue());
							    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
							    html_utilities.html_markup(ZERO_INTEGER);
							    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
							}
							html_utilities.html_char(CHAR_greater, UNPROVIDED);
							{
							    SubLObject _prev_bind_0_244 = html_macros.$html_safe_print$.currentBinding(thread);
							    try {
								html_macros.$html_safe_print$.bind(T, thread);
							    } finally {
								html_macros.$html_safe_print$.rebind(_prev_bind_0_244, thread);
							    }
							}
							html_utilities.html_markup(html_macros.$html_image_tail$.getGlobalValue());
						    } finally {
							html_macros.$html_safe_print$.rebind(_prev_bind_0_243, thread);
						    }
						}
						html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
					    }
					    html_utilities.html_princ(format(NIL, $str_alt444$Description_of_the_Cyc_concept___, text));
					    html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
					    html_utilities.html_markup(ONE_INTEGER);
					    html_utilities.html_char(CHAR_greater, UNPROVIDED);
					    tm_logging.tm_enqueue_event(format(NIL, $str_alt444$Description_of_the_Cyc_concept___, text));
					    html_thesaurus.thesaurus_heading($str_alt445$tm_concept_description);
					    html_utilities.html_markup(html_macros.$html_paragraph_head$.getGlobalValue());
					    {
						SubLObject _prev_bind_0_245 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
						SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
						try {
						    mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
						    mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
						    {
							SubLObject comment = kb_accessors.comment(concept, UNPROVIDED);
							if (NIL != comment) {
							    html_utilities.html_princ(comment);
							} else {
							    html_utilities.html_princ($str_alt446$No_description_was_found_);
							}
						    }
						} finally {
						    mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
						    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0_245, thread);
						}
					    }
					    html_utilities.html_markup(html_macros.$html_paragraph_tail$.getGlobalValue());
					    html_thesaurus.tm_footer();
					    html_utilities.html_source_readability_terpri(UNPROVIDED);
					} finally {
					    html_macros.$html_safe_print$.rebind(_prev_bind_0_242, thread);
					}
				    }
				    html_utilities.html_markup(html_macros.$html_body_tail$.getGlobalValue());
				    html_utilities.html_source_readability_terpri(UNPROVIDED);
				} finally {
				    html_macros.$html_inside_bodyP$.rebind(_prev_bind_0, thread);
				}
			    }
			    html_utilities.html_markup(html_macros.$html_html_tail$.getGlobalValue());
			    html_utilities.html_source_readability_terpri(UNPROVIDED);
			}
		    }
		} else {
		    html_thesaurus.tm_error($str_alt447$No_concept_found_for_ID__A_, id, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
		}
	    }
	    return NIL;
	}
    }

    public static final SubLObject tm_rename_term(SubLObject args) {
	if (args == UNPROVIDED) {
	    args = NIL;
	}
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    {
		SubLObject color_value = tm_datastructures.$tm_bg_color_default$.getDynamicValue(thread);
		html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
		html_utilities.html_markup(html_macros.$html_head_head$.getGlobalValue());
		html_macros.html_head_content_type();
		html_utilities.html_source_readability_terpri(UNPROVIDED);
		html_utilities.html_markup(html_macros.$html_title_head$.getGlobalValue());
		html_utilities.html_princ($$$Rename_Term);
		html_utilities.html_markup(html_macros.$html_title_tail$.getGlobalValue());
		html_utilities.html_markup(html_macros.$html_head_tail$.getGlobalValue());
		html_utilities.html_source_readability_terpri(UNPROVIDED);
		{
		    SubLObject _prev_bind_0 = html_macros.$html_inside_bodyP$.currentBinding(thread);
		    try {
			html_macros.$html_inside_bodyP$.bind(T, thread);
			html_utilities.html_markup(html_macros.$html_body_head$.getGlobalValue());
			if (NIL != color_value) {
			    html_utilities.html_markup(html_macros.$html_body_bgcolor$.getGlobalValue());
			    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
			    html_utilities.html_markup(html_utilities.html_color(color_value));
			    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
			}
			html_utilities.html_char(CHAR_greater, UNPROVIDED);
			{
			    SubLObject _prev_bind_0_246 = html_macros.$html_safe_print$.currentBinding(thread);
			    try {
				html_macros.$html_safe_print$.bind(T, thread);
				html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
				html_utilities.html_markup(ONE_INTEGER);
				html_utilities.html_char(CHAR_greater, UNPROVIDED);
				if ((NIL != tm_control_vars.$client_thes_home_page$.getDynamicValue(thread)) && (NIL != tm_control_vars.$client_mini_logo$.getDynamicValue(thread))) {
				    html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
				    html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
				    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
				    html_utilities.html_markup(tm_control_vars.$client_thes_home_page$.getDynamicValue(thread));
				    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
				    html_utilities.html_char(CHAR_greater, UNPROVIDED);
				    {
					SubLObject _prev_bind_0_247 = html_macros.$html_safe_print$.currentBinding(thread);
					try {
					    html_macros.$html_safe_print$.bind(T, thread);
					    html_utilities.html_markup(html_macros.$html_image_head$.getGlobalValue());
					    html_utilities.html_markup(html_macros.$html_image_src$.getGlobalValue());
					    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
					    html_utilities.html_markup(tm_control_vars.$client_mini_logo$.getDynamicValue(thread));
					    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
					    if (NIL != tm_control_vars.$client_name$.getDynamicValue(thread)) {
						html_utilities.html_markup(html_macros.$html_image_alt$.getGlobalValue());
						html_utilities.html_char(CHAR_quotation, UNPROVIDED);
						html_utilities.html_markup(tm_control_vars.$client_name$.getDynamicValue(thread));
						html_utilities.html_char(CHAR_quotation, UNPROVIDED);
					    }
					    if (true) {
						html_utilities.html_markup(html_macros.$html_image_border$.getGlobalValue());
						html_utilities.html_char(CHAR_quotation, UNPROVIDED);
						html_utilities.html_markup(ZERO_INTEGER);
						html_utilities.html_char(CHAR_quotation, UNPROVIDED);
					    }
					    html_utilities.html_char(CHAR_greater, UNPROVIDED);
					    {
						SubLObject _prev_bind_0_248 = html_macros.$html_safe_print$.currentBinding(thread);
						try {
						    html_macros.$html_safe_print$.bind(T, thread);
						} finally {
						    html_macros.$html_safe_print$.rebind(_prev_bind_0_248, thread);
						}
					    }
					    html_utilities.html_markup(html_macros.$html_image_tail$.getGlobalValue());
					} finally {
					    html_macros.$html_safe_print$.rebind(_prev_bind_0_247, thread);
					}
				    }
				    html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
				}
				html_utilities.html_princ($$$Rename_Term);
				html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
				html_utilities.html_markup(ONE_INTEGER);
				html_utilities.html_char(CHAR_greater, UNPROVIDED);
				tm_logging.tm_enqueue_event($$$Rename_Term);
				if (!(true && (NIL != tm_internals.privelegedP(tm_datastructures.$tm_user$.getDynamicValue(thread), $str_alt297$limited_editor)))) {
				    html_utilities.html_princ($str_alt186$Sorry__you_do_not_have_permission);
				} else {
				    html_thesaurus.thesaurus_heading($str_alt450$tm_rename_term);
				    html_utilities.html_hr(UNPROVIDED, UNPROVIDED);
				    if (NIL != tm_internals.editing_allowedP()) {
					{
					    SubLObject default_string = (NIL != tm_datastructures.tm_value(tm_datastructures.$tm_user$.getDynamicValue(thread), $TERM))
						    ? ((SubLObject) (tm_internals.tm_string_for_constant(tm_datastructures.tm_value(tm_datastructures.$tm_user$.getDynamicValue(thread), $TERM), NIL, NIL, T)))
						    : $str_alt2$;
					    SubLObject length = max($int$40, length(default_string));
					    html_utilities.html_markup(html_macros.$html_form_head$.getGlobalValue());
					    html_utilities.html_markup(html_macros.$html_form_action$.getGlobalValue());
					    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
					    html_utilities.html_markup(system_parameters.$cyc_cgi_program$.getDynamicValue(thread));
					    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
					    if (NIL != html_macros.$html_form_method_post$.getGlobalValue()) {
						html_utilities.html_markup(html_macros.$html_form_method$.getGlobalValue());
						html_utilities.html_char(CHAR_quotation, UNPROVIDED);
						html_utilities.html_markup(html_macros.$html_form_method_post$.getGlobalValue());
						html_utilities.html_char(CHAR_quotation, UNPROVIDED);
					    }
					    html_utilities.html_char(CHAR_greater, UNPROVIDED);
					    {
						SubLObject _prev_bind_0_249 = html_macros.$html_safe_print$.currentBinding(thread);
						SubLObject _prev_bind_1 = html_macros.$within_html_form$.currentBinding(thread);
						SubLObject _prev_bind_2 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
						try {
						    html_macros.$html_safe_print$.bind(T, thread);
						    html_macros.$within_html_form$.bind(T, thread);
						    html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
						    html_utilities.html_hidden_input($str_alt451$tm_handle_rename_term, T, UNPROVIDED);
						    html_utilities.html_markup(html_macros.$html_table_head$.getGlobalValue());
						    if (true) {
							html_utilities.html_markup(html_macros.$html_table_border$.getGlobalValue());
							html_utilities.html_char(CHAR_quotation, UNPROVIDED);
							html_utilities.html_markup(ZERO_INTEGER);
							html_utilities.html_char(CHAR_quotation, UNPROVIDED);
						    }
						    html_utilities.html_char(CHAR_greater, UNPROVIDED);
						    {
							SubLObject _prev_bind_0_250 = html_macros.$html_safe_print$.currentBinding(thread);
							try {
							    html_macros.$html_safe_print$.bind(T, thread);
							    html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
							    html_utilities.html_char(CHAR_greater, UNPROVIDED);
							    {
								SubLObject _prev_bind_0_251 = html_macros.$html_safe_print$.currentBinding(thread);
								try {
								    html_macros.$html_safe_print$.bind(T, thread);
								    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
								    html_utilities.html_char(CHAR_greater, UNPROVIDED);
								    {
									SubLObject _prev_bind_0_252 = html_macros.$html_safe_print$.currentBinding(thread);
									try {
									    html_macros.$html_safe_print$.bind(T, thread);
									    html_utilities.html_princ($str_alt452$Enter_Term_to_Rename__);
									} finally {
									    html_macros.$html_safe_print$.rebind(_prev_bind_0_252, thread);
									}
								    }
								    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
								    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
								    html_utilities.html_char(CHAR_greater, UNPROVIDED);
								    {
									SubLObject _prev_bind_0_253 = html_macros.$html_safe_print$.currentBinding(thread);
									try {
									    html_macros.$html_safe_print$.bind(T, thread);
									    html_utilities.html_text_input($str_alt305$term_string, default_string, length);
									} finally {
									    html_macros.$html_safe_print$.rebind(_prev_bind_0_253, thread);
									}
								    }
								    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
								} finally {
								    html_macros.$html_safe_print$.rebind(_prev_bind_0_251, thread);
								}
							    }
							    html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
							    html_utilities.html_source_readability_terpri(UNPROVIDED);
							    html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
							    html_utilities.html_char(CHAR_greater, UNPROVIDED);
							    {
								SubLObject _prev_bind_0_254 = html_macros.$html_safe_print$.currentBinding(thread);
								try {
								    html_macros.$html_safe_print$.bind(T, thread);
								    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
								    html_utilities.html_char(CHAR_greater, UNPROVIDED);
								    {
									SubLObject _prev_bind_0_255 = html_macros.$html_safe_print$.currentBinding(thread);
									try {
									    html_macros.$html_safe_print$.bind(T, thread);
									    html_utilities.html_princ($str_alt453$Enter_New_Name__);
									} finally {
									    html_macros.$html_safe_print$.rebind(_prev_bind_0_255, thread);
									}
								    }
								    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
								    html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
								    html_utilities.html_char(CHAR_greater, UNPROVIDED);
								    {
									SubLObject _prev_bind_0_256 = html_macros.$html_safe_print$.currentBinding(thread);
									try {
									    html_macros.$html_safe_print$.bind(T, thread);
									    html_utilities.html_text_input($str_alt454$new_string, default_string, length);
									} finally {
									    html_macros.$html_safe_print$.rebind(_prev_bind_0_256, thread);
									}
								    }
								    html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
								} finally {
								    html_macros.$html_safe_print$.rebind(_prev_bind_0_254, thread);
								}
							    }
							    html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
							    html_utilities.html_source_readability_terpri(UNPROVIDED);
							} finally {
							    html_macros.$html_safe_print$.rebind(_prev_bind_0_250, thread);
							}
						    }
						    html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
						    html_utilities.html_checkbox_input($str_alt311$override_default_case, $$$T, NIL == tm_internals.$tm_use_default_case_for_strings$.getDynamicValue(thread) ? ((SubLObject) (T)) : NIL, UNPROVIDED, UNPROVIDED, UNPROVIDED);
						    html_utilities.html_princ($$$Override_Default_Case);
						    html_utilities.html_br();
						    html_utilities.html_br();
						    html_utilities.html_princ($str_alt455$Select_Thesauri_);
						    html_utilities.html_br();
						    html_thesaurus.tm_edit_thesaurus_selection(T, UNPROVIDED, UNPROVIDED, UNPROVIDED);
						    html_utilities.html_br();
						    html_utilities.html_submit_input($$$Rename, UNPROVIDED, UNPROVIDED);
						    html_utilities.html_reset_input(UNPROVIDED);
						    html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
						} finally {
						    html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_2, thread);
						    html_macros.$within_html_form$.rebind(_prev_bind_1, thread);
						    html_macros.$html_safe_print$.rebind(_prev_bind_0_249, thread);
						}
					    }
					    html_utilities.html_markup(html_macros.$html_form_tail$.getGlobalValue());
					}
				    } else {
					html_thesaurus.tm_report_editing_disabled();
				    }
				}
				html_thesaurus.tm_footer();
				html_utilities.html_source_readability_terpri(UNPROVIDED);
			    } finally {
				html_macros.$html_safe_print$.rebind(_prev_bind_0_246, thread);
			    }
			}
			html_utilities.html_markup(html_macros.$html_body_tail$.getGlobalValue());
			html_utilities.html_source_readability_terpri(UNPROVIDED);
		    } finally {
			html_macros.$html_inside_bodyP$.rebind(_prev_bind_0, thread);
		    }
		}
		html_utilities.html_markup(html_macros.$html_html_tail$.getGlobalValue());
		html_utilities.html_source_readability_terpri(UNPROVIDED);
	    }
	    return NIL;
	}
    }

    public static final SubLObject tm_handle_rename_term(SubLObject args) {
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    {
		SubLObject term_string = html_utilities.html_extract_input($str_alt305$term_string, args);
		SubLObject new_string = html_utilities.html_extract_input($str_alt454$new_string, args);
		SubLObject override_default_case = html_utilities.html_extract_input($str_alt311$override_default_case, args);
		SubLObject thesauri_strings = html_utilities.html_extract_input_values($$$thesauri, args);
		SubLObject ops = NIL;
		if (NIL == term_string) {
		    return html_thesaurus.tm_error($str_alt458$Rename_Term__You_must_specify_a_t, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
		}
		if (NIL == new_string) {
		    return html_thesaurus.tm_error($str_alt459$Rename_Term__You_must_enter_a_new, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
		}
		if (NIL == thesauri_strings) {
		    return html_thesaurus.tm_error($str_alt460$Rename_Term__You_must_choose_thes, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
		}
		term_string = tm_internals.canonicalize_lexical_term(term_string);
		new_string = tm_internals.canonicalize_lexical_term(new_string);
		if (term_string.equal(new_string)) {
		    return html_thesaurus.tm_message_to_user($$$No_Changes_to_Perform, $str_alt462$No_rename_operations_were_specifi);
		}
		{
		    SubLObject cdolist_list_var = thesauri_strings;
		    SubLObject thesaurus_name = NIL;
		    for (thesaurus_name = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), thesaurus_name = cdolist_list_var.first()) {
			{
			    SubLObject op = tm_datastructures.get_tm_op();
			    {
				SubLObject _prev_bind_0 = tm_internals.$tm_use_default_case_for_strings$.currentBinding(thread);
				try {
				    tm_internals.$tm_use_default_case_for_strings$.bind(NIL != override_default_case ? ((SubLObject) (NIL)) : T, thread);
				    {
					SubLObject thesaurus = tm_internals.thesaurus_constant_from_name(thesaurus_name);
					SubLObject op_257 = op;
					tm_datastructures._csetf_tm_op_opcode(op_257, $REPLACE);
					tm_datastructures._csetf_tm_op_relation(op_257, $$preferredTerm);
					tm_datastructures._csetf_tm_op_inverseP(op_257, NIL);
					tm_datastructures._csetf_tm_op_args(op_257, list(term_string, term_string, new_string));
					tm_datastructures._csetf_tm_op_thesaurus(op_257, thesaurus);
					tm_datastructures._csetf_tm_op_status(op_257, NIL);
					tm_datastructures._csetf_tm_op_verifyP(op_257, NIL);
					tm_datastructures._csetf_tm_op_hiddenP(op_257, NIL);
					tm_datastructures._csetf_tm_op_description(op_257, NIL);
					tm_datastructures._csetf_tm_op_description_args(op_257, NIL);
					if (NIL.isString()) {
					    set_op_english(op_257, NIL);
					} else {
					    set_op_english(op_257, UNPROVIDED);
					}
					ops = cons(op, ops);
				    }
				} finally {
				    tm_internals.$tm_use_default_case_for_strings$.rebind(_prev_bind_0, thread);
				}
			    }
			}
		    }
		}
		ops = nreverse(ops);
		{
		    SubLObject _prev_bind_0 = tm_internals.$tm_use_default_case_for_strings$.currentBinding(thread);
		    try {
			tm_internals.$tm_use_default_case_for_strings$.bind(NIL != override_default_case ? ((SubLObject) (NIL)) : T, thread);
			thread.resetMultipleValues();
			{
			    SubLObject bad = tm_internals.check_operations(ops);
			    SubLObject good = thread.secondMultipleValue();
			    SubLObject verifyP = thread.thirdMultipleValue();
			    thread.resetMultipleValues();
			    if (NIL == good) {
				html_show_bad_ops_page(bad);
			    } else if (NIL != verifyP) {
				html_verify_ops_page($str_alt102$tm_handle_do_operations, bad, good);
			    } else {
				{
				    SubLObject constant = tm_datastructures.tm_op_args(good.first()).first();
				    SubLObject thesauri = tm_datastructures.tm_value(tm_datastructures.$tm_user$.getDynamicValue(thread), $THESAURI);
				    do_good_ops_results(bad, good, symbol_function(TM_FULL_RECORD_INFO_MERGED), list(constant, thesauri), $$$Rename_Term, T);
				}
			    }

			}
		    } finally {
			tm_internals.$tm_use_default_case_for_strings$.rebind(_prev_bind_0, thread);
		    }
		}
	    }
	    return NIL;
	}
    }

    /**
     * Produce a page for specifying the name of a new thesaurus
     */
    public static final SubLObject tm_create_thesaurus(SubLObject args) {
	if (args == UNPROVIDED) {
	    args = NIL;
	}
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    {
		SubLObject color_value = tm_datastructures.$tm_bg_color_default$.getDynamicValue(thread);
		html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
		html_utilities.html_markup(html_macros.$html_head_head$.getGlobalValue());
		html_macros.html_head_content_type();
		html_utilities.html_source_readability_terpri(UNPROVIDED);
		html_utilities.html_markup(html_macros.$html_title_head$.getGlobalValue());
		html_utilities.html_princ($$$Create_New_Thesaurus);
		html_utilities.html_markup(html_macros.$html_title_tail$.getGlobalValue());
		html_utilities.html_markup(html_macros.$html_head_tail$.getGlobalValue());
		html_utilities.html_source_readability_terpri(UNPROVIDED);
		{
		    SubLObject _prev_bind_0 = html_macros.$html_inside_bodyP$.currentBinding(thread);
		    try {
			html_macros.$html_inside_bodyP$.bind(T, thread);
			html_utilities.html_markup(html_macros.$html_body_head$.getGlobalValue());
			if (NIL != color_value) {
			    html_utilities.html_markup(html_macros.$html_body_bgcolor$.getGlobalValue());
			    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
			    html_utilities.html_markup(html_utilities.html_color(color_value));
			    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
			}
			html_utilities.html_char(CHAR_greater, UNPROVIDED);
			{
			    SubLObject _prev_bind_0_258 = html_macros.$html_safe_print$.currentBinding(thread);
			    try {
				html_macros.$html_safe_print$.bind(T, thread);
				html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
				html_utilities.html_markup(ONE_INTEGER);
				html_utilities.html_char(CHAR_greater, UNPROVIDED);
				if ((NIL != tm_control_vars.$client_thes_home_page$.getDynamicValue(thread)) && (NIL != tm_control_vars.$client_mini_logo$.getDynamicValue(thread))) {
				    html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
				    html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
				    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
				    html_utilities.html_markup(tm_control_vars.$client_thes_home_page$.getDynamicValue(thread));
				    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
				    html_utilities.html_char(CHAR_greater, UNPROVIDED);
				    {
					SubLObject _prev_bind_0_259 = html_macros.$html_safe_print$.currentBinding(thread);
					try {
					    html_macros.$html_safe_print$.bind(T, thread);
					    html_utilities.html_markup(html_macros.$html_image_head$.getGlobalValue());
					    html_utilities.html_markup(html_macros.$html_image_src$.getGlobalValue());
					    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
					    html_utilities.html_markup(tm_control_vars.$client_mini_logo$.getDynamicValue(thread));
					    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
					    if (NIL != tm_control_vars.$client_name$.getDynamicValue(thread)) {
						html_utilities.html_markup(html_macros.$html_image_alt$.getGlobalValue());
						html_utilities.html_char(CHAR_quotation, UNPROVIDED);
						html_utilities.html_markup(tm_control_vars.$client_name$.getDynamicValue(thread));
						html_utilities.html_char(CHAR_quotation, UNPROVIDED);
					    }
					    if (true) {
						html_utilities.html_markup(html_macros.$html_image_border$.getGlobalValue());
						html_utilities.html_char(CHAR_quotation, UNPROVIDED);
						html_utilities.html_markup(ZERO_INTEGER);
						html_utilities.html_char(CHAR_quotation, UNPROVIDED);
					    }
					    html_utilities.html_char(CHAR_greater, UNPROVIDED);
					    {
						SubLObject _prev_bind_0_260 = html_macros.$html_safe_print$.currentBinding(thread);
						try {
						    html_macros.$html_safe_print$.bind(T, thread);
						} finally {
						    html_macros.$html_safe_print$.rebind(_prev_bind_0_260, thread);
						}
					    }
					    html_utilities.html_markup(html_macros.$html_image_tail$.getGlobalValue());
					} finally {
					    html_macros.$html_safe_print$.rebind(_prev_bind_0_259, thread);
					}
				    }
				    html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
				}
				html_utilities.html_princ($$$Create_New_Thesaurus);
				html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
				html_utilities.html_markup(ONE_INTEGER);
				html_utilities.html_char(CHAR_greater, UNPROVIDED);
				tm_logging.tm_enqueue_event($$$Create_New_Thesaurus);
				if (!(true && (NIL != tm_internals.privelegedP(tm_datastructures.$tm_user$.getDynamicValue(thread), $str_alt185$full_editor)))) {
				    html_utilities.html_princ($str_alt186$Sorry__you_do_not_have_permission);
				} else {
				    html_thesaurus.thesaurus_heading($str_alt466$tm_create_thesaurus);
				    if (NIL != tm_internals.editing_allowedP()) {
					html_utilities.html_markup(html_macros.$html_form_head$.getGlobalValue());
					html_utilities.html_markup(html_macros.$html_form_action$.getGlobalValue());
					html_utilities.html_char(CHAR_quotation, UNPROVIDED);
					html_utilities.html_markup(system_parameters.$cyc_cgi_program$.getDynamicValue(thread));
					html_utilities.html_char(CHAR_quotation, UNPROVIDED);
					if (NIL != html_macros.$html_form_method_post$.getGlobalValue()) {
					    html_utilities.html_markup(html_macros.$html_form_method$.getGlobalValue());
					    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
					    html_utilities.html_markup(html_macros.$html_form_method_post$.getGlobalValue());
					    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
					}
					html_utilities.html_char(CHAR_greater, UNPROVIDED);
					{
					    SubLObject _prev_bind_0_261 = html_macros.$html_safe_print$.currentBinding(thread);
					    SubLObject _prev_bind_1 = html_macros.$within_html_form$.currentBinding(thread);
					    SubLObject _prev_bind_2 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
					    try {
						html_macros.$html_safe_print$.bind(T, thread);
						html_macros.$within_html_form$.bind(T, thread);
						html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
						html_utilities.html_hidden_input($str_alt467$tm_handle_create_thesaurus, T, UNPROVIDED);
						html_utilities.html_br();
						html_utilities.html_princ($str_alt468$Enter_name_for_new_thesaurus_);
						html_utilities.html_br();
						html_utilities.html_text_input($$$name, NIL, $int$30);
						html_utilities.html_br();
						html_utilities.html_br();
						html_utilities.html_princ($str_alt470$Enter_an_abbreviation_for_it_);
						html_utilities.html_br();
						html_utilities.html_text_input($$$abbrev, NIL, FIVE_INTEGER);
						html_utilities.html_br();
						html_utilities.html_br();
						html_utilities.html_submit_input($$$Create, UNPROVIDED, UNPROVIDED);
						html_utilities.html_reset_input($$$Reset);
						html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
					    } finally {
						html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_2, thread);
						html_macros.$within_html_form$.rebind(_prev_bind_1, thread);
						html_macros.$html_safe_print$.rebind(_prev_bind_0_261, thread);
					    }
					}
					html_utilities.html_markup(html_macros.$html_form_tail$.getGlobalValue());
				    } else {
					html_thesaurus.tm_report_editing_disabled();
				    }
				}
				html_thesaurus.tm_footer();
				html_utilities.html_source_readability_terpri(UNPROVIDED);
			    } finally {
				html_macros.$html_safe_print$.rebind(_prev_bind_0_258, thread);
			    }
			}
			html_utilities.html_markup(html_macros.$html_body_tail$.getGlobalValue());
			html_utilities.html_source_readability_terpri(UNPROVIDED);
		    } finally {
			html_macros.$html_inside_bodyP$.rebind(_prev_bind_0, thread);
		    }
		}
		html_utilities.html_markup(html_macros.$html_html_tail$.getGlobalValue());
		html_utilities.html_source_readability_terpri(UNPROVIDED);
	    }
	    return NIL;
	}
    }

    public static final SubLObject tm_handle_create_thesaurus(SubLObject args) {
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    {
		SubLObject name = html_utilities.html_extract_input($$$name, args);
		SubLObject abbrev = html_utilities.html_extract_input($$$abbrev, args);
		SubLObject empty_string = $str_alt2$;
		if (name.isString()) {
		    name = string_utilities.trim_whitespace(name);
		} else {
		    return html_thesaurus.tm_error($str_alt474$_s_was_not_a_valid_name, name, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
		}
		if (!(name.isString() && (NIL != tm_internals.valid_thesaurus_nameP(name)))) {
		    if (name.equalp(empty_string)) {
			return html_thesaurus.tm_error($str_alt475$Please_enter_a_name_for_the_thesa, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
		    } else {
			return html_thesaurus.tm_error($str_alt474$_s_was_not_a_valid_name, name, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
		    }
		}
		if (abbrev.isString()) {
		    abbrev = string_utilities.trim_whitespace(abbrev);
		} else {
		    return html_thesaurus.tm_error($str_alt476$_s_was_not_a_valid_abbreviation_, abbrev, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
		}
		if (!(abbrev.isString() && (NIL != tm_internals.valid_abbreviationP(abbrev)))) {
		    if (abbrev.equalp(empty_string)) {
			return html_thesaurus.tm_error($str_alt477$Please_enter_an_abbreviation_to_u, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
		    } else {
			return html_thesaurus.tm_error($str_alt476$_s_was_not_a_valid_abbreviation_, abbrev, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
		    }
		}
		if (NIL != tm_internals.thesaurus_constant_from_abbreviation(abbrev)) {
		    return html_thesaurus.tm_error($str_alt478$The_name_or_abbreviation__s_is_al, abbrev, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
		}
		if (NIL != tm_internals.thesaurus_constant_from_name(name)) {
		    return html_thesaurus.tm_error($str_alt478$The_name_or_abbreviation__s_is_al, name, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
		}
		thread.resetMultipleValues();
		{
		    SubLObject thes_constant = tm_internals.do_create_thesaurus(name, abbrev);
		    SubLObject error = thread.secondMultipleValue();
		    thread.resetMultipleValues();
		    if (NIL != error) {
			return html_thesaurus.tm_error(error, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
		    }
		    {
			SubLObject color_value = tm_datastructures.$tm_bg_color_default$.getDynamicValue(thread);
			html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
			html_utilities.html_markup(html_macros.$html_head_head$.getGlobalValue());
			html_macros.html_head_content_type();
			html_utilities.html_source_readability_terpri(UNPROVIDED);
			html_utilities.html_markup(html_macros.$html_title_head$.getGlobalValue());
			html_utilities.html_princ(format(NIL, $str_alt479$Thesaurus__A_Created, name));
			html_utilities.html_markup(html_macros.$html_title_tail$.getGlobalValue());
			html_utilities.html_markup(html_macros.$html_head_tail$.getGlobalValue());
			html_utilities.html_source_readability_terpri(UNPROVIDED);
			{
			    SubLObject _prev_bind_0 = html_macros.$html_inside_bodyP$.currentBinding(thread);
			    try {
				html_macros.$html_inside_bodyP$.bind(T, thread);
				html_utilities.html_markup(html_macros.$html_body_head$.getGlobalValue());
				if (NIL != color_value) {
				    html_utilities.html_markup(html_macros.$html_body_bgcolor$.getGlobalValue());
				    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
				    html_utilities.html_markup(html_utilities.html_color(color_value));
				    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
				}
				html_utilities.html_char(CHAR_greater, UNPROVIDED);
				{
				    SubLObject _prev_bind_0_262 = html_macros.$html_safe_print$.currentBinding(thread);
				    try {
					html_macros.$html_safe_print$.bind(T, thread);
					html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
					html_utilities.html_markup(ONE_INTEGER);
					html_utilities.html_char(CHAR_greater, UNPROVIDED);
					if ((NIL != tm_control_vars.$client_thes_home_page$.getDynamicValue(thread)) && (NIL != tm_control_vars.$client_mini_logo$.getDynamicValue(thread))) {
					    html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
					    html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
					    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
					    html_utilities.html_markup(tm_control_vars.$client_thes_home_page$.getDynamicValue(thread));
					    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
					    html_utilities.html_char(CHAR_greater, UNPROVIDED);
					    {
						SubLObject _prev_bind_0_263 = html_macros.$html_safe_print$.currentBinding(thread);
						try {
						    html_macros.$html_safe_print$.bind(T, thread);
						    html_utilities.html_markup(html_macros.$html_image_head$.getGlobalValue());
						    html_utilities.html_markup(html_macros.$html_image_src$.getGlobalValue());
						    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
						    html_utilities.html_markup(tm_control_vars.$client_mini_logo$.getDynamicValue(thread));
						    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
						    if (NIL != tm_control_vars.$client_name$.getDynamicValue(thread)) {
							html_utilities.html_markup(html_macros.$html_image_alt$.getGlobalValue());
							html_utilities.html_char(CHAR_quotation, UNPROVIDED);
							html_utilities.html_markup(tm_control_vars.$client_name$.getDynamicValue(thread));
							html_utilities.html_char(CHAR_quotation, UNPROVIDED);
						    }
						    if (true) {
							html_utilities.html_markup(html_macros.$html_image_border$.getGlobalValue());
							html_utilities.html_char(CHAR_quotation, UNPROVIDED);
							html_utilities.html_markup(ZERO_INTEGER);
							html_utilities.html_char(CHAR_quotation, UNPROVIDED);
						    }
						    html_utilities.html_char(CHAR_greater, UNPROVIDED);
						    {
							SubLObject _prev_bind_0_264 = html_macros.$html_safe_print$.currentBinding(thread);
							try {
							    html_macros.$html_safe_print$.bind(T, thread);
							} finally {
							    html_macros.$html_safe_print$.rebind(_prev_bind_0_264, thread);
							}
						    }
						    html_utilities.html_markup(html_macros.$html_image_tail$.getGlobalValue());
						} finally {
						    html_macros.$html_safe_print$.rebind(_prev_bind_0_263, thread);
						}
					    }
					    html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
					}
					html_utilities.html_princ(format(NIL, $str_alt479$Thesaurus__A_Created, name));
					html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
					html_utilities.html_markup(ONE_INTEGER);
					html_utilities.html_char(CHAR_greater, UNPROVIDED);
					tm_logging.tm_enqueue_event(format(NIL, $str_alt479$Thesaurus__A_Created, name));
					html_thesaurus.thesaurus_heading($str_alt467$tm_handle_create_thesaurus);
					html_tm_browsing.tm_thesaurus_info_section(thes_constant);
					html_thesaurus.tm_footer();
					html_utilities.html_source_readability_terpri(UNPROVIDED);
				    } finally {
					html_macros.$html_safe_print$.rebind(_prev_bind_0_262, thread);
				    }
				}
				html_utilities.html_markup(html_macros.$html_body_tail$.getGlobalValue());
				html_utilities.html_source_readability_terpri(UNPROVIDED);
			    } finally {
				html_macros.$html_inside_bodyP$.rebind(_prev_bind_0, thread);
			    }
			}
			html_utilities.html_markup(html_macros.$html_html_tail$.getGlobalValue());
			html_utilities.html_source_readability_terpri(UNPROVIDED);
		    }
		}
	    }
	    return NIL;
	}
    }

    public static final SubLObject tm_rename_thesaurus(SubLObject args) {
	if (args == UNPROVIDED) {
	    args = NIL;
	}
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    {
		SubLObject color_value = tm_datastructures.$tm_bg_color_default$.getDynamicValue(thread);
		html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
		html_utilities.html_markup(html_macros.$html_head_head$.getGlobalValue());
		html_macros.html_head_content_type();
		html_utilities.html_source_readability_terpri(UNPROVIDED);
		html_utilities.html_markup(html_macros.$html_title_head$.getGlobalValue());
		html_utilities.html_princ($$$Rename_Thesaurus);
		html_utilities.html_markup(html_macros.$html_title_tail$.getGlobalValue());
		html_utilities.html_markup(html_macros.$html_head_tail$.getGlobalValue());
		html_utilities.html_source_readability_terpri(UNPROVIDED);
		{
		    SubLObject _prev_bind_0 = html_macros.$html_inside_bodyP$.currentBinding(thread);
		    try {
			html_macros.$html_inside_bodyP$.bind(T, thread);
			html_utilities.html_markup(html_macros.$html_body_head$.getGlobalValue());
			if (NIL != color_value) {
			    html_utilities.html_markup(html_macros.$html_body_bgcolor$.getGlobalValue());
			    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
			    html_utilities.html_markup(html_utilities.html_color(color_value));
			    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
			}
			html_utilities.html_char(CHAR_greater, UNPROVIDED);
			{
			    SubLObject _prev_bind_0_265 = html_macros.$html_safe_print$.currentBinding(thread);
			    try {
				html_macros.$html_safe_print$.bind(T, thread);
				html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
				html_utilities.html_markup(ONE_INTEGER);
				html_utilities.html_char(CHAR_greater, UNPROVIDED);
				if ((NIL != tm_control_vars.$client_thes_home_page$.getDynamicValue(thread)) && (NIL != tm_control_vars.$client_mini_logo$.getDynamicValue(thread))) {
				    html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
				    html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
				    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
				    html_utilities.html_markup(tm_control_vars.$client_thes_home_page$.getDynamicValue(thread));
				    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
				    html_utilities.html_char(CHAR_greater, UNPROVIDED);
				    {
					SubLObject _prev_bind_0_266 = html_macros.$html_safe_print$.currentBinding(thread);
					try {
					    html_macros.$html_safe_print$.bind(T, thread);
					    html_utilities.html_markup(html_macros.$html_image_head$.getGlobalValue());
					    html_utilities.html_markup(html_macros.$html_image_src$.getGlobalValue());
					    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
					    html_utilities.html_markup(tm_control_vars.$client_mini_logo$.getDynamicValue(thread));
					    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
					    if (NIL != tm_control_vars.$client_name$.getDynamicValue(thread)) {
						html_utilities.html_markup(html_macros.$html_image_alt$.getGlobalValue());
						html_utilities.html_char(CHAR_quotation, UNPROVIDED);
						html_utilities.html_markup(tm_control_vars.$client_name$.getDynamicValue(thread));
						html_utilities.html_char(CHAR_quotation, UNPROVIDED);
					    }
					    if (true) {
						html_utilities.html_markup(html_macros.$html_image_border$.getGlobalValue());
						html_utilities.html_char(CHAR_quotation, UNPROVIDED);
						html_utilities.html_markup(ZERO_INTEGER);
						html_utilities.html_char(CHAR_quotation, UNPROVIDED);
					    }
					    html_utilities.html_char(CHAR_greater, UNPROVIDED);
					    {
						SubLObject _prev_bind_0_267 = html_macros.$html_safe_print$.currentBinding(thread);
						try {
						    html_macros.$html_safe_print$.bind(T, thread);
						} finally {
						    html_macros.$html_safe_print$.rebind(_prev_bind_0_267, thread);
						}
					    }
					    html_utilities.html_markup(html_macros.$html_image_tail$.getGlobalValue());
					} finally {
					    html_macros.$html_safe_print$.rebind(_prev_bind_0_266, thread);
					}
				    }
				    html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
				}
				html_utilities.html_princ($$$Rename_Thesaurus);
				html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
				html_utilities.html_markup(ONE_INTEGER);
				html_utilities.html_char(CHAR_greater, UNPROVIDED);
				tm_logging.tm_enqueue_event($$$Rename_Thesaurus);
				if (!(true && (NIL != tm_internals.privelegedP(tm_datastructures.$tm_user$.getDynamicValue(thread), $str_alt185$full_editor)))) {
				    html_utilities.html_princ($str_alt186$Sorry__you_do_not_have_permission);
				} else {
				    html_thesaurus.thesaurus_heading($str_alt482$tm_rename_thesaurus);
				    if (NIL != tm_internals.editing_allowedP()) {
					html_utilities.html_markup(html_macros.$html_form_head$.getGlobalValue());
					html_utilities.html_markup(html_macros.$html_form_action$.getGlobalValue());
					html_utilities.html_char(CHAR_quotation, UNPROVIDED);
					html_utilities.html_markup(system_parameters.$cyc_cgi_program$.getDynamicValue(thread));
					html_utilities.html_char(CHAR_quotation, UNPROVIDED);
					if (NIL != html_macros.$html_form_method_post$.getGlobalValue()) {
					    html_utilities.html_markup(html_macros.$html_form_method$.getGlobalValue());
					    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
					    html_utilities.html_markup(html_macros.$html_form_method_post$.getGlobalValue());
					    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
					}
					html_utilities.html_char(CHAR_greater, UNPROVIDED);
					{
					    SubLObject _prev_bind_0_268 = html_macros.$html_safe_print$.currentBinding(thread);
					    SubLObject _prev_bind_1 = html_macros.$within_html_form$.currentBinding(thread);
					    SubLObject _prev_bind_2 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
					    try {
						html_macros.$html_safe_print$.bind(T, thread);
						html_macros.$within_html_form$.bind(T, thread);
						html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
						html_utilities.html_hidden_input($str_alt483$tm_handle_rename_thesaurus, T, UNPROVIDED);
						html_utilities.html_markup(html_macros.$html_table_head$.getGlobalValue());
						if (true) {
						    html_utilities.html_markup(html_macros.$html_table_border$.getGlobalValue());
						    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
						    html_utilities.html_markup(ZERO_INTEGER);
						    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
						}
						html_utilities.html_char(CHAR_greater, UNPROVIDED);
						{
						    SubLObject _prev_bind_0_269 = html_macros.$html_safe_print$.currentBinding(thread);
						    try {
							html_macros.$html_safe_print$.bind(T, thread);
							html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
							html_utilities.html_char(CHAR_greater, UNPROVIDED);
							{
							    SubLObject _prev_bind_0_270 = html_macros.$html_safe_print$.currentBinding(thread);
							    try {
								html_macros.$html_safe_print$.bind(T, thread);
								html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
								if (true) {
								    html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
								    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
								    html_utilities.html_markup(html_utilities.html_align($TOP));
								    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
								}
								html_utilities.html_char(CHAR_greater, UNPROVIDED);
								{
								    SubLObject _prev_bind_0_271 = html_macros.$html_safe_print$.currentBinding(thread);
								    try {
									html_macros.$html_safe_print$.bind(T, thread);
									html_utilities.html_princ($str_alt484$Select_Thesaurus_to_Rename__);
								    } finally {
									html_macros.$html_safe_print$.rebind(_prev_bind_0_271, thread);
								    }
								}
								html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
								html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
								if (true) {
								    html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
								    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
								    html_utilities.html_markup(html_utilities.html_align($TOP));
								    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
								}
								html_utilities.html_char(CHAR_greater, UNPROVIDED);
								{
								    SubLObject _prev_bind_0_272 = html_macros.$html_safe_print$.currentBinding(thread);
								    try {
									html_macros.$html_safe_print$.bind(T, thread);
									html_thesaurus.tm_edit_thesaurus_selection(NIL, NIL, $$$thesaurus, T);
								    } finally {
									html_macros.$html_safe_print$.rebind(_prev_bind_0_272, thread);
								    }
								}
								html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
							    } finally {
								html_macros.$html_safe_print$.rebind(_prev_bind_0_270, thread);
							    }
							}
							html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
							html_utilities.html_source_readability_terpri(UNPROVIDED);
							html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
							html_utilities.html_char(CHAR_greater, UNPROVIDED);
							{
							    SubLObject _prev_bind_0_273 = html_macros.$html_safe_print$.currentBinding(thread);
							    try {
								html_macros.$html_safe_print$.bind(T, thread);
								html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
								if (true) {
								    html_utilities.html_markup(html_macros.$html_table_data_colspan$.getGlobalValue());
								    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
								    html_utilities.html_markup(TWO_INTEGER);
								    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
								}
								html_utilities.html_char(CHAR_greater, UNPROVIDED);
								{
								    SubLObject _prev_bind_0_274 = html_macros.$html_safe_print$.currentBinding(thread);
								    try {
									html_macros.$html_safe_print$.bind(T, thread);
									html_utilities.html_princ($str_alt485$Enter_a_new_name__or_a_new_abbrev);
								    } finally {
									html_macros.$html_safe_print$.rebind(_prev_bind_0_274, thread);
								    }
								}
								html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
							    } finally {
								html_macros.$html_safe_print$.rebind(_prev_bind_0_273, thread);
							    }
							}
							html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
							html_utilities.html_source_readability_terpri(UNPROVIDED);
							html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
							html_utilities.html_char(CHAR_greater, UNPROVIDED);
							{
							    SubLObject _prev_bind_0_275 = html_macros.$html_safe_print$.currentBinding(thread);
							    try {
								html_macros.$html_safe_print$.bind(T, thread);
								html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
								html_utilities.html_char(CHAR_greater, UNPROVIDED);
								{
								    SubLObject _prev_bind_0_276 = html_macros.$html_safe_print$.currentBinding(thread);
								    try {
									html_macros.$html_safe_print$.bind(T, thread);
									html_utilities.html_princ($str_alt453$Enter_New_Name__);
								    } finally {
									html_macros.$html_safe_print$.rebind(_prev_bind_0_276, thread);
								    }
								}
								html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
								html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
								html_utilities.html_char(CHAR_greater, UNPROVIDED);
								{
								    SubLObject _prev_bind_0_277 = html_macros.$html_safe_print$.currentBinding(thread);
								    try {
									html_macros.$html_safe_print$.bind(T, thread);
									html_utilities.html_text_input($str_alt486$new_name, $str_alt2$, TWENTY_INTEGER);
								    } finally {
									html_macros.$html_safe_print$.rebind(_prev_bind_0_277, thread);
								    }
								}
								html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
							    } finally {
								html_macros.$html_safe_print$.rebind(_prev_bind_0_275, thread);
							    }
							}
							html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
							html_utilities.html_source_readability_terpri(UNPROVIDED);
							html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
							html_utilities.html_char(CHAR_greater, UNPROVIDED);
							{
							    SubLObject _prev_bind_0_278 = html_macros.$html_safe_print$.currentBinding(thread);
							    try {
								html_macros.$html_safe_print$.bind(T, thread);
								html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
								html_utilities.html_char(CHAR_greater, UNPROVIDED);
								{
								    SubLObject _prev_bind_0_279 = html_macros.$html_safe_print$.currentBinding(thread);
								    try {
									html_macros.$html_safe_print$.bind(T, thread);
									html_utilities.html_princ($str_alt487$Enter_New_Abbreviation__);
								    } finally {
									html_macros.$html_safe_print$.rebind(_prev_bind_0_279, thread);
								    }
								}
								html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
								html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
								html_utilities.html_char(CHAR_greater, UNPROVIDED);
								{
								    SubLObject _prev_bind_0_280 = html_macros.$html_safe_print$.currentBinding(thread);
								    try {
									html_macros.$html_safe_print$.bind(T, thread);
									html_utilities.html_text_input($str_alt488$new_abbrev, $str_alt2$, TWENTY_INTEGER);
								    } finally {
									html_macros.$html_safe_print$.rebind(_prev_bind_0_280, thread);
								    }
								}
								html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
							    } finally {
								html_macros.$html_safe_print$.rebind(_prev_bind_0_278, thread);
							    }
							}
							html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
							html_utilities.html_source_readability_terpri(UNPROVIDED);
						    } finally {
							html_macros.$html_safe_print$.rebind(_prev_bind_0_269, thread);
						    }
						}
						html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
						html_utilities.html_submit_input($$$Rename, UNPROVIDED, UNPROVIDED);
						html_utilities.html_reset_input(UNPROVIDED);
						html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
					    } finally {
						html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_2, thread);
						html_macros.$within_html_form$.rebind(_prev_bind_1, thread);
						html_macros.$html_safe_print$.rebind(_prev_bind_0_268, thread);
					    }
					}
					html_utilities.html_markup(html_macros.$html_form_tail$.getGlobalValue());
				    } else {
					html_thesaurus.tm_report_editing_disabled();
				    }
				}
				html_thesaurus.tm_footer();
				html_utilities.html_source_readability_terpri(UNPROVIDED);
			    } finally {
				html_macros.$html_safe_print$.rebind(_prev_bind_0_265, thread);
			    }
			}
			html_utilities.html_markup(html_macros.$html_body_tail$.getGlobalValue());
			html_utilities.html_source_readability_terpri(UNPROVIDED);
		    } finally {
			html_macros.$html_inside_bodyP$.rebind(_prev_bind_0, thread);
		    }
		}
		html_utilities.html_markup(html_macros.$html_html_tail$.getGlobalValue());
		html_utilities.html_source_readability_terpri(UNPROVIDED);
	    }
	    return NIL;
	}
    }

    public static final SubLObject tm_handle_rename_thesaurus(SubLObject args) {
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    {
		SubLObject thesaurus_name = html_utilities.html_extract_input($$$thesaurus, args);
		SubLObject thesaurus_constant = tm_internals.thesaurus_constant_from_name(thesaurus_name);
		SubLObject new_name = html_utilities.html_extract_input($str_alt486$new_name, args);
		SubLObject new_abbrev = html_utilities.html_extract_input($str_alt488$new_abbrev, args);
		SubLObject ops = NIL;
		if (new_name.isString() && length(new_name).numG(ZERO_INTEGER)) {
		    new_name = string_utilities.trim_whitespace(new_name);
		} else {
		    new_name = NIL;
		}
		if (new_abbrev.isString() && length(new_abbrev).numG(ZERO_INTEGER)) {
		    new_abbrev = string_utilities.trim_whitespace(Strings.string_upcase(new_abbrev, UNPROVIDED, UNPROVIDED));
		} else {
		    new_abbrev = NIL;
		}
		if (NIL == thesaurus_name) {
		    return html_thesaurus.tm_error($str_alt490$Rename_Thesaurus__No_thesaurus_wa, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
		}
		if (!((NIL != new_name) || (NIL != new_abbrev))) {
		    return html_thesaurus.tm_error($str_alt491$Rename_Thesaurus__You_must_give_e, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
		}
		if (NIL != new_name) {
		    if (NIL == tm_internals.valid_thesaurus_nameP(new_name)) {
			return html_thesaurus.tm_error($str_alt492$_S_is_not_a_valid_thesaurus_name_, new_name, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
		    }
		}
		if (NIL != new_abbrev) {
		    if (NIL == tm_internals.valid_abbreviationP(new_abbrev)) {
			return html_thesaurus.tm_error($str_alt493$_S_is_not_a_valid_abbreviation_, new_abbrev, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
		    }
		}
		if (NIL == thesaurus_constant) {
		    return html_thesaurus.tm_error($str_alt494$Implementation_Error__No_thesauru, thesaurus_name, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
		}
		if ((NIL != new_name) && (!new_name.equal(thesaurus_name))) {
		    {
			SubLObject op = tm_datastructures.get_tm_op();
			SubLObject op_281 = op;
			tm_datastructures._csetf_tm_op_opcode(op_281, $REPLACE);
			tm_datastructures._csetf_tm_op_relation(op_281, tm_datastructures.$tm_name_pred$.getGlobalValue());
			tm_datastructures._csetf_tm_op_inverseP(op_281, NIL);
			tm_datastructures._csetf_tm_op_args(op_281, list(thesaurus_constant, thesaurus_name, new_name));
			tm_datastructures._csetf_tm_op_thesaurus(op_281, tm_datastructures.$tm_mt$.getGlobalValue());
			tm_datastructures._csetf_tm_op_status(op_281, NIL);
			tm_datastructures._csetf_tm_op_verifyP(op_281, NIL);
			tm_datastructures._csetf_tm_op_hiddenP(op_281, NIL);
			tm_datastructures._csetf_tm_op_description(op_281, NIL);
			tm_datastructures._csetf_tm_op_description_args(op_281, NIL);
			if (NIL.isString()) {
			    set_op_english(op_281, NIL);
			} else {
			    set_op_english(op_281, UNPROVIDED);
			}
			ops = cons(op, ops);
		    }
		}
		if (NIL != new_abbrev) {
		    {
			SubLObject op = tm_datastructures.get_tm_op();
			SubLObject thesaurus_abbrev = tm_internals.tm_string_for_constant(thesaurus_constant, T, UNPROVIDED, UNPROVIDED);
			if (!thesaurus_abbrev.equal(new_abbrev)) {
			    {
				SubLObject op_282 = op;
				tm_datastructures._csetf_tm_op_opcode(op_282, $REPLACE);
				tm_datastructures._csetf_tm_op_relation(op_282, $$tmSymbol);
				tm_datastructures._csetf_tm_op_inverseP(op_282, NIL);
				tm_datastructures._csetf_tm_op_args(op_282, list(thesaurus_constant, thesaurus_abbrev, new_abbrev));
				tm_datastructures._csetf_tm_op_thesaurus(op_282, tm_datastructures.$tm_mt$.getGlobalValue());
				tm_datastructures._csetf_tm_op_status(op_282, NIL);
				tm_datastructures._csetf_tm_op_verifyP(op_282, NIL);
				tm_datastructures._csetf_tm_op_hiddenP(op_282, NIL);
				tm_datastructures._csetf_tm_op_description(op_282, NIL);
				tm_datastructures._csetf_tm_op_description_args(op_282, NIL);
				if (NIL.isString()) {
				    set_op_english(op_282, NIL);
				} else {
				    set_op_english(op_282, UNPROVIDED);
				}
			    }
			    ops = cons(op, ops);
			}
		    }
		}
		ops = nreverse(ops);
		thread.resetMultipleValues();
		{
		    SubLObject bad = tm_internals.check_operations(ops);
		    SubLObject good = thread.secondMultipleValue();
		    SubLObject verifyP = thread.thirdMultipleValue();
		    thread.resetMultipleValues();
		    if (NIL == good) {
			html_show_bad_ops_page(bad);
		    } else {
			do_good_ops_results(bad, good, symbol_function(TM_THESAURUS_INFO_SECTION), list(thesaurus_constant), $$$Rename_Thesaurus, UNPROVIDED);
		    }
		}
	    }
	    return NIL;
	}
    }

    public static final SubLObject tm_delete_thesaurus(SubLObject args) {
	if (args == UNPROVIDED) {
	    args = NIL;
	}
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    {
		SubLObject color_value = tm_datastructures.$tm_bg_color_default$.getDynamicValue(thread);
		html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
		html_utilities.html_markup(html_macros.$html_head_head$.getGlobalValue());
		html_macros.html_head_content_type();
		html_utilities.html_source_readability_terpri(UNPROVIDED);
		html_utilities.html_markup(html_macros.$html_title_head$.getGlobalValue());
		html_utilities.html_princ($$$Delete_Thesaurus);
		html_utilities.html_markup(html_macros.$html_title_tail$.getGlobalValue());
		html_utilities.html_markup(html_macros.$html_head_tail$.getGlobalValue());
		html_utilities.html_source_readability_terpri(UNPROVIDED);
		{
		    SubLObject _prev_bind_0 = html_macros.$html_inside_bodyP$.currentBinding(thread);
		    try {
			html_macros.$html_inside_bodyP$.bind(T, thread);
			html_utilities.html_markup(html_macros.$html_body_head$.getGlobalValue());
			if (NIL != color_value) {
			    html_utilities.html_markup(html_macros.$html_body_bgcolor$.getGlobalValue());
			    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
			    html_utilities.html_markup(html_utilities.html_color(color_value));
			    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
			}
			html_utilities.html_char(CHAR_greater, UNPROVIDED);
			{
			    SubLObject _prev_bind_0_283 = html_macros.$html_safe_print$.currentBinding(thread);
			    try {
				html_macros.$html_safe_print$.bind(T, thread);
				html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
				html_utilities.html_markup(ONE_INTEGER);
				html_utilities.html_char(CHAR_greater, UNPROVIDED);
				if ((NIL != tm_control_vars.$client_thes_home_page$.getDynamicValue(thread)) && (NIL != tm_control_vars.$client_mini_logo$.getDynamicValue(thread))) {
				    html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
				    html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
				    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
				    html_utilities.html_markup(tm_control_vars.$client_thes_home_page$.getDynamicValue(thread));
				    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
				    html_utilities.html_char(CHAR_greater, UNPROVIDED);
				    {
					SubLObject _prev_bind_0_284 = html_macros.$html_safe_print$.currentBinding(thread);
					try {
					    html_macros.$html_safe_print$.bind(T, thread);
					    html_utilities.html_markup(html_macros.$html_image_head$.getGlobalValue());
					    html_utilities.html_markup(html_macros.$html_image_src$.getGlobalValue());
					    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
					    html_utilities.html_markup(tm_control_vars.$client_mini_logo$.getDynamicValue(thread));
					    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
					    if (NIL != tm_control_vars.$client_name$.getDynamicValue(thread)) {
						html_utilities.html_markup(html_macros.$html_image_alt$.getGlobalValue());
						html_utilities.html_char(CHAR_quotation, UNPROVIDED);
						html_utilities.html_markup(tm_control_vars.$client_name$.getDynamicValue(thread));
						html_utilities.html_char(CHAR_quotation, UNPROVIDED);
					    }
					    if (true) {
						html_utilities.html_markup(html_macros.$html_image_border$.getGlobalValue());
						html_utilities.html_char(CHAR_quotation, UNPROVIDED);
						html_utilities.html_markup(ZERO_INTEGER);
						html_utilities.html_char(CHAR_quotation, UNPROVIDED);
					    }
					    html_utilities.html_char(CHAR_greater, UNPROVIDED);
					    {
						SubLObject _prev_bind_0_285 = html_macros.$html_safe_print$.currentBinding(thread);
						try {
						    html_macros.$html_safe_print$.bind(T, thread);
						} finally {
						    html_macros.$html_safe_print$.rebind(_prev_bind_0_285, thread);
						}
					    }
					    html_utilities.html_markup(html_macros.$html_image_tail$.getGlobalValue());
					} finally {
					    html_macros.$html_safe_print$.rebind(_prev_bind_0_284, thread);
					}
				    }
				    html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
				}
				html_utilities.html_princ($$$Delete_Thesaurus);
				html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
				html_utilities.html_markup(ONE_INTEGER);
				html_utilities.html_char(CHAR_greater, UNPROVIDED);
				tm_logging.tm_enqueue_event($$$Delete_Thesaurus);
				if (!(true && (NIL != tm_internals.privelegedP(tm_datastructures.$tm_user$.getDynamicValue(thread), $str_alt185$full_editor)))) {
				    html_utilities.html_princ($str_alt186$Sorry__you_do_not_have_permission);
				} else {
				    html_thesaurus.thesaurus_heading($str_alt498$tm_delete_thesaurus);
				    if (NIL != tm_internals.editing_allowedP()) {
					html_utilities.html_markup(html_macros.$html_form_head$.getGlobalValue());
					html_utilities.html_markup(html_macros.$html_form_action$.getGlobalValue());
					html_utilities.html_char(CHAR_quotation, UNPROVIDED);
					html_utilities.html_markup(system_parameters.$cyc_cgi_program$.getDynamicValue(thread));
					html_utilities.html_char(CHAR_quotation, UNPROVIDED);
					if (NIL != html_macros.$html_form_method_post$.getGlobalValue()) {
					    html_utilities.html_markup(html_macros.$html_form_method$.getGlobalValue());
					    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
					    html_utilities.html_markup(html_macros.$html_form_method_post$.getGlobalValue());
					    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
					}
					html_utilities.html_char(CHAR_greater, UNPROVIDED);
					{
					    SubLObject _prev_bind_0_286 = html_macros.$html_safe_print$.currentBinding(thread);
					    SubLObject _prev_bind_1 = html_macros.$within_html_form$.currentBinding(thread);
					    SubLObject _prev_bind_2 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
					    try {
						html_macros.$html_safe_print$.bind(T, thread);
						html_macros.$within_html_form$.bind(T, thread);
						html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
						html_utilities.html_hidden_input($str_alt499$tm_handle_delete_thesaurus, T, UNPROVIDED);
						html_utilities.html_princ($str_alt500$Choose_a_Thesaurus_to_Delete_);
						html_utilities.html_br();
						html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
						html_utilities.html_princ($str_alt501$Warning__All_data_in_this_thesaur);
						html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
						html_utilities.html_br();
						html_thesaurus.tm_edit_thesaurus_selection(NIL, NIL, $$$thesaurus, T);
						html_utilities.html_br();
						html_utilities.html_submit_input($$$Delete, UNPROVIDED, UNPROVIDED);
						html_utilities.html_reset_input(UNPROVIDED);
						html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
					    } finally {
						html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_2, thread);
						html_macros.$within_html_form$.rebind(_prev_bind_1, thread);
						html_macros.$html_safe_print$.rebind(_prev_bind_0_286, thread);
					    }
					}
					html_utilities.html_markup(html_macros.$html_form_tail$.getGlobalValue());
				    } else {
					html_thesaurus.tm_report_editing_disabled();
				    }
				}
				html_thesaurus.tm_footer();
				html_utilities.html_source_readability_terpri(UNPROVIDED);
			    } finally {
				html_macros.$html_safe_print$.rebind(_prev_bind_0_283, thread);
			    }
			}
			html_utilities.html_markup(html_macros.$html_body_tail$.getGlobalValue());
			html_utilities.html_source_readability_terpri(UNPROVIDED);
		    } finally {
			html_macros.$html_inside_bodyP$.rebind(_prev_bind_0, thread);
		    }
		}
		html_utilities.html_markup(html_macros.$html_html_tail$.getGlobalValue());
		html_utilities.html_source_readability_terpri(UNPROVIDED);
	    }
	    return NIL;
	}
    }

    public static final SubLObject tm_handle_delete_thesaurus(SubLObject args) {
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    {
		SubLObject thesaurus_name = html_utilities.html_extract_input($$$thesaurus, args);
		SubLObject thesaurus_constant = tm_internals.thesaurus_constant_from_name(thesaurus_name);
		if (NIL == tm_internals.thesaurusP(thesaurus_constant)) {
		    return html_thesaurus.tm_error($str_alt503$_A_is_not_a_known_thesaurus_, thesaurus_name, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
		}
		if (NIL != tm_thinking.tm_any_thinking_task_for_thesaurus(thesaurus_constant)) {
		    return html_thesaurus.tm_error($str_alt504$Sorry___A_is_currently_involved_i, tm_internals.thesaurus_name(thesaurus_constant), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
		}
		{
		    SubLObject color_value = tm_datastructures.$tm_bg_color_default$.getDynamicValue(thread);
		    html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
		    html_utilities.html_markup(html_macros.$html_head_head$.getGlobalValue());
		    html_macros.html_head_content_type();
		    html_utilities.html_source_readability_terpri(UNPROVIDED);
		    html_utilities.html_markup(html_macros.$html_title_head$.getGlobalValue());
		    html_utilities.html_princ(format(NIL, $str_alt505$Confirm__Delete__a_, thesaurus_name));
		    html_utilities.html_markup(html_macros.$html_title_tail$.getGlobalValue());
		    html_utilities.html_markup(html_macros.$html_head_tail$.getGlobalValue());
		    html_utilities.html_source_readability_terpri(UNPROVIDED);
		    {
			SubLObject _prev_bind_0 = html_macros.$html_inside_bodyP$.currentBinding(thread);
			try {
			    html_macros.$html_inside_bodyP$.bind(T, thread);
			    html_utilities.html_markup(html_macros.$html_body_head$.getGlobalValue());
			    if (NIL != color_value) {
				html_utilities.html_markup(html_macros.$html_body_bgcolor$.getGlobalValue());
				html_utilities.html_char(CHAR_quotation, UNPROVIDED);
				html_utilities.html_markup(html_utilities.html_color(color_value));
				html_utilities.html_char(CHAR_quotation, UNPROVIDED);
			    }
			    html_utilities.html_char(CHAR_greater, UNPROVIDED);
			    {
				SubLObject _prev_bind_0_287 = html_macros.$html_safe_print$.currentBinding(thread);
				try {
				    html_macros.$html_safe_print$.bind(T, thread);
				    html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
				    html_utilities.html_markup(ONE_INTEGER);
				    html_utilities.html_char(CHAR_greater, UNPROVIDED);
				    if ((NIL != tm_control_vars.$client_thes_home_page$.getDynamicValue(thread)) && (NIL != tm_control_vars.$client_mini_logo$.getDynamicValue(thread))) {
					html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
					html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
					html_utilities.html_char(CHAR_quotation, UNPROVIDED);
					html_utilities.html_markup(tm_control_vars.$client_thes_home_page$.getDynamicValue(thread));
					html_utilities.html_char(CHAR_quotation, UNPROVIDED);
					html_utilities.html_char(CHAR_greater, UNPROVIDED);
					{
					    SubLObject _prev_bind_0_288 = html_macros.$html_safe_print$.currentBinding(thread);
					    try {
						html_macros.$html_safe_print$.bind(T, thread);
						html_utilities.html_markup(html_macros.$html_image_head$.getGlobalValue());
						html_utilities.html_markup(html_macros.$html_image_src$.getGlobalValue());
						html_utilities.html_char(CHAR_quotation, UNPROVIDED);
						html_utilities.html_markup(tm_control_vars.$client_mini_logo$.getDynamicValue(thread));
						html_utilities.html_char(CHAR_quotation, UNPROVIDED);
						if (NIL != tm_control_vars.$client_name$.getDynamicValue(thread)) {
						    html_utilities.html_markup(html_macros.$html_image_alt$.getGlobalValue());
						    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
						    html_utilities.html_markup(tm_control_vars.$client_name$.getDynamicValue(thread));
						    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
						}
						if (true) {
						    html_utilities.html_markup(html_macros.$html_image_border$.getGlobalValue());
						    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
						    html_utilities.html_markup(ZERO_INTEGER);
						    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
						}
						html_utilities.html_char(CHAR_greater, UNPROVIDED);
						{
						    SubLObject _prev_bind_0_289 = html_macros.$html_safe_print$.currentBinding(thread);
						    try {
							html_macros.$html_safe_print$.bind(T, thread);
						    } finally {
							html_macros.$html_safe_print$.rebind(_prev_bind_0_289, thread);
						    }
						}
						html_utilities.html_markup(html_macros.$html_image_tail$.getGlobalValue());
					    } finally {
						html_macros.$html_safe_print$.rebind(_prev_bind_0_288, thread);
					    }
					}
					html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
				    }
				    html_utilities.html_princ(format(NIL, $str_alt505$Confirm__Delete__a_, thesaurus_name));
				    html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
				    html_utilities.html_markup(ONE_INTEGER);
				    html_utilities.html_char(CHAR_greater, UNPROVIDED);
				    tm_logging.tm_enqueue_event(format(NIL, $str_alt505$Confirm__Delete__a_, thesaurus_name));
				    if (!(true && (NIL != tm_internals.privelegedP(tm_datastructures.$tm_user$.getDynamicValue(thread), $str_alt185$full_editor)))) {
					html_utilities.html_princ($str_alt186$Sorry__you_do_not_have_permission);
				    } else {
					html_thesaurus.thesaurus_heading($str_alt499$tm_handle_delete_thesaurus);
					html_utilities.html_hr(UNPROVIDED, UNPROVIDED);
					format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt506$Do_you_really_want_to_delete__a_, thesaurus_name);
					html_utilities.html_br();
					format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt507$If_so__all_data_in__a_will_be_los, thesaurus_name);
					html_utilities.html_br();
					html_utilities.html_princ($str_alt508$Proceed_);
					html_utilities.html_br();
					html_utilities.html_markup(html_macros.$html_form_head$.getGlobalValue());
					html_utilities.html_markup(html_macros.$html_form_action$.getGlobalValue());
					html_utilities.html_char(CHAR_quotation, UNPROVIDED);
					html_utilities.html_markup(system_parameters.$cyc_cgi_program$.getDynamicValue(thread));
					html_utilities.html_char(CHAR_quotation, UNPROVIDED);
					if (NIL != html_macros.$html_form_method_post$.getGlobalValue()) {
					    html_utilities.html_markup(html_macros.$html_form_method$.getGlobalValue());
					    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
					    html_utilities.html_markup(html_macros.$html_form_method_post$.getGlobalValue());
					    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
					}
					html_utilities.html_char(CHAR_greater, UNPROVIDED);
					{
					    SubLObject _prev_bind_0_290 = html_macros.$html_safe_print$.currentBinding(thread);
					    SubLObject _prev_bind_1 = html_macros.$within_html_form$.currentBinding(thread);
					    SubLObject _prev_bind_2 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
					    try {
						html_macros.$html_safe_print$.bind(T, thread);
						html_macros.$within_html_form$.bind(T, thread);
						html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
						html_utilities.html_hidden_input($str_alt509$tm_really_handle_delete_thesaurus, T, UNPROVIDED);
						html_utilities.html_hidden_input($$$thesaurus, thesaurus_name, UNPROVIDED);
						html_utilities.html_submit_input($$$OK, UNPROVIDED, UNPROVIDED);
						html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
					    } finally {
						html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_2, thread);
						html_macros.$within_html_form$.rebind(_prev_bind_1, thread);
						html_macros.$html_safe_print$.rebind(_prev_bind_0_290, thread);
					    }
					}
					html_utilities.html_markup(html_macros.$html_form_tail$.getGlobalValue());
				    }
				    html_thesaurus.tm_footer();
				    html_utilities.html_source_readability_terpri(UNPROVIDED);
				} finally {
				    html_macros.$html_safe_print$.rebind(_prev_bind_0_287, thread);
				}
			    }
			    html_utilities.html_markup(html_macros.$html_body_tail$.getGlobalValue());
			    html_utilities.html_source_readability_terpri(UNPROVIDED);
			} finally {
			    html_macros.$html_inside_bodyP$.rebind(_prev_bind_0, thread);
			}
		    }
		    html_utilities.html_markup(html_macros.$html_html_tail$.getGlobalValue());
		    html_utilities.html_source_readability_terpri(UNPROVIDED);
		}
	    }
	    return NIL;
	}
    }

    public static final SubLObject tm_really_handle_delete_thesaurus(SubLObject args) {
	{
	    SubLObject thesaurus_name = html_utilities.html_extract_input($$$thesaurus, args);
	    SubLObject thesaurus_constant = tm_internals.thesaurus_constant_from_name(thesaurus_name);
	    if (NIL == tm_internals.thesaurusP(thesaurus_constant)) {
		return html_thesaurus.tm_error($str_alt503$_A_is_not_a_known_thesaurus_, thesaurus_name, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
	    }
	    {
		SubLObject successP = NIL;
		successP = tm_datastructures.tm_start_write_operation(thesaurus_constant);
		if (NIL != successP) {
		    try {
			tm_datastructures.clear_thesaurus_from_tm_state(thesaurus_constant);
			tm_internals.do_delete_thesaurus(thesaurus_constant);
			tm_logging.tm_enqueue_op_for_log(format(NIL, $str_alt512$Delete_thesaurus__a, thesaurus_name), $OK, NIL, bq_cons(cb_utilities.cb_fort_identifier(thesaurus_constant), $list_alt513));
			html_thesaurus.tm_note_edit_change(format(NIL, $str_alt514$Delete__A_Thesaurus, thesaurus_name));
		    } finally {
			{
			    SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
			    try {
				bind($is_thread_performing_cleanupP$, T);
				tm_datastructures.tm_finish_write_operation(thesaurus_constant);
			    } finally {
				rebind($is_thread_performing_cleanupP$, _prev_bind_0);
			    }
			}
		    }
		} else {
		    {
			SubLObject message = cconcatenate($str_alt515$Deletion_of_thesaurus_, new SubLObject[] { thesaurus_name, $str_alt516$_is_not_permitted_at_this_time__b });
			html_thesaurus.tm_message_to_user($$$Deletion_Not_Performed, message);
		    }
		}
	    }
	}
	return NIL;
    }

    public static final SubLObject tm_copy_thesaurus_in_thinker(SubLObject source_thesaurus, SubLObject target_thesaurus, SubLObject target_concept, SubLObject start_concepts, SubLObject cutoff_concepts, SubLObject num_levels, SubLObject skipped_facts_log) {
	if (skipped_facts_log == UNPROVIDED) {
	    skipped_facts_log = NIL;
	}
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    {
		SubLObject thinking = tm_thinking.tm_new_thinking(tm_datastructures.$tm_user$.getDynamicValue(thread), $COPY_THESAURUS);
		SubLObject thread_291 = tm_thinking.tm_thinking_start(thinking, TM_COPY_THESAURUS_SUBSET_WRAPPER, list(source_thesaurus, target_thesaurus, target_concept, start_concepts, cutoff_concepts, num_levels, skipped_facts_log));
		return thread_291;
	    }
	}
    }

    public static final SubLObject tm_copy_thesaurus_subset_wrapper(SubLObject source_thesaurus, SubLObject target_thesaurus, SubLObject target_concept, SubLObject start_concepts, SubLObject cutoff_concepts, SubLObject num_levels, SubLObject skipped_facts_log) {
	if (skipped_facts_log == UNPROVIDED) {
	    skipped_facts_log = NIL;
	}
	{
	    SubLObject success = NIL;
	    try {
		tm_io.tm_copy_thesaurus_subset(source_thesaurus, target_thesaurus, target_concept, start_concepts, cutoff_concepts, num_levels, skipped_facts_log);
		success = T;
		tm_logging.tm_enqueue_op_for_log(format(NIL, $str_alt521$Copy_thesaurus__a_to_thesaurus__a, tm_internals.thesaurus_name(source_thesaurus), tm_internals.thesaurus_name(target_thesaurus)), $OK, NIL,
			listS(cb_utilities.cb_fort_identifier(source_thesaurus), cb_utilities.cb_fort_identifier(target_thesaurus), $list_alt513));
	    } finally {
		{
		    SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
		    try {
			bind($is_thread_performing_cleanupP$, T);
			tm_datastructures.tm_finish_write_operation(target_thesaurus);
			tm_datastructures.tm_finish_read_operation(source_thesaurus);
		    } finally {
			rebind($is_thread_performing_cleanupP$, _prev_bind_0);
		    }
		}
	    }
	    if (NIL != success) {
		return $$$SUCCESS;
	    } else {
		return $$$INCOMPLETE;
	    }
	}
    }

    /**
     * Produce a page for specifying copy-thesaurus content.
     */
    public static final SubLObject tm_copy_thesaurus(SubLObject args) {
	if (args == UNPROVIDED) {
	    args = NIL;
	}
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    {
		SubLObject color_value = tm_datastructures.$tm_bg_color_default$.getDynamicValue(thread);
		html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
		html_utilities.html_markup(html_macros.$html_head_head$.getGlobalValue());
		html_macros.html_head_content_type();
		html_utilities.html_source_readability_terpri(UNPROVIDED);
		html_utilities.html_markup(html_macros.$html_title_head$.getGlobalValue());
		html_utilities.html_princ($$$Copy_Thesaurus);
		html_utilities.html_markup(html_macros.$html_title_tail$.getGlobalValue());
		html_utilities.html_markup(html_macros.$html_head_tail$.getGlobalValue());
		html_utilities.html_source_readability_terpri(UNPROVIDED);
		{
		    SubLObject _prev_bind_0 = html_macros.$html_inside_bodyP$.currentBinding(thread);
		    try {
			html_macros.$html_inside_bodyP$.bind(T, thread);
			html_utilities.html_markup(html_macros.$html_body_head$.getGlobalValue());
			if (NIL != color_value) {
			    html_utilities.html_markup(html_macros.$html_body_bgcolor$.getGlobalValue());
			    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
			    html_utilities.html_markup(html_utilities.html_color(color_value));
			    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
			}
			html_utilities.html_char(CHAR_greater, UNPROVIDED);
			{
			    SubLObject _prev_bind_0_292 = html_macros.$html_safe_print$.currentBinding(thread);
			    try {
				html_macros.$html_safe_print$.bind(T, thread);
				html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
				html_utilities.html_markup(ONE_INTEGER);
				html_utilities.html_char(CHAR_greater, UNPROVIDED);
				if ((NIL != tm_control_vars.$client_thes_home_page$.getDynamicValue(thread)) && (NIL != tm_control_vars.$client_mini_logo$.getDynamicValue(thread))) {
				    html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
				    html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
				    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
				    html_utilities.html_markup(tm_control_vars.$client_thes_home_page$.getDynamicValue(thread));
				    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
				    html_utilities.html_char(CHAR_greater, UNPROVIDED);
				    {
					SubLObject _prev_bind_0_293 = html_macros.$html_safe_print$.currentBinding(thread);
					try {
					    html_macros.$html_safe_print$.bind(T, thread);
					    html_utilities.html_markup(html_macros.$html_image_head$.getGlobalValue());
					    html_utilities.html_markup(html_macros.$html_image_src$.getGlobalValue());
					    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
					    html_utilities.html_markup(tm_control_vars.$client_mini_logo$.getDynamicValue(thread));
					    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
					    if (NIL != tm_control_vars.$client_name$.getDynamicValue(thread)) {
						html_utilities.html_markup(html_macros.$html_image_alt$.getGlobalValue());
						html_utilities.html_char(CHAR_quotation, UNPROVIDED);
						html_utilities.html_markup(tm_control_vars.$client_name$.getDynamicValue(thread));
						html_utilities.html_char(CHAR_quotation, UNPROVIDED);
					    }
					    if (true) {
						html_utilities.html_markup(html_macros.$html_image_border$.getGlobalValue());
						html_utilities.html_char(CHAR_quotation, UNPROVIDED);
						html_utilities.html_markup(ZERO_INTEGER);
						html_utilities.html_char(CHAR_quotation, UNPROVIDED);
					    }
					    html_utilities.html_char(CHAR_greater, UNPROVIDED);
					    {
						SubLObject _prev_bind_0_294 = html_macros.$html_safe_print$.currentBinding(thread);
						try {
						    html_macros.$html_safe_print$.bind(T, thread);
						} finally {
						    html_macros.$html_safe_print$.rebind(_prev_bind_0_294, thread);
						}
					    }
					    html_utilities.html_markup(html_macros.$html_image_tail$.getGlobalValue());
					} finally {
					    html_macros.$html_safe_print$.rebind(_prev_bind_0_293, thread);
					}
				    }
				    html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
				}
				html_utilities.html_princ($$$Copy_Thesaurus);
				html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
				html_utilities.html_markup(ONE_INTEGER);
				html_utilities.html_char(CHAR_greater, UNPROVIDED);
				tm_logging.tm_enqueue_event($$$Copy_Thesaurus);
				if (!(true && (NIL != tm_internals.privelegedP(tm_datastructures.$tm_user$.getDynamicValue(thread), $str_alt185$full_editor)))) {
				    html_utilities.html_princ($str_alt186$Sorry__you_do_not_have_permission);
				} else {
				    html_thesaurus.thesaurus_heading($str_alt525$tm_copy_thesaurus);
				    if (NIL != tm_internals.editing_allowedP()) {
					html_utilities.html_markup(html_macros.$html_form_head$.getGlobalValue());
					html_utilities.html_markup(html_macros.$html_form_action$.getGlobalValue());
					html_utilities.html_char(CHAR_quotation, UNPROVIDED);
					html_utilities.html_markup(system_parameters.$cyc_cgi_program$.getDynamicValue(thread));
					html_utilities.html_char(CHAR_quotation, UNPROVIDED);
					if (NIL != html_macros.$html_form_method_post$.getGlobalValue()) {
					    html_utilities.html_markup(html_macros.$html_form_method$.getGlobalValue());
					    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
					    html_utilities.html_markup(html_macros.$html_form_method_post$.getGlobalValue());
					    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
					}
					html_utilities.html_char(CHAR_greater, UNPROVIDED);
					{
					    SubLObject _prev_bind_0_295 = html_macros.$html_safe_print$.currentBinding(thread);
					    SubLObject _prev_bind_1 = html_macros.$within_html_form$.currentBinding(thread);
					    SubLObject _prev_bind_2 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
					    try {
						html_macros.$html_safe_print$.bind(T, thread);
						html_macros.$within_html_form$.bind(T, thread);
						html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
						html_utilities.html_hidden_input($str_alt526$tm_handle_copy_thesaurus, T, UNPROVIDED);
						html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
						html_utilities.html_princ($$$Required_parameters);
						html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
						html_utilities.html_markup(html_macros.$html_table_head$.getGlobalValue());
						if (true) {
						    html_utilities.html_markup(html_macros.$html_table_border$.getGlobalValue());
						    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
						    html_utilities.html_markup(ZERO_INTEGER);
						    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
						}
						html_utilities.html_char(CHAR_greater, UNPROVIDED);
						{
						    SubLObject _prev_bind_0_296 = html_macros.$html_safe_print$.currentBinding(thread);
						    try {
							html_macros.$html_safe_print$.bind(T, thread);
							html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
							html_utilities.html_char(CHAR_greater, UNPROVIDED);
							{
							    SubLObject _prev_bind_0_297 = html_macros.$html_safe_print$.currentBinding(thread);
							    try {
								html_macros.$html_safe_print$.bind(T, thread);
								html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
								html_utilities.html_char(CHAR_greater, UNPROVIDED);
								{
								    SubLObject _prev_bind_0_298 = html_macros.$html_safe_print$.currentBinding(thread);
								    try {
									html_macros.$html_safe_print$.bind(T, thread);
									html_utilities.html_princ($str_alt528$Choose_Source_Thesaurus_);
								    } finally {
									html_macros.$html_safe_print$.rebind(_prev_bind_0_298, thread);
								    }
								}
								html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
								html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
								html_utilities.html_char(CHAR_greater, UNPROVIDED);
								{
								    SubLObject _prev_bind_0_299 = html_macros.$html_safe_print$.currentBinding(thread);
								    try {
									html_macros.$html_safe_print$.bind(T, thread);
									html_macros.verify_not_within_html_pre();
									html_utilities.html_markup(html_macros.$html_preformatted_head$.getGlobalValue());
									{
									    SubLObject _prev_bind_0_300 = html_macros.$within_html_pre$.currentBinding(thread);
									    try {
										html_macros.$within_html_pre$.bind(T, thread);
										html_utilities.html_princ($str_alt302$__);
									    } finally {
										html_macros.$within_html_pre$.rebind(_prev_bind_0_300, thread);
									    }
									}
									html_utilities.html_markup(html_macros.$html_preformatted_tail$.getGlobalValue());
								    } finally {
									html_macros.$html_safe_print$.rebind(_prev_bind_0_299, thread);
								    }
								}
								html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
								html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
								html_utilities.html_char(CHAR_greater, UNPROVIDED);
								{
								    SubLObject _prev_bind_0_301 = html_macros.$html_safe_print$.currentBinding(thread);
								    try {
									html_macros.$html_safe_print$.bind(T, thread);
									html_utilities.html_princ($str_alt529$Choose_Target_Thesaurus_);
								    } finally {
									html_macros.$html_safe_print$.rebind(_prev_bind_0_301, thread);
								    }
								}
								html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
							    } finally {
								html_macros.$html_safe_print$.rebind(_prev_bind_0_297, thread);
							    }
							}
							html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
							html_utilities.html_source_readability_terpri(UNPROVIDED);
							html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
							html_utilities.html_char(CHAR_greater, UNPROVIDED);
							{
							    SubLObject _prev_bind_0_302 = html_macros.$html_safe_print$.currentBinding(thread);
							    try {
								html_macros.$html_safe_print$.bind(T, thread);
								html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
								if (true) {
								    html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
								    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
								    html_utilities.html_markup(html_utilities.html_align($TOP));
								    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
								}
								html_utilities.html_char(CHAR_greater, UNPROVIDED);
								{
								    SubLObject _prev_bind_0_303 = html_macros.$html_safe_print$.currentBinding(thread);
								    try {
									html_macros.$html_safe_print$.bind(T, thread);
									html_thesaurus.tm_browse_thesaurus_selection(NIL, NIL, $str_alt530$source_thesaurus, T);
								    } finally {
									html_macros.$html_safe_print$.rebind(_prev_bind_0_303, thread);
								    }
								}
								html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
								html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
								html_utilities.html_char(CHAR_greater, UNPROVIDED);
								{
								    SubLObject _prev_bind_0_304 = html_macros.$html_safe_print$.currentBinding(thread);
								    try {
									html_macros.$html_safe_print$.bind(T, thread);
									html_macros.verify_not_within_html_pre();
									html_utilities.html_markup(html_macros.$html_preformatted_head$.getGlobalValue());
									{
									    SubLObject _prev_bind_0_305 = html_macros.$within_html_pre$.currentBinding(thread);
									    try {
										html_macros.$within_html_pre$.bind(T, thread);
										html_utilities.html_princ($str_alt302$__);
									    } finally {
										html_macros.$within_html_pre$.rebind(_prev_bind_0_305, thread);
									    }
									}
									html_utilities.html_markup(html_macros.$html_preformatted_tail$.getGlobalValue());
								    } finally {
									html_macros.$html_safe_print$.rebind(_prev_bind_0_304, thread);
								    }
								}
								html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
								html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
								if (true) {
								    html_utilities.html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
								    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
								    html_utilities.html_markup(html_utilities.html_align($TOP));
								    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
								}
								html_utilities.html_char(CHAR_greater, UNPROVIDED);
								{
								    SubLObject _prev_bind_0_306 = html_macros.$html_safe_print$.currentBinding(thread);
								    try {
									html_macros.$html_safe_print$.bind(T, thread);
									html_thesaurus.tm_edit_thesaurus_selection(NIL, NIL, $str_alt531$target_thesaurus, T);
								    } finally {
									html_macros.$html_safe_print$.rebind(_prev_bind_0_306, thread);
								    }
								}
								html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
							    } finally {
								html_macros.$html_safe_print$.rebind(_prev_bind_0_302, thread);
							    }
							}
							html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
							html_utilities.html_source_readability_terpri(UNPROVIDED);
						    } finally {
							html_macros.$html_safe_print$.rebind(_prev_bind_0_296, thread);
						    }
						}
						html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
						html_utilities.html_br();
						html_utilities.html_submit_input($$$Copy, UNPROVIDED, UNPROVIDED);
						html_utilities.html_reset_input($$$Reset);
						html_utilities.html_hr(UNPROVIDED, UNPROVIDED);
						html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
						html_utilities.html_princ($$$Optional_parameters);
						html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
						html_utilities.html_br();
						html_utilities.html_br();
						html_utilities.html_markup(html_macros.$html_table_head$.getGlobalValue());
						if (true) {
						    html_utilities.html_markup(html_macros.$html_table_border$.getGlobalValue());
						    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
						    html_utilities.html_markup(ZERO_INTEGER);
						    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
						}
						html_utilities.html_char(CHAR_greater, UNPROVIDED);
						{
						    SubLObject _prev_bind_0_307 = html_macros.$html_safe_print$.currentBinding(thread);
						    try {
							html_macros.$html_safe_print$.bind(T, thread);
							html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
							html_utilities.html_char(CHAR_greater, UNPROVIDED);
							{
							    SubLObject _prev_bind_0_308 = html_macros.$html_safe_print$.currentBinding(thread);
							    try {
								html_macros.$html_safe_print$.bind(T, thread);
								html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
								html_utilities.html_char(CHAR_greater, UNPROVIDED);
								{
								    SubLObject _prev_bind_0_309 = html_macros.$html_safe_print$.currentBinding(thread);
								    try {
									html_macros.$html_safe_print$.bind(T, thread);
									html_utilities.html_checkbox_input($$$log, T, T, UNPROVIDED, UNPROVIDED, UNPROVIDED);
								    } finally {
									html_macros.$html_safe_print$.rebind(_prev_bind_0_309, thread);
								    }
								}
								html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
								html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
								html_utilities.html_char(CHAR_greater, UNPROVIDED);
								{
								    SubLObject _prev_bind_0_310 = html_macros.$html_safe_print$.currentBinding(thread);
								    try {
									html_macros.$html_safe_print$.bind(T, thread);
									html_utilities.html_princ($str_alt535$Log_skipped_facts_in_file_);
								    } finally {
									html_macros.$html_safe_print$.rebind(_prev_bind_0_310, thread);
								    }
								}
								html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
							    } finally {
								html_macros.$html_safe_print$.rebind(_prev_bind_0_308, thread);
							    }
							}
							html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
							html_utilities.html_source_readability_terpri(UNPROVIDED);
							html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
							html_utilities.html_char(CHAR_greater, UNPROVIDED);
							{
							    SubLObject _prev_bind_0_311 = html_macros.$html_safe_print$.currentBinding(thread);
							    try {
								html_macros.$html_safe_print$.bind(T, thread);
								html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
								html_utilities.html_char(CHAR_greater, UNPROVIDED);
								{
								    SubLObject _prev_bind_0_312 = html_macros.$html_safe_print$.currentBinding(thread);
								    try {
									html_macros.$html_safe_print$.bind(T, thread);
									html_utilities.html_princ($str_alt2$);
								    } finally {
									html_macros.$html_safe_print$.rebind(_prev_bind_0_312, thread);
								    }
								}
								html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
								html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
								html_utilities.html_char(CHAR_greater, UNPROVIDED);
								{
								    SubLObject _prev_bind_0_313 = html_macros.$html_safe_print$.currentBinding(thread);
								    try {
									html_macros.$html_safe_print$.bind(T, thread);
									html_utilities.html_text_input($$$logfile, tm_io.tm_make_copy_log_filename(), $int$30);
								    } finally {
									html_macros.$html_safe_print$.rebind(_prev_bind_0_313, thread);
								    }
								}
								html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
							    } finally {
								html_macros.$html_safe_print$.rebind(_prev_bind_0_311, thread);
							    }
							}
							html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
							html_utilities.html_source_readability_terpri(UNPROVIDED);
						    } finally {
							html_macros.$html_safe_print$.rebind(_prev_bind_0_307, thread);
						    }
						}
						html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
						html_utilities.html_br();
						html_utilities.html_princ($str_alt537$Enter_start_terms__each_on_a_sepa);
						html_utilities.html_br();
						html_utilities.html_princ($str_alt538$Material_copied_will_include_thes);
						html_utilities.html_princ($str_alt539$If_no_start_terms_are_specified__);
						html_utilities.html_br();
						html_utilities.html_markup(html_macros.$html_textarea_head$.getGlobalValue());
						html_utilities.html_markup(html_macros.$html_textarea_name$.getGlobalValue());
						html_utilities.html_char(CHAR_quotation, UNPROVIDED);
						html_utilities.html_markup($str_alt540$start_terms);
						html_utilities.html_char(CHAR_quotation, UNPROVIDED);
						if (true) {
						    html_utilities.html_markup(html_macros.$html_textarea_cols$.getGlobalValue());
						    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
						    html_utilities.html_markup($int$60);
						    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
						}
						if (true) {
						    html_utilities.html_markup(html_macros.$html_textarea_rows$.getGlobalValue());
						    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
						    html_utilities.html_markup(FIVE_INTEGER);
						    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
						}
						html_utilities.html_char(CHAR_greater, UNPROVIDED);
						{
						    SubLObject _prev_bind_0_314 = html_macros.$html_safe_print$.currentBinding(thread);
						    try {
							html_macros.$html_safe_print$.bind(T, thread);
						    } finally {
							html_macros.$html_safe_print$.rebind(_prev_bind_0_314, thread);
						    }
						}
						html_utilities.html_markup(html_macros.$html_textarea_tail$.getGlobalValue());
						html_utilities.html_br();
						html_utilities.html_br();
						html_utilities.html_princ($str_alt541$Enter_BT_in_the_target_thesaurus_);
						html_utilities.html_br();
						html_utilities.html_princ($str_alt542$All_start_terms__or__if_none_are_);
						html_utilities.html_br();
						html_utilities.html_text_input($str_alt543$target_bt, NIL, $int$60);
						html_utilities.html_br();
						html_utilities.html_br();
						html_utilities.html_princ($str_alt544$Restrict_material_copied_to_a_spe);
						html_utilities.html_text_input($str_alt545$num_levels, UNPROVIDED, UNPROVIDED);
						html_utilities.html_br();
						html_utilities.html_br();
						html_utilities.html_princ($str_alt546$Only_copy_terms_broader_than__and);
						html_utilities.html_br();
						html_utilities.html_princ($str_alt547$_Enter_cutoff_terms__each_on_a_se);
						html_utilities.html_br();
						html_utilities.html_princ($str_alt548$Material_copied_will_not_include_);
						html_utilities.html_br();
						html_utilities.html_markup(html_macros.$html_textarea_head$.getGlobalValue());
						html_utilities.html_markup(html_macros.$html_textarea_name$.getGlobalValue());
						html_utilities.html_char(CHAR_quotation, UNPROVIDED);
						html_utilities.html_markup($str_alt549$stop_terms);
						html_utilities.html_char(CHAR_quotation, UNPROVIDED);
						if (true) {
						    html_utilities.html_markup(html_macros.$html_textarea_cols$.getGlobalValue());
						    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
						    html_utilities.html_markup($int$60);
						    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
						}
						if (true) {
						    html_utilities.html_markup(html_macros.$html_textarea_rows$.getGlobalValue());
						    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
						    html_utilities.html_markup(FIVE_INTEGER);
						    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
						}
						html_utilities.html_char(CHAR_greater, UNPROVIDED);
						{
						    SubLObject _prev_bind_0_315 = html_macros.$html_safe_print$.currentBinding(thread);
						    try {
							html_macros.$html_safe_print$.bind(T, thread);
						    } finally {
							html_macros.$html_safe_print$.rebind(_prev_bind_0_315, thread);
						    }
						}
						html_utilities.html_markup(html_macros.$html_textarea_tail$.getGlobalValue());
						html_utilities.html_br();
						html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
					    } finally {
						html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_2, thread);
						html_macros.$within_html_form$.rebind(_prev_bind_1, thread);
						html_macros.$html_safe_print$.rebind(_prev_bind_0_295, thread);
					    }
					}
					html_utilities.html_markup(html_macros.$html_form_tail$.getGlobalValue());
				    } else {
					html_thesaurus.tm_report_editing_disabled();
				    }
				}
				html_thesaurus.tm_footer();
				html_utilities.html_source_readability_terpri(UNPROVIDED);
			    } finally {
				html_macros.$html_safe_print$.rebind(_prev_bind_0_292, thread);
			    }
			}
			html_utilities.html_markup(html_macros.$html_body_tail$.getGlobalValue());
			html_utilities.html_source_readability_terpri(UNPROVIDED);
		    } finally {
			html_macros.$html_inside_bodyP$.rebind(_prev_bind_0, thread);
		    }
		}
		html_utilities.html_markup(html_macros.$html_html_tail$.getGlobalValue());
		html_utilities.html_source_readability_terpri(UNPROVIDED);
	    }
	    return NIL;
	}
    }

    public static final SubLObject tm_handle_copy_thesaurus(SubLObject args) {
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    {
		SubLObject source_thesaurus_name = html_utilities.html_extract_input($str_alt530$source_thesaurus, args);
		SubLObject target_thesaurus_name = html_utilities.html_extract_input($str_alt531$target_thesaurus, args);
		SubLObject log_p = html_utilities.html_extract_input($$$log, args);
		SubLObject logfile = html_utilities.html_extract_input($$$logfile, args);
		SubLObject start_terms = html_utilities.html_extract_input($str_alt540$start_terms, args);
		SubLObject target_bt = html_utilities.html_extract_input($str_alt543$target_bt, args);
		SubLObject num_levels = html_utilities.html_extract_input($str_alt545$num_levels, args);
		SubLObject cutoff_terms = html_utilities.html_extract_input($str_alt549$stop_terms, args);
		SubLObject target_concept = NIL;
		SubLObject start_concepts = NIL;
		SubLObject cutoff_concepts = NIL;
		SubLObject source_thesaurus = NIL;
		SubLObject target_thesaurus = NIL;
		SubLObject skipped_facts_log = NIL;
		if (NIL == source_thesaurus_name) {
		    return html_thesaurus.tm_error($str_alt551$Copy_Thesaurus__You_must_choose_a, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
		}
		if (NIL == target_thesaurus_name) {
		    return html_thesaurus.tm_error($str_alt552$Copy_Thesaurus__You_must_choose_a, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
		}
		if (source_thesaurus_name.equalp(target_thesaurus_name)) {
		    return html_thesaurus.tm_error($str_alt553$Copy_Thesaurus__The_source_and_ta, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
		}
		source_thesaurus = tm_internals.thesaurus_constant_from_name(source_thesaurus_name);
		if (NIL == tm_internals.thesaurusP(source_thesaurus)) {
		    return html_thesaurus.tm_error($str_alt554$Copy_Thesaurus___S_is_not_a_known, source_thesaurus_name, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
		}
		target_thesaurus = tm_internals.thesaurus_constant_from_name(target_thesaurus_name);
		if (NIL == tm_internals.thesaurusP(target_thesaurus)) {
		    return html_thesaurus.tm_error($str_alt554$Copy_Thesaurus___S_is_not_a_known, target_thesaurus_name, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
		}
		if (NIL != log_p) {
		    if (NIL != string_utilities.empty_string_p(logfile)) {
			return html_thesaurus.tm_error($str_alt555$Copy_Thesaurus__If_logging_is_ena, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
		    }
		    skipped_facts_log = tm_io.tm_make_copy_log_pathname(logfile);
		    if (NIL == file_utilities.file_valid_for_writing_p(skipped_facts_log)) {
			return html_thesaurus.tm_error($str_alt556$Configuration_error___Directory_f, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
		    }
		}
		if (start_terms.equalp($str_alt2$)) {
		    start_terms = NIL;
		} else {
		    start_terms = Mapping.mapcar(symbol_function(CANONICALIZE_LEXICAL_TERM), string_utilities.extract_lines(start_terms));
		}
		{
		    SubLObject cdolist_list_var = start_terms;
		    SubLObject start_term = NIL;
		    for (start_term = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), start_term = cdolist_list_var.first()) {
			{
			    SubLObject concept = NIL;
			    SubLObject lexpred = NIL;
			    try {
				concept = tm_internals.concept_from_term_lexpred_in_thesaurus(start_term, $$preferredTerm, source_thesaurus);
			    } catch (Throwable ccatch_env_var) {
				lexpred = Errors.handleThrowable(ccatch_env_var, $MULTIPLE_LEXPRED);
			    }
			    if (NIL != lexpred) {
				return html_thesaurus.tm_error($str_alt557$_A_has_multiple_preferred_term_st, start_term, tm_internals.thesaurus_name(source_thesaurus), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
			    }
			    if (NIL != forts.valid_fortP(concept)) {
				start_concepts = cons(concept, start_concepts);
			    } else {
				return html_thesaurus.tm_error($str_alt558$Invalid_start_term___S_is_not_a_p, start_term, tm_internals.thesaurus_name(source_thesaurus), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
			    }
			}
		    }
		}
		if (target_bt.equalp($str_alt2$)) {
		    target_bt = NIL;
		} else {
		    {
			SubLObject concept = NIL;
			SubLObject lexpred = NIL;
			try {
			    concept = tm_internals.concept_from_term_lexpred_in_thesaurus(tm_internals.canonicalize_lexical_term(target_bt), $$preferredTerm, target_thesaurus);
			} catch (Throwable ccatch_env_var) {
			    lexpred = Errors.handleThrowable(ccatch_env_var, $MULTIPLE_LEXPRED);
			}
			if (NIL != lexpred) {
			    return html_thesaurus.tm_error($str_alt557$_A_has_multiple_preferred_term_st, target_bt, tm_internals.thesaurus_name(target_thesaurus), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
			}
			if (NIL != forts.valid_fortP(concept)) {
			    target_concept = concept;
			} else {
			    return html_thesaurus.tm_error($str_alt559$Invalid_target_BT___S_is_not_a_pr, target_bt, tm_internals.thesaurus_name(target_thesaurus), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
			}
		    }
		}
		if (string_utilities.trim_whitespace(cutoff_terms).equalp($str_alt2$)) {
		    cutoff_terms = NIL;
		} else {
		    cutoff_terms = Mapping.mapcar(symbol_function(CANONICALIZE_LEXICAL_TERM), string_utilities.extract_lines(cutoff_terms));
		}
		{
		    SubLObject cdolist_list_var = cutoff_terms;
		    SubLObject cutoff_term = NIL;
		    for (cutoff_term = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), cutoff_term = cdolist_list_var.first()) {
			{
			    SubLObject concept = NIL;
			    SubLObject lexpred = NIL;
			    try {
				concept = tm_internals.concept_from_term_lexpred_in_thesaurus(cutoff_term, $$preferredTerm, source_thesaurus);
			    } catch (Throwable ccatch_env_var) {
				lexpred = Errors.handleThrowable(ccatch_env_var, $MULTIPLE_LEXPRED);
			    }
			    if (NIL != lexpred) {
				return html_thesaurus.tm_error($str_alt557$_A_has_multiple_preferred_term_st, cutoff_term, tm_internals.thesaurus_name(source_thesaurus), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
			    }
			    if (NIL != forts.valid_fortP(concept)) {
				cutoff_concepts = cons(concept, cutoff_concepts);
			    } else {
				return html_thesaurus.tm_error($str_alt560$Invalid_cutoff_term___S_is_not_a_, cutoff_term, tm_internals.thesaurus_name(source_thesaurus), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
			    }
			}
		    }
		}
		if (string_utilities.trim_whitespace(num_levels).equalp($str_alt2$)) {
		    num_levels = NIL;
		} else {
		    num_levels = read_from_string_ignoring_errors(num_levels, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
		}
		if (NIL != num_levels) {
		    if (NIL == subl_promotions.positive_integer_p(num_levels)) {
			return html_thesaurus.tm_error($str_alt561$_A_is_not_a_valid_number_of_level, num_levels, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
		    }
		}
		{
		    SubLObject read_successP = NIL;
		    SubLObject write_successP = NIL;
		    read_successP = tm_datastructures.tm_start_read_operation(source_thesaurus);
		    if (NIL != read_successP) {
			write_successP = tm_datastructures.tm_start_write_operation(target_thesaurus);
			if (NIL != write_successP) {
			    tm_copy_thesaurus_in_thinker(source_thesaurus, target_thesaurus, target_concept, start_concepts, cutoff_concepts, num_levels, skipped_facts_log);
			    {
				SubLObject color_value = tm_datastructures.$tm_bg_color_default$.getDynamicValue(thread);
				html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
				html_utilities.html_markup(html_macros.$html_head_head$.getGlobalValue());
				html_macros.html_head_content_type();
				html_utilities.html_source_readability_terpri(UNPROVIDED);
				html_utilities.html_markup(html_macros.$html_title_head$.getGlobalValue());
				html_utilities.html_princ($$$Copy_Thesaurus_Started);
				html_utilities.html_markup(html_macros.$html_title_tail$.getGlobalValue());
				html_utilities.html_markup(html_macros.$html_head_tail$.getGlobalValue());
				html_utilities.html_source_readability_terpri(UNPROVIDED);
				{
				    SubLObject _prev_bind_0 = html_macros.$html_inside_bodyP$.currentBinding(thread);
				    try {
					html_macros.$html_inside_bodyP$.bind(T, thread);
					html_utilities.html_markup(html_macros.$html_body_head$.getGlobalValue());
					if (NIL != color_value) {
					    html_utilities.html_markup(html_macros.$html_body_bgcolor$.getGlobalValue());
					    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
					    html_utilities.html_markup(html_utilities.html_color(color_value));
					    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
					}
					html_utilities.html_char(CHAR_greater, UNPROVIDED);
					{
					    SubLObject _prev_bind_0_316 = html_macros.$html_safe_print$.currentBinding(thread);
					    try {
						html_macros.$html_safe_print$.bind(T, thread);
						html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
						html_utilities.html_markup(ONE_INTEGER);
						html_utilities.html_char(CHAR_greater, UNPROVIDED);
						if ((NIL != tm_control_vars.$client_thes_home_page$.getDynamicValue(thread)) && (NIL != tm_control_vars.$client_mini_logo$.getDynamicValue(thread))) {
						    html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
						    html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
						    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
						    html_utilities.html_markup(tm_control_vars.$client_thes_home_page$.getDynamicValue(thread));
						    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
						    html_utilities.html_char(CHAR_greater, UNPROVIDED);
						    {
							SubLObject _prev_bind_0_317 = html_macros.$html_safe_print$.currentBinding(thread);
							try {
							    html_macros.$html_safe_print$.bind(T, thread);
							    html_utilities.html_markup(html_macros.$html_image_head$.getGlobalValue());
							    html_utilities.html_markup(html_macros.$html_image_src$.getGlobalValue());
							    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
							    html_utilities.html_markup(tm_control_vars.$client_mini_logo$.getDynamicValue(thread));
							    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
							    if (NIL != tm_control_vars.$client_name$.getDynamicValue(thread)) {
								html_utilities.html_markup(html_macros.$html_image_alt$.getGlobalValue());
								html_utilities.html_char(CHAR_quotation, UNPROVIDED);
								html_utilities.html_markup(tm_control_vars.$client_name$.getDynamicValue(thread));
								html_utilities.html_char(CHAR_quotation, UNPROVIDED);
							    }
							    if (true) {
								html_utilities.html_markup(html_macros.$html_image_border$.getGlobalValue());
								html_utilities.html_char(CHAR_quotation, UNPROVIDED);
								html_utilities.html_markup(ZERO_INTEGER);
								html_utilities.html_char(CHAR_quotation, UNPROVIDED);
							    }
							    html_utilities.html_char(CHAR_greater, UNPROVIDED);
							    {
								SubLObject _prev_bind_0_318 = html_macros.$html_safe_print$.currentBinding(thread);
								try {
								    html_macros.$html_safe_print$.bind(T, thread);
								} finally {
								    html_macros.$html_safe_print$.rebind(_prev_bind_0_318, thread);
								}
							    }
							    html_utilities.html_markup(html_macros.$html_image_tail$.getGlobalValue());
							} finally {
							    html_macros.$html_safe_print$.rebind(_prev_bind_0_317, thread);
							}
						    }
						    html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
						}
						html_utilities.html_princ($$$Copy_Thesaurus_Started);
						html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
						html_utilities.html_markup(ONE_INTEGER);
						html_utilities.html_char(CHAR_greater, UNPROVIDED);
						tm_logging.tm_enqueue_event($$$Copy_Thesaurus_Started);
						html_thesaurus.thesaurus_heading($str_alt526$tm_handle_copy_thesaurus);
						format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt563$Copying__A_to__A_, source_thesaurus_name, target_thesaurus_name);
						html_utilities.html_br();
						html_utilities.html_br();
						html_utilities.html_princ($str_alt564$Click_on_the_Status_button_in_the);
						html_thesaurus.tm_footer();
						html_utilities.html_source_readability_terpri(UNPROVIDED);
					    } finally {
						html_macros.$html_safe_print$.rebind(_prev_bind_0_316, thread);
					    }
					}
					html_utilities.html_markup(html_macros.$html_body_tail$.getGlobalValue());
					html_utilities.html_source_readability_terpri(UNPROVIDED);
				    } finally {
					html_macros.$html_inside_bodyP$.rebind(_prev_bind_0, thread);
				    }
				}
				html_utilities.html_markup(html_macros.$html_html_tail$.getGlobalValue());
				html_utilities.html_source_readability_terpri(UNPROVIDED);
			    }
			} else {
			    {
				SubLObject message = cconcatenate($str_alt565$Copying_to_thesaurus_, new SubLObject[] { tm_internals.thesaurus_name(target_thesaurus), $str_alt566$_is_not_permitted_at_this_time__b });
				html_thesaurus.tm_message_to_user($$$Copy_Not_Started, message);
			    }
			}
		    } else {
			{
			    SubLObject message = cconcatenate($str_alt568$Copying_from_thesaurus_, new SubLObject[] { tm_internals.thesaurus_name(source_thesaurus), $str_alt569$_is_not_permitted_at_this_time__b });
			    html_thesaurus.tm_message_to_user($$$Copy_Not_Started, message);
			}
		    }
		}
	    }
	    return NIL;
	}
    }

    public static final SubLObject tm_convert_pt_uf(SubLObject args) {
	if (args == UNPROVIDED) {
	    args = NIL;
	}
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    {
		SubLObject color_value = tm_datastructures.$tm_bg_color_default$.getDynamicValue(thread);
		html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
		html_utilities.html_markup(html_macros.$html_head_head$.getGlobalValue());
		html_macros.html_head_content_type();
		html_utilities.html_source_readability_terpri(UNPROVIDED);
		html_utilities.html_markup(html_macros.$html_title_head$.getGlobalValue());
		html_utilities.html_princ($$$Convert_PTs_to_UFs);
		html_utilities.html_markup(html_macros.$html_title_tail$.getGlobalValue());
		html_utilities.html_markup(html_macros.$html_head_tail$.getGlobalValue());
		html_utilities.html_source_readability_terpri(UNPROVIDED);
		{
		    SubLObject _prev_bind_0 = html_macros.$html_inside_bodyP$.currentBinding(thread);
		    try {
			html_macros.$html_inside_bodyP$.bind(T, thread);
			html_utilities.html_markup(html_macros.$html_body_head$.getGlobalValue());
			if (NIL != color_value) {
			    html_utilities.html_markup(html_macros.$html_body_bgcolor$.getGlobalValue());
			    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
			    html_utilities.html_markup(html_utilities.html_color(color_value));
			    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
			}
			html_utilities.html_char(CHAR_greater, UNPROVIDED);
			{
			    SubLObject _prev_bind_0_319 = html_macros.$html_safe_print$.currentBinding(thread);
			    try {
				html_macros.$html_safe_print$.bind(T, thread);
				html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
				html_utilities.html_markup(ONE_INTEGER);
				html_utilities.html_char(CHAR_greater, UNPROVIDED);
				if ((NIL != tm_control_vars.$client_thes_home_page$.getDynamicValue(thread)) && (NIL != tm_control_vars.$client_mini_logo$.getDynamicValue(thread))) {
				    html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
				    html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
				    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
				    html_utilities.html_markup(tm_control_vars.$client_thes_home_page$.getDynamicValue(thread));
				    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
				    html_utilities.html_char(CHAR_greater, UNPROVIDED);
				    {
					SubLObject _prev_bind_0_320 = html_macros.$html_safe_print$.currentBinding(thread);
					try {
					    html_macros.$html_safe_print$.bind(T, thread);
					    html_utilities.html_markup(html_macros.$html_image_head$.getGlobalValue());
					    html_utilities.html_markup(html_macros.$html_image_src$.getGlobalValue());
					    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
					    html_utilities.html_markup(tm_control_vars.$client_mini_logo$.getDynamicValue(thread));
					    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
					    if (NIL != tm_control_vars.$client_name$.getDynamicValue(thread)) {
						html_utilities.html_markup(html_macros.$html_image_alt$.getGlobalValue());
						html_utilities.html_char(CHAR_quotation, UNPROVIDED);
						html_utilities.html_markup(tm_control_vars.$client_name$.getDynamicValue(thread));
						html_utilities.html_char(CHAR_quotation, UNPROVIDED);
					    }
					    if (true) {
						html_utilities.html_markup(html_macros.$html_image_border$.getGlobalValue());
						html_utilities.html_char(CHAR_quotation, UNPROVIDED);
						html_utilities.html_markup(ZERO_INTEGER);
						html_utilities.html_char(CHAR_quotation, UNPROVIDED);
					    }
					    html_utilities.html_char(CHAR_greater, UNPROVIDED);
					    {
						SubLObject _prev_bind_0_321 = html_macros.$html_safe_print$.currentBinding(thread);
						try {
						    html_macros.$html_safe_print$.bind(T, thread);
						} finally {
						    html_macros.$html_safe_print$.rebind(_prev_bind_0_321, thread);
						}
					    }
					    html_utilities.html_markup(html_macros.$html_image_tail$.getGlobalValue());
					} finally {
					    html_macros.$html_safe_print$.rebind(_prev_bind_0_320, thread);
					}
				    }
				    html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
				}
				html_utilities.html_princ($$$Convert_PTs_to_UFs);
				html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
				html_utilities.html_markup(ONE_INTEGER);
				html_utilities.html_char(CHAR_greater, UNPROVIDED);
				tm_logging.tm_enqueue_event($$$Convert_PTs_to_UFs);
				if (!(true && (NIL != tm_internals.privelegedP(tm_datastructures.$tm_user$.getDynamicValue(thread), $str_alt185$full_editor)))) {
				    html_utilities.html_princ($str_alt186$Sorry__you_do_not_have_permission);
				} else {
				    html_thesaurus.thesaurus_heading($str_alt572$tm_convert_pt_uf);
				    if (NIL != tm_internals.editing_allowedP()) {
					html_utilities.html_markup(html_macros.$html_form_head$.getGlobalValue());
					html_utilities.html_markup(html_macros.$html_form_action$.getGlobalValue());
					html_utilities.html_char(CHAR_quotation, UNPROVIDED);
					html_utilities.html_markup(system_parameters.$cyc_cgi_program$.getDynamicValue(thread));
					html_utilities.html_char(CHAR_quotation, UNPROVIDED);
					if (NIL != html_macros.$html_form_method_post$.getGlobalValue()) {
					    html_utilities.html_markup(html_macros.$html_form_method$.getGlobalValue());
					    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
					    html_utilities.html_markup(html_macros.$html_form_method_post$.getGlobalValue());
					    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
					}
					html_utilities.html_char(CHAR_greater, UNPROVIDED);
					{
					    SubLObject _prev_bind_0_322 = html_macros.$html_safe_print$.currentBinding(thread);
					    SubLObject _prev_bind_1 = html_macros.$within_html_form$.currentBinding(thread);
					    SubLObject _prev_bind_2 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
					    try {
						html_macros.$html_safe_print$.bind(T, thread);
						html_macros.$within_html_form$.bind(T, thread);
						html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
						html_utilities.html_hidden_input($str_alt573$tm_handle_convert_pt_uf, T, UNPROVIDED);
						html_utilities.html_markup(html_macros.$html_paragraph_head$.getGlobalValue());
						html_utilities.html_princ($str_alt574$All_the_dependent_narrower_terms_);
						html_utilities.html_markup(html_macros.$html_paragraph_tail$.getGlobalValue());
						{
						    SubLObject v_default = (NIL != tm_datastructures.tm_value(tm_datastructures.$tm_user$.getDynamicValue(thread), $TERM))
							    ? ((SubLObject) (tm_internals.tm_string_for_constant(tm_datastructures.tm_value(tm_datastructures.$tm_user$.getDynamicValue(thread), $TERM), NIL, NIL, T)))
							    : $str_alt2$;
						    html_utilities.html_princ($str_alt575$Enter_a_term_whose_narrower_terms);
						    html_utilities.html_br();
						    html_utilities.html_text_input($$$term, v_default, $int$40);
						    html_utilities.html_br();
						    html_utilities.html_br();
						    html_utilities.html_princ($str_alt576$Choose_Thesauri_);
						    html_utilities.html_br();
						    html_thesaurus.tm_edit_thesaurus_selection(T, UNPROVIDED, UNPROVIDED, UNPROVIDED);
						    html_utilities.html_br();
						    html_utilities.html_br();
						    html_utilities.html_submit_input($$$Start_Conversion, UNPROVIDED, UNPROVIDED);
						    html_utilities.html_reset_input(UNPROVIDED);
						}
						html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
					    } finally {
						html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_2, thread);
						html_macros.$within_html_form$.rebind(_prev_bind_1, thread);
						html_macros.$html_safe_print$.rebind(_prev_bind_0_322, thread);
					    }
					}
					html_utilities.html_markup(html_macros.$html_form_tail$.getGlobalValue());
				    } else {
					html_thesaurus.tm_report_editing_disabled();
				    }
				}
				html_thesaurus.tm_footer();
				html_utilities.html_source_readability_terpri(UNPROVIDED);
			    } finally {
				html_macros.$html_safe_print$.rebind(_prev_bind_0_319, thread);
			    }
			}
			html_utilities.html_markup(html_macros.$html_body_tail$.getGlobalValue());
			html_utilities.html_source_readability_terpri(UNPROVIDED);
		    } finally {
			html_macros.$html_inside_bodyP$.rebind(_prev_bind_0, thread);
		    }
		}
		html_utilities.html_markup(html_macros.$html_html_tail$.getGlobalValue());
		html_utilities.html_source_readability_terpri(UNPROVIDED);
	    }
	    return NIL;
	}
    }

    public static final SubLObject tm_handle_convert_pt_uf(SubLObject args) {
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    {
		SubLObject v_term = html_utilities.html_extract_input($$$term, args);
		SubLObject thesauri = html_utilities.html_extract_input_values($$$thesauri, args);
		SubLObject thesaurus_constants = NIL;
		SubLObject ops = NIL;
		if (!v_term.isString()) {
		    return html_thesaurus.tm_error($str_alt579$_A_is_not_a_valid_term, v_term, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
		}
		v_term = tm_internals.canonicalize_lexical_term(v_term);
		if (v_term.equalp($str_alt2$)) {
		    return html_thesaurus.tm_error($str_alt418$No_term_was_specified_, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
		}
		if (NIL == thesauri) {
		    return html_thesaurus.tm_error($str_alt580$You_must_choose_at_least_one_thes, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
		}
		thesaurus_constants = Mapping.mapcar(symbol_function(THESAURUS_CONSTANT_FROM_NAME), thesauri);
		{
		    SubLObject cdolist_list_var = thesaurus_constants;
		    SubLObject thesaurus_constant = NIL;
		    for (thesaurus_constant = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), thesaurus_constant = cdolist_list_var.first()) {
			{
			    SubLObject op = tm_datastructures.get_tm_op();
			    SubLObject op_323 = op;
			    tm_datastructures._csetf_tm_op_opcode(op_323, $CONVERT_NT_UF);
			    tm_datastructures._csetf_tm_op_relation(op_323, $$preferredTerm);
			    tm_datastructures._csetf_tm_op_inverseP(op_323, NIL);
			    tm_datastructures._csetf_tm_op_args(op_323, list(v_term));
			    tm_datastructures._csetf_tm_op_thesaurus(op_323, thesaurus_constant);
			    tm_datastructures._csetf_tm_op_status(op_323, NIL);
			    tm_datastructures._csetf_tm_op_verifyP(op_323, NIL);
			    tm_datastructures._csetf_tm_op_hiddenP(op_323, NIL);
			    tm_datastructures._csetf_tm_op_description(op_323, NIL);
			    tm_datastructures._csetf_tm_op_description_args(op_323, NIL);
			    if (NIL.isString()) {
				set_op_english(op_323, NIL);
			    } else {
				set_op_english(op_323, UNPROVIDED);
			    }
			    ops = cons(op, ops);
			}
		    }
		}
		ops = nreverse(ops);
		thread.resetMultipleValues();
		{
		    SubLObject bad = tm_internals.check_operations(ops);
		    SubLObject good = thread.secondMultipleValue();
		    SubLObject verifyP = thread.thirdMultipleValue();
		    thread.resetMultipleValues();
		    if (NIL == good) {
			html_show_bad_ops_page(bad);
		    } else if (NIL != verifyP) {
			tm_verify_convert_pt_uf(good, bad);
		    } else {
			do_good_ops_results(bad, good, symbol_function(TM_FULL_RECORD_INFO_MERGED), list(tm_datastructures.sign_concept(tm_datastructures.tm_op_args(good.first()).first()), tm_datastructures.tm_value(tm_datastructures.$tm_user$.getDynamicValue(thread), $THESAURI)),
				$$$Convert_PTs_to_UFs, T);
		    }

		}
	    }
	    return NIL;
	}
    }

    public static final SubLObject tm_verify_convert_pt_uf(SubLObject good, SubLObject bad) {
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    {
		SubLObject color_value = tm_datastructures.$tm_bg_color_default$.getDynamicValue(thread);
		html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
		html_utilities.html_markup(html_macros.$html_head_head$.getGlobalValue());
		html_macros.html_head_content_type();
		html_utilities.html_source_readability_terpri(UNPROVIDED);
		html_utilities.html_markup(html_macros.$html_title_head$.getGlobalValue());
		html_utilities.html_princ($$$Verify_Convert_PTs_to_UFs);
		html_utilities.html_markup(html_macros.$html_title_tail$.getGlobalValue());
		html_utilities.html_markup(html_macros.$html_head_tail$.getGlobalValue());
		html_utilities.html_source_readability_terpri(UNPROVIDED);
		{
		    SubLObject _prev_bind_0 = html_macros.$html_inside_bodyP$.currentBinding(thread);
		    try {
			html_macros.$html_inside_bodyP$.bind(T, thread);
			html_utilities.html_markup(html_macros.$html_body_head$.getGlobalValue());
			if (NIL != color_value) {
			    html_utilities.html_markup(html_macros.$html_body_bgcolor$.getGlobalValue());
			    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
			    html_utilities.html_markup(html_utilities.html_color(color_value));
			    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
			}
			html_utilities.html_char(CHAR_greater, UNPROVIDED);
			{
			    SubLObject _prev_bind_0_324 = html_macros.$html_safe_print$.currentBinding(thread);
			    try {
				html_macros.$html_safe_print$.bind(T, thread);
				html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
				html_utilities.html_markup(ONE_INTEGER);
				html_utilities.html_char(CHAR_greater, UNPROVIDED);
				if ((NIL != tm_control_vars.$client_thes_home_page$.getDynamicValue(thread)) && (NIL != tm_control_vars.$client_mini_logo$.getDynamicValue(thread))) {
				    html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
				    html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
				    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
				    html_utilities.html_markup(tm_control_vars.$client_thes_home_page$.getDynamicValue(thread));
				    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
				    html_utilities.html_char(CHAR_greater, UNPROVIDED);
				    {
					SubLObject _prev_bind_0_325 = html_macros.$html_safe_print$.currentBinding(thread);
					try {
					    html_macros.$html_safe_print$.bind(T, thread);
					    html_utilities.html_markup(html_macros.$html_image_head$.getGlobalValue());
					    html_utilities.html_markup(html_macros.$html_image_src$.getGlobalValue());
					    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
					    html_utilities.html_markup(tm_control_vars.$client_mini_logo$.getDynamicValue(thread));
					    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
					    if (NIL != tm_control_vars.$client_name$.getDynamicValue(thread)) {
						html_utilities.html_markup(html_macros.$html_image_alt$.getGlobalValue());
						html_utilities.html_char(CHAR_quotation, UNPROVIDED);
						html_utilities.html_markup(tm_control_vars.$client_name$.getDynamicValue(thread));
						html_utilities.html_char(CHAR_quotation, UNPROVIDED);
					    }
					    if (true) {
						html_utilities.html_markup(html_macros.$html_image_border$.getGlobalValue());
						html_utilities.html_char(CHAR_quotation, UNPROVIDED);
						html_utilities.html_markup(ZERO_INTEGER);
						html_utilities.html_char(CHAR_quotation, UNPROVIDED);
					    }
					    html_utilities.html_char(CHAR_greater, UNPROVIDED);
					    {
						SubLObject _prev_bind_0_326 = html_macros.$html_safe_print$.currentBinding(thread);
						try {
						    html_macros.$html_safe_print$.bind(T, thread);
						} finally {
						    html_macros.$html_safe_print$.rebind(_prev_bind_0_326, thread);
						}
					    }
					    html_utilities.html_markup(html_macros.$html_image_tail$.getGlobalValue());
					} finally {
					    html_macros.$html_safe_print$.rebind(_prev_bind_0_325, thread);
					}
				    }
				    html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
				}
				html_utilities.html_princ($$$Verify_Convert_PTs_to_UFs);
				html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
				html_utilities.html_markup(ONE_INTEGER);
				html_utilities.html_char(CHAR_greater, UNPROVIDED);
				tm_logging.tm_enqueue_event($$$Verify_Convert_PTs_to_UFs);
				if (!(true && (NIL != tm_internals.privelegedP(tm_datastructures.$tm_user$.getDynamicValue(thread), $str_alt185$full_editor)))) {
				    html_utilities.html_princ($str_alt186$Sorry__you_do_not_have_permission);
				} else {
				    format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt584$Operation_CONVERT_dependent_NTs_o, tm_datastructures.sign_term(tm_datastructures.tm_op_args(good.first()).first()));
				    html_utilities.html_br();
				    if (NIL != bad) {
					html_show_bad_ops(bad);
				    }
				    {
					SubLObject mixed_ops = find_mixed_nt_ops(good);
					if (NIL != mixed_ops) {
					    html_show_nondependent_nt_ops(mixed_ops);
					}
				    }
				    html_utilities.html_princ($str_alt585$The_following_operations_can_be_a);
				    html_utilities.html_markup(html_macros.$html_form_head$.getGlobalValue());
				    html_utilities.html_markup(html_macros.$html_form_action$.getGlobalValue());
				    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
				    html_utilities.html_markup(system_parameters.$cyc_cgi_program$.getDynamicValue(thread));
				    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
				    if (NIL != html_macros.$html_form_method_post$.getGlobalValue()) {
					html_utilities.html_markup(html_macros.$html_form_method$.getGlobalValue());
					html_utilities.html_char(CHAR_quotation, UNPROVIDED);
					html_utilities.html_markup(html_macros.$html_form_method_post$.getGlobalValue());
					html_utilities.html_char(CHAR_quotation, UNPROVIDED);
				    }
				    html_utilities.html_char(CHAR_greater, UNPROVIDED);
				    {
					SubLObject _prev_bind_0_327 = html_macros.$html_safe_print$.currentBinding(thread);
					SubLObject _prev_bind_1 = html_macros.$within_html_form$.currentBinding(thread);
					SubLObject _prev_bind_2 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
					try {
					    html_macros.$html_safe_print$.bind(T, thread);
					    html_macros.$within_html_form$.bind(T, thread);
					    html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
					    html_utilities.html_hidden_input($str_alt586$tm_handle_verify_convert_pt_uf, T, UNPROVIDED);
					    {
						SubLObject cdolist_list_var = good;
						SubLObject op = NIL;
						for (op = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), op = cdolist_list_var.first()) {
						    {
							SubLObject thesaurus = tm_datastructures.tm_op_thesaurus(op);
							SubLObject thesaurus_name = tm_datastructures.tm_op_thesaurus_name(op);
							SubLObject sign = tm_datastructures.tm_op_args(op).first();
							SubLObject concept = tm_datastructures.sign_concept(sign);
							SubLObject preferred = tm_datastructures.concept_term(concept, thesaurus);
							SubLObject key = tm_datastructures.cache_operation(op);
							html_utilities.html_markup(html_macros.$html_list_item_head$.getGlobalValue());
							html_utilities.html_char(CHAR_greater, UNPROVIDED);
							{
							    SubLObject _prev_bind_0_328 = html_macros.$html_safe_print$.currentBinding(thread);
							    try {
								html_macros.$html_safe_print$.bind(T, thread);
								format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt62$In_Thesaurus__A, thesaurus_name);
								html_utilities.html_br();
								{
								    SubLObject v_default = T;
								    SubLObject all_dependents = remove(concept, gt_modules.tm_dependents(concept, thesaurus), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
								    SubLObject use_fors = tm_internals.gather_use_fors(all_dependents, thesaurus);
								    if (tm_datastructures.sign_relation(sign) == $$useFor) {
									v_default = NIL;
									format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt587$_S_USE___A___therefore__NTs_of___, new SubLObject[] { tm_datastructures.sign_term(sign), preferred, preferred });
									html_utilities.html_br();
									html_utilities.html_br();
								    }
								    format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt588$The_following_NTs_will_be_convert, preferred);
								    html_utilities.html_markup(html_macros.$html_unordered_list_head$.getGlobalValue());
								    html_utilities.html_simple_attribute(html_macros.$html_list_plain$.getGlobalValue());
								    html_utilities.html_char(CHAR_greater, UNPROVIDED);
								    {
									SubLObject _prev_bind_0_329 = html_macros.$html_safe_print$.currentBinding(thread);
									try {
									    html_macros.$html_safe_print$.bind(T, thread);
									    {
										SubLObject cdolist_list_var_330 = all_dependents;
										SubLObject dependent = NIL;
										for (dependent = cdolist_list_var_330.first(); NIL != cdolist_list_var_330; cdolist_list_var_330 = cdolist_list_var_330.rest(), dependent = cdolist_list_var_330.first()) {
										    html_utilities.html_markup(html_macros.$html_list_item_head$.getGlobalValue());
										    html_utilities.html_char(CHAR_greater, UNPROVIDED);
										    {
											SubLObject _prev_bind_0_331 = html_macros.$html_safe_print$.currentBinding(thread);
											try {
											    html_macros.$html_safe_print$.bind(T, thread);
											    html_utilities.html_princ(tm_datastructures.concept_term(dependent, thesaurus));
											} finally {
											    html_macros.$html_safe_print$.rebind(_prev_bind_0_331, thread);
											}
										    }
										    html_utilities.html_markup(html_macros.$html_list_item_tail$.getGlobalValue());
										}
									    }
									} finally {
									    html_macros.$html_safe_print$.rebind(_prev_bind_0_329, thread);
									}
								    }
								    html_utilities.html_markup(html_macros.$html_unordered_list_tail$.getGlobalValue());
								    if (NIL != use_fors) {
									format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt589$The_following_UFs_will_become_UFs, preferred);
									html_utilities.html_markup(html_macros.$html_unordered_list_head$.getGlobalValue());
									html_utilities.html_simple_attribute(html_macros.$html_list_plain$.getGlobalValue());
									html_utilities.html_char(CHAR_greater, UNPROVIDED);
									{
									    SubLObject _prev_bind_0_332 = html_macros.$html_safe_print$.currentBinding(thread);
									    try {
										html_macros.$html_safe_print$.bind(T, thread);
										{
										    SubLObject cdolist_list_var_333 = use_fors;
										    SubLObject use_for = NIL;
										    for (use_for = cdolist_list_var_333.first(); NIL != cdolist_list_var_333; cdolist_list_var_333 = cdolist_list_var_333.rest(), use_for = cdolist_list_var_333.first()) {
											html_utilities.html_markup(html_macros.$html_list_item_head$.getGlobalValue());
											html_utilities.html_char(CHAR_greater, UNPROVIDED);
											{
											    SubLObject _prev_bind_0_334 = html_macros.$html_safe_print$.currentBinding(thread);
											    try {
												html_macros.$html_safe_print$.bind(T, thread);
												html_utilities.html_princ(use_for);
											    } finally {
												html_macros.$html_safe_print$.rebind(_prev_bind_0_334, thread);
											    }
											}
											html_utilities.html_markup(html_macros.$html_list_item_tail$.getGlobalValue());
										    }
										}
									    } finally {
										html_macros.$html_safe_print$.rebind(_prev_bind_0_332, thread);
									    }
									}
									html_utilities.html_markup(html_macros.$html_unordered_list_tail$.getGlobalValue());
								    }
								    html_utilities.html_checkbox_input($$$operation, key, v_default, UNPROVIDED, UNPROVIDED, UNPROVIDED);
								    html_utilities.html_princ($str_alt401$_Perform_operation);
								    html_utilities.html_hidden_input($str_alt86$cache_key, key, UNPROVIDED);
								}
							    } finally {
								html_macros.$html_safe_print$.rebind(_prev_bind_0_328, thread);
							    }
							}
							html_utilities.html_markup(html_macros.$html_list_item_tail$.getGlobalValue());
						    }
						}
					    }
					    html_utilities.html_br();
					    html_utilities.html_submit_input($$$Convert, UNPROVIDED, UNPROVIDED);
					    html_utilities.html_reset_input(UNPROVIDED);
					    html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
					} finally {
					    html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_2, thread);
					    html_macros.$within_html_form$.rebind(_prev_bind_1, thread);
					    html_macros.$html_safe_print$.rebind(_prev_bind_0_327, thread);
					}
				    }
				    html_utilities.html_markup(html_macros.$html_form_tail$.getGlobalValue());
				}
				html_thesaurus.tm_footer();
				html_utilities.html_source_readability_terpri(UNPROVIDED);
			    } finally {
				html_macros.$html_safe_print$.rebind(_prev_bind_0_324, thread);
			    }
			}
			html_utilities.html_markup(html_macros.$html_body_tail$.getGlobalValue());
			html_utilities.html_source_readability_terpri(UNPROVIDED);
		    } finally {
			html_macros.$html_inside_bodyP$.rebind(_prev_bind_0, thread);
		    }
		}
		html_utilities.html_markup(html_macros.$html_html_tail$.getGlobalValue());
		html_utilities.html_source_readability_terpri(UNPROVIDED);
	    }
	    return NIL;
	}
    }

    public static final SubLObject tm_handle_verify_convert_pt_uf(SubLObject args) {
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    {
		SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
		SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
		try {
		    mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_GENL_MT, thread);
		    mt_relevance_macros.$mt$.bind(tm_datastructures.$tm_mt$.getGlobalValue(), thread);
		    {
			SubLObject op_keys = Mapping.mapcar(symbol_function(READ_FROM_STRING_IGNORING_ERRORS), html_utilities.html_extract_input_values($$$operation, args));
			SubLObject cache_keys = Mapping.mapcar(symbol_function(READ_FROM_STRING_IGNORING_ERRORS), html_utilities.html_extract_input_values($str_alt86$cache_key, args));
			SubLObject ops = Mapping.mapcar(symbol_function(LOOKUP_OPERATION), op_keys);
			SubLObject thesauri = NIL;
			if (NIL != remove_if(symbol_function($sym108$VALID_TM_OP_), ops, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
			    html_thesaurus.tm_error($str_alt109$Some_operation_was_not_found__hen, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
			} else {
			    {
				SubLObject cdolist_list_var = ops;
				SubLObject op = NIL;
				for (op = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), op = cdolist_list_var.first()) {
				    {
					SubLObject item_var = tm_datastructures.tm_op_thesaurus(op);
					if (NIL == member(item_var, thesauri, symbol_function(EQL), symbol_function(IDENTITY))) {
					    thesauri = cons(item_var, thesauri);
					}
				    }
				}
				do_good_ops_results(NIL, ops, symbol_function(TM_FULL_RECORD_INFO_MERGED), list(tm_datastructures.sign_concept(tm_datastructures.tm_op_args(ops.first()).first()), tm_datastructures.tm_value(tm_datastructures.$tm_user$.getDynamicValue(thread), $THESAURI)),
					$$$Convert_PTs_to_UFs, T);
				Mapping.mapc(symbol_function(DECACHE_OPERATION), cache_keys, EMPTY_SUBL_OBJECT_ARRAY);
			    }
			}
		    }
		} finally {
		    mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
		    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
		}
	    }
	    return NIL;
	}
    }

    public static final SubLObject find_mixed_nt_ops(SubLObject ops) {
	{
	    SubLObject mixed_ops = NIL;
	    SubLObject cdolist_list_var = ops;
	    SubLObject op = NIL;
	    for (op = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), op = cdolist_list_var.first()) {
		if (NIL != set_difference(gt_modules.all_narrower_terms(tm_datastructures.sign_concept(tm_datastructures.tm_op_args(op).first()), tm_datastructures.tm_op_thesaurus(op)),
			gt_modules.tm_dependents(tm_datastructures.sign_concept(tm_datastructures.tm_op_args(op).first()), tm_datastructures.tm_op_thesaurus(op)), UNPROVIDED, UNPROVIDED)) {
		    mixed_ops = cons(op, mixed_ops);
		}
	    }
	    mixed_ops = nreverse(mixed_ops);
	    return mixed_ops;
	}
    }

    public static final SubLObject tm_promote_uf_pt(SubLObject args) {
	if (args == UNPROVIDED) {
	    args = NIL;
	}
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    {
		SubLObject color_value = tm_datastructures.$tm_bg_color_default$.getDynamicValue(thread);
		html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
		html_utilities.html_markup(html_macros.$html_head_head$.getGlobalValue());
		html_macros.html_head_content_type();
		html_utilities.html_source_readability_terpri(UNPROVIDED);
		html_utilities.html_markup(html_macros.$html_title_head$.getGlobalValue());
		html_utilities.html_princ($$$Promote_UF_to_PT);
		html_utilities.html_markup(html_macros.$html_title_tail$.getGlobalValue());
		html_utilities.html_markup(html_macros.$html_head_tail$.getGlobalValue());
		html_utilities.html_source_readability_terpri(UNPROVIDED);
		{
		    SubLObject _prev_bind_0 = html_macros.$html_inside_bodyP$.currentBinding(thread);
		    try {
			html_macros.$html_inside_bodyP$.bind(T, thread);
			html_utilities.html_markup(html_macros.$html_body_head$.getGlobalValue());
			if (NIL != color_value) {
			    html_utilities.html_markup(html_macros.$html_body_bgcolor$.getGlobalValue());
			    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
			    html_utilities.html_markup(html_utilities.html_color(color_value));
			    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
			}
			html_utilities.html_char(CHAR_greater, UNPROVIDED);
			{
			    SubLObject _prev_bind_0_335 = html_macros.$html_safe_print$.currentBinding(thread);
			    try {
				html_macros.$html_safe_print$.bind(T, thread);
				html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
				html_utilities.html_markup(ONE_INTEGER);
				html_utilities.html_char(CHAR_greater, UNPROVIDED);
				if ((NIL != tm_control_vars.$client_thes_home_page$.getDynamicValue(thread)) && (NIL != tm_control_vars.$client_mini_logo$.getDynamicValue(thread))) {
				    html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
				    html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
				    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
				    html_utilities.html_markup(tm_control_vars.$client_thes_home_page$.getDynamicValue(thread));
				    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
				    html_utilities.html_char(CHAR_greater, UNPROVIDED);
				    {
					SubLObject _prev_bind_0_336 = html_macros.$html_safe_print$.currentBinding(thread);
					try {
					    html_macros.$html_safe_print$.bind(T, thread);
					    html_utilities.html_markup(html_macros.$html_image_head$.getGlobalValue());
					    html_utilities.html_markup(html_macros.$html_image_src$.getGlobalValue());
					    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
					    html_utilities.html_markup(tm_control_vars.$client_mini_logo$.getDynamicValue(thread));
					    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
					    if (NIL != tm_control_vars.$client_name$.getDynamicValue(thread)) {
						html_utilities.html_markup(html_macros.$html_image_alt$.getGlobalValue());
						html_utilities.html_char(CHAR_quotation, UNPROVIDED);
						html_utilities.html_markup(tm_control_vars.$client_name$.getDynamicValue(thread));
						html_utilities.html_char(CHAR_quotation, UNPROVIDED);
					    }
					    if (true) {
						html_utilities.html_markup(html_macros.$html_image_border$.getGlobalValue());
						html_utilities.html_char(CHAR_quotation, UNPROVIDED);
						html_utilities.html_markup(ZERO_INTEGER);
						html_utilities.html_char(CHAR_quotation, UNPROVIDED);
					    }
					    html_utilities.html_char(CHAR_greater, UNPROVIDED);
					    {
						SubLObject _prev_bind_0_337 = html_macros.$html_safe_print$.currentBinding(thread);
						try {
						    html_macros.$html_safe_print$.bind(T, thread);
						} finally {
						    html_macros.$html_safe_print$.rebind(_prev_bind_0_337, thread);
						}
					    }
					    html_utilities.html_markup(html_macros.$html_image_tail$.getGlobalValue());
					} finally {
					    html_macros.$html_safe_print$.rebind(_prev_bind_0_336, thread);
					}
				    }
				    html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
				}
				html_utilities.html_princ($$$Promote_UF_to_PT);
				html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
				html_utilities.html_markup(ONE_INTEGER);
				html_utilities.html_char(CHAR_greater, UNPROVIDED);
				tm_logging.tm_enqueue_event($$$Promote_UF_to_PT);
				if (!(true && (NIL != tm_internals.privelegedP(tm_datastructures.$tm_user$.getDynamicValue(thread), $str_alt185$full_editor)))) {
				    html_utilities.html_princ($str_alt186$Sorry__you_do_not_have_permission);
				} else {
				    html_thesaurus.thesaurus_heading($str_alt593$tm_promote_uf_pt);
				    if (NIL != tm_internals.editing_allowedP()) {
					html_utilities.html_markup(html_macros.$html_form_head$.getGlobalValue());
					html_utilities.html_markup(html_macros.$html_form_action$.getGlobalValue());
					html_utilities.html_char(CHAR_quotation, UNPROVIDED);
					html_utilities.html_markup(system_parameters.$cyc_cgi_program$.getDynamicValue(thread));
					html_utilities.html_char(CHAR_quotation, UNPROVIDED);
					if (NIL != html_macros.$html_form_method_post$.getGlobalValue()) {
					    html_utilities.html_markup(html_macros.$html_form_method$.getGlobalValue());
					    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
					    html_utilities.html_markup(html_macros.$html_form_method_post$.getGlobalValue());
					    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
					}
					html_utilities.html_char(CHAR_greater, UNPROVIDED);
					{
					    SubLObject _prev_bind_0_338 = html_macros.$html_safe_print$.currentBinding(thread);
					    SubLObject _prev_bind_1 = html_macros.$within_html_form$.currentBinding(thread);
					    SubLObject _prev_bind_2 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
					    try {
						html_macros.$html_safe_print$.bind(T, thread);
						html_macros.$within_html_form$.bind(T, thread);
						html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
						html_utilities.html_hidden_input($str_alt594$tm_handle_promote_uf_pt, T, UNPROVIDED);
						html_utilities.html_markup(html_macros.$html_paragraph_head$.getGlobalValue());
						html_utilities.html_princ($str_alt595$This_facility_promotes_a_use_for_);
						html_utilities.html_markup(html_macros.$html_paragraph_tail$.getGlobalValue());
						html_utilities.html_princ($str_alt596$Enter_a_Use_For_to_Promote__);
						html_utilities.html_text_input($str_alt597$usef_for, $str_alt2$, $int$40);
						html_utilities.html_br();
						html_utilities.html_princ($str_alt576$Choose_Thesauri_);
						html_utilities.html_br();
						html_thesaurus.tm_edit_thesaurus_selection(T, UNPROVIDED, UNPROVIDED, UNPROVIDED);
						html_utilities.html_br();
						html_utilities.html_submit_input($$$Promote, UNPROVIDED, UNPROVIDED);
						html_utilities.html_reset_input(UNPROVIDED);
						html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
					    } finally {
						html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_2, thread);
						html_macros.$within_html_form$.rebind(_prev_bind_1, thread);
						html_macros.$html_safe_print$.rebind(_prev_bind_0_338, thread);
					    }
					}
					html_utilities.html_markup(html_macros.$html_form_tail$.getGlobalValue());
				    } else {
					html_thesaurus.tm_report_editing_disabled();
				    }
				}
				html_thesaurus.tm_footer();
				html_utilities.html_source_readability_terpri(UNPROVIDED);
			    } finally {
				html_macros.$html_safe_print$.rebind(_prev_bind_0_335, thread);
			    }
			}
			html_utilities.html_markup(html_macros.$html_body_tail$.getGlobalValue());
			html_utilities.html_source_readability_terpri(UNPROVIDED);
		    } finally {
			html_macros.$html_inside_bodyP$.rebind(_prev_bind_0, thread);
		    }
		}
		html_utilities.html_markup(html_macros.$html_html_tail$.getGlobalValue());
		html_utilities.html_source_readability_terpri(UNPROVIDED);
	    }
	    return NIL;
	}
    }

    public static final SubLObject tm_handle_promote_uf_pt(SubLObject args) {
	html_thesaurus.tm_note_unsupported_feature($$$Promote_UF_to_PT, $str_alt600$This_facility_is_not_yet_supporte);
	return NIL;
    }

    public static final SubLObject tm_swap_pt_uf(SubLObject args) {
	{
	    SubLObject concept_id = args.first();
	    SubLObject thesaurus_id = second(args);
	    SubLObject concept = NIL;
	    SubLObject thesaurus = NIL;
	    if (!concept_id.isString()) {
		return html_thesaurus.tm_error($str_alt602$Implementation_error___A_is_not_a, concept_id, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
	    }
	    concept = html_thesaurus.tm_guess_fort(concept_id);
	    if (!thesaurus_id.isString()) {
		return html_thesaurus.tm_error($str_alt603$Implementation_error___A_is_not_a, thesaurus_id, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
	    }
	    thesaurus = html_thesaurus.tm_guess_fort(thesaurus_id);
	    if (NIL == forts.valid_fortP(concept)) {
		return html_thesaurus.tm_error($str_alt604$Implementation_error___A_didn_t_y, concept_id, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
	    }
	    if (NIL == tm_internals.thesaurusP(thesaurus)) {
		return html_thesaurus.tm_error($str_alt605$Implementation_error___A_didn_t_y, thesaurus_id, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
	    }
	    tm_swap_pt_uf_choices(concept, thesaurus);
	}
	return NIL;
    }

    public static final SubLObject tm_swap_pt_uf_choices(SubLObject concept, SubLObject thesaurus) {
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    {
		SubLObject color_value = tm_datastructures.$tm_bg_color_default$.getDynamicValue(thread);
		html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
		html_utilities.html_markup(html_macros.$html_head_head$.getGlobalValue());
		html_macros.html_head_content_type();
		html_utilities.html_source_readability_terpri(UNPROVIDED);
		html_utilities.html_markup(html_macros.$html_title_head$.getGlobalValue());
		html_utilities.html_princ(format(NIL, $str_alt607$Swap___A__with_some_UF_in__A, tm_datastructures.concept_term(concept, thesaurus), tm_internals.thesaurus_name(thesaurus)));
		html_utilities.html_markup(html_macros.$html_title_tail$.getGlobalValue());
		html_utilities.html_markup(html_macros.$html_head_tail$.getGlobalValue());
		html_utilities.html_source_readability_terpri(UNPROVIDED);
		{
		    SubLObject _prev_bind_0 = html_macros.$html_inside_bodyP$.currentBinding(thread);
		    try {
			html_macros.$html_inside_bodyP$.bind(T, thread);
			html_utilities.html_markup(html_macros.$html_body_head$.getGlobalValue());
			if (NIL != color_value) {
			    html_utilities.html_markup(html_macros.$html_body_bgcolor$.getGlobalValue());
			    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
			    html_utilities.html_markup(html_utilities.html_color(color_value));
			    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
			}
			html_utilities.html_char(CHAR_greater, UNPROVIDED);
			{
			    SubLObject _prev_bind_0_339 = html_macros.$html_safe_print$.currentBinding(thread);
			    try {
				html_macros.$html_safe_print$.bind(T, thread);
				html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
				html_utilities.html_markup(ONE_INTEGER);
				html_utilities.html_char(CHAR_greater, UNPROVIDED);
				if ((NIL != tm_control_vars.$client_thes_home_page$.getDynamicValue(thread)) && (NIL != tm_control_vars.$client_mini_logo$.getDynamicValue(thread))) {
				    html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
				    html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
				    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
				    html_utilities.html_markup(tm_control_vars.$client_thes_home_page$.getDynamicValue(thread));
				    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
				    html_utilities.html_char(CHAR_greater, UNPROVIDED);
				    {
					SubLObject _prev_bind_0_340 = html_macros.$html_safe_print$.currentBinding(thread);
					try {
					    html_macros.$html_safe_print$.bind(T, thread);
					    html_utilities.html_markup(html_macros.$html_image_head$.getGlobalValue());
					    html_utilities.html_markup(html_macros.$html_image_src$.getGlobalValue());
					    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
					    html_utilities.html_markup(tm_control_vars.$client_mini_logo$.getDynamicValue(thread));
					    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
					    if (NIL != tm_control_vars.$client_name$.getDynamicValue(thread)) {
						html_utilities.html_markup(html_macros.$html_image_alt$.getGlobalValue());
						html_utilities.html_char(CHAR_quotation, UNPROVIDED);
						html_utilities.html_markup(tm_control_vars.$client_name$.getDynamicValue(thread));
						html_utilities.html_char(CHAR_quotation, UNPROVIDED);
					    }
					    if (true) {
						html_utilities.html_markup(html_macros.$html_image_border$.getGlobalValue());
						html_utilities.html_char(CHAR_quotation, UNPROVIDED);
						html_utilities.html_markup(ZERO_INTEGER);
						html_utilities.html_char(CHAR_quotation, UNPROVIDED);
					    }
					    html_utilities.html_char(CHAR_greater, UNPROVIDED);
					    {
						SubLObject _prev_bind_0_341 = html_macros.$html_safe_print$.currentBinding(thread);
						try {
						    html_macros.$html_safe_print$.bind(T, thread);
						} finally {
						    html_macros.$html_safe_print$.rebind(_prev_bind_0_341, thread);
						}
					    }
					    html_utilities.html_markup(html_macros.$html_image_tail$.getGlobalValue());
					} finally {
					    html_macros.$html_safe_print$.rebind(_prev_bind_0_340, thread);
					}
				    }
				    html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
				}
				html_utilities.html_princ(format(NIL, $str_alt607$Swap___A__with_some_UF_in__A, tm_datastructures.concept_term(concept, thesaurus), tm_internals.thesaurus_name(thesaurus)));
				html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
				html_utilities.html_markup(ONE_INTEGER);
				html_utilities.html_char(CHAR_greater, UNPROVIDED);
				tm_logging.tm_enqueue_event(format(NIL, $str_alt607$Swap___A__with_some_UF_in__A, tm_datastructures.concept_term(concept, thesaurus), tm_internals.thesaurus_name(thesaurus)));
				if (!(true && (NIL != tm_internals.privelegedP(tm_datastructures.$tm_user$.getDynamicValue(thread), $str_alt297$limited_editor)))) {
				    html_utilities.html_princ($str_alt186$Sorry__you_do_not_have_permission);
				} else {
				    html_thesaurus.thesaurus_heading($str_alt608$tm_swap_pt_uf_choices);
				    html_utilities.html_markup(html_macros.$html_form_head$.getGlobalValue());
				    html_utilities.html_markup(html_macros.$html_form_action$.getGlobalValue());
				    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
				    html_utilities.html_markup(system_parameters.$cyc_cgi_program$.getDynamicValue(thread));
				    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
				    if (NIL != html_macros.$html_form_method_post$.getGlobalValue()) {
					html_utilities.html_markup(html_macros.$html_form_method$.getGlobalValue());
					html_utilities.html_char(CHAR_quotation, UNPROVIDED);
					html_utilities.html_markup(html_macros.$html_form_method_post$.getGlobalValue());
					html_utilities.html_char(CHAR_quotation, UNPROVIDED);
				    }
				    html_utilities.html_char(CHAR_greater, UNPROVIDED);
				    {
					SubLObject _prev_bind_0_342 = html_macros.$html_safe_print$.currentBinding(thread);
					SubLObject _prev_bind_1 = html_macros.$within_html_form$.currentBinding(thread);
					SubLObject _prev_bind_2 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
					try {
					    html_macros.$html_safe_print$.bind(T, thread);
					    html_macros.$within_html_form$.bind(T, thread);
					    html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
					    html_utilities.html_hidden_input($str_alt609$tm_handle_swap_pt_uf, T, UNPROVIDED);
					    html_utilities.html_hidden_input($$$concept, cb_utilities.cb_fort_identifier(concept), UNPROVIDED);
					    html_utilities.html_hidden_input($$$pt, tm_datastructures.concept_term(concept, thesaurus), UNPROVIDED);
					    html_utilities.html_hidden_input($$$thesaurus, cb_utilities.cb_fort_identifier(thesaurus), UNPROVIDED);
					    format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt612$Choose_a_UF_to_swap_with___A__in_, tm_datastructures.concept_term(concept, thesaurus), tm_internals.thesaurus_name(thesaurus));
					    html_utilities.html_br();
					    html_utilities.html_br();
					    {
						SubLObject cdolist_list_var = tm_internals.use_fors_in_thesaurus(concept, thesaurus);
						SubLObject uf = NIL;
						for (uf = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), uf = cdolist_list_var.first()) {
						    html_utilities.html_radio_input($$$uf, uf, NIL);
						    format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt614$___A, uf);
						    html_utilities.html_br();
						}
					    }
					    html_utilities.html_br();
					    html_utilities.html_submit_input($$$Swap, UNPROVIDED, UNPROVIDED);
					    html_utilities.html_reset_input(UNPROVIDED);
					    html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
					} finally {
					    html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_2, thread);
					    html_macros.$within_html_form$.rebind(_prev_bind_1, thread);
					    html_macros.$html_safe_print$.rebind(_prev_bind_0_342, thread);
					}
				    }
				    html_utilities.html_markup(html_macros.$html_form_tail$.getGlobalValue());
				}
				html_thesaurus.tm_footer();
				html_utilities.html_source_readability_terpri(UNPROVIDED);
			    } finally {
				html_macros.$html_safe_print$.rebind(_prev_bind_0_339, thread);
			    }
			}
			html_utilities.html_markup(html_macros.$html_body_tail$.getGlobalValue());
			html_utilities.html_source_readability_terpri(UNPROVIDED);
		    } finally {
			html_macros.$html_inside_bodyP$.rebind(_prev_bind_0, thread);
		    }
		}
		html_utilities.html_markup(html_macros.$html_html_tail$.getGlobalValue());
		html_utilities.html_source_readability_terpri(UNPROVIDED);
	    }
	    return NIL;
	}
    }

    public static final SubLObject tm_handle_swap_pt_uf(SubLObject args) {
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    {
		SubLObject concept_id = html_utilities.html_extract_input($$$concept, args);
		SubLObject thesaurus_id = html_utilities.html_extract_input($$$thesaurus, args);
		SubLObject uf = html_utilities.html_extract_input($$$uf, args);
		SubLObject pt = html_utilities.html_extract_input($$$pt, args);
		SubLObject concept = NIL;
		SubLObject thesaurus = NIL;
		concept = html_thesaurus.tm_guess_fort(concept_id);
		thesaurus = html_thesaurus.tm_guess_fort(thesaurus_id);
		if (NIL == forts.valid_fortP(concept)) {
		    return html_thesaurus.tm_error($str_alt616$Implementation_error__Couldn_t_de, concept_id, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
		}
		if (NIL == tm_internals.thesaurusP(thesaurus)) {
		    return html_thesaurus.tm_error($str_alt617$Implementation_error__Couldn_t_de, thesaurus_id, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
		}
		if (!uf.isString()) {
		    return html_thesaurus.tm_error($str_alt618$You_must_choose_a_UF_to_swap_with, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
		}
		{
		    SubLObject op = tm_datastructures.get_tm_op();
		    SubLObject ops = NIL;
		    SubLObject op_343 = op;
		    tm_datastructures._csetf_tm_op_opcode(op_343, $SWAP);
		    tm_datastructures._csetf_tm_op_relation(op_343, NIL);
		    tm_datastructures._csetf_tm_op_inverseP(op_343, NIL);
		    tm_datastructures._csetf_tm_op_args(op_343, list(concept, pt, uf));
		    tm_datastructures._csetf_tm_op_thesaurus(op_343, thesaurus);
		    tm_datastructures._csetf_tm_op_status(op_343, NIL);
		    tm_datastructures._csetf_tm_op_verifyP(op_343, NIL);
		    tm_datastructures._csetf_tm_op_hiddenP(op_343, NIL);
		    tm_datastructures._csetf_tm_op_description(op_343, NIL);
		    tm_datastructures._csetf_tm_op_description_args(op_343, NIL);
		    if (NIL.isString()) {
			set_op_english(op_343, NIL);
		    } else {
			set_op_english(op_343, UNPROVIDED);
		    }
		    ops = cons(op, ops);
		    thread.resetMultipleValues();
		    {
			SubLObject bad = tm_internals.check_operations(ops);
			SubLObject good = thread.secondMultipleValue();
			SubLObject verifyP = thread.thirdMultipleValue();
			thread.resetMultipleValues();
			if (NIL == good) {
			    html_show_bad_ops_page(bad);
			} else {
			    do_good_ops_results(bad, good, symbol_function(TM_FULL_RECORD_INFO_MERGED), list(tm_datastructures.tm_op_args(good.first()).first(), tm_datastructures.tm_value(tm_datastructures.$tm_user$.getDynamicValue(thread), $THESAURI)), $$$Swap_PT_with_UF, T);
			}
		    }
		}
	    }
	    return NIL;
	}
    }

    public static final SubLObject tm_import_ufs(SubLObject args) {
	{
	    SubLObject concept_id = args.first();
	    SubLObject thesaurus_id = second(args);
	    SubLObject concept = NIL;
	    SubLObject thesaurus = NIL;
	    concept = html_thesaurus.tm_guess_fort(concept_id);
	    thesaurus = html_thesaurus.tm_guess_fort(thesaurus_id);
	    if (NIL == forts.valid_fortP(concept)) {
		return html_thesaurus.tm_error($str_alt604$Implementation_error___A_didn_t_y, concept_id, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
	    }
	    if (NIL == tm_internals.thesaurusP(thesaurus)) {
		return html_thesaurus.tm_error($str_alt605$Implementation_error___A_didn_t_y, thesaurus_id, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
	    }
	    tm_import_uf_choices(concept, thesaurus);
	}
	return NIL;
    }

    public static final SubLObject tm_import_uf_choices(SubLObject concept, SubLObject thesaurus) {
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    {
		SubLObject other_thesauri = remove(thesaurus, tm_internals.thesauri_of_concept(concept), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
		SubLObject pt = tm_datastructures.concept_term(concept, thesaurus);
		SubLObject candidates_foundP = NIL;
		SubLObject current_ufs = NIL;
		SubLObject color_value = tm_datastructures.$tm_bg_color_default$.getDynamicValue(thread);
		html_utilities.html_markup(html_macros.$html_html_head$.getGlobalValue());
		html_utilities.html_markup(html_macros.$html_head_head$.getGlobalValue());
		html_macros.html_head_content_type();
		html_utilities.html_source_readability_terpri(UNPROVIDED);
		html_utilities.html_markup(html_macros.$html_title_head$.getGlobalValue());
		html_utilities.html_princ(format(NIL, $str_alt622$Import_UFs_to___A__in__A, pt, tm_internals.thesaurus_name(thesaurus)));
		html_utilities.html_markup(html_macros.$html_title_tail$.getGlobalValue());
		html_utilities.html_markup(html_macros.$html_head_tail$.getGlobalValue());
		html_utilities.html_source_readability_terpri(UNPROVIDED);
		{
		    SubLObject _prev_bind_0 = html_macros.$html_inside_bodyP$.currentBinding(thread);
		    try {
			html_macros.$html_inside_bodyP$.bind(T, thread);
			html_utilities.html_markup(html_macros.$html_body_head$.getGlobalValue());
			if (NIL != color_value) {
			    html_utilities.html_markup(html_macros.$html_body_bgcolor$.getGlobalValue());
			    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
			    html_utilities.html_markup(html_utilities.html_color(color_value));
			    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
			}
			html_utilities.html_char(CHAR_greater, UNPROVIDED);
			{
			    SubLObject _prev_bind_0_344 = html_macros.$html_safe_print$.currentBinding(thread);
			    try {
				html_macros.$html_safe_print$.bind(T, thread);
				html_utilities.html_markup(html_macros.$html_heading_head$.getGlobalValue());
				html_utilities.html_markup(ONE_INTEGER);
				html_utilities.html_char(CHAR_greater, UNPROVIDED);
				if ((NIL != tm_control_vars.$client_thes_home_page$.getDynamicValue(thread)) && (NIL != tm_control_vars.$client_mini_logo$.getDynamicValue(thread))) {
				    html_utilities.html_markup(html_macros.$html_anchor_head$.getGlobalValue());
				    html_utilities.html_markup(html_macros.$html_anchor_href$.getGlobalValue());
				    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
				    html_utilities.html_markup(tm_control_vars.$client_thes_home_page$.getDynamicValue(thread));
				    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
				    html_utilities.html_char(CHAR_greater, UNPROVIDED);
				    {
					SubLObject _prev_bind_0_345 = html_macros.$html_safe_print$.currentBinding(thread);
					try {
					    html_macros.$html_safe_print$.bind(T, thread);
					    html_utilities.html_markup(html_macros.$html_image_head$.getGlobalValue());
					    html_utilities.html_markup(html_macros.$html_image_src$.getGlobalValue());
					    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
					    html_utilities.html_markup(tm_control_vars.$client_mini_logo$.getDynamicValue(thread));
					    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
					    if (NIL != tm_control_vars.$client_name$.getDynamicValue(thread)) {
						html_utilities.html_markup(html_macros.$html_image_alt$.getGlobalValue());
						html_utilities.html_char(CHAR_quotation, UNPROVIDED);
						html_utilities.html_markup(tm_control_vars.$client_name$.getDynamicValue(thread));
						html_utilities.html_char(CHAR_quotation, UNPROVIDED);
					    }
					    if (true) {
						html_utilities.html_markup(html_macros.$html_image_border$.getGlobalValue());
						html_utilities.html_char(CHAR_quotation, UNPROVIDED);
						html_utilities.html_markup(ZERO_INTEGER);
						html_utilities.html_char(CHAR_quotation, UNPROVIDED);
					    }
					    html_utilities.html_char(CHAR_greater, UNPROVIDED);
					    {
						SubLObject _prev_bind_0_346 = html_macros.$html_safe_print$.currentBinding(thread);
						try {
						    html_macros.$html_safe_print$.bind(T, thread);
						} finally {
						    html_macros.$html_safe_print$.rebind(_prev_bind_0_346, thread);
						}
					    }
					    html_utilities.html_markup(html_macros.$html_image_tail$.getGlobalValue());
					} finally {
					    html_macros.$html_safe_print$.rebind(_prev_bind_0_345, thread);
					}
				    }
				    html_utilities.html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
				}
				html_utilities.html_princ(format(NIL, $str_alt622$Import_UFs_to___A__in__A, pt, tm_internals.thesaurus_name(thesaurus)));
				html_utilities.html_markup(html_macros.$html_heading_tail$.getGlobalValue());
				html_utilities.html_markup(ONE_INTEGER);
				html_utilities.html_char(CHAR_greater, UNPROVIDED);
				tm_logging.tm_enqueue_event(format(NIL, $str_alt622$Import_UFs_to___A__in__A, pt, tm_internals.thesaurus_name(thesaurus)));
				if (!(true && (NIL != tm_internals.privelegedP(tm_datastructures.$tm_user$.getDynamicValue(thread), $str_alt297$limited_editor)))) {
				    html_utilities.html_princ($str_alt186$Sorry__you_do_not_have_permission);
				} else {
				    html_thesaurus.thesaurus_heading($str_alt623$tm_import_uf_choices);
				    {
					SubLObject _prev_bind_0_347 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
					SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
					try {
					    mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_GENL_MT, thread);
					    mt_relevance_macros.$mt$.bind(thesaurus, thread);
					    current_ufs = tm_internals.use_fors(concept);
					} finally {
					    mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
					    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0_347, thread);
					}
				    }
				    html_utilities.html_markup(html_macros.$html_form_head$.getGlobalValue());
				    html_utilities.html_markup(html_macros.$html_form_action$.getGlobalValue());
				    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
				    html_utilities.html_markup(system_parameters.$cyc_cgi_program$.getDynamicValue(thread));
				    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
				    if (NIL != html_macros.$html_form_method_post$.getGlobalValue()) {
					html_utilities.html_markup(html_macros.$html_form_method$.getGlobalValue());
					html_utilities.html_char(CHAR_quotation, UNPROVIDED);
					html_utilities.html_markup(html_macros.$html_form_method_post$.getGlobalValue());
					html_utilities.html_char(CHAR_quotation, UNPROVIDED);
				    }
				    html_utilities.html_char(CHAR_greater, UNPROVIDED);
				    {
					SubLObject _prev_bind_0_348 = html_macros.$html_safe_print$.currentBinding(thread);
					SubLObject _prev_bind_1 = html_macros.$within_html_form$.currentBinding(thread);
					SubLObject _prev_bind_2 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
					try {
					    html_macros.$html_safe_print$.bind(T, thread);
					    html_macros.$within_html_form$.bind(T, thread);
					    html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
					    html_utilities.html_hidden_input($str_alt624$tm_handle_import_ufs, T, UNPROVIDED);
					    html_utilities.html_hidden_input($$$term, pt, UNPROVIDED);
					    html_utilities.html_hidden_input($$$thesaurus, cb_utilities.cb_fort_identifier(thesaurus), UNPROVIDED);
					    format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt625$Select_one_or_more_UFs_to_add_to_, pt, tm_internals.thesaurus_name(thesaurus));
					    html_utilities.html_br();
					    html_utilities.html_markup(html_macros.$html_table_head$.getGlobalValue());
					    if (true) {
						html_utilities.html_markup(html_macros.$html_table_border$.getGlobalValue());
						html_utilities.html_char(CHAR_quotation, UNPROVIDED);
						html_utilities.html_markup(ZERO_INTEGER);
						html_utilities.html_char(CHAR_quotation, UNPROVIDED);
					    }
					    html_utilities.html_char(CHAR_greater, UNPROVIDED);
					    {
						SubLObject _prev_bind_0_349 = html_macros.$html_safe_print$.currentBinding(thread);
						try {
						    html_macros.$html_safe_print$.bind(T, thread);
						    {
							SubLObject cdolist_list_var = other_thesauri;
							SubLObject other_thesaurus = NIL;
							for (other_thesaurus = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), other_thesaurus = cdolist_list_var.first()) {
							    {
								SubLObject heading_printedP = NIL;
								{
								    SubLObject _prev_bind_0_350 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
								    SubLObject _prev_bind_1_351 = mt_relevance_macros.$mt$.currentBinding(thread);
								    try {
									mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_GENL_MT, thread);
									mt_relevance_macros.$mt$.bind(other_thesaurus, thread);
									{
									    SubLObject cdolist_list_var_352 = tm_internals.use_fors(concept);
									    SubLObject other_uf = NIL;
									    for (other_uf = cdolist_list_var_352.first(); NIL != cdolist_list_var_352; cdolist_list_var_352 = cdolist_list_var_352.rest(), other_uf = cdolist_list_var_352.first()) {
										if (NIL == subl_promotions.memberP(other_uf, current_ufs, symbol_function(EQUALP), UNPROVIDED)) {
										    if (NIL == heading_printedP) {
											html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
											html_utilities.html_char(CHAR_greater, UNPROVIDED);
											{
											    SubLObject _prev_bind_0_353 = html_macros.$html_safe_print$.currentBinding(thread);
											    try {
												html_macros.$html_safe_print$.bind(T, thread);
											    } finally {
												html_macros.$html_safe_print$.rebind(_prev_bind_0_353, thread);
											    }
											}
											html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
											html_utilities.html_source_readability_terpri(UNPROVIDED);
											html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
											html_utilities.html_char(CHAR_greater, UNPROVIDED);
											{
											    SubLObject _prev_bind_0_354 = html_macros.$html_safe_print$.currentBinding(thread);
											    try {
												html_macros.$html_safe_print$.bind(T, thread);
												html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
												if (true) {
												    html_utilities.html_markup(html_macros.$html_table_data_colspan$.getGlobalValue());
												    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
												    html_utilities.html_markup(TWO_INTEGER);
												    html_utilities.html_char(CHAR_quotation, UNPROVIDED);
												}
												html_utilities.html_char(CHAR_greater, UNPROVIDED);
												{
												    SubLObject _prev_bind_0_355 = html_macros.$html_safe_print$.currentBinding(thread);
												    try {
													html_macros.$html_safe_print$.bind(T, thread);
													html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
													format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt626$Import_from__A_, tm_internals.thesaurus_name(other_thesaurus));
													html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
												    } finally {
													html_macros.$html_safe_print$.rebind(_prev_bind_0_355, thread);
												    }
												}
												html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
											    } finally {
												html_macros.$html_safe_print$.rebind(_prev_bind_0_354, thread);
											    }
											}
											html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
											html_utilities.html_source_readability_terpri(UNPROVIDED);
											heading_printedP = T;
										    }
										    if (other_uf.equalp(pt)) {
											html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
											html_utilities.html_char(CHAR_greater, UNPROVIDED);
											{
											    SubLObject _prev_bind_0_356 = html_macros.$html_safe_print$.currentBinding(thread);
											    try {
												html_macros.$html_safe_print$.bind(T, thread);
												html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
												html_utilities.html_char(CHAR_greater, UNPROVIDED);
												{
												    SubLObject _prev_bind_0_357 = html_macros.$html_safe_print$.currentBinding(thread);
												    try {
													html_macros.$html_safe_print$.bind(T, thread);
												    } finally {
													html_macros.$html_safe_print$.rebind(_prev_bind_0_357, thread);
												    }
												}
												html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
												html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
												html_utilities.html_char(CHAR_greater, UNPROVIDED);
												{
												    SubLObject _prev_bind_0_358 = html_macros.$html_safe_print$.currentBinding(thread);
												    try {
													html_macros.$html_safe_print$.bind(T, thread);
													format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt627$_A___Can_t_add_because_it_s_alrea, other_uf);
												    } finally {
													html_macros.$html_safe_print$.rebind(_prev_bind_0_358, thread);
												    }
												}
												html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
											    } finally {
												html_macros.$html_safe_print$.rebind(_prev_bind_0_356, thread);
											    }
											}
											html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
											html_utilities.html_source_readability_terpri(UNPROVIDED);
										    } else {
											html_utilities.html_markup(html_macros.$html_table_row_head$.getGlobalValue());
											html_utilities.html_char(CHAR_greater, UNPROVIDED);
											{
											    SubLObject _prev_bind_0_359 = html_macros.$html_safe_print$.currentBinding(thread);
											    try {
												html_macros.$html_safe_print$.bind(T, thread);
												candidates_foundP = T;
												html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
												html_utilities.html_char(CHAR_greater, UNPROVIDED);
												{
												    SubLObject _prev_bind_0_360 = html_macros.$html_safe_print$.currentBinding(thread);
												    try {
													html_macros.$html_safe_print$.bind(T, thread);
													html_utilities.html_checkbox_input($$$uf, other_uf, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
												    } finally {
													html_macros.$html_safe_print$.rebind(_prev_bind_0_360, thread);
												    }
												}
												html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
												html_utilities.html_markup(html_macros.$html_table_data_head$.getGlobalValue());
												html_utilities.html_char(CHAR_greater, UNPROVIDED);
												{
												    SubLObject _prev_bind_0_361 = html_macros.$html_safe_print$.currentBinding(thread);
												    try {
													html_macros.$html_safe_print$.bind(T, thread);
													html_utilities.html_princ(other_uf);
												    } finally {
													html_macros.$html_safe_print$.rebind(_prev_bind_0_361, thread);
												    }
												}
												html_utilities.html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
											    } finally {
												html_macros.$html_safe_print$.rebind(_prev_bind_0_359, thread);
											    }
											}
											html_utilities.html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
											html_utilities.html_source_readability_terpri(UNPROVIDED);
										    }
										}
									    }
									}
								    } finally {
									mt_relevance_macros.$mt$.rebind(_prev_bind_1_351, thread);
									mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0_350, thread);
								    }
								}
							    }
							}
						    }
						} finally {
						    html_macros.$html_safe_print$.rebind(_prev_bind_0_349, thread);
						}
					    }
					    html_utilities.html_markup(html_macros.$html_table_tail$.getGlobalValue());
					    if (NIL != candidates_foundP) {
						html_utilities.html_submit_input($$$Import, UNPROVIDED, UNPROVIDED);
						html_utilities.html_reset_input(UNPROVIDED);
					    }
					    if (NIL == candidates_foundP) {
						html_utilities.html_br();
						html_utilities.html_markup(html_macros.$html_strong_head$.getGlobalValue());
						format(html_macros.$html_stream$.getDynamicValue(thread), $str_alt629$No_use_fors_were_found_to_add_to_, pt);
						html_utilities.html_markup(html_macros.$html_strong_tail$.getGlobalValue());
					    }
					    html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
					} finally {
					    html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_2, thread);
					    html_macros.$within_html_form$.rebind(_prev_bind_1, thread);
					    html_macros.$html_safe_print$.rebind(_prev_bind_0_348, thread);
					}
				    }
				    html_utilities.html_markup(html_macros.$html_form_tail$.getGlobalValue());
				}
				html_thesaurus.tm_footer();
				html_utilities.html_source_readability_terpri(UNPROVIDED);
			    } finally {
				html_macros.$html_safe_print$.rebind(_prev_bind_0_344, thread);
			    }
			}
			html_utilities.html_markup(html_macros.$html_body_tail$.getGlobalValue());
			html_utilities.html_source_readability_terpri(UNPROVIDED);
		    } finally {
			html_macros.$html_inside_bodyP$.rebind(_prev_bind_0, thread);
		    }
		}
		html_utilities.html_markup(html_macros.$html_html_tail$.getGlobalValue());
		html_utilities.html_source_readability_terpri(UNPROVIDED);
	    }
	    return NIL;
	}
    }

    public static final SubLObject tm_handle_import_ufs(SubLObject args) {
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    {
		SubLObject new_ufs = html_utilities.html_extract_input_values($$$uf, args);
		SubLObject v_term = html_utilities.html_extract_input($$$term, args);
		SubLObject thesaurus_id = html_utilities.html_extract_input($$$thesaurus, args);
		SubLObject thesaurus = NIL;
		SubLObject ops = NIL;
		thesaurus = html_thesaurus.tm_guess_fort(thesaurus_id);
		if (NIL == tm_internals.thesaurusP(thesaurus)) {
		    return html_thesaurus.tm_error($str_alt630$Implementation_error__Can_t_deter, thesaurus_id, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
		}
		if (NIL == new_ufs) {
		    return html_thesaurus.tm_error($str_alt631$You_did_not_specify_any_use_fors_, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
		}
		{
		    SubLObject cdolist_list_var = new_ufs;
		    SubLObject new_uf = NIL;
		    for (new_uf = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), new_uf = cdolist_list_var.first()) {
			{
			    SubLObject op = tm_datastructures.get_tm_op();
			    SubLObject op_362 = op;
			    tm_datastructures._csetf_tm_op_opcode(op_362, $ADD);
			    tm_datastructures._csetf_tm_op_relation(op_362, $$useFor);
			    tm_datastructures._csetf_tm_op_inverseP(op_362, NIL);
			    tm_datastructures._csetf_tm_op_args(op_362, list(v_term, new_uf));
			    tm_datastructures._csetf_tm_op_thesaurus(op_362, thesaurus);
			    tm_datastructures._csetf_tm_op_status(op_362, NIL);
			    tm_datastructures._csetf_tm_op_verifyP(op_362, NIL);
			    tm_datastructures._csetf_tm_op_hiddenP(op_362, NIL);
			    tm_datastructures._csetf_tm_op_description(op_362, NIL);
			    tm_datastructures._csetf_tm_op_description_args(op_362, NIL);
			    if (NIL.isString()) {
				set_op_english(op_362, NIL);
			    } else {
				set_op_english(op_362, UNPROVIDED);
			    }
			    ops = cons(op, ops);
			}
		    }
		}
		ops = nreverse(ops);
		thread.resetMultipleValues();
		{
		    SubLObject bad = tm_internals.check_operations(ops);
		    SubLObject good = thread.secondMultipleValue();
		    SubLObject verifyP = thread.thirdMultipleValue();
		    thread.resetMultipleValues();
		    if (NIL == good) {
			html_show_bad_ops_page(bad);
		    } else if (NIL != verifyP) {
			html_verify_ops_page($str_alt102$tm_handle_do_operations, bad, good);
		    } else {
			{
			    SubLObject constant = tm_datastructures.sign_concept(tm_datastructures.tm_op_args(good.first()).first());
			    SubLObject thesauri = tm_datastructures.tm_value(tm_datastructures.$tm_user$.getDynamicValue(thread), $THESAURI);
			    do_good_ops_results(bad, good, symbol_function(TM_FULL_RECORD_INFO_MERGED), list(constant, thesauri), $$$Import_UFs, T);
			}
		    }

		}
	    }
	    return NIL;
	}
    }

    public static final SubLObject declare_html_tm_editing_file() {
	declareFunction("html_show_tm_arg", "HTML-SHOW-TM-ARG", 1, 0, false);
	declareFunction("tm_generate_arg_string", "TM-GENERATE-ARG-STRING", 1, 0, false);
	declareFunction("string_for_broader_terms", "STRING-FOR-BROADER-TERMS", 1, 0, false);
	declareFunction("tm_generate_create_string", "TM-GENERATE-CREATE-STRING", 2, 0, false);
	declareFunction("tm_generate_replace_string", "TM-GENERATE-REPLACE-STRING", 3, 0, false);
	declareFunction("tm_generate_splice_or_nuke_string", "TM-GENERATE-SPLICE-OR-NUKE-STRING", 2, 0, false);
	declareFunction("tm_generate_convert_nt_uf_string", "TM-GENERATE-CONVERT-NT-UF-STRING", 2, 0, false);
	declareFunction("tm_generate_swap_pt_uf_string", "TM-GENERATE-SWAP-PT-UF-STRING", 2, 0, false);
	declareFunction("tm_generate_relation_name", "TM-GENERATE-RELATION-NAME", 2, 0, false);
	declareFunction("tm_generate_edit_string", "TM-GENERATE-EDIT-STRING", 5, 0, false);
	declareFunction("tm_generate_stoplist_string", "TM-GENERATE-STOPLIST-STRING", 2, 0, false);
	declareFunction("tm_generate_cycl_string", "TM-GENERATE-CYCL-STRING", 3, 0, false);
	declareFunction("tm_generate_complex_string", "TM-GENERATE-COMPLEX-STRING", 4, 0, false);
	declareFunction("tm_generate_operation_string", "TM-GENERATE-OPERATION-STRING", 1, 0, false);
	declareFunction("set_op_english", "SET-OP-ENGLISH", 1, 1, false);
	declareFunction("html_show_tm_op", "HTML-SHOW-TM-OP", 1, 0, false);
	declareFunction("html_show_tm_op_description", "HTML-SHOW-TM-OP-DESCRIPTION", 1, 0, false);
	declareFunction("html_show_tm_op_descriptions", "HTML-SHOW-TM-OP-DESCRIPTIONS", 1, 0, false);
	declareFunction("html_show_nondependent_nt_ops", "HTML-SHOW-NONDEPENDENT-NT-OPS", 1, 0, false);
	declareFunction("html_show_bad_ops", "HTML-SHOW-BAD-OPS", 1, 0, false);
	declareFunction("html_show_bad_ops_page", "HTML-SHOW-BAD-OPS-PAGE", 1, 0, false);
	declareFunction("html_print_pt_assertion", "HTML-PRINT-PT-ASSERTION", 1, 0, false);
	declareFunction("html_print_top_assertion", "HTML-PRINT-TOP-ASSERTION", 1, 0, false);
	declareFunction("html_print_thesaurus_assertion", "HTML-PRINT-THESAURUS-ASSERTION", 1, 0, false);
	declareFunction("tm_format_thesaurus_assertion", "TM-FORMAT-THESAURUS-ASSERTION", 1, 0, false);
	declareFunction("html_verify_ops", "HTML-VERIFY-OPS", 1, 0, false);
	declareFunction("html_verify_ops_page", "HTML-VERIFY-OPS-PAGE", 3, 0, false);
	declareFunction("perform_operations_guts", "PERFORM-OPERATIONS-GUTS", 1, 0, false);
	declareFunction("print_operations_results", "PRINT-OPERATIONS-RESULTS", 1, 0, false);
	declareFunction("perform_operations", "PERFORM-OPERATIONS", 1, 0, false);
	declareFunction("check_and_perform_operation", "CHECK-AND-PERFORM-OPERATION", 1, 0, false);
	declareFunction("do_operations", "DO-OPERATIONS", 1, 1, false);
	declareFunction("report_no_operations", "REPORT-NO-OPERATIONS", 0, 0, false);
	declareFunction("tm_handle_do_operations", "TM-HANDLE-DO-OPERATIONS", 1, 0, false);
	declareFunction("really_do_operations", "REALLY-DO-OPERATIONS", 2, 0, false);
	declareFunction("do_good_ops_results", "DO-GOOD-OPS-RESULTS", 5, 1, false);
	declareFunction("do_good_edit_relation_ops_results", "DO-GOOD-EDIT-RELATION-OPS-RESULTS", 5, 1, false);
	declareFunction("relevant_assertions_of_ops", "RELEVANT-ASSERTIONS-OF-OPS", 1, 0, false);
	declareFunction("tm_integrity_check_ops", "TM-INTEGRITY-CHECK-OPS", 1, 0, false);
	declareFunction("print_operations_violations", "PRINT-OPERATIONS-VIOLATIONS", 1, 0, false);
	declareFunction("tm_fix_or_print_violation_choices", "TM-FIX-OR-PRINT-VIOLATION-CHOICES", 1, 0, false);
	declareFunction("tm_list_of_violation_choices", "TM-LIST-OF-VIOLATION-CHOICES", 1, 0, false);
	declareFunction("tm_fix_or_print_one_violation", "TM-FIX-OR-PRINT-ONE-VIOLATION", 2, 0, false);
	declareFunction("tm_show_remove_all_fix", "TM-SHOW-REMOVE-ALL-FIX", 2, 1, false);
	declareFunction("tm_show_remove_one_fix", "TM-SHOW-REMOVE-ONE-FIX", 2, 1, false);
	declareFunction("tm_show_retain_one_fix", "TM-SHOW-RETAIN-ONE-FIX", 2, 1, false);
	declareFunction("tm_show_merge_all_fix", "TM-SHOW-MERGE-ALL-FIX", 2, 1, false);
	declareFunction("tm_show_remove_fix", "TM-SHOW-REMOVE-FIX", 2, 1, false);
	declareFunction("tm_show_remove_stoplist_fix", "TM-SHOW-REMOVE-STOPLIST-FIX", 2, 1, false);
	declareFunction("tm_show_rename_term_fix", "TM-SHOW-RENAME-TERM-FIX", 2, 1, false);
	declareFunction("tm_show_splice_out_term_fix", "TM-SHOW-SPLICE-OUT-TERM-FIX", 2, 1, false);
	declareFunction("tm_show_retain_one_term_fix", "TM-SHOW-RETAIN-ONE-TERM-FIX", 2, 1, false);
	declareFunction("tm_show_delete_all_terms_fix", "TM-SHOW-DELETE-ALL-TERMS-FIX", 2, 1, false);
	declareFunction("tm_show_unrestrict_fix", "TM-SHOW-UNRESTRICT-FIX", 2, 1, false);
	declareFunction("tm_show_fix_choices", "TM-SHOW-FIX-CHOICES", 2, 1, false);
	declareFunction("tm_handle_and_perform_user_fixes", "TM-HANDLE-AND-PERFORM-USER-FIXES", 1, 0, false);
	declareFunction("tm_present_integrity_outcome", "TM-PRESENT-INTEGRITY-OUTCOME", 2, 0, false);
	declareFunction("tm_integrity_check_guts", "TM-INTEGRITY-CHECK-GUTS", 0, 0, false);
	declareFunction("tm_integrity_check", "TM-INTEGRITY-CHECK", 0, 1, false);
	declareFunction("tm_handle_integrity_check", "TM-HANDLE-INTEGRITY-CHECK", 1, 0, false);
	declareFunction("tm_do_integrity_check", "TM-DO-INTEGRITY-CHECK", 1, 0, false);
	declareFunction("tm_handle_do_integrity_check", "TM-HANDLE-DO-INTEGRITY-CHECK", 1, 0, false);
	declareFunction("tm_handle_user_fixes", "TM-HANDLE-USER-FIXES", 1, 0, false);
	declareFunction("tm_relation_integrity_check", "TM-RELATION-INTEGRITY-CHECK", 0, 1, false);
	declareFunction("tm_relation_integrity_check_guts", "TM-RELATION-INTEGRITY-CHECK-GUTS", 1, 1, false);
	declareFunction("tm_handle_relation_integrity_check", "TM-HANDLE-RELATION-INTEGRITY-CHECK", 1, 0, false);
	declareFunction("tm_do_relation_integrity_check", "TM-DO-RELATION-INTEGRITY-CHECK", 1, 0, false);
	declareFunction("tm_handle_do_relation_integrity_check", "TM-HANDLE-DO-RELATION-INTEGRITY-CHECK", 1, 0, false);
	declareFunction("tm_message_integrity_check_needed_for_relation", "TM-MESSAGE-INTEGRITY-CHECK-NEEDED-FOR-RELATION", 1, 1, false);
	declareFunction("tm_message_integrity_check_in_progress_for_relation", "TM-MESSAGE-INTEGRITY-CHECK-IN-PROGRESS-FOR-RELATION", 1, 1, false);
	declareFunction("get_default_integrity_check_relation", "GET-DEFAULT-INTEGRITY-CHECK-RELATION", 0, 1, false);
	declareFunction("tm_integrity_check_concept_chooser", "TM-INTEGRITY-CHECK-CONCEPT-CHOOSER", 1, 0, false);
	declareFunction("tm_integrity_check_concept_chooser_handler", "TM-INTEGRITY-CHECK-CONCEPT-CHOOSER-HANDLER", 1, 0, false);
	declareFunction("tm_integrity_check_concept_page", "TM-INTEGRITY-CHECK-CONCEPT-PAGE", 1, 0, false);
	declareFunction("tm_handle_integrity_check_concept", "TM-HANDLE-INTEGRITY-CHECK-CONCEPT", 1, 0, false);
	declareFunction("tm_quick_edit_page", "TM-QUICK-EDIT-PAGE", 0, 1, false);
	declareFunction("tm_handle_quick_edit", "TM-HANDLE-QUICK-EDIT", 1, 0, false);
	declareFunction("tm_edit", "TM-EDIT", 1, 0, false);
	declareFunction("make_edit_op", "MAKE-EDIT-OP", 5, 0, false);
	declareFunction("tm_handle_edit", "TM-HANDLE-EDIT", 1, 0, false);
	declareFunction("tm_printable_ascii_charP", "TM-PRINTABLE-ASCII-CHAR?", 1, 0, false);
	declareFunction("tm_strip_garbage_chars", "TM-STRIP-GARBAGE-CHARS", 1, 1, false);
	declareFunction("tm_handle_single_entry_edit", "TM-HANDLE-SINGLE-ENTRY-EDIT", 1, 0, false);
	declareFunction("tm_handle_regular_edit", "TM-HANDLE-REGULAR-EDIT", 1, 0, false);
	declareFunction("tm_full_record_string", "TM-FULL-RECORD-STRING", 1, 0, false);
	declareFunction("tm_full_record_guts_editable", "TM-FULL-RECORD-GUTS-EDITABLE", 1, 0, false);
	declareFunction("tm_full_record_with_editing", "TM-FULL-RECORD-WITH-EDITING", 1, 0, false);
	declareFunction("tm_tokenizer_test_1", "TM-TOKENIZER-TEST-1", 1, 0, false);
	declareFunction("tm_tokenizer_test_2", "TM-TOKENIZER-TEST-2", 1, 0, false);
	declareFunction("tm_tokenizer_test_3", "TM-TOKENIZER-TEST-3", 1, 0, false);
	declareFunction("tm_reduce_predicate_string", "TM-REDUCE-PREDICATE-STRING", 2, 0, false);
	declareFunction("tm_reduce_predicates", "TM-REDUCE-PREDICATES", 2, 0, false);
	declareFunction("tm_reduce_in_thesaurus_directive", "TM-REDUCE-IN-THESAURUS-DIRECTIVE", 1, 0, false);
	declareFunction("tm_reduce_thesaurus_directives", "TM-REDUCE-THESAURUS-DIRECTIVES", 1, 0, false);
	declareFunction("tm_tokenize_input", "TM-TOKENIZE-INPUT", 1, 0, false);
	declareFunction("tm_tokenize_1", "TM-TOKENIZE-1", 1, 0, false);
	declareFunction("tm_tokenize_3", "TM-TOKENIZE-3", 2, 0, false);
	declareFunction("abbrev_triple", "ABBREV-TRIPLE", 1, 0, false);
	declareFunction("isa_or_defnP", "ISA-OR-DEFN?", 2, 1, false);
	declareFunction("maybe_set_current_relation_map", "MAYBE-SET-CURRENT-RELATION-MAP", 1, 0, false);
	declareFunction("tm_parse_non_directive", "TM-PARSE-NON-DIRECTIVE", 2, 0, false);
	declareFunction("tm_parse_token_list", "TM-PARSE-TOKEN-LIST", 2, 0, false);
	declareFunction("tm_handle_edit_record", "TM-HANDLE-EDIT-RECORD", 1, 0, false);
	declareFunction("tm_delete_term", "TM-DELETE-TERM", 0, 1, false);
	declareFunction("tm_handle_delete_term", "TM-HANDLE-DELETE-TERM", 1, 0, false);
	declareFunction("tm_verify_delete_term", "TM-VERIFY-DELETE-TERM", 2, 0, false);
	declareFunction("tm_handle_verify_delete_term", "TM-HANDLE-VERIFY-DELETE-TERM", 1, 0, false);
	declareFunction("really_delete_term", "REALLY-DELETE-TERM", 2, 0, false);
	declareFunction("tm_add_term", "TM-ADD-TERM", 0, 1, false);
	declareFunction("tm_handle_add_term", "TM-HANDLE-ADD-TERM", 1, 0, false);
	declareFunction("tm_verify_add_term", "TM-VERIFY-ADD-TERM", 2, 0, false);
	declareFunction("tm_handle_verify_add_term", "TM-HANDLE-VERIFY-ADD-TERM", 1, 0, false);
	declareFunction("really_add_term", "REALLY-ADD-TERM", 2, 0, false);
	declareFunction("tm_concept_description", "TM-CONCEPT-DESCRIPTION", 1, 0, false);
	declareFunction("tm_rename_term", "TM-RENAME-TERM", 0, 1, false);
	declareFunction("tm_handle_rename_term", "TM-HANDLE-RENAME-TERM", 1, 0, false);
	declareFunction("tm_create_thesaurus", "TM-CREATE-THESAURUS", 0, 1, false);
	declareFunction("tm_handle_create_thesaurus", "TM-HANDLE-CREATE-THESAURUS", 1, 0, false);
	declareFunction("tm_rename_thesaurus", "TM-RENAME-THESAURUS", 0, 1, false);
	declareFunction("tm_handle_rename_thesaurus", "TM-HANDLE-RENAME-THESAURUS", 1, 0, false);
	declareFunction("tm_delete_thesaurus", "TM-DELETE-THESAURUS", 0, 1, false);
	declareFunction("tm_handle_delete_thesaurus", "TM-HANDLE-DELETE-THESAURUS", 1, 0, false);
	declareFunction("tm_really_handle_delete_thesaurus", "TM-REALLY-HANDLE-DELETE-THESAURUS", 1, 0, false);
	declareFunction("tm_copy_thesaurus_in_thinker", "TM-COPY-THESAURUS-IN-THINKER", 6, 1, false);
	declareFunction("tm_copy_thesaurus_subset_wrapper", "TM-COPY-THESAURUS-SUBSET-WRAPPER", 6, 1, false);
	declareFunction("tm_copy_thesaurus", "TM-COPY-THESAURUS", 0, 1, false);
	declareFunction("tm_handle_copy_thesaurus", "TM-HANDLE-COPY-THESAURUS", 1, 0, false);
	declareFunction("tm_convert_pt_uf", "TM-CONVERT-PT-UF", 0, 1, false);
	declareFunction("tm_handle_convert_pt_uf", "TM-HANDLE-CONVERT-PT-UF", 1, 0, false);
	declareFunction("tm_verify_convert_pt_uf", "TM-VERIFY-CONVERT-PT-UF", 2, 0, false);
	declareFunction("tm_handle_verify_convert_pt_uf", "TM-HANDLE-VERIFY-CONVERT-PT-UF", 1, 0, false);
	declareFunction("find_mixed_nt_ops", "FIND-MIXED-NT-OPS", 1, 0, false);
	declareFunction("tm_promote_uf_pt", "TM-PROMOTE-UF-PT", 0, 1, false);
	declareFunction("tm_handle_promote_uf_pt", "TM-HANDLE-PROMOTE-UF-PT", 1, 0, false);
	declareFunction("tm_swap_pt_uf", "TM-SWAP-PT-UF", 1, 0, false);
	declareFunction("tm_swap_pt_uf_choices", "TM-SWAP-PT-UF-CHOICES", 2, 0, false);
	declareFunction("tm_handle_swap_pt_uf", "TM-HANDLE-SWAP-PT-UF", 1, 0, false);
	declareFunction("tm_import_ufs", "TM-IMPORT-UFS", 1, 0, false);
	declareFunction("tm_import_uf_choices", "TM-IMPORT-UF-CHOICES", 2, 0, false);
	declareFunction("tm_handle_import_ufs", "TM-HANDLE-IMPORT-UFS", 1, 0, false);
	return NIL;
    }

    public static final SubLObject init_html_tm_editing_file() {
	return NIL;
    }

    public static final SubLObject setup_html_tm_editing_file() {
	html_macros.note_html_handler_function(TM_HANDLE_DO_OPERATIONS);
	html_macros.note_html_handler_function(TM_INTEGRITY_CHECK);
	html_macros.note_html_handler_function(TM_HANDLE_INTEGRITY_CHECK);
	html_macros.note_html_handler_function(TM_HANDLE_DO_INTEGRITY_CHECK);
	html_macros.note_html_handler_function(TM_HANDLE_USER_FIXES);
	html_macros.note_html_handler_function(TM_RELATION_INTEGRITY_CHECK);
	html_macros.note_html_handler_function(TM_HANDLE_RELATION_INTEGRITY_CHECK);
	html_macros.note_html_handler_function(TM_HANDLE_DO_RELATION_INTEGRITY_CHECK);
	html_macros.note_html_handler_function(TM_INTEGRITY_CHECK_CONCEPT_CHOOSER);
	html_macros.note_html_handler_function(TM_INTEGRITY_CHECK_CONCEPT_CHOOSER_HANDLER);
	html_macros.note_html_handler_function(TM_INTEGRITY_CHECK_CONCEPT_PAGE);
	html_macros.note_html_handler_function(TM_HANDLE_INTEGRITY_CHECK_CONCEPT);
	html_macros.note_html_handler_function(TM_QUICK_EDIT_PAGE);
	html_macros.note_html_handler_function(TM_HANDLE_QUICK_EDIT);
	html_macros.note_html_handler_function(TM_HANDLE_EDIT);
	html_macros.note_html_handler_function(TM_HANDLE_SINGLE_ENTRY_EDIT);
	html_macros.note_html_handler_function(TM_HANDLE_REGULAR_EDIT);
	html_macros.note_html_handler_function(TM_FULL_RECORD_WITH_EDITING);
	html_macros.note_html_handler_function(TM_HANDLE_EDIT_RECORD);
	html_macros.note_html_handler_function(TM_DELETE_TERM);
	html_macros.note_html_handler_function(TM_HANDLE_DELETE_TERM);
	html_macros.note_html_handler_function(TM_HANDLE_VERIFY_DELETE_TERM);
	html_macros.note_html_handler_function(TM_ADD_TERM);
	html_macros.note_html_handler_function(TM_HANDLE_ADD_TERM);
	html_macros.note_html_handler_function(TM_HANDLE_VERIFY_ADD_TERM);
	html_macros.note_html_handler_function(TM_CONCEPT_DESCRIPTION);
	html_macros.note_html_handler_function(TM_RENAME_TERM);
	html_macros.note_html_handler_function(TM_HANDLE_RENAME_TERM);
	html_macros.note_html_handler_function(TM_CREATE_THESAURUS);
	html_macros.note_html_handler_function(TM_HANDLE_CREATE_THESAURUS);
	html_macros.note_html_handler_function(TM_RENAME_THESAURUS);
	html_macros.note_html_handler_function(TM_HANDLE_RENAME_THESAURUS);
	html_macros.note_html_handler_function(TM_DELETE_THESAURUS);
	html_macros.note_html_handler_function(TM_HANDLE_DELETE_THESAURUS);
	html_macros.note_html_handler_function(TM_REALLY_HANDLE_DELETE_THESAURUS);
	html_macros.note_html_handler_function(TM_COPY_THESAURUS);
	html_macros.note_html_handler_function(TM_HANDLE_COPY_THESAURUS);
	html_macros.note_html_handler_function(TM_CONVERT_PT_UF);
	html_macros.note_html_handler_function(TM_HANDLE_CONVERT_PT_UF);
	html_macros.note_html_handler_function(TM_HANDLE_VERIFY_CONVERT_PT_UF);
	html_macros.note_html_handler_function(TM_PROMOTE_UF_PT);
	html_macros.note_html_handler_function(TM_HANDLE_PROMOTE_UF_PT);
	html_macros.note_html_handler_function(TM_SWAP_PT_UF);
	html_macros.note_html_handler_function(TM_HANDLE_SWAP_PT_UF);
	html_macros.note_html_handler_function(TM_IMPORT_UFS);
	html_macros.note_html_handler_function(TM_HANDLE_IMPORT_UFS);
	return NIL;
    }

    static private final SubLString $str_alt1$_a = makeString("~a");

    static private final SubLString $str_alt2$ = makeString("");

    static private final SubLString $str_alt3$with_broader_term_a = makeString("with broader term~a");

    static private final SubLString $$$s = makeString("s");

    static private final SubLString $str_alt5$_a___a_ = makeString("~a `~a'");

    static private final SubLString $str_alt6$_a_a_and___a_ = makeString("~a~a and `~a'");

    static private final SubLString $str_alt7$_ = makeString(",");

    static private final SubLString $str_alt8$_a____a_ = makeString("~a, `~a'");

    static private final SubLString $str_alt9$ADD_TERM___A__in__A__a = makeString("ADD TERM `~A' in ~A ~a");

    public static final SubLObject $$comment = constant_handles.reader_make_constant_shell(makeString("comment"));

    static private final SubLString $str_alt11$Change_Comment_from__ = makeString("Change Comment from \"");

    static private final SubLString $str_alt12$__to__ = makeString("\" to \"");

    static private final SubLString $str_alt13$_ = makeString("\"");

    public static final SubLObject $$preferredTerm = constant_handles.reader_make_constant_shell(makeString("preferredTerm"));

    public static final SubLObject $$nameString = constant_handles.reader_make_constant_shell(makeString("nameString"));

    public static final SubLSymbol $tm_name_pred$ = makeSymbol("*TM-NAME-PRED*");

    static private final SubLString $str_alt17$Change_Name__S_to__S = makeString("Change Name ~S to ~S");

    public static final SubLObject $$tmSymbol = constant_handles.reader_make_constant_shell(makeString("tmSymbol"));

    public static final SubLObject $$tmInverseSymbol = constant_handles.reader_make_constant_shell(makeString("tmInverseSymbol"));

    static private final SubLString $str_alt20$Rename_Relation__S_to__S = makeString("Rename Relation ~S to ~S");

    static private final SubLString $str_alt21$Change_Abbreviation__S_to__S = makeString("Change Abbreviation ~S to ~S");

    public static final SubLObject $$tmUserType = constant_handles.reader_make_constant_shell(makeString("tmUserType"));

    static private final SubLString $str_alt23$Change__A_s_level_from__S_to__S = makeString("Change ~A's level from ~S to ~S");

    public static final SubLObject $$arg1Format = constant_handles.reader_make_constant_shell(makeString("arg1Format"));

    public static final SubLObject $$arg2Format = constant_handles.reader_make_constant_shell(makeString("arg2Format"));

    static private final SubLString $$$Change_Cardinality_of_relation = makeString("Change Cardinality of relation");

    static private final SubLString $str_alt27$For___a___a___ = makeString("For `~a' ~a:  ");

    static private final SubLString $str_alt28$Replace_ = makeString("Replace ");

    static private final SubLString $str_alt29$_with_ = makeString(" with ");

    static private final SubLString $str_alt30$_in__A = makeString(" in ~A");

    static private final SubLString $str_alt31$DELETE_TERM___A__in__A = makeString("DELETE TERM `~A' in ~A");

    static private final SubLString $str_alt32$CONVERT_NTs_of___A__to_UFs_in__A = makeString("CONVERT NTs of `~A' to UFs in ~A");

    static private final SubLString $str_alt33$SWAP_PT___A__with_UF__S_in__A = makeString("SWAP PT `~A' with UF ~S in ~A");

    public static final SubLObject $$topInThesaurus = constant_handles.reader_make_constant_shell(makeString("topInThesaurus"));

    static private final SubLString $str_alt35$__A__as_a_top_term_in__A = makeString("`~A' as a top term in ~A");

    static private final SubLString $str_alt36$__A__as_a_preferred_term = makeString("`~A' as a preferred term");

    static private final SubLString $str_alt37$_A_and_its_inverse___A___A_the_se = makeString("~A and its inverse, ~A, ~A the set of active relations");

    static private final SubLString $$$to = makeString("to");

    static private final SubLString $$$from = makeString("from");

    static private final SubLString $str_alt41$__A_ = makeString(" ~A ");

    static private final SubLString $str_alt42$_S__A_the_stoplist = makeString("~S ~A the stoplist");

    static private final SubLString $str_alt43$__A = makeString("(~A");

    static private final SubLString $str_alt44$_ = makeString(" ");

    static private final SubLString $str_alt45$_ = makeString(")");

    static private final SubLString $str_alt46$_A_ = makeString("~A ");

    public static final SubLObject $$tmStoplistWord = constant_handles.reader_make_constant_shell(makeString("tmStoplistWord"));

    static private final SubLString $str_alt48$_in_ = makeString(" in ");

    private static final SubLSymbol $SPLICE_OUT = makeKeyword("SPLICE-OUT");

    private static final SubLSymbol $CONVERT_NT_UF = makeKeyword("CONVERT-NT-UF");

    public static final SubLObject $$tmRelationRestrictedFrom = constant_handles.reader_make_constant_shell(makeString("tmRelationRestrictedFrom"));

    static private final SubLString $str_alt56$this_comment_about__A___S = makeString("this comment about ~A: ~S");

    public static final SubLObject $$tmRelationOrderList = constant_handles.reader_make_constant_shell(makeString("tmRelationOrderList"));

    static private final SubLString $str_alt58$_A__A_the_set_of_active_relations = makeString("~A ~A the set of active relations");

    static private final SubLString $str_alt60$__ = makeString(": ");

    static private final SubLString $str_alt61$The_following_NTs_cannot_be_conve = makeString("The following NTs cannot be converted to UFs because they are not solely dependent on `~a': ");

    static private final SubLString $str_alt62$In_Thesaurus__A = makeString("In Thesaurus ~A");

    static private final SubLString $str_alt63$The_following_operations_could_no = makeString("The following operations could not be performed:");

    static private final SubLString $$$Operation_Results = makeString("Operation Results");

    static private final SubLString $str_alt65$_The_preferred_term_for_Cyc_conce = makeString("[The preferred term for Cyc concept ");

    private static final SubLSymbol $CONCEPT_DESCRIPTION = makeKeyword("CONCEPT-DESCRIPTION");

    static private final SubLString $str_alt67$_is__S_in__A_ = makeString(" is ~S in ~A]");

    static private final SubLString $str_alt68$__ = makeString("[`");

    static private final SubLString $str_alt69$__is_a_top_term_in = makeString("' is a top term in");

    static private final SubLString $str_alt70$_ = makeString("[");

    static private final SubLString $str_alt72$_S_ = makeString("~S ");

    static private final SubLString $str_alt74$_ = makeString("`");

    static private final SubLString $str_alt75$__ = makeString("' ");

    static private final SubLString $str_alt77$__S = makeString(" ~S");

    static private final SubLString $str_alt78$__ = makeString(" `");

    static private final SubLString $str_alt79$_ = makeString("'");

    static private final SubLString $str_alt80$__in__A = makeString("] in ~A");

    static private final SubLString $str_alt81$__A__ = makeString("`~A' ");

    static private final SubLString $str_alt82$___A_ = makeString(" `~A'");

    static private final SubLString $str_alt83$_ = makeString("]");

    static private final SubLString $$$operation = makeString("operation");

    static private final SubLString $str_alt85$Note__ = makeString("Note: ");

    static private final SubLString $str_alt86$cache_key = makeString("cache-key");

    static private final SubLString $$$Verify_Operations = makeString("Verify Operations");

    static private final SubLString $str_alt88$Please_verify_the_following_opera = makeString("Please verify the following operations:");

    static private final SubLString $$$Perform_selected_operations = makeString("Perform selected operations");

    static private final SubLString $$$Reset = makeString("Reset");

    static private final SubLString $str_alt91$The_following_operations_were_att = makeString("The following operations were attempted, with the given result:");

    static private final SubLString $str_alt93$_succeeded_ = makeString(" succeeded.");

    private static final SubLSymbol $WARNING = makeKeyword("WARNING");

    static private final SubLString $str_alt95$_succeeded_with_the_warning_ = makeString(" succeeded with the warning:");

    static private final SubLString $str_alt96$_A = makeString("~A");

    static private final SubLString $str_alt98$_failed_ = makeString(" failed:");

    static private final SubLString $str_alt99$Implementation_error__Unkown_resu = makeString("Implementation error: Unkown result type ~A.");

    static private final SubLString $str_alt100$perform_operations = makeString("perform-operations");

    static private final SubLString $str_alt101$No_operations_were_performed_ = makeString("No operations were performed.");

    static private final SubLString $str_alt102$tm_handle_do_operations = makeString("tm-handle-do-operations");

    static private final SubLString $$$No_Operations_To_Perform = makeString("No Operations To Perform");

    static private final SubLString $str_alt104$report_no_operations = makeString("report-no-operations");

    private static final SubLSymbol LOOKUP_OPERATION = makeSymbol("LOOKUP-OPERATION");

    static private final SubLSymbol $sym108$VALID_TM_OP_ = makeSymbol("VALID-TM-OP?");

    static private final SubLString $str_alt109$Some_operation_was_not_found__hen = makeString("Some operation was not found, hence you probably resubmitted a previously-submitted page.  Please start the operation over from the beginning.");

    private static final SubLSymbol DECACHE_OPERATION = makeSymbol("DECACHE-OPERATION");

    private static final SubLSymbol TM_HANDLE_DO_OPERATIONS = makeSymbol("TM-HANDLE-DO-OPERATIONS");

    static private final SubLString $str_alt113$really_do_operations = makeString("really-do-operations");

    static private final SubLString $str_alt114$_a_Results = makeString("~a Results");

    static private final SubLString $str_alt115$do_good_ops_results = makeString("do-good-ops-results");

    static private final SubLList $list_alt117 = list(makeSymbol("TERM"), list(makeSymbol("CONCEPT")), makeSymbol("BROADER-TERMS"));

    public static final SubLObject $$useFor = constant_handles.reader_make_constant_shell(makeString("useFor"));

    public static final SubLObject $$broaderTerm = constant_handles.reader_make_constant_shell(makeString("broaderTerm"));

    static private final SubLString $str_alt121$No_integrity_violations_were_enco = makeString("No integrity violations were encountered.");

    static private final SubLString $str_alt122$These_integrity_violations_involv = makeString("These integrity violations involving the term(s) were found after attempting the operations:");

    static private final SubLString $str_alt123$_Trouble_printing_message_ = makeString("[Trouble printing message]");

    static private final SubLString $str_alt124$tm_handle_user_fixes = makeString("tm-handle-user-fixes");

    static private final SubLString $$$Perform_Selected_Fixes = makeString("Perform Selected Fixes");

    static private final SubLString $str_alt126$number_of_violations = makeString("number-of-violations");

    static private final SubLString $str_alt127$Automatic_fix____ = makeString("Automatic fix -- ");

    static private final SubLString $str_alt128$Automatic_fix_failed_ = makeString("Automatic fix failed.");

    static private final SubLString $str_alt129$Choose_one_of_these_fixes_ = makeString("Choose one of these fixes:");

    static private final SubLString $str_alt130$No_possible_fixes_generated__fix_ = makeString("No possible fixes generated; fix by hand.");

    static private final SubLString $str_alt131$This_violation_is_no_longer_prese = makeString("This violation is no longer present.");

    static private final SubLString $str_alt132$fix_id__A = makeString("fix-id-~A");

    static private final SubLString $str_alt133$Delete_all_of_the_following_ = makeString("Delete all of the following:");

    static private final SubLString $str_alt134$info__A = makeString("info-~A");

    static private final SubLString $str_alt135$Choose_one_of_the_following_to_ = makeString("Choose one of the following to ");

    static private final SubLString $str_alt136$delete_ = makeString("delete:");

    static private final SubLString $str_alt137$Delete__ = makeString("Delete  ");

    static private final SubLString $str_alt138$retain_ = makeString("retain:");

    static private final SubLString $str_alt139$Keep__ = makeString("Keep  ");

    static private final SubLString $str_alt140$Merge_all_of_the_following_into_o = makeString("Merge all of the following into one");

    static private final SubLString $str_alt141$Delete_ = makeString("Delete ");

    static private final SubLString $str_alt142$Delete__S_from_the_stoplist_ = makeString("Delete ~S from the stoplist.");

    static private final SubLString $str_alt143$Rename___A__in__A_to_ = makeString("Rename `~A' in ~A to:");

    public static final SubLInteger $int$40 = makeInteger(40);

    static private final SubLString $str_alt145$Delete_term___A___term_only__from = makeString("Delete term `~A' (term only) from ~A.");

    static private final SubLString $str_alt146$Choose_one_term_to_retain__and_ = makeString("Choose one term to retain, and ");

    static private final SubLString $$$delete = makeString("delete");

    static private final SubLString $str_alt148$_the_rest_ = makeString(" the rest:");

    static private final SubLString $str_alt149$Delete_all_of_these_terms_from__A = makeString("Delete all of these terms from ~A:");

    static private final SubLString $str_alt150$Choose_one_of_the_following_to_pe = makeString("Choose one of the following to perform:");

    static private final SubLString $str_alt151$Remove__ = makeString("Remove  ");

    static private final SubLString $str_alt152$Allow_relation__A_to_be_used_in_t = makeString("Allow relation ~A to be used in thesaurus ~A");

    static private final SubLString $str_alt153$fix_id = makeString("fix-id");

    static private final SubLList $list_alt154 = list(new SubLObject[] { makeKeyword("UNRESTRICT"), makeKeyword("REMOVE-ALL"), makeKeyword("REMOVE-ONE"), makeKeyword("RETAIN-ONE"), makeKeyword("MERGE-ALL"), makeKeyword("REMOVE"), makeKeyword("REMOVE-STOPLIST-WORD"), makeKeyword("RENAME-TERM"),
	    makeKeyword("SPLICE-OUT-TERM"), makeKeyword("RETAIN-ONE-TERM"), makeKeyword("DELETE-ALL-TERMS") });

    static private final SubLString $$$Ignore_this_violation_for_now = makeString("Ignore this violation for now");

    private static final SubLSymbol $UNRESTRICT = makeKeyword("UNRESTRICT");

    private static final SubLSymbol $REMOVE_ONE = makeKeyword("REMOVE-ONE");

    private static final SubLSymbol $RETAIN_ONE = makeKeyword("RETAIN-ONE");

    private static final SubLSymbol $MERGE_ALL = makeKeyword("MERGE-ALL");

    private static final SubLSymbol $REMOVE_STOPLIST_WORD = makeKeyword("REMOVE-STOPLIST-WORD");

    private static final SubLSymbol $RENAME_TERM = makeKeyword("RENAME-TERM");

    private static final SubLSymbol $SPLICE_OUT_TERM = makeKeyword("SPLICE-OUT-TERM");

    private static final SubLSymbol $RETAIN_ONE_TERM = makeKeyword("RETAIN-ONE-TERM");

    private static final SubLSymbol $DELETE_ALL_TERMS = makeKeyword("DELETE-ALL-TERMS");

    static private final SubLString $str_alt167$Unknown_fix_type__A = makeString("Unknown fix type ~A");

    static private final SubLString $str_alt168$The_following_violations_were_fix = makeString("The following violations were fixed:");

    static private final SubLString $str_alt169$These_violations_were_not_fixed_ = makeString("These violations were not fixed:");

    private static final SubLSymbol $INTEGRITY_THESAURUS = makeKeyword("INTEGRITY-THESAURUS");

    static private final SubLString $$$type = makeString("type");

    static private final SubLString $$$new = makeString("new");

    static private final SubLString $$$Start_a_New_Integrity_Check = makeString("Start a New Integrity Check");

    static private final SubLString $str_alt174$Enter_Term_as_Starting_Point__opt = makeString("Enter Term as Starting Point (optional):");

    static private final SubLString $str_alt175$start_term = makeString("start-term");

    static private final SubLString $$$continue = makeString("continue");

    static private final SubLString $$$Continue_Existing_Integrity_Check = makeString("Continue Existing Integrity Check");

    static private final SubLString $str_alt178$Choose_Thesaurus_to_Check_ = makeString("Choose Thesaurus to Check:");

    static private final SubLString $$$thesaurus = makeString("thesaurus");

    static private final SubLList $list_alt180 = list(makeSymbol("THES"), makeSymbol("TOTAL"), makeSymbol("SEEN"));

    static private final SubLString $str_alt181$___in_progress___A = makeString(" - in progress (~A");

    static private final SubLString $str_alt183$__ = makeString("%)");

    static private final SubLString $$$Integrity_Check_Thesaurus = makeString("Integrity Check Thesaurus");

    static private final SubLString $str_alt185$full_editor = makeString("full-editor");

    static private final SubLString $str_alt186$Sorry__you_do_not_have_permission = makeString("Sorry, you do not have permission to access this page.");

    static private final SubLString $str_alt187$tm_integrity_check = makeString("tm-integrity-check");

    static private final SubLString $str_alt188$tm_handle_integrity_check = makeString("tm-handle-integrity-check");

    static private final SubLString $$$Integrity_Check = makeString("Integrity Check");

    private static final SubLSymbol TM_INTEGRITY_CHECK = makeSymbol("TM-INTEGRITY-CHECK");

    static private final SubLString $str_alt191$You_must_choose_either_to_start_a = makeString("You must choose either to start a new integrity check, or continue an existing one.");

    static private final SubLString $str_alt192$You_must_choose_a_thesaurus_on_wh = makeString("You must choose a thesaurus on which to perform the integrity check.");

    static private final SubLString $str_alt193$Could_not_determine_a_valid_thesa = makeString("Could not determine a valid thesaurus from ~A.");

    private static final SubLSymbol $THESAURI = makeKeyword("THESAURI");

    private static final SubLSymbol $MULTIPLE_LEXPRED = makeKeyword("MULTIPLE-LEXPRED");

    static private final SubLString $str_alt197$_A_has_multiple_preferred_term_st = makeString("~A has multiple preferred term statements in ~A.  Use Integrity Check Term to fix this term first.");

    static private final SubLString $str_alt198$You_have_specified_a_Starting_Ter = makeString("You have specified a Starting Term, ~S, which is unknown in ~A.");

    static private final SubLString $str_alt199$Implementation_error__Start_integ = makeString("Implementation error: Start integrity check failed.");

    static private final SubLString $str_alt200$No_integrity_check_is_in_progress = makeString("No integrity check is in progress for ~A.  If you want to start one, go back to the previous page and select ''Start a New Integrity Check.''");

    static private final SubLString $str_alt201$Implementation_error___S_is_not_a = makeString("Implementation error: ~S is not a valid type of integrity check");

    private static final SubLSymbol TM_HANDLE_INTEGRITY_CHECK = makeSymbol("TM-HANDLE-INTEGRITY-CHECK");

    static private final SubLString $$$Integrity_Check_Thesaurus_Results = makeString("Integrity Check Thesaurus Results");

    static private final SubLString $str_alt204$tm_do_integrity_check = makeString("tm-do-integrity-check");

    static private final SubLString $str_alt205$The_search_for_integrity_violatio = makeString("The search for integrity violations ended because ");

    static private final SubLString $str_alt207$the_default_number___A__of_violat = makeString("the default number (~A) of violating thesaurus facts were found.");

    static private final SubLString $str_alt209$it_timed_out_at__A_seconds_ = makeString("it timed out at ~A seconds.");

    static private final SubLString $str_alt211$the_entire_thesaurus_has_been_sea = makeString("the entire thesaurus has been searched.");

    static private final SubLString $str_alt212$of_an_unknown_halt_reason__A = makeString("of an unknown halt reason ~A");

    static private final SubLString $str_alt213$No_integrity_violations_were_foun = makeString("No integrity violations were found.");

    static private final SubLString $str_alt214$tm_handle_do_integrity_check = makeString("tm-handle-do-integrity-check");

    static private final SubLString $str_alt215$For_each_of_the_outstanding_viola = makeString("For each of the outstanding violations below, choose one fix.");

    static private final SubLString $str_alt216$If_you_wish_to_continue_checking_ = makeString("If you wish to continue checking, make a choice below.");

    static private final SubLString $str_alt217$Integrity_Check_Thesaurus_Fix_Res = makeString("Integrity Check Thesaurus Fix Results");

    static private final SubLString $str_alt218$If_you_wish_to_continue_integrity = makeString("If you wish to continue integrity checking, make a choice below.");

    private static final SubLSymbol TM_HANDLE_DO_INTEGRITY_CHECK = makeSymbol("TM-HANDLE-DO-INTEGRITY-CHECK");

    static private final SubLString $$$Fix_Integrity_Violations_Results = makeString("Fix Integrity Violations Results");

    private static final SubLSymbol TM_HANDLE_USER_FIXES = makeSymbol("TM-HANDLE-USER-FIXES");

    static private final SubLString $$$rel = makeString("rel");

    static private final SubLString $str_alt223$arg_index = makeString("arg-index");

    static private final SubLString $$$Integrity_Check_Relation = makeString("Integrity Check Relation");

    static private final SubLString $$$administrator = makeString("administrator");

    static private final SubLString $str_alt226$tm_relation_integrity_check = makeString("tm-relation-integrity-check");

    static private final SubLString $str_alt227$tm_handle_relation_integrity_chec = makeString("tm-handle-relation-integrity-check");

    static private final SubLString $str_alt228$relation_check_action = makeString("relation-check-action");

    static private final SubLString $str_alt229$Abort_Integrity_Check_and_Quit_Bo = makeString("Abort Integrity Check and Quit Bothering Me");

    private static final SubLSymbol TM_RELATION_INTEGRITY_CHECK = makeSymbol("TM-RELATION-INTEGRITY-CHECK");

    static private final SubLString $str_alt231$Could_not_determine_a_constant__a = makeString("Could not determine a constant ~a");

    static private final SubLString $str_alt232$Could_not_determine_a_relation_ = makeString("Could not determine a relation.");

    static private final SubLString $str_alt233$Start_a_New_Relation_Integrity_Ch = makeString("Start a New Relation Integrity Check");

    static private final SubLString $str_alt234$Continue_Existing_Relation_Integr = makeString("Continue Existing Relation Integrity Check");

    static private final SubLString $str_alt235$Choose_Relation_to_Check_ = makeString("Choose Relation to Check:");

    static private final SubLString $str_alt236$relation_to_check = makeString("relation-to-check");

    public static final SubLInteger $int$50 = makeInteger(50);

    static private final SubLString $str_alt238$Relation_Integrity_Checks_in_Prog = makeString("Relation Integrity Checks in Progress:");

    static private final SubLString $str_alt239$A_check_on_ = makeString("A check on ");

    static private final SubLString $str_alt240$_and_its_inverse_ = makeString(" and its inverse ");

    static private final SubLList $list_alt241 = list(makeSymbol("RELATION"), makeSymbol("TOTAL"), makeSymbol("SEEN"));

    static private final SubLString $str_alt242$_is_being_performed_by__a_and_is_ = makeString(" is being performed by ~a and is ~a% of the way to completion.");

    static private final SubLString $str_alt243$There_are_no_ = makeString("There are no ");

    static private final SubLString $$$relation = makeString("relation");

    static private final SubLString $str_alt245$_integrity_checks_in_progress_ = makeString(" integrity checks in progress.");

    static private final SubLString $str_alt246$There_are_no_integrity_checks_in_ = makeString("There are no integrity checks in progress.");

    static private final SubLString $str_alt247$Integrity_Checks_Needed_for_the_F = makeString("Integrity Checks Needed for the Following Relations:");

    static private final SubLString $str_alt248$_needs_to_be_performed_because_of = makeString(" needs to be performed because of editing actions by ~a.");

    static private final SubLString $str_alt249$There_are_no_relations_which_need = makeString("There are no relations which need to be integrity checked.");

    static private final SubLString $str_alt250$You_do_not_have_the_access_level_ = makeString("You do not have the access level needed to use this page.");

    static private final SubLString $str_alt251$You_must_enter_a_relation_on_whic = makeString("You must enter a relation on which to perform the integrity check.");

    static private final SubLString $str_alt252$Could_not_determine_a_valid_relat = makeString("Could not determine a valid relation from ~A.");

    static private final SubLString $str_alt255$No_integrity_check_is_in_progress = makeString("No integrity check is in progress for ~A.  If you want to start one, go back to the previous page and select ``Start a New Relation Integrity Check.''");

    static private final SubLString $str_alt256$Unrecognized_Action_Type_ = makeString("Unrecognized Action Type.");

    private static final SubLSymbol TM_HANDLE_RELATION_INTEGRITY_CHECK = makeSymbol("TM-HANDLE-RELATION-INTEGRITY-CHECK");

    static private final SubLString $$$Relation_Integrity_Check_Results = makeString("Relation Integrity Check Results");

    static private final SubLString $str_alt259$tm_do_relation_integrity_check = makeString("tm-do-relation-integrity-check");

    static private final SubLString $str_alt260$all_relation_uses_have_been_searc = makeString("all relation uses have been searched.");

    static private final SubLString $str_alt261$tm_handle_do_relation_integrity_c = makeString("tm-handle-do-relation-integrity-check");

    static private final SubLString $$$index = makeString("index");

    static private final SubLString $str_alt263$Integrity_Check_Relation_Fix_Resu = makeString("Integrity Check Relation Fix Results");

    private static final SubLSymbol TM_HANDLE_DO_RELATION_INTEGRITY_CHECK = makeSymbol("TM-HANDLE-DO-RELATION-INTEGRITY-CHECK");

    static private final SubLSymbol $sym265$THESAURUS_PREDICATE_ = makeSymbol("THESAURUS-PREDICATE?");

    static private final SubLString $str_alt266$To_go_to_the_page_to_start_an_int = makeString("To go to the page to start an integrity check for this relation click ");

    static private final SubLString $str_alt267$_A_ = makeString("~A?");

    static private final SubLString $str_alt268$tm_relation_integrity_check_rel__ = makeString("tm-relation-integrity-check&rel=~a&arg-index=~a");

    static private final SubLString $str_alt269$here_ = makeString("here.");

    static private final SubLString $str_alt270$To_go_to_the_relation_integrity_c = makeString("To go to the relation integrity check page click ");

    static private final SubLString $$$Integrity_Check_Term = makeString("Integrity Check Term");

    static private final SubLString $str_alt272$tm_integrity_check_concept_choose = makeString("tm-integrity-check-concept-chooser");

    static private final SubLString $str_alt273$tm_integrity_check_concept_choose = makeString("tm-integrity-check-concept-chooser-handler");

    static private final SubLString $str_alt274$Enter_a_term_and_thesaurus_to_ide = makeString("Enter a term and thesaurus to identify which concept to check.  The term will be checked in all active Editing thesauri.");

    static private final SubLString $$$string = makeString("string");

    static private final SubLString $$$Check = makeString("Check");

    private static final SubLSymbol TM_INTEGRITY_CHECK_CONCEPT_CHOOSER = makeSymbol("TM-INTEGRITY-CHECK-CONCEPT-CHOOSER");

    static private final SubLString $str_alt279$You_must_enter_a_term_to_integrit = makeString("You must enter a term to integrity check.");

    static private final SubLString $str_alt280$You_must_enter_a_non_empty_string = makeString("You must enter a non-empty string.");

    static private final SubLString $str_alt281$You_must_choose_a_thesaurus_to_un = makeString("You must choose a thesaurus to unambiguously identify the term");

    static private final SubLString $str_alt282$Could_not_determine_a_valid_thesa = makeString("Could not determine a valid thesaurus from ~A");

    static private final SubLString $str_alt283$_S_is_not_a_term_in__A = makeString("~S is not a term in ~A");

    private static final SubLSymbol TM_INTEGRITY_CHECK_CONCEPT_CHOOSER_HANDLER = makeSymbol("TM-INTEGRITY-CHECK-CONCEPT-CHOOSER-HANDLER");

    private static final SubLSymbol $EDIT_THESAURI = makeKeyword("EDIT-THESAURI");

    static private final SubLString $str_alt286$Implementation_error__id__A_is_no = makeString("Implementation error: id ~A is not valid.");

    static private final SubLString $str_alt287$No_concept_found_by_id__A___Perha = makeString("No concept found by id ~A.  Perhaps you chose a link from a stale page.");

    static private final SubLString $$$Integrity_Check_Term_Results = makeString("Integrity Check Term Results");

    static private final SubLString $str_alt289$No_integrity_violations_were_foun = makeString("No integrity violations were found in the thesauri active for editing.");

    static private final SubLString $str_alt290$tm_integrity_check_concept_page = makeString("tm-integrity-check-concept-page");

    static private final SubLString $str_alt291$Integrity_violations_were_found_i = makeString("Integrity violations were found in the active thesauri.");

    static private final SubLString $str_alt292$tm_handle_integrity_check_concept = makeString("tm-handle-integrity-check-concept");

    private static final SubLSymbol TM_INTEGRITY_CHECK_CONCEPT_PAGE = makeSymbol("TM-INTEGRITY-CHECK-CONCEPT-PAGE");

    static private final SubLString $$$Integrity_Check_Term_Fix_Results = makeString("Integrity Check Term Fix Results");

    private static final SubLSymbol TM_HANDLE_INTEGRITY_CHECK_CONCEPT = makeSymbol("TM-HANDLE-INTEGRITY-CHECK-CONCEPT");

    static private final SubLString $$$Thesaurus_Quick_Edit = makeString("Thesaurus Quick Edit");

    static private final SubLString $str_alt297$limited_editor = makeString("limited-editor");

    static private final SubLString $str_alt298$tm_quick_edit_page = makeString("tm-quick-edit-page");

    static private final SubLString $str_alt299$tm_handle_quick_edit = makeString("tm-handle-quick-edit");

    static private final SubLString $$$Go = makeString("Go");

    static private final SubLString $str_alt301$Thesauri_ = makeString("Thesauri:");

    static private final SubLString $str_alt302$__ = makeString("  ");

    static private final SubLString $str_alt303$Term_to_edit_ = makeString("Term to edit:");

    static private final SubLString $str_alt305$term_string = makeString("term-string");

    static private final SubLString $str_alt306$Operation_ = makeString("Operation:");

    static private final SubLString $str_alt307$Relation_ = makeString("Relation:");

    private static final SubLSymbol $DEFAULT_OPERATION = makeKeyword("DEFAULT-OPERATION");

    static private final SubLString $str_alt309$_S = makeString("~S");

    private static final SubLSymbol $DEFAULT_RELATION = makeKeyword("DEFAULT-RELATION");

    static private final SubLString $str_alt311$override_default_case = makeString("override-default-case");

    static private final SubLString $$$T = makeString("T");

    static private final SubLString $$$Override_Default_Case = makeString("Override Default Case");

    static private final SubLString $str_alt314$For_ADD_or_DELETE__please_specify = makeString("For ADD or DELETE, please specify value:");

    static private final SubLString $$$value = makeString("value");

    public static final SubLInteger $int$60 = makeInteger(60);

    private static final SubLSymbol TM_QUICK_EDIT_PAGE = makeSymbol("TM-QUICK-EDIT-PAGE");

    static private final SubLString $$$thesauri = makeString("thesauri");

    static private final SubLString $$$SN = makeString("SN");

    static private final SubLString $str_alt320$No_thesauri_were_specified_ = makeString("No thesauri were specified.");

    private static final SubLSymbol TM_HANDLE_QUICK_EDIT = makeSymbol("TM-HANDLE-QUICK-EDIT");

    static private final SubLString $str_alt322$No_operations_were_specified_ = makeString("No operations were specified.");

    static private final SubLString $str_alt323$Sorry__the_EDIT_operation_is_not_ = makeString("Sorry, the EDIT operation is not allowed across multiple thesauri.  Please \n       operate on each thesaurus individually, or use a combination of ADD and \n       DELETE actions.");

    static private final SubLString $$$Edit = makeString("Edit");

    static private final SubLString $str_alt325$tm_edit = makeString("tm-edit");

    static private final SubLString $str_alt326$Edit__A__A_in__A_ = makeString("Edit ~A ~A in ~A.");

    static private final SubLString $str_alt327$tm_handle_edit = makeString("tm-handle-edit");

    static private final SubLString $$$term = makeString("term");

    static private final SubLString $$$original = makeString("original");

    private static final SubLSymbol TM_HANDLE_EDIT = makeSymbol("TM-HANDLE-EDIT");

    public static final SubLInteger $int$31 = makeInteger(31);

    public static final SubLInteger $int$127 = makeInteger(127);

    static private final SubLList $list_alt333 = list(NINE_INTEGER, TEN_INTEGER, THIRTEEN_INTEGER);

    private static final SubLSymbol TM_HANDLE_SINGLE_ENTRY_EDIT = makeSymbol("TM-HANDLE-SINGLE-ENTRY-EDIT");

    static private final SubLString $str_alt336$No_operations_were_specified___Yo = makeString("No operations were specified.  You may need to select Override Default Case if you want to make a case change.");

    private static final SubLSymbol TM_HANDLE_REGULAR_EDIT = makeSymbol("TM-HANDLE-REGULAR-EDIT");

    private static final SubLSymbol $EDITABLE_THESAURI = makeKeyword("EDITABLE-THESAURI");

    static private final SubLString $str_alt339$In_Thesaurus____a__ = makeString("In Thesaurus:~%~a~%");

    static private final SubLString $$$LT = makeString("LT");

    static private final SubLString $str_alt341$_a____ = makeString("~a :~%");

    static private final SubLString $str_alt342$_a__ = makeString("~a~%");

    static private final SubLString $str_alt343$In_Thesaurus___a = makeString("In Thesaurus: ~a");

    static private final SubLString $str_alt344$_a__ = makeString("~a :");

    private static final SubLSymbol $BG_COLOR_FULL_RECORD = makeKeyword("BG-COLOR-FULL-RECORD");

    static private final SubLString $$$Thesaurus_Full_Term_Edit = makeString("Thesaurus Full Term Edit");

    static private final SubLString $str_alt347$tm_full_record_with_editing = makeString("tm-full-record-with-editing");

    static private final SubLString $str_alt348$tm_handle_edit_record = makeString("tm-handle-edit-record");

    static private final SubLString $str_alt349$Edit_information_about_the_term_i = makeString("Edit information about the term in the box below.");

    static private final SubLString $$$Submit_Changes = makeString("Submit Changes");

    private static final SubLSymbol $VIEW_RELATIONS = makeKeyword("VIEW-RELATIONS");

    static private final SubLString $str_alt352$id_string = makeString("id-string");

    static private final SubLString $str_alt353$full_edit_info = makeString("full-edit-info");

    static private final SubLString $str_alt354$Note__Facts_involving_these_inact = makeString("Note: Facts involving these inactive relations are omitted from editting: ~A");

    static private final SubLString $str_alt355$__ = makeString(", ");

    private static final SubLSymbol TM_FULL_RECORD_WITH_EDITING = makeSymbol("TM-FULL-RECORD-WITH-EDITING");

    static private final SubLString $str_alt357$_ = makeString(":");

    private static final SubLSymbol TRIM_SIDES = makeSymbol("TRIM-SIDES");

    private static final SubLSymbol TM_TOKENIZER_TEST_2 = makeSymbol("TM-TOKENIZER-TEST-2");

    static private final SubLString $$$In = makeString("In");

    static private final SubLString $$$In_Thesaurus = makeString("In Thesaurus");

    private static final SubLSymbol TM_TOKENIZER_TEST_1 = makeSymbol("TM-TOKENIZER-TEST-1");

    static private final SubLString $str_alt365$__ = makeString(" :");

    public static final SubLObject $$EverythingPSC = constant_handles.reader_make_constant_shell(makeString("EverythingPSC"));

    static private final SubLList $list_alt368 = list(constant_handles.reader_make_constant_shell(makeString("defnIff")), constant_handles.reader_make_constant_shell(makeString("defnSufficient")));

    private static final SubLSymbol $UNKNOWN_RELATION = makeKeyword("UNKNOWN-RELATION");

    private static final SubLSymbol $UNKNOWN_TERM = makeKeyword("UNKNOWN-TERM");

    static private final SubLList $list_alt371 = list(list(makeSymbol("RELATION"), makeSymbol("&REST"), makeSymbol("ARGS")), makeSymbol("MT"));

    static private final SubLList $list_alt372 = list(list(makeSymbol("RELATION2"), makeSymbol("&REST"), makeSymbol("ARGS2")), makeSymbol("MT2"));

    private static final SubLSymbol TM_HANDLE_EDIT_RECORD = makeSymbol("TM-HANDLE-EDIT-RECORD");

    static private final SubLString $$$Delete_Term = makeString("Delete Term");

    static private final SubLString $str_alt375$tm_delete_term = makeString("tm-delete-term");

    static private final SubLString $str_alt376$tm_handle_delete_term = makeString("tm-handle-delete-term");

    static private final SubLString $str_alt377$Delete_Term_ = makeString("Delete Term:");

    static private final SubLString $str_alt378$delete_term = makeString("delete-term");

    static private final SubLString $str_alt379$In_Thesauri__ = makeString("In Thesauri: ");

    static private final SubLString $str_alt380$how_much = makeString("how-much");

    static private final SubLString $str_alt381$_splice_out = makeString(":splice-out");

    static private final SubLString $str_alt382$Delete_term_only_ = makeString("Delete term only.");

    static private final SubLString $str_alt383$_nuke = makeString(":nuke");

    static private final SubLString $str_alt384$Delete_term_and_all_dependent_nar = makeString("Delete term and all dependent narrower terms.");

    static private final SubLString $$$Delete = makeString("Delete");

    private static final SubLSymbol TM_DELETE_TERM = makeSymbol("TM-DELETE-TERM");

    static private final SubLString $str_alt387$No_term_to_delete_was_specified_ = makeString("No term to delete was specified.");

    private static final SubLSymbol TM_HANDLE_DELETE_TERM = makeSymbol("TM-HANDLE-DELETE-TERM");

    static private final SubLString $str_alt389$Operation_DELETE_TERM__A = makeString("Operation DELETE TERM ~A");

    static private final SubLString $str_alt390$tm_handle_verify_delete_term = makeString("tm-handle-verify-delete-term");

    static private final SubLString $str_alt391$The_following_operations_can_be_a = makeString("The following operations can be attempted:");

    static private final SubLString $str_alt392$Thesaurus__A = makeString("Thesaurus ~A");

    static private final SubLString $str_alt393$__A__is_a_top_term___ = makeString("`~A' is a top term.  ");

    private static final SubLSymbol $TM_NOT_BT_NOT_TOP = makeKeyword("TM-NOT-BT-NOT-TOP");

    private static final SubLSymbol $TM_DO_NOT_USE_INTEGRITY_MODULE = makeKeyword("TM-DO-NOT-USE-INTEGRITY-MODULE");

    static private final SubLString $str_alt396$Its_narrower_terms_will_be_left_w = makeString("Its narrower terms will be left without a top term.");

    static private final SubLString $str_alt397$Its_narrower_terms_will_become_to = makeString("Its narrower terms will become top terms.");

    static private final SubLString $str_alt398$__A__USE___A______A__will_be_dele = makeString("`~A' USE `~A'.  `~A' will be deleted.");

    static private final SubLString $str_alt399$The_following_narrower_terms_will = makeString("The following narrower terms will also be deleted:");

    static private final SubLString $str_alt400$There_are_no_dependent_narrower_t = makeString("There are no dependent narrower terms.");

    static private final SubLString $str_alt401$_Perform_operation = makeString(" Perform operation");

    private static final SubLSymbol TM_HANDLE_VERIFY_DELETE_TERM = makeSymbol("TM-HANDLE-VERIFY-DELETE-TERM");

    static private final SubLString $$$Delete_Term_Results = makeString("Delete Term Results");

    static private final SubLString $str_alt404$really_delete_term = makeString("really-delete-term");

    static private final SubLString $$$Add_New_Term = makeString("Add New Term");

    static private final SubLString $str_alt406$tm_add_term = makeString("tm-add-term");

    static private final SubLString $str_alt407$tm_handle_add_term = makeString("tm-handle-add-term");

    static private final SubLString $str_alt408$Add_New_Preferred_Term_ = makeString("Add New Preferred Term:");

    static private final SubLString $$$name = makeString("name");

    static private final SubLString $str_alt410$Choose_Thesauri_for_Term_ = makeString("Choose Thesauri for Term:");

    static private final SubLString $str_alt411$Enter_Broader_Terms__each_on_sepa = makeString("Enter Broader Terms (each on separate line) for Term:");

    static private final SubLString $str_alt412$Don_t_enter_BTs_if_the_term_will_ = makeString("Don't enter BTs if the term will be a top term.");

    static private final SubLString $$$broaders = makeString("broaders");

    static private final SubLString $$$Add = makeString("Add");

    private static final SubLSymbol TM_ADD_TERM = makeSymbol("TM-ADD-TERM");

    static private final SubLString $str_alt418$No_term_was_specified_ = makeString("No term was specified.");

    private static final SubLSymbol CANONICALIZE_LEXICAL_TERM = makeSymbol("CANONICALIZE-LEXICAL-TERM");

    static private final SubLString $str_alt420$A_Term_Cannot_be_a_Broader_Term_o = makeString("A Term Cannot be a Broader Term of Itself.");

    private static final SubLSymbol TM_HANDLE_ADD_TERM = makeSymbol("TM-HANDLE-ADD-TERM");

    static private final SubLString $str_alt422$Operation_ADD_TERM___A_ = makeString("Operation ADD TERM `~A'");

    static private final SubLString $str_alt423$tm_handle_verify_add_term = makeString("tm-handle-verify-add-term");

    static private final SubLList $list_alt424 = list(makeSymbol("TERM"), list(makeSymbol("GENSYMMED-CONCEPT"), makeSymbol("&REST"), makeSymbol("MORE-CONCEPTS")), makeSymbol("BROADER-TERMS"));

    static private final SubLString $str_alt425$Select_a_concept_to_use_ = makeString("Select a concept to use.");

    static private final SubLString $str_alt426$_Use_the_same_concept_as_ = makeString(" Use the same concept as ");

    static private final SubLString $str_alt427$__Cyc_term_ = makeString(" [Cyc term ");

    static private final SubLString $str_alt428$_Create_a_separate_concept_for___ = makeString(" Create a separate concept for `~A'.");

    static private final SubLString $$$nil = makeString("nil");

    static private final SubLString $str_alt430$_Ignore_operation_in_this_thesaur = makeString(" Ignore operation in this thesaurus.");

    static private final SubLString $str_alt431$Note___A__A_in__A_ = makeString("Note: ~A ~A in ~A.");

    static private final SubLString $str_alt432$_are_not_preferred_terms = makeString(" are not preferred terms");

    static private final SubLString $str_alt433$_is_not_a_preferred_term = makeString(" is not a preferred term");

    static private final SubLString $str_alt434$_D_top = makeString("~D-top");

    static private final SubLString $$$t = makeString("t");

    static private final SubLString $str_alt436$_Make___A__a_top_term_in__A_ = makeString(" Make `~A' a top term in ~A.");

    static private final SubLList $list_alt437 = list(makeSymbol("TERM"), makeSymbol("CONCEPTS"), makeSymbol("BROADER-TERMS"));

    static private final SubLString $str_alt438$_A_top = makeString("~A-top");

    static private final SubLString $str_alt439$ADD___a__as_a_top_term_in__a = makeString("ADD `~a' as a top term in ~a");

    static private final SubLString $str_alt440$Some_operation_was_not_found__hen = makeString("Some operation was not found, hence you probably resubmitted a previously-submitted page.  Please start the operation over from the beginning if your operation appears not to have been done.");

    private static final SubLSymbol TM_HANDLE_VERIFY_ADD_TERM = makeSymbol("TM-HANDLE-VERIFY-ADD-TERM");

    static private final SubLString $str_alt442$really_add_term = makeString("really-add-term");

    static private final SubLString $$$id = makeString("id");

    static private final SubLString $str_alt444$Description_of_the_Cyc_concept___ = makeString("Description of the Cyc concept: ~A");

    static private final SubLString $str_alt445$tm_concept_description = makeString("tm-concept-description");

    static private final SubLString $str_alt446$No_description_was_found_ = makeString("No description was found.");

    static private final SubLString $str_alt447$No_concept_found_for_ID__A_ = makeString("No concept found for ID ~A.");

    private static final SubLSymbol TM_CONCEPT_DESCRIPTION = makeSymbol("TM-CONCEPT-DESCRIPTION");

    static private final SubLString $$$Rename_Term = makeString("Rename Term");

    static private final SubLString $str_alt450$tm_rename_term = makeString("tm-rename-term");

    static private final SubLString $str_alt451$tm_handle_rename_term = makeString("tm-handle-rename-term");

    static private final SubLString $str_alt452$Enter_Term_to_Rename__ = makeString("Enter Term to Rename: ");

    static private final SubLString $str_alt453$Enter_New_Name__ = makeString("Enter New Name: ");

    static private final SubLString $str_alt454$new_string = makeString("new-string");

    static private final SubLString $str_alt455$Select_Thesauri_ = makeString("Select Thesauri:");

    static private final SubLString $$$Rename = makeString("Rename");

    private static final SubLSymbol TM_RENAME_TERM = makeSymbol("TM-RENAME-TERM");

    static private final SubLString $str_alt458$Rename_Term__You_must_specify_a_t = makeString("Rename Term: You must specify a term to rename.");

    static private final SubLString $str_alt459$Rename_Term__You_must_enter_a_new = makeString("Rename Term: You must enter a new name for the term.");

    static private final SubLString $str_alt460$Rename_Term__You_must_choose_thes = makeString("Rename Term: You must choose thesauri in which to do the rename.");

    static private final SubLString $$$No_Changes_to_Perform = makeString("No Changes to Perform");

    static private final SubLString $str_alt462$No_rename_operations_were_specifi = makeString("No rename operations were specified.");

    private static final SubLSymbol TM_FULL_RECORD_INFO_MERGED = makeSymbol("TM-FULL-RECORD-INFO-MERGED");

    private static final SubLSymbol TM_HANDLE_RENAME_TERM = makeSymbol("TM-HANDLE-RENAME-TERM");

    static private final SubLString $$$Create_New_Thesaurus = makeString("Create New Thesaurus");

    static private final SubLString $str_alt466$tm_create_thesaurus = makeString("tm-create-thesaurus");

    static private final SubLString $str_alt467$tm_handle_create_thesaurus = makeString("tm-handle-create-thesaurus");

    static private final SubLString $str_alt468$Enter_name_for_new_thesaurus_ = makeString("Enter name for new thesaurus:");

    public static final SubLInteger $int$30 = makeInteger(30);

    static private final SubLString $str_alt470$Enter_an_abbreviation_for_it_ = makeString("Enter an abbreviation for it:");

    static private final SubLString $$$abbrev = makeString("abbrev");

    static private final SubLString $$$Create = makeString("Create");

    private static final SubLSymbol TM_CREATE_THESAURUS = makeSymbol("TM-CREATE-THESAURUS");

    static private final SubLString $str_alt474$_s_was_not_a_valid_name = makeString("~s was not a valid name");

    static private final SubLString $str_alt475$Please_enter_a_name_for_the_thesa = makeString("Please enter a name for the thesaurus.");

    static private final SubLString $str_alt476$_s_was_not_a_valid_abbreviation_ = makeString("~s was not a valid abbreviation.");

    static private final SubLString $str_alt477$Please_enter_an_abbreviation_to_u = makeString("Please enter an abbreviation to use for the thesaurus.");

    static private final SubLString $str_alt478$The_name_or_abbreviation__s_is_al = makeString("The name or abbreviation ~s is already in use.");

    static private final SubLString $str_alt479$Thesaurus__A_Created = makeString("Thesaurus ~A Created");

    private static final SubLSymbol TM_HANDLE_CREATE_THESAURUS = makeSymbol("TM-HANDLE-CREATE-THESAURUS");

    static private final SubLString $$$Rename_Thesaurus = makeString("Rename Thesaurus");

    static private final SubLString $str_alt482$tm_rename_thesaurus = makeString("tm-rename-thesaurus");

    static private final SubLString $str_alt483$tm_handle_rename_thesaurus = makeString("tm-handle-rename-thesaurus");

    static private final SubLString $str_alt484$Select_Thesaurus_to_Rename__ = makeString("Select Thesaurus to Rename: ");

    static private final SubLString $str_alt485$Enter_a_new_name__or_a_new_abbrev = makeString("Enter a new name, or a new abbreviation, or both.");

    static private final SubLString $str_alt486$new_name = makeString("new-name");

    static private final SubLString $str_alt487$Enter_New_Abbreviation__ = makeString("Enter New Abbreviation: ");

    static private final SubLString $str_alt488$new_abbrev = makeString("new-abbrev");

    private static final SubLSymbol TM_RENAME_THESAURUS = makeSymbol("TM-RENAME-THESAURUS");

    static private final SubLString $str_alt490$Rename_Thesaurus__No_thesaurus_wa = makeString("Rename Thesaurus: No thesaurus was specified.");

    static private final SubLString $str_alt491$Rename_Thesaurus__You_must_give_e = makeString("Rename Thesaurus: You must give either a new name, a new abbreviation, or both.");

    static private final SubLString $str_alt492$_S_is_not_a_valid_thesaurus_name_ = makeString("~S is not a valid thesaurus name.");

    static private final SubLString $str_alt493$_S_is_not_a_valid_abbreviation_ = makeString("~S is not a valid abbreviation.");

    static private final SubLString $str_alt494$Implementation_Error__No_thesauru = makeString("Implementation Error: No thesaurus could be determined from '~a'");

    private static final SubLSymbol TM_THESAURUS_INFO_SECTION = makeSymbol("TM-THESAURUS-INFO-SECTION");

    private static final SubLSymbol TM_HANDLE_RENAME_THESAURUS = makeSymbol("TM-HANDLE-RENAME-THESAURUS");

    static private final SubLString $$$Delete_Thesaurus = makeString("Delete Thesaurus");

    static private final SubLString $str_alt498$tm_delete_thesaurus = makeString("tm-delete-thesaurus");

    static private final SubLString $str_alt499$tm_handle_delete_thesaurus = makeString("tm-handle-delete-thesaurus");

    static private final SubLString $str_alt500$Choose_a_Thesaurus_to_Delete_ = makeString("Choose a Thesaurus to Delete:");

    static private final SubLString $str_alt501$Warning__All_data_in_this_thesaur = makeString("Warning: All data in this thesaurus will be destroyed.");

    private static final SubLSymbol TM_DELETE_THESAURUS = makeSymbol("TM-DELETE-THESAURUS");

    static private final SubLString $str_alt503$_A_is_not_a_known_thesaurus_ = makeString("~A is not a known thesaurus.");

    static private final SubLString $str_alt504$Sorry___A_is_currently_involved_i = makeString("Sorry, ~A is currently involved in a background task so can't be deleted");

    static private final SubLString $str_alt505$Confirm__Delete__a_ = makeString("Confirm: Delete ~a?");

    static private final SubLString $str_alt506$Do_you_really_want_to_delete__a_ = makeString("Do you really want to delete ~a?");

    static private final SubLString $str_alt507$If_so__all_data_in__a_will_be_los = makeString("If so, all data in ~a will be lost.");

    static private final SubLString $str_alt508$Proceed_ = makeString("Proceed?");

    static private final SubLString $str_alt509$tm_really_handle_delete_thesaurus = makeString("tm-really-handle-delete-thesaurus");

    static private final SubLString $$$OK = makeString("OK");

    private static final SubLSymbol TM_HANDLE_DELETE_THESAURUS = makeSymbol("TM-HANDLE-DELETE-THESAURUS");

    static private final SubLString $str_alt512$Delete_thesaurus__a = makeString("Delete thesaurus ~a");

    static private final SubLList $list_alt513 = list(makeKeyword("ADMIN"));

    static private final SubLString $str_alt514$Delete__A_Thesaurus = makeString("Delete ~A Thesaurus");

    static private final SubLString $str_alt515$Deletion_of_thesaurus_ = makeString("Deletion of thesaurus ");

    static private final SubLString $str_alt516$_is_not_permitted_at_this_time__b = makeString(" is not permitted at this time, because it is currently involved in another operation.  Please try again later.");

    static private final SubLString $$$Deletion_Not_Performed = makeString("Deletion Not Performed");

    private static final SubLSymbol TM_REALLY_HANDLE_DELETE_THESAURUS = makeSymbol("TM-REALLY-HANDLE-DELETE-THESAURUS");

    private static final SubLSymbol $COPY_THESAURUS = makeKeyword("COPY-THESAURUS");

    private static final SubLSymbol TM_COPY_THESAURUS_SUBSET_WRAPPER = makeSymbol("TM-COPY-THESAURUS-SUBSET-WRAPPER");

    static private final SubLString $str_alt521$Copy_thesaurus__a_to_thesaurus__a = makeString("Copy thesaurus ~a to thesaurus ~a");

    static private final SubLString $$$SUCCESS = makeString("SUCCESS");

    static private final SubLString $$$INCOMPLETE = makeString("INCOMPLETE");

    static private final SubLString $$$Copy_Thesaurus = makeString("Copy Thesaurus");

    static private final SubLString $str_alt525$tm_copy_thesaurus = makeString("tm-copy-thesaurus");

    static private final SubLString $str_alt526$tm_handle_copy_thesaurus = makeString("tm-handle-copy-thesaurus");

    static private final SubLString $$$Required_parameters = makeString("Required parameters");

    static private final SubLString $str_alt528$Choose_Source_Thesaurus_ = makeString("Choose Source Thesaurus:");

    static private final SubLString $str_alt529$Choose_Target_Thesaurus_ = makeString("Choose Target Thesaurus:");

    static private final SubLString $str_alt530$source_thesaurus = makeString("source-thesaurus");

    static private final SubLString $str_alt531$target_thesaurus = makeString("target-thesaurus");

    static private final SubLString $$$Copy = makeString("Copy");

    static private final SubLString $$$Optional_parameters = makeString("Optional parameters");

    static private final SubLString $$$log = makeString("log");

    static private final SubLString $str_alt535$Log_skipped_facts_in_file_ = makeString("Log skipped facts in file:");

    static private final SubLString $$$logfile = makeString("logfile");

    static private final SubLString $str_alt537$Enter_start_terms__each_on_a_sepa = makeString("Enter start-terms, each on a separate line.");

    static private final SubLString $str_alt538$Material_copied_will_include_thes = makeString("Material copied will include these terms and all their narrower terms.  ");

    static private final SubLString $str_alt539$If_no_start_terms_are_specified__ = makeString("If no start-terms are specified, the copy will start at the tops of the source thesaurus.");

    static private final SubLString $str_alt540$start_terms = makeString("start-terms");

    static private final SubLString $str_alt541$Enter_BT_in_the_target_thesaurus_ = makeString("Enter BT in the target thesaurus.");

    static private final SubLString $str_alt542$All_start_terms__or__if_none_are_ = makeString(
	    "All start-terms, or, if none are given, all tops in the source thesaurus, will get this term from the target thesaurus as a BT.  If no target BT is specified, copied terms that end up without BTs will be made tops of the target thesaurus.");

    static private final SubLString $str_alt543$target_bt = makeString("target-bt");

    static private final SubLString $str_alt544$Restrict_material_copied_to_a_spe = makeString("Restrict material copied to a specific number of levels down from the starting term(s):  ");

    static private final SubLString $str_alt545$num_levels = makeString("num-levels");

    static private final SubLString $str_alt546$Only_copy_terms_broader_than__and = makeString("Only copy terms broader than (and including) these cutoff-terms:");

    static private final SubLString $str_alt547$_Enter_cutoff_terms__each_on_a_se = makeString("(Enter cutoff-terms, each on a separate line.");

    static private final SubLString $str_alt548$Material_copied_will_not_include_ = makeString("Material copied will not include any narrower terms of these.)");

    static private final SubLString $str_alt549$stop_terms = makeString("stop-terms");

    private static final SubLSymbol TM_COPY_THESAURUS = makeSymbol("TM-COPY-THESAURUS");

    static private final SubLString $str_alt551$Copy_Thesaurus__You_must_choose_a = makeString("Copy Thesaurus: You must choose a thesaurus as source for the copy.");

    static private final SubLString $str_alt552$Copy_Thesaurus__You_must_choose_a = makeString("Copy Thesaurus: You must choose a thesaurus as target to copy to.");

    static private final SubLString $str_alt553$Copy_Thesaurus__The_source_and_ta = makeString("Copy Thesaurus: The source and target thesauri should be different.");

    static private final SubLString $str_alt554$Copy_Thesaurus___S_is_not_a_known = makeString("Copy Thesaurus: ~S is not a known thesaurus name");

    static private final SubLString $str_alt555$Copy_Thesaurus__If_logging_is_ena = makeString("Copy Thesaurus: If logging is enabled, you must provide a non-empty filename.");

    static private final SubLString $str_alt556$Configuration_error___Directory_f = makeString("Configuration error.  Directory for writing log file not valid.");

    static private final SubLString $str_alt557$_A_has_multiple_preferred_term_st = makeString("~A has multiple preferred term statements in ~A.  Integrity-check this term to fix.");

    static private final SubLString $str_alt558$Invalid_start_term___S_is_not_a_p = makeString("Invalid start-term: ~S is not a preferred term in ~A.");

    static private final SubLString $str_alt559$Invalid_target_BT___S_is_not_a_pr = makeString("Invalid target BT: ~S is not a preferred term in ~A.");

    static private final SubLString $str_alt560$Invalid_cutoff_term___S_is_not_a_ = makeString("Invalid cutoff-term: ~S is not a preferred term in ~A.");

    static private final SubLString $str_alt561$_A_is_not_a_valid_number_of_level = makeString("~A is not a valid number of levels.");

    static private final SubLString $$$Copy_Thesaurus_Started = makeString("Copy Thesaurus Started");

    static private final SubLString $str_alt563$Copying__A_to__A_ = makeString("Copying ~A to ~A.");

    static private final SubLString $str_alt564$Click_on_the_Status_button_in_the = makeString("Click on the Status button in the heading to check the status of the copy.");

    static private final SubLString $str_alt565$Copying_to_thesaurus_ = makeString("Copying to thesaurus ");

    static private final SubLString $str_alt566$_is_not_permitted_at_this_time__b = makeString(" is not permitted at this time, because it is involved in some other operation.  Please try again later.");

    static private final SubLString $$$Copy_Not_Started = makeString("Copy Not Started");

    static private final SubLString $str_alt568$Copying_from_thesaurus_ = makeString("Copying from thesaurus ");

    static private final SubLString $str_alt569$_is_not_permitted_at_this_time__b = makeString(" is not permitted at this time, because it is involved in some edit operation.  Please try again later.");

    private static final SubLSymbol TM_HANDLE_COPY_THESAURUS = makeSymbol("TM-HANDLE-COPY-THESAURUS");

    static private final SubLString $$$Convert_PTs_to_UFs = makeString("Convert PTs to UFs");

    static private final SubLString $str_alt572$tm_convert_pt_uf = makeString("tm-convert-pt-uf");

    static private final SubLString $str_alt573$tm_handle_convert_pt_uf = makeString("tm-handle-convert-pt-uf");

    static private final SubLString $str_alt574$All_the_dependent_narrower_terms_ = makeString(
	    "All the dependent narrower-terms of the chosen term will be converted\n      into use-fors.  Their existing use-fors will be retained, and made use-fors of the \n      chosen term.  However, all other information about the narrower terms will be lost in \n      the specified thesauri.");

    static private final SubLString $str_alt575$Enter_a_term_whose_narrower_terms = makeString("Enter a term whose narrower terms should be converted:");

    static private final SubLString $str_alt576$Choose_Thesauri_ = makeString("Choose Thesauri:");

    static private final SubLString $$$Start_Conversion = makeString("Start Conversion");

    private static final SubLSymbol TM_CONVERT_PT_UF = makeSymbol("TM-CONVERT-PT-UF");

    static private final SubLString $str_alt579$_A_is_not_a_valid_term = makeString("~A is not a valid term");

    static private final SubLString $str_alt580$You_must_choose_at_least_one_thes = makeString("You must choose at least one thesaurus.");

    private static final SubLSymbol THESAURUS_CONSTANT_FROM_NAME = makeSymbol("THESAURUS-CONSTANT-FROM-NAME");

    private static final SubLSymbol TM_HANDLE_CONVERT_PT_UF = makeSymbol("TM-HANDLE-CONVERT-PT-UF");

    static private final SubLString $$$Verify_Convert_PTs_to_UFs = makeString("Verify Convert PTs to UFs");

    static private final SubLString $str_alt584$Operation_CONVERT_dependent_NTs_o = makeString("Operation CONVERT dependent NTs of `~A' to UFs: ");

    static private final SubLString $str_alt585$The_following_operations_can_be_a = makeString("The following operations can be attempted: ");

    static private final SubLString $str_alt586$tm_handle_verify_convert_pt_uf = makeString("tm-handle-verify-convert-pt-uf");

    static private final SubLString $str_alt587$_S_USE___A___therefore__NTs_of___ = makeString("~S USE `~A'; therefore, NTs of `~a' will be converted.");

    static private final SubLString $str_alt588$The_following_NTs_will_be_convert = makeString("The following NTs will be converted to UFs of `~A': ");

    static private final SubLString $str_alt589$The_following_UFs_will_become_UFs = makeString("The following UFs will become UFs of `~A': ");

    static private final SubLString $$$Convert = makeString("Convert");

    private static final SubLSymbol TM_HANDLE_VERIFY_CONVERT_PT_UF = makeSymbol("TM-HANDLE-VERIFY-CONVERT-PT-UF");

    static private final SubLString $$$Promote_UF_to_PT = makeString("Promote UF to PT");

    static private final SubLString $str_alt593$tm_promote_uf_pt = makeString("tm-promote-uf-pt");

    static private final SubLString $str_alt594$tm_handle_promote_uf_pt = makeString("tm-handle-promote-uf-pt");

    static private final SubLString $str_alt595$This_facility_promotes_a_use_for_ = makeString("This facility promotes a use-for to a preferred term, making it a\n        narrower-term of the term it was once a use-for of, and records the date of \n        the change.");

    static private final SubLString $str_alt596$Enter_a_Use_For_to_Promote__ = makeString("Enter a Use-For to Promote: ");

    static private final SubLString $str_alt597$usef_for = makeString("usef-for");

    static private final SubLString $$$Promote = makeString("Promote");

    private static final SubLSymbol TM_PROMOTE_UF_PT = makeSymbol("TM-PROMOTE-UF-PT");

    static private final SubLString $str_alt600$This_facility_is_not_yet_supporte = makeString("This facility is not yet supported.");

    private static final SubLSymbol TM_HANDLE_PROMOTE_UF_PT = makeSymbol("TM-HANDLE-PROMOTE-UF-PT");

    static private final SubLString $str_alt602$Implementation_error___A_is_not_a = makeString("Implementation error: ~A is not a concept id");

    static private final SubLString $str_alt603$Implementation_error___A_is_not_a = makeString("Implementation error: ~A is not a thesaurus id");

    static private final SubLString $str_alt604$Implementation_error___A_didn_t_y = makeString("Implementation error: ~A didn't yield a concept.");

    static private final SubLString $str_alt605$Implementation_error___A_didn_t_y = makeString("Implementation error: ~A didn't yield a thesaurus.");

    private static final SubLSymbol TM_SWAP_PT_UF = makeSymbol("TM-SWAP-PT-UF");

    static private final SubLString $str_alt607$Swap___A__with_some_UF_in__A = makeString("Swap `~A' with some UF in ~A");

    static private final SubLString $str_alt608$tm_swap_pt_uf_choices = makeString("tm-swap-pt-uf-choices");

    static private final SubLString $str_alt609$tm_handle_swap_pt_uf = makeString("tm-handle-swap-pt-uf");

    static private final SubLString $$$concept = makeString("concept");

    static private final SubLString $$$pt = makeString("pt");

    static private final SubLString $str_alt612$Choose_a_UF_to_swap_with___A__in_ = makeString("Choose a UF to swap with `~A' in ~A:");

    static private final SubLString $$$uf = makeString("uf");

    static private final SubLString $str_alt614$___A = makeString("  ~A");

    static private final SubLString $$$Swap = makeString("Swap");

    static private final SubLString $str_alt616$Implementation_error__Couldn_t_de = makeString("Implementation error: Couldn't determine thesaurus concept from ~A");

    static private final SubLString $str_alt617$Implementation_error__Couldn_t_de = makeString("Implementation error: Couldn't determine thesaurus from ~A");

    static private final SubLString $str_alt618$You_must_choose_a_UF_to_swap_with = makeString("You must choose a UF to swap with.");

    static private final SubLString $$$Swap_PT_with_UF = makeString("Swap PT with UF");

    private static final SubLSymbol TM_HANDLE_SWAP_PT_UF = makeSymbol("TM-HANDLE-SWAP-PT-UF");

    private static final SubLSymbol TM_IMPORT_UFS = makeSymbol("TM-IMPORT-UFS");

    static private final SubLString $str_alt622$Import_UFs_to___A__in__A = makeString("Import UFs to `~A' in ~A");

    static private final SubLString $str_alt623$tm_import_uf_choices = makeString("tm-import-uf-choices");

    static private final SubLString $str_alt624$tm_handle_import_ufs = makeString("tm-handle-import-ufs");

    static private final SubLString $str_alt625$Select_one_or_more_UFs_to_add_to_ = makeString("Select one or more UFs to add to `~A' in ~A.");

    static private final SubLString $str_alt626$Import_from__A_ = makeString("Import from ~A:");

    static private final SubLString $str_alt627$_A___Can_t_add_because_it_s_alrea = makeString("~A : Can't add because it's already preferred.");

    static private final SubLString $$$Import = makeString("Import");

    static private final SubLString $str_alt629$No_use_fors_were_found_to_add_to_ = makeString("No use-fors were found to add to `~A'.");

    static private final SubLString $str_alt630$Implementation_error__Can_t_deter = makeString("Implementation error: Can't determine a thesaurus from ~A");

    static private final SubLString $str_alt631$You_did_not_specify_any_use_fors_ = makeString("You did not specify any use-fors to import.");

    static private final SubLString $$$Import_UFs = makeString("Import UFs");

    private static final SubLSymbol TM_HANDLE_IMPORT_UFS = makeSymbol("TM-HANDLE-IMPORT-UFS");

    // // Initializers
    @Override
    public void declareFunctions() {
	declare_html_tm_editing_file();
    }

    @Override
    public void initializeVariables() {
	init_html_tm_editing_file();
    }

    @Override
    public void runTopLevelForms() {
	setup_html_tm_editing_file();
    }
}
