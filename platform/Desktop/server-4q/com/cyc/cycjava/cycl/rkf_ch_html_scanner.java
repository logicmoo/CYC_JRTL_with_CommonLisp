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
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.stream_macros;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class rkf_ch_html_scanner extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.rkf_ch_html_scanner";
    public static final String myFingerPrint = "df6e8cdcf6cfa03c42c7ee070e2de6a9481f5029d1ac71636cec1559f220d7bc";
    @SubLTranslatedFile.SubL(source = "cycl/rkf-ch-html-scanner.lisp", position = 1032L)
    public static SubLSymbol $dtp_file_content$;
    @SubLTranslatedFile.SubL(source = "cycl/rkf-ch-html-scanner.lisp", position = 1189L)
    public static SubLSymbol $dtp_file_paragraph$;
    @SubLTranslatedFile.SubL(source = "cycl/rkf-ch-html-scanner.lisp", position = 2315L)
    public static SubLSymbol $dtp_file_sentence$;
    private static final SubLSymbol $sym0$FILE_CONTENT;
    private static final SubLSymbol $sym1$FILE_CONTENT_P;
    private static final SubLList $list2;
    private static final SubLList $list3;
    private static final SubLList $list4;
    private static final SubLList $list5;
    private static final SubLSymbol $sym6$DEFAULT_STRUCT_PRINT_FUNCTION;
    private static final SubLSymbol $sym7$FILE_CONTENT_PRINT_FUNCTION_TRAMPOLINE;
    private static final SubLList $list8;
    private static final SubLSymbol $sym9$FILE_CONTENT_NAME;
    private static final SubLSymbol $sym10$_CSETF_FILE_CONTENT_NAME;
    private static final SubLSymbol $sym11$FILE_CONTENT_TEXT;
    private static final SubLSymbol $sym12$_CSETF_FILE_CONTENT_TEXT;
    private static final SubLSymbol $kw13$NAME;
    private static final SubLSymbol $kw14$TEXT;
    private static final SubLString $str15$Invalid_slot__S_for_construction_;
    private static final SubLSymbol $kw16$BEGIN;
    private static final SubLSymbol $sym17$MAKE_FILE_CONTENT;
    private static final SubLSymbol $kw18$SLOT;
    private static final SubLSymbol $kw19$END;
    private static final SubLSymbol $sym20$VISIT_DEFSTRUCT_OBJECT_FILE_CONTENT_METHOD;
    private static final SubLSymbol $sym21$FILE_PARAGRAPH;
    private static final SubLSymbol $sym22$FILE_PARAGRAPH_P;
    private static final SubLList $list23;
    private static final SubLList $list24;
    private static final SubLList $list25;
    private static final SubLList $list26;
    private static final SubLSymbol $sym27$PRINT_FILE_PARAGRAPH;
    private static final SubLSymbol $sym28$FILE_PARAGRAPH_PRINT_FUNCTION_TRAMPOLINE;
    private static final SubLList $list29;
    private static final SubLSymbol $sym30$FILE_PARAGRAPH_FILE_CONTEXT;
    private static final SubLSymbol $sym31$_CSETF_FILE_PARAGRAPH_FILE_CONTEXT;
    private static final SubLSymbol $sym32$FILE_PARAGRAPH_NUMBER;
    private static final SubLSymbol $sym33$_CSETF_FILE_PARAGRAPH_NUMBER;
    private static final SubLSymbol $sym34$FILE_PARAGRAPH_CLASS;
    private static final SubLSymbol $sym35$_CSETF_FILE_PARAGRAPH_CLASS;
    private static final SubLSymbol $sym36$FILE_PARAGRAPH_SENTENCES;
    private static final SubLSymbol $sym37$_CSETF_FILE_PARAGRAPH_SENTENCES;
    private static final SubLSymbol $kw38$FILE_CONTEXT;
    private static final SubLSymbol $kw39$NUMBER;
    private static final SubLSymbol $kw40$CLASS;
    private static final SubLSymbol $kw41$SENTENCES;
    private static final SubLSymbol $sym42$MAKE_FILE_PARAGRAPH;
    private static final SubLSymbol $sym43$VISIT_DEFSTRUCT_OBJECT_FILE_PARAGRAPH_METHOD;
    private static final SubLString $str44$__FileP__D_class__S__;
    private static final SubLString $str45$_;
    private static final SubLString $str46$___FileP_;
    private static final SubLSymbol $sym47$FILE_SENTENCE;
    private static final SubLSymbol $sym48$FILE_SENTENCE_P;
    private static final SubLList $list49;
    private static final SubLList $list50;
    private static final SubLList $list51;
    private static final SubLList $list52;
    private static final SubLSymbol $sym53$PRINT_FILE_SENTENCE;
    private static final SubLSymbol $sym54$FILE_SENTENCE_PRINT_FUNCTION_TRAMPOLINE;
    private static final SubLList $list55;
    private static final SubLSymbol $sym56$FILE_SENTENCE_PARAGRAPH;
    private static final SubLSymbol $sym57$_CSETF_FILE_SENTENCE_PARAGRAPH;
    private static final SubLSymbol $sym58$FILE_SENTENCE_NUMBER;
    private static final SubLSymbol $sym59$_CSETF_FILE_SENTENCE_NUMBER;
    private static final SubLSymbol $sym60$FILE_SENTENCE_TEXT;
    private static final SubLSymbol $sym61$_CSETF_FILE_SENTENCE_TEXT;
    private static final SubLSymbol $kw62$PARAGRAPH;
    private static final SubLSymbol $sym63$MAKE_FILE_SENTENCE;
    private static final SubLSymbol $sym64$VISIT_DEFSTRUCT_OBJECT_FILE_SENTENCE_METHOD;
    private static final SubLString $str65$__Sent__D;
    private static final SubLString $str66$of_P_D;
    private static final SubLString $str67$___S__;
    private static final SubLSymbol $kw68$INPUT;
    private static final SubLString $str69$Unable_to_open__S;
    private static final SubLString $str70$anonymous;
    private static final SubLSymbol $sym71$IS_RETURN_CHAR_;
    private static final SubLSymbol $sym72$CCONCATENATE;
    private static final SubLSymbol $kw73$IN_SENTENCE;
    private static final SubLSymbol $kw74$POTENTIAL_END;
    private static final SubLString $str75$_;
    private static final SubLString $str76$_;
    private static final SubLList $list77;
    private static final SubLList $list78;
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-ch-html-scanner.lisp", position = 1032L)
    public static SubLObject file_content_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        compatibility.default_struct_print_function(v_object, stream, (SubLObject)rkf_ch_html_scanner.ZERO_INTEGER);
        return (SubLObject)rkf_ch_html_scanner.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-ch-html-scanner.lisp", position = 1032L)
    public static SubLObject file_content_p(final SubLObject v_object) {
        return (SubLObject)((v_object.getClass() == $file_content_native.class) ? rkf_ch_html_scanner.T : rkf_ch_html_scanner.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-ch-html-scanner.lisp", position = 1032L)
    public static SubLObject file_content_name(final SubLObject v_object) {
        assert rkf_ch_html_scanner.NIL != file_content_p(v_object) : v_object;
        return v_object.getField2();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-ch-html-scanner.lisp", position = 1032L)
    public static SubLObject file_content_text(final SubLObject v_object) {
        assert rkf_ch_html_scanner.NIL != file_content_p(v_object) : v_object;
        return v_object.getField3();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-ch-html-scanner.lisp", position = 1032L)
    public static SubLObject _csetf_file_content_name(final SubLObject v_object, final SubLObject value) {
        assert rkf_ch_html_scanner.NIL != file_content_p(v_object) : v_object;
        return v_object.setField2(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-ch-html-scanner.lisp", position = 1032L)
    public static SubLObject _csetf_file_content_text(final SubLObject v_object, final SubLObject value) {
        assert rkf_ch_html_scanner.NIL != file_content_p(v_object) : v_object;
        return v_object.setField3(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-ch-html-scanner.lisp", position = 1032L)
    public static SubLObject make_file_content(SubLObject arglist) {
        if (arglist == rkf_ch_html_scanner.UNPROVIDED) {
            arglist = (SubLObject)rkf_ch_html_scanner.NIL;
        }
        final SubLObject v_new = (SubLObject)new $file_content_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = (SubLObject)rkf_ch_html_scanner.NIL, next = arglist; rkf_ch_html_scanner.NIL != next; next = conses_high.cddr(next)) {
            current_arg = next.first();
            current_value = conses_high.cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql((SubLObject)rkf_ch_html_scanner.$kw13$NAME)) {
                _csetf_file_content_name(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)rkf_ch_html_scanner.$kw14$TEXT)) {
                _csetf_file_content_text(v_new, current_value);
            }
            else {
                Errors.error((SubLObject)rkf_ch_html_scanner.$str15$Invalid_slot__S_for_construction_, current_arg);
            }
        }
        return v_new;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-ch-html-scanner.lisp", position = 1032L)
    public static SubLObject visit_defstruct_file_content(final SubLObject obj, final SubLObject visitor_fn) {
        Functions.funcall(visitor_fn, obj, (SubLObject)rkf_ch_html_scanner.$kw16$BEGIN, (SubLObject)rkf_ch_html_scanner.$sym17$MAKE_FILE_CONTENT, (SubLObject)rkf_ch_html_scanner.TWO_INTEGER);
        Functions.funcall(visitor_fn, obj, (SubLObject)rkf_ch_html_scanner.$kw18$SLOT, (SubLObject)rkf_ch_html_scanner.$kw13$NAME, file_content_name(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)rkf_ch_html_scanner.$kw18$SLOT, (SubLObject)rkf_ch_html_scanner.$kw14$TEXT, file_content_text(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)rkf_ch_html_scanner.$kw19$END, (SubLObject)rkf_ch_html_scanner.$sym17$MAKE_FILE_CONTENT, (SubLObject)rkf_ch_html_scanner.TWO_INTEGER);
        return obj;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-ch-html-scanner.lisp", position = 1032L)
    public static SubLObject visit_defstruct_object_file_content_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_file_content(obj, visitor_fn);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-ch-html-scanner.lisp", position = 1189L)
    public static SubLObject file_paragraph_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        print_file_paragraph(v_object, stream, (SubLObject)rkf_ch_html_scanner.ZERO_INTEGER);
        return (SubLObject)rkf_ch_html_scanner.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-ch-html-scanner.lisp", position = 1189L)
    public static SubLObject file_paragraph_p(final SubLObject v_object) {
        return (SubLObject)((v_object.getClass() == $file_paragraph_native.class) ? rkf_ch_html_scanner.T : rkf_ch_html_scanner.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-ch-html-scanner.lisp", position = 1189L)
    public static SubLObject file_paragraph_file_context(final SubLObject v_object) {
        assert rkf_ch_html_scanner.NIL != file_paragraph_p(v_object) : v_object;
        return v_object.getField2();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-ch-html-scanner.lisp", position = 1189L)
    public static SubLObject file_paragraph_number(final SubLObject v_object) {
        assert rkf_ch_html_scanner.NIL != file_paragraph_p(v_object) : v_object;
        return v_object.getField3();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-ch-html-scanner.lisp", position = 1189L)
    public static SubLObject file_paragraph_class(final SubLObject v_object) {
        assert rkf_ch_html_scanner.NIL != file_paragraph_p(v_object) : v_object;
        return v_object.getField4();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-ch-html-scanner.lisp", position = 1189L)
    public static SubLObject file_paragraph_sentences(final SubLObject v_object) {
        assert rkf_ch_html_scanner.NIL != file_paragraph_p(v_object) : v_object;
        return v_object.getField5();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-ch-html-scanner.lisp", position = 1189L)
    public static SubLObject _csetf_file_paragraph_file_context(final SubLObject v_object, final SubLObject value) {
        assert rkf_ch_html_scanner.NIL != file_paragraph_p(v_object) : v_object;
        return v_object.setField2(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-ch-html-scanner.lisp", position = 1189L)
    public static SubLObject _csetf_file_paragraph_number(final SubLObject v_object, final SubLObject value) {
        assert rkf_ch_html_scanner.NIL != file_paragraph_p(v_object) : v_object;
        return v_object.setField3(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-ch-html-scanner.lisp", position = 1189L)
    public static SubLObject _csetf_file_paragraph_class(final SubLObject v_object, final SubLObject value) {
        assert rkf_ch_html_scanner.NIL != file_paragraph_p(v_object) : v_object;
        return v_object.setField4(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-ch-html-scanner.lisp", position = 1189L)
    public static SubLObject _csetf_file_paragraph_sentences(final SubLObject v_object, final SubLObject value) {
        assert rkf_ch_html_scanner.NIL != file_paragraph_p(v_object) : v_object;
        return v_object.setField5(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-ch-html-scanner.lisp", position = 1189L)
    public static SubLObject make_file_paragraph(SubLObject arglist) {
        if (arglist == rkf_ch_html_scanner.UNPROVIDED) {
            arglist = (SubLObject)rkf_ch_html_scanner.NIL;
        }
        final SubLObject v_new = (SubLObject)new $file_paragraph_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = (SubLObject)rkf_ch_html_scanner.NIL, next = arglist; rkf_ch_html_scanner.NIL != next; next = conses_high.cddr(next)) {
            current_arg = next.first();
            current_value = conses_high.cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql((SubLObject)rkf_ch_html_scanner.$kw38$FILE_CONTEXT)) {
                _csetf_file_paragraph_file_context(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)rkf_ch_html_scanner.$kw39$NUMBER)) {
                _csetf_file_paragraph_number(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)rkf_ch_html_scanner.$kw40$CLASS)) {
                _csetf_file_paragraph_class(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)rkf_ch_html_scanner.$kw41$SENTENCES)) {
                _csetf_file_paragraph_sentences(v_new, current_value);
            }
            else {
                Errors.error((SubLObject)rkf_ch_html_scanner.$str15$Invalid_slot__S_for_construction_, current_arg);
            }
        }
        return v_new;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-ch-html-scanner.lisp", position = 1189L)
    public static SubLObject visit_defstruct_file_paragraph(final SubLObject obj, final SubLObject visitor_fn) {
        Functions.funcall(visitor_fn, obj, (SubLObject)rkf_ch_html_scanner.$kw16$BEGIN, (SubLObject)rkf_ch_html_scanner.$sym42$MAKE_FILE_PARAGRAPH, (SubLObject)rkf_ch_html_scanner.FOUR_INTEGER);
        Functions.funcall(visitor_fn, obj, (SubLObject)rkf_ch_html_scanner.$kw18$SLOT, (SubLObject)rkf_ch_html_scanner.$kw38$FILE_CONTEXT, file_paragraph_file_context(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)rkf_ch_html_scanner.$kw18$SLOT, (SubLObject)rkf_ch_html_scanner.$kw39$NUMBER, file_paragraph_number(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)rkf_ch_html_scanner.$kw18$SLOT, (SubLObject)rkf_ch_html_scanner.$kw40$CLASS, file_paragraph_class(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)rkf_ch_html_scanner.$kw18$SLOT, (SubLObject)rkf_ch_html_scanner.$kw41$SENTENCES, file_paragraph_sentences(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)rkf_ch_html_scanner.$kw19$END, (SubLObject)rkf_ch_html_scanner.$sym42$MAKE_FILE_PARAGRAPH, (SubLObject)rkf_ch_html_scanner.FOUR_INTEGER);
        return obj;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-ch-html-scanner.lisp", position = 1189L)
    public static SubLObject visit_defstruct_object_file_paragraph_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_file_paragraph(obj, visitor_fn);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-ch-html-scanner.lisp", position = 1464L)
    public static SubLObject new_file_paragraph(final SubLObject file, final SubLObject number, SubLObject sentences, SubLObject v_class) {
        if (sentences == rkf_ch_html_scanner.UNPROVIDED) {
            sentences = (SubLObject)rkf_ch_html_scanner.NIL;
        }
        if (v_class == rkf_ch_html_scanner.UNPROVIDED) {
            v_class = html_macros.$html_paragraph_head$.getGlobalValue();
        }
        final SubLObject paragraph = make_file_paragraph((SubLObject)rkf_ch_html_scanner.UNPROVIDED);
        _csetf_file_paragraph_file_context(paragraph, file);
        _csetf_file_paragraph_number(paragraph, number);
        _csetf_file_paragraph_class(paragraph, v_class);
        _csetf_file_paragraph_sentences(paragraph, sentences);
        return paragraph;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-ch-html-scanner.lisp", position = 1954L)
    public static SubLObject print_file_paragraph(final SubLObject v_object, final SubLObject stream, final SubLObject depth) {
        PrintLow.format(stream, (SubLObject)rkf_ch_html_scanner.$str44$__FileP__D_class__S__, file_paragraph_number(v_object), file_paragraph_class(v_object));
        SubLObject cdolist_list_var = file_paragraph_sentences(v_object);
        SubLObject item = (SubLObject)rkf_ch_html_scanner.NIL;
        item = cdolist_list_var.first();
        while (rkf_ch_html_scanner.NIL != cdolist_list_var) {
            print_high.princ((SubLObject)rkf_ch_html_scanner.$str45$_, stream);
            print_high.princ(item, stream);
            streams_high.terpri(stream);
            cdolist_list_var = cdolist_list_var.rest();
            item = cdolist_list_var.first();
        }
        PrintLow.format(stream, (SubLObject)rkf_ch_html_scanner.$str46$___FileP_);
        return v_object;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-ch-html-scanner.lisp", position = 2315L)
    public static SubLObject file_sentence_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        print_file_sentence(v_object, stream, (SubLObject)rkf_ch_html_scanner.ZERO_INTEGER);
        return (SubLObject)rkf_ch_html_scanner.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-ch-html-scanner.lisp", position = 2315L)
    public static SubLObject file_sentence_p(final SubLObject v_object) {
        return (SubLObject)((v_object.getClass() == $file_sentence_native.class) ? rkf_ch_html_scanner.T : rkf_ch_html_scanner.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-ch-html-scanner.lisp", position = 2315L)
    public static SubLObject file_sentence_paragraph(final SubLObject v_object) {
        assert rkf_ch_html_scanner.NIL != file_sentence_p(v_object) : v_object;
        return v_object.getField2();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-ch-html-scanner.lisp", position = 2315L)
    public static SubLObject file_sentence_number(final SubLObject v_object) {
        assert rkf_ch_html_scanner.NIL != file_sentence_p(v_object) : v_object;
        return v_object.getField3();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-ch-html-scanner.lisp", position = 2315L)
    public static SubLObject file_sentence_text(final SubLObject v_object) {
        assert rkf_ch_html_scanner.NIL != file_sentence_p(v_object) : v_object;
        return v_object.getField4();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-ch-html-scanner.lisp", position = 2315L)
    public static SubLObject _csetf_file_sentence_paragraph(final SubLObject v_object, final SubLObject value) {
        assert rkf_ch_html_scanner.NIL != file_sentence_p(v_object) : v_object;
        return v_object.setField2(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-ch-html-scanner.lisp", position = 2315L)
    public static SubLObject _csetf_file_sentence_number(final SubLObject v_object, final SubLObject value) {
        assert rkf_ch_html_scanner.NIL != file_sentence_p(v_object) : v_object;
        return v_object.setField3(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-ch-html-scanner.lisp", position = 2315L)
    public static SubLObject _csetf_file_sentence_text(final SubLObject v_object, final SubLObject value) {
        assert rkf_ch_html_scanner.NIL != file_sentence_p(v_object) : v_object;
        return v_object.setField4(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-ch-html-scanner.lisp", position = 2315L)
    public static SubLObject make_file_sentence(SubLObject arglist) {
        if (arglist == rkf_ch_html_scanner.UNPROVIDED) {
            arglist = (SubLObject)rkf_ch_html_scanner.NIL;
        }
        final SubLObject v_new = (SubLObject)new $file_sentence_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = (SubLObject)rkf_ch_html_scanner.NIL, next = arglist; rkf_ch_html_scanner.NIL != next; next = conses_high.cddr(next)) {
            current_arg = next.first();
            current_value = conses_high.cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql((SubLObject)rkf_ch_html_scanner.$kw62$PARAGRAPH)) {
                _csetf_file_sentence_paragraph(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)rkf_ch_html_scanner.$kw39$NUMBER)) {
                _csetf_file_sentence_number(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)rkf_ch_html_scanner.$kw14$TEXT)) {
                _csetf_file_sentence_text(v_new, current_value);
            }
            else {
                Errors.error((SubLObject)rkf_ch_html_scanner.$str15$Invalid_slot__S_for_construction_, current_arg);
            }
        }
        return v_new;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-ch-html-scanner.lisp", position = 2315L)
    public static SubLObject visit_defstruct_file_sentence(final SubLObject obj, final SubLObject visitor_fn) {
        Functions.funcall(visitor_fn, obj, (SubLObject)rkf_ch_html_scanner.$kw16$BEGIN, (SubLObject)rkf_ch_html_scanner.$sym63$MAKE_FILE_SENTENCE, (SubLObject)rkf_ch_html_scanner.THREE_INTEGER);
        Functions.funcall(visitor_fn, obj, (SubLObject)rkf_ch_html_scanner.$kw18$SLOT, (SubLObject)rkf_ch_html_scanner.$kw62$PARAGRAPH, file_sentence_paragraph(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)rkf_ch_html_scanner.$kw18$SLOT, (SubLObject)rkf_ch_html_scanner.$kw39$NUMBER, file_sentence_number(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)rkf_ch_html_scanner.$kw18$SLOT, (SubLObject)rkf_ch_html_scanner.$kw14$TEXT, file_sentence_text(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)rkf_ch_html_scanner.$kw19$END, (SubLObject)rkf_ch_html_scanner.$sym63$MAKE_FILE_SENTENCE, (SubLObject)rkf_ch_html_scanner.THREE_INTEGER);
        return obj;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-ch-html-scanner.lisp", position = 2315L)
    public static SubLObject visit_defstruct_object_file_sentence_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_file_sentence(obj, visitor_fn);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-ch-html-scanner.lisp", position = 2506L)
    public static SubLObject new_file_sentence(final SubLObject paragraph, final SubLObject number, SubLObject text) {
        if (text == rkf_ch_html_scanner.UNPROVIDED) {
            text = (SubLObject)rkf_ch_html_scanner.NIL;
        }
        final SubLObject sentence = make_file_sentence((SubLObject)rkf_ch_html_scanner.UNPROVIDED);
        _csetf_file_sentence_paragraph(sentence, paragraph);
        _csetf_file_sentence_number(sentence, number);
        _csetf_file_sentence_text(sentence, text);
        return sentence;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-ch-html-scanner.lisp", position = 2797L)
    public static SubLObject print_file_sentence(final SubLObject v_object, final SubLObject stream, final SubLObject depth) {
        PrintLow.format(stream, (SubLObject)rkf_ch_html_scanner.$str65$__Sent__D, file_sentence_number(v_object));
        final SubLObject paragraph = file_sentence_paragraph(v_object);
        if (rkf_ch_html_scanner.NIL != file_paragraph_p(paragraph)) {
            PrintLow.format(stream, (SubLObject)rkf_ch_html_scanner.$str66$of_P_D, file_paragraph_number(paragraph));
        }
        PrintLow.format(stream, (SubLObject)rkf_ch_html_scanner.$str67$___S__, file_sentence_text(v_object));
        return v_object;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-ch-html-scanner.lisp", position = 3167L)
    public static SubLObject rkfutil_process_html_file(final SubLObject filename) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject content = (SubLObject)rkf_ch_html_scanner.NIL;
        SubLObject paragraphs = (SubLObject)rkf_ch_html_scanner.NIL;
        SubLObject all_sentences = (SubLObject)rkf_ch_html_scanner.NIL;
        SubLObject stream = (SubLObject)rkf_ch_html_scanner.NIL;
        try {
            final SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding(thread);
            try {
                stream_macros.$stream_requires_locking$.bind((SubLObject)rkf_ch_html_scanner.NIL, thread);
                stream = compatibility.open_text(filename, (SubLObject)rkf_ch_html_scanner.$kw68$INPUT);
            }
            finally {
                stream_macros.$stream_requires_locking$.rebind(_prev_bind_0, thread);
            }
            if (!stream.isStream()) {
                Errors.error((SubLObject)rkf_ch_html_scanner.$str69$Unable_to_open__S, filename);
            }
            final SubLObject s = stream;
            content = rkfutil_fetch_html_file(s, filename);
        }
        finally {
            final SubLObject _prev_bind_2 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)rkf_ch_html_scanner.T, thread);
                final SubLObject _values = Values.getValuesAsVector();
                if (stream.isStream()) {
                    streams_high.close(stream, (SubLObject)rkf_ch_html_scanner.UNPROVIDED);
                }
                Values.restoreValuesFromVector(_values);
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
            }
        }
        SubLObject cdolist_list_var;
        paragraphs = (cdolist_list_var = rkfutil_fetch_html_paragraphs(content));
        SubLObject paragraph = (SubLObject)rkf_ch_html_scanner.NIL;
        paragraph = cdolist_list_var.first();
        while (rkf_ch_html_scanner.NIL != cdolist_list_var) {
            final SubLObject sentences = rkfutil_fetch_html_sentences(paragraph);
            if (rkf_ch_html_scanner.NIL != sentences) {
                all_sentences = (SubLObject)ConsesLow.cons(sentences, all_sentences);
            }
            cdolist_list_var = cdolist_list_var.rest();
            paragraph = cdolist_list_var.first();
        }
        return Sequences.nreverse(all_sentences);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-ch-html-scanner.lisp", position = 3714L)
    public static SubLObject is_return_charP(final SubLObject string) {
        return Characters.char_equal((SubLObject)Characters.CHAR_return, Vectors.aref(string, (SubLObject)rkf_ch_html_scanner.ZERO_INTEGER));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-ch-html-scanner.lisp", position = 3863L)
    public static SubLObject rkfutil_fetch_html_file(final SubLObject stream, SubLObject filename) {
        if (filename == rkf_ch_html_scanner.UNPROVIDED) {
            filename = (SubLObject)rkf_ch_html_scanner.$str70$anonymous;
        }
        final SubLObject file = make_file_content((SubLObject)rkf_ch_html_scanner.UNPROVIDED);
        SubLObject content = (SubLObject)rkf_ch_html_scanner.NIL;
        _csetf_file_content_name(file, filename);
        content = xml_parsing_utilities.xml_tokenize(stream, (SubLObject)rkf_ch_html_scanner.UNPROVIDED, (SubLObject)rkf_ch_html_scanner.UNPROVIDED, (SubLObject)rkf_ch_html_scanner.UNPROVIDED);
        content = Sequences.delete_if((SubLObject)rkf_ch_html_scanner.$sym71$IS_RETURN_CHAR_, content, (SubLObject)rkf_ch_html_scanner.UNPROVIDED, (SubLObject)rkf_ch_html_scanner.UNPROVIDED, (SubLObject)rkf_ch_html_scanner.UNPROVIDED, (SubLObject)rkf_ch_html_scanner.UNPROVIDED);
        _csetf_file_content_text(file, content);
        return file;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-ch-html-scanner.lisp", position = 4206L)
    public static SubLObject rkfutil_fetch_html_paragraphs(final SubLObject file) {
        SubLObject counter = (SubLObject)rkf_ch_html_scanner.ZERO_INTEGER;
        SubLObject paragraph = new_file_paragraph(file, counter, (SubLObject)rkf_ch_html_scanner.UNPROVIDED, (SubLObject)rkf_ch_html_scanner.UNPROVIDED);
        SubLObject paragraphs = (SubLObject)ConsesLow.cons(paragraph, (SubLObject)rkf_ch_html_scanner.NIL);
        SubLObject tokens = file_content_text(file);
        counter = Numbers.add(counter, (SubLObject)rkf_ch_html_scanner.ONE_INTEGER);
        SubLObject items;
        for (tokens = scan_title_text(paragraph, tokens), tokens = scan_past_first_token(html_macros.$html_paragraph_head$.getGlobalValue(), tokens); rkf_ch_html_scanner.NIL != tokens; tokens = scan_past_first_token(html_macros.$html_paragraph_head$.getGlobalValue(), tokens)) {
            items = (SubLObject)rkf_ch_html_scanner.NIL;
            while (rkf_ch_html_scanner.NIL != tokens && !tokens.first().equalp(html_macros.$html_paragraph_tail$.getGlobalValue())) {
                items = (SubLObject)ConsesLow.cons(tokens.first(), items);
                tokens = tokens.rest();
            }
            paragraph = new_file_paragraph(file, counter, Sequences.nreverse(items), (SubLObject)rkf_ch_html_scanner.UNPROVIDED);
            paragraphs = (SubLObject)ConsesLow.cons(paragraph, paragraphs);
            counter = Numbers.add(counter, (SubLObject)rkf_ch_html_scanner.ONE_INTEGER);
        }
        return Sequences.nreverse(paragraphs);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-ch-html-scanner.lisp", position = 5120L)
    public static SubLObject scan_title_text(final SubLObject paragraph, final SubLObject tokens) {
        SubLObject spot = scan_past_first_token(html_macros.$html_title_head$.getGlobalValue(), tokens);
        final SubLObject title_text = (SubLObject)rkf_ch_html_scanner.NIL;
        _csetf_file_paragraph_class(paragraph, html_macros.$html_title_head$.getGlobalValue());
        if (rkf_ch_html_scanner.NIL == spot) {
            spot = tokens;
        }
        else {
            SubLObject title_text_$1 = (SubLObject)rkf_ch_html_scanner.NIL;
            while (rkf_ch_html_scanner.NIL != spot && !spot.first().equalp(html_macros.$html_title_tail$.getGlobalValue())) {
                title_text_$1 = (SubLObject)ConsesLow.cons(spot.first(), title_text_$1);
                spot = spot.rest();
            }
            title_text_$1 = Sequences.nreverse(title_text_$1);
        }
        _csetf_file_paragraph_sentences(paragraph, title_text);
        return spot;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-ch-html-scanner.lisp", position = 5713L)
    public static SubLObject rkfutil_fetch_html_sentences(final SubLObject paragraph) {
        SubLObject good_pieces = (SubLObject)rkf_ch_html_scanner.NIL;
        if (file_paragraph_class(paragraph).equalp(html_macros.$html_paragraph_head$.getGlobalValue())) {
            SubLObject cdolist_list_var = file_paragraph_sentences(paragraph);
            SubLObject piece = (SubLObject)rkf_ch_html_scanner.NIL;
            piece = cdolist_list_var.first();
            while (rkf_ch_html_scanner.NIL != cdolist_list_var) {
                if (rkf_ch_html_scanner.NIL == Characters.char_equal((SubLObject)Characters.CHAR_less, Vectors.aref(piece, (SubLObject)rkf_ch_html_scanner.ZERO_INTEGER))) {
                    good_pieces = (SubLObject)ConsesLow.cons(piece, good_pieces);
                }
                cdolist_list_var = cdolist_list_var.rest();
                piece = cdolist_list_var.first();
            }
            if (rkf_ch_html_scanner.NIL != good_pieces) {
                return convert_good_pieces(paragraph, good_pieces);
            }
        }
        return (SubLObject)rkf_ch_html_scanner.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-ch-html-scanner.lisp", position = 6200L)
    public static SubLObject convert_good_pieces(final SubLObject paragraph, final SubLObject good_pieces) {
        SubLObject text = Functions.apply(Symbols.symbol_function((SubLObject)rkf_ch_html_scanner.$sym72$CCONCATENATE), Sequences.nreverse(good_pieces));
        text = cleanse_text(text);
        return decompose_paragraph_into_sentences(paragraph, text);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-ch-html-scanner.lisp", position = 6483L)
    public static SubLObject cleanse_text(final SubLObject text) {
        return Sequences.nsubstitute((SubLObject)Characters.CHAR_space, (SubLObject)Characters.CHAR_newline, Sequences.delete((SubLObject)Characters.CHAR_return, text, (SubLObject)rkf_ch_html_scanner.UNPROVIDED, (SubLObject)rkf_ch_html_scanner.UNPROVIDED, (SubLObject)rkf_ch_html_scanner.UNPROVIDED, (SubLObject)rkf_ch_html_scanner.UNPROVIDED, (SubLObject)rkf_ch_html_scanner.UNPROVIDED), (SubLObject)rkf_ch_html_scanner.UNPROVIDED, (SubLObject)rkf_ch_html_scanner.UNPROVIDED, (SubLObject)rkf_ch_html_scanner.UNPROVIDED, (SubLObject)rkf_ch_html_scanner.UNPROVIDED, (SubLObject)rkf_ch_html_scanner.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-ch-html-scanner.lisp", position = 6587L)
    public static SubLObject decompose_paragraph_into_sentences(final SubLObject paragraph, final SubLObject text) {
        SubLObject counter = (SubLObject)rkf_ch_html_scanner.ONE_INTEGER;
        SubLObject state = (SubLObject)rkf_ch_html_scanner.$kw73$IN_SENTENCE;
        SubLObject start = (SubLObject)rkf_ch_html_scanner.ZERO_INTEGER;
        SubLObject end = (SubLObject)rkf_ch_html_scanner.NIL;
        SubLObject curr = (SubLObject)rkf_ch_html_scanner.NIL;
        SubLObject sentences = (SubLObject)rkf_ch_html_scanner.NIL;
        SubLObject cdotimes_end_var;
        SubLObject index;
        SubLObject pcase_var;
        SubLObject part;
        for (cdotimes_end_var = Sequences.length(text), index = (SubLObject)rkf_ch_html_scanner.NIL, index = (SubLObject)rkf_ch_html_scanner.ZERO_INTEGER; index.numL(cdotimes_end_var); index = Numbers.add(index, (SubLObject)rkf_ch_html_scanner.ONE_INTEGER)) {
            curr = Vectors.aref(text, index);
            pcase_var = state;
            if (pcase_var.eql((SubLObject)rkf_ch_html_scanner.$kw73$IN_SENTENCE)) {
                if (rkf_ch_html_scanner.NIL != is_a_terminatorP(curr)) {
                    end = Numbers.add(index, (SubLObject)rkf_ch_html_scanner.ONE_INTEGER);
                    state = (SubLObject)rkf_ch_html_scanner.$kw74$POTENTIAL_END;
                }
            }
            else if (pcase_var.eql((SubLObject)rkf_ch_html_scanner.$kw74$POTENTIAL_END) && rkf_ch_html_scanner.NIL == is_a_spaceP(curr)) {
                if (rkf_ch_html_scanner.NIL != Characters.upper_case_p(curr)) {
                    part = Sequences.subseq(text, start, end);
                    part = string_utilities.replace_substring(part, (SubLObject)rkf_ch_html_scanner.$str75$_, (SubLObject)rkf_ch_html_scanner.$str76$_);
                    sentences = (SubLObject)ConsesLow.cons(new_file_sentence(paragraph, counter, part), sentences);
                    counter = Numbers.add(counter, (SubLObject)rkf_ch_html_scanner.ONE_INTEGER);
                    start = index;
                }
                state = (SubLObject)rkf_ch_html_scanner.$kw73$IN_SENTENCE;
            }
        }
        if (state == rkf_ch_html_scanner.$kw74$POTENTIAL_END) {
            SubLObject part2 = Sequences.subseq(text, start, end);
            part2 = string_utilities.replace_substring(part2, (SubLObject)rkf_ch_html_scanner.$str75$_, (SubLObject)rkf_ch_html_scanner.$str76$_);
            sentences = (SubLObject)ConsesLow.cons(new_file_sentence(paragraph, counter, part2), sentences);
        }
        return Sequences.nreverse(sentences);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-ch-html-scanner.lisp", position = 7813L)
    public static SubLObject is_a_terminatorP(final SubLObject v_char) {
        return conses_high.member(v_char, (SubLObject)rkf_ch_html_scanner.$list77, (SubLObject)rkf_ch_html_scanner.UNPROVIDED, (SubLObject)rkf_ch_html_scanner.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-ch-html-scanner.lisp", position = 7984L)
    public static SubLObject is_a_spaceP(final SubLObject v_char) {
        return conses_high.member(v_char, (SubLObject)rkf_ch_html_scanner.$list78, (SubLObject)rkf_ch_html_scanner.UNPROVIDED, (SubLObject)rkf_ch_html_scanner.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-ch-html-scanner.lisp", position = 8079L)
    public static SubLObject scan_past_first_token(final SubLObject token, final SubLObject tokens) {
        final SubLObject scan_result = scan_to_first_token(token, tokens);
        return scan_result.rest();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-ch-html-scanner.lisp", position = 8301L)
    public static SubLObject scan_to_first_token(final SubLObject token, SubLObject tokens) {
        while (!tokens.first().equalp(token)) {
            if (rkf_ch_html_scanner.NIL == tokens) {
                return (SubLObject)rkf_ch_html_scanner.NIL;
            }
            tokens = tokens.rest();
        }
        return tokens;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-ch-html-scanner.lisp", position = 8493L)
    public static SubLObject scan_past_first_token_starting(final SubLObject header, final SubLObject tokens) {
        final SubLObject scan_result = scan_to_first_token_starting(header, tokens);
        return scan_result.rest();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-ch-html-scanner.lisp", position = 8658L)
    public static SubLObject scan_to_first_token_starting(final SubLObject header, SubLObject tokens) {
        SubLObject position;
        for (position = (SubLObject)rkf_ch_html_scanner.NIL, position = Sequences.search(header, tokens.first(), Symbols.symbol_function((SubLObject)rkf_ch_html_scanner.EQUALP), (SubLObject)rkf_ch_html_scanner.UNPROVIDED, (SubLObject)rkf_ch_html_scanner.UNPROVIDED, (SubLObject)rkf_ch_html_scanner.UNPROVIDED, (SubLObject)rkf_ch_html_scanner.UNPROVIDED, (SubLObject)rkf_ch_html_scanner.UNPROVIDED); !position.isNumber() || !position.isZero(); position = Sequences.search(header, tokens.first(), Symbols.symbol_function((SubLObject)rkf_ch_html_scanner.EQUALP), (SubLObject)rkf_ch_html_scanner.UNPROVIDED, (SubLObject)rkf_ch_html_scanner.UNPROVIDED, (SubLObject)rkf_ch_html_scanner.UNPROVIDED, (SubLObject)rkf_ch_html_scanner.UNPROVIDED, (SubLObject)rkf_ch_html_scanner.UNPROVIDED)) {
            if (rkf_ch_html_scanner.NIL == tokens) {
                return (SubLObject)rkf_ch_html_scanner.NIL;
            }
            tokens = tokens.rest();
        }
        return tokens;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-ch-html-scanner.lisp", position = 8978L)
    public static SubLObject rkf_sententialize_paragraph(final SubLObject paragraph) {
        final SubLObject text = cleanse_text(paragraph);
        final SubLObject sentences = decompose_paragraph_into_sentences((SubLObject)rkf_ch_html_scanner.NIL, text);
        SubLObject result = (SubLObject)rkf_ch_html_scanner.NIL;
        SubLObject cdolist_list_var = sentences;
        SubLObject item = (SubLObject)rkf_ch_html_scanner.NIL;
        item = cdolist_list_var.first();
        while (rkf_ch_html_scanner.NIL != cdolist_list_var) {
            result = (SubLObject)ConsesLow.cons(file_sentence_text(item), result);
            cdolist_list_var = cdolist_list_var.rest();
            item = cdolist_list_var.first();
        }
        return Sequences.nreverse(result);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-ch-html-scanner.lisp", position = 9332L)
    public static SubLObject rkf_sententialize_file(final SubLObject filename) {
        final SubLObject sentences = rkfutil_process_html_file(filename);
        SubLObject result = (SubLObject)rkf_ch_html_scanner.NIL;
        SubLObject cdolist_list_var = sentences;
        SubLObject paragraph = (SubLObject)rkf_ch_html_scanner.NIL;
        paragraph = cdolist_list_var.first();
        while (rkf_ch_html_scanner.NIL != cdolist_list_var) {
            SubLObject cdolist_list_var_$2 = paragraph;
            SubLObject sentence = (SubLObject)rkf_ch_html_scanner.NIL;
            sentence = cdolist_list_var_$2.first();
            while (rkf_ch_html_scanner.NIL != cdolist_list_var_$2) {
                result = (SubLObject)ConsesLow.cons(file_sentence_text(sentence), result);
                cdolist_list_var_$2 = cdolist_list_var_$2.rest();
                sentence = cdolist_list_var_$2.first();
            }
            cdolist_list_var = cdolist_list_var.rest();
            paragraph = cdolist_list_var.first();
        }
        return Sequences.nreverse(result);
    }
    
    public static SubLObject declare_rkf_ch_html_scanner_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_ch_html_scanner", "file_content_print_function_trampoline", "FILE-CONTENT-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_ch_html_scanner", "file_content_p", "FILE-CONTENT-P", 1, 0, false);
        new $file_content_p$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_ch_html_scanner", "file_content_name", "FILE-CONTENT-NAME", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_ch_html_scanner", "file_content_text", "FILE-CONTENT-TEXT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_ch_html_scanner", "_csetf_file_content_name", "_CSETF-FILE-CONTENT-NAME", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_ch_html_scanner", "_csetf_file_content_text", "_CSETF-FILE-CONTENT-TEXT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_ch_html_scanner", "make_file_content", "MAKE-FILE-CONTENT", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_ch_html_scanner", "visit_defstruct_file_content", "VISIT-DEFSTRUCT-FILE-CONTENT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_ch_html_scanner", "visit_defstruct_object_file_content_method", "VISIT-DEFSTRUCT-OBJECT-FILE-CONTENT-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_ch_html_scanner", "file_paragraph_print_function_trampoline", "FILE-PARAGRAPH-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_ch_html_scanner", "file_paragraph_p", "FILE-PARAGRAPH-P", 1, 0, false);
        new $file_paragraph_p$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_ch_html_scanner", "file_paragraph_file_context", "FILE-PARAGRAPH-FILE-CONTEXT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_ch_html_scanner", "file_paragraph_number", "FILE-PARAGRAPH-NUMBER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_ch_html_scanner", "file_paragraph_class", "FILE-PARAGRAPH-CLASS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_ch_html_scanner", "file_paragraph_sentences", "FILE-PARAGRAPH-SENTENCES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_ch_html_scanner", "_csetf_file_paragraph_file_context", "_CSETF-FILE-PARAGRAPH-FILE-CONTEXT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_ch_html_scanner", "_csetf_file_paragraph_number", "_CSETF-FILE-PARAGRAPH-NUMBER", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_ch_html_scanner", "_csetf_file_paragraph_class", "_CSETF-FILE-PARAGRAPH-CLASS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_ch_html_scanner", "_csetf_file_paragraph_sentences", "_CSETF-FILE-PARAGRAPH-SENTENCES", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_ch_html_scanner", "make_file_paragraph", "MAKE-FILE-PARAGRAPH", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_ch_html_scanner", "visit_defstruct_file_paragraph", "VISIT-DEFSTRUCT-FILE-PARAGRAPH", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_ch_html_scanner", "visit_defstruct_object_file_paragraph_method", "VISIT-DEFSTRUCT-OBJECT-FILE-PARAGRAPH-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_ch_html_scanner", "new_file_paragraph", "NEW-FILE-PARAGRAPH", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_ch_html_scanner", "print_file_paragraph", "PRINT-FILE-PARAGRAPH", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_ch_html_scanner", "file_sentence_print_function_trampoline", "FILE-SENTENCE-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_ch_html_scanner", "file_sentence_p", "FILE-SENTENCE-P", 1, 0, false);
        new $file_sentence_p$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_ch_html_scanner", "file_sentence_paragraph", "FILE-SENTENCE-PARAGRAPH", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_ch_html_scanner", "file_sentence_number", "FILE-SENTENCE-NUMBER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_ch_html_scanner", "file_sentence_text", "FILE-SENTENCE-TEXT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_ch_html_scanner", "_csetf_file_sentence_paragraph", "_CSETF-FILE-SENTENCE-PARAGRAPH", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_ch_html_scanner", "_csetf_file_sentence_number", "_CSETF-FILE-SENTENCE-NUMBER", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_ch_html_scanner", "_csetf_file_sentence_text", "_CSETF-FILE-SENTENCE-TEXT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_ch_html_scanner", "make_file_sentence", "MAKE-FILE-SENTENCE", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_ch_html_scanner", "visit_defstruct_file_sentence", "VISIT-DEFSTRUCT-FILE-SENTENCE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_ch_html_scanner", "visit_defstruct_object_file_sentence_method", "VISIT-DEFSTRUCT-OBJECT-FILE-SENTENCE-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_ch_html_scanner", "new_file_sentence", "NEW-FILE-SENTENCE", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_ch_html_scanner", "print_file_sentence", "PRINT-FILE-SENTENCE", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_ch_html_scanner", "rkfutil_process_html_file", "RKFUTIL-PROCESS-HTML-FILE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_ch_html_scanner", "is_return_charP", "IS-RETURN-CHAR?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_ch_html_scanner", "rkfutil_fetch_html_file", "RKFUTIL-FETCH-HTML-FILE", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_ch_html_scanner", "rkfutil_fetch_html_paragraphs", "RKFUTIL-FETCH-HTML-PARAGRAPHS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_ch_html_scanner", "scan_title_text", "SCAN-TITLE-TEXT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_ch_html_scanner", "rkfutil_fetch_html_sentences", "RKFUTIL-FETCH-HTML-SENTENCES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_ch_html_scanner", "convert_good_pieces", "CONVERT-GOOD-PIECES", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_ch_html_scanner", "cleanse_text", "CLEANSE-TEXT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_ch_html_scanner", "decompose_paragraph_into_sentences", "DECOMPOSE-PARAGRAPH-INTO-SENTENCES", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_ch_html_scanner", "is_a_terminatorP", "IS-A-TERMINATOR?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_ch_html_scanner", "is_a_spaceP", "IS-A-SPACE?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_ch_html_scanner", "scan_past_first_token", "SCAN-PAST-FIRST-TOKEN", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_ch_html_scanner", "scan_to_first_token", "SCAN-TO-FIRST-TOKEN", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_ch_html_scanner", "scan_past_first_token_starting", "SCAN-PAST-FIRST-TOKEN-STARTING", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_ch_html_scanner", "scan_to_first_token_starting", "SCAN-TO-FIRST-TOKEN-STARTING", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_ch_html_scanner", "rkf_sententialize_paragraph", "RKF-SENTENTIALIZE-PARAGRAPH", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_ch_html_scanner", "rkf_sententialize_file", "RKF-SENTENTIALIZE-FILE", 1, 0, false);
        return (SubLObject)rkf_ch_html_scanner.NIL;
    }
    
    public static SubLObject init_rkf_ch_html_scanner_file() {
        rkf_ch_html_scanner.$dtp_file_content$ = SubLFiles.defconstant("*DTP-FILE-CONTENT*", (SubLObject)rkf_ch_html_scanner.$sym0$FILE_CONTENT);
        rkf_ch_html_scanner.$dtp_file_paragraph$ = SubLFiles.defconstant("*DTP-FILE-PARAGRAPH*", (SubLObject)rkf_ch_html_scanner.$sym21$FILE_PARAGRAPH);
        rkf_ch_html_scanner.$dtp_file_sentence$ = SubLFiles.defconstant("*DTP-FILE-SENTENCE*", (SubLObject)rkf_ch_html_scanner.$sym47$FILE_SENTENCE);
        return (SubLObject)rkf_ch_html_scanner.NIL;
    }
    
    public static SubLObject setup_rkf_ch_html_scanner_file() {
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), rkf_ch_html_scanner.$dtp_file_content$.getGlobalValue(), Symbols.symbol_function((SubLObject)rkf_ch_html_scanner.$sym7$FILE_CONTENT_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)rkf_ch_html_scanner.$list8);
        Structures.def_csetf((SubLObject)rkf_ch_html_scanner.$sym9$FILE_CONTENT_NAME, (SubLObject)rkf_ch_html_scanner.$sym10$_CSETF_FILE_CONTENT_NAME);
        Structures.def_csetf((SubLObject)rkf_ch_html_scanner.$sym11$FILE_CONTENT_TEXT, (SubLObject)rkf_ch_html_scanner.$sym12$_CSETF_FILE_CONTENT_TEXT);
        Equality.identity((SubLObject)rkf_ch_html_scanner.$sym0$FILE_CONTENT);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), rkf_ch_html_scanner.$dtp_file_content$.getGlobalValue(), Symbols.symbol_function((SubLObject)rkf_ch_html_scanner.$sym20$VISIT_DEFSTRUCT_OBJECT_FILE_CONTENT_METHOD));
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), rkf_ch_html_scanner.$dtp_file_paragraph$.getGlobalValue(), Symbols.symbol_function((SubLObject)rkf_ch_html_scanner.$sym28$FILE_PARAGRAPH_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)rkf_ch_html_scanner.$list29);
        Structures.def_csetf((SubLObject)rkf_ch_html_scanner.$sym30$FILE_PARAGRAPH_FILE_CONTEXT, (SubLObject)rkf_ch_html_scanner.$sym31$_CSETF_FILE_PARAGRAPH_FILE_CONTEXT);
        Structures.def_csetf((SubLObject)rkf_ch_html_scanner.$sym32$FILE_PARAGRAPH_NUMBER, (SubLObject)rkf_ch_html_scanner.$sym33$_CSETF_FILE_PARAGRAPH_NUMBER);
        Structures.def_csetf((SubLObject)rkf_ch_html_scanner.$sym34$FILE_PARAGRAPH_CLASS, (SubLObject)rkf_ch_html_scanner.$sym35$_CSETF_FILE_PARAGRAPH_CLASS);
        Structures.def_csetf((SubLObject)rkf_ch_html_scanner.$sym36$FILE_PARAGRAPH_SENTENCES, (SubLObject)rkf_ch_html_scanner.$sym37$_CSETF_FILE_PARAGRAPH_SENTENCES);
        Equality.identity((SubLObject)rkf_ch_html_scanner.$sym21$FILE_PARAGRAPH);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), rkf_ch_html_scanner.$dtp_file_paragraph$.getGlobalValue(), Symbols.symbol_function((SubLObject)rkf_ch_html_scanner.$sym43$VISIT_DEFSTRUCT_OBJECT_FILE_PARAGRAPH_METHOD));
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), rkf_ch_html_scanner.$dtp_file_sentence$.getGlobalValue(), Symbols.symbol_function((SubLObject)rkf_ch_html_scanner.$sym54$FILE_SENTENCE_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)rkf_ch_html_scanner.$list55);
        Structures.def_csetf((SubLObject)rkf_ch_html_scanner.$sym56$FILE_SENTENCE_PARAGRAPH, (SubLObject)rkf_ch_html_scanner.$sym57$_CSETF_FILE_SENTENCE_PARAGRAPH);
        Structures.def_csetf((SubLObject)rkf_ch_html_scanner.$sym58$FILE_SENTENCE_NUMBER, (SubLObject)rkf_ch_html_scanner.$sym59$_CSETF_FILE_SENTENCE_NUMBER);
        Structures.def_csetf((SubLObject)rkf_ch_html_scanner.$sym60$FILE_SENTENCE_TEXT, (SubLObject)rkf_ch_html_scanner.$sym61$_CSETF_FILE_SENTENCE_TEXT);
        Equality.identity((SubLObject)rkf_ch_html_scanner.$sym47$FILE_SENTENCE);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), rkf_ch_html_scanner.$dtp_file_sentence$.getGlobalValue(), Symbols.symbol_function((SubLObject)rkf_ch_html_scanner.$sym64$VISIT_DEFSTRUCT_OBJECT_FILE_SENTENCE_METHOD));
        return (SubLObject)rkf_ch_html_scanner.NIL;
    }
    
    public void declareFunctions() {
        declare_rkf_ch_html_scanner_file();
    }
    
    public void initializeVariables() {
        init_rkf_ch_html_scanner_file();
    }
    
    public void runTopLevelForms() {
        setup_rkf_ch_html_scanner_file();
    }
    
    static {
        me = (SubLFile)new rkf_ch_html_scanner();
        rkf_ch_html_scanner.$dtp_file_content$ = null;
        rkf_ch_html_scanner.$dtp_file_paragraph$ = null;
        rkf_ch_html_scanner.$dtp_file_sentence$ = null;
        $sym0$FILE_CONTENT = SubLObjectFactory.makeSymbol("FILE-CONTENT");
        $sym1$FILE_CONTENT_P = SubLObjectFactory.makeSymbol("FILE-CONTENT-P");
        $list2 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NAME"), (SubLObject)SubLObjectFactory.makeSymbol("TEXT"));
        $list3 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NAME"), (SubLObject)SubLObjectFactory.makeKeyword("TEXT"));
        $list4 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FILE-CONTENT-NAME"), (SubLObject)SubLObjectFactory.makeSymbol("FILE-CONTENT-TEXT"));
        $list5 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("_CSETF-FILE-CONTENT-NAME"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-FILE-CONTENT-TEXT"));
        $sym6$DEFAULT_STRUCT_PRINT_FUNCTION = SubLObjectFactory.makeSymbol("DEFAULT-STRUCT-PRINT-FUNCTION");
        $sym7$FILE_CONTENT_PRINT_FUNCTION_TRAMPOLINE = SubLObjectFactory.makeSymbol("FILE-CONTENT-PRINT-FUNCTION-TRAMPOLINE");
        $list8 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("FILE-CONTENT-P"));
        $sym9$FILE_CONTENT_NAME = SubLObjectFactory.makeSymbol("FILE-CONTENT-NAME");
        $sym10$_CSETF_FILE_CONTENT_NAME = SubLObjectFactory.makeSymbol("_CSETF-FILE-CONTENT-NAME");
        $sym11$FILE_CONTENT_TEXT = SubLObjectFactory.makeSymbol("FILE-CONTENT-TEXT");
        $sym12$_CSETF_FILE_CONTENT_TEXT = SubLObjectFactory.makeSymbol("_CSETF-FILE-CONTENT-TEXT");
        $kw13$NAME = SubLObjectFactory.makeKeyword("NAME");
        $kw14$TEXT = SubLObjectFactory.makeKeyword("TEXT");
        $str15$Invalid_slot__S_for_construction_ = SubLObjectFactory.makeString("Invalid slot ~S for construction function");
        $kw16$BEGIN = SubLObjectFactory.makeKeyword("BEGIN");
        $sym17$MAKE_FILE_CONTENT = SubLObjectFactory.makeSymbol("MAKE-FILE-CONTENT");
        $kw18$SLOT = SubLObjectFactory.makeKeyword("SLOT");
        $kw19$END = SubLObjectFactory.makeKeyword("END");
        $sym20$VISIT_DEFSTRUCT_OBJECT_FILE_CONTENT_METHOD = SubLObjectFactory.makeSymbol("VISIT-DEFSTRUCT-OBJECT-FILE-CONTENT-METHOD");
        $sym21$FILE_PARAGRAPH = SubLObjectFactory.makeSymbol("FILE-PARAGRAPH");
        $sym22$FILE_PARAGRAPH_P = SubLObjectFactory.makeSymbol("FILE-PARAGRAPH-P");
        $list23 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FILE-CONTEXT"), (SubLObject)SubLObjectFactory.makeSymbol("NUMBER"), (SubLObject)SubLObjectFactory.makeSymbol("CLASS"), (SubLObject)SubLObjectFactory.makeSymbol("SENTENCES"));
        $list24 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("FILE-CONTEXT"), (SubLObject)SubLObjectFactory.makeKeyword("NUMBER"), (SubLObject)SubLObjectFactory.makeKeyword("CLASS"), (SubLObject)SubLObjectFactory.makeKeyword("SENTENCES"));
        $list25 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FILE-PARAGRAPH-FILE-CONTEXT"), (SubLObject)SubLObjectFactory.makeSymbol("FILE-PARAGRAPH-NUMBER"), (SubLObject)SubLObjectFactory.makeSymbol("FILE-PARAGRAPH-CLASS"), (SubLObject)SubLObjectFactory.makeSymbol("FILE-PARAGRAPH-SENTENCES"));
        $list26 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("_CSETF-FILE-PARAGRAPH-FILE-CONTEXT"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-FILE-PARAGRAPH-NUMBER"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-FILE-PARAGRAPH-CLASS"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-FILE-PARAGRAPH-SENTENCES"));
        $sym27$PRINT_FILE_PARAGRAPH = SubLObjectFactory.makeSymbol("PRINT-FILE-PARAGRAPH");
        $sym28$FILE_PARAGRAPH_PRINT_FUNCTION_TRAMPOLINE = SubLObjectFactory.makeSymbol("FILE-PARAGRAPH-PRINT-FUNCTION-TRAMPOLINE");
        $list29 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("FILE-PARAGRAPH-P"));
        $sym30$FILE_PARAGRAPH_FILE_CONTEXT = SubLObjectFactory.makeSymbol("FILE-PARAGRAPH-FILE-CONTEXT");
        $sym31$_CSETF_FILE_PARAGRAPH_FILE_CONTEXT = SubLObjectFactory.makeSymbol("_CSETF-FILE-PARAGRAPH-FILE-CONTEXT");
        $sym32$FILE_PARAGRAPH_NUMBER = SubLObjectFactory.makeSymbol("FILE-PARAGRAPH-NUMBER");
        $sym33$_CSETF_FILE_PARAGRAPH_NUMBER = SubLObjectFactory.makeSymbol("_CSETF-FILE-PARAGRAPH-NUMBER");
        $sym34$FILE_PARAGRAPH_CLASS = SubLObjectFactory.makeSymbol("FILE-PARAGRAPH-CLASS");
        $sym35$_CSETF_FILE_PARAGRAPH_CLASS = SubLObjectFactory.makeSymbol("_CSETF-FILE-PARAGRAPH-CLASS");
        $sym36$FILE_PARAGRAPH_SENTENCES = SubLObjectFactory.makeSymbol("FILE-PARAGRAPH-SENTENCES");
        $sym37$_CSETF_FILE_PARAGRAPH_SENTENCES = SubLObjectFactory.makeSymbol("_CSETF-FILE-PARAGRAPH-SENTENCES");
        $kw38$FILE_CONTEXT = SubLObjectFactory.makeKeyword("FILE-CONTEXT");
        $kw39$NUMBER = SubLObjectFactory.makeKeyword("NUMBER");
        $kw40$CLASS = SubLObjectFactory.makeKeyword("CLASS");
        $kw41$SENTENCES = SubLObjectFactory.makeKeyword("SENTENCES");
        $sym42$MAKE_FILE_PARAGRAPH = SubLObjectFactory.makeSymbol("MAKE-FILE-PARAGRAPH");
        $sym43$VISIT_DEFSTRUCT_OBJECT_FILE_PARAGRAPH_METHOD = SubLObjectFactory.makeSymbol("VISIT-DEFSTRUCT-OBJECT-FILE-PARAGRAPH-METHOD");
        $str44$__FileP__D_class__S__ = SubLObjectFactory.makeString("#<FileP ~D class ~S~%");
        $str45$_ = SubLObjectFactory.makeString(" ");
        $str46$___FileP_ = SubLObjectFactory.makeString("~&:FileP>");
        $sym47$FILE_SENTENCE = SubLObjectFactory.makeSymbol("FILE-SENTENCE");
        $sym48$FILE_SENTENCE_P = SubLObjectFactory.makeSymbol("FILE-SENTENCE-P");
        $list49 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PARAGRAPH"), (SubLObject)SubLObjectFactory.makeSymbol("NUMBER"), (SubLObject)SubLObjectFactory.makeSymbol("TEXT"));
        $list50 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("PARAGRAPH"), (SubLObject)SubLObjectFactory.makeKeyword("NUMBER"), (SubLObject)SubLObjectFactory.makeKeyword("TEXT"));
        $list51 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FILE-SENTENCE-PARAGRAPH"), (SubLObject)SubLObjectFactory.makeSymbol("FILE-SENTENCE-NUMBER"), (SubLObject)SubLObjectFactory.makeSymbol("FILE-SENTENCE-TEXT"));
        $list52 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("_CSETF-FILE-SENTENCE-PARAGRAPH"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-FILE-SENTENCE-NUMBER"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-FILE-SENTENCE-TEXT"));
        $sym53$PRINT_FILE_SENTENCE = SubLObjectFactory.makeSymbol("PRINT-FILE-SENTENCE");
        $sym54$FILE_SENTENCE_PRINT_FUNCTION_TRAMPOLINE = SubLObjectFactory.makeSymbol("FILE-SENTENCE-PRINT-FUNCTION-TRAMPOLINE");
        $list55 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("FILE-SENTENCE-P"));
        $sym56$FILE_SENTENCE_PARAGRAPH = SubLObjectFactory.makeSymbol("FILE-SENTENCE-PARAGRAPH");
        $sym57$_CSETF_FILE_SENTENCE_PARAGRAPH = SubLObjectFactory.makeSymbol("_CSETF-FILE-SENTENCE-PARAGRAPH");
        $sym58$FILE_SENTENCE_NUMBER = SubLObjectFactory.makeSymbol("FILE-SENTENCE-NUMBER");
        $sym59$_CSETF_FILE_SENTENCE_NUMBER = SubLObjectFactory.makeSymbol("_CSETF-FILE-SENTENCE-NUMBER");
        $sym60$FILE_SENTENCE_TEXT = SubLObjectFactory.makeSymbol("FILE-SENTENCE-TEXT");
        $sym61$_CSETF_FILE_SENTENCE_TEXT = SubLObjectFactory.makeSymbol("_CSETF-FILE-SENTENCE-TEXT");
        $kw62$PARAGRAPH = SubLObjectFactory.makeKeyword("PARAGRAPH");
        $sym63$MAKE_FILE_SENTENCE = SubLObjectFactory.makeSymbol("MAKE-FILE-SENTENCE");
        $sym64$VISIT_DEFSTRUCT_OBJECT_FILE_SENTENCE_METHOD = SubLObjectFactory.makeSymbol("VISIT-DEFSTRUCT-OBJECT-FILE-SENTENCE-METHOD");
        $str65$__Sent__D = SubLObjectFactory.makeString("#<Sent ~D");
        $str66$of_P_D = SubLObjectFactory.makeString("of P~D");
        $str67$___S__ = SubLObjectFactory.makeString(": ~S:>");
        $kw68$INPUT = SubLObjectFactory.makeKeyword("INPUT");
        $str69$Unable_to_open__S = SubLObjectFactory.makeString("Unable to open ~S");
        $str70$anonymous = SubLObjectFactory.makeString("anonymous");
        $sym71$IS_RETURN_CHAR_ = SubLObjectFactory.makeSymbol("IS-RETURN-CHAR?");
        $sym72$CCONCATENATE = SubLObjectFactory.makeSymbol("CCONCATENATE");
        $kw73$IN_SENTENCE = SubLObjectFactory.makeKeyword("IN-SENTENCE");
        $kw74$POTENTIAL_END = SubLObjectFactory.makeKeyword("POTENTIAL-END");
        $str75$_ = SubLObjectFactory.makeString("~");
        $str76$_ = SubLObjectFactory.makeString(".");
        $list77 = ConsesLow.list((SubLObject)Characters.CHAR_tilde);
        $list78 = ConsesLow.list((SubLObject)Characters.CHAR_space, (SubLObject)Characters.CHAR_tab, (SubLObject)Characters.CHAR_newline, (SubLObject)Characters.CHAR_return);
    }
    
    public static final class $file_content_native extends SubLStructNative
    {
        public SubLObject $name;
        public SubLObject $text;
        private static final SubLStructDeclNative structDecl;
        
        public $file_content_native() {
            this.$name = (SubLObject)CommonSymbols.NIL;
            this.$text = (SubLObject)CommonSymbols.NIL;
        }
        
        public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$file_content_native.structDecl;
        }
        
        public SubLObject getField2() {
            return this.$name;
        }
        
        public SubLObject getField3() {
            return this.$text;
        }
        
        public SubLObject setField2(final SubLObject value) {
            return this.$name = value;
        }
        
        public SubLObject setField3(final SubLObject value) {
            return this.$text = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$file_content_native.class, rkf_ch_html_scanner.$sym0$FILE_CONTENT, rkf_ch_html_scanner.$sym1$FILE_CONTENT_P, rkf_ch_html_scanner.$list2, rkf_ch_html_scanner.$list3, new String[] { "$name", "$text" }, rkf_ch_html_scanner.$list4, rkf_ch_html_scanner.$list5, rkf_ch_html_scanner.$sym6$DEFAULT_STRUCT_PRINT_FUNCTION);
        }
    }
    
    public static final class $file_content_p$UnaryFunction extends UnaryFunction
    {
        public $file_content_p$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("FILE-CONTENT-P"));
        }
        
        public SubLObject processItem(final SubLObject arg1) {
            return rkf_ch_html_scanner.file_content_p(arg1);
        }
    }
    
    public static final class $file_paragraph_native extends SubLStructNative
    {
        public SubLObject $file_context;
        public SubLObject $number;
        public SubLObject $class;
        public SubLObject $sentences;
        private static final SubLStructDeclNative structDecl;
        
        public $file_paragraph_native() {
            this.$file_context = (SubLObject)CommonSymbols.NIL;
            this.$number = (SubLObject)CommonSymbols.NIL;
            this.$class = (SubLObject)CommonSymbols.NIL;
            this.$sentences = (SubLObject)CommonSymbols.NIL;
        }
        
        public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$file_paragraph_native.structDecl;
        }
        
        public SubLObject getField2() {
            return this.$file_context;
        }
        
        public SubLObject getField3() {
            return this.$number;
        }
        
        public SubLObject getField4() {
            return this.$class;
        }
        
        public SubLObject getField5() {
            return this.$sentences;
        }
        
        public SubLObject setField2(final SubLObject value) {
            return this.$file_context = value;
        }
        
        public SubLObject setField3(final SubLObject value) {
            return this.$number = value;
        }
        
        public SubLObject setField4(final SubLObject value) {
            return this.$class = value;
        }
        
        public SubLObject setField5(final SubLObject value) {
            return this.$sentences = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$file_paragraph_native.class, rkf_ch_html_scanner.$sym21$FILE_PARAGRAPH, rkf_ch_html_scanner.$sym22$FILE_PARAGRAPH_P, rkf_ch_html_scanner.$list23, rkf_ch_html_scanner.$list24, new String[] { "$file_context", "$number", "$class", "$sentences" }, rkf_ch_html_scanner.$list25, rkf_ch_html_scanner.$list26, rkf_ch_html_scanner.$sym27$PRINT_FILE_PARAGRAPH);
        }
    }
    
    public static final class $file_paragraph_p$UnaryFunction extends UnaryFunction
    {
        public $file_paragraph_p$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("FILE-PARAGRAPH-P"));
        }
        
        public SubLObject processItem(final SubLObject arg1) {
            return rkf_ch_html_scanner.file_paragraph_p(arg1);
        }
    }
    
    public static final class $file_sentence_native extends SubLStructNative
    {
        public SubLObject $paragraph;
        public SubLObject $number;
        public SubLObject $text;
        private static final SubLStructDeclNative structDecl;
        
        public $file_sentence_native() {
            this.$paragraph = (SubLObject)CommonSymbols.NIL;
            this.$number = (SubLObject)CommonSymbols.NIL;
            this.$text = (SubLObject)CommonSymbols.NIL;
        }
        
        public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$file_sentence_native.structDecl;
        }
        
        public SubLObject getField2() {
            return this.$paragraph;
        }
        
        public SubLObject getField3() {
            return this.$number;
        }
        
        public SubLObject getField4() {
            return this.$text;
        }
        
        public SubLObject setField2(final SubLObject value) {
            return this.$paragraph = value;
        }
        
        public SubLObject setField3(final SubLObject value) {
            return this.$number = value;
        }
        
        public SubLObject setField4(final SubLObject value) {
            return this.$text = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$file_sentence_native.class, rkf_ch_html_scanner.$sym47$FILE_SENTENCE, rkf_ch_html_scanner.$sym48$FILE_SENTENCE_P, rkf_ch_html_scanner.$list49, rkf_ch_html_scanner.$list50, new String[] { "$paragraph", "$number", "$text" }, rkf_ch_html_scanner.$list51, rkf_ch_html_scanner.$list52, rkf_ch_html_scanner.$sym53$PRINT_FILE_SENTENCE);
        }
    }
    
    public static final class $file_sentence_p$UnaryFunction extends UnaryFunction
    {
        public $file_sentence_p$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("FILE-SENTENCE-P"));
        }
        
        public SubLObject processItem(final SubLObject arg1) {
            return rkf_ch_html_scanner.file_sentence_p(arg1);
        }
    }
}

/*

	Total time: 215 ms
	
*/