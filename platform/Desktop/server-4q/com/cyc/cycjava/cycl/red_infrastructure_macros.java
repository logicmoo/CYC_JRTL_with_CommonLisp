package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class red_infrastructure_macros extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.red_infrastructure_macros";
    public static final String myFingerPrint = "63986bd00b5efd5da61d914c1d317bdab5ac4f0c4994314831c6f2c53a29176a";
    @SubLTranslatedFile.SubL(source = "cycl/red-infrastructure-macros.lisp", position = 18844L)
    private static SubLSymbol $red_infrastructure_test_key$;
    @SubLTranslatedFile.SubL(source = "cycl/red-infrastructure-macros.lisp", position = 20452L)
    private static SubLSymbol $red_infrastructure_test_default$;
    @SubLTranslatedFile.SubL(source = "cycl/red-infrastructure-macros.lisp", position = 20515L)
    private static SubLSymbol $red_infrastructure_test_red_value$;
    @SubLTranslatedFile.SubL(source = "cycl/red-infrastructure-macros.lisp", position = 20622L)
    private static SubLSymbol $reddef_lex_prvt_2$;
    @SubLTranslatedFile.SubL(source = "cycl/red-infrastructure-macros.lisp", position = 20741L)
    private static SubLSymbol $reddef_lex_prvt$;
    @SubLTranslatedFile.SubL(source = "cycl/red-infrastructure-macros.lisp", position = 20889L)
    public static SubLSymbol $reddef_lex_prot$;
    @SubLTranslatedFile.SubL(source = "cycl/red-infrastructure-macros.lisp", position = 21034L)
    public static SubLSymbol $reddef_lex_publ$;
    @SubLTranslatedFile.SubL(source = "cycl/red-infrastructure-macros.lisp", position = 21179L)
    private static SubLSymbol $reddef_par_prvt$;
    @SubLTranslatedFile.SubL(source = "cycl/red-infrastructure-macros.lisp", position = 21321L)
    public static SubLSymbol $reddef_par_prot$;
    @SubLTranslatedFile.SubL(source = "cycl/red-infrastructure-macros.lisp", position = 21468L)
    public static SubLSymbol $reddef_par_publ$;
    @SubLTranslatedFile.SubL(source = "cycl/red-infrastructure-macros.lisp", position = 21615L)
    private static SubLSymbol $reddef_var_prvt$;
    @SubLTranslatedFile.SubL(source = "cycl/red-infrastructure-macros.lisp", position = 21754L)
    public static SubLSymbol $reddef_var_prot$;
    @SubLTranslatedFile.SubL(source = "cycl/red-infrastructure-macros.lisp", position = 21895L)
    public static SubLSymbol $reddef_var_publ$;
    @SubLTranslatedFile.SubL(source = "cycl/red-infrastructure-macros.lisp", position = 22036L)
    private static SubLSymbol $reddef_gbl_prvt$;
    @SubLTranslatedFile.SubL(source = "cycl/red-infrastructure-macros.lisp", position = 22178L)
    public static SubLSymbol $reddef_gbl_prot$;
    @SubLTranslatedFile.SubL(source = "cycl/red-infrastructure-macros.lisp", position = 22322L)
    public static SubLSymbol $reddef_gbl_publ$;
    private static final SubLList $list0;
    private static final SubLSymbol $sym1$DEFPARAMETER_PUBLIC;
    private static final SubLSymbol $sym2$RED_DEF_HELPER;
    private static final SubLSymbol $sym3$FIF;
    private static final SubLSymbol $sym4$SYMBOLP;
    private static final SubLSymbol $sym5$QUOTE;
    private static final SubLSymbol $sym6$SYMBOL_VALUE;
    private static final SubLList $list7;
    private static final SubLSymbol $sym8$DEFPARAMETER_PROTECTED;
    private static final SubLSymbol $sym9$DEFPARAMETER_PRIVATE;
    private static final SubLSymbol $sym10$DEFLEXICAL_PUBLIC;
    private static final SubLList $list11;
    private static final SubLSymbol $sym12$DEFLEXICAL_PROTECTED;
    private static final SubLSymbol $sym13$DEFLEXICAL_PRIVATE;
    private static final SubLSymbol $sym14$DEFGLOBAL_PUBLIC;
    private static final SubLList $list15;
    private static final SubLSymbol $sym16$DEFGLOBAL_PROTECTED;
    private static final SubLSymbol $sym17$DEFGLOBAL_PRIVATE;
    private static final SubLSymbol $sym18$DEFVAR_PUBLIC;
    private static final SubLList $list19;
    private static final SubLSymbol $sym20$DEFVAR_PROTECTED;
    private static final SubLSymbol $sym21$DEFVAR_PRIVATE;
    private static final SubLList $list22;
    private static final SubLList $list23;
    private static final SubLList $list24;
    private static final SubLList $list25;
    private static final SubLList $list26;
    private static final SubLSymbol $sym27$RED_REINITIALIZE_VARIABLE_HELPER;
    private static final SubLList $list28;
    private static final SubLSymbol $kw29$SIMPLE;
    private static final SubLSymbol $sym30$RED_REINITIALIZE_VARIABLE;
    private static final SubLList $list31;
    private static final SubLString $str32$dflt;
    private static final SubLString $str33$_cyc_CycC_Linux_head_run_world_la;
    private static final SubLSymbol $sym34$REDDEF_LEX_PRVT_2;
    private static final SubLSymbol $kw35$LEXICAL;
    private static final SubLSymbol $sym36$_RED_INFRASTRUCTURE_TEST_KEY_;
    private static final SubLSymbol $sym37$REDDEF_LEX_PRVT;
    private static final SubLSymbol $sym38$_RED_INFRASTRUCTURE_TEST_DEFAULT_;
    private static final SubLSymbol $sym39$REDDEF_LEX_PROT;
    private static final SubLSymbol $sym40$REDDEF_LEX_PUBL;
    private static final SubLSymbol $sym41$REDDEF_PAR_PRVT;
    private static final SubLSymbol $kw42$PARAMETER;
    private static final SubLSymbol $sym43$REDDEF_PAR_PROT;
    private static final SubLSymbol $sym44$REDDEF_PAR_PUBL;
    private static final SubLSymbol $sym45$REDDEF_VAR_PRVT;
    private static final SubLSymbol $kw46$VAR;
    private static final SubLSymbol $sym47$REDDEF_VAR_PROT;
    private static final SubLSymbol $sym48$REDDEF_VAR_PUBL;
    private static final SubLSymbol $sym49$REDDEF_GBL_PRVT;
    private static final SubLSymbol $kw50$GLOBAL;
    private static final SubLSymbol $sym51$REDDEF_GBL_PROT;
    private static final SubLSymbol $sym52$REDDEF_GBL_PUBL;
    private static final SubLString $str53$reddef_gbl_publ_didn_t_have_the_d;
    private static final SubLString $str54$reddef_gbl_prot_didn_t_have_the_d;
    private static final SubLString $str55$reddef_gbl_prvt_didn_t_have_the_d;
    private static final SubLString $str56$reddef_var_publ_didn_t_have_the_d;
    private static final SubLString $str57$reddef_var_prot_didn_t_have_the_d;
    private static final SubLString $str58$reddef_var_prvt_didn_t_have_the_d;
    private static final SubLString $str59$reddef_lex_publ_didn_t_have_the_d;
    private static final SubLString $str60$reddef_lex_prot_didn_t_have_the_d;
    private static final SubLString $str61$reddef_lex_prvt_didn_t_have_the_d;
    private static final SubLString $str62$reddef_lex_prvt_2_didn_t_have_the;
    private static final SubLString $str63$reddef_par_publ_didn_t_have_the_d;
    private static final SubLString $str64$reddef_par_prot_didn_t_have_the_d;
    private static final SubLString $str65$reddef_par_prvt_didn_t_have_the_d;
    private static final SubLString $str66$reddef_gbl_publ_didn_t_have_the_v;
    private static final SubLString $str67$reddef_gbl_prot_didn_t_have_the_v;
    private static final SubLString $str68$reddef_gbl_prvt_didn_t_have_the_v;
    private static final SubLString $str69$reddef_var_publ_didn_t_have_the_v;
    private static final SubLString $str70$reddef_var_prot_didn_t_have_the_v;
    private static final SubLString $str71$reddef_var_prvt_didn_t_have_the_v;
    private static final SubLString $str72$reddef_lex_publ_didn_t_have_the_v;
    private static final SubLString $str73$reddef_lex_prot_didn_t_have_the_v;
    private static final SubLString $str74$reddef_lex_prvt_didn_t_have_the_v;
    private static final SubLString $str75$reddef_lex_prvt_2_didn_t_have_the;
    private static final SubLString $str76$reddef_par_publ_didn_t_have_the_v;
    private static final SubLString $str77$reddef_par_prot_didn_t_have_the_v;
    private static final SubLString $str78$reddef_par_prvt_didn_t_have_the_v;
    
    @SubLTranslatedFile.SubL(source = "cycl/red-infrastructure-macros.lisp", position = 922L)
    public static SubLObject define_red_parameter_public(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject key = (SubLObject)red_infrastructure_macros.NIL;
        SubLObject name = (SubLObject)red_infrastructure_macros.NIL;
        SubLObject defaultvalue = (SubLObject)red_infrastructure_macros.NIL;
        SubLObject description = (SubLObject)red_infrastructure_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)red_infrastructure_macros.$list0);
        key = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)red_infrastructure_macros.$list0);
        name = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)red_infrastructure_macros.$list0);
        defaultvalue = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)red_infrastructure_macros.$list0);
        description = current.first();
        current = current.rest();
        if (red_infrastructure_macros.NIL == current) {
            return (SubLObject)ConsesLow.list((SubLObject)red_infrastructure_macros.$sym1$DEFPARAMETER_PUBLIC, name, (SubLObject)ConsesLow.listS((SubLObject)red_infrastructure_macros.$sym2$RED_DEF_HELPER, (SubLObject)ConsesLow.list((SubLObject)red_infrastructure_macros.$sym3$FIF, (SubLObject)ConsesLow.list((SubLObject)red_infrastructure_macros.$sym4$SYMBOLP, (SubLObject)ConsesLow.list((SubLObject)red_infrastructure_macros.$sym5$QUOTE, key)), (SubLObject)ConsesLow.list((SubLObject)red_infrastructure_macros.$sym6$SYMBOL_VALUE, (SubLObject)ConsesLow.list((SubLObject)red_infrastructure_macros.$sym5$QUOTE, key)), (SubLObject)ConsesLow.list((SubLObject)red_infrastructure_macros.$sym5$QUOTE, key)), (SubLObject)ConsesLow.list((SubLObject)red_infrastructure_macros.$sym5$QUOTE, name), (SubLObject)ConsesLow.list((SubLObject)red_infrastructure_macros.$sym3$FIF, (SubLObject)ConsesLow.list((SubLObject)red_infrastructure_macros.$sym4$SYMBOLP, (SubLObject)ConsesLow.list((SubLObject)red_infrastructure_macros.$sym5$QUOTE, defaultvalue)), (SubLObject)ConsesLow.list((SubLObject)red_infrastructure_macros.$sym6$SYMBOL_VALUE, (SubLObject)ConsesLow.list((SubLObject)red_infrastructure_macros.$sym5$QUOTE, defaultvalue)), (SubLObject)ConsesLow.list((SubLObject)red_infrastructure_macros.$sym5$QUOTE, defaultvalue)), (SubLObject)red_infrastructure_macros.$list7), description);
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)red_infrastructure_macros.$list0);
        return (SubLObject)red_infrastructure_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/red-infrastructure-macros.lisp", position = 1908L)
    public static SubLObject define_red_parameter_protected(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject key = (SubLObject)red_infrastructure_macros.NIL;
        SubLObject name = (SubLObject)red_infrastructure_macros.NIL;
        SubLObject defaultvalue = (SubLObject)red_infrastructure_macros.NIL;
        SubLObject description = (SubLObject)red_infrastructure_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)red_infrastructure_macros.$list0);
        key = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)red_infrastructure_macros.$list0);
        name = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)red_infrastructure_macros.$list0);
        defaultvalue = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)red_infrastructure_macros.$list0);
        description = current.first();
        current = current.rest();
        if (red_infrastructure_macros.NIL == current) {
            return (SubLObject)ConsesLow.list((SubLObject)red_infrastructure_macros.$sym8$DEFPARAMETER_PROTECTED, name, (SubLObject)ConsesLow.listS((SubLObject)red_infrastructure_macros.$sym2$RED_DEF_HELPER, (SubLObject)ConsesLow.list((SubLObject)red_infrastructure_macros.$sym3$FIF, (SubLObject)ConsesLow.list((SubLObject)red_infrastructure_macros.$sym4$SYMBOLP, (SubLObject)ConsesLow.list((SubLObject)red_infrastructure_macros.$sym5$QUOTE, key)), (SubLObject)ConsesLow.list((SubLObject)red_infrastructure_macros.$sym6$SYMBOL_VALUE, (SubLObject)ConsesLow.list((SubLObject)red_infrastructure_macros.$sym5$QUOTE, key)), (SubLObject)ConsesLow.list((SubLObject)red_infrastructure_macros.$sym5$QUOTE, key)), (SubLObject)ConsesLow.list((SubLObject)red_infrastructure_macros.$sym5$QUOTE, name), (SubLObject)ConsesLow.list((SubLObject)red_infrastructure_macros.$sym3$FIF, (SubLObject)ConsesLow.list((SubLObject)red_infrastructure_macros.$sym4$SYMBOLP, (SubLObject)ConsesLow.list((SubLObject)red_infrastructure_macros.$sym5$QUOTE, defaultvalue)), (SubLObject)ConsesLow.list((SubLObject)red_infrastructure_macros.$sym6$SYMBOL_VALUE, (SubLObject)ConsesLow.list((SubLObject)red_infrastructure_macros.$sym5$QUOTE, defaultvalue)), (SubLObject)ConsesLow.list((SubLObject)red_infrastructure_macros.$sym5$QUOTE, defaultvalue)), (SubLObject)red_infrastructure_macros.$list7), description);
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)red_infrastructure_macros.$list0);
        return (SubLObject)red_infrastructure_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/red-infrastructure-macros.lisp", position = 2567L)
    public static SubLObject define_red_parameter_private(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject key = (SubLObject)red_infrastructure_macros.NIL;
        SubLObject name = (SubLObject)red_infrastructure_macros.NIL;
        SubLObject defaultvalue = (SubLObject)red_infrastructure_macros.NIL;
        SubLObject description = (SubLObject)red_infrastructure_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)red_infrastructure_macros.$list0);
        key = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)red_infrastructure_macros.$list0);
        name = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)red_infrastructure_macros.$list0);
        defaultvalue = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)red_infrastructure_macros.$list0);
        description = current.first();
        current = current.rest();
        if (red_infrastructure_macros.NIL == current) {
            return (SubLObject)ConsesLow.list((SubLObject)red_infrastructure_macros.$sym9$DEFPARAMETER_PRIVATE, name, (SubLObject)ConsesLow.listS((SubLObject)red_infrastructure_macros.$sym2$RED_DEF_HELPER, (SubLObject)ConsesLow.list((SubLObject)red_infrastructure_macros.$sym3$FIF, (SubLObject)ConsesLow.list((SubLObject)red_infrastructure_macros.$sym4$SYMBOLP, (SubLObject)ConsesLow.list((SubLObject)red_infrastructure_macros.$sym5$QUOTE, key)), (SubLObject)ConsesLow.list((SubLObject)red_infrastructure_macros.$sym6$SYMBOL_VALUE, (SubLObject)ConsesLow.list((SubLObject)red_infrastructure_macros.$sym5$QUOTE, key)), (SubLObject)ConsesLow.list((SubLObject)red_infrastructure_macros.$sym5$QUOTE, key)), (SubLObject)ConsesLow.list((SubLObject)red_infrastructure_macros.$sym5$QUOTE, name), (SubLObject)ConsesLow.list((SubLObject)red_infrastructure_macros.$sym3$FIF, (SubLObject)ConsesLow.list((SubLObject)red_infrastructure_macros.$sym4$SYMBOLP, (SubLObject)ConsesLow.list((SubLObject)red_infrastructure_macros.$sym5$QUOTE, defaultvalue)), (SubLObject)ConsesLow.list((SubLObject)red_infrastructure_macros.$sym6$SYMBOL_VALUE, (SubLObject)ConsesLow.list((SubLObject)red_infrastructure_macros.$sym5$QUOTE, defaultvalue)), (SubLObject)ConsesLow.list((SubLObject)red_infrastructure_macros.$sym5$QUOTE, defaultvalue)), (SubLObject)red_infrastructure_macros.$list7), description);
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)red_infrastructure_macros.$list0);
        return (SubLObject)red_infrastructure_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/red-infrastructure-macros.lisp", position = 3226L)
    public static SubLObject define_red_lexical_public(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject key = (SubLObject)red_infrastructure_macros.NIL;
        SubLObject name = (SubLObject)red_infrastructure_macros.NIL;
        SubLObject defaultvalue = (SubLObject)red_infrastructure_macros.NIL;
        SubLObject description = (SubLObject)red_infrastructure_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)red_infrastructure_macros.$list0);
        key = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)red_infrastructure_macros.$list0);
        name = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)red_infrastructure_macros.$list0);
        defaultvalue = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)red_infrastructure_macros.$list0);
        description = current.first();
        current = current.rest();
        if (red_infrastructure_macros.NIL == current) {
            return (SubLObject)ConsesLow.list((SubLObject)red_infrastructure_macros.$sym10$DEFLEXICAL_PUBLIC, name, (SubLObject)ConsesLow.listS((SubLObject)red_infrastructure_macros.$sym2$RED_DEF_HELPER, (SubLObject)ConsesLow.list((SubLObject)red_infrastructure_macros.$sym3$FIF, (SubLObject)ConsesLow.list((SubLObject)red_infrastructure_macros.$sym4$SYMBOLP, (SubLObject)ConsesLow.list((SubLObject)red_infrastructure_macros.$sym5$QUOTE, key)), (SubLObject)ConsesLow.list((SubLObject)red_infrastructure_macros.$sym6$SYMBOL_VALUE, (SubLObject)ConsesLow.list((SubLObject)red_infrastructure_macros.$sym5$QUOTE, key)), (SubLObject)ConsesLow.list((SubLObject)red_infrastructure_macros.$sym5$QUOTE, key)), (SubLObject)ConsesLow.list((SubLObject)red_infrastructure_macros.$sym5$QUOTE, name), (SubLObject)ConsesLow.list((SubLObject)red_infrastructure_macros.$sym3$FIF, (SubLObject)ConsesLow.list((SubLObject)red_infrastructure_macros.$sym4$SYMBOLP, (SubLObject)ConsesLow.list((SubLObject)red_infrastructure_macros.$sym5$QUOTE, defaultvalue)), (SubLObject)ConsesLow.list((SubLObject)red_infrastructure_macros.$sym6$SYMBOL_VALUE, (SubLObject)ConsesLow.list((SubLObject)red_infrastructure_macros.$sym5$QUOTE, defaultvalue)), (SubLObject)ConsesLow.list((SubLObject)red_infrastructure_macros.$sym5$QUOTE, defaultvalue)), (SubLObject)red_infrastructure_macros.$list11), description);
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)red_infrastructure_macros.$list0);
        return (SubLObject)red_infrastructure_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/red-infrastructure-macros.lisp", position = 3893L)
    public static SubLObject define_red_lexical_protected(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject key = (SubLObject)red_infrastructure_macros.NIL;
        SubLObject name = (SubLObject)red_infrastructure_macros.NIL;
        SubLObject defaultvalue = (SubLObject)red_infrastructure_macros.NIL;
        SubLObject description = (SubLObject)red_infrastructure_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)red_infrastructure_macros.$list0);
        key = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)red_infrastructure_macros.$list0);
        name = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)red_infrastructure_macros.$list0);
        defaultvalue = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)red_infrastructure_macros.$list0);
        description = current.first();
        current = current.rest();
        if (red_infrastructure_macros.NIL == current) {
            return (SubLObject)ConsesLow.list((SubLObject)red_infrastructure_macros.$sym12$DEFLEXICAL_PROTECTED, name, (SubLObject)ConsesLow.listS((SubLObject)red_infrastructure_macros.$sym2$RED_DEF_HELPER, (SubLObject)ConsesLow.list((SubLObject)red_infrastructure_macros.$sym3$FIF, (SubLObject)ConsesLow.list((SubLObject)red_infrastructure_macros.$sym4$SYMBOLP, (SubLObject)ConsesLow.list((SubLObject)red_infrastructure_macros.$sym5$QUOTE, key)), (SubLObject)ConsesLow.list((SubLObject)red_infrastructure_macros.$sym6$SYMBOL_VALUE, (SubLObject)ConsesLow.list((SubLObject)red_infrastructure_macros.$sym5$QUOTE, key)), (SubLObject)ConsesLow.list((SubLObject)red_infrastructure_macros.$sym5$QUOTE, key)), (SubLObject)ConsesLow.list((SubLObject)red_infrastructure_macros.$sym5$QUOTE, name), (SubLObject)ConsesLow.list((SubLObject)red_infrastructure_macros.$sym3$FIF, (SubLObject)ConsesLow.list((SubLObject)red_infrastructure_macros.$sym4$SYMBOLP, (SubLObject)ConsesLow.list((SubLObject)red_infrastructure_macros.$sym5$QUOTE, defaultvalue)), (SubLObject)ConsesLow.list((SubLObject)red_infrastructure_macros.$sym6$SYMBOL_VALUE, (SubLObject)ConsesLow.list((SubLObject)red_infrastructure_macros.$sym5$QUOTE, defaultvalue)), (SubLObject)ConsesLow.list((SubLObject)red_infrastructure_macros.$sym5$QUOTE, defaultvalue)), (SubLObject)red_infrastructure_macros.$list11), description);
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)red_infrastructure_macros.$list0);
        return (SubLObject)red_infrastructure_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/red-infrastructure-macros.lisp", position = 4546L)
    public static SubLObject define_red_lexical_private(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject key = (SubLObject)red_infrastructure_macros.NIL;
        SubLObject name = (SubLObject)red_infrastructure_macros.NIL;
        SubLObject defaultvalue = (SubLObject)red_infrastructure_macros.NIL;
        SubLObject description = (SubLObject)red_infrastructure_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)red_infrastructure_macros.$list0);
        key = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)red_infrastructure_macros.$list0);
        name = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)red_infrastructure_macros.$list0);
        defaultvalue = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)red_infrastructure_macros.$list0);
        description = current.first();
        current = current.rest();
        if (red_infrastructure_macros.NIL == current) {
            return (SubLObject)ConsesLow.list((SubLObject)red_infrastructure_macros.$sym13$DEFLEXICAL_PRIVATE, name, (SubLObject)ConsesLow.listS((SubLObject)red_infrastructure_macros.$sym2$RED_DEF_HELPER, (SubLObject)ConsesLow.list((SubLObject)red_infrastructure_macros.$sym3$FIF, (SubLObject)ConsesLow.list((SubLObject)red_infrastructure_macros.$sym4$SYMBOLP, (SubLObject)ConsesLow.list((SubLObject)red_infrastructure_macros.$sym5$QUOTE, key)), (SubLObject)ConsesLow.list((SubLObject)red_infrastructure_macros.$sym6$SYMBOL_VALUE, (SubLObject)ConsesLow.list((SubLObject)red_infrastructure_macros.$sym5$QUOTE, key)), (SubLObject)ConsesLow.list((SubLObject)red_infrastructure_macros.$sym5$QUOTE, key)), (SubLObject)ConsesLow.list((SubLObject)red_infrastructure_macros.$sym5$QUOTE, name), (SubLObject)ConsesLow.list((SubLObject)red_infrastructure_macros.$sym3$FIF, (SubLObject)ConsesLow.list((SubLObject)red_infrastructure_macros.$sym4$SYMBOLP, (SubLObject)ConsesLow.list((SubLObject)red_infrastructure_macros.$sym5$QUOTE, defaultvalue)), (SubLObject)ConsesLow.list((SubLObject)red_infrastructure_macros.$sym6$SYMBOL_VALUE, (SubLObject)ConsesLow.list((SubLObject)red_infrastructure_macros.$sym5$QUOTE, defaultvalue)), (SubLObject)ConsesLow.list((SubLObject)red_infrastructure_macros.$sym5$QUOTE, defaultvalue)), (SubLObject)red_infrastructure_macros.$list11), description);
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)red_infrastructure_macros.$list0);
        return (SubLObject)red_infrastructure_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/red-infrastructure-macros.lisp", position = 5194L)
    public static SubLObject define_red_global_public(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject key = (SubLObject)red_infrastructure_macros.NIL;
        SubLObject name = (SubLObject)red_infrastructure_macros.NIL;
        SubLObject defaultvalue = (SubLObject)red_infrastructure_macros.NIL;
        SubLObject description = (SubLObject)red_infrastructure_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)red_infrastructure_macros.$list0);
        key = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)red_infrastructure_macros.$list0);
        name = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)red_infrastructure_macros.$list0);
        defaultvalue = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)red_infrastructure_macros.$list0);
        description = current.first();
        current = current.rest();
        if (red_infrastructure_macros.NIL == current) {
            return (SubLObject)ConsesLow.list((SubLObject)red_infrastructure_macros.$sym14$DEFGLOBAL_PUBLIC, name, (SubLObject)ConsesLow.listS((SubLObject)red_infrastructure_macros.$sym2$RED_DEF_HELPER, (SubLObject)ConsesLow.list((SubLObject)red_infrastructure_macros.$sym3$FIF, (SubLObject)ConsesLow.list((SubLObject)red_infrastructure_macros.$sym4$SYMBOLP, (SubLObject)ConsesLow.list((SubLObject)red_infrastructure_macros.$sym5$QUOTE, key)), (SubLObject)ConsesLow.list((SubLObject)red_infrastructure_macros.$sym6$SYMBOL_VALUE, (SubLObject)ConsesLow.list((SubLObject)red_infrastructure_macros.$sym5$QUOTE, key)), (SubLObject)ConsesLow.list((SubLObject)red_infrastructure_macros.$sym5$QUOTE, key)), (SubLObject)ConsesLow.list((SubLObject)red_infrastructure_macros.$sym5$QUOTE, name), (SubLObject)ConsesLow.list((SubLObject)red_infrastructure_macros.$sym3$FIF, (SubLObject)ConsesLow.list((SubLObject)red_infrastructure_macros.$sym4$SYMBOLP, (SubLObject)ConsesLow.list((SubLObject)red_infrastructure_macros.$sym5$QUOTE, defaultvalue)), (SubLObject)ConsesLow.list((SubLObject)red_infrastructure_macros.$sym6$SYMBOL_VALUE, (SubLObject)ConsesLow.list((SubLObject)red_infrastructure_macros.$sym5$QUOTE, defaultvalue)), (SubLObject)ConsesLow.list((SubLObject)red_infrastructure_macros.$sym5$QUOTE, defaultvalue)), (SubLObject)red_infrastructure_macros.$list15), description);
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)red_infrastructure_macros.$list0);
        return (SubLObject)red_infrastructure_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/red-infrastructure-macros.lisp", position = 5856L)
    public static SubLObject define_red_global_protected(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject key = (SubLObject)red_infrastructure_macros.NIL;
        SubLObject name = (SubLObject)red_infrastructure_macros.NIL;
        SubLObject defaultvalue = (SubLObject)red_infrastructure_macros.NIL;
        SubLObject description = (SubLObject)red_infrastructure_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)red_infrastructure_macros.$list0);
        key = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)red_infrastructure_macros.$list0);
        name = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)red_infrastructure_macros.$list0);
        defaultvalue = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)red_infrastructure_macros.$list0);
        description = current.first();
        current = current.rest();
        if (red_infrastructure_macros.NIL == current) {
            return (SubLObject)ConsesLow.list((SubLObject)red_infrastructure_macros.$sym16$DEFGLOBAL_PROTECTED, name, (SubLObject)ConsesLow.listS((SubLObject)red_infrastructure_macros.$sym2$RED_DEF_HELPER, (SubLObject)ConsesLow.list((SubLObject)red_infrastructure_macros.$sym3$FIF, (SubLObject)ConsesLow.list((SubLObject)red_infrastructure_macros.$sym4$SYMBOLP, (SubLObject)ConsesLow.list((SubLObject)red_infrastructure_macros.$sym5$QUOTE, key)), (SubLObject)ConsesLow.list((SubLObject)red_infrastructure_macros.$sym6$SYMBOL_VALUE, (SubLObject)ConsesLow.list((SubLObject)red_infrastructure_macros.$sym5$QUOTE, key)), (SubLObject)ConsesLow.list((SubLObject)red_infrastructure_macros.$sym5$QUOTE, key)), (SubLObject)ConsesLow.list((SubLObject)red_infrastructure_macros.$sym5$QUOTE, name), (SubLObject)ConsesLow.list((SubLObject)red_infrastructure_macros.$sym3$FIF, (SubLObject)ConsesLow.list((SubLObject)red_infrastructure_macros.$sym4$SYMBOLP, (SubLObject)ConsesLow.list((SubLObject)red_infrastructure_macros.$sym5$QUOTE, defaultvalue)), (SubLObject)ConsesLow.list((SubLObject)red_infrastructure_macros.$sym6$SYMBOL_VALUE, (SubLObject)ConsesLow.list((SubLObject)red_infrastructure_macros.$sym5$QUOTE, defaultvalue)), (SubLObject)ConsesLow.list((SubLObject)red_infrastructure_macros.$sym5$QUOTE, defaultvalue)), (SubLObject)red_infrastructure_macros.$list15), description);
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)red_infrastructure_macros.$list0);
        return (SubLObject)red_infrastructure_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/red-infrastructure-macros.lisp", position = 6507L)
    public static SubLObject define_red_global_private(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject key = (SubLObject)red_infrastructure_macros.NIL;
        SubLObject name = (SubLObject)red_infrastructure_macros.NIL;
        SubLObject defaultvalue = (SubLObject)red_infrastructure_macros.NIL;
        SubLObject description = (SubLObject)red_infrastructure_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)red_infrastructure_macros.$list0);
        key = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)red_infrastructure_macros.$list0);
        name = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)red_infrastructure_macros.$list0);
        defaultvalue = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)red_infrastructure_macros.$list0);
        description = current.first();
        current = current.rest();
        if (red_infrastructure_macros.NIL == current) {
            return (SubLObject)ConsesLow.list((SubLObject)red_infrastructure_macros.$sym17$DEFGLOBAL_PRIVATE, name, (SubLObject)ConsesLow.listS((SubLObject)red_infrastructure_macros.$sym2$RED_DEF_HELPER, (SubLObject)ConsesLow.list((SubLObject)red_infrastructure_macros.$sym3$FIF, (SubLObject)ConsesLow.list((SubLObject)red_infrastructure_macros.$sym4$SYMBOLP, (SubLObject)ConsesLow.list((SubLObject)red_infrastructure_macros.$sym5$QUOTE, key)), (SubLObject)ConsesLow.list((SubLObject)red_infrastructure_macros.$sym6$SYMBOL_VALUE, (SubLObject)ConsesLow.list((SubLObject)red_infrastructure_macros.$sym5$QUOTE, key)), (SubLObject)ConsesLow.list((SubLObject)red_infrastructure_macros.$sym5$QUOTE, key)), (SubLObject)ConsesLow.list((SubLObject)red_infrastructure_macros.$sym5$QUOTE, name), (SubLObject)ConsesLow.list((SubLObject)red_infrastructure_macros.$sym3$FIF, (SubLObject)ConsesLow.list((SubLObject)red_infrastructure_macros.$sym4$SYMBOLP, (SubLObject)ConsesLow.list((SubLObject)red_infrastructure_macros.$sym5$QUOTE, defaultvalue)), (SubLObject)ConsesLow.list((SubLObject)red_infrastructure_macros.$sym6$SYMBOL_VALUE, (SubLObject)ConsesLow.list((SubLObject)red_infrastructure_macros.$sym5$QUOTE, defaultvalue)), (SubLObject)ConsesLow.list((SubLObject)red_infrastructure_macros.$sym5$QUOTE, defaultvalue)), (SubLObject)red_infrastructure_macros.$list15), description);
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)red_infrastructure_macros.$list0);
        return (SubLObject)red_infrastructure_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/red-infrastructure-macros.lisp", position = 7153L)
    public static SubLObject define_red_var_public(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject key = (SubLObject)red_infrastructure_macros.NIL;
        SubLObject name = (SubLObject)red_infrastructure_macros.NIL;
        SubLObject defaultvalue = (SubLObject)red_infrastructure_macros.NIL;
        SubLObject description = (SubLObject)red_infrastructure_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)red_infrastructure_macros.$list0);
        key = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)red_infrastructure_macros.$list0);
        name = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)red_infrastructure_macros.$list0);
        defaultvalue = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)red_infrastructure_macros.$list0);
        description = current.first();
        current = current.rest();
        if (red_infrastructure_macros.NIL == current) {
            return (SubLObject)ConsesLow.list((SubLObject)red_infrastructure_macros.$sym18$DEFVAR_PUBLIC, name, (SubLObject)ConsesLow.listS((SubLObject)red_infrastructure_macros.$sym2$RED_DEF_HELPER, (SubLObject)ConsesLow.list((SubLObject)red_infrastructure_macros.$sym3$FIF, (SubLObject)ConsesLow.list((SubLObject)red_infrastructure_macros.$sym4$SYMBOLP, (SubLObject)ConsesLow.list((SubLObject)red_infrastructure_macros.$sym5$QUOTE, key)), (SubLObject)ConsesLow.list((SubLObject)red_infrastructure_macros.$sym6$SYMBOL_VALUE, (SubLObject)ConsesLow.list((SubLObject)red_infrastructure_macros.$sym5$QUOTE, key)), (SubLObject)ConsesLow.list((SubLObject)red_infrastructure_macros.$sym5$QUOTE, key)), (SubLObject)ConsesLow.list((SubLObject)red_infrastructure_macros.$sym5$QUOTE, name), (SubLObject)ConsesLow.list((SubLObject)red_infrastructure_macros.$sym3$FIF, (SubLObject)ConsesLow.list((SubLObject)red_infrastructure_macros.$sym4$SYMBOLP, (SubLObject)ConsesLow.list((SubLObject)red_infrastructure_macros.$sym5$QUOTE, defaultvalue)), (SubLObject)ConsesLow.list((SubLObject)red_infrastructure_macros.$sym6$SYMBOL_VALUE, (SubLObject)ConsesLow.list((SubLObject)red_infrastructure_macros.$sym5$QUOTE, defaultvalue)), (SubLObject)ConsesLow.list((SubLObject)red_infrastructure_macros.$sym5$QUOTE, defaultvalue)), (SubLObject)red_infrastructure_macros.$list19), description);
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)red_infrastructure_macros.$list0);
        return (SubLObject)red_infrastructure_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/red-infrastructure-macros.lisp", position = 7802L)
    public static SubLObject define_red_var_protected(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject key = (SubLObject)red_infrastructure_macros.NIL;
        SubLObject name = (SubLObject)red_infrastructure_macros.NIL;
        SubLObject defaultvalue = (SubLObject)red_infrastructure_macros.NIL;
        SubLObject description = (SubLObject)red_infrastructure_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)red_infrastructure_macros.$list0);
        key = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)red_infrastructure_macros.$list0);
        name = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)red_infrastructure_macros.$list0);
        defaultvalue = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)red_infrastructure_macros.$list0);
        description = current.first();
        current = current.rest();
        if (red_infrastructure_macros.NIL == current) {
            return (SubLObject)ConsesLow.list((SubLObject)red_infrastructure_macros.$sym20$DEFVAR_PROTECTED, name, (SubLObject)ConsesLow.listS((SubLObject)red_infrastructure_macros.$sym2$RED_DEF_HELPER, (SubLObject)ConsesLow.list((SubLObject)red_infrastructure_macros.$sym3$FIF, (SubLObject)ConsesLow.list((SubLObject)red_infrastructure_macros.$sym4$SYMBOLP, (SubLObject)ConsesLow.list((SubLObject)red_infrastructure_macros.$sym5$QUOTE, key)), (SubLObject)ConsesLow.list((SubLObject)red_infrastructure_macros.$sym6$SYMBOL_VALUE, (SubLObject)ConsesLow.list((SubLObject)red_infrastructure_macros.$sym5$QUOTE, key)), (SubLObject)ConsesLow.list((SubLObject)red_infrastructure_macros.$sym5$QUOTE, key)), (SubLObject)ConsesLow.list((SubLObject)red_infrastructure_macros.$sym5$QUOTE, name), (SubLObject)ConsesLow.list((SubLObject)red_infrastructure_macros.$sym3$FIF, (SubLObject)ConsesLow.list((SubLObject)red_infrastructure_macros.$sym4$SYMBOLP, (SubLObject)ConsesLow.list((SubLObject)red_infrastructure_macros.$sym5$QUOTE, defaultvalue)), (SubLObject)ConsesLow.list((SubLObject)red_infrastructure_macros.$sym6$SYMBOL_VALUE, (SubLObject)ConsesLow.list((SubLObject)red_infrastructure_macros.$sym5$QUOTE, defaultvalue)), (SubLObject)ConsesLow.list((SubLObject)red_infrastructure_macros.$sym5$QUOTE, defaultvalue)), (SubLObject)red_infrastructure_macros.$list19), description);
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)red_infrastructure_macros.$list0);
        return (SubLObject)red_infrastructure_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/red-infrastructure-macros.lisp", position = 8441L)
    public static SubLObject define_red_var_private(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject key = (SubLObject)red_infrastructure_macros.NIL;
        SubLObject name = (SubLObject)red_infrastructure_macros.NIL;
        SubLObject defaultvalue = (SubLObject)red_infrastructure_macros.NIL;
        SubLObject description = (SubLObject)red_infrastructure_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)red_infrastructure_macros.$list0);
        key = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)red_infrastructure_macros.$list0);
        name = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)red_infrastructure_macros.$list0);
        defaultvalue = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)red_infrastructure_macros.$list0);
        description = current.first();
        current = current.rest();
        if (red_infrastructure_macros.NIL == current) {
            return (SubLObject)ConsesLow.list((SubLObject)red_infrastructure_macros.$sym21$DEFVAR_PRIVATE, name, (SubLObject)ConsesLow.listS((SubLObject)red_infrastructure_macros.$sym2$RED_DEF_HELPER, (SubLObject)ConsesLow.list((SubLObject)red_infrastructure_macros.$sym3$FIF, (SubLObject)ConsesLow.list((SubLObject)red_infrastructure_macros.$sym4$SYMBOLP, (SubLObject)ConsesLow.list((SubLObject)red_infrastructure_macros.$sym5$QUOTE, key)), (SubLObject)ConsesLow.list((SubLObject)red_infrastructure_macros.$sym6$SYMBOL_VALUE, (SubLObject)ConsesLow.list((SubLObject)red_infrastructure_macros.$sym5$QUOTE, key)), (SubLObject)ConsesLow.list((SubLObject)red_infrastructure_macros.$sym5$QUOTE, key)), (SubLObject)ConsesLow.list((SubLObject)red_infrastructure_macros.$sym5$QUOTE, name), (SubLObject)ConsesLow.list((SubLObject)red_infrastructure_macros.$sym3$FIF, (SubLObject)ConsesLow.list((SubLObject)red_infrastructure_macros.$sym4$SYMBOLP, (SubLObject)ConsesLow.list((SubLObject)red_infrastructure_macros.$sym5$QUOTE, defaultvalue)), (SubLObject)ConsesLow.list((SubLObject)red_infrastructure_macros.$sym6$SYMBOL_VALUE, (SubLObject)ConsesLow.list((SubLObject)red_infrastructure_macros.$sym5$QUOTE, defaultvalue)), (SubLObject)ConsesLow.list((SubLObject)red_infrastructure_macros.$sym5$QUOTE, defaultvalue)), (SubLObject)red_infrastructure_macros.$list19), description);
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)red_infrastructure_macros.$list0);
        return (SubLObject)red_infrastructure_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/red-infrastructure-macros.lisp", position = 9076L)
    public static SubLObject define_red_list_parameter_public(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject key = (SubLObject)red_infrastructure_macros.NIL;
        SubLObject name = (SubLObject)red_infrastructure_macros.NIL;
        SubLObject defaultvalue = (SubLObject)red_infrastructure_macros.NIL;
        SubLObject description = (SubLObject)red_infrastructure_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)red_infrastructure_macros.$list0);
        key = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)red_infrastructure_macros.$list0);
        name = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)red_infrastructure_macros.$list0);
        defaultvalue = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)red_infrastructure_macros.$list0);
        description = current.first();
        current = current.rest();
        if (red_infrastructure_macros.NIL == current) {
            return (SubLObject)ConsesLow.list((SubLObject)red_infrastructure_macros.$sym1$DEFPARAMETER_PUBLIC, name, (SubLObject)ConsesLow.listS((SubLObject)red_infrastructure_macros.$sym2$RED_DEF_HELPER, (SubLObject)ConsesLow.list((SubLObject)red_infrastructure_macros.$sym3$FIF, (SubLObject)ConsesLow.list((SubLObject)red_infrastructure_macros.$sym4$SYMBOLP, (SubLObject)ConsesLow.list((SubLObject)red_infrastructure_macros.$sym5$QUOTE, key)), (SubLObject)ConsesLow.list((SubLObject)red_infrastructure_macros.$sym6$SYMBOL_VALUE, (SubLObject)ConsesLow.list((SubLObject)red_infrastructure_macros.$sym5$QUOTE, key)), (SubLObject)ConsesLow.list((SubLObject)red_infrastructure_macros.$sym5$QUOTE, key)), (SubLObject)ConsesLow.list((SubLObject)red_infrastructure_macros.$sym5$QUOTE, name), (SubLObject)ConsesLow.list((SubLObject)red_infrastructure_macros.$sym3$FIF, (SubLObject)ConsesLow.list((SubLObject)red_infrastructure_macros.$sym4$SYMBOLP, (SubLObject)ConsesLow.list((SubLObject)red_infrastructure_macros.$sym5$QUOTE, defaultvalue)), (SubLObject)ConsesLow.list((SubLObject)red_infrastructure_macros.$sym6$SYMBOL_VALUE, (SubLObject)ConsesLow.list((SubLObject)red_infrastructure_macros.$sym5$QUOTE, defaultvalue)), (SubLObject)ConsesLow.list((SubLObject)red_infrastructure_macros.$sym5$QUOTE, defaultvalue)), (SubLObject)red_infrastructure_macros.$list22), description);
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)red_infrastructure_macros.$list0);
        return (SubLObject)red_infrastructure_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/red-infrastructure-macros.lisp", position = 9780L)
    public static SubLObject define_red_list_parameter_protected(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject key = (SubLObject)red_infrastructure_macros.NIL;
        SubLObject name = (SubLObject)red_infrastructure_macros.NIL;
        SubLObject defaultvalue = (SubLObject)red_infrastructure_macros.NIL;
        SubLObject description = (SubLObject)red_infrastructure_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)red_infrastructure_macros.$list0);
        key = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)red_infrastructure_macros.$list0);
        name = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)red_infrastructure_macros.$list0);
        defaultvalue = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)red_infrastructure_macros.$list0);
        description = current.first();
        current = current.rest();
        if (red_infrastructure_macros.NIL == current) {
            return (SubLObject)ConsesLow.list((SubLObject)red_infrastructure_macros.$sym8$DEFPARAMETER_PROTECTED, name, (SubLObject)ConsesLow.listS((SubLObject)red_infrastructure_macros.$sym2$RED_DEF_HELPER, (SubLObject)ConsesLow.list((SubLObject)red_infrastructure_macros.$sym3$FIF, (SubLObject)ConsesLow.list((SubLObject)red_infrastructure_macros.$sym4$SYMBOLP, (SubLObject)ConsesLow.list((SubLObject)red_infrastructure_macros.$sym5$QUOTE, key)), (SubLObject)ConsesLow.list((SubLObject)red_infrastructure_macros.$sym6$SYMBOL_VALUE, (SubLObject)ConsesLow.list((SubLObject)red_infrastructure_macros.$sym5$QUOTE, key)), (SubLObject)ConsesLow.list((SubLObject)red_infrastructure_macros.$sym5$QUOTE, key)), (SubLObject)ConsesLow.list((SubLObject)red_infrastructure_macros.$sym5$QUOTE, name), (SubLObject)ConsesLow.list((SubLObject)red_infrastructure_macros.$sym3$FIF, (SubLObject)ConsesLow.list((SubLObject)red_infrastructure_macros.$sym4$SYMBOLP, (SubLObject)ConsesLow.list((SubLObject)red_infrastructure_macros.$sym5$QUOTE, defaultvalue)), (SubLObject)ConsesLow.list((SubLObject)red_infrastructure_macros.$sym6$SYMBOL_VALUE, (SubLObject)ConsesLow.list((SubLObject)red_infrastructure_macros.$sym5$QUOTE, defaultvalue)), (SubLObject)ConsesLow.list((SubLObject)red_infrastructure_macros.$sym5$QUOTE, defaultvalue)), (SubLObject)red_infrastructure_macros.$list22), description);
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)red_infrastructure_macros.$list0);
        return (SubLObject)red_infrastructure_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/red-infrastructure-macros.lisp", position = 10456L)
    public static SubLObject define_red_list_parameter_private(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject key = (SubLObject)red_infrastructure_macros.NIL;
        SubLObject name = (SubLObject)red_infrastructure_macros.NIL;
        SubLObject defaultvalue = (SubLObject)red_infrastructure_macros.NIL;
        SubLObject description = (SubLObject)red_infrastructure_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)red_infrastructure_macros.$list0);
        key = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)red_infrastructure_macros.$list0);
        name = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)red_infrastructure_macros.$list0);
        defaultvalue = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)red_infrastructure_macros.$list0);
        description = current.first();
        current = current.rest();
        if (red_infrastructure_macros.NIL == current) {
            return (SubLObject)ConsesLow.list((SubLObject)red_infrastructure_macros.$sym9$DEFPARAMETER_PRIVATE, name, (SubLObject)ConsesLow.listS((SubLObject)red_infrastructure_macros.$sym2$RED_DEF_HELPER, (SubLObject)ConsesLow.list((SubLObject)red_infrastructure_macros.$sym3$FIF, (SubLObject)ConsesLow.list((SubLObject)red_infrastructure_macros.$sym4$SYMBOLP, (SubLObject)ConsesLow.list((SubLObject)red_infrastructure_macros.$sym5$QUOTE, key)), (SubLObject)ConsesLow.list((SubLObject)red_infrastructure_macros.$sym6$SYMBOL_VALUE, (SubLObject)ConsesLow.list((SubLObject)red_infrastructure_macros.$sym5$QUOTE, key)), (SubLObject)ConsesLow.list((SubLObject)red_infrastructure_macros.$sym5$QUOTE, key)), (SubLObject)ConsesLow.list((SubLObject)red_infrastructure_macros.$sym5$QUOTE, name), (SubLObject)ConsesLow.list((SubLObject)red_infrastructure_macros.$sym3$FIF, (SubLObject)ConsesLow.list((SubLObject)red_infrastructure_macros.$sym4$SYMBOLP, (SubLObject)ConsesLow.list((SubLObject)red_infrastructure_macros.$sym5$QUOTE, defaultvalue)), (SubLObject)ConsesLow.list((SubLObject)red_infrastructure_macros.$sym6$SYMBOL_VALUE, (SubLObject)ConsesLow.list((SubLObject)red_infrastructure_macros.$sym5$QUOTE, defaultvalue)), (SubLObject)ConsesLow.list((SubLObject)red_infrastructure_macros.$sym5$QUOTE, defaultvalue)), (SubLObject)red_infrastructure_macros.$list22), description);
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)red_infrastructure_macros.$list0);
        return (SubLObject)red_infrastructure_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/red-infrastructure-macros.lisp", position = 11132L)
    public static SubLObject define_red_list_lexical_public(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject key = (SubLObject)red_infrastructure_macros.NIL;
        SubLObject name = (SubLObject)red_infrastructure_macros.NIL;
        SubLObject defaultvalue = (SubLObject)red_infrastructure_macros.NIL;
        SubLObject description = (SubLObject)red_infrastructure_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)red_infrastructure_macros.$list0);
        key = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)red_infrastructure_macros.$list0);
        name = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)red_infrastructure_macros.$list0);
        defaultvalue = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)red_infrastructure_macros.$list0);
        description = current.first();
        current = current.rest();
        if (red_infrastructure_macros.NIL == current) {
            return (SubLObject)ConsesLow.list((SubLObject)red_infrastructure_macros.$sym10$DEFLEXICAL_PUBLIC, name, (SubLObject)ConsesLow.listS((SubLObject)red_infrastructure_macros.$sym2$RED_DEF_HELPER, (SubLObject)ConsesLow.list((SubLObject)red_infrastructure_macros.$sym3$FIF, (SubLObject)ConsesLow.list((SubLObject)red_infrastructure_macros.$sym4$SYMBOLP, (SubLObject)ConsesLow.list((SubLObject)red_infrastructure_macros.$sym5$QUOTE, key)), (SubLObject)ConsesLow.list((SubLObject)red_infrastructure_macros.$sym6$SYMBOL_VALUE, (SubLObject)ConsesLow.list((SubLObject)red_infrastructure_macros.$sym5$QUOTE, key)), (SubLObject)ConsesLow.list((SubLObject)red_infrastructure_macros.$sym5$QUOTE, key)), (SubLObject)ConsesLow.list((SubLObject)red_infrastructure_macros.$sym5$QUOTE, name), (SubLObject)ConsesLow.list((SubLObject)red_infrastructure_macros.$sym3$FIF, (SubLObject)ConsesLow.list((SubLObject)red_infrastructure_macros.$sym4$SYMBOLP, (SubLObject)ConsesLow.list((SubLObject)red_infrastructure_macros.$sym5$QUOTE, defaultvalue)), (SubLObject)ConsesLow.list((SubLObject)red_infrastructure_macros.$sym6$SYMBOL_VALUE, (SubLObject)ConsesLow.list((SubLObject)red_infrastructure_macros.$sym5$QUOTE, defaultvalue)), (SubLObject)ConsesLow.list((SubLObject)red_infrastructure_macros.$sym5$QUOTE, defaultvalue)), (SubLObject)red_infrastructure_macros.$list23), description);
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)red_infrastructure_macros.$list0);
        return (SubLObject)red_infrastructure_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/red-infrastructure-macros.lisp", position = 11816L)
    public static SubLObject define_red_list_lexical_protected(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject key = (SubLObject)red_infrastructure_macros.NIL;
        SubLObject name = (SubLObject)red_infrastructure_macros.NIL;
        SubLObject defaultvalue = (SubLObject)red_infrastructure_macros.NIL;
        SubLObject description = (SubLObject)red_infrastructure_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)red_infrastructure_macros.$list0);
        key = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)red_infrastructure_macros.$list0);
        name = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)red_infrastructure_macros.$list0);
        defaultvalue = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)red_infrastructure_macros.$list0);
        description = current.first();
        current = current.rest();
        if (red_infrastructure_macros.NIL == current) {
            return (SubLObject)ConsesLow.list((SubLObject)red_infrastructure_macros.$sym12$DEFLEXICAL_PROTECTED, name, (SubLObject)ConsesLow.listS((SubLObject)red_infrastructure_macros.$sym2$RED_DEF_HELPER, (SubLObject)ConsesLow.list((SubLObject)red_infrastructure_macros.$sym3$FIF, (SubLObject)ConsesLow.list((SubLObject)red_infrastructure_macros.$sym4$SYMBOLP, (SubLObject)ConsesLow.list((SubLObject)red_infrastructure_macros.$sym5$QUOTE, key)), (SubLObject)ConsesLow.list((SubLObject)red_infrastructure_macros.$sym6$SYMBOL_VALUE, (SubLObject)ConsesLow.list((SubLObject)red_infrastructure_macros.$sym5$QUOTE, key)), (SubLObject)ConsesLow.list((SubLObject)red_infrastructure_macros.$sym5$QUOTE, key)), (SubLObject)ConsesLow.list((SubLObject)red_infrastructure_macros.$sym5$QUOTE, name), (SubLObject)ConsesLow.list((SubLObject)red_infrastructure_macros.$sym3$FIF, (SubLObject)ConsesLow.list((SubLObject)red_infrastructure_macros.$sym4$SYMBOLP, (SubLObject)ConsesLow.list((SubLObject)red_infrastructure_macros.$sym5$QUOTE, defaultvalue)), (SubLObject)ConsesLow.list((SubLObject)red_infrastructure_macros.$sym6$SYMBOL_VALUE, (SubLObject)ConsesLow.list((SubLObject)red_infrastructure_macros.$sym5$QUOTE, defaultvalue)), (SubLObject)ConsesLow.list((SubLObject)red_infrastructure_macros.$sym5$QUOTE, defaultvalue)), (SubLObject)red_infrastructure_macros.$list23), description);
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)red_infrastructure_macros.$list0);
        return (SubLObject)red_infrastructure_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/red-infrastructure-macros.lisp", position = 12486L)
    public static SubLObject define_red_list_lexical_private(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject key = (SubLObject)red_infrastructure_macros.NIL;
        SubLObject name = (SubLObject)red_infrastructure_macros.NIL;
        SubLObject defaultvalue = (SubLObject)red_infrastructure_macros.NIL;
        SubLObject description = (SubLObject)red_infrastructure_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)red_infrastructure_macros.$list0);
        key = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)red_infrastructure_macros.$list0);
        name = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)red_infrastructure_macros.$list0);
        defaultvalue = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)red_infrastructure_macros.$list0);
        description = current.first();
        current = current.rest();
        if (red_infrastructure_macros.NIL == current) {
            return (SubLObject)ConsesLow.list((SubLObject)red_infrastructure_macros.$sym13$DEFLEXICAL_PRIVATE, name, (SubLObject)ConsesLow.listS((SubLObject)red_infrastructure_macros.$sym2$RED_DEF_HELPER, (SubLObject)ConsesLow.list((SubLObject)red_infrastructure_macros.$sym3$FIF, (SubLObject)ConsesLow.list((SubLObject)red_infrastructure_macros.$sym4$SYMBOLP, (SubLObject)ConsesLow.list((SubLObject)red_infrastructure_macros.$sym5$QUOTE, key)), (SubLObject)ConsesLow.list((SubLObject)red_infrastructure_macros.$sym6$SYMBOL_VALUE, (SubLObject)ConsesLow.list((SubLObject)red_infrastructure_macros.$sym5$QUOTE, key)), (SubLObject)ConsesLow.list((SubLObject)red_infrastructure_macros.$sym5$QUOTE, key)), (SubLObject)ConsesLow.list((SubLObject)red_infrastructure_macros.$sym5$QUOTE, name), (SubLObject)ConsesLow.list((SubLObject)red_infrastructure_macros.$sym3$FIF, (SubLObject)ConsesLow.list((SubLObject)red_infrastructure_macros.$sym4$SYMBOLP, (SubLObject)ConsesLow.list((SubLObject)red_infrastructure_macros.$sym5$QUOTE, defaultvalue)), (SubLObject)ConsesLow.list((SubLObject)red_infrastructure_macros.$sym6$SYMBOL_VALUE, (SubLObject)ConsesLow.list((SubLObject)red_infrastructure_macros.$sym5$QUOTE, defaultvalue)), (SubLObject)ConsesLow.list((SubLObject)red_infrastructure_macros.$sym5$QUOTE, defaultvalue)), (SubLObject)red_infrastructure_macros.$list23), description);
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)red_infrastructure_macros.$list0);
        return (SubLObject)red_infrastructure_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/red-infrastructure-macros.lisp", position = 13151L)
    public static SubLObject define_red_list_global_public(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject key = (SubLObject)red_infrastructure_macros.NIL;
        SubLObject name = (SubLObject)red_infrastructure_macros.NIL;
        SubLObject defaultvalue = (SubLObject)red_infrastructure_macros.NIL;
        SubLObject description = (SubLObject)red_infrastructure_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)red_infrastructure_macros.$list0);
        key = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)red_infrastructure_macros.$list0);
        name = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)red_infrastructure_macros.$list0);
        defaultvalue = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)red_infrastructure_macros.$list0);
        description = current.first();
        current = current.rest();
        if (red_infrastructure_macros.NIL == current) {
            return (SubLObject)ConsesLow.list((SubLObject)red_infrastructure_macros.$sym14$DEFGLOBAL_PUBLIC, name, (SubLObject)ConsesLow.listS((SubLObject)red_infrastructure_macros.$sym2$RED_DEF_HELPER, (SubLObject)ConsesLow.list((SubLObject)red_infrastructure_macros.$sym3$FIF, (SubLObject)ConsesLow.list((SubLObject)red_infrastructure_macros.$sym4$SYMBOLP, (SubLObject)ConsesLow.list((SubLObject)red_infrastructure_macros.$sym5$QUOTE, key)), (SubLObject)ConsesLow.list((SubLObject)red_infrastructure_macros.$sym6$SYMBOL_VALUE, (SubLObject)ConsesLow.list((SubLObject)red_infrastructure_macros.$sym5$QUOTE, key)), (SubLObject)ConsesLow.list((SubLObject)red_infrastructure_macros.$sym5$QUOTE, key)), (SubLObject)ConsesLow.list((SubLObject)red_infrastructure_macros.$sym5$QUOTE, name), (SubLObject)ConsesLow.list((SubLObject)red_infrastructure_macros.$sym3$FIF, (SubLObject)ConsesLow.list((SubLObject)red_infrastructure_macros.$sym4$SYMBOLP, (SubLObject)ConsesLow.list((SubLObject)red_infrastructure_macros.$sym5$QUOTE, defaultvalue)), (SubLObject)ConsesLow.list((SubLObject)red_infrastructure_macros.$sym6$SYMBOL_VALUE, (SubLObject)ConsesLow.list((SubLObject)red_infrastructure_macros.$sym5$QUOTE, defaultvalue)), (SubLObject)ConsesLow.list((SubLObject)red_infrastructure_macros.$sym5$QUOTE, defaultvalue)), (SubLObject)red_infrastructure_macros.$list24), description);
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)red_infrastructure_macros.$list0);
        return (SubLObject)red_infrastructure_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/red-infrastructure-macros.lisp", position = 13830L)
    public static SubLObject define_red_list_global_protected(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject key = (SubLObject)red_infrastructure_macros.NIL;
        SubLObject name = (SubLObject)red_infrastructure_macros.NIL;
        SubLObject defaultvalue = (SubLObject)red_infrastructure_macros.NIL;
        SubLObject description = (SubLObject)red_infrastructure_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)red_infrastructure_macros.$list0);
        key = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)red_infrastructure_macros.$list0);
        name = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)red_infrastructure_macros.$list0);
        defaultvalue = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)red_infrastructure_macros.$list0);
        description = current.first();
        current = current.rest();
        if (red_infrastructure_macros.NIL == current) {
            return (SubLObject)ConsesLow.list((SubLObject)red_infrastructure_macros.$sym16$DEFGLOBAL_PROTECTED, name, (SubLObject)ConsesLow.listS((SubLObject)red_infrastructure_macros.$sym2$RED_DEF_HELPER, (SubLObject)ConsesLow.list((SubLObject)red_infrastructure_macros.$sym3$FIF, (SubLObject)ConsesLow.list((SubLObject)red_infrastructure_macros.$sym4$SYMBOLP, (SubLObject)ConsesLow.list((SubLObject)red_infrastructure_macros.$sym5$QUOTE, key)), (SubLObject)ConsesLow.list((SubLObject)red_infrastructure_macros.$sym6$SYMBOL_VALUE, (SubLObject)ConsesLow.list((SubLObject)red_infrastructure_macros.$sym5$QUOTE, key)), (SubLObject)ConsesLow.list((SubLObject)red_infrastructure_macros.$sym5$QUOTE, key)), (SubLObject)ConsesLow.list((SubLObject)red_infrastructure_macros.$sym5$QUOTE, name), (SubLObject)ConsesLow.list((SubLObject)red_infrastructure_macros.$sym3$FIF, (SubLObject)ConsesLow.list((SubLObject)red_infrastructure_macros.$sym4$SYMBOLP, (SubLObject)ConsesLow.list((SubLObject)red_infrastructure_macros.$sym5$QUOTE, defaultvalue)), (SubLObject)ConsesLow.list((SubLObject)red_infrastructure_macros.$sym6$SYMBOL_VALUE, (SubLObject)ConsesLow.list((SubLObject)red_infrastructure_macros.$sym5$QUOTE, defaultvalue)), (SubLObject)ConsesLow.list((SubLObject)red_infrastructure_macros.$sym5$QUOTE, defaultvalue)), (SubLObject)red_infrastructure_macros.$list24), description);
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)red_infrastructure_macros.$list0);
        return (SubLObject)red_infrastructure_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/red-infrastructure-macros.lisp", position = 14498L)
    public static SubLObject define_red_list_global_private(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject key = (SubLObject)red_infrastructure_macros.NIL;
        SubLObject name = (SubLObject)red_infrastructure_macros.NIL;
        SubLObject defaultvalue = (SubLObject)red_infrastructure_macros.NIL;
        SubLObject description = (SubLObject)red_infrastructure_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)red_infrastructure_macros.$list0);
        key = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)red_infrastructure_macros.$list0);
        name = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)red_infrastructure_macros.$list0);
        defaultvalue = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)red_infrastructure_macros.$list0);
        description = current.first();
        current = current.rest();
        if (red_infrastructure_macros.NIL == current) {
            return (SubLObject)ConsesLow.list((SubLObject)red_infrastructure_macros.$sym17$DEFGLOBAL_PRIVATE, name, (SubLObject)ConsesLow.listS((SubLObject)red_infrastructure_macros.$sym2$RED_DEF_HELPER, (SubLObject)ConsesLow.list((SubLObject)red_infrastructure_macros.$sym3$FIF, (SubLObject)ConsesLow.list((SubLObject)red_infrastructure_macros.$sym4$SYMBOLP, (SubLObject)ConsesLow.list((SubLObject)red_infrastructure_macros.$sym5$QUOTE, key)), (SubLObject)ConsesLow.list((SubLObject)red_infrastructure_macros.$sym6$SYMBOL_VALUE, (SubLObject)ConsesLow.list((SubLObject)red_infrastructure_macros.$sym5$QUOTE, key)), (SubLObject)ConsesLow.list((SubLObject)red_infrastructure_macros.$sym5$QUOTE, key)), (SubLObject)ConsesLow.list((SubLObject)red_infrastructure_macros.$sym5$QUOTE, name), (SubLObject)ConsesLow.list((SubLObject)red_infrastructure_macros.$sym3$FIF, (SubLObject)ConsesLow.list((SubLObject)red_infrastructure_macros.$sym4$SYMBOLP, (SubLObject)ConsesLow.list((SubLObject)red_infrastructure_macros.$sym5$QUOTE, defaultvalue)), (SubLObject)ConsesLow.list((SubLObject)red_infrastructure_macros.$sym6$SYMBOL_VALUE, (SubLObject)ConsesLow.list((SubLObject)red_infrastructure_macros.$sym5$QUOTE, defaultvalue)), (SubLObject)ConsesLow.list((SubLObject)red_infrastructure_macros.$sym5$QUOTE, defaultvalue)), (SubLObject)red_infrastructure_macros.$list24), description);
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)red_infrastructure_macros.$list0);
        return (SubLObject)red_infrastructure_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/red-infrastructure-macros.lisp", position = 15161L)
    public static SubLObject define_red_list_var_public(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject key = (SubLObject)red_infrastructure_macros.NIL;
        SubLObject name = (SubLObject)red_infrastructure_macros.NIL;
        SubLObject defaultvalue = (SubLObject)red_infrastructure_macros.NIL;
        SubLObject description = (SubLObject)red_infrastructure_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)red_infrastructure_macros.$list0);
        key = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)red_infrastructure_macros.$list0);
        name = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)red_infrastructure_macros.$list0);
        defaultvalue = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)red_infrastructure_macros.$list0);
        description = current.first();
        current = current.rest();
        if (red_infrastructure_macros.NIL == current) {
            return (SubLObject)ConsesLow.list((SubLObject)red_infrastructure_macros.$sym18$DEFVAR_PUBLIC, name, (SubLObject)ConsesLow.listS((SubLObject)red_infrastructure_macros.$sym2$RED_DEF_HELPER, (SubLObject)ConsesLow.list((SubLObject)red_infrastructure_macros.$sym3$FIF, (SubLObject)ConsesLow.list((SubLObject)red_infrastructure_macros.$sym4$SYMBOLP, (SubLObject)ConsesLow.list((SubLObject)red_infrastructure_macros.$sym5$QUOTE, key)), (SubLObject)ConsesLow.list((SubLObject)red_infrastructure_macros.$sym6$SYMBOL_VALUE, (SubLObject)ConsesLow.list((SubLObject)red_infrastructure_macros.$sym5$QUOTE, key)), (SubLObject)ConsesLow.list((SubLObject)red_infrastructure_macros.$sym5$QUOTE, key)), (SubLObject)ConsesLow.list((SubLObject)red_infrastructure_macros.$sym5$QUOTE, name), (SubLObject)ConsesLow.list((SubLObject)red_infrastructure_macros.$sym3$FIF, (SubLObject)ConsesLow.list((SubLObject)red_infrastructure_macros.$sym4$SYMBOLP, (SubLObject)ConsesLow.list((SubLObject)red_infrastructure_macros.$sym5$QUOTE, defaultvalue)), (SubLObject)ConsesLow.list((SubLObject)red_infrastructure_macros.$sym6$SYMBOL_VALUE, (SubLObject)ConsesLow.list((SubLObject)red_infrastructure_macros.$sym5$QUOTE, defaultvalue)), (SubLObject)ConsesLow.list((SubLObject)red_infrastructure_macros.$sym5$QUOTE, defaultvalue)), (SubLObject)red_infrastructure_macros.$list25), description);
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)red_infrastructure_macros.$list0);
        return (SubLObject)red_infrastructure_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/red-infrastructure-macros.lisp", position = 15827L)
    public static SubLObject define_red_list_var_protected(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject key = (SubLObject)red_infrastructure_macros.NIL;
        SubLObject name = (SubLObject)red_infrastructure_macros.NIL;
        SubLObject defaultvalue = (SubLObject)red_infrastructure_macros.NIL;
        SubLObject description = (SubLObject)red_infrastructure_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)red_infrastructure_macros.$list0);
        key = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)red_infrastructure_macros.$list0);
        name = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)red_infrastructure_macros.$list0);
        defaultvalue = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)red_infrastructure_macros.$list0);
        description = current.first();
        current = current.rest();
        if (red_infrastructure_macros.NIL == current) {
            return (SubLObject)ConsesLow.list((SubLObject)red_infrastructure_macros.$sym20$DEFVAR_PROTECTED, name, (SubLObject)ConsesLow.listS((SubLObject)red_infrastructure_macros.$sym2$RED_DEF_HELPER, (SubLObject)ConsesLow.list((SubLObject)red_infrastructure_macros.$sym3$FIF, (SubLObject)ConsesLow.list((SubLObject)red_infrastructure_macros.$sym4$SYMBOLP, (SubLObject)ConsesLow.list((SubLObject)red_infrastructure_macros.$sym5$QUOTE, key)), (SubLObject)ConsesLow.list((SubLObject)red_infrastructure_macros.$sym6$SYMBOL_VALUE, (SubLObject)ConsesLow.list((SubLObject)red_infrastructure_macros.$sym5$QUOTE, key)), (SubLObject)ConsesLow.list((SubLObject)red_infrastructure_macros.$sym5$QUOTE, key)), (SubLObject)ConsesLow.list((SubLObject)red_infrastructure_macros.$sym5$QUOTE, name), (SubLObject)ConsesLow.list((SubLObject)red_infrastructure_macros.$sym3$FIF, (SubLObject)ConsesLow.list((SubLObject)red_infrastructure_macros.$sym4$SYMBOLP, (SubLObject)ConsesLow.list((SubLObject)red_infrastructure_macros.$sym5$QUOTE, defaultvalue)), (SubLObject)ConsesLow.list((SubLObject)red_infrastructure_macros.$sym6$SYMBOL_VALUE, (SubLObject)ConsesLow.list((SubLObject)red_infrastructure_macros.$sym5$QUOTE, defaultvalue)), (SubLObject)ConsesLow.list((SubLObject)red_infrastructure_macros.$sym5$QUOTE, defaultvalue)), (SubLObject)red_infrastructure_macros.$list25), description);
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)red_infrastructure_macros.$list0);
        return (SubLObject)red_infrastructure_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/red-infrastructure-macros.lisp", position = 16483L)
    public static SubLObject define_red_list_var_private(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject key = (SubLObject)red_infrastructure_macros.NIL;
        SubLObject name = (SubLObject)red_infrastructure_macros.NIL;
        SubLObject defaultvalue = (SubLObject)red_infrastructure_macros.NIL;
        SubLObject description = (SubLObject)red_infrastructure_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)red_infrastructure_macros.$list0);
        key = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)red_infrastructure_macros.$list0);
        name = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)red_infrastructure_macros.$list0);
        defaultvalue = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)red_infrastructure_macros.$list0);
        description = current.first();
        current = current.rest();
        if (red_infrastructure_macros.NIL == current) {
            return (SubLObject)ConsesLow.list((SubLObject)red_infrastructure_macros.$sym21$DEFVAR_PRIVATE, name, (SubLObject)ConsesLow.listS((SubLObject)red_infrastructure_macros.$sym2$RED_DEF_HELPER, (SubLObject)ConsesLow.list((SubLObject)red_infrastructure_macros.$sym3$FIF, (SubLObject)ConsesLow.list((SubLObject)red_infrastructure_macros.$sym4$SYMBOLP, (SubLObject)ConsesLow.list((SubLObject)red_infrastructure_macros.$sym5$QUOTE, key)), (SubLObject)ConsesLow.list((SubLObject)red_infrastructure_macros.$sym6$SYMBOL_VALUE, (SubLObject)ConsesLow.list((SubLObject)red_infrastructure_macros.$sym5$QUOTE, key)), (SubLObject)ConsesLow.list((SubLObject)red_infrastructure_macros.$sym5$QUOTE, key)), (SubLObject)ConsesLow.list((SubLObject)red_infrastructure_macros.$sym5$QUOTE, name), (SubLObject)ConsesLow.list((SubLObject)red_infrastructure_macros.$sym3$FIF, (SubLObject)ConsesLow.list((SubLObject)red_infrastructure_macros.$sym4$SYMBOLP, (SubLObject)ConsesLow.list((SubLObject)red_infrastructure_macros.$sym5$QUOTE, defaultvalue)), (SubLObject)ConsesLow.list((SubLObject)red_infrastructure_macros.$sym6$SYMBOL_VALUE, (SubLObject)ConsesLow.list((SubLObject)red_infrastructure_macros.$sym5$QUOTE, defaultvalue)), (SubLObject)ConsesLow.list((SubLObject)red_infrastructure_macros.$sym5$QUOTE, defaultvalue)), (SubLObject)red_infrastructure_macros.$list25), description);
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)red_infrastructure_macros.$list0);
        return (SubLObject)red_infrastructure_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/red-infrastructure-macros.lisp", position = 17135L)
    public static SubLObject red_reinitialize_variable(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject name = (SubLObject)red_infrastructure_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)red_infrastructure_macros.$list26);
        name = current.first();
        current = current.rest();
        if (red_infrastructure_macros.NIL == current) {
            return (SubLObject)ConsesLow.list((SubLObject)red_infrastructure_macros.$sym27$RED_REINITIALIZE_VARIABLE_HELPER, (SubLObject)ConsesLow.list((SubLObject)red_infrastructure_macros.$sym5$QUOTE, name));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)red_infrastructure_macros.$list26);
        return (SubLObject)red_infrastructure_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/red-infrastructure-macros.lisp", position = 17262L)
    public static SubLObject red_def_helper(final SubLObject key, final SubLObject name, final SubLObject defaultvalue, final SubLObject ltype, SubLObject valuetype) {
        if (valuetype == red_infrastructure_macros.UNPROVIDED) {
            valuetype = (SubLObject)red_infrastructure_macros.$kw29$SIMPLE;
        }
        final SubLObject red_sym = red_infrastructure.new_red_symbol(key, name, defaultvalue, ltype, valuetype);
        red_infrastructure.register_red(red_sym);
        return red_infrastructure.red_value(red_sym);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/red-infrastructure-macros.lisp", position = 18494L)
    public static SubLObject red_reinitialize_variable_helper(final SubLObject name) {
        final SubLObject red_sym = dictionary.dictionary_lookup(red_infrastructure.$red_variables_dictionary$.getGlobalValue(), name, (SubLObject)red_infrastructure_macros.UNPROVIDED);
        if (red_infrastructure_macros.NIL != red_sym) {
            red_infrastructure._csetf_red_symbol_set_from_red(red_sym, (SubLObject)red_infrastructure_macros.NIL);
            Symbols.set(red_infrastructure.red_symbol_name(red_sym), red_infrastructure.red_value(red_sym));
            return (SubLObject)red_infrastructure_macros.T;
        }
        return (SubLObject)red_infrastructure_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/red-infrastructure-macros.lisp", position = 22466L)
    public static SubLObject red_infa_unit_test() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject save_red_variables_dictionary = (SubLObject)red_infrastructure_macros.NIL;
        SubLObject save_red_symbols_list = (SubLObject)red_infrastructure_macros.NIL;
        SubLObject save_repositories_loaded = (SubLObject)red_infrastructure_macros.NIL;
        SubLObject errors = (SubLObject)red_infrastructure_macros.NIL;
        save_red_variables_dictionary = red_infrastructure.$red_variables_dictionary$.getGlobalValue();
        red_infrastructure.$red_variables_dictionary$.setGlobalValue(dictionary.new_dictionary((SubLObject)red_infrastructure_macros.UNPROVIDED, (SubLObject)red_infrastructure_macros.UNPROVIDED));
        save_red_symbols_list = red_infrastructure.$red_symbols_list$.getGlobalValue();
        red_infrastructure.$red_symbols_list$.setGlobalValue((SubLObject)red_infrastructure_macros.NIL);
        save_repositories_loaded = red_infrastructure.$repositories_loaded$.getGlobalValue();
        red_infrastructure.$repositories_loaded$.setGlobalValue((SubLObject)red_infrastructure_macros.NIL);
        red_infrastructure_macros.$reddef_gbl_publ$.setGlobalValue(red_infrastructure_macros.$red_infrastructure_test_default$.getGlobalValue());
        red_infrastructure_macros.$reddef_gbl_prot$.setGlobalValue(red_infrastructure_macros.$red_infrastructure_test_default$.getGlobalValue());
        red_infrastructure_macros.$reddef_gbl_prvt$.setGlobalValue(red_infrastructure_macros.$red_infrastructure_test_default$.getGlobalValue());
        red_infrastructure_macros.$reddef_lex_publ$.setGlobalValue(red_infrastructure_macros.$red_infrastructure_test_default$.getGlobalValue());
        red_infrastructure_macros.$reddef_lex_prot$.setGlobalValue(red_infrastructure_macros.$red_infrastructure_test_default$.getGlobalValue());
        red_infrastructure_macros.$reddef_lex_prvt$.setGlobalValue(red_infrastructure_macros.$red_infrastructure_test_default$.getGlobalValue());
        red_infrastructure_macros.$reddef_lex_prvt_2$.setGlobalValue(red_infrastructure_macros.$red_infrastructure_test_default$.getGlobalValue());
        red_infrastructure_macros.$reddef_par_publ$.setDynamicValue(red_infrastructure_macros.$red_infrastructure_test_default$.getGlobalValue(), thread);
        red_infrastructure_macros.$reddef_par_prot$.setDynamicValue(red_infrastructure_macros.$red_infrastructure_test_default$.getGlobalValue(), thread);
        red_infrastructure_macros.$reddef_par_prvt$.setDynamicValue(red_infrastructure_macros.$red_infrastructure_test_default$.getGlobalValue(), thread);
        red_infrastructure_macros.$reddef_var_publ$.setDynamicValue(red_infrastructure_macros.$red_infrastructure_test_default$.getGlobalValue(), thread);
        red_infrastructure_macros.$reddef_var_prot$.setDynamicValue(red_infrastructure_macros.$red_infrastructure_test_default$.getGlobalValue(), thread);
        red_infrastructure_macros.$reddef_var_prvt$.setDynamicValue(red_infrastructure_macros.$red_infrastructure_test_default$.getGlobalValue(), thread);
        red_infrastructure.register_red(red_infrastructure.new_red_symbol(red_infrastructure_macros.$red_infrastructure_test_key$.getGlobalValue(), (SubLObject)red_infrastructure_macros.$sym40$REDDEF_LEX_PUBL, red_infrastructure_macros.$red_infrastructure_test_default$.getGlobalValue(), (SubLObject)red_infrastructure_macros.$kw35$LEXICAL, (SubLObject)red_infrastructure_macros.UNPROVIDED));
        red_infrastructure.register_red(red_infrastructure.new_red_symbol(red_infrastructure_macros.$red_infrastructure_test_key$.getGlobalValue(), (SubLObject)red_infrastructure_macros.$sym39$REDDEF_LEX_PROT, red_infrastructure_macros.$red_infrastructure_test_default$.getGlobalValue(), (SubLObject)red_infrastructure_macros.$kw35$LEXICAL, (SubLObject)red_infrastructure_macros.UNPROVIDED));
        red_infrastructure.register_red(red_infrastructure.new_red_symbol(red_infrastructure_macros.$red_infrastructure_test_key$.getGlobalValue(), (SubLObject)red_infrastructure_macros.$sym37$REDDEF_LEX_PRVT, red_infrastructure_macros.$red_infrastructure_test_default$.getGlobalValue(), (SubLObject)red_infrastructure_macros.$kw35$LEXICAL, (SubLObject)red_infrastructure_macros.UNPROVIDED));
        red_infrastructure.register_red(red_infrastructure.new_red_symbol(red_infrastructure_macros.$red_infrastructure_test_key$.getGlobalValue(), (SubLObject)red_infrastructure_macros.$sym34$REDDEF_LEX_PRVT_2, red_infrastructure_macros.$red_infrastructure_test_default$.getGlobalValue(), (SubLObject)red_infrastructure_macros.$kw35$LEXICAL, (SubLObject)red_infrastructure_macros.UNPROVIDED));
        red_infrastructure.register_red(red_infrastructure.new_red_symbol(red_infrastructure_macros.$red_infrastructure_test_key$.getGlobalValue(), (SubLObject)red_infrastructure_macros.$sym52$REDDEF_GBL_PUBL, red_infrastructure_macros.$red_infrastructure_test_default$.getGlobalValue(), (SubLObject)red_infrastructure_macros.$kw50$GLOBAL, (SubLObject)red_infrastructure_macros.UNPROVIDED));
        red_infrastructure.register_red(red_infrastructure.new_red_symbol(red_infrastructure_macros.$red_infrastructure_test_key$.getGlobalValue(), (SubLObject)red_infrastructure_macros.$sym51$REDDEF_GBL_PROT, red_infrastructure_macros.$red_infrastructure_test_default$.getGlobalValue(), (SubLObject)red_infrastructure_macros.$kw50$GLOBAL, (SubLObject)red_infrastructure_macros.UNPROVIDED));
        red_infrastructure.register_red(red_infrastructure.new_red_symbol(red_infrastructure_macros.$red_infrastructure_test_key$.getGlobalValue(), (SubLObject)red_infrastructure_macros.$sym49$REDDEF_GBL_PRVT, red_infrastructure_macros.$red_infrastructure_test_default$.getGlobalValue(), (SubLObject)red_infrastructure_macros.$kw50$GLOBAL, (SubLObject)red_infrastructure_macros.UNPROVIDED));
        red_infrastructure.register_red(red_infrastructure.new_red_symbol(red_infrastructure_macros.$red_infrastructure_test_key$.getGlobalValue(), (SubLObject)red_infrastructure_macros.$sym44$REDDEF_PAR_PUBL, red_infrastructure_macros.$red_infrastructure_test_default$.getGlobalValue(), (SubLObject)red_infrastructure_macros.$kw42$PARAMETER, (SubLObject)red_infrastructure_macros.UNPROVIDED));
        red_infrastructure.register_red(red_infrastructure.new_red_symbol(red_infrastructure_macros.$red_infrastructure_test_key$.getGlobalValue(), (SubLObject)red_infrastructure_macros.$sym43$REDDEF_PAR_PROT, red_infrastructure_macros.$red_infrastructure_test_default$.getGlobalValue(), (SubLObject)red_infrastructure_macros.$kw42$PARAMETER, (SubLObject)red_infrastructure_macros.UNPROVIDED));
        red_infrastructure.register_red(red_infrastructure.new_red_symbol(red_infrastructure_macros.$red_infrastructure_test_key$.getGlobalValue(), (SubLObject)red_infrastructure_macros.$sym41$REDDEF_PAR_PRVT, red_infrastructure_macros.$red_infrastructure_test_default$.getGlobalValue(), (SubLObject)red_infrastructure_macros.$kw42$PARAMETER, (SubLObject)red_infrastructure_macros.UNPROVIDED));
        red_infrastructure.register_red(red_infrastructure.new_red_symbol(red_infrastructure_macros.$red_infrastructure_test_key$.getGlobalValue(), (SubLObject)red_infrastructure_macros.$sym48$REDDEF_VAR_PUBL, red_infrastructure_macros.$red_infrastructure_test_default$.getGlobalValue(), (SubLObject)red_infrastructure_macros.$kw46$VAR, (SubLObject)red_infrastructure_macros.UNPROVIDED));
        red_infrastructure.register_red(red_infrastructure.new_red_symbol(red_infrastructure_macros.$red_infrastructure_test_key$.getGlobalValue(), (SubLObject)red_infrastructure_macros.$sym47$REDDEF_VAR_PROT, red_infrastructure_macros.$red_infrastructure_test_default$.getGlobalValue(), (SubLObject)red_infrastructure_macros.$kw46$VAR, (SubLObject)red_infrastructure_macros.UNPROVIDED));
        red_infrastructure.register_red(red_infrastructure.new_red_symbol(red_infrastructure_macros.$red_infrastructure_test_key$.getGlobalValue(), (SubLObject)red_infrastructure_macros.$sym45$REDDEF_VAR_PRVT, red_infrastructure_macros.$red_infrastructure_test_default$.getGlobalValue(), (SubLObject)red_infrastructure_macros.$kw46$VAR, (SubLObject)red_infrastructure_macros.UNPROVIDED));
        if (!red_infrastructure_macros.$reddef_gbl_publ$.getGlobalValue().equal(red_infrastructure_macros.$red_infrastructure_test_default$.getGlobalValue())) {
            errors = (SubLObject)ConsesLow.cons(PrintLow.format((SubLObject)red_infrastructure_macros.NIL, (SubLObject)red_infrastructure_macros.$str53$reddef_gbl_publ_didn_t_have_the_d, red_infrastructure_macros.$red_infrastructure_test_default$.getGlobalValue(), red_infrastructure_macros.$reddef_gbl_publ$.getGlobalValue()), errors);
        }
        if (!red_infrastructure_macros.$reddef_gbl_prot$.getGlobalValue().equal(red_infrastructure_macros.$red_infrastructure_test_default$.getGlobalValue())) {
            errors = (SubLObject)ConsesLow.cons(PrintLow.format((SubLObject)red_infrastructure_macros.NIL, (SubLObject)red_infrastructure_macros.$str54$reddef_gbl_prot_didn_t_have_the_d, red_infrastructure_macros.$red_infrastructure_test_default$.getGlobalValue(), red_infrastructure_macros.$reddef_gbl_prot$.getGlobalValue()), errors);
        }
        if (!red_infrastructure_macros.$reddef_gbl_prvt$.getGlobalValue().equal(red_infrastructure_macros.$red_infrastructure_test_default$.getGlobalValue())) {
            errors = (SubLObject)ConsesLow.cons(PrintLow.format((SubLObject)red_infrastructure_macros.NIL, (SubLObject)red_infrastructure_macros.$str55$reddef_gbl_prvt_didn_t_have_the_d, red_infrastructure_macros.$red_infrastructure_test_default$.getGlobalValue(), red_infrastructure_macros.$reddef_gbl_prvt$.getGlobalValue()), errors);
        }
        if (!red_infrastructure_macros.$reddef_var_publ$.getDynamicValue(thread).equal(red_infrastructure_macros.$red_infrastructure_test_default$.getGlobalValue())) {
            errors = (SubLObject)ConsesLow.cons(PrintLow.format((SubLObject)red_infrastructure_macros.NIL, (SubLObject)red_infrastructure_macros.$str56$reddef_var_publ_didn_t_have_the_d, red_infrastructure_macros.$red_infrastructure_test_default$.getGlobalValue(), red_infrastructure_macros.$reddef_var_publ$.getDynamicValue(thread)), errors);
        }
        if (!red_infrastructure_macros.$reddef_var_prot$.getDynamicValue(thread).equal(red_infrastructure_macros.$red_infrastructure_test_default$.getGlobalValue())) {
            errors = (SubLObject)ConsesLow.cons(PrintLow.format((SubLObject)red_infrastructure_macros.NIL, (SubLObject)red_infrastructure_macros.$str57$reddef_var_prot_didn_t_have_the_d, red_infrastructure_macros.$red_infrastructure_test_default$.getGlobalValue(), red_infrastructure_macros.$reddef_var_prot$.getDynamicValue(thread)), errors);
        }
        if (!red_infrastructure_macros.$reddef_var_prvt$.getDynamicValue(thread).equal(red_infrastructure_macros.$red_infrastructure_test_default$.getGlobalValue())) {
            errors = (SubLObject)ConsesLow.cons(PrintLow.format((SubLObject)red_infrastructure_macros.NIL, (SubLObject)red_infrastructure_macros.$str58$reddef_var_prvt_didn_t_have_the_d, red_infrastructure_macros.$red_infrastructure_test_default$.getGlobalValue(), red_infrastructure_macros.$reddef_var_prvt$.getDynamicValue(thread)), errors);
        }
        if (!red_infrastructure_macros.$reddef_lex_publ$.getGlobalValue().equal(red_infrastructure_macros.$red_infrastructure_test_default$.getGlobalValue())) {
            errors = (SubLObject)ConsesLow.cons(PrintLow.format((SubLObject)red_infrastructure_macros.NIL, (SubLObject)red_infrastructure_macros.$str59$reddef_lex_publ_didn_t_have_the_d, red_infrastructure_macros.$red_infrastructure_test_default$.getGlobalValue(), red_infrastructure_macros.$reddef_lex_publ$.getGlobalValue()), errors);
        }
        if (!red_infrastructure_macros.$reddef_lex_prot$.getGlobalValue().equal(red_infrastructure_macros.$red_infrastructure_test_default$.getGlobalValue())) {
            errors = (SubLObject)ConsesLow.cons(PrintLow.format((SubLObject)red_infrastructure_macros.NIL, (SubLObject)red_infrastructure_macros.$str60$reddef_lex_prot_didn_t_have_the_d, red_infrastructure_macros.$red_infrastructure_test_default$.getGlobalValue(), red_infrastructure_macros.$reddef_lex_prot$.getGlobalValue()), errors);
        }
        if (!red_infrastructure_macros.$reddef_lex_prvt$.getGlobalValue().equal(red_infrastructure_macros.$red_infrastructure_test_default$.getGlobalValue())) {
            errors = (SubLObject)ConsesLow.cons(PrintLow.format((SubLObject)red_infrastructure_macros.NIL, (SubLObject)red_infrastructure_macros.$str61$reddef_lex_prvt_didn_t_have_the_d, red_infrastructure_macros.$red_infrastructure_test_default$.getGlobalValue(), red_infrastructure_macros.$reddef_lex_prvt$.getGlobalValue()), errors);
        }
        if (!red_infrastructure_macros.$reddef_lex_prvt_2$.getGlobalValue().equal(red_infrastructure_macros.$red_infrastructure_test_default$.getGlobalValue())) {
            errors = (SubLObject)ConsesLow.cons(PrintLow.format((SubLObject)red_infrastructure_macros.NIL, (SubLObject)red_infrastructure_macros.$str62$reddef_lex_prvt_2_didn_t_have_the, red_infrastructure_macros.$red_infrastructure_test_default$.getGlobalValue(), red_infrastructure_macros.$reddef_lex_prvt_2$.getGlobalValue()), errors);
        }
        if (!red_infrastructure_macros.$reddef_par_publ$.getDynamicValue(thread).equal(red_infrastructure_macros.$red_infrastructure_test_default$.getGlobalValue())) {
            errors = (SubLObject)ConsesLow.cons(PrintLow.format((SubLObject)red_infrastructure_macros.NIL, (SubLObject)red_infrastructure_macros.$str63$reddef_par_publ_didn_t_have_the_d, red_infrastructure_macros.$red_infrastructure_test_default$.getGlobalValue(), red_infrastructure_macros.$reddef_par_publ$.getDynamicValue(thread)), errors);
        }
        if (!red_infrastructure_macros.$reddef_par_prot$.getDynamicValue(thread).equal(red_infrastructure_macros.$red_infrastructure_test_default$.getGlobalValue())) {
            errors = (SubLObject)ConsesLow.cons(PrintLow.format((SubLObject)red_infrastructure_macros.NIL, (SubLObject)red_infrastructure_macros.$str64$reddef_par_prot_didn_t_have_the_d, red_infrastructure_macros.$red_infrastructure_test_default$.getGlobalValue(), red_infrastructure_macros.$reddef_par_prot$.getDynamicValue(thread)), errors);
        }
        if (!red_infrastructure_macros.$reddef_par_prvt$.getDynamicValue(thread).equal(red_infrastructure_macros.$red_infrastructure_test_default$.getGlobalValue())) {
            errors = (SubLObject)ConsesLow.cons(PrintLow.format((SubLObject)red_infrastructure_macros.NIL, (SubLObject)red_infrastructure_macros.$str65$reddef_par_prvt_didn_t_have_the_d, red_infrastructure_macros.$red_infrastructure_test_default$.getGlobalValue(), red_infrastructure_macros.$reddef_par_prvt$.getDynamicValue(thread)), errors);
        }
        red_infrastructure.set_red_symbols();
        if (!red_infrastructure_macros.$reddef_gbl_publ$.getGlobalValue().equal(red_infrastructure_macros.$red_infrastructure_test_red_value$.getGlobalValue())) {
            errors = (SubLObject)ConsesLow.cons(PrintLow.format((SubLObject)red_infrastructure_macros.NIL, (SubLObject)red_infrastructure_macros.$str66$reddef_gbl_publ_didn_t_have_the_v, red_infrastructure_macros.$red_infrastructure_test_red_value$.getGlobalValue(), red_infrastructure_macros.$reddef_gbl_publ$.getGlobalValue()), errors);
        }
        if (!red_infrastructure_macros.$reddef_gbl_prot$.getGlobalValue().equal(red_infrastructure_macros.$red_infrastructure_test_red_value$.getGlobalValue())) {
            errors = (SubLObject)ConsesLow.cons(PrintLow.format((SubLObject)red_infrastructure_macros.NIL, (SubLObject)red_infrastructure_macros.$str67$reddef_gbl_prot_didn_t_have_the_v, red_infrastructure_macros.$red_infrastructure_test_red_value$.getGlobalValue(), red_infrastructure_macros.$reddef_gbl_prot$.getGlobalValue()), errors);
        }
        if (!red_infrastructure_macros.$reddef_gbl_prvt$.getGlobalValue().equal(red_infrastructure_macros.$red_infrastructure_test_red_value$.getGlobalValue())) {
            errors = (SubLObject)ConsesLow.cons(PrintLow.format((SubLObject)red_infrastructure_macros.NIL, (SubLObject)red_infrastructure_macros.$str68$reddef_gbl_prvt_didn_t_have_the_v, red_infrastructure_macros.$red_infrastructure_test_red_value$.getGlobalValue(), red_infrastructure_macros.$reddef_gbl_prvt$.getGlobalValue()), errors);
        }
        if (!red_infrastructure_macros.$reddef_var_publ$.getDynamicValue(thread).equal(red_infrastructure_macros.$red_infrastructure_test_red_value$.getGlobalValue())) {
            errors = (SubLObject)ConsesLow.cons(PrintLow.format((SubLObject)red_infrastructure_macros.NIL, (SubLObject)red_infrastructure_macros.$str69$reddef_var_publ_didn_t_have_the_v, red_infrastructure_macros.$red_infrastructure_test_red_value$.getGlobalValue(), red_infrastructure_macros.$reddef_var_publ$.getDynamicValue(thread)), errors);
        }
        if (!red_infrastructure_macros.$reddef_var_prot$.getDynamicValue(thread).equal(red_infrastructure_macros.$red_infrastructure_test_red_value$.getGlobalValue())) {
            errors = (SubLObject)ConsesLow.cons(PrintLow.format((SubLObject)red_infrastructure_macros.NIL, (SubLObject)red_infrastructure_macros.$str70$reddef_var_prot_didn_t_have_the_v, red_infrastructure_macros.$red_infrastructure_test_red_value$.getGlobalValue(), red_infrastructure_macros.$reddef_var_prot$.getDynamicValue(thread)), errors);
        }
        if (!red_infrastructure_macros.$reddef_var_prvt$.getDynamicValue(thread).equal(red_infrastructure_macros.$red_infrastructure_test_red_value$.getGlobalValue())) {
            errors = (SubLObject)ConsesLow.cons(PrintLow.format((SubLObject)red_infrastructure_macros.NIL, (SubLObject)red_infrastructure_macros.$str71$reddef_var_prvt_didn_t_have_the_v, red_infrastructure_macros.$red_infrastructure_test_red_value$.getGlobalValue(), red_infrastructure_macros.$reddef_var_prvt$.getDynamicValue(thread)), errors);
        }
        if (!red_infrastructure_macros.$reddef_lex_publ$.getGlobalValue().equal(red_infrastructure_macros.$red_infrastructure_test_red_value$.getGlobalValue())) {
            errors = (SubLObject)ConsesLow.cons(PrintLow.format((SubLObject)red_infrastructure_macros.NIL, (SubLObject)red_infrastructure_macros.$str72$reddef_lex_publ_didn_t_have_the_v, red_infrastructure_macros.$red_infrastructure_test_red_value$.getGlobalValue(), red_infrastructure_macros.$reddef_lex_publ$.getGlobalValue()), errors);
        }
        if (!red_infrastructure_macros.$reddef_lex_prot$.getGlobalValue().equal(red_infrastructure_macros.$red_infrastructure_test_red_value$.getGlobalValue())) {
            errors = (SubLObject)ConsesLow.cons(PrintLow.format((SubLObject)red_infrastructure_macros.NIL, (SubLObject)red_infrastructure_macros.$str73$reddef_lex_prot_didn_t_have_the_v, red_infrastructure_macros.$red_infrastructure_test_red_value$.getGlobalValue(), red_infrastructure_macros.$reddef_lex_prot$.getGlobalValue()), errors);
        }
        if (!red_infrastructure_macros.$reddef_lex_prvt$.getGlobalValue().equal(red_infrastructure_macros.$red_infrastructure_test_red_value$.getGlobalValue())) {
            errors = (SubLObject)ConsesLow.cons(PrintLow.format((SubLObject)red_infrastructure_macros.NIL, (SubLObject)red_infrastructure_macros.$str74$reddef_lex_prvt_didn_t_have_the_v, red_infrastructure_macros.$red_infrastructure_test_red_value$.getGlobalValue(), red_infrastructure_macros.$reddef_lex_prvt$.getGlobalValue()), errors);
        }
        if (!red_infrastructure_macros.$reddef_lex_prvt_2$.getGlobalValue().equal(red_infrastructure_macros.$red_infrastructure_test_red_value$.getGlobalValue())) {
            errors = (SubLObject)ConsesLow.cons(PrintLow.format((SubLObject)red_infrastructure_macros.NIL, (SubLObject)red_infrastructure_macros.$str75$reddef_lex_prvt_2_didn_t_have_the, red_infrastructure_macros.$red_infrastructure_test_red_value$.getGlobalValue(), red_infrastructure_macros.$reddef_lex_prvt_2$.getGlobalValue()), errors);
        }
        if (!red_infrastructure_macros.$reddef_par_publ$.getDynamicValue(thread).equal(red_infrastructure_macros.$red_infrastructure_test_red_value$.getGlobalValue())) {
            errors = (SubLObject)ConsesLow.cons(PrintLow.format((SubLObject)red_infrastructure_macros.NIL, (SubLObject)red_infrastructure_macros.$str76$reddef_par_publ_didn_t_have_the_v, red_infrastructure_macros.$red_infrastructure_test_red_value$.getGlobalValue(), red_infrastructure_macros.$reddef_par_publ$.getDynamicValue(thread)), errors);
        }
        if (!red_infrastructure_macros.$reddef_par_prot$.getDynamicValue(thread).equal(red_infrastructure_macros.$red_infrastructure_test_red_value$.getGlobalValue())) {
            errors = (SubLObject)ConsesLow.cons(PrintLow.format((SubLObject)red_infrastructure_macros.NIL, (SubLObject)red_infrastructure_macros.$str77$reddef_par_prot_didn_t_have_the_v, red_infrastructure_macros.$red_infrastructure_test_red_value$.getGlobalValue(), red_infrastructure_macros.$reddef_par_prot$.getDynamicValue(thread)), errors);
        }
        if (!red_infrastructure_macros.$reddef_par_prvt$.getDynamicValue(thread).equal(red_infrastructure_macros.$red_infrastructure_test_red_value$.getGlobalValue())) {
            errors = (SubLObject)ConsesLow.cons(PrintLow.format((SubLObject)red_infrastructure_macros.NIL, (SubLObject)red_infrastructure_macros.$str78$reddef_par_prvt_didn_t_have_the_v, red_infrastructure_macros.$red_infrastructure_test_red_value$.getGlobalValue(), red_infrastructure_macros.$reddef_par_prvt$.getDynamicValue(thread)), errors);
        }
        red_infrastructure.$red_variables_dictionary$.setGlobalValue(save_red_variables_dictionary);
        red_infrastructure.$red_symbols_list$.setGlobalValue(save_red_symbols_list);
        red_infrastructure.$repositories_loaded$.setGlobalValue(save_repositories_loaded);
        return Sequences.nreverse(errors);
    }
    
    public static SubLObject declare_red_infrastructure_macros_file() {
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.red_infrastructure_macros", "define_red_parameter_public", "DEFINE-RED-PARAMETER-PUBLIC");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.red_infrastructure_macros", "define_red_parameter_protected", "DEFINE-RED-PARAMETER-PROTECTED");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.red_infrastructure_macros", "define_red_parameter_private", "DEFINE-RED-PARAMETER-PRIVATE");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.red_infrastructure_macros", "define_red_lexical_public", "DEFINE-RED-LEXICAL-PUBLIC");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.red_infrastructure_macros", "define_red_lexical_protected", "DEFINE-RED-LEXICAL-PROTECTED");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.red_infrastructure_macros", "define_red_lexical_private", "DEFINE-RED-LEXICAL-PRIVATE");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.red_infrastructure_macros", "define_red_global_public", "DEFINE-RED-GLOBAL-PUBLIC");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.red_infrastructure_macros", "define_red_global_protected", "DEFINE-RED-GLOBAL-PROTECTED");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.red_infrastructure_macros", "define_red_global_private", "DEFINE-RED-GLOBAL-PRIVATE");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.red_infrastructure_macros", "define_red_var_public", "DEFINE-RED-VAR-PUBLIC");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.red_infrastructure_macros", "define_red_var_protected", "DEFINE-RED-VAR-PROTECTED");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.red_infrastructure_macros", "define_red_var_private", "DEFINE-RED-VAR-PRIVATE");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.red_infrastructure_macros", "define_red_list_parameter_public", "DEFINE-RED-LIST-PARAMETER-PUBLIC");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.red_infrastructure_macros", "define_red_list_parameter_protected", "DEFINE-RED-LIST-PARAMETER-PROTECTED");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.red_infrastructure_macros", "define_red_list_parameter_private", "DEFINE-RED-LIST-PARAMETER-PRIVATE");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.red_infrastructure_macros", "define_red_list_lexical_public", "DEFINE-RED-LIST-LEXICAL-PUBLIC");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.red_infrastructure_macros", "define_red_list_lexical_protected", "DEFINE-RED-LIST-LEXICAL-PROTECTED");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.red_infrastructure_macros", "define_red_list_lexical_private", "DEFINE-RED-LIST-LEXICAL-PRIVATE");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.red_infrastructure_macros", "define_red_list_global_public", "DEFINE-RED-LIST-GLOBAL-PUBLIC");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.red_infrastructure_macros", "define_red_list_global_protected", "DEFINE-RED-LIST-GLOBAL-PROTECTED");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.red_infrastructure_macros", "define_red_list_global_private", "DEFINE-RED-LIST-GLOBAL-PRIVATE");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.red_infrastructure_macros", "define_red_list_var_public", "DEFINE-RED-LIST-VAR-PUBLIC");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.red_infrastructure_macros", "define_red_list_var_protected", "DEFINE-RED-LIST-VAR-PROTECTED");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.red_infrastructure_macros", "define_red_list_var_private", "DEFINE-RED-LIST-VAR-PRIVATE");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.red_infrastructure_macros", "red_reinitialize_variable", "RED-REINITIALIZE-VARIABLE");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.red_infrastructure_macros", "red_def_helper", "RED-DEF-HELPER", 4, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.red_infrastructure_macros", "red_reinitialize_variable_helper", "RED-REINITIALIZE-VARIABLE-HELPER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.red_infrastructure_macros", "red_infa_unit_test", "RED-INFA-UNIT-TEST", 0, 0, false);
        return (SubLObject)red_infrastructure_macros.NIL;
    }
    
    public static SubLObject init_red_infrastructure_macros_file() {
        red_infrastructure_macros.$red_infrastructure_test_key$ = SubLFiles.defconstant("*RED-INFRASTRUCTURE-TEST-KEY*", (SubLObject)red_infrastructure_macros.$list31);
        red_infrastructure_macros.$red_infrastructure_test_default$ = SubLFiles.defconstant("*RED-INFRASTRUCTURE-TEST-DEFAULT*", (SubLObject)red_infrastructure_macros.$str32$dflt);
        red_infrastructure_macros.$red_infrastructure_test_red_value$ = SubLFiles.defconstant("*RED-INFRASTRUCTURE-TEST-RED-VALUE*", (SubLObject)red_infrastructure_macros.$str33$_cyc_CycC_Linux_head_run_world_la);
        red_infrastructure_macros.$reddef_lex_prvt_2$ = SubLFiles.deflexical("REDDEF-LEX-PRVT-2", red_def_helper((SubLObject)(red_infrastructure_macros.$list31.isSymbol() ? Symbols.symbol_value((SubLObject)red_infrastructure_macros.$list31) : red_infrastructure_macros.$list31), (SubLObject)red_infrastructure_macros.$sym34$REDDEF_LEX_PRVT_2, (SubLObject)(red_infrastructure_macros.$str32$dflt.isSymbol() ? Symbols.symbol_value((SubLObject)red_infrastructure_macros.$str32$dflt) : red_infrastructure_macros.$str32$dflt), (SubLObject)red_infrastructure_macros.$kw35$LEXICAL, (SubLObject)red_infrastructure_macros.UNPROVIDED));
        red_infrastructure_macros.$reddef_lex_prvt$ = SubLFiles.deflexical("REDDEF-LEX-PRVT", red_def_helper((SubLObject)(red_infrastructure_macros.$sym36$_RED_INFRASTRUCTURE_TEST_KEY_.isSymbol() ? Symbols.symbol_value((SubLObject)red_infrastructure_macros.$sym36$_RED_INFRASTRUCTURE_TEST_KEY_) : red_infrastructure_macros.$sym36$_RED_INFRASTRUCTURE_TEST_KEY_), (SubLObject)red_infrastructure_macros.$sym37$REDDEF_LEX_PRVT, (SubLObject)(red_infrastructure_macros.$sym38$_RED_INFRASTRUCTURE_TEST_DEFAULT_.isSymbol() ? Symbols.symbol_value((SubLObject)red_infrastructure_macros.$sym38$_RED_INFRASTRUCTURE_TEST_DEFAULT_) : red_infrastructure_macros.$sym38$_RED_INFRASTRUCTURE_TEST_DEFAULT_), (SubLObject)red_infrastructure_macros.$kw35$LEXICAL, (SubLObject)red_infrastructure_macros.UNPROVIDED));
        red_infrastructure_macros.$reddef_lex_prot$ = SubLFiles.deflexical("REDDEF-LEX-PROT", red_def_helper((SubLObject)(red_infrastructure_macros.$sym36$_RED_INFRASTRUCTURE_TEST_KEY_.isSymbol() ? Symbols.symbol_value((SubLObject)red_infrastructure_macros.$sym36$_RED_INFRASTRUCTURE_TEST_KEY_) : red_infrastructure_macros.$sym36$_RED_INFRASTRUCTURE_TEST_KEY_), (SubLObject)red_infrastructure_macros.$sym39$REDDEF_LEX_PROT, (SubLObject)(red_infrastructure_macros.$sym38$_RED_INFRASTRUCTURE_TEST_DEFAULT_.isSymbol() ? Symbols.symbol_value((SubLObject)red_infrastructure_macros.$sym38$_RED_INFRASTRUCTURE_TEST_DEFAULT_) : red_infrastructure_macros.$sym38$_RED_INFRASTRUCTURE_TEST_DEFAULT_), (SubLObject)red_infrastructure_macros.$kw35$LEXICAL, (SubLObject)red_infrastructure_macros.UNPROVIDED));
        red_infrastructure_macros.$reddef_lex_publ$ = SubLFiles.deflexical("REDDEF-LEX-PUBL", red_def_helper((SubLObject)(red_infrastructure_macros.$sym36$_RED_INFRASTRUCTURE_TEST_KEY_.isSymbol() ? Symbols.symbol_value((SubLObject)red_infrastructure_macros.$sym36$_RED_INFRASTRUCTURE_TEST_KEY_) : red_infrastructure_macros.$sym36$_RED_INFRASTRUCTURE_TEST_KEY_), (SubLObject)red_infrastructure_macros.$sym40$REDDEF_LEX_PUBL, (SubLObject)(red_infrastructure_macros.$sym38$_RED_INFRASTRUCTURE_TEST_DEFAULT_.isSymbol() ? Symbols.symbol_value((SubLObject)red_infrastructure_macros.$sym38$_RED_INFRASTRUCTURE_TEST_DEFAULT_) : red_infrastructure_macros.$sym38$_RED_INFRASTRUCTURE_TEST_DEFAULT_), (SubLObject)red_infrastructure_macros.$kw35$LEXICAL, (SubLObject)red_infrastructure_macros.UNPROVIDED));
        red_infrastructure_macros.$reddef_par_prvt$ = SubLFiles.defparameter("REDDEF-PAR-PRVT", red_def_helper((SubLObject)(red_infrastructure_macros.$sym36$_RED_INFRASTRUCTURE_TEST_KEY_.isSymbol() ? Symbols.symbol_value((SubLObject)red_infrastructure_macros.$sym36$_RED_INFRASTRUCTURE_TEST_KEY_) : red_infrastructure_macros.$sym36$_RED_INFRASTRUCTURE_TEST_KEY_), (SubLObject)red_infrastructure_macros.$sym41$REDDEF_PAR_PRVT, (SubLObject)(red_infrastructure_macros.$sym38$_RED_INFRASTRUCTURE_TEST_DEFAULT_.isSymbol() ? Symbols.symbol_value((SubLObject)red_infrastructure_macros.$sym38$_RED_INFRASTRUCTURE_TEST_DEFAULT_) : red_infrastructure_macros.$sym38$_RED_INFRASTRUCTURE_TEST_DEFAULT_), (SubLObject)red_infrastructure_macros.$kw42$PARAMETER, (SubLObject)red_infrastructure_macros.UNPROVIDED));
        red_infrastructure_macros.$reddef_par_prot$ = SubLFiles.defparameter("REDDEF-PAR-PROT", red_def_helper((SubLObject)(red_infrastructure_macros.$sym36$_RED_INFRASTRUCTURE_TEST_KEY_.isSymbol() ? Symbols.symbol_value((SubLObject)red_infrastructure_macros.$sym36$_RED_INFRASTRUCTURE_TEST_KEY_) : red_infrastructure_macros.$sym36$_RED_INFRASTRUCTURE_TEST_KEY_), (SubLObject)red_infrastructure_macros.$sym43$REDDEF_PAR_PROT, (SubLObject)(red_infrastructure_macros.$sym38$_RED_INFRASTRUCTURE_TEST_DEFAULT_.isSymbol() ? Symbols.symbol_value((SubLObject)red_infrastructure_macros.$sym38$_RED_INFRASTRUCTURE_TEST_DEFAULT_) : red_infrastructure_macros.$sym38$_RED_INFRASTRUCTURE_TEST_DEFAULT_), (SubLObject)red_infrastructure_macros.$kw42$PARAMETER, (SubLObject)red_infrastructure_macros.UNPROVIDED));
        red_infrastructure_macros.$reddef_par_publ$ = SubLFiles.defparameter("REDDEF-PAR-PUBL", red_def_helper((SubLObject)(red_infrastructure_macros.$sym36$_RED_INFRASTRUCTURE_TEST_KEY_.isSymbol() ? Symbols.symbol_value((SubLObject)red_infrastructure_macros.$sym36$_RED_INFRASTRUCTURE_TEST_KEY_) : red_infrastructure_macros.$sym36$_RED_INFRASTRUCTURE_TEST_KEY_), (SubLObject)red_infrastructure_macros.$sym44$REDDEF_PAR_PUBL, (SubLObject)(red_infrastructure_macros.$sym38$_RED_INFRASTRUCTURE_TEST_DEFAULT_.isSymbol() ? Symbols.symbol_value((SubLObject)red_infrastructure_macros.$sym38$_RED_INFRASTRUCTURE_TEST_DEFAULT_) : red_infrastructure_macros.$sym38$_RED_INFRASTRUCTURE_TEST_DEFAULT_), (SubLObject)red_infrastructure_macros.$kw42$PARAMETER, (SubLObject)red_infrastructure_macros.UNPROVIDED));
        red_infrastructure_macros.$reddef_var_prvt$ = SubLFiles.defvar("REDDEF-VAR-PRVT", red_def_helper((SubLObject)(red_infrastructure_macros.$sym36$_RED_INFRASTRUCTURE_TEST_KEY_.isSymbol() ? Symbols.symbol_value((SubLObject)red_infrastructure_macros.$sym36$_RED_INFRASTRUCTURE_TEST_KEY_) : red_infrastructure_macros.$sym36$_RED_INFRASTRUCTURE_TEST_KEY_), (SubLObject)red_infrastructure_macros.$sym45$REDDEF_VAR_PRVT, (SubLObject)(red_infrastructure_macros.$sym38$_RED_INFRASTRUCTURE_TEST_DEFAULT_.isSymbol() ? Symbols.symbol_value((SubLObject)red_infrastructure_macros.$sym38$_RED_INFRASTRUCTURE_TEST_DEFAULT_) : red_infrastructure_macros.$sym38$_RED_INFRASTRUCTURE_TEST_DEFAULT_), (SubLObject)red_infrastructure_macros.$kw46$VAR, (SubLObject)red_infrastructure_macros.UNPROVIDED));
        red_infrastructure_macros.$reddef_var_prot$ = SubLFiles.defvar("REDDEF-VAR-PROT", red_def_helper((SubLObject)(red_infrastructure_macros.$sym36$_RED_INFRASTRUCTURE_TEST_KEY_.isSymbol() ? Symbols.symbol_value((SubLObject)red_infrastructure_macros.$sym36$_RED_INFRASTRUCTURE_TEST_KEY_) : red_infrastructure_macros.$sym36$_RED_INFRASTRUCTURE_TEST_KEY_), (SubLObject)red_infrastructure_macros.$sym47$REDDEF_VAR_PROT, (SubLObject)(red_infrastructure_macros.$sym38$_RED_INFRASTRUCTURE_TEST_DEFAULT_.isSymbol() ? Symbols.symbol_value((SubLObject)red_infrastructure_macros.$sym38$_RED_INFRASTRUCTURE_TEST_DEFAULT_) : red_infrastructure_macros.$sym38$_RED_INFRASTRUCTURE_TEST_DEFAULT_), (SubLObject)red_infrastructure_macros.$kw46$VAR, (SubLObject)red_infrastructure_macros.UNPROVIDED));
        red_infrastructure_macros.$reddef_var_publ$ = SubLFiles.defvar("REDDEF-VAR-PUBL", red_def_helper((SubLObject)(red_infrastructure_macros.$sym36$_RED_INFRASTRUCTURE_TEST_KEY_.isSymbol() ? Symbols.symbol_value((SubLObject)red_infrastructure_macros.$sym36$_RED_INFRASTRUCTURE_TEST_KEY_) : red_infrastructure_macros.$sym36$_RED_INFRASTRUCTURE_TEST_KEY_), (SubLObject)red_infrastructure_macros.$sym48$REDDEF_VAR_PUBL, (SubLObject)(red_infrastructure_macros.$sym38$_RED_INFRASTRUCTURE_TEST_DEFAULT_.isSymbol() ? Symbols.symbol_value((SubLObject)red_infrastructure_macros.$sym38$_RED_INFRASTRUCTURE_TEST_DEFAULT_) : red_infrastructure_macros.$sym38$_RED_INFRASTRUCTURE_TEST_DEFAULT_), (SubLObject)red_infrastructure_macros.$kw46$VAR, (SubLObject)red_infrastructure_macros.UNPROVIDED));
        red_infrastructure_macros.$reddef_gbl_prvt$ = SubLFiles.deflexical("REDDEF-GBL-PRVT", (red_infrastructure_macros.NIL != Symbols.boundp((SubLObject)red_infrastructure_macros.$sym49$REDDEF_GBL_PRVT)) ? red_infrastructure_macros.$reddef_gbl_prvt$.getGlobalValue() : red_def_helper((SubLObject)(red_infrastructure_macros.$sym36$_RED_INFRASTRUCTURE_TEST_KEY_.isSymbol() ? Symbols.symbol_value((SubLObject)red_infrastructure_macros.$sym36$_RED_INFRASTRUCTURE_TEST_KEY_) : red_infrastructure_macros.$sym36$_RED_INFRASTRUCTURE_TEST_KEY_), (SubLObject)red_infrastructure_macros.$sym49$REDDEF_GBL_PRVT, (SubLObject)(red_infrastructure_macros.$sym38$_RED_INFRASTRUCTURE_TEST_DEFAULT_.isSymbol() ? Symbols.symbol_value((SubLObject)red_infrastructure_macros.$sym38$_RED_INFRASTRUCTURE_TEST_DEFAULT_) : red_infrastructure_macros.$sym38$_RED_INFRASTRUCTURE_TEST_DEFAULT_), (SubLObject)red_infrastructure_macros.$kw50$GLOBAL, (SubLObject)red_infrastructure_macros.UNPROVIDED));
        red_infrastructure_macros.$reddef_gbl_prot$ = SubLFiles.deflexical("REDDEF-GBL-PROT", (red_infrastructure_macros.NIL != Symbols.boundp((SubLObject)red_infrastructure_macros.$sym51$REDDEF_GBL_PROT)) ? red_infrastructure_macros.$reddef_gbl_prot$.getGlobalValue() : red_def_helper((SubLObject)(red_infrastructure_macros.$sym36$_RED_INFRASTRUCTURE_TEST_KEY_.isSymbol() ? Symbols.symbol_value((SubLObject)red_infrastructure_macros.$sym36$_RED_INFRASTRUCTURE_TEST_KEY_) : red_infrastructure_macros.$sym36$_RED_INFRASTRUCTURE_TEST_KEY_), (SubLObject)red_infrastructure_macros.$sym51$REDDEF_GBL_PROT, (SubLObject)(red_infrastructure_macros.$sym38$_RED_INFRASTRUCTURE_TEST_DEFAULT_.isSymbol() ? Symbols.symbol_value((SubLObject)red_infrastructure_macros.$sym38$_RED_INFRASTRUCTURE_TEST_DEFAULT_) : red_infrastructure_macros.$sym38$_RED_INFRASTRUCTURE_TEST_DEFAULT_), (SubLObject)red_infrastructure_macros.$kw50$GLOBAL, (SubLObject)red_infrastructure_macros.UNPROVIDED));
        red_infrastructure_macros.$reddef_gbl_publ$ = SubLFiles.deflexical("REDDEF-GBL-PUBL", (red_infrastructure_macros.NIL != Symbols.boundp((SubLObject)red_infrastructure_macros.$sym52$REDDEF_GBL_PUBL)) ? red_infrastructure_macros.$reddef_gbl_publ$.getGlobalValue() : red_def_helper((SubLObject)(red_infrastructure_macros.$sym36$_RED_INFRASTRUCTURE_TEST_KEY_.isSymbol() ? Symbols.symbol_value((SubLObject)red_infrastructure_macros.$sym36$_RED_INFRASTRUCTURE_TEST_KEY_) : red_infrastructure_macros.$sym36$_RED_INFRASTRUCTURE_TEST_KEY_), (SubLObject)red_infrastructure_macros.$sym52$REDDEF_GBL_PUBL, (SubLObject)(red_infrastructure_macros.$sym38$_RED_INFRASTRUCTURE_TEST_DEFAULT_.isSymbol() ? Symbols.symbol_value((SubLObject)red_infrastructure_macros.$sym38$_RED_INFRASTRUCTURE_TEST_DEFAULT_) : red_infrastructure_macros.$sym38$_RED_INFRASTRUCTURE_TEST_DEFAULT_), (SubLObject)red_infrastructure_macros.$kw50$GLOBAL, (SubLObject)red_infrastructure_macros.UNPROVIDED));
        return (SubLObject)red_infrastructure_macros.NIL;
    }
    
    public static SubLObject setup_red_infrastructure_macros_file() {
        access_macros.register_macro_helper((SubLObject)red_infrastructure_macros.$sym2$RED_DEF_HELPER, (SubLObject)red_infrastructure_macros.$list28);
        access_macros.register_macro_helper((SubLObject)red_infrastructure_macros.$sym27$RED_REINITIALIZE_VARIABLE_HELPER, (SubLObject)red_infrastructure_macros.$sym30$RED_REINITIALIZE_VARIABLE);
        subl_macro_promotions.declare_defglobal((SubLObject)red_infrastructure_macros.$sym49$REDDEF_GBL_PRVT);
        subl_macro_promotions.declare_defglobal((SubLObject)red_infrastructure_macros.$sym51$REDDEF_GBL_PROT);
        subl_macro_promotions.declare_defglobal((SubLObject)red_infrastructure_macros.$sym52$REDDEF_GBL_PUBL);
        return (SubLObject)red_infrastructure_macros.NIL;
    }
    
    @Override
	public void declareFunctions() {
        declare_red_infrastructure_macros_file();
    }
    
    @Override
	public void initializeVariables() {
        init_red_infrastructure_macros_file();
    }
    
    @Override
	public void runTopLevelForms() {
        setup_red_infrastructure_macros_file();
    }
    
    static {
        me = (SubLFile)new red_infrastructure_macros();
        red_infrastructure_macros.$red_infrastructure_test_key$ = null;
        red_infrastructure_macros.$red_infrastructure_test_default$ = null;
        red_infrastructure_macros.$red_infrastructure_test_red_value$ = null;
        red_infrastructure_macros.$reddef_lex_prvt_2$ = null;
        red_infrastructure_macros.$reddef_lex_prvt$ = null;
        red_infrastructure_macros.$reddef_lex_prot$ = null;
        red_infrastructure_macros.$reddef_lex_publ$ = null;
        red_infrastructure_macros.$reddef_par_prvt$ = null;
        red_infrastructure_macros.$reddef_par_prot$ = null;
        red_infrastructure_macros.$reddef_par_publ$ = null;
        red_infrastructure_macros.$reddef_var_prvt$ = null;
        red_infrastructure_macros.$reddef_var_prot$ = null;
        red_infrastructure_macros.$reddef_var_publ$ = null;
        red_infrastructure_macros.$reddef_gbl_prvt$ = null;
        red_infrastructure_macros.$reddef_gbl_prot$ = null;
        red_infrastructure_macros.$reddef_gbl_publ$ = null;
        $list0 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("KEY"), (SubLObject)SubLObjectFactory.makeSymbol("NAME"), (SubLObject)SubLObjectFactory.makeSymbol("DEFAULTVALUE"), (SubLObject)SubLObjectFactory.makeSymbol("DESCRIPTION"));
        $sym1$DEFPARAMETER_PUBLIC = SubLObjectFactory.makeSymbol("DEFPARAMETER-PUBLIC");
        $sym2$RED_DEF_HELPER = SubLObjectFactory.makeSymbol("RED-DEF-HELPER");
        $sym3$FIF = SubLObjectFactory.makeSymbol("FIF");
        $sym4$SYMBOLP = SubLObjectFactory.makeSymbol("SYMBOLP");
        $sym5$QUOTE = SubLObjectFactory.makeSymbol("QUOTE");
        $sym6$SYMBOL_VALUE = SubLObjectFactory.makeSymbol("SYMBOL-VALUE");
        $list7 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("PARAMETER"));
        $sym8$DEFPARAMETER_PROTECTED = SubLObjectFactory.makeSymbol("DEFPARAMETER-PROTECTED");
        $sym9$DEFPARAMETER_PRIVATE = SubLObjectFactory.makeSymbol("DEFPARAMETER-PRIVATE");
        $sym10$DEFLEXICAL_PUBLIC = SubLObjectFactory.makeSymbol("DEFLEXICAL-PUBLIC");
        $list11 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("LEXICAL"));
        $sym12$DEFLEXICAL_PROTECTED = SubLObjectFactory.makeSymbol("DEFLEXICAL-PROTECTED");
        $sym13$DEFLEXICAL_PRIVATE = SubLObjectFactory.makeSymbol("DEFLEXICAL-PRIVATE");
        $sym14$DEFGLOBAL_PUBLIC = SubLObjectFactory.makeSymbol("DEFGLOBAL-PUBLIC");
        $list15 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("GLOBAL"));
        $sym16$DEFGLOBAL_PROTECTED = SubLObjectFactory.makeSymbol("DEFGLOBAL-PROTECTED");
        $sym17$DEFGLOBAL_PRIVATE = SubLObjectFactory.makeSymbol("DEFGLOBAL-PRIVATE");
        $sym18$DEFVAR_PUBLIC = SubLObjectFactory.makeSymbol("DEFVAR-PUBLIC");
        $list19 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VAR"));
        $sym20$DEFVAR_PROTECTED = SubLObjectFactory.makeSymbol("DEFVAR-PROTECTED");
        $sym21$DEFVAR_PRIVATE = SubLObjectFactory.makeSymbol("DEFVAR-PRIVATE");
        $list22 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("PARAMETER"), (SubLObject)SubLObjectFactory.makeKeyword("LIST"));
        $list23 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("LEXICAL"), (SubLObject)SubLObjectFactory.makeKeyword("LIST"));
        $list24 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("GLOBAL"), (SubLObject)SubLObjectFactory.makeKeyword("LIST"));
        $list25 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VAR"), (SubLObject)SubLObjectFactory.makeKeyword("LIST"));
        $list26 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NAME"));
        $sym27$RED_REINITIALIZE_VARIABLE_HELPER = SubLObjectFactory.makeSymbol("RED-REINITIALIZE-VARIABLE-HELPER");
        $list28 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("DEFINE-RED-PARAMETER-PUBLIC"), SubLObjectFactory.makeSymbol("DEFINE-RED-PARAMETER-PROTECTED"), SubLObjectFactory.makeSymbol("DEFINE-RED-PARAMETER-PRIVATE"), SubLObjectFactory.makeSymbol("DEFINE-RED-LEXICAL-PUBLIC"), SubLObjectFactory.makeSymbol("DEFINE-RED-LEXICAL-PROTECTED"), SubLObjectFactory.makeSymbol("DEFINE-RED-LEXICAL-PRIVATE"), SubLObjectFactory.makeSymbol("DEFINE-RED-GLOBAL-PUBLIC"), SubLObjectFactory.makeSymbol("DEFINE-RED-GLOBAL-PROTECTED"), SubLObjectFactory.makeSymbol("DEFINE-RED-GLOBAL-PRIVATE"), SubLObjectFactory.makeSymbol("DEFINE-RED-VAR-PUBLIC"), SubLObjectFactory.makeSymbol("DEFINE-RED-VAR-PROTECTED"), SubLObjectFactory.makeSymbol("DEFINE-RED-VAR-PRIVATE"), SubLObjectFactory.makeSymbol("DEFINE-RED-LIST-PARAMETER-PUBLIC"), SubLObjectFactory.makeSymbol("DEFINE-RED-LIST-PARAMETER-PROTECTED"), SubLObjectFactory.makeSymbol("DEFINE-RED-LIST-PARAMETER-PRIVATE"), SubLObjectFactory.makeSymbol("DEFINE-RED-LIST-LEXICAL-PUBLIC"), SubLObjectFactory.makeSymbol("DEFINE-RED-LIST-LEXICAL-PROTECTED"), SubLObjectFactory.makeSymbol("DEFINE-RED-LIST-LEXICAL-PRIVATE"), SubLObjectFactory.makeSymbol("DEFINE-RED-LIST-GLOBAL-PUBLIC"), SubLObjectFactory.makeSymbol("DEFINE-RED-LIST-GLOBAL-PROTECTED"), SubLObjectFactory.makeSymbol("DEFINE-RED-LIST-GLOBAL-PRIVATE"), SubLObjectFactory.makeSymbol("DEFINE-RED-LIST-VAR-PUBLIC"), SubLObjectFactory.makeSymbol("DEFINE-RED-LIST-VAR-PROTECTED"), SubLObjectFactory.makeSymbol("DEFINE-RED-LIST-VAR-PRIVATE") });
        $kw29$SIMPLE = SubLObjectFactory.makeKeyword("SIMPLE");
        $sym30$RED_REINITIALIZE_VARIABLE = SubLObjectFactory.makeSymbol("RED-REINITIALIZE-VARIABLE");
        $list31 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("redtest.crtl.worldfile"));
        $str32$dflt = SubLObjectFactory.makeString("dflt");
        $str33$_cyc_CycC_Linux_head_run_world_la = SubLObjectFactory.makeString("/cyc/CycC/Linux/head/run/world/latest.load");
        $sym34$REDDEF_LEX_PRVT_2 = SubLObjectFactory.makeSymbol("REDDEF-LEX-PRVT-2");
        $kw35$LEXICAL = SubLObjectFactory.makeKeyword("LEXICAL");
        $sym36$_RED_INFRASTRUCTURE_TEST_KEY_ = SubLObjectFactory.makeSymbol("*RED-INFRASTRUCTURE-TEST-KEY*");
        $sym37$REDDEF_LEX_PRVT = SubLObjectFactory.makeSymbol("REDDEF-LEX-PRVT");
        $sym38$_RED_INFRASTRUCTURE_TEST_DEFAULT_ = SubLObjectFactory.makeSymbol("*RED-INFRASTRUCTURE-TEST-DEFAULT*");
        $sym39$REDDEF_LEX_PROT = SubLObjectFactory.makeSymbol("REDDEF-LEX-PROT");
        $sym40$REDDEF_LEX_PUBL = SubLObjectFactory.makeSymbol("REDDEF-LEX-PUBL");
        $sym41$REDDEF_PAR_PRVT = SubLObjectFactory.makeSymbol("REDDEF-PAR-PRVT");
        $kw42$PARAMETER = SubLObjectFactory.makeKeyword("PARAMETER");
        $sym43$REDDEF_PAR_PROT = SubLObjectFactory.makeSymbol("REDDEF-PAR-PROT");
        $sym44$REDDEF_PAR_PUBL = SubLObjectFactory.makeSymbol("REDDEF-PAR-PUBL");
        $sym45$REDDEF_VAR_PRVT = SubLObjectFactory.makeSymbol("REDDEF-VAR-PRVT");
        $kw46$VAR = SubLObjectFactory.makeKeyword("VAR");
        $sym47$REDDEF_VAR_PROT = SubLObjectFactory.makeSymbol("REDDEF-VAR-PROT");
        $sym48$REDDEF_VAR_PUBL = SubLObjectFactory.makeSymbol("REDDEF-VAR-PUBL");
        $sym49$REDDEF_GBL_PRVT = SubLObjectFactory.makeSymbol("REDDEF-GBL-PRVT");
        $kw50$GLOBAL = SubLObjectFactory.makeKeyword("GLOBAL");
        $sym51$REDDEF_GBL_PROT = SubLObjectFactory.makeSymbol("REDDEF-GBL-PROT");
        $sym52$REDDEF_GBL_PUBL = SubLObjectFactory.makeSymbol("REDDEF-GBL-PUBL");
        $str53$reddef_gbl_publ_didn_t_have_the_d = SubLObjectFactory.makeString("reddef-gbl-publ didn't have the default value(~s) ~s~%");
        $str54$reddef_gbl_prot_didn_t_have_the_d = SubLObjectFactory.makeString("reddef-gbl-prot didn't have the default value(~s) ~s~%");
        $str55$reddef_gbl_prvt_didn_t_have_the_d = SubLObjectFactory.makeString("reddef-gbl-prvt didn't have the default value(~s) ~s~%");
        $str56$reddef_var_publ_didn_t_have_the_d = SubLObjectFactory.makeString("reddef-var-publ didn't have the default value(~s) ~s~%");
        $str57$reddef_var_prot_didn_t_have_the_d = SubLObjectFactory.makeString("reddef-var-prot didn't have the default value(~s) ~s~%");
        $str58$reddef_var_prvt_didn_t_have_the_d = SubLObjectFactory.makeString("reddef-var-prvt didn't have the default value(~s) ~s~%");
        $str59$reddef_lex_publ_didn_t_have_the_d = SubLObjectFactory.makeString("reddef-lex-publ didn't have the default value(~s) ~s~%");
        $str60$reddef_lex_prot_didn_t_have_the_d = SubLObjectFactory.makeString("reddef-lex-prot didn't have the default value(~s) ~s~%");
        $str61$reddef_lex_prvt_didn_t_have_the_d = SubLObjectFactory.makeString("reddef-lex-prvt didn't have the default value(~s) ~s~%");
        $str62$reddef_lex_prvt_2_didn_t_have_the = SubLObjectFactory.makeString("reddef-lex-prvt-2 didn't have the default value(~s) ~s~%");
        $str63$reddef_par_publ_didn_t_have_the_d = SubLObjectFactory.makeString("reddef-par-publ didn't have the default value(~s) ~s~%");
        $str64$reddef_par_prot_didn_t_have_the_d = SubLObjectFactory.makeString("reddef-par-prot didn't have the default value(~s) ~s~%");
        $str65$reddef_par_prvt_didn_t_have_the_d = SubLObjectFactory.makeString("reddef-par-prvt didn't have the default value(~s) ~s~%");
        $str66$reddef_gbl_publ_didn_t_have_the_v = SubLObjectFactory.makeString("reddef-gbl-publ didn't have the value from the red repository(~s) ~s~%");
        $str67$reddef_gbl_prot_didn_t_have_the_v = SubLObjectFactory.makeString("reddef-gbl-prot didn't have the value from the red repository(~s) ~s~%");
        $str68$reddef_gbl_prvt_didn_t_have_the_v = SubLObjectFactory.makeString("reddef-gbl-prvt didn't have the value from the red repository(~s) ~s~%");
        $str69$reddef_var_publ_didn_t_have_the_v = SubLObjectFactory.makeString("reddef-var-publ didn't have the value from the red repository(~s) ~s~%");
        $str70$reddef_var_prot_didn_t_have_the_v = SubLObjectFactory.makeString("reddef-var-prot didn't have the value from the red repository(~s) ~s~%");
        $str71$reddef_var_prvt_didn_t_have_the_v = SubLObjectFactory.makeString("reddef-var-prvt didn't have the value from the red repository(~s) ~s~%");
        $str72$reddef_lex_publ_didn_t_have_the_v = SubLObjectFactory.makeString("reddef-lex-publ didn't have the value from the red repository(~s) ~s~%");
        $str73$reddef_lex_prot_didn_t_have_the_v = SubLObjectFactory.makeString("reddef-lex-prot didn't have the value from the red repository(~s) ~s~%");
        $str74$reddef_lex_prvt_didn_t_have_the_v = SubLObjectFactory.makeString("reddef-lex-prvt didn't have the value from the red repository(~s) ~s~%");
        $str75$reddef_lex_prvt_2_didn_t_have_the = SubLObjectFactory.makeString("reddef-lex-prvt-2 didn't have the value from the red repository(~s) ~s~%");
        $str76$reddef_par_publ_didn_t_have_the_v = SubLObjectFactory.makeString("reddef-par-publ didn't have the value from the red repository(~s) ~s~%");
        $str77$reddef_par_prot_didn_t_have_the_v = SubLObjectFactory.makeString("reddef-par-prot didn't have the value from the red repository(~s) ~s~%");
        $str78$reddef_par_prvt_didn_t_have_the_v = SubLObjectFactory.makeString("reddef-par-prvt didn't have the value from the red repository(~s) ~s~%");
    }
}

/*

	Total time: 328 ms
	
*/