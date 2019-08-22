package com.cyc.cycjava.cycl;


import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.funcall;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.function_spec_p;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.second;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.defconstant;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class visitation_utilities extends SubLTranslatedFile {
    public static final SubLFile me = new visitation_utilities();

    public static final String myName = "com.cyc.cycjava.cycl.visitation_utilities";

    public static final String myFingerPrint = "17bdb2db9cd3d77a03027441c4d9c5c85e236bc8993805bcd3b70c23c8ea6a16";

    // defconstant
    public static final SubLSymbol $defstruct_recipe_constructor$ = makeSymbol("*DEFSTRUCT-RECIPE-CONSTRUCTOR*");

    // defparameter
    // The current PLIST of a defstruct that is being built up.
    private static final SubLSymbol $current_defstruct_recipe$ = makeSymbol("*CURRENT-DEFSTRUCT-RECIPE*");

    private static final SubLSymbol $kw0$__CONSTRUCTOR = makeKeyword("%%CONSTRUCTOR");

    public static final SubLSymbol DEFSTRUCT_RECIPE_P = makeSymbol("DEFSTRUCT-RECIPE-P");



    public static final SubLSymbol DEFSTRUCT_RECIPE_VISITORFN = makeSymbol("DEFSTRUCT-RECIPE-VISITORFN");







    public static SubLObject defstruct_recipe_p(final SubLObject obj) {
        return makeBoolean(((obj.isCons() && obj.first().eql($defstruct_recipe_constructor$.getGlobalValue())) && second(obj).isFunctionSpec()) && (NIL != list_utilities.property_list_p(obj)));
    }

    public static SubLObject get_defstruct_recipe_constructor(final SubLObject recipe) {
        if (((!recipe.first().eql($defstruct_recipe_constructor$.getGlobalValue())) && (!SubLTrampolineFile.assertionsDisabledInClass)) && (NIL == defstruct_recipe_p(recipe))) {
            throw new AssertionError(recipe);
        }
        final SubLObject constructor = second(recipe);
        assert NIL != function_spec_p(constructor) : "Types.function_spec_p(constructor) " + "CommonSymbols.NIL != Types.function_spec_p(constructor) " + constructor;
        return constructor;
    }

    public static SubLObject get_defstruct_recipe_parameters(final SubLObject recipe) {
        assert NIL != defstruct_recipe_p(recipe) : "visitation_utilities.defstruct_recipe_p(recipe) " + "CommonSymbols.NIL != visitation_utilities.defstruct_recipe_p(recipe) " + recipe;
        final SubLObject past_constructor_tag = recipe.rest();
        final SubLObject past_func_spec = past_constructor_tag.rest();
        return past_func_spec;
    }

    public static SubLObject defstruct_recipe(final SubLObject struct) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject recipe = NIL;
        final SubLObject _prev_bind_0 = $current_defstruct_recipe$.currentBinding(thread);
        try {
            $current_defstruct_recipe$.bind(NIL, thread);
            visitation.visit_defstruct(struct, symbol_function(DEFSTRUCT_RECIPE_VISITORFN));
            recipe = $current_defstruct_recipe$.getDynamicValue(thread);
        } finally {
            $current_defstruct_recipe$.rebind(_prev_bind_0, thread);
        }
        return recipe;
    }

    public static SubLObject defstruct_recipe_visitorfn(final SubLObject obj, final SubLObject phase, final SubLObject param_a, final SubLObject param_b) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (phase.eql($BEGIN)) {
            $current_defstruct_recipe$.setDynamicValue(NIL, thread);
        } else
            if (phase.eql($SLOT)) {
                $current_defstruct_recipe$.setDynamicValue(cons(param_a, cons(param_b, $current_defstruct_recipe$.getDynamicValue(thread))), thread);
            } else
                if (phase.eql($END)) {
                    $current_defstruct_recipe$.setDynamicValue(cons($defstruct_recipe_constructor$.getGlobalValue(), cons(param_a, $current_defstruct_recipe$.getDynamicValue(thread))), thread);
                }


        return obj;
    }

    public static SubLObject instantiate_defstruct_recipe(final SubLObject recipe) {
        assert NIL != defstruct_recipe_p(recipe) : "visitation_utilities.defstruct_recipe_p(recipe) " + "CommonSymbols.NIL != visitation_utilities.defstruct_recipe_p(recipe) " + recipe;
        final SubLObject constructor = get_defstruct_recipe_constructor(recipe);
        final SubLObject parameters = get_defstruct_recipe_parameters(recipe);
        return funcall(constructor, parameters);
    }

    public static SubLObject declare_visitation_utilities_file() {
        declareFunction(me, "defstruct_recipe_p", "DEFSTRUCT-RECIPE-P", 1, 0, false);
        declareFunction(me, "get_defstruct_recipe_constructor", "GET-DEFSTRUCT-RECIPE-CONSTRUCTOR", 1, 0, false);
        declareFunction(me, "get_defstruct_recipe_parameters", "GET-DEFSTRUCT-RECIPE-PARAMETERS", 1, 0, false);
        declareFunction(me, "defstruct_recipe", "DEFSTRUCT-RECIPE", 1, 0, false);
        declareFunction(me, "defstruct_recipe_visitorfn", "DEFSTRUCT-RECIPE-VISITORFN", 4, 0, false);
        declareFunction(me, "instantiate_defstruct_recipe", "INSTANTIATE-DEFSTRUCT-RECIPE", 1, 0, false);
        return NIL;
    }

    public static SubLObject init_visitation_utilities_file() {
        defconstant("*DEFSTRUCT-RECIPE-CONSTRUCTOR*", $kw0$__CONSTRUCTOR);
        defparameter("*CURRENT-DEFSTRUCT-RECIPE*", NIL);
        return NIL;
    }

    public static SubLObject setup_visitation_utilities_file() {
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_visitation_utilities_file();
    }

    @Override
    public void initializeVariables() {
        init_visitation_utilities_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_visitation_utilities_file();
    }

    
}

/**
 * Total time: 32 ms synthetic
 */
