package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.StreamsLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import java.util.Map;
import java.util.Iterator;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.stream_macros;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class kb_compare extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.kb_compare";
    public static final String myFingerPrint = "4596bf1c5e22b89f159094f2d1be3f11aaa113c7d9619407a4833caf299b830d";
    @SubLTranslatedFile.SubL(source = "cycl/kb-compare.lisp", position = 768L)
    private static SubLSymbol $kb_compare_common_symbols$;
    @SubLTranslatedFile.SubL(source = "cycl/kb-compare.lisp", position = 2704L)
    public static SubLSymbol $dtp_kb_intersection$;
    @SubLTranslatedFile.SubL(source = "cycl/kb-compare.lisp", position = 8835L)
    private static SubLSymbol $kb_intersection$;
    @SubLTranslatedFile.SubL(source = "cycl/kb-compare.lisp", position = 15293L)
    public static SubLSymbol $dtp_kb_difference$;
    private static final SubLList $list0;
    private static final SubLList $list1;
    private static final SubLList $list2;
    private static final SubLSymbol $sym3$WITH_NEW_REMOTE_IMAGE_CONNECTION;
    private static final SubLSymbol $sym4$CLET;
    private static final SubLList $list5;
    private static final SubLList $list6;
    private static final SubLSymbol $sym7$WITH_CFASL_COMMON_SYMBOLS;
    private static final SubLSymbol $sym8$_KB_COMPARE_COMMON_SYMBOLS_;
    private static final SubLSymbol $sym9$SET_KB_COMPARE_CONNECTION_COMMON_SYMBOLS;
    private static final SubLSymbol $sym10$WITH_NEW_KB_COMPARE_CONNECTION;
    private static final SubLSymbol $kw11$CFASL;
    private static final SubLSymbol $kw12$IGNORE_ERRORS_TARGET;
    private static final SubLSymbol $sym13$IGNORE_ERRORS_HANDLER;
    private static final SubLSymbol $sym14$PROGN;
    private static final SubLSymbol $sym15$CFASL_SET_COMMON_SYMBOLS;
    private static final SubLSymbol $sym16$QUOTE;
    private static final SubLList $list17;
    private static final SubLSymbol $sym18$KB_INTERSECTION;
    private static final SubLSymbol $sym19$KB_INTERSECTION_P;
    private static final SubLList $list20;
    private static final SubLList $list21;
    private static final SubLList $list22;
    private static final SubLList $list23;
    private static final SubLSymbol $sym24$PRINT_KB_INTERSECTION;
    private static final SubLSymbol $sym25$KB_INTERSECTION_PRINT_FUNCTION_TRAMPOLINE;
    private static final SubLList $list26;
    private static final SubLSymbol $sym27$KB_INTRSCT_REMOTE_IMAGE;
    private static final SubLSymbol $sym28$_CSETF_KB_INTRSCT_REMOTE_IMAGE;
    private static final SubLSymbol $sym29$KB_INTRSCT_CONSTANT_INDEX;
    private static final SubLSymbol $sym30$_CSETF_KB_INTRSCT_CONSTANT_INDEX;
    private static final SubLSymbol $sym31$KB_INTRSCT_NART_INDEX;
    private static final SubLSymbol $sym32$_CSETF_KB_INTRSCT_NART_INDEX;
    private static final SubLSymbol $sym33$KB_INTRSCT_ASSERTION_INDEX;
    private static final SubLSymbol $sym34$_CSETF_KB_INTRSCT_ASSERTION_INDEX;
    private static final SubLSymbol $sym35$KB_INTRSCT_DEDUCTION_INDEX;
    private static final SubLSymbol $sym36$_CSETF_KB_INTRSCT_DEDUCTION_INDEX;
    private static final SubLSymbol $kw37$REMOTE_IMAGE;
    private static final SubLSymbol $kw38$CONSTANT_INDEX;
    private static final SubLSymbol $kw39$NART_INDEX;
    private static final SubLSymbol $kw40$ASSERTION_INDEX;
    private static final SubLSymbol $kw41$DEDUCTION_INDEX;
    private static final SubLString $str42$Invalid_slot__S_for_construction_;
    private static final SubLSymbol $kw43$BEGIN;
    private static final SubLSymbol $sym44$MAKE_KB_INTERSECTION;
    private static final SubLSymbol $kw45$SLOT;
    private static final SubLSymbol $kw46$END;
    private static final SubLSymbol $sym47$VISIT_DEFSTRUCT_OBJECT_KB_INTERSECTION_METHOD;
    private static final SubLString $str48$_KB_INTERSECTION_to__a_;
    private static final SubLSymbol $kw49$FREE;
    private static final SubLSymbol $sym50$KB_INTERSECTION_CONSTANT_INDEX;
    private static final SubLSymbol $sym51$DO_KB_INTERSECTION_CONSTANTS;
    private static final SubLSymbol $sym52$CONSTANT_P;
    private static final SubLSymbol $sym53$NON_NEGATIVE_INTEGER_P;
    private static final SubLSymbol $sym54$NART_P;
    private static final SubLSymbol $sym55$ASSERTION_P;
    private static final SubLSymbol $sym56$DEDUCTION_P;
    private static final SubLList $list57;
    private static final SubLList $list58;
    private static final SubLSymbol $kw59$ALLOW_OTHER_KEYS;
    private static final SubLSymbol $kw60$PROGRESS_MESSAGE;
    private static final SubLSymbol $sym61$INTERNAL_ID;
    private static final SubLSymbol $sym62$REMOTE_ID;
    private static final SubLSymbol $sym63$DO_ID_INDEX;
    private static final SubLSymbol $sym64$IGNORE;
    private static final SubLSymbol $sym65$FIND_CONSTANT_BY_INTERNAL_ID;
    private static final SubLSymbol $kw66$IMPOSSIBLE;
    private static final SubLSymbol $sym67$KB_INTERSECTION_NART_IMPOSSIBLE_INT;
    private static final SubLSymbol $sym68$KB_INTERSECTION_ASSERTION_IMPOSSIBLE_INT;
    private static final SubLSymbol $sym69$KB_INTERSECTION_DEDUCTION_IMPOSSIBLE_INT;
    private static final SubLSymbol $kw70$OUTPUT;
    private static final SubLString $str71$Unable_to_open__S;
    private static final SubLSymbol $kw72$INPUT;
    private static final SubLSymbol $kw73$CONSTANTS;
    private static final SubLString $str74$Constants;
    private static final SubLSymbol $kw75$NARTS;
    private static final SubLString $str76$NARTs;
    private static final SubLSymbol $kw77$ASSERTIONS;
    private static final SubLString $str78$Assertions;
    private static final SubLSymbol $kw79$DEDUCTIONS;
    private static final SubLString $str80$Deductions;
    private static final SubLString $str81$Saving_KB_;
    private static final SubLString $str82$_Intersection_ID_Index_____;
    private static final SubLString $str83$Loading_KB_;
    private static final SubLString $str84$Error_in_KB_Intersection_ID_index;
    private static final SubLString $str85$Expected_a_KB_Intersection_ID_ind;
    private static final SubLSymbol $kw86$SKIP;
    private static final SubLString $str87$This_ID_index_cannot_be_inverted_;
    private static final SubLSymbol $sym88$KB_DIFFERENCE;
    private static final SubLSymbol $sym89$KB_DIFFERENCE_P;
    private static final SubLList $list90;
    private static final SubLList $list91;
    private static final SubLList $list92;
    private static final SubLList $list93;
    private static final SubLSymbol $sym94$PRINT_KB_DIFFERENCE;
    private static final SubLSymbol $sym95$KB_DIFFERENCE_PRINT_FUNCTION_TRAMPOLINE;
    private static final SubLList $list96;
    private static final SubLSymbol $sym97$KB_DIFF_COMMON_INTERSECTION;
    private static final SubLSymbol $sym98$_CSETF_KB_DIFF_COMMON_INTERSECTION;
    private static final SubLSymbol $sym99$KB_DIFF_RENAMED_CONSTANTS;
    private static final SubLSymbol $sym100$_CSETF_KB_DIFF_RENAMED_CONSTANTS;
    private static final SubLSymbol $sym101$KB_DIFF_CONSTANTS;
    private static final SubLSymbol $sym102$_CSETF_KB_DIFF_CONSTANTS;
    private static final SubLSymbol $sym103$KB_DIFF_NARTS;
    private static final SubLSymbol $sym104$_CSETF_KB_DIFF_NARTS;
    private static final SubLSymbol $sym105$KB_DIFF_ASSERTIONS;
    private static final SubLSymbol $sym106$_CSETF_KB_DIFF_ASSERTIONS;
    private static final SubLSymbol $sym107$KB_DIFF_DEDUCTIONS;
    private static final SubLSymbol $sym108$_CSETF_KB_DIFF_DEDUCTIONS;
    private static final SubLSymbol $kw109$COMMON_INTERSECTION;
    private static final SubLSymbol $kw110$RENAMED_CONSTANTS;
    private static final SubLSymbol $sym111$MAKE_KB_DIFFERENCE;
    private static final SubLSymbol $sym112$VISIT_DEFSTRUCT_OBJECT_KB_DIFFERENCE_METHOD;
    private static final SubLString $str113$_KB_DIFFERENCE_using__a_;
    private static final SubLSymbol $sym114$KB_DIFFERENCE_RENAMED_CONSTANTS;
    private static final SubLSymbol $sym115$DO_KB_DIFFERENCE_RENAMED_CONSTANTS;
    private static final SubLSymbol $sym116$KB_DIFFERENCE_CONSTANTS;
    private static final SubLSymbol $sym117$DO_KB_DIFFERENCE_CONSTANTS;
    private static final SubLSymbol $sym118$KB_DIFFERENCE_NARTS;
    private static final SubLSymbol $sym119$DO_KB_DIFFERENCE_NARTS;
    private static final SubLSymbol $sym120$KB_DIFFERENCE_ASSERTIONS;
    private static final SubLSymbol $sym121$DO_KB_DIFFERENCE_ASSERTIONS;
    private static final SubLSymbol $sym122$KB_DIFFERENCE_DEDUCTIONS;
    private static final SubLSymbol $sym123$DO_KB_DIFFERENCE_DEDUCTIONS;
    private static final SubLList $list124;
    private static final SubLList $list125;
    private static final SubLSymbol $kw126$DONE;
    private static final SubLSymbol $sym127$DO_DICTIONARY;
    private static final SubLList $list128;
    private static final SubLSymbol $sym129$DO_SET;
    private static final SubLList $list130;
    private static final SubLList $list131;
    private static final SubLList $list132;
    private static final SubLSymbol $sym133$STRINGP;
    private static final SubLSymbol $sym134$_;
    private static final SubLSymbol $sym135$CONSTANT_INTERNAL_ID;
    private static final SubLSymbol $sym136$NART_ID;
    private static final SubLSymbol $sym137$DEDUCTION_ID;
    private static final SubLString $str138$KB_Intersection___Examining_new_c;
    private static final SubLString $str139$KB_Intersection___Examining_const;
    private static final SubLString $str140$KB_Intersection___Examining_old_c;
    private static final SubLList $list141;
    private static final SubLString $str142$KB_Intersection___Examining_new_n;
    private static final SubLString $str143$KB_Intersection___Examining_narts;
    private static final SubLString $str144$KB_Intersection___Examining_old_n;
    private static final SubLString $str145$KB_Intersection___Examining_new_a;
    private static final SubLString $str146$KB_Intersection___Examining_asser;
    private static final SubLString $str147$KB_Intersection___Examining_old_a;
    private static final SubLString $str148$KB_Intersection___Examining_new_d;
    private static final SubLString $str149$KB_Intersection___Examining_deduc;
    private static final SubLString $str150$KB_Intersection___Examining_old_d;
    private static final SubLString $str151$KB_DIFFERENCE___Examining_constan;
    private static final SubLString $str152$KB_DIFFERENCE___Examining_constan;
    private static final SubLString $str153$KB_DIFFERENCE___Examining_narts;
    private static final SubLString $str154$KB_DIFFERENCE___Examining_asserti;
    private static final SubLString $str155$KB_DIFFERENCE___Examining_deducti;
    private static final SubLString $str156$___No_Difference___;
    private static final SubLString $str157$___Renamed_Constants____;
    private static final SubLString $str158$_S_renamed_to__S__;
    private static final SubLString $str159$___Constants____;
    private static final SubLString $str160$_S__;
    private static final SubLString $str161$___Narts____;
    private static final SubLString $str162$___Assertions____;
    private static final SubLString $str163$___Deductions____;
    private static final SubLString $str164$_S__supports___;
    private static final SubLSymbol $sym165$_;
    private static final SubLList $list166;
    private static final SubLList $list167;
    private static final SubLSymbol $sym168$CATCH_ERROR_MESSAGE_HANDLER;
    private static final SubLSymbol $sym169$CONSTANT_INTERNAL_ID_FROM_EXTERNAL_ID;
    private static final SubLString $str170$Could_not_compute_remote_ID_for__;
    private static final SubLSymbol $sym171$CONSTANT_NAME_FROM_INTERNAL_ID;
    private static final SubLList $list172;
    private static final SubLList $list173;
    private static final SubLSymbol $sym174$NART_ID_FROM_RECIPE;
    private static final SubLList $list175;
    private static final SubLList $list176;
    private static final SubLSymbol $sym177$ASSERTION_ID_FROM_RECIPE;
    private static final SubLList $list178;
    private static final SubLList $list179;
    private static final SubLSymbol $sym180$DEDUCTION_ID_FROM_RECIPE;
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-compare.lisp", position = 1336L)
    public static SubLObject with_new_kb_compare_connection(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject v_remote_image = (SubLObject)kb_compare.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)kb_compare.$list2);
        v_remote_image = current.first();
        final SubLObject body;
        current = (body = current.rest());
        return (SubLObject)ConsesLow.list((SubLObject)kb_compare.$sym3$WITH_NEW_REMOTE_IMAGE_CONNECTION, v_remote_image, (SubLObject)ConsesLow.list((SubLObject)kb_compare.$sym4$CLET, (SubLObject)kb_compare.$list5, (SubLObject)kb_compare.$list6, (SubLObject)ConsesLow.listS((SubLObject)kb_compare.$sym7$WITH_CFASL_COMMON_SYMBOLS, (SubLObject)kb_compare.$sym8$_KB_COMPARE_COMMON_SYMBOLS_, ConsesLow.append(body, (SubLObject)kb_compare.NIL))));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-compare.lisp", position = 1664L)
    public static SubLObject set_kb_compare_connection_common_symbols() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject connection = remote_image.current_remote_image_connection();
        if (kb_compare.NIL != connection) {
            final SubLObject protocol = remote_image.remote_image_connection_protocol(connection);
            if (kb_compare.$kw11$CFASL == protocol) {
                SubLObject ignore_errors_tag = (SubLObject)kb_compare.NIL;
                try {
                    thread.throwStack.push(kb_compare.$kw12$IGNORE_ERRORS_TARGET);
                    final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
                    try {
                        Errors.$error_handler$.bind(Symbols.symbol_function((SubLObject)kb_compare.$sym13$IGNORE_ERRORS_HANDLER), thread);
                        try {
                            remote_image.remote_image_connection_eval(connection, (SubLObject)ConsesLow.listS((SubLObject)kb_compare.$sym14$PROGN, (SubLObject)ConsesLow.list((SubLObject)kb_compare.$sym15$CFASL_SET_COMMON_SYMBOLS, (SubLObject)ConsesLow.list((SubLObject)kb_compare.$sym16$QUOTE, kb_compare.$kb_compare_common_symbols$.getDynamicValue(thread))), (SubLObject)kb_compare.$list17));
                        }
                        catch (Throwable catch_var) {
                            Errors.handleThrowable(catch_var, (SubLObject)kb_compare.NIL);
                        }
                    }
                    finally {
                        Errors.$error_handler$.rebind(_prev_bind_0, thread);
                    }
                }
                catch (Throwable ccatch_env_var) {
                    ignore_errors_tag = Errors.handleThrowable(ccatch_env_var, (SubLObject)kb_compare.$kw12$IGNORE_ERRORS_TARGET);
                }
                finally {
                    thread.throwStack.pop();
                }
            }
            else {
                kb_compare.$kb_compare_common_symbols$.setDynamicValue((SubLObject)kb_compare.NIL, thread);
            }
        }
        return (SubLObject)kb_compare.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-compare.lisp", position = 2704L)
    public static SubLObject kb_intersection_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        print_kb_intersection(v_object, stream, (SubLObject)kb_compare.ZERO_INTEGER);
        return (SubLObject)kb_compare.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-compare.lisp", position = 2704L)
    public static SubLObject kb_intersection_p(final SubLObject v_object) {
        return (SubLObject)((v_object.getClass() == $kb_intersection_native.class) ? kb_compare.T : kb_compare.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-compare.lisp", position = 2704L)
    public static SubLObject kb_intrsct_remote_image(final SubLObject v_object) {
        assert kb_compare.NIL != kb_intersection_p(v_object) : v_object;
        return v_object.getField2();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-compare.lisp", position = 2704L)
    public static SubLObject kb_intrsct_constant_index(final SubLObject v_object) {
        assert kb_compare.NIL != kb_intersection_p(v_object) : v_object;
        return v_object.getField3();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-compare.lisp", position = 2704L)
    public static SubLObject kb_intrsct_nart_index(final SubLObject v_object) {
        assert kb_compare.NIL != kb_intersection_p(v_object) : v_object;
        return v_object.getField4();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-compare.lisp", position = 2704L)
    public static SubLObject kb_intrsct_assertion_index(final SubLObject v_object) {
        assert kb_compare.NIL != kb_intersection_p(v_object) : v_object;
        return v_object.getField5();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-compare.lisp", position = 2704L)
    public static SubLObject kb_intrsct_deduction_index(final SubLObject v_object) {
        assert kb_compare.NIL != kb_intersection_p(v_object) : v_object;
        return v_object.getField6();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-compare.lisp", position = 2704L)
    public static SubLObject _csetf_kb_intrsct_remote_image(final SubLObject v_object, final SubLObject value) {
        assert kb_compare.NIL != kb_intersection_p(v_object) : v_object;
        return v_object.setField2(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-compare.lisp", position = 2704L)
    public static SubLObject _csetf_kb_intrsct_constant_index(final SubLObject v_object, final SubLObject value) {
        assert kb_compare.NIL != kb_intersection_p(v_object) : v_object;
        return v_object.setField3(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-compare.lisp", position = 2704L)
    public static SubLObject _csetf_kb_intrsct_nart_index(final SubLObject v_object, final SubLObject value) {
        assert kb_compare.NIL != kb_intersection_p(v_object) : v_object;
        return v_object.setField4(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-compare.lisp", position = 2704L)
    public static SubLObject _csetf_kb_intrsct_assertion_index(final SubLObject v_object, final SubLObject value) {
        assert kb_compare.NIL != kb_intersection_p(v_object) : v_object;
        return v_object.setField5(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-compare.lisp", position = 2704L)
    public static SubLObject _csetf_kb_intrsct_deduction_index(final SubLObject v_object, final SubLObject value) {
        assert kb_compare.NIL != kb_intersection_p(v_object) : v_object;
        return v_object.setField6(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-compare.lisp", position = 2704L)
    public static SubLObject make_kb_intersection(SubLObject arglist) {
        if (arglist == kb_compare.UNPROVIDED) {
            arglist = (SubLObject)kb_compare.NIL;
        }
        final SubLObject v_new = (SubLObject)new $kb_intersection_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = (SubLObject)kb_compare.NIL, next = arglist; kb_compare.NIL != next; next = conses_high.cddr(next)) {
            current_arg = next.first();
            current_value = conses_high.cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql((SubLObject)kb_compare.$kw37$REMOTE_IMAGE)) {
                _csetf_kb_intrsct_remote_image(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)kb_compare.$kw38$CONSTANT_INDEX)) {
                _csetf_kb_intrsct_constant_index(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)kb_compare.$kw39$NART_INDEX)) {
                _csetf_kb_intrsct_nart_index(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)kb_compare.$kw40$ASSERTION_INDEX)) {
                _csetf_kb_intrsct_assertion_index(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)kb_compare.$kw41$DEDUCTION_INDEX)) {
                _csetf_kb_intrsct_deduction_index(v_new, current_value);
            }
            else {
                Errors.error((SubLObject)kb_compare.$str42$Invalid_slot__S_for_construction_, current_arg);
            }
        }
        return v_new;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-compare.lisp", position = 2704L)
    public static SubLObject visit_defstruct_kb_intersection(final SubLObject obj, final SubLObject visitor_fn) {
        Functions.funcall(visitor_fn, obj, (SubLObject)kb_compare.$kw43$BEGIN, (SubLObject)kb_compare.$sym44$MAKE_KB_INTERSECTION, (SubLObject)kb_compare.FIVE_INTEGER);
        Functions.funcall(visitor_fn, obj, (SubLObject)kb_compare.$kw45$SLOT, (SubLObject)kb_compare.$kw37$REMOTE_IMAGE, kb_intrsct_remote_image(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)kb_compare.$kw45$SLOT, (SubLObject)kb_compare.$kw38$CONSTANT_INDEX, kb_intrsct_constant_index(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)kb_compare.$kw45$SLOT, (SubLObject)kb_compare.$kw39$NART_INDEX, kb_intrsct_nart_index(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)kb_compare.$kw45$SLOT, (SubLObject)kb_compare.$kw40$ASSERTION_INDEX, kb_intrsct_assertion_index(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)kb_compare.$kw45$SLOT, (SubLObject)kb_compare.$kw41$DEDUCTION_INDEX, kb_intrsct_deduction_index(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)kb_compare.$kw46$END, (SubLObject)kb_compare.$sym44$MAKE_KB_INTERSECTION, (SubLObject)kb_compare.FIVE_INTEGER);
        return obj;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-compare.lisp", position = 2704L)
    public static SubLObject visit_defstruct_object_kb_intersection_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_kb_intersection(obj, visitor_fn);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-compare.lisp", position = 3502L)
    public static SubLObject print_kb_intersection(final SubLObject v_object, final SubLObject stream, final SubLObject depth) {
        PrintLow.format(stream, (SubLObject)kb_compare.$str48$_KB_INTERSECTION_to__a_, kb_intersection_remote_image(v_object));
        return (SubLObject)kb_compare.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-compare.lisp", position = 3678L)
    public static SubLObject new_kb_intersection(final SubLObject v_remote_image) {
        final SubLObject intersection = make_kb_intersection((SubLObject)kb_compare.UNPROVIDED);
        _csetf_kb_intrsct_remote_image(intersection, v_remote_image);
        _csetf_kb_intrsct_constant_index(intersection, constant_handles.new_dense_constant_id_index());
        _csetf_kb_intrsct_nart_index(intersection, nart_handles.new_dense_nart_id_index());
        _csetf_kb_intrsct_assertion_index(intersection, assertion_handles.new_dense_assertion_id_index());
        _csetf_kb_intrsct_deduction_index(intersection, deduction_handles.new_dense_deduction_id_index());
        return intersection;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-compare.lisp", position = 4216L)
    public static SubLObject destroy_kb_intersection(final SubLObject intersection) {
        id_index.clear_id_index(kb_intrsct_constant_index(intersection));
        id_index.clear_id_index(kb_intrsct_nart_index(intersection));
        id_index.clear_id_index(kb_intrsct_assertion_index(intersection));
        id_index.clear_id_index(kb_intrsct_deduction_index(intersection));
        _csetf_kb_intrsct_remote_image(intersection, (SubLObject)kb_compare.$kw49$FREE);
        _csetf_kb_intrsct_constant_index(intersection, (SubLObject)kb_compare.NIL);
        _csetf_kb_intrsct_nart_index(intersection, (SubLObject)kb_compare.NIL);
        _csetf_kb_intrsct_assertion_index(intersection, (SubLObject)kb_compare.NIL);
        _csetf_kb_intrsct_deduction_index(intersection, (SubLObject)kb_compare.NIL);
        return intersection;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-compare.lisp", position = 4903L)
    public static SubLObject kb_intersection_remote_image(final SubLObject connection) {
        return kb_intrsct_remote_image(connection);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-compare.lisp", position = 5019L)
    public static SubLObject kb_intersection_constant_index(final SubLObject intersection) {
        return kb_intrsct_constant_index(intersection);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-compare.lisp", position = 5178L)
    public static SubLObject kb_intersection_add_constant(final SubLObject intersection, final SubLObject constant, final SubLObject remote_id) {
        assert kb_compare.NIL != constant_handles.constant_p(constant) : constant;
        assert kb_compare.NIL != subl_promotions.non_negative_integer_p(remote_id) : remote_id;
        id_index.id_index_enter(kb_intrsct_constant_index(intersection), constants_high.constant_internal_id(constant), remote_id);
        return intersection;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-compare.lisp", position = 5489L)
    public static SubLObject kb_intersection_add_nart(final SubLObject intersection, final SubLObject nart, final SubLObject remote_id) {
        assert kb_compare.NIL != nart_handles.nart_p(nart) : nart;
        assert kb_compare.NIL != subl_promotions.non_negative_integer_p(remote_id) : remote_id;
        id_index.id_index_enter(kb_intrsct_nart_index(intersection), nart_handles.nart_id(nart), remote_id);
        return intersection;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-compare.lisp", position = 5739L)
    public static SubLObject kb_intersection_add_assertion(final SubLObject intersection, final SubLObject assertion, final SubLObject remote_id) {
        assert kb_compare.NIL != assertion_handles.assertion_p(assertion) : assertion;
        assert kb_compare.NIL != subl_promotions.non_negative_integer_p(remote_id) : remote_id;
        id_index.id_index_enter(kb_intrsct_assertion_index(intersection), assertion_handles.assertion_id(assertion), remote_id);
        return intersection;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-compare.lisp", position = 6024L)
    public static SubLObject kb_intersection_add_deduction(final SubLObject intersection, final SubLObject deduction, final SubLObject remote_id) {
        assert kb_compare.NIL != deduction_handles.deduction_p(deduction) : deduction;
        assert kb_compare.NIL != subl_promotions.non_negative_integer_p(remote_id) : remote_id;
        id_index.id_index_enter(kb_intrsct_deduction_index(intersection), deduction_handles.deduction_id(deduction), remote_id);
        return intersection;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-compare.lisp", position = 6309L)
    public static SubLObject kb_intersection_remote_image_machine(final SubLObject intersection) {
        return remote_image.remote_image_machine(kb_intersection_remote_image(intersection));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-compare.lisp", position = 6468L)
    public static SubLObject kb_intersection_remote_image_port(final SubLObject intersection) {
        return remote_image.remote_image_port(kb_intersection_remote_image(intersection));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-compare.lisp", position = 6607L)
    public static SubLObject kb_intersection_remote_image_protocol(final SubLObject intersection) {
        return remote_image.remote_image_protocol(kb_intersection_remote_image(intersection));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-compare.lisp", position = 6754L)
    public static SubLObject kb_intersection_constantP(final SubLObject intersection, final SubLObject constant) {
        return (SubLObject)SubLObjectFactory.makeBoolean(kb_compare.NIL != constant_handles.constant_p(constant) && kb_compare.NIL != list_utilities.sublisp_boolean(kb_intersection_constant_remote_id(intersection, constant)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-compare.lisp", position = 6935L)
    public static SubLObject kb_intersection_constant_remote_id(final SubLObject intersection, final SubLObject constant) {
        final SubLObject index = kb_intrsct_constant_index(intersection);
        final SubLObject local_id = constants_high.constant_internal_id(constant);
        if (kb_compare.NIL != local_id) {
            return id_index.id_index_lookup(index, local_id, (SubLObject)kb_compare.UNPROVIDED);
        }
        return (SubLObject)kb_compare.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-compare.lisp", position = 7183L)
    public static SubLObject kb_intersection_nartP(final SubLObject intersection, final SubLObject nart) {
        return (SubLObject)SubLObjectFactory.makeBoolean(kb_compare.NIL != nart_handles.nart_p(nart) && kb_compare.NIL != list_utilities.sublisp_boolean(kb_intersection_nart_remote_id(intersection, nart)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-compare.lisp", position = 7339L)
    public static SubLObject kb_intersection_nart_remote_id(final SubLObject intersection, final SubLObject nart) {
        final SubLObject index = kb_intrsct_nart_index(intersection);
        final SubLObject local_id = nart_handles.nart_id(nart);
        if (kb_compare.NIL != local_id) {
            return id_index.id_index_lookup(index, local_id, (SubLObject)kb_compare.UNPROVIDED);
        }
        return (SubLObject)kb_compare.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-compare.lisp", position = 7558L)
    public static SubLObject kb_intersection_assertionP(final SubLObject intersection, final SubLObject assertion) {
        return (SubLObject)SubLObjectFactory.makeBoolean(kb_compare.NIL != assertion_handles.assertion_p(assertion) && kb_compare.NIL != list_utilities.sublisp_boolean(kb_intersection_assertion_remote_id(intersection, assertion)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-compare.lisp", position = 7744L)
    public static SubLObject kb_intersection_assertion_remote_id(final SubLObject intersection, final SubLObject assertion) {
        final SubLObject index = kb_intrsct_assertion_index(intersection);
        final SubLObject local_id = assertion_handles.assertion_id(assertion);
        if (kb_compare.NIL != local_id) {
            return id_index.id_index_lookup(index, local_id, (SubLObject)kb_compare.UNPROVIDED);
        }
        return (SubLObject)kb_compare.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-compare.lisp", position = 7988L)
    public static SubLObject kb_intersection_deductionP(final SubLObject intersection, final SubLObject deduction) {
        return (SubLObject)SubLObjectFactory.makeBoolean(kb_compare.NIL != deduction_handles.deduction_p(deduction) && kb_compare.NIL != list_utilities.sublisp_boolean(kb_intersection_deduction_remote_id(intersection, deduction)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-compare.lisp", position = 8174L)
    public static SubLObject kb_intersection_deduction_remote_id(final SubLObject intersection, final SubLObject deduction) {
        final SubLObject index = kb_intrsct_deduction_index(intersection);
        final SubLObject local_id = deduction_handles.deduction_id(deduction);
        if (kb_compare.NIL != local_id) {
            return id_index.id_index_lookup(index, local_id, (SubLObject)kb_compare.UNPROVIDED);
        }
        return (SubLObject)kb_compare.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-compare.lisp", position = 8418L)
    public static SubLObject do_kb_intersection_constants(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)kb_compare.$list57);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject constant = (SubLObject)kb_compare.NIL;
        SubLObject intersection = (SubLObject)kb_compare.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)kb_compare.$list57);
        constant = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)kb_compare.$list57);
        intersection = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = (SubLObject)kb_compare.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)kb_compare.NIL;
        SubLObject current_$1 = (SubLObject)kb_compare.NIL;
        while (kb_compare.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)kb_compare.$list57);
            current_$1 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)kb_compare.$list57);
            if (kb_compare.NIL == conses_high.member(current_$1, (SubLObject)kb_compare.$list58, (SubLObject)kb_compare.UNPROVIDED, (SubLObject)kb_compare.UNPROVIDED)) {
                bad = (SubLObject)kb_compare.T;
            }
            if (current_$1 == kb_compare.$kw59$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (kb_compare.NIL != bad && kb_compare.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)kb_compare.$list57);
        }
        final SubLObject progress_message_tail = cdestructuring_bind.property_list_member((SubLObject)kb_compare.$kw60$PROGRESS_MESSAGE, current);
        final SubLObject progress_message = (SubLObject)((kb_compare.NIL != progress_message_tail) ? conses_high.cadr(progress_message_tail) : kb_compare.NIL);
        final SubLObject body;
        current = (body = temp);
        final SubLObject internal_id = (SubLObject)kb_compare.$sym61$INTERNAL_ID;
        final SubLObject remote_id = (SubLObject)kb_compare.$sym62$REMOTE_ID;
        return (SubLObject)ConsesLow.list((SubLObject)kb_compare.$sym63$DO_ID_INDEX, (SubLObject)ConsesLow.list(internal_id, remote_id, (SubLObject)ConsesLow.list((SubLObject)kb_compare.$sym50$KB_INTERSECTION_CONSTANT_INDEX, intersection), (SubLObject)kb_compare.$kw60$PROGRESS_MESSAGE, progress_message), (SubLObject)ConsesLow.list((SubLObject)kb_compare.$sym64$IGNORE, remote_id), (SubLObject)ConsesLow.listS((SubLObject)kb_compare.$sym4$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant, (SubLObject)ConsesLow.list((SubLObject)kb_compare.$sym65$FIND_CONSTANT_BY_INTERNAL_ID, internal_id))), ConsesLow.append(body, (SubLObject)kb_compare.NIL)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-compare.lisp", position = 8922L)
    public static SubLObject kb_intersection_nart_impossibleP(final SubLObject intersection, final SubLObject nart) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject impossible = (SubLObject)kb_compare.NIL;
        try {
            thread.throwStack.push(kb_compare.$kw66$IMPOSSIBLE);
            final SubLObject _prev_bind_0 = kb_compare.$kb_intersection$.currentBinding(thread);
            try {
                kb_compare.$kb_intersection$.bind(intersection, thread);
                list_utilities.tree_map((SubLObject)kb_compare.$sym67$KB_INTERSECTION_NART_IMPOSSIBLE_INT, cycl_utilities.nart_cons(nart), (SubLObject)kb_compare.UNPROVIDED);
            }
            finally {
                kb_compare.$kb_intersection$.rebind(_prev_bind_0, thread);
            }
        }
        catch (Throwable ccatch_env_var) {
            impossible = Errors.handleThrowable(ccatch_env_var, (SubLObject)kb_compare.$kw66$IMPOSSIBLE);
        }
        finally {
            thread.throwStack.pop();
        }
        return impossible;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-compare.lisp", position = 9306L)
    public static SubLObject kb_intersection_nart_impossible_int(final SubLObject v_object) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((kb_compare.NIL != constant_handles.constant_p(v_object) && kb_compare.NIL == kb_intersection_constantP(kb_compare.$kb_intersection$.getDynamicValue(thread), v_object)) || (kb_compare.NIL != nart_handles.nart_p(v_object) && kb_compare.NIL != kb_intersection_nart_impossibleP(kb_compare.$kb_intersection$.getDynamicValue(thread), v_object))) {
            Dynamic.sublisp_throw((SubLObject)kb_compare.$kw66$IMPOSSIBLE, (SubLObject)kb_compare.T);
        }
        return (SubLObject)kb_compare.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-compare.lisp", position = 9647L)
    public static SubLObject kb_intersection_assertion_impossibleP(final SubLObject intersection, final SubLObject assertion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject impossible = (SubLObject)kb_compare.NIL;
        try {
            thread.throwStack.push(kb_compare.$kw66$IMPOSSIBLE);
            final SubLObject _prev_bind_0 = kb_compare.$kb_intersection$.currentBinding(thread);
            try {
                kb_compare.$kb_intersection$.bind(intersection, thread);
                list_utilities.tree_map((SubLObject)kb_compare.$sym68$KB_INTERSECTION_ASSERTION_IMPOSSIBLE_INT, assertions_high.assertion_cons(assertion), (SubLObject)kb_compare.UNPROVIDED);
                cycl_utilities.expression_map((SubLObject)kb_compare.$sym68$KB_INTERSECTION_ASSERTION_IMPOSSIBLE_INT, assertions_high.assertion_mt(assertion), (SubLObject)kb_compare.T, (SubLObject)kb_compare.UNPROVIDED);
            }
            finally {
                kb_compare.$kb_intersection$.rebind(_prev_bind_0, thread);
            }
        }
        catch (Throwable ccatch_env_var) {
            impossible = Errors.handleThrowable(ccatch_env_var, (SubLObject)kb_compare.$kw66$IMPOSSIBLE);
        }
        finally {
            thread.throwStack.pop();
        }
        return impossible;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-compare.lisp", position = 10170L)
    public static SubLObject kb_intersection_assertion_impossible_int(final SubLObject v_object) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((kb_compare.NIL != constant_handles.constant_p(v_object) && kb_compare.NIL == kb_intersection_constantP(kb_compare.$kb_intersection$.getDynamicValue(thread), v_object)) || (kb_compare.NIL != nart_handles.nart_p(v_object) && kb_compare.NIL == kb_intersection_nartP(kb_compare.$kb_intersection$.getDynamicValue(thread), v_object)) || (kb_compare.NIL != assertion_handles.assertion_p(v_object) && kb_compare.NIL != kb_intersection_assertion_impossibleP(kb_compare.$kb_intersection$.getDynamicValue(thread), v_object))) {
            Dynamic.sublisp_throw((SubLObject)kb_compare.$kw66$IMPOSSIBLE, (SubLObject)kb_compare.T);
        }
        return (SubLObject)kb_compare.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-compare.lisp", position = 10583L)
    public static SubLObject kb_intersection_deduction_impossibleP(final SubLObject intersection, final SubLObject deduction) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject impossible = (SubLObject)kb_compare.NIL;
        try {
            thread.throwStack.push(kb_compare.$kw66$IMPOSSIBLE);
            final SubLObject _prev_bind_0 = kb_compare.$kb_intersection$.currentBinding(thread);
            try {
                kb_compare.$kb_intersection$.bind(intersection, thread);
                kb_intersection_deduction_impossible_int(deductions_high.deduction_supported_object(deduction));
                SubLObject cdolist_list_var = deductions_high.deduction_supports(deduction);
                SubLObject support = (SubLObject)kb_compare.NIL;
                support = cdolist_list_var.first();
                while (kb_compare.NIL != cdolist_list_var) {
                    if (kb_compare.NIL != assertion_handles.assertion_p(support)) {
                        kb_intersection_deduction_impossible_int(support);
                    }
                    else {
                        list_utilities.tree_map((SubLObject)kb_compare.$sym69$KB_INTERSECTION_DEDUCTION_IMPOSSIBLE_INT, arguments.support_cons(support), (SubLObject)kb_compare.UNPROVIDED);
                        cycl_utilities.expression_map((SubLObject)kb_compare.$sym69$KB_INTERSECTION_DEDUCTION_IMPOSSIBLE_INT, arguments.support_mt(support), (SubLObject)kb_compare.T, (SubLObject)kb_compare.UNPROVIDED);
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    support = cdolist_list_var.first();
                }
            }
            finally {
                kb_compare.$kb_intersection$.rebind(_prev_bind_0, thread);
            }
        }
        catch (Throwable ccatch_env_var) {
            impossible = Errors.handleThrowable(ccatch_env_var, (SubLObject)kb_compare.$kw66$IMPOSSIBLE);
        }
        finally {
            thread.throwStack.pop();
        }
        return impossible;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-compare.lisp", position = 11353L)
    public static SubLObject kb_intersection_deduction_impossible_int(final SubLObject v_object) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((kb_compare.NIL != constant_handles.constant_p(v_object) && kb_compare.NIL == kb_intersection_constantP(kb_compare.$kb_intersection$.getDynamicValue(thread), v_object)) || (kb_compare.NIL != nart_handles.nart_p(v_object) && kb_compare.NIL == kb_intersection_nartP(kb_compare.$kb_intersection$.getDynamicValue(thread), v_object)) || (kb_compare.NIL != assertion_handles.assertion_p(v_object) && kb_compare.NIL == kb_intersection_assertionP(kb_compare.$kb_intersection$.getDynamicValue(thread), v_object))) {
            Dynamic.sublisp_throw((SubLObject)kb_compare.$kw66$IMPOSSIBLE, (SubLObject)kb_compare.T);
        }
        return (SubLObject)kb_compare.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-compare.lisp", position = 11762L)
    public static SubLObject save_kb_intersection_information_to_file(final SubLObject kb_intersection, final SubLObject file) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject stream = (SubLObject)kb_compare.NIL;
        try {
            final SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding(thread);
            try {
                stream_macros.$stream_requires_locking$.bind((SubLObject)kb_compare.NIL, thread);
                stream = compatibility.open_text(file, (SubLObject)kb_compare.$kw70$OUTPUT);
            }
            finally {
                stream_macros.$stream_requires_locking$.rebind(_prev_bind_0, thread);
            }
            if (!stream.isStream()) {
                Errors.error((SubLObject)kb_compare.$str71$Unable_to_open__S, file);
            }
            final SubLObject s = stream;
            save_kb_intersection_information(kb_intersection, s);
        }
        finally {
            final SubLObject _prev_bind_2 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)kb_compare.T, thread);
                final SubLObject _values = Values.getValuesAsVector();
                if (stream.isStream()) {
                    streams_high.close(stream, (SubLObject)kb_compare.UNPROVIDED);
                }
                Values.restoreValuesFromVector(_values);
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
            }
        }
        return kb_intersection;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-compare.lisp", position = 12110L)
    public static SubLObject load_kb_intersection_information_from_file(final SubLObject v_remote_image, final SubLObject file) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject kb_intersection = (SubLObject)kb_compare.NIL;
        SubLObject stream = (SubLObject)kb_compare.NIL;
        try {
            final SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding(thread);
            try {
                stream_macros.$stream_requires_locking$.bind((SubLObject)kb_compare.NIL, thread);
                stream = compatibility.open_text(file, (SubLObject)kb_compare.$kw72$INPUT);
            }
            finally {
                stream_macros.$stream_requires_locking$.rebind(_prev_bind_0, thread);
            }
            if (!stream.isStream()) {
                Errors.error((SubLObject)kb_compare.$str71$Unable_to_open__S, file);
            }
            final SubLObject s = stream;
            kb_intersection = load_kb_intersection_information(v_remote_image, s);
        }
        finally {
            final SubLObject _prev_bind_2 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)kb_compare.T, thread);
                final SubLObject _values = Values.getValuesAsVector();
                if (stream.isStream()) {
                    streams_high.close(stream, (SubLObject)kb_compare.UNPROVIDED);
                }
                Values.restoreValuesFromVector(_values);
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
            }
        }
        return kb_intersection;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-compare.lisp", position = 12433L)
    public static SubLObject save_kb_intersection_information(final SubLObject kb_intersection, final SubLObject stream) {
        dumper.dump_copyright(stream);
        cfasl.cfasl_output((SubLObject)kb_compare.$kw73$CONSTANTS, stream);
        save_kb_intersection_id_index(kb_intrsct_constant_index(kb_intersection), stream, (SubLObject)kb_compare.$str74$Constants);
        cfasl.cfasl_output((SubLObject)kb_compare.$kw75$NARTS, stream);
        save_kb_intersection_id_index(kb_intrsct_nart_index(kb_intersection), stream, (SubLObject)kb_compare.$str76$NARTs);
        cfasl.cfasl_output((SubLObject)kb_compare.$kw77$ASSERTIONS, stream);
        save_kb_intersection_id_index(kb_intrsct_assertion_index(kb_intersection), stream, (SubLObject)kb_compare.$str78$Assertions);
        cfasl.cfasl_output((SubLObject)kb_compare.$kw79$DEDUCTIONS, stream);
        save_kb_intersection_id_index(kb_intrsct_deduction_index(kb_intersection), stream, (SubLObject)kb_compare.$str80$Deductions);
        return kb_intersection;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-compare.lisp", position = 13099L)
    public static SubLObject load_kb_intersection_information(final SubLObject v_remote_image, final SubLObject stream) {
        final SubLObject kb_intersection = new_kb_intersection(v_remote_image);
        dumper.load_copyright(stream);
        _csetf_kb_intrsct_constant_index(kb_intersection, load_kb_intersection_id_index((SubLObject)kb_compare.$kw73$CONSTANTS, stream));
        _csetf_kb_intrsct_nart_index(kb_intersection, load_kb_intersection_id_index((SubLObject)kb_compare.$kw75$NARTS, stream));
        _csetf_kb_intrsct_assertion_index(kb_intersection, load_kb_intersection_id_index((SubLObject)kb_compare.$kw77$ASSERTIONS, stream));
        _csetf_kb_intrsct_deduction_index(kb_intersection, load_kb_intersection_id_index((SubLObject)kb_compare.$kw79$DEDUCTIONS, stream));
        return kb_intersection;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-compare.lisp", position = 13759L)
    public static SubLObject save_kb_intersection_id_index(final SubLObject v_id_index, final SubLObject stream, final SubLObject type) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject str;
        final SubLObject message = str = Sequences.cconcatenate((SubLObject)kb_compare.$str81$Saving_KB_, new SubLObject[] { format_nil.format_nil_a_no_copy(type), kb_compare.$str82$_Intersection_ID_Index_____ });
        final SubLObject _prev_bind_0 = utilities_macros.$progress_start_time$.currentBinding(thread);
        final SubLObject _prev_bind_2 = utilities_macros.$progress_last_pacification_time$.currentBinding(thread);
        final SubLObject _prev_bind_3 = utilities_macros.$progress_elapsed_seconds_for_notification$.currentBinding(thread);
        final SubLObject _prev_bind_4 = utilities_macros.$progress_notification_count$.currentBinding(thread);
        final SubLObject _prev_bind_5 = utilities_macros.$progress_pacifications_since_last_nl$.currentBinding(thread);
        final SubLObject _prev_bind_6 = utilities_macros.$progress_count$.currentBinding(thread);
        final SubLObject _prev_bind_7 = utilities_macros.$is_noting_progressP$.currentBinding(thread);
        final SubLObject _prev_bind_8 = utilities_macros.$silent_progressP$.currentBinding(thread);
        try {
            utilities_macros.$progress_start_time$.bind(Time.get_universal_time(), thread);
            utilities_macros.$progress_last_pacification_time$.bind(utilities_macros.$progress_start_time$.getDynamicValue(thread), thread);
            utilities_macros.$progress_elapsed_seconds_for_notification$.bind(utilities_macros.$suppress_all_progress_faster_than_seconds$.getDynamicValue(thread), thread);
            utilities_macros.$progress_notification_count$.bind((SubLObject)kb_compare.ZERO_INTEGER, thread);
            utilities_macros.$progress_pacifications_since_last_nl$.bind((SubLObject)kb_compare.ZERO_INTEGER, thread);
            utilities_macros.$progress_count$.bind((SubLObject)kb_compare.ZERO_INTEGER, thread);
            utilities_macros.$is_noting_progressP$.bind((SubLObject)kb_compare.T, thread);
            utilities_macros.$silent_progressP$.bind((SubLObject)((kb_compare.NIL != str) ? utilities_macros.$silent_progressP$.getDynamicValue(thread) : kb_compare.T), thread);
            utilities_macros.noting_progress_preamble(str);
            cfasl.cfasl_output(invert_kb_intersection_id_index(v_id_index), stream);
            utilities_macros.noting_progress_postamble();
        }
        finally {
            utilities_macros.$silent_progressP$.rebind(_prev_bind_8, thread);
            utilities_macros.$is_noting_progressP$.rebind(_prev_bind_7, thread);
            utilities_macros.$progress_count$.rebind(_prev_bind_6, thread);
            utilities_macros.$progress_pacifications_since_last_nl$.rebind(_prev_bind_5, thread);
            utilities_macros.$progress_notification_count$.rebind(_prev_bind_4, thread);
            utilities_macros.$progress_elapsed_seconds_for_notification$.rebind(_prev_bind_3, thread);
            utilities_macros.$progress_last_pacification_time$.rebind(_prev_bind_2, thread);
            utilities_macros.$progress_start_time$.rebind(_prev_bind_0, thread);
        }
        return v_id_index;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-compare.lisp", position = 14030L)
    public static SubLObject load_kb_intersection_id_index(final SubLObject type, final SubLObject stream) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject message = Sequences.cconcatenate((SubLObject)kb_compare.$str83$Loading_KB_, new SubLObject[] { format_nil.format_nil_a_no_copy(type), kb_compare.$str82$_Intersection_ID_Index_____ });
        final SubLObject marker = cfasl.cfasl_input(stream, (SubLObject)kb_compare.UNPROVIDED, (SubLObject)kb_compare.UNPROVIDED);
        SubLObject v_id_index = (SubLObject)kb_compare.NIL;
        if (kb_compare.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && !type.eql(marker)) {
            Errors.error((SubLObject)kb_compare.$str84$Error_in_KB_Intersection_ID_index, type, marker);
        }
        final SubLObject str = message;
        final SubLObject _prev_bind_0 = utilities_macros.$progress_start_time$.currentBinding(thread);
        final SubLObject _prev_bind_2 = utilities_macros.$progress_last_pacification_time$.currentBinding(thread);
        final SubLObject _prev_bind_3 = utilities_macros.$progress_elapsed_seconds_for_notification$.currentBinding(thread);
        final SubLObject _prev_bind_4 = utilities_macros.$progress_notification_count$.currentBinding(thread);
        final SubLObject _prev_bind_5 = utilities_macros.$progress_pacifications_since_last_nl$.currentBinding(thread);
        final SubLObject _prev_bind_6 = utilities_macros.$progress_count$.currentBinding(thread);
        final SubLObject _prev_bind_7 = utilities_macros.$is_noting_progressP$.currentBinding(thread);
        final SubLObject _prev_bind_8 = utilities_macros.$silent_progressP$.currentBinding(thread);
        try {
            utilities_macros.$progress_start_time$.bind(Time.get_universal_time(), thread);
            utilities_macros.$progress_last_pacification_time$.bind(utilities_macros.$progress_start_time$.getDynamicValue(thread), thread);
            utilities_macros.$progress_elapsed_seconds_for_notification$.bind(utilities_macros.$suppress_all_progress_faster_than_seconds$.getDynamicValue(thread), thread);
            utilities_macros.$progress_notification_count$.bind((SubLObject)kb_compare.ZERO_INTEGER, thread);
            utilities_macros.$progress_pacifications_since_last_nl$.bind((SubLObject)kb_compare.ZERO_INTEGER, thread);
            utilities_macros.$progress_count$.bind((SubLObject)kb_compare.ZERO_INTEGER, thread);
            utilities_macros.$is_noting_progressP$.bind((SubLObject)kb_compare.T, thread);
            utilities_macros.$silent_progressP$.bind((SubLObject)((kb_compare.NIL != str) ? utilities_macros.$silent_progressP$.getDynamicValue(thread) : kb_compare.T), thread);
            utilities_macros.noting_progress_preamble(str);
            v_id_index = cfasl.cfasl_input(stream, (SubLObject)kb_compare.UNPROVIDED, (SubLObject)kb_compare.UNPROVIDED);
            if (kb_compare.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && kb_compare.NIL == id_index.id_index_p(v_id_index)) {
                Errors.error((SubLObject)kb_compare.$str85$Expected_a_KB_Intersection_ID_ind, v_id_index);
            }
            utilities_macros.noting_progress_postamble();
        }
        finally {
            utilities_macros.$silent_progressP$.rebind(_prev_bind_8, thread);
            utilities_macros.$is_noting_progressP$.rebind(_prev_bind_7, thread);
            utilities_macros.$progress_count$.rebind(_prev_bind_6, thread);
            utilities_macros.$progress_pacifications_since_last_nl$.rebind(_prev_bind_5, thread);
            utilities_macros.$progress_notification_count$.rebind(_prev_bind_4, thread);
            utilities_macros.$progress_elapsed_seconds_for_notification$.rebind(_prev_bind_3, thread);
            utilities_macros.$progress_last_pacification_time$.rebind(_prev_bind_2, thread);
            utilities_macros.$progress_start_time$.rebind(_prev_bind_0, thread);
        }
        return v_id_index;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-compare.lisp", position = 14556L)
    public static SubLObject invert_kb_intersection_id_index(final SubLObject v_id_index) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject new_index = id_index.clone_id_index(v_id_index);
        if (kb_compare.NIL == id_index.id_index_objects_empty_p(v_id_index, (SubLObject)kb_compare.$kw86$SKIP)) {
            if (kb_compare.NIL == id_index.id_index_dense_objects_empty_p(v_id_index, (SubLObject)kb_compare.$kw86$SKIP)) {
                final SubLObject vector_var = id_index.id_index_dense_objects(v_id_index);
                final SubLObject backwardP_var = (SubLObject)kb_compare.NIL;
                SubLObject length;
                SubLObject v_iteration;
                SubLObject id;
                SubLObject v_object;
                for (length = Sequences.length(vector_var), v_iteration = (SubLObject)kb_compare.NIL, v_iteration = (SubLObject)kb_compare.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)kb_compare.ONE_INTEGER)) {
                    id = ((kb_compare.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)kb_compare.ONE_INTEGER) : v_iteration);
                    v_object = Vectors.aref(vector_var, id);
                    if (kb_compare.NIL == id_index.id_index_tombstone_p(v_object) || kb_compare.NIL == id_index.id_index_skip_tombstones_p((SubLObject)kb_compare.$kw86$SKIP)) {
                        if (kb_compare.NIL != id_index.id_index_tombstone_p(v_object)) {
                            v_object = (SubLObject)kb_compare.$kw86$SKIP;
                        }
                        if (kb_compare.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && kb_compare.NIL == subl_promotions.non_negative_integer_p(v_object)) {
                            Errors.error((SubLObject)kb_compare.$str87$This_ID_index_cannot_be_inverted_, id, v_object);
                        }
                        id_index.id_index_enter(new_index, v_object, id);
                    }
                }
            }
            if (kb_compare.NIL == id_index.id_index_sparse_objects_empty_p(v_id_index)) {
                final SubLObject cdohash_table = id_index.id_index_sparse_objects(v_id_index);
                SubLObject id2 = (SubLObject)kb_compare.NIL;
                SubLObject v_object2 = (SubLObject)kb_compare.NIL;
                final Iterator cdohash_iterator = Hashtables.getEntrySetIterator(cdohash_table);
                try {
                    while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                        final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                        id2 = Hashtables.getEntryKey(cdohash_entry);
                        v_object2 = Hashtables.getEntryValue(cdohash_entry);
                        if (kb_compare.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && kb_compare.NIL == subl_promotions.non_negative_integer_p(v_object2)) {
                            Errors.error((SubLObject)kb_compare.$str87$This_ID_index_cannot_be_inverted_, id2, v_object2);
                        }
                        id_index.id_index_enter(new_index, v_object2, id2);
                    }
                }
                finally {
                    Hashtables.releaseEntrySetIterator(cdohash_iterator);
                }
            }
        }
        return new_index;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-compare.lisp", position = 15293L)
    public static SubLObject kb_difference_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        print_kb_difference(v_object, stream, (SubLObject)kb_compare.ZERO_INTEGER);
        return (SubLObject)kb_compare.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-compare.lisp", position = 15293L)
    public static SubLObject kb_difference_p(final SubLObject v_object) {
        return (SubLObject)((v_object.getClass() == $kb_difference_native.class) ? kb_compare.T : kb_compare.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-compare.lisp", position = 15293L)
    public static SubLObject kb_diff_common_intersection(final SubLObject v_object) {
        assert kb_compare.NIL != kb_difference_p(v_object) : v_object;
        return v_object.getField2();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-compare.lisp", position = 15293L)
    public static SubLObject kb_diff_renamed_constants(final SubLObject v_object) {
        assert kb_compare.NIL != kb_difference_p(v_object) : v_object;
        return v_object.getField3();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-compare.lisp", position = 15293L)
    public static SubLObject kb_diff_constants(final SubLObject v_object) {
        assert kb_compare.NIL != kb_difference_p(v_object) : v_object;
        return v_object.getField4();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-compare.lisp", position = 15293L)
    public static SubLObject kb_diff_narts(final SubLObject v_object) {
        assert kb_compare.NIL != kb_difference_p(v_object) : v_object;
        return v_object.getField5();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-compare.lisp", position = 15293L)
    public static SubLObject kb_diff_assertions(final SubLObject v_object) {
        assert kb_compare.NIL != kb_difference_p(v_object) : v_object;
        return v_object.getField6();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-compare.lisp", position = 15293L)
    public static SubLObject kb_diff_deductions(final SubLObject v_object) {
        assert kb_compare.NIL != kb_difference_p(v_object) : v_object;
        return v_object.getField7();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-compare.lisp", position = 15293L)
    public static SubLObject _csetf_kb_diff_common_intersection(final SubLObject v_object, final SubLObject value) {
        assert kb_compare.NIL != kb_difference_p(v_object) : v_object;
        return v_object.setField2(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-compare.lisp", position = 15293L)
    public static SubLObject _csetf_kb_diff_renamed_constants(final SubLObject v_object, final SubLObject value) {
        assert kb_compare.NIL != kb_difference_p(v_object) : v_object;
        return v_object.setField3(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-compare.lisp", position = 15293L)
    public static SubLObject _csetf_kb_diff_constants(final SubLObject v_object, final SubLObject value) {
        assert kb_compare.NIL != kb_difference_p(v_object) : v_object;
        return v_object.setField4(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-compare.lisp", position = 15293L)
    public static SubLObject _csetf_kb_diff_narts(final SubLObject v_object, final SubLObject value) {
        assert kb_compare.NIL != kb_difference_p(v_object) : v_object;
        return v_object.setField5(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-compare.lisp", position = 15293L)
    public static SubLObject _csetf_kb_diff_assertions(final SubLObject v_object, final SubLObject value) {
        assert kb_compare.NIL != kb_difference_p(v_object) : v_object;
        return v_object.setField6(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-compare.lisp", position = 15293L)
    public static SubLObject _csetf_kb_diff_deductions(final SubLObject v_object, final SubLObject value) {
        assert kb_compare.NIL != kb_difference_p(v_object) : v_object;
        return v_object.setField7(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-compare.lisp", position = 15293L)
    public static SubLObject make_kb_difference(SubLObject arglist) {
        if (arglist == kb_compare.UNPROVIDED) {
            arglist = (SubLObject)kb_compare.NIL;
        }
        final SubLObject v_new = (SubLObject)new $kb_difference_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = (SubLObject)kb_compare.NIL, next = arglist; kb_compare.NIL != next; next = conses_high.cddr(next)) {
            current_arg = next.first();
            current_value = conses_high.cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql((SubLObject)kb_compare.$kw109$COMMON_INTERSECTION)) {
                _csetf_kb_diff_common_intersection(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)kb_compare.$kw110$RENAMED_CONSTANTS)) {
                _csetf_kb_diff_renamed_constants(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)kb_compare.$kw73$CONSTANTS)) {
                _csetf_kb_diff_constants(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)kb_compare.$kw75$NARTS)) {
                _csetf_kb_diff_narts(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)kb_compare.$kw77$ASSERTIONS)) {
                _csetf_kb_diff_assertions(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)kb_compare.$kw79$DEDUCTIONS)) {
                _csetf_kb_diff_deductions(v_new, current_value);
            }
            else {
                Errors.error((SubLObject)kb_compare.$str42$Invalid_slot__S_for_construction_, current_arg);
            }
        }
        return v_new;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-compare.lisp", position = 15293L)
    public static SubLObject visit_defstruct_kb_difference(final SubLObject obj, final SubLObject visitor_fn) {
        Functions.funcall(visitor_fn, obj, (SubLObject)kb_compare.$kw43$BEGIN, (SubLObject)kb_compare.$sym111$MAKE_KB_DIFFERENCE, (SubLObject)kb_compare.SIX_INTEGER);
        Functions.funcall(visitor_fn, obj, (SubLObject)kb_compare.$kw45$SLOT, (SubLObject)kb_compare.$kw109$COMMON_INTERSECTION, kb_diff_common_intersection(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)kb_compare.$kw45$SLOT, (SubLObject)kb_compare.$kw110$RENAMED_CONSTANTS, kb_diff_renamed_constants(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)kb_compare.$kw45$SLOT, (SubLObject)kb_compare.$kw73$CONSTANTS, kb_diff_constants(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)kb_compare.$kw45$SLOT, (SubLObject)kb_compare.$kw75$NARTS, kb_diff_narts(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)kb_compare.$kw45$SLOT, (SubLObject)kb_compare.$kw77$ASSERTIONS, kb_diff_assertions(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)kb_compare.$kw45$SLOT, (SubLObject)kb_compare.$kw79$DEDUCTIONS, kb_diff_deductions(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)kb_compare.$kw46$END, (SubLObject)kb_compare.$sym111$MAKE_KB_DIFFERENCE, (SubLObject)kb_compare.SIX_INTEGER);
        return obj;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-compare.lisp", position = 15293L)
    public static SubLObject visit_defstruct_object_kb_difference_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_kb_difference(obj, visitor_fn);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-compare.lisp", position = 16105L)
    public static SubLObject print_kb_difference(final SubLObject v_object, final SubLObject stream, final SubLObject depth) {
        PrintLow.format(stream, (SubLObject)kb_compare.$str113$_KB_DIFFERENCE_using__a_, kb_difference_common_intersection(v_object));
        return (SubLObject)kb_compare.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-compare.lisp", position = 16285L)
    public static SubLObject new_kb_difference(final SubLObject intersection) {
        final SubLObject difference = make_kb_difference((SubLObject)kb_compare.UNPROVIDED);
        _csetf_kb_diff_common_intersection(difference, intersection);
        _csetf_kb_diff_renamed_constants(difference, dictionary.new_dictionary(Symbols.symbol_function((SubLObject)kb_compare.EQL), (SubLObject)kb_compare.UNPROVIDED));
        _csetf_kb_diff_constants(difference, set.new_set(Symbols.symbol_function((SubLObject)kb_compare.EQL), (SubLObject)kb_compare.UNPROVIDED));
        _csetf_kb_diff_narts(difference, set.new_set(Symbols.symbol_function((SubLObject)kb_compare.EQL), (SubLObject)kb_compare.UNPROVIDED));
        _csetf_kb_diff_assertions(difference, set.new_set(Symbols.symbol_function((SubLObject)kb_compare.EQL), (SubLObject)kb_compare.UNPROVIDED));
        _csetf_kb_diff_deductions(difference, set.new_set(Symbols.symbol_function((SubLObject)kb_compare.EQL), (SubLObject)kb_compare.UNPROVIDED));
        return difference;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-compare.lisp", position = 16797L)
    public static SubLObject destroy_kb_difference(final SubLObject difference) {
        dictionary.clear_dictionary(kb_diff_renamed_constants(difference));
        set.clear_set(kb_diff_constants(difference));
        set.clear_set(kb_diff_narts(difference));
        set.clear_set(kb_diff_assertions(difference));
        set.clear_set(kb_diff_deductions(difference));
        _csetf_kb_diff_common_intersection(difference, (SubLObject)kb_compare.$kw49$FREE);
        _csetf_kb_diff_renamed_constants(difference, (SubLObject)kb_compare.NIL);
        _csetf_kb_diff_constants(difference, (SubLObject)kb_compare.NIL);
        _csetf_kb_diff_narts(difference, (SubLObject)kb_compare.NIL);
        _csetf_kb_diff_assertions(difference, (SubLObject)kb_compare.NIL);
        _csetf_kb_diff_deductions(difference, (SubLObject)kb_compare.NIL);
        return difference;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-compare.lisp", position = 17487L)
    public static SubLObject kb_difference_common_intersection(final SubLObject difference) {
        return kb_diff_common_intersection(difference);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-compare.lisp", position = 17612L)
    public static SubLObject kb_difference_renamed_constants(final SubLObject difference) {
        return kb_diff_renamed_constants(difference);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-compare.lisp", position = 17773L)
    public static SubLObject kb_difference_constants(final SubLObject difference) {
        return kb_diff_constants(difference);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-compare.lisp", position = 17910L)
    public static SubLObject kb_difference_narts(final SubLObject difference) {
        return kb_diff_narts(difference);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-compare.lisp", position = 18035L)
    public static SubLObject kb_difference_assertions(final SubLObject difference) {
        return kb_diff_assertions(difference);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-compare.lisp", position = 18175L)
    public static SubLObject kb_difference_deductions(final SubLObject difference) {
        return kb_diff_deductions(difference);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-compare.lisp", position = 18315L)
    public static SubLObject do_kb_difference_renamed_constants(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)kb_compare.$list124);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject constant = (SubLObject)kb_compare.NIL;
        SubLObject remote_name = (SubLObject)kb_compare.NIL;
        SubLObject difference = (SubLObject)kb_compare.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)kb_compare.$list124);
        constant = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)kb_compare.$list124);
        remote_name = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)kb_compare.$list124);
        difference = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = (SubLObject)kb_compare.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)kb_compare.NIL;
        SubLObject current_$4 = (SubLObject)kb_compare.NIL;
        while (kb_compare.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)kb_compare.$list124);
            current_$4 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)kb_compare.$list124);
            if (kb_compare.NIL == conses_high.member(current_$4, (SubLObject)kb_compare.$list125, (SubLObject)kb_compare.UNPROVIDED, (SubLObject)kb_compare.UNPROVIDED)) {
                bad = (SubLObject)kb_compare.T;
            }
            if (current_$4 == kb_compare.$kw59$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (kb_compare.NIL != bad && kb_compare.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)kb_compare.$list124);
        }
        final SubLObject done_tail = cdestructuring_bind.property_list_member((SubLObject)kb_compare.$kw126$DONE, current);
        final SubLObject done = (SubLObject)((kb_compare.NIL != done_tail) ? conses_high.cadr(done_tail) : kb_compare.NIL);
        final SubLObject body;
        current = (body = temp);
        return (SubLObject)ConsesLow.listS((SubLObject)kb_compare.$sym127$DO_DICTIONARY, (SubLObject)ConsesLow.list(constant, remote_name, (SubLObject)ConsesLow.list((SubLObject)kb_compare.$sym114$KB_DIFFERENCE_RENAMED_CONSTANTS, difference), (SubLObject)kb_compare.$kw126$DONE, done), ConsesLow.append(body, (SubLObject)kb_compare.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-compare.lisp", position = 18558L)
    public static SubLObject do_kb_difference_constants(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)kb_compare.$list128);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject constant = (SubLObject)kb_compare.NIL;
        SubLObject difference = (SubLObject)kb_compare.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)kb_compare.$list128);
        constant = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)kb_compare.$list128);
        difference = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = (SubLObject)kb_compare.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)kb_compare.NIL;
        SubLObject current_$5 = (SubLObject)kb_compare.NIL;
        while (kb_compare.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)kb_compare.$list128);
            current_$5 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)kb_compare.$list128);
            if (kb_compare.NIL == conses_high.member(current_$5, (SubLObject)kb_compare.$list125, (SubLObject)kb_compare.UNPROVIDED, (SubLObject)kb_compare.UNPROVIDED)) {
                bad = (SubLObject)kb_compare.T;
            }
            if (current_$5 == kb_compare.$kw59$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (kb_compare.NIL != bad && kb_compare.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)kb_compare.$list128);
        }
        final SubLObject done_tail = cdestructuring_bind.property_list_member((SubLObject)kb_compare.$kw126$DONE, current);
        final SubLObject done = (SubLObject)((kb_compare.NIL != done_tail) ? conses_high.cadr(done_tail) : kb_compare.NIL);
        final SubLObject body;
        current = (body = temp);
        return (SubLObject)ConsesLow.listS((SubLObject)kb_compare.$sym129$DO_SET, (SubLObject)ConsesLow.list(constant, (SubLObject)ConsesLow.list((SubLObject)kb_compare.$sym116$KB_DIFFERENCE_CONSTANTS, difference), (SubLObject)kb_compare.$kw126$DONE, done), ConsesLow.append(body, (SubLObject)kb_compare.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-compare.lisp", position = 18739L)
    public static SubLObject do_kb_difference_narts(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)kb_compare.$list130);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject nart = (SubLObject)kb_compare.NIL;
        SubLObject difference = (SubLObject)kb_compare.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)kb_compare.$list130);
        nart = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)kb_compare.$list130);
        difference = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = (SubLObject)kb_compare.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)kb_compare.NIL;
        SubLObject current_$6 = (SubLObject)kb_compare.NIL;
        while (kb_compare.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)kb_compare.$list130);
            current_$6 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)kb_compare.$list130);
            if (kb_compare.NIL == conses_high.member(current_$6, (SubLObject)kb_compare.$list125, (SubLObject)kb_compare.UNPROVIDED, (SubLObject)kb_compare.UNPROVIDED)) {
                bad = (SubLObject)kb_compare.T;
            }
            if (current_$6 == kb_compare.$kw59$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (kb_compare.NIL != bad && kb_compare.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)kb_compare.$list130);
        }
        final SubLObject done_tail = cdestructuring_bind.property_list_member((SubLObject)kb_compare.$kw126$DONE, current);
        final SubLObject done = (SubLObject)((kb_compare.NIL != done_tail) ? conses_high.cadr(done_tail) : kb_compare.NIL);
        final SubLObject body;
        current = (body = temp);
        return (SubLObject)ConsesLow.listS((SubLObject)kb_compare.$sym129$DO_SET, (SubLObject)ConsesLow.list(nart, (SubLObject)ConsesLow.list((SubLObject)kb_compare.$sym118$KB_DIFFERENCE_NARTS, difference), (SubLObject)kb_compare.$kw126$DONE, done), ConsesLow.append(body, (SubLObject)kb_compare.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-compare.lisp", position = 18904L)
    public static SubLObject do_kb_difference_assertions(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)kb_compare.$list131);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject assertion = (SubLObject)kb_compare.NIL;
        SubLObject difference = (SubLObject)kb_compare.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)kb_compare.$list131);
        assertion = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)kb_compare.$list131);
        difference = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = (SubLObject)kb_compare.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)kb_compare.NIL;
        SubLObject current_$7 = (SubLObject)kb_compare.NIL;
        while (kb_compare.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)kb_compare.$list131);
            current_$7 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)kb_compare.$list131);
            if (kb_compare.NIL == conses_high.member(current_$7, (SubLObject)kb_compare.$list125, (SubLObject)kb_compare.UNPROVIDED, (SubLObject)kb_compare.UNPROVIDED)) {
                bad = (SubLObject)kb_compare.T;
            }
            if (current_$7 == kb_compare.$kw59$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (kb_compare.NIL != bad && kb_compare.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)kb_compare.$list131);
        }
        final SubLObject done_tail = cdestructuring_bind.property_list_member((SubLObject)kb_compare.$kw126$DONE, current);
        final SubLObject done = (SubLObject)((kb_compare.NIL != done_tail) ? conses_high.cadr(done_tail) : kb_compare.NIL);
        final SubLObject body;
        current = (body = temp);
        return (SubLObject)ConsesLow.listS((SubLObject)kb_compare.$sym129$DO_SET, (SubLObject)ConsesLow.list(assertion, (SubLObject)ConsesLow.list((SubLObject)kb_compare.$sym120$KB_DIFFERENCE_ASSERTIONS, difference), (SubLObject)kb_compare.$kw126$DONE, done), ConsesLow.append(body, (SubLObject)kb_compare.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-compare.lisp", position = 19089L)
    public static SubLObject do_kb_difference_deductions(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)kb_compare.$list132);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject deduction = (SubLObject)kb_compare.NIL;
        SubLObject difference = (SubLObject)kb_compare.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)kb_compare.$list132);
        deduction = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)kb_compare.$list132);
        difference = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = (SubLObject)kb_compare.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)kb_compare.NIL;
        SubLObject current_$8 = (SubLObject)kb_compare.NIL;
        while (kb_compare.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)kb_compare.$list132);
            current_$8 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)kb_compare.$list132);
            if (kb_compare.NIL == conses_high.member(current_$8, (SubLObject)kb_compare.$list125, (SubLObject)kb_compare.UNPROVIDED, (SubLObject)kb_compare.UNPROVIDED)) {
                bad = (SubLObject)kb_compare.T;
            }
            if (current_$8 == kb_compare.$kw59$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (kb_compare.NIL != bad && kb_compare.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)kb_compare.$list132);
        }
        final SubLObject done_tail = cdestructuring_bind.property_list_member((SubLObject)kb_compare.$kw126$DONE, current);
        final SubLObject done = (SubLObject)((kb_compare.NIL != done_tail) ? conses_high.cadr(done_tail) : kb_compare.NIL);
        final SubLObject body;
        current = (body = temp);
        return (SubLObject)ConsesLow.listS((SubLObject)kb_compare.$sym129$DO_SET, (SubLObject)ConsesLow.list(deduction, (SubLObject)ConsesLow.list((SubLObject)kb_compare.$sym122$KB_DIFFERENCE_DEDUCTIONS, difference), (SubLObject)kb_compare.$kw126$DONE, done), ConsesLow.append(body, (SubLObject)kb_compare.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-compare.lisp", position = 19274L)
    public static SubLObject kb_difference_add_renamed_constant(final SubLObject difference, final SubLObject constant, final SubLObject remote_name) {
        assert kb_compare.NIL != constant_handles.constant_p(constant) : constant;
        assert kb_compare.NIL != Types.stringp(remote_name) : remote_name;
        dictionary.dictionary_enter(kb_diff_renamed_constants(difference), constant, remote_name);
        return difference;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-compare.lisp", position = 19555L)
    public static SubLObject kb_difference_add_constant(final SubLObject difference, final SubLObject constant) {
        assert kb_compare.NIL != constant_handles.constant_p(constant) : constant;
        set.set_add(constant, kb_diff_constants(difference));
        return difference;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-compare.lisp", position = 19728L)
    public static SubLObject kb_difference_add_nart(final SubLObject difference, final SubLObject nart) {
        assert kb_compare.NIL != nart_handles.nart_p(nart) : nart;
        set.set_add(nart, kb_diff_narts(difference));
        return difference;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-compare.lisp", position = 19877L)
    public static SubLObject kb_difference_add_assertion(final SubLObject difference, final SubLObject assertion) {
        assert kb_compare.NIL != assertion_handles.assertion_p(assertion) : assertion;
        set.set_add(assertion, kb_diff_assertions(difference));
        return difference;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-compare.lisp", position = 20056L)
    public static SubLObject kb_difference_add_deduction(final SubLObject difference, final SubLObject deduction) {
        assert kb_compare.NIL != deduction_handles.deduction_p(deduction) : deduction;
        set.set_add(deduction, kb_diff_deductions(difference));
        return difference;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-compare.lisp", position = 20235L)
    public static SubLObject kb_difference_remote_image(final SubLObject difference) {
        return kb_intersection_remote_image(kb_difference_common_intersection(difference));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-compare.lisp", position = 20392L)
    public static SubLObject kb_difference_remote_image_machine(final SubLObject difference) {
        return kb_intersection_remote_image_machine(kb_difference_common_intersection(difference));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-compare.lisp", position = 20551L)
    public static SubLObject kb_difference_remote_image_port(final SubLObject difference) {
        return kb_intersection_remote_image_port(kb_difference_common_intersection(difference));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-compare.lisp", position = 20704L)
    public static SubLObject kb_difference_remote_image_protocol(final SubLObject difference) {
        return kb_intersection_remote_image_protocol(kb_difference_common_intersection(difference));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-compare.lisp", position = 20865L)
    public static SubLObject kb_difference_constant_remote_name(final SubLObject difference, final SubLObject constant) {
        return dictionary.dictionary_lookup(kb_diff_renamed_constants(difference), constant, constants_high.constant_name(constant));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-compare.lisp", position = 21042L)
    public static SubLObject kb_difference_all_renamed_constants(final SubLObject difference) {
        return Sort.sort(dictionary.dictionary_keys(kb_diff_renamed_constants(difference)), Symbols.symbol_function((SubLObject)kb_compare.$sym134$_), (SubLObject)kb_compare.$sym135$CONSTANT_INTERNAL_ID);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-compare.lisp", position = 21206L)
    public static SubLObject kb_difference_all_constants(final SubLObject difference) {
        return Sort.sort(set.set_element_list(kb_diff_constants(difference)), Symbols.symbol_function((SubLObject)kb_compare.$sym134$_), (SubLObject)kb_compare.$sym135$CONSTANT_INTERNAL_ID);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-compare.lisp", position = 21355L)
    public static SubLObject kb_difference_all_narts(final SubLObject difference) {
        return Sort.sort(set.set_element_list(kb_diff_narts(difference)), Symbols.symbol_function((SubLObject)kb_compare.$sym134$_), (SubLObject)kb_compare.$sym136$NART_ID);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-compare.lisp", position = 21483L)
    public static SubLObject kb_difference_all_assertions(final SubLObject difference) {
        return assertion_utilities.sort_assertions(set.set_element_list(kb_diff_assertions(difference)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-compare.lisp", position = 21619L)
    public static SubLObject kb_difference_all_deductions(final SubLObject difference) {
        return Sort.sort(set.set_element_list(kb_diff_deductions(difference)), Symbols.symbol_function((SubLObject)kb_compare.$sym134$_), (SubLObject)kb_compare.$sym137$DEDUCTION_ID);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-compare.lisp", position = 21762L)
    public static SubLObject kb_intersection_compute(final SubLObject intersection) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert kb_compare.NIL != kb_intersection_p(intersection) : intersection;
        final SubLObject v_remote_image = kb_intersection_remote_image(intersection);
        final SubLObject connection = remote_image.new_remote_image_connection(v_remote_image);
        try {
            remote_image.open_remote_image_connection(connection);
            final SubLObject _prev_bind_0 = remote_image.$current_remote_image_connection$.currentBinding(thread);
            final SubLObject _prev_bind_2 = kb_compare.$kb_compare_common_symbols$.currentBinding(thread);
            try {
                remote_image.$current_remote_image_connection$.bind(connection, thread);
                kb_compare.$kb_compare_common_symbols$.bind(kb_compare.$kb_compare_common_symbols$.getDynamicValue(thread), thread);
                set_kb_compare_connection_common_symbols();
                final SubLObject _prev_bind_0_$9 = cfasl.$cfasl_common_symbols$.currentBinding(thread);
                try {
                    cfasl.$cfasl_common_symbols$.bind((SubLObject)kb_compare.NIL, thread);
                    cfasl.cfasl_set_common_symbols(kb_compare.$kb_compare_common_symbols$.getDynamicValue(thread));
                    kb_intersection_compute_constants(intersection);
                    kb_intersection_compute_narts(intersection);
                    kb_intersection_compute_assertions(intersection);
                    kb_intersection_compute_deductions(intersection);
                }
                finally {
                    cfasl.$cfasl_common_symbols$.rebind(_prev_bind_0_$9, thread);
                }
            }
            finally {
                kb_compare.$kb_compare_common_symbols$.rebind(_prev_bind_2, thread);
                remote_image.$current_remote_image_connection$.rebind(_prev_bind_0, thread);
            }
        }
        finally {
            final SubLObject _prev_bind_3 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)kb_compare.T, thread);
                final SubLObject _values = Values.getValuesAsVector();
                remote_image.close_remote_image_connection(connection);
                Values.restoreValuesFromVector(_values);
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_3, thread);
            }
        }
        return intersection;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-compare.lisp", position = 22325L)
    public static SubLObject kb_intersection_compute_constants(final SubLObject intersection) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (kb_compare.NIL != compute_remote_image_old_constants_congruentP()) {
            kb_intersection_compute_congruent_old_constants(intersection);
            final SubLObject start = constant_handles.new_constant_suid_threshold();
            final SubLObject table_var = constant_handles.do_constants_table();
            final SubLObject total = Numbers.subtract(id_index.id_index_next_id(table_var), start);
            SubLObject sofar = (SubLObject)kb_compare.ZERO_INTEGER;
            final SubLObject _prev_bind_0 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
            final SubLObject _prev_bind_2 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
            final SubLObject _prev_bind_3 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
            final SubLObject _prev_bind_4 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
            try {
                utilities_macros.$last_percent_progress_index$.bind((SubLObject)kb_compare.ZERO_INTEGER, thread);
                utilities_macros.$last_percent_progress_prediction$.bind((SubLObject)kb_compare.NIL, thread);
                utilities_macros.$within_noting_percent_progress$.bind((SubLObject)kb_compare.T, thread);
                utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
                try {
                    utilities_macros.noting_percent_progress_preamble((SubLObject)kb_compare.$str138$KB_Intersection___Examining_new_c);
                    SubLObject end_var;
                    SubLObject end;
                    SubLObject id;
                    SubLObject constant;
                    for (end = (end_var = id_index.id_index_next_id(table_var)), id = (SubLObject)kb_compare.NIL, id = start; !id.numGE(end_var); id = number_utilities.f_1X(id)) {
                        constant = id_index.id_index_lookup(table_var, id, (SubLObject)kb_compare.UNPROVIDED);
                        if (kb_compare.NIL != constant) {
                            utilities_macros.note_percent_progress(sofar, total);
                            sofar = Numbers.add(sofar, (SubLObject)kb_compare.ONE_INTEGER);
                            kb_intersection_compute_constant(intersection, constant);
                        }
                    }
                }
                finally {
                    final SubLObject _prev_bind_0_$10 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)kb_compare.T, thread);
                        final SubLObject _values = Values.getValuesAsVector();
                        utilities_macros.noting_percent_progress_postamble();
                        Values.restoreValuesFromVector(_values);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$10, thread);
                    }
                }
            }
            finally {
                utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_4, thread);
                utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_3, thread);
                utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_2, thread);
                utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_0, thread);
            }
        }
        else {
            final SubLObject idx = constant_handles.do_constants_table();
            final SubLObject mess = (SubLObject)kb_compare.$str139$KB_Intersection___Examining_const;
            final SubLObject total = id_index.id_index_count(idx);
            SubLObject sofar = (SubLObject)kb_compare.ZERO_INTEGER;
            assert kb_compare.NIL != Types.stringp(mess) : mess;
            final SubLObject _prev_bind_0 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
            final SubLObject _prev_bind_2 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
            final SubLObject _prev_bind_3 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
            final SubLObject _prev_bind_4 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
            try {
                utilities_macros.$last_percent_progress_index$.bind((SubLObject)kb_compare.ZERO_INTEGER, thread);
                utilities_macros.$last_percent_progress_prediction$.bind((SubLObject)kb_compare.NIL, thread);
                utilities_macros.$within_noting_percent_progress$.bind((SubLObject)kb_compare.T, thread);
                utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
                try {
                    utilities_macros.noting_percent_progress_preamble(mess);
                    final SubLObject idx_$11 = idx;
                    if (kb_compare.NIL == id_index.id_index_objects_empty_p(idx_$11, (SubLObject)kb_compare.$kw86$SKIP)) {
                        final SubLObject idx_$12 = idx_$11;
                        if (kb_compare.NIL == id_index.id_index_dense_objects_empty_p(idx_$12, (SubLObject)kb_compare.$kw86$SKIP)) {
                            final SubLObject vector_var = id_index.id_index_dense_objects(idx_$12);
                            final SubLObject backwardP_var = (SubLObject)kb_compare.NIL;
                            SubLObject length;
                            SubLObject v_iteration;
                            SubLObject id2;
                            SubLObject constant2;
                            for (length = Sequences.length(vector_var), v_iteration = (SubLObject)kb_compare.NIL, v_iteration = (SubLObject)kb_compare.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)kb_compare.ONE_INTEGER)) {
                                id2 = ((kb_compare.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)kb_compare.ONE_INTEGER) : v_iteration);
                                constant2 = Vectors.aref(vector_var, id2);
                                if (kb_compare.NIL == id_index.id_index_tombstone_p(constant2) || kb_compare.NIL == id_index.id_index_skip_tombstones_p((SubLObject)kb_compare.$kw86$SKIP)) {
                                    if (kb_compare.NIL != id_index.id_index_tombstone_p(constant2)) {
                                        constant2 = (SubLObject)kb_compare.$kw86$SKIP;
                                    }
                                    kb_intersection_compute_constant(intersection, constant2);
                                    sofar = Numbers.add(sofar, (SubLObject)kb_compare.ONE_INTEGER);
                                    utilities_macros.note_percent_progress(sofar, total);
                                }
                            }
                        }
                        final SubLObject idx_$13 = idx_$11;
                        if (kb_compare.NIL == id_index.id_index_sparse_objects_empty_p(idx_$13) || kb_compare.NIL == id_index.id_index_skip_tombstones_p((SubLObject)kb_compare.$kw86$SKIP)) {
                            final SubLObject sparse = id_index.id_index_sparse_objects(idx_$13);
                            SubLObject id3 = id_index.id_index_sparse_id_threshold(idx_$13);
                            final SubLObject end_id = id_index.id_index_next_id(idx_$13);
                            final SubLObject v_default = (SubLObject)((kb_compare.NIL != id_index.id_index_skip_tombstones_p((SubLObject)kb_compare.$kw86$SKIP)) ? kb_compare.NIL : kb_compare.$kw86$SKIP);
                            while (id3.numL(end_id)) {
                                final SubLObject constant3 = Hashtables.gethash_without_values(id3, sparse, v_default);
                                if (kb_compare.NIL == id_index.id_index_skip_tombstones_p((SubLObject)kb_compare.$kw86$SKIP) || kb_compare.NIL == id_index.id_index_tombstone_p(constant3)) {
                                    kb_intersection_compute_constant(intersection, constant3);
                                    sofar = Numbers.add(sofar, (SubLObject)kb_compare.ONE_INTEGER);
                                    utilities_macros.note_percent_progress(sofar, total);
                                }
                                id3 = Numbers.add(id3, (SubLObject)kb_compare.ONE_INTEGER);
                            }
                        }
                    }
                }
                finally {
                    final SubLObject _prev_bind_0_$11 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)kb_compare.T, thread);
                        final SubLObject _values2 = Values.getValuesAsVector();
                        utilities_macros.noting_percent_progress_postamble();
                        Values.restoreValuesFromVector(_values2);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$11, thread);
                    }
                }
            }
            finally {
                utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_4, thread);
                utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_3, thread);
                utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_2, thread);
                utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_0, thread);
            }
        }
        return intersection;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-compare.lisp", position = 22856L)
    public static SubLObject kb_intersection_compute_congruent_old_constants(final SubLObject intersection) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject missing_remote_ids = compute_missing_old_constant_remote_ids();
        final SubLObject missing_set = set_utilities.construct_set_from_list(missing_remote_ids, Symbols.symbol_function((SubLObject)kb_compare.EQL), (SubLObject)kb_compare.UNPROVIDED);
        final SubLObject threshold = constant_handles.new_constant_suid_threshold();
        final SubLObject past_ids = (SubLObject)kb_compare.NIL;
        SubLObject my_done = (SubLObject)kb_compare.NIL;
        final SubLObject idx = constant_handles.do_constants_table();
        final SubLObject mess = (SubLObject)kb_compare.$str140$KB_Intersection___Examining_old_c;
        final SubLObject total = id_index.id_index_count(idx);
        SubLObject sofar = (SubLObject)kb_compare.ZERO_INTEGER;
        assert kb_compare.NIL != Types.stringp(mess) : mess;
        final SubLObject _prev_bind_0 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
        final SubLObject _prev_bind_2 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
        final SubLObject _prev_bind_3 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
        final SubLObject _prev_bind_4 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
        try {
            utilities_macros.$last_percent_progress_index$.bind((SubLObject)kb_compare.ZERO_INTEGER, thread);
            utilities_macros.$last_percent_progress_prediction$.bind((SubLObject)kb_compare.NIL, thread);
            utilities_macros.$within_noting_percent_progress$.bind((SubLObject)kb_compare.T, thread);
            utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
            try {
                utilities_macros.noting_percent_progress_preamble(mess);
                final SubLObject idx_$15 = idx;
                if (kb_compare.NIL == id_index.id_index_objects_empty_p(idx_$15, (SubLObject)kb_compare.$kw86$SKIP)) {
                    final SubLObject idx_$16 = idx_$15;
                    if (kb_compare.NIL == id_index.id_index_dense_objects_empty_p(idx_$16, (SubLObject)kb_compare.$kw86$SKIP)) {
                        final SubLObject vector_var = id_index.id_index_dense_objects(idx_$16);
                        final SubLObject backwardP_var = (SubLObject)kb_compare.NIL;
                        final SubLObject length = Sequences.length(vector_var);
                        SubLObject current;
                        final SubLObject datum = current = (SubLObject)((kb_compare.NIL != backwardP_var) ? ConsesLow.list(Numbers.subtract(length, (SubLObject)kb_compare.ONE_INTEGER), (SubLObject)kb_compare.MINUS_ONE_INTEGER, (SubLObject)kb_compare.MINUS_ONE_INTEGER) : ConsesLow.list((SubLObject)kb_compare.ZERO_INTEGER, length, (SubLObject)kb_compare.ONE_INTEGER));
                        SubLObject start = (SubLObject)kb_compare.NIL;
                        SubLObject end = (SubLObject)kb_compare.NIL;
                        SubLObject delta = (SubLObject)kb_compare.NIL;
                        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)kb_compare.$list141);
                        start = current.first();
                        current = current.rest();
                        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)kb_compare.$list141);
                        end = current.first();
                        current = current.rest();
                        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)kb_compare.$list141);
                        delta = current.first();
                        current = current.rest();
                        if (kb_compare.NIL == current) {
                            if (kb_compare.NIL == my_done) {
                                SubLObject end_var;
                                SubLObject id;
                                SubLObject constant;
                                SubLObject past_ids_$17;
                                SubLObject remote_id;
                                for (end_var = end, id = (SubLObject)kb_compare.NIL, id = start; kb_compare.NIL == my_done && kb_compare.NIL == subl_macros.do_numbers_endtest(id, delta, end_var); id = Numbers.add(id, delta)) {
                                    constant = Vectors.aref(vector_var, id);
                                    if (kb_compare.NIL == id_index.id_index_tombstone_p(constant) || kb_compare.NIL == id_index.id_index_skip_tombstones_p((SubLObject)kb_compare.$kw86$SKIP)) {
                                        if (kb_compare.NIL != id_index.id_index_tombstone_p(constant)) {
                                            constant = (SubLObject)kb_compare.$kw86$SKIP;
                                        }
                                        past_ids_$17 = Numbers.numL(threshold, id);
                                        if (kb_compare.NIL == past_ids_$17) {
                                            remote_id = constants_high.constant_internal_id(constant);
                                            if (kb_compare.NIL == set.set_memberP(remote_id, missing_set)) {
                                                kb_intersection_add_constant(intersection, constant, remote_id);
                                            }
                                        }
                                        my_done = past_ids_$17;
                                        sofar = Numbers.add(sofar, (SubLObject)kb_compare.ONE_INTEGER);
                                        utilities_macros.note_percent_progress(sofar, total);
                                    }
                                }
                            }
                        }
                        else {
                            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)kb_compare.$list141);
                        }
                    }
                    final SubLObject idx_$17 = idx_$15;
                    if (kb_compare.NIL == id_index.id_index_sparse_objects_empty_p(idx_$17) || kb_compare.NIL == id_index.id_index_skip_tombstones_p((SubLObject)kb_compare.$kw86$SKIP)) {
                        final SubLObject sparse = id_index.id_index_sparse_objects(idx_$17);
                        SubLObject id2 = id_index.id_index_sparse_id_threshold(idx_$17);
                        final SubLObject end_id = id_index.id_index_next_id(idx_$17);
                        final SubLObject v_default = (SubLObject)((kb_compare.NIL != id_index.id_index_skip_tombstones_p((SubLObject)kb_compare.$kw86$SKIP)) ? kb_compare.NIL : kb_compare.$kw86$SKIP);
                        while (id2.numL(end_id) && kb_compare.NIL == my_done) {
                            final SubLObject constant2 = Hashtables.gethash_without_values(id2, sparse, v_default);
                            if (kb_compare.NIL == id_index.id_index_skip_tombstones_p((SubLObject)kb_compare.$kw86$SKIP) || kb_compare.NIL == id_index.id_index_tombstone_p(constant2)) {
                                final SubLObject past_ids_$18 = Numbers.numL(threshold, id2);
                                if (kb_compare.NIL == past_ids_$18) {
                                    final SubLObject remote_id2 = constants_high.constant_internal_id(constant2);
                                    if (kb_compare.NIL == set.set_memberP(remote_id2, missing_set)) {
                                        kb_intersection_add_constant(intersection, constant2, remote_id2);
                                    }
                                }
                                my_done = past_ids_$18;
                                sofar = Numbers.add(sofar, (SubLObject)kb_compare.ONE_INTEGER);
                                utilities_macros.note_percent_progress(sofar, total);
                            }
                            id2 = Numbers.add(id2, (SubLObject)kb_compare.ONE_INTEGER);
                        }
                    }
                }
            }
            finally {
                final SubLObject _prev_bind_0_$20 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)kb_compare.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    utilities_macros.noting_percent_progress_postamble();
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$20, thread);
                }
            }
        }
        finally {
            utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_4, thread);
            utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_3, thread);
            utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_2, thread);
            utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)kb_compare.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-compare.lisp", position = 23430L)
    public static SubLObject kb_intersection_compute_constant(final SubLObject intersection, final SubLObject constant) {
        final SubLObject remote_id = compute_constant_remote_id(constant);
        if (kb_compare.NIL != remote_id) {
            kb_intersection_add_constant(intersection, constant, remote_id);
        }
        return (SubLObject)kb_compare.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-compare.lisp", position = 23663L)
    public static SubLObject kb_intersection_compute_narts(final SubLObject intersection) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (kb_compare.NIL != compute_remote_image_old_narts_congruentP()) {
            kb_intersection_compute_congruent_old_narts(intersection);
            final SubLObject start = nart_handles.new_nart_id_threshold();
            final SubLObject table_var = nart_handles.do_narts_table();
            final SubLObject total = Numbers.subtract(id_index.id_index_next_id(table_var), start);
            SubLObject sofar = (SubLObject)kb_compare.ZERO_INTEGER;
            final SubLObject _prev_bind_0 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
            final SubLObject _prev_bind_2 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
            final SubLObject _prev_bind_3 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
            final SubLObject _prev_bind_4 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
            try {
                utilities_macros.$last_percent_progress_index$.bind((SubLObject)kb_compare.ZERO_INTEGER, thread);
                utilities_macros.$last_percent_progress_prediction$.bind((SubLObject)kb_compare.NIL, thread);
                utilities_macros.$within_noting_percent_progress$.bind((SubLObject)kb_compare.T, thread);
                utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
                try {
                    utilities_macros.noting_percent_progress_preamble((SubLObject)kb_compare.$str142$KB_Intersection___Examining_new_n);
                    SubLObject end_var;
                    SubLObject end;
                    SubLObject id;
                    SubLObject nart;
                    for (end = (end_var = id_index.id_index_next_id(table_var)), id = (SubLObject)kb_compare.NIL, id = start; !id.numGE(end_var); id = number_utilities.f_1X(id)) {
                        nart = id_index.id_index_lookup(table_var, id, (SubLObject)kb_compare.UNPROVIDED);
                        if (kb_compare.NIL != nart) {
                            utilities_macros.note_percent_progress(sofar, total);
                            sofar = Numbers.add(sofar, (SubLObject)kb_compare.ONE_INTEGER);
                            kb_intersection_compute_nart(intersection, nart);
                        }
                    }
                }
                finally {
                    final SubLObject _prev_bind_0_$21 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)kb_compare.T, thread);
                        final SubLObject _values = Values.getValuesAsVector();
                        utilities_macros.noting_percent_progress_postamble();
                        Values.restoreValuesFromVector(_values);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$21, thread);
                    }
                }
            }
            finally {
                utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_4, thread);
                utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_3, thread);
                utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_2, thread);
                utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_0, thread);
            }
        }
        else {
            final SubLObject idx = nart_handles.do_narts_table();
            final SubLObject mess = (SubLObject)kb_compare.$str143$KB_Intersection___Examining_narts;
            final SubLObject total = id_index.id_index_count(idx);
            SubLObject sofar = (SubLObject)kb_compare.ZERO_INTEGER;
            assert kb_compare.NIL != Types.stringp(mess) : mess;
            final SubLObject _prev_bind_0 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
            final SubLObject _prev_bind_2 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
            final SubLObject _prev_bind_3 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
            final SubLObject _prev_bind_4 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
            try {
                utilities_macros.$last_percent_progress_index$.bind((SubLObject)kb_compare.ZERO_INTEGER, thread);
                utilities_macros.$last_percent_progress_prediction$.bind((SubLObject)kb_compare.NIL, thread);
                utilities_macros.$within_noting_percent_progress$.bind((SubLObject)kb_compare.T, thread);
                utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
                try {
                    utilities_macros.noting_percent_progress_preamble(mess);
                    final SubLObject idx_$22 = idx;
                    if (kb_compare.NIL == id_index.id_index_objects_empty_p(idx_$22, (SubLObject)kb_compare.$kw86$SKIP)) {
                        final SubLObject idx_$23 = idx_$22;
                        if (kb_compare.NIL == id_index.id_index_dense_objects_empty_p(idx_$23, (SubLObject)kb_compare.$kw86$SKIP)) {
                            final SubLObject vector_var = id_index.id_index_dense_objects(idx_$23);
                            final SubLObject backwardP_var = (SubLObject)kb_compare.NIL;
                            SubLObject length;
                            SubLObject v_iteration;
                            SubLObject id2;
                            SubLObject nart2;
                            for (length = Sequences.length(vector_var), v_iteration = (SubLObject)kb_compare.NIL, v_iteration = (SubLObject)kb_compare.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)kb_compare.ONE_INTEGER)) {
                                id2 = ((kb_compare.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)kb_compare.ONE_INTEGER) : v_iteration);
                                nart2 = Vectors.aref(vector_var, id2);
                                if (kb_compare.NIL == id_index.id_index_tombstone_p(nart2) || kb_compare.NIL == id_index.id_index_skip_tombstones_p((SubLObject)kb_compare.$kw86$SKIP)) {
                                    if (kb_compare.NIL != id_index.id_index_tombstone_p(nart2)) {
                                        nart2 = (SubLObject)kb_compare.$kw86$SKIP;
                                    }
                                    kb_intersection_compute_nart(intersection, nart2);
                                    sofar = Numbers.add(sofar, (SubLObject)kb_compare.ONE_INTEGER);
                                    utilities_macros.note_percent_progress(sofar, total);
                                }
                            }
                        }
                        final SubLObject idx_$24 = idx_$22;
                        if (kb_compare.NIL == id_index.id_index_sparse_objects_empty_p(idx_$24) || kb_compare.NIL == id_index.id_index_skip_tombstones_p((SubLObject)kb_compare.$kw86$SKIP)) {
                            final SubLObject sparse = id_index.id_index_sparse_objects(idx_$24);
                            SubLObject id3 = id_index.id_index_sparse_id_threshold(idx_$24);
                            final SubLObject end_id = id_index.id_index_next_id(idx_$24);
                            final SubLObject v_default = (SubLObject)((kb_compare.NIL != id_index.id_index_skip_tombstones_p((SubLObject)kb_compare.$kw86$SKIP)) ? kb_compare.NIL : kb_compare.$kw86$SKIP);
                            while (id3.numL(end_id)) {
                                final SubLObject nart3 = Hashtables.gethash_without_values(id3, sparse, v_default);
                                if (kb_compare.NIL == id_index.id_index_skip_tombstones_p((SubLObject)kb_compare.$kw86$SKIP) || kb_compare.NIL == id_index.id_index_tombstone_p(nart3)) {
                                    kb_intersection_compute_nart(intersection, nart3);
                                    sofar = Numbers.add(sofar, (SubLObject)kb_compare.ONE_INTEGER);
                                    utilities_macros.note_percent_progress(sofar, total);
                                }
                                id3 = Numbers.add(id3, (SubLObject)kb_compare.ONE_INTEGER);
                            }
                        }
                    }
                }
                finally {
                    final SubLObject _prev_bind_0_$22 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)kb_compare.T, thread);
                        final SubLObject _values2 = Values.getValuesAsVector();
                        utilities_macros.noting_percent_progress_postamble();
                        Values.restoreValuesFromVector(_values2);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$22, thread);
                    }
                }
            }
            finally {
                utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_4, thread);
                utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_3, thread);
                utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_2, thread);
                utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_0, thread);
            }
        }
        return intersection;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-compare.lisp", position = 24138L)
    public static SubLObject kb_intersection_compute_congruent_old_narts(final SubLObject intersection) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject missing_remote_ids = compute_missing_old_nart_remote_ids();
        final SubLObject missing_set = set_utilities.construct_set_from_list(missing_remote_ids, Symbols.symbol_function((SubLObject)kb_compare.EQL), (SubLObject)kb_compare.UNPROVIDED);
        final SubLObject threshold = nart_handles.new_nart_id_threshold();
        final SubLObject past_ids = (SubLObject)kb_compare.NIL;
        SubLObject my_done = (SubLObject)kb_compare.NIL;
        final SubLObject idx = nart_handles.do_narts_table();
        final SubLObject mess = (SubLObject)kb_compare.$str144$KB_Intersection___Examining_old_n;
        final SubLObject total = id_index.id_index_count(idx);
        SubLObject sofar = (SubLObject)kb_compare.ZERO_INTEGER;
        assert kb_compare.NIL != Types.stringp(mess) : mess;
        final SubLObject _prev_bind_0 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
        final SubLObject _prev_bind_2 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
        final SubLObject _prev_bind_3 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
        final SubLObject _prev_bind_4 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
        try {
            utilities_macros.$last_percent_progress_index$.bind((SubLObject)kb_compare.ZERO_INTEGER, thread);
            utilities_macros.$last_percent_progress_prediction$.bind((SubLObject)kb_compare.NIL, thread);
            utilities_macros.$within_noting_percent_progress$.bind((SubLObject)kb_compare.T, thread);
            utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
            try {
                utilities_macros.noting_percent_progress_preamble(mess);
                final SubLObject idx_$26 = idx;
                if (kb_compare.NIL == id_index.id_index_objects_empty_p(idx_$26, (SubLObject)kb_compare.$kw86$SKIP)) {
                    final SubLObject idx_$27 = idx_$26;
                    if (kb_compare.NIL == id_index.id_index_dense_objects_empty_p(idx_$27, (SubLObject)kb_compare.$kw86$SKIP)) {
                        final SubLObject vector_var = id_index.id_index_dense_objects(idx_$27);
                        final SubLObject backwardP_var = (SubLObject)kb_compare.NIL;
                        final SubLObject length = Sequences.length(vector_var);
                        SubLObject current;
                        final SubLObject datum = current = (SubLObject)((kb_compare.NIL != backwardP_var) ? ConsesLow.list(Numbers.subtract(length, (SubLObject)kb_compare.ONE_INTEGER), (SubLObject)kb_compare.MINUS_ONE_INTEGER, (SubLObject)kb_compare.MINUS_ONE_INTEGER) : ConsesLow.list((SubLObject)kb_compare.ZERO_INTEGER, length, (SubLObject)kb_compare.ONE_INTEGER));
                        SubLObject start = (SubLObject)kb_compare.NIL;
                        SubLObject end = (SubLObject)kb_compare.NIL;
                        SubLObject delta = (SubLObject)kb_compare.NIL;
                        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)kb_compare.$list141);
                        start = current.first();
                        current = current.rest();
                        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)kb_compare.$list141);
                        end = current.first();
                        current = current.rest();
                        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)kb_compare.$list141);
                        delta = current.first();
                        current = current.rest();
                        if (kb_compare.NIL == current) {
                            if (kb_compare.NIL == my_done) {
                                SubLObject end_var;
                                SubLObject id;
                                SubLObject nart;
                                SubLObject past_ids_$28;
                                SubLObject remote_id;
                                for (end_var = end, id = (SubLObject)kb_compare.NIL, id = start; kb_compare.NIL == my_done && kb_compare.NIL == subl_macros.do_numbers_endtest(id, delta, end_var); id = Numbers.add(id, delta)) {
                                    nart = Vectors.aref(vector_var, id);
                                    if (kb_compare.NIL == id_index.id_index_tombstone_p(nart) || kb_compare.NIL == id_index.id_index_skip_tombstones_p((SubLObject)kb_compare.$kw86$SKIP)) {
                                        if (kb_compare.NIL != id_index.id_index_tombstone_p(nart)) {
                                            nart = (SubLObject)kb_compare.$kw86$SKIP;
                                        }
                                        past_ids_$28 = Numbers.numL(threshold, id);
                                        if (kb_compare.NIL == past_ids_$28) {
                                            remote_id = nart_handles.nart_id(nart);
                                            if (kb_compare.NIL == set.set_memberP(remote_id, missing_set)) {
                                                kb_intersection_add_nart(intersection, nart, remote_id);
                                            }
                                        }
                                        my_done = past_ids_$28;
                                        sofar = Numbers.add(sofar, (SubLObject)kb_compare.ONE_INTEGER);
                                        utilities_macros.note_percent_progress(sofar, total);
                                    }
                                }
                            }
                        }
                        else {
                            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)kb_compare.$list141);
                        }
                    }
                    final SubLObject idx_$28 = idx_$26;
                    if (kb_compare.NIL == id_index.id_index_sparse_objects_empty_p(idx_$28) || kb_compare.NIL == id_index.id_index_skip_tombstones_p((SubLObject)kb_compare.$kw86$SKIP)) {
                        final SubLObject sparse = id_index.id_index_sparse_objects(idx_$28);
                        SubLObject id2 = id_index.id_index_sparse_id_threshold(idx_$28);
                        final SubLObject end_id = id_index.id_index_next_id(idx_$28);
                        final SubLObject v_default = (SubLObject)((kb_compare.NIL != id_index.id_index_skip_tombstones_p((SubLObject)kb_compare.$kw86$SKIP)) ? kb_compare.NIL : kb_compare.$kw86$SKIP);
                        while (id2.numL(end_id) && kb_compare.NIL == my_done) {
                            final SubLObject nart2 = Hashtables.gethash_without_values(id2, sparse, v_default);
                            if (kb_compare.NIL == id_index.id_index_skip_tombstones_p((SubLObject)kb_compare.$kw86$SKIP) || kb_compare.NIL == id_index.id_index_tombstone_p(nart2)) {
                                final SubLObject past_ids_$29 = Numbers.numL(threshold, id2);
                                if (kb_compare.NIL == past_ids_$29) {
                                    final SubLObject remote_id2 = nart_handles.nart_id(nart2);
                                    if (kb_compare.NIL == set.set_memberP(remote_id2, missing_set)) {
                                        kb_intersection_add_nart(intersection, nart2, remote_id2);
                                    }
                                }
                                my_done = past_ids_$29;
                                sofar = Numbers.add(sofar, (SubLObject)kb_compare.ONE_INTEGER);
                                utilities_macros.note_percent_progress(sofar, total);
                            }
                            id2 = Numbers.add(id2, (SubLObject)kb_compare.ONE_INTEGER);
                        }
                    }
                }
            }
            finally {
                final SubLObject _prev_bind_0_$31 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)kb_compare.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    utilities_macros.noting_percent_progress_postamble();
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$31, thread);
                }
            }
        }
        finally {
            utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_4, thread);
            utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_3, thread);
            utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_2, thread);
            utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)kb_compare.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-compare.lisp", position = 24663L)
    public static SubLObject kb_intersection_compute_nart(final SubLObject intersection, final SubLObject nart) {
        if (kb_compare.NIL == kb_intersection_nart_impossibleP(intersection, nart)) {
            final SubLObject remote_id = compute_nart_remote_id(nart);
            if (kb_compare.NIL != remote_id) {
                kb_intersection_add_nart(intersection, nart, remote_id);
            }
        }
        return (SubLObject)kb_compare.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-compare.lisp", position = 24941L)
    public static SubLObject kb_intersection_compute_assertions(final SubLObject intersection) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (kb_compare.NIL != compute_remote_image_old_assertions_congruentP()) {
            kb_intersection_compute_congruent_old_assertions(intersection);
            final SubLObject start = assertion_handles.get_file_backed_assertion_internal_id_threshold();
            final SubLObject table_var = assertion_handles.do_assertions_table();
            final SubLObject total = Numbers.subtract(id_index.id_index_next_id(table_var), start);
            SubLObject sofar = (SubLObject)kb_compare.ZERO_INTEGER;
            final SubLObject _prev_bind_0 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
            final SubLObject _prev_bind_2 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
            final SubLObject _prev_bind_3 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
            final SubLObject _prev_bind_4 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
            try {
                utilities_macros.$last_percent_progress_index$.bind((SubLObject)kb_compare.ZERO_INTEGER, thread);
                utilities_macros.$last_percent_progress_prediction$.bind((SubLObject)kb_compare.NIL, thread);
                utilities_macros.$within_noting_percent_progress$.bind((SubLObject)kb_compare.T, thread);
                utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
                try {
                    utilities_macros.noting_percent_progress_preamble((SubLObject)kb_compare.$str145$KB_Intersection___Examining_new_a);
                    SubLObject end_var;
                    SubLObject end;
                    SubLObject id;
                    SubLObject assertion;
                    for (end = (end_var = id_index.id_index_next_id(table_var)), id = (SubLObject)kb_compare.NIL, id = start; !id.numGE(end_var); id = number_utilities.f_1X(id)) {
                        assertion = id_index.id_index_lookup(table_var, id, (SubLObject)kb_compare.UNPROVIDED);
                        if (kb_compare.NIL != assertion) {
                            utilities_macros.note_percent_progress(sofar, total);
                            sofar = Numbers.add(sofar, (SubLObject)kb_compare.ONE_INTEGER);
                            kb_intersection_compute_assertion(intersection, assertion);
                        }
                    }
                }
                finally {
                    final SubLObject _prev_bind_0_$32 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)kb_compare.T, thread);
                        final SubLObject _values = Values.getValuesAsVector();
                        utilities_macros.noting_percent_progress_postamble();
                        Values.restoreValuesFromVector(_values);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$32, thread);
                    }
                }
            }
            finally {
                utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_4, thread);
                utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_3, thread);
                utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_2, thread);
                utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_0, thread);
            }
        }
        else {
            final SubLObject idx = assertion_handles.do_assertions_table();
            final SubLObject mess = (SubLObject)kb_compare.$str146$KB_Intersection___Examining_asser;
            final SubLObject total = id_index.id_index_count(idx);
            SubLObject sofar = (SubLObject)kb_compare.ZERO_INTEGER;
            assert kb_compare.NIL != Types.stringp(mess) : mess;
            final SubLObject _prev_bind_0 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
            final SubLObject _prev_bind_2 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
            final SubLObject _prev_bind_3 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
            final SubLObject _prev_bind_4 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
            try {
                utilities_macros.$last_percent_progress_index$.bind((SubLObject)kb_compare.ZERO_INTEGER, thread);
                utilities_macros.$last_percent_progress_prediction$.bind((SubLObject)kb_compare.NIL, thread);
                utilities_macros.$within_noting_percent_progress$.bind((SubLObject)kb_compare.T, thread);
                utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
                try {
                    utilities_macros.noting_percent_progress_preamble(mess);
                    final SubLObject idx_$33 = idx;
                    if (kb_compare.NIL == id_index.id_index_objects_empty_p(idx_$33, (SubLObject)kb_compare.$kw86$SKIP)) {
                        final SubLObject idx_$34 = idx_$33;
                        if (kb_compare.NIL == id_index.id_index_dense_objects_empty_p(idx_$34, (SubLObject)kb_compare.$kw86$SKIP)) {
                            final SubLObject vector_var = id_index.id_index_dense_objects(idx_$34);
                            final SubLObject backwardP_var = (SubLObject)kb_compare.NIL;
                            SubLObject length;
                            SubLObject v_iteration;
                            SubLObject a_id;
                            SubLObject a_handle;
                            SubLObject assertion2;
                            for (length = Sequences.length(vector_var), v_iteration = (SubLObject)kb_compare.NIL, v_iteration = (SubLObject)kb_compare.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)kb_compare.ONE_INTEGER)) {
                                a_id = ((kb_compare.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)kb_compare.ONE_INTEGER) : v_iteration);
                                a_handle = Vectors.aref(vector_var, a_id);
                                if (kb_compare.NIL == id_index.id_index_tombstone_p(a_handle) || kb_compare.NIL == id_index.id_index_skip_tombstones_p((SubLObject)kb_compare.$kw86$SKIP)) {
                                    if (kb_compare.NIL != id_index.id_index_tombstone_p(a_handle)) {
                                        a_handle = (SubLObject)kb_compare.$kw86$SKIP;
                                    }
                                    assertion2 = assertion_handles.resolve_assertion_id_value_pair(a_id, a_handle);
                                    kb_intersection_compute_assertion(intersection, assertion2);
                                    sofar = Numbers.add(sofar, (SubLObject)kb_compare.ONE_INTEGER);
                                    utilities_macros.note_percent_progress(sofar, total);
                                }
                            }
                        }
                        final SubLObject idx_$35 = idx_$33;
                        if (kb_compare.NIL == id_index.id_index_sparse_objects_empty_p(idx_$35) || kb_compare.NIL == id_index.id_index_skip_tombstones_p((SubLObject)kb_compare.$kw86$SKIP)) {
                            final SubLObject sparse = id_index.id_index_sparse_objects(idx_$35);
                            SubLObject a_id2 = id_index.id_index_sparse_id_threshold(idx_$35);
                            final SubLObject end_id = id_index.id_index_next_id(idx_$35);
                            final SubLObject v_default = (SubLObject)((kb_compare.NIL != id_index.id_index_skip_tombstones_p((SubLObject)kb_compare.$kw86$SKIP)) ? kb_compare.NIL : kb_compare.$kw86$SKIP);
                            while (a_id2.numL(end_id)) {
                                final SubLObject a_handle2 = Hashtables.gethash_without_values(a_id2, sparse, v_default);
                                if (kb_compare.NIL == id_index.id_index_skip_tombstones_p((SubLObject)kb_compare.$kw86$SKIP) || kb_compare.NIL == id_index.id_index_tombstone_p(a_handle2)) {
                                    final SubLObject assertion3 = assertion_handles.resolve_assertion_id_value_pair(a_id2, a_handle2);
                                    kb_intersection_compute_assertion(intersection, assertion3);
                                    sofar = Numbers.add(sofar, (SubLObject)kb_compare.ONE_INTEGER);
                                    utilities_macros.note_percent_progress(sofar, total);
                                }
                                a_id2 = Numbers.add(a_id2, (SubLObject)kb_compare.ONE_INTEGER);
                            }
                        }
                    }
                }
                finally {
                    final SubLObject _prev_bind_0_$33 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)kb_compare.T, thread);
                        final SubLObject _values2 = Values.getValuesAsVector();
                        utilities_macros.noting_percent_progress_postamble();
                        Values.restoreValuesFromVector(_values2);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$33, thread);
                    }
                }
            }
            finally {
                utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_4, thread);
                utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_3, thread);
                utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_2, thread);
                utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_0, thread);
            }
        }
        return intersection;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-compare.lisp", position = 25486L)
    public static SubLObject kb_intersection_compute_congruent_old_assertions(final SubLObject intersection) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject missing_remote_ids = compute_missing_old_assertion_remote_ids();
        final SubLObject missing_set = set_utilities.construct_set_from_list(missing_remote_ids, Symbols.symbol_function((SubLObject)kb_compare.EQL), (SubLObject)kb_compare.UNPROVIDED);
        final SubLObject threshold = assertion_handles.get_file_backed_assertion_internal_id_threshold();
        final SubLObject past_ids = (SubLObject)kb_compare.NIL;
        SubLObject my_done = (SubLObject)kb_compare.NIL;
        final SubLObject idx = assertion_handles.do_assertions_table();
        final SubLObject mess = (SubLObject)kb_compare.$str147$KB_Intersection___Examining_old_a;
        final SubLObject total = id_index.id_index_count(idx);
        SubLObject sofar = (SubLObject)kb_compare.ZERO_INTEGER;
        assert kb_compare.NIL != Types.stringp(mess) : mess;
        final SubLObject _prev_bind_0 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
        final SubLObject _prev_bind_2 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
        final SubLObject _prev_bind_3 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
        final SubLObject _prev_bind_4 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
        try {
            utilities_macros.$last_percent_progress_index$.bind((SubLObject)kb_compare.ZERO_INTEGER, thread);
            utilities_macros.$last_percent_progress_prediction$.bind((SubLObject)kb_compare.NIL, thread);
            utilities_macros.$within_noting_percent_progress$.bind((SubLObject)kb_compare.T, thread);
            utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
            try {
                utilities_macros.noting_percent_progress_preamble(mess);
                final SubLObject idx_$37 = idx;
                if (kb_compare.NIL == id_index.id_index_objects_empty_p(idx_$37, (SubLObject)kb_compare.$kw86$SKIP)) {
                    final SubLObject idx_$38 = idx_$37;
                    if (kb_compare.NIL == id_index.id_index_dense_objects_empty_p(idx_$38, (SubLObject)kb_compare.$kw86$SKIP)) {
                        final SubLObject vector_var = id_index.id_index_dense_objects(idx_$38);
                        final SubLObject backwardP_var = (SubLObject)kb_compare.NIL;
                        final SubLObject length = Sequences.length(vector_var);
                        SubLObject current;
                        final SubLObject datum = current = (SubLObject)((kb_compare.NIL != backwardP_var) ? ConsesLow.list(Numbers.subtract(length, (SubLObject)kb_compare.ONE_INTEGER), (SubLObject)kb_compare.MINUS_ONE_INTEGER, (SubLObject)kb_compare.MINUS_ONE_INTEGER) : ConsesLow.list((SubLObject)kb_compare.ZERO_INTEGER, length, (SubLObject)kb_compare.ONE_INTEGER));
                        SubLObject start = (SubLObject)kb_compare.NIL;
                        SubLObject end = (SubLObject)kb_compare.NIL;
                        SubLObject delta = (SubLObject)kb_compare.NIL;
                        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)kb_compare.$list141);
                        start = current.first();
                        current = current.rest();
                        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)kb_compare.$list141);
                        end = current.first();
                        current = current.rest();
                        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)kb_compare.$list141);
                        delta = current.first();
                        current = current.rest();
                        if (kb_compare.NIL == current) {
                            if (kb_compare.NIL == my_done) {
                                SubLObject end_var;
                                SubLObject id;
                                SubLObject assertion;
                                SubLObject past_ids_$39;
                                SubLObject remote_id;
                                for (end_var = end, id = (SubLObject)kb_compare.NIL, id = start; kb_compare.NIL == my_done && kb_compare.NIL == subl_macros.do_numbers_endtest(id, delta, end_var); id = Numbers.add(id, delta)) {
                                    assertion = Vectors.aref(vector_var, id);
                                    if (kb_compare.NIL == id_index.id_index_tombstone_p(assertion) || kb_compare.NIL == id_index.id_index_skip_tombstones_p((SubLObject)kb_compare.$kw86$SKIP)) {
                                        if (kb_compare.NIL != id_index.id_index_tombstone_p(assertion)) {
                                            assertion = (SubLObject)kb_compare.$kw86$SKIP;
                                        }
                                        past_ids_$39 = Numbers.numL(threshold, id);
                                        if (kb_compare.NIL == past_ids_$39) {
                                            remote_id = assertion_handles.assertion_id(assertion);
                                            if (kb_compare.NIL == set.set_memberP(remote_id, missing_set)) {
                                                kb_intersection_add_assertion(intersection, assertion, remote_id);
                                            }
                                        }
                                        my_done = past_ids_$39;
                                        sofar = Numbers.add(sofar, (SubLObject)kb_compare.ONE_INTEGER);
                                        utilities_macros.note_percent_progress(sofar, total);
                                    }
                                }
                            }
                        }
                        else {
                            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)kb_compare.$list141);
                        }
                    }
                    final SubLObject idx_$39 = idx_$37;
                    if (kb_compare.NIL == id_index.id_index_sparse_objects_empty_p(idx_$39) || kb_compare.NIL == id_index.id_index_skip_tombstones_p((SubLObject)kb_compare.$kw86$SKIP)) {
                        final SubLObject sparse = id_index.id_index_sparse_objects(idx_$39);
                        SubLObject id2 = id_index.id_index_sparse_id_threshold(idx_$39);
                        final SubLObject end_id = id_index.id_index_next_id(idx_$39);
                        final SubLObject v_default = (SubLObject)((kb_compare.NIL != id_index.id_index_skip_tombstones_p((SubLObject)kb_compare.$kw86$SKIP)) ? kb_compare.NIL : kb_compare.$kw86$SKIP);
                        while (id2.numL(end_id) && kb_compare.NIL == my_done) {
                            final SubLObject assertion2 = Hashtables.gethash_without_values(id2, sparse, v_default);
                            if (kb_compare.NIL == id_index.id_index_skip_tombstones_p((SubLObject)kb_compare.$kw86$SKIP) || kb_compare.NIL == id_index.id_index_tombstone_p(assertion2)) {
                                final SubLObject past_ids_$40 = Numbers.numL(threshold, id2);
                                if (kb_compare.NIL == past_ids_$40) {
                                    final SubLObject remote_id2 = assertion_handles.assertion_id(assertion2);
                                    if (kb_compare.NIL == set.set_memberP(remote_id2, missing_set)) {
                                        kb_intersection_add_assertion(intersection, assertion2, remote_id2);
                                    }
                                }
                                my_done = past_ids_$40;
                                sofar = Numbers.add(sofar, (SubLObject)kb_compare.ONE_INTEGER);
                                utilities_macros.note_percent_progress(sofar, total);
                            }
                            id2 = Numbers.add(id2, (SubLObject)kb_compare.ONE_INTEGER);
                        }
                    }
                }
            }
            finally {
                final SubLObject _prev_bind_0_$42 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)kb_compare.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    utilities_macros.noting_percent_progress_postamble();
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$42, thread);
                }
            }
        }
        finally {
            utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_4, thread);
            utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_3, thread);
            utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_2, thread);
            utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)kb_compare.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-compare.lisp", position = 26061L)
    public static SubLObject kb_intersection_compute_assertion(final SubLObject intersection, final SubLObject assertion) {
        if (kb_compare.NIL == kb_intersection_assertion_impossibleP(intersection, assertion)) {
            final SubLObject remote_id = compute_assertion_remote_id(assertion);
            if (kb_compare.NIL != remote_id) {
                kb_intersection_add_assertion(intersection, assertion, remote_id);
            }
        }
        return (SubLObject)kb_compare.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-compare.lisp", position = 26379L)
    public static SubLObject kb_intersection_compute_deductions(final SubLObject intersection) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (kb_compare.NIL != compute_remote_image_old_deductions_congruentP()) {
            kb_intersection_compute_congruent_old_deductions(intersection);
            final SubLObject start = deduction_handles.get_file_backed_deduction_internal_id_threshold();
            final SubLObject table_var = deduction_handles.do_deductions_table();
            final SubLObject total = Numbers.subtract(id_index.id_index_next_id(table_var), start);
            SubLObject sofar = (SubLObject)kb_compare.ZERO_INTEGER;
            final SubLObject _prev_bind_0 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
            final SubLObject _prev_bind_2 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
            final SubLObject _prev_bind_3 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
            final SubLObject _prev_bind_4 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
            try {
                utilities_macros.$last_percent_progress_index$.bind((SubLObject)kb_compare.ZERO_INTEGER, thread);
                utilities_macros.$last_percent_progress_prediction$.bind((SubLObject)kb_compare.NIL, thread);
                utilities_macros.$within_noting_percent_progress$.bind((SubLObject)kb_compare.T, thread);
                utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
                try {
                    utilities_macros.noting_percent_progress_preamble((SubLObject)kb_compare.$str148$KB_Intersection___Examining_new_d);
                    SubLObject end_var;
                    SubLObject end;
                    SubLObject id;
                    SubLObject deduction;
                    for (end = (end_var = id_index.id_index_next_id(table_var)), id = (SubLObject)kb_compare.NIL, id = start; !id.numGE(end_var); id = number_utilities.f_1X(id)) {
                        deduction = id_index.id_index_lookup(table_var, id, (SubLObject)kb_compare.UNPROVIDED);
                        if (kb_compare.NIL != deduction) {
                            utilities_macros.note_percent_progress(sofar, total);
                            sofar = Numbers.add(sofar, (SubLObject)kb_compare.ONE_INTEGER);
                            kb_intersection_compute_deduction(intersection, deduction);
                        }
                    }
                }
                finally {
                    final SubLObject _prev_bind_0_$43 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)kb_compare.T, thread);
                        final SubLObject _values = Values.getValuesAsVector();
                        utilities_macros.noting_percent_progress_postamble();
                        Values.restoreValuesFromVector(_values);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$43, thread);
                    }
                }
            }
            finally {
                utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_4, thread);
                utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_3, thread);
                utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_2, thread);
                utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_0, thread);
            }
        }
        else {
            final SubLObject idx = deduction_handles.do_deductions_table();
            final SubLObject mess = (SubLObject)kb_compare.$str149$KB_Intersection___Examining_deduc;
            final SubLObject total = id_index.id_index_count(idx);
            SubLObject sofar = (SubLObject)kb_compare.ZERO_INTEGER;
            assert kb_compare.NIL != Types.stringp(mess) : mess;
            final SubLObject _prev_bind_0 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
            final SubLObject _prev_bind_2 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
            final SubLObject _prev_bind_3 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
            final SubLObject _prev_bind_4 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
            try {
                utilities_macros.$last_percent_progress_index$.bind((SubLObject)kb_compare.ZERO_INTEGER, thread);
                utilities_macros.$last_percent_progress_prediction$.bind((SubLObject)kb_compare.NIL, thread);
                utilities_macros.$within_noting_percent_progress$.bind((SubLObject)kb_compare.T, thread);
                utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
                try {
                    utilities_macros.noting_percent_progress_preamble(mess);
                    final SubLObject idx_$44 = idx;
                    if (kb_compare.NIL == id_index.id_index_objects_empty_p(idx_$44, (SubLObject)kb_compare.$kw86$SKIP)) {
                        final SubLObject idx_$45 = idx_$44;
                        if (kb_compare.NIL == id_index.id_index_dense_objects_empty_p(idx_$45, (SubLObject)kb_compare.$kw86$SKIP)) {
                            final SubLObject vector_var = id_index.id_index_dense_objects(idx_$45);
                            final SubLObject backwardP_var = (SubLObject)kb_compare.NIL;
                            SubLObject length;
                            SubLObject v_iteration;
                            SubLObject d_id;
                            SubLObject d_handle;
                            SubLObject deduction2;
                            for (length = Sequences.length(vector_var), v_iteration = (SubLObject)kb_compare.NIL, v_iteration = (SubLObject)kb_compare.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)kb_compare.ONE_INTEGER)) {
                                d_id = ((kb_compare.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)kb_compare.ONE_INTEGER) : v_iteration);
                                d_handle = Vectors.aref(vector_var, d_id);
                                if (kb_compare.NIL == id_index.id_index_tombstone_p(d_handle) || kb_compare.NIL == id_index.id_index_skip_tombstones_p((SubLObject)kb_compare.$kw86$SKIP)) {
                                    if (kb_compare.NIL != id_index.id_index_tombstone_p(d_handle)) {
                                        d_handle = (SubLObject)kb_compare.$kw86$SKIP;
                                    }
                                    deduction2 = deduction_handles.resolve_deduction_id_value_pair(d_id, d_handle);
                                    if (kb_compare.NIL != deduction_handles.valid_deduction(deduction2, (SubLObject)kb_compare.T)) {
                                        kb_intersection_compute_deduction(intersection, deduction2);
                                    }
                                    sofar = Numbers.add(sofar, (SubLObject)kb_compare.ONE_INTEGER);
                                    utilities_macros.note_percent_progress(sofar, total);
                                }
                            }
                        }
                        final SubLObject idx_$46 = idx_$44;
                        if (kb_compare.NIL == id_index.id_index_sparse_objects_empty_p(idx_$46) || kb_compare.NIL == id_index.id_index_skip_tombstones_p((SubLObject)kb_compare.$kw86$SKIP)) {
                            final SubLObject sparse = id_index.id_index_sparse_objects(idx_$46);
                            SubLObject d_id2 = id_index.id_index_sparse_id_threshold(idx_$46);
                            final SubLObject end_id = id_index.id_index_next_id(idx_$46);
                            final SubLObject v_default = (SubLObject)((kb_compare.NIL != id_index.id_index_skip_tombstones_p((SubLObject)kb_compare.$kw86$SKIP)) ? kb_compare.NIL : kb_compare.$kw86$SKIP);
                            while (d_id2.numL(end_id)) {
                                final SubLObject d_handle2 = Hashtables.gethash_without_values(d_id2, sparse, v_default);
                                if (kb_compare.NIL == id_index.id_index_skip_tombstones_p((SubLObject)kb_compare.$kw86$SKIP) || kb_compare.NIL == id_index.id_index_tombstone_p(d_handle2)) {
                                    final SubLObject deduction3 = deduction_handles.resolve_deduction_id_value_pair(d_id2, d_handle2);
                                    if (kb_compare.NIL != deduction_handles.valid_deduction(deduction3, (SubLObject)kb_compare.T)) {
                                        kb_intersection_compute_deduction(intersection, deduction3);
                                    }
                                    sofar = Numbers.add(sofar, (SubLObject)kb_compare.ONE_INTEGER);
                                    utilities_macros.note_percent_progress(sofar, total);
                                }
                                d_id2 = Numbers.add(d_id2, (SubLObject)kb_compare.ONE_INTEGER);
                            }
                        }
                    }
                }
                finally {
                    final SubLObject _prev_bind_0_$44 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)kb_compare.T, thread);
                        final SubLObject _values2 = Values.getValuesAsVector();
                        utilities_macros.noting_percent_progress_postamble();
                        Values.restoreValuesFromVector(_values2);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$44, thread);
                    }
                }
            }
            finally {
                utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_4, thread);
                utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_3, thread);
                utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_2, thread);
                utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_0, thread);
            }
        }
        return intersection;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-compare.lisp", position = 26970L)
    public static SubLObject kb_intersection_compute_congruent_old_deductions(final SubLObject intersection) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject missing_remote_ids = compute_missing_old_deduction_remote_ids();
        final SubLObject missing_set = set_utilities.construct_set_from_list(missing_remote_ids, Symbols.symbol_function((SubLObject)kb_compare.EQL), (SubLObject)kb_compare.UNPROVIDED);
        final SubLObject threshold = deduction_handles.get_file_backed_deduction_internal_id_threshold();
        final SubLObject past_ids = (SubLObject)kb_compare.NIL;
        SubLObject my_done = (SubLObject)kb_compare.NIL;
        final SubLObject idx = deduction_handles.do_deductions_table();
        final SubLObject mess = (SubLObject)kb_compare.$str150$KB_Intersection___Examining_old_d;
        final SubLObject total = id_index.id_index_count(idx);
        SubLObject sofar = (SubLObject)kb_compare.ZERO_INTEGER;
        assert kb_compare.NIL != Types.stringp(mess) : mess;
        final SubLObject _prev_bind_0 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
        final SubLObject _prev_bind_2 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
        final SubLObject _prev_bind_3 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
        final SubLObject _prev_bind_4 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
        try {
            utilities_macros.$last_percent_progress_index$.bind((SubLObject)kb_compare.ZERO_INTEGER, thread);
            utilities_macros.$last_percent_progress_prediction$.bind((SubLObject)kb_compare.NIL, thread);
            utilities_macros.$within_noting_percent_progress$.bind((SubLObject)kb_compare.T, thread);
            utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
            try {
                utilities_macros.noting_percent_progress_preamble(mess);
                final SubLObject idx_$48 = idx;
                if (kb_compare.NIL == id_index.id_index_objects_empty_p(idx_$48, (SubLObject)kb_compare.$kw86$SKIP)) {
                    final SubLObject idx_$49 = idx_$48;
                    if (kb_compare.NIL == id_index.id_index_dense_objects_empty_p(idx_$49, (SubLObject)kb_compare.$kw86$SKIP)) {
                        final SubLObject vector_var = id_index.id_index_dense_objects(idx_$49);
                        final SubLObject backwardP_var = (SubLObject)kb_compare.NIL;
                        final SubLObject length = Sequences.length(vector_var);
                        SubLObject current;
                        final SubLObject datum = current = (SubLObject)((kb_compare.NIL != backwardP_var) ? ConsesLow.list(Numbers.subtract(length, (SubLObject)kb_compare.ONE_INTEGER), (SubLObject)kb_compare.MINUS_ONE_INTEGER, (SubLObject)kb_compare.MINUS_ONE_INTEGER) : ConsesLow.list((SubLObject)kb_compare.ZERO_INTEGER, length, (SubLObject)kb_compare.ONE_INTEGER));
                        SubLObject start = (SubLObject)kb_compare.NIL;
                        SubLObject end = (SubLObject)kb_compare.NIL;
                        SubLObject delta = (SubLObject)kb_compare.NIL;
                        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)kb_compare.$list141);
                        start = current.first();
                        current = current.rest();
                        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)kb_compare.$list141);
                        end = current.first();
                        current = current.rest();
                        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)kb_compare.$list141);
                        delta = current.first();
                        current = current.rest();
                        if (kb_compare.NIL == current) {
                            if (kb_compare.NIL == my_done) {
                                SubLObject end_var;
                                SubLObject id;
                                SubLObject deduction;
                                SubLObject past_ids_$50;
                                SubLObject remote_id;
                                for (end_var = end, id = (SubLObject)kb_compare.NIL, id = start; kb_compare.NIL == my_done && kb_compare.NIL == subl_macros.do_numbers_endtest(id, delta, end_var); id = Numbers.add(id, delta)) {
                                    deduction = Vectors.aref(vector_var, id);
                                    if (kb_compare.NIL == id_index.id_index_tombstone_p(deduction) || kb_compare.NIL == id_index.id_index_skip_tombstones_p((SubLObject)kb_compare.$kw86$SKIP)) {
                                        if (kb_compare.NIL != id_index.id_index_tombstone_p(deduction)) {
                                            deduction = (SubLObject)kb_compare.$kw86$SKIP;
                                        }
                                        past_ids_$50 = Numbers.numL(threshold, id);
                                        if (kb_compare.NIL == past_ids_$50) {
                                            remote_id = deduction_handles.deduction_id(deduction);
                                            if (kb_compare.NIL == set.set_memberP(remote_id, missing_set)) {
                                                kb_intersection_add_deduction(intersection, deduction, remote_id);
                                            }
                                        }
                                        my_done = past_ids_$50;
                                        sofar = Numbers.add(sofar, (SubLObject)kb_compare.ONE_INTEGER);
                                        utilities_macros.note_percent_progress(sofar, total);
                                    }
                                }
                            }
                        }
                        else {
                            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)kb_compare.$list141);
                        }
                    }
                    final SubLObject idx_$50 = idx_$48;
                    if (kb_compare.NIL == id_index.id_index_sparse_objects_empty_p(idx_$50) || kb_compare.NIL == id_index.id_index_skip_tombstones_p((SubLObject)kb_compare.$kw86$SKIP)) {
                        final SubLObject sparse = id_index.id_index_sparse_objects(idx_$50);
                        SubLObject id2 = id_index.id_index_sparse_id_threshold(idx_$50);
                        final SubLObject end_id = id_index.id_index_next_id(idx_$50);
                        final SubLObject v_default = (SubLObject)((kb_compare.NIL != id_index.id_index_skip_tombstones_p((SubLObject)kb_compare.$kw86$SKIP)) ? kb_compare.NIL : kb_compare.$kw86$SKIP);
                        while (id2.numL(end_id) && kb_compare.NIL == my_done) {
                            final SubLObject deduction2 = Hashtables.gethash_without_values(id2, sparse, v_default);
                            if (kb_compare.NIL == id_index.id_index_skip_tombstones_p((SubLObject)kb_compare.$kw86$SKIP) || kb_compare.NIL == id_index.id_index_tombstone_p(deduction2)) {
                                final SubLObject past_ids_$51 = Numbers.numL(threshold, id2);
                                if (kb_compare.NIL == past_ids_$51) {
                                    final SubLObject remote_id2 = deduction_handles.deduction_id(deduction2);
                                    if (kb_compare.NIL == set.set_memberP(remote_id2, missing_set)) {
                                        kb_intersection_add_deduction(intersection, deduction2, remote_id2);
                                    }
                                }
                                my_done = past_ids_$51;
                                sofar = Numbers.add(sofar, (SubLObject)kb_compare.ONE_INTEGER);
                                utilities_macros.note_percent_progress(sofar, total);
                            }
                            id2 = Numbers.add(id2, (SubLObject)kb_compare.ONE_INTEGER);
                        }
                    }
                }
            }
            finally {
                final SubLObject _prev_bind_0_$53 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)kb_compare.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    utilities_macros.noting_percent_progress_postamble();
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$53, thread);
                }
            }
        }
        finally {
            utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_4, thread);
            utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_3, thread);
            utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_2, thread);
            utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)kb_compare.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-compare.lisp", position = 27545L)
    public static SubLObject kb_intersection_compute_deduction(final SubLObject intersection, final SubLObject deduction) {
        if (kb_compare.NIL == kb_intersection_deduction_impossibleP(intersection, deduction)) {
            final SubLObject remote_id = compute_deduction_remote_id(deduction);
            if (kb_compare.NIL != remote_id) {
                kb_intersection_add_deduction(intersection, deduction, remote_id);
            }
        }
        return (SubLObject)kb_compare.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-compare.lisp", position = 27863L)
    public static SubLObject kb_difference_compute(final SubLObject difference) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert kb_compare.NIL != kb_difference_p(difference) : difference;
        final SubLObject v_remote_image = kb_difference_remote_image(difference);
        final SubLObject connection = remote_image.new_remote_image_connection(v_remote_image);
        try {
            remote_image.open_remote_image_connection(connection);
            final SubLObject _prev_bind_0 = remote_image.$current_remote_image_connection$.currentBinding(thread);
            final SubLObject _prev_bind_2 = kb_compare.$kb_compare_common_symbols$.currentBinding(thread);
            try {
                remote_image.$current_remote_image_connection$.bind(connection, thread);
                kb_compare.$kb_compare_common_symbols$.bind(kb_compare.$kb_compare_common_symbols$.getDynamicValue(thread), thread);
                set_kb_compare_connection_common_symbols();
                final SubLObject _prev_bind_0_$54 = cfasl.$cfasl_common_symbols$.currentBinding(thread);
                try {
                    cfasl.$cfasl_common_symbols$.bind((SubLObject)kb_compare.NIL, thread);
                    cfasl.cfasl_set_common_symbols(kb_compare.$kb_compare_common_symbols$.getDynamicValue(thread));
                    kb_difference_compute_renamed_constants(difference);
                    kb_difference_compute_constants(difference);
                    kb_difference_compute_narts(difference);
                    kb_difference_compute_assertions(difference);
                    kb_difference_compute_deductions(difference);
                }
                finally {
                    cfasl.$cfasl_common_symbols$.rebind(_prev_bind_0_$54, thread);
                }
            }
            finally {
                kb_compare.$kb_compare_common_symbols$.rebind(_prev_bind_2, thread);
                remote_image.$current_remote_image_connection$.rebind(_prev_bind_0, thread);
            }
        }
        finally {
            final SubLObject _prev_bind_3 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)kb_compare.T, thread);
                final SubLObject _values = Values.getValuesAsVector();
                remote_image.close_remote_image_connection(connection);
                Values.restoreValuesFromVector(_values);
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_3, thread);
            }
        }
        return difference;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-compare.lisp", position = 28435L)
    public static SubLObject kb_difference_compute_renamed_constants(final SubLObject difference) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject intersection = kb_difference_common_intersection(difference);
        final SubLObject message = (SubLObject)kb_compare.$str151$KB_DIFFERENCE___Examining_constan;
        final SubLObject idx = kb_intersection_constant_index(intersection);
        final SubLObject mess = message;
        final SubLObject total = id_index.id_index_count(idx);
        SubLObject sofar = (SubLObject)kb_compare.ZERO_INTEGER;
        assert kb_compare.NIL != Types.stringp(mess) : mess;
        final SubLObject _prev_bind_0 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
        final SubLObject _prev_bind_2 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
        final SubLObject _prev_bind_3 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
        final SubLObject _prev_bind_4 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
        try {
            utilities_macros.$last_percent_progress_index$.bind((SubLObject)kb_compare.ZERO_INTEGER, thread);
            utilities_macros.$last_percent_progress_prediction$.bind((SubLObject)kb_compare.NIL, thread);
            utilities_macros.$within_noting_percent_progress$.bind((SubLObject)kb_compare.T, thread);
            utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
            try {
                utilities_macros.noting_percent_progress_preamble(mess);
                final SubLObject idx_$55 = idx;
                if (kb_compare.NIL == id_index.id_index_objects_empty_p(idx_$55, (SubLObject)kb_compare.$kw86$SKIP)) {
                    final SubLObject idx_$56 = idx_$55;
                    if (kb_compare.NIL == id_index.id_index_dense_objects_empty_p(idx_$56, (SubLObject)kb_compare.$kw86$SKIP)) {
                        final SubLObject vector_var = id_index.id_index_dense_objects(idx_$56);
                        final SubLObject backwardP_var = (SubLObject)kb_compare.NIL;
                        SubLObject length;
                        SubLObject v_iteration;
                        SubLObject internal_id;
                        SubLObject remote_id;
                        SubLObject constant;
                        SubLObject remote_id_$57;
                        SubLObject remote_name;
                        for (length = Sequences.length(vector_var), v_iteration = (SubLObject)kb_compare.NIL, v_iteration = (SubLObject)kb_compare.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)kb_compare.ONE_INTEGER)) {
                            internal_id = ((kb_compare.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)kb_compare.ONE_INTEGER) : v_iteration);
                            remote_id = Vectors.aref(vector_var, internal_id);
                            if (kb_compare.NIL == id_index.id_index_tombstone_p(remote_id) || kb_compare.NIL == id_index.id_index_skip_tombstones_p((SubLObject)kb_compare.$kw86$SKIP)) {
                                if (kb_compare.NIL != id_index.id_index_tombstone_p(remote_id)) {
                                    remote_id = (SubLObject)kb_compare.$kw86$SKIP;
                                }
                                constant = constants_high.find_constant_by_internal_id(internal_id);
                                remote_id_$57 = kb_intersection_constant_remote_id(intersection, constant);
                                remote_name = compute_constant_remote_name(remote_id_$57);
                                if (!remote_name.equal(constants_high.constant_name(constant))) {
                                    kb_difference_add_renamed_constant(difference, constant, remote_name);
                                }
                                sofar = Numbers.add(sofar, (SubLObject)kb_compare.ONE_INTEGER);
                                utilities_macros.note_percent_progress(sofar, total);
                            }
                        }
                    }
                    final SubLObject idx_$57 = idx_$55;
                    if (kb_compare.NIL == id_index.id_index_sparse_objects_empty_p(idx_$57)) {
                        final SubLObject cdohash_table = id_index.id_index_sparse_objects(idx_$57);
                        SubLObject internal_id2 = (SubLObject)kb_compare.NIL;
                        SubLObject remote_id2 = (SubLObject)kb_compare.NIL;
                        final Iterator cdohash_iterator = Hashtables.getEntrySetIterator(cdohash_table);
                        try {
                            while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                                final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                                internal_id2 = Hashtables.getEntryKey(cdohash_entry);
                                remote_id2 = Hashtables.getEntryValue(cdohash_entry);
                                final SubLObject constant2 = constants_high.find_constant_by_internal_id(internal_id2);
                                final SubLObject remote_id_$58 = kb_intersection_constant_remote_id(intersection, constant2);
                                final SubLObject remote_name2 = compute_constant_remote_name(remote_id_$58);
                                if (!remote_name2.equal(constants_high.constant_name(constant2))) {
                                    kb_difference_add_renamed_constant(difference, constant2, remote_name2);
                                }
                                sofar = Numbers.add(sofar, (SubLObject)kb_compare.ONE_INTEGER);
                                utilities_macros.note_percent_progress(sofar, total);
                            }
                        }
                        finally {
                            Hashtables.releaseEntrySetIterator(cdohash_iterator);
                        }
                    }
                }
            }
            finally {
                final SubLObject _prev_bind_0_$60 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)kb_compare.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    utilities_macros.noting_percent_progress_postamble();
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$60, thread);
                }
            }
        }
        finally {
            utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_4, thread);
            utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_3, thread);
            utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_2, thread);
            utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)kb_compare.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-compare.lisp", position = 29022L)
    public static SubLObject kb_difference_compute_constants(final SubLObject difference) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject intersection = kb_difference_common_intersection(difference);
        final SubLObject idx = constant_handles.do_constants_table();
        final SubLObject mess = (SubLObject)kb_compare.$str152$KB_DIFFERENCE___Examining_constan;
        final SubLObject total = id_index.id_index_count(idx);
        SubLObject sofar = (SubLObject)kb_compare.ZERO_INTEGER;
        assert kb_compare.NIL != Types.stringp(mess) : mess;
        final SubLObject _prev_bind_0 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
        final SubLObject _prev_bind_2 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
        final SubLObject _prev_bind_3 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
        final SubLObject _prev_bind_4 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
        try {
            utilities_macros.$last_percent_progress_index$.bind((SubLObject)kb_compare.ZERO_INTEGER, thread);
            utilities_macros.$last_percent_progress_prediction$.bind((SubLObject)kb_compare.NIL, thread);
            utilities_macros.$within_noting_percent_progress$.bind((SubLObject)kb_compare.T, thread);
            utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
            try {
                utilities_macros.noting_percent_progress_preamble(mess);
                final SubLObject idx_$61 = idx;
                if (kb_compare.NIL == id_index.id_index_objects_empty_p(idx_$61, (SubLObject)kb_compare.$kw86$SKIP)) {
                    final SubLObject idx_$62 = idx_$61;
                    if (kb_compare.NIL == id_index.id_index_dense_objects_empty_p(idx_$62, (SubLObject)kb_compare.$kw86$SKIP)) {
                        final SubLObject vector_var = id_index.id_index_dense_objects(idx_$62);
                        final SubLObject backwardP_var = (SubLObject)kb_compare.NIL;
                        SubLObject length;
                        SubLObject v_iteration;
                        SubLObject id;
                        SubLObject constant;
                        for (length = Sequences.length(vector_var), v_iteration = (SubLObject)kb_compare.NIL, v_iteration = (SubLObject)kb_compare.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)kb_compare.ONE_INTEGER)) {
                            id = ((kb_compare.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)kb_compare.ONE_INTEGER) : v_iteration);
                            constant = Vectors.aref(vector_var, id);
                            if (kb_compare.NIL == id_index.id_index_tombstone_p(constant) || kb_compare.NIL == id_index.id_index_skip_tombstones_p((SubLObject)kb_compare.$kw86$SKIP)) {
                                if (kb_compare.NIL != id_index.id_index_tombstone_p(constant)) {
                                    constant = (SubLObject)kb_compare.$kw86$SKIP;
                                }
                                if (kb_compare.NIL == kb_intersection_constantP(intersection, constant)) {
                                    kb_difference_add_constant(difference, constant);
                                }
                                sofar = Numbers.add(sofar, (SubLObject)kb_compare.ONE_INTEGER);
                                utilities_macros.note_percent_progress(sofar, total);
                            }
                        }
                    }
                    final SubLObject idx_$63 = idx_$61;
                    if (kb_compare.NIL == id_index.id_index_sparse_objects_empty_p(idx_$63) || kb_compare.NIL == id_index.id_index_skip_tombstones_p((SubLObject)kb_compare.$kw86$SKIP)) {
                        final SubLObject sparse = id_index.id_index_sparse_objects(idx_$63);
                        SubLObject id2 = id_index.id_index_sparse_id_threshold(idx_$63);
                        final SubLObject end_id = id_index.id_index_next_id(idx_$63);
                        final SubLObject v_default = (SubLObject)((kb_compare.NIL != id_index.id_index_skip_tombstones_p((SubLObject)kb_compare.$kw86$SKIP)) ? kb_compare.NIL : kb_compare.$kw86$SKIP);
                        while (id2.numL(end_id)) {
                            final SubLObject constant2 = Hashtables.gethash_without_values(id2, sparse, v_default);
                            if (kb_compare.NIL == id_index.id_index_skip_tombstones_p((SubLObject)kb_compare.$kw86$SKIP) || kb_compare.NIL == id_index.id_index_tombstone_p(constant2)) {
                                if (kb_compare.NIL == kb_intersection_constantP(intersection, constant2)) {
                                    kb_difference_add_constant(difference, constant2);
                                }
                                sofar = Numbers.add(sofar, (SubLObject)kb_compare.ONE_INTEGER);
                                utilities_macros.note_percent_progress(sofar, total);
                            }
                            id2 = Numbers.add(id2, (SubLObject)kb_compare.ONE_INTEGER);
                        }
                    }
                }
            }
            finally {
                final SubLObject _prev_bind_0_$64 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)kb_compare.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    utilities_macros.noting_percent_progress_postamble();
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$64, thread);
                }
            }
        }
        finally {
            utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_4, thread);
            utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_3, thread);
            utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_2, thread);
            utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)kb_compare.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-compare.lisp", position = 29354L)
    public static SubLObject kb_difference_compute_narts(final SubLObject difference) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject intersection = kb_difference_common_intersection(difference);
        final SubLObject idx = nart_handles.do_narts_table();
        final SubLObject mess = (SubLObject)kb_compare.$str153$KB_DIFFERENCE___Examining_narts;
        final SubLObject total = id_index.id_index_count(idx);
        SubLObject sofar = (SubLObject)kb_compare.ZERO_INTEGER;
        assert kb_compare.NIL != Types.stringp(mess) : mess;
        final SubLObject _prev_bind_0 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
        final SubLObject _prev_bind_2 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
        final SubLObject _prev_bind_3 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
        final SubLObject _prev_bind_4 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
        try {
            utilities_macros.$last_percent_progress_index$.bind((SubLObject)kb_compare.ZERO_INTEGER, thread);
            utilities_macros.$last_percent_progress_prediction$.bind((SubLObject)kb_compare.NIL, thread);
            utilities_macros.$within_noting_percent_progress$.bind((SubLObject)kb_compare.T, thread);
            utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
            try {
                utilities_macros.noting_percent_progress_preamble(mess);
                final SubLObject idx_$65 = idx;
                if (kb_compare.NIL == id_index.id_index_objects_empty_p(idx_$65, (SubLObject)kb_compare.$kw86$SKIP)) {
                    final SubLObject idx_$66 = idx_$65;
                    if (kb_compare.NIL == id_index.id_index_dense_objects_empty_p(idx_$66, (SubLObject)kb_compare.$kw86$SKIP)) {
                        final SubLObject vector_var = id_index.id_index_dense_objects(idx_$66);
                        final SubLObject backwardP_var = (SubLObject)kb_compare.NIL;
                        SubLObject length;
                        SubLObject v_iteration;
                        SubLObject id;
                        SubLObject nart;
                        for (length = Sequences.length(vector_var), v_iteration = (SubLObject)kb_compare.NIL, v_iteration = (SubLObject)kb_compare.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)kb_compare.ONE_INTEGER)) {
                            id = ((kb_compare.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)kb_compare.ONE_INTEGER) : v_iteration);
                            nart = Vectors.aref(vector_var, id);
                            if (kb_compare.NIL == id_index.id_index_tombstone_p(nart) || kb_compare.NIL == id_index.id_index_skip_tombstones_p((SubLObject)kb_compare.$kw86$SKIP)) {
                                if (kb_compare.NIL != id_index.id_index_tombstone_p(nart)) {
                                    nart = (SubLObject)kb_compare.$kw86$SKIP;
                                }
                                if (kb_compare.NIL == kb_intersection_nartP(intersection, nart)) {
                                    kb_difference_add_nart(difference, nart);
                                }
                                sofar = Numbers.add(sofar, (SubLObject)kb_compare.ONE_INTEGER);
                                utilities_macros.note_percent_progress(sofar, total);
                            }
                        }
                    }
                    final SubLObject idx_$67 = idx_$65;
                    if (kb_compare.NIL == id_index.id_index_sparse_objects_empty_p(idx_$67) || kb_compare.NIL == id_index.id_index_skip_tombstones_p((SubLObject)kb_compare.$kw86$SKIP)) {
                        final SubLObject sparse = id_index.id_index_sparse_objects(idx_$67);
                        SubLObject id2 = id_index.id_index_sparse_id_threshold(idx_$67);
                        final SubLObject end_id = id_index.id_index_next_id(idx_$67);
                        final SubLObject v_default = (SubLObject)((kb_compare.NIL != id_index.id_index_skip_tombstones_p((SubLObject)kb_compare.$kw86$SKIP)) ? kb_compare.NIL : kb_compare.$kw86$SKIP);
                        while (id2.numL(end_id)) {
                            final SubLObject nart2 = Hashtables.gethash_without_values(id2, sparse, v_default);
                            if (kb_compare.NIL == id_index.id_index_skip_tombstones_p((SubLObject)kb_compare.$kw86$SKIP) || kb_compare.NIL == id_index.id_index_tombstone_p(nart2)) {
                                if (kb_compare.NIL == kb_intersection_nartP(intersection, nart2)) {
                                    kb_difference_add_nart(difference, nart2);
                                }
                                sofar = Numbers.add(sofar, (SubLObject)kb_compare.ONE_INTEGER);
                                utilities_macros.note_percent_progress(sofar, total);
                            }
                            id2 = Numbers.add(id2, (SubLObject)kb_compare.ONE_INTEGER);
                        }
                    }
                }
            }
            finally {
                final SubLObject _prev_bind_0_$68 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)kb_compare.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    utilities_macros.noting_percent_progress_postamble();
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$68, thread);
                }
            }
        }
        finally {
            utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_4, thread);
            utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_3, thread);
            utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_2, thread);
            utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)kb_compare.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-compare.lisp", position = 29654L)
    public static SubLObject kb_difference_compute_assertions(final SubLObject difference) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject intersection = kb_difference_common_intersection(difference);
        final SubLObject idx = assertion_handles.do_assertions_table();
        final SubLObject mess = (SubLObject)kb_compare.$str154$KB_DIFFERENCE___Examining_asserti;
        final SubLObject total = id_index.id_index_count(idx);
        SubLObject sofar = (SubLObject)kb_compare.ZERO_INTEGER;
        assert kb_compare.NIL != Types.stringp(mess) : mess;
        final SubLObject _prev_bind_0 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
        final SubLObject _prev_bind_2 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
        final SubLObject _prev_bind_3 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
        final SubLObject _prev_bind_4 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
        try {
            utilities_macros.$last_percent_progress_index$.bind((SubLObject)kb_compare.ZERO_INTEGER, thread);
            utilities_macros.$last_percent_progress_prediction$.bind((SubLObject)kb_compare.NIL, thread);
            utilities_macros.$within_noting_percent_progress$.bind((SubLObject)kb_compare.T, thread);
            utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
            try {
                utilities_macros.noting_percent_progress_preamble(mess);
                final SubLObject idx_$69 = idx;
                if (kb_compare.NIL == id_index.id_index_objects_empty_p(idx_$69, (SubLObject)kb_compare.$kw86$SKIP)) {
                    final SubLObject idx_$70 = idx_$69;
                    if (kb_compare.NIL == id_index.id_index_dense_objects_empty_p(idx_$70, (SubLObject)kb_compare.$kw86$SKIP)) {
                        final SubLObject vector_var = id_index.id_index_dense_objects(idx_$70);
                        final SubLObject backwardP_var = (SubLObject)kb_compare.NIL;
                        SubLObject length;
                        SubLObject v_iteration;
                        SubLObject a_id;
                        SubLObject a_handle;
                        SubLObject assertion;
                        for (length = Sequences.length(vector_var), v_iteration = (SubLObject)kb_compare.NIL, v_iteration = (SubLObject)kb_compare.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)kb_compare.ONE_INTEGER)) {
                            a_id = ((kb_compare.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)kb_compare.ONE_INTEGER) : v_iteration);
                            a_handle = Vectors.aref(vector_var, a_id);
                            if (kb_compare.NIL == id_index.id_index_tombstone_p(a_handle) || kb_compare.NIL == id_index.id_index_skip_tombstones_p((SubLObject)kb_compare.$kw86$SKIP)) {
                                if (kb_compare.NIL != id_index.id_index_tombstone_p(a_handle)) {
                                    a_handle = (SubLObject)kb_compare.$kw86$SKIP;
                                }
                                assertion = assertion_handles.resolve_assertion_id_value_pair(a_id, a_handle);
                                if (kb_compare.NIL == kb_intersection_assertionP(intersection, assertion)) {
                                    kb_difference_add_assertion(difference, assertion);
                                }
                                sofar = Numbers.add(sofar, (SubLObject)kb_compare.ONE_INTEGER);
                                utilities_macros.note_percent_progress(sofar, total);
                            }
                        }
                    }
                    final SubLObject idx_$71 = idx_$69;
                    if (kb_compare.NIL == id_index.id_index_sparse_objects_empty_p(idx_$71) || kb_compare.NIL == id_index.id_index_skip_tombstones_p((SubLObject)kb_compare.$kw86$SKIP)) {
                        final SubLObject sparse = id_index.id_index_sparse_objects(idx_$71);
                        SubLObject a_id2 = id_index.id_index_sparse_id_threshold(idx_$71);
                        final SubLObject end_id = id_index.id_index_next_id(idx_$71);
                        final SubLObject v_default = (SubLObject)((kb_compare.NIL != id_index.id_index_skip_tombstones_p((SubLObject)kb_compare.$kw86$SKIP)) ? kb_compare.NIL : kb_compare.$kw86$SKIP);
                        while (a_id2.numL(end_id)) {
                            final SubLObject a_handle2 = Hashtables.gethash_without_values(a_id2, sparse, v_default);
                            if (kb_compare.NIL == id_index.id_index_skip_tombstones_p((SubLObject)kb_compare.$kw86$SKIP) || kb_compare.NIL == id_index.id_index_tombstone_p(a_handle2)) {
                                final SubLObject assertion2 = assertion_handles.resolve_assertion_id_value_pair(a_id2, a_handle2);
                                if (kb_compare.NIL == kb_intersection_assertionP(intersection, assertion2)) {
                                    kb_difference_add_assertion(difference, assertion2);
                                }
                                sofar = Numbers.add(sofar, (SubLObject)kb_compare.ONE_INTEGER);
                                utilities_macros.note_percent_progress(sofar, total);
                            }
                            a_id2 = Numbers.add(a_id2, (SubLObject)kb_compare.ONE_INTEGER);
                        }
                    }
                }
            }
            finally {
                final SubLObject _prev_bind_0_$72 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)kb_compare.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    utilities_macros.noting_percent_progress_postamble();
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$72, thread);
                }
            }
        }
        finally {
            utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_4, thread);
            utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_3, thread);
            utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_2, thread);
            utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)kb_compare.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-compare.lisp", position = 29994L)
    public static SubLObject kb_difference_compute_deductions(final SubLObject difference) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject intersection = kb_difference_common_intersection(difference);
        final SubLObject idx = deduction_handles.do_deductions_table();
        final SubLObject mess = (SubLObject)kb_compare.$str155$KB_DIFFERENCE___Examining_deducti;
        final SubLObject total = id_index.id_index_count(idx);
        SubLObject sofar = (SubLObject)kb_compare.ZERO_INTEGER;
        assert kb_compare.NIL != Types.stringp(mess) : mess;
        final SubLObject _prev_bind_0 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
        final SubLObject _prev_bind_2 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
        final SubLObject _prev_bind_3 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
        final SubLObject _prev_bind_4 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
        try {
            utilities_macros.$last_percent_progress_index$.bind((SubLObject)kb_compare.ZERO_INTEGER, thread);
            utilities_macros.$last_percent_progress_prediction$.bind((SubLObject)kb_compare.NIL, thread);
            utilities_macros.$within_noting_percent_progress$.bind((SubLObject)kb_compare.T, thread);
            utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
            try {
                utilities_macros.noting_percent_progress_preamble(mess);
                final SubLObject idx_$73 = idx;
                if (kb_compare.NIL == id_index.id_index_objects_empty_p(idx_$73, (SubLObject)kb_compare.$kw86$SKIP)) {
                    final SubLObject idx_$74 = idx_$73;
                    if (kb_compare.NIL == id_index.id_index_dense_objects_empty_p(idx_$74, (SubLObject)kb_compare.$kw86$SKIP)) {
                        final SubLObject vector_var = id_index.id_index_dense_objects(idx_$74);
                        final SubLObject backwardP_var = (SubLObject)kb_compare.NIL;
                        SubLObject length;
                        SubLObject v_iteration;
                        SubLObject d_id;
                        SubLObject d_handle;
                        SubLObject deduction;
                        for (length = Sequences.length(vector_var), v_iteration = (SubLObject)kb_compare.NIL, v_iteration = (SubLObject)kb_compare.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)kb_compare.ONE_INTEGER)) {
                            d_id = ((kb_compare.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)kb_compare.ONE_INTEGER) : v_iteration);
                            d_handle = Vectors.aref(vector_var, d_id);
                            if (kb_compare.NIL == id_index.id_index_tombstone_p(d_handle) || kb_compare.NIL == id_index.id_index_skip_tombstones_p((SubLObject)kb_compare.$kw86$SKIP)) {
                                if (kb_compare.NIL != id_index.id_index_tombstone_p(d_handle)) {
                                    d_handle = (SubLObject)kb_compare.$kw86$SKIP;
                                }
                                deduction = deduction_handles.resolve_deduction_id_value_pair(d_id, d_handle);
                                if (kb_compare.NIL == kb_intersection_deductionP(intersection, deduction)) {
                                    kb_difference_add_deduction(difference, deduction);
                                }
                                sofar = Numbers.add(sofar, (SubLObject)kb_compare.ONE_INTEGER);
                                utilities_macros.note_percent_progress(sofar, total);
                            }
                        }
                    }
                    final SubLObject idx_$75 = idx_$73;
                    if (kb_compare.NIL == id_index.id_index_sparse_objects_empty_p(idx_$75) || kb_compare.NIL == id_index.id_index_skip_tombstones_p((SubLObject)kb_compare.$kw86$SKIP)) {
                        final SubLObject sparse = id_index.id_index_sparse_objects(idx_$75);
                        SubLObject d_id2 = id_index.id_index_sparse_id_threshold(idx_$75);
                        final SubLObject end_id = id_index.id_index_next_id(idx_$75);
                        final SubLObject v_default = (SubLObject)((kb_compare.NIL != id_index.id_index_skip_tombstones_p((SubLObject)kb_compare.$kw86$SKIP)) ? kb_compare.NIL : kb_compare.$kw86$SKIP);
                        while (d_id2.numL(end_id)) {
                            final SubLObject d_handle2 = Hashtables.gethash_without_values(d_id2, sparse, v_default);
                            if (kb_compare.NIL == id_index.id_index_skip_tombstones_p((SubLObject)kb_compare.$kw86$SKIP) || kb_compare.NIL == id_index.id_index_tombstone_p(d_handle2)) {
                                final SubLObject deduction2 = deduction_handles.resolve_deduction_id_value_pair(d_id2, d_handle2);
                                if (kb_compare.NIL == kb_intersection_deductionP(intersection, deduction2)) {
                                    kb_difference_add_deduction(difference, deduction2);
                                }
                                sofar = Numbers.add(sofar, (SubLObject)kb_compare.ONE_INTEGER);
                                utilities_macros.note_percent_progress(sofar, total);
                            }
                            d_id2 = Numbers.add(d_id2, (SubLObject)kb_compare.ONE_INTEGER);
                        }
                    }
                }
            }
            finally {
                final SubLObject _prev_bind_0_$76 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)kb_compare.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    utilities_macros.noting_percent_progress_postamble();
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$76, thread);
                }
            }
        }
        finally {
            utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_4, thread);
            utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_3, thread);
            utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_2, thread);
            utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)kb_compare.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-compare.lisp", position = 30334L)
    public static SubLObject compute_remote_image_kb_intersection(final SubLObject machine, final SubLObject port, SubLObject protocol) {
        if (protocol == kb_compare.UNPROVIDED) {
            protocol = (SubLObject)kb_compare.$kw11$CFASL;
        }
        final SubLObject v_remote_image = remote_image.new_remote_image(machine, port, protocol);
        final SubLObject intersection = kb_intersection_compute(new_kb_intersection(v_remote_image));
        return intersection;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-compare.lisp", position = 30912L)
    public static SubLObject compute_remote_image_kb_difference(final SubLObject machine, final SubLObject port, SubLObject protocol) {
        if (protocol == kb_compare.UNPROVIDED) {
            protocol = (SubLObject)kb_compare.$kw11$CFASL;
        }
        final SubLObject intersection = compute_remote_image_kb_intersection(machine, port, protocol);
        final SubLObject difference = kb_difference_compute(new_kb_difference(intersection));
        return difference;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-compare.lisp", position = 31319L)
    public static SubLObject show_kb_difference(final SubLObject difference, SubLObject stream) {
        if (stream == kb_compare.UNPROVIDED) {
            stream = StreamsLow.$standard_output$.getDynamicValue();
        }
        final SubLObject renamed_constants = kb_difference_all_renamed_constants(difference);
        final SubLObject constants = kb_difference_all_constants(difference);
        final SubLObject narts = kb_difference_all_narts(difference);
        final SubLObject assertions = kb_difference_all_assertions(difference);
        final SubLObject deductions = kb_difference_all_deductions(difference);
        if (kb_compare.NIL == renamed_constants && kb_compare.NIL == constants && kb_compare.NIL == narts && kb_compare.NIL == assertions && kb_compare.NIL == deductions) {
            PrintLow.format(stream, (SubLObject)kb_compare.$str156$___No_Difference___);
        }
        else {
            if (kb_compare.NIL != renamed_constants) {
                PrintLow.format(stream, (SubLObject)kb_compare.$str157$___Renamed_Constants____);
                SubLObject cdolist_list_var = renamed_constants;
                SubLObject constant = (SubLObject)kb_compare.NIL;
                constant = cdolist_list_var.first();
                while (kb_compare.NIL != cdolist_list_var) {
                    final SubLObject remote_name = kb_difference_constant_remote_name(difference, constant);
                    PrintLow.format(stream, (SubLObject)kb_compare.$str158$_S_renamed_to__S__, constant, remote_name);
                    cdolist_list_var = cdolist_list_var.rest();
                    constant = cdolist_list_var.first();
                }
                streams_high.terpri(stream);
            }
            if (kb_compare.NIL != constants) {
                PrintLow.format(stream, (SubLObject)kb_compare.$str159$___Constants____);
                SubLObject cdolist_list_var = constants;
                SubLObject constant = (SubLObject)kb_compare.NIL;
                constant = cdolist_list_var.first();
                while (kb_compare.NIL != cdolist_list_var) {
                    PrintLow.format(stream, (SubLObject)kb_compare.$str160$_S__, constant);
                    cdolist_list_var = cdolist_list_var.rest();
                    constant = cdolist_list_var.first();
                }
                streams_high.terpri(stream);
            }
            if (kb_compare.NIL != narts) {
                PrintLow.format(stream, (SubLObject)kb_compare.$str161$___Narts____);
                SubLObject cdolist_list_var = narts;
                SubLObject nart = (SubLObject)kb_compare.NIL;
                nart = cdolist_list_var.first();
                while (kb_compare.NIL != cdolist_list_var) {
                    PrintLow.format(stream, (SubLObject)kb_compare.$str160$_S__, nart);
                    cdolist_list_var = cdolist_list_var.rest();
                    nart = cdolist_list_var.first();
                }
                streams_high.terpri(stream);
            }
            if (kb_compare.NIL != assertions) {
                PrintLow.format(stream, (SubLObject)kb_compare.$str162$___Assertions____);
                SubLObject cdolist_list_var = assertions;
                SubLObject assertion = (SubLObject)kb_compare.NIL;
                assertion = cdolist_list_var.first();
                while (kb_compare.NIL != cdolist_list_var) {
                    PrintLow.format(stream, (SubLObject)kb_compare.$str160$_S__, assertion);
                    cdolist_list_var = cdolist_list_var.rest();
                    assertion = cdolist_list_var.first();
                }
                streams_high.terpri(stream);
            }
            if (kb_compare.NIL != deductions) {
                PrintLow.format(stream, (SubLObject)kb_compare.$str163$___Deductions____);
                SubLObject cdolist_list_var = deductions;
                SubLObject deduction = (SubLObject)kb_compare.NIL;
                deduction = cdolist_list_var.first();
                while (kb_compare.NIL != cdolist_list_var) {
                    final SubLObject supported_object = deductions_high.deduction_supported_object(deduction);
                    PrintLow.format(stream, (SubLObject)kb_compare.$str164$_S__supports___, supported_object);
                    SubLObject cdolist_list_var_$77 = deductions_high.deduction_supports(deduction);
                    SubLObject support = (SubLObject)kb_compare.NIL;
                    support = cdolist_list_var_$77.first();
                    while (kb_compare.NIL != cdolist_list_var_$77) {
                        PrintLow.format(stream, (SubLObject)kb_compare.$str160$_S__, support);
                        cdolist_list_var_$77 = cdolist_list_var_$77.rest();
                        support = cdolist_list_var_$77.first();
                    }
                    streams_high.terpri(stream);
                    cdolist_list_var = cdolist_list_var.rest();
                    deduction = cdolist_list_var.first();
                }
            }
        }
        return difference;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-compare.lisp", position = 33036L)
    public static SubLObject compute_remote_image_old_constants_congruentP() {
        final SubLObject old_constant_count = constant_handles.old_constant_count();
        return remote_image.current_remote_image_connection_eval((SubLObject)ConsesLow.listS((SubLObject)kb_compare.$sym165$_, old_constant_count, (SubLObject)kb_compare.$list166));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-compare.lisp", position = 33430L)
    public static SubLObject compute_missing_old_constant_remote_ids() {
        return remote_image.current_remote_image_connection_eval((SubLObject)kb_compare.$list167);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-compare.lisp", position = 33576L)
    public static SubLObject compute_constant_remote_id(final SubLObject constant) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject error = (SubLObject)kb_compare.NIL;
        SubLObject result = (SubLObject)kb_compare.NIL;
        try {
            thread.throwStack.push(subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind((SubLObject)kb_compare.$sym168$CATCH_ERROR_MESSAGE_HANDLER, thread);
                try {
                    result = remote_image.current_remote_image_connection_eval((SubLObject)ConsesLow.list((SubLObject)kb_compare.$sym169$CONSTANT_INTERNAL_ID_FROM_EXTERNAL_ID, (SubLObject)ConsesLow.list((SubLObject)kb_compare.$sym16$QUOTE, constants_high.constant_external_id(constant))));
                }
                catch (Throwable catch_var) {
                    Errors.handleThrowable(catch_var, (SubLObject)kb_compare.NIL);
                }
            }
            finally {
                Errors.$error_handler$.rebind(_prev_bind_0, thread);
            }
        }
        catch (Throwable ccatch_env_var) {
            error = Errors.handleThrowable(ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
        }
        finally {
            thread.throwStack.pop();
        }
        if (error.isString()) {
            Errors.error((SubLObject)kb_compare.$str170$Could_not_compute_remote_ID_for__, constant, error);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-compare.lisp", position = 33987L)
    public static SubLObject compute_constant_remote_name(final SubLObject remote_id) {
        return remote_image.current_remote_image_connection_eval((SubLObject)ConsesLow.list((SubLObject)kb_compare.$sym171$CONSTANT_NAME_FROM_INTERNAL_ID, remote_id));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-compare.lisp", position = 34139L)
    public static SubLObject compute_remote_image_old_narts_congruentP() {
        final SubLObject old_nart_count = nart_handles.old_nart_count();
        return remote_image.current_remote_image_connection_eval((SubLObject)ConsesLow.listS((SubLObject)kb_compare.$sym165$_, old_nart_count, (SubLObject)kb_compare.$list172));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-compare.lisp", position = 34388L)
    public static SubLObject compute_missing_old_nart_remote_ids() {
        return remote_image.current_remote_image_connection_eval((SubLObject)kb_compare.$list173);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-compare.lisp", position = 34517L)
    public static SubLObject compute_nart_remote_id(final SubLObject nart) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject error = (SubLObject)kb_compare.NIL;
        SubLObject result = (SubLObject)kb_compare.NIL;
        try {
            thread.throwStack.push(subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind((SubLObject)kb_compare.$sym168$CATCH_ERROR_MESSAGE_HANDLER, thread);
                try {
                    result = remote_image.current_remote_image_connection_eval((SubLObject)ConsesLow.list((SubLObject)kb_compare.$sym174$NART_ID_FROM_RECIPE, (SubLObject)ConsesLow.list((SubLObject)kb_compare.$sym16$QUOTE, narts_high.nart_hl_formula(nart))));
                }
                catch (Throwable catch_var) {
                    Errors.handleThrowable(catch_var, (SubLObject)kb_compare.NIL);
                }
            }
            finally {
                Errors.$error_handler$.rebind(_prev_bind_0, thread);
            }
        }
        catch (Throwable ccatch_env_var) {
            error = Errors.handleThrowable(ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
        }
        finally {
            thread.throwStack.pop();
        }
        if (error.isString()) {
            Errors.error((SubLObject)kb_compare.$str170$Could_not_compute_remote_ID_for__, nart, error);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-compare.lisp", position = 35008L)
    public static SubLObject compute_remote_image_old_assertions_congruentP() {
        final SubLObject old_assertion_count = assertion_handles.old_assertion_count();
        return remote_image.current_remote_image_connection_eval((SubLObject)ConsesLow.listS((SubLObject)kb_compare.$sym165$_, old_assertion_count, (SubLObject)kb_compare.$list175));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-compare.lisp", position = 35287L)
    public static SubLObject compute_missing_old_assertion_remote_ids() {
        return remote_image.current_remote_image_connection_eval((SubLObject)kb_compare.$list176);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-compare.lisp", position = 35426L)
    public static SubLObject compute_assertion_remote_id(final SubLObject assertion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject error = (SubLObject)kb_compare.NIL;
        SubLObject result = (SubLObject)kb_compare.NIL;
        try {
            thread.throwStack.push(subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind((SubLObject)kb_compare.$sym168$CATCH_ERROR_MESSAGE_HANDLER, thread);
                try {
                    result = remote_image.current_remote_image_connection_eval((SubLObject)ConsesLow.list((SubLObject)kb_compare.$sym177$ASSERTION_ID_FROM_RECIPE, (SubLObject)ConsesLow.list((SubLObject)kb_compare.$sym16$QUOTE, assertions_high.assertion_cnf(assertion)), (SubLObject)ConsesLow.list((SubLObject)kb_compare.$sym16$QUOTE, assertions_high.assertion_mt(assertion))));
                }
                catch (Throwable catch_var) {
                    Errors.handleThrowable(catch_var, (SubLObject)kb_compare.NIL);
                }
            }
            finally {
                Errors.$error_handler$.rebind(_prev_bind_0, thread);
            }
        }
        catch (Throwable ccatch_env_var) {
            error = Errors.handleThrowable(ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
        }
        finally {
            thread.throwStack.pop();
        }
        if (error.isString()) {
            Errors.error((SubLObject)kb_compare.$str170$Could_not_compute_remote_ID_for__, assertion, error);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-compare.lisp", position = 35983L)
    public static SubLObject compute_remote_image_old_deductions_congruentP() {
        final SubLObject old_deduction_count = deduction_handles.old_deduction_count();
        return remote_image.current_remote_image_connection_eval((SubLObject)ConsesLow.listS((SubLObject)kb_compare.$sym165$_, old_deduction_count, (SubLObject)kb_compare.$list178));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-compare.lisp", position = 36261L)
    public static SubLObject compute_missing_old_deduction_remote_ids() {
        return remote_image.current_remote_image_connection_eval((SubLObject)kb_compare.$list179);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-compare.lisp", position = 36400L)
    public static SubLObject compute_deduction_remote_id(final SubLObject deduction) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject error = (SubLObject)kb_compare.NIL;
        SubLObject result = (SubLObject)kb_compare.NIL;
        try {
            thread.throwStack.push(subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind((SubLObject)kb_compare.$sym168$CATCH_ERROR_MESSAGE_HANDLER, thread);
                try {
                    result = remote_image.current_remote_image_connection_eval((SubLObject)ConsesLow.list((SubLObject)kb_compare.$sym180$DEDUCTION_ID_FROM_RECIPE, list_utilities.quotify(deductions_high.deduction_supported_object(deduction)), (SubLObject)ConsesLow.list((SubLObject)kb_compare.$sym16$QUOTE, deductions_high.deduction_supports(deduction)), arguments.argument_truth(deduction)));
                }
                catch (Throwable catch_var) {
                    Errors.handleThrowable(catch_var, (SubLObject)kb_compare.NIL);
                }
            }
            finally {
                Errors.$error_handler$.rebind(_prev_bind_0, thread);
            }
        }
        catch (Throwable ccatch_env_var) {
            error = Errors.handleThrowable(ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
        }
        finally {
            thread.throwStack.pop();
        }
        if (error.isString()) {
            Errors.error((SubLObject)kb_compare.$str170$Could_not_compute_remote_ID_for__, deduction, error);
        }
        return result;
    }
    
    public static SubLObject declare_kb_compare_file() {
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.kb_compare", "with_new_kb_compare_connection", "WITH-NEW-KB-COMPARE-CONNECTION");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_compare", "set_kb_compare_connection_common_symbols", "SET-KB-COMPARE-CONNECTION-COMMON-SYMBOLS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_compare", "kb_intersection_print_function_trampoline", "KB-INTERSECTION-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_compare", "kb_intersection_p", "KB-INTERSECTION-P", 1, 0, false);
        new $kb_intersection_p$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_compare", "kb_intrsct_remote_image", "KB-INTRSCT-REMOTE-IMAGE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_compare", "kb_intrsct_constant_index", "KB-INTRSCT-CONSTANT-INDEX", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_compare", "kb_intrsct_nart_index", "KB-INTRSCT-NART-INDEX", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_compare", "kb_intrsct_assertion_index", "KB-INTRSCT-ASSERTION-INDEX", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_compare", "kb_intrsct_deduction_index", "KB-INTRSCT-DEDUCTION-INDEX", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_compare", "_csetf_kb_intrsct_remote_image", "_CSETF-KB-INTRSCT-REMOTE-IMAGE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_compare", "_csetf_kb_intrsct_constant_index", "_CSETF-KB-INTRSCT-CONSTANT-INDEX", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_compare", "_csetf_kb_intrsct_nart_index", "_CSETF-KB-INTRSCT-NART-INDEX", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_compare", "_csetf_kb_intrsct_assertion_index", "_CSETF-KB-INTRSCT-ASSERTION-INDEX", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_compare", "_csetf_kb_intrsct_deduction_index", "_CSETF-KB-INTRSCT-DEDUCTION-INDEX", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_compare", "make_kb_intersection", "MAKE-KB-INTERSECTION", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_compare", "visit_defstruct_kb_intersection", "VISIT-DEFSTRUCT-KB-INTERSECTION", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_compare", "visit_defstruct_object_kb_intersection_method", "VISIT-DEFSTRUCT-OBJECT-KB-INTERSECTION-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_compare", "print_kb_intersection", "PRINT-KB-INTERSECTION", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_compare", "new_kb_intersection", "NEW-KB-INTERSECTION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_compare", "destroy_kb_intersection", "DESTROY-KB-INTERSECTION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_compare", "kb_intersection_remote_image", "KB-INTERSECTION-REMOTE-IMAGE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_compare", "kb_intersection_constant_index", "KB-INTERSECTION-CONSTANT-INDEX", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_compare", "kb_intersection_add_constant", "KB-INTERSECTION-ADD-CONSTANT", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_compare", "kb_intersection_add_nart", "KB-INTERSECTION-ADD-NART", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_compare", "kb_intersection_add_assertion", "KB-INTERSECTION-ADD-ASSERTION", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_compare", "kb_intersection_add_deduction", "KB-INTERSECTION-ADD-DEDUCTION", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_compare", "kb_intersection_remote_image_machine", "KB-INTERSECTION-REMOTE-IMAGE-MACHINE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_compare", "kb_intersection_remote_image_port", "KB-INTERSECTION-REMOTE-IMAGE-PORT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_compare", "kb_intersection_remote_image_protocol", "KB-INTERSECTION-REMOTE-IMAGE-PROTOCOL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_compare", "kb_intersection_constantP", "KB-INTERSECTION-CONSTANT?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_compare", "kb_intersection_constant_remote_id", "KB-INTERSECTION-CONSTANT-REMOTE-ID", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_compare", "kb_intersection_nartP", "KB-INTERSECTION-NART?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_compare", "kb_intersection_nart_remote_id", "KB-INTERSECTION-NART-REMOTE-ID", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_compare", "kb_intersection_assertionP", "KB-INTERSECTION-ASSERTION?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_compare", "kb_intersection_assertion_remote_id", "KB-INTERSECTION-ASSERTION-REMOTE-ID", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_compare", "kb_intersection_deductionP", "KB-INTERSECTION-DEDUCTION?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_compare", "kb_intersection_deduction_remote_id", "KB-INTERSECTION-DEDUCTION-REMOTE-ID", 2, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.kb_compare", "do_kb_intersection_constants", "DO-KB-INTERSECTION-CONSTANTS");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_compare", "kb_intersection_nart_impossibleP", "KB-INTERSECTION-NART-IMPOSSIBLE?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_compare", "kb_intersection_nart_impossible_int", "KB-INTERSECTION-NART-IMPOSSIBLE-INT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_compare", "kb_intersection_assertion_impossibleP", "KB-INTERSECTION-ASSERTION-IMPOSSIBLE?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_compare", "kb_intersection_assertion_impossible_int", "KB-INTERSECTION-ASSERTION-IMPOSSIBLE-INT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_compare", "kb_intersection_deduction_impossibleP", "KB-INTERSECTION-DEDUCTION-IMPOSSIBLE?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_compare", "kb_intersection_deduction_impossible_int", "KB-INTERSECTION-DEDUCTION-IMPOSSIBLE-INT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_compare", "save_kb_intersection_information_to_file", "SAVE-KB-INTERSECTION-INFORMATION-TO-FILE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_compare", "load_kb_intersection_information_from_file", "LOAD-KB-INTERSECTION-INFORMATION-FROM-FILE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_compare", "save_kb_intersection_information", "SAVE-KB-INTERSECTION-INFORMATION", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_compare", "load_kb_intersection_information", "LOAD-KB-INTERSECTION-INFORMATION", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_compare", "save_kb_intersection_id_index", "SAVE-KB-INTERSECTION-ID-INDEX", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_compare", "load_kb_intersection_id_index", "LOAD-KB-INTERSECTION-ID-INDEX", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_compare", "invert_kb_intersection_id_index", "INVERT-KB-INTERSECTION-ID-INDEX", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_compare", "kb_difference_print_function_trampoline", "KB-DIFFERENCE-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_compare", "kb_difference_p", "KB-DIFFERENCE-P", 1, 0, false);
        new $kb_difference_p$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_compare", "kb_diff_common_intersection", "KB-DIFF-COMMON-INTERSECTION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_compare", "kb_diff_renamed_constants", "KB-DIFF-RENAMED-CONSTANTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_compare", "kb_diff_constants", "KB-DIFF-CONSTANTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_compare", "kb_diff_narts", "KB-DIFF-NARTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_compare", "kb_diff_assertions", "KB-DIFF-ASSERTIONS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_compare", "kb_diff_deductions", "KB-DIFF-DEDUCTIONS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_compare", "_csetf_kb_diff_common_intersection", "_CSETF-KB-DIFF-COMMON-INTERSECTION", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_compare", "_csetf_kb_diff_renamed_constants", "_CSETF-KB-DIFF-RENAMED-CONSTANTS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_compare", "_csetf_kb_diff_constants", "_CSETF-KB-DIFF-CONSTANTS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_compare", "_csetf_kb_diff_narts", "_CSETF-KB-DIFF-NARTS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_compare", "_csetf_kb_diff_assertions", "_CSETF-KB-DIFF-ASSERTIONS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_compare", "_csetf_kb_diff_deductions", "_CSETF-KB-DIFF-DEDUCTIONS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_compare", "make_kb_difference", "MAKE-KB-DIFFERENCE", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_compare", "visit_defstruct_kb_difference", "VISIT-DEFSTRUCT-KB-DIFFERENCE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_compare", "visit_defstruct_object_kb_difference_method", "VISIT-DEFSTRUCT-OBJECT-KB-DIFFERENCE-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_compare", "print_kb_difference", "PRINT-KB-DIFFERENCE", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_compare", "new_kb_difference", "NEW-KB-DIFFERENCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_compare", "destroy_kb_difference", "DESTROY-KB-DIFFERENCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_compare", "kb_difference_common_intersection", "KB-DIFFERENCE-COMMON-INTERSECTION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_compare", "kb_difference_renamed_constants", "KB-DIFFERENCE-RENAMED-CONSTANTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_compare", "kb_difference_constants", "KB-DIFFERENCE-CONSTANTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_compare", "kb_difference_narts", "KB-DIFFERENCE-NARTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_compare", "kb_difference_assertions", "KB-DIFFERENCE-ASSERTIONS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_compare", "kb_difference_deductions", "KB-DIFFERENCE-DEDUCTIONS", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.kb_compare", "do_kb_difference_renamed_constants", "DO-KB-DIFFERENCE-RENAMED-CONSTANTS");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.kb_compare", "do_kb_difference_constants", "DO-KB-DIFFERENCE-CONSTANTS");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.kb_compare", "do_kb_difference_narts", "DO-KB-DIFFERENCE-NARTS");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.kb_compare", "do_kb_difference_assertions", "DO-KB-DIFFERENCE-ASSERTIONS");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.kb_compare", "do_kb_difference_deductions", "DO-KB-DIFFERENCE-DEDUCTIONS");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_compare", "kb_difference_add_renamed_constant", "KB-DIFFERENCE-ADD-RENAMED-CONSTANT", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_compare", "kb_difference_add_constant", "KB-DIFFERENCE-ADD-CONSTANT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_compare", "kb_difference_add_nart", "KB-DIFFERENCE-ADD-NART", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_compare", "kb_difference_add_assertion", "KB-DIFFERENCE-ADD-ASSERTION", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_compare", "kb_difference_add_deduction", "KB-DIFFERENCE-ADD-DEDUCTION", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_compare", "kb_difference_remote_image", "KB-DIFFERENCE-REMOTE-IMAGE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_compare", "kb_difference_remote_image_machine", "KB-DIFFERENCE-REMOTE-IMAGE-MACHINE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_compare", "kb_difference_remote_image_port", "KB-DIFFERENCE-REMOTE-IMAGE-PORT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_compare", "kb_difference_remote_image_protocol", "KB-DIFFERENCE-REMOTE-IMAGE-PROTOCOL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_compare", "kb_difference_constant_remote_name", "KB-DIFFERENCE-CONSTANT-REMOTE-NAME", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_compare", "kb_difference_all_renamed_constants", "KB-DIFFERENCE-ALL-RENAMED-CONSTANTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_compare", "kb_difference_all_constants", "KB-DIFFERENCE-ALL-CONSTANTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_compare", "kb_difference_all_narts", "KB-DIFFERENCE-ALL-NARTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_compare", "kb_difference_all_assertions", "KB-DIFFERENCE-ALL-ASSERTIONS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_compare", "kb_difference_all_deductions", "KB-DIFFERENCE-ALL-DEDUCTIONS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_compare", "kb_intersection_compute", "KB-INTERSECTION-COMPUTE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_compare", "kb_intersection_compute_constants", "KB-INTERSECTION-COMPUTE-CONSTANTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_compare", "kb_intersection_compute_congruent_old_constants", "KB-INTERSECTION-COMPUTE-CONGRUENT-OLD-CONSTANTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_compare", "kb_intersection_compute_constant", "KB-INTERSECTION-COMPUTE-CONSTANT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_compare", "kb_intersection_compute_narts", "KB-INTERSECTION-COMPUTE-NARTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_compare", "kb_intersection_compute_congruent_old_narts", "KB-INTERSECTION-COMPUTE-CONGRUENT-OLD-NARTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_compare", "kb_intersection_compute_nart", "KB-INTERSECTION-COMPUTE-NART", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_compare", "kb_intersection_compute_assertions", "KB-INTERSECTION-COMPUTE-ASSERTIONS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_compare", "kb_intersection_compute_congruent_old_assertions", "KB-INTERSECTION-COMPUTE-CONGRUENT-OLD-ASSERTIONS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_compare", "kb_intersection_compute_assertion", "KB-INTERSECTION-COMPUTE-ASSERTION", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_compare", "kb_intersection_compute_deductions", "KB-INTERSECTION-COMPUTE-DEDUCTIONS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_compare", "kb_intersection_compute_congruent_old_deductions", "KB-INTERSECTION-COMPUTE-CONGRUENT-OLD-DEDUCTIONS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_compare", "kb_intersection_compute_deduction", "KB-INTERSECTION-COMPUTE-DEDUCTION", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_compare", "kb_difference_compute", "KB-DIFFERENCE-COMPUTE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_compare", "kb_difference_compute_renamed_constants", "KB-DIFFERENCE-COMPUTE-RENAMED-CONSTANTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_compare", "kb_difference_compute_constants", "KB-DIFFERENCE-COMPUTE-CONSTANTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_compare", "kb_difference_compute_narts", "KB-DIFFERENCE-COMPUTE-NARTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_compare", "kb_difference_compute_assertions", "KB-DIFFERENCE-COMPUTE-ASSERTIONS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_compare", "kb_difference_compute_deductions", "KB-DIFFERENCE-COMPUTE-DEDUCTIONS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_compare", "compute_remote_image_kb_intersection", "COMPUTE-REMOTE-IMAGE-KB-INTERSECTION", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_compare", "compute_remote_image_kb_difference", "COMPUTE-REMOTE-IMAGE-KB-DIFFERENCE", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_compare", "show_kb_difference", "SHOW-KB-DIFFERENCE", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_compare", "compute_remote_image_old_constants_congruentP", "COMPUTE-REMOTE-IMAGE-OLD-CONSTANTS-CONGRUENT?", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_compare", "compute_missing_old_constant_remote_ids", "COMPUTE-MISSING-OLD-CONSTANT-REMOTE-IDS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_compare", "compute_constant_remote_id", "COMPUTE-CONSTANT-REMOTE-ID", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_compare", "compute_constant_remote_name", "COMPUTE-CONSTANT-REMOTE-NAME", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_compare", "compute_remote_image_old_narts_congruentP", "COMPUTE-REMOTE-IMAGE-OLD-NARTS-CONGRUENT?", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_compare", "compute_missing_old_nart_remote_ids", "COMPUTE-MISSING-OLD-NART-REMOTE-IDS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_compare", "compute_nart_remote_id", "COMPUTE-NART-REMOTE-ID", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_compare", "compute_remote_image_old_assertions_congruentP", "COMPUTE-REMOTE-IMAGE-OLD-ASSERTIONS-CONGRUENT?", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_compare", "compute_missing_old_assertion_remote_ids", "COMPUTE-MISSING-OLD-ASSERTION-REMOTE-IDS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_compare", "compute_assertion_remote_id", "COMPUTE-ASSERTION-REMOTE-ID", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_compare", "compute_remote_image_old_deductions_congruentP", "COMPUTE-REMOTE-IMAGE-OLD-DEDUCTIONS-CONGRUENT?", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_compare", "compute_missing_old_deduction_remote_ids", "COMPUTE-MISSING-OLD-DEDUCTION-REMOTE-IDS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_compare", "compute_deduction_remote_id", "COMPUTE-DEDUCTION-REMOTE-ID", 1, 0, false);
        return (SubLObject)kb_compare.NIL;
    }
    
    public static SubLObject init_kb_compare_file() {
        kb_compare.$kb_compare_common_symbols$ = SubLFiles.defparameter("*KB-COMPARE-COMMON-SYMBOLS*", ConsesLow.append((SubLObject)kb_compare.$list0, (SubLObject)kb_compare.$list1, ConsesLow.append(enumeration_types.valid_truths(), enumeration_types.valid_hl_truth_values(), hl_supports.hl_support_modules())));
        kb_compare.$dtp_kb_intersection$ = SubLFiles.defconstant("*DTP-KB-INTERSECTION*", (SubLObject)kb_compare.$sym18$KB_INTERSECTION);
        kb_compare.$kb_intersection$ = SubLFiles.defparameter("*KB-INTERSECTION*", (SubLObject)kb_compare.NIL);
        kb_compare.$dtp_kb_difference$ = SubLFiles.defconstant("*DTP-KB-DIFFERENCE*", (SubLObject)kb_compare.$sym88$KB_DIFFERENCE);
        return (SubLObject)kb_compare.NIL;
    }
    
    public static SubLObject setup_kb_compare_file() {
        access_macros.register_macro_helper((SubLObject)kb_compare.$sym9$SET_KB_COMPARE_CONNECTION_COMMON_SYMBOLS, (SubLObject)kb_compare.$sym10$WITH_NEW_KB_COMPARE_CONNECTION);
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), kb_compare.$dtp_kb_intersection$.getGlobalValue(), Symbols.symbol_function((SubLObject)kb_compare.$sym25$KB_INTERSECTION_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)kb_compare.$list26);
        Structures.def_csetf((SubLObject)kb_compare.$sym27$KB_INTRSCT_REMOTE_IMAGE, (SubLObject)kb_compare.$sym28$_CSETF_KB_INTRSCT_REMOTE_IMAGE);
        Structures.def_csetf((SubLObject)kb_compare.$sym29$KB_INTRSCT_CONSTANT_INDEX, (SubLObject)kb_compare.$sym30$_CSETF_KB_INTRSCT_CONSTANT_INDEX);
        Structures.def_csetf((SubLObject)kb_compare.$sym31$KB_INTRSCT_NART_INDEX, (SubLObject)kb_compare.$sym32$_CSETF_KB_INTRSCT_NART_INDEX);
        Structures.def_csetf((SubLObject)kb_compare.$sym33$KB_INTRSCT_ASSERTION_INDEX, (SubLObject)kb_compare.$sym34$_CSETF_KB_INTRSCT_ASSERTION_INDEX);
        Structures.def_csetf((SubLObject)kb_compare.$sym35$KB_INTRSCT_DEDUCTION_INDEX, (SubLObject)kb_compare.$sym36$_CSETF_KB_INTRSCT_DEDUCTION_INDEX);
        Equality.identity((SubLObject)kb_compare.$sym18$KB_INTERSECTION);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), kb_compare.$dtp_kb_intersection$.getGlobalValue(), Symbols.symbol_function((SubLObject)kb_compare.$sym47$VISIT_DEFSTRUCT_OBJECT_KB_INTERSECTION_METHOD));
        access_macros.register_macro_helper((SubLObject)kb_compare.$sym50$KB_INTERSECTION_CONSTANT_INDEX, (SubLObject)kb_compare.$sym51$DO_KB_INTERSECTION_CONSTANTS);
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), kb_compare.$dtp_kb_difference$.getGlobalValue(), Symbols.symbol_function((SubLObject)kb_compare.$sym95$KB_DIFFERENCE_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)kb_compare.$list96);
        Structures.def_csetf((SubLObject)kb_compare.$sym97$KB_DIFF_COMMON_INTERSECTION, (SubLObject)kb_compare.$sym98$_CSETF_KB_DIFF_COMMON_INTERSECTION);
        Structures.def_csetf((SubLObject)kb_compare.$sym99$KB_DIFF_RENAMED_CONSTANTS, (SubLObject)kb_compare.$sym100$_CSETF_KB_DIFF_RENAMED_CONSTANTS);
        Structures.def_csetf((SubLObject)kb_compare.$sym101$KB_DIFF_CONSTANTS, (SubLObject)kb_compare.$sym102$_CSETF_KB_DIFF_CONSTANTS);
        Structures.def_csetf((SubLObject)kb_compare.$sym103$KB_DIFF_NARTS, (SubLObject)kb_compare.$sym104$_CSETF_KB_DIFF_NARTS);
        Structures.def_csetf((SubLObject)kb_compare.$sym105$KB_DIFF_ASSERTIONS, (SubLObject)kb_compare.$sym106$_CSETF_KB_DIFF_ASSERTIONS);
        Structures.def_csetf((SubLObject)kb_compare.$sym107$KB_DIFF_DEDUCTIONS, (SubLObject)kb_compare.$sym108$_CSETF_KB_DIFF_DEDUCTIONS);
        Equality.identity((SubLObject)kb_compare.$sym88$KB_DIFFERENCE);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), kb_compare.$dtp_kb_difference$.getGlobalValue(), Symbols.symbol_function((SubLObject)kb_compare.$sym112$VISIT_DEFSTRUCT_OBJECT_KB_DIFFERENCE_METHOD));
        access_macros.register_macro_helper((SubLObject)kb_compare.$sym114$KB_DIFFERENCE_RENAMED_CONSTANTS, (SubLObject)kb_compare.$sym115$DO_KB_DIFFERENCE_RENAMED_CONSTANTS);
        access_macros.register_macro_helper((SubLObject)kb_compare.$sym116$KB_DIFFERENCE_CONSTANTS, (SubLObject)kb_compare.$sym117$DO_KB_DIFFERENCE_CONSTANTS);
        access_macros.register_macro_helper((SubLObject)kb_compare.$sym118$KB_DIFFERENCE_NARTS, (SubLObject)kb_compare.$sym119$DO_KB_DIFFERENCE_NARTS);
        access_macros.register_macro_helper((SubLObject)kb_compare.$sym120$KB_DIFFERENCE_ASSERTIONS, (SubLObject)kb_compare.$sym121$DO_KB_DIFFERENCE_ASSERTIONS);
        access_macros.register_macro_helper((SubLObject)kb_compare.$sym122$KB_DIFFERENCE_DEDUCTIONS, (SubLObject)kb_compare.$sym123$DO_KB_DIFFERENCE_DEDUCTIONS);
        return (SubLObject)kb_compare.NIL;
    }
    
    @Override
	public void declareFunctions() {
        declare_kb_compare_file();
    }
    
    @Override
	public void initializeVariables() {
        init_kb_compare_file();
    }
    
    @Override
	public void runTopLevelForms() {
        setup_kb_compare_file();
    }
    
    static {
        me = (SubLFile)new kb_compare();
        kb_compare.$kb_compare_common_symbols$ = null;
        kb_compare.$dtp_kb_intersection$ = null;
        kb_compare.$kb_intersection$ = null;
        kb_compare.$dtp_kb_difference$ = null;
        $list0 = ConsesLow.list((SubLObject)kb_compare.T);
        $list1 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ASSERTION-ID-FROM-RECIPE"), (SubLObject)SubLObjectFactory.makeSymbol("DEDUCTION-ID-FROM-RECIPE"), (SubLObject)SubLObjectFactory.makeSymbol("CONSTANT-INTERNAL-ID-FROM-EXTERNAL-ID"), (SubLObject)SubLObjectFactory.makeSymbol("CONSTANT-NAME-FROM-INTERNAL-ID"), (SubLObject)SubLObjectFactory.makeSymbol("NART-ID-FROM-RECIPE"));
        $list2 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("REMOTE-IMAGE"), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym3$WITH_NEW_REMOTE_IMAGE_CONNECTION = SubLObjectFactory.makeSymbol("WITH-NEW-REMOTE-IMAGE-CONNECTION");
        $sym4$CLET = SubLObjectFactory.makeSymbol("CLET");
        $list5 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*KB-COMPARE-COMMON-SYMBOLS*"), (SubLObject)SubLObjectFactory.makeSymbol("*KB-COMPARE-COMMON-SYMBOLS*")));
        $list6 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SET-KB-COMPARE-CONNECTION-COMMON-SYMBOLS"));
        $sym7$WITH_CFASL_COMMON_SYMBOLS = SubLObjectFactory.makeSymbol("WITH-CFASL-COMMON-SYMBOLS");
        $sym8$_KB_COMPARE_COMMON_SYMBOLS_ = SubLObjectFactory.makeSymbol("*KB-COMPARE-COMMON-SYMBOLS*");
        $sym9$SET_KB_COMPARE_CONNECTION_COMMON_SYMBOLS = SubLObjectFactory.makeSymbol("SET-KB-COMPARE-CONNECTION-COMMON-SYMBOLS");
        $sym10$WITH_NEW_KB_COMPARE_CONNECTION = SubLObjectFactory.makeSymbol("WITH-NEW-KB-COMPARE-CONNECTION");
        $kw11$CFASL = SubLObjectFactory.makeKeyword("CFASL");
        $kw12$IGNORE_ERRORS_TARGET = SubLObjectFactory.makeKeyword("IGNORE-ERRORS-TARGET");
        $sym13$IGNORE_ERRORS_HANDLER = SubLObjectFactory.makeSymbol("IGNORE-ERRORS-HANDLER", "SUBLISP");
        $sym14$PROGN = SubLObjectFactory.makeSymbol("PROGN");
        $sym15$CFASL_SET_COMMON_SYMBOLS = SubLObjectFactory.makeSymbol("CFASL-SET-COMMON-SYMBOLS");
        $sym16$QUOTE = SubLObjectFactory.makeSymbol("QUOTE");
        $list17 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ERROR"), (SubLObject)SubLObjectFactory.makeString("hack")));
        $sym18$KB_INTERSECTION = SubLObjectFactory.makeSymbol("KB-INTERSECTION");
        $sym19$KB_INTERSECTION_P = SubLObjectFactory.makeSymbol("KB-INTERSECTION-P");
        $list20 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("REMOTE-IMAGE"), (SubLObject)SubLObjectFactory.makeSymbol("CONSTANT-INDEX"), (SubLObject)SubLObjectFactory.makeSymbol("NART-INDEX"), (SubLObject)SubLObjectFactory.makeSymbol("ASSERTION-INDEX"), (SubLObject)SubLObjectFactory.makeSymbol("DEDUCTION-INDEX"));
        $list21 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("REMOTE-IMAGE"), (SubLObject)SubLObjectFactory.makeKeyword("CONSTANT-INDEX"), (SubLObject)SubLObjectFactory.makeKeyword("NART-INDEX"), (SubLObject)SubLObjectFactory.makeKeyword("ASSERTION-INDEX"), (SubLObject)SubLObjectFactory.makeKeyword("DEDUCTION-INDEX"));
        $list22 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("KB-INTRSCT-REMOTE-IMAGE"), (SubLObject)SubLObjectFactory.makeSymbol("KB-INTRSCT-CONSTANT-INDEX"), (SubLObject)SubLObjectFactory.makeSymbol("KB-INTRSCT-NART-INDEX"), (SubLObject)SubLObjectFactory.makeSymbol("KB-INTRSCT-ASSERTION-INDEX"), (SubLObject)SubLObjectFactory.makeSymbol("KB-INTRSCT-DEDUCTION-INDEX"));
        $list23 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("_CSETF-KB-INTRSCT-REMOTE-IMAGE"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-KB-INTRSCT-CONSTANT-INDEX"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-KB-INTRSCT-NART-INDEX"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-KB-INTRSCT-ASSERTION-INDEX"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-KB-INTRSCT-DEDUCTION-INDEX"));
        $sym24$PRINT_KB_INTERSECTION = SubLObjectFactory.makeSymbol("PRINT-KB-INTERSECTION");
        $sym25$KB_INTERSECTION_PRINT_FUNCTION_TRAMPOLINE = SubLObjectFactory.makeSymbol("KB-INTERSECTION-PRINT-FUNCTION-TRAMPOLINE");
        $list26 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("KB-INTERSECTION-P"));
        $sym27$KB_INTRSCT_REMOTE_IMAGE = SubLObjectFactory.makeSymbol("KB-INTRSCT-REMOTE-IMAGE");
        $sym28$_CSETF_KB_INTRSCT_REMOTE_IMAGE = SubLObjectFactory.makeSymbol("_CSETF-KB-INTRSCT-REMOTE-IMAGE");
        $sym29$KB_INTRSCT_CONSTANT_INDEX = SubLObjectFactory.makeSymbol("KB-INTRSCT-CONSTANT-INDEX");
        $sym30$_CSETF_KB_INTRSCT_CONSTANT_INDEX = SubLObjectFactory.makeSymbol("_CSETF-KB-INTRSCT-CONSTANT-INDEX");
        $sym31$KB_INTRSCT_NART_INDEX = SubLObjectFactory.makeSymbol("KB-INTRSCT-NART-INDEX");
        $sym32$_CSETF_KB_INTRSCT_NART_INDEX = SubLObjectFactory.makeSymbol("_CSETF-KB-INTRSCT-NART-INDEX");
        $sym33$KB_INTRSCT_ASSERTION_INDEX = SubLObjectFactory.makeSymbol("KB-INTRSCT-ASSERTION-INDEX");
        $sym34$_CSETF_KB_INTRSCT_ASSERTION_INDEX = SubLObjectFactory.makeSymbol("_CSETF-KB-INTRSCT-ASSERTION-INDEX");
        $sym35$KB_INTRSCT_DEDUCTION_INDEX = SubLObjectFactory.makeSymbol("KB-INTRSCT-DEDUCTION-INDEX");
        $sym36$_CSETF_KB_INTRSCT_DEDUCTION_INDEX = SubLObjectFactory.makeSymbol("_CSETF-KB-INTRSCT-DEDUCTION-INDEX");
        $kw37$REMOTE_IMAGE = SubLObjectFactory.makeKeyword("REMOTE-IMAGE");
        $kw38$CONSTANT_INDEX = SubLObjectFactory.makeKeyword("CONSTANT-INDEX");
        $kw39$NART_INDEX = SubLObjectFactory.makeKeyword("NART-INDEX");
        $kw40$ASSERTION_INDEX = SubLObjectFactory.makeKeyword("ASSERTION-INDEX");
        $kw41$DEDUCTION_INDEX = SubLObjectFactory.makeKeyword("DEDUCTION-INDEX");
        $str42$Invalid_slot__S_for_construction_ = SubLObjectFactory.makeString("Invalid slot ~S for construction function");
        $kw43$BEGIN = SubLObjectFactory.makeKeyword("BEGIN");
        $sym44$MAKE_KB_INTERSECTION = SubLObjectFactory.makeSymbol("MAKE-KB-INTERSECTION");
        $kw45$SLOT = SubLObjectFactory.makeKeyword("SLOT");
        $kw46$END = SubLObjectFactory.makeKeyword("END");
        $sym47$VISIT_DEFSTRUCT_OBJECT_KB_INTERSECTION_METHOD = SubLObjectFactory.makeSymbol("VISIT-DEFSTRUCT-OBJECT-KB-INTERSECTION-METHOD");
        $str48$_KB_INTERSECTION_to__a_ = SubLObjectFactory.makeString("<KB-INTERSECTION to ~a>");
        $kw49$FREE = SubLObjectFactory.makeKeyword("FREE");
        $sym50$KB_INTERSECTION_CONSTANT_INDEX = SubLObjectFactory.makeSymbol("KB-INTERSECTION-CONSTANT-INDEX");
        $sym51$DO_KB_INTERSECTION_CONSTANTS = SubLObjectFactory.makeSymbol("DO-KB-INTERSECTION-CONSTANTS");
        $sym52$CONSTANT_P = SubLObjectFactory.makeSymbol("CONSTANT-P");
        $sym53$NON_NEGATIVE_INTEGER_P = SubLObjectFactory.makeSymbol("NON-NEGATIVE-INTEGER-P");
        $sym54$NART_P = SubLObjectFactory.makeSymbol("NART-P");
        $sym55$ASSERTION_P = SubLObjectFactory.makeSymbol("ASSERTION-P");
        $sym56$DEDUCTION_P = SubLObjectFactory.makeSymbol("DEDUCTION-P");
        $list57 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CONSTANT"), (SubLObject)SubLObjectFactory.makeSymbol("INTERSECTION"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("PROGRESS-MESSAGE")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $list58 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("PROGRESS-MESSAGE"));
        $kw59$ALLOW_OTHER_KEYS = SubLObjectFactory.makeKeyword("ALLOW-OTHER-KEYS");
        $kw60$PROGRESS_MESSAGE = SubLObjectFactory.makeKeyword("PROGRESS-MESSAGE");
        $sym61$INTERNAL_ID = SubLObjectFactory.makeUninternedSymbol("INTERNAL-ID");
        $sym62$REMOTE_ID = SubLObjectFactory.makeUninternedSymbol("REMOTE-ID");
        $sym63$DO_ID_INDEX = SubLObjectFactory.makeSymbol("DO-ID-INDEX");
        $sym64$IGNORE = SubLObjectFactory.makeSymbol("IGNORE");
        $sym65$FIND_CONSTANT_BY_INTERNAL_ID = SubLObjectFactory.makeSymbol("FIND-CONSTANT-BY-INTERNAL-ID");
        $kw66$IMPOSSIBLE = SubLObjectFactory.makeKeyword("IMPOSSIBLE");
        $sym67$KB_INTERSECTION_NART_IMPOSSIBLE_INT = SubLObjectFactory.makeSymbol("KB-INTERSECTION-NART-IMPOSSIBLE-INT");
        $sym68$KB_INTERSECTION_ASSERTION_IMPOSSIBLE_INT = SubLObjectFactory.makeSymbol("KB-INTERSECTION-ASSERTION-IMPOSSIBLE-INT");
        $sym69$KB_INTERSECTION_DEDUCTION_IMPOSSIBLE_INT = SubLObjectFactory.makeSymbol("KB-INTERSECTION-DEDUCTION-IMPOSSIBLE-INT");
        $kw70$OUTPUT = SubLObjectFactory.makeKeyword("OUTPUT");
        $str71$Unable_to_open__S = SubLObjectFactory.makeString("Unable to open ~S");
        $kw72$INPUT = SubLObjectFactory.makeKeyword("INPUT");
        $kw73$CONSTANTS = SubLObjectFactory.makeKeyword("CONSTANTS");
        $str74$Constants = SubLObjectFactory.makeString("Constants");
        $kw75$NARTS = SubLObjectFactory.makeKeyword("NARTS");
        $str76$NARTs = SubLObjectFactory.makeString("NARTs");
        $kw77$ASSERTIONS = SubLObjectFactory.makeKeyword("ASSERTIONS");
        $str78$Assertions = SubLObjectFactory.makeString("Assertions");
        $kw79$DEDUCTIONS = SubLObjectFactory.makeKeyword("DEDUCTIONS");
        $str80$Deductions = SubLObjectFactory.makeString("Deductions");
        $str81$Saving_KB_ = SubLObjectFactory.makeString("Saving KB ");
        $str82$_Intersection_ID_Index_____ = SubLObjectFactory.makeString(" Intersection ID Index ....");
        $str83$Loading_KB_ = SubLObjectFactory.makeString("Loading KB ");
        $str84$Error_in_KB_Intersection_ID_index = SubLObjectFactory.makeString("Error in KB Intersection ID index format ... expected ~A, got ~A.");
        $str85$Expected_a_KB_Intersection_ID_ind = SubLObjectFactory.makeString("Expected a KB Intersection ID index, but got ~A instead.");
        $kw86$SKIP = SubLObjectFactory.makeKeyword("SKIP");
        $str87$This_ID_index_cannot_be_inverted_ = SubLObjectFactory.makeString("This ID index cannot be inverted, ID ~A points to non-ID ~A.");
        $sym88$KB_DIFFERENCE = SubLObjectFactory.makeSymbol("KB-DIFFERENCE");
        $sym89$KB_DIFFERENCE_P = SubLObjectFactory.makeSymbol("KB-DIFFERENCE-P");
        $list90 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("COMMON-INTERSECTION"), (SubLObject)SubLObjectFactory.makeSymbol("RENAMED-CONSTANTS"), (SubLObject)SubLObjectFactory.makeSymbol("CONSTANTS"), (SubLObject)SubLObjectFactory.makeSymbol("NARTS"), (SubLObject)SubLObjectFactory.makeSymbol("ASSERTIONS"), (SubLObject)SubLObjectFactory.makeSymbol("DEDUCTIONS"));
        $list91 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("COMMON-INTERSECTION"), (SubLObject)SubLObjectFactory.makeKeyword("RENAMED-CONSTANTS"), (SubLObject)SubLObjectFactory.makeKeyword("CONSTANTS"), (SubLObject)SubLObjectFactory.makeKeyword("NARTS"), (SubLObject)SubLObjectFactory.makeKeyword("ASSERTIONS"), (SubLObject)SubLObjectFactory.makeKeyword("DEDUCTIONS"));
        $list92 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("KB-DIFF-COMMON-INTERSECTION"), (SubLObject)SubLObjectFactory.makeSymbol("KB-DIFF-RENAMED-CONSTANTS"), (SubLObject)SubLObjectFactory.makeSymbol("KB-DIFF-CONSTANTS"), (SubLObject)SubLObjectFactory.makeSymbol("KB-DIFF-NARTS"), (SubLObject)SubLObjectFactory.makeSymbol("KB-DIFF-ASSERTIONS"), (SubLObject)SubLObjectFactory.makeSymbol("KB-DIFF-DEDUCTIONS"));
        $list93 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("_CSETF-KB-DIFF-COMMON-INTERSECTION"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-KB-DIFF-RENAMED-CONSTANTS"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-KB-DIFF-CONSTANTS"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-KB-DIFF-NARTS"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-KB-DIFF-ASSERTIONS"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-KB-DIFF-DEDUCTIONS"));
        $sym94$PRINT_KB_DIFFERENCE = SubLObjectFactory.makeSymbol("PRINT-KB-DIFFERENCE");
        $sym95$KB_DIFFERENCE_PRINT_FUNCTION_TRAMPOLINE = SubLObjectFactory.makeSymbol("KB-DIFFERENCE-PRINT-FUNCTION-TRAMPOLINE");
        $list96 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("KB-DIFFERENCE-P"));
        $sym97$KB_DIFF_COMMON_INTERSECTION = SubLObjectFactory.makeSymbol("KB-DIFF-COMMON-INTERSECTION");
        $sym98$_CSETF_KB_DIFF_COMMON_INTERSECTION = SubLObjectFactory.makeSymbol("_CSETF-KB-DIFF-COMMON-INTERSECTION");
        $sym99$KB_DIFF_RENAMED_CONSTANTS = SubLObjectFactory.makeSymbol("KB-DIFF-RENAMED-CONSTANTS");
        $sym100$_CSETF_KB_DIFF_RENAMED_CONSTANTS = SubLObjectFactory.makeSymbol("_CSETF-KB-DIFF-RENAMED-CONSTANTS");
        $sym101$KB_DIFF_CONSTANTS = SubLObjectFactory.makeSymbol("KB-DIFF-CONSTANTS");
        $sym102$_CSETF_KB_DIFF_CONSTANTS = SubLObjectFactory.makeSymbol("_CSETF-KB-DIFF-CONSTANTS");
        $sym103$KB_DIFF_NARTS = SubLObjectFactory.makeSymbol("KB-DIFF-NARTS");
        $sym104$_CSETF_KB_DIFF_NARTS = SubLObjectFactory.makeSymbol("_CSETF-KB-DIFF-NARTS");
        $sym105$KB_DIFF_ASSERTIONS = SubLObjectFactory.makeSymbol("KB-DIFF-ASSERTIONS");
        $sym106$_CSETF_KB_DIFF_ASSERTIONS = SubLObjectFactory.makeSymbol("_CSETF-KB-DIFF-ASSERTIONS");
        $sym107$KB_DIFF_DEDUCTIONS = SubLObjectFactory.makeSymbol("KB-DIFF-DEDUCTIONS");
        $sym108$_CSETF_KB_DIFF_DEDUCTIONS = SubLObjectFactory.makeSymbol("_CSETF-KB-DIFF-DEDUCTIONS");
        $kw109$COMMON_INTERSECTION = SubLObjectFactory.makeKeyword("COMMON-INTERSECTION");
        $kw110$RENAMED_CONSTANTS = SubLObjectFactory.makeKeyword("RENAMED-CONSTANTS");
        $sym111$MAKE_KB_DIFFERENCE = SubLObjectFactory.makeSymbol("MAKE-KB-DIFFERENCE");
        $sym112$VISIT_DEFSTRUCT_OBJECT_KB_DIFFERENCE_METHOD = SubLObjectFactory.makeSymbol("VISIT-DEFSTRUCT-OBJECT-KB-DIFFERENCE-METHOD");
        $str113$_KB_DIFFERENCE_using__a_ = SubLObjectFactory.makeString("<KB-DIFFERENCE using ~a>");
        $sym114$KB_DIFFERENCE_RENAMED_CONSTANTS = SubLObjectFactory.makeSymbol("KB-DIFFERENCE-RENAMED-CONSTANTS");
        $sym115$DO_KB_DIFFERENCE_RENAMED_CONSTANTS = SubLObjectFactory.makeSymbol("DO-KB-DIFFERENCE-RENAMED-CONSTANTS");
        $sym116$KB_DIFFERENCE_CONSTANTS = SubLObjectFactory.makeSymbol("KB-DIFFERENCE-CONSTANTS");
        $sym117$DO_KB_DIFFERENCE_CONSTANTS = SubLObjectFactory.makeSymbol("DO-KB-DIFFERENCE-CONSTANTS");
        $sym118$KB_DIFFERENCE_NARTS = SubLObjectFactory.makeSymbol("KB-DIFFERENCE-NARTS");
        $sym119$DO_KB_DIFFERENCE_NARTS = SubLObjectFactory.makeSymbol("DO-KB-DIFFERENCE-NARTS");
        $sym120$KB_DIFFERENCE_ASSERTIONS = SubLObjectFactory.makeSymbol("KB-DIFFERENCE-ASSERTIONS");
        $sym121$DO_KB_DIFFERENCE_ASSERTIONS = SubLObjectFactory.makeSymbol("DO-KB-DIFFERENCE-ASSERTIONS");
        $sym122$KB_DIFFERENCE_DEDUCTIONS = SubLObjectFactory.makeSymbol("KB-DIFFERENCE-DEDUCTIONS");
        $sym123$DO_KB_DIFFERENCE_DEDUCTIONS = SubLObjectFactory.makeSymbol("DO-KB-DIFFERENCE-DEDUCTIONS");
        $list124 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CONSTANT"), (SubLObject)SubLObjectFactory.makeSymbol("REMOTE-NAME"), (SubLObject)SubLObjectFactory.makeSymbol("DIFFERENCE"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("DONE")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $list125 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("DONE"));
        $kw126$DONE = SubLObjectFactory.makeKeyword("DONE");
        $sym127$DO_DICTIONARY = SubLObjectFactory.makeSymbol("DO-DICTIONARY");
        $list128 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CONSTANT"), (SubLObject)SubLObjectFactory.makeSymbol("DIFFERENCE"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("DONE")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym129$DO_SET = SubLObjectFactory.makeSymbol("DO-SET");
        $list130 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NART"), (SubLObject)SubLObjectFactory.makeSymbol("DIFFERENCE"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("DONE")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $list131 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ASSERTION"), (SubLObject)SubLObjectFactory.makeSymbol("DIFFERENCE"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("DONE")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $list132 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEDUCTION"), (SubLObject)SubLObjectFactory.makeSymbol("DIFFERENCE"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("DONE")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym133$STRINGP = SubLObjectFactory.makeSymbol("STRINGP");
        $sym134$_ = SubLObjectFactory.makeSymbol("<");
        $sym135$CONSTANT_INTERNAL_ID = SubLObjectFactory.makeSymbol("CONSTANT-INTERNAL-ID");
        $sym136$NART_ID = SubLObjectFactory.makeSymbol("NART-ID");
        $sym137$DEDUCTION_ID = SubLObjectFactory.makeSymbol("DEDUCTION-ID");
        $str138$KB_Intersection___Examining_new_c = SubLObjectFactory.makeString("KB Intersection : Examining new constants");
        $str139$KB_Intersection___Examining_const = SubLObjectFactory.makeString("KB Intersection : Examining constants");
        $str140$KB_Intersection___Examining_old_c = SubLObjectFactory.makeString("KB Intersection : Examining old constants (congruent)");
        $list141 = ConsesLow.list((SubLObject)SubLObjectFactory.makeUninternedSymbol("START"), (SubLObject)SubLObjectFactory.makeUninternedSymbol("END"), (SubLObject)SubLObjectFactory.makeUninternedSymbol("DELTA"));
        $str142$KB_Intersection___Examining_new_n = SubLObjectFactory.makeString("KB Intersection : Examining new narts");
        $str143$KB_Intersection___Examining_narts = SubLObjectFactory.makeString("KB Intersection : Examining narts");
        $str144$KB_Intersection___Examining_old_n = SubLObjectFactory.makeString("KB Intersection : Examining old narts (congruent)");
        $str145$KB_Intersection___Examining_new_a = SubLObjectFactory.makeString("KB Intersection : Examining new assertions");
        $str146$KB_Intersection___Examining_asser = SubLObjectFactory.makeString("KB Intersection : Examining assertions");
        $str147$KB_Intersection___Examining_old_a = SubLObjectFactory.makeString("KB Intersection : Examining old assertions (congruent)");
        $str148$KB_Intersection___Examining_new_d = SubLObjectFactory.makeString("KB Intersection : Examining new deductions");
        $str149$KB_Intersection___Examining_deduc = SubLObjectFactory.makeString("KB Intersection : Examining deductions");
        $str150$KB_Intersection___Examining_old_d = SubLObjectFactory.makeString("KB Intersection : Examining old deductions (congruent)");
        $str151$KB_DIFFERENCE___Examining_constan = SubLObjectFactory.makeString("KB-DIFFERENCE : Examining constant renames");
        $str152$KB_DIFFERENCE___Examining_constan = SubLObjectFactory.makeString("KB-DIFFERENCE : Examining constants");
        $str153$KB_DIFFERENCE___Examining_narts = SubLObjectFactory.makeString("KB-DIFFERENCE : Examining narts");
        $str154$KB_DIFFERENCE___Examining_asserti = SubLObjectFactory.makeString("KB-DIFFERENCE : Examining assertions");
        $str155$KB_DIFFERENCE___Examining_deducti = SubLObjectFactory.makeString("KB-DIFFERENCE : Examining deductions");
        $str156$___No_Difference___ = SubLObjectFactory.makeString(";; No Difference!~%");
        $str157$___Renamed_Constants____ = SubLObjectFactory.makeString(";; Renamed Constants :~%");
        $str158$_S_renamed_to__S__ = SubLObjectFactory.makeString("~S renamed to ~S~%");
        $str159$___Constants____ = SubLObjectFactory.makeString(";; Constants :~%");
        $str160$_S__ = SubLObjectFactory.makeString("~S~%");
        $str161$___Narts____ = SubLObjectFactory.makeString(";; Narts :~%");
        $str162$___Assertions____ = SubLObjectFactory.makeString(";; Assertions :~%");
        $str163$___Deductions____ = SubLObjectFactory.makeString(";; Deductions :~%");
        $str164$_S__supports___ = SubLObjectFactory.makeString("~S~%supports:~%");
        $sym165$_ = SubLObjectFactory.makeSymbol("=");
        $list166 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OLD-CONSTANT-COUNT")));
        $list167 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MISSING-OLD-CONSTANT-INTERNAL-IDS"));
        $sym168$CATCH_ERROR_MESSAGE_HANDLER = SubLObjectFactory.makeSymbol("CATCH-ERROR-MESSAGE-HANDLER");
        $sym169$CONSTANT_INTERNAL_ID_FROM_EXTERNAL_ID = SubLObjectFactory.makeSymbol("CONSTANT-INTERNAL-ID-FROM-EXTERNAL-ID");
        $str170$Could_not_compute_remote_ID_for__ = SubLObjectFactory.makeString("Could not compute remote ID for ~S.~% ~A~%");
        $sym171$CONSTANT_NAME_FROM_INTERNAL_ID = SubLObjectFactory.makeSymbol("CONSTANT-NAME-FROM-INTERNAL-ID");
        $list172 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OLD-NART-COUNT")));
        $list173 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MISSING-OLD-NART-IDS"));
        $sym174$NART_ID_FROM_RECIPE = SubLObjectFactory.makeSymbol("NART-ID-FROM-RECIPE");
        $list175 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OLD-ASSERTION-COUNT")));
        $list176 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MISSING-OLD-ASSERTION-IDS"));
        $sym177$ASSERTION_ID_FROM_RECIPE = SubLObjectFactory.makeSymbol("ASSERTION-ID-FROM-RECIPE");
        $list178 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OLD-DEDUCTION-COUNT")));
        $list179 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MISSING-OLD-DEDUCTION-IDS"));
        $sym180$DEDUCTION_ID_FROM_RECIPE = SubLObjectFactory.makeSymbol("DEDUCTION-ID-FROM-RECIPE");
    }
    
    public static final class $kb_intersection_native extends SubLStructNative
    {
        public SubLObject $remote_image;
        public SubLObject $constant_index;
        public SubLObject $nart_index;
        public SubLObject $assertion_index;
        public SubLObject $deduction_index;
        private static final SubLStructDeclNative structDecl;
        
        public $kb_intersection_native() {
            this.$remote_image = (SubLObject)CommonSymbols.NIL;
            this.$constant_index = (SubLObject)CommonSymbols.NIL;
            this.$nart_index = (SubLObject)CommonSymbols.NIL;
            this.$assertion_index = (SubLObject)CommonSymbols.NIL;
            this.$deduction_index = (SubLObject)CommonSymbols.NIL;
        }
        
        @Override
		public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$kb_intersection_native.structDecl;
        }
        
        @Override
		public SubLObject getField2() {
            return this.$remote_image;
        }
        
        @Override
		public SubLObject getField3() {
            return this.$constant_index;
        }
        
        @Override
		public SubLObject getField4() {
            return this.$nart_index;
        }
        
        @Override
		public SubLObject getField5() {
            return this.$assertion_index;
        }
        
        @Override
		public SubLObject getField6() {
            return this.$deduction_index;
        }
        
        @Override
		public SubLObject setField2(final SubLObject value) {
            return this.$remote_image = value;
        }
        
        @Override
		public SubLObject setField3(final SubLObject value) {
            return this.$constant_index = value;
        }
        
        @Override
		public SubLObject setField4(final SubLObject value) {
            return this.$nart_index = value;
        }
        
        @Override
		public SubLObject setField5(final SubLObject value) {
            return this.$assertion_index = value;
        }
        
        @Override
		public SubLObject setField6(final SubLObject value) {
            return this.$deduction_index = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$kb_intersection_native.class, kb_compare.$sym18$KB_INTERSECTION, kb_compare.$sym19$KB_INTERSECTION_P, kb_compare.$list20, kb_compare.$list21, new String[] { "$remote_image", "$constant_index", "$nart_index", "$assertion_index", "$deduction_index" }, kb_compare.$list22, kb_compare.$list23, kb_compare.$sym24$PRINT_KB_INTERSECTION);
        }
    }
    
    public static final class $kb_intersection_p$UnaryFunction extends UnaryFunction
    {
        public $kb_intersection_p$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("KB-INTERSECTION-P"));
        }
        
        @Override
		public SubLObject processItem(final SubLObject arg1) {
            return kb_compare.kb_intersection_p(arg1);
        }
    }
    
    public static final class $kb_difference_native extends SubLStructNative
    {
        public SubLObject $common_intersection;
        public SubLObject $renamed_constants;
        public SubLObject $constants;
        public SubLObject $narts;
        public SubLObject $assertions;
        public SubLObject $deductions;
        private static final SubLStructDeclNative structDecl;
        
        public $kb_difference_native() {
            this.$common_intersection = (SubLObject)CommonSymbols.NIL;
            this.$renamed_constants = (SubLObject)CommonSymbols.NIL;
            this.$constants = (SubLObject)CommonSymbols.NIL;
            this.$narts = (SubLObject)CommonSymbols.NIL;
            this.$assertions = (SubLObject)CommonSymbols.NIL;
            this.$deductions = (SubLObject)CommonSymbols.NIL;
        }
        
        @Override
		public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$kb_difference_native.structDecl;
        }
        
        @Override
		public SubLObject getField2() {
            return this.$common_intersection;
        }
        
        @Override
		public SubLObject getField3() {
            return this.$renamed_constants;
        }
        
        @Override
		public SubLObject getField4() {
            return this.$constants;
        }
        
        @Override
		public SubLObject getField5() {
            return this.$narts;
        }
        
        @Override
		public SubLObject getField6() {
            return this.$assertions;
        }
        
        @Override
		public SubLObject getField7() {
            return this.$deductions;
        }
        
        @Override
		public SubLObject setField2(final SubLObject value) {
            return this.$common_intersection = value;
        }
        
        @Override
		public SubLObject setField3(final SubLObject value) {
            return this.$renamed_constants = value;
        }
        
        @Override
		public SubLObject setField4(final SubLObject value) {
            return this.$constants = value;
        }
        
        @Override
		public SubLObject setField5(final SubLObject value) {
            return this.$narts = value;
        }
        
        @Override
		public SubLObject setField6(final SubLObject value) {
            return this.$assertions = value;
        }
        
        @Override
		public SubLObject setField7(final SubLObject value) {
            return this.$deductions = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$kb_difference_native.class, kb_compare.$sym88$KB_DIFFERENCE, kb_compare.$sym89$KB_DIFFERENCE_P, kb_compare.$list90, kb_compare.$list91, new String[] { "$common_intersection", "$renamed_constants", "$constants", "$narts", "$assertions", "$deductions" }, kb_compare.$list92, kb_compare.$list93, kb_compare.$sym94$PRINT_KB_DIFFERENCE);
        }
    }
    
    public static final class $kb_difference_p$UnaryFunction extends UnaryFunction
    {
        public $kb_difference_p$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("KB-DIFFERENCE-P"));
        }
        
        @Override
		public SubLObject processItem(final SubLObject arg1) {
            return kb_compare.kb_difference_p(arg1);
        }
    }
}

/*

	Total time: 1308 ms
	
*/