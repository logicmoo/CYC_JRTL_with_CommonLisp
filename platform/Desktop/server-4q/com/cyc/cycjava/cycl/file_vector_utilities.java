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
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.StreamsLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Filesys;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Guids;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_macros;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.stream_macros;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class file_vector_utilities extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.file_vector_utilities";
    public static final String myFingerPrint = "cc47f472c61698eb37a6026f64f9625e87459fbe3b7d0a644161749322d5242c";
    @SubLTranslatedFile.SubL(source = "cycl/file-vector-utilities.lisp", position = 5183L)
    public static SubLSymbol $show_file_vector_reference_payload_in_print$;
    @SubLTranslatedFile.SubL(source = "cycl/file-vector-utilities.lisp", position = 5846L)
    public static SubLSymbol $dtp_file_vector_reference$;
    @SubLTranslatedFile.SubL(source = "cycl/file-vector-utilities.lisp", position = 10358L)
    private static SubLSymbol $cfasl_opcode_fvector_reference$;
    @SubLTranslatedFile.SubL(source = "cycl/file-vector-utilities.lisp", position = 11774L)
    public static SubLSymbol $file_vector_backed_map_read_lock$;
    @SubLTranslatedFile.SubL(source = "cycl/file-vector-utilities.lisp", position = 15858L)
    private static SubLSymbol $file_vector_get_recursion_guard$;
    @SubLTranslatedFile.SubL(source = "cycl/file-vector-utilities.lisp", position = 37880L)
    private static SubLSymbol $file_vector_indexical_registry$;
    @SubLTranslatedFile.SubL(source = "cycl/file-vector-utilities.lisp", position = 38367L)
    private static SubLSymbol $file_vector_indexical_lock_registry$;
    @SubLTranslatedFile.SubL(source = "cycl/file-vector-utilities.lisp", position = 40409L)
    public static SubLSymbol $dtp_backed_map$;
    @SubLTranslatedFile.SubL(source = "cycl/file-vector-utilities.lisp", position = 44233L)
    private static SubLSymbol $cfasl_opcode_backed_map$;
    @SubLTranslatedFile.SubL(source = "cycl/file-vector-utilities.lisp", position = 44378L)
    public static SubLSymbol $cfasl_outer_fvector_for_backed_maps$;
    @SubLTranslatedFile.SubL(source = "cycl/file-vector-utilities.lisp", position = 45607L)
    public static SubLSymbol $current_backed_map_cache_strategy$;
    private static final SubLSymbol $kw0$OUTPUT;
    private static final SubLString $str1$Unable_to_open__S;
    private static final SubLList $list2;
    private static final SubLString $str3$Error__writing_file_vector_backin;
    private static final SubLSymbol $sym4$FILE_VECTOR_REFERENCE;
    private static final SubLSymbol $sym5$FILE_VECTOR_REFERENCE_P;
    private static final SubLList $list6;
    private static final SubLList $list7;
    private static final SubLList $list8;
    private static final SubLList $list9;
    private static final SubLSymbol $sym10$PRINT_FVECTOR_REF;
    private static final SubLSymbol $sym11$FILE_VECTOR_REFERENCE_PRINT_FUNCTION_TRAMPOLINE;
    private static final SubLList $list12;
    private static final SubLSymbol $sym13$FVECTOR_REF_INDEX;
    private static final SubLSymbol $sym14$_CSETF_FVECTOR_REF_INDEX;
    private static final SubLSymbol $sym15$FVECTOR_REF_PAYLOAD;
    private static final SubLSymbol $sym16$_CSETF_FVECTOR_REF_PAYLOAD;
    private static final SubLSymbol $kw17$INDEX;
    private static final SubLSymbol $kw18$PAYLOAD;
    private static final SubLString $str19$Invalid_slot__S_for_construction_;
    private static final SubLSymbol $kw20$BEGIN;
    private static final SubLSymbol $sym21$MAKE_FILE_VECTOR_REFERENCE;
    private static final SubLSymbol $kw22$SLOT;
    private static final SubLSymbol $kw23$END;
    private static final SubLSymbol $sym24$VISIT_DEFSTRUCT_OBJECT_FILE_VECTOR_REFERENCE_METHOD;
    private static final SubLString $str25$__FILE_VECTOR_REF__;
    private static final SubLString $str26$__;
    private static final SubLString $str27$__;
    private static final SubLString $str28$_;
    private static final SubLString $str29$File_Vector_references_cannot_be_;
    private static final SubLString $str30$swapped_out;
    private static final SubLString $str31$present___pristine;
    private static final SubLString $str32$present_but_mutated;
    private static final SubLString $str33$present_but_deleted;
    private static final SubLString $str34$invalid_state;
    private static final SubLInteger $int35$69;
    private static final SubLSymbol $sym36$CFASL_INPUT_FILE_VECTOR_REFERENCE;
    private static final SubLSymbol $sym37$CFASL_OUTPUT_OBJECT_FILE_VECTOR_REFERENCE_METHOD;
    private static final SubLSymbol $sym38$DATA_STREAM_LOCK;
    private static final SubLSymbol $sym39$CLET;
    private static final SubLList $list40;
    private static final SubLSymbol $sym41$PIF;
    private static final SubLSymbol $sym42$LOCK_P;
    private static final SubLSymbol $sym43$WITH_LOCK_HELD;
    private static final SubLSymbol $sym44$PROGN;
    private static final SubLList $list45;
    private static final SubLSymbol $sym46$_FILE_VECTOR_BACKED_MAP_READ_LOCK_;
    private static final SubLSymbol $kw47$UNPROVIDED;
    private static final SubLSymbol $kw48$INPUT;
    private static final SubLSymbol $sym49$CACHE_STRATEGY_OR_SYMBOL_P;
    private static final SubLSymbol $sym50$_EXIT;
    private static final SubLString $str51$We_are_already_using_that_file_ve;
    private static final SubLString $str52$Invalid_state_transition___A_is_n;
    private static final SubLSymbol $kw53$NOT_FOUND;
    private static final SubLSymbol $kw54$MUTATED;
    private static final SubLSymbol $kw55$DELETED;
    private static final SubLSymbol $sym56$FILE_VECTOR_P;
    private static final SubLSymbol $kw57$RECOVERED;
    private static final SubLList $list58;
    private static final SubLList $list59;
    private static final SubLSymbol $kw60$ALLOW_OTHER_KEYS;
    private static final SubLSymbol $kw61$DONE;
    private static final SubLSymbol $kw62$CACHE_STRATEGY;
    private static final SubLSymbol $sym63$IMPL_VALUE;
    private static final SubLSymbol $sym64$DO_MAP;
    private static final SubLSymbol $sym65$PUNLESS;
    private static final SubLSymbol $sym66$CAND;
    private static final SubLSymbol $sym67$FILE_VECTOR_REFERENCE_DELETED_;
    private static final SubLSymbol $sym68$CSETQ;
    private static final SubLSymbol $sym69$FILE_VECTOR_BACKED_MAP_W__CACHE_GET;
    private static final SubLSymbol $sym70$FILE_VECTOR_BACKED_MAP_ITERATOR_DONE;
    private static final SubLSymbol $sym71$FILE_VECTOR_BACKED_MAP_ITERATOR_NEXT;
    private static final SubLList $list72;
    private static final SubLSymbol $kw73$ITERATION_HALTED_PREMATURELY;
    private static final SubLString $str74$Cannot_convert_a_file_backed_map_;
    private static final SubLString $str75$Cannot_upgrade_a_map_with_a_delet;
    private static final SubLString $str76$Cannot_upgrade_a_map_with_muted_f;
    private static final SubLSymbol $sym77$_FILE_VECTOR_INDEXICAL_REGISTRY_;
    private static final SubLSymbol $sym78$_FILE_VECTOR_INDEXICAL_LOCK_REGISTRY_;
    private static final SubLSymbol $sym79$FILE_VECTOR_INDEXICAL_P;
    private static final SubLString $str80$File_Vector_indexical__S_is_not_a;
    private static final SubLSymbol $kw81$IGNORE_ERRORS_TARGET;
    private static final SubLSymbol $sym82$IGNORE_ERRORS_HANDLER;
    private static final SubLString $str83$Lock_for_File_Vector_;
    private static final SubLSymbol $sym84$BACKED_MAP;
    private static final SubLSymbol $sym85$BACKED_MAP_P;
    private static final SubLList $list86;
    private static final SubLList $list87;
    private static final SubLList $list88;
    private static final SubLList $list89;
    private static final SubLSymbol $sym90$PRINT_BACKED_MAP;
    private static final SubLSymbol $sym91$BACKED_MAP_PRINT_FUNCTION_TRAMPOLINE;
    private static final SubLList $list92;
    private static final SubLSymbol $sym93$BACKED_MAP_MAP;
    private static final SubLSymbol $sym94$_CSETF_BACKED_MAP_MAP;
    private static final SubLSymbol $sym95$BACKED_MAP_FVECTOR;
    private static final SubLSymbol $sym96$_CSETF_BACKED_MAP_FVECTOR;
    private static final SubLSymbol $sym97$BACKED_MAP_COMMON_SYMBOLS;
    private static final SubLSymbol $sym98$_CSETF_BACKED_MAP_COMMON_SYMBOLS;
    private static final SubLSymbol $kw99$MAP;
    private static final SubLSymbol $kw100$FVECTOR;
    private static final SubLSymbol $kw101$COMMON_SYMBOLS;
    private static final SubLSymbol $sym102$MAKE_BACKED_MAP;
    private static final SubLSymbol $sym103$VISIT_DEFSTRUCT_OBJECT_BACKED_MAP_METHOD;
    private static final SubLSymbol $sym104$MAP_P;
    private static final SubLList $list105;
    private static final SubLSymbol $sym106$COMMON_SYMBOLS;
    private static final SubLSymbol $sym107$WITH_CFASL_COMMON_SYMBOLS_SIMPLE;
    private static final SubLString $str108$_Map_;
    private static final SubLString $str109$_FVector_;
    private static final SubLString $str110$_CFASL_ComSym_;
    private static final SubLString $str111$_;
    private static final SubLString $str112$Unexpected_file_vector_reference_;
    private static final SubLInteger $int113$76;
    private static final SubLSymbol $sym114$CFASL_INPUT_BACKED_MAP;
    private static final SubLString $str115$Unexpected_value__A_in_BACKED_MAP;
    private static final SubLSymbol $sym116$CFASL_OUTPUT_OBJECT_BACKED_MAP_METHOD;
    private static final SubLList $list117;
    private static final SubLSymbol $sym118$_CURRENT_BACKED_MAP_CACHE_STRATEGY_;
    private static final SubLSymbol $sym119$IS_MAP_OBJECT_P_BACKED_MAP_METHOD;
    private static final SubLSymbol $sym120$MAP_OBJECT_SIZE_BACKED_MAP_METHOD;
    private static final SubLSymbol $sym121$MAP_OBJECT_TEST_BACKED_MAP_METHOD;
    private static final SubLSymbol $sym122$MAP_OBJECT_PUT_BACKED_MAP_METHOD;
    private static final SubLSymbol $sym123$MAP_OBJECT_GET_BACKED_MAP_METHOD;
    private static final SubLString $str124$Cannot_access_backed_map__A_witho;
    private static final SubLSymbol $sym125$MAP_OBJECT_GET_WITHOUT_VALUES_BACKED_MAP_METHOD;
    private static final SubLSymbol $sym126$MAP_OBJECT_REMOVE_BACKED_MAP_METHOD;
    private static final SubLSymbol $sym127$MAP_OBJECT_REMOVE_ALL_BACKED_MAP_METHOD;
    private static final SubLSymbol $sym128$MAP_OBJECT_TOUCH_BACKED_MAP_METHOD;
    private static final SubLSymbol $sym129$MAP_OBJECT_CHANGE_SET_BACKED_MAP_METHOD;
    private static final SubLSymbol $sym130$NEW_MAP_OBJECT_WITH_SAME_PROPERTIES_BACKED_MAP_METHOD;
    private static final SubLString $str131$The_test_of_the_interior_map__A_d;
    private static final SubLString $str132$The_size_of_the_interior_map__A_d;
    private static final SubLSymbol $sym133$NEW_MAP_OBJECT_ITERATOR_BACKED_MAP_METHOD;
    private static final SubLSymbol $sym134$MAP_BACKED_MAP_ITERATOR_DONE;
    private static final SubLSymbol $sym135$MAP_BACKED_MAP_ITERATOR_NEXT;
    private static final SubLList $list136;
    private static final SubLSymbol $sym137$MAP_OBJECT_ARBITRARY_KEY_BACKED_MAP_METHOD;
    private static final SubLString $str138$Error_in_swap_out_algorithm___A_i;
    private static final SubLString $str139$Error_in_non_pristine_object_coun;
    private static final SubLSymbol $sym140$TEST_FILE_VECTOR_BACKED_MAP_WITH_ALIST;
    private static final SubLSymbol $kw141$TEST;
    private static final SubLSymbol $kw142$OWNER;
    private static final SubLSymbol $kw143$CLASSES;
    private static final SubLSymbol $kw144$KB;
    private static final SubLSymbol $kw145$TINY;
    private static final SubLSymbol $kw146$WORKING_;
    private static final SubLObject $list147;
    private static final SubLSymbol $sym148$TEST_MAP_TO_FILE_VECTOR_BACKED_MAP_CONVERSION_WITH_ALIST;
    private static final SubLString $str149$_tmp_;
    private static final SubLString $str150$Key__A_should_be_in_the_map_but_i;
    private static final SubLString $str151$The_value_for_the_key__A_is_missi;
    private static final SubLString $str152$The_old_value__A_does_not_match_t;
    private static final SubLString $str153$There_are_supposed_to_be__A_keys_;
    private static final SubLString $str154$There_are_supposed_to_be__A_value;
    private static final SubLString $str155$The_value_for_the_key__A_can_all_;
    private static final SubLString $str156$The_accessing_of_the_value_for__A;
    private static final SubLString $str157$The_touching_of_the_object_did_no;
    private static final SubLString $str158$Undoing_the_change_for_key__A_did;
    private static final SubLString $str159$The_modification_of_the_entry_for;
    private static final SubLString $str160$The_modified_entry_for__A_no_long;
    private static final SubLString $str161$The_stored_entry_for__A_is_not_a_;
    private static final SubLSymbol $kw162$SUCCESS;
    private static final SubLString $str163$_A_should_be_paged_in__but__A_are;
    private static final SubLString $str164$_A_should_be_paged_out__but__A_ar;
    private static final SubLSymbol $kw165$COPY_CONTENTS;
    private static final SubLList $list166;
    private static final SubLString $str167$The_entry_for__A_in_the_original_;
    private static final SubLString $str168$The_loaded_map_does_not_have_the_;
    private static final SubLString $str169$The_entry_for__A_in_the_new_map_i;
    private static final SubLList $list170;
    private static final SubLString $str171$The_new_map_has_an_entry_for_key_;
    private static final SubLString $str172$The_values_for_key__A_are_not_equ;
    private static final SubLString $str173$New_map__A_and_backup_key_set__A_;
    private static final SubLSymbol $kw174$SUPPORT_UNDO;
    private static final SubLString $str175$We_are_getting__A_back__but_that_;
    private static final SubLString $str176$We_are_getting_the_removed_key__A;
    private static final SubLString $str177$We_are_not_getting_back_the_same_;
    private static final SubLString $str178$We_no_longer_visited__A_____inves;
    private static final SubLString $str179$_____A_is_still_present_in_map___;
    private static final SubLString $str180$_____A_is_not_even_findable_in_th;
    private static final SubLString $str181$Deleting__A_to_produce__A_did_not;
    private static final SubLString $str182$We_visited__A_entries_but_we_shou;
    private static final SubLList $list183;
    private static final SubLString $str184$The_index__A_is_outside_of_the_ra;
    static  boolean assertionsDisabledSynth = true;
    
    @SubLTranslatedFile.SubL(source = "cycl/file-vector-utilities.lisp", position = 889L)
    public static SubLObject create_file_backing_for_map(final SubLObject map, final SubLObject data_file, final SubLObject index_file) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)file_vector_utilities.NIL;
        SubLObject stream = (SubLObject)file_vector_utilities.NIL;
        try {
            final SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding(thread);
            try {
                stream_macros.$stream_requires_locking$.bind((SubLObject)file_vector_utilities.NIL, thread);
                stream = compatibility.open_binary(data_file, (SubLObject)file_vector_utilities.$kw0$OUTPUT);
            }
            finally {
                stream_macros.$stream_requires_locking$.rebind(_prev_bind_0, thread);
            }
            if (!stream.isStream()) {
                Errors.error((SubLObject)file_vector_utilities.$str1$Unable_to_open__S, data_file);
            }
            final SubLObject data_stream = stream;
            SubLObject stream_$1 = (SubLObject)file_vector_utilities.NIL;
            try {
                final SubLObject _prev_bind_2 = stream_macros.$stream_requires_locking$.currentBinding(thread);
                try {
                    stream_macros.$stream_requires_locking$.bind((SubLObject)file_vector_utilities.NIL, thread);
                    stream_$1 = compatibility.open_binary(index_file, (SubLObject)file_vector_utilities.$kw0$OUTPUT);
                }
                finally {
                    stream_macros.$stream_requires_locking$.rebind(_prev_bind_2, thread);
                }
                if (!stream_$1.isStream()) {
                    Errors.error((SubLObject)file_vector_utilities.$str1$Unable_to_open__S, index_file);
                }
                final SubLObject index_stream = stream_$1;
                final SubLObject v_file_vector = file_vector.create_file_vector(data_stream, index_stream);
                result = create_file_vector_backing_for_map(map, v_file_vector);
                file_vector.close_file_vector(v_file_vector);
            }
            finally {
                final SubLObject _prev_bind_3 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)file_vector_utilities.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    if (stream_$1.isStream()) {
                        streams_high.close(stream_$1, (SubLObject)file_vector_utilities.UNPROVIDED);
                    }
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_3, thread);
                }
            }
        }
        finally {
            final SubLObject _prev_bind_4 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)file_vector_utilities.T, thread);
                final SubLObject _values2 = Values.getValuesAsVector();
                if (stream.isStream()) {
                    streams_high.close(stream, (SubLObject)file_vector_utilities.UNPROVIDED);
                }
                Values.restoreValuesFromVector(_values2);
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_4, thread);
            }
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-vector-utilities.lisp", position = 1699L)
    public static SubLObject create_file_vector_backing_for_map(final SubLObject map, final SubLObject v_file_vector) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject data_stream = file_vector.get_file_vector_data_stream(v_file_vector);
        write_file_vector_backing_map_prologue_to_data_stream(map, data_stream);
        final SubLObject iterator = map_utilities.new_map_iterator(map);
        SubLObject valid;
        for (SubLObject done_var = (SubLObject)file_vector_utilities.NIL; file_vector_utilities.NIL == done_var; done_var = (SubLObject)SubLObjectFactory.makeBoolean(file_vector_utilities.NIL == valid)) {
            thread.resetMultipleValues();
            final SubLObject var = iteration.iteration_next(iterator);
            valid = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (file_vector_utilities.NIL != valid) {
                SubLObject current;
                final SubLObject datum = current = var;
                SubLObject key = (SubLObject)file_vector_utilities.NIL;
                SubLObject value = (SubLObject)file_vector_utilities.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)file_vector_utilities.$list2);
                key = current.first();
                current = current.rest();
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)file_vector_utilities.$list2);
                value = current.first();
                current = current.rest();
                if (file_vector_utilities.NIL == current) {
                    write_file_vector_backing_map_entry(key, value, v_file_vector);
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)file_vector_utilities.$list2);
                }
            }
        }
        return map;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-vector-utilities.lisp", position = 2199L)
    public static SubLObject write_file_vector_backing_map_prologue(final SubLObject map, final SubLObject v_file_vector) {
        final SubLObject data_stream = file_vector.get_file_vector_data_stream(v_file_vector);
        return write_file_vector_backing_map_prologue_to_data_stream(map, data_stream);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-vector-utilities.lisp", position = 2424L)
    public static SubLObject write_file_vector_backing_map_entry(final SubLObject key, final SubLObject value, final SubLObject v_file_vector) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject index = write_file_vector_backing_map_entry_key(key, v_file_vector);
        final SubLObject expected_next_index = file_vector_value_index_from_key_index(index);
        final SubLObject next_index = file_vector.file_vector_next_index(v_file_vector);
        if (file_vector_utilities.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && !expected_next_index.numE(next_index)) {
            Errors.error((SubLObject)file_vector_utilities.$str3$Error__writing_file_vector_backin, expected_next_index, next_index);
        }
        return write_file_vector_backing_map_entry_value(value, v_file_vector, index);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-vector-utilities.lisp", position = 3260L)
    public static SubLObject write_file_vector_backing_map_entry_key(final SubLObject key, final SubLObject v_file_vector) {
        final SubLObject data_stream = file_vector.get_file_vector_data_stream(v_file_vector);
        final SubLObject index = file_vector.file_vector_next_index(v_file_vector);
        file_vector.update_file_vector_index_linear(v_file_vector);
        cfasl.cfasl_output(key, data_stream);
        return index;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-vector-utilities.lisp", position = 3558L)
    public static SubLObject write_file_vector_backing_map_entry_value(final SubLObject value, final SubLObject v_file_vector, SubLObject index) {
        if (index == file_vector_utilities.UNPROVIDED) {
            index = (SubLObject)file_vector_utilities.NIL;
        }
        if (file_vector_utilities.NIL == index) {
            index = file_vector.file_vector_next_index(v_file_vector);
        }
        final SubLObject data_stream = file_vector.get_file_vector_data_stream(v_file_vector);
        file_vector.update_file_vector_index_linear(v_file_vector);
        cfasl.cfasl_output(value, data_stream);
        return index;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-vector-utilities.lisp", position = 3902L)
    public static SubLObject write_file_vector_backing_map_prologue_to_data_stream(final SubLObject map, final SubLObject data_stream) {
        cfasl.cfasl_output(map_utilities.map_test_symbol(map), data_stream);
        cfasl.cfasl_output(map_utilities.map_size(map), data_stream);
        return map;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-vector-utilities.lisp", position = 4143L)
    public static SubLObject create_file_backing_for_maps(final SubLObject map_list, final SubLObject data_file, final SubLObject index_file) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)file_vector_utilities.NIL;
        SubLObject stream = (SubLObject)file_vector_utilities.NIL;
        try {
            final SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding(thread);
            try {
                stream_macros.$stream_requires_locking$.bind((SubLObject)file_vector_utilities.NIL, thread);
                stream = compatibility.open_binary(data_file, (SubLObject)file_vector_utilities.$kw0$OUTPUT);
            }
            finally {
                stream_macros.$stream_requires_locking$.rebind(_prev_bind_0, thread);
            }
            if (!stream.isStream()) {
                Errors.error((SubLObject)file_vector_utilities.$str1$Unable_to_open__S, data_file);
            }
            final SubLObject data_stream = stream;
            SubLObject stream_$2 = (SubLObject)file_vector_utilities.NIL;
            try {
                final SubLObject _prev_bind_2 = stream_macros.$stream_requires_locking$.currentBinding(thread);
                try {
                    stream_macros.$stream_requires_locking$.bind((SubLObject)file_vector_utilities.NIL, thread);
                    stream_$2 = compatibility.open_binary(index_file, (SubLObject)file_vector_utilities.$kw0$OUTPUT);
                }
                finally {
                    stream_macros.$stream_requires_locking$.rebind(_prev_bind_2, thread);
                }
                if (!stream_$2.isStream()) {
                    Errors.error((SubLObject)file_vector_utilities.$str1$Unable_to_open__S, index_file);
                }
                final SubLObject index_stream = stream_$2;
                final SubLObject v_file_vector = file_vector.create_file_vector(data_stream, index_stream);
                result = create_file_vector_backing_for_maps(map_list, v_file_vector);
                file_vector.close_file_vector(v_file_vector);
            }
            finally {
                final SubLObject _prev_bind_3 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)file_vector_utilities.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    if (stream_$2.isStream()) {
                        streams_high.close(stream_$2, (SubLObject)file_vector_utilities.UNPROVIDED);
                    }
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_3, thread);
                }
            }
        }
        finally {
            final SubLObject _prev_bind_4 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)file_vector_utilities.T, thread);
                final SubLObject _values2 = Values.getValuesAsVector();
                if (stream.isStream()) {
                    streams_high.close(stream, (SubLObject)file_vector_utilities.UNPROVIDED);
                }
                Values.restoreValuesFromVector(_values2);
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_4, thread);
            }
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-vector-utilities.lisp", position = 4710L)
    public static SubLObject create_file_vector_backing_for_maps(final SubLObject map_list, final SubLObject v_file_vector) {
        final SubLObject data_stream = file_vector.get_file_vector_data_stream(v_file_vector);
        cfasl.cfasl_output(Sequences.length(map_list), data_stream);
        SubLObject cdolist_list_var = map_list;
        SubLObject map = (SubLObject)file_vector_utilities.NIL;
        map = cdolist_list_var.first();
        while (file_vector_utilities.NIL != cdolist_list_var) {
            create_file_vector_backing_for_map(map, v_file_vector);
            cdolist_list_var = cdolist_list_var.rest();
            map = cdolist_list_var.first();
        }
        return map_list;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-vector-utilities.lisp", position = 5846L)
    public static SubLObject file_vector_reference_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        print_fvector_ref(v_object, stream, (SubLObject)file_vector_utilities.ZERO_INTEGER);
        return (SubLObject)file_vector_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-vector-utilities.lisp", position = 5846L)
    public static SubLObject file_vector_reference_p(final SubLObject v_object) {
        return (SubLObject)((v_object.getClass() == $file_vector_reference_native.class) ? file_vector_utilities.T : file_vector_utilities.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-vector-utilities.lisp", position = 5846L)
    public static SubLObject fvector_ref_index(final SubLObject v_object) {
        assert file_vector_utilities.NIL != file_vector_reference_p(v_object) : v_object;
        return v_object.getField2();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-vector-utilities.lisp", position = 5846L)
    public static SubLObject fvector_ref_payload(final SubLObject v_object) {
        assert file_vector_utilities.NIL != file_vector_reference_p(v_object) : v_object;
        return v_object.getField3();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-vector-utilities.lisp", position = 5846L)
    public static SubLObject _csetf_fvector_ref_index(final SubLObject v_object, final SubLObject value) {
        assert file_vector_utilities.NIL != file_vector_reference_p(v_object) : v_object;
        return v_object.setField2(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-vector-utilities.lisp", position = 5846L)
    public static SubLObject _csetf_fvector_ref_payload(final SubLObject v_object, final SubLObject value) {
        assert file_vector_utilities.NIL != file_vector_reference_p(v_object) : v_object;
        return v_object.setField3(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-vector-utilities.lisp", position = 5846L)
    public static SubLObject make_file_vector_reference(SubLObject arglist) {
        if (arglist == file_vector_utilities.UNPROVIDED) {
            arglist = (SubLObject)file_vector_utilities.NIL;
        }
        final SubLObject v_new = (SubLObject)new $file_vector_reference_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = (SubLObject)file_vector_utilities.NIL, next = arglist; file_vector_utilities.NIL != next; next = conses_high.cddr(next)) {
            current_arg = next.first();
            current_value = conses_high.cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql((SubLObject)file_vector_utilities.$kw17$INDEX)) {
                _csetf_fvector_ref_index(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)file_vector_utilities.$kw18$PAYLOAD)) {
                _csetf_fvector_ref_payload(v_new, current_value);
            }
            else {
                Errors.error((SubLObject)file_vector_utilities.$str19$Invalid_slot__S_for_construction_, current_arg);
            }
        }
        return v_new;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-vector-utilities.lisp", position = 5846L)
    public static SubLObject visit_defstruct_file_vector_reference(final SubLObject obj, final SubLObject visitor_fn) {
        Functions.funcall(visitor_fn, obj, (SubLObject)file_vector_utilities.$kw20$BEGIN, (SubLObject)file_vector_utilities.$sym21$MAKE_FILE_VECTOR_REFERENCE, (SubLObject)file_vector_utilities.TWO_INTEGER);
        Functions.funcall(visitor_fn, obj, (SubLObject)file_vector_utilities.$kw22$SLOT, (SubLObject)file_vector_utilities.$kw17$INDEX, fvector_ref_index(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)file_vector_utilities.$kw22$SLOT, (SubLObject)file_vector_utilities.$kw18$PAYLOAD, fvector_ref_payload(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)file_vector_utilities.$kw23$END, (SubLObject)file_vector_utilities.$sym21$MAKE_FILE_VECTOR_REFERENCE, (SubLObject)file_vector_utilities.TWO_INTEGER);
        return obj;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-vector-utilities.lisp", position = 5846L)
    public static SubLObject visit_defstruct_object_file_vector_reference_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_file_vector_reference(obj, visitor_fn);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-vector-utilities.lisp", position = 6072L)
    public static SubLObject print_fvector_ref(final SubLObject v_object, final SubLObject stream, final SubLObject depth) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        streams_high.write_string((SubLObject)file_vector_utilities.$str25$__FILE_VECTOR_REF__, stream, (SubLObject)file_vector_utilities.UNPROVIDED, (SubLObject)file_vector_utilities.UNPROVIDED);
        print_high.princ(file_vector_reference_index(v_object), stream);
        print_high.princ((SubLObject)file_vector_utilities.$str26$__, stream);
        if (file_vector_utilities.NIL != file_vector_utilities.$show_file_vector_reference_payload_in_print$.getDynamicValue(thread)) {
            print_high.princ(file_vector_reference_referenced_object(v_object), stream);
        }
        else {
            print_high.princ(file_vector_reference_status(v_object), stream);
        }
        print_high.princ((SubLObject)file_vector_utilities.$str27$__, stream);
        streams_high.write_string((SubLObject)file_vector_utilities.$str28$_, stream, (SubLObject)file_vector_utilities.UNPROVIDED, (SubLObject)file_vector_utilities.UNPROVIDED);
        return v_object;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-vector-utilities.lisp", position = 6522L)
    public static SubLObject new_file_vector_reference(final SubLObject index) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (file_vector_utilities.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && !index.isPositive()) {
            Errors.error((SubLObject)file_vector_utilities.$str29$File_Vector_references_cannot_be_);
        }
        final SubLObject ref = make_file_vector_reference((SubLObject)file_vector_utilities.UNPROVIDED);
        _csetf_fvector_ref_index(ref, index);
        clear_file_vector_reference_referenced_object(ref);
        return ref;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-vector-utilities.lisp", position = 6800L)
    public static SubLObject new_file_vector_reference_wX_payload(final SubLObject index, final SubLObject payload) {
        final SubLObject ref = new_file_vector_reference(index);
        set_file_vector_reference_referenced_object(ref, payload);
        return ref;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-vector-utilities.lisp", position = 6998L)
    public static SubLObject file_vector_reference_index(final SubLObject ref) {
        return fvector_ref_index(ref);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-vector-utilities.lisp", position = 7082L)
    public static SubLObject mark_file_vector_reference_as_mutated(final SubLObject ref) {
        final SubLObject index = fvector_ref_index(ref);
        final SubLObject mutated_index = Numbers.minus(Numbers.abs(index));
        _csetf_fvector_ref_index(ref, mutated_index);
        return ref;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-vector-utilities.lisp", position = 7291L)
    public static SubLObject recover_mutated_file_vector_reference(final SubLObject ref) {
        final SubLObject index = fvector_ref_index(ref);
        return Numbers.abs(index);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-vector-utilities.lisp", position = 7419L)
    public static SubLObject restore_file_vector_reference(final SubLObject ref) {
        final SubLObject index = recover_mutated_file_vector_reference(ref);
        _csetf_fvector_ref_index(ref, index);
        clear_file_vector_reference_referenced_object(ref);
        return ref;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-vector-utilities.lisp", position = 7647L)
    public static SubLObject set_file_vector_reference_referenced_object(final SubLObject ref, final SubLObject v_object) {
        _csetf_fvector_ref_payload(ref, v_object);
        return ref;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-vector-utilities.lisp", position = 7778L)
    public static SubLObject clear_file_vector_reference_referenced_object(final SubLObject ref) {
        return set_file_vector_reference_referenced_object(ref, (SubLObject)file_vector_utilities.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-vector-utilities.lisp", position = 7911L)
    public static SubLObject file_vector_reference_referenced_object(final SubLObject ref) {
        return fvector_ref_payload(ref);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-vector-utilities.lisp", position = 8010L)
    public static SubLObject mark_file_vector_reference_as_deleted(final SubLObject ref) {
        mark_file_vector_reference_as_mutated(ref);
        return clear_file_vector_reference_referenced_object(ref);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-vector-utilities.lisp", position = 8179L)
    public static SubLObject fvector_ref_payload_in_memory_p(final SubLObject ref) {
        return (SubLObject)SubLObjectFactory.makeBoolean(file_vector_utilities.NIL != fvector_ref_payload(ref));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-vector-utilities.lisp", position = 8284L)
    public static SubLObject fvector_ref_valid_index_p(final SubLObject index) {
        return Numbers.plusp(index);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-vector-utilities.lisp", position = 8359L)
    public static SubLObject fvector_ref_has_valid_index_p(final SubLObject ref) {
        return fvector_ref_valid_index_p(fvector_ref_index(ref));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-vector-utilities.lisp", position = 8473L)
    public static SubLObject fvector_ref_mutated_index_p(final SubLObject index) {
        return Numbers.minusp(index);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-vector-utilities.lisp", position = 8551L)
    public static SubLObject fvector_ref_has_mutated_index_p(final SubLObject ref) {
        return fvector_ref_mutated_index_p(fvector_ref_index(ref));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-vector-utilities.lisp", position = 8669L)
    public static SubLObject file_vector_reference_swapped_outP(final SubLObject ref) {
        return (SubLObject)SubLObjectFactory.makeBoolean(file_vector_utilities.NIL != fvector_ref_has_valid_index_p(ref) && file_vector_utilities.NIL == fvector_ref_payload_in_memory_p(ref));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-vector-utilities.lisp", position = 8959L)
    public static SubLObject file_vector_reference_present_pristineP(final SubLObject ref) {
        return (SubLObject)SubLObjectFactory.makeBoolean(file_vector_utilities.NIL != fvector_ref_has_valid_index_p(ref) && file_vector_utilities.NIL != fvector_ref_payload_in_memory_p(ref));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-vector-utilities.lisp", position = 9264L)
    public static SubLObject file_vector_reference_present_mutatedP(final SubLObject ref) {
        return (SubLObject)SubLObjectFactory.makeBoolean(file_vector_utilities.NIL != fvector_ref_has_mutated_index_p(ref) && file_vector_utilities.NIL != fvector_ref_payload_in_memory_p(ref));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-vector-utilities.lisp", position = 9531L)
    public static SubLObject file_vector_reference_deletedP(final SubLObject ref) {
        return (SubLObject)SubLObjectFactory.makeBoolean(file_vector_utilities.NIL != fvector_ref_has_mutated_index_p(ref) && file_vector_utilities.NIL == fvector_ref_payload_in_memory_p(ref));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-vector-utilities.lisp", position = 9757L)
    public static SubLObject file_vector_reference_status(final SubLObject ref) {
        if (file_vector_utilities.NIL != file_vector_reference_swapped_outP(ref)) {
            return (SubLObject)file_vector_utilities.$str30$swapped_out;
        }
        if (file_vector_utilities.NIL != file_vector_reference_present_pristineP(ref)) {
            return (SubLObject)file_vector_utilities.$str31$present___pristine;
        }
        if (file_vector_utilities.NIL != file_vector_reference_present_mutatedP(ref)) {
            return (SubLObject)file_vector_utilities.$str32$present_but_mutated;
        }
        if (file_vector_utilities.NIL != file_vector_reference_deletedP(ref)) {
            return (SubLObject)file_vector_utilities.$str33$present_but_deleted;
        }
        return (SubLObject)file_vector_utilities.$str34$invalid_state;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-vector-utilities.lisp", position = 10183L)
    public static SubLObject file_vector_reference_presentP(final SubLObject ref) {
        return (SubLObject)SubLObjectFactory.makeBoolean(file_vector_utilities.NIL != file_vector_reference_present_pristineP(ref) || file_vector_utilities.NIL != file_vector_reference_present_mutatedP(ref));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-vector-utilities.lisp", position = 10476L)
    public static SubLObject cfasl_input_file_vector_reference(final SubLObject stream) {
        final SubLObject index = cfasl.cfasl_input(stream, (SubLObject)file_vector_utilities.UNPROVIDED, (SubLObject)file_vector_utilities.UNPROVIDED);
        if (file_vector_utilities.NIL != fvector_ref_valid_index_p(index)) {
            return new_file_vector_reference(index);
        }
        final SubLObject payload = cfasl.cfasl_input(stream, (SubLObject)file_vector_utilities.UNPROVIDED, (SubLObject)file_vector_utilities.UNPROVIDED);
        return new_file_vector_reference_wX_payload(index, payload);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-vector-utilities.lisp", position = 10789L)
    public static SubLObject cfasl_output_file_vector_reference(final SubLObject v_object, final SubLObject stream) {
        cfasl.cfasl_raw_write_byte(file_vector_utilities.$cfasl_opcode_fvector_reference$.getGlobalValue(), stream);
        final SubLObject index = file_vector_reference_index(v_object);
        cfasl.cfasl_output(index, stream);
        if (file_vector_utilities.NIL != fvector_ref_mutated_index_p(index)) {
            cfasl.cfasl_output(file_vector_reference_referenced_object(v_object), stream);
        }
        return v_object;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-vector-utilities.lisp", position = 11199L)
    public static SubLObject cfasl_output_object_file_vector_reference_method(final SubLObject v_object, final SubLObject stream) {
        return cfasl_output_file_vector_reference(v_object, stream);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-vector-utilities.lisp", position = 11335L)
    public static SubLObject stamp_file_vector_for_references(final SubLObject fvector, SubLObject datum_1, SubLObject datum_2) {
        if (datum_1 == file_vector_utilities.UNPROVIDED) {
            datum_1 = (SubLObject)file_vector_utilities.NIL;
        }
        if (datum_2 == file_vector_utilities.UNPROVIDED) {
            datum_2 = (SubLObject)file_vector_utilities.NIL;
        }
        if (file_vector_utilities.NIL == datum_2) {
            datum_2 = datum_1;
        }
        final SubLObject data_stream = file_vector.get_file_vector_data_stream(fvector);
        cfasl.cfasl_output(datum_1, data_stream);
        file_vector.update_file_vector_index_linear(fvector);
        cfasl.cfasl_output(datum_2, data_stream);
        return fvector;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-vector-utilities.lisp", position = 12320L)
    public static SubLObject with_potential_file_vector_backed_map_lock(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        final SubLObject data_stream_lock = (SubLObject)file_vector_utilities.$sym38$DATA_STREAM_LOCK;
        return (SubLObject)ConsesLow.list((SubLObject)file_vector_utilities.$sym39$CLET, (SubLObject)ConsesLow.list(reader.bq_cons(data_stream_lock, (SubLObject)file_vector_utilities.$list40)), (SubLObject)ConsesLow.list((SubLObject)file_vector_utilities.$sym41$PIF, (SubLObject)ConsesLow.list((SubLObject)file_vector_utilities.$sym42$LOCK_P, data_stream_lock), (SubLObject)ConsesLow.listS((SubLObject)file_vector_utilities.$sym43$WITH_LOCK_HELD, (SubLObject)ConsesLow.list(data_stream_lock), ConsesLow.append(body, (SubLObject)file_vector_utilities.NIL)), reader.bq_cons((SubLObject)file_vector_utilities.$sym44$PROGN, ConsesLow.append(body, (SubLObject)file_vector_utilities.NIL))));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-vector-utilities.lisp", position = 12687L)
    public static SubLObject with_file_vector_backed_map_stream_lock(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)file_vector_utilities.$list45);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject lock = (SubLObject)file_vector_utilities.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)file_vector_utilities.$list45);
        lock = current.first();
        current = current.rest();
        if (file_vector_utilities.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            return (SubLObject)ConsesLow.listS((SubLObject)file_vector_utilities.$sym39$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)file_vector_utilities.$sym46$_FILE_VECTOR_BACKED_MAP_READ_LOCK_, lock)), ConsesLow.append(body, (SubLObject)file_vector_utilities.NIL));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)file_vector_utilities.$list45);
        return (SubLObject)file_vector_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-vector-utilities.lisp", position = 12930L)
    public static SubLObject new_file_vector_backed_map(final SubLObject v_file_vector, SubLObject test, SubLObject size, SubLObject start_pos) {
        if (test == file_vector_utilities.UNPROVIDED) {
            test = (SubLObject)file_vector_utilities.EQL;
        }
        if (size == file_vector_utilities.UNPROVIDED) {
            size = (SubLObject)file_vector_utilities.$kw47$UNPROVIDED;
        }
        if (start_pos == file_vector_utilities.UNPROVIDED) {
            start_pos = (SubLObject)file_vector_utilities.ZERO_INTEGER;
        }
        if (file_vector_utilities.$kw47$UNPROVIDED == size) {
            size = map_size_from_file_vector_length(v_file_vector);
        }
        final SubLObject target = dictionary.new_dictionary(test, size);
        final SubLObject data_stream = file_vector.get_file_vector_data_stream(v_file_vector);
        SubLObject i;
        SubLObject key;
        SubLObject datum_index;
        SubLObject datum;
        for (i = (SubLObject)file_vector_utilities.NIL, i = (SubLObject)file_vector_utilities.ZERO_INTEGER; i.numL(size); i = Numbers.add(i, (SubLObject)file_vector_utilities.ONE_INTEGER)) {
            key = (SubLObject)file_vector_utilities.NIL;
            datum_index = (SubLObject)file_vector_utilities.NIL;
            datum = (SubLObject)file_vector_utilities.NIL;
            if (i.isZero()) {
                file_vector.position_file_vector(v_file_vector, start_pos);
            }
            else {
                file_vector.position_file_vector(v_file_vector, (SubLObject)file_vector_utilities.UNPROVIDED);
            }
            key = file_vector_backed_map_read_key(data_stream);
            file_vector.position_file_vector(v_file_vector, (SubLObject)file_vector_utilities.UNPROVIDED);
            datum_index = file_vector_index_from_map_element_number(Numbers.add(start_pos, i));
            datum = new_file_vector_reference(datum_index);
            map_utilities.map_put(target, key, datum);
        }
        return target;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-vector-utilities.lisp", position = 14264L)
    public static SubLObject load_file_vector_backed_map(final SubLObject data_file, final SubLObject index_file) {
        SubLObject new_map = (SubLObject)file_vector_utilities.NIL;
        SubLObject v_file_vector = (SubLObject)file_vector_utilities.NIL;
        try {
            v_file_vector = file_vector.new_file_vector(data_file, index_file, (SubLObject)file_vector_utilities.$kw48$INPUT, (SubLObject)file_vector_utilities.UNPROVIDED, (SubLObject)file_vector_utilities.UNPROVIDED, (SubLObject)file_vector_utilities.UNPROVIDED);
            new_map = load_one_file_vector_backed_map(v_file_vector, (SubLObject)file_vector_utilities.UNPROVIDED);
        }
        finally {
            final SubLObject _prev_bind_0 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
            try {
                Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)file_vector_utilities.T);
                final SubLObject _values = Values.getValuesAsVector();
                if (file_vector_utilities.NIL != file_vector.file_vector_p(v_file_vector)) {
                    file_vector.close_file_vector(v_file_vector);
                }
                Values.restoreValuesFromVector(_values);
            }
            finally {
                Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, _prev_bind_0);
            }
        }
        return new_map;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-vector-utilities.lisp", position = 14676L)
    public static SubLObject load_one_file_vector_backed_map(final SubLObject v_file_vector, SubLObject start_pos) {
        if (start_pos == file_vector_utilities.UNPROVIDED) {
            start_pos = (SubLObject)file_vector_utilities.ZERO_INTEGER;
        }
        final SubLObject data_stream = file_vector.get_file_vector_data_stream(v_file_vector);
        final SubLObject test_symbol = cfasl.cfasl_input(data_stream, (SubLObject)file_vector_utilities.UNPROVIDED, (SubLObject)file_vector_utilities.UNPROVIDED);
        final SubLObject map_size = cfasl.cfasl_input(data_stream, (SubLObject)file_vector_utilities.UNPROVIDED, (SubLObject)file_vector_utilities.UNPROVIDED);
        return new_file_vector_backed_map(v_file_vector, test_symbol, map_size, start_pos);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-vector-utilities.lisp", position = 15063L)
    public static SubLObject load_file_vector_backed_maps(final SubLObject data_file, final SubLObject index_file) {
        SubLObject new_maps = (SubLObject)file_vector_utilities.NIL;
        SubLObject v_file_vector = (SubLObject)file_vector_utilities.NIL;
        try {
            v_file_vector = file_vector.new_file_vector(data_file, index_file, (SubLObject)file_vector_utilities.$kw48$INPUT, (SubLObject)file_vector_utilities.UNPROVIDED, (SubLObject)file_vector_utilities.UNPROVIDED, (SubLObject)file_vector_utilities.UNPROVIDED);
            final SubLObject data_stream = file_vector.get_file_vector_data_stream(v_file_vector);
            final SubLObject num_of_maps = cfasl.cfasl_input(data_stream, (SubLObject)file_vector_utilities.UNPROVIDED, (SubLObject)file_vector_utilities.UNPROVIDED);
            SubLObject start_pos = (SubLObject)file_vector_utilities.ZERO_INTEGER;
            SubLObject i;
            SubLObject map;
            for (i = (SubLObject)file_vector_utilities.NIL, i = (SubLObject)file_vector_utilities.ZERO_INTEGER; i.numL(num_of_maps); i = Numbers.add(i, (SubLObject)file_vector_utilities.ONE_INTEGER)) {
                map = load_one_file_vector_backed_map(v_file_vector, start_pos);
                new_maps = (SubLObject)ConsesLow.cons(map, new_maps);
                start_pos = Numbers.add(start_pos, map_utilities.map_size(map));
            }
            new_maps = Sequences.nreverse(new_maps);
        }
        finally {
            final SubLObject _prev_bind_0 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
            try {
                Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)file_vector_utilities.T);
                final SubLObject _values = Values.getValuesAsVector();
                if (file_vector_utilities.NIL != file_vector.file_vector_p(v_file_vector)) {
                    file_vector.close_file_vector(v_file_vector);
                }
                Values.restoreValuesFromVector(_values);
            }
            finally {
                Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, _prev_bind_0);
            }
        }
        return new_maps;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-vector-utilities.lisp", position = 16112L)
    public static SubLObject file_vector_backed_map_get(final SubLObject map, final SubLObject v_file_vector, final SubLObject key, SubLObject not_found) {
        if (not_found == file_vector_utilities.UNPROVIDED) {
            not_found = (SubLObject)file_vector_utilities.NIL;
        }
        return file_vector_backed_map_wX_cache_get(map, v_file_vector, (SubLObject)file_vector_utilities.NIL, key, not_found);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-vector-utilities.lisp", position = 16564L)
    public static SubLObject file_vector_backed_map_wX_cache_get(final SubLObject map, final SubLObject v_file_vector, final SubLObject cache_strategy, final SubLObject key, SubLObject not_found) {
        if (not_found == file_vector_utilities.UNPROVIDED) {
            not_found = (SubLObject)file_vector_utilities.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert file_vector_utilities.NIL != cache_utilities.cache_strategy_or_symbol_p(cache_strategy) : cache_strategy;
        final SubLObject data_stream_lock = file_vector_utilities.$file_vector_backed_map_read_lock$.getDynamicValue(thread);
        if (data_stream_lock.isLock()) {
            SubLObject release = (SubLObject)file_vector_utilities.NIL;
            try {
                release = Locks.seize_lock(data_stream_lock);
                final SubLObject datum = map_utilities.map_get_without_values(map, key, not_found);
                if (file_vector_utilities.NIL != file_vector_reference_p(datum)) {
                    if (file_vector_utilities.NIL != file_vector_reference_presentP(datum)) {
                        final SubLObject value = file_vector_reference_referenced_object(datum);
                        if (file_vector_utilities.NIL != cache_utilities.cache_strategy_p(cache_strategy) && file_vector_utilities.NIL != file_vector_reference_present_pristineP(datum)) {
                            cache_utilities.cache_strategy_note_cache_hit(cache_strategy);
                            cache_utilities.cache_strategy_note_reference(cache_strategy, key);
                        }
                        return value;
                    }
                    if (file_vector_utilities.NIL != file_vector_reference_deletedP(datum)) {
                        return not_found;
                    }
                    if (file_vector_utilities.NIL != file_vector_reference_swapped_outP(datum)) {
                        if (file_vector_utilities.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && file_vector_utilities.NIL != subl_promotions.memberP(v_file_vector, file_vector_utilities.$file_vector_get_recursion_guard$.getDynamicValue(thread), (SubLObject)file_vector_utilities.UNPROVIDED, (SubLObject)file_vector_utilities.UNPROVIDED)) {
                            Errors.error((SubLObject)file_vector_utilities.$str51$We_are_already_using_that_file_ve, v_file_vector);
                        }
                        final SubLObject index = file_vector_reference_index(datum);
                        SubLObject payload = (SubLObject)file_vector_utilities.NIL;
                        final SubLObject _prev_bind_0 = file_vector_utilities.$file_vector_get_recursion_guard$.currentBinding(thread);
                        try {
                            file_vector_utilities.$file_vector_get_recursion_guard$.bind((SubLObject)ConsesLow.cons(v_file_vector, file_vector_utilities.$file_vector_get_recursion_guard$.getDynamicValue(thread)), thread);
                            kb_storage_logging.maybe_kb_storage_log_load_in_context(index, v_file_vector);
                            file_vector.position_file_vector(v_file_vector, index);
                            payload = file_vector_backed_map_read_value(file_vector.get_file_vector_data_stream(v_file_vector));
                        }
                        finally {
                            file_vector_utilities.$file_vector_get_recursion_guard$.rebind(_prev_bind_0, thread);
                        }
                        set_file_vector_reference_referenced_object(datum, payload);
                        if (file_vector_utilities.NIL != cache_utilities.cache_strategy_p(cache_strategy)) {
                            final SubLObject potential_loser = cache_utilities.cache_strategy_track(cache_strategy, key);
                            if (!potential_loser.eql(key)) {
                                swap_out_pristine_file_vector_backed_map_object(map, potential_loser);
                            }
                            cache_utilities.cache_strategy_note_cache_miss(cache_strategy);
                        }
                        return payload;
                    }
                    Errors.error((SubLObject)file_vector_utilities.$str52$Invalid_state_transition___A_is_n, datum);
                }
                return datum;
            }
            finally {
                if (file_vector_utilities.NIL != release) {
                    Locks.release_lock(data_stream_lock);
                }
            }
        }
        final SubLObject datum2 = map_utilities.map_get_without_values(map, key, not_found);
        if (file_vector_utilities.NIL != file_vector_reference_p(datum2)) {
            if (file_vector_utilities.NIL != file_vector_reference_presentP(datum2)) {
                final SubLObject value2 = file_vector_reference_referenced_object(datum2);
                if (file_vector_utilities.NIL != cache_utilities.cache_strategy_p(cache_strategy) && file_vector_utilities.NIL != file_vector_reference_present_pristineP(datum2)) {
                    cache_utilities.cache_strategy_note_cache_hit(cache_strategy);
                    cache_utilities.cache_strategy_note_reference(cache_strategy, key);
                }
                return value2;
            }
            if (file_vector_utilities.NIL != file_vector_reference_deletedP(datum2)) {
                return not_found;
            }
            if (file_vector_utilities.NIL != file_vector_reference_swapped_outP(datum2)) {
                if (file_vector_utilities.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && file_vector_utilities.NIL != subl_promotions.memberP(v_file_vector, file_vector_utilities.$file_vector_get_recursion_guard$.getDynamicValue(thread), (SubLObject)file_vector_utilities.UNPROVIDED, (SubLObject)file_vector_utilities.UNPROVIDED)) {
                    Errors.error((SubLObject)file_vector_utilities.$str51$We_are_already_using_that_file_ve, v_file_vector);
                }
                final SubLObject index2 = file_vector_reference_index(datum2);
                SubLObject payload2 = (SubLObject)file_vector_utilities.NIL;
                final SubLObject _prev_bind_2 = file_vector_utilities.$file_vector_get_recursion_guard$.currentBinding(thread);
                try {
                    file_vector_utilities.$file_vector_get_recursion_guard$.bind((SubLObject)ConsesLow.cons(v_file_vector, file_vector_utilities.$file_vector_get_recursion_guard$.getDynamicValue(thread)), thread);
                    kb_storage_logging.maybe_kb_storage_log_load_in_context(index2, v_file_vector);
                    file_vector.position_file_vector(v_file_vector, index2);
                    payload2 = file_vector_backed_map_read_value(file_vector.get_file_vector_data_stream(v_file_vector));
                }
                finally {
                    file_vector_utilities.$file_vector_get_recursion_guard$.rebind(_prev_bind_2, thread);
                }
                set_file_vector_reference_referenced_object(datum2, payload2);
                if (file_vector_utilities.NIL != cache_utilities.cache_strategy_p(cache_strategy)) {
                    final SubLObject potential_loser2 = cache_utilities.cache_strategy_track(cache_strategy, key);
                    if (!potential_loser2.eql(key)) {
                        swap_out_pristine_file_vector_backed_map_object(map, potential_loser2);
                    }
                    cache_utilities.cache_strategy_note_cache_miss(cache_strategy);
                }
                return payload2;
            }
            Errors.error((SubLObject)file_vector_utilities.$str52$Invalid_state_transition___A_is_n, datum2);
        }
        return datum2;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-vector-utilities.lisp", position = 19017L)
    public static SubLObject file_vector_backed_map_put(final SubLObject map, final SubLObject key, final SubLObject value) {
        return file_vector_backed_map_wX_cache_put(map, (SubLObject)file_vector_utilities.NIL, key, value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-vector-utilities.lisp", position = 19475L)
    public static SubLObject file_vector_backed_map_wX_cache_put(final SubLObject map, final SubLObject cache_strategy, final SubLObject key, final SubLObject value) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert file_vector_utilities.NIL != cache_utilities.cache_strategy_or_symbol_p(cache_strategy) : cache_strategy;
        final SubLObject data_stream_lock = file_vector_utilities.$file_vector_backed_map_read_lock$.getDynamicValue(thread);
        if (data_stream_lock.isLock()) {
            SubLObject release = (SubLObject)file_vector_utilities.NIL;
            try {
                release = Locks.seize_lock(data_stream_lock);
                final SubLObject current_value = map_utilities.map_get_without_values(map, key, (SubLObject)file_vector_utilities.$kw53$NOT_FOUND);
                SubLObject mutated_p = (SubLObject)file_vector_utilities.NIL;
                if (file_vector_utilities.NIL != file_vector_reference_p(current_value)) {
                    final SubLObject ref = current_value;
                    mark_file_vector_reference_as_mutated(ref);
                    set_file_vector_reference_referenced_object(ref, value);
                    kb_storage_logging.maybe_kb_storage_log_mutate(file_vector_reference_index(ref));
                    if (file_vector_utilities.NIL != cache_utilities.cache_strategy_p(cache_strategy)) {
                        cache_utilities.cache_strategy_untrack(cache_strategy, key);
                    }
                    mutated_p = (SubLObject)file_vector_utilities.$kw54$MUTATED;
                }
                else {
                    map_utilities.map_put(map, key, value);
                }
                return mutated_p;
            }
            finally {
                if (file_vector_utilities.NIL != release) {
                    Locks.release_lock(data_stream_lock);
                }
            }
        }
        final SubLObject current_value2 = map_utilities.map_get_without_values(map, key, (SubLObject)file_vector_utilities.$kw53$NOT_FOUND);
        SubLObject mutated_p2 = (SubLObject)file_vector_utilities.NIL;
        if (file_vector_utilities.NIL != file_vector_reference_p(current_value2)) {
            final SubLObject ref2 = current_value2;
            mark_file_vector_reference_as_mutated(ref2);
            set_file_vector_reference_referenced_object(ref2, value);
            kb_storage_logging.maybe_kb_storage_log_mutate(file_vector_reference_index(ref2));
            if (file_vector_utilities.NIL != cache_utilities.cache_strategy_p(cache_strategy)) {
                cache_utilities.cache_strategy_untrack(cache_strategy, key);
            }
            mutated_p2 = (SubLObject)file_vector_utilities.$kw54$MUTATED;
        }
        else {
            map_utilities.map_put(map, key, value);
        }
        return mutated_p2;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-vector-utilities.lisp", position = 20757L)
    public static SubLObject file_vector_backed_map_remove(final SubLObject map, final SubLObject key, SubLObject support_undo_p) {
        if (support_undo_p == file_vector_utilities.UNPROVIDED) {
            support_undo_p = (SubLObject)file_vector_utilities.NIL;
        }
        return file_vector_backed_map_wX_cache_remove(map, (SubLObject)file_vector_utilities.NIL, key, support_undo_p);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-vector-utilities.lisp", position = 21301L)
    public static SubLObject file_vector_backed_map_wX_cache_remove(final SubLObject map, final SubLObject cache_strategy, final SubLObject key, SubLObject support_undo_p) {
        if (support_undo_p == file_vector_utilities.UNPROVIDED) {
            support_undo_p = (SubLObject)file_vector_utilities.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert file_vector_utilities.NIL != cache_utilities.cache_strategy_or_symbol_p(cache_strategy) : cache_strategy;
        final SubLObject data_stream_lock = file_vector_utilities.$file_vector_backed_map_read_lock$.getDynamicValue(thread);
        if (data_stream_lock.isLock()) {
            SubLObject release = (SubLObject)file_vector_utilities.NIL;
            try {
                release = Locks.seize_lock(data_stream_lock);
                final SubLObject current_value = map_utilities.map_get_without_values(map, key, (SubLObject)file_vector_utilities.$kw53$NOT_FOUND);
                final SubLObject is_file_vector_reference = file_vector_reference_p(current_value);
                SubLObject deleted_p = (SubLObject)file_vector_utilities.NIL;
                if (file_vector_utilities.NIL != support_undo_p && file_vector_utilities.NIL != is_file_vector_reference) {
                    final SubLObject ref = current_value;
                    mark_file_vector_reference_as_deleted(ref);
                    deleted_p = (SubLObject)file_vector_utilities.$kw55$DELETED;
                }
                else {
                    map_utilities.map_remove(map, key);
                }
                if (file_vector_utilities.NIL != is_file_vector_reference && file_vector_utilities.NIL != cache_utilities.cache_strategy_p(cache_strategy)) {
                    cache_utilities.cache_strategy_untrack(cache_strategy, key);
                }
                return deleted_p;
            }
            finally {
                if (file_vector_utilities.NIL != release) {
                    Locks.release_lock(data_stream_lock);
                }
            }
        }
        final SubLObject current_value2 = map_utilities.map_get_without_values(map, key, (SubLObject)file_vector_utilities.$kw53$NOT_FOUND);
        final SubLObject is_file_vector_reference2 = file_vector_reference_p(current_value2);
        SubLObject deleted_p2 = (SubLObject)file_vector_utilities.NIL;
        if (file_vector_utilities.NIL != support_undo_p && file_vector_utilities.NIL != is_file_vector_reference2) {
            final SubLObject ref2 = current_value2;
            mark_file_vector_reference_as_deleted(ref2);
            deleted_p2 = (SubLObject)file_vector_utilities.$kw55$DELETED;
        }
        else {
            map_utilities.map_remove(map, key);
        }
        if (file_vector_utilities.NIL != is_file_vector_reference2 && file_vector_utilities.NIL != cache_utilities.cache_strategy_p(cache_strategy)) {
            cache_utilities.cache_strategy_untrack(cache_strategy, key);
        }
        return deleted_p2;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-vector-utilities.lisp", position = 22586L)
    public static SubLObject file_vector_backed_map_touch(final SubLObject map, final SubLObject key, SubLObject fvector) {
        if (fvector == file_vector_utilities.UNPROVIDED) {
            fvector = (SubLObject)file_vector_utilities.NIL;
        }
        return file_vector_backed_map_wX_cache_touch(map, (SubLObject)file_vector_utilities.NIL, key, fvector);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-vector-utilities.lisp", position = 23174L)
    public static SubLObject file_vector_backed_map_wX_cache_touch(final SubLObject map, final SubLObject cache_strategy, final SubLObject key, SubLObject fvector) {
        if (fvector == file_vector_utilities.UNPROVIDED) {
            fvector = (SubLObject)file_vector_utilities.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert file_vector_utilities.NIL != cache_utilities.cache_strategy_or_symbol_p(cache_strategy) : cache_strategy;
        final SubLObject data_stream_lock = file_vector_utilities.$file_vector_backed_map_read_lock$.getDynamicValue(thread);
        if (data_stream_lock.isLock()) {
            SubLObject release = (SubLObject)file_vector_utilities.NIL;
            try {
                release = Locks.seize_lock(data_stream_lock);
                final SubLObject current_value = map_utilities.map_get_without_values(map, key, (SubLObject)file_vector_utilities.$kw53$NOT_FOUND);
                SubLObject mutated_p = (SubLObject)file_vector_utilities.NIL;
                if (file_vector_utilities.NIL != file_vector_reference_p(current_value)) {
                    final SubLObject ref = current_value;
                    if (file_vector_utilities.NIL != file_vector_reference_swapped_outP(ref)) {
                        assert file_vector_utilities.NIL != file_vector.file_vector_p(fvector) : fvector;
                        file_vector_backed_map_wX_cache_get(map, fvector, cache_strategy, key, (SubLObject)file_vector_utilities.UNPROVIDED);
                    }
                    mark_file_vector_reference_as_mutated(ref);
                    final SubLObject index = file_vector_reference_index(ref);
                    if (file_vector_utilities.NIL != file_vector.file_vector_p(fvector)) {
                        kb_storage_logging.maybe_kb_storage_log_mutate_in_context(index, fvector);
                    }
                    else {
                        kb_storage_logging.maybe_kb_storage_log_mutate(index);
                    }
                    if (file_vector_utilities.NIL != cache_utilities.cache_strategy_p(cache_strategy)) {
                        cache_utilities.cache_strategy_untrack(cache_strategy, key);
                    }
                    mutated_p = (SubLObject)file_vector_utilities.$kw54$MUTATED;
                }
                return mutated_p;
            }
            finally {
                if (file_vector_utilities.NIL != release) {
                    Locks.release_lock(data_stream_lock);
                }
            }
        }
        final SubLObject current_value2 = map_utilities.map_get_without_values(map, key, (SubLObject)file_vector_utilities.$kw53$NOT_FOUND);
        SubLObject mutated_p2 = (SubLObject)file_vector_utilities.NIL;
        if (file_vector_utilities.NIL != file_vector_reference_p(current_value2)) {
            final SubLObject ref2 = current_value2;
            if (file_vector_utilities.NIL != file_vector_reference_swapped_outP(ref2)) {
                assert file_vector_utilities.NIL != file_vector.file_vector_p(fvector) : fvector;
                file_vector_backed_map_wX_cache_get(map, fvector, cache_strategy, key, (SubLObject)file_vector_utilities.UNPROVIDED);
            }
            mark_file_vector_reference_as_mutated(ref2);
            final SubLObject index2 = file_vector_reference_index(ref2);
            if (file_vector_utilities.NIL != file_vector.file_vector_p(fvector)) {
                kb_storage_logging.maybe_kb_storage_log_mutate_in_context(index2, fvector);
            }
            else {
                kb_storage_logging.maybe_kb_storage_log_mutate(index2);
            }
            if (file_vector_utilities.NIL != cache_utilities.cache_strategy_p(cache_strategy)) {
                cache_utilities.cache_strategy_untrack(cache_strategy, key);
            }
            mutated_p2 = (SubLObject)file_vector_utilities.$kw54$MUTATED;
        }
        return mutated_p2;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-vector-utilities.lisp", position = 24792L)
    public static SubLObject undo_change_to_file_vector_backed_map(final SubLObject map, final SubLObject key) {
        return undo_change_to_file_vector_backed_map_wX_cache(map, (SubLObject)file_vector_utilities.NIL, key);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-vector-utilities.lisp", position = 25171L)
    public static SubLObject undo_change_to_file_vector_backed_map_wX_cache(final SubLObject map, final SubLObject cache_strategy, final SubLObject key) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert file_vector_utilities.NIL != cache_utilities.cache_strategy_or_symbol_p(cache_strategy) : cache_strategy;
        final SubLObject data_stream_lock = file_vector_utilities.$file_vector_backed_map_read_lock$.getDynamicValue(thread);
        if (data_stream_lock.isLock()) {
            SubLObject release = (SubLObject)file_vector_utilities.NIL;
            try {
                release = Locks.seize_lock(data_stream_lock);
                final SubLObject current_value = map_utilities.map_get_without_values(map, key, (SubLObject)file_vector_utilities.$kw53$NOT_FOUND);
                SubLObject recovered_p = (SubLObject)file_vector_utilities.NIL;
                if (file_vector_utilities.NIL != file_vector_reference_p(current_value)) {
                    final SubLObject ref = current_value;
                    if (file_vector_utilities.NIL != fvector_ref_has_mutated_index_p(ref)) {
                        restore_file_vector_reference(ref);
                        if (file_vector_utilities.NIL != cache_utilities.cache_strategy_p(cache_strategy)) {
                            cache_utilities.cache_strategy_track(cache_strategy, key);
                            cache_utilities.cache_strategy_note_cache_miss(cache_strategy);
                        }
                        recovered_p = (SubLObject)file_vector_utilities.$kw57$RECOVERED;
                    }
                }
                return recovered_p;
            }
            finally {
                if (file_vector_utilities.NIL != release) {
                    Locks.release_lock(data_stream_lock);
                }
            }
        }
        final SubLObject current_value2 = map_utilities.map_get_without_values(map, key, (SubLObject)file_vector_utilities.$kw53$NOT_FOUND);
        SubLObject recovered_p2 = (SubLObject)file_vector_utilities.NIL;
        if (file_vector_utilities.NIL != file_vector_reference_p(current_value2)) {
            final SubLObject ref2 = current_value2;
            if (file_vector_utilities.NIL != fvector_ref_has_mutated_index_p(ref2)) {
                restore_file_vector_reference(ref2);
                if (file_vector_utilities.NIL != cache_utilities.cache_strategy_p(cache_strategy)) {
                    cache_utilities.cache_strategy_track(cache_strategy, key);
                    cache_utilities.cache_strategy_note_cache_miss(cache_strategy);
                }
                recovered_p2 = (SubLObject)file_vector_utilities.$kw57$RECOVERED;
            }
        }
        return recovered_p2;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-vector-utilities.lisp", position = 26258L)
    public static SubLObject do_file_vector_backed_map(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)file_vector_utilities.$list58);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject key = (SubLObject)file_vector_utilities.NIL;
        SubLObject value = (SubLObject)file_vector_utilities.NIL;
        SubLObject map = (SubLObject)file_vector_utilities.NIL;
        SubLObject v_file_vector = (SubLObject)file_vector_utilities.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)file_vector_utilities.$list58);
        key = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)file_vector_utilities.$list58);
        value = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)file_vector_utilities.$list58);
        map = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)file_vector_utilities.$list58);
        v_file_vector = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = (SubLObject)file_vector_utilities.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)file_vector_utilities.NIL;
        SubLObject current_$3 = (SubLObject)file_vector_utilities.NIL;
        while (file_vector_utilities.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)file_vector_utilities.$list58);
            current_$3 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)file_vector_utilities.$list58);
            if (file_vector_utilities.NIL == conses_high.member(current_$3, (SubLObject)file_vector_utilities.$list59, (SubLObject)file_vector_utilities.UNPROVIDED, (SubLObject)file_vector_utilities.UNPROVIDED)) {
                bad = (SubLObject)file_vector_utilities.T;
            }
            if (current_$3 == file_vector_utilities.$kw60$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (file_vector_utilities.NIL != bad && file_vector_utilities.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)file_vector_utilities.$list58);
        }
        final SubLObject done_tail = cdestructuring_bind.property_list_member((SubLObject)file_vector_utilities.$kw61$DONE, current);
        final SubLObject done = (SubLObject)((file_vector_utilities.NIL != done_tail) ? conses_high.cadr(done_tail) : file_vector_utilities.NIL);
        final SubLObject cache_strategy_tail = cdestructuring_bind.property_list_member((SubLObject)file_vector_utilities.$kw62$CACHE_STRATEGY, current);
        final SubLObject cache_strategy = (SubLObject)((file_vector_utilities.NIL != cache_strategy_tail) ? conses_high.cadr(cache_strategy_tail) : file_vector_utilities.NIL);
        final SubLObject body;
        current = (body = temp);
        final SubLObject impl_value = (SubLObject)file_vector_utilities.$sym63$IMPL_VALUE;
        return (SubLObject)ConsesLow.list((SubLObject)file_vector_utilities.$sym39$CLET, (SubLObject)ConsesLow.list(value), (SubLObject)ConsesLow.list((SubLObject)file_vector_utilities.$sym64$DO_MAP, (SubLObject)ConsesLow.list(key, impl_value, map, (SubLObject)file_vector_utilities.$kw61$DONE, done), (SubLObject)ConsesLow.listS((SubLObject)file_vector_utilities.$sym65$PUNLESS, (SubLObject)ConsesLow.list((SubLObject)file_vector_utilities.$sym66$CAND, (SubLObject)ConsesLow.list((SubLObject)file_vector_utilities.$sym5$FILE_VECTOR_REFERENCE_P, impl_value), (SubLObject)ConsesLow.list((SubLObject)file_vector_utilities.$sym67$FILE_VECTOR_REFERENCE_DELETED_, impl_value)), (SubLObject)ConsesLow.list((SubLObject)file_vector_utilities.$sym68$CSETQ, value, (SubLObject)ConsesLow.list((SubLObject)file_vector_utilities.$sym69$FILE_VECTOR_BACKED_MAP_W__CACHE_GET, map, v_file_vector, cache_strategy, key)), ConsesLow.append(body, (SubLObject)file_vector_utilities.NIL))));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-vector-utilities.lisp", position = 26952L)
    public static SubLObject new_file_vector_backed_map_iterator(final SubLObject map, final SubLObject v_file_vector, SubLObject common_symbols, SubLObject cache_strategy) {
        if (common_symbols == file_vector_utilities.UNPROVIDED) {
            common_symbols = (SubLObject)file_vector_utilities.NIL;
        }
        if (cache_strategy == file_vector_utilities.UNPROVIDED) {
            cache_strategy = (SubLObject)file_vector_utilities.NIL;
        }
        if (file_vector_utilities.NIL == common_symbols) {
            common_symbols = cfasl.cfasl_current_common_symbols();
        }
        return iteration.new_iterator(new_file_vector_backed_map_iterator_state(map, v_file_vector, common_symbols, cache_strategy), (SubLObject)file_vector_utilities.$sym70$FILE_VECTOR_BACKED_MAP_ITERATOR_DONE, (SubLObject)file_vector_utilities.$sym71$FILE_VECTOR_BACKED_MAP_ITERATOR_NEXT, (SubLObject)file_vector_utilities.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-vector-utilities.lisp", position = 27649L)
    public static SubLObject new_file_vector_backed_map_iterator_state(final SubLObject map, final SubLObject v_file_vector, final SubLObject common_symbols, final SubLObject cache_strategy) {
        final SubLObject iterator = map_utilities.new_map_iterator(map);
        final SubLObject curr_item = iteration.iteration_next(iterator);
        return (SubLObject)ConsesLow.list(curr_item, iterator, map, v_file_vector, common_symbols, cache_strategy);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-vector-utilities.lisp", position = 27937L)
    public static SubLObject file_vector_backed_map_iterator_done(final SubLObject state) {
        SubLObject curr_item = (SubLObject)file_vector_utilities.NIL;
        SubLObject iterator = (SubLObject)file_vector_utilities.NIL;
        SubLObject map = (SubLObject)file_vector_utilities.NIL;
        SubLObject v_file_vector = (SubLObject)file_vector_utilities.NIL;
        SubLObject common_symbols = (SubLObject)file_vector_utilities.NIL;
        SubLObject cache_strategy = (SubLObject)file_vector_utilities.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(state, state, (SubLObject)file_vector_utilities.$list72);
        curr_item = state.first();
        SubLObject current = state.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, state, (SubLObject)file_vector_utilities.$list72);
        iterator = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, state, (SubLObject)file_vector_utilities.$list72);
        map = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, state, (SubLObject)file_vector_utilities.$list72);
        v_file_vector = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, state, (SubLObject)file_vector_utilities.$list72);
        common_symbols = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, state, (SubLObject)file_vector_utilities.$list72);
        cache_strategy = current.first();
        current = current.rest();
        if (file_vector_utilities.NIL == current) {
            return (SubLObject)SubLObjectFactory.makeBoolean(file_vector_utilities.NIL != iteration.iteration_done(iterator) && file_vector_utilities.NIL == curr_item);
        }
        cdestructuring_bind.cdestructuring_bind_error(state, (SubLObject)file_vector_utilities.$list72);
        return (SubLObject)file_vector_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-vector-utilities.lisp", position = 28318L)
    public static SubLObject file_vector_backed_map_iterator_next(final SubLObject state) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject curr_item = (SubLObject)file_vector_utilities.NIL;
        SubLObject iterator = (SubLObject)file_vector_utilities.NIL;
        SubLObject map = (SubLObject)file_vector_utilities.NIL;
        SubLObject v_file_vector = (SubLObject)file_vector_utilities.NIL;
        SubLObject common_symbols = (SubLObject)file_vector_utilities.NIL;
        SubLObject cache_strategy = (SubLObject)file_vector_utilities.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(state, state, (SubLObject)file_vector_utilities.$list72);
        curr_item = state.first();
        SubLObject current = state.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, state, (SubLObject)file_vector_utilities.$list72);
        iterator = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, state, (SubLObject)file_vector_utilities.$list72);
        map = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, state, (SubLObject)file_vector_utilities.$list72);
        v_file_vector = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, state, (SubLObject)file_vector_utilities.$list72);
        common_symbols = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, state, (SubLObject)file_vector_utilities.$list72);
        cache_strategy = current.first();
        current = current.rest();
        if (file_vector_utilities.NIL == current) {
            SubLObject value = state;
            SubLObject key = (SubLObject)file_vector_utilities.NIL;
            while (value.eql(state)) {
                key = curr_item.first();
                final SubLObject _prev_bind_0 = cfasl.$cfasl_common_symbols$.currentBinding(thread);
                try {
                    cfasl.$cfasl_common_symbols$.bind((SubLObject)file_vector_utilities.NIL, thread);
                    cfasl.cfasl_set_common_symbols_simple(common_symbols);
                    value = file_vector_backed_map_wX_cache_get(map, v_file_vector, cache_strategy, key, state);
                }
                finally {
                    cfasl.$cfasl_common_symbols$.rebind(_prev_bind_0, thread);
                }
                if (value.eql(state) && file_vector_utilities.NIL != iteration.iteration_done(iterator)) {
                    ConsesLow.set_nth((SubLObject)file_vector_utilities.ZERO_INTEGER, state, (SubLObject)file_vector_utilities.NIL);
                    return subl_promotions.values3((SubLObject)file_vector_utilities.NIL, state, (SubLObject)file_vector_utilities.$kw73$ITERATION_HALTED_PREMATURELY);
                }
                final SubLObject next_item = iteration.iteration_next(iterator);
                ConsesLow.set_nth((SubLObject)file_vector_utilities.ZERO_INTEGER, state, next_item);
                curr_item = next_item;
            }
            curr_item = (SubLObject)ConsesLow.list(key, value);
            return subl_promotions.values3(curr_item, state, (SubLObject)file_vector_utilities.NIL);
        }
        cdestructuring_bind.cdestructuring_bind_error(state, (SubLObject)file_vector_utilities.$list72);
        return (SubLObject)file_vector_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-vector-utilities.lisp", position = 29400L)
    public static SubLObject file_vector_backed_map_cache_ratio(final SubLObject map) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject paged_in = (SubLObject)file_vector_utilities.ZERO_INTEGER;
        SubLObject paged_out = (SubLObject)file_vector_utilities.ZERO_INTEGER;
        final SubLObject iterator = map_utilities.new_map_iterator(map);
        SubLObject valid;
        for (SubLObject done_var = (SubLObject)file_vector_utilities.NIL; file_vector_utilities.NIL == done_var; done_var = (SubLObject)SubLObjectFactory.makeBoolean(file_vector_utilities.NIL == valid)) {
            thread.resetMultipleValues();
            final SubLObject var = iteration.iteration_next(iterator);
            valid = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (file_vector_utilities.NIL != valid) {
                SubLObject current;
                final SubLObject datum = current = var;
                SubLObject key = (SubLObject)file_vector_utilities.NIL;
                SubLObject value = (SubLObject)file_vector_utilities.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)file_vector_utilities.$list2);
                key = current.first();
                current = current.rest();
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)file_vector_utilities.$list2);
                value = current.first();
                current = current.rest();
                if (file_vector_utilities.NIL == current) {
                    if (file_vector_utilities.NIL != file_vector_reference_p(value)) {
                        if (file_vector_utilities.NIL != file_vector_reference_presentP(value)) {
                            paged_in = Numbers.add(paged_in, (SubLObject)file_vector_utilities.ONE_INTEGER);
                        }
                        else if (file_vector_utilities.NIL != file_vector_reference_swapped_outP(value)) {
                            paged_out = Numbers.add(paged_out, (SubLObject)file_vector_utilities.ONE_INTEGER);
                        }
                    }
                    else {
                        paged_in = Numbers.add(paged_in, (SubLObject)file_vector_utilities.ONE_INTEGER);
                    }
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)file_vector_utilities.$list2);
                }
            }
        }
        return Values.values(paged_in, paged_out);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-vector-utilities.lisp", position = 30080L)
    public static SubLObject swap_out_all_pristine_file_vector_backed_map_objects(final SubLObject map) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject swapped_out = (SubLObject)file_vector_utilities.ZERO_INTEGER;
        final SubLObject iterator = map_utilities.new_map_iterator(map);
        SubLObject valid;
        for (SubLObject done_var = (SubLObject)file_vector_utilities.NIL; file_vector_utilities.NIL == done_var; done_var = (SubLObject)SubLObjectFactory.makeBoolean(file_vector_utilities.NIL == valid)) {
            thread.resetMultipleValues();
            final SubLObject var = iteration.iteration_next(iterator);
            valid = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (file_vector_utilities.NIL != valid) {
                SubLObject current;
                final SubLObject datum = current = var;
                SubLObject key = (SubLObject)file_vector_utilities.NIL;
                SubLObject value = (SubLObject)file_vector_utilities.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)file_vector_utilities.$list2);
                key = current.first();
                current = current.rest();
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)file_vector_utilities.$list2);
                value = current.first();
                current = current.rest();
                if (file_vector_utilities.NIL == current) {
                    if (file_vector_utilities.NIL != potentially_swap_out_pristine_file_vector_backed_map_object(value)) {
                        swapped_out = Numbers.add(swapped_out, (SubLObject)file_vector_utilities.ONE_INTEGER);
                    }
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)file_vector_utilities.$list2);
                }
            }
        }
        return Values.values(map, swapped_out);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-vector-utilities.lisp", position = 30605L)
    public static SubLObject swap_out_pristine_file_vector_backed_map_object(final SubLObject map, final SubLObject key) {
        final SubLObject value = map_utilities.map_get(map, key, (SubLObject)file_vector_utilities.UNPROVIDED);
        return potentially_swap_out_pristine_file_vector_backed_map_object(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-vector-utilities.lisp", position = 31016L)
    public static SubLObject potentially_swap_out_pristine_file_vector_backed_map_object(final SubLObject value) {
        if (file_vector_utilities.NIL != file_vector_reference_p(value) && file_vector_utilities.NIL != file_vector_reference_present_pristineP(value)) {
            kb_storage_logging.maybe_kb_storage_log_page_out(file_vector_reference_index(value));
            clear_file_vector_reference_referenced_object(value);
            return (SubLObject)file_vector_utilities.T;
        }
        return (SubLObject)file_vector_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-vector-utilities.lisp", position = 31648L)
    public static SubLObject compact_file_vector_backed_map_representation(final SubLObject map) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject iterator = map_utilities.new_map_iterator(map);
        SubLObject valid;
        for (SubLObject done_var = (SubLObject)file_vector_utilities.NIL; file_vector_utilities.NIL == done_var; done_var = (SubLObject)SubLObjectFactory.makeBoolean(file_vector_utilities.NIL == valid)) {
            thread.resetMultipleValues();
            final SubLObject var = iteration.iteration_next(iterator);
            valid = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (file_vector_utilities.NIL != valid) {
                SubLObject current;
                final SubLObject datum = current = var;
                SubLObject key = (SubLObject)file_vector_utilities.NIL;
                SubLObject value = (SubLObject)file_vector_utilities.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)file_vector_utilities.$list2);
                key = current.first();
                current = current.rest();
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)file_vector_utilities.$list2);
                value = current.first();
                current = current.rest();
                if (file_vector_utilities.NIL == current) {
                    if (file_vector_utilities.NIL != file_vector_reference_p(value)) {
                        if (file_vector_utilities.NIL != file_vector_reference_deletedP(value)) {
                            map_utilities.map_remove(map, key);
                        }
                        else if (file_vector_utilities.NIL != file_vector_reference_present_mutatedP(value)) {
                            final SubLObject payload = file_vector_reference_referenced_object(value);
                            map_utilities.map_put(map, key, payload);
                        }
                    }
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)file_vector_utilities.$list2);
                }
            }
        }
        return map;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-vector-utilities.lisp", position = 32252L)
    public static SubLObject file_vector_index_from_map_element_number(final SubLObject elem_num) {
        final SubLObject key_index = Numbers.multiply(elem_num, (SubLObject)file_vector_utilities.TWO_INTEGER);
        return file_vector_value_index_from_key_index(key_index);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-vector-utilities.lisp", position = 32652L)
    public static SubLObject file_vector_value_index_from_key_index(final SubLObject key_index) {
        return Numbers.add(key_index, (SubLObject)file_vector_utilities.ONE_INTEGER);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-vector-utilities.lisp", position = 32873L)
    public static SubLObject map_size_from_file_vector_length(final SubLObject v_file_vector) {
        return Numbers.integerDivide(file_vector.file_vector_length(v_file_vector), (SubLObject)file_vector_utilities.TWO_INTEGER);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-vector-utilities.lisp", position = 33174L)
    public static SubLObject file_vector_backed_map_read_key(final SubLObject data_stream) {
        return cfasl.cfasl_input(data_stream, (SubLObject)file_vector_utilities.UNPROVIDED, (SubLObject)file_vector_utilities.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-vector-utilities.lisp", position = 33275L)
    public static SubLObject file_vector_backed_map_read_value(final SubLObject data_stream) {
        return cfasl.cfasl_input(data_stream, (SubLObject)file_vector_utilities.UNPROVIDED, (SubLObject)file_vector_utilities.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-vector-utilities.lisp", position = 33375L)
    public static SubLObject convert_map_to_file_vector_backed_map(final SubLObject map, final SubLObject v_file_vector, SubLObject swapped_out_p, SubLObject compact_p) {
        if (swapped_out_p == file_vector_utilities.UNPROVIDED) {
            swapped_out_p = (SubLObject)file_vector_utilities.NIL;
        }
        if (compact_p == file_vector_utilities.UNPROVIDED) {
            compact_p = (SubLObject)file_vector_utilities.NIL;
        }
        return build_file_vector_backed_map_from_map(map, map, v_file_vector, swapped_out_p, compact_p);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-vector-utilities.lisp", position = 33823L)
    public static SubLObject create_file_vector_backed_map_from_map(final SubLObject old_map, final SubLObject v_file_vector, SubLObject swapped_out_p, SubLObject compact_p) {
        if (swapped_out_p == file_vector_utilities.UNPROVIDED) {
            swapped_out_p = (SubLObject)file_vector_utilities.NIL;
        }
        if (compact_p == file_vector_utilities.UNPROVIDED) {
            compact_p = (SubLObject)file_vector_utilities.NIL;
        }
        final SubLObject new_map = map_utilities.new_map_with_same_properties(old_map);
        return build_file_vector_backed_map_from_map(old_map, new_map, v_file_vector, swapped_out_p, compact_p);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-vector-utilities.lisp", position = 34399L)
    public static SubLObject populate_file_vector_backed_map_from_map(final SubLObject old_map, final SubLObject new_map, final SubLObject v_file_vector, SubLObject swapped_out_p, SubLObject compact_p) {
        if (swapped_out_p == file_vector_utilities.UNPROVIDED) {
            swapped_out_p = (SubLObject)file_vector_utilities.NIL;
        }
        if (compact_p == file_vector_utilities.UNPROVIDED) {
            compact_p = (SubLObject)file_vector_utilities.NIL;
        }
        return build_file_vector_backed_map_from_map(old_map, new_map, v_file_vector, swapped_out_p, compact_p);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-vector-utilities.lisp", position = 34650L)
    public static SubLObject build_file_vector_backed_map_from_map(final SubLObject old_map, final SubLObject new_map, final SubLObject v_file_vector, SubLObject swapped_out_p, SubLObject compact_p) {
        if (swapped_out_p == file_vector_utilities.UNPROVIDED) {
            swapped_out_p = (SubLObject)file_vector_utilities.NIL;
        }
        if (compact_p == file_vector_utilities.UNPROVIDED) {
            compact_p = (SubLObject)file_vector_utilities.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (file_vector_utilities.NIL == compact_p) {
            write_file_vector_backing_map_prologue(new_map, v_file_vector);
        }
        final SubLObject iterator = map_utilities.new_map_iterator(old_map);
        SubLObject valid;
        for (SubLObject done_var = (SubLObject)file_vector_utilities.NIL; file_vector_utilities.NIL == done_var; done_var = (SubLObject)SubLObjectFactory.makeBoolean(file_vector_utilities.NIL == valid)) {
            thread.resetMultipleValues();
            final SubLObject var = iteration.iteration_next(iterator);
            valid = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (file_vector_utilities.NIL != valid) {
                SubLObject current;
                final SubLObject datum = current = var;
                SubLObject key = (SubLObject)file_vector_utilities.NIL;
                SubLObject value = (SubLObject)file_vector_utilities.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)file_vector_utilities.$list2);
                key = current.first();
                current = current.rest();
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)file_vector_utilities.$list2);
                value = current.first();
                current = current.rest();
                if (file_vector_utilities.NIL == current) {
                    if (file_vector_utilities.NIL == file_vector_reference_p(value) || file_vector_utilities.NIL == file_vector_reference_deletedP(value)) {
                        if (file_vector_utilities.NIL != file_vector_reference_p(value) && file_vector_utilities.NIL == file_vector_reference_presentP(value)) {
                            Errors.warn((SubLObject)file_vector_utilities.$str74$Cannot_convert_a_file_backed_map_, old_map, value);
                        }
                        else {
                            if (file_vector_utilities.NIL != file_vector_reference_p(value)) {
                                value = file_vector_reference_referenced_object(value);
                            }
                            SubLObject value_index = (SubLObject)file_vector_utilities.NIL;
                            if (file_vector_utilities.NIL != compact_p) {
                                value_index = write_file_vector_backing_map_entry_value(value, v_file_vector, (SubLObject)file_vector_utilities.UNPROVIDED);
                            }
                            else {
                                final SubLObject key_index = write_file_vector_backing_map_entry(key, value, v_file_vector);
                                value_index = file_vector_value_index_from_key_index(key_index);
                            }
                            final SubLObject reference = (file_vector_utilities.NIL != swapped_out_p) ? new_file_vector_reference(value_index) : new_file_vector_reference_wX_payload(value_index, value);
                            map_utilities.map_put(new_map, key, reference);
                        }
                    }
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)file_vector_utilities.$list2);
                }
            }
        }
        return new_map;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-vector-utilities.lisp", position = 36686L)
    public static SubLObject upgrade_map_to_file_vector_backed_map(final SubLObject map, final SubLObject v_file_vector, SubLObject swapped_out_p) {
        if (swapped_out_p == file_vector_utilities.UNPROVIDED) {
            swapped_out_p = (SubLObject)file_vector_utilities.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject iterator = map_utilities.new_map_iterator(map);
        SubLObject valid;
        for (SubLObject done_var = (SubLObject)file_vector_utilities.NIL; file_vector_utilities.NIL == done_var; done_var = (SubLObject)SubLObjectFactory.makeBoolean(file_vector_utilities.NIL == valid)) {
            thread.resetMultipleValues();
            final SubLObject var = iteration.iteration_next(iterator);
            valid = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (file_vector_utilities.NIL != valid) {
                SubLObject current;
                final SubLObject datum = current = var;
                SubLObject key = (SubLObject)file_vector_utilities.NIL;
                SubLObject value = (SubLObject)file_vector_utilities.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)file_vector_utilities.$list2);
                key = current.first();
                current = current.rest();
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)file_vector_utilities.$list2);
                value = current.first();
                current = current.rest();
                if (file_vector_utilities.NIL == current) {
                    if (file_vector_utilities.NIL != file_vector_reference_p(value)) {
                        if (file_vector_utilities.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && file_vector_utilities.NIL != file_vector_reference_deletedP(value)) {
                            Errors.error((SubLObject)file_vector_utilities.$str75$Cannot_upgrade_a_map_with_a_delet, key, value);
                        }
                        if (file_vector_utilities.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && file_vector_utilities.NIL != file_vector_reference_present_mutatedP(value)) {
                            Errors.error((SubLObject)file_vector_utilities.$str76$Cannot_upgrade_a_map_with_muted_f, key, value);
                        }
                    }
                    else {
                        final SubLObject value_index = write_file_vector_backing_map_entry_value(value, v_file_vector, (SubLObject)file_vector_utilities.UNPROVIDED);
                        final SubLObject reference = (file_vector_utilities.NIL != swapped_out_p) ? new_file_vector_reference(value_index) : new_file_vector_reference_wX_payload(value_index, value);
                        map_utilities.map_put(map, key, reference);
                    }
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)file_vector_utilities.$list2);
                }
            }
        }
        return map;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-vector-utilities.lisp", position = 38549L)
    public static SubLObject file_vector_indexical_p(final SubLObject v_object) {
        return Types.keywordp(v_object);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-vector-utilities.lisp", position = 38625L)
    public static SubLObject register_indexical_file_vector_reference(final SubLObject indexical, final SubLObject v_file_vector) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        enforceType(indexical, file_vector_utilities.$sym79$FILE_VECTOR_INDEXICAL_P);
        enforceType(v_file_vector, file_vector_utilities.$sym56$FILE_VECTOR_P);
        if (file_vector_utilities.NIL == subl_promotions.memberP(indexical, dumper.kb_dump_default_common_symbols(), (SubLObject)file_vector_utilities.UNPROVIDED, (SubLObject)file_vector_utilities.UNPROVIDED)) {
            Errors.warn((SubLObject)file_vector_utilities.$str80$File_Vector_indexical__S_is_not_a, indexical);
        }
        final SubLObject current = map_utilities.map_get_without_values(file_vector_utilities.$file_vector_indexical_registry$.getGlobalValue(), indexical, (SubLObject)file_vector_utilities.UNPROVIDED);
        if (file_vector_utilities.NIL != file_vector.file_vector_p(current)) {
            SubLObject ignore_errors_tag = (SubLObject)file_vector_utilities.NIL;
            try {
                thread.throwStack.push(file_vector_utilities.$kw81$IGNORE_ERRORS_TARGET);
                final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
                try {
                    Errors.$error_handler$.bind(Symbols.symbol_function((SubLObject)file_vector_utilities.$sym82$IGNORE_ERRORS_HANDLER), thread);
                    try {
                        file_vector.close_file_vector(current);
                    }
                    catch (Throwable catch_var) {
                        Errors.handleThrowable(catch_var, (SubLObject)file_vector_utilities.NIL);
                    }
                }
                finally {
                    Errors.$error_handler$.rebind(_prev_bind_0, thread);
                }
            }
            catch (Throwable ccatch_env_var) {
                ignore_errors_tag = Errors.handleThrowable(ccatch_env_var, (SubLObject)file_vector_utilities.$kw81$IGNORE_ERRORS_TARGET);
            }
            finally {
                thread.throwStack.pop();
            }
        }
        map_utilities.map_put(file_vector_utilities.$file_vector_indexical_registry$.getGlobalValue(), indexical, v_file_vector);
        map_utilities.map_put(file_vector_utilities.$file_vector_indexical_lock_registry$.getGlobalValue(), indexical, Locks.make_lock(Sequences.cconcatenate((SubLObject)file_vector_utilities.$str83$Lock_for_File_Vector_, format_nil.format_nil_s_no_copy(indexical))));
        return indexical;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-vector-utilities.lisp", position = 39522L)
    public static SubLObject dereference_file_vector_indexical(final SubLObject indexical, SubLObject not_found) {
        if (not_found == file_vector_utilities.UNPROVIDED) {
            not_found = (SubLObject)file_vector_utilities.NIL;
        }
        assert file_vector_utilities.NIL != file_vector_indexical_p(indexical) : indexical;
        return map_utilities.map_get_without_values(file_vector_utilities.$file_vector_indexical_registry$.getGlobalValue(), indexical, not_found);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-vector-utilities.lisp", position = 39790L)
    public static SubLObject dereference_file_vector_indexical_lock(final SubLObject indexical, SubLObject not_found) {
        if (not_found == file_vector_utilities.UNPROVIDED) {
            not_found = (SubLObject)file_vector_utilities.NIL;
        }
        assert file_vector_utilities.NIL != file_vector_indexical_p(indexical) : indexical;
        return map_utilities.map_get_without_values(file_vector_utilities.$file_vector_indexical_lock_registry$.getGlobalValue(), indexical, not_found);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-vector-utilities.lisp", position = 40409L)
    public static SubLObject backed_map_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        print_backed_map(v_object, stream, (SubLObject)file_vector_utilities.ZERO_INTEGER);
        return (SubLObject)file_vector_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-vector-utilities.lisp", position = 40409L)
    public static SubLObject backed_map_p(final SubLObject v_object) {
        return (SubLObject)((v_object.getClass() == $backed_map_native.class) ? file_vector_utilities.T : file_vector_utilities.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-vector-utilities.lisp", position = 40409L)
    public static SubLObject backed_map_map(final SubLObject v_object) {
        assert file_vector_utilities.NIL != backed_map_p(v_object) : v_object;
        return v_object.getField2();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-vector-utilities.lisp", position = 40409L)
    public static SubLObject backed_map_fvector(final SubLObject v_object) {
        assert file_vector_utilities.NIL != backed_map_p(v_object) : v_object;
        return v_object.getField3();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-vector-utilities.lisp", position = 40409L)
    public static SubLObject backed_map_common_symbols(final SubLObject v_object) {
        assert file_vector_utilities.NIL != backed_map_p(v_object) : v_object;
        return v_object.getField4();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-vector-utilities.lisp", position = 40409L)
    public static SubLObject _csetf_backed_map_map(final SubLObject v_object, final SubLObject value) {
        assert file_vector_utilities.NIL != backed_map_p(v_object) : v_object;
        return v_object.setField2(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-vector-utilities.lisp", position = 40409L)
    public static SubLObject _csetf_backed_map_fvector(final SubLObject v_object, final SubLObject value) {
        assert file_vector_utilities.NIL != backed_map_p(v_object) : v_object;
        return v_object.setField3(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-vector-utilities.lisp", position = 40409L)
    public static SubLObject _csetf_backed_map_common_symbols(final SubLObject v_object, final SubLObject value) {
        assert file_vector_utilities.NIL != backed_map_p(v_object) : v_object;
        return v_object.setField4(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-vector-utilities.lisp", position = 40409L)
    public static SubLObject make_backed_map(SubLObject arglist) {
        if (arglist == file_vector_utilities.UNPROVIDED) {
            arglist = (SubLObject)file_vector_utilities.NIL;
        }
        final SubLObject v_new = (SubLObject)new $backed_map_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = (SubLObject)file_vector_utilities.NIL, next = arglist; file_vector_utilities.NIL != next; next = conses_high.cddr(next)) {
            current_arg = next.first();
            current_value = conses_high.cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql((SubLObject)file_vector_utilities.$kw99$MAP)) {
                _csetf_backed_map_map(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)file_vector_utilities.$kw100$FVECTOR)) {
                _csetf_backed_map_fvector(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)file_vector_utilities.$kw101$COMMON_SYMBOLS)) {
                _csetf_backed_map_common_symbols(v_new, current_value);
            }
            else {
                Errors.error((SubLObject)file_vector_utilities.$str19$Invalid_slot__S_for_construction_, current_arg);
            }
        }
        return v_new;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-vector-utilities.lisp", position = 40409L)
    public static SubLObject visit_defstruct_backed_map(final SubLObject obj, final SubLObject visitor_fn) {
        Functions.funcall(visitor_fn, obj, (SubLObject)file_vector_utilities.$kw20$BEGIN, (SubLObject)file_vector_utilities.$sym102$MAKE_BACKED_MAP, (SubLObject)file_vector_utilities.THREE_INTEGER);
        Functions.funcall(visitor_fn, obj, (SubLObject)file_vector_utilities.$kw22$SLOT, (SubLObject)file_vector_utilities.$kw99$MAP, backed_map_map(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)file_vector_utilities.$kw22$SLOT, (SubLObject)file_vector_utilities.$kw100$FVECTOR, backed_map_fvector(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)file_vector_utilities.$kw22$SLOT, (SubLObject)file_vector_utilities.$kw101$COMMON_SYMBOLS, backed_map_common_symbols(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)file_vector_utilities.$kw23$END, (SubLObject)file_vector_utilities.$sym102$MAKE_BACKED_MAP, (SubLObject)file_vector_utilities.THREE_INTEGER);
        return obj;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-vector-utilities.lisp", position = 40409L)
    public static SubLObject visit_defstruct_object_backed_map_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_backed_map(obj, visitor_fn);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-vector-utilities.lisp", position = 40697L)
    public static SubLObject new_backed_map(final SubLObject map, final SubLObject fvector, SubLObject common_symbols) {
        if (common_symbols == file_vector_utilities.UNPROVIDED) {
            common_symbols = (SubLObject)file_vector_utilities.NIL;
        }
        assert file_vector_utilities.NIL != map_utilities.map_p(map) : map;
        if (file_vector_utilities.NIL != fvector && file_vector_utilities.NIL == file_vector_indexical_p(fvector) && !file_vector_utilities.assertionsDisabledSynth && file_vector_utilities.NIL == file_vector.file_vector_p(fvector)) {
            throw new AssertionError(fvector);
        }
        final SubLObject b_map = make_backed_map((SubLObject)file_vector_utilities.UNPROVIDED);
        _csetf_backed_map_map(b_map, map);
        _csetf_backed_map_fvector(b_map, fvector);
        _csetf_backed_map_common_symbols(b_map, common_symbols);
        return b_map;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-vector-utilities.lisp", position = 41244L)
    public static SubLObject new_backed_map_from_files(final SubLObject map, final SubLObject data_file, final SubLObject index_file, SubLObject common_symbols) {
        if (common_symbols == file_vector_utilities.UNPROVIDED) {
            common_symbols = (SubLObject)file_vector_utilities.NIL;
        }
        final SubLObject fvector = file_vector.new_file_vector(data_file, index_file, (SubLObject)file_vector_utilities.UNPROVIDED, (SubLObject)file_vector_utilities.UNPROVIDED, (SubLObject)file_vector_utilities.UNPROVIDED, (SubLObject)file_vector_utilities.UNPROVIDED);
        return new_backed_map(map, fvector, common_symbols);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-vector-utilities.lisp", position = 41526L)
    public static SubLObject with_backed_map_common_symbols(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)file_vector_utilities.$list105);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject backed_map = (SubLObject)file_vector_utilities.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)file_vector_utilities.$list105);
        backed_map = current.first();
        current = current.rest();
        if (file_vector_utilities.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            final SubLObject common_symbols = (SubLObject)file_vector_utilities.$sym106$COMMON_SYMBOLS;
            return (SubLObject)ConsesLow.list((SubLObject)file_vector_utilities.$sym39$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(common_symbols, (SubLObject)ConsesLow.list((SubLObject)file_vector_utilities.$sym97$BACKED_MAP_COMMON_SYMBOLS, backed_map))), (SubLObject)ConsesLow.listS((SubLObject)file_vector_utilities.$sym107$WITH_CFASL_COMMON_SYMBOLS_SIMPLE, common_symbols, ConsesLow.append(body, (SubLObject)file_vector_utilities.NIL)));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)file_vector_utilities.$list105);
        return (SubLObject)file_vector_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-vector-utilities.lisp", position = 41869L)
    public static SubLObject print_backed_map(final SubLObject v_object, final SubLObject stream, final SubLObject depth) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (file_vector_utilities.NIL != print_high.$print_readably$.getDynamicValue(thread)) {
            print_high.print_not_readable(v_object, stream);
        }
        else {
            print_macros.print_unreadable_object_preamble(stream, v_object, (SubLObject)file_vector_utilities.T, (SubLObject)file_vector_utilities.T);
            streams_high.write_string((SubLObject)file_vector_utilities.$str108$_Map_, stream, (SubLObject)file_vector_utilities.UNPROVIDED, (SubLObject)file_vector_utilities.UNPROVIDED);
            print_high.princ(backed_map_map(v_object), stream);
            streams_high.write_string((SubLObject)file_vector_utilities.$str109$_FVector_, stream, (SubLObject)file_vector_utilities.UNPROVIDED, (SubLObject)file_vector_utilities.UNPROVIDED);
            print_high.princ(backed_map_fvector(v_object), stream);
            streams_high.write_string((SubLObject)file_vector_utilities.$str110$_CFASL_ComSym_, stream, (SubLObject)file_vector_utilities.UNPROVIDED, (SubLObject)file_vector_utilities.UNPROVIDED);
            print_high.princ(Sequences.length(backed_map_common_symbols(v_object)), stream);
            streams_high.write_string((SubLObject)file_vector_utilities.$str111$_, stream, (SubLObject)file_vector_utilities.UNPROVIDED, (SubLObject)file_vector_utilities.UNPROVIDED);
            print_macros.print_unreadable_object_postamble(stream, v_object, (SubLObject)file_vector_utilities.T, (SubLObject)file_vector_utilities.T);
        }
        return v_object;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-vector-utilities.lisp", position = 42322L)
    public static SubLObject new_future_backed_map(final SubLObject map) {
        return new_backed_map(map, (SubLObject)file_vector_utilities.NIL, (SubLObject)file_vector_utilities.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-vector-utilities.lisp", position = 42504L)
    public static SubLObject new_indexical_backed_map(final SubLObject map, final SubLObject indexical) {
        enforceType(indexical, file_vector_utilities.$sym79$FILE_VECTOR_INDEXICAL_P);
        return new_backed_map(map, indexical, (SubLObject)file_vector_utilities.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-vector-utilities.lisp", position = 42792L)
    public static SubLObject reconnect_backed_map(final SubLObject backed_map, final SubLObject fvector, SubLObject common_symbols) {
        if (common_symbols == file_vector_utilities.UNPROVIDED) {
            common_symbols = (SubLObject)file_vector_utilities.NIL;
        }
        _csetf_backed_map_fvector(backed_map, fvector);
        _csetf_backed_map_common_symbols(backed_map, common_symbols);
        return backed_map;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-vector-utilities.lisp", position = 43071L)
    public static SubLObject reconnect_backed_map_based_on_backed_map(final SubLObject backed_map, final SubLObject model_backed_map) {
        final SubLObject fvector = backed_map_fvector(model_backed_map);
        final SubLObject common_symbols = backed_map_common_symbols(model_backed_map);
        reconnect_backed_map(backed_map, fvector, common_symbols);
        return backed_map;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-vector-utilities.lisp", position = 43375L)
    public static SubLObject get_backed_map_file_vector(final SubLObject backed_map) {
        final SubLObject fvector_ref = backed_map_fvector(backed_map);
        if (file_vector_utilities.NIL != file_vector_indexical_p(fvector_ref)) {
            return dereference_file_vector_indexical(fvector_ref, (SubLObject)file_vector_utilities.UNPROVIDED);
        }
        if (file_vector_utilities.NIL != file_vector.file_vector_p(fvector_ref)) {
            return fvector_ref;
        }
        Errors.error((SubLObject)file_vector_utilities.$str112$Unexpected_file_vector_reference_, fvector_ref, backed_map);
        return (SubLObject)file_vector_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-vector-utilities.lisp", position = 43784L)
    public static SubLObject get_backed_map_file_vector_lock(final SubLObject backed_map) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject fvector_ref = backed_map_fvector(backed_map);
        if (file_vector_utilities.NIL != file_vector_indexical_p(fvector_ref)) {
            return dereference_file_vector_indexical_lock(fvector_ref, (SubLObject)file_vector_utilities.UNPROVIDED);
        }
        if (file_vector_utilities.NIL != file_vector.file_vector_p(fvector_ref)) {
            return file_vector_utilities.$file_vector_backed_map_read_lock$.getDynamicValue(thread);
        }
        Errors.error((SubLObject)file_vector_utilities.$str112$Unexpected_file_vector_reference_, fvector_ref, backed_map);
        return (SubLObject)file_vector_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-vector-utilities.lisp", position = 44517L)
    public static SubLObject cfasl_input_backed_map(final SubLObject stream) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject symbols = cfasl.cfasl_current_common_symbols();
        SubLObject interior_map = (SubLObject)file_vector_utilities.NIL;
        SubLObject fvector = (SubLObject)file_vector_utilities.NIL;
        final SubLObject v_object = cfasl.cfasl_input(stream, (SubLObject)file_vector_utilities.UNPROVIDED, (SubLObject)file_vector_utilities.UNPROVIDED);
        if (file_vector_utilities.NIL != map_utilities.map_p(v_object)) {
            interior_map = v_object;
            fvector = file_vector_utilities.$cfasl_outer_fvector_for_backed_maps$.getDynamicValue(thread);
        }
        else if (file_vector_utilities.NIL != file_vector_indexical_p(v_object)) {
            interior_map = cfasl.cfasl_input(stream, (SubLObject)file_vector_utilities.UNPROVIDED, (SubLObject)file_vector_utilities.UNPROVIDED);
            fvector = v_object;
        }
        else {
            Errors.error((SubLObject)file_vector_utilities.$str115$Unexpected_value__A_in_BACKED_MAP, v_object);
        }
        return new_backed_map(interior_map, fvector, symbols);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-vector-utilities.lisp", position = 45092L)
    public static SubLObject cfasl_output_backed_map(final SubLObject v_object, final SubLObject stream) {
        cfasl.cfasl_raw_write_byte(file_vector_utilities.$cfasl_opcode_backed_map$.getGlobalValue(), stream);
        final SubLObject fvector_indicator = backed_map_fvector(v_object);
        if (file_vector_utilities.NIL != file_vector_indexical_p(fvector_indicator)) {
            cfasl.cfasl_output(fvector_indicator, stream);
        }
        cfasl.cfasl_output(backed_map_map(v_object), stream);
        return v_object;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-vector-utilities.lisp", position = 45493L)
    public static SubLObject cfasl_output_object_backed_map_method(final SubLObject v_object, final SubLObject stream) {
        return cfasl_output_backed_map(v_object, stream);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-vector-utilities.lisp", position = 45765L)
    public static SubLObject with_backed_map_cache_strategy(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)file_vector_utilities.$list117);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject strategy = (SubLObject)file_vector_utilities.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)file_vector_utilities.$list117);
        strategy = current.first();
        current = current.rest();
        if (file_vector_utilities.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            return (SubLObject)ConsesLow.listS((SubLObject)file_vector_utilities.$sym39$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)file_vector_utilities.$sym118$_CURRENT_BACKED_MAP_CACHE_STRATEGY_, strategy)), ConsesLow.append(body, (SubLObject)file_vector_utilities.NIL));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)file_vector_utilities.$list117);
        return (SubLObject)file_vector_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-vector-utilities.lisp", position = 45993L)
    public static SubLObject backed_map_cache_strategy() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return file_vector_utilities.$current_backed_map_cache_strategy$.getDynamicValue(thread);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-vector-utilities.lisp", position = 46189L)
    public static SubLObject is_map_object_p_backed_map_method(final SubLObject v_object) {
        return (SubLObject)file_vector_utilities.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-vector-utilities.lisp", position = 46302L)
    public static SubLObject map_object_size_backed_map_method(final SubLObject v_object) {
        return map_backed_map_size(v_object);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-vector-utilities.lisp", position = 46394L)
    public static SubLObject map_backed_map_size(final SubLObject backed_map) {
        final SubLObject interior_map = backed_map_map(backed_map);
        return map_utilities.map_size(interior_map);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-vector-utilities.lisp", position = 46695L)
    public static SubLObject map_object_test_backed_map_method(final SubLObject v_object) {
        return map_backed_map_test(v_object);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-vector-utilities.lisp", position = 46788L)
    public static SubLObject map_backed_map_test(final SubLObject v_object) {
        final SubLObject interior_map = backed_map_map(v_object);
        return map_utilities.map_test(interior_map);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-vector-utilities.lisp", position = 46919L)
    public static SubLObject map_object_put_backed_map_method(final SubLObject v_object, final SubLObject key, final SubLObject value) {
        return map_backed_map_put(v_object, key, value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-vector-utilities.lisp", position = 47029L)
    public static SubLObject map_backed_map_put(final SubLObject v_object, final SubLObject key, final SubLObject value) {
        final SubLObject interior_map = backed_map_map(v_object);
        return file_vector_backed_map_wX_cache_put(interior_map, backed_map_cache_strategy(), key, value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-vector-utilities.lisp", position = 47245L)
    public static SubLObject map_object_get_backed_map_method(final SubLObject v_object, final SubLObject key, final SubLObject not_found) {
        return map_backed_map_get(v_object, key, not_found);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-vector-utilities.lisp", position = 47363L)
    public static SubLObject map_backed_map_get(final SubLObject v_object, final SubLObject key, final SubLObject not_found) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject interior_map = backed_map_map(v_object);
        final SubLObject fvector = get_backed_map_file_vector(v_object);
        final SubLObject fvector_lock = get_backed_map_file_vector_lock(v_object);
        SubLObject result = (SubLObject)file_vector_utilities.NIL;
        SubLObject found_p = (SubLObject)file_vector_utilities.NIL;
        if (file_vector_utilities.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && !fvector_lock.isLock()) {
            Errors.error((SubLObject)file_vector_utilities.$str124$Cannot_access_backed_map__A_witho, v_object);
        }
        final SubLObject _prev_bind_0 = cfasl.$within_cfasl_externalization$.currentBinding(thread);
        try {
            cfasl.$within_cfasl_externalization$.bind((SubLObject)file_vector_utilities.NIL, thread);
            final SubLObject common_symbols = backed_map_common_symbols(v_object);
            final SubLObject _prev_bind_0_$4 = cfasl.$cfasl_common_symbols$.currentBinding(thread);
            try {
                cfasl.$cfasl_common_symbols$.bind((SubLObject)file_vector_utilities.NIL, thread);
                cfasl.cfasl_set_common_symbols_simple(common_symbols);
                final SubLObject _prev_bind_0_$5 = file_vector_utilities.$cfasl_outer_fvector_for_backed_maps$.currentBinding(thread);
                final SubLObject _prev_bind_2 = file_vector_utilities.$file_vector_backed_map_read_lock$.currentBinding(thread);
                try {
                    file_vector_utilities.$cfasl_outer_fvector_for_backed_maps$.bind(fvector, thread);
                    file_vector_utilities.$file_vector_backed_map_read_lock$.bind(fvector_lock, thread);
                    result = file_vector_backed_map_wX_cache_get(interior_map, fvector, backed_map_cache_strategy(), key, not_found);
                    found_p = (SubLObject)SubLObjectFactory.makeBoolean(!result.eql(not_found));
                }
                finally {
                    file_vector_utilities.$file_vector_backed_map_read_lock$.rebind(_prev_bind_2, thread);
                    file_vector_utilities.$cfasl_outer_fvector_for_backed_maps$.rebind(_prev_bind_0_$5, thread);
                }
            }
            finally {
                cfasl.$cfasl_common_symbols$.rebind(_prev_bind_0_$4, thread);
            }
        }
        finally {
            cfasl.$within_cfasl_externalization$.rebind(_prev_bind_0, thread);
        }
        return Values.values(result, found_p);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-vector-utilities.lisp", position = 48340L)
    public static SubLObject map_object_get_without_values_backed_map_method(final SubLObject v_object, final SubLObject key, final SubLObject not_found) {
        return map_backed_map_get_without_values(v_object, key, not_found);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-vector-utilities.lisp", position = 48490L)
    public static SubLObject map_backed_map_get_without_values(final SubLObject v_object, final SubLObject key, final SubLObject not_found) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject interior_map = backed_map_map(v_object);
        final SubLObject fvector = get_backed_map_file_vector(v_object);
        final SubLObject fvector_lock = get_backed_map_file_vector_lock(v_object);
        SubLObject result = (SubLObject)file_vector_utilities.NIL;
        if (file_vector_utilities.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && !fvector_lock.isLock()) {
            Errors.error((SubLObject)file_vector_utilities.$str124$Cannot_access_backed_map__A_witho, v_object);
        }
        final SubLObject _prev_bind_0 = cfasl.$within_cfasl_externalization$.currentBinding(thread);
        try {
            cfasl.$within_cfasl_externalization$.bind((SubLObject)file_vector_utilities.NIL, thread);
            final SubLObject common_symbols = backed_map_common_symbols(v_object);
            final SubLObject _prev_bind_0_$6 = cfasl.$cfasl_common_symbols$.currentBinding(thread);
            try {
                cfasl.$cfasl_common_symbols$.bind((SubLObject)file_vector_utilities.NIL, thread);
                cfasl.cfasl_set_common_symbols_simple(common_symbols);
                final SubLObject _prev_bind_0_$7 = file_vector_utilities.$cfasl_outer_fvector_for_backed_maps$.currentBinding(thread);
                final SubLObject _prev_bind_2 = file_vector_utilities.$file_vector_backed_map_read_lock$.currentBinding(thread);
                try {
                    file_vector_utilities.$cfasl_outer_fvector_for_backed_maps$.bind(fvector, thread);
                    file_vector_utilities.$file_vector_backed_map_read_lock$.bind(fvector_lock, thread);
                    result = file_vector_backed_map_wX_cache_get(interior_map, fvector, backed_map_cache_strategy(), key, not_found);
                }
                finally {
                    file_vector_utilities.$file_vector_backed_map_read_lock$.rebind(_prev_bind_2, thread);
                    file_vector_utilities.$cfasl_outer_fvector_for_backed_maps$.rebind(_prev_bind_0_$7, thread);
                }
            }
            finally {
                cfasl.$cfasl_common_symbols$.rebind(_prev_bind_0_$6, thread);
            }
        }
        finally {
            cfasl.$within_cfasl_externalization$.rebind(_prev_bind_0, thread);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-vector-utilities.lisp", position = 49401L)
    public static SubLObject map_object_remove_backed_map_method(final SubLObject v_object, final SubLObject key) {
        return map_backed_map_remove(v_object, key);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-vector-utilities.lisp", position = 49505L)
    public static SubLObject map_backed_map_remove(final SubLObject v_object, final SubLObject key) {
        final SubLObject interior_map = backed_map_map(v_object);
        return file_vector_backed_map_wX_cache_remove(interior_map, backed_map_cache_strategy(), key, (SubLObject)file_vector_utilities.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-vector-utilities.lisp", position = 49770L)
    public static SubLObject map_object_remove_all_backed_map_method(final SubLObject v_object) {
        return map_backed_map_remove_all(v_object);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-vector-utilities.lisp", position = 49874L)
    public static SubLObject map_backed_map_remove_all(final SubLObject v_object) {
        final SubLObject interior_map = backed_map_map(v_object);
        map_utilities.map_remove_all(interior_map);
        return v_object;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-vector-utilities.lisp", position = 50211L)
    public static SubLObject map_object_touch_backed_map_method(final SubLObject v_object, final SubLObject key) {
        return map_backed_map_touch(v_object, key);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-vector-utilities.lisp", position = 50313L)
    public static SubLObject map_backed_map_touch(final SubLObject v_object, final SubLObject key) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject interior_map = backed_map_map(v_object);
        final SubLObject fvector = get_backed_map_file_vector(v_object);
        SubLObject result = (SubLObject)file_vector_utilities.NIL;
        final SubLObject common_symbols = backed_map_common_symbols(v_object);
        final SubLObject _prev_bind_0 = cfasl.$cfasl_common_symbols$.currentBinding(thread);
        try {
            cfasl.$cfasl_common_symbols$.bind((SubLObject)file_vector_utilities.NIL, thread);
            cfasl.cfasl_set_common_symbols_simple(common_symbols);
            result = file_vector_backed_map_wX_cache_touch(interior_map, backed_map_cache_strategy(), key, fvector);
        }
        finally {
            cfasl.$cfasl_common_symbols$.rebind(_prev_bind_0, thread);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-vector-utilities.lisp", position = 50685L)
    public static SubLObject map_object_change_set_backed_map_method(final SubLObject v_object, SubLObject unchanged) {
        if (unchanged == file_vector_utilities.UNPROVIDED) {
            unchanged = (SubLObject)file_vector_utilities.NIL;
        }
        return map_backed_map_change_set(v_object, unchanged);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-vector-utilities.lisp", position = 50819L)
    public static SubLObject map_backed_map_change_set(final SubLObject map, final SubLObject unchanged) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject interior_map = backed_map_map(map);
        SubLObject changed_keys = (SubLObject)file_vector_utilities.NIL;
        SubLObject delete_hints = (SubLObject)file_vector_utilities.NIL;
        SubLObject edit_hints = (SubLObject)file_vector_utilities.NIL;
        final SubLObject iterator = map_utilities.new_map_iterator(interior_map);
        SubLObject valid;
        for (SubLObject done_var = (SubLObject)file_vector_utilities.NIL; file_vector_utilities.NIL == done_var; done_var = (SubLObject)SubLObjectFactory.makeBoolean(file_vector_utilities.NIL == valid)) {
            thread.resetMultipleValues();
            final SubLObject var = iteration.iteration_next(iterator);
            valid = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (file_vector_utilities.NIL != valid) {
                SubLObject current;
                final SubLObject datum = current = var;
                SubLObject key = (SubLObject)file_vector_utilities.NIL;
                SubLObject value = (SubLObject)file_vector_utilities.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)file_vector_utilities.$list2);
                key = current.first();
                current = current.rest();
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)file_vector_utilities.$list2);
                value = current.first();
                current = current.rest();
                if (file_vector_utilities.NIL == current) {
                    SubLObject changedP = (SubLObject)file_vector_utilities.NIL;
                    if (file_vector_utilities.NIL != file_vector_reference_p(value)) {
                        if (file_vector_utilities.NIL != file_vector_reference_present_mutatedP(value)) {
                            edit_hints = (SubLObject)ConsesLow.cons(recover_mutated_file_vector_reference(value), edit_hints);
                            changedP = (SubLObject)file_vector_utilities.T;
                        }
                        else if (file_vector_utilities.NIL != file_vector_reference_deletedP(value)) {
                            delete_hints = (SubLObject)ConsesLow.cons(recover_mutated_file_vector_reference(value), delete_hints);
                            changedP = (SubLObject)file_vector_utilities.T;
                        }
                        else {
                            changedP = (SubLObject)file_vector_utilities.NIL;
                        }
                    }
                    else {
                        changedP = (SubLObject)file_vector_utilities.T;
                    }
                    if (file_vector_utilities.NIL != changedP) {
                        changed_keys = (SubLObject)ConsesLow.cons(key, changed_keys);
                    }
                    else if (file_vector_utilities.NIL != map_utilities.map_p(unchanged)) {
                        map_utilities.map_put(unchanged, key, value);
                    }
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)file_vector_utilities.$list2);
                }
            }
        }
        return Values.values(changed_keys, delete_hints, edit_hints);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-vector-utilities.lisp", position = 51886L)
    public static SubLObject new_map_object_with_same_properties_backed_map_method(final SubLObject v_object, final SubLObject test, final SubLObject size) {
        return new_map_backed_map_with_same_properties(v_object, test, size);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-vector-utilities.lisp", position = 52043L)
    public static SubLObject new_map_backed_map_with_same_properties(final SubLObject v_object, final SubLObject test, final SubLObject size) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject interior_map = backed_map_map(v_object);
        final SubLObject fvector = backed_map_fvector(v_object);
        if (file_vector_utilities.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && !test.eql(map_utilities.map_test(interior_map))) {
            Errors.error((SubLObject)file_vector_utilities.$str131$The_test_of_the_interior_map__A_d, map_utilities.map_test(interior_map), test);
        }
        if (file_vector_utilities.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && !size.numE(map_utilities.map_size(interior_map))) {
            Errors.error((SubLObject)file_vector_utilities.$str132$The_size_of_the_interior_map__A_d, map_utilities.map_size(interior_map), size);
        }
        final SubLObject new_map = map_utilities.new_map_with_same_properties(interior_map);
        final SubLObject new_fvector = (file_vector_utilities.NIL != file_vector_indexical_p(fvector)) ? fvector : file_vector.clone_file_vector(fvector);
        return new_backed_map(new_map, new_fvector, (SubLObject)file_vector_utilities.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-vector-utilities.lisp", position = 52933L)
    public static SubLObject new_map_object_iterator_backed_map_method(final SubLObject v_object) {
        return new_map_backed_map_iterator(v_object);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-vector-utilities.lisp", position = 53041L)
    public static SubLObject new_map_backed_map_iterator(final SubLObject v_object) {
        return iteration.new_iterator(new_map_backed_map_iterator_state(v_object), (SubLObject)file_vector_utilities.$sym134$MAP_BACKED_MAP_ITERATOR_DONE, (SubLObject)file_vector_utilities.$sym135$MAP_BACKED_MAP_ITERATOR_NEXT, (SubLObject)file_vector_utilities.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-vector-utilities.lisp", position = 53264L)
    public static SubLObject new_map_backed_map_iterator_state(final SubLObject backed_map) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject interior_map = backed_map_map(backed_map);
        final SubLObject fvector = get_backed_map_file_vector(backed_map);
        final SubLObject cache_strategy = backed_map_cache_strategy();
        SubLObject iterator = (SubLObject)file_vector_utilities.NIL;
        final SubLObject common_symbols = backed_map_common_symbols(backed_map);
        final SubLObject _prev_bind_0 = cfasl.$cfasl_common_symbols$.currentBinding(thread);
        try {
            cfasl.$cfasl_common_symbols$.bind((SubLObject)file_vector_utilities.NIL, thread);
            cfasl.cfasl_set_common_symbols_simple(common_symbols);
            iterator = new_file_vector_backed_map_iterator(interior_map, fvector, (SubLObject)file_vector_utilities.NIL, cache_strategy);
        }
        finally {
            cfasl.$cfasl_common_symbols$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)ConsesLow.list(backed_map, iterator, cache_strategy);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-vector-utilities.lisp", position = 53741L)
    public static SubLObject map_backed_map_iterator_done(final SubLObject state) {
        SubLObject backed_map = (SubLObject)file_vector_utilities.NIL;
        SubLObject iterator = (SubLObject)file_vector_utilities.NIL;
        SubLObject cache_strategy = (SubLObject)file_vector_utilities.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(state, state, (SubLObject)file_vector_utilities.$list136);
        backed_map = state.first();
        SubLObject current = state.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, state, (SubLObject)file_vector_utilities.$list136);
        iterator = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, state, (SubLObject)file_vector_utilities.$list136);
        cache_strategy = current.first();
        current = current.rest();
        if (file_vector_utilities.NIL == current) {
            return iteration.iteration_done(iterator);
        }
        cdestructuring_bind.cdestructuring_bind_error(state, (SubLObject)file_vector_utilities.$list136);
        return (SubLObject)file_vector_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-vector-utilities.lisp", position = 53944L)
    public static SubLObject map_backed_map_iterator_next(final SubLObject state) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject entry = (SubLObject)file_vector_utilities.NIL;
        SubLObject validP = (SubLObject)file_vector_utilities.NIL;
        SubLObject backed_map = (SubLObject)file_vector_utilities.NIL;
        SubLObject iterator = (SubLObject)file_vector_utilities.NIL;
        SubLObject cache_strategy = (SubLObject)file_vector_utilities.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(state, state, (SubLObject)file_vector_utilities.$list136);
        backed_map = state.first();
        SubLObject current = state.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, state, (SubLObject)file_vector_utilities.$list136);
        iterator = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, state, (SubLObject)file_vector_utilities.$list136);
        cache_strategy = current.first();
        current = current.rest();
        if (file_vector_utilities.NIL == current) {
            final SubLObject _prev_bind_0 = cfasl.$within_cfasl_externalization$.currentBinding(thread);
            final SubLObject _prev_bind_2 = file_vector_utilities.$current_backed_map_cache_strategy$.currentBinding(thread);
            try {
                cfasl.$within_cfasl_externalization$.bind((SubLObject)file_vector_utilities.NIL, thread);
                file_vector_utilities.$current_backed_map_cache_strategy$.bind(cache_strategy, thread);
                final SubLObject common_symbols = backed_map_common_symbols(backed_map);
                final SubLObject _prev_bind_0_$8 = cfasl.$cfasl_common_symbols$.currentBinding(thread);
                try {
                    cfasl.$cfasl_common_symbols$.bind((SubLObject)file_vector_utilities.NIL, thread);
                    cfasl.cfasl_set_common_symbols_simple(common_symbols);
                    final SubLObject _prev_bind_0_$9 = file_vector_utilities.$cfasl_outer_fvector_for_backed_maps$.currentBinding(thread);
                    try {
                        file_vector_utilities.$cfasl_outer_fvector_for_backed_maps$.bind(get_backed_map_file_vector(backed_map), thread);
                        final SubLObject fvector_lock = get_backed_map_file_vector_lock(backed_map);
                        if (file_vector_utilities.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && !fvector_lock.isLock()) {
                            Errors.error((SubLObject)file_vector_utilities.$str124$Cannot_access_backed_map__A_witho, backed_map);
                        }
                        final SubLObject _prev_bind_0_$10 = file_vector_utilities.$file_vector_backed_map_read_lock$.currentBinding(thread);
                        try {
                            file_vector_utilities.$file_vector_backed_map_read_lock$.bind(fvector_lock, thread);
                            thread.resetMultipleValues();
                            final SubLObject entry_$11 = iteration.iteration_next(iterator);
                            final SubLObject validP_$12 = thread.secondMultipleValue();
                            thread.resetMultipleValues();
                            entry = entry_$11;
                            validP = validP_$12;
                        }
                        finally {
                            file_vector_utilities.$file_vector_backed_map_read_lock$.rebind(_prev_bind_0_$10, thread);
                        }
                    }
                    finally {
                        file_vector_utilities.$cfasl_outer_fvector_for_backed_maps$.rebind(_prev_bind_0_$9, thread);
                    }
                }
                finally {
                    cfasl.$cfasl_common_symbols$.rebind(_prev_bind_0_$8, thread);
                }
            }
            finally {
                file_vector_utilities.$current_backed_map_cache_strategy$.rebind(_prev_bind_2, thread);
                cfasl.$within_cfasl_externalization$.rebind(_prev_bind_0, thread);
            }
            return subl_promotions.values3(entry, state, (SubLObject)SubLObjectFactory.makeBoolean(file_vector_utilities.NIL == validP));
        }
        cdestructuring_bind.cdestructuring_bind_error(state, (SubLObject)file_vector_utilities.$list136);
        return (SubLObject)file_vector_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-vector-utilities.lisp", position = 54943L)
    public static SubLObject map_object_arbitrary_key_backed_map_method(final SubLObject v_object) {
        return map_backed_map_arbitrary_key(v_object);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-vector-utilities.lisp", position = 55053L)
    public static SubLObject map_backed_map_arbitrary_key(final SubLObject v_object) {
        final SubLObject interior_map = backed_map_map(v_object);
        return map_utilities.map_arbitrary_key(interior_map, (SubLObject)file_vector_utilities.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-vector-utilities.lisp", position = 55374L)
    public static SubLObject swap_out_all_pristine_backed_map_objects(final SubLObject backed_map) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject maps_to_do = queues.create_queue((SubLObject)file_vector_utilities.UNPROVIDED);
        SubLObject swapped_out = (SubLObject)file_vector_utilities.ZERO_INTEGER;
        queues.enqueue(backed_map, maps_to_do);
        while (file_vector_utilities.NIL == queues.queue_empty_p(maps_to_do)) {
            final SubLObject curr_map = queues.dequeue(maps_to_do);
            if (file_vector_utilities.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && file_vector_utilities.NIL == backed_map_p(curr_map)) {
                Errors.error((SubLObject)file_vector_utilities.$str138$Error_in_swap_out_algorithm___A_i, curr_map);
            }
            final SubLObject internal_map = backed_map_map(curr_map);
            thread.resetMultipleValues();
            final SubLObject the_curr_map = swap_out_all_pristine_file_vector_backed_map_objects(internal_map);
            final SubLObject curr_swapped_out = thread.secondMultipleValue();
            thread.resetMultipleValues();
            swapped_out = Numbers.add(swapped_out, curr_swapped_out);
            final SubLObject iterator = map_utilities.new_map_iterator(internal_map);
            SubLObject valid;
            for (SubLObject done_var = (SubLObject)file_vector_utilities.NIL; file_vector_utilities.NIL == done_var; done_var = (SubLObject)SubLObjectFactory.makeBoolean(file_vector_utilities.NIL == valid)) {
                thread.resetMultipleValues();
                final SubLObject var = iteration.iteration_next(iterator);
                valid = thread.secondMultipleValue();
                thread.resetMultipleValues();
                if (file_vector_utilities.NIL != valid) {
                    SubLObject current;
                    final SubLObject datum = current = var;
                    SubLObject key = (SubLObject)file_vector_utilities.NIL;
                    SubLObject value = (SubLObject)file_vector_utilities.NIL;
                    cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)file_vector_utilities.$list2);
                    key = current.first();
                    current = current.rest();
                    cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)file_vector_utilities.$list2);
                    value = current.first();
                    current = current.rest();
                    if (file_vector_utilities.NIL == current) {
                        if (file_vector_utilities.NIL != backed_map_p(value)) {
                            queues.enqueue(value, maps_to_do);
                        }
                        else if (file_vector_utilities.NIL != file_vector_reference_p(value) && file_vector_utilities.NIL != file_vector_reference_present_mutatedP(value)) {
                            final SubLObject payload = file_vector_reference_referenced_object(value);
                            if (file_vector_utilities.NIL != backed_map_p(payload)) {
                                queues.enqueue(payload, maps_to_do);
                            }
                        }
                    }
                    else {
                        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)file_vector_utilities.$list2);
                    }
                }
            }
        }
        return Values.values(backed_map, swapped_out);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-vector-utilities.lisp", position = 57027L)
    public static SubLObject get_backed_map_non_pristine_object_count(final SubLObject backed_map) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject maps_to_do = queues.create_queue((SubLObject)file_vector_utilities.UNPROVIDED);
        SubLObject count = (SubLObject)file_vector_utilities.ZERO_INTEGER;
        SubLObject map_count = (SubLObject)file_vector_utilities.ZERO_INTEGER;
        queues.enqueue(backed_map, maps_to_do);
        while (file_vector_utilities.NIL == queues.queue_empty_p(maps_to_do)) {
            final SubLObject curr_map = queues.dequeue(maps_to_do);
            if (file_vector_utilities.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && file_vector_utilities.NIL == backed_map_p(curr_map)) {
                Errors.error((SubLObject)file_vector_utilities.$str139$Error_in_non_pristine_object_coun, curr_map);
            }
            map_count = Numbers.add(map_count, (SubLObject)file_vector_utilities.ONE_INTEGER);
            final SubLObject internal_map = backed_map_map(curr_map);
            final SubLObject iterator = map_utilities.new_map_iterator(internal_map);
            SubLObject valid;
            for (SubLObject done_var = (SubLObject)file_vector_utilities.NIL; file_vector_utilities.NIL == done_var; done_var = (SubLObject)SubLObjectFactory.makeBoolean(file_vector_utilities.NIL == valid)) {
                thread.resetMultipleValues();
                final SubLObject var = iteration.iteration_next(iterator);
                valid = thread.secondMultipleValue();
                thread.resetMultipleValues();
                if (file_vector_utilities.NIL != valid) {
                    SubLObject current;
                    final SubLObject datum = current = var;
                    SubLObject key = (SubLObject)file_vector_utilities.NIL;
                    SubLObject value = (SubLObject)file_vector_utilities.NIL;
                    cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)file_vector_utilities.$list2);
                    key = current.first();
                    current = current.rest();
                    cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)file_vector_utilities.$list2);
                    value = current.first();
                    current = current.rest();
                    if (file_vector_utilities.NIL == current) {
                        if (file_vector_utilities.NIL != file_vector_reference_p(value)) {
                            if (file_vector_utilities.NIL != file_vector_reference_present_mutatedP(value)) {
                                final SubLObject payload = file_vector_reference_referenced_object(value);
                                if (file_vector_utilities.NIL != backed_map_p(payload)) {
                                    queues.enqueue(payload, maps_to_do);
                                }
                                else {
                                    count = Numbers.add(count, (SubLObject)file_vector_utilities.ONE_INTEGER);
                                }
                            }
                        }
                        else {
                            count = Numbers.add(count, (SubLObject)file_vector_utilities.ONE_INTEGER);
                            if (file_vector_utilities.NIL != backed_map_p(value)) {
                                queues.enqueue(value, maps_to_do);
                            }
                        }
                    }
                    else {
                        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)file_vector_utilities.$list2);
                    }
                }
            }
        }
        return Values.values(count, map_count);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-vector-utilities.lisp", position = 64991L)
    public static SubLObject test_file_vector_backed_map_with_alist(final SubLObject alist, SubLObject value_equal_fn) {
        if (value_equal_fn == file_vector_utilities.UNPROVIDED) {
            value_equal_fn = (SubLObject)file_vector_utilities.EQUAL;
        }
        final SubLObject map = dictionary_utilities.new_dictionary_from_alist(alist, (SubLObject)file_vector_utilities.EQUALP);
        return test_file_vector_backed_map(map, value_equal_fn);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-vector-utilities.lisp", position = 65270L)
    public static SubLObject test_file_vector_backed_map(final SubLObject map, SubLObject value_equal_fn) {
        if (value_equal_fn == file_vector_utilities.UNPROVIDED) {
            value_equal_fn = (SubLObject)file_vector_utilities.EQUAL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject data_file = file_utilities.make_temp_filename((SubLObject)file_vector_utilities.$str149$_tmp_);
        try {
            final SubLObject index_file = file_utilities.make_temp_filename((SubLObject)file_vector_utilities.$str149$_tmp_);
            try {
                final SubLObject canonical_map_size = map_utilities.map_size(map);
                SubLObject new_map = (SubLObject)file_vector_utilities.NIL;
                create_file_backing_for_map(map, data_file, index_file);
                SubLObject fvector = (SubLObject)file_vector_utilities.NIL;
                try {
                    fvector = file_vector.new_file_vector(data_file, index_file, (SubLObject)file_vector_utilities.$kw48$INPUT, (SubLObject)file_vector_utilities.UNPROVIDED, (SubLObject)file_vector_utilities.UNPROVIDED, (SubLObject)file_vector_utilities.UNPROVIDED);
                    new_map = new_file_vector_backed_map(fvector, map_utilities.map_test(map), map_utilities.map_size(map), (SubLObject)file_vector_utilities.UNPROVIDED);
                    test_enforce_map_specific_cache_ratios(new_map, (SubLObject)file_vector_utilities.ZERO_INTEGER, canonical_map_size);
                    SubLObject iterator = map_utilities.new_map_iterator(new_map);
                    SubLObject valid;
                    for (SubLObject done_var = (SubLObject)file_vector_utilities.NIL; file_vector_utilities.NIL == done_var; done_var = (SubLObject)SubLObjectFactory.makeBoolean(file_vector_utilities.NIL == valid)) {
                        thread.resetMultipleValues();
                        final SubLObject var = iteration.iteration_next(iterator);
                        valid = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        if (file_vector_utilities.NIL != valid) {
                            SubLObject current;
                            final SubLObject datum = current = var;
                            SubLObject key = (SubLObject)file_vector_utilities.NIL;
                            SubLObject value = (SubLObject)file_vector_utilities.NIL;
                            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)file_vector_utilities.$list2);
                            key = current.first();
                            current = current.rest();
                            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)file_vector_utilities.$list2);
                            value = current.first();
                            current = current.rest();
                            if (file_vector_utilities.NIL == current) {
                                if (file_vector_utilities.$kw53$NOT_FOUND == map_utilities.map_get(map, key, (SubLObject)file_vector_utilities.$kw53$NOT_FOUND)) {
                                    Errors.error((SubLObject)file_vector_utilities.$str150$Key__A_should_be_in_the_map_but_i, key);
                                }
                            }
                            else {
                                cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)file_vector_utilities.$list2);
                            }
                        }
                    }
                    iterator = map_utilities.new_map_iterator(map);
                    for (SubLObject done_var = (SubLObject)file_vector_utilities.NIL; file_vector_utilities.NIL == done_var; done_var = (SubLObject)SubLObjectFactory.makeBoolean(file_vector_utilities.NIL == valid)) {
                        thread.resetMultipleValues();
                        final SubLObject var = iteration.iteration_next(iterator);
                        valid = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        if (file_vector_utilities.NIL != valid) {
                            SubLObject current;
                            final SubLObject datum = current = var;
                            SubLObject key = (SubLObject)file_vector_utilities.NIL;
                            SubLObject value = (SubLObject)file_vector_utilities.NIL;
                            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)file_vector_utilities.$list2);
                            key = current.first();
                            current = current.rest();
                            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)file_vector_utilities.$list2);
                            value = current.first();
                            current = current.rest();
                            if (file_vector_utilities.NIL == current) {
                                final SubLObject new_value = file_vector_backed_map_get(new_map, fvector, key, (SubLObject)file_vector_utilities.$kw53$NOT_FOUND);
                                if (file_vector_utilities.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && file_vector_utilities.$kw53$NOT_FOUND == new_value) {
                                    Errors.error((SubLObject)file_vector_utilities.$str151$The_value_for_the_key__A_is_missi, key);
                                }
                                if (file_vector_utilities.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && file_vector_utilities.NIL == list_utilities.sublisp_boolean(Functions.funcall(value_equal_fn, value, new_value))) {
                                    Errors.error((SubLObject)file_vector_utilities.$str152$The_old_value__A_does_not_match_t, value, new_value, value_equal_fn);
                                }
                            }
                            else {
                                cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)file_vector_utilities.$list2);
                            }
                        }
                    }
                    final SubLObject keys = map_utilities.map_keys(map);
                    final SubLObject num_of_keys = Sequences.length(keys);
                    if (file_vector_utilities.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && !canonical_map_size.numE(num_of_keys)) {
                        Errors.error((SubLObject)file_vector_utilities.$str153$There_are_supposed_to_be__A_keys_, canonical_map_size, num_of_keys);
                    }
                    final SubLObject values = map_utilities.map_values(map);
                    final SubLObject num_of_values = Sequences.length(values);
                    if (file_vector_utilities.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && !canonical_map_size.numE(num_of_values)) {
                        Errors.error((SubLObject)file_vector_utilities.$str154$There_are_supposed_to_be__A_value, canonical_map_size, num_of_values);
                    }
                    test_enforce_map_specific_cache_ratios(new_map, canonical_map_size, (SubLObject)file_vector_utilities.ZERO_INTEGER);
                    swap_out_all_pristine_file_vector_backed_map_objects(new_map);
                    test_enforce_map_specific_cache_ratios(new_map, (SubLObject)file_vector_utilities.ZERO_INTEGER, canonical_map_size);
                    final SubLObject some_key = map_utilities.map_arbitrary_key(new_map, (SubLObject)file_vector_utilities.UNPROVIDED);
                    final SubLObject remaining_paged_out = Numbers.subtract(canonical_map_size, (SubLObject)file_vector_utilities.ONE_INTEGER);
                    final SubLObject new_value2 = Guids.new_guid();
                    SubLObject some_value = (SubLObject)file_vector_utilities.NIL;
                    some_value = file_vector_backed_map_get(new_map, fvector, some_key, (SubLObject)file_vector_utilities.$kw53$NOT_FOUND);
                    if (file_vector_utilities.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && file_vector_utilities.$kw53$NOT_FOUND == some_value) {
                        Errors.error((SubLObject)file_vector_utilities.$str155$The_value_for_the_key__A_can_all_, some_key);
                    }
                    if (file_vector_utilities.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && file_vector_utilities.NIL == file_vector_reference_p(map_utilities.map_get(new_map, some_key, (SubLObject)file_vector_utilities.$kw53$NOT_FOUND))) {
                        Errors.error((SubLObject)file_vector_utilities.$str156$The_accessing_of_the_value_for__A, some_key);
                    }
                    test_enforce_map_specific_cache_ratios(new_map, (SubLObject)file_vector_utilities.ONE_INTEGER, remaining_paged_out);
                    if (file_vector_utilities.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && file_vector_utilities.$kw54$MUTATED != file_vector_backed_map_touch(new_map, some_key, (SubLObject)file_vector_utilities.UNPROVIDED)) {
                        Errors.error((SubLObject)file_vector_utilities.$str157$The_touching_of_the_object_did_no);
                    }
                    swap_out_all_pristine_file_vector_backed_map_objects(new_map);
                    test_enforce_map_specific_cache_ratios(new_map, (SubLObject)file_vector_utilities.ONE_INTEGER, remaining_paged_out);
                    if (file_vector_utilities.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && file_vector_utilities.$kw57$RECOVERED != undo_change_to_file_vector_backed_map(new_map, some_key)) {
                        Errors.error((SubLObject)file_vector_utilities.$str158$Undoing_the_change_for_key__A_did, some_key);
                    }
                    test_enforce_map_specific_cache_ratios(new_map, (SubLObject)file_vector_utilities.ZERO_INTEGER, canonical_map_size);
                    if (file_vector_utilities.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && file_vector_utilities.$kw54$MUTATED != file_vector_backed_map_put(new_map, some_key, new_value2)) {
                        Errors.error((SubLObject)file_vector_utilities.$str159$The_modification_of_the_entry_for, some_key);
                    }
                    final SubLObject curr_value = file_vector_backed_map_get(new_map, (SubLObject)file_vector_utilities.NIL, some_key, (SubLObject)file_vector_utilities.$kw53$NOT_FOUND);
                    if (!new_value2.equalp(curr_value)) {
                        dictionary_utilities.print_dictionary_contents(new_map, (SubLObject)file_vector_utilities.UNPROVIDED);
                        Errors.error((SubLObject)file_vector_utilities.$str160$The_modified_entry_for__A_no_long, some_key, new_value2, curr_value);
                    }
                    if (file_vector_utilities.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && file_vector_utilities.NIL == file_vector_reference_present_mutatedP(map_utilities.map_get(new_map, some_key, (SubLObject)file_vector_utilities.UNPROVIDED))) {
                        Errors.error((SubLObject)file_vector_utilities.$str161$The_stored_entry_for__A_is_not_a_, some_key);
                    }
                    test_enforce_map_specific_cache_ratios(new_map, (SubLObject)file_vector_utilities.ONE_INTEGER, remaining_paged_out);
                    if (file_vector_utilities.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && file_vector_utilities.$kw57$RECOVERED != undo_change_to_file_vector_backed_map(new_map, some_key)) {
                        Errors.error((SubLObject)file_vector_utilities.$str158$Undoing_the_change_for_key__A_did, some_key);
                    }
                    test_enforce_map_specific_cache_ratios(new_map, (SubLObject)file_vector_utilities.ZERO_INTEGER, canonical_map_size);
                }
                finally {
                    final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)file_vector_utilities.T, thread);
                        final SubLObject _values = Values.getValuesAsVector();
                        if (file_vector_utilities.NIL != file_vector.file_vector_p(fvector)) {
                            file_vector.close_file_vector(fvector);
                        }
                        Values.restoreValuesFromVector(_values);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                    }
                }
            }
            finally {
                final SubLObject _prev_bind_2 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)file_vector_utilities.T, thread);
                    final SubLObject _values2 = Values.getValuesAsVector();
                    SubLObject ignore_errors_tag = (SubLObject)file_vector_utilities.NIL;
                    try {
                        thread.throwStack.push(file_vector_utilities.$kw81$IGNORE_ERRORS_TARGET);
                        final SubLObject _prev_bind_0_$13 = Errors.$error_handler$.currentBinding(thread);
                        try {
                            Errors.$error_handler$.bind(Symbols.symbol_function((SubLObject)file_vector_utilities.$sym82$IGNORE_ERRORS_HANDLER), thread);
                            try {
                                Filesys.delete_file(index_file);
                            }
                            catch (Throwable catch_var) {
                                Errors.handleThrowable(catch_var, (SubLObject)file_vector_utilities.NIL);
                            }
                        }
                        finally {
                            Errors.$error_handler$.rebind(_prev_bind_0_$13, thread);
                        }
                    }
                    catch (Throwable ccatch_env_var) {
                        ignore_errors_tag = Errors.handleThrowable(ccatch_env_var, (SubLObject)file_vector_utilities.$kw81$IGNORE_ERRORS_TARGET);
                        thread.throwStack.pop();
                    }
                    finally {
                        thread.throwStack.pop();
                    }
                    Values.restoreValuesFromVector(_values2);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
                }
            }
        }
        finally {
            final SubLObject _prev_bind_3 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)file_vector_utilities.T, thread);
                final SubLObject _values3 = Values.getValuesAsVector();
                SubLObject ignore_errors_tag2 = (SubLObject)file_vector_utilities.NIL;
                try {
                    thread.throwStack.push(file_vector_utilities.$kw81$IGNORE_ERRORS_TARGET);
                    final SubLObject _prev_bind_0_$14 = Errors.$error_handler$.currentBinding(thread);
                    try {
                        Errors.$error_handler$.bind(Symbols.symbol_function((SubLObject)file_vector_utilities.$sym82$IGNORE_ERRORS_HANDLER), thread);
                        try {
                            Filesys.delete_file(data_file);
                        }
                        catch (Throwable catch_var2) {
                            Errors.handleThrowable(catch_var2, (SubLObject)file_vector_utilities.NIL);
                        }
                    }
                    finally {
                        Errors.$error_handler$.rebind(_prev_bind_0_$14, thread);
                    }
                }
                catch (Throwable ccatch_env_var2) {
                    ignore_errors_tag2 = Errors.handleThrowable(ccatch_env_var2, (SubLObject)file_vector_utilities.$kw81$IGNORE_ERRORS_TARGET);
                    thread.throwStack.pop();
                }
                finally {
                    thread.throwStack.pop();
                }
                Values.restoreValuesFromVector(_values3);
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_3, thread);
            }
        }
        return (SubLObject)file_vector_utilities.$kw162$SUCCESS;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-vector-utilities.lisp", position = 70359L)
    public static SubLObject test_enforce_map_specific_cache_ratios(final SubLObject map, final SubLObject paged_in, final SubLObject paged_out) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject actual_paged_in = file_vector_backed_map_cache_ratio(map);
        final SubLObject actual_paged_out = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (file_vector_utilities.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && !paged_in.numE(actual_paged_in)) {
            Errors.error((SubLObject)file_vector_utilities.$str163$_A_should_be_paged_in__but__A_are, paged_in, actual_paged_in);
        }
        if (file_vector_utilities.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && !paged_out.numE(actual_paged_out)) {
            Errors.error((SubLObject)file_vector_utilities.$str164$_A_should_be_paged_out__but__A_ar, paged_out, actual_paged_out);
        }
        return map;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-vector-utilities.lisp", position = 70822L)
    public static SubLObject test_map_to_file_vector_backed_map_conversion_with_alist(final SubLObject alist, SubLObject value_equal_fn) {
        if (value_equal_fn == file_vector_utilities.UNPROVIDED) {
            value_equal_fn = (SubLObject)file_vector_utilities.EQUAL;
        }
        final SubLObject map = dictionary_utilities.new_dictionary_from_alist(alist, (SubLObject)file_vector_utilities.EQUALP);
        return test_map_to_file_vector_backed_map_conversion(map, value_equal_fn);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-vector-utilities.lisp", position = 71149L)
    public static SubLObject test_map_to_file_vector_backed_map_conversion(final SubLObject map, SubLObject value_equal_fn) {
        if (value_equal_fn == file_vector_utilities.UNPROVIDED) {
            value_equal_fn = (SubLObject)file_vector_utilities.EQUAL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject backup_map = map_utilities.clone_map(map, (SubLObject)file_vector_utilities.$kw165$COPY_CONTENTS);
        final SubLObject data_file = file_utilities.make_temp_filename((SubLObject)file_vector_utilities.$str149$_tmp_);
        try {
            final SubLObject index_file = file_utilities.make_temp_filename((SubLObject)file_vector_utilities.$str149$_tmp_);
            try {
                SubLObject fvector = (SubLObject)file_vector_utilities.NIL;
                try {
                    fvector = file_vector.new_file_vector(data_file, index_file, (SubLObject)file_vector_utilities.$kw0$OUTPUT, file_utilities.$default_big_stream_buffer_size$.getDynamicValue(thread), file_utilities.$default_big_stream_buffer_size$.getDynamicValue(thread), (SubLObject)file_vector_utilities.UNPROVIDED);
                    convert_map_to_file_vector_backed_map(map, fvector, (SubLObject)file_vector_utilities.UNPROVIDED, (SubLObject)file_vector_utilities.UNPROVIDED);
                }
                finally {
                    final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)file_vector_utilities.T, thread);
                        final SubLObject _values = Values.getValuesAsVector();
                        if (file_vector_utilities.NIL != file_vector.file_vector_p(fvector)) {
                            file_vector.close_file_vector(fvector);
                        }
                        Values.restoreValuesFromVector(_values);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                    }
                }
                final SubLObject iterator = map_utilities.new_map_iterator(map);
                SubLObject valid;
                for (SubLObject done_var = (SubLObject)file_vector_utilities.NIL; file_vector_utilities.NIL == done_var; done_var = (SubLObject)SubLObjectFactory.makeBoolean(file_vector_utilities.NIL == valid)) {
                    thread.resetMultipleValues();
                    final SubLObject var = iteration.iteration_next(iterator);
                    valid = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    if (file_vector_utilities.NIL != valid) {
                        SubLObject current;
                        final SubLObject datum = current = var;
                        SubLObject key = (SubLObject)file_vector_utilities.NIL;
                        SubLObject reference = (SubLObject)file_vector_utilities.NIL;
                        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)file_vector_utilities.$list166);
                        key = current.first();
                        current = current.rest();
                        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)file_vector_utilities.$list166);
                        reference = current.first();
                        current = current.rest();
                        if (file_vector_utilities.NIL == current) {
                            if (file_vector_utilities.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && file_vector_utilities.NIL == file_vector_reference_p(reference)) {
                                Errors.error((SubLObject)file_vector_utilities.$str167$The_entry_for__A_in_the_original_, key);
                            }
                        }
                        else {
                            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)file_vector_utilities.$list166);
                        }
                    }
                }
                SubLObject new_map = (SubLObject)file_vector_utilities.NIL;
                SubLObject fvector2 = (SubLObject)file_vector_utilities.NIL;
                try {
                    fvector2 = file_vector.new_file_vector(data_file, index_file, (SubLObject)file_vector_utilities.$kw48$INPUT, (SubLObject)file_vector_utilities.UNPROVIDED, (SubLObject)file_vector_utilities.UNPROVIDED, (SubLObject)file_vector_utilities.UNPROVIDED);
                    new_map = new_file_vector_backed_map(fvector2, map_utilities.map_test(map), map_utilities.map_size(map), (SubLObject)file_vector_utilities.UNPROVIDED);
                }
                finally {
                    final SubLObject _prev_bind_2 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)file_vector_utilities.T, thread);
                        final SubLObject _values2 = Values.getValuesAsVector();
                        if (file_vector_utilities.NIL != file_vector.file_vector_p(fvector2)) {
                            file_vector.close_file_vector(fvector2);
                        }
                        Values.restoreValuesFromVector(_values2);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
                    }
                }
                if (file_vector_utilities.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && !map_utilities.map_size(new_map).numE(map_utilities.map_size(map))) {
                    Errors.error((SubLObject)file_vector_utilities.$str168$The_loaded_map_does_not_have_the_, map_utilities.map_size(new_map), map_utilities.map_size(map));
                }
                final SubLObject iterator2 = map_utilities.new_map_iterator(new_map);
                SubLObject valid2;
                for (SubLObject done_var2 = (SubLObject)file_vector_utilities.NIL; file_vector_utilities.NIL == done_var2; done_var2 = (SubLObject)SubLObjectFactory.makeBoolean(file_vector_utilities.NIL == valid2)) {
                    thread.resetMultipleValues();
                    final SubLObject var2 = iteration.iteration_next(iterator2);
                    valid2 = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    if (file_vector_utilities.NIL != valid2) {
                        SubLObject current2;
                        final SubLObject datum2 = current2 = var2;
                        SubLObject key2 = (SubLObject)file_vector_utilities.NIL;
                        SubLObject reference2 = (SubLObject)file_vector_utilities.NIL;
                        cdestructuring_bind.destructuring_bind_must_consp(current2, datum2, (SubLObject)file_vector_utilities.$list166);
                        key2 = current2.first();
                        current2 = current2.rest();
                        cdestructuring_bind.destructuring_bind_must_consp(current2, datum2, (SubLObject)file_vector_utilities.$list166);
                        reference2 = current2.first();
                        current2 = current2.rest();
                        if (file_vector_utilities.NIL == current2) {
                            if (file_vector_utilities.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && file_vector_utilities.NIL == file_vector_reference_p(reference2)) {
                                Errors.error((SubLObject)file_vector_utilities.$str169$The_entry_for__A_in_the_new_map_i, key2);
                            }
                        }
                        else {
                            cdestructuring_bind.cdestructuring_bind_error(datum2, (SubLObject)file_vector_utilities.$list166);
                        }
                    }
                }
                fvector2 = (SubLObject)file_vector_utilities.NIL;
                try {
                    fvector2 = file_vector.new_file_vector(data_file, index_file, (SubLObject)file_vector_utilities.$kw48$INPUT, (SubLObject)file_vector_utilities.UNPROVIDED, (SubLObject)file_vector_utilities.UNPROVIDED, (SubLObject)file_vector_utilities.UNPROVIDED);
                    SubLObject new_value = (SubLObject)file_vector_utilities.NIL;
                    final SubLObject iterator3 = map_utilities.new_map_iterator(new_map);
                    SubLObject valid3;
                    for (SubLObject done_var3 = (SubLObject)file_vector_utilities.NIL; file_vector_utilities.NIL == done_var3; done_var3 = (SubLObject)SubLObjectFactory.makeBoolean(file_vector_utilities.NIL == valid3)) {
                        thread.resetMultipleValues();
                        final SubLObject var3 = iteration.iteration_next(iterator3);
                        valid3 = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        if (file_vector_utilities.NIL != valid3) {
                            SubLObject current3;
                            final SubLObject datum3 = current3 = var3;
                            SubLObject new_key = (SubLObject)file_vector_utilities.NIL;
                            SubLObject impl_value = (SubLObject)file_vector_utilities.NIL;
                            cdestructuring_bind.destructuring_bind_must_consp(current3, datum3, (SubLObject)file_vector_utilities.$list170);
                            new_key = current3.first();
                            current3 = current3.rest();
                            cdestructuring_bind.destructuring_bind_must_consp(current3, datum3, (SubLObject)file_vector_utilities.$list170);
                            impl_value = current3.first();
                            current3 = current3.rest();
                            if (file_vector_utilities.NIL == current3) {
                                if (file_vector_utilities.NIL == file_vector_reference_p(impl_value) || file_vector_utilities.NIL == file_vector_reference_deletedP(impl_value)) {
                                    new_value = file_vector_backed_map_wX_cache_get(new_map, fvector2, (SubLObject)file_vector_utilities.NIL, new_key, (SubLObject)file_vector_utilities.UNPROVIDED);
                                    final SubLObject old_value = file_vector_backed_map_get(map, (SubLObject)file_vector_utilities.NIL, new_key, (SubLObject)file_vector_utilities.$kw53$NOT_FOUND);
                                    if (file_vector_utilities.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && file_vector_utilities.$kw53$NOT_FOUND == old_value) {
                                        Errors.error((SubLObject)file_vector_utilities.$str171$The_new_map_has_an_entry_for_key_, new_key);
                                    }
                                    if (file_vector_utilities.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && file_vector_utilities.NIL == list_utilities.sublisp_boolean(Functions.funcall(value_equal_fn, new_value, old_value))) {
                                        Errors.error((SubLObject)file_vector_utilities.$str172$The_values_for_key__A_are_not_equ, new SubLObject[] { new_key, value_equal_fn, new_value, old_value });
                                    }
                                }
                            }
                            else {
                                cdestructuring_bind.cdestructuring_bind_error(datum3, (SubLObject)file_vector_utilities.$list170);
                            }
                        }
                    }
                }
                finally {
                    final SubLObject _prev_bind_3 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)file_vector_utilities.T, thread);
                        final SubLObject _values3 = Values.getValuesAsVector();
                        if (file_vector_utilities.NIL != file_vector.file_vector_p(fvector2)) {
                            file_vector.close_file_vector(fvector2);
                        }
                        Values.restoreValuesFromVector(_values3);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_3, thread);
                    }
                }
                final SubLObject backup_key_set = set_utilities.construct_set_from_list(map_utilities.map_keys(backup_map), map_utilities.map_test(backup_map), (SubLObject)file_vector_utilities.UNPROVIDED);
                SubLObject fvector3 = (SubLObject)file_vector_utilities.NIL;
                try {
                    fvector3 = file_vector.new_file_vector(data_file, index_file, (SubLObject)file_vector_utilities.$kw48$INPUT, (SubLObject)file_vector_utilities.UNPROVIDED, (SubLObject)file_vector_utilities.UNPROVIDED, (SubLObject)file_vector_utilities.UNPROVIDED);
                    SubLObject cdotimes_end_var;
                    SubLObject i;
                    SubLObject conceptual_size;
                    SubLObject some_key;
                    SubLObject count;
                    SubLObject fvbm_iterator;
                    SubLObject checking_set;
                    SubLObject done_var4;
                    SubLObject data_bundle;
                    SubLObject valid4;
                    SubLObject current4;
                    SubLObject datum4;
                    SubLObject key3;
                    SubLObject reference3;
                    SubLObject set_contents_var;
                    SubLObject basis_object;
                    SubLObject state;
                    SubLObject checking_key;
                    for (cdotimes_end_var = set.set_size(backup_key_set), i = (SubLObject)file_vector_utilities.NIL, i = (SubLObject)file_vector_utilities.ZERO_INTEGER; i.numL(cdotimes_end_var); i = Numbers.add(i, (SubLObject)file_vector_utilities.ONE_INTEGER)) {
                        conceptual_size = Numbers.subtract(set.set_size(backup_key_set), (SubLObject)file_vector_utilities.ONE_INTEGER);
                        some_key = list_utilities.random_element(set.set_element_list(backup_key_set));
                        if (file_vector_utilities.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && file_vector_utilities.NIL == map_utilities.map_has_keyP(new_map, some_key)) {
                            Errors.error((SubLObject)file_vector_utilities.$str173$New_map__A_and_backup_key_set__A_, new_map, backup_key_set, some_key);
                        }
                        file_vector_backed_map_remove(new_map, some_key, (SubLObject)file_vector_utilities.$kw174$SUPPORT_UNDO);
                        set.set_remove(some_key, backup_key_set);
                        count = (SubLObject)file_vector_utilities.ZERO_INTEGER;
                        fvbm_iterator = new_file_vector_backed_map_iterator(new_map, fvector3, (SubLObject)file_vector_utilities.UNPROVIDED, (SubLObject)file_vector_utilities.UNPROVIDED);
                        checking_set = set.copy_set(backup_key_set);
                        for (done_var4 = (SubLObject)file_vector_utilities.NIL; file_vector_utilities.NIL == done_var4; done_var4 = (SubLObject)SubLObjectFactory.makeBoolean(file_vector_utilities.NIL == valid4)) {
                            thread.resetMultipleValues();
                            data_bundle = iteration.iteration_next(fvbm_iterator);
                            valid4 = thread.secondMultipleValue();
                            thread.resetMultipleValues();
                            if (file_vector_utilities.NIL != valid4) {
                                datum4 = (current4 = data_bundle);
                                key3 = (SubLObject)file_vector_utilities.NIL;
                                reference3 = (SubLObject)file_vector_utilities.NIL;
                                cdestructuring_bind.destructuring_bind_must_consp(current4, datum4, (SubLObject)file_vector_utilities.$list166);
                                key3 = current4.first();
                                current4 = current4.rest();
                                cdestructuring_bind.destructuring_bind_must_consp(current4, datum4, (SubLObject)file_vector_utilities.$list166);
                                reference3 = current4.first();
                                current4 = current4.rest();
                                if (file_vector_utilities.NIL == current4) {
                                    if (file_vector_utilities.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && file_vector_utilities.NIL == set.set_memberP(key3, checking_set)) {
                                        Errors.error((SubLObject)file_vector_utilities.$str175$We_are_getting__A_back__but_that_, key3, set.set_element_list(checking_set));
                                    }
                                    count = Numbers.add(count, (SubLObject)file_vector_utilities.ONE_INTEGER);
                                    if (file_vector_utilities.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && key3.eql(some_key)) {
                                        Errors.error((SubLObject)file_vector_utilities.$str176$We_are_getting_the_removed_key__A, some_key, reference3);
                                    }
                                    if (file_vector_utilities.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && !map_utilities.map_get(backup_map, key3, (SubLObject)file_vector_utilities.UNPROVIDED).equalp(reference3)) {
                                        Errors.error((SubLObject)file_vector_utilities.$str177$We_are_not_getting_back_the_same_, key3, map_utilities.map_get(backup_map, key3, (SubLObject)file_vector_utilities.UNPROVIDED), reference3);
                                    }
                                    set.set_remove(key3, checking_set);
                                }
                                else {
                                    cdestructuring_bind.cdestructuring_bind_error(datum4, (SubLObject)file_vector_utilities.$list166);
                                }
                            }
                        }
                        if (file_vector_utilities.NIL == set.empty_set_p(checking_set)) {
                            Errors.warn((SubLObject)file_vector_utilities.$str178$We_no_longer_visited__A_____inves, set.set_element_list(checking_set));
                            set_contents_var = set.do_set_internal(checking_set);
                            for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)file_vector_utilities.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); file_vector_utilities.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                checking_key = set_contents.do_set_contents_next(basis_object, state);
                                if (file_vector_utilities.NIL != set_contents.do_set_contents_element_validP(state, checking_key)) {
                                    if (file_vector_utilities.NIL != map_utilities.map_has_keyP(new_map, checking_key)) {
                                        Errors.warn((SubLObject)file_vector_utilities.$str179$_____A_is_still_present_in_map___, checking_key);
                                    }
                                    else {
                                        Errors.warn((SubLObject)file_vector_utilities.$str180$_____A_is_not_even_findable_in_th, checking_key);
                                    }
                                }
                            }
                            Errors.error((SubLObject)file_vector_utilities.$str181$Deleting__A_to_produce__A_did_not, some_key, set.set_element_list(backup_key_set));
                        }
                        if (file_vector_utilities.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && !count.numE(conceptual_size)) {
                            Errors.error((SubLObject)file_vector_utilities.$str182$We_visited__A_entries_but_we_shou, count, conceptual_size);
                        }
                    }
                }
                finally {
                    final SubLObject _prev_bind_4 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)file_vector_utilities.T, thread);
                        final SubLObject _values4 = Values.getValuesAsVector();
                        if (file_vector_utilities.NIL != file_vector.file_vector_p(fvector3)) {
                            file_vector.close_file_vector(fvector3);
                        }
                        Values.restoreValuesFromVector(_values4);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_4, thread);
                    }
                }
            }
            finally {
                final SubLObject _prev_bind_5 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)file_vector_utilities.T, thread);
                    final SubLObject _values5 = Values.getValuesAsVector();
                    SubLObject ignore_errors_tag = (SubLObject)file_vector_utilities.NIL;
                    try {
                        thread.throwStack.push(file_vector_utilities.$kw81$IGNORE_ERRORS_TARGET);
                        final SubLObject _prev_bind_0_$15 = Errors.$error_handler$.currentBinding(thread);
                        try {
                            Errors.$error_handler$.bind(Symbols.symbol_function((SubLObject)file_vector_utilities.$sym82$IGNORE_ERRORS_HANDLER), thread);
                            try {
                                Filesys.delete_file(index_file);
                            }
                            catch (Throwable catch_var) {
                                Errors.handleThrowable(catch_var, (SubLObject)file_vector_utilities.NIL);
                            }
                        }
                        finally {
                            Errors.$error_handler$.rebind(_prev_bind_0_$15, thread);
                        }
                    }
                    catch (Throwable ccatch_env_var) {
                        ignore_errors_tag = Errors.handleThrowable(ccatch_env_var, (SubLObject)file_vector_utilities.$kw81$IGNORE_ERRORS_TARGET);
                        thread.throwStack.pop();
                    }
                    finally {
                        thread.throwStack.pop();
                    }
                    Values.restoreValuesFromVector(_values5);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_5, thread);
                }
            }
        }
        finally {
            final SubLObject _prev_bind_6 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)file_vector_utilities.T, thread);
                final SubLObject _values6 = Values.getValuesAsVector();
                SubLObject ignore_errors_tag2 = (SubLObject)file_vector_utilities.NIL;
                try {
                    thread.throwStack.push(file_vector_utilities.$kw81$IGNORE_ERRORS_TARGET);
                    final SubLObject _prev_bind_0_$16 = Errors.$error_handler$.currentBinding(thread);
                    try {
                        Errors.$error_handler$.bind(Symbols.symbol_function((SubLObject)file_vector_utilities.$sym82$IGNORE_ERRORS_HANDLER), thread);
                        try {
                            Filesys.delete_file(data_file);
                        }
                        catch (Throwable catch_var2) {
                            Errors.handleThrowable(catch_var2, (SubLObject)file_vector_utilities.NIL);
                        }
                    }
                    finally {
                        Errors.$error_handler$.rebind(_prev_bind_0_$16, thread);
                    }
                }
                catch (Throwable ccatch_env_var2) {
                    ignore_errors_tag2 = Errors.handleThrowable(ccatch_env_var2, (SubLObject)file_vector_utilities.$kw81$IGNORE_ERRORS_TARGET);
                    thread.throwStack.pop();
                }
                finally {
                    thread.throwStack.pop();
                }
                Values.restoreValuesFromVector(_values6);
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_6, thread);
            }
        }
        return (SubLObject)file_vector_utilities.$kw162$SUCCESS;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-vector-utilities.lisp", position = 76594L)
    public static SubLObject segment_file_vector_data_stream(final SubLObject fvector, SubLObject stream, SubLObject include_indexP) {
        if (stream == file_vector_utilities.UNPROVIDED) {
            stream = StreamsLow.$standard_output$.getDynamicValue();
        }
        if (include_indexP == file_vector_utilities.UNPROVIDED) {
            include_indexP = (SubLObject)file_vector_utilities.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject data_stream = file_vector.get_file_vector_data_stream(fvector);
        SubLObject last = (SubLObject)file_vector_utilities.NIL;
        final SubLObject iterator_var = file_vector.new_file_vector_index_iterator(fvector);
        SubLObject valid;
        for (SubLObject done_var = (SubLObject)file_vector_utilities.NIL; file_vector_utilities.NIL == done_var; done_var = (SubLObject)SubLObjectFactory.makeBoolean(file_vector_utilities.NIL == valid)) {
            thread.resetMultipleValues();
            final SubLObject tuple = iteration.iteration_next(iterator_var);
            valid = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (file_vector_utilities.NIL != valid) {
                SubLObject current;
                final SubLObject datum = current = tuple;
                SubLObject index = (SubLObject)file_vector_utilities.NIL;
                SubLObject address = (SubLObject)file_vector_utilities.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)file_vector_utilities.$list183);
                index = current.first();
                current = (address = current.rest());
                if (file_vector_utilities.NIL != last) {
                    if (file_vector_utilities.NIL != include_indexP) {
                        print_high.princ(index, stream);
                        streams_high.write_char((SubLObject)Characters.CHAR_space, stream);
                    }
                    file_utilities.copy_binary_data_to_hex_stream(data_stream, stream, last, address);
                    streams_high.terpri(stream);
                }
                last = address;
            }
        }
        file_utilities.copy_binary_data_to_hex_stream(data_stream, stream, last, (SubLObject)file_vector_utilities.UNPROVIDED);
        streams_high.terpri(stream);
        return fvector;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/file-vector-utilities.lisp", position = 77676L)
    public static SubLObject inspect_file_vector_data_record(final SubLObject fvector, final SubLObject index) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject size = file_vector.file_vector_length(fvector);
        if (file_vector_utilities.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && !index.numL(size)) {
            Errors.error((SubLObject)file_vector_utilities.$str184$The_index__A_is_outside_of_the_ra, index, size);
        }
        final SubLObject data_stream = file_vector.get_file_vector_data_stream(fvector);
        final SubLObject start = file_vector.read_file_vector_index_entry(fvector, index);
        final SubLObject end_index = Numbers.add(index, (SubLObject)file_vector_utilities.ONE_INTEGER);
        if (end_index.numL(size)) {
            final SubLObject end = file_vector.read_file_vector_index_entry(fvector, Numbers.add(index, (SubLObject)file_vector_utilities.ONE_INTEGER));
            return file_utilities.get_binary_data_from_stream(data_stream, start, end);
        }
        return file_utilities.get_binary_data_from_stream(data_stream, start, (SubLObject)file_vector_utilities.UNPROVIDED);
    }
    
    public static SubLObject declare_file_vector_utilities_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_vector_utilities", "create_file_backing_for_map", "CREATE-FILE-BACKING-FOR-MAP", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_vector_utilities", "create_file_vector_backing_for_map", "CREATE-FILE-VECTOR-BACKING-FOR-MAP", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_vector_utilities", "write_file_vector_backing_map_prologue", "WRITE-FILE-VECTOR-BACKING-MAP-PROLOGUE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_vector_utilities", "write_file_vector_backing_map_entry", "WRITE-FILE-VECTOR-BACKING-MAP-ENTRY", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_vector_utilities", "write_file_vector_backing_map_entry_key", "WRITE-FILE-VECTOR-BACKING-MAP-ENTRY-KEY", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_vector_utilities", "write_file_vector_backing_map_entry_value", "WRITE-FILE-VECTOR-BACKING-MAP-ENTRY-VALUE", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_vector_utilities", "write_file_vector_backing_map_prologue_to_data_stream", "WRITE-FILE-VECTOR-BACKING-MAP-PROLOGUE-TO-DATA-STREAM", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_vector_utilities", "create_file_backing_for_maps", "CREATE-FILE-BACKING-FOR-MAPS", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_vector_utilities", "create_file_vector_backing_for_maps", "CREATE-FILE-VECTOR-BACKING-FOR-MAPS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_vector_utilities", "file_vector_reference_print_function_trampoline", "FILE-VECTOR-REFERENCE-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_vector_utilities", "file_vector_reference_p", "FILE-VECTOR-REFERENCE-P", 1, 0, false);
        new $file_vector_reference_p$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_vector_utilities", "fvector_ref_index", "FVECTOR-REF-INDEX", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_vector_utilities", "fvector_ref_payload", "FVECTOR-REF-PAYLOAD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_vector_utilities", "_csetf_fvector_ref_index", "_CSETF-FVECTOR-REF-INDEX", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_vector_utilities", "_csetf_fvector_ref_payload", "_CSETF-FVECTOR-REF-PAYLOAD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_vector_utilities", "make_file_vector_reference", "MAKE-FILE-VECTOR-REFERENCE", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_vector_utilities", "visit_defstruct_file_vector_reference", "VISIT-DEFSTRUCT-FILE-VECTOR-REFERENCE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_vector_utilities", "visit_defstruct_object_file_vector_reference_method", "VISIT-DEFSTRUCT-OBJECT-FILE-VECTOR-REFERENCE-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_vector_utilities", "print_fvector_ref", "PRINT-FVECTOR-REF", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_vector_utilities", "new_file_vector_reference", "NEW-FILE-VECTOR-REFERENCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_vector_utilities", "new_file_vector_reference_wX_payload", "NEW-FILE-VECTOR-REFERENCE-W/-PAYLOAD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_vector_utilities", "file_vector_reference_index", "FILE-VECTOR-REFERENCE-INDEX", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_vector_utilities", "mark_file_vector_reference_as_mutated", "MARK-FILE-VECTOR-REFERENCE-AS-MUTATED", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_vector_utilities", "recover_mutated_file_vector_reference", "RECOVER-MUTATED-FILE-VECTOR-REFERENCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_vector_utilities", "restore_file_vector_reference", "RESTORE-FILE-VECTOR-REFERENCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_vector_utilities", "set_file_vector_reference_referenced_object", "SET-FILE-VECTOR-REFERENCE-REFERENCED-OBJECT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_vector_utilities", "clear_file_vector_reference_referenced_object", "CLEAR-FILE-VECTOR-REFERENCE-REFERENCED-OBJECT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_vector_utilities", "file_vector_reference_referenced_object", "FILE-VECTOR-REFERENCE-REFERENCED-OBJECT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_vector_utilities", "mark_file_vector_reference_as_deleted", "MARK-FILE-VECTOR-REFERENCE-AS-DELETED", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_vector_utilities", "fvector_ref_payload_in_memory_p", "FVECTOR-REF-PAYLOAD-IN-MEMORY-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_vector_utilities", "fvector_ref_valid_index_p", "FVECTOR-REF-VALID-INDEX-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_vector_utilities", "fvector_ref_has_valid_index_p", "FVECTOR-REF-HAS-VALID-INDEX-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_vector_utilities", "fvector_ref_mutated_index_p", "FVECTOR-REF-MUTATED-INDEX-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_vector_utilities", "fvector_ref_has_mutated_index_p", "FVECTOR-REF-HAS-MUTATED-INDEX-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_vector_utilities", "file_vector_reference_swapped_outP", "FILE-VECTOR-REFERENCE-SWAPPED-OUT?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_vector_utilities", "file_vector_reference_present_pristineP", "FILE-VECTOR-REFERENCE-PRESENT-PRISTINE?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_vector_utilities", "file_vector_reference_present_mutatedP", "FILE-VECTOR-REFERENCE-PRESENT-MUTATED?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_vector_utilities", "file_vector_reference_deletedP", "FILE-VECTOR-REFERENCE-DELETED?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_vector_utilities", "file_vector_reference_status", "FILE-VECTOR-REFERENCE-STATUS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_vector_utilities", "file_vector_reference_presentP", "FILE-VECTOR-REFERENCE-PRESENT?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_vector_utilities", "cfasl_input_file_vector_reference", "CFASL-INPUT-FILE-VECTOR-REFERENCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_vector_utilities", "cfasl_output_file_vector_reference", "CFASL-OUTPUT-FILE-VECTOR-REFERENCE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_vector_utilities", "cfasl_output_object_file_vector_reference_method", "CFASL-OUTPUT-OBJECT-FILE-VECTOR-REFERENCE-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_vector_utilities", "stamp_file_vector_for_references", "STAMP-FILE-VECTOR-FOR-REFERENCES", 1, 2, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.file_vector_utilities", "with_potential_file_vector_backed_map_lock", "WITH-POTENTIAL-FILE-VECTOR-BACKED-MAP-LOCK");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.file_vector_utilities", "with_file_vector_backed_map_stream_lock", "WITH-FILE-VECTOR-BACKED-MAP-STREAM-LOCK");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_vector_utilities", "new_file_vector_backed_map", "NEW-FILE-VECTOR-BACKED-MAP", 1, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_vector_utilities", "load_file_vector_backed_map", "LOAD-FILE-VECTOR-BACKED-MAP", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_vector_utilities", "load_one_file_vector_backed_map", "LOAD-ONE-FILE-VECTOR-BACKED-MAP", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_vector_utilities", "load_file_vector_backed_maps", "LOAD-FILE-VECTOR-BACKED-MAPS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_vector_utilities", "file_vector_backed_map_get", "FILE-VECTOR-BACKED-MAP-GET", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_vector_utilities", "file_vector_backed_map_wX_cache_get", "FILE-VECTOR-BACKED-MAP-W/-CACHE-GET", 4, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_vector_utilities", "file_vector_backed_map_put", "FILE-VECTOR-BACKED-MAP-PUT", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_vector_utilities", "file_vector_backed_map_wX_cache_put", "FILE-VECTOR-BACKED-MAP-W/-CACHE-PUT", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_vector_utilities", "file_vector_backed_map_remove", "FILE-VECTOR-BACKED-MAP-REMOVE", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_vector_utilities", "file_vector_backed_map_wX_cache_remove", "FILE-VECTOR-BACKED-MAP-W/-CACHE-REMOVE", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_vector_utilities", "file_vector_backed_map_touch", "FILE-VECTOR-BACKED-MAP-TOUCH", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_vector_utilities", "file_vector_backed_map_wX_cache_touch", "FILE-VECTOR-BACKED-MAP-W/-CACHE-TOUCH", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_vector_utilities", "undo_change_to_file_vector_backed_map", "UNDO-CHANGE-TO-FILE-VECTOR-BACKED-MAP", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_vector_utilities", "undo_change_to_file_vector_backed_map_wX_cache", "UNDO-CHANGE-TO-FILE-VECTOR-BACKED-MAP-W/-CACHE", 3, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.file_vector_utilities", "do_file_vector_backed_map", "DO-FILE-VECTOR-BACKED-MAP");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_vector_utilities", "new_file_vector_backed_map_iterator", "NEW-FILE-VECTOR-BACKED-MAP-ITERATOR", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_vector_utilities", "new_file_vector_backed_map_iterator_state", "NEW-FILE-VECTOR-BACKED-MAP-ITERATOR-STATE", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_vector_utilities", "file_vector_backed_map_iterator_done", "FILE-VECTOR-BACKED-MAP-ITERATOR-DONE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_vector_utilities", "file_vector_backed_map_iterator_next", "FILE-VECTOR-BACKED-MAP-ITERATOR-NEXT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_vector_utilities", "file_vector_backed_map_cache_ratio", "FILE-VECTOR-BACKED-MAP-CACHE-RATIO", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_vector_utilities", "swap_out_all_pristine_file_vector_backed_map_objects", "SWAP-OUT-ALL-PRISTINE-FILE-VECTOR-BACKED-MAP-OBJECTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_vector_utilities", "swap_out_pristine_file_vector_backed_map_object", "SWAP-OUT-PRISTINE-FILE-VECTOR-BACKED-MAP-OBJECT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_vector_utilities", "potentially_swap_out_pristine_file_vector_backed_map_object", "POTENTIALLY-SWAP-OUT-PRISTINE-FILE-VECTOR-BACKED-MAP-OBJECT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_vector_utilities", "compact_file_vector_backed_map_representation", "COMPACT-FILE-VECTOR-BACKED-MAP-REPRESENTATION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_vector_utilities", "file_vector_index_from_map_element_number", "FILE-VECTOR-INDEX-FROM-MAP-ELEMENT-NUMBER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_vector_utilities", "file_vector_value_index_from_key_index", "FILE-VECTOR-VALUE-INDEX-FROM-KEY-INDEX", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_vector_utilities", "map_size_from_file_vector_length", "MAP-SIZE-FROM-FILE-VECTOR-LENGTH", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_vector_utilities", "file_vector_backed_map_read_key", "FILE-VECTOR-BACKED-MAP-READ-KEY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_vector_utilities", "file_vector_backed_map_read_value", "FILE-VECTOR-BACKED-MAP-READ-VALUE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_vector_utilities", "convert_map_to_file_vector_backed_map", "CONVERT-MAP-TO-FILE-VECTOR-BACKED-MAP", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_vector_utilities", "create_file_vector_backed_map_from_map", "CREATE-FILE-VECTOR-BACKED-MAP-FROM-MAP", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_vector_utilities", "populate_file_vector_backed_map_from_map", "POPULATE-FILE-VECTOR-BACKED-MAP-FROM-MAP", 3, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_vector_utilities", "build_file_vector_backed_map_from_map", "BUILD-FILE-VECTOR-BACKED-MAP-FROM-MAP", 3, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_vector_utilities", "upgrade_map_to_file_vector_backed_map", "UPGRADE-MAP-TO-FILE-VECTOR-BACKED-MAP", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_vector_utilities", "file_vector_indexical_p", "FILE-VECTOR-INDEXICAL-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_vector_utilities", "register_indexical_file_vector_reference", "REGISTER-INDEXICAL-FILE-VECTOR-REFERENCE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_vector_utilities", "dereference_file_vector_indexical", "DEREFERENCE-FILE-VECTOR-INDEXICAL", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_vector_utilities", "dereference_file_vector_indexical_lock", "DEREFERENCE-FILE-VECTOR-INDEXICAL-LOCK", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_vector_utilities", "backed_map_print_function_trampoline", "BACKED-MAP-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_vector_utilities", "backed_map_p", "BACKED-MAP-P", 1, 0, false);
        new $backed_map_p$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_vector_utilities", "backed_map_map", "BACKED-MAP-MAP", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_vector_utilities", "backed_map_fvector", "BACKED-MAP-FVECTOR", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_vector_utilities", "backed_map_common_symbols", "BACKED-MAP-COMMON-SYMBOLS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_vector_utilities", "_csetf_backed_map_map", "_CSETF-BACKED-MAP-MAP", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_vector_utilities", "_csetf_backed_map_fvector", "_CSETF-BACKED-MAP-FVECTOR", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_vector_utilities", "_csetf_backed_map_common_symbols", "_CSETF-BACKED-MAP-COMMON-SYMBOLS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_vector_utilities", "make_backed_map", "MAKE-BACKED-MAP", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_vector_utilities", "visit_defstruct_backed_map", "VISIT-DEFSTRUCT-BACKED-MAP", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_vector_utilities", "visit_defstruct_object_backed_map_method", "VISIT-DEFSTRUCT-OBJECT-BACKED-MAP-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_vector_utilities", "new_backed_map", "NEW-BACKED-MAP", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_vector_utilities", "new_backed_map_from_files", "NEW-BACKED-MAP-FROM-FILES", 3, 1, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.file_vector_utilities", "with_backed_map_common_symbols", "WITH-BACKED-MAP-COMMON-SYMBOLS");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_vector_utilities", "print_backed_map", "PRINT-BACKED-MAP", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_vector_utilities", "new_future_backed_map", "NEW-FUTURE-BACKED-MAP", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_vector_utilities", "new_indexical_backed_map", "NEW-INDEXICAL-BACKED-MAP", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_vector_utilities", "reconnect_backed_map", "RECONNECT-BACKED-MAP", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_vector_utilities", "reconnect_backed_map_based_on_backed_map", "RECONNECT-BACKED-MAP-BASED-ON-BACKED-MAP", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_vector_utilities", "get_backed_map_file_vector", "GET-BACKED-MAP-FILE-VECTOR", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_vector_utilities", "get_backed_map_file_vector_lock", "GET-BACKED-MAP-FILE-VECTOR-LOCK", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_vector_utilities", "cfasl_input_backed_map", "CFASL-INPUT-BACKED-MAP", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_vector_utilities", "cfasl_output_backed_map", "CFASL-OUTPUT-BACKED-MAP", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_vector_utilities", "cfasl_output_object_backed_map_method", "CFASL-OUTPUT-OBJECT-BACKED-MAP-METHOD", 2, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.file_vector_utilities", "with_backed_map_cache_strategy", "WITH-BACKED-MAP-CACHE-STRATEGY");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_vector_utilities", "backed_map_cache_strategy", "BACKED-MAP-CACHE-STRATEGY", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_vector_utilities", "is_map_object_p_backed_map_method", "IS-MAP-OBJECT-P-BACKED-MAP-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_vector_utilities", "map_object_size_backed_map_method", "MAP-OBJECT-SIZE-BACKED-MAP-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_vector_utilities", "map_backed_map_size", "MAP-BACKED-MAP-SIZE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_vector_utilities", "map_object_test_backed_map_method", "MAP-OBJECT-TEST-BACKED-MAP-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_vector_utilities", "map_backed_map_test", "MAP-BACKED-MAP-TEST", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_vector_utilities", "map_object_put_backed_map_method", "MAP-OBJECT-PUT-BACKED-MAP-METHOD", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_vector_utilities", "map_backed_map_put", "MAP-BACKED-MAP-PUT", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_vector_utilities", "map_object_get_backed_map_method", "MAP-OBJECT-GET-BACKED-MAP-METHOD", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_vector_utilities", "map_backed_map_get", "MAP-BACKED-MAP-GET", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_vector_utilities", "map_object_get_without_values_backed_map_method", "MAP-OBJECT-GET-WITHOUT-VALUES-BACKED-MAP-METHOD", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_vector_utilities", "map_backed_map_get_without_values", "MAP-BACKED-MAP-GET-WITHOUT-VALUES", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_vector_utilities", "map_object_remove_backed_map_method", "MAP-OBJECT-REMOVE-BACKED-MAP-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_vector_utilities", "map_backed_map_remove", "MAP-BACKED-MAP-REMOVE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_vector_utilities", "map_object_remove_all_backed_map_method", "MAP-OBJECT-REMOVE-ALL-BACKED-MAP-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_vector_utilities", "map_backed_map_remove_all", "MAP-BACKED-MAP-REMOVE-ALL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_vector_utilities", "map_object_touch_backed_map_method", "MAP-OBJECT-TOUCH-BACKED-MAP-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_vector_utilities", "map_backed_map_touch", "MAP-BACKED-MAP-TOUCH", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_vector_utilities", "map_object_change_set_backed_map_method", "MAP-OBJECT-CHANGE-SET-BACKED-MAP-METHOD", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_vector_utilities", "map_backed_map_change_set", "MAP-BACKED-MAP-CHANGE-SET", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_vector_utilities", "new_map_object_with_same_properties_backed_map_method", "NEW-MAP-OBJECT-WITH-SAME-PROPERTIES-BACKED-MAP-METHOD", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_vector_utilities", "new_map_backed_map_with_same_properties", "NEW-MAP-BACKED-MAP-WITH-SAME-PROPERTIES", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_vector_utilities", "new_map_object_iterator_backed_map_method", "NEW-MAP-OBJECT-ITERATOR-BACKED-MAP-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_vector_utilities", "new_map_backed_map_iterator", "NEW-MAP-BACKED-MAP-ITERATOR", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_vector_utilities", "new_map_backed_map_iterator_state", "NEW-MAP-BACKED-MAP-ITERATOR-STATE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_vector_utilities", "map_backed_map_iterator_done", "MAP-BACKED-MAP-ITERATOR-DONE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_vector_utilities", "map_backed_map_iterator_next", "MAP-BACKED-MAP-ITERATOR-NEXT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_vector_utilities", "map_object_arbitrary_key_backed_map_method", "MAP-OBJECT-ARBITRARY-KEY-BACKED-MAP-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_vector_utilities", "map_backed_map_arbitrary_key", "MAP-BACKED-MAP-ARBITRARY-KEY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_vector_utilities", "swap_out_all_pristine_backed_map_objects", "SWAP-OUT-ALL-PRISTINE-BACKED-MAP-OBJECTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_vector_utilities", "get_backed_map_non_pristine_object_count", "GET-BACKED-MAP-NON-PRISTINE-OBJECT-COUNT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_vector_utilities", "test_file_vector_backed_map_with_alist", "TEST-FILE-VECTOR-BACKED-MAP-WITH-ALIST", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_vector_utilities", "test_file_vector_backed_map", "TEST-FILE-VECTOR-BACKED-MAP", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_vector_utilities", "test_enforce_map_specific_cache_ratios", "TEST-ENFORCE-MAP-SPECIFIC-CACHE-RATIOS", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_vector_utilities", "test_map_to_file_vector_backed_map_conversion_with_alist", "TEST-MAP-TO-FILE-VECTOR-BACKED-MAP-CONVERSION-WITH-ALIST", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_vector_utilities", "test_map_to_file_vector_backed_map_conversion", "TEST-MAP-TO-FILE-VECTOR-BACKED-MAP-CONVERSION", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_vector_utilities", "segment_file_vector_data_stream", "SEGMENT-FILE-VECTOR-DATA-STREAM", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.file_vector_utilities", "inspect_file_vector_data_record", "INSPECT-FILE-VECTOR-DATA-RECORD", 2, 0, false);
        return (SubLObject)file_vector_utilities.NIL;
    }
    
    public static SubLObject init_file_vector_utilities_file() {
        file_vector_utilities.$show_file_vector_reference_payload_in_print$ = SubLFiles.defparameter("*SHOW-FILE-VECTOR-REFERENCE-PAYLOAD-IN-PRINT*", (SubLObject)file_vector_utilities.NIL);
        file_vector_utilities.$dtp_file_vector_reference$ = SubLFiles.defconstant("*DTP-FILE-VECTOR-REFERENCE*", (SubLObject)file_vector_utilities.$sym4$FILE_VECTOR_REFERENCE);
        file_vector_utilities.$cfasl_opcode_fvector_reference$ = SubLFiles.defconstant("*CFASL-OPCODE-FVECTOR-REFERENCE*", (SubLObject)file_vector_utilities.$int35$69);
        file_vector_utilities.$file_vector_backed_map_read_lock$ = SubLFiles.defparameter("*FILE-VECTOR-BACKED-MAP-READ-LOCK*", (SubLObject)file_vector_utilities.NIL);
        file_vector_utilities.$file_vector_get_recursion_guard$ = SubLFiles.defparameter("*FILE-VECTOR-GET-RECURSION-GUARD*", (SubLObject)file_vector_utilities.NIL);
        file_vector_utilities.$file_vector_indexical_registry$ = SubLFiles.deflexical("*FILE-VECTOR-INDEXICAL-REGISTRY*", maybeDefault((SubLObject)file_vector_utilities.$sym77$_FILE_VECTOR_INDEXICAL_REGISTRY_, file_vector_utilities.$file_vector_indexical_registry$, ()->(dictionary.new_dictionary((SubLObject)file_vector_utilities.UNPROVIDED, (SubLObject)file_vector_utilities.UNPROVIDED))));
        file_vector_utilities.$file_vector_indexical_lock_registry$ = SubLFiles.deflexical("*FILE-VECTOR-INDEXICAL-LOCK-REGISTRY*", maybeDefault((SubLObject)file_vector_utilities.$sym78$_FILE_VECTOR_INDEXICAL_LOCK_REGISTRY_, file_vector_utilities.$file_vector_indexical_lock_registry$, ()->(dictionary.new_dictionary((SubLObject)file_vector_utilities.UNPROVIDED, (SubLObject)file_vector_utilities.UNPROVIDED))));
        file_vector_utilities.$dtp_backed_map$ = SubLFiles.defconstant("*DTP-BACKED-MAP*", (SubLObject)file_vector_utilities.$sym84$BACKED_MAP);
        file_vector_utilities.$cfasl_opcode_backed_map$ = SubLFiles.defconstant("*CFASL-OPCODE-BACKED-MAP*", (SubLObject)file_vector_utilities.$int113$76);
        file_vector_utilities.$cfasl_outer_fvector_for_backed_maps$ = SubLFiles.defparameter("*CFASL-OUTER-FVECTOR-FOR-BACKED-MAPS*", (SubLObject)file_vector_utilities.NIL);
        file_vector_utilities.$current_backed_map_cache_strategy$ = SubLFiles.defparameter("*CURRENT-BACKED-MAP-CACHE-STRATEGY*", (SubLObject)file_vector_utilities.NIL);
        return (SubLObject)file_vector_utilities.NIL;
    }
    
    public static SubLObject setup_file_vector_utilities_file() {
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), file_vector_utilities.$dtp_file_vector_reference$.getGlobalValue(), Symbols.symbol_function((SubLObject)file_vector_utilities.$sym11$FILE_VECTOR_REFERENCE_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)file_vector_utilities.$list12);
        Structures.def_csetf((SubLObject)file_vector_utilities.$sym13$FVECTOR_REF_INDEX, (SubLObject)file_vector_utilities.$sym14$_CSETF_FVECTOR_REF_INDEX);
        Structures.def_csetf((SubLObject)file_vector_utilities.$sym15$FVECTOR_REF_PAYLOAD, (SubLObject)file_vector_utilities.$sym16$_CSETF_FVECTOR_REF_PAYLOAD);
        Equality.identity((SubLObject)file_vector_utilities.$sym4$FILE_VECTOR_REFERENCE);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), file_vector_utilities.$dtp_file_vector_reference$.getGlobalValue(), Symbols.symbol_function((SubLObject)file_vector_utilities.$sym24$VISIT_DEFSTRUCT_OBJECT_FILE_VECTOR_REFERENCE_METHOD));
        cfasl.register_cfasl_input_function(file_vector_utilities.$cfasl_opcode_fvector_reference$.getGlobalValue(), (SubLObject)file_vector_utilities.$sym36$CFASL_INPUT_FILE_VECTOR_REFERENCE);
        Structures.register_method(cfasl.$cfasl_output_object_method_table$.getGlobalValue(), file_vector_utilities.$dtp_file_vector_reference$.getGlobalValue(), Symbols.symbol_function((SubLObject)file_vector_utilities.$sym37$CFASL_OUTPUT_OBJECT_FILE_VECTOR_REFERENCE_METHOD));
        subl_macro_promotions.declare_defglobal((SubLObject)file_vector_utilities.$sym77$_FILE_VECTOR_INDEXICAL_REGISTRY_);
        subl_macro_promotions.declare_defglobal((SubLObject)file_vector_utilities.$sym78$_FILE_VECTOR_INDEXICAL_LOCK_REGISTRY_);
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), file_vector_utilities.$dtp_backed_map$.getGlobalValue(), Symbols.symbol_function((SubLObject)file_vector_utilities.$sym91$BACKED_MAP_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)file_vector_utilities.$list92);
        Structures.def_csetf((SubLObject)file_vector_utilities.$sym93$BACKED_MAP_MAP, (SubLObject)file_vector_utilities.$sym94$_CSETF_BACKED_MAP_MAP);
        Structures.def_csetf((SubLObject)file_vector_utilities.$sym95$BACKED_MAP_FVECTOR, (SubLObject)file_vector_utilities.$sym96$_CSETF_BACKED_MAP_FVECTOR);
        Structures.def_csetf((SubLObject)file_vector_utilities.$sym97$BACKED_MAP_COMMON_SYMBOLS, (SubLObject)file_vector_utilities.$sym98$_CSETF_BACKED_MAP_COMMON_SYMBOLS);
        Equality.identity((SubLObject)file_vector_utilities.$sym84$BACKED_MAP);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), file_vector_utilities.$dtp_backed_map$.getGlobalValue(), Symbols.symbol_function((SubLObject)file_vector_utilities.$sym103$VISIT_DEFSTRUCT_OBJECT_BACKED_MAP_METHOD));
        cfasl.register_cfasl_input_function(file_vector_utilities.$cfasl_opcode_backed_map$.getGlobalValue(), (SubLObject)file_vector_utilities.$sym114$CFASL_INPUT_BACKED_MAP);
        Structures.register_method(cfasl.$cfasl_output_object_method_table$.getGlobalValue(), file_vector_utilities.$dtp_backed_map$.getGlobalValue(), Symbols.symbol_function((SubLObject)file_vector_utilities.$sym116$CFASL_OUTPUT_OBJECT_BACKED_MAP_METHOD));
        Structures.register_method(map_utilities.$is_map_object_p_method_table$.getGlobalValue(), file_vector_utilities.$dtp_backed_map$.getGlobalValue(), Symbols.symbol_function((SubLObject)file_vector_utilities.$sym119$IS_MAP_OBJECT_P_BACKED_MAP_METHOD));
        Structures.register_method(map_utilities.$map_object_size_method_table$.getGlobalValue(), file_vector_utilities.$dtp_backed_map$.getGlobalValue(), Symbols.symbol_function((SubLObject)file_vector_utilities.$sym120$MAP_OBJECT_SIZE_BACKED_MAP_METHOD));
        Structures.register_method(map_utilities.$map_object_test_method_table$.getGlobalValue(), file_vector_utilities.$dtp_backed_map$.getGlobalValue(), Symbols.symbol_function((SubLObject)file_vector_utilities.$sym121$MAP_OBJECT_TEST_BACKED_MAP_METHOD));
        Structures.register_method(map_utilities.$map_object_put_method_table$.getGlobalValue(), file_vector_utilities.$dtp_backed_map$.getGlobalValue(), Symbols.symbol_function((SubLObject)file_vector_utilities.$sym122$MAP_OBJECT_PUT_BACKED_MAP_METHOD));
        Structures.register_method(map_utilities.$map_object_get_method_table$.getGlobalValue(), file_vector_utilities.$dtp_backed_map$.getGlobalValue(), Symbols.symbol_function((SubLObject)file_vector_utilities.$sym123$MAP_OBJECT_GET_BACKED_MAP_METHOD));
        Structures.register_method(map_utilities.$map_object_get_without_values_method_table$.getGlobalValue(), file_vector_utilities.$dtp_backed_map$.getGlobalValue(), Symbols.symbol_function((SubLObject)file_vector_utilities.$sym125$MAP_OBJECT_GET_WITHOUT_VALUES_BACKED_MAP_METHOD));
        Structures.register_method(map_utilities.$map_object_remove_method_table$.getGlobalValue(), file_vector_utilities.$dtp_backed_map$.getGlobalValue(), Symbols.symbol_function((SubLObject)file_vector_utilities.$sym126$MAP_OBJECT_REMOVE_BACKED_MAP_METHOD));
        Structures.register_method(map_utilities.$map_object_remove_all_method_table$.getGlobalValue(), file_vector_utilities.$dtp_backed_map$.getGlobalValue(), Symbols.symbol_function((SubLObject)file_vector_utilities.$sym127$MAP_OBJECT_REMOVE_ALL_BACKED_MAP_METHOD));
        Structures.register_method(map_utilities.$map_object_touch_method_table$.getGlobalValue(), file_vector_utilities.$dtp_backed_map$.getGlobalValue(), Symbols.symbol_function((SubLObject)file_vector_utilities.$sym128$MAP_OBJECT_TOUCH_BACKED_MAP_METHOD));
        Structures.register_method(map_utilities.$map_object_change_set_method_table$.getGlobalValue(), file_vector_utilities.$dtp_backed_map$.getGlobalValue(), Symbols.symbol_function((SubLObject)file_vector_utilities.$sym129$MAP_OBJECT_CHANGE_SET_BACKED_MAP_METHOD));
        Structures.register_method(map_utilities.$new_map_object_with_same_properties_method_table$.getGlobalValue(), file_vector_utilities.$dtp_backed_map$.getGlobalValue(), Symbols.symbol_function((SubLObject)file_vector_utilities.$sym130$NEW_MAP_OBJECT_WITH_SAME_PROPERTIES_BACKED_MAP_METHOD));
        Structures.register_method(map_utilities.$new_map_object_iterator_method_table$.getGlobalValue(), file_vector_utilities.$dtp_backed_map$.getGlobalValue(), Symbols.symbol_function((SubLObject)file_vector_utilities.$sym133$NEW_MAP_OBJECT_ITERATOR_BACKED_MAP_METHOD));
        Structures.register_method(map_utilities.$map_object_arbitrary_key_method_table$.getGlobalValue(), file_vector_utilities.$dtp_backed_map$.getGlobalValue(), Symbols.symbol_function((SubLObject)file_vector_utilities.$sym137$MAP_OBJECT_ARBITRARY_KEY_BACKED_MAP_METHOD));
        generic_testing.define_test_case_table_int((SubLObject)file_vector_utilities.$sym140$TEST_FILE_VECTOR_BACKED_MAP_WITH_ALIST, (SubLObject)ConsesLow.list(new SubLObject[] { file_vector_utilities.$kw141$TEST, file_vector_utilities.EQUALP, file_vector_utilities.$kw142$OWNER, file_vector_utilities.NIL, file_vector_utilities.$kw143$CLASSES, file_vector_utilities.NIL, file_vector_utilities.$kw144$KB, file_vector_utilities.$kw145$TINY, file_vector_utilities.$kw146$WORKING_, file_vector_utilities.T }), file_vector_utilities.$list147);
        generic_testing.define_test_case_table_int((SubLObject)file_vector_utilities.$sym148$TEST_MAP_TO_FILE_VECTOR_BACKED_MAP_CONVERSION_WITH_ALIST, (SubLObject)ConsesLow.list(new SubLObject[] { file_vector_utilities.$kw141$TEST, file_vector_utilities.EQUAL, file_vector_utilities.$kw142$OWNER, file_vector_utilities.NIL, file_vector_utilities.$kw143$CLASSES, file_vector_utilities.NIL, file_vector_utilities.$kw144$KB, file_vector_utilities.$kw145$TINY, file_vector_utilities.$kw146$WORKING_, file_vector_utilities.T }), file_vector_utilities.$list147);
        return (SubLObject)file_vector_utilities.NIL;
    }
    
    private static SubLObject _constant_147_initializer() {
        return (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.cons((SubLObject)file_vector_utilities.ONE_INTEGER, (SubLObject)SubLObjectFactory.makeString("Eins")), (SubLObject)ConsesLow.cons((SubLObject)file_vector_utilities.TWO_INTEGER, (SubLObject)SubLObjectFactory.makeString("Zwei")), (SubLObject)ConsesLow.cons((SubLObject)file_vector_utilities.THREE_INTEGER, (SubLObject)SubLObjectFactory.makeString("Drei")), (SubLObject)ConsesLow.cons((SubLObject)file_vector_utilities.FOUR_INTEGER, (SubLObject)SubLObjectFactory.makeString("Vier"))), (SubLObject)file_vector_utilities.EQUAL), (SubLObject)SubLObjectFactory.makeKeyword("SUCCESS")), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(new SubLObject[] { ConsesLow.cons((SubLObject)file_vector_utilities.ONE_INTEGER, (SubLObject)SubLObjectFactory.makeString("Eins")), ConsesLow.cons((SubLObject)file_vector_utilities.TWO_INTEGER, (SubLObject)SubLObjectFactory.makeString("Zwei")), ConsesLow.cons((SubLObject)file_vector_utilities.THREE_INTEGER, (SubLObject)SubLObjectFactory.makeString("Drei")), ConsesLow.cons((SubLObject)file_vector_utilities.FOUR_INTEGER, (SubLObject)SubLObjectFactory.makeString("Vier")), ConsesLow.cons((SubLObject)file_vector_utilities.FIVE_INTEGER, (SubLObject)SubLObjectFactory.makeString("Fuenf")), ConsesLow.cons((SubLObject)file_vector_utilities.SIX_INTEGER, (SubLObject)SubLObjectFactory.makeString("Sechs")), ConsesLow.cons((SubLObject)file_vector_utilities.SEVEN_INTEGER, (SubLObject)SubLObjectFactory.makeString("Sieben")), ConsesLow.cons((SubLObject)file_vector_utilities.EIGHT_INTEGER, (SubLObject)SubLObjectFactory.makeString("Acht")), ConsesLow.cons((SubLObject)file_vector_utilities.NINE_INTEGER, (SubLObject)SubLObjectFactory.makeString("Neun")), ConsesLow.cons((SubLObject)file_vector_utilities.TEN_INTEGER, (SubLObject)SubLObjectFactory.makeString("Zehn")), ConsesLow.cons((SubLObject)file_vector_utilities.ELEVEN_INTEGER, (SubLObject)SubLObjectFactory.makeString("Elf")), ConsesLow.cons((SubLObject)file_vector_utilities.TWELVE_INTEGER, (SubLObject)SubLObjectFactory.makeString("Zwoelf")), ConsesLow.cons((SubLObject)file_vector_utilities.THIRTEEN_INTEGER, (SubLObject)SubLObjectFactory.makeString("Dreizehn")), ConsesLow.cons((SubLObject)file_vector_utilities.FOURTEEN_INTEGER, (SubLObject)SubLObjectFactory.makeString("Vierzehtn")), ConsesLow.cons((SubLObject)file_vector_utilities.FIFTEEN_INTEGER, (SubLObject)SubLObjectFactory.makeString("Fuenfzehn")), ConsesLow.cons((SubLObject)file_vector_utilities.SIXTEEN_INTEGER, (SubLObject)SubLObjectFactory.makeString("Sechszehn")), ConsesLow.cons((SubLObject)file_vector_utilities.SEVENTEEN_INTEGER, (SubLObject)SubLObjectFactory.makeString("Siebzehn")), ConsesLow.cons((SubLObject)file_vector_utilities.EIGHTEEN_INTEGER, (SubLObject)SubLObjectFactory.makeString("Achtzehn")), ConsesLow.cons((SubLObject)file_vector_utilities.NINETEEN_INTEGER, (SubLObject)SubLObjectFactory.makeString("Neunzehn")), ConsesLow.cons((SubLObject)file_vector_utilities.TWENTY_INTEGER, (SubLObject)SubLObjectFactory.makeString("Zwanzig")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeInteger(21), (SubLObject)SubLObjectFactory.makeString("Einundzwanzig")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeInteger(22), (SubLObject)SubLObjectFactory.makeString("Zweiundzwanzig")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeInteger(23), (SubLObject)SubLObjectFactory.makeString("Dreiundzwanzig")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeInteger(24), (SubLObject)SubLObjectFactory.makeString("Vierundzwanzig")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeInteger(25), (SubLObject)SubLObjectFactory.makeString("Fuenfundzwanzig")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeInteger(26), (SubLObject)SubLObjectFactory.makeString("Sechsundzwanzig")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeInteger(27), (SubLObject)SubLObjectFactory.makeString("Siebenundzwanzig")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeInteger(28), (SubLObject)SubLObjectFactory.makeString("Achtundzwanzig")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeInteger(29), (SubLObject)SubLObjectFactory.makeString("Neunundzwanzig")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeInteger(30), (SubLObject)SubLObjectFactory.makeString("Dreissig")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeInteger(31), (SubLObject)SubLObjectFactory.makeString("Einunddreissig")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeInteger(32), (SubLObject)SubLObjectFactory.makeString("Zweiunddreissig")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeInteger(33), (SubLObject)SubLObjectFactory.makeString("Dreiunddreissig")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeInteger(34), (SubLObject)SubLObjectFactory.makeString("Vierunddreissig")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeInteger(35), (SubLObject)SubLObjectFactory.makeString("Fuenfunddreissig")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeInteger(36), (SubLObject)SubLObjectFactory.makeString("Sechsunddreissig")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeInteger(37), (SubLObject)SubLObjectFactory.makeString("Siebenunddreissig")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeInteger(38), (SubLObject)SubLObjectFactory.makeString("Achtunddreissig")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeInteger(39), (SubLObject)SubLObjectFactory.makeString("Neununddreissig")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeInteger(40), (SubLObject)SubLObjectFactory.makeString("Vierzig")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeInteger(41), (SubLObject)SubLObjectFactory.makeString("Einundvierzig")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeInteger(42), (SubLObject)SubLObjectFactory.makeString("Zweiundvierzig")) }), (SubLObject)file_vector_utilities.EQUAL), (SubLObject)SubLObjectFactory.makeKeyword("SUCCESS")), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(new SubLObject[] { ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("C"), (SubLObject)SubLObjectFactory.makeInteger(100)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("LXXXXVIIII"), (SubLObject)SubLObjectFactory.makeInteger(99)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("LXXXXVIII"), (SubLObject)SubLObjectFactory.makeInteger(98)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("LXXXXVII"), (SubLObject)SubLObjectFactory.makeInteger(97)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("LXXXXVI"), (SubLObject)SubLObjectFactory.makeInteger(96)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("LXXXXV"), (SubLObject)SubLObjectFactory.makeInteger(95)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("LXXXXIIII"), (SubLObject)SubLObjectFactory.makeInteger(94)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("LXXXXIII"), (SubLObject)SubLObjectFactory.makeInteger(93)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("LXXXXII"), (SubLObject)SubLObjectFactory.makeInteger(92)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("LXXXXI"), (SubLObject)SubLObjectFactory.makeInteger(91)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("LXXXX"), (SubLObject)SubLObjectFactory.makeInteger(90)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("LXXXVIIII"), (SubLObject)SubLObjectFactory.makeInteger(89)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("LXXXVIII"), (SubLObject)SubLObjectFactory.makeInteger(88)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("LXXXVII"), (SubLObject)SubLObjectFactory.makeInteger(87)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("LXXXVI"), (SubLObject)SubLObjectFactory.makeInteger(86)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("LXXXV"), (SubLObject)SubLObjectFactory.makeInteger(85)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("LXXXIIII"), (SubLObject)SubLObjectFactory.makeInteger(84)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("LXXXIII"), (SubLObject)SubLObjectFactory.makeInteger(83)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("LXXXII"), (SubLObject)SubLObjectFactory.makeInteger(82)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("LXXXI"), (SubLObject)SubLObjectFactory.makeInteger(81)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("LXXX"), (SubLObject)SubLObjectFactory.makeInteger(80)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("LXXVIIII"), (SubLObject)SubLObjectFactory.makeInteger(79)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("LXXVIII"), (SubLObject)SubLObjectFactory.makeInteger(78)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("LXXVII"), (SubLObject)SubLObjectFactory.makeInteger(77)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("LXXVI"), (SubLObject)SubLObjectFactory.makeInteger(76)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("LXXV"), (SubLObject)SubLObjectFactory.makeInteger(75)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("LXXIIII"), (SubLObject)SubLObjectFactory.makeInteger(74)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("LXXIII"), (SubLObject)SubLObjectFactory.makeInteger(73)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("LXXII"), (SubLObject)SubLObjectFactory.makeInteger(72)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("LXXI"), (SubLObject)SubLObjectFactory.makeInteger(71)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("LXX"), (SubLObject)SubLObjectFactory.makeInteger(70)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("LXVIIII"), (SubLObject)SubLObjectFactory.makeInteger(69)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("LXVIII"), (SubLObject)SubLObjectFactory.makeInteger(68)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("LXVII"), (SubLObject)SubLObjectFactory.makeInteger(67)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("LXVI"), (SubLObject)SubLObjectFactory.makeInteger(66)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("LXV"), (SubLObject)SubLObjectFactory.makeInteger(65)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("LXIIII"), (SubLObject)SubLObjectFactory.makeInteger(64)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("LXIII"), (SubLObject)SubLObjectFactory.makeInteger(63)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("LXII"), (SubLObject)SubLObjectFactory.makeInteger(62)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("LXI"), (SubLObject)SubLObjectFactory.makeInteger(61)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("LX"), (SubLObject)SubLObjectFactory.makeInteger(60)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("LVIIII"), (SubLObject)SubLObjectFactory.makeInteger(59)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("LVIII"), (SubLObject)SubLObjectFactory.makeInteger(58)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("LVII"), (SubLObject)SubLObjectFactory.makeInteger(57)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("LVI"), (SubLObject)SubLObjectFactory.makeInteger(56)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("LV"), (SubLObject)SubLObjectFactory.makeInteger(55)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("LIIII"), (SubLObject)SubLObjectFactory.makeInteger(54)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("LIII"), (SubLObject)SubLObjectFactory.makeInteger(53)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("LII"), (SubLObject)SubLObjectFactory.makeInteger(52)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("LI"), (SubLObject)SubLObjectFactory.makeInteger(51)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("L"), (SubLObject)SubLObjectFactory.makeInteger(50)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("XXXXVIIII"), (SubLObject)SubLObjectFactory.makeInteger(49)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("XXXXVIII"), (SubLObject)SubLObjectFactory.makeInteger(48)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("XXXXVII"), (SubLObject)SubLObjectFactory.makeInteger(47)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("XXXXVI"), (SubLObject)SubLObjectFactory.makeInteger(46)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("XXXXV"), (SubLObject)SubLObjectFactory.makeInteger(45)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("XXXXIIII"), (SubLObject)SubLObjectFactory.makeInteger(44)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("XXXXIII"), (SubLObject)SubLObjectFactory.makeInteger(43)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("XXXXII"), (SubLObject)SubLObjectFactory.makeInteger(42)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("XXXXI"), (SubLObject)SubLObjectFactory.makeInteger(41)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("XXXX"), (SubLObject)SubLObjectFactory.makeInteger(40)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("XXXVIIII"), (SubLObject)SubLObjectFactory.makeInteger(39)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("XXXVIII"), (SubLObject)SubLObjectFactory.makeInteger(38)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("XXXVII"), (SubLObject)SubLObjectFactory.makeInteger(37)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("XXXVI"), (SubLObject)SubLObjectFactory.makeInteger(36)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("XXXV"), (SubLObject)SubLObjectFactory.makeInteger(35)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("XXXIIII"), (SubLObject)SubLObjectFactory.makeInteger(34)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("XXXIII"), (SubLObject)SubLObjectFactory.makeInteger(33)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("XXXII"), (SubLObject)SubLObjectFactory.makeInteger(32)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("XXXI"), (SubLObject)SubLObjectFactory.makeInteger(31)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("XXX"), (SubLObject)SubLObjectFactory.makeInteger(30)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("XXVIIII"), (SubLObject)SubLObjectFactory.makeInteger(29)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("XXVIII"), (SubLObject)SubLObjectFactory.makeInteger(28)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("XXVII"), (SubLObject)SubLObjectFactory.makeInteger(27)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("XXVI"), (SubLObject)SubLObjectFactory.makeInteger(26)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("XXV"), (SubLObject)SubLObjectFactory.makeInteger(25)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("XXIIII"), (SubLObject)SubLObjectFactory.makeInteger(24)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("XXIII"), (SubLObject)SubLObjectFactory.makeInteger(23)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("XXII"), (SubLObject)SubLObjectFactory.makeInteger(22)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("XXI"), (SubLObject)SubLObjectFactory.makeInteger(21)), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("XX"), (SubLObject)file_vector_utilities.TWENTY_INTEGER), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("XVIIII"), (SubLObject)file_vector_utilities.NINETEEN_INTEGER), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("XVIII"), (SubLObject)file_vector_utilities.EIGHTEEN_INTEGER), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("XVII"), (SubLObject)file_vector_utilities.SEVENTEEN_INTEGER), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("XVI"), (SubLObject)file_vector_utilities.SIXTEEN_INTEGER), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("XV"), (SubLObject)file_vector_utilities.FIFTEEN_INTEGER), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("XIIII"), (SubLObject)file_vector_utilities.FOURTEEN_INTEGER), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("XIII"), (SubLObject)file_vector_utilities.THIRTEEN_INTEGER), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("XII"), (SubLObject)file_vector_utilities.TWELVE_INTEGER), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("XI"), (SubLObject)file_vector_utilities.ELEVEN_INTEGER), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("X"), (SubLObject)file_vector_utilities.TEN_INTEGER), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("VIIII"), (SubLObject)file_vector_utilities.NINE_INTEGER), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("VIII"), (SubLObject)file_vector_utilities.EIGHT_INTEGER), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("VII"), (SubLObject)file_vector_utilities.SEVEN_INTEGER), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("VI"), (SubLObject)file_vector_utilities.SIX_INTEGER), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("V"), (SubLObject)file_vector_utilities.FIVE_INTEGER), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("IIII"), (SubLObject)file_vector_utilities.FOUR_INTEGER), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("III"), (SubLObject)file_vector_utilities.THREE_INTEGER), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("II"), (SubLObject)file_vector_utilities.TWO_INTEGER), ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("I"), (SubLObject)file_vector_utilities.ONE_INTEGER) }), (SubLObject)file_vector_utilities.EQUALP), (SubLObject)SubLObjectFactory.makeKeyword("SUCCESS")));
    }
    
    @Override
	public void declareFunctions() {
        declare_file_vector_utilities_file();
    }
    
    @Override
	public void initializeVariables() {
        init_file_vector_utilities_file();
    }
    
    @Override
	public void runTopLevelForms() {
        setup_file_vector_utilities_file();
    }
    
    static {
        me = (SubLFile)new file_vector_utilities();
        file_vector_utilities.$show_file_vector_reference_payload_in_print$ = null;
        file_vector_utilities.$dtp_file_vector_reference$ = null;
        file_vector_utilities.$cfasl_opcode_fvector_reference$ = null;
        file_vector_utilities.$file_vector_backed_map_read_lock$ = null;
        file_vector_utilities.$file_vector_get_recursion_guard$ = null;
        file_vector_utilities.$file_vector_indexical_registry$ = null;
        file_vector_utilities.$file_vector_indexical_lock_registry$ = null;
        file_vector_utilities.$dtp_backed_map$ = null;
        file_vector_utilities.$cfasl_opcode_backed_map$ = null;
        file_vector_utilities.$cfasl_outer_fvector_for_backed_maps$ = null;
        file_vector_utilities.$current_backed_map_cache_strategy$ = null;
        $kw0$OUTPUT = SubLObjectFactory.makeKeyword("OUTPUT");
        $str1$Unable_to_open__S = SubLObjectFactory.makeString("Unable to open ~S");
        $list2 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("KEY"), (SubLObject)SubLObjectFactory.makeSymbol("VALUE"));
        $str3$Error__writing_file_vector_backin = SubLObjectFactory.makeString("Error, writing file vector backing for map is not contiguous: expected ~A, got ~A~%");
        $sym4$FILE_VECTOR_REFERENCE = SubLObjectFactory.makeSymbol("FILE-VECTOR-REFERENCE");
        $sym5$FILE_VECTOR_REFERENCE_P = SubLObjectFactory.makeSymbol("FILE-VECTOR-REFERENCE-P");
        $list6 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INDEX"), (SubLObject)SubLObjectFactory.makeSymbol("PAYLOAD"));
        $list7 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("INDEX"), (SubLObject)SubLObjectFactory.makeKeyword("PAYLOAD"));
        $list8 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FVECTOR-REF-INDEX"), (SubLObject)SubLObjectFactory.makeSymbol("FVECTOR-REF-PAYLOAD"));
        $list9 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("_CSETF-FVECTOR-REF-INDEX"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-FVECTOR-REF-PAYLOAD"));
        $sym10$PRINT_FVECTOR_REF = SubLObjectFactory.makeSymbol("PRINT-FVECTOR-REF");
        $sym11$FILE_VECTOR_REFERENCE_PRINT_FUNCTION_TRAMPOLINE = SubLObjectFactory.makeSymbol("FILE-VECTOR-REFERENCE-PRINT-FUNCTION-TRAMPOLINE");
        $list12 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("FILE-VECTOR-REFERENCE-P"));
        $sym13$FVECTOR_REF_INDEX = SubLObjectFactory.makeSymbol("FVECTOR-REF-INDEX");
        $sym14$_CSETF_FVECTOR_REF_INDEX = SubLObjectFactory.makeSymbol("_CSETF-FVECTOR-REF-INDEX");
        $sym15$FVECTOR_REF_PAYLOAD = SubLObjectFactory.makeSymbol("FVECTOR-REF-PAYLOAD");
        $sym16$_CSETF_FVECTOR_REF_PAYLOAD = SubLObjectFactory.makeSymbol("_CSETF-FVECTOR-REF-PAYLOAD");
        $kw17$INDEX = SubLObjectFactory.makeKeyword("INDEX");
        $kw18$PAYLOAD = SubLObjectFactory.makeKeyword("PAYLOAD");
        $str19$Invalid_slot__S_for_construction_ = SubLObjectFactory.makeString("Invalid slot ~S for construction function");
        $kw20$BEGIN = SubLObjectFactory.makeKeyword("BEGIN");
        $sym21$MAKE_FILE_VECTOR_REFERENCE = SubLObjectFactory.makeSymbol("MAKE-FILE-VECTOR-REFERENCE");
        $kw22$SLOT = SubLObjectFactory.makeKeyword("SLOT");
        $kw23$END = SubLObjectFactory.makeKeyword("END");
        $sym24$VISIT_DEFSTRUCT_OBJECT_FILE_VECTOR_REFERENCE_METHOD = SubLObjectFactory.makeSymbol("VISIT-DEFSTRUCT-OBJECT-FILE-VECTOR-REFERENCE-METHOD");
        $str25$__FILE_VECTOR_REF__ = SubLObjectFactory.makeString("#<FILE-VECTOR-REF #");
        $str26$__ = SubLObjectFactory.makeString(" (");
        $str27$__ = SubLObjectFactory.makeString(") ");
        $str28$_ = SubLObjectFactory.makeString(">");
        $str29$File_Vector_references_cannot_be_ = SubLObjectFactory.makeString("File Vector references cannot be zero.");
        $str30$swapped_out = SubLObjectFactory.makeString("swapped out");
        $str31$present___pristine = SubLObjectFactory.makeString("present & pristine");
        $str32$present_but_mutated = SubLObjectFactory.makeString("present but mutated");
        $str33$present_but_deleted = SubLObjectFactory.makeString("present but deleted");
        $str34$invalid_state = SubLObjectFactory.makeString("invalid state");
        $int35$69 = SubLObjectFactory.makeInteger(69);
        $sym36$CFASL_INPUT_FILE_VECTOR_REFERENCE = SubLObjectFactory.makeSymbol("CFASL-INPUT-FILE-VECTOR-REFERENCE");
        $sym37$CFASL_OUTPUT_OBJECT_FILE_VECTOR_REFERENCE_METHOD = SubLObjectFactory.makeSymbol("CFASL-OUTPUT-OBJECT-FILE-VECTOR-REFERENCE-METHOD");
        $sym38$DATA_STREAM_LOCK = SubLObjectFactory.makeUninternedSymbol("DATA-STREAM-LOCK");
        $sym39$CLET = SubLObjectFactory.makeSymbol("CLET");
        $list40 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*FILE-VECTOR-BACKED-MAP-READ-LOCK*"));
        $sym41$PIF = SubLObjectFactory.makeSymbol("PIF");
        $sym42$LOCK_P = SubLObjectFactory.makeSymbol("LOCK-P");
        $sym43$WITH_LOCK_HELD = SubLObjectFactory.makeSymbol("WITH-LOCK-HELD");
        $sym44$PROGN = SubLObjectFactory.makeSymbol("PROGN");
        $list45 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LOCK")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym46$_FILE_VECTOR_BACKED_MAP_READ_LOCK_ = SubLObjectFactory.makeSymbol("*FILE-VECTOR-BACKED-MAP-READ-LOCK*");
        $kw47$UNPROVIDED = SubLObjectFactory.makeKeyword("UNPROVIDED");
        $kw48$INPUT = SubLObjectFactory.makeKeyword("INPUT");
        $sym49$CACHE_STRATEGY_OR_SYMBOL_P = SubLObjectFactory.makeSymbol("CACHE-STRATEGY-OR-SYMBOL-P");
        $sym50$_EXIT = SubLObjectFactory.makeSymbol("%EXIT");
        $str51$We_are_already_using_that_file_ve = SubLObjectFactory.makeString("We are already using that file vector ~A ... cannot reuse!~%");
        $str52$Invalid_state_transition___A_is_n = SubLObjectFactory.makeString("Invalid state transition: ~A is neither present, nor deleted nor swapped out.");
        $kw53$NOT_FOUND = SubLObjectFactory.makeKeyword("NOT-FOUND");
        $kw54$MUTATED = SubLObjectFactory.makeKeyword("MUTATED");
        $kw55$DELETED = SubLObjectFactory.makeKeyword("DELETED");
        $sym56$FILE_VECTOR_P = SubLObjectFactory.makeSymbol("FILE-VECTOR-P");
        $kw57$RECOVERED = SubLObjectFactory.makeKeyword("RECOVERED");
        $list58 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("KEY"), (SubLObject)SubLObjectFactory.makeSymbol("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("MAP"), (SubLObject)SubLObjectFactory.makeSymbol("FILE-VECTOR"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("DONE"), (SubLObject)SubLObjectFactory.makeSymbol("CACHE-STRATEGY")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $list59 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("DONE"), (SubLObject)SubLObjectFactory.makeKeyword("CACHE-STRATEGY"));
        $kw60$ALLOW_OTHER_KEYS = SubLObjectFactory.makeKeyword("ALLOW-OTHER-KEYS");
        $kw61$DONE = SubLObjectFactory.makeKeyword("DONE");
        $kw62$CACHE_STRATEGY = SubLObjectFactory.makeKeyword("CACHE-STRATEGY");
        $sym63$IMPL_VALUE = SubLObjectFactory.makeUninternedSymbol("IMPL-VALUE");
        $sym64$DO_MAP = SubLObjectFactory.makeSymbol("DO-MAP");
        $sym65$PUNLESS = SubLObjectFactory.makeSymbol("PUNLESS");
        $sym66$CAND = SubLObjectFactory.makeSymbol("CAND");
        $sym67$FILE_VECTOR_REFERENCE_DELETED_ = SubLObjectFactory.makeSymbol("FILE-VECTOR-REFERENCE-DELETED?");
        $sym68$CSETQ = SubLObjectFactory.makeSymbol("CSETQ");
        $sym69$FILE_VECTOR_BACKED_MAP_W__CACHE_GET = SubLObjectFactory.makeSymbol("FILE-VECTOR-BACKED-MAP-W/-CACHE-GET");
        $sym70$FILE_VECTOR_BACKED_MAP_ITERATOR_DONE = SubLObjectFactory.makeSymbol("FILE-VECTOR-BACKED-MAP-ITERATOR-DONE");
        $sym71$FILE_VECTOR_BACKED_MAP_ITERATOR_NEXT = SubLObjectFactory.makeSymbol("FILE-VECTOR-BACKED-MAP-ITERATOR-NEXT");
        $list72 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CURR-ITEM"), (SubLObject)SubLObjectFactory.makeSymbol("ITERATOR"), (SubLObject)SubLObjectFactory.makeSymbol("MAP"), (SubLObject)SubLObjectFactory.makeSymbol("FILE-VECTOR"), (SubLObject)SubLObjectFactory.makeSymbol("COMMON-SYMBOLS"), (SubLObject)SubLObjectFactory.makeSymbol("CACHE-STRATEGY"));
        $kw73$ITERATION_HALTED_PREMATURELY = SubLObjectFactory.makeKeyword("ITERATION-HALTED-PREMATURELY");
        $str74$Cannot_convert_a_file_backed_map_ = SubLObjectFactory.makeString("Cannot convert a file-backed map entry that is not all swapped in. Skipping. (map=~S value=~S)");
        $str75$Cannot_upgrade_a_map_with_a_delet = SubLObjectFactory.makeString("Cannot upgrade a map with a deleted file vector reference, but entry ~A:~A is precisely that.~%");
        $str76$Cannot_upgrade_a_map_with_muted_f = SubLObjectFactory.makeString("Cannot upgrade a map with muted file vector references, but entry ~A:~A is precisely that.~%");
        $sym77$_FILE_VECTOR_INDEXICAL_REGISTRY_ = SubLObjectFactory.makeSymbol("*FILE-VECTOR-INDEXICAL-REGISTRY*");
        $sym78$_FILE_VECTOR_INDEXICAL_LOCK_REGISTRY_ = SubLObjectFactory.makeSymbol("*FILE-VECTOR-INDEXICAL-LOCK-REGISTRY*");
        $sym79$FILE_VECTOR_INDEXICAL_P = SubLObjectFactory.makeSymbol("FILE-VECTOR-INDEXICAL-P");
        $str80$File_Vector_indexical__S_is_not_a = SubLObjectFactory.makeString("File Vector indexical ~S is not a KB dump default common symbol ... this will lead to file bloat.~%");
        $kw81$IGNORE_ERRORS_TARGET = SubLObjectFactory.makeKeyword("IGNORE-ERRORS-TARGET");
        $sym82$IGNORE_ERRORS_HANDLER = SubLObjectFactory.makeSymbol("IGNORE-ERRORS-HANDLER", "SUBLISP");
        $str83$Lock_for_File_Vector_ = SubLObjectFactory.makeString("Lock for File Vector ");
        $sym84$BACKED_MAP = SubLObjectFactory.makeSymbol("BACKED-MAP");
        $sym85$BACKED_MAP_P = SubLObjectFactory.makeSymbol("BACKED-MAP-P");
        $list86 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MAP"), (SubLObject)SubLObjectFactory.makeSymbol("FVECTOR"), (SubLObject)SubLObjectFactory.makeSymbol("COMMON-SYMBOLS"));
        $list87 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("MAP"), (SubLObject)SubLObjectFactory.makeKeyword("FVECTOR"), (SubLObject)SubLObjectFactory.makeKeyword("COMMON-SYMBOLS"));
        $list88 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("BACKED-MAP-MAP"), (SubLObject)SubLObjectFactory.makeSymbol("BACKED-MAP-FVECTOR"), (SubLObject)SubLObjectFactory.makeSymbol("BACKED-MAP-COMMON-SYMBOLS"));
        $list89 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("_CSETF-BACKED-MAP-MAP"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-BACKED-MAP-FVECTOR"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-BACKED-MAP-COMMON-SYMBOLS"));
        $sym90$PRINT_BACKED_MAP = SubLObjectFactory.makeSymbol("PRINT-BACKED-MAP");
        $sym91$BACKED_MAP_PRINT_FUNCTION_TRAMPOLINE = SubLObjectFactory.makeSymbol("BACKED-MAP-PRINT-FUNCTION-TRAMPOLINE");
        $list92 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("BACKED-MAP-P"));
        $sym93$BACKED_MAP_MAP = SubLObjectFactory.makeSymbol("BACKED-MAP-MAP");
        $sym94$_CSETF_BACKED_MAP_MAP = SubLObjectFactory.makeSymbol("_CSETF-BACKED-MAP-MAP");
        $sym95$BACKED_MAP_FVECTOR = SubLObjectFactory.makeSymbol("BACKED-MAP-FVECTOR");
        $sym96$_CSETF_BACKED_MAP_FVECTOR = SubLObjectFactory.makeSymbol("_CSETF-BACKED-MAP-FVECTOR");
        $sym97$BACKED_MAP_COMMON_SYMBOLS = SubLObjectFactory.makeSymbol("BACKED-MAP-COMMON-SYMBOLS");
        $sym98$_CSETF_BACKED_MAP_COMMON_SYMBOLS = SubLObjectFactory.makeSymbol("_CSETF-BACKED-MAP-COMMON-SYMBOLS");
        $kw99$MAP = SubLObjectFactory.makeKeyword("MAP");
        $kw100$FVECTOR = SubLObjectFactory.makeKeyword("FVECTOR");
        $kw101$COMMON_SYMBOLS = SubLObjectFactory.makeKeyword("COMMON-SYMBOLS");
        $sym102$MAKE_BACKED_MAP = SubLObjectFactory.makeSymbol("MAKE-BACKED-MAP");
        $sym103$VISIT_DEFSTRUCT_OBJECT_BACKED_MAP_METHOD = SubLObjectFactory.makeSymbol("VISIT-DEFSTRUCT-OBJECT-BACKED-MAP-METHOD");
        $sym104$MAP_P = SubLObjectFactory.makeSymbol("MAP-P");
        $list105 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("BACKED-MAP")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym106$COMMON_SYMBOLS = SubLObjectFactory.makeUninternedSymbol("COMMON-SYMBOLS");
        $sym107$WITH_CFASL_COMMON_SYMBOLS_SIMPLE = SubLObjectFactory.makeSymbol("WITH-CFASL-COMMON-SYMBOLS-SIMPLE");
        $str108$_Map_ = SubLObjectFactory.makeString(" Map ");
        $str109$_FVector_ = SubLObjectFactory.makeString(" FVector ");
        $str110$_CFASL_ComSym_ = SubLObjectFactory.makeString(" CFASL ComSym ");
        $str111$_ = SubLObjectFactory.makeString(" ");
        $str112$Unexpected_file_vector_reference_ = SubLObjectFactory.makeString("Unexpected file vector reference ~A in backed map ~A.");
        $int113$76 = SubLObjectFactory.makeInteger(76);
        $sym114$CFASL_INPUT_BACKED_MAP = SubLObjectFactory.makeSymbol("CFASL-INPUT-BACKED-MAP");
        $str115$Unexpected_value__A_in_BACKED_MAP = SubLObjectFactory.makeString("Unexpected value ~A in BACKED-MAP-P read.");
        $sym116$CFASL_OUTPUT_OBJECT_BACKED_MAP_METHOD = SubLObjectFactory.makeSymbol("CFASL-OUTPUT-OBJECT-BACKED-MAP-METHOD");
        $list117 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("STRATEGY")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym118$_CURRENT_BACKED_MAP_CACHE_STRATEGY_ = SubLObjectFactory.makeSymbol("*CURRENT-BACKED-MAP-CACHE-STRATEGY*");
        $sym119$IS_MAP_OBJECT_P_BACKED_MAP_METHOD = SubLObjectFactory.makeSymbol("IS-MAP-OBJECT-P-BACKED-MAP-METHOD");
        $sym120$MAP_OBJECT_SIZE_BACKED_MAP_METHOD = SubLObjectFactory.makeSymbol("MAP-OBJECT-SIZE-BACKED-MAP-METHOD");
        $sym121$MAP_OBJECT_TEST_BACKED_MAP_METHOD = SubLObjectFactory.makeSymbol("MAP-OBJECT-TEST-BACKED-MAP-METHOD");
        $sym122$MAP_OBJECT_PUT_BACKED_MAP_METHOD = SubLObjectFactory.makeSymbol("MAP-OBJECT-PUT-BACKED-MAP-METHOD");
        $sym123$MAP_OBJECT_GET_BACKED_MAP_METHOD = SubLObjectFactory.makeSymbol("MAP-OBJECT-GET-BACKED-MAP-METHOD");
        $str124$Cannot_access_backed_map__A_witho = SubLObjectFactory.makeString("Cannot access backed map ~A without stream level locking ....~%");
        $sym125$MAP_OBJECT_GET_WITHOUT_VALUES_BACKED_MAP_METHOD = SubLObjectFactory.makeSymbol("MAP-OBJECT-GET-WITHOUT-VALUES-BACKED-MAP-METHOD");
        $sym126$MAP_OBJECT_REMOVE_BACKED_MAP_METHOD = SubLObjectFactory.makeSymbol("MAP-OBJECT-REMOVE-BACKED-MAP-METHOD");
        $sym127$MAP_OBJECT_REMOVE_ALL_BACKED_MAP_METHOD = SubLObjectFactory.makeSymbol("MAP-OBJECT-REMOVE-ALL-BACKED-MAP-METHOD");
        $sym128$MAP_OBJECT_TOUCH_BACKED_MAP_METHOD = SubLObjectFactory.makeSymbol("MAP-OBJECT-TOUCH-BACKED-MAP-METHOD");
        $sym129$MAP_OBJECT_CHANGE_SET_BACKED_MAP_METHOD = SubLObjectFactory.makeSymbol("MAP-OBJECT-CHANGE-SET-BACKED-MAP-METHOD");
        $sym130$NEW_MAP_OBJECT_WITH_SAME_PROPERTIES_BACKED_MAP_METHOD = SubLObjectFactory.makeSymbol("NEW-MAP-OBJECT-WITH-SAME-PROPERTIES-BACKED-MAP-METHOD");
        $str131$The_test_of_the_interior_map__A_d = SubLObjectFactory.makeString("The test of the interior map ~A does not correspond to the provided test ~A.");
        $str132$The_size_of_the_interior_map__A_d = SubLObjectFactory.makeString("The size of the interior map ~A does not correspond to the provided size ~A.");
        $sym133$NEW_MAP_OBJECT_ITERATOR_BACKED_MAP_METHOD = SubLObjectFactory.makeSymbol("NEW-MAP-OBJECT-ITERATOR-BACKED-MAP-METHOD");
        $sym134$MAP_BACKED_MAP_ITERATOR_DONE = SubLObjectFactory.makeSymbol("MAP-BACKED-MAP-ITERATOR-DONE");
        $sym135$MAP_BACKED_MAP_ITERATOR_NEXT = SubLObjectFactory.makeSymbol("MAP-BACKED-MAP-ITERATOR-NEXT");
        $list136 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("BACKED-MAP"), (SubLObject)SubLObjectFactory.makeSymbol("ITERATOR"), (SubLObject)SubLObjectFactory.makeSymbol("CACHE-STRATEGY"));
        $sym137$MAP_OBJECT_ARBITRARY_KEY_BACKED_MAP_METHOD = SubLObjectFactory.makeSymbol("MAP-OBJECT-ARBITRARY-KEY-BACKED-MAP-METHOD");
        $str138$Error_in_swap_out_algorithm___A_i = SubLObjectFactory.makeString("Error in swap-out algorithm: ~A is NOT a backed map.");
        $str139$Error_in_non_pristine_object_coun = SubLObjectFactory.makeString("Error in non-pristine object count algorithm: ~A is NOT a backed map.");
        $sym140$TEST_FILE_VECTOR_BACKED_MAP_WITH_ALIST = SubLObjectFactory.makeSymbol("TEST-FILE-VECTOR-BACKED-MAP-WITH-ALIST");
        $kw141$TEST = SubLObjectFactory.makeKeyword("TEST");
        $kw142$OWNER = SubLObjectFactory.makeKeyword("OWNER");
        $kw143$CLASSES = SubLObjectFactory.makeKeyword("CLASSES");
        $kw144$KB = SubLObjectFactory.makeKeyword("KB");
        $kw145$TINY = SubLObjectFactory.makeKeyword("TINY");
        $kw146$WORKING_ = SubLObjectFactory.makeKeyword("WORKING?");
        $list147 = _constant_147_initializer();
        $sym148$TEST_MAP_TO_FILE_VECTOR_BACKED_MAP_CONVERSION_WITH_ALIST = SubLObjectFactory.makeSymbol("TEST-MAP-TO-FILE-VECTOR-BACKED-MAP-CONVERSION-WITH-ALIST");
        $str149$_tmp_ = SubLObjectFactory.makeString("/tmp/");
        $str150$Key__A_should_be_in_the_map_but_i = SubLObjectFactory.makeString("Key ~A should be in the map but is not.");
        $str151$The_value_for_the_key__A_is_missi = SubLObjectFactory.makeString("The value for the key ~A is missing altogether from the new map.");
        $str152$The_old_value__A_does_not_match_t = SubLObjectFactory.makeString("The old value ~A does not match the new value ~A according to ~A.");
        $str153$There_are_supposed_to_be__A_keys_ = SubLObjectFactory.makeString("There are supposed to be ~A keys, but there are ~A.");
        $str154$There_are_supposed_to_be__A_value = SubLObjectFactory.makeString("There are supposed to be ~A values, but there are ~A.");
        $str155$The_value_for_the_key__A_can_all_ = SubLObjectFactory.makeString("The value for the key ~A can all of a sudden no longer be found.");
        $str156$The_accessing_of_the_value_for__A = SubLObjectFactory.makeString("The accessing of the value for ~A did not swap in the value.");
        $str157$The_touching_of_the_object_did_no = SubLObjectFactory.makeString("The touching of the object did not mutate the object.");
        $str158$Undoing_the_change_for_key__A_did = SubLObjectFactory.makeString("Undoing the change for key ~A did actually not succeed.");
        $str159$The_modification_of_the_entry_for = SubLObjectFactory.makeString("The modification of the entry for ~A did not mutate anything.");
        $str160$The_modified_entry_for__A_no_long = SubLObjectFactory.makeString("The modified entry for ~A no longer contains the new value ~A but rather ~A.");
        $str161$The_stored_entry_for__A_is_not_a_ = SubLObjectFactory.makeString("The stored entry for ~A is not a present and mutated file vector reference.");
        $kw162$SUCCESS = SubLObjectFactory.makeKeyword("SUCCESS");
        $str163$_A_should_be_paged_in__but__A_are = SubLObjectFactory.makeString("~A should be paged in, but ~A are actually paged in.");
        $str164$_A_should_be_paged_out__but__A_ar = SubLObjectFactory.makeString("~A should be paged out, but ~A are actually paged out.");
        $kw165$COPY_CONTENTS = SubLObjectFactory.makeKeyword("COPY-CONTENTS");
        $list166 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("KEY"), (SubLObject)SubLObjectFactory.makeSymbol("REFERENCE"));
        $str167$The_entry_for__A_in_the_original_ = SubLObjectFactory.makeString("The entry for ~A in the original map is not a file vector reference.~%");
        $str168$The_loaded_map_does_not_have_the_ = SubLObjectFactory.makeString("The loaded map does not have the same size as the original map: ~A =/= ~A~%");
        $str169$The_entry_for__A_in_the_new_map_i = SubLObjectFactory.makeString("The entry for ~A in the new map is not a file vector reference.");
        $list170 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-KEY"), (SubLObject)SubLObjectFactory.makeUninternedSymbol("IMPL-VALUE"));
        $str171$The_new_map_has_an_entry_for_key_ = SubLObjectFactory.makeString("The new map has an entry for key ~A while the old one has none.");
        $str172$The_values_for_key__A_are_not_equ = SubLObjectFactory.makeString("The values for key ~A are not equal according to ~A: ~A =/= ~A (new =/= old).~%");
        $str173$New_map__A_and_backup_key_set__A_ = SubLObjectFactory.makeString("New map ~A and backup key set ~A have diverged; ~A not present.");
        $kw174$SUPPORT_UNDO = SubLObjectFactory.makeKeyword("SUPPORT-UNDO");
        $str175$We_are_getting__A_back__but_that_ = SubLObjectFactory.makeString("We are getting ~A back, but that's not one of the missing keys ~A.");
        $str176$We_are_getting_the_removed_key__A = SubLObjectFactory.makeString("We are getting the removed key ~A returned to us with value ~A~%!");
        $str177$We_are_not_getting_back_the_same_ = SubLObjectFactory.makeString("We are not getting back the same reference for ~A: we expected ~A and got ~A.");
        $str178$We_no_longer_visited__A_____inves = SubLObjectFactory.makeString("We no longer visited ~A ... investigating.");
        $str179$_____A_is_still_present_in_map___ = SubLObjectFactory.makeString("... ~A is still present in map.~%");
        $str180$_____A_is_not_even_findable_in_th = SubLObjectFactory.makeString("... ~A is not even findable in the map anymore.~%");
        $str181$Deleting__A_to_produce__A_did_not = SubLObjectFactory.makeString("Deleting ~A to produce ~A did not work right.");
        $str182$We_visited__A_entries_but_we_shou = SubLObjectFactory.makeString("We visited ~A entries but we should have visited ~A entries.");
        $list183 = (SubLList)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("INDEX"), (SubLObject)SubLObjectFactory.makeSymbol("ADDRESS"));
        $str184$The_index__A_is_outside_of_the_ra = SubLObjectFactory.makeString("The index ~A is outside of the range [0,~A).");
    }
    
    public static final class $file_vector_reference_native extends SubLStructNative
    {
        public SubLObject $index;
        public SubLObject $payload;
        private static final SubLStructDeclNative structDecl;
        
        public $file_vector_reference_native() {
            this.$index = (SubLObject)CommonSymbols.NIL;
            this.$payload = (SubLObject)CommonSymbols.NIL;
        }
        
        @Override
		public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$file_vector_reference_native.structDecl;
        }
        
        @Override
		public SubLObject getField2() {
            return this.$index;
        }
        
        @Override
		public SubLObject getField3() {
            return this.$payload;
        }
        
        @Override
		public SubLObject setField2(final SubLObject value) {
            return this.$index = value;
        }
        
        @Override
		public SubLObject setField3(final SubLObject value) {
            return this.$payload = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$file_vector_reference_native.class, file_vector_utilities.$sym4$FILE_VECTOR_REFERENCE, file_vector_utilities.$sym5$FILE_VECTOR_REFERENCE_P, file_vector_utilities.$list6, file_vector_utilities.$list7, new String[] { "$index", "$payload" }, file_vector_utilities.$list8, file_vector_utilities.$list9, file_vector_utilities.$sym10$PRINT_FVECTOR_REF);
        }
    }
    
    public static final class $file_vector_reference_p$UnaryFunction extends UnaryFunction
    {
        public $file_vector_reference_p$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("FILE-VECTOR-REFERENCE-P"));
        }
        
        @Override
		public SubLObject processItem(final SubLObject arg1) {
            return file_vector_utilities.file_vector_reference_p(arg1);
        }
    }
    
    public static final class $backed_map_native extends SubLStructNative
    {
        public SubLObject $map;
        public SubLObject $fvector;
        public SubLObject $common_symbols;
        private static final SubLStructDeclNative structDecl;
        
        public $backed_map_native() {
            this.$map = (SubLObject)CommonSymbols.NIL;
            this.$fvector = (SubLObject)CommonSymbols.NIL;
            this.$common_symbols = (SubLObject)CommonSymbols.NIL;
        }
        
        @Override
		public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$backed_map_native.structDecl;
        }
        
        @Override
		public SubLObject getField2() {
            return this.$map;
        }
        
        @Override
		public SubLObject getField3() {
            return this.$fvector;
        }
        
        @Override
		public SubLObject getField4() {
            return this.$common_symbols;
        }
        
        @Override
		public SubLObject setField2(final SubLObject value) {
            return this.$map = value;
        }
        
        @Override
		public SubLObject setField3(final SubLObject value) {
            return this.$fvector = value;
        }
        
        @Override
		public SubLObject setField4(final SubLObject value) {
            return this.$common_symbols = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$backed_map_native.class, file_vector_utilities.$sym84$BACKED_MAP, file_vector_utilities.$sym85$BACKED_MAP_P, file_vector_utilities.$list86, file_vector_utilities.$list87, new String[] { "$map", "$fvector", "$common_symbols" }, file_vector_utilities.$list88, file_vector_utilities.$list89, file_vector_utilities.$sym90$PRINT_BACKED_MAP);
        }
    }
    
    public static final class $backed_map_p$UnaryFunction extends UnaryFunction
    {
        public $backed_map_p$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("BACKED-MAP-P"));
        }
        
        @Override
		public SubLObject processItem(final SubLObject arg1) {
            return file_vector_utilities.backed_map_p(arg1);
        }
    }
}

/*

	Total time: 1495 ms
	 synthetic 
*/