/**
 *
 */
/**
 * For LarKC
 */
/**
 *
 */
package com.cyc.tool.subl.jrtl.translatedCode.sublisp;


import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.append;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.listS;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.make_list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.rplacd;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.bind;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.currentBinding;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.rebind;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.sublisp_throw;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.eq;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.identity;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Eval.eval;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.apply;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.funcall;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.clrhash;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.getEntryKey;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.getEntrySetIterator;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.getEntryValue;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.gethash;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.hash_table_count;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.iteratorHasNext;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.iteratorNextEntry;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.make_hash_table;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.releaseEntrySetIterator;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.remhash;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.sethash;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.divide;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.expt;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.jrtl_parse_integer;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.logand;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.logior;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.minus;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.multiply;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.numL;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.plusp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.sublisp_float;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.subtract;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Packages.$package$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Packages.find_package;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Packages.find_symbol;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Packages.intern;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.delete;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.length;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.nreverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.subseq;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.def_csetf;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.makeStructDeclNative;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.register_method;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.boundp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.make_keyword;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.make_symbol;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_name;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.getValuesAsVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.restoreValuesFromVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.values;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors.aref;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors.make_vector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors.set_aref;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeDouble;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeInteger;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeUninternedSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.cdestructuring_bind_error;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_listp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.assoc;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cadr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cddr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.last;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.$print_base$;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.$print_object_method_table$;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.close;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.make_private_string_input_stream;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.read_char;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.stream_input_index;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.unread_char;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.declareMacro;
import static com.cyc.tool.subl.util.SubLFiles.defconstant;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;
import static com.cyc.tool.subl.util.SubLFiles.defvar;
import static com.cyc.tool.subl.util.SubLFiles.defvarCheckCL;

import java.util.Iterator;
import java.util.Map;

import org.armedbear.lisp.Lisp;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Guids;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.StreamsLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
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
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLFloat;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


public class reader extends SubLTranslatedFile {
    public static class $read_token_native extends SubLStructNative {
        public $read_token_native() {
            $pointer = Lisp.NIL;
            $buffer = Lisp.NIL;
            $escapes = Lisp.NIL;
        }

        public SubLObject $pointer;

        public SubLObject $buffer;

        public SubLObject $escapes;

        private static SubLStructDeclNative structDecl;

        static {
            structDecl = makeStructDeclNative(reader.$read_token_native.class, READ_TOKEN, READ_TOKEN_P, $list121, $list122, new String[]{ "$pointer", "$buffer", "$escapes" }, $list123, $list124, DEFAULT_STRUCT_PRINT_FUNCTION);
        }

        @Override
        public SubLObject getField2() {
            return $pointer;
        }

        @Override
        public SubLObject getField3() {
            return $buffer;
        }

        @Override
        public SubLObject getField4() {
            return $escapes;
        }

        @Override
        public SubLStructDecl getStructDecl() {
            return structDecl;
        }

        @Override
        public SubLObject setField2(SubLObject value) {
            return $pointer = value;
        }

        @Override
        public SubLObject setField3(SubLObject value) {
            return $buffer = value;
        }

        @Override
        public SubLObject setField4(SubLObject value) {
            return $escapes = value;
        }
    }

    public static class $read_token_p$UnaryFunction extends UnaryFunction {
        public $read_token_p$UnaryFunction() {
            super(extractFunctionNamed("READ-TOKEN-P"));
        }

        @Override
        public SubLObject processItem(SubLObject arg1) {
            return read_token_p(arg1);
        }
    }

    public static class $readtable_native extends SubLStructNative {
        public $readtable_native() {
            $case = Lisp.NIL;
            $character_syntax = Lisp.NIL;
            $single_byte_char_syntax = Lisp.NIL;
            $macro_functions = Lisp.NIL;
            $single_byte_macro_functions = Lisp.NIL;
            $constituent_traits = Lisp.NIL;
            $single_byte_constit_traits = Lisp.NIL;
            $dispatch_tables = Lisp.NIL;
        }

        public SubLObject $case;

        public SubLObject $character_syntax;

        public SubLObject $single_byte_char_syntax;

        public SubLObject $macro_functions;

        public SubLObject $single_byte_macro_functions;

        public SubLObject $constituent_traits;

        public SubLObject $single_byte_constit_traits;

        public SubLObject $dispatch_tables;

        final private static SubLStructDeclNative structDecl;

        static {
            structDecl = makeStructDeclNative(reader.$readtable_native.class, READTABLE, READTABLE_P, $list8, $list9, new String[]{ "$case", "$character_syntax", "$single_byte_char_syntax", "$macro_functions", "$single_byte_macro_functions", "$constituent_traits", "$single_byte_constit_traits", "$dispatch_tables" }, $list10, $list11, DEFAULT_STRUCT_PRINT_FUNCTION);
        }

        @Override
        public SubLObject getField2() {
            return $case;
        }

        @Override
        public SubLObject getField3() {
            return $character_syntax;
        }

        @Override
        public SubLObject getField4() {
            return $single_byte_char_syntax;
        }

        @Override
        public SubLObject getField5() {
            return $macro_functions;
        }

        @Override
        public SubLObject getField6() {
            return $single_byte_macro_functions;
        }

        @Override
        public SubLObject getField7() {
            return $constituent_traits;
        }

        @Override
        public SubLObject getField8() {
            return $single_byte_constit_traits;
        }

        @Override
        public SubLObject getField9() {
            return $dispatch_tables;
        }

        @Override
        public SubLStructDecl getStructDecl() {
            return structDecl;
        }

        @Override
        public SubLObject setField2(SubLObject value) {
            return $case = value;
        }

        @Override
        public SubLObject setField3(SubLObject value) {
            return $character_syntax = value;
        }

        @Override
        public SubLObject setField4(SubLObject value) {
            return $single_byte_char_syntax = value;
        }

        @Override
        public SubLObject setField5(SubLObject value) {
            return $macro_functions = value;
        }

        @Override
        public SubLObject setField6(SubLObject value) {
            return $single_byte_macro_functions = value;
        }

        @Override
        public SubLObject setField7(SubLObject value) {
            return $constituent_traits = value;
        }

        @Override
        public SubLObject setField8(SubLObject value) {
            return $single_byte_constit_traits = value;
        }

        @Override
        public SubLObject setField9(SubLObject value) {
            return $dispatch_tables = value;
        }
    }

    public static class $readtable_p$UnaryFunction extends UnaryFunction {
        public $readtable_p$UnaryFunction() {
            super(extractFunctionNamed("READTABLE-P"));
        }

        @Override
        public SubLObject processItem(SubLObject arg1) {
            return readtable_p(arg1);
        }
    }

    public static SubLObject _csetf_read_token_buffer(SubLObject object, SubLObject value) {
        assert NIL != read_token_p(object) : "reader.read_token_p " + object;
        return object.setField3(value);
    }

    public static SubLObject _csetf_read_token_escapes(SubLObject object, SubLObject value) {
        assert NIL != read_token_p(object) : "reader.read_token_p " + object;
        return object.setField4(value);
    }

    public static SubLObject _csetf_read_token_pointer(SubLObject object, SubLObject value) {
        assert NIL != read_token_p(object) : "reader.read_token_p " + object;
        return object.setField2(value);
    }

    public static SubLObject _csetf_readtable_case(SubLObject object, SubLObject value) {
        assert NIL != readtable_p(object) : "reader.readtable_p " + object;
        return object.setField2(value);
    }

    public static SubLObject _csetf_readtable_character_syntax(SubLObject object, SubLObject value) {
        assert NIL != readtable_p(object) : "reader.readtable_p " + object;
        return object.setField3(value);
    }

    public static SubLObject _csetf_readtable_constituent_traits(SubLObject object, SubLObject value) {
        assert NIL != readtable_p(object) : "reader.readtable_p " + object;
        return object.setField7(value);
    }

    public static SubLObject _csetf_readtable_dispatch_tables(SubLObject object, SubLObject value) {
        assert NIL != readtable_p(object) : "reader.readtable_p " + object;
        return object.setField9(value);
    }

    public static SubLObject _csetf_readtable_macro_functions(SubLObject object, SubLObject value) {
        assert NIL != readtable_p(object) : "reader.readtable_p " + object;
        return object.setField5(value);
    }

    public static SubLObject _csetf_readtable_single_byte_char_syntax(SubLObject object, SubLObject value) {
        assert NIL != readtable_p(object) : "reader.readtable_p " + object;
        return object.setField4(value);
    }

    public static SubLObject _csetf_readtable_single_byte_constit_traits(SubLObject object, SubLObject value) {
        assert NIL != readtable_p(object) : "reader.readtable_p " + object;
        return object.setField8(value);
    }

    public static SubLObject _csetf_readtable_single_byte_macro_functions(SubLObject object, SubLObject value) {
        assert NIL != readtable_p(object) : "reader.readtable_p " + object;
        return object.setField6(value);
    }

    public static SubLObject add_to_token(SubLObject ch, SubLObject token, SubLObject escapep) {
        SubLObject buffer = read_token_buffer(token);
        SubLObject length = length(buffer);
        if (read_token_pointer(token).numGE(length)) {
            SubLObject new_buffer = Strings.make_string(multiply(length, TWO_INTEGER), UNPROVIDED);
            SubLObject i;
            for (i = NIL, i = ZERO_INTEGER; i.numL(length); i = add(i, ONE_INTEGER))
                Strings.set_char(new_buffer, i, Strings.sublisp_char(buffer, i));

            _csetf_read_token_buffer(token, new_buffer);
        }
        Strings.set_char(read_token_buffer(token), read_token_pointer(token), ch);
        if (NIL != escapep)
            _csetf_read_token_escapes(token, cons(read_token_pointer(token), read_token_escapes(token)));

        _csetf_read_token_pointer(token, add(read_token_pointer(token), ONE_INTEGER));
        return ch;
    }

    public static SubLObject alphabetic_traitp(SubLObject ch) {
        SubLThread thread = SubLProcess.currentSubLThread();
        return makeBoolean(logand($alphabetic$.getGlobalValue(), character_traits(ch, $readtable$.getDynamicValue(thread))).isPositive() && ((!logand($digit$.getGlobalValue(), character_traits(ch, $readtable$.getDynamicValue(thread))).isPositive()) || (NIL == digit_char_p(ch, $read_base$.getDynamicValue(thread)))));
    }

    public static SubLObject alphadigit_traitp(SubLObject ch) {
        SubLThread thread = SubLProcess.currentSubLThread();
        return makeBoolean(logand($alphabetic$.getGlobalValue(), character_traits(ch, $readtable$.getDynamicValue(thread))).isPositive() && logand($digit$.getGlobalValue(), character_traits(ch, $readtable$.getDynamicValue(thread))).isPositive());
    }

    public static SubLObject backquote_rmf(SubLObject stream, SubLObject ch) {
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        SubLObject _prev_bind_0 = $backquote_depth$.currentBinding(thread);
        try {
            $backquote_depth$.bind(add($backquote_depth$.getDynamicValue(thread), ONE_INTEGER), thread);
            thread.resetMultipleValues();
            SubLObject flag = backquotify(stream, read(stream, T, NIL, T));
            SubLObject thing = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (flag.eql($bq_atsign$.getDynamicValue(thread)) || flag.eql($bq_dot$.getDynamicValue(thread)))
                simple_reader_error($str205$_A_read_after_backquote_in__S_, list(flag, thing));

            result = backquotify_1(flag, thing);
        } finally {
            $backquote_depth$.rebind(_prev_bind_0, thread);
        }
        return values(result, LIST);
    }

    public static SubLObject backquotify(SubLObject stream, SubLObject code) {
        SubLThread thread = SubLProcess.currentSubLThread();
        if (code.isAtom()) {
            if (NIL == code)
                return values(NIL, NIL);

            if (NIL != self_evaluating_atom_p(code))
                return values(T, code);

            return values(QUOTE, code);
        } else {
            if (code.first().eql($bq_atsign$.getDynamicValue(thread)) || code.first().eql($bq_dot$.getDynamicValue(thread)))
                return values(code.first(), code.rest());

            if (code.first().eql($bq_comma$.getDynamicValue(thread))) {
                thread.resetMultipleValues();
                SubLObject flag = comma(code.rest());
                SubLObject thing = thread.secondMultipleValue();
                thread.resetMultipleValues();
                return values(flag, thing);
            }
            if (code.first().eql($bq_vector$.getDynamicValue(thread))) {
                thread.resetMultipleValues();
                SubLObject dflag = backquotify(stream, code.rest());
                SubLObject d = thread.secondMultipleValue();
                thread.resetMultipleValues();
                return values(VECTOR, backquotify_1(dflag, d));
            }
            thread.resetMultipleValues();
            SubLObject aflag = backquotify(stream, code.first());
            SubLObject a = thread.secondMultipleValue();
            thread.resetMultipleValues();
            thread.resetMultipleValues();
            SubLObject dflag2 = backquotify(stream, code.rest());
            SubLObject d2 = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (dflag2.eql($bq_atsign$.getDynamicValue(thread)) || dflag2.eql($bq_dot$.getDynamicValue(thread)))
                simple_reader_error($str198$_A_after_dot_in__S_, list(dflag2, code));

            if (aflag.eql($bq_atsign$.getDynamicValue(thread)))
                return values(APPEND, dflag2 == APPEND ? cons(a, d2) : list(a, backquotify_1(dflag2, d2)));

            if (aflag.eql($bq_dot$.getDynamicValue(thread)))
                return values(NCONC, dflag2 == NCONC ? cons(a, d2) : list(a, backquotify_1(dflag2, d2)));

            if (NIL == dflag2) {
                if (NIL != member(aflag, $list199, UNPROVIDED, UNPROVIDED))
                    return values(QUOTE, list(a));

                return values(LIST, list(backquotify_1(aflag, a)));
            } else
                if ((dflag2 == QUOTE) || (dflag2 == T)) {
                    if (NIL != member(aflag, $list199, UNPROVIDED, UNPROVIDED))
                        return values(QUOTE, cons(a, d2));

                    return values($sym188$LIST_, list(backquotify_1(aflag, a), backquotify_1(dflag2, d2)));
                } else {
                    a = backquotify_1(aflag, a);
                    if ((dflag2 == LIST) || (dflag2 == $sym188$LIST_))
                        return values(dflag2, cons(a, d2));

                    return values($sym188$LIST_, list(a, backquotify_1(dflag2, d2)));
                }

        }
    }

    public static SubLObject backquotify_1(SubLObject flag, SubLObject thing) {
        SubLThread thread = SubLProcess.currentSubLThread();
        if ((flag.eql($bq_comma$.getDynamicValue(thread)) || (flag == T)) || (flag == NIL))
            return thing;

        if (flag == QUOTE)
            return list(QUOTE, thing);

        if (flag == $sym188$LIST_) {
            if (NIL != cddr(thing))
                return cons($sym202$BQ_LIST_, thing);

            return cons(BQ_CONS, thing);
        } else {
            if (flag == VECTOR)
                return list(BQ_VECTOR, thing);

            return cons(assoc(flag, $list204, UNPROVIDED, UNPROVIDED).rest(), thing);
        }
    }

    public static SubLObject bq_append(SubLObject macroform, SubLObject environment) {
        SubLObject datum = macroform.rest();
        SubLObject lists;
        lists = datum;
        return bq_cons(APPEND, append(lists, NIL));
    }

    public static SubLObject bq_cons(SubLObject car, SubLObject cdr) {
        return cons(car, cdr);
    }

    public static SubLObject bq_list(SubLObject macroform, SubLObject environment) {
        SubLObject datum = macroform.rest();
        SubLObject objects;
        objects = datum;
        return bq_cons(LIST, append(objects, NIL));
    }

    public static SubLObject bq_listX(SubLObject macroform, SubLObject environment) {
        SubLObject datum = macroform.rest();
        SubLObject objects = datum;
        return bq_cons($sym188$LIST_, append(objects, NIL));
    }

    public static SubLObject bq_nconc(SubLObject macroform, SubLObject environment) {
        SubLObject datum = macroform.rest();
        SubLObject lists;
        lists = datum;
        return bq_cons(NCONC, append(lists, NIL));
    }

    public static SubLObject bq_vector(SubLObject contents) {
        return apply(symbol_function(VECTOR), contents);
    }

    public static SubLObject bq_vector_append(SubLObject macroform, SubLObject environment) {
        SubLObject datum = macroform.rest();
        SubLObject lists;
        lists = datum;
        return list(BQ_VECTOR, bq_cons(BQ_APPEND, append(lists, NIL)));
    }

    public static SubLObject character_function(SubLObject ch, SubLObject readtable) {
        if (readtable == UNPROVIDED)
            readtable = $readtable$.getDynamicValue();

        if (NIL != single_byte_p(ch))
            return aref(readtable_single_byte_macro_functions(readtable), char_code(ch));

        SubLObject func = gethash(ch, readtable_macro_functions(readtable), UNPROVIDED);
        return NIL != func ? func : CONSTITUENT_RMF;
    }

    public static SubLObject character_syntax(SubLObject macroform, SubLObject environment) {
        SubLObject current;
        SubLObject datum = current = macroform.rest();
        SubLObject ch = NIL;
        destructuring_bind_must_consp(current, datum, $list51);
        ch = current.first();
        current = current.rest();
        SubLObject readtable = (current.isCons()) ? current.first() : $readtable$;
        destructuring_bind_must_listp(current, datum, $list51);
        current = current.rest();
        if (NIL == current)
            return list(FIF, list(SINGLE_BYTE_P, ch), list(AREF, list(READTABLE_SINGLE_BYTE_CHAR_SYNTAX, readtable), list(CHAR_CODE, ch)), listS(GETHASH, ch, list(READTABLE_CHARACTER_SYNTAX, readtable), $list58));

        cdestructuring_bind_error(datum, $list51);
        return NIL;
    }

    public static SubLObject character_traits(SubLObject ch, SubLObject readtable) {
        if (readtable == UNPROVIDED)
            readtable = $readtable$.getDynamicValue();

        return NIL != single_byte_p(ch) ? aref(readtable_single_byte_constit_traits(readtable), char_code(ch)) : gethash(ch, readtable_constituent_traits(readtable), $alphabetic$.getGlobalValue());
    }

    public static SubLObject comma(SubLObject code) {
        SubLThread thread = SubLProcess.currentSubLThread();
        if (code.isAtom()) {
            if (NIL == code)
                return values(NIL, NIL);

            if (NIL != self_evaluating_atom_p(code))
                return values(T, code);

            return values($bq_comma$.getDynamicValue(thread), code);
        } else {
            if (code.first() == QUOTE)
                return values(code.first(), cadr(code));

            if (NIL != member(code.first(), $list200, UNPROVIDED, UNPROVIDED))
                return values(code.first(), code.rest());

            if (code.first() == CONS)
                return values($sym188$LIST_, code.rest());

            return values($bq_comma$.getDynamicValue(thread), code);
        }
    }

