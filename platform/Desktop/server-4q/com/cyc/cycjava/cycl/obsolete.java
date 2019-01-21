package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class obsolete extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.obsolete";
    public static final String myFingerPrint = "d78a5b58569f74e31ad851a2d2c15f0e379ed7a90f789a9f7f75c7fc99ea2dbc";
    private static final SubLSymbol $sym0$NAT_P;
    private static final SubLList $list1;
    private static final SubLString $str2$NAT_P_is_obsolete___use_NART_P_or;
    private static final SubLSymbol $sym3$FIND_NAT;
    private static final SubLList $list4;
    private static final SubLString $str5$FIND_NAT_is_obsolete___use_FIND_N;
    private static final SubLSymbol $sym6$CYCL_SYSTEM_NUMBER;
    private static final SubLList $list7;
    private static final SubLSymbol $sym8$CYCL_PATCH_NUMBER;
    private static final SubLSymbol $sym9$EL_TEMPLATE_ARG_;
    private static final SubLList $list10;
    private static final SubLSymbol $sym11$NAT_;
    private static final SubLList $list12;
    private static final SubLSymbol $sym13$EL_VAR_;
    private static final SubLSymbol $sym14$RELATIONSHIP_;
    private static final SubLList $list15;
    private static final SubLSymbol $sym16$REIFIED_NAT_;
    private static final SubLList $list17;
    private static final SubLSymbol $sym18$REIFIABLE_NAT_;
    private static final SubLList $list19;
    private static final SubLSymbol $sym20$CYC_VAR_;
    private static final SubLSymbol $sym21$KB_NAT_;
    private static final SubLList $list22;
    private static final SubLSymbol $sym23$VARIABLE_P;
    private static final SubLSymbol $sym24$NAUT_IN_MT_;
    private static final SubLSymbol $sym25$RELEVANT_MT_IS_GENL_MT;
    private static final SubLSymbol $sym26$GNAT_;
    private static final SubLList $list27;
    private static final SubLSymbol $sym28$GNAT_P;
    private static final SubLList $list29;
    private static final SubLSymbol $sym30$FIND_GNAT;
    private static final SubLList $list31;
    private static final SubLSymbol $sym32$CNAT_P;
    private static final SubLList $list33;
    private static final SubLSymbol $sym34$CLOSED_NAT_P;
    private static final SubLSymbol $sym35$REIFY_ARG_WHEN_CNAT;
    private static final SubLList $list36;
    private static final SubLSymbol $sym37$REIFY_WHEN_CNAT;
    private static final SubLList $list38;
    private static final SubLSymbol $sym39$FORTIFY;
    private static final SubLSymbol $sym40$FIND_WHEN_CNAT;
    private static final SubLList $list41;
    private static final SubLSymbol $sym42$FIND_CNAT;
    private static final SubLList $list43;
    private static final SubLSymbol $sym44$OPEN_NAT_P;
    private static final SubLList $list45;
    private static final SubLSymbol $sym46$FO_NAT_;
    private static final SubLList $list47;
    private static final SubLSymbol $sym48$NAT_NOT_GNAT;
    private static final SubLList $list49;
    private static final SubLSymbol $sym50$FORMULA_FREE_VARIABLES;
    private static final SubLList $list51;
    private static final SubLSymbol $sym52$FORMULA_VARIABLES;
    private static final SubLList $list53;
    private static final SubLSymbol $sym54$COMPLETE_COLLECTION_EXTENT;
    private static final SubLList $list55;
    private static final SubLSymbol $sym56$COMPLETE_EXTENT_KNOWN;
    private static final SubLList $list57;
    private static final SubLSymbol $sym58$BOOLEAN_;
    private static final SubLList $list59;
    
    @SubLTranslatedFile.SubL(source = "cycl/obsolete.lisp", position = 799L)
    public static SubLObject nat_p(final SubLObject v_object) {
        Errors.warn((SubLObject)obsolete.$str2$NAT_P_is_obsolete___use_NART_P_or);
        return nart_handles.nart_p(v_object);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/obsolete.lisp", position = 1203L)
    public static SubLObject find_nat(final SubLObject nat_formula) {
        Errors.warn((SubLObject)obsolete.$str5$FIND_NAT_is_obsolete___use_FIND_N);
        return narts_high.find_nart(nat_formula);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/obsolete.lisp", position = 1380L)
    public static SubLObject cycl_system_number() {
        final SubLObject number = system_info.cyc_revision_numbers().first();
        return (SubLObject)(number.isInteger() ? number : obsolete.ZERO_INTEGER);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/obsolete.lisp", position = 1616L)
    public static SubLObject cycl_patch_number() {
        final SubLObject number = conses_high.second(system_info.cyc_revision_numbers());
        return (SubLObject)(number.isInteger() ? number : obsolete.ZERO_INTEGER);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/obsolete.lisp", position = 1831L)
    public static SubLObject el_template_argP(final SubLObject relation, final SubLObject argnum, SubLObject mt) {
        if (mt == obsolete.UNPROVIDED) {
            mt = (SubLObject)obsolete.NIL;
        }
        if (argnum.numG((SubLObject)obsolete.ZERO_INTEGER)) {
            return czer_utilities.leave_some_terms_at_el_for_argP(relation, argnum, mt);
        }
        return (SubLObject)obsolete.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/obsolete.lisp", position = 2308L)
    public static SubLObject natP(final SubLObject nat, SubLObject varP) {
        if (varP == obsolete.UNPROVIDED) {
            varP = Symbols.symbol_function((SubLObject)obsolete.$sym13$EL_VAR_);
        }
        return term.nautP(nat, varP);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/obsolete.lisp", position = 2414L)
    public static SubLObject relationshipP(final SubLObject v_object) {
        return kb_accessors.relationP(v_object);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/obsolete.lisp", position = 2511L)
    public static SubLObject reified_natP(final SubLObject v_term) {
        return czer_utilities.naut_with_corresponding_nartP(v_term);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/obsolete.lisp", position = 2643L)
    public static SubLObject reifiable_natP(final SubLObject v_term, SubLObject varP, SubLObject mt) {
        if (varP == obsolete.UNPROVIDED) {
            varP = Symbols.symbol_function((SubLObject)obsolete.$sym20$CYC_VAR_);
        }
        if (mt == obsolete.UNPROVIDED) {
            mt = (SubLObject)obsolete.NIL;
        }
        return czer_utilities.reifiable_nautP(v_term, varP, mt);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/obsolete.lisp", position = 2788L)
    public static SubLObject kb_natP(final SubLObject nat, SubLObject varP) {
        if (varP == obsolete.UNPROVIDED) {
            varP = Symbols.symbol_function((SubLObject)obsolete.$sym23$VARIABLE_P);
        }
        return term.kb_nautP(nat, varP);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/obsolete.lisp", position = 2906L)
    public static SubLObject naut_in_mtP(final SubLObject v_object, SubLObject mt, SubLObject varP) {
        if (mt == obsolete.UNPROVIDED) {
            mt = (SubLObject)obsolete.NIL;
        }
        if (varP == obsolete.UNPROVIDED) {
            varP = Symbols.symbol_function((SubLObject)obsolete.$sym13$EL_VAR_);
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject nautP = (SubLObject)obsolete.NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)obsolete.$sym25$RELEVANT_MT_IS_GENL_MT, thread);
            mt_relevance_macros.$mt$.bind(mt, thread);
            nautP = term.nautP(v_object, varP);
        }
        finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return nautP;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/obsolete.lisp", position = 3088L)
    public static SubLObject gnatP(final SubLObject nat, SubLObject varP) {
        if (varP == obsolete.UNPROVIDED) {
            varP = Symbols.symbol_function((SubLObject)obsolete.$sym20$CYC_VAR_);
        }
        return term.ground_nautP(nat, varP);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/obsolete.lisp", position = 3210L)
    public static SubLObject gnat_p(final SubLObject nat) {
        return term.hl_ground_nautP(nat);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/obsolete.lisp", position = 3354L)
    public static SubLObject find_gnat(final SubLObject v_object) {
        return cycl_utilities.find_ground_naut(v_object);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/obsolete.lisp", position = 3461L)
    public static SubLObject cnat_p(final SubLObject v_object, SubLObject varP) {
        if (varP == obsolete.UNPROVIDED) {
            varP = Symbols.symbol_function((SubLObject)obsolete.$sym20$CYC_VAR_);
        }
        return term.closed_nautP(v_object, varP);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/obsolete.lisp", position = 3590L)
    public static SubLObject closed_nat_p(final SubLObject v_object, SubLObject varP) {
        if (varP == obsolete.UNPROVIDED) {
            varP = Symbols.symbol_function((SubLObject)obsolete.$sym20$CYC_VAR_);
        }
        return term.closed_nautP(v_object, varP);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/obsolete.lisp", position = 3725L)
    public static SubLObject reify_arg_when_cnat(final SubLObject reln, final SubLObject psn) {
        return cycl_utilities.reify_arg_when_closed_naut(reln, psn);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/obsolete.lisp", position = 3866L)
    public static SubLObject reify_when_cnat(final SubLObject v_object) {
        return cycl_utilities.reify_when_closed_naut(v_object);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/obsolete.lisp", position = 3991L)
    public static SubLObject fortify(final SubLObject v_object) {
        return cycl_utilities.reify_when_closed_naut(v_object);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/obsolete.lisp", position = 4108L)
    public static SubLObject find_when_cnat(final SubLObject v_object) {
        return cycl_utilities.find_when_closed_naut(v_object);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/obsolete.lisp", position = 4230L)
    public static SubLObject find_cnat(final SubLObject v_object) {
        return cycl_utilities.find_closed_naut(v_object);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/obsolete.lisp", position = 4337L)
    public static SubLObject open_nat_p(final SubLObject v_object, SubLObject varP) {
        if (varP == obsolete.UNPROVIDED) {
            varP = Symbols.symbol_function((SubLObject)obsolete.$sym20$CYC_VAR_);
        }
        return term.open_nautP(v_object, varP);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/obsolete.lisp", position = 4466L)
    public static SubLObject fo_natP(final SubLObject v_object) {
        return term.first_order_nautP(v_object);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/obsolete.lisp", position = 4573L)
    public static SubLObject nat_not_gnat(final SubLObject nat, SubLObject varP) {
        if (varP == obsolete.UNPROVIDED) {
            varP = Symbols.symbol_function((SubLObject)obsolete.$sym13$EL_VAR_);
        }
        return term.unground_nautP(nat, varP);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/obsolete.lisp", position = 4705L)
    public static SubLObject formula_free_variables(final SubLObject formula, SubLObject bound_vars, SubLObject varP, SubLObject include_sequence_varsP) {
        if (bound_vars == obsolete.UNPROVIDED) {
            bound_vars = (SubLObject)obsolete.NIL;
        }
        if (varP == obsolete.UNPROVIDED) {
            varP = (SubLObject)obsolete.$sym20$CYC_VAR_;
        }
        if (include_sequence_varsP == obsolete.UNPROVIDED) {
            include_sequence_varsP = (SubLObject)obsolete.T;
        }
        return el_utilities.sentence_free_variables(formula, bound_vars, varP, include_sequence_varsP);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/obsolete.lisp", position = 4945L)
    public static SubLObject formula_variables(final SubLObject formula, SubLObject varP, SubLObject include_sequence_varsP) {
        if (varP == obsolete.UNPROVIDED) {
            varP = (SubLObject)obsolete.$sym20$CYC_VAR_;
        }
        if (include_sequence_varsP == obsolete.UNPROVIDED) {
            include_sequence_varsP = (SubLObject)obsolete.T;
        }
        return el_utilities.sentence_variables(formula, varP, include_sequence_varsP);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/obsolete.lisp", position = 5148L)
    public static SubLObject complete_collection_extent(final SubLObject collection, SubLObject mt) {
        if (mt == obsolete.UNPROVIDED) {
            mt = (SubLObject)obsolete.NIL;
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(obsolete.NIL != forts.fort_p(collection) && obsolete.NIL != kb_accessors.completely_enumerable_collectionP(collection, mt));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/obsolete.lisp", position = 5385L)
    public static SubLObject complete_extent_known(final SubLObject predicate, SubLObject mt) {
        if (mt == obsolete.UNPROVIDED) {
            mt = (SubLObject)obsolete.NIL;
        }
        return kb_accessors.complete_extent_enumerableP(predicate, mt);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/obsolete.lisp", position = 5548L)
    public static SubLObject booleanP(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(obsolete.NIL == v_object || v_object == obsolete.T);
    }
    
    public static SubLObject declare_obsolete_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.obsolete", "nat_p", "NAT-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.obsolete", "find_nat", "FIND-NAT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.obsolete", "cycl_system_number", "CYCL-SYSTEM-NUMBER", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.obsolete", "cycl_patch_number", "CYCL-PATCH-NUMBER", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.obsolete", "el_template_argP", "EL-TEMPLATE-ARG?", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.obsolete", "natP", "NAT?", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.obsolete", "relationshipP", "RELATIONSHIP?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.obsolete", "reified_natP", "REIFIED-NAT?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.obsolete", "reifiable_natP", "REIFIABLE-NAT?", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.obsolete", "kb_natP", "KB-NAT?", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.obsolete", "naut_in_mtP", "NAUT-IN-MT?", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.obsolete", "gnatP", "GNAT?", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.obsolete", "gnat_p", "GNAT-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.obsolete", "find_gnat", "FIND-GNAT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.obsolete", "cnat_p", "CNAT-P", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.obsolete", "closed_nat_p", "CLOSED-NAT-P", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.obsolete", "reify_arg_when_cnat", "REIFY-ARG-WHEN-CNAT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.obsolete", "reify_when_cnat", "REIFY-WHEN-CNAT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.obsolete", "fortify", "FORTIFY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.obsolete", "find_when_cnat", "FIND-WHEN-CNAT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.obsolete", "find_cnat", "FIND-CNAT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.obsolete", "open_nat_p", "OPEN-NAT-P", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.obsolete", "fo_natP", "FO-NAT?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.obsolete", "nat_not_gnat", "NAT-NOT-GNAT", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.obsolete", "formula_free_variables", "FORMULA-FREE-VARIABLES", 1, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.obsolete", "formula_variables", "FORMULA-VARIABLES", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.obsolete", "complete_collection_extent", "COMPLETE-COLLECTION-EXTENT", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.obsolete", "complete_extent_known", "COMPLETE-EXTENT-KNOWN", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.obsolete", "booleanP", "BOOLEAN?", 1, 0, false);
        return (SubLObject)obsolete.NIL;
    }
    
    public static SubLObject init_obsolete_file() {
        return (SubLObject)obsolete.NIL;
    }
    
    public static SubLObject setup_obsolete_file() {
        access_macros.define_obsolete_register((SubLObject)obsolete.$sym0$NAT_P, (SubLObject)obsolete.$list1);
        access_macros.define_obsolete_register((SubLObject)obsolete.$sym3$FIND_NAT, (SubLObject)obsolete.$list4);
        access_macros.define_obsolete_register((SubLObject)obsolete.$sym6$CYCL_SYSTEM_NUMBER, (SubLObject)obsolete.$list7);
        access_macros.define_obsolete_register((SubLObject)obsolete.$sym8$CYCL_PATCH_NUMBER, (SubLObject)obsolete.$list7);
        access_macros.define_obsolete_register((SubLObject)obsolete.$sym9$EL_TEMPLATE_ARG_, (SubLObject)obsolete.$list10);
        access_macros.define_obsolete_register((SubLObject)obsolete.$sym11$NAT_, (SubLObject)obsolete.$list12);
        access_macros.define_obsolete_register((SubLObject)obsolete.$sym14$RELATIONSHIP_, (SubLObject)obsolete.$list15);
        access_macros.define_obsolete_register((SubLObject)obsolete.$sym16$REIFIED_NAT_, (SubLObject)obsolete.$list17);
        access_macros.define_obsolete_register((SubLObject)obsolete.$sym18$REIFIABLE_NAT_, (SubLObject)obsolete.$list19);
        access_macros.define_obsolete_register((SubLObject)obsolete.$sym21$KB_NAT_, (SubLObject)obsolete.$list22);
        access_macros.define_obsolete_register((SubLObject)obsolete.$sym24$NAUT_IN_MT_, (SubLObject)obsolete.NIL);
        access_macros.define_obsolete_register((SubLObject)obsolete.$sym26$GNAT_, (SubLObject)obsolete.$list27);
        access_macros.define_obsolete_register((SubLObject)obsolete.$sym28$GNAT_P, (SubLObject)obsolete.$list29);
        access_macros.define_obsolete_register((SubLObject)obsolete.$sym30$FIND_GNAT, (SubLObject)obsolete.$list31);
        access_macros.define_obsolete_register((SubLObject)obsolete.$sym32$CNAT_P, (SubLObject)obsolete.$list33);
        access_macros.define_obsolete_register((SubLObject)obsolete.$sym34$CLOSED_NAT_P, (SubLObject)obsolete.$list33);
        access_macros.define_obsolete_register((SubLObject)obsolete.$sym35$REIFY_ARG_WHEN_CNAT, (SubLObject)obsolete.$list36);
        access_macros.define_obsolete_register((SubLObject)obsolete.$sym37$REIFY_WHEN_CNAT, (SubLObject)obsolete.$list38);
        access_macros.define_obsolete_register((SubLObject)obsolete.$sym39$FORTIFY, (SubLObject)obsolete.$list38);
        access_macros.define_obsolete_register((SubLObject)obsolete.$sym40$FIND_WHEN_CNAT, (SubLObject)obsolete.$list41);
        access_macros.define_obsolete_register((SubLObject)obsolete.$sym42$FIND_CNAT, (SubLObject)obsolete.$list43);
        access_macros.define_obsolete_register((SubLObject)obsolete.$sym44$OPEN_NAT_P, (SubLObject)obsolete.$list45);
        access_macros.define_obsolete_register((SubLObject)obsolete.$sym46$FO_NAT_, (SubLObject)obsolete.$list47);
        access_macros.define_obsolete_register((SubLObject)obsolete.$sym48$NAT_NOT_GNAT, (SubLObject)obsolete.$list49);
        access_macros.define_obsolete_register((SubLObject)obsolete.$sym50$FORMULA_FREE_VARIABLES, (SubLObject)obsolete.$list51);
        access_macros.define_obsolete_register((SubLObject)obsolete.$sym52$FORMULA_VARIABLES, (SubLObject)obsolete.$list53);
        access_macros.define_obsolete_register((SubLObject)obsolete.$sym54$COMPLETE_COLLECTION_EXTENT, (SubLObject)obsolete.$list55);
        access_macros.define_obsolete_register((SubLObject)obsolete.$sym56$COMPLETE_EXTENT_KNOWN, (SubLObject)obsolete.$list57);
        access_macros.define_obsolete_register((SubLObject)obsolete.$sym58$BOOLEAN_, (SubLObject)obsolete.$list59);
        return (SubLObject)obsolete.NIL;
    }
    
    @Override
	public void declareFunctions() {
        declare_obsolete_file();
    }
    
    @Override
	public void initializeVariables() {
        init_obsolete_file();
    }
    
    @Override
	public void runTopLevelForms() {
        setup_obsolete_file();
    }
    
    static {
        me = (SubLFile)new obsolete();
        $sym0$NAT_P = SubLObjectFactory.makeSymbol("NAT-P");
        $list1 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NART-P"), (SubLObject)SubLObjectFactory.makeSymbol("CYCL-NAT-P"));
        $str2$NAT_P_is_obsolete___use_NART_P_or = SubLObjectFactory.makeString("NAT-P is obsolete ; use NART-P or CYCL-NAT-P");
        $sym3$FIND_NAT = SubLObjectFactory.makeSymbol("FIND-NAT");
        $list4 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NART-P"));
        $str5$FIND_NAT_is_obsolete___use_FIND_N = SubLObjectFactory.makeString("FIND-NAT is obsolete ; use FIND-NART");
        $sym6$CYCL_SYSTEM_NUMBER = SubLObjectFactory.makeSymbol("CYCL-SYSTEM-NUMBER");
        $list7 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CYC-REVISION-NUMBERS"));
        $sym8$CYCL_PATCH_NUMBER = SubLObjectFactory.makeSymbol("CYCL-PATCH-NUMBER");
        $sym9$EL_TEMPLATE_ARG_ = SubLObjectFactory.makeSymbol("EL-TEMPLATE-ARG?");
        $list10 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LEAVE-SOME-TERMS-AT-EL-FOR-ARG?"));
        $sym11$NAT_ = SubLObjectFactory.makeSymbol("NAT?");
        $list12 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NAUT?"));
        $sym13$EL_VAR_ = SubLObjectFactory.makeSymbol("EL-VAR?");
        $sym14$RELATIONSHIP_ = SubLObjectFactory.makeSymbol("RELATIONSHIP?");
        $list15 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RELATION?"));
        $sym16$REIFIED_NAT_ = SubLObjectFactory.makeSymbol("REIFIED-NAT?");
        $list17 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NAUT-WITH-CORRESPONDING-NART?"));
        $sym18$REIFIABLE_NAT_ = SubLObjectFactory.makeSymbol("REIFIABLE-NAT?");
        $list19 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("REIFIABLE-NAUT?"));
        $sym20$CYC_VAR_ = SubLObjectFactory.makeSymbol("CYC-VAR?");
        $sym21$KB_NAT_ = SubLObjectFactory.makeSymbol("KB-NAT?");
        $list22 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("KB-NAUT?"));
        $sym23$VARIABLE_P = SubLObjectFactory.makeSymbol("VARIABLE-P");
        $sym24$NAUT_IN_MT_ = SubLObjectFactory.makeSymbol("NAUT-IN-MT?");
        $sym25$RELEVANT_MT_IS_GENL_MT = SubLObjectFactory.makeSymbol("RELEVANT-MT-IS-GENL-MT");
        $sym26$GNAT_ = SubLObjectFactory.makeSymbol("GNAT?");
        $list27 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GROUND-NAUT?"));
        $sym28$GNAT_P = SubLObjectFactory.makeSymbol("GNAT-P");
        $list29 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HL-GROUND-NAUT?"));
        $sym30$FIND_GNAT = SubLObjectFactory.makeSymbol("FIND-GNAT");
        $list31 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIND-GROUND-NAUT"));
        $sym32$CNAT_P = SubLObjectFactory.makeSymbol("CNAT-P");
        $list33 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLOSED-NAUT?"));
        $sym34$CLOSED_NAT_P = SubLObjectFactory.makeSymbol("CLOSED-NAT-P");
        $sym35$REIFY_ARG_WHEN_CNAT = SubLObjectFactory.makeSymbol("REIFY-ARG-WHEN-CNAT");
        $list36 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("REIFY-ARG-WHEN-CLOSED-NAUT"));
        $sym37$REIFY_WHEN_CNAT = SubLObjectFactory.makeSymbol("REIFY-WHEN-CNAT");
        $list38 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("REIFY-WHEN-CLOSED-NAUT"));
        $sym39$FORTIFY = SubLObjectFactory.makeSymbol("FORTIFY");
        $sym40$FIND_WHEN_CNAT = SubLObjectFactory.makeSymbol("FIND-WHEN-CNAT");
        $list41 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIND-WHEN-CLOSED-NAUT"));
        $sym42$FIND_CNAT = SubLObjectFactory.makeSymbol("FIND-CNAT");
        $list43 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIND-CLOSED-NAUT"));
        $sym44$OPEN_NAT_P = SubLObjectFactory.makeSymbol("OPEN-NAT-P");
        $list45 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPEN-NAUT?"));
        $sym46$FO_NAT_ = SubLObjectFactory.makeSymbol("FO-NAT?");
        $list47 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIRST-ORDER-NAUT?"));
        $sym48$NAT_NOT_GNAT = SubLObjectFactory.makeSymbol("NAT-NOT-GNAT");
        $list49 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("UNGROUND-NAUT?"));
        $sym50$FORMULA_FREE_VARIABLES = SubLObjectFactory.makeSymbol("FORMULA-FREE-VARIABLES");
        $list51 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SENTENCE-FREE-VARIABLES"));
        $sym52$FORMULA_VARIABLES = SubLObjectFactory.makeSymbol("FORMULA-VARIABLES");
        $list53 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SENTENCE-VARIABLES"));
        $sym54$COMPLETE_COLLECTION_EXTENT = SubLObjectFactory.makeSymbol("COMPLETE-COLLECTION-EXTENT");
        $list55 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("COMPLETELY-ENUMERABLE-COLLECTION?"));
        $sym56$COMPLETE_EXTENT_KNOWN = SubLObjectFactory.makeSymbol("COMPLETE-EXTENT-KNOWN");
        $list57 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("COMPLETE-EXTENT-ENUMERABLE?"));
        $sym58$BOOLEAN_ = SubLObjectFactory.makeSymbol("BOOLEAN?");
        $list59 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("BOOLEANP"));
    }
}

/*

	Total time: 137 ms
	
*/