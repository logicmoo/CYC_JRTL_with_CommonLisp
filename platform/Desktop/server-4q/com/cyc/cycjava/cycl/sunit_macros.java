package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Packages;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class sunit_macros extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.sunit_macros";
    public static final String myFingerPrint = "ec1afa469742b60f6a36fd6f5f7192bf84478683e6000be96c5a3d2e84c8f6c8";
    @SubLTranslatedFile.SubL(source = "cycl/sunit-macros.lisp", position = 1148L)
    public static SubLSymbol $current_module_sunit_tests$;
    private static final SubLList $list0;
    private static final SubLSymbol $kw1$CYC_SUBLOOP;
    private static final SubLSymbol $kw2$CYC_SUNIT_FULL;
    private static final SubLString $str3$_A_is_not_the_name_of_a_known_cla;
    private static final SubLSymbol $sym4$PROGN;
    private static final SubLSymbol $sym5$DEF_TEST_METHOD_REGISTER;
    private static final SubLSymbol $sym6$QUOTE;
    private static final SubLSymbol $kw7$CYC_SUNIT;
    private static final SubLSymbol $sym8$DEF_INSTANCE_METHOD;
    private static final SubLSymbol $sym9$DEF_TEST_METHOD;
    private static final SubLList $list10;
    private static final SubLSymbol $sym11$DEF_TC_CONDITIONAL_METHOD;
    private static final SubLSymbol $sym12$SETUP;
    private static final SubLSymbol $sym13$CLEANUP;
    private static final SubLList $list14;
    private static final SubLList $list15;
    private static final SubLList $list16;
    private static final SubLSymbol $kw17$ALLOW_OTHER_KEYS;
    private static final SubLSymbol $kw18$CATEGORIES;
    private static final SubLSymbol $sym19$DEFINE_TEST_CASE_INT;
    private static final SubLSymbol $sym20$TEST_CASE;
    private static final SubLSymbol $sym21$CYCL_TEST_CASE;
    private static final SubLList $list22;
    private static final SubLSymbol $kw23$EXTENDS;
    private static final SubLSymbol $sym24$CPUSH;
    private static final SubLList $list25;
    private static final SubLSymbol $sym26$DEFINE_TEST_CASE_PREAMBLE;
    private static final SubLSymbol $sym27$DEFINE_CLASS;
    private static final SubLSymbol $sym28$DEFINE_TEST_CASE_POSTAMBLE;
    private static final SubLList $list29;
    private static final SubLSymbol $sym30$CCATCH;
    private static final SubLSymbol $sym31$_CATCH_ERROR_MESSAGE_TARGET_;
    private static final SubLSymbol $sym32$WITH_ERROR_HANDLER;
    private static final SubLList $list33;
    private static final SubLList $list34;
    private static final SubLSymbol $sym35$HL_VARS;
    private static final SubLSymbol $sym36$CLET;
    private static final SubLSymbol $sym37$GENERATE_HL_VARIABLE_LIST;
    private static final SubLSymbol $sym38$TEST_WITH_HL_VARS_VAR_DECLARATIONS;
    private static final SubLSymbol $sym39$TEST_WITH_HL_VARS;
    private static final SubLString $str40$VAR;
    private static final SubLSymbol $sym41$NTH;
    
    @SubLTranslatedFile.SubL(source = "cycl/sunit-macros.lisp", position = 1620L)
    public static SubLObject def_test_method(final SubLObject macroform, final SubLObject environment) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sunit_macros.$list0);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject method_name = (SubLObject)sunit_macros.NIL;
        SubLObject class_name = (SubLObject)sunit_macros.NIL;
        SubLObject method_properties = (SubLObject)sunit_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sunit_macros.$list0);
        method_name = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sunit_macros.$list0);
        class_name = current.first();
        current = (method_properties = current.rest());
        current = temp;
        SubLObject lambda_list = (SubLObject)sunit_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sunit_macros.$list0);
        lambda_list = current.first();
        final SubLObject body;
        current = (body = current.rest());
        final SubLObject method_spec = (SubLObject)ConsesLow.cons(method_name, (SubLObject)ConsesLow.cons(class_name, method_properties));
        if (sunit_macros.NIL != Sequences.find((SubLObject)sunit_macros.$kw1$CYC_SUBLOOP, reader.$features$.getDynamicValue(thread), (SubLObject)sunit_macros.UNPROVIDED, (SubLObject)sunit_macros.UNPROVIDED, (SubLObject)sunit_macros.UNPROVIDED, (SubLObject)sunit_macros.UNPROVIDED) && sunit_macros.NIL != Sequences.find((SubLObject)sunit_macros.$kw2$CYC_SUNIT_FULL, reader.$features$.getDynamicValue(thread), (SubLObject)sunit_macros.UNPROVIDED, (SubLObject)sunit_macros.UNPROVIDED, (SubLObject)sunit_macros.UNPROVIDED, (SubLObject)sunit_macros.UNPROVIDED) && sunit_macros.NIL == subloop_structures.class_p(classes.classes_retrieve_class(class_name))) {
            Errors.error((SubLObject)sunit_macros.$str3$_A_is_not_the_name_of_a_known_cla, class_name);
        }
        return reader.bq_cons((SubLObject)sunit_macros.$sym4$PROGN, ConsesLow.append((SubLObject)((sunit_macros.NIL != Sequences.find((SubLObject)sunit_macros.$kw1$CYC_SUBLOOP, reader.$features$.getDynamicValue(thread), (SubLObject)sunit_macros.UNPROVIDED, (SubLObject)sunit_macros.UNPROVIDED, (SubLObject)sunit_macros.UNPROVIDED, (SubLObject)sunit_macros.UNPROVIDED) && sunit_macros.NIL != Sequences.find((SubLObject)sunit_macros.$kw2$CYC_SUNIT_FULL, reader.$features$.getDynamicValue(thread), (SubLObject)sunit_macros.UNPROVIDED, (SubLObject)sunit_macros.UNPROVIDED, (SubLObject)sunit_macros.UNPROVIDED, (SubLObject)sunit_macros.UNPROVIDED)) ? ConsesLow.list((SubLObject)ConsesLow.listS((SubLObject)sunit_macros.$sym4$PROGN, (SubLObject)ConsesLow.list((SubLObject)sunit_macros.$sym5$DEF_TEST_METHOD_REGISTER, (SubLObject)ConsesLow.list((SubLObject)sunit_macros.$sym6$QUOTE, class_name), (SubLObject)ConsesLow.list((SubLObject)sunit_macros.$sym6$QUOTE, method_name)), ConsesLow.append((SubLObject)((sunit_macros.NIL != Sequences.find((SubLObject)sunit_macros.$kw7$CYC_SUNIT, reader.$features$.getDynamicValue(thread), (SubLObject)sunit_macros.UNPROVIDED, (SubLObject)sunit_macros.UNPROVIDED, (SubLObject)sunit_macros.UNPROVIDED, (SubLObject)sunit_macros.UNPROVIDED)) ? ConsesLow.list((SubLObject)ConsesLow.listS((SubLObject)sunit_macros.$sym8$DEF_INSTANCE_METHOD, method_spec, lambda_list, ConsesLow.append(body, (SubLObject)sunit_macros.NIL))) : sunit_macros.NIL), (SubLObject)sunit_macros.NIL))) : sunit_macros.NIL), (SubLObject)sunit_macros.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sunit-macros.lisp", position = 2686L)
    public static SubLObject def_test_method_register(final SubLObject class_name, final SubLObject method_name) {
        return (SubLObject)sunit_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sunit-macros.lisp", position = 3023L)
    public static SubLObject def_setup_method(final SubLObject macroform, final SubLObject environment) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sunit_macros.$list10);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject class_name = (SubLObject)sunit_macros.NIL;
        SubLObject method_properties = (SubLObject)sunit_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sunit_macros.$list10);
        class_name = current.first();
        current = (method_properties = current.rest());
        current = temp;
        SubLObject lambda_list = (SubLObject)sunit_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sunit_macros.$list10);
        lambda_list = current.first();
        final SubLObject body;
        current = (body = current.rest());
        if (sunit_macros.NIL != Sequences.find((SubLObject)sunit_macros.$kw1$CYC_SUBLOOP, reader.$features$.getDynamicValue(thread), (SubLObject)sunit_macros.UNPROVIDED, (SubLObject)sunit_macros.UNPROVIDED, (SubLObject)sunit_macros.UNPROVIDED, (SubLObject)sunit_macros.UNPROVIDED) && sunit_macros.NIL != Sequences.find((SubLObject)sunit_macros.$kw2$CYC_SUNIT_FULL, reader.$features$.getDynamicValue(thread), (SubLObject)sunit_macros.UNPROVIDED, (SubLObject)sunit_macros.UNPROVIDED, (SubLObject)sunit_macros.UNPROVIDED, (SubLObject)sunit_macros.UNPROVIDED) && sunit_macros.NIL == subloop_structures.class_p(classes.classes_retrieve_class(class_name))) {
            Errors.error((SubLObject)sunit_macros.$str3$_A_is_not_the_name_of_a_known_cla, class_name);
        }
        return (SubLObject)ConsesLow.list((SubLObject)sunit_macros.$sym4$PROGN, (SubLObject)ConsesLow.listS((SubLObject)sunit_macros.$sym11$DEF_TC_CONDITIONAL_METHOD, (SubLObject)sunit_macros.$sym12$SETUP, reader.bq_cons(class_name, method_properties), lambda_list, ConsesLow.append(body, (SubLObject)sunit_macros.NIL)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sunit-macros.lisp", position = 3686L)
    public static SubLObject def_cleanup_method(final SubLObject macroform, final SubLObject environment) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sunit_macros.$list10);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject class_name = (SubLObject)sunit_macros.NIL;
        SubLObject method_properties = (SubLObject)sunit_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sunit_macros.$list10);
        class_name = current.first();
        current = (method_properties = current.rest());
        current = temp;
        SubLObject lambda_list = (SubLObject)sunit_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sunit_macros.$list10);
        lambda_list = current.first();
        final SubLObject body;
        current = (body = current.rest());
        if (sunit_macros.NIL != Sequences.find((SubLObject)sunit_macros.$kw1$CYC_SUBLOOP, reader.$features$.getDynamicValue(thread), (SubLObject)sunit_macros.UNPROVIDED, (SubLObject)sunit_macros.UNPROVIDED, (SubLObject)sunit_macros.UNPROVIDED, (SubLObject)sunit_macros.UNPROVIDED) && sunit_macros.NIL != Sequences.find((SubLObject)sunit_macros.$kw2$CYC_SUNIT_FULL, reader.$features$.getDynamicValue(thread), (SubLObject)sunit_macros.UNPROVIDED, (SubLObject)sunit_macros.UNPROVIDED, (SubLObject)sunit_macros.UNPROVIDED, (SubLObject)sunit_macros.UNPROVIDED) && sunit_macros.NIL == subloop_structures.class_p(classes.classes_retrieve_class(class_name))) {
            Errors.error((SubLObject)sunit_macros.$str3$_A_is_not_the_name_of_a_known_cla, class_name);
        }
        return (SubLObject)ConsesLow.list((SubLObject)sunit_macros.$sym4$PROGN, (SubLObject)ConsesLow.listS((SubLObject)sunit_macros.$sym11$DEF_TC_CONDITIONAL_METHOD, (SubLObject)sunit_macros.$sym13$CLEANUP, reader.bq_cons(class_name, method_properties), lambda_list, ConsesLow.append(body, (SubLObject)sunit_macros.NIL)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sunit-macros.lisp", position = 4356L)
    public static SubLObject def_tc_conditional_method(final SubLObject macroform, final SubLObject environment) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject type = (SubLObject)sunit_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sunit_macros.$list14);
        type = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sunit_macros.$list14);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject class_name = (SubLObject)sunit_macros.NIL;
        SubLObject method_properties = (SubLObject)sunit_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sunit_macros.$list14);
        class_name = current.first();
        current = (method_properties = current.rest());
        current = temp;
        SubLObject lambda_list = (SubLObject)sunit_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sunit_macros.$list14);
        lambda_list = current.first();
        final SubLObject body;
        current = (body = current.rest());
        final SubLObject method_spec = (SubLObject)ConsesLow.cons(type, (SubLObject)ConsesLow.cons(class_name, method_properties));
        return reader.bq_cons((SubLObject)sunit_macros.$sym4$PROGN, ConsesLow.append((SubLObject)((sunit_macros.NIL != Sequences.find((SubLObject)sunit_macros.$kw1$CYC_SUBLOOP, reader.$features$.getDynamicValue(thread), (SubLObject)sunit_macros.UNPROVIDED, (SubLObject)sunit_macros.UNPROVIDED, (SubLObject)sunit_macros.UNPROVIDED, (SubLObject)sunit_macros.UNPROVIDED) && sunit_macros.NIL != Sequences.find((SubLObject)sunit_macros.$kw2$CYC_SUNIT_FULL, reader.$features$.getDynamicValue(thread), (SubLObject)sunit_macros.UNPROVIDED, (SubLObject)sunit_macros.UNPROVIDED, (SubLObject)sunit_macros.UNPROVIDED, (SubLObject)sunit_macros.UNPROVIDED) && sunit_macros.NIL != Sequences.find((SubLObject)sunit_macros.$kw7$CYC_SUNIT, reader.$features$.getDynamicValue(thread), (SubLObject)sunit_macros.UNPROVIDED, (SubLObject)sunit_macros.UNPROVIDED, (SubLObject)sunit_macros.UNPROVIDED, (SubLObject)sunit_macros.UNPROVIDED)) ? ConsesLow.list((SubLObject)ConsesLow.listS((SubLObject)sunit_macros.$sym8$DEF_INSTANCE_METHOD, method_spec, lambda_list, ConsesLow.append(body, (SubLObject)sunit_macros.NIL))) : sunit_macros.NIL), (SubLObject)sunit_macros.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sunit-macros.lisp", position = 4758L)
    public static SubLObject define_test_case(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sunit_macros.$list15);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject tc_symbol = (SubLObject)sunit_macros.NIL;
        SubLObject module_name = (SubLObject)sunit_macros.NIL;
        SubLObject system_name = (SubLObject)sunit_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sunit_macros.$list15);
        tc_symbol = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sunit_macros.$list15);
        module_name = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sunit_macros.$list15);
        system_name = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = (SubLObject)sunit_macros.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)sunit_macros.NIL;
        SubLObject current_$1 = (SubLObject)sunit_macros.NIL;
        while (sunit_macros.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)sunit_macros.$list15);
            current_$1 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)sunit_macros.$list15);
            if (sunit_macros.NIL == conses_high.member(current_$1, (SubLObject)sunit_macros.$list16, (SubLObject)sunit_macros.UNPROVIDED, (SubLObject)sunit_macros.UNPROVIDED)) {
                bad = (SubLObject)sunit_macros.T;
            }
            if (current_$1 == sunit_macros.$kw17$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (sunit_macros.NIL != bad && sunit_macros.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)sunit_macros.$list15);
        }
        final SubLObject categories_tail = cdestructuring_bind.property_list_member((SubLObject)sunit_macros.$kw18$CATEGORIES, current);
        final SubLObject categories = (SubLObject)((sunit_macros.NIL != categories_tail) ? conses_high.cadr(categories_tail) : sunit_macros.NIL);
        final SubLObject slot_decls;
        current = (slot_decls = temp);
        final SubLObject arglist = (SubLObject)((sunit_macros.NIL != categories) ? ConsesLow.list(tc_symbol, module_name, system_name, (SubLObject)sunit_macros.$kw18$CATEGORIES, categories) : ConsesLow.list(tc_symbol, module_name, system_name));
        return (SubLObject)ConsesLow.list((SubLObject)sunit_macros.$sym4$PROGN, (SubLObject)ConsesLow.listS((SubLObject)sunit_macros.$sym19$DEFINE_TEST_CASE_INT, (SubLObject)sunit_macros.$sym20$TEST_CASE, arglist, ConsesLow.append(slot_decls, (SubLObject)sunit_macros.NIL)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sunit-macros.lisp", position = 5384L)
    public static SubLObject define_cycl_test_case(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sunit_macros.$list15);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject tc_symbol = (SubLObject)sunit_macros.NIL;
        SubLObject module_name = (SubLObject)sunit_macros.NIL;
        SubLObject system_name = (SubLObject)sunit_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sunit_macros.$list15);
        tc_symbol = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sunit_macros.$list15);
        module_name = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sunit_macros.$list15);
        system_name = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = (SubLObject)sunit_macros.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)sunit_macros.NIL;
        SubLObject current_$2 = (SubLObject)sunit_macros.NIL;
        while (sunit_macros.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)sunit_macros.$list15);
            current_$2 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)sunit_macros.$list15);
            if (sunit_macros.NIL == conses_high.member(current_$2, (SubLObject)sunit_macros.$list16, (SubLObject)sunit_macros.UNPROVIDED, (SubLObject)sunit_macros.UNPROVIDED)) {
                bad = (SubLObject)sunit_macros.T;
            }
            if (current_$2 == sunit_macros.$kw17$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (sunit_macros.NIL != bad && sunit_macros.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)sunit_macros.$list15);
        }
        final SubLObject categories_tail = cdestructuring_bind.property_list_member((SubLObject)sunit_macros.$kw18$CATEGORIES, current);
        final SubLObject categories = (SubLObject)((sunit_macros.NIL != categories_tail) ? conses_high.cadr(categories_tail) : sunit_macros.NIL);
        final SubLObject slot_decls;
        current = (slot_decls = temp);
        final SubLObject arglist = (SubLObject)((sunit_macros.NIL != categories) ? ConsesLow.list(tc_symbol, module_name, system_name, (SubLObject)sunit_macros.$kw18$CATEGORIES, categories) : ConsesLow.list(tc_symbol, module_name, system_name));
        return (SubLObject)ConsesLow.list((SubLObject)sunit_macros.$sym4$PROGN, (SubLObject)ConsesLow.listS((SubLObject)sunit_macros.$sym19$DEFINE_TEST_CASE_INT, (SubLObject)sunit_macros.$sym21$CYCL_TEST_CASE, arglist, ConsesLow.append(slot_decls, (SubLObject)sunit_macros.NIL)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sunit-macros.lisp", position = 5949L)
    public static SubLObject define_test_case_int(final SubLObject macroform, final SubLObject environment) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject type = (SubLObject)sunit_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sunit_macros.$list22);
        type = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sunit_macros.$list22);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject tc_symbol = (SubLObject)sunit_macros.NIL;
        SubLObject module_name = (SubLObject)sunit_macros.NIL;
        SubLObject system_name = (SubLObject)sunit_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sunit_macros.$list22);
        tc_symbol = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sunit_macros.$list22);
        module_name = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sunit_macros.$list22);
        system_name = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = (SubLObject)sunit_macros.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)sunit_macros.NIL;
        SubLObject current_$3 = (SubLObject)sunit_macros.NIL;
        while (sunit_macros.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)sunit_macros.$list22);
            current_$3 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)sunit_macros.$list22);
            if (sunit_macros.NIL == conses_high.member(current_$3, (SubLObject)sunit_macros.$list16, (SubLObject)sunit_macros.UNPROVIDED, (SubLObject)sunit_macros.UNPROVIDED)) {
                bad = (SubLObject)sunit_macros.T;
            }
            if (current_$3 == sunit_macros.$kw17$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (sunit_macros.NIL != bad && sunit_macros.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)sunit_macros.$list22);
        }
        final SubLObject categories_tail = cdestructuring_bind.property_list_member((SubLObject)sunit_macros.$kw18$CATEGORIES, current);
        final SubLObject categories = (SubLObject)((sunit_macros.NIL != categories_tail) ? conses_high.cadr(categories_tail) : sunit_macros.NIL);
        final SubLObject slot_decls;
        current = (slot_decls = temp);
        final SubLObject class_properties = (SubLObject)ConsesLow.list((SubLObject)sunit_macros.$kw23$EXTENDS, type);
        return reader.bq_cons((SubLObject)sunit_macros.$sym4$PROGN, ConsesLow.append((SubLObject)((sunit_macros.NIL != Sequences.find((SubLObject)sunit_macros.$kw1$CYC_SUBLOOP, reader.$features$.getDynamicValue(thread), (SubLObject)sunit_macros.UNPROVIDED, (SubLObject)sunit_macros.UNPROVIDED, (SubLObject)sunit_macros.UNPROVIDED, (SubLObject)sunit_macros.UNPROVIDED) && sunit_macros.NIL != Sequences.find((SubLObject)sunit_macros.$kw2$CYC_SUNIT_FULL, reader.$features$.getDynamicValue(thread), (SubLObject)sunit_macros.UNPROVIDED, (SubLObject)sunit_macros.UNPROVIDED, (SubLObject)sunit_macros.UNPROVIDED, (SubLObject)sunit_macros.UNPROVIDED)) ? ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)sunit_macros.$sym4$PROGN, (SubLObject)ConsesLow.listS((SubLObject)sunit_macros.$sym24$CPUSH, (SubLObject)ConsesLow.list((SubLObject)sunit_macros.$sym6$QUOTE, tc_symbol), (SubLObject)sunit_macros.$list25), (SubLObject)ConsesLow.list((SubLObject)sunit_macros.$sym26$DEFINE_TEST_CASE_PREAMBLE, (SubLObject)ConsesLow.list((SubLObject)sunit_macros.$sym6$QUOTE, tc_symbol)), (SubLObject)ConsesLow.listS((SubLObject)sunit_macros.$sym27$DEFINE_CLASS, reader.bq_cons(tc_symbol, class_properties), ConsesLow.append(slot_decls, (SubLObject)sunit_macros.NIL)), (SubLObject)ConsesLow.list((SubLObject)sunit_macros.$sym28$DEFINE_TEST_CASE_POSTAMBLE, (SubLObject)ConsesLow.list((SubLObject)sunit_macros.$sym6$QUOTE, tc_symbol), module_name, system_name, categories))) : sunit_macros.NIL), (SubLObject)sunit_macros.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sunit-macros.lisp", position = 6565L)
    public static SubLObject define_test_case_preamble(final SubLObject tc_symbol) {
        return (SubLObject)sunit_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sunit-macros.lisp", position = 6938L)
    public static SubLObject define_test_case_postamble(final SubLObject tc_symbol, final SubLObject module_name, final SubLObject system_name, final SubLObject categories) {
        return (SubLObject)sunit_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sunit-macros.lisp", position = 7591L)
    public static SubLObject catch_sunit_error_message(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sunit_macros.$list29);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject var = (SubLObject)sunit_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sunit_macros.$list29);
        var = current.first();
        current = current.rest();
        if (sunit_macros.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            return (SubLObject)ConsesLow.list((SubLObject)sunit_macros.$sym30$CCATCH, (SubLObject)sunit_macros.$sym31$_CATCH_ERROR_MESSAGE_TARGET_, var, (SubLObject)ConsesLow.listS((SubLObject)sunit_macros.$sym32$WITH_ERROR_HANDLER, (SubLObject)sunit_macros.$list33, ConsesLow.append(body, (SubLObject)sunit_macros.NIL)));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)sunit_macros.$list29);
        return (SubLObject)sunit_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sunit-macros.lisp", position = 8038L)
    public static SubLObject catch_sunit_error_message_handler() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return Dynamic.sublisp_throw(subl_macro_promotions.$catch_error_message_target$.getGlobalValue(), Errors.$error_message$.getDynamicValue(thread));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sunit-macros.lisp", position = 8416L)
    public static SubLObject test_with_hl_vars(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject num = (SubLObject)sunit_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sunit_macros.$list34);
        num = current.first();
        final SubLObject body;
        current = (body = current.rest());
        final SubLObject hl_vars = (SubLObject)sunit_macros.$sym35$HL_VARS;
        return (SubLObject)ConsesLow.listS((SubLObject)sunit_macros.$sym36$CLET, reader.bq_cons((SubLObject)ConsesLow.list(hl_vars, (SubLObject)ConsesLow.list((SubLObject)sunit_macros.$sym37$GENERATE_HL_VARIABLE_LIST, num)), ConsesLow.append(test_with_hl_vars_var_declarations(num, hl_vars), (SubLObject)sunit_macros.NIL)), ConsesLow.append(body, (SubLObject)sunit_macros.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sunit-macros.lisp", position = 8939L)
    public static SubLObject test_with_hl_vars_var_declarations(final SubLObject highest_num, final SubLObject hl_vars) {
        SubLObject results = (SubLObject)sunit_macros.NIL;
        SubLObject x;
        for (x = (SubLObject)sunit_macros.NIL, x = (SubLObject)sunit_macros.ZERO_INTEGER; x.numL(highest_num); x = Numbers.add(x, (SubLObject)sunit_macros.ONE_INTEGER)) {
            results = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(Packages.intern(Symbols.make_symbol(Sequences.cconcatenate((SubLObject)sunit_macros.$str40$VAR, PrintLow.write_to_string(x, sunit_macros.EMPTY_SUBL_OBJECT_ARRAY))), (SubLObject)sunit_macros.UNPROVIDED), (SubLObject)ConsesLow.list((SubLObject)sunit_macros.$sym41$NTH, x, hl_vars)), results);
        }
        return Sequences.nreverse(results);
    }
    
    public static SubLObject declare_sunit_macros_file() {
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.sunit_macros", "def_test_method", "DEF-TEST-METHOD");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sunit_macros", "def_test_method_register", "DEF-TEST-METHOD-REGISTER", 2, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.sunit_macros", "def_setup_method", "DEF-SETUP-METHOD");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.sunit_macros", "def_cleanup_method", "DEF-CLEANUP-METHOD");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.sunit_macros", "def_tc_conditional_method", "DEF-TC-CONDITIONAL-METHOD");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.sunit_macros", "define_test_case", "DEFINE-TEST-CASE");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.sunit_macros", "define_cycl_test_case", "DEFINE-CYCL-TEST-CASE");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.sunit_macros", "define_test_case_int", "DEFINE-TEST-CASE-INT");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sunit_macros", "define_test_case_preamble", "DEFINE-TEST-CASE-PREAMBLE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sunit_macros", "define_test_case_postamble", "DEFINE-TEST-CASE-POSTAMBLE", 4, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.sunit_macros", "catch_sunit_error_message", "CATCH-SUNIT-ERROR-MESSAGE");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sunit_macros", "catch_sunit_error_message_handler", "CATCH-SUNIT-ERROR-MESSAGE-HANDLER", 0, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.sunit_macros", "test_with_hl_vars", "TEST-WITH-HL-VARS");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sunit_macros", "test_with_hl_vars_var_declarations", "TEST-WITH-HL-VARS-VAR-DECLARATIONS", 2, 0, false);
        return (SubLObject)sunit_macros.NIL;
    }
    
    public static SubLObject init_sunit_macros_file() {
        sunit_macros.$current_module_sunit_tests$ = SubLFiles.defparameter("*CURRENT-MODULE-SUNIT-TESTS*", (SubLObject)sunit_macros.NIL);
        return (SubLObject)sunit_macros.NIL;
    }
    
    public static SubLObject setup_sunit_macros_file() {
        access_macros.register_macro_helper((SubLObject)sunit_macros.$sym5$DEF_TEST_METHOD_REGISTER, (SubLObject)sunit_macros.$sym9$DEF_TEST_METHOD);
        access_macros.register_macro_helper((SubLObject)sunit_macros.$sym26$DEFINE_TEST_CASE_PREAMBLE, (SubLObject)sunit_macros.$sym19$DEFINE_TEST_CASE_INT);
        access_macros.register_macro_helper((SubLObject)sunit_macros.$sym28$DEFINE_TEST_CASE_POSTAMBLE, (SubLObject)sunit_macros.$sym19$DEFINE_TEST_CASE_INT);
        access_macros.register_macro_helper((SubLObject)sunit_macros.$sym38$TEST_WITH_HL_VARS_VAR_DECLARATIONS, (SubLObject)sunit_macros.$sym39$TEST_WITH_HL_VARS);
        return (SubLObject)sunit_macros.NIL;
    }
    
    @Override
	public void declareFunctions() {
        declare_sunit_macros_file();
    }
    
    @Override
	public void initializeVariables() {
        init_sunit_macros_file();
    }
    
    @Override
	public void runTopLevelForms() {
        setup_sunit_macros_file();
    }
    
    static {
        me = (SubLFile)new sunit_macros();
        sunit_macros.$current_module_sunit_tests$ = null;
        $list0 = ConsesLow.list((SubLObject)ConsesLow.listS((SubLObject)SubLObjectFactory.makeSymbol("METHOD-NAME"), (SubLObject)SubLObjectFactory.makeSymbol("CLASS-NAME"), (SubLObject)SubLObjectFactory.makeSymbol("METHOD-PROPERTIES")), (SubLObject)SubLObjectFactory.makeSymbol("LAMBDA-LIST"), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $kw1$CYC_SUBLOOP = SubLObjectFactory.makeKeyword("CYC-SUBLOOP");
        $kw2$CYC_SUNIT_FULL = SubLObjectFactory.makeKeyword("CYC-SUNIT-FULL");
        $str3$_A_is_not_the_name_of_a_known_cla = SubLObjectFactory.makeString("~A is not the name of a known class.");
        $sym4$PROGN = SubLObjectFactory.makeSymbol("PROGN");
        $sym5$DEF_TEST_METHOD_REGISTER = SubLObjectFactory.makeSymbol("DEF-TEST-METHOD-REGISTER");
        $sym6$QUOTE = SubLObjectFactory.makeSymbol("QUOTE");
        $kw7$CYC_SUNIT = SubLObjectFactory.makeKeyword("CYC-SUNIT");
        $sym8$DEF_INSTANCE_METHOD = SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD");
        $sym9$DEF_TEST_METHOD = SubLObjectFactory.makeSymbol("DEF-TEST-METHOD");
        $list10 = ConsesLow.list((SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("CLASS-NAME"), (SubLObject)SubLObjectFactory.makeSymbol("METHOD-PROPERTIES")), (SubLObject)SubLObjectFactory.makeSymbol("LAMBDA-LIST"), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym11$DEF_TC_CONDITIONAL_METHOD = SubLObjectFactory.makeSymbol("DEF-TC-CONDITIONAL-METHOD");
        $sym12$SETUP = SubLObjectFactory.makeSymbol("SETUP");
        $sym13$CLEANUP = SubLObjectFactory.makeSymbol("CLEANUP");
        $list14 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TYPE"), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("CLASS-NAME"), (SubLObject)SubLObjectFactory.makeSymbol("METHOD-PROPERTIES")), (SubLObject)SubLObjectFactory.makeSymbol("LAMBDA-LIST"), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $list15 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TC-SYMBOL"), (SubLObject)SubLObjectFactory.makeSymbol("MODULE-NAME"), (SubLObject)SubLObjectFactory.makeSymbol("SYSTEM-NAME"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("CATEGORIES")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("SLOT-DECLS"));
        $list16 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CATEGORIES"));
        $kw17$ALLOW_OTHER_KEYS = SubLObjectFactory.makeKeyword("ALLOW-OTHER-KEYS");
        $kw18$CATEGORIES = SubLObjectFactory.makeKeyword("CATEGORIES");
        $sym19$DEFINE_TEST_CASE_INT = SubLObjectFactory.makeSymbol("DEFINE-TEST-CASE-INT");
        $sym20$TEST_CASE = SubLObjectFactory.makeSymbol("TEST-CASE");
        $sym21$CYCL_TEST_CASE = SubLObjectFactory.makeSymbol("CYCL-TEST-CASE");
        $list22 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TYPE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TC-SYMBOL"), (SubLObject)SubLObjectFactory.makeSymbol("MODULE-NAME"), (SubLObject)SubLObjectFactory.makeSymbol("SYSTEM-NAME"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("CATEGORIES")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("SLOT-DECLS"));
        $kw23$EXTENDS = SubLObjectFactory.makeKeyword("EXTENDS");
        $sym24$CPUSH = SubLObjectFactory.makeSymbol("CPUSH");
        $list25 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*CURRENT-MODULE-SUNIT-TESTS*"));
        $sym26$DEFINE_TEST_CASE_PREAMBLE = SubLObjectFactory.makeSymbol("DEFINE-TEST-CASE-PREAMBLE");
        $sym27$DEFINE_CLASS = SubLObjectFactory.makeSymbol("DEFINE-CLASS");
        $sym28$DEFINE_TEST_CASE_POSTAMBLE = SubLObjectFactory.makeSymbol("DEFINE-TEST-CASE-POSTAMBLE");
        $list29 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("VAR")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym30$CCATCH = SubLObjectFactory.makeSymbol("CCATCH");
        $sym31$_CATCH_ERROR_MESSAGE_TARGET_ = SubLObjectFactory.makeSymbol("*CATCH-ERROR-MESSAGE-TARGET*");
        $sym32$WITH_ERROR_HANDLER = SubLObjectFactory.makeSymbol("WITH-ERROR-HANDLER");
        $list33 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("CATCH-SUNIT-ERROR-MESSAGE-HANDLER"));
        $list34 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NUM"), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym35$HL_VARS = SubLObjectFactory.makeUninternedSymbol("HL-VARS");
        $sym36$CLET = SubLObjectFactory.makeSymbol("CLET");
        $sym37$GENERATE_HL_VARIABLE_LIST = SubLObjectFactory.makeSymbol("GENERATE-HL-VARIABLE-LIST");
        $sym38$TEST_WITH_HL_VARS_VAR_DECLARATIONS = SubLObjectFactory.makeSymbol("TEST-WITH-HL-VARS-VAR-DECLARATIONS");
        $sym39$TEST_WITH_HL_VARS = SubLObjectFactory.makeSymbol("TEST-WITH-HL-VARS");
        $str40$VAR = SubLObjectFactory.makeString("VAR");
        $sym41$NTH = SubLObjectFactory.makeSymbol("NTH");
    }
}

/*

	Total time: 91 ms
	
*/