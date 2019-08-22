/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl.sbhl;


import static com.cyc.cycjava.cycl.access_macros.register_macro_helper;
import static com.cyc.cycjava.cycl.constant_handles.reader_make_constant_shell;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.append;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.listS;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.eq;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.eql;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.make_hash_table;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.max;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.subtract;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.length;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.nreverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.hash_table_p;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeInteger;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeUninternedSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.cdestructuring_bind_error;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_listp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.property_list_member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cadr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.bq_cons;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.declareMacro;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;

import com.cyc.cycjava.cycl.V12;
import com.cyc.cycjava.cycl.hash_table_utilities;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.util.SubLFiles.LispMethod;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      SBHL-MARKING-VARS
 * source file: /cyc/top/cycl/sbhl/sbhl-marking-vars.lisp
 * created:     2019/07/03 17:37:18
 */
public final class sbhl_marking_vars extends SubLTranslatedFile implements V12 {
    public static final SubLFile me = new sbhl_marking_vars();

 public static final String myName = "com.cyc.cycjava.cycl.sbhl.sbhl_marking_vars";


    // defparameter
    // Definitions
    @LispMethod(comment = "defparameter")
    public static final SubLSymbol $debug_sbhl_marking_spacesP$ = makeSymbol("*DEBUG-SBHL-MARKING-SPACES?*");

    // defparameter
    @LispMethod(comment = "defparameter")
    public static final SubLSymbol $use_zero_size_sbhl_marking_spacesP$ = makeSymbol("*USE-ZERO-SIZE-SBHL-MARKING-SPACES?*");

    // deflexical
    // The default number of spaces to resource.
    /**
     * The default number of spaces to resource.
     */
    @LispMethod(comment = "The default number of spaces to resource.\ndeflexical")
    private static final SubLSymbol $default_resourced_sbhl_space_limit$ = makeSymbol("*DEFAULT-RESOURCED-SBHL-SPACE-LIMIT*");

    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $within_new_sbhl_marking_space_resource$ = makeSymbol("*WITHIN-NEW-SBHL-MARKING-SPACE-RESOURCE*");

    // defparameter
    // a context name used for marking disjoins
    /**
     * a context name used for marking disjoins
     */
    @LispMethod(comment = "a context name used for marking disjoins\ndefparameter")
    public static final SubLSymbol $sbhl_disjoins_space$ = makeSymbol("*SBHL-DISJOINS-SPACE*");

    // defparameter
    // a variable to use for sbhl spaces
    /**
     * a variable to use for sbhl spaces
     */
    @LispMethod(comment = "a variable to use for sbhl spaces\ndefparameter")
    public static final SubLSymbol $sbhl_space_0$ = makeSymbol("*SBHL-SPACE-0*");

    // defparameter
    // a variable to use for sbhl spaces
    /**
     * a variable to use for sbhl spaces
     */
    @LispMethod(comment = "a variable to use for sbhl spaces\ndefparameter")
    public static final SubLSymbol $sbhl_space_1$ = makeSymbol("*SBHL-SPACE-1*");

    // defparameter
    // a variable to use for sbhl spaces
    /**
     * a variable to use for sbhl spaces
     */
    @LispMethod(comment = "a variable to use for sbhl spaces\ndefparameter")
    public static final SubLSymbol $sbhl_space_2$ = makeSymbol("*SBHL-SPACE-2*");

    // defparameter
    // a variable to use for sbhl spaces
    /**
     * a variable to use for sbhl spaces
     */
    @LispMethod(comment = "a variable to use for sbhl spaces\ndefparameter")
    public static final SubLSymbol $sbhl_space_3$ = makeSymbol("*SBHL-SPACE-3*");

    // defparameter
    // a variable to use for sbhl spaces
    /**
     * a variable to use for sbhl spaces
     */
    @LispMethod(comment = "a variable to use for sbhl spaces\ndefparameter")
    public static final SubLSymbol $sbhl_space_4$ = makeSymbol("*SBHL-SPACE-4*");

    // defparameter
    // a variable to use for sbhl spaces
    /**
     * a variable to use for sbhl spaces
     */
    @LispMethod(comment = "a variable to use for sbhl spaces\ndefparameter")
    public static final SubLSymbol $sbhl_space_5$ = makeSymbol("*SBHL-SPACE-5*");

    // defparameter
    // Toggle variable to suspend creation of new spaces during search.
    /**
     * Toggle variable to suspend creation of new spaces during search.
     */
    @LispMethod(comment = "Toggle variable to suspend creation of new spaces during search.\ndefparameter")
    public static final SubLSymbol $sbhl_suspend_new_spacesP$ = makeSymbol("*SBHL-SUSPEND-NEW-SPACES?*");

    // deflexical
    // The marking for nodes only accessed in predicate mode during search
    /**
     * The marking for nodes only accessed in predicate mode during search
     */
    @LispMethod(comment = "The marking for nodes only accessed in predicate mode during search\ndeflexical")
    public static final SubLSymbol $sbhl_genl_preds_marking$ = makeSymbol("*SBHL-GENL-PREDS-MARKING*");

    // deflexical
    /**
     * The marking for nodes only accessed in argument-flipped mode during search
     */
    @LispMethod(comment = "The marking for nodes only accessed in argument-flipped mode during search\ndeflexical")
    public static final SubLSymbol $sbhl_genl_inverse_marking$ = makeSymbol("*SBHL-GENL-INVERSE-MARKING*");

    // deflexical
    /**
     * The marking for nodes accessed in both predicate argument-flipped modes and
     * during search
     */
    @LispMethod(comment = "The marking for nodes accessed in both predicate argument-flipped modes and\r\nduring search\ndeflexical\nThe marking for nodes accessed in both predicate argument-flipped modes and\nduring search")
    public static final SubLSymbol $sbhl_genl_preds_and_genl_inverse_marking$ = makeSymbol("*SBHL-GENL-PREDS-AND-GENL-INVERSE-MARKING*");

    // deflexical
    /**
     * The marking for nodes accessed in both predicate argument-flipped modes and
     * during search
     */
    @LispMethod(comment = "The marking for nodes accessed in both predicate argument-flipped modes and\r\nduring search\ndeflexical\nThe marking for nodes accessed in both predicate argument-flipped modes and\nduring search")
    public static final SubLSymbol $sbhl_genl_inverse_and_genl_preds_marking$ = makeSymbol("*SBHL-GENL-INVERSE-AND-GENL-PREDS-MARKING*");

    // defparameter
    // The current marking generation.
    /**
     * The current marking generation.
     */
    @LispMethod(comment = "The current marking generation.\ndefparameter")
    public static final SubLSymbol $sbhl_marking_generation$ = makeSymbol("*SBHL-MARKING-GENERATION*");

    // defparameter
    /**
     * Toggle parameter for whether to suspend the creation of new search spaces
     * during mapping.
     */
    @LispMethod(comment = "Toggle parameter for whether to suspend the creation of new search spaces\r\nduring mapping.\ndefparameter\nToggle parameter for whether to suspend the creation of new search spaces\nduring mapping.")
    public static final SubLSymbol $sbhl_suspend_new_spaces_during_mappingP$ = makeSymbol("*SBHL-SUSPEND-NEW-SPACES-DURING-MAPPING?*");

    // defparameter
    /**
     * Parameter determining whether a time search checks markings in target space
     * (for searching marked nodes)
     */
    @LispMethod(comment = "Parameter determining whether a time search checks markings in target space\r\n(for searching marked nodes)\ndefparameter\nParameter determining whether a time search checks markings in target space\n(for searching marked nodes)")
    public static final SubLSymbol $sbhl_temporality_search_checks_nodes_in_target_space_p$ = makeSymbol("*SBHL-TEMPORALITY-SEARCH-CHECKS-NODES-IN-TARGET-SPACE-P*");

    private static final SubLInteger $int$3000 = makeInteger(3000);

