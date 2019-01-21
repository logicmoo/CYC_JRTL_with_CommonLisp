package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class wff_macros extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.wff_macros";
    public static final String myFingerPrint = "c3f289d81e78e3f1b1f096e63e3cdbeb2a983572ba9574570a0b29a89ac27a5e";
    private static final SubLSymbol $sym0$CLET;
    private static final SubLList $list1;
    private static final SubLList $list2;
    private static final SubLSymbol $sym3$_WFF_FORMULA_;
    private static final SubLSymbol $sym4$_WFF_ORIGINAL_FORMULA_;
    private static final SubLSymbol $sym5$FIF;
    private static final SubLList $list6;
    private static final SubLList $list7;
    private static final SubLList $list8;
    private static final SubLSymbol $sym9$_WFF_EXPANSION_FORMULA_;
    private static final SubLList $list10;
    private static final SubLList $list11;
    private static final SubLList $list12;
    private static final SubLSymbol $sym13$_WFF_MEMOIZATION_STATE_;
    private static final SubLSymbol $sym14$WITH_MEMOIZATION_STATE;
    private static final SubLList $list15;
    private static final SubLList $list16;
    private static final SubLSymbol $sym17$WITH_SPECIFIED_WFF_MEMOIZATION_STATE;
    private static final SubLList $list18;
    private static final SubLSymbol $sym19$POSSIBLY_NEW_WFF_MEMOIZATION_STATE;
    private static final SubLSymbol $sym20$WITH_WFF_MEMOIZATION_STATE;
    private static final SubLString $str21$wff_memoization_state;
    private static final SubLSymbol $sym22$_UNEXPANDED_FORMULA_;
    private static final SubLList $list23;
    private static final SubLList $list24;
    private static final SubLSymbol $sym25$VALIDATING_EXPANSION_OF;
    private static final SubLList $list26;
    private static final SubLSymbol $sym27$PROTECTED;
    private static final SubLSymbol $sym28$SYMBOLP;
    private static final SubLSymbol $sym29$KEYWORDP;
    private static final SubLSymbol $sym30$SELF_EVALUATING_FORM_P;
    private static final SubLSymbol $sym31$STRINGP;
    private static final SubLSymbol $sym32$PROGN;
    private static final SubLSymbol $sym33$PROCLAIM;
    private static final SubLSymbol $sym34$QUOTE;
    private static final SubLSymbol $sym35$VACCESS;
    private static final SubLSymbol $sym36$DEFPARAMETER;
    private static final SubLSymbol $sym37$NOTE_WFF_PROPERTY;
    private static final SubLList $list38;
    private static final SubLSymbol $sym39$WFF_SVS;
    private static final SubLSymbol $sym40$NEW_WFF_SPECIAL_VARIABLE_STATE;
    private static final SubLSymbol $sym41$WITH_WFF_SPECIAL_VARIABLE_STATE;
    private static final SubLSymbol $sym42$WITH_WFF_PROPERTIES;
    private static final SubLList $list43;
    private static final SubLList $list44;
    private static final SubLSymbol $sym45$SVS;
    private static final SubLSymbol $sym46$_WFF_PROPERTIES_;
    private static final SubLSymbol $sym47$WITH_SPECIAL_VARIABLE_STATE;
    private static final SubLList $list48;
    private static final SubLList $list49;
    private static final SubLList $list50;
    static  boolean assertionsDisabledSynth = true;
    
    @SubLTranslatedFile.SubL(source = "cycl/wff-macros.lisp", position = 754L)
    public static SubLObject within_wff(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return (SubLObject)ConsesLow.listS((SubLObject)wff_macros.$sym0$CLET, (SubLObject)wff_macros.$list1, ConsesLow.append(body, (SubLObject)wff_macros.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/wff-macros.lisp", position = 910L)
    public static SubLObject within_wffP() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return wff_vars.$within_wffP$.getDynamicValue(thread);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/wff-macros.lisp", position = 1024L)
    public static SubLObject with_wff_formula(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject formula = (SubLObject)wff_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)wff_macros.$list2);
        formula = current.first();
        final SubLObject body;
        current = (body = current.rest());
        return (SubLObject)ConsesLow.listS((SubLObject)wff_macros.$sym0$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)wff_macros.$sym3$_WFF_FORMULA_, formula), (SubLObject)ConsesLow.list((SubLObject)wff_macros.$sym4$_WFF_ORIGINAL_FORMULA_, (SubLObject)ConsesLow.list((SubLObject)wff_macros.$sym5$FIF, (SubLObject)wff_macros.$list6, (SubLObject)wff_macros.$list7, formula))), ConsesLow.append(body, (SubLObject)wff_macros.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/wff-macros.lisp", position = 1242L)
    public static SubLObject with_wff_expansion(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject expansion = (SubLObject)wff_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)wff_macros.$list8);
        expansion = current.first();
        final SubLObject body;
        current = (body = current.rest());
        return (SubLObject)ConsesLow.listS((SubLObject)wff_macros.$sym0$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)wff_macros.$sym9$_WFF_EXPANSION_FORMULA_, (SubLObject)ConsesLow.list((SubLObject)wff_macros.$sym5$FIF, (SubLObject)wff_macros.$list10, (SubLObject)wff_macros.$list11, expansion))), ConsesLow.append(body, (SubLObject)wff_macros.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/wff-macros.lisp", position = 1436L)
    public static SubLObject with_specified_wff_memoization_state(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject state = (SubLObject)wff_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)wff_macros.$list12);
        state = current.first();
        final SubLObject body;
        current = (body = current.rest());
        return (SubLObject)ConsesLow.list((SubLObject)wff_macros.$sym0$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)wff_macros.$sym13$_WFF_MEMOIZATION_STATE_, state)), (SubLObject)ConsesLow.listS((SubLObject)wff_macros.$sym14$WITH_MEMOIZATION_STATE, (SubLObject)wff_macros.$list15, (SubLObject)wff_macros.$list16, ConsesLow.append(body, (SubLObject)wff_macros.NIL)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/wff-macros.lisp", position = 1668L)
    public static SubLObject with_wff_memoization_state(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return (SubLObject)ConsesLow.listS((SubLObject)wff_macros.$sym17$WITH_SPECIFIED_WFF_MEMOIZATION_STATE, (SubLObject)wff_macros.$list18, ConsesLow.append(body, (SubLObject)wff_macros.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/wff-macros.lisp", position = 1815L)
    public static SubLObject possibly_new_wff_memoization_state() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return (wff_macros.NIL != wff_vars.$wff_memoization_state$.getDynamicValue(thread)) ? wff_vars.$wff_memoization_state$.getDynamicValue(thread) : memoization_state.new_memoization_state((SubLObject)wff_macros.$str21$wff_memoization_state, (SubLObject)wff_macros.UNPROVIDED, (SubLObject)wff_macros.UNPROVIDED, (SubLObject)wff_macros.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/wff-macros.lisp", position = 2035L)
    public static SubLObject validating_expansion_of(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject formula = (SubLObject)wff_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)wff_macros.$list2);
        formula = current.first();
        final SubLObject body;
        current = (body = current.rest());
        return (SubLObject)ConsesLow.listS((SubLObject)wff_macros.$sym0$CLET, reader.bq_cons((SubLObject)ConsesLow.list((SubLObject)wff_macros.$sym22$_UNEXPANDED_FORMULA_, formula), (SubLObject)wff_macros.$list23), ConsesLow.append(body, (SubLObject)wff_macros.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/wff-macros.lisp", position = 2382L)
    public static SubLObject validating_expansion_of_nat(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject formula = (SubLObject)wff_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)wff_macros.$list2);
        formula = current.first();
        final SubLObject body;
        current = (body = current.rest());
        return (SubLObject)ConsesLow.list((SubLObject)wff_macros.$sym0$CLET, (SubLObject)wff_macros.$list24, (SubLObject)ConsesLow.listS((SubLObject)wff_macros.$sym25$VALIDATING_EXPANSION_OF, formula, ConsesLow.append(body, (SubLObject)wff_macros.NIL)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/wff-macros.lisp", position = 2617L)
    public static SubLObject defparameter_wff(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject variable = (SubLObject)wff_macros.NIL;
        SubLObject keyword = (SubLObject)wff_macros.NIL;
        SubLObject initialization = (SubLObject)wff_macros.NIL;
        SubLObject documentation = (SubLObject)wff_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)wff_macros.$list26);
        variable = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)wff_macros.$list26);
        keyword = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)wff_macros.$list26);
        initialization = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)wff_macros.$list26);
        documentation = current.first();
        current = current.rest();
        final SubLObject vaccess = (SubLObject)(current.isCons() ? current.first() : wff_macros.$sym27$PROTECTED);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)wff_macros.$list26);
        current = current.rest();
        if (wff_macros.NIL != current) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)wff_macros.$list26);
            return (SubLObject)wff_macros.NIL;
        }
        if (wff_macros.NIL != variable && !wff_macros.assertionsDisabledSynth && wff_macros.NIL == Types.symbolp(variable)) {
            throw new AssertionError(variable);
        }
        assert wff_macros.NIL != Types.keywordp(keyword) : keyword;
        assert wff_macros.NIL != list_utilities.self_evaluating_form_p(initialization) : initialization;
        assert wff_macros.NIL != Types.stringp(documentation) : documentation;
        assert wff_macros.NIL != Types.symbolp(vaccess) : vaccess;
        if (wff_macros.NIL != variable) {
            return (SubLObject)ConsesLow.list((SubLObject)wff_macros.$sym32$PROGN, (SubLObject)ConsesLow.list((SubLObject)wff_macros.$sym33$PROCLAIM, (SubLObject)ConsesLow.list((SubLObject)wff_macros.$sym34$QUOTE, (SubLObject)ConsesLow.list((SubLObject)wff_macros.$sym35$VACCESS, vaccess, variable))), (SubLObject)ConsesLow.list((SubLObject)wff_macros.$sym36$DEFPARAMETER, variable, initialization, documentation), (SubLObject)ConsesLow.list((SubLObject)wff_macros.$sym37$NOTE_WFF_PROPERTY, keyword, (SubLObject)ConsesLow.list((SubLObject)wff_macros.$sym34$QUOTE, variable), initialization));
        }
        return (SubLObject)ConsesLow.list((SubLObject)wff_macros.$sym37$NOTE_WFF_PROPERTY, keyword, (SubLObject)wff_macros.NIL, initialization);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/wff-macros.lisp", position = 3517L)
    public static SubLObject with_wff_properties(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject v_properties = (SubLObject)wff_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)wff_macros.$list38);
        v_properties = current.first();
        final SubLObject body;
        current = (body = current.rest());
        final SubLObject wff_svs = (SubLObject)wff_macros.$sym39$WFF_SVS;
        return (SubLObject)ConsesLow.list((SubLObject)wff_macros.$sym0$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(wff_svs, (SubLObject)ConsesLow.list((SubLObject)wff_macros.$sym40$NEW_WFF_SPECIAL_VARIABLE_STATE, v_properties))), (SubLObject)ConsesLow.listS((SubLObject)wff_macros.$sym41$WITH_WFF_SPECIAL_VARIABLE_STATE, wff_svs, ConsesLow.append(body, (SubLObject)wff_macros.NIL)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/wff-macros.lisp", position = 3889L)
    public static SubLObject new_wff_special_variable_state(final SubLObject v_properties) {
        wff_vars.check_wff_properties(v_properties);
        final SubLObject svs = special_variable_state.new_special_variable_state((SubLObject)wff_macros.NIL);
        SubLObject remainder;
        SubLObject property;
        SubLObject desired_value;
        SubLObject data;
        SubLObject current;
        SubLObject datum;
        SubLObject var;
        SubLObject v_default;
        for (remainder = (SubLObject)wff_macros.NIL, remainder = v_properties; wff_macros.NIL != remainder; remainder = conses_high.cddr(remainder)) {
            property = remainder.first();
            desired_value = conses_high.cadr(remainder);
            data = dictionary.dictionary_lookup_without_values(wff_vars.wff_properties_table(), property, (SubLObject)wff_macros.UNPROVIDED);
            datum = (current = data);
            var = (SubLObject)wff_macros.NIL;
            v_default = (SubLObject)wff_macros.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)wff_macros.$list43);
            var = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)wff_macros.$list43);
            v_default = current.first();
            current = current.rest();
            if (wff_macros.NIL == current) {
                if (wff_macros.NIL != var) {
                    special_variable_state.special_variable_state_push(svs, var, desired_value);
                }
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)wff_macros.$list43);
            }
        }
        return svs;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/wff-macros.lisp", position = 4361L)
    public static SubLObject with_wff_special_variable_state(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject wff_svs = (SubLObject)wff_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)wff_macros.$list44);
        wff_svs = current.first();
        final SubLObject body;
        current = (body = current.rest());
        final SubLObject svs = (SubLObject)wff_macros.$sym45$SVS;
        return (SubLObject)ConsesLow.list((SubLObject)wff_macros.$sym0$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(svs, wff_svs), (SubLObject)ConsesLow.list((SubLObject)wff_macros.$sym46$_WFF_PROPERTIES_, svs)), (SubLObject)ConsesLow.listS((SubLObject)wff_macros.$sym47$WITH_SPECIAL_VARIABLE_STATE, svs, ConsesLow.append(body, (SubLObject)wff_macros.NIL)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/wff-macros.lisp", position = 4578L)
    public static SubLObject with_strict_wff(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return (SubLObject)ConsesLow.listS((SubLObject)wff_macros.$sym0$CLET, (SubLObject)wff_macros.$list48, ConsesLow.append(body, (SubLObject)wff_macros.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/wff-macros.lisp", position = 4678L)
    public static SubLObject with_assertive_wff(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return (SubLObject)ConsesLow.listS((SubLObject)wff_macros.$sym0$CLET, (SubLObject)wff_macros.$list49, ConsesLow.append(body, (SubLObject)wff_macros.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/wff-macros.lisp", position = 4784L)
    public static SubLObject with_lenient_wff(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return (SubLObject)ConsesLow.listS((SubLObject)wff_macros.$sym0$CLET, (SubLObject)wff_macros.$list50, ConsesLow.append(body, (SubLObject)wff_macros.NIL));
    }
    
    public static SubLObject declare_wff_macros_file() {
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.wff_macros", "within_wff", "WITHIN-WFF");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.wff_macros", "within_wffP", "WITHIN-WFF?", 0, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.wff_macros", "with_wff_formula", "WITH-WFF-FORMULA");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.wff_macros", "with_wff_expansion", "WITH-WFF-EXPANSION");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.wff_macros", "with_specified_wff_memoization_state", "WITH-SPECIFIED-WFF-MEMOIZATION-STATE");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.wff_macros", "with_wff_memoization_state", "WITH-WFF-MEMOIZATION-STATE");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.wff_macros", "possibly_new_wff_memoization_state", "POSSIBLY-NEW-WFF-MEMOIZATION-STATE", 0, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.wff_macros", "validating_expansion_of", "VALIDATING-EXPANSION-OF");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.wff_macros", "validating_expansion_of_nat", "VALIDATING-EXPANSION-OF-NAT");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.wff_macros", "defparameter_wff", "DEFPARAMETER-WFF");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.wff_macros", "with_wff_properties", "WITH-WFF-PROPERTIES");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.wff_macros", "new_wff_special_variable_state", "NEW-WFF-SPECIAL-VARIABLE-STATE", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.wff_macros", "with_wff_special_variable_state", "WITH-WFF-SPECIAL-VARIABLE-STATE");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.wff_macros", "with_strict_wff", "WITH-STRICT-WFF");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.wff_macros", "with_assertive_wff", "WITH-ASSERTIVE-WFF");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.wff_macros", "with_lenient_wff", "WITH-LENIENT-WFF");
        return (SubLObject)wff_macros.NIL;
    }
    
    public static SubLObject init_wff_macros_file() {
        return (SubLObject)wff_macros.NIL;
    }
    
    public static SubLObject setup_wff_macros_file() {
        access_macros.register_macro_helper((SubLObject)wff_macros.$sym19$POSSIBLY_NEW_WFF_MEMOIZATION_STATE, (SubLObject)wff_macros.$sym20$WITH_WFF_MEMOIZATION_STATE);
        access_macros.register_macro_helper((SubLObject)wff_macros.$sym40$NEW_WFF_SPECIAL_VARIABLE_STATE, (SubLObject)wff_macros.$sym42$WITH_WFF_PROPERTIES);
        return (SubLObject)wff_macros.NIL;
    }
    
    @Override
	public void declareFunctions() {
        declare_wff_macros_file();
    }
    
    @Override
	public void initializeVariables() {
        init_wff_macros_file();
    }
    
    @Override
	public void runTopLevelForms() {
        setup_wff_macros_file();
    }
    
    static {
        me = (SubLFile)new wff_macros();
        $sym0$CLET = SubLObjectFactory.makeSymbol("CLET");
        $list1 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*WITHIN-WFF?*"), (SubLObject)wff_macros.T));
        $list2 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FORMULA"), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym3$_WFF_FORMULA_ = SubLObjectFactory.makeSymbol("*WFF-FORMULA*");
        $sym4$_WFF_ORIGINAL_FORMULA_ = SubLObjectFactory.makeSymbol("*WFF-ORIGINAL-FORMULA*");
        $sym5$FIF = SubLObjectFactory.makeSymbol("FIF");
        $list6 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CAND"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("WITHIN-WFF?")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("WFF-ORIGINAL-FORMULA")));
        $list7 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("WFF-ORIGINAL-FORMULA"));
        $list8 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("EXPANSION"), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym9$_WFF_EXPANSION_FORMULA_ = SubLObjectFactory.makeSymbol("*WFF-EXPANSION-FORMULA*");
        $list10 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CAND"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("WITHIN-WFF?")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("WFF-EXPANSION-FORMULA")));
        $list11 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("WFF-EXPANSION-FORMULA"));
        $list12 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("STATE"), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym13$_WFF_MEMOIZATION_STATE_ = SubLObjectFactory.makeSymbol("*WFF-MEMOIZATION-STATE*");
        $sym14$WITH_MEMOIZATION_STATE = SubLObjectFactory.makeSymbol("WITH-MEMOIZATION-STATE");
        $list15 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*WFF-MEMOIZATION-STATE*"));
        $list16 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PUNLESS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("WITHIN-WFF?")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RESET-WFF-STATE")));
        $sym17$WITH_SPECIFIED_WFF_MEMOIZATION_STATE = SubLObjectFactory.makeSymbol("WITH-SPECIFIED-WFF-MEMOIZATION-STATE");
        $list18 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("POSSIBLY-NEW-WFF-MEMOIZATION-STATE"));
        $sym19$POSSIBLY_NEW_WFF_MEMOIZATION_STATE = SubLObjectFactory.makeSymbol("POSSIBLY-NEW-WFF-MEMOIZATION-STATE");
        $sym20$WITH_WFF_MEMOIZATION_STATE = SubLObjectFactory.makeSymbol("WITH-WFF-MEMOIZATION-STATE");
        $str21$wff_memoization_state = SubLObjectFactory.makeString("wff memoization state");
        $sym22$_UNEXPANDED_FORMULA_ = SubLObjectFactory.makeSymbol("*UNEXPANDED-FORMULA*");
        $list23 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*VALIDATE-EXPANSIONS?*"), (SubLObject)wff_macros.NIL), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*VALIDATING-EXPANSION?*"), (SubLObject)wff_macros.T));
        $list24 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*RELAX-ARG-CONSTRAINTS-FOR-DISJUNCTIONS?*"), (SubLObject)wff_macros.NIL));
        $sym25$VALIDATING_EXPANSION_OF = SubLObjectFactory.makeSymbol("VALIDATING-EXPANSION-OF");
        $list26 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("VARIABLE"), (SubLObject)SubLObjectFactory.makeSymbol("KEYWORD"), (SubLObject)SubLObjectFactory.makeSymbol("INITIALIZATION"), (SubLObject)SubLObjectFactory.makeSymbol("DOCUMENTATION"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("VACCESS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("PROTECTED"))));
        $sym27$PROTECTED = SubLObjectFactory.makeSymbol("PROTECTED");
        $sym28$SYMBOLP = SubLObjectFactory.makeSymbol("SYMBOLP");
        $sym29$KEYWORDP = SubLObjectFactory.makeSymbol("KEYWORDP");
        $sym30$SELF_EVALUATING_FORM_P = SubLObjectFactory.makeSymbol("SELF-EVALUATING-FORM-P");
        $sym31$STRINGP = SubLObjectFactory.makeSymbol("STRINGP");
        $sym32$PROGN = SubLObjectFactory.makeSymbol("PROGN");
        $sym33$PROCLAIM = SubLObjectFactory.makeSymbol("PROCLAIM");
        $sym34$QUOTE = SubLObjectFactory.makeSymbol("QUOTE");
        $sym35$VACCESS = SubLObjectFactory.makeSymbol("VACCESS");
        $sym36$DEFPARAMETER = SubLObjectFactory.makeSymbol("DEFPARAMETER");
        $sym37$NOTE_WFF_PROPERTY = SubLObjectFactory.makeSymbol("NOTE-WFF-PROPERTY");
        $list38 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PROPERTIES"), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym39$WFF_SVS = SubLObjectFactory.makeUninternedSymbol("WFF-SVS");
        $sym40$NEW_WFF_SPECIAL_VARIABLE_STATE = SubLObjectFactory.makeSymbol("NEW-WFF-SPECIAL-VARIABLE-STATE");
        $sym41$WITH_WFF_SPECIAL_VARIABLE_STATE = SubLObjectFactory.makeSymbol("WITH-WFF-SPECIAL-VARIABLE-STATE");
        $sym42$WITH_WFF_PROPERTIES = SubLObjectFactory.makeSymbol("WITH-WFF-PROPERTIES");
        $list43 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("VAR"), (SubLObject)SubLObjectFactory.makeSymbol("DEFAULT"));
        $list44 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("WFF-SVS"), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym45$SVS = SubLObjectFactory.makeUninternedSymbol("SVS");
        $sym46$_WFF_PROPERTIES_ = SubLObjectFactory.makeSymbol("*WFF-PROPERTIES*");
        $sym47$WITH_SPECIAL_VARIABLE_STATE = SubLObjectFactory.makeSymbol("WITH-SPECIAL-VARIABLE-STATE");
        $list48 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*WFF-MODE*"), (SubLObject)SubLObjectFactory.makeKeyword("STRICT")));
        $list49 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*WFF-MODE*"), (SubLObject)SubLObjectFactory.makeKeyword("ASSERTIVE")));
        $list50 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*WFF-MODE*"), (SubLObject)SubLObjectFactory.makeKeyword("LENIENT")));
    }
}

/*

	Total time: 140 ms
	 synthetic 
*/