package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.StreamsLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Packages;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class format_nil extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.format_nil";
    public static final String myFingerPrint = "3430c26f2e1621fd1cd84a0ba5a8d8c2b25ca528b4d0a0602c74d99bb9ef3f77";
    @SubLTranslatedFile.SubL(source = "cycl/format-nil.lisp", position = 3999L)
    public static SubLSymbol $format_nil_percent$;
    @SubLTranslatedFile.SubL(source = "cycl/format-nil.lisp", position = 4175L)
    public static SubLSymbol $format_nil_tilde$;
    private static final SubLList $list0;
    private static final SubLSymbol $sym1$FORMAT;
    private static final SubLSymbol $sym2$INTEGERP;
    private static final SubLString $str3$0123456789;
    private static final SubLSymbol $sym4$FORMAT_NIL_A;
    private static final SubLSymbol $sym5$FORMAT_NIL;
    private static final SubLSymbol $sym6$FORMAT_NIL_A_NO_COPY;
    private static final SubLSymbol $sym7$FORMAT_NIL_S;
    private static final SubLSymbol $sym8$FORMAT_NIL_S_NO_COPY;
    private static final SubLSymbol $sym9$FORMAT_NIL_D;
    private static final SubLSymbol $sym10$NUMBERP;
    private static final SubLSymbol $sym11$FORMAT_NIL_D_NO_COPY;
    private static final SubLString $str12$_;
    private static final SubLSymbol $sym13$FORMAT_NIL_PERCENT;
    private static final SubLString $str14$_;
    private static final SubLSymbol $sym15$FORMAT_NIL_TILDE;
    private static final SubLString $str16$ASD__;
    private static final SubLSymbol $sym17$CHAR_EQUAL;
    private static final SubLSymbol $sym18$_FORMAT_NIL_PERCENT_;
    private static final SubLList $list19;
    private static final SubLSymbol $sym20$_FORMAT_NIL_TILDE_;
    private static final SubLList $list21;
    private static final SubLSymbol $sym22$COPY_SEQ;
    private static final SubLList $list23;
    private static final SubLSymbol $sym24$CCONCATENATE;
    private static final SubLList $list25;
    private static final SubLString $str26$_A;
    private static final SubLString $str27$_S;
    private static final SubLString $str28$_D;
    private static final SubLString $str29$__;
    private static final SubLString $str30$__;
    private static final SubLSymbol $sym31$STRINGP;
    private static final SubLString $str32$;
    private static final SubLString $str33$___A;
    
    @SubLTranslatedFile.SubL(source = "cycl/format-nil.lisp", position = 1219L)
    public static SubLObject format_nil(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject format_control = (SubLObject)format_nil.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)format_nil.$list0);
        format_control = current.first();
        final SubLObject format_arguments;
        current = (format_arguments = current.rest());
        if (format_nil.NIL != format_nil_control_validator(format_control)) {
            return format_nil_internal(format_control, format_arguments);
        }
        return (SubLObject)ConsesLow.listS((SubLObject)format_nil.$sym1$FORMAT, (SubLObject)format_nil.NIL, format_control, ConsesLow.append(format_arguments, (SubLObject)format_nil.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/format-nil.lisp", position = 1548L)
    public static SubLObject princ_integer_to_string(final SubLObject integer) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert format_nil.NIL != Types.integerp(integer) : integer;
        if (integer.isBignum() || !format_nil.TEN_INTEGER.eql(print_high.$print_base$.getDynamicValue(thread))) {
            return print_high.princ_to_string(integer);
        }
        final SubLObject string_length = Numbers.add((SubLObject)(integer.isNegative() ? format_nil.ONE_INTEGER : format_nil.ZERO_INTEGER), integer_decimal_length(integer));
        SubLObject string = Strings.make_string(string_length, (SubLObject)format_nil.UNPROVIDED);
        SubLObject magnitude = Numbers.abs(integer);
        final SubLObject digits = (SubLObject)format_nil.$str3$0123456789;
        SubLObject digit = (SubLObject)format_nil.NIL;
        SubLObject index = (SubLObject)format_nil.ZERO_INTEGER;
        while (!magnitude.numL((SubLObject)format_nil.TEN_INTEGER)) {
            digit = Numbers.mod(magnitude, (SubLObject)format_nil.TEN_INTEGER);
            magnitude = Numbers.integerDivide(magnitude, (SubLObject)format_nil.TEN_INTEGER);
            Strings.set_char(string, index, Strings.sublisp_char(digits, digit));
            index = Numbers.add(index, (SubLObject)format_nil.ONE_INTEGER);
        }
        Strings.set_char(string, index, Strings.sublisp_char(digits, magnitude));
        index = Numbers.add(index, (SubLObject)format_nil.ONE_INTEGER);
        if (integer.isNegative()) {
            Strings.set_char(string, index, (SubLObject)Characters.CHAR_hyphen);
        }
        string = Sequences.nreverse(string);
        return string;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/format-nil.lisp", position = 2386L)
    public static SubLObject format_nil_a(final SubLObject v_object) {
        if (v_object.isSymbol()) {
            return Sequences.copy_seq(Symbols.symbol_name(v_object));
        }
        if (v_object.isString()) {
            return Sequences.copy_seq(v_object);
        }
        if (v_object.isInteger()) {
            return princ_integer_to_string(v_object);
        }
        return print_high.princ_to_string(v_object);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/format-nil.lisp", position = 2699L)
    public static SubLObject format_nil_a_no_copy(final SubLObject v_object) {
        if (v_object.isSymbol()) {
            return Symbols.symbol_name(v_object);
        }
        if (v_object.isString()) {
            return v_object;
        }
        if (v_object.isInteger()) {
            return princ_integer_to_string(v_object);
        }
        return print_high.princ_to_string(v_object);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/format-nil.lisp", position = 3019L)
    public static SubLObject format_nil_s(final SubLObject v_object) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (v_object.isSymbol() && Packages.$package$.getDynamicValue(thread).eql(Symbols.symbol_package(v_object)) && v_object.eql(Packages.find_symbol(Symbols.symbol_name(v_object), Packages.$package$.getDynamicValue(thread)))) {
            return format_nil_a(v_object);
        }
        if (v_object.isNumber()) {
            return format_nil_a(v_object);
        }
        return print_high.prin1_to_string(v_object);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/format-nil.lisp", position = 3362L)
    public static SubLObject format_nil_s_no_copy(final SubLObject v_object) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (v_object.isSymbol() && Packages.$package$.getDynamicValue(thread).eql(Symbols.symbol_package(v_object)) && v_object.eql(Packages.find_symbol(Symbols.symbol_name(v_object), Packages.$package$.getDynamicValue(thread)))) {
            return format_nil_a_no_copy(v_object);
        }
        if (v_object.isNumber()) {
            return format_nil_a_no_copy(v_object);
        }
        return print_high.prin1_to_string(v_object);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/format-nil.lisp", position = 3728L)
    public static SubLObject format_nil_d(final SubLObject v_object) {
        assert format_nil.NIL != Types.numberp(v_object) : v_object;
        return format_nil_a(v_object);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/format-nil.lisp", position = 3856L)
    public static SubLObject format_nil_d_no_copy(final SubLObject v_object) {
        assert format_nil.NIL != Types.numberp(v_object) : v_object;
        return format_nil_a_no_copy(v_object);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/format-nil.lisp", position = 4068L)
    public static SubLObject format_nil_percent() {
        return Sequences.copy_seq(format_nil.$format_nil_percent$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/format-nil.lisp", position = 4241L)
    public static SubLObject format_nil_tilde() {
        return Sequences.copy_seq(format_nil.$format_nil_tilde$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/format-nil.lisp", position = 4344L)
    public static SubLObject format_nil_internal(final SubLObject format_control, final SubLObject format_arguments) {
        return format_nil_simplify(format_nil_expand(format_nil_control_split(format_control), format_arguments));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/format-nil.lisp", position = 4627L)
    public static SubLObject format_nil_control_validator(final SubLObject format_control) {
        if (!format_control.isString()) {
            return (SubLObject)format_nil.NIL;
        }
        final SubLObject length = Sequences.length(format_control);
        SubLObject next_start;
        SubLObject next_control;
        SubLObject control_type_pos;
        SubLObject control_type;
        for (next_start = (SubLObject)format_nil.NIL, next_control = (SubLObject)format_nil.NIL, next_start = (SubLObject)format_nil.ZERO_INTEGER, next_control = Sequences.position((SubLObject)Characters.CHAR_tilde, format_control, Symbols.symbol_function((SubLObject)format_nil.EQL), Symbols.symbol_function((SubLObject)format_nil.IDENTITY), next_start, (SubLObject)format_nil.NIL); format_nil.NIL != next_control; next_control = Sequences.position((SubLObject)Characters.CHAR_tilde, format_control, Symbols.symbol_function((SubLObject)format_nil.EQL), Symbols.symbol_function((SubLObject)format_nil.IDENTITY), next_start, (SubLObject)format_nil.NIL)) {
            control_type_pos = Numbers.add((SubLObject)format_nil.ONE_INTEGER, next_control);
            if (!control_type_pos.numL(length)) {
                return (SubLObject)format_nil.NIL;
            }
            control_type = Strings.sublisp_char(format_control, control_type_pos);
            if (format_nil.NIL == Sequences.find(control_type, (SubLObject)format_nil.$str16$ASD__, Symbols.symbol_function((SubLObject)format_nil.$sym17$CHAR_EQUAL), (SubLObject)format_nil.UNPROVIDED, (SubLObject)format_nil.UNPROVIDED, (SubLObject)format_nil.UNPROVIDED)) {
                return (SubLObject)format_nil.NIL;
            }
            next_start = Numbers.add(next_control, (SubLObject)format_nil.TWO_INTEGER);
        }
        return (SubLObject)format_nil.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/format-nil.lisp", position = 5398L)
    public static SubLObject format_nil_simplify(final SubLObject expansion) {
        if (format_nil.NIL == expansion.rest()) {
            final SubLObject item = expansion.first();
            if (item.isAtom()) {
                if (item == format_nil.$sym18$_FORMAT_NIL_PERCENT_) {
                    return (SubLObject)format_nil.$list19;
                }
                if (item == format_nil.$sym20$_FORMAT_NIL_TILDE_) {
                    return (SubLObject)format_nil.$list21;
                }
                if (item.isString()) {
                    return (SubLObject)ConsesLow.list((SubLObject)format_nil.$sym22$COPY_SEQ, item);
                }
            }
            else {
                SubLObject current;
                final SubLObject datum = current = item;
                SubLObject operator = (SubLObject)format_nil.NIL;
                SubLObject arg = (SubLObject)format_nil.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)format_nil.$list23);
                operator = current.first();
                current = current.rest();
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)format_nil.$list23);
                arg = current.first();
                current = current.rest();
                if (format_nil.NIL == current) {
                    if (operator == format_nil.$sym6$FORMAT_NIL_A_NO_COPY) {
                        return (SubLObject)ConsesLow.list((SubLObject)format_nil.$sym4$FORMAT_NIL_A, arg);
                    }
                    if (operator == format_nil.$sym8$FORMAT_NIL_S_NO_COPY) {
                        return (SubLObject)ConsesLow.list((SubLObject)format_nil.$sym7$FORMAT_NIL_S, arg);
                    }
                    if (operator == format_nil.$sym11$FORMAT_NIL_D_NO_COPY) {
                        return (SubLObject)ConsesLow.list((SubLObject)format_nil.$sym9$FORMAT_NIL_D, arg);
                    }
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)format_nil.$list23);
                }
            }
        }
        return reader.bq_cons((SubLObject)format_nil.$sym24$CCONCATENATE, ConsesLow.append(expansion, (SubLObject)format_nil.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/format-nil.lisp", position = 6182L)
    public static SubLObject format_nil_expand(final SubLObject format_controls, final SubLObject format_arguments) {
        if (format_nil.NIL == format_controls) {
            return (SubLObject)format_nil.NIL;
        }
        SubLObject next_control = (SubLObject)format_nil.NIL;
        SubLObject rest_control = (SubLObject)format_nil.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(format_controls, format_controls, (SubLObject)format_nil.$list25);
        next_control = format_controls.first();
        final SubLObject current = rest_control = format_controls.rest();
        final SubLObject next_argument = format_arguments.first();
        final SubLObject rest_arguments = format_arguments.rest();
        if (format_nil.$str26$_A.equalp(next_control)) {
            return (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)format_nil.$sym6$FORMAT_NIL_A_NO_COPY, next_argument), format_nil_expand(rest_control, rest_arguments));
        }
        if (format_nil.$str27$_S.equalp(next_control)) {
            return (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)format_nil.$sym8$FORMAT_NIL_S_NO_COPY, next_argument), format_nil_expand(rest_control, rest_arguments));
        }
        if (format_nil.$str28$_D.equalp(next_control)) {
            return (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)format_nil.$sym11$FORMAT_NIL_D_NO_COPY, next_argument), format_nil_expand(rest_control, rest_arguments));
        }
        if (format_nil.$str29$__.equalp(next_control)) {
            return (SubLObject)ConsesLow.cons((SubLObject)format_nil.$sym18$_FORMAT_NIL_PERCENT_, format_nil_expand(rest_control, format_arguments));
        }
        if (format_nil.$str30$__.equalp(next_control)) {
            return (SubLObject)ConsesLow.cons((SubLObject)format_nil.$sym20$_FORMAT_NIL_TILDE_, format_nil_expand(rest_control, format_arguments));
        }
        return (SubLObject)ConsesLow.cons(next_control, format_nil_expand(rest_control, format_arguments));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/format-nil.lisp", position = 7365L)
    public static SubLObject format_nil_control_split(final SubLObject format_control) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert format_nil.NIL != Types.stringp(format_control) : format_control;
        if (format_control.equal((SubLObject)format_nil.$str32$)) {
            return (SubLObject)format_nil.NIL;
        }
        thread.resetMultipleValues();
        final SubLObject next_control = format_nil_control_split_internal(format_control);
        final SubLObject rest_control = thread.secondMultipleValue();
        thread.resetMultipleValues();
        return (SubLObject)ConsesLow.cons(next_control, format_nil_control_split(rest_control));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/format-nil.lisp", position = 7772L)
    public static SubLObject format_nil_control_split_internal(final SubLObject format_control) {
        final SubLObject position = Sequences.position((SubLObject)Characters.CHAR_tilde, format_control, (SubLObject)format_nil.UNPROVIDED, (SubLObject)format_nil.UNPROVIDED, (SubLObject)format_nil.UNPROVIDED, (SubLObject)format_nil.UNPROVIDED);
        if (format_nil.NIL == position) {
            return Values.values(format_control, (SubLObject)format_nil.$str32$);
        }
        if (format_nil.ZERO_INTEGER.numE(position)) {
            return Values.values(Sequences.subseq(format_control, (SubLObject)format_nil.ZERO_INTEGER, (SubLObject)format_nil.TWO_INTEGER), Sequences.subseq(format_control, (SubLObject)format_nil.TWO_INTEGER, (SubLObject)format_nil.NIL));
        }
        return Values.values(Sequences.subseq(format_control, (SubLObject)format_nil.ZERO_INTEGER, position), Sequences.subseq(format_control, position, (SubLObject)format_nil.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/format-nil.lisp", position = 8182L)
    public static SubLObject integer_decimal_length(final SubLObject integer) {
        assert format_nil.NIL != Types.integerp(integer) : integer;
        SubLObject magnitude = Numbers.abs(integer);
        SubLObject length = (SubLObject)format_nil.ONE_INTEGER;
        while (!magnitude.numL((SubLObject)format_nil.TEN_INTEGER)) {
            length = Numbers.add(length, (SubLObject)format_nil.ONE_INTEGER);
            magnitude = Numbers.integerDivide(magnitude, (SubLObject)format_nil.TEN_INTEGER);
        }
        return length;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/format-nil.lisp", position = 8502L)
    public static SubLObject format_one_per_line(final SubLObject objects, SubLObject stream) {
        if (stream == format_nil.UNPROVIDED) {
            stream = StreamsLow.$standard_output$.getDynamicValue();
        }
        SubLObject cdolist_list_var = objects;
        SubLObject obj = (SubLObject)format_nil.NIL;
        obj = cdolist_list_var.first();
        while (format_nil.NIL != cdolist_list_var) {
            PrintLow.format(stream, (SubLObject)format_nil.$str33$___A, obj);
            cdolist_list_var = cdolist_list_var.rest();
            obj = cdolist_list_var.first();
        }
        streams_high.force_output(stream);
        return (SubLObject)format_nil.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/format-nil.lisp", position = 8962L)
    public static SubLObject print_one_per_line(final SubLObject objects, SubLObject stream) {
        if (stream == format_nil.UNPROVIDED) {
            stream = StreamsLow.$standard_output$.getDynamicValue();
        }
        return print_one_aspect_per_line(objects, Symbols.symbol_function((SubLObject)format_nil.IDENTITY), stream);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/format-nil.lisp", position = 9205L)
    public static SubLObject p1(final SubLObject objects, SubLObject stream) {
        if (stream == format_nil.UNPROVIDED) {
            stream = StreamsLow.$standard_output$.getDynamicValue();
        }
        return print_one_per_line(objects, stream);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/format-nil.lisp", position = 9359L)
    public static SubLObject print_one_aspect_per_line(final SubLObject objects, final SubLObject key, SubLObject stream) {
        if (stream == format_nil.UNPROVIDED) {
            stream = StreamsLow.$standard_output$.getDynamicValue();
        }
        SubLObject cdolist_list_var = objects;
        SubLObject obj = (SubLObject)format_nil.NIL;
        obj = cdolist_list_var.first();
        while (format_nil.NIL != cdolist_list_var) {
            print_high.print(Functions.funcall(key, obj), stream);
            cdolist_list_var = cdolist_list_var.rest();
            obj = cdolist_list_var.first();
        }
        return (SubLObject)format_nil.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/format-nil.lisp", position = 9693L)
    public static SubLObject force_format(final SubLObject stream, final SubLObject control_string, SubLObject arg1, SubLObject arg2, SubLObject arg3, SubLObject arg4, SubLObject arg5, SubLObject arg6, SubLObject arg7, SubLObject arg8) {
        if (arg1 == format_nil.UNPROVIDED) {
            arg1 = (SubLObject)format_nil.NIL;
        }
        if (arg2 == format_nil.UNPROVIDED) {
            arg2 = (SubLObject)format_nil.NIL;
        }
        if (arg3 == format_nil.UNPROVIDED) {
            arg3 = (SubLObject)format_nil.NIL;
        }
        if (arg4 == format_nil.UNPROVIDED) {
            arg4 = (SubLObject)format_nil.NIL;
        }
        if (arg5 == format_nil.UNPROVIDED) {
            arg5 = (SubLObject)format_nil.NIL;
        }
        if (arg6 == format_nil.UNPROVIDED) {
            arg6 = (SubLObject)format_nil.NIL;
        }
        if (arg7 == format_nil.UNPROVIDED) {
            arg7 = (SubLObject)format_nil.NIL;
        }
        if (arg8 == format_nil.UNPROVIDED) {
            arg8 = (SubLObject)format_nil.NIL;
        }
        final SubLObject result = PrintLow.format(stream, control_string, new SubLObject[] { arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8 });
        streams_high.force_output(stream);
        return result;
    }
    
    public static SubLObject declare_format_nil_file() {
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.format_nil", "format_nil", "FORMAT-NIL");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.format_nil", "princ_integer_to_string", "PRINC-INTEGER-TO-STRING", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.format_nil", "format_nil_a", "FORMAT-NIL-A", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.format_nil", "format_nil_a_no_copy", "FORMAT-NIL-A-NO-COPY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.format_nil", "format_nil_s", "FORMAT-NIL-S", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.format_nil", "format_nil_s_no_copy", "FORMAT-NIL-S-NO-COPY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.format_nil", "format_nil_d", "FORMAT-NIL-D", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.format_nil", "format_nil_d_no_copy", "FORMAT-NIL-D-NO-COPY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.format_nil", "format_nil_percent", "FORMAT-NIL-PERCENT", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.format_nil", "format_nil_tilde", "FORMAT-NIL-TILDE", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.format_nil", "format_nil_internal", "FORMAT-NIL-INTERNAL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.format_nil", "format_nil_control_validator", "FORMAT-NIL-CONTROL-VALIDATOR", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.format_nil", "format_nil_simplify", "FORMAT-NIL-SIMPLIFY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.format_nil", "format_nil_expand", "FORMAT-NIL-EXPAND", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.format_nil", "format_nil_control_split", "FORMAT-NIL-CONTROL-SPLIT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.format_nil", "format_nil_control_split_internal", "FORMAT-NIL-CONTROL-SPLIT-INTERNAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.format_nil", "integer_decimal_length", "INTEGER-DECIMAL-LENGTH", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.format_nil", "format_one_per_line", "FORMAT-ONE-PER-LINE", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.format_nil", "print_one_per_line", "PRINT-ONE-PER-LINE", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.format_nil", "p1", "P1", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.format_nil", "print_one_aspect_per_line", "PRINT-ONE-ASPECT-PER-LINE", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.format_nil", "force_format", "FORCE-FORMAT", 2, 8, false);
        return (SubLObject)format_nil.NIL;
    }
    
    public static SubLObject init_format_nil_file() {
        format_nil.$format_nil_percent$ = SubLFiles.defconstant("*FORMAT-NIL-PERCENT*", (SubLObject)format_nil.$str12$_);
        format_nil.$format_nil_tilde$ = SubLFiles.defconstant("*FORMAT-NIL-TILDE*", (SubLObject)format_nil.$str14$_);
        return (SubLObject)format_nil.NIL;
    }
    
    public static SubLObject setup_format_nil_file() {
        access_macros.register_macro_helper((SubLObject)format_nil.$sym4$FORMAT_NIL_A, (SubLObject)format_nil.$sym5$FORMAT_NIL);
        access_macros.register_macro_helper((SubLObject)format_nil.$sym6$FORMAT_NIL_A_NO_COPY, (SubLObject)format_nil.$sym5$FORMAT_NIL);
        access_macros.register_macro_helper((SubLObject)format_nil.$sym7$FORMAT_NIL_S, (SubLObject)format_nil.$sym5$FORMAT_NIL);
        access_macros.register_macro_helper((SubLObject)format_nil.$sym8$FORMAT_NIL_S_NO_COPY, (SubLObject)format_nil.$sym5$FORMAT_NIL);
        access_macros.register_macro_helper((SubLObject)format_nil.$sym9$FORMAT_NIL_D, (SubLObject)format_nil.$sym5$FORMAT_NIL);
        access_macros.register_macro_helper((SubLObject)format_nil.$sym11$FORMAT_NIL_D_NO_COPY, (SubLObject)format_nil.$sym5$FORMAT_NIL);
        access_macros.register_macro_helper((SubLObject)format_nil.$sym13$FORMAT_NIL_PERCENT, (SubLObject)format_nil.$sym5$FORMAT_NIL);
        access_macros.register_macro_helper((SubLObject)format_nil.$sym15$FORMAT_NIL_TILDE, (SubLObject)format_nil.$sym5$FORMAT_NIL);
        return (SubLObject)format_nil.NIL;
    }
    
    @Override
	public void declareFunctions() {
        declare_format_nil_file();
    }
    
    @Override
	public void initializeVariables() {
        init_format_nil_file();
    }
    
    @Override
	public void runTopLevelForms() {
        setup_format_nil_file();
    }
    
    static {
        me = (SubLFile)new format_nil();
        format_nil.$format_nil_percent$ = null;
        format_nil.$format_nil_tilde$ = null;
        $list0 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FORMAT-CONTROL"), (SubLObject)SubLObjectFactory.makeSymbol("&REST"), (SubLObject)SubLObjectFactory.makeSymbol("FORMAT-ARGUMENTS"));
        $sym1$FORMAT = SubLObjectFactory.makeSymbol("FORMAT");
        $sym2$INTEGERP = SubLObjectFactory.makeSymbol("INTEGERP");
        $str3$0123456789 = SubLObjectFactory.makeString("0123456789");
        $sym4$FORMAT_NIL_A = SubLObjectFactory.makeSymbol("FORMAT-NIL-A");
        $sym5$FORMAT_NIL = SubLObjectFactory.makeSymbol("FORMAT-NIL");
        $sym6$FORMAT_NIL_A_NO_COPY = SubLObjectFactory.makeSymbol("FORMAT-NIL-A-NO-COPY");
        $sym7$FORMAT_NIL_S = SubLObjectFactory.makeSymbol("FORMAT-NIL-S");
        $sym8$FORMAT_NIL_S_NO_COPY = SubLObjectFactory.makeSymbol("FORMAT-NIL-S-NO-COPY");
        $sym9$FORMAT_NIL_D = SubLObjectFactory.makeSymbol("FORMAT-NIL-D");
        $sym10$NUMBERP = SubLObjectFactory.makeSymbol("NUMBERP");
        $sym11$FORMAT_NIL_D_NO_COPY = SubLObjectFactory.makeSymbol("FORMAT-NIL-D-NO-COPY");
        $str12$_ = SubLObjectFactory.makeString("\n");
        $sym13$FORMAT_NIL_PERCENT = SubLObjectFactory.makeSymbol("FORMAT-NIL-PERCENT");
        $str14$_ = SubLObjectFactory.makeString("~");
        $sym15$FORMAT_NIL_TILDE = SubLObjectFactory.makeSymbol("FORMAT-NIL-TILDE");
        $str16$ASD__ = SubLObjectFactory.makeString("ASD%~");
        $sym17$CHAR_EQUAL = SubLObjectFactory.makeSymbol("CHAR-EQUAL");
        $sym18$_FORMAT_NIL_PERCENT_ = SubLObjectFactory.makeSymbol("*FORMAT-NIL-PERCENT*");
        $list19 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FORMAT-NIL-PERCENT"));
        $sym20$_FORMAT_NIL_TILDE_ = SubLObjectFactory.makeSymbol("*FORMAT-NIL-TILDE*");
        $list21 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FORMAT-NIL-TILDE"));
        $sym22$COPY_SEQ = SubLObjectFactory.makeSymbol("COPY-SEQ");
        $list23 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPERATOR"), (SubLObject)SubLObjectFactory.makeSymbol("ARG"));
        $sym24$CCONCATENATE = SubLObjectFactory.makeSymbol("CCONCATENATE");
        $list25 = (SubLList)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("NEXT-CONTROL"), (SubLObject)SubLObjectFactory.makeSymbol("REST-CONTROL"));
        $str26$_A = SubLObjectFactory.makeString("~A");
        $str27$_S = SubLObjectFactory.makeString("~S");
        $str28$_D = SubLObjectFactory.makeString("~D");
        $str29$__ = SubLObjectFactory.makeString("~%");
        $str30$__ = SubLObjectFactory.makeString("~~");
        $sym31$STRINGP = SubLObjectFactory.makeSymbol("STRINGP");
        $str32$ = SubLObjectFactory.makeString("");
        $str33$___A = SubLObjectFactory.makeString("~%~A");
    }
}

/*

	Total time: 131 ms
	
*/