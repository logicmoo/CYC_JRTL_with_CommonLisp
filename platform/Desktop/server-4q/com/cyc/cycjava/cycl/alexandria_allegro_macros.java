package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Packages;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class alexandria_allegro_macros extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.alexandria_allegro_macros";
    public static final String myFingerPrint = "e087c84b5a2aad91d4f0b9c8004bd74a8a1bdc96c8f942b750300bf6b22d81e3";
    @SubLTranslatedFile.SubL(source = "cycl/alexandria-allegro-macros.lisp", position = 842L)
    private static SubLSymbol $alexandria_allegro_mode_enabledP$;
    @SubLTranslatedFile.SubL(source = "cycl/alexandria-allegro-macros.lisp", position = 1127L)
    private static SubLSymbol $alexandria_allegro_cache_kb_store_contentP$;
    @SubLTranslatedFile.SubL(source = "cycl/alexandria-allegro-macros.lisp", position = 1486L)
    public static SubLSymbol $suspend_jrtl_object_cachingP$;
    private static final SubLSymbol $sym0$_ALEXANDRIA_ALLEGRO_CACHE_KB_STORE_CONTENT__;
    private static final SubLSymbol $sym1$CLET;
    private static final SubLList $list2;
    private static final SubLList $list3;
    private static final SubLSymbol $sym4$JRTL_BOX;
    private static final SubLSymbol $sym5$JRTL_UNBOX;
    private static final SubLSymbol $sym6$JAVA_NEW;
    private static final SubLList $list7;
    private static final SubLSymbol $sym8$JAVA_METHOD;
    private static final SubLList $list9;
    private static final SubLSymbol $sym10$JAVA_STATIC;
    private static final SubLList $list11;
    private static final SubLSymbol $sym12$JAVA_CALL;
    
    @SubLTranslatedFile.SubL(source = "cycl/alexandria-allegro-macros.lisp", position = 1031L)
    public static SubLObject alexandria_allegro_mode_enabledP() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return alexandria_allegro_macros.$alexandria_allegro_mode_enabledP$.getDynamicValue(thread);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/alexandria-allegro-macros.lisp", position = 1370L)
    public static SubLObject alexandria_allegro_cache_kb_store_contentP() {
        return alexandria_allegro_macros.$alexandria_allegro_cache_kb_store_contentP$.getGlobalValue();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/alexandria-allegro-macros.lisp", position = 1653L)
    public static SubLObject suspend_jrtl_object_caching(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return (SubLObject)ConsesLow.listS((SubLObject)alexandria_allegro_macros.$sym1$CLET, (SubLObject)alexandria_allegro_macros.$list2, ConsesLow.append(body, (SubLObject)alexandria_allegro_macros.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/alexandria-allegro-macros.lisp", position = 1769L)
    public static SubLObject jrtl_new(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject v_class = (SubLObject)alexandria_allegro_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)alexandria_allegro_macros.$list3);
        v_class = current.first();
        final SubLObject args;
        current = (args = current.rest());
        SubLObject boxed_args = (SubLObject)alexandria_allegro_macros.NIL;
        SubLObject cdolist_list_var = args;
        SubLObject arg = (SubLObject)alexandria_allegro_macros.NIL;
        arg = cdolist_list_var.first();
        while (alexandria_allegro_macros.NIL != cdolist_list_var) {
            boxed_args = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)alexandria_allegro_macros.$sym4$JRTL_BOX, arg), boxed_args);
            cdolist_list_var = cdolist_list_var.rest();
            arg = cdolist_list_var.first();
        }
        boxed_args = Sequences.nreverse(boxed_args);
        return (SubLObject)ConsesLow.list((SubLObject)alexandria_allegro_macros.$sym5$JRTL_UNBOX, (SubLObject)ConsesLow.listS((SubLObject)alexandria_allegro_macros.$sym6$JAVA_NEW, v_class, ConsesLow.append(boxed_args, (SubLObject)alexandria_allegro_macros.NIL)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/alexandria-allegro-macros.lisp", position = 2198L)
    public static SubLObject jrtl_method(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject v_class = (SubLObject)alexandria_allegro_macros.NIL;
        SubLObject name = (SubLObject)alexandria_allegro_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)alexandria_allegro_macros.$list7);
        v_class = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)alexandria_allegro_macros.$list7);
        name = current.first();
        final SubLObject argsig;
        current = (argsig = current.rest());
        SubLObject boxed_argsig = (SubLObject)alexandria_allegro_macros.NIL;
        SubLObject cdolist_list_var = argsig;
        SubLObject singlesig = (SubLObject)alexandria_allegro_macros.NIL;
        singlesig = cdolist_list_var.first();
        while (alexandria_allegro_macros.NIL != cdolist_list_var) {
            boxed_argsig = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)alexandria_allegro_macros.$sym4$JRTL_BOX, singlesig), boxed_argsig);
            cdolist_list_var = cdolist_list_var.rest();
            singlesig = cdolist_list_var.first();
        }
        boxed_argsig = Sequences.nreverse(boxed_argsig);
        return (SubLObject)ConsesLow.list((SubLObject)alexandria_allegro_macros.$sym5$JRTL_UNBOX, (SubLObject)ConsesLow.listS((SubLObject)alexandria_allegro_macros.$sym8$JAVA_METHOD, v_class, name, ConsesLow.append(boxed_argsig, (SubLObject)alexandria_allegro_macros.NIL)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/alexandria-allegro-macros.lisp", position = 2472L)
    public static SubLObject jrtl_static(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject method = (SubLObject)alexandria_allegro_macros.NIL;
        SubLObject v_class = (SubLObject)alexandria_allegro_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)alexandria_allegro_macros.$list9);
        method = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)alexandria_allegro_macros.$list9);
        v_class = current.first();
        final SubLObject args;
        current = (args = current.rest());
        SubLObject boxed_args = (SubLObject)alexandria_allegro_macros.NIL;
        SubLObject cdolist_list_var = args;
        SubLObject arg = (SubLObject)alexandria_allegro_macros.NIL;
        arg = cdolist_list_var.first();
        while (alexandria_allegro_macros.NIL != cdolist_list_var) {
            boxed_args = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)alexandria_allegro_macros.$sym4$JRTL_BOX, arg), boxed_args);
            cdolist_list_var = cdolist_list_var.rest();
            arg = cdolist_list_var.first();
        }
        boxed_args = Sequences.nreverse(boxed_args);
        return (SubLObject)ConsesLow.list((SubLObject)alexandria_allegro_macros.$sym5$JRTL_UNBOX, (SubLObject)ConsesLow.listS((SubLObject)alexandria_allegro_macros.$sym10$JAVA_STATIC, method, v_class, ConsesLow.append(boxed_args, (SubLObject)alexandria_allegro_macros.NIL)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/alexandria-allegro-macros.lisp", position = 2726L)
    public static SubLObject jrtl_call(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject method = (SubLObject)alexandria_allegro_macros.NIL;
        SubLObject instance = (SubLObject)alexandria_allegro_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)alexandria_allegro_macros.$list11);
        method = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)alexandria_allegro_macros.$list11);
        instance = current.first();
        final SubLObject args;
        current = (args = current.rest());
        SubLObject boxed_args = (SubLObject)alexandria_allegro_macros.NIL;
        SubLObject cdolist_list_var = args;
        SubLObject arg = (SubLObject)alexandria_allegro_macros.NIL;
        arg = cdolist_list_var.first();
        while (alexandria_allegro_macros.NIL != cdolist_list_var) {
            boxed_args = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)alexandria_allegro_macros.$sym4$JRTL_BOX, arg), boxed_args);
            cdolist_list_var = cdolist_list_var.rest();
            arg = cdolist_list_var.first();
        }
        boxed_args = Sequences.nreverse(boxed_args);
        return (SubLObject)ConsesLow.list((SubLObject)alexandria_allegro_macros.$sym5$JRTL_UNBOX, (SubLObject)ConsesLow.listS((SubLObject)alexandria_allegro_macros.$sym12$JAVA_CALL, method, instance, ConsesLow.append(boxed_args, (SubLObject)alexandria_allegro_macros.NIL)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/alexandria-allegro-macros.lisp", position = 2980L)
    public static SubLObject symbol_value_to_el_string(final SubLObject symbol_string) {
        final SubLObject symbol = Packages.find_symbol(Strings.string_upcase(symbol_string, (SubLObject)alexandria_allegro_macros.UNPROVIDED, (SubLObject)alexandria_allegro_macros.UNPROVIDED), (SubLObject)alexandria_allegro_macros.UNPROVIDED);
        final SubLObject value = (SubLObject)((alexandria_allegro_macros.NIL != Symbols.boundp(symbol)) ? Symbols.symbol_value(symbol) : alexandria_allegro_macros.NIL);
        final SubLObject el_value = (SubLObject)((alexandria_allegro_macros.NIL != value) ? cycl_utilities.hl_to_el(value) : alexandria_allegro_macros.NIL);
        final SubLObject el_value_string = print_high.princ_to_string(el_value);
        return el_value_string;
    }
    
    public static SubLObject declare_alexandria_allegro_macros_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.alexandria_allegro_macros", "alexandria_allegro_mode_enabledP", "ALEXANDRIA-ALLEGRO-MODE-ENABLED?", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.alexandria_allegro_macros", "alexandria_allegro_cache_kb_store_contentP", "ALEXANDRIA-ALLEGRO-CACHE-KB-STORE-CONTENT?", 0, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.alexandria_allegro_macros", "suspend_jrtl_object_caching", "SUSPEND-JRTL-OBJECT-CACHING");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.alexandria_allegro_macros", "jrtl_new", "JRTL-NEW");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.alexandria_allegro_macros", "jrtl_method", "JRTL-METHOD");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.alexandria_allegro_macros", "jrtl_static", "JRTL-STATIC");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.alexandria_allegro_macros", "jrtl_call", "JRTL-CALL");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.alexandria_allegro_macros", "symbol_value_to_el_string", "SYMBOL-VALUE-TO-EL-STRING", 1, 0, false);
        return (SubLObject)alexandria_allegro_macros.NIL;
    }
    
    public static SubLObject init_alexandria_allegro_macros_file() {
        alexandria_allegro_macros.$alexandria_allegro_mode_enabledP$ = SubLFiles.defparameter("*ALEXANDRIA-ALLEGRO-MODE-ENABLED?*", (SubLObject)alexandria_allegro_macros.NIL);
        alexandria_allegro_macros.$alexandria_allegro_cache_kb_store_contentP$ = SubLFiles.deflexical("*ALEXANDRIA-ALLEGRO-CACHE-KB-STORE-CONTENT?*", (SubLObject)(maybeDefault((SubLObject)alexandria_allegro_macros.$sym0$_ALEXANDRIA_ALLEGRO_CACHE_KB_STORE_CONTENT__, alexandria_allegro_macros.$alexandria_allegro_cache_kb_store_contentP$, alexandria_allegro_macros.NIL)));
        alexandria_allegro_macros.$suspend_jrtl_object_cachingP$ = SubLFiles.defparameter("*SUSPEND-JRTL-OBJECT-CACHING?*", (SubLObject)alexandria_allegro_macros.NIL);
        return (SubLObject)alexandria_allegro_macros.NIL;
    }
    
    public static SubLObject setup_alexandria_allegro_macros_file() {
        subl_macro_promotions.declare_defglobal((SubLObject)alexandria_allegro_macros.$sym0$_ALEXANDRIA_ALLEGRO_CACHE_KB_STORE_CONTENT__);
        return (SubLObject)alexandria_allegro_macros.NIL;
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
        me = (SubLFile)new alexandria_allegro_macros();
        alexandria_allegro_macros.$alexandria_allegro_mode_enabledP$ = null;
        alexandria_allegro_macros.$alexandria_allegro_cache_kb_store_contentP$ = null;
        alexandria_allegro_macros.$suspend_jrtl_object_cachingP$ = null;
        $sym0$_ALEXANDRIA_ALLEGRO_CACHE_KB_STORE_CONTENT__ = SubLObjectFactory.makeSymbol("*ALEXANDRIA-ALLEGRO-CACHE-KB-STORE-CONTENT?*");
        $sym1$CLET = SubLObjectFactory.makeSymbol("CLET");
        $list2 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*SUSPEND-JRTL-OBJECT-CACHING?*"), (SubLObject)alexandria_allegro_macros.T));
        $list3 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLASS"), (SubLObject)SubLObjectFactory.makeSymbol("&REST"), (SubLObject)SubLObjectFactory.makeSymbol("ARGS"));
        $sym4$JRTL_BOX = SubLObjectFactory.makeSymbol("JRTL-BOX");
        $sym5$JRTL_UNBOX = SubLObjectFactory.makeSymbol("JRTL-UNBOX");
        $sym6$JAVA_NEW = SubLObjectFactory.makeSymbol("JAVA-NEW");
        $list7 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLASS"), (SubLObject)SubLObjectFactory.makeSymbol("NAME"), (SubLObject)SubLObjectFactory.makeSymbol("&REST"), (SubLObject)SubLObjectFactory.makeSymbol("ARGSIG"));
        $sym8$JAVA_METHOD = SubLObjectFactory.makeSymbol("JAVA-METHOD");
        $list9 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("CLASS"), (SubLObject)SubLObjectFactory.makeSymbol("&REST"), (SubLObject)SubLObjectFactory.makeSymbol("ARGS"));
        $sym10$JAVA_STATIC = SubLObjectFactory.makeSymbol("JAVA-STATIC");
        $list11 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("INSTANCE"), (SubLObject)SubLObjectFactory.makeSymbol("&REST"), (SubLObject)SubLObjectFactory.makeSymbol("ARGS"));
        $sym12$JAVA_CALL = SubLObjectFactory.makeSymbol("JAVA-CALL");
    }
}

/*

	Total time: 31 ms
	
*/