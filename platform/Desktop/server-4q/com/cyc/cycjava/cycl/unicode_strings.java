package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.cycjava.cycl.cyc_testing.generic_testing;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class unicode_strings extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.unicode_strings";
    public static final String myFingerPrint = "a38923d9dc47c1b16cb82ad6b6a348dced2f87dcd7dd1ad0f0917dbbf2db8d2e";
    @SubLTranslatedFile.SubL(source = "cycl/unicode-strings.lisp", position = 1287L)
    private static SubLSymbol $max_unicode_value$;
    @SubLTranslatedFile.SubL(source = "cycl/unicode-strings.lisp", position = 1337L)
    public static SubLSymbol $dtp_unicode_char$;
    @SubLTranslatedFile.SubL(source = "cycl/unicode-strings.lisp", position = 2577L)
    public static SubLSymbol $dtp_unicode_string$;
    @SubLTranslatedFile.SubL(source = "cycl/unicode-strings.lisp", position = 9208L)
    private static SubLSymbol $default_non_ascii_placeholder_char$;
    @SubLTranslatedFile.SubL(source = "cycl/unicode-strings.lisp", position = 10145L)
    private static SubLSymbol $default_unicode_to_ascii_code_map$;
    @SubLTranslatedFile.SubL(source = "cycl/unicode-strings.lisp", position = 28183L)
    private static SubLSymbol $html_40_character_entity_table$;
    @SubLTranslatedFile.SubL(source = "cycl/unicode-strings.lisp", position = 34942L)
    private static SubLSymbol $cfasl_opcode_unicode_char$;
    @SubLTranslatedFile.SubL(source = "cycl/unicode-strings.lisp", position = 36476L)
    private static SubLSymbol $cfasl_opcode_unicode_string$;
    private static final SubLInteger $int0$1114111;
    private static final SubLSymbol $sym1$UNICODE_CHAR;
    private static final SubLSymbol $sym2$UNICODE_CHAR_P;
    private static final SubLList $list3;
    private static final SubLList $list4;
    private static final SubLList $list5;
    private static final SubLList $list6;
    private static final SubLSymbol $sym7$PRINT_UNICODE_CHAR;
    private static final SubLSymbol $sym8$UNICODE_CHAR_PRINT_FUNCTION_TRAMPOLINE;
    private static final SubLList $list9;
    private static final SubLSymbol $sym10$UNICODE_CHAR_UCHAR;
    private static final SubLSymbol $sym11$_CSETF_UNICODE_CHAR_UCHAR;
    private static final SubLSymbol $kw12$UCHAR;
    private static final SubLString $str13$Invalid_slot__S_for_construction_;
    private static final SubLSymbol $kw14$BEGIN;
    private static final SubLSymbol $sym15$MAKE_UNICODE_CHAR;
    private static final SubLSymbol $kw16$SLOT;
    private static final SubLSymbol $kw17$END;
    private static final SubLSymbol $sym18$VISIT_DEFSTRUCT_OBJECT_UNICODE_CHAR_METHOD;
    private static final SubLString $str19$_u_x;
    private static final SubLString $str20$_u0_x;
    private static final SubLSymbol $sym21$UNICODE_CHARACTER_P;
    private static final SubLSymbol $sym22$UNICODE_STRING;
    private static final SubLSymbol $sym23$UNICODE_STRING_P;
    private static final SubLList $list24;
    private static final SubLList $list25;
    private static final SubLList $list26;
    private static final SubLList $list27;
    private static final SubLSymbol $sym28$PRINT_UNICODE_STRING;
    private static final SubLSymbol $sym29$UNICODE_STRING_PRINT_FUNCTION_TRAMPOLINE;
    private static final SubLList $list30;
    private static final SubLSymbol $sym31$UNICODE_STRING_VECT;
    private static final SubLSymbol $sym32$_CSETF_UNICODE_STRING_VECT;
    private static final SubLSymbol $kw33$VECT;
    private static final SubLSymbol $sym34$MAKE_UNICODE_STRING;
    private static final SubLSymbol $sym35$VISIT_DEFSTRUCT_OBJECT_UNICODE_STRING_METHOD;
    private static final SubLString $str36$_u__a_;
    private static final SubLSymbol $sym37$UNICODE_VECTOR_STRING_P;
    private static final SubLInteger $int38$127;
    private static final SubLSymbol $kw39$HTML_ESCAPED_ASCII;
    private static final SubLSymbol $kw40$ESCAPED_PROBABLY_UTF8;
    private static final SubLSymbol $kw41$SUBL_STRING;
    private static final SubLSymbol $kw42$PROBABLY_UTF8;
    private static final SubLSymbol $kw43$UNK;
    private static final SubLInteger $int44$128;
    private static final SubLSymbol $kw45$OPEN;
    private static final SubLSymbol $kw46$START_UNICODE;
    private static final SubLSymbol $kw47$UNICODE_CHAR;
    private static final SubLSymbol $kw48$UNICDE_CHAR;
    private static final SubLSymbol $sym49$DISPLAY_VECTOR_STRING_P;
    private static final SubLSymbol $sym50$ASCII_CHAR_P;
    private static final SubLList $list51;
    private static final SubLString $str52$__;
    private static final SubLString $str53$__;
    private static final SubLString $str54$_u26_;
    private static final SubLInteger $int55$32;
    private static final SubLString $str56$0;
    private static final SubLString $str57$_u_A_;
    private static final SubLSymbol $sym58$UTF8_VECTOR_STRING_P;
    private static final SubLString $str59$Invalid_UTF_8_encoding_at__S_in__;
    private static final SubLInteger $int60$2047;
    private static final SubLInteger $int61$65535;
    private static final SubLInteger $int62$2097151;
    private static final SubLInteger $int63$67108863;
    private static final SubLString $str64$__;
    private static final SubLString $str65$_x_x_;
    private static final SubLString $str66$___;
    private static final SubLInteger $int67$192;
    private static final SubLInteger $int68$_6;
    private static final SubLInteger $int69$63;
    private static final SubLInteger $int70$224;
    private static final SubLInteger $int71$_12;
    private static final SubLInteger $int72$240;
    private static final SubLInteger $int73$_18;
    private static final SubLInteger $int74$248;
    private static final SubLInteger $int75$_24;
    private static final SubLInteger $int76$193;
    private static final SubLInteger $int77$245;
    private static final SubLSymbol $sym78$VECTORP;
    private static final SubLInteger $int79$31;
    private static final SubLInteger $int80$24;
    private static final SubLString $str81$__x;
    private static final SubLInteger $int82$38;
    private static final SubLSymbol $kw83$START_HTML_ESCAPE;
    private static final SubLInteger $int84$60;
    private static final SubLSymbol $kw85$INSIDE_TAG;
    private static final SubLInteger $int86$62;
    private static final SubLInteger $int87$35;
    private static final SubLSymbol $kw88$HTML_NUMERIC_ESCAPE_START;
    private static final SubLSymbol $kw89$ENTITY_ESCAPE;
    private static final SubLInteger $int90$120;
    private static final SubLSymbol $kw91$HTML_HEXADECIMAL_ESCAPE;
    private static final SubLInteger $int92$48;
    private static final SubLInteger $int93$57;
    private static final SubLSymbol $kw94$HTML_DECIMAL_ESCAPE;
    private static final SubLInteger $int95$59;
    private static final SubLSymbol $sym96$CODE_CHAR;
    private static final SubLInteger $int97$256;
    private static final SubLSymbol $sym98$__;
    private static final SubLSymbol $sym99$CHAR_CODE;
    private static final SubLString $str100$_S__code___S__is_not_a_valid_utf8;
    private static final SubLSymbol $sym101$STRINGP;
    private static final SubLObject $list102;
    private static final SubLInteger $int103$52;
    private static final SubLSymbol $sym104$CFASL_INPUT_UNICODE_CHAR;
    private static final SubLSymbol $sym105$CFASL_OUTPUT_OBJECT_UNICODE_CHAR_METHOD;
    private static final SubLString $str106$Invalid_unicode_character__expect;
    private static final SubLInteger $int107$53;
    private static final SubLSymbol $sym108$CFASL_INPUT_UNICODE_STRING;
    private static final SubLSymbol $sym109$CFASL_OUTPUT_OBJECT_UNICODE_STRING_METHOD;
    private static final SubLSymbol $sym110$HTML_ESCAPED_UTF8_STRING_TO_UTF8_STRING;
    private static final SubLSymbol $kw111$TEST;
    private static final SubLSymbol $kw112$OWNER;
    private static final SubLSymbol $kw113$CLASSES;
    private static final SubLSymbol $kw114$KB;
    private static final SubLSymbol $kw115$TINY;
    private static final SubLSymbol $kw116$WORKING_;
    private static final SubLList $list117;
    
    @SubLTranslatedFile.SubL(source = "cycl/unicode-strings.lisp", position = 1337L)
    public static SubLObject unicode_char_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        print_unicode_char(v_object, stream, (SubLObject)unicode_strings.ZERO_INTEGER);
        return (SubLObject)unicode_strings.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/unicode-strings.lisp", position = 1337L)
    public static SubLObject unicode_char_p(final SubLObject v_object) {
        return (SubLObject)((v_object.getClass() == $unicode_char_native.class) ? unicode_strings.T : unicode_strings.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/unicode-strings.lisp", position = 1337L)
    public static SubLObject unicode_char_uchar(final SubLObject v_object) {
        assert unicode_strings.NIL != unicode_char_p(v_object) : v_object;
        return v_object.getField2();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/unicode-strings.lisp", position = 1337L)
    public static SubLObject _csetf_unicode_char_uchar(final SubLObject v_object, final SubLObject value) {
        assert unicode_strings.NIL != unicode_char_p(v_object) : v_object;
        return v_object.setField2(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/unicode-strings.lisp", position = 1337L)
    public static SubLObject make_unicode_char(SubLObject arglist) {
        if (arglist == unicode_strings.UNPROVIDED) {
            arglist = (SubLObject)unicode_strings.NIL;
        }
        final SubLObject v_new = (SubLObject)new $unicode_char_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = (SubLObject)unicode_strings.NIL, next = arglist; unicode_strings.NIL != next; next = conses_high.cddr(next)) {
            current_arg = next.first();
            current_value = conses_high.cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql((SubLObject)unicode_strings.$kw12$UCHAR)) {
                _csetf_unicode_char_uchar(v_new, current_value);
            }
            else {
                Errors.error((SubLObject)unicode_strings.$str13$Invalid_slot__S_for_construction_, current_arg);
            }
        }
        return v_new;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/unicode-strings.lisp", position = 1337L)
    public static SubLObject visit_defstruct_unicode_char(final SubLObject obj, final SubLObject visitor_fn) {
        Functions.funcall(visitor_fn, obj, (SubLObject)unicode_strings.$kw14$BEGIN, (SubLObject)unicode_strings.$sym15$MAKE_UNICODE_CHAR, (SubLObject)unicode_strings.ONE_INTEGER);
        Functions.funcall(visitor_fn, obj, (SubLObject)unicode_strings.$kw16$SLOT, (SubLObject)unicode_strings.$kw12$UCHAR, unicode_char_uchar(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)unicode_strings.$kw17$END, (SubLObject)unicode_strings.$sym15$MAKE_UNICODE_CHAR, (SubLObject)unicode_strings.ONE_INTEGER);
        return obj;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/unicode-strings.lisp", position = 1337L)
    public static SubLObject visit_defstruct_object_unicode_char_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_unicode_char(obj, visitor_fn);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/unicode-strings.lisp", position = 1443L)
    public static SubLObject unicode_char_create(final SubLObject uchar) {
        SubLObject ch = (SubLObject)unicode_strings.ZERO_INTEGER;
        if (unicode_strings.NIL != unicode_character_p(uchar)) {
            ch = uchar;
        }
        else {
            if (!uchar.isChar()) {
                return (SubLObject)unicode_strings.NIL;
            }
            ch = Characters.char_code(uchar);
        }
        final SubLObject unicode_char_obj = make_unicode_char((SubLObject)unicode_strings.UNPROVIDED);
        _csetf_unicode_char_uchar(unicode_char_obj, ch);
        return unicode_char_obj;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/unicode-strings.lisp", position = 1884L)
    public static SubLObject print_unicode_char(final SubLObject v_object, final SubLObject stream, final SubLObject depth) {
        final SubLObject uchar = unicode_char_uchar(v_object);
        if (uchar.numG((SubLObject)unicode_strings.FIFTEEN_INTEGER)) {
            PrintLow.format(stream, (SubLObject)unicode_strings.$str19$_u_x, unicode_char_uchar(v_object));
        }
        else {
            PrintLow.format(stream, (SubLObject)unicode_strings.$str20$_u0_x, unicode_char_uchar(v_object));
        }
        return v_object;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/unicode-strings.lisp", position = 2198L)
    public static SubLObject unicode_char_get_char(final SubLObject uchar) {
        assert unicode_strings.NIL != unicode_char_p(uchar) : uchar;
        return unicode_char_uchar(uchar);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/unicode-strings.lisp", position = 2354L)
    public static SubLObject unicode_char_set_char(final SubLObject uchar, final SubLObject v_char) {
        assert unicode_strings.NIL != unicode_char_p(uchar) : uchar;
        assert unicode_strings.NIL != unicode_character_p(v_char) : v_char;
        _csetf_unicode_char_uchar(uchar, v_char);
        return uchar;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/unicode-strings.lisp", position = 2577L)
    public static SubLObject unicode_string_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        print_unicode_string(v_object, stream, (SubLObject)unicode_strings.ZERO_INTEGER);
        return (SubLObject)unicode_strings.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/unicode-strings.lisp", position = 2577L)
    public static SubLObject unicode_string_p(final SubLObject v_object) {
        return (SubLObject)((v_object.getClass() == $unicode_string_native.class) ? unicode_strings.T : unicode_strings.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/unicode-strings.lisp", position = 2577L)
    public static SubLObject unicode_string_vect(final SubLObject v_object) {
        assert unicode_strings.NIL != unicode_string_p(v_object) : v_object;
        return v_object.getField2();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/unicode-strings.lisp", position = 2577L)
    public static SubLObject _csetf_unicode_string_vect(final SubLObject v_object, final SubLObject value) {
        assert unicode_strings.NIL != unicode_string_p(v_object) : v_object;
        return v_object.setField2(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/unicode-strings.lisp", position = 2577L)
    public static SubLObject make_unicode_string(SubLObject arglist) {
        if (arglist == unicode_strings.UNPROVIDED) {
            arglist = (SubLObject)unicode_strings.NIL;
        }
        final SubLObject v_new = (SubLObject)new $unicode_string_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = (SubLObject)unicode_strings.NIL, next = arglist; unicode_strings.NIL != next; next = conses_high.cddr(next)) {
            current_arg = next.first();
            current_value = conses_high.cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql((SubLObject)unicode_strings.$kw33$VECT)) {
                _csetf_unicode_string_vect(v_new, current_value);
            }
            else {
                Errors.error((SubLObject)unicode_strings.$str13$Invalid_slot__S_for_construction_, current_arg);
            }
        }
        return v_new;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/unicode-strings.lisp", position = 2577L)
    public static SubLObject visit_defstruct_unicode_string(final SubLObject obj, final SubLObject visitor_fn) {
        Functions.funcall(visitor_fn, obj, (SubLObject)unicode_strings.$kw14$BEGIN, (SubLObject)unicode_strings.$sym34$MAKE_UNICODE_STRING, (SubLObject)unicode_strings.ONE_INTEGER);
        Functions.funcall(visitor_fn, obj, (SubLObject)unicode_strings.$kw16$SLOT, (SubLObject)unicode_strings.$kw33$VECT, unicode_string_vect(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)unicode_strings.$kw17$END, (SubLObject)unicode_strings.$sym34$MAKE_UNICODE_STRING, (SubLObject)unicode_strings.ONE_INTEGER);
        return obj;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/unicode-strings.lisp", position = 2577L)
    public static SubLObject visit_defstruct_object_unicode_string_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_unicode_string(obj, visitor_fn);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/unicode-strings.lisp", position = 2677L)
    public static SubLObject unicode_string_create(final SubLObject vect) {
        SubLObject v = (SubLObject)unicode_strings.NIL;
        if (unicode_strings.NIL != unicode_character_p(vect)) {
            v = Vectors.make_vector((SubLObject)unicode_strings.ONE_INTEGER, (SubLObject)unicode_strings.UNPROVIDED);
            Vectors.set_aref(vect, (SubLObject)unicode_strings.ZERO_INTEGER, vect);
        }
        else if (vect.isChar()) {
            v = Vectors.make_vector((SubLObject)unicode_strings.ONE_INTEGER, (SubLObject)unicode_strings.UNPROVIDED);
            Vectors.set_aref(v, (SubLObject)unicode_strings.ZERO_INTEGER, Characters.char_code(vect));
        }
        else if (unicode_strings.NIL != unicode_vector_string_p(vect)) {
            v = vect;
        }
        else {
            if (!vect.isString()) {
                return (SubLObject)unicode_strings.NIL;
            }
            final SubLObject univ = display_to_unicode_vector(vect);
            if (unicode_strings.NIL == univ) {
                return (SubLObject)unicode_strings.NIL;
            }
            v = univ;
        }
        final SubLObject unicode_string_obj = make_unicode_string((SubLObject)unicode_strings.UNPROVIDED);
        _csetf_unicode_string_vect(unicode_string_obj, v);
        return unicode_string_obj;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/unicode-strings.lisp", position = 3314L)
    public static SubLObject print_unicode_string(final SubLObject v_object, final SubLObject stream, final SubLObject depth) {
        PrintLow.format(stream, (SubLObject)unicode_strings.$str36$_u__a_, unicode_vector_to_display(unicode_string_vect(v_object)));
        return v_object;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/unicode-strings.lisp", position = 3532L)
    public static SubLObject unicode_string_get_vector(final SubLObject ustring) {
        assert unicode_strings.NIL != unicode_string_p(ustring) : ustring;
        return unicode_string_vect(ustring);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/unicode-strings.lisp", position = 3702L)
    public static SubLObject unicode_string_set_vector(final SubLObject ustring, final SubLObject vect) {
        assert unicode_strings.NIL != unicode_string_p(ustring) : ustring;
        assert unicode_strings.NIL != unicode_vector_string_p(vect) : vect;
        _csetf_unicode_string_vect(ustring, vect);
        return ustring;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/unicode-strings.lisp", position = 3943L)
    public static SubLObject unicode_vector_string_p(final SubLObject v_object) {
        if (!v_object.isVector()) {
            return (SubLObject)unicode_strings.NIL;
        }
        SubLObject cdotimes_end_var;
        SubLObject i;
        for (cdotimes_end_var = Sequences.length(v_object), i = (SubLObject)unicode_strings.NIL, i = (SubLObject)unicode_strings.ZERO_INTEGER; i.numL(cdotimes_end_var); i = Numbers.add(i, (SubLObject)unicode_strings.ONE_INTEGER)) {
            if (unicode_strings.NIL == unicode_character_p(Vectors.aref(v_object, i))) {
                return (SubLObject)unicode_strings.NIL;
            }
        }
        return (SubLObject)unicode_strings.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/unicode-strings.lisp", position = 4293L)
    public static SubLObject utf8_vector_string_p(final SubLObject v_object) {
        if (!v_object.isVector()) {
            return (SubLObject)unicode_strings.NIL;
        }
        SubLObject len;
        SubLObject index;
        SubLObject ulen;
        for (len = Sequences.length(v_object), index = (SubLObject)unicode_strings.ZERO_INTEGER; index.numL(len); index = Numbers.add(index, ulen)) {
            ulen = length_utf8_vector_codepoint(v_object, index);
            if (ulen.isNegative()) {
                return (SubLObject)unicode_strings.NIL;
            }
        }
        if (index.numG(len)) {
            return (SubLObject)unicode_strings.NIL;
        }
        return (SubLObject)unicode_strings.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/unicode-strings.lisp", position = 4669L)
    public static SubLObject ascii_string_p(final SubLObject v_object) {
        if (!v_object.isString()) {
            return (SubLObject)unicode_strings.NIL;
        }
        SubLObject cdotimes_end_var;
        SubLObject i;
        SubLObject v_char;
        for (cdotimes_end_var = Sequences.length(v_object), i = (SubLObject)unicode_strings.NIL, i = (SubLObject)unicode_strings.ZERO_INTEGER; i.numL(cdotimes_end_var); i = Numbers.add(i, (SubLObject)unicode_strings.ONE_INTEGER)) {
            v_char = Strings.sublisp_char(v_object, i);
            if (unicode_strings.NIL == ascii_char_p_int(v_char)) {
                return (SubLObject)unicode_strings.NIL;
            }
        }
        return (SubLObject)unicode_strings.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/unicode-strings.lisp", position = 4988L)
    public static SubLObject non_ascii_string_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(v_object.isString() && unicode_strings.NIL == ascii_string_p(v_object));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/unicode-strings.lisp", position = 5190L)
    public static SubLObject ascii_char_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(v_object.isChar() && unicode_strings.NIL != ascii_char_p_int(v_object));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/unicode-strings.lisp", position = 5401L)
    public static SubLObject non_ascii_char_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(v_object.isChar() && unicode_strings.NIL == ascii_char_p_int(v_object));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/unicode-strings.lisp", position = 5626L)
    public static SubLObject ascii_char_code_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(v_object.isInteger() && v_object.numLE((SubLObject)unicode_strings.$int38$127));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/unicode-strings.lisp", position = 5810L)
    public static SubLObject ascii_char_p_int(final SubLObject v_char) {
        return Numbers.numLE(Characters.char_code(v_char), (SubLObject)unicode_strings.$int38$127);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/unicode-strings.lisp", position = 5956L)
    public static SubLObject identify_string_type(final SubLObject string) {
        if (unicode_strings.NIL != ascii_string_p(string) && unicode_strings.NIL != string_utilities.html_escaped_string_p(string)) {
            return (SubLObject)unicode_strings.$kw39$HTML_ESCAPED_ASCII;
        }
        if (unicode_strings.NIL != non_ascii_string_p(string) && unicode_strings.NIL != string_utilities.html_escaped_string_p(string)) {
            return (SubLObject)unicode_strings.$kw40$ESCAPED_PROBABLY_UTF8;
        }
        if (unicode_strings.NIL != cycl_grammar.subl_string_p(string)) {
            return (SubLObject)unicode_strings.$kw41$SUBL_STRING;
        }
        if (unicode_strings.NIL != non_ascii_string_p(string)) {
            return (SubLObject)unicode_strings.$kw42$PROBABLY_UTF8;
        }
        return (SubLObject)unicode_strings.$kw43$UNK;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/unicode-strings.lisp", position = 6458L)
    public static SubLObject display_vector_is_ascii_p(final SubLObject v_object) {
        if (unicode_strings.NIL == display_vector_string_p(v_object)) {
            return (SubLObject)unicode_strings.NIL;
        }
        final SubLObject vector_var;
        final SubLObject unicode_vector = vector_var = display_to_unicode_vector(v_object);
        final SubLObject backwardP_var = (SubLObject)unicode_strings.NIL;
        SubLObject length;
        SubLObject v_iteration;
        SubLObject element_num;
        SubLObject elt;
        for (length = Sequences.length(vector_var), v_iteration = (SubLObject)unicode_strings.NIL, v_iteration = (SubLObject)unicode_strings.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)unicode_strings.ONE_INTEGER)) {
            element_num = ((unicode_strings.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)unicode_strings.ONE_INTEGER) : v_iteration);
            elt = Vectors.aref(vector_var, element_num);
            if (elt.numGE((SubLObject)unicode_strings.$int44$128)) {
                return (SubLObject)unicode_strings.NIL;
            }
        }
        return (SubLObject)unicode_strings.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/unicode-strings.lisp", position = 6759L)
    public static SubLObject display_vector_string_p(final SubLObject v_object) {
        if (!v_object.isString()) {
            return (SubLObject)unicode_strings.NIL;
        }
        SubLObject state = (SubLObject)unicode_strings.$kw45$OPEN;
        SubLObject ch = (SubLObject)unicode_strings.NIL;
        SubLObject count = (SubLObject)unicode_strings.ZERO_INTEGER;
        SubLObject uvalue = (SubLObject)unicode_strings.ZERO_INTEGER;
        SubLObject cdotimes_end_var;
        SubLObject i;
        SubLObject pcase_var;
        SubLObject pcase_var_$1;
        SubLObject pcase_var_$2;
        for (cdotimes_end_var = Sequences.length(v_object), i = (SubLObject)unicode_strings.NIL, i = (SubLObject)unicode_strings.ZERO_INTEGER; i.numL(cdotimes_end_var); i = Numbers.add(i, (SubLObject)unicode_strings.ONE_INTEGER)) {
            ch = Vectors.aref(v_object, i);
            pcase_var = state;
            if (pcase_var.eql((SubLObject)unicode_strings.$kw45$OPEN)) {
                pcase_var_$1 = ch;
                if (pcase_var_$1.eql((SubLObject)Characters.CHAR_ampersand)) {
                    state = (SubLObject)unicode_strings.$kw46$START_UNICODE;
                }
            }
            else if (pcase_var.eql((SubLObject)unicode_strings.$kw46$START_UNICODE)) {
                pcase_var_$2 = ch;
                if (pcase_var_$2.eql((SubLObject)Characters.CHAR_u) || pcase_var_$2.eql((SubLObject)Characters.CHAR_U)) {
                    state = (SubLObject)unicode_strings.$kw47$UNICODE_CHAR;
                    count = (SubLObject)unicode_strings.ZERO_INTEGER;
                    uvalue = (SubLObject)unicode_strings.ZERO_INTEGER;
                }
                else {
                    state = (SubLObject)unicode_strings.$kw45$OPEN;
                }
            }
            else if (pcase_var.eql((SubLObject)unicode_strings.$kw47$UNICODE_CHAR)) {
                if (ch.eql((SubLObject)Characters.CHAR_semicolon)) {
                    state = (SubLObject)unicode_strings.$kw45$OPEN;
                    if (unicode_strings.NIL == unicode_character_p(uvalue) || !count.numG((SubLObject)unicode_strings.ONE_INTEGER) || !count.numL((SubLObject)unicode_strings.SEVEN_INTEGER)) {
                        return (SubLObject)unicode_strings.NIL;
                    }
                }
                else if (unicode_strings.NIL == string_utilities.hex_char_p(ch)) {
                    return (SubLObject)unicode_strings.NIL;
                }
            }
            count = Numbers.add(count, (SubLObject)unicode_strings.ONE_INTEGER);
        }
        pcase_var = state;
        if (pcase_var.eql((SubLObject)unicode_strings.$kw47$UNICODE_CHAR) || pcase_var.eql((SubLObject)unicode_strings.$kw46$START_UNICODE)) {
            return (SubLObject)unicode_strings.NIL;
        }
        return (SubLObject)unicode_strings.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/unicode-strings.lisp", position = 7812L)
    public static SubLObject display_to_unicode_vector(final SubLObject v_object) {
        if (!v_object.isString()) {
            return (SubLObject)unicode_strings.NIL;
        }
        SubLObject state = (SubLObject)unicode_strings.$kw45$OPEN;
        SubLObject count = (SubLObject)unicode_strings.ZERO_INTEGER;
        SubLObject uvalue = (SubLObject)unicode_strings.ZERO_INTEGER;
        SubLObject retval = (SubLObject)unicode_strings.NIL;
        SubLObject elts = (SubLObject)unicode_strings.ZERO_INTEGER;
        SubLObject end_var_$3;
        SubLObject end_var;
        SubLObject i;
        SubLObject ch;
        SubLObject pcase_var;
        SubLObject pcase_var_$4;
        SubLObject pcase_var_$5;
        for (end_var = (end_var_$3 = Sequences.length(v_object)), i = (SubLObject)unicode_strings.NIL, i = (SubLObject)unicode_strings.ZERO_INTEGER; !i.numGE(end_var_$3); i = number_utilities.f_1X(i)) {
            ch = Strings.sublisp_char(v_object, i);
            pcase_var = state;
            if (pcase_var.eql((SubLObject)unicode_strings.$kw45$OPEN)) {
                pcase_var_$4 = ch;
                if (pcase_var_$4.eql((SubLObject)Characters.CHAR_ampersand)) {
                    state = (SubLObject)unicode_strings.$kw46$START_UNICODE;
                }
                else if (!pcase_var_$4.eql((SubLObject)Characters.CHAR_backslash)) {
                    retval = (SubLObject)ConsesLow.cons(Characters.char_code(ch), retval);
                    elts = Numbers.add(elts, (SubLObject)unicode_strings.ONE_INTEGER);
                }
            }
            else if (pcase_var.eql((SubLObject)unicode_strings.$kw46$START_UNICODE)) {
                pcase_var_$5 = ch;
                if (pcase_var_$5.eql((SubLObject)Characters.CHAR_u) || pcase_var_$5.eql((SubLObject)Characters.CHAR_U)) {
                    state = (SubLObject)unicode_strings.$kw47$UNICODE_CHAR;
                    count = (SubLObject)unicode_strings.ZERO_INTEGER;
                    uvalue = (SubLObject)unicode_strings.ZERO_INTEGER;
                }
                else {
                    state = (SubLObject)unicode_strings.$kw45$OPEN;
                    retval = (SubLObject)ConsesLow.cons(Characters.char_code((SubLObject)Characters.CHAR_ampersand), retval);
                    retval = (SubLObject)ConsesLow.cons(Characters.char_code(ch), retval);
                    elts = Numbers.add(elts, (SubLObject)unicode_strings.TWO_INTEGER);
                }
            }
            else if (pcase_var.eql((SubLObject)unicode_strings.$kw47$UNICODE_CHAR)) {
                if (ch.eql((SubLObject)Characters.CHAR_semicolon)) {
                    state = (SubLObject)unicode_strings.$kw45$OPEN;
                    if (unicode_strings.NIL == unicode_character_p(uvalue) || !count.numG((SubLObject)unicode_strings.ONE_INTEGER) || !count.numL((SubLObject)unicode_strings.SEVEN_INTEGER)) {
                        return (SubLObject)unicode_strings.NIL;
                    }
                    retval = (SubLObject)ConsesLow.cons(uvalue, retval);
                    elts = Numbers.add(elts, (SubLObject)unicode_strings.ONE_INTEGER);
                }
                else {
                    if (unicode_strings.NIL == string_utilities.hex_char_p(ch)) {
                        return (SubLObject)unicode_strings.NIL;
                    }
                    uvalue = Numbers.add(Numbers.ash(uvalue, (SubLObject)unicode_strings.FOUR_INTEGER), string_utilities.hex_char_value(ch));
                }
                count = Numbers.add(count, (SubLObject)unicode_strings.ONE_INTEGER);
            }
        }
        final SubLObject pcase_var2 = state;
        if (pcase_var2.eql((SubLObject)unicode_strings.$kw48$UNICDE_CHAR) || pcase_var2.eql((SubLObject)unicode_strings.$kw46$START_UNICODE)) {
            return (SubLObject)unicode_strings.NIL;
        }
        return element_vector(Sequences.nreverse(retval), elts);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/unicode-strings.lisp", position = 9271L)
    public static SubLObject display_to_subl_string(final SubLObject display, SubLObject placeholder_char, SubLObject subst_alist) {
        if (placeholder_char == unicode_strings.UNPROVIDED) {
            placeholder_char = unicode_strings.$default_non_ascii_placeholder_char$.getGlobalValue();
        }
        if (subst_alist == unicode_strings.UNPROVIDED) {
            subst_alist = unicode_strings.$default_unicode_to_ascii_code_map$.getDynamicValue();
        }
        assert unicode_strings.NIL != display_vector_string_p(display) : display;
        assert unicode_strings.NIL != ascii_char_p(placeholder_char) : placeholder_char;
        final SubLObject unicode_vector = display_to_unicode_vector(display);
        final SubLObject length = Sequences.length(unicode_vector);
        final SubLObject string = Strings.make_string(length, placeholder_char);
        final SubLObject vector_var = unicode_vector;
        final SubLObject backwardP_var = (SubLObject)unicode_strings.NIL;
        SubLObject length_$6;
        SubLObject v_iteration;
        SubLObject index;
        SubLObject code;
        for (length_$6 = Sequences.length(vector_var), v_iteration = (SubLObject)unicode_strings.NIL, v_iteration = (SubLObject)unicode_strings.ZERO_INTEGER; v_iteration.numL(length_$6); v_iteration = Numbers.add(v_iteration, (SubLObject)unicode_strings.ONE_INTEGER)) {
            index = ((unicode_strings.NIL != backwardP_var) ? Numbers.subtract(length_$6, v_iteration, (SubLObject)unicode_strings.ONE_INTEGER) : v_iteration);
            code = Vectors.aref(vector_var, index);
            if (code.numGE((SubLObject)unicode_strings.$int44$128) && unicode_strings.NIL != list_utilities.alist_lookup(subst_alist, code, (SubLObject)unicode_strings.EQ, (SubLObject)unicode_strings.NIL)) {
                Strings.set_char(string, index, Characters.code_char(list_utilities.alist_lookup(subst_alist, code, (SubLObject)unicode_strings.EQ, (SubLObject)unicode_strings.NIL)));
            }
            else if (code.numL((SubLObject)unicode_strings.$int44$128)) {
                Strings.set_char(string, index, Characters.code_char(code));
            }
        }
        return string;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/unicode-strings.lisp", position = 12189L)
    public static SubLObject unicode_vector_to_display(final SubLObject ucode) {
        SubLObject retval = (SubLObject)unicode_strings.NIL;
        SubLObject stream = (SubLObject)unicode_strings.NIL;
        try {
            stream = streams_high.make_private_string_output_stream();
            final SubLObject backwardP_var = (SubLObject)unicode_strings.NIL;
            SubLObject length;
            SubLObject v_iteration;
            SubLObject element_num;
            SubLObject code_point;
            SubLObject hex;
            for (length = Sequences.length(ucode), v_iteration = (SubLObject)unicode_strings.NIL, v_iteration = (SubLObject)unicode_strings.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)unicode_strings.ONE_INTEGER)) {
                element_num = ((unicode_strings.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)unicode_strings.ONE_INTEGER) : v_iteration);
                code_point = Vectors.aref(ucode, element_num);
                if (code_point.eql(Characters.char_code((SubLObject)Characters.CHAR_quotation))) {
                    print_high.princ((SubLObject)unicode_strings.$str52$__, stream);
                }
                else if (code_point.eql(Characters.char_code((SubLObject)Characters.CHAR_backslash))) {
                    print_high.princ((SubLObject)unicode_strings.$str53$__, stream);
                }
                else if (code_point.eql(Characters.char_code((SubLObject)Characters.CHAR_ampersand))) {
                    print_high.princ((SubLObject)unicode_strings.$str54$_u26_, stream);
                }
                else if (code_point.numGE((SubLObject)unicode_strings.$int55$32) && code_point.numLE((SubLObject)unicode_strings.$int38$127)) {
                    print_high.princ(Strings.make_string((SubLObject)unicode_strings.ONE_INTEGER, Characters.code_char(code_point)), stream);
                }
                else {
                    hex = Strings.string_upcase(number_utilities.convert_to_hexadecimal(code_point), (SubLObject)unicode_strings.UNPROVIDED, (SubLObject)unicode_strings.UNPROVIDED);
                    if (Sequences.length(hex).eql((SubLObject)unicode_strings.ONE_INTEGER)) {
                        hex = Sequences.cconcatenate((SubLObject)unicode_strings.$str56$0, hex);
                    }
                    PrintLow.format(stream, (SubLObject)unicode_strings.$str57$_u_A_, hex);
                }
            }
            retval = streams_high.get_output_stream_string(stream);
        }
        finally {
            final SubLObject _prev_bind_0 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
            try {
                Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)unicode_strings.T);
                final SubLObject _values = Values.getValuesAsVector();
                streams_high.close(stream, (SubLObject)unicode_strings.UNPROVIDED);
                Values.restoreValuesFromVector(_values);
            }
            finally {
                Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, _prev_bind_0);
            }
        }
        return retval;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/unicode-strings.lisp", position = 12999L)
    public static SubLObject element_vector(final SubLObject list, final SubLObject elts) {
        final SubLObject vect = Vectors.make_vector(elts, (SubLObject)unicode_strings.UNPROVIDED);
        SubLObject i = (SubLObject)unicode_strings.ZERO_INTEGER;
        SubLObject cdolist_list_var = list;
        SubLObject elt = (SubLObject)unicode_strings.NIL;
        elt = cdolist_list_var.first();
        while (unicode_strings.NIL != cdolist_list_var) {
            Vectors.set_aref(vect, i, elt);
            i = Numbers.add(i, (SubLObject)unicode_strings.ONE_INTEGER);
            cdolist_list_var = cdolist_list_var.rest();
            elt = cdolist_list_var.first();
        }
        return vect;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/unicode-strings.lisp", position = 13218L)
    public static SubLObject unicode_vector_to_utf8_vector(final SubLObject ucode, SubLObject start, SubLObject end) {
        if (start == unicode_strings.UNPROVIDED) {
            start = (SubLObject)unicode_strings.ZERO_INTEGER;
        }
        if (end == unicode_strings.UNPROVIDED) {
            end = (SubLObject)unicode_strings.NIL;
        }
        assert unicode_strings.NIL != unicode_vector_string_p(ucode) : ucode;
        if (unicode_strings.NIL == end) {
            end = Numbers.subtract(Sequences.length(ucode), (SubLObject)unicode_strings.ONE_INTEGER);
        }
        SubLObject utf8_len = (SubLObject)unicode_strings.ZERO_INTEGER;
        SubLObject utf8_str = (SubLObject)unicode_strings.NIL;
        SubLObject offset = (SubLObject)unicode_strings.ZERO_INTEGER;
        SubLObject elt;
        for (SubLObject ucode_offset = start; ucode_offset.numLE(end); ucode_offset = Numbers.add(ucode_offset, (SubLObject)unicode_strings.ONE_INTEGER), utf8_len = Numbers.add(utf8_len, number_utf8_bytes(elt))) {
            elt = Vectors.aref(ucode, ucode_offset);
        }
        utf8_str = Vectors.make_vector(utf8_len, (SubLObject)unicode_strings.UNPROVIDED);
        for (SubLObject ucode_offset = start; ucode_offset.numLE(end); ucode_offset = Numbers.add(ucode_offset, (SubLObject)unicode_strings.ONE_INTEGER), offset = to_utc8_vector_internal(utf8_str, offset, elt)) {
            elt = Vectors.aref(ucode, ucode_offset);
        }
        return utf8_str;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/unicode-strings.lisp", position = 13945L)
    public static SubLObject utf8_vector_to_unicode_vector(final SubLObject utf) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert unicode_strings.NIL != utf8_vector_string_p(utf) : utf;
        final SubLObject len = Sequences.length(utf);
        SubLObject index = (SubLObject)unicode_strings.ZERO_INTEGER;
        SubLObject number_ucode_elts = (SubLObject)unicode_strings.ZERO_INTEGER;
        SubLObject elt = (SubLObject)unicode_strings.ZERO_INTEGER;
        SubLObject unicode_vector = (SubLObject)unicode_strings.NIL;
        while (index.numL(len)) {
            final SubLObject ulen = length_utf8_vector_codepoint(utf, index);
            if (unicode_strings.MINUS_ONE_INTEGER.eql(ulen)) {
                Errors.error((SubLObject)unicode_strings.$str59$Invalid_UTF_8_encoding_at__S_in__, index, utf);
            }
            number_ucode_elts = Numbers.add(number_ucode_elts, (SubLObject)unicode_strings.ONE_INTEGER);
            index = Numbers.add(index, ulen);
        }
        unicode_vector = Vectors.make_vector(number_ucode_elts, (SubLObject)unicode_strings.UNPROVIDED);
        index = (SubLObject)unicode_strings.ZERO_INTEGER;
        while (index.numL(len)) {
            thread.resetMultipleValues();
            final SubLObject value = get_unicode_char_at_offset(utf, index);
            final SubLObject next_offset = thread.secondMultipleValue();
            final SubLObject len_elt = thread.thirdMultipleValue();
            thread.resetMultipleValues();
            index = next_offset;
            Vectors.set_aref(unicode_vector, elt, value);
            elt = Numbers.add(elt, (SubLObject)unicode_strings.ONE_INTEGER);
        }
        return unicode_vector;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/unicode-strings.lisp", position = 14734L)
    public static SubLObject unicode_char_code(final SubLObject uchar) {
        assert unicode_strings.NIL != unicode_char_p(uchar) : uchar;
        return unicode_char_uchar(uchar);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/unicode-strings.lisp", position = 14889L)
    public static SubLObject unicode_code_char(final SubLObject uchar) {
        assert unicode_strings.NIL != unicode_character_p(uchar) : uchar;
        return unicode_char_create(uchar);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/unicode-strings.lisp", position = 15050L)
    public static SubLObject unicode_character_p(final SubLObject uchar) {
        if (!uchar.isInteger()) {
            return (SubLObject)unicode_strings.NIL;
        }
        if (uchar.isNegative()) {
            return (SubLObject)unicode_strings.NIL;
        }
        return unicode_subsets.unicode_isdefined(uchar);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/unicode-strings.lisp", position = 15248L)
    public static SubLObject number_utf8_bytes(final SubLObject uchar) {
        assert unicode_strings.NIL != unicode_character_p(uchar) : uchar;
        if (uchar.numLE((SubLObject)unicode_strings.$int38$127)) {
            return (SubLObject)unicode_strings.ONE_INTEGER;
        }
        if (uchar.numLE((SubLObject)unicode_strings.$int60$2047)) {
            return (SubLObject)unicode_strings.TWO_INTEGER;
        }
        if (uchar.numLE((SubLObject)unicode_strings.$int61$65535)) {
            return (SubLObject)unicode_strings.THREE_INTEGER;
        }
        if (uchar.numLE((SubLObject)unicode_strings.$int62$2097151)) {
            return (SubLObject)unicode_strings.FOUR_INTEGER;
        }
        if (uchar.numLE((SubLObject)unicode_strings.$int63$67108863)) {
            return (SubLObject)unicode_strings.FIVE_INTEGER;
        }
        return (SubLObject)unicode_strings.SIX_INTEGER;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/unicode-strings.lisp", position = 15590L)
    public static SubLObject to_utf8_vector(final SubLObject uchar) {
        assert unicode_strings.NIL != unicode_character_p(uchar) : uchar;
        final SubLObject vect = Vectors.make_vector(number_utf8_bytes(uchar), (SubLObject)unicode_strings.UNPROVIDED);
        to_utc8_vector_internal(vect, (SubLObject)unicode_strings.ZERO_INTEGER, uchar);
        return vect;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/unicode-strings.lisp", position = 15832L)
    public static SubLObject print_utf_hex_list(final SubLObject uvect) {
        PrintLow.format((SubLObject)unicode_strings.T, (SubLObject)unicode_strings.$str64$__);
        SubLObject cdotimes_end_var;
        SubLObject i;
        for (cdotimes_end_var = Sequences.length(uvect), i = (SubLObject)unicode_strings.NIL, i = (SubLObject)unicode_strings.ZERO_INTEGER; i.numL(cdotimes_end_var); i = Numbers.add(i, (SubLObject)unicode_strings.ONE_INTEGER)) {
            PrintLow.format((SubLObject)unicode_strings.T, (SubLObject)unicode_strings.$str65$_x_x_, Vectors.aref(uvect, i));
        }
        PrintLow.format((SubLObject)unicode_strings.T, (SubLObject)unicode_strings.$str66$___);
        return (SubLObject)unicode_strings.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/unicode-strings.lisp", position = 16049L)
    public static SubLObject to_utc8_vector_internal(final SubLObject char_vector, final SubLObject offset, final SubLObject uchar) {
        if (uchar.numLE((SubLObject)unicode_strings.$int38$127)) {
            Vectors.set_aref(char_vector, offset, uchar);
            return Numbers.add(offset, (SubLObject)unicode_strings.ONE_INTEGER);
        }
        if (uchar.numLE((SubLObject)unicode_strings.$int60$2047)) {
            Vectors.set_aref(char_vector, offset, Numbers.logior((SubLObject)unicode_strings.$int67$192, Numbers.ash(uchar, (SubLObject)unicode_strings.$int68$_6)));
            Vectors.set_aref(char_vector, Numbers.add(offset, (SubLObject)unicode_strings.ONE_INTEGER), Numbers.logior((SubLObject)unicode_strings.$int44$128, Numbers.logand(uchar, (SubLObject)unicode_strings.$int69$63)));
            return Numbers.add(offset, (SubLObject)unicode_strings.TWO_INTEGER);
        }
        if (uchar.numLE((SubLObject)unicode_strings.$int61$65535)) {
            Vectors.set_aref(char_vector, offset, Numbers.logior((SubLObject)unicode_strings.$int70$224, Numbers.ash(uchar, (SubLObject)unicode_strings.$int71$_12)));
            Vectors.set_aref(char_vector, Numbers.add(offset, (SubLObject)unicode_strings.ONE_INTEGER), Numbers.logior((SubLObject)unicode_strings.$int44$128, Numbers.logand(Numbers.ash(uchar, (SubLObject)unicode_strings.$int68$_6), (SubLObject)unicode_strings.$int69$63)));
            Vectors.set_aref(char_vector, Numbers.add(offset, (SubLObject)unicode_strings.TWO_INTEGER), Numbers.logior((SubLObject)unicode_strings.$int44$128, Numbers.logand(uchar, (SubLObject)unicode_strings.$int69$63)));
            return Numbers.add(offset, (SubLObject)unicode_strings.THREE_INTEGER);
        }
        if (uchar.numLE((SubLObject)unicode_strings.$int62$2097151)) {
            Vectors.set_aref(char_vector, offset, Numbers.logior((SubLObject)unicode_strings.$int72$240, Numbers.ash(uchar, (SubLObject)unicode_strings.$int73$_18)));
            Vectors.set_aref(char_vector, Numbers.add(offset, (SubLObject)unicode_strings.ONE_INTEGER), Numbers.logior((SubLObject)unicode_strings.$int44$128, Numbers.logand(Numbers.ash(uchar, (SubLObject)unicode_strings.$int71$_12), (SubLObject)unicode_strings.$int69$63)));
            Vectors.set_aref(char_vector, Numbers.add(offset, (SubLObject)unicode_strings.TWO_INTEGER), Numbers.logior((SubLObject)unicode_strings.$int44$128, Numbers.logand(Numbers.ash(uchar, (SubLObject)unicode_strings.$int68$_6), (SubLObject)unicode_strings.$int69$63)));
            Vectors.set_aref(char_vector, Numbers.add(offset, (SubLObject)unicode_strings.THREE_INTEGER), Numbers.logior((SubLObject)unicode_strings.$int44$128, Numbers.logand(uchar, (SubLObject)unicode_strings.$int69$63)));
            return Numbers.add(offset, (SubLObject)unicode_strings.FOUR_INTEGER);
        }
        if (uchar.numLE((SubLObject)unicode_strings.$int63$67108863)) {
            Vectors.set_aref(char_vector, offset, Numbers.logior((SubLObject)unicode_strings.$int74$248, Numbers.ash(uchar, (SubLObject)unicode_strings.$int75$_24)));
            Vectors.set_aref(char_vector, Numbers.add(offset, (SubLObject)unicode_strings.ONE_INTEGER), Numbers.logior((SubLObject)unicode_strings.$int44$128, Numbers.logand(Numbers.ash(uchar, (SubLObject)unicode_strings.$int73$_18), (SubLObject)unicode_strings.$int69$63)));
            Vectors.set_aref(char_vector, Numbers.add(offset, (SubLObject)unicode_strings.TWO_INTEGER), Numbers.logior((SubLObject)unicode_strings.$int44$128, Numbers.logand(Numbers.ash(uchar, (SubLObject)unicode_strings.$int71$_12), (SubLObject)unicode_strings.$int69$63)));
            Vectors.set_aref(char_vector, Numbers.add(offset, (SubLObject)unicode_strings.THREE_INTEGER), Numbers.logior((SubLObject)unicode_strings.$int44$128, Numbers.logand(Numbers.ash(uchar, (SubLObject)unicode_strings.$int68$_6), (SubLObject)unicode_strings.$int69$63)));
            Vectors.set_aref(char_vector, Numbers.add(offset, (SubLObject)unicode_strings.FOUR_INTEGER), Numbers.logior((SubLObject)unicode_strings.$int44$128, Numbers.logand(uchar, (SubLObject)unicode_strings.$int69$63)));
            return Numbers.add(offset, (SubLObject)unicode_strings.FIVE_INTEGER);
        }
        return Numbers.add(offset, (SubLObject)unicode_strings.ONE_INTEGER);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/unicode-strings.lisp", position = 17594L)
    public static SubLObject length_utf8_vector_codepoint(final SubLObject char_vector, final SubLObject offset) {
        if (!char_vector.isVector()) {
            return (SubLObject)unicode_strings.MINUS_ONE_INTEGER;
        }
        final SubLObject len = Sequences.length(char_vector);
        SubLObject ulen = (SubLObject)unicode_strings.ZERO_INTEGER;
        if (offset.numGE(len) || offset.isNegative()) {
            return (SubLObject)unicode_strings.MINUS_ONE_INTEGER;
        }
        final SubLObject first_byte = Vectors.aref(char_vector, offset);
        ulen = length_utf8_from_first_byte(first_byte);
        if (ulen.isNegative()) {
            return ulen;
        }
        if (Numbers.add(offset, ulen).numG(len)) {
            return (SubLObject)unicode_strings.MINUS_ONE_INTEGER;
        }
        SubLObject cdotimes_end_var;
        SubLObject i;
        SubLObject charcode;
        SubLObject logand;
        for (cdotimes_end_var = Numbers.add(ulen, (SubLObject)unicode_strings.MINUS_ONE_INTEGER), i = (SubLObject)unicode_strings.NIL, i = (SubLObject)unicode_strings.ZERO_INTEGER; i.numL(cdotimes_end_var); i = Numbers.add(i, (SubLObject)unicode_strings.ONE_INTEGER)) {
            charcode = Vectors.aref(char_vector, Numbers.add(offset, (SubLObject)unicode_strings.ONE_INTEGER, i));
            logand = Numbers.logand((SubLObject)unicode_strings.$int67$192, charcode);
            if (!logand.numE((SubLObject)unicode_strings.$int44$128)) {
                return (SubLObject)unicode_strings.MINUS_ONE_INTEGER;
            }
        }
        return ulen;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/unicode-strings.lisp", position = 18273L)
    public static SubLObject length_utf8_from_first_byte(final SubLObject first_byte) {
        if (unicode_strings.NIL == number_utilities.bytep(first_byte)) {
            return (SubLObject)unicode_strings.MINUS_ONE_INTEGER;
        }
        if (Numbers.logand((SubLObject)unicode_strings.$int44$128, first_byte).numE((SubLObject)unicode_strings.ZERO_INTEGER)) {
            return (SubLObject)unicode_strings.ONE_INTEGER;
        }
        if (Numbers.logand((SubLObject)unicode_strings.$int70$224, first_byte).numE((SubLObject)unicode_strings.$int67$192)) {
            return (SubLObject)(first_byte.numG((SubLObject)unicode_strings.$int76$193) ? unicode_strings.TWO_INTEGER : unicode_strings.MINUS_ONE_INTEGER);
        }
        if (Numbers.logand((SubLObject)unicode_strings.$int72$240, first_byte).numE((SubLObject)unicode_strings.$int70$224)) {
            return (SubLObject)unicode_strings.THREE_INTEGER;
        }
        if (Numbers.logand((SubLObject)unicode_strings.$int74$248, first_byte).numE((SubLObject)unicode_strings.$int72$240)) {
            return (SubLObject)(first_byte.numL((SubLObject)unicode_strings.$int77$245) ? unicode_strings.FOUR_INTEGER : unicode_strings.MINUS_ONE_INTEGER);
        }
        return (SubLObject)unicode_strings.MINUS_ONE_INTEGER;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/unicode-strings.lisp", position = 18726L)
    public static SubLObject utf8_vector_is_ascii_string_p(final SubLObject char_vector, SubLObject offset, SubLObject end) {
        if (offset == unicode_strings.UNPROVIDED) {
            offset = (SubLObject)unicode_strings.ZERO_INTEGER;
        }
        if (end == unicode_strings.UNPROVIDED) {
            end = Numbers.subtract(Sequences.length(char_vector), (SubLObject)unicode_strings.ONE_INTEGER);
        }
        SubLObject cdotimes_end_var;
        SubLObject i;
        for (cdotimes_end_var = Numbers.add(Numbers.subtract(end, offset), (SubLObject)unicode_strings.ONE_INTEGER), i = (SubLObject)unicode_strings.NIL, i = (SubLObject)unicode_strings.ZERO_INTEGER; i.numL(cdotimes_end_var); i = Numbers.add(i, (SubLObject)unicode_strings.ONE_INTEGER)) {
            if (unicode_strings.NIL == utf8_char_is_ascii_p(char_vector, Numbers.add(offset, i))) {
                return (SubLObject)unicode_strings.NIL;
            }
        }
        return (SubLObject)unicode_strings.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/unicode-strings.lisp", position = 19020L)
    public static SubLObject utf8_char_is_ascii_p(final SubLObject char_vector, final SubLObject offset) {
        return Numbers.numE((SubLObject)unicode_strings.ONE_INTEGER, length_utf8_vector_codepoint(char_vector, offset));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/unicode-strings.lisp", position = 19184L)
    public static SubLObject unicode_vector_is_ascii_string_p(final SubLObject unicode_vector, SubLObject offset, SubLObject end) {
        if (offset == unicode_strings.UNPROVIDED) {
            offset = (SubLObject)unicode_strings.ZERO_INTEGER;
        }
        if (end == unicode_strings.UNPROVIDED) {
            end = Numbers.subtract(Sequences.length(unicode_vector), (SubLObject)unicode_strings.ONE_INTEGER);
        }
        SubLObject cdotimes_end_var;
        SubLObject i;
        for (cdotimes_end_var = Numbers.add(Numbers.subtract(end, offset), (SubLObject)unicode_strings.ONE_INTEGER), i = (SubLObject)unicode_strings.NIL, i = (SubLObject)unicode_strings.ZERO_INTEGER; i.numL(cdotimes_end_var); i = Numbers.add(i, (SubLObject)unicode_strings.ONE_INTEGER)) {
            if (unicode_strings.NIL == unicode_char_is_ascii_char_p(Vectors.aref(unicode_vector, Numbers.add(offset, i)))) {
                return (SubLObject)unicode_strings.NIL;
            }
        }
        return (SubLObject)unicode_strings.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/unicode-strings.lisp", position = 19512L)
    public static SubLObject unicode_char_is_ascii_char_p(final SubLObject unicode_char) {
        if (unicode_strings.NIL != unicode_character_p(unicode_char)) {
            return Numbers.numLE(unicode_char, (SubLObject)unicode_strings.$int38$127);
        }
        return (SubLObject)unicode_strings.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/unicode-strings.lisp", position = 19705L)
    public static SubLObject utf8_char_p(final SubLObject char_vector, final SubLObject offset) {
        return Numbers.plusp(length_utf8_vector_codepoint(char_vector, offset));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/unicode-strings.lisp", position = 19863L)
    public static SubLObject get_unicode_char_at_or_after_offset(final SubLObject char_vector, final SubLObject offset) {
        assert unicode_strings.NIL != Types.vectorp(char_vector) : char_vector;
        SubLObject len;
        SubLObject index;
        for (len = Sequences.length(char_vector), index = offset; index.numL(len) && Numbers.logand((SubLObject)unicode_strings.$int67$192, Vectors.aref(char_vector, index)).numE((SubLObject)unicode_strings.$int44$128); index = Numbers.add(index, (SubLObject)unicode_strings.ONE_INTEGER)) {}
        if (index.numGE(len)) {
            return Values.values((SubLObject)unicode_strings.MINUS_ONE_INTEGER, len);
        }
        return get_unicode_char_at_offset(char_vector, index);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/unicode-strings.lisp", position = 20357L)
    public static SubLObject get_unicode_char_at_or_before_offset(final SubLObject char_vector, final SubLObject offset) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert unicode_strings.NIL != Types.vectorp(char_vector) : char_vector;
        final SubLObject len = Sequences.length(char_vector);
        SubLObject index = offset;
        if (index.numGE(len)) {
            return Values.values((SubLObject)unicode_strings.MINUS_ONE_INTEGER, (SubLObject)unicode_strings.MINUS_ONE_INTEGER);
        }
        while (index.numGE((SubLObject)unicode_strings.ZERO_INTEGER) && Numbers.logand((SubLObject)unicode_strings.$int67$192, Vectors.aref(char_vector, index)).numE((SubLObject)unicode_strings.$int44$128)) {
            index = Numbers.subtract(index, (SubLObject)unicode_strings.ONE_INTEGER);
        }
        if (index.numL((SubLObject)unicode_strings.ZERO_INTEGER)) {
            return Values.values((SubLObject)unicode_strings.MINUS_ONE_INTEGER, (SubLObject)unicode_strings.MINUS_ONE_INTEGER);
        }
        thread.resetMultipleValues();
        final SubLObject value = get_unicode_char_at_offset(char_vector, index);
        final SubLObject next_offset = thread.secondMultipleValue();
        final SubLObject len_$7 = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        return Values.values(value, Numbers.subtract(Numbers.subtract(next_offset, len_$7), (SubLObject)unicode_strings.ONE_INTEGER));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/unicode-strings.lisp", position = 20996L)
    public static SubLObject get_unicode_char_at_offset(final SubLObject char_vector, final SubLObject offset) {
        final SubLObject pcase_var;
        final SubLObject ulen = pcase_var = length_utf8_vector_codepoint(char_vector, offset);
        if (pcase_var.eql((SubLObject)unicode_strings.ONE_INTEGER)) {
            return Values.values(Vectors.aref(char_vector, offset), Numbers.add(offset, (SubLObject)unicode_strings.ONE_INTEGER), ulen);
        }
        if (pcase_var.eql((SubLObject)unicode_strings.TWO_INTEGER)) {
            return Values.values(Numbers.add(Numbers.ash(Numbers.logand(Vectors.aref(char_vector, offset), (SubLObject)unicode_strings.$int79$31), (SubLObject)unicode_strings.SIX_INTEGER), Numbers.logand(Vectors.aref(char_vector, Numbers.add(offset, (SubLObject)unicode_strings.ONE_INTEGER)), (SubLObject)unicode_strings.$int69$63)), Numbers.add(offset, (SubLObject)unicode_strings.TWO_INTEGER), ulen);
        }
        if (pcase_var.eql((SubLObject)unicode_strings.THREE_INTEGER)) {
            return Values.values(Numbers.add(Numbers.ash(Numbers.logand(Vectors.aref(char_vector, offset), (SubLObject)unicode_strings.FIFTEEN_INTEGER), (SubLObject)unicode_strings.TWELVE_INTEGER), Numbers.ash(Numbers.logand(Vectors.aref(char_vector, Numbers.add(offset, (SubLObject)unicode_strings.ONE_INTEGER)), (SubLObject)unicode_strings.$int69$63), (SubLObject)unicode_strings.SIX_INTEGER), Numbers.logand(Vectors.aref(char_vector, Numbers.add(offset, (SubLObject)unicode_strings.TWO_INTEGER)), (SubLObject)unicode_strings.$int69$63)), Numbers.add(offset, (SubLObject)unicode_strings.THREE_INTEGER), ulen);
        }
        if (pcase_var.eql((SubLObject)unicode_strings.FOUR_INTEGER)) {
            return Values.values(Numbers.add(new SubLObject[] { Numbers.ash(Numbers.logand(Vectors.aref(char_vector, offset), (SubLObject)unicode_strings.SEVEN_INTEGER), (SubLObject)unicode_strings.EIGHTEEN_INTEGER), Numbers.ash(Numbers.logand(Vectors.aref(char_vector, Numbers.add(offset, (SubLObject)unicode_strings.ONE_INTEGER)), (SubLObject)unicode_strings.$int69$63), (SubLObject)unicode_strings.TWELVE_INTEGER), Numbers.ash(Numbers.logand(Vectors.aref(char_vector, Numbers.add(offset, (SubLObject)unicode_strings.TWO_INTEGER)), (SubLObject)unicode_strings.$int69$63), (SubLObject)unicode_strings.SIX_INTEGER), Numbers.logand(Vectors.aref(char_vector, Numbers.add(offset, (SubLObject)unicode_strings.THREE_INTEGER)), (SubLObject)unicode_strings.$int69$63) }), Numbers.add(offset, (SubLObject)unicode_strings.FOUR_INTEGER), ulen);
        }
        if (pcase_var.eql((SubLObject)unicode_strings.FIVE_INTEGER)) {
            return Values.values(Numbers.add(new SubLObject[] { Numbers.ash(Numbers.logand(Vectors.aref(char_vector, offset), (SubLObject)unicode_strings.THREE_INTEGER), (SubLObject)unicode_strings.$int80$24), Numbers.ash(Numbers.logand(Vectors.aref(char_vector, Numbers.add(offset, (SubLObject)unicode_strings.ONE_INTEGER)), (SubLObject)unicode_strings.$int69$63), (SubLObject)unicode_strings.EIGHTEEN_INTEGER), Numbers.ash(Numbers.logand(Vectors.aref(char_vector, Numbers.add(offset, (SubLObject)unicode_strings.TWO_INTEGER)), (SubLObject)unicode_strings.$int69$63), (SubLObject)unicode_strings.TWELVE_INTEGER), Numbers.ash(Numbers.logand(Vectors.aref(char_vector, Numbers.add(offset, (SubLObject)unicode_strings.THREE_INTEGER)), (SubLObject)unicode_strings.$int69$63), (SubLObject)unicode_strings.SIX_INTEGER), Numbers.logand(Vectors.aref(char_vector, Numbers.add(offset, (SubLObject)unicode_strings.FOUR_INTEGER)), (SubLObject)unicode_strings.$int69$63) }), Numbers.add(offset, (SubLObject)unicode_strings.FOUR_INTEGER), ulen);
        }
        return Values.values((SubLObject)unicode_strings.MINUS_ONE_INTEGER, Numbers.add(offset, (SubLObject)unicode_strings.ONE_INTEGER), ulen);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/unicode-strings.lisp", position = 22389L)
    public static SubLObject string_from_char_list(final SubLObject list, SubLObject len) {
        if (len == unicode_strings.UNPROVIDED) {
            len = Sequences.length(list);
        }
        final SubLObject str = Strings.make_string(len, (SubLObject)unicode_strings.UNPROVIDED);
        SubLObject buffer = list;
        SubLObject i;
        for (i = (SubLObject)unicode_strings.NIL, i = (SubLObject)unicode_strings.ZERO_INTEGER; i.numL(len); i = Numbers.add(i, (SubLObject)unicode_strings.ONE_INTEGER)) {
            Vectors.set_aref(str, i, buffer.first());
            buffer = buffer.rest();
        }
        return str;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/unicode-strings.lisp", position = 22635L)
    public static SubLObject unicode_to_html_escaped(final SubLObject unicode_vector, SubLObject escape_reserved_charsP) {
        if (escape_reserved_charsP == unicode_strings.UNPROVIDED) {
            escape_reserved_charsP = (SubLObject)unicode_strings.T;
        }
        SubLObject html_string = (SubLObject)unicode_strings.NIL;
        SubLObject stream = (SubLObject)unicode_strings.NIL;
        try {
            stream = streams_high.make_private_string_output_stream();
            final SubLObject backwardP_var = (SubLObject)unicode_strings.NIL;
            SubLObject length;
            SubLObject v_iteration;
            SubLObject element_num;
            SubLObject elt;
            SubLObject hex;
            for (length = Sequences.length(unicode_vector), v_iteration = (SubLObject)unicode_strings.NIL, v_iteration = (SubLObject)unicode_strings.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)unicode_strings.ONE_INTEGER)) {
                element_num = ((unicode_strings.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)unicode_strings.ONE_INTEGER) : v_iteration);
                elt = Vectors.aref(unicode_vector, element_num);
                if (elt.numL((SubLObject)unicode_strings.$int55$32) || elt.numGE((SubLObject)unicode_strings.$int44$128) || (unicode_strings.NIL != escape_reserved_charsP && unicode_strings.NIL != html_utilities.html_reserved_character_code_p(elt))) {
                    print_high.princ((SubLObject)unicode_strings.$str81$__x, stream);
                    hex = number_utilities.convert_to_hexadecimal(elt);
                    if (Sequences.length(hex).numLE((SubLObject)unicode_strings.ONE_INTEGER)) {
                        print_high.princ((SubLObject)Characters.CHAR_0, stream);
                    }
                    print_high.princ(hex, stream);
                    print_high.princ((SubLObject)Characters.CHAR_semicolon, stream);
                }
                else {
                    print_high.princ(Characters.code_char(elt), stream);
                }
            }
            html_string = streams_high.get_output_stream_string(stream);
        }
        finally {
            final SubLObject _prev_bind_0 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
            try {
                Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)unicode_strings.T);
                final SubLObject _values = Values.getValuesAsVector();
                streams_high.close(stream, (SubLObject)unicode_strings.UNPROVIDED);
                Values.restoreValuesFromVector(_values);
            }
            finally {
                Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, _prev_bind_0);
            }
        }
        return html_string;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/unicode-strings.lisp", position = 23336L)
    public static SubLObject unicode_string_to_utf8(final SubLObject unicode_string) {
        return unicode_display_to_utf8(unicode_vector_to_display(unicode_string_get_vector(unicode_string)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/unicode-strings.lisp", position = 23498L)
    public static SubLObject unicode_string_to_subl_string(final SubLObject unicode_string) {
        return display_to_subl_string(unicode_vector_to_display(unicode_string_get_vector(unicode_string)), (SubLObject)unicode_strings.UNPROVIDED, (SubLObject)unicode_strings.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/unicode-strings.lisp", position = 23666L)
    public static SubLObject unicode_display_to_utf8(final SubLObject string) {
        return html_escaped_to_utf8_string(unicode_display_to_html(string));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/unicode-strings.lisp", position = 23787L)
    public static SubLObject unicode_display_to_html(final SubLObject string) {
        final SubLObject vector = display_to_unicode_vector(string);
        return unicode_to_html_escaped(vector, (SubLObject)unicode_strings.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/unicode-strings.lisp", position = 23935L)
    public static SubLObject html_escaped_to_utf8_vector(final SubLObject html_string) {
        final SubLObject uvect = html_escaped_to_unicode_vector(html_string);
        return (SubLObject)((unicode_strings.NIL != uvect) ? unicode_vector_to_utf8_vector(uvect, (SubLObject)unicode_strings.UNPROVIDED, (SubLObject)unicode_strings.UNPROVIDED) : unicode_strings.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/unicode-strings.lisp", position = 24157L)
    public static SubLObject utf8_string_to_unicode_vector(final SubLObject utf8_string) {
        return utf8_vector_to_unicode_vector(utf8_string_to_utf8_vector(utf8_string));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/unicode-strings.lisp", position = 24299L)
    public static SubLObject html_escaped_to_unicode_vector(final SubLObject html_string) {
        return html_unescape_unicode_vector(utf8_string_to_unicode_vector(html_string));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/unicode-strings.lisp", position = 24446L)
    public static SubLObject html_escaped_utf8_string_to_utf8_string(final SubLObject utf8_html_string) {
        return utf8_vector_to_utf8_string(unicode_vector_to_utf8_vector(html_escaped_to_unicode_vector(utf8_html_string), (SubLObject)unicode_strings.UNPROVIDED, (SubLObject)unicode_strings.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/unicode-strings.lisp", position = 24646L)
    public static SubLObject html_unescape_unicode_vector(final SubLObject unicode_vector) {
        SubLObject unicode_char_stack = (SubLObject)unicode_strings.NIL;
        SubLObject state = (SubLObject)unicode_strings.$kw45$OPEN;
        SubLObject code = (SubLObject)unicode_strings.NIL;
        final SubLObject backwardP_var = (SubLObject)unicode_strings.NIL;
        SubLObject length;
        SubLObject v_iteration;
        SubLObject i;
        SubLObject ch;
        SubLObject pcase_var;
        SubLObject pcase_var_$8;
        SubLObject pcase_var_$9;
        SubLObject pcase_var_$10;
        SubLObject raw_code_string;
        SubLObject code_string;
        SubLObject pcase_var_$11;
        SubLObject entname;
        SubLObject entval;
        for (length = Sequences.length(unicode_vector), v_iteration = (SubLObject)unicode_strings.NIL, v_iteration = (SubLObject)unicode_strings.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)unicode_strings.ONE_INTEGER)) {
            i = ((unicode_strings.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)unicode_strings.ONE_INTEGER) : v_iteration);
            ch = Vectors.aref(unicode_vector, i);
            pcase_var = state;
            if (pcase_var.eql((SubLObject)unicode_strings.$kw45$OPEN)) {
                pcase_var_$8 = ch;
                if (pcase_var_$8.eql((SubLObject)unicode_strings.$int82$38)) {
                    state = (SubLObject)unicode_strings.$kw83$START_HTML_ESCAPE;
                }
                else if (pcase_var_$8.eql((SubLObject)unicode_strings.$int84$60)) {
                    unicode_char_stack = (SubLObject)ConsesLow.cons(ch, unicode_char_stack);
                    state = (SubLObject)unicode_strings.$kw85$INSIDE_TAG;
                }
                else {
                    unicode_char_stack = (SubLObject)ConsesLow.cons(ch, unicode_char_stack);
                }
            }
            else if (pcase_var.eql((SubLObject)unicode_strings.$kw85$INSIDE_TAG)) {
                unicode_char_stack = (SubLObject)ConsesLow.cons(ch, unicode_char_stack);
                if (ch.eql((SubLObject)unicode_strings.$int86$62)) {
                    state = (SubLObject)unicode_strings.$kw45$OPEN;
                }
            }
            else if (pcase_var.eql((SubLObject)unicode_strings.$kw83$START_HTML_ESCAPE)) {
                code = (SubLObject)unicode_strings.NIL;
                pcase_var_$9 = ch;
                if (pcase_var_$9.eql((SubLObject)unicode_strings.$int87$35)) {
                    state = (SubLObject)unicode_strings.$kw88$HTML_NUMERIC_ESCAPE_START;
                }
                else {
                    code = (SubLObject)ConsesLow.cons(ch, code);
                    state = (SubLObject)unicode_strings.$kw89$ENTITY_ESCAPE;
                }
            }
            else if (pcase_var.eql((SubLObject)unicode_strings.$kw88$HTML_NUMERIC_ESCAPE_START)) {
                if (ch.numE((SubLObject)unicode_strings.$int90$120)) {
                    state = (SubLObject)unicode_strings.$kw91$HTML_HEXADECIMAL_ESCAPE;
                }
                else {
                    if (!ch.numGE((SubLObject)unicode_strings.$int92$48) || !ch.numLE((SubLObject)unicode_strings.$int93$57)) {
                        return (SubLObject)unicode_strings.NIL;
                    }
                    state = (SubLObject)unicode_strings.$kw94$HTML_DECIMAL_ESCAPE;
                    code = (SubLObject)ConsesLow.cons(ch, code);
                }
            }
            else if (pcase_var.eql((SubLObject)unicode_strings.$kw91$HTML_HEXADECIMAL_ESCAPE) || pcase_var.eql((SubLObject)unicode_strings.$kw94$HTML_DECIMAL_ESCAPE)) {
                pcase_var_$10 = ch;
                if (pcase_var_$10.eql((SubLObject)unicode_strings.$int95$59)) {
                    raw_code_string = string_from_char_list(Mapping.mapcar((SubLObject)unicode_strings.$sym96$CODE_CHAR, Sequences.nreverse(code)), (SubLObject)unicode_strings.UNPROVIDED);
                    code_string = ((state == unicode_strings.$kw91$HTML_HEXADECIMAL_ESCAPE) ? number_utilities.convert_hexadecimal_to_decimal(raw_code_string) : reader.read_from_string(raw_code_string, (SubLObject)unicode_strings.UNPROVIDED, (SubLObject)unicode_strings.UNPROVIDED, (SubLObject)unicode_strings.UNPROVIDED, (SubLObject)unicode_strings.UNPROVIDED, (SubLObject)unicode_strings.UNPROVIDED));
                    unicode_char_stack = (SubLObject)ConsesLow.cons(code_string, unicode_char_stack);
                    state = (SubLObject)unicode_strings.$kw45$OPEN;
                }
                else {
                    code = (SubLObject)ConsesLow.cons(ch, code);
                }
            }
            else if (pcase_var.eql((SubLObject)unicode_strings.$kw89$ENTITY_ESCAPE)) {
                pcase_var_$11 = ch;
                if (pcase_var_$11.eql((SubLObject)unicode_strings.$int95$59)) {
                    state = (SubLObject)unicode_strings.$kw45$OPEN;
                    entname = string_from_char_list(Mapping.mapcar((SubLObject)unicode_strings.$sym96$CODE_CHAR, Sequences.nreverse(code)), (SubLObject)unicode_strings.UNPROVIDED);
                    entval = map_character_entity_to_decimal_value(entname);
                    if (unicode_strings.NIL == entval) {
                        return (SubLObject)unicode_strings.NIL;
                    }
                    unicode_char_stack = (SubLObject)ConsesLow.cons(entval, unicode_char_stack);
                }
                else {
                    code = (SubLObject)ConsesLow.cons(ch, code);
                }
            }
        }
        if (state != unicode_strings.$kw45$OPEN) {
            return (SubLObject)unicode_strings.NIL;
        }
        return list_utilities.list2vector(Sequences.nreverse(unicode_char_stack));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/unicode-strings.lisp", position = 26583L)
    public static SubLObject utf8_vector_to_utf8_string(final SubLObject utf8_vector) {
        return vector_utilities.byte_vector_to_string(utf8_vector);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/unicode-strings.lisp", position = 26686L)
    public static SubLObject utf8_string_to_utf8_vector(final SubLObject utf8_string) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject bad_char = Sequences.find((SubLObject)unicode_strings.$int97$256, utf8_string, Symbols.symbol_function((SubLObject)unicode_strings.$sym98$__), Symbols.symbol_function((SubLObject)unicode_strings.$sym99$CHAR_CODE), (SubLObject)unicode_strings.UNPROVIDED, (SubLObject)unicode_strings.UNPROVIDED);
        if (unicode_strings.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && unicode_strings.NIL != bad_char) {
            Errors.error((SubLObject)unicode_strings.$str100$_S__code___S__is_not_a_valid_utf8, bad_char, Characters.char_code(bad_char));
        }
        return subl_string_to_char_code_vector(utf8_string);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/unicode-strings.lisp", position = 26969L)
    public static SubLObject subl_string_to_char_code_vector(final SubLObject string) {
        assert unicode_strings.NIL != Types.stringp(string) : string;
        final SubLObject vector = Vectors.make_vector(Sequences.length(string), (SubLObject)unicode_strings.UNPROVIDED);
        SubLObject end_var_$12;
        SubLObject end_var;
        SubLObject i;
        SubLObject v_char;
        SubLObject code;
        for (end_var = (end_var_$12 = Sequences.length(string)), i = (SubLObject)unicode_strings.NIL, i = (SubLObject)unicode_strings.ZERO_INTEGER; !i.numGE(end_var_$12); i = number_utilities.f_1X(i)) {
            v_char = Strings.sublisp_char(string, i);
            code = Characters.char_code(v_char);
            Vectors.set_aref(vector, i, code);
        }
        return vector;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/unicode-strings.lisp", position = 27235L)
    public static SubLObject utf8_string_to_subl_string(final SubLObject utf8_string) {
        return display_to_subl_string(utf8_string_to_display(utf8_string), (SubLObject)unicode_strings.UNPROVIDED, (SubLObject)unicode_strings.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/unicode-strings.lisp", position = 27365L)
    public static SubLObject utf8_string_to_display(final SubLObject utf8_string) {
        return unicode_vector_to_display(utf8_vector_to_unicode_vector(utf8_string_to_utf8_vector(utf8_string)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/unicode-strings.lisp", position = 27531L)
    public static SubLObject html_escaped_to_utf8_string(final SubLObject html_string) {
        if (unicode_strings.NIL == Sequences.find((SubLObject)Characters.CHAR_ampersand, html_string, (SubLObject)unicode_strings.UNPROVIDED, (SubLObject)unicode_strings.UNPROVIDED, (SubLObject)unicode_strings.UNPROVIDED, (SubLObject)unicode_strings.UNPROVIDED)) {
            return html_string;
        }
        final SubLObject escvect = html_escaped_to_utf8_vector(html_string);
        if (unicode_strings.NIL == escvect) {
            return (SubLObject)unicode_strings.NIL;
        }
        return utf8_vector_to_utf8_string(escvect);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/unicode-strings.lisp", position = 27789L)
    public static SubLObject display_to_utf8_string(final SubLObject display) {
        final SubLObject unicode_vector = display_to_unicode_vector(display);
        final SubLObject escvect = (SubLObject)((unicode_strings.NIL != unicode_vector) ? unicode_vector_to_utf8_vector(unicode_vector, (SubLObject)unicode_strings.UNPROVIDED, (SubLObject)unicode_strings.UNPROVIDED) : unicode_strings.NIL);
        return (SubLObject)((unicode_strings.NIL != escvect) ? utf8_vector_to_utf8_string(escvect) : unicode_strings.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/unicode-strings.lisp", position = 28052L)
    public static SubLObject html_escaped_to_display(final SubLObject html_string) {
        return utf8_string_to_display(html_escaped_to_utf8_string(html_string));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/unicode-strings.lisp", position = 34080L)
    public static SubLObject map_character_entity_to_decimal_value(final SubLObject entity_name) {
        return list_utilities.alist_lookup_without_values(unicode_strings.$html_40_character_entity_table$.getGlobalValue(), entity_name, Symbols.symbol_function((SubLObject)unicode_strings.EQUAL), (SubLObject)unicode_strings.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/unicode-strings.lisp", position = 34248L)
    public static SubLObject map_decimal_value_to_character_entity(final SubLObject char_code) {
        return list_utilities.alist_reverse_lookup_without_values(unicode_strings.$html_40_character_entity_table$.getGlobalValue(), char_code, Symbols.symbol_function((SubLObject)unicode_strings.EQL), (SubLObject)unicode_strings.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/unicode-strings.lisp", position = 34417L)
    public static SubLObject unicode_string_concatenate(final SubLObject unicode_string_1, final SubLObject unicode_string_2) {
        final SubLObject vect1 = unicode_string_get_vector(unicode_string_1);
        final SubLObject length1 = Sequences.length(vect1);
        final SubLObject vect2 = unicode_string_get_vector(unicode_string_2);
        final SubLObject length2 = Sequences.length(vect2);
        final SubLObject new_vect = Vectors.make_vector(Numbers.add(length1, length2), (SubLObject)unicode_strings.UNPROVIDED);
        SubLObject vector_var = vect1;
        SubLObject backwardP_var = (SubLObject)unicode_strings.NIL;
        SubLObject length3;
        SubLObject v_iteration;
        SubLObject i;
        SubLObject code;
        for (length3 = Sequences.length(vector_var), v_iteration = (SubLObject)unicode_strings.NIL, v_iteration = (SubLObject)unicode_strings.ZERO_INTEGER; v_iteration.numL(length3); v_iteration = Numbers.add(v_iteration, (SubLObject)unicode_strings.ONE_INTEGER)) {
            i = ((unicode_strings.NIL != backwardP_var) ? Numbers.subtract(length3, v_iteration, (SubLObject)unicode_strings.ONE_INTEGER) : v_iteration);
            code = Vectors.aref(vector_var, i);
            Vectors.set_aref(new_vect, i, code);
        }
        vector_var = vect2;
        backwardP_var = (SubLObject)unicode_strings.NIL;
        SubLObject j;
        for (length3 = Sequences.length(vector_var), v_iteration = (SubLObject)unicode_strings.NIL, v_iteration = (SubLObject)unicode_strings.ZERO_INTEGER; v_iteration.numL(length3); v_iteration = Numbers.add(v_iteration, (SubLObject)unicode_strings.ONE_INTEGER)) {
            i = ((unicode_strings.NIL != backwardP_var) ? Numbers.subtract(length3, v_iteration, (SubLObject)unicode_strings.ONE_INTEGER) : v_iteration);
            code = Vectors.aref(vector_var, i);
            j = Numbers.add(i, length1);
            Vectors.set_aref(new_vect, j, code);
        }
        return unicode_string_create(new_vect);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/unicode-strings.lisp", position = 35321L)
    public static SubLObject cfasl_output_object_unicode_char_method(final SubLObject v_object, final SubLObject stream) {
        return cfasl_output_unicode_char(v_object, stream);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/unicode-strings.lisp", position = 35450L)
    public static SubLObject cfasl_output_unicode_char(final SubLObject unicode_char, final SubLObject stream) {
        cfasl.cfasl_raw_write_byte(unicode_strings.$cfasl_opcode_unicode_char$.getGlobalValue(), stream);
        final SubLObject utf8_vect = to_utf8_vector(unicode_char_uchar(unicode_char));
        final SubLObject length = Sequences.length(utf8_vect);
        cfasl.cfasl_output(length, stream);
        SubLObject i;
        for (i = (SubLObject)unicode_strings.NIL, i = (SubLObject)unicode_strings.ZERO_INTEGER; i.numL(length); i = Numbers.add(i, (SubLObject)unicode_strings.ONE_INTEGER)) {
            cfasl.cfasl_raw_write_byte(Vectors.aref(utf8_vect, i), stream);
        }
        return unicode_char;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/unicode-strings.lisp", position = 35818L)
    public static SubLObject cfasl_input_unicode_char(final SubLObject stream) {
        final SubLObject length = cfasl.cfasl_input_object(stream);
        SubLObject unicode_vector = (SubLObject)unicode_strings.NIL;
        SubLObject output_vector = (SubLObject)unicode_strings.NIL;
        unicode_vector = Vectors.make_vector(length, (SubLObject)unicode_strings.UNPROVIDED);
        SubLObject i;
        SubLObject v_byte;
        for (i = (SubLObject)unicode_strings.NIL, i = (SubLObject)unicode_strings.ZERO_INTEGER; i.numL(length); i = Numbers.add(i, (SubLObject)unicode_strings.ONE_INTEGER)) {
            v_byte = cfasl.cfasl_raw_read_byte(stream);
            if (unicode_strings.NIL != number_utilities.bytep(v_byte)) {
                Vectors.set_aref(unicode_vector, i, v_byte);
            }
            else {
                Errors.error((SubLObject)unicode_strings.$str106$Invalid_unicode_character__expect, length, Numbers.add(i, (SubLObject)unicode_strings.ONE_INTEGER));
            }
        }
        final SubLObject uchar = get_unicode_char_at_offset(unicode_vector, (SubLObject)unicode_strings.ZERO_INTEGER);
        output_vector = unicode_char_create(uchar);
        return output_vector;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/unicode-strings.lisp", position = 36696L)
    public static SubLObject cfasl_output_object_unicode_string_method(final SubLObject v_object, final SubLObject stream) {
        return cfasl_output_unicode_string(v_object, stream);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/unicode-strings.lisp", position = 36829L)
    public static SubLObject cfasl_output_unicode_string(final SubLObject unicode_string, final SubLObject stream) {
        cfasl.cfasl_raw_write_byte(unicode_strings.$cfasl_opcode_unicode_string$.getGlobalValue(), stream);
        final SubLObject utf8_vect = unicode_vector_to_utf8_vector(unicode_string_vect(unicode_string), (SubLObject)unicode_strings.UNPROVIDED, (SubLObject)unicode_strings.UNPROVIDED);
        final SubLObject length = Sequences.length(utf8_vect);
        cfasl.cfasl_output(length, stream);
        SubLObject i;
        for (i = (SubLObject)unicode_strings.NIL, i = (SubLObject)unicode_strings.ZERO_INTEGER; i.numL(length); i = Numbers.add(i, (SubLObject)unicode_strings.ONE_INTEGER)) {
            cfasl.cfasl_raw_write_byte(Vectors.aref(utf8_vect, i), stream);
        }
        return unicode_string;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/unicode-strings.lisp", position = 37223L)
    public static SubLObject cfasl_input_unicode_string(final SubLObject stream) {
        final SubLObject length = cfasl.cfasl_input_object(stream);
        SubLObject unicode_vector = (SubLObject)unicode_strings.NIL;
        SubLObject output_vector = (SubLObject)unicode_strings.NIL;
        unicode_vector = Vectors.make_vector(length, (SubLObject)unicode_strings.UNPROVIDED);
        SubLObject i;
        SubLObject v_byte;
        for (i = (SubLObject)unicode_strings.NIL, i = (SubLObject)unicode_strings.ZERO_INTEGER; i.numL(length); i = Numbers.add(i, (SubLObject)unicode_strings.ONE_INTEGER)) {
            v_byte = cfasl.cfasl_raw_read_byte(stream);
            if (unicode_strings.NIL != number_utilities.bytep(v_byte)) {
                Vectors.set_aref(unicode_vector, i, v_byte);
            }
            else {
                Errors.error((SubLObject)unicode_strings.$str106$Invalid_unicode_character__expect, length, Numbers.add(i, (SubLObject)unicode_strings.ONE_INTEGER));
            }
        }
        final SubLObject vect = utf8_vector_to_unicode_vector(unicode_vector);
        output_vector = unicode_string_create(vect);
        return output_vector;
    }
    
    public static SubLObject declare_unicode_strings_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.unicode_strings", "unicode_char_print_function_trampoline", "UNICODE-CHAR-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.unicode_strings", "unicode_char_p", "UNICODE-CHAR-P", 1, 0, false);
        new $unicode_char_p$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.unicode_strings", "unicode_char_uchar", "UNICODE-CHAR-UCHAR", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.unicode_strings", "_csetf_unicode_char_uchar", "_CSETF-UNICODE-CHAR-UCHAR", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.unicode_strings", "make_unicode_char", "MAKE-UNICODE-CHAR", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.unicode_strings", "visit_defstruct_unicode_char", "VISIT-DEFSTRUCT-UNICODE-CHAR", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.unicode_strings", "visit_defstruct_object_unicode_char_method", "VISIT-DEFSTRUCT-OBJECT-UNICODE-CHAR-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.unicode_strings", "unicode_char_create", "UNICODE-CHAR-CREATE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.unicode_strings", "print_unicode_char", "PRINT-UNICODE-CHAR", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.unicode_strings", "unicode_char_get_char", "UNICODE-CHAR-GET-CHAR", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.unicode_strings", "unicode_char_set_char", "UNICODE-CHAR-SET-CHAR", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.unicode_strings", "unicode_string_print_function_trampoline", "UNICODE-STRING-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.unicode_strings", "unicode_string_p", "UNICODE-STRING-P", 1, 0, false);
        new $unicode_string_p$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.unicode_strings", "unicode_string_vect", "UNICODE-STRING-VECT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.unicode_strings", "_csetf_unicode_string_vect", "_CSETF-UNICODE-STRING-VECT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.unicode_strings", "make_unicode_string", "MAKE-UNICODE-STRING", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.unicode_strings", "visit_defstruct_unicode_string", "VISIT-DEFSTRUCT-UNICODE-STRING", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.unicode_strings", "visit_defstruct_object_unicode_string_method", "VISIT-DEFSTRUCT-OBJECT-UNICODE-STRING-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.unicode_strings", "unicode_string_create", "UNICODE-STRING-CREATE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.unicode_strings", "print_unicode_string", "PRINT-UNICODE-STRING", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.unicode_strings", "unicode_string_get_vector", "UNICODE-STRING-GET-VECTOR", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.unicode_strings", "unicode_string_set_vector", "UNICODE-STRING-SET-VECTOR", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.unicode_strings", "unicode_vector_string_p", "UNICODE-VECTOR-STRING-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.unicode_strings", "utf8_vector_string_p", "UTF8-VECTOR-STRING-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.unicode_strings", "ascii_string_p", "ASCII-STRING-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.unicode_strings", "non_ascii_string_p", "NON-ASCII-STRING-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.unicode_strings", "ascii_char_p", "ASCII-CHAR-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.unicode_strings", "non_ascii_char_p", "NON-ASCII-CHAR-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.unicode_strings", "ascii_char_code_p", "ASCII-CHAR-CODE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.unicode_strings", "ascii_char_p_int", "ASCII-CHAR-P-INT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.unicode_strings", "identify_string_type", "IDENTIFY-STRING-TYPE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.unicode_strings", "display_vector_is_ascii_p", "DISPLAY-VECTOR-IS-ASCII-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.unicode_strings", "display_vector_string_p", "DISPLAY-VECTOR-STRING-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.unicode_strings", "display_to_unicode_vector", "DISPLAY-TO-UNICODE-VECTOR", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.unicode_strings", "display_to_subl_string", "DISPLAY-TO-SUBL-STRING", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.unicode_strings", "unicode_vector_to_display", "UNICODE-VECTOR-TO-DISPLAY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.unicode_strings", "element_vector", "ELEMENT-VECTOR", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.unicode_strings", "unicode_vector_to_utf8_vector", "UNICODE-VECTOR-TO-UTF8-VECTOR", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.unicode_strings", "utf8_vector_to_unicode_vector", "UTF8-VECTOR-TO-UNICODE-VECTOR", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.unicode_strings", "unicode_char_code", "UNICODE-CHAR-CODE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.unicode_strings", "unicode_code_char", "UNICODE-CODE-CHAR", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.unicode_strings", "unicode_character_p", "UNICODE-CHARACTER-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.unicode_strings", "number_utf8_bytes", "NUMBER-UTF8-BYTES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.unicode_strings", "to_utf8_vector", "TO-UTF8-VECTOR", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.unicode_strings", "print_utf_hex_list", "PRINT-UTF-HEX-LIST", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.unicode_strings", "to_utc8_vector_internal", "TO-UTC8-VECTOR-INTERNAL", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.unicode_strings", "length_utf8_vector_codepoint", "LENGTH-UTF8-VECTOR-CODEPOINT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.unicode_strings", "length_utf8_from_first_byte", "LENGTH-UTF8-FROM-FIRST-BYTE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.unicode_strings", "utf8_vector_is_ascii_string_p", "UTF8-VECTOR-IS-ASCII-STRING-P", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.unicode_strings", "utf8_char_is_ascii_p", "UTF8-CHAR-IS-ASCII-P", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.unicode_strings", "unicode_vector_is_ascii_string_p", "UNICODE-VECTOR-IS-ASCII-STRING-P", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.unicode_strings", "unicode_char_is_ascii_char_p", "UNICODE-CHAR-IS-ASCII-CHAR-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.unicode_strings", "utf8_char_p", "UTF8-CHAR-P", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.unicode_strings", "get_unicode_char_at_or_after_offset", "GET-UNICODE-CHAR-AT-OR-AFTER-OFFSET", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.unicode_strings", "get_unicode_char_at_or_before_offset", "GET-UNICODE-CHAR-AT-OR-BEFORE-OFFSET", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.unicode_strings", "get_unicode_char_at_offset", "GET-UNICODE-CHAR-AT-OFFSET", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.unicode_strings", "string_from_char_list", "STRING-FROM-CHAR-LIST", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.unicode_strings", "unicode_to_html_escaped", "UNICODE-TO-HTML-ESCAPED", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.unicode_strings", "unicode_string_to_utf8", "UNICODE-STRING-TO-UTF8", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.unicode_strings", "unicode_string_to_subl_string", "UNICODE-STRING-TO-SUBL-STRING", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.unicode_strings", "unicode_display_to_utf8", "UNICODE-DISPLAY-TO-UTF8", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.unicode_strings", "unicode_display_to_html", "UNICODE-DISPLAY-TO-HTML", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.unicode_strings", "html_escaped_to_utf8_vector", "HTML-ESCAPED-TO-UTF8-VECTOR", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.unicode_strings", "utf8_string_to_unicode_vector", "UTF8-STRING-TO-UNICODE-VECTOR", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.unicode_strings", "html_escaped_to_unicode_vector", "HTML-ESCAPED-TO-UNICODE-VECTOR", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.unicode_strings", "html_escaped_utf8_string_to_utf8_string", "HTML-ESCAPED-UTF8-STRING-TO-UTF8-STRING", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.unicode_strings", "html_unescape_unicode_vector", "HTML-UNESCAPE-UNICODE-VECTOR", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.unicode_strings", "utf8_vector_to_utf8_string", "UTF8-VECTOR-TO-UTF8-STRING", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.unicode_strings", "utf8_string_to_utf8_vector", "UTF8-STRING-TO-UTF8-VECTOR", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.unicode_strings", "subl_string_to_char_code_vector", "SUBL-STRING-TO-CHAR-CODE-VECTOR", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.unicode_strings", "utf8_string_to_subl_string", "UTF8-STRING-TO-SUBL-STRING", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.unicode_strings", "utf8_string_to_display", "UTF8-STRING-TO-DISPLAY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.unicode_strings", "html_escaped_to_utf8_string", "HTML-ESCAPED-TO-UTF8-STRING", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.unicode_strings", "display_to_utf8_string", "DISPLAY-TO-UTF8-STRING", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.unicode_strings", "html_escaped_to_display", "HTML-ESCAPED-TO-DISPLAY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.unicode_strings", "map_character_entity_to_decimal_value", "MAP-CHARACTER-ENTITY-TO-DECIMAL-VALUE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.unicode_strings", "map_decimal_value_to_character_entity", "MAP-DECIMAL-VALUE-TO-CHARACTER-ENTITY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.unicode_strings", "unicode_string_concatenate", "UNICODE-STRING-CONCATENATE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.unicode_strings", "cfasl_output_object_unicode_char_method", "CFASL-OUTPUT-OBJECT-UNICODE-CHAR-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.unicode_strings", "cfasl_output_unicode_char", "CFASL-OUTPUT-UNICODE-CHAR", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.unicode_strings", "cfasl_input_unicode_char", "CFASL-INPUT-UNICODE-CHAR", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.unicode_strings", "cfasl_output_object_unicode_string_method", "CFASL-OUTPUT-OBJECT-UNICODE-STRING-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.unicode_strings", "cfasl_output_unicode_string", "CFASL-OUTPUT-UNICODE-STRING", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.unicode_strings", "cfasl_input_unicode_string", "CFASL-INPUT-UNICODE-STRING", 1, 0, false);
        return (SubLObject)unicode_strings.NIL;
    }
    
    public static SubLObject init_unicode_strings_file() {
        unicode_strings.$max_unicode_value$ = SubLFiles.defconstant("MAX-UNICODE-VALUE", (SubLObject)unicode_strings.$int0$1114111);
        unicode_strings.$dtp_unicode_char$ = SubLFiles.defconstant("*DTP-UNICODE-CHAR*", (SubLObject)unicode_strings.$sym1$UNICODE_CHAR);
        unicode_strings.$dtp_unicode_string$ = SubLFiles.defconstant("*DTP-UNICODE-STRING*", (SubLObject)unicode_strings.$sym22$UNICODE_STRING);
        unicode_strings.$default_non_ascii_placeholder_char$ = SubLFiles.deflexical("*DEFAULT-NON-ASCII-PLACEHOLDER-CHAR*", (SubLObject)Characters.CHAR_tilde);
        unicode_strings.$default_unicode_to_ascii_code_map$ = SubLFiles.defparameter("*DEFAULT-UNICODE-TO-ASCII-CODE-MAP*", (SubLObject)unicode_strings.$list51);
        unicode_strings.$html_40_character_entity_table$ = SubLFiles.deflexical("*HTML-40-CHARACTER-ENTITY-TABLE*", unicode_strings.$list102);
        unicode_strings.$cfasl_opcode_unicode_char$ = SubLFiles.defconstant("*CFASL-OPCODE-UNICODE-CHAR*", (SubLObject)unicode_strings.$int103$52);
        unicode_strings.$cfasl_opcode_unicode_string$ = SubLFiles.defconstant("*CFASL-OPCODE-UNICODE-STRING*", (SubLObject)unicode_strings.$int107$53);
        return (SubLObject)unicode_strings.NIL;
    }
    
    public static SubLObject setup_unicode_strings_file() {
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), unicode_strings.$dtp_unicode_char$.getGlobalValue(), Symbols.symbol_function((SubLObject)unicode_strings.$sym8$UNICODE_CHAR_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)unicode_strings.$list9);
        Structures.def_csetf((SubLObject)unicode_strings.$sym10$UNICODE_CHAR_UCHAR, (SubLObject)unicode_strings.$sym11$_CSETF_UNICODE_CHAR_UCHAR);
        Equality.identity((SubLObject)unicode_strings.$sym1$UNICODE_CHAR);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), unicode_strings.$dtp_unicode_char$.getGlobalValue(), Symbols.symbol_function((SubLObject)unicode_strings.$sym18$VISIT_DEFSTRUCT_OBJECT_UNICODE_CHAR_METHOD));
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), unicode_strings.$dtp_unicode_string$.getGlobalValue(), Symbols.symbol_function((SubLObject)unicode_strings.$sym29$UNICODE_STRING_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)unicode_strings.$list30);
        Structures.def_csetf((SubLObject)unicode_strings.$sym31$UNICODE_STRING_VECT, (SubLObject)unicode_strings.$sym32$_CSETF_UNICODE_STRING_VECT);
        Equality.identity((SubLObject)unicode_strings.$sym22$UNICODE_STRING);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), unicode_strings.$dtp_unicode_string$.getGlobalValue(), Symbols.symbol_function((SubLObject)unicode_strings.$sym35$VISIT_DEFSTRUCT_OBJECT_UNICODE_STRING_METHOD));
        cfasl.register_cfasl_input_function(unicode_strings.$cfasl_opcode_unicode_char$.getGlobalValue(), (SubLObject)unicode_strings.$sym104$CFASL_INPUT_UNICODE_CHAR);
        Structures.register_method(cfasl.$cfasl_output_object_method_table$.getGlobalValue(), unicode_strings.$dtp_unicode_char$.getGlobalValue(), Symbols.symbol_function((SubLObject)unicode_strings.$sym105$CFASL_OUTPUT_OBJECT_UNICODE_CHAR_METHOD));
        cfasl.register_cfasl_input_function(unicode_strings.$cfasl_opcode_unicode_string$.getGlobalValue(), (SubLObject)unicode_strings.$sym108$CFASL_INPUT_UNICODE_STRING);
        Structures.register_method(cfasl.$cfasl_output_object_method_table$.getGlobalValue(), unicode_strings.$dtp_unicode_string$.getGlobalValue(), Symbols.symbol_function((SubLObject)unicode_strings.$sym109$CFASL_OUTPUT_OBJECT_UNICODE_STRING_METHOD));
        generic_testing.define_test_case_table_int((SubLObject)unicode_strings.$sym110$HTML_ESCAPED_UTF8_STRING_TO_UTF8_STRING, (SubLObject)ConsesLow.list(new SubLObject[] { unicode_strings.$kw111$TEST, unicode_strings.EQUAL, unicode_strings.$kw112$OWNER, unicode_strings.NIL, unicode_strings.$kw113$CLASSES, unicode_strings.NIL, unicode_strings.$kw114$KB, unicode_strings.$kw115$TINY, unicode_strings.$kw116$WORKING_, unicode_strings.T }), (SubLObject)unicode_strings.$list117);
        return (SubLObject)unicode_strings.NIL;
    }
    
    private static SubLObject _constant_102_initializer() {
        return (SubLObject)ConsesLow.list(new SubLObject[] { ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("AElig"), (SubLObject)SubLObjectFactory.makeInteger(198)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("Aacute"), (SubLObject)SubLObjectFactory.makeInteger(193)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("Acirc"), (SubLObject)SubLObjectFactory.makeInteger(194)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("Agrave"), (SubLObject)SubLObjectFactory.makeInteger(192)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("Alpha"), (SubLObject)SubLObjectFactory.makeInteger(913)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("Aring"), (SubLObject)SubLObjectFactory.makeInteger(197)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("Atilde"), (SubLObject)SubLObjectFactory.makeInteger(195)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("Auml"), (SubLObject)SubLObjectFactory.makeInteger(196)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("Beta"), (SubLObject)SubLObjectFactory.makeInteger(914)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("Ccedil"), (SubLObject)SubLObjectFactory.makeInteger(199)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("Chi"), (SubLObject)SubLObjectFactory.makeInteger(935)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("Dagger"), (SubLObject)SubLObjectFactory.makeInteger(8225)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("Delta"), (SubLObject)SubLObjectFactory.makeInteger(916)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("ETH"), (SubLObject)SubLObjectFactory.makeInteger(208)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("Eacute"), (SubLObject)SubLObjectFactory.makeInteger(201)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("Ecirc"), (SubLObject)SubLObjectFactory.makeInteger(202)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("Egrave"), (SubLObject)SubLObjectFactory.makeInteger(200)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("Epsilon"), (SubLObject)SubLObjectFactory.makeInteger(917)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("Eta"), (SubLObject)SubLObjectFactory.makeInteger(919)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("Euml"), (SubLObject)SubLObjectFactory.makeInteger(203)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("Gamma"), (SubLObject)SubLObjectFactory.makeInteger(915)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("Iacute"), (SubLObject)SubLObjectFactory.makeInteger(205)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("Icirc"), (SubLObject)SubLObjectFactory.makeInteger(206)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("Igrave"), (SubLObject)SubLObjectFactory.makeInteger(204)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("Iota"), (SubLObject)SubLObjectFactory.makeInteger(921)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("Iuml"), (SubLObject)SubLObjectFactory.makeInteger(207)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("Kappa"), (SubLObject)SubLObjectFactory.makeInteger(922)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("Lambda"), (SubLObject)SubLObjectFactory.makeInteger(923)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("Mu"), (SubLObject)SubLObjectFactory.makeInteger(924)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("Ntilde"), (SubLObject)SubLObjectFactory.makeInteger(209)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("Nu"), (SubLObject)SubLObjectFactory.makeInteger(925)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("OElig"), (SubLObject)SubLObjectFactory.makeInteger(338)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("Oacute"), (SubLObject)SubLObjectFactory.makeInteger(211)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("Ocirc"), (SubLObject)SubLObjectFactory.makeInteger(212)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("Ograve"), (SubLObject)SubLObjectFactory.makeInteger(210)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("Omega"), (SubLObject)SubLObjectFactory.makeInteger(937)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("Omicron"), (SubLObject)SubLObjectFactory.makeInteger(927)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("Oslash"), (SubLObject)SubLObjectFactory.makeInteger(216)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("Otilde"), (SubLObject)SubLObjectFactory.makeInteger(213)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("Ouml"), (SubLObject)SubLObjectFactory.makeInteger(214)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("Phi"), (SubLObject)SubLObjectFactory.makeInteger(934)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("Pi"), (SubLObject)SubLObjectFactory.makeInteger(928)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("Prime"), (SubLObject)SubLObjectFactory.makeInteger(8243)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("Psi"), (SubLObject)SubLObjectFactory.makeInteger(936)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("Rho"), (SubLObject)SubLObjectFactory.makeInteger(929)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("Scaron"), (SubLObject)SubLObjectFactory.makeInteger(352)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("Sigma"), (SubLObject)SubLObjectFactory.makeInteger(931)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("THORN"), (SubLObject)SubLObjectFactory.makeInteger(222)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("Tau"), (SubLObject)SubLObjectFactory.makeInteger(932)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("Theta"), (SubLObject)SubLObjectFactory.makeInteger(920)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("Uacute"), (SubLObject)SubLObjectFactory.makeInteger(218)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("Ucirc"), (SubLObject)SubLObjectFactory.makeInteger(219)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("Ugrave"), (SubLObject)SubLObjectFactory.makeInteger(217)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("Upsilon"), (SubLObject)SubLObjectFactory.makeInteger(933)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("Uuml"), (SubLObject)SubLObjectFactory.makeInteger(220)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("Xi"), (SubLObject)SubLObjectFactory.makeInteger(926)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("Yacute"), (SubLObject)SubLObjectFactory.makeInteger(221)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("Yuml"), (SubLObject)SubLObjectFactory.makeInteger(376)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("Zeta"), (SubLObject)SubLObjectFactory.makeInteger(918)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("aacute"), (SubLObject)SubLObjectFactory.makeInteger(225)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("acirc"), (SubLObject)SubLObjectFactory.makeInteger(226)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("acute"), (SubLObject)SubLObjectFactory.makeInteger(180)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("aelig"), (SubLObject)SubLObjectFactory.makeInteger(230)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("agrave"), (SubLObject)SubLObjectFactory.makeInteger(224)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("alefsym"), (SubLObject)SubLObjectFactory.makeInteger(8501)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("alpha"), (SubLObject)SubLObjectFactory.makeInteger(945)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("amp"), (SubLObject)SubLObjectFactory.makeInteger(38)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("and"), (SubLObject)SubLObjectFactory.makeInteger(8743)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("ang"), (SubLObject)SubLObjectFactory.makeInteger(8736)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("aring"), (SubLObject)SubLObjectFactory.makeInteger(229)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("asymp"), (SubLObject)SubLObjectFactory.makeInteger(8776)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("atilde"), (SubLObject)SubLObjectFactory.makeInteger(227)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("auml"), (SubLObject)SubLObjectFactory.makeInteger(228)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("bdquo"), (SubLObject)SubLObjectFactory.makeInteger(8222)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("beta"), (SubLObject)SubLObjectFactory.makeInteger(946)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("brvbar"), (SubLObject)SubLObjectFactory.makeInteger(166)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("bull"), (SubLObject)SubLObjectFactory.makeInteger(8226)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("cap"), (SubLObject)SubLObjectFactory.makeInteger(8745)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("ccedil"), (SubLObject)SubLObjectFactory.makeInteger(231)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("cedil"), (SubLObject)SubLObjectFactory.makeInteger(184)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("cent"), (SubLObject)SubLObjectFactory.makeInteger(162)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("chi"), (SubLObject)SubLObjectFactory.makeInteger(967)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("circ"), (SubLObject)SubLObjectFactory.makeInteger(710)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("clubs"), (SubLObject)SubLObjectFactory.makeInteger(9827)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("cong"), (SubLObject)SubLObjectFactory.makeInteger(8773)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("copy"), (SubLObject)SubLObjectFactory.makeInteger(169)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("crarr"), (SubLObject)SubLObjectFactory.makeInteger(8629)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("cup"), (SubLObject)SubLObjectFactory.makeInteger(8746)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("curren"), (SubLObject)SubLObjectFactory.makeInteger(164)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("dArr"), (SubLObject)SubLObjectFactory.makeInteger(8659)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("dagger"), (SubLObject)SubLObjectFactory.makeInteger(8224)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("darr"), (SubLObject)SubLObjectFactory.makeInteger(8595)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("deg"), (SubLObject)SubLObjectFactory.makeInteger(176)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("delta"), (SubLObject)SubLObjectFactory.makeInteger(948)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("diams"), (SubLObject)SubLObjectFactory.makeInteger(9830)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("divide"), (SubLObject)SubLObjectFactory.makeInteger(247)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("eacute"), (SubLObject)SubLObjectFactory.makeInteger(233)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("ecirc"), (SubLObject)SubLObjectFactory.makeInteger(234)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("egrave"), (SubLObject)SubLObjectFactory.makeInteger(232)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("empty"), (SubLObject)SubLObjectFactory.makeInteger(8709)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("emsp"), (SubLObject)SubLObjectFactory.makeInteger(8195)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("ensp"), (SubLObject)SubLObjectFactory.makeInteger(8194)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("epsilon"), (SubLObject)SubLObjectFactory.makeInteger(949)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("equiv"), (SubLObject)SubLObjectFactory.makeInteger(8801)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("eta"), (SubLObject)SubLObjectFactory.makeInteger(951)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("eth"), (SubLObject)SubLObjectFactory.makeInteger(240)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("euml"), (SubLObject)SubLObjectFactory.makeInteger(235)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("euro"), (SubLObject)SubLObjectFactory.makeInteger(8364)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("exist"), (SubLObject)SubLObjectFactory.makeInteger(8707)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("fnof"), (SubLObject)SubLObjectFactory.makeInteger(402)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("forall"), (SubLObject)SubLObjectFactory.makeInteger(8704)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("frac12"), (SubLObject)SubLObjectFactory.makeInteger(189)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("frac14"), (SubLObject)SubLObjectFactory.makeInteger(188)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("frac34"), (SubLObject)SubLObjectFactory.makeInteger(190)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("frasl"), (SubLObject)SubLObjectFactory.makeInteger(8260)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("gamma"), (SubLObject)SubLObjectFactory.makeInteger(947)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("ge"), (SubLObject)SubLObjectFactory.makeInteger(8805)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("gt"), (SubLObject)SubLObjectFactory.makeInteger(62)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("hArr"), (SubLObject)SubLObjectFactory.makeInteger(8660)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("harr"), (SubLObject)SubLObjectFactory.makeInteger(8596)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("hearts"), (SubLObject)SubLObjectFactory.makeInteger(9829)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("hellip"), (SubLObject)SubLObjectFactory.makeInteger(8230)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("iacute"), (SubLObject)SubLObjectFactory.makeInteger(237)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("icirc"), (SubLObject)SubLObjectFactory.makeInteger(238)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("iexcl"), (SubLObject)SubLObjectFactory.makeInteger(161)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("igrave"), (SubLObject)SubLObjectFactory.makeInteger(236)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("image"), (SubLObject)SubLObjectFactory.makeInteger(8465)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("infin"), (SubLObject)SubLObjectFactory.makeInteger(8734)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("int"), (SubLObject)SubLObjectFactory.makeInteger(8747)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("iota"), (SubLObject)SubLObjectFactory.makeInteger(953)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("iquest"), (SubLObject)SubLObjectFactory.makeInteger(191)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("isin"), (SubLObject)SubLObjectFactory.makeInteger(8712)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("iuml"), (SubLObject)SubLObjectFactory.makeInteger(239)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("kappa"), (SubLObject)SubLObjectFactory.makeInteger(954)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("lArr"), (SubLObject)SubLObjectFactory.makeInteger(8656)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("lambda"), (SubLObject)SubLObjectFactory.makeInteger(955)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("lang"), (SubLObject)SubLObjectFactory.makeInteger(9001)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("laquo"), (SubLObject)SubLObjectFactory.makeInteger(171)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("larr"), (SubLObject)SubLObjectFactory.makeInteger(8592)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("lceil"), (SubLObject)SubLObjectFactory.makeInteger(8968)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("ldquo"), (SubLObject)SubLObjectFactory.makeInteger(8220)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("le"), (SubLObject)SubLObjectFactory.makeInteger(8804)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("lfloor"), (SubLObject)SubLObjectFactory.makeInteger(8970)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("lowast"), (SubLObject)SubLObjectFactory.makeInteger(8727)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("loz"), (SubLObject)SubLObjectFactory.makeInteger(9674)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("lrm"), (SubLObject)SubLObjectFactory.makeInteger(8206)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("lsaquo"), (SubLObject)SubLObjectFactory.makeInteger(8249)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("lsquo"), (SubLObject)SubLObjectFactory.makeInteger(8216)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("lt"), (SubLObject)SubLObjectFactory.makeInteger(60)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("macr"), (SubLObject)SubLObjectFactory.makeInteger(175)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("mdash"), (SubLObject)SubLObjectFactory.makeInteger(8212)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("micro"), (SubLObject)SubLObjectFactory.makeInteger(181)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("middot"), (SubLObject)SubLObjectFactory.makeInteger(183)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("minus"), (SubLObject)SubLObjectFactory.makeInteger(8722)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("mu"), (SubLObject)SubLObjectFactory.makeInteger(956)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("nabla"), (SubLObject)SubLObjectFactory.makeInteger(8711)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("nbsp"), (SubLObject)SubLObjectFactory.makeInteger(160)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("ndash"), (SubLObject)SubLObjectFactory.makeInteger(8211)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("ne"), (SubLObject)SubLObjectFactory.makeInteger(8800)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("ni"), (SubLObject)SubLObjectFactory.makeInteger(8715)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("not"), (SubLObject)SubLObjectFactory.makeInteger(172)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("notin"), (SubLObject)SubLObjectFactory.makeInteger(8713)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("nsub"), (SubLObject)SubLObjectFactory.makeInteger(8836)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("ntilde"), (SubLObject)SubLObjectFactory.makeInteger(241)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("nu"), (SubLObject)SubLObjectFactory.makeInteger(957)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("oacute"), (SubLObject)SubLObjectFactory.makeInteger(243)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("ocirc"), (SubLObject)SubLObjectFactory.makeInteger(244)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("oelig"), (SubLObject)SubLObjectFactory.makeInteger(339)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("ograve"), (SubLObject)SubLObjectFactory.makeInteger(242)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("oline"), (SubLObject)SubLObjectFactory.makeInteger(8254)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("omega"), (SubLObject)SubLObjectFactory.makeInteger(969)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("omicron"), (SubLObject)SubLObjectFactory.makeInteger(959)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("oplus"), (SubLObject)SubLObjectFactory.makeInteger(8853)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("or"), (SubLObject)SubLObjectFactory.makeInteger(8744)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("ordf"), (SubLObject)SubLObjectFactory.makeInteger(170)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("ordm"), (SubLObject)SubLObjectFactory.makeInteger(186)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("oslash"), (SubLObject)SubLObjectFactory.makeInteger(248)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("otilde"), (SubLObject)SubLObjectFactory.makeInteger(245)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("otimes"), (SubLObject)SubLObjectFactory.makeInteger(8855)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("ouml"), (SubLObject)SubLObjectFactory.makeInteger(246)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("para"), (SubLObject)SubLObjectFactory.makeInteger(182)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("part"), (SubLObject)SubLObjectFactory.makeInteger(8706)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("permil"), (SubLObject)SubLObjectFactory.makeInteger(8240)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("perp"), (SubLObject)SubLObjectFactory.makeInteger(8869)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("phi"), (SubLObject)SubLObjectFactory.makeInteger(966)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("pi"), (SubLObject)SubLObjectFactory.makeInteger(960)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("piv"), (SubLObject)SubLObjectFactory.makeInteger(982)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("plusmn"), (SubLObject)SubLObjectFactory.makeInteger(177)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("pound"), (SubLObject)SubLObjectFactory.makeInteger(163)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("prime"), (SubLObject)SubLObjectFactory.makeInteger(8242)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("prod"), (SubLObject)SubLObjectFactory.makeInteger(8719)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("prop"), (SubLObject)SubLObjectFactory.makeInteger(8733)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("psi"), (SubLObject)SubLObjectFactory.makeInteger(968)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("quot"), (SubLObject)SubLObjectFactory.makeInteger(34)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rArr"), (SubLObject)SubLObjectFactory.makeInteger(8658)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("radic"), (SubLObject)SubLObjectFactory.makeInteger(8730)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rang"), (SubLObject)SubLObjectFactory.makeInteger(9002)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("raquo"), (SubLObject)SubLObjectFactory.makeInteger(187)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rarr"), (SubLObject)SubLObjectFactory.makeInteger(8594)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rceil"), (SubLObject)SubLObjectFactory.makeInteger(8969)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rdquo"), (SubLObject)SubLObjectFactory.makeInteger(8221)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("real"), (SubLObject)SubLObjectFactory.makeInteger(8476)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("reg"), (SubLObject)SubLObjectFactory.makeInteger(174)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rfloor"), (SubLObject)SubLObjectFactory.makeInteger(8971)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rho"), (SubLObject)SubLObjectFactory.makeInteger(961)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rlm"), (SubLObject)SubLObjectFactory.makeInteger(8207)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rsaquo"), (SubLObject)SubLObjectFactory.makeInteger(8250)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("rsquo"), (SubLObject)SubLObjectFactory.makeInteger(8217)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("sbquo"), (SubLObject)SubLObjectFactory.makeInteger(8218)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("scaron"), (SubLObject)SubLObjectFactory.makeInteger(353)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("sdot"), (SubLObject)SubLObjectFactory.makeInteger(8901)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("sect"), (SubLObject)SubLObjectFactory.makeInteger(167)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("shy"), (SubLObject)SubLObjectFactory.makeInteger(173)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("sigma"), (SubLObject)SubLObjectFactory.makeInteger(963)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("sigmaf"), (SubLObject)SubLObjectFactory.makeInteger(962)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("sim"), (SubLObject)SubLObjectFactory.makeInteger(8764)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("spades"), (SubLObject)SubLObjectFactory.makeInteger(9824)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("sub"), (SubLObject)SubLObjectFactory.makeInteger(8834)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("sube"), (SubLObject)SubLObjectFactory.makeInteger(8838)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("sum"), (SubLObject)SubLObjectFactory.makeInteger(8721)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("sup"), (SubLObject)SubLObjectFactory.makeInteger(8835)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("sup1"), (SubLObject)SubLObjectFactory.makeInteger(185)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("sup2"), (SubLObject)SubLObjectFactory.makeInteger(178)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("sup3"), (SubLObject)SubLObjectFactory.makeInteger(179)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("supe"), (SubLObject)SubLObjectFactory.makeInteger(8839)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("szlig"), (SubLObject)SubLObjectFactory.makeInteger(223)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("tau"), (SubLObject)SubLObjectFactory.makeInteger(964)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("there4"), (SubLObject)SubLObjectFactory.makeInteger(8756)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("theta"), (SubLObject)SubLObjectFactory.makeInteger(952)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("thetasym"), (SubLObject)SubLObjectFactory.makeInteger(977)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("thinsp"), (SubLObject)SubLObjectFactory.makeInteger(8201)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("thorn"), (SubLObject)SubLObjectFactory.makeInteger(254)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("tilde"), (SubLObject)SubLObjectFactory.makeInteger(732)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("times"), (SubLObject)SubLObjectFactory.makeInteger(215)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("trade"), (SubLObject)SubLObjectFactory.makeInteger(8482)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("uArr"), (SubLObject)SubLObjectFactory.makeInteger(8657)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("uacute"), (SubLObject)SubLObjectFactory.makeInteger(250)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("uarr"), (SubLObject)SubLObjectFactory.makeInteger(8593)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("ucirc"), (SubLObject)SubLObjectFactory.makeInteger(251)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("ugrave"), (SubLObject)SubLObjectFactory.makeInteger(249)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("uml"), (SubLObject)SubLObjectFactory.makeInteger(168)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("upsih"), (SubLObject)SubLObjectFactory.makeInteger(978)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("upsilon"), (SubLObject)SubLObjectFactory.makeInteger(965)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("uuml"), (SubLObject)SubLObjectFactory.makeInteger(252)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("weierp"), (SubLObject)SubLObjectFactory.makeInteger(8472)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("xi"), (SubLObject)SubLObjectFactory.makeInteger(958)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("yacute"), (SubLObject)SubLObjectFactory.makeInteger(253)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("yen"), (SubLObject)SubLObjectFactory.makeInteger(165)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("yuml"), (SubLObject)SubLObjectFactory.makeInteger(255)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("zeta"), (SubLObject)SubLObjectFactory.makeInteger(950)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("zwj"), (SubLObject)SubLObjectFactory.makeInteger(8205)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("zwnj"), (SubLObject)SubLObjectFactory.makeInteger(8204)) });
    }
    
    @Override
	public void declareFunctions() {
        declare_unicode_strings_file();
    }
    
    @Override
	public void initializeVariables() {
        init_unicode_strings_file();
    }
    
    @Override
	public void runTopLevelForms() {
        setup_unicode_strings_file();
    }
    
    static {
        me = (SubLFile)new unicode_strings();
        unicode_strings.$max_unicode_value$ = null;
        unicode_strings.$dtp_unicode_char$ = null;
        unicode_strings.$dtp_unicode_string$ = null;
        unicode_strings.$default_non_ascii_placeholder_char$ = null;
        unicode_strings.$default_unicode_to_ascii_code_map$ = null;
        unicode_strings.$html_40_character_entity_table$ = null;
        unicode_strings.$cfasl_opcode_unicode_char$ = null;
        unicode_strings.$cfasl_opcode_unicode_string$ = null;
        $int0$1114111 = SubLObjectFactory.makeInteger(1114111);
        $sym1$UNICODE_CHAR = SubLObjectFactory.makeSymbol("UNICODE-CHAR");
        $sym2$UNICODE_CHAR_P = SubLObjectFactory.makeSymbol("UNICODE-CHAR-P");
        $list3 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("UCHAR"));
        $list4 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("UCHAR"));
        $list5 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("UNICODE-CHAR-UCHAR"));
        $list6 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("_CSETF-UNICODE-CHAR-UCHAR"));
        $sym7$PRINT_UNICODE_CHAR = SubLObjectFactory.makeSymbol("PRINT-UNICODE-CHAR");
        $sym8$UNICODE_CHAR_PRINT_FUNCTION_TRAMPOLINE = SubLObjectFactory.makeSymbol("UNICODE-CHAR-PRINT-FUNCTION-TRAMPOLINE");
        $list9 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("UNICODE-CHAR-P"));
        $sym10$UNICODE_CHAR_UCHAR = SubLObjectFactory.makeSymbol("UNICODE-CHAR-UCHAR");
        $sym11$_CSETF_UNICODE_CHAR_UCHAR = SubLObjectFactory.makeSymbol("_CSETF-UNICODE-CHAR-UCHAR");
        $kw12$UCHAR = SubLObjectFactory.makeKeyword("UCHAR");
        $str13$Invalid_slot__S_for_construction_ = SubLObjectFactory.makeString("Invalid slot ~S for construction function");
        $kw14$BEGIN = SubLObjectFactory.makeKeyword("BEGIN");
        $sym15$MAKE_UNICODE_CHAR = SubLObjectFactory.makeSymbol("MAKE-UNICODE-CHAR");
        $kw16$SLOT = SubLObjectFactory.makeKeyword("SLOT");
        $kw17$END = SubLObjectFactory.makeKeyword("END");
        $sym18$VISIT_DEFSTRUCT_OBJECT_UNICODE_CHAR_METHOD = SubLObjectFactory.makeSymbol("VISIT-DEFSTRUCT-OBJECT-UNICODE-CHAR-METHOD");
        $str19$_u_x = SubLObjectFactory.makeString("#u~x");
        $str20$_u0_x = SubLObjectFactory.makeString("#u0~x");
        $sym21$UNICODE_CHARACTER_P = SubLObjectFactory.makeSymbol("UNICODE-CHARACTER-P");
        $sym22$UNICODE_STRING = SubLObjectFactory.makeSymbol("UNICODE-STRING");
        $sym23$UNICODE_STRING_P = SubLObjectFactory.makeSymbol("UNICODE-STRING-P");
        $list24 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("VECT"));
        $list25 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VECT"));
        $list26 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("UNICODE-STRING-VECT"));
        $list27 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("_CSETF-UNICODE-STRING-VECT"));
        $sym28$PRINT_UNICODE_STRING = SubLObjectFactory.makeSymbol("PRINT-UNICODE-STRING");
        $sym29$UNICODE_STRING_PRINT_FUNCTION_TRAMPOLINE = SubLObjectFactory.makeSymbol("UNICODE-STRING-PRINT-FUNCTION-TRAMPOLINE");
        $list30 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("UNICODE-STRING-P"));
        $sym31$UNICODE_STRING_VECT = SubLObjectFactory.makeSymbol("UNICODE-STRING-VECT");
        $sym32$_CSETF_UNICODE_STRING_VECT = SubLObjectFactory.makeSymbol("_CSETF-UNICODE-STRING-VECT");
        $kw33$VECT = SubLObjectFactory.makeKeyword("VECT");
        $sym34$MAKE_UNICODE_STRING = SubLObjectFactory.makeSymbol("MAKE-UNICODE-STRING");
        $sym35$VISIT_DEFSTRUCT_OBJECT_UNICODE_STRING_METHOD = SubLObjectFactory.makeSymbol("VISIT-DEFSTRUCT-OBJECT-UNICODE-STRING-METHOD");
        $str36$_u__a_ = SubLObjectFactory.makeString("#u\"~a\"");
        $sym37$UNICODE_VECTOR_STRING_P = SubLObjectFactory.makeSymbol("UNICODE-VECTOR-STRING-P");
        $int38$127 = SubLObjectFactory.makeInteger(127);
        $kw39$HTML_ESCAPED_ASCII = SubLObjectFactory.makeKeyword("HTML-ESCAPED-ASCII");
        $kw40$ESCAPED_PROBABLY_UTF8 = SubLObjectFactory.makeKeyword("ESCAPED-PROBABLY-UTF8");
        $kw41$SUBL_STRING = SubLObjectFactory.makeKeyword("SUBL-STRING");
        $kw42$PROBABLY_UTF8 = SubLObjectFactory.makeKeyword("PROBABLY-UTF8");
        $kw43$UNK = SubLObjectFactory.makeKeyword("UNK");
        $int44$128 = SubLObjectFactory.makeInteger(128);
        $kw45$OPEN = SubLObjectFactory.makeKeyword("OPEN");
        $kw46$START_UNICODE = SubLObjectFactory.makeKeyword("START-UNICODE");
        $kw47$UNICODE_CHAR = SubLObjectFactory.makeKeyword("UNICODE-CHAR");
        $kw48$UNICDE_CHAR = SubLObjectFactory.makeKeyword("UNICDE-CHAR");
        $sym49$DISPLAY_VECTOR_STRING_P = SubLObjectFactory.makeSymbol("DISPLAY-VECTOR-STRING-P");
        $sym50$ASCII_CHAR_P = SubLObjectFactory.makeSymbol("ASCII-CHAR-P");
        $list51 = ConsesLow.list(new SubLObject[] { ConsesLow.cons((SubLObject)SubLObjectFactory.makeInteger(183), (SubLObject)SubLObjectFactory.makeInteger(42)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeInteger(192), (SubLObject)SubLObjectFactory.makeInteger(65)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeInteger(193), (SubLObject)SubLObjectFactory.makeInteger(65)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeInteger(194), (SubLObject)SubLObjectFactory.makeInteger(65)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeInteger(195), (SubLObject)SubLObjectFactory.makeInteger(65)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeInteger(196), (SubLObject)SubLObjectFactory.makeInteger(65)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeInteger(197), (SubLObject)SubLObjectFactory.makeInteger(65)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeInteger(200), (SubLObject)SubLObjectFactory.makeInteger(69)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeInteger(201), (SubLObject)SubLObjectFactory.makeInteger(69)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeInteger(202), (SubLObject)SubLObjectFactory.makeInteger(69)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeInteger(203), (SubLObject)SubLObjectFactory.makeInteger(69)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeInteger(204), (SubLObject)SubLObjectFactory.makeInteger(73)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeInteger(205), (SubLObject)SubLObjectFactory.makeInteger(73)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeInteger(206), (SubLObject)SubLObjectFactory.makeInteger(73)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeInteger(207), (SubLObject)SubLObjectFactory.makeInteger(73)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeInteger(209), (SubLObject)SubLObjectFactory.makeInteger(78)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeInteger(210), (SubLObject)SubLObjectFactory.makeInteger(79)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeInteger(211), (SubLObject)SubLObjectFactory.makeInteger(79)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeInteger(212), (SubLObject)SubLObjectFactory.makeInteger(79)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeInteger(213), (SubLObject)SubLObjectFactory.makeInteger(79)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeInteger(214), (SubLObject)SubLObjectFactory.makeInteger(79)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeInteger(216), (SubLObject)SubLObjectFactory.makeInteger(79)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeInteger(217), (SubLObject)SubLObjectFactory.makeInteger(85)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeInteger(218), (SubLObject)SubLObjectFactory.makeInteger(85)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeInteger(219), (SubLObject)SubLObjectFactory.makeInteger(85)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeInteger(220), (SubLObject)SubLObjectFactory.makeInteger(85)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeInteger(221), (SubLObject)SubLObjectFactory.makeInteger(89)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeInteger(224), (SubLObject)SubLObjectFactory.makeInteger(97)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeInteger(225), (SubLObject)SubLObjectFactory.makeInteger(97)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeInteger(226), (SubLObject)SubLObjectFactory.makeInteger(97)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeInteger(227), (SubLObject)SubLObjectFactory.makeInteger(97)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeInteger(228), (SubLObject)SubLObjectFactory.makeInteger(97)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeInteger(229), (SubLObject)SubLObjectFactory.makeInteger(97)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeInteger(231), (SubLObject)SubLObjectFactory.makeInteger(99)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeInteger(232), (SubLObject)SubLObjectFactory.makeInteger(101)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeInteger(233), (SubLObject)SubLObjectFactory.makeInteger(101)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeInteger(234), (SubLObject)SubLObjectFactory.makeInteger(101)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeInteger(235), (SubLObject)SubLObjectFactory.makeInteger(101)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeInteger(236), (SubLObject)SubLObjectFactory.makeInteger(105)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeInteger(237), (SubLObject)SubLObjectFactory.makeInteger(105)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeInteger(238), (SubLObject)SubLObjectFactory.makeInteger(105)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeInteger(239), (SubLObject)SubLObjectFactory.makeInteger(105)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeInteger(240), (SubLObject)SubLObjectFactory.makeInteger(100)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeInteger(241), (SubLObject)SubLObjectFactory.makeInteger(110)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeInteger(242), (SubLObject)SubLObjectFactory.makeInteger(111)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeInteger(243), (SubLObject)SubLObjectFactory.makeInteger(111)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeInteger(244), (SubLObject)SubLObjectFactory.makeInteger(111)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeInteger(245), (SubLObject)SubLObjectFactory.makeInteger(111)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeInteger(246), (SubLObject)SubLObjectFactory.makeInteger(111)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeInteger(248), (SubLObject)SubLObjectFactory.makeInteger(111)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeInteger(249), (SubLObject)SubLObjectFactory.makeInteger(117)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeInteger(250), (SubLObject)SubLObjectFactory.makeInteger(117)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeInteger(251), (SubLObject)SubLObjectFactory.makeInteger(117)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeInteger(252), (SubLObject)SubLObjectFactory.makeInteger(117)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeInteger(253), (SubLObject)SubLObjectFactory.makeInteger(121)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeInteger(255), (SubLObject)SubLObjectFactory.makeInteger(121)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeInteger(323), (SubLObject)SubLObjectFactory.makeInteger(110)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeInteger(324), (SubLObject)SubLObjectFactory.makeInteger(110)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeInteger(8217), (SubLObject)SubLObjectFactory.makeInteger(39)) });
        $str52$__ = SubLObjectFactory.makeString("\\\"");
        $str53$__ = SubLObjectFactory.makeString("\\\\");
        $str54$_u26_ = SubLObjectFactory.makeString("&u26;");
        $int55$32 = SubLObjectFactory.makeInteger(32);
        $str56$0 = SubLObjectFactory.makeString("0");
        $str57$_u_A_ = SubLObjectFactory.makeString("&u~A;");
        $sym58$UTF8_VECTOR_STRING_P = SubLObjectFactory.makeSymbol("UTF8-VECTOR-STRING-P");
        $str59$Invalid_UTF_8_encoding_at__S_in__ = SubLObjectFactory.makeString("Invalid UTF-8 encoding at ~S in ~S");
        $int60$2047 = SubLObjectFactory.makeInteger(2047);
        $int61$65535 = SubLObjectFactory.makeInteger(65535);
        $int62$2097151 = SubLObjectFactory.makeInteger(2097151);
        $int63$67108863 = SubLObjectFactory.makeInteger(67108863);
        $str64$__ = SubLObjectFactory.makeString("#(");
        $str65$_x_x_ = SubLObjectFactory.makeString("#x~x ");
        $str66$___ = SubLObjectFactory.makeString(")~%");
        $int67$192 = SubLObjectFactory.makeInteger(192);
        $int68$_6 = SubLObjectFactory.makeInteger(-6);
        $int69$63 = SubLObjectFactory.makeInteger(63);
        $int70$224 = SubLObjectFactory.makeInteger(224);
        $int71$_12 = SubLObjectFactory.makeInteger(-12);
        $int72$240 = SubLObjectFactory.makeInteger(240);
        $int73$_18 = SubLObjectFactory.makeInteger(-18);
        $int74$248 = SubLObjectFactory.makeInteger(248);
        $int75$_24 = SubLObjectFactory.makeInteger(-24);
        $int76$193 = SubLObjectFactory.makeInteger(193);
        $int77$245 = SubLObjectFactory.makeInteger(245);
        $sym78$VECTORP = SubLObjectFactory.makeSymbol("VECTORP");
        $int79$31 = SubLObjectFactory.makeInteger(31);
        $int80$24 = SubLObjectFactory.makeInteger(24);
        $str81$__x = SubLObjectFactory.makeString("&#x");
        $int82$38 = SubLObjectFactory.makeInteger(38);
        $kw83$START_HTML_ESCAPE = SubLObjectFactory.makeKeyword("START-HTML-ESCAPE");
        $int84$60 = SubLObjectFactory.makeInteger(60);
        $kw85$INSIDE_TAG = SubLObjectFactory.makeKeyword("INSIDE-TAG");
        $int86$62 = SubLObjectFactory.makeInteger(62);
        $int87$35 = SubLObjectFactory.makeInteger(35);
        $kw88$HTML_NUMERIC_ESCAPE_START = SubLObjectFactory.makeKeyword("HTML-NUMERIC-ESCAPE-START");
        $kw89$ENTITY_ESCAPE = SubLObjectFactory.makeKeyword("ENTITY-ESCAPE");
        $int90$120 = SubLObjectFactory.makeInteger(120);
        $kw91$HTML_HEXADECIMAL_ESCAPE = SubLObjectFactory.makeKeyword("HTML-HEXADECIMAL-ESCAPE");
        $int92$48 = SubLObjectFactory.makeInteger(48);
        $int93$57 = SubLObjectFactory.makeInteger(57);
        $kw94$HTML_DECIMAL_ESCAPE = SubLObjectFactory.makeKeyword("HTML-DECIMAL-ESCAPE");
        $int95$59 = SubLObjectFactory.makeInteger(59);
        $sym96$CODE_CHAR = SubLObjectFactory.makeSymbol("CODE-CHAR");
        $int97$256 = SubLObjectFactory.makeInteger(256);
        $sym98$__ = SubLObjectFactory.makeSymbol("<=");
        $sym99$CHAR_CODE = SubLObjectFactory.makeSymbol("CHAR-CODE");
        $str100$_S__code___S__is_not_a_valid_utf8 = SubLObjectFactory.makeString("~S (code: ~S) is not a valid utf8 character");
        $sym101$STRINGP = SubLObjectFactory.makeSymbol("STRINGP");
        $list102 = _constant_102_initializer();
        $int103$52 = SubLObjectFactory.makeInteger(52);
        $sym104$CFASL_INPUT_UNICODE_CHAR = SubLObjectFactory.makeSymbol("CFASL-INPUT-UNICODE-CHAR");
        $sym105$CFASL_OUTPUT_OBJECT_UNICODE_CHAR_METHOD = SubLObjectFactory.makeSymbol("CFASL-OUTPUT-OBJECT-UNICODE-CHAR-METHOD");
        $str106$Invalid_unicode_character__expect = SubLObjectFactory.makeString("Invalid unicode character, expected ~A bytes, got ~A only.");
        $int107$53 = SubLObjectFactory.makeInteger(53);
        $sym108$CFASL_INPUT_UNICODE_STRING = SubLObjectFactory.makeSymbol("CFASL-INPUT-UNICODE-STRING");
        $sym109$CFASL_OUTPUT_OBJECT_UNICODE_STRING_METHOD = SubLObjectFactory.makeSymbol("CFASL-OUTPUT-OBJECT-UNICODE-STRING-METHOD");
        $sym110$HTML_ESCAPED_UTF8_STRING_TO_UTF8_STRING = SubLObjectFactory.makeSymbol("HTML-ESCAPED-UTF8-STRING-TO-UTF8-STRING");
        $kw111$TEST = SubLObjectFactory.makeKeyword("TEST");
        $kw112$OWNER = SubLObjectFactory.makeKeyword("OWNER");
        $kw113$CLASSES = SubLObjectFactory.makeKeyword("CLASSES");
        $kw114$KB = SubLObjectFactory.makeKeyword("KB");
        $kw115$TINY = SubLObjectFactory.makeKeyword("TINY");
        $kw116$WORKING_ = SubLObjectFactory.makeKeyword("WORKING?");
        $list117 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("Japan&#39;s")), (SubLObject)SubLObjectFactory.makeString("Japan's")));
    }
    
    public static final class $unicode_char_native extends SubLStructNative
    {
        public SubLObject $uchar;
        private static final SubLStructDeclNative structDecl;
        
        public $unicode_char_native() {
            this.$uchar = (SubLObject)CommonSymbols.NIL;
        }
        
        @Override
		public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$unicode_char_native.structDecl;
        }
        
        @Override
		public SubLObject getField2() {
            return this.$uchar;
        }
        
        @Override
		public SubLObject setField2(final SubLObject value) {
            return this.$uchar = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$unicode_char_native.class, unicode_strings.$sym1$UNICODE_CHAR, unicode_strings.$sym2$UNICODE_CHAR_P, unicode_strings.$list3, unicode_strings.$list4, new String[] { "$uchar" }, unicode_strings.$list5, unicode_strings.$list6, unicode_strings.$sym7$PRINT_UNICODE_CHAR);
        }
    }
    
    public static final class $unicode_char_p$UnaryFunction extends UnaryFunction
    {
        public $unicode_char_p$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("UNICODE-CHAR-P"));
        }
        
        @Override
		public SubLObject processItem(final SubLObject arg1) {
            return unicode_strings.unicode_char_p(arg1);
        }
    }
    
    public static final class $unicode_string_native extends SubLStructNative
    {
        public SubLObject $vect;
        private static final SubLStructDeclNative structDecl;
        
        public $unicode_string_native() {
            this.$vect = (SubLObject)CommonSymbols.NIL;
        }
        
        @Override
		public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$unicode_string_native.structDecl;
        }
        
        @Override
		public SubLObject getField2() {
            return this.$vect;
        }
        
        @Override
		public SubLObject setField2(final SubLObject value) {
            return this.$vect = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$unicode_string_native.class, unicode_strings.$sym22$UNICODE_STRING, unicode_strings.$sym23$UNICODE_STRING_P, unicode_strings.$list24, unicode_strings.$list25, new String[] { "$vect" }, unicode_strings.$list26, unicode_strings.$list27, unicode_strings.$sym28$PRINT_UNICODE_STRING);
        }
    }
    
    public static final class $unicode_string_p$UnaryFunction extends UnaryFunction
    {
        public $unicode_string_p$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("UNICODE-STRING-P"));
        }
        
        @Override
		public SubLObject processItem(final SubLObject arg1) {
            return unicode_strings.unicode_string_p(arg1);
        }
    }
}

/*

	Total time: 410 ms
	
*/