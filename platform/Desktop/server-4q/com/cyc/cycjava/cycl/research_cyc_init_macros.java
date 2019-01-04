package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import java.util.Iterator;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Packages;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class research_cyc_init_macros extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.research_cyc_init_macros";
    public static final String myFingerPrint = "787ebf95729593146a51989abab4d1c86003c81069b92604dd119b535d2d38ed";
    private static final SubLString $str0$CYC;
    private static final SubLInteger $int1$4096;
    private static final SubLList $list2;
    private static final SubLList $list3;
    private static final SubLSymbol $sym4$METHOD_FORMAL_ARGLIST;
    
    @SubLTranslatedFile.SubL(source = "cycl/research-cyc-init-macros.lisp", position = 888L)
    public static SubLObject compute_research_cyc_initialization_methods(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        if (research_cyc_init_macros.NIL != datum) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)research_cyc_init_macros.NIL);
        }
        final SubLObject symbol_set = set.new_set(Symbols.symbol_function((SubLObject)research_cyc_init_macros.EQ), (SubLObject)research_cyc_init_macros.UNPROVIDED);
        final SubLObject cdo_symbols_package = Packages.find_package((SubLObject)research_cyc_init_macros.$str0$CYC);
        final SubLObject cdo_symbols_iterator = (SubLObject)research_cyc_init_macros.NIL;
        SubLObject symbol = (SubLObject)research_cyc_init_macros.NIL;
        final Iterator cdo_symbols_iterator_$1 = Packages.makeSymbolIterator(cdo_symbols_package);
        while (Packages.symbolIteratorHasNext(cdo_symbols_iterator_$1)) {
            symbol = Packages.symbolIteratorNext(cdo_symbols_iterator_$1);
            if (research_cyc_init_macros.NIL != function_symbol_with_no_args_p(symbol)) {
                set.set_add(symbol, symbol_set);
            }
        }
        SubLObject initialization_methods = (SubLObject)research_cyc_init_macros.NIL;
        SubLObject i;
        for (i = (SubLObject)research_cyc_init_macros.NIL, i = (SubLObject)research_cyc_init_macros.ZERO_INTEGER; i.numL((SubLObject)research_cyc_init_macros.$int1$4096); i = Numbers.add(i, (SubLObject)research_cyc_init_macros.ONE_INTEGER)) {
            initialization_methods = (SubLObject)ConsesLow.cons(set.set_random_element(symbol_set), initialization_methods);
        }
        SubLObject cdolist_list_var;
        final SubLObject class_table = cdolist_list_var = (SubLObject)research_cyc_init_macros.$list2;
        SubLObject class_info = (SubLObject)research_cyc_init_macros.NIL;
        class_info = cdolist_list_var.first();
        while (research_cyc_init_macros.NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum_$2 = current = class_info;
            SubLObject positions = (SubLObject)research_cyc_init_macros.NIL;
            SubLObject choices = (SubLObject)research_cyc_init_macros.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum_$2, (SubLObject)research_cyc_init_macros.$list3);
            positions = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum_$2, (SubLObject)research_cyc_init_macros.$list3);
            choices = current.first();
            current = current.rest();
            if (research_cyc_init_macros.NIL == current) {
                SubLObject cdolist_list_var_$3 = positions;
                SubLObject position = (SubLObject)research_cyc_init_macros.NIL;
                position = cdolist_list_var_$3.first();
                while (research_cyc_init_macros.NIL != cdolist_list_var_$3) {
                    ConsesLow.set_nth(position, initialization_methods, list_utilities.random_element(choices));
                    cdolist_list_var_$3 = cdolist_list_var_$3.rest();
                    position = cdolist_list_var_$3.first();
                }
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(datum_$2, (SubLObject)research_cyc_init_macros.$list3);
            }
            cdolist_list_var = cdolist_list_var.rest();
            class_info = cdolist_list_var.first();
        }
        return list_utilities.quotify(initialization_methods);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/research-cyc-init-macros.lisp", position = 4535L)
    public static SubLObject function_symbol_with_no_args_p(final SubLObject v_object) {
        if (research_cyc_init_macros.NIL != subl_promotions.function_symbol_p(v_object)) {
            final SubLObject arglist = (research_cyc_init_macros.NIL != Symbols.fboundp((SubLObject)research_cyc_init_macros.$sym4$METHOD_FORMAL_ARGLIST)) ? xref_database.method_formal_arglist(v_object) : subl_promotions.function_symbol_arglist(v_object);
            return Types.sublisp_null(arglist);
        }
        return (SubLObject)research_cyc_init_macros.NIL;
    }
    
    public static SubLObject declare_research_cyc_init_macros_file() {
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.research_cyc_init_macros", "compute_research_cyc_initialization_methods", "COMPUTE-RESEARCH-CYC-INITIALIZATION-METHODS");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.research_cyc_init_macros", "function_symbol_with_no_args_p", "FUNCTION-SYMBOL-WITH-NO-ARGS-P", 1, 0, false);
        return (SubLObject)research_cyc_init_macros.NIL;
    }
    
    public static SubLObject init_research_cyc_init_macros_file() {
        return (SubLObject)research_cyc_init_macros.NIL;
    }
    
    public static SubLObject setup_research_cyc_init_macros_file() {
        return (SubLObject)research_cyc_init_macros.NIL;
    }
    
    public void declareFunctions() {
        declare_research_cyc_init_macros_file();
    }
    
    public void initializeVariables() {
        init_research_cyc_init_macros_file();
    }
    
    public void runTopLevelForms() {
        setup_research_cyc_init_macros_file();
    }
    
    static {
        me = (SubLFile)new research_cyc_init_macros();
        $str0$CYC = SubLObjectFactory.makeString("CYC");
        $int1$4096 = SubLObjectFactory.makeInteger(4096);
        $list2 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)research_cyc_init_macros.ZERO_INTEGER), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RESEARCH-CYC-LICENSE-KEY-ERROR"))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeInteger(3622), SubLObjectFactory.makeInteger(2379), SubLObjectFactory.makeInteger(874), SubLObjectFactory.makeInteger(3729), SubLObjectFactory.makeInteger(3456), SubLObjectFactory.makeInteger(2344), SubLObjectFactory.makeInteger(1538), SubLObjectFactory.makeInteger(3655), SubLObjectFactory.makeInteger(1856), SubLObjectFactory.makeInteger(2951), SubLObjectFactory.makeInteger(3458), SubLObjectFactory.makeInteger(444), SubLObjectFactory.makeInteger(2275), SubLObjectFactory.makeInteger(3141), SubLObjectFactory.makeInteger(3339), SubLObjectFactory.makeInteger(2018) }), (SubLObject)ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("UNSTASH-KB-OBJECT-LOOKUP-VARS"), SubLObjectFactory.makeSymbol("UNSTASH-KB-OBJECT-LOOKUP-VARS-1"), SubLObjectFactory.makeSymbol("UNSTASH-KB-OBJECT-LOOKUP-VARS-2"), SubLObjectFactory.makeSymbol("UNSTASH-KB-OBJECT-LOOKUP-VARS-3"), SubLObjectFactory.makeSymbol("UNSTASH-KB-OBJECT-LOOKUP-VARS-4"), SubLObjectFactory.makeSymbol("UNSTASH-KB-OBJECT-LOOKUP-VARS-5"), SubLObjectFactory.makeSymbol("UNSTASH-KB-OBJECT-LOOKUP-VARS-6"), SubLObjectFactory.makeSymbol("UNSTASH-KB-OBJECT-LOOKUP-VARS-7"), SubLObjectFactory.makeSymbol("UNSTASH-KB-OBJECT-LOOKUP-VARS-8"), SubLObjectFactory.makeSymbol("UNSTASH-KB-OBJECT-LOOKUP-VARS-9"), SubLObjectFactory.makeSymbol("UNSTASH-KB-OBJECT-LOOKUP-VARS-10"), SubLObjectFactory.makeSymbol("UNSTASH-KB-OBJECT-LOOKUP-VARS-11"), SubLObjectFactory.makeSymbol("UNSTASH-KB-OBJECT-LOOKUP-VARS-12"), SubLObjectFactory.makeSymbol("UNSTASH-KB-OBJECT-LOOKUP-VARS-13"), SubLObjectFactory.makeSymbol("UNSTASH-KB-OBJECT-LOOKUP-VARS-14"), SubLObjectFactory.makeSymbol("UNSTASH-KB-OBJECT-LOOKUP-VARS-15") })), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeInteger(400), SubLObjectFactory.makeInteger(471), SubLObjectFactory.makeInteger(2535), SubLObjectFactory.makeInteger(317), SubLObjectFactory.makeInteger(2086), SubLObjectFactory.makeInteger(509), SubLObjectFactory.makeInteger(251), SubLObjectFactory.makeInteger(2454), SubLObjectFactory.makeInteger(3364), SubLObjectFactory.makeInteger(3144), SubLObjectFactory.makeInteger(1176), SubLObjectFactory.makeInteger(2559), SubLObjectFactory.makeInteger(3014), SubLObjectFactory.makeInteger(212), SubLObjectFactory.makeInteger(1091), SubLObjectFactory.makeInteger(2890) }), (SubLObject)ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("UNSTASH-KB-OBJECT-CONTENT-VARS"), SubLObjectFactory.makeSymbol("UNSTASH-KB-OBJECT-CONTENT-VARS-1"), SubLObjectFactory.makeSymbol("UNSTASH-KB-OBJECT-CONTENT-VARS-2"), SubLObjectFactory.makeSymbol("UNSTASH-KB-OBJECT-CONTENT-VARS-3"), SubLObjectFactory.makeSymbol("UNSTASH-KB-OBJECT-CONTENT-VARS-4"), SubLObjectFactory.makeSymbol("UNSTASH-KB-OBJECT-CONTENT-VARS-5"), SubLObjectFactory.makeSymbol("UNSTASH-KB-OBJECT-CONTENT-VARS-6"), SubLObjectFactory.makeSymbol("UNSTASH-KB-OBJECT-CONTENT-VARS-7"), SubLObjectFactory.makeSymbol("UNSTASH-KB-OBJECT-CONTENT-VARS-8"), SubLObjectFactory.makeSymbol("UNSTASH-KB-OBJECT-CONTENT-VARS-9"), SubLObjectFactory.makeSymbol("UNSTASH-KB-OBJECT-CONTENT-VARS-10"), SubLObjectFactory.makeSymbol("UNSTASH-KB-OBJECT-CONTENT-VARS-11"), SubLObjectFactory.makeSymbol("UNSTASH-KB-OBJECT-CONTENT-VARS-12"), SubLObjectFactory.makeSymbol("UNSTASH-KB-OBJECT-CONTENT-VARS-13"), SubLObjectFactory.makeSymbol("UNSTASH-KB-OBJECT-CONTENT-VARS-14"), SubLObjectFactory.makeSymbol("UNSTASH-KB-OBJECT-CONTENT-VARS-15") })), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeInteger(1738), SubLObjectFactory.makeInteger(371), SubLObjectFactory.makeInteger(3974), SubLObjectFactory.makeInteger(1927), SubLObjectFactory.makeInteger(543), SubLObjectFactory.makeInteger(762), SubLObjectFactory.makeInteger(79), SubLObjectFactory.makeInteger(3025), SubLObjectFactory.makeInteger(2151), SubLObjectFactory.makeInteger(2940), SubLObjectFactory.makeInteger(1380), SubLObjectFactory.makeInteger(270), SubLObjectFactory.makeInteger(2995), SubLObjectFactory.makeInteger(1066), SubLObjectFactory.makeInteger(315), SubLObjectFactory.makeInteger(3286) }), (SubLObject)ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("UNSTASH-KB-INDEXING-VARS"), SubLObjectFactory.makeSymbol("UNSTASH-KB-INDEXING-VARS-1"), SubLObjectFactory.makeSymbol("UNSTASH-KB-INDEXING-VARS-2"), SubLObjectFactory.makeSymbol("UNSTASH-KB-INDEXING-VARS-3"), SubLObjectFactory.makeSymbol("UNSTASH-KB-INDEXING-VARS-4"), SubLObjectFactory.makeSymbol("UNSTASH-KB-INDEXING-VARS-5"), SubLObjectFactory.makeSymbol("UNSTASH-KB-INDEXING-VARS-6"), SubLObjectFactory.makeSymbol("UNSTASH-KB-INDEXING-VARS-7"), SubLObjectFactory.makeSymbol("UNSTASH-KB-INDEXING-VARS-8"), SubLObjectFactory.makeSymbol("UNSTASH-KB-INDEXING-VARS-9"), SubLObjectFactory.makeSymbol("UNSTASH-KB-INDEXING-VARS-10"), SubLObjectFactory.makeSymbol("UNSTASH-KB-INDEXING-VARS-11"), SubLObjectFactory.makeSymbol("UNSTASH-KB-INDEXING-VARS-12"), SubLObjectFactory.makeSymbol("UNSTASH-KB-INDEXING-VARS-13"), SubLObjectFactory.makeSymbol("UNSTASH-KB-INDEXING-VARS-14"), SubLObjectFactory.makeSymbol("UNSTASH-KB-INDEXING-VARS-15") })), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeInteger(319), SubLObjectFactory.makeInteger(3892), SubLObjectFactory.makeInteger(975), SubLObjectFactory.makeInteger(1249), SubLObjectFactory.makeInteger(1059), SubLObjectFactory.makeInteger(1062), SubLObjectFactory.makeInteger(3937), research_cyc_init_macros.FOUR_INTEGER, SubLObjectFactory.makeInteger(3166), SubLObjectFactory.makeInteger(3946), SubLObjectFactory.makeInteger(4073), SubLObjectFactory.makeInteger(2987), SubLObjectFactory.makeInteger(2637), SubLObjectFactory.makeInteger(3274), SubLObjectFactory.makeInteger(2400), SubLObjectFactory.makeInteger(3092) }), (SubLObject)ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("UNSTASH-INFERENCE-VARS"), SubLObjectFactory.makeSymbol("UNSTASH-INFERENCE-VARS-1"), SubLObjectFactory.makeSymbol("UNSTASH-INFERENCE-VARS-2"), SubLObjectFactory.makeSymbol("UNSTASH-INFERENCE-VARS-3"), SubLObjectFactory.makeSymbol("UNSTASH-INFERENCE-VARS-4"), SubLObjectFactory.makeSymbol("UNSTASH-INFERENCE-VARS-5"), SubLObjectFactory.makeSymbol("UNSTASH-INFERENCE-VARS-6"), SubLObjectFactory.makeSymbol("UNSTASH-INFERENCE-VARS-7"), SubLObjectFactory.makeSymbol("UNSTASH-INFERENCE-VARS-8"), SubLObjectFactory.makeSymbol("UNSTASH-INFERENCE-VARS-9"), SubLObjectFactory.makeSymbol("UNSTASH-INFERENCE-VARS-10"), SubLObjectFactory.makeSymbol("UNSTASH-INFERENCE-VARS-11"), SubLObjectFactory.makeSymbol("UNSTASH-INFERENCE-VARS-12"), SubLObjectFactory.makeSymbol("UNSTASH-INFERENCE-VARS-13"), SubLObjectFactory.makeSymbol("UNSTASH-INFERENCE-VARS-14"), SubLObjectFactory.makeSymbol("UNSTASH-INFERENCE-VARS-15") })), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeInteger(2392), SubLObjectFactory.makeInteger(2253), SubLObjectFactory.makeInteger(3022), SubLObjectFactory.makeInteger(2648), SubLObjectFactory.makeInteger(634), SubLObjectFactory.makeInteger(403), SubLObjectFactory.makeInteger(505), SubLObjectFactory.makeInteger(1872), SubLObjectFactory.makeInteger(3087), SubLObjectFactory.makeInteger(827), SubLObjectFactory.makeInteger(3890), SubLObjectFactory.makeInteger(1932), SubLObjectFactory.makeInteger(3377), SubLObjectFactory.makeInteger(2071), SubLObjectFactory.makeInteger(730), SubLObjectFactory.makeInteger(1127) }), (SubLObject)ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("UNSTASH-OTHER-VARS"), SubLObjectFactory.makeSymbol("UNSTASH-OTHER-VARS-1"), SubLObjectFactory.makeSymbol("UNSTASH-OTHER-VARS-2"), SubLObjectFactory.makeSymbol("UNSTASH-OTHER-VARS-3"), SubLObjectFactory.makeSymbol("UNSTASH-OTHER-VARS-4"), SubLObjectFactory.makeSymbol("UNSTASH-OTHER-VARS-5"), SubLObjectFactory.makeSymbol("UNSTASH-OTHER-VARS-6"), SubLObjectFactory.makeSymbol("UNSTASH-OTHER-VARS-7"), SubLObjectFactory.makeSymbol("UNSTASH-OTHER-VARS-8"), SubLObjectFactory.makeSymbol("UNSTASH-OTHER-VARS-9"), SubLObjectFactory.makeSymbol("UNSTASH-OTHER-VARS-10"), SubLObjectFactory.makeSymbol("UNSTASH-OTHER-VARS-11"), SubLObjectFactory.makeSymbol("UNSTASH-OTHER-VARS-12"), SubLObjectFactory.makeSymbol("UNSTASH-OTHER-VARS-13"), SubLObjectFactory.makeSymbol("UNSTASH-OTHER-VARS-14"), SubLObjectFactory.makeSymbol("UNSTASH-OTHER-VARS-15") })));
        $list3 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("POSITIONS"), (SubLObject)SubLObjectFactory.makeSymbol("CHOICES"));
        $sym4$METHOD_FORMAL_ARGLIST = SubLObjectFactory.makeSymbol("METHOD-FORMAL-ARGLIST");
    }
}

/*

	Total time: 79 ms
	
*/