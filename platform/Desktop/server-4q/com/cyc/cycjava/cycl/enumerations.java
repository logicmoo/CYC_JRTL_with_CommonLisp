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
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Packages;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import java.util.Map;
import java.util.Iterator;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class enumerations extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.enumerations";
    public static final String myFingerPrint = "283010053f94f53ce41c5c5b1fd0593362e8fd27bf73645a83f8279757b2cae3";
    @SubLTranslatedFile.SubL(source = "cycl/enumerations.lisp", position = 2638L)
    private static SubLSymbol $enumerations_initial_hashtable_size$;
    @SubLTranslatedFile.SubL(source = "cycl/enumerations.lisp", position = 2703L)
    private static SubLSymbol $enumerations_table_update_lock$;
    @SubLTranslatedFile.SubL(source = "cycl/enumerations.lisp", position = 2797L)
    private static SubLSymbol $enumerations_table$;
    @SubLTranslatedFile.SubL(source = "cycl/enumerations.lisp", position = 2894L)
    private static SubLSymbol $enum_values_initial_hashtable_size$;
    @SubLTranslatedFile.SubL(source = "cycl/enumerations.lisp", position = 2958L)
    private static SubLSymbol $enum_values_table_update_lock$;
    @SubLTranslatedFile.SubL(source = "cycl/enumerations.lisp", position = 3050L)
    private static SubLSymbol $enum_values_table$;
    @SubLTranslatedFile.SubL(source = "cycl/enumerations.lisp", position = 3145L)
    public static SubLSymbol $dtp_enumeration$;
    private static final SubLInteger $int0$100;
    private static final SubLString $str1$Enumerations_Table_Lock;
    private static final SubLSymbol $sym2$_ENUMERATIONS_TABLE_;
    private static final SubLInteger $int3$200;
    private static final SubLString $str4$Enum_Values_Table_Lock;
    private static final SubLSymbol $sym5$_ENUM_VALUES_TABLE_;
    private static final SubLSymbol $sym6$ENUMERATION;
    private static final SubLSymbol $sym7$ENUMERATION_P;
    private static final SubLList $list8;
    private static final SubLList $list9;
    private static final SubLList $list10;
    private static final SubLList $list11;
    private static final SubLSymbol $sym12$PRINT_ENUMERATION;
    private static final SubLSymbol $sym13$ENUMERATION_PRINT_FUNCTION_TRAMPOLINE;
    private static final SubLList $list14;
    private static final SubLSymbol $sym15$ENUMERATION_TYPE_NAME;
    private static final SubLSymbol $sym16$_CSETF_ENUMERATION_TYPE_NAME;
    private static final SubLSymbol $sym17$ENUMERATION_CARDINALITY;
    private static final SubLSymbol $sym18$_CSETF_ENUMERATION_CARDINALITY;
    private static final SubLSymbol $sym19$ENUMERATION_VALUES_VECTOR;
    private static final SubLSymbol $sym20$_CSETF_ENUMERATION_VALUES_VECTOR;
    private static final SubLSymbol $kw21$TYPE_NAME;
    private static final SubLSymbol $kw22$CARDINALITY;
    private static final SubLSymbol $kw23$VALUES_VECTOR;
    private static final SubLString $str24$Invalid_slot__S_for_construction_;
    private static final SubLSymbol $kw25$BEGIN;
    private static final SubLSymbol $sym26$MAKE_ENUMERATION;
    private static final SubLSymbol $kw27$SLOT;
    private static final SubLSymbol $kw28$END;
    private static final SubLSymbol $sym29$VISIT_DEFSTRUCT_OBJECT_ENUMERATION_METHOD;
    private static final SubLString $str30$___S_;
    private static final SubLString $str31$__S;
    private static final SubLString $str32$_;
    private static final SubLList $list33;
    private static final SubLString $str34$enumeration;
    private static final SubLSymbol $sym35$ENUMERATION_;
    private static final SubLList $list36;
    private static final SubLString $str37$cardinality;
    private static final SubLString $str38$vector;
    private static final SubLString $str39$index;
    private static final SubLSymbol $sym40$CLET;
    private static final SubLSymbol $sym41$CDOTIMES;
    private static final SubLSymbol $sym42$CSETQ;
    private static final SubLSymbol $sym43$AREF;
    private static final SubLString $str44$DEFINE_ENUMERATION___S_is_not_a_v;
    private static final SubLString $str45$DEFINE_ENUMERATION___S_is_not_a_v;
    private static final SubLString $str46$DEFINE_ENUMERATION___S_is_not_a_v;
    private static final SubLString $str47$_VALID__SS_;
    private static final SubLSymbol $sym48$DEFCONSTANT_PRIVATE;
    private static final SubLSymbol $sym49$QUOTE;
    private static final SubLString $str50$Enumerated_values_of_type__S_;
    private static final SubLSymbol $kw51$API;
    private static final SubLSymbol $sym52$DEFINE_API;
    private static final SubLSymbol $kw53$PUBLIC;
    private static final SubLSymbol $sym54$DEFINE_PUBLIC;
    private static final SubLSymbol $kw55$PROTECTED;
    private static final SubLSymbol $sym56$DEFINE_PROTECTED;
    private static final SubLSymbol $kw57$PRIVATE;
    private static final SubLSymbol $sym58$DEFINE_PRIVATE;
    private static final SubLSymbol $sym59$DEFINE;
    private static final SubLString $str60$Returns_a_list_of_all_valid_membe;
    private static final SubLString $str61$VALID__SS;
    private static final SubLList $list62;
    private static final SubLSymbol $sym63$RET;
    private static final SubLString $str64$Return_T_iff_OBJECT_is_a_member_o;
    private static final SubLString $str65$_S_P;
    private static final SubLList $list66;
    private static final SubLList $list67;
    private static final SubLSymbol $sym68$FIF;
    private static final SubLSymbol $sym69$MEMBER;
    private static final SubLSymbol $sym70$OBJECT;
    private static final SubLList $list71;
    private static final SubLString $str72$Maps_a_member_of_the__S_enumerati;
    private static final SubLString $str73$ENCODE__S;
    private static final SubLString $str74$pos;
    private static final SubLList $list75;
    private static final SubLList $list76;
    private static final SubLSymbol $sym77$POSITION;
    private static final SubLSymbol $sym78$VALUE;
    private static final SubLSymbol $sym79$MUST;
    private static final SubLString $str80$_S___S_is_not_a_member_of_the__S_;
    private static final SubLString $str81$Maps_an_encoded_value_to_a_member;
    private static final SubLString $str82$DECODE__S;
    private static final SubLString $str83$element;
    private static final SubLSymbol $kw84$RETURN_TYPES;
    private static final SubLSymbol $sym85$NTH;
    private static final SubLString $str86$_S___S_is_not_a_valid_encoding_of;
    private static final SubLString $str87$Provides_a_LESSP_predicate_for_me;
    private static final SubLString $str88$_S_LESS_P;
    private static final SubLList $list89;
    private static final SubLList $list90;
    private static final SubLString $str91$_S___S_was_expected_to_be_a_membe;
    private static final SubLSymbol $sym92$VALUE1;
    private static final SubLList $list93;
    private static final SubLSymbol $sym94$VALUE2;
    private static final SubLSymbol $sym95$CDOLIST;
    private static final SubLList $list96;
    private static final SubLList $list97;
    private static final SubLString $str98$Provides_a_GREATERP_predicate_for;
    private static final SubLString $str99$_S_GREATER_P;
    private static final SubLList $list100;
    private static final SubLSymbol $sym101$PROGN;
    private static final SubLSymbol $sym102$ENUMERATIONS_INCORPORATE_DEFINITION;
    private static final SubLList $list103;
    private static final SubLString $str104$ENUMERATE_VALUES___S_is_not_a_val;
    private static final SubLString $str105$ENUMERATION_MEMBER_P___S_is_not_a;
    private static final SubLString $str106$ENUMERATION_MEMBER_P___S_is_not_k;
    private static final SubLString $str107$ENCODE_ENUMERATION___S_is_not_a_v;
    private static final SubLString $str108$ENCODE_ENUMERATION___S_is_not_kno;
    private static final SubLString $str109$ENCODE_ENUMERATION___S_has_no_mem;
    private static final SubLString $str110$ENCODE_ENUMERATION___S_is_not_a_m;
    private static final SubLString $str111$DECODE_ENUMERATION___S_is_not_a_v;
    private static final SubLString $str112$DECODE_ENUMERATION___S_is_not_kno;
    private static final SubLString $str113$DECODE_ENUMERATION___S_has_no_mem;
    private static final SubLString $str114$DECODE_ENUMERATION___S_is_not_a_v;
    private static final SubLList $list115;
    private static final SubLSymbol $sym116$ENUMERATIONS_RETRIEVE_ENUMERATION;
    private static final SubLString $str117$DO_ENUMERATION___S_does_not_evalu;
    private static final SubLString $str118$ENUMERATION_LESS_P___S_is_not_a_v;
    private static final SubLString $str119$ENUMERATION_LESS_P___S_is_not_kno;
    private static final SubLString $str120$ENUMERATION_LESS_P___S_has_no_val;
    private static final SubLString $str121$ENUMERATION_GREATER_P___S_is_not_;
    private static final SubLString $str122$ENUMERATION_GREATER_P___S_is_not_;
    private static final SubLString $str123$ENUMERATION_GREATER_P___S_has_no_;
    
    @SubLTranslatedFile.SubL(source = "cycl/enumerations.lisp", position = 3145L)
    public static SubLObject enumeration_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        print_enumeration(v_object, stream, (SubLObject)enumerations.ZERO_INTEGER);
        return (SubLObject)enumerations.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/enumerations.lisp", position = 3145L)
    public static SubLObject enumeration_p(final SubLObject v_object) {
        return (SubLObject)((v_object.getClass() == $enumeration_native.class) ? enumerations.T : enumerations.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/enumerations.lisp", position = 3145L)
    public static SubLObject enumeration_type_name(final SubLObject v_object) {
        assert enumerations.NIL != enumeration_p(v_object) : v_object;
        return v_object.getField2();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/enumerations.lisp", position = 3145L)
    public static SubLObject enumeration_cardinality(final SubLObject v_object) {
        assert enumerations.NIL != enumeration_p(v_object) : v_object;
        return v_object.getField3();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/enumerations.lisp", position = 3145L)
    public static SubLObject enumeration_values_vector(final SubLObject v_object) {
        assert enumerations.NIL != enumeration_p(v_object) : v_object;
        return v_object.getField4();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/enumerations.lisp", position = 3145L)
    public static SubLObject _csetf_enumeration_type_name(final SubLObject v_object, final SubLObject value) {
        assert enumerations.NIL != enumeration_p(v_object) : v_object;
        return v_object.setField2(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/enumerations.lisp", position = 3145L)
    public static SubLObject _csetf_enumeration_cardinality(final SubLObject v_object, final SubLObject value) {
        assert enumerations.NIL != enumeration_p(v_object) : v_object;
        return v_object.setField3(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/enumerations.lisp", position = 3145L)
    public static SubLObject _csetf_enumeration_values_vector(final SubLObject v_object, final SubLObject value) {
        assert enumerations.NIL != enumeration_p(v_object) : v_object;
        return v_object.setField4(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/enumerations.lisp", position = 3145L)
    public static SubLObject make_enumeration(SubLObject arglist) {
        if (arglist == enumerations.UNPROVIDED) {
            arglist = (SubLObject)enumerations.NIL;
        }
        final SubLObject v_new = (SubLObject)new $enumeration_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = (SubLObject)enumerations.NIL, next = arglist; enumerations.NIL != next; next = conses_high.cddr(next)) {
            current_arg = next.first();
            current_value = conses_high.cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql((SubLObject)enumerations.$kw21$TYPE_NAME)) {
                _csetf_enumeration_type_name(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)enumerations.$kw22$CARDINALITY)) {
                _csetf_enumeration_cardinality(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)enumerations.$kw23$VALUES_VECTOR)) {
                _csetf_enumeration_values_vector(v_new, current_value);
            }
            else {
                Errors.error((SubLObject)enumerations.$str24$Invalid_slot__S_for_construction_, current_arg);
            }
        }
        return v_new;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/enumerations.lisp", position = 3145L)
    public static SubLObject visit_defstruct_enumeration(final SubLObject obj, final SubLObject visitor_fn) {
        Functions.funcall(visitor_fn, obj, (SubLObject)enumerations.$kw25$BEGIN, (SubLObject)enumerations.$sym26$MAKE_ENUMERATION, (SubLObject)enumerations.THREE_INTEGER);
        Functions.funcall(visitor_fn, obj, (SubLObject)enumerations.$kw27$SLOT, (SubLObject)enumerations.$kw21$TYPE_NAME, enumeration_type_name(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)enumerations.$kw27$SLOT, (SubLObject)enumerations.$kw22$CARDINALITY, enumeration_cardinality(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)enumerations.$kw27$SLOT, (SubLObject)enumerations.$kw23$VALUES_VECTOR, enumeration_values_vector(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)enumerations.$kw28$END, (SubLObject)enumerations.$sym26$MAKE_ENUMERATION, (SubLObject)enumerations.THREE_INTEGER);
        return obj;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/enumerations.lisp", position = 3145L)
    public static SubLObject visit_defstruct_object_enumeration_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_enumeration(obj, visitor_fn);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/enumerations.lisp", position = 3353L)
    public static SubLObject print_enumeration(final SubLObject v_object, final SubLObject stream, final SubLObject depth) {
        PrintLow.format(stream, (SubLObject)enumerations.$str30$___S_, enumeration_type_name(v_object));
        if (enumerations.NIL != enumeration_values_vector(v_object)) {
            SubLObject cdotimes_end_var;
            SubLObject index;
            for (cdotimes_end_var = enumeration_cardinality(v_object), index = (SubLObject)enumerations.NIL, index = (SubLObject)enumerations.ZERO_INTEGER; index.numL(cdotimes_end_var); index = Numbers.add(index, (SubLObject)enumerations.ONE_INTEGER)) {
                PrintLow.format(stream, (SubLObject)enumerations.$str31$__S, Vectors.aref(enumeration_values_vector(v_object), index));
            }
        }
        PrintLow.format(stream, (SubLObject)enumerations.$str32$_);
        return v_object;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/enumerations.lisp", position = 3769L)
    public static SubLObject with_enumeration_read_only(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject enumeration = (SubLObject)enumerations.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)enumerations.$list33);
        enumeration = current.first();
        final SubLObject forms;
        current = (forms = current.rest());
        final SubLObject enumeration_var = Symbols.make_symbol((SubLObject)enumerations.$str34$enumeration);
        return utilities_macros.generate_instance_variable_bindings_for_structure_slots(enumeration_var, enumeration, (SubLObject)enumerations.$sym35$ENUMERATION_, (SubLObject)enumerations.$list8, forms, (SubLObject)enumerations.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/enumerations.lisp", position = 4292L)
    public static SubLObject with_enumeration_read_write(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject enumeration = (SubLObject)enumerations.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)enumerations.$list33);
        enumeration = current.first();
        final SubLObject forms;
        current = (forms = current.rest());
        final SubLObject enumeration_var = Symbols.make_symbol((SubLObject)enumerations.$str34$enumeration);
        return utilities_macros.generate_instance_variable_bindings_for_structure_slots(enumeration_var, enumeration, (SubLObject)enumerations.$sym35$ENUMERATION_, (SubLObject)enumerations.$list8, forms, (SubLObject)enumerations.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/enumerations.lisp", position = 4970L)
    public static SubLObject do_enumeration_internal(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)enumerations.$list36);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject var = (SubLObject)enumerations.NIL;
        SubLObject enumeration = (SubLObject)enumerations.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)enumerations.$list36);
        var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)enumerations.$list36);
        enumeration = current.first();
        current = current.rest();
        if (enumerations.NIL == current) {
            final SubLObject forms;
            current = (forms = temp);
            final SubLObject enumeration_var = Symbols.make_symbol((SubLObject)enumerations.$str34$enumeration);
            final SubLObject cardinality_var = Symbols.make_symbol((SubLObject)enumerations.$str37$cardinality);
            final SubLObject vector_var = Symbols.make_symbol((SubLObject)enumerations.$str38$vector);
            final SubLObject index_var = Symbols.make_symbol((SubLObject)enumerations.$str39$index);
            return (SubLObject)ConsesLow.list((SubLObject)enumerations.$sym40$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(enumeration_var, enumeration), (SubLObject)ConsesLow.list(cardinality_var, (SubLObject)ConsesLow.list((SubLObject)enumerations.$sym17$ENUMERATION_CARDINALITY, enumeration_var)), (SubLObject)ConsesLow.list(vector_var, (SubLObject)ConsesLow.list((SubLObject)enumerations.$sym19$ENUMERATION_VALUES_VECTOR, enumeration_var)), var), (SubLObject)ConsesLow.listS((SubLObject)enumerations.$sym41$CDOTIMES, (SubLObject)ConsesLow.list(index_var, cardinality_var), (SubLObject)ConsesLow.list((SubLObject)enumerations.$sym42$CSETQ, var, (SubLObject)ConsesLow.list((SubLObject)enumerations.$sym43$AREF, vector_var, index_var)), forms));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)enumerations.$list36);
        return (SubLObject)enumerations.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/enumerations.lisp", position = 5757L)
    public static SubLObject enumerations_retrieve_enumeration(final SubLObject enumeration_name) {
        if (enumeration_name.isSymbol()) {
            return Hashtables.gethash(enumeration_name, enumerations.$enumerations_table$.getGlobalValue(), (SubLObject)enumerations.UNPROVIDED);
        }
        return (SubLObject)enumerations.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/enumerations.lisp", position = 6054L)
    public static SubLObject enumeration_intern_enumeration(final SubLObject enumeration_name, final SubLObject enumeration) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject release = (SubLObject)enumerations.NIL;
        try {
            release = Locks.seize_lock(enumerations.$enumerations_table_update_lock$.getDynamicValue(thread));
            if (enumeration_name.isSymbol() && enumerations.NIL != enumeration_p(enumeration)) {
                Hashtables.sethash(enumeration_name, enumerations.$enumerations_table$.getGlobalValue(), enumeration);
                final SubLObject cardinality = enumeration_cardinality(enumeration);
                final SubLObject vector = enumeration_values_vector(enumeration);
                SubLObject value = (SubLObject)enumerations.NIL;
                SubLObject index;
                for (index = (SubLObject)enumerations.NIL, index = (SubLObject)enumerations.ZERO_INTEGER; index.numL(cardinality); index = Numbers.add(index, (SubLObject)enumerations.ONE_INTEGER)) {
                    value = Vectors.aref(vector, index);
                    enumerations_intern_enumeration_by_value(value, enumeration);
                }
            }
        }
        finally {
            if (enumerations.NIL != release) {
                Locks.release_lock(enumerations.$enumerations_table_update_lock$.getDynamicValue(thread));
            }
        }
        return enumeration;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/enumerations.lisp", position = 6872L)
    public static SubLObject get_all_enumerated_types() {
        SubLObject enumerated_types = (SubLObject)enumerations.NIL;
        SubLObject key = (SubLObject)enumerations.NIL;
        SubLObject value = (SubLObject)enumerations.NIL;
        final Iterator cdohash_iterator = Hashtables.getEntrySetIterator(enumerations.$enumerations_table$.getGlobalValue());
        try {
            while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                key = Hashtables.getEntryKey(cdohash_entry);
                value = Hashtables.getEntryValue(cdohash_entry);
                enumerated_types = (SubLObject)ConsesLow.cons(key, enumerated_types);
            }
        }
        finally {
            Hashtables.releaseEntrySetIterator(cdohash_iterator);
        }
        return Sequences.nreverse(enumerated_types);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/enumerations.lisp", position = 7092L)
    public static SubLObject enumerations_delete_enumeration(final SubLObject enumeration_name) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject release = (SubLObject)enumerations.NIL;
        try {
            release = Locks.seize_lock(enumerations.$enumerations_table_update_lock$.getDynamicValue(thread));
            if (enumeration_name.isSymbol()) {
                final SubLObject enumeration = Hashtables.gethash(enumeration_name, enumerations.$enum_values_table$.getGlobalValue(), (SubLObject)enumerations.UNPROVIDED);
                if (enumerations.NIL != enumeration) {
                    final SubLObject enumeration_$2 = enumeration;
                    final SubLObject cardinality = enumeration_cardinality(enumeration_$2);
                    final SubLObject vector = enumeration_values_vector(enumeration_$2);
                    SubLObject value = (SubLObject)enumerations.NIL;
                    SubLObject index;
                    for (index = (SubLObject)enumerations.NIL, index = (SubLObject)enumerations.ZERO_INTEGER; index.numL(cardinality); index = Numbers.add(index, (SubLObject)enumerations.ONE_INTEGER)) {
                        value = Vectors.aref(vector, index);
                        enumerations_delete_enumeration_by_value(value, enumeration);
                    }
                }
                Hashtables.remhash(enumeration_name, enumerations.$enumerations_table$.getGlobalValue());
            }
        }
        finally {
            if (enumerations.NIL != release) {
                Locks.release_lock(enumerations.$enumerations_table_update_lock$.getDynamicValue(thread));
            }
        }
        return (SubLObject)enumerations.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/enumerations.lisp", position = 7796L)
    public static SubLObject enumerations_retrieve_enumerations_by_value(final SubLObject enum_value) {
        return Hashtables.gethash(enum_value, enumerations.$enum_values_table$.getGlobalValue(), (SubLObject)enumerations.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/enumerations.lisp", position = 8110L)
    public static SubLObject enumerations_intern_enumeration_by_value(final SubLObject enum_value, final SubLObject enumeration) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (enumerations.NIL != enumeration_p(enumeration)) {
            SubLObject release = (SubLObject)enumerations.NIL;
            try {
                release = Locks.seize_lock(enumerations.$enum_values_table_update_lock$.getDynamicValue(thread));
                SubLObject current_enumerations = Hashtables.gethash(enum_value, enumerations.$enum_values_table$.getGlobalValue(), (SubLObject)enumerations.UNPROVIDED);
                if (enumerations.NIL == conses_high.member(enumeration, current_enumerations, (SubLObject)enumerations.UNPROVIDED, (SubLObject)enumerations.UNPROVIDED)) {
                    current_enumerations = (SubLObject)ConsesLow.cons(enumeration, current_enumerations);
                    Hashtables.sethash(enum_value, enumerations.$enum_values_table$.getGlobalValue(), current_enumerations);
                }
            }
            finally {
                if (enumerations.NIL != release) {
                    Locks.release_lock(enumerations.$enum_values_table_update_lock$.getDynamicValue(thread));
                }
            }
            return enumeration;
        }
        return (SubLObject)enumerations.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/enumerations.lisp", position = 8714L)
    public static SubLObject enumerations_delete_enumeration_by_value(final SubLObject enum_value, final SubLObject enumeration) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (enumerations.NIL != enumeration_p(enumeration)) {
            SubLObject release = (SubLObject)enumerations.NIL;
            try {
                release = Locks.seize_lock(enumerations.$enum_values_table_update_lock$.getDynamicValue(thread));
                SubLObject current_enumerations = Hashtables.gethash(enum_value, enumerations.$enum_values_table$.getGlobalValue(), (SubLObject)enumerations.UNPROVIDED);
                current_enumerations = Sequences.delete(enumeration, current_enumerations, (SubLObject)enumerations.UNPROVIDED, (SubLObject)enumerations.UNPROVIDED, (SubLObject)enumerations.UNPROVIDED, (SubLObject)enumerations.UNPROVIDED, (SubLObject)enumerations.UNPROVIDED);
                if (enumerations.NIL != current_enumerations) {
                    Hashtables.sethash(enum_value, enumerations.$enum_values_table$.getGlobalValue(), current_enumerations);
                }
                else {
                    Hashtables.remhash(enum_value, enumerations.$enum_values_table$.getGlobalValue());
                }
            }
            finally {
                if (enumerations.NIL != release) {
                    Locks.release_lock(enumerations.$enum_values_table_update_lock$.getDynamicValue(thread));
                }
            }
            return enumeration;
        }
        return (SubLObject)enumerations.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/enumerations.lisp", position = 9376L)
    public static SubLObject enumerations_redundant_elements_p(final SubLObject list) {
        SubLObject sublist;
        for (sublist = (SubLObject)enumerations.NIL, sublist = list; enumerations.NIL != sublist; sublist = sublist.rest()) {
            if (enumerations.NIL != conses_high.member(sublist.first(), sublist.rest(), (SubLObject)enumerations.UNPROVIDED, (SubLObject)enumerations.UNPROVIDED)) {
                return (SubLObject)enumerations.T;
            }
        }
        return (SubLObject)enumerations.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/enumerations.lisp", position = 9601L)
    public static SubLObject enumerations_check_definition(final SubLObject enum_name, final SubLObject values) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (enumerations.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && (!enum_name.isSymbol() || enumerations.NIL == enum_name)) {
            Errors.error((SubLObject)enumerations.$str44$DEFINE_ENUMERATION___S_is_not_a_v, enum_name);
        }
        if (enumerations.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && !values.isList()) {
            Errors.error((SubLObject)enumerations.$str45$DEFINE_ENUMERATION___S_is_not_a_v, values);
        }
        if (enumerations.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && enumerations.NIL != enumerations_redundant_elements_p(values)) {
            Errors.error((SubLObject)enumerations.$str46$DEFINE_ENUMERATION___S_is_not_a_v, values);
        }
        return (SubLObject)enumerations.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/enumerations.lisp", position = 10509L)
    public static SubLObject enumerations_incorporate_definition(final SubLObject enum_name, final SubLObject values) {
        SubLObject enumeration = enumerations_retrieve_enumeration(enum_name);
        if (enumerations.NIL != enumeration) {
            enumerations_delete_enumeration(enum_name);
        }
        else {
            enumeration = make_enumeration((SubLObject)enumerations.UNPROVIDED);
        }
        final SubLObject enumeration_$3 = enumeration;
        SubLObject type_name = enumeration_type_name(enumeration_$3);
        SubLObject cardinality = enumeration_cardinality(enumeration_$3);
        SubLObject values_vector = enumeration_values_vector(enumeration_$3);
        try {
            type_name = enum_name;
            cardinality = Sequences.length(values);
            if (cardinality.isZero()) {
                values_vector = (SubLObject)enumerations.NIL;
            }
            else {
                SubLObject index = (SubLObject)enumerations.ZERO_INTEGER;
                values_vector = Vectors.make_vector(cardinality, (SubLObject)enumerations.UNPROVIDED);
                SubLObject cdolist_list_var = values;
                SubLObject value = (SubLObject)enumerations.NIL;
                value = cdolist_list_var.first();
                while (enumerations.NIL != cdolist_list_var) {
                    Vectors.set_aref(values_vector, index, value);
                    index = Numbers.add(index, (SubLObject)enumerations.ONE_INTEGER);
                    cdolist_list_var = cdolist_list_var.rest();
                    value = cdolist_list_var.first();
                }
            }
        }
        finally {
            final SubLObject _prev_bind_0 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
            try {
                Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)enumerations.T);
                final SubLObject _values = Values.getValuesAsVector();
                _csetf_enumeration_type_name(enumeration_$3, type_name);
                _csetf_enumeration_cardinality(enumeration_$3, cardinality);
                _csetf_enumeration_values_vector(enumeration_$3, values_vector);
                Values.restoreValuesFromVector(_values);
            }
            finally {
                Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, _prev_bind_0);
            }
        }
        enumeration_intern_enumeration(enum_name, enumeration);
        return enumeration;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/enumerations.lisp", position = 11805L)
    public static SubLObject enumerations_compute_enumeration_constant_name(final SubLObject enum_name) {
        return Packages.intern(PrintLow.format((SubLObject)enumerations.NIL, (SubLObject)enumerations.$str47$_VALID__SS_, enum_name), (SubLObject)enumerations.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/enumerations.lisp", position = 11936L)
    public static SubLObject enumerations_expand_enumeration_constant_declaration(final SubLObject enum_name, final SubLObject values) {
        final SubLObject defining_form = (SubLObject)enumerations.$sym48$DEFCONSTANT_PRIVATE;
        final SubLObject var_name = enumerations_compute_enumeration_constant_name(enum_name);
        return (SubLObject)ConsesLow.list(defining_form, var_name, (SubLObject)ConsesLow.list((SubLObject)enumerations.$sym49$QUOTE, conses_high.copy_list(values)), PrintLow.format((SubLObject)enumerations.NIL, (SubLObject)enumerations.$str50$Enumerated_values_of_type__S_, enum_name));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/enumerations.lisp", position = 12266L)
    public static SubLObject enumerations_get_defining_form(final SubLObject scope) {
        SubLObject defining_form = (SubLObject)enumerations.NIL;
        if (scope.eql((SubLObject)enumerations.$kw51$API)) {
            defining_form = (SubLObject)enumerations.$sym52$DEFINE_API;
        }
        else if (scope.eql((SubLObject)enumerations.$kw53$PUBLIC)) {
            defining_form = (SubLObject)enumerations.$sym54$DEFINE_PUBLIC;
        }
        else if (scope.eql((SubLObject)enumerations.$kw55$PROTECTED)) {
            defining_form = (SubLObject)enumerations.$sym56$DEFINE_PROTECTED;
        }
        else if (scope.eql((SubLObject)enumerations.$kw57$PRIVATE)) {
            defining_form = (SubLObject)enumerations.$sym58$DEFINE_PRIVATE;
        }
        else {
            defining_form = (SubLObject)enumerations.$sym59$DEFINE;
        }
        return defining_form;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/enumerations.lisp", position = 12658L)
    public static SubLObject enumerations_expand_enum_valid_enum_list_function(final SubLObject enum_name, final SubLObject scope) {
        final SubLObject defining_form = enumerations_get_defining_form(scope);
        SubLObject declarations = (SubLObject)enumerations.NIL;
        final SubLObject documentation = PrintLow.format((SubLObject)enumerations.NIL, (SubLObject)enumerations.$str60$Returns_a_list_of_all_valid_membe, enum_name);
        final SubLObject function_name = Packages.intern(PrintLow.format((SubLObject)enumerations.NIL, (SubLObject)enumerations.$str61$VALID__SS, enum_name), (SubLObject)enumerations.UNPROVIDED);
        final SubLObject constant_name = enumerations_compute_enumeration_constant_name(enum_name);
        if (scope == enumerations.$kw51$API) {
            declarations = (SubLObject)enumerations.$list62;
        }
        return (SubLObject)ConsesLow.listS(defining_form, function_name, (SubLObject)enumerations.NIL, documentation, ConsesLow.append(declarations, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)enumerations.$sym63$RET, constant_name))));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/enumerations.lisp", position = 13279L)
    public static SubLObject enumerations_expand_predicator_function(final SubLObject enum_name, final SubLObject scope) {
        final SubLObject defining_form = enumerations_get_defining_form(scope);
        SubLObject declarations = (SubLObject)enumerations.NIL;
        final SubLObject documentation = PrintLow.format((SubLObject)enumerations.NIL, (SubLObject)enumerations.$str64$Return_T_iff_OBJECT_is_a_member_o, enum_name);
        final SubLObject predicator_name = Packages.intern(PrintLow.format((SubLObject)enumerations.NIL, (SubLObject)enumerations.$str65$_S_P, enum_name), (SubLObject)enumerations.UNPROVIDED);
        final SubLObject constant_name = enumerations_compute_enumeration_constant_name(enum_name);
        if (scope == enumerations.$kw51$API) {
            declarations = (SubLObject)enumerations.$list66;
        }
        return (SubLObject)ConsesLow.listS(defining_form, predicator_name, (SubLObject)enumerations.$list67, documentation, ConsesLow.append(declarations, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)enumerations.$sym63$RET, (SubLObject)ConsesLow.listS((SubLObject)enumerations.$sym68$FIF, (SubLObject)ConsesLow.list((SubLObject)enumerations.$sym69$MEMBER, (SubLObject)enumerations.$sym70$OBJECT, constant_name), (SubLObject)enumerations.$list71)))));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/enumerations.lisp", position = 14255L)
    public static SubLObject enumerations_expand_encode_function(final SubLObject enum_name, final SubLObject scope) {
        final SubLObject defining_form = enumerations_get_defining_form(scope);
        SubLObject declarations = (SubLObject)enumerations.NIL;
        final SubLObject documentation = PrintLow.format((SubLObject)enumerations.NIL, (SubLObject)enumerations.$str72$Maps_a_member_of_the__S_enumerati, enum_name);
        final SubLObject function_name = Packages.intern(PrintLow.format((SubLObject)enumerations.NIL, (SubLObject)enumerations.$str73$ENCODE__S, enum_name), (SubLObject)enumerations.UNPROVIDED);
        final SubLObject pos_var = Symbols.make_symbol((SubLObject)enumerations.$str74$pos);
        final SubLObject constant_name = enumerations_compute_enumeration_constant_name(enum_name);
        if (scope == enumerations.$kw51$API) {
            declarations = (SubLObject)enumerations.$list75;
        }
        return (SubLObject)ConsesLow.listS(defining_form, function_name, (SubLObject)enumerations.$list76, documentation, ConsesLow.append(declarations, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)enumerations.$sym40$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(pos_var, (SubLObject)ConsesLow.list((SubLObject)enumerations.$sym77$POSITION, (SubLObject)enumerations.$sym78$VALUE, constant_name))), (SubLObject)ConsesLow.list((SubLObject)enumerations.$sym79$MUST, pos_var, (SubLObject)enumerations.$str80$_S___S_is_not_a_member_of_the__S_, (SubLObject)ConsesLow.list((SubLObject)enumerations.$sym49$QUOTE, function_name), (SubLObject)enumerations.$sym78$VALUE, (SubLObject)ConsesLow.list((SubLObject)enumerations.$sym49$QUOTE, enum_name)), (SubLObject)ConsesLow.list((SubLObject)enumerations.$sym63$RET, pos_var)))));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/enumerations.lisp", position = 15416L)
    public static SubLObject enumerations_expand_decode_function(final SubLObject enum_name, final SubLObject scope) {
        final SubLObject defining_form = enumerations_get_defining_form(scope);
        SubLObject declarations = (SubLObject)enumerations.NIL;
        final SubLObject documentation = PrintLow.format((SubLObject)enumerations.NIL, (SubLObject)enumerations.$str81$Maps_an_encoded_value_to_a_member, enum_name);
        final SubLObject predicator_name = Packages.intern(PrintLow.format((SubLObject)enumerations.NIL, (SubLObject)enumerations.$str65$_S_P, enum_name), (SubLObject)enumerations.UNPROVIDED);
        final SubLObject function_name = Packages.intern(PrintLow.format((SubLObject)enumerations.NIL, (SubLObject)enumerations.$str82$DECODE__S, enum_name), (SubLObject)enumerations.UNPROVIDED);
        final SubLObject element_var = Symbols.make_symbol((SubLObject)enumerations.$str83$element);
        final SubLObject constant_name = enumerations_compute_enumeration_constant_name(enum_name);
        if (scope == enumerations.$kw51$API) {
            declarations = (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)enumerations.$kw84$RETURN_TYPES, predicator_name)));
        }
        return (SubLObject)ConsesLow.listS(defining_form, function_name, (SubLObject)enumerations.$list76, documentation, ConsesLow.append(declarations, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)enumerations.$sym40$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(element_var, (SubLObject)ConsesLow.list((SubLObject)enumerations.$sym85$NTH, (SubLObject)enumerations.$sym78$VALUE, constant_name))), (SubLObject)ConsesLow.list((SubLObject)enumerations.$sym79$MUST, element_var, (SubLObject)enumerations.$str86$_S___S_is_not_a_valid_encoding_of, (SubLObject)ConsesLow.list((SubLObject)enumerations.$sym49$QUOTE, function_name), (SubLObject)enumerations.$sym78$VALUE, (SubLObject)ConsesLow.list((SubLObject)enumerations.$sym49$QUOTE, enum_name)), (SubLObject)ConsesLow.list((SubLObject)enumerations.$sym63$RET, element_var)))));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/enumerations.lisp", position = 16664L)
    public static SubLObject enumerations_expand_lessp_function(final SubLObject enum_name, final SubLObject scope) {
        final SubLObject defining_form = enumerations_get_defining_form(scope);
        SubLObject declarations = (SubLObject)enumerations.NIL;
        final SubLObject documentation = PrintLow.format((SubLObject)enumerations.NIL, (SubLObject)enumerations.$str87$Provides_a_LESSP_predicate_for_me, enum_name);
        final SubLObject function_name = Packages.intern(PrintLow.format((SubLObject)enumerations.NIL, (SubLObject)enumerations.$str88$_S_LESS_P, enum_name), (SubLObject)enumerations.UNPROVIDED);
        final SubLObject predicator_name = Packages.intern(PrintLow.format((SubLObject)enumerations.NIL, (SubLObject)enumerations.$str65$_S_P, enum_name), (SubLObject)enumerations.UNPROVIDED);
        final SubLObject constant_name = enumerations_compute_enumeration_constant_name(enum_name);
        if (scope == enumerations.$kw51$API) {
            declarations = (SubLObject)enumerations.$list66;
        }
        return (SubLObject)ConsesLow.listS(defining_form, function_name, (SubLObject)enumerations.$list89, documentation, ConsesLow.append(declarations, (SubLObject)ConsesLow.listS((SubLObject)ConsesLow.list((SubLObject)enumerations.$sym79$MUST, reader.bq_cons(predicator_name, (SubLObject)enumerations.$list90), (SubLObject)enumerations.$str91$_S___S_was_expected_to_be_a_membe, (SubLObject)ConsesLow.list((SubLObject)enumerations.$sym49$QUOTE, predicator_name), (SubLObject)enumerations.$sym92$VALUE1, (SubLObject)ConsesLow.list((SubLObject)enumerations.$sym49$QUOTE, enum_name)), (SubLObject)ConsesLow.list((SubLObject)enumerations.$sym79$MUST, reader.bq_cons(predicator_name, (SubLObject)enumerations.$list93), (SubLObject)enumerations.$str91$_S___S_was_expected_to_be_a_membe, (SubLObject)ConsesLow.list((SubLObject)enumerations.$sym49$QUOTE, predicator_name), (SubLObject)enumerations.$sym94$VALUE2, (SubLObject)ConsesLow.list((SubLObject)enumerations.$sym49$QUOTE, enum_name)), (SubLObject)ConsesLow.listS((SubLObject)enumerations.$sym95$CDOLIST, (SubLObject)ConsesLow.list((SubLObject)enumerations.$sym78$VALUE, constant_name), (SubLObject)enumerations.$list96), (SubLObject)enumerations.$list97)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/enumerations.lisp", position = 18177L)
    public static SubLObject enumerations_expand_greaterp_function(final SubLObject enum_name, final SubLObject scope) {
        final SubLObject defining_form = enumerations_get_defining_form(scope);
        SubLObject declarations = (SubLObject)enumerations.NIL;
        final SubLObject documentation = PrintLow.format((SubLObject)enumerations.NIL, (SubLObject)enumerations.$str98$Provides_a_GREATERP_predicate_for, enum_name);
        final SubLObject function_name = Packages.intern(PrintLow.format((SubLObject)enumerations.NIL, (SubLObject)enumerations.$str99$_S_GREATER_P, enum_name), (SubLObject)enumerations.UNPROVIDED);
        final SubLObject predicator_name = Packages.intern(PrintLow.format((SubLObject)enumerations.NIL, (SubLObject)enumerations.$str65$_S_P, enum_name), (SubLObject)enumerations.UNPROVIDED);
        final SubLObject constant_name = enumerations_compute_enumeration_constant_name(enum_name);
        if (scope == enumerations.$kw51$API) {
            declarations = (SubLObject)enumerations.$list66;
        }
        return (SubLObject)ConsesLow.listS(defining_form, function_name, (SubLObject)enumerations.$list89, documentation, ConsesLow.append(declarations, (SubLObject)ConsesLow.listS((SubLObject)ConsesLow.list((SubLObject)enumerations.$sym79$MUST, reader.bq_cons(predicator_name, (SubLObject)enumerations.$list90), (SubLObject)enumerations.$str91$_S___S_was_expected_to_be_a_membe, (SubLObject)ConsesLow.list((SubLObject)enumerations.$sym49$QUOTE, predicator_name), (SubLObject)enumerations.$sym92$VALUE1, (SubLObject)ConsesLow.list((SubLObject)enumerations.$sym49$QUOTE, enum_name)), (SubLObject)ConsesLow.list((SubLObject)enumerations.$sym79$MUST, reader.bq_cons(predicator_name, (SubLObject)enumerations.$list93), (SubLObject)enumerations.$str91$_S___S_was_expected_to_be_a_membe, (SubLObject)ConsesLow.list((SubLObject)enumerations.$sym49$QUOTE, predicator_name), (SubLObject)enumerations.$sym94$VALUE2, (SubLObject)ConsesLow.list((SubLObject)enumerations.$sym49$QUOTE, enum_name)), (SubLObject)ConsesLow.listS((SubLObject)enumerations.$sym95$CDOLIST, (SubLObject)ConsesLow.list((SubLObject)enumerations.$sym78$VALUE, constant_name), (SubLObject)enumerations.$list100), (SubLObject)enumerations.$list97)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/enumerations.lisp", position = 19703L)
    public static SubLObject expand_define_enumeration(final SubLObject enum_name, final SubLObject values, final SubLObject scope) {
        enumerations_check_definition(enum_name, values);
        enumerations_incorporate_definition(enum_name, values);
        return (SubLObject)ConsesLow.list(new SubLObject[] { enumerations.$sym101$PROGN, enumerations_expand_enumeration_constant_declaration(enum_name, values), ConsesLow.list((SubLObject)enumerations.$sym102$ENUMERATIONS_INCORPORATE_DEFINITION, (SubLObject)ConsesLow.list((SubLObject)enumerations.$sym49$QUOTE, enum_name), (SubLObject)ConsesLow.list((SubLObject)enumerations.$sym49$QUOTE, conses_high.copy_list(values))), enumerations_expand_enum_valid_enum_list_function(enum_name, scope), enumerations_expand_predicator_function(enum_name, scope), enumerations_expand_encode_function(enum_name, scope), enumerations_expand_decode_function(enum_name, scope), enumerations_expand_lessp_function(enum_name, scope), enumerations_expand_greaterp_function(enum_name, scope) });
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/enumerations.lisp", position = 20977L)
    public static SubLObject define_enumeration_public(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject enum_name = (SubLObject)enumerations.NIL;
        SubLObject values = (SubLObject)enumerations.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)enumerations.$list103);
        enum_name = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)enumerations.$list103);
        values = current.first();
        current = current.rest();
        if (enumerations.NIL == current) {
            return expand_define_enumeration(enum_name, values, (SubLObject)enumerations.$kw53$PUBLIC);
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)enumerations.$list103);
        return (SubLObject)enumerations.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/enumerations.lisp", position = 22485L)
    public static SubLObject define_enumeration_api(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject enum_name = (SubLObject)enumerations.NIL;
        SubLObject values = (SubLObject)enumerations.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)enumerations.$list103);
        enum_name = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)enumerations.$list103);
        values = current.first();
        current = current.rest();
        if (enumerations.NIL == current) {
            return expand_define_enumeration(enum_name, values, (SubLObject)enumerations.$kw51$API);
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)enumerations.$list103);
        return (SubLObject)enumerations.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/enumerations.lisp", position = 22597L)
    public static SubLObject define_enumeration_protected(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject enum_name = (SubLObject)enumerations.NIL;
        SubLObject values = (SubLObject)enumerations.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)enumerations.$list103);
        enum_name = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)enumerations.$list103);
        values = current.first();
        current = current.rest();
        if (enumerations.NIL == current) {
            return expand_define_enumeration(enum_name, values, (SubLObject)enumerations.$kw55$PROTECTED);
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)enumerations.$list103);
        return (SubLObject)enumerations.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/enumerations.lisp", position = 22721L)
    public static SubLObject define_enumeration_private(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject enum_name = (SubLObject)enumerations.NIL;
        SubLObject values = (SubLObject)enumerations.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)enumerations.$list103);
        enum_name = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)enumerations.$list103);
        values = current.first();
        current = current.rest();
        if (enumerations.NIL == current) {
            return expand_define_enumeration(enum_name, values, (SubLObject)enumerations.$kw57$PRIVATE);
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)enumerations.$list103);
        return (SubLObject)enumerations.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/enumerations.lisp", position = 22841L)
    public static SubLObject enumerate_values(final SubLObject enum_name) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (enumerations.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && (!enum_name.isSymbol() || enumerations.NIL == enum_name)) {
            Errors.error((SubLObject)enumerations.$str104$ENUMERATE_VALUES___S_is_not_a_val, enum_name);
        }
        final SubLObject enumeration = enumerations_retrieve_enumeration(enum_name);
        if (enumerations.NIL != enumeration) {
            final SubLObject enumeration_$4 = enumeration;
            final SubLObject cardinality = enumeration_cardinality(enumeration_$4);
            final SubLObject values_vector = enumeration_values_vector(enumeration_$4);
            if (enumerations.NIL != values_vector) {
                SubLObject values = (SubLObject)enumerations.NIL;
                SubLObject index;
                for (index = (SubLObject)enumerations.NIL, index = (SubLObject)enumerations.ZERO_INTEGER; index.numL(cardinality); index = Numbers.add(index, (SubLObject)enumerations.ONE_INTEGER)) {
                    values = (SubLObject)ConsesLow.cons(Vectors.aref(values_vector, index), values);
                }
                return Sequences.nreverse(values);
            }
        }
        return (SubLObject)enumerations.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/enumerations.lisp", position = 23715L)
    public static SubLObject enumerate_enumerations(final SubLObject value) {
        final SubLObject v_enumerations = enumerations_retrieve_enumerations_by_value(value);
        SubLObject enumeration_names = (SubLObject)enumerations.NIL;
        final SubLObject list_expression = v_enumerations;
        if (enumerations.NIL == list_expression) {
            enumeration_names = (SubLObject)enumerations.NIL;
        }
        else if (list_expression.isAtom()) {
            enumeration_names = (SubLObject)ConsesLow.list(list_expression);
        }
        else if (enumerations.NIL == list_expression.rest()) {
            final SubLObject enumeration = list_expression.first();
            enumeration_names = (SubLObject)ConsesLow.list(enumeration_type_name(enumeration));
        }
        else {
            SubLObject tail_cons = (SubLObject)enumerations.NIL;
            SubLObject result = (SubLObject)enumerations.NIL;
            final SubLObject enumeration2 = list_expression.first();
            enumeration_names = (tail_cons = (SubLObject)ConsesLow.list(enumeration_type_name(enumeration2)));
            SubLObject cdolist_list_var = list_expression.rest();
            SubLObject enumeration3 = (SubLObject)enumerations.NIL;
            enumeration3 = cdolist_list_var.first();
            while (enumerations.NIL != cdolist_list_var) {
                result = (SubLObject)ConsesLow.list(enumeration_type_name(enumeration3));
                ConsesLow.rplacd(tail_cons, result);
                tail_cons = result;
                cdolist_list_var = cdolist_list_var.rest();
                enumeration3 = cdolist_list_var.first();
            }
        }
        return enumeration_names;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/enumerations.lisp", position = 24322L)
    public static SubLObject enumeration_member_p(final SubLObject enum_name, final SubLObject value) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (enumerations.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && (!enum_name.isSymbol() || enumerations.NIL == enum_name)) {
            Errors.error((SubLObject)enumerations.$str105$ENUMERATION_MEMBER_P___S_is_not_a, enum_name);
        }
        final SubLObject enumeration = enumerations_retrieve_enumeration(enum_name);
        if (enumerations.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && enumerations.NIL == enumeration) {
            Errors.error((SubLObject)enumerations.$str106$ENUMERATION_MEMBER_P___S_is_not_k, enum_name);
        }
        final SubLObject enumeration_$5 = enumeration;
        final SubLObject cardinality = enumeration_cardinality(enumeration_$5);
        final SubLObject vector = enumeration_values_vector(enumeration_$5);
        SubLObject member_value = (SubLObject)enumerations.NIL;
        SubLObject index;
        for (index = (SubLObject)enumerations.NIL, index = (SubLObject)enumerations.ZERO_INTEGER; index.numL(cardinality); index = Numbers.add(index, (SubLObject)enumerations.ONE_INTEGER)) {
            member_value = Vectors.aref(vector, index);
            if (member_value.eql(value)) {
                return (SubLObject)enumerations.T;
            }
        }
        return (SubLObject)enumerations.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/enumerations.lisp", position = 25002L)
    public static SubLObject encode_enumeration(final SubLObject enum_name, final SubLObject value) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (enumerations.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && (!enum_name.isSymbol() || enumerations.NIL == enum_name)) {
            Errors.error((SubLObject)enumerations.$str107$ENCODE_ENUMERATION___S_is_not_a_v, enum_name);
        }
        final SubLObject enumeration = enumerations_retrieve_enumeration(enum_name);
        if (enumerations.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && enumerations.NIL == enumeration) {
            Errors.error((SubLObject)enumerations.$str108$ENCODE_ENUMERATION___S_is_not_kno, enum_name);
        }
        final SubLObject enumeration_$6 = enumeration;
        final SubLObject cardinality = enumeration_cardinality(enumeration_$6);
        final SubLObject values_vector = enumeration_values_vector(enumeration_$6);
        if (enumerations.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && enumerations.NIL == values_vector) {
            Errors.error((SubLObject)enumerations.$str109$ENCODE_ENUMERATION___S_has_no_mem, enum_name);
        }
        SubLObject index;
        for (index = (SubLObject)enumerations.NIL, index = (SubLObject)enumerations.ZERO_INTEGER; index.numL(cardinality); index = Numbers.add(index, (SubLObject)enumerations.ONE_INTEGER)) {
            if (Vectors.aref(values_vector, index).eql(value)) {
                return index;
            }
        }
        if (enumerations.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
            Errors.error((SubLObject)enumerations.$str110$ENCODE_ENUMERATION___S_is_not_a_m, value, enum_name);
        }
        return (SubLObject)enumerations.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/enumerations.lisp", position = 26013L)
    public static SubLObject decode_enumeration(final SubLObject enum_name, final SubLObject value) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (enumerations.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && (!enum_name.isSymbol() || enumerations.NIL == enum_name)) {
            Errors.error((SubLObject)enumerations.$str111$DECODE_ENUMERATION___S_is_not_a_v, enum_name);
        }
        final SubLObject enumeration = enumerations_retrieve_enumeration(enum_name);
        if (enumerations.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && enumerations.NIL == enumeration) {
            Errors.error((SubLObject)enumerations.$str112$DECODE_ENUMERATION___S_is_not_kno, enum_name);
        }
        final SubLObject enumeration_$7 = enumeration;
        final SubLObject cardinality = enumeration_cardinality(enumeration_$7);
        final SubLObject values_vector = enumeration_values_vector(enumeration_$7);
        if (enumerations.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && enumerations.NIL == values_vector) {
            Errors.error((SubLObject)enumerations.$str113$DECODE_ENUMERATION___S_has_no_mem, enum_name);
        }
        if (enumerations.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && (!value.numGE((SubLObject)enumerations.ZERO_INTEGER) || !value.numL(cardinality))) {
            Errors.error((SubLObject)enumerations.$str114$DECODE_ENUMERATION___S_is_not_a_v, value, enum_name);
        }
        return Vectors.aref(values_vector, value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/enumerations.lisp", position = 26723L)
    public static SubLObject do_enumeration(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)enumerations.$list115);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject var = (SubLObject)enumerations.NIL;
        SubLObject enumeration_name = (SubLObject)enumerations.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)enumerations.$list115);
        var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)enumerations.$list115);
        enumeration_name = current.first();
        current = current.rest();
        if (enumerations.NIL == current) {
            final SubLObject forms;
            current = (forms = temp);
            final SubLObject enumeration_var = Symbols.make_symbol((SubLObject)enumerations.$str34$enumeration);
            final SubLObject cardinality_var = Symbols.make_symbol((SubLObject)enumerations.$str37$cardinality);
            final SubLObject vector_var = Symbols.make_symbol((SubLObject)enumerations.$str38$vector);
            final SubLObject index_var = Symbols.make_symbol((SubLObject)enumerations.$str39$index);
            return (SubLObject)ConsesLow.list((SubLObject)enumerations.$sym40$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(enumeration_var, (SubLObject)ConsesLow.list((SubLObject)enumerations.$sym116$ENUMERATIONS_RETRIEVE_ENUMERATION, enumeration_name))), (SubLObject)ConsesLow.list((SubLObject)enumerations.$sym79$MUST, enumeration_var, (SubLObject)enumerations.$str117$DO_ENUMERATION___S_does_not_evalu, (SubLObject)ConsesLow.list((SubLObject)enumerations.$sym49$QUOTE, conses_high.copy_tree(enumeration_name))), (SubLObject)ConsesLow.list((SubLObject)enumerations.$sym40$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(cardinality_var, (SubLObject)ConsesLow.list((SubLObject)enumerations.$sym17$ENUMERATION_CARDINALITY, enumeration_var)), (SubLObject)ConsesLow.list(vector_var, (SubLObject)ConsesLow.list((SubLObject)enumerations.$sym19$ENUMERATION_VALUES_VECTOR, enumeration_var)), var), (SubLObject)ConsesLow.listS((SubLObject)enumerations.$sym41$CDOTIMES, (SubLObject)ConsesLow.list(index_var, cardinality_var), (SubLObject)ConsesLow.list((SubLObject)enumerations.$sym42$CSETQ, var, (SubLObject)ConsesLow.list((SubLObject)enumerations.$sym43$AREF, vector_var, index_var)), forms)));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)enumerations.$list115);
        return (SubLObject)enumerations.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/enumerations.lisp", position = 27825L)
    public static SubLObject enumeration_less_p(final SubLObject enum_name, final SubLObject value1, final SubLObject value2) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (enumerations.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && (!enum_name.isSymbol() || enumerations.NIL == enum_name)) {
            Errors.error((SubLObject)enumerations.$str118$ENUMERATION_LESS_P___S_is_not_a_v, enum_name);
        }
        final SubLObject enumeration = enumerations_retrieve_enumeration(enum_name);
        if (enumerations.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && enumerations.NIL == enumeration) {
            Errors.error((SubLObject)enumerations.$str119$ENUMERATION_LESS_P___S_is_not_kno, enum_name);
        }
        SubLObject value3 = (SubLObject)enumerations.NIL;
        final SubLObject enumeration_$8 = enumeration;
        final SubLObject cardinality = enumeration_cardinality(enumeration_$8);
        final SubLObject values_vector = enumeration_values_vector(enumeration_$8);
        if (enumerations.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && enumerations.NIL == values_vector) {
            Errors.error((SubLObject)enumerations.$str120$ENUMERATION_LESS_P___S_has_no_val, enum_name);
        }
        SubLObject index;
        for (index = (SubLObject)enumerations.NIL, index = (SubLObject)enumerations.ZERO_INTEGER; index.numL(cardinality); index = Numbers.add(index, (SubLObject)enumerations.ONE_INTEGER)) {
            value3 = Vectors.aref(values_vector, index);
            if (value3.eql(value1)) {
                return (SubLObject)SubLObjectFactory.makeBoolean(!value3.eql(value2));
            }
            if (value3.eql(value2)) {
                return (SubLObject)enumerations.NIL;
            }
        }
        return (SubLObject)enumerations.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/enumerations.lisp", position = 28788L)
    public static SubLObject enumeration_less_or_equal_p(final SubLObject enum_name, final SubLObject value1, final SubLObject value2) {
        return (SubLObject)SubLObjectFactory.makeBoolean(value1.eql(value2) || enumerations.NIL != enumeration_less_p(enum_name, value1, value2));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/enumerations.lisp", position = 28942L)
    public static SubLObject enumeration_greater_p(final SubLObject enum_name, final SubLObject value1, final SubLObject value2) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (enumerations.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && (!enum_name.isSymbol() || enumerations.NIL == enum_name)) {
            Errors.error((SubLObject)enumerations.$str121$ENUMERATION_GREATER_P___S_is_not_, enum_name);
        }
        final SubLObject enumeration = enumerations_retrieve_enumeration(enum_name);
        if (enumerations.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && enumerations.NIL == enumeration) {
            Errors.error((SubLObject)enumerations.$str122$ENUMERATION_GREATER_P___S_is_not_, enum_name);
        }
        SubLObject value3 = (SubLObject)enumerations.NIL;
        final SubLObject enumeration_$9 = enumeration;
        final SubLObject cardinality = enumeration_cardinality(enumeration_$9);
        final SubLObject values_vector = enumeration_values_vector(enumeration_$9);
        if (enumerations.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && enumerations.NIL == values_vector) {
            Errors.error((SubLObject)enumerations.$str123$ENUMERATION_GREATER_P___S_has_no_, enum_name);
        }
        SubLObject index;
        for (index = (SubLObject)enumerations.NIL, index = (SubLObject)enumerations.ZERO_INTEGER; index.numL(cardinality); index = Numbers.add(index, (SubLObject)enumerations.ONE_INTEGER)) {
            value3 = Vectors.aref(values_vector, index);
            if (value3.eql(value2)) {
                return (SubLObject)SubLObjectFactory.makeBoolean(!value3.eql(value1));
            }
            if (value3.eql(value1)) {
                return (SubLObject)enumerations.NIL;
            }
        }
        return (SubLObject)enumerations.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/enumerations.lisp", position = 29923L)
    public static SubLObject enumeration_greater_or_equal_p(final SubLObject enum_name, final SubLObject value1, final SubLObject value2) {
        return (SubLObject)SubLObjectFactory.makeBoolean(value1.eql(value2) || enumerations.NIL != enumeration_greater_p(enum_name, value1, value2));
    }
    
    public static SubLObject declare_enumerations_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.enumerations", "enumeration_print_function_trampoline", "ENUMERATION-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.enumerations", "enumeration_p", "ENUMERATION-P", 1, 0, false);
        new $enumeration_p$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.enumerations", "enumeration_type_name", "ENUMERATION-TYPE-NAME", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.enumerations", "enumeration_cardinality", "ENUMERATION-CARDINALITY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.enumerations", "enumeration_values_vector", "ENUMERATION-VALUES-VECTOR", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.enumerations", "_csetf_enumeration_type_name", "_CSETF-ENUMERATION-TYPE-NAME", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.enumerations", "_csetf_enumeration_cardinality", "_CSETF-ENUMERATION-CARDINALITY", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.enumerations", "_csetf_enumeration_values_vector", "_CSETF-ENUMERATION-VALUES-VECTOR", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.enumerations", "make_enumeration", "MAKE-ENUMERATION", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.enumerations", "visit_defstruct_enumeration", "VISIT-DEFSTRUCT-ENUMERATION", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.enumerations", "visit_defstruct_object_enumeration_method", "VISIT-DEFSTRUCT-OBJECT-ENUMERATION-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.enumerations", "print_enumeration", "PRINT-ENUMERATION", 3, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.enumerations", "with_enumeration_read_only", "WITH-ENUMERATION-READ-ONLY");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.enumerations", "with_enumeration_read_write", "WITH-ENUMERATION-READ-WRITE");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.enumerations", "do_enumeration_internal", "DO-ENUMERATION-INTERNAL");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.enumerations", "enumerations_retrieve_enumeration", "ENUMERATIONS-RETRIEVE-ENUMERATION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.enumerations", "enumeration_intern_enumeration", "ENUMERATION-INTERN-ENUMERATION", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.enumerations", "get_all_enumerated_types", "GET-ALL-ENUMERATED-TYPES", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.enumerations", "enumerations_delete_enumeration", "ENUMERATIONS-DELETE-ENUMERATION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.enumerations", "enumerations_retrieve_enumerations_by_value", "ENUMERATIONS-RETRIEVE-ENUMERATIONS-BY-VALUE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.enumerations", "enumerations_intern_enumeration_by_value", "ENUMERATIONS-INTERN-ENUMERATION-BY-VALUE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.enumerations", "enumerations_delete_enumeration_by_value", "ENUMERATIONS-DELETE-ENUMERATION-BY-VALUE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.enumerations", "enumerations_redundant_elements_p", "ENUMERATIONS-REDUNDANT-ELEMENTS-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.enumerations", "enumerations_check_definition", "ENUMERATIONS-CHECK-DEFINITION", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.enumerations", "enumerations_incorporate_definition", "ENUMERATIONS-INCORPORATE-DEFINITION", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.enumerations", "enumerations_compute_enumeration_constant_name", "ENUMERATIONS-COMPUTE-ENUMERATION-CONSTANT-NAME", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.enumerations", "enumerations_expand_enumeration_constant_declaration", "ENUMERATIONS-EXPAND-ENUMERATION-CONSTANT-DECLARATION", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.enumerations", "enumerations_get_defining_form", "ENUMERATIONS-GET-DEFINING-FORM", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.enumerations", "enumerations_expand_enum_valid_enum_list_function", "ENUMERATIONS-EXPAND-ENUM-VALID-ENUM-LIST-FUNCTION", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.enumerations", "enumerations_expand_predicator_function", "ENUMERATIONS-EXPAND-PREDICATOR-FUNCTION", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.enumerations", "enumerations_expand_encode_function", "ENUMERATIONS-EXPAND-ENCODE-FUNCTION", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.enumerations", "enumerations_expand_decode_function", "ENUMERATIONS-EXPAND-DECODE-FUNCTION", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.enumerations", "enumerations_expand_lessp_function", "ENUMERATIONS-EXPAND-LESSP-FUNCTION", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.enumerations", "enumerations_expand_greaterp_function", "ENUMERATIONS-EXPAND-GREATERP-FUNCTION", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.enumerations", "expand_define_enumeration", "EXPAND-DEFINE-ENUMERATION", 3, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.enumerations", "define_enumeration_public", "DEFINE-ENUMERATION-PUBLIC");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.enumerations", "define_enumeration_api", "DEFINE-ENUMERATION-API");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.enumerations", "define_enumeration_protected", "DEFINE-ENUMERATION-PROTECTED");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.enumerations", "define_enumeration_private", "DEFINE-ENUMERATION-PRIVATE");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.enumerations", "enumerate_values", "ENUMERATE-VALUES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.enumerations", "enumerate_enumerations", "ENUMERATE-ENUMERATIONS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.enumerations", "enumeration_member_p", "ENUMERATION-MEMBER-P", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.enumerations", "encode_enumeration", "ENCODE-ENUMERATION", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.enumerations", "decode_enumeration", "DECODE-ENUMERATION", 2, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.enumerations", "do_enumeration", "DO-ENUMERATION");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.enumerations", "enumeration_less_p", "ENUMERATION-LESS-P", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.enumerations", "enumeration_less_or_equal_p", "ENUMERATION-LESS-OR-EQUAL-P", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.enumerations", "enumeration_greater_p", "ENUMERATION-GREATER-P", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.enumerations", "enumeration_greater_or_equal_p", "ENUMERATION-GREATER-OR-EQUAL-P", 3, 0, false);
        return (SubLObject)enumerations.NIL;
    }
    
    public static SubLObject init_enumerations_file() {
        enumerations.$enumerations_initial_hashtable_size$ = SubLFiles.defconstant("*ENUMERATIONS-INITIAL-HASHTABLE-SIZE*", (SubLObject)enumerations.$int0$100);
        enumerations.$enumerations_table_update_lock$ = SubLFiles.defparameter("*ENUMERATIONS-TABLE-UPDATE-LOCK*", Locks.make_lock((SubLObject)enumerations.$str1$Enumerations_Table_Lock));
        enumerations.$enumerations_table$ = SubLFiles.deflexical("*ENUMERATIONS-TABLE*", (enumerations.NIL != Symbols.boundp((SubLObject)enumerations.$sym2$_ENUMERATIONS_TABLE_)) ? enumerations.$enumerations_table$.getGlobalValue() : Hashtables.make_hash_table(enumerations.$enumerations_initial_hashtable_size$.getGlobalValue(), (SubLObject)enumerations.UNPROVIDED, (SubLObject)enumerations.UNPROVIDED));
        enumerations.$enum_values_initial_hashtable_size$ = SubLFiles.defconstant("*ENUM-VALUES-INITIAL-HASHTABLE-SIZE*", (SubLObject)enumerations.$int3$200);
        enumerations.$enum_values_table_update_lock$ = SubLFiles.defparameter("*ENUM-VALUES-TABLE-UPDATE-LOCK*", Locks.make_lock((SubLObject)enumerations.$str4$Enum_Values_Table_Lock));
        enumerations.$enum_values_table$ = SubLFiles.deflexical("*ENUM-VALUES-TABLE*", (enumerations.NIL != Symbols.boundp((SubLObject)enumerations.$sym5$_ENUM_VALUES_TABLE_)) ? enumerations.$enum_values_table$.getGlobalValue() : Hashtables.make_hash_table(enumerations.$enum_values_initial_hashtable_size$.getGlobalValue(), (SubLObject)enumerations.UNPROVIDED, (SubLObject)enumerations.UNPROVIDED));
        enumerations.$dtp_enumeration$ = SubLFiles.defconstant("*DTP-ENUMERATION*", (SubLObject)enumerations.$sym6$ENUMERATION);
        return (SubLObject)enumerations.NIL;
    }
    
    public static SubLObject setup_enumerations_file() {
        subl_macro_promotions.declare_defglobal((SubLObject)enumerations.$sym2$_ENUMERATIONS_TABLE_);
        subl_macro_promotions.declare_defglobal((SubLObject)enumerations.$sym5$_ENUM_VALUES_TABLE_);
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), enumerations.$dtp_enumeration$.getGlobalValue(), Symbols.symbol_function((SubLObject)enumerations.$sym13$ENUMERATION_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)enumerations.$list14);
        Structures.def_csetf((SubLObject)enumerations.$sym15$ENUMERATION_TYPE_NAME, (SubLObject)enumerations.$sym16$_CSETF_ENUMERATION_TYPE_NAME);
        Structures.def_csetf((SubLObject)enumerations.$sym17$ENUMERATION_CARDINALITY, (SubLObject)enumerations.$sym18$_CSETF_ENUMERATION_CARDINALITY);
        Structures.def_csetf((SubLObject)enumerations.$sym19$ENUMERATION_VALUES_VECTOR, (SubLObject)enumerations.$sym20$_CSETF_ENUMERATION_VALUES_VECTOR);
        Equality.identity((SubLObject)enumerations.$sym6$ENUMERATION);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), enumerations.$dtp_enumeration$.getGlobalValue(), Symbols.symbol_function((SubLObject)enumerations.$sym29$VISIT_DEFSTRUCT_OBJECT_ENUMERATION_METHOD));
        return (SubLObject)enumerations.NIL;
    }
    
    @Override
	public void declareFunctions() {
        declare_enumerations_file();
    }
    
    @Override
	public void initializeVariables() {
        init_enumerations_file();
    }
    
    @Override
	public void runTopLevelForms() {
        setup_enumerations_file();
    }
    
    static {
        me = (SubLFile)new enumerations();
        enumerations.$enumerations_initial_hashtable_size$ = null;
        enumerations.$enumerations_table_update_lock$ = null;
        enumerations.$enumerations_table$ = null;
        enumerations.$enum_values_initial_hashtable_size$ = null;
        enumerations.$enum_values_table_update_lock$ = null;
        enumerations.$enum_values_table$ = null;
        enumerations.$dtp_enumeration$ = null;
        $int0$100 = SubLObjectFactory.makeInteger(100);
        $str1$Enumerations_Table_Lock = SubLObjectFactory.makeString("Enumerations Table Lock");
        $sym2$_ENUMERATIONS_TABLE_ = SubLObjectFactory.makeSymbol("*ENUMERATIONS-TABLE*");
        $int3$200 = SubLObjectFactory.makeInteger(200);
        $str4$Enum_Values_Table_Lock = SubLObjectFactory.makeString("Enum-Values Table Lock");
        $sym5$_ENUM_VALUES_TABLE_ = SubLObjectFactory.makeSymbol("*ENUM-VALUES-TABLE*");
        $sym6$ENUMERATION = SubLObjectFactory.makeSymbol("ENUMERATION");
        $sym7$ENUMERATION_P = SubLObjectFactory.makeSymbol("ENUMERATION-P");
        $list8 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TYPE-NAME"), (SubLObject)SubLObjectFactory.makeSymbol("CARDINALITY"), (SubLObject)SubLObjectFactory.makeSymbol("VALUES-VECTOR"));
        $list9 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TYPE-NAME"), (SubLObject)SubLObjectFactory.makeKeyword("CARDINALITY"), (SubLObject)SubLObjectFactory.makeKeyword("VALUES-VECTOR"));
        $list10 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ENUMERATION-TYPE-NAME"), (SubLObject)SubLObjectFactory.makeSymbol("ENUMERATION-CARDINALITY"), (SubLObject)SubLObjectFactory.makeSymbol("ENUMERATION-VALUES-VECTOR"));
        $list11 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("_CSETF-ENUMERATION-TYPE-NAME"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-ENUMERATION-CARDINALITY"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-ENUMERATION-VALUES-VECTOR"));
        $sym12$PRINT_ENUMERATION = SubLObjectFactory.makeSymbol("PRINT-ENUMERATION");
        $sym13$ENUMERATION_PRINT_FUNCTION_TRAMPOLINE = SubLObjectFactory.makeSymbol("ENUMERATION-PRINT-FUNCTION-TRAMPOLINE");
        $list14 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("ENUMERATION-P"));
        $sym15$ENUMERATION_TYPE_NAME = SubLObjectFactory.makeSymbol("ENUMERATION-TYPE-NAME");
        $sym16$_CSETF_ENUMERATION_TYPE_NAME = SubLObjectFactory.makeSymbol("_CSETF-ENUMERATION-TYPE-NAME");
        $sym17$ENUMERATION_CARDINALITY = SubLObjectFactory.makeSymbol("ENUMERATION-CARDINALITY");
        $sym18$_CSETF_ENUMERATION_CARDINALITY = SubLObjectFactory.makeSymbol("_CSETF-ENUMERATION-CARDINALITY");
        $sym19$ENUMERATION_VALUES_VECTOR = SubLObjectFactory.makeSymbol("ENUMERATION-VALUES-VECTOR");
        $sym20$_CSETF_ENUMERATION_VALUES_VECTOR = SubLObjectFactory.makeSymbol("_CSETF-ENUMERATION-VALUES-VECTOR");
        $kw21$TYPE_NAME = SubLObjectFactory.makeKeyword("TYPE-NAME");
        $kw22$CARDINALITY = SubLObjectFactory.makeKeyword("CARDINALITY");
        $kw23$VALUES_VECTOR = SubLObjectFactory.makeKeyword("VALUES-VECTOR");
        $str24$Invalid_slot__S_for_construction_ = SubLObjectFactory.makeString("Invalid slot ~S for construction function");
        $kw25$BEGIN = SubLObjectFactory.makeKeyword("BEGIN");
        $sym26$MAKE_ENUMERATION = SubLObjectFactory.makeSymbol("MAKE-ENUMERATION");
        $kw27$SLOT = SubLObjectFactory.makeKeyword("SLOT");
        $kw28$END = SubLObjectFactory.makeKeyword("END");
        $sym29$VISIT_DEFSTRUCT_OBJECT_ENUMERATION_METHOD = SubLObjectFactory.makeSymbol("VISIT-DEFSTRUCT-OBJECT-ENUMERATION-METHOD");
        $str30$___S_ = SubLObjectFactory.makeString("#<~S:");
        $str31$__S = SubLObjectFactory.makeString(" ~S");
        $str32$_ = SubLObjectFactory.makeString(">");
        $list33 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ENUMERATION"), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("FORMS"));
        $str34$enumeration = SubLObjectFactory.makeString("enumeration");
        $sym35$ENUMERATION_ = SubLObjectFactory.makeSymbol("ENUMERATION-");
        $list36 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("VAR"), (SubLObject)SubLObjectFactory.makeSymbol("ENUMERATION")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("FORMS"));
        $str37$cardinality = SubLObjectFactory.makeString("cardinality");
        $str38$vector = SubLObjectFactory.makeString("vector");
        $str39$index = SubLObjectFactory.makeString("index");
        $sym40$CLET = SubLObjectFactory.makeSymbol("CLET");
        $sym41$CDOTIMES = SubLObjectFactory.makeSymbol("CDOTIMES");
        $sym42$CSETQ = SubLObjectFactory.makeSymbol("CSETQ");
        $sym43$AREF = SubLObjectFactory.makeSymbol("AREF");
        $str44$DEFINE_ENUMERATION___S_is_not_a_v = SubLObjectFactory.makeString("DEFINE-ENUMERATION: ~S is not a valid enum-name.  A non null symbol was expected.");
        $str45$DEFINE_ENUMERATION___S_is_not_a_v = SubLObjectFactory.makeString("DEFINE-ENUMERATION: ~S is not a valid enumeration list.  An enumeration list must be a list.");
        $str46$DEFINE_ENUMERATION___S_is_not_a_v = SubLObjectFactory.makeString("DEFINE-ENUMERATION: ~S is not a valid enumeration list.  It contains redundent elements.");
        $str47$_VALID__SS_ = SubLObjectFactory.makeString("*VALID-~SS*");
        $sym48$DEFCONSTANT_PRIVATE = SubLObjectFactory.makeSymbol("DEFCONSTANT-PRIVATE");
        $sym49$QUOTE = SubLObjectFactory.makeSymbol("QUOTE");
        $str50$Enumerated_values_of_type__S_ = SubLObjectFactory.makeString("Enumerated values of type ~S.");
        $kw51$API = SubLObjectFactory.makeKeyword("API");
        $sym52$DEFINE_API = SubLObjectFactory.makeSymbol("DEFINE-API");
        $kw53$PUBLIC = SubLObjectFactory.makeKeyword("PUBLIC");
        $sym54$DEFINE_PUBLIC = SubLObjectFactory.makeSymbol("DEFINE-PUBLIC");
        $kw55$PROTECTED = SubLObjectFactory.makeKeyword("PROTECTED");
        $sym56$DEFINE_PROTECTED = SubLObjectFactory.makeSymbol("DEFINE-PROTECTED");
        $kw57$PRIVATE = SubLObjectFactory.makeKeyword("PRIVATE");
        $sym58$DEFINE_PRIVATE = SubLObjectFactory.makeSymbol("DEFINE-PRIVATE");
        $sym59$DEFINE = SubLObjectFactory.makeSymbol("DEFINE");
        $str60$Returns_a_list_of_all_valid_membe = SubLObjectFactory.makeString("Returns a list of all valid members of the ~S enumeration.");
        $str61$VALID__SS = SubLObjectFactory.makeString("VALID-~SS");
        $list62 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("RETURN-TYPES"), (SubLObject)SubLObjectFactory.makeSymbol("LISTP"))));
        $sym63$RET = SubLObjectFactory.makeSymbol("RET");
        $str64$Return_T_iff_OBJECT_is_a_member_o = SubLObjectFactory.makeString("Return T iff OBJECT is a member of the ~S enumeration.");
        $str65$_S_P = SubLObjectFactory.makeString("~S-P");
        $list66 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("RETURN-TYPES"), (SubLObject)SubLObjectFactory.makeSymbol("BOOLEANP"))));
        $list67 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OBJECT"));
        $sym68$FIF = SubLObjectFactory.makeSymbol("FIF");
        $sym69$MEMBER = SubLObjectFactory.makeSymbol("MEMBER");
        $sym70$OBJECT = SubLObjectFactory.makeSymbol("OBJECT");
        $list71 = ConsesLow.list((SubLObject)enumerations.T, (SubLObject)enumerations.NIL);
        $str72$Maps_a_member_of_the__S_enumerati = SubLObjectFactory.makeString("Maps a member of the ~S enumeration to an integer encoding.");
        $str73$ENCODE__S = SubLObjectFactory.makeString("ENCODE-~S");
        $str74$pos = SubLObjectFactory.makeString("pos");
        $list75 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("RETURN-TYPES"), (SubLObject)SubLObjectFactory.makeSymbol("INTEGERP"))));
        $list76 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("VALUE"));
        $sym77$POSITION = SubLObjectFactory.makeSymbol("POSITION");
        $sym78$VALUE = SubLObjectFactory.makeSymbol("VALUE");
        $sym79$MUST = SubLObjectFactory.makeSymbol("MUST");
        $str80$_S___S_is_not_a_member_of_the__S_ = SubLObjectFactory.makeString("~S: ~S is not a member of the ~S enumeration.");
        $str81$Maps_an_encoded_value_to_a_member = SubLObjectFactory.makeString("Maps an encoded value to a member of the ~S enumeration.");
        $str82$DECODE__S = SubLObjectFactory.makeString("DECODE-~S");
        $str83$element = SubLObjectFactory.makeString("element");
        $kw84$RETURN_TYPES = SubLObjectFactory.makeKeyword("RETURN-TYPES");
        $sym85$NTH = SubLObjectFactory.makeSymbol("NTH");
        $str86$_S___S_is_not_a_valid_encoding_of = SubLObjectFactory.makeString("~S: ~S is not a valid encoding of the ~S enumeration.");
        $str87$Provides_a_LESSP_predicate_for_me = SubLObjectFactory.makeString("Provides a LESSP predicate for members of the ~S enumeration.");
        $str88$_S_LESS_P = SubLObjectFactory.makeString("~S-LESS-P");
        $list89 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("VALUE1"), (SubLObject)SubLObjectFactory.makeSymbol("VALUE2"));
        $list90 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("VALUE1"));
        $str91$_S___S_was_expected_to_be_a_membe = SubLObjectFactory.makeString("~S: ~S was expected to be a member of the enumeration ~S.");
        $sym92$VALUE1 = SubLObjectFactory.makeSymbol("VALUE1");
        $list93 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("VALUE2"));
        $sym94$VALUE2 = SubLObjectFactory.makeSymbol("VALUE2");
        $sym95$CDOLIST = SubLObjectFactory.makeSymbol("CDOLIST");
        $list96 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PCOND"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)enumerations.EQ, (SubLObject)SubLObjectFactory.makeSymbol("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("VALUE1")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CNOT"), (SubLObject)ConsesLow.list((SubLObject)enumerations.EQ, (SubLObject)SubLObjectFactory.makeSymbol("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("VALUE2"))))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)enumerations.EQ, (SubLObject)SubLObjectFactory.makeSymbol("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("VALUE2")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)enumerations.NIL))));
        $list97 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)enumerations.NIL));
        $str98$Provides_a_GREATERP_predicate_for = SubLObjectFactory.makeString("Provides a GREATERP predicate for members of the ~S enumeration.");
        $str99$_S_GREATER_P = SubLObjectFactory.makeString("~S-GREATER-P");
        $list100 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PCOND"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)enumerations.EQ, (SubLObject)SubLObjectFactory.makeSymbol("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("VALUE2")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CNOT"), (SubLObject)ConsesLow.list((SubLObject)enumerations.EQ, (SubLObject)SubLObjectFactory.makeSymbol("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("VALUE1"))))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)enumerations.EQ, (SubLObject)SubLObjectFactory.makeSymbol("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("VALUE1")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)enumerations.NIL))));
        $sym101$PROGN = SubLObjectFactory.makeSymbol("PROGN");
        $sym102$ENUMERATIONS_INCORPORATE_DEFINITION = SubLObjectFactory.makeSymbol("ENUMERATIONS-INCORPORATE-DEFINITION");
        $list103 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ENUM-NAME"), (SubLObject)SubLObjectFactory.makeSymbol("VALUES"));
        $str104$ENUMERATE_VALUES___S_is_not_a_val = SubLObjectFactory.makeString("ENUMERATE-VALUES: ~S is not a valid enumeration name.  A non nil symbol was expected.");
        $str105$ENUMERATION_MEMBER_P___S_is_not_a = SubLObjectFactory.makeString("ENUMERATION-MEMBER-P: ~S is not a valid enumeration name.  A non nil symbol was expected.");
        $str106$ENUMERATION_MEMBER_P___S_is_not_k = SubLObjectFactory.makeString("ENUMERATION-MEMBER-P: ~S is not known to be an enumeration.");
        $str107$ENCODE_ENUMERATION___S_is_not_a_v = SubLObjectFactory.makeString("ENCODE-ENUMERATION: ~S is not a valid enumeration name.  A non nil symbol was expected.");
        $str108$ENCODE_ENUMERATION___S_is_not_kno = SubLObjectFactory.makeString("ENCODE-ENUMERATION: ~S is not known to be an enumeration.");
        $str109$ENCODE_ENUMERATION___S_has_no_mem = SubLObjectFactory.makeString("ENCODE-ENUMERATION: ~S has no member values.");
        $str110$ENCODE_ENUMERATION___S_is_not_a_m = SubLObjectFactory.makeString("ENCODE-ENUMERATION: ~S is not a member of the ~S enumeration.");
        $str111$DECODE_ENUMERATION___S_is_not_a_v = SubLObjectFactory.makeString("DECODE-ENUMERATION: ~S is not a valid enumeration name.  A non nil symbol was expected.");
        $str112$DECODE_ENUMERATION___S_is_not_kno = SubLObjectFactory.makeString("DECODE-ENUMERATION: ~S is not known to be an enumeration.");
        $str113$DECODE_ENUMERATION___S_has_no_mem = SubLObjectFactory.makeString("DECODE-ENUMERATION: ~S has no member values.");
        $str114$DECODE_ENUMERATION___S_is_not_a_v = SubLObjectFactory.makeString("DECODE-ENUMERATION: ~S is not a valid encoding for enumeration ~S.");
        $list115 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("VAR"), (SubLObject)SubLObjectFactory.makeSymbol("ENUMERATION-NAME")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("FORMS"));
        $sym116$ENUMERATIONS_RETRIEVE_ENUMERATION = SubLObjectFactory.makeSymbol("ENUMERATIONS-RETRIEVE-ENUMERATION");
        $str117$DO_ENUMERATION___S_does_not_evalu = SubLObjectFactory.makeString("DO-ENUMERATION: ~S does not evaluate to an enumeration.");
        $str118$ENUMERATION_LESS_P___S_is_not_a_v = SubLObjectFactory.makeString("ENUMERATION-LESS-P: ~S is not a valid enumeration name.  A non nil symbol was expected.");
        $str119$ENUMERATION_LESS_P___S_is_not_kno = SubLObjectFactory.makeString("ENUMERATION-LESS-P: ~S is not known to be an enumeration.");
        $str120$ENUMERATION_LESS_P___S_has_no_val = SubLObjectFactory.makeString("ENUMERATION-LESS-P: ~S has no values.");
        $str121$ENUMERATION_GREATER_P___S_is_not_ = SubLObjectFactory.makeString("ENUMERATION-GREATER-P: ~S is not a valid enumeration name.  A non nil symbol was expected.");
        $str122$ENUMERATION_GREATER_P___S_is_not_ = SubLObjectFactory.makeString("ENUMERATION-GREATER-P: ~S is not known to be an enumeration.");
        $str123$ENUMERATION_GREATER_P___S_has_no_ = SubLObjectFactory.makeString("ENUMERATION-GREATER-P: ~S has no values.");
    }
    
    public static final class $enumeration_native extends SubLStructNative
    {
        public SubLObject $type_name;
        public SubLObject $cardinality;
        public SubLObject $values_vector;
        private static final SubLStructDeclNative structDecl;
        
        public $enumeration_native() {
            this.$type_name = (SubLObject)CommonSymbols.NIL;
            this.$cardinality = (SubLObject)CommonSymbols.NIL;
            this.$values_vector = (SubLObject)CommonSymbols.NIL;
        }
        
        @Override
		public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$enumeration_native.structDecl;
        }
        
        @Override
		public SubLObject getField2() {
            return this.$type_name;
        }
        
        @Override
		public SubLObject getField3() {
            return this.$cardinality;
        }
        
        @Override
		public SubLObject getField4() {
            return this.$values_vector;
        }
        
        @Override
		public SubLObject setField2(final SubLObject value) {
            return this.$type_name = value;
        }
        
        @Override
		public SubLObject setField3(final SubLObject value) {
            return this.$cardinality = value;
        }
        
        @Override
		public SubLObject setField4(final SubLObject value) {
            return this.$values_vector = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$enumeration_native.class, enumerations.$sym6$ENUMERATION, enumerations.$sym7$ENUMERATION_P, enumerations.$list8, enumerations.$list9, new String[] { "$type_name", "$cardinality", "$values_vector" }, enumerations.$list10, enumerations.$list11, enumerations.$sym12$PRINT_ENUMERATION);
        }
    }
    
    public static final class $enumeration_p$UnaryFunction extends UnaryFunction
    {
        public $enumeration_p$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("ENUMERATION-P"));
        }
        
        @Override
		public SubLObject processItem(final SubLObject arg1) {
            return enumerations.enumeration_p(arg1);
        }
    }
}

/*

	Total time: 280 ms
	
*/