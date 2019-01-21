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
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class html_cycl_string_printer extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.html_cycl_string_printer";
    public static final String myFingerPrint = "9a3e34f02ba898a96a1138dc9859152a1ef8c751124029f7d9853e8804fa0c92";
    @SubLTranslatedFile.SubL(source = "cycl/html-cycl-string-printer.lisp", position = 1351L)
    public static SubLSymbol $dtp_html_cycl_string_printer$;
    @SubLTranslatedFile.SubL(source = "cycl/html-cycl-string-printer.lisp", position = 4583L)
    private static SubLSymbol $embedded_constant_suffix_strings$;
    @SubLTranslatedFile.SubL(source = "cycl/html-cycl-string-printer.lisp", position = 7127L)
    public static SubLSymbol $cycl_string_allowable_html_tags$;
    @SubLTranslatedFile.SubL(source = "cycl/html-cycl-string-printer.lisp", position = 7318L)
    public static SubLSymbol $html_large_string_limit$;
    private static final SubLSymbol $sym0$HTML_CYCL_STRING_PRINTER;
    private static final SubLSymbol $sym1$HTML_CYCL_STRING_PRINTER_P;
    private static final SubLList $list2;
    private static final SubLList $list3;
    private static final SubLList $list4;
    private static final SubLList $list5;
    private static final SubLSymbol $sym6$PRINT_HTML_CYCL_STRING_PRINTER;
    private static final SubLSymbol $sym7$HTML_CYCL_STRING_PRINTER_PRINT_FUNCTION_TRAMPOLINE;
    private static final SubLList $list8;
    private static final SubLSymbol $sym9$HCS_STRING;
    private static final SubLSymbol $sym10$_CSETF_HCS_STRING;
    private static final SubLSymbol $sym11$HCS_LENGTH;
    private static final SubLSymbol $sym12$_CSETF_HCS_LENGTH;
    private static final SubLSymbol $sym13$HCS_LAST_IDX;
    private static final SubLSymbol $sym14$_CSETF_HCS_LAST_IDX;
    private static final SubLSymbol $sym15$HCS_INSIDE_CYCL_TAG_;
    private static final SubLSymbol $sym16$_CSETF_HCS_INSIDE_CYCL_TAG_;
    private static final SubLSymbol $sym17$HCS_HASH_IDX;
    private static final SubLSymbol $sym18$_CSETF_HCS_HASH_IDX;
    private static final SubLSymbol $sym19$HCS_COLON_IDX;
    private static final SubLSymbol $sym20$_CSETF_HCS_COLON_IDX;
    private static final SubLSymbol $sym21$HCS_LT_IDX;
    private static final SubLSymbol $sym22$_CSETF_HCS_LT_IDX;
    private static final SubLSymbol $sym23$HCS_VARIABLE_IDX;
    private static final SubLSymbol $sym24$_CSETF_HCS_VARIABLE_IDX;
    private static final SubLSymbol $sym25$HCS_URL_IDX;
    private static final SubLSymbol $sym26$_CSETF_HCS_URL_IDX;
    private static final SubLSymbol $sym27$HCS_URL_END_IDX;
    private static final SubLSymbol $sym28$_CSETF_HCS_URL_END_IDX;
    private static final SubLSymbol $sym29$HCS_LINK_FUNCTION;
    private static final SubLSymbol $sym30$_CSETF_HCS_LINK_FUNCTION;
    private static final SubLSymbol $sym31$HCS_REQUIRE_EXACT_;
    private static final SubLSymbol $sym32$_CSETF_HCS_REQUIRE_EXACT_;
    private static final SubLSymbol $kw33$STRING;
    private static final SubLSymbol $kw34$LENGTH;
    private static final SubLSymbol $kw35$LAST_IDX;
    private static final SubLSymbol $kw36$INSIDE_CYCL_TAG_;
    private static final SubLSymbol $kw37$HASH_IDX;
    private static final SubLSymbol $kw38$COLON_IDX;
    private static final SubLSymbol $kw39$LT_IDX;
    private static final SubLSymbol $kw40$VARIABLE_IDX;
    private static final SubLSymbol $kw41$URL_IDX;
    private static final SubLSymbol $kw42$URL_END_IDX;
    private static final SubLSymbol $kw43$LINK_FUNCTION;
    private static final SubLSymbol $kw44$REQUIRE_EXACT_;
    private static final SubLString $str45$Invalid_slot__S_for_construction_;
    private static final SubLSymbol $kw46$BEGIN;
    private static final SubLSymbol $sym47$MAKE_HTML_CYCL_STRING_PRINTER;
    private static final SubLSymbol $kw48$SLOT;
    private static final SubLSymbol $kw49$END;
    private static final SubLSymbol $sym50$VISIT_DEFSTRUCT_OBJECT_HTML_CYCL_STRING_PRINTER_METHOD;
    private static final SubLString $str51$_HTML_CYCL_STRING_PRINTER_;
    private static final SubLSymbol $sym52$CB_FORM;
    private static final SubLSymbol $kw53$DONE;
    private static final SubLSymbol $sym54$MIN;
    private static final SubLSymbol $sym55$NULL;
    private static final SubLString $str56$__;
    private static final SubLString $str57$_a_href___S__A__a_;
    private static final SubLList $list58;
    private static final SubLSymbol $sym59$VALID_CONSTANT_NAME_CHAR_P;
    private static final SubLList $list60;
    private static final SubLInteger $int61$4096;
    private static final SubLSymbol $sym62$EL_VARIABLE_CHAR_;
    private static final SubLSymbol $sym63$STRING_;
    private static final SubLString $str64$_;
    private static final SubLString $str65$_;
    private static final SubLString $str66$_;
    private static final SubLString $str67$code;
    private static final SubLString $str68$pre;
    
    @SubLTranslatedFile.SubL(source = "cycl/html-cycl-string-printer.lisp", position = 1351L)
    public static SubLObject html_cycl_string_printer_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        print_html_cycl_string_printer(v_object, stream, (SubLObject)html_cycl_string_printer.ZERO_INTEGER);
        return (SubLObject)html_cycl_string_printer.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-cycl-string-printer.lisp", position = 1351L)
    public static SubLObject html_cycl_string_printer_p(final SubLObject v_object) {
        return (SubLObject)((v_object.getClass() == $html_cycl_string_printer_native.class) ? html_cycl_string_printer.T : html_cycl_string_printer.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-cycl-string-printer.lisp", position = 1351L)
    public static SubLObject hcs_string(final SubLObject v_object) {
        assert html_cycl_string_printer.NIL != html_cycl_string_printer_p(v_object) : v_object;
        return v_object.getField2();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-cycl-string-printer.lisp", position = 1351L)
    public static SubLObject hcs_length(final SubLObject v_object) {
        assert html_cycl_string_printer.NIL != html_cycl_string_printer_p(v_object) : v_object;
        return v_object.getField3();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-cycl-string-printer.lisp", position = 1351L)
    public static SubLObject hcs_last_idx(final SubLObject v_object) {
        assert html_cycl_string_printer.NIL != html_cycl_string_printer_p(v_object) : v_object;
        return v_object.getField4();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-cycl-string-printer.lisp", position = 1351L)
    public static SubLObject hcs_inside_cycl_tagP(final SubLObject v_object) {
        assert html_cycl_string_printer.NIL != html_cycl_string_printer_p(v_object) : v_object;
        return v_object.getField5();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-cycl-string-printer.lisp", position = 1351L)
    public static SubLObject hcs_hash_idx(final SubLObject v_object) {
        assert html_cycl_string_printer.NIL != html_cycl_string_printer_p(v_object) : v_object;
        return v_object.getField6();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-cycl-string-printer.lisp", position = 1351L)
    public static SubLObject hcs_colon_idx(final SubLObject v_object) {
        assert html_cycl_string_printer.NIL != html_cycl_string_printer_p(v_object) : v_object;
        return v_object.getField7();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-cycl-string-printer.lisp", position = 1351L)
    public static SubLObject hcs_lt_idx(final SubLObject v_object) {
        assert html_cycl_string_printer.NIL != html_cycl_string_printer_p(v_object) : v_object;
        return v_object.getField8();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-cycl-string-printer.lisp", position = 1351L)
    public static SubLObject hcs_variable_idx(final SubLObject v_object) {
        assert html_cycl_string_printer.NIL != html_cycl_string_printer_p(v_object) : v_object;
        return v_object.getField9();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-cycl-string-printer.lisp", position = 1351L)
    public static SubLObject hcs_url_idx(final SubLObject v_object) {
        assert html_cycl_string_printer.NIL != html_cycl_string_printer_p(v_object) : v_object;
        return v_object.getField10();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-cycl-string-printer.lisp", position = 1351L)
    public static SubLObject hcs_url_end_idx(final SubLObject v_object) {
        assert html_cycl_string_printer.NIL != html_cycl_string_printer_p(v_object) : v_object;
        return v_object.getField11();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-cycl-string-printer.lisp", position = 1351L)
    public static SubLObject hcs_link_function(final SubLObject v_object) {
        assert html_cycl_string_printer.NIL != html_cycl_string_printer_p(v_object) : v_object;
        return v_object.getField12();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-cycl-string-printer.lisp", position = 1351L)
    public static SubLObject hcs_require_exactP(final SubLObject v_object) {
        assert html_cycl_string_printer.NIL != html_cycl_string_printer_p(v_object) : v_object;
        return v_object.getField13();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-cycl-string-printer.lisp", position = 1351L)
    public static SubLObject _csetf_hcs_string(final SubLObject v_object, final SubLObject value) {
        assert html_cycl_string_printer.NIL != html_cycl_string_printer_p(v_object) : v_object;
        return v_object.setField2(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-cycl-string-printer.lisp", position = 1351L)
    public static SubLObject _csetf_hcs_length(final SubLObject v_object, final SubLObject value) {
        assert html_cycl_string_printer.NIL != html_cycl_string_printer_p(v_object) : v_object;
        return v_object.setField3(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-cycl-string-printer.lisp", position = 1351L)
    public static SubLObject _csetf_hcs_last_idx(final SubLObject v_object, final SubLObject value) {
        assert html_cycl_string_printer.NIL != html_cycl_string_printer_p(v_object) : v_object;
        return v_object.setField4(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-cycl-string-printer.lisp", position = 1351L)
    public static SubLObject _csetf_hcs_inside_cycl_tagP(final SubLObject v_object, final SubLObject value) {
        assert html_cycl_string_printer.NIL != html_cycl_string_printer_p(v_object) : v_object;
        return v_object.setField5(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-cycl-string-printer.lisp", position = 1351L)
    public static SubLObject _csetf_hcs_hash_idx(final SubLObject v_object, final SubLObject value) {
        assert html_cycl_string_printer.NIL != html_cycl_string_printer_p(v_object) : v_object;
        return v_object.setField6(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-cycl-string-printer.lisp", position = 1351L)
    public static SubLObject _csetf_hcs_colon_idx(final SubLObject v_object, final SubLObject value) {
        assert html_cycl_string_printer.NIL != html_cycl_string_printer_p(v_object) : v_object;
        return v_object.setField7(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-cycl-string-printer.lisp", position = 1351L)
    public static SubLObject _csetf_hcs_lt_idx(final SubLObject v_object, final SubLObject value) {
        assert html_cycl_string_printer.NIL != html_cycl_string_printer_p(v_object) : v_object;
        return v_object.setField8(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-cycl-string-printer.lisp", position = 1351L)
    public static SubLObject _csetf_hcs_variable_idx(final SubLObject v_object, final SubLObject value) {
        assert html_cycl_string_printer.NIL != html_cycl_string_printer_p(v_object) : v_object;
        return v_object.setField9(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-cycl-string-printer.lisp", position = 1351L)
    public static SubLObject _csetf_hcs_url_idx(final SubLObject v_object, final SubLObject value) {
        assert html_cycl_string_printer.NIL != html_cycl_string_printer_p(v_object) : v_object;
        return v_object.setField10(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-cycl-string-printer.lisp", position = 1351L)
    public static SubLObject _csetf_hcs_url_end_idx(final SubLObject v_object, final SubLObject value) {
        assert html_cycl_string_printer.NIL != html_cycl_string_printer_p(v_object) : v_object;
        return v_object.setField11(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-cycl-string-printer.lisp", position = 1351L)
    public static SubLObject _csetf_hcs_link_function(final SubLObject v_object, final SubLObject value) {
        assert html_cycl_string_printer.NIL != html_cycl_string_printer_p(v_object) : v_object;
        return v_object.setField12(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-cycl-string-printer.lisp", position = 1351L)
    public static SubLObject _csetf_hcs_require_exactP(final SubLObject v_object, final SubLObject value) {
        assert html_cycl_string_printer.NIL != html_cycl_string_printer_p(v_object) : v_object;
        return v_object.setField13(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-cycl-string-printer.lisp", position = 1351L)
    public static SubLObject make_html_cycl_string_printer(SubLObject arglist) {
        if (arglist == html_cycl_string_printer.UNPROVIDED) {
            arglist = (SubLObject)html_cycl_string_printer.NIL;
        }
        final SubLObject v_new = (SubLObject)new $html_cycl_string_printer_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = (SubLObject)html_cycl_string_printer.NIL, next = arglist; html_cycl_string_printer.NIL != next; next = conses_high.cddr(next)) {
            current_arg = next.first();
            current_value = conses_high.cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql((SubLObject)html_cycl_string_printer.$kw33$STRING)) {
                _csetf_hcs_string(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)html_cycl_string_printer.$kw34$LENGTH)) {
                _csetf_hcs_length(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)html_cycl_string_printer.$kw35$LAST_IDX)) {
                _csetf_hcs_last_idx(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)html_cycl_string_printer.$kw36$INSIDE_CYCL_TAG_)) {
                _csetf_hcs_inside_cycl_tagP(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)html_cycl_string_printer.$kw37$HASH_IDX)) {
                _csetf_hcs_hash_idx(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)html_cycl_string_printer.$kw38$COLON_IDX)) {
                _csetf_hcs_colon_idx(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)html_cycl_string_printer.$kw39$LT_IDX)) {
                _csetf_hcs_lt_idx(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)html_cycl_string_printer.$kw40$VARIABLE_IDX)) {
                _csetf_hcs_variable_idx(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)html_cycl_string_printer.$kw41$URL_IDX)) {
                _csetf_hcs_url_idx(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)html_cycl_string_printer.$kw42$URL_END_IDX)) {
                _csetf_hcs_url_end_idx(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)html_cycl_string_printer.$kw43$LINK_FUNCTION)) {
                _csetf_hcs_link_function(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)html_cycl_string_printer.$kw44$REQUIRE_EXACT_)) {
                _csetf_hcs_require_exactP(v_new, current_value);
            }
            else {
                Errors.error((SubLObject)html_cycl_string_printer.$str45$Invalid_slot__S_for_construction_, current_arg);
            }
        }
        return v_new;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-cycl-string-printer.lisp", position = 1351L)
    public static SubLObject visit_defstruct_html_cycl_string_printer(final SubLObject obj, final SubLObject visitor_fn) {
        Functions.funcall(visitor_fn, obj, (SubLObject)html_cycl_string_printer.$kw46$BEGIN, (SubLObject)html_cycl_string_printer.$sym47$MAKE_HTML_CYCL_STRING_PRINTER, (SubLObject)html_cycl_string_printer.TWELVE_INTEGER);
        Functions.funcall(visitor_fn, obj, (SubLObject)html_cycl_string_printer.$kw48$SLOT, (SubLObject)html_cycl_string_printer.$kw33$STRING, hcs_string(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)html_cycl_string_printer.$kw48$SLOT, (SubLObject)html_cycl_string_printer.$kw34$LENGTH, hcs_length(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)html_cycl_string_printer.$kw48$SLOT, (SubLObject)html_cycl_string_printer.$kw35$LAST_IDX, hcs_last_idx(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)html_cycl_string_printer.$kw48$SLOT, (SubLObject)html_cycl_string_printer.$kw36$INSIDE_CYCL_TAG_, hcs_inside_cycl_tagP(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)html_cycl_string_printer.$kw48$SLOT, (SubLObject)html_cycl_string_printer.$kw37$HASH_IDX, hcs_hash_idx(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)html_cycl_string_printer.$kw48$SLOT, (SubLObject)html_cycl_string_printer.$kw38$COLON_IDX, hcs_colon_idx(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)html_cycl_string_printer.$kw48$SLOT, (SubLObject)html_cycl_string_printer.$kw39$LT_IDX, hcs_lt_idx(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)html_cycl_string_printer.$kw48$SLOT, (SubLObject)html_cycl_string_printer.$kw40$VARIABLE_IDX, hcs_variable_idx(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)html_cycl_string_printer.$kw48$SLOT, (SubLObject)html_cycl_string_printer.$kw41$URL_IDX, hcs_url_idx(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)html_cycl_string_printer.$kw48$SLOT, (SubLObject)html_cycl_string_printer.$kw42$URL_END_IDX, hcs_url_end_idx(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)html_cycl_string_printer.$kw48$SLOT, (SubLObject)html_cycl_string_printer.$kw43$LINK_FUNCTION, hcs_link_function(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)html_cycl_string_printer.$kw48$SLOT, (SubLObject)html_cycl_string_printer.$kw44$REQUIRE_EXACT_, hcs_require_exactP(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)html_cycl_string_printer.$kw49$END, (SubLObject)html_cycl_string_printer.$sym47$MAKE_HTML_CYCL_STRING_PRINTER, (SubLObject)html_cycl_string_printer.TWELVE_INTEGER);
        return obj;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-cycl-string-printer.lisp", position = 1351L)
    public static SubLObject visit_defstruct_object_html_cycl_string_printer_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_html_cycl_string_printer(obj, visitor_fn);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-cycl-string-printer.lisp", position = 1630L)
    public static SubLObject print_html_cycl_string_printer(final SubLObject v_object, final SubLObject stream, final SubLObject depth) {
        PrintLow.format(stream, (SubLObject)html_cycl_string_printer.$str51$_HTML_CYCL_STRING_PRINTER_);
        return v_object;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-cycl-string-printer.lisp", position = 1796L)
    public static SubLObject new_html_cycl_string_printer(final SubLObject string, SubLObject link_function, SubLObject require_exactP) {
        if (link_function == html_cycl_string_printer.UNPROVIDED) {
            link_function = (SubLObject)html_cycl_string_printer.$sym52$CB_FORM;
        }
        if (require_exactP == html_cycl_string_printer.UNPROVIDED) {
            require_exactP = (SubLObject)html_cycl_string_printer.NIL;
        }
        final SubLObject printer = make_html_cycl_string_printer((SubLObject)html_cycl_string_printer.UNPROVIDED);
        _csetf_hcs_string(printer, string);
        _csetf_hcs_length(printer, Sequences.length(string));
        _csetf_hcs_last_idx(printer, (SubLObject)html_cycl_string_printer.ZERO_INTEGER);
        _csetf_hcs_inside_cycl_tagP(printer, (SubLObject)html_cycl_string_printer.NIL);
        hcs_set_hash_idx(printer);
        hcs_set_colon_idx(printer);
        _csetf_hcs_lt_idx(printer, hcs_find(printer, (SubLObject)Characters.CHAR_less, hcs_last_idx(printer)));
        _csetf_hcs_variable_idx(printer, html_cycl_string_variable_index(string, hcs_last_idx(printer)));
        _csetf_hcs_url_idx(printer, (SubLObject)html_cycl_string_printer.ZERO_INTEGER);
        _csetf_hcs_url_end_idx(printer, (SubLObject)html_cycl_string_printer.ZERO_INTEGER);
        _csetf_hcs_link_function(printer, link_function);
        _csetf_hcs_require_exactP(printer, require_exactP);
        return printer;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-cycl-string-printer.lisp", position = 2596L)
    public static SubLObject html_cycl_string_printer_done_p(final SubLObject printer) {
        return (SubLObject)SubLObjectFactory.makeBoolean(html_cycl_string_printer.NIL == hcs_colon_idx(printer) && html_cycl_string_printer.NIL == hcs_hash_idx(printer) && html_cycl_string_printer.NIL == hcs_last_idx(printer) && html_cycl_string_printer.NIL == hcs_lt_idx(printer) && html_cycl_string_printer.NIL == hcs_variable_idx(printer));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-cycl-string-printer.lisp", position = 2864L)
    public static SubLObject html_cycl_string_printer_print_next(final SubLObject printer) {
        if (html_cycl_string_printer.NIL == hcs_colon_idx(printer) && html_cycl_string_printer.NIL == hcs_hash_idx(printer) && html_cycl_string_printer.NIL == hcs_lt_idx(printer) && html_cycl_string_printer.NIL == hcs_variable_idx(printer)) {
            hcs_print(printer, (SubLObject)html_cycl_string_printer.NIL, (SubLObject)html_cycl_string_printer.T);
            return (SubLObject)html_cycl_string_printer.$kw53$DONE;
        }
        final SubLObject next_char_idx = Functions.apply(Symbols.symbol_function((SubLObject)html_cycl_string_printer.$sym54$MIN), Sequences.remove_if(Symbols.symbol_function((SubLObject)html_cycl_string_printer.$sym55$NULL), (SubLObject)ConsesLow.list(hcs_hash_idx(printer), hcs_colon_idx(printer), hcs_lt_idx(printer), hcs_variable_idx(printer)), (SubLObject)html_cycl_string_printer.UNPROVIDED, (SubLObject)html_cycl_string_printer.UNPROVIDED, (SubLObject)html_cycl_string_printer.UNPROVIDED, (SubLObject)html_cycl_string_printer.UNPROVIDED));
        if (hcs_colon_idx(printer).eql(next_char_idx)) {
            hcs_handle_colon(printer);
        }
        else if (hcs_hash_idx(printer).eql(next_char_idx)) {
            hcs_handle_hash(printer);
        }
        else if (hcs_variable_idx(printer).eql(next_char_idx)) {
            hcs_handle_variable(printer);
        }
        else if (hcs_lt_idx(printer).eql(next_char_idx)) {
            hcs_handle_lt(printer);
        }
        return (SubLObject)html_cycl_string_printer.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-cycl-string-printer.lisp", position = 3767L)
    public static SubLObject html_cycl_string_variable_index(final SubLObject string, final SubLObject start_char) {
        SubLObject prev_char = (SubLObject)Characters.CHAR_space;
        SubLObject inside_tagP = (SubLObject)html_cycl_string_printer.NIL;
        SubLObject end_var_$1;
        SubLObject end_var;
        SubLObject n;
        SubLObject this_char;
        for (end_var = (end_var_$1 = Sequences.length(string)), n = (SubLObject)html_cycl_string_printer.NIL, n = start_char; !n.numGE(end_var_$1); n = number_utilities.f_1X(n)) {
            this_char = Strings.sublisp_char(string, n);
            if (html_cycl_string_printer.NIL != inside_tagP) {
                if (this_char.eql((SubLObject)Characters.CHAR_greater)) {
                    inside_tagP = (SubLObject)html_cycl_string_printer.NIL;
                }
            }
            else if (this_char.eql((SubLObject)Characters.CHAR_less)) {
                inside_tagP = (SubLObject)html_cycl_string_printer.T;
            }
            else {
                if (html_cycl_string_printer.NIL != string_utilities.whitespacep(prev_char) && html_cycl_string_printer.NIL != Sequences.find(this_char, (SubLObject)html_cycl_string_printer.$str56$__, (SubLObject)html_cycl_string_printer.UNPROVIDED, (SubLObject)html_cycl_string_printer.UNPROVIDED, (SubLObject)html_cycl_string_printer.UNPROVIDED, (SubLObject)html_cycl_string_printer.UNPROVIDED)) {
                    return n;
                }
                if (html_cycl_string_printer.NIL != string_utilities.whitespacep(prev_char) && html_cycl_string_printer.NIL != list_utilities.lengthG(string, number_utilities.f_1X(n), (SubLObject)html_cycl_string_printer.UNPROVIDED) && html_cycl_string_printer.NIL != cycl_variables.el_variable_charP(this_char) && html_cycl_string_printer.NIL != cycl_variables.el_variable_charP(Strings.sublisp_char(string, number_utilities.f_1X(n)))) {
                    return n;
                }
                prev_char = this_char;
            }
        }
        return (SubLObject)html_cycl_string_printer.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-cycl-string-printer.lisp", position = 4393L)
    public static SubLObject print_url_with_tag(final SubLObject string) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (!string.isString()) {
            return (SubLObject)html_cycl_string_printer.NIL;
        }
        PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), (SubLObject)html_cycl_string_printer.$str57$_a_href___S__A__a_, string, string);
        return string;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-cycl-string-printer.lisp", position = 5284L)
    public static SubLObject print_embedded_constant(final SubLObject string, final SubLObject length, final SubLObject dollar_idx, SubLObject link_function, SubLObject require_exactP) {
        if (link_function == html_cycl_string_printer.UNPROVIDED) {
            link_function = (SubLObject)html_cycl_string_printer.$sym52$CB_FORM;
        }
        if (require_exactP == html_cycl_string_printer.UNPROVIDED) {
            require_exactP = (SubLObject)html_cycl_string_printer.NIL;
        }
        final SubLObject token_start = Numbers.add(dollar_idx, (SubLObject)html_cycl_string_printer.ONE_INTEGER);
        SubLObject token_end = list_utilities.position_if_not(Symbols.symbol_function((SubLObject)html_cycl_string_printer.$sym59$VALID_CONSTANT_NAME_CHAR_P), string, Symbols.symbol_function((SubLObject)html_cycl_string_printer.IDENTITY), token_start, (SubLObject)html_cycl_string_printer.UNPROVIDED);
        SubLObject token_last = (SubLObject)html_cycl_string_printer.NIL;
        SubLObject possible_constant = (SubLObject)html_cycl_string_printer.NIL;
        if (html_cycl_string_printer.NIL == token_end) {
            token_end = length;
        }
        token_last = Numbers.subtract(token_end, (SubLObject)html_cycl_string_printer.ONE_INTEGER);
        possible_constant = constant_completion_high.constant_complete_exact(string, token_start, token_end);
        if (html_cycl_string_printer.NIL == possible_constant && html_cycl_string_printer.NIL == require_exactP && html_cycl_string_printer.NIL == possible_constant) {
            SubLObject csome_list_var = html_cycl_string_printer.$embedded_constant_suffix_strings$.getGlobalValue();
            SubLObject suffix_string = (SubLObject)html_cycl_string_printer.NIL;
            suffix_string = csome_list_var.first();
            while (html_cycl_string_printer.NIL == possible_constant && html_cycl_string_printer.NIL != csome_list_var) {
                SubLObject abort_this_suffixP;
                SubLObject i;
                SubLObject j;
                SubLObject chari;
                SubLObject possible_token_last;
                for (abort_this_suffixP = (SubLObject)html_cycl_string_printer.NIL, i = (SubLObject)html_cycl_string_printer.NIL, j = (SubLObject)html_cycl_string_printer.NIL, i = Numbers.subtract(Sequences.length(suffix_string), (SubLObject)html_cycl_string_printer.ONE_INTEGER), j = (SubLObject)html_cycl_string_printer.ZERO_INTEGER; !i.numL((SubLObject)html_cycl_string_printer.ZERO_INTEGER) && html_cycl_string_printer.NIL == possible_constant && html_cycl_string_printer.NIL == abort_this_suffixP; i = Numbers.subtract(i, (SubLObject)html_cycl_string_printer.ONE_INTEGER), j = Numbers.add(j, (SubLObject)html_cycl_string_printer.ONE_INTEGER)) {
                    chari = Strings.sublisp_char(suffix_string, i);
                    possible_token_last = Numbers.subtract(token_last, j);
                    if (possible_token_last.numG(token_start) && html_cycl_string_printer.NIL != Characters.char_equal(chari, Strings.sublisp_char(string, possible_token_last))) {
                        possible_constant = constant_completion_high.constant_complete_exact(string, token_start, possible_token_last);
                        if (html_cycl_string_printer.NIL != possible_constant) {
                            token_end = possible_token_last;
                        }
                    }
                    else {
                        abort_this_suffixP = (SubLObject)html_cycl_string_printer.T;
                    }
                }
                csome_list_var = csome_list_var.rest();
                suffix_string = csome_list_var.first();
            }
        }
        if (html_cycl_string_printer.NIL != possible_constant) {
            if (html_cycl_string_printer.$sym52$CB_FORM == link_function) {
                cb_utilities.cb_form(possible_constant, (SubLObject)html_cycl_string_printer.UNPROVIDED, (SubLObject)html_cycl_string_printer.UNPROVIDED);
            }
            else {
                Functions.funcall(link_function, possible_constant);
            }
        }
        else {
            html_utilities.html_stale_constant_reference(string, Numbers.subtract(dollar_idx, (SubLObject)html_cycl_string_printer.ONE_INTEGER), token_end);
        }
        return token_end;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-cycl-string-printer.lisp", position = 7471L)
    public static SubLObject hcs_find(final SubLObject printer, final SubLObject v_char, final SubLObject start) {
        return Sequences.position(v_char, hcs_string(printer), Symbols.symbol_function((SubLObject)html_cycl_string_printer.EQL), Symbols.symbol_function((SubLObject)html_cycl_string_printer.IDENTITY), start, (SubLObject)html_cycl_string_printer.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-cycl-string-printer.lisp", position = 7651L)
    public static SubLObject hcs_set_colon_idx(final SubLObject printer) {
        _csetf_hcs_colon_idx(printer, hcs_find(printer, (SubLObject)Characters.CHAR_colon, hcs_last_idx(printer)));
        return hcs_colon_idx(printer);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-cycl-string-printer.lisp", position = 7809L)
    public static SubLObject hcs_set_hash_idx(final SubLObject printer) {
        _csetf_hcs_hash_idx(printer, hcs_find(printer, (SubLObject)Characters.CHAR_hash, hcs_last_idx(printer)));
        return hcs_hash_idx(printer);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-cycl-string-printer.lisp", position = 7964L)
    public static SubLObject hcs_print(final SubLObject printer, final SubLObject end, final SubLObject move_last_idx_to_endP) {
        html_utilities.html_string(hcs_string(printer), hcs_last_idx(printer), end);
        if (html_cycl_string_printer.NIL != move_last_idx_to_endP) {
            _csetf_hcs_last_idx(printer, end);
        }
        return printer;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-cycl-string-printer.lisp", position = 8231L)
    public static SubLObject hcs_handle_colon(final SubLObject printer) {
        _csetf_hcs_url_idx(printer, web_utilities.find_url_beginning(hcs_string(printer), hcs_length(printer), hcs_colon_idx(printer)));
        if (html_cycl_string_printer.NIL != hcs_url_idx(printer)) {
            _csetf_hcs_url_end_idx(printer, web_utilities.find_url_end(hcs_string(printer), hcs_length(printer), hcs_url_idx(printer)));
        }
        if (html_cycl_string_printer.NIL != hcs_url_idx(printer) && html_cycl_string_printer.NIL != hcs_url_end_idx(printer)) {
            hcs_print(printer, hcs_url_idx(printer), (SubLObject)html_cycl_string_printer.NIL);
            print_url_with_tag(Sequences.subseq(hcs_string(printer), hcs_url_idx(printer), hcs_url_end_idx(printer)));
            _csetf_hcs_last_idx(printer, hcs_url_end_idx(printer));
        }
        else {
            hcs_print(printer, Numbers.add((SubLObject)html_cycl_string_printer.ONE_INTEGER, hcs_colon_idx(printer)), (SubLObject)html_cycl_string_printer.T);
        }
        hcs_set_colon_idx(printer);
        hcs_set_hash_idx(printer);
        _csetf_hcs_variable_idx(printer, Sequences.position_if((SubLObject)html_cycl_string_printer.$sym62$EL_VARIABLE_CHAR_, hcs_string(printer), Symbols.symbol_function((SubLObject)html_cycl_string_printer.IDENTITY), hcs_last_idx(printer), (SubLObject)html_cycl_string_printer.UNPROVIDED));
        return printer;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-cycl-string-printer.lisp", position = 9448L)
    public static SubLObject hcs_handle_hash(final SubLObject printer) {
        hcs_print(printer, hcs_hash_idx(printer), (SubLObject)html_cycl_string_printer.NIL);
        final SubLObject dollar_idx = Numbers.add(hcs_hash_idx(printer), (SubLObject)html_cycl_string_printer.ONE_INTEGER);
        if (dollar_idx.numE(hcs_length(printer)) || !Strings.sublisp_char(hcs_string(printer), dollar_idx).eql(constant_reader.constant_reader_macro_char())) {
            html_utilities.html_princ((SubLObject)Characters.CHAR_hash);
            _csetf_hcs_last_idx(printer, dollar_idx);
        }
        else {
            _csetf_hcs_last_idx(printer, print_embedded_constant(hcs_string(printer), hcs_length(printer), dollar_idx, hcs_link_function(printer), hcs_require_exactP(printer)));
        }
        hcs_set_hash_idx(printer);
        hcs_set_colon_idx(printer);
        _csetf_hcs_variable_idx(printer, Sequences.position_if((SubLObject)html_cycl_string_printer.$sym62$EL_VARIABLE_CHAR_, hcs_string(printer), Symbols.symbol_function((SubLObject)html_cycl_string_printer.IDENTITY), hcs_last_idx(printer), (SubLObject)html_cycl_string_printer.UNPROVIDED));
        return printer;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-cycl-string-printer.lisp", position = 10501L)
    public static SubLObject hcs_handle_variable(final SubLObject printer) {
        hcs_print(printer, hcs_variable_idx(printer), (SubLObject)html_cycl_string_printer.T);
        final SubLObject non_variable_idx = list_utilities.position_if_not((SubLObject)html_cycl_string_printer.$sym62$EL_VARIABLE_CHAR_, hcs_string(printer), Symbols.symbol_function((SubLObject)html_cycl_string_printer.IDENTITY), hcs_variable_idx(printer), (SubLObject)html_cycl_string_printer.UNPROVIDED);
        if (html_cycl_string_printer.NIL != hcs_inside_cycl_tagP(printer) && html_cycl_string_printer.NIL != non_variable_idx && non_variable_idx.numG(hcs_variable_idx(printer)) && html_cycl_string_printer.NIL == Characters.alpha_char_p(Strings.sublisp_char(hcs_string(printer), non_variable_idx))) {
            final SubLObject variable_name = Sequences.subseq(hcs_string(printer), hcs_variable_idx(printer), non_variable_idx);
            if (html_cycl_string_printer.NIL != cycl_variables.valid_el_var_nameP(variable_name)) {
                html_utilities.html_princ(variable_name);
            }
            else if (html_cycl_string_printer.NIL != string_utilities.integer_string_p(variable_name)) {
                html_utilities.html_princ(variable_name);
            }
            else {
                html_utilities.html_markup(html_macros.$html_bold_head$.getGlobalValue());
                html_utilities.html_princ(variable_name);
                html_utilities.html_markup(html_macros.$html_bold_tail$.getGlobalValue());
            }
            _csetf_hcs_last_idx(printer, non_variable_idx);
        }
        if (html_cycl_string_printer.NIL != non_variable_idx) {
            _csetf_hcs_variable_idx(printer, html_cycl_string_variable_index(hcs_string(printer), non_variable_idx));
        }
        else {
            _csetf_hcs_variable_idx(printer, (SubLObject)html_cycl_string_printer.NIL);
        }
        return printer;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-cycl-string-printer.lisp", position = 11556L)
    public static SubLObject hcs_handle_lt(final SubLObject printer) {
        hcs_print(printer, hcs_lt_idx(printer), (SubLObject)html_cycl_string_printer.T);
        final SubLObject gt_idx = hcs_find(printer, (SubLObject)Characters.CHAR_greater, hcs_lt_idx(printer));
        if (html_cycl_string_printer.NIL != gt_idx) {
            final SubLObject tag_start_idx = (SubLObject)((html_cycl_string_printer.NIL != Characters.charE((SubLObject)Characters.CHAR_slash, Strings.sublisp_char(hcs_string(printer), Numbers.add(hcs_lt_idx(printer), (SubLObject)html_cycl_string_printer.ONE_INTEGER)))) ? html_cycl_string_printer.TWO_INTEGER : html_cycl_string_printer.ONE_INTEGER);
            final SubLObject tag = Sequences.subseq(hcs_string(printer), Numbers.add(hcs_lt_idx(printer), tag_start_idx), gt_idx);
            if (html_cycl_string_printer.NIL != subl_promotions.memberP(Strings.string_downcase(string_utilities.trim_whitespace(tag), (SubLObject)html_cycl_string_printer.UNPROVIDED, (SubLObject)html_cycl_string_printer.UNPROVIDED), html_cycl_string_printer.$cycl_string_allowable_html_tags$.getGlobalValue(), Symbols.symbol_function((SubLObject)html_cycl_string_printer.$sym63$STRING_), (SubLObject)html_cycl_string_printer.UNPROVIDED)) {
                html_utilities.html_markup((SubLObject)html_cycl_string_printer.$str64$_);
                if (html_cycl_string_printer.TWO_INTEGER.eql(tag_start_idx)) {
                    html_utilities.html_princ((SubLObject)html_cycl_string_printer.$str65$_);
                }
                html_utilities.html_markup(tag);
                html_utilities.html_markup((SubLObject)html_cycl_string_printer.$str66$_);
                if (html_cycl_string_printer.NIL != Strings.string_equal(tag, (SubLObject)html_cycl_string_printer.$str67$code, (SubLObject)html_cycl_string_printer.UNPROVIDED, (SubLObject)html_cycl_string_printer.UNPROVIDED, (SubLObject)html_cycl_string_printer.UNPROVIDED, (SubLObject)html_cycl_string_printer.UNPROVIDED) || html_cycl_string_printer.NIL != Strings.string_equal(tag, (SubLObject)html_cycl_string_printer.$str68$pre, (SubLObject)html_cycl_string_printer.UNPROVIDED, (SubLObject)html_cycl_string_printer.UNPROVIDED, (SubLObject)html_cycl_string_printer.UNPROVIDED, (SubLObject)html_cycl_string_printer.UNPROVIDED)) {
                    if (html_cycl_string_printer.TWO_INTEGER.eql(tag_start_idx)) {
                        _csetf_hcs_inside_cycl_tagP(printer, (SubLObject)html_cycl_string_printer.NIL);
                    }
                    else {
                        _csetf_hcs_inside_cycl_tagP(printer, (SubLObject)html_cycl_string_printer.T);
                    }
                }
                _csetf_hcs_last_idx(printer, Numbers.add(gt_idx, (SubLObject)html_cycl_string_printer.ONE_INTEGER));
            }
        }
        _csetf_hcs_lt_idx(printer, hcs_find(printer, (SubLObject)Characters.CHAR_less, Numbers.add(hcs_lt_idx(printer), (SubLObject)html_cycl_string_printer.ONE_INTEGER)));
        return printer;
    }
    
    public static SubLObject declare_html_cycl_string_printer_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_cycl_string_printer", "html_cycl_string_printer_print_function_trampoline", "HTML-CYCL-STRING-PRINTER-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_cycl_string_printer", "html_cycl_string_printer_p", "HTML-CYCL-STRING-PRINTER-P", 1, 0, false);
        new $html_cycl_string_printer_p$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_cycl_string_printer", "hcs_string", "HCS-STRING", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_cycl_string_printer", "hcs_length", "HCS-LENGTH", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_cycl_string_printer", "hcs_last_idx", "HCS-LAST-IDX", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_cycl_string_printer", "hcs_inside_cycl_tagP", "HCS-INSIDE-CYCL-TAG?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_cycl_string_printer", "hcs_hash_idx", "HCS-HASH-IDX", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_cycl_string_printer", "hcs_colon_idx", "HCS-COLON-IDX", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_cycl_string_printer", "hcs_lt_idx", "HCS-LT-IDX", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_cycl_string_printer", "hcs_variable_idx", "HCS-VARIABLE-IDX", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_cycl_string_printer", "hcs_url_idx", "HCS-URL-IDX", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_cycl_string_printer", "hcs_url_end_idx", "HCS-URL-END-IDX", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_cycl_string_printer", "hcs_link_function", "HCS-LINK-FUNCTION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_cycl_string_printer", "hcs_require_exactP", "HCS-REQUIRE-EXACT?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_cycl_string_printer", "_csetf_hcs_string", "_CSETF-HCS-STRING", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_cycl_string_printer", "_csetf_hcs_length", "_CSETF-HCS-LENGTH", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_cycl_string_printer", "_csetf_hcs_last_idx", "_CSETF-HCS-LAST-IDX", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_cycl_string_printer", "_csetf_hcs_inside_cycl_tagP", "_CSETF-HCS-INSIDE-CYCL-TAG?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_cycl_string_printer", "_csetf_hcs_hash_idx", "_CSETF-HCS-HASH-IDX", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_cycl_string_printer", "_csetf_hcs_colon_idx", "_CSETF-HCS-COLON-IDX", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_cycl_string_printer", "_csetf_hcs_lt_idx", "_CSETF-HCS-LT-IDX", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_cycl_string_printer", "_csetf_hcs_variable_idx", "_CSETF-HCS-VARIABLE-IDX", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_cycl_string_printer", "_csetf_hcs_url_idx", "_CSETF-HCS-URL-IDX", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_cycl_string_printer", "_csetf_hcs_url_end_idx", "_CSETF-HCS-URL-END-IDX", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_cycl_string_printer", "_csetf_hcs_link_function", "_CSETF-HCS-LINK-FUNCTION", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_cycl_string_printer", "_csetf_hcs_require_exactP", "_CSETF-HCS-REQUIRE-EXACT?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_cycl_string_printer", "make_html_cycl_string_printer", "MAKE-HTML-CYCL-STRING-PRINTER", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_cycl_string_printer", "visit_defstruct_html_cycl_string_printer", "VISIT-DEFSTRUCT-HTML-CYCL-STRING-PRINTER", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_cycl_string_printer", "visit_defstruct_object_html_cycl_string_printer_method", "VISIT-DEFSTRUCT-OBJECT-HTML-CYCL-STRING-PRINTER-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_cycl_string_printer", "print_html_cycl_string_printer", "PRINT-HTML-CYCL-STRING-PRINTER", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_cycl_string_printer", "new_html_cycl_string_printer", "NEW-HTML-CYCL-STRING-PRINTER", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_cycl_string_printer", "html_cycl_string_printer_done_p", "HTML-CYCL-STRING-PRINTER-DONE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_cycl_string_printer", "html_cycl_string_printer_print_next", "HTML-CYCL-STRING-PRINTER-PRINT-NEXT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_cycl_string_printer", "html_cycl_string_variable_index", "HTML-CYCL-STRING-VARIABLE-INDEX", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_cycl_string_printer", "print_url_with_tag", "PRINT-URL-WITH-TAG", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_cycl_string_printer", "print_embedded_constant", "PRINT-EMBEDDED-CONSTANT", 3, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_cycl_string_printer", "hcs_find", "HCS-FIND", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_cycl_string_printer", "hcs_set_colon_idx", "HCS-SET-COLON-IDX", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_cycl_string_printer", "hcs_set_hash_idx", "HCS-SET-HASH-IDX", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_cycl_string_printer", "hcs_print", "HCS-PRINT", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_cycl_string_printer", "hcs_handle_colon", "HCS-HANDLE-COLON", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_cycl_string_printer", "hcs_handle_hash", "HCS-HANDLE-HASH", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_cycl_string_printer", "hcs_handle_variable", "HCS-HANDLE-VARIABLE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_cycl_string_printer", "hcs_handle_lt", "HCS-HANDLE-LT", 1, 0, false);
        return (SubLObject)html_cycl_string_printer.NIL;
    }
    
    public static SubLObject init_html_cycl_string_printer_file() {
        html_cycl_string_printer.$dtp_html_cycl_string_printer$ = SubLFiles.defconstant("*DTP-HTML-CYCL-STRING-PRINTER*", (SubLObject)html_cycl_string_printer.$sym0$HTML_CYCL_STRING_PRINTER);
        html_cycl_string_printer.$embedded_constant_suffix_strings$ = SubLFiles.deflexical("*EMBEDDED-CONSTANT-SUFFIX-STRINGS*", (SubLObject)html_cycl_string_printer.$list58);
        html_cycl_string_printer.$cycl_string_allowable_html_tags$ = SubLFiles.deflexical("*CYCL-STRING-ALLOWABLE-HTML-TAGS*", (SubLObject)html_cycl_string_printer.$list60);
        html_cycl_string_printer.$html_large_string_limit$ = SubLFiles.defparameter("*HTML-LARGE-STRING-LIMIT*", (SubLObject)html_cycl_string_printer.$int61$4096);
        return (SubLObject)html_cycl_string_printer.NIL;
    }
    
    public static SubLObject setup_html_cycl_string_printer_file() {
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), html_cycl_string_printer.$dtp_html_cycl_string_printer$.getGlobalValue(), Symbols.symbol_function((SubLObject)html_cycl_string_printer.$sym7$HTML_CYCL_STRING_PRINTER_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)html_cycl_string_printer.$list8);
        Structures.def_csetf((SubLObject)html_cycl_string_printer.$sym9$HCS_STRING, (SubLObject)html_cycl_string_printer.$sym10$_CSETF_HCS_STRING);
        Structures.def_csetf((SubLObject)html_cycl_string_printer.$sym11$HCS_LENGTH, (SubLObject)html_cycl_string_printer.$sym12$_CSETF_HCS_LENGTH);
        Structures.def_csetf((SubLObject)html_cycl_string_printer.$sym13$HCS_LAST_IDX, (SubLObject)html_cycl_string_printer.$sym14$_CSETF_HCS_LAST_IDX);
        Structures.def_csetf((SubLObject)html_cycl_string_printer.$sym15$HCS_INSIDE_CYCL_TAG_, (SubLObject)html_cycl_string_printer.$sym16$_CSETF_HCS_INSIDE_CYCL_TAG_);
        Structures.def_csetf((SubLObject)html_cycl_string_printer.$sym17$HCS_HASH_IDX, (SubLObject)html_cycl_string_printer.$sym18$_CSETF_HCS_HASH_IDX);
        Structures.def_csetf((SubLObject)html_cycl_string_printer.$sym19$HCS_COLON_IDX, (SubLObject)html_cycl_string_printer.$sym20$_CSETF_HCS_COLON_IDX);
        Structures.def_csetf((SubLObject)html_cycl_string_printer.$sym21$HCS_LT_IDX, (SubLObject)html_cycl_string_printer.$sym22$_CSETF_HCS_LT_IDX);
        Structures.def_csetf((SubLObject)html_cycl_string_printer.$sym23$HCS_VARIABLE_IDX, (SubLObject)html_cycl_string_printer.$sym24$_CSETF_HCS_VARIABLE_IDX);
        Structures.def_csetf((SubLObject)html_cycl_string_printer.$sym25$HCS_URL_IDX, (SubLObject)html_cycl_string_printer.$sym26$_CSETF_HCS_URL_IDX);
        Structures.def_csetf((SubLObject)html_cycl_string_printer.$sym27$HCS_URL_END_IDX, (SubLObject)html_cycl_string_printer.$sym28$_CSETF_HCS_URL_END_IDX);
        Structures.def_csetf((SubLObject)html_cycl_string_printer.$sym29$HCS_LINK_FUNCTION, (SubLObject)html_cycl_string_printer.$sym30$_CSETF_HCS_LINK_FUNCTION);
        Structures.def_csetf((SubLObject)html_cycl_string_printer.$sym31$HCS_REQUIRE_EXACT_, (SubLObject)html_cycl_string_printer.$sym32$_CSETF_HCS_REQUIRE_EXACT_);
        Equality.identity((SubLObject)html_cycl_string_printer.$sym0$HTML_CYCL_STRING_PRINTER);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), html_cycl_string_printer.$dtp_html_cycl_string_printer$.getGlobalValue(), Symbols.symbol_function((SubLObject)html_cycl_string_printer.$sym50$VISIT_DEFSTRUCT_OBJECT_HTML_CYCL_STRING_PRINTER_METHOD));
        utilities_macros.note_funcall_helper_function((SubLObject)html_cycl_string_printer.$sym6$PRINT_HTML_CYCL_STRING_PRINTER);
        return (SubLObject)html_cycl_string_printer.NIL;
    }
    
    @Override
	public void declareFunctions() {
        declare_html_cycl_string_printer_file();
    }
    
    @Override
	public void initializeVariables() {
        init_html_cycl_string_printer_file();
    }
    
    @Override
	public void runTopLevelForms() {
        setup_html_cycl_string_printer_file();
    }
    
    static {
        me = (SubLFile)new html_cycl_string_printer();
        html_cycl_string_printer.$dtp_html_cycl_string_printer$ = null;
        html_cycl_string_printer.$embedded_constant_suffix_strings$ = null;
        html_cycl_string_printer.$cycl_string_allowable_html_tags$ = null;
        html_cycl_string_printer.$html_large_string_limit$ = null;
        $sym0$HTML_CYCL_STRING_PRINTER = SubLObjectFactory.makeSymbol("HTML-CYCL-STRING-PRINTER");
        $sym1$HTML_CYCL_STRING_PRINTER_P = SubLObjectFactory.makeSymbol("HTML-CYCL-STRING-PRINTER-P");
        $list2 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("STRING"), SubLObjectFactory.makeSymbol("LENGTH"), SubLObjectFactory.makeSymbol("LAST-IDX"), SubLObjectFactory.makeSymbol("INSIDE-CYCL-TAG?"), SubLObjectFactory.makeSymbol("HASH-IDX"), SubLObjectFactory.makeSymbol("COLON-IDX"), SubLObjectFactory.makeSymbol("LT-IDX"), SubLObjectFactory.makeSymbol("VARIABLE-IDX"), SubLObjectFactory.makeSymbol("URL-IDX"), SubLObjectFactory.makeSymbol("URL-END-IDX"), SubLObjectFactory.makeSymbol("LINK-FUNCTION"), SubLObjectFactory.makeSymbol("REQUIRE-EXACT?") });
        $list3 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("STRING"), SubLObjectFactory.makeKeyword("LENGTH"), SubLObjectFactory.makeKeyword("LAST-IDX"), SubLObjectFactory.makeKeyword("INSIDE-CYCL-TAG?"), SubLObjectFactory.makeKeyword("HASH-IDX"), SubLObjectFactory.makeKeyword("COLON-IDX"), SubLObjectFactory.makeKeyword("LT-IDX"), SubLObjectFactory.makeKeyword("VARIABLE-IDX"), SubLObjectFactory.makeKeyword("URL-IDX"), SubLObjectFactory.makeKeyword("URL-END-IDX"), SubLObjectFactory.makeKeyword("LINK-FUNCTION"), SubLObjectFactory.makeKeyword("REQUIRE-EXACT?") });
        $list4 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("HCS-STRING"), SubLObjectFactory.makeSymbol("HCS-LENGTH"), SubLObjectFactory.makeSymbol("HCS-LAST-IDX"), SubLObjectFactory.makeSymbol("HCS-INSIDE-CYCL-TAG?"), SubLObjectFactory.makeSymbol("HCS-HASH-IDX"), SubLObjectFactory.makeSymbol("HCS-COLON-IDX"), SubLObjectFactory.makeSymbol("HCS-LT-IDX"), SubLObjectFactory.makeSymbol("HCS-VARIABLE-IDX"), SubLObjectFactory.makeSymbol("HCS-URL-IDX"), SubLObjectFactory.makeSymbol("HCS-URL-END-IDX"), SubLObjectFactory.makeSymbol("HCS-LINK-FUNCTION"), SubLObjectFactory.makeSymbol("HCS-REQUIRE-EXACT?") });
        $list5 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("_CSETF-HCS-STRING"), SubLObjectFactory.makeSymbol("_CSETF-HCS-LENGTH"), SubLObjectFactory.makeSymbol("_CSETF-HCS-LAST-IDX"), SubLObjectFactory.makeSymbol("_CSETF-HCS-INSIDE-CYCL-TAG?"), SubLObjectFactory.makeSymbol("_CSETF-HCS-HASH-IDX"), SubLObjectFactory.makeSymbol("_CSETF-HCS-COLON-IDX"), SubLObjectFactory.makeSymbol("_CSETF-HCS-LT-IDX"), SubLObjectFactory.makeSymbol("_CSETF-HCS-VARIABLE-IDX"), SubLObjectFactory.makeSymbol("_CSETF-HCS-URL-IDX"), SubLObjectFactory.makeSymbol("_CSETF-HCS-URL-END-IDX"), SubLObjectFactory.makeSymbol("_CSETF-HCS-LINK-FUNCTION"), SubLObjectFactory.makeSymbol("_CSETF-HCS-REQUIRE-EXACT?") });
        $sym6$PRINT_HTML_CYCL_STRING_PRINTER = SubLObjectFactory.makeSymbol("PRINT-HTML-CYCL-STRING-PRINTER");
        $sym7$HTML_CYCL_STRING_PRINTER_PRINT_FUNCTION_TRAMPOLINE = SubLObjectFactory.makeSymbol("HTML-CYCL-STRING-PRINTER-PRINT-FUNCTION-TRAMPOLINE");
        $list8 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("HTML-CYCL-STRING-PRINTER-P"));
        $sym9$HCS_STRING = SubLObjectFactory.makeSymbol("HCS-STRING");
        $sym10$_CSETF_HCS_STRING = SubLObjectFactory.makeSymbol("_CSETF-HCS-STRING");
        $sym11$HCS_LENGTH = SubLObjectFactory.makeSymbol("HCS-LENGTH");
        $sym12$_CSETF_HCS_LENGTH = SubLObjectFactory.makeSymbol("_CSETF-HCS-LENGTH");
        $sym13$HCS_LAST_IDX = SubLObjectFactory.makeSymbol("HCS-LAST-IDX");
        $sym14$_CSETF_HCS_LAST_IDX = SubLObjectFactory.makeSymbol("_CSETF-HCS-LAST-IDX");
        $sym15$HCS_INSIDE_CYCL_TAG_ = SubLObjectFactory.makeSymbol("HCS-INSIDE-CYCL-TAG?");
        $sym16$_CSETF_HCS_INSIDE_CYCL_TAG_ = SubLObjectFactory.makeSymbol("_CSETF-HCS-INSIDE-CYCL-TAG?");
        $sym17$HCS_HASH_IDX = SubLObjectFactory.makeSymbol("HCS-HASH-IDX");
        $sym18$_CSETF_HCS_HASH_IDX = SubLObjectFactory.makeSymbol("_CSETF-HCS-HASH-IDX");
        $sym19$HCS_COLON_IDX = SubLObjectFactory.makeSymbol("HCS-COLON-IDX");
        $sym20$_CSETF_HCS_COLON_IDX = SubLObjectFactory.makeSymbol("_CSETF-HCS-COLON-IDX");
        $sym21$HCS_LT_IDX = SubLObjectFactory.makeSymbol("HCS-LT-IDX");
        $sym22$_CSETF_HCS_LT_IDX = SubLObjectFactory.makeSymbol("_CSETF-HCS-LT-IDX");
        $sym23$HCS_VARIABLE_IDX = SubLObjectFactory.makeSymbol("HCS-VARIABLE-IDX");
        $sym24$_CSETF_HCS_VARIABLE_IDX = SubLObjectFactory.makeSymbol("_CSETF-HCS-VARIABLE-IDX");
        $sym25$HCS_URL_IDX = SubLObjectFactory.makeSymbol("HCS-URL-IDX");
        $sym26$_CSETF_HCS_URL_IDX = SubLObjectFactory.makeSymbol("_CSETF-HCS-URL-IDX");
        $sym27$HCS_URL_END_IDX = SubLObjectFactory.makeSymbol("HCS-URL-END-IDX");
        $sym28$_CSETF_HCS_URL_END_IDX = SubLObjectFactory.makeSymbol("_CSETF-HCS-URL-END-IDX");
        $sym29$HCS_LINK_FUNCTION = SubLObjectFactory.makeSymbol("HCS-LINK-FUNCTION");
        $sym30$_CSETF_HCS_LINK_FUNCTION = SubLObjectFactory.makeSymbol("_CSETF-HCS-LINK-FUNCTION");
        $sym31$HCS_REQUIRE_EXACT_ = SubLObjectFactory.makeSymbol("HCS-REQUIRE-EXACT?");
        $sym32$_CSETF_HCS_REQUIRE_EXACT_ = SubLObjectFactory.makeSymbol("_CSETF-HCS-REQUIRE-EXACT?");
        $kw33$STRING = SubLObjectFactory.makeKeyword("STRING");
        $kw34$LENGTH = SubLObjectFactory.makeKeyword("LENGTH");
        $kw35$LAST_IDX = SubLObjectFactory.makeKeyword("LAST-IDX");
        $kw36$INSIDE_CYCL_TAG_ = SubLObjectFactory.makeKeyword("INSIDE-CYCL-TAG?");
        $kw37$HASH_IDX = SubLObjectFactory.makeKeyword("HASH-IDX");
        $kw38$COLON_IDX = SubLObjectFactory.makeKeyword("COLON-IDX");
        $kw39$LT_IDX = SubLObjectFactory.makeKeyword("LT-IDX");
        $kw40$VARIABLE_IDX = SubLObjectFactory.makeKeyword("VARIABLE-IDX");
        $kw41$URL_IDX = SubLObjectFactory.makeKeyword("URL-IDX");
        $kw42$URL_END_IDX = SubLObjectFactory.makeKeyword("URL-END-IDX");
        $kw43$LINK_FUNCTION = SubLObjectFactory.makeKeyword("LINK-FUNCTION");
        $kw44$REQUIRE_EXACT_ = SubLObjectFactory.makeKeyword("REQUIRE-EXACT?");
        $str45$Invalid_slot__S_for_construction_ = SubLObjectFactory.makeString("Invalid slot ~S for construction function");
        $kw46$BEGIN = SubLObjectFactory.makeKeyword("BEGIN");
        $sym47$MAKE_HTML_CYCL_STRING_PRINTER = SubLObjectFactory.makeSymbol("MAKE-HTML-CYCL-STRING-PRINTER");
        $kw48$SLOT = SubLObjectFactory.makeKeyword("SLOT");
        $kw49$END = SubLObjectFactory.makeKeyword("END");
        $sym50$VISIT_DEFSTRUCT_OBJECT_HTML_CYCL_STRING_PRINTER_METHOD = SubLObjectFactory.makeSymbol("VISIT-DEFSTRUCT-OBJECT-HTML-CYCL-STRING-PRINTER-METHOD");
        $str51$_HTML_CYCL_STRING_PRINTER_ = SubLObjectFactory.makeString("<HTML-CYCL-STRING-PRINTER>");
        $sym52$CB_FORM = SubLObjectFactory.makeSymbol("CB-FORM");
        $kw53$DONE = SubLObjectFactory.makeKeyword("DONE");
        $sym54$MIN = SubLObjectFactory.makeSymbol("MIN");
        $sym55$NULL = SubLObjectFactory.makeSymbol("NULL");
        $str56$__ = SubLObjectFactory.makeString(":?");
        $str57$_a_href___S__A__a_ = SubLObjectFactory.makeString("<a href= ~S>~A</a>");
        $list58 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("es"), (SubLObject)SubLObjectFactory.makeString("es:"));
        $sym59$VALID_CONSTANT_NAME_CHAR_P = SubLObjectFactory.makeSymbol("VALID-CONSTANT-NAME-CHAR-P");
        $list60 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeString("i"), SubLObjectFactory.makeString("b"), SubLObjectFactory.makeString("sub"), SubLObjectFactory.makeString("sup"), SubLObjectFactory.makeString("pre"), SubLObjectFactory.makeString("code"), SubLObjectFactory.makeString("blockquote"), SubLObjectFactory.makeString("p"), SubLObjectFactory.makeString("br") });
        $int61$4096 = SubLObjectFactory.makeInteger(4096);
        $sym62$EL_VARIABLE_CHAR_ = SubLObjectFactory.makeSymbol("EL-VARIABLE-CHAR?");
        $sym63$STRING_ = SubLObjectFactory.makeSymbol("STRING=");
        $str64$_ = SubLObjectFactory.makeString("<");
        $str65$_ = SubLObjectFactory.makeString("/");
        $str66$_ = SubLObjectFactory.makeString(">");
        $str67$code = SubLObjectFactory.makeString("code");
        $str68$pre = SubLObjectFactory.makeString("pre");
    }
    
    public static final class $html_cycl_string_printer_native extends SubLStructNative
    {
        public SubLObject $string;
        public SubLObject $length;
        public SubLObject $last_idx;
        public SubLObject $inside_cycl_tagP;
        public SubLObject $hash_idx;
        public SubLObject $colon_idx;
        public SubLObject $lt_idx;
        public SubLObject $variable_idx;
        public SubLObject $url_idx;
        public SubLObject $url_end_idx;
        public SubLObject $link_function;
        public SubLObject $require_exactP;
        private static final SubLStructDeclNative structDecl;
        
        public $html_cycl_string_printer_native() {
            this.$string = (SubLObject)CommonSymbols.NIL;
            this.$length = (SubLObject)CommonSymbols.NIL;
            this.$last_idx = (SubLObject)CommonSymbols.NIL;
            this.$inside_cycl_tagP = (SubLObject)CommonSymbols.NIL;
            this.$hash_idx = (SubLObject)CommonSymbols.NIL;
            this.$colon_idx = (SubLObject)CommonSymbols.NIL;
            this.$lt_idx = (SubLObject)CommonSymbols.NIL;
            this.$variable_idx = (SubLObject)CommonSymbols.NIL;
            this.$url_idx = (SubLObject)CommonSymbols.NIL;
            this.$url_end_idx = (SubLObject)CommonSymbols.NIL;
            this.$link_function = (SubLObject)CommonSymbols.NIL;
            this.$require_exactP = (SubLObject)CommonSymbols.NIL;
        }
        
        @Override
		public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$html_cycl_string_printer_native.structDecl;
        }
        
        @Override
		public SubLObject getField2() {
            return this.$string;
        }
        
        @Override
		public SubLObject getField3() {
            return this.$length;
        }
        
        @Override
		public SubLObject getField4() {
            return this.$last_idx;
        }
        
        @Override
		public SubLObject getField5() {
            return this.$inside_cycl_tagP;
        }
        
        @Override
		public SubLObject getField6() {
            return this.$hash_idx;
        }
        
        @Override
		public SubLObject getField7() {
            return this.$colon_idx;
        }
        
        @Override
		public SubLObject getField8() {
            return this.$lt_idx;
        }
        
        @Override
		public SubLObject getField9() {
            return this.$variable_idx;
        }
        
        @Override
		public SubLObject getField10() {
            return this.$url_idx;
        }
        
        @Override
		public SubLObject getField11() {
            return this.$url_end_idx;
        }
        
        @Override
		public SubLObject getField12() {
            return this.$link_function;
        }
        
        @Override
		public SubLObject getField13() {
            return this.$require_exactP;
        }
        
        @Override
		public SubLObject setField2(final SubLObject value) {
            return this.$string = value;
        }
        
        @Override
		public SubLObject setField3(final SubLObject value) {
            return this.$length = value;
        }
        
        @Override
		public SubLObject setField4(final SubLObject value) {
            return this.$last_idx = value;
        }
        
        @Override
		public SubLObject setField5(final SubLObject value) {
            return this.$inside_cycl_tagP = value;
        }
        
        @Override
		public SubLObject setField6(final SubLObject value) {
            return this.$hash_idx = value;
        }
        
        @Override
		public SubLObject setField7(final SubLObject value) {
            return this.$colon_idx = value;
        }
        
        @Override
		public SubLObject setField8(final SubLObject value) {
            return this.$lt_idx = value;
        }
        
        @Override
		public SubLObject setField9(final SubLObject value) {
            return this.$variable_idx = value;
        }
        
        @Override
		public SubLObject setField10(final SubLObject value) {
            return this.$url_idx = value;
        }
        
        @Override
		public SubLObject setField11(final SubLObject value) {
            return this.$url_end_idx = value;
        }
        
        @Override
		public SubLObject setField12(final SubLObject value) {
            return this.$link_function = value;
        }
        
        @Override
		public SubLObject setField13(final SubLObject value) {
            return this.$require_exactP = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$html_cycl_string_printer_native.class, html_cycl_string_printer.$sym0$HTML_CYCL_STRING_PRINTER, html_cycl_string_printer.$sym1$HTML_CYCL_STRING_PRINTER_P, html_cycl_string_printer.$list2, html_cycl_string_printer.$list3, new String[] { "$string", "$length", "$last_idx", "$inside_cycl_tagP", "$hash_idx", "$colon_idx", "$lt_idx", "$variable_idx", "$url_idx", "$url_end_idx", "$link_function", "$require_exactP" }, html_cycl_string_printer.$list4, html_cycl_string_printer.$list5, html_cycl_string_printer.$sym6$PRINT_HTML_CYCL_STRING_PRINTER);
        }
    }
    
    public static final class $html_cycl_string_printer_p$UnaryFunction extends UnaryFunction
    {
        public $html_cycl_string_printer_p$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("HTML-CYCL-STRING-PRINTER-P"));
        }
        
        @Override
		public SubLObject processItem(final SubLObject arg1) {
            return html_cycl_string_printer.html_cycl_string_printer_p(arg1);
        }
    }
}

/*

	Total time: 203 ms
	
*/