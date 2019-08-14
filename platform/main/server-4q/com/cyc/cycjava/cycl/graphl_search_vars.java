/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;

/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      GRAPHL-SEARCH-VARS
 * source file: /cyc/top/cycl/graphl-search-vars.lisp
 * created:     2019/07/03 17:37:18
 */
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_greater;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_space;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.append;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.listS;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.eq;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.identity;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.pointer;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.funcall;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.make_hash_table;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.write;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.def_csetf;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.makeStructDeclNative;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.register_method;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.atom;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.function_spec_p;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.hash_table_p;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.listp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.type_of;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeInteger;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.cdestructuring_bind_error;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.property_list_member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cadr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cddr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.$print_object_method_table$;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.$print_readably$;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.print_not_readable;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.bq_cons;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.write_char;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.write_string;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.declareMacro;
import static com.cyc.tool.subl.util.SubLFiles.defconstant;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;

import org.armedbear.lisp.Lisp;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.util.SubLFiles.LispMethod;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      GRAPHL-SEARCH-VARS
 * source file: /cyc/top/cycl/graphl-search-vars.lisp
 * created:     2019/07/03 17:37:18
 */
public final class graphl_search_vars extends SubLTranslatedFile implements V12 {
    private static final graphl_search_vars me = new graphl_search_vars();
    // Definitions
    public static final class $graphl_search_native extends SubLStructNative {
	@Override
	public SubLStructDecl getStructDecl() {
	    return structDecl;
	}

	@Override
	public SubLObject getField2() {
	    return $direction;
	}

	@Override
	public SubLObject getField3() {
	    return $type;
	}

	@Override
	public SubLObject getField4() {
	    return $order;
	}

	@Override
	public SubLObject getField5() {
	    return $cutoff;
	}

	@Override
	public SubLObject getField6() {
	    return $marking;
	}

	@Override
	public SubLObject getField7() {
	    return $marking_space;
	}

	@Override
	public SubLObject getField8() {
	    return $goal_space;
	}

	@Override
	public SubLObject getField9() {
	    return $goal;
	}

	@Override
	public SubLObject getField10() {
	    return $goal_fn;
	}

	@Override
	public SubLObject getField11() {
	    return $goal_found_p;
	}

	@Override
	public SubLObject getField12() {
	    return $satisfy_fn;
	}

	@Override
	public SubLObject getField13() {
	    return $map_fn;
	}

	@Override
	public SubLObject getField14() {
	    return $justifyP;
	}

	@Override
	public SubLObject getField15() {
	    return $add_to_resultP;
	}

	@Override
	public SubLObject getField16() {
	    return $unwind_fn_toggle;
	}

	@Override
	public SubLObject getField17() {
	    return $result;
	}

	@Override
	public SubLObject getField18() {
	    return $graph;
	}

	@Override
	public SubLObject setField2(SubLObject value) {
	    return $direction = value;
	}

	@Override
	public SubLObject setField3(SubLObject value) {
	    return $type = value;
	}

	@Override
	public SubLObject setField4(SubLObject value) {
	    return $order = value;
	}

	@Override
	public SubLObject setField5(SubLObject value) {
	    return $cutoff = value;
	}

	@Override
	public SubLObject setField6(SubLObject value) {
	    return $marking = value;
	}

	@Override
	public SubLObject setField7(SubLObject value) {
	    return $marking_space = value;
	}

	@Override
	public SubLObject setField8(SubLObject value) {
	    return $goal_space = value;
	}

	@Override
	public SubLObject setField9(SubLObject value) {
	    return $goal = value;
	}

	@Override
	public SubLObject setField10(SubLObject value) {
	    return $goal_fn = value;
	}

	@Override
	public SubLObject setField11(SubLObject value) {
	    return $goal_found_p = value;
	}

	@Override
	public SubLObject setField12(SubLObject value) {
	    return $satisfy_fn = value;
	}

	@Override
	public SubLObject setField13(SubLObject value) {
	    return $map_fn = value;
	}

	@Override
	public SubLObject setField14(SubLObject value) {
	    return $justifyP = value;
	}

	@Override
	public SubLObject setField15(SubLObject value) {
	    return $add_to_resultP = value;
	}

	@Override
	public SubLObject setField16(SubLObject value) {
	    return $unwind_fn_toggle = value;
	}

	@Override
	public SubLObject setField17(SubLObject value) {
	    return $result = value;
	}

	@Override
	public SubLObject setField18(SubLObject value) {
	    return $graph = value;
	}

	public SubLObject $direction = Lisp.NIL;

	public SubLObject $type = Lisp.NIL;

	public SubLObject $order = Lisp.NIL;

	public SubLObject $cutoff = Lisp.NIL;

	public SubLObject $marking = Lisp.NIL;

	public SubLObject $marking_space = Lisp.NIL;

	public SubLObject $goal_space = Lisp.NIL;

	public SubLObject $goal = Lisp.NIL;

	public SubLObject $goal_fn = Lisp.NIL;

	public SubLObject $goal_found_p = Lisp.NIL;

	public SubLObject $satisfy_fn = Lisp.NIL;

	public SubLObject $map_fn = Lisp.NIL;

	public SubLObject $justifyP = Lisp.NIL;

	public SubLObject $add_to_resultP = Lisp.NIL;

	public SubLObject $unwind_fn_toggle = Lisp.NIL;

	public SubLObject $result = Lisp.NIL;

	public SubLObject $graph = Lisp.NIL;

	private static final SubLStructDeclNative structDecl = makeStructDeclNative(graphl_search_vars.$graphl_search_native.class, graphl_search_vars.GRAPHL_SEARCH, graphl_search_vars.GRAPHL_SEARCH_P, graphl_search_vars.$list_alt2, graphl_search_vars.$list_alt3,
		new String[] { "$direction", "$type", "$order", "$cutoff", "$marking", "$marking_space", "$goal_space", "$goal", "$goal_fn", "$goal_found_p", "$satisfy_fn", "$map_fn", "$justifyP", "$add_to_resultP", "$unwind_fn_toggle", "$result", "$graph" }, graphl_search_vars.$list_alt4,
		graphl_search_vars.$list_alt5, graphl_search_vars.PRINT_GRAPHL_SEARCH);
    }

    private static final SubLSymbol _CSETF_GRAPHL_SEARCH_DIRECTION = makeSymbol("_CSETF-GRAPHL-SEARCH-DIRECTION");

    private static final SubLSymbol $ALLOW_OTHER_KEYS = makeKeyword("ALLOW-OTHER-KEYS");

    // defconstant
    @LispMethod(comment = "defconstant")
    private static final SubLSymbol $dtp_graphl_search$ = makeSymbol("*DTP-GRAPHL-SEARCH*");

    private static final SubLSymbol $kw55$ADD_TO_RESULT_ = makeKeyword("ADD-TO-RESULT?");

    private static final SubLList $list_alt100 = list(makeKeyword("FORWARD"), makeKeyword("BACKWARD"));

    private static final SubLList $list_alt101 = list(makeKeyword("FORWARD"));

    private static final SubLList $list_alt102 = list(makeKeyword("BACKWARD"));

