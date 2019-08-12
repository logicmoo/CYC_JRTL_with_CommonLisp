/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;

import static com.cyc.cycjava.cycl.access_macros.*;
import static com.cyc.cycjava.cycl.cfasl.*;
import static com.cyc.cycjava.cycl.file_vector.*;
import static com.cyc.cycjava.cycl.id_index.*;
import static com.cyc.cycjava.cycl.utilities_macros.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import java.util.Iterator;
import java.util.Map;

import org.armedbear.lisp.Lisp;
import org.logicmoo.system.BeanShellCntrl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLFloat;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.stream_macros;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.time_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      KB-OBJECT-MANAGER
 * source file: /cyc/top/cycl/kb-object-manager.lisp
 * created:     2019/07/03 17:37:20
 */
public final class kb_object_manager extends SubLTranslatedFile implements V12 {
    public static final SubLObject kbom_dummy2(SubLObject v_object) {
	SubLTrampolineFile.checkType(v_object, KB_OBJECT_MANAGER_P);
	return v_object.getField14();
    }

    public static final SubLObject kbom_dummy1(SubLObject v_object) {
	SubLTrampolineFile.checkType(v_object, KB_OBJECT_MANAGER_P);
	return v_object.getField13();
    }

    public static final SubLObject _csetf_kbom_dummy2(SubLObject v_object, SubLObject value) {
	SubLTrampolineFile.checkType(v_object, KB_OBJECT_MANAGER_P);
	return v_object.setField14(value);
    }

    public static final SubLObject _csetf_kbom_dummy1(SubLObject v_object, SubLObject value) {
	SubLTrampolineFile.checkType(v_object, KB_OBJECT_MANAGER_P);
	return v_object.setField13(value);
    }

    public static final SubLFile me = new kb_object_manager();

 public static final String myName = "com.cyc.cycjava.cycl.kb_object_manager";


    // defconstant
    @LispMethod(comment = "defconstant")
    public static final SubLSymbol $dtp_kb_object_manager$ = makeSymbol("*DTP-KB-OBJECT-MANAGER*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $min_kb_object_lru_size$ = makeSymbol("*MIN-KB-OBJECT-LRU-SIZE*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $kbom_id_equality_test$ = makeSymbol("*KBOM-ID-EQUALITY-TEST*");

    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    static private final SubLList $list0 = list(list(makeSymbol("KBOM")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLSymbol KB_OBJECT_MANAGER_CONTENT_LOCK = makeSymbol("KB-OBJECT-MANAGER-CONTENT-LOCK");

    private static final SubLSymbol KB_OBJECT_MANAGER = makeSymbol("KB-OBJECT-MANAGER");

    private static final SubLSymbol KB_OBJECT_MANAGER_P = makeSymbol("KB-OBJECT-MANAGER-P");

    static private final SubLList $list5 = list(new SubLObject[] { makeSymbol("NAME"), makeSymbol("CONTENT-LOCK"), makeSymbol("LRU-SIZE-PERCENTAGE"), makeSymbol("CONTENT-TABLE"), makeSymbol("USAGE-TABLE"), makeSymbol("LRU-INFORMATION"), makeSymbol("FILE-VECTOR"), makeSymbol("ID-THRESHOLD"),
	    makeSymbol("LOAD-FUNC"), makeSymbol("METER-SWAP-TIME?"), makeSymbol("SWAP-TIME"), makeSymbol("LRU-SIZE-MAX"), makeSymbol("SUB-FILE-VECTOR"), makeSymbol("DUMMY3") });

    static private final SubLList $list6 = list(new SubLObject[] { $NAME, makeKeyword("CONTENT-LOCK"), makeKeyword("LRU-SIZE-PERCENTAGE"), makeKeyword("CONTENT-TABLE"), makeKeyword("USAGE-TABLE"), makeKeyword("LRU-INFORMATION"), makeKeyword("FILE-VECTOR"), makeKeyword("ID-THRESHOLD"),
	    makeKeyword("LOAD-FUNC"), makeKeyword("METER-SWAP-TIME?"), makeKeyword("SWAP-TIME"), makeKeyword("LRU-SIZE-MAX"), makeKeyword("SUB-FILE-VECTOR"), makeKeyword("DUMMY3") });

    static private final SubLList $list7 = list(new SubLObject[] { makeSymbol("KBOM-NAME"), makeSymbol("KBOM-CONTENT-LOCK"), makeSymbol("KBOM-LRU-SIZE-PERCENTAGE"), makeSymbol("KBOM-CONTENT-TABLE"), makeSymbol("KBOM-USAGE-TABLE"), makeSymbol("KBOM-LRU-INFORMATION"), makeSymbol("KBOM-FILE-VECTOR"),
	    makeSymbol("KBOM-ID-THRESHOLD"), makeSymbol("KBOM-LOAD-FUNC"), makeSymbol("KBOM-METER-SWAP-TIME?"), makeSymbol("KBOM-SWAP-TIME"), makeSymbol("KBOM-LRU-SIZE-MAX"), makeSymbol("KBOM-SUB-FILE-VECTOR"), makeSymbol("KBOM-DUMMY3") });

    static private final SubLList $list8 = list(new SubLObject[] { makeSymbol("_CSETF-KBOM-NAME"), makeSymbol("_CSETF-KBOM-CONTENT-LOCK"), makeSymbol("_CSETF-KBOM-LRU-SIZE-PERCENTAGE"), makeSymbol("_CSETF-KBOM-CONTENT-TABLE"), makeSymbol("_CSETF-KBOM-USAGE-TABLE"),
	    makeSymbol("_CSETF-KBOM-LRU-INFORMATION"), makeSymbol("_CSETF-KBOM-FILE-VECTOR"), makeSymbol("_CSETF-KBOM-ID-THRESHOLD"), makeSymbol("_CSETF-KBOM-LOAD-FUNC"), makeSymbol("_CSETF-KBOM-METER-SWAP-TIME?"), makeSymbol("_CSETF-KBOM-SWAP-TIME"), makeSymbol("_CSETF-KBOM-LRU-SIZE-MAX"),
	    makeSymbol("_CSETF-KBOM-SUB-FILE-VECTOR"), makeSymbol("_CSETF-KBOM-DUMMY3") });

    private static final SubLSymbol KB_OBJECT_MANAGER_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("KB-OBJECT-MANAGER-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLList $list11 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("KB-OBJECT-MANAGER-P"));

    private static final SubLSymbol KBOM_NAME = makeSymbol("KBOM-NAME");

    private static final SubLSymbol _CSETF_KBOM_NAME = makeSymbol("_CSETF-KBOM-NAME");

    private static final SubLSymbol KBOM_CONTENT_LOCK = makeSymbol("KBOM-CONTENT-LOCK");

    private static final SubLSymbol _CSETF_KBOM_CONTENT_LOCK = makeSymbol("_CSETF-KBOM-CONTENT-LOCK");

    private static final SubLSymbol KBOM_LRU_SIZE_PERCENTAGE = makeSymbol("KBOM-LRU-SIZE-PERCENTAGE");

    private static final SubLSymbol _CSETF_KBOM_LRU_SIZE_PERCENTAGE = makeSymbol("_CSETF-KBOM-LRU-SIZE-PERCENTAGE");

    private static final SubLSymbol KBOM_CONTENT_TABLE = makeSymbol("KBOM-CONTENT-TABLE");

    private static final SubLSymbol _CSETF_KBOM_CONTENT_TABLE = makeSymbol("_CSETF-KBOM-CONTENT-TABLE");

    private static final SubLSymbol KBOM_USAGE_TABLE = makeSymbol("KBOM-USAGE-TABLE");

    private static final SubLSymbol _CSETF_KBOM_USAGE_TABLE = makeSymbol("_CSETF-KBOM-USAGE-TABLE");

    private static final SubLSymbol KBOM_LRU_INFORMATION = makeSymbol("KBOM-LRU-INFORMATION");

    private static final SubLSymbol _CSETF_KBOM_LRU_INFORMATION = makeSymbol("_CSETF-KBOM-LRU-INFORMATION");

    private static final SubLSymbol KBOM_FILE_VECTOR = makeSymbol("KBOM-FILE-VECTOR");

    private static final SubLSymbol _CSETF_KBOM_FILE_VECTOR = makeSymbol("_CSETF-KBOM-FILE-VECTOR");

    private static final SubLSymbol KBOM_ID_THRESHOLD = makeSymbol("KBOM-ID-THRESHOLD");

    private static final SubLSymbol _CSETF_KBOM_ID_THRESHOLD = makeSymbol("_CSETF-KBOM-ID-THRESHOLD");

    private static final SubLSymbol KBOM_LOAD_FUNC = makeSymbol("KBOM-LOAD-FUNC");

    private static final SubLSymbol _CSETF_KBOM_LOAD_FUNC = makeSymbol("_CSETF-KBOM-LOAD-FUNC");

    private static final SubLSymbol $sym30$KBOM_METER_SWAP_TIME_ = makeSymbol("KBOM-METER-SWAP-TIME?");

    private static final SubLSymbol $sym31$_CSETF_KBOM_METER_SWAP_TIME_ = makeSymbol("_CSETF-KBOM-METER-SWAP-TIME?");

    private static final SubLSymbol KBOM_SWAP_TIME = makeSymbol("KBOM-SWAP-TIME");

    private static final SubLSymbol _CSETF_KBOM_SWAP_TIME = makeSymbol("_CSETF-KBOM-SWAP-TIME");

    private static final SubLSymbol KBOM_LRU_SIZE_MAX = makeSymbol("KBOM-LRU-SIZE-MAX");

    private static final SubLSymbol _CSETF_KBOM_LRU_SIZE_MAX = makeSymbol("_CSETF-KBOM-LRU-SIZE-MAX");

    private static final SubLSymbol KBOM_SUB_FILE_VECTOR = makeSymbol("KBOM-SUB-FILE-VECTOR");

    private static final SubLSymbol _CSETF_KBOM_SUB_FILE_VECTOR = makeSymbol("_CSETF-KBOM-SUB-FILE-VECTOR");

    private static final SubLSymbol KBOM_DUMMY3 = makeSymbol("KBOM-DUMMY3");

    private static final SubLSymbol _CSETF_KBOM_DUMMY3 = makeSymbol("_CSETF-KBOM-DUMMY3");

    private static final SubLSymbol $LRU_SIZE_PERCENTAGE = makeKeyword("LRU-SIZE-PERCENTAGE");

    private static final SubLSymbol $kw49$METER_SWAP_TIME_ = makeKeyword("METER-SWAP-TIME?");

    private static final SubLSymbol $LRU_SIZE_MAX = makeKeyword("LRU-SIZE-MAX");

    private static final SubLSymbol $SUB_FILE_VECTOR = makeKeyword("SUB-FILE-VECTOR");

    private static final SubLString $str54$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");

    private static final SubLSymbol MAKE_KB_OBJECT_MANAGER = makeSymbol("MAKE-KB-OBJECT-MANAGER");

    private static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_KB_OBJECT_MANAGER_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-KB-OBJECT-MANAGER-METHOD");

    private static final SubLString $$$_content_manager_lock = makeString(" content manager lock");

    private static final SubLInteger $int$212 = makeInteger(212);

    private static final SubLString $str68$Got__s__expected_an_extensionless = makeString("Got ~s, expected an extensionless file basename");

    private static final SubLSymbol NEW_LEGACY_KB_OBJECT_MANAGER = makeSymbol("NEW-LEGACY-KB-OBJECT-MANAGER");

    private static final SubLFloat $float$0_05 = makeDouble(0.05);

    private static final SubLString $str72$Failed_to_swap_in_KB_object__A_ba = makeString("Failed to swap in KB object ~A back from the CFASL stream ~A; got ~A instead.~%After index lookup, index was at filepos ~A.~%Corrupted KB units?");

    private static final SubLString $str73$We_expected_KB_object_ID__A_from_ = makeString(
	    "We expected KB object ID ~A from CFASL stream ~A but got object ~A of type ~A instead.~%Thus, the index and the data files for the file vector are misaligned.~%After index lookup, index was at filepos ~A.~%Corrupted KB units?");

    private static final SubLSymbol SERIALIZE_KBOM_LRU_INFORMATION = makeSymbol("SERIALIZE-KBOM-LRU-INFORMATION");

    private static final SubLString $str76$Unable_to_open__S = makeString("Unable to open ~S");

    private static final SubLSymbol PRECACHE_KBOM_BY_LRU_INFORMATION = makeSymbol("PRECACHE-KBOM-BY-LRU-INFORMATION");

    private static final SubLSymbol $sym79$_ = makeSymbol("<");

    private static final SubLString $str80$_lru_info_for_ = makeString("-lru-info-for-");

    private static final SubLString $str81$_cfasl = makeString(".cfasl");

    private static final SubLString $$$Swapping_out_ = makeString("Swapping out ");

    private static final SubLString $$$_objects = makeString(" objects");

    private static final SubLString $$$cdolist = makeString("cdolist");

    private static final SubLSymbol $sym86$IS_MUTED_KB_OBJECT_ = makeSymbol("IS-MUTED-KB-OBJECT?");

    private static final SubLList $list87 = list(makeSymbol("ID"), makeSymbol("PAYLOAD"));

    private static final SubLString $$$Verifying_integrity_of_ = makeString("Verifying integrity of ");

    private static final SubLString $$$_content_table = makeString(" content table");

    private static final SubLString $str91$Entry__a_is_invalid___a__repairin = makeString("Entry ~a is invalid: ~a, repairing");

    private static final SubLString $str92$Entry__a_is_invalid___a = makeString("Entry ~a is invalid: ~a");

    private static final SubLSymbol $sym93$MANAGER = makeUninternedSymbol("MANAGER");

    private static final SubLSymbol $sym94$MAINTAINING_COUNTS_ = makeUninternedSymbol("MAINTAINING-COUNTS?");

    private static final SubLSymbol $sym95$MEMORY_MAPPED_ = makeUninternedSymbol("MEMORY-MAPPED?");

    private static final SubLSymbol $sym97$KB_OBJECT_USAGE_COUNTS_ENABLED_ = makeSymbol("KB-OBJECT-USAGE-COUNTS-ENABLED?");

    private static final SubLSymbol $sym98$KB_OBJECT_MANAGER_MEMORY_MAPPED_ = makeSymbol("KB-OBJECT-MANAGER-MEMORY-MAPPED?");

    private static final SubLSymbol DONT_MAINTAIN_KB_OBJECT_USAGE_COUNTS = makeSymbol("DONT-MAINTAIN-KB-OBJECT-USAGE-COUNTS");

    private static final SubLSymbol KB_OBJECT_MANAGER_ENABLE_MEMORY_MAPPING = makeSymbol("KB-OBJECT-MANAGER-ENABLE-MEMORY-MAPPING");

    private static final SubLSymbol MAINTAIN_KB_OBJECT_USAGE_COUNTS = makeSymbol("MAINTAIN-KB-OBJECT-USAGE-COUNTS");

    private static final SubLSymbol KB_OBJECT_MANAGER_CHANGE_STREAM_BUFFER_SIZES = makeSymbol("KB-OBJECT-MANAGER-CHANGE-STREAM-BUFFER-SIZES");

    private static final SubLList $list107 = list(makeInteger(2048), makeInteger(256));

    // Definitions
    public static final SubLObject with_kb_object_manager_lock_held_alt(SubLObject macroform, SubLObject environment) {
	{
	    SubLObject datum = macroform.rest();
	    SubLObject current = datum;
	    destructuring_bind_must_consp(current, datum, $list_alt0);
	    {
		SubLObject temp = current.rest();
		current = current.first();
		{
		    SubLObject kbom = NIL;
		    destructuring_bind_must_consp(current, datum, $list_alt0);
		    kbom = current.first();
		    current = current.rest();
		    if (NIL == current) {
			current = temp;
			{
			    SubLObject body = current;
			    return listS(WITH_LOCK_HELD, list(list(KB_OBJECT_MANAGER_CONTENT_LOCK, kbom)), append(body, NIL));
			}
		    } else {
			cdestructuring_bind_error(datum, $list_alt0);
		    }
		}
	    }
	}
	return NIL;
    }

    // Definitions
    public static SubLObject with_kb_object_manager_lock_held(final SubLObject macroform, final SubLObject environment) {
	SubLObject current;
	final SubLObject datum = current = macroform.rest();
	destructuring_bind_must_consp(current, datum, $list0);
	final SubLObject temp = current.rest();
	current = current.first();
	SubLObject kbom = NIL;
	destructuring_bind_must_consp(current, datum, $list0);
	kbom = current.first();
	current = current.rest();
	if (NIL == current) {
	    final SubLObject body;
	    current = body = temp;
	    return listS(WITH_LOCK_HELD, list(list(KB_OBJECT_MANAGER_CONTENT_LOCK, kbom)), append(body, NIL));
	}
	cdestructuring_bind_error(datum, $list0);
	return NIL;
    }

    public static final SubLObject kb_object_manager_print_function_trampoline_alt(SubLObject v_object, SubLObject stream) {
	compatibility.default_struct_print_function(v_object, stream, ZERO_INTEGER);
	return NIL;
    }

    public static SubLObject kb_object_manager_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
	compatibility.default_struct_print_function(v_object, stream, ZERO_INTEGER);
	return NIL;
    }

    public static final SubLObject kb_object_manager_p_alt(SubLObject v_object) {
	return v_object.getClass() == $kb_object_manager_native.class ? ((SubLObject) (T)) : NIL;
    }

    public static SubLObject kb_object_manager_p(final SubLObject v_object) {
	return v_object.getClass() == $kb_object_manager_native.class ? T : NIL;
    }

    public static final SubLObject kbom_name_alt(SubLObject v_object) {
	SubLTrampolineFile.checkType(v_object, KB_OBJECT_MANAGER_P);
	return v_object.getField2();
    }

    public static SubLObject kbom_name(final SubLObject v_object) {
	assert NIL != kb_object_manager_p(v_object) : "! kb_object_manager.kb_object_manager_p(v_object) " + "kb_object_manager.kb_object_manager_p error :" + v_object;
	return v_object.getField2();
    }

    public static final SubLObject kbom_content_lock_alt(SubLObject v_object) {
	SubLTrampolineFile.checkType(v_object, KB_OBJECT_MANAGER_P);
	return v_object.getField3();
    }

    public static SubLObject kbom_content_lock(final SubLObject v_object) {
	assert NIL != kb_object_manager_p(v_object) : "! kb_object_manager.kb_object_manager_p(v_object) " + "kb_object_manager.kb_object_manager_p error :" + v_object;
	return v_object.getField3();
    }

    public static final SubLObject kbom_lru_size_percentage_alt(SubLObject v_object) {
	SubLTrampolineFile.checkType(v_object, KB_OBJECT_MANAGER_P);
	return v_object.getField4();
    }

    public static SubLObject kbom_lru_size_percentage(final SubLObject v_object) {
	assert NIL != kb_object_manager_p(v_object) : "! kb_object_manager.kb_object_manager_p(v_object) " + "kb_object_manager.kb_object_manager_p error :" + v_object;
	return v_object.getField4();
    }

    public static final SubLObject kbom_content_table_alt(SubLObject v_object) {
	SubLTrampolineFile.checkType(v_object, KB_OBJECT_MANAGER_P);
	return v_object.getField5();
    }

    public static SubLObject kbom_content_table(final SubLObject v_object) {
	assert NIL != kb_object_manager_p(v_object) : "! kb_object_manager.kb_object_manager_p(v_object) " + "kb_object_manager.kb_object_manager_p error :" + v_object;
	return v_object.getField5();
    }

    public static final SubLObject kbom_usage_table_alt(SubLObject v_object) {
	SubLTrampolineFile.checkType(v_object, KB_OBJECT_MANAGER_P);
	return v_object.getField6();
    }

    public static SubLObject kbom_usage_table(final SubLObject v_object) {
	assert NIL != kb_object_manager_p(v_object) : "! kb_object_manager.kb_object_manager_p(v_object) " + "kb_object_manager.kb_object_manager_p error :" + v_object;
	return v_object.getField6();
    }

    public static final SubLObject kbom_lru_information_alt(SubLObject v_object) {
	SubLTrampolineFile.checkType(v_object, KB_OBJECT_MANAGER_P);
	return v_object.getField7();
    }

    public static SubLObject kbom_lru_information(final SubLObject v_object) {
	assert NIL != kb_object_manager_p(v_object) : "! kb_object_manager.kb_object_manager_p(v_object) " + "kb_object_manager.kb_object_manager_p error :" + v_object;
	return v_object.getField7();
    }

    public static final SubLObject kbom_file_vector_alt(SubLObject v_object) {
	SubLTrampolineFile.checkType(v_object, KB_OBJECT_MANAGER_P);
	return v_object.getField8();
    }

    public static SubLObject kbom_file_vector(final SubLObject v_object) {
	assert NIL != kb_object_manager_p(v_object) : "! kb_object_manager.kb_object_manager_p(v_object) " + "kb_object_manager.kb_object_manager_p error :" + v_object;
	return v_object.getField8();
    }

    public static final SubLObject kbom_id_threshold_alt(SubLObject v_object) {
	SubLTrampolineFile.checkType(v_object, KB_OBJECT_MANAGER_P);
	return v_object.getField9();
    }

    public static SubLObject kbom_id_threshold(final SubLObject v_object) {
	assert NIL != kb_object_manager_p(v_object) : "! kb_object_manager.kb_object_manager_p(v_object) " + "kb_object_manager.kb_object_manager_p error :" + v_object;
	return v_object.getField9();
    }

    public static final SubLObject kbom_load_func_alt(SubLObject v_object) {
	SubLTrampolineFile.checkType(v_object, KB_OBJECT_MANAGER_P);
	return v_object.getField10();
    }

    public static SubLObject kbom_load_func(final SubLObject v_object) {
	assert NIL != kb_object_manager_p(v_object) : "! kb_object_manager.kb_object_manager_p(v_object) " + "kb_object_manager.kb_object_manager_p error :" + v_object;
	return v_object.getField10();
    }

    public static final SubLObject kbom_meter_swap_timeP_alt(SubLObject v_object) {
	SubLTrampolineFile.checkType(v_object, KB_OBJECT_MANAGER_P);
	return v_object.getField11();
    }

    public static SubLObject kbom_meter_swap_timeP(final SubLObject v_object) {
	assert NIL != kb_object_manager_p(v_object) : "! kb_object_manager.kb_object_manager_p(v_object) " + "kb_object_manager.kb_object_manager_p error :" + v_object;
	return v_object.getField11();
    }

    public static final SubLObject kbom_swap_time_alt(SubLObject v_object) {
	SubLTrampolineFile.checkType(v_object, KB_OBJECT_MANAGER_P);
	return v_object.getField12();
    }

    public static SubLObject kbom_swap_time(final SubLObject v_object) {
	assert NIL != kb_object_manager_p(v_object) : "! kb_object_manager.kb_object_manager_p(v_object) " + "kb_object_manager.kb_object_manager_p error :" + v_object;
	return v_object.getField12();
    }

    public static SubLObject kbom_lru_size_max(final SubLObject v_object) {
	assert NIL != kb_object_manager_p(v_object) : "! kb_object_manager.kb_object_manager_p(v_object) " + "kb_object_manager.kb_object_manager_p error :" + v_object;
	return v_object.getField13();
    }

    public static SubLObject kbom_sub_file_vector(final SubLObject v_object) {
	assert NIL != kb_object_manager_p(v_object) : "! kb_object_manager.kb_object_manager_p(v_object) " + "kb_object_manager.kb_object_manager_p error :" + v_object;
	return v_object.getField14();
    }

    public static final SubLObject kbom_dummy3_alt(SubLObject v_object) {
	SubLTrampolineFile.checkType(v_object, KB_OBJECT_MANAGER_P);
	return v_object.getField15();
    }

    public static SubLObject kbom_dummy3(final SubLObject v_object) {
	assert NIL != kb_object_manager_p(v_object) : "! kb_object_manager.kb_object_manager_p(v_object) " + "kb_object_manager.kb_object_manager_p error :" + v_object;
	return v_object.getField15();
    }

    public static final SubLObject _csetf_kbom_name_alt(SubLObject v_object, SubLObject value) {
	SubLTrampolineFile.checkType(v_object, KB_OBJECT_MANAGER_P);
	return v_object.setField2(value);
    }

    public static SubLObject _csetf_kbom_name(final SubLObject v_object, final SubLObject value) {
	assert NIL != kb_object_manager_p(v_object) : "! kb_object_manager.kb_object_manager_p(v_object) " + "kb_object_manager.kb_object_manager_p error :" + v_object;
	return v_object.setField2(value);
    }

    public static final SubLObject _csetf_kbom_content_lock_alt(SubLObject v_object, SubLObject value) {
	SubLTrampolineFile.checkType(v_object, KB_OBJECT_MANAGER_P);
	return v_object.setField3(value);
    }

    public static SubLObject _csetf_kbom_content_lock(final SubLObject v_object, final SubLObject value) {
	assert NIL != kb_object_manager_p(v_object) : "! kb_object_manager.kb_object_manager_p(v_object) " + "kb_object_manager.kb_object_manager_p error :" + v_object;
	return v_object.setField3(value);
    }

    public static final SubLObject _csetf_kbom_lru_size_percentage_alt(SubLObject v_object, SubLObject value) {
	SubLTrampolineFile.checkType(v_object, KB_OBJECT_MANAGER_P);
	return v_object.setField4(value);
    }

    public static SubLObject _csetf_kbom_lru_size_percentage(final SubLObject v_object, final SubLObject value) {
	assert NIL != kb_object_manager_p(v_object) : "! kb_object_manager.kb_object_manager_p(v_object) " + "kb_object_manager.kb_object_manager_p error :" + v_object;
	return v_object.setField4(value);
    }

    public static final SubLObject _csetf_kbom_content_table_alt(SubLObject v_object, SubLObject value) {
	SubLTrampolineFile.checkType(v_object, KB_OBJECT_MANAGER_P);
	return v_object.setField5(value);
    }

    public static SubLObject _csetf_kbom_content_table(final SubLObject v_object, final SubLObject value) {
	assert NIL != kb_object_manager_p(v_object) : "! kb_object_manager.kb_object_manager_p(v_object) " + "kb_object_manager.kb_object_manager_p error :" + v_object;
	return v_object.setField5(value);
    }

    public static final SubLObject _csetf_kbom_usage_table_alt(SubLObject v_object, SubLObject value) {
	SubLTrampolineFile.checkType(v_object, KB_OBJECT_MANAGER_P);
	return v_object.setField6(value);
    }

    public static SubLObject _csetf_kbom_usage_table(final SubLObject v_object, final SubLObject value) {
	assert NIL != kb_object_manager_p(v_object) : "! kb_object_manager.kb_object_manager_p(v_object) " + "kb_object_manager.kb_object_manager_p error :" + v_object;
	return v_object.setField6(value);
    }

    public static final SubLObject _csetf_kbom_lru_information_alt(SubLObject v_object, SubLObject value) {
	SubLTrampolineFile.checkType(v_object, KB_OBJECT_MANAGER_P);
	return v_object.setField7(value);
    }

    public static SubLObject _csetf_kbom_lru_information(final SubLObject v_object, final SubLObject value) {
	assert NIL != kb_object_manager_p(v_object) : "! kb_object_manager.kb_object_manager_p(v_object) " + "kb_object_manager.kb_object_manager_p error :" + v_object;
	return v_object.setField7(value);
    }

    public static final SubLObject _csetf_kbom_file_vector_alt(SubLObject v_object, SubLObject value) {
	SubLTrampolineFile.checkType(v_object, KB_OBJECT_MANAGER_P);
	return v_object.setField8(value);
    }

    public static SubLObject _csetf_kbom_file_vector(final SubLObject v_object, final SubLObject value) {
	assert NIL != kb_object_manager_p(v_object) : "! kb_object_manager.kb_object_manager_p(v_object) " + "kb_object_manager.kb_object_manager_p error :" + v_object;
	return v_object.setField8(value);
    }

    public static final SubLObject _csetf_kbom_id_threshold_alt(SubLObject v_object, SubLObject value) {
	SubLTrampolineFile.checkType(v_object, KB_OBJECT_MANAGER_P);
	return v_object.setField9(value);
    }

    public static SubLObject _csetf_kbom_id_threshold(final SubLObject v_object, final SubLObject value) {
	assert NIL != kb_object_manager_p(v_object) : "! kb_object_manager.kb_object_manager_p(v_object) " + "kb_object_manager.kb_object_manager_p error :" + v_object;
	return v_object.setField9(value);
    }

    public static final SubLObject _csetf_kbom_load_func_alt(SubLObject v_object, SubLObject value) {
	SubLTrampolineFile.checkType(v_object, KB_OBJECT_MANAGER_P);
	return v_object.setField10(value);
    }

    public static SubLObject _csetf_kbom_load_func(final SubLObject v_object, final SubLObject value) {
	assert NIL != kb_object_manager_p(v_object) : "! kb_object_manager.kb_object_manager_p(v_object) " + "kb_object_manager.kb_object_manager_p error :" + v_object;
	return v_object.setField10(value);
    }

    public static final SubLObject _csetf_kbom_meter_swap_timeP_alt(SubLObject v_object, SubLObject value) {
	SubLTrampolineFile.checkType(v_object, KB_OBJECT_MANAGER_P);
	return v_object.setField11(value);
    }

    public static SubLObject _csetf_kbom_meter_swap_timeP(final SubLObject v_object, final SubLObject value) {
	assert NIL != kb_object_manager_p(v_object) : "! kb_object_manager.kb_object_manager_p(v_object) " + "kb_object_manager.kb_object_manager_p error :" + v_object;
	return v_object.setField11(value);
    }

    public static final SubLObject _csetf_kbom_swap_time_alt(SubLObject v_object, SubLObject value) {
	SubLTrampolineFile.checkType(v_object, KB_OBJECT_MANAGER_P);
	return v_object.setField12(value);
    }

    public static SubLObject _csetf_kbom_swap_time(final SubLObject v_object, final SubLObject value) {
	assert NIL != kb_object_manager_p(v_object) : "! kb_object_manager.kb_object_manager_p(v_object) " + "kb_object_manager.kb_object_manager_p error :" + v_object;
	return v_object.setField12(value);
    }

    public static SubLObject _csetf_kbom_lru_size_max(final SubLObject v_object, final SubLObject value) {
	assert NIL != kb_object_manager_p(v_object) : "! kb_object_manager.kb_object_manager_p(v_object) " + "kb_object_manager.kb_object_manager_p error :" + v_object;
	return v_object.setField13(value);
    }

    public static SubLObject _csetf_kbom_sub_file_vector(final SubLObject v_object, final SubLObject value) {
	assert NIL != kb_object_manager_p(v_object) : "! kb_object_manager.kb_object_manager_p(v_object) " + "kb_object_manager.kb_object_manager_p error :" + v_object;
	return v_object.setField14(value);
    }

    public static final SubLObject _csetf_kbom_dummy3_alt(SubLObject v_object, SubLObject value) {
	SubLTrampolineFile.checkType(v_object, KB_OBJECT_MANAGER_P);
	return v_object.setField15(value);
    }

    public static SubLObject _csetf_kbom_dummy3(final SubLObject v_object, final SubLObject value) {
	assert NIL != kb_object_manager_p(v_object) : "! kb_object_manager.kb_object_manager_p(v_object) " + "kb_object_manager.kb_object_manager_p error :" + v_object;
	return v_object.setField15(value);
    }

    public static final SubLObject make_kb_object_manager_alt(SubLObject arglist) {
	if (arglist == UNPROVIDED) {
	    arglist = NIL;
	}
	{
	    SubLObject v_new = new $kb_object_manager_native();
	    SubLObject next = NIL;
	    for (next = arglist; NIL != next; next = cddr(next)) {
		{
		    SubLObject current_arg = next.first();
		    SubLObject current_value = cadr(next);
		    SubLObject pcase_var = current_arg;
		    if (pcase_var.eql($NAME)) {
			_csetf_kbom_name(v_new, current_value);
		    } else {
			if (pcase_var.eql($CONTENT_LOCK)) {
			    _csetf_kbom_content_lock(v_new, current_value);
			} else {
			    if (pcase_var.eql($LRU_SIZE_PERCENTAGE)) {
				_csetf_kbom_lru_size_percentage(v_new, current_value);
			    } else {
				if (pcase_var.eql($CONTENT_TABLE)) {
				    _csetf_kbom_content_table(v_new, current_value);
				} else {
				    if (pcase_var.eql($USAGE_TABLE)) {
					_csetf_kbom_usage_table(v_new, current_value);
				    } else {
					if (pcase_var.eql($LRU_INFORMATION)) {
					    _csetf_kbom_lru_information(v_new, current_value);
					} else {
					    if (pcase_var.eql($FILE_VECTOR)) {
						_csetf_kbom_file_vector(v_new, current_value);
					    } else {
						if (pcase_var.eql($ID_THRESHOLD)) {
						    _csetf_kbom_id_threshold(v_new, current_value);
						} else {
						    if (pcase_var.eql($LOAD_FUNC)) {
							_csetf_kbom_load_func(v_new, current_value);
						    } else {
							if (pcase_var.eql($kw48$METER_SWAP_TIME_)) {
							    _csetf_kbom_meter_swap_timeP(v_new, current_value);
							} else {
							    if (pcase_var.eql($SWAP_TIME)) {
								_csetf_kbom_swap_time(v_new, current_value);
							    } else {
								if (pcase_var.eql($DUMMY1)) {
								    _csetf_kbom_dummy1(v_new, current_value);
								} else {
								    if (pcase_var.eql($DUMMY2)) {
									_csetf_kbom_dummy2(v_new, current_value);
								    } else {
									if (pcase_var.eql($DUMMY3)) {
									    _csetf_kbom_dummy3(v_new, current_value);
									} else {
									    Errors.error($str_alt53$Invalid_slot__S_for_construction_, current_arg);
									}
								    }
								}
							    }
							}
						    }
						}
					    }
					}
				    }
				}
			    }
			}
		    }
		}
	    }
	    return v_new;
	}
    }

    public static SubLObject make_kb_object_manager(SubLObject arglist) {
	if (arglist == UNPROVIDED) {
	    arglist = NIL;
	}
	final SubLObject v_new = new $kb_object_manager_native();
	SubLObject next;
	SubLObject current_arg;
	SubLObject current_value;
	SubLObject pcase_var;
	for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
	    current_arg = next.first();
	    current_value = cadr(next);
	    pcase_var = current_arg;
	    if (pcase_var.eql($NAME)) {
		_csetf_kbom_name(v_new, current_value);
	    } else if (pcase_var.eql($CONTENT_LOCK)) {
		_csetf_kbom_content_lock(v_new, current_value);
	    } else if (pcase_var.eql($LRU_SIZE_PERCENTAGE)) {
		_csetf_kbom_lru_size_percentage(v_new, current_value);
	    } else if (pcase_var.eql($CONTENT_TABLE)) {
		_csetf_kbom_content_table(v_new, current_value);
	    } else if (pcase_var.eql($USAGE_TABLE)) {
		_csetf_kbom_usage_table(v_new, current_value);
	    } else if (pcase_var.eql($LRU_INFORMATION)) {
		_csetf_kbom_lru_information(v_new, current_value);
	    } else if (pcase_var.eql($FILE_VECTOR)) {
		_csetf_kbom_file_vector(v_new, current_value);
	    } else if (pcase_var.eql($ID_THRESHOLD)) {
		_csetf_kbom_id_threshold(v_new, current_value);
	    } else if (pcase_var.eql($LOAD_FUNC)) {
		_csetf_kbom_load_func(v_new, current_value);
	    } else if (pcase_var.eql($kw49$METER_SWAP_TIME_)) {
		_csetf_kbom_meter_swap_timeP(v_new, current_value);
	    } else if (pcase_var.eql($SWAP_TIME)) {
		_csetf_kbom_swap_time(v_new, current_value);
	    } else if (pcase_var.eql($LRU_SIZE_MAX)) {
		_csetf_kbom_lru_size_max(v_new, current_value);
	    } else if (pcase_var.eql($SUB_FILE_VECTOR)) {
		_csetf_kbom_sub_file_vector(v_new, current_value);
	    } else if (pcase_var.eql($DUMMY3)) {
		_csetf_kbom_dummy3(v_new, current_value);
	    } else {
		Errors.error($str54$Invalid_slot__S_for_construction_, current_arg);
	    }

	}
	return v_new;
    }

    public static SubLObject visit_defstruct_kb_object_manager(final SubLObject obj, final SubLObject visitor_fn) {
	funcall(visitor_fn, obj, $BEGIN, MAKE_KB_OBJECT_MANAGER, FOURTEEN_INTEGER);
	funcall(visitor_fn, obj, $SLOT, $NAME, kbom_name(obj));
	funcall(visitor_fn, obj, $SLOT, $CONTENT_LOCK, kbom_content_lock(obj));
	funcall(visitor_fn, obj, $SLOT, $LRU_SIZE_PERCENTAGE, kbom_lru_size_percentage(obj));
	funcall(visitor_fn, obj, $SLOT, $CONTENT_TABLE, kbom_content_table(obj));
	funcall(visitor_fn, obj, $SLOT, $USAGE_TABLE, kbom_usage_table(obj));
	funcall(visitor_fn, obj, $SLOT, $LRU_INFORMATION, kbom_lru_information(obj));
	funcall(visitor_fn, obj, $SLOT, $FILE_VECTOR, kbom_file_vector(obj));
	funcall(visitor_fn, obj, $SLOT, $ID_THRESHOLD, kbom_id_threshold(obj));
	funcall(visitor_fn, obj, $SLOT, $LOAD_FUNC, kbom_load_func(obj));
	funcall(visitor_fn, obj, $SLOT, $kw49$METER_SWAP_TIME_, kbom_meter_swap_timeP(obj));
	funcall(visitor_fn, obj, $SLOT, $SWAP_TIME, kbom_swap_time(obj));
	funcall(visitor_fn, obj, $SLOT, $LRU_SIZE_MAX, kbom_lru_size_max(obj));
	funcall(visitor_fn, obj, $SLOT, $SUB_FILE_VECTOR, kbom_sub_file_vector(obj));
	funcall(visitor_fn, obj, $SLOT, $DUMMY3, kbom_dummy3(obj));
	funcall(visitor_fn, obj, $END, MAKE_KB_OBJECT_MANAGER, FOURTEEN_INTEGER);
	return obj;
    }

    public static SubLObject visit_defstruct_object_kb_object_manager_method(final SubLObject obj, final SubLObject visitor_fn) {
	return visit_defstruct_kb_object_manager(obj, visitor_fn);
    }

    public static final SubLObject new_kb_object_manager(SubLObject name, SubLObject size, SubLObject lru_size_percentage, SubLObject load_func, SubLObject exact_sizeP) {
	SubLTrampolineFile.checkType(name, STRINGP);
	SubLTrampolineFile.checkType(size, NON_NEGATIVE_INTEGER_P);
	SubLTrampolineFile.checkType(lru_size_percentage, POSITIVE_INTEGER_P);
	SubLTrampolineFile.checkType(load_func, FBOUNDP);
	{
	    SubLObject kbom = make_kb_object_manager(UNPROVIDED);
	    _csetf_kbom_name(kbom, name);
	    _csetf_kbom_content_lock(kbom, make_lock(cconcatenate(name, $str_alt58$_content_manager_lock)));
	    _csetf_kbom_lru_size_percentage(kbom, lru_size_percentage);
	    setup_kb_object_content_table(kbom, size, exact_sizeP);
	    _csetf_kbom_usage_table(kbom, $UNINITIALIZED);
	    _csetf_kbom_file_vector(kbom, NIL);
	    _csetf_kbom_id_threshold(kbom, ZERO_INTEGER);
	    _csetf_kbom_load_func(kbom, load_func);
	    _csetf_kbom_meter_swap_timeP(kbom, NIL);
	    _csetf_kbom_swap_time(kbom, NIL);
	    return kbom;
	}
    }

    public static SubLObject new_kb_object_manager(final SubLObject name, final SubLObject size, final SubLObject lru_size_percentage, final SubLObject lru_size_max, final SubLObject load_func, final SubLObject exact_sizeP) {
	assert NIL != stringp(name) : "! stringp(name) " + ("Types.stringp(name) " + "CommonSymbols.NIL != Types.stringp(name) ") + name;
	assert NIL != subl_promotions.non_negative_integer_p(size) : "! subl_promotions.non_negative_integer_p(size) " + ("subl_promotions.non_negative_integer_p(size) " + "CommonSymbols.NIL != subl_promotions.non_negative_integer_p(size) ") + size;
	assert NIL != subl_promotions.positive_integer_p(lru_size_percentage) : "! subl_promotions.positive_integer_p(lru_size_percentage) " + ("subl_promotions.positive_integer_p(lru_size_percentage) " + "CommonSymbols.NIL != subl_promotions.positive_integer_p(lru_size_percentage) ")
		+ lru_size_percentage;
	assert NIL != subl_promotions.positive_integer_p(lru_size_max) : "! subl_promotions.positive_integer_p(lru_size_max) " + ("subl_promotions.positive_integer_p(lru_size_max) " + "CommonSymbols.NIL != subl_promotions.positive_integer_p(lru_size_max) ") + lru_size_max;
	assert NIL != fboundp(load_func) : "! Symbols.fboundp(load_func) " + ("Symbols.fboundp(load_func) " + "CommonSymbols.NIL != Symbols.fboundp(load_func) ") + load_func;
	final SubLObject kbom = make_kb_object_manager(UNPROVIDED);
	_csetf_kbom_name(kbom, name);
	_csetf_kbom_content_lock(kbom, make_lock(cconcatenate(name, $$$_content_manager_lock)));
	_csetf_kbom_lru_size_percentage(kbom, lru_size_percentage);
	_csetf_kbom_lru_size_max(kbom, lru_size_max);
	setup_kb_object_content_table(kbom, size, exact_sizeP);
	_csetf_kbom_usage_table(kbom, $UNINITIALIZED);
	_csetf_kbom_file_vector(kbom, NIL);
	_csetf_kbom_id_threshold(kbom, ZERO_INTEGER);
	_csetf_kbom_load_func(kbom, load_func);
	_csetf_kbom_meter_swap_timeP(kbom, NIL);
	_csetf_kbom_swap_time(kbom, NIL);
	_csetf_kbom_sub_file_vector(kbom, NIL);
	return kbom;
    }

    public static SubLObject kb_object_manager_change_stream_buffer_sizes(final SubLObject kbom, final SubLObject data_stream_buffer_size, final SubLObject index_stream_buffer_size) {
	assert NIL != subl_promotions.positive_integer_p(data_stream_buffer_size) : "! subl_promotions.positive_integer_p(data_stream_buffer_size) "
		+ ("subl_promotions.positive_integer_p(data_stream_buffer_size) " + "CommonSymbols.NIL != subl_promotions.positive_integer_p(data_stream_buffer_size) ") + data_stream_buffer_size;
	assert NIL != subl_promotions.positive_integer_p(index_stream_buffer_size) : "! subl_promotions.positive_integer_p(index_stream_buffer_size) "
		+ ("subl_promotions.positive_integer_p(index_stream_buffer_size) " + "CommonSymbols.NIL != subl_promotions.positive_integer_p(index_stream_buffer_size) ") + index_stream_buffer_size;
	assert NIL != kb_object_manager_p(kbom) : "! kb_object_manager.kb_object_manager_p(kbom) " + ("kb_object_manager.kb_object_manager_p(kbom) " + "CommonSymbols.NIL != kb_object_manager.kb_object_manager_p(kbom) ") + kbom;
	final SubLObject lock = kb_object_manager_content_lock(kbom);
	SubLObject release = NIL;
	try {
	    release = seize_lock(lock);
	    final SubLObject fvector = kb_object_manager_file_vector(kbom);
	    if (NIL != fvector) {
		file_vector.file_vector_change_stream_buffer_sizes(fvector, data_stream_buffer_size, index_stream_buffer_size);
	    }
	} finally {
	    if (NIL != release) {
		release_lock(lock);
	    }
	}
	return NIL;
    }

    public static SubLObject kb_object_manager_enable_memory_mapping(final SubLObject kbom) {
	assert NIL != kb_object_manager_p(kbom) : "! kb_object_manager.kb_object_manager_p(kbom) " + ("kb_object_manager.kb_object_manager_p(kbom) " + "CommonSymbols.NIL != kb_object_manager.kb_object_manager_p(kbom) ") + kbom;
	final SubLObject lock = kb_object_manager_content_lock(kbom);
	SubLObject release = NIL;
	try {
	    release = seize_lock(lock);
	    final SubLObject fvector = kb_object_manager_file_vector(kbom);
	    if (NIL != fvector) {
		file_vector.file_vector_enable_memory_mapping(fvector);
	    }
	} finally {
	    if (NIL != release) {
		release_lock(lock);
	    }
	}
	return NIL;
    }

    public static SubLObject kb_object_manager_memory_mappedP(final SubLObject kbom) {
	assert NIL != kb_object_manager_p(kbom) : "! kb_object_manager.kb_object_manager_p(kbom) " + ("kb_object_manager.kb_object_manager_p(kbom) " + "CommonSymbols.NIL != kb_object_manager.kb_object_manager_p(kbom) ") + kbom;
	SubLObject result = NIL;
	final SubLObject lock = kb_object_manager_content_lock(kbom);
	SubLObject release = NIL;
	try {
	    release = seize_lock(lock);
	    final SubLObject fvector = kb_object_manager_file_vector(kbom);
	    result = makeBoolean((NIL != fvector) && (NIL != file_vector.file_vector_memory_mappedP(fvector)));
	} finally {
	    if (NIL != release) {
		release_lock(lock);
	    }
	}
	return result;
    }

    /**
     *
     *
     * @param EXACT?;
     * 		whether SIZE is the exact desired size.  If so, we'll allocate the table
     * 		in static space, otherwise we'll wait for @xref optimize-kb-object-content-table to do that.
     */
    @LispMethod(comment = "@param EXACT?;\r\n\t\twhether SIZE is the exact desired size.  If so, we\'ll allocate the table\r\n\t\tin static space, otherwise we\'ll wait for @xref optimize-kb-object-content-table to do that.")
    public static final SubLObject setup_kb_object_content_table_alt(SubLObject kbom, SubLObject size, SubLObject exactP) {
	{
	    SubLObject did_setupP = NIL;
	    SubLObject lock = kb_object_manager_content_lock(kbom);
	    SubLObject release = NIL;
	    try {
		release = seize_lock(lock);
		{
		    SubLObject content_table = kb_object_manager_content_table(kbom);
		    if (NIL == id_index_p(content_table)) {
			_csetf_kbom_content_table(kbom, new_id_index(size, ZERO_INTEGER));
			did_setupP = T;
		    }
		    did_setupP = setup_kb_object_content_support(kbom, NIL, size);
		}
	    } finally {
		if (NIL != release) {
		    release_lock(lock);
		}
	    }
	    return did_setupP;
	}
    }

    /**
     *
     *
     * @param EXACT?;
     * 		whether SIZE is the exact desired size.  If so, we'll allocate the table
     * 		in static space, otherwise we'll wait for @xref optimize-kb-object-content-table to do that.
     */
    @LispMethod(comment = "@param EXACT?;\r\n\t\twhether SIZE is the exact desired size.  If so, we\'ll allocate the table\r\n\t\tin static space, otherwise we\'ll wait for @xref optimize-kb-object-content-table to do that.")
    public static SubLObject setup_kb_object_content_table(final SubLObject kbom, final SubLObject size, final SubLObject exactP) {
	SubLObject did_setupP = NIL;
	final SubLObject lock = kb_object_manager_content_lock(kbom);
	SubLObject release = NIL;
	try {
	    release = seize_lock(lock);
	    final SubLObject content_table = kb_object_manager_content_table(kbom);
	    if (NIL == id_index_p(content_table)) {
		_csetf_kbom_content_table(kbom, new_id_index(size, ZERO_INTEGER));
		did_setupP = T;
	    }
	    did_setupP = setup_kb_object_content_support(kbom, NIL, size);
	} finally {
	    if (NIL != release) {
		release_lock(lock);
	    }
	}
	return did_setupP;
    }

    public static final SubLObject setup_kb_object_content_support_alt(SubLObject kbom, SubLObject initialize_usage_countsP, SubLObject size) {
	if (initialize_usage_countsP == UNPROVIDED) {
	    initialize_usage_countsP = NIL;
	}
	if (size == UNPROVIDED) {
	    size = NIL;
	}
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    if (!size.isFixnum()) {
		size = id_index_new_id_threshold(kb_object_manager_content_table(kbom));
	    }
	    {
		SubLObject did_setupP = NIL;
		if (NIL != initialize_usage_countsP) {
		    if (NIL == id_index_p(kb_object_manager_usage_table(kbom))) {
			_csetf_kbom_usage_table(kbom, new_id_index(size, ZERO_INTEGER));
			did_setupP = T;
		    }
		}
		if (NIL == cache.cache_p(kb_object_manager_lru_information(kbom))) {
		    {
			SubLObject lru_size = max($min_kb_object_lru_size$.getGlobalValue(), multiply(integerDivide(size, $int$100), kb_object_manager_lru_size_percentage(kbom)));
			{
			    SubLObject _prev_bind_0 = Storage.$current_area$.currentBinding(thread);
			    try {
				Storage.$current_area$.bind(Storage.get_static_area(), thread);
				_csetf_kbom_lru_information(kbom, cache.new_preallocated_cache(lru_size, symbol_function(EQ)));
			    } finally {
				Storage.$current_area$.rebind(_prev_bind_0, thread);
			    }
			}
		    }
		}
		return did_setupP;
	    }
	}
    }

    public static SubLObject setup_kb_object_content_support(final SubLObject kbom, SubLObject initialize_usage_countsP, SubLObject size) {
	if (initialize_usage_countsP == UNPROVIDED) {
	    initialize_usage_countsP = NIL;
	}
	if (size == UNPROVIDED) {
	    size = NIL;
	}
	final SubLThread thread = SubLProcess.currentSubLThread();
	if (!size.isFixnum()) {
	    size = id_index_sparse_id_threshold(kb_object_manager_content_table(kbom));
	}
	SubLObject did_setupP = NIL;
	if ((NIL != initialize_usage_countsP) && (NIL == id_index_p(kb_object_manager_usage_table(kbom)))) {
	    _csetf_kbom_usage_table(kbom, new_id_index(size, ZERO_INTEGER));
	    did_setupP = T;
	}
	if (NIL == cache.cache_p(kb_object_manager_lru_information(kbom))) {
	    final SubLObject lru_size = compute_kbom_lru_size(kbom, size);
	    final SubLObject _prev_bind_0 = Storage.$current_area$.currentBinding(thread);
	    try {
		Storage.$current_area$.bind(Storage.get_static_area(), thread);
		_csetf_kbom_lru_information(kbom, cache.new_preallocated_cache(lru_size, $kbom_id_equality_test$.getGlobalValue()));
	    } finally {
		Storage.$current_area$.rebind(_prev_bind_0, thread);
	    }
	}
	return did_setupP;
    }

    public static SubLObject compute_kbom_lru_size(final SubLObject kbom, final SubLObject given_size) {
	SubLObject size = multiply(integerDivide(given_size, $int$100), kb_object_manager_lru_size_percentage(kbom));
	final SubLObject max_size = kb_object_manager_lru_size_max(kbom);
	if ((NIL != max_size) && size.numG(max_size)) {
	    size = max_size;
	}
	if (size.numL($min_kb_object_lru_size$.getGlobalValue())) {
	    size = $min_kb_object_lru_size$.getGlobalValue();
	}
	return size;
    }

    public static final SubLObject initialize_kb_object_hl_store_cache(SubLObject kbom, SubLObject content_filename, SubLObject index_filename) {
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
		if (NIL != string_utilities.ends_with(content_filename, $$$cfasl, UNPROVIDED)) {
		    Errors.error($str_alt63$Got__s__expected_an_extensionless, content_filename);
		}
	    }
	    if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
		if (NIL != string_utilities.ends_with(index_filename, $$$cfasl, UNPROVIDED)) {
		    Errors.error($str_alt63$Got__s__expected_an_extensionless, index_filename);
		}
	    }
	    {
		SubLObject kb_object_cfasl_file = misc_utilities.get_hl_store_cache_filename(content_filename, $$$cfasl);
		SubLObject kb_object_index_file = misc_utilities.get_hl_store_cache_filename(index_filename, $$$cfasl);
		if ((NIL != Filesys.probe_file(kb_object_cfasl_file)) && (NIL != Filesys.probe_file(kb_object_index_file))) {
		    {
			SubLObject old_file_vector = kbom_file_vector(kbom);
			if (NIL != file_vector_p(old_file_vector)) {
			    close_file_vector(old_file_vector);
			}
		    }
		    {
			SubLObject v_file_vector = new_kb_object_content_file_vector(kb_object_cfasl_file, kb_object_index_file);
			_csetf_kbom_file_vector(kbom, v_file_vector);
			_csetf_kbom_id_threshold(kbom, file_vector_length(v_file_vector));
			return kb_object_content_file_vector_p(v_file_vector);
		    }
		}
	    }
	    return NIL;
	}
    }

    public static SubLObject initialize_kb_object_hl_store_cache(final SubLObject kbom, final SubLObject content_filename, final SubLObject index_filename, SubLObject sub_content_filename, SubLObject sub_index_filename) {
	if (sub_content_filename == UNPROVIDED) {
	    sub_content_filename = NIL;
	}
	if (sub_index_filename == UNPROVIDED) {
	    sub_index_filename = NIL;
	}
	final SubLThread thread = SubLProcess.currentSubLThread();
	SubLObject cdolist_list_var = list(content_filename, index_filename, sub_content_filename, sub_index_filename);
	SubLObject filename = NIL;
	filename = cdolist_list_var.first();
	while (NIL != cdolist_list_var) {
	    if ((filename.isString() && (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread))) && (NIL != string_utilities.ends_with(content_filename, misc_utilities.$standard_hl_store_cache_file_extension$.getGlobalValue(), UNPROVIDED))) {
		Errors.error($str68$Got__s__expected_an_extensionless, filename);
	    }
	    cdolist_list_var = cdolist_list_var.rest();
	    filename = cdolist_list_var.first();
	}
	final SubLObject mark_filename = dumper.get_wide_mark_basename_from_index_basename(index_filename);
	final SubLObject kb_object_cfasl_file = misc_utilities.get_hl_store_cache_filename(content_filename, UNPROVIDED);
	final SubLObject kb_object_index_file = misc_utilities.get_hl_store_cache_filename(index_filename, UNPROVIDED);
	final SubLObject kb_object_mark_file = misc_utilities.get_hl_store_cache_filename(mark_filename, UNPROVIDED);
	SubLObject result = NIL;
	final SubLObject lock = kb_object_manager_content_lock(kbom);
	SubLObject release = NIL;
	try {
	    release = seize_lock(lock);
	    if ((NIL != Filesys.probe_file(kb_object_cfasl_file)) && (NIL != Filesys.probe_file(kb_object_index_file))) {
		final SubLObject old_file_vector = kbom_file_vector(kbom);
		if (NIL != file_vector.file_vector_p(old_file_vector)) {
		    file_vector.close_file_vector(old_file_vector);
		}
		final SubLObject v_file_vector = new_kb_object_content_file_vector(kb_object_cfasl_file, kb_object_index_file, kb_object_mark_file);
		_csetf_kbom_file_vector(kbom, v_file_vector);
		_csetf_kbom_id_threshold(kbom, file_vector.file_vector_length(v_file_vector));
		if (sub_index_filename.isString()) {
		    final SubLObject sub_mark_filename = dumper.get_wide_mark_basename_from_index_basename(sub_index_filename);
		    final SubLObject sub_kb_object_cfasl_file = misc_utilities.get_hl_store_cache_filename(sub_content_filename, UNPROVIDED);
		    final SubLObject sub_kb_object_index_file = misc_utilities.get_hl_store_cache_filename(sub_index_filename, UNPROVIDED);
		    final SubLObject sub_kb_object_mark_file = misc_utilities.get_hl_store_cache_filename(sub_mark_filename, UNPROVIDED);
		    if ((NIL != Filesys.probe_file(sub_kb_object_cfasl_file)) && (NIL != Filesys.probe_file(sub_kb_object_index_file))) {
			final SubLObject old_sub_fvector = kbom_sub_file_vector(kbom);
			if (NIL != file_vector.file_vector_p(old_sub_fvector)) {
			    file_vector.close_file_vector(old_sub_fvector);
			}
			final SubLObject sub_file_vector = new_kb_object_content_file_vector(sub_kb_object_cfasl_file, sub_kb_object_index_file, sub_kb_object_mark_file);
			set_kb_object_manager_sub_file_vector(kbom, sub_file_vector);
		    }
		}
		result = kb_object_content_file_vector_p(v_file_vector);
	    }
	} finally {
	    if (NIL != release) {
		release_lock(lock);
	    }
	}
	return result;
    }

    public static SubLObject resize_kbom_lru_cache_from_percentage_and_max(final SubLObject kbom, final SubLObject percentage, final SubLObject max) {
	_csetf_kbom_lru_size_percentage(kbom, percentage);
	_csetf_kbom_lru_size_max(kbom, max);
	final SubLObject old_size = id_index_sparse_id_threshold(kb_object_manager_content_table(kbom));
	final SubLObject new_size = compute_kbom_lru_size(kbom, old_size);
	return resize_kbom_lru_cache(kbom, new_size);
    }

    public static SubLObject resize_kbom_lru_cache(final SubLObject kbom, final SubLObject new_size) {
	final SubLThread thread = SubLProcess.currentSubLThread();
	safely_swap_out_all_pristine_kb_objects(kbom);
	final SubLObject old_cache = kbom_lru_information(kbom);
	SubLObject new_cache = NIL;
	final SubLObject _prev_bind_0 = Storage.$current_area$.currentBinding(thread);
	try {
	    Storage.$current_area$.bind(Storage.get_static_area(), thread);
	    new_cache = cache.new_preallocated_cache(new_size, $kbom_id_equality_test$.getGlobalValue());
	} finally {
	    Storage.$current_area$.rebind(_prev_bind_0, thread);
	}
	if (NIL == cache.cache_empty_p(old_cache)) {
	    final SubLObject cache_var = old_cache;
	    final SubLObject order_var = $OLDEST;
	    SubLObject entry = cache.do_cache_first(cache_var, order_var);
	    SubLObject id = NIL;
	    SubLObject value = NIL;
	    while (NIL == cache.do_cache_doneP(cache_var, entry)) {
		id = cache.do_cache_key(entry);
		value = cache.do_cache_value(entry);
		entry = cache.do_cache_next(entry, order_var);
		cache.cache_set(new_cache, id, id);
	    }
	}
	_csetf_kbom_lru_information(kbom, new_cache);
	_csetf_kbom_lru_size_max(kbom, new_size);
	final SubLObject percentage = divide(new_size, id_index_sparse_id_threshold(kb_object_manager_content_table(kbom)));
	_csetf_kbom_lru_size_percentage(kbom, round(multiply($int$100, percentage), UNPROVIDED));
	return kbom;
    }

    public static final SubLObject new_legacy_kb_object_manager(SubLObject name, SubLObject lru_size_percentage, SubLObject content_table, SubLObject lru_information, SubLObject usage_table, SubLObject load_func) {
	{
	    SubLObject kbom = make_kb_object_manager(UNPROVIDED);
	    _csetf_kbom_name(kbom, name);
	    _csetf_kbom_content_lock(kbom, make_lock(cconcatenate(name, $str_alt58$_content_manager_lock)));
	    _csetf_kbom_lru_size_percentage(kbom, lru_size_percentage);
	    _csetf_kbom_content_table(kbom, content_table);
	    _csetf_kbom_lru_information(kbom, lru_information);
	    _csetf_kbom_usage_table(kbom, usage_table);
	    _csetf_kbom_file_vector(kbom, $UNINITIALIZED);
	    _csetf_kbom_id_threshold(kbom, ZERO_INTEGER);
	    _csetf_kbom_load_func(kbom, load_func);
	    _csetf_kbom_meter_swap_timeP(kbom, NIL);
	    _csetf_kbom_swap_time(kbom, NIL);
	    return kbom;
	}
    }

    public static SubLObject new_legacy_kb_object_manager(final SubLObject name, final SubLObject lru_size_percentage, final SubLObject lru_size_max, final SubLObject content_table, final SubLObject lru_information, final SubLObject usage_table, final SubLObject load_func) {
	final SubLObject kbom = make_kb_object_manager(UNPROVIDED);
	_csetf_kbom_name(kbom, name);
	_csetf_kbom_content_lock(kbom, make_lock(cconcatenate(name, $$$_content_manager_lock)));
	_csetf_kbom_lru_size_percentage(kbom, lru_size_percentage);
	_csetf_kbom_lru_size_max(kbom, lru_size_max);
	_csetf_kbom_content_table(kbom, content_table);
	_csetf_kbom_lru_information(kbom, lru_information);
	_csetf_kbom_usage_table(kbom, usage_table);
	_csetf_kbom_file_vector(kbom, $UNINITIALIZED);
	_csetf_kbom_id_threshold(kbom, ZERO_INTEGER);
	_csetf_kbom_load_func(kbom, load_func);
	_csetf_kbom_meter_swap_timeP(kbom, NIL);
	_csetf_kbom_swap_time(kbom, NIL);
	return kbom;
    }

    public static final SubLObject optimize_kb_object_content_table_alt(SubLObject kbom, SubLObject new_id_threshold) {
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    SubLTrampolineFile.checkType(new_id_threshold, NON_NEGATIVE_INTEGER_P);
	    {
		SubLObject new_size = ceiling(add(new_id_threshold, multiply(new_id_threshold, $float$0_05)), UNPROVIDED);
		SubLObject lock = kb_object_manager_content_lock(kbom);
		SubLObject release = NIL;
		try {
		    release = seize_lock(lock);
		    {
			SubLObject content_table = kb_object_manager_content_table(kbom);
			set_id_index_next_id(content_table, new_id_threshold);
			{
			    SubLObject _prev_bind_0 = Storage.$current_area$.currentBinding(thread);
			    try {
				Storage.$current_area$.bind(Storage.get_static_area(), thread);
				optimize_id_index(content_table, new_size);
			    } finally {
				Storage.$current_area$.rebind(_prev_bind_0, thread);
			    }
			}
		    }
		} finally {
		    if (NIL != release) {
			release_lock(lock);
		    }
		}
		return new_size;
	    }
	}
    }

    public static SubLObject optimize_kb_object_content_table(final SubLObject kbom, final SubLObject sparse_id_threshold) {
	final SubLThread thread = SubLProcess.currentSubLThread();
	assert NIL != subl_promotions.non_negative_integer_p(sparse_id_threshold) : "! subl_promotions.non_negative_integer_p(sparse_id_threshold) "
		+ ("subl_promotions.non_negative_integer_p(sparse_id_threshold) " + "CommonSymbols.NIL != subl_promotions.non_negative_integer_p(sparse_id_threshold) ") + sparse_id_threshold;
	final SubLObject new_size = ceiling(add(sparse_id_threshold, multiply(sparse_id_threshold, $float$0_05)), UNPROVIDED);
	final SubLObject lock = kb_object_manager_content_lock(kbom);
	SubLObject release = NIL;
	try {
	    release = seize_lock(lock);
	    final SubLObject content_table = kb_object_manager_content_table(kbom);
	    set_id_index_next_id(content_table, sparse_id_threshold);
	    final SubLObject _prev_bind_0 = Storage.$current_area$.currentBinding(thread);
	    try {
		Storage.$current_area$.bind(Storage.get_static_area(), thread);
		optimize_id_index(content_table, new_size);
	    } finally {
		Storage.$current_area$.rebind(_prev_bind_0, thread);
	    }
	} finally {
	    if (NIL != release) {
		release_lock(lock);
	    }
	}
	return new_size;
    }

    public static final SubLObject clear_kb_object_content_table_alt(SubLObject kbom) {
	{
	    SubLObject result = NIL;
	    SubLObject lock = kb_object_manager_content_lock(kbom);
	    SubLObject release = NIL;
	    try {
		release = seize_lock(lock);
		{
		    SubLObject usage_table = kb_object_manager_usage_table(kbom);
		    if (NIL != id_index_p(usage_table)) {
			clear_id_index(usage_table);
		    }
		}
		{
		    SubLObject lru_information = kb_object_manager_lru_information(kbom);
		    if (NIL != cache.cache_p(lru_information)) {
			cache.cache_clear(lru_information);
		    }
		}
		{
		    SubLObject content_table = kb_object_manager_content_table(kbom);
		    result = clear_id_index(content_table);
		}
	    } finally {
		if (NIL != release) {
		    release_lock(lock);
		}
	    }
	    return result;
	}
    }

    public static SubLObject clear_kb_object_content_table(final SubLObject kbom) {
	SubLObject result = NIL;
	final SubLObject lock = kb_object_manager_content_lock(kbom);
	SubLObject release = NIL;
	try {
	    release = seize_lock(lock);
	    final SubLObject usage_table = kb_object_manager_usage_table(kbom);
	    if (NIL != id_index_p(usage_table)) {
		clear_id_index(usage_table);
	    }
	    final SubLObject lru_information = kb_object_manager_lru_information(kbom);
	    if (NIL != cache.cache_p(lru_information)) {
		cache.cache_clear(lru_information);
	    }
	    final SubLObject content_table = kb_object_manager_content_table(kbom);
	    result = clear_id_index(content_table);
	} finally {
	    if (NIL != release) {
		release_lock(lock);
	    }
	}
	return result;
    }

    public static final SubLObject kb_object_manager_name_alt(SubLObject kbom) {
	SubLTrampolineFile.checkType(kbom, KB_OBJECT_MANAGER_P);
	return kbom_name(kbom);
    }

    public static SubLObject kb_object_manager_name(final SubLObject kbom) {
	assert NIL != kb_object_manager_p(kbom) : "! kb_object_manager.kb_object_manager_p(kbom) " + ("kb_object_manager.kb_object_manager_p(kbom) " + "CommonSymbols.NIL != kb_object_manager.kb_object_manager_p(kbom) ") + kbom;
	return kbom_name(kbom);
    }

    public static final SubLObject kb_object_manager_content_lock_alt(SubLObject kbom) {
	SubLTrampolineFile.checkType(kbom, KB_OBJECT_MANAGER_P);
	return kbom_content_lock(kbom);
    }

    public static SubLObject kb_object_manager_content_lock(final SubLObject kbom) {
	assert NIL != kb_object_manager_p(kbom) : "! kb_object_manager.kb_object_manager_p(kbom) " + ("kb_object_manager.kb_object_manager_p(kbom) " + "CommonSymbols.NIL != kb_object_manager.kb_object_manager_p(kbom) ") + kbom;
	return kbom_content_lock(kbom);
    }

    public static final SubLObject kb_object_manager_lru_size_percentage_alt(SubLObject kbom) {
	SubLTrampolineFile.checkType(kbom, KB_OBJECT_MANAGER_P);
	return kbom_lru_size_percentage(kbom);
    }

    public static SubLObject kb_object_manager_lru_size_percentage(final SubLObject kbom) {
	assert NIL != kb_object_manager_p(kbom) : "! kb_object_manager.kb_object_manager_p(kbom) " + ("kb_object_manager.kb_object_manager_p(kbom) " + "CommonSymbols.NIL != kb_object_manager.kb_object_manager_p(kbom) ") + kbom;
	return kbom_lru_size_percentage(kbom);
    }

    public static SubLObject kb_object_manager_lru_size_max(final SubLObject kbom) {
	assert NIL != kb_object_manager_p(kbom) : "! kb_object_manager.kb_object_manager_p(kbom) " + ("kb_object_manager.kb_object_manager_p(kbom) " + "CommonSymbols.NIL != kb_object_manager.kb_object_manager_p(kbom) ") + kbom;
	return kbom_lru_size_max(kbom);
    }

    public static final SubLObject kb_object_manager_content_table_alt(SubLObject kbom) {
	SubLTrampolineFile.checkType(kbom, KB_OBJECT_MANAGER_P);
	return kbom_content_table(kbom);
    }

    public static SubLObject kb_object_manager_content_table(final SubLObject kbom) {
	assert NIL != kb_object_manager_p(kbom) : "! kb_object_manager.kb_object_manager_p(kbom) " + ("kb_object_manager.kb_object_manager_p(kbom) " + "CommonSymbols.NIL != kb_object_manager.kb_object_manager_p(kbom) ") + kbom;
	return kbom_content_table(kbom);
    }

    public static final SubLObject kb_object_manager_usage_table_alt(SubLObject kbom) {
	SubLTrampolineFile.checkType(kbom, KB_OBJECT_MANAGER_P);
	return kbom_usage_table(kbom);
    }

    public static SubLObject kb_object_manager_usage_table(final SubLObject kbom) {
	assert NIL != kb_object_manager_p(kbom) : "! kb_object_manager.kb_object_manager_p(kbom) " + ("kb_object_manager.kb_object_manager_p(kbom) " + "CommonSymbols.NIL != kb_object_manager.kb_object_manager_p(kbom) ") + kbom;
	return kbom_usage_table(kbom);
    }

    public static final SubLObject kb_object_manager_lru_information_alt(SubLObject kbom) {
	SubLTrampolineFile.checkType(kbom, KB_OBJECT_MANAGER_P);
	return kbom_lru_information(kbom);
    }

    public static SubLObject kb_object_manager_lru_information(final SubLObject kbom) {
	assert NIL != kb_object_manager_p(kbom) : "! kb_object_manager.kb_object_manager_p(kbom) " + ("kb_object_manager.kb_object_manager_p(kbom) " + "CommonSymbols.NIL != kb_object_manager.kb_object_manager_p(kbom) ") + kbom;
	return kbom_lru_information(kbom);
    }

    public static final SubLObject kb_object_manager_file_vector_alt(SubLObject kbom) {
	SubLTrampolineFile.checkType(kbom, KB_OBJECT_MANAGER_P);
	return kbom_file_vector(kbom);
    }

    public static SubLObject kb_object_manager_file_vector(final SubLObject kbom) {
	assert NIL != kb_object_manager_p(kbom) : "! kb_object_manager.kb_object_manager_p(kbom) " + ("kb_object_manager.kb_object_manager_p(kbom) " + "CommonSymbols.NIL != kb_object_manager.kb_object_manager_p(kbom) ") + kbom;
	return kbom_file_vector(kbom);
    }

    public static final SubLObject kb_object_manager_id_threshold_alt(SubLObject kbom) {
	SubLTrampolineFile.checkType(kbom, KB_OBJECT_MANAGER_P);
	return kbom_id_threshold(kbom);
    }

    public static SubLObject kb_object_manager_id_threshold(final SubLObject kbom) {
	assert NIL != kb_object_manager_p(kbom) : "! kb_object_manager.kb_object_manager_p(kbom) " + ("kb_object_manager.kb_object_manager_p(kbom) " + "CommonSymbols.NIL != kb_object_manager.kb_object_manager_p(kbom) ") + kbom;
	return kbom_id_threshold(kbom);
    }

    public static final SubLObject kb_object_manager_load_func_alt(SubLObject kbom) {
	SubLTrampolineFile.checkType(kbom, KB_OBJECT_MANAGER_P);
	return kbom_load_func(kbom);
    }

    public static SubLObject kb_object_manager_load_func(final SubLObject kbom) {
	assert NIL != kb_object_manager_p(kbom) : "! kb_object_manager.kb_object_manager_p(kbom) " + ("kb_object_manager.kb_object_manager_p(kbom) " + "CommonSymbols.NIL != kb_object_manager.kb_object_manager_p(kbom) ") + kbom;
	return kbom_load_func(kbom);
    }

    public static final SubLObject kb_object_manager_meter_swap_timeP_alt(SubLObject kbom) {
	SubLTrampolineFile.checkType(kbom, KB_OBJECT_MANAGER_P);
	return kbom_meter_swap_timeP(kbom);
    }

    public static SubLObject kb_object_manager_meter_swap_timeP(final SubLObject kbom) {
	assert NIL != kb_object_manager_p(kbom) : "! kb_object_manager.kb_object_manager_p(kbom) " + ("kb_object_manager.kb_object_manager_p(kbom) " + "CommonSymbols.NIL != kb_object_manager.kb_object_manager_p(kbom) ") + kbom;
	return kbom_meter_swap_timeP(kbom);
    }

    public static final SubLObject kb_object_manager_swap_time_alt(SubLObject kbom) {
	SubLTrampolineFile.checkType(kbom, KB_OBJECT_MANAGER_P);
	return kbom_swap_time(kbom);
    }

    public static SubLObject kb_object_manager_swap_time(final SubLObject kbom) {
	assert NIL != kb_object_manager_p(kbom) : "! kb_object_manager.kb_object_manager_p(kbom) " + ("kb_object_manager.kb_object_manager_p(kbom) " + "CommonSymbols.NIL != kb_object_manager.kb_object_manager_p(kbom) ") + kbom;
	return kbom_swap_time(kbom);
    }

    public static SubLObject kb_object_manager_sub_file_vector(final SubLObject kbom) {
	assert NIL != kb_object_manager_p(kbom) : "! kb_object_manager.kb_object_manager_p(kbom) " + ("kb_object_manager.kb_object_manager_p(kbom) " + "CommonSymbols.NIL != kb_object_manager.kb_object_manager_p(kbom) ") + kbom;
	return kbom_sub_file_vector(kbom);
    }

    public static SubLObject set_kb_object_manager_sub_file_vector(final SubLObject kbom, final SubLObject fvector) {
	assert NIL != kb_object_manager_p(kbom) : "! kb_object_manager.kb_object_manager_p(kbom) " + ("kb_object_manager.kb_object_manager_p(kbom) " + "CommonSymbols.NIL != kb_object_manager.kb_object_manager_p(kbom) ") + kbom;
	_csetf_kbom_sub_file_vector(kbom, fvector);
	return kbom;
    }

    public static final SubLObject kb_object_usage_counts_enabledP_alt(SubLObject kbom) {
	return id_index_p(kb_object_manager_usage_table(kbom));
    }

    public static SubLObject kb_object_usage_counts_enabledP(final SubLObject kbom) {
	return id_index_p(kb_object_manager_usage_table(kbom));
    }

    public static final SubLObject cached_kb_object_count_alt(SubLObject kbom) {
	{
	    SubLObject content_table = kb_object_manager_content_table(kbom);
	    if (NIL == id_index_p(content_table)) {
		return ZERO_INTEGER;
	    }
	    return id_index_count(content_table);
	}
    }

    public static SubLObject cached_kb_object_count(final SubLObject kbom) {
	final SubLObject content_table = kb_object_manager_content_table(kbom);
	if (NIL == id_index_p(content_table)) {
	    return ZERO_INTEGER;
	}
	return id_index_count(content_table);
    }

    public static SubLObject swappable_kb_object_count(final SubLObject kbom) {
	return cache.cache_size(kbom_lru_information(kbom));
    }

    public static final SubLObject kb_object_id_cachedP_alt(SubLObject kbom, SubLObject id) {
	return misc_utilities.initialized_p(id_index_lookup(kb_object_manager_content_table(kbom), id, misc_utilities.uninitialized()));
    }

    public static SubLObject kb_object_id_cachedP(final SubLObject kbom, final SubLObject id) {
	return misc_utilities.initialized_p(id_index_lookup(kb_object_manager_content_table(kbom), id, misc_utilities.uninitialized()));
    }

    public static SubLObject kb_object_id_cachableP(final SubLObject kbom, final SubLObject id) {
	return makeBoolean((NIL != misc_utilities.initialized_p(id_index_lookup(kb_object_manager_content_table(kbom), id, misc_utilities.uninitialized()))) || (NIL != is_lru_cachable_kb_object_content_idP(kbom, id)));
    }

    public static final SubLObject lookup_kb_object_content_alt(SubLObject kbom, SubLObject id) {
	{
	    SubLObject content = NIL;
	    SubLObject lock = kb_object_manager_content_lock(kbom);
	    SubLObject release = NIL;
	    try {
		release = seize_lock(lock);
		{
		    SubLObject content_table = kb_object_manager_content_table(kbom);
		    content = id_index_lookup(content_table, id, misc_utilities.uninitialized());
		    if (NIL != misc_utilities.uninitialized_p(content)) {
			if (NIL != is_lru_cachable_kb_object_content_idP(kbom, id)) {
			    swap_in_kb_object_content(kbom, id);
			    content = id_index_lookup(content_table, id, UNPROVIDED);
			} else {
			    content = NIL;
			}
		    } else {
			update_kb_object_usage(kbom, id);
		    }
		}
	    } finally {
		if (NIL != release) {
		    release_lock(lock);
		}
	    }
	    return content;
	}
    }

    public static SubLObject lookup_kb_object_content(final SubLObject kbom, final SubLObject id) {
	final SubLThread thread = SubLProcess.currentSubLThread();
	SubLObject content = NIL;
	final SubLObject lock = kb_object_manager_content_lock(kbom);
	SubLObject release = NIL;
	try {
	    release = seize_lock(lock);
	    final SubLObject content_table = kb_object_manager_content_table(kbom);
	    content = id_index_lookup(content_table, id, misc_utilities.uninitialized());
	    if (NIL != misc_utilities.uninitialized_p(content)) {
		if (NIL != is_lru_cachable_kb_object_content_idP(kbom, id)) {
		    final SubLObject _prev_bind_0 = file_vector_utilities.$cfasl_outer_fvector_for_backed_maps$.currentBinding(thread);
		    try {
			file_vector_utilities.$cfasl_outer_fvector_for_backed_maps$.bind(kb_object_manager_sub_file_vector(kbom), thread);
			swap_in_kb_object_content(kbom, id);
			kb_storage_logging.maybe_kb_storage_log_load(id);
			content = id_index_lookup(content_table, id, UNPROVIDED);
		    } finally {
			file_vector_utilities.$cfasl_outer_fvector_for_backed_maps$.rebind(_prev_bind_0, thread);
		    }
		} else {
		    content = NIL;
		}
	    } else {
		update_kb_object_usage(kbom, id);
	    }
	} finally {
	    if (NIL != release) {
		release_lock(lock);
	    }
	}
	return content;
    }

    public static final SubLObject kb_object_manager_unbuiltP_alt(SubLObject kbom) {
	SubLTrampolineFile.checkType(kbom, KB_OBJECT_MANAGER_P);
	if (NIL != file_vector_p(kb_object_manager_file_vector(kbom))) {
	    return NIL;
	}
	{
	    SubLObject v_id_index = kb_object_manager_content_table(kbom);
	    if ((NIL != id_index_p(v_id_index)) && id_index_count(v_id_index).isPositive()) {
		return NIL;
	    }
	}
	return T;
    }

    public static SubLObject kb_object_manager_unbuiltP(final SubLObject kbom) {
	assert NIL != kb_object_manager_p(kbom) : "! kb_object_manager.kb_object_manager_p(kbom) " + ("kb_object_manager.kb_object_manager_p(kbom) " + "CommonSymbols.NIL != kb_object_manager.kb_object_manager_p(kbom) ") + kbom;
	SubLObject is_file_vectorP = NIL;
	final SubLObject lock = kb_object_manager_content_lock(kbom);
	SubLObject release = NIL;
	try {
	    release = seize_lock(lock);
	    is_file_vectorP = file_vector.file_vector_p(kb_object_manager_file_vector(kbom));
	} finally {
	    if (NIL != release) {
		release_lock(lock);
	    }
	}
	if (NIL != is_file_vectorP) {
	    return NIL;
	}
	final SubLObject v_id_index = kb_object_manager_content_table(kbom);
	if ((NIL != id_index_p(v_id_index)) && id_index_count(v_id_index).isPositive()) {
	    return NIL;
	}
	return T;
    }

    /**
     * Enable the tracking of KB object usage counts.
     */
    @LispMethod(comment = "Enable the tracking of KB object usage counts.")
    public static final SubLObject maintain_kb_object_usage_counts_alt(SubLObject kbom) {
	if (NIL == kb_object_usage_counts_enabledP(kbom)) {
	    {
		SubLObject lock = kb_object_manager_content_lock(kbom);
		SubLObject release = NIL;
		try {
		    release = seize_lock(lock);
		    setup_kb_object_content_support(kbom, T, UNPROVIDED);
		} finally {
		    if (NIL != release) {
			release_lock(lock);
		    }
		}
	    }
	}
	return T;
    }

    /**
     * Enable the tracking of KB object usage counts.
     */
    @LispMethod(comment = "Enable the tracking of KB object usage counts.")
    public static SubLObject maintain_kb_object_usage_counts(final SubLObject kbom) {
	if (NIL == kb_object_usage_counts_enabledP(kbom)) {
	    final SubLObject lock = kb_object_manager_content_lock(kbom);
	    SubLObject release = NIL;
	    try {
		release = seize_lock(lock);
		setup_kb_object_content_support(kbom, T, UNPROVIDED);
	    } finally {
		if (NIL != release) {
		    release_lock(lock);
		}
	    }
	}
	return T;
    }

    /**
     * Disable the tracking of KB object usage counts.
     */
    @LispMethod(comment = "Disable the tracking of KB object usage counts.")
    public static final SubLObject dont_maintain_kb_object_usage_counts_alt(SubLObject kbom) {
	if (NIL != kb_object_usage_counts_enabledP(kbom)) {
	    {
		SubLObject lock = kb_object_manager_content_lock(kbom);
		SubLObject release = NIL;
		try {
		    release = seize_lock(lock);
		    _csetf_kbom_usage_table(kbom, NIL);
		} finally {
		    if (NIL != release) {
			release_lock(lock);
		    }
		}
	    }
	}
	return NIL;
    }

    /**
     * Disable the tracking of KB object usage counts.
     */
    @LispMethod(comment = "Disable the tracking of KB object usage counts.")
    public static SubLObject dont_maintain_kb_object_usage_counts(final SubLObject kbom) {
	if (NIL != kb_object_usage_counts_enabledP(kbom)) {
	    final SubLObject lock = kb_object_manager_content_lock(kbom);
	    SubLObject release = NIL;
	    try {
		release = seize_lock(lock);
		_csetf_kbom_usage_table(kbom, NIL);
	    } finally {
		if (NIL != release) {
		    release_lock(lock);
		}
	    }
	}
	return NIL;
    }

    /**
     * Note that ID will be used as the id for KB-OBJECT-CONTENT.
     */
    @LispMethod(comment = "Note that ID will be used as the id for KB-OBJECT-CONTENT.")
    public static final SubLObject register_kb_object_content_alt(SubLObject kbom, SubLObject id, SubLObject kb_object_content) {
	{
	    SubLObject lock = kb_object_manager_content_lock(kbom);
	    SubLObject release = NIL;
	    try {
		release = seize_lock(lock);
		id_index_enter(kb_object_manager_content_table(kbom), id, kb_object_content);
	    } finally {
		if (NIL != release) {
		    release_lock(lock);
		}
	    }
	}
	return kb_object_content;
    }

    /**
     * Note that ID will be used as the id for KB-OBJECT-CONTENT.
     */
    @LispMethod(comment = "Note that ID will be used as the id for KB-OBJECT-CONTENT.")
    public static SubLObject register_kb_object_content(final SubLObject kbom, final SubLObject id, final SubLObject kb_object_content) {
	final SubLObject lock = kb_object_manager_content_lock(kbom);
	SubLObject release = NIL;
	try {
	    release = seize_lock(lock);
	    id_index_enter(kb_object_manager_content_table(kbom), id, kb_object_content);
	} finally {
	    if (NIL != release) {
		release_lock(lock);
	    }
	}
	return kb_object_content;
    }

    /**
     * Note that ID is not in use as an KB-OBJECT-CONTENT id
     */
    @LispMethod(comment = "Note that ID is not in use as an KB-OBJECT-CONTENT id")
    public static final SubLObject deregister_kb_object_content_alt(SubLObject kbom, SubLObject id) {
	{
	    SubLObject deregistration = NIL;
	    SubLObject lock = kb_object_manager_content_lock(kbom);
	    SubLObject release = NIL;
	    try {
		release = seize_lock(lock);
		deregistration = id_index_remove(kb_object_manager_content_table(kbom), id);
		drop_kb_object_usage(kbom, id);
	    } finally {
		if (NIL != release) {
		    release_lock(lock);
		}
	    }
	    return deregistration;
	}
    }

    /**
     * Note that ID is not in use as an KB-OBJECT-CONTENT id
     */
    @LispMethod(comment = "Note that ID is not in use as an KB-OBJECT-CONTENT id")
    public static SubLObject deregister_kb_object_content(final SubLObject kbom, final SubLObject id) {
	SubLObject deregistration = NIL;
	final SubLObject lock = kb_object_manager_content_lock(kbom);
	SubLObject release = NIL;
	try {
	    release = seize_lock(lock);
	    deregistration = id_index_remove(kb_object_manager_content_table(kbom), id);
	    drop_kb_object_usage(kbom, id);
	} finally {
	    if (NIL != release) {
		release_lock(lock);
	    }
	}
	return deregistration;
    }

    public static final SubLObject new_kb_object_content_file_vector(SubLObject cfasl_file, SubLObject index_file) {
	return new_file_vector(cfasl_file, index_file, UNPROVIDED);
    }

    public static SubLObject new_kb_object_content_file_vector(final SubLObject cfasl_file, final SubLObject index_file, SubLObject mark_file) {
	if (mark_file == UNPROVIDED) {
	    mark_file = NIL;
	}
	if (NIL == list_utilities.sublisp_boolean(mark_file)) {
	    return file_vector.new_file_vector(cfasl_file, index_file, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
	}
	return file_vector.new_wide_input_file_vector(cfasl_file, index_file, mark_file, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject kb_object_content_file_vector_cfasl_stream_alt(SubLObject v_file_vector) {
	return get_file_vector_data_stream(v_file_vector);
    }

    public static SubLObject kb_object_content_file_vector_cfasl_stream(final SubLObject v_file_vector) {
	return file_vector.get_file_vector_data_stream(v_file_vector);
    }

    public static final SubLObject kb_object_content_file_vector_p_alt(SubLObject v_object) {
	return file_vector_p(v_object);
    }

    public static SubLObject kb_object_content_file_vector_p(final SubLObject v_object) {
	return file_vector.file_vector_p(v_object);
    }

    public static final SubLObject kb_object_content_file_vector_lookup_alt(SubLObject kbom, SubLObject id) {
	{
	    SubLObject cfasl_stream = position_file_vector(kb_object_manager_file_vector(kbom), id);
	    SubLObject kb_object_id = cfasl_input(cfasl_stream, UNPROVIDED, UNPROVIDED);
	    if (!(kb_object_id.isFixnum() && kb_object_id.numE(id))) {
		Errors.error($str_alt66$We_did_not_manage_to_swap_the_KB_, id, cfasl_stream, kb_object_id);
	    }
	    {
		SubLObject load_func = kb_object_manager_load_func(kbom);
		funcall(load_func, id, cfasl_stream);
	    }
	}
	return id;
    }

    public static SubLObject kb_object_content_file_vector_lookup(final SubLObject kbom, final SubLObject id) {
	final SubLObject cfasl_stream = file_vector.position_file_vector(kb_object_manager_file_vector(kbom), id);
	final SubLObject kb_object_id = cfasl_input(cfasl_stream, UNPROVIDED, UNPROVIDED);
	if (!kb_object_id.eql(id)) {
	    final SubLObject index_spot = file_position(file_vector.get_file_vector_index_stream(kb_object_manager_file_vector(kbom)), UNPROVIDED);
	    if (NIL != subl_promotions.non_negative_integer_p(kb_object_id)) {
		Errors.error($str72$Failed_to_swap_in_KB_object__A_ba, new SubLObject[] { id, cfasl_stream, kb_object_id, index_spot });
	    } else {
		Errors.error($str73$We_expected_KB_object_ID__A_from_, new SubLObject[] { id, cfasl_stream, kb_object_id, type_of(kb_object_id), index_spot });
	    }
	}
	final SubLObject load_func = kb_object_manager_load_func(kbom);
	funcall(load_func, id, cfasl_stream);
	return id;
    }

    public static SubLObject wide_kb_object_managerP(final SubLObject kbom) {
	return file_vector.wide_file_vectorP(kb_object_manager_file_vector(kbom));
    }

    public static SubLObject wide_kb_object_sub_managerP(final SubLObject kbom) {
	final SubLObject sub_fvector = kb_object_manager_sub_file_vector(kbom);
	return makeBoolean((NIL != file_vector.file_vector_p(sub_fvector)) && (NIL != file_vector.wide_file_vectorP(sub_fvector)));
    }

    public static SubLObject serialize_kbom_lru_information(final SubLObject kbom, final SubLObject directory) {
	final SubLThread thread = SubLProcess.currentSubLThread();
	final SubLObject filename = kbom_lru_info_filename(kbom, directory);
	final SubLObject lru_information = kb_object_manager_lru_information(kbom);
	SubLObject stream = NIL;
	try {
	    final SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding(thread);
	    try {
		stream_macros.$stream_requires_locking$.bind(NIL, thread);
		stream = compatibility.open_binary(filename, $OUTPUT);
	    } finally {
		stream_macros.$stream_requires_locking$.rebind(_prev_bind_0, thread);
	    }
	    if (!stream.isStream()) {
		Errors.error($str76$Unable_to_open__S, filename);
	    }
	    final SubLObject s = stream;
	    if (NIL != cache.cache_p(lru_information)) {
		cfasl_output(cache.cache_keys(lru_information), s);
	    }
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
	return filename;
    }

    public static SubLObject precache_kbom_by_lru_information(final SubLObject kbom, final SubLObject directory) {
	final SubLThread thread = SubLProcess.currentSubLThread();
	final SubLObject filename = kbom_lru_info_filename(kbom, directory);
	final SubLObject lru_information = kb_object_manager_lru_information(kbom);
	if (NIL != cache.cache_p(lru_information)) {
	    SubLObject stream = NIL;
	    try {
		final SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding(thread);
		try {
		    stream_macros.$stream_requires_locking$.bind(NIL, thread);
		    stream = compatibility.open_binary(filename, $INPUT);
		} finally {
		    stream_macros.$stream_requires_locking$.rebind(_prev_bind_0, thread);
		}
		if (!stream.isStream()) {
		    Errors.error($str76$Unable_to_open__S, filename);
		}
		final SubLObject s = stream;
		final SubLObject lru_ordered_ids = cfasl_input(s, UNPROVIDED, UNPROVIDED);
		SubLObject cdolist_list_var;
		final SubLObject page_ordered_ids = cdolist_list_var = Sort.sort(copy_list(lru_ordered_ids), symbol_function($sym79$_), UNPROVIDED);
		SubLObject id = NIL;
		id = cdolist_list_var.first();
		while (NIL != cdolist_list_var) {
		    lookup_kb_object_content(kbom, id);
		    cdolist_list_var = cdolist_list_var.rest();
		    id = cdolist_list_var.first();
		}
		cdolist_list_var = nreverse(lru_ordered_ids);
		id = NIL;
		id = cdolist_list_var.first();
		while (NIL != cdolist_list_var) {
		    update_kb_object_usage(kbom, id);
		    cdolist_list_var = cdolist_list_var.rest();
		    id = cdolist_list_var.first();
		}
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
	}
	return filename;
    }

    public static SubLObject kbom_lru_info_filename(final SubLObject kbom, final SubLObject directory) {
	return cconcatenate(directory, new SubLObject[] { kbom_name(kbom), $str80$_lru_info_for_, operation_communication.kb_loaded_string(), $str81$_cfasl });
    }

    public static final SubLObject is_lru_cachable_kb_object_content_idP_alt(SubLObject kbom, SubLObject id) {
	return numL(id, kb_object_manager_id_threshold(kbom));
    }

    public static SubLObject is_lru_cachable_kb_object_content_idP(final SubLObject kbom, final SubLObject id) {
	return numL(id, kb_object_manager_id_threshold(kbom));
    }

    public static final SubLObject update_kb_object_usage_alt(SubLObject kbom, SubLObject id) {
	if (NIL != kb_object_usage_counts_enabledP(kbom)) {
	    increment_kb_object_usage_count(kbom, id);
	}
	{
	    SubLObject lru_information = kb_object_manager_lru_information(kbom);
	    if (NIL != cache.cache_p(lru_information)) {
		if (NIL != is_lru_cachable_kb_object_content_idP(kbom, id)) {
		    cache.cache_get_without_values(lru_information, id, UNPROVIDED);
		}
	    }
	}
	return id;
    }

    public static SubLObject update_kb_object_usage(final SubLObject kbom, final SubLObject id) {
	if (NIL != kb_object_usage_counts_enabledP(kbom)) {
	    increment_kb_object_usage_count(kbom, id);
	}
	final SubLObject lru_information = kb_object_manager_lru_information(kbom);
	if ((NIL != cache.cache_p(lru_information)) && (NIL != is_lru_cachable_kb_object_content_idP(kbom, id))) {
	    cache.cache_get_without_values(lru_information, id, UNPROVIDED);
	}
	return id;
    }

    public static final SubLObject drop_kb_object_usage_alt(SubLObject kbom, SubLObject id) {
	{
	    SubLObject lru_information = kb_object_manager_lru_information(kbom);
	    if (NIL != cache.cache_p(lru_information)) {
		if (NIL != is_lru_cachable_kb_object_content_idP(kbom, id)) {
		    cache.cache_remove(lru_information, id);
		}
	    }
	}
	return id;
    }

    public static SubLObject drop_kb_object_usage(final SubLObject kbom, final SubLObject id) {
	final SubLObject lru_information = kb_object_manager_lru_information(kbom);
	if ((NIL != cache.cache_p(lru_information)) && (NIL != is_lru_cachable_kb_object_content_idP(kbom, id))) {
	    cache.cache_remove(lru_information, id);
	}
	return id;
    }

    public static final SubLObject mark_kb_object_content_as_muted_alt(SubLObject kbom, SubLObject id) {
	{
	    SubLObject lru_information = kb_object_manager_lru_information(kbom);
	    if (NIL != cache.cache_p(lru_information)) {
		if (NIL != is_lru_cachable_kb_object_content_idP(kbom, id)) {
		    cache.cache_remove(lru_information, id);
		}
	    }
	}
	return id;
    }

    public static SubLObject mark_kb_object_content_as_muted(final SubLObject kbom, final SubLObject id) {
	final SubLObject lock = kb_object_manager_content_lock(kbom);
	SubLObject release = NIL;
	try {
	    release = seize_lock(lock);
	    final SubLObject lru_information = kb_object_manager_lru_information(kbom);
	    if ((NIL != cache.cache_p(lru_information)) && (NIL != is_lru_cachable_kb_object_content_idP(kbom, id))) {
		kb_storage_logging.maybe_kb_storage_log_mutate(id);
		cache.cache_remove(lru_information, id);
	    }
	} finally {
	    if (NIL != release) {
		release_lock(lock);
	    }
	}
	return id;
    }

    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    static private final SubLList $list_alt0 = list(list(makeSymbol("KBOM")), makeSymbol("&BODY"), makeSymbol("BODY"));

    /**
     * Turn metering of KB object content swap time on.
     */
    @LispMethod(comment = "Turn metering of KB object content swap time on.")
    public static final SubLObject meter_kb_object_content_swap_time_alt(SubLObject kbom) {
	_csetf_kbom_meter_swap_timeP(kbom, T);
	return T;
    }

    /**
     * Turn metering of KB object content swap time on.
     */
    @LispMethod(comment = "Turn metering of KB object content swap time on.")
    public static SubLObject meter_kb_object_content_swap_time(final SubLObject kbom) {
	_csetf_kbom_meter_swap_timeP(kbom, T);
	return T;
    }

    static private final SubLList $list_alt5 = list(new SubLObject[] { makeSymbol("NAME"), makeSymbol("CONTENT-LOCK"), makeSymbol("LRU-SIZE-PERCENTAGE"), makeSymbol("CONTENT-TABLE"), makeSymbol("USAGE-TABLE"), makeSymbol("LRU-INFORMATION"), makeSymbol("FILE-VECTOR"), makeSymbol("ID-THRESHOLD"),
	    makeSymbol("LOAD-FUNC"), makeSymbol("METER-SWAP-TIME?"), makeSymbol("SWAP-TIME"), makeSymbol("DUMMY1"), makeSymbol("DUMMY2"), makeSymbol("DUMMY3") });

    /**
     * Turn metering of KB object content swap time off.
     */
    @LispMethod(comment = "Turn metering of KB object content swap time off.")
    public static final SubLObject dont_meter_kb_object_content_swap_time_alt(SubLObject kbom) {
	_csetf_kbom_meter_swap_timeP(kbom, NIL);
	return NIL;
    }

    /**
     * Turn metering of KB object content swap time off.
     */
    @LispMethod(comment = "Turn metering of KB object content swap time off.")
    public static SubLObject dont_meter_kb_object_content_swap_time(final SubLObject kbom) {
	_csetf_kbom_meter_swap_timeP(kbom, NIL);
	return NIL;
    }

    public static final SubLObject clear_kb_object_content_swap_time_alt(SubLObject kbom) {
	_csetf_kbom_swap_time(kbom, ZERO_INTEGER);
	return ZERO_INTEGER;
    }

    public static SubLObject clear_kb_object_content_swap_time(final SubLObject kbom) {
	_csetf_kbom_swap_time(kbom, ZERO_INTEGER);
	return ZERO_INTEGER;
    }

    /**
     * Give the ID of the first KB object that is not backed by any file.
     *
     * @return NON-NEGATIVE-INTEGER-P
     */
    @LispMethod(comment = "Give the ID of the first KB object that is not backed by any file.\r\n\r\n@return NON-NEGATIVE-INTEGER-P")
    public static final SubLObject get_file_backed_kb_object_id_threshold_alt(SubLObject kbom) {
	return kb_object_manager_id_threshold(kbom);
    }

    /**
     * Give the ID of the first KB object that is not backed by any file.
     *
     * @return NON-NEGATIVE-INTEGER-P
     */
    @LispMethod(comment = "Give the ID of the first KB object that is not backed by any file.\r\n\r\n@return NON-NEGATIVE-INTEGER-P")
    public static SubLObject get_file_backed_kb_object_id_threshold(final SubLObject kbom) {
	return kb_object_manager_id_threshold(kbom);
    }

    static private final SubLList $list_alt6 = list(new SubLObject[] { $NAME, makeKeyword("CONTENT-LOCK"), makeKeyword("LRU-SIZE-PERCENTAGE"), makeKeyword("CONTENT-TABLE"), makeKeyword("USAGE-TABLE"), makeKeyword("LRU-INFORMATION"), makeKeyword("FILE-VECTOR"),
	    makeKeyword("ID-THRESHOLD"), makeKeyword("LOAD-FUNC"), makeKeyword("METER-SWAP-TIME?"), makeKeyword("SWAP-TIME"), makeKeyword("DUMMY1"), makeKeyword("DUMMY2"), makeKeyword("DUMMY3") });

    public static final SubLObject swap_in_kb_object_content_alt(SubLObject kbom, SubLObject id) {
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    {
		SubLObject _prev_bind_0 = api_control_vars.$cfasl_constant_handle_lookup_func$.currentBinding(thread);
		SubLObject _prev_bind_1 = api_control_vars.$cfasl_nart_handle_lookup_func$.currentBinding(thread);
		SubLObject _prev_bind_2 = api_control_vars.$cfasl_assertion_handle_lookup_func$.currentBinding(thread);
		SubLObject _prev_bind_3 = api_control_vars.$cfasl_deduction_handle_lookup_func$.currentBinding(thread);
		SubLObject _prev_bind_4 = api_control_vars.$cfasl_kb_hl_support_handle_lookup_func$.currentBinding(thread);
		SubLObject _prev_bind_5 = api_control_vars.$cfasl_clause_struc_handle_lookup_func$.currentBinding(thread);
		try {
		    api_control_vars.$cfasl_constant_handle_lookup_func$.bind(NIL, thread);
		    api_control_vars.$cfasl_nart_handle_lookup_func$.bind(NIL, thread);
		    api_control_vars.$cfasl_assertion_handle_lookup_func$.bind(NIL, thread);
		    api_control_vars.$cfasl_deduction_handle_lookup_func$.bind(NIL, thread);
		    api_control_vars.$cfasl_kb_hl_support_handle_lookup_func$.bind(NIL, thread);
		    api_control_vars.$cfasl_clause_struc_handle_lookup_func$.bind(NIL, thread);
		    if (NIL != kb_object_manager_meter_swap_timeP(kbom)) {
			swap_in_kb_object_content_metered(kbom, id);
		    } else {
			swap_in_kb_object_content_internal(kbom, id);
		    }
		} finally {
		    api_control_vars.$cfasl_clause_struc_handle_lookup_func$.rebind(_prev_bind_5, thread);
		    api_control_vars.$cfasl_kb_hl_support_handle_lookup_func$.rebind(_prev_bind_4, thread);
		    api_control_vars.$cfasl_deduction_handle_lookup_func$.rebind(_prev_bind_3, thread);
		    api_control_vars.$cfasl_assertion_handle_lookup_func$.rebind(_prev_bind_2, thread);
		    api_control_vars.$cfasl_nart_handle_lookup_func$.rebind(_prev_bind_1, thread);
		    api_control_vars.$cfasl_constant_handle_lookup_func$.rebind(_prev_bind_0, thread);
		}
	    }
	    return id;
	}
    }

    public static SubLObject swap_in_kb_object_content(final SubLObject kbom, final SubLObject id) {
	final SubLThread thread = SubLProcess.currentSubLThread();
	final SubLObject _prev_bind_0 = api_control_vars.$cfasl_constant_handle_lookup_func$.currentBinding(thread);
	final SubLObject _prev_bind_2 = api_control_vars.$cfasl_nart_handle_lookup_func$.currentBinding(thread);
	final SubLObject _prev_bind_3 = api_control_vars.$cfasl_assertion_handle_lookup_func$.currentBinding(thread);
	final SubLObject _prev_bind_4 = api_control_vars.$cfasl_deduction_handle_lookup_func$.currentBinding(thread);
	final SubLObject _prev_bind_5 = api_control_vars.$cfasl_kb_hl_support_handle_lookup_func$.currentBinding(thread);
	final SubLObject _prev_bind_6 = api_control_vars.$cfasl_clause_struc_handle_lookup_func$.currentBinding(thread);
	try {
	    api_control_vars.$cfasl_constant_handle_lookup_func$.bind(NIL, thread);
	    api_control_vars.$cfasl_nart_handle_lookup_func$.bind(NIL, thread);
	    api_control_vars.$cfasl_assertion_handle_lookup_func$.bind(NIL, thread);
	    api_control_vars.$cfasl_deduction_handle_lookup_func$.bind(NIL, thread);
	    api_control_vars.$cfasl_kb_hl_support_handle_lookup_func$.bind(NIL, thread);
	    api_control_vars.$cfasl_clause_struc_handle_lookup_func$.bind(NIL, thread);
	    if (NIL != kb_object_manager_meter_swap_timeP(kbom)) {
		swap_in_kb_object_content_metered(kbom, id);
	    } else {
		swap_in_kb_object_content_internal(kbom, id);
	    }
	} finally {
	    api_control_vars.$cfasl_clause_struc_handle_lookup_func$.rebind(_prev_bind_6, thread);
	    api_control_vars.$cfasl_kb_hl_support_handle_lookup_func$.rebind(_prev_bind_5, thread);
	    api_control_vars.$cfasl_deduction_handle_lookup_func$.rebind(_prev_bind_4, thread);
	    api_control_vars.$cfasl_assertion_handle_lookup_func$.rebind(_prev_bind_3, thread);
	    api_control_vars.$cfasl_nart_handle_lookup_func$.rebind(_prev_bind_2, thread);
	    api_control_vars.$cfasl_constant_handle_lookup_func$.rebind(_prev_bind_0, thread);
	}
	return id;
    }

    static private final SubLList $list_alt7 = list(new SubLObject[] { makeSymbol("KBOM-NAME"), makeSymbol("KBOM-CONTENT-LOCK"), makeSymbol("KBOM-LRU-SIZE-PERCENTAGE"), makeSymbol("KBOM-CONTENT-TABLE"), makeSymbol("KBOM-USAGE-TABLE"), makeSymbol("KBOM-LRU-INFORMATION"),
	    makeSymbol("KBOM-FILE-VECTOR"), makeSymbol("KBOM-ID-THRESHOLD"), makeSymbol("KBOM-LOAD-FUNC"), makeSymbol("KBOM-METER-SWAP-TIME?"), makeSymbol("KBOM-SWAP-TIME"), makeSymbol("KBOM-DUMMY1"), makeSymbol("KBOM-DUMMY2"), makeSymbol("KBOM-DUMMY3") });

    static private final SubLList $list_alt8 = list(new SubLObject[] { makeSymbol("_CSETF-KBOM-NAME"), makeSymbol("_CSETF-KBOM-CONTENT-LOCK"), makeSymbol("_CSETF-KBOM-LRU-SIZE-PERCENTAGE"), makeSymbol("_CSETF-KBOM-CONTENT-TABLE"), makeSymbol("_CSETF-KBOM-USAGE-TABLE"),
	    makeSymbol("_CSETF-KBOM-LRU-INFORMATION"), makeSymbol("_CSETF-KBOM-FILE-VECTOR"), makeSymbol("_CSETF-KBOM-ID-THRESHOLD"), makeSymbol("_CSETF-KBOM-LOAD-FUNC"), makeSymbol("_CSETF-KBOM-METER-SWAP-TIME?"), makeSymbol("_CSETF-KBOM-SWAP-TIME"), makeSymbol("_CSETF-KBOM-DUMMY1"),
	    makeSymbol("_CSETF-KBOM-DUMMY2"), makeSymbol("_CSETF-KBOM-DUMMY3") });

    public static final SubLObject swap_in_kb_object_content_metered_alt(SubLObject kbom, SubLObject id) {
	{
	    SubLObject time = NIL;
	    SubLObject time_var = get_internal_real_time();
	    swap_in_kb_object_content_internal(kbom, id);
	    time = divide(subtract(get_internal_real_time(), time_var), time_high.$internal_time_units_per_second$.getGlobalValue());
	    _csetf_kbom_swap_time(kbom, add(kbom_swap_time(kbom), time));
	}
	return id;
    }

    public static SubLObject swap_in_kb_object_content_metered(final SubLObject kbom, final SubLObject id) {
	SubLObject time = NIL;
	final SubLObject time_var = get_internal_real_time();
	swap_in_kb_object_content_internal(kbom, id);
	time = divide(subtract(get_internal_real_time(), time_var), time_high.$internal_time_units_per_second$.getGlobalValue());
	_csetf_kbom_swap_time(kbom, add(kbom_swap_time(kbom), time));
	return id;
    }

    public static final SubLObject swap_in_kb_object_content_internal_alt(SubLObject kbom, SubLObject id) {
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    {
		SubLObject _prev_bind_0 = $cfasl_common_symbols$.currentBinding(thread);
		try {
		    $cfasl_common_symbols$.bind(NIL, thread);
		    cfasl_set_common_symbols(misc_utilities.get_hl_store_caches_shared_symbols());
		    kb_object_content_file_vector_lookup(kbom, id);
		} finally {
		    $cfasl_common_symbols$.rebind(_prev_bind_0, thread);
		}
	    }
	    increment_kb_object_usage_count(kbom, id);
	    thread.resetMultipleValues();
	    {
		SubLObject loser = cache.cache_set_return_dropped(kb_object_manager_lru_information(kbom), id, id);
		SubLObject oldest_value = thread.secondMultipleValue();
		SubLObject pairP = thread.thirdMultipleValue();
		thread.resetMultipleValues();
		if (loser.isFixnum()) {
		    swap_out_pristine_kb_object_content(kbom, loser);
		}
	    }
	    return id;
	}
    }

    public static SubLObject swap_in_kb_object_content_internal(final SubLObject kbom, final SubLObject id) {
	final SubLThread thread = SubLProcess.currentSubLThread();
	final SubLObject _prev_bind_0 = $cfasl_common_symbols$.currentBinding(thread);
	try {
	    $cfasl_common_symbols$.bind(NIL, thread);
	    cfasl_set_common_symbols_simple(misc_utilities.get_hl_store_caches_shared_symbols_simple());
	    kb_object_content_file_vector_lookup(kbom, id);
	} finally {
	    $cfasl_common_symbols$.rebind(_prev_bind_0, thread);
	}
	increment_kb_object_usage_count(kbom, id);
	thread.resetMultipleValues();
	final SubLObject loser = cache.cache_set_return_dropped(kb_object_manager_lru_information(kbom), id, id);
	final SubLObject oldest_value = thread.secondMultipleValue();
	final SubLObject pairP = thread.thirdMultipleValue();
	thread.resetMultipleValues();
	if (loser.isFixnum()) {
	    swap_out_pristine_kb_object_content(kbom, loser);
	}
	return id;
    }

    static private final SubLSymbol $sym29$KBOM_METER_SWAP_TIME_ = makeSymbol("KBOM-METER-SWAP-TIME?");

    static private final SubLSymbol $sym30$_CSETF_KBOM_METER_SWAP_TIME_ = makeSymbol("_CSETF-KBOM-METER-SWAP-TIME?");

    private static final SubLSymbol KBOM_DUMMY1 = makeSymbol("KBOM-DUMMY1");

    public static final SubLSymbol _CSETF_KBOM_DUMMY1 = makeSymbol("_CSETF-KBOM-DUMMY1");

    public static final SubLObject swap_out_pristine_kb_object_content_alt(SubLObject kbom, SubLObject loser) {
	id_index_remove(kb_object_manager_content_table(kbom), loser);
	return loser;
    }

    public static SubLObject swap_out_pristine_kb_object_content(final SubLObject kbom, final SubLObject loser) {
	id_index_remove(kb_object_manager_content_table(kbom), loser);
	kb_storage_logging.maybe_kb_storage_log_page_out(loser);
	return loser;
    }

    private static final SubLSymbol KBOM_DUMMY2 = makeSymbol("KBOM-DUMMY2");

    public static final SubLSymbol _CSETF_KBOM_DUMMY2 = makeSymbol("_CSETF-KBOM-DUMMY2");

    public static SubLObject safely_swap_out_all_pristine_kb_objects(final SubLObject kbom) {
	SubLObject paged_out = NIL;
	final SubLObject lock = kb_object_manager_content_lock(kbom);
	SubLObject release = NIL;
	try {
	    release = seize_lock(lock);
	    paged_out = swap_out_all_pristine_kb_objects_int(kbom);
	} finally {
	    if (NIL != release) {
		release_lock(lock);
	    }
	}
	return paged_out;
    }

    public static final SubLSymbol $kw48$METER_SWAP_TIME_ = makeKeyword("METER-SWAP-TIME?");

    private static final SubLSymbol $DUMMY1 = makeKeyword("DUMMY1");

    private static final SubLSymbol $DUMMY2 = makeKeyword("DUMMY2");

    static private final SubLString $str_alt53$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");

    public static final SubLObject swap_out_all_pristine_kb_objects_int_alt(SubLObject kbom) {
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    {
		SubLObject pristine_ids = NIL;
		SubLObject lru_information = kb_object_manager_lru_information(kbom);
		{
		    SubLObject cache_var = lru_information;
		    SubLObject order_var = $NEWEST;
		    SubLObject entry = cache.do_cache_first(cache_var, order_var);
		    SubLObject id = NIL;
		    SubLObject value = NIL;
		    while (NIL == cache.do_cache_doneP(cache_var, entry)) {
			id = cache.do_cache_key(entry);
			value = cache.do_cache_value(entry);
			entry = cache.do_cache_next(entry, order_var);
			pristine_ids = cons(id, pristine_ids);
		    }
		}
		pristine_ids = Sort.sort(pristine_ids, symbol_function($sym68$_), UNPROVIDED);
		{
		    SubLObject list_var = pristine_ids;
		    $progress_note$.setDynamicValue(cconcatenate($str_alt69$Swapping_out_, new SubLObject[] { kb_object_manager_name(kbom), $str_alt70$_objects }), thread);
		    $progress_start_time$.setDynamicValue(get_universal_time(), thread);
		    $progress_total$.setDynamicValue(length(list_var), thread);
		    $progress_sofar$.setDynamicValue(ZERO_INTEGER, thread);
		    {
			SubLObject _prev_bind_0 = $last_percent_progress_index$.currentBinding(thread);
			SubLObject _prev_bind_1 = $last_percent_progress_prediction$.currentBinding(thread);
			SubLObject _prev_bind_2 = $within_noting_percent_progress$.currentBinding(thread);
			SubLObject _prev_bind_3 = $percent_progress_start_time$.currentBinding(thread);
			try {
			    $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
			    $last_percent_progress_prediction$.bind(NIL, thread);
			    $within_noting_percent_progress$.bind(T, thread);
			    $percent_progress_start_time$.bind(get_universal_time(), thread);
			    noting_percent_progress_preamble($progress_note$.getDynamicValue(thread));
			    {
				SubLObject csome_list_var = list_var;
				SubLObject id = NIL;
				for (id = csome_list_var.first(); NIL != csome_list_var; csome_list_var = csome_list_var.rest(), id = csome_list_var.first()) {
				    note_percent_progress($progress_sofar$.getDynamicValue(thread), $progress_total$.getDynamicValue(thread));
				    $progress_sofar$.setDynamicValue(add($progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
				    cache.cache_remove(lru_information, id);
				    swap_out_pristine_kb_object_content(kbom, id);
				}
			    }
			    noting_percent_progress_postamble();
			} finally {
			    $percent_progress_start_time$.rebind(_prev_bind_3, thread);
			    $within_noting_percent_progress$.rebind(_prev_bind_2, thread);
			    $last_percent_progress_prediction$.rebind(_prev_bind_1, thread);
			    $last_percent_progress_index$.rebind(_prev_bind_0, thread);
			}
		    }
		}
		return length(pristine_ids);
	    }
	}
    }

    public static SubLObject swap_out_all_pristine_kb_objects_int(final SubLObject kbom) {
	final SubLThread thread = SubLProcess.currentSubLThread();
	SubLObject pristine_ids = NIL;
	final SubLObject cache_var;
	final SubLObject lru_information = cache_var = kb_object_manager_lru_information(kbom);
	final SubLObject order_var = $NEWEST;
	SubLObject entry = cache.do_cache_first(cache_var, order_var);
	SubLObject id = NIL;
	SubLObject value = NIL;
	while (NIL == cache.do_cache_doneP(cache_var, entry)) {
	    id = cache.do_cache_key(entry);
	    value = cache.do_cache_value(entry);
	    entry = cache.do_cache_next(entry, order_var);
	    pristine_ids = cons(id, pristine_ids);
	}
	final SubLObject list_var;
	pristine_ids = list_var = Sort.sort(pristine_ids, symbol_function($sym79$_), UNPROVIDED);
	final SubLObject _prev_bind_0 = $progress_note$.currentBinding(thread);
	final SubLObject _prev_bind_2 = $progress_start_time$.currentBinding(thread);
	final SubLObject _prev_bind_3 = $progress_total$.currentBinding(thread);
	final SubLObject _prev_bind_4 = $progress_sofar$.currentBinding(thread);
	final SubLObject _prev_bind_5 = $last_percent_progress_index$.currentBinding(thread);
	final SubLObject _prev_bind_6 = $last_percent_progress_prediction$.currentBinding(thread);
	final SubLObject _prev_bind_7 = $within_noting_percent_progress$.currentBinding(thread);
	final SubLObject _prev_bind_8 = $percent_progress_start_time$.currentBinding(thread);
	try {
	    $progress_note$.bind(NIL != cconcatenate($$$Swapping_out_, new SubLObject[] { kb_object_manager_name(kbom), $$$_objects }) ? cconcatenate($$$Swapping_out_, new SubLObject[] { kb_object_manager_name(kbom), $$$_objects }) : $$$cdolist, thread);
	    $progress_start_time$.bind(get_universal_time(), thread);
	    $progress_total$.bind(length(list_var), thread);
	    $progress_sofar$.bind(ZERO_INTEGER, thread);
	    $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
	    $last_percent_progress_prediction$.bind(NIL, thread);
	    $within_noting_percent_progress$.bind(T, thread);
	    $percent_progress_start_time$.bind(get_universal_time(), thread);
	    try {
		noting_percent_progress_preamble($progress_note$.getDynamicValue(thread));
		SubLObject csome_list_var = list_var;
		SubLObject id2 = NIL;
		id2 = csome_list_var.first();
		while (NIL != csome_list_var) {
		    cache.cache_remove(lru_information, id2);
		    swap_out_pristine_kb_object_content(kbom, id2);
		    final SubLObject valueSF = add($progress_sofar$.getDynamicValue(thread), ONE_INTEGER);
		    $progress_sofar$.setDynamicValue(valueSF, thread);
		    note_percent_progress(valueSF, $progress_total$.getDynamicValue(thread));
		    csome_list_var = csome_list_var.rest();
		    id2 = csome_list_var.first();
		}
	    } finally {
		final SubLObject _prev_bind_0_$1 = $is_thread_performing_cleanupP$.currentBinding(thread);
		try {
		    $is_thread_performing_cleanupP$.bind(T, thread);
		    final SubLObject _values = getValuesAsVector();
		    noting_percent_progress_postamble();
		    restoreValuesFromVector(_values);
		} finally {
		    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$1, thread);
		}
	    }
	} finally {
	    $percent_progress_start_time$.rebind(_prev_bind_8, thread);
	    $within_noting_percent_progress$.rebind(_prev_bind_7, thread);
	    $last_percent_progress_prediction$.rebind(_prev_bind_6, thread);
	    $last_percent_progress_index$.rebind(_prev_bind_5, thread);
	    $progress_sofar$.rebind(_prev_bind_4, thread);
	    $progress_total$.rebind(_prev_bind_3, thread);
	    $progress_start_time$.rebind(_prev_bind_2, thread);
	    $progress_note$.rebind(_prev_bind_0, thread);
	}
	return length(pristine_ids);
    }

    static private final SubLString $str_alt58$_content_manager_lock = makeString(" content manager lock");

    static private final SubLString $$$cfasl = makeString("cfasl");

    static private final SubLString $str_alt63$Got__s__expected_an_extensionless = makeString("Got ~s, expected an extensionless filename");

    static private final SubLString $str_alt66$We_did_not_manage_to_swap_the_KB_ = makeString("We did not manage to swap the KB object ~D back in from the CFASL stream ~A; got ~D instead.");

    static private final SubLSymbol $sym68$_ = makeSymbol("<");

    static private final SubLString $str_alt69$Swapping_out_ = makeString("Swapping out ");

    static private final SubLString $str_alt70$_objects = makeString(" objects");

    static private final SubLString $str_alt71$Verifying_integrity_of_ = makeString("Verifying integrity of ");

    static private final SubLString $str_alt72$_content_table = makeString(" content table");

    static private final SubLString $str_alt74$Entry__a_is_invalid___a__repairin = makeString("Entry ~a is invalid: ~a, repairing");

    static private final SubLString $str_alt75$Entry__a_is_invalid___a = makeString("Entry ~a is invalid: ~a");

    public static final SubLObject increment_kb_object_usage_count_alt(SubLObject kbom, SubLObject id) {
	if (NIL != kb_object_usage_counts_enabledP(kbom)) {
	    {
		SubLObject usage_table = kb_object_manager_usage_table(kbom);
		SubLObject old_counter = id_index_lookup(usage_table, id, UNPROVIDED);
		SubLObject new_counter = (NIL != old_counter) ? ((SubLObject) (number_utilities.f_1X(old_counter))) : ONE_INTEGER;
		id_index_enter(usage_table, id, new_counter);
		return id;
	    }
	}
	return NIL;
    }

    public static SubLObject increment_kb_object_usage_count(final SubLObject kbom, final SubLObject id) {
	if (NIL != kb_object_usage_counts_enabledP(kbom)) {
	    final SubLObject usage_table = kb_object_manager_usage_table(kbom);
	    final SubLObject old_counter = id_index_lookup(usage_table, id, UNPROVIDED);
	    final SubLObject new_counter = (NIL != old_counter) ? number_utilities.f_1X(old_counter) : ONE_INTEGER;
	    id_index_enter(usage_table, id, new_counter);
	    return id;
	}
	return NIL;
    }

    public static SubLObject new_muted_kb_object_iterator(final SubLObject kbom) {
	return iteration.new_filter_iterator(new_id_index_dense_objects_iterator(kb_object_manager_content_table(kbom)), $sym86$IS_MUTED_KB_OBJECT_, list(kbom));
    }

    public static SubLObject is_muted_kb_objectP(final SubLObject tuple, final SubLObject kbom) {
	SubLObject id = NIL;
	SubLObject payload = NIL;
	destructuring_bind_must_consp(tuple, tuple, $list87);
	id = tuple.first();
	SubLObject current = tuple.rest();
	destructuring_bind_must_consp(current, tuple, $list87);
	payload = current.first();
	current = current.rest();
	if (NIL == current) {
	    return makeBoolean((NIL != is_lru_cachable_kb_object_content_idP(kbom, id)) && (NIL == cache.cache_contains_key_p(kb_object_manager_lru_information(kbom), id)));
	}
	cdestructuring_bind_error(tuple, $list87);
	return NIL;
    }

    /**
     *
     *
     * @param REPAIR?
     * 		booleanp; whether to repair any errors found in the kb-object content table
     * @return 0 booleanp; whether the kb-object content table is valid
     * @return 1 integerp; the number of invalid entries found in the table
     */
    @LispMethod(comment = "@param REPAIR?\r\n\t\tbooleanp; whether to repair any errors found in the kb-object content table\r\n@return 0 booleanp; whether the kb-object content table is valid\r\n@return 1 integerp; the number of invalid entries found in the table")
    public static final SubLObject verify_kb_object_content_table_int_alt(SubLObject kbom, SubLObject type_pred, SubLObject repairP) {
	if (repairP == UNPROVIDED) {
	    repairP = NIL;
	}
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    {
		SubLObject invalid_count = ZERO_INTEGER;
		SubLObject progress_message = cconcatenate($str_alt71$Verifying_integrity_of_, new SubLObject[] { kb_object_manager_name(kbom), $str_alt72$_content_table });
		SubLObject idx = kb_object_manager_content_table(kbom);
		SubLObject total = id_index_count(idx);
		SubLObject sofar = ZERO_INTEGER;
		SubLTrampolineFile.checkType(progress_message, STRINGP);
		{
		    SubLObject _prev_bind_0 = $last_percent_progress_index$.currentBinding(thread);
		    SubLObject _prev_bind_1 = $last_percent_progress_prediction$.currentBinding(thread);
		    SubLObject _prev_bind_2 = $within_noting_percent_progress$.currentBinding(thread);
		    SubLObject _prev_bind_3 = $percent_progress_start_time$.currentBinding(thread);
		    try {
			$last_percent_progress_index$.bind(ZERO_INTEGER, thread);
			$last_percent_progress_prediction$.bind(NIL, thread);
			$within_noting_percent_progress$.bind(T, thread);
			$percent_progress_start_time$.bind(get_universal_time(), thread);
			noting_percent_progress_preamble(progress_message);
			if (NIL == do_id_index_empty_p(idx, $SKIP)) {
			    {
				SubLObject id = do_id_index_next_id(idx, NIL, NIL, NIL);
				SubLObject state_var = do_id_index_next_state(idx, NIL, id, NIL);
				SubLObject content = NIL;
				while (NIL != id) {
				    content = do_id_index_state_object(idx, $SKIP, id, state_var);
				    if (NIL != do_id_index_id_and_object_validP(id, content, $SKIP)) {
					note_percent_progress(sofar, total);
					sofar = add(sofar, ONE_INTEGER);
					if (!((NIL == content) || (NIL != funcall(type_pred, content)))) {
					    invalid_count = add(invalid_count, ONE_INTEGER);
					    if (NIL != repairP) {
						Errors.warn($str_alt74$Entry__a_is_invalid___a__repairin, id, content);
						swap_out_pristine_kb_object_content(kbom, id);
					    } else {
						Errors.warn($str_alt75$Entry__a_is_invalid___a, id, content);
					    }
					}
				    }
				    id = do_id_index_next_id(idx, NIL, id, state_var);
				    state_var = do_id_index_next_state(idx, NIL, id, state_var);
				}
			    }
			}
			noting_percent_progress_postamble();
		    } finally {
			$percent_progress_start_time$.rebind(_prev_bind_3, thread);
			$within_noting_percent_progress$.rebind(_prev_bind_2, thread);
			$last_percent_progress_prediction$.rebind(_prev_bind_1, thread);
			$last_percent_progress_index$.rebind(_prev_bind_0, thread);
		    }
		}
		return values(numE(invalid_count, ZERO_INTEGER), invalid_count);
	    }
	}
    }

    /**
     *
     *
     * @param REPAIR?
     * 		booleanp; whether to repair any errors found in the kb-object content table
     * @return 0 booleanp; whether the kb-object content table is valid
     * @return 1 integerp; the number of invalid entries found in the table
     */
    @LispMethod(comment = "@param REPAIR?\r\n\t\tbooleanp; whether to repair any errors found in the kb-object content table\r\n@return 0 booleanp; whether the kb-object content table is valid\r\n@return 1 integerp; the number of invalid entries found in the table")
    public static SubLObject verify_kb_object_content_table_int(final SubLObject kbom, final SubLObject type_pred, SubLObject repairP) {
	if (repairP == UNPROVIDED) {
	    repairP = NIL;
	}
	final SubLThread thread = SubLProcess.currentSubLThread();
	SubLObject invalid_count = ZERO_INTEGER;
	final SubLObject progress_message = cconcatenate($$$Verifying_integrity_of_, new SubLObject[] { kb_object_manager_name(kbom), $$$_content_table });
	final SubLObject idx = kb_object_manager_content_table(kbom);
	final SubLObject mess = progress_message;
	final SubLObject total = id_index_count(idx);
	SubLObject sofar = ZERO_INTEGER;
	assert NIL != stringp(mess) : "! stringp(mess) " + ("Types.stringp(mess) " + "CommonSymbols.NIL != Types.stringp(mess) ") + mess;
	final SubLObject _prev_bind_0 = $last_percent_progress_index$.currentBinding(thread);
	final SubLObject _prev_bind_2 = $last_percent_progress_prediction$.currentBinding(thread);
	final SubLObject _prev_bind_3 = $within_noting_percent_progress$.currentBinding(thread);
	final SubLObject _prev_bind_4 = $percent_progress_start_time$.currentBinding(thread);
	try {
	    $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
	    $last_percent_progress_prediction$.bind(NIL, thread);
	    $within_noting_percent_progress$.bind(T, thread);
	    $percent_progress_start_time$.bind(get_universal_time(), thread);
	    try {
		noting_percent_progress_preamble(mess);
		final SubLObject idx_$2 = idx;
		if (NIL == id_index_objects_empty_p(idx_$2, $SKIP)) {
		    final SubLObject idx_$3 = idx_$2;
		    if (NIL == id_index_dense_objects_empty_p(idx_$3, $SKIP)) {
			final SubLObject vector_var = id_index_dense_objects(idx_$3);
			final SubLObject backwardP_var = NIL;
			SubLObject length;
			SubLObject v_iteration;
			SubLObject id;
			SubLObject content;
			for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
			    id = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
			    content = aref(vector_var, id);
			    if ((NIL == id_index_tombstone_p(content)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
				if (NIL != id_index_tombstone_p(content)) {
				    content = $SKIP;
				}
				if ((NIL != content) && (NIL == funcall(type_pred, content))) {
				    invalid_count = add(invalid_count, ONE_INTEGER);
				    if (NIL != repairP) {
					Errors.warn($str91$Entry__a_is_invalid___a__repairin, id, content);
					swap_out_pristine_kb_object_content(kbom, id);
				    } else {
					Errors.warn($str92$Entry__a_is_invalid___a, id, content);
				    }
				}
				sofar = add(sofar, ONE_INTEGER);
				note_percent_progress(sofar, total);
			    }
			}
		    }
		    final SubLObject idx_$4 = idx_$2;
		    if (NIL == id_index_sparse_objects_empty_p(idx_$4)) {
			final SubLObject cdohash_table = id_index_sparse_objects(idx_$4);
			SubLObject id2 = NIL;
			SubLObject content2 = NIL;
			final Iterator cdohash_iterator = getEntrySetIterator(cdohash_table);
			try {
			    while (iteratorHasNext(cdohash_iterator)) {
				final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
				id2 = getEntryKey(cdohash_entry);
				content2 = getEntryValue(cdohash_entry);
				if ((NIL != content2) && (NIL == funcall(type_pred, content2))) {
				    invalid_count = add(invalid_count, ONE_INTEGER);
				    if (NIL != repairP) {
					Errors.warn($str91$Entry__a_is_invalid___a__repairin, id2, content2);
					swap_out_pristine_kb_object_content(kbom, id2);
				    } else {
					Errors.warn($str92$Entry__a_is_invalid___a, id2, content2);
				    }
				}
				sofar = add(sofar, ONE_INTEGER);
				note_percent_progress(sofar, total);
			    }
			} finally {
			    releaseEntrySetIterator(cdohash_iterator);
			}
		    }
		}
	    } finally {
		final SubLObject _prev_bind_0_$5 = $is_thread_performing_cleanupP$.currentBinding(thread);
		try {
		    $is_thread_performing_cleanupP$.bind(T, thread);
		    final SubLObject _values = getValuesAsVector();
		    noting_percent_progress_postamble();
		    restoreValuesFromVector(_values);
		} finally {
		    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$5, thread);
		}
	    }
	} finally {
	    $percent_progress_start_time$.rebind(_prev_bind_4, thread);
	    $within_noting_percent_progress$.rebind(_prev_bind_3, thread);
	    $last_percent_progress_prediction$.rebind(_prev_bind_2, thread);
	    $last_percent_progress_index$.rebind(_prev_bind_0, thread);
	}
	return values(numE(invalid_count, ZERO_INTEGER), invalid_count);
    }

    public static SubLObject with_kbom_fully_loaded(final SubLObject macroform, final SubLObject environment) {
	SubLObject current;
	final SubLObject datum = current = macroform.rest();
	destructuring_bind_must_consp(current, datum, $list0);
	final SubLObject temp = current.rest();
	current = current.first();
	SubLObject kbom = NIL;
	destructuring_bind_must_consp(current, datum, $list0);
	kbom = current.first();
	current = current.rest();
	if (NIL == current) {
	    final SubLObject body;
	    current = body = temp;
	    final SubLObject manager = $sym93$MANAGER;
	    final SubLObject maintaining_countsP = $sym94$MAINTAINING_COUNTS_;
	    final SubLObject memory_mappedP = $sym95$MEMORY_MAPPED_;
	    return list(CLET, list(list(manager, kbom), list(maintaining_countsP, list($sym97$KB_OBJECT_USAGE_COUNTS_ENABLED_, manager)), list(memory_mappedP, list($sym98$KB_OBJECT_MANAGER_MEMORY_MAPPED_, manager))),
		    list(CUNWIND_PROTECT, listS(PROGN, list(DONT_MAINTAIN_KB_OBJECT_USAGE_COUNTS, manager), list(KB_OBJECT_MANAGER_ENABLE_MEMORY_MAPPING, manager), append(body, NIL)),
			    list(PROGN, list(PWHEN, maintaining_countsP, list(MAINTAIN_KB_OBJECT_USAGE_COUNTS, manager)), list(PWHEN, list(CNOT, memory_mappedP), listS(KB_OBJECT_MANAGER_CHANGE_STREAM_BUFFER_SIZES, manager, $list107)))));
	}
	cdestructuring_bind_error(datum, $list0);
	return NIL;
    }

    public static SubLObject segment_kb_object_manager_data(final SubLObject kbom, SubLObject stream, SubLObject include_idP) {
	if (stream == UNPROVIDED) {
	    stream = StreamsLow.$standard_output$.getDynamicValue();
	}
	if (include_idP == UNPROVIDED) {
	    include_idP = NIL;
	}
	final SubLObject fvector = kbom_file_vector(kbom);
	file_vector_utilities.segment_file_vector_data_stream(fvector, stream, include_idP);
	return kbom;
    }

    public static SubLObject inspect_kb_object_manager_data(final SubLObject kbom, final SubLObject id) {
	final SubLObject fvector = kbom_file_vector(kbom);
	return file_vector_utilities.inspect_file_vector_data_record(fvector, id);
    }

    public static final SubLObject declare_kb_object_manager_file_alt() {
	declareMacro("with_kb_object_manager_lock_held", "WITH-KB-OBJECT-MANAGER-LOCK-HELD");
	declareFunction("kb_object_manager_print_function_trampoline", "KB-OBJECT-MANAGER-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
	declareFunction("kb_object_manager_p", "KB-OBJECT-MANAGER-P", 1, 0, false);
	new $kb_object_manager_p$UnaryFunction();
	declareFunction("kbom_name", "KBOM-NAME", 1, 0, false);
	declareFunction("kbom_content_lock", "KBOM-CONTENT-LOCK", 1, 0, false);
	declareFunction("kbom_lru_size_percentage", "KBOM-LRU-SIZE-PERCENTAGE", 1, 0, false);
	declareFunction("kbom_content_table", "KBOM-CONTENT-TABLE", 1, 0, false);
	declareFunction("kbom_usage_table", "KBOM-USAGE-TABLE", 1, 0, false);
	declareFunction("kbom_lru_information", "KBOM-LRU-INFORMATION", 1, 0, false);
	declareFunction("kbom_file_vector", "KBOM-FILE-VECTOR", 1, 0, false);
	declareFunction("kbom_id_threshold", "KBOM-ID-THRESHOLD", 1, 0, false);
	declareFunction("kbom_load_func", "KBOM-LOAD-FUNC", 1, 0, false);
	declareFunction("kbom_meter_swap_timeP", "KBOM-METER-SWAP-TIME?", 1, 0, false);
	declareFunction("kbom_swap_time", "KBOM-SWAP-TIME", 1, 0, false);
	declareFunction("kbom_dummy1", "KBOM-DUMMY1", 1, 0, false);
	declareFunction("kbom_dummy2", "KBOM-DUMMY2", 1, 0, false);
	declareFunction("kbom_dummy3", "KBOM-DUMMY3", 1, 0, false);
	declareFunction("_csetf_kbom_name", "_CSETF-KBOM-NAME", 2, 0, false);
	declareFunction("_csetf_kbom_content_lock", "_CSETF-KBOM-CONTENT-LOCK", 2, 0, false);
	declareFunction("_csetf_kbom_lru_size_percentage", "_CSETF-KBOM-LRU-SIZE-PERCENTAGE", 2, 0, false);
	declareFunction("_csetf_kbom_content_table", "_CSETF-KBOM-CONTENT-TABLE", 2, 0, false);
	declareFunction("_csetf_kbom_usage_table", "_CSETF-KBOM-USAGE-TABLE", 2, 0, false);
	declareFunction("_csetf_kbom_lru_information", "_CSETF-KBOM-LRU-INFORMATION", 2, 0, false);
	declareFunction("_csetf_kbom_file_vector", "_CSETF-KBOM-FILE-VECTOR", 2, 0, false);
	declareFunction("_csetf_kbom_id_threshold", "_CSETF-KBOM-ID-THRESHOLD", 2, 0, false);
	declareFunction("_csetf_kbom_load_func", "_CSETF-KBOM-LOAD-FUNC", 2, 0, false);
	declareFunction("_csetf_kbom_meter_swap_timeP", "_CSETF-KBOM-METER-SWAP-TIME?", 2, 0, false);
	declareFunction("_csetf_kbom_swap_time", "_CSETF-KBOM-SWAP-TIME", 2, 0, false);
	declareFunction("_csetf_kbom_dummy1", "_CSETF-KBOM-DUMMY1", 2, 0, false);
	declareFunction("_csetf_kbom_dummy2", "_CSETF-KBOM-DUMMY2", 2, 0, false);
	declareFunction("_csetf_kbom_dummy3", "_CSETF-KBOM-DUMMY3", 2, 0, false);
	declareFunction("make_kb_object_manager", "MAKE-KB-OBJECT-MANAGER", 0, 1, false);
	declareFunction("new_kb_object_manager", "NEW-KB-OBJECT-MANAGER", 5, 0, false);
	declareFunction("setup_kb_object_content_table", "SETUP-KB-OBJECT-CONTENT-TABLE", 3, 0, false);
	declareFunction("setup_kb_object_content_support", "SETUP-KB-OBJECT-CONTENT-SUPPORT", 1, 2, false);
	declareFunction("initialize_kb_object_hl_store_cache", "INITIALIZE-KB-OBJECT-HL-STORE-CACHE", 3, 0, false);
	declareFunction("new_legacy_kb_object_manager", "NEW-LEGACY-KB-OBJECT-MANAGER", 6, 0, false);
	declareFunction("optimize_kb_object_content_table", "OPTIMIZE-KB-OBJECT-CONTENT-TABLE", 2, 0, false);
	declareFunction("clear_kb_object_content_table", "CLEAR-KB-OBJECT-CONTENT-TABLE", 1, 0, false);
	declareFunction("kb_object_manager_name", "KB-OBJECT-MANAGER-NAME", 1, 0, false);
	declareFunction("kb_object_manager_content_lock", "KB-OBJECT-MANAGER-CONTENT-LOCK", 1, 0, false);
	declareFunction("kb_object_manager_lru_size_percentage", "KB-OBJECT-MANAGER-LRU-SIZE-PERCENTAGE", 1, 0, false);
	declareFunction("kb_object_manager_content_table", "KB-OBJECT-MANAGER-CONTENT-TABLE", 1, 0, false);
	declareFunction("kb_object_manager_usage_table", "KB-OBJECT-MANAGER-USAGE-TABLE", 1, 0, false);
	declareFunction("kb_object_manager_lru_information", "KB-OBJECT-MANAGER-LRU-INFORMATION", 1, 0, false);
	declareFunction("kb_object_manager_file_vector", "KB-OBJECT-MANAGER-FILE-VECTOR", 1, 0, false);
	declareFunction("kb_object_manager_id_threshold", "KB-OBJECT-MANAGER-ID-THRESHOLD", 1, 0, false);
	declareFunction("kb_object_manager_load_func", "KB-OBJECT-MANAGER-LOAD-FUNC", 1, 0, false);
	declareFunction("kb_object_manager_meter_swap_timeP", "KB-OBJECT-MANAGER-METER-SWAP-TIME?", 1, 0, false);
	declareFunction("kb_object_manager_swap_time", "KB-OBJECT-MANAGER-SWAP-TIME", 1, 0, false);
	declareFunction("kb_object_usage_counts_enabledP", "KB-OBJECT-USAGE-COUNTS-ENABLED?", 1, 0, false);
	declareFunction("cached_kb_object_count", "CACHED-KB-OBJECT-COUNT", 1, 0, false);
	declareFunction("kb_object_id_cachedP", "KB-OBJECT-ID-CACHED?", 2, 0, false);
	declareFunction("lookup_kb_object_content", "LOOKUP-KB-OBJECT-CONTENT", 2, 0, false);
	declareFunction("kb_object_manager_unbuiltP", "KB-OBJECT-MANAGER-UNBUILT?", 1, 0, false);
	declareFunction("maintain_kb_object_usage_counts", "MAINTAIN-KB-OBJECT-USAGE-COUNTS", 1, 0, false);
	declareFunction("dont_maintain_kb_object_usage_counts", "DONT-MAINTAIN-KB-OBJECT-USAGE-COUNTS", 1, 0, false);
	declareFunction("register_kb_object_content", "REGISTER-KB-OBJECT-CONTENT", 3, 0, false);
	declareFunction("deregister_kb_object_content", "DEREGISTER-KB-OBJECT-CONTENT", 2, 0, false);
	declareFunction("new_kb_object_content_file_vector", "NEW-KB-OBJECT-CONTENT-FILE-VECTOR", 2, 0, false);
	declareFunction("kb_object_content_file_vector_cfasl_stream", "KB-OBJECT-CONTENT-FILE-VECTOR-CFASL-STREAM", 1, 0, false);
	declareFunction("kb_object_content_file_vector_p", "KB-OBJECT-CONTENT-FILE-VECTOR-P", 1, 0, false);
	declareFunction("kb_object_content_file_vector_lookup", "KB-OBJECT-CONTENT-FILE-VECTOR-LOOKUP", 2, 0, false);
	declareFunction("is_lru_cachable_kb_object_content_idP", "IS-LRU-CACHABLE-KB-OBJECT-CONTENT-ID?", 2, 0, false);
	declareFunction("update_kb_object_usage", "UPDATE-KB-OBJECT-USAGE", 2, 0, false);
	declareFunction("drop_kb_object_usage", "DROP-KB-OBJECT-USAGE", 2, 0, false);
	declareFunction("mark_kb_object_content_as_muted", "MARK-KB-OBJECT-CONTENT-AS-MUTED", 2, 0, false);
	declareFunction("meter_kb_object_content_swap_time", "METER-KB-OBJECT-CONTENT-SWAP-TIME", 1, 0, false);
	declareFunction("dont_meter_kb_object_content_swap_time", "DONT-METER-KB-OBJECT-CONTENT-SWAP-TIME", 1, 0, false);
	declareFunction("clear_kb_object_content_swap_time", "CLEAR-KB-OBJECT-CONTENT-SWAP-TIME", 1, 0, false);
	declareFunction("get_file_backed_kb_object_id_threshold", "GET-FILE-BACKED-KB-OBJECT-ID-THRESHOLD", 1, 0, false);
	declareFunction("swap_in_kb_object_content", "SWAP-IN-KB-OBJECT-CONTENT", 2, 0, false);
	declareFunction("swap_in_kb_object_content_metered", "SWAP-IN-KB-OBJECT-CONTENT-METERED", 2, 0, false);
	declareFunction("swap_in_kb_object_content_internal", "SWAP-IN-KB-OBJECT-CONTENT-INTERNAL", 2, 0, false);
	declareFunction("swap_out_pristine_kb_object_content", "SWAP-OUT-PRISTINE-KB-OBJECT-CONTENT", 2, 0, false);
	declareFunction("swap_out_all_pristine_kb_objects_int", "SWAP-OUT-ALL-PRISTINE-KB-OBJECTS-INT", 1, 0, false);
	declareFunction("increment_kb_object_usage_count", "INCREMENT-KB-OBJECT-USAGE-COUNT", 2, 0, false);
	declareFunction("verify_kb_object_content_table_int", "VERIFY-KB-OBJECT-CONTENT-TABLE-INT", 2, 1, false);
	return NIL;
    }

    public static SubLObject declare_kb_object_manager_file() {
	if (SubLFiles.USE_V1) {
	    declareMacro("with_kb_object_manager_lock_held", "WITH-KB-OBJECT-MANAGER-LOCK-HELD");
	    declareFunction("kb_object_manager_print_function_trampoline", "KB-OBJECT-MANAGER-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
	    declareFunction("kb_object_manager_p", "KB-OBJECT-MANAGER-P", 1, 0, false);
	    new kb_object_manager.$kb_object_manager_p$UnaryFunction();
	    declareFunction("kbom_name", "KBOM-NAME", 1, 0, false);
	    declareFunction("kbom_content_lock", "KBOM-CONTENT-LOCK", 1, 0, false);
	    declareFunction("kbom_lru_size_percentage", "KBOM-LRU-SIZE-PERCENTAGE", 1, 0, false);
	    declareFunction("kbom_content_table", "KBOM-CONTENT-TABLE", 1, 0, false);
	    declareFunction("kbom_usage_table", "KBOM-USAGE-TABLE", 1, 0, false);
	    declareFunction("kbom_lru_information", "KBOM-LRU-INFORMATION", 1, 0, false);
	    declareFunction("kbom_file_vector", "KBOM-FILE-VECTOR", 1, 0, false);
	    declareFunction("kbom_id_threshold", "KBOM-ID-THRESHOLD", 1, 0, false);
	    declareFunction("kbom_load_func", "KBOM-LOAD-FUNC", 1, 0, false);
	    declareFunction("kbom_meter_swap_timeP", "KBOM-METER-SWAP-TIME?", 1, 0, false);
	    declareFunction("kbom_swap_time", "KBOM-SWAP-TIME", 1, 0, false);
	    declareFunction("kbom_lru_size_max", "KBOM-LRU-SIZE-MAX", 1, 0, false);
	    declareFunction("kbom_sub_file_vector", "KBOM-SUB-FILE-VECTOR", 1, 0, false);
	    declareFunction("kbom_dummy3", "KBOM-DUMMY3", 1, 0, false);
	    declareFunction("_csetf_kbom_name", "_CSETF-KBOM-NAME", 2, 0, false);
	    declareFunction("_csetf_kbom_content_lock", "_CSETF-KBOM-CONTENT-LOCK", 2, 0, false);
	    declareFunction("_csetf_kbom_lru_size_percentage", "_CSETF-KBOM-LRU-SIZE-PERCENTAGE", 2, 0, false);
	    declareFunction("_csetf_kbom_content_table", "_CSETF-KBOM-CONTENT-TABLE", 2, 0, false);
	    declareFunction("_csetf_kbom_usage_table", "_CSETF-KBOM-USAGE-TABLE", 2, 0, false);
	    declareFunction("_csetf_kbom_lru_information", "_CSETF-KBOM-LRU-INFORMATION", 2, 0, false);
	    declareFunction("_csetf_kbom_file_vector", "_CSETF-KBOM-FILE-VECTOR", 2, 0, false);
	    declareFunction("_csetf_kbom_id_threshold", "_CSETF-KBOM-ID-THRESHOLD", 2, 0, false);
	    declareFunction("_csetf_kbom_load_func", "_CSETF-KBOM-LOAD-FUNC", 2, 0, false);
	    declareFunction("_csetf_kbom_meter_swap_timeP", "_CSETF-KBOM-METER-SWAP-TIME?", 2, 0, false);
	    declareFunction("_csetf_kbom_swap_time", "_CSETF-KBOM-SWAP-TIME", 2, 0, false);
	    declareFunction("_csetf_kbom_lru_size_max", "_CSETF-KBOM-LRU-SIZE-MAX", 2, 0, false);
	    declareFunction("_csetf_kbom_sub_file_vector", "_CSETF-KBOM-SUB-FILE-VECTOR", 2, 0, false);
	    declareFunction("_csetf_kbom_dummy3", "_CSETF-KBOM-DUMMY3", 2, 0, false);
	    declareFunction("make_kb_object_manager", "MAKE-KB-OBJECT-MANAGER", 0, 1, false);
	    declareFunction("visit_defstruct_kb_object_manager", "VISIT-DEFSTRUCT-KB-OBJECT-MANAGER", 2, 0, false);
	    declareFunction("visit_defstruct_object_kb_object_manager_method", "VISIT-DEFSTRUCT-OBJECT-KB-OBJECT-MANAGER-METHOD", 2, 0, false);
	    declareFunction("new_kb_object_manager", "NEW-KB-OBJECT-MANAGER", 6, 0, false);
	    declareFunction("kb_object_manager_change_stream_buffer_sizes", "KB-OBJECT-MANAGER-CHANGE-STREAM-BUFFER-SIZES", 3, 0, false);
	    declareFunction("kb_object_manager_enable_memory_mapping", "KB-OBJECT-MANAGER-ENABLE-MEMORY-MAPPING", 1, 0, false);
	    declareFunction("kb_object_manager_memory_mappedP", "KB-OBJECT-MANAGER-MEMORY-MAPPED?", 1, 0, false);
	    declareFunction("setup_kb_object_content_table", "SETUP-KB-OBJECT-CONTENT-TABLE", 3, 0, false);
	    declareFunction("setup_kb_object_content_support", "SETUP-KB-OBJECT-CONTENT-SUPPORT", 1, 2, false);
	    declareFunction("compute_kbom_lru_size", "COMPUTE-KBOM-LRU-SIZE", 2, 0, false);
	    declareFunction("initialize_kb_object_hl_store_cache", "INITIALIZE-KB-OBJECT-HL-STORE-CACHE", 3, 2, false);
	    declareFunction("resize_kbom_lru_cache_from_percentage_and_max", "RESIZE-KBOM-LRU-CACHE-FROM-PERCENTAGE-AND-MAX", 3, 0, false);
	    declareFunction("resize_kbom_lru_cache", "RESIZE-KBOM-LRU-CACHE", 2, 0, false);
	    declareFunction("new_legacy_kb_object_manager", "NEW-LEGACY-KB-OBJECT-MANAGER", 7, 0, false);
	    declareFunction("optimize_kb_object_content_table", "OPTIMIZE-KB-OBJECT-CONTENT-TABLE", 2, 0, false);
	    declareFunction("clear_kb_object_content_table", "CLEAR-KB-OBJECT-CONTENT-TABLE", 1, 0, false);
	    declareFunction("kb_object_manager_name", "KB-OBJECT-MANAGER-NAME", 1, 0, false);
	    declareFunction("kb_object_manager_content_lock", "KB-OBJECT-MANAGER-CONTENT-LOCK", 1, 0, false);
	    declareFunction("kb_object_manager_lru_size_percentage", "KB-OBJECT-MANAGER-LRU-SIZE-PERCENTAGE", 1, 0, false);
	    declareFunction("kb_object_manager_lru_size_max", "KB-OBJECT-MANAGER-LRU-SIZE-MAX", 1, 0, false);
	    declareFunction("kb_object_manager_content_table", "KB-OBJECT-MANAGER-CONTENT-TABLE", 1, 0, false);
	    declareFunction("kb_object_manager_usage_table", "KB-OBJECT-MANAGER-USAGE-TABLE", 1, 0, false);
	    declareFunction("kb_object_manager_lru_information", "KB-OBJECT-MANAGER-LRU-INFORMATION", 1, 0, false);
	    declareFunction("kb_object_manager_file_vector", "KB-OBJECT-MANAGER-FILE-VECTOR", 1, 0, false);
	    declareFunction("kb_object_manager_id_threshold", "KB-OBJECT-MANAGER-ID-THRESHOLD", 1, 0, false);
	    declareFunction("kb_object_manager_load_func", "KB-OBJECT-MANAGER-LOAD-FUNC", 1, 0, false);
	    declareFunction("kb_object_manager_meter_swap_timeP", "KB-OBJECT-MANAGER-METER-SWAP-TIME?", 1, 0, false);
	    declareFunction("kb_object_manager_swap_time", "KB-OBJECT-MANAGER-SWAP-TIME", 1, 0, false);
	    declareFunction("kb_object_manager_sub_file_vector", "KB-OBJECT-MANAGER-SUB-FILE-VECTOR", 1, 0, false);
	    declareFunction("set_kb_object_manager_sub_file_vector", "SET-KB-OBJECT-MANAGER-SUB-FILE-VECTOR", 2, 0, false);
	    declareFunction("kb_object_usage_counts_enabledP", "KB-OBJECT-USAGE-COUNTS-ENABLED?", 1, 0, false);
	    declareFunction("cached_kb_object_count", "CACHED-KB-OBJECT-COUNT", 1, 0, false);
	    declareFunction("swappable_kb_object_count", "SWAPPABLE-KB-OBJECT-COUNT", 1, 0, false);
	    declareFunction("kb_object_id_cachedP", "KB-OBJECT-ID-CACHED?", 2, 0, false);
	    declareFunction("kb_object_id_cachableP", "KB-OBJECT-ID-CACHABLE?", 2, 0, false);
	    declareFunction("lookup_kb_object_content", "LOOKUP-KB-OBJECT-CONTENT", 2, 0, false);
	    declareFunction("kb_object_manager_unbuiltP", "KB-OBJECT-MANAGER-UNBUILT?", 1, 0, false);
	    declareFunction("maintain_kb_object_usage_counts", "MAINTAIN-KB-OBJECT-USAGE-COUNTS", 1, 0, false);
	    declareFunction("dont_maintain_kb_object_usage_counts", "DONT-MAINTAIN-KB-OBJECT-USAGE-COUNTS", 1, 0, false);
	    declareFunction("register_kb_object_content", "REGISTER-KB-OBJECT-CONTENT", 3, 0, false);
	    declareFunction("deregister_kb_object_content", "DEREGISTER-KB-OBJECT-CONTENT", 2, 0, false);
	    declareFunction("new_kb_object_content_file_vector", "NEW-KB-OBJECT-CONTENT-FILE-VECTOR", 2, 1, false);
	    declareFunction("kb_object_content_file_vector_cfasl_stream", "KB-OBJECT-CONTENT-FILE-VECTOR-CFASL-STREAM", 1, 0, false);
	    declareFunction("kb_object_content_file_vector_p", "KB-OBJECT-CONTENT-FILE-VECTOR-P", 1, 0, false);
	    declareFunction("kb_object_content_file_vector_lookup", "KB-OBJECT-CONTENT-FILE-VECTOR-LOOKUP", 2, 0, false);
	    declareFunction("wide_kb_object_managerP", "WIDE-KB-OBJECT-MANAGER?", 1, 0, false);
	    declareFunction("wide_kb_object_sub_managerP", "WIDE-KB-OBJECT-SUB-MANAGER?", 1, 0, false);
	    declareFunction("serialize_kbom_lru_information", "SERIALIZE-KBOM-LRU-INFORMATION", 2, 0, false);
	    declareFunction("precache_kbom_by_lru_information", "PRECACHE-KBOM-BY-LRU-INFORMATION", 2, 0, false);
	    declareFunction("kbom_lru_info_filename", "KBOM-LRU-INFO-FILENAME", 2, 0, false);
	    declareFunction("is_lru_cachable_kb_object_content_idP", "IS-LRU-CACHABLE-KB-OBJECT-CONTENT-ID?", 2, 0, false);
	    declareFunction("update_kb_object_usage", "UPDATE-KB-OBJECT-USAGE", 2, 0, false);
	    declareFunction("drop_kb_object_usage", "DROP-KB-OBJECT-USAGE", 2, 0, false);
	    declareFunction("mark_kb_object_content_as_muted", "MARK-KB-OBJECT-CONTENT-AS-MUTED", 2, 0, false);
	    declareFunction("meter_kb_object_content_swap_time", "METER-KB-OBJECT-CONTENT-SWAP-TIME", 1, 0, false);
	    declareFunction("dont_meter_kb_object_content_swap_time", "DONT-METER-KB-OBJECT-CONTENT-SWAP-TIME", 1, 0, false);
	    declareFunction("clear_kb_object_content_swap_time", "CLEAR-KB-OBJECT-CONTENT-SWAP-TIME", 1, 0, false);
	    declareFunction("get_file_backed_kb_object_id_threshold", "GET-FILE-BACKED-KB-OBJECT-ID-THRESHOLD", 1, 0, false);
	    declareFunction("swap_in_kb_object_content", "SWAP-IN-KB-OBJECT-CONTENT", 2, 0, false);
	    declareFunction("swap_in_kb_object_content_metered", "SWAP-IN-KB-OBJECT-CONTENT-METERED", 2, 0, false);
	    declareFunction("swap_in_kb_object_content_internal", "SWAP-IN-KB-OBJECT-CONTENT-INTERNAL", 2, 0, false);
	    declareFunction("swap_out_pristine_kb_object_content", "SWAP-OUT-PRISTINE-KB-OBJECT-CONTENT", 2, 0, false);
	    declareFunction("safely_swap_out_all_pristine_kb_objects", "SAFELY-SWAP-OUT-ALL-PRISTINE-KB-OBJECTS", 1, 0, false);
	    declareFunction("swap_out_all_pristine_kb_objects_int", "SWAP-OUT-ALL-PRISTINE-KB-OBJECTS-INT", 1, 0, false);
	    declareFunction("increment_kb_object_usage_count", "INCREMENT-KB-OBJECT-USAGE-COUNT", 2, 0, false);
	    declareFunction("new_muted_kb_object_iterator", "NEW-MUTED-KB-OBJECT-ITERATOR", 1, 0, false);
	    declareFunction("is_muted_kb_objectP", "IS-MUTED-KB-OBJECT?", 2, 0, false);
	    declareFunction("verify_kb_object_content_table_int", "VERIFY-KB-OBJECT-CONTENT-TABLE-INT", 2, 1, false);
	    declareMacro("with_kbom_fully_loaded", "WITH-KBOM-FULLY-LOADED");
	    declareFunction("segment_kb_object_manager_data", "SEGMENT-KB-OBJECT-MANAGER-DATA", 1, 2, false);
	    declareFunction("inspect_kb_object_manager_data", "INSPECT-KB-OBJECT-MANAGER-DATA", 2, 0, false);
	}
	if (SubLFiles.USE_V2) {
	    declareFunction("kbom_dummy1", "KBOM-DUMMY1", 1, 0, false);
	    declareFunction("kbom_dummy2", "KBOM-DUMMY2", 1, 0, false);
	    declareFunction("_csetf_kbom_dummy1", "_CSETF-KBOM-DUMMY1", 2, 0, false);
	    declareFunction("_csetf_kbom_dummy2", "_CSETF-KBOM-DUMMY2", 2, 0, false);
	    declareFunction("new_kb_object_manager", "NEW-KB-OBJECT-MANAGER", 5, 0, false);
	    declareFunction("initialize_kb_object_hl_store_cache", "INITIALIZE-KB-OBJECT-HL-STORE-CACHE", 3, 0, false);
	    declareFunction("new_legacy_kb_object_manager", "NEW-LEGACY-KB-OBJECT-MANAGER", 6, 0, false);
	    declareFunction("new_kb_object_content_file_vector", "NEW-KB-OBJECT-CONTENT-FILE-VECTOR", 2, 0, false);
	}
	return NIL;
    }

    public static SubLObject declare_kb_object_manager_file_Previous() {
	declareMacro("with_kb_object_manager_lock_held", "WITH-KB-OBJECT-MANAGER-LOCK-HELD");
	declareFunction("kb_object_manager_print_function_trampoline", "KB-OBJECT-MANAGER-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
	declareFunction("kb_object_manager_p", "KB-OBJECT-MANAGER-P", 1, 0, false);
	new kb_object_manager.$kb_object_manager_p$UnaryFunction();
	declareFunction("kbom_name", "KBOM-NAME", 1, 0, false);
	declareFunction("kbom_content_lock", "KBOM-CONTENT-LOCK", 1, 0, false);
	declareFunction("kbom_lru_size_percentage", "KBOM-LRU-SIZE-PERCENTAGE", 1, 0, false);
	declareFunction("kbom_content_table", "KBOM-CONTENT-TABLE", 1, 0, false);
	declareFunction("kbom_usage_table", "KBOM-USAGE-TABLE", 1, 0, false);
	declareFunction("kbom_lru_information", "KBOM-LRU-INFORMATION", 1, 0, false);
	declareFunction("kbom_file_vector", "KBOM-FILE-VECTOR", 1, 0, false);
	declareFunction("kbom_id_threshold", "KBOM-ID-THRESHOLD", 1, 0, false);
	declareFunction("kbom_load_func", "KBOM-LOAD-FUNC", 1, 0, false);
	declareFunction("kbom_meter_swap_timeP", "KBOM-METER-SWAP-TIME?", 1, 0, false);
	declareFunction("kbom_swap_time", "KBOM-SWAP-TIME", 1, 0, false);
	declareFunction("kbom_lru_size_max", "KBOM-LRU-SIZE-MAX", 1, 0, false);
	declareFunction("kbom_sub_file_vector", "KBOM-SUB-FILE-VECTOR", 1, 0, false);
	declareFunction("kbom_dummy3", "KBOM-DUMMY3", 1, 0, false);
	declareFunction("_csetf_kbom_name", "_CSETF-KBOM-NAME", 2, 0, false);
	declareFunction("_csetf_kbom_content_lock", "_CSETF-KBOM-CONTENT-LOCK", 2, 0, false);
	declareFunction("_csetf_kbom_lru_size_percentage", "_CSETF-KBOM-LRU-SIZE-PERCENTAGE", 2, 0, false);
	declareFunction("_csetf_kbom_content_table", "_CSETF-KBOM-CONTENT-TABLE", 2, 0, false);
	declareFunction("_csetf_kbom_usage_table", "_CSETF-KBOM-USAGE-TABLE", 2, 0, false);
	declareFunction("_csetf_kbom_lru_information", "_CSETF-KBOM-LRU-INFORMATION", 2, 0, false);
	declareFunction("_csetf_kbom_file_vector", "_CSETF-KBOM-FILE-VECTOR", 2, 0, false);
	declareFunction("_csetf_kbom_id_threshold", "_CSETF-KBOM-ID-THRESHOLD", 2, 0, false);
	declareFunction("_csetf_kbom_load_func", "_CSETF-KBOM-LOAD-FUNC", 2, 0, false);
	declareFunction("_csetf_kbom_meter_swap_timeP", "_CSETF-KBOM-METER-SWAP-TIME?", 2, 0, false);
	declareFunction("_csetf_kbom_swap_time", "_CSETF-KBOM-SWAP-TIME", 2, 0, false);
	declareFunction("_csetf_kbom_lru_size_max", "_CSETF-KBOM-LRU-SIZE-MAX", 2, 0, false);
	declareFunction("_csetf_kbom_sub_file_vector", "_CSETF-KBOM-SUB-FILE-VECTOR", 2, 0, false);
	declareFunction("_csetf_kbom_dummy3", "_CSETF-KBOM-DUMMY3", 2, 0, false);
	declareFunction("make_kb_object_manager", "MAKE-KB-OBJECT-MANAGER", 0, 1, false);
	declareFunction("visit_defstruct_kb_object_manager", "VISIT-DEFSTRUCT-KB-OBJECT-MANAGER", 2, 0, false);
	declareFunction("visit_defstruct_object_kb_object_manager_method", "VISIT-DEFSTRUCT-OBJECT-KB-OBJECT-MANAGER-METHOD", 2, 0, false);
	declareFunction("new_kb_object_manager", "NEW-KB-OBJECT-MANAGER", 6, 0, false);
	declareFunction("kb_object_manager_change_stream_buffer_sizes", "KB-OBJECT-MANAGER-CHANGE-STREAM-BUFFER-SIZES", 3, 0, false);
	declareFunction("kb_object_manager_enable_memory_mapping", "KB-OBJECT-MANAGER-ENABLE-MEMORY-MAPPING", 1, 0, false);
	declareFunction("kb_object_manager_memory_mappedP", "KB-OBJECT-MANAGER-MEMORY-MAPPED?", 1, 0, false);
	declareFunction("setup_kb_object_content_table", "SETUP-KB-OBJECT-CONTENT-TABLE", 3, 0, false);
	declareFunction("setup_kb_object_content_support", "SETUP-KB-OBJECT-CONTENT-SUPPORT", 1, 2, false);
	declareFunction("compute_kbom_lru_size", "COMPUTE-KBOM-LRU-SIZE", 2, 0, false);
	declareFunction("initialize_kb_object_hl_store_cache", "INITIALIZE-KB-OBJECT-HL-STORE-CACHE", 3, 2, false);
	declareFunction("resize_kbom_lru_cache_from_percentage_and_max", "RESIZE-KBOM-LRU-CACHE-FROM-PERCENTAGE-AND-MAX", 3, 0, false);
	declareFunction("resize_kbom_lru_cache", "RESIZE-KBOM-LRU-CACHE", 2, 0, false);
	declareFunction("new_legacy_kb_object_manager", "NEW-LEGACY-KB-OBJECT-MANAGER", 7, 0, false);
	declareFunction("optimize_kb_object_content_table", "OPTIMIZE-KB-OBJECT-CONTENT-TABLE", 2, 0, false);
	declareFunction("clear_kb_object_content_table", "CLEAR-KB-OBJECT-CONTENT-TABLE", 1, 0, false);
	declareFunction("kb_object_manager_name", "KB-OBJECT-MANAGER-NAME", 1, 0, false);
	declareFunction("kb_object_manager_content_lock", "KB-OBJECT-MANAGER-CONTENT-LOCK", 1, 0, false);
	declareFunction("kb_object_manager_lru_size_percentage", "KB-OBJECT-MANAGER-LRU-SIZE-PERCENTAGE", 1, 0, false);
	declareFunction("kb_object_manager_lru_size_max", "KB-OBJECT-MANAGER-LRU-SIZE-MAX", 1, 0, false);
	declareFunction("kb_object_manager_content_table", "KB-OBJECT-MANAGER-CONTENT-TABLE", 1, 0, false);
	declareFunction("kb_object_manager_usage_table", "KB-OBJECT-MANAGER-USAGE-TABLE", 1, 0, false);
	declareFunction("kb_object_manager_lru_information", "KB-OBJECT-MANAGER-LRU-INFORMATION", 1, 0, false);
	declareFunction("kb_object_manager_file_vector", "KB-OBJECT-MANAGER-FILE-VECTOR", 1, 0, false);
	declareFunction("kb_object_manager_id_threshold", "KB-OBJECT-MANAGER-ID-THRESHOLD", 1, 0, false);
	declareFunction("kb_object_manager_load_func", "KB-OBJECT-MANAGER-LOAD-FUNC", 1, 0, false);
	declareFunction("kb_object_manager_meter_swap_timeP", "KB-OBJECT-MANAGER-METER-SWAP-TIME?", 1, 0, false);
	declareFunction("kb_object_manager_swap_time", "KB-OBJECT-MANAGER-SWAP-TIME", 1, 0, false);
	declareFunction("kb_object_manager_sub_file_vector", "KB-OBJECT-MANAGER-SUB-FILE-VECTOR", 1, 0, false);
	declareFunction("set_kb_object_manager_sub_file_vector", "SET-KB-OBJECT-MANAGER-SUB-FILE-VECTOR", 2, 0, false);
	declareFunction("kb_object_usage_counts_enabledP", "KB-OBJECT-USAGE-COUNTS-ENABLED?", 1, 0, false);
	declareFunction("cached_kb_object_count", "CACHED-KB-OBJECT-COUNT", 1, 0, false);
	declareFunction("swappable_kb_object_count", "SWAPPABLE-KB-OBJECT-COUNT", 1, 0, false);
	declareFunction("kb_object_id_cachedP", "KB-OBJECT-ID-CACHED?", 2, 0, false);
	declareFunction("kb_object_id_cachableP", "KB-OBJECT-ID-CACHABLE?", 2, 0, false);
	declareFunction("lookup_kb_object_content", "LOOKUP-KB-OBJECT-CONTENT", 2, 0, false);
	declareFunction("kb_object_manager_unbuiltP", "KB-OBJECT-MANAGER-UNBUILT?", 1, 0, false);
	declareFunction("maintain_kb_object_usage_counts", "MAINTAIN-KB-OBJECT-USAGE-COUNTS", 1, 0, false);
	declareFunction("dont_maintain_kb_object_usage_counts", "DONT-MAINTAIN-KB-OBJECT-USAGE-COUNTS", 1, 0, false);
	declareFunction("register_kb_object_content", "REGISTER-KB-OBJECT-CONTENT", 3, 0, false);
	declareFunction("deregister_kb_object_content", "DEREGISTER-KB-OBJECT-CONTENT", 2, 0, false);
	declareFunction("new_kb_object_content_file_vector", "NEW-KB-OBJECT-CONTENT-FILE-VECTOR", 2, 1, false);
	declareFunction("kb_object_content_file_vector_cfasl_stream", "KB-OBJECT-CONTENT-FILE-VECTOR-CFASL-STREAM", 1, 0, false);
	declareFunction("kb_object_content_file_vector_p", "KB-OBJECT-CONTENT-FILE-VECTOR-P", 1, 0, false);
	declareFunction("kb_object_content_file_vector_lookup", "KB-OBJECT-CONTENT-FILE-VECTOR-LOOKUP", 2, 0, false);
	declareFunction("wide_kb_object_managerP", "WIDE-KB-OBJECT-MANAGER?", 1, 0, false);
	declareFunction("wide_kb_object_sub_managerP", "WIDE-KB-OBJECT-SUB-MANAGER?", 1, 0, false);
	declareFunction("serialize_kbom_lru_information", "SERIALIZE-KBOM-LRU-INFORMATION", 2, 0, false);
	declareFunction("precache_kbom_by_lru_information", "PRECACHE-KBOM-BY-LRU-INFORMATION", 2, 0, false);
	declareFunction("kbom_lru_info_filename", "KBOM-LRU-INFO-FILENAME", 2, 0, false);
	declareFunction("is_lru_cachable_kb_object_content_idP", "IS-LRU-CACHABLE-KB-OBJECT-CONTENT-ID?", 2, 0, false);
	declareFunction("update_kb_object_usage", "UPDATE-KB-OBJECT-USAGE", 2, 0, false);
	declareFunction("drop_kb_object_usage", "DROP-KB-OBJECT-USAGE", 2, 0, false);
	declareFunction("mark_kb_object_content_as_muted", "MARK-KB-OBJECT-CONTENT-AS-MUTED", 2, 0, false);
	declareFunction("meter_kb_object_content_swap_time", "METER-KB-OBJECT-CONTENT-SWAP-TIME", 1, 0, false);
	declareFunction("dont_meter_kb_object_content_swap_time", "DONT-METER-KB-OBJECT-CONTENT-SWAP-TIME", 1, 0, false);
	declareFunction("clear_kb_object_content_swap_time", "CLEAR-KB-OBJECT-CONTENT-SWAP-TIME", 1, 0, false);
	declareFunction("get_file_backed_kb_object_id_threshold", "GET-FILE-BACKED-KB-OBJECT-ID-THRESHOLD", 1, 0, false);
	declareFunction("swap_in_kb_object_content", "SWAP-IN-KB-OBJECT-CONTENT", 2, 0, false);
	declareFunction("swap_in_kb_object_content_metered", "SWAP-IN-KB-OBJECT-CONTENT-METERED", 2, 0, false);
	declareFunction("swap_in_kb_object_content_internal", "SWAP-IN-KB-OBJECT-CONTENT-INTERNAL", 2, 0, false);
	declareFunction("swap_out_pristine_kb_object_content", "SWAP-OUT-PRISTINE-KB-OBJECT-CONTENT", 2, 0, false);
	declareFunction("safely_swap_out_all_pristine_kb_objects", "SAFELY-SWAP-OUT-ALL-PRISTINE-KB-OBJECTS", 1, 0, false);
	declareFunction("swap_out_all_pristine_kb_objects_int", "SWAP-OUT-ALL-PRISTINE-KB-OBJECTS-INT", 1, 0, false);
	declareFunction("increment_kb_object_usage_count", "INCREMENT-KB-OBJECT-USAGE-COUNT", 2, 0, false);
	declareFunction("new_muted_kb_object_iterator", "NEW-MUTED-KB-OBJECT-ITERATOR", 1, 0, false);
	declareFunction("is_muted_kb_objectP", "IS-MUTED-KB-OBJECT?", 2, 0, false);
	declareFunction("verify_kb_object_content_table_int", "VERIFY-KB-OBJECT-CONTENT-TABLE-INT", 2, 1, false);
	declareMacro("with_kbom_fully_loaded", "WITH-KBOM-FULLY-LOADED");
	declareFunction("segment_kb_object_manager_data", "SEGMENT-KB-OBJECT-MANAGER-DATA", 1, 2, false);
	declareFunction("inspect_kb_object_manager_data", "INSPECT-KB-OBJECT-MANAGER-DATA", 2, 0, false);
	return NIL;
    }

    public static SubLObject init_kb_object_manager_file() {
	defconstant("*DTP-KB-OBJECT-MANAGER*", KB_OBJECT_MANAGER);
	deflexical("*MIN-KB-OBJECT-LRU-SIZE*", $int$212);
	deflexical("*KBOM-ID-EQUALITY-TEST*", symbol_function(EQ));
	return NIL;
    }

    public static final SubLObject setup_kb_object_manager_file_alt() {
	register_method($print_object_method_table$.getGlobalValue(), $dtp_kb_object_manager$.getGlobalValue(), symbol_function(KB_OBJECT_MANAGER_PRINT_FUNCTION_TRAMPOLINE));
	def_csetf(KBOM_NAME, _CSETF_KBOM_NAME);
	def_csetf(KBOM_CONTENT_LOCK, _CSETF_KBOM_CONTENT_LOCK);
	def_csetf(KBOM_LRU_SIZE_PERCENTAGE, _CSETF_KBOM_LRU_SIZE_PERCENTAGE);
	def_csetf(KBOM_CONTENT_TABLE, _CSETF_KBOM_CONTENT_TABLE);
	def_csetf(KBOM_USAGE_TABLE, _CSETF_KBOM_USAGE_TABLE);
	def_csetf(KBOM_LRU_INFORMATION, _CSETF_KBOM_LRU_INFORMATION);
	def_csetf(KBOM_FILE_VECTOR, _CSETF_KBOM_FILE_VECTOR);
	def_csetf(KBOM_ID_THRESHOLD, _CSETF_KBOM_ID_THRESHOLD);
	def_csetf(KBOM_LOAD_FUNC, _CSETF_KBOM_LOAD_FUNC);
	def_csetf($sym29$KBOM_METER_SWAP_TIME_, $sym30$_CSETF_KBOM_METER_SWAP_TIME_);
	def_csetf(KBOM_SWAP_TIME, _CSETF_KBOM_SWAP_TIME);
	def_csetf(KBOM_DUMMY1, _CSETF_KBOM_DUMMY1);
	def_csetf(KBOM_DUMMY2, _CSETF_KBOM_DUMMY2);
	def_csetf(KBOM_DUMMY3, _CSETF_KBOM_DUMMY3);
	identity(KB_OBJECT_MANAGER);
	define_obsolete_register(NEW_LEGACY_KB_OBJECT_MANAGER, NIL);
	return NIL;
    }

    public static SubLObject setup_kb_object_manager_file() {
	if (SubLFiles.USE_V1) {
	    register_method($print_object_method_table$.getGlobalValue(), $dtp_kb_object_manager$.getGlobalValue(), symbol_function(KB_OBJECT_MANAGER_PRINT_FUNCTION_TRAMPOLINE));
	    SubLSpecialOperatorDeclarations.proclaim($list11);
	    def_csetf(KBOM_NAME, _CSETF_KBOM_NAME);
	    def_csetf(KBOM_CONTENT_LOCK, _CSETF_KBOM_CONTENT_LOCK);
	    def_csetf(KBOM_LRU_SIZE_PERCENTAGE, _CSETF_KBOM_LRU_SIZE_PERCENTAGE);
	    def_csetf(KBOM_CONTENT_TABLE, _CSETF_KBOM_CONTENT_TABLE);
	    def_csetf(KBOM_USAGE_TABLE, _CSETF_KBOM_USAGE_TABLE);
	    def_csetf(KBOM_LRU_INFORMATION, _CSETF_KBOM_LRU_INFORMATION);
	    def_csetf(KBOM_FILE_VECTOR, _CSETF_KBOM_FILE_VECTOR);
	    def_csetf(KBOM_ID_THRESHOLD, _CSETF_KBOM_ID_THRESHOLD);
	    def_csetf(KBOM_LOAD_FUNC, _CSETF_KBOM_LOAD_FUNC);
	    def_csetf($sym30$KBOM_METER_SWAP_TIME_, $sym31$_CSETF_KBOM_METER_SWAP_TIME_);
	    def_csetf(KBOM_SWAP_TIME, _CSETF_KBOM_SWAP_TIME);
	    def_csetf(KBOM_LRU_SIZE_MAX, _CSETF_KBOM_LRU_SIZE_MAX);
	    def_csetf(KBOM_SUB_FILE_VECTOR, _CSETF_KBOM_SUB_FILE_VECTOR);
	    def_csetf(KBOM_DUMMY3, _CSETF_KBOM_DUMMY3);
	    identity(KB_OBJECT_MANAGER);
	    register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_kb_object_manager$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_KB_OBJECT_MANAGER_METHOD));
	    define_obsolete_register(NEW_LEGACY_KB_OBJECT_MANAGER, NIL);
	    register_external_symbol(SERIALIZE_KBOM_LRU_INFORMATION);
	    register_external_symbol(PRECACHE_KBOM_BY_LRU_INFORMATION);
	    note_funcall_helper_function($sym86$IS_MUTED_KB_OBJECT_);
	}
	if (SubLFiles.USE_V2) {
	    def_csetf($sym29$KBOM_METER_SWAP_TIME_, $sym30$_CSETF_KBOM_METER_SWAP_TIME_);
	    def_csetf(KBOM_DUMMY1, _CSETF_KBOM_DUMMY1);
	    def_csetf(KBOM_DUMMY2, _CSETF_KBOM_DUMMY2);
	}
	return NIL;
    }

    public static SubLObject setup_kb_object_manager_file_Previous() {
	register_method($print_object_method_table$.getGlobalValue(), $dtp_kb_object_manager$.getGlobalValue(), symbol_function(KB_OBJECT_MANAGER_PRINT_FUNCTION_TRAMPOLINE));
	SubLSpecialOperatorDeclarations.proclaim($list11);
	def_csetf(KBOM_NAME, _CSETF_KBOM_NAME);
	def_csetf(KBOM_CONTENT_LOCK, _CSETF_KBOM_CONTENT_LOCK);
	def_csetf(KBOM_LRU_SIZE_PERCENTAGE, _CSETF_KBOM_LRU_SIZE_PERCENTAGE);
	def_csetf(KBOM_CONTENT_TABLE, _CSETF_KBOM_CONTENT_TABLE);
	def_csetf(KBOM_USAGE_TABLE, _CSETF_KBOM_USAGE_TABLE);
	def_csetf(KBOM_LRU_INFORMATION, _CSETF_KBOM_LRU_INFORMATION);
	def_csetf(KBOM_FILE_VECTOR, _CSETF_KBOM_FILE_VECTOR);
	def_csetf(KBOM_ID_THRESHOLD, _CSETF_KBOM_ID_THRESHOLD);
	def_csetf(KBOM_LOAD_FUNC, _CSETF_KBOM_LOAD_FUNC);
	def_csetf($sym30$KBOM_METER_SWAP_TIME_, $sym31$_CSETF_KBOM_METER_SWAP_TIME_);
	def_csetf(KBOM_SWAP_TIME, _CSETF_KBOM_SWAP_TIME);
	def_csetf(KBOM_LRU_SIZE_MAX, _CSETF_KBOM_LRU_SIZE_MAX);
	def_csetf(KBOM_SUB_FILE_VECTOR, _CSETF_KBOM_SUB_FILE_VECTOR);
	def_csetf(KBOM_DUMMY3, _CSETF_KBOM_DUMMY3);
	identity(KB_OBJECT_MANAGER);
	register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_kb_object_manager$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_KB_OBJECT_MANAGER_METHOD));
	define_obsolete_register(NEW_LEGACY_KB_OBJECT_MANAGER, NIL);
	register_external_symbol(SERIALIZE_KBOM_LRU_INFORMATION);
	register_external_symbol(PRECACHE_KBOM_BY_LRU_INFORMATION);
	note_funcall_helper_function($sym86$IS_MUTED_KB_OBJECT_);
	return NIL;
    }

    @Override
    public void declareFunctions() {
	declare_kb_object_manager_file();
    }

    @Override
    public void initializeVariables() {
	init_kb_object_manager_file();
    }

    @Override
    public void runTopLevelForms() {
	setup_kb_object_manager_file();
    }

    static {
    }

    public static final class $kb_object_manager_p$UnaryFunction extends UnaryFunction {
	public $kb_object_manager_p$UnaryFunction() {
	    super(extractFunctionNamed("KB-OBJECT-MANAGER-P"));
	}

	@Override
	public SubLObject processItem(final SubLObject arg1) {
	    return kb_object_manager_p(arg1);
	}
    }

    public static final class $kb_object_manager_native extends SubLStructNative {
	public SubLObject $name;

	public SubLObject $content_lock;

	public SubLObject $lru_size_percentage;

	public SubLObject $content_table;

	public SubLObject $usage_table;

	public SubLObject $lru_information;

	public SubLObject $file_vector;

	public SubLObject $id_threshold;

	public SubLObject $load_func;

	public SubLObject $meter_swap_timeP;

	public SubLObject $swap_time;

	public SubLObject $lru_size_max;

	public SubLObject $sub_file_vector;

	public SubLObject $dummy3;

	private static final SubLStructDeclNative structDecl;

	public $kb_object_manager_native() {
	    this.$name = Lisp.NIL;
	    this.$content_lock = Lisp.NIL;
	    this.$lru_size_percentage = Lisp.NIL;
	    this.$content_table = Lisp.NIL;
	    this.$usage_table = Lisp.NIL;
	    this.$lru_information = Lisp.NIL;
	    this.$file_vector = Lisp.NIL;
	    this.$id_threshold = Lisp.NIL;
	    this.$load_func = Lisp.NIL;
	    this.$meter_swap_timeP = Lisp.NIL;
	    this.$swap_time = Lisp.NIL;
	    this.$lru_size_max = Lisp.NIL;
	    this.$sub_file_vector = Lisp.NIL;
	    this.$dummy3 = Lisp.NIL;
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
	    return this.$content_lock;
	}

	@Override
	public SubLObject getField4() {
	    return this.$lru_size_percentage;
	}

	@Override
	public SubLObject getField5() {
	    return this.$content_table;
	}

	@Override
	public SubLObject getField6() {
	    return this.$usage_table;
	}

	@Override
	public SubLObject getField7() {
	    return this.$lru_information;
	}

	@Override
	public SubLObject getField8() {
	    return this.$file_vector;
	}

	@Override
	public SubLObject getField9() {
	    return this.$id_threshold;
	}

	@Override
	public SubLObject getField10() {
	    return this.$load_func;
	}

	@Override
	public SubLObject getField11() {
	    return this.$meter_swap_timeP;
	}

	@Override
	public SubLObject getField12() {
	    return this.$swap_time;
	}

	@Override
	public SubLObject getField13() {
	    return this.$lru_size_max;
	}

	@Override
	public SubLObject getField14() {
	    return this.$sub_file_vector;
	}

	@Override
	public SubLObject getField15() {
	    return this.$dummy3;
	}

	@Override
	public SubLObject setField2(final SubLObject value) {
	    return this.$name = value;
	}

	@Override
	public SubLObject setField3(final SubLObject value) {
	    return this.$content_lock = value;
	}

	@Override
	public SubLObject setField4(final SubLObject value) {
	    return this.$lru_size_percentage = value;
	}

	@Override
	public SubLObject setField5(final SubLObject value) {
	    return this.$content_table = value;
	}

	@Override
	public SubLObject setField6(final SubLObject value) {
	    return this.$usage_table = value;
	}

	@Override
	public SubLObject setField7(final SubLObject value) {
	    return this.$lru_information = value;
	}

	@Override
	public SubLObject setField8(final SubLObject value) {
	    return this.$file_vector = value;
	}

	@Override
	public SubLObject setField9(final SubLObject value) {
	    return this.$id_threshold = value;
	}

	@Override
	public SubLObject setField10(final SubLObject value) {
	    return this.$load_func = value;
	}

	@Override
	public SubLObject setField11(final SubLObject value) {
	    return this.$meter_swap_timeP = value;
	}

	@Override
	public SubLObject setField12(final SubLObject value) {
	    return this.$swap_time = value;
	}

	@Override
	public SubLObject setField13(final SubLObject value) {
	    return this.$lru_size_max = value;
	}

	@Override
	public SubLObject setField14(final SubLObject value) {
	    return this.$sub_file_vector = value;
	}

	@Override
	public SubLObject setField15(final SubLObject value) {
	    return this.$dummy3 = value;
	}

	static {
	    structDecl = makeStructDeclNative($kb_object_manager_native.class, KB_OBJECT_MANAGER, KB_OBJECT_MANAGER_P, $list5, $list6,
		    new String[] { "$name", "$content_lock", "$lru_size_percentage", "$content_table", "$usage_table", "$lru_information", "$file_vector", "$id_threshold", "$load_func", "$meter_swap_timeP", "$swap_time", "$lru_size_max", "$sub_file_vector", "$dummy3" }, $list7, $list8,
		    DEFAULT_STRUCT_PRINT_FUNCTION);
	}
    }

    public static final class $kb_object_manager_native_3_dummies extends SubLStructNative {
	private static final SubLStructDeclNative structDecl = makeStructDeclNative(kb_object_manager.$kb_object_manager_native.class, KB_OBJECT_MANAGER, KB_OBJECT_MANAGER_P, $list_alt5, $list_alt6,
		new String[] { "$name", "$content_lock", "$lru_size_percentage", "$content_table", "$usage_table", "$lru_information", "$file_vector", "$id_threshold", "$load_func", "$meter_swap_timeP", "$swap_time", "$dummy1", "$dummy2", "$dummy3" }, $list_alt7, $list_alt8,
		DEFAULT_STRUCT_PRINT_FUNCTION);

	public SubLStructDecl getStructDecl() {
	    return kb_object_manager.$kb_object_manager_native.structDecl;
	}

	public SubLObject getField2() {
	    return $name;
	}

	public SubLObject getField3() {
	    return $content_lock;
	}

	public SubLObject getField4() {
	    return $lru_size_percentage;
	}

	public SubLObject getField5() {
	    return $content_table;
	}

	public SubLObject getField6() {
	    return $usage_table;
	}

	public SubLObject getField7() {
	    return $lru_information;
	}

	public SubLObject getField8() {
	    return $file_vector;
	}

	public SubLObject getField9() {
	    return $id_threshold;
	}

	public SubLObject getField10() {
	    return $load_func;
	}

	public SubLObject getField11() {
	    return $meter_swap_timeP;
	}

	public SubLObject getField12() {
	    return $swap_time;
	}

	public SubLObject getField13() {
	    return $dummy1;
	}

	public SubLObject getField14() {
	    return $dummy2;
	}

	public SubLObject getField15() {
	    return $dummy3;
	}

	public SubLObject setField2(SubLObject value) {
	    return $name = value;
	}

	public SubLObject setField3(SubLObject value) {
	    return $content_lock = value;
	}

	public SubLObject setField4(SubLObject value) {
	    return $lru_size_percentage = value;
	}

	public SubLObject setField5(SubLObject value) {
	    return $content_table = value;
	}

	public SubLObject setField6(SubLObject value) {
	    return $usage_table = value;
	}

	public SubLObject setField7(SubLObject value) {
	    return $lru_information = value;
	}

	public SubLObject setField8(SubLObject value) {
	    return $file_vector = value;
	}

	public SubLObject setField9(SubLObject value) {
	    return $id_threshold = value;
	}

	public SubLObject setField10(SubLObject value) {
	    return $load_func = value;
	}

	public SubLObject setField11(SubLObject value) {
	    return $meter_swap_timeP = value;
	}

	public SubLObject setField12(SubLObject value) {
	    return $swap_time = value;
	}

	public SubLObject setField13(SubLObject value) {
	    return $dummy1 = value;
	}

	public SubLObject setField14(SubLObject value) {
	    return $dummy2 = value;
	}

	public SubLObject setField15(SubLObject value) {
	    return $dummy3 = value;
	}

	public SubLObject $name = Lisp.NIL;

	public SubLObject $content_lock = Lisp.NIL;

	public SubLObject $lru_size_percentage = Lisp.NIL;

	public SubLObject $content_table = Lisp.NIL;

	public SubLObject $usage_table = Lisp.NIL;

	public SubLObject $lru_information = Lisp.NIL;

	public SubLObject $file_vector = Lisp.NIL;

	public SubLObject $id_threshold = Lisp.NIL;

	public SubLObject $load_func = Lisp.NIL;

	public SubLObject $meter_swap_timeP = Lisp.NIL;

	public SubLObject $swap_time = Lisp.NIL;

	public SubLObject $dummy1 = Lisp.NIL;

	public SubLObject $dummy2 = Lisp.NIL;

	public SubLObject $dummy3 = Lisp.NIL;

    }

}
