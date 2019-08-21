package com.cyc.cycjava.cycl.sbhl;


import com.cyc.cycjava.cycl.hash_table_utilities;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.sbhl.sbhl_marking_vars;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

import static com.cyc.cycjava.cycl.access_macros.*;
import static com.cyc.cycjava.cycl.constant_handles.*;
import static com.cyc.cycjava.cycl.sbhl.sbhl_marking_vars.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.EQ;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.EQUAL;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.FOUR_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.NIL;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.ONE_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.T;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.THREE_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.UNPROVIDED;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.ZERO_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.*;
import static com.cyc.tool.subl.util.SubLFiles.*;
import static com.cyc.tool.subl.util.SubLTranslatedFile.*;


public final class sbhl_marking_vars extends SubLTranslatedFile {
    public static final SubLFile me = new sbhl_marking_vars();

    public static final String myName = "com.cyc.cycjava.cycl.sbhl.sbhl_marking_vars";

    public static final String myFingerPrint = "75b882ee6eb24166b556451db44a9962f269cc0f31dbcf2363cef4689f5da977";

    // defparameter
    // Definitions
    public static final SubLSymbol $debug_sbhl_marking_spacesP$ = makeSymbol("*DEBUG-SBHL-MARKING-SPACES?*");

    // defparameter
    public static final SubLSymbol $use_zero_size_sbhl_marking_spacesP$ = makeSymbol("*USE-ZERO-SIZE-SBHL-MARKING-SPACES?*");







    // deflexical
    // The default number of spaces to resource.
    private static final SubLSymbol $default_resourced_sbhl_space_limit$ = makeSymbol("*DEFAULT-RESOURCED-SBHL-SPACE-LIMIT*");

    // defparameter
    private static final SubLSymbol $within_new_sbhl_marking_space_resource$ = makeSymbol("*WITHIN-NEW-SBHL-MARKING-SPACE-RESOURCE*");





    // defparameter
    // a context name used for marking disjoins
    public static final SubLSymbol $sbhl_disjoins_space$ = makeSymbol("*SBHL-DISJOINS-SPACE*");

    // defparameter
    // a variable to use for sbhl spaces
    public static final SubLSymbol $sbhl_space_0$ = makeSymbol("*SBHL-SPACE-0*");

    // defparameter
    // a variable to use for sbhl spaces
    public static final SubLSymbol $sbhl_space_1$ = makeSymbol("*SBHL-SPACE-1*");

    // defparameter
    // a variable to use for sbhl spaces
    public static final SubLSymbol $sbhl_space_2$ = makeSymbol("*SBHL-SPACE-2*");

    // defparameter
    // a variable to use for sbhl spaces
    public static final SubLSymbol $sbhl_space_3$ = makeSymbol("*SBHL-SPACE-3*");

    // defparameter
    // a variable to use for sbhl spaces
    public static final SubLSymbol $sbhl_space_4$ = makeSymbol("*SBHL-SPACE-4*");

    // defparameter
    // a variable to use for sbhl spaces
    public static final SubLSymbol $sbhl_space_5$ = makeSymbol("*SBHL-SPACE-5*");

    // defparameter
    // Toggle variable to suspend creation of new spaces during search.
    public static final SubLSymbol $sbhl_suspend_new_spacesP$ = makeSymbol("*SBHL-SUSPEND-NEW-SPACES?*");











    // deflexical
    // The marking for nodes only accessed in predicate mode during search
    public static final SubLSymbol $sbhl_genl_preds_marking$ = makeSymbol("*SBHL-GENL-PREDS-MARKING*");

    // deflexical
    /**
     * The marking for nodes only accessed in argument-flipped mode during search
     */
    public static final SubLSymbol $sbhl_genl_inverse_marking$ = makeSymbol("*SBHL-GENL-INVERSE-MARKING*");

    // deflexical
    /**
     * The marking for nodes accessed in both predicate argument-flipped modes and
     * during search
     */
    public static final SubLSymbol $sbhl_genl_preds_and_genl_inverse_marking$ = makeSymbol("*SBHL-GENL-PREDS-AND-GENL-INVERSE-MARKING*");

    // deflexical
    /**
     * The marking for nodes accessed in both predicate argument-flipped modes and
     * during search
     */
    public static final SubLSymbol $sbhl_genl_inverse_and_genl_preds_marking$ = makeSymbol("*SBHL-GENL-INVERSE-AND-GENL-PREDS-MARKING*");

    // defparameter
    // The current marking generation.
    public static final SubLSymbol $sbhl_marking_generation$ = makeSymbol("*SBHL-MARKING-GENERATION*");

    // defparameter
    /**
     * Toggle parameter for whether to suspend the creation of new search spaces
     * during mapping.
     */
    public static final SubLSymbol $sbhl_suspend_new_spaces_during_mappingP$ = makeSymbol("*SBHL-SUSPEND-NEW-SPACES-DURING-MAPPING?*");





    // defparameter
    /**
     * Parameter determining whether a time search checks markings in target space
     * (for searching marked nodes)
     */
    public static final SubLSymbol $sbhl_temporality_search_checks_nodes_in_target_space_p$ = makeSymbol("*SBHL-TEMPORALITY-SEARCH-CHECKS-NODES-IN-TARGET-SPACE-P*");







    private static final SubLInteger $int$3000 = makeInteger(3000);

    public static final SubLList $list2 = list(makeSymbol("SPACE"), makeSymbol("&BODY"), makeSymbol("BODY"));



    public static final SubLList $list4 = list(list(makeSymbol("GET-SBHL-MARKING-SPACE")));





    private static final SubLSymbol FREE_SBHL_MARKING_SPACE = makeSymbol("FREE-SBHL-MARKING-SPACE");

    public static final SubLList $list8 = list(makeSymbol("NUM"), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLSymbol $sym9$ALREADY_RESOURCING_P = makeUninternedSymbol("ALREADY-RESOURCING-P");

    private static final SubLList $list10 = list(makeSymbol("*RESOURCING-SBHL-MARKING-SPACES-P*"));

    public static final SubLSymbol $resourced_sbhl_marking_space_limit$ = makeSymbol("*RESOURCED-SBHL-MARKING-SPACE-LIMIT*");

    private static final SubLSymbol DETERMINE_RESOURCE_LIMIT = makeSymbol("DETERMINE-RESOURCE-LIMIT");

    public static final SubLSymbol $resourced_sbhl_marking_spaces$ = makeSymbol("*RESOURCED-SBHL-MARKING-SPACES*");

    private static final SubLSymbol POSSIBLY_NEW_MARKING_RESOURCE = makeSymbol("POSSIBLY-NEW-MARKING-RESOURCE");

    public static final SubLList $list15 = list(list(makeSymbol("*RESOURCING-SBHL-MARKING-SPACES-P*"), T));

    private static final SubLSymbol WITH_SBHL_RESOURCED_MARKING_SPACES = makeSymbol("WITH-SBHL-RESOURCED-MARKING-SPACES");

    private static final SubLList $list17 = list(list(makeSymbol("*RESOURCING-SBHL-MARKING-SPACES-P*"), NIL));

    public static final SubLList $list18 = list(makeSymbol("RESOURCING-P"), makeSymbol("&BODY"), makeSymbol("BODY"));

    public static final SubLSymbol $resourcing_sbhl_marking_spaces_p$ = makeSymbol("*RESOURCING-SBHL-MARKING-SPACES-P*");

    private static final SubLList $list20 = list(makeSymbol("SBHL-MS-RESOURCE"), makeSymbol("&BODY"), makeSymbol("BODY"));

    public static final SubLList $list21 = list(list(makeSymbol("*RESOURCING-SBHL-MARKING-SPACES-P*"), T), list(makeSymbol("*RESOURCED-SBHL-MARKING-SPACE-LIMIT*"), list(makeSymbol("DETERMINE-MARKING-SPACE-LIMIT"), makeSymbol("*RESOURCED-SBHL-MARKING-SPACES*"))));



    public static final SubLList $list23 = list(makeSymbol("*RESOURCED-SBHL-MARKING-SPACES*"));

    private static final SubLList $list24 = list(list(makeSymbol("&KEY"), makeSymbol("NUM")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLList $list25 = list(makeKeyword("NUM"));

    private static final SubLSymbol $ALLOW_OTHER_KEYS = makeKeyword("ALLOW-OTHER-KEYS");



    private static final SubLSymbol $sym28$SBHL_MS_RESOURCE = makeUninternedSymbol("SBHL-MS-RESOURCE");

    private static final SubLSymbol NEW_SBHL_MARKING_SPACE_RESOURCE = makeSymbol("NEW-SBHL-MARKING-SPACE-RESOURCE");

    private static final SubLSymbol WITH_SBHL_MARKING_SPACE_RESOURCE = makeSymbol("WITH-SBHL-MARKING-SPACE-RESOURCE");

    private static final SubLSymbol DETERMINE_MARKING_SPACE_LIMIT = makeSymbol("DETERMINE-MARKING-SPACE-LIMIT");

    private static final SubLString $str32$Dirty_resourced_marking_space_bei = makeString("Dirty resourced marking space being reused ~A!");

    private static final SubLString $str33$Have__S_more_spaces_than_the_limi = makeString("Have ~S more spaces than the limit of ~A marking spaces.");

    private static final SubLSymbol INSTANTIATE_SBHL_MARKING_SPACE_FOR = makeSymbol("INSTANTIATE-SBHL-MARKING-SPACE-FOR");

    public static final SubLSymbol $sbhl_space$ = makeSymbol("*SBHL-SPACE*");

    private static final SubLList $list36 = list(makeSymbol("NAME"), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLSymbol WITH_NEW_SBHL_SPACE = makeSymbol("WITH-NEW-SBHL-SPACE");

    private static final SubLSymbol WITH_SBHL_SPACE_VAR = makeSymbol("WITH-SBHL-SPACE-VAR");

    public static final SubLSymbol $sbhl_gather_space$ = makeSymbol("*SBHL-GATHER-SPACE*");

    private static final SubLSymbol WITH_NEW_SBHL_GATHER_SPACE = makeSymbol("WITH-NEW-SBHL-GATHER-SPACE");

    private static final SubLSymbol WITH_NEW_SBHL_SPACES = makeSymbol("WITH-NEW-SBHL-SPACES");

    private static final SubLSymbol WITH_SAME_SBHL_SPACES = makeSymbol("WITH-SAME-SBHL-SPACES");

    private static final SubLSymbol $sym43$SOURCE = makeUninternedSymbol("SOURCE");

    private static final SubLList $list44 = list(list(makeSymbol("SBHL-NEW-SPACE-SOURCE")));

    private static final SubLSymbol POSSIBLY_WITH_NEW_SBHL_SPACE = makeSymbol("POSSIBLY-WITH-NEW-SBHL-SPACE");

    private static final SubLSymbol POSSIBLY_WITH_NEW_SBHL_SPACES = makeSymbol("POSSIBLY-WITH-NEW-SBHL-SPACES");

    public static final SubLList $list47 = list(list(makeSymbol("SPACE"), makeSymbol("SOURCE")), makeSymbol("&BODY"), makeSymbol("BODY"));



    private static final SubLList $list49 = list(makeKeyword("OLD"));

    private static final SubLSymbol SBHL_GET_NEW_SPACE = makeSymbol("SBHL-GET-NEW-SPACE");



    private static final SubLList $list52 = list(makeKeyword("RESOURCE"));

    private static final SubLSymbol UPDATE_SBHL_RESOURCED_SPACES = makeSymbol("UPDATE-SBHL-RESOURCED-SPACES");

    private static final SubLSymbol SBHL_NEW_SPACE_SOURCE = makeSymbol("SBHL-NEW-SPACE-SOURCE");







    public static final SubLList $list58 = list(makeSymbol("VAR"), makeSymbol("&BODY"), makeSymbol("BODY"));

    public static final SubLList $list59 = list(makeSymbol("*SBHL-SPACE*"));

    private static final SubLList $list60 = list(makeSymbol("*SBHL-GATHER-SPACE*"));

    private static final SubLList $list61 = list(list(makeSymbol("NODE-VAR"), makeSymbol("MARKING-VAR"), makeSymbol("SBHL-SPACE"), makeSymbol("&OPTIONAL"), makeSymbol("DONE-VAR")), makeSymbol("&BODY"), makeSymbol("BODY"));





    private static final SubLList $list64 = list(makeSymbol("FUNCTION"), makeSymbol("SBHL-SPACE"));

    private static final SubLSymbol $sym65$NODE = makeUninternedSymbol("NODE");

    private static final SubLSymbol $sym66$TAG = makeUninternedSymbol("TAG");











    private static final SubLSymbol SBHL_ERROR = makeSymbol("SBHL-ERROR");

    private static final SubLString $str73$no_mapping_method_defiend_for_sbh = makeString("no mapping method defiend for sbhl-space ~s");

    private static final SubLList $list74 = list(list(makeSymbol("*SBHL-SUSPEND-NEW-SPACES?*"), T));

    private static final SubLList $list75 = list(list(makeSymbol("*SBHL-SUSPEND-NEW-SPACES?*"), NIL));

    public static final SubLSymbol $sbhl_goal_space$ = makeSymbol("*SBHL-GOAL-SPACE*");

    private static final SubLSymbol WITH_NEW_SBHL_TARGET_SPACES = makeSymbol("WITH-NEW-SBHL-TARGET-SPACES");

    private static final SubLList $list78 = list(list(makeSymbol("*SBHL-SPACE*"), makeSymbol("*SBHL-TARGET-SPACE*")), list(makeSymbol("*SBHL-GATHER-SPACE*"), makeSymbol("*SBHL-TARGET-GATHER-SPACE*")));

    public static final SubLSymbol $sbhl_target_space$ = makeSymbol("*SBHL-TARGET-SPACE*");

    public static final SubLSymbol $sbhl_target_gather_space$ = makeSymbol("*SBHL-TARGET-GATHER-SPACE*");

    private static final SubLList $list81 = list(list(makeSymbol("*SBHL-SPACE*"), makeSymbol("*SBHL-TARGET-SPACE*")));

    private static final SubLSymbol WITH_NEW_SBHL_TARGET_SPACE = makeSymbol("WITH-NEW-SBHL-TARGET-SPACE");

    private static final SubLSymbol WITHIN_SBHL_TARGET_SPACE = makeSymbol("WITHIN-SBHL-TARGET-SPACE");

    public static final SubLList $list84 = list(makeSymbol("SPACE-VAR"), makeSymbol("&BODY"), makeSymbol("BODY"));

    public static final SubLSymbol $sbhl_terminating_marking_space$ = makeSymbol("*SBHL-TERMINATING-MARKING-SPACE*");

    public static final SubLList $list86 = list(list(makeSymbol("*SBHL-SPACE*"), makeSymbol("*SBHL-TERMINATING-MARKING-SPACE*")));

    public static final SubLSymbol $sbhl_apply_marking_space$ = makeSymbol("*SBHL-APPLY-MARKING-SPACE*");

    public static final SubLList $list88 = list(reader_make_constant_shell(makeString("genlPreds")));

    public static final SubLList $list89 = list(reader_make_constant_shell(makeString("genlInverse")));

    public static final SubLList $list90 = list(reader_make_constant_shell(makeString("genlPreds")), reader_make_constant_shell(makeString("genlInverse")));

    private static final SubLList $list91 = list(reader_make_constant_shell(makeString("genlInverse")), reader_make_constant_shell(makeString("genlPreds")));

    private static final SubLList $list92 = list(list(makeSymbol("*SBHL-MARKING-GENERATION*"), ZERO_INTEGER));

    public static final SubLSymbol $sbhl_mapping_marking_space$ = makeSymbol("*SBHL-MAPPING-MARKING-SPACE*");

    public static final SubLSymbol $sbhl_mapping_gather_marking_space$ = makeSymbol("*SBHL-MAPPING-GATHER-MARKING-SPACE*");

    public static final SubLList $list95 = list(list(makeSymbol("*SBHL-SPACE*"), makeSymbol("*SBHL-MAPPING-MARKING-SPACE*")), list(makeSymbol("*SBHL-GATHER-SPACE*"), makeSymbol("*SBHL-MAPPING-GATHER-MARKING-SPACE*")));

    public static final SubLList $list96 = list(list(makeSymbol("*SBHL-MAPPING-MARKING-SPACE*"), makeSymbol("*SBHL-TARGET-SPACE*")), list(makeSymbol("*SBHL-MAPPING-GATHER-MARKING-SPACE*"), makeSymbol("*SBHL-TARGET-GATHER-SPACE*")), list(makeSymbol("*SBHL-SUSPEND-NEW-SPACES-DURING-MAPPING?*"), T));

    private static final SubLList $list97 = list(list(makeSymbol("*SBHL-SUSPEND-NEW-SPACES-DURING-MAPPING?*"), T));

    private static final SubLList $list98 = list(list(makeSymbol("*SBHL-TEMPORALITY-SEARCH-CHECKS-NODES-IN-TARGET-SPACE-P*"), T));

    private static final SubLString $str99$Table_used_for_public_marking_int = makeString("Table used for public marking interface");

    public static final SubLSymbol $sbhl_table$ = makeSymbol("*SBHL-TABLE*");

    public static final SubLList $list101 = list(makeSymbol("*SBHL-TABLE*"));

    private static final SubLSymbol $sym102$RESOURCING_P = makeUninternedSymbol("RESOURCING-P");

    private static final SubLList $list103 = list(list(makeSymbol("RESOURCING-SBHL-MARKING-SPACES-P")));

    private static final SubLSymbol WITHOUT_SBHL_RESOURCED_MARKING_SPACES = makeSymbol("WITHOUT-SBHL-RESOURCED-MARKING-SPACES");

    private static final SubLSymbol WITH_NEW_SBHL_TABLE = makeSymbol("WITH-NEW-SBHL-TABLE");

    private static final SubLSymbol WITH_SBHL_TABLE_VAR = makeSymbol("WITH-SBHL-TABLE-VAR");

    private static final SubLSymbol TOGGLE_SBHL_RESOURCED_MARKING_SPACES = makeSymbol("TOGGLE-SBHL-RESOURCED-MARKING-SPACES");

    private static final SubLList $list108 = list(list(makeSymbol("NODE-VAR"), makeSymbol("MARKING-VAR"), makeSymbol("SBHL-TABLE"), makeSymbol("&OPTIONAL"), makeSymbol("DONE-VAR")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLList $list109 = list(makeSymbol("FUNCTION"), makeSymbol("SBHL-TABLE"));

    private static final SubLSymbol $sym110$NODE = makeUninternedSymbol("NODE");

    private static final SubLSymbol $sym111$TAG = makeUninternedSymbol("TAG");

    private static final SubLString $str112$no_mapping_method_defiend_for_sbh = makeString("no mapping method defiend for sbhl-table ~s");

    private static final SubLSymbol WITHIN_SBHL_SPACE = makeSymbol("WITHIN-SBHL-SPACE");

    private static final SubLList $list114 = list(makeSymbol("TABLE"), makeSymbol("&BODY"), makeSymbol("BODY"));

    public static final SubLSymbol $sbhl_goal_table$ = makeSymbol("*SBHL-GOAL-TABLE*");

    public static SubLObject average_genl_cardinality(SubLObject module) {
        if (module == UNPROVIDED) {
            module = NIL;
        }
        return $int$100;
    }

    public static SubLObject average_spec_cardinality(SubLObject module) {
        if (module == UNPROVIDED) {
            module = NIL;
        }
        return $int$3000;
    }

    public static SubLObject get_sbhl_marking_space() {
        if (NIL != resourcing_sbhl_marking_spaces_p()) {
            return get_sbhl_resourced_marking_space();
        }
        return instantiate_sbhl_marking_space();
    }

    public static SubLObject free_sbhl_marking_space(final SubLObject space) {
        if (NIL != resourcing_sbhl_marking_spaces_p()) {
            update_sbhl_resourced_spaces(space);
        }
        return NIL;
    }

    public static SubLObject instantiate_sbhl_marking_space() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != $use_zero_size_sbhl_marking_spacesP$.getDynamicValue(thread)) {
            return make_hash_table(ZERO_INTEGER, symbol_function(EQUAL), UNPROVIDED);
        }
        if (NIL != sbhl_search_vars.sbhl_forward_search_p()) {
            return make_hash_table(average_genl_cardinality(UNPROVIDED), symbol_function(EQUAL), UNPROVIDED);
        }
        if (NIL != sbhl_search_vars.sbhl_backward_search_p()) {
            return make_hash_table(average_spec_cardinality(UNPROVIDED), symbol_function(EQUAL), UNPROVIDED);
        }
        return make_hash_table(average_genl_cardinality(UNPROVIDED), symbol_function(EQUAL), UNPROVIDED);
    }

    public static SubLObject instantiate_sbhl_marking_space_for(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject space = NIL;
        destructuring_bind_must_consp(current, datum, $list2);
        space = current.first();
        final SubLObject body;
        current = body = current.rest();
        return list(CLET, list(bq_cons(space, $list4)), list(CUNWIND_PROTECT, bq_cons(PROGN, append(body, NIL)), list(FREE_SBHL_MARKING_SPACE, space)));
    }

    public static SubLObject resourcing_sbhl_marking_spaces_p() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return $resourcing_sbhl_marking_spaces_p$.getDynamicValue(thread);
    }

    public static SubLObject with_sbhl_resourced_marking_spaces(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject num = NIL;
        destructuring_bind_must_consp(current, datum, $list8);
        num = current.first();
        final SubLObject body;
        current = body = current.rest();
        final SubLObject already_resourcing_p = $sym9$ALREADY_RESOURCING_P;
        return listS(CLET, listS(bq_cons(already_resourcing_p, $list10), list($resourced_sbhl_marking_space_limit$, list(DETERMINE_RESOURCE_LIMIT, already_resourcing_p, num)), list($resourced_sbhl_marking_spaces$, list(POSSIBLY_NEW_MARKING_RESOURCE, already_resourcing_p)), $list15), append(body, NIL));
    }

    public static SubLObject determine_resource_limit(final SubLObject resourcing_p, final SubLObject num) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != resourcing_p) {
            return max($resourced_sbhl_marking_space_limit$.getDynamicValue(thread), num);
        }
        return num;
    }

    public static SubLObject possibly_new_marking_resource(final SubLObject resourcing_p) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != resourcing_p) {
            return $resourced_sbhl_marking_spaces$.getDynamicValue(thread);
        }
        return NIL;
    }

    public static SubLObject without_sbhl_resourced_marking_spaces(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(CLET, $list17, append(body, NIL));
    }

    public static SubLObject toggle_sbhl_resourced_marking_spaces(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject resourcing_p = NIL;
        destructuring_bind_must_consp(current, datum, $list18);
        resourcing_p = current.first();
        final SubLObject body;
        current = body = current.rest();
        return listS(CLET, list(list($resourcing_sbhl_marking_spaces_p$, resourcing_p)), append(body, NIL));
    }

    public static SubLObject new_sbhl_marking_space_resource(SubLObject num) {
        if (num == UNPROVIDED) {
            num = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject default_num = (NIL != num) ? num : ZERO_INTEGER;
        SubLObject result = NIL;
        final SubLObject _prev_bind_0 = $within_new_sbhl_marking_space_resource$.currentBinding(thread);
        try {
            $within_new_sbhl_marking_space_resource$.bind(T, thread);
            SubLObject i;
            for (i = NIL, i = ZERO_INTEGER; i.numL(default_num); i = add(i, ONE_INTEGER)) {
                result = cons(instantiate_sbhl_marking_space(), result);
            }
        } finally {
            $within_new_sbhl_marking_space_resource$.rebind(_prev_bind_0, thread);
        }
        return nreverse(result);
    }

    public static SubLObject current_sbhl_marking_space_resource() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return $resourced_sbhl_marking_spaces$.getDynamicValue(thread);
    }

    public static SubLObject with_sbhl_marking_space_resource(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject sbhl_ms_resource = NIL;
        destructuring_bind_must_consp(current, datum, $list20);
        sbhl_ms_resource = current.first();
        final SubLObject body;
        current = body = current.rest();
        return list(CLET, bq_cons(list($resourced_sbhl_marking_spaces$, sbhl_ms_resource), $list21), list(CUNWIND_PROTECT, bq_cons(PROGN, append(body, NIL)), listS(CSETQ, sbhl_ms_resource, $list23)));
    }

    public static SubLObject with_new_sbhl_marking_space_resource(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list24);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$1 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list24);
            current_$1 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list24);
            if (NIL == member(current_$1, $list25, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$1 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list24);
        }
        final SubLObject num_tail = property_list_member($NUM, current);
        final SubLObject num = (NIL != num_tail) ? cadr(num_tail) : NIL;
        final SubLObject body;
        current = body = temp;
        final SubLObject sbhl_ms_resource = $sym28$SBHL_MS_RESOURCE;
        return list(CLET, list(list(sbhl_ms_resource, list(NEW_SBHL_MARKING_SPACE_RESOURCE, num))), listS(WITH_SBHL_MARKING_SPACE_RESOURCE, sbhl_ms_resource, append(body, NIL)));
    }

    public static SubLObject determine_marking_space_limit(final SubLObject marking_resource) {
        final SubLObject length = length(marking_resource);
        if (length.eql(ZERO_INTEGER)) {
            return $default_resourced_sbhl_space_limit$.getGlobalValue();
        }
        return length;
    }

    public static SubLObject get_sbhl_resourced_marking_space() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        result = $resourced_sbhl_marking_spaces$.getDynamicValue(thread).first();
        if (NIL != result) {
            if ((NIL != $debug_sbhl_marking_spacesP$.getDynamicValue(thread)) && (NIL == hash_table_utilities.hash_table_empty_p(result))) {
                Errors.warn($str32$Dirty_resourced_marking_space_bei, result);
            }
            $resourced_sbhl_marking_spaces$.setDynamicValue($resourced_sbhl_marking_spaces$.getDynamicValue(thread).rest(), thread);
        } else {
            result = instantiate_sbhl_marking_space();
        }
        return result;
    }

    public static SubLObject update_sbhl_resourced_spaces(final SubLObject space) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != list_utilities.lengthG($resourced_sbhl_marking_spaces$.getDynamicValue(thread), $resourced_sbhl_marking_space_limit$.getDynamicValue(thread), UNPROVIDED)) {
            if (NIL != $debug_sbhl_marking_spacesP$.getDynamicValue(thread)) {
                Errors.sublisp_break($str33$Have__S_more_spaces_than_the_limi, new SubLObject[]{ subtract(length($resourced_sbhl_marking_spaces$.getDynamicValue(thread)), $resourced_sbhl_marking_space_limit$.getDynamicValue(thread)), $resourced_sbhl_marking_space_limit$.getDynamicValue(thread) });
            }
        } else {
            sbhl_marking_utilities.clear_sbhl_space(space);
            $resourced_sbhl_marking_spaces$.setDynamicValue(cons(space, $resourced_sbhl_marking_spaces$.getDynamicValue(thread)), thread);
        }
        return NIL;
    }

    public static SubLObject clear_recourced_sbhl_spaces() {
        $resourced_sbhl_marking_spaces$.setDynamicValue(NIL);
        return NIL;
    }

    public static SubLObject sbhl_space_obect_p(final SubLObject space) {
        return hash_table_p(space);
    }

    public static SubLObject get_sbhl_space() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return $sbhl_space$.getDynamicValue(thread);
    }

    public static SubLObject get_sbhl_gather_space() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return $sbhl_gather_space$.getDynamicValue(thread);
    }

    public static SubLObject with_new_sbhl_space(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(INSTANTIATE_SBHL_MARKING_SPACE_FOR, $sbhl_space$, append(body, NIL));
    }

    public static SubLObject with_new_sbhl_space_named(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject name = NIL;
        destructuring_bind_must_consp(current, datum, $list36);
        name = current.first();
        final SubLObject body;
        current = body = current.rest();
        return list(WITH_NEW_SBHL_SPACE, listS(WITH_SBHL_SPACE_VAR, name, append(body, NIL)));
    }

    public static SubLObject with_new_sbhl_gather_space(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(INSTANTIATE_SBHL_MARKING_SPACE_FOR, $sbhl_gather_space$, append(body, NIL));
    }

    public static SubLObject with_new_sbhl_spaces(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return list(WITH_NEW_SBHL_SPACE, bq_cons(WITH_NEW_SBHL_GATHER_SPACE, append(body, NIL)));
    }

    public static SubLObject with_new_sbhl_spaces_used_repeatedly(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return list(WITH_NEW_SBHL_SPACES, bq_cons(WITH_SAME_SBHL_SPACES, append(body, NIL)));
    }

    public static SubLObject with_new_sbhl_space_used_repeatedly(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return list(WITH_NEW_SBHL_SPACE, bq_cons(WITH_SAME_SBHL_SPACES, append(body, NIL)));
    }

    public static SubLObject possibly_with_new_sbhl_spaces(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        final SubLObject source = $sym43$SOURCE;
        return list(CLET, list(bq_cons(source, $list44)), list(POSSIBLY_WITH_NEW_SBHL_SPACE, list($sbhl_space$, source), listS(POSSIBLY_WITH_NEW_SBHL_SPACE, list($sbhl_gather_space$, source), append(body, NIL))));
    }

    public static SubLObject possibly_with_new_sbhl_space(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list47);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject space = NIL;
        SubLObject source = NIL;
        destructuring_bind_must_consp(current, datum, $list47);
        space = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list47);
        source = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            return listS(CLET, list(list(space, list(FIF, listS(EQ, source, $list49), space, list(SBHL_GET_NEW_SPACE, source)))), append(body, list(list(PWHEN, listS(EQ, source, $list52), list(UPDATE_SBHL_RESOURCED_SPACES, space)))));
        }
        cdestructuring_bind_error(datum, $list47);
        return NIL;
    }

    public static SubLObject sbhl_new_space_source() {
        if (NIL != sbhl_suspend_new_spacesP()) {
            return $OLD;
        }
        if (NIL != resourcing_sbhl_marking_spaces_p()) {
            return $RESOURCE;
        }
        return $NEW;
    }

    public static SubLObject sbhl_get_new_space(SubLObject source) {
        if (source.eql($RESOURCE)) {
            return get_sbhl_resourced_marking_space();
        }
        return instantiate_sbhl_marking_space();
    }

    public static SubLObject with_sbhl_space_var(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject var = NIL;
        destructuring_bind_must_consp(current, datum, $list58);
        var = current.first();
        final SubLObject body;
        current = body = current.rest();
        return listS(CLET, list(bq_cons(var, $list59)), append(body, NIL));
    }

    public static SubLObject with_sbhl_gather_space_var(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject var = NIL;
        destructuring_bind_must_consp(current, datum, $list58);
        var = current.first();
        final SubLObject body;
        current = body = current.rest();
        return listS(CLET, list(bq_cons(var, $list60)), append(body, NIL));
    }

    public static SubLObject within_sbhl_space(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject var = NIL;
        destructuring_bind_must_consp(current, datum, $list58);
        var = current.first();
        final SubLObject body;
        current = body = current.rest();
        return listS(CLET, list(list($sbhl_space$, var)), append(body, NIL));
    }

    public static SubLObject within_sbhl_gather_space(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject var = NIL;
        destructuring_bind_must_consp(current, datum, $list58);
        var = current.first();
        final SubLObject body;
        current = body = current.rest();
        return listS(CLET, list(list($sbhl_gather_space$, var)), append(body, NIL));
    }

    public static SubLObject do_sbhl_space(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list61);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject node_var = NIL;
        SubLObject marking_var = NIL;
        SubLObject sbhl_space = NIL;
        destructuring_bind_must_consp(current, datum, $list61);
        node_var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list61);
        marking_var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list61);
        sbhl_space = current.first();
        current = current.rest();
        final SubLObject done_var = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list61);
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            return listS(DO_HASH_TABLE, list(node_var, marking_var, sbhl_space, $DONE, done_var), append(body, NIL));
        }
        cdestructuring_bind_error(datum, $list61);
        return NIL;
    }

    public static SubLObject map_sbhl_space(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject function = NIL;
        SubLObject sbhl_space = NIL;
        destructuring_bind_must_consp(current, datum, $list64);
        function = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list64);
        sbhl_space = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject node = $sym65$NODE;
            final SubLObject tag = $sym66$TAG;
            return list(PCOND, list(list(HASH_TABLE_P, sbhl_space), list(CDOHASH, list(node, tag, sbhl_space), list(IGNORE, tag), list(FUNCALL, function, node))), list(T, list(SBHL_ERROR, THREE_INTEGER, $str73$no_mapping_method_defiend_for_sbh, sbhl_space)));
        }
        cdestructuring_bind_error(datum, $list64);
        return NIL;
    }

    public static SubLObject sbhl_suspend_new_spacesP() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return $sbhl_suspend_new_spacesP$.getDynamicValue(thread);
    }

    public static SubLObject with_same_sbhl_spaces(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(CLET, $list74, append(body, NIL));
    }

    public static SubLObject without_suspending_new_sbhl_spaces(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(CLET, $list75, append(body, NIL));
    }

    public static SubLObject get_sbhl_goal_space() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return $sbhl_goal_space$.getDynamicValue(thread);
    }

    public static SubLObject with_sbhl_goal_space(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject space = NIL;
        destructuring_bind_must_consp(current, datum, $list2);
        space = current.first();
        final SubLObject body;
        current = body = current.rest();
        return listS(CLET, list(list($sbhl_goal_space$, space)), append(body, NIL));
    }

    public static SubLObject with_sbhl_target_spaces(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return list(WITH_NEW_SBHL_TARGET_SPACES, listS(CLET, $list78, append(body, NIL)));
    }

    public static SubLObject with_new_sbhl_target_spaces(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return list(INSTANTIATE_SBHL_MARKING_SPACE_FOR, $sbhl_target_space$, listS(INSTANTIATE_SBHL_MARKING_SPACE_FOR, $sbhl_target_gather_space$, append(body, NIL)));
    }

    public static SubLObject with_new_sbhl_target_space(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(INSTANTIATE_SBHL_MARKING_SPACE_FOR, $sbhl_target_space$, append(body, NIL));
    }

    public static SubLObject with_new_sbhl_target_gather_space(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(INSTANTIATE_SBHL_MARKING_SPACE_FOR, $sbhl_target_gather_space$, append(body, NIL));
    }

    public static SubLObject within_sbhl_target_spaces(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(CLET, $list78, append(body, NIL));
    }

    public static SubLObject within_sbhl_target_space(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(CLET, $list81, append(body, NIL));
    }

    public static SubLObject within_new_sbhl_target_space(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return list(WITH_NEW_SBHL_TARGET_SPACE, bq_cons(WITHIN_SBHL_TARGET_SPACE, append(body, NIL)));
    }

    public static SubLObject with_sbhl_target_space_named(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject space_var = NIL;
        destructuring_bind_must_consp(current, datum, $list84);
        space_var = current.first();
        final SubLObject body;
        current = body = current.rest();
        return listS(CLET, list(list($sbhl_target_space$, space_var)), append(body, NIL));
    }

    public static SubLObject clear_sbhl_target_spaces() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        sbhl_marking_utilities.clear_sbhl_space($sbhl_target_space$.getDynamicValue(thread));
        sbhl_marking_utilities.clear_sbhl_space($sbhl_target_gather_space$.getDynamicValue(thread));
        return NIL;
    }

    public static SubLObject clear_sbhl_target_space() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        sbhl_marking_utilities.clear_sbhl_space($sbhl_target_space$.getDynamicValue(thread));
        return NIL;
    }

    public static SubLObject get_sbhl_terminating_marking_space() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return $sbhl_terminating_marking_space$.getDynamicValue(thread);
    }

    public static SubLObject with_sbhl_terminating_space(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject space = NIL;
        destructuring_bind_must_consp(current, datum, $list2);
        space = current.first();
        final SubLObject body;
        current = body = current.rest();
        return listS(CLET, list(list($sbhl_terminating_marking_space$, space)), append(body, NIL));
    }

    public static SubLObject within_sbhl_terminating_marking_space(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(CLET, $list86, append(body, NIL));
    }

    public static SubLObject with_sbhl_apply_marking_space(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject space = NIL;
        destructuring_bind_must_consp(current, datum, $list2);
        space = current.first();
        final SubLObject body;
        current = body = current.rest();
        return listS(CLET, list(list($sbhl_apply_marking_space$, space)), append(body, NIL));
    }

    public static SubLObject genl_preds_marking_p(final SubLObject marking) {
        return eql(marking, $sbhl_genl_preds_marking$.getGlobalValue());
    }

    public static SubLObject genl_inverse_marking_p(final SubLObject marking) {
        return eql(marking, $sbhl_genl_inverse_marking$.getGlobalValue());
    }

    public static SubLObject genl_preds_and_genl_inverse_marking_p(final SubLObject marking) {
        return makeBoolean(marking.eql($sbhl_genl_preds_and_genl_inverse_marking$.getGlobalValue()) || marking.eql($sbhl_genl_inverse_and_genl_preds_marking$.getGlobalValue()));
    }

    public static SubLObject genl_preds_opposite_marking(final SubLObject marking) {
        if (NIL != genl_preds_marking_p(marking)) {
            return $sbhl_genl_inverse_marking$.getGlobalValue();
        }
        if (NIL != genl_inverse_marking_p(marking)) {
            return $sbhl_genl_preds_marking$.getGlobalValue();
        }
        return marking;
    }

    public static SubLObject increment_sbhl_marking_generation() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        $sbhl_marking_generation$.setDynamicValue(add($sbhl_marking_generation$.getDynamicValue(thread), ONE_INTEGER), thread);
        return NIL;
    }

    public static SubLObject get_sbhl_marking_generation() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return $sbhl_marking_generation$.getDynamicValue(thread);
    }

    public static SubLObject with_new_sbhl_marking_generation(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(CLET, $list92, append(body, NIL));
    }

    public static SubLObject sbhl_suspend_new_spaces_during_mappingP() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return $sbhl_suspend_new_spaces_during_mappingP$.getDynamicValue(thread);
    }

    public static SubLObject with_sbhl_mapping_marking_space(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject space = NIL;
        destructuring_bind_must_consp(current, datum, $list2);
        space = current.first();
        final SubLObject body;
        current = body = current.rest();
        return listS(CLET, list(list($sbhl_mapping_marking_space$, space)), append(body, NIL));
    }

    public static SubLObject with_sbhl_mapping_gather_marking_space(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject space = NIL;
        destructuring_bind_must_consp(current, datum, $list2);
        space = current.first();
        final SubLObject body;
        current = body = current.rest();
        return listS(CLET, list(list($sbhl_mapping_gather_marking_space$, space)), append(body, NIL));
    }

    public static SubLObject within_sbhl_mapping_marking_spaces(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return list(CLET, $list95, bq_cons(WITH_SAME_SBHL_SPACES, append(body, NIL)));
    }

    public static SubLObject sbhl_mark_mapping_fn_in_new_target_spaces(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return list(WITH_NEW_SBHL_TARGET_SPACES, listS(CLET, $list96, append(body, NIL)));
    }

    public static SubLObject sbhl_mark_mapping_fn_within_space(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject space = NIL;
        destructuring_bind_must_consp(current, datum, $list2);
        space = current.first();
        final SubLObject body;
        current = body = current.rest();
        return listS(CLET, bq_cons(list($sbhl_mapping_marking_space$, space), $list97), append(body, NIL));
    }

    public static SubLObject sbhl_mark_gather_mapping_fn_within_gather_space(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject space = NIL;
        destructuring_bind_must_consp(current, datum, $list2);
        space = current.first();
        final SubLObject body;
        current = body = current.rest();
        return listS(CLET, bq_cons(list($sbhl_mapping_gather_marking_space$, space), $list97), append(body, NIL));
    }

    public static SubLObject sbhl_temporality_search_checks_nodes_in_target_space_p() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return $sbhl_temporality_search_checks_nodes_in_target_space_p$.getDynamicValue(thread);
    }

    public static SubLObject with_sbhl_temporality_search_checks_nodes_in_target_space(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(CLET, $list98, append(body, NIL));
    }

    public static SubLObject sbhl_table_p(final SubLObject table) {
        return hash_table_p(table);
    }

    public static SubLObject with_new_sbhl_table(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(INSTANTIATE_SBHL_MARKING_SPACE_FOR, $sbhl_table$, append(body, NIL));
    }

    public static SubLObject with_sbhl_table_var(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject var = NIL;
        destructuring_bind_must_consp(current, datum, $list58);
        var = current.first();
        final SubLObject body;
        current = body = current.rest();
        return listS(CLET, list(bq_cons(var, $list101)), append(body, NIL));
    }

    public static SubLObject with_new_sbhl_table_named(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject name = NIL;
        destructuring_bind_must_consp(current, datum, $list36);
        name = current.first();
        final SubLObject body;
        current = body = current.rest();
        final SubLObject resourcing_p = $sym102$RESOURCING_P;
        return list(CLET, list(bq_cons(resourcing_p, $list103)), list(WITHOUT_SBHL_RESOURCED_MARKING_SPACES, list(WITH_NEW_SBHL_TABLE, list(WITH_SBHL_TABLE_VAR, name, listS(TOGGLE_SBHL_RESOURCED_MARKING_SPACES, resourcing_p, append(body, NIL))))));
    }

    public static SubLObject within_sbhl_table(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject var = NIL;
        destructuring_bind_must_consp(current, datum, $list58);
        var = current.first();
        final SubLObject body;
        current = body = current.rest();
        return listS(CLET, list(list($sbhl_table$, var)), append(body, NIL));
    }

    public static SubLObject do_sbhl_table(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list108);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject node_var = NIL;
        SubLObject marking_var = NIL;
        SubLObject sbhl_table = NIL;
        destructuring_bind_must_consp(current, datum, $list108);
        node_var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list108);
        marking_var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list108);
        sbhl_table = current.first();
        current = current.rest();
        final SubLObject done_var = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list108);
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            return listS(DO_HASH_TABLE, list(node_var, marking_var, sbhl_table, $DONE, done_var), append(body, NIL));
        }
        cdestructuring_bind_error(datum, $list108);
        return NIL;
    }

    public static SubLObject map_sbhl_table(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject function = NIL;
        SubLObject sbhl_table = NIL;
        destructuring_bind_must_consp(current, datum, $list109);
        function = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list109);
        sbhl_table = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject node = $sym110$NODE;
            final SubLObject tag = $sym111$TAG;
            return list(PCOND, list(list(HASH_TABLE_P, sbhl_table), list(CDOHASH, list(node, tag, sbhl_table), list(IGNORE, tag), list(FUNCALL, function, node))), list(T, list(SBHL_ERROR, THREE_INTEGER, $str112$no_mapping_method_defiend_for_sbh, sbhl_table)));
        }
        cdestructuring_bind_error(datum, $list109);
        return NIL;
    }

    public static SubLObject mark_in_sbhl_table(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(WITHIN_SBHL_SPACE, $sbhl_table$, append(body, NIL));
    }

    public static SubLObject get_sbhl_goal_table() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return $sbhl_goal_table$.getDynamicValue(thread);
    }

    public static SubLObject with_sbhl_goal_table(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject table = NIL;
        destructuring_bind_must_consp(current, datum, $list114);
        table = current.first();
        final SubLObject body;
        current = body = current.rest();
        return listS(CLET, list(list($sbhl_goal_table$, table)), append(body, NIL));
    }

    public static SubLObject declare_sbhl_marking_vars_file() {
        declareFunction(me, "average_genl_cardinality", "AVERAGE-GENL-CARDINALITY", 0, 1, false);
        declareFunction(me, "average_spec_cardinality", "AVERAGE-SPEC-CARDINALITY", 0, 1, false);
        declareFunction(me, "get_sbhl_marking_space", "GET-SBHL-MARKING-SPACE", 0, 0, false);
        declareFunction(me, "free_sbhl_marking_space", "FREE-SBHL-MARKING-SPACE", 1, 0, false);
        declareFunction(me, "instantiate_sbhl_marking_space", "INSTANTIATE-SBHL-MARKING-SPACE", 0, 0, false);
        declareMacro(me, "instantiate_sbhl_marking_space_for", "INSTANTIATE-SBHL-MARKING-SPACE-FOR");
        declareFunction(me, "resourcing_sbhl_marking_spaces_p", "RESOURCING-SBHL-MARKING-SPACES-P", 0, 0, false);
        declareMacro(me, "with_sbhl_resourced_marking_spaces", "WITH-SBHL-RESOURCED-MARKING-SPACES");
        declareFunction(me, "determine_resource_limit", "DETERMINE-RESOURCE-LIMIT", 2, 0, false);
        declareFunction(me, "possibly_new_marking_resource", "POSSIBLY-NEW-MARKING-RESOURCE", 1, 0, false);
        declareMacro(me, "without_sbhl_resourced_marking_spaces", "WITHOUT-SBHL-RESOURCED-MARKING-SPACES");
        declareMacro(me, "toggle_sbhl_resourced_marking_spaces", "TOGGLE-SBHL-RESOURCED-MARKING-SPACES");
        declareFunction(me, "new_sbhl_marking_space_resource", "NEW-SBHL-MARKING-SPACE-RESOURCE", 0, 1, false);
        declareFunction(me, "current_sbhl_marking_space_resource", "CURRENT-SBHL-MARKING-SPACE-RESOURCE", 0, 0, false);
        declareMacro(me, "with_sbhl_marking_space_resource", "WITH-SBHL-MARKING-SPACE-RESOURCE");
        declareMacro(me, "with_new_sbhl_marking_space_resource", "WITH-NEW-SBHL-MARKING-SPACE-RESOURCE");
        declareFunction(me, "determine_marking_space_limit", "DETERMINE-MARKING-SPACE-LIMIT", 1, 0, false);
        declareFunction(me, "get_sbhl_resourced_marking_space", "GET-SBHL-RESOURCED-MARKING-SPACE", 0, 0, false);
        declareFunction(me, "update_sbhl_resourced_spaces", "UPDATE-SBHL-RESOURCED-SPACES", 1, 0, false);
        declareFunction(me, "clear_recourced_sbhl_spaces", "CLEAR-RECOURCED-SBHL-SPACES", 0, 0, false);
        declareFunction(me, "sbhl_space_obect_p", "SBHL-SPACE-OBECT-P", 1, 0, false);
        declareFunction(me, "get_sbhl_space", "GET-SBHL-SPACE", 0, 0, false);
        declareFunction(me, "get_sbhl_gather_space", "GET-SBHL-GATHER-SPACE", 0, 0, false);
        declareMacro(me, "with_new_sbhl_space", "WITH-NEW-SBHL-SPACE");
        declareMacro(me, "with_new_sbhl_space_named", "WITH-NEW-SBHL-SPACE-NAMED");
        declareMacro(me, "with_new_sbhl_gather_space", "WITH-NEW-SBHL-GATHER-SPACE");
        declareMacro(me, "with_new_sbhl_spaces", "WITH-NEW-SBHL-SPACES");
        declareMacro(me, "with_new_sbhl_spaces_used_repeatedly", "WITH-NEW-SBHL-SPACES-USED-REPEATEDLY");
        declareMacro(me, "with_new_sbhl_space_used_repeatedly", "WITH-NEW-SBHL-SPACE-USED-REPEATEDLY");
        declareMacro(me, "possibly_with_new_sbhl_spaces", "POSSIBLY-WITH-NEW-SBHL-SPACES");
        declareMacro(me, "possibly_with_new_sbhl_space", "POSSIBLY-WITH-NEW-SBHL-SPACE");
        declareFunction(me, "sbhl_new_space_source", "SBHL-NEW-SPACE-SOURCE", 0, 0, false);
        declareFunction(me, "sbhl_get_new_space", "SBHL-GET-NEW-SPACE", 1, 0, false);
        declareMacro(me, "with_sbhl_space_var", "WITH-SBHL-SPACE-VAR");
        declareMacro(me, "with_sbhl_gather_space_var", "WITH-SBHL-GATHER-SPACE-VAR");
        declareMacro(me, "within_sbhl_space", "WITHIN-SBHL-SPACE");
        declareMacro(me, "within_sbhl_gather_space", "WITHIN-SBHL-GATHER-SPACE");
        declareMacro(me, "do_sbhl_space", "DO-SBHL-SPACE");
        declareMacro(me, "map_sbhl_space", "MAP-SBHL-SPACE");
        declareFunction(me, "sbhl_suspend_new_spacesP", "SBHL-SUSPEND-NEW-SPACES?", 0, 0, false);
        declareMacro(me, "with_same_sbhl_spaces", "WITH-SAME-SBHL-SPACES");
        declareMacro(me, "without_suspending_new_sbhl_spaces", "WITHOUT-SUSPENDING-NEW-SBHL-SPACES");
        declareFunction(me, "get_sbhl_goal_space", "GET-SBHL-GOAL-SPACE", 0, 0, false);
        declareMacro(me, "with_sbhl_goal_space", "WITH-SBHL-GOAL-SPACE");
        declareMacro(me, "with_sbhl_target_spaces", "WITH-SBHL-TARGET-SPACES");
        declareMacro(me, "with_new_sbhl_target_spaces", "WITH-NEW-SBHL-TARGET-SPACES");
        declareMacro(me, "with_new_sbhl_target_space", "WITH-NEW-SBHL-TARGET-SPACE");
        declareMacro(me, "with_new_sbhl_target_gather_space", "WITH-NEW-SBHL-TARGET-GATHER-SPACE");
        declareMacro(me, "within_sbhl_target_spaces", "WITHIN-SBHL-TARGET-SPACES");
        declareMacro(me, "within_sbhl_target_space", "WITHIN-SBHL-TARGET-SPACE");
        declareMacro(me, "within_new_sbhl_target_space", "WITHIN-NEW-SBHL-TARGET-SPACE");
        declareMacro(me, "with_sbhl_target_space_named", "WITH-SBHL-TARGET-SPACE-NAMED");
        declareFunction(me, "clear_sbhl_target_spaces", "CLEAR-SBHL-TARGET-SPACES", 0, 0, false);
        declareFunction(me, "clear_sbhl_target_space", "CLEAR-SBHL-TARGET-SPACE", 0, 0, false);
        declareFunction(me, "get_sbhl_terminating_marking_space", "GET-SBHL-TERMINATING-MARKING-SPACE", 0, 0, false);
        declareMacro(me, "with_sbhl_terminating_space", "WITH-SBHL-TERMINATING-SPACE");
        declareMacro(me, "within_sbhl_terminating_marking_space", "WITHIN-SBHL-TERMINATING-MARKING-SPACE");
        declareMacro(me, "with_sbhl_apply_marking_space", "WITH-SBHL-APPLY-MARKING-SPACE");
        declareFunction(me, "genl_preds_marking_p", "GENL-PREDS-MARKING-P", 1, 0, false);
        declareFunction(me, "genl_inverse_marking_p", "GENL-INVERSE-MARKING-P", 1, 0, false);
        declareFunction(me, "genl_preds_and_genl_inverse_marking_p", "GENL-PREDS-AND-GENL-INVERSE-MARKING-P", 1, 0, false);
        declareFunction(me, "genl_preds_opposite_marking", "GENL-PREDS-OPPOSITE-MARKING", 1, 0, false);
        declareFunction(me, "increment_sbhl_marking_generation", "INCREMENT-SBHL-MARKING-GENERATION", 0, 0, false);
        declareFunction(me, "get_sbhl_marking_generation", "GET-SBHL-MARKING-GENERATION", 0, 0, false);
        declareMacro(me, "with_new_sbhl_marking_generation", "WITH-NEW-SBHL-MARKING-GENERATION");
        declareFunction(me, "sbhl_suspend_new_spaces_during_mappingP", "SBHL-SUSPEND-NEW-SPACES-DURING-MAPPING?", 0, 0, false);
        declareMacro(me, "with_sbhl_mapping_marking_space", "WITH-SBHL-MAPPING-MARKING-SPACE");
        declareMacro(me, "with_sbhl_mapping_gather_marking_space", "WITH-SBHL-MAPPING-GATHER-MARKING-SPACE");
        declareMacro(me, "within_sbhl_mapping_marking_spaces", "WITHIN-SBHL-MAPPING-MARKING-SPACES");
        declareMacro(me, "sbhl_mark_mapping_fn_in_new_target_spaces", "SBHL-MARK-MAPPING-FN-IN-NEW-TARGET-SPACES");
        declareMacro(me, "sbhl_mark_mapping_fn_within_space", "SBHL-MARK-MAPPING-FN-WITHIN-SPACE");
        declareMacro(me, "sbhl_mark_gather_mapping_fn_within_gather_space", "SBHL-MARK-GATHER-MAPPING-FN-WITHIN-GATHER-SPACE");
        declareFunction(me, "sbhl_temporality_search_checks_nodes_in_target_space_p", "SBHL-TEMPORALITY-SEARCH-CHECKS-NODES-IN-TARGET-SPACE-P", 0, 0, false);
        declareMacro(me, "with_sbhl_temporality_search_checks_nodes_in_target_space", "WITH-SBHL-TEMPORALITY-SEARCH-CHECKS-NODES-IN-TARGET-SPACE");
        declareFunction(me, "sbhl_table_p", "SBHL-TABLE-P", 1, 0, false);
        declareMacro(me, "with_new_sbhl_table", "WITH-NEW-SBHL-TABLE");
        declareMacro(me, "with_sbhl_table_var", "WITH-SBHL-TABLE-VAR");
        declareMacro(me, "with_new_sbhl_table_named", "WITH-NEW-SBHL-TABLE-NAMED");
        declareMacro(me, "within_sbhl_table", "WITHIN-SBHL-TABLE");
        declareMacro(me, "do_sbhl_table", "DO-SBHL-TABLE");
        declareMacro(me, "map_sbhl_table", "MAP-SBHL-TABLE");
        declareMacro(me, "mark_in_sbhl_table", "MARK-IN-SBHL-TABLE");
        declareFunction(me, "get_sbhl_goal_table", "GET-SBHL-GOAL-TABLE", 0, 0, false);
        declareMacro(me, "with_sbhl_goal_table", "WITH-SBHL-GOAL-TABLE");
        return NIL;
    }

    public static SubLObject init_sbhl_marking_vars_file() {
        defparameter("*DEBUG-SBHL-MARKING-SPACES?*", NIL);
        defparameter("*USE-ZERO-SIZE-SBHL-MARKING-SPACES?*", T);
        defparameter("*RESOURCING-SBHL-MARKING-SPACES-P*", NIL);
        defparameter("*RESOURCED-SBHL-MARKING-SPACE-LIMIT*", NIL);
        defparameter("*RESOURCED-SBHL-MARKING-SPACES*", NIL);
        deflexical("*DEFAULT-RESOURCED-SBHL-SPACE-LIMIT*", FOUR_INTEGER);
        defparameter("*WITHIN-NEW-SBHL-MARKING-SPACE-RESOURCE*", NIL);
        defparameter("*SBHL-SPACE*", NIL);
        defparameter("*SBHL-GATHER-SPACE*", NIL);
        defparameter("*SBHL-DISJOINS-SPACE*", NIL);
        defparameter("*SBHL-SPACE-0*", NIL);
        defparameter("*SBHL-SPACE-1*", NIL);
        defparameter("*SBHL-SPACE-2*", NIL);
        defparameter("*SBHL-SPACE-3*", NIL);
        defparameter("*SBHL-SPACE-4*", NIL);
        defparameter("*SBHL-SPACE-5*", NIL);
        defparameter("*SBHL-SUSPEND-NEW-SPACES?*", NIL);
        defparameter("*SBHL-GOAL-SPACE*", NIL);
        defparameter("*SBHL-TARGET-SPACE*", NIL);
        defparameter("*SBHL-TARGET-GATHER-SPACE*", NIL);
        defparameter("*SBHL-TERMINATING-MARKING-SPACE*", NIL);
        defparameter("*SBHL-APPLY-MARKING-SPACE*", NIL);
        deflexical("*SBHL-GENL-PREDS-MARKING*", $list88);
        deflexical("*SBHL-GENL-INVERSE-MARKING*", $list89);
        deflexical("*SBHL-GENL-PREDS-AND-GENL-INVERSE-MARKING*", $list90);
        deflexical("*SBHL-GENL-INVERSE-AND-GENL-PREDS-MARKING*", $list91);
        defparameter("*SBHL-MARKING-GENERATION*", NIL);
        defparameter("*SBHL-SUSPEND-NEW-SPACES-DURING-MAPPING?*", NIL);
        defparameter("*SBHL-MAPPING-MARKING-SPACE*", NIL);
        defparameter("*SBHL-MAPPING-GATHER-MARKING-SPACE*", NIL);
        defparameter("*SBHL-TEMPORALITY-SEARCH-CHECKS-NODES-IN-TARGET-SPACE-P*", NIL);
        defparameter("*SBHL-TABLE*", $str99$Table_used_for_public_marking_int);
        defparameter("*SBHL-GOAL-TABLE*", NIL);
        return NIL;
    }

    public static SubLObject setup_sbhl_marking_vars_file() {
        register_macro_helper(DETERMINE_RESOURCE_LIMIT, WITH_SBHL_RESOURCED_MARKING_SPACES);
        register_macro_helper(POSSIBLY_NEW_MARKING_RESOURCE, WITH_SBHL_RESOURCED_MARKING_SPACES);
        register_macro_helper(DETERMINE_MARKING_SPACE_LIMIT, NIL);
        register_macro_helper(POSSIBLY_WITH_NEW_SBHL_SPACE, POSSIBLY_WITH_NEW_SBHL_SPACES);
        register_macro_helper(SBHL_NEW_SPACE_SOURCE, POSSIBLY_WITH_NEW_SBHL_SPACES);
        register_macro_helper(SBHL_GET_NEW_SPACE, POSSIBLY_WITH_NEW_SBHL_SPACES);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_sbhl_marking_vars_file();
    }

    @Override
    public void initializeVariables() {
        init_sbhl_marking_vars_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_sbhl_marking_vars_file();
    }

    static {






















































































































































    }
}

/**
 * Total time: 253 ms
 */