    private static final SubLList $list_alt103 = list(list(makeSymbol("DIR-VAR"), makeSymbol("DIRECTION"), makeSymbol("&KEY"), makeSymbol("DONE-VAR")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLList $list_alt104 = list(makeKeyword("DONE-VAR"));

    private static final SubLList $list_alt2 = list(new SubLObject[] { makeSymbol("DIRECTION"), makeSymbol("TYPE"), makeSymbol("ORDER"), makeSymbol("CUTOFF"), makeSymbol("MARKING"), makeSymbol("MARKING-SPACE"), makeSymbol("GOAL-SPACE"), makeSymbol("GOAL"), makeSymbol("GOAL-FN"),
	    makeSymbol("GOAL-FOUND-P"), makeSymbol("SATISFY-FN"), makeSymbol("MAP-FN"), makeSymbol("JUSTIFY?"), makeSymbol("ADD-TO-RESULT?"), makeSymbol("UNWIND-FN-TOGGLE"), makeSymbol("RESULT"), makeSymbol("GRAPH") });

    private static final SubLList $list_alt3 = list(new SubLObject[] { makeKeyword("DIRECTION"), $TYPE, makeKeyword("ORDER"), makeKeyword("CUTOFF"), makeKeyword("MARKING"), makeKeyword("MARKING-SPACE"), makeKeyword("GOAL-SPACE"), $GOAL, makeKeyword("GOAL-FN"),
	    makeKeyword("GOAL-FOUND-P"), makeKeyword("SATISFY-FN"), makeKeyword("MAP-FN"), makeKeyword("JUSTIFY?"), makeKeyword("ADD-TO-RESULT?"), makeKeyword("UNWIND-FN-TOGGLE"), makeKeyword("RESULT"), makeKeyword("GRAPH") });

    private static final SubLList $list_alt4 = list(new SubLObject[] { makeSymbol("GRAPHL-SEARCH-DIRECTION"), makeSymbol("GRAPHL-SEARCH-TYPE"), makeSymbol("GRAPHL-SEARCH-ORDER"), makeSymbol("GRAPHL-SEARCH-CUTOFF"), makeSymbol("GRAPHL-SEARCH-MARKING"), makeSymbol("GRAPHL-SEARCH-MARKING-SPACE"),
	    makeSymbol("GRAPHL-SEARCH-GOAL-SPACE"), makeSymbol("GRAPHL-SEARCH-GOAL"), makeSymbol("GRAPHL-SEARCH-GOAL-FN"), makeSymbol("GRAPHL-SEARCH-GOAL-FOUND-P"), makeSymbol("GRAPHL-SEARCH-SATISFY-FN"), makeSymbol("GRAPHL-SEARCH-MAP-FN"), makeSymbol("GRAPHL-SEARCH-JUSTIFY?"),
	    makeSymbol("GRAPHL-SEARCH-ADD-TO-RESULT?"), makeSymbol("GRAPHL-SEARCH-UNWIND-FN-TOGGLE"), makeSymbol("GRAPHL-SEARCH-RESULT"), makeSymbol("GRAPHL-SEARCH-GRAPH") });

    private static final SubLList $list_alt5 = list(new SubLObject[] { makeSymbol("_CSETF-GRAPHL-SEARCH-DIRECTION"), makeSymbol("_CSETF-GRAPHL-SEARCH-TYPE"), makeSymbol("_CSETF-GRAPHL-SEARCH-ORDER"), makeSymbol("_CSETF-GRAPHL-SEARCH-CUTOFF"), makeSymbol("_CSETF-GRAPHL-SEARCH-MARKING"),
	    makeSymbol("_CSETF-GRAPHL-SEARCH-MARKING-SPACE"), makeSymbol("_CSETF-GRAPHL-SEARCH-GOAL-SPACE"), makeSymbol("_CSETF-GRAPHL-SEARCH-GOAL"), makeSymbol("_CSETF-GRAPHL-SEARCH-GOAL-FN"), makeSymbol("_CSETF-GRAPHL-SEARCH-GOAL-FOUND-P"), makeSymbol("_CSETF-GRAPHL-SEARCH-SATISFY-FN"),
	    makeSymbol("_CSETF-GRAPHL-SEARCH-MAP-FN"), makeSymbol("_CSETF-GRAPHL-SEARCH-JUSTIFY?"), makeSymbol("_CSETF-GRAPHL-SEARCH-ADD-TO-RESULT?"), makeSymbol("_CSETF-GRAPHL-SEARCH-UNWIND-FN-TOGGLE"), makeSymbol("_CSETF-GRAPHL-SEARCH-RESULT"), makeSymbol("_CSETF-GRAPHL-SEARCH-GRAPH") });

    private static final SubLList $list_alt88 = list(makeKeyword("DEPTH-MARKING"), makeKeyword("SIMPLE"));

    private static final SubLList $list_alt89 = list(makeKeyword("ACCESSIBLE"), makeKeyword("FORWARD"), makeKeyword("BACKWARD"));

    private static final SubLList $list_alt90 = list(makeSymbol("SEARCH-VAR"), makeSymbol("PLIST"), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLList $list_alt92 = list(list(makeSymbol("NEW-GRAPHL-SEARCH")));

    private static final SubLList $list2 = list(new SubLObject[] { makeSymbol("TYPE"), makeSymbol("ORDER"), makeSymbol("CUTOFF"), makeSymbol("MARKING"), makeSymbol("MARKING-SPACE"), makeSymbol("GOAL-SPACE"), makeSymbol("GOAL"), makeSymbol("GOAL-FN"), makeSymbol("GOAL-FOUND-P"),
	    makeSymbol("SATISFY-FN"), makeSymbol("MAP-FN"), makeSymbol("JUSTIFY?"), makeSymbol("ADD-TO-RESULT?"), makeSymbol("UNWIND-FN-TOGGLE"), makeSymbol("RESULT"), makeSymbol("GRAPH") });

    private static final SubLList $list3 = list(new SubLObject[] { $TYPE, makeKeyword("ORDER"), makeKeyword("CUTOFF"), makeKeyword("MARKING"), makeKeyword("MARKING-SPACE"), makeKeyword("GOAL-SPACE"), $GOAL, makeKeyword("GOAL-FN"), makeKeyword("GOAL-FOUND-P"),
	    makeKeyword("SATISFY-FN"), makeKeyword("MAP-FN"), makeKeyword("JUSTIFY?"), makeKeyword("ADD-TO-RESULT?"), makeKeyword("UNWIND-FN-TOGGLE"), makeKeyword("RESULT"), makeKeyword("GRAPH") });

    private static final SubLList $list4 = list(new SubLObject[] { makeSymbol("GRAPHL-SEARCH-TYPE"), makeSymbol("GRAPHL-SEARCH-ORDER"), makeSymbol("GRAPHL-SEARCH-CUTOFF"), makeSymbol("GRAPHL-SEARCH-MARKING"), makeSymbol("GRAPHL-SEARCH-MARKING-SPACE"), makeSymbol("GRAPHL-SEARCH-GOAL-SPACE"),
	    makeSymbol("GRAPHL-SEARCH-GOAL"), makeSymbol("GRAPHL-SEARCH-GOAL-FN"), makeSymbol("GRAPHL-SEARCH-GOAL-FOUND-P"), makeSymbol("GRAPHL-SEARCH-SATISFY-FN"), makeSymbol("GRAPHL-SEARCH-MAP-FN"), makeSymbol("GRAPHL-SEARCH-JUSTIFY?"), makeSymbol("GRAPHL-SEARCH-ADD-TO-RESULT?"),
	    makeSymbol("GRAPHL-SEARCH-UNWIND-FN-TOGGLE"), makeSymbol("GRAPHL-SEARCH-RESULT"), makeSymbol("GRAPHL-SEARCH-GRAPH") });

    private static final SubLList $list5 = list(new SubLObject[] { makeSymbol("_CSETF-GRAPHL-SEARCH-TYPE"), makeSymbol("_CSETF-GRAPHL-SEARCH-ORDER"), makeSymbol("_CSETF-GRAPHL-SEARCH-CUTOFF"), makeSymbol("_CSETF-GRAPHL-SEARCH-MARKING"), makeSymbol("_CSETF-GRAPHL-SEARCH-MARKING-SPACE"),
	    makeSymbol("_CSETF-GRAPHL-SEARCH-GOAL-SPACE"), makeSymbol("_CSETF-GRAPHL-SEARCH-GOAL"), makeSymbol("_CSETF-GRAPHL-SEARCH-GOAL-FN"), makeSymbol("_CSETF-GRAPHL-SEARCH-GOAL-FOUND-P"), makeSymbol("_CSETF-GRAPHL-SEARCH-SATISFY-FN"), makeSymbol("_CSETF-GRAPHL-SEARCH-MAP-FN"),
	    makeSymbol("_CSETF-GRAPHL-SEARCH-JUSTIFY?"), makeSymbol("_CSETF-GRAPHL-SEARCH-ADD-TO-RESULT?"), makeSymbol("_CSETF-GRAPHL-SEARCH-UNWIND-FN-TOGGLE"), makeSymbol("_CSETF-GRAPHL-SEARCH-RESULT"), makeSymbol("_CSETF-GRAPHL-SEARCH-GRAPH") });

    private static final SubLList $list88 = list(makeSymbol("SEARCH-VAR"), makeSymbol("PLIST"), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLList $list90 = list(list(makeSymbol("NEW-GRAPHL-SEARCH")));

    private static final SubLString $str_alt59$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");

    private static final SubLString $str_alt60$__ = makeString("#<");

    private static final SubLString $str_alt63$GraphL_Search____a__ = makeString("GraphL Search : ~a~%");

    private static final SubLString $str_alt64$Direction____a__ = makeString("Direction : ~a~%");

    private static final SubLString $str_alt65$Type____a__ = makeString("Type : ~a~%");

    private static final SubLString $str_alt66$Order____a__ = makeString("Order : ~a~%");

    private static final SubLString $str_alt67$Cutoff____a__ = makeString("Cutoff : ~a~%");

    private static final SubLString $str_alt68$Marking____a__ = makeString("Marking : ~a~%");

    private static final SubLString $str_alt69$Space____a__ = makeString("Space : ~a~%");

    private static final SubLString $str_alt70$Goal_Space____a__ = makeString("Goal Space : ~a~%");

    private static final SubLString $str_alt71$Goal____a__ = makeString("Goal : ~a~%");

    private static final SubLString $str_alt72$Goal_Fn____a__ = makeString("Goal Fn : ~a~%");

    private static final SubLString $str_alt73$Goal_Found_P____a__ = makeString("Goal Found-P : ~a~%");

    private static final SubLString $str_alt74$Satisfy_Fn____a__ = makeString("Satisfy Fn : ~a~%");

    private static final SubLString $str_alt75$Map_Fn____a__ = makeString("Map Fn : ~a~%");

    private static final SubLString $str_alt76$Justify_____a__ = makeString("Justify? : ~a~%");

    private static final SubLString $str_alt77$Add_to_Result_____a__ = makeString("Add to Result? : ~a~%");

    private static final SubLString $str_alt78$Unwind_Fn_Toggle____a__ = makeString("Unwind Fn Toggle : ~a~%");

    private static final SubLString $str_alt79$Result____a__ = makeString("Result : ~a~%");

    private static final SubLString $str_alt80$Graph____a__ = makeString("Graph : ~a~%");

    private static final SubLString $str63$GraphL_Search____a__ = makeString("GraphL Search : ~a~%");

    private static final SubLSymbol $sym32$GRAPHL_SEARCH_JUSTIFY_ = makeSymbol("GRAPHL-SEARCH-JUSTIFY?");

    private static final SubLSymbol $sym33$_CSETF_GRAPHL_SEARCH_JUSTIFY_ = makeSymbol("_CSETF-GRAPHL-SEARCH-JUSTIFY?");

    private static final SubLSymbol $sym34$GRAPHL_SEARCH_ADD_TO_RESULT_ = makeSymbol("GRAPHL-SEARCH-ADD-TO-RESULT?");

    private static final SubLSymbol $sym35$_CSETF_GRAPHL_SEARCH_ADD_TO_RESULT_ = makeSymbol("_CSETF-GRAPHL-SEARCH-ADD-TO-RESULT?");

    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $use_zero_size_graphl_marking_spacesP$ = makeSymbol("*USE-ZERO-SIZE-GRAPHL-MARKING-SPACES?*");

    private static final SubLSymbol DETERMINE_GRAPHL_RELEVANT_DIRECTIONS = makeSymbol("DETERMINE-GRAPHL-RELEVANT-DIRECTIONS");

    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    private static final SubLSymbol GRAPHL_SEARCH = makeSymbol("GRAPHL-SEARCH");

    private static final SubLSymbol GRAPHL_SEARCH_DIRECTION = makeSymbol("GRAPHL-SEARCH-DIRECTION");

    private static final SubLSymbol GRAPHL_SEARCH_P = makeSymbol("GRAPHL-SEARCH-P");

    private static final SubLSymbol GRAPHL_SEARCH_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("GRAPHL-SEARCH-PRINT-FUNCTION-TRAMPOLINE");


 public static final String myName = "com.cyc.cycjava.cycl.graphl_search_vars";

    private static final SubLSymbol PRINT_GRAPHL_SEARCH = makeSymbol("PRINT-GRAPHL-SEARCH");

    private static final SubLList $list8 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("GRAPHL-SEARCH-P"));

    private static final SubLList $list87 = list(makeKeyword("DEPTH-MARKING"), makeKeyword("SIMPLE"));

    private static final SubLString $str57$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");

    private static final SubLString $str64$Type____a__ = makeString("Type : ~a~%");

    private static final SubLString $str65$Order____a__ = makeString("Order : ~a~%");

    private static final SubLString $str66$Cutoff____a__ = makeString("Cutoff : ~a~%");

    private static final SubLString $str67$Marking____a__ = makeString("Marking : ~a~%");

    private static final SubLString $str68$Space____a__ = makeString("Space : ~a~%");

    private static final SubLString $str69$Goal_Space____a__ = makeString("Goal Space : ~a~%");

    private static final SubLString $str70$Goal____a__ = makeString("Goal : ~a~%");

    private static final SubLString $str71$Goal_Fn____a__ = makeString("Goal Fn : ~a~%");

    private static final SubLString $str72$Goal_Found_P____a__ = makeString("Goal Found-P : ~a~%");

    private static final SubLString $str73$Satisfy_Fn____a__ = makeString("Satisfy Fn : ~a~%");

    private static final SubLString $str74$Map_Fn____a__ = makeString("Map Fn : ~a~%");

    private static final SubLString $str75$Justify_____a__ = makeString("Justify? : ~a~%");

    private static final SubLString $str76$Add_to_Result_____a__ = makeString("Add to Result? : ~a~%");

    private static final SubLString $str77$Unwind_Fn_Toggle____a__ = makeString("Unwind Fn Toggle : ~a~%");

    private static final SubLString $str78$Result____a__ = makeString("Result : ~a~%");

    private static final SubLString $str79$Graph____a__ = makeString("Graph : ~a~%");

    protected static final SubLSymbol _CSETF_GRAPHL_SEARCH_CUTOFF = makeSymbol("_CSETF-GRAPHL-SEARCH-CUTOFF");

    protected static final SubLSymbol _CSETF_GRAPHL_SEARCH_GOAL = makeSymbol("_CSETF-GRAPHL-SEARCH-GOAL");

    protected static final SubLSymbol _CSETF_GRAPHL_SEARCH_GOAL_FN = makeSymbol("_CSETF-GRAPHL-SEARCH-GOAL-FN");

    protected static final SubLSymbol _CSETF_GRAPHL_SEARCH_GOAL_FOUND_P = makeSymbol("_CSETF-GRAPHL-SEARCH-GOAL-FOUND-P");

    protected static final SubLSymbol _CSETF_GRAPHL_SEARCH_GOAL_SPACE = makeSymbol("_CSETF-GRAPHL-SEARCH-GOAL-SPACE");

    protected static final SubLSymbol _CSETF_GRAPHL_SEARCH_GRAPH = makeSymbol("_CSETF-GRAPHL-SEARCH-GRAPH");

    protected static final SubLSymbol _CSETF_GRAPHL_SEARCH_MAP_FN = makeSymbol("_CSETF-GRAPHL-SEARCH-MAP-FN");

    protected static final SubLSymbol _CSETF_GRAPHL_SEARCH_MARKING = makeSymbol("_CSETF-GRAPHL-SEARCH-MARKING");

    protected static final SubLSymbol _CSETF_GRAPHL_SEARCH_MARKING_SPACE = makeSymbol("_CSETF-GRAPHL-SEARCH-MARKING-SPACE");

    protected static final SubLSymbol _CSETF_GRAPHL_SEARCH_ORDER = makeSymbol("_CSETF-GRAPHL-SEARCH-ORDER");

    protected static final SubLSymbol _CSETF_GRAPHL_SEARCH_RESULT = makeSymbol("_CSETF-GRAPHL-SEARCH-RESULT");

    protected static final SubLSymbol _CSETF_GRAPHL_SEARCH_SATISFY_FN = makeSymbol("_CSETF-GRAPHL-SEARCH-SATISFY-FN");

    protected static final SubLSymbol _CSETF_GRAPHL_SEARCH_TYPE = makeSymbol("_CSETF-GRAPHL-SEARCH-TYPE");

    protected static final SubLSymbol _CSETF_GRAPHL_SEARCH_UNWIND_FN_TOGGLE = makeSymbol("_CSETF-GRAPHL-SEARCH-UNWIND-FN-TOGGLE");

    protected static final SubLSymbol $EDGES_ON_UNWIND = makeKeyword("EDGES-ON-UNWIND");

    protected static final SubLSymbol $GOAL_FOUND_P = makeKeyword("GOAL-FOUND-P");

    // deflexical
    @LispMethod(comment = "deflexical")
    protected static final SubLSymbol $graphl_search_size$ = makeSymbol("*GRAPHL-SEARCH-SIZE*");

    protected static final SubLInteger $int$200 = makeInteger(200);

    protected static final SubLSymbol $kw53$ADD_TO_RESULT_ = makeKeyword("ADD-TO-RESULT?");

    protected static final SubLSymbol $NODES_ON_WIND = makeKeyword("NODES-ON-WIND");

    protected static final SubLSymbol $sym31$GRAPHL_SEARCH_JUSTIFY_ = makeSymbol("GRAPHL-SEARCH-JUSTIFY?");

    protected static final SubLSymbol $sym32$_CSETF_GRAPHL_SEARCH_JUSTIFY_ = makeSymbol("_CSETF-GRAPHL-SEARCH-JUSTIFY?");

    protected static final SubLSymbol $sym33$GRAPHL_SEARCH_ADD_TO_RESULT_ = makeSymbol("GRAPHL-SEARCH-ADD-TO-RESULT?");

    protected static final SubLSymbol $sym34$_CSETF_GRAPHL_SEARCH_ADD_TO_RESULT_ = makeSymbol("_CSETF-GRAPHL-SEARCH-ADD-TO-RESULT?");

    protected static final SubLSymbol $UNWIND_FN_TOGGLE = makeKeyword("UNWIND-FN-TOGGLE");

    protected static final SubLSymbol DESTROY_GRAPHL_SEARCH = makeSymbol("DESTROY-GRAPHL-SEARCH");

    protected static final SubLSymbol GRAPHL_SEARCH_CUTOFF = makeSymbol("GRAPHL-SEARCH-CUTOFF");

    protected static final SubLSymbol GRAPHL_SEARCH_GOAL = makeSymbol("GRAPHL-SEARCH-GOAL");

    protected static final SubLSymbol GRAPHL_SEARCH_GOAL_FN = makeSymbol("GRAPHL-SEARCH-GOAL-FN");

    protected static final SubLSymbol GRAPHL_SEARCH_GOAL_FOUND_P = makeSymbol("GRAPHL-SEARCH-GOAL-FOUND-P");

    protected static final SubLSymbol GRAPHL_SEARCH_GOAL_SPACE = makeSymbol("GRAPHL-SEARCH-GOAL-SPACE");

    protected static final SubLSymbol GRAPHL_SEARCH_GRAPH = makeSymbol("GRAPHL-SEARCH-GRAPH");

    protected static final SubLSymbol GRAPHL_SEARCH_MAP_FN = makeSymbol("GRAPHL-SEARCH-MAP-FN");

    protected static final SubLSymbol GRAPHL_SEARCH_MARKING = makeSymbol("GRAPHL-SEARCH-MARKING");

    protected static final SubLSymbol GRAPHL_SEARCH_MARKING_SPACE = makeSymbol("GRAPHL-SEARCH-MARKING-SPACE");

    protected static final SubLSymbol GRAPHL_SEARCH_ORDER = makeSymbol("GRAPHL-SEARCH-ORDER");

    protected static final SubLSymbol GRAPHL_SEARCH_RESULT = makeSymbol("GRAPHL-SEARCH-RESULT");

    protected static final SubLSymbol GRAPHL_SEARCH_SATISFY_FN = makeSymbol("GRAPHL-SEARCH-SATISFY-FN");

    protected static final SubLSymbol GRAPHL_SEARCH_TYPE = makeSymbol("GRAPHL-SEARCH-TYPE");

    protected static final SubLSymbol GRAPHL_SEARCH_UNWIND_FN_TOGGLE = makeSymbol("GRAPHL-SEARCH-UNWIND-FN-TOGGLE");

    protected static final SubLSymbol MAKE_GRAPHL_SEARCH = makeSymbol("MAKE-GRAPHL-SEARCH");

    protected static final SubLSymbol SET_GRAPHL_SEARCH_PROPERTIES = makeSymbol("SET-GRAPHL-SEARCH-PROPERTIES");

    protected static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_GRAPHL_SEARCH_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-GRAPHL-SEARCH-METHOD");

    protected static final SubLSymbol WITH_GRAPHL_SEARCH_INITIALIZED = makeSymbol("WITH-GRAPHL-SEARCH-INITIALIZED");

    public static final SubLObject _csetf_graphl_search_add_to_resultP(SubLObject v_object, SubLObject value) {
	SubLTrampolineFile.checkType(v_object, GRAPHL_SEARCH_P);
	return v_object.setField15(value);
    }

    public static final SubLObject _csetf_graphl_search_cutoff(SubLObject v_object, SubLObject value) {
	SubLTrampolineFile.checkType(v_object, GRAPHL_SEARCH_P);
	return v_object.setField5(value);
    }

    public static final SubLObject _csetf_graphl_search_direction(SubLObject v_object, SubLObject value) {
	SubLTrampolineFile.checkType(v_object, GRAPHL_SEARCH_P);
	return v_object.setField2(value);
    }

    public static final SubLObject _csetf_graphl_search_goal(SubLObject v_object, SubLObject value) {
	SubLTrampolineFile.checkType(v_object, GRAPHL_SEARCH_P);
	return v_object.setField9(value);
    }

    public static final SubLObject _csetf_graphl_search_goal_fn(SubLObject v_object, SubLObject value) {
	SubLTrampolineFile.checkType(v_object, GRAPHL_SEARCH_P);
	return v_object.setField10(value);
    }

    public static final SubLObject _csetf_graphl_search_goal_found_p(SubLObject v_object, SubLObject value) {
	SubLTrampolineFile.checkType(v_object, GRAPHL_SEARCH_P);
	return v_object.setField11(value);
    }

    public static final SubLObject _csetf_graphl_search_goal_space(SubLObject v_object, SubLObject value) {
	SubLTrampolineFile.checkType(v_object, GRAPHL_SEARCH_P);
	return v_object.setField8(value);
    }

    public static final SubLObject _csetf_graphl_search_graph(SubLObject v_object, SubLObject value) {
	SubLTrampolineFile.checkType(v_object, GRAPHL_SEARCH_P);
	return v_object.setField18(value);
    }

    public static final SubLObject _csetf_graphl_search_justifyP(SubLObject v_object, SubLObject value) {
	SubLTrampolineFile.checkType(v_object, GRAPHL_SEARCH_P);
	return v_object.setField14(value);
    }

    public static final SubLObject _csetf_graphl_search_map_fn(SubLObject v_object, SubLObject value) {
	SubLTrampolineFile.checkType(v_object, GRAPHL_SEARCH_P);
	return v_object.setField13(value);
    }

    public static final SubLObject _csetf_graphl_search_marking(SubLObject v_object, SubLObject value) {
	SubLTrampolineFile.checkType(v_object, GRAPHL_SEARCH_P);
	return v_object.setField6(value);
    }

    public static final SubLObject _csetf_graphl_search_marking_space(SubLObject v_object, SubLObject value) {
	SubLTrampolineFile.checkType(v_object, GRAPHL_SEARCH_P);
	return v_object.setField7(value);
    }

    public static final SubLObject _csetf_graphl_search_order(SubLObject v_object, SubLObject value) {
	SubLTrampolineFile.checkType(v_object, GRAPHL_SEARCH_P);
	return v_object.setField4(value);
    }

    public static final SubLObject _csetf_graphl_search_result(SubLObject v_object, SubLObject value) {
	SubLTrampolineFile.checkType(v_object, GRAPHL_SEARCH_P);
	return v_object.setField17(value);
    }

    public static final SubLObject _csetf_graphl_search_satisfy_fn(SubLObject v_object, SubLObject value) {
	SubLTrampolineFile.checkType(v_object, GRAPHL_SEARCH_P);
	return v_object.setField12(value);
    }

    public static final SubLObject _csetf_graphl_search_type(SubLObject v_object, SubLObject value) {
	SubLTrampolineFile.checkType(v_object, GRAPHL_SEARCH_P);
	return v_object.setField3(value);
    }

    public static final SubLObject _csetf_graphl_search_unwind_fn_toggle(SubLObject v_object, SubLObject value) {
	SubLTrampolineFile.checkType(v_object, GRAPHL_SEARCH_P);
	return v_object.setField16(value);
    }

    public static SubLObject declare_graphl_search_vars_file() {
	if (SubLFiles.USE_V1) {
	    declareFunction("graphl_search_print_function_trampoline", "GRAPHL-SEARCH-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
	    declareFunction("graphl_search_p", "GRAPHL-SEARCH-P", 1, 0, false);
	    new graphl_search_vars.$graphl_search_p$UnaryFunction();
	    declareFunction("graphl_search_type", "GRAPHL-SEARCH-TYPE", 1, 0, false);
	    declareFunction("graphl_search_order", "GRAPHL-SEARCH-ORDER", 1, 0, false);
	    declareFunction("graphl_search_cutoff", "GRAPHL-SEARCH-CUTOFF", 1, 0, false);
	    declareFunction("graphl_search_marking", "GRAPHL-SEARCH-MARKING", 1, 0, false);
	    declareFunction("graphl_search_marking_space", "GRAPHL-SEARCH-MARKING-SPACE", 1, 0, false);
	    declareFunction("graphl_search_goal_space", "GRAPHL-SEARCH-GOAL-SPACE", 1, 0, false);
	    declareFunction("graphl_search_goal", "GRAPHL-SEARCH-GOAL", 1, 0, false);
	    declareFunction("graphl_search_goal_fn", "GRAPHL-SEARCH-GOAL-FN", 1, 0, false);
	    declareFunction("graphl_search_goal_found_p", "GRAPHL-SEARCH-GOAL-FOUND-P", 1, 0, false);
	    declareFunction("graphl_search_satisfy_fn", "GRAPHL-SEARCH-SATISFY-FN", 1, 0, false);
	    declareFunction("graphl_search_map_fn", "GRAPHL-SEARCH-MAP-FN", 1, 0, false);
	    declareFunction("graphl_search_justifyP", "GRAPHL-SEARCH-JUSTIFY?", 1, 0, false);
	    declareFunction("graphl_search_add_to_resultP", "GRAPHL-SEARCH-ADD-TO-RESULT?", 1, 0, false);
	    declareFunction("graphl_search_unwind_fn_toggle", "GRAPHL-SEARCH-UNWIND-FN-TOGGLE", 1, 0, false);
	    declareFunction("graphl_search_result", "GRAPHL-SEARCH-RESULT", 1, 0, false);
	    declareFunction("graphl_search_graph", "GRAPHL-SEARCH-GRAPH", 1, 0, false);
	    declareFunction("_csetf_graphl_search_type", "_CSETF-GRAPHL-SEARCH-TYPE", 2, 0, false);
	    declareFunction("_csetf_graphl_search_order", "_CSETF-GRAPHL-SEARCH-ORDER", 2, 0, false);
	    declareFunction("_csetf_graphl_search_cutoff", "_CSETF-GRAPHL-SEARCH-CUTOFF", 2, 0, false);
	    declareFunction("_csetf_graphl_search_marking", "_CSETF-GRAPHL-SEARCH-MARKING", 2, 0, false);
	    declareFunction("_csetf_graphl_search_marking_space", "_CSETF-GRAPHL-SEARCH-MARKING-SPACE", 2, 0, false);
	    declareFunction("_csetf_graphl_search_goal_space", "_CSETF-GRAPHL-SEARCH-GOAL-SPACE", 2, 0, false);
	    declareFunction("_csetf_graphl_search_goal", "_CSETF-GRAPHL-SEARCH-GOAL", 2, 0, false);
	    declareFunction("_csetf_graphl_search_goal_fn", "_CSETF-GRAPHL-SEARCH-GOAL-FN", 2, 0, false);
	    declareFunction("_csetf_graphl_search_goal_found_p", "_CSETF-GRAPHL-SEARCH-GOAL-FOUND-P", 2, 0, false);
	    declareFunction("_csetf_graphl_search_satisfy_fn", "_CSETF-GRAPHL-SEARCH-SATISFY-FN", 2, 0, false);
	    declareFunction("_csetf_graphl_search_map_fn", "_CSETF-GRAPHL-SEARCH-MAP-FN", 2, 0, false);
	    declareFunction("_csetf_graphl_search_justifyP", "_CSETF-GRAPHL-SEARCH-JUSTIFY?", 2, 0, false);
	    declareFunction("_csetf_graphl_search_add_to_resultP", "_CSETF-GRAPHL-SEARCH-ADD-TO-RESULT?", 2, 0, false);
	    declareFunction("_csetf_graphl_search_unwind_fn_toggle", "_CSETF-GRAPHL-SEARCH-UNWIND-FN-TOGGLE", 2, 0, false);
	    declareFunction("_csetf_graphl_search_result", "_CSETF-GRAPHL-SEARCH-RESULT", 2, 0, false);
	    declareFunction("_csetf_graphl_search_graph", "_CSETF-GRAPHL-SEARCH-GRAPH", 2, 0, false);
	    declareFunction("make_graphl_search", "MAKE-GRAPHL-SEARCH", 0, 1, false);
	    declareFunction("visit_defstruct_graphl_search", "VISIT-DEFSTRUCT-GRAPHL-SEARCH", 2, 0, false);
	    declareFunction("visit_defstruct_object_graphl_search_method", "VISIT-DEFSTRUCT-OBJECT-GRAPHL-SEARCH-METHOD", 2, 0, false);
	    declareFunction("print_graphl_search", "PRINT-GRAPHL-SEARCH", 3, 0, false);
	    declareFunction("describe_graphl_search", "DESCRIBE-GRAPHL-SEARCH", 1, 0, false);
	    declareFunction("new_graphl_search", "NEW-GRAPHL-SEARCH", 1, 0, false);
	    declareFunction("destroy_graphl_search", "DESTROY-GRAPHL-SEARCH", 1, 0, false);
	    declareFunction("graphl_type", "GRAPHL-TYPE", 1, 0, false);
	    declareFunction("graphl_order", "GRAPHL-ORDER", 1, 0, false);
	    declareFunction("graphl_marking", "GRAPHL-MARKING", 1, 0, false);
	    declareFunction("graphl_space", "GRAPHL-SPACE", 1, 0, false);
	    declareFunction("graphl_goal", "GRAPHL-GOAL", 1, 0, false);
	    declareFunction("graphl_goal_space", "GRAPHL-GOAL-SPACE", 1, 0, false);
	    declareFunction("graphl_goal_found_p", "GRAPHL-GOAL-FOUND-P", 1, 0, false);
	    declareFunction("graphl_map_fn", "GRAPHL-MAP-FN", 1, 0, false);
	    declareFunction("graphl_compute_justifyP", "GRAPHL-COMPUTE-JUSTIFY?", 1, 0, false);
	    declareFunction("graphl_cutoff", "GRAPHL-CUTOFF", 1, 0, false);
	    declareFunction("graphl_add_to_resultP", "GRAPHL-ADD-TO-RESULT?", 1, 0, false);
	    declareFunction("graphl_result", "GRAPHL-RESULT", 1, 0, false);
	    declareFunction("graphl_depth_first_search_p", "GRAPHL-DEPTH-FIRST-SEARCH-P", 1, 0, false);
	    declareFunction("graphl_breadth_first_search_p", "GRAPHL-BREADTH-FIRST-SEARCH-P", 1, 0, false);
	    declareFunction("graphl_iterative_deepening_search_p", "GRAPHL-ITERATIVE-DEEPENING-SEARCH-P", 1, 0, false);
	    declareFunction("graphl_depth_marking_search_p", "GRAPHL-DEPTH-MARKING-SEARCH-P", 1, 0, false);
	    declareFunction("graphl_return_one_answer_p", "GRAPHL-RETURN-ONE-ANSWER-P", 1, 0, false);
	    declareFunction("graphl_add_nodes_on_wind_p", "GRAPHL-ADD-NODES-ON-WIND-P", 1, 0, false);
	    declareFunction("graphl_add_edges_on_unwind_p", "GRAPHL-ADD-EDGES-ON-UNWIND-P", 1, 0, false);
	    declareFunction("graphl_goal_search_p", "GRAPHL-GOAL-SEARCH-P", 1, 0, false);
	    declareFunction("graphl_single_goal_p", "GRAPHL-SINGLE-GOAL-P", 1, 0, false);
	    declareFunction("graphl_multiple_goals_p", "GRAPHL-MULTIPLE-GOALS-P", 1, 0, false);
	    declareFunction("graphl_goal_fn_p", "GRAPHL-GOAL-FN-P", 1, 0, false);
	    declareFunction("graphl_map_p", "GRAPHL-MAP-P", 1, 0, false);
	    declareFunction("graphl_depth_cutoff", "GRAPHL-DEPTH-CUTOFF", 1, 0, false);
	    declareFunction("graphl_cutoff_search_p", "GRAPHL-CUTOFF-SEARCH-P", 1, 0, false);
	    declareFunction("valid_graphl_search_order_p", "VALID-GRAPHL-SEARCH-ORDER-P", 1, 0, false);
	    declareFunction("valid_graphl_cutoff_p", "VALID-GRAPHL-CUTOFF-P", 1, 0, false);
	    declareFunction("valid_graphl_marking_style_p", "VALID-GRAPHL-MARKING-STYLE-P", 1, 0, false);
	    declareFunction("graphl_table_p", "GRAPHL-TABLE-P", 1, 0, false);
	    declareMacro("with_graphl_search_initialized", "WITH-GRAPHL-SEARCH-INITIALIZED");
	    declareFunction("set_graphl_search_properties", "SET-GRAPHL-SEARCH-PROPERTIES", 2, 0, false);
	    declareFunction("set_graphl_search_property", "SET-GRAPHL-SEARCH-PROPERTY", 3, 0, false);
	    declareFunction("set_graphl_search_type", "SET-GRAPHL-SEARCH-TYPE", 2, 0, false);
	    declareFunction("set_graphl_search_order", "SET-GRAPHL-SEARCH-ORDER", 2, 0, false);
	    declareFunction("set_graphl_search_cutoff", "SET-GRAPHL-SEARCH-CUTOFF", 2, 0, false);
	    declareFunction("set_graphl_search_marking", "SET-GRAPHL-SEARCH-MARKING", 2, 0, false);
	    declareFunction("set_graphl_search_marking_space", "SET-GRAPHL-SEARCH-MARKING-SPACE", 2, 0, false);
	    declareFunction("set_graphl_search_goal", "SET-GRAPHL-SEARCH-GOAL", 2, 0, false);
	    declareFunction("set_graphl_search_goal_fn", "SET-GRAPHL-SEARCH-GOAL-FN", 2, 0, false);
	    declareFunction("set_graphl_search_goal_found_p", "SET-GRAPHL-SEARCH-GOAL-FOUND-P", 2, 0, false);
	    declareFunction("set_graphl_search_goal_space", "SET-GRAPHL-SEARCH-GOAL-SPACE", 2, 0, false);
	    declareFunction("set_graphl_search_satisfy_fn", "SET-GRAPHL-SEARCH-SATISFY-FN", 2, 0, false);
	    declareFunction("set_graphl_search_map_fn", "SET-GRAPHL-SEARCH-MAP-FN", 2, 0, false);
	    declareFunction("set_graphl_search_justifyP", "SET-GRAPHL-SEARCH-JUSTIFY?", 2, 0, false);
	    declareFunction("set_graphl_search_result", "SET-GRAPHL-SEARCH-RESULT", 2, 0, false);
	    declareFunction("set_graphl_search_add_to_resultP", "SET-GRAPHL-SEARCH-ADD-TO-RESULT?", 2, 0, false);
	    declareFunction("possibly_initialize_graphl_marking_spaces", "POSSIBLY-INITIALIZE-GRAPHL-MARKING-SPACES", 1, 0, false);
	    declareFunction("reinitialize_graphl_spaces", "REINITIALIZE-GRAPHL-SPACES", 1, 0, false);
	    declareFunction("graphl_add_node_to_result", "GRAPHL-ADD-NODE-TO-RESULT", 2, 0, false);
	    declareFunction("graphl_add_to_result", "GRAPHL-ADD-TO-RESULT", 2, 1, false);
	    declareFunction("graphl_append_to_result", "GRAPHL-APPEND-TO-RESULT", 2, 0, false);
	    declareFunction("graphl_toggle_unwind_off", "GRAPHL-TOGGLE-UNWIND-OFF", 1, 0, false);
	    declareFunction("graphl_toggle_unwind_on", "GRAPHL-TOGGLE-UNWIND-ON", 1, 0, false);
	    declareFunction("graphl_node_provides_answer_p", "GRAPHL-NODE-PROVIDES-ANSWER-P", 2, 0, false);
	    declareFunction("graphl_search_size", "GRAPHL-SEARCH-SIZE", 0, 0, false);
	    declareFunction("graphl_instantiate_new_space", "GRAPHL-INSTANTIATE-NEW-SPACE", 0, 0, false);
	    declareFunction("graphl_goal_found_condition_p", "GRAPHL-GOAL-FOUND-CONDITION-P", 1, 0, false);
	}
	if (SubLFiles.USE_V2) {
	    declareFunction("graphl_search_direction", "GRAPHL-SEARCH-DIRECTION", 1, 0, false);
	    declareFunction("_csetf_graphl_search_direction", "_CSETF-GRAPHL-SEARCH-DIRECTION", 2, 0, false);
	    declareFunction("graphl_direction", "GRAPHL-DIRECTION", 1, 0, false);
	    declareFunction("valid_graphl_search_direction_p", "VALID-GRAPHL-SEARCH-DIRECTION-P", 1, 0, false);
	    declareFunction("set_graphl_search_direction", "SET-GRAPHL-SEARCH-DIRECTION", 2, 0, false);
	    declareFunction("graphl_forward_direction", "GRAPHL-FORWARD-DIRECTION", 0, 0, false);
	    declareFunction("graphl_backward_direction", "GRAPHL-BACKWARD-DIRECTION", 0, 0, false);
	    declareFunction("graphl_forward_direction_p", "GRAPHL-FORWARD-DIRECTION-P", 1, 0, false);
	    declareFunction("determine_graphl_relevant_directions", "DETERMINE-GRAPHL-RELEVANT-DIRECTIONS", 1, 0, false);
	    declareMacro("do_graphl_relevant_directions", "DO-GRAPHL-RELEVANT-DIRECTIONS");
	    declareFunction("graphl_opposite_direction", "GRAPHL-OPPOSITE-DIRECTION", 1, 0, false);
	}
	return NIL;
    }

    public static final SubLObject declare_graphl_search_vars_file_alt() {
	declareFunction("graphl_search_print_function_trampoline", "GRAPHL-SEARCH-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
	declareFunction("graphl_search_p", "GRAPHL-SEARCH-P", 1, 0, false);
	new com.cyc.cycjava.cycl.graphl_search_vars.$graphl_search_p$UnaryFunction();
	declareFunction("graphl_search_direction", "GRAPHL-SEARCH-DIRECTION", 1, 0, false);
	declareFunction("graphl_search_type", "GRAPHL-SEARCH-TYPE", 1, 0, false);
	declareFunction("graphl_search_order", "GRAPHL-SEARCH-ORDER", 1, 0, false);
	declareFunction("graphl_search_cutoff", "GRAPHL-SEARCH-CUTOFF", 1, 0, false);
	declareFunction("graphl_search_marking", "GRAPHL-SEARCH-MARKING", 1, 0, false);
	declareFunction("graphl_search_marking_space", "GRAPHL-SEARCH-MARKING-SPACE", 1, 0, false);
	declareFunction("graphl_search_goal_space", "GRAPHL-SEARCH-GOAL-SPACE", 1, 0, false);
	declareFunction("graphl_search_goal", "GRAPHL-SEARCH-GOAL", 1, 0, false);
	declareFunction("graphl_search_goal_fn", "GRAPHL-SEARCH-GOAL-FN", 1, 0, false);
	declareFunction("graphl_search_goal_found_p", "GRAPHL-SEARCH-GOAL-FOUND-P", 1, 0, false);
	declareFunction("graphl_search_satisfy_fn", "GRAPHL-SEARCH-SATISFY-FN", 1, 0, false);
	declareFunction("graphl_search_map_fn", "GRAPHL-SEARCH-MAP-FN", 1, 0, false);
	declareFunction("graphl_search_justifyP", "GRAPHL-SEARCH-JUSTIFY?", 1, 0, false);
	declareFunction("graphl_search_add_to_resultP", "GRAPHL-SEARCH-ADD-TO-RESULT?", 1, 0, false);
	declareFunction("graphl_search_unwind_fn_toggle", "GRAPHL-SEARCH-UNWIND-FN-TOGGLE", 1, 0, false);
	declareFunction("graphl_search_result", "GRAPHL-SEARCH-RESULT", 1, 0, false);
	declareFunction("graphl_search_graph", "GRAPHL-SEARCH-GRAPH", 1, 0, false);
	declareFunction("_csetf_graphl_search_direction", "_CSETF-GRAPHL-SEARCH-DIRECTION", 2, 0, false);
	declareFunction("_csetf_graphl_search_type", "_CSETF-GRAPHL-SEARCH-TYPE", 2, 0, false);
	declareFunction("_csetf_graphl_search_order", "_CSETF-GRAPHL-SEARCH-ORDER", 2, 0, false);
	declareFunction("_csetf_graphl_search_cutoff", "_CSETF-GRAPHL-SEARCH-CUTOFF", 2, 0, false);
	declareFunction("_csetf_graphl_search_marking", "_CSETF-GRAPHL-SEARCH-MARKING", 2, 0, false);
	declareFunction("_csetf_graphl_search_marking_space", "_CSETF-GRAPHL-SEARCH-MARKING-SPACE", 2, 0, false);
	declareFunction("_csetf_graphl_search_goal_space", "_CSETF-GRAPHL-SEARCH-GOAL-SPACE", 2, 0, false);
	declareFunction("_csetf_graphl_search_goal", "_CSETF-GRAPHL-SEARCH-GOAL", 2, 0, false);
	declareFunction("_csetf_graphl_search_goal_fn", "_CSETF-GRAPHL-SEARCH-GOAL-FN", 2, 0, false);
	declareFunction("_csetf_graphl_search_goal_found_p", "_CSETF-GRAPHL-SEARCH-GOAL-FOUND-P", 2, 0, false);
	declareFunction("_csetf_graphl_search_satisfy_fn", "_CSETF-GRAPHL-SEARCH-SATISFY-FN", 2, 0, false);
	declareFunction("_csetf_graphl_search_map_fn", "_CSETF-GRAPHL-SEARCH-MAP-FN", 2, 0, false);
	declareFunction("_csetf_graphl_search_justifyP", "_CSETF-GRAPHL-SEARCH-JUSTIFY?", 2, 0, false);
	declareFunction("_csetf_graphl_search_add_to_resultP", "_CSETF-GRAPHL-SEARCH-ADD-TO-RESULT?", 2, 0, false);
	declareFunction("_csetf_graphl_search_unwind_fn_toggle", "_CSETF-GRAPHL-SEARCH-UNWIND-FN-TOGGLE", 2, 0, false);
	declareFunction("_csetf_graphl_search_result", "_CSETF-GRAPHL-SEARCH-RESULT", 2, 0, false);
	declareFunction("_csetf_graphl_search_graph", "_CSETF-GRAPHL-SEARCH-GRAPH", 2, 0, false);
	declareFunction("make_graphl_search", "MAKE-GRAPHL-SEARCH", 0, 1, false);
	declareFunction("print_graphl_search", "PRINT-GRAPHL-SEARCH", 3, 0, false);
	declareFunction("describe_graphl_search", "DESCRIBE-GRAPHL-SEARCH", 1, 0, false);
	declareFunction("new_graphl_search", "NEW-GRAPHL-SEARCH", 1, 0, false);
	declareFunction("destroy_graphl_search", "DESTROY-GRAPHL-SEARCH", 1, 0, false);
	declareFunction("graphl_type", "GRAPHL-TYPE", 1, 0, false);
	declareFunction("graphl_direction", "GRAPHL-DIRECTION", 1, 0, false);
	declareFunction("graphl_order", "GRAPHL-ORDER", 1, 0, false);
	declareFunction("graphl_marking", "GRAPHL-MARKING", 1, 0, false);
	declareFunction("graphl_space", "GRAPHL-SPACE", 1, 0, false);
	declareFunction("graphl_goal", "GRAPHL-GOAL", 1, 0, false);
	declareFunction("graphl_goal_space", "GRAPHL-GOAL-SPACE", 1, 0, false);
	declareFunction("graphl_goal_found_p", "GRAPHL-GOAL-FOUND-P", 1, 0, false);
	declareFunction("graphl_map_fn", "GRAPHL-MAP-FN", 1, 0, false);
	declareFunction("graphl_compute_justifyP", "GRAPHL-COMPUTE-JUSTIFY?", 1, 0, false);
	declareFunction("graphl_cutoff", "GRAPHL-CUTOFF", 1, 0, false);
	declareFunction("graphl_add_to_resultP", "GRAPHL-ADD-TO-RESULT?", 1, 0, false);
	declareFunction("graphl_result", "GRAPHL-RESULT", 1, 0, false);
	declareFunction("graphl_depth_first_search_p", "GRAPHL-DEPTH-FIRST-SEARCH-P", 1, 0, false);
	declareFunction("graphl_breadth_first_search_p", "GRAPHL-BREADTH-FIRST-SEARCH-P", 1, 0, false);
	declareFunction("graphl_iterative_deepening_search_p", "GRAPHL-ITERATIVE-DEEPENING-SEARCH-P", 1, 0, false);
	declareFunction("graphl_depth_marking_search_p", "GRAPHL-DEPTH-MARKING-SEARCH-P", 1, 0, false);
	declareFunction("graphl_return_one_answer_p", "GRAPHL-RETURN-ONE-ANSWER-P", 1, 0, false);
	declareFunction("graphl_add_nodes_on_wind_p", "GRAPHL-ADD-NODES-ON-WIND-P", 1, 0, false);
	declareFunction("graphl_add_edges_on_unwind_p", "GRAPHL-ADD-EDGES-ON-UNWIND-P", 1, 0, false);
	declareFunction("graphl_goal_search_p", "GRAPHL-GOAL-SEARCH-P", 1, 0, false);
	declareFunction("graphl_single_goal_p", "GRAPHL-SINGLE-GOAL-P", 1, 0, false);
	declareFunction("graphl_multiple_goals_p", "GRAPHL-MULTIPLE-GOALS-P", 1, 0, false);
	declareFunction("graphl_goal_fn_p", "GRAPHL-GOAL-FN-P", 1, 0, false);
	declareFunction("graphl_map_p", "GRAPHL-MAP-P", 1, 0, false);
	declareFunction("graphl_depth_cutoff", "GRAPHL-DEPTH-CUTOFF", 1, 0, false);
	declareFunction("graphl_cutoff_search_p", "GRAPHL-CUTOFF-SEARCH-P", 1, 0, false);
	declareFunction("valid_graphl_search_order_p", "VALID-GRAPHL-SEARCH-ORDER-P", 1, 0, false);
	declareFunction("valid_graphl_cutoff_p", "VALID-GRAPHL-CUTOFF-P", 1, 0, false);
	declareFunction("valid_graphl_marking_style_p", "VALID-GRAPHL-MARKING-STYLE-P", 1, 0, false);
	declareFunction("valid_graphl_search_direction_p", "VALID-GRAPHL-SEARCH-DIRECTION-P", 1, 0, false);
	declareFunction("graphl_table_p", "GRAPHL-TABLE-P", 1, 0, false);
	declareMacro("with_graphl_search_initialized", "WITH-GRAPHL-SEARCH-INITIALIZED");
	declareFunction("set_graphl_search_properties", "SET-GRAPHL-SEARCH-PROPERTIES", 2, 0, false);
	declareFunction("set_graphl_search_property", "SET-GRAPHL-SEARCH-PROPERTY", 3, 0, false);
	declareFunction("set_graphl_search_type", "SET-GRAPHL-SEARCH-TYPE", 2, 0, false);
	declareFunction("set_graphl_search_direction", "SET-GRAPHL-SEARCH-DIRECTION", 2, 0, false);
	declareFunction("set_graphl_search_order", "SET-GRAPHL-SEARCH-ORDER", 2, 0, false);
	declareFunction("set_graphl_search_cutoff", "SET-GRAPHL-SEARCH-CUTOFF", 2, 0, false);
	declareFunction("set_graphl_search_marking", "SET-GRAPHL-SEARCH-MARKING", 2, 0, false);
	declareFunction("set_graphl_search_marking_space", "SET-GRAPHL-SEARCH-MARKING-SPACE", 2, 0, false);
	declareFunction("set_graphl_search_goal", "SET-GRAPHL-SEARCH-GOAL", 2, 0, false);
	declareFunction("set_graphl_search_goal_fn", "SET-GRAPHL-SEARCH-GOAL-FN", 2, 0, false);
	declareFunction("set_graphl_search_goal_found_p", "SET-GRAPHL-SEARCH-GOAL-FOUND-P", 2, 0, false);
	declareFunction("set_graphl_search_goal_space", "SET-GRAPHL-SEARCH-GOAL-SPACE", 2, 0, false);
	declareFunction("set_graphl_search_satisfy_fn", "SET-GRAPHL-SEARCH-SATISFY-FN", 2, 0, false);
	declareFunction("set_graphl_search_map_fn", "SET-GRAPHL-SEARCH-MAP-FN", 2, 0, false);
	declareFunction("set_graphl_search_justifyP", "SET-GRAPHL-SEARCH-JUSTIFY?", 2, 0, false);
	declareFunction("set_graphl_search_result", "SET-GRAPHL-SEARCH-RESULT", 2, 0, false);
	declareFunction("set_graphl_search_add_to_resultP", "SET-GRAPHL-SEARCH-ADD-TO-RESULT?", 2, 0, false);
	declareFunction("possibly_initialize_graphl_marking_spaces", "POSSIBLY-INITIALIZE-GRAPHL-MARKING-SPACES", 1, 0, false);
	declareFunction("reinitialize_graphl_spaces", "REINITIALIZE-GRAPHL-SPACES", 1, 0, false);
	declareFunction("graphl_add_node_to_result", "GRAPHL-ADD-NODE-TO-RESULT", 2, 0, false);
	declareFunction("graphl_add_to_result", "GRAPHL-ADD-TO-RESULT", 2, 1, false);
	declareFunction("graphl_append_to_result", "GRAPHL-APPEND-TO-RESULT", 2, 0, false);
	declareFunction("graphl_toggle_unwind_off", "GRAPHL-TOGGLE-UNWIND-OFF", 1, 0, false);
	declareFunction("graphl_toggle_unwind_on", "GRAPHL-TOGGLE-UNWIND-ON", 1, 0, false);
	declareFunction("graphl_node_provides_answer_p", "GRAPHL-NODE-PROVIDES-ANSWER-P", 2, 0, false);
	declareFunction("graphl_search_size", "GRAPHL-SEARCH-SIZE", 0, 0, false);
	declareFunction("graphl_instantiate_new_space", "GRAPHL-INSTANTIATE-NEW-SPACE", 0, 0, false);
	declareFunction("graphl_forward_direction", "GRAPHL-FORWARD-DIRECTION", 0, 0, false);
	declareFunction("graphl_backward_direction", "GRAPHL-BACKWARD-DIRECTION", 0, 0, false);
	declareFunction("graphl_forward_direction_p", "GRAPHL-FORWARD-DIRECTION-P", 1, 0, false);
	declareFunction("determine_graphl_relevant_directions", "DETERMINE-GRAPHL-RELEVANT-DIRECTIONS", 1, 0, false);
	declareMacro("do_graphl_relevant_directions", "DO-GRAPHL-RELEVANT-DIRECTIONS");
	declareFunction("graphl_opposite_direction", "GRAPHL-OPPOSITE-DIRECTION", 1, 0, false);
	declareFunction("graphl_goal_found_condition_p", "GRAPHL-GOAL-FOUND-CONDITION-P", 1, 0, false);
	return NIL;
    }

    public static final SubLObject declare_graphl_search_vars_file_prev_alt() {
	declareFunction("graphl_search_print_function_trampoline", "GRAPHL-SEARCH-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
	declareFunction("graphl_search_p", "GRAPHL-SEARCH-P", 1, 0, false);
	new $graphl_search_p$UnaryFunction();
	declareFunction("graphl_search_direction", "GRAPHL-SEARCH-DIRECTION", 1, 0, false);
	declareFunction("graphl_search_type", "GRAPHL-SEARCH-TYPE", 1, 0, false);
	declareFunction("graphl_search_order", "GRAPHL-SEARCH-ORDER", 1, 0, false);
	declareFunction("graphl_search_cutoff", "GRAPHL-SEARCH-CUTOFF", 1, 0, false);
	declareFunction("graphl_search_marking", "GRAPHL-SEARCH-MARKING", 1, 0, false);
	declareFunction("graphl_search_marking_space", "GRAPHL-SEARCH-MARKING-SPACE", 1, 0, false);
	declareFunction("graphl_search_goal_space", "GRAPHL-SEARCH-GOAL-SPACE", 1, 0, false);
	declareFunction("graphl_search_goal", "GRAPHL-SEARCH-GOAL", 1, 0, false);
	declareFunction("graphl_search_goal_fn", "GRAPHL-SEARCH-GOAL-FN", 1, 0, false);
	declareFunction("graphl_search_goal_found_p", "GRAPHL-SEARCH-GOAL-FOUND-P", 1, 0, false);
	declareFunction("graphl_search_satisfy_fn", "GRAPHL-SEARCH-SATISFY-FN", 1, 0, false);
	declareFunction("graphl_search_map_fn", "GRAPHL-SEARCH-MAP-FN", 1, 0, false);
	declareFunction("graphl_search_justifyP", "GRAPHL-SEARCH-JUSTIFY?", 1, 0, false);
	declareFunction("graphl_search_add_to_resultP", "GRAPHL-SEARCH-ADD-TO-RESULT?", 1, 0, false);
	declareFunction("graphl_search_unwind_fn_toggle", "GRAPHL-SEARCH-UNWIND-FN-TOGGLE", 1, 0, false);
	declareFunction("graphl_search_result", "GRAPHL-SEARCH-RESULT", 1, 0, false);
	declareFunction("graphl_search_graph", "GRAPHL-SEARCH-GRAPH", 1, 0, false);
	declareFunction("_csetf_graphl_search_direction", "_CSETF-GRAPHL-SEARCH-DIRECTION", 2, 0, false);
	declareFunction("_csetf_graphl_search_type", "_CSETF-GRAPHL-SEARCH-TYPE", 2, 0, false);
	declareFunction("_csetf_graphl_search_order", "_CSETF-GRAPHL-SEARCH-ORDER", 2, 0, false);
	declareFunction("_csetf_graphl_search_cutoff", "_CSETF-GRAPHL-SEARCH-CUTOFF", 2, 0, false);
	declareFunction("_csetf_graphl_search_marking", "_CSETF-GRAPHL-SEARCH-MARKING", 2, 0, false);
	declareFunction("_csetf_graphl_search_marking_space", "_CSETF-GRAPHL-SEARCH-MARKING-SPACE", 2, 0, false);
	declareFunction("_csetf_graphl_search_goal_space", "_CSETF-GRAPHL-SEARCH-GOAL-SPACE", 2, 0, false);
	declareFunction("_csetf_graphl_search_goal", "_CSETF-GRAPHL-SEARCH-GOAL", 2, 0, false);
	declareFunction("_csetf_graphl_search_goal_fn", "_CSETF-GRAPHL-SEARCH-GOAL-FN", 2, 0, false);
	declareFunction("_csetf_graphl_search_goal_found_p", "_CSETF-GRAPHL-SEARCH-GOAL-FOUND-P", 2, 0, false);
	declareFunction("_csetf_graphl_search_satisfy_fn", "_CSETF-GRAPHL-SEARCH-SATISFY-FN", 2, 0, false);
	declareFunction("_csetf_graphl_search_map_fn", "_CSETF-GRAPHL-SEARCH-MAP-FN", 2, 0, false);
	declareFunction("_csetf_graphl_search_justifyP", "_CSETF-GRAPHL-SEARCH-JUSTIFY?", 2, 0, false);
	declareFunction("_csetf_graphl_search_add_to_resultP", "_CSETF-GRAPHL-SEARCH-ADD-TO-RESULT?", 2, 0, false);
	declareFunction("_csetf_graphl_search_unwind_fn_toggle", "_CSETF-GRAPHL-SEARCH-UNWIND-FN-TOGGLE", 2, 0, false);
	declareFunction("_csetf_graphl_search_result", "_CSETF-GRAPHL-SEARCH-RESULT", 2, 0, false);
	declareFunction("_csetf_graphl_search_graph", "_CSETF-GRAPHL-SEARCH-GRAPH", 2, 0, false);
	declareFunction("make_graphl_search", "MAKE-GRAPHL-SEARCH", 0, 1, false);
	declareFunction("print_graphl_search", "PRINT-GRAPHL-SEARCH", 3, 0, false);
	declareFunction("describe_graphl_search", "DESCRIBE-GRAPHL-SEARCH", 1, 0, false);
	declareFunction("new_graphl_search", "NEW-GRAPHL-SEARCH", 1, 0, false);
	declareFunction("destroy_graphl_search", "DESTROY-GRAPHL-SEARCH", 1, 0, false);
	declareFunction("graphl_type", "GRAPHL-TYPE", 1, 0, false);
	declareFunction("graphl_direction", "GRAPHL-DIRECTION", 1, 0, false);
	declareFunction("graphl_order", "GRAPHL-ORDER", 1, 0, false);
	declareFunction("graphl_marking", "GRAPHL-MARKING", 1, 0, false);
	declareFunction("graphl_space", "GRAPHL-SPACE", 1, 0, false);
	declareFunction("graphl_goal", "GRAPHL-GOAL", 1, 0, false);
	declareFunction("graphl_goal_space", "GRAPHL-GOAL-SPACE", 1, 0, false);
	declareFunction("graphl_goal_found_p", "GRAPHL-GOAL-FOUND-P", 1, 0, false);
	declareFunction("graphl_map_fn", "GRAPHL-MAP-FN", 1, 0, false);
	declareFunction("graphl_compute_justifyP", "GRAPHL-COMPUTE-JUSTIFY?", 1, 0, false);
	declareFunction("graphl_cutoff", "GRAPHL-CUTOFF", 1, 0, false);
	declareFunction("graphl_add_to_resultP", "GRAPHL-ADD-TO-RESULT?", 1, 0, false);
	declareFunction("graphl_result", "GRAPHL-RESULT", 1, 0, false);
	declareFunction("graphl_depth_first_search_p", "GRAPHL-DEPTH-FIRST-SEARCH-P", 1, 0, false);
	declareFunction("graphl_breadth_first_search_p", "GRAPHL-BREADTH-FIRST-SEARCH-P", 1, 0, false);
	declareFunction("graphl_iterative_deepening_search_p", "GRAPHL-ITERATIVE-DEEPENING-SEARCH-P", 1, 0, false);
	declareFunction("graphl_depth_marking_search_p", "GRAPHL-DEPTH-MARKING-SEARCH-P", 1, 0, false);
	declareFunction("graphl_return_one_answer_p", "GRAPHL-RETURN-ONE-ANSWER-P", 1, 0, false);
	declareFunction("graphl_add_nodes_on_wind_p", "GRAPHL-ADD-NODES-ON-WIND-P", 1, 0, false);
	declareFunction("graphl_add_edges_on_unwind_p", "GRAPHL-ADD-EDGES-ON-UNWIND-P", 1, 0, false);
	declareFunction("graphl_goal_search_p", "GRAPHL-GOAL-SEARCH-P", 1, 0, false);
	declareFunction("graphl_single_goal_p", "GRAPHL-SINGLE-GOAL-P", 1, 0, false);
	declareFunction("graphl_multiple_goals_p", "GRAPHL-MULTIPLE-GOALS-P", 1, 0, false);
	declareFunction("graphl_goal_fn_p", "GRAPHL-GOAL-FN-P", 1, 0, false);
	declareFunction("graphl_map_p", "GRAPHL-MAP-P", 1, 0, false);
	declareFunction("graphl_depth_cutoff", "GRAPHL-DEPTH-CUTOFF", 1, 0, false);
	declareFunction("graphl_cutoff_search_p", "GRAPHL-CUTOFF-SEARCH-P", 1, 0, false);
	declareFunction("valid_graphl_search_order_p", "VALID-GRAPHL-SEARCH-ORDER-P", 1, 0, false);
	declareFunction("valid_graphl_cutoff_p", "VALID-GRAPHL-CUTOFF-P", 1, 0, false);
	declareFunction("valid_graphl_marking_style_p", "VALID-GRAPHL-MARKING-STYLE-P", 1, 0, false);
	declareFunction("valid_graphl_search_direction_p", "VALID-GRAPHL-SEARCH-DIRECTION-P", 1, 0, false);
	declareFunction("graphl_table_p", "GRAPHL-TABLE-P", 1, 0, false);
	declareMacro("with_graphl_search_initialized", "WITH-GRAPHL-SEARCH-INITIALIZED");
	declareFunction("set_graphl_search_properties", "SET-GRAPHL-SEARCH-PROPERTIES", 2, 0, false);
	declareFunction("set_graphl_search_property", "SET-GRAPHL-SEARCH-PROPERTY", 3, 0, false);
	declareFunction("set_graphl_search_type", "SET-GRAPHL-SEARCH-TYPE", 2, 0, false);
	declareFunction("set_graphl_search_direction", "SET-GRAPHL-SEARCH-DIRECTION", 2, 0, false);
	declareFunction("set_graphl_search_order", "SET-GRAPHL-SEARCH-ORDER", 2, 0, false);
	declareFunction("set_graphl_search_cutoff", "SET-GRAPHL-SEARCH-CUTOFF", 2, 0, false);
	declareFunction("set_graphl_search_marking", "SET-GRAPHL-SEARCH-MARKING", 2, 0, false);
	declareFunction("set_graphl_search_marking_space", "SET-GRAPHL-SEARCH-MARKING-SPACE", 2, 0, false);
	declareFunction("set_graphl_search_goal", "SET-GRAPHL-SEARCH-GOAL", 2, 0, false);
	declareFunction("set_graphl_search_goal_fn", "SET-GRAPHL-SEARCH-GOAL-FN", 2, 0, false);
	declareFunction("set_graphl_search_goal_found_p", "SET-GRAPHL-SEARCH-GOAL-FOUND-P", 2, 0, false);
	declareFunction("set_graphl_search_goal_space", "SET-GRAPHL-SEARCH-GOAL-SPACE", 2, 0, false);
	declareFunction("set_graphl_search_satisfy_fn", "SET-GRAPHL-SEARCH-SATISFY-FN", 2, 0, false);
	declareFunction("set_graphl_search_map_fn", "SET-GRAPHL-SEARCH-MAP-FN", 2, 0, false);
	declareFunction("set_graphl_search_justifyP", "SET-GRAPHL-SEARCH-JUSTIFY?", 2, 0, false);
	declareFunction("set_graphl_search_result", "SET-GRAPHL-SEARCH-RESULT", 2, 0, false);
	declareFunction("set_graphl_search_add_to_resultP", "SET-GRAPHL-SEARCH-ADD-TO-RESULT?", 2, 0, false);
	declareFunction("possibly_initialize_graphl_marking_spaces", "POSSIBLY-INITIALIZE-GRAPHL-MARKING-SPACES", 1, 0, false);
	declareFunction("reinitialize_graphl_spaces", "REINITIALIZE-GRAPHL-SPACES", 1, 0, false);
	declareFunction("graphl_add_node_to_result", "GRAPHL-ADD-NODE-TO-RESULT", 2, 0, false);
	declareFunction("graphl_add_to_result", "GRAPHL-ADD-TO-RESULT", 2, 1, false);
	declareFunction("graphl_append_to_result", "GRAPHL-APPEND-TO-RESULT", 2, 0, false);
	declareFunction("graphl_toggle_unwind_off", "GRAPHL-TOGGLE-UNWIND-OFF", 1, 0, false);
	declareFunction("graphl_toggle_unwind_on", "GRAPHL-TOGGLE-UNWIND-ON", 1, 0, false);
	declareFunction("graphl_node_provides_answer_p", "GRAPHL-NODE-PROVIDES-ANSWER-P", 2, 0, false);
	declareFunction("graphl_search_size", "GRAPHL-SEARCH-SIZE", 0, 0, false);
	declareFunction("graphl_instantiate_new_space", "GRAPHL-INSTANTIATE-NEW-SPACE", 0, 0, false);
	declareFunction("graphl_forward_direction", "GRAPHL-FORWARD-DIRECTION", 0, 0, false);
	declareFunction("graphl_backward_direction", "GRAPHL-BACKWARD-DIRECTION", 0, 0, false);
	declareFunction("graphl_forward_direction_p", "GRAPHL-FORWARD-DIRECTION-P", 1, 0, false);
	declareFunction("determine_graphl_relevant_directions", "DETERMINE-GRAPHL-RELEVANT-DIRECTIONS", 1, 0, false);
	declareMacro("do_graphl_relevant_directions", "DO-GRAPHL-RELEVANT-DIRECTIONS");
	declareFunction("graphl_opposite_direction", "GRAPHL-OPPOSITE-DIRECTION", 1, 0, false);
	declareFunction("graphl_goal_found_condition_p", "GRAPHL-GOAL-FOUND-CONDITION-P", 1, 0, false);
	return NIL;
    }

    public static SubLObject declare_graphl_search_vars_file_Previous() {
	declareFunction("graphl_search_print_function_trampoline", "GRAPHL-SEARCH-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
	declareFunction("graphl_search_p", "GRAPHL-SEARCH-P", 1, 0, false);
	new graphl_search_vars.$graphl_search_p$UnaryFunction();
	declareFunction("graphl_search_type", "GRAPHL-SEARCH-TYPE", 1, 0, false);
	declareFunction("graphl_search_order", "GRAPHL-SEARCH-ORDER", 1, 0, false);
	declareFunction("graphl_search_cutoff", "GRAPHL-SEARCH-CUTOFF", 1, 0, false);
	declareFunction("graphl_search_marking", "GRAPHL-SEARCH-MARKING", 1, 0, false);
	declareFunction("graphl_search_marking_space", "GRAPHL-SEARCH-MARKING-SPACE", 1, 0, false);
	declareFunction("graphl_search_goal_space", "GRAPHL-SEARCH-GOAL-SPACE", 1, 0, false);
	declareFunction("graphl_search_goal", "GRAPHL-SEARCH-GOAL", 1, 0, false);
	declareFunction("graphl_search_goal_fn", "GRAPHL-SEARCH-GOAL-FN", 1, 0, false);
	declareFunction("graphl_search_goal_found_p", "GRAPHL-SEARCH-GOAL-FOUND-P", 1, 0, false);
	declareFunction("graphl_search_satisfy_fn", "GRAPHL-SEARCH-SATISFY-FN", 1, 0, false);
	declareFunction("graphl_search_map_fn", "GRAPHL-SEARCH-MAP-FN", 1, 0, false);
	declareFunction("graphl_search_justifyP", "GRAPHL-SEARCH-JUSTIFY?", 1, 0, false);
	declareFunction("graphl_search_add_to_resultP", "GRAPHL-SEARCH-ADD-TO-RESULT?", 1, 0, false);
	declareFunction("graphl_search_unwind_fn_toggle", "GRAPHL-SEARCH-UNWIND-FN-TOGGLE", 1, 0, false);
	declareFunction("graphl_search_result", "GRAPHL-SEARCH-RESULT", 1, 0, false);
	declareFunction("graphl_search_graph", "GRAPHL-SEARCH-GRAPH", 1, 0, false);
	declareFunction("_csetf_graphl_search_type", "_CSETF-GRAPHL-SEARCH-TYPE", 2, 0, false);
	declareFunction("_csetf_graphl_search_order", "_CSETF-GRAPHL-SEARCH-ORDER", 2, 0, false);
	declareFunction("_csetf_graphl_search_cutoff", "_CSETF-GRAPHL-SEARCH-CUTOFF", 2, 0, false);
	declareFunction("_csetf_graphl_search_marking", "_CSETF-GRAPHL-SEARCH-MARKING", 2, 0, false);
	declareFunction("_csetf_graphl_search_marking_space", "_CSETF-GRAPHL-SEARCH-MARKING-SPACE", 2, 0, false);
	declareFunction("_csetf_graphl_search_goal_space", "_CSETF-GRAPHL-SEARCH-GOAL-SPACE", 2, 0, false);
	declareFunction("_csetf_graphl_search_goal", "_CSETF-GRAPHL-SEARCH-GOAL", 2, 0, false);
	declareFunction("_csetf_graphl_search_goal_fn", "_CSETF-GRAPHL-SEARCH-GOAL-FN", 2, 0, false);
	declareFunction("_csetf_graphl_search_goal_found_p", "_CSETF-GRAPHL-SEARCH-GOAL-FOUND-P", 2, 0, false);
	declareFunction("_csetf_graphl_search_satisfy_fn", "_CSETF-GRAPHL-SEARCH-SATISFY-FN", 2, 0, false);
	declareFunction("_csetf_graphl_search_map_fn", "_CSETF-GRAPHL-SEARCH-MAP-FN", 2, 0, false);
	declareFunction("_csetf_graphl_search_justifyP", "_CSETF-GRAPHL-SEARCH-JUSTIFY?", 2, 0, false);
	declareFunction("_csetf_graphl_search_add_to_resultP", "_CSETF-GRAPHL-SEARCH-ADD-TO-RESULT?", 2, 0, false);
	declareFunction("_csetf_graphl_search_unwind_fn_toggle", "_CSETF-GRAPHL-SEARCH-UNWIND-FN-TOGGLE", 2, 0, false);
	declareFunction("_csetf_graphl_search_result", "_CSETF-GRAPHL-SEARCH-RESULT", 2, 0, false);
	declareFunction("_csetf_graphl_search_graph", "_CSETF-GRAPHL-SEARCH-GRAPH", 2, 0, false);
	declareFunction("make_graphl_search", "MAKE-GRAPHL-SEARCH", 0, 1, false);
	declareFunction("visit_defstruct_graphl_search", "VISIT-DEFSTRUCT-GRAPHL-SEARCH", 2, 0, false);
	declareFunction("visit_defstruct_object_graphl_search_method", "VISIT-DEFSTRUCT-OBJECT-GRAPHL-SEARCH-METHOD", 2, 0, false);
	declareFunction("print_graphl_search", "PRINT-GRAPHL-SEARCH", 3, 0, false);
	declareFunction("describe_graphl_search", "DESCRIBE-GRAPHL-SEARCH", 1, 0, false);
	declareFunction("new_graphl_search", "NEW-GRAPHL-SEARCH", 1, 0, false);
	declareFunction("destroy_graphl_search", "DESTROY-GRAPHL-SEARCH", 1, 0, false);
	declareFunction("graphl_type", "GRAPHL-TYPE", 1, 0, false);
	declareFunction("graphl_order", "GRAPHL-ORDER", 1, 0, false);
	declareFunction("graphl_marking", "GRAPHL-MARKING", 1, 0, false);
	declareFunction("graphl_space", "GRAPHL-SPACE", 1, 0, false);
	declareFunction("graphl_goal", "GRAPHL-GOAL", 1, 0, false);
	declareFunction("graphl_goal_space", "GRAPHL-GOAL-SPACE", 1, 0, false);
	declareFunction("graphl_goal_found_p", "GRAPHL-GOAL-FOUND-P", 1, 0, false);
	declareFunction("graphl_map_fn", "GRAPHL-MAP-FN", 1, 0, false);
	declareFunction("graphl_compute_justifyP", "GRAPHL-COMPUTE-JUSTIFY?", 1, 0, false);
	declareFunction("graphl_cutoff", "GRAPHL-CUTOFF", 1, 0, false);
	declareFunction("graphl_add_to_resultP", "GRAPHL-ADD-TO-RESULT?", 1, 0, false);
	declareFunction("graphl_result", "GRAPHL-RESULT", 1, 0, false);
	declareFunction("graphl_depth_first_search_p", "GRAPHL-DEPTH-FIRST-SEARCH-P", 1, 0, false);
	declareFunction("graphl_breadth_first_search_p", "GRAPHL-BREADTH-FIRST-SEARCH-P", 1, 0, false);
	declareFunction("graphl_iterative_deepening_search_p", "GRAPHL-ITERATIVE-DEEPENING-SEARCH-P", 1, 0, false);
	declareFunction("graphl_depth_marking_search_p", "GRAPHL-DEPTH-MARKING-SEARCH-P", 1, 0, false);
	declareFunction("graphl_return_one_answer_p", "GRAPHL-RETURN-ONE-ANSWER-P", 1, 0, false);
	declareFunction("graphl_add_nodes_on_wind_p", "GRAPHL-ADD-NODES-ON-WIND-P", 1, 0, false);
	declareFunction("graphl_add_edges_on_unwind_p", "GRAPHL-ADD-EDGES-ON-UNWIND-P", 1, 0, false);
	declareFunction("graphl_goal_search_p", "GRAPHL-GOAL-SEARCH-P", 1, 0, false);
	declareFunction("graphl_single_goal_p", "GRAPHL-SINGLE-GOAL-P", 1, 0, false);
	declareFunction("graphl_multiple_goals_p", "GRAPHL-MULTIPLE-GOALS-P", 1, 0, false);
	declareFunction("graphl_goal_fn_p", "GRAPHL-GOAL-FN-P", 1, 0, false);
	declareFunction("graphl_map_p", "GRAPHL-MAP-P", 1, 0, false);
	declareFunction("graphl_depth_cutoff", "GRAPHL-DEPTH-CUTOFF", 1, 0, false);
	declareFunction("graphl_cutoff_search_p", "GRAPHL-CUTOFF-SEARCH-P", 1, 0, false);
	declareFunction("valid_graphl_search_order_p", "VALID-GRAPHL-SEARCH-ORDER-P", 1, 0, false);
	declareFunction("valid_graphl_cutoff_p", "VALID-GRAPHL-CUTOFF-P", 1, 0, false);
	declareFunction("valid_graphl_marking_style_p", "VALID-GRAPHL-MARKING-STYLE-P", 1, 0, false);
	declareFunction("graphl_table_p", "GRAPHL-TABLE-P", 1, 0, false);
	declareMacro("with_graphl_search_initialized", "WITH-GRAPHL-SEARCH-INITIALIZED");
	declareFunction("set_graphl_search_properties", "SET-GRAPHL-SEARCH-PROPERTIES", 2, 0, false);
	declareFunction("set_graphl_search_property", "SET-GRAPHL-SEARCH-PROPERTY", 3, 0, false);
	declareFunction("set_graphl_search_type", "SET-GRAPHL-SEARCH-TYPE", 2, 0, false);
	declareFunction("set_graphl_search_order", "SET-GRAPHL-SEARCH-ORDER", 2, 0, false);
	declareFunction("set_graphl_search_cutoff", "SET-GRAPHL-SEARCH-CUTOFF", 2, 0, false);
	declareFunction("set_graphl_search_marking", "SET-GRAPHL-SEARCH-MARKING", 2, 0, false);
	declareFunction("set_graphl_search_marking_space", "SET-GRAPHL-SEARCH-MARKING-SPACE", 2, 0, false);
	declareFunction("set_graphl_search_goal", "SET-GRAPHL-SEARCH-GOAL", 2, 0, false);
	declareFunction("set_graphl_search_goal_fn", "SET-GRAPHL-SEARCH-GOAL-FN", 2, 0, false);
	declareFunction("set_graphl_search_goal_found_p", "SET-GRAPHL-SEARCH-GOAL-FOUND-P", 2, 0, false);
	declareFunction("set_graphl_search_goal_space", "SET-GRAPHL-SEARCH-GOAL-SPACE", 2, 0, false);
	declareFunction("set_graphl_search_satisfy_fn", "SET-GRAPHL-SEARCH-SATISFY-FN", 2, 0, false);
	declareFunction("set_graphl_search_map_fn", "SET-GRAPHL-SEARCH-MAP-FN", 2, 0, false);
	declareFunction("set_graphl_search_justifyP", "SET-GRAPHL-SEARCH-JUSTIFY?", 2, 0, false);
	declareFunction("set_graphl_search_result", "SET-GRAPHL-SEARCH-RESULT", 2, 0, false);
	declareFunction("set_graphl_search_add_to_resultP", "SET-GRAPHL-SEARCH-ADD-TO-RESULT?", 2, 0, false);
	declareFunction("possibly_initialize_graphl_marking_spaces", "POSSIBLY-INITIALIZE-GRAPHL-MARKING-SPACES", 1, 0, false);
	declareFunction("reinitialize_graphl_spaces", "REINITIALIZE-GRAPHL-SPACES", 1, 0, false);
	declareFunction("graphl_add_node_to_result", "GRAPHL-ADD-NODE-TO-RESULT", 2, 0, false);
	declareFunction("graphl_add_to_result", "GRAPHL-ADD-TO-RESULT", 2, 1, false);
	declareFunction("graphl_append_to_result", "GRAPHL-APPEND-TO-RESULT", 2, 0, false);
	declareFunction("graphl_toggle_unwind_off", "GRAPHL-TOGGLE-UNWIND-OFF", 1, 0, false);
	declareFunction("graphl_toggle_unwind_on", "GRAPHL-TOGGLE-UNWIND-ON", 1, 0, false);
	declareFunction("graphl_node_provides_answer_p", "GRAPHL-NODE-PROVIDES-ANSWER-P", 2, 0, false);
	declareFunction("graphl_search_size", "GRAPHL-SEARCH-SIZE", 0, 0, false);
	declareFunction("graphl_instantiate_new_space", "GRAPHL-INSTANTIATE-NEW-SPACE", 0, 0, false);
	declareFunction("graphl_goal_found_condition_p", "GRAPHL-GOAL-FOUND-CONDITION-P", 1, 0, false);
	return NIL;
    }

    public static final SubLObject describe_graphl_search(SubLObject v_object) {
	format(T, $str_alt63$GraphL_Search____a__, v_object);
	format(T, $str_alt64$Direction____a__, graphl_search_direction(v_object));
	format(T, $str_alt65$Type____a__, graphl_search_type(v_object));
	format(T, $str_alt66$Order____a__, graphl_search_order(v_object));
	format(T, $str_alt67$Cutoff____a__, graphl_search_cutoff(v_object));
	format(T, $str_alt68$Marking____a__, graphl_search_marking(v_object));
	format(T, $str_alt69$Space____a__, graphl_search_marking_space(v_object));
	format(T, $str_alt70$Goal_Space____a__, graphl_search_goal_space(v_object));
	format(T, $str_alt71$Goal____a__, graphl_search_goal(v_object));
	format(T, $str_alt72$Goal_Fn____a__, graphl_search_goal_fn(v_object));
	format(T, $str_alt73$Goal_Found_P____a__, graphl_search_goal_found_p(v_object));
	format(T, $str_alt74$Satisfy_Fn____a__, graphl_search_satisfy_fn(v_object));
	format(T, $str_alt75$Map_Fn____a__, graphl_search_map_fn(v_object));
	format(T, $str_alt76$Justify_____a__, graphl_search_justifyP(v_object));
	format(T, $str_alt77$Add_to_Result_____a__, graphl_search_add_to_resultP(v_object));
	format(T, $str_alt78$Unwind_Fn_Toggle____a__, graphl_search_unwind_fn_toggle(v_object));
	format(T, $str_alt79$Result____a__, graphl_search_result(v_object));
	format(T, $str_alt80$Graph____a__, graphl_search_graph(v_object));
	return NIL;
    }

    public static final SubLObject destroy_graphl_search(SubLObject graph_search) {
	_csetf_graphl_search_direction(graph_search, $FREE);
	_csetf_graphl_search_marking_space(graph_search, $FREE);
	_csetf_graphl_search_result(graph_search, $FREE);
	_csetf_graphl_search_graph(graph_search, $FREE);
	return NIL;
    }

    public static final SubLObject determine_graphl_relevant_directions(SubLObject graphl_direction) {
	{
	    SubLObject pcase_var = graphl_direction;
	    if (pcase_var.eql($ACCESSIBLE)) {
		return $list_alt100;
	    } else if (pcase_var.eql($FORWARD)) {
		return $list_alt101;
	    } else if (pcase_var.eql($BACKWARD)) {
		return $list_alt102;
	    }

	}
	return NIL;
    }

    public static final SubLObject do_graphl_relevant_directions(SubLObject macroform, SubLObject environment) {
	{
	    SubLObject datum = macroform.rest();
	    SubLObject current = datum;
	    destructuring_bind_must_consp(current, datum, $list_alt103);
	    {
		SubLObject temp = current.rest();
		current = current.first();
		{
		    SubLObject dir_var = NIL;
		    SubLObject direction = NIL;
		    destructuring_bind_must_consp(current, datum, $list_alt103);
		    dir_var = current.first();
		    current = current.rest();
		    destructuring_bind_must_consp(current, datum, $list_alt103);
		    direction = current.first();
		    current = current.rest();
		    {
			SubLObject allow_other_keys_p = NIL;
			SubLObject rest = current;
			SubLObject bad = NIL;
			SubLObject current_3 = NIL;
			for (; NIL != rest;) {
			    destructuring_bind_must_consp(rest, datum, $list_alt103);
			    current_3 = rest.first();
			    rest = rest.rest();
			    destructuring_bind_must_consp(rest, datum, $list_alt103);
			    if (NIL == member(current_3, $list_alt104, UNPROVIDED, UNPROVIDED)) {
				bad = T;
			    }
			    if (current_3 == $ALLOW_OTHER_KEYS) {
				allow_other_keys_p = rest.first();
			    }
			    rest = rest.rest();
			}
			if ((NIL != bad) && (NIL == allow_other_keys_p)) {
			    cdestructuring_bind_error(datum, $list_alt103);
			}
			{
			    SubLObject done_var_tail = property_list_member($DONE_VAR, current);
			    SubLObject done_var = (NIL != done_var_tail) ? ((SubLObject) (cadr(done_var_tail))) : NIL;
			    current = temp;
			    {
				SubLObject body = current;
				return listS(CSOME, list(dir_var, list(DETERMINE_GRAPHL_RELEVANT_DIRECTIONS, direction), done_var), append(body, NIL));
			    }
			}
		    }
		}
	    }
	}
    }

    public static final SubLObject graphl_add_edges_on_unwind_p(SubLObject v_search) {
	return eq(graphl_add_to_resultP(v_search), $EDGES_ON_UNWIND);
    }

    public static final SubLObject graphl_add_node_to_result(SubLObject v_search, SubLObject node) {
	_csetf_graphl_search_result(v_search, cons(node, graphl_search_result(v_search)));
	return NIL;
    }

    public static final SubLObject graphl_add_nodes_on_wind_p(SubLObject v_search) {
	return eq(graphl_add_to_resultP(v_search), $NODES_ON_WIND);
    }

    public static final SubLObject graphl_add_to_result(SubLObject v_search, SubLObject addition, SubLObject test) {
	if (test == UNPROVIDED) {
	    test = symbol_function(EQ);
	}
	{
	    SubLObject item_var = addition;
	    if (NIL == member(item_var, graphl_search_result(v_search), test, symbol_function(IDENTITY))) {
		_csetf_graphl_search_result(v_search, cons(item_var, graphl_search_result(v_search)));
	    }
	}
	return NIL;
    }

    public static final SubLObject graphl_add_to_resultP(SubLObject v_search) {
	return graphl_search_add_to_resultP(v_search);
    }

    public static final SubLObject graphl_append_to_result(SubLObject v_search, SubLObject addition) {
	set_graphl_search_result(v_search, append(graphl_search_result(v_search), addition));
	return NIL;
    }

    public static final SubLObject graphl_backward_direction() {
	return $BACKWARD;
    }

    public static final SubLObject graphl_breadth_first_search_p(SubLObject v_search) {
	return eq(graphl_order(v_search), $BREADTH_FIRST);
    }

    public static final SubLObject graphl_compute_justifyP(SubLObject v_search) {
	return graphl_search_justifyP(v_search);
    }

    public static final SubLObject graphl_cutoff(SubLObject v_search) {
	return graphl_search_cutoff(v_search);
    }

    public static final SubLObject graphl_cutoff_search_p(SubLObject v_search) {
	return list_utilities.sublisp_boolean(graphl_search_cutoff(v_search));
    }

    public static final SubLObject graphl_depth_cutoff(SubLObject v_search) {
	return graphl_search_cutoff(v_search);
    }

    public static final SubLObject graphl_depth_first_search_p(SubLObject v_search) {
	return eq(graphl_order(v_search), $DEPTH_FIRST);
    }

    public static final SubLObject graphl_depth_marking_search_p(SubLObject v_search) {
	return eq(graphl_marking(v_search), $DEPTH_MARKING);
    }

    public static final SubLObject graphl_direction(SubLObject v_search) {
	return graphl_search_direction(v_search);
    }

    public static final SubLObject graphl_forward_direction() {
	return $FORWARD;
    }

    public static final SubLObject graphl_forward_direction_p(SubLObject direction) {
	return eq(direction, $FORWARD);
    }

    public static final SubLObject graphl_goal(SubLObject v_search) {
	return graphl_search_goal(v_search);
    }

    public static final SubLObject graphl_goal_fn_p(SubLObject v_search) {
	return function_spec_p(graphl_search_goal_fn(v_search));
    }

    public static final SubLObject graphl_goal_found_condition_p(SubLObject condition) {
	return eq(condition, $GOAL);
    }

    public static final SubLObject graphl_goal_found_p(SubLObject v_search) {
	return graphl_search_goal_found_p(v_search);
    }

    public static final SubLObject graphl_goal_search_p(SubLObject v_search) {
	return makeBoolean((NIL != graphl_search_goal(v_search)) || (NIL != graphl_search_goal_fn(v_search)));
    }

    public static final SubLObject graphl_goal_space(SubLObject v_search) {
	return graphl_search_goal_space(v_search);
    }

    public static final SubLObject graphl_instantiate_new_space() {
	return make_hash_table(graphl_search_size(), UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject graphl_iterative_deepening_search_p(SubLObject v_search) {
	return eq(graphl_order(v_search), $ITERATIVE_DEEPENING);
    }

    public static final SubLObject graphl_map_fn(SubLObject v_search) {
	return graphl_search_map_fn(v_search);
    }

    public static final SubLObject graphl_map_p(SubLObject v_search) {
	return list_utilities.sublisp_boolean(graphl_map_fn(v_search));
    }

    public static final SubLObject graphl_marking(SubLObject v_search) {
	return graphl_search_marking(v_search);
    }

    public static final SubLObject graphl_multiple_goals_p(SubLObject v_search) {
	return listp(graphl_goal(v_search));
    }

    public static final SubLObject graphl_node_provides_answer_p(SubLObject v_search, SubLObject node) {
	if (NIL != graphl_single_goal_p(v_search)) {
	    if (graphl_search_goal(v_search) == $SATISFY_FN) {
		return funcall(graphl_search_satisfy_fn(v_search), node);
	    } else {
		return eq(node, graphl_search_goal(v_search));
	    }
	} else if (NIL != graphl_multiple_goals_p(v_search)) {
	    return subl_promotions.memberP(node, graphl_search_goal(v_search), UNPROVIDED, UNPROVIDED);
	} else {
	    return NIL;
	}

    }

    public static final SubLObject graphl_opposite_direction(SubLObject direction) {
	{
	    SubLObject pcase_var = direction;
	    if (pcase_var.eql($FORWARD)) {
		return $BACKWARD;
	    } else if (pcase_var.eql($BACKWARD)) {
		return $FORWARD;
	    }

	}
	return NIL;
    }

    public static final SubLObject graphl_order(SubLObject v_search) {
	return graphl_search_order(v_search);
    }

    public static final SubLObject graphl_result(SubLObject v_search) {
	return graphl_search_result(v_search);
    }

    public static final SubLObject graphl_return_one_answer_p(SubLObject v_search) {
	return graphl_goal_search_p(v_search);
    }

    public static final SubLObject graphl_search_add_to_resultP(SubLObject v_object) {
	SubLTrampolineFile.checkType(v_object, GRAPHL_SEARCH_P);
	return v_object.getField15();
    }

    public static final SubLObject graphl_search_cutoff(SubLObject v_object) {
	SubLTrampolineFile.checkType(v_object, GRAPHL_SEARCH_P);
	return v_object.getField5();
    }

    public static final SubLObject graphl_search_direction(SubLObject v_object) {
	SubLTrampolineFile.checkType(v_object, GRAPHL_SEARCH_P);
	return v_object.getField2();
    }

    public static final SubLObject graphl_search_goal(SubLObject v_object) {
	SubLTrampolineFile.checkType(v_object, GRAPHL_SEARCH_P);
	return v_object.getField9();
    }

    public static final SubLObject graphl_search_goal_fn(SubLObject v_object) {
	SubLTrampolineFile.checkType(v_object, GRAPHL_SEARCH_P);
	return v_object.getField10();
    }

    public static final SubLObject graphl_search_goal_found_p(SubLObject v_object) {
	SubLTrampolineFile.checkType(v_object, GRAPHL_SEARCH_P);
	return v_object.getField11();
    }

    public static final SubLObject graphl_search_goal_space(SubLObject v_object) {
	SubLTrampolineFile.checkType(v_object, GRAPHL_SEARCH_P);
	return v_object.getField8();
    }

    public static final SubLObject graphl_search_graph(SubLObject v_object) {
	SubLTrampolineFile.checkType(v_object, GRAPHL_SEARCH_P);
	return v_object.getField18();
    }

    public static final SubLObject graphl_search_justifyP(SubLObject v_object) {
	SubLTrampolineFile.checkType(v_object, GRAPHL_SEARCH_P);
	return v_object.getField14();
    }

    public static final SubLObject graphl_search_map_fn(SubLObject v_object) {
	SubLTrampolineFile.checkType(v_object, GRAPHL_SEARCH_P);
	return v_object.getField13();
    }

    public static final SubLObject graphl_search_marking(SubLObject v_object) {
	SubLTrampolineFile.checkType(v_object, GRAPHL_SEARCH_P);
	return v_object.getField6();
    }

    public static final SubLObject graphl_search_marking_space(SubLObject v_object) {
	SubLTrampolineFile.checkType(v_object, GRAPHL_SEARCH_P);
	return v_object.getField7();
    }

    public static final SubLObject graphl_search_order(SubLObject v_object) {
	SubLTrampolineFile.checkType(v_object, GRAPHL_SEARCH_P);
	return v_object.getField4();
    }

    public static final SubLObject graphl_search_p(SubLObject v_object) {
	return v_object.getClass() == $graphl_search_native.class ? ((SubLObject) (T)) : NIL;
    }

    public static final SubLObject graphl_search_print_function_trampoline(SubLObject v_object, SubLObject stream) {
	print_graphl_search(v_object, stream, ZERO_INTEGER);
	return NIL;
    }

    public static final SubLObject graphl_search_result(SubLObject v_object) {
	SubLTrampolineFile.checkType(v_object, GRAPHL_SEARCH_P);
	return v_object.getField17();
    }

    public static final SubLObject graphl_search_satisfy_fn(SubLObject v_object) {
	SubLTrampolineFile.checkType(v_object, GRAPHL_SEARCH_P);
	return v_object.getField12();
    }

    public static final SubLObject graphl_search_size() {
	return $graphl_search_size$.getGlobalValue();
    }

    public static final SubLObject graphl_search_type(SubLObject v_object) {
	SubLTrampolineFile.checkType(v_object, GRAPHL_SEARCH_P);
	return v_object.getField3();
    }

    public static final SubLObject graphl_search_unwind_fn_toggle(SubLObject v_object) {
	SubLTrampolineFile.checkType(v_object, GRAPHL_SEARCH_P);
	return v_object.getField16();
    }

    public static final SubLObject graphl_single_goal_p(SubLObject v_search) {
	return atom(graphl_goal(v_search));
    }

    public static final SubLObject graphl_space(SubLObject v_search) {
	return graphl_search_marking_space(v_search);
    }

    /**
     *
     *
     * @return booleanp; Whether OBJ is a valid table for recording graphl searches.
     */
    public static final SubLObject graphl_table_p(SubLObject obj) {
	return hash_table_p(obj);
    }

    public static final SubLObject graphl_toggle_unwind_off(SubLObject v_search) {
	_csetf_graphl_search_unwind_fn_toggle(v_search, NIL);
	return NIL;
    }

    public static final SubLObject graphl_toggle_unwind_on(SubLObject v_search) {
	_csetf_graphl_search_unwind_fn_toggle(v_search, T);
	return NIL;
    }

    public static final SubLObject graphl_type(SubLObject v_search) {
	return graphl_search_type(v_search);
    }

    public static final SubLObject init_graphl_search_vars_file() {
	defconstant("*DTP-GRAPHL-SEARCH*", GRAPHL_SEARCH);
	deflexical("*GRAPHL-SEARCH-SIZE*", $int$200);
	return NIL;
    }

    public static final SubLObject make_graphl_search(SubLObject arglist) {
	if (arglist == UNPROVIDED) {
	    arglist = NIL;
	}
	{
	    SubLObject v_new = new $graphl_search_native();
	    SubLObject next = NIL;
	    for (next = arglist; NIL != next; next = cddr(next)) {
		{
		    SubLObject current_arg = next.first();
		    SubLObject current_value = cadr(next);
		    SubLObject pcase_var = current_arg;
		    if (pcase_var.eql($DIRECTION)) {
			_csetf_graphl_search_direction(v_new, current_value);
		    } else if (pcase_var.eql($TYPE)) {
			_csetf_graphl_search_type(v_new, current_value);
		    } else if (pcase_var.eql($ORDER)) {
			_csetf_graphl_search_order(v_new, current_value);
		    } else if (pcase_var.eql($CUTOFF)) {
			_csetf_graphl_search_cutoff(v_new, current_value);
		    } else if (pcase_var.eql($MARKING)) {
			_csetf_graphl_search_marking(v_new, current_value);
		    } else if (pcase_var.eql($MARKING_SPACE)) {
			_csetf_graphl_search_marking_space(v_new, current_value);
		    } else if (pcase_var.eql($GOAL_SPACE)) {
			_csetf_graphl_search_goal_space(v_new, current_value);
		    } else if (pcase_var.eql($GOAL)) {
			_csetf_graphl_search_goal(v_new, current_value);
		    } else if (pcase_var.eql($GOAL_FN)) {
			_csetf_graphl_search_goal_fn(v_new, current_value);
		    } else if (pcase_var.eql($GOAL_FOUND_P)) {
			_csetf_graphl_search_goal_found_p(v_new, current_value);
		    } else if (pcase_var.eql($SATISFY_FN)) {
			_csetf_graphl_search_satisfy_fn(v_new, current_value);
		    } else if (pcase_var.eql($MAP_FN)) {
			_csetf_graphl_search_map_fn(v_new, current_value);
		    } else if (pcase_var.eql($JUSTIFY_)) {
			_csetf_graphl_search_justifyP(v_new, current_value);
		    } else if (pcase_var.eql($kw55$ADD_TO_RESULT_)) {
			_csetf_graphl_search_add_to_resultP(v_new, current_value);
		    } else if (pcase_var.eql($UNWIND_FN_TOGGLE)) {
			_csetf_graphl_search_unwind_fn_toggle(v_new, current_value);
		    } else if (pcase_var.eql($RESULT)) {
			_csetf_graphl_search_result(v_new, current_value);
		    } else if (pcase_var.eql($GRAPH)) {
			_csetf_graphl_search_graph(v_new, current_value);
		    } else {
			Errors.error($str_alt59$Invalid_slot__S_for_construction_, current_arg);
		    }

		}
	    }
	    return v_new;
	}
    }

    public static final SubLObject new_graphl_search(SubLObject plist) {
	{
	    SubLObject graphl_search = make_graphl_search(UNPROVIDED);
	    SubLObject remainder = NIL;
	    for (remainder = plist; NIL != remainder; remainder = cddr(remainder)) {
		{
		    SubLObject property = remainder.first();
		    SubLObject value = cadr(remainder);
		    set_graphl_search_property(graphl_search, property, value);
		}
	    }
	    possibly_initialize_graphl_marking_spaces(graphl_search);
	    set_graphl_search_result(graphl_search, NIL);
	    return graphl_search;
	}
    }

    public static final SubLObject possibly_initialize_graphl_marking_spaces(SubLObject v_search) {
	{
	    SubLObject space = graphl_search_marking_space(v_search);
	    if (NIL == space) {
		_csetf_graphl_search_marking_space(v_search, graphl_instantiate_new_space());
	    }
	}
	return v_search;
    }

    public static final SubLObject print_graphl_search(SubLObject v_object, SubLObject stream, SubLObject depth) {
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    if (NIL != $print_readably$.getDynamicValue(thread)) {
		print_not_readable(v_object, stream);
	    } else {
		{
		    SubLObject v_object_1 = v_object;
		    SubLObject stream_2 = stream;
		    write_string($str_alt60$__, stream_2, UNPROVIDED, UNPROVIDED);
		    write(type_of(v_object_1), new SubLObject[] { $STREAM, stream_2 });
		    write_char(CHAR_space, stream_2);
		    write(pointer(v_object_1), new SubLObject[] { $STREAM, stream_2, $BASE, SIXTEEN_INTEGER });
		    write_char(CHAR_greater, stream_2);
		}
	    }
	    return NIL;
	}
    }

    public static final SubLObject reinitialize_graphl_spaces(SubLObject v_search) {
	_csetf_graphl_search_marking_space(v_search, graphl_instantiate_new_space());
	_csetf_graphl_search_goal_space(v_search, graphl_instantiate_new_space());
	return NIL;
    }

    public static final SubLObject set_graphl_search_add_to_resultP(SubLObject v_search, SubLObject addP) {
	_csetf_graphl_search_add_to_resultP(v_search, addP);
	return NIL;
    }

    public static final SubLObject set_graphl_search_cutoff(SubLObject v_search, SubLObject cutoff_type) {
	_csetf_graphl_search_cutoff(v_search, cutoff_type);
	return NIL;
    }

    public static final SubLObject set_graphl_search_direction(SubLObject v_search, SubLObject direction) {
	_csetf_graphl_search_direction(v_search, direction);
	return NIL;
    }

    public static final SubLObject set_graphl_search_goal(SubLObject v_search, SubLObject goal) {
	_csetf_graphl_search_goal(v_search, goal);
	return NIL;
    }

    public static final SubLObject set_graphl_search_goal_fn(SubLObject v_search, SubLObject goal_fn) {
	_csetf_graphl_search_goal_fn(v_search, goal_fn);
	return NIL;
    }

    public static final SubLObject set_graphl_search_goal_found_p(SubLObject v_search, SubLObject found_p) {
	_csetf_graphl_search_goal_found_p(v_search, found_p);
	return NIL;
    }

    public static final SubLObject set_graphl_search_goal_space(SubLObject v_search, SubLObject goal_space) {
	_csetf_graphl_search_goal_space(v_search, goal_space);
	return NIL;
    }

    public static final SubLObject set_graphl_search_justifyP(SubLObject v_search, SubLObject justifyP) {
	_csetf_graphl_search_justifyP(v_search, justifyP);
	return NIL;
    }

    public static final SubLObject set_graphl_search_map_fn(SubLObject v_search, SubLObject map_fn) {
	_csetf_graphl_search_map_fn(v_search, map_fn);
	return NIL;
    }

    public static final SubLObject set_graphl_search_marking(SubLObject v_search, SubLObject marking) {
	_csetf_graphl_search_marking(v_search, marking);
	return NIL;
    }

    public static final SubLObject set_graphl_search_marking_space(SubLObject v_search, SubLObject marking_space) {
	_csetf_graphl_search_marking_space(v_search, marking_space);
	return NIL;
    }

    public static final SubLObject set_graphl_search_order(SubLObject v_search, SubLObject order) {
	_csetf_graphl_search_order(v_search, order);
	return NIL;
    }

    public static final SubLObject set_graphl_search_properties(SubLObject v_search, SubLObject plist) {
	{
	    SubLObject remainder = NIL;
	    for (remainder = plist; NIL != remainder; remainder = cddr(remainder)) {
		{
		    SubLObject prop = remainder.first();
		    SubLObject val = cadr(remainder);
		    set_graphl_search_property(v_search, prop, val);
		}
	    }
	}
	return v_search;
    }

    public static final SubLObject set_graphl_search_property(SubLObject v_search, SubLObject property, SubLObject value) {
	{
	    SubLObject pcase_var = property;
	    if (pcase_var.eql($DIRECTION)) {
		_csetf_graphl_search_direction(v_search, value);
	    } else if (pcase_var.eql($TYPE)) {
		_csetf_graphl_search_type(v_search, value);
	    } else if (pcase_var.eql($ORDER)) {
		_csetf_graphl_search_order(v_search, value);
	    } else if (pcase_var.eql($CUTOFF)) {
		_csetf_graphl_search_cutoff(v_search, value);
	    } else if (pcase_var.eql($MARKING)) {
		_csetf_graphl_search_marking(v_search, value);
	    } else if (pcase_var.eql($MARKING_SPACE)) {
		_csetf_graphl_search_marking_space(v_search, value);
	    } else if (pcase_var.eql($GOAL)) {
		_csetf_graphl_search_goal(v_search, value);
	    } else if (pcase_var.eql($GOAL_FN)) {
		_csetf_graphl_search_goal_fn(v_search, value);
	    } else if (pcase_var.eql($GOAL_SPACE)) {
		_csetf_graphl_search_goal_space(v_search, value);
	    } else if (pcase_var.eql($SATISFY_FN)) {
		_csetf_graphl_search_satisfy_fn(v_search, value);
	    } else if (pcase_var.eql($MAP_FN)) {
		_csetf_graphl_search_map_fn(v_search, value);
	    } else if (pcase_var.eql($JUSTIFY_)) {
		_csetf_graphl_search_justifyP(v_search, value);
	    } else if (pcase_var.eql($kw55$ADD_TO_RESULT_)) {
		_csetf_graphl_search_add_to_resultP(v_search, value);
	    } else if (pcase_var.eql($UNWIND_FN_TOGGLE)) {
		_csetf_graphl_search_unwind_fn_toggle(v_search, value);
	    }

	}
	return v_search;
    }

    public static final SubLObject set_graphl_search_result(SubLObject v_search, SubLObject result) {
	_csetf_graphl_search_result(v_search, result);
	return NIL;
    }

    public static final SubLObject set_graphl_search_satisfy_fn(SubLObject v_search, SubLObject satisfy_fn) {
	_csetf_graphl_search_satisfy_fn(v_search, satisfy_fn);
	return NIL;
    }

    public static final SubLObject set_graphl_search_type(SubLObject v_search, SubLObject type) {
	_csetf_graphl_search_type(v_search, type);
	return NIL;
    }

    public static final SubLObject setup_graphl_search_vars_file() {
	register_method($print_object_method_table$.getGlobalValue(), $dtp_graphl_search$.getGlobalValue(), symbol_function(GRAPHL_SEARCH_PRINT_FUNCTION_TRAMPOLINE));
	def_csetf(GRAPHL_SEARCH_DIRECTION, _CSETF_GRAPHL_SEARCH_DIRECTION);
	def_csetf(GRAPHL_SEARCH_TYPE, _CSETF_GRAPHL_SEARCH_TYPE);
	def_csetf(GRAPHL_SEARCH_ORDER, _CSETF_GRAPHL_SEARCH_ORDER);
	def_csetf(GRAPHL_SEARCH_CUTOFF, _CSETF_GRAPHL_SEARCH_CUTOFF);
	def_csetf(GRAPHL_SEARCH_MARKING, _CSETF_GRAPHL_SEARCH_MARKING);
	def_csetf(GRAPHL_SEARCH_MARKING_SPACE, _CSETF_GRAPHL_SEARCH_MARKING_SPACE);
	def_csetf(GRAPHL_SEARCH_GOAL_SPACE, _CSETF_GRAPHL_SEARCH_GOAL_SPACE);
	def_csetf(GRAPHL_SEARCH_GOAL, _CSETF_GRAPHL_SEARCH_GOAL);
	def_csetf(GRAPHL_SEARCH_GOAL_FN, _CSETF_GRAPHL_SEARCH_GOAL_FN);
	def_csetf(GRAPHL_SEARCH_GOAL_FOUND_P, _CSETF_GRAPHL_SEARCH_GOAL_FOUND_P);
	def_csetf(GRAPHL_SEARCH_SATISFY_FN, _CSETF_GRAPHL_SEARCH_SATISFY_FN);
	def_csetf(GRAPHL_SEARCH_MAP_FN, _CSETF_GRAPHL_SEARCH_MAP_FN);
	def_csetf($sym32$GRAPHL_SEARCH_JUSTIFY_, $sym33$_CSETF_GRAPHL_SEARCH_JUSTIFY_);
	def_csetf($sym34$GRAPHL_SEARCH_ADD_TO_RESULT_, $sym35$_CSETF_GRAPHL_SEARCH_ADD_TO_RESULT_);
	def_csetf(GRAPHL_SEARCH_UNWIND_FN_TOGGLE, _CSETF_GRAPHL_SEARCH_UNWIND_FN_TOGGLE);
	def_csetf(GRAPHL_SEARCH_RESULT, _CSETF_GRAPHL_SEARCH_RESULT);
	def_csetf(GRAPHL_SEARCH_GRAPH, _CSETF_GRAPHL_SEARCH_GRAPH);
	identity(GRAPHL_SEARCH);
	access_macros.register_macro_helper(SET_GRAPHL_SEARCH_PROPERTIES, WITH_GRAPHL_SEARCH_INITIALIZED);
	return NIL;
    }

    public static final SubLObject valid_graphl_cutoff_p(SubLObject cutoff) {
	return makeBoolean((NIL == cutoff) || (cutoff == $GOAL));
    }

    public static final SubLObject valid_graphl_marking_style_p(SubLObject marking) {
	return subl_promotions.memberP(marking, $list_alt88, UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject valid_graphl_search_direction_p(SubLObject direction) {
	return subl_promotions.memberP(direction, $list_alt89, UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject valid_graphl_search_order_p(SubLObject order) {
	return makeBoolean((order == $DEPTH_FIRST) || (order == $BREADTH_FIRST));
    }

    public static final SubLObject with_graphl_search_initialized(SubLObject macroform, SubLObject environment) {
	{
	    SubLObject datum = macroform.rest();
	    SubLObject current = datum;
	    SubLObject search_var = NIL;
	    SubLObject plist = NIL;
	    destructuring_bind_must_consp(current, datum, $list_alt90);
	    search_var = current.first();
	    current = current.rest();
	    destructuring_bind_must_consp(current, datum, $list_alt90);
	    plist = current.first();
	    current = current.rest();
	    {
		SubLObject body = current;
		return listS(CLET, list(bq_cons(search_var, $list_alt92)), list(SET_GRAPHL_SEARCH_PROPERTIES, search_var, plist), append(body, list(list(DESTROY_GRAPHL_SEARCH, search_var))));
	    }
	}
    }

    // // Constructor
    private graphl_search_vars() {
    }

    // // Initializers
    @Override
    public void declareFunctions() {
	declare_graphl_search_vars_file();
    }

    @Override
    public void initializeVariables() {
	init_graphl_search_vars_file();
    }

    @Override
    public void runTopLevelForms() {
	setup_graphl_search_vars_file();
    }

    public static final class $graphl_search_p$UnaryFunction extends UnaryFunction {
	public $graphl_search_p$UnaryFunction() {
	    super(extractFunctionNamed("GRAPHL-SEARCH-P"));
	}

	@Override
	public SubLObject processItem(SubLObject arg1) {
	    return graphl_search_p(arg1);
	}
    }

}

/**
 * Total time: 234 ms
 */
