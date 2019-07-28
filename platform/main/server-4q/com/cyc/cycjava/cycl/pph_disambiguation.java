package com.cyc.cycjava.cycl;


import com.cyc.cycjava.cycl.pph_disambiguation;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.StreamsLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

import static com.cyc.cycjava.cycl.access_macros.*;
import static com.cyc.cycjava.cycl.constant_handles.*;
import static com.cyc.cycjava.cycl.kb_indexing_datastructures.*;
import static com.cyc.cycjava.cycl.pph_disambiguation.*;
import static com.cyc.cycjava.cycl.utilities_macros.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.EQUAL;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.EQUALP;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.NIL;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.ONE_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.T;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.THREE_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.TWO_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.UNPROVIDED;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.ZERO_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.*;
import static com.cyc.tool.subl.util.SubLFiles.*;
import static com.cyc.tool.subl.util.SubLTranslatedFile.*;


public final class pph_disambiguation extends SubLTranslatedFile {
    public static final SubLFile me = new pph_disambiguation();

    public static final String myName = "com.cyc.cycjava.cycl.pph_disambiguation";

    public static final String myFingerPrint = "877785be1dc6549f0e64b3b337579ed5b2d9c14ba6ddda9ff6e06fa3a6958d61";

    // defparameter
    // Threshold for accepting a replacement for a duplicate string.
    private static final SubLSymbol $pph_disambiguation_demerit_cutoff$ = makeSymbol("*PPH-DISAMBIGUATION-DEMERIT-CUTOFF*");

    // Internal Constants
    public static final SubLList $list0 = list(list(makeSymbol("OBJECT-VAR"), makeSymbol("I"), makeSymbol("OBJECTS"), makeSymbol("ANS")), makeSymbol("&BODY"), makeSymbol("BODY"));

    public static final SubLSymbol $sym1$OUTPUT_LISTS = makeUninternedSymbol("OUTPUT-LISTS");

    public static final SubLSymbol $sym2$DUPE_INDEX_LIST = makeUninternedSymbol("DUPE-INDEX-LIST");

    public static final SubLSymbol $sym3$DUPE_INDEX_LISTS = makeUninternedSymbol("DUPE-INDEX-LISTS");

    public static final SubLSymbol $sym4$DUPE_OBJECTS = makeUninternedSymbol("DUPE-OBJECTS");

    public static final SubLSymbol $sym5$NEW_PRECISION = makeUninternedSymbol("NEW-PRECISION");

    public static final SubLSymbol $sym6$NEW_OUTPUT_LIST = makeUninternedSymbol("NEW-OUTPUT-LIST");

    public static final SubLSymbol $sym7$OLIST = makeUninternedSymbol("OLIST");

    public static final SubLSymbol $sym8$ABORT_ = makeUninternedSymbol("ABORT?");

    private static final SubLSymbol WITH_PPH_MEMOIZATION = makeSymbol("WITH-PPH-MEMOIZATION");



    private static final SubLList $list11 = list(NIL);

    private static final SubLSymbol REMEMBERING_PPH_AMBIGUOUS_STRINGS = makeSymbol("REMEMBERING-PPH-AMBIGUOUS-STRINGS");

    private static final SubLList $list13 = list(makeSymbol("PPH-DISAMBIGUATION-NOTE"), ONE_INTEGER, makeString("~&Trying default precision: ~S.~%"), list(makeSymbol("PPH-CURRENT-PRECISION")));

    private static final SubLSymbol CSOME_NUMBERED = makeSymbol("CSOME-NUMBERED");

    private static final SubLSymbol NOTE_PPH_OUTPUT_LIST_FOR_DISAMBIGUATION = makeSymbol("NOTE-PPH-OUTPUT-LIST-FOR-DISAMBIGUATION");









    private static final SubLList $list20 = list(T);

    private static final SubLList $list21 = list(makeKeyword("FAILURE"));





    private static final SubLSymbol PPH_FIND_DUPLICATES = makeSymbol("PPH-FIND-DUPLICATES");



    private static final SubLSymbol PPH_DISAMBIGUATION_NOTE = makeSymbol("PPH-DISAMBIGUATION-NOTE");

    private static final SubLString $str27$__Working_on_dupe_list___S__ = makeString("~&Working on dupe list: ~S~%");

    private static final SubLSymbol PPH_DEREFERENCE_INDEXES = makeSymbol("PPH-DEREFERENCE-INDEXES");



    private static final SubLString $str30$__Trying_to_reparaphrase__S___ = makeString("~&Trying to reparaphrase ~S.~%");

    private static final SubLSymbol PPH_PRECISION_FOR_OBJECT = makeSymbol("PPH-PRECISION-FOR-OBJECT");

    private static final SubLSymbol NEW_DEMERIT_CUTOFF = makeSymbol("NEW-DEMERIT-CUTOFF");

    private static final SubLSymbol PPH_DEMERIT_CUTOFF_FROM_OLIST = makeSymbol("PPH-DEMERIT-CUTOFF-FROM-OLIST");



    private static final SubLList $list35 = list(list(makeSymbol("PPH-CURRENT-PRECISION")));

    private static final SubLString $str36$__Trying_targeted_precision__S_fo = makeString("~&Trying targeted precision ~S for ~S");

    private static final SubLSymbol WITH_PARAPHRASE_PRECISION = makeSymbol("WITH-PARAPHRASE-PRECISION");

    private static final SubLSymbol WITH_PPH_DEMERIT_CUTOFF = makeSymbol("WITH-PPH-DEMERIT-CUTOFF");

    private static final SubLList $list39 = list(makeSymbol("NEW-DEMERIT-CUTOFF"));

    private static final SubLString $str40$__New_paraphrase_with_precision__ = makeString("~&New paraphrase with precision ~S for ~S:~% ~S");









    private static final SubLSymbol $sym45$PPH_OUTPUT_LIST__ = makeSymbol("PPH-OUTPUT-LIST-=");

    private static final SubLString $str46$__Trying_full_precision_for__S = makeString("~&Trying full precision for ~S");

    private static final SubLSymbol WITH_PRECISE_PARAPHRASE_ON = makeSymbol("WITH-PRECISE-PARAPHRASE-ON");

    private static final SubLString $str48$__New_paraphrase_with_full_precis = makeString("~&New paraphrase with full precision for ~S:~% ~S");

    private static final SubLSymbol $sym49$PPH_NEW_OLIST_BETTER_THAN_OLD_ = makeSymbol("PPH-NEW-OLIST-BETTER-THAN-OLD?");

    private static final SubLString $str50$__Changing_output_list_for__S_fro = makeString("~&Changing output-list for ~S from~% ~S to~% ~S.~%");



    private static final SubLSymbol PPH_POSSIBLY_ADD_REFERENCE_MARKER = makeSymbol("PPH-POSSIBLY-ADD-REFERENCE-MARKER");



    private static final SubLSymbol PARAPHRASE_WITH_DISAMBIGUATION_NUMBERED = makeSymbol("PARAPHRASE-WITH-DISAMBIGUATION-NUMBERED");

    private static final SubLSymbol PPH_GET_TAGLESS_STRINGS = makeSymbol("PPH-GET-TAGLESS-STRINGS");

    private static final SubLSymbol PPH_PHRASE_OUTPUT_LIST_STRING_NO_TAGS = makeSymbol("PPH-PHRASE-OUTPUT-LIST-STRING-NO-TAGS");



    private static final SubLSymbol $sym58$PPH_DUPLICATE_STRINGS_ = makeSymbol("PPH-DUPLICATE-STRINGS?");

    private static final SubLString $str59$___S_is_a_duplicate_of__S___ = makeString("~&~S is a duplicate of ~S.~%");

    private static final SubLList $list60 = list(list(makeSymbol("OBJECT-VAR"), makeSymbol("OBJECTS"), makeSymbol("ANS")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLSymbol $sym61$IGNOREME = makeUninternedSymbol("IGNOREME");



    private static final SubLObject $$Noun = reader_make_constant_shell(makeString("Noun"));

    private static final SubLObject $$Adjective = reader_make_constant_shell(makeString("Adjective"));

    private static final SubLString $str65$_PPH_error_level_ = makeString("(PPH error level ");

    private static final SubLString $str66$__ = makeString(") ");

    private static final SubLString $str67$Can_t_add_disambiguation_string__ = makeString("Can't add disambiguation string. Null category for ~S");

    private static final SubLSymbol $sym68$GEOGRAPHICAL_REGION_IN_ANY_MT_ = makeSymbol("GEOGRAPHICAL-REGION-IN-ANY-MT?");

    private static final SubLObject $$Agent_Generic = reader_make_constant_shell(makeString("Agent-Generic"));

    private static final SubLObject $$alias = reader_make_constant_shell(makeString("alias"));

    private static final SubLString $str71$__aka__ = makeString(" (aka \"");

    private static final SubLString $str72$__ = makeString("\")");









    private static final SubLString $str77$__ = makeString(" (");

    private static final SubLString $str78$_ = makeString(")");



    private static final SubLSymbol $sym80$PPH_INSTANCE_ = makeSymbol("PPH-INSTANCE?");

    private static final SubLSymbol $sym81$PPH_SPEC_ = makeSymbol("PPH-SPEC?");

    private static final SubLObject $$terseDisambiguationString = reader_make_constant_shell(makeString("terseDisambiguationString"));

    private static final SubLSymbol $sym83$_STRING = makeSymbol("?STRING");

    private static final SubLList $list84 = list(makeSymbol("?STRING"));

    private static final SubLString $str85$Can_t_disambiguate_javalist_____S = makeString("Can't disambiguate javalist:~% ~S");

    private static final SubLString $str86$Reparaphrasing____S_due_to_ambigu = makeString("Reparaphrasing~% ~S due to ambiguous string~% ~S.");

    private static final SubLString $str87$Failed_to_disambiguate__S_ = makeString("Failed to disambiguate ~S.");

    private static final SubLString $str88$Disambiguated____S___to__S = makeString("Disambiguated~% ~S~% to ~S");

    public static SubLObject paraphrase_with_disambiguation_numbered(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list0);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject object_var = NIL;
        SubLObject i = NIL;
        SubLObject objects = NIL;
        SubLObject ans = NIL;
        destructuring_bind_must_consp(current, datum, $list0);
        object_var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list0);
        i = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list0);
        objects = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list0);
        ans = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            final SubLObject output_lists = $sym1$OUTPUT_LISTS;
            final SubLObject dupe_index_list = $sym2$DUPE_INDEX_LIST;
            final SubLObject dupe_index_lists = $sym3$DUPE_INDEX_LISTS;
            final SubLObject dupe_objects = $sym4$DUPE_OBJECTS;
            final SubLObject new_precision = $sym5$NEW_PRECISION;
            final SubLObject new_output_list = $sym6$NEW_OUTPUT_LIST;
            final SubLObject olist = $sym7$OLIST;
            final SubLObject abortP = $sym8$ABORT_;
            return list(WITH_PPH_MEMOIZATION, list(CLET, list(bq_cons(output_lists, $list11), bq_cons(abortP, $list11)), list(REMEMBERING_PPH_AMBIGUOUS_STRINGS, $list13, list(CSOME_NUMBERED, list(object_var, i, objects, abortP), list(CLET, list(bq_cons(olist, append(body, NIL))), list(NOTE_PPH_OUTPUT_LIST_FOR_DISAMBIGUATION, i, olist), list(PIF, list(PPH_PHRASE_OUTPUT_LIST_P, olist), list(CPUSH, olist, output_lists), listS(CSETQ, abortP, $list20)))), list(PIF, abortP, listS(CSETQ, ans, $list21), list(PROGN, list(CSETQ, output_lists, list(NREVERSE, output_lists)), list(CLET, list(list(dupe_index_lists, list(PPH_FIND_DUPLICATES, output_lists))), list(CDOLIST, list(dupe_index_list, dupe_index_lists), list(PPH_DISAMBIGUATION_NOTE, TWO_INTEGER, $str27$__Working_on_dupe_list___S__, dupe_index_list), list(CLET, list(list(dupe_objects, list(PPH_DEREFERENCE_INDEXES, dupe_index_list, objects))), list(CDOLIST, list(i, dupe_index_list), list(CLET, list(list(object_var, list(NTH, i, objects))), list(PPH_DISAMBIGUATION_NOTE, ONE_INTEGER, $str30$__Trying_to_reparaphrase__S___, object_var), list(CLET, list(list(new_precision, list(PPH_PRECISION_FOR_OBJECT, object_var, dupe_objects)), list(NEW_DEMERIT_CUTOFF, list(PPH_DEMERIT_CUTOFF_FROM_OLIST, i, output_lists)), bq_cons(new_output_list, $list11)), list(PUNLESS, listS(EQUAL, new_precision, $list35), list(PPH_DISAMBIGUATION_NOTE, TWO_INTEGER, $str36$__Trying_targeted_precision__S_fo, new_precision, object_var), list(WITH_PARAPHRASE_PRECISION, new_precision, list(WITH_PPH_DEMERIT_CUTOFF, $list39, listS(CSETQ, new_output_list, append(body, NIL)))), list(PPH_DISAMBIGUATION_NOTE, TWO_INTEGER, $str40$__New_paraphrase_with_precision__, new_precision, object_var, new_output_list)), list(PWHEN, list(CAND, list(LISTP, new_precision), list(FIMPLIES, new_output_list, list($sym45$PPH_OUTPUT_LIST__, new_output_list, list(NTH, i, output_lists)))), list(PPH_DISAMBIGUATION_NOTE, TWO_INTEGER, $str46$__Trying_full_precision_for__S, object_var), list(WITH_PRECISE_PARAPHRASE_ON, list(WITH_PPH_DEMERIT_CUTOFF, $list39, listS(CSETQ, new_output_list, append(body, NIL)))), list(PPH_DISAMBIGUATION_NOTE, TWO_INTEGER, $str48$__New_paraphrase_with_full_precis, object_var, new_output_list)), list(PWHEN, list($sym49$PPH_NEW_OLIST_BETTER_THAN_OLD_, new_output_list, list(NTH, i, output_lists), object_var), list(PPH_DISAMBIGUATION_NOTE, ONE_INTEGER, $str50$__Changing_output_list_for__S_fro, object_var, list(NTH, i, output_lists), new_output_list), list(SET_NTH, i, output_lists, new_output_list), list(NOTE_PPH_OUTPUT_LIST_FOR_DISAMBIGUATION, i, new_output_list)))))))), list(CDOLIST, list(object_var, objects), list(PPH_POSSIBLY_ADD_REFERENCE_MARKER, object_var)), list(CSETQ, ans, list(APPEND, ans, output_lists)))))));
        }
        cdestructuring_bind_error(datum, $list0);
        return NIL;
    }

    public static SubLObject remembering_pph_ambiguous_stringsP() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return dictionary.dictionary_p(pph_vars.$pph_ambiguous_strings$.getDynamicValue(thread));
    }

    public static SubLObject make_incremental_pph_disambiguation_result(final SubLObject i, final SubLObject output_list) {
        return cons(i, output_list);
    }

    public static SubLObject incremental_pph_disambiguation_result_p(final SubLObject v_object) {
        return makeBoolean(v_object.isCons() && (NIL != subl_promotions.non_negative_integer_p(v_object.first())));
    }

    public static SubLObject incremental_pph_disambiguation_result_index(final SubLObject result) {
        return result.first();
    }

    public static SubLObject incremental_pph_disambiguation_result_output_list(final SubLObject result) {
        return copy_list(result.rest());
    }

    public static SubLObject pph_disambiguation_note(final SubLObject level, final SubLObject format_string, SubLObject arg1, SubLObject arg2, SubLObject arg3) {
        if (arg1 == UNPROVIDED) {
            arg1 = NIL;
        }
        if (arg2 == UNPROVIDED) {
            arg2 = NIL;
        }
        if (arg3 == UNPROVIDED) {
            arg3 = NIL;
        }
        if (NIL != pph_error.pph_trace_level_exceeds_minimumP(level)) {
            format_nil.force_format(T, format_string, arg1, arg2, arg3, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        return NIL;
    }

    public static SubLObject note_pph_output_list_for_disambiguation(final SubLObject i, final SubLObject output_list) {
        add_result_to_partial_results_accumulator(make_incremental_pph_disambiguation_result(i, output_list));
        return output_list;
    }

    public static SubLObject pph_demerit_cutoff_from_olist(final SubLObject index, final SubLObject output_lists) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject olist = nth(index, output_lists);
        final SubLObject ans = (NIL != string_utilities.non_empty_stringP(pph_phrase.pph_phrase_output_list_string(olist, NIL))) ? $pph_disambiguation_demerit_cutoff$.getDynamicValue(thread) : number_utilities.positive_infinity();
        return ans;
    }

    public static SubLObject pph_new_olist_better_than_oldP(final SubLObject new_output_list, final SubLObject old_output_list, final SubLObject v_term) {
        if ((NIL != pph_vars.pph_failure_is_an_option_p()) && (NIL == pph_utilities.pph_string_ok_for_termP(pph_phrase.pph_phrase_output_list_string(old_output_list, NIL), v_term))) {
            return T;
        }
        if ((new_output_list.isCons() && (NIL != string_utilities.non_empty_stringP(pph_phrase.pph_phrase_output_list_string(new_output_list, NIL)))) && (NIL == pph_output_list_E(new_output_list, old_output_list))) {
            return T;
        }
        return NIL;
    }

    public static SubLObject pph_output_list_E(final SubLObject olist1, final SubLObject olist2) {
        SubLObject equalP = NIL;
        if (NIL != list_utilities.same_length_p(olist1, olist2)) {
            SubLObject differentP = NIL;
            if (NIL == differentP) {
                SubLObject item1 = NIL;
                SubLObject item1_$1 = NIL;
                SubLObject item2 = NIL;
                SubLObject item2_$2 = NIL;
                item1 = olist1;
                item1_$1 = item1.first();
                item2 = olist2;
                item2_$2 = item2.first();
                while ((NIL == differentP) && ((NIL != item2) || (NIL != item1))) {
                    if (!pph_data_structures.pph_phrase_output_item_string(item1_$1).equal(pph_data_structures.pph_phrase_output_item_string(item2_$2))) {
                        differentP = T;
                    }
                    item1 = item1.rest();
                    item1_$1 = item1.first();
                    item2 = item2.rest();
                    item2_$2 = item2.first();
                } 
            }
            equalP = makeBoolean(NIL == differentP);
        }
        return equalP;
    }

    public static SubLObject pph_dereference_indexes(final SubLObject index_list, final SubLObject all_objects) {
        SubLObject objects = NIL;
        SubLObject cdolist_list_var = index_list;
        SubLObject index = NIL;
        index = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            objects = cons(nth(index, all_objects), objects);
            cdolist_list_var = cdolist_list_var.rest();
            index = cdolist_list_var.first();
        } 
        return nreverse(objects);
    }

    public static SubLObject pph_get_tagless_strings(final SubLObject output_lists) {
        return Mapping.mapcar(PPH_PHRASE_OUTPUT_LIST_STRING_NO_TAGS, output_lists);
    }

    public static SubLObject pph_find_duplicates(final SubLObject output_lists) {
        final SubLObject non_nils = remove(NIL, output_lists, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        SubLObject strings = Mapping.mapcar(PPH_PHRASE_OUTPUT_LIST_STRING_NO_TAGS, non_nils);
        SubLObject dupe_lists = NIL;
        final SubLObject remember_ambiguous_stringsP = remembering_pph_ambiguous_stringsP();
        SubLObject curr_string;
        SubLObject curr_index;
        SubLObject curr_dupe_indexes;
        SubLObject curr_olist;
        SubLObject curr_cycl;
        SubLObject list_var;
        SubLObject other_string;
        SubLObject offset;
        SubLObject other_olist;
        SubLObject other_cycl;
        for (curr_string = NIL, curr_index = NIL, curr_string = strings.first(), curr_index = ZERO_INTEGER; NIL != curr_string; curr_string = strings.first() , curr_index = number_utilities.f_1X(curr_index)) {
            curr_dupe_indexes = NIL;
            curr_olist = nth(curr_index, non_nils);
            curr_cycl = (NIL != list_utilities.singletonP(curr_olist)) ? pph_data_structures.pph_phrase_output_item_cycl(curr_olist.first()) : NIL;
            list_var = NIL;
            other_string = NIL;
            offset = NIL;
            list_var = strings;
            other_string = list_var.first();
            for (offset = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , other_string = list_var.first() , offset = add(ONE_INTEGER, offset)) {
                if ((offset.isPositive() && (NIL == cycl_variables.el_varP(curr_cycl))) && (NIL != pph_duplicate_stringsP(curr_string, other_string))) {
                    if (NIL != remember_ambiguous_stringsP) {
                        pph_note_ambiguous_string(curr_string, curr_cycl);
                        other_olist = nth(offset, output_lists);
                        if (NIL != list_utilities.singletonP(other_olist)) {
                            other_cycl = pph_data_structures.pph_phrase_output_item_cycl(other_olist.first());
                            pph_note_ambiguous_string(curr_string, other_cycl);
                        }
                    }
                    curr_dupe_indexes = cons(add(curr_index, offset), curr_dupe_indexes);
                }
            }
            if (NIL != curr_dupe_indexes) {
                dupe_lists = cons(cons(curr_index, nreverse(curr_dupe_indexes)), dupe_lists);
            }
            strings = strings.rest();
        }
        dupe_lists = nreverse(dupe_lists);
        return dupe_lists;
    }

    public static SubLObject pph_note_ambiguous_string(SubLObject string, SubLObject denot) {
        if (denot == UNPROVIDED) {
            denot = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        string = pph_string.pph_string_canonicalize(string);
        final SubLObject existing_known_denots = dictionary.dictionary_lookup_without_values(pph_vars.$pph_ambiguous_strings$.getDynamicValue(thread), string, NIL);
        if ((NIL != denot) && existing_known_denots.isList()) {
            dictionary_utilities.dictionary_pushnew(pph_vars.$pph_ambiguous_strings$.getDynamicValue(thread), string, denot, symbol_function(EQUAL), UNPROVIDED);
        } else
            if (NIL != denot) {
                dictionary.dictionary_enter(pph_vars.$pph_ambiguous_strings$.getDynamicValue(thread), string, list(denot));
            } else
                if (NIL == existing_known_denots) {
                    dictionary.dictionary_enter(pph_vars.$pph_ambiguous_strings$.getDynamicValue(thread), string, $DENOTS_UNKNOWN);
                }


        return pph_vars.$pph_ambiguous_strings$.getDynamicValue(thread);
    }

    public static SubLObject pph_string_ambiguous_p(final SubLObject string) {
        return list_utilities.non_empty_list_p(pph_known_denots_of_ambiguous_string(string));
    }

    public static SubLObject pph_known_denots_of_ambiguous_string(final SubLObject string) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject lookup_result = (NIL != remembering_pph_ambiguous_stringsP()) ? dictionary.dictionary_lookup_without_values(pph_vars.$pph_ambiguous_strings$.getDynamicValue(thread), pph_string.pph_string_canonicalize(string), NIL) : NIL;
        return lookup_result.isList() ? lookup_result : NIL;
    }

    public static SubLObject pph_unambiguous_string_p(final SubLObject string) {
        return makeBoolean(string.isString() && (NIL == pph_string_ambiguous_p(string)));
    }

    public static SubLObject pph_output_item_ambiguous_p(final SubLObject output_item) {
        return pph_string_ambiguous_p(pph_data_structures.pph_phrase_output_item_string(output_item));
    }

    public static SubLObject pph_duplicate_stringsP(final SubLObject string1, final SubLObject string2) {
        final SubLObject conservativeP = NIL;
        final SubLObject duplicateP = (NIL != conservativeP) ? NIL != list_utilities.greater_length_p(string2, string1) ? string_utilities.substringP(string1, string2, UNPROVIDED, UNPROVIDED, UNPROVIDED) : string_utilities.substringP(string2, string1, UNPROVIDED, UNPROVIDED, UNPROVIDED) : equal(string1, string2);
        if ((NIL != duplicateP) && (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER))) {
            format_nil.force_format(T, $str59$___S_is_a_duplicate_of__S___, string1, string2, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        return duplicateP;
    }

    public static SubLObject paraphrase_with_disambiguation(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list60);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject object_var = NIL;
        SubLObject objects = NIL;
        SubLObject ans = NIL;
        destructuring_bind_must_consp(current, datum, $list60);
        object_var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list60);
        objects = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list60);
        ans = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            final SubLObject ignoreme = $sym61$IGNOREME;
            return listS(PARAPHRASE_WITH_DISAMBIGUATION_NUMBERED, list(object_var, ignoreme, objects, ans), append(body, NIL));
        }
        cdestructuring_bind_error(datum, $list60);
        return NIL;
    }

    public static SubLObject pph_category_ok_for_parenthetical_disambiguationP(final SubLObject cat) {
        if ($ANY == cat) {
            return T;
        }
        return makeBoolean((NIL != pph_utilities.pph_genl_posP(pph_utilities.pph_pos_of_category(cat, UNPROVIDED), $$Noun, UNPROVIDED)) || (NIL != pph_utilities.pph_genl_posP(pph_utilities.pph_pos_of_category(cat, UNPROVIDED), $$Adjective, UNPROVIDED)));
    }

    public static SubLObject pph_possibly_add_disambiguation_string(final SubLObject output_item, final SubLObject category) {
        if (NIL == category) {
            final SubLObject new_format_string = cconcatenate($str65$_PPH_error_level_, new SubLObject[]{ format_nil.format_nil_s_no_copy(ONE_INTEGER), $str66$__, format_nil.format_nil_a_no_copy($str67$Can_t_add_disambiguation_string__) });
            pph_error.pph_handle_error(new_format_string, list(output_item));
        }
        final SubLObject string = pph_data_structures.pph_phrase_output_item_string(output_item);
        final SubLObject v_term = pph_data_structures.pph_phrase_output_item_cycl(output_item);
        if (NIL != pph_parenthetical_disambiguations_allowed_for_string_for_termP(string, v_term)) {
            final SubLObject other_denots = pph_denots_to_disambiguate(string, v_term, category);
            SubLObject disambiguatedP = NIL;
            if ((NIL != pph_parenthetical_disambiguation_requestedP()) || (NIL != other_denots)) {
                final SubLObject clarification_string = pph_clarification_string(v_term);
                if (clarification_string.isString()) {
                    disambiguatedP = pph_add_disambiguation_string(clarification_string, output_item);
                }
                if (NIL == disambiguatedP) {
                    final SubLObject clarification_terms = pph_clarification_terms_wrt(v_term, other_denots, UNPROVIDED);
                    if (NIL == disambiguatedP) {
                        SubLObject csome_list_var = clarification_terms;
                        SubLObject genl = NIL;
                        genl = csome_list_var.first();
                        while ((NIL == disambiguatedP) && (NIL != csome_list_var)) {
                            if (NIL == pph_bad_disambiguatorP(genl, other_denots)) {
                                disambiguatedP = pph_add_disambiguation_string(genl, output_item);
                            }
                            csome_list_var = csome_list_var.rest();
                            genl = csome_list_var.first();
                        } 
                    }
                    if ((NIL == disambiguatedP) && (NIL == list_utilities.empty_list_p(clarification_terms))) {
                        pph_add_disambiguation_string(clarification_terms.first(), output_item);
                    }
                }
            }
        }
        return output_item;
    }

    public static SubLObject pph_clarification_terms_wrt(final SubLObject v_term, final SubLObject other_denots, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = pph_vars.$pph_domain_mt$.getDynamicValue();
        }
        return clarification_terms_wrt(v_term, other_denots, THREE_INTEGER, mt);
    }

    public static SubLObject clarification_terms_wrt(final SubLObject v_term, final SubLObject other_denots, SubLObject number, SubLObject mt) {
        if (number == UNPROVIDED) {
            number = THREE_INTEGER;
        }
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        SubLObject terms = ((NIL != fort_types_interface.geographical_region_in_any_mtP(v_term)) && (NIL != clarify_region_via_superregionP(v_term, other_denots))) ? rkf_concept_clarifier.rkf_region_clarification(v_term, mt) : pph_utilities.pph_salient_generalizations(v_term, number, mt, UNPROVIDED, UNPROVIDED);
        final SubLObject number_found = length(terms);
        if (NIL == list_utilities.empty_list_p(terms)) {
            SubLObject doomed = NIL;
            SubLObject cdolist_list_var = other_denots;
            SubLObject other_denot = NIL;
            other_denot = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cdolist_list_var_$3 = terms;
                SubLObject v_term_$4 = NIL;
                v_term_$4 = cdolist_list_var_$3.first();
                while (NIL != cdolist_list_var_$3) {
                    if ((NIL != pph_utilities.pph_isaP(other_denot, v_term_$4, UNPROVIDED)) || (NIL != pph_utilities.pph_genlP(other_denot, v_term_$4, UNPROVIDED))) {
                        doomed = cons(v_term_$4, doomed);
                    }
                    cdolist_list_var_$3 = cdolist_list_var_$3.rest();
                    v_term_$4 = cdolist_list_var_$3.first();
                } 
                cdolist_list_var = cdolist_list_var.rest();
                other_denot = cdolist_list_var.first();
            } 
            cdolist_list_var = doomed;
            SubLObject v_term_$5 = NIL;
            v_term_$5 = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                terms = delete(v_term_$5, terms, symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                cdolist_list_var = cdolist_list_var.rest();
                v_term_$5 = cdolist_list_var.first();
            } 
        }
        if ((NIL != list_utilities.empty_list_p(terms)) && number_found.numGE(number)) {
            return clarification_terms_wrt(v_term, other_denots, multiply(TWO_INTEGER, number), mt);
        }
        return terms;
    }

    public static SubLObject clarify_region_via_superregionP(final SubLObject region, final SubLObject distractors) {
        final SubLObject distractor_regions = list_utilities.remove_if_not($sym68$GEOGRAPHICAL_REGION_IN_ANY_MT_, distractors, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        SubLObject ans = NIL;
        if (NIL != distractor_regions) {
            if (NIL != pph_types.pph_cityP(region)) {
                SubLObject non_city = NIL;
                if (NIL == non_city) {
                    SubLObject csome_list_var = distractor_regions;
                    SubLObject distractor_region = NIL;
                    distractor_region = csome_list_var.first();
                    while ((NIL == non_city) && (NIL != csome_list_var)) {
                        if (NIL == fort_types_interface.city_in_any_mtP(distractor_region)) {
                            non_city = distractor_region;
                        }
                        csome_list_var = csome_list_var.rest();
                        distractor_region = csome_list_var.first();
                    } 
                }
                if (NIL == non_city) {
                    ans = T;
                }
            } else
                if (NIL != fort_types_interface.country_in_any_mtP(region)) {
                    SubLObject non_country = NIL;
                    if (NIL == non_country) {
                        SubLObject csome_list_var = distractor_regions;
                        SubLObject distractor_region = NIL;
                        distractor_region = csome_list_var.first();
                        while ((NIL == non_country) && (NIL != csome_list_var)) {
                            if (NIL == fort_types_interface.country_in_any_mtP(distractor_region)) {
                                non_country = distractor_region;
                            }
                            csome_list_var = csome_list_var.rest();
                            distractor_region = csome_list_var.first();
                        } 
                    }
                    if (NIL == non_country) {
                        ans = T;
                    }
                }

        }
        return ans;
    }

    public static SubLObject pph_possibly_add_alias(final SubLObject v_term, final SubLObject string) {
        SubLObject new_string = string_utilities.copy_string(string);
        if (((((NIL != pph_utilities.pph_english_contextP(UNPROVIDED)) && (NIL != pph_parenthetical_disambiguations_allowed_at_allP())) && string.isString()) && (NIL != indexed_term_p(v_term))) && (NIL != pph_utilities.pph_isaP(v_term, $$Agent_Generic, UNPROVIDED))) {
            SubLObject alias = NIL;
            if (NIL == alias) {
                SubLObject csome_list_var;
                SubLObject alias_assertion;
                SubLObject this_alias;
                for (csome_list_var = pph_methods_lexicon.pph_lexifications_for_term(v_term, genl_predicates.all_spec_preds($$alias, UNPROVIDED, UNPROVIDED), UNPROVIDED), alias_assertion = NIL, alias_assertion = csome_list_var.first(); (NIL == alias) && (NIL != csome_list_var); this_alias = alias = assertions_high.gaf_arg2(alias_assertion) , csome_list_var = csome_list_var.rest() , alias_assertion = csome_list_var.first()) {
                }
            }
            if (alias.isString()) {
                new_string = cconcatenate(new_string, new SubLObject[]{ $str71$__aka__, alias, $str72$__ });
            }
        }
        return new_string;
    }

    public static SubLObject pph_denots_to_disambiguate(final SubLObject string, final SubLObject v_term, final SubLObject category) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject other_denots = remove(v_term, pph_known_denots_of_ambiguous_string(string), symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        if ((NIL != pph_parenthetical_disambiguations_allowed_for_string_for_termP(string, v_term)) && (NIL != pph_category_ok_for_parenthetical_disambiguationP(category))) {
            final SubLObject _prev_bind_0 = lexicon_vars.$lexicon_lookup_mt$.currentBinding(thread);
            try {
                lexicon_vars.$lexicon_lookup_mt$.bind(pph_vars.$pph_language_mt$.getDynamicValue(thread), thread);
                SubLObject cdolist_list_var = pph_utilities.pph_denots_of_string(string, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                SubLObject denot = NIL;
                denot = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    if ((!denot.equal(v_term)) && (NIL == subl_promotions.memberP(denot, other_denots, EQUAL, UNPROVIDED))) {
                        other_denots = cons(denot, other_denots);
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    denot = cdolist_list_var.first();
                } 
            } finally {
                lexicon_vars.$lexicon_lookup_mt$.rebind(_prev_bind_0, thread);
            }
        }
        return other_denots;
    }

    public static SubLObject pph_parenthetical_disambiguations_allowed_for_string_for_termP(final SubLObject string, final SubLObject v_term) {
        return makeBoolean(((NIL != pph_parenthetical_disambiguations_allowed_at_allP()) && string.isString()) && (NIL != (NIL != cycl_variables.el_varP(v_term) ? makeBoolean((NIL != pph_variable_handling.pph_var_type(v_term)) && (NIL == pph_variable_handling.pph_var_registered_as_defaultP(v_term))) : cycl_grammar.cycl_denotational_term_p(v_term))));
    }

    public static SubLObject pph_parenthetical_disambiguations_allowed_at_allP() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (pph_vars.$use_parenthetical_disambiguationsP$.getDynamicValue(thread).eql($WHEN_NECESSARY) && (NIL != pph_utilities.pph_top_level_preciseP())) {
            return T;
        }
        if (NIL != pph_parenthetical_disambiguation_requestedP()) {
            return T;
        }
        return NIL;
    }

    public static SubLObject pph_parenthetical_disambiguation_requestedP() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return makeBoolean(pph_vars.current_generation_level().numLE(ONE_INTEGER) && pph_vars.$use_parenthetical_disambiguationsP$.getDynamicValue(thread).eql($TOP_LEVEL));
    }

    public static SubLObject pph_add_disambiguation_string(final SubLObject genl, final SubLObject output_item) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject genl_paraphrase = (genl.isString()) ? genl : NIL;
        SubLObject modifiedP = NIL;
        final SubLObject _prev_bind_0 = pph_vars.$paraphrase_mode$.currentBinding(thread);
        final SubLObject _prev_bind_2 = pph_vars.$use_parenthetical_disambiguationsP$.currentBinding(thread);
        try {
            pph_vars.$paraphrase_mode$.bind($TEXT, thread);
            pph_vars.$use_parenthetical_disambiguationsP$.bind(NIL, thread);
            assert NIL != pph_utilities.pph_precision_p(NIL) : "pph_utilities.pph_precision_p(CommonSymbols.NIL) " + "CommonSymbols.NIL != pph_utilities.pph_precision_p(CommonSymbols.NIL) " + NIL;
            final SubLObject _prev_bind_0_$6 = pph_vars.$paraphrase_precision$.currentBinding(thread);
            try {
                pph_vars.$paraphrase_precision$.bind(NIL, thread);
                if ((NIL != genl) && (NIL == genl_paraphrase)) {
                    final SubLObject agr_pred = pph_data_structures.pph_phrase_output_item_agr_pred(output_item);
                    final SubLObject nl_preds = (NIL != agr_pred) ? list(agr_pred) : NIL;
                    final SubLObject _prev_bind_0_$7 = pph_vars.$pph_demerit_cutoff$.currentBinding(thread);
                    try {
                        pph_vars.$pph_demerit_cutoff$.bind(TWO_INTEGER, thread);
                        genl_paraphrase = pph_main.pph_phrase_generate_string_from_cycl(genl, nl_preds, UNPROVIDED);
                    } finally {
                        pph_vars.$pph_demerit_cutoff$.rebind(_prev_bind_0_$7, thread);
                    }
                }
            } finally {
                pph_vars.$paraphrase_precision$.rebind(_prev_bind_0_$6, thread);
            }
        } finally {
            pph_vars.$use_parenthetical_disambiguationsP$.rebind(_prev_bind_2, thread);
            pph_vars.$paraphrase_mode$.rebind(_prev_bind_0, thread);
        }
        if (genl_paraphrase.isString()) {
            final SubLObject parenthetical = cconcatenate($str77$__, new SubLObject[]{ genl_paraphrase, $str78$_ });
            if (NIL == string_utilities.substringP(parenthetical, pph_data_structures.pph_phrase_output_item_string(output_item), UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                pph_data_structures.pph_phrase_output_item_suffix_string(output_item, parenthetical);
                modifiedP = T;
            }
        }
        return modifiedP;
    }

    public static SubLObject pph_bad_disambiguatorP(final SubLObject genl, final SubLObject other_denots) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject abortP = NIL;
        if (NIL == abortP) {
            SubLObject csome_list_var = other_denots;
            SubLObject other_denot = NIL;
            other_denot = csome_list_var.first();
            while ((NIL == abortP) && (NIL != csome_list_var)) {
                if (NIL != (NIL != fort_types_interface.collection_in_any_mtP(other_denot) ? pph_utilities.pph_genlP(other_denot, genl, pph_vars.$pph_domain_mt$.getDynamicValue(thread)) : pph_utilities.pph_isaP(other_denot, genl, pph_vars.$pph_domain_mt$.getDynamicValue(thread)))) {
                    abortP = T;
                }
                csome_list_var = csome_list_var.rest();
                other_denot = csome_list_var.first();
            } 
        }
        return abortP;
    }

    public static SubLObject pph_disambiguating_generalizations(final SubLObject objects, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = pph_vars.$pph_domain_mt$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ans = NIL;
        final SubLObject _prev_bind_0 = pph_vars.$pph_domain_mt$.currentBinding(thread);
        try {
            pph_vars.$pph_domain_mt$.bind(mt, thread);
            SubLObject cdolist_list_var = objects;
            SubLObject v_object = NIL;
            v_object = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject disambiguating_generalization = NIL;
                final SubLObject all_generalizations = pph_utilities.pph_salient_generalizations(v_object, $ALL, mt, UNPROVIDED, UNPROVIDED);
                final SubLObject other_objects = remove(v_object, objects, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                if (NIL == disambiguating_generalization) {
                    SubLObject csome_list_var = all_generalizations;
                    SubLObject generalization = NIL;
                    generalization = csome_list_var.first();
                    while ((NIL == disambiguating_generalization) && (NIL != csome_list_var)) {
                        if ((NIL == find(generalization, other_objects, $sym80$PPH_INSTANCE_, UNPROVIDED, UNPROVIDED, UNPROVIDED)) && (NIL == find(generalization, other_objects, $sym81$PPH_SPEC_, UNPROVIDED, UNPROVIDED, UNPROVIDED))) {
                            disambiguating_generalization = generalization;
                        }
                        csome_list_var = csome_list_var.rest();
                        generalization = csome_list_var.first();
                    } 
                }
                if (NIL == disambiguating_generalization) {
                    disambiguating_generalization = all_generalizations.first();
                }
                ans = cons(disambiguating_generalization, ans);
                cdolist_list_var = cdolist_list_var.rest();
                v_object = cdolist_list_var.first();
            } 
            ans = nreverse(ans);
        } finally {
            pph_vars.$pph_domain_mt$.rebind(_prev_bind_0, thread);
        }
        return ans;
    }

    public static SubLObject pph_clarification_string(final SubLObject v_term) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return (NIL != forts.fort_p(v_term)) && (NIL != somewhere_cache.some_pred_assertion_somewhereP($$terseDisambiguationString, v_term, ONE_INTEGER, UNPROVIDED)) ? pph_utilities.pph_ask_variable($sym83$_STRING, listS($$terseDisambiguationString, v_term, $list84), pph_vars.$pph_language_mt$.getDynamicValue(thread), NIL, ONE_INTEGER).first() : NIL;
    }

    public static SubLObject pph_try_to_clarify_javalist(final SubLObject javalist, final SubLObject force, final SubLObject nl_preds, SubLObject language_mt, SubLObject domain_mt) {
        if (language_mt == UNPROVIDED) {
            language_mt = pph_vars.$pph_language_mt$.getDynamicValue();
        }
        if (domain_mt == UNPROVIDED) {
            domain_mt = pph_vars.$pph_domain_mt$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject string = pph_utilities.pph_javalist_string(javalist);
        final SubLObject pph_item = pph_utilities.pph_item_from_javalist(javalist);
        final SubLObject v_term = (NIL != pph_item) ? pph_data_structures.pph_phrase_output_item_cycl(pph_item) : NIL;
        final SubLObject category = pph_utilities.pph_np_category();
        if (NIL == pph_item) {
            Errors.warn($str85$Can_t_disambiguate_javalist_____S, javalist);
            return javalist;
        }
        assert NIL != pph_utilities.pph_precision_p(T) : "pph_utilities.pph_precision_p(CommonSymbols.T) " + "CommonSymbols.NIL != pph_utilities.pph_precision_p(CommonSymbols.T) " + T;
        final SubLObject _prev_bind_0 = pph_vars.$paraphrase_precision$.currentBinding(thread);
        final SubLObject _prev_bind_2 = pph_vars.$pph_ambiguous_strings$.currentBinding(thread);
        try {
            pph_vars.$paraphrase_precision$.bind(T, thread);
            pph_vars.$pph_ambiguous_strings$.bind(NIL != pph_vars.$pph_ambiguous_strings$.getDynamicValue(thread) ? pph_vars.$pph_ambiguous_strings$.getDynamicValue(thread) : dictionary.new_dictionary(symbol_function(EQUALP), UNPROVIDED), thread);
            pph_possibly_add_disambiguation_string(pph_item, category);
        } finally {
            pph_vars.$pph_ambiguous_strings$.rebind(_prev_bind_2, thread);
            pph_vars.$paraphrase_precision$.rebind(_prev_bind_0, thread);
        }
        if (NIL != pph_unambiguous_string_p(pph_data_structures.pph_phrase_output_item_string(pph_item))) {
            return pph_utilities.pph_output_list_to_javalist(list(pph_item));
        }
        if (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) {
            format_nil.force_format(T, $str86$Reparaphrasing____S_due_to_ambigu, v_term, string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        pph_note_ambiguous_string(string, v_term);
        final SubLObject new_string = pph_main.generate_text_wXsentential_force_no_checks(v_term, force, nl_preds, language_mt, domain_mt, $TEXT, UNPROVIDED);
        if (NIL == pph_unambiguous_string_p(new_string)) {
            if ((NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) && (NIL == pph_error.suppress_pph_warningsP())) {
                Errors.warn($str87$Failed_to_disambiguate__S_, v_term);
                force_output(StreamsLow.$error_output$.getDynamicValue(thread));
            }
            return javalist;
        }
        if (NIL != pph_error.pph_trace_level_exceeds_minimumP(ONE_INTEGER)) {
            format_nil.force_format(T, $str88$Disambiguated____S___to__S, v_term, new_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        return pph_utilities.new_pph_javalist(new_string, list(pph_utilities.new_pph_javalist_item(new_string, v_term, pph_data_structures.pph_phrase_output_item_arg_position(pph_item), pph_data_structures.pph_phrase_output_item_html_open_tag(pph_item), pph_data_structures.pph_phrase_output_item_html_close_tag(pph_item), ZERO_INTEGER)));
    }

    public static SubLObject declare_pph_disambiguation_file() {
        declareMacro(me, "paraphrase_with_disambiguation_numbered", "PARAPHRASE-WITH-DISAMBIGUATION-NUMBERED");
        declareFunction(me, "remembering_pph_ambiguous_stringsP", "REMEMBERING-PPH-AMBIGUOUS-STRINGS?", 0, 0, false);
        declareFunction(me, "make_incremental_pph_disambiguation_result", "MAKE-INCREMENTAL-PPH-DISAMBIGUATION-RESULT", 2, 0, false);
        declareFunction(me, "incremental_pph_disambiguation_result_p", "INCREMENTAL-PPH-DISAMBIGUATION-RESULT-P", 1, 0, false);
        declareFunction(me, "incremental_pph_disambiguation_result_index", "INCREMENTAL-PPH-DISAMBIGUATION-RESULT-INDEX", 1, 0, false);
        declareFunction(me, "incremental_pph_disambiguation_result_output_list", "INCREMENTAL-PPH-DISAMBIGUATION-RESULT-OUTPUT-LIST", 1, 0, false);
        declareFunction(me, "pph_disambiguation_note", "PPH-DISAMBIGUATION-NOTE", 2, 3, false);
        declareFunction(me, "note_pph_output_list_for_disambiguation", "NOTE-PPH-OUTPUT-LIST-FOR-DISAMBIGUATION", 2, 0, false);
        declareFunction(me, "pph_demerit_cutoff_from_olist", "PPH-DEMERIT-CUTOFF-FROM-OLIST", 2, 0, false);
        declareFunction(me, "pph_new_olist_better_than_oldP", "PPH-NEW-OLIST-BETTER-THAN-OLD?", 3, 0, false);
        declareFunction(me, "pph_output_list_E", "PPH-OUTPUT-LIST-=", 2, 0, false);
        declareFunction(me, "pph_dereference_indexes", "PPH-DEREFERENCE-INDEXES", 2, 0, false);
        declareFunction(me, "pph_get_tagless_strings", "PPH-GET-TAGLESS-STRINGS", 1, 0, false);
        declareFunction(me, "pph_find_duplicates", "PPH-FIND-DUPLICATES", 1, 0, false);
        declareFunction(me, "pph_note_ambiguous_string", "PPH-NOTE-AMBIGUOUS-STRING", 1, 1, false);
        declareFunction(me, "pph_string_ambiguous_p", "PPH-STRING-AMBIGUOUS-P", 1, 0, false);
        declareFunction(me, "pph_known_denots_of_ambiguous_string", "PPH-KNOWN-DENOTS-OF-AMBIGUOUS-STRING", 1, 0, false);
        declareFunction(me, "pph_unambiguous_string_p", "PPH-UNAMBIGUOUS-STRING-P", 1, 0, false);
        declareFunction(me, "pph_output_item_ambiguous_p", "PPH-OUTPUT-ITEM-AMBIGUOUS-P", 1, 0, false);
        declareFunction(me, "pph_duplicate_stringsP", "PPH-DUPLICATE-STRINGS?", 2, 0, false);
        declareMacro(me, "paraphrase_with_disambiguation", "PARAPHRASE-WITH-DISAMBIGUATION");
        declareFunction(me, "pph_category_ok_for_parenthetical_disambiguationP", "PPH-CATEGORY-OK-FOR-PARENTHETICAL-DISAMBIGUATION?", 1, 0, false);
        declareFunction(me, "pph_possibly_add_disambiguation_string", "PPH-POSSIBLY-ADD-DISAMBIGUATION-STRING", 2, 0, false);
        declareFunction(me, "pph_clarification_terms_wrt", "PPH-CLARIFICATION-TERMS-WRT", 2, 1, false);
        declareFunction(me, "clarification_terms_wrt", "CLARIFICATION-TERMS-WRT", 2, 2, false);
        declareFunction(me, "clarify_region_via_superregionP", "CLARIFY-REGION-VIA-SUPERREGION?", 2, 0, false);
        declareFunction(me, "pph_possibly_add_alias", "PPH-POSSIBLY-ADD-ALIAS", 2, 0, false);
        declareFunction(me, "pph_denots_to_disambiguate", "PPH-DENOTS-TO-DISAMBIGUATE", 3, 0, false);
        declareFunction(me, "pph_parenthetical_disambiguations_allowed_for_string_for_termP", "PPH-PARENTHETICAL-DISAMBIGUATIONS-ALLOWED-FOR-STRING-FOR-TERM?", 2, 0, false);
        declareFunction(me, "pph_parenthetical_disambiguations_allowed_at_allP", "PPH-PARENTHETICAL-DISAMBIGUATIONS-ALLOWED-AT-ALL?", 0, 0, false);
        declareFunction(me, "pph_parenthetical_disambiguation_requestedP", "PPH-PARENTHETICAL-DISAMBIGUATION-REQUESTED?", 0, 0, false);
        declareFunction(me, "pph_add_disambiguation_string", "PPH-ADD-DISAMBIGUATION-STRING", 2, 0, false);
        declareFunction(me, "pph_bad_disambiguatorP", "PPH-BAD-DISAMBIGUATOR?", 2, 0, false);
        declareFunction(me, "pph_disambiguating_generalizations", "PPH-DISAMBIGUATING-GENERALIZATIONS", 1, 1, false);
        declareFunction(me, "pph_clarification_string", "PPH-CLARIFICATION-STRING", 1, 0, false);
        declareFunction(me, "pph_try_to_clarify_javalist", "PPH-TRY-TO-CLARIFY-JAVALIST", 3, 2, false);
        return NIL;
    }

    public static SubLObject init_pph_disambiguation_file() {
        defparameter("*PPH-DISAMBIGUATION-DEMERIT-CUTOFF*", TWO_INTEGER);
        return NIL;
    }

    public static SubLObject setup_pph_disambiguation_file() {
        register_macro_helper(PPH_DISAMBIGUATION_NOTE, PARAPHRASE_WITH_DISAMBIGUATION_NUMBERED);
        register_macro_helper(NOTE_PPH_OUTPUT_LIST_FOR_DISAMBIGUATION, PARAPHRASE_WITH_DISAMBIGUATION_NUMBERED);
        register_macro_helper(PPH_DEMERIT_CUTOFF_FROM_OLIST, PARAPHRASE_WITH_DISAMBIGUATION_NUMBERED);
        register_macro_helper($sym49$PPH_NEW_OLIST_BETTER_THAN_OLD_, PARAPHRASE_WITH_DISAMBIGUATION_NUMBERED);
        register_macro_helper($sym45$PPH_OUTPUT_LIST__, PARAPHRASE_WITH_DISAMBIGUATION_NUMBERED);
        register_macro_helper(PPH_DEREFERENCE_INDEXES, PARAPHRASE_WITH_DISAMBIGUATION_NUMBERED);
        register_macro_helper(PPH_GET_TAGLESS_STRINGS, PARAPHRASE_WITH_DISAMBIGUATION_NUMBERED);
        register_macro_helper(PPH_FIND_DUPLICATES, PARAPHRASE_WITH_DISAMBIGUATION_NUMBERED);
        register_macro_helper($sym58$PPH_DUPLICATE_STRINGS_, PARAPHRASE_WITH_DISAMBIGUATION_NUMBERED);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_pph_disambiguation_file();
    }

    @Override
    public void initializeVariables() {
        init_pph_disambiguation_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_pph_disambiguation_file();
    }

    static {



























































































    }
}

/**
 * Total time: 226 ms
 */