    static private final SubLList $list2 = list(makeSymbol("SPACE"), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list4 = list(list(makeSymbol("GET-SBHL-MARKING-SPACE")));

    private static final SubLSymbol FREE_SBHL_MARKING_SPACE = makeSymbol("FREE-SBHL-MARKING-SPACE");

    static private final SubLList $list8 = list(makeSymbol("NUM"), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLSymbol $sym9$ALREADY_RESOURCING_P = makeUninternedSymbol("ALREADY-RESOURCING-P");

    private static final SubLList $list10 = list(makeSymbol("*RESOURCING-SBHL-MARKING-SPACES-P*"));

    public static final SubLSymbol $resourced_sbhl_marking_space_limit$ = makeSymbol("*RESOURCED-SBHL-MARKING-SPACE-LIMIT*");

    private static final SubLSymbol DETERMINE_RESOURCE_LIMIT = makeSymbol("DETERMINE-RESOURCE-LIMIT");

    public static final SubLSymbol $resourced_sbhl_marking_spaces$ = makeSymbol("*RESOURCED-SBHL-MARKING-SPACES*");

    private static final SubLSymbol POSSIBLY_NEW_MARKING_RESOURCE = makeSymbol("POSSIBLY-NEW-MARKING-RESOURCE");

    static private final SubLList $list15 = list(list(makeSymbol("*RESOURCING-SBHL-MARKING-SPACES-P*"), T));

    private static final SubLSymbol WITH_SBHL_RESOURCED_MARKING_SPACES = makeSymbol("WITH-SBHL-RESOURCED-MARKING-SPACES");

    private static final SubLList $list17 = list(list(makeSymbol("*RESOURCING-SBHL-MARKING-SPACES-P*"), NIL));

    static private final SubLList $list18 = list(makeSymbol("RESOURCING-P"), makeSymbol("&BODY"), makeSymbol("BODY"));

    public static final SubLSymbol $resourcing_sbhl_marking_spaces_p$ = makeSymbol("*RESOURCING-SBHL-MARKING-SPACES-P*");

    private static final SubLList $list20 = list(makeSymbol("SBHL-MS-RESOURCE"), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list21 = list(list(makeSymbol("*RESOURCING-SBHL-MARKING-SPACES-P*"), T), list(makeSymbol("*RESOURCED-SBHL-MARKING-SPACE-LIMIT*"), list(makeSymbol("DETERMINE-MARKING-SPACE-LIMIT"), makeSymbol("*RESOURCED-SBHL-MARKING-SPACES*"))));

    static private final SubLList $list23 = list(makeSymbol("*RESOURCED-SBHL-MARKING-SPACES*"));

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

    static private final SubLList $list47 = list(list(makeSymbol("SPACE"), makeSymbol("SOURCE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLList $list49 = list(makeKeyword("OLD"));

    private static final SubLSymbol SBHL_GET_NEW_SPACE = makeSymbol("SBHL-GET-NEW-SPACE");

    private static final SubLList $list52 = list(makeKeyword("RESOURCE"));

    private static final SubLSymbol UPDATE_SBHL_RESOURCED_SPACES = makeSymbol("UPDATE-SBHL-RESOURCED-SPACES");

    private static final SubLSymbol SBHL_NEW_SPACE_SOURCE = makeSymbol("SBHL-NEW-SPACE-SOURCE");

    static private final SubLList $list58 = list(makeSymbol("VAR"), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list59 = list(makeSymbol("*SBHL-SPACE*"));

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

    static private final SubLList $list84 = list(makeSymbol("SPACE-VAR"), makeSymbol("&BODY"), makeSymbol("BODY"));

    public static final SubLSymbol $sbhl_terminating_marking_space$ = makeSymbol("*SBHL-TERMINATING-MARKING-SPACE*");

    static private final SubLList $list86 = list(list(makeSymbol("*SBHL-SPACE*"), makeSymbol("*SBHL-TERMINATING-MARKING-SPACE*")));

    public static final SubLSymbol $sbhl_apply_marking_space$ = makeSymbol("*SBHL-APPLY-MARKING-SPACE*");

    static private final SubLList $list88 = list(reader_make_constant_shell("genlPreds"));

    static private final SubLList $list89 = list(reader_make_constant_shell("genlInverse"));

    static private final SubLList $list90 = list(reader_make_constant_shell("genlPreds"), reader_make_constant_shell("genlInverse"));

    private static final SubLList $list91 = list(reader_make_constant_shell("genlInverse"), reader_make_constant_shell("genlPreds"));

    private static final SubLList $list92 = list(list(makeSymbol("*SBHL-MARKING-GENERATION*"), ZERO_INTEGER));

    public static final SubLSymbol $sbhl_mapping_marking_space$ = makeSymbol("*SBHL-MAPPING-MARKING-SPACE*");

    public static final SubLSymbol $sbhl_mapping_gather_marking_space$ = makeSymbol("*SBHL-MAPPING-GATHER-MARKING-SPACE*");

    static private final SubLList $list95 = list(list(makeSymbol("*SBHL-SPACE*"), makeSymbol("*SBHL-MAPPING-MARKING-SPACE*")), list(makeSymbol("*SBHL-GATHER-SPACE*"), makeSymbol("*SBHL-MAPPING-GATHER-MARKING-SPACE*")));

    static private final SubLList $list96 = list(list(makeSymbol("*SBHL-MAPPING-MARKING-SPACE*"), makeSymbol("*SBHL-TARGET-SPACE*")), list(makeSymbol("*SBHL-MAPPING-GATHER-MARKING-SPACE*"), makeSymbol("*SBHL-TARGET-GATHER-SPACE*")), list(makeSymbol("*SBHL-SUSPEND-NEW-SPACES-DURING-MAPPING?*"), T));

    private static final SubLList $list97 = list(list(makeSymbol("*SBHL-SUSPEND-NEW-SPACES-DURING-MAPPING?*"), T));

    private static final SubLList $list98 = list(list(makeSymbol("*SBHL-TEMPORALITY-SEARCH-CHECKS-NODES-IN-TARGET-SPACE-P*"), T));

    private static final SubLString $str99$Table_used_for_public_marking_int = makeString("Table used for public marking interface");

    public static final SubLSymbol $sbhl_table$ = makeSymbol("*SBHL-TABLE*");

    static private final SubLList $list101 = list(makeSymbol("*SBHL-TABLE*"));

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

    public static final SubLObject average_genl_cardinality_alt(SubLObject module) {
        if (module == UNPROVIDED) {
            module = NIL;
        }
        return $int$100;
    }

    public static SubLObject average_genl_cardinality(SubLObject module) {
        if (module == UNPROVIDED) {
            module = NIL;
        }
        return $int$100;
    }

    public static final SubLObject average_spec_cardinality_alt(SubLObject module) {
        if (module == UNPROVIDED) {
            module = NIL;
        }
        return $int$3000;
    }

    public static SubLObject average_spec_cardinality(SubLObject module) {
        if (module == UNPROVIDED) {
            module = NIL;
        }
        return $int$3000;
    }

    public static final SubLObject get_sbhl_marking_space_alt() {
        if (NIL != com.cyc.cycjava.cycl.sbhl.sbhl_marking_vars.resourcing_sbhl_marking_spaces_p()) {
            return com.cyc.cycjava.cycl.sbhl.sbhl_marking_vars.get_sbhl_resourced_marking_space();
        } else {
            return com.cyc.cycjava.cycl.sbhl.sbhl_marking_vars.instantiate_sbhl_marking_space();
        }
    }

    public static SubLObject get_sbhl_marking_space() {
        if (NIL != resourcing_sbhl_marking_spaces_p()) {
            return get_sbhl_resourced_marking_space();
        }
        return instantiate_sbhl_marking_space();
    }

    public static final SubLObject free_sbhl_marking_space_alt(SubLObject space) {
        if (NIL != com.cyc.cycjava.cycl.sbhl.sbhl_marking_vars.resourcing_sbhl_marking_spaces_p()) {
            com.cyc.cycjava.cycl.sbhl.sbhl_marking_vars.update_sbhl_resourced_spaces(space);
        }
        return NIL;
    }

    public static SubLObject free_sbhl_marking_space(final SubLObject space) {
        if (NIL != resourcing_sbhl_marking_spaces_p()) {
            update_sbhl_resourced_spaces(space);
        }
        return NIL;
    }

    /**
     * Creates an sbhl-space-p
     */
    @LispMethod(comment = "Creates an sbhl-space-p")
    public static final SubLObject instantiate_sbhl_marking_space_alt() {
        if (NIL != sbhl_search_vars.sbhl_forward_search_p()) {
            return make_hash_table(com.cyc.cycjava.cycl.sbhl.sbhl_marking_vars.average_genl_cardinality(UNPROVIDED), symbol_function(EQUAL), UNPROVIDED);
        } else {
            if (NIL != sbhl_search_vars.sbhl_backward_search_p()) {
                return make_hash_table(com.cyc.cycjava.cycl.sbhl.sbhl_marking_vars.average_spec_cardinality(UNPROVIDED), symbol_function(EQUAL), UNPROVIDED);
            } else {
                return make_hash_table(com.cyc.cycjava.cycl.sbhl.sbhl_marking_vars.average_genl_cardinality(UNPROVIDED), symbol_function(EQUAL), UNPROVIDED);
            }
        }
    }

    /**
     * Creates an sbhl-space-p
     */
    @LispMethod(comment = "Creates an sbhl-space-p")
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

    /**
     * Either creates or gives a resourced sbhl-space-p bound to SPACE within BODY.
     */
    @LispMethod(comment = "Either creates or gives a resourced sbhl-space-p bound to SPACE within BODY.")
    public static final SubLObject instantiate_sbhl_marking_space_for_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject space = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt2);
            space = current.first();
            current = current.rest();
            {
                SubLObject body = current;
                return listS(CLET, list(bq_cons(space, $list_alt4)), append(body, list(list(FREE_SBHL_MARKING_SPACE, space))));
            }
        }
    }

    /**
     * Either creates or gives a resourced sbhl-space-p bound to SPACE within BODY.
     */
    @LispMethod(comment = "Either creates or gives a resourced sbhl-space-p bound to SPACE within BODY.")
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

    /**
     * Accessor. Determines whether to resource sbhl marking spaces.
     */
    @LispMethod(comment = "Accessor. Determines whether to resource sbhl marking spaces.")
    public static final SubLObject resourcing_sbhl_marking_spaces_p_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return $resourcing_sbhl_marking_spaces_p$.getDynamicValue(thread);
        }
    }

    /**
     * Accessor. Determines whether to resource sbhl marking spaces.
     */
    @LispMethod(comment = "Accessor. Determines whether to resource sbhl marking spaces.")
    public static SubLObject resourcing_sbhl_marking_spaces_p() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return $resourcing_sbhl_marking_spaces_p$.getDynamicValue(thread);
    }

    /**
     * Sets resourcing of spaces within BODY. Up to NUM spaces are resourced. It's best to make NUM an even number.
     */
    @LispMethod(comment = "Sets resourcing of spaces within BODY. Up to NUM spaces are resourced. It\'s best to make NUM an even number.")
    public static final SubLObject with_sbhl_resourced_marking_spaces_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject num = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt6);
            num = current.first();
            current = current.rest();
            {
                SubLObject body = current;
                SubLObject already_resourcing_p = $sym7$ALREADY_RESOURCING_P;
                return listS(CLET, listS(bq_cons(already_resourcing_p, $list_alt8), list($resourced_sbhl_marking_space_limit$, list(DETERMINE_RESOURCE_LIMIT, already_resourcing_p, num)), list($resourced_sbhl_marking_spaces$, list(POSSIBLY_NEW_MARKING_RESOURCE, already_resourcing_p)), $list_alt13), append(body, NIL));
            }
        }
    }

    /**
     * Sets resourcing of spaces within BODY. Up to NUM spaces are resourced. It's best to make NUM an even number.
     */
    @LispMethod(comment = "Sets resourcing of spaces within BODY. Up to NUM spaces are resourced. It\'s best to make NUM an even number.")
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

    public static final SubLObject determine_resource_limit_alt(SubLObject resourcing_p, SubLObject num) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != resourcing_p) {
                return max($resourced_sbhl_marking_space_limit$.getDynamicValue(thread), num);
            }
            return num;
        }
    }

    public static SubLObject determine_resource_limit(final SubLObject resourcing_p, final SubLObject num) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != resourcing_p) {
            return max($resourced_sbhl_marking_space_limit$.getDynamicValue(thread), num);
        }
        return num;
    }

    public static final SubLObject possibly_new_marking_resource_alt(SubLObject resourcing_p) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != resourcing_p) {
                return $resourced_sbhl_marking_spaces$.getDynamicValue(thread);
            }
            return NIL;
        }
    }

    public static SubLObject possibly_new_marking_resource(final SubLObject resourcing_p) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != resourcing_p) {
            return $resourced_sbhl_marking_spaces$.getDynamicValue(thread);
        }
        return NIL;
    }

    /**
     * Toggle off the resourcing of SBHL marking spaces within BODY.
     */
    @LispMethod(comment = "Toggle off the resourcing of SBHL marking spaces within BODY.")
    public static final SubLObject without_sbhl_resourced_marking_spaces_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject body = current;
            return listS(CLET, $list_alt15, append(body, NIL));
        }
    }

    /**
     * Toggle off the resourcing of SBHL marking spaces within BODY.
     */
    @LispMethod(comment = "Toggle off the resourcing of SBHL marking spaces within BODY.")
    public static SubLObject without_sbhl_resourced_marking_spaces(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(CLET, $list17, append(body, NIL));
    }

    /**
     * Toggle the resourcing of SBHL marking spaces within BODY.
     */
    @LispMethod(comment = "Toggle the resourcing of SBHL marking spaces within BODY.")
    public static final SubLObject toggle_sbhl_resourced_marking_spaces_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject resourcing_p = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt16);
            resourcing_p = current.first();
            current = current.rest();
            {
                SubLObject body = current;
                return listS(CLET, list(list($resourcing_sbhl_marking_spaces_p$, resourcing_p)), append(body, NIL));
            }
        }
    }

    /**
     * Toggle the resourcing of SBHL marking spaces within BODY.
     */
    @LispMethod(comment = "Toggle the resourcing of SBHL marking spaces within BODY.")
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

    /**
     * Returns a resource of sbhl marking spaces.
     */
    @LispMethod(comment = "Returns a resource of sbhl marking spaces.")
    public static final SubLObject new_sbhl_marking_space_resource_alt(SubLObject num) {
        if (num == UNPROVIDED) {
            num = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject default_num = (NIL != num) ? ((SubLObject) (num)) : ZERO_INTEGER;
                SubLObject result = NIL;
                {
                    SubLObject _prev_bind_0 = $within_new_sbhl_marking_space_resource$.currentBinding(thread);
                    try {
                        $within_new_sbhl_marking_space_resource$.bind(T, thread);
                        {
                            SubLObject i = NIL;
                            for (i = ZERO_INTEGER; i.numL(default_num); i = add(i, ONE_INTEGER)) {
                                result = cons(com.cyc.cycjava.cycl.sbhl.sbhl_marking_vars.instantiate_sbhl_marking_space(), result);
                            }
                        }
                    } finally {
                        $within_new_sbhl_marking_space_resource$.rebind(_prev_bind_0, thread);
                    }
                }
                return nreverse(result);
            }
        }
    }

    /**
     * Returns a resource of sbhl marking spaces.
     */
    @LispMethod(comment = "Returns a resource of sbhl marking spaces.")
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

    /**
     * Returns the current resourced sbhl marking spaces. @xref *resourced-sbhl-marking-spaces*
     */
    @LispMethod(comment = "Returns the current resourced sbhl marking spaces. @xref *resourced-sbhl-marking-spaces*")
    public static final SubLObject current_sbhl_marking_space_resource_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return $resourced_sbhl_marking_spaces$.getDynamicValue(thread);
        }
    }

    /**
     * Returns the current resourced sbhl marking spaces. @xref *resourced-sbhl-marking-spaces*
     */
    @LispMethod(comment = "Returns the current resourced sbhl marking spaces. @xref *resourced-sbhl-marking-spaces*")
    public static SubLObject current_sbhl_marking_space_resource() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return $resourced_sbhl_marking_spaces$.getDynamicValue(thread);
    }

    /**
     * Sets resourcing of spaces within BODY to use SBHL-MS-RESOURCE
     */
    @LispMethod(comment = "Sets resourcing of spaces within BODY to use SBHL-MS-RESOURCE")
    public static final SubLObject with_sbhl_marking_space_resource_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject sbhl_ms_resource = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt18);
            sbhl_ms_resource = current.first();
            current = current.rest();
            {
                SubLObject body = current;
                return listS(CLET, bq_cons(list($resourced_sbhl_marking_spaces$, sbhl_ms_resource), $list_alt19), append(body, list(listS(CSETQ, sbhl_ms_resource, $list_alt21))));
            }
        }
    }

    /**
     * Sets resourcing of spaces within BODY to use SBHL-MS-RESOURCE
     */
    @LispMethod(comment = "Sets resourcing of spaces within BODY to use SBHL-MS-RESOURCE")
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

    /**
     * Sets resourcing of spaces within BODY to a new marking resource, of at most NUM spaces (or @xref *default-resourced-sbhl-space-limit*).
     */
    @LispMethod(comment = "Sets resourcing of spaces within BODY to a new marking resource, of at most NUM spaces (or @xref *default-resourced-sbhl-space-limit*).")
    public static final SubLObject with_new_sbhl_marking_space_resource_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt22);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject allow_other_keys_p = NIL;
                    SubLObject rest = current;
                    SubLObject bad = NIL;
                    SubLObject current_1 = NIL;
                    for (; NIL != rest;) {
                        destructuring_bind_must_consp(rest, datum, $list_alt22);
                        current_1 = rest.first();
                        rest = rest.rest();
                        destructuring_bind_must_consp(rest, datum, $list_alt22);
                        if (NIL == member(current_1, $list_alt23, UNPROVIDED, UNPROVIDED)) {
                            bad = T;
                        }
                        if (current_1 == $ALLOW_OTHER_KEYS) {
                            allow_other_keys_p = rest.first();
                        }
                        rest = rest.rest();
                    }
                    if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                        cdestructuring_bind_error(datum, $list_alt22);
                    }
                    {
                        SubLObject num_tail = property_list_member($NUM, current);
                        SubLObject num = (NIL != num_tail) ? ((SubLObject) (cadr(num_tail))) : NIL;
                        current = temp;
                        {
                            SubLObject body = current;
                            SubLObject sbhl_ms_resource = $sym26$SBHL_MS_RESOURCE;
                            return list(CLET, list(list(sbhl_ms_resource, list(NEW_SBHL_MARKING_SPACE_RESOURCE, num))), listS(WITH_SBHL_MARKING_SPACE_RESOURCE, sbhl_ms_resource, append(body, NIL)));
                        }
                    }
                }
            }
        }
    }

    /**
     * Sets resourcing of spaces within BODY to a new marking resource, of at most NUM spaces (or @xref *default-resourced-sbhl-space-limit*).
     */
    @LispMethod(comment = "Sets resourcing of spaces within BODY to a new marking resource, of at most NUM spaces (or @xref *default-resourced-sbhl-space-limit*).")
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

    public static final SubLObject determine_marking_space_limit_alt(SubLObject marking_resource) {
        {
            SubLObject length = length(marking_resource);
            if (length == ZERO_INTEGER) {
                return $default_resourced_sbhl_space_limit$.getGlobalValue();
            } else {
                return length;
            }
        }
    }

    public static SubLObject determine_marking_space_limit(final SubLObject marking_resource) {
        final SubLObject length = length(marking_resource);
        if (length.eql(ZERO_INTEGER)) {
            return $default_resourced_sbhl_space_limit$.getGlobalValue();
        }
        return length;
    }

    /**
     * Accessor. @return sbhl-space-p. Gets an available resourced sbhl-marking-space, if one exists.  If not, it creates one.
     */
    @LispMethod(comment = "Accessor. @return sbhl-space-p. Gets an available resourced sbhl-marking-space, if one exists.  If not, it creates one.")
    public static final SubLObject get_sbhl_resourced_marking_space_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result = NIL;
                result = $resourced_sbhl_marking_spaces$.getDynamicValue(thread).first();
                if (NIL != result) {
                    if (NIL != $debug_sbhl_marking_spacesP$.getDynamicValue(thread)) {
                        if (NIL == hash_table_utilities.hash_table_empty_p(result)) {
                            Errors.warn($str_alt30$Dirty_resourced_marking_space_bei, result);
                        }
                    }
                    $resourced_sbhl_marking_spaces$.setDynamicValue($resourced_sbhl_marking_spaces$.getDynamicValue(thread).rest(), thread);
                } else {
                    result = com.cyc.cycjava.cycl.sbhl.sbhl_marking_vars.instantiate_sbhl_marking_space();
                }
                return result;
            }
        }
    }

    /**
     * Accessor. @return sbhl-space-p. Gets an available resourced sbhl-marking-space, if one exists.  If not, it creates one.
     */
    @LispMethod(comment = "Accessor. @return sbhl-space-p. Gets an available resourced sbhl-marking-space, if one exists.  If not, it creates one.")
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

    /**
     * Modifier. pushes SPACE onto resourced spaces, unless they are over the limit.
     */
    @LispMethod(comment = "Modifier. pushes SPACE onto resourced spaces, unless they are over the limit.")
    public static final SubLObject update_sbhl_resourced_spaces_alt(SubLObject space) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != list_utilities.lengthGE($resourced_sbhl_marking_spaces$.getDynamicValue(thread), $resourced_sbhl_marking_space_limit$.getDynamicValue(thread), UNPROVIDED)) {
                if (NIL != $debug_sbhl_marking_spacesP$.getDynamicValue(thread)) {
                    Errors.warn($str_alt31$Need_more_than_the_limit_of__A_ma, $resourced_sbhl_marking_space_limit$.getDynamicValue(thread));
                }
            } else {
                sbhl_marking_utilities.clear_sbhl_space(space);
                $resourced_sbhl_marking_spaces$.setDynamicValue(cons(space, $resourced_sbhl_marking_spaces$.getDynamicValue(thread)), thread);
            }
            return NIL;
        }
    }

    /**
     * Modifier. pushes SPACE onto resourced spaces, unless they are over the limit.
     */
    @LispMethod(comment = "Modifier. pushes SPACE onto resourced spaces, unless they are over the limit.")
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

    /**
     * Modifier. Clears the spaces from *resourced-sbhl-marking-spaces*
     */
    @LispMethod(comment = "Modifier. Clears the spaces from *resourced-sbhl-marking-spaces*")
    public static final SubLObject clear_recourced_sbhl_spaces_alt() {
        $resourced_sbhl_marking_spaces$.setDynamicValue(NIL);
        return NIL;
    }

    /**
     * Modifier. Clears the spaces from *resourced-sbhl-marking-spaces*
     */
    @LispMethod(comment = "Modifier. Clears the spaces from *resourced-sbhl-marking-spaces*")
    public static SubLObject clear_recourced_sbhl_spaces() {
        $resourced_sbhl_marking_spaces$.setDynamicValue(NIL);
        return NIL;
    }

    /**
     * Accessor: @return booleanp; whether SPACE has valid type to be an sbhl-space
     */
    @LispMethod(comment = "Accessor: @return booleanp; whether SPACE has valid type to be an sbhl-space")
    public static final SubLObject sbhl_space_obect_p_alt(SubLObject space) {
        return hash_table_p(space);
    }

    /**
     * Accessor: @return booleanp; whether SPACE has valid type to be an sbhl-space
     */
    @LispMethod(comment = "Accessor: @return booleanp; whether SPACE has valid type to be an sbhl-space")
    public static SubLObject sbhl_space_obect_p(final SubLObject space) {
        return hash_table_p(space);
    }

    /**
     * Accessor: @return sbhl-space-object-p; the current context for marking
     */
    @LispMethod(comment = "Accessor: @return sbhl-space-object-p; the current context for marking")
    public static final SubLObject get_sbhl_space_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return $sbhl_space$.getDynamicValue(thread);
        }
    }

    /**
     * Accessor: @return sbhl-space-object-p; the current context for marking
     */
    @LispMethod(comment = "Accessor: @return sbhl-space-object-p; the current context for marking")
    public static SubLObject get_sbhl_space() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return $sbhl_space$.getDynamicValue(thread);
    }

    /**
     * Accessor: @return sbhl-space-object-p; @see *sbhl-gather-space*
     */
    @LispMethod(comment = "Accessor: @return sbhl-space-object-p; @see *sbhl-gather-space*")
    public static final SubLObject get_sbhl_gather_space_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return $sbhl_gather_space$.getDynamicValue(thread);
        }
    }

    /**
     * Accessor: @return sbhl-space-object-p; @see *sbhl-gather-space*
     */
    @LispMethod(comment = "Accessor: @return sbhl-space-object-p; @see *sbhl-gather-space*")
    public static SubLObject get_sbhl_gather_space() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return $sbhl_gather_space$.getDynamicValue(thread);
    }

    /**
     * Initializes *sbhl-space* to a new hash table
     */
    @LispMethod(comment = "Initializes *sbhl-space* to a new hash table")
    public static final SubLObject with_new_sbhl_space_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject body = current;
            return listS(INSTANTIATE_SBHL_MARKING_SPACE_FOR, $sbhl_space$, append(body, NIL));
        }
    }

    /**
     * Initializes *sbhl-space* to a new hash table
     */
    @LispMethod(comment = "Initializes *sbhl-space* to a new hash table")
    public static SubLObject with_new_sbhl_space(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(INSTANTIATE_SBHL_MARKING_SPACE_FOR, $sbhl_space$, append(body, NIL));
    }

    /**
     * Initializes *sbhl-space* and names it NAME.
     */
    @LispMethod(comment = "Initializes *sbhl-space* and names it NAME.")
    public static final SubLObject with_new_sbhl_space_named_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject name = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt34);
            name = current.first();
            current = current.rest();
            {
                SubLObject body = current;
                return list(WITH_NEW_SBHL_SPACE, listS(WITH_SBHL_SPACE_VAR, name, append(body, NIL)));
            }
        }
    }

    /**
     * Initializes *sbhl-space* and names it NAME.
     */
    @LispMethod(comment = "Initializes *sbhl-space* and names it NAME.")
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

    /**
     * Initializes *sbhl-gather-space* to a new hash table
     */
    @LispMethod(comment = "Initializes *sbhl-gather-space* to a new hash table")
    public static final SubLObject with_new_sbhl_gather_space_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject body = current;
            return listS(INSTANTIATE_SBHL_MARKING_SPACE_FOR, $sbhl_gather_space$, append(body, NIL));
        }
    }

    /**
     * Initializes *sbhl-gather-space* to a new hash table
     */
    @LispMethod(comment = "Initializes *sbhl-gather-space* to a new hash table")
    public static SubLObject with_new_sbhl_gather_space(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(INSTANTIATE_SBHL_MARKING_SPACE_FOR, $sbhl_gather_space$, append(body, NIL));
    }

    /**
     * Initializes new *sbhl-space* and *sbhl-gather-space* hash tables.
     */
    @LispMethod(comment = "Initializes new *sbhl-space* and *sbhl-gather-space* hash tables.")
    public static final SubLObject with_new_sbhl_spaces_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject body = current;
            return list(WITH_NEW_SBHL_SPACE, bq_cons(WITH_NEW_SBHL_GATHER_SPACE, append(body, NIL)));
        }
    }

    /**
     * Initializes new *sbhl-space* and *sbhl-gather-space* hash tables.
     */
    @LispMethod(comment = "Initializes new *sbhl-space* and *sbhl-gather-space* hash tables.")
    public static SubLObject with_new_sbhl_spaces(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return list(WITH_NEW_SBHL_SPACE, bq_cons(WITH_NEW_SBHL_GATHER_SPACE, append(body, NIL)));
    }

    /**
     * Initializes new *sbhl-space* and *sbhl-gather-space* and turns on a filter to suspend creating new spaces in search.
     */
    @LispMethod(comment = "Initializes new *sbhl-space* and *sbhl-gather-space* and turns on a filter to suspend creating new spaces in search.")
    public static final SubLObject with_new_sbhl_spaces_used_repeatedly_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject body = current;
            return list(WITH_NEW_SBHL_SPACES, bq_cons(WITH_SAME_SBHL_SPACES, append(body, NIL)));
        }
    }

    /**
     * Initializes new *sbhl-space* and *sbhl-gather-space* and turns on a filter to suspend creating new spaces in search.
     */
    @LispMethod(comment = "Initializes new *sbhl-space* and *sbhl-gather-space* and turns on a filter to suspend creating new spaces in search.")
    public static SubLObject with_new_sbhl_spaces_used_repeatedly(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return list(WITH_NEW_SBHL_SPACES, bq_cons(WITH_SAME_SBHL_SPACES, append(body, NIL)));
    }

    /**
     * Initializes new *sbhl-space* and turns on a filter to suspend creating new spaces in search.
     */
    @LispMethod(comment = "Initializes new *sbhl-space* and turns on a filter to suspend creating new spaces in search.")
    public static final SubLObject with_new_sbhl_space_used_repeatedly_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject body = current;
            return list(WITH_NEW_SBHL_SPACE, bq_cons(WITH_SAME_SBHL_SPACES, append(body, NIL)));
        }
    }

    /**
     * Initializes new *sbhl-space* and turns on a filter to suspend creating new spaces in search.
     */
    @LispMethod(comment = "Initializes new *sbhl-space* and turns on a filter to suspend creating new spaces in search.")
    public static SubLObject with_new_sbhl_space_used_repeatedly(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return list(WITH_NEW_SBHL_SPACE, bq_cons(WITH_SAME_SBHL_SPACES, append(body, NIL)));
    }

    /**
     * Checks filter @see sbhl-suspend-new-spaces?. Iff nil, initializes *sbhl-space* and *sbhl-gather-space* to new hash tables.
     */
    @LispMethod(comment = "Checks filter @see sbhl-suspend-new-spaces?. Iff nil, initializes *sbhl-space* and *sbhl-gather-space* to new hash tables.")
    public static final SubLObject possibly_with_new_sbhl_spaces_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject body = current;
            SubLObject source = $sym41$SOURCE;
            return list(CLET, list(bq_cons(source, $list_alt42)), list(POSSIBLY_WITH_NEW_SBHL_SPACE, list($sbhl_space$, source), listS(POSSIBLY_WITH_NEW_SBHL_SPACE, list($sbhl_gather_space$, source), append(body, NIL))));
        }
    }

    /**
     * Checks filter @see sbhl-suspend-new-spaces?. Iff nil, initializes *sbhl-space* and *sbhl-gather-space* to new hash tables.
     */
    @LispMethod(comment = "Checks filter @see sbhl-suspend-new-spaces?. Iff nil, initializes *sbhl-space* and *sbhl-gather-space* to new hash tables.")
    public static SubLObject possibly_with_new_sbhl_spaces(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        final SubLObject source = $sym43$SOURCE;
        return list(CLET, list(bq_cons(source, $list44)), list(POSSIBLY_WITH_NEW_SBHL_SPACE, list($sbhl_space$, source), listS(POSSIBLY_WITH_NEW_SBHL_SPACE, list($sbhl_gather_space$, source), append(body, NIL))));
    }

    /**
     * Possibly initialize SPACE to a new marking space, depending on SBHL-SUSPEND-NEW-SPACES?.
     */
    @LispMethod(comment = "Possibly initialize SPACE to a new marking space, depending on SBHL-SUSPEND-NEW-SPACES?.")
    public static final SubLObject possibly_with_new_sbhl_space_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt45);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject space = NIL;
                    SubLObject source = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt45);
                    space = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt45);
                    source = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        current = temp;
                        {
                            SubLObject body = current;
                            return listS(CLET, list(list(space, list(FIF, listS(EQ, source, $list_alt47), space, list(SBHL_GET_NEW_SPACE, source)))), append(body, list(list(PWHEN, listS(EQ, source, $list_alt50), list(UPDATE_SBHL_RESOURCED_SPACES, space)))));
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list_alt45);
                    }
                }
            }
        }
        return NIL;
    }

    /**
     * Possibly initialize SPACE to a new marking space, depending on SBHL-SUSPEND-NEW-SPACES?.
     */
    @LispMethod(comment = "Possibly initialize SPACE to a new marking space, depending on SBHL-SUSPEND-NEW-SPACES?.")
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

    /**
     * Determine whether and where to get new spaces from.
     */
    @LispMethod(comment = "Determine whether and where to get new spaces from.")
    public static final SubLObject sbhl_new_space_source_alt() {
        if (NIL != com.cyc.cycjava.cycl.sbhl.sbhl_marking_vars.sbhl_suspend_new_spacesP()) {
            return $OLD;
        } else {
            if (NIL != com.cyc.cycjava.cycl.sbhl.sbhl_marking_vars.resourcing_sbhl_marking_spaces_p()) {
                return $RESOURCE;
            } else {
                return $NEW;
            }
        }
    }

    /**
     * Determine whether and where to get new spaces from.
     */
    @LispMethod(comment = "Determine whether and where to get new spaces from.")
    public static SubLObject sbhl_new_space_source() {
        if (NIL != sbhl_suspend_new_spacesP()) {
            return $OLD;
        }
        if (NIL != resourcing_sbhl_marking_spaces_p()) {
            return $RESOURCE;
        }
        return $NEW;
    }

    /**
     * Get a new SBHL marking space from SOURCE.
     */
    @LispMethod(comment = "Get a new SBHL marking space from SOURCE.")
    public static final SubLObject sbhl_get_new_space_alt(SubLObject source) {
        {
            SubLObject pcase_var = source;
            if (pcase_var.eql($RESOURCE)) {
                return com.cyc.cycjava.cycl.sbhl.sbhl_marking_vars.get_sbhl_resourced_marking_space();
            } else {
                return com.cyc.cycjava.cycl.sbhl.sbhl_marking_vars.instantiate_sbhl_marking_space();
            }
        }
    }

    /**
     * Get a new SBHL marking space from SOURCE.
     */
    @LispMethod(comment = "Get a new SBHL marking space from SOURCE.")
    public static SubLObject sbhl_get_new_space(SubLObject source) {
        if (source.eql($RESOURCE)) {
            return get_sbhl_resourced_marking_space();
        }
        return instantiate_sbhl_marking_space();
    }

    /**
     * Binds VAR to current *sbhl-space*.
     */
    @LispMethod(comment = "Binds VAR to current *sbhl-space*.")
    public static final SubLObject with_sbhl_space_var_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject var = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt56);
            var = current.first();
            current = current.rest();
            {
                SubLObject body = current;
                return listS(CLET, list(bq_cons(var, $list_alt57)), append(body, NIL));
            }
        }
    }

    /**
     * Binds VAR to current *sbhl-space*.
     */
    @LispMethod(comment = "Binds VAR to current *sbhl-space*.")
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

    /**
     * Binds VAR to current *sbhl-gather-space*.
     */
    @LispMethod(comment = "Binds VAR to current *sbhl-gather-space*.")
    public static final SubLObject with_sbhl_gather_space_var_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject var = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt56);
            var = current.first();
            current = current.rest();
            {
                SubLObject body = current;
                return listS(CLET, list(bq_cons(var, $list_alt58)), append(body, NIL));
            }
        }
    }

    /**
     * Binds VAR to current *sbhl-gather-space*.
     */
    @LispMethod(comment = "Binds VAR to current *sbhl-gather-space*.")
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

    /**
     * Binds *sbhl-space* to VAR.
     */
    @LispMethod(comment = "Binds *sbhl-space* to VAR.")
    public static final SubLObject within_sbhl_space_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject var = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt56);
            var = current.first();
            current = current.rest();
            {
                SubLObject body = current;
                return listS(CLET, list(list($sbhl_space$, var)), append(body, NIL));
            }
        }
    }

    /**
     * Binds *sbhl-space* to VAR.
     */
    @LispMethod(comment = "Binds *sbhl-space* to VAR.")
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

    /**
     * Binds *sbhl-gather-space* to VAR
     */
    @LispMethod(comment = "Binds *sbhl-gather-space* to VAR")
    public static final SubLObject within_sbhl_gather_space_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject var = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt56);
            var = current.first();
            current = current.rest();
            {
                SubLObject body = current;
                return listS(CLET, list(list($sbhl_gather_space$, var)), append(body, NIL));
            }
        }
    }

    /**
     * Binds *sbhl-gather-space* to VAR
     */
    @LispMethod(comment = "Binds *sbhl-gather-space* to VAR")
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

    /**
     * Iterator over SBHL-SPACE. Binds NODE-VAR to keys and MARKING-VAR to values. Quits when DONE-VAR.
     */
    @LispMethod(comment = "Iterator over SBHL-SPACE. Binds NODE-VAR to keys and MARKING-VAR to values. Quits when DONE-VAR.")
    public static final SubLObject do_sbhl_space_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt59);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject node_var = NIL;
                    SubLObject marking_var = NIL;
                    SubLObject sbhl_space = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt59);
                    node_var = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt59);
                    marking_var = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt59);
                    sbhl_space = current.first();
                    current = current.rest();
                    {
                        SubLObject done_var = (current.isCons()) ? ((SubLObject) (current.first())) : NIL;
                        destructuring_bind_must_listp(current, datum, $list_alt59);
                        current = current.rest();
                        if (NIL == current) {
                            current = temp;
                            {
                                SubLObject body = current;
                                return listS(DO_HASH_TABLE, list(node_var, marking_var, sbhl_space, $DONE, done_var), append(body, NIL));
                            }
                        } else {
                            cdestructuring_bind_error(datum, $list_alt59);
                        }
                    }
                }
            }
        }
        return NIL;
    }

    /**
     * Iterator over SBHL-SPACE. Binds NODE-VAR to keys and MARKING-VAR to values. Quits when DONE-VAR.
     */
    @LispMethod(comment = "Iterator over SBHL-SPACE. Binds NODE-VAR to keys and MARKING-VAR to values. Quits when DONE-VAR.")
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

    /**
     * Apply unary FUNCTION to each key of SBHL-SPACE.
     */
    @LispMethod(comment = "Apply unary FUNCTION to each key of SBHL-SPACE.")
    public static final SubLObject map_sbhl_space_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject function = NIL;
            SubLObject sbhl_space = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt62);
            function = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt62);
            sbhl_space = current.first();
            current = current.rest();
            if (NIL == current) {
                {
                    SubLObject node = $sym63$NODE;
                    SubLObject tag = $sym64$TAG;
                    return list(PCOND, list(list(HASH_TABLE_P, sbhl_space), list(CDOHASH, list(node, tag, sbhl_space), list(IGNORE, tag), list(FUNCALL, function, node))), list(T, list(SBHL_ERROR, THREE_INTEGER, $str_alt71$no_mapping_method_defiend_for_sbh, sbhl_space)));
                }
            } else {
                cdestructuring_bind_error(datum, $list_alt62);
            }
        }
        return NIL;
    }

    /**
     * Apply unary FUNCTION to each key of SBHL-SPACE.
     */
    @LispMethod(comment = "Apply unary FUNCTION to each key of SBHL-SPACE.")
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

    /**
     * Accessor. @return booleanp; whether to suspend creation of new spaces during search.
     */
    @LispMethod(comment = "Accessor. @return booleanp; whether to suspend creation of new spaces during search.")
    public static final SubLObject sbhl_suspend_new_spacesP_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return $sbhl_suspend_new_spacesP$.getDynamicValue(thread);
        }
    }

    /**
     * Accessor. @return booleanp; whether to suspend creation of new spaces during search.
     */
    @LispMethod(comment = "Accessor. @return booleanp; whether to suspend creation of new spaces during search.")
    public static SubLObject sbhl_suspend_new_spacesP() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return $sbhl_suspend_new_spacesP$.getDynamicValue(thread);
    }

    /**
     * Binds the toggle for suspending creation of new sbhl spaces during search to T
     */
    @LispMethod(comment = "Binds the toggle for suspending creation of new sbhl spaces during search to T")
    public static final SubLObject with_same_sbhl_spaces_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject body = current;
            return listS(CLET, $list_alt72, append(body, NIL));
        }
    }

    /**
     * Binds the toggle for suspending creation of new sbhl spaces during search to T
     */
    @LispMethod(comment = "Binds the toggle for suspending creation of new sbhl spaces during search to T")
    public static SubLObject with_same_sbhl_spaces(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(CLET, $list74, append(body, NIL));
    }

    /**
     * Binds the toggle for suspending creation of new sbhl spaces during search to NIL
     */
    @LispMethod(comment = "Binds the toggle for suspending creation of new sbhl spaces during search to NIL")
    public static final SubLObject without_suspending_new_sbhl_spaces_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject body = current;
            return listS(CLET, $list_alt73, append(body, NIL));
        }
    }

    /**
     * Binds the toggle for suspending creation of new sbhl spaces during search to NIL
     */
    @LispMethod(comment = "Binds the toggle for suspending creation of new sbhl spaces during search to NIL")
    public static SubLObject without_suspending_new_sbhl_spaces(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(CLET, $list75, append(body, NIL));
    }

    /**
     * Accessor: @return sbhl-space-object-p; @see *sbhl-goal-space*
     */
    @LispMethod(comment = "Accessor: @return sbhl-space-object-p; @see *sbhl-goal-space*")
    public static final SubLObject get_sbhl_goal_space_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return $sbhl_goal_space$.getDynamicValue(thread);
        }
    }

    /**
     * Accessor: @return sbhl-space-object-p; @see *sbhl-goal-space*
     */
    @LispMethod(comment = "Accessor: @return sbhl-space-object-p; @see *sbhl-goal-space*")
    public static SubLObject get_sbhl_goal_space() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return $sbhl_goal_space$.getDynamicValue(thread);
    }

    /**
     * Binds *sbhl-goal-space* to SPACE
     */
    @LispMethod(comment = "Binds *sbhl-goal-space* to SPACE")
    public static final SubLObject with_sbhl_goal_space_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject space = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt2);
            space = current.first();
            current = current.rest();
            {
                SubLObject body = current;
                return listS(CLET, list(list($sbhl_goal_space$, space)), append(body, NIL));
            }
        }
    }

    /**
     * Binds *sbhl-goal-space* to SPACE
     */
    @LispMethod(comment = "Binds *sbhl-goal-space* to SPACE")
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

    /**
     * Initializes *sbhl-target-space* and *sbhl-target-gather-space* to new hash tables, then binds *sbhl-space* and *sbhl-gather-space* to them, respectively.
     */
    @LispMethod(comment = "Initializes *sbhl-target-space* and *sbhl-target-gather-space* to new hash tables, then binds *sbhl-space* and *sbhl-gather-space* to them, respectively.")
    public static final SubLObject with_sbhl_target_spaces_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject body = current;
            return list(WITH_NEW_SBHL_TARGET_SPACES, listS(CLET, $list_alt76, append(body, NIL)));
        }
    }

    /**
     * Initializes *sbhl-target-space* and *sbhl-target-gather-space* to new hash tables, then binds *sbhl-space* and *sbhl-gather-space* to them, respectively.
     */
    @LispMethod(comment = "Initializes *sbhl-target-space* and *sbhl-target-gather-space* to new hash tables, then binds *sbhl-space* and *sbhl-gather-space* to them, respectively.")
    public static SubLObject with_sbhl_target_spaces(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return list(WITH_NEW_SBHL_TARGET_SPACES, listS(CLET, $list78, append(body, NIL)));
    }

    /**
     * Initializes *sbhl-target-space* and *sbhl-target-gather-space* to new hash tables
     */
    @LispMethod(comment = "Initializes *sbhl-target-space* and *sbhl-target-gather-space* to new hash tables")
    public static final SubLObject with_new_sbhl_target_spaces_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject body = current;
            return list(INSTANTIATE_SBHL_MARKING_SPACE_FOR, $sbhl_target_space$, listS(INSTANTIATE_SBHL_MARKING_SPACE_FOR, $sbhl_target_gather_space$, append(body, NIL)));
        }
    }

    /**
     * Initializes *sbhl-target-space* and *sbhl-target-gather-space* to new hash tables
     */
    @LispMethod(comment = "Initializes *sbhl-target-space* and *sbhl-target-gather-space* to new hash tables")
    public static SubLObject with_new_sbhl_target_spaces(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return list(INSTANTIATE_SBHL_MARKING_SPACE_FOR, $sbhl_target_space$, listS(INSTANTIATE_SBHL_MARKING_SPACE_FOR, $sbhl_target_gather_space$, append(body, NIL)));
    }

    /**
     * Initializes *sbhl-target-space* to new hash table
     */
    @LispMethod(comment = "Initializes *sbhl-target-space* to new hash table")
    public static final SubLObject with_new_sbhl_target_space_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject body = current;
            return listS(INSTANTIATE_SBHL_MARKING_SPACE_FOR, $sbhl_target_space$, append(body, NIL));
        }
    }

    /**
     * Initializes *sbhl-target-space* to new hash table
     */
    @LispMethod(comment = "Initializes *sbhl-target-space* to new hash table")
    public static SubLObject with_new_sbhl_target_space(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(INSTANTIATE_SBHL_MARKING_SPACE_FOR, $sbhl_target_space$, append(body, NIL));
    }

    /**
     * Initializes *sbhl-target-gather-space* to new hash table
     */
    @LispMethod(comment = "Initializes *sbhl-target-gather-space* to new hash table")
    public static final SubLObject with_new_sbhl_target_gather_space_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject body = current;
            return listS(INSTANTIATE_SBHL_MARKING_SPACE_FOR, $sbhl_target_gather_space$, append(body, NIL));
        }
    }

    /**
     * Initializes *sbhl-target-gather-space* to new hash table
     */
    @LispMethod(comment = "Initializes *sbhl-target-gather-space* to new hash table")
    public static SubLObject with_new_sbhl_target_gather_space(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(INSTANTIATE_SBHL_MARKING_SPACE_FOR, $sbhl_target_gather_space$, append(body, NIL));
    }

    /**
     * Binds *sbhl-space* and *sbhl-gather-space* to *sbhl-target-space* and *sbhl-target-gather-space*, respectively
     */
    @LispMethod(comment = "Binds *sbhl-space* and *sbhl-gather-space* to *sbhl-target-space* and *sbhl-target-gather-space*, respectively")
    public static final SubLObject within_sbhl_target_spaces_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject body = current;
            return listS(CLET, $list_alt76, append(body, NIL));
        }
    }

    @LispMethod(comment = "Binds *sbhl-space* and *sbhl-gather-space* to *sbhl-target-space* and *sbhl-target-gather-space*, respectively")
    public static SubLObject within_sbhl_target_spaces(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(CLET, $list78, append(body, NIL));
    }

    /**
     * Binds *sbhl-space* to *sbhl-target-space*
     */
    @LispMethod(comment = "Binds *sbhl-space* to *sbhl-target-space*")
    public static final SubLObject within_sbhl_target_space_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject body = current;
            return listS(CLET, $list_alt79, append(body, NIL));
        }
    }

    @LispMethod(comment = "Binds *sbhl-space* to *sbhl-target-space*")
    public static SubLObject within_sbhl_target_space(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(CLET, $list81, append(body, NIL));
    }

    /**
     * Initializes new *sbhl-target-space* and then binds *sbhl-space* to it.
     */
    @LispMethod(comment = "Initializes new *sbhl-target-space* and then binds *sbhl-space* to it.")
    public static final SubLObject within_new_sbhl_target_space_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject body = current;
            return list(WITH_NEW_SBHL_TARGET_SPACE, bq_cons(WITHIN_SBHL_TARGET_SPACE, append(body, NIL)));
        }
    }

    @LispMethod(comment = "Initializes new *sbhl-target-space* and then binds *sbhl-space* to it.")
    public static SubLObject within_new_sbhl_target_space(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return list(WITH_NEW_SBHL_TARGET_SPACE, bq_cons(WITHIN_SBHL_TARGET_SPACE, append(body, NIL)));
    }

    public static final SubLObject with_sbhl_target_space_named_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject space_var = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt82);
            space_var = current.first();
            current = current.rest();
            {
                SubLObject body = current;
                return listS(CLET, list(list($sbhl_target_space$, space_var)), append(body, NIL));
            }
        }
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

    /**
     * Modifier. Clears the target marking spaces.
     */
    @LispMethod(comment = "Modifier. Clears the target marking spaces.")
    public static final SubLObject clear_sbhl_target_spaces_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            sbhl_marking_utilities.clear_sbhl_space($sbhl_target_space$.getDynamicValue(thread));
            sbhl_marking_utilities.clear_sbhl_space($sbhl_target_gather_space$.getDynamicValue(thread));
            return NIL;
        }
    }

    @LispMethod(comment = "Modifier. Clears the target marking spaces.")
    public static SubLObject clear_sbhl_target_spaces() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        sbhl_marking_utilities.clear_sbhl_space($sbhl_target_space$.getDynamicValue(thread));
        sbhl_marking_utilities.clear_sbhl_space($sbhl_target_gather_space$.getDynamicValue(thread));
        return NIL;
    }

    public static final SubLObject clear_sbhl_target_space_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            sbhl_marking_utilities.clear_sbhl_space($sbhl_target_space$.getDynamicValue(thread));
            return NIL;
        }
    }

    public static SubLObject clear_sbhl_target_space() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        sbhl_marking_utilities.clear_sbhl_space($sbhl_target_space$.getDynamicValue(thread));
        return NIL;
    }

    /**
     * Accessor: @return sbhl-space-object-p; @see *sbhl-goal-space*
     */
    @LispMethod(comment = "Accessor: @return sbhl-space-object-p; @see *sbhl-goal-space*")
    public static final SubLObject get_sbhl_terminating_marking_space_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return $sbhl_terminating_marking_space$.getDynamicValue(thread);
        }
    }

    @LispMethod(comment = "Accessor: @return sbhl-space-object-p; @see *sbhl-goal-space*")
    public static SubLObject get_sbhl_terminating_marking_space() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return $sbhl_terminating_marking_space$.getDynamicValue(thread);
    }

    /**
     * Binds *sbhl-terminating-marking-space* to SPACE
     */
    @LispMethod(comment = "Binds *sbhl-terminating-marking-space* to SPACE")
    public static final SubLObject with_sbhl_terminating_space_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject space = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt2);
            space = current.first();
            current = current.rest();
            {
                SubLObject body = current;
                return listS(CLET, list(list($sbhl_terminating_marking_space$, space)), append(body, NIL));
            }
        }
    }

    @LispMethod(comment = "Binds *sbhl-terminating-marking-space* to SPACE")
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

    /**
     * Binds *sbhl-space* to *sbhl-terminating-marking-space*
     */
    @LispMethod(comment = "Binds *sbhl-space* to *sbhl-terminating-marking-space*")
    public static final SubLObject within_sbhl_terminating_marking_space_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject body = current;
            return listS(CLET, $list_alt84, append(body, NIL));
        }
    }

    @LispMethod(comment = "Binds *sbhl-space* to *sbhl-terminating-marking-space*")
    public static SubLObject within_sbhl_terminating_marking_space(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(CLET, $list86, append(body, NIL));
    }

    public static final SubLObject with_sbhl_apply_marking_space_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject space = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt2);
            space = current.first();
            current = current.rest();
            {
                SubLObject body = current;
                return listS(CLET, list(list($sbhl_apply_marking_space$, space)), append(body, NIL));
            }
        }
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

    /**
     * Accessor: @return booleanp; whether MARKING indicates access only in predicate mode.
     */
    @LispMethod(comment = "Accessor: @return booleanp; whether MARKING indicates access only in predicate mode.")
    public static final SubLObject genl_preds_marking_p_alt(SubLObject marking) {
        return eq(marking, $sbhl_genl_preds_marking$.getGlobalValue());
    }

    @LispMethod(comment = "Accessor: @return booleanp; whether MARKING indicates access only in predicate mode.")
    public static SubLObject genl_preds_marking_p(final SubLObject marking) {
        return eql(marking, $sbhl_genl_preds_marking$.getGlobalValue());
    }

    /**
     * Accessor: @return booleanp; whether MARKING indicates access only in argument-flipped mode.
     */
    @LispMethod(comment = "Accessor: @return booleanp; whether MARKING indicates access only in argument-flipped mode.")
    public static final SubLObject genl_inverse_marking_p_alt(SubLObject marking) {
        return eq(marking, $sbhl_genl_inverse_marking$.getGlobalValue());
    }

    @LispMethod(comment = "Accessor: @return booleanp; whether MARKING indicates access only in argument-flipped mode.")
    public static SubLObject genl_inverse_marking_p(final SubLObject marking) {
        return eql(marking, $sbhl_genl_inverse_marking$.getGlobalValue());
    }

    /**
     * Accessor: @return booleanp; whether MARKING indicates access in both predicate and argument-flipped mode.
     */
    @LispMethod(comment = "Accessor: @return booleanp; whether MARKING indicates access in both predicate and argument-flipped mode.")
    public static final SubLObject genl_preds_and_genl_inverse_marking_p_alt(SubLObject marking) {
        return makeBoolean((marking == $sbhl_genl_preds_and_genl_inverse_marking$.getGlobalValue()) || (marking == $sbhl_genl_inverse_and_genl_preds_marking$.getGlobalValue()));
    }

    @LispMethod(comment = "Accessor: @return booleanp; whether MARKING indicates access in both predicate and argument-flipped mode.")
    public static SubLObject genl_preds_and_genl_inverse_marking_p(final SubLObject marking) {
        return makeBoolean(marking.eql($sbhl_genl_preds_and_genl_inverse_marking$.getGlobalValue()) || marking.eql($sbhl_genl_inverse_and_genl_preds_marking$.getGlobalValue()));
    }

    /**
     * Accessor: @return listp; the argument-flipped marking if MARKING is predicate marking or the predicate marking if MARKING is argument-flipped marking
     */
    @LispMethod(comment = "Accessor: @return listp; the argument-flipped marking if MARKING is predicate marking or the predicate marking if MARKING is argument-flipped marking")
    public static final SubLObject genl_preds_opposite_marking_alt(SubLObject marking) {
        if (NIL != com.cyc.cycjava.cycl.sbhl.sbhl_marking_vars.genl_preds_marking_p(marking)) {
            return $sbhl_genl_inverse_marking$.getGlobalValue();
        } else {
            if (NIL != com.cyc.cycjava.cycl.sbhl.sbhl_marking_vars.genl_inverse_marking_p(marking)) {
                return $sbhl_genl_preds_marking$.getGlobalValue();
            } else {
                return marking;
            }
        }
    }

    @LispMethod(comment = "Accessor: @return listp; the argument-flipped marking if MARKING is predicate marking or the predicate marking if MARKING is argument-flipped marking")
    public static SubLObject genl_preds_opposite_marking(final SubLObject marking) {
        if (NIL != genl_preds_marking_p(marking)) {
            return $sbhl_genl_inverse_marking$.getGlobalValue();
        }
        if (NIL != genl_inverse_marking_p(marking)) {
            return $sbhl_genl_preds_marking$.getGlobalValue();
        }
        return marking;
    }

    /**
     * Modifier. increments by one @see *sbhl-marking-generation*
     */
    @LispMethod(comment = "Modifier. increments by one @see *sbhl-marking-generation*")
    public static final SubLObject increment_sbhl_marking_generation_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            $sbhl_marking_generation$.setDynamicValue(add($sbhl_marking_generation$.getDynamicValue(thread), ONE_INTEGER), thread);
            return NIL;
        }
    }

    @LispMethod(comment = "Modifier. increments by one @see *sbhl-marking-generation*")
    public static SubLObject increment_sbhl_marking_generation() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        $sbhl_marking_generation$.setDynamicValue(add($sbhl_marking_generation$.getDynamicValue(thread), ONE_INTEGER), thread);
        return NIL;
    }

    /**
     * Accessor. @return integerp. @see *sbhl-marking-generation*
     */
    @LispMethod(comment = "Accessor. @return integerp. @see *sbhl-marking-generation*")
    public static final SubLObject get_sbhl_marking_generation_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return $sbhl_marking_generation$.getDynamicValue(thread);
        }
    }

    @LispMethod(comment = "Accessor. @return integerp. @see *sbhl-marking-generation*")
    public static SubLObject get_sbhl_marking_generation() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return $sbhl_marking_generation$.getDynamicValue(thread);
    }

    /**
     * Initializes *sbhl-marking-generation* to 0 within scope of BODY.
     */
    @LispMethod(comment = "Initializes *sbhl-marking-generation* to 0 within scope of BODY.")
    public static final SubLObject with_new_sbhl_marking_generation_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject body = current;
            return listS(CLET, $list_alt90, append(body, NIL));
        }
    }

    @LispMethod(comment = "Initializes *sbhl-marking-generation* to 0 within scope of BODY.")
    public static SubLObject with_new_sbhl_marking_generation(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(CLET, $list92, append(body, NIL));
    }

    /**
     * Accessor: @return booleanp; whether to suspend the creation of new search spaces during mapping.
     */
    @LispMethod(comment = "Accessor: @return booleanp; whether to suspend the creation of new search spaces during mapping.")
    public static final SubLObject sbhl_suspend_new_spaces_during_mappingP_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return $sbhl_suspend_new_spaces_during_mappingP$.getDynamicValue(thread);
        }
    }

    @LispMethod(comment = "Accessor: @return booleanp; whether to suspend the creation of new search spaces during mapping.")
    public static SubLObject sbhl_suspend_new_spaces_during_mappingP() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return $sbhl_suspend_new_spaces_during_mappingP$.getDynamicValue(thread);
    }

    /**
     * Binds *sbhl-mapping-marking-space* to SPACE
     */
    @LispMethod(comment = "Binds *sbhl-mapping-marking-space* to SPACE")
    public static final SubLObject with_sbhl_mapping_marking_space_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject space = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt2);
            space = current.first();
            current = current.rest();
            {
                SubLObject body = current;
                return listS(CLET, list(list($sbhl_mapping_marking_space$, space)), append(body, NIL));
            }
        }
    }

    @LispMethod(comment = "Binds *sbhl-mapping-marking-space* to SPACE")
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

    /**
     * Binds *sbhl-mapping-gather-marking-space* to SPACE
     */
    @LispMethod(comment = "Binds *sbhl-mapping-gather-marking-space* to SPACE")
    public static final SubLObject with_sbhl_mapping_gather_marking_space_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject space = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt2);
            space = current.first();
            current = current.rest();
            {
                SubLObject body = current;
                return listS(CLET, list(list($sbhl_mapping_gather_marking_space$, space)), append(body, NIL));
            }
        }
    }

    @LispMethod(comment = "Binds *sbhl-mapping-gather-marking-space* to SPACE")
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

    /**
     * Binds *sbhl-space* and *sbhl-gather-space* to *sbhl-mapping-marking-space* and *sbhl-mapping-gather-marking-space*, respectively
     */
    @LispMethod(comment = "Binds *sbhl-space* and *sbhl-gather-space* to *sbhl-mapping-marking-space* and *sbhl-mapping-gather-marking-space*, respectively")
    public static final SubLObject within_sbhl_mapping_marking_spaces_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject body = current;
            return list(CLET, $list_alt93, bq_cons(WITH_SAME_SBHL_SPACES, append(body, NIL)));
        }
    }

    @LispMethod(comment = "Binds *sbhl-space* and *sbhl-gather-space* to *sbhl-mapping-marking-space* and *sbhl-mapping-gather-marking-space*, respectively")
    public static SubLObject within_sbhl_mapping_marking_spaces(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return list(CLET, $list95, bq_cons(WITH_SAME_SBHL_SPACES, append(body, NIL)));
    }

    /**
     * Performs the sbhl mapping function repeatedly in the same spaces, which it instantiates for its BODY.
     */
    @LispMethod(comment = "Performs the sbhl mapping function repeatedly in the same spaces, which it instantiates for its BODY.")
    public static final SubLObject sbhl_mark_mapping_fn_in_new_target_spaces_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject body = current;
            return list(WITH_NEW_SBHL_TARGET_SPACES, listS(CLET, $list_alt94, append(body, NIL)));
        }
    }

    @LispMethod(comment = "Performs the sbhl mapping function repeatedly in the same spaces, which it instantiates for its BODY.")
    public static SubLObject sbhl_mark_mapping_fn_in_new_target_spaces(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return list(WITH_NEW_SBHL_TARGET_SPACES, listS(CLET, $list96, append(body, NIL)));
    }

    /**
     * Performs the sbhl mapping function repeatedly with the same SPACE as *sbhl-space*.
     */
    @LispMethod(comment = "Performs the sbhl mapping function repeatedly with the same SPACE as *sbhl-space*.")
    public static final SubLObject sbhl_mark_mapping_fn_within_space_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject space = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt2);
            space = current.first();
            current = current.rest();
            {
                SubLObject body = current;
                return listS(CLET, bq_cons(list($sbhl_mapping_marking_space$, space), $list_alt95), append(body, NIL));
            }
        }
    }

    @LispMethod(comment = "Performs the sbhl mapping function repeatedly with the same SPACE as *sbhl-space*.")
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

    /**
     * Performs the sbhl mapping function repeatedly with the same SPACE as *sbhl-gather-space*.
     */
    @LispMethod(comment = "Performs the sbhl mapping function repeatedly with the same SPACE as *sbhl-gather-space*.")
    public static final SubLObject sbhl_mark_gather_mapping_fn_within_gather_space_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject space = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt2);
            space = current.first();
            current = current.rest();
            {
                SubLObject body = current;
                return listS(CLET, bq_cons(list($sbhl_mapping_gather_marking_space$, space), $list_alt95), append(body, NIL));
            }
        }
    }

    @LispMethod(comment = "Performs the sbhl mapping function repeatedly with the same SPACE as *sbhl-gather-space*.")
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

    /**
     * Accessor: @return booleanp; whether time search checks markings in target space.
     */
    @LispMethod(comment = "Accessor: @return booleanp; whether time search checks markings in target space.")
    public static final SubLObject sbhl_temporality_search_checks_nodes_in_target_space_p_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return $sbhl_temporality_search_checks_nodes_in_target_space_p$.getDynamicValue(thread);
        }
    }

    @LispMethod(comment = "Accessor: @return booleanp; whether time search checks markings in target space.")
    public static SubLObject sbhl_temporality_search_checks_nodes_in_target_space_p() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return $sbhl_temporality_search_checks_nodes_in_target_space_p$.getDynamicValue(thread);
    }

    /**
     * Binds behavior to check nodes' markings in target space during time searches.
     */
    @LispMethod(comment = "Binds behavior to check nodes\' markings in target space during time searches.")
    public static final SubLObject with_sbhl_temporality_search_checks_nodes_in_target_space_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject body = current;
            return listS(CLET, $list_alt96, append(body, NIL));
        }
    }

    @LispMethod(comment = "Binds behavior to check nodes\' markings in target space during time searches.")
    public static SubLObject with_sbhl_temporality_search_checks_nodes_in_target_space(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(CLET, $list98, append(body, NIL));
    }

    /**
     * Accessor: @return booleanp; whether table has valid type to be an sbhl-space
     */
    @LispMethod(comment = "Accessor: @return booleanp; whether table has valid type to be an sbhl-space")
    public static final SubLObject sbhl_table_p_alt(SubLObject table) {
        return hash_table_p(table);
    }

    @LispMethod(comment = "Accessor: @return booleanp; whether table has valid type to be an sbhl-space")
    public static SubLObject sbhl_table_p(final SubLObject table) {
        return hash_table_p(table);
    }

    /**
     * Initializes *sbhl-table* to a new hash table.
     */
    @LispMethod(comment = "Initializes *sbhl-table* to a new hash table.")
    public static final SubLObject with_new_sbhl_table_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject body = current;
            return listS(INSTANTIATE_SBHL_MARKING_SPACE_FOR, $sbhl_table$, append(body, NIL));
        }
    }

    @LispMethod(comment = "Initializes *sbhl-table* to a new hash table.")
    public static SubLObject with_new_sbhl_table(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(INSTANTIATE_SBHL_MARKING_SPACE_FOR, $sbhl_table$, append(body, NIL));
    }

    /**
     * Binds VAR to current *sbhl-table*
     */
    @LispMethod(comment = "Binds VAR to current *sbhl-table*")
    public static final SubLObject with_sbhl_table_var_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject var = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt56);
            var = current.first();
            current = current.rest();
            {
                SubLObject body = current;
                return listS(CLET, list(bq_cons(var, $list_alt99)), append(body, NIL));
            }
        }
    }

    @LispMethod(comment = "Binds VAR to current *sbhl-table*")
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

    /**
     * Initialize *sbhl-table* to a new hash table and bind NAME to this table.
     */
    @LispMethod(comment = "Initialize *sbhl-table* to a new hash table and bind NAME to this table.")
    public static final SubLObject with_new_sbhl_table_named_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject name = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt34);
            name = current.first();
            current = current.rest();
            {
                SubLObject body = current;
                SubLObject resourcing_p = $sym100$RESOURCING_P;
                return list(CLET, list(bq_cons(resourcing_p, $list_alt101)), list(WITHOUT_SBHL_RESOURCED_MARKING_SPACES, list(WITH_NEW_SBHL_TABLE, list(WITH_SBHL_TABLE_VAR, name, listS(TOGGLE_SBHL_RESOURCED_MARKING_SPACES, resourcing_p, append(body, NIL))))));
            }
        }
    }

    @LispMethod(comment = "Initialize *sbhl-table* to a new hash table and bind NAME to this table.")
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

    /**
     * Binds *sbhl-table* to VAR.
     */
    @LispMethod(comment = "Binds *sbhl-table* to VAR.")
    public static final SubLObject within_sbhl_table_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject var = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt56);
            var = current.first();
            current = current.rest();
            {
                SubLObject body = current;
                return listS(CLET, list(list($sbhl_table$, var)), append(body, NIL));
            }
        }
    }

    /**
     * Binds *sbhl-table* to VAR.
     */
    @LispMethod(comment = "Binds *sbhl-table* to VAR.")
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

    /**
     * Iterator over SBHL-TABLE. Binds NODE-VAR to keys and MARKING-VAR to values. Quits when DONE-VAR.
     */
    @LispMethod(comment = "Iterator over SBHL-TABLE. Binds NODE-VAR to keys and MARKING-VAR to values. Quits when DONE-VAR.")
    public static final SubLObject do_sbhl_table_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt106);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject node_var = NIL;
                    SubLObject marking_var = NIL;
                    SubLObject sbhl_table = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt106);
                    node_var = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt106);
                    marking_var = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt106);
                    sbhl_table = current.first();
                    current = current.rest();
                    {
                        SubLObject done_var = (current.isCons()) ? ((SubLObject) (current.first())) : NIL;
                        destructuring_bind_must_listp(current, datum, $list_alt106);
                        current = current.rest();
                        if (NIL == current) {
                            current = temp;
                            {
                                SubLObject body = current;
                                return listS(DO_HASH_TABLE, list(node_var, marking_var, sbhl_table, $DONE, done_var), append(body, NIL));
                            }
                        } else {
                            cdestructuring_bind_error(datum, $list_alt106);
                        }
                    }
                }
            }
        }
        return NIL;
    }

    /**
     * Iterator over SBHL-TABLE. Binds NODE-VAR to keys and MARKING-VAR to values. Quits when DONE-VAR.
     */
    @LispMethod(comment = "Iterator over SBHL-TABLE. Binds NODE-VAR to keys and MARKING-VAR to values. Quits when DONE-VAR.")
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

    /**
     * Apply unary FUNCTION to each key of SBHL-TABLE.
     */
    @LispMethod(comment = "Apply unary FUNCTION to each key of SBHL-TABLE.")
    public static final SubLObject map_sbhl_table_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject function = NIL;
            SubLObject sbhl_table = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt107);
            function = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt107);
            sbhl_table = current.first();
            current = current.rest();
            if (NIL == current) {
                {
                    SubLObject node = $sym108$NODE;
                    SubLObject tag = $sym109$TAG;
                    return list(PCOND, list(list(HASH_TABLE_P, sbhl_table), list(CDOHASH, list(node, tag, sbhl_table), list(IGNORE, tag), list(FUNCALL, function, node))), list(T, list(SBHL_ERROR, THREE_INTEGER, $str_alt110$no_mapping_method_defiend_for_sbh, sbhl_table)));
                }
            } else {
                cdestructuring_bind_error(datum, $list_alt107);
            }
        }
        return NIL;
    }

    @LispMethod(comment = "Apply unary FUNCTION to each key of SBHL-TABLE.")
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

    /**
     * Binds *sbhl-space* to current *sbhl-table*
     */
    @LispMethod(comment = "Binds *sbhl-space* to current *sbhl-table*")
    public static final SubLObject mark_in_sbhl_table_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject body = current;
            return listS(WITHIN_SBHL_SPACE, $sbhl_table$, append(body, NIL));
        }
    }

    @LispMethod(comment = "Binds *sbhl-space* to current *sbhl-table*")
    public static SubLObject mark_in_sbhl_table(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(WITHIN_SBHL_SPACE, $sbhl_table$, append(body, NIL));
    }/**
     * Binds *sbhl-space* to current *sbhl-table*
     */


    /**
     * Accessor: @return sbhl-table-object-p; @see *sbhl-goal-table*
     */
    @LispMethod(comment = "Accessor: @return sbhl-table-object-p; @see *sbhl-goal-table*")
    public static final SubLObject get_sbhl_goal_table_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return $sbhl_goal_table$.getDynamicValue(thread);
        }
    }

    @LispMethod(comment = "Accessor: @return sbhl-table-object-p; @see *sbhl-goal-table*")
    public static SubLObject get_sbhl_goal_table() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return $sbhl_goal_table$.getDynamicValue(thread);
    }/**
     * Accessor: @return sbhl-table-object-p; @see *sbhl-goal-table*
     */


    /**
     * Binds *sbhl-goal-table* to TABLE
     */
    @LispMethod(comment = "Binds *sbhl-goal-table* to TABLE")
    public static final SubLObject with_sbhl_goal_table_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject table = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt112);
            table = current.first();
            current = current.rest();
            {
                SubLObject body = current;
                return listS(CLET, list(list($sbhl_goal_table$, table)), append(body, NIL));
            }
        }
    }

    @LispMethod(comment = "Binds *sbhl-goal-table* to TABLE")
    public static SubLObject with_sbhl_goal_table(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject table = NIL;
        destructuring_bind_must_consp(current, datum, $list114);
        table = current.first();
        final SubLObject body;
        current = body = current.rest();
        return listS(CLET, list(list($sbhl_goal_table$, table)), append(body, NIL));
    }/**
     * Binds *sbhl-goal-table* to TABLE
     */


    public static SubLObject declare_sbhl_marking_vars_file() {
        declareFunction("average_genl_cardinality", "AVERAGE-GENL-CARDINALITY", 0, 1, false);
        declareFunction("average_spec_cardinality", "AVERAGE-SPEC-CARDINALITY", 0, 1, false);
        declareFunction("get_sbhl_marking_space", "GET-SBHL-MARKING-SPACE", 0, 0, false);
        declareFunction("free_sbhl_marking_space", "FREE-SBHL-MARKING-SPACE", 1, 0, false);
        declareFunction("instantiate_sbhl_marking_space", "INSTANTIATE-SBHL-MARKING-SPACE", 0, 0, false);
        declareMacro("instantiate_sbhl_marking_space_for", "INSTANTIATE-SBHL-MARKING-SPACE-FOR");
        declareFunction("resourcing_sbhl_marking_spaces_p", "RESOURCING-SBHL-MARKING-SPACES-P", 0, 0, false);
        declareMacro("with_sbhl_resourced_marking_spaces", "WITH-SBHL-RESOURCED-MARKING-SPACES");
        declareFunction("determine_resource_limit", "DETERMINE-RESOURCE-LIMIT", 2, 0, false);
        declareFunction("possibly_new_marking_resource", "POSSIBLY-NEW-MARKING-RESOURCE", 1, 0, false);
        declareMacro("without_sbhl_resourced_marking_spaces", "WITHOUT-SBHL-RESOURCED-MARKING-SPACES");
        declareMacro("toggle_sbhl_resourced_marking_spaces", "TOGGLE-SBHL-RESOURCED-MARKING-SPACES");
        declareFunction("new_sbhl_marking_space_resource", "NEW-SBHL-MARKING-SPACE-RESOURCE", 0, 1, false);
        declareFunction("current_sbhl_marking_space_resource", "CURRENT-SBHL-MARKING-SPACE-RESOURCE", 0, 0, false);
        declareMacro("with_sbhl_marking_space_resource", "WITH-SBHL-MARKING-SPACE-RESOURCE");
        declareMacro("with_new_sbhl_marking_space_resource", "WITH-NEW-SBHL-MARKING-SPACE-RESOURCE");
        declareFunction("determine_marking_space_limit", "DETERMINE-MARKING-SPACE-LIMIT", 1, 0, false);
        declareFunction("get_sbhl_resourced_marking_space", "GET-SBHL-RESOURCED-MARKING-SPACE", 0, 0, false);
        declareFunction("update_sbhl_resourced_spaces", "UPDATE-SBHL-RESOURCED-SPACES", 1, 0, false);
        declareFunction("clear_recourced_sbhl_spaces", "CLEAR-RECOURCED-SBHL-SPACES", 0, 0, false);
        declareFunction("sbhl_space_obect_p", "SBHL-SPACE-OBECT-P", 1, 0, false);
        declareFunction("get_sbhl_space", "GET-SBHL-SPACE", 0, 0, false);
        declareFunction("get_sbhl_gather_space", "GET-SBHL-GATHER-SPACE", 0, 0, false);
        declareMacro("with_new_sbhl_space", "WITH-NEW-SBHL-SPACE");
        declareMacro("with_new_sbhl_space_named", "WITH-NEW-SBHL-SPACE-NAMED");
        declareMacro("with_new_sbhl_gather_space", "WITH-NEW-SBHL-GATHER-SPACE");
        declareMacro("with_new_sbhl_spaces", "WITH-NEW-SBHL-SPACES");
        declareMacro("with_new_sbhl_spaces_used_repeatedly", "WITH-NEW-SBHL-SPACES-USED-REPEATEDLY");
        declareMacro("with_new_sbhl_space_used_repeatedly", "WITH-NEW-SBHL-SPACE-USED-REPEATEDLY");
        declareMacro("possibly_with_new_sbhl_spaces", "POSSIBLY-WITH-NEW-SBHL-SPACES");
        declareMacro("possibly_with_new_sbhl_space", "POSSIBLY-WITH-NEW-SBHL-SPACE");
        declareFunction("sbhl_new_space_source", "SBHL-NEW-SPACE-SOURCE", 0, 0, false);
        declareFunction("sbhl_get_new_space", "SBHL-GET-NEW-SPACE", 1, 0, false);
        declareMacro("with_sbhl_space_var", "WITH-SBHL-SPACE-VAR");
        declareMacro("with_sbhl_gather_space_var", "WITH-SBHL-GATHER-SPACE-VAR");
        declareMacro("within_sbhl_space", "WITHIN-SBHL-SPACE");
        declareMacro("within_sbhl_gather_space", "WITHIN-SBHL-GATHER-SPACE");
        declareMacro("do_sbhl_space", "DO-SBHL-SPACE");
        declareMacro("map_sbhl_space", "MAP-SBHL-SPACE");
        declareFunction("sbhl_suspend_new_spacesP", "SBHL-SUSPEND-NEW-SPACES?", 0, 0, false);
        declareMacro("with_same_sbhl_spaces", "WITH-SAME-SBHL-SPACES");
        declareMacro("without_suspending_new_sbhl_spaces", "WITHOUT-SUSPENDING-NEW-SBHL-SPACES");
        declareFunction("get_sbhl_goal_space", "GET-SBHL-GOAL-SPACE", 0, 0, false);
        declareMacro("with_sbhl_goal_space", "WITH-SBHL-GOAL-SPACE");
        declareMacro("with_sbhl_target_spaces", "WITH-SBHL-TARGET-SPACES");
        declareMacro("with_new_sbhl_target_spaces", "WITH-NEW-SBHL-TARGET-SPACES");
        declareMacro("with_new_sbhl_target_space", "WITH-NEW-SBHL-TARGET-SPACE");
        declareMacro("with_new_sbhl_target_gather_space", "WITH-NEW-SBHL-TARGET-GATHER-SPACE");
        declareMacro("within_sbhl_target_spaces", "WITHIN-SBHL-TARGET-SPACES");
        declareMacro("within_sbhl_target_space", "WITHIN-SBHL-TARGET-SPACE");
        declareMacro("within_new_sbhl_target_space", "WITHIN-NEW-SBHL-TARGET-SPACE");
        declareMacro("with_sbhl_target_space_named", "WITH-SBHL-TARGET-SPACE-NAMED");
        declareFunction("clear_sbhl_target_spaces", "CLEAR-SBHL-TARGET-SPACES", 0, 0, false);
        declareFunction("clear_sbhl_target_space", "CLEAR-SBHL-TARGET-SPACE", 0, 0, false);
        declareFunction("get_sbhl_terminating_marking_space", "GET-SBHL-TERMINATING-MARKING-SPACE", 0, 0, false);
        declareMacro("with_sbhl_terminating_space", "WITH-SBHL-TERMINATING-SPACE");
        declareMacro("within_sbhl_terminating_marking_space", "WITHIN-SBHL-TERMINATING-MARKING-SPACE");
        declareMacro("with_sbhl_apply_marking_space", "WITH-SBHL-APPLY-MARKING-SPACE");
        declareFunction("genl_preds_marking_p", "GENL-PREDS-MARKING-P", 1, 0, false);
        declareFunction("genl_inverse_marking_p", "GENL-INVERSE-MARKING-P", 1, 0, false);
        declareFunction("genl_preds_and_genl_inverse_marking_p", "GENL-PREDS-AND-GENL-INVERSE-MARKING-P", 1, 0, false);
        declareFunction("genl_preds_opposite_marking", "GENL-PREDS-OPPOSITE-MARKING", 1, 0, false);
        declareFunction("increment_sbhl_marking_generation", "INCREMENT-SBHL-MARKING-GENERATION", 0, 0, false);
        declareFunction("get_sbhl_marking_generation", "GET-SBHL-MARKING-GENERATION", 0, 0, false);
        declareMacro("with_new_sbhl_marking_generation", "WITH-NEW-SBHL-MARKING-GENERATION");
        declareFunction("sbhl_suspend_new_spaces_during_mappingP", "SBHL-SUSPEND-NEW-SPACES-DURING-MAPPING?", 0, 0, false);
        declareMacro("with_sbhl_mapping_marking_space", "WITH-SBHL-MAPPING-MARKING-SPACE");
        declareMacro("with_sbhl_mapping_gather_marking_space", "WITH-SBHL-MAPPING-GATHER-MARKING-SPACE");
        declareMacro("within_sbhl_mapping_marking_spaces", "WITHIN-SBHL-MAPPING-MARKING-SPACES");
        declareMacro("sbhl_mark_mapping_fn_in_new_target_spaces", "SBHL-MARK-MAPPING-FN-IN-NEW-TARGET-SPACES");
        declareMacro("sbhl_mark_mapping_fn_within_space", "SBHL-MARK-MAPPING-FN-WITHIN-SPACE");
        declareMacro("sbhl_mark_gather_mapping_fn_within_gather_space", "SBHL-MARK-GATHER-MAPPING-FN-WITHIN-GATHER-SPACE");
        declareFunction("sbhl_temporality_search_checks_nodes_in_target_space_p", "SBHL-TEMPORALITY-SEARCH-CHECKS-NODES-IN-TARGET-SPACE-P", 0, 0, false);
        declareMacro("with_sbhl_temporality_search_checks_nodes_in_target_space", "WITH-SBHL-TEMPORALITY-SEARCH-CHECKS-NODES-IN-TARGET-SPACE");
        declareFunction("sbhl_table_p", "SBHL-TABLE-P", 1, 0, false);
        declareMacro("with_new_sbhl_table", "WITH-NEW-SBHL-TABLE");
        declareMacro("with_sbhl_table_var", "WITH-SBHL-TABLE-VAR");
        declareMacro("with_new_sbhl_table_named", "WITH-NEW-SBHL-TABLE-NAMED");
        declareMacro("within_sbhl_table", "WITHIN-SBHL-TABLE");
        declareMacro("do_sbhl_table", "DO-SBHL-TABLE");
        declareMacro("map_sbhl_table", "MAP-SBHL-TABLE");
        declareMacro("mark_in_sbhl_table", "MARK-IN-SBHL-TABLE");
        declareFunction("get_sbhl_goal_table", "GET-SBHL-GOAL-TABLE", 0, 0, false);
        declareMacro("with_sbhl_goal_table", "WITH-SBHL-GOAL-TABLE");
        return NIL;
    }

    public static final SubLObject init_sbhl_marking_vars_file_alt() {
        defparameter("*DEBUG-SBHL-MARKING-SPACES?*", NIL);
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
        deflexical("*SBHL-GENL-PREDS-MARKING*", $list_alt86);
        deflexical("*SBHL-GENL-INVERSE-MARKING*", $list_alt87);
        deflexical("*SBHL-GENL-PREDS-AND-GENL-INVERSE-MARKING*", $list_alt88);
        deflexical("*SBHL-GENL-INVERSE-AND-GENL-PREDS-MARKING*", $list_alt89);
        defparameter("*SBHL-MARKING-GENERATION*", NIL);
        defparameter("*SBHL-SUSPEND-NEW-SPACES-DURING-MAPPING?*", NIL);
        defparameter("*SBHL-MAPPING-MARKING-SPACE*", NIL);
        defparameter("*SBHL-MAPPING-GATHER-MARKING-SPACE*", NIL);
        defparameter("*SBHL-TEMPORALITY-SEARCH-CHECKS-NODES-IN-TARGET-SPACE-P*", NIL);
        defparameter("*SBHL-TABLE*", $str_alt97$Table_used_for_public_marking_int);
        defparameter("*SBHL-GOAL-TABLE*", NIL);
        return NIL;
    }

    public static SubLObject init_sbhl_marking_vars_file() {
        if (SubLFiles.USE_V1) {
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
        }
        if (SubLFiles.USE_V2) {
            deflexical("*SBHL-GENL-PREDS-MARKING*", $list_alt86);
            deflexical("*SBHL-GENL-INVERSE-MARKING*", $list_alt87);
            deflexical("*SBHL-GENL-PREDS-AND-GENL-INVERSE-MARKING*", $list_alt88);
            deflexical("*SBHL-GENL-INVERSE-AND-GENL-PREDS-MARKING*", $list_alt89);
            defparameter("*SBHL-TABLE*", $str_alt97$Table_used_for_public_marking_int);
        }
        return NIL;
    }

    public static SubLObject init_sbhl_marking_vars_file_Previous() {
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

    

    static private final SubLList $list_alt2 = list(makeSymbol("SPACE"), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list_alt4 = list(list(makeSymbol("GET-SBHL-MARKING-SPACE")));

    static private final SubLList $list_alt6 = list(makeSymbol("NUM"), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLSymbol $sym7$ALREADY_RESOURCING_P = makeUninternedSymbol("ALREADY-RESOURCING-P");

    static private final SubLList $list_alt8 = list(makeSymbol("*RESOURCING-SBHL-MARKING-SPACES-P*"));

    static private final SubLList $list_alt13 = list(list(makeSymbol("*RESOURCING-SBHL-MARKING-SPACES-P*"), T));

    static private final SubLList $list_alt15 = list(list(makeSymbol("*RESOURCING-SBHL-MARKING-SPACES-P*"), NIL));

    static private final SubLList $list_alt16 = list(makeSymbol("RESOURCING-P"), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list_alt18 = list(makeSymbol("SBHL-MS-RESOURCE"), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list_alt19 = list(list(makeSymbol("*RESOURCING-SBHL-MARKING-SPACES-P*"), T), list(makeSymbol("*RESOURCED-SBHL-MARKING-SPACE-LIMIT*"), list(makeSymbol("DETERMINE-MARKING-SPACE-LIMIT"), makeSymbol("*RESOURCED-SBHL-MARKING-SPACES*"))));

    static private final SubLList $list_alt21 = list(makeSymbol("*RESOURCED-SBHL-MARKING-SPACES*"));

    static private final SubLList $list_alt22 = list(list(makeSymbol("&KEY"), makeSymbol("NUM")), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list_alt23 = list(makeKeyword("NUM"));

    static private final SubLSymbol $sym26$SBHL_MS_RESOURCE = makeUninternedSymbol("SBHL-MS-RESOURCE");

    static private final SubLString $str_alt30$Dirty_resourced_marking_space_bei = makeString("Dirty resourced marking space being reused ~A!");

    static private final SubLString $str_alt31$Need_more_than_the_limit_of__A_ma = makeString("Need more than the limit of ~A marking spaces.");

    static private final SubLList $list_alt34 = list(makeSymbol("NAME"), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLSymbol $sym41$SOURCE = makeUninternedSymbol("SOURCE");

    static private final SubLList $list_alt42 = list(list(makeSymbol("SBHL-NEW-SPACE-SOURCE")));

    static private final SubLList $list_alt45 = list(list(makeSymbol("SPACE"), makeSymbol("SOURCE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list_alt47 = list(makeKeyword("OLD"));

    static private final SubLList $list_alt50 = list(makeKeyword("RESOURCE"));

    static private final SubLList $list_alt56 = list(makeSymbol("VAR"), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list_alt57 = list(makeSymbol("*SBHL-SPACE*"));

    static private final SubLList $list_alt58 = list(makeSymbol("*SBHL-GATHER-SPACE*"));

    static private final SubLList $list_alt59 = list(list(makeSymbol("NODE-VAR"), makeSymbol("MARKING-VAR"), makeSymbol("SBHL-SPACE"), makeSymbol("&OPTIONAL"), makeSymbol("DONE-VAR")), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list_alt62 = list(makeSymbol("FUNCTION"), makeSymbol("SBHL-SPACE"));

    static private final SubLSymbol $sym63$NODE = makeUninternedSymbol("NODE");

    static private final SubLSymbol $sym64$TAG = makeUninternedSymbol("TAG");

    static private final SubLString $str_alt71$no_mapping_method_defiend_for_sbh = makeString("no mapping method defiend for sbhl-space ~s");

    static private final SubLList $list_alt72 = list(list(makeSymbol("*SBHL-SUSPEND-NEW-SPACES?*"), T));

    static private final SubLList $list_alt73 = list(list(makeSymbol("*SBHL-SUSPEND-NEW-SPACES?*"), NIL));

    static private final SubLList $list_alt76 = list(list(makeSymbol("*SBHL-SPACE*"), makeSymbol("*SBHL-TARGET-SPACE*")), list(makeSymbol("*SBHL-GATHER-SPACE*"), makeSymbol("*SBHL-TARGET-GATHER-SPACE*")));

    static private final SubLList $list_alt79 = list(list(makeSymbol("*SBHL-SPACE*"), makeSymbol("*SBHL-TARGET-SPACE*")));

    static private final SubLList $list_alt82 = list(makeSymbol("SPACE-VAR"), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list_alt84 = list(list(makeSymbol("*SBHL-SPACE*"), makeSymbol("*SBHL-TERMINATING-MARKING-SPACE*")));

    static private final SubLList $list_alt86 = list(reader_make_constant_shell("genlPreds"));

    static private final SubLList $list_alt87 = list(reader_make_constant_shell("genlInverse"));

    static private final SubLList $list_alt88 = list(reader_make_constant_shell("genlPreds"), reader_make_constant_shell("genlInverse"));

    static private final SubLList $list_alt89 = list(reader_make_constant_shell("genlInverse"), reader_make_constant_shell("genlPreds"));

    static private final SubLList $list_alt90 = list(list(makeSymbol("*SBHL-MARKING-GENERATION*"), ZERO_INTEGER));

    static private final SubLList $list_alt93 = list(list(makeSymbol("*SBHL-SPACE*"), makeSymbol("*SBHL-MAPPING-MARKING-SPACE*")), list(makeSymbol("*SBHL-GATHER-SPACE*"), makeSymbol("*SBHL-MAPPING-GATHER-MARKING-SPACE*")));

    static private final SubLList $list_alt94 = list(list(makeSymbol("*SBHL-MAPPING-MARKING-SPACE*"), makeSymbol("*SBHL-TARGET-SPACE*")), list(makeSymbol("*SBHL-MAPPING-GATHER-MARKING-SPACE*"), makeSymbol("*SBHL-TARGET-GATHER-SPACE*")), list(makeSymbol("*SBHL-SUSPEND-NEW-SPACES-DURING-MAPPING?*"), T));

    static private final SubLList $list_alt95 = list(list(makeSymbol("*SBHL-SUSPEND-NEW-SPACES-DURING-MAPPING?*"), T));

    static private final SubLList $list_alt96 = list(list(makeSymbol("*SBHL-TEMPORALITY-SEARCH-CHECKS-NODES-IN-TARGET-SPACE-P*"), T));

    static private final SubLString $str_alt97$Table_used_for_public_marking_int = makeString("Table used for public marking interface");

    static private final SubLList $list_alt99 = list(makeSymbol("*SBHL-TABLE*"));

    static private final SubLSymbol $sym100$RESOURCING_P = makeUninternedSymbol("RESOURCING-P");

    static private final SubLList $list_alt101 = list(list(makeSymbol("RESOURCING-SBHL-MARKING-SPACES-P")));

    static private final SubLList $list_alt106 = list(list(makeSymbol("NODE-VAR"), makeSymbol("MARKING-VAR"), makeSymbol("SBHL-TABLE"), makeSymbol("&OPTIONAL"), makeSymbol("DONE-VAR")), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list_alt107 = list(makeSymbol("FUNCTION"), makeSymbol("SBHL-TABLE"));

    static private final SubLSymbol $sym108$NODE = makeUninternedSymbol("NODE");

    static private final SubLSymbol $sym109$TAG = makeUninternedSymbol("TAG");

    static private final SubLString $str_alt110$no_mapping_method_defiend_for_sbh = makeString("no mapping method defiend for sbhl-table ~s");

    static private final SubLList $list_alt112 = list(makeSymbol("TABLE"), makeSymbol("&BODY"), makeSymbol("BODY"));
}

/**
 * Total time: 253 ms
 */
