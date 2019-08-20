/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;

import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.append;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.listS;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.identity;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.funcall;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.mod;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.cconcatenate;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.def_csetf;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.makeStructDeclNative;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.register_method;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time.get_universal_time;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.sublisp_null;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeInteger;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeUninternedSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.cdestructuring_bind_error;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_listp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cadr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cddr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.$print_object_method_table$;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.declareMacro;
import static com.cyc.tool.subl.util.SubLFiles.defconstant;

import org.armedbear.lisp.Lisp;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
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
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 *  module:      SUPER-FILE-HASH-TABLE
 *  source file: /cyc/top/cycl/super-file-hash-table.lisp
 *  created:     2019/07/03 17:37:16
 */
public final class super_file_hash_table extends SubLTranslatedFile implements V02 {
    // // Constructor
    private super_file_hash_table() {
    }

    public static final SubLFile me = new super_file_hash_table();


    // // Definitions
    public static final class $super_file_hash_table_native extends SubLStructNative {
	@Override
	public SubLStructDecl getStructDecl() {
	    return super_file_hash_table.$super_file_hash_table_native.structDecl;
	}

	@Override
	public SubLObject getField2() {
	    return $basename;
	}

	@Override
	public SubLObject getField3() {
	    return $serialization;
	}

	@Override
	public SubLObject getField4() {
	    return $testfn;
	}

	@Override
	public SubLObject getField5() {
	    return $count;
	}

	@Override
	public SubLObject getField6() {
	    return $default_sub_count;
	}

	@Override
	public SubLObject getField7() {
	    return $default_sub_size;
	}

	@Override
	public SubLObject getField8() {
	    return $sxhash_two;
	}

	@Override
	public SubLObject getField9() {
	    return $fhts;
	}

	@Override
	public SubLObject setField2(SubLObject value) {
	    return $basename = value;
	}

	@Override
	public SubLObject setField3(SubLObject value) {
	    return $serialization = value;
	}

	@Override
	public SubLObject setField4(SubLObject value) {
	    return $testfn = value;
	}

	@Override
	public SubLObject setField5(SubLObject value) {
	    return $count = value;
	}

	@Override
	public SubLObject setField6(SubLObject value) {
	    return $default_sub_count = value;
	}

	@Override
	public SubLObject setField7(SubLObject value) {
	    return $default_sub_size = value;
	}

	@Override
	public SubLObject setField8(SubLObject value) {
	    return $sxhash_two = value;
	}

	@Override
	public SubLObject setField9(SubLObject value) {
	    return $fhts = value;
	}

	public SubLObject $basename = Lisp.NIL;

	public SubLObject $serialization = Lisp.NIL;

	public SubLObject $testfn = Lisp.NIL;

	public SubLObject $count = Lisp.NIL;

	public SubLObject $default_sub_count = Lisp.NIL;

	public SubLObject $default_sub_size = Lisp.NIL;

	public SubLObject $sxhash_two = Lisp.NIL;

	public SubLObject $fhts = Lisp.NIL;

	private static final SubLStructDeclNative structDecl = makeStructDeclNative(super_file_hash_table.$super_file_hash_table_native.class, SUPER_FILE_HASH_TABLE, SUPER_FILE_HASH_TABLE_P, $list_alt2, $list_alt3,
		new String[] { "$basename", "$serialization", "$testfn", "$count", "$default_sub_count", "$default_sub_size", "$sxhash_two", "$fhts" }, $list_alt4, $list_alt5, DEFAULT_STRUCT_PRINT_FUNCTION);
    }

    // defconstant
    public static final SubLSymbol $dtp_super_file_hash_table$ = makeSymbol("*DTP-SUPER-FILE-HASH-TABLE*");

    public static final SubLObject super_file_hash_table_print_function_trampoline(SubLObject v_object, SubLObject stream) {
	compatibility.default_struct_print_function(v_object, stream, ZERO_INTEGER);
	return NIL;
    }

    public static final SubLObject super_file_hash_table_p(SubLObject v_object) {
	return v_object.getClass() == super_file_hash_table.$super_file_hash_table_native.class ? ((SubLObject) (T)) : NIL;
    }

    public static final class $super_file_hash_table_p$UnaryFunction extends UnaryFunction {
	public $super_file_hash_table_p$UnaryFunction() {
	    super(extractFunctionNamed("SUPER-FILE-HASH-TABLE-P"));
	}

	@Override
	public SubLObject processItem(SubLObject arg1) {
	    return super_file_hash_table_p(arg1);
	}
    }

    public static final SubLObject super_file_hash_table_basename(SubLObject v_object) {
	SubLTrampolineFile.checkType(v_object, SUPER_FILE_HASH_TABLE_P);
	return v_object.getField2();
    }

    public static final SubLObject super_file_hash_table_serialization(SubLObject v_object) {
	SubLTrampolineFile.checkType(v_object, SUPER_FILE_HASH_TABLE_P);
	return v_object.getField3();
    }

    public static final SubLObject super_file_hash_table_testfn(SubLObject v_object) {
	SubLTrampolineFile.checkType(v_object, SUPER_FILE_HASH_TABLE_P);
	return v_object.getField4();
    }

    public static final SubLObject super_file_hash_table_count(SubLObject v_object) {
	SubLTrampolineFile.checkType(v_object, SUPER_FILE_HASH_TABLE_P);
	return v_object.getField5();
    }

    public static final SubLObject super_file_hash_table_default_sub_count(SubLObject v_object) {
	SubLTrampolineFile.checkType(v_object, SUPER_FILE_HASH_TABLE_P);
	return v_object.getField6();
    }

    public static final SubLObject super_file_hash_table_default_sub_size(SubLObject v_object) {
	SubLTrampolineFile.checkType(v_object, SUPER_FILE_HASH_TABLE_P);
	return v_object.getField7();
    }

    public static final SubLObject super_file_hash_table_sxhash_two(SubLObject v_object) {
	SubLTrampolineFile.checkType(v_object, SUPER_FILE_HASH_TABLE_P);
	return v_object.getField8();
    }

    public static final SubLObject super_file_hash_table_fhts(SubLObject v_object) {
	SubLTrampolineFile.checkType(v_object, SUPER_FILE_HASH_TABLE_P);
	return v_object.getField9();
    }

    public static final SubLObject _csetf_super_file_hash_table_basename(SubLObject v_object, SubLObject value) {
	SubLTrampolineFile.checkType(v_object, SUPER_FILE_HASH_TABLE_P);
	return v_object.setField2(value);
    }

    public static final SubLObject _csetf_super_file_hash_table_serialization(SubLObject v_object, SubLObject value) {
	SubLTrampolineFile.checkType(v_object, SUPER_FILE_HASH_TABLE_P);
	return v_object.setField3(value);
    }

    public static final SubLObject _csetf_super_file_hash_table_testfn(SubLObject v_object, SubLObject value) {
	SubLTrampolineFile.checkType(v_object, SUPER_FILE_HASH_TABLE_P);
	return v_object.setField4(value);
    }

    public static final SubLObject _csetf_super_file_hash_table_count(SubLObject v_object, SubLObject value) {
	SubLTrampolineFile.checkType(v_object, SUPER_FILE_HASH_TABLE_P);
	return v_object.setField5(value);
    }

    public static final SubLObject _csetf_super_file_hash_table_default_sub_count(SubLObject v_object, SubLObject value) {
	SubLTrampolineFile.checkType(v_object, SUPER_FILE_HASH_TABLE_P);
	return v_object.setField6(value);
    }

    public static final SubLObject _csetf_super_file_hash_table_default_sub_size(SubLObject v_object, SubLObject value) {
	SubLTrampolineFile.checkType(v_object, SUPER_FILE_HASH_TABLE_P);
	return v_object.setField7(value);
    }

    public static final SubLObject _csetf_super_file_hash_table_sxhash_two(SubLObject v_object, SubLObject value) {
	SubLTrampolineFile.checkType(v_object, SUPER_FILE_HASH_TABLE_P);
	return v_object.setField8(value);
    }

    public static final SubLObject _csetf_super_file_hash_table_fhts(SubLObject v_object, SubLObject value) {
	SubLTrampolineFile.checkType(v_object, SUPER_FILE_HASH_TABLE_P);
	return v_object.setField9(value);
    }

    public static final SubLObject make_super_file_hash_table(SubLObject arglist) {
	if (arglist == UNPROVIDED) {
	    arglist = NIL;
	}
	{
	    SubLObject v_new = new super_file_hash_table.$super_file_hash_table_native();
	    SubLObject next = NIL;
	    for (next = arglist; NIL != next; next = cddr(next)) {
		{
		    SubLObject current_arg = next.first();
		    SubLObject current_value = cadr(next);
		    SubLObject pcase_var = current_arg;
		    if (pcase_var.eql($BASENAME)) {
			_csetf_super_file_hash_table_basename(v_new, current_value);
		    } else if (pcase_var.eql($SERIALIZATION)) {
			_csetf_super_file_hash_table_serialization(v_new, current_value);
		    } else if (pcase_var.eql($TESTFN)) {
			_csetf_super_file_hash_table_testfn(v_new, current_value);
		    } else if (pcase_var.eql($COUNT)) {
			_csetf_super_file_hash_table_count(v_new, current_value);
		    } else if (pcase_var.eql($DEFAULT_SUB_COUNT)) {
			_csetf_super_file_hash_table_default_sub_count(v_new, current_value);
		    } else if (pcase_var.eql($DEFAULT_SUB_SIZE)) {
			_csetf_super_file_hash_table_default_sub_size(v_new, current_value);
		    } else if (pcase_var.eql($SXHASH_TWO)) {
			_csetf_super_file_hash_table_sxhash_two(v_new, current_value);
		    } else if (pcase_var.eql($FHTS)) {
			_csetf_super_file_hash_table_fhts(v_new, current_value);
		    } else {
			Errors.error($str_alt32$Invalid_slot__S_for_construction_, current_arg);
		    }

		}
	    }
	    return v_new;
	}
    }

    public static final SubLObject create_super_file_hash_table(SubLObject basename, SubLObject count, SubLObject testfn, SubLObject serialization, SubLObject sxhash_two, SubLObject subcount, SubLObject subsize) {
	if (testfn == UNPROVIDED) {
	    testfn = EQL;
	}
	if (serialization == UNPROVIDED) {
	    serialization = $IMAGE_INDEPENDENT_CFASL;
	}
	if (sxhash_two == UNPROVIDED) {
	    sxhash_two = SXHASH_EXTERNAL;
	}
	if (subcount == UNPROVIDED) {
	    subcount = $int$100;
	}
	if (subsize == UNPROVIDED) {
	    subsize = $int$1024;
	}
	{
	    SubLObject sfht = allocate_new_super_file_hash_table(basename, count, testfn, serialization, sxhash_two, subcount, subsize);
	    obtain_child_file_hash_tables(sfht, $CREATE, UNPROVIDED);
	    return sfht;
	}
    }

    public static final SubLObject open_super_file_hash_table(SubLObject basename, SubLObject count, SubLObject testfn, SubLObject serialization, SubLObject sxhash_two) {
	if (testfn == UNPROVIDED) {
	    testfn = EQL;
	}
	if (serialization == UNPROVIDED) {
	    serialization = $IMAGE_INDEPENDENT_CFASL;
	}
	if (sxhash_two == UNPROVIDED) {
	    sxhash_two = SXHASH_EXTERNAL;
	}
	{
	    SubLObject sfht = allocate_new_super_file_hash_table(basename, count, testfn, serialization, sxhash_two, MINUS_ONE_INTEGER, MINUS_ONE_INTEGER);
	    obtain_child_file_hash_tables(sfht, $READ_WRITE, UNPROVIDED);
	    return sfht;
	}
    }

    public static final SubLObject open_super_file_hash_table_read_only(SubLObject basename, SubLObject count, SubLObject testfn, SubLObject serialization, SubLObject sxhash_two) {
	if (testfn == UNPROVIDED) {
	    testfn = EQL;
	}
	if (serialization == UNPROVIDED) {
	    serialization = $IMAGE_INDEPENDENT_CFASL;
	}
	if (sxhash_two == UNPROVIDED) {
	    sxhash_two = SXHASH_EXTERNAL;
	}
	{
	    SubLObject sfht = allocate_new_super_file_hash_table(basename, count, testfn, serialization, sxhash_two, MINUS_ONE_INTEGER, MINUS_ONE_INTEGER);
	    obtain_child_file_hash_tables(sfht, $READ_ONLY, UNPROVIDED);
	    return sfht;
	}
    }

    public static final SubLObject fast_create_super_file_hash_table(SubLObject basename, SubLObject count, SubLObject tempstem, SubLObject testfn, SubLObject serialization, SubLObject sxhash_two) {
	if (tempstem == UNPROVIDED) {
	    tempstem = $str_alt40$__tmp_;
	}
	if (testfn == UNPROVIDED) {
	    testfn = EQL;
	}
	if (serialization == UNPROVIDED) {
	    serialization = $IMAGE_INDEPENDENT_CFASL;
	}
	if (sxhash_two == UNPROVIDED) {
	    sxhash_two = SXHASH_EXTERNAL;
	}
	{
	    SubLObject sfht = allocate_new_super_file_hash_table(basename, count, testfn, serialization, sxhash_two, MINUS_ONE_INTEGER, MINUS_ONE_INTEGER);
	    obtain_child_file_hash_tables(sfht, $FAST_CREATE, tempstem);
	    return sfht;
	}
    }

    public static final SubLObject finalize_super_file_hash_table(SubLObject sfht) {
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    {
		SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(super_file_hash_table_fhts(sfht)));
		while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)) {
		    thread.resetMultipleValues();
		    {
			SubLObject number = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
			SubLObject fht = thread.secondMultipleValue();
			thread.resetMultipleValues();
			if (NIL != file_hash_table.file_hash_table_p(fht)) {
			    file_hash_table.finalize_file_hash_table(fht);
			} else if (NIL != file_hash_table.fast_create_fht_p(fht)) {
			    file_hash_table.finalize_fast_create_file_hash_table(fht, UNPROVIDED, UNPROVIDED);
			} else {
			    Errors.error($str_alt42$Unknown_file_hash_table_type__A_, fht);
			}

			iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state);
		    }
		}
		dictionary_contents.do_dictionary_contents_finalize(iteration_state);
	    }
	    dictionary.clear_dictionary(super_file_hash_table_fhts(sfht));
	    return sfht;
	}
    }

    public static final SubLObject put_super_file_hash_table(SubLObject key, SubLObject sfht, SubLObject value) {
	{
	    SubLObject hashcode = sfht_sxhash_fn(sfht, key);
	    SubLObject child_number = scale_sfht_hashcode(sfht, hashcode);
	    SubLObject fht = fetch_child_file_hash_table(sfht, child_number);
	    SubLObject result = NIL;
	    if (NIL != file_hash_table.file_hash_table_p(fht)) {
		result = file_hash_table.put_file_hash_table(key, fht, value);
	    } else if (NIL != file_hash_table.fast_create_fht_p(fht)) {
		result = file_hash_table.fast_put_file_hash_table(key, fht, value);
	    } else {
		Errors.error($str_alt42$Unknown_file_hash_table_type__A_, fht);
	    }

	    return result;
	}
    }

    public static final SubLObject get_super_file_hash_table(SubLObject key, SubLObject sfht, SubLObject v_default) {
	if (v_default == UNPROVIDED) {
	    v_default = NIL;
	}
	{
	    SubLObject hashcode = sfht_sxhash_fn(sfht, key);
	    SubLObject child_number = scale_sfht_hashcode(sfht, hashcode);
	    SubLObject fht = fetch_child_file_hash_table(sfht, child_number);
	    SubLObject result = NIL;
	    if (NIL != file_hash_table.file_hash_table_p(fht)) {
		result = file_hash_table.get_file_hash_table(key, fht, v_default);
	    } else if (NIL != file_hash_table.fast_create_fht_p(fht)) {
		Errors.error($str_alt43$Fast_create_file_hash_tables_do_n);
	    } else {
		Errors.error($str_alt42$Unknown_file_hash_table_type__A_, fht);
	    }

	    return result;
	}
    }

    public static final SubLObject super_file_hash_table_item_count(SubLObject sfht) {
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    {
		SubLObject item_count = ZERO_INTEGER;
		SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(super_file_hash_table_fhts(sfht)));
		while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)) {
		    thread.resetMultipleValues();
		    {
			SubLObject number = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
			SubLObject fht = thread.secondMultipleValue();
			thread.resetMultipleValues();
			item_count = add(item_count, file_hash_table.file_hash_table_count(fht));
			iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state);
		    }
		}
		dictionary_contents.do_dictionary_contents_finalize(iteration_state);
		return item_count;
	    }
	}
    }

    /**
     * Create a super-file-hash-table with the base name SFHT-BASENAME and the same content as the file-hash-table FHT.
     */
    public static final SubLObject file_hash_table_to_super_file_hash_table(SubLObject fht, SubLObject sfht_basename, SubLObject count, SubLObject tempstem, SubLObject testfn, SubLObject serialization, SubLObject sxhash_two) {
	if (tempstem == UNPROVIDED) {
	    tempstem = $str_alt40$__tmp_;
	}
	if (testfn == UNPROVIDED) {
	    testfn = file_hash_table.file_hash_table_testfn(fht);
	}
	if (serialization == UNPROVIDED) {
	    serialization = file_hash_table.file_hash_table_serialization(fht);
	}
	if (sxhash_two == UNPROVIDED) {
	    sxhash_two = SXHASH_EXTERNAL;
	}
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    {
		SubLObject sfht = fast_create_super_file_hash_table(sfht_basename, count, tempstem, testfn, serialization, sxhash_two);
		SubLObject table_var = fht;
		utilities_macros.$progress_note$.setDynamicValue($str_alt44$Converting_file_hash_table_to_sup, thread);
		utilities_macros.$progress_start_time$.setDynamicValue(get_universal_time(), thread);
		utilities_macros.$progress_total$.setDynamicValue(file_hash_table.file_hash_table_count(table_var), thread);
		utilities_macros.$progress_sofar$.setDynamicValue(ZERO_INTEGER, thread);
		{
		    SubLObject _prev_bind_0 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
		    SubLObject _prev_bind_1 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
		    SubLObject _prev_bind_2 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
		    SubLObject _prev_bind_3 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
		    try {
			utilities_macros.$last_percent_progress_index$.bind(ZERO_INTEGER, thread);
			utilities_macros.$last_percent_progress_prediction$.bind(NIL, thread);
			utilities_macros.$within_noting_percent_progress$.bind(T, thread);
			utilities_macros.$percent_progress_start_time$.bind(get_universal_time(), thread);
			utilities_macros.noting_percent_progress_preamble(utilities_macros.$progress_note$.getDynamicValue(thread));
			{
			    SubLObject continuation = NIL;
			    SubLObject completeP = NIL;
			    while (NIL == completeP) {
				thread.resetMultipleValues();
				{
				    SubLObject the_key = file_hash_table.get_file_hash_table_any(table_var, continuation, NIL);
				    SubLObject the_value = thread.secondMultipleValue();
				    SubLObject next = thread.thirdMultipleValue();
				    thread.resetMultipleValues();
				    if (NIL != next) {
					{
					    SubLObject key = the_key;
					    SubLObject val = the_value;
					    utilities_macros.note_percent_progress(utilities_macros.$progress_sofar$.getDynamicValue(thread), utilities_macros.$progress_total$.getDynamicValue(thread));
					    utilities_macros.$progress_sofar$.setDynamicValue(add(utilities_macros.$progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
					    put_super_file_hash_table(key, sfht, val);
					}
				    }
				    continuation = next;
				    completeP = sublisp_null(next);
				}
			    }
			}
			utilities_macros.noting_percent_progress_postamble();
		    } finally {
			utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_3, thread);
			utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_2, thread);
			utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_1, thread);
			utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_0, thread);
		    }
		}
		return finalize_super_file_hash_table(sfht);
	    }
	}
    }

    public static final SubLObject do_super_file_hash_table(SubLObject macroform, SubLObject environment) {
	{
	    SubLObject datum = macroform.rest();
	    SubLObject current = datum;
	    destructuring_bind_must_consp(current, datum, $list_alt45);
	    {
		SubLObject temp = current.rest();
		current = current.first();
		{
		    SubLObject key = NIL;
		    SubLObject value = NIL;
		    SubLObject sfht = NIL;
		    destructuring_bind_must_consp(current, datum, $list_alt45);
		    key = current.first();
		    current = current.rest();
		    destructuring_bind_must_consp(current, datum, $list_alt45);
		    value = current.first();
		    current = current.rest();
		    destructuring_bind_must_consp(current, datum, $list_alt45);
		    sfht = current.first();
		    current = current.rest();
		    if (NIL == current) {
			current = temp;
			{
			    SubLObject body = current;
			    SubLObject number = $sym46$NUMBER;
			    SubLObject fht = $sym47$FHT;
			    return list(DO_DICTIONARY, list(number, fht, list(SUPER_FILE_HASH_TABLE_FHTS, sfht)), list(IGNORE, number), listS(DO_FILE_HASH_TABLE, list(key, value, fht), append(body, NIL)));
			}
		    } else {
			cdestructuring_bind_error(datum, $list_alt45);
		    }
		}
	    }
	}
	return NIL;
    }

    public static final SubLObject progress_do_super_file_hash_table(SubLObject macroform, SubLObject environment) {
	{
	    SubLObject datum = macroform.rest();
	    SubLObject current = datum;
	    destructuring_bind_must_consp(current, datum, $list_alt51);
	    {
		SubLObject temp = current.rest();
		current = current.first();
		{
		    SubLObject key = NIL;
		    SubLObject val = NIL;
		    SubLObject sfht = NIL;
		    destructuring_bind_must_consp(current, datum, $list_alt51);
		    key = current.first();
		    current = current.rest();
		    destructuring_bind_must_consp(current, datum, $list_alt51);
		    val = current.first();
		    current = current.rest();
		    destructuring_bind_must_consp(current, datum, $list_alt51);
		    sfht = current.first();
		    current = current.rest();
		    {
			SubLObject message = (current.isCons()) ? ((SubLObject) (current.first())) : $str_alt52$do_super_file_hash_table;
			destructuring_bind_must_listp(current, datum, $list_alt51);
			current = current.rest();
			if (NIL == current) {
			    current = temp;
			    {
				SubLObject body = current;
				SubLObject table_var = $sym53$TABLE_VAR;
				return list(CLET, list(list(table_var, sfht)), list(CSETQ, $progress_note$, message), $list_alt57, list(CSETQ, $progress_total$, list(SUPER_FILE_HASH_TABLE_ITEM_COUNT, table_var)), $list_alt60,
					list(NOTING_PERCENT_PROGRESS, $progress_note$, listS(DO_SUPER_FILE_HASH_TABLE, list(key, val, table_var), $list_alt63, $list_alt64, append(body, NIL))));
			    }
			} else {
			    cdestructuring_bind_error(datum, $list_alt51);
			}
		    }
		}
	    }
	}
	return NIL;
    }

    public static final SubLObject allocate_new_super_file_hash_table(SubLObject basename, SubLObject count, SubLObject testfn, SubLObject serialization, SubLObject sxhash_two, SubLObject subcount, SubLObject subsize) {
	{
	    SubLObject sfht = make_super_file_hash_table(UNPROVIDED);
	    _csetf_super_file_hash_table_basename(sfht, basename);
	    _csetf_super_file_hash_table_serialization(sfht, serialization);
	    _csetf_super_file_hash_table_testfn(sfht, testfn);
	    _csetf_super_file_hash_table_count(sfht, count);
	    _csetf_super_file_hash_table_default_sub_count(sfht, subcount);
	    _csetf_super_file_hash_table_default_sub_size(sfht, subsize);
	    _csetf_super_file_hash_table_sxhash_two(sfht, sxhash_two);
	    _csetf_super_file_hash_table_fhts(sfht, dictionary.new_dictionary(UNPROVIDED, UNPROVIDED));
	    return sfht;
	}
    }

    public static final SubLObject obtain_child_file_hash_tables(SubLObject sfht, SubLObject access_mode, SubLObject tempstem) {
	if (access_mode == UNPROVIDED) {
	    access_mode = $READ_ONLY;
	}
	if (tempstem == UNPROVIDED) {
	    tempstem = NIL;
	}
	{
	    SubLObject count = super_file_hash_table_count(sfht);
	    SubLObject subcount = super_file_hash_table_default_sub_count(sfht);
	    SubLObject subsize = super_file_hash_table_default_sub_size(sfht);
	    SubLObject testfn = super_file_hash_table_testfn(sfht);
	    SubLObject serialization = super_file_hash_table_serialization(sfht);
	    SubLObject fhts = super_file_hash_table_fhts(sfht);
	    SubLObject number = NIL;
	    for (number = ZERO_INTEGER; number.numL(count); number = add(number, ONE_INTEGER)) {
		{
		    SubLObject child_name = generate_child_file_hash_table_name(sfht, number);
		    SubLObject fht = NIL;
		    SubLObject pcase_var = access_mode;
		    if (pcase_var.eql($CREATE)) {
			fht = file_hash_table.create_file_hash_table(child_name, subcount, subsize, testfn, serialization);
		    } else if (pcase_var.eql($READ_ONLY)) {
			fht = file_hash_table.open_file_hash_table_read_only(child_name, testfn, serialization);
		    } else if (pcase_var.eql($READ_WRITE)) {
			fht = file_hash_table.open_file_hash_table(child_name, testfn, serialization);
		    } else if (pcase_var.eql($FAST_CREATE)) {
			fht = file_hash_table.fast_create_file_hash_table(child_name, tempstem, testfn, serialization);
		    } else {
			Errors.error($str_alt65$Invalid_access_mode_option__A__on, access_mode);
		    }

		    dictionary.dictionary_enter(fhts, number, fht);
		}
	    }
	}
	return sfht;
    }

    /**
     *
     *
     * @unknown fix when we have true paths
     */
    public static final SubLObject generate_child_file_hash_table_name(SubLObject sfht, SubLObject number) {
	{
	    SubLObject basename = super_file_hash_table_basename(sfht);
	    SubLObject numeric_code = string_utilities.to_string(number);
	    SubLObject extension = $str_alt66$_fht;
	    return cconcatenate(basename, new SubLObject[] { numeric_code, extension });
	}
    }

    public static final SubLObject fetch_child_file_hash_table(SubLObject sfht, SubLObject number) {
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    {
		SubLObject fhts = super_file_hash_table_fhts(sfht);
		SubLObject fht = dictionary.dictionary_lookup(fhts, number, UNPROVIDED);
		if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
		    if (!((NIL != file_hash_table.fast_create_fht_p(fht)) || (NIL != file_hash_table.file_hash_table_p(fht)))) {
			Errors.error($str_alt67$Error__cannot_fetch_child_number_, number, sfht);
		    }
		}
		return fht;
	    }
	}
    }

    public static final SubLObject sfht_sxhash_fn(SubLObject sfht, SubLObject v_object) {
	{
	    SubLObject sxhash_two = super_file_hash_table_sxhash_two(sfht);
	    return funcall(sxhash_two, v_object);
	}
    }

    public static final SubLObject scale_sfht_hashcode(SubLObject sfht, SubLObject hashcode) {
	{
	    SubLObject count = super_file_hash_table_count(sfht);
	    return mod(hashcode, count);
	}
    }

    public static final SubLObject declare_super_file_hash_table_file() {
	declareFunction("super_file_hash_table_print_function_trampoline", "SUPER-FILE-HASH-TABLE-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
	declareFunction("super_file_hash_table_p", "SUPER-FILE-HASH-TABLE-P", 1, 0, false);
	new super_file_hash_table.$super_file_hash_table_p$UnaryFunction();
	declareFunction("super_file_hash_table_basename", "SUPER-FILE-HASH-TABLE-BASENAME", 1, 0, false);
	declareFunction("super_file_hash_table_serialization", "SUPER-FILE-HASH-TABLE-SERIALIZATION", 1, 0, false);
	declareFunction("super_file_hash_table_testfn", "SUPER-FILE-HASH-TABLE-TESTFN", 1, 0, false);
	declareFunction("super_file_hash_table_count", "SUPER-FILE-HASH-TABLE-COUNT", 1, 0, false);
	declareFunction("super_file_hash_table_default_sub_count", "SUPER-FILE-HASH-TABLE-DEFAULT-SUB-COUNT", 1, 0, false);
	declareFunction("super_file_hash_table_default_sub_size", "SUPER-FILE-HASH-TABLE-DEFAULT-SUB-SIZE", 1, 0, false);
	declareFunction("super_file_hash_table_sxhash_two", "SUPER-FILE-HASH-TABLE-SXHASH-TWO", 1, 0, false);
	declareFunction("super_file_hash_table_fhts", "SUPER-FILE-HASH-TABLE-FHTS", 1, 0, false);
	declareFunction("_csetf_super_file_hash_table_basename", "_CSETF-SUPER-FILE-HASH-TABLE-BASENAME", 2, 0, false);
	declareFunction("_csetf_super_file_hash_table_serialization", "_CSETF-SUPER-FILE-HASH-TABLE-SERIALIZATION", 2, 0, false);
	declareFunction("_csetf_super_file_hash_table_testfn", "_CSETF-SUPER-FILE-HASH-TABLE-TESTFN", 2, 0, false);
	declareFunction("_csetf_super_file_hash_table_count", "_CSETF-SUPER-FILE-HASH-TABLE-COUNT", 2, 0, false);
	declareFunction("_csetf_super_file_hash_table_default_sub_count", "_CSETF-SUPER-FILE-HASH-TABLE-DEFAULT-SUB-COUNT", 2, 0, false);
	declareFunction("_csetf_super_file_hash_table_default_sub_size", "_CSETF-SUPER-FILE-HASH-TABLE-DEFAULT-SUB-SIZE", 2, 0, false);
	declareFunction("_csetf_super_file_hash_table_sxhash_two", "_CSETF-SUPER-FILE-HASH-TABLE-SXHASH-TWO", 2, 0, false);
	declareFunction("_csetf_super_file_hash_table_fhts", "_CSETF-SUPER-FILE-HASH-TABLE-FHTS", 2, 0, false);
	declareFunction("make_super_file_hash_table", "MAKE-SUPER-FILE-HASH-TABLE", 0, 1, false);
	declareFunction("create_super_file_hash_table", "CREATE-SUPER-FILE-HASH-TABLE", 2, 5, false);
	declareFunction("open_super_file_hash_table", "OPEN-SUPER-FILE-HASH-TABLE", 2, 3, false);
	declareFunction("open_super_file_hash_table_read_only", "OPEN-SUPER-FILE-HASH-TABLE-READ-ONLY", 2, 3, false);
	declareFunction("fast_create_super_file_hash_table", "FAST-CREATE-SUPER-FILE-HASH-TABLE", 2, 4, false);
	declareFunction("finalize_super_file_hash_table", "FINALIZE-SUPER-FILE-HASH-TABLE", 1, 0, false);
	declareFunction("put_super_file_hash_table", "PUT-SUPER-FILE-HASH-TABLE", 3, 0, false);
	declareFunction("get_super_file_hash_table", "GET-SUPER-FILE-HASH-TABLE", 2, 1, false);
	declareFunction("super_file_hash_table_item_count", "SUPER-FILE-HASH-TABLE-ITEM-COUNT", 1, 0, false);
	declareFunction("file_hash_table_to_super_file_hash_table", "FILE-HASH-TABLE-TO-SUPER-FILE-HASH-TABLE", 3, 4, false);
	declareMacro("do_super_file_hash_table", "DO-SUPER-FILE-HASH-TABLE");
	declareMacro("progress_do_super_file_hash_table", "PROGRESS-DO-SUPER-FILE-HASH-TABLE");
	declareFunction("allocate_new_super_file_hash_table", "ALLOCATE-NEW-SUPER-FILE-HASH-TABLE", 7, 0, false);
	declareFunction("obtain_child_file_hash_tables", "OBTAIN-CHILD-FILE-HASH-TABLES", 1, 2, false);
	declareFunction("generate_child_file_hash_table_name", "GENERATE-CHILD-FILE-HASH-TABLE-NAME", 2, 0, false);
	declareFunction("fetch_child_file_hash_table", "FETCH-CHILD-FILE-HASH-TABLE", 2, 0, false);
	declareFunction("sfht_sxhash_fn", "SFHT-SXHASH-FN", 2, 0, false);
	declareFunction("scale_sfht_hashcode", "SCALE-SFHT-HASHCODE", 2, 0, false);
	return NIL;
    }

    public static final SubLObject init_super_file_hash_table_file() {
	defconstant("*DTP-SUPER-FILE-HASH-TABLE*", SUPER_FILE_HASH_TABLE);
	return NIL;
    }

    public static final SubLObject setup_super_file_hash_table_file() {
	register_method($print_object_method_table$.getGlobalValue(), $dtp_super_file_hash_table$.getGlobalValue(), symbol_function(SUPER_FILE_HASH_TABLE_PRINT_FUNCTION_TRAMPOLINE));
	def_csetf(SUPER_FILE_HASH_TABLE_BASENAME, _CSETF_SUPER_FILE_HASH_TABLE_BASENAME);
	def_csetf(SUPER_FILE_HASH_TABLE_SERIALIZATION, _CSETF_SUPER_FILE_HASH_TABLE_SERIALIZATION);
	def_csetf(SUPER_FILE_HASH_TABLE_TESTFN, _CSETF_SUPER_FILE_HASH_TABLE_TESTFN);
	def_csetf(SUPER_FILE_HASH_TABLE_COUNT, _CSETF_SUPER_FILE_HASH_TABLE_COUNT);
	def_csetf(SUPER_FILE_HASH_TABLE_DEFAULT_SUB_COUNT, _CSETF_SUPER_FILE_HASH_TABLE_DEFAULT_SUB_COUNT);
	def_csetf(SUPER_FILE_HASH_TABLE_DEFAULT_SUB_SIZE, _CSETF_SUPER_FILE_HASH_TABLE_DEFAULT_SUB_SIZE);
	def_csetf(SUPER_FILE_HASH_TABLE_SXHASH_TWO, _CSETF_SUPER_FILE_HASH_TABLE_SXHASH_TWO);
	def_csetf(SUPER_FILE_HASH_TABLE_FHTS, _CSETF_SUPER_FILE_HASH_TABLE_FHTS);
	identity(SUPER_FILE_HASH_TABLE);
	return NIL;
    }

    // // Internal Constants
    private static final SubLSymbol SUPER_FILE_HASH_TABLE = makeSymbol("SUPER-FILE-HASH-TABLE");

    private static final SubLSymbol $FHTS = makeKeyword("FHTS");

    private static final SubLSymbol SUPER_FILE_HASH_TABLE_P = makeSymbol("SUPER-FILE-HASH-TABLE-P");

    static private final SubLList $list_alt2 = list(makeSymbol("BASENAME"), makeSymbol("SERIALIZATION"), makeSymbol("TESTFN"), makeSymbol("COUNT"), makeSymbol("DEFAULT-SUB-COUNT"), makeSymbol("DEFAULT-SUB-SIZE"), makeSymbol("SXHASH-TWO"), makeSymbol("FHTS"));

    static private final SubLList $list_alt3 = list(makeKeyword("BASENAME"), makeKeyword("SERIALIZATION"), makeKeyword("TESTFN"), makeKeyword("COUNT"), makeKeyword("DEFAULT-SUB-COUNT"), makeKeyword("DEFAULT-SUB-SIZE"), makeKeyword("SXHASH-TWO"), $FHTS);

    static private final SubLList $list_alt4 = list(makeSymbol("SUPER-FILE-HASH-TABLE-BASENAME"), makeSymbol("SUPER-FILE-HASH-TABLE-SERIALIZATION"), makeSymbol("SUPER-FILE-HASH-TABLE-TESTFN"), makeSymbol("SUPER-FILE-HASH-TABLE-COUNT"), makeSymbol("SUPER-FILE-HASH-TABLE-DEFAULT-SUB-COUNT"),
	    makeSymbol("SUPER-FILE-HASH-TABLE-DEFAULT-SUB-SIZE"), makeSymbol("SUPER-FILE-HASH-TABLE-SXHASH-TWO"), makeSymbol("SUPER-FILE-HASH-TABLE-FHTS"));

    static private final SubLList $list_alt5 = list(makeSymbol("_CSETF-SUPER-FILE-HASH-TABLE-BASENAME"), makeSymbol("_CSETF-SUPER-FILE-HASH-TABLE-SERIALIZATION"), makeSymbol("_CSETF-SUPER-FILE-HASH-TABLE-TESTFN"), makeSymbol("_CSETF-SUPER-FILE-HASH-TABLE-COUNT"),
	    makeSymbol("_CSETF-SUPER-FILE-HASH-TABLE-DEFAULT-SUB-COUNT"), makeSymbol("_CSETF-SUPER-FILE-HASH-TABLE-DEFAULT-SUB-SIZE"), makeSymbol("_CSETF-SUPER-FILE-HASH-TABLE-SXHASH-TWO"), makeSymbol("_CSETF-SUPER-FILE-HASH-TABLE-FHTS"));

    private static final SubLSymbol SUPER_FILE_HASH_TABLE_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("SUPER-FILE-HASH-TABLE-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLSymbol SUPER_FILE_HASH_TABLE_BASENAME = makeSymbol("SUPER-FILE-HASH-TABLE-BASENAME");

    public static final SubLSymbol _CSETF_SUPER_FILE_HASH_TABLE_BASENAME = makeSymbol("_CSETF-SUPER-FILE-HASH-TABLE-BASENAME");

    private static final SubLSymbol SUPER_FILE_HASH_TABLE_SERIALIZATION = makeSymbol("SUPER-FILE-HASH-TABLE-SERIALIZATION");

    public static final SubLSymbol _CSETF_SUPER_FILE_HASH_TABLE_SERIALIZATION = makeSymbol("_CSETF-SUPER-FILE-HASH-TABLE-SERIALIZATION");

    private static final SubLSymbol SUPER_FILE_HASH_TABLE_TESTFN = makeSymbol("SUPER-FILE-HASH-TABLE-TESTFN");

    public static final SubLSymbol _CSETF_SUPER_FILE_HASH_TABLE_TESTFN = makeSymbol("_CSETF-SUPER-FILE-HASH-TABLE-TESTFN");

    private static final SubLSymbol SUPER_FILE_HASH_TABLE_COUNT = makeSymbol("SUPER-FILE-HASH-TABLE-COUNT");

    public static final SubLSymbol _CSETF_SUPER_FILE_HASH_TABLE_COUNT = makeSymbol("_CSETF-SUPER-FILE-HASH-TABLE-COUNT");

    private static final SubLSymbol SUPER_FILE_HASH_TABLE_DEFAULT_SUB_COUNT = makeSymbol("SUPER-FILE-HASH-TABLE-DEFAULT-SUB-COUNT");

    public static final SubLSymbol _CSETF_SUPER_FILE_HASH_TABLE_DEFAULT_SUB_COUNT = makeSymbol("_CSETF-SUPER-FILE-HASH-TABLE-DEFAULT-SUB-COUNT");

    private static final SubLSymbol SUPER_FILE_HASH_TABLE_DEFAULT_SUB_SIZE = makeSymbol("SUPER-FILE-HASH-TABLE-DEFAULT-SUB-SIZE");

    public static final SubLSymbol _CSETF_SUPER_FILE_HASH_TABLE_DEFAULT_SUB_SIZE = makeSymbol("_CSETF-SUPER-FILE-HASH-TABLE-DEFAULT-SUB-SIZE");

    private static final SubLSymbol SUPER_FILE_HASH_TABLE_SXHASH_TWO = makeSymbol("SUPER-FILE-HASH-TABLE-SXHASH-TWO");

    public static final SubLSymbol _CSETF_SUPER_FILE_HASH_TABLE_SXHASH_TWO = makeSymbol("_CSETF-SUPER-FILE-HASH-TABLE-SXHASH-TWO");

    private static final SubLSymbol SUPER_FILE_HASH_TABLE_FHTS = makeSymbol("SUPER-FILE-HASH-TABLE-FHTS");

    public static final SubLSymbol _CSETF_SUPER_FILE_HASH_TABLE_FHTS = makeSymbol("_CSETF-SUPER-FILE-HASH-TABLE-FHTS");

    private static final SubLSymbol $BASENAME = makeKeyword("BASENAME");

    private static final SubLSymbol $SERIALIZATION = makeKeyword("SERIALIZATION");

    private static final SubLSymbol $DEFAULT_SUB_COUNT = makeKeyword("DEFAULT-SUB-COUNT");

    private static final SubLSymbol $DEFAULT_SUB_SIZE = makeKeyword("DEFAULT-SUB-SIZE");

    private static final SubLSymbol $SXHASH_TWO = makeKeyword("SXHASH-TWO");

    static private final SubLString $str_alt32$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");

    private static final SubLSymbol $IMAGE_INDEPENDENT_CFASL = makeKeyword("IMAGE-INDEPENDENT-CFASL");

    private static final SubLSymbol SXHASH_EXTERNAL = makeSymbol("SXHASH-EXTERNAL");

    public static final SubLInteger $int$1024 = makeInteger(1024);

    private static final SubLSymbol $READ_WRITE = makeKeyword("READ-WRITE");

    static private final SubLString $str_alt40$__tmp_ = makeString("~/tmp/");

    private static final SubLSymbol $FAST_CREATE = makeKeyword("FAST-CREATE");

    static private final SubLString $str_alt42$Unknown_file_hash_table_type__A_ = makeString("Unknown file hash table type ~A.");

    static private final SubLString $str_alt43$Fast_create_file_hash_tables_do_n = makeString("Fast create file hash tables do no support the GET operator.");

    static private final SubLString $str_alt44$Converting_file_hash_table_to_sup = makeString("Converting file hash table to super file hash table");

    static private final SubLList $list_alt45 = list(list(makeSymbol("KEY"), makeSymbol("VALUE"), makeSymbol("SFHT")), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLSymbol $sym46$NUMBER = makeUninternedSymbol("NUMBER");

    static private final SubLSymbol $sym47$FHT = makeUninternedSymbol("FHT");

    private static final SubLSymbol DO_FILE_HASH_TABLE = makeSymbol("DO-FILE-HASH-TABLE");

    static private final SubLList $list_alt51 = list(list(makeSymbol("KEY"), makeSymbol("VAL"), makeSymbol("SFHT"), makeSymbol("&OPTIONAL"), list(makeSymbol("MESSAGE"), makeString("do-super-file-hash-table"))), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLString $str_alt52$do_super_file_hash_table = makeString("do-super-file-hash-table");

    static private final SubLSymbol $sym53$TABLE_VAR = makeUninternedSymbol("TABLE-VAR");

    private static final SubLSymbol $progress_note$ = makeSymbol("*PROGRESS-NOTE*");

    static private final SubLList $list_alt57 = list(makeSymbol("CSETQ"), makeSymbol("*PROGRESS-START-TIME*"), list(makeSymbol("GET-UNIVERSAL-TIME")));

    private static final SubLSymbol $progress_total$ = makeSymbol("*PROGRESS-TOTAL*");

    private static final SubLSymbol SUPER_FILE_HASH_TABLE_ITEM_COUNT = makeSymbol("SUPER-FILE-HASH-TABLE-ITEM-COUNT");

    static private final SubLList $list_alt60 = list(makeSymbol("CSETQ"), makeSymbol("*PROGRESS-SOFAR*"), ZERO_INTEGER);

    private static final SubLSymbol DO_SUPER_FILE_HASH_TABLE = makeSymbol("DO-SUPER-FILE-HASH-TABLE");

    static private final SubLList $list_alt63 = list(makeSymbol("NOTE-PERCENT-PROGRESS"), makeSymbol("*PROGRESS-SOFAR*"), makeSymbol("*PROGRESS-TOTAL*"));

    static private final SubLList $list_alt64 = list(makeSymbol("CINC"), makeSymbol("*PROGRESS-SOFAR*"));

    static private final SubLString $str_alt65$Invalid_access_mode_option__A__on = makeString("Invalid access-mode option ~A; only :create, :read-only or :read-write ok.");

    static private final SubLString $str_alt66$_fht = makeString(".fht");

    static private final SubLString $str_alt67$Error__cannot_fetch_child_number_ = makeString("Error, cannot fetch child number ~A for super-file-hash-table ~A.");

    // // Initializers
    @Override
    public void declareFunctions() {
	declare_super_file_hash_table_file();
    }

    @Override
    public void initializeVariables() {
	init_super_file_hash_table_file();
    }

    @Override
    public void runTopLevelForms() {
	setup_super_file_hash_table_file();
    }
}
