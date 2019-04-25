package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import java.util.Map;
import java.util.Iterator;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_macros;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.random;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class forts extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.forts";
    public static final String myFingerPrint = "47a6760ac485dc04bd675a1e4bcbcea0939054120725b20de7a998053e7d76d4";
    @SubLTranslatedFile.SubL(source = "cycl/forts.lisp", position = 6955L)
    public static SubLSymbol $dtp_fort_id_index$;
    @SubLTranslatedFile.SubL(source = "cycl/forts.lisp", position = 12211L)
    private static SubLSymbol $cfasl_opcode_fort_id_index$;
    private static final SubLSymbol $sym0$FORT_P;
    private static final SubLList $list1;
    private static final SubLString $str2$Return_T_iff_OBJECT_is_a_first_or;
    private static final SubLList $list3;
    private static final SubLSymbol $sym4$FORT_EL_FORMULA;
    private static final SubLList $list5;
    private static final SubLString $str6$Return_the_EL_formula_for_any_FOR;
    private static final SubLList $list7;
    private static final SubLList $list8;
    private static final SubLList $list9;
    private static final SubLString $str10$mapping_Cyc_FORTs;
    private static final SubLList $list11;
    private static final SubLSymbol $kw12$ALLOW_OTHER_KEYS;
    private static final SubLSymbol $kw13$DONE;
    private static final SubLSymbol $sym14$TABLE_VAR;
    private static final SubLSymbol $sym15$DO_LIST;
    private static final SubLList $list16;
    private static final SubLSymbol $sym17$DO_KB_SUID_TABLE;
    private static final SubLSymbol $kw18$PROGRESS_MESSAGE;
    private static final SubLSymbol $sym19$MESSAGE;
    private static final SubLSymbol $sym20$TOTAL;
    private static final SubLSymbol $sym21$SOFAR;
    private static final SubLSymbol $sym22$CLET;
    private static final SubLList $list23;
    private static final SubLList $list24;
    private static final SubLSymbol $sym25$NOTING_PERCENT_PROGRESS;
    private static final SubLSymbol $sym26$DO_FORTS;
    private static final SubLSymbol $sym27$CINC;
    private static final SubLSymbol $sym28$NOTE_PERCENT_PROGRESS;
    private static final SubLString $str29$Iterate_over_all_HL_FORT_datastru;
    private static final SubLSymbol $sym30$DO_FORTS_TABLES;
    private static final SubLSymbol $sym31$FORT_COUNT;
    private static final SubLString $str32$Return_the_total_number_of_FORTs_;
    private static final SubLList $list33;
    private static final SubLSymbol $sym34$TRUE;
    private static final SubLInteger $int35$500;
    private static final SubLSymbol $sym36$NON_NEGATIVE_INTEGER_P;
    private static final SubLString $str37$_S_was_not_a_FORT;
    private static final SubLSymbol $sym38$REMOVE_FORT;
    private static final SubLString $str39$Remove_FORT_from_the_KB_;
    private static final SubLList $list40;
    private static final SubLSymbol $sym41$FORT_ID_INDEX;
    private static final SubLSymbol $sym42$FORT_ID_INDEX_P;
    private static final SubLList $list43;
    private static final SubLList $list44;
    private static final SubLList $list45;
    private static final SubLList $list46;
    private static final SubLSymbol $sym47$PRINT_FORT_ID_INDEX;
    private static final SubLSymbol $sym48$FORT_ID_INDEX_PRINT_FUNCTION_TRAMPOLINE;
    private static final SubLList $list49;
    private static final SubLSymbol $sym50$FORT_ID_INDEX_CONSTANTS;
    private static final SubLSymbol $sym51$_CSETF_FORT_ID_INDEX_CONSTANTS;
    private static final SubLSymbol $sym52$FORT_ID_INDEX_NARTS;
    private static final SubLSymbol $sym53$_CSETF_FORT_ID_INDEX_NARTS;
    private static final SubLSymbol $kw54$CONSTANTS;
    private static final SubLSymbol $kw55$NARTS;
    private static final SubLString $str56$Invalid_slot__S_for_construction_;
    private static final SubLSymbol $kw57$BEGIN;
    private static final SubLSymbol $sym58$MAKE_FORT_ID_INDEX;
    private static final SubLSymbol $kw59$SLOT;
    private static final SubLSymbol $kw60$END;
    private static final SubLSymbol $sym61$VISIT_DEFSTRUCT_OBJECT_FORT_ID_INDEX_METHOD;
    private static final SubLString $str62$Constant_Index_;
    private static final SubLString $str63$Nart_Index_;
    private static final SubLList $list64;
    private static final SubLSymbol $sym65$PROGN;
    private static final SubLSymbol $sym66$CHECK_TYPE;
    private static final SubLList $list67;
    private static final SubLList $list68;
    private static final SubLSymbol $sym69$PWHEN;
    private static final SubLSymbol $sym70$VALID_FORT_;
    private static final SubLSymbol $sym71$FIF;
    private static final SubLSymbol $sym72$CONSTANT_P;
    private static final SubLSymbol $sym73$CONSTANT_INTERNAL_ID;
    private static final SubLSymbol $sym74$NART_ID;
    private static final SubLList $list75;
    private static final SubLSymbol $sym76$FII;
    private static final SubLSymbol $sym77$DO_FORT_ID_INDEX_CONSTANTS;
    private static final SubLSymbol $sym78$DO_FORT_ID_INDEX_NARTS;
    private static final SubLSymbol $sym79$DO_FORT_ID_INDEX;
    private static final SubLList $list80;
    private static final SubLSymbol $sym81$ID;
    private static final SubLSymbol $sym82$DO_ID_INDEX;
    private static final SubLSymbol $sym83$DO_FII_GET_CONSTANTS;
    private static final SubLSymbol $sym84$FIND_CONSTANT_BY_INTERNAL_ID;
    private static final SubLList $list85;
    private static final SubLSymbol $sym86$ID;
    private static final SubLSymbol $sym87$DO_FII_GET_NARTS;
    private static final SubLSymbol $sym88$FIND_NART_BY_ID;
    private static final SubLInteger $int89$99;
    private static final SubLSymbol $sym90$CFASL_INPUT_FORT_ID_INDEX;
    private static final SubLSymbol $sym91$CFASL_OUTPUT_OBJECT_FORT_ID_INDEX_METHOD;
    private static final SubLSymbol $kw92$SKIP;
    private static final SubLString $str93$Checking_that_forts_iterators_wor;
    private static final SubLSymbol $kw94$EXHAUSTED;
    private static final SubLSymbol $sym95$_EXIT;
    private static final SubLSymbol $kw96$ERROR;
    private static final SubLString $str97$FORTS_ITERATOR_exhausted_before_D;
    private static final SubLSymbol $kw98$INDEX;
    private static final SubLString $str99$FORTS_ITERATOR_returned_non_fort_;
    private static final SubLSymbol $kw100$CANDIDATE;
    private static final SubLString $str101$FORTS_ITERATOR_and_DO_FORTS_diffe;
    private static final SubLSymbol $kw102$FORT;
    private static final SubLString $str103$The_FORTS_iterator_has_more_value;
    
    @SubLTranslatedFile.SubL(source = "cycl/forts.lisp", position = 771L)
    public static SubLObject fort_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(forts.NIL != constant_handles.constant_p(v_object) || forts.NIL != nart_handles.nart_p(v_object));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/forts.lisp", position = 1002L)
    public static SubLObject non_fort_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(forts.NIL == fort_p(v_object));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/forts.lisp", position = 1070L)
    public static SubLObject list_of_fort_p(final SubLObject v_object) {
        return list_utilities.list_of_type_p((SubLObject)forts.$sym0$FORT_P, v_object);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/forts.lisp", position = 1151L)
    public static SubLObject fort_el_formula(final SubLObject fort) {
        enforceType(fort, forts.$sym0$FORT_P);
        if (forts.NIL != constant_handles.constant_p(fort)) {
            return fort;
        }
        return narts_high.nart_el_formula(fort);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/forts.lisp", position = 1386L)
    public static SubLObject new_forts_iterator() {
        return iteration.new_iterator_iterator((SubLObject)ConsesLow.list(constant_handles.new_constants_iterator(), nart_handles.new_narts_iterator()));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/forts.lisp", position = 1673L)
    public static SubLObject do_forts(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)forts.$list9);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject var = (SubLObject)forts.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)forts.$list9);
        var = current.first();
        current = current.rest();
        final SubLObject progress_message = (SubLObject)(current.isCons() ? current.first() : forts.$str10$mapping_Cyc_FORTs);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)forts.$list9);
        current = current.rest();
        SubLObject allow_other_keys_p = (SubLObject)forts.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)forts.NIL;
        SubLObject current_$1 = (SubLObject)forts.NIL;
        while (forts.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)forts.$list9);
            current_$1 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)forts.$list9);
            if (forts.NIL == conses_high.member(current_$1, (SubLObject)forts.$list11, (SubLObject)forts.UNPROVIDED, (SubLObject)forts.UNPROVIDED)) {
                bad = (SubLObject)forts.T;
            }
            if (current_$1 == forts.$kw12$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (forts.NIL != bad && forts.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)forts.$list9);
        }
        final SubLObject done_tail = cdestructuring_bind.property_list_member((SubLObject)forts.$kw13$DONE, current);
        final SubLObject done = (SubLObject)((forts.NIL != done_tail) ? conses_high.cadr(done_tail) : forts.NIL);
        final SubLObject body;
        current = (body = temp);
        if (forts.NIL == progress_message) {
            final SubLObject table_var = (SubLObject)forts.$sym14$TABLE_VAR;
            return (SubLObject)ConsesLow.list((SubLObject)forts.$sym15$DO_LIST, (SubLObject)ConsesLow.list(table_var, (SubLObject)forts.$list16, (SubLObject)forts.$kw13$DONE, done), (SubLObject)ConsesLow.listS((SubLObject)forts.$sym17$DO_KB_SUID_TABLE, (SubLObject)ConsesLow.list(var, table_var, (SubLObject)forts.$kw18$PROGRESS_MESSAGE, (SubLObject)forts.NIL, (SubLObject)forts.$kw13$DONE, done), ConsesLow.append(body, (SubLObject)forts.NIL)));
        }
        final SubLObject message = (SubLObject)forts.$sym19$MESSAGE;
        final SubLObject total = (SubLObject)forts.$sym20$TOTAL;
        final SubLObject sofar = (SubLObject)forts.$sym21$SOFAR;
        return (SubLObject)ConsesLow.list((SubLObject)forts.$sym22$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(message, progress_message), reader.bq_cons(total, (SubLObject)forts.$list23), reader.bq_cons(sofar, (SubLObject)forts.$list24)), (SubLObject)ConsesLow.list((SubLObject)forts.$sym25$NOTING_PERCENT_PROGRESS, message, (SubLObject)ConsesLow.listS((SubLObject)forts.$sym26$DO_FORTS, (SubLObject)ConsesLow.list(var, (SubLObject)forts.NIL, (SubLObject)forts.$kw13$DONE, done), (SubLObject)ConsesLow.list((SubLObject)forts.$sym27$CINC, sofar), (SubLObject)ConsesLow.list((SubLObject)forts.$sym28$NOTE_PERCENT_PROGRESS, sofar, total), ConsesLow.append(body, (SubLObject)forts.NIL))));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/forts.lisp", position = 2889L)
    public static SubLObject do_forts_tables() {
        return (SubLObject)ConsesLow.list(constant_handles.do_constants_table(), nart_handles.do_narts_table());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/forts.lisp", position = 3057L)
    public static SubLObject fort_count() {
        return Numbers.add(constant_handles.constant_count(), nart_handles.nart_count());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/forts.lisp", position = 3197L)
    public static SubLObject random_fort(SubLObject test) {
        if (test == forts.UNPROVIDED) {
            test = Symbols.symbol_function((SubLObject)forts.$sym34$TRUE);
        }
        final SubLObject fort_count = fort_count();
        if (fort_count.numG((SubLObject)forts.ZERO_INTEGER)) {
            final SubLObject constant_threshold = constant_handles.constant_count();
            SubLObject v_answer;
            SubLObject candidate;
            for (v_answer = (SubLObject)forts.NIL; forts.NIL == v_answer; v_answer = candidate) {
                final SubLObject fort_type_indicator = random.random(fort_count);
                candidate = (fort_type_indicator.numL(constant_threshold) ? constants_high.random_constant((SubLObject)forts.UNPROVIDED) : narts_high.random_nart((SubLObject)forts.UNPROVIDED));
                if (forts.NIL != candidate && forts.NIL != Functions.funcall(test, candidate)) {}
            }
            return v_answer;
        }
        return (SubLObject)forts.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/forts.lisp", position = 3784L)
    public static SubLObject sample_forts(SubLObject n, SubLObject allow_repeatsP, SubLObject test) {
        if (n == forts.UNPROVIDED) {
            n = (SubLObject)forts.$int35$500;
        }
        if (allow_repeatsP == forts.UNPROVIDED) {
            allow_repeatsP = (SubLObject)forts.NIL;
        }
        if (test == forts.UNPROVIDED) {
            test = Symbols.symbol_function((SubLObject)forts.$sym34$TRUE);
        }
        assert forts.NIL != subl_promotions.non_negative_integer_p(n) : n;
        if (forts.NIL != allow_repeatsP) {
            SubLObject result = (SubLObject)forts.NIL;
            SubLObject i;
            for (i = (SubLObject)forts.NIL, i = (SubLObject)forts.ZERO_INTEGER; i.numL(n); i = Numbers.add(i, (SubLObject)forts.ONE_INTEGER)) {
                result = (SubLObject)ConsesLow.cons(random_fort(test), result);
            }
            return result;
        }
        SubLObject result;
        for (result = set_contents.new_set_contents(n, Symbols.symbol_function((SubLObject)forts.EQL)); set_contents.set_contents_size(result).numL(n); result = set_contents.set_contents_add(random_fort(test), result, Symbols.symbol_function((SubLObject)forts.EQL))) {}
        return set_contents.set_contents_element_list(result);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/forts.lisp", position = 4353L)
    public static SubLObject fort_index(final SubLObject fort) {
        if (forts.NIL != constant_handles.constant_p(fort)) {
            return constants_low.constant_index(fort);
        }
        if (forts.NIL != nart_handles.nart_p(fort)) {
            return narts_low.nart_index(fort);
        }
        Errors.error((SubLObject)forts.$str37$_S_was_not_a_FORT, fort);
        return (SubLObject)forts.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/forts.lisp", position = 4583L)
    public static SubLObject reset_fort_index(final SubLObject fort, final SubLObject new_index) {
        assert forts.NIL != fort_p(fort) : fort;
        if (forts.NIL != constant_handles.constant_p(fort)) {
            return constants_low.reset_constant_index(fort, new_index);
        }
        return narts_low.reset_nart_index(fort, new_index);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/forts.lisp", position = 4862L)
    public static SubLObject clear_fort_index(final SubLObject fort) {
        return reset_fort_index(fort, kb_indexing_datastructures.new_simple_index());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/forts.lisp", position = 5009L)
    public static SubLObject fort_internal_id(final SubLObject fort) {
        if (forts.NIL != constant_handles.constant_p(fort)) {
            return constants_high.constant_internal_id(fort);
        }
        return number_utilities.f_1_(Numbers.minus(nart_handles.nart_id(fort)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/forts.lisp", position = 5154L)
    public static SubLObject fort_external_id(final SubLObject fort) {
        if (forts.NIL != constant_handles.constant_p(fort)) {
            return constants_high.constant_external_id(fort);
        }
        return number_utilities.f_1_(Numbers.minus(nart_handles.nart_id(fort)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/forts.lisp", position = 5299L)
    public static SubLObject valid_fortP(final SubLObject fort) {
        if (forts.NIL != constant_handles.constant_p(fort)) {
            return constant_handles.valid_constantP(fort, (SubLObject)forts.UNPROVIDED);
        }
        if (forts.NIL != nart_handles.nart_p(fort)) {
            return nart_handles.valid_nartP(fort, (SubLObject)forts.UNPROVIDED);
        }
        return (SubLObject)forts.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/forts.lisp", position = 5581L)
    public static SubLObject valid_fort_robustP(final SubLObject fort) {
        if (forts.NIL != constant_handles.constant_p(fort)) {
            return constant_handles.valid_constant_robustP(fort);
        }
        if (forts.NIL != nart_handles.nart_p(fort)) {
            return nart_handles.valid_nart_robustP(fort);
        }
        return (SubLObject)forts.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/forts.lisp", position = 5882L)
    public static SubLObject invalid_fortP(final SubLObject fort) {
        if (forts.NIL != constant_handles.constant_p(fort)) {
            return constant_handles.invalid_constantP(fort, (SubLObject)forts.UNPROVIDED);
        }
        if (forts.NIL != nart_handles.nart_p(fort)) {
            return narts_high.invalid_nartP(fort, (SubLObject)forts.UNPROVIDED);
        }
        return (SubLObject)forts.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/forts.lisp", position = 6113L)
    public static SubLObject invalid_fort_robustP(final SubLObject fort) {
        if (forts.NIL != constant_handles.constant_p(fort)) {
            return constant_handles.invalid_constant_robustP(fort);
        }
        if (forts.NIL != nart_handles.nart_p(fort)) {
            return narts_high.invalid_nart_robustP(fort);
        }
        return (SubLObject)forts.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/forts.lisp", position = 6425L)
    public static SubLObject remove_fort(final SubLObject fort) {
        enforceType(fort, forts.$sym0$FORT_P);
        if (forts.NIL != constant_handles.constant_p(fort)) {
            return constants_high.remove_constant(fort);
        }
        return narts_high.remove_nart(fort);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/forts.lisp", position = 6955L)
    public static SubLObject fort_id_index_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        print_fort_id_index(v_object, stream, (SubLObject)forts.ZERO_INTEGER);
        return (SubLObject)forts.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/forts.lisp", position = 6955L)
    public static SubLObject fort_id_index_p(final SubLObject v_object) {
        return (SubLObject)((v_object.getClass() == $fort_id_index_native.class) ? forts.T : forts.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/forts.lisp", position = 6955L)
    public static SubLObject fort_id_index_constants(final SubLObject v_object) {
        assert forts.NIL != fort_id_index_p(v_object) : v_object;
        return v_object.getField2();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/forts.lisp", position = 6955L)
    public static SubLObject fort_id_index_narts(final SubLObject v_object) {
        assert forts.NIL != fort_id_index_p(v_object) : v_object;
        return v_object.getField3();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/forts.lisp", position = 6955L)
    public static SubLObject _csetf_fort_id_index_constants(final SubLObject v_object, final SubLObject value) {
        assert forts.NIL != fort_id_index_p(v_object) : v_object;
        return v_object.setField2(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/forts.lisp", position = 6955L)
    public static SubLObject _csetf_fort_id_index_narts(final SubLObject v_object, final SubLObject value) {
        assert forts.NIL != fort_id_index_p(v_object) : v_object;
        return v_object.setField3(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/forts.lisp", position = 6955L)
    public static SubLObject make_fort_id_index(SubLObject arglist) {
        if (arglist == forts.UNPROVIDED) {
            arglist = (SubLObject)forts.NIL;
        }
        final SubLObject v_new = (SubLObject)new $fort_id_index_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = (SubLObject)forts.NIL, next = arglist; forts.NIL != next; next = conses_high.cddr(next)) {
            current_arg = next.first();
            current_value = conses_high.cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql((SubLObject)forts.$kw54$CONSTANTS)) {
                _csetf_fort_id_index_constants(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)forts.$kw55$NARTS)) {
                _csetf_fort_id_index_narts(v_new, current_value);
            }
            else {
                Errors.error((SubLObject)forts.$str56$Invalid_slot__S_for_construction_, current_arg);
            }
        }
        return v_new;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/forts.lisp", position = 6955L)
    public static SubLObject visit_defstruct_fort_id_index(final SubLObject obj, final SubLObject visitor_fn) {
        Functions.funcall(visitor_fn, obj, (SubLObject)forts.$kw57$BEGIN, (SubLObject)forts.$sym58$MAKE_FORT_ID_INDEX, (SubLObject)forts.TWO_INTEGER);
        Functions.funcall(visitor_fn, obj, (SubLObject)forts.$kw59$SLOT, (SubLObject)forts.$kw54$CONSTANTS, fort_id_index_constants(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)forts.$kw59$SLOT, (SubLObject)forts.$kw55$NARTS, fort_id_index_narts(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)forts.$kw60$END, (SubLObject)forts.$sym58$MAKE_FORT_ID_INDEX, (SubLObject)forts.TWO_INTEGER);
        return obj;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/forts.lisp", position = 6955L)
    public static SubLObject visit_defstruct_object_fort_id_index_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_fort_id_index(obj, visitor_fn);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/forts.lisp", position = 7050L)
    public static SubLObject print_fort_id_index(final SubLObject fort_id_index, final SubLObject stream, final SubLObject depth) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (forts.NIL != print_high.$print_readably$.getDynamicValue(thread)) {
            print_high.print_not_readable(fort_id_index, stream);
        }
        else {
            print_macros.print_unreadable_object_preamble(stream, fort_id_index, (SubLObject)forts.T, (SubLObject)forts.T);
            streams_high.write_string((SubLObject)forts.$str62$Constant_Index_, stream, (SubLObject)forts.UNPROVIDED, (SubLObject)forts.UNPROVIDED);
            print_high.princ(fort_id_index_constants(fort_id_index), stream);
            streams_high.write_string((SubLObject)forts.$str63$Nart_Index_, stream, (SubLObject)forts.UNPROVIDED, (SubLObject)forts.UNPROVIDED);
            print_high.princ(fort_id_index_narts(fort_id_index), stream);
            print_macros.print_unreadable_object_postamble(stream, fort_id_index, (SubLObject)forts.NIL, (SubLObject)forts.NIL);
        }
        return fort_id_index;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/forts.lisp", position = 7413L)
    public static SubLObject with_fort_id_index_index_and_id(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)forts.$list64);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject id_index_var = (SubLObject)forts.NIL;
        SubLObject id_var = (SubLObject)forts.NIL;
        SubLObject fort = (SubLObject)forts.NIL;
        SubLObject fort_id_index = (SubLObject)forts.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)forts.$list64);
        id_index_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)forts.$list64);
        id_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)forts.$list64);
        fort = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)forts.$list64);
        fort_id_index = current.first();
        current = current.rest();
        if (forts.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            return (SubLObject)ConsesLow.list((SubLObject)forts.$sym65$PROGN, (SubLObject)ConsesLow.listS((SubLObject)forts.$sym66$CHECK_TYPE, fort, (SubLObject)forts.$list67), (SubLObject)ConsesLow.listS((SubLObject)forts.$sym66$CHECK_TYPE, fort_id_index, (SubLObject)forts.$list68), (SubLObject)ConsesLow.list((SubLObject)forts.$sym69$PWHEN, (SubLObject)ConsesLow.list((SubLObject)forts.$sym70$VALID_FORT_, fort), (SubLObject)ConsesLow.listS((SubLObject)forts.$sym22$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(id_index_var, (SubLObject)ConsesLow.list((SubLObject)forts.$sym71$FIF, (SubLObject)ConsesLow.list((SubLObject)forts.$sym72$CONSTANT_P, fort), (SubLObject)ConsesLow.list((SubLObject)forts.$sym50$FORT_ID_INDEX_CONSTANTS, fort_id_index), (SubLObject)ConsesLow.list((SubLObject)forts.$sym52$FORT_ID_INDEX_NARTS, fort_id_index))), (SubLObject)ConsesLow.list(id_var, (SubLObject)ConsesLow.list((SubLObject)forts.$sym71$FIF, (SubLObject)ConsesLow.list((SubLObject)forts.$sym72$CONSTANT_P, fort), (SubLObject)ConsesLow.list((SubLObject)forts.$sym73$CONSTANT_INTERNAL_ID, fort), (SubLObject)ConsesLow.list((SubLObject)forts.$sym74$NART_ID, fort)))), ConsesLow.append(body, (SubLObject)forts.NIL))));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)forts.$list64);
        return (SubLObject)forts.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/forts.lisp", position = 7907L)
    public static SubLObject new_fort_id_index() {
        final SubLObject fort_id_index = make_fort_id_index((SubLObject)forts.UNPROVIDED);
        _csetf_fort_id_index_constants(fort_id_index, new_fort_id_index_constants());
        _csetf_fort_id_index_narts(fort_id_index, new_fort_id_index_narts());
        return fort_id_index;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/forts.lisp", position = 8257L)
    public static SubLObject fort_id_index_count(final SubLObject fort_id_index) {
        assert forts.NIL != fort_id_index_p(fort_id_index) : fort_id_index;
        return Numbers.add(id_index.id_index_count(fort_id_index_constants(fort_id_index)), id_index.id_index_count(fort_id_index_narts(fort_id_index)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/forts.lisp", position = 8555L)
    public static SubLObject fort_id_index_emptyP(final SubLObject fort_id_index) {
        assert forts.NIL != fort_id_index_p(fort_id_index) : fort_id_index;
        return Equality.eq(fort_id_index_count(fort_id_index), (SubLObject)forts.ZERO_INTEGER);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/forts.lisp", position = 8705L)
    public static SubLObject fort_id_index_lookup(final SubLObject fort_id_index, final SubLObject fort) {
        SubLObject v_answer = (SubLObject)forts.NIL;
        assert forts.NIL != fort_p(fort) : fort;
        assert forts.NIL != fort_id_index_p(fort_id_index) : fort_id_index;
        if (forts.NIL != valid_fortP(fort)) {
            final SubLObject v_id_index = (forts.NIL != constant_handles.constant_p(fort)) ? fort_id_index_constants(fort_id_index) : fort_id_index_narts(fort_id_index);
            final SubLObject id = (forts.NIL != constant_handles.constant_p(fort)) ? constants_high.constant_internal_id(fort) : nart_handles.nart_id(fort);
            v_answer = id_index.id_index_lookup(v_id_index, id, (SubLObject)forts.UNPROVIDED);
        }
        return v_answer;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/forts.lisp", position = 8993L)
    public static SubLObject fort_id_index_enter(final SubLObject fort_id_index, final SubLObject fort, final SubLObject v_object) {
        assert forts.NIL != fort_p(fort) : fort;
        assert forts.NIL != fort_id_index_p(fort_id_index) : fort_id_index;
        if (forts.NIL != valid_fortP(fort)) {
            final SubLObject v_id_index = (forts.NIL != constant_handles.constant_p(fort)) ? fort_id_index_constants(fort_id_index) : fort_id_index_narts(fort_id_index);
            final SubLObject id = (forts.NIL != constant_handles.constant_p(fort)) ? constants_high.constant_internal_id(fort) : nart_handles.nart_id(fort);
            id_index.id_index_enter(v_id_index, id, v_object);
        }
        return (SubLObject)forts.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/forts.lisp", position = 9260L)
    public static SubLObject fort_id_index_remove(final SubLObject fort_id_index, final SubLObject fort) {
        assert forts.NIL != fort_p(fort) : fort;
        assert forts.NIL != fort_id_index_p(fort_id_index) : fort_id_index;
        if (forts.NIL != valid_fortP(fort)) {
            final SubLObject v_id_index = (forts.NIL != constant_handles.constant_p(fort)) ? fort_id_index_constants(fort_id_index) : fort_id_index_narts(fort_id_index);
            final SubLObject id = (forts.NIL != constant_handles.constant_p(fort)) ? constants_high.constant_internal_id(fort) : nart_handles.nart_id(fort);
            id_index.id_index_remove(v_id_index, id);
        }
        return (SubLObject)forts.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/forts.lisp", position = 9495L)
    public static SubLObject clear_fort_id_index(final SubLObject fort_id_index) {
        assert forts.NIL != fort_id_index_p(fort_id_index) : fort_id_index;
        id_index.clear_id_index(fort_id_index_constants(fort_id_index));
        id_index.clear_id_index(fort_id_index_narts(fort_id_index));
        return (SubLObject)forts.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/forts.lisp", position = 9773L)
    public static SubLObject optimize_fort_id_index(final SubLObject fort_id_index) {
        assert forts.NIL != fort_id_index_p(fort_id_index) : fort_id_index;
        id_index.optimize_id_index(fort_id_index_constants(fort_id_index), (SubLObject)forts.UNPROVIDED);
        id_index.optimize_id_index(fort_id_index_narts(fort_id_index), (SubLObject)forts.UNPROVIDED);
        return (SubLObject)forts.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/forts.lisp", position = 10136L)
    public static SubLObject fort_id_index_optimized_p(final SubLObject fort_id_index) {
        assert forts.NIL != fort_id_index_p(fort_id_index) : fort_id_index;
        return (SubLObject)SubLObjectFactory.makeBoolean(forts.NIL != id_index.id_index_optimized_p(fort_id_index_constants(fort_id_index)) && forts.NIL != id_index.id_index_optimized_p(fort_id_index_narts(fort_id_index)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/forts.lisp", position = 10499L)
    public static SubLObject new_fort_id_index_constants() {
        return id_index.new_id_index(constants_high.new_constant_internal_id_threshold(), (SubLObject)forts.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/forts.lisp", position = 10622L)
    public static SubLObject new_fort_id_index_narts() {
        return id_index.new_id_index(nart_handles.new_nart_id_threshold(), (SubLObject)forts.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/forts.lisp", position = 10714L)
    public static SubLObject do_fort_id_index(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)forts.$list75);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject fort = (SubLObject)forts.NIL;
        SubLObject value = (SubLObject)forts.NIL;
        SubLObject fort_id_index = (SubLObject)forts.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)forts.$list75);
        fort = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)forts.$list75);
        value = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)forts.$list75);
        fort_id_index = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = (SubLObject)forts.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)forts.NIL;
        SubLObject current_$2 = (SubLObject)forts.NIL;
        while (forts.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)forts.$list75);
            current_$2 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)forts.$list75);
            if (forts.NIL == conses_high.member(current_$2, (SubLObject)forts.$list11, (SubLObject)forts.UNPROVIDED, (SubLObject)forts.UNPROVIDED)) {
                bad = (SubLObject)forts.T;
            }
            if (current_$2 == forts.$kw12$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (forts.NIL != bad && forts.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)forts.$list75);
        }
        final SubLObject done_tail = cdestructuring_bind.property_list_member((SubLObject)forts.$kw13$DONE, current);
        final SubLObject done = (SubLObject)((forts.NIL != done_tail) ? conses_high.cadr(done_tail) : forts.NIL);
        final SubLObject body;
        current = (body = temp);
        final SubLObject fii = (SubLObject)forts.$sym76$FII;
        return (SubLObject)ConsesLow.list((SubLObject)forts.$sym22$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(fii, fort_id_index)), (SubLObject)ConsesLow.listS((SubLObject)forts.$sym77$DO_FORT_ID_INDEX_CONSTANTS, (SubLObject)ConsesLow.list(fort, value, fii, (SubLObject)forts.$kw13$DONE, done), ConsesLow.append(body, (SubLObject)forts.NIL)), (SubLObject)ConsesLow.listS((SubLObject)forts.$sym78$DO_FORT_ID_INDEX_NARTS, (SubLObject)ConsesLow.list(fort, value, fii, (SubLObject)forts.$kw13$DONE, done), ConsesLow.append(body, (SubLObject)forts.NIL)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/forts.lisp", position = 11269L)
    public static SubLObject do_fort_id_index_constants(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)forts.$list80);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject constant = (SubLObject)forts.NIL;
        SubLObject value = (SubLObject)forts.NIL;
        SubLObject fort_id_index = (SubLObject)forts.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)forts.$list80);
        constant = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)forts.$list80);
        value = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)forts.$list80);
        fort_id_index = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = (SubLObject)forts.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)forts.NIL;
        SubLObject current_$3 = (SubLObject)forts.NIL;
        while (forts.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)forts.$list80);
            current_$3 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)forts.$list80);
            if (forts.NIL == conses_high.member(current_$3, (SubLObject)forts.$list11, (SubLObject)forts.UNPROVIDED, (SubLObject)forts.UNPROVIDED)) {
                bad = (SubLObject)forts.T;
            }
            if (current_$3 == forts.$kw12$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (forts.NIL != bad && forts.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)forts.$list80);
        }
        final SubLObject done_tail = cdestructuring_bind.property_list_member((SubLObject)forts.$kw13$DONE, current);
        final SubLObject done = (SubLObject)((forts.NIL != done_tail) ? conses_high.cadr(done_tail) : forts.NIL);
        final SubLObject body;
        current = (body = temp);
        final SubLObject id = (SubLObject)forts.$sym81$ID;
        return (SubLObject)ConsesLow.list((SubLObject)forts.$sym82$DO_ID_INDEX, (SubLObject)ConsesLow.list(id, value, (SubLObject)ConsesLow.list((SubLObject)forts.$sym83$DO_FII_GET_CONSTANTS, fort_id_index), (SubLObject)forts.$kw13$DONE, done), (SubLObject)ConsesLow.list((SubLObject)forts.$sym22$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant, (SubLObject)ConsesLow.list((SubLObject)forts.$sym84$FIND_CONSTANT_BY_INTERNAL_ID, id))), (SubLObject)ConsesLow.listS((SubLObject)forts.$sym69$PWHEN, constant, ConsesLow.append(body, (SubLObject)forts.NIL))));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/forts.lisp", position = 11622L)
    public static SubLObject do_fii_get_constants(final SubLObject fort_id_index) {
        return fort_id_index_constants(fort_id_index);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/forts.lisp", position = 11768L)
    public static SubLObject do_fort_id_index_narts(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)forts.$list85);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject nart = (SubLObject)forts.NIL;
        SubLObject value = (SubLObject)forts.NIL;
        SubLObject fort_id_index = (SubLObject)forts.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)forts.$list85);
        nart = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)forts.$list85);
        value = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)forts.$list85);
        fort_id_index = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = (SubLObject)forts.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)forts.NIL;
        SubLObject current_$4 = (SubLObject)forts.NIL;
        while (forts.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)forts.$list85);
            current_$4 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)forts.$list85);
            if (forts.NIL == conses_high.member(current_$4, (SubLObject)forts.$list11, (SubLObject)forts.UNPROVIDED, (SubLObject)forts.UNPROVIDED)) {
                bad = (SubLObject)forts.T;
            }
            if (current_$4 == forts.$kw12$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (forts.NIL != bad && forts.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)forts.$list85);
        }
        final SubLObject done_tail = cdestructuring_bind.property_list_member((SubLObject)forts.$kw13$DONE, current);
        final SubLObject done = (SubLObject)((forts.NIL != done_tail) ? conses_high.cadr(done_tail) : forts.NIL);
        final SubLObject body;
        current = (body = temp);
        final SubLObject id = (SubLObject)forts.$sym86$ID;
        return (SubLObject)ConsesLow.list((SubLObject)forts.$sym82$DO_ID_INDEX, (SubLObject)ConsesLow.list(id, value, (SubLObject)ConsesLow.list((SubLObject)forts.$sym87$DO_FII_GET_NARTS, fort_id_index), (SubLObject)forts.$kw13$DONE, done), (SubLObject)ConsesLow.list((SubLObject)forts.$sym22$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(nart, (SubLObject)ConsesLow.list((SubLObject)forts.$sym88$FIND_NART_BY_ID, id))), (SubLObject)ConsesLow.listS((SubLObject)forts.$sym69$PWHEN, nart, ConsesLow.append(body, (SubLObject)forts.NIL))));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/forts.lisp", position = 12077L)
    public static SubLObject do_fii_get_narts(final SubLObject fort_id_index) {
        return fort_id_index_narts(fort_id_index);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/forts.lisp", position = 12345L)
    public static SubLObject cfasl_output_object_fort_id_index_method(final SubLObject v_object, final SubLObject stream) {
        return cfasl_output_fort_id_index(v_object, stream);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/forts.lisp", position = 12476L)
    public static SubLObject cfasl_output_fort_id_index(final SubLObject fort_id_index, final SubLObject stream) {
        cfasl.cfasl_raw_write_byte(forts.$cfasl_opcode_fort_id_index$.getGlobalValue(), stream);
        final SubLObject count = fort_id_index_count(fort_id_index);
        cfasl.cfasl_output(count, stream);
        SubLObject idx = do_fii_get_constants(fort_id_index);
        if (forts.NIL == id_index.id_index_objects_empty_p(idx, (SubLObject)forts.$kw92$SKIP)) {
            final SubLObject idx_$5 = idx;
            if (forts.NIL == id_index.id_index_dense_objects_empty_p(idx_$5, (SubLObject)forts.$kw92$SKIP)) {
                final SubLObject vector_var = id_index.id_index_dense_objects(idx_$5);
                final SubLObject backwardP_var = (SubLObject)forts.NIL;
                SubLObject length;
                SubLObject v_iteration;
                SubLObject id;
                SubLObject value;
                SubLObject fort;
                for (length = Sequences.length(vector_var), v_iteration = (SubLObject)forts.NIL, v_iteration = (SubLObject)forts.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)forts.ONE_INTEGER)) {
                    id = ((forts.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)forts.ONE_INTEGER) : v_iteration);
                    value = Vectors.aref(vector_var, id);
                    if (forts.NIL == id_index.id_index_tombstone_p(value) || forts.NIL == id_index.id_index_skip_tombstones_p((SubLObject)forts.$kw92$SKIP)) {
                        if (forts.NIL != id_index.id_index_tombstone_p(value)) {
                            value = (SubLObject)forts.$kw92$SKIP;
                        }
                        fort = constants_high.find_constant_by_internal_id(id);
                        if (forts.NIL != fort) {
                            cfasl.cfasl_output(fort, stream);
                            cfasl.cfasl_output(value, stream);
                        }
                    }
                }
            }
            final SubLObject idx_$6 = idx;
            if (forts.NIL == id_index.id_index_sparse_objects_empty_p(idx_$6)) {
                final SubLObject cdohash_table = id_index.id_index_sparse_objects(idx_$6);
                SubLObject id2 = (SubLObject)forts.NIL;
                SubLObject value2 = (SubLObject)forts.NIL;
                final Iterator cdohash_iterator = Hashtables.getEntrySetIterator(cdohash_table);
                try {
                    while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                        final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                        id2 = Hashtables.getEntryKey(cdohash_entry);
                        value2 = Hashtables.getEntryValue(cdohash_entry);
                        final SubLObject fort2 = constants_high.find_constant_by_internal_id(id2);
                        if (forts.NIL != fort2) {
                            cfasl.cfasl_output(fort2, stream);
                            cfasl.cfasl_output(value2, stream);
                        }
                    }
                }
                finally {
                    Hashtables.releaseEntrySetIterator(cdohash_iterator);
                }
            }
        }
        idx = do_fii_get_narts(fort_id_index);
        if (forts.NIL == id_index.id_index_objects_empty_p(idx, (SubLObject)forts.$kw92$SKIP)) {
            final SubLObject idx_$7 = idx;
            if (forts.NIL == id_index.id_index_dense_objects_empty_p(idx_$7, (SubLObject)forts.$kw92$SKIP)) {
                final SubLObject vector_var = id_index.id_index_dense_objects(idx_$7);
                final SubLObject backwardP_var = (SubLObject)forts.NIL;
                SubLObject length;
                SubLObject v_iteration;
                SubLObject id;
                SubLObject value;
                SubLObject fort;
                for (length = Sequences.length(vector_var), v_iteration = (SubLObject)forts.NIL, v_iteration = (SubLObject)forts.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)forts.ONE_INTEGER)) {
                    id = ((forts.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)forts.ONE_INTEGER) : v_iteration);
                    value = Vectors.aref(vector_var, id);
                    if (forts.NIL == id_index.id_index_tombstone_p(value) || forts.NIL == id_index.id_index_skip_tombstones_p((SubLObject)forts.$kw92$SKIP)) {
                        if (forts.NIL != id_index.id_index_tombstone_p(value)) {
                            value = (SubLObject)forts.$kw92$SKIP;
                        }
                        fort = nart_handles.find_nart_by_id(id);
                        if (forts.NIL != fort) {
                            cfasl.cfasl_output(fort, stream);
                            cfasl.cfasl_output(value, stream);
                        }
                    }
                }
            }
            final SubLObject idx_$8 = idx;
            if (forts.NIL == id_index.id_index_sparse_objects_empty_p(idx_$8)) {
                final SubLObject cdohash_table = id_index.id_index_sparse_objects(idx_$8);
                SubLObject id2 = (SubLObject)forts.NIL;
                SubLObject value2 = (SubLObject)forts.NIL;
                final Iterator cdohash_iterator = Hashtables.getEntrySetIterator(cdohash_table);
                try {
                    while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                        final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                        id2 = Hashtables.getEntryKey(cdohash_entry);
                        value2 = Hashtables.getEntryValue(cdohash_entry);
                        final SubLObject fort2 = nart_handles.find_nart_by_id(id2);
                        if (forts.NIL != fort2) {
                            cfasl.cfasl_output(fort2, stream);
                            cfasl.cfasl_output(value2, stream);
                        }
                    }
                }
                finally {
                    Hashtables.releaseEntrySetIterator(cdohash_iterator);
                }
            }
        }
        return fort_id_index;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/forts.lisp", position = 12832L)
    public static SubLObject cfasl_input_fort_id_index(final SubLObject stream) {
        final SubLObject count = cfasl.cfasl_input(stream, (SubLObject)forts.UNPROVIDED, (SubLObject)forts.UNPROVIDED);
        SubLObject fort_id_index = (SubLObject)forts.NIL;
        fort_id_index = new_fort_id_index();
        SubLObject i;
        SubLObject fort;
        SubLObject value;
        for (i = (SubLObject)forts.NIL, i = (SubLObject)forts.ZERO_INTEGER; i.numL(count); i = Numbers.add(i, (SubLObject)forts.ONE_INTEGER)) {
            fort = cfasl.cfasl_input_object(stream);
            value = cfasl.cfasl_input_object(stream);
            fort_id_index_enter(fort_id_index, fort, value);
        }
        return fort_id_index;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/forts.lisp", position = 13257L)
    public static SubLObject verify_do_forts_macro_iteration_equivalence() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject index = (SubLObject)forts.ZERO_INTEGER;
        final SubLObject iter = new_forts_iterator();
        final SubLObject message = (SubLObject)forts.$str93$Checking_that_forts_iterators_wor;
        final SubLObject total = fort_count();
        SubLObject sofar = (SubLObject)forts.ZERO_INTEGER;
        final SubLObject _prev_bind_0 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
        final SubLObject _prev_bind_2 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
        final SubLObject _prev_bind_3 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
        final SubLObject _prev_bind_4 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
        try {
            utilities_macros.$last_percent_progress_index$.bind((SubLObject)forts.ZERO_INTEGER, thread);
            utilities_macros.$last_percent_progress_prediction$.bind((SubLObject)forts.NIL, thread);
            utilities_macros.$within_noting_percent_progress$.bind((SubLObject)forts.T, thread);
            utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
            try {
                utilities_macros.noting_percent_progress_preamble(message);
                SubLObject cdolist_list_var = do_forts_tables();
                SubLObject table_var = (SubLObject)forts.NIL;
                table_var = cdolist_list_var.first();
                while (forts.NIL != cdolist_list_var) {
                    final SubLObject idx = table_var;
                    if (forts.NIL == id_index.id_index_objects_empty_p(idx, (SubLObject)forts.$kw92$SKIP)) {
                        final SubLObject idx_$9 = idx;
                        if (forts.NIL == id_index.id_index_dense_objects_empty_p(idx_$9, (SubLObject)forts.$kw92$SKIP)) {
                            final SubLObject vector_var = id_index.id_index_dense_objects(idx_$9);
                            final SubLObject backwardP_var = (SubLObject)forts.NIL;
                            SubLObject length;
                            SubLObject v_iteration;
                            SubLObject id;
                            SubLObject fort;
                            SubLObject candidate;
                            for (length = Sequences.length(vector_var), v_iteration = (SubLObject)forts.NIL, v_iteration = (SubLObject)forts.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)forts.ONE_INTEGER)) {
                                id = ((forts.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)forts.ONE_INTEGER) : v_iteration);
                                fort = Vectors.aref(vector_var, id);
                                if (forts.NIL == id_index.id_index_tombstone_p(fort) || forts.NIL == id_index.id_index_skip_tombstones_p((SubLObject)forts.$kw92$SKIP)) {
                                    if (forts.NIL != id_index.id_index_tombstone_p(fort)) {
                                        fort = (SubLObject)forts.$kw92$SKIP;
                                    }
                                    sofar = Numbers.add(sofar, (SubLObject)forts.ONE_INTEGER);
                                    utilities_macros.note_percent_progress(sofar, total);
                                    index = Numbers.add(index, (SubLObject)forts.ONE_INTEGER);
                                    candidate = iteration.iteration_next_without_values(iter, (SubLObject)forts.$kw94$EXHAUSTED);
                                    if (forts.NIL == fort_p(candidate)) {
                                        if (candidate == forts.$kw94$EXHAUSTED) {
                                            return (SubLObject)ConsesLow.list((SubLObject)forts.$kw96$ERROR, (SubLObject)forts.$str97$FORTS_ITERATOR_exhausted_before_D, (SubLObject)forts.$kw98$INDEX, index);
                                        }
                                        return (SubLObject)ConsesLow.list((SubLObject)forts.$kw96$ERROR, (SubLObject)forts.$str99$FORTS_ITERATOR_returned_non_fort_, (SubLObject)forts.$kw100$CANDIDATE, candidate, (SubLObject)forts.$kw98$INDEX, index);
                                    }
                                    else if (!candidate.eql(fort)) {
                                        return (SubLObject)ConsesLow.list((SubLObject)forts.$kw96$ERROR, (SubLObject)forts.$str101$FORTS_ITERATOR_and_DO_FORTS_diffe, (SubLObject)forts.$kw100$CANDIDATE, candidate, (SubLObject)forts.$kw102$FORT, fort, (SubLObject)forts.$kw98$INDEX, index);
                                    }
                                }
                            }
                        }
                        final SubLObject idx_$10 = idx;
                        if (forts.NIL == id_index.id_index_sparse_objects_empty_p(idx_$10) || forts.NIL == id_index.id_index_skip_tombstones_p((SubLObject)forts.$kw92$SKIP)) {
                            final SubLObject sparse = id_index.id_index_sparse_objects(idx_$10);
                            SubLObject id2 = id_index.id_index_sparse_id_threshold(idx_$10);
                            final SubLObject end_id = id_index.id_index_next_id(idx_$10);
                            final SubLObject v_default = (SubLObject)((forts.NIL != id_index.id_index_skip_tombstones_p((SubLObject)forts.$kw92$SKIP)) ? forts.NIL : forts.$kw92$SKIP);
                            while (id2.numL(end_id)) {
                                final SubLObject fort2 = Hashtables.gethash_without_values(id2, sparse, v_default);
                                if (forts.NIL == id_index.id_index_skip_tombstones_p((SubLObject)forts.$kw92$SKIP) || forts.NIL == id_index.id_index_tombstone_p(fort2)) {
                                    sofar = Numbers.add(sofar, (SubLObject)forts.ONE_INTEGER);
                                    utilities_macros.note_percent_progress(sofar, total);
                                    index = Numbers.add(index, (SubLObject)forts.ONE_INTEGER);
                                    final SubLObject candidate2 = iteration.iteration_next_without_values(iter, (SubLObject)forts.$kw94$EXHAUSTED);
                                    if (forts.NIL == fort_p(candidate2)) {
                                        if (candidate2 == forts.$kw94$EXHAUSTED) {
                                            return (SubLObject)ConsesLow.list((SubLObject)forts.$kw96$ERROR, (SubLObject)forts.$str97$FORTS_ITERATOR_exhausted_before_D, (SubLObject)forts.$kw98$INDEX, index);
                                        }
                                        return (SubLObject)ConsesLow.list((SubLObject)forts.$kw96$ERROR, (SubLObject)forts.$str99$FORTS_ITERATOR_returned_non_fort_, (SubLObject)forts.$kw100$CANDIDATE, candidate2, (SubLObject)forts.$kw98$INDEX, index);
                                    }
                                    else if (!candidate2.eql(fort2)) {
                                        return (SubLObject)ConsesLow.list((SubLObject)forts.$kw96$ERROR, (SubLObject)forts.$str101$FORTS_ITERATOR_and_DO_FORTS_diffe, (SubLObject)forts.$kw100$CANDIDATE, candidate2, (SubLObject)forts.$kw102$FORT, fort2, (SubLObject)forts.$kw98$INDEX, index);
                                    }
                                }
                                id2 = Numbers.add(id2, (SubLObject)forts.ONE_INTEGER);
                            }
                        }
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    table_var = cdolist_list_var.first();
                }
            }
            finally {
                final SubLObject _prev_bind_0_$11 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)forts.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    utilities_macros.noting_percent_progress_postamble();
                    Values.restoreValuesFromVector(_values);
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
        final SubLObject exhausted = iteration.iteration_next_without_values(iter, (SubLObject)forts.$kw94$EXHAUSTED);
        if (forts.$kw94$EXHAUSTED != exhausted) {
            return (SubLObject)ConsesLow.list((SubLObject)forts.$kw96$ERROR, (SubLObject)forts.$str103$The_FORTS_iterator_has_more_value, (SubLObject)forts.$kw98$INDEX, index, (SubLObject)forts.$kw100$CANDIDATE, exhausted);
        }
        return (SubLObject)forts.NIL;
    }
    
    public static SubLObject declare_forts_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.forts", "fort_p", "FORT-P", 1, 0, false);
        new $fort_p$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.forts", "non_fort_p", "NON-FORT-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.forts", "list_of_fort_p", "LIST-OF-FORT-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.forts", "fort_el_formula", "FORT-EL-FORMULA", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.forts", "new_forts_iterator", "NEW-FORTS-ITERATOR", 0, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.forts", "do_forts", "DO-FORTS");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.forts", "do_forts_tables", "DO-FORTS-TABLES", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.forts", "fort_count", "FORT-COUNT", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.forts", "random_fort", "RANDOM-FORT", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.forts", "sample_forts", "SAMPLE-FORTS", 0, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.forts", "fort_index", "FORT-INDEX", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.forts", "reset_fort_index", "RESET-FORT-INDEX", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.forts", "clear_fort_index", "CLEAR-FORT-INDEX", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.forts", "fort_internal_id", "FORT-INTERNAL-ID", 1, 0, false);
        new $fort_internal_id$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.forts", "fort_external_id", "FORT-EXTERNAL-ID", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.forts", "valid_fortP", "VALID-FORT?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.forts", "valid_fort_robustP", "VALID-FORT-ROBUST?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.forts", "invalid_fortP", "INVALID-FORT?", 1, 0, false);
        new $invalid_fortP$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.forts", "invalid_fort_robustP", "INVALID-FORT-ROBUST?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.forts", "remove_fort", "REMOVE-FORT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.forts", "fort_id_index_print_function_trampoline", "FORT-ID-INDEX-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.forts", "fort_id_index_p", "FORT-ID-INDEX-P", 1, 0, false);
        new $fort_id_index_p$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.forts", "fort_id_index_constants", "FORT-ID-INDEX-CONSTANTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.forts", "fort_id_index_narts", "FORT-ID-INDEX-NARTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.forts", "_csetf_fort_id_index_constants", "_CSETF-FORT-ID-INDEX-CONSTANTS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.forts", "_csetf_fort_id_index_narts", "_CSETF-FORT-ID-INDEX-NARTS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.forts", "make_fort_id_index", "MAKE-FORT-ID-INDEX", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.forts", "visit_defstruct_fort_id_index", "VISIT-DEFSTRUCT-FORT-ID-INDEX", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.forts", "visit_defstruct_object_fort_id_index_method", "VISIT-DEFSTRUCT-OBJECT-FORT-ID-INDEX-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.forts", "print_fort_id_index", "PRINT-FORT-ID-INDEX", 3, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.forts", "with_fort_id_index_index_and_id", "WITH-FORT-ID-INDEX-INDEX-AND-ID");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.forts", "new_fort_id_index", "NEW-FORT-ID-INDEX", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.forts", "fort_id_index_count", "FORT-ID-INDEX-COUNT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.forts", "fort_id_index_emptyP", "FORT-ID-INDEX-EMPTY?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.forts", "fort_id_index_lookup", "FORT-ID-INDEX-LOOKUP", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.forts", "fort_id_index_enter", "FORT-ID-INDEX-ENTER", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.forts", "fort_id_index_remove", "FORT-ID-INDEX-REMOVE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.forts", "clear_fort_id_index", "CLEAR-FORT-ID-INDEX", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.forts", "optimize_fort_id_index", "OPTIMIZE-FORT-ID-INDEX", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.forts", "fort_id_index_optimized_p", "FORT-ID-INDEX-OPTIMIZED-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.forts", "new_fort_id_index_constants", "NEW-FORT-ID-INDEX-CONSTANTS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.forts", "new_fort_id_index_narts", "NEW-FORT-ID-INDEX-NARTS", 0, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.forts", "do_fort_id_index", "DO-FORT-ID-INDEX");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.forts", "do_fort_id_index_constants", "DO-FORT-ID-INDEX-CONSTANTS");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.forts", "do_fii_get_constants", "DO-FII-GET-CONSTANTS", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.forts", "do_fort_id_index_narts", "DO-FORT-ID-INDEX-NARTS");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.forts", "do_fii_get_narts", "DO-FII-GET-NARTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.forts", "cfasl_output_object_fort_id_index_method", "CFASL-OUTPUT-OBJECT-FORT-ID-INDEX-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.forts", "cfasl_output_fort_id_index", "CFASL-OUTPUT-FORT-ID-INDEX", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.forts", "cfasl_input_fort_id_index", "CFASL-INPUT-FORT-ID-INDEX", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.forts", "verify_do_forts_macro_iteration_equivalence", "VERIFY-DO-FORTS-MACRO-ITERATION-EQUIVALENCE", 0, 0, false);
        return (SubLObject)forts.NIL;
    }
    
    public static SubLObject init_forts_file() {
        forts.$dtp_fort_id_index$ = SubLFiles.defconstant("*DTP-FORT-ID-INDEX*", (SubLObject)forts.$sym41$FORT_ID_INDEX);
        forts.$cfasl_opcode_fort_id_index$ = SubLFiles.defconstant("*CFASL-OPCODE-FORT-ID-INDEX*", (SubLObject)forts.$int89$99);
        return (SubLObject)forts.NIL;
    }
    
    public static SubLObject setup_forts_file() {
        utilities_macros.register_cyc_api_function((SubLObject)forts.$sym0$FORT_P, (SubLObject)forts.$list1, (SubLObject)forts.$str2$Return_T_iff_OBJECT_is_a_first_or, (SubLObject)forts.NIL, (SubLObject)forts.$list3);
        utilities_macros.register_cyc_api_function((SubLObject)forts.$sym4$FORT_EL_FORMULA, (SubLObject)forts.$list5, (SubLObject)forts.$str6$Return_the_EL_formula_for_any_FOR, (SubLObject)forts.$list7, (SubLObject)forts.$list8);
        utilities_macros.register_cyc_api_macro((SubLObject)forts.$sym26$DO_FORTS, (SubLObject)forts.$list9, (SubLObject)forts.$str29$Iterate_over_all_HL_FORT_datastru);
        access_macros.register_macro_helper((SubLObject)forts.$sym30$DO_FORTS_TABLES, (SubLObject)forts.$sym26$DO_FORTS);
        utilities_macros.register_cyc_api_function((SubLObject)forts.$sym31$FORT_COUNT, (SubLObject)forts.NIL, (SubLObject)forts.$str32$Return_the_total_number_of_FORTs_, (SubLObject)forts.NIL, (SubLObject)forts.$list33);
        utilities_macros.register_cyc_api_function((SubLObject)forts.$sym38$REMOVE_FORT, (SubLObject)forts.$list5, (SubLObject)forts.$str39$Remove_FORT_from_the_KB_, (SubLObject)forts.$list7, (SubLObject)forts.$list40);
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), forts.$dtp_fort_id_index$.getGlobalValue(), Symbols.symbol_function((SubLObject)forts.$sym48$FORT_ID_INDEX_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)forts.$list49);
        Structures.def_csetf((SubLObject)forts.$sym50$FORT_ID_INDEX_CONSTANTS, (SubLObject)forts.$sym51$_CSETF_FORT_ID_INDEX_CONSTANTS);
        Structures.def_csetf((SubLObject)forts.$sym52$FORT_ID_INDEX_NARTS, (SubLObject)forts.$sym53$_CSETF_FORT_ID_INDEX_NARTS);
        Equality.identity((SubLObject)forts.$sym41$FORT_ID_INDEX);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), forts.$dtp_fort_id_index$.getGlobalValue(), Symbols.symbol_function((SubLObject)forts.$sym61$VISIT_DEFSTRUCT_OBJECT_FORT_ID_INDEX_METHOD));
        access_macros.register_macro_helper((SubLObject)forts.$sym77$DO_FORT_ID_INDEX_CONSTANTS, (SubLObject)forts.$sym79$DO_FORT_ID_INDEX);
        access_macros.register_macro_helper((SubLObject)forts.$sym83$DO_FII_GET_CONSTANTS, (SubLObject)forts.$sym77$DO_FORT_ID_INDEX_CONSTANTS);
        access_macros.register_macro_helper((SubLObject)forts.$sym78$DO_FORT_ID_INDEX_NARTS, (SubLObject)forts.$sym79$DO_FORT_ID_INDEX);
        access_macros.register_macro_helper((SubLObject)forts.$sym87$DO_FII_GET_NARTS, (SubLObject)forts.$sym78$DO_FORT_ID_INDEX_NARTS);
        cfasl.register_cfasl_input_function(forts.$cfasl_opcode_fort_id_index$.getGlobalValue(), (SubLObject)forts.$sym90$CFASL_INPUT_FORT_ID_INDEX);
        Structures.register_method(cfasl.$cfasl_output_object_method_table$.getGlobalValue(), forts.$dtp_fort_id_index$.getGlobalValue(), Symbols.symbol_function((SubLObject)forts.$sym91$CFASL_OUTPUT_OBJECT_FORT_ID_INDEX_METHOD));
        return (SubLObject)forts.NIL;
    }
    
    @Override
	public void declareFunctions() {
        declare_forts_file();
    }
    
    @Override
	public void initializeVariables() {
        init_forts_file();
    }
    
    @Override
	public void runTopLevelForms() {
        setup_forts_file();
    }
    
    static {
        me = (SubLFile)new forts();
        forts.$dtp_fort_id_index$ = null;
        forts.$cfasl_opcode_fort_id_index$ = null;
        $sym0$FORT_P = SubLObjectFactory.makeSymbol("FORT-P");
        $list1 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OBJECT"));
        $str2$Return_T_iff_OBJECT_is_a_first_or = SubLObjectFactory.makeString("Return T iff OBJECT is a first order reified term (FORT).");
        $list3 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("BOOLEANP"));
        $sym4$FORT_EL_FORMULA = SubLObjectFactory.makeSymbol("FORT-EL-FORMULA");
        $list5 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FORT"));
        $str6$Return_the_EL_formula_for_any_FOR = SubLObjectFactory.makeString("Return the EL formula for any FORT.");
        $list7 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FORT"), (SubLObject)SubLObjectFactory.makeSymbol("FORT-P")));
        $list8 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NIL-OR"), (SubLObject)SubLObjectFactory.makeSymbol("CONSP")));
        $list9 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("VAR"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PROGRESS-MESSAGE"), (SubLObject)SubLObjectFactory.makeString("mapping Cyc FORTs")), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("DONE")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $str10$mapping_Cyc_FORTs = SubLObjectFactory.makeString("mapping Cyc FORTs");
        $list11 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("DONE"));
        $kw12$ALLOW_OTHER_KEYS = SubLObjectFactory.makeKeyword("ALLOW-OTHER-KEYS");
        $kw13$DONE = SubLObjectFactory.makeKeyword("DONE");
        $sym14$TABLE_VAR = SubLObjectFactory.makeUninternedSymbol("TABLE-VAR");
        $sym15$DO_LIST = SubLObjectFactory.makeSymbol("DO-LIST");
        $list16 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DO-FORTS-TABLES"));
        $sym17$DO_KB_SUID_TABLE = SubLObjectFactory.makeSymbol("DO-KB-SUID-TABLE");
        $kw18$PROGRESS_MESSAGE = SubLObjectFactory.makeKeyword("PROGRESS-MESSAGE");
        $sym19$MESSAGE = SubLObjectFactory.makeUninternedSymbol("MESSAGE");
        $sym20$TOTAL = SubLObjectFactory.makeUninternedSymbol("TOTAL");
        $sym21$SOFAR = SubLObjectFactory.makeUninternedSymbol("SOFAR");
        $sym22$CLET = SubLObjectFactory.makeSymbol("CLET");
        $list23 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FORT-COUNT")));
        $list24 = ConsesLow.list((SubLObject)forts.ZERO_INTEGER);
        $sym25$NOTING_PERCENT_PROGRESS = SubLObjectFactory.makeSymbol("NOTING-PERCENT-PROGRESS");
        $sym26$DO_FORTS = SubLObjectFactory.makeSymbol("DO-FORTS");
        $sym27$CINC = SubLObjectFactory.makeSymbol("CINC");
        $sym28$NOTE_PERCENT_PROGRESS = SubLObjectFactory.makeSymbol("NOTE-PERCENT-PROGRESS");
        $str29$Iterate_over_all_HL_FORT_datastru = SubLObjectFactory.makeString("Iterate over all HL FORT datastructures, executing BODY within the scope of VAR.\n   VAR is bound to the FORT.\n   PROGRESS-MESSAGE is a progress message string.\n   Iteration halts as soon as DONE becomes non-nil.");
        $sym30$DO_FORTS_TABLES = SubLObjectFactory.makeSymbol("DO-FORTS-TABLES");
        $sym31$FORT_COUNT = SubLObjectFactory.makeSymbol("FORT-COUNT");
        $str32$Return_the_total_number_of_FORTs_ = SubLObjectFactory.makeString("Return the total number of FORTs.");
        $list33 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INTEGERP"));
        $sym34$TRUE = SubLObjectFactory.makeSymbol("TRUE");
        $int35$500 = SubLObjectFactory.makeInteger(500);
        $sym36$NON_NEGATIVE_INTEGER_P = SubLObjectFactory.makeSymbol("NON-NEGATIVE-INTEGER-P");
        $str37$_S_was_not_a_FORT = SubLObjectFactory.makeString("~S was not a FORT");
        $sym38$REMOVE_FORT = SubLObjectFactory.makeSymbol("REMOVE-FORT");
        $str39$Remove_FORT_from_the_KB_ = SubLObjectFactory.makeString("Remove FORT from the KB.");
        $list40 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NULL"));
        $sym41$FORT_ID_INDEX = SubLObjectFactory.makeSymbol("FORT-ID-INDEX");
        $sym42$FORT_ID_INDEX_P = SubLObjectFactory.makeSymbol("FORT-ID-INDEX-P");
        $list43 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CONSTANTS"), (SubLObject)SubLObjectFactory.makeSymbol("NARTS"));
        $list44 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CONSTANTS"), (SubLObject)SubLObjectFactory.makeKeyword("NARTS"));
        $list45 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FORT-ID-INDEX-CONSTANTS"), (SubLObject)SubLObjectFactory.makeSymbol("FORT-ID-INDEX-NARTS"));
        $list46 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("_CSETF-FORT-ID-INDEX-CONSTANTS"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-FORT-ID-INDEX-NARTS"));
        $sym47$PRINT_FORT_ID_INDEX = SubLObjectFactory.makeSymbol("PRINT-FORT-ID-INDEX");
        $sym48$FORT_ID_INDEX_PRINT_FUNCTION_TRAMPOLINE = SubLObjectFactory.makeSymbol("FORT-ID-INDEX-PRINT-FUNCTION-TRAMPOLINE");
        $list49 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("FORT-ID-INDEX-P"));
        $sym50$FORT_ID_INDEX_CONSTANTS = SubLObjectFactory.makeSymbol("FORT-ID-INDEX-CONSTANTS");
        $sym51$_CSETF_FORT_ID_INDEX_CONSTANTS = SubLObjectFactory.makeSymbol("_CSETF-FORT-ID-INDEX-CONSTANTS");
        $sym52$FORT_ID_INDEX_NARTS = SubLObjectFactory.makeSymbol("FORT-ID-INDEX-NARTS");
        $sym53$_CSETF_FORT_ID_INDEX_NARTS = SubLObjectFactory.makeSymbol("_CSETF-FORT-ID-INDEX-NARTS");
        $kw54$CONSTANTS = SubLObjectFactory.makeKeyword("CONSTANTS");
        $kw55$NARTS = SubLObjectFactory.makeKeyword("NARTS");
        $str56$Invalid_slot__S_for_construction_ = SubLObjectFactory.makeString("Invalid slot ~S for construction function");
        $kw57$BEGIN = SubLObjectFactory.makeKeyword("BEGIN");
        $sym58$MAKE_FORT_ID_INDEX = SubLObjectFactory.makeSymbol("MAKE-FORT-ID-INDEX");
        $kw59$SLOT = SubLObjectFactory.makeKeyword("SLOT");
        $kw60$END = SubLObjectFactory.makeKeyword("END");
        $sym61$VISIT_DEFSTRUCT_OBJECT_FORT_ID_INDEX_METHOD = SubLObjectFactory.makeSymbol("VISIT-DEFSTRUCT-OBJECT-FORT-ID-INDEX-METHOD");
        $str62$Constant_Index_ = SubLObjectFactory.makeString("Constant Index:");
        $str63$Nart_Index_ = SubLObjectFactory.makeString("Nart Index:");
        $list64 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ID-INDEX-VAR"), (SubLObject)SubLObjectFactory.makeSymbol("ID-VAR"), (SubLObject)SubLObjectFactory.makeSymbol("FORT"), (SubLObject)SubLObjectFactory.makeSymbol("FORT-ID-INDEX")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym65$PROGN = SubLObjectFactory.makeSymbol("PROGN");
        $sym66$CHECK_TYPE = SubLObjectFactory.makeSymbol("CHECK-TYPE");
        $list67 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FORT-P"));
        $list68 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FORT-ID-INDEX-P"));
        $sym69$PWHEN = SubLObjectFactory.makeSymbol("PWHEN");
        $sym70$VALID_FORT_ = SubLObjectFactory.makeSymbol("VALID-FORT?");
        $sym71$FIF = SubLObjectFactory.makeSymbol("FIF");
        $sym72$CONSTANT_P = SubLObjectFactory.makeSymbol("CONSTANT-P");
        $sym73$CONSTANT_INTERNAL_ID = SubLObjectFactory.makeSymbol("CONSTANT-INTERNAL-ID");
        $sym74$NART_ID = SubLObjectFactory.makeSymbol("NART-ID");
        $list75 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FORT"), (SubLObject)SubLObjectFactory.makeSymbol("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("FORT-ID-INDEX"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("DONE")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym76$FII = SubLObjectFactory.makeUninternedSymbol("FII");
        $sym77$DO_FORT_ID_INDEX_CONSTANTS = SubLObjectFactory.makeSymbol("DO-FORT-ID-INDEX-CONSTANTS");
        $sym78$DO_FORT_ID_INDEX_NARTS = SubLObjectFactory.makeSymbol("DO-FORT-ID-INDEX-NARTS");
        $sym79$DO_FORT_ID_INDEX = SubLObjectFactory.makeSymbol("DO-FORT-ID-INDEX");
        $list80 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CONSTANT"), (SubLObject)SubLObjectFactory.makeSymbol("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("FORT-ID-INDEX"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("DONE")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym81$ID = SubLObjectFactory.makeUninternedSymbol("ID");
        $sym82$DO_ID_INDEX = SubLObjectFactory.makeSymbol("DO-ID-INDEX");
        $sym83$DO_FII_GET_CONSTANTS = SubLObjectFactory.makeSymbol("DO-FII-GET-CONSTANTS");
        $sym84$FIND_CONSTANT_BY_INTERNAL_ID = SubLObjectFactory.makeSymbol("FIND-CONSTANT-BY-INTERNAL-ID");
        $list85 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NART"), (SubLObject)SubLObjectFactory.makeSymbol("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("FORT-ID-INDEX"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("DONE")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym86$ID = SubLObjectFactory.makeUninternedSymbol("ID");
        $sym87$DO_FII_GET_NARTS = SubLObjectFactory.makeSymbol("DO-FII-GET-NARTS");
        $sym88$FIND_NART_BY_ID = SubLObjectFactory.makeSymbol("FIND-NART-BY-ID");
        $int89$99 = SubLObjectFactory.makeInteger(99);
        $sym90$CFASL_INPUT_FORT_ID_INDEX = SubLObjectFactory.makeSymbol("CFASL-INPUT-FORT-ID-INDEX");
        $sym91$CFASL_OUTPUT_OBJECT_FORT_ID_INDEX_METHOD = SubLObjectFactory.makeSymbol("CFASL-OUTPUT-OBJECT-FORT-ID-INDEX-METHOD");
        $kw92$SKIP = SubLObjectFactory.makeKeyword("SKIP");
        $str93$Checking_that_forts_iterators_wor = SubLObjectFactory.makeString("Checking that forts iterators work.");
        $kw94$EXHAUSTED = SubLObjectFactory.makeKeyword("EXHAUSTED");
        $sym95$_EXIT = SubLObjectFactory.makeSymbol("%EXIT");
        $kw96$ERROR = SubLObjectFactory.makeKeyword("ERROR");
        $str97$FORTS_ITERATOR_exhausted_before_D = SubLObjectFactory.makeString("FORTS-ITERATOR exhausted before DO-FORTS");
        $kw98$INDEX = SubLObjectFactory.makeKeyword("INDEX");
        $str99$FORTS_ITERATOR_returned_non_fort_ = SubLObjectFactory.makeString("FORTS-ITERATOR returned non-fort!");
        $kw100$CANDIDATE = SubLObjectFactory.makeKeyword("CANDIDATE");
        $str101$FORTS_ITERATOR_and_DO_FORTS_diffe = SubLObjectFactory.makeString("FORTS-ITERATOR and DO-FORTS differ in which FORT they think is next");
        $kw102$FORT = SubLObjectFactory.makeKeyword("FORT");
        $str103$The_FORTS_iterator_has_more_value = SubLObjectFactory.makeString("The FORTS iterator has more values than DO-FORTS.");
    }
    
    public static final class $fort_p$UnaryFunction extends UnaryFunction
    {
        public $fort_p$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("FORT-P"));
        }
        
        @Override
		public SubLObject processItem(final SubLObject arg1) {
            return forts.fort_p(arg1);
        }
    }
    
    public static final class $fort_internal_id$UnaryFunction extends UnaryFunction
    {
        public $fort_internal_id$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("FORT-INTERNAL-ID"));
        }
        
        @Override
		public SubLObject processItem(final SubLObject arg1) {
            return forts.fort_internal_id(arg1);
        }
    }
    
    public static final class $invalid_fortP$UnaryFunction extends UnaryFunction
    {
        public $invalid_fortP$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("INVALID-FORT?"));
        }
        
        @Override
		public SubLObject processItem(final SubLObject arg1) {
            return forts.invalid_fortP(arg1);
        }
    }
    
    public static final class $fort_id_index_native extends SubLStructNative
    {
        public SubLObject $constants;
        public SubLObject $narts;
        private static final SubLStructDeclNative structDecl;
        
        public $fort_id_index_native() {
            this.$constants = (SubLObject)CommonSymbols.NIL;
            this.$narts = (SubLObject)CommonSymbols.NIL;
        }
        
        @Override
		public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$fort_id_index_native.structDecl;
        }
        
        @Override
		public SubLObject getField2() {
            return this.$constants;
        }
        
        @Override
		public SubLObject getField3() {
            return this.$narts;
        }
        
        @Override
		public SubLObject setField2(final SubLObject value) {
            return this.$constants = value;
        }
        
        @Override
		public SubLObject setField3(final SubLObject value) {
            return this.$narts = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$fort_id_index_native.class, forts.$sym41$FORT_ID_INDEX, forts.$sym42$FORT_ID_INDEX_P, forts.$list43, forts.$list44, new String[] { "$constants", "$narts" }, forts.$list45, forts.$list46, forts.$sym47$PRINT_FORT_ID_INDEX);
        }
    }
    
    public static final class $fort_id_index_p$UnaryFunction extends UnaryFunction
    {
        public $fort_id_index_p$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("FORT-ID-INDEX-P"));
        }
        
        @Override
		public SubLObject processItem(final SubLObject arg1) {
            return forts.fort_id_index_p(arg1);
        }
    }
}

/*

	Total time: 411 ms
	
*/