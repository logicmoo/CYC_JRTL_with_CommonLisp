package com.cyc.cycjava.cycl;


import com.cyc.cycjava.cycl.enumerations;
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
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;
import java.util.Iterator;
import java.util.Map;
import java.util.function.Supplier;
import org.armedbear.lisp.Lisp;

import static com.cyc.cycjava.cycl.enumerations.*;
import static com.cyc.cycjava.cycl.subl_macro_promotions.*;
import static com.cyc.cycjava.cycl.utilities_macros.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.EQ;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.NIL;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.ONE_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.T;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.THREE_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.UNPROVIDED;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.ZERO_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Packages.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.$print_object_method_table$;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.*;
import static com.cyc.tool.subl.util.SubLFiles.*;
import static com.cyc.tool.subl.util.SubLTranslatedFile.*;


public final class enumerations extends SubLTranslatedFile {
    public static final SubLFile me = new enumerations();

    public static final String myName = "com.cyc.cycjava.cycl.enumerations";

    public static final String myFingerPrint = "283010053f94f53ce41c5c5b1fd0593362e8fd27bf73645a83f8279757b2cae3";

    // defconstant
    private static final SubLSymbol $enumerations_initial_hashtable_size$ = makeSymbol("*ENUMERATIONS-INITIAL-HASHTABLE-SIZE*");

    // defparameter
    private static final SubLSymbol $enumerations_table_update_lock$ = makeSymbol("*ENUMERATIONS-TABLE-UPDATE-LOCK*");



    // defconstant
    private static final SubLSymbol $enum_values_initial_hashtable_size$ = makeSymbol("*ENUM-VALUES-INITIAL-HASHTABLE-SIZE*");

    // defparameter
    private static final SubLSymbol $enum_values_table_update_lock$ = makeSymbol("*ENUM-VALUES-TABLE-UPDATE-LOCK*");



    // defconstant
    public static final SubLSymbol $dtp_enumeration$ = makeSymbol("*DTP-ENUMERATION*");



    public static final SubLString $$$Enumerations_Table_Lock = makeString("Enumerations Table Lock");

    public static final SubLSymbol $enumerations_table$ = makeSymbol("*ENUMERATIONS-TABLE*");

    private static final SubLInteger $int$200 = makeInteger(200);

    public static final SubLString $str4$Enum_Values_Table_Lock = makeString("Enum-Values Table Lock");

    public static final SubLSymbol $enum_values_table$ = makeSymbol("*ENUM-VALUES-TABLE*");

    public static final SubLSymbol ENUMERATION = makeSymbol("ENUMERATION");

    public static final SubLSymbol ENUMERATION_P = makeSymbol("ENUMERATION-P");

    public static final SubLList $list8 = list(makeSymbol("TYPE-NAME"), makeSymbol("CARDINALITY"), makeSymbol("VALUES-VECTOR"));

    public static final SubLList $list9 = list(makeKeyword("TYPE-NAME"), makeKeyword("CARDINALITY"), makeKeyword("VALUES-VECTOR"));

    public static final SubLList $list10 = list(makeSymbol("ENUMERATION-TYPE-NAME"), makeSymbol("ENUMERATION-CARDINALITY"), makeSymbol("ENUMERATION-VALUES-VECTOR"));

    public static final SubLList $list11 = list(makeSymbol("_CSETF-ENUMERATION-TYPE-NAME"), makeSymbol("_CSETF-ENUMERATION-CARDINALITY"), makeSymbol("_CSETF-ENUMERATION-VALUES-VECTOR"));

    public static final SubLSymbol PRINT_ENUMERATION = makeSymbol("PRINT-ENUMERATION");

    public static final SubLSymbol ENUMERATION_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("ENUMERATION-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLList $list14 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("ENUMERATION-P"));

    private static final SubLSymbol ENUMERATION_TYPE_NAME = makeSymbol("ENUMERATION-TYPE-NAME");

    private static final SubLSymbol _CSETF_ENUMERATION_TYPE_NAME = makeSymbol("_CSETF-ENUMERATION-TYPE-NAME");

    private static final SubLSymbol ENUMERATION_CARDINALITY = makeSymbol("ENUMERATION-CARDINALITY");

    private static final SubLSymbol _CSETF_ENUMERATION_CARDINALITY = makeSymbol("_CSETF-ENUMERATION-CARDINALITY");

    private static final SubLSymbol ENUMERATION_VALUES_VECTOR = makeSymbol("ENUMERATION-VALUES-VECTOR");

    private static final SubLSymbol _CSETF_ENUMERATION_VALUES_VECTOR = makeSymbol("_CSETF-ENUMERATION-VALUES-VECTOR");







    private static final SubLString $str24$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");



    private static final SubLSymbol MAKE_ENUMERATION = makeSymbol("MAKE-ENUMERATION");





    private static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_ENUMERATION_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-ENUMERATION-METHOD");

    private static final SubLString $str30$___S_ = makeString("#<~S:");

    private static final SubLString $str31$__S = makeString(" ~S");

    private static final SubLString $str32$_ = makeString(">");

    private static final SubLList $list33 = list(makeSymbol("ENUMERATION"), makeSymbol("&BODY"), makeSymbol("FORMS"));

    private static final SubLString $$$enumeration = makeString("enumeration");

    private static final SubLSymbol ENUMERATION_ = makeSymbol("ENUMERATION-");

    private static final SubLList $list36 = list(list(makeSymbol("VAR"), makeSymbol("ENUMERATION")), makeSymbol("&BODY"), makeSymbol("FORMS"));

    private static final SubLString $$$cardinality = makeString("cardinality");

    private static final SubLString $$$vector = makeString("vector");

    private static final SubLString $$$index = makeString("index");









    private static final SubLString $str44$DEFINE_ENUMERATION___S_is_not_a_v = makeString("DEFINE-ENUMERATION: ~S is not a valid enum-name.  A non null symbol was expected.");

    private static final SubLString $str45$DEFINE_ENUMERATION___S_is_not_a_v = makeString("DEFINE-ENUMERATION: ~S is not a valid enumeration list.  An enumeration list must be a list.");

    private static final SubLString $str46$DEFINE_ENUMERATION___S_is_not_a_v = makeString("DEFINE-ENUMERATION: ~S is not a valid enumeration list.  It contains redundent elements.");

    private static final SubLString $str47$_VALID__SS_ = makeString("*VALID-~SS*");

    private static final SubLSymbol DEFCONSTANT_PRIVATE = makeSymbol("DEFCONSTANT-PRIVATE");



    private static final SubLString $str50$Enumerated_values_of_type__S_ = makeString("Enumerated values of type ~S.");



    private static final SubLSymbol DEFINE_API = makeSymbol("DEFINE-API");















    private static final SubLString $str60$Returns_a_list_of_all_valid_membe = makeString("Returns a list of all valid members of the ~S enumeration.");

    private static final SubLString $str61$VALID__SS = makeString("VALID-~SS");

    private static final SubLList $list62 = list(list(list(makeKeyword("RETURN-TYPES"), makeSymbol("LISTP"))));



    private static final SubLString $str64$Return_T_iff_OBJECT_is_a_member_o = makeString("Return T iff OBJECT is a member of the ~S enumeration.");

    private static final SubLString $str65$_S_P = makeString("~S-P");

    private static final SubLList $list66 = list(list(list(makeKeyword("RETURN-TYPES"), makeSymbol("BOOLEANP"))));

    private static final SubLList $list67 = list(makeSymbol("OBJECT"));







    private static final SubLList $list71 = list(T, NIL);

    private static final SubLString $str72$Maps_a_member_of_the__S_enumerati = makeString("Maps a member of the ~S enumeration to an integer encoding.");

    private static final SubLString $str73$ENCODE__S = makeString("ENCODE-~S");

    private static final SubLString $$$pos = makeString("pos");

    private static final SubLList $list75 = list(list(list(makeKeyword("RETURN-TYPES"), makeSymbol("INTEGERP"))));

    private static final SubLList $list76 = list(makeSymbol("VALUE"));







    private static final SubLString $str80$_S___S_is_not_a_member_of_the__S_ = makeString("~S: ~S is not a member of the ~S enumeration.");

    private static final SubLString $str81$Maps_an_encoded_value_to_a_member = makeString("Maps an encoded value to a member of the ~S enumeration.");

    private static final SubLString $str82$DECODE__S = makeString("DECODE-~S");

    private static final SubLString $$$element = makeString("element");





    private static final SubLString $str86$_S___S_is_not_a_valid_encoding_of = makeString("~S: ~S is not a valid encoding of the ~S enumeration.");

    private static final SubLString $str87$Provides_a_LESSP_predicate_for_me = makeString("Provides a LESSP predicate for members of the ~S enumeration.");

    private static final SubLString $str88$_S_LESS_P = makeString("~S-LESS-P");

    private static final SubLList $list89 = list(makeSymbol("VALUE1"), makeSymbol("VALUE2"));

    public static final SubLList $list90 = list(makeSymbol("VALUE1"));

    private static final SubLString $str91$_S___S_was_expected_to_be_a_membe = makeString("~S: ~S was expected to be a member of the enumeration ~S.");



    private static final SubLList $list93 = list(makeSymbol("VALUE2"));





    private static final SubLList $list96 = list(list(makeSymbol("PCOND"), list(list(EQ, makeSymbol("VALUE"), makeSymbol("VALUE1")), list(makeSymbol("RET"), list(makeSymbol("CNOT"), list(EQ, makeSymbol("VALUE"), makeSymbol("VALUE2"))))), list(list(EQ, makeSymbol("VALUE"), makeSymbol("VALUE2")), list(makeSymbol("RET"), NIL))));

    public static final SubLList $list97 = list(list(makeSymbol("RET"), NIL));

    private static final SubLString $str98$Provides_a_GREATERP_predicate_for = makeString("Provides a GREATERP predicate for members of the ~S enumeration.");

    private static final SubLString $str99$_S_GREATER_P = makeString("~S-GREATER-P");

    private static final SubLList $list100 = list(list(makeSymbol("PCOND"), list(list(EQ, makeSymbol("VALUE"), makeSymbol("VALUE2")), list(makeSymbol("RET"), list(makeSymbol("CNOT"), list(EQ, makeSymbol("VALUE"), makeSymbol("VALUE1"))))), list(list(EQ, makeSymbol("VALUE"), makeSymbol("VALUE1")), list(makeSymbol("RET"), NIL))));



    private static final SubLSymbol ENUMERATIONS_INCORPORATE_DEFINITION = makeSymbol("ENUMERATIONS-INCORPORATE-DEFINITION");

    private static final SubLList $list103 = list(makeSymbol("ENUM-NAME"), makeSymbol("VALUES"));

    private static final SubLString $str104$ENUMERATE_VALUES___S_is_not_a_val = makeString("ENUMERATE-VALUES: ~S is not a valid enumeration name.  A non nil symbol was expected.");

    private static final SubLString $str105$ENUMERATION_MEMBER_P___S_is_not_a = makeString("ENUMERATION-MEMBER-P: ~S is not a valid enumeration name.  A non nil symbol was expected.");

    private static final SubLString $str106$ENUMERATION_MEMBER_P___S_is_not_k = makeString("ENUMERATION-MEMBER-P: ~S is not known to be an enumeration.");

    private static final SubLString $str107$ENCODE_ENUMERATION___S_is_not_a_v = makeString("ENCODE-ENUMERATION: ~S is not a valid enumeration name.  A non nil symbol was expected.");

    private static final SubLString $str108$ENCODE_ENUMERATION___S_is_not_kno = makeString("ENCODE-ENUMERATION: ~S is not known to be an enumeration.");

    private static final SubLString $str109$ENCODE_ENUMERATION___S_has_no_mem = makeString("ENCODE-ENUMERATION: ~S has no member values.");

    private static final SubLString $str110$ENCODE_ENUMERATION___S_is_not_a_m = makeString("ENCODE-ENUMERATION: ~S is not a member of the ~S enumeration.");

    private static final SubLString $str111$DECODE_ENUMERATION___S_is_not_a_v = makeString("DECODE-ENUMERATION: ~S is not a valid enumeration name.  A non nil symbol was expected.");

    private static final SubLString $str112$DECODE_ENUMERATION___S_is_not_kno = makeString("DECODE-ENUMERATION: ~S is not known to be an enumeration.");

    private static final SubLString $str113$DECODE_ENUMERATION___S_has_no_mem = makeString("DECODE-ENUMERATION: ~S has no member values.");

    private static final SubLString $str114$DECODE_ENUMERATION___S_is_not_a_v = makeString("DECODE-ENUMERATION: ~S is not a valid encoding for enumeration ~S.");

    private static final SubLList $list115 = list(list(makeSymbol("VAR"), makeSymbol("ENUMERATION-NAME")), makeSymbol("&BODY"), makeSymbol("FORMS"));

    private static final SubLSymbol ENUMERATIONS_RETRIEVE_ENUMERATION = makeSymbol("ENUMERATIONS-RETRIEVE-ENUMERATION");

    private static final SubLString $str117$DO_ENUMERATION___S_does_not_evalu = makeString("DO-ENUMERATION: ~S does not evaluate to an enumeration.");

    private static final SubLString $str118$ENUMERATION_LESS_P___S_is_not_a_v = makeString("ENUMERATION-LESS-P: ~S is not a valid enumeration name.  A non nil symbol was expected.");

    private static final SubLString $str119$ENUMERATION_LESS_P___S_is_not_kno = makeString("ENUMERATION-LESS-P: ~S is not known to be an enumeration.");

    private static final SubLString $str120$ENUMERATION_LESS_P___S_has_no_val = makeString("ENUMERATION-LESS-P: ~S has no values.");

    private static final SubLString $str121$ENUMERATION_GREATER_P___S_is_not_ = makeString("ENUMERATION-GREATER-P: ~S is not a valid enumeration name.  A non nil symbol was expected.");

    private static final SubLString $str122$ENUMERATION_GREATER_P___S_is_not_ = makeString("ENUMERATION-GREATER-P: ~S is not known to be an enumeration.");

    private static final SubLString $str123$ENUMERATION_GREATER_P___S_has_no_ = makeString("ENUMERATION-GREATER-P: ~S has no values.");

    public static SubLObject enumeration_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        print_enumeration(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject enumeration_p(final SubLObject v_object) {
        return v_object.getClass() == enumerations.$enumeration_native.class ? T : NIL;
    }

    public static SubLObject enumeration_type_name(final SubLObject v_object) {
        assert NIL != enumeration_p(v_object) : "enumerations.enumeration_p(v_object) " + "CommonSymbols.NIL != enumerations.enumeration_p(v_object) " + v_object;
        return v_object.getField2();
    }

    public static SubLObject enumeration_cardinality(final SubLObject v_object) {
        assert NIL != enumeration_p(v_object) : "enumerations.enumeration_p(v_object) " + "CommonSymbols.NIL != enumerations.enumeration_p(v_object) " + v_object;
        return v_object.getField3();
    }

    public static SubLObject enumeration_values_vector(final SubLObject v_object) {
        assert NIL != enumeration_p(v_object) : "enumerations.enumeration_p(v_object) " + "CommonSymbols.NIL != enumerations.enumeration_p(v_object) " + v_object;
        return v_object.getField4();
    }

    public static SubLObject _csetf_enumeration_type_name(final SubLObject v_object, final SubLObject value) {
        assert NIL != enumeration_p(v_object) : "enumerations.enumeration_p(v_object) " + "CommonSymbols.NIL != enumerations.enumeration_p(v_object) " + v_object;
        return v_object.setField2(value);
    }

    public static SubLObject _csetf_enumeration_cardinality(final SubLObject v_object, final SubLObject value) {
        assert NIL != enumeration_p(v_object) : "enumerations.enumeration_p(v_object) " + "CommonSymbols.NIL != enumerations.enumeration_p(v_object) " + v_object;
        return v_object.setField3(value);
    }

    public static SubLObject _csetf_enumeration_values_vector(final SubLObject v_object, final SubLObject value) {
        assert NIL != enumeration_p(v_object) : "enumerations.enumeration_p(v_object) " + "CommonSymbols.NIL != enumerations.enumeration_p(v_object) " + v_object;
        return v_object.setField4(value);
    }

    public static SubLObject make_enumeration(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new enumerations.$enumeration_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
            current_arg = next.first();
            current_value = cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql($TYPE_NAME)) {
                _csetf_enumeration_type_name(v_new, current_value);
            } else
                if (pcase_var.eql($CARDINALITY)) {
                    _csetf_enumeration_cardinality(v_new, current_value);
                } else
                    if (pcase_var.eql($VALUES_VECTOR)) {
                        _csetf_enumeration_values_vector(v_new, current_value);
                    } else {
                        Errors.error($str24$Invalid_slot__S_for_construction_, current_arg);
                    }


        }
        return v_new;
    }

    public static SubLObject visit_defstruct_enumeration(final SubLObject obj, final SubLObject visitor_fn) {
        funcall(visitor_fn, obj, $BEGIN, MAKE_ENUMERATION, THREE_INTEGER);
        funcall(visitor_fn, obj, $SLOT, $TYPE_NAME, enumeration_type_name(obj));
        funcall(visitor_fn, obj, $SLOT, $CARDINALITY, enumeration_cardinality(obj));
        funcall(visitor_fn, obj, $SLOT, $VALUES_VECTOR, enumeration_values_vector(obj));
        funcall(visitor_fn, obj, $END, MAKE_ENUMERATION, THREE_INTEGER);
        return obj;
    }

    public static SubLObject visit_defstruct_object_enumeration_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_enumeration(obj, visitor_fn);
    }

    public static SubLObject print_enumeration(final SubLObject v_object, final SubLObject stream, final SubLObject depth) {
        format(stream, $str30$___S_, enumeration_type_name(v_object));
        if (NIL != enumeration_values_vector(v_object)) {
            SubLObject cdotimes_end_var;
            SubLObject index;
            for (cdotimes_end_var = enumeration_cardinality(v_object), index = NIL, index = ZERO_INTEGER; index.numL(cdotimes_end_var); index = add(index, ONE_INTEGER)) {
                format(stream, $str31$__S, aref(enumeration_values_vector(v_object), index));
            }
        }
        format(stream, $str32$_);
        return v_object;
    }

    public static SubLObject with_enumeration_read_only(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject enumeration = NIL;
        destructuring_bind_must_consp(current, datum, $list33);
        enumeration = current.first();
        final SubLObject forms;
        current = forms = current.rest();
        final SubLObject enumeration_var = make_symbol($$$enumeration);
        return generate_instance_variable_bindings_for_structure_slots(enumeration_var, enumeration, ENUMERATION_, $list8, forms, UNPROVIDED);
    }

    public static SubLObject with_enumeration_read_write(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject enumeration = NIL;
        destructuring_bind_must_consp(current, datum, $list33);
        enumeration = current.first();
        final SubLObject forms;
        current = forms = current.rest();
        final SubLObject enumeration_var = make_symbol($$$enumeration);
        return generate_instance_variable_bindings_for_structure_slots(enumeration_var, enumeration, ENUMERATION_, $list8, forms, NIL);
    }

    public static SubLObject do_enumeration_internal(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list36);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject var = NIL;
        SubLObject enumeration = NIL;
        destructuring_bind_must_consp(current, datum, $list36);
        var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list36);
        enumeration = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject forms;
            current = forms = temp;
            final SubLObject enumeration_var = make_symbol($$$enumeration);
            final SubLObject cardinality_var = make_symbol($$$cardinality);
            final SubLObject vector_var = make_symbol($$$vector);
            final SubLObject index_var = make_symbol($$$index);
            return list(CLET, list(list(enumeration_var, enumeration), list(cardinality_var, list(ENUMERATION_CARDINALITY, enumeration_var)), list(vector_var, list(ENUMERATION_VALUES_VECTOR, enumeration_var)), var), listS(CDOTIMES, list(index_var, cardinality_var), list(CSETQ, var, list(AREF, vector_var, index_var)), forms));
        }
        cdestructuring_bind_error(datum, $list36);
        return NIL;
    }

    public static SubLObject enumerations_retrieve_enumeration(final SubLObject enumeration_name) {
        if (enumeration_name.isSymbol()) {
            return gethash(enumeration_name, $enumerations_table$.getGlobalValue(), UNPROVIDED);
        }
        return NIL;
    }

    public static SubLObject enumeration_intern_enumeration(final SubLObject enumeration_name, final SubLObject enumeration) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject release = NIL;
        try {
            release = seize_lock($enumerations_table_update_lock$.getDynamicValue(thread));
            if (enumeration_name.isSymbol() && (NIL != enumeration_p(enumeration))) {
                sethash(enumeration_name, $enumerations_table$.getGlobalValue(), enumeration);
                final SubLObject cardinality = enumeration_cardinality(enumeration);
                final SubLObject vector = enumeration_values_vector(enumeration);
                SubLObject value = NIL;
                SubLObject index;
                for (index = NIL, index = ZERO_INTEGER; index.numL(cardinality); index = add(index, ONE_INTEGER)) {
                    value = aref(vector, index);
                    enumerations_intern_enumeration_by_value(value, enumeration);
                }
            }
        } finally {
            if (NIL != release) {
                release_lock($enumerations_table_update_lock$.getDynamicValue(thread));
            }
        }
        return enumeration;
    }

    public static SubLObject get_all_enumerated_types() {
        SubLObject enumerated_types = NIL;
        SubLObject key = NIL;
        SubLObject value = NIL;
        final Iterator cdohash_iterator = getEntrySetIterator($enumerations_table$.getGlobalValue());
        try {
            while (iteratorHasNext(cdohash_iterator)) {
                final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                key = getEntryKey(cdohash_entry);
                value = getEntryValue(cdohash_entry);
                enumerated_types = cons(key, enumerated_types);
            } 
        } finally {
            releaseEntrySetIterator(cdohash_iterator);
        }
        return nreverse(enumerated_types);
    }

    public static SubLObject enumerations_delete_enumeration(final SubLObject enumeration_name) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject release = NIL;
        try {
            release = seize_lock($enumerations_table_update_lock$.getDynamicValue(thread));
            if (enumeration_name.isSymbol()) {
                final SubLObject enumeration = gethash(enumeration_name, $enum_values_table$.getGlobalValue(), UNPROVIDED);
                if (NIL != enumeration) {
                    final SubLObject enumeration_$2 = enumeration;
                    final SubLObject cardinality = enumeration_cardinality(enumeration_$2);
                    final SubLObject vector = enumeration_values_vector(enumeration_$2);
                    SubLObject value = NIL;
                    SubLObject index;
                    for (index = NIL, index = ZERO_INTEGER; index.numL(cardinality); index = add(index, ONE_INTEGER)) {
                        value = aref(vector, index);
                        enumerations_delete_enumeration_by_value(value, enumeration);
                    }
                }
                remhash(enumeration_name, $enumerations_table$.getGlobalValue());
            }
        } finally {
            if (NIL != release) {
                release_lock($enumerations_table_update_lock$.getDynamicValue(thread));
            }
        }
        return NIL;
    }

    public static SubLObject enumerations_retrieve_enumerations_by_value(final SubLObject enum_value) {
        return gethash(enum_value, $enum_values_table$.getGlobalValue(), UNPROVIDED);
    }

    public static SubLObject enumerations_intern_enumeration_by_value(final SubLObject enum_value, final SubLObject enumeration) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != enumeration_p(enumeration)) {
            SubLObject release = NIL;
            try {
                release = seize_lock($enum_values_table_update_lock$.getDynamicValue(thread));
                SubLObject current_enumerations = gethash(enum_value, $enum_values_table$.getGlobalValue(), UNPROVIDED);
                if (NIL == member(enumeration, current_enumerations, UNPROVIDED, UNPROVIDED)) {
                    current_enumerations = cons(enumeration, current_enumerations);
                    sethash(enum_value, $enum_values_table$.getGlobalValue(), current_enumerations);
                }
            } finally {
                if (NIL != release) {
                    release_lock($enum_values_table_update_lock$.getDynamicValue(thread));
                }
            }
            return enumeration;
        }
        return NIL;
    }

    public static SubLObject enumerations_delete_enumeration_by_value(final SubLObject enum_value, final SubLObject enumeration) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != enumeration_p(enumeration)) {
            SubLObject release = NIL;
            try {
                release = seize_lock($enum_values_table_update_lock$.getDynamicValue(thread));
                SubLObject current_enumerations = gethash(enum_value, $enum_values_table$.getGlobalValue(), UNPROVIDED);
                current_enumerations = delete(enumeration, current_enumerations, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                if (NIL != current_enumerations) {
                    sethash(enum_value, $enum_values_table$.getGlobalValue(), current_enumerations);
                } else {
                    remhash(enum_value, $enum_values_table$.getGlobalValue());
                }
            } finally {
                if (NIL != release) {
                    release_lock($enum_values_table_update_lock$.getDynamicValue(thread));
                }
            }
            return enumeration;
        }
        return NIL;
    }

    public static SubLObject enumerations_redundant_elements_p(final SubLObject list) {
        SubLObject sublist;
        for (sublist = NIL, sublist = list; NIL != sublist; sublist = sublist.rest()) {
            if (NIL != member(sublist.first(), sublist.rest(), UNPROVIDED, UNPROVIDED)) {
                return T;
            }
        }
        return NIL;
    }

    public static SubLObject enumerations_check_definition(final SubLObject enum_name, final SubLObject values) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && ((!enum_name.isSymbol()) || (NIL == enum_name))) {
            Errors.error($str44$DEFINE_ENUMERATION___S_is_not_a_v, enum_name);
        }
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (!values.isList())) {
            Errors.error($str45$DEFINE_ENUMERATION___S_is_not_a_v, values);
        }
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL != enumerations_redundant_elements_p(values))) {
            Errors.error($str46$DEFINE_ENUMERATION___S_is_not_a_v, values);
        }
        return T;
    }

    public static SubLObject enumerations_incorporate_definition(final SubLObject enum_name, final SubLObject values) {
        SubLObject enumeration = enumerations_retrieve_enumeration(enum_name);
        if (NIL != enumeration) {
            enumerations_delete_enumeration(enum_name);
        } else {
            enumeration = make_enumeration(UNPROVIDED);
        }
        final SubLObject enumeration_$3 = enumeration;
        SubLObject type_name = enumeration_type_name(enumeration_$3);
        SubLObject cardinality = enumeration_cardinality(enumeration_$3);
        SubLObject values_vector = enumeration_values_vector(enumeration_$3);
        try {
            type_name = enum_name;
            cardinality = length(values);
            if (cardinality.isZero()) {
                values_vector = NIL;
            } else {
                SubLObject index = ZERO_INTEGER;
                values_vector = make_vector(cardinality, UNPROVIDED);
                SubLObject cdolist_list_var = values;
                SubLObject value = NIL;
                value = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    set_aref(values_vector, index, value);
                    index = add(index, ONE_INTEGER);
                    cdolist_list_var = cdolist_list_var.rest();
                    value = cdolist_list_var.first();
                } 
            }
        } finally {
            final SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
            try {
                bind($is_thread_performing_cleanupP$, T);
                final SubLObject _values = getValuesAsVector();
                _csetf_enumeration_type_name(enumeration_$3, type_name);
                _csetf_enumeration_cardinality(enumeration_$3, cardinality);
                _csetf_enumeration_values_vector(enumeration_$3, values_vector);
                restoreValuesFromVector(_values);
            } finally {
                rebind($is_thread_performing_cleanupP$, _prev_bind_0);
            }
        }
        enumeration_intern_enumeration(enum_name, enumeration);
        return enumeration;
    }

    public static SubLObject enumerations_compute_enumeration_constant_name(final SubLObject enum_name) {
        return intern(format(NIL, $str47$_VALID__SS_, enum_name), UNPROVIDED);
    }

    public static SubLObject enumerations_expand_enumeration_constant_declaration(final SubLObject enum_name, final SubLObject values) {
        final SubLObject defining_form = DEFCONSTANT_PRIVATE;
        final SubLObject var_name = enumerations_compute_enumeration_constant_name(enum_name);
        return list(defining_form, var_name, list(QUOTE, copy_list(values)), format(NIL, $str50$Enumerated_values_of_type__S_, enum_name));
    }

    public static SubLObject enumerations_get_defining_form(final SubLObject scope) {
        SubLObject defining_form = NIL;
        if (scope.eql($API)) {
            defining_form = DEFINE_API;
        } else
            if (scope.eql($PUBLIC)) {
                defining_form = DEFINE_PUBLIC;
            } else
                if (scope.eql($PROTECTED)) {
                    defining_form = DEFINE_PROTECTED;
                } else
                    if (scope.eql($PRIVATE)) {
                        defining_form = DEFINE_PRIVATE;
                    } else {
                        defining_form = DEFINE;
                    }



        return defining_form;
    }

    public static SubLObject enumerations_expand_enum_valid_enum_list_function(final SubLObject enum_name, final SubLObject scope) {
        final SubLObject defining_form = enumerations_get_defining_form(scope);
        SubLObject declarations = NIL;
        final SubLObject documentation = format(NIL, $str60$Returns_a_list_of_all_valid_membe, enum_name);
        final SubLObject function_name = intern(format(NIL, $str61$VALID__SS, enum_name), UNPROVIDED);
        final SubLObject constant_name = enumerations_compute_enumeration_constant_name(enum_name);
        if (scope == $API) {
            declarations = $list62;
        }
        return listS(defining_form, function_name, NIL, documentation, append(declarations, list(list(RET, constant_name))));
    }

    public static SubLObject enumerations_expand_predicator_function(final SubLObject enum_name, final SubLObject scope) {
        final SubLObject defining_form = enumerations_get_defining_form(scope);
        SubLObject declarations = NIL;
        final SubLObject documentation = format(NIL, $str64$Return_T_iff_OBJECT_is_a_member_o, enum_name);
        final SubLObject predicator_name = intern(format(NIL, $str65$_S_P, enum_name), UNPROVIDED);
        final SubLObject constant_name = enumerations_compute_enumeration_constant_name(enum_name);
        if (scope == $API) {
            declarations = $list66;
        }
        return listS(defining_form, predicator_name, $list67, documentation, append(declarations, list(list(RET, listS(FIF, list(MEMBER, OBJECT, constant_name), $list71)))));
    }

    public static SubLObject enumerations_expand_encode_function(final SubLObject enum_name, final SubLObject scope) {
        final SubLObject defining_form = enumerations_get_defining_form(scope);
        SubLObject declarations = NIL;
        final SubLObject documentation = format(NIL, $str72$Maps_a_member_of_the__S_enumerati, enum_name);
        final SubLObject function_name = intern(format(NIL, $str73$ENCODE__S, enum_name), UNPROVIDED);
        final SubLObject pos_var = make_symbol($$$pos);
        final SubLObject constant_name = enumerations_compute_enumeration_constant_name(enum_name);
        if (scope == $API) {
            declarations = $list75;
        }
        return listS(defining_form, function_name, $list76, documentation, append(declarations, list(list(CLET, list(list(pos_var, list(POSITION, VALUE, constant_name))), list(MUST, pos_var, $str80$_S___S_is_not_a_member_of_the__S_, list(QUOTE, function_name), VALUE, list(QUOTE, enum_name)), list(RET, pos_var)))));
    }

    public static SubLObject enumerations_expand_decode_function(final SubLObject enum_name, final SubLObject scope) {
        final SubLObject defining_form = enumerations_get_defining_form(scope);
        SubLObject declarations = NIL;
        final SubLObject documentation = format(NIL, $str81$Maps_an_encoded_value_to_a_member, enum_name);
        final SubLObject predicator_name = intern(format(NIL, $str65$_S_P, enum_name), UNPROVIDED);
        final SubLObject function_name = intern(format(NIL, $str82$DECODE__S, enum_name), UNPROVIDED);
        final SubLObject element_var = make_symbol($$$element);
        final SubLObject constant_name = enumerations_compute_enumeration_constant_name(enum_name);
        if (scope == $API) {
            declarations = list(list(list($RETURN_TYPES, predicator_name)));
        }
        return listS(defining_form, function_name, $list76, documentation, append(declarations, list(list(CLET, list(list(element_var, list(NTH, VALUE, constant_name))), list(MUST, element_var, $str86$_S___S_is_not_a_valid_encoding_of, list(QUOTE, function_name), VALUE, list(QUOTE, enum_name)), list(RET, element_var)))));
    }

    public static SubLObject enumerations_expand_lessp_function(final SubLObject enum_name, final SubLObject scope) {
        final SubLObject defining_form = enumerations_get_defining_form(scope);
        SubLObject declarations = NIL;
        final SubLObject documentation = format(NIL, $str87$Provides_a_LESSP_predicate_for_me, enum_name);
        final SubLObject function_name = intern(format(NIL, $str88$_S_LESS_P, enum_name), UNPROVIDED);
        final SubLObject predicator_name = intern(format(NIL, $str65$_S_P, enum_name), UNPROVIDED);
        final SubLObject constant_name = enumerations_compute_enumeration_constant_name(enum_name);
        if (scope == $API) {
            declarations = $list66;
        }
        return listS(defining_form, function_name, $list89, documentation, append(declarations, listS(list(MUST, bq_cons(predicator_name, $list90), $str91$_S___S_was_expected_to_be_a_membe, list(QUOTE, predicator_name), VALUE1, list(QUOTE, enum_name)), list(MUST, bq_cons(predicator_name, $list93), $str91$_S___S_was_expected_to_be_a_membe, list(QUOTE, predicator_name), VALUE2, list(QUOTE, enum_name)), listS(CDOLIST, list(VALUE, constant_name), $list96), $list97)));
    }

    public static SubLObject enumerations_expand_greaterp_function(final SubLObject enum_name, final SubLObject scope) {
        final SubLObject defining_form = enumerations_get_defining_form(scope);
        SubLObject declarations = NIL;
        final SubLObject documentation = format(NIL, $str98$Provides_a_GREATERP_predicate_for, enum_name);
        final SubLObject function_name = intern(format(NIL, $str99$_S_GREATER_P, enum_name), UNPROVIDED);
        final SubLObject predicator_name = intern(format(NIL, $str65$_S_P, enum_name), UNPROVIDED);
        final SubLObject constant_name = enumerations_compute_enumeration_constant_name(enum_name);
        if (scope == $API) {
            declarations = $list66;
        }
        return listS(defining_form, function_name, $list89, documentation, append(declarations, listS(list(MUST, bq_cons(predicator_name, $list90), $str91$_S___S_was_expected_to_be_a_membe, list(QUOTE, predicator_name), VALUE1, list(QUOTE, enum_name)), list(MUST, bq_cons(predicator_name, $list93), $str91$_S___S_was_expected_to_be_a_membe, list(QUOTE, predicator_name), VALUE2, list(QUOTE, enum_name)), listS(CDOLIST, list(VALUE, constant_name), $list100), $list97)));
    }

    public static SubLObject expand_define_enumeration(final SubLObject enum_name, final SubLObject values, final SubLObject scope) {
        enumerations_check_definition(enum_name, values);
        enumerations_incorporate_definition(enum_name, values);
        return list(new SubLObject[]{ PROGN, enumerations_expand_enumeration_constant_declaration(enum_name, values), list(ENUMERATIONS_INCORPORATE_DEFINITION, list(QUOTE, enum_name), list(QUOTE, copy_list(values))), enumerations_expand_enum_valid_enum_list_function(enum_name, scope), enumerations_expand_predicator_function(enum_name, scope), enumerations_expand_encode_function(enum_name, scope), enumerations_expand_decode_function(enum_name, scope), enumerations_expand_lessp_function(enum_name, scope), enumerations_expand_greaterp_function(enum_name, scope) });
    }

    public static SubLObject define_enumeration_public(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject enum_name = NIL;
        SubLObject values = NIL;
        destructuring_bind_must_consp(current, datum, $list103);
        enum_name = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list103);
        values = current.first();
        current = current.rest();
        if (NIL == current) {
            return expand_define_enumeration(enum_name, values, $PUBLIC);
        }
        cdestructuring_bind_error(datum, $list103);
        return NIL;
    }

    public static SubLObject define_enumeration_api(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject enum_name = NIL;
        SubLObject values = NIL;
        destructuring_bind_must_consp(current, datum, $list103);
        enum_name = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list103);
        values = current.first();
        current = current.rest();
        if (NIL == current) {
            return expand_define_enumeration(enum_name, values, $API);
        }
        cdestructuring_bind_error(datum, $list103);
        return NIL;
    }

    public static SubLObject define_enumeration_protected(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject enum_name = NIL;
        SubLObject values = NIL;
        destructuring_bind_must_consp(current, datum, $list103);
        enum_name = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list103);
        values = current.first();
        current = current.rest();
        if (NIL == current) {
            return expand_define_enumeration(enum_name, values, $PROTECTED);
        }
        cdestructuring_bind_error(datum, $list103);
        return NIL;
    }

    public static SubLObject define_enumeration_private(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject enum_name = NIL;
        SubLObject values = NIL;
        destructuring_bind_must_consp(current, datum, $list103);
        enum_name = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list103);
        values = current.first();
        current = current.rest();
        if (NIL == current) {
            return expand_define_enumeration(enum_name, values, $PRIVATE);
        }
        cdestructuring_bind_error(datum, $list103);
        return NIL;
    }

    public static SubLObject enumerate_values(final SubLObject enum_name) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && ((!enum_name.isSymbol()) || (NIL == enum_name))) {
            Errors.error($str104$ENUMERATE_VALUES___S_is_not_a_val, enum_name);
        }
        final SubLObject enumeration = enumerations_retrieve_enumeration(enum_name);
        if (NIL != enumeration) {
            final SubLObject enumeration_$4 = enumeration;
            final SubLObject cardinality = enumeration_cardinality(enumeration_$4);
            final SubLObject values_vector = enumeration_values_vector(enumeration_$4);
            if (NIL != values_vector) {
                SubLObject values = NIL;
                SubLObject index;
                for (index = NIL, index = ZERO_INTEGER; index.numL(cardinality); index = add(index, ONE_INTEGER)) {
                    values = cons(aref(values_vector, index), values);
                }
                return nreverse(values);
            }
        }
        return NIL;
    }

    public static SubLObject enumerate_enumerations(final SubLObject value) {
        final SubLObject v_enumerations = enumerations_retrieve_enumerations_by_value(value);
        SubLObject enumeration_names = NIL;
        final SubLObject list_expression = v_enumerations;
        if (NIL == list_expression) {
            enumeration_names = NIL;
        } else
            if (list_expression.isAtom()) {
                enumeration_names = list(list_expression);
            } else
                if (NIL == list_expression.rest()) {
                    final SubLObject enumeration = list_expression.first();
                    enumeration_names = list(enumeration_type_name(enumeration));
                } else {
                    SubLObject tail_cons = NIL;
                    SubLObject result = NIL;
                    final SubLObject enumeration2 = list_expression.first();
                    enumeration_names = tail_cons = list(enumeration_type_name(enumeration2));
                    SubLObject cdolist_list_var = list_expression.rest();
                    SubLObject enumeration3 = NIL;
                    enumeration3 = cdolist_list_var.first();
                    while (NIL != cdolist_list_var) {
                        result = list(enumeration_type_name(enumeration3));
                        rplacd(tail_cons, result);
                        tail_cons = result;
                        cdolist_list_var = cdolist_list_var.rest();
                        enumeration3 = cdolist_list_var.first();
                    } 
                }


        return enumeration_names;
    }

    public static SubLObject enumeration_member_p(final SubLObject enum_name, final SubLObject value) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && ((!enum_name.isSymbol()) || (NIL == enum_name))) {
            Errors.error($str105$ENUMERATION_MEMBER_P___S_is_not_a, enum_name);
        }
        final SubLObject enumeration = enumerations_retrieve_enumeration(enum_name);
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == enumeration)) {
            Errors.error($str106$ENUMERATION_MEMBER_P___S_is_not_k, enum_name);
        }
        final SubLObject enumeration_$5 = enumeration;
        final SubLObject cardinality = enumeration_cardinality(enumeration_$5);
        final SubLObject vector = enumeration_values_vector(enumeration_$5);
        SubLObject member_value = NIL;
        SubLObject index;
        for (index = NIL, index = ZERO_INTEGER; index.numL(cardinality); index = add(index, ONE_INTEGER)) {
            member_value = aref(vector, index);
            if (member_value.eql(value)) {
                return T;
            }
        }
        return NIL;
    }

    public static SubLObject encode_enumeration(final SubLObject enum_name, final SubLObject value) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && ((!enum_name.isSymbol()) || (NIL == enum_name))) {
            Errors.error($str107$ENCODE_ENUMERATION___S_is_not_a_v, enum_name);
        }
        final SubLObject enumeration = enumerations_retrieve_enumeration(enum_name);
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == enumeration)) {
            Errors.error($str108$ENCODE_ENUMERATION___S_is_not_kno, enum_name);
        }
        final SubLObject enumeration_$6 = enumeration;
        final SubLObject cardinality = enumeration_cardinality(enumeration_$6);
        final SubLObject values_vector = enumeration_values_vector(enumeration_$6);
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == values_vector)) {
            Errors.error($str109$ENCODE_ENUMERATION___S_has_no_mem, enum_name);
        }
        SubLObject index;
        for (index = NIL, index = ZERO_INTEGER; index.numL(cardinality); index = add(index, ONE_INTEGER)) {
            if (aref(values_vector, index).eql(value)) {
                return index;
            }
        }
        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
            Errors.error($str110$ENCODE_ENUMERATION___S_is_not_a_m, value, enum_name);
        }
        return NIL;
    }

    public static SubLObject decode_enumeration(final SubLObject enum_name, final SubLObject value) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && ((!enum_name.isSymbol()) || (NIL == enum_name))) {
            Errors.error($str111$DECODE_ENUMERATION___S_is_not_a_v, enum_name);
        }
        final SubLObject enumeration = enumerations_retrieve_enumeration(enum_name);
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == enumeration)) {
            Errors.error($str112$DECODE_ENUMERATION___S_is_not_kno, enum_name);
        }
        final SubLObject enumeration_$7 = enumeration;
        final SubLObject cardinality = enumeration_cardinality(enumeration_$7);
        final SubLObject values_vector = enumeration_values_vector(enumeration_$7);
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == values_vector)) {
            Errors.error($str113$DECODE_ENUMERATION___S_has_no_mem, enum_name);
        }
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && ((!value.numGE(ZERO_INTEGER)) || (!value.numL(cardinality)))) {
            Errors.error($str114$DECODE_ENUMERATION___S_is_not_a_v, value, enum_name);
        }
        return aref(values_vector, value);
    }

    public static SubLObject do_enumeration(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list115);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject var = NIL;
        SubLObject enumeration_name = NIL;
        destructuring_bind_must_consp(current, datum, $list115);
        var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list115);
        enumeration_name = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject forms;
            current = forms = temp;
            final SubLObject enumeration_var = make_symbol($$$enumeration);
            final SubLObject cardinality_var = make_symbol($$$cardinality);
            final SubLObject vector_var = make_symbol($$$vector);
            final SubLObject index_var = make_symbol($$$index);
            return list(CLET, list(list(enumeration_var, list(ENUMERATIONS_RETRIEVE_ENUMERATION, enumeration_name))), list(MUST, enumeration_var, $str117$DO_ENUMERATION___S_does_not_evalu, list(QUOTE, copy_tree(enumeration_name))), list(CLET, list(list(cardinality_var, list(ENUMERATION_CARDINALITY, enumeration_var)), list(vector_var, list(ENUMERATION_VALUES_VECTOR, enumeration_var)), var), listS(CDOTIMES, list(index_var, cardinality_var), list(CSETQ, var, list(AREF, vector_var, index_var)), forms)));
        }
        cdestructuring_bind_error(datum, $list115);
        return NIL;
    }

    public static SubLObject enumeration_less_p(final SubLObject enum_name, final SubLObject value1, final SubLObject value2) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && ((!enum_name.isSymbol()) || (NIL == enum_name))) {
            Errors.error($str118$ENUMERATION_LESS_P___S_is_not_a_v, enum_name);
        }
        final SubLObject enumeration = enumerations_retrieve_enumeration(enum_name);
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == enumeration)) {
            Errors.error($str119$ENUMERATION_LESS_P___S_is_not_kno, enum_name);
        }
        SubLObject value3 = NIL;
        final SubLObject enumeration_$8 = enumeration;
        final SubLObject cardinality = enumeration_cardinality(enumeration_$8);
        final SubLObject values_vector = enumeration_values_vector(enumeration_$8);
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == values_vector)) {
            Errors.error($str120$ENUMERATION_LESS_P___S_has_no_val, enum_name);
        }
        SubLObject index;
        for (index = NIL, index = ZERO_INTEGER; index.numL(cardinality); index = add(index, ONE_INTEGER)) {
            value3 = aref(values_vector, index);
            if (value3.eql(value1)) {
                return makeBoolean(!value3.eql(value2));
            }
            if (value3.eql(value2)) {
                return NIL;
            }
        }
        return NIL;
    }

    public static SubLObject enumeration_less_or_equal_p(final SubLObject enum_name, final SubLObject value1, final SubLObject value2) {
        return makeBoolean(value1.eql(value2) || (NIL != enumeration_less_p(enum_name, value1, value2)));
    }

    public static SubLObject enumeration_greater_p(final SubLObject enum_name, final SubLObject value1, final SubLObject value2) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && ((!enum_name.isSymbol()) || (NIL == enum_name))) {
            Errors.error($str121$ENUMERATION_GREATER_P___S_is_not_, enum_name);
        }
        final SubLObject enumeration = enumerations_retrieve_enumeration(enum_name);
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == enumeration)) {
            Errors.error($str122$ENUMERATION_GREATER_P___S_is_not_, enum_name);
        }
        SubLObject value3 = NIL;
        final SubLObject enumeration_$9 = enumeration;
        final SubLObject cardinality = enumeration_cardinality(enumeration_$9);
        final SubLObject values_vector = enumeration_values_vector(enumeration_$9);
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == values_vector)) {
            Errors.error($str123$ENUMERATION_GREATER_P___S_has_no_, enum_name);
        }
        SubLObject index;
        for (index = NIL, index = ZERO_INTEGER; index.numL(cardinality); index = add(index, ONE_INTEGER)) {
            value3 = aref(values_vector, index);
            if (value3.eql(value2)) {
                return makeBoolean(!value3.eql(value1));
            }
            if (value3.eql(value1)) {
                return NIL;
            }
        }
        return NIL;
    }

    public static SubLObject enumeration_greater_or_equal_p(final SubLObject enum_name, final SubLObject value1, final SubLObject value2) {
        return makeBoolean(value1.eql(value2) || (NIL != enumeration_greater_p(enum_name, value1, value2)));
    }

    public static SubLObject declare_enumerations_file() {
        declareFunction(me, "enumeration_print_function_trampoline", "ENUMERATION-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction(me, "enumeration_p", "ENUMERATION-P", 1, 0, false);
        new enumerations.$enumeration_p$UnaryFunction();
        declareFunction(me, "enumeration_type_name", "ENUMERATION-TYPE-NAME", 1, 0, false);
        declareFunction(me, "enumeration_cardinality", "ENUMERATION-CARDINALITY", 1, 0, false);
        declareFunction(me, "enumeration_values_vector", "ENUMERATION-VALUES-VECTOR", 1, 0, false);
        declareFunction(me, "_csetf_enumeration_type_name", "_CSETF-ENUMERATION-TYPE-NAME", 2, 0, false);
        declareFunction(me, "_csetf_enumeration_cardinality", "_CSETF-ENUMERATION-CARDINALITY", 2, 0, false);
        declareFunction(me, "_csetf_enumeration_values_vector", "_CSETF-ENUMERATION-VALUES-VECTOR", 2, 0, false);
        declareFunction(me, "make_enumeration", "MAKE-ENUMERATION", 0, 1, false);
        declareFunction(me, "visit_defstruct_enumeration", "VISIT-DEFSTRUCT-ENUMERATION", 2, 0, false);
        declareFunction(me, "visit_defstruct_object_enumeration_method", "VISIT-DEFSTRUCT-OBJECT-ENUMERATION-METHOD", 2, 0, false);
        declareFunction(me, "print_enumeration", "PRINT-ENUMERATION", 3, 0, false);
        declareMacro(me, "with_enumeration_read_only", "WITH-ENUMERATION-READ-ONLY");
        declareMacro(me, "with_enumeration_read_write", "WITH-ENUMERATION-READ-WRITE");
        declareMacro(me, "do_enumeration_internal", "DO-ENUMERATION-INTERNAL");
        declareFunction(me, "enumerations_retrieve_enumeration", "ENUMERATIONS-RETRIEVE-ENUMERATION", 1, 0, false);
        declareFunction(me, "enumeration_intern_enumeration", "ENUMERATION-INTERN-ENUMERATION", 2, 0, false);
        declareFunction(me, "get_all_enumerated_types", "GET-ALL-ENUMERATED-TYPES", 0, 0, false);
        declareFunction(me, "enumerations_delete_enumeration", "ENUMERATIONS-DELETE-ENUMERATION", 1, 0, false);
        declareFunction(me, "enumerations_retrieve_enumerations_by_value", "ENUMERATIONS-RETRIEVE-ENUMERATIONS-BY-VALUE", 1, 0, false);
        declareFunction(me, "enumerations_intern_enumeration_by_value", "ENUMERATIONS-INTERN-ENUMERATION-BY-VALUE", 2, 0, false);
        declareFunction(me, "enumerations_delete_enumeration_by_value", "ENUMERATIONS-DELETE-ENUMERATION-BY-VALUE", 2, 0, false);
        declareFunction(me, "enumerations_redundant_elements_p", "ENUMERATIONS-REDUNDANT-ELEMENTS-P", 1, 0, false);
        declareFunction(me, "enumerations_check_definition", "ENUMERATIONS-CHECK-DEFINITION", 2, 0, false);
        declareFunction(me, "enumerations_incorporate_definition", "ENUMERATIONS-INCORPORATE-DEFINITION", 2, 0, false);
        declareFunction(me, "enumerations_compute_enumeration_constant_name", "ENUMERATIONS-COMPUTE-ENUMERATION-CONSTANT-NAME", 1, 0, false);
        declareFunction(me, "enumerations_expand_enumeration_constant_declaration", "ENUMERATIONS-EXPAND-ENUMERATION-CONSTANT-DECLARATION", 2, 0, false);
        declareFunction(me, "enumerations_get_defining_form", "ENUMERATIONS-GET-DEFINING-FORM", 1, 0, false);
        declareFunction(me, "enumerations_expand_enum_valid_enum_list_function", "ENUMERATIONS-EXPAND-ENUM-VALID-ENUM-LIST-FUNCTION", 2, 0, false);
        declareFunction(me, "enumerations_expand_predicator_function", "ENUMERATIONS-EXPAND-PREDICATOR-FUNCTION", 2, 0, false);
        declareFunction(me, "enumerations_expand_encode_function", "ENUMERATIONS-EXPAND-ENCODE-FUNCTION", 2, 0, false);
        declareFunction(me, "enumerations_expand_decode_function", "ENUMERATIONS-EXPAND-DECODE-FUNCTION", 2, 0, false);
        declareFunction(me, "enumerations_expand_lessp_function", "ENUMERATIONS-EXPAND-LESSP-FUNCTION", 2, 0, false);
        declareFunction(me, "enumerations_expand_greaterp_function", "ENUMERATIONS-EXPAND-GREATERP-FUNCTION", 2, 0, false);
        declareFunction(me, "expand_define_enumeration", "EXPAND-DEFINE-ENUMERATION", 3, 0, false);
        declareMacro(me, "define_enumeration_public", "DEFINE-ENUMERATION-PUBLIC");
        declareMacro(me, "define_enumeration_api", "DEFINE-ENUMERATION-API");
        declareMacro(me, "define_enumeration_protected", "DEFINE-ENUMERATION-PROTECTED");
        declareMacro(me, "define_enumeration_private", "DEFINE-ENUMERATION-PRIVATE");
        declareFunction(me, "enumerate_values", "ENUMERATE-VALUES", 1, 0, false);
        declareFunction(me, "enumerate_enumerations", "ENUMERATE-ENUMERATIONS", 1, 0, false);
        declareFunction(me, "enumeration_member_p", "ENUMERATION-MEMBER-P", 2, 0, false);
        declareFunction(me, "encode_enumeration", "ENCODE-ENUMERATION", 2, 0, false);
        declareFunction(me, "decode_enumeration", "DECODE-ENUMERATION", 2, 0, false);
        declareMacro(me, "do_enumeration", "DO-ENUMERATION");
        declareFunction(me, "enumeration_less_p", "ENUMERATION-LESS-P", 3, 0, false);
        declareFunction(me, "enumeration_less_or_equal_p", "ENUMERATION-LESS-OR-EQUAL-P", 3, 0, false);
        declareFunction(me, "enumeration_greater_p", "ENUMERATION-GREATER-P", 3, 0, false);
        declareFunction(me, "enumeration_greater_or_equal_p", "ENUMERATION-GREATER-OR-EQUAL-P", 3, 0, false);
        return NIL;
    }

    public static SubLObject init_enumerations_file() {
        defconstant("*ENUMERATIONS-INITIAL-HASHTABLE-SIZE*", $int$100);
        defparameter("*ENUMERATIONS-TABLE-UPDATE-LOCK*", make_lock($$$Enumerations_Table_Lock));
        deflexical("*ENUMERATIONS-TABLE*", SubLTrampolineFile.maybeDefault($enumerations_table$, $enumerations_table$, () -> make_hash_table($enumerations_initial_hashtable_size$.getGlobalValue(), UNPROVIDED, UNPROVIDED)));
        defconstant("*ENUM-VALUES-INITIAL-HASHTABLE-SIZE*", $int$200);
        defparameter("*ENUM-VALUES-TABLE-UPDATE-LOCK*", make_lock($str4$Enum_Values_Table_Lock));
        deflexical("*ENUM-VALUES-TABLE*", SubLTrampolineFile.maybeDefault($enum_values_table$, $enum_values_table$, () -> make_hash_table($enum_values_initial_hashtable_size$.getGlobalValue(), UNPROVIDED, UNPROVIDED)));
        defconstant("*DTP-ENUMERATION*", ENUMERATION);
        return NIL;
    }

    public static SubLObject setup_enumerations_file() {
        declare_defglobal($enumerations_table$);
        declare_defglobal($enum_values_table$);
        register_method($print_object_method_table$.getGlobalValue(), $dtp_enumeration$.getGlobalValue(), symbol_function(ENUMERATION_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim($list14);
        def_csetf(ENUMERATION_TYPE_NAME, _CSETF_ENUMERATION_TYPE_NAME);
        def_csetf(ENUMERATION_CARDINALITY, _CSETF_ENUMERATION_CARDINALITY);
        def_csetf(ENUMERATION_VALUES_VECTOR, _CSETF_ENUMERATION_VALUES_VECTOR);
        identity(ENUMERATION);
        register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_enumeration$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_ENUMERATION_METHOD));
        return NIL;
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




































































































































    }

    public static final class $enumeration_native extends SubLStructNative {
        public SubLObject $type_name;

        public SubLObject $cardinality;

        public SubLObject $values_vector;

        private static final SubLStructDeclNative structDecl;

        public $enumeration_native() {
            this.$type_name = Lisp.NIL;
            this.$cardinality = Lisp.NIL;
            this.$values_vector = Lisp.NIL;
        }

        @Override
        public SubLStructDecl getStructDecl() {
            return structDecl;
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
            structDecl = makeStructDeclNative(enumerations.$enumeration_native.class, ENUMERATION, ENUMERATION_P, $list8, $list9, new String[]{ "$type_name", "$cardinality", "$values_vector" }, $list10, $list11, PRINT_ENUMERATION);
        }
    }

    public static final class $enumeration_p$UnaryFunction extends UnaryFunction {
        public $enumeration_p$UnaryFunction() {
            super(extractFunctionNamed("ENUMERATION-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return enumeration_p(arg1);
        }
    }
}

/**
 * Total time: 280 ms
 */
