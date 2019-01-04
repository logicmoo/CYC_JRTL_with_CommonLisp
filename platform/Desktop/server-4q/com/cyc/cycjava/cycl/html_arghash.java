package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import java.util.Map;
import java.util.Iterator;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_macros;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class html_arghash extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.html_arghash";
    public static final String myFingerPrint = "b0731d562dcf1290ce7e0f707503dbbf861322974dac6c5f939a43fbf8a35864";
    @SubLTranslatedFile.SubL(source = "cycl/html-arghash.lisp", position = 4198L)
    private static SubLSymbol $arghash_types$;
    @SubLTranslatedFile.SubL(source = "cycl/html-arghash.lisp", position = 4604L)
    private static SubLSymbol $arghash_types_by_keyword$;
    @SubLTranslatedFile.SubL(source = "cycl/html-arghash.lisp", position = 4722L)
    private static SubLSymbol $arghash_types_by_character$;
    @SubLTranslatedFile.SubL(source = "cycl/html-arghash.lisp", position = 5105L)
    public static SubLSymbol $dtp_arghash_type$;
    private static final SubLString $str0$_;
    private static final SubLSymbol $sym1$ARGHASH_TYPE;
    private static final SubLSymbol $sym2$ARGHASH_TYPE_P;
    private static final SubLList $list3;
    private static final SubLList $list4;
    private static final SubLList $list5;
    private static final SubLList $list6;
    private static final SubLSymbol $sym7$PRINT_ARGHASH_TYPE;
    private static final SubLSymbol $sym8$ARGHASH_TYPE_PRINT_FUNCTION_TRAMPOLINE;
    private static final SubLList $list9;
    private static final SubLSymbol $sym10$ARGHASH_TYPE_NAME;
    private static final SubLSymbol $sym11$_CSETF_ARGHASH_TYPE_NAME;
    private static final SubLSymbol $sym12$ARGHASH_TYPE_KEYWORD;
    private static final SubLSymbol $sym13$_CSETF_ARGHASH_TYPE_KEYWORD;
    private static final SubLSymbol $sym14$ARGHASH_TYPE_CHARACTER;
    private static final SubLSymbol $sym15$_CSETF_ARGHASH_TYPE_CHARACTER;
    private static final SubLSymbol $sym16$ARGHASH_TYPE_STRING_VALIDATOR;
    private static final SubLSymbol $sym17$_CSETF_ARGHASH_TYPE_STRING_VALIDATOR;
    private static final SubLSymbol $sym18$ARGHASH_TYPE_STRING_TO_OBJECT_FN;
    private static final SubLSymbol $sym19$_CSETF_ARGHASH_TYPE_STRING_TO_OBJECT_FN;
    private static final SubLSymbol $sym20$ARGHASH_TYPE_OBJECT_DETECTOR;
    private static final SubLSymbol $sym21$_CSETF_ARGHASH_TYPE_OBJECT_DETECTOR;
    private static final SubLSymbol $sym22$ARGHASH_TYPE_OBJECT_TO_STRING_FN;
    private static final SubLSymbol $sym23$_CSETF_ARGHASH_TYPE_OBJECT_TO_STRING_FN;
    private static final SubLSymbol $sym24$ARGHASH_TYPE_PRIORITY;
    private static final SubLSymbol $sym25$_CSETF_ARGHASH_TYPE_PRIORITY;
    private static final SubLSymbol $kw26$NAME;
    private static final SubLSymbol $kw27$KEYWORD;
    private static final SubLSymbol $kw28$CHARACTER;
    private static final SubLSymbol $kw29$STRING_VALIDATOR;
    private static final SubLSymbol $kw30$STRING_TO_OBJECT_FN;
    private static final SubLSymbol $kw31$OBJECT_DETECTOR;
    private static final SubLSymbol $kw32$OBJECT_TO_STRING_FN;
    private static final SubLSymbol $kw33$PRIORITY;
    private static final SubLString $str34$Invalid_slot__S_for_construction_;
    private static final SubLSymbol $kw35$BEGIN;
    private static final SubLSymbol $sym36$MAKE_ARGHASH_TYPE;
    private static final SubLSymbol $kw37$SLOT;
    private static final SubLSymbol $kw38$END;
    private static final SubLSymbol $sym39$VISIT_DEFSTRUCT_OBJECT_ARGHASH_TYPE_METHOD;
    private static final SubLList $list40;
    private static final SubLSymbol $sym41$NEW_ARGHASH_TYPE;
    private static final SubLSymbol $sym42$CLET;
    private static final SubLSymbol $sym43$QUOTE;
    private static final SubLSymbol $sym44$CSETF;
    private static final SubLSymbol $sym45$SETHASH;
    private static final SubLSymbol $sym46$_ARGHASH_TYPES_BY_KEYWORD_;
    private static final SubLSymbol $sym47$_ARGHASH_TYPES_BY_CHARACTER_;
    private static final SubLSymbol $sym48$CSETQ;
    private static final SubLSymbol $sym49$_ARGHASH_TYPES_;
    private static final SubLSymbol $sym50$CONS;
    private static final SubLSymbol $sym51$DELETE;
    private static final SubLList $list52;
    private static final SubLSymbol $sym53$_;
    private static final SubLList $list54;
    private static final SubLSymbol $sym55$KEYWORD;
    private static final SubLString $str56$_A;
    private static final SubLString $str57$;
    private static final SubLList $list58;
    private static final SubLSymbol $sym59$FORT;
    private static final SubLList $list60;
    private static final SubLSymbol $sym61$ASSERTION;
    private static final SubLList $list62;
    private static final SubLSymbol $sym63$INTEGER;
    private static final SubLList $list64;
    private static final SubLSymbol $sym65$BOOLEAN;
    private static final SubLString $str66$NIL;
    private static final SubLString $str67$nil;
    private static final SubLString $str68$t;
    private static final SubLList $list69;
    private static final SubLSymbol $sym70$LIST;
    private static final SubLString $str71$_;
    private static final SubLString $str72$_20;
    private static final SubLString $str73$_;
    private static final SubLSymbol $sym74$ARGHASH_PREFIXED_STRING_TO_OBJECT;
    private static final SubLSymbol $sym75$STRINGP;
    private static final SubLString $str76$_;
    private static final SubLString $str77$_;
    private static final SubLString $str78$_;
    private static final SubLSymbol $sym79$CCONCATENATE;
    private static final SubLList $list80;
    private static final SubLSymbol $sym81$EL_FORMULA;
    private static final SubLList $list82;
    private static final SubLSymbol $sym83$DEFAULT;
    private static final SubLSymbol $kw84$DEFAULT;
    private static final SubLString $str85$___A;
    private static final SubLInteger $int86$32;
    private static final SubLSymbol $kw87$JUST_FORT;
    private static final SubLSymbol $kw88$JUST_STRING;
    private static final SubLString $str89$_;
    private static final SubLString $str90$_;
    private static final SubLList $list91;
    private static final SubLList $list92;
    private static final SubLSymbol $kw93$ALLOW_OTHER_KEYS;
    private static final SubLSymbol $kw94$TARGET;
    private static final SubLSymbol $kw95$SCRIPT;
    private static final SubLSymbol $kw96$STYLE;
    private static final SubLSymbol $sym97$HREF;
    private static final SubLSymbol $sym98$FORMAT;
    private static final SubLString $str99$_A__A;
    private static final SubLSymbol $sym100$_CYC_CGI_PROGRAM_;
    private static final SubLSymbol $sym101$HTML_ARGHASH_HREF;
    private static final SubLSymbol $sym102$HTML_FANCY_ANCHOR;
    private static final SubLSymbol $kw103$HREF;
    private static final SubLList $list104;
    private static final SubLList $list105;
    private static final SubLList $list106;
    private static final SubLSymbol $kw107$MULTIPLE;
    private static final SubLSymbol $kw108$SIZE;
    private static final SubLSymbol $kw109$ONCHANGE;
    private static final SubLSymbol $sym110$KEY_STRING;
    private static final SubLSymbol $sym111$ARGHASH_MAKE_KEY_STRING;
    private static final SubLSymbol $sym112$HTML_FANCY_SELECT;
    private static final SubLList $list113;
    private static final SubLSymbol $sym114$VALUE_STRING;
    private static final SubLSymbol $sym115$SELECTED;
    private static final SubLSymbol $sym116$MEMBER_EQUAL_;
    private static final SubLSymbol $sym117$GET_ARGHASH_VALUE_LIST;
    private static final SubLSymbol $sym118$ARGHASH_GET_STRING;
    private static final SubLSymbol $sym119$HTML_FANCY_OPTION;
    private static final SubLSymbol $kw120$SELECTED;
    private static final SubLSymbol $kw121$VALUE;
    private static final SubLList $list122;
    private static final SubLSymbol $sym123$VALUE;
    private static final SubLSymbol $sym124$VALUE_STRING;
    private static final SubLSymbol $sym125$HTML_ARGHASH_FANCY_SELECT;
    private static final SubLSymbol $sym126$CDOLIST_MULTIPLE;
    private static final SubLSymbol $sym127$HTML_ARGHASH_FANCY_OPTION;
    private static final SubLSymbol $sym128$HTML_PRINC;
    private static final SubLSymbol $kw129$BOOLEAN;
    private static final SubLString $str130$Complete;
    private static final SubLString $str131$virtual;
    private static final SubLSymbol $kw132$NBSP;
    private static final SubLSymbol $kw133$FORT;
    private static final SubLString $str134$Cyclify;
    private static final SubLString $str135$Clear;
    private static final SubLSymbol $kw136$EL_FORMULA;
    private static final SubLSymbol $kw137$INPUT_NAME;
    private static final SubLSymbol $kw138$COMPLETE_LABEL;
    private static final SubLSymbol $kw139$CYCLIFY_LABEL;
    private static final SubLSymbol $kw140$CLEAR_LABEL;
    private static final SubLSymbol $kw141$HEIGHT;
    private static final SubLSymbol $kw142$WIDTH;
    private static final SubLSymbol $sym143$GENERATE_PHRASE;
    private static final SubLString $str144$_NEW_FORT;
    private static final SubLString $str145$_STRING;
    private static final SubLString $str146$_NEW_STRING;
    private static final SubLString $str147$_UNDO;
    private static final SubLString $str148$_CANDIDATES;
    private static final SubLString $str149$_DONE;
    private static final SubLString $str150$_ERROR;
    private static final SubLString $str151$_2;
    private static final SubLString $str152$_;
    private static final SubLString $str153$onChange_javascript_this_form_sub;
    private static final SubLString $str154$___;
    private static final SubLString $str155$Undo;
    private static final SubLString $str156$Submit;
    private static final SubLSymbol $kw157$SUBMIT;
    private static final SubLSymbol $kw158$STRING;
    private static final SubLString $str159$_nl_fort_input_force_default_if_u;
    private static final SubLString $str160$___setting_to_;
    private static final SubLSymbol $sym161$TERMS_FOR_BROWSING;
    private static final SubLString $str162$_nl_fort_input_validate_;
    private static final SubLString $str163$___;
    private static final SubLString $str164$Case_1__clicked_undo_button;
    private static final SubLString $str165$Case_2__chose_fort_from_pulldown;
    private static final SubLString $str166$Case_3__text_typed_in__;
    private static final SubLSymbol $sym167$RELEVANT_MT_IS_EVERYTHING;
    private static final SubLObject $const168$EverythingPSC;
    private static final SubLString $str169$Case_3a__No_parse_for___A_;
    private static final SubLString $str170$_called__;
    private static final SubLString $str171$__not_found_;
    private static final SubLString $str172$_;
    private static final SubLString $str173$Case_3b__One_parse_for___A_____A;
    private static final SubLString $str174$Case_3c__Many_parses_for___A_____;
    private static final SubLString $str175$Case_4__no_text_typed_in;
    private static final SubLString $str176$Case_5__fort_set__so_use_fort_as_;
    private static final SubLString $str177$Case_6__fallthrough_;
    private static final SubLString $str178$_REMOVE;
    private static final SubLString $str179$Remove;
    private static final SubLString $str180$_max_reached_;
    private static final SubLString $str181$_max_exceeded_;
    private static final SubLString $str182$_more_required_;
    private static final SubLSymbol $sym183$FORT_NAME;
    private static final SubLString $str184$_key_list_length_reached_;
    private static final SubLSymbol $sym185$NON_NEGATIVE_INTEGER_P;
    private static final SubLString $str186$X;
    
    @SubLTranslatedFile.SubL(source = "cycl/html-arghash.lisp", position = 4844L)
    public static SubLObject print_arghash_type(final SubLObject v_object, final SubLObject stream, final SubLObject depth) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (html_arghash.NIL != print_high.$print_level$.getDynamicValue(thread) && depth.numG(print_high.$print_level$.getDynamicValue(thread))) {
            print_high.princ((SubLObject)html_arghash.$str0$_, stream);
        }
        else if (html_arghash.NIL != print_high.$print_readably$.getDynamicValue(thread)) {
            print_high.print_not_readable(v_object, stream);
        }
        else {
            print_macros.print_unreadable_object_preamble(stream, v_object, (SubLObject)html_arghash.T, (SubLObject)html_arghash.T);
            print_high.princ(arghash_type_name(v_object), stream);
            print_macros.print_unreadable_object_postamble(stream, v_object, (SubLObject)html_arghash.NIL, (SubLObject)html_arghash.NIL);
        }
        return v_object;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-arghash.lisp", position = 5105L)
    public static SubLObject arghash_type_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        print_arghash_type(v_object, stream, (SubLObject)html_arghash.ZERO_INTEGER);
        return (SubLObject)html_arghash.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-arghash.lisp", position = 5105L)
    public static SubLObject arghash_type_p(final SubLObject v_object) {
        return (SubLObject)((v_object.getClass() == $arghash_type_native.class) ? html_arghash.T : html_arghash.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-arghash.lisp", position = 5105L)
    public static SubLObject arghash_type_name(final SubLObject v_object) {
        assert html_arghash.NIL != arghash_type_p(v_object) : v_object;
        return v_object.getField2();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-arghash.lisp", position = 5105L)
    public static SubLObject arghash_type_keyword(final SubLObject v_object) {
        assert html_arghash.NIL != arghash_type_p(v_object) : v_object;
        return v_object.getField3();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-arghash.lisp", position = 5105L)
    public static SubLObject arghash_type_character(final SubLObject v_object) {
        assert html_arghash.NIL != arghash_type_p(v_object) : v_object;
        return v_object.getField4();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-arghash.lisp", position = 5105L)
    public static SubLObject arghash_type_string_validator(final SubLObject v_object) {
        assert html_arghash.NIL != arghash_type_p(v_object) : v_object;
        return v_object.getField5();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-arghash.lisp", position = 5105L)
    public static SubLObject arghash_type_string_to_object_fn(final SubLObject v_object) {
        assert html_arghash.NIL != arghash_type_p(v_object) : v_object;
        return v_object.getField6();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-arghash.lisp", position = 5105L)
    public static SubLObject arghash_type_object_detector(final SubLObject v_object) {
        assert html_arghash.NIL != arghash_type_p(v_object) : v_object;
        return v_object.getField7();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-arghash.lisp", position = 5105L)
    public static SubLObject arghash_type_object_to_string_fn(final SubLObject v_object) {
        assert html_arghash.NIL != arghash_type_p(v_object) : v_object;
        return v_object.getField8();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-arghash.lisp", position = 5105L)
    public static SubLObject arghash_type_priority(final SubLObject v_object) {
        assert html_arghash.NIL != arghash_type_p(v_object) : v_object;
        return v_object.getField9();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-arghash.lisp", position = 5105L)
    public static SubLObject _csetf_arghash_type_name(final SubLObject v_object, final SubLObject value) {
        assert html_arghash.NIL != arghash_type_p(v_object) : v_object;
        return v_object.setField2(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-arghash.lisp", position = 5105L)
    public static SubLObject _csetf_arghash_type_keyword(final SubLObject v_object, final SubLObject value) {
        assert html_arghash.NIL != arghash_type_p(v_object) : v_object;
        return v_object.setField3(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-arghash.lisp", position = 5105L)
    public static SubLObject _csetf_arghash_type_character(final SubLObject v_object, final SubLObject value) {
        assert html_arghash.NIL != arghash_type_p(v_object) : v_object;
        return v_object.setField4(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-arghash.lisp", position = 5105L)
    public static SubLObject _csetf_arghash_type_string_validator(final SubLObject v_object, final SubLObject value) {
        assert html_arghash.NIL != arghash_type_p(v_object) : v_object;
        return v_object.setField5(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-arghash.lisp", position = 5105L)
    public static SubLObject _csetf_arghash_type_string_to_object_fn(final SubLObject v_object, final SubLObject value) {
        assert html_arghash.NIL != arghash_type_p(v_object) : v_object;
        return v_object.setField6(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-arghash.lisp", position = 5105L)
    public static SubLObject _csetf_arghash_type_object_detector(final SubLObject v_object, final SubLObject value) {
        assert html_arghash.NIL != arghash_type_p(v_object) : v_object;
        return v_object.setField7(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-arghash.lisp", position = 5105L)
    public static SubLObject _csetf_arghash_type_object_to_string_fn(final SubLObject v_object, final SubLObject value) {
        assert html_arghash.NIL != arghash_type_p(v_object) : v_object;
        return v_object.setField8(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-arghash.lisp", position = 5105L)
    public static SubLObject _csetf_arghash_type_priority(final SubLObject v_object, final SubLObject value) {
        assert html_arghash.NIL != arghash_type_p(v_object) : v_object;
        return v_object.setField9(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-arghash.lisp", position = 5105L)
    public static SubLObject make_arghash_type(SubLObject arglist) {
        if (arglist == html_arghash.UNPROVIDED) {
            arglist = (SubLObject)html_arghash.NIL;
        }
        final SubLObject v_new = (SubLObject)new $arghash_type_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = (SubLObject)html_arghash.NIL, next = arglist; html_arghash.NIL != next; next = conses_high.cddr(next)) {
            current_arg = next.first();
            current_value = conses_high.cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql((SubLObject)html_arghash.$kw26$NAME)) {
                _csetf_arghash_type_name(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)html_arghash.$kw27$KEYWORD)) {
                _csetf_arghash_type_keyword(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)html_arghash.$kw28$CHARACTER)) {
                _csetf_arghash_type_character(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)html_arghash.$kw29$STRING_VALIDATOR)) {
                _csetf_arghash_type_string_validator(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)html_arghash.$kw30$STRING_TO_OBJECT_FN)) {
                _csetf_arghash_type_string_to_object_fn(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)html_arghash.$kw31$OBJECT_DETECTOR)) {
                _csetf_arghash_type_object_detector(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)html_arghash.$kw32$OBJECT_TO_STRING_FN)) {
                _csetf_arghash_type_object_to_string_fn(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)html_arghash.$kw33$PRIORITY)) {
                _csetf_arghash_type_priority(v_new, current_value);
            }
            else {
                Errors.error((SubLObject)html_arghash.$str34$Invalid_slot__S_for_construction_, current_arg);
            }
        }
        return v_new;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-arghash.lisp", position = 5105L)
    public static SubLObject visit_defstruct_arghash_type(final SubLObject obj, final SubLObject visitor_fn) {
        Functions.funcall(visitor_fn, obj, (SubLObject)html_arghash.$kw35$BEGIN, (SubLObject)html_arghash.$sym36$MAKE_ARGHASH_TYPE, (SubLObject)html_arghash.EIGHT_INTEGER);
        Functions.funcall(visitor_fn, obj, (SubLObject)html_arghash.$kw37$SLOT, (SubLObject)html_arghash.$kw26$NAME, arghash_type_name(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)html_arghash.$kw37$SLOT, (SubLObject)html_arghash.$kw27$KEYWORD, arghash_type_keyword(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)html_arghash.$kw37$SLOT, (SubLObject)html_arghash.$kw28$CHARACTER, arghash_type_character(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)html_arghash.$kw37$SLOT, (SubLObject)html_arghash.$kw29$STRING_VALIDATOR, arghash_type_string_validator(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)html_arghash.$kw37$SLOT, (SubLObject)html_arghash.$kw30$STRING_TO_OBJECT_FN, arghash_type_string_to_object_fn(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)html_arghash.$kw37$SLOT, (SubLObject)html_arghash.$kw31$OBJECT_DETECTOR, arghash_type_object_detector(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)html_arghash.$kw37$SLOT, (SubLObject)html_arghash.$kw32$OBJECT_TO_STRING_FN, arghash_type_object_to_string_fn(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)html_arghash.$kw37$SLOT, (SubLObject)html_arghash.$kw33$PRIORITY, arghash_type_priority(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)html_arghash.$kw38$END, (SubLObject)html_arghash.$sym36$MAKE_ARGHASH_TYPE, (SubLObject)html_arghash.EIGHT_INTEGER);
        return obj;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-arghash.lisp", position = 5105L)
    public static SubLObject visit_defstruct_object_arghash_type_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_arghash_type(obj, visitor_fn);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-arghash.lisp", position = 5294L)
    public static SubLObject defarghash_type(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject name = (SubLObject)html_arghash.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)html_arghash.$list40);
        name = current.first();
        final SubLObject arglist;
        current = (arglist = current.rest());
        final SubLObject new_arghash_type = (SubLObject)html_arghash.$sym41$NEW_ARGHASH_TYPE;
        return (SubLObject)ConsesLow.list((SubLObject)html_arghash.$sym42$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(new_arghash_type, (SubLObject)ConsesLow.list((SubLObject)html_arghash.$sym36$MAKE_ARGHASH_TYPE, (SubLObject)ConsesLow.list((SubLObject)html_arghash.$sym43$QUOTE, arglist)))), (SubLObject)ConsesLow.list((SubLObject)html_arghash.$sym44$CSETF, (SubLObject)ConsesLow.list((SubLObject)html_arghash.$sym10$ARGHASH_TYPE_NAME, new_arghash_type), (SubLObject)ConsesLow.list((SubLObject)html_arghash.$sym43$QUOTE, name)), (SubLObject)ConsesLow.list((SubLObject)html_arghash.$sym45$SETHASH, (SubLObject)ConsesLow.list((SubLObject)html_arghash.$sym12$ARGHASH_TYPE_KEYWORD, new_arghash_type), (SubLObject)html_arghash.$sym46$_ARGHASH_TYPES_BY_KEYWORD_, new_arghash_type), (SubLObject)ConsesLow.list((SubLObject)html_arghash.$sym45$SETHASH, (SubLObject)ConsesLow.list((SubLObject)html_arghash.$sym14$ARGHASH_TYPE_CHARACTER, new_arghash_type), (SubLObject)html_arghash.$sym47$_ARGHASH_TYPES_BY_CHARACTER_, new_arghash_type), (SubLObject)ConsesLow.list((SubLObject)html_arghash.$sym48$CSETQ, (SubLObject)html_arghash.$sym49$_ARGHASH_TYPES_, (SubLObject)ConsesLow.list((SubLObject)html_arghash.$sym50$CONS, new_arghash_type, (SubLObject)ConsesLow.listS((SubLObject)html_arghash.$sym51$DELETE, (SubLObject)ConsesLow.list((SubLObject)html_arghash.$sym43$QUOTE, name), (SubLObject)html_arghash.$list52))));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-arghash.lisp", position = 5868L)
    public static SubLObject arghash_keyword_to_arghash_type(final SubLObject keyword) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return Hashtables.gethash(keyword, html_arghash.$arghash_types_by_keyword$.getDynamicValue(thread), (SubLObject)html_arghash.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-arghash.lisp", position = 5981L)
    public static SubLObject arghash_character_to_arghash_type(final SubLObject v_char) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return Hashtables.gethash(v_char, html_arghash.$arghash_types_by_character$.getDynamicValue(thread), (SubLObject)html_arghash.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-arghash.lisp", position = 6092L)
    public static SubLObject arghash_keywordP(final SubLObject keyword) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (html_arghash.NIL != Hashtables.gethash(keyword, html_arghash.$arghash_types_by_keyword$.getDynamicValue(thread), (SubLObject)html_arghash.UNPROVIDED)) {
            return (SubLObject)html_arghash.T;
        }
        return (SubLObject)html_arghash.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-arghash.lisp", position = 6222L)
    public static SubLObject arghash_types() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return Sort.sort(conses_high.copy_list(html_arghash.$arghash_types$.getDynamicValue(thread)), Symbols.symbol_function((SubLObject)html_arghash.$sym53$_), (SubLObject)html_arghash.$sym24$ARGHASH_TYPE_PRIORITY);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-arghash.lisp", position = 6327L)
    public static SubLObject arghash_string_to_keyword(final SubLObject string) {
        return string_utilities.keyword_from_string(Strings.string_upcase(string, (SubLObject)html_arghash.UNPROVIDED, (SubLObject)html_arghash.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-arghash.lisp", position = 6515L)
    public static SubLObject arghash_keyword_to_string(final SubLObject keyword) {
        return Strings.string_downcase(string_utilities.string_from_keyword(keyword), (SubLObject)html_arghash.UNPROVIDED, (SubLObject)html_arghash.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-arghash.lisp", position = 6896L)
    public static SubLObject arghash_fort_to_string(final SubLObject fort) {
        if (html_arghash.NIL != constant_handles.constant_p(fort)) {
            return PrintLow.format((SubLObject)html_arghash.NIL, (SubLObject)html_arghash.$str56$_A, constants_high.constant_internal_id(fort));
        }
        if (html_arghash.NIL != nart_handles.nart_p(fort)) {
            return PrintLow.format((SubLObject)html_arghash.NIL, (SubLObject)html_arghash.$str56$_A, Numbers.minus(nart_handles.nart_id(fort)));
        }
        return (SubLObject)html_arghash.$str57$;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-arghash.lisp", position = 7119L)
    public static SubLObject arghash_string_to_fort(final SubLObject string) {
        SubLObject result = (SubLObject)html_arghash.NIL;
        if (html_arghash.NIL != number_utilities.number_string_p(string)) {
            final SubLObject v_int = reader.parse_integer(string, (SubLObject)html_arghash.UNPROVIDED, (SubLObject)html_arghash.UNPROVIDED, (SubLObject)html_arghash.UNPROVIDED, (SubLObject)html_arghash.UNPROVIDED);
            if (v_int.numGE((SubLObject)html_arghash.ZERO_INTEGER)) {
                result = constants_high.find_constant_by_internal_id(v_int);
            }
            else if (v_int.numL((SubLObject)html_arghash.ZERO_INTEGER)) {
                result = nart_handles.find_nart_by_id(Numbers.minus(v_int));
            }
        }
        else {
            result = cb_utilities.cb_guess_fort(string, (SubLObject)html_arghash.UNPROVIDED);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-arghash.lisp", position = 7729L)
    public static SubLObject arghash_assertion_to_string(final SubLObject assertion) {
        return PrintLow.format((SubLObject)html_arghash.NIL, (SubLObject)html_arghash.$str56$_A, assertion_handles.assertion_id(assertion));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-arghash.lisp", position = 7838L)
    public static SubLObject arghash_string_to_assertion(final SubLObject string) {
        SubLObject result = (SubLObject)html_arghash.NIL;
        if (html_arghash.NIL != number_utilities.number_string_p(string)) {
            final SubLObject v_int = reader.parse_integer(string, (SubLObject)html_arghash.UNPROVIDED, (SubLObject)html_arghash.UNPROVIDED, (SubLObject)html_arghash.UNPROVIDED, (SubLObject)html_arghash.UNPROVIDED);
            result = assertion_handles.find_assertion_by_id(v_int);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-arghash.lisp", position = 8629L)
    public static SubLObject arghash_string_to_integer(final SubLObject string) {
        return reader.parse_integer(string, (SubLObject)html_arghash.ZERO_INTEGER, (SubLObject)html_arghash.NIL, (SubLObject)html_arghash.TEN_INTEGER, (SubLObject)html_arghash.T);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-arghash.lisp", position = 8724L)
    public static SubLObject arghash_integer_to_string(final SubLObject integer) {
        return PrintLow.format((SubLObject)html_arghash.NIL, (SubLObject)html_arghash.$str56$_A, integer);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-arghash.lisp", position = 9111L)
    public static SubLObject arghash_boolean_string_to_boolean(final SubLObject string) {
        if (html_arghash.NIL == string || html_arghash.$str66$NIL.equal(Strings.string_upcase(string, (SubLObject)html_arghash.UNPROVIDED, (SubLObject)html_arghash.UNPROVIDED)) || html_arghash.ZERO_INTEGER.eql(reader.parse_integer(string, (SubLObject)html_arghash.ZERO_INTEGER, (SubLObject)html_arghash.NIL, (SubLObject)html_arghash.TEN_INTEGER, (SubLObject)html_arghash.T)) || html_arghash.NIL != string_utilities.null_stringP(string)) {
            return (SubLObject)html_arghash.NIL;
        }
        return (SubLObject)html_arghash.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-arghash.lisp", position = 9347L)
    public static SubLObject arghash_boolean_detector(final SubLObject v_object) {
        if (v_object == html_arghash.T || v_object == html_arghash.NIL) {
            return (SubLObject)html_arghash.T;
        }
        return (SubLObject)html_arghash.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-arghash.lisp", position = 9480L)
    public static SubLObject arghash_boolean_to_boolean_string(final SubLObject v_boolean) {
        if (html_arghash.NIL == v_boolean) {
            return (SubLObject)html_arghash.$str67$nil;
        }
        return (SubLObject)html_arghash.$str68$t;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-arghash.lisp", position = 9850L)
    public static SubLObject arghash_prefixed_string_to_object(final SubLObject prefixed_string) {
        final SubLObject arghash_type = arghash_character_to_arghash_type(Strings.sublisp_char(prefixed_string, (SubLObject)html_arghash.ZERO_INTEGER));
        SubLObject string = string_utilities.substring(prefixed_string, (SubLObject)html_arghash.ONE_INTEGER, (SubLObject)html_arghash.UNPROVIDED);
        string = string_utilities.string_substitute((SubLObject)html_arghash.$str71$_, (SubLObject)html_arghash.$str72$_20, string, (SubLObject)html_arghash.UNPROVIDED);
        return arghash_handle_string(string, arghash_type);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-arghash.lisp", position = 10158L)
    public static SubLObject arghash_string_to_list(SubLObject string) {
        string = string_utilities.string_substitute((SubLObject)html_arghash.$str72$_20, (SubLObject)html_arghash.$str71$_, string, (SubLObject)html_arghash.UNPROVIDED);
        string = string_utilities.string_substitute((SubLObject)html_arghash.$str71$_, (SubLObject)html_arghash.$str73$_, string, (SubLObject)html_arghash.UNPROVIDED);
        final SubLObject string_list = string_utilities.listify_string(string, (SubLObject)html_arghash.UNPROVIDED).first();
        return list_utilities.tree_gather_transformations((SubLObject)html_arghash.$sym74$ARGHASH_PREFIXED_STRING_TO_OBJECT, string_list, Symbols.symbol_function((SubLObject)html_arghash.$sym75$STRINGP), (SubLObject)html_arghash.UNPROVIDED, (SubLObject)html_arghash.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-arghash.lisp", position = 10468L)
    public static SubLObject arghash_list_to_string(final SubLObject list) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (html_arghash.NIL == list) {
            return (SubLObject)html_arghash.$str57$;
        }
        SubLObject result_list = (SubLObject)html_arghash.NIL;
        result_list = (SubLObject)ConsesLow.cons((SubLObject)html_arghash.$str76$_, result_list);
        SubLObject cdolist_list_var = list;
        SubLObject elem = (SubLObject)html_arghash.NIL;
        elem = cdolist_list_var.first();
        while (html_arghash.NIL != cdolist_list_var) {
            if (elem.isList()) {
                result_list = (SubLObject)ConsesLow.cons(arghash_list_to_string(elem), result_list);
            }
            else {
                thread.resetMultipleValues();
                final SubLObject elem_type_char = arghash_get_handler_char_and_string(elem, (SubLObject)html_arghash.UNPROVIDED);
                final SubLObject elem_string = thread.secondMultipleValue();
                thread.resetMultipleValues();
                if (html_arghash.NIL != elem_type_char) {
                    result_list = (SubLObject)ConsesLow.cons(Sequences.cconcatenate(Strings.make_string((SubLObject)html_arghash.ONE_INTEGER, elem_type_char), elem_string), result_list);
                }
                else {
                    result_list = (SubLObject)ConsesLow.cons(Sequences.cconcatenate((SubLObject)html_arghash.$str77$_, elem_string), result_list);
                }
            }
            result_list = (SubLObject)ConsesLow.cons((SubLObject)html_arghash.$str73$_, result_list);
            cdolist_list_var = cdolist_list_var.rest();
            elem = cdolist_list_var.first();
        }
        result_list = (SubLObject)ConsesLow.cons((SubLObject)html_arghash.$str78$_, result_list);
        return Functions.apply(Symbols.symbol_function((SubLObject)html_arghash.$sym79$CCONCATENATE), Sequences.nreverse(result_list));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-arghash.lisp", position = 11434L)
    public static SubLObject arghash_string_to_el_formula(final SubLObject string) {
        return cb_form_widgets.cb_determine_el_sentence(cb_form_widgets.cb_normalize_formula_string(string), (SubLObject)html_arghash.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-arghash.lisp", position = 11566L)
    public static SubLObject arghash_el_formula_to_string(final SubLObject el_formula) {
        return format_cycl_expression.format_cycl_expression_to_string(el_formula, (SubLObject)html_arghash.ZERO_INTEGER);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-arghash.lisp", position = 11931L)
    public static SubLObject arghash_default_to_string(final SubLObject v_object) {
        if (html_arghash.NIL == v_object) {
            return (SubLObject)html_arghash.$str57$;
        }
        return string_utilities.to_lisp_string(v_object);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-arghash.lisp", position = 12059L)
    public static SubLObject arghash_handle_string(final SubLObject string, final SubLObject arghash_type) {
        if (!string.isString()) {
            return Values.values((SubLObject)html_arghash.NIL, (SubLObject)html_arghash.NIL);
        }
        if (html_arghash.NIL == arghash_type_p(arghash_type)) {
            return Values.values(string, (SubLObject)html_arghash.NIL);
        }
        if (arghash_type_string_validator(arghash_type).isFunctionSpec() && html_arghash.NIL == Functions.funcall(arghash_type_string_validator(arghash_type), string)) {
            return Values.values(string, (SubLObject)html_arghash.NIL);
        }
        return Functions.funcall(arghash_type_string_to_object_fn(arghash_type), string);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-arghash.lisp", position = 12767L)
    public static SubLObject arghash_parse_key_and_value(SubLObject key_string, SubLObject value_string) {
        if (value_string == html_arghash.UNPROVIDED) {
            value_string = (SubLObject)html_arghash.NIL;
        }
        final SubLObject key_length = Sequences.length(key_string);
        final SubLObject key_handler_char = (SubLObject)(html_arghash.ZERO_INTEGER.numL(key_length) ? Sequences.elt(key_string, (SubLObject)html_arghash.ZERO_INTEGER) : html_arghash.NIL);
        final SubLObject value_handler_char = (SubLObject)(html_arghash.ONE_INTEGER.numL(key_length) ? Sequences.elt(key_string, (SubLObject)html_arghash.ONE_INTEGER) : html_arghash.NIL);
        final SubLObject key_arghash_type = arghash_character_to_arghash_type(key_handler_char);
        final SubLObject value_arghash_type = arghash_character_to_arghash_type(value_handler_char);
        SubLObject key = key_string;
        SubLObject value = value_string;
        if (html_arghash.NIL != arghash_type_p(key_arghash_type)) {
            if (html_arghash.NIL != arghash_type_p(value_arghash_type)) {
                key_string = Sequences.subseq(key_string, (SubLObject)html_arghash.TWO_INTEGER, (SubLObject)html_arghash.UNPROVIDED);
            }
            else {
                key_string = Sequences.subseq(key_string, (SubLObject)html_arghash.ONE_INTEGER, (SubLObject)html_arghash.UNPROVIDED);
            }
        }
        if (html_arghash.NIL != arghash_type_p(key_arghash_type)) {
            key = arghash_handle_string(key_string, key_arghash_type);
        }
        if (html_arghash.NIL != arghash_type_p(value_arghash_type)) {
            value = arghash_handle_string(value_string, value_arghash_type);
        }
        return Values.values(key, value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-arghash.lisp", position = 14046L)
    public static SubLObject arghash_get_handler_char_and_string(final SubLObject v_object, SubLObject object_type) {
        if (object_type == html_arghash.UNPROVIDED) {
            object_type = (SubLObject)html_arghash.NIL;
        }
        if (html_arghash.NIL != object_type && object_type != html_arghash.$kw84$DEFAULT) {
            final SubLObject arghash_type = arghash_keyword_to_arghash_type(object_type);
            if (html_arghash.NIL != arghash_type_p(arghash_type)) {
                return Values.values(arghash_type_character(arghash_type), Functions.funcall(arghash_type_object_to_string_fn(arghash_type), v_object));
            }
        }
        SubLObject cdolist_list_var = arghash_types();
        SubLObject arghash_type2 = (SubLObject)html_arghash.NIL;
        arghash_type2 = cdolist_list_var.first();
        while (html_arghash.NIL != cdolist_list_var) {
            if (arghash_type_object_detector(arghash_type2).isFunctionSpec() && html_arghash.NIL != Functions.funcall(arghash_type_object_detector(arghash_type2), v_object) && arghash_type_object_to_string_fn(arghash_type2).isFunctionSpec()) {
                return Values.values(arghash_type_character(arghash_type2), Functions.funcall(arghash_type_object_to_string_fn(arghash_type2), v_object));
            }
            cdolist_list_var = cdolist_list_var.rest();
            arghash_type2 = cdolist_list_var.first();
        }
        return Values.values((SubLObject)Characters.CHAR_underbar, PrintLow.format((SubLObject)html_arghash.NIL, (SubLObject)html_arghash.$str85$___A, v_object));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-arghash.lisp", position = 15147L)
    public static SubLObject arghash_get_string(final SubLObject v_object, SubLObject object_type) {
        if (object_type == html_arghash.UNPROVIDED) {
            object_type = (SubLObject)html_arghash.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject handler_char = arghash_get_handler_char_and_string(v_object, object_type);
        final SubLObject string = thread.secondMultipleValue();
        thread.resetMultipleValues();
        return string;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-arghash.lisp", position = 15450L)
    public static SubLObject arghash_make_key_and_value_strings(final SubLObject key, final SubLObject value, SubLObject value_type) {
        if (value_type == html_arghash.UNPROVIDED) {
            value_type = (SubLObject)html_arghash.$kw84$DEFAULT;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject key_type_char = arghash_get_handler_char_and_string(key, (SubLObject)html_arghash.UNPROVIDED);
        SubLObject key_string = thread.secondMultipleValue();
        thread.resetMultipleValues();
        thread.resetMultipleValues();
        final SubLObject value_type_char = arghash_get_handler_char_and_string(value, value_type);
        final SubLObject value_string = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (html_arghash.NIL != key_type_char) {
            if (html_arghash.NIL == value_type_char) {
                key_string = Sequences.cconcatenate(Strings.make_string((SubLObject)html_arghash.ONE_INTEGER, key_type_char), key_string);
            }
            else {
                key_string = Sequences.cconcatenate(Strings.make_string((SubLObject)html_arghash.ONE_INTEGER, key_type_char), new SubLObject[] { Strings.make_string((SubLObject)html_arghash.ONE_INTEGER, value_type_char), key_string });
            }
        }
        return Values.values(key_string, value_string);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-arghash.lisp", position = 16433L)
    public static SubLObject arghash_make_key_string(final SubLObject key, SubLObject value_type) {
        if (value_type == html_arghash.UNPROVIDED) {
            value_type = (SubLObject)html_arghash.$kw84$DEFAULT;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject key_type_char = arghash_get_handler_char_and_string(key, (SubLObject)html_arghash.UNPROVIDED);
        SubLObject key_string = thread.secondMultipleValue();
        thread.resetMultipleValues();
        final SubLObject value_arghash_type = arghash_keyword_to_arghash_type(value_type);
        SubLObject value_type_char = (SubLObject)html_arghash.NIL;
        if (html_arghash.NIL != arghash_type_p(value_arghash_type)) {
            value_type_char = arghash_type_character(value_arghash_type);
        }
        if (html_arghash.NIL != key_type_char) {
            if (html_arghash.NIL == value_type_char) {
                key_string = Sequences.cconcatenate(Strings.make_string((SubLObject)html_arghash.ONE_INTEGER, key_type_char), new SubLObject[] { Strings.make_string((SubLObject)html_arghash.ONE_INTEGER, (SubLObject)Characters.CHAR_underbar), key_string });
            }
            else {
                key_string = Sequences.cconcatenate(Strings.make_string((SubLObject)html_arghash.ONE_INTEGER, key_type_char), new SubLObject[] { Strings.make_string((SubLObject)html_arghash.ONE_INTEGER, value_type_char), key_string });
            }
        }
        return key_string;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-arghash.lisp", position = 17271L)
    public static SubLObject exists_arghash_valueP(final SubLObject key, final SubLObject arghash) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject value = Hashtables.gethash(key, arghash, (SubLObject)html_arghash.UNPROVIDED);
        final SubLObject existsP = thread.secondMultipleValue();
        thread.resetMultipleValues();
        return existsP;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-arghash.lisp", position = 17664L)
    public static SubLObject get_arghash_value(final SubLObject key, final SubLObject arghash) {
        return hash_table_utilities.gethash_first(key, arghash, (SubLObject)html_arghash.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-arghash.lisp", position = 17749L)
    public static SubLObject get_arghash_value_list(final SubLObject key, final SubLObject arghash) {
        return Hashtables.gethash(key, arghash, (SubLObject)html_arghash.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-arghash.lisp", position = 17833L)
    public static SubLObject set_arghash_value(final SubLObject key, final SubLObject arghash, final SubLObject value) {
        return hash_table_utilities.sethash_first(key, arghash, value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-arghash.lisp", position = 17930L)
    public static SubLObject set_arghash_value_list(final SubLObject key, final SubLObject arghash, final SubLObject value) {
        return Hashtables.sethash(key, arghash, value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-arghash.lisp", position = 18026L)
    public static SubLObject push_arghash_value(final SubLObject key, final SubLObject value, final SubLObject arghash) {
        return hash_table_utilities.push_to_end_hash(key, value, arghash);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-arghash.lisp", position = 18127L)
    public static SubLObject pushnew_arghash_value(final SubLObject key, final SubLObject value, final SubLObject arghash) {
        return hash_table_utilities.pushnew_hash(key, value, arghash, (SubLObject)html_arghash.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-arghash.lisp", position = 18227L)
    public static SubLObject rem_arghash_value(final SubLObject key, final SubLObject arghash) {
        return Hashtables.remhash(key, arghash);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-arghash.lisp", position = 18306L)
    public static SubLObject rem_arghash_values(final SubLObject key_list, final SubLObject arghash) {
        SubLObject cdolist_list_var = key_list;
        SubLObject key = (SubLObject)html_arghash.NIL;
        key = cdolist_list_var.first();
        while (html_arghash.NIL != cdolist_list_var) {
            Hashtables.remhash(key, arghash);
            cdolist_list_var = cdolist_list_var.rest();
            key = cdolist_list_var.first();
        }
        return (SubLObject)html_arghash.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-arghash.lisp", position = 18426L)
    public static SubLObject rem_arghash_values_inverse(final SubLObject neg_key_list, final SubLObject arghash) {
        SubLObject k = (SubLObject)html_arghash.NIL;
        SubLObject v = (SubLObject)html_arghash.NIL;
        final Iterator cdohash_iterator = Hashtables.getEntrySetIterator(arghash);
        try {
            while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                k = Hashtables.getEntryKey(cdohash_entry);
                v = Hashtables.getEntryValue(cdohash_entry);
                if (html_arghash.NIL == subl_promotions.memberP(k, neg_key_list, (SubLObject)html_arghash.UNPROVIDED, (SubLObject)html_arghash.UNPROVIDED)) {
                    Hashtables.remhash(k, arghash);
                }
            }
        }
        finally {
            Hashtables.releaseEntrySetIterator(cdohash_iterator);
        }
        return (SubLObject)html_arghash.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-arghash.lisp", position = 18611L)
    public static SubLObject new_arghash(SubLObject size) {
        if (size == html_arghash.UNPROVIDED) {
            size = (SubLObject)html_arghash.$int86$32;
        }
        return Hashtables.make_hash_table(size, Symbols.symbol_function((SubLObject)html_arghash.EQUAL), (SubLObject)html_arghash.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-arghash.lisp", position = 18783L)
    public static SubLObject arghash_p(final SubLObject v_object) {
        return Types.hash_table_p(v_object);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-arghash.lisp", position = 18849L)
    public static SubLObject copy_arghash(final SubLObject arghash) {
        final SubLObject new_arghash = new_arghash((SubLObject)html_arghash.UNPROVIDED);
        hash_table_utilities.copy_hash_table_values_into(arghash, new_arghash);
        return new_arghash;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-arghash.lisp", position = 19004L)
    public static SubLObject get_arghash_keys(final SubLObject arghash) {
        return hash_table_utilities.hash_table_keys(arghash);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-arghash.lisp", position = 19082L)
    public static SubLObject arglist_to_arghash(final SubLObject args) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject arg_hash = new_arghash((SubLObject)html_arghash.$int86$32);
        SubLObject cdolist_list_var = args;
        SubLObject arg = (SubLObject)html_arghash.NIL;
        arg = cdolist_list_var.first();
        while (html_arghash.NIL != cdolist_list_var) {
            if (arg.isString()) {
                final SubLObject possible_fort = cb_utilities.cb_guess_fort(arg, (SubLObject)html_arghash.UNPROVIDED);
                if (html_arghash.NIL != possible_fort) {
                    hash_table_utilities.push_to_end_hash((SubLObject)html_arghash.$kw87$JUST_FORT, possible_fort, arg_hash);
                }
                else {
                    hash_table_utilities.push_to_end_hash((SubLObject)html_arghash.$kw88$JUST_STRING, arg, arg_hash);
                }
            }
            if (arg.isList()) {
                final SubLObject key_string = arg.first();
                final SubLObject value_string = conses_high.second(arg);
                thread.resetMultipleValues();
                final SubLObject key = arghash_parse_key_and_value(key_string, value_string);
                final SubLObject value = thread.secondMultipleValue();
                thread.resetMultipleValues();
                hash_table_utilities.push_to_end_hash(key, value, arg_hash);
            }
            cdolist_list_var = cdolist_list_var.rest();
            arg = cdolist_list_var.first();
        }
        return arg_hash;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-arghash.lisp", position = 20284L)
    public static SubLObject argassoc_to_arghash(final SubLObject argassoc) {
        final SubLObject arghash = new_arghash((SubLObject)html_arghash.$int86$32);
        SubLObject cdolist_list_var = argassoc;
        SubLObject argpair = (SubLObject)html_arghash.NIL;
        argpair = cdolist_list_var.first();
        while (html_arghash.NIL != cdolist_list_var) {
            if (html_arghash.NIL != forts.fort_p(argpair)) {
                push_arghash_value((SubLObject)html_arghash.$kw87$JUST_FORT, argpair, arghash);
            }
            else if (argpair.isString()) {
                push_arghash_value((SubLObject)html_arghash.$kw88$JUST_STRING, argpair, arghash);
            }
            else if (html_arghash.NIL != list_utilities.lengthE(argpair, (SubLObject)html_arghash.TWO_INTEGER, (SubLObject)html_arghash.UNPROVIDED)) {
                push_arghash_value(argpair.first(), conses_high.second(argpair), arghash);
            }
            cdolist_list_var = cdolist_list_var.rest();
            argpair = cdolist_list_var.first();
        }
        return arghash;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-arghash.lisp", position = 20680L)
    public static SubLObject html_arghash_href(final SubLObject arghash, final SubLObject html_handler_name) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject href = (SubLObject)html_arghash.NIL;
        SubLObject href_list = (SubLObject)html_arghash.NIL;
        href_list = (SubLObject)ConsesLow.cons(html_handler_name, href_list);
        SubLObject key = (SubLObject)html_arghash.NIL;
        SubLObject value_list = (SubLObject)html_arghash.NIL;
        final Iterator cdohash_iterator = Hashtables.getEntrySetIterator(arghash);
        try {
            while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                key = Hashtables.getEntryKey(cdohash_entry);
                SubLObject cdolist_list_var;
                value_list = (cdolist_list_var = Hashtables.getEntryValue(cdohash_entry));
                SubLObject value = (SubLObject)html_arghash.NIL;
                value = cdolist_list_var.first();
                while (html_arghash.NIL != cdolist_list_var) {
                    thread.resetMultipleValues();
                    final SubLObject key_string = arghash_make_key_and_value_strings(key, value, (SubLObject)html_arghash.UNPROVIDED);
                    final SubLObject value_string = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    href_list = (SubLObject)ConsesLow.cons((SubLObject)html_arghash.$str89$_, href_list);
                    href_list = (SubLObject)ConsesLow.cons(web_utilities.html_url_encode(key_string, (SubLObject)html_arghash.UNPROVIDED), href_list);
                    href_list = (SubLObject)ConsesLow.cons((SubLObject)html_arghash.$str90$_, href_list);
                    href_list = (SubLObject)ConsesLow.cons(web_utilities.html_url_encode(value_string, (SubLObject)html_arghash.UNPROVIDED), href_list);
                    cdolist_list_var = cdolist_list_var.rest();
                    value = cdolist_list_var.first();
                }
            }
        }
        finally {
            Hashtables.releaseEntrySetIterator(cdohash_iterator);
        }
        href = Functions.apply(Symbols.symbol_function((SubLObject)html_arghash.$sym79$CCONCATENATE), Sequences.nreverse(href_list));
        return href;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-arghash.lisp", position = 21452L)
    public static SubLObject html_arghash_fancy_anchor(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)html_arghash.$list91);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject arghash = (SubLObject)html_arghash.NIL;
        SubLObject html_handler_name = (SubLObject)html_arghash.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)html_arghash.$list91);
        arghash = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)html_arghash.$list91);
        html_handler_name = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = (SubLObject)html_arghash.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)html_arghash.NIL;
        SubLObject current_$1 = (SubLObject)html_arghash.NIL;
        while (html_arghash.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)html_arghash.$list91);
            current_$1 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)html_arghash.$list91);
            if (html_arghash.NIL == conses_high.member(current_$1, (SubLObject)html_arghash.$list92, (SubLObject)html_arghash.UNPROVIDED, (SubLObject)html_arghash.UNPROVIDED)) {
                bad = (SubLObject)html_arghash.T;
            }
            if (current_$1 == html_arghash.$kw93$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (html_arghash.NIL != bad && html_arghash.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)html_arghash.$list91);
        }
        final SubLObject name_tail = cdestructuring_bind.property_list_member((SubLObject)html_arghash.$kw26$NAME, current);
        final SubLObject name = (SubLObject)((html_arghash.NIL != name_tail) ? conses_high.cadr(name_tail) : html_arghash.NIL);
        final SubLObject target_tail = cdestructuring_bind.property_list_member((SubLObject)html_arghash.$kw94$TARGET, current);
        final SubLObject target = (SubLObject)((html_arghash.NIL != target_tail) ? conses_high.cadr(target_tail) : html_arghash.NIL);
        final SubLObject script_tail = cdestructuring_bind.property_list_member((SubLObject)html_arghash.$kw95$SCRIPT, current);
        final SubLObject script = (SubLObject)((html_arghash.NIL != script_tail) ? conses_high.cadr(script_tail) : html_arghash.NIL);
        final SubLObject style_tail = cdestructuring_bind.property_list_member((SubLObject)html_arghash.$kw96$STYLE, current);
        final SubLObject style = (SubLObject)((html_arghash.NIL != style_tail) ? conses_high.cadr(style_tail) : html_arghash.NIL);
        final SubLObject body;
        current = (body = temp);
        final SubLObject href = (SubLObject)html_arghash.$sym97$HREF;
        return (SubLObject)ConsesLow.list((SubLObject)html_arghash.$sym42$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(href, (SubLObject)ConsesLow.list((SubLObject)html_arghash.$sym98$FORMAT, (SubLObject)html_arghash.NIL, (SubLObject)html_arghash.$str99$_A__A, (SubLObject)html_arghash.$sym100$_CYC_CGI_PROGRAM_, (SubLObject)ConsesLow.list((SubLObject)html_arghash.$sym101$HTML_ARGHASH_HREF, arghash, html_handler_name)))), (SubLObject)ConsesLow.listS((SubLObject)html_arghash.$sym102$HTML_FANCY_ANCHOR, (SubLObject)ConsesLow.list(new SubLObject[] { html_arghash.$kw103$HREF, href, html_arghash.$kw26$NAME, name, html_arghash.$kw94$TARGET, target, html_arghash.$kw95$SCRIPT, script, html_arghash.$kw96$STYLE, style }), ConsesLow.append(body, (SubLObject)html_arghash.NIL)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-arghash.lisp", position = 21828L)
    public static SubLObject html_arghash_checkbox_input(final SubLObject arghash, final SubLObject key, final SubLObject value, SubLObject script, SubLObject onclick) {
        if (script == html_arghash.UNPROVIDED) {
            script = (SubLObject)html_arghash.NIL;
        }
        if (onclick == html_arghash.UNPROVIDED) {
            onclick = (SubLObject)html_arghash.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject values = get_arghash_value_list(key, arghash);
        thread.resetMultipleValues();
        final SubLObject key_string = arghash_make_key_and_value_strings(key, value, (SubLObject)html_arghash.UNPROVIDED);
        final SubLObject value_string = thread.secondMultipleValue();
        thread.resetMultipleValues();
        final SubLObject checkedP = list_utilities.member_equalP(value, values);
        html_utilities.html_checkbox_input(key_string, value_string, checkedP, script, onclick, (SubLObject)html_arghash.UNPROVIDED);
        return (SubLObject)html_arghash.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-arghash.lisp", position = 22330L)
    public static SubLObject html_arghash_radio_input(final SubLObject arghash, final SubLObject key, final SubLObject value) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject values = get_arghash_value_list(key, arghash);
        thread.resetMultipleValues();
        final SubLObject key_string = arghash_make_key_and_value_strings(key, value, (SubLObject)html_arghash.UNPROVIDED);
        final SubLObject value_string = thread.secondMultipleValue();
        thread.resetMultipleValues();
        final SubLObject checkedP = list_utilities.member_equalP(value, values);
        html_utilities.html_radio_input(key_string, value_string, checkedP, (SubLObject)html_arghash.UNPROVIDED);
        return (SubLObject)html_arghash.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-arghash.lisp", position = 22767L)
    public static SubLObject html_arghash_focus_radio_input(final SubLObject arghash, final SubLObject key, final SubLObject focus_key, final SubLObject focus_value_type, final SubLObject value, SubLObject value_type) {
        if (value_type == html_arghash.UNPROVIDED) {
            value_type = (SubLObject)html_arghash.$kw84$DEFAULT;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject values = get_arghash_value_list(key, arghash);
        final SubLObject focus = arghash_make_key_string(focus_key, focus_value_type);
        thread.resetMultipleValues();
        final SubLObject key_string = arghash_make_key_and_value_strings(key, value, value_type);
        final SubLObject value_string = thread.secondMultipleValue();
        thread.resetMultipleValues();
        final SubLObject checkedP = list_utilities.member_equalP(value, values);
        html_script_utilities.html_focus_radio_input(key_string, focus, value_string, checkedP, (SubLObject)html_arghash.UNPROVIDED);
        return (SubLObject)html_arghash.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-arghash.lisp", position = 23258L)
    public static SubLObject html_arghash_clear_radio_input(final SubLObject arghash, final SubLObject key, final SubLObject clear_key, final SubLObject clear_value_type, final SubLObject value, SubLObject value_type) {
        if (value_type == html_arghash.UNPROVIDED) {
            value_type = (SubLObject)html_arghash.$kw84$DEFAULT;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject values = get_arghash_value_list(key, arghash);
        final SubLObject clear = arghash_make_key_string(clear_key, clear_value_type);
        thread.resetMultipleValues();
        final SubLObject key_string = arghash_make_key_and_value_strings(key, value, value_type);
        final SubLObject value_string = thread.secondMultipleValue();
        thread.resetMultipleValues();
        final SubLObject checkedP = list_utilities.member_equalP(value, values);
        html_script_utilities.html_clear_radio_input(key_string, clear, value_string, checkedP, (SubLObject)html_arghash.UNPROVIDED);
        return (SubLObject)html_arghash.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-arghash.lisp", position = 23749L)
    public static SubLObject html_arghash_hidden_input(final SubLObject arghash, final SubLObject key, SubLObject default_value, SubLObject id) {
        if (default_value == html_arghash.UNPROVIDED) {
            default_value = (SubLObject)html_arghash.NIL;
        }
        if (id == html_arghash.UNPROVIDED) {
            id = (SubLObject)html_arghash.NIL;
        }
        SubLObject poss_values = get_arghash_value_list(key, arghash);
        if (poss_values.equal((SubLObject)html_arghash.$list104)) {
            poss_values = (SubLObject)html_arghash.NIL;
        }
        if (html_arghash.NIL == poss_values && html_arghash.NIL != default_value) {
            poss_values = (SubLObject)ConsesLow.list(default_value);
        }
        SubLObject cdolist_list_var = poss_values;
        SubLObject poss_value = (SubLObject)html_arghash.NIL;
        poss_value = cdolist_list_var.first();
        while (html_arghash.NIL != cdolist_list_var) {
            html_arghash_hidden_input_force(arghash, key, poss_value, id, (SubLObject)html_arghash.UNPROVIDED);
            cdolist_list_var = cdolist_list_var.rest();
            poss_value = cdolist_list_var.first();
        }
        return (SubLObject)html_arghash.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-arghash.lisp", position = 24310L)
    public static SubLObject html_arghash_hidden_input_force(final SubLObject arghash, final SubLObject key, final SubLObject value, SubLObject value_type, SubLObject id) {
        if (value_type == html_arghash.UNPROVIDED) {
            value_type = (SubLObject)html_arghash.$kw84$DEFAULT;
        }
        if (id == html_arghash.UNPROVIDED) {
            id = (SubLObject)html_arghash.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject key_string = arghash_make_key_and_value_strings(key, value, value_type);
        final SubLObject value_string = thread.secondMultipleValue();
        thread.resetMultipleValues();
        html_utilities.html_hidden_input(key_string, value_string, id);
        return (SubLObject)html_arghash.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-arghash.lisp", position = 24698L)
    public static SubLObject html_arghash_fancy_select(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)html_arghash.$list105);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject key = (SubLObject)html_arghash.NIL;
        SubLObject value_type = (SubLObject)html_arghash.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)html_arghash.$list105);
        key = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)html_arghash.$list105);
        value_type = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = (SubLObject)html_arghash.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)html_arghash.NIL;
        SubLObject current_$2 = (SubLObject)html_arghash.NIL;
        while (html_arghash.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)html_arghash.$list105);
            current_$2 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)html_arghash.$list105);
            if (html_arghash.NIL == conses_high.member(current_$2, (SubLObject)html_arghash.$list106, (SubLObject)html_arghash.UNPROVIDED, (SubLObject)html_arghash.UNPROVIDED)) {
                bad = (SubLObject)html_arghash.T;
            }
            if (current_$2 == html_arghash.$kw93$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (html_arghash.NIL != bad && html_arghash.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)html_arghash.$list105);
        }
        final SubLObject multiple_tail = cdestructuring_bind.property_list_member((SubLObject)html_arghash.$kw107$MULTIPLE, current);
        final SubLObject multiple = (SubLObject)((html_arghash.NIL != multiple_tail) ? conses_high.cadr(multiple_tail) : html_arghash.NIL);
        final SubLObject size_tail = cdestructuring_bind.property_list_member((SubLObject)html_arghash.$kw108$SIZE, current);
        final SubLObject size = (SubLObject)((html_arghash.NIL != size_tail) ? conses_high.cadr(size_tail) : html_arghash.NIL);
        final SubLObject script_tail = cdestructuring_bind.property_list_member((SubLObject)html_arghash.$kw95$SCRIPT, current);
        final SubLObject script = (SubLObject)((html_arghash.NIL != script_tail) ? conses_high.cadr(script_tail) : html_arghash.NIL);
        final SubLObject onchange_tail = cdestructuring_bind.property_list_member((SubLObject)html_arghash.$kw109$ONCHANGE, current);
        final SubLObject onchange = (SubLObject)((html_arghash.NIL != onchange_tail) ? conses_high.cadr(onchange_tail) : html_arghash.NIL);
        final SubLObject body;
        current = (body = temp);
        final SubLObject key_string = (SubLObject)html_arghash.$sym110$KEY_STRING;
        return (SubLObject)ConsesLow.list((SubLObject)html_arghash.$sym42$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(key_string, (SubLObject)ConsesLow.list((SubLObject)html_arghash.$sym111$ARGHASH_MAKE_KEY_STRING, key, value_type))), (SubLObject)ConsesLow.listS((SubLObject)html_arghash.$sym112$HTML_FANCY_SELECT, (SubLObject)ConsesLow.list(new SubLObject[] { key_string, html_arghash.$kw107$MULTIPLE, multiple, html_arghash.$kw108$SIZE, size, html_arghash.$kw95$SCRIPT, script, html_arghash.$kw109$ONCHANGE, onchange }), ConsesLow.append(body, (SubLObject)html_arghash.NIL)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-arghash.lisp", position = 25133L)
    public static SubLObject html_arghash_fancy_option(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)html_arghash.$list113);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject arghash = (SubLObject)html_arghash.NIL;
        SubLObject key = (SubLObject)html_arghash.NIL;
        SubLObject value = (SubLObject)html_arghash.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)html_arghash.$list113);
        arghash = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)html_arghash.$list113);
        key = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)html_arghash.$list113);
        value = current.first();
        current = current.rest();
        final SubLObject value_type = (SubLObject)(current.isCons() ? current.first() : html_arghash.$kw84$DEFAULT);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)html_arghash.$list113);
        current = current.rest();
        if (html_arghash.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            final SubLObject value_string = (SubLObject)html_arghash.$sym114$VALUE_STRING;
            final SubLObject selected = (SubLObject)html_arghash.$sym115$SELECTED;
            return (SubLObject)ConsesLow.list((SubLObject)html_arghash.$sym42$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(selected, (SubLObject)ConsesLow.list((SubLObject)html_arghash.$sym116$MEMBER_EQUAL_, value, (SubLObject)ConsesLow.list((SubLObject)html_arghash.$sym117$GET_ARGHASH_VALUE_LIST, key, arghash))), (SubLObject)ConsesLow.list(value_string, (SubLObject)ConsesLow.list((SubLObject)html_arghash.$sym118$ARGHASH_GET_STRING, value, value_type))), (SubLObject)ConsesLow.listS((SubLObject)html_arghash.$sym119$HTML_FANCY_OPTION, (SubLObject)ConsesLow.list((SubLObject)html_arghash.$kw120$SELECTED, selected, (SubLObject)html_arghash.$kw121$VALUE, value_string), ConsesLow.append(body, (SubLObject)html_arghash.NIL)));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)html_arghash.$list113);
        return (SubLObject)html_arghash.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-arghash.lisp", position = 25603L)
    public static SubLObject html_arghash_fancy_select_with_options(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject arghash = (SubLObject)html_arghash.NIL;
        SubLObject key = (SubLObject)html_arghash.NIL;
        SubLObject value_type = (SubLObject)html_arghash.NIL;
        SubLObject values = (SubLObject)html_arghash.NIL;
        SubLObject value_strings = (SubLObject)html_arghash.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)html_arghash.$list122);
        arghash = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)html_arghash.$list122);
        key = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)html_arghash.$list122);
        value_type = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)html_arghash.$list122);
        values = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)html_arghash.$list122);
        value_strings = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = (SubLObject)html_arghash.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)html_arghash.NIL;
        SubLObject current_$3 = (SubLObject)html_arghash.NIL;
        while (html_arghash.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)html_arghash.$list122);
            current_$3 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)html_arghash.$list122);
            if (html_arghash.NIL == conses_high.member(current_$3, (SubLObject)html_arghash.$list106, (SubLObject)html_arghash.UNPROVIDED, (SubLObject)html_arghash.UNPROVIDED)) {
                bad = (SubLObject)html_arghash.T;
            }
            if (current_$3 == html_arghash.$kw93$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (html_arghash.NIL != bad && html_arghash.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)html_arghash.$list122);
        }
        final SubLObject multiple_tail = cdestructuring_bind.property_list_member((SubLObject)html_arghash.$kw107$MULTIPLE, current);
        final SubLObject multiple = (SubLObject)((html_arghash.NIL != multiple_tail) ? conses_high.cadr(multiple_tail) : html_arghash.NIL);
        final SubLObject size_tail = cdestructuring_bind.property_list_member((SubLObject)html_arghash.$kw108$SIZE, current);
        final SubLObject size = (SubLObject)((html_arghash.NIL != size_tail) ? conses_high.cadr(size_tail) : html_arghash.NIL);
        final SubLObject script_tail = cdestructuring_bind.property_list_member((SubLObject)html_arghash.$kw95$SCRIPT, current);
        final SubLObject script = (SubLObject)((html_arghash.NIL != script_tail) ? conses_high.cadr(script_tail) : html_arghash.NIL);
        final SubLObject onchange_tail = cdestructuring_bind.property_list_member((SubLObject)html_arghash.$kw109$ONCHANGE, current);
        final SubLObject onchange = (SubLObject)((html_arghash.NIL != onchange_tail) ? conses_high.cadr(onchange_tail) : html_arghash.NIL);
        final SubLObject value = (SubLObject)html_arghash.$sym123$VALUE;
        final SubLObject value_string = (SubLObject)html_arghash.$sym124$VALUE_STRING;
        return (SubLObject)ConsesLow.list((SubLObject)html_arghash.$sym125$HTML_ARGHASH_FANCY_SELECT, (SubLObject)ConsesLow.list(new SubLObject[] { key, value_type, html_arghash.$kw107$MULTIPLE, multiple, html_arghash.$kw108$SIZE, size, html_arghash.$kw95$SCRIPT, script, html_arghash.$kw109$ONCHANGE, onchange }), (SubLObject)ConsesLow.list((SubLObject)html_arghash.$sym126$CDOLIST_MULTIPLE, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(value, values), (SubLObject)ConsesLow.list(value_string, value_strings)), (SubLObject)ConsesLow.list((SubLObject)html_arghash.$sym127$HTML_ARGHASH_FANCY_OPTION, (SubLObject)ConsesLow.list(arghash, key, value, value_type), (SubLObject)ConsesLow.list((SubLObject)html_arghash.$sym128$HTML_PRINC, value_string))));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-arghash.lisp", position = 26211L)
    public static SubLObject html_arghash_submit_input(final SubLObject arghash, final SubLObject label, final SubLObject key, SubLObject script) {
        if (script == html_arghash.UNPROVIDED) {
            script = (SubLObject)html_arghash.NIL;
        }
        final SubLObject key_string = arghash_make_key_string(key, (SubLObject)html_arghash.$kw129$BOOLEAN);
        return html_utilities.html_submit_input(label, key_string, script);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-arghash.lisp", position = 26527L)
    public static SubLObject html_arghash_clear_input_button(final SubLObject arghash, final SubLObject key, final SubLObject value_type, SubLObject value) {
        if (value == html_arghash.UNPROVIDED) {
            value = (SubLObject)html_arghash.NIL;
        }
        final SubLObject key_string = arghash_make_key_string(key, value_type);
        return html_script_utilities.html_clear_input_button(key_string, value, (SubLObject)html_arghash.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-arghash.lisp", position = 26862L)
    public static SubLObject html_arghash_complete_button(final SubLObject arghash, final SubLObject key, final SubLObject value_type, SubLObject filter_type, SubLObject label, SubLObject auto_submit) {
        if (filter_type == html_arghash.UNPROVIDED) {
            filter_type = (SubLObject)html_arghash.NIL;
        }
        if (label == html_arghash.UNPROVIDED) {
            label = (SubLObject)html_arghash.$str130$Complete;
        }
        if (auto_submit == html_arghash.UNPROVIDED) {
            auto_submit = (SubLObject)html_arghash.NIL;
        }
        final SubLObject key_string = arghash_make_key_string(key, value_type);
        return html_complete.html_complete_button(key_string, label, filter_type, auto_submit, (SubLObject)html_arghash.UNPROVIDED, (SubLObject)html_arghash.UNPROVIDED, (SubLObject)html_arghash.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-arghash.lisp", position = 27242L)
    public static SubLObject html_arghash_text_input(final SubLObject arghash, final SubLObject key, SubLObject default_value, SubLObject size, SubLObject value_type) {
        if (default_value == html_arghash.UNPROVIDED) {
            default_value = (SubLObject)html_arghash.NIL;
        }
        if (size == html_arghash.UNPROVIDED) {
            size = (SubLObject)html_arghash.NIL;
        }
        if (value_type == html_arghash.UNPROVIDED) {
            value_type = (SubLObject)html_arghash.$kw84$DEFAULT;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject value = get_arghash_value(key, arghash);
        if (html_arghash.NIL == value) {
            value = default_value;
        }
        if (html_arghash.NIL != value) {
            thread.resetMultipleValues();
            final SubLObject key_string = arghash_make_key_and_value_strings(key, value, value_type);
            final SubLObject value_string = thread.secondMultipleValue();
            thread.resetMultipleValues();
            html_utilities.html_text_input(key_string, value_string, size);
        }
        else {
            final SubLObject key_string = arghash_make_key_string(key, value_type);
            html_utilities.html_text_input(key_string, (SubLObject)html_arghash.$str57$, size);
        }
        return (SubLObject)html_arghash.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-arghash.lisp", position = 27863L)
    public static SubLObject html_arghash_textarea_input(final SubLObject arghash, final SubLObject key, SubLObject default_value, SubLObject cols, SubLObject rows, SubLObject wrap, SubLObject value_type) {
        if (default_value == html_arghash.UNPROVIDED) {
            default_value = (SubLObject)html_arghash.NIL;
        }
        if (cols == html_arghash.UNPROVIDED) {
            cols = (SubLObject)html_arghash.NIL;
        }
        if (rows == html_arghash.UNPROVIDED) {
            rows = (SubLObject)html_arghash.NIL;
        }
        if (wrap == html_arghash.UNPROVIDED) {
            wrap = (SubLObject)html_arghash.NIL;
        }
        if (value_type == html_arghash.UNPROVIDED) {
            value_type = (SubLObject)html_arghash.$kw84$DEFAULT;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject value = get_arghash_value(key, arghash);
        if (html_arghash.NIL == value) {
            value = default_value;
        }
        if (html_arghash.NIL != value) {
            thread.resetMultipleValues();
            final SubLObject key_string = arghash_make_key_and_value_strings(key, value, value_type);
            final SubLObject value_string = thread.secondMultipleValue();
            thread.resetMultipleValues();
            html_utilities.html_markup(html_macros.$html_textarea_head$.getGlobalValue());
            html_utilities.html_markup(html_macros.$html_textarea_name$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_arghash.UNPROVIDED);
            html_utilities.html_markup(key_string);
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_arghash.UNPROVIDED);
            if (html_arghash.NIL != cols) {
                html_utilities.html_markup(html_macros.$html_textarea_cols$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_arghash.UNPROVIDED);
                html_utilities.html_markup(cols);
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_arghash.UNPROVIDED);
            }
            if (html_arghash.NIL != rows) {
                html_utilities.html_markup(html_macros.$html_textarea_rows$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_arghash.UNPROVIDED);
                html_utilities.html_markup(rows);
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_arghash.UNPROVIDED);
            }
            if (html_arghash.NIL != wrap) {
                html_utilities.html_markup(html_macros.$html_table_wrap$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_arghash.UNPROVIDED);
                html_utilities.html_markup((SubLObject)html_arghash.$str131$virtual);
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_arghash.UNPROVIDED);
            }
            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)html_arghash.UNPROVIDED);
            final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind((SubLObject)html_arghash.T, thread);
                html_utilities.html_princ(value_string);
            }
            finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
            }
            html_utilities.html_markup(html_macros.$html_textarea_tail$.getGlobalValue());
        }
        else {
            final SubLObject key_string = arghash_make_key_string(key, value_type);
            html_utilities.html_markup(html_macros.$html_textarea_head$.getGlobalValue());
            html_utilities.html_markup(html_macros.$html_textarea_name$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_arghash.UNPROVIDED);
            html_utilities.html_markup(key_string);
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_arghash.UNPROVIDED);
            if (html_arghash.NIL != cols) {
                html_utilities.html_markup(html_macros.$html_textarea_cols$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_arghash.UNPROVIDED);
                html_utilities.html_markup(cols);
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_arghash.UNPROVIDED);
            }
            if (html_arghash.NIL != rows) {
                html_utilities.html_markup(html_macros.$html_textarea_rows$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_arghash.UNPROVIDED);
                html_utilities.html_markup(rows);
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_arghash.UNPROVIDED);
            }
            if (html_arghash.NIL != wrap) {
                html_utilities.html_markup(html_macros.$html_table_wrap$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_arghash.UNPROVIDED);
                html_utilities.html_markup((SubLObject)html_arghash.$str131$virtual);
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_arghash.UNPROVIDED);
            }
            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)html_arghash.UNPROVIDED);
            final SubLObject _prev_bind_2 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind((SubLObject)html_arghash.T, thread);
            }
            finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_2, thread);
            }
            html_utilities.html_markup(html_macros.$html_textarea_tail$.getGlobalValue());
        }
        return (SubLObject)html_arghash.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-arghash.lisp", position = 28569L)
    public static SubLObject html_arghash_fort_input(final SubLObject arghash, final SubLObject key, SubLObject default_value, SubLObject size, SubLObject complete_text, SubLObject filter_col) {
        if (default_value == html_arghash.UNPROVIDED) {
            default_value = (SubLObject)html_arghash.NIL;
        }
        if (size == html_arghash.UNPROVIDED) {
            size = (SubLObject)html_arghash.NIL;
        }
        if (complete_text == html_arghash.UNPROVIDED) {
            complete_text = (SubLObject)html_arghash.$str130$Complete;
        }
        if (filter_col == html_arghash.UNPROVIDED) {
            filter_col = (SubLObject)html_arghash.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject fort = get_arghash_value(key, arghash);
        final SubLObject fort_name = kb_paths.fort_name(fort);
        if (html_arghash.NIL != forts.fort_p(fort)) {
            thread.resetMultipleValues();
            final SubLObject key_string = arghash_make_key_and_value_strings(key, fort, (SubLObject)html_arghash.UNPROVIDED);
            final SubLObject value_string = thread.secondMultipleValue();
            thread.resetMultipleValues();
            html_complete.html_complete_button(key_string, complete_text, filter_col, (SubLObject)html_arghash.UNPROVIDED, (SubLObject)html_arghash.UNPROVIDED, (SubLObject)html_arghash.UNPROVIDED, (SubLObject)html_arghash.UNPROVIDED);
            html_utilities.html_glyph((SubLObject)html_arghash.$kw132$NBSP, (SubLObject)html_arghash.UNPROVIDED);
            html_utilities.html_text_input(key_string, fort_name, size);
        }
        else {
            final SubLObject key_string = arghash_make_key_string(key, (SubLObject)html_arghash.$kw133$FORT);
            html_complete.html_complete_button(key_string, complete_text, filter_col, (SubLObject)html_arghash.UNPROVIDED, (SubLObject)html_arghash.UNPROVIDED, (SubLObject)html_arghash.UNPROVIDED, (SubLObject)html_arghash.UNPROVIDED);
            html_utilities.html_glyph((SubLObject)html_arghash.$kw132$NBSP, (SubLObject)html_arghash.UNPROVIDED);
            html_utilities.html_text_input(key_string, default_value, size);
        }
        return (SubLObject)html_arghash.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-arghash.lisp", position = 29652L)
    public static SubLObject html_arghash_sentence_input(final SubLObject arghash, final SubLObject key, SubLObject default_value, SubLObject rows, SubLObject cols, SubLObject complete_text, SubLObject cyclify_text, SubLObject clear_text) {
        if (default_value == html_arghash.UNPROVIDED) {
            default_value = (SubLObject)html_arghash.NIL;
        }
        if (rows == html_arghash.UNPROVIDED) {
            rows = (SubLObject)html_arghash.NIL;
        }
        if (cols == html_arghash.UNPROVIDED) {
            cols = (SubLObject)html_arghash.NIL;
        }
        if (complete_text == html_arghash.UNPROVIDED) {
            complete_text = (SubLObject)html_arghash.$str130$Complete;
        }
        if (cyclify_text == html_arghash.UNPROVIDED) {
            cyclify_text = (SubLObject)html_arghash.$str134$Cyclify;
        }
        if (clear_text == html_arghash.UNPROVIDED) {
            clear_text = (SubLObject)html_arghash.$str135$Clear;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject sentence_object = get_arghash_value(key, arghash);
        final SubLObject sentence = (html_arghash.NIL != assertion_handles.assertion_p(sentence_object)) ? uncanonicalizer.assertion_el_formula(sentence_object) : uncanonicalizer.el_version(sentence_object, (SubLObject)html_arghash.UNPROVIDED);
        if (html_arghash.NIL != el_grammar.el_sentence_p(sentence)) {
            thread.resetMultipleValues();
            final SubLObject key_string = arghash_make_key_and_value_strings(key, sentence, (SubLObject)html_arghash.$kw136$EL_FORMULA);
            final SubLObject value_string = thread.secondMultipleValue();
            thread.resetMultipleValues();
            cb_form_widgets.cb_el_sentence_input_section(sentence, (SubLObject)ConsesLow.list(new SubLObject[] { html_arghash.$kw137$INPUT_NAME, key_string, html_arghash.$kw138$COMPLETE_LABEL, complete_text, html_arghash.$kw139$CYCLIFY_LABEL, cyclify_text, html_arghash.$kw140$CLEAR_LABEL, clear_text, html_arghash.$kw141$HEIGHT, rows, html_arghash.$kw142$WIDTH, cols }));
        }
        else {
            final SubLObject key_string = arghash_make_key_string(key, (SubLObject)html_arghash.$kw136$EL_FORMULA);
            final SubLObject sentence_$4 = (html_arghash.NIL != assertion_handles.assertion_p(default_value)) ? uncanonicalizer.assertion_el_formula(default_value) : uncanonicalizer.el_version(default_value, (SubLObject)html_arghash.UNPROVIDED);
            cb_form_widgets.cb_el_sentence_input_section(sentence_$4, (SubLObject)ConsesLow.list(new SubLObject[] { html_arghash.$kw137$INPUT_NAME, key_string, html_arghash.$kw138$COMPLETE_LABEL, complete_text, html_arghash.$kw139$CYCLIFY_LABEL, cyclify_text, html_arghash.$kw140$CLEAR_LABEL, clear_text, html_arghash.$kw141$HEIGHT, rows, html_arghash.$kw142$WIDTH, cols }));
        }
        return (SubLObject)html_arghash.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-arghash.lisp", position = 30848L)
    public static SubLObject html_arghash_nl_fort_input(final SubLObject arghash, final SubLObject fort_key, SubLObject debug, SubLObject generation_fn, SubLObject requiredP, SubLObject complete_buttonP, SubLObject filter_col) {
        if (debug == html_arghash.UNPROVIDED) {
            debug = (SubLObject)html_arghash.NIL;
        }
        if (generation_fn == html_arghash.UNPROVIDED) {
            generation_fn = (SubLObject)html_arghash.$sym143$GENERATE_PHRASE;
        }
        if (requiredP == html_arghash.UNPROVIDED) {
            requiredP = (SubLObject)html_arghash.T;
        }
        if (complete_buttonP == html_arghash.UNPROVIDED) {
            complete_buttonP = (SubLObject)html_arghash.NIL;
        }
        if (filter_col == html_arghash.UNPROVIDED) {
            filter_col = (SubLObject)html_arghash.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject input_prefix_string = string_utilities.string_from_keyword(fort_key);
        final SubLObject new_fort_key = string_utilities.keyword_from_string(Sequences.cconcatenate(input_prefix_string, (SubLObject)html_arghash.$str144$_NEW_FORT));
        final SubLObject string_key = string_utilities.keyword_from_string(Sequences.cconcatenate(input_prefix_string, (SubLObject)html_arghash.$str145$_STRING));
        final SubLObject new_string_key = string_utilities.keyword_from_string(Sequences.cconcatenate(input_prefix_string, (SubLObject)html_arghash.$str146$_NEW_STRING));
        final SubLObject undo_key = string_utilities.keyword_from_string(Sequences.cconcatenate(input_prefix_string, (SubLObject)html_arghash.$str147$_UNDO));
        final SubLObject candidates_key = string_utilities.keyword_from_string(Sequences.cconcatenate(input_prefix_string, (SubLObject)html_arghash.$str148$_CANDIDATES));
        final SubLObject done_key = string_utilities.keyword_from_string(Sequences.cconcatenate(input_prefix_string, (SubLObject)html_arghash.$str149$_DONE));
        final SubLObject error_key = string_utilities.keyword_from_string(Sequences.cconcatenate(input_prefix_string, (SubLObject)html_arghash.$str150$_ERROR));
        html_utilities.html_markup(html_macros.$html_no_break_head$.getGlobalValue());
        html_utilities.html_markup(html_macros.$html_font_head$.getGlobalValue());
        html_utilities.html_markup(html_macros.$html_font_size$.getGlobalValue());
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_arghash.UNPROVIDED);
        html_utilities.html_markup((SubLObject)html_arghash.$str151$_2);
        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_arghash.UNPROVIDED);
        html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)html_arghash.UNPROVIDED);
        SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind((SubLObject)html_arghash.T, thread);
            if (html_arghash.NIL != requiredP) {
                if (html_arghash.NIL != get_arghash_value(done_key, arghash)) {
                    html_utilities.html_princ((SubLObject)html_arghash.$str152$_);
                }
                else {
                    html_utilities.html_markup(html_macros.$html_font_head$.getGlobalValue());
                    if (html_arghash.NIL != html_macros.$html_color_sat_red$.getGlobalValue()) {
                        html_utilities.html_markup(html_macros.$html_font_color$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_arghash.UNPROVIDED);
                        html_utilities.html_markup(html_utilities.html_color(html_macros.$html_color_sat_red$.getGlobalValue()));
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_arghash.UNPROVIDED);
                    }
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)html_arghash.UNPROVIDED);
                    final SubLObject _prev_bind_0_$5 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)html_arghash.T, thread);
                        html_utilities.html_princ((SubLObject)html_arghash.$str152$_);
                    }
                    finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$5, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_font_tail$.getGlobalValue());
                }
            }
            else {
                html_utilities.html_glyph((SubLObject)html_arghash.$kw132$NBSP, (SubLObject)html_arghash.TWO_INTEGER);
            }
        }
        finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_utilities.html_markup(html_macros.$html_font_tail$.getGlobalValue());
        if (html_arghash.NIL != get_arghash_value_list(candidates_key, arghash)) {
            final SubLObject key_string = arghash_make_key_string(new_fort_key, (SubLObject)html_arghash.$kw133$FORT);
            html_utilities.html_markup(html_macros.$html_select_head$.getGlobalValue());
            html_utilities.html_markup(html_macros.$html_select_name$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_arghash.UNPROVIDED);
            html_utilities.html_markup(key_string);
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_arghash.UNPROVIDED);
            html_utilities.html_char((SubLObject)Characters.CHAR_space, (SubLObject)html_arghash.UNPROVIDED);
            html_utilities.html_markup((SubLObject)html_arghash.$str153$onChange_javascript_this_form_sub);
            if (html_arghash.NIL != html_macros.$html_input_disabledP$.getDynamicValue(thread)) {
                html_utilities.html_simple_attribute(html_macros.$html_input_disabled$.getGlobalValue());
            }
            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)html_arghash.UNPROVIDED);
            final SubLObject _prev_bind_2 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind((SubLObject)html_arghash.T, thread);
                final SubLObject selected = list_utilities.member_equalP((SubLObject)html_arghash.NIL, get_arghash_value_list(new_fort_key, arghash));
                final SubLObject value_string = arghash_get_string((SubLObject)html_arghash.NIL, (SubLObject)html_arghash.$kw84$DEFAULT);
                html_utilities.html_markup(html_macros.$html_option_head$.getGlobalValue());
                if (html_arghash.NIL != selected) {
                    html_utilities.html_simple_attribute(html_macros.$html_option_selected$.getGlobalValue());
                }
                if (html_arghash.NIL != value_string) {
                    html_utilities.html_markup(html_macros.$html_option_value$.getGlobalValue());
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_arghash.UNPROVIDED);
                    html_utilities.html_markup(value_string);
                    html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_arghash.UNPROVIDED);
                }
                html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)html_arghash.UNPROVIDED);
                final SubLObject _prev_bind_0_$6 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind((SubLObject)html_arghash.T, thread);
                    html_utilities.html_princ((SubLObject)html_arghash.$str154$___);
                }
                finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$6, thread);
                }
                html_utilities.html_markup(html_macros.$html_option_tail$.getGlobalValue());
                SubLObject cdolist_list_var = get_arghash_value_list(candidates_key, arghash);
                SubLObject term1_candidate = (SubLObject)html_arghash.NIL;
                term1_candidate = cdolist_list_var.first();
                while (html_arghash.NIL != cdolist_list_var) {
                    final SubLObject selected2 = list_utilities.member_equalP(term1_candidate, get_arghash_value_list(new_fort_key, arghash));
                    final SubLObject value_string2 = arghash_get_string(term1_candidate, (SubLObject)html_arghash.$kw84$DEFAULT);
                    html_utilities.html_markup(html_macros.$html_option_head$.getGlobalValue());
                    if (html_arghash.NIL != selected2) {
                        html_utilities.html_simple_attribute(html_macros.$html_option_selected$.getGlobalValue());
                    }
                    if (html_arghash.NIL != value_string2) {
                        html_utilities.html_markup(html_macros.$html_option_value$.getGlobalValue());
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_arghash.UNPROVIDED);
                        html_utilities.html_markup(value_string2);
                        html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_arghash.UNPROVIDED);
                    }
                    html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)html_arghash.UNPROVIDED);
                    final SubLObject _prev_bind_0_$7 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind((SubLObject)html_arghash.T, thread);
                        html_utilities.html_princ(Functions.funcall(generation_fn, term1_candidate));
                    }
                    finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$7, thread);
                    }
                    html_utilities.html_markup(html_macros.$html_option_tail$.getGlobalValue());
                    cdolist_list_var = cdolist_list_var.rest();
                    term1_candidate = cdolist_list_var.first();
                }
            }
            finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_2, thread);
            }
            html_utilities.html_markup(html_macros.$html_select_tail$.getGlobalValue());
            html_arghash_submit_input(arghash, (SubLObject)html_arghash.$str155$Undo, undo_key, (SubLObject)html_arghash.UNPROVIDED);
            set_arghash_value(string_key, arghash, get_arghash_value(new_string_key, arghash));
            rem_arghash_value(new_string_key, arghash);
            html_arghash_hidden_input(arghash, string_key, (SubLObject)html_arghash.UNPROVIDED, (SubLObject)html_arghash.UNPROVIDED);
            html_arghash_hidden_input(arghash, candidates_key, (SubLObject)html_arghash.UNPROVIDED, (SubLObject)html_arghash.UNPROVIDED);
        }
        else {
            html_arghash_text_input(arghash, new_string_key, (SubLObject)html_arghash.$str57$, cb_parameters.$cb_constant_input_width$.getDynamicValue(thread), (SubLObject)html_arghash.UNPROVIDED);
            html_utilities.html_glyph((SubLObject)html_arghash.$kw132$NBSP, (SubLObject)html_arghash.UNPROVIDED);
            html_arghash_submit_input(arghash, (SubLObject)html_arghash.$str156$Submit, (SubLObject)html_arghash.$kw157$SUBMIT, (SubLObject)html_arghash.UNPROVIDED);
            if (html_arghash.NIL == get_arghash_value(done_key, arghash) && html_arghash.NIL != complete_buttonP) {
                html_utilities.html_glyph((SubLObject)html_arghash.$kw132$NBSP, (SubLObject)html_arghash.UNPROVIDED);
                html_arghash_complete_button(arghash, new_string_key, (SubLObject)html_arghash.$kw158$STRING, filter_col, (SubLObject)html_arghash.UNPROVIDED, (SubLObject)html_arghash.UNPROVIDED);
            }
            html_arghash_hidden_input(arghash, string_key, (SubLObject)html_arghash.UNPROVIDED, (SubLObject)html_arghash.UNPROVIDED);
        }
        html_arghash_hidden_input(arghash, fort_key, (SubLObject)html_arghash.UNPROVIDED, (SubLObject)html_arghash.UNPROVIDED);
        if (html_arghash.NIL != get_arghash_value(error_key, arghash)) {
            html_utilities.html_glyph((SubLObject)html_arghash.$kw132$NBSP, (SubLObject)html_arghash.UNPROVIDED);
            html_utilities.html_markup(html_macros.$html_font_head$.getGlobalValue());
            if (html_arghash.NIL != html_macros.$html_color_sat_red$.getGlobalValue()) {
                html_utilities.html_markup(html_macros.$html_font_color$.getGlobalValue());
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_arghash.UNPROVIDED);
                html_utilities.html_markup(html_utilities.html_color(html_macros.$html_color_sat_red$.getGlobalValue()));
                html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)html_arghash.UNPROVIDED);
            }
            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)html_arghash.UNPROVIDED);
            _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind((SubLObject)html_arghash.T, thread);
                html_utilities.html_princ(get_arghash_value(error_key, arghash));
            }
            finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
            }
            html_utilities.html_markup(html_macros.$html_font_tail$.getGlobalValue());
        }
        html_utilities.html_terpri((SubLObject)html_arghash.UNPROVIDED);
        html_utilities.html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
        return (SubLObject)html_arghash.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-arghash.lisp", position = 33747L)
    public static SubLObject html_arghash_nl_fort_input_invisible(final SubLObject arghash, final SubLObject fort_key) {
        final SubLObject input_prefix_string = string_utilities.string_from_keyword(fort_key);
        final SubLObject new_fort_key = string_utilities.keyword_from_string(Sequences.cconcatenate(input_prefix_string, (SubLObject)html_arghash.$str144$_NEW_FORT));
        final SubLObject string_key = string_utilities.keyword_from_string(Sequences.cconcatenate(input_prefix_string, (SubLObject)html_arghash.$str145$_STRING));
        final SubLObject new_string_key = string_utilities.keyword_from_string(Sequences.cconcatenate(input_prefix_string, (SubLObject)html_arghash.$str146$_NEW_STRING));
        final SubLObject candidates_key = string_utilities.keyword_from_string(Sequences.cconcatenate(input_prefix_string, (SubLObject)html_arghash.$str148$_CANDIDATES));
        final SubLObject done_key = string_utilities.keyword_from_string(Sequences.cconcatenate(input_prefix_string, (SubLObject)html_arghash.$str149$_DONE));
        final SubLObject error_key = string_utilities.keyword_from_string(Sequences.cconcatenate(input_prefix_string, (SubLObject)html_arghash.$str150$_ERROR));
        if (html_arghash.NIL == get_arghash_value(new_fort_key, arghash)) {
            set_arghash_value(new_fort_key, arghash, get_arghash_value(fort_key, arghash));
        }
        html_arghash_hidden_input(arghash, fort_key, (SubLObject)html_arghash.UNPROVIDED, (SubLObject)html_arghash.UNPROVIDED);
        html_arghash_hidden_input(arghash, string_key, (SubLObject)html_arghash.UNPROVIDED, (SubLObject)html_arghash.UNPROVIDED);
        html_arghash_hidden_input(arghash, new_fort_key, (SubLObject)html_arghash.UNPROVIDED, (SubLObject)html_arghash.UNPROVIDED);
        html_arghash_hidden_input(arghash, new_string_key, (SubLObject)html_arghash.UNPROVIDED, (SubLObject)html_arghash.UNPROVIDED);
        html_arghash_hidden_input(arghash, candidates_key, (SubLObject)html_arghash.UNPROVIDED, (SubLObject)html_arghash.UNPROVIDED);
        html_arghash_hidden_input(arghash, done_key, (SubLObject)html_arghash.UNPROVIDED, (SubLObject)html_arghash.UNPROVIDED);
        html_arghash_hidden_input(arghash, error_key, (SubLObject)html_arghash.UNPROVIDED, (SubLObject)html_arghash.UNPROVIDED);
        return (SubLObject)html_arghash.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-arghash.lisp", position = 34908L)
    public static SubLObject html_arghash_nl_fort_input_activeP(final SubLObject arghash, final SubLObject fort_key) {
        final SubLObject input_prefix_string = string_utilities.string_from_keyword(fort_key);
        final SubLObject new_fort_key = string_utilities.keyword_from_string(Sequences.cconcatenate(input_prefix_string, (SubLObject)html_arghash.$str144$_NEW_FORT));
        final SubLObject new_string_key = string_utilities.keyword_from_string(Sequences.cconcatenate(input_prefix_string, (SubLObject)html_arghash.$str146$_NEW_STRING));
        final SubLObject candidates_key = string_utilities.keyword_from_string(Sequences.cconcatenate(input_prefix_string, (SubLObject)html_arghash.$str148$_CANDIDATES));
        if (html_arghash.NIL != forts.fort_p(get_arghash_value(new_fort_key, arghash)) || html_arghash.NIL != string_utilities.non_empty_stringP(get_arghash_value(new_string_key, arghash)) || html_arghash.NIL != get_arghash_value(candidates_key, arghash)) {
            return (SubLObject)html_arghash.T;
        }
        return (SubLObject)html_arghash.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-arghash.lisp", position = 35639L)
    public static SubLObject html_arghash_nl_fort_input_doneP(final SubLObject arghash, final SubLObject fort_key) {
        final SubLObject input_prefix_string = string_utilities.string_from_keyword(fort_key);
        final SubLObject done_key = string_utilities.keyword_from_string(Sequences.cconcatenate(input_prefix_string, (SubLObject)html_arghash.$str149$_DONE));
        if (html_arghash.NIL != get_arghash_value(done_key, arghash)) {
            return (SubLObject)html_arghash.T;
        }
        return (SubLObject)html_arghash.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-arghash.lisp", position = 35998L)
    public static SubLObject html_arghash_nl_fort_input_clear(final SubLObject arghash, final SubLObject fort_key) {
        final SubLObject input_prefix_string = string_utilities.string_from_keyword(fort_key);
        final SubLObject new_fort_key = string_utilities.keyword_from_string(Sequences.cconcatenate(input_prefix_string, (SubLObject)html_arghash.$str144$_NEW_FORT));
        final SubLObject string_key = string_utilities.keyword_from_string(Sequences.cconcatenate(input_prefix_string, (SubLObject)html_arghash.$str145$_STRING));
        final SubLObject new_string_key = string_utilities.keyword_from_string(Sequences.cconcatenate(input_prefix_string, (SubLObject)html_arghash.$str146$_NEW_STRING));
        final SubLObject candidates_key = string_utilities.keyword_from_string(Sequences.cconcatenate(input_prefix_string, (SubLObject)html_arghash.$str148$_CANDIDATES));
        rem_arghash_value(new_fort_key, arghash);
        rem_arghash_value(new_string_key, arghash);
        rem_arghash_value(fort_key, arghash);
        rem_arghash_value(string_key, arghash);
        rem_arghash_value(candidates_key, arghash);
        return arghash;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-arghash.lisp", position = 36762L)
    public static SubLObject html_arghash_nl_fort_input_force_default_if_unset(final SubLObject arghash, final SubLObject fort_key, final SubLObject default_value, SubLObject generation_fn, SubLObject debug) {
        if (generation_fn == html_arghash.UNPROVIDED) {
            generation_fn = (SubLObject)html_arghash.$sym143$GENERATE_PHRASE;
        }
        if (debug == html_arghash.UNPROVIDED) {
            debug = (SubLObject)html_arghash.NIL;
        }
        final SubLObject input_prefix_string = string_utilities.string_from_keyword(fort_key);
        final SubLObject new_string_key = string_utilities.keyword_from_string(Sequences.cconcatenate(input_prefix_string, (SubLObject)html_arghash.$str146$_NEW_STRING));
        final SubLObject new_fort_key = string_utilities.keyword_from_string(Sequences.cconcatenate(input_prefix_string, (SubLObject)html_arghash.$str144$_NEW_FORT));
        final SubLObject candidates_key = string_utilities.keyword_from_string(Sequences.cconcatenate(input_prefix_string, (SubLObject)html_arghash.$str148$_CANDIDATES));
        final SubLObject done_key = string_utilities.keyword_from_string(Sequences.cconcatenate(input_prefix_string, (SubLObject)html_arghash.$str149$_DONE));
        if (html_arghash.NIL == get_arghash_value(done_key, arghash) && html_arghash.NIL != string_utilities.empty_string_p(get_arghash_value(new_string_key, arghash)) && html_arghash.NIL == get_arghash_value(candidates_key, arghash)) {
            if (html_arghash.NIL != debug) {
                html_utilities.html_princ((SubLObject)html_arghash.$str159$_nl_fort_input_force_default_if_u);
                html_utilities.html_princ(fort_key);
                html_utilities.html_princ((SubLObject)html_arghash.$str160$___setting_to_);
                html_utilities.html_princ(default_value);
                html_utilities.html_newline((SubLObject)html_arghash.UNPROVIDED);
            }
            set_arghash_value(new_fort_key, arghash, default_value);
            set_arghash_value(done_key, arghash, (SubLObject)html_arghash.T);
            set_arghash_value(new_string_key, arghash, Functions.funcall(generation_fn, get_arghash_value(fort_key, arghash)));
        }
        return arghash;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-arghash.lisp", position = 37981L)
    public static SubLObject html_arghash_nl_fort_list_input_set_forts(final SubLObject arghash, final SubLObject fort_list_key, final SubLObject fort_key_list, final SubLObject v_forts, SubLObject generation_fn) {
        if (generation_fn == html_arghash.UNPROVIDED) {
            generation_fn = (SubLObject)html_arghash.$sym143$GENERATE_PHRASE;
        }
        SubLObject fort = (SubLObject)html_arghash.NIL;
        SubLObject fort_$8 = (SubLObject)html_arghash.NIL;
        SubLObject fort_key = (SubLObject)html_arghash.NIL;
        SubLObject fort_key_$9 = (SubLObject)html_arghash.NIL;
        fort = v_forts;
        fort_$8 = fort.first();
        fort_key = fort_key_list;
        fort_key_$9 = fort_key.first();
        while (html_arghash.NIL != fort_key || html_arghash.NIL != fort) {
            html_arghash_nl_fort_input_set_fort(arghash, fort_key_$9, fort_$8, generation_fn);
            fort = fort.rest();
            fort_$8 = fort.first();
            fort_key = fort_key.rest();
            fort_key_$9 = fort_key.first();
        }
        return arghash;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-arghash.lisp", position = 38314L)
    public static SubLObject html_arghash_nl_fort_input_set_fort(final SubLObject arghash, final SubLObject fort_key, final SubLObject fort, SubLObject generation_fn) {
        if (generation_fn == html_arghash.UNPROVIDED) {
            generation_fn = (SubLObject)html_arghash.$sym143$GENERATE_PHRASE;
        }
        final SubLObject input_prefix_string = string_utilities.string_from_keyword(fort_key);
        final SubLObject new_fort_key = string_utilities.keyword_from_string(Sequences.cconcatenate(input_prefix_string, (SubLObject)html_arghash.$str144$_NEW_FORT));
        final SubLObject string_key = string_utilities.keyword_from_string(Sequences.cconcatenate(input_prefix_string, (SubLObject)html_arghash.$str145$_STRING));
        final SubLObject new_string_key = string_utilities.keyword_from_string(Sequences.cconcatenate(input_prefix_string, (SubLObject)html_arghash.$str146$_NEW_STRING));
        final SubLObject done_key = string_utilities.keyword_from_string(Sequences.cconcatenate(input_prefix_string, (SubLObject)html_arghash.$str149$_DONE));
        final SubLObject fort_string = Functions.funcall(generation_fn, fort);
        set_arghash_value(fort_key, arghash, fort);
        set_arghash_value(string_key, arghash, fort_string);
        set_arghash_value(new_fort_key, arghash, fort);
        set_arghash_value(new_string_key, arghash, fort_string);
        set_arghash_value(done_key, arghash, (SubLObject)html_arghash.T);
        return arghash;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-arghash.lisp", position = 39150L)
    public static SubLObject html_arghash_nl_fort_input_validate(SubLObject arghash, final SubLObject fort_key, SubLObject debug, SubLObject generation_fn, SubLObject parse_fn, SubLObject filter_col, SubLObject filter_mt) {
        if (debug == html_arghash.UNPROVIDED) {
            debug = (SubLObject)html_arghash.NIL;
        }
        if (generation_fn == html_arghash.UNPROVIDED) {
            generation_fn = (SubLObject)html_arghash.$sym143$GENERATE_PHRASE;
        }
        if (parse_fn == html_arghash.UNPROVIDED) {
            parse_fn = (SubLObject)html_arghash.$sym161$TERMS_FOR_BROWSING;
        }
        if (filter_col == html_arghash.UNPROVIDED) {
            filter_col = (SubLObject)html_arghash.NIL;
        }
        if (filter_mt == html_arghash.UNPROVIDED) {
            filter_mt = (SubLObject)html_arghash.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject input_prefix_string = string_utilities.string_from_keyword(fort_key);
        final SubLObject new_fort_key = string_utilities.keyword_from_string(Sequences.cconcatenate(input_prefix_string, (SubLObject)html_arghash.$str144$_NEW_FORT));
        final SubLObject string_key = string_utilities.keyword_from_string(Sequences.cconcatenate(input_prefix_string, (SubLObject)html_arghash.$str145$_STRING));
        final SubLObject new_string_key = string_utilities.keyword_from_string(Sequences.cconcatenate(input_prefix_string, (SubLObject)html_arghash.$str146$_NEW_STRING));
        final SubLObject undo_key = string_utilities.keyword_from_string(Sequences.cconcatenate(input_prefix_string, (SubLObject)html_arghash.$str147$_UNDO));
        final SubLObject candidates_key = string_utilities.keyword_from_string(Sequences.cconcatenate(input_prefix_string, (SubLObject)html_arghash.$str148$_CANDIDATES));
        final SubLObject error_key = string_utilities.keyword_from_string(Sequences.cconcatenate(input_prefix_string, (SubLObject)html_arghash.$str150$_ERROR));
        SubLObject poss_candidates = (SubLObject)html_arghash.NIL;
        if (html_arghash.NIL != debug) {
            html_utilities.html_princ((SubLObject)html_arghash.$str162$_nl_fort_input_validate_);
            html_utilities.html_princ(fort_key);
            html_utilities.html_princ((SubLObject)html_arghash.$str163$___);
        }
        if (html_arghash.NIL != get_arghash_value(undo_key, arghash)) {
            if (html_arghash.NIL != debug) {
                html_utilities.html_princ((SubLObject)html_arghash.$str164$Case_1__clicked_undo_button);
                html_utilities.html_newline((SubLObject)html_arghash.UNPROVIDED);
            }
            set_arghash_value(new_string_key, arghash, get_arghash_value(string_key, arghash));
            rem_arghash_value(string_key, arghash);
            rem_arghash_value(new_fort_key, arghash);
            rem_arghash_value(fort_key, arghash);
            rem_arghash_value(candidates_key, arghash);
        }
        else if (html_arghash.NIL != get_arghash_value(new_fort_key, arghash) && !get_arghash_value(new_fort_key, arghash).equal(get_arghash_value(fort_key, arghash))) {
            if (html_arghash.NIL != debug) {
                html_utilities.html_princ((SubLObject)html_arghash.$str165$Case_2__chose_fort_from_pulldown);
                html_utilities.html_newline((SubLObject)html_arghash.UNPROVIDED);
            }
            rem_arghash_value(candidates_key, arghash);
            arghash = html_arghash_nl_fort_input_set_fort(arghash, fort_key, get_arghash_value(new_fort_key, arghash), generation_fn);
        }
        else if (html_arghash.NIL == get_arghash_value(new_fort_key, arghash) && !get_arghash_value(string_key, arghash).equal(get_arghash_value(new_string_key, arghash))) {
            if (html_arghash.NIL != debug) {
                html_utilities.html_princ((SubLObject)html_arghash.$str166$Case_3__text_typed_in__);
            }
            rem_arghash_value(new_fort_key, arghash);
            if (!get_arghash_value(new_string_key, arghash).isString()) {
                set_arghash_value(new_string_key, arghash, (SubLObject)html_arghash.$str57$);
            }
            poss_candidates = Functions.funcall(parse_fn, get_arghash_value(new_string_key, arghash));
            if (html_arghash.NIL != poss_candidates && html_arghash.NIL != fort_types_interface.collectionP(filter_col)) {
                if (html_arghash.NIL != fort_types_interface.mtP(filter_mt)) {
                    poss_candidates = isa.all_instances_among_fast(filter_col, poss_candidates, filter_mt);
                }
                else {
                    final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)html_arghash.$sym167$RELEVANT_MT_IS_EVERYTHING, thread);
                        mt_relevance_macros.$mt$.bind(html_arghash.$const168$EverythingPSC, thread);
                        poss_candidates = isa.all_instances_among_fast(filter_col, poss_candidates, (SubLObject)html_arghash.UNPROVIDED);
                    }
                    finally {
                        mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                    }
                }
            }
            if (html_arghash.NIL == poss_candidates) {
                if (html_arghash.NIL != debug) {
                    PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), (SubLObject)html_arghash.$str169$Case_3a__No_parse_for___A_, get_arghash_value(new_string_key, arghash));
                    html_utilities.html_newline((SubLObject)html_arghash.UNPROVIDED);
                }
                if (html_arghash.NIL == string_utilities.empty_string_p(get_arghash_value(new_string_key, arghash))) {
                    if (generation_fn.isFunctionSpec() && html_arghash.NIL != fort_types_interface.collection_in_any_mtP(filter_col)) {
                        set_arghash_value(error_key, arghash, Sequences.cconcatenate(Functions.funcall(generation_fn, filter_col), new SubLObject[] { html_arghash.$str170$_called__, get_arghash_value(new_string_key, arghash), html_arghash.$str171$__not_found_ }));
                    }
                    else {
                        set_arghash_value(error_key, arghash, Sequences.cconcatenate((SubLObject)html_arghash.$str172$_, new SubLObject[] { get_arghash_value(new_string_key, arghash), html_arghash.$str171$__not_found_ }));
                    }
                }
            }
            else if (html_arghash.NIL != list_utilities.singletonP(poss_candidates)) {
                if (html_arghash.NIL != debug) {
                    PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), (SubLObject)html_arghash.$str173$Case_3b__One_parse_for___A_____A, get_arghash_value(new_string_key, arghash), poss_candidates.first());
                    html_utilities.html_newline((SubLObject)html_arghash.UNPROVIDED);
                }
                arghash = html_arghash_nl_fort_input_set_fort(arghash, fort_key, poss_candidates.first(), generation_fn);
                poss_candidates = (SubLObject)html_arghash.NIL;
            }
            else {
                if (html_arghash.NIL != debug) {
                    PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), (SubLObject)html_arghash.$str174$Case_3c__Many_parses_for___A_____, get_arghash_value(new_string_key, arghash), poss_candidates);
                    html_utilities.html_newline((SubLObject)html_arghash.UNPROVIDED);
                }
                set_arghash_value_list(candidates_key, arghash, poss_candidates);
            }
        }
        else if (html_arghash.NIL != string_utilities.empty_string_p(get_arghash_value(new_string_key, arghash))) {
            if (html_arghash.NIL != debug) {
                html_utilities.html_princ((SubLObject)html_arghash.$str175$Case_4__no_text_typed_in);
                html_utilities.html_newline((SubLObject)html_arghash.UNPROVIDED);
            }
        }
        else if (html_arghash.NIL != get_arghash_value(fort_key, arghash)) {
            if (html_arghash.NIL != debug) {
                html_utilities.html_princ((SubLObject)html_arghash.$str176$Case_5__fort_set__so_use_fort_as_);
                html_utilities.html_newline((SubLObject)html_arghash.UNPROVIDED);
            }
            arghash = html_arghash_nl_fort_input_set_fort(arghash, fort_key, get_arghash_value(fort_key, arghash), generation_fn);
        }
        else if (html_arghash.NIL != debug) {
            html_utilities.html_princ((SubLObject)html_arghash.$str177$Case_6__fallthrough_);
            html_utilities.html_newline((SubLObject)html_arghash.UNPROVIDED);
        }
        set_arghash_value(fort_key, arghash, get_arghash_value(new_fort_key, arghash));
        return arghash;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-arghash.lisp", position = 43766L)
    public static SubLObject html_arghash_nl_fort_list_input(final SubLObject arghash, final SubLObject fort_list_key, final SubLObject fort_key_list, SubLObject debug, SubLObject generation_fn, SubLObject min_required, SubLObject min_shown, SubLObject complete_buttonP, SubLObject filter_col) {
        if (debug == html_arghash.UNPROVIDED) {
            debug = (SubLObject)html_arghash.NIL;
        }
        if (generation_fn == html_arghash.UNPROVIDED) {
            generation_fn = (SubLObject)html_arghash.$sym143$GENERATE_PHRASE;
        }
        if (min_required == html_arghash.UNPROVIDED) {
            min_required = (SubLObject)html_arghash.ONE_INTEGER;
        }
        if (min_shown == html_arghash.UNPROVIDED) {
            min_shown = (SubLObject)html_arghash.ONE_INTEGER;
        }
        if (complete_buttonP == html_arghash.UNPROVIDED) {
            complete_buttonP = (SubLObject)html_arghash.NIL;
        }
        if (filter_col == html_arghash.UNPROVIDED) {
            filter_col = (SubLObject)html_arghash.NIL;
        }
        final SubLObject max = Sequences.length(fort_key_list);
        SubLObject num = (SubLObject)html_arghash.ZERO_INTEGER;
        SubLObject v_forts = (SubLObject)html_arghash.NIL;
        SubLObject unused_fort_keys = (SubLObject)html_arghash.NIL;
        SubLObject cdolist_list_var = fort_key_list;
        SubLObject fort_key = (SubLObject)html_arghash.NIL;
        fort_key = cdolist_list_var.first();
        while (html_arghash.NIL != cdolist_list_var) {
            final SubLObject input_prefix_string = string_utilities.string_from_keyword(fort_key);
            final SubLObject remove_key = string_utilities.keyword_from_string(Sequences.cconcatenate(input_prefix_string, (SubLObject)html_arghash.$str178$_REMOVE));
            final SubLObject requiredP = Numbers.numL(num, min_required);
            if (html_arghash.NIL != html_arghash_nl_fort_input_activeP(arghash, fort_key)) {
                num = Numbers.add(num, (SubLObject)html_arghash.ONE_INTEGER);
                html_arghash_nl_fort_input(arghash, fort_key, debug, generation_fn, requiredP, complete_buttonP, filter_col);
                html_arghash_submit_input(arghash, (SubLObject)html_arghash.$str179$Remove, remove_key, (SubLObject)html_arghash.UNPROVIDED);
                html_utilities.html_newline((SubLObject)html_arghash.UNPROVIDED);
                if (html_arghash.NIL != get_arghash_value(fort_key, arghash)) {
                    v_forts = (SubLObject)ConsesLow.cons(get_arghash_value(fort_key, arghash), v_forts);
                }
            }
            else {
                unused_fort_keys = (SubLObject)ConsesLow.cons(fort_key, unused_fort_keys);
            }
            cdolist_list_var = cdolist_list_var.rest();
            fort_key = cdolist_list_var.first();
        }
        v_forts = Sequences.nreverse(v_forts);
        set_arghash_value_list(fort_list_key, arghash, v_forts);
        unused_fort_keys = Sequences.nreverse(unused_fort_keys);
        if (num.numE(max)) {
            if (html_arghash.NIL != debug) {
                html_utilities.html_princ((SubLObject)html_arghash.$str180$_max_reached_);
            }
        }
        else if (num.numG(max)) {
            if (html_arghash.NIL != debug) {
                html_utilities.html_princ((SubLObject)html_arghash.$str181$_max_exceeded_);
            }
        }
        else if (html_arghash.NIL != unused_fort_keys) {
            if (Numbers.subtract(min_required, num).numGE((SubLObject)html_arghash.ZERO_INTEGER) && html_arghash.NIL != debug) {
                html_utilities.html_princ((SubLObject)html_arghash.$str76$_);
                html_utilities.html_princ(Numbers.subtract(min_required, num));
                html_utilities.html_princ((SubLObject)html_arghash.$str182$_more_required_);
                html_utilities.html_newline((SubLObject)html_arghash.UNPROVIDED);
            }
            SubLObject doneP = (SubLObject)html_arghash.NIL;
            if (html_arghash.NIL == doneP) {
                SubLObject csome_list_var = unused_fort_keys;
                SubLObject unused_fort_key = (SubLObject)html_arghash.NIL;
                unused_fort_key = csome_list_var.first();
                while (html_arghash.NIL == doneP && html_arghash.NIL != csome_list_var) {
                    final SubLObject requiredP2 = Numbers.numL(num, min_required);
                    num = Numbers.add(num, (SubLObject)html_arghash.ONE_INTEGER);
                    if (num.numGE(Numbers.max(min_required, min_shown))) {
                        doneP = (SubLObject)html_arghash.T;
                    }
                    html_arghash_nl_fort_input(arghash, unused_fort_key, debug, Symbols.symbol_function((SubLObject)html_arghash.$sym183$FORT_NAME), requiredP2, complete_buttonP, filter_col);
                    html_utilities.html_newline((SubLObject)html_arghash.UNPROVIDED);
                    csome_list_var = csome_list_var.rest();
                    unused_fort_key = csome_list_var.first();
                }
            }
        }
        else {
            html_utilities.html_princ((SubLObject)html_arghash.$str184$_key_list_length_reached_);
        }
        html_arghash_hidden_input(arghash, fort_list_key, (SubLObject)html_arghash.UNPROVIDED, (SubLObject)html_arghash.UNPROVIDED);
        return (SubLObject)html_arghash.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-arghash.lisp", position = 45683L)
    public static SubLObject html_arghash_nl_fort_list_input_validate(final SubLObject arghash, final SubLObject fort_list_key, final SubLObject fort_key_list, SubLObject debug, SubLObject generation_fn, SubLObject parse_fn, SubLObject filter_col, SubLObject filter_mt) {
        if (debug == html_arghash.UNPROVIDED) {
            debug = (SubLObject)html_arghash.NIL;
        }
        if (generation_fn == html_arghash.UNPROVIDED) {
            generation_fn = (SubLObject)html_arghash.$sym143$GENERATE_PHRASE;
        }
        if (parse_fn == html_arghash.UNPROVIDED) {
            parse_fn = (SubLObject)html_arghash.$sym161$TERMS_FOR_BROWSING;
        }
        if (filter_col == html_arghash.UNPROVIDED) {
            filter_col = (SubLObject)html_arghash.NIL;
        }
        if (filter_mt == html_arghash.UNPROVIDED) {
            filter_mt = (SubLObject)html_arghash.NIL;
        }
        SubLObject v_forts = (SubLObject)html_arghash.NIL;
        SubLObject cdolist_list_var = fort_key_list;
        SubLObject fort_key = (SubLObject)html_arghash.NIL;
        fort_key = cdolist_list_var.first();
        while (html_arghash.NIL != cdolist_list_var) {
            final SubLObject input_prefix_string = string_utilities.string_from_keyword(fort_key);
            final SubLObject remove_key = string_utilities.keyword_from_string(Sequences.cconcatenate(input_prefix_string, (SubLObject)html_arghash.$str178$_REMOVE));
            if (html_arghash.NIL != get_arghash_value(remove_key, arghash)) {
                html_arghash_nl_fort_input_clear(arghash, fort_key);
            }
            html_arghash_nl_fort_input_validate(arghash, fort_key, debug, generation_fn, parse_fn, filter_col, filter_mt);
            if (html_arghash.NIL != forts.fort_p(get_arghash_value(fort_key, arghash))) {
                v_forts = (SubLObject)ConsesLow.cons(get_arghash_value(fort_key, arghash), v_forts);
            }
            v_forts = Sequences.nreverse(v_forts);
            set_arghash_value_list(fort_list_key, arghash, v_forts);
            cdolist_list_var = cdolist_list_var.rest();
            fort_key = cdolist_list_var.first();
        }
        return (SubLObject)html_arghash.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/html-arghash.lisp", position = 46687L)
    public static SubLObject arghash_fort_key_list(final SubLObject n) {
        assert html_arghash.NIL != subl_promotions.non_negative_integer_p(n) : n;
        SubLObject result = (SubLObject)html_arghash.NIL;
        SubLObject m;
        for (m = (SubLObject)html_arghash.NIL, m = (SubLObject)html_arghash.ZERO_INTEGER; m.numL(n); m = Numbers.add(m, (SubLObject)html_arghash.ONE_INTEGER)) {
            result = (SubLObject)ConsesLow.cons(Symbols.make_keyword(Sequences.cconcatenate((SubLObject)html_arghash.$str186$X, format_nil.format_nil_a_no_copy(m))), result);
        }
        return Sequences.nreverse(result);
    }
    
    public static SubLObject declare_html_arghash_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_arghash", "print_arghash_type", "PRINT-ARGHASH-TYPE", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_arghash", "arghash_type_print_function_trampoline", "ARGHASH-TYPE-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_arghash", "arghash_type_p", "ARGHASH-TYPE-P", 1, 0, false);
        new $arghash_type_p$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_arghash", "arghash_type_name", "ARGHASH-TYPE-NAME", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_arghash", "arghash_type_keyword", "ARGHASH-TYPE-KEYWORD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_arghash", "arghash_type_character", "ARGHASH-TYPE-CHARACTER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_arghash", "arghash_type_string_validator", "ARGHASH-TYPE-STRING-VALIDATOR", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_arghash", "arghash_type_string_to_object_fn", "ARGHASH-TYPE-STRING-TO-OBJECT-FN", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_arghash", "arghash_type_object_detector", "ARGHASH-TYPE-OBJECT-DETECTOR", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_arghash", "arghash_type_object_to_string_fn", "ARGHASH-TYPE-OBJECT-TO-STRING-FN", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_arghash", "arghash_type_priority", "ARGHASH-TYPE-PRIORITY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_arghash", "_csetf_arghash_type_name", "_CSETF-ARGHASH-TYPE-NAME", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_arghash", "_csetf_arghash_type_keyword", "_CSETF-ARGHASH-TYPE-KEYWORD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_arghash", "_csetf_arghash_type_character", "_CSETF-ARGHASH-TYPE-CHARACTER", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_arghash", "_csetf_arghash_type_string_validator", "_CSETF-ARGHASH-TYPE-STRING-VALIDATOR", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_arghash", "_csetf_arghash_type_string_to_object_fn", "_CSETF-ARGHASH-TYPE-STRING-TO-OBJECT-FN", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_arghash", "_csetf_arghash_type_object_detector", "_CSETF-ARGHASH-TYPE-OBJECT-DETECTOR", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_arghash", "_csetf_arghash_type_object_to_string_fn", "_CSETF-ARGHASH-TYPE-OBJECT-TO-STRING-FN", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_arghash", "_csetf_arghash_type_priority", "_CSETF-ARGHASH-TYPE-PRIORITY", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_arghash", "make_arghash_type", "MAKE-ARGHASH-TYPE", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_arghash", "visit_defstruct_arghash_type", "VISIT-DEFSTRUCT-ARGHASH-TYPE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_arghash", "visit_defstruct_object_arghash_type_method", "VISIT-DEFSTRUCT-OBJECT-ARGHASH-TYPE-METHOD", 2, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.html_arghash", "defarghash_type", "DEFARGHASH-TYPE");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_arghash", "arghash_keyword_to_arghash_type", "ARGHASH-KEYWORD-TO-ARGHASH-TYPE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_arghash", "arghash_character_to_arghash_type", "ARGHASH-CHARACTER-TO-ARGHASH-TYPE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_arghash", "arghash_keywordP", "ARGHASH-KEYWORD?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_arghash", "arghash_types", "ARGHASH-TYPES", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_arghash", "arghash_string_to_keyword", "ARGHASH-STRING-TO-KEYWORD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_arghash", "arghash_keyword_to_string", "ARGHASH-KEYWORD-TO-STRING", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_arghash", "arghash_fort_to_string", "ARGHASH-FORT-TO-STRING", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_arghash", "arghash_string_to_fort", "ARGHASH-STRING-TO-FORT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_arghash", "arghash_assertion_to_string", "ARGHASH-ASSERTION-TO-STRING", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_arghash", "arghash_string_to_assertion", "ARGHASH-STRING-TO-ASSERTION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_arghash", "arghash_string_to_integer", "ARGHASH-STRING-TO-INTEGER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_arghash", "arghash_integer_to_string", "ARGHASH-INTEGER-TO-STRING", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_arghash", "arghash_boolean_string_to_boolean", "ARGHASH-BOOLEAN-STRING-TO-BOOLEAN", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_arghash", "arghash_boolean_detector", "ARGHASH-BOOLEAN-DETECTOR", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_arghash", "arghash_boolean_to_boolean_string", "ARGHASH-BOOLEAN-TO-BOOLEAN-STRING", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_arghash", "arghash_prefixed_string_to_object", "ARGHASH-PREFIXED-STRING-TO-OBJECT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_arghash", "arghash_string_to_list", "ARGHASH-STRING-TO-LIST", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_arghash", "arghash_list_to_string", "ARGHASH-LIST-TO-STRING", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_arghash", "arghash_string_to_el_formula", "ARGHASH-STRING-TO-EL-FORMULA", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_arghash", "arghash_el_formula_to_string", "ARGHASH-EL-FORMULA-TO-STRING", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_arghash", "arghash_default_to_string", "ARGHASH-DEFAULT-TO-STRING", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_arghash", "arghash_handle_string", "ARGHASH-HANDLE-STRING", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_arghash", "arghash_parse_key_and_value", "ARGHASH-PARSE-KEY-AND-VALUE", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_arghash", "arghash_get_handler_char_and_string", "ARGHASH-GET-HANDLER-CHAR-AND-STRING", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_arghash", "arghash_get_string", "ARGHASH-GET-STRING", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_arghash", "arghash_make_key_and_value_strings", "ARGHASH-MAKE-KEY-AND-VALUE-STRINGS", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_arghash", "arghash_make_key_string", "ARGHASH-MAKE-KEY-STRING", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_arghash", "exists_arghash_valueP", "EXISTS-ARGHASH-VALUE?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_arghash", "get_arghash_value", "GET-ARGHASH-VALUE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_arghash", "get_arghash_value_list", "GET-ARGHASH-VALUE-LIST", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_arghash", "set_arghash_value", "SET-ARGHASH-VALUE", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_arghash", "set_arghash_value_list", "SET-ARGHASH-VALUE-LIST", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_arghash", "push_arghash_value", "PUSH-ARGHASH-VALUE", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_arghash", "pushnew_arghash_value", "PUSHNEW-ARGHASH-VALUE", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_arghash", "rem_arghash_value", "REM-ARGHASH-VALUE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_arghash", "rem_arghash_values", "REM-ARGHASH-VALUES", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_arghash", "rem_arghash_values_inverse", "REM-ARGHASH-VALUES-INVERSE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_arghash", "new_arghash", "NEW-ARGHASH", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_arghash", "arghash_p", "ARGHASH-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_arghash", "copy_arghash", "COPY-ARGHASH", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_arghash", "get_arghash_keys", "GET-ARGHASH-KEYS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_arghash", "arglist_to_arghash", "ARGLIST-TO-ARGHASH", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_arghash", "argassoc_to_arghash", "ARGASSOC-TO-ARGHASH", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_arghash", "html_arghash_href", "HTML-ARGHASH-HREF", 2, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.html_arghash", "html_arghash_fancy_anchor", "HTML-ARGHASH-FANCY-ANCHOR");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_arghash", "html_arghash_checkbox_input", "HTML-ARGHASH-CHECKBOX-INPUT", 3, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_arghash", "html_arghash_radio_input", "HTML-ARGHASH-RADIO-INPUT", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_arghash", "html_arghash_focus_radio_input", "HTML-ARGHASH-FOCUS-RADIO-INPUT", 5, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_arghash", "html_arghash_clear_radio_input", "HTML-ARGHASH-CLEAR-RADIO-INPUT", 5, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_arghash", "html_arghash_hidden_input", "HTML-ARGHASH-HIDDEN-INPUT", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_arghash", "html_arghash_hidden_input_force", "HTML-ARGHASH-HIDDEN-INPUT-FORCE", 3, 2, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.html_arghash", "html_arghash_fancy_select", "HTML-ARGHASH-FANCY-SELECT");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.html_arghash", "html_arghash_fancy_option", "HTML-ARGHASH-FANCY-OPTION");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.html_arghash", "html_arghash_fancy_select_with_options", "HTML-ARGHASH-FANCY-SELECT-WITH-OPTIONS");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_arghash", "html_arghash_submit_input", "HTML-ARGHASH-SUBMIT-INPUT", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_arghash", "html_arghash_clear_input_button", "HTML-ARGHASH-CLEAR-INPUT-BUTTON", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_arghash", "html_arghash_complete_button", "HTML-ARGHASH-COMPLETE-BUTTON", 3, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_arghash", "html_arghash_text_input", "HTML-ARGHASH-TEXT-INPUT", 2, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_arghash", "html_arghash_textarea_input", "HTML-ARGHASH-TEXTAREA-INPUT", 2, 5, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_arghash", "html_arghash_fort_input", "HTML-ARGHASH-FORT-INPUT", 2, 4, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_arghash", "html_arghash_sentence_input", "HTML-ARGHASH-SENTENCE-INPUT", 2, 6, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_arghash", "html_arghash_nl_fort_input", "HTML-ARGHASH-NL-FORT-INPUT", 2, 5, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_arghash", "html_arghash_nl_fort_input_invisible", "HTML-ARGHASH-NL-FORT-INPUT-INVISIBLE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_arghash", "html_arghash_nl_fort_input_activeP", "HTML-ARGHASH-NL-FORT-INPUT-ACTIVE?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_arghash", "html_arghash_nl_fort_input_doneP", "HTML-ARGHASH-NL-FORT-INPUT-DONE?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_arghash", "html_arghash_nl_fort_input_clear", "HTML-ARGHASH-NL-FORT-INPUT-CLEAR", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_arghash", "html_arghash_nl_fort_input_force_default_if_unset", "HTML-ARGHASH-NL-FORT-INPUT-FORCE-DEFAULT-IF-UNSET", 3, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_arghash", "html_arghash_nl_fort_list_input_set_forts", "HTML-ARGHASH-NL-FORT-LIST-INPUT-SET-FORTS", 4, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_arghash", "html_arghash_nl_fort_input_set_fort", "HTML-ARGHASH-NL-FORT-INPUT-SET-FORT", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_arghash", "html_arghash_nl_fort_input_validate", "HTML-ARGHASH-NL-FORT-INPUT-VALIDATE", 2, 5, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_arghash", "html_arghash_nl_fort_list_input", "HTML-ARGHASH-NL-FORT-LIST-INPUT", 3, 6, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_arghash", "html_arghash_nl_fort_list_input_validate", "HTML-ARGHASH-NL-FORT-LIST-INPUT-VALIDATE", 3, 5, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.html_arghash", "arghash_fort_key_list", "ARGHASH-FORT-KEY-LIST", 1, 0, false);
        return (SubLObject)html_arghash.NIL;
    }
    
    public static SubLObject init_html_arghash_file() {
        html_arghash.$arghash_types$ = SubLFiles.defparameter("*ARGHASH-TYPES*", (SubLObject)html_arghash.NIL);
        html_arghash.$arghash_types_by_keyword$ = SubLFiles.defparameter("*ARGHASH-TYPES-BY-KEYWORD*", Hashtables.make_hash_table((SubLObject)html_arghash.TEN_INTEGER, (SubLObject)html_arghash.UNPROVIDED, (SubLObject)html_arghash.UNPROVIDED));
        html_arghash.$arghash_types_by_character$ = SubLFiles.defparameter("*ARGHASH-TYPES-BY-CHARACTER*", Hashtables.make_hash_table((SubLObject)html_arghash.TEN_INTEGER, (SubLObject)html_arghash.UNPROVIDED, (SubLObject)html_arghash.UNPROVIDED));
        html_arghash.$dtp_arghash_type$ = SubLFiles.defconstant("*DTP-ARGHASH-TYPE*", (SubLObject)html_arghash.$sym1$ARGHASH_TYPE);
        return (SubLObject)html_arghash.NIL;
    }
    
    public static SubLObject setup_html_arghash_file() {
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), html_arghash.$dtp_arghash_type$.getGlobalValue(), Symbols.symbol_function((SubLObject)html_arghash.$sym8$ARGHASH_TYPE_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)html_arghash.$list9);
        Structures.def_csetf((SubLObject)html_arghash.$sym10$ARGHASH_TYPE_NAME, (SubLObject)html_arghash.$sym11$_CSETF_ARGHASH_TYPE_NAME);
        Structures.def_csetf((SubLObject)html_arghash.$sym12$ARGHASH_TYPE_KEYWORD, (SubLObject)html_arghash.$sym13$_CSETF_ARGHASH_TYPE_KEYWORD);
        Structures.def_csetf((SubLObject)html_arghash.$sym14$ARGHASH_TYPE_CHARACTER, (SubLObject)html_arghash.$sym15$_CSETF_ARGHASH_TYPE_CHARACTER);
        Structures.def_csetf((SubLObject)html_arghash.$sym16$ARGHASH_TYPE_STRING_VALIDATOR, (SubLObject)html_arghash.$sym17$_CSETF_ARGHASH_TYPE_STRING_VALIDATOR);
        Structures.def_csetf((SubLObject)html_arghash.$sym18$ARGHASH_TYPE_STRING_TO_OBJECT_FN, (SubLObject)html_arghash.$sym19$_CSETF_ARGHASH_TYPE_STRING_TO_OBJECT_FN);
        Structures.def_csetf((SubLObject)html_arghash.$sym20$ARGHASH_TYPE_OBJECT_DETECTOR, (SubLObject)html_arghash.$sym21$_CSETF_ARGHASH_TYPE_OBJECT_DETECTOR);
        Structures.def_csetf((SubLObject)html_arghash.$sym22$ARGHASH_TYPE_OBJECT_TO_STRING_FN, (SubLObject)html_arghash.$sym23$_CSETF_ARGHASH_TYPE_OBJECT_TO_STRING_FN);
        Structures.def_csetf((SubLObject)html_arghash.$sym24$ARGHASH_TYPE_PRIORITY, (SubLObject)html_arghash.$sym25$_CSETF_ARGHASH_TYPE_PRIORITY);
        Equality.identity((SubLObject)html_arghash.$sym1$ARGHASH_TYPE);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), html_arghash.$dtp_arghash_type$.getGlobalValue(), Symbols.symbol_function((SubLObject)html_arghash.$sym39$VISIT_DEFSTRUCT_OBJECT_ARGHASH_TYPE_METHOD));
        SubLObject new_arghash_type = make_arghash_type((SubLObject)html_arghash.$list54);
        _csetf_arghash_type_name(new_arghash_type, (SubLObject)html_arghash.$sym55$KEYWORD);
        Hashtables.sethash(arghash_type_keyword(new_arghash_type), html_arghash.$arghash_types_by_keyword$.getDynamicValue(), new_arghash_type);
        Hashtables.sethash(arghash_type_character(new_arghash_type), html_arghash.$arghash_types_by_character$.getDynamicValue(), new_arghash_type);
        html_arghash.$arghash_types$.setDynamicValue((SubLObject)ConsesLow.cons(new_arghash_type, Sequences.delete((SubLObject)html_arghash.$sym55$KEYWORD, html_arghash.$arghash_types$.getDynamicValue(), Symbols.symbol_function((SubLObject)html_arghash.EQUAL), (SubLObject)html_arghash.$sym10$ARGHASH_TYPE_NAME, (SubLObject)html_arghash.UNPROVIDED, (SubLObject)html_arghash.UNPROVIDED, (SubLObject)html_arghash.UNPROVIDED)));
        new_arghash_type = make_arghash_type((SubLObject)html_arghash.$list58);
        _csetf_arghash_type_name(new_arghash_type, (SubLObject)html_arghash.$sym59$FORT);
        Hashtables.sethash(arghash_type_keyword(new_arghash_type), html_arghash.$arghash_types_by_keyword$.getDynamicValue(), new_arghash_type);
        Hashtables.sethash(arghash_type_character(new_arghash_type), html_arghash.$arghash_types_by_character$.getDynamicValue(), new_arghash_type);
        html_arghash.$arghash_types$.setDynamicValue((SubLObject)ConsesLow.cons(new_arghash_type, Sequences.delete((SubLObject)html_arghash.$sym59$FORT, html_arghash.$arghash_types$.getDynamicValue(), Symbols.symbol_function((SubLObject)html_arghash.EQUAL), (SubLObject)html_arghash.$sym10$ARGHASH_TYPE_NAME, (SubLObject)html_arghash.UNPROVIDED, (SubLObject)html_arghash.UNPROVIDED, (SubLObject)html_arghash.UNPROVIDED)));
        new_arghash_type = make_arghash_type((SubLObject)html_arghash.$list60);
        _csetf_arghash_type_name(new_arghash_type, (SubLObject)html_arghash.$sym61$ASSERTION);
        Hashtables.sethash(arghash_type_keyword(new_arghash_type), html_arghash.$arghash_types_by_keyword$.getDynamicValue(), new_arghash_type);
        Hashtables.sethash(arghash_type_character(new_arghash_type), html_arghash.$arghash_types_by_character$.getDynamicValue(), new_arghash_type);
        html_arghash.$arghash_types$.setDynamicValue((SubLObject)ConsesLow.cons(new_arghash_type, Sequences.delete((SubLObject)html_arghash.$sym61$ASSERTION, html_arghash.$arghash_types$.getDynamicValue(), Symbols.symbol_function((SubLObject)html_arghash.EQUAL), (SubLObject)html_arghash.$sym10$ARGHASH_TYPE_NAME, (SubLObject)html_arghash.UNPROVIDED, (SubLObject)html_arghash.UNPROVIDED, (SubLObject)html_arghash.UNPROVIDED)));
        new_arghash_type = make_arghash_type((SubLObject)html_arghash.$list62);
        _csetf_arghash_type_name(new_arghash_type, (SubLObject)html_arghash.$sym63$INTEGER);
        Hashtables.sethash(arghash_type_keyword(new_arghash_type), html_arghash.$arghash_types_by_keyword$.getDynamicValue(), new_arghash_type);
        Hashtables.sethash(arghash_type_character(new_arghash_type), html_arghash.$arghash_types_by_character$.getDynamicValue(), new_arghash_type);
        html_arghash.$arghash_types$.setDynamicValue((SubLObject)ConsesLow.cons(new_arghash_type, Sequences.delete((SubLObject)html_arghash.$sym63$INTEGER, html_arghash.$arghash_types$.getDynamicValue(), Symbols.symbol_function((SubLObject)html_arghash.EQUAL), (SubLObject)html_arghash.$sym10$ARGHASH_TYPE_NAME, (SubLObject)html_arghash.UNPROVIDED, (SubLObject)html_arghash.UNPROVIDED, (SubLObject)html_arghash.UNPROVIDED)));
        new_arghash_type = make_arghash_type((SubLObject)html_arghash.$list64);
        _csetf_arghash_type_name(new_arghash_type, (SubLObject)html_arghash.$sym65$BOOLEAN);
        Hashtables.sethash(arghash_type_keyword(new_arghash_type), html_arghash.$arghash_types_by_keyword$.getDynamicValue(), new_arghash_type);
        Hashtables.sethash(arghash_type_character(new_arghash_type), html_arghash.$arghash_types_by_character$.getDynamicValue(), new_arghash_type);
        html_arghash.$arghash_types$.setDynamicValue((SubLObject)ConsesLow.cons(new_arghash_type, Sequences.delete((SubLObject)html_arghash.$sym65$BOOLEAN, html_arghash.$arghash_types$.getDynamicValue(), Symbols.symbol_function((SubLObject)html_arghash.EQUAL), (SubLObject)html_arghash.$sym10$ARGHASH_TYPE_NAME, (SubLObject)html_arghash.UNPROVIDED, (SubLObject)html_arghash.UNPROVIDED, (SubLObject)html_arghash.UNPROVIDED)));
        new_arghash_type = make_arghash_type((SubLObject)html_arghash.$list69);
        _csetf_arghash_type_name(new_arghash_type, (SubLObject)html_arghash.$sym70$LIST);
        Hashtables.sethash(arghash_type_keyword(new_arghash_type), html_arghash.$arghash_types_by_keyword$.getDynamicValue(), new_arghash_type);
        Hashtables.sethash(arghash_type_character(new_arghash_type), html_arghash.$arghash_types_by_character$.getDynamicValue(), new_arghash_type);
        html_arghash.$arghash_types$.setDynamicValue((SubLObject)ConsesLow.cons(new_arghash_type, Sequences.delete((SubLObject)html_arghash.$sym70$LIST, html_arghash.$arghash_types$.getDynamicValue(), Symbols.symbol_function((SubLObject)html_arghash.EQUAL), (SubLObject)html_arghash.$sym10$ARGHASH_TYPE_NAME, (SubLObject)html_arghash.UNPROVIDED, (SubLObject)html_arghash.UNPROVIDED, (SubLObject)html_arghash.UNPROVIDED)));
        new_arghash_type = make_arghash_type((SubLObject)html_arghash.$list80);
        _csetf_arghash_type_name(new_arghash_type, (SubLObject)html_arghash.$sym81$EL_FORMULA);
        Hashtables.sethash(arghash_type_keyword(new_arghash_type), html_arghash.$arghash_types_by_keyword$.getDynamicValue(), new_arghash_type);
        Hashtables.sethash(arghash_type_character(new_arghash_type), html_arghash.$arghash_types_by_character$.getDynamicValue(), new_arghash_type);
        html_arghash.$arghash_types$.setDynamicValue((SubLObject)ConsesLow.cons(new_arghash_type, Sequences.delete((SubLObject)html_arghash.$sym81$EL_FORMULA, html_arghash.$arghash_types$.getDynamicValue(), Symbols.symbol_function((SubLObject)html_arghash.EQUAL), (SubLObject)html_arghash.$sym10$ARGHASH_TYPE_NAME, (SubLObject)html_arghash.UNPROVIDED, (SubLObject)html_arghash.UNPROVIDED, (SubLObject)html_arghash.UNPROVIDED)));
        new_arghash_type = make_arghash_type((SubLObject)html_arghash.$list82);
        _csetf_arghash_type_name(new_arghash_type, (SubLObject)html_arghash.$sym83$DEFAULT);
        Hashtables.sethash(arghash_type_keyword(new_arghash_type), html_arghash.$arghash_types_by_keyword$.getDynamicValue(), new_arghash_type);
        Hashtables.sethash(arghash_type_character(new_arghash_type), html_arghash.$arghash_types_by_character$.getDynamicValue(), new_arghash_type);
        html_arghash.$arghash_types$.setDynamicValue((SubLObject)ConsesLow.cons(new_arghash_type, Sequences.delete((SubLObject)html_arghash.$sym83$DEFAULT, html_arghash.$arghash_types$.getDynamicValue(), Symbols.symbol_function((SubLObject)html_arghash.EQUAL), (SubLObject)html_arghash.$sym10$ARGHASH_TYPE_NAME, (SubLObject)html_arghash.UNPROVIDED, (SubLObject)html_arghash.UNPROVIDED, (SubLObject)html_arghash.UNPROVIDED)));
        return (SubLObject)html_arghash.NIL;
    }
    
    public void declareFunctions() {
        declare_html_arghash_file();
    }
    
    public void initializeVariables() {
        init_html_arghash_file();
    }
    
    public void runTopLevelForms() {
        setup_html_arghash_file();
    }
    
    static {
        me = (SubLFile)new html_arghash();
        html_arghash.$arghash_types$ = null;
        html_arghash.$arghash_types_by_keyword$ = null;
        html_arghash.$arghash_types_by_character$ = null;
        html_arghash.$dtp_arghash_type$ = null;
        $str0$_ = SubLObjectFactory.makeString("#");
        $sym1$ARGHASH_TYPE = SubLObjectFactory.makeSymbol("ARGHASH-TYPE");
        $sym2$ARGHASH_TYPE_P = SubLObjectFactory.makeSymbol("ARGHASH-TYPE-P");
        $list3 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NAME"), (SubLObject)SubLObjectFactory.makeSymbol("KEYWORD"), (SubLObject)SubLObjectFactory.makeSymbol("CHARACTER"), (SubLObject)SubLObjectFactory.makeSymbol("STRING-VALIDATOR"), (SubLObject)SubLObjectFactory.makeSymbol("STRING-TO-OBJECT-FN"), (SubLObject)SubLObjectFactory.makeSymbol("OBJECT-DETECTOR"), (SubLObject)SubLObjectFactory.makeSymbol("OBJECT-TO-STRING-FN"), (SubLObject)SubLObjectFactory.makeSymbol("PRIORITY"));
        $list4 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NAME"), (SubLObject)SubLObjectFactory.makeKeyword("KEYWORD"), (SubLObject)SubLObjectFactory.makeKeyword("CHARACTER"), (SubLObject)SubLObjectFactory.makeKeyword("STRING-VALIDATOR"), (SubLObject)SubLObjectFactory.makeKeyword("STRING-TO-OBJECT-FN"), (SubLObject)SubLObjectFactory.makeKeyword("OBJECT-DETECTOR"), (SubLObject)SubLObjectFactory.makeKeyword("OBJECT-TO-STRING-FN"), (SubLObject)SubLObjectFactory.makeKeyword("PRIORITY"));
        $list5 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ARGHASH-TYPE-NAME"), (SubLObject)SubLObjectFactory.makeSymbol("ARGHASH-TYPE-KEYWORD"), (SubLObject)SubLObjectFactory.makeSymbol("ARGHASH-TYPE-CHARACTER"), (SubLObject)SubLObjectFactory.makeSymbol("ARGHASH-TYPE-STRING-VALIDATOR"), (SubLObject)SubLObjectFactory.makeSymbol("ARGHASH-TYPE-STRING-TO-OBJECT-FN"), (SubLObject)SubLObjectFactory.makeSymbol("ARGHASH-TYPE-OBJECT-DETECTOR"), (SubLObject)SubLObjectFactory.makeSymbol("ARGHASH-TYPE-OBJECT-TO-STRING-FN"), (SubLObject)SubLObjectFactory.makeSymbol("ARGHASH-TYPE-PRIORITY"));
        $list6 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("_CSETF-ARGHASH-TYPE-NAME"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-ARGHASH-TYPE-KEYWORD"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-ARGHASH-TYPE-CHARACTER"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-ARGHASH-TYPE-STRING-VALIDATOR"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-ARGHASH-TYPE-STRING-TO-OBJECT-FN"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-ARGHASH-TYPE-OBJECT-DETECTOR"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-ARGHASH-TYPE-OBJECT-TO-STRING-FN"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-ARGHASH-TYPE-PRIORITY"));
        $sym7$PRINT_ARGHASH_TYPE = SubLObjectFactory.makeSymbol("PRINT-ARGHASH-TYPE");
        $sym8$ARGHASH_TYPE_PRINT_FUNCTION_TRAMPOLINE = SubLObjectFactory.makeSymbol("ARGHASH-TYPE-PRINT-FUNCTION-TRAMPOLINE");
        $list9 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("ARGHASH-TYPE-P"));
        $sym10$ARGHASH_TYPE_NAME = SubLObjectFactory.makeSymbol("ARGHASH-TYPE-NAME");
        $sym11$_CSETF_ARGHASH_TYPE_NAME = SubLObjectFactory.makeSymbol("_CSETF-ARGHASH-TYPE-NAME");
        $sym12$ARGHASH_TYPE_KEYWORD = SubLObjectFactory.makeSymbol("ARGHASH-TYPE-KEYWORD");
        $sym13$_CSETF_ARGHASH_TYPE_KEYWORD = SubLObjectFactory.makeSymbol("_CSETF-ARGHASH-TYPE-KEYWORD");
        $sym14$ARGHASH_TYPE_CHARACTER = SubLObjectFactory.makeSymbol("ARGHASH-TYPE-CHARACTER");
        $sym15$_CSETF_ARGHASH_TYPE_CHARACTER = SubLObjectFactory.makeSymbol("_CSETF-ARGHASH-TYPE-CHARACTER");
        $sym16$ARGHASH_TYPE_STRING_VALIDATOR = SubLObjectFactory.makeSymbol("ARGHASH-TYPE-STRING-VALIDATOR");
        $sym17$_CSETF_ARGHASH_TYPE_STRING_VALIDATOR = SubLObjectFactory.makeSymbol("_CSETF-ARGHASH-TYPE-STRING-VALIDATOR");
        $sym18$ARGHASH_TYPE_STRING_TO_OBJECT_FN = SubLObjectFactory.makeSymbol("ARGHASH-TYPE-STRING-TO-OBJECT-FN");
        $sym19$_CSETF_ARGHASH_TYPE_STRING_TO_OBJECT_FN = SubLObjectFactory.makeSymbol("_CSETF-ARGHASH-TYPE-STRING-TO-OBJECT-FN");
        $sym20$ARGHASH_TYPE_OBJECT_DETECTOR = SubLObjectFactory.makeSymbol("ARGHASH-TYPE-OBJECT-DETECTOR");
        $sym21$_CSETF_ARGHASH_TYPE_OBJECT_DETECTOR = SubLObjectFactory.makeSymbol("_CSETF-ARGHASH-TYPE-OBJECT-DETECTOR");
        $sym22$ARGHASH_TYPE_OBJECT_TO_STRING_FN = SubLObjectFactory.makeSymbol("ARGHASH-TYPE-OBJECT-TO-STRING-FN");
        $sym23$_CSETF_ARGHASH_TYPE_OBJECT_TO_STRING_FN = SubLObjectFactory.makeSymbol("_CSETF-ARGHASH-TYPE-OBJECT-TO-STRING-FN");
        $sym24$ARGHASH_TYPE_PRIORITY = SubLObjectFactory.makeSymbol("ARGHASH-TYPE-PRIORITY");
        $sym25$_CSETF_ARGHASH_TYPE_PRIORITY = SubLObjectFactory.makeSymbol("_CSETF-ARGHASH-TYPE-PRIORITY");
        $kw26$NAME = SubLObjectFactory.makeKeyword("NAME");
        $kw27$KEYWORD = SubLObjectFactory.makeKeyword("KEYWORD");
        $kw28$CHARACTER = SubLObjectFactory.makeKeyword("CHARACTER");
        $kw29$STRING_VALIDATOR = SubLObjectFactory.makeKeyword("STRING-VALIDATOR");
        $kw30$STRING_TO_OBJECT_FN = SubLObjectFactory.makeKeyword("STRING-TO-OBJECT-FN");
        $kw31$OBJECT_DETECTOR = SubLObjectFactory.makeKeyword("OBJECT-DETECTOR");
        $kw32$OBJECT_TO_STRING_FN = SubLObjectFactory.makeKeyword("OBJECT-TO-STRING-FN");
        $kw33$PRIORITY = SubLObjectFactory.makeKeyword("PRIORITY");
        $str34$Invalid_slot__S_for_construction_ = SubLObjectFactory.makeString("Invalid slot ~S for construction function");
        $kw35$BEGIN = SubLObjectFactory.makeKeyword("BEGIN");
        $sym36$MAKE_ARGHASH_TYPE = SubLObjectFactory.makeSymbol("MAKE-ARGHASH-TYPE");
        $kw37$SLOT = SubLObjectFactory.makeKeyword("SLOT");
        $kw38$END = SubLObjectFactory.makeKeyword("END");
        $sym39$VISIT_DEFSTRUCT_OBJECT_ARGHASH_TYPE_METHOD = SubLObjectFactory.makeSymbol("VISIT-DEFSTRUCT-OBJECT-ARGHASH-TYPE-METHOD");
        $list40 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NAME"), (SubLObject)SubLObjectFactory.makeSymbol("&REST"), (SubLObject)SubLObjectFactory.makeSymbol("ARGLIST"));
        $sym41$NEW_ARGHASH_TYPE = SubLObjectFactory.makeUninternedSymbol("NEW-ARGHASH-TYPE");
        $sym42$CLET = SubLObjectFactory.makeSymbol("CLET");
        $sym43$QUOTE = SubLObjectFactory.makeSymbol("QUOTE");
        $sym44$CSETF = SubLObjectFactory.makeSymbol("CSETF");
        $sym45$SETHASH = SubLObjectFactory.makeSymbol("SETHASH");
        $sym46$_ARGHASH_TYPES_BY_KEYWORD_ = SubLObjectFactory.makeSymbol("*ARGHASH-TYPES-BY-KEYWORD*");
        $sym47$_ARGHASH_TYPES_BY_CHARACTER_ = SubLObjectFactory.makeSymbol("*ARGHASH-TYPES-BY-CHARACTER*");
        $sym48$CSETQ = SubLObjectFactory.makeSymbol("CSETQ");
        $sym49$_ARGHASH_TYPES_ = SubLObjectFactory.makeSymbol("*ARGHASH-TYPES*");
        $sym50$CONS = SubLObjectFactory.makeSymbol("CONS");
        $sym51$DELETE = SubLObjectFactory.makeSymbol("DELETE");
        $list52 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*ARGHASH-TYPES*"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCTION"), (SubLObject)html_arghash.EQUAL), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("ARGHASH-TYPE-NAME")));
        $sym53$_ = SubLObjectFactory.makeSymbol("<");
        $list54 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("NAME"), SubLObjectFactory.makeString("keyword"), SubLObjectFactory.makeKeyword("KEYWORD"), SubLObjectFactory.makeKeyword("KEYWORD"), SubLObjectFactory.makeKeyword("CHARACTER"), Characters.CHAR_colon, SubLObjectFactory.makeKeyword("STRING-VALIDATOR"), SubLObjectFactory.makeSymbol("STRINGP"), SubLObjectFactory.makeKeyword("STRING-TO-OBJECT-FN"), SubLObjectFactory.makeSymbol("ARGHASH-STRING-TO-KEYWORD"), SubLObjectFactory.makeKeyword("OBJECT-DETECTOR"), SubLObjectFactory.makeSymbol("KEYWORDP"), SubLObjectFactory.makeKeyword("OBJECT-TO-STRING-FN"), SubLObjectFactory.makeSymbol("ARGHASH-KEYWORD-TO-STRING"), SubLObjectFactory.makeKeyword("PRIORITY"), html_arghash.ONE_INTEGER });
        $sym55$KEYWORD = SubLObjectFactory.makeSymbol("KEYWORD");
        $str56$_A = SubLObjectFactory.makeString("~A");
        $str57$ = SubLObjectFactory.makeString("");
        $list58 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("NAME"), SubLObjectFactory.makeString("fort"), SubLObjectFactory.makeKeyword("KEYWORD"), SubLObjectFactory.makeKeyword("FORT"), SubLObjectFactory.makeKeyword("CHARACTER"), Characters.CHAR_dollar, SubLObjectFactory.makeKeyword("STRING-VALIDATOR"), SubLObjectFactory.makeSymbol("STRINGP"), SubLObjectFactory.makeKeyword("STRING-TO-OBJECT-FN"), SubLObjectFactory.makeSymbol("ARGHASH-STRING-TO-FORT"), SubLObjectFactory.makeKeyword("OBJECT-DETECTOR"), SubLObjectFactory.makeSymbol("FORT-P"), SubLObjectFactory.makeKeyword("OBJECT-TO-STRING-FN"), SubLObjectFactory.makeSymbol("ARGHASH-FORT-TO-STRING"), SubLObjectFactory.makeKeyword("PRIORITY"), html_arghash.TWO_INTEGER });
        $sym59$FORT = SubLObjectFactory.makeSymbol("FORT");
        $list60 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("NAME"), SubLObjectFactory.makeString("assertion"), SubLObjectFactory.makeKeyword("KEYWORD"), SubLObjectFactory.makeKeyword("ASSERTION"), SubLObjectFactory.makeKeyword("CHARACTER"), Characters.CHAR_a, SubLObjectFactory.makeKeyword("STRING-VALIDATOR"), SubLObjectFactory.makeSymbol("NUMBER-STRING-P"), SubLObjectFactory.makeKeyword("STRING-TO-OBJECT-FN"), SubLObjectFactory.makeSymbol("ARGHASH-STRING-TO-ASSERTION"), SubLObjectFactory.makeKeyword("OBJECT-DETECTOR"), SubLObjectFactory.makeSymbol("ASSERTION-P"), SubLObjectFactory.makeKeyword("OBJECT-TO-STRING-FN"), SubLObjectFactory.makeSymbol("ARGHASH-ASSERTION-TO-STRING"), SubLObjectFactory.makeKeyword("PRIORITY"), html_arghash.TWO_INTEGER });
        $sym61$ASSERTION = SubLObjectFactory.makeSymbol("ASSERTION");
        $list62 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("NAME"), SubLObjectFactory.makeString("integer"), SubLObjectFactory.makeKeyword("KEYWORD"), SubLObjectFactory.makeKeyword("INTEGER"), SubLObjectFactory.makeKeyword("CHARACTER"), Characters.CHAR_period, SubLObjectFactory.makeKeyword("STRING-VALIDATOR"), SubLObjectFactory.makeSymbol("NUMBER-STRING-P"), SubLObjectFactory.makeKeyword("STRING-TO-OBJECT-FN"), SubLObjectFactory.makeSymbol("ARGHASH-STRING-TO-INTEGER"), SubLObjectFactory.makeKeyword("OBJECT-DETECTOR"), SubLObjectFactory.makeSymbol("INTEGERP"), SubLObjectFactory.makeKeyword("OBJECT-TO-STRING-FN"), SubLObjectFactory.makeSymbol("ARGHASH-INTEGER-TO-STRING"), SubLObjectFactory.makeKeyword("PRIORITY"), html_arghash.THREE_INTEGER });
        $sym63$INTEGER = SubLObjectFactory.makeSymbol("INTEGER");
        $list64 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("NAME"), SubLObjectFactory.makeString("boolean"), SubLObjectFactory.makeKeyword("KEYWORD"), SubLObjectFactory.makeKeyword("BOOLEAN"), SubLObjectFactory.makeKeyword("CHARACTER"), Characters.CHAR_question, SubLObjectFactory.makeKeyword("STRING-VALIDATOR"), html_arghash.NIL, SubLObjectFactory.makeKeyword("STRING-TO-OBJECT-FN"), SubLObjectFactory.makeSymbol("ARGHASH-BOOLEAN-STRING-TO-BOOLEAN"), SubLObjectFactory.makeKeyword("OBJECT-DETECTOR"), SubLObjectFactory.makeSymbol("ARGHASH-BOOLEAN-DETECTOR"), SubLObjectFactory.makeKeyword("OBJECT-TO-STRING-FN"), SubLObjectFactory.makeSymbol("ARGHASH-BOOLEAN-TO-BOOLEAN-STRING"), SubLObjectFactory.makeKeyword("PRIORITY"), html_arghash.FOUR_INTEGER });
        $sym65$BOOLEAN = SubLObjectFactory.makeSymbol("BOOLEAN");
        $str66$NIL = SubLObjectFactory.makeString("NIL");
        $str67$nil = SubLObjectFactory.makeString("nil");
        $str68$t = SubLObjectFactory.makeString("t");
        $list69 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("NAME"), SubLObjectFactory.makeString("list"), SubLObjectFactory.makeKeyword("KEYWORD"), SubLObjectFactory.makeKeyword("LIST"), SubLObjectFactory.makeKeyword("CHARACTER"), Characters.CHAR_lparen, SubLObjectFactory.makeKeyword("STRING-VALIDATOR"), html_arghash.NIL, SubLObjectFactory.makeKeyword("STRING-TO-OBJECT-FN"), SubLObjectFactory.makeSymbol("ARGHASH-STRING-TO-LIST"), SubLObjectFactory.makeKeyword("OBJECT-DETECTOR"), SubLObjectFactory.makeSymbol("CONSP"), SubLObjectFactory.makeKeyword("OBJECT-TO-STRING-FN"), SubLObjectFactory.makeSymbol("ARGHASH-LIST-TO-STRING"), SubLObjectFactory.makeKeyword("PRIORITY"), html_arghash.FIVE_INTEGER });
        $sym70$LIST = SubLObjectFactory.makeSymbol("LIST");
        $str71$_ = SubLObjectFactory.makeString(" ");
        $str72$_20 = SubLObjectFactory.makeString("%20");
        $str73$_ = SubLObjectFactory.makeString("+");
        $sym74$ARGHASH_PREFIXED_STRING_TO_OBJECT = SubLObjectFactory.makeSymbol("ARGHASH-PREFIXED-STRING-TO-OBJECT");
        $sym75$STRINGP = SubLObjectFactory.makeSymbol("STRINGP");
        $str76$_ = SubLObjectFactory.makeString("(");
        $str77$_ = SubLObjectFactory.makeString("_");
        $str78$_ = SubLObjectFactory.makeString(")");
        $sym79$CCONCATENATE = SubLObjectFactory.makeSymbol("CCONCATENATE");
        $list80 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("NAME"), SubLObjectFactory.makeString("el-formula"), SubLObjectFactory.makeKeyword("KEYWORD"), SubLObjectFactory.makeKeyword("EL-FORMULA"), SubLObjectFactory.makeKeyword("CHARACTER"), Characters.CHAR_lbrace, SubLObjectFactory.makeKeyword("STRING-VALIDATOR"), html_arghash.NIL, SubLObjectFactory.makeKeyword("STRING-TO-OBJECT-FN"), SubLObjectFactory.makeSymbol("ARGHASH-STRING-TO-EL-FORMULA"), SubLObjectFactory.makeKeyword("OBJECT-DETECTOR"), html_arghash.NIL, SubLObjectFactory.makeKeyword("OBJECT-TO-STRING-FN"), SubLObjectFactory.makeSymbol("ARGHASH-EL-FORMULA-TO-STRING"), SubLObjectFactory.makeKeyword("PRIORITY"), SubLObjectFactory.makeInteger(888) });
        $sym81$EL_FORMULA = SubLObjectFactory.makeSymbol("EL-FORMULA");
        $list82 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("NAME"), SubLObjectFactory.makeString("default"), SubLObjectFactory.makeKeyword("KEYWORD"), SubLObjectFactory.makeKeyword("DEFAULT"), SubLObjectFactory.makeKeyword("CHARACTER"), Characters.CHAR_underbar, SubLObjectFactory.makeKeyword("STRING-VALIDATOR"), SubLObjectFactory.makeSymbol("TRUE"), SubLObjectFactory.makeKeyword("STRING-TO-OBJECT-FN"), html_arghash.IDENTITY, SubLObjectFactory.makeKeyword("OBJECT-DETECTOR"), SubLObjectFactory.makeSymbol("TRUE"), SubLObjectFactory.makeKeyword("OBJECT-TO-STRING-FN"), SubLObjectFactory.makeSymbol("ARGHASH-DEFAULT-TO-STRING"), SubLObjectFactory.makeKeyword("PRIORITY"), SubLObjectFactory.makeInteger(999) });
        $sym83$DEFAULT = SubLObjectFactory.makeSymbol("DEFAULT");
        $kw84$DEFAULT = SubLObjectFactory.makeKeyword("DEFAULT");
        $str85$___A = SubLObjectFactory.makeString("--~A");
        $int86$32 = SubLObjectFactory.makeInteger(32);
        $kw87$JUST_FORT = SubLObjectFactory.makeKeyword("JUST-FORT");
        $kw88$JUST_STRING = SubLObjectFactory.makeKeyword("JUST-STRING");
        $str89$_ = SubLObjectFactory.makeString("&");
        $str90$_ = SubLObjectFactory.makeString("=");
        $list91 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ARGHASH"), (SubLObject)SubLObjectFactory.makeSymbol("HTML-HANDLER-NAME"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("NAME"), (SubLObject)SubLObjectFactory.makeSymbol("TARGET"), (SubLObject)SubLObjectFactory.makeSymbol("SCRIPT"), (SubLObject)SubLObjectFactory.makeSymbol("STYLE")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $list92 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NAME"), (SubLObject)SubLObjectFactory.makeKeyword("TARGET"), (SubLObject)SubLObjectFactory.makeKeyword("SCRIPT"), (SubLObject)SubLObjectFactory.makeKeyword("STYLE"));
        $kw93$ALLOW_OTHER_KEYS = SubLObjectFactory.makeKeyword("ALLOW-OTHER-KEYS");
        $kw94$TARGET = SubLObjectFactory.makeKeyword("TARGET");
        $kw95$SCRIPT = SubLObjectFactory.makeKeyword("SCRIPT");
        $kw96$STYLE = SubLObjectFactory.makeKeyword("STYLE");
        $sym97$HREF = SubLObjectFactory.makeUninternedSymbol("HREF");
        $sym98$FORMAT = SubLObjectFactory.makeSymbol("FORMAT");
        $str99$_A__A = SubLObjectFactory.makeString("~A?~A");
        $sym100$_CYC_CGI_PROGRAM_ = SubLObjectFactory.makeSymbol("*CYC-CGI-PROGRAM*");
        $sym101$HTML_ARGHASH_HREF = SubLObjectFactory.makeSymbol("HTML-ARGHASH-HREF");
        $sym102$HTML_FANCY_ANCHOR = SubLObjectFactory.makeSymbol("HTML-FANCY-ANCHOR");
        $kw103$HREF = SubLObjectFactory.makeKeyword("HREF");
        $list104 = ConsesLow.list((SubLObject)html_arghash.NIL);
        $list105 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("KEY"), (SubLObject)SubLObjectFactory.makeSymbol("VALUE-TYPE"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("MULTIPLE"), (SubLObject)SubLObjectFactory.makeSymbol("SIZE"), (SubLObject)SubLObjectFactory.makeSymbol("SCRIPT"), (SubLObject)SubLObjectFactory.makeSymbol("ONCHANGE")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $list106 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("MULTIPLE"), (SubLObject)SubLObjectFactory.makeKeyword("SIZE"), (SubLObject)SubLObjectFactory.makeKeyword("SCRIPT"), (SubLObject)SubLObjectFactory.makeKeyword("ONCHANGE"));
        $kw107$MULTIPLE = SubLObjectFactory.makeKeyword("MULTIPLE");
        $kw108$SIZE = SubLObjectFactory.makeKeyword("SIZE");
        $kw109$ONCHANGE = SubLObjectFactory.makeKeyword("ONCHANGE");
        $sym110$KEY_STRING = SubLObjectFactory.makeUninternedSymbol("KEY-STRING");
        $sym111$ARGHASH_MAKE_KEY_STRING = SubLObjectFactory.makeSymbol("ARGHASH-MAKE-KEY-STRING");
        $sym112$HTML_FANCY_SELECT = SubLObjectFactory.makeSymbol("HTML-FANCY-SELECT");
        $list113 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ARGHASH"), (SubLObject)SubLObjectFactory.makeSymbol("KEY"), (SubLObject)SubLObjectFactory.makeSymbol("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("VALUE-TYPE"), (SubLObject)SubLObjectFactory.makeKeyword("DEFAULT"))), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym114$VALUE_STRING = SubLObjectFactory.makeUninternedSymbol("VALUE-STRING");
        $sym115$SELECTED = SubLObjectFactory.makeUninternedSymbol("SELECTED");
        $sym116$MEMBER_EQUAL_ = SubLObjectFactory.makeSymbol("MEMBER-EQUAL?");
        $sym117$GET_ARGHASH_VALUE_LIST = SubLObjectFactory.makeSymbol("GET-ARGHASH-VALUE-LIST");
        $sym118$ARGHASH_GET_STRING = SubLObjectFactory.makeSymbol("ARGHASH-GET-STRING");
        $sym119$HTML_FANCY_OPTION = SubLObjectFactory.makeSymbol("HTML-FANCY-OPTION");
        $kw120$SELECTED = SubLObjectFactory.makeKeyword("SELECTED");
        $kw121$VALUE = SubLObjectFactory.makeKeyword("VALUE");
        $list122 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("ARGHASH"), SubLObjectFactory.makeSymbol("KEY"), SubLObjectFactory.makeSymbol("VALUE-TYPE"), SubLObjectFactory.makeSymbol("VALUES"), SubLObjectFactory.makeSymbol("VALUE-STRINGS"), SubLObjectFactory.makeSymbol("&KEY"), SubLObjectFactory.makeSymbol("MULTIPLE"), SubLObjectFactory.makeSymbol("SIZE"), SubLObjectFactory.makeSymbol("SCRIPT"), SubLObjectFactory.makeSymbol("ONCHANGE") });
        $sym123$VALUE = SubLObjectFactory.makeUninternedSymbol("VALUE");
        $sym124$VALUE_STRING = SubLObjectFactory.makeUninternedSymbol("VALUE-STRING");
        $sym125$HTML_ARGHASH_FANCY_SELECT = SubLObjectFactory.makeSymbol("HTML-ARGHASH-FANCY-SELECT");
        $sym126$CDOLIST_MULTIPLE = SubLObjectFactory.makeSymbol("CDOLIST-MULTIPLE");
        $sym127$HTML_ARGHASH_FANCY_OPTION = SubLObjectFactory.makeSymbol("HTML-ARGHASH-FANCY-OPTION");
        $sym128$HTML_PRINC = SubLObjectFactory.makeSymbol("HTML-PRINC");
        $kw129$BOOLEAN = SubLObjectFactory.makeKeyword("BOOLEAN");
        $str130$Complete = SubLObjectFactory.makeString("Complete");
        $str131$virtual = SubLObjectFactory.makeString("virtual");
        $kw132$NBSP = SubLObjectFactory.makeKeyword("NBSP");
        $kw133$FORT = SubLObjectFactory.makeKeyword("FORT");
        $str134$Cyclify = SubLObjectFactory.makeString("Cyclify");
        $str135$Clear = SubLObjectFactory.makeString("Clear");
        $kw136$EL_FORMULA = SubLObjectFactory.makeKeyword("EL-FORMULA");
        $kw137$INPUT_NAME = SubLObjectFactory.makeKeyword("INPUT-NAME");
        $kw138$COMPLETE_LABEL = SubLObjectFactory.makeKeyword("COMPLETE-LABEL");
        $kw139$CYCLIFY_LABEL = SubLObjectFactory.makeKeyword("CYCLIFY-LABEL");
        $kw140$CLEAR_LABEL = SubLObjectFactory.makeKeyword("CLEAR-LABEL");
        $kw141$HEIGHT = SubLObjectFactory.makeKeyword("HEIGHT");
        $kw142$WIDTH = SubLObjectFactory.makeKeyword("WIDTH");
        $sym143$GENERATE_PHRASE = SubLObjectFactory.makeSymbol("GENERATE-PHRASE");
        $str144$_NEW_FORT = SubLObjectFactory.makeString("_NEW_FORT");
        $str145$_STRING = SubLObjectFactory.makeString("_STRING");
        $str146$_NEW_STRING = SubLObjectFactory.makeString("_NEW_STRING");
        $str147$_UNDO = SubLObjectFactory.makeString("_UNDO");
        $str148$_CANDIDATES = SubLObjectFactory.makeString("_CANDIDATES");
        $str149$_DONE = SubLObjectFactory.makeString("_DONE");
        $str150$_ERROR = SubLObjectFactory.makeString("_ERROR");
        $str151$_2 = SubLObjectFactory.makeString("+2");
        $str152$_ = SubLObjectFactory.makeString("*");
        $str153$onChange_javascript_this_form_sub = SubLObjectFactory.makeString("onChange=javascript:this.form.submit();");
        $str154$___ = SubLObjectFactory.makeString("???");
        $str155$Undo = SubLObjectFactory.makeString("Undo");
        $str156$Submit = SubLObjectFactory.makeString("Submit");
        $kw157$SUBMIT = SubLObjectFactory.makeKeyword("SUBMIT");
        $kw158$STRING = SubLObjectFactory.makeKeyword("STRING");
        $str159$_nl_fort_input_force_default_if_u = SubLObjectFactory.makeString("(nl-fort-input-force-default-if-unset ");
        $str160$___setting_to_ = SubLObjectFactory.makeString("): setting to ");
        $sym161$TERMS_FOR_BROWSING = SubLObjectFactory.makeSymbol("TERMS-FOR-BROWSING");
        $str162$_nl_fort_input_validate_ = SubLObjectFactory.makeString("(nl-fort-input-validate ");
        $str163$___ = SubLObjectFactory.makeString("): ");
        $str164$Case_1__clicked_undo_button = SubLObjectFactory.makeString("Case 1: clicked undo button");
        $str165$Case_2__chose_fort_from_pulldown = SubLObjectFactory.makeString("Case 2: chose fort from pulldown");
        $str166$Case_3__text_typed_in__ = SubLObjectFactory.makeString("Case 3: text typed in, ");
        $sym167$RELEVANT_MT_IS_EVERYTHING = SubLObjectFactory.makeSymbol("RELEVANT-MT-IS-EVERYTHING");
        $const168$EverythingPSC = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("EverythingPSC"));
        $str169$Case_3a__No_parse_for___A_ = SubLObjectFactory.makeString("Case 3a: No parse for \"~A\"");
        $str170$_called__ = SubLObjectFactory.makeString(" called \"");
        $str171$__not_found_ = SubLObjectFactory.makeString("\" not found.");
        $str172$_ = SubLObjectFactory.makeString("\"");
        $str173$Case_3b__One_parse_for___A_____A = SubLObjectFactory.makeString("Case 3b: One parse for \"~A\" = ~A");
        $str174$Case_3c__Many_parses_for___A_____ = SubLObjectFactory.makeString("Case 3c: Many parses for \"~A\" = ~A");
        $str175$Case_4__no_text_typed_in = SubLObjectFactory.makeString("Case 4: no text typed in");
        $str176$Case_5__fort_set__so_use_fort_as_ = SubLObjectFactory.makeString("Case 5: fort set, so use fort as 'new-fort'");
        $str177$Case_6__fallthrough_ = SubLObjectFactory.makeString("Case 6: fallthrough!");
        $str178$_REMOVE = SubLObjectFactory.makeString("_REMOVE");
        $str179$Remove = SubLObjectFactory.makeString("Remove");
        $str180$_max_reached_ = SubLObjectFactory.makeString("(max reached)");
        $str181$_max_exceeded_ = SubLObjectFactory.makeString("(max exceeded)");
        $str182$_more_required_ = SubLObjectFactory.makeString(" more required)");
        $sym183$FORT_NAME = SubLObjectFactory.makeSymbol("FORT-NAME");
        $str184$_key_list_length_reached_ = SubLObjectFactory.makeString("(key list length reached)");
        $sym185$NON_NEGATIVE_INTEGER_P = SubLObjectFactory.makeSymbol("NON-NEGATIVE-INTEGER-P");
        $str186$X = SubLObjectFactory.makeString("X");
    }
    
    public static final class $arghash_type_native extends SubLStructNative
    {
        public SubLObject $name;
        public SubLObject $keyword;
        public SubLObject $character;
        public SubLObject $string_validator;
        public SubLObject $string_to_object_fn;
        public SubLObject $object_detector;
        public SubLObject $object_to_string_fn;
        public SubLObject $priority;
        private static final SubLStructDeclNative structDecl;
        
        public $arghash_type_native() {
            this.$name = (SubLObject)CommonSymbols.NIL;
            this.$keyword = (SubLObject)CommonSymbols.NIL;
            this.$character = (SubLObject)CommonSymbols.NIL;
            this.$string_validator = (SubLObject)CommonSymbols.NIL;
            this.$string_to_object_fn = (SubLObject)CommonSymbols.NIL;
            this.$object_detector = (SubLObject)CommonSymbols.NIL;
            this.$object_to_string_fn = (SubLObject)CommonSymbols.NIL;
            this.$priority = (SubLObject)CommonSymbols.NIL;
        }
        
        public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$arghash_type_native.structDecl;
        }
        
        public SubLObject getField2() {
            return this.$name;
        }
        
        public SubLObject getField3() {
            return this.$keyword;
        }
        
        public SubLObject getField4() {
            return this.$character;
        }
        
        public SubLObject getField5() {
            return this.$string_validator;
        }
        
        public SubLObject getField6() {
            return this.$string_to_object_fn;
        }
        
        public SubLObject getField7() {
            return this.$object_detector;
        }
        
        public SubLObject getField8() {
            return this.$object_to_string_fn;
        }
        
        public SubLObject getField9() {
            return this.$priority;
        }
        
        public SubLObject setField2(final SubLObject value) {
            return this.$name = value;
        }
        
        public SubLObject setField3(final SubLObject value) {
            return this.$keyword = value;
        }
        
        public SubLObject setField4(final SubLObject value) {
            return this.$character = value;
        }
        
        public SubLObject setField5(final SubLObject value) {
            return this.$string_validator = value;
        }
        
        public SubLObject setField6(final SubLObject value) {
            return this.$string_to_object_fn = value;
        }
        
        public SubLObject setField7(final SubLObject value) {
            return this.$object_detector = value;
        }
        
        public SubLObject setField8(final SubLObject value) {
            return this.$object_to_string_fn = value;
        }
        
        public SubLObject setField9(final SubLObject value) {
            return this.$priority = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$arghash_type_native.class, html_arghash.$sym1$ARGHASH_TYPE, html_arghash.$sym2$ARGHASH_TYPE_P, html_arghash.$list3, html_arghash.$list4, new String[] { "$name", "$keyword", "$character", "$string_validator", "$string_to_object_fn", "$object_detector", "$object_to_string_fn", "$priority" }, html_arghash.$list5, html_arghash.$list6, html_arghash.$sym7$PRINT_ARGHASH_TYPE);
        }
    }
    
    public static final class $arghash_type_p$UnaryFunction extends UnaryFunction
    {
        public $arghash_type_p$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("ARGHASH-TYPE-P"));
        }
        
        public SubLObject processItem(final SubLObject arg1) {
            return html_arghash.arghash_type_p(arg1);
        }
    }
}

/*

	Total time: 571 ms
	
*/