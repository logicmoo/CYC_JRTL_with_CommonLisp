package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.subl_macro_promotions.declare_defglobal;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.append;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.listS;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Packages.find_symbol;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.nreverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.boundp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_value;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.princ_to_string;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.declareMacro;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class alexandria_allegro_macros extends SubLTranslatedFile implements V10 {
    public static final SubLFile me = new alexandria_allegro_macros();



    // defparameter
    private static final SubLSymbol $alexandria_allegro_mode_enabledP$ = makeSymbol("*ALEXANDRIA-ALLEGRO-MODE-ENABLED?*");

    // deflexical
    private static final SubLSymbol $alexandria_allegro_cache_kb_store_contentP$ = makeSymbol("*ALEXANDRIA-ALLEGRO-CACHE-KB-STORE-CONTENT?*");

    // defparameter
    public static final SubLSymbol $suspend_jrtl_object_cachingP$ = makeSymbol("*SUSPEND-JRTL-OBJECT-CACHING?*");

    private static final SubLSymbol $sym0$_ALEXANDRIA_ALLEGRO_CACHE_KB_STORE_CONTENT__ = makeSymbol("*ALEXANDRIA-ALLEGRO-CACHE-KB-STORE-CONTENT?*");



    private static final SubLList $list2 = list(list(makeSymbol("*SUSPEND-JRTL-OBJECT-CACHING?*"), T));

    private static final SubLList $list3 = list(makeSymbol("CLASS"), makeSymbol("&REST"), makeSymbol("ARGS"));

    private static final SubLSymbol JRTL_BOX = makeSymbol("JRTL-BOX");

    private static final SubLSymbol JRTL_UNBOX = makeSymbol("JRTL-UNBOX");

    private static final SubLSymbol JAVA_NEW = makeSymbol("JAVA-NEW");

    private static final SubLList $list7 = list(makeSymbol("CLASS"), makeSymbol("NAME"), makeSymbol("&REST"), makeSymbol("ARGSIG"));

    private static final SubLSymbol JAVA_METHOD = makeSymbol("JAVA-METHOD");

    private static final SubLList $list9 = list(makeSymbol("METHOD"), makeSymbol("CLASS"), makeSymbol("&REST"), makeSymbol("ARGS"));

    private static final SubLSymbol JAVA_STATIC = makeSymbol("JAVA-STATIC");

    private static final SubLList $list11 = list(makeSymbol("METHOD"), makeSymbol("INSTANCE"), makeSymbol("&REST"), makeSymbol("ARGS"));

    private static final SubLSymbol JAVA_CALL = makeSymbol("JAVA-CALL");

    public static SubLObject alexandria_allegro_mode_enabledP() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return $alexandria_allegro_mode_enabledP$.getDynamicValue(thread);
    }

    public static SubLObject alexandria_allegro_cache_kb_store_contentP() {
        return $alexandria_allegro_cache_kb_store_contentP$.getGlobalValue();
    }

    public static SubLObject suspend_jrtl_object_caching(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(CLET, $list2, append(body, NIL));
    }

    public static SubLObject jrtl_new(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject v_class = NIL;
        destructuring_bind_must_consp(current, datum, $list3);
        v_class = current.first();
        final SubLObject args;
        current = args = current.rest();
        SubLObject boxed_args = NIL;
        SubLObject cdolist_list_var = args;
        SubLObject arg = NIL;
        arg = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            boxed_args = cons(list(JRTL_BOX, arg), boxed_args);
            cdolist_list_var = cdolist_list_var.rest();
            arg = cdolist_list_var.first();
        } 
        boxed_args = nreverse(boxed_args);
        return list(JRTL_UNBOX, listS(JAVA_NEW, v_class, append(boxed_args, NIL)));
    }

    public static SubLObject jrtl_method(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject v_class = NIL;
        SubLObject name = NIL;
        destructuring_bind_must_consp(current, datum, $list7);
        v_class = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list7);
        name = current.first();
        final SubLObject argsig;
        current = argsig = current.rest();
        SubLObject boxed_argsig = NIL;
        SubLObject cdolist_list_var = argsig;
        SubLObject singlesig = NIL;
        singlesig = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            boxed_argsig = cons(list(JRTL_BOX, singlesig), boxed_argsig);
            cdolist_list_var = cdolist_list_var.rest();
            singlesig = cdolist_list_var.first();
        } 
        boxed_argsig = nreverse(boxed_argsig);
        return list(JRTL_UNBOX, listS(JAVA_METHOD, v_class, name, append(boxed_argsig, NIL)));
    }

    public static SubLObject jrtl_static(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject method = NIL;
        SubLObject v_class = NIL;
        destructuring_bind_must_consp(current, datum, $list9);
        method = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list9);
        v_class = current.first();
        final SubLObject args;
        current = args = current.rest();
        SubLObject boxed_args = NIL;
        SubLObject cdolist_list_var = args;
        SubLObject arg = NIL;
        arg = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            boxed_args = cons(list(JRTL_BOX, arg), boxed_args);
            cdolist_list_var = cdolist_list_var.rest();
            arg = cdolist_list_var.first();
        } 
        boxed_args = nreverse(boxed_args);
        return list(JRTL_UNBOX, listS(JAVA_STATIC, method, v_class, append(boxed_args, NIL)));
    }

    public static SubLObject jrtl_call(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject method = NIL;
        SubLObject instance = NIL;
        destructuring_bind_must_consp(current, datum, $list11);
        method = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list11);
        instance = current.first();
        final SubLObject args;
        current = args = current.rest();
        SubLObject boxed_args = NIL;
        SubLObject cdolist_list_var = args;
        SubLObject arg = NIL;
        arg = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            boxed_args = cons(list(JRTL_BOX, arg), boxed_args);
            cdolist_list_var = cdolist_list_var.rest();
            arg = cdolist_list_var.first();
        } 
        boxed_args = nreverse(boxed_args);
        return list(JRTL_UNBOX, listS(JAVA_CALL, method, instance, append(boxed_args, NIL)));
    }

    public static SubLObject symbol_value_to_el_string(final SubLObject symbol_string) {
        final SubLObject symbol = find_symbol(Strings.string_upcase(symbol_string, UNPROVIDED, UNPROVIDED), UNPROVIDED);
        final SubLObject value = (NIL != boundp(symbol)) ? symbol_value(symbol) : NIL;
        final SubLObject el_value = (NIL != value) ? cycl_utilities.hl_to_el(value) : NIL;
        final SubLObject el_value_string = princ_to_string(el_value);
        return el_value_string;
    }

    public static SubLObject declare_alexandria_allegro_macros_file() {
        declareFunction("alexandria_allegro_mode_enabledP", "ALEXANDRIA-ALLEGRO-MODE-ENABLED?", 0, 0, false);
        declareFunction("alexandria_allegro_cache_kb_store_contentP", "ALEXANDRIA-ALLEGRO-CACHE-KB-STORE-CONTENT?", 0, 0, false);
        declareMacro("suspend_jrtl_object_caching", "SUSPEND-JRTL-OBJECT-CACHING");
        declareMacro("jrtl_new", "JRTL-NEW");
        declareMacro("jrtl_method", "JRTL-METHOD");
        declareMacro("jrtl_static", "JRTL-STATIC");
        declareMacro("jrtl_call", "JRTL-CALL");
        declareFunction("symbol_value_to_el_string", "SYMBOL-VALUE-TO-EL-STRING", 1, 0, false);
        return NIL;
    }

    public static SubLObject init_alexandria_allegro_macros_file() {
        defparameter("*ALEXANDRIA-ALLEGRO-MODE-ENABLED?*", NIL);
        deflexical("*ALEXANDRIA-ALLEGRO-CACHE-KB-STORE-CONTENT?*", SubLTrampolineFile.maybeDefault($sym0$_ALEXANDRIA_ALLEGRO_CACHE_KB_STORE_CONTENT__, $alexandria_allegro_cache_kb_store_contentP$, NIL));
        defparameter("*SUSPEND-JRTL-OBJECT-CACHING?*", NIL);
        return NIL;
    }

    public static SubLObject setup_alexandria_allegro_macros_file() {
        declare_defglobal($sym0$_ALEXANDRIA_ALLEGRO_CACHE_KB_STORE_CONTENT__);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_alexandria_allegro_macros_file();
    }

    @Override
    public void initializeVariables() {
        init_alexandria_allegro_macros_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_alexandria_allegro_macros_file();
    }

    static {

















    }
}

/**
 * Total time: 31 ms
 */