    public static SubLObject comma_rmf(SubLObject stream, SubLObject ch) {
        SubLThread thread = SubLProcess.currentSubLThread();
        if (!$backquote_depth$.getDynamicValue(thread).isZero()) {
            SubLObject peek_char = read_char(stream, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            SubLObject result = NIL;
            SubLObject _prev_bind_0 = $backquote_depth$.currentBinding(thread);
            try {
                $backquote_depth$.bind(subtract($backquote_depth$.getDynamicValue(thread), ONE_INTEGER), thread);
                SubLObject pcase_var = peek_char;
                if (pcase_var.eql(CHAR_at))
                    result = cons($bq_atsign$.getDynamicValue(thread), read(stream, T, NIL, T));
                else
                    if (pcase_var.eql(CHAR_period))
                        result = cons($bq_dot$.getDynamicValue(thread), read(stream, T, NIL, T));
                    else {
                        unread_char(peek_char, stream);
                        result = cons($bq_comma$.getDynamicValue(thread), read(stream, T, NIL, T));
                    }

            } finally {
                $backquote_depth$.rebind(_prev_bind_0, thread);
            }
            return values(result, LIST);
        }
        if (NIL != $read_suppress$.getDynamicValue(thread))
            return values(NIL, T);

        simple_reader_error($str206$_S_read_outside_a_backquote_, list(ch));
        return NIL;
    }

    public static SubLObject constituent_rmf(SubLObject stream, SubLObject ch) {
        SubLObject token = make_read_token(UNPROVIDED);
        _csetf_read_token_pointer(token, ZERO_INTEGER);
        _csetf_read_token_buffer(token, Strings.make_string($initial_token_size$.getGlobalValue(), UNPROVIDED));
        _csetf_read_token_escapes(token, NIL);
        add_to_token(ch, token, NIL);
        return values(parse_token(stream, read_token(stream, token, NIL)), T);
    }

    public static SubLObject constituent_syntaxp(SubLObject ch) {
        SubLThread thread = SubLProcess.currentSubLThread();
        return eq(NIL != single_byte_p(ch) ? aref(readtable_single_byte_char_syntax($readtable$.getDynamicValue(thread)), char_code(ch)) : gethash(ch, readtable_character_syntax($readtable$.getDynamicValue(thread)), $CONSTITUENT), $CONSTITUENT);
    }

    public static SubLObject copy_readtable(SubLObject from_readtable, SubLObject to_readtable) {
        if (from_readtable == UNPROVIDED)
            from_readtable = $readtable$.getDynamicValue();

        if (to_readtable == UNPROVIDED)
            to_readtable = NIL;

        SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == from_readtable)
            from_readtable = $standard_readtable$.getDynamicValue(thread);

        if (NIL != to_readtable) {
            clrhash(readtable_character_syntax(to_readtable));
            clrhash(readtable_macro_functions(to_readtable));
            clrhash(readtable_constituent_traits(to_readtable));
        } else
            to_readtable = create_readtable();

        _csetf_readtable_case(to_readtable, readtable_case(from_readtable));
        Xcopy_hash_table(readtable_character_syntax(from_readtable), readtable_character_syntax(to_readtable));
        Xcopy_hash_table(readtable_macro_functions(from_readtable), readtable_macro_functions(to_readtable));
        Xcopy_hash_table(readtable_constituent_traits(from_readtable), readtable_constituent_traits(to_readtable));
        SubLObject i;
        for (i = NIL, i = ZERO_INTEGER; i.numL($single_byte_max_code$.getGlobalValue()); i = add(i, ONE_INTEGER)) {
            set_aref(readtable_single_byte_char_syntax(to_readtable), i, aref(readtable_single_byte_char_syntax(from_readtable), i));
            set_aref(readtable_single_byte_macro_functions(to_readtable), i, aref(readtable_single_byte_macro_functions(from_readtable), i));
            set_aref(readtable_single_byte_constit_traits(to_readtable), i, aref(readtable_single_byte_constit_traits(from_readtable), i));
        }
        SubLObject dispatch_table = NIL;
        SubLObject cdolist_list_var = readtable_dispatch_tables(from_readtable);
        SubLObject bucket = NIL;
        bucket = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            SubLObject datum = current = bucket;
            SubLObject ch = NIL;
            SubLObject table = NIL;
            destructuring_bind_must_consp(current, datum, $list69);
            ch = current.first();
            current = table = current.rest();
            dispatch_table = cons(cons(ch, Xcopy_hash_table(table, make_hash_table(hash_table_count(table), UNPROVIDED, UNPROVIDED))), dispatch_table);
            cdolist_list_var = cdolist_list_var.rest();
            bucket = cdolist_list_var.first();
        } 
        _csetf_readtable_dispatch_tables(to_readtable, dispatch_table);
        return to_readtable;
    }

    public static SubLObject create_readtable() {
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject readtable = make_readtable(UNPROVIDED);
        _csetf_readtable_case(readtable, $UPCASE);
        _csetf_readtable_character_syntax(readtable, make_hash_table($initial_table_size$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED));
        _csetf_readtable_single_byte_char_syntax(readtable, make_vector($single_byte_max_code$.getGlobalValue(), $CONSTITUENT));
        _csetf_readtable_macro_functions(readtable, make_hash_table($initial_table_size$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED));
        _csetf_readtable_single_byte_macro_functions(readtable, make_vector($single_byte_max_code$.getGlobalValue(), CONSTITUENT_RMF));
        _csetf_readtable_constituent_traits(readtable, make_hash_table($initial_table_size$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED));
        _csetf_readtable_single_byte_constit_traits(readtable, make_vector($single_byte_max_code$.getGlobalValue(), $alphabetic$.getGlobalValue()));
        _csetf_readtable_dispatch_tables(readtable, NIL);
        return readtable;
    }

    public static SubLObject decimal_point_traitp(SubLObject ch) {
        SubLThread thread = SubLProcess.currentSubLThread();
        return plusp(logand($decimal_point$.getGlobalValue(), character_traits(ch, $readtable$.getDynamicValue(thread))));
    }

    public static SubLObject declare_reader_file() {
        declareMacro("loop", "LOOP");
        declareFunction("whitespace_1_char_p", "WHITESPACE-1-CHAR-P", 1, 0, false);
        declareFunction("whitespace_2_char_p", "WHITESPACE-2-CHAR-P", 1, 0, false);
        declareFunction("readtable_print_function_trampoline", "READTABLE-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction("readtable_p", "READTABLE-P", 1, 0, false);
        new reader.$readtable_p$UnaryFunction();
        declareFunction("readtable_case", "READTABLE-CASE", 1, 0, false);
        declareFunction("readtable_character_syntax", "READTABLE-CHARACTER-SYNTAX", 1, 0, false);
        declareFunction("readtable_single_byte_char_syntax", "READTABLE-SINGLE-BYTE-CHAR-SYNTAX", 1, 0, false);
        declareFunction("readtable_macro_functions", "READTABLE-MACRO-FUNCTIONS", 1, 0, false);
        declareFunction("readtable_single_byte_macro_functions", "READTABLE-SINGLE-BYTE-MACRO-FUNCTIONS", 1, 0, false);
        declareFunction("readtable_constituent_traits", "READTABLE-CONSTITUENT-TRAITS", 1, 0, false);
        declareFunction("readtable_single_byte_constit_traits", "READTABLE-SINGLE-BYTE-CONSTIT-TRAITS", 1, 0, false);
        declareFunction("readtable_dispatch_tables", "READTABLE-DISPATCH-TABLES", 1, 0, false);
        declareFunction("_csetf_readtable_case", "_CSETF-READTABLE-CASE", 2, 0, false);
        declareFunction("_csetf_readtable_character_syntax", "_CSETF-READTABLE-CHARACTER-SYNTAX", 2, 0, false);
        declareFunction("_csetf_readtable_single_byte_char_syntax", "_CSETF-READTABLE-SINGLE-BYTE-CHAR-SYNTAX", 2, 0, false);
        declareFunction("_csetf_readtable_macro_functions", "_CSETF-READTABLE-MACRO-FUNCTIONS", 2, 0, false);
        declareFunction("_csetf_readtable_single_byte_macro_functions", "_CSETF-READTABLE-SINGLE-BYTE-MACRO-FUNCTIONS", 2, 0, false);
        declareFunction("_csetf_readtable_constituent_traits", "_CSETF-READTABLE-CONSTITUENT-TRAITS", 2, 0, false);
        declareFunction("_csetf_readtable_single_byte_constit_traits", "_CSETF-READTABLE-SINGLE-BYTE-CONSTIT-TRAITS", 2, 0, false);
        declareFunction("_csetf_readtable_dispatch_tables", "_CSETF-READTABLE-DISPATCH-TABLES", 2, 0, false);
        declareFunction("make_readtable", "MAKE-READTABLE", 0, 1, false);
        declareFunction("visit_defstruct_readtable", "VISIT-DEFSTRUCT-READTABLE", 2, 0, false);
        declareFunction("visit_defstruct_object_readtable_method", "VISIT-DEFSTRUCT-OBJECT-READTABLE-METHOD", 2, 0, false);
        declareFunction("create_readtable", "CREATE-READTABLE", 0, 0, false);
        declareFunction("single_byte_p", "SINGLE-BYTE-P", 1, 0, false);
        declareMacro("character_syntax", "CHARACTER-SYNTAX");
        declareFunction("set_character_syntax", "SET-CHARACTER-SYNTAX", 2, 1, false);
        declareFunction("invalid_syntaxp", "INVALID-SYNTAXP", 1, 0, false);
        declareFunction("terminating_macro_syntaxp", "TERMINATING-MACRO-SYNTAXP", 1, 0, false);
        declareFunction("non_terminating_macro_syntaxp", "NON-TERMINATING-MACRO-SYNTAXP", 1, 0, false);
        declareFunction("multiple_escape_syntaxp", "MULTIPLE-ESCAPE-SYNTAXP", 1, 0, false);
        declareFunction("single_escape_syntaxp", "SINGLE-ESCAPE-SYNTAXP", 1, 0, false);
        declareFunction("whitespace_syntaxp", "WHITESPACE-SYNTAXP", 1, 0, false);
        declareFunction("constituent_syntaxp", "CONSTITUENT-SYNTAXP", 1, 0, false);
        declareFunction("character_function", "CHARACTER-FUNCTION", 1, 1, false);
        declareFunction("set_character_function", "SET-CHARACTER-FUNCTION", 2, 1, false);
        declareFunction("character_traits", "CHARACTER-TRAITS", 1, 1, false);
        declareMacro("has_traitp", "HAS-TRAITP");
        declareFunction("set_trait", "SET-TRAIT", 3, 0, false);
        declareFunction("reset_trait", "RESET-TRAIT", 1, 1, false);
        declareFunction("alphabetic_traitp", "ALPHABETIC-TRAITP", 1, 0, false);
        declareFunction("digit_traitp", "DIGIT-TRAITP", 1, 0, false);
        declareFunction("package_marker_traitp", "PACKAGE-MARKER-TRAITP", 1, 0, false);
        declareFunction("plus_sign_traitp", "PLUS-SIGN-TRAITP", 1, 0, false);
        declareFunction("minus_sign_traitp", "MINUS-SIGN-TRAITP", 1, 0, false);
        declareFunction("dot_traitp", "DOT-TRAITP", 1, 0, false);
        declareFunction("decimal_point_traitp", "DECIMAL-POINT-TRAITP", 1, 0, false);
        declareFunction("ratio_marker_traitp", "RATIO-MARKER-TRAITP", 1, 0, false);
        declareFunction("exponent_marker_traitp", "EXPONENT-MARKER-TRAITP", 1, 0, false);
        declareFunction("invalid_traitp", "INVALID-TRAITP", 1, 0, false);
        declareFunction("alphadigit_traitp", "ALPHADIGIT-TRAITP", 1, 0, false);
        declareFunction("Xcopy_hash_table", "%COPY-HASH-TABLE", 2, 0, false);
        declareFunction("copy_readtable", "COPY-READTABLE", 0, 2, false);
        declareFunction("make_dispatch_macro_character", "MAKE-DISPATCH-MACRO-CHARACTER", 1, 2, false);
        declareFunction("readtablep", "READTABLEP", 1, 0, false);
        declareFunction("set_dispatch_macro_character", "SET-DISPATCH-MACRO-CHARACTER", 3, 1, false);
        declareFunction("get_dispatch_macro_character", "GET-DISPATCH-MACRO-CHARACTER", 2, 1, false);
        declareFunction("get_macro_character", "GET-MACRO-CHARACTER", 1, 1, false);
        declareFunction("set_macro_character", "SET-MACRO-CHARACTER", 2, 2, false);
        declareFunction("set_syntax_from_char", "SET-SYNTAX-FROM-CHAR", 2, 2, false);
        declareFunction("set_syntax", "SET-SYNTAX", 3, 0, false);
        declareFunction("simple_reader_error", "SIMPLE-READER-ERROR", 2, 0, false);
        declareFunction("end_of_file_error", "END-OF-FILE-ERROR", 1, 0, false);
        declareFunction("invalid_token_syntax_error", "INVALID-TOKEN-SYNTAX-ERROR", 2, 0, false);
        declareFunction("unimplemented_reader_macro_error", "UNIMPLEMENTED-READER-MACRO-ERROR", 2, 0, false);
        declareFunction("unnecessary_argument_error", "UNNECESSARY-ARGUMENT-ERROR", 2, 0, false);
        declareFunction("illegal_argument_error", "ILLEGAL-ARGUMENT-ERROR", 3, 0, false);
        declareFunction("read_internal", "READ-INTERNAL", 1, 2, false);
        declareFunction("read_preserving_whitespace", "READ-PRESERVING-WHITESPACE", 0, 4, false);
        declareFunction("read", "READ", 0, 4, false);
        declareFunction("read_delimited_list", "READ-DELIMITED-LIST", 1, 2, false);
        declareFunction("read_from_string", "READ-FROM-STRING", 1, 5, false);
        declareMacro("with_standard_io_syntax", "WITH-STANDARD-IO-SYNTAX");
        declareMacro("with_special_reader_error_handling", "WITH-SPECIAL-READER-ERROR-HANDLING");
        declareFunction("read_ignoring_errors", "READ-IGNORING-ERRORS", 0, 3, false);
        declareFunction("read_from_string_ignoring_errors", "READ-FROM-STRING-IGNORING-ERRORS", 1, 4, false);
        declareFunction("read_token_print_function_trampoline", "READ-TOKEN-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction("read_token_p", "READ-TOKEN-P", 1, 0, false);
        new reader.$read_token_p$UnaryFunction();
        declareFunction("read_token_pointer", "READ-TOKEN-POINTER", 1, 0, false);
        declareFunction("read_token_buffer", "READ-TOKEN-BUFFER", 1, 0, false);
        declareFunction("read_token_escapes", "READ-TOKEN-ESCAPES", 1, 0, false);
        declareFunction("_csetf_read_token_pointer", "_CSETF-READ-TOKEN-POINTER", 2, 0, false);
        declareFunction("_csetf_read_token_buffer", "_CSETF-READ-TOKEN-BUFFER", 2, 0, false);
        declareFunction("_csetf_read_token_escapes", "_CSETF-READ-TOKEN-ESCAPES", 2, 0, false);
        declareFunction("make_read_token", "MAKE-READ-TOKEN", 0, 1, false);
        declareFunction("visit_defstruct_read_token", "VISIT-DEFSTRUCT-READ-TOKEN", 2, 0, false);
        declareFunction("visit_defstruct_object_read_token_method", "VISIT-DEFSTRUCT-OBJECT-READ-TOKEN-METHOD", 2, 0, false);
        declareMacro("with_read_token", "WITH-READ-TOKEN");
        declareFunction("add_to_token", "ADD-TO-TOKEN", 3, 0, false);
        declareFunction("read_token_string", "READ-TOKEN-STRING", 1, 0, false);
        declareFunction("read_token", "READ-TOKEN", 3, 0, false);
        declareFunction("potential_number_p", "POTENTIAL-NUMBER-P", 2, 0, false);
        declareFunction("parse_token", "PARSE-TOKEN", 2, 0, false);
        declareFunction("symbol_escapep", "SYMBOL-ESCAPEP", 1, 0, false);
        declareFunction("reader_find_package", "READER-FIND-PACKAGE", 3, 0, false);
        declareFunction("frob_case", "FROB-CASE", 1, 0, false);
        declareFunction("parse_symbol_or_consing_dot", "PARSE-SYMBOL-OR-CONSING-DOT", 2, 0, false);
        declareFunction("float_parse_integer", "FLOAT-PARSE-INTEGER", 4, 0, false);
        declareFunction("parse_number", "PARSE-NUMBER", 2, 0, false);
        declareFunction("parse_integer", "PARSE-INTEGER", 1, 4, false);
        declareFunction("whitespace_rmf", "WHITESPACE-RMF", 2, 0, false);
        declareFunction("constituent_rmf", "CONSTITUENT-RMF", 2, 0, false);
        declareFunction("invalid_rmf", "INVALID-RMF", 2, 0, false);
        declareFunction("single_escape_rmf", "SINGLE-ESCAPE-RMF", 2, 0, false);
        declareFunction("multiple_escape_rmf", "MULTIPLE-ESCAPE-RMF", 2, 0, false);
        declareFunction("sharpsign_capital_g_rmf", "SHARPSIGN-CAPITAL-G-RMF", 3, 0, false);
        declareFunction("left_paren_rmf", "LEFT-PAREN-RMF", 2, 0, false);
        declareFunction("right_paren_rmf", "RIGHT-PAREN-RMF", 2, 0, false);
        declareFunction("single_quote_rmf", "SINGLE-QUOTE-RMF", 2, 0, false);
        declareFunction("semicolon_rmf", "SEMICOLON-RMF", 2, 0, false);
        declareFunction("double_quote_rmf", "DOUBLE-QUOTE-RMF", 2, 0, false);
        declareFunction("bq_cons", "BQ-CONS", 2, 0, false);
        declareMacro("bq_list", "BQ-LIST");
        declareMacro("bq_listX", "BQ-LIST*");
        declareMacro("bq_append", "BQ-APPEND");
        declareMacro("bq_nconc", "BQ-NCONC");
        declareFunction("bq_vector", "BQ-VECTOR", 1, 0, false);
        declareMacro("bq_vector_append", "BQ-VECTOR-APPEND");
        declareFunction("backquotify", "BACKQUOTIFY", 2, 0, false);
        declareFunction("comma", "COMMA", 1, 0, false);
        declareFunction("self_evaluating_atom_p", "SELF-EVALUATING-ATOM-P", 1, 0, false);
        declareFunction("backquotify_1", "BACKQUOTIFY-1", 2, 0, false);
        declareFunction("backquote_rmf", "BACKQUOTE-RMF", 2, 0, false);
        declareFunction("comma_rmf", "COMMA-RMF", 2, 0, false);
        declareFunction("dispatching_rmf", "DISPATCHING-RMF", 2, 0, false);
        declareFunction("sharpsign_backslash_rmf", "SHARPSIGN-BACKSLASH-RMF", 3, 0, false);
        declareFunction("sharpsign_single_quote_rmf", "SHARPSIGN-SINGLE-QUOTE-RMF", 3, 0, false);
        declareFunction("sharpsign_left_paren_rmf", "SHARPSIGN-LEFT-PAREN-RMF", 3, 0, false);
        declareFunction("sharpsign_asterisk_rmf", "SHARPSIGN-ASTERISK-RMF", 3, 0, false);
        declareFunction("sharpsign_colon_rmf", "SHARPSIGN-COLON-RMF", 3, 0, false);
        declareFunction("sharpsign_dot_rmf", "SHARPSIGN-DOT-RMF", 3, 0, false);
        declareFunction("read_number_in_radix", "READ-NUMBER-IN-RADIX", 2, 0, false);
        declareFunction("sharpsign_b_rmf", "SHARPSIGN-B-RMF", 3, 0, false);
        declareFunction("sharpsign_o_rmf", "SHARPSIGN-O-RMF", 3, 0, false);
        declareFunction("sharpsign_x_rmf", "SHARPSIGN-X-RMF", 3, 0, false);
        declareFunction("sharpsign_r_rmf", "SHARPSIGN-R-RMF", 3, 0, false);
        declareFunction("sharpsign_c_rmf", "SHARPSIGN-C-RMF", 3, 0, false);
        declareFunction("sharpsign_a_rmf", "SHARPSIGN-A-RMF", 3, 0, false);
        declareFunction("sharpsign_s_rmf", "SHARPSIGN-S-RMF", 3, 0, false);
        declareFunction("sharpsign_p_rmf", "SHARPSIGN-P-RMF", 3, 0, false);
        declareFunction("read_lookup", "READ-LOOKUP", 1, 0, false);
        declareFunction("set_read_lookup", "SET-READ-LOOKUP", 2, 0, false);
        declareFunction("sharpsign_equals_rmf", "SHARPSIGN-EQUALS-RMF", 3, 0, false);
        declareFunction("sharpsign_sharpsign_rmf", "SHARPSIGN-SHARPSIGN-RMF", 3, 0, false);
        declareFunction("features_match", "FEATURES-MATCH", 1, 0, false);
        declareFunction("fix_features", "FIX-FEATURES", 1, 0, false);
        declareFunction("read_features", "READ-FEATURES", 1, 0, false);
        declareFunction("sharpsign_plus_rmf", "SHARPSIGN-PLUS-RMF", 3, 0, false);
        declareFunction("sharpsign_minus_rmf", "SHARPSIGN-MINUS-RMF", 3, 0, false);
        declareFunction("sharpsign_vertical_bar_rmf", "SHARPSIGN-VERTICAL-BAR-RMF", 3, 0, false);
        return NIL;
    }

    public static SubLObject digit_traitp(SubLObject ch) {
        SubLThread thread = SubLProcess.currentSubLThread();
        return makeBoolean(logand($digit$.getGlobalValue(), character_traits(ch, $readtable$.getDynamicValue(thread))).isPositive() && (NIL != digit_char_p(ch, $read_base$.getDynamicValue(thread))));
    }

    public static SubLObject dispatching_rmf(SubLObject stream, SubLObject ch) {
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject arg = NIL;
        SubLObject next_ch;
        for (next_ch = read_char(stream, UNPROVIDED, UNPROVIDED, UNPROVIDED); NIL != digit_char_p(next_ch, TEN_INTEGER); next_ch = read_char(stream, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
            if (NIL == arg)
                arg = ZERO_INTEGER;

            arg = add(multiply(arg, TEN_INTEGER), digit_char_p(next_ch, TEN_INTEGER));
        }
        SubLObject function = get_dispatch_macro_character(ch, next_ch, UNPROVIDED);
        if (NIL != function) {
            thread.resetMultipleValues();
            SubLObject value = funcall(function, stream, next_ch, arg);
            SubLObject goodp = thread.secondMultipleValue();
            thread.resetMultipleValues();
            return values(value, goodp);
        }
        if (NIL != $read_suppress$.getDynamicValue(thread))
            return values(NIL, T);

        simple_reader_error($str207$Undefined_reader_macro__A_A_, list(ch, next_ch));
        return NIL;
    }

    public static SubLObject dot_traitp(SubLObject ch) {
        SubLThread thread = SubLProcess.currentSubLThread();
        return plusp(logand($dot$.getGlobalValue(), character_traits(ch, $readtable$.getDynamicValue(thread))));
    }

    public static SubLObject double_quote_rmf(SubLObject stream, SubLObject ch) {
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject state = $NORMAL;
        if (NIL != $read_suppress$.getDynamicValue(thread)) {
            while (true) {
                SubLObject next_ch = read_char(stream, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                SubLObject pcase_var = state;
                if (pcase_var.eql($NORMAL)) {
                    if (NIL != charE(next_ch, ch))
                        break;

                    if (NIL == single_escape_syntaxp(next_ch))
                        continue;

                    state = $ESCAPE;
                } else {
                    if (!pcase_var.eql($ESCAPE))
                        continue;

                    state = $NORMAL;
                }
            } 
            return values(NIL, T);
        }
        SubLObject token = make_read_token(UNPROVIDED);
        _csetf_read_token_pointer(token, ZERO_INTEGER);
        _csetf_read_token_buffer(token, Strings.make_string($initial_token_size$.getGlobalValue(), UNPROVIDED));
        _csetf_read_token_escapes(token, NIL);
        while (true) {
            SubLObject next_ch2 = read_char(stream, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            SubLObject pcase_var2 = state;
            if (pcase_var2.eql($NORMAL)) {
                if (NIL != charE(next_ch2, ch))
                    break;

                if (NIL != single_escape_syntaxp(next_ch2))
                    state = $ESCAPE;
                else
                    add_to_token(next_ch2, token, NIL);

            } else {
                if (!pcase_var2.eql($ESCAPE))
                    continue;

                add_to_token(next_ch2, token, NIL);
                state = $NORMAL;
            }
        } 
        return values(read_token_string(token), T);
    }

    public static SubLObject end_of_file_error(SubLObject stream) {
        SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != $throw_end_of_file_p$.getDynamicValue(thread))
            sublisp_throw(END_OF_FILE, T);
        else
            simple_reader_error($str109$End_of_file_on_stream__S_, list(stream));

        return NIL;
    }

    public static SubLObject exponent_marker_traitp(SubLObject ch) {
        SubLThread thread = SubLProcess.currentSubLThread();
        return plusp(logand($exponent_marker$.getGlobalValue(), character_traits(ch, $readtable$.getDynamicValue(thread))));
    }

    public static SubLObject features_match(SubLObject feature) {
        SubLThread thread = SubLProcess.currentSubLThread();
        if (!feature.isCons())
            return member(feature, $features$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED);

        SubLObject pcase_var = feature.first();
        if (pcase_var.eql($NOT)) {
            if (NIL != cddr(feature))
                simple_reader_error($str217$Bogus_feature_expression__S_, list(feature));

            return makeBoolean(NIL == features_match(cadr(feature)));
        }
        if (pcase_var.eql($AND)) {
            SubLObject cdolist_list_var = feature.rest();
            SubLObject subfeature = NIL;
            subfeature = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if (NIL == features_match(subfeature))
                    return NIL;

                cdolist_list_var = cdolist_list_var.rest();
                subfeature = cdolist_list_var.first();
            } 
            return T;
        }
        if (pcase_var.eql($OR)) {
            SubLObject cdolist_list_var = feature.rest();
            SubLObject subfeature = NIL;
            subfeature = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if (NIL != features_match(subfeature))
                    return T;

                cdolist_list_var = cdolist_list_var.rest();
                subfeature = cdolist_list_var.first();
            } 
            return NIL;
        }
        simple_reader_error($str220$Unknown_feature_operator__S_, list(feature.first()));
        return NIL;
    }

    public static SubLObject fix_features(SubLObject features) {
        if (NIL == features)
            return features;

        if (features.isSymbol())
            return make_keyword(features);

        if (features.isCons())
            return cons(fix_features(features.first()), fix_features(features.rest()));

        return features;
    }

    public static SubLObject float_parse_integer(SubLObject string, SubLObject start, SubLObject end, SubLObject radix) {
        SubLObject value = NIL;
        SubLObject i;
        SubLObject digit;
        for (i = NIL, i = start; !i.numGE(end); i = add(i, ONE_INTEGER)) {
            digit = digit_char_p(Strings.sublisp_char(string, i), radix);
            value = add(multiply(NIL != value ? value : $float$0_0, radix), sublisp_float(digit, UNPROVIDED));
        }
        return value;
    }

    public static SubLObject frob_case(SubLObject token) {
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject frobber = NIL;
        SubLObject pcase_var = readtable_case($readtable$.getDynamicValue(thread));
        if (!pcase_var.eql($PRESERVE))
            if (pcase_var.eql($UPCASE))
                frobber = $UPCASE;
            else
                if (pcase_var.eql($DOWNCASE))
                    frobber = $DOWNCASE;
                else
                    if (pcase_var.eql($INVERT)) {
                        SubLObject buffer = read_token_buffer(token);
                        SubLObject escapes = read_token_escapes(token);
                        SubLObject upcase = NIL;
                        SubLObject downcase = NIL;
                        SubLObject cdotimes_end_var;
                        SubLObject i;
                        SubLObject escape_idx;
                        SubLObject ch;
                        for (cdotimes_end_var = read_token_pointer(token), i = NIL, i = ZERO_INTEGER; i.numL(cdotimes_end_var); i = add(i, ONE_INTEGER)) {
                            escape_idx = escapes.first();
                            if ((NIL != escape_idx) && escape_idx.numE(i))
                                escapes = escapes.rest();
                            else {
                                ch = Strings.sublisp_char(buffer, i);
                                if (NIL == charE(ch, char_downcase(ch)))
                                    upcase = T;

                                if (NIL == charE(ch, char_upcase(ch)))
                                    downcase = T;

                            }
                        }
                        if ((NIL == upcase) || (NIL == downcase))
                            if (NIL != upcase)
                                frobber = $DOWNCASE;
                            else
                                if (NIL != downcase)
                                    frobber = $UPCASE;



                    }



        if (NIL != frobber) {
            SubLObject buffer = read_token_buffer(token);
            SubLObject escapes = read_token_escapes(token);
            SubLObject cdotimes_end_var2;
            SubLObject j;
            SubLObject escape_idx2;
            SubLObject curr;
            for (cdotimes_end_var2 = read_token_pointer(token), j = NIL, j = ZERO_INTEGER; j.numL(cdotimes_end_var2); j = add(j, ONE_INTEGER)) {
                escape_idx2 = escapes.first();
                if ((NIL != escape_idx2) && escape_idx2.numE(j))
                    escapes = escapes.rest();
                else {
                    curr = Strings.sublisp_char(buffer, j);
                    if (frobber == $UPCASE)
                        Strings.set_char(buffer, j, char_upcase(curr));
                    else
                        Strings.set_char(buffer, j, char_downcase(curr));

                }
            }
        }
        return token;
    }

    public static SubLObject get_dispatch_macro_character(SubLObject disp_char, SubLObject sub_char, SubLObject readtable) {
        if (readtable == UNPROVIDED)
            readtable = $readtable$.getDynamicValue();

        SubLObject bucket = assoc(disp_char, readtable_dispatch_tables(readtable), UNPROVIDED, UNPROVIDED);
        if (NIL == bucket)
            Errors.error($str73$_A_is_not_a_dispatching_macro_cha, disp_char, readtable);

        return gethash(char_upcase(sub_char), bucket.rest(), UNPROVIDED);
    }

    public static SubLObject get_macro_character(SubLObject v_char, SubLObject readtable) {
        if (readtable == UNPROVIDED)
            readtable = $readtable$.getDynamicValue();

        SubLObject syntax = (NIL != single_byte_p(v_char)) ? aref(readtable_single_byte_char_syntax(readtable), char_code(v_char)) : gethash(v_char, readtable_character_syntax(readtable), $CONSTITUENT);
        if ((syntax == $TERMINATING_MACRO) || (syntax == $NON_TERMINATING_MACRO))
            return values(character_function(v_char, readtable), eq(syntax, $NON_TERMINATING_MACRO));

        return values(NIL, NIL);
    }

    public static SubLObject has_traitp(SubLObject macroform, SubLObject environment) {
        SubLObject current;
        SubLObject datum = current = macroform.rest();
        SubLObject ch = NIL;
        SubLObject trait = NIL;
        destructuring_bind_must_consp(current, datum, $list65);
        ch = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list65);
        trait = current.first();
        current = current.rest();
        SubLObject readtable = (current.isCons()) ? current.first() : $readtable$;
        destructuring_bind_must_listp(current, datum, $list65);
        current = current.rest();
        if (NIL == current)
            return list(PLUSP, list(LOGAND, trait, list(CHARACTER_TRAITS, ch, readtable)));

        cdestructuring_bind_error(datum, $list65);
        return NIL;
    }

    public static SubLObject illegal_argument_error(SubLObject stream, SubLObject ch, SubLObject arg) {
        simple_reader_error($str113$Illegal_argument__D_for_the__A_re, list(arg, ch));
        return NIL;
    }

    public static SubLObject init_reader_file() {
        defvar("*WHITESPACE-1-CHARS*", list(CHAR_space, code_char(TEN_INTEGER), code_char(THIRTEEN_INTEGER), CHAR_tab, CHAR_page, CHAR_rubout));
        defvar("*READ-BASE*", TEN_INTEGER);
        defvar("*READ-DEFAULT-FLOAT-FORMAT*", DOUBLE_FLOAT);
        defvar("*READ-EVAL*", T);
        defvar("*READ-SUPPRESS*", NIL);
        defvar("*FEATURES*", $list3);
        defvar("*READTABLE*", NIL);
        defparameter("*INITIAL-TABLE-SIZE*", $int$32);
        defconstant("*SINGLE-BYTE-MAX-CODE*", $int$128);
        defconstant("*DTP-READTABLE*", READTABLE);
        defconstant("*ALPHABETIC*", ONE_INTEGER);
        defconstant("*DIGIT*", TWO_INTEGER);
        defconstant("*PACKAGE-MARKER*", FOUR_INTEGER);
        defconstant("*PLUS-SIGN*", EIGHT_INTEGER);
        defconstant("*MINUS-SIGN*", SIXTEEN_INTEGER);
        defconstant("*DOT*", $int$32);
        defconstant("*DECIMAL-POINT*", $int$64);
        defconstant("*RATIO-MARKER*", $int$128);
        defconstant("*EXPONENT-MARKER*", $int$256);
        defconstant("*INVALID*", $int$512);
        defvar("*STANDARD-READTABLE*", NIL);
        defvar("*THROW-READER-ERROR-P*", NIL);
        defvar("*THROW-END-OF-FILE-P*", NIL);
        defvarCheckCL("*READ-LOOKUP-TABLE*", NIL);
        defconstant("*INITIAL-TOKEN-SIZE*", $int$32);
        defconstant("*DTP-READ-TOKEN*", READ_TOKEN);
        defparameter("*CONSING-DOT*", $sym149$CONSING_DOT);
        deflexical("*KEYWORD-PACKAGE*", find_package($$$KEYWORD));
        defvar("*READING-LIST*", NIL);
        defvar("*READING-FAKE-LIST*", NIL);
        defparameter("*RIGHT-PAREN*", $sym174$RIGHT_PAREN);
        defparameter("*IGNORE-EXTRA-RIGHT-PARENS*", NIL);
        defparameter("*BQ-COMMA*", make_symbol($str194$_));
        defparameter("*BQ-ATSIGN*", make_symbol($str195$_));
        defparameter("*BQ-DOT*", make_symbol($str196$_));
        defparameter("*BQ-VECTOR*", make_symbol($str197$BQ_VECTOR));
        defvar("*BACKQUOTE-DEPTH*", ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject invalid_rmf(SubLObject stream, SubLObject ch) {
        SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != $read_suppress$.getDynamicValue(thread)) {
            SubLObject token = make_read_token(UNPROVIDED);
            _csetf_read_token_pointer(token, ZERO_INTEGER);
            _csetf_read_token_buffer(token, Strings.make_string($initial_token_size$.getGlobalValue(), UNPROVIDED));
            _csetf_read_token_escapes(token, NIL);
            return values(read_token(stream, token, NIL), T);
        }
        simple_reader_error($str143$_A_is_an_invalid_character_, list(ch));
        return NIL;
    }

    public static SubLObject invalid_syntaxp(SubLObject ch) {
        SubLThread thread = SubLProcess.currentSubLThread();
        return eq(NIL != single_byte_p(ch) ? aref(readtable_single_byte_char_syntax($readtable$.getDynamicValue(thread)), char_code(ch)) : gethash(ch, readtable_character_syntax($readtable$.getDynamicValue(thread)), $CONSTITUENT), $INVALID);
    }

    public static SubLObject invalid_token_syntax_error(SubLObject stream, SubLObject token) {
        simple_reader_error($str110$_S_is_invalid_token_syntax_, list(read_token_string(token)));
        return NIL;
    }

    public static SubLObject invalid_traitp(SubLObject ch) {
        SubLThread thread = SubLProcess.currentSubLThread();
        return plusp(logand($invalid$.getGlobalValue(), character_traits(ch, $readtable$.getDynamicValue(thread))));
    }

    public static SubLObject left_paren_rmf(SubLObject stream, SubLObject ch) {
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject state = $INITIAL;
        SubLObject list = NIL;
        SubLObject tail = NIL;
        SubLObject object = NIL;
        while (true) {
            SubLObject _prev_bind_0 = $reading_list$.currentBinding(thread);
            try {
                $reading_list$.bind(T, thread);
                object = read_internal(stream, UNPROVIDED, UNPROVIDED);
            } finally {
                $reading_list$.rebind(_prev_bind_0, thread);
            }
            SubLObject pcase_var = state;
            if (pcase_var.eql($INITIAL)) {
                if (object.eql($right_paren$.getDynamicValue(thread)))
                    return values(NIL, T);

                if (object.eql($consing_dot$.getDynamicValue(thread)))
                    Errors.error($str175$Nothing_before_consing_dot_);
                else {
                    if (NIL == $read_suppress$.getDynamicValue(thread))
                        list = tail = cons(object, NIL);

                    state = $LIST;
                }
            } else
                if (pcase_var.eql($LIST)) {
                    if (object.eql($right_paren$.getDynamicValue(thread)))
                        return values(list, T);

                    if (object.eql($consing_dot$.getDynamicValue(thread)))
                        state = $CONSING_DOT;
                    else {
                        if (NIL != $read_suppress$.getDynamicValue(thread))
                            continue;

                        rplacd(tail, cons(object, NIL));
                        tail = tail.rest();
                    }
                } else
                    if (pcase_var.eql($CONSING_DOT)) {
                        if (object.eql($right_paren$.getDynamicValue(thread)))
                            simple_reader_error($str178$Nothing_after_consing_dot_, NIL);
                        else
                            if (object.eql($consing_dot$.getDynamicValue(thread)))
                                simple_reader_error($str179$Too_many_consing_dots_, NIL);
                            else {
                                if (NIL == $read_suppress$.getDynamicValue(thread))
                                    rplacd(tail, object);

                                state = $AFTER_CONSING_DOT;
                            }

                    } else {
                        if (!pcase_var.eql($AFTER_CONSING_DOT))
                            continue;

                        if (object.eql($right_paren$.getDynamicValue(thread)))
                            return values(list, T);

                        simple_reader_error($str181$Too_many_objects_after_consing_do, NIL);
                    }


        } 
    }

    public static SubLObject loop(SubLObject macroform, SubLObject environment) {
        SubLObject datum = macroform.rest();
        SubLObject body;
        body = datum;
        return listS(CDO, NIL, $list1, append(body, NIL));
    }

    public static SubLObject make_dispatch_macro_character(SubLObject v_char, SubLObject non_terminating_p, SubLObject readtable) {
        if (non_terminating_p == UNPROVIDED)
            non_terminating_p = NIL;

        if (readtable == UNPROVIDED)
            readtable = $readtable$.getDynamicValue();

        SubLThread thread = SubLProcess.currentSubLThread();
        _csetf_readtable_dispatch_tables(readtable, delete(v_char, readtable_dispatch_tables(readtable), symbol_function(EQL), symbol_function(CAR), UNPROVIDED, UNPROVIDED, UNPROVIDED));
        _csetf_readtable_dispatch_tables(readtable, cons(cons(v_char, make_hash_table($initial_table_size$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED)), readtable_dispatch_tables(readtable)));
        set_character_function(v_char, DISPATCHING_RMF, readtable);
        set_character_syntax(v_char, NIL != non_terminating_p ? $NON_TERMINATING_MACRO : $TERMINATING_MACRO, readtable);
        return T;
    }

    public static SubLObject make_read_token(SubLObject arglist) {
        if (arglist == UNPROVIDED)
            arglist = NIL;

        SubLObject v_new = new reader.$read_token_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
            current_arg = next.first();
            current_value = cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql($POINTER))
                _csetf_read_token_pointer(v_new, current_value);
            else
                if (pcase_var.eql($BUFFER))
                    _csetf_read_token_buffer(v_new, current_value);
                else
                    if (pcase_var.eql($ESCAPES))
                        _csetf_read_token_escapes(v_new, current_value);
                    else
                        Errors.error($str39$Invalid_slot__S_for_construction_, current_arg);



        }
        return v_new;
    }

    public static SubLObject make_readtable(SubLObject arglist) {
        if (arglist == UNPROVIDED)
            arglist = NIL;

        SubLObject v_new = new reader.$readtable_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
            current_arg = next.first();
            current_value = cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql($CASE))
                _csetf_readtable_case(v_new, current_value);
            else
                if (pcase_var.eql($CHARACTER_SYNTAX))
                    _csetf_readtable_character_syntax(v_new, current_value);
                else
                    if (pcase_var.eql($SINGLE_BYTE_CHAR_SYNTAX))
                        _csetf_readtable_single_byte_char_syntax(v_new, current_value);
                    else
                        if (pcase_var.eql($MACRO_FUNCTIONS))
                            _csetf_readtable_macro_functions(v_new, current_value);
                        else
                            if (pcase_var.eql($SINGLE_BYTE_MACRO_FUNCTIONS))
                                _csetf_readtable_single_byte_macro_functions(v_new, current_value);
                            else
                                if (pcase_var.eql($CONSTITUENT_TRAITS))
                                    _csetf_readtable_constituent_traits(v_new, current_value);
                                else
                                    if (pcase_var.eql($SINGLE_BYTE_CONSTIT_TRAITS))
                                        _csetf_readtable_single_byte_constit_traits(v_new, current_value);
                                    else
                                        if (pcase_var.eql($DISPATCH_TABLES))
                                            _csetf_readtable_dispatch_tables(v_new, current_value);
                                        else
                                            Errors.error($str39$Invalid_slot__S_for_construction_, current_arg);








        }
        return v_new;
    }

    public static SubLObject minus_sign_traitp(SubLObject ch) {
        SubLThread thread = SubLProcess.currentSubLThread();
        return plusp(logand($minus_sign$.getGlobalValue(), character_traits(ch, $readtable$.getDynamicValue(thread))));
    }

    public static SubLObject multiple_escape_rmf(SubLObject stream, SubLObject ch) {
        SubLObject token = make_read_token(UNPROVIDED);
        _csetf_read_token_pointer(token, ZERO_INTEGER);
        _csetf_read_token_buffer(token, Strings.make_string($initial_token_size$.getGlobalValue(), UNPROVIDED));
        _csetf_read_token_escapes(token, NIL);
        read_token(stream, token, T);
        return values(parse_token(stream, token), T);
    }

    public static SubLObject multiple_escape_syntaxp(SubLObject ch) {
        SubLThread thread = SubLProcess.currentSubLThread();
        return eq(NIL != single_byte_p(ch) ? aref(readtable_single_byte_char_syntax($readtable$.getDynamicValue(thread)), char_code(ch)) : gethash(ch, readtable_character_syntax($readtable$.getDynamicValue(thread)), $CONSTITUENT), $MULTIPLE_ESCAPE);
    }

    public static SubLObject non_terminating_macro_syntaxp(SubLObject ch) {
        SubLThread thread = SubLProcess.currentSubLThread();
        return eq(NIL != single_byte_p(ch) ? aref(readtable_single_byte_char_syntax($readtable$.getDynamicValue(thread)), char_code(ch)) : gethash(ch, readtable_character_syntax($readtable$.getDynamicValue(thread)), $CONSTITUENT), $NON_TERMINATING_MACRO);
    }

    public static SubLObject package_marker_traitp(SubLObject ch) {
        SubLThread thread = SubLProcess.currentSubLThread();
        return plusp(logand($package_marker$.getGlobalValue(), character_traits(ch, $readtable$.getDynamicValue(thread))));
    }

    public static SubLObject parse_integer(SubLObject string, SubLObject start, SubLObject end, SubLObject radix, SubLObject junk_allowed) {
        if (start == UNPROVIDED)
            start = ZERO_INTEGER;

        if (end == UNPROVIDED)
            end = NIL;

        if (radix == UNPROVIDED)
            radix = TEN_INTEGER;

        if (junk_allowed == UNPROVIDED)
            junk_allowed = NIL;

        if (NIL == end)
            end = length(string);

        if (NIL == junk_allowed)
            return jrtl_parse_integer(string, start, end, radix);

        SubLObject sign = MINUS_ONE_INTEGER;
        SubLObject i = start;
        SubLObject state = $INITIAL;
        SubLObject value = NIL;
        while (!i.numGE(end)) {
            SubLObject ch = Strings.sublisp_char(string, i);
            SubLObject pcase_var = state;
            if (pcase_var.eql($INITIAL)) {
                if (NIL == whitespace_1_char_p(ch))
                    if (NIL != charE(ch, CHAR_plus))
                        state = $SIGN;
                    else
                        if (NIL != charE(ch, CHAR_hyphen)) {
                            sign = ONE_INTEGER;
                            state = $SIGN;
                        } else
                            if (NIL != digit_char_p(ch, radix)) {
                                value = minus(digit_char_p(ch, radix));
                                state = $DIGIT;
                            } else {
                                if (NIL != junk_allowed)
                                    return values(NIL, i);

                                simple_reader_error($str169$_S_does_not_contain_an_integer_, list(subseq(string, start, end)));
                            }



            } else
                if (pcase_var.eql($SIGN)) {
                    if (NIL != digit_char_p(ch, radix)) {
                        value = minus(digit_char_p(ch, radix));
                        state = $DIGIT;
                    } else {
                        if (NIL != junk_allowed)
                            return values(NIL, i);

                        simple_reader_error($str169$_S_does_not_contain_an_integer_, list(subseq(string, start, end)));
                    }
                } else
                    if (pcase_var.eql($DIGIT)) {
                        if (NIL != digit_char_p(ch, radix))
                            value = subtract(multiply(value, radix), digit_char_p(ch, radix));
                        else
                            if (NIL != whitespace_1_char_p(ch))
                                state = $TRAILING_WHITESPACE;
                            else {
                                if (NIL != junk_allowed)
                                    return values(multiply(sign, value), i);

                                simple_reader_error($str169$_S_does_not_contain_an_integer_, list(subseq(string, start, end)));
                            }

                    } else
                        if (pcase_var.eql($TRAILING_WHITESPACE))
                            if (NIL == whitespace_1_char_p(ch)) {
                                if (NIL != junk_allowed)
                                    return values(multiply(sign, value), i);

                                simple_reader_error($str169$_S_does_not_contain_an_integer_, list(subseq(string, start, end)));
                            }




            i = add(i, ONE_INTEGER);
        } 
        if ((state == $DIGIT) || (state == $TRAILING_WHITESPACE))
            return values(multiply(sign, value), i);

        if (NIL != junk_allowed)
            return values(NIL, i);

        simple_reader_error($str169$_S_does_not_contain_an_integer_, list(subseq(string, start, end)));
        return NIL;
    }

    public static SubLObject parse_number(SubLObject stream, SubLObject token) {
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject state = $INITIAL;
        SubLObject buffer = read_token_buffer(token);
        SubLObject length = read_token_pointer(token);
        SubLObject sign = ONE_INTEGER;
        SubLObject exponent_sign = ONE_INTEGER;
        SubLObject start1 = NIL;
        SubLObject end1 = NIL;
        SubLObject start2 = NIL;
        SubLObject end2 = NIL;
        SubLObject start3 = NIL;
        SubLObject i;
        SubLObject ch;
        SubLObject pcase_var;
        for (i = NIL, i = ZERO_INTEGER; i.numL(length); i = add(i, ONE_INTEGER)) {
            ch = Strings.sublisp_char(buffer, i);
            pcase_var = state;
            if (pcase_var.eql($INITIAL)) {
                if (NIL != decimal_point_traitp(ch))
                    state = $DOT1;
                else
                    if (NIL != plus_sign_traitp(ch))
                        state = $SIGN;
                    else
                        if (NIL != minus_sign_traitp(ch)) {
                            sign = MINUS_ONE_INTEGER;
                            state = $SIGN;
                        } else
                            if (NIL != digit_char_p(ch, TEN_INTEGER)) {
                                start1 = i;
                                state = $DECIMALS;
                            } else
                                if (NIL != digit_traitp(ch)) {
                                    start1 = i;
                                    state = $DIGITS;
                                } else
                                    invalid_token_syntax_error(stream, token);





            } else
                if (pcase_var.eql($SIGN)) {
                    if (NIL != digit_char_p(ch, TEN_INTEGER)) {
                        start1 = i;
                        state = $DECIMALS;
                    } else
                        if (NIL != digit_traitp(ch)) {
                            start1 = i;
                            state = $DIGITS;
                        } else
                            if (NIL != decimal_point_traitp(ch))
                                state = $DOT1;
                            else
                                invalid_token_syntax_error(stream, token);



                } else
                    if (pcase_var.eql($DECIMALS)) {
                        if (NIL == digit_char_p(ch, TEN_INTEGER))
                            if (NIL != digit_traitp(ch))
                                state = $DIGITS;
                            else
                                if (NIL != exponent_marker_traitp(ch)) {
                                    end1 = i;
                                    state = $EXPONENT;
                                } else
                                    if (NIL != decimal_point_traitp(ch)) {
                                        end1 = i;
                                        state = $DOT2;
                                    } else
                                        if (NIL != ratio_marker_traitp(ch)) {
                                            end1 = i;
                                            state = $SLASH;
                                        } else
                                            invalid_token_syntax_error(stream, token);





                    } else
                        if (pcase_var.eql($DIGITS)) {
                            if (NIL == digit_traitp(ch))
                                if (NIL != ratio_marker_traitp(ch)) {
                                    end1 = i;
                                    state = $SLASH;
                                } else
                                    invalid_token_syntax_error(stream, token);


                        } else
                            if (pcase_var.eql($SLASH)) {
                                if (NIL != digit_traitp(ch)) {
                                    start2 = i;
                                    state = $DENOMINATOR;
                                } else
                                    invalid_token_syntax_error(stream, token);

                            } else
                                if (pcase_var.eql($DENOMINATOR)) {
                                    if (NIL == digit_traitp(ch))
                                        invalid_token_syntax_error(stream, token);

                                } else
                                    if (pcase_var.eql($DOT1)) {
                                        if (NIL != digit_char_p(ch, TEN_INTEGER)) {
                                            start2 = i;
                                            state = $FRACTION;
                                        } else
                                            invalid_token_syntax_error(stream, token);

                                    } else
                                        if (pcase_var.eql($FRACTION)) {
                                            if (NIL == digit_char_p(ch, TEN_INTEGER))
                                                invalid_token_syntax_error(stream, token);

                                        } else
                                            if (pcase_var.eql($DOT2)) {
                                                if (NIL != exponent_marker_traitp(ch)) {
                                                    start2 = ZERO_INTEGER;
                                                    end2 = ZERO_INTEGER;
                                                    state = $EXPONENT;
                                                } else
                                                    if (NIL != digit_char_p(ch, TEN_INTEGER)) {
                                                        start2 = i;
                                                        state = $DECIMALS2;
                                                    } else
                                                        invalid_token_syntax_error(stream, token);


                                            } else
                                                if (pcase_var.eql($DECIMALS2)) {
                                                    if (NIL == digit_char_p(ch, TEN_INTEGER))
                                                        if (NIL != exponent_marker_traitp(ch)) {
                                                            end2 = i;
                                                            state = $EXPONENT;
                                                        } else
                                                            invalid_token_syntax_error(stream, token);


                                                } else
                                                    if (pcase_var.eql($EXPONENT)) {
                                                        if (NIL != plus_sign_traitp(ch))
                                                            state = $EXPONENT_SIGN;
                                                        else
                                                            if (NIL != minus_sign_traitp(ch)) {
                                                                exponent_sign = MINUS_ONE_INTEGER;
                                                                state = $EXPONENT_SIGN;
                                                            } else
                                                                if (NIL != digit_char_p(ch, TEN_INTEGER)) {
                                                                    start3 = i;
                                                                    state = $EXPONENT_VALUE;
                                                                } else
                                                                    invalid_token_syntax_error(stream, token);



                                                    } else
                                                        if (pcase_var.eql($EXPONENT_SIGN)) {
                                                            if (NIL != digit_char_p(ch, TEN_INTEGER)) {
                                                                start3 = i;
                                                                state = $EXPONENT_VALUE;
                                                            } else
                                                                invalid_token_syntax_error(stream, token);

                                                        } else
                                                            if (pcase_var.eql($EXPONENT_VALUE)) {
                                                                if (NIL == digit_char_p(ch, TEN_INTEGER))
                                                                    invalid_token_syntax_error(stream, token);

                                                            } else
                                                                simple_reader_error($str167$Can_t_happen_, NIL);













        }
        SubLObject pcase_var2 = state;
        if (pcase_var2.eql($DIGITS))
            return multiply(sign, parse_integer(buffer, start1, length, $read_base$.getDynamicValue(thread), UNPROVIDED));

        if (pcase_var2.eql($DECIMALS))
            return multiply(sign, parse_integer(buffer, start1, length, $read_base$.getDynamicValue(thread), UNPROVIDED));

        if (pcase_var2.eql($DOT2))
            return multiply(sign, parse_integer(buffer, start1, end1, TEN_INTEGER, UNPROVIDED));

        if (pcase_var2.eql($DENOMINATOR))
            return multiply(sign, divide(parse_integer(buffer, start1, end1, $read_base$.getDynamicValue(thread), UNPROVIDED), parse_integer(buffer, start2, length, $read_base$.getDynamicValue(thread), UNPROVIDED)));

        if (pcase_var2.eql($FRACTION))
            return multiply(sign, math_utilities.bellerophon(parse_integer(buffer, start2, length, TEN_INTEGER, UNPROVIDED), minus(subtract(length, start2))));

        if (pcase_var2.eql($DECIMALS2)) {
            SubLObject left = parse_integer(buffer, start1, end1, TEN_INTEGER, UNPROVIDED);
            SubLObject right = parse_integer(buffer, start2, length, TEN_INTEGER, UNPROVIDED);
            return multiply(sign, math_utilities.bellerophon(add(multiply(left, expt(TEN_INTEGER, subtract(length, start2))), right), minus(subtract(length, start2))));
        }
        if (!pcase_var2.eql($EXPONENT_VALUE))
            return invalid_token_syntax_error(stream, token);

        SubLObject left = (NIL != start1) ? parse_integer(buffer, start1, end1, TEN_INTEGER, UNPROVIDED) : NIL;
        SubLObject right = (NIL != start2) ? parse_integer(buffer, start2, end2, TEN_INTEGER, UNPROVIDED) : NIL;
        SubLObject exponent = parse_integer(buffer, start3, length, TEN_INTEGER, UNPROVIDED);
        if ((NIL != left) && (NIL != right))
            return multiply(sign, math_utilities.bellerophon(add(multiply(left, expt(TEN_INTEGER, subtract(end2, start2))), right), subtract(multiply(exponent_sign, exponent), subtract(end2, start2))));

        if (NIL != left)
            return multiply(sign, math_utilities.bellerophon(left, multiply(exponent_sign, exponent)));

        if (NIL != right)
            return multiply(sign, math_utilities.bellerophon(right, subtract(multiply(exponent_sign, exponent), subtract(end2, start2))));

        return invalid_token_syntax_error(stream, token);
    }

    public static SubLObject parse_symbol_or_consing_dot(SubLObject stream, SubLObject token) {
        SubLThread thread = SubLProcess.currentSubLThread();
        frob_case(token);
        SubLObject buffer = read_token_buffer(token);
        SubLObject length = read_token_pointer(token);
        SubLObject escapes = read_token_escapes(token);
        SubLObject pkg_idx1 = NIL;
        SubLObject pkg_idx2 = NIL;
        SubLObject dot_count = ZERO_INTEGER;
        SubLObject i;
        SubLObject ch;
        SubLObject escape_idx;
        for (i = NIL, i = ZERO_INTEGER; i.numL(length); i = add(i, ONE_INTEGER)) {
            ch = Strings.sublisp_char(buffer, i);
            escape_idx = escapes.first();
            if ((NIL != escape_idx) && escape_idx.numE(i))
                escapes = escapes.rest();
            else
                if (NIL != package_marker_traitp(ch)) {
                    if (NIL != pkg_idx2)
                        invalid_token_syntax_error(stream, token);
                    else
                        if (NIL != pkg_idx1)
                            pkg_idx2 = i;
                        else
                            pkg_idx1 = i;


                } else
                    if (NIL != dot_traitp(ch))
                        dot_count = add(dot_count, ONE_INTEGER);



        }
        if (dot_count.numE(length)) {
            if ((length.numE(ONE_INTEGER) && (NIL != $reading_list$.getDynamicValue(thread))) && (NIL == $reading_fake_list$.getDynamicValue(thread)))
                return $consing_dot$.getDynamicValue(thread);

            return invalid_token_syntax_error(stream, token);
        } else {
            if (((NIL != pkg_idx1) && (NIL == pkg_idx2)) && pkg_idx1.numE(ZERO_INTEGER)) {
                if (!length.numG(ONE_INTEGER))
                    invalid_token_syntax_error(stream, token);

                return make_keyword(subseq(buffer, ONE_INTEGER, length));
            }
            if (((NIL != pkg_idx1) && (NIL == pkg_idx2)) && pkg_idx1.numL(subtract(length, ONE_INTEGER))) {
                SubLObject v_package = reader_find_package(buffer, ZERO_INTEGER, pkg_idx1);
                SubLObject name = subseq(buffer, add(pkg_idx1, ONE_INTEGER), length);
                thread.resetMultipleValues();
                SubLObject symbol = find_symbol(name, v_package);
                SubLObject status = thread.secondMultipleValue();
                thread.resetMultipleValues();
                if (status == $EXTERNAL)
                    return symbol;

                if (v_package.eql($keyword_package$.getGlobalValue()))
                    return make_keyword(name);

                simple_reader_error($str152$_S_is_not_external_in__S_, list(name, v_package));
                return NIL;
            } else {
                if (((((NIL != pkg_idx1) && (NIL != pkg_idx2)) && pkg_idx2.numE(add(pkg_idx1, ONE_INTEGER))) && pkg_idx1.numG(ZERO_INTEGER)) && pkg_idx2.numL(subtract(length, ONE_INTEGER)))
                    return intern(subseq(buffer, add(pkg_idx2, ONE_INTEGER), length), reader_find_package(buffer, ZERO_INTEGER, pkg_idx1));

                if (((NIL == pkg_idx1) && (NIL == pkg_idx2)) && length.isPositive())
                    return intern(subseq(buffer, ZERO_INTEGER, length), $package$.getDynamicValue(thread));

                return invalid_token_syntax_error(stream, token);
            }
        }
    }

    public static SubLObject parse_token(SubLObject stream, SubLObject token) {
        SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != $read_suppress$.getDynamicValue(thread))
            return NIL;

        SubLObject escapes = nreverse(read_token_escapes(token));
        _csetf_read_token_escapes(token, escapes);
        if ((NIL == escapes) && (NIL != potential_number_p(read_token_buffer(token), read_token_pointer(token))))
            return parse_number(stream, token);

        return parse_symbol_or_consing_dot(stream, token);
    }

    public static SubLObject plus_sign_traitp(SubLObject ch) {
        SubLThread thread = SubLProcess.currentSubLThread();
        return plusp(logand($plus_sign$.getGlobalValue(), character_traits(ch, $readtable$.getDynamicValue(thread))));
    }

    public static SubLObject potential_number_p(SubLObject string, SubLObject length) {
        SubLObject letter_seen_p = NIL;
        SubLObject i;
        SubLObject ch;
        for (i = NIL, i = ZERO_INTEGER; i.numL(length); i = add(i, ONE_INTEGER)) {
            ch = Strings.sublisp_char(string, i);
            if (((((((NIL != digit_traitp(ch)) || (NIL != plus_sign_traitp(ch))) || (NIL != minus_sign_traitp(ch))) || (NIL != ratio_marker_traitp(ch))) || (NIL != decimal_point_traitp(ch))) || (NIL != charE(ch, CHAR_caret))) || (NIL != charE(ch, CHAR_underbar)))
                letter_seen_p = NIL;
            else
                if (NIL != exponent_marker_traitp(ch))
                    letter_seen_p = T;
                else {
                    if ((NIL == alphadigit_traitp(ch)) || (NIL != letter_seen_p))
                        return NIL;

                    letter_seen_p = T;
                }

        }
        SubLObject decimal_point_p = NIL;
        SubLObject decimal_digit_p = NIL;
        SubLObject digit_p = NIL;
        SubLObject j;
        SubLObject ch2;
        for (j = NIL, j = ZERO_INTEGER; j.numL(length); j = add(j, ONE_INTEGER)) {
            ch2 = Strings.sublisp_char(string, j);
            if (NIL != digit_traitp(ch2))
                digit_p = T;

            if (NIL != digit_char_p(ch2, TEN_INTEGER))
                decimal_digit_p = T;

            if (NIL != decimal_point_traitp(ch2))
                decimal_point_p = T;

        }
        if (((NIL != decimal_point_p) && (NIL == decimal_digit_p)) || (NIL == digit_p))
            return NIL;

        SubLObject first = Strings.sublisp_char(string, ZERO_INTEGER);
        if ((((((NIL == digit_traitp(first)) && (NIL == plus_sign_traitp(first))) && (NIL == minus_sign_traitp(first))) && (NIL == decimal_point_traitp(first))) && (NIL == charE(first, CHAR_caret))) && (NIL == charE(first, CHAR_underbar)))
            return NIL;

        if (NIL != package_marker_traitp(first))
            return NIL;

        SubLObject last = Strings.sublisp_char(string, subtract(length, ONE_INTEGER));
        if ((NIL != plus_sign_traitp(last)) || (NIL != minus_sign_traitp(last)))
            return NIL;

        return T;
    }

    public static SubLObject ratio_marker_traitp(SubLObject ch) {
        SubLThread thread = SubLProcess.currentSubLThread();
        return plusp(logand($ratio_marker$.getGlobalValue(), character_traits(ch, $readtable$.getDynamicValue(thread))));
    }

    public static SubLObject read(SubLObject stream, SubLObject eof_error_p, SubLObject eof_value, SubLObject recursivep) {
        if (stream == UNPROVIDED)
            stream = NIL;

        if (eof_error_p == UNPROVIDED)
            eof_error_p = T;

        if (eof_value == UNPROVIDED)
            eof_value = NIL;

        if (recursivep == UNPROVIDED)
            recursivep = NIL;

        SubLObject value = read_preserving_whitespace(stream, eof_error_p, eof_value, recursivep);
        SubLObject ch = read_char(stream, NIL, NIL, UNPROVIDED);
        if ((NIL != ch) && ((NIL == whitespace_syntaxp(ch)) || (NIL != recursivep)))
            unread_char(ch, stream);

        return value;
    }

    public static SubLObject read_delimited_list(SubLObject v_char, SubLObject stream, SubLObject recursivep) {
        if (stream == UNPROVIDED)
            stream = NIL;

        if (recursivep == UNPROVIDED)
            recursivep = NIL;

        SubLObject list = NIL;
        SubLObject tail = NIL;
        while (true) {
            SubLObject ch = read_char(stream, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            if (NIL != charE(ch, v_char))
                break;

            if (NIL != whitespace_syntaxp(ch))
                continue;

            unread_char(ch, stream);
            SubLObject next = cons(read(stream, T, NIL, T), NIL);
            if (NIL != list) {
                rplacd(tail, next);
                tail = tail.rest();
            } else
                list = tail = next;

        } 
        return list;
    }

    public static SubLObject read_features(SubLObject stream) {
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject features = NIL;
        SubLObject _prev_bind_0 = $reading_fake_list$.currentBinding(thread);
        try {
            $reading_fake_list$.bind(T, thread);
            features = read(stream, T, NIL, T);
        } finally {
            $reading_fake_list$.rebind(_prev_bind_0, thread);
        }
        return features_match(fix_features(features));
    }

    public static SubLObject read_from_string(SubLObject string, SubLObject eof_error_p, SubLObject eof_value, SubLObject start, SubLObject end, SubLObject preserve_whitespace) {
        if (eof_error_p == UNPROVIDED)
            eof_error_p = T;

        if (eof_value == UNPROVIDED)
            eof_value = NIL;

        if (start == UNPROVIDED)
            start = ZERO_INTEGER;

        if (end == UNPROVIDED)
            end = NIL;

        if (preserve_whitespace == UNPROVIDED)
            preserve_whitespace = NIL;

        SubLObject result = NIL;
        SubLObject index = NIL;
        SubLObject in = NIL;
        try {
            in = make_private_string_input_stream(string, start, end);
            if (NIL != preserve_whitespace)
                result = read_preserving_whitespace(in, eof_error_p, eof_value, UNPROVIDED);
            else
                result = read(in, eof_error_p, eof_value, UNPROVIDED);

            index = stream_input_index(in);
        } finally {
            SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
            try {
                bind($is_thread_performing_cleanupP$, T);
                SubLObject _values = getValuesAsVector();
                close(in, UNPROVIDED);
                restoreValuesFromVector(_values);
            } finally {
                rebind($is_thread_performing_cleanupP$, _prev_bind_0);
            }
        }
        return values(result, index);
    }

    public static SubLObject read_from_string_ignoring_errors(SubLObject string, SubLObject eof_error_p, SubLObject eof_value, SubLObject start, SubLObject end) {
        if (eof_error_p == UNPROVIDED)
            eof_error_p = T;

        if (eof_value == UNPROVIDED)
            eof_value = $EOF;

        if (start == UNPROVIDED)
            start = ZERO_INTEGER;

        if (end == UNPROVIDED)
            end = NIL;

        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject index = NIL;
        SubLObject value = NIL;
        SubLObject status = NIL;
        SubLObject stream = NIL;
        try {
            stream = make_private_string_input_stream(string, start, end);
            thread.resetMultipleValues();
            SubLObject value_1 = read_ignoring_errors(stream, eof_error_p, eof_value);
            SubLObject status_1 = thread.secondMultipleValue();
            thread.resetMultipleValues();
            value = value_1;
            status = status_1;
            index = stream_input_index(stream);
        } finally {
            SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                $is_thread_performing_cleanupP$.bind(T, thread);
                SubLObject _values = getValuesAsVector();
                close(stream, UNPROVIDED);
                restoreValuesFromVector(_values);
            } finally {
                $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
            }
        }
        if (status == $ERROR)
            return values(value, status);

        return values(value, index);
    }

    public static SubLObject read_ignoring_errors(SubLObject stream, SubLObject eof_error_p, SubLObject eof_value) {
        if (stream == UNPROVIDED)
            stream = StreamsLow.$standard_input$.getDynamicValue();

        if (eof_error_p == UNPROVIDED)
            eof_error_p = T;

        if (eof_value == UNPROVIDED)
            eof_value = $EOF;

        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject end_of_file_p = NIL;
        SubLObject reader_error_p = NIL;
        SubLObject result = NIL;
        try {
            thread.throwStack.push(END_OF_FILE);
            try {
                thread.throwStack.push(READER_ERROR);
                SubLObject _prev_bind_0 = $throw_end_of_file_p$.currentBinding(thread);
                SubLObject _prev_bind_2 = $throw_reader_error_p$.currentBinding(thread);
                try {
                    $throw_end_of_file_p$.bind(NIL != $throw_end_of_file_p$.getDynamicValue(thread) ? T : makeBoolean(NIL == eof_error_p), thread);
                    $throw_reader_error_p$.bind(T, thread);
                    result = read(stream, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                } finally {
                    $throw_reader_error_p$.rebind(_prev_bind_2, thread);
                    $throw_end_of_file_p$.rebind(_prev_bind_0, thread);
                }
            } catch (Throwable ccatch_env_var) {
                reader_error_p = Errors.handleThrowable(ccatch_env_var, READER_ERROR);
            } finally {
                thread.throwStack.pop();
            }
        } catch (Throwable ccatch_env_var) {
            end_of_file_p = Errors.handleThrowable(ccatch_env_var, END_OF_FILE);
        } finally {
            thread.throwStack.pop();
        }
        if (NIL != reader_error_p)
            return values(NIL, $ERROR);

        if (NIL != end_of_file_p)
            return values(eof_value, $ERROR);

        return values(result, NIL);
    }

    public static SubLObject read_internal(SubLObject stream, SubLObject eof_error_p, SubLObject eof_value) {
        if (eof_error_p == UNPROVIDED)
            eof_error_p = T;

        if (eof_value == UNPROVIDED)
            eof_value = NIL;

        SubLThread thread = SubLProcess.currentSubLThread();
        while (true) {
            final SubLObject ch = read_char(stream, eof_error_p, NIL, UNPROVIDED);
            if (NIL == ch)
                return eof_value;

            final SubLObject func = character_function(ch, UNPROVIDED);
            SubLObject the_result = NIL;
            SubLObject good_p = NIL;
            if (func == CONSTITUENT_RMF) {
                thread.resetMultipleValues();
                SubLObject result = constituent_rmf(stream, ch);
                SubLObject goodp = thread.secondMultipleValue();
                thread.resetMultipleValues();
                the_result = result;
                good_p = goodp;
            } else
                if (func == WHITESPACE_RMF) {
                    thread.resetMultipleValues();
                    SubLObject result = whitespace_rmf(stream, ch);
                    SubLObject goodp = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    the_result = result;
                    good_p = goodp;
                } else
                    if (func == LEFT_PAREN_RMF) {
                        thread.resetMultipleValues();
                        SubLObject result = left_paren_rmf(stream, ch);
                        SubLObject goodp = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        the_result = result;
                        good_p = goodp;
                    } else
                        if (func == RIGHT_PAREN_RMF) {
                            thread.resetMultipleValues();
                            SubLObject result = right_paren_rmf(stream, ch);
                            SubLObject goodp = thread.secondMultipleValue();
                            thread.resetMultipleValues();
                            the_result = result;
                            good_p = goodp;
                        } else
                            if (func == SINGLE_QUOTE_RMF) {
                                thread.resetMultipleValues();
                                SubLObject result = single_quote_rmf(stream, ch);
                                SubLObject goodp = thread.secondMultipleValue();
                                thread.resetMultipleValues();
                                the_result = result;
                                good_p = goodp;
                            } else
                                if (func == DOUBLE_QUOTE_RMF) {
                                    thread.resetMultipleValues();
                                    SubLObject result = double_quote_rmf(stream, ch);
                                    SubLObject goodp = thread.secondMultipleValue();
                                    thread.resetMultipleValues();
                                    the_result = result;
                                    good_p = goodp;
                                } else
                                    if (func == BACKQUOTE_RMF) {
                                        thread.resetMultipleValues();
                                        SubLObject result = backquote_rmf(stream, ch);
                                        SubLObject goodp = thread.secondMultipleValue();
                                        thread.resetMultipleValues();
                                        the_result = result;
                                        good_p = goodp;
                                    } else
                                        if (func == COMMA_RMF) {
                                            thread.resetMultipleValues();
                                            SubLObject result = comma_rmf(stream, ch);
                                            SubLObject goodp = thread.secondMultipleValue();
                                            thread.resetMultipleValues();
                                            the_result = result;
                                            good_p = goodp;
                                        } else
                                            if (func == SEMICOLON_RMF) {
                                                thread.resetMultipleValues();
                                                SubLObject result = semicolon_rmf(stream, ch);
                                                SubLObject goodp = thread.secondMultipleValue();
                                                thread.resetMultipleValues();
                                                the_result = result;
                                                good_p = goodp;
                                            } else {
                                                thread.resetMultipleValues();
                                                SubLObject result = funcall(func, stream, ch);
                                                SubLObject goodp = thread.secondMultipleValue();
                                                thread.resetMultipleValues();
                                                the_result = result;
                                                good_p = goodp;
                                            }








            if (NIL != good_p)
                return the_result;

        } 
    }

    public static SubLObject read_lookup(SubLObject number) {
        SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != $read_lookup_table$.getDynamicValue(thread)) {
            thread.resetMultipleValues();
            SubLObject value = gethash(number, $read_lookup_table$.getDynamicValue(thread), UNPROVIDED);
            SubLObject valuep = thread.secondMultipleValue();
            thread.resetMultipleValues();
            return values(value, valuep);
        }
        return values(NIL, NIL);
    }

    public static SubLObject read_number_in_radix(SubLObject stream, SubLObject radix) {
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject token = make_read_token(UNPROVIDED);
        _csetf_read_token_pointer(token, ZERO_INTEGER);
        _csetf_read_token_buffer(token, Strings.make_string($initial_token_size$.getGlobalValue(), UNPROVIDED));
        _csetf_read_token_escapes(token, NIL);
        read_token(stream, token, NIL);
        if (NIL != $read_suppress$.getDynamicValue(thread))
            return NIL;

        SubLObject number = NIL;
        SubLObject _prev_bind_0 = $read_base$.currentBinding(thread);
        try {
            $read_base$.bind(radix, thread);
            number = parse_number(stream, token);
        } finally {
            $read_base$.rebind(_prev_bind_0, thread);
        }
        return number;
    }

    public static SubLObject read_preserving_whitespace(SubLObject stream, SubLObject eof_error_p, SubLObject eof_value, SubLObject recursivep) {
        if (stream == UNPROVIDED)
            stream = NIL;

        if (eof_error_p == UNPROVIDED)
            eof_error_p = T;

        if (eof_value == UNPROVIDED)
            eof_value = NIL;

        if (recursivep == UNPROVIDED)
            recursivep = NIL;

        SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == recursivep) {
            SubLObject value = NIL;
            SubLObject _prev_bind_0 = $read_lookup_table$.currentBinding(thread);
            try {
                $read_lookup_table$.bind(NIL, thread);
                value = read_preserving_whitespace(stream, eof_error_p, eof_value, T);
            } finally {
                $read_lookup_table$.rebind(_prev_bind_0, thread);
            }
            return value;
        }
        SubLObject value = read_internal(stream, eof_error_p, eof_value);
        if (NIL != $read_suppress$.getDynamicValue(thread))
            return NIL;

        return value;
    }

    public static SubLObject read_token(SubLObject stream, SubLObject token, SubLObject escapep) {
        SubLThread thread = SubLProcess.currentSubLThread();
        while (true) {
            SubLObject ch = read_char(stream, NIL, NIL, UNPROVIDED);
            if (NIL != escapep) {
                if (NIL == ch)
                    end_of_file_error(stream);
                else
                    if ((((NIL != constituent_syntaxp(ch)) || (NIL != non_terminating_macro_syntaxp(ch))) || (NIL != terminating_macro_syntaxp(ch))) || (NIL != whitespace_syntaxp(ch)))
                        add_to_token(ch, token, T);
                    else
                        if (NIL != single_escape_syntaxp(ch))
                            add_to_token(read_char(stream, UNPROVIDED, UNPROVIDED, UNPROVIDED), token, T);
                        else
                            if (NIL != multiple_escape_syntaxp(ch))
                                escapep = NIL;
                            else
                                if ((NIL != invalid_syntaxp(ch)) && (NIL == $read_suppress$.getDynamicValue(thread)))
                                    simple_reader_error($str143$_A_is_an_invalid_character_, list(ch));
                                else
                                    simple_reader_error($str144$Fell_through_character_syntax_on_, list(ch));





            } else {
                if (NIL == ch)
                    return token;

                if ((NIL != constituent_syntaxp(ch)) || (NIL != non_terminating_macro_syntaxp(ch)))
                    add_to_token(ch, token, NIL);
                else
                    if (NIL != single_escape_syntaxp(ch))
                        add_to_token(read_char(stream, UNPROVIDED, UNPROVIDED, UNPROVIDED), token, T);
                    else
                        if (NIL != multiple_escape_syntaxp(ch))
                            escapep = T;
                        else
                            if ((NIL != invalid_syntaxp(ch)) && (NIL == $read_suppress$.getDynamicValue(thread)))
                                simple_reader_error($str143$_A_is_an_invalid_character_, list(ch));
                            else {
                                if ((NIL != terminating_macro_syntaxp(ch)) || (NIL != whitespace_syntaxp(ch))) {
                                    unread_char(ch, stream);
                                    return token;
                                }
                                simple_reader_error($str144$Fell_through_character_syntax_on_, list(ch));
                            }



            }
        } 
    }

    public static SubLObject read_token_buffer(SubLObject object) {
        assert NIL != read_token_p(object) : "reader.read_token_p " + object;
        return object.getField3();
    }

    public static SubLObject read_token_escapes(SubLObject object) {
        assert NIL != read_token_p(object) : "reader.read_token_p " + object;
        return object.getField4();
    }

    public static SubLObject read_token_p(SubLObject object) {
        return object.getClass() == reader.$read_token_native.class ? T : NIL;
    }

    public static SubLObject read_token_pointer(SubLObject object) {
        assert NIL != read_token_p(object) : "reader.read_token_p " + object;
        return object.getField2();
    }

    public static SubLObject read_token_print_function_trampoline(SubLObject object, SubLObject stream) {
        compatibility.default_struct_print_function(object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject read_token_string(SubLObject token) {
        return subseq(read_token_buffer(token), ZERO_INTEGER, read_token_pointer(token));
    }

    public static SubLObject reader_find_package(SubLObject string, SubLObject start, SubLObject end) {
        SubLObject v_package = find_package(subseq(string, start, end));
        if (NIL == v_package)
            simple_reader_error($str146$_S_is_not_a_known_package_, list(subseq(string, start, end)));

        return v_package;
    }

    public static SubLObject readtable_case(SubLObject object) {
        assert NIL != readtable_p(object) : "reader.readtable_p " + object;
        return object.getField2();
    }

    public static SubLObject readtable_character_syntax(SubLObject object) {
        assert NIL != readtable_p(object) : "reader.readtable_p " + object;
        return object.getField3();
    }

    public static SubLObject readtable_constituent_traits(SubLObject object) {
        assert NIL != readtable_p(object) : "reader.readtable_p " + object;
        return object.getField7();
    }

    public static SubLObject readtable_dispatch_tables(SubLObject object) {
        assert NIL != readtable_p(object) : "reader.readtable_p " + object;
        return object.getField9();
    }

    public static SubLObject readtable_macro_functions(SubLObject object) {
        assert NIL != readtable_p(object) : "reader.readtable_p " + object;
        return object.getField5();
    }

    public static SubLObject readtable_p(SubLObject object) {
        return object.getClass() == reader.$readtable_native.class ? T : NIL;
    }

    public static SubLObject readtable_print_function_trampoline(SubLObject object, SubLObject stream) {
        compatibility.default_struct_print_function(object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject readtable_single_byte_char_syntax(SubLObject object) {
        assert NIL != readtable_p(object) : "reader.readtable_p " + object;
        return object.getField4();
    }

    public static SubLObject readtable_single_byte_constit_traits(SubLObject object) {
        assert NIL != readtable_p(object) : "reader.readtable_p " + object;
        return object.getField8();
    }

    public static SubLObject readtable_single_byte_macro_functions(SubLObject object) {
        assert NIL != readtable_p(object) : "reader.readtable_p " + object;
        return object.getField6();
    }

    public static SubLObject readtablep(SubLObject object) {
        return readtable_p(object);
    }

    public static SubLObject reset_trait(SubLObject ch, SubLObject readtable) {
        if (readtable == UNPROVIDED)
            readtable = $readtable$.getDynamicValue();

        if (NIL != single_byte_p(ch))
            set_aref(readtable_single_byte_constit_traits(readtable), char_code(ch), $alphabetic$.getGlobalValue());

        remhash(ch, readtable_constituent_traits(readtable));
        return NIL;
    }

    public static SubLObject right_paren_rmf(SubLObject stream, SubLObject ch) {
        SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != $reading_list$.getDynamicValue(thread))
            return values($right_paren$.getDynamicValue(thread), T);

        if (NIL != $ignore_extra_right_parens$.getDynamicValue(thread)) {
            Errors.warn($str182$Ignoring_unmatched_close_parenthe);
            return values(NIL, NIL);
        }
        simple_reader_error($str183$Unmatched__A_, list(ch));
        return NIL;
    }

    public static SubLObject self_evaluating_atom_p(SubLObject object) {
        return makeBoolean(object.isAtom() && ((((NIL == object) || (T == object)) || object.isKeyword()) || (!object.isSymbol())));
    }

    public static SubLObject semicolon_rmf(SubLObject stream, SubLObject ch) {
        SubLObject next_ch;
        do
            next_ch = read_char(stream, NIL, NIL, UNPROVIDED);
        while (((NIL != next_ch) && (NIL == charE(next_ch, CHAR_return))) && (NIL == charE(next_ch, CHAR_newline)) );
        return values(NIL, NIL);
    }

    public static SubLObject set_character_function(SubLObject ch, SubLObject func, SubLObject readtable) {
        if (readtable == UNPROVIDED)
            readtable = $readtable$.getDynamicValue();

        final SubLObject readtable_macro_functions2 = readtable_macro_functions(readtable);
	sethash(ch, readtable_macro_functions2, func);
        if (NIL != single_byte_p(ch))
            set_aref(readtable_single_byte_macro_functions(readtable), char_code(ch), func);

        return func;
    }

    public static SubLObject set_character_syntax(SubLObject ch, SubLObject syntax, SubLObject readtable) {
        if (readtable == UNPROVIDED)
            readtable = $readtable$.getDynamicValue();

        sethash(ch, readtable_character_syntax(readtable), syntax);
        if (NIL != single_byte_p(ch))
            set_aref(readtable_single_byte_char_syntax(readtable), char_code(ch), syntax);

        return syntax;
    }

    public static SubLObject set_dispatch_macro_character(SubLObject disp_char, SubLObject sub_char, SubLObject new_function, SubLObject readtable) {
        if (readtable == UNPROVIDED)
            readtable = $readtable$.getDynamicValue();

        if (NIL != digit_char_p(sub_char, UNPROVIDED))
            Errors.error($str72$Attempt_to_make_decimal_digit__A_, sub_char);

        SubLObject bucket = assoc(disp_char, readtable_dispatch_tables(readtable), UNPROVIDED, UNPROVIDED);
        if (NIL == bucket)
            Errors.error($str73$_A_is_not_a_dispatching_macro_cha, disp_char, readtable);

        sethash(char_upcase(sub_char), bucket.rest(), new_function);
        return T;
    }

    public static SubLObject set_macro_character(SubLObject v_char, SubLObject new_function, SubLObject non_terminating_p, SubLObject readtable) {
        if (non_terminating_p == UNPROVIDED)
            non_terminating_p = NIL;

        if (readtable == UNPROVIDED)
            readtable = $readtable$.getDynamicValue();

        set_character_function(v_char, new_function, readtable);
        set_character_syntax(v_char, NIL != non_terminating_p ? $NON_TERMINATING_MACRO : $TERMINATING_MACRO, readtable);
        return T;
    }

    public static SubLObject set_read_lookup(SubLObject number, SubLObject object) {
        SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == $read_lookup_table$.getDynamicValue(thread))
            $read_lookup_table$.setDynamicValue(make_hash_table($int$32, UNPROVIDED, UNPROVIDED), thread);

        sethash(number, $read_lookup_table$.getDynamicValue(thread), object);
        return object;
    }

    public static SubLObject set_syntax(SubLObject ch, SubLObject syntax, SubLObject function) {
        SubLThread thread = SubLProcess.currentSubLThread();
        set_macro_character(ch, function, NIL, $standard_readtable$.getDynamicValue(thread));
        set_character_syntax(ch, syntax, $standard_readtable$.getDynamicValue(thread));
        return NIL;
    }

    public static SubLObject set_syntax_from_char(SubLObject to_char, SubLObject from_char, SubLObject from_readtable, SubLObject to_readtable) {
        if (from_readtable == UNPROVIDED)
            from_readtable = NIL;

        if (to_readtable == UNPROVIDED)
            to_readtable = $readtable$.getDynamicValue();

        SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == from_readtable)
            from_readtable = $standard_readtable$.getDynamicValue(thread);

        SubLObject pcase_var;
        SubLObject syntax = pcase_var = (NIL != single_byte_p(from_char)) ? aref(readtable_single_byte_char_syntax(from_readtable), char_code(from_char)) : gethash(from_char, readtable_character_syntax(from_readtable), $CONSTITUENT);
        if (pcase_var.eql($TERMINATING_MACRO) || pcase_var.eql($NON_TERMINATING_MACRO)) {
            SubLObject rmf = character_function(from_char, from_readtable);
            if (rmf == DISPATCHING_RMF) {
                SubLObject from_table = assoc(from_char, readtable_dispatch_tables(from_readtable), UNPROVIDED, UNPROVIDED).rest();
                SubLObject to_table = make_hash_table(hash_table_count(from_table), UNPROVIDED, UNPROVIDED);
                _csetf_readtable_dispatch_tables(to_readtable, cons(cons(to_char, Xcopy_hash_table(from_table, to_table)), delete(to_char, readtable_dispatch_tables(to_readtable), symbol_function(EQL), symbol_function(CAR), UNPROVIDED, UNPROVIDED, UNPROVIDED)));
            }
            set_character_function(to_char, rmf, to_readtable);
        } else
            if (pcase_var.eql($CONSTITUENT))
                reset_trait(to_char, to_readtable);


        set_character_syntax(to_char, syntax, to_readtable);
        return T;
    }

    public static SubLObject set_trait(SubLObject ch, SubLObject readtable, SubLObject trait) {
        SubLObject new_traits = logior(trait, character_traits(ch, readtable));
        sethash(ch, readtable_constituent_traits(readtable), new_traits);
        if (NIL != single_byte_p(ch))
            set_aref(readtable_single_byte_constit_traits(readtable), char_code(ch), new_traits);

        return trait;
    }

    public static SubLObject setup_reader_file() {
        register_method($print_object_method_table$.getGlobalValue(), $dtp_readtable$.getGlobalValue(), symbol_function(READTABLE_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim($list14);
        def_csetf(READTABLE_CASE, _CSETF_READTABLE_CASE);
        def_csetf(READTABLE_CHARACTER_SYNTAX, _CSETF_READTABLE_CHARACTER_SYNTAX);
        def_csetf(READTABLE_SINGLE_BYTE_CHAR_SYNTAX, _CSETF_READTABLE_SINGLE_BYTE_CHAR_SYNTAX);
        def_csetf(READTABLE_MACRO_FUNCTIONS, _CSETF_READTABLE_MACRO_FUNCTIONS);
        def_csetf(READTABLE_SINGLE_BYTE_MACRO_FUNCTIONS, _CSETF_READTABLE_SINGLE_BYTE_MACRO_FUNCTIONS);
        def_csetf(READTABLE_CONSTITUENT_TRAITS, _CSETF_READTABLE_CONSTITUENT_TRAITS);
        def_csetf(READTABLE_SINGLE_BYTE_CONSTIT_TRAITS, _CSETF_READTABLE_SINGLE_BYTE_CONSTIT_TRAITS);
        def_csetf(READTABLE_DISPATCH_TABLES, _CSETF_READTABLE_DISPATCH_TABLES);
        identity(READTABLE);
        register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_readtable$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_READTABLE_METHOD));
        $standard_readtable$.setDynamicValue(create_readtable());
        SubLObject cdolist_list_var = $whitespace_1_chars$.getDynamicValue();
        SubLObject v_char = NIL;
        v_char = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            set_syntax(v_char, $WHITESPACE, WHITESPACE_RMF);
            cdolist_list_var = cdolist_list_var.rest();
            v_char = cdolist_list_var.first();
        } 
        set_syntax(CHAR_backslash, $SINGLE_ESCAPE, SINGLE_ESCAPE_RMF);
        set_syntax(CHAR_vertical, $MULTIPLE_ESCAPE, MULTIPLE_ESCAPE_RMF);
        set_macro_character(CHAR_lparen, LEFT_PAREN_RMF, NIL, $standard_readtable$.getDynamicValue());
        set_macro_character(CHAR_rparen, RIGHT_PAREN_RMF, NIL, $standard_readtable$.getDynamicValue());
        set_macro_character(CHAR_quote, SINGLE_QUOTE_RMF, NIL, $standard_readtable$.getDynamicValue());
        set_macro_character(CHAR_semicolon, SEMICOLON_RMF, NIL, $standard_readtable$.getDynamicValue());
        set_macro_character(CHAR_quotation, DOUBLE_QUOTE_RMF, NIL, $standard_readtable$.getDynamicValue());
        set_macro_character(CHAR_backquote, BACKQUOTE_RMF, NIL, $standard_readtable$.getDynamicValue());
        set_macro_character(CHAR_comma, COMMA_RMF, NIL, $standard_readtable$.getDynamicValue());
        make_dispatch_macro_character(CHAR_hash, T, $standard_readtable$.getDynamicValue());
        set_dispatch_macro_character(CHAR_hash, CHAR_backslash, SHARPSIGN_BACKSLASH_RMF, $standard_readtable$.getDynamicValue());
        set_dispatch_macro_character(CHAR_hash, CHAR_quote, SHARPSIGN_SINGLE_QUOTE_RMF, $standard_readtable$.getDynamicValue());
        set_dispatch_macro_character(CHAR_hash, CHAR_lparen, SHARPSIGN_LEFT_PAREN_RMF, $standard_readtable$.getDynamicValue());
        set_dispatch_macro_character(CHAR_hash, CHAR_asterisk, SHARPSIGN_ASTERISK_RMF, $standard_readtable$.getDynamicValue());
        set_dispatch_macro_character(CHAR_hash, CHAR_colon, SHARPSIGN_COLON_RMF, $standard_readtable$.getDynamicValue());
        set_dispatch_macro_character(CHAR_hash, CHAR_period, SHARPSIGN_DOT_RMF, $standard_readtable$.getDynamicValue());
        set_dispatch_macro_character(CHAR_hash, CHAR_B, SHARPSIGN_B_RMF, $standard_readtable$.getDynamicValue());
        set_dispatch_macro_character(CHAR_hash, CHAR_O, SHARPSIGN_O_RMF, $standard_readtable$.getDynamicValue());
        set_dispatch_macro_character(CHAR_hash, CHAR_X, SHARPSIGN_X_RMF, $standard_readtable$.getDynamicValue());
        set_dispatch_macro_character(CHAR_hash, CHAR_R, SHARPSIGN_R_RMF, $standard_readtable$.getDynamicValue());
        set_dispatch_macro_character(CHAR_hash, CHAR_C, SHARPSIGN_C_RMF, $standard_readtable$.getDynamicValue());
        set_dispatch_macro_character(CHAR_hash, CHAR_A, SHARPSIGN_A_RMF, $standard_readtable$.getDynamicValue());
        set_dispatch_macro_character(CHAR_hash, CHAR_S, SHARPSIGN_S_RMF, $standard_readtable$.getDynamicValue());
        set_dispatch_macro_character(CHAR_hash, CHAR_P, SHARPSIGN_P_RMF, $standard_readtable$.getDynamicValue());
        set_dispatch_macro_character(CHAR_hash, CHAR_G, SHARPSIGN_CAPITAL_G_RMF, $standard_readtable$.getDynamicValue());
        set_dispatch_macro_character(CHAR_hash, CHAR_equal, SHARPSIGN_EQUALS_RMF, $standard_readtable$.getDynamicValue());
        set_dispatch_macro_character(CHAR_hash, CHAR_hash, SHARPSIGN_SHARPSIGN_RMF, $standard_readtable$.getDynamicValue());
        set_dispatch_macro_character(CHAR_hash, CHAR_plus, SHARPSIGN_PLUS_RMF, $standard_readtable$.getDynamicValue());
        set_dispatch_macro_character(CHAR_hash, CHAR_hyphen, SHARPSIGN_MINUS_RMF, $standard_readtable$.getDynamicValue());
        set_dispatch_macro_character(CHAR_hash, CHAR_vertical, SHARPSIGN_VERTICAL_BAR_RMF, $standard_readtable$.getDynamicValue());
        SubLObject cdolist_list_var2;
        SubLObject invalid = cdolist_list_var2 = $list104;
        SubLObject ch = NIL;
        ch = cdolist_list_var2.first();
        while (NIL != cdolist_list_var2) {
            set_trait(ch, $standard_readtable$.getDynamicValue(), $invalid$.getGlobalValue());
            cdolist_list_var2 = cdolist_list_var2.rest();
            ch = cdolist_list_var2.first();
        } 
        SubLObject alphadigit = cdolist_list_var2 = $list105;
        ch = NIL;
        ch = cdolist_list_var2.first();
        while (NIL != cdolist_list_var2) {
            set_trait(ch, $standard_readtable$.getDynamicValue(), $alphabetic$.getGlobalValue());
            set_trait(ch, $standard_readtable$.getDynamicValue(), $digit$.getGlobalValue());
            cdolist_list_var2 = cdolist_list_var2.rest();
            ch = cdolist_list_var2.first();
        } 
        set_trait(CHAR_colon, $standard_readtable$.getDynamicValue(), $package_marker$.getGlobalValue());
        set_trait(CHAR_plus, $standard_readtable$.getDynamicValue(), $alphabetic$.getGlobalValue());
        set_trait(CHAR_plus, $standard_readtable$.getDynamicValue(), $plus_sign$.getGlobalValue());
        set_trait(CHAR_hyphen, $standard_readtable$.getDynamicValue(), $alphabetic$.getGlobalValue());
        set_trait(CHAR_hyphen, $standard_readtable$.getDynamicValue(), $minus_sign$.getGlobalValue());
        set_trait(CHAR_period, $standard_readtable$.getDynamicValue(), $alphabetic$.getGlobalValue());
        set_trait(CHAR_period, $standard_readtable$.getDynamicValue(), $dot$.getGlobalValue());
        set_trait(CHAR_period, $standard_readtable$.getDynamicValue(), $decimal_point$.getGlobalValue());
        set_trait(CHAR_slash, $standard_readtable$.getDynamicValue(), $alphabetic$.getGlobalValue());
        set_trait(CHAR_slash, $standard_readtable$.getDynamicValue(), $ratio_marker$.getGlobalValue());
        set_trait(CHAR_D, $standard_readtable$.getDynamicValue(), $exponent_marker$.getGlobalValue());
        set_trait(CHAR_d, $standard_readtable$.getDynamicValue(), $exponent_marker$.getGlobalValue());
        set_trait(CHAR_E, $standard_readtable$.getDynamicValue(), $exponent_marker$.getGlobalValue());
        set_trait(CHAR_e, $standard_readtable$.getDynamicValue(), $exponent_marker$.getGlobalValue());
        set_trait(CHAR_F, $standard_readtable$.getDynamicValue(), $exponent_marker$.getGlobalValue());
        set_trait(CHAR_f, $standard_readtable$.getDynamicValue(), $exponent_marker$.getGlobalValue());
        set_trait(CHAR_L, $standard_readtable$.getDynamicValue(), $exponent_marker$.getGlobalValue());
        set_trait(CHAR_l, $standard_readtable$.getDynamicValue(), $exponent_marker$.getGlobalValue());
        set_trait(CHAR_S, $standard_readtable$.getDynamicValue(), $exponent_marker$.getGlobalValue());
        set_trait(CHAR_s, $standard_readtable$.getDynamicValue(), $exponent_marker$.getGlobalValue());
        if ((NIL == boundp($readtable$)) || (NIL == $readtable$.getDynamicValue()))
            $readtable$.setDynamicValue(copy_readtable($standard_readtable$.getDynamicValue(), UNPROVIDED));

        register_method($print_object_method_table$.getGlobalValue(), $dtp_read_token$.getGlobalValue(), symbol_function(READ_TOKEN_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim($list126);
        def_csetf(READ_TOKEN_POINTER, _CSETF_READ_TOKEN_POINTER);
        def_csetf(READ_TOKEN_BUFFER, _CSETF_READ_TOKEN_BUFFER);
        def_csetf(READ_TOKEN_ESCAPES, _CSETF_READ_TOKEN_ESCAPES);
        identity(READ_TOKEN);
        register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_read_token$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_READ_TOKEN_METHOD));
        return NIL;
    }

    public static SubLObject sharpsign_a_rmf(SubLObject stream, SubLObject ch, SubLObject arg) {
        SubLThread thread = SubLProcess.currentSubLThread();
        if ((!arg.eql(ONE_INTEGER)) && (NIL == $read_suppress$.getDynamicValue(thread)))
            unimplemented_reader_macro_error(stream, ch);

        SubLObject contents = NIL;
        SubLObject _prev_bind_0 = $reading_fake_list$.currentBinding(thread);
        try {
            $reading_fake_list$.bind(T, thread);
            contents = read(stream, T, NIL, T);
        } finally {
            $reading_fake_list$.rebind(_prev_bind_0, thread);
        }
        if (NIL != $read_suppress$.getDynamicValue(thread))
            return values(NIL, T);

        if (!contents.isList()) {
            simple_reader_error($str213$The_form_after__A_reader_macro_wa, list(ch));
            return NIL;
        }
        return values(apply(symbol_function(VECTOR), contents), T);
    }

    public static SubLObject sharpsign_asterisk_rmf(SubLObject stream, SubLObject ch, SubLObject arg) {
        SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != $read_suppress$.getDynamicValue(thread))
            read(stream, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        else
            unimplemented_reader_macro_error(stream, ch);

        return values(NIL, T);
    }

    public static SubLObject sharpsign_b_rmf(SubLObject stream, SubLObject ch, SubLObject arg) {
        SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL != arg) && (NIL == $read_suppress$.getDynamicValue(thread)))
            unnecessary_argument_error(stream, ch);

        return values(read_number_in_radix(stream, TWO_INTEGER), T);
    }

    public static SubLObject sharpsign_backslash_rmf(SubLObject stream, SubLObject ch, SubLObject arg) {
        SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL != arg) && (NIL == $read_suppress$.getDynamicValue(thread)))
            unnecessary_argument_error(stream, ch);

        SubLObject token = make_read_token(UNPROVIDED);
        _csetf_read_token_pointer(token, ZERO_INTEGER);
        _csetf_read_token_buffer(token, Strings.make_string($initial_token_size$.getGlobalValue(), UNPROVIDED));
        _csetf_read_token_escapes(token, NIL);
        add_to_token(read_char(stream, UNPROVIDED, UNPROVIDED, UNPROVIDED), token, T);
        read_token(stream, token, NIL);
        if (NIL != $read_suppress$.getDynamicValue(thread))
            return values(NIL, T);

        SubLObject name = read_token_string(token);
        SubLObject ch_$1 = name_character(name);
        if (NIL != ch_$1)
            return values(ch_$1, T);

        simple_reader_error($str208$_S_is_not_the_name_of_a_character, list(name));
        return NIL;
    }

    public static SubLObject sharpsign_c_rmf(SubLObject stream, SubLObject ch, SubLObject arg) {
        SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != $read_suppress$.getDynamicValue(thread))
            read(stream, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        else
            unimplemented_reader_macro_error(stream, ch);

        return values(NIL, T);
    }

    public static SubLObject sharpsign_capital_g_rmf(SubLObject stream, SubLObject ch, SubLObject arg) {
        SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != arg)
            simple_reader_error($str171$The__S_reader_macro_does_not_take, list(ch));

        SubLObject string = read(stream, NIL, NIL, T);
        if (!string.isString())
            simple_reader_error($str172$The__S_reader_macro_expected_a_st, list(ch));

        if (NIL == Guids.guid_string_p(string))
            simple_reader_error($str173$The__S_reader_macro_could_not_int, list(ch, string));

        if (NIL != $read_suppress$.getDynamicValue(thread))
            return values(NIL, T);

        return values(Guids.string_to_guid(string), T);
    }

    public static SubLObject sharpsign_colon_rmf(SubLObject stream, SubLObject ch, SubLObject arg) {
        SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL != arg) && (NIL == $read_suppress$.getDynamicValue(thread)))
            unnecessary_argument_error(stream, ch);

        SubLObject token = make_read_token(UNPROVIDED);
        _csetf_read_token_pointer(token, ZERO_INTEGER);
        _csetf_read_token_buffer(token, Strings.make_string($initial_token_size$.getGlobalValue(), UNPROVIDED));
        _csetf_read_token_escapes(token, NIL);
        read_token(stream, token, NIL);
        if (NIL != $read_suppress$.getDynamicValue(thread))
            values(NIL, T);
        else {
            SubLObject escapes = nreverse(read_token_escapes(token));
            _csetf_read_token_escapes(token, escapes);
            if ((NIL == escapes) && (NIL != potential_number_p(read_token_buffer(token), read_token_pointer(token))))
                invalid_token_syntax_error(stream, token);

            frob_case(token);
            SubLObject buffer = read_token_buffer(token);
            SubLObject length = read_token_pointer(token);
            SubLObject escapes_$2 = read_token_escapes(token);
            SubLObject dot_count = ZERO_INTEGER;
            SubLObject i;
            SubLObject ch_$3;
            SubLObject escape_idx;
            for (i = NIL, i = ZERO_INTEGER; i.numL(length); i = add(i, ONE_INTEGER)) {
                ch_$3 = Strings.sublisp_char(buffer, i);
                escape_idx = escapes_$2.first();
                if ((NIL != escape_idx) && escape_idx.numE(i))
                    escapes_$2 = escapes_$2.rest();
                else
                    if (NIL != package_marker_traitp(ch_$3))
                        invalid_token_syntax_error(stream, token);
                    else
                        if (NIL != dot_traitp(ch_$3))
                            dot_count = add(dot_count, ONE_INTEGER);



            }
            if (!dot_count.numE(length))
                return values(make_symbol(read_token_string(token)), T);

            invalid_token_syntax_error(stream, token);
        }
        return NIL;
    }

    public static SubLObject sharpsign_dot_rmf(SubLObject stream, SubLObject ch, SubLObject arg) {
        SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL != arg) && (NIL == $read_suppress$.getDynamicValue(thread)))
            unnecessary_argument_error(stream, ch);

        SubLObject subform = read(stream, T, NIL, T);
        if (NIL != $read_suppress$.getDynamicValue(thread))
            return values(NIL, T);

        if (NIL == $read_eval$.getDynamicValue(thread)) {
            simple_reader_error($str210$Attempt_the_use_the__A_reader_mac, list(ch, $read_eval$, $read_eval$.getDynamicValue(thread)));
            return NIL;
        }
        return values(eval(subform), T);
    }

    public static SubLObject sharpsign_equals_rmf(SubLObject stream, SubLObject ch, SubLObject arg) {
        SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL == arg) && (NIL == $read_suppress$.getDynamicValue(thread)))
            illegal_argument_error(stream, ch, arg);

        if (NIL != $read_suppress$.getDynamicValue(thread))
            return values(NIL, T);

        SubLObject subform = read(stream, T, NIL, T);
        thread.resetMultipleValues();
        SubLObject old = read_lookup(arg);
        SubLObject oldp = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (NIL != oldp)
            simple_reader_error($str214$Label__S_appears_more_than_once_, list(arg));
        else
            set_read_lookup(arg, subform);

        return values(subform, T);
    }

    public static SubLObject sharpsign_left_paren_rmf(SubLObject stream, SubLObject ch, SubLObject arg) {
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject elts = read_delimited_list(CHAR_rparen, stream, T);
        if (NIL != $read_suppress$.getDynamicValue(thread))
            return values(NIL, T);

        SubLObject length = length(elts);
        if (NIL != arg)
            if (!arg.numE(length))
                if (length.numL(arg))
                    elts = append(elts, make_list(subtract(arg, length), last(elts, UNPROVIDED).first()));
                else
                    illegal_argument_error(stream, ch, arg);



        return values($backquote_depth$.getDynamicValue(thread).numG(ZERO_INTEGER) ? cons($bq_vector$.getDynamicValue(thread), elts) : apply(symbol_function(VECTOR), elts), T);
    }

    public static SubLObject sharpsign_minus_rmf(SubLObject stream, SubLObject ch, SubLObject arg) {
        SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL != arg) && (NIL == $read_suppress$.getDynamicValue(thread)))
            unnecessary_argument_error(stream, ch);

        if (NIL != read_features(stream)) {
            SubLObject _prev_bind_0 = $read_suppress$.currentBinding(thread);
            try {
                $read_suppress$.bind(T, thread);
                read(stream, T, NIL, T);
            } finally {
                $read_suppress$.rebind(_prev_bind_0, thread);
            }
            return values(NIL, NIL);
        }
        return values(read(stream, T, NIL, T), T);
    }

    public static SubLObject sharpsign_o_rmf(SubLObject stream, SubLObject ch, SubLObject arg) {
        SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL != arg) && (NIL == $read_suppress$.getDynamicValue(thread)))
            unnecessary_argument_error(stream, ch);

        return values(read_number_in_radix(stream, EIGHT_INTEGER), T);
    }

    public static SubLObject sharpsign_p_rmf(SubLObject stream, SubLObject ch, SubLObject arg) {
        SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL != arg) && (NIL == $read_suppress$.getDynamicValue(thread)))
            unnecessary_argument_error(stream, ch);

        SubLObject subform = read(stream, T, NIL, T);
        if (NIL != $read_suppress$.getDynamicValue(thread))
            return values(NIL, T);

        return values(subform, T);
    }

    public static SubLObject sharpsign_plus_rmf(SubLObject stream, SubLObject ch, SubLObject arg) {
        SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL != arg) && (NIL == $read_suppress$.getDynamicValue(thread)))
            unnecessary_argument_error(stream, ch);

        if (NIL != read_features(stream))
            return values(read(stream, T, NIL, T), T);

        SubLObject _prev_bind_0 = $read_suppress$.currentBinding(thread);
        try {
            $read_suppress$.bind(T, thread);
            read(stream, T, NIL, T);
        } finally {
            $read_suppress$.rebind(_prev_bind_0, thread);
        }
        return values(NIL, NIL);
    }

    public static SubLObject sharpsign_r_rmf(SubLObject stream, SubLObject ch, SubLObject arg) {
        if (((NIL == arg) || (!arg.numGE(TWO_INTEGER))) || (!arg.numLE($int$36)))
            illegal_argument_error(stream, ch, arg);

        return values(read_number_in_radix(stream, arg), T);
    }

    public static SubLObject sharpsign_s_rmf(SubLObject stream, SubLObject ch, SubLObject arg) {
        SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != $read_suppress$.getDynamicValue(thread))
            read(stream, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        else
            unimplemented_reader_macro_error(stream, ch);

        return values(NIL, T);
    }

    public static SubLObject sharpsign_sharpsign_rmf(SubLObject stream, SubLObject ch, SubLObject arg) {
        SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL == arg) && (NIL == $read_suppress$.getDynamicValue(thread)))
            illegal_argument_error(stream, ch, arg);

        if (NIL != $read_suppress$.getDynamicValue(thread))
            return values(NIL, T);

        thread.resetMultipleValues();
        SubLObject old = read_lookup(arg);
        SubLObject oldp = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (NIL != oldp)
            return values(old, T);

        simple_reader_error($str215$Label__S_has_not_been_seen_, list(arg));
        return NIL;
    }

    public static SubLObject sharpsign_single_quote_rmf(SubLObject stream, SubLObject ch, SubLObject arg) {
        SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL != arg) && (NIL == $read_suppress$.getDynamicValue(thread)))
            unnecessary_argument_error(stream, ch);

        SubLObject subform = read(stream, T, NIL, T);
        if (NIL != $read_suppress$.getDynamicValue(thread))
            return values(NIL, T);

        return values(list(FUNCTION, subform), T);
    }

    public static SubLObject sharpsign_vertical_bar_rmf(SubLObject stream, SubLObject ch, SubLObject arg) {
        SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL != arg) && (NIL == $read_suppress$.getDynamicValue(thread)))
            unnecessary_argument_error(stream, ch);

        SubLObject depth = ONE_INTEGER;
        SubLObject state = $INITIAL;
        SubLObject ch_$4 = NIL;
        ch_$4 = read_char(stream, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        while (true) {
            SubLObject pcase_var = state;
            if (pcase_var.eql($HASH)) {
                SubLObject pcase_var_$5 = ch_$4;
                if (pcase_var_$5.eql(CHAR_vertical)) {
                    depth = add(depth, ONE_INTEGER);
                    state = $INITIAL;
                } else
                    if (!pcase_var_$5.eql(CHAR_hash))
                        state = $INITIAL;


            } else
                if (pcase_var.eql($VERTICAL_BAR)) {
                    SubLObject pcase_var_$6 = ch_$4;
                    if (!pcase_var_$6.eql(CHAR_vertical))
                        if (pcase_var_$6.eql(CHAR_hash)) {
                            depth = subtract(depth, ONE_INTEGER);
                            if (depth.isZero())
                                break;

                        } else
                            state = $INITIAL;


                } else
                    if (pcase_var.eql($INITIAL)) {
                        SubLObject pcase_var_$7 = ch_$4;
                        if (pcase_var_$7.eql(CHAR_vertical))
                            state = $VERTICAL_BAR;
                        else
                            if (pcase_var_$7.eql(CHAR_hash))
                                state = $HASH;


                    }


            ch_$4 = read_char(stream, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        } 
        return values(NIL, NIL);
    }

    public static SubLObject sharpsign_x_rmf(SubLObject stream, SubLObject ch, SubLObject arg) {
        SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL != arg) && (NIL == $read_suppress$.getDynamicValue(thread)))
            unnecessary_argument_error(stream, ch);

        return values(read_number_in_radix(stream, SIXTEEN_INTEGER), T);
    }

    public static SubLObject simple_reader_error(SubLObject format_control, SubLObject format_arguments) {
        SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != $throw_reader_error_p$.getDynamicValue(thread))
            sublisp_throw(READER_ERROR, T);
        else
            apply(symbol_function(ERROR), format_control, format_arguments);

        return NIL;
    }

    public static SubLObject single_byte_p(SubLObject ch) {
        return numL(char_code(ch), $single_byte_max_code$.getGlobalValue());
    }

    public static SubLObject single_escape_rmf(SubLObject stream, SubLObject ch) {
        SubLObject token = make_read_token(UNPROVIDED);
        _csetf_read_token_pointer(token, ZERO_INTEGER);
        _csetf_read_token_buffer(token, Strings.make_string($initial_token_size$.getGlobalValue(), UNPROVIDED));
        _csetf_read_token_escapes(token, NIL);
        add_to_token(read_char(stream, UNPROVIDED, UNPROVIDED, UNPROVIDED), token, T);
        read_token(stream, token, NIL);
        return values(parse_token(stream, token), T);
    }

    public static SubLObject single_escape_syntaxp(SubLObject ch) {
        SubLThread thread = SubLProcess.currentSubLThread();
        return eq(NIL != single_byte_p(ch) ? aref(readtable_single_byte_char_syntax($readtable$.getDynamicValue(thread)), char_code(ch)) : gethash(ch, readtable_character_syntax($readtable$.getDynamicValue(thread)), $CONSTITUENT), $SINGLE_ESCAPE);
    }

    public static SubLObject single_quote_rmf(SubLObject stream, SubLObject ch) {
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject object = read(stream, T, NIL, T);
        return values(NIL != $read_suppress$.getDynamicValue(thread) ? NIL : list(QUOTE, object), T);
    }

    public static SubLObject symbol_escapep(SubLObject symbol) {
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject name = symbol_name(symbol);
        SubLObject length = length(name);
        SubLObject escapep = NIL;
        SubLObject _prev_bind_0 = $read_base$.currentBinding(thread);
        try {
            $read_base$.bind($print_base$.getDynamicValue(thread), thread);
            escapep = potential_number_p(name, length);
        } finally {
            $read_base$.rebind(_prev_bind_0, thread);
        }
        if (NIL != escapep)
            return T;

        SubLObject non_consing_dot = NIL;
        SubLObject v_case = readtable_case($readtable$.getDynamicValue(thread));
        SubLObject i;
        SubLObject ch;
        for (i = NIL, i = ZERO_INTEGER; i.numL(length); i = add(i, ONE_INTEGER)) {
            ch = Strings.sublisp_char(name, i);
            if ((!CHAR_vertical.equalp(ch)) && (NIL == constituent_syntaxp(ch)))
                return T;

            if (NIL != package_marker_traitp(ch))
                return T;

            if (NIL == dot_traitp(ch))
                non_consing_dot = T;

            if (NIL != both_case_p(ch)) {
                if ((NIL != lower_case_p(ch)) && (v_case == $UPCASE))
                    return T;

                if ((NIL != upper_case_p(ch)) && (v_case == $DOWNCASE))
                    return T;

            }
        }
        return makeBoolean(NIL == non_consing_dot);
    }

    public static SubLObject terminating_macro_syntaxp(SubLObject ch) {
        SubLThread thread = SubLProcess.currentSubLThread();
        return eq(NIL != single_byte_p(ch) ? aref(readtable_single_byte_char_syntax($readtable$.getDynamicValue(thread)), char_code(ch)) : gethash(ch, readtable_character_syntax($readtable$.getDynamicValue(thread)), $CONSTITUENT), $TERMINATING_MACRO);
    }

    public static SubLObject unimplemented_reader_macro_error(SubLObject stream, SubLObject ch) {
        simple_reader_error($str111$The__A_reader_macro_is_not_implem, list(ch));
        return NIL;
    }

    public static SubLObject unnecessary_argument_error(SubLObject stream, SubLObject ch) {
        simple_reader_error($str112$The__A_reader_macro_does_not_take, list(ch));
        return NIL;
    }

    public static SubLObject visit_defstruct_object_read_token_method(SubLObject obj, SubLObject visitor_fn) {
        return visit_defstruct_read_token(obj, visitor_fn);
    }

    public static SubLObject visit_defstruct_object_readtable_method(SubLObject obj, SubLObject visitor_fn) {
        return visit_defstruct_readtable(obj, visitor_fn);
    }

    public static SubLObject visit_defstruct_read_token(SubLObject obj, SubLObject visitor_fn) {
        funcall(visitor_fn, obj, $BEGIN, MAKE_READ_TOKEN, THREE_INTEGER);
        funcall(visitor_fn, obj, $SLOT, $POINTER, read_token_pointer(obj));
        funcall(visitor_fn, obj, $SLOT, $BUFFER, read_token_buffer(obj));
        funcall(visitor_fn, obj, $SLOT, $ESCAPES, read_token_escapes(obj));
        funcall(visitor_fn, obj, $END, MAKE_READ_TOKEN, THREE_INTEGER);
        return obj;
    }

    public static SubLObject visit_defstruct_readtable(SubLObject obj, SubLObject visitor_fn) {
        funcall(visitor_fn, obj, $BEGIN, MAKE_READTABLE, EIGHT_INTEGER);
        funcall(visitor_fn, obj, $SLOT, $CASE, readtable_case(obj));
        funcall(visitor_fn, obj, $SLOT, $CHARACTER_SYNTAX, readtable_character_syntax(obj));
        funcall(visitor_fn, obj, $SLOT, $SINGLE_BYTE_CHAR_SYNTAX, readtable_single_byte_char_syntax(obj));
        funcall(visitor_fn, obj, $SLOT, $MACRO_FUNCTIONS, readtable_macro_functions(obj));
        funcall(visitor_fn, obj, $SLOT, $SINGLE_BYTE_MACRO_FUNCTIONS, readtable_single_byte_macro_functions(obj));
        funcall(visitor_fn, obj, $SLOT, $CONSTITUENT_TRAITS, readtable_constituent_traits(obj));
        funcall(visitor_fn, obj, $SLOT, $SINGLE_BYTE_CONSTIT_TRAITS, readtable_single_byte_constit_traits(obj));
        funcall(visitor_fn, obj, $SLOT, $DISPATCH_TABLES, readtable_dispatch_tables(obj));
        funcall(visitor_fn, obj, $END, MAKE_READTABLE, EIGHT_INTEGER);
        return obj;
    }

    public static SubLObject whitespace_1_char_p(SubLObject v_char) {
        SubLThread thread = SubLProcess.currentSubLThread();
        return member(v_char, $whitespace_1_chars$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject whitespace_2_char_p(SubLObject v_char) {
        return whitespace_syntaxp(v_char);
    }

    public static SubLObject whitespace_rmf(SubLObject stream, SubLObject ch) {
        return values(NIL, NIL);
    }

    public static SubLObject whitespace_syntaxp(SubLObject ch) {
        SubLThread thread = SubLProcess.currentSubLThread();
        return eq(NIL != single_byte_p(ch) ? aref(readtable_single_byte_char_syntax($readtable$.getDynamicValue(thread)), char_code(ch)) : gethash(ch, readtable_character_syntax($readtable$.getDynamicValue(thread)), $CONSTITUENT), $WHITESPACE);
    }

    public static SubLObject with_read_token(SubLObject macroform, SubLObject environment) {
        SubLObject current;
        SubLObject datum = current = macroform.rest();
        SubLObject token = NIL;
        destructuring_bind_must_consp(current, datum, $list138);
        token = current.first();
        SubLObject body;
        current = body = current.rest();
        return listS(CLET, list(bq_cons(token, $list139)), $list140, $list141, $list142, append(body, NIL));
    }

    public static SubLObject with_special_reader_error_handling(SubLObject macroform, SubLObject environment) {
        SubLObject datum = macroform.rest();
        SubLObject body;
        body = datum;
        return bq_cons(PROGN, append(body, NIL));
    }

    public static SubLObject with_standard_io_syntax(SubLObject macroform, SubLObject environment) {
        SubLObject datum = macroform.rest();
        SubLObject body;
        body = datum;
        return listS(CLET, $list115, append(body, NIL));
    }

    public static SubLObject Xcopy_hash_table(SubLObject from, SubLObject to) {
        SubLObject k = NIL;
        SubLObject v = NIL;
        Iterator cdohash_iterator = getEntrySetIterator(from);
        try {
            while (iteratorHasNext(cdohash_iterator)) {
                Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                k = getEntryKey(cdohash_entry);
                v = getEntryValue(cdohash_entry);
                sethash(k, to, v);
            } 
        } finally {
            releaseEntrySetIterator(cdohash_iterator);
        }
        return to;
    }

    public static final SubLFile me = new reader();

    public static final String myName = "com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader";

    // defvar
    public static final SubLSymbol $whitespace_1_chars$ = makeSymbol("*WHITESPACE-1-CHARS*");

    // defvar
    public static final SubLSymbol $read_base$ = makeSymbol("*READ-BASE*");

    // defvar
    public static final SubLSymbol $read_default_float_format$ = makeSymbol("*READ-DEFAULT-FLOAT-FORMAT*");



    // defvar
    public static final SubLSymbol $read_suppress$ = makeSymbol("*READ-SUPPRESS*");

    // defvar
    public static final SubLSymbol $features$ = makeSymbol("*FEATURES*");



    // defparameter
    private static final SubLSymbol $initial_table_size$ = makeSymbol("*INITIAL-TABLE-SIZE*");

    // defconstant
    public static final SubLSymbol $single_byte_max_code$ = makeSymbol("*SINGLE-BYTE-MAX-CODE*");

    // defconstant
    public static final SubLSymbol $dtp_readtable$ = makeSymbol("*DTP-READTABLE*");

    // defconstant
    private static final SubLSymbol $alphabetic$ = makeSymbol("*ALPHABETIC*");

    // defconstant
    private static final SubLSymbol $digit$ = makeSymbol("*DIGIT*");

    // defconstant
    private static final SubLSymbol $package_marker$ = makeSymbol("*PACKAGE-MARKER*");

    // defconstant
    private static final SubLSymbol $plus_sign$ = makeSymbol("*PLUS-SIGN*");

    // defconstant
    private static final SubLSymbol $minus_sign$ = makeSymbol("*MINUS-SIGN*");

    // defconstant
    private static final SubLSymbol $dot$ = makeSymbol("*DOT*");

    // defconstant
    private static final SubLSymbol $decimal_point$ = makeSymbol("*DECIMAL-POINT*");

    // defconstant
    private static final SubLSymbol $ratio_marker$ = makeSymbol("*RATIO-MARKER*");

    // defconstant
    private static final SubLSymbol $exponent_marker$ = makeSymbol("*EXPONENT-MARKER*");

    // defconstant
    private static final SubLSymbol $invalid$ = makeSymbol("*INVALID*");

    // defvar
    public static final SubLSymbol $standard_readtable$ = makeSymbol("*STANDARD-READTABLE*");

    // defvar
    private static final SubLSymbol $throw_reader_error_p$ = makeSymbol("*THROW-READER-ERROR-P*");

    // defvar
    private static final SubLSymbol $throw_end_of_file_p$ = makeSymbol("*THROW-END-OF-FILE-P*");

    // defvarCheckCL
    private static final SubLSymbol $read_lookup_table$ = makeSymbol("*READ-LOOKUP-TABLE*");

    // defconstant
    private static final SubLSymbol $initial_token_size$ = makeSymbol("*INITIAL-TOKEN-SIZE*");

    // defconstant
    public static final SubLSymbol $dtp_read_token$ = makeSymbol("*DTP-READ-TOKEN*");

    // defparameter
    private static final SubLSymbol $consing_dot$ = makeSymbol("*CONSING-DOT*");

    // deflexical
    public static final SubLSymbol $keyword_package$ = makeSymbol("*KEYWORD-PACKAGE*");

    // defvar
    private static final SubLSymbol $reading_list$ = makeSymbol("*READING-LIST*");

    // defvar
    private static final SubLSymbol $reading_fake_list$ = makeSymbol("*READING-FAKE-LIST*");

    // defparameter
    private static final SubLSymbol $right_paren$ = makeSymbol("*RIGHT-PAREN*");

    // defparameter
    public static final SubLSymbol $ignore_extra_right_parens$ = makeSymbol("*IGNORE-EXTRA-RIGHT-PARENS*");

    // defparameter
    private static final SubLSymbol $bq_comma$ = makeSymbol("*BQ-COMMA*");

    // defparameter
    private static final SubLSymbol $bq_atsign$ = makeSymbol("*BQ-ATSIGN*");

    // defparameter
    private static final SubLSymbol $bq_dot$ = makeSymbol("*BQ-DOT*");

    // defparameter
    private static final SubLSymbol $bq_vector$ = makeSymbol("*BQ-VECTOR*");

    // defvar
    private static final SubLSymbol $backquote_depth$ = makeSymbol("*BACKQUOTE-DEPTH*");



    public static final SubLList $list1 = list(NIL);



    public static final SubLList $list3 = list(makeKeyword("SL2JAVA"));

    private static final SubLInteger $int$128 = makeInteger(128);

    public static final SubLSymbol READTABLE = makeSymbol("READTABLE");

    public static final SubLSymbol READTABLE_P = makeSymbol("READTABLE-P");

    public static final SubLList $list8 = list(makeSymbol("CASE"), makeSymbol("CHARACTER-SYNTAX"), makeSymbol("SINGLE-BYTE-CHAR-SYNTAX"), makeSymbol("MACRO-FUNCTIONS"), makeSymbol("SINGLE-BYTE-MACRO-FUNCTIONS"), makeSymbol("CONSTITUENT-TRAITS"), makeSymbol("SINGLE-BYTE-CONSTIT-TRAITS"), makeSymbol("DISPATCH-TABLES"));

    public static final SubLList $list9 = list(makeKeyword("CASE"), makeKeyword("CHARACTER-SYNTAX"), makeKeyword("SINGLE-BYTE-CHAR-SYNTAX"), makeKeyword("MACRO-FUNCTIONS"), makeKeyword("SINGLE-BYTE-MACRO-FUNCTIONS"), makeKeyword("CONSTITUENT-TRAITS"), makeKeyword("SINGLE-BYTE-CONSTIT-TRAITS"), makeKeyword("DISPATCH-TABLES"));

    public static final SubLList $list10 = list(makeSymbol("READTABLE-CASE"), makeSymbol("READTABLE-CHARACTER-SYNTAX"), makeSymbol("READTABLE-SINGLE-BYTE-CHAR-SYNTAX"), makeSymbol("READTABLE-MACRO-FUNCTIONS"), makeSymbol("READTABLE-SINGLE-BYTE-MACRO-FUNCTIONS"), makeSymbol("READTABLE-CONSTITUENT-TRAITS"), makeSymbol("READTABLE-SINGLE-BYTE-CONSTIT-TRAITS"), makeSymbol("READTABLE-DISPATCH-TABLES"));

    public static final SubLList $list11 = list(makeSymbol("_CSETF-READTABLE-CASE"), makeSymbol("_CSETF-READTABLE-CHARACTER-SYNTAX"), makeSymbol("_CSETF-READTABLE-SINGLE-BYTE-CHAR-SYNTAX"), makeSymbol("_CSETF-READTABLE-MACRO-FUNCTIONS"), makeSymbol("_CSETF-READTABLE-SINGLE-BYTE-MACRO-FUNCTIONS"), makeSymbol("_CSETF-READTABLE-CONSTITUENT-TRAITS"), makeSymbol("_CSETF-READTABLE-SINGLE-BYTE-CONSTIT-TRAITS"), makeSymbol("_CSETF-READTABLE-DISPATCH-TABLES"));



    public static final SubLSymbol READTABLE_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("READTABLE-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLList $list14 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("READTABLE-P"));

    private static final SubLSymbol READTABLE_CASE = makeSymbol("READTABLE-CASE");

    private static final SubLSymbol _CSETF_READTABLE_CASE = makeSymbol("_CSETF-READTABLE-CASE");

    private static final SubLSymbol READTABLE_CHARACTER_SYNTAX = makeSymbol("READTABLE-CHARACTER-SYNTAX");

    private static final SubLSymbol _CSETF_READTABLE_CHARACTER_SYNTAX = makeSymbol("_CSETF-READTABLE-CHARACTER-SYNTAX");

    private static final SubLSymbol READTABLE_SINGLE_BYTE_CHAR_SYNTAX = makeSymbol("READTABLE-SINGLE-BYTE-CHAR-SYNTAX");

    private static final SubLSymbol _CSETF_READTABLE_SINGLE_BYTE_CHAR_SYNTAX = makeSymbol("_CSETF-READTABLE-SINGLE-BYTE-CHAR-SYNTAX");

    private static final SubLSymbol READTABLE_MACRO_FUNCTIONS = makeSymbol("READTABLE-MACRO-FUNCTIONS");

    private static final SubLSymbol _CSETF_READTABLE_MACRO_FUNCTIONS = makeSymbol("_CSETF-READTABLE-MACRO-FUNCTIONS");

    private static final SubLSymbol READTABLE_SINGLE_BYTE_MACRO_FUNCTIONS = makeSymbol("READTABLE-SINGLE-BYTE-MACRO-FUNCTIONS");

    private static final SubLSymbol _CSETF_READTABLE_SINGLE_BYTE_MACRO_FUNCTIONS = makeSymbol("_CSETF-READTABLE-SINGLE-BYTE-MACRO-FUNCTIONS");

    private static final SubLSymbol READTABLE_CONSTITUENT_TRAITS = makeSymbol("READTABLE-CONSTITUENT-TRAITS");

    private static final SubLSymbol _CSETF_READTABLE_CONSTITUENT_TRAITS = makeSymbol("_CSETF-READTABLE-CONSTITUENT-TRAITS");

    private static final SubLSymbol READTABLE_SINGLE_BYTE_CONSTIT_TRAITS = makeSymbol("READTABLE-SINGLE-BYTE-CONSTIT-TRAITS");

    private static final SubLSymbol _CSETF_READTABLE_SINGLE_BYTE_CONSTIT_TRAITS = makeSymbol("_CSETF-READTABLE-SINGLE-BYTE-CONSTIT-TRAITS");

    private static final SubLSymbol READTABLE_DISPATCH_TABLES = makeSymbol("READTABLE-DISPATCH-TABLES");

    private static final SubLSymbol _CSETF_READTABLE_DISPATCH_TABLES = makeSymbol("_CSETF-READTABLE-DISPATCH-TABLES");



    private static final SubLSymbol $CHARACTER_SYNTAX = makeKeyword("CHARACTER-SYNTAX");

    private static final SubLSymbol $SINGLE_BYTE_CHAR_SYNTAX = makeKeyword("SINGLE-BYTE-CHAR-SYNTAX");

    private static final SubLSymbol $MACRO_FUNCTIONS = makeKeyword("MACRO-FUNCTIONS");

    private static final SubLSymbol $SINGLE_BYTE_MACRO_FUNCTIONS = makeKeyword("SINGLE-BYTE-MACRO-FUNCTIONS");

    private static final SubLSymbol $CONSTITUENT_TRAITS = makeKeyword("CONSTITUENT-TRAITS");

    private static final SubLSymbol $SINGLE_BYTE_CONSTIT_TRAITS = makeKeyword("SINGLE-BYTE-CONSTIT-TRAITS");

    private static final SubLSymbol $DISPATCH_TABLES = makeKeyword("DISPATCH-TABLES");

    private static final SubLString $str39$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");



    private static final SubLSymbol MAKE_READTABLE = makeSymbol("MAKE-READTABLE");





    private static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_READTABLE_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-READTABLE-METHOD");









    private static final SubLSymbol $CONSTITUENT = makeKeyword("CONSTITUENT");

    private static final SubLSymbol CONSTITUENT_RMF = makeSymbol("CONSTITUENT-RMF");

    private static final SubLList $list51 = list(makeSymbol("CH"), makeSymbol("&OPTIONAL"), list(makeSymbol("READTABLE"), list(makeSymbol("QUOTE"), makeSymbol("*READTABLE*"))));

    public static final SubLSymbol $readtable$ = makeSymbol("*READTABLE*");



    private static final SubLSymbol SINGLE_BYTE_P = makeSymbol("SINGLE-BYTE-P");



    private static final SubLSymbol CHAR_CODE = makeSymbol("CHAR-CODE");



    private static final SubLList $list58 = list(makeKeyword("CONSTITUENT"));



    private static final SubLSymbol $TERMINATING_MACRO = makeKeyword("TERMINATING-MACRO");

    private static final SubLSymbol $NON_TERMINATING_MACRO = makeKeyword("NON-TERMINATING-MACRO");

    private static final SubLSymbol $MULTIPLE_ESCAPE = makeKeyword("MULTIPLE-ESCAPE");

    private static final SubLSymbol $SINGLE_ESCAPE = makeKeyword("SINGLE-ESCAPE");



    private static final SubLList $list65 = list(makeSymbol("CH"), makeSymbol("TRAIT"), makeSymbol("&OPTIONAL"), list(makeSymbol("READTABLE"), list(makeSymbol("QUOTE"), makeSymbol("*READTABLE*"))));



    private static final SubLSymbol LOGAND = makeSymbol("LOGAND");

    private static final SubLSymbol CHARACTER_TRAITS = makeSymbol("CHARACTER-TRAITS");

    private static final SubLList $list69 = cons(makeSymbol("CH"), makeSymbol("TABLE"));



    private static final SubLSymbol DISPATCHING_RMF = makeSymbol("DISPATCHING-RMF");

    private static final SubLString $str72$Attempt_to_make_decimal_digit__A_ = makeString("Attempt to make decimal digit ~A be a dispatching macro character.");

    private static final SubLString $str73$_A_is_not_a_dispatching_macro_cha = makeString("~A is not a dispatching macro character in ~S.");

    private static final SubLSymbol WHITESPACE_RMF = makeSymbol("WHITESPACE-RMF");

    private static final SubLSymbol SINGLE_ESCAPE_RMF = makeSymbol("SINGLE-ESCAPE-RMF");

    private static final SubLSymbol MULTIPLE_ESCAPE_RMF = makeSymbol("MULTIPLE-ESCAPE-RMF");

    private static final SubLSymbol LEFT_PAREN_RMF = makeSymbol("LEFT-PAREN-RMF");

    private static final SubLSymbol RIGHT_PAREN_RMF = makeSymbol("RIGHT-PAREN-RMF");

    private static final SubLSymbol SINGLE_QUOTE_RMF = makeSymbol("SINGLE-QUOTE-RMF");

    private static final SubLSymbol SEMICOLON_RMF = makeSymbol("SEMICOLON-RMF");

    private static final SubLSymbol DOUBLE_QUOTE_RMF = makeSymbol("DOUBLE-QUOTE-RMF");

    private static final SubLSymbol BACKQUOTE_RMF = makeSymbol("BACKQUOTE-RMF");

    private static final SubLSymbol COMMA_RMF = makeSymbol("COMMA-RMF");

    private static final SubLSymbol SHARPSIGN_BACKSLASH_RMF = makeSymbol("SHARPSIGN-BACKSLASH-RMF");

    private static final SubLSymbol SHARPSIGN_SINGLE_QUOTE_RMF = makeSymbol("SHARPSIGN-SINGLE-QUOTE-RMF");

    private static final SubLSymbol SHARPSIGN_LEFT_PAREN_RMF = makeSymbol("SHARPSIGN-LEFT-PAREN-RMF");

    private static final SubLSymbol SHARPSIGN_ASTERISK_RMF = makeSymbol("SHARPSIGN-ASTERISK-RMF");

    private static final SubLSymbol SHARPSIGN_COLON_RMF = makeSymbol("SHARPSIGN-COLON-RMF");

    private static final SubLSymbol SHARPSIGN_DOT_RMF = makeSymbol("SHARPSIGN-DOT-RMF");

    private static final SubLSymbol SHARPSIGN_B_RMF = makeSymbol("SHARPSIGN-B-RMF");

    private static final SubLSymbol SHARPSIGN_O_RMF = makeSymbol("SHARPSIGN-O-RMF");

    private static final SubLSymbol SHARPSIGN_X_RMF = makeSymbol("SHARPSIGN-X-RMF");

    private static final SubLSymbol SHARPSIGN_R_RMF = makeSymbol("SHARPSIGN-R-RMF");

    private static final SubLSymbol SHARPSIGN_C_RMF = makeSymbol("SHARPSIGN-C-RMF");

    private static final SubLSymbol SHARPSIGN_A_RMF = makeSymbol("SHARPSIGN-A-RMF");

    private static final SubLSymbol SHARPSIGN_S_RMF = makeSymbol("SHARPSIGN-S-RMF");

    private static final SubLSymbol SHARPSIGN_P_RMF = makeSymbol("SHARPSIGN-P-RMF");

    private static final SubLSymbol SHARPSIGN_CAPITAL_G_RMF = makeSymbol("SHARPSIGN-CAPITAL-G-RMF");

    private static final SubLSymbol SHARPSIGN_EQUALS_RMF = makeSymbol("SHARPSIGN-EQUALS-RMF");

    private static final SubLSymbol SHARPSIGN_SHARPSIGN_RMF = makeSymbol("SHARPSIGN-SHARPSIGN-RMF");

    private static final SubLSymbol SHARPSIGN_PLUS_RMF = makeSymbol("SHARPSIGN-PLUS-RMF");

    private static final SubLSymbol SHARPSIGN_MINUS_RMF = makeSymbol("SHARPSIGN-MINUS-RMF");

    private static final SubLSymbol SHARPSIGN_VERTICAL_BAR_RMF = makeSymbol("SHARPSIGN-VERTICAL-BAR-RMF");

    private static final SubLList $list104 = list(CHAR_backspace, CHAR_tab, CHAR_newline, CHAR_newline, CHAR_page, CHAR_return, CHAR_space, CHAR_rubout);

    private static final SubLList $list105 = list(new SubLObject[]{ CHAR_0, CHAR_1, CHAR_2, CHAR_3, CHAR_4, CHAR_5, CHAR_6, CHAR_7, CHAR_8, CHAR_9, CHAR_a, CHAR_b, CHAR_c, CHAR_d, CHAR_e, CHAR_f, CHAR_g, CHAR_h, CHAR_i, CHAR_j, CHAR_k, CHAR_l, CHAR_m, CHAR_n, CHAR_o, CHAR_p, CHAR_q, CHAR_r, CHAR_s, CHAR_t, CHAR_u, CHAR_v, CHAR_w, CHAR_x, CHAR_y, CHAR_z, CHAR_A, CHAR_B, CHAR_C, CHAR_D, CHAR_E, CHAR_F, CHAR_G, CHAR_H, CHAR_I, CHAR_J, CHAR_K, CHAR_L, CHAR_M, CHAR_N, CHAR_O, CHAR_P, CHAR_Q, CHAR_R, CHAR_S, CHAR_T, CHAR_U, CHAR_V, CHAR_W, CHAR_X, CHAR_Y, CHAR_Z });

    private static final SubLSymbol READER_ERROR = makeSymbol("READER-ERROR");



    private static final SubLSymbol END_OF_FILE = makeSymbol("END-OF-FILE");

    private static final SubLString $str109$End_of_file_on_stream__S_ = makeString("End of file on stream ~S.");

    private static final SubLString $str110$_S_is_invalid_token_syntax_ = makeString("~S is invalid token syntax.");

    private static final SubLString $str111$The__A_reader_macro_is_not_implem = makeString("The ~A reader macro is not implemented.");

    private static final SubLString $str112$The__A_reader_macro_does_not_take = makeString("The ~A reader macro does not take an argument.");

    private static final SubLString $str113$Illegal_argument__D_for_the__A_re = makeString("Illegal argument ~D for the ~A reader macro.");



    public static final SubLList $list115 = list(list(makeSymbol("*READ-BASE*"), TEN_INTEGER), list(makeSymbol("*READ-DEFAULT-FLOAT-FORMAT*"), list(makeSymbol("QUOTE"), makeSymbol("SINGLE-FLOAT"))), list(makeSymbol("*READ-EVAL*"), T), list(makeSymbol("*READ-SUPPRESS*"), NIL), list(makeSymbol("*READTABLE*"), makeSymbol("*STANDARD-READTABLE*")));







    private static final SubLSymbol READ_TOKEN = makeSymbol("READ-TOKEN");

    private static final SubLSymbol READ_TOKEN_P = makeSymbol("READ-TOKEN-P");

    private static final SubLList $list121 = list(makeSymbol("POINTER"), makeSymbol("BUFFER"), makeSymbol("ESCAPES"));

    private static final SubLList $list122 = list(makeKeyword("POINTER"), makeKeyword("BUFFER"), makeKeyword("ESCAPES"));

    private static final SubLList $list123 = list(makeSymbol("READ-TOKEN-POINTER"), makeSymbol("READ-TOKEN-BUFFER"), makeSymbol("READ-TOKEN-ESCAPES"));

    private static final SubLList $list124 = list(makeSymbol("_CSETF-READ-TOKEN-POINTER"), makeSymbol("_CSETF-READ-TOKEN-BUFFER"), makeSymbol("_CSETF-READ-TOKEN-ESCAPES"));

    private static final SubLSymbol READ_TOKEN_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("READ-TOKEN-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLList $list126 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("READ-TOKEN-P"));

    private static final SubLSymbol READ_TOKEN_POINTER = makeSymbol("READ-TOKEN-POINTER");

    private static final SubLSymbol _CSETF_READ_TOKEN_POINTER = makeSymbol("_CSETF-READ-TOKEN-POINTER");

    private static final SubLSymbol READ_TOKEN_BUFFER = makeSymbol("READ-TOKEN-BUFFER");

    private static final SubLSymbol _CSETF_READ_TOKEN_BUFFER = makeSymbol("_CSETF-READ-TOKEN-BUFFER");

    private static final SubLSymbol READ_TOKEN_ESCAPES = makeSymbol("READ-TOKEN-ESCAPES");

    private static final SubLSymbol _CSETF_READ_TOKEN_ESCAPES = makeSymbol("_CSETF-READ-TOKEN-ESCAPES");

    private static final SubLSymbol $POINTER = makeKeyword("POINTER");



    private static final SubLSymbol $ESCAPES = makeKeyword("ESCAPES");

    private static final SubLSymbol MAKE_READ_TOKEN = makeSymbol("MAKE-READ-TOKEN");

    private static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_READ_TOKEN_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-READ-TOKEN-METHOD");

    private static final SubLList $list138 = list(makeSymbol("TOKEN"), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLList $list139 = list(list(makeSymbol("MAKE-READ-TOKEN")));

    private static final SubLList $list140 = list(makeSymbol("CSETF"), list(makeSymbol("READ-TOKEN-POINTER"), makeSymbol("TOKEN")), ZERO_INTEGER);

    private static final SubLList $list141 = list(makeSymbol("CSETF"), list(makeSymbol("READ-TOKEN-BUFFER"), makeSymbol("TOKEN")), list(makeSymbol("MAKE-STRING"), makeSymbol("*INITIAL-TOKEN-SIZE*")));

    private static final SubLList $list142 = list(makeSymbol("CSETF"), list(makeSymbol("READ-TOKEN-ESCAPES"), makeSymbol("TOKEN")), list(makeSymbol("QUOTE"), NIL));

    private static final SubLString $str143$_A_is_an_invalid_character_ = makeString("~A is an invalid character.");

    private static final SubLString $str144$Fell_through_character_syntax_on_ = makeString("Fell through character syntax on ~A.");



    private static final SubLString $str146$_S_is_not_a_known_package_ = makeString("~S is not a known package.");



    private static final SubLSymbol $INVERT = makeKeyword("INVERT");

    private static final SubLSymbol $sym149$CONSING_DOT = makeUninternedSymbol("CONSING-DOT");

    private static final SubLString $$$KEYWORD = makeString("KEYWORD");



    private static final SubLString $str152$_S_is_not_external_in__S_ = makeString("~S is not external in ~S.");

    private static final SubLFloat $float$0_0 = makeDouble(0.0);



    private static final SubLSymbol $DOT1 = makeKeyword("DOT1");



    private static final SubLSymbol $DECIMALS = makeKeyword("DECIMALS");

    private static final SubLSymbol $DIGITS = makeKeyword("DIGITS");

    private static final SubLSymbol $EXPONENT = makeKeyword("EXPONENT");

    private static final SubLSymbol $DOT2 = makeKeyword("DOT2");







    private static final SubLSymbol $DECIMALS2 = makeKeyword("DECIMALS2");

    private static final SubLSymbol $EXPONENT_SIGN = makeKeyword("EXPONENT-SIGN");

    private static final SubLSymbol $EXPONENT_VALUE = makeKeyword("EXPONENT-VALUE");

    private static final SubLString $str167$Can_t_happen_ = makeString("Can't happen.");

    private static final SubLSymbol $DIGIT = makeKeyword("DIGIT");

    private static final SubLString $str169$_S_does_not_contain_an_integer_ = makeString("~S does not contain an integer.");

    private static final SubLSymbol $TRAILING_WHITESPACE = makeKeyword("TRAILING-WHITESPACE");

    private static final SubLString $str171$The__S_reader_macro_does_not_take = makeString("The ~S reader macro does not take an argument.");

    private static final SubLString $str172$The__S_reader_macro_expected_a_st = makeString("The ~S reader macro expected a string.");

    private static final SubLString $str173$The__S_reader_macro_could_not_int = makeString("The ~S reader macro could not interpret ~S as a GUID string.");

    private static final SubLSymbol $sym174$RIGHT_PAREN = makeUninternedSymbol("RIGHT-PAREN");

    private static final SubLString $str175$Nothing_before_consing_dot_ = makeString("Nothing before consing dot.");



    private static final SubLSymbol $CONSING_DOT = makeKeyword("CONSING-DOT");

    private static final SubLString $str178$Nothing_after_consing_dot_ = makeString("Nothing after consing dot.");

    private static final SubLString $str179$Too_many_consing_dots_ = makeString("Too many consing dots.");

    private static final SubLSymbol $AFTER_CONSING_DOT = makeKeyword("AFTER-CONSING-DOT");

    private static final SubLString $str181$Too_many_objects_after_consing_do = makeString("Too many objects after consing dot.");

    private static final SubLString $str182$Ignoring_unmatched_close_parenthe = makeString("Ignoring unmatched close parenthesis.");

    private static final SubLString $str183$Unmatched__A_ = makeString("Unmatched ~A.");





    private static final SubLSymbol $ESCAPE = makeKeyword("ESCAPE");



    private static final SubLSymbol $sym188$LIST_ = makeSymbol("LIST*");







    private static final SubLSymbol BQ_VECTOR = makeSymbol("BQ-VECTOR");



    private static final SubLString $str194$_ = makeString(",");

    private static final SubLString $str195$_ = makeString("@");

    private static final SubLString $str196$_ = makeString(".");

    private static final SubLString $str197$BQ_VECTOR = makeString("BQ-VECTOR");

    private static final SubLString $str198$_A_after_dot_in__S_ = makeString("~A after dot in ~S.");

    private static final SubLList $list199 = list(makeSymbol("QUOTE"), T, NIL);

    private static final SubLList $list200 = list(makeSymbol("APPEND"), makeSymbol("LIST"), makeSymbol("LIST*"), makeSymbol("NCONC"));



    private static final SubLSymbol $sym202$BQ_LIST_ = makeSymbol("BQ-LIST*");



    private static final SubLList $list204 = list(cons(makeSymbol("CONS"), makeSymbol("BQ-CONS")), cons(makeSymbol("LIST"), makeSymbol("BQ-LIST")), cons(makeSymbol("APPEND"), makeSymbol("BQ-APPEND")), cons(makeSymbol("NCONC"), makeSymbol("BQ-NCONC")));

    private static final SubLString $str205$_A_read_after_backquote_in__S_ = makeString("~A read after backquote in ~S.");

    private static final SubLString $str206$_S_read_outside_a_backquote_ = makeString("~S read outside a backquote.");

    private static final SubLString $str207$Undefined_reader_macro__A_A_ = makeString("Undefined reader macro ~A~A.");

    private static final SubLString $str208$_S_is_not_the_name_of_a_character = makeString("~S is not the name of a character.");



    private static final SubLString $str210$Attempt_the_use_the__A_reader_mac = makeString("Attempt the use the ~A reader macro when ~S is ~S.");

    public static final SubLSymbol $read_eval$ = makeSymbol("*READ-EVAL*");

    private static final SubLInteger $int$36 = makeInteger(36);

    private static final SubLString $str213$The_form_after__A_reader_macro_wa = makeString("The form after ~A reader macro was not a list.");

    private static final SubLString $str214$Label__S_appears_more_than_once_ = makeString("Label ~S appears more than once.");

    private static final SubLString $str215$Label__S_has_not_been_seen_ = makeString("Label ~S has not been seen.");



    private static final SubLString $str217$Bogus_feature_expression__S_ = makeString("Bogus feature expression ~S.");





    private static final SubLString $str220$Unknown_feature_operator__S_ = makeString("Unknown feature operator ~S.");


    private static final SubLSymbol $VERTICAL_BAR = makeKeyword("VERTICAL-BAR");

    static {




































































































































































































































































    }

    @Override
    public void declareFunctions() {
        declare_reader_file();
    }

    @Override
    public void initializeVariables() {
        init_reader_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_reader_file();
    }
}

