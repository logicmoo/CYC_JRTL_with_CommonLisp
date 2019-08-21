package com.cyc.cycjava.cycl;


import com.cyc.cycjava.cycl.rkf_ch_html_scanner;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.stream_macros;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;
import org.armedbear.lisp.Lisp;

import static com.cyc.cycjava.cycl.rkf_ch_html_scanner.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_less;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_newline;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_return;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_space;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_tab;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_tilde;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.EQUALP;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.FOUR_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.NIL;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.ONE_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.T;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.THREE_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.TWO_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.UNPROVIDED;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.ZERO_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.$print_object_method_table$;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.*;
import static com.cyc.tool.subl.util.SubLFiles.*;
import static com.cyc.tool.subl.util.SubLTranslatedFile.*;


import static com.cyc.cycjava.cycl.rkf_ch_html_scanner.*; 
 public final class rkf_ch_html_scanner extends SubLTranslatedFile {
    public static final SubLFile me = new rkf_ch_html_scanner();

    public static final String myName = "com.cyc.cycjava.cycl.rkf_ch_html_scanner";

    public static final String myFingerPrint = "df6e8cdcf6cfa03c42c7ee070e2de6a9481f5029d1ac71636cec1559f220d7bc";

    // defconstant
    public static final SubLSymbol $dtp_file_content$ = makeSymbol("*DTP-FILE-CONTENT*");

    // defconstant
    public static final SubLSymbol $dtp_file_paragraph$ = makeSymbol("*DTP-FILE-PARAGRAPH*");

    // defconstant
    public static final SubLSymbol $dtp_file_sentence$ = makeSymbol("*DTP-FILE-SENTENCE*");

    // Internal Constants
    public static final SubLSymbol FILE_CONTENT = makeSymbol("FILE-CONTENT");

    public static final SubLSymbol FILE_CONTENT_P = makeSymbol("FILE-CONTENT-P");

    public static final SubLList $list2 = list(makeSymbol("NAME"), makeSymbol("TEXT"));

    public static final SubLList $list3 = list(makeKeyword("NAME"), makeKeyword("TEXT"));

    public static final SubLList $list4 = list(makeSymbol("FILE-CONTENT-NAME"), makeSymbol("FILE-CONTENT-TEXT"));

    public static final SubLList $list5 = list(makeSymbol("_CSETF-FILE-CONTENT-NAME"), makeSymbol("_CSETF-FILE-CONTENT-TEXT"));



    public static final SubLSymbol FILE_CONTENT_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("FILE-CONTENT-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLList $list8 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("FILE-CONTENT-P"));

    private static final SubLSymbol FILE_CONTENT_NAME = makeSymbol("FILE-CONTENT-NAME");

    private static final SubLSymbol _CSETF_FILE_CONTENT_NAME = makeSymbol("_CSETF-FILE-CONTENT-NAME");

    private static final SubLSymbol FILE_CONTENT_TEXT = makeSymbol("FILE-CONTENT-TEXT");

    private static final SubLSymbol _CSETF_FILE_CONTENT_TEXT = makeSymbol("_CSETF-FILE-CONTENT-TEXT");





    private static final SubLString $str15$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");



    private static final SubLSymbol MAKE_FILE_CONTENT = makeSymbol("MAKE-FILE-CONTENT");





    private static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_FILE_CONTENT_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-FILE-CONTENT-METHOD");

    private static final SubLSymbol FILE_PARAGRAPH = makeSymbol("FILE-PARAGRAPH");

    private static final SubLSymbol FILE_PARAGRAPH_P = makeSymbol("FILE-PARAGRAPH-P");

    private static final SubLList $list23 = list(makeSymbol("FILE-CONTEXT"), makeSymbol("NUMBER"), makeSymbol("CLASS"), makeSymbol("SENTENCES"));

    private static final SubLList $list24 = list(makeKeyword("FILE-CONTEXT"), makeKeyword("NUMBER"), makeKeyword("CLASS"), makeKeyword("SENTENCES"));

    private static final SubLList $list25 = list(makeSymbol("FILE-PARAGRAPH-FILE-CONTEXT"), makeSymbol("FILE-PARAGRAPH-NUMBER"), makeSymbol("FILE-PARAGRAPH-CLASS"), makeSymbol("FILE-PARAGRAPH-SENTENCES"));

    private static final SubLList $list26 = list(makeSymbol("_CSETF-FILE-PARAGRAPH-FILE-CONTEXT"), makeSymbol("_CSETF-FILE-PARAGRAPH-NUMBER"), makeSymbol("_CSETF-FILE-PARAGRAPH-CLASS"), makeSymbol("_CSETF-FILE-PARAGRAPH-SENTENCES"));

    private static final SubLSymbol PRINT_FILE_PARAGRAPH = makeSymbol("PRINT-FILE-PARAGRAPH");

    private static final SubLSymbol FILE_PARAGRAPH_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("FILE-PARAGRAPH-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLList $list29 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("FILE-PARAGRAPH-P"));

    private static final SubLSymbol FILE_PARAGRAPH_FILE_CONTEXT = makeSymbol("FILE-PARAGRAPH-FILE-CONTEXT");

    private static final SubLSymbol _CSETF_FILE_PARAGRAPH_FILE_CONTEXT = makeSymbol("_CSETF-FILE-PARAGRAPH-FILE-CONTEXT");

    private static final SubLSymbol FILE_PARAGRAPH_NUMBER = makeSymbol("FILE-PARAGRAPH-NUMBER");

    private static final SubLSymbol _CSETF_FILE_PARAGRAPH_NUMBER = makeSymbol("_CSETF-FILE-PARAGRAPH-NUMBER");

    private static final SubLSymbol FILE_PARAGRAPH_CLASS = makeSymbol("FILE-PARAGRAPH-CLASS");

    private static final SubLSymbol _CSETF_FILE_PARAGRAPH_CLASS = makeSymbol("_CSETF-FILE-PARAGRAPH-CLASS");

    private static final SubLSymbol FILE_PARAGRAPH_SENTENCES = makeSymbol("FILE-PARAGRAPH-SENTENCES");

    private static final SubLSymbol _CSETF_FILE_PARAGRAPH_SENTENCES = makeSymbol("_CSETF-FILE-PARAGRAPH-SENTENCES");









    private static final SubLSymbol MAKE_FILE_PARAGRAPH = makeSymbol("MAKE-FILE-PARAGRAPH");

    private static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_FILE_PARAGRAPH_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-FILE-PARAGRAPH-METHOD");

    private static final SubLString $str44$__FileP__D_class__S__ = makeString("#<FileP ~D class ~S~%");

    private static final SubLString $$$_ = makeString(" ");

    private static final SubLString $str46$___FileP_ = makeString("~&:FileP>");

    private static final SubLSymbol FILE_SENTENCE = makeSymbol("FILE-SENTENCE");

    private static final SubLSymbol FILE_SENTENCE_P = makeSymbol("FILE-SENTENCE-P");

    private static final SubLList $list49 = list(makeSymbol("PARAGRAPH"), makeSymbol("NUMBER"), makeSymbol("TEXT"));

    private static final SubLList $list50 = list(makeKeyword("PARAGRAPH"), makeKeyword("NUMBER"), makeKeyword("TEXT"));

    private static final SubLList $list51 = list(makeSymbol("FILE-SENTENCE-PARAGRAPH"), makeSymbol("FILE-SENTENCE-NUMBER"), makeSymbol("FILE-SENTENCE-TEXT"));

    private static final SubLList $list52 = list(makeSymbol("_CSETF-FILE-SENTENCE-PARAGRAPH"), makeSymbol("_CSETF-FILE-SENTENCE-NUMBER"), makeSymbol("_CSETF-FILE-SENTENCE-TEXT"));

    private static final SubLSymbol PRINT_FILE_SENTENCE = makeSymbol("PRINT-FILE-SENTENCE");

    private static final SubLSymbol FILE_SENTENCE_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("FILE-SENTENCE-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLList $list55 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("FILE-SENTENCE-P"));

    private static final SubLSymbol FILE_SENTENCE_PARAGRAPH = makeSymbol("FILE-SENTENCE-PARAGRAPH");

    private static final SubLSymbol _CSETF_FILE_SENTENCE_PARAGRAPH = makeSymbol("_CSETF-FILE-SENTENCE-PARAGRAPH");

    private static final SubLSymbol FILE_SENTENCE_NUMBER = makeSymbol("FILE-SENTENCE-NUMBER");

    private static final SubLSymbol _CSETF_FILE_SENTENCE_NUMBER = makeSymbol("_CSETF-FILE-SENTENCE-NUMBER");

    private static final SubLSymbol FILE_SENTENCE_TEXT = makeSymbol("FILE-SENTENCE-TEXT");

    private static final SubLSymbol _CSETF_FILE_SENTENCE_TEXT = makeSymbol("_CSETF-FILE-SENTENCE-TEXT");



    private static final SubLSymbol MAKE_FILE_SENTENCE = makeSymbol("MAKE-FILE-SENTENCE");

    private static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_FILE_SENTENCE_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-FILE-SENTENCE-METHOD");

    private static final SubLString $str65$__Sent__D = makeString("#<Sent ~D");

    private static final SubLString $str66$of_P_D = makeString("of P~D");

    private static final SubLString $str67$___S__ = makeString(": ~S:>");



    private static final SubLString $str69$Unable_to_open__S = makeString("Unable to open ~S");

    private static final SubLString $$$anonymous = makeString("anonymous");

    private static final SubLSymbol $sym71$IS_RETURN_CHAR_ = makeSymbol("IS-RETURN-CHAR?");







    private static final SubLString $str75$_ = makeString("~");

    private static final SubLString $str76$_ = makeString(".");

    private static final SubLList $list77 = list(CHAR_tilde);

    private static final SubLList $list78 = list(CHAR_space, CHAR_tab, CHAR_newline, CHAR_return);

    public static SubLObject file_content_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        compatibility.default_struct_print_function(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject file_content_p(final SubLObject v_object) {
        return v_object.getClass() == $file_content_native.class ? T : NIL;
    }

    public static SubLObject file_content_name(final SubLObject v_object) {
        assert NIL != file_content_p(v_object) : "rkf_ch_html_scanner.file_content_p error :" + v_object;
        return v_object.getField2();
    }

    public static SubLObject file_content_text(final SubLObject v_object) {
        assert NIL != file_content_p(v_object) : "rkf_ch_html_scanner.file_content_p error :" + v_object;
        return v_object.getField3();
    }

    public static SubLObject _csetf_file_content_name(final SubLObject v_object, final SubLObject value) {
        assert NIL != file_content_p(v_object) : "rkf_ch_html_scanner.file_content_p error :" + v_object;
        return v_object.setField2(value);
    }

    public static SubLObject _csetf_file_content_text(final SubLObject v_object, final SubLObject value) {
        assert NIL != file_content_p(v_object) : "rkf_ch_html_scanner.file_content_p error :" + v_object;
        return v_object.setField3(value);
    }

    public static SubLObject make_file_content(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new $file_content_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
            current_arg = next.first();
            current_value = cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql($NAME)) {
                _csetf_file_content_name(v_new, current_value);
            } else
                if (pcase_var.eql($TEXT)) {
                    _csetf_file_content_text(v_new, current_value);
                } else {
                    Errors.error($str15$Invalid_slot__S_for_construction_, current_arg);
                }

        }
        return v_new;
    }

    public static SubLObject visit_defstruct_file_content(final SubLObject obj, final SubLObject visitor_fn) {
        funcall(visitor_fn, obj, $BEGIN, MAKE_FILE_CONTENT, TWO_INTEGER);
        funcall(visitor_fn, obj, $SLOT, $NAME, file_content_name(obj));
        funcall(visitor_fn, obj, $SLOT, $TEXT, file_content_text(obj));
        funcall(visitor_fn, obj, $END, MAKE_FILE_CONTENT, TWO_INTEGER);
        return obj;
    }

    public static SubLObject visit_defstruct_object_file_content_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_file_content(obj, visitor_fn);
    }

    public static SubLObject file_paragraph_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        print_file_paragraph(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject file_paragraph_p(final SubLObject v_object) {
        return v_object.getClass() == $file_paragraph_native.class ? T : NIL;
    }

    public static SubLObject file_paragraph_file_context(final SubLObject v_object) {
        assert NIL != file_paragraph_p(v_object) : "rkf_ch_html_scanner.file_paragraph_p error :" + v_object;
        return v_object.getField2();
    }

    public static SubLObject file_paragraph_number(final SubLObject v_object) {
        assert NIL != file_paragraph_p(v_object) : "rkf_ch_html_scanner.file_paragraph_p error :" + v_object;
        return v_object.getField3();
    }

    public static SubLObject file_paragraph_class(final SubLObject v_object) {
        assert NIL != file_paragraph_p(v_object) : "rkf_ch_html_scanner.file_paragraph_p error :" + v_object;
        return v_object.getField4();
    }

    public static SubLObject file_paragraph_sentences(final SubLObject v_object) {
        assert NIL != file_paragraph_p(v_object) : "rkf_ch_html_scanner.file_paragraph_p error :" + v_object;
        return v_object.getField5();
    }

    public static SubLObject _csetf_file_paragraph_file_context(final SubLObject v_object, final SubLObject value) {
        assert NIL != file_paragraph_p(v_object) : "rkf_ch_html_scanner.file_paragraph_p error :" + v_object;
        return v_object.setField2(value);
    }

    public static SubLObject _csetf_file_paragraph_number(final SubLObject v_object, final SubLObject value) {
        assert NIL != file_paragraph_p(v_object) : "rkf_ch_html_scanner.file_paragraph_p error :" + v_object;
        return v_object.setField3(value);
    }

    public static SubLObject _csetf_file_paragraph_class(final SubLObject v_object, final SubLObject value) {
        assert NIL != file_paragraph_p(v_object) : "rkf_ch_html_scanner.file_paragraph_p error :" + v_object;
        return v_object.setField4(value);
    }

    public static SubLObject _csetf_file_paragraph_sentences(final SubLObject v_object, final SubLObject value) {
        assert NIL != file_paragraph_p(v_object) : "rkf_ch_html_scanner.file_paragraph_p error :" + v_object;
        return v_object.setField5(value);
    }

    public static SubLObject make_file_paragraph(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new $file_paragraph_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
            current_arg = next.first();
            current_value = cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql($FILE_CONTEXT)) {
                _csetf_file_paragraph_file_context(v_new, current_value);
            } else
                if (pcase_var.eql($NUMBER)) {
                    _csetf_file_paragraph_number(v_new, current_value);
                } else
                    if (pcase_var.eql($CLASS)) {
                        _csetf_file_paragraph_class(v_new, current_value);
                    } else
                        if (pcase_var.eql($SENTENCES)) {
                            _csetf_file_paragraph_sentences(v_new, current_value);
                        } else {
                            Errors.error($str15$Invalid_slot__S_for_construction_, current_arg);
                        }



        }
        return v_new;
    }

    public static SubLObject visit_defstruct_file_paragraph(final SubLObject obj, final SubLObject visitor_fn) {
        funcall(visitor_fn, obj, $BEGIN, MAKE_FILE_PARAGRAPH, FOUR_INTEGER);
        funcall(visitor_fn, obj, $SLOT, $FILE_CONTEXT, file_paragraph_file_context(obj));
        funcall(visitor_fn, obj, $SLOT, $NUMBER, file_paragraph_number(obj));
        funcall(visitor_fn, obj, $SLOT, $CLASS, file_paragraph_class(obj));
        funcall(visitor_fn, obj, $SLOT, $SENTENCES, file_paragraph_sentences(obj));
        funcall(visitor_fn, obj, $END, MAKE_FILE_PARAGRAPH, FOUR_INTEGER);
        return obj;
    }

    public static SubLObject visit_defstruct_object_file_paragraph_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_file_paragraph(obj, visitor_fn);
    }

    public static SubLObject new_file_paragraph(final SubLObject file, final SubLObject number, SubLObject sentences, SubLObject v_class) {
        if (sentences == UNPROVIDED) {
            sentences = NIL;
        }
        if (v_class == UNPROVIDED) {
            v_class = html_macros.$html_paragraph_head$.getGlobalValue();
        }
        final SubLObject paragraph = make_file_paragraph(UNPROVIDED);
        _csetf_file_paragraph_file_context(paragraph, file);
        _csetf_file_paragraph_number(paragraph, number);
        _csetf_file_paragraph_class(paragraph, v_class);
        _csetf_file_paragraph_sentences(paragraph, sentences);
        return paragraph;
    }

    public static SubLObject print_file_paragraph(final SubLObject v_object, final SubLObject stream, final SubLObject depth) {
        format(stream, $str44$__FileP__D_class__S__, file_paragraph_number(v_object), file_paragraph_class(v_object));
        SubLObject cdolist_list_var = file_paragraph_sentences(v_object);
        SubLObject item = NIL;
        item = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            princ($$$_, stream);
            princ(item, stream);
            terpri(stream);
            cdolist_list_var = cdolist_list_var.rest();
            item = cdolist_list_var.first();
        } 
        format(stream, $str46$___FileP_);
        return v_object;
    }

    public static SubLObject file_sentence_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        print_file_sentence(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject file_sentence_p(final SubLObject v_object) {
        return v_object.getClass() == $file_sentence_native.class ? T : NIL;
    }

    public static SubLObject file_sentence_paragraph(final SubLObject v_object) {
        assert NIL != file_sentence_p(v_object) : "rkf_ch_html_scanner.file_sentence_p error :" + v_object;
        return v_object.getField2();
    }

    public static SubLObject file_sentence_number(final SubLObject v_object) {
        assert NIL != file_sentence_p(v_object) : "rkf_ch_html_scanner.file_sentence_p error :" + v_object;
        return v_object.getField3();
    }

    public static SubLObject file_sentence_text(final SubLObject v_object) {
        assert NIL != file_sentence_p(v_object) : "rkf_ch_html_scanner.file_sentence_p error :" + v_object;
        return v_object.getField4();
    }

    public static SubLObject _csetf_file_sentence_paragraph(final SubLObject v_object, final SubLObject value) {
        assert NIL != file_sentence_p(v_object) : "rkf_ch_html_scanner.file_sentence_p error :" + v_object;
        return v_object.setField2(value);
    }

    public static SubLObject _csetf_file_sentence_number(final SubLObject v_object, final SubLObject value) {
        assert NIL != file_sentence_p(v_object) : "rkf_ch_html_scanner.file_sentence_p error :" + v_object;
        return v_object.setField3(value);
    }

    public static SubLObject _csetf_file_sentence_text(final SubLObject v_object, final SubLObject value) {
        assert NIL != file_sentence_p(v_object) : "rkf_ch_html_scanner.file_sentence_p error :" + v_object;
        return v_object.setField4(value);
    }

    public static SubLObject make_file_sentence(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new $file_sentence_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
            current_arg = next.first();
            current_value = cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql($PARAGRAPH)) {
                _csetf_file_sentence_paragraph(v_new, current_value);
            } else
                if (pcase_var.eql($NUMBER)) {
                    _csetf_file_sentence_number(v_new, current_value);
                } else
                    if (pcase_var.eql($TEXT)) {
                        _csetf_file_sentence_text(v_new, current_value);
                    } else {
                        Errors.error($str15$Invalid_slot__S_for_construction_, current_arg);
                    }


        }
        return v_new;
    }

    public static SubLObject visit_defstruct_file_sentence(final SubLObject obj, final SubLObject visitor_fn) {
        funcall(visitor_fn, obj, $BEGIN, MAKE_FILE_SENTENCE, THREE_INTEGER);
        funcall(visitor_fn, obj, $SLOT, $PARAGRAPH, file_sentence_paragraph(obj));
        funcall(visitor_fn, obj, $SLOT, $NUMBER, file_sentence_number(obj));
        funcall(visitor_fn, obj, $SLOT, $TEXT, file_sentence_text(obj));
        funcall(visitor_fn, obj, $END, MAKE_FILE_SENTENCE, THREE_INTEGER);
        return obj;
    }

    public static SubLObject visit_defstruct_object_file_sentence_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_file_sentence(obj, visitor_fn);
    }

    public static SubLObject new_file_sentence(final SubLObject paragraph, final SubLObject number, SubLObject text) {
        if (text == UNPROVIDED) {
            text = NIL;
        }
        final SubLObject sentence = make_file_sentence(UNPROVIDED);
        _csetf_file_sentence_paragraph(sentence, paragraph);
        _csetf_file_sentence_number(sentence, number);
        _csetf_file_sentence_text(sentence, text);
        return sentence;
    }

    public static SubLObject print_file_sentence(final SubLObject v_object, final SubLObject stream, final SubLObject depth) {
        format(stream, $str65$__Sent__D, file_sentence_number(v_object));
        final SubLObject paragraph = file_sentence_paragraph(v_object);
        if (NIL != file_paragraph_p(paragraph)) {
            format(stream, $str66$of_P_D, file_paragraph_number(paragraph));
        }
        format(stream, $str67$___S__, file_sentence_text(v_object));
        return v_object;
    }

    public static SubLObject rkfutil_process_html_file(final SubLObject filename) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject content = NIL;
        SubLObject paragraphs = NIL;
        SubLObject all_sentences = NIL;
        SubLObject stream = NIL;
        try {
            final SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding(thread);
            try {
                stream_macros.$stream_requires_locking$.bind(NIL, thread);
                stream = compatibility.open_text(filename, $INPUT);
            } finally {
                stream_macros.$stream_requires_locking$.rebind(_prev_bind_0, thread);
            }
            if (!stream.isStream()) {
                Errors.error($str69$Unable_to_open__S, filename);
            }
            final SubLObject s = stream;
            content = rkfutil_fetch_html_file(s, filename);
        } finally {
            final SubLObject _prev_bind_2 = $is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                $is_thread_performing_cleanupP$.bind(T, thread);
                final SubLObject _values = getValuesAsVector();
                if (stream.isStream()) {
                    close(stream, UNPROVIDED);
                }
                restoreValuesFromVector(_values);
            } finally {
                $is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
            }
        }
        SubLObject cdolist_list_var;
        paragraphs = cdolist_list_var = rkfutil_fetch_html_paragraphs(content);
        SubLObject paragraph = NIL;
        paragraph = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject sentences = rkfutil_fetch_html_sentences(paragraph);
            if (NIL != sentences) {
                all_sentences = cons(sentences, all_sentences);
            }
            cdolist_list_var = cdolist_list_var.rest();
            paragraph = cdolist_list_var.first();
        } 
        return nreverse(all_sentences);
    }

    public static SubLObject is_return_charP(final SubLObject string) {
        return char_equal(CHAR_return, aref(string, ZERO_INTEGER));
    }

    public static SubLObject rkfutil_fetch_html_file(final SubLObject stream, SubLObject filename) {
        if (filename == UNPROVIDED) {
            filename = $$$anonymous;
        }
        final SubLObject file = make_file_content(UNPROVIDED);
        SubLObject content = NIL;
        _csetf_file_content_name(file, filename);
        content = xml_parsing_utilities.xml_tokenize(stream, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        content = delete_if($sym71$IS_RETURN_CHAR_, content, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        _csetf_file_content_text(file, content);
        return file;
    }

    public static SubLObject rkfutil_fetch_html_paragraphs(final SubLObject file) {
        SubLObject counter = ZERO_INTEGER;
        SubLObject paragraph = new_file_paragraph(file, counter, UNPROVIDED, UNPROVIDED);
        SubLObject paragraphs = cons(paragraph, NIL);
        SubLObject tokens = file_content_text(file);
        counter = add(counter, ONE_INTEGER);
        SubLObject items;
        for (tokens = scan_title_text(paragraph, tokens), tokens = scan_past_first_token(html_macros.$html_paragraph_head$.getGlobalValue(), tokens); NIL != tokens; tokens = scan_past_first_token(html_macros.$html_paragraph_head$.getGlobalValue(), tokens)) {
            items = NIL;
            while ((NIL != tokens) && (!tokens.first().equalp(html_macros.$html_paragraph_tail$.getGlobalValue()))) {
                items = cons(tokens.first(), items);
                tokens = tokens.rest();
            } 
            paragraph = new_file_paragraph(file, counter, nreverse(items), UNPROVIDED);
            paragraphs = cons(paragraph, paragraphs);
            counter = add(counter, ONE_INTEGER);
        }
        return nreverse(paragraphs);
    }

    public static SubLObject scan_title_text(final SubLObject paragraph, final SubLObject tokens) {
        SubLObject spot = scan_past_first_token(html_macros.$html_title_head$.getGlobalValue(), tokens);
        final SubLObject title_text = NIL;
        _csetf_file_paragraph_class(paragraph, html_macros.$html_title_head$.getGlobalValue());
        if (NIL == spot) {
            spot = tokens;
        } else {
            SubLObject title_text_$1 = NIL;
            while ((NIL != spot) && (!spot.first().equalp(html_macros.$html_title_tail$.getGlobalValue()))) {
                title_text_$1 = cons(spot.first(), title_text_$1);
                spot = spot.rest();
            } 
            title_text_$1 = nreverse(title_text_$1);
        }
        _csetf_file_paragraph_sentences(paragraph, title_text);
        return spot;
    }

    public static SubLObject rkfutil_fetch_html_sentences(final SubLObject paragraph) {
        SubLObject good_pieces = NIL;
        if (file_paragraph_class(paragraph).equalp(html_macros.$html_paragraph_head$.getGlobalValue())) {
            SubLObject cdolist_list_var = file_paragraph_sentences(paragraph);
            SubLObject piece = NIL;
            piece = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if (NIL == char_equal(CHAR_less, aref(piece, ZERO_INTEGER))) {
                    good_pieces = cons(piece, good_pieces);
                }
                cdolist_list_var = cdolist_list_var.rest();
                piece = cdolist_list_var.first();
            } 
            if (NIL != good_pieces) {
                return convert_good_pieces(paragraph, good_pieces);
            }
        }
        return NIL;
    }

    public static SubLObject convert_good_pieces(final SubLObject paragraph, final SubLObject good_pieces) {
        SubLObject text = apply(symbol_function(CCONCATENATE), nreverse(good_pieces));
        text = cleanse_text(text);
        return decompose_paragraph_into_sentences(paragraph, text);
    }

    public static SubLObject cleanse_text(final SubLObject text) {
        return nsubstitute(CHAR_space, CHAR_newline, delete(CHAR_return, text, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject decompose_paragraph_into_sentences(final SubLObject paragraph, final SubLObject text) {
        SubLObject counter = ONE_INTEGER;
        SubLObject state = $IN_SENTENCE;
        SubLObject start = ZERO_INTEGER;
        SubLObject end = NIL;
        SubLObject curr = NIL;
        SubLObject sentences = NIL;
        SubLObject cdotimes_end_var;
        SubLObject index;
        SubLObject pcase_var;
        SubLObject part;
        for (cdotimes_end_var = length(text), index = NIL, index = ZERO_INTEGER; index.numL(cdotimes_end_var); index = add(index, ONE_INTEGER)) {
            curr = aref(text, index);
            pcase_var = state;
            if (pcase_var.eql($IN_SENTENCE)) {
                if (NIL != is_a_terminatorP(curr)) {
                    end = add(index, ONE_INTEGER);
                    state = $POTENTIAL_END;
                }
            } else
                if (pcase_var.eql($POTENTIAL_END) && (NIL == is_a_spaceP(curr))) {
                    if (NIL != upper_case_p(curr)) {
                        part = subseq(text, start, end);
                        part = string_utilities.replace_substring(part, $str75$_, $str76$_);
                        sentences = cons(new_file_sentence(paragraph, counter, part), sentences);
                        counter = add(counter, ONE_INTEGER);
                        start = index;
                    }
                    state = $IN_SENTENCE;
                }

        }
        if (state == $POTENTIAL_END) {
            SubLObject part2 = subseq(text, start, end);
            part2 = string_utilities.replace_substring(part2, $str75$_, $str76$_);
            sentences = cons(new_file_sentence(paragraph, counter, part2), sentences);
        }
        return nreverse(sentences);
    }

    public static SubLObject is_a_terminatorP(final SubLObject v_char) {
        return member(v_char, $list77, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject is_a_spaceP(final SubLObject v_char) {
        return member(v_char, $list78, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject scan_past_first_token(final SubLObject token, final SubLObject tokens) {
        final SubLObject scan_result = scan_to_first_token(token, tokens);
        return scan_result.rest();
    }

    public static SubLObject scan_to_first_token(final SubLObject token, SubLObject tokens) {
        while (!tokens.first().equalp(token)) {
            if (NIL == tokens) {
                return NIL;
            }
            tokens = tokens.rest();
        } 
        return tokens;
    }

    public static SubLObject scan_past_first_token_starting(final SubLObject header, final SubLObject tokens) {
        final SubLObject scan_result = scan_to_first_token_starting(header, tokens);
        return scan_result.rest();
    }

    public static SubLObject scan_to_first_token_starting(final SubLObject header, SubLObject tokens) {
        SubLObject position;
        for (position = NIL, position = search(header, tokens.first(), symbol_function(EQUALP), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED); (!position.isNumber()) || (!position.isZero()); position = search(header, tokens.first(), symbol_function(EQUALP), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
            if (NIL == tokens) {
                return NIL;
            }
            tokens = tokens.rest();
        }
        return tokens;
    }

    public static SubLObject rkf_sententialize_paragraph(final SubLObject paragraph) {
        final SubLObject text = cleanse_text(paragraph);
        final SubLObject sentences = decompose_paragraph_into_sentences(NIL, text);
        SubLObject result = NIL;
        SubLObject cdolist_list_var = sentences;
        SubLObject item = NIL;
        item = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            result = cons(file_sentence_text(item), result);
            cdolist_list_var = cdolist_list_var.rest();
            item = cdolist_list_var.first();
        } 
        return nreverse(result);
    }

    public static SubLObject rkf_sententialize_file(final SubLObject filename) {
        final SubLObject sentences = rkfutil_process_html_file(filename);
        SubLObject result = NIL;
        SubLObject cdolist_list_var = sentences;
        SubLObject paragraph = NIL;
        paragraph = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject cdolist_list_var_$2 = paragraph;
            SubLObject sentence = NIL;
            sentence = cdolist_list_var_$2.first();
            while (NIL != cdolist_list_var_$2) {
                result = cons(file_sentence_text(sentence), result);
                cdolist_list_var_$2 = cdolist_list_var_$2.rest();
                sentence = cdolist_list_var_$2.first();
            } 
            cdolist_list_var = cdolist_list_var.rest();
            paragraph = cdolist_list_var.first();
        } 
        return nreverse(result);
    }

    public static SubLObject declare_rkf_ch_html_scanner_file() {
        declareFunction(me, "file_content_print_function_trampoline", "FILE-CONTENT-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction(me, "file_content_p", "FILE-CONTENT-P", 1, 0, false);
        new rkf_ch_html_scanner.$file_content_p$UnaryFunction();
        declareFunction(me, "file_content_name", "FILE-CONTENT-NAME", 1, 0, false);
        declareFunction(me, "file_content_text", "FILE-CONTENT-TEXT", 1, 0, false);
        declareFunction(me, "_csetf_file_content_name", "_CSETF-FILE-CONTENT-NAME", 2, 0, false);
        declareFunction(me, "_csetf_file_content_text", "_CSETF-FILE-CONTENT-TEXT", 2, 0, false);
        declareFunction(me, "make_file_content", "MAKE-FILE-CONTENT", 0, 1, false);
        declareFunction(me, "visit_defstruct_file_content", "VISIT-DEFSTRUCT-FILE-CONTENT", 2, 0, false);
        declareFunction(me, "visit_defstruct_object_file_content_method", "VISIT-DEFSTRUCT-OBJECT-FILE-CONTENT-METHOD", 2, 0, false);
        declareFunction(me, "file_paragraph_print_function_trampoline", "FILE-PARAGRAPH-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction(me, "file_paragraph_p", "FILE-PARAGRAPH-P", 1, 0, false);
        new rkf_ch_html_scanner.$file_paragraph_p$UnaryFunction();
        declareFunction(me, "file_paragraph_file_context", "FILE-PARAGRAPH-FILE-CONTEXT", 1, 0, false);
        declareFunction(me, "file_paragraph_number", "FILE-PARAGRAPH-NUMBER", 1, 0, false);
        declareFunction(me, "file_paragraph_class", "FILE-PARAGRAPH-CLASS", 1, 0, false);
        declareFunction(me, "file_paragraph_sentences", "FILE-PARAGRAPH-SENTENCES", 1, 0, false);
        declareFunction(me, "_csetf_file_paragraph_file_context", "_CSETF-FILE-PARAGRAPH-FILE-CONTEXT", 2, 0, false);
        declareFunction(me, "_csetf_file_paragraph_number", "_CSETF-FILE-PARAGRAPH-NUMBER", 2, 0, false);
        declareFunction(me, "_csetf_file_paragraph_class", "_CSETF-FILE-PARAGRAPH-CLASS", 2, 0, false);
        declareFunction(me, "_csetf_file_paragraph_sentences", "_CSETF-FILE-PARAGRAPH-SENTENCES", 2, 0, false);
        declareFunction(me, "make_file_paragraph", "MAKE-FILE-PARAGRAPH", 0, 1, false);
        declareFunction(me, "visit_defstruct_file_paragraph", "VISIT-DEFSTRUCT-FILE-PARAGRAPH", 2, 0, false);
        declareFunction(me, "visit_defstruct_object_file_paragraph_method", "VISIT-DEFSTRUCT-OBJECT-FILE-PARAGRAPH-METHOD", 2, 0, false);
        declareFunction(me, "new_file_paragraph", "NEW-FILE-PARAGRAPH", 2, 2, false);
        declareFunction(me, "print_file_paragraph", "PRINT-FILE-PARAGRAPH", 3, 0, false);
        declareFunction(me, "file_sentence_print_function_trampoline", "FILE-SENTENCE-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction(me, "file_sentence_p", "FILE-SENTENCE-P", 1, 0, false);
        new rkf_ch_html_scanner.$file_sentence_p$UnaryFunction();
        declareFunction(me, "file_sentence_paragraph", "FILE-SENTENCE-PARAGRAPH", 1, 0, false);
        declareFunction(me, "file_sentence_number", "FILE-SENTENCE-NUMBER", 1, 0, false);
        declareFunction(me, "file_sentence_text", "FILE-SENTENCE-TEXT", 1, 0, false);
        declareFunction(me, "_csetf_file_sentence_paragraph", "_CSETF-FILE-SENTENCE-PARAGRAPH", 2, 0, false);
        declareFunction(me, "_csetf_file_sentence_number", "_CSETF-FILE-SENTENCE-NUMBER", 2, 0, false);
        declareFunction(me, "_csetf_file_sentence_text", "_CSETF-FILE-SENTENCE-TEXT", 2, 0, false);
        declareFunction(me, "make_file_sentence", "MAKE-FILE-SENTENCE", 0, 1, false);
        declareFunction(me, "visit_defstruct_file_sentence", "VISIT-DEFSTRUCT-FILE-SENTENCE", 2, 0, false);
        declareFunction(me, "visit_defstruct_object_file_sentence_method", "VISIT-DEFSTRUCT-OBJECT-FILE-SENTENCE-METHOD", 2, 0, false);
        declareFunction(me, "new_file_sentence", "NEW-FILE-SENTENCE", 2, 1, false);
        declareFunction(me, "print_file_sentence", "PRINT-FILE-SENTENCE", 3, 0, false);
        declareFunction(me, "rkfutil_process_html_file", "RKFUTIL-PROCESS-HTML-FILE", 1, 0, false);
        declareFunction(me, "is_return_charP", "IS-RETURN-CHAR?", 1, 0, false);
        declareFunction(me, "rkfutil_fetch_html_file", "RKFUTIL-FETCH-HTML-FILE", 1, 1, false);
        declareFunction(me, "rkfutil_fetch_html_paragraphs", "RKFUTIL-FETCH-HTML-PARAGRAPHS", 1, 0, false);
        declareFunction(me, "scan_title_text", "SCAN-TITLE-TEXT", 2, 0, false);
        declareFunction(me, "rkfutil_fetch_html_sentences", "RKFUTIL-FETCH-HTML-SENTENCES", 1, 0, false);
        declareFunction(me, "convert_good_pieces", "CONVERT-GOOD-PIECES", 2, 0, false);
        declareFunction(me, "cleanse_text", "CLEANSE-TEXT", 1, 0, false);
        declareFunction(me, "decompose_paragraph_into_sentences", "DECOMPOSE-PARAGRAPH-INTO-SENTENCES", 2, 0, false);
        declareFunction(me, "is_a_terminatorP", "IS-A-TERMINATOR?", 1, 0, false);
        declareFunction(me, "is_a_spaceP", "IS-A-SPACE?", 1, 0, false);
        declareFunction(me, "scan_past_first_token", "SCAN-PAST-FIRST-TOKEN", 2, 0, false);
        declareFunction(me, "scan_to_first_token", "SCAN-TO-FIRST-TOKEN", 2, 0, false);
        declareFunction(me, "scan_past_first_token_starting", "SCAN-PAST-FIRST-TOKEN-STARTING", 2, 0, false);
        declareFunction(me, "scan_to_first_token_starting", "SCAN-TO-FIRST-TOKEN-STARTING", 2, 0, false);
        declareFunction(me, "rkf_sententialize_paragraph", "RKF-SENTENTIALIZE-PARAGRAPH", 1, 0, false);
        declareFunction(me, "rkf_sententialize_file", "RKF-SENTENTIALIZE-FILE", 1, 0, false);
        return NIL;
    }

    public static SubLObject init_rkf_ch_html_scanner_file() {
        defconstant("*DTP-FILE-CONTENT*", FILE_CONTENT);
        defconstant("*DTP-FILE-PARAGRAPH*", FILE_PARAGRAPH);
        defconstant("*DTP-FILE-SENTENCE*", FILE_SENTENCE);
        return NIL;
    }

    public static SubLObject setup_rkf_ch_html_scanner_file() {
        register_method($print_object_method_table$.getGlobalValue(), $dtp_file_content$.getGlobalValue(), symbol_function(FILE_CONTENT_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim($list8);
        def_csetf(FILE_CONTENT_NAME, _CSETF_FILE_CONTENT_NAME);
        def_csetf(FILE_CONTENT_TEXT, _CSETF_FILE_CONTENT_TEXT);
        identity(FILE_CONTENT);
        register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_file_content$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_FILE_CONTENT_METHOD));
        register_method($print_object_method_table$.getGlobalValue(), $dtp_file_paragraph$.getGlobalValue(), symbol_function(FILE_PARAGRAPH_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim($list29);
        def_csetf(FILE_PARAGRAPH_FILE_CONTEXT, _CSETF_FILE_PARAGRAPH_FILE_CONTEXT);
        def_csetf(FILE_PARAGRAPH_NUMBER, _CSETF_FILE_PARAGRAPH_NUMBER);
        def_csetf(FILE_PARAGRAPH_CLASS, _CSETF_FILE_PARAGRAPH_CLASS);
        def_csetf(FILE_PARAGRAPH_SENTENCES, _CSETF_FILE_PARAGRAPH_SENTENCES);
        identity(FILE_PARAGRAPH);
        register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_file_paragraph$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_FILE_PARAGRAPH_METHOD));
        register_method($print_object_method_table$.getGlobalValue(), $dtp_file_sentence$.getGlobalValue(), symbol_function(FILE_SENTENCE_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim($list55);
        def_csetf(FILE_SENTENCE_PARAGRAPH, _CSETF_FILE_SENTENCE_PARAGRAPH);
        def_csetf(FILE_SENTENCE_NUMBER, _CSETF_FILE_SENTENCE_NUMBER);
        def_csetf(FILE_SENTENCE_TEXT, _CSETF_FILE_SENTENCE_TEXT);
        identity(FILE_SENTENCE);
        register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_file_sentence$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_FILE_SENTENCE_METHOD));
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_rkf_ch_html_scanner_file();
    }

    @Override
    public void initializeVariables() {
        init_rkf_ch_html_scanner_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_rkf_ch_html_scanner_file();
    }

    static {



















































































    }

    public static final class $file_content_native extends SubLStructNative {
        public SubLObject $name;

        public SubLObject $text;

        private static final SubLStructDeclNative structDecl;

        private $file_content_native() {
            this.$name = Lisp.NIL;
            this.$text = Lisp.NIL;
        }

        @Override
        public SubLStructDecl getStructDecl() {
            return structDecl;
        }

        @Override
        public SubLObject getField2() {
            return this.$name;
        }

        @Override
        public SubLObject getField3() {
            return this.$text;
        }

        @Override
        public SubLObject setField2(final SubLObject value) {
            return this.$name = value;
        }

        @Override
        public SubLObject setField3(final SubLObject value) {
            return this.$text = value;
        }

        static {
            structDecl = makeStructDeclNative($file_content_native.class, FILE_CONTENT, FILE_CONTENT_P, $list2, $list3, new String[]{ "$name", "$text" }, $list4, $list5, DEFAULT_STRUCT_PRINT_FUNCTION);
        }
    }

    public static final class $file_content_p$UnaryFunction extends UnaryFunction {
        public $file_content_p$UnaryFunction() {
            super(extractFunctionNamed("FILE-CONTENT-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return file_content_p(arg1);
        }
    }

    public static final class $file_paragraph_native extends SubLStructNative {
        public SubLObject $file_context;

        public SubLObject $number;

        public SubLObject $class;

        public SubLObject $sentences;

        private static final SubLStructDeclNative structDecl;

        private $file_paragraph_native() {
            this.$file_context = Lisp.NIL;
            this.$number = Lisp.NIL;
            this.$class = Lisp.NIL;
            this.$sentences = Lisp.NIL;
        }

        @Override
        public SubLStructDecl getStructDecl() {
            return structDecl;
        }

        @Override
        public SubLObject getField2() {
            return this.$file_context;
        }

        @Override
        public SubLObject getField3() {
            return this.$number;
        }

        @Override
        public SubLObject getField4() {
            return this.$class;
        }

        @Override
        public SubLObject getField5() {
            return this.$sentences;
        }

        @Override
        public SubLObject setField2(final SubLObject value) {
            return this.$file_context = value;
        }

        @Override
        public SubLObject setField3(final SubLObject value) {
            return this.$number = value;
        }

        @Override
        public SubLObject setField4(final SubLObject value) {
            return this.$class = value;
        }

        @Override
        public SubLObject setField5(final SubLObject value) {
            return this.$sentences = value;
        }

        static {
            structDecl = makeStructDeclNative($file_paragraph_native.class, FILE_PARAGRAPH, FILE_PARAGRAPH_P, $list23, $list24, new String[]{ "$file_context", "$number", "$class", "$sentences" }, $list25, $list26, PRINT_FILE_PARAGRAPH);
        }
    }

    public static final class $file_paragraph_p$UnaryFunction extends UnaryFunction {
        public $file_paragraph_p$UnaryFunction() {
            super(extractFunctionNamed("FILE-PARAGRAPH-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return file_paragraph_p(arg1);
        }
    }

    public static final class $file_sentence_native extends SubLStructNative {
        public SubLObject $paragraph;

        public SubLObject $number;

        public SubLObject $text;

        private static final SubLStructDeclNative structDecl;

        private $file_sentence_native() {
            this.$paragraph = Lisp.NIL;
            this.$number = Lisp.NIL;
            this.$text = Lisp.NIL;
        }

        @Override
        public SubLStructDecl getStructDecl() {
            return structDecl;
        }

        @Override
        public SubLObject getField2() {
            return this.$paragraph;
        }

        @Override
        public SubLObject getField3() {
            return this.$number;
        }

        @Override
        public SubLObject getField4() {
            return this.$text;
        }

        @Override
        public SubLObject setField2(final SubLObject value) {
            return this.$paragraph = value;
        }

        @Override
        public SubLObject setField3(final SubLObject value) {
            return this.$number = value;
        }

        @Override
        public SubLObject setField4(final SubLObject value) {
            return this.$text = value;
        }

        static {
            structDecl = makeStructDeclNative($file_sentence_native.class, FILE_SENTENCE, FILE_SENTENCE_P, $list49, $list50, new String[]{ "$paragraph", "$number", "$text" }, $list51, $list52, PRINT_FILE_SENTENCE);
        }
    }

    public static final class $file_sentence_p$UnaryFunction extends UnaryFunction {
        public $file_sentence_p$UnaryFunction() {
            super(extractFunctionNamed("FILE-SENTENCE-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return file_sentence_p(arg1);
        }
    }
}

/**
 * Total time: 215 ms
 */
