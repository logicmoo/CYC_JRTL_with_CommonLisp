/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;

import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_greater;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_space;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.append;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.listS;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.bind;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.currentBinding;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.rebind;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.identity;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.clrhash;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.getEntryKey;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.getEntrySetIterator;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.getEntryValue;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.gethash;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.iteratorHasNext;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.iteratorNextEntry;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.make_hash_table;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.releaseEntrySetIterator;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.remhash;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.sethash;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks.release_lock;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks.seize_lock;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Packages.intern;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.write;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.cconcatenate;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.delete;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.length;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.nreverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.remove;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.remove_if;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.subseq;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.def_csetf;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.makeStructDeclNative;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.register_method;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.make_keyword;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_name;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.current_process;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.kill_process;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.sleep;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.processp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.type_of;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeInteger;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.cdestructuring_bind_error;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.assoc;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cadr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cddr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.fourth;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.second;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.third;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.$print_object_method_table$;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.$print_readably$;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.print_not_readable;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.close;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.write_char;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.write_string;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.declareMacro;
import static com.cyc.tool.subl.util.SubLFiles.defconstant;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;

import java.util.Iterator;
import java.util.Map;

import org.armedbear.lisp.Lisp;

import com.cyc.cycjava.cycl.inference.ask_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Environment;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Guids;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
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
import com.cyc.tool.subl.util.SubLSystemTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 *  module:      RKF-COLLABORATOR-NUSKETCH
 *  source file: /cyc/top/cycl/rkf-collaborator-nusketch.lisp
 *  created:     2019/07/03 17:38:01
 */
public final class rkf_collaborator_nusketch extends SubLTranslatedFile implements V02 {
    // // Constructor
    private rkf_collaborator_nusketch() {
    }

    public static final SubLFile me = new rkf_collaborator_nusketch();


    // // Definitions
    public static final class $nusketch_session_native extends SubLStructNative {
	@Override
	public SubLStructDecl getStructDecl() {
	    return rkf_collaborator_nusketch.$nusketch_session_native.structDecl;
	}

	@Override
	public SubLObject getField2() {
	    return $machine;
	}

	@Override
	public SubLObject getField3() {
	    return $port;
	}

	@Override
	public SubLObject getField4() {
	    return $open_sketches;
	}

	@Override
	public SubLObject getField5() {
	    return $active_sketch;
	}

	@Override
	public SubLObject getField6() {
	    return $active_bundle;
	}

	@Override
	public SubLObject getField7() {
	    return $active_layer;
	}

	@Override
	public SubLObject setField2(SubLObject value) {
	    return $machine = value;
	}

	@Override
	public SubLObject setField3(SubLObject value) {
	    return $port = value;
	}

	@Override
	public SubLObject setField4(SubLObject value) {
	    return $open_sketches = value;
	}

	@Override
	public SubLObject setField5(SubLObject value) {
	    return $active_sketch = value;
	}

	@Override
	public SubLObject setField6(SubLObject value) {
	    return $active_bundle = value;
	}

	@Override
	public SubLObject setField7(SubLObject value) {
	    return $active_layer = value;
	}

	public SubLObject $machine = Lisp.NIL;

	public SubLObject $port = Lisp.NIL;

	public SubLObject $open_sketches = Lisp.NIL;

	public SubLObject $active_sketch = Lisp.NIL;

	public SubLObject $active_bundle = Lisp.NIL;

	public SubLObject $active_layer = Lisp.NIL;

	private static final SubLStructDeclNative structDecl = makeStructDeclNative(rkf_collaborator_nusketch.$nusketch_session_native.class, NUSKETCH_SESSION, NUSKETCH_SESSION_P, $list_alt2, $list_alt3,
		new String[] { "$machine", "$port", "$open_sketches", "$active_sketch", "$active_bundle", "$active_layer" }, $list_alt4, $list_alt5, RKFCOLL_NUSKETCH_PRINT_NUSKETCH_SESSION);
    }

    // defconstant
    public static final SubLSymbol $dtp_nusketch_session$ = makeSymbol("*DTP-NUSKETCH-SESSION*");

    public static final SubLObject nusketch_session_print_function_trampoline(SubLObject v_object, SubLObject stream) {
	rkfcoll_nusketch_print_nusketch_session(v_object, stream, ZERO_INTEGER);
	return NIL;
    }

    public static final SubLObject nusketch_session_p(SubLObject v_object) {
	return v_object.getJavaClass() ==rkf_collaborator_nusketch.$nusketch_session_native.class ? ((SubLObject) (T)) : NIL;
    }

    public static final class $nusketch_session_p$UnaryFunction extends UnaryFunction {
	public $nusketch_session_p$UnaryFunction() {
	    super(extractFunctionNamed("NUSKETCH-SESSION-P"));
	}

	@Override
	public SubLObject processItem(SubLObject arg1) {
	    return nusketch_session_p(arg1);
	}
    }

    public static final SubLObject nusketch_session_machine(SubLObject v_object) {
	SubLSystemTrampolineFile.checkType(v_object, NUSKETCH_SESSION_P);
	return v_object.getField2();
    }

    public static final SubLObject nusketch_session_port(SubLObject v_object) {
	SubLSystemTrampolineFile.checkType(v_object, NUSKETCH_SESSION_P);
	return v_object.getField3();
    }

    public static final SubLObject nusketch_session_open_sketches(SubLObject v_object) {
	SubLSystemTrampolineFile.checkType(v_object, NUSKETCH_SESSION_P);
	return v_object.getField4();
    }

    public static final SubLObject nusketch_session_active_sketch(SubLObject v_object) {
	SubLSystemTrampolineFile.checkType(v_object, NUSKETCH_SESSION_P);
	return v_object.getField5();
    }

    public static final SubLObject nusketch_session_active_bundle(SubLObject v_object) {
	SubLSystemTrampolineFile.checkType(v_object, NUSKETCH_SESSION_P);
	return v_object.getField6();
    }

    public static final SubLObject nusketch_session_active_layer(SubLObject v_object) {
	SubLSystemTrampolineFile.checkType(v_object, NUSKETCH_SESSION_P);
	return v_object.getField7();
    }

    public static final SubLObject _csetf_nusketch_session_machine(SubLObject v_object, SubLObject value) {
	SubLSystemTrampolineFile.checkType(v_object, NUSKETCH_SESSION_P);
	return v_object.setField2(value);
    }

    public static final SubLObject _csetf_nusketch_session_port(SubLObject v_object, SubLObject value) {
	SubLSystemTrampolineFile.checkType(v_object, NUSKETCH_SESSION_P);
	return v_object.setField3(value);
    }

    public static final SubLObject _csetf_nusketch_session_open_sketches(SubLObject v_object, SubLObject value) {
	SubLSystemTrampolineFile.checkType(v_object, NUSKETCH_SESSION_P);
	return v_object.setField4(value);
    }

    public static final SubLObject _csetf_nusketch_session_active_sketch(SubLObject v_object, SubLObject value) {
	SubLSystemTrampolineFile.checkType(v_object, NUSKETCH_SESSION_P);
	return v_object.setField5(value);
    }

    public static final SubLObject _csetf_nusketch_session_active_bundle(SubLObject v_object, SubLObject value) {
	SubLSystemTrampolineFile.checkType(v_object, NUSKETCH_SESSION_P);
	return v_object.setField6(value);
    }

    public static final SubLObject _csetf_nusketch_session_active_layer(SubLObject v_object, SubLObject value) {
	SubLSystemTrampolineFile.checkType(v_object, NUSKETCH_SESSION_P);
	return v_object.setField7(value);
    }

    public static final SubLObject make_nusketch_session(SubLObject arglist) {
	if (arglist == UNPROVIDED) {
	    arglist = NIL;
	}
	{
	    SubLObject v_new = new rkf_collaborator_nusketch.$nusketch_session_native();
	    SubLObject next = NIL;
	    for (next = arglist; NIL != next; next = cddr(next)) {
		{
		    SubLObject current_arg = next.first();
		    SubLObject current_value = cadr(next);
		    SubLObject pcase_var = current_arg;
		    if (pcase_var.eql($MACHINE)) {
			_csetf_nusketch_session_machine(v_new, current_value);
		    } else if (pcase_var.eql($PORT)) {
			_csetf_nusketch_session_port(v_new, current_value);
		    } else if (pcase_var.eql($OPEN_SKETCHES)) {
			_csetf_nusketch_session_open_sketches(v_new, current_value);
		    } else if (pcase_var.eql($ACTIVE_SKETCH)) {
			_csetf_nusketch_session_active_sketch(v_new, current_value);
		    } else if (pcase_var.eql($ACTIVE_BUNDLE)) {
			_csetf_nusketch_session_active_bundle(v_new, current_value);
		    } else if (pcase_var.eql($ACTIVE_LAYER)) {
			_csetf_nusketch_session_active_layer(v_new, current_value);
		    } else {
			Errors.error($str_alt26$Invalid_slot__S_for_construction_, current_arg);
		    }

		}
	    }
	    return v_new;
	}
    }

    public static final SubLObject rkfcoll_nusketch_print_nusketch_session(SubLObject v_object, SubLObject stream, SubLObject depth) {
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    if (NIL != $print_readably$.getDynamicValue(thread)) {
		print_not_readable(v_object, stream);
	    } else {
		{
		    SubLObject v_object_1 = v_object;
		    SubLObject stream_2 = stream;
		    write_string($str_alt27$__, stream_2, UNPROVIDED, UNPROVIDED);
		    write(type_of(v_object_1), new SubLObject[] { $STREAM, stream_2 });
		    write_char(CHAR_space, stream_2);
		    format(stream, $str_alt29$__A__A_, nusketch_session_machine(v_object), nusketch_session_port(v_object));
		    write_char(CHAR_greater, stream_2);
		}
	    }
	    return v_object;
	}
    }

    /**
     * Iterate through all sketches in session binding each to sketch and executing body
     */
    public static final SubLObject do_sketches(SubLObject macroform, SubLObject environment) {
	{
	    SubLObject datum = macroform.rest();
	    SubLObject current = datum;
	    destructuring_bind_must_consp(current, datum, $list_alt31);
	    {
		SubLObject temp = current.rest();
		current = current.first();
		{
		    SubLObject nsession = NIL;
		    SubLObject sketch = NIL;
		    destructuring_bind_must_consp(current, datum, $list_alt31);
		    nsession = current.first();
		    current = current.rest();
		    destructuring_bind_must_consp(current, datum, $list_alt31);
		    sketch = current.first();
		    current = current.rest();
		    if (NIL == current) {
			current = temp;
			{
			    SubLObject body = current;
			    return listS(CDOHASH, list(SKETCH_ID, sketch, list(NUSKETCH_SESSION_OPEN_SKETCHES, nsession)), $list_alt34, append(body, NIL));
			}
		    } else {
			cdestructuring_bind_error(datum, $list_alt31);
		    }
		}
	    }
	}
	return NIL;
    }

    public static final SubLObject rkfcoll_nusketch_get_sketch_by_id(SubLObject nsession, SubLObject sketch_id) {
	return gethash(sketch_id, nusketch_session_open_sketches(nsession), UNPROVIDED);
    }

    public static final class $nusketch_sketch_native extends SubLStructNative {
	@Override
	public SubLStructDecl getStructDecl() {
	    return rkf_collaborator_nusketch.$nusketch_sketch_native.structDecl;
	}

	@Override
	public SubLObject getField2() {
	    return $id;
	}

	@Override
	public SubLObject getField3() {
	    return $name;
	}

	@Override
	public SubLObject getField4() {
	    return $bundles;
	}

	@Override
	public SubLObject getField5() {
	    return $meta_layer;
	}

	@Override
	public SubLObject getField6() {
	    return $guid;
	}

	@Override
	public SubLObject setField2(SubLObject value) {
	    return $id = value;
	}

	@Override
	public SubLObject setField3(SubLObject value) {
	    return $name = value;
	}

	@Override
	public SubLObject setField4(SubLObject value) {
	    return $bundles = value;
	}

	@Override
	public SubLObject setField5(SubLObject value) {
	    return $meta_layer = value;
	}

	@Override
	public SubLObject setField6(SubLObject value) {
	    return $guid = value;
	}

	public SubLObject $id = Lisp.NIL;

	public SubLObject $name = Lisp.NIL;

	public SubLObject $bundles = Lisp.NIL;

	public SubLObject $meta_layer = Lisp.NIL;

	public SubLObject $guid = Lisp.NIL;

	private static final SubLStructDeclNative structDecl = makeStructDeclNative(rkf_collaborator_nusketch.$nusketch_sketch_native.class, NUSKETCH_SKETCH, NUSKETCH_SKETCH_P, $list_alt37, $list_alt38, new String[] { "$id", "$name", "$bundles", "$meta_layer", "$guid" }, $list_alt39, $list_alt40,
		RKFCOLL_NUSKETCH_PRINT_NUSKETCH_SKETCH);
    }

    // defconstant
    public static final SubLSymbol $dtp_nusketch_sketch$ = makeSymbol("*DTP-NUSKETCH-SKETCH*");

    public static final SubLObject nusketch_sketch_print_function_trampoline(SubLObject v_object, SubLObject stream) {
	rkfcoll_nusketch_print_nusketch_sketch(v_object, stream, ZERO_INTEGER);
	return NIL;
    }

    public static final SubLObject nusketch_sketch_p(SubLObject v_object) {
	return v_object.getJavaClass() ==rkf_collaborator_nusketch.$nusketch_sketch_native.class ? ((SubLObject) (T)) : NIL;
    }

    public static final class $nusketch_sketch_p$UnaryFunction extends UnaryFunction {
	public $nusketch_sketch_p$UnaryFunction() {
	    super(extractFunctionNamed("NUSKETCH-SKETCH-P"));
	}

	@Override
	public SubLObject processItem(SubLObject arg1) {
	    return nusketch_sketch_p(arg1);
	}
    }

    public static final SubLObject nusketch_sketch_id(SubLObject v_object) {
	SubLSystemTrampolineFile.checkType(v_object, NUSKETCH_SKETCH_P);
	return v_object.getField2();
    }

    public static final SubLObject nusketch_sketch_name(SubLObject v_object) {
	SubLSystemTrampolineFile.checkType(v_object, NUSKETCH_SKETCH_P);
	return v_object.getField3();
    }

    public static final SubLObject nusketch_sketch_bundles(SubLObject v_object) {
	SubLSystemTrampolineFile.checkType(v_object, NUSKETCH_SKETCH_P);
	return v_object.getField4();
    }

    public static final SubLObject nusketch_sketch_meta_layer(SubLObject v_object) {
	SubLSystemTrampolineFile.checkType(v_object, NUSKETCH_SKETCH_P);
	return v_object.getField5();
    }

    public static final SubLObject nusketch_sketch_guid(SubLObject v_object) {
	SubLSystemTrampolineFile.checkType(v_object, NUSKETCH_SKETCH_P);
	return v_object.getField6();
    }

    public static final SubLObject _csetf_nusketch_sketch_id(SubLObject v_object, SubLObject value) {
	SubLSystemTrampolineFile.checkType(v_object, NUSKETCH_SKETCH_P);
	return v_object.setField2(value);
    }

    public static final SubLObject _csetf_nusketch_sketch_name(SubLObject v_object, SubLObject value) {
	SubLSystemTrampolineFile.checkType(v_object, NUSKETCH_SKETCH_P);
	return v_object.setField3(value);
    }

    public static final SubLObject _csetf_nusketch_sketch_bundles(SubLObject v_object, SubLObject value) {
	SubLSystemTrampolineFile.checkType(v_object, NUSKETCH_SKETCH_P);
	return v_object.setField4(value);
    }

    public static final SubLObject _csetf_nusketch_sketch_meta_layer(SubLObject v_object, SubLObject value) {
	SubLSystemTrampolineFile.checkType(v_object, NUSKETCH_SKETCH_P);
	return v_object.setField5(value);
    }

    public static final SubLObject _csetf_nusketch_sketch_guid(SubLObject v_object, SubLObject value) {
	SubLSystemTrampolineFile.checkType(v_object, NUSKETCH_SKETCH_P);
	return v_object.setField6(value);
    }

    public static final SubLObject make_nusketch_sketch(SubLObject arglist) {
	if (arglist == UNPROVIDED) {
	    arglist = NIL;
	}
	{
	    SubLObject v_new = new rkf_collaborator_nusketch.$nusketch_sketch_native();
	    SubLObject next = NIL;
	    for (next = arglist; NIL != next; next = cddr(next)) {
		{
		    SubLObject current_arg = next.first();
		    SubLObject current_value = cadr(next);
		    SubLObject pcase_var = current_arg;
		    if (pcase_var.eql($ID)) {
			_csetf_nusketch_sketch_id(v_new, current_value);
		    } else if (pcase_var.eql($NAME)) {
			_csetf_nusketch_sketch_name(v_new, current_value);
		    } else if (pcase_var.eql($BUNDLES)) {
			_csetf_nusketch_sketch_bundles(v_new, current_value);
		    } else if (pcase_var.eql($META_LAYER)) {
			_csetf_nusketch_sketch_meta_layer(v_new, current_value);
		    } else if (pcase_var.eql($GUID)) {
			_csetf_nusketch_sketch_guid(v_new, current_value);
		    } else {
			Errors.error($str_alt26$Invalid_slot__S_for_construction_, current_arg);
		    }

		}
	    }
	    return v_new;
	}
    }

    public static final SubLObject rkfcoll_nusketch_print_nusketch_sketch(SubLObject v_object, SubLObject stream, SubLObject depth) {
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    if (NIL != $print_readably$.getDynamicValue(thread)) {
		print_not_readable(v_object, stream);
	    } else {
		{
		    SubLObject v_object_3 = v_object;
		    SubLObject stream_4 = stream;
		    write_string($str_alt27$__, stream_4, UNPROVIDED, UNPROVIDED);
		    write(type_of(v_object_3), new SubLObject[] { $STREAM, stream_4 });
		    write_char(CHAR_space, stream_4);
		    format(stream, $str_alt58$_id__A____name__A_, nusketch_sketch_id(v_object), nusketch_sketch_name(v_object));
		    write_char(CHAR_greater, stream_4);
		}
	    }
	    return v_object;
	}
    }

    public static final class $nusketch_bundle_native extends SubLStructNative {
	@Override
	public SubLStructDecl getStructDecl() {
	    return rkf_collaborator_nusketch.$nusketch_bundle_native.structDecl;
	}

	@Override
	public SubLObject getField2() {
	    return $id;
	}

	@Override
	public SubLObject getField3() {
	    return $name;
	}

	@Override
	public SubLObject getField4() {
	    return $object_name;
	}

	@Override
	public SubLObject getField5() {
	    return $layers;
	}

	@Override
	public SubLObject setField2(SubLObject value) {
	    return $id = value;
	}

	@Override
	public SubLObject setField3(SubLObject value) {
	    return $name = value;
	}

	@Override
	public SubLObject setField4(SubLObject value) {
	    return $object_name = value;
	}

	@Override
	public SubLObject setField5(SubLObject value) {
	    return $layers = value;
	}

	public SubLObject $id = Lisp.NIL;

	public SubLObject $name = Lisp.NIL;

	public SubLObject $object_name = Lisp.NIL;

	public SubLObject $layers = Lisp.NIL;

	private static final SubLStructDeclNative structDecl = makeStructDeclNative(rkf_collaborator_nusketch.$nusketch_bundle_native.class, NUSKETCH_BUNDLE, NUSKETCH_BUNDLE_P, $list_alt61, $list_alt62, new String[] { "$id", "$name", "$object_name", "$layers" }, $list_alt63, $list_alt64,
		RKFCOLL_NUSKETCH_PRINT_NUSKETCH_BUNDLE);
    }

    // defconstant
    public static final SubLSymbol $dtp_nusketch_bundle$ = makeSymbol("*DTP-NUSKETCH-BUNDLE*");

    public static final SubLObject nusketch_bundle_print_function_trampoline(SubLObject v_object, SubLObject stream) {
	rkfcoll_nusketch_print_nusketch_bundle(v_object, stream, ZERO_INTEGER);
	return NIL;
    }

    public static final SubLObject nusketch_bundle_p(SubLObject v_object) {
	return v_object.getJavaClass() ==rkf_collaborator_nusketch.$nusketch_bundle_native.class ? ((SubLObject) (T)) : NIL;
    }

    public static final class $nusketch_bundle_p$UnaryFunction extends UnaryFunction {
	public $nusketch_bundle_p$UnaryFunction() {
	    super(extractFunctionNamed("NUSKETCH-BUNDLE-P"));
	}

	@Override
	public SubLObject processItem(SubLObject arg1) {
	    return nusketch_bundle_p(arg1);
	}
    }

    public static final SubLObject nusketch_bundle_id(SubLObject v_object) {
	SubLSystemTrampolineFile.checkType(v_object, NUSKETCH_BUNDLE_P);
	return v_object.getField2();
    }

    public static final SubLObject nusketch_bundle_name(SubLObject v_object) {
	SubLSystemTrampolineFile.checkType(v_object, NUSKETCH_BUNDLE_P);
	return v_object.getField3();
    }

    public static final SubLObject nusketch_bundle_object_name(SubLObject v_object) {
	SubLSystemTrampolineFile.checkType(v_object, NUSKETCH_BUNDLE_P);
	return v_object.getField4();
    }

    public static final SubLObject nusketch_bundle_layers(SubLObject v_object) {
	SubLSystemTrampolineFile.checkType(v_object, NUSKETCH_BUNDLE_P);
	return v_object.getField5();
    }

    public static final SubLObject _csetf_nusketch_bundle_id(SubLObject v_object, SubLObject value) {
	SubLSystemTrampolineFile.checkType(v_object, NUSKETCH_BUNDLE_P);
	return v_object.setField2(value);
    }

    public static final SubLObject _csetf_nusketch_bundle_name(SubLObject v_object, SubLObject value) {
	SubLSystemTrampolineFile.checkType(v_object, NUSKETCH_BUNDLE_P);
	return v_object.setField3(value);
    }

    public static final SubLObject _csetf_nusketch_bundle_object_name(SubLObject v_object, SubLObject value) {
	SubLSystemTrampolineFile.checkType(v_object, NUSKETCH_BUNDLE_P);
	return v_object.setField4(value);
    }

    public static final SubLObject _csetf_nusketch_bundle_layers(SubLObject v_object, SubLObject value) {
	SubLSystemTrampolineFile.checkType(v_object, NUSKETCH_BUNDLE_P);
	return v_object.setField5(value);
    }

    public static final SubLObject make_nusketch_bundle(SubLObject arglist) {
	if (arglist == UNPROVIDED) {
	    arglist = NIL;
	}
	{
	    SubLObject v_new = new rkf_collaborator_nusketch.$nusketch_bundle_native();
	    SubLObject next = NIL;
	    for (next = arglist; NIL != next; next = cddr(next)) {
		{
		    SubLObject current_arg = next.first();
		    SubLObject current_value = cadr(next);
		    SubLObject pcase_var = current_arg;
		    if (pcase_var.eql($ID)) {
			_csetf_nusketch_bundle_id(v_new, current_value);
		    } else if (pcase_var.eql($NAME)) {
			_csetf_nusketch_bundle_name(v_new, current_value);
		    } else if (pcase_var.eql($OBJECT_NAME)) {
			_csetf_nusketch_bundle_object_name(v_new, current_value);
		    } else if (pcase_var.eql($LAYERS)) {
			_csetf_nusketch_bundle_layers(v_new, current_value);
		    } else {
			Errors.error($str_alt26$Invalid_slot__S_for_construction_, current_arg);
		    }

		}
	    }
	    return v_new;
	}
    }

    public static final SubLObject rkfcoll_nusketch_print_nusketch_bundle(SubLObject v_object, SubLObject stream, SubLObject depth) {
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    if (NIL != $print_readably$.getDynamicValue(thread)) {
		print_not_readable(v_object, stream);
	    } else {
		{
		    SubLObject v_object_5 = v_object;
		    SubLObject stream_6 = stream;
		    write_string($str_alt27$__, stream_6, UNPROVIDED, UNPROVIDED);
		    write(type_of(v_object_5), new SubLObject[] { $STREAM, stream_6 });
		    write_char(CHAR_space, stream_6);
		    format(stream, $str_alt77$_id__A____name__A____object_name_, new SubLObject[] { nusketch_bundle_id(v_object), nusketch_bundle_name(v_object), nusketch_bundle_object_name(v_object) });
		    write_char(CHAR_greater, stream_6);
		}
	    }
	    return v_object;
	}
    }

    /**
     * Iterate through all bundles in sketch binding each to bundle and executing body
     */
    public static final SubLObject do_bundles(SubLObject macroform, SubLObject environment) {
	{
	    SubLObject datum = macroform.rest();
	    SubLObject current = datum;
	    destructuring_bind_must_consp(current, datum, $list_alt78);
	    {
		SubLObject temp = current.rest();
		current = current.first();
		{
		    SubLObject sketch = NIL;
		    SubLObject bundle = NIL;
		    destructuring_bind_must_consp(current, datum, $list_alt78);
		    sketch = current.first();
		    current = current.rest();
		    destructuring_bind_must_consp(current, datum, $list_alt78);
		    bundle = current.first();
		    current = current.rest();
		    if (NIL == current) {
			current = temp;
			{
			    SubLObject body = current;
			    return listS(CDOHASH, list(BUNDLE_ID, bundle, list(NUSKETCH_SKETCH_BUNDLES, sketch)), $list_alt80, append(body, NIL));
			}
		    } else {
			cdestructuring_bind_error(datum, $list_alt78);
		    }
		}
	    }
	}
	return NIL;
    }

    public static final SubLObject rkfcoll_nusketch_get_bundle_by_id(SubLObject nsession, SubLObject sketch_id, SubLObject bundle_id) {
	{
	    SubLObject sketch = rkfcoll_nusketch_get_sketch_by_id(nsession, sketch_id);
	    return gethash(bundle_id, nusketch_sketch_bundles(sketch), UNPROVIDED);
	}
    }

    public static final class $nusketch_layer_native extends SubLStructNative {
	@Override
	public SubLStructDecl getStructDecl() {
	    return rkf_collaborator_nusketch.$nusketch_layer_native.structDecl;
	}

	@Override
	public SubLObject getField2() {
	    return $id;
	}

	@Override
	public SubLObject getField3() {
	    return $name;
	}

	@Override
	public SubLObject getField4() {
	    return $object_name;
	}

	@Override
	public SubLObject setField2(SubLObject value) {
	    return $id = value;
	}

	@Override
	public SubLObject setField3(SubLObject value) {
	    return $name = value;
	}

	@Override
	public SubLObject setField4(SubLObject value) {
	    return $object_name = value;
	}

	public SubLObject $id = Lisp.NIL;

	public SubLObject $name = Lisp.NIL;

	public SubLObject $object_name = Lisp.NIL;

	private static final SubLStructDeclNative structDecl = makeStructDeclNative(rkf_collaborator_nusketch.$nusketch_layer_native.class, NUSKETCH_LAYER, NUSKETCH_LAYER_P, $list_alt83, $list_alt84, new String[] { "$id", "$name", "$object_name" }, $list_alt85, $list_alt86,
		RKFCOLL_NUSKETCH_PRINT_NUSKETCH_LAYER);
    }

    // defconstant
    public static final SubLSymbol $dtp_nusketch_layer$ = makeSymbol("*DTP-NUSKETCH-LAYER*");

    public static final SubLObject nusketch_layer_print_function_trampoline(SubLObject v_object, SubLObject stream) {
	rkfcoll_nusketch_print_nusketch_layer(v_object, stream, ZERO_INTEGER);
	return NIL;
    }

    public static final SubLObject nusketch_layer_p(SubLObject v_object) {
	return v_object.getJavaClass() ==rkf_collaborator_nusketch.$nusketch_layer_native.class ? ((SubLObject) (T)) : NIL;
    }

    public static final class $nusketch_layer_p$UnaryFunction extends UnaryFunction {
	public $nusketch_layer_p$UnaryFunction() {
	    super(extractFunctionNamed("NUSKETCH-LAYER-P"));
	}

	@Override
	public SubLObject processItem(SubLObject arg1) {
	    return nusketch_layer_p(arg1);
	}
    }

    public static final SubLObject nusketch_layer_id(SubLObject v_object) {
	SubLSystemTrampolineFile.checkType(v_object, NUSKETCH_LAYER_P);
	return v_object.getField2();
    }

    public static final SubLObject nusketch_layer_name(SubLObject v_object) {
	SubLSystemTrampolineFile.checkType(v_object, NUSKETCH_LAYER_P);
	return v_object.getField3();
    }

    public static final SubLObject nusketch_layer_object_name(SubLObject v_object) {
	SubLSystemTrampolineFile.checkType(v_object, NUSKETCH_LAYER_P);
	return v_object.getField4();
    }

    public static final SubLObject _csetf_nusketch_layer_id(SubLObject v_object, SubLObject value) {
	SubLSystemTrampolineFile.checkType(v_object, NUSKETCH_LAYER_P);
	return v_object.setField2(value);
    }

    public static final SubLObject _csetf_nusketch_layer_name(SubLObject v_object, SubLObject value) {
	SubLSystemTrampolineFile.checkType(v_object, NUSKETCH_LAYER_P);
	return v_object.setField3(value);
    }

    public static final SubLObject _csetf_nusketch_layer_object_name(SubLObject v_object, SubLObject value) {
	SubLSystemTrampolineFile.checkType(v_object, NUSKETCH_LAYER_P);
	return v_object.setField4(value);
    }

    public static final SubLObject make_nusketch_layer(SubLObject arglist) {
	if (arglist == UNPROVIDED) {
	    arglist = NIL;
	}
	{
	    SubLObject v_new = new rkf_collaborator_nusketch.$nusketch_layer_native();
	    SubLObject next = NIL;
	    for (next = arglist; NIL != next; next = cddr(next)) {
		{
		    SubLObject current_arg = next.first();
		    SubLObject current_value = cadr(next);
		    SubLObject pcase_var = current_arg;
		    if (pcase_var.eql($ID)) {
			_csetf_nusketch_layer_id(v_new, current_value);
		    } else if (pcase_var.eql($NAME)) {
			_csetf_nusketch_layer_name(v_new, current_value);
		    } else if (pcase_var.eql($OBJECT_NAME)) {
			_csetf_nusketch_layer_object_name(v_new, current_value);
		    } else {
			Errors.error($str_alt26$Invalid_slot__S_for_construction_, current_arg);
		    }

		}
	    }
	    return v_new;
	}
    }

    public static final SubLObject rkfcoll_nusketch_print_nusketch_layer(SubLObject v_object, SubLObject stream, SubLObject depth) {
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    if (NIL != $print_readably$.getDynamicValue(thread)) {
		print_not_readable(v_object, stream);
	    } else {
		{
		    SubLObject v_object_7 = v_object;
		    SubLObject stream_8 = stream;
		    write_string($str_alt27$__, stream_8, UNPROVIDED, UNPROVIDED);
		    write(type_of(v_object_7), new SubLObject[] { $STREAM, stream_8 });
		    write_char(CHAR_space, stream_8);
		    format(stream, $str_alt77$_id__A____name__A____object_name_, new SubLObject[] { nusketch_layer_id(v_object), nusketch_layer_name(v_object), nusketch_layer_object_name(v_object) });
		    write_char(CHAR_greater, stream_8);
		}
	    }
	    return v_object;
	}
    }

    /**
     * Iterate through all layers in bundle binding each to layer and executing body
     */
    public static final SubLObject do_layers(SubLObject macroform, SubLObject environment) {
	{
	    SubLObject datum = macroform.rest();
	    SubLObject current = datum;
	    destructuring_bind_must_consp(current, datum, $list_alt95);
	    {
		SubLObject temp = current.rest();
		current = current.first();
		{
		    SubLObject bundle = NIL;
		    SubLObject layer = NIL;
		    destructuring_bind_must_consp(current, datum, $list_alt95);
		    bundle = current.first();
		    current = current.rest();
		    destructuring_bind_must_consp(current, datum, $list_alt95);
		    layer = current.first();
		    current = current.rest();
		    if (NIL == current) {
			current = temp;
			{
			    SubLObject body = current;
			    return listS(CDOHASH, list(LAYER_ID, layer, list(NUSKETCH_BUNDLE_LAYERS, bundle)), $list_alt97, append(body, NIL));
			}
		    } else {
			cdestructuring_bind_error(datum, $list_alt95);
		    }
		}
	    }
	}
	return NIL;
    }

    public static final class $nusketch_glyph_native extends SubLStructNative {
	@Override
	public SubLStructDecl getStructDecl() {
	    return rkf_collaborator_nusketch.$nusketch_glyph_native.structDecl;
	}

	@Override
	public SubLObject getField2() {
	    return $id;
	}

	@Override
	public SubLObject getField3() {
	    return $name;
	}

	@Override
	public SubLObject getField4() {
	    return $object_name;
	}

	@Override
	public SubLObject setField2(SubLObject value) {
	    return $id = value;
	}

	@Override
	public SubLObject setField3(SubLObject value) {
	    return $name = value;
	}

	@Override
	public SubLObject setField4(SubLObject value) {
	    return $object_name = value;
	}

	public SubLObject $id = Lisp.NIL;

	public SubLObject $name = Lisp.NIL;

	public SubLObject $object_name = Lisp.NIL;

	private static final SubLStructDeclNative structDecl = makeStructDeclNative(rkf_collaborator_nusketch.$nusketch_glyph_native.class, NUSKETCH_GLYPH, NUSKETCH_GLYPH_P, $list_alt83, $list_alt84, new String[] { "$id", "$name", "$object_name" }, $list_alt100, $list_alt101,
		DEFAULT_STRUCT_PRINT_FUNCTION);
    }

    // defconstant
    public static final SubLSymbol $dtp_nusketch_glyph$ = makeSymbol("*DTP-NUSKETCH-GLYPH*");

    public static final SubLObject nusketch_glyph_print_function_trampoline(SubLObject v_object, SubLObject stream) {
	compatibility.default_struct_print_function(v_object, stream, ZERO_INTEGER);
	return NIL;
    }

    public static final SubLObject nusketch_glyph_p(SubLObject v_object) {
	return v_object.getJavaClass() ==rkf_collaborator_nusketch.$nusketch_glyph_native.class ? ((SubLObject) (T)) : NIL;
    }

    public static final class $nusketch_glyph_p$UnaryFunction extends UnaryFunction {
	public $nusketch_glyph_p$UnaryFunction() {
	    super(extractFunctionNamed("NUSKETCH-GLYPH-P"));
	}

	@Override
	public SubLObject processItem(SubLObject arg1) {
	    return nusketch_glyph_p(arg1);
	}
    }

    public static final SubLObject nusketch_glyph_id(SubLObject v_object) {
	SubLSystemTrampolineFile.checkType(v_object, NUSKETCH_GLYPH_P);
	return v_object.getField2();
    }

    public static final SubLObject nusketch_glyph_name(SubLObject v_object) {
	SubLSystemTrampolineFile.checkType(v_object, NUSKETCH_GLYPH_P);
	return v_object.getField3();
    }

    public static final SubLObject nusketch_glyph_object_name(SubLObject v_object) {
	SubLSystemTrampolineFile.checkType(v_object, NUSKETCH_GLYPH_P);
	return v_object.getField4();
    }

    public static final SubLObject _csetf_nusketch_glyph_id(SubLObject v_object, SubLObject value) {
	SubLSystemTrampolineFile.checkType(v_object, NUSKETCH_GLYPH_P);
	return v_object.setField2(value);
    }

    public static final SubLObject _csetf_nusketch_glyph_name(SubLObject v_object, SubLObject value) {
	SubLSystemTrampolineFile.checkType(v_object, NUSKETCH_GLYPH_P);
	return v_object.setField3(value);
    }

    public static final SubLObject _csetf_nusketch_glyph_object_name(SubLObject v_object, SubLObject value) {
	SubLSystemTrampolineFile.checkType(v_object, NUSKETCH_GLYPH_P);
	return v_object.setField4(value);
    }

    public static final SubLObject make_nusketch_glyph(SubLObject arglist) {
	if (arglist == UNPROVIDED) {
	    arglist = NIL;
	}
	{
	    SubLObject v_new = new rkf_collaborator_nusketch.$nusketch_glyph_native();
	    SubLObject next = NIL;
	    for (next = arglist; NIL != next; next = cddr(next)) {
		{
		    SubLObject current_arg = next.first();
		    SubLObject current_value = cadr(next);
		    SubLObject pcase_var = current_arg;
		    if (pcase_var.eql($ID)) {
			_csetf_nusketch_glyph_id(v_new, current_value);
		    } else if (pcase_var.eql($NAME)) {
			_csetf_nusketch_glyph_name(v_new, current_value);
		    } else if (pcase_var.eql($OBJECT_NAME)) {
			_csetf_nusketch_glyph_object_name(v_new, current_value);
		    } else {
			Errors.error($str_alt26$Invalid_slot__S_for_construction_, current_arg);
		    }

		}
	    }
	    return v_new;
	}
    }

    public static final SubLObject rkfcoll_nusketch_clear_nusketch_session(SubLObject nsession) {
	_csetf_nusketch_session_machine(nsession, NIL);
	_csetf_nusketch_session_port(nsession, NIL);
	if (nusketch_session_open_sketches(nsession).isHashtable()) {
	    {
		SubLObject cdohash_table = nusketch_session_open_sketches(nsession);
		SubLObject sketch_id = NIL;
		SubLObject sketch = NIL;
		{
		    final Iterator cdohash_iterator = getEntrySetIterator(cdohash_table);
		    try {
			while (iteratorHasNext(cdohash_iterator)) {
			    final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
			    sketch_id = getEntryKey(cdohash_entry);
			    sketch = getEntryValue(cdohash_entry);
			    rkfcoll_nusketch_clear_nusketch_sketch(sketch);
			}
		    } finally {
			releaseEntrySetIterator(cdohash_iterator);
		    }
		}
	    }
	    clrhash(nusketch_session_open_sketches(nsession));
	}
	_csetf_nusketch_session_open_sketches(nsession, NIL);
	_csetf_nusketch_session_active_sketch(nsession, NIL);
	_csetf_nusketch_session_active_bundle(nsession, NIL);
	_csetf_nusketch_session_active_layer(nsession, NIL);
	return nsession;
    }

    public static final SubLObject rkfcoll_nusketch_clear_nusketch_sketch(SubLObject sketch) {
	_csetf_nusketch_sketch_id(sketch, NIL);
	_csetf_nusketch_sketch_name(sketch, NIL);
	if (nusketch_sketch_bundles(sketch).isHashtable()) {
	    {
		SubLObject cdohash_table = nusketch_sketch_bundles(sketch);
		SubLObject bundle_id = NIL;
		SubLObject bundle = NIL;
		{
		    final Iterator cdohash_iterator = getEntrySetIterator(cdohash_table);
		    try {
			while (iteratorHasNext(cdohash_iterator)) {
			    final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
			    bundle_id = getEntryKey(cdohash_entry);
			    bundle = getEntryValue(cdohash_entry);
			    rkfcoll_nusketch_clear_nusketch_bundle(bundle);
			}
		    } finally {
			releaseEntrySetIterator(cdohash_iterator);
		    }
		}
	    }
	    clrhash(nusketch_sketch_bundles(sketch));
	}
	_csetf_nusketch_sketch_bundles(sketch, NIL);
	_csetf_nusketch_sketch_meta_layer(sketch, NIL);
	_csetf_nusketch_sketch_guid(sketch, NIL);
	return sketch;
    }

    public static final SubLObject rkfcoll_nusketch_clear_nusketch_bundle(SubLObject bundle) {
	_csetf_nusketch_bundle_id(bundle, NIL);
	_csetf_nusketch_bundle_name(bundle, NIL);
	_csetf_nusketch_bundle_object_name(bundle, NIL);
	if (nusketch_bundle_layers(bundle).isHashtable()) {
	    {
		SubLObject cdohash_table = nusketch_bundle_layers(bundle);
		SubLObject layer_id = NIL;
		SubLObject layer = NIL;
		{
		    final Iterator cdohash_iterator = getEntrySetIterator(cdohash_table);
		    try {
			while (iteratorHasNext(cdohash_iterator)) {
			    final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
			    layer_id = getEntryKey(cdohash_entry);
			    layer = getEntryValue(cdohash_entry);
			    rkfcoll_nusketch_clear_nusketch_layer(layer);
			}
		    } finally {
			releaseEntrySetIterator(cdohash_iterator);
		    }
		}
	    }
	    clrhash(nusketch_bundle_layers(bundle));
	}
	_csetf_nusketch_bundle_layers(bundle, NIL);
	return bundle;
    }

    public static final SubLObject rkfcoll_nusketch_clear_nusketch_layer(SubLObject layer) {
	_csetf_nusketch_layer_id(layer, NIL);
	_csetf_nusketch_layer_name(layer, NIL);
	_csetf_nusketch_layer_object_name(layer, NIL);
	return layer;
    }

    /**
     * This sets up the slots of a partially initialized nusketch-session
     */
    public static final SubLObject rkfcoll_nusketch_fill_session_info(SubLObject nsession) {
	{
	    SubLObject sketch_ids = rkfcoll_nusketch_send_message(nsession, $list_alt110);
	    SubLObject sketches = make_hash_table(TEN_INTEGER, UNPROVIDED, UNPROVIDED);
	    if (NIL != sketch_ids) {
		{
		    SubLObject cdolist_list_var = sketch_ids;
		    SubLObject sketch_id = NIL;
		    for (sketch_id = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), sketch_id = cdolist_list_var.first()) {
			sethash(sketch_id, sketches, rkfcoll_nusketch_fill_sketch_info(nsession, sketch_id));
		    }
		}
		_csetf_nusketch_session_open_sketches(nsession, sketches);
		_csetf_nusketch_session_active_sketch(nsession, rkfcoll_nusketch_send_message(nsession, $list_alt111));
		_csetf_nusketch_session_active_bundle(nsession, rkfcoll_nusketch_send_message(nsession, list(GET_ACTIVE_BUNDLE, $SKETCH_ID, nusketch_session_active_sketch(nsession))));
		_csetf_nusketch_session_active_layer(nsession, rkfcoll_nusketch_send_message(nsession, list(GET_ACTIVE_LAYER, $SKETCH_ID, nusketch_session_active_sketch(nsession))));
	    }
	    return nsession;
	}
    }

    /**
     * Given a nusketch session and a sketch id fills in the info for the sketch
     */
    public static final SubLObject rkfcoll_nusketch_fill_sketch_info(SubLObject nsession, SubLObject sketch_id) {
	{
	    SubLObject sketch = make_nusketch_sketch(UNPROVIDED);
	    SubLObject bundle_ids = rkfcoll_nusketch_send_message(nsession, list(LIST_BUNDLES, $SKETCH_ID, sketch_id));
	    SubLObject bundles = make_hash_table(TEN_INTEGER, UNPROVIDED, UNPROVIDED);
	    SubLObject cdolist_list_var = bundle_ids;
	    SubLObject bundle_id = NIL;
	    for (bundle_id = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), bundle_id = cdolist_list_var.first()) {
		sethash(bundle_id, bundles, rkfcoll_nusketch_fill_bundle_info(nsession, sketch_id, bundle_id));
	    }
	    _csetf_nusketch_sketch_id(sketch, sketch_id);
	    _csetf_nusketch_sketch_name(sketch, rkfcoll_nusketch_send_message(nsession, list(NAME_OF_SKETCH, $SKETCH_ID, sketch_id)));
	    _csetf_nusketch_sketch_bundles(sketch, bundles);
	    _csetf_nusketch_sketch_guid(sketch, rkfcoll_nusketch_lookup_or_create_sketch_guid(nsession, sketch));
	    {
		SubLObject meta_layer_id = rkfcoll_nusketch_send_message(nsession, list(GET_METALAYER, $SKETCH_ID, sketch_id));
		_csetf_nusketch_sketch_meta_layer(sketch, meta_layer_id);
	    }
	    return sketch;
	}
    }

    /**
     * given a nusketch session, sketch id and bundle id fills in all the bundle info
     */
    public static final SubLObject rkfcoll_nusketch_fill_bundle_info(SubLObject nsession, SubLObject sketch_id, SubLObject bundle_id) {
	{
	    SubLObject bundle = make_nusketch_bundle(UNPROVIDED);
	    SubLObject layer_ids = rkfcoll_nusketch_send_message(nsession, list(LIST_LAYERS, $SKETCH_ID, sketch_id, $BUNDLE_ID, bundle_id));
	    SubLObject layers = make_hash_table(TEN_INTEGER, UNPROVIDED, UNPROVIDED);
	    SubLObject cdolist_list_var = layer_ids;
	    SubLObject layer_id = NIL;
	    for (layer_id = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), layer_id = cdolist_list_var.first()) {
		sethash(layer_id, layers, rkfcoll_nusketch_fill_layer_info(nsession, sketch_id, layer_id));
	    }
	    _csetf_nusketch_bundle_id(bundle, bundle_id);
	    _csetf_nusketch_bundle_name(bundle, rkfcoll_nusketch_send_message(nsession, list(NAME_OF_BUNDLE, $SKETCH_ID, sketch_id, $BUNDLE_ID, bundle_id)));
	    _csetf_nusketch_bundle_object_name(bundle, rkfcoll_nusketch_send_message(nsession, list(OBJECT_NAME_OF_BUNDLE, $SKETCH_ID, sketch_id, $BUNDLE_ID, bundle_id)));
	    _csetf_nusketch_bundle_layers(bundle, layers);
	    return bundle;
	}
    }

    /**
     * retrieves the layer info
     */
    public static final SubLObject rkfcoll_nusketch_fill_layer_info(SubLObject nsession, SubLObject sketch_id, SubLObject layer_id) {
	{
	    SubLObject layer = make_nusketch_layer(UNPROVIDED);
	    _csetf_nusketch_layer_id(layer, layer_id);
	    _csetf_nusketch_layer_name(layer, rkfcoll_nusketch_send_message(nsession, list(NAME_OF_LAYER, $SKETCH_ID, sketch_id, $LAYER_ID, layer_id)));
	    _csetf_nusketch_layer_object_name(layer, rkfcoll_nusketch_send_message(nsession, list(OBJECT_NAME_OF_LAYER, $SKETCH_ID, sketch_id, $LAYER_ID, layer_id)));
	    return layer;
	}
    }

    /**
     * Given a session and entity, highlight the entity
     */
    public static final SubLObject rkfcoll_nusketch_highlight_entity(SubLObject nsession, SubLObject entity) {
	SubLSystemTrampolineFile.checkType(nsession, NUSKETCH_SESSION_P);
	SubLSystemTrampolineFile.checkType(entity, FORT_P);
	{
	    SubLObject sketch_id = nusketch_session_active_sketch(nsession);
	    SubLObject object_id = kb_mapping_utilities.fpred_value_in_any_mt(entity, $$coaObjectId, UNPROVIDED, UNPROVIDED, UNPROVIDED);
	    rkfcoll_nusketch_send_message(nsession, $list_alt127);
	    return rkfcoll_nusketch_send_message(nsession, list(HIGHLIGHT_ENTITY, $SKETCH_ID, sketch_id, $GLYPH_ID, object_id));
	}
    }

    /**
     * Given a session and entity, unhighlight the entity
     */
    public static final SubLObject rkfcoll_nusketch_unhighlight_entity(SubLObject nsession, SubLObject entity) {
	SubLSystemTrampolineFile.checkType(nsession, NUSKETCH_SESSION_P);
	SubLSystemTrampolineFile.checkType(entity, FORT_P);
	{
	    SubLObject sketch_id = nusketch_session_active_sketch(nsession);
	    SubLObject object_id = kb_mapping_utilities.fpred_value_in_any_mt(entity, $$coaObjectId, UNPROVIDED, UNPROVIDED, UNPROVIDED);
	    rkfcoll_nusketch_send_message(nsession, $list_alt127);
	    return rkfcoll_nusketch_send_message(nsession, list(UNHIGHLIGHT_ENTITY, $SKETCH_ID, sketch_id, $GLYPH_ID, object_id));
	}
    }

    /**
     * Main interface function to nuSketch
     */
    public static final SubLObject rkfcoll_nusketch_send_message(SubLObject nsession, SubLObject message) {
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    SubLSystemTrampolineFile.checkType(nsession, NUSKETCH_SESSION_P);
	    {
		SubLObject machine = nusketch_session_machine(nsession);
		SubLObject port = nusketch_session_port(nsession);
		SubLObject response = NIL;
		{
		    SubLObject _prev_bind_0 = rkf_collaborator_fire.$kqml_trace$.currentBinding(thread);
		    try {
			rkf_collaborator_fire.$kqml_trace$.bind(NIL, thread);
			{
			    SubLObject ignore_errors_tag = NIL;
			    try {
				{
				    SubLObject _prev_bind_0_9 = Errors.$error_handler$.currentBinding(thread);
				    try {
					Errors.$error_handler$.bind(symbol_function(IGNORE_ERRORS_HANDLER), thread);
					try {
					    {
						SubLObject channel = NIL;
						try {
						    channel = subl_promotions.open_tcp_stream_with_timeout(machine, port, NIL, $PRIVATE);
						    if (NIL != channel) {
							if (NIL != channel) {
							    rkf_collaborator_fire.kqml_send_message(channel, Environment.get_network_name(Environment.get_machine_name($$$unknown)), machine, $TELL, message);
							    response = rkf_collaborator_fire.kqml_read_message(channel, UNPROVIDED, UNPROVIDED);
							}
						    }
						} finally {
						    {
							SubLObject _prev_bind_0_10 = $is_thread_performing_cleanupP$.currentBinding(thread);
							try {
							    $is_thread_performing_cleanupP$.bind(T, thread);
							    if (NIL != channel) {
								close(channel, UNPROVIDED);
							    }
							} finally {
							    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_10, thread);
							}
						    }
						}
					    }
					} catch (Throwable catch_var) {
					    Errors.handleThrowable(catch_var, NIL);
					}
				    } finally {
					Errors.$error_handler$.rebind(_prev_bind_0_9, thread);
				    }
				}
			    } catch (Throwable ccatch_env_var) {
				ignore_errors_tag = Errors.handleThrowable(ccatch_env_var, $IGNORE_ERRORS_TARGET);
			    }
			}
		    } finally {
			rkf_collaborator_fire.$kqml_trace$.rebind(_prev_bind_0, thread);
		    }
		}
		if (NIL == response) {
		    return NIL;
		} else {
		    return rkf_collaborator_fire.kqml_object_content(response);
		}
	    }
	}
    }

    /**
     * make assertions to create bundle microtheories and populate with assertions
     */
    public static final SubLObject rkfcoll_nusketch_make_bundle_assertions(SubLObject nsession, SubLObject v_agenda) {
	{
	    SubLObject cdohash_table = nusketch_session_open_sketches(nsession);
	    SubLObject sketch_id = NIL;
	    SubLObject sketch = NIL;
	    {
		final Iterator cdohash_iterator = getEntrySetIterator(cdohash_table);
		try {
		    while (iteratorHasNext(cdohash_iterator)) {
			final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
			sketch_id = getEntryKey(cdohash_entry);
			sketch = getEntryValue(cdohash_entry);
			{
			    SubLObject cdohash_table_11 = nusketch_sketch_bundles(sketch);
			    SubLObject bundle_id = NIL;
			    SubLObject bundle = NIL;
			    {
				final Iterator cdohash_iterator_12 = getEntrySetIterator(cdohash_table_11);
				try {
				    while (iteratorHasNext(cdohash_iterator_12)) {
					final Map.Entry cdohash_entry_13 = iteratorNextEntry(cdohash_iterator_12);
					bundle_id = getEntryKey(cdohash_entry_13);
					bundle = getEntryValue(cdohash_entry_13);
					rkfcoll_nusketch_create_bundle_microtheory(bundle, v_agenda);
				    }
				} finally {
				    releaseEntrySetIterator(cdohash_iterator_12);
				}
			    }
			}
		    }
		} finally {
		    releaseEntrySetIterator(cdohash_iterator);
		}
	    }
	}
	return NIL;
    }

    public static final SubLObject rkfcoll_nusketch_assign_sketch_guid(SubLObject machine, SubLObject port, SubLObject guid) {
	if (guid == UNPROVIDED) {
	    guid = NIL;
	}
	{
	    SubLObject nsession = make_nusketch_session(UNPROVIDED);
	    _csetf_nusketch_session_machine(nsession, machine);
	    _csetf_nusketch_session_port(nsession, port);
	    if (NIL == rkfcoll_nusketch_valid_connection_p(nsession)) {
		Errors.error($str_alt136$Cannot_establish_proper_nuSketch_, machine, port);
	    }
	    format(T, $str_alt137$Getting_session_info_from_nuSketc, machine, port);
	    rkfcoll_nusketch_fill_session_info(nsession);
	    format(T, $str_alt138$_done___);
	    if (NIL == Guids.guid_p(guid)) {
		guid = Guids.new_guid();
	    }
	    format(T, $str_alt139$Stamping_sketch__A_hosted_on__A__, new SubLObject[] { nsession, machine, port, guid });
	    format(T, $str_alt140$NuSketch_is_told___A__, rkfcoll_nusketch_assert_sketch_guid(nsession, nusketch_session_active_sketch(nsession), guid));
	    {
		SubLObject nusketch_guid = rkfcoll_nusketch_lookup_sketch_guid(nsession, nusketch_session_active_sketch(nsession));
		if (NIL != Guids.guidE(nusketch_guid, guid)) {
		    format(T, $str_alt141$NuSketch_now_knows_that_the_GUID_, nusketch_guid);
		} else {
		    format(T, $str_alt142$Sorry__NuSketch_did_not_grasp_tha, guid, nusketch_guid);
		}
	    }
	    return guid;
	}
    }

    // defparameter
    public static final SubLSymbol $rkfcoll_nusketch_bundle_microtheory_genlmt$ = makeSymbol("*RKFCOLL-NUSKETCH-BUNDLE-MICROTHEORY-GENLMT*");

    public static final SubLObject rkfcoll_nusketch_create_bundle_microtheory(SubLObject bundle, SubLObject v_agenda) {
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    {
		SubLObject bundle_constant = rkfcoll_nusketch_find_or_create_constant(symbol_name(nusketch_bundle_object_name(bundle)), v_agenda);
		rkfcoll_nusketch_trace(format(NIL, $str_alt144$Creating_new_microtheory_for_bund, bundle_constant), v_agenda);
		uia_trampolines.uia_import_potentially_redundant_assertion(v_agenda, listS($$isa, bundle_constant, $list_alt146), $$UniversalVocabularyMt);
		uia_trampolines.uia_import_potentially_redundant_assertion(v_agenda, list($$genlMt, $rkfcoll_nusketch_bundle_microtheory_genlmt$.getDynamicValue(thread), bundle_constant), $$UniversalVocabularyMt);
		uia_trampolines.uia_import_potentially_redundant_assertion(v_agenda, listS($$genlMt, bundle_constant, $list_alt149), $$UniversalVocabularyMt);
		uia_trampolines.uia_import_potentially_redundant_assertion(v_agenda, listS($$genlMt, bundle_constant, $list_alt150), $$UniversalVocabularyMt);
		uia_trampolines.uia_import_potentially_redundant_assertion(v_agenda, listS($$genlMt, bundle_constant, $list_alt151), $$UniversalVocabularyMt);
		uia_trampolines.uia_import_potentially_redundant_assertion(v_agenda, listS($$genlMt, bundle_constant, $list_alt152), $$UniversalVocabularyMt);
		return bundle_constant;
	    }
	}
    }

    public static final SubLObject rkfcoll_nusketch_slurp_all_assertions(SubLObject nsession, SubLObject v_agenda) {
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    {
		SubLObject cdohash_table = nusketch_session_open_sketches(nsession);
		SubLObject sketch_id = NIL;
		SubLObject sketch = NIL;
		{
		    final Iterator cdohash_iterator = getEntrySetIterator(cdohash_table);
		    try {
			while (iteratorHasNext(cdohash_iterator)) {
			    final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
			    sketch_id = getEntryKey(cdohash_entry);
			    sketch = getEntryValue(cdohash_entry);
			    {
				SubLObject cdohash_table_14 = nusketch_sketch_bundles(sketch);
				SubLObject bundle_id = NIL;
				SubLObject bundle = NIL;
				{
				    final Iterator cdohash_iterator_15 = getEntrySetIterator(cdohash_table_14);
				    try {
					while (iteratorHasNext(cdohash_iterator_15)) {
					    final Map.Entry cdohash_entry_16 = iteratorNextEntry(cdohash_iterator_15);
					    bundle_id = getEntryKey(cdohash_entry_16);
					    bundle = getEntryValue(cdohash_entry_16);
					    {
						SubLObject bundle_constant = rkfcoll_nusketch_create_bundle_microtheory(bundle, v_agenda);
						SubLObject assertions = rkfcoll_nusketch_send_message(nsession, list(GET_FACTS_ABOUT_BUNDLE, $SKETCH_ID, nusketch_sketch_id(sketch), $BUNDLE_ID, nusketch_bundle_id(bundle)));
						SubLObject filtered_assertions = rkfcoll_nusketch_filter_assertions(assertions, v_agenda);
						SubLObject cdolist_list_var = filtered_assertions;
						SubLObject assertion = NIL;
						for (assertion = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), assertion = cdolist_list_var.first()) {
						    rkfcoll_nusketch_trace(format(NIL, $str_alt154$Asserting___A__, assertion), v_agenda);
						    {
							SubLObject tool_cycl = uia_tool_declaration.ui_operator_cycl($NUSKETCH);
							{
							    SubLObject _prev_bind_0 = rkf_macros.$rkf_asserting_tool$.currentBinding(thread);
							    try {
								rkf_macros.$rkf_asserting_tool$.bind(tool_cycl, thread);
								uia_trampolines.uia_assert_exact(v_agenda, assertion, bundle_constant);
							    } finally {
								rkf_macros.$rkf_asserting_tool$.rebind(_prev_bind_0, thread);
							    }
							}
						    }
						}
					    }
					}
				    } finally {
					releaseEntrySetIterator(cdohash_iterator_15);
				    }
				}
			    }
			}
		    } finally {
			releaseEntrySetIterator(cdohash_iterator);
		    }
		}
	    }
	    return NIL;
	}
    }

    // defparameter
    private static final SubLSymbol $rkfcoll_nusketch_filter_terms$ = makeSymbol("*RKFCOLL-NUSKETCH-FILTER-TERMS*");

    public static final SubLObject rkfcoll_nusketch_member_of_filtered_termsP(SubLObject v_term) {
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    return set.set_memberP(v_term, $rkfcoll_nusketch_filter_terms$.getDynamicValue(thread));
	}
    }

    public static final SubLObject rkfcoll_nusketch_contains_filtered_termP(SubLObject assertion) {
	{
	    SubLObject doneP = NIL;
	    if (NIL == doneP) {
		{
		    SubLObject csome_list_var = assertion;
		    SubLObject single_item = NIL;
		    for (single_item = csome_list_var.first(); !((NIL != doneP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest(), single_item = csome_list_var.first()) {
			if (single_item.isList()) {
			    doneP = rkfcoll_nusketch_contains_filtered_termP(single_item);
			} else {
			    doneP = rkfcoll_nusketch_member_of_filtered_termsP(single_item);
			}
		    }
		}
	    }
	    return doneP;
	}
    }

    public static final SubLObject rkfcoll_nusketch_filter_assertions(SubLObject assertions, SubLObject v_agenda) {
	{
	    SubLObject stripped_inkb_assertions = rkfcoll_nusketch_find_and_remove_inkb(assertions);
	    SubLObject filtered_assertions = rkfcoll_nusketch_remove_filtered_assertions(stripped_inkb_assertions);
	    SubLObject transformed_assertions = rkfcoll_nusketch_transform_assertions(filtered_assertions, v_agenda);
	    return transformed_assertions;
	}
    }

    public static final SubLObject rkfcoll_nusketch_find_and_remove_inkb(SubLObject assertions) {
	return remove(inKB, assertions, EQ, FIRST, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    /**
     * This needs no context because we are syntactically filtering, not
     * semantically.
     */
    public static final SubLObject rkfcoll_nusketch_remove_filtered_assertions(SubLObject assertions) {
	return remove_if($sym160$RKFCOLL_NUSKETCH_CONTAINS_FILTERED_TERM_, assertions, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    /**
     * Start the nuSketch polling thread
     */
    public static final SubLObject rkfcoll_nusketch_polling_start(SubLObject uima) {
	SubLSystemTrampolineFile.checkType(uima, USER_INTERACTION_META_AGENDA_P);
	{
	    SubLObject v_answer = NIL;
	    SubLObject lock = user_interaction_agenda.uima_state_lookup(uima, $POLLING_LOCK, UNPROVIDED);
	    SubLObject lock_17 = lock;
	    SubLObject release = NIL;
	    try {
		release = seize_lock(lock_17);
		{
		    SubLObject thread = user_interaction_agenda.uima_state_lookup(uima, $POLLING_THREAD, $NONE);
		    if ((thread == $NONE) || (thread == $STOPPED)) {
			{
			    SubLObject thread_args = list(uima);
			    thread = subl_promotions.make_process_with_args($$$nuSketch_Polling_Thread, UIAEXT_NUSKETCH_POLLING_THREAD, thread_args);
			    v_answer = thread;
			}
		    }
		}
	    } finally {
		if (NIL != release) {
		    release_lock(lock_17);
		}
	    }
	    return v_answer;
	}
    }

    /**
     * Stop the nuSketch polling thread
     */
    public static final SubLObject rkfcoll_nusketch_polling_stop(SubLObject uima) {
	SubLSystemTrampolineFile.checkType(uima, USER_INTERACTION_META_AGENDA_P);
	{
	    SubLObject v_answer = NIL;
	    SubLObject lock = user_interaction_agenda.uima_state_lookup(uima, $POLLING_LOCK, UNPROVIDED);
	    if (NIL != lock) {
		{
		    SubLObject lock_18 = lock;
		    SubLObject release = NIL;
		    try {
			release = seize_lock(lock_18);
			{
			    SubLObject thread = user_interaction_agenda.uima_state_lookup(uima, $POLLING_THREAD, UNPROVIDED);
			    if (NIL != processp(thread)) {
				try {
				    kill_process(thread);
				    v_answer = T;
				} finally {
				    {
					SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
					try {
					    bind($is_thread_performing_cleanupP$, T);
					    user_interaction_agenda.uima_state_update(uima, $POLLING_THREAD, $STOPPED);
					} finally {
					    rebind($is_thread_performing_cleanupP$, _prev_bind_0);
					}
				    }
				}
			    }
			}
		    } finally {
			if (NIL != release) {
			    release_lock(lock_18);
			}
		    }
		}
	    }
	    return v_answer;
	}
    }

    public static final SubLObject rkfcoll_nusketch_polling_thread(SubLObject uima) {
	{
	    SubLObject lock = user_interaction_agenda.uima_state_lookup(uima, $POLLING_LOCK, UNPROVIDED);
	    SubLObject error_message = NIL;
	    SubLObject lock_19 = lock;
	    SubLObject release = NIL;
	    try {
		release = seize_lock(lock_19);
		{
		    SubLObject thread = current_process();
		    user_interaction_agenda.uima_state_update(uima, $POLLING_THREAD, thread);
		}
	    } finally {
		if (NIL != release) {
		    release_lock(lock_19);
		}
	    }
	    try {
		{
		    SubLObject nsession = user_interaction_agenda.uima_state_lookup(uima, $NSESSION, UNPROVIDED);
		    try {
			{
			    SubLObject _prev_bind_0 = currentBinding(Errors.$error_handler$);
			    try {
				bind(Errors.$error_handler$, CATCH_ERROR_MESSAGE_HANDLER);
				try {
				    {
					SubLObject result = NIL;
					SubLObject action = NIL;
					SubLObject v_agenda = NIL;
					while (NIL == error_message) {
					    v_agenda = user_interaction_agenda.uima_current_agenda(uima);
					    result = rkfcoll_nusketch_send_message(nsession, $list_alt170);
					    action = symbol_name(result.first());
					    if (NIL != Strings.string_equal(action, $$$NIL, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
						sleep(FIVE_INTEGER);
					    } else if (NIL != Strings.string_equal(action, $str_alt172$new_entity_added, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
						rkfcoll_nusketch_add_new_entity(result, nsession, v_agenda);
					    } else if (NIL != Strings.string_equal(action, $str_alt173$new_bundle_added, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
						rkfcoll_nusketch_add_new_bundle(result, nsession, v_agenda);
					    } else if (NIL != Strings.string_equal(action, $str_alt174$entity_modified, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
						rkfcoll_nusketch_modify_entity(result, nsession, v_agenda);
					    } else if (NIL != Strings.string_equal(action, $str_alt175$entity_deleted, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
						rkfcoll_nusketch_delete_entity(result, nsession, v_agenda);
					    } else if (NIL != Strings.string_equal(action, $str_alt176$switch_active_sketch, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
						_csetf_nusketch_session_active_sketch(nsession, second(result));
					    } else if (NIL != Strings.string_equal(action, $str_alt177$switch_active_bundle, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
						_csetf_nusketch_session_active_sketch(nsession, second(result));
						_csetf_nusketch_session_active_bundle(nsession, third(result));
					    } else if (NIL != Strings.string_equal(action, $str_alt178$switch_active_layer, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
						_csetf_nusketch_session_active_sketch(nsession, second(result));
						_csetf_nusketch_session_active_layer(nsession, third(result));
					    } else if (NIL != Strings.string_equal(action, $str_alt179$sketch_closed, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
						rkfcoll_nusketch_close_sketch(result, nsession, v_agenda);
					    } else if (NIL != Strings.string_equal(action, $str_alt180$sketch_opened, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
						rkfcoll_nusketch_open_sketch(result, nsession, v_agenda);
					    } else if (NIL != Strings.string_equal(action, $str_alt181$ask_user_for_glyphs__done, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
						rkfcoll_nusketch_report_glyphs(result, v_agenda);
					    }

					    sleep(ONE_INTEGER);
					}
				    }
				} catch (Throwable catch_var) {
				    Errors.handleThrowable(catch_var, NIL);
				}
			    } finally {
				rebind(Errors.$error_handler$, _prev_bind_0);
			    }
			}
		    } catch (Throwable ccatch_env_var) {
			error_message = Errors.handleThrowable(ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
		    }
		}
	    } finally {
		{
		    SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
		    try {
			bind($is_thread_performing_cleanupP$, T);
			if (NIL != error_message) {
			    rkfcoll_nusketch_trace(format(NIL, $str_alt182$__Error_occurred_in_polling_threa, error_message), user_interaction_agenda.uima_current_agenda(uima));
			} else {
			    rkfcoll_nusketch_trace(format(NIL, $str_alt183$__Polling_thread_done___), user_interaction_agenda.uima_current_agenda(uima));
			}
			{
			    SubLObject lock_20 = lock;
			    SubLObject release_21 = NIL;
			    try {
				release_21 = seize_lock(lock_20);
				user_interaction_agenda.uima_state_update(uima, $POLLING_THREAD, $STOPPED);
			    } finally {
				if (NIL != release_21) {
				    release_lock(lock_20);
				}
			    }
			}
		    } finally {
			rebind($is_thread_performing_cleanupP$, _prev_bind_0);
		    }
		}
	    }
	}
	return NIL;
    }

    public static final SubLObject rkfcoll_nusketch_add_new_bundle(SubLObject result, SubLObject nsession, SubLObject v_agenda) {
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    {
		SubLObject sketch_id = second(result);
		SubLObject bundle_id = third(result);
		SubLObject assertions = rkfcoll_nusketch_send_message(nsession, list(GET_FACTS_ABOUT_BUNDLE, $SKETCH_ID, sketch_id, $BUNDLE_ID, bundle_id));
		SubLObject filtered_assertions = rkfcoll_nusketch_filter_assertions(assertions, v_agenda);
		SubLObject bundle = rkfcoll_nusketch_fill_bundle_info(nsession, sketch_id, bundle_id);
		SubLObject bundle_constant = rkfcoll_nusketch_create_bundle_microtheory(bundle, v_agenda);
		SubLObject cdolist_list_var = filtered_assertions;
		SubLObject assertion = NIL;
		for (assertion = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), assertion = cdolist_list_var.first()) {
		    rkfcoll_nusketch_trace(format(NIL, $str_alt154$Asserting___A__, assertion), v_agenda);
		    {
			SubLObject tool_cycl = uia_tool_declaration.ui_operator_cycl($NUSKETCH);
			{
			    SubLObject _prev_bind_0 = rkf_macros.$rkf_asserting_tool$.currentBinding(thread);
			    try {
				rkf_macros.$rkf_asserting_tool$.bind(tool_cycl, thread);
				uia_trampolines.uia_assert_exact(v_agenda, assertion, bundle_constant);
			    } finally {
				rkf_macros.$rkf_asserting_tool$.rebind(_prev_bind_0, thread);
			    }
			}
		    }
		}
	    }
	    return NIL;
	}
    }

    public static final SubLObject rkfcoll_nusketch_add_new_entity(SubLObject result, SubLObject nsession, SubLObject v_agenda) {
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    if (length(result).numE(THREE_INTEGER)) {
		{
		    SubLObject sketch_id = second(result);
		    SubLObject glyph_id = third(result);
		    SubLObject glyph_name = rkfcoll_nusketch_glyph_name(glyph_id);
		    SubLObject entity_constant = rkfcoll_nusketch_get_and_assert_isas_of_entity(nsession, sketch_id, glyph_id, v_agenda);
		    SubLObject namestring = rkfcoll_nusketch_make_namestring_assertion(nsession, sketch_id, glyph_name, v_agenda);
		    rkfcoll_nusketch_make_assertions(nsession, sketch_id, glyph_id, v_agenda);
		    uia_trampolines.uia_check_additional_rules_generic(v_agenda);
		    if (cb_uia_collaborators.$uiaext_salient_descriptor_priority$.getDynamicValue(thread) != $NONE) {
			if (NIL != namestring) {
			    uia_tools_salient_descriptor.uia_act_new_salient_descriptor(v_agenda, cb_uia_collaborators.$uiaext_salient_descriptor_priority$.getDynamicValue(thread), namestring, entity_constant);
			} else {
			    uia_tools_salient_descriptor.uia_act_new_salient_descriptor(v_agenda, cb_uia_collaborators.$uiaext_salient_descriptor_priority$.getDynamicValue(thread), subseq(string_utilities.to_string(entity_constant), TWO_INTEGER, UNPROVIDED), entity_constant);
			}
		    }
		    if (NIL != com.cyc.cycjava.cycl.isa.any_isaP(entity_constant, $list_alt184, user_interaction_agenda.uia_domain_interaction_mt(v_agenda), UNPROVIDED)) {
			cb_uiat_lexification_wizard.uia_act_new_lexification_wizard(v_agenda, entity_constant, $REQUIRED, UNPROVIDED);
		    }
		}
	    }
	    return NIL;
	}
    }

    public static final SubLObject rkfcoll_nusketch_bundle_constant_from_session(SubLObject v_agenda, SubLObject nsession) {
	{
	    SubLObject sketch_id = nusketch_session_active_sketch(nsession);
	    SubLObject current_bundle_id = nusketch_session_active_bundle(nsession);
	    SubLObject current_bundle = rkfcoll_nusketch_get_bundle_by_id(nsession, sketch_id, current_bundle_id);
	    SubLObject bundle_name = nusketch_bundle_object_name(current_bundle);
	    SubLObject bundle_constant = rkfcoll_nusketch_find_or_create_constant(symbol_name(bundle_name), v_agenda);
	    return bundle_constant;
	}
    }

    public static final SubLObject rkfcoll_nusketch_get_and_assert_isas_of_entity(SubLObject nsession, SubLObject sketch_id, SubLObject glyph_id, SubLObject v_agenda) {
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    {
		SubLObject current_bundle_id = nusketch_session_active_bundle(nsession);
		SubLObject current_bundle = rkfcoll_nusketch_get_bundle_by_id(nsession, sketch_id, current_bundle_id);
		SubLObject bundle_name = nusketch_bundle_object_name(current_bundle);
		SubLObject bundle_constant = rkfcoll_nusketch_find_or_create_constant(symbol_name(bundle_name), v_agenda);
		SubLObject glyph_name = rkfcoll_nusketch_glyph_name(glyph_id);
		SubLObject entity_constant = rkfcoll_nusketch_find_or_create_constant(glyph_name, v_agenda);
		SubLObject assertions = rkfcoll_nusketch_send_message(nsession, list(ASK, $SKETCH_ID, sketch_id, $QUERY, list(ist_Information, bundle_name, listS(isa, intern(glyph_name, UNPROVIDED), $list_alt190))));
		SubLObject transformed_assertions = rkfcoll_nusketch_filter_assertions(assertions, v_agenda);
		SubLObject final_assertions = rkfcoll_nusketch_remove_redundant_assertions(transformed_assertions);
		SubLObject cdolist_list_var = final_assertions;
		SubLObject assertion = NIL;
		for (assertion = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), assertion = cdolist_list_var.first()) {
		    if (cycl_utilities.formula_arg0(assertion) != $$isa) {
			rkfcoll_nusketch_trace(format(NIL, $str_alt191$What_the_hell__why_is__A_here_in_, assertion), v_agenda);
		    }
		    {
			SubLObject tool_cycl = uia_tool_declaration.ui_operator_cycl($NUSKETCH);
			{
			    SubLObject _prev_bind_0 = rkf_macros.$rkf_asserting_tool$.currentBinding(thread);
			    try {
				rkf_macros.$rkf_asserting_tool$.bind(tool_cycl, thread);
				uia_trampolines.uia_assert_exact(v_agenda, assertion, bundle_constant);
			    } finally {
				rkf_macros.$rkf_asserting_tool$.rebind(_prev_bind_0, thread);
			    }
			}
		    }
		    rkfcoll_nusketch_trace(format(NIL, $str_alt192$__isa_Asserting___A_in_Mt__A__, assertion, bundle_constant), v_agenda);
		}
		return entity_constant;
	    }
	}
    }

    /**
     * assert preferredNameString (if nameString exists in nuSketch) in lexical mt
     */
    public static final SubLObject rkfcoll_nusketch_make_namestring_assertion(SubLObject nsession, SubLObject sketch_id, SubLObject glyph_name, SubLObject v_agenda) {
	{
	    SubLObject entity_constant = rkfcoll_nusketch_find_or_create_constant(glyph_name, v_agenda);
	    SubLObject current_bundle_id = nusketch_session_active_bundle(nsession);
	    SubLObject current_bundle = rkfcoll_nusketch_get_bundle_by_id(nsession, sketch_id, current_bundle_id);
	    SubLObject bundle_name = symbol_name(nusketch_bundle_object_name(current_bundle));
	    SubLObject nusketch_namestring = rkfcoll_nusketch_send_message(nsession, list(ASK, $SKETCH_ID, sketch_id, $QUERY, list(ist_Information, intern(bundle_name, UNPROVIDED), listS(nameString, intern(glyph_name, UNPROVIDED), $list_alt190))));
	    SubLObject namestring = rkfcoll_nusketch_extract_namestring(nusketch_namestring);
	    if (NIL != namestring) {
		rkfcoll_nusketch_assert_preferred_namestring(entity_constant, namestring, v_agenda);
	    }
	    return namestring;
	}
    }

    public static final SubLObject rkfcoll_nusketch_make_assertions(SubLObject nsession, SubLObject sketch_id, SubLObject glyph_id, SubLObject v_agenda) {
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    {
		SubLObject domain_interaction_mt = user_interaction_agenda.uia_domain_interaction_mt(v_agenda);
		SubLObject current_bundle_id = nusketch_session_active_bundle(nsession);
		SubLObject current_bundle = rkfcoll_nusketch_get_bundle_by_id(nsession, sketch_id, current_bundle_id);
		SubLObject bundle_name = nusketch_bundle_object_name(current_bundle);
		SubLObject glyph_name = rkfcoll_nusketch_glyph_name(glyph_id);
		SubLObject entity_constant = rkfcoll_nusketch_find_or_create_constant(glyph_name, v_agenda);
		SubLObject bundle_constant = rkfcoll_nusketch_find_or_create_constant(symbol_name(bundle_name), v_agenda);
		SubLObject assertions = rkfcoll_nusketch_send_message(nsession, list(GET_FACTS_ABOUT_GLYPH, $SKETCH_ID, sketch_id, $GLYPH_ID, glyph_id));
		SubLObject filtered_assertions = rkfcoll_nusketch_filter_assertions(assertions, v_agenda);
		SubLObject final_assertions = rkfcoll_nusketch_remove_isas(filtered_assertions);
		if (NIL != com.cyc.cycjava.cycl.isa.isaP(entity_constant, $$ModernMilitaryUnit_Deployable, domain_interaction_mt, UNPROVIDED)) {
		    {
			SubLObject allegiance_assertion = rkfcoll_nusketch_send_message(nsession, list(ASK, $SKETCH_ID, sketch_id, $QUERY, list(ist_Information, bundle_name, listS(sovereignAllegianceOfOrg, intern(glyph_name, UNPROVIDED), $list_alt190))));
			SubLObject echelon_assertion = rkfcoll_nusketch_send_message(nsession, list(ASK, $SKETCH_ID, sketch_id, $QUERY, list(ist_Information, bundle_name, listS(echelonOfUnit, intern(glyph_name, UNPROVIDED), $list_alt190))));
			if (NIL != allegiance_assertion) {
			    final_assertions = cons(rkfcoll_nusketch_transform_assertion(rkfcoll_nusketch_transform_allegiance_assertion(allegiance_assertion), v_agenda), final_assertions);
			}
			if (NIL != echelon_assertion) {
			    final_assertions = cons(rkfcoll_nusketch_transform_assertion(rkfcoll_nusketch_transform_echelon_assertion(echelon_assertion), v_agenda), final_assertions);
			}
		    }
		}
		{
		    SubLObject cdolist_list_var = final_assertions;
		    SubLObject assertion = NIL;
		    for (assertion = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), assertion = cdolist_list_var.first()) {
			rkfcoll_nusketch_trace(format(NIL, $str_alt198$Asserting___A_in_Mt__A__, assertion, bundle_constant), v_agenda);
			{
			    SubLObject tool_cycl = uia_tool_declaration.ui_operator_cycl($NUSKETCH);
			    {
				SubLObject _prev_bind_0 = rkf_macros.$rkf_asserting_tool$.currentBinding(thread);
				try {
				    rkf_macros.$rkf_asserting_tool$.bind(tool_cycl, thread);
				    uia_trampolines.uia_assert_exact(v_agenda, assertion, bundle_constant);
				} finally {
				    rkf_macros.$rkf_asserting_tool$.rebind(_prev_bind_0, thread);
				}
			    }
			}
		    }
		}
	    }
	    return NIL;
	}
    }

    /**
     * remove isa assertions because these are done separately...
     */
    public static final SubLObject rkfcoll_nusketch_remove_isas(SubLObject assertions) {
	{
	    SubLObject filtered_assertions = NIL;
	    SubLObject cdolist_list_var = assertions;
	    SubLObject assertion = NIL;
	    for (assertion = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), assertion = cdolist_list_var.first()) {
		if (assertion.first() != $$isa) {
		    filtered_assertions = cons(assertion, filtered_assertions);
		}
	    }
	    return nreverse(filtered_assertions);
	}
    }

    public static final SubLObject rkfcoll_nusketch_remove_redundant_assertions(SubLObject assertions) {
	{
	    SubLObject cdolist_list_var = assertions;
	    SubLObject assertion = NIL;
	    for (assertion = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), assertion = cdolist_list_var.first()) {
		{
		    SubLObject cdolist_list_var_22 = assertions;
		    SubLObject inner_assertion = NIL;
		    for (inner_assertion = cdolist_list_var_22.first(); NIL != cdolist_list_var_22; cdolist_list_var_22 = cdolist_list_var_22.rest(), inner_assertion = cdolist_list_var_22.first()) {
			if (assertion != inner_assertion) {
			    if (NIL != genls.genl_in_any_mtP(third(assertion), third(inner_assertion))) {
				delete(inner_assertion, assertions, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
			    }
			}
		    }
		}
	    }
	}
	return assertions;
    }

    public static final SubLObject rkfcoll_nusketch_modify_entity(SubLObject result, SubLObject nsession, SubLObject v_agenda) {
	if (length(result).numE(FOUR_INTEGER)) {
	    {
		SubLObject sketch_id = second(result);
		SubLObject glyph_id = third(result);
		SubLObject modification = symbol_name(fourth(result));
		SubLObject glyph_name = rkfcoll_nusketch_glyph_name(glyph_id);
		SubLObject entity_constant = rkfcoll_nusketch_find_or_create_constant(glyph_name, v_agenda);
		_csetf_nusketch_session_active_sketch(nsession, sketch_id);
		if (NIL != Strings.string_equal(modification, $$$moved, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
		    rkfcoll_nusketch_trace(format(NIL, $str_alt200$Movement_detected_for__A__, entity_constant), v_agenda);
		} else if (NIL != Strings.string_equal(modification, $str_alt201$user_changed_knowledge, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
		    rkfcoll_nusketch_handle_knowledge_change(nsession, sketch_id, glyph_name, v_agenda);
		} else if (NIL != Strings.string_equal(modification, $$$rotated, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
		    rkfcoll_nusketch_trace(format(NIL, $str_alt203$Rotation_detected___), v_agenda);
		} else if (NIL != Strings.string_equal(modification, $$$redrawn, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
		    rkfcoll_nusketch_trace(format(NIL, $str_alt205$Redraw_detected___), v_agenda);
		}

	    }
	}
	return result;
    }

    /**
     * Eventually there will be other cases besides renaming we'd like to handle
     */
    public static final SubLObject rkfcoll_nusketch_handle_knowledge_change(SubLObject nsession, SubLObject sketch_id, SubLObject glyph_name, SubLObject v_agenda) {
	return rkfcoll_nusketch_handle_renaming(nsession, sketch_id, glyph_name, v_agenda);
    }

    public static final SubLObject rkfcoll_nusketch_handle_renaming(SubLObject nsession, SubLObject sketch_id, SubLObject glyph_name, SubLObject v_agenda) {
	{
	    SubLObject entity_constant = rkfcoll_nusketch_find_or_create_constant(glyph_name, v_agenda);
	    SubLObject current_bundle_id = nusketch_session_active_bundle(nsession);
	    SubLObject current_bundle = rkfcoll_nusketch_get_bundle_by_id(nsession, sketch_id, current_bundle_id);
	    SubLObject bundle_name = symbol_name(nusketch_bundle_object_name(current_bundle));
	    SubLObject nusketch_namestring = rkfcoll_nusketch_send_message(nsession, list(ASK, $SKETCH_ID, sketch_id, $QUERY, list(ist_Information, intern(bundle_name, UNPROVIDED), listS(nameString, intern(glyph_name, UNPROVIDED), $list_alt190))));
	    SubLObject namestring = rkfcoll_nusketch_extract_namestring(nusketch_namestring);
	    rkfcoll_nusketch_unassert_preferred_namestring(entity_constant, v_agenda);
	    return rkfcoll_nusketch_assert_preferred_namestring(entity_constant, namestring, v_agenda);
	}
    }

    /**
     * this function unpacks the results of a query and returns the namestring
     */
    public static final SubLObject rkfcoll_nusketch_extract_namestring(SubLObject assertion) {
	return third(third(assertion.first()));
    }

    /**
     * This will change the current #$preferredNameString assertions into
     * #$nameString assertions instead to clear the way for the new
     * #$preferredNameString assertion
     */
    public static final SubLObject rkfcoll_nusketch_unassert_preferred_namestring(SubLObject v_term, SubLObject v_agenda) {
	{
	    SubLObject namestrings = ask_utilities.ask_variable($sym206$_X, listS($$preferredNameString, v_term, $list_alt190), user_interaction_agenda.uia_lexical_interaction_mt(v_agenda), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
	    SubLObject cdolist_list_var = namestrings;
	    SubLObject namestring = NIL;
	    for (namestring = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), namestring = cdolist_list_var.first()) {
		{
		    SubLObject current_assertion = kb_indexing.find_gaf(list($$preferredNameString, v_term, namestring), user_interaction_agenda.uia_lexical_interaction_mt(v_agenda));
		    rkfcoll_nusketch_trace(format(NIL, $str_alt208$Unasserting___A__, current_assertion), v_agenda);
		    uia_trampolines.uia_unassert(v_agenda, current_assertion);
		    rkfcoll_nusketch_assert_namestring(v_term, namestring, v_agenda);
		}
	    }
	}
	return NIL;
    }

    public static final SubLObject rkfcoll_nusketch_assert_namestring(SubLObject v_term, SubLObject string, SubLObject v_agenda) {
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    {
		SubLObject assertion = list($$nameString, v_term, string);
		SubLObject mt = user_interaction_agenda.uia_lexical_interaction_mt(v_agenda);
		rkfcoll_nusketch_trace(format(NIL, $str_alt210$Asserting___A_in_mt__A__, assertion, mt), v_agenda);
		{
		    SubLObject tool_cycl = uia_tool_declaration.ui_operator_cycl($NUSKETCH);
		    {
			SubLObject _prev_bind_0 = rkf_macros.$rkf_asserting_tool$.currentBinding(thread);
			try {
			    rkf_macros.$rkf_asserting_tool$.bind(tool_cycl, thread);
			    uia_trampolines.uia_assert_exact(v_agenda, assertion, mt);
			} finally {
			    rkf_macros.$rkf_asserting_tool$.rebind(_prev_bind_0, thread);
			}
		    }
		}
	    }
	    return NIL;
	}
    }

    public static final SubLObject rkfcoll_nusketch_assert_preferred_namestring(SubLObject v_term, SubLObject string, SubLObject v_agenda) {
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    {
		SubLObject assertion = list($$preferredNameString, v_term, string);
		SubLObject mt = user_interaction_agenda.uia_lexical_interaction_mt(v_agenda);
		rkfcoll_nusketch_trace(format(NIL, $str_alt210$Asserting___A_in_mt__A__, assertion, mt), v_agenda);
		{
		    SubLObject tool_cycl = uia_tool_declaration.ui_operator_cycl($NUSKETCH);
		    {
			SubLObject _prev_bind_0 = rkf_macros.$rkf_asserting_tool$.currentBinding(thread);
			try {
			    rkf_macros.$rkf_asserting_tool$.bind(tool_cycl, thread);
			    uia_trampolines.uia_assert_exact(v_agenda, assertion, mt);
			} finally {
			    rkf_macros.$rkf_asserting_tool$.rebind(_prev_bind_0, thread);
			}
		    }
		}
	    }
	    return NIL;
	}
    }

    public static final SubLObject rkfcoll_nusketch_delete_entity(SubLObject result, SubLObject nsession, SubLObject v_agenda) {
	if (length(result).numE(THREE_INTEGER)) {
	    {
		SubLObject sketch_id = second(result);
		SubLObject glyph_id = third(result);
		SubLObject glyph_name = rkfcoll_nusketch_glyph_name(glyph_id);
		SubLObject entity_constant = rkfcoll_nusketch_find_or_create_constant(glyph_name, v_agenda);
		_csetf_nusketch_session_active_sketch(nsession, sketch_id);
		rkfcoll_nusketch_trace(format(NIL, $str_alt211$Potentially_deleting___A__, entity_constant), v_agenda);
		uia_tools_misc.uia_act_new_concept_killer(v_agenda, $REQUIRED, entity_constant);
		return NIL;
	    }
	} else {
	    return NIL;
	}
    }

    public static final SubLObject rkfcoll_nusketch_report_glyphs(SubLObject result, SubLObject v_agenda) {
	if (length(result).numE(FOUR_INTEGER)) {
	    {
		SubLObject request_id = second(result);
		SubLObject glyphs = fourth(result);
		SubLObject result_23 = NIL;
		if (glyphs.isCons()) {
		    {
			SubLObject cdolist_list_var = glyphs;
			SubLObject glyph = NIL;
			for (glyph = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), glyph = cdolist_list_var.first()) {
			    {
				SubLObject glyph_name = rkfcoll_nusketch_glyph_name(glyph);
				SubLObject constant = rkfcoll_nusketch_find_or_create_constant(glyph_name, v_agenda);
				if (NIL != constant) {
				    result_23 = cons(constant, result_23);
				}
			    }
			}
		    }
		} else {
		    result_23 = $ERROR;
		}
		return uia_coa_utilities.uia_coa_post_answer_for_pending_request(v_agenda, request_id, result_23);
	    }
	}
	return NIL;
    }

    public static final SubLObject rkfcoll_nusketch_close_sketch(SubLObject result, SubLObject nsession, SubLObject v_agenda) {
	if (length(result).numE(TWO_INTEGER)) {
	    {
		SubLObject sketch_id = second(result);
		SubLObject sketch = rkfcoll_nusketch_get_sketch_by_id(nsession, sketch_id);
		SubLObject sketch_name = nusketch_sketch_name(sketch);
		remhash(sketch_id, nusketch_session_open_sketches(nsession));
		_csetf_nusketch_session_active_sketch(nsession, rkfcoll_nusketch_send_message(nsession, $list_alt111));
		if (NIL != nusketch_session_active_sketch(nsession)) {
		    _csetf_nusketch_session_active_bundle(nsession, rkfcoll_nusketch_send_message(nsession, $list_alt213));
		}
		rkfcoll_nusketch_trace(format(NIL, $str_alt214$Closing_sketch__A__, sketch_name), v_agenda);
	    }
	}
	return NIL;
    }

    public static final SubLObject rkfcoll_nusketch_open_sketch(SubLObject result, SubLObject nsession, SubLObject v_agenda) {
	if (length(result).numE(THREE_INTEGER)) {
	    {
		SubLObject sketch_id = second(result);
		SubLObject file_path = third(result);
		sethash(sketch_id, nusketch_session_open_sketches(nsession), rkfcoll_nusketch_fill_sketch_info(nsession, sketch_id));
		_csetf_nusketch_session_active_sketch(nsession, rkfcoll_nusketch_send_message(nsession, $list_alt111));
		_csetf_nusketch_session_active_bundle(nsession, rkfcoll_nusketch_send_message(nsession, list(GET_ACTIVE_BUNDLE, $SKETCH_ID, nusketch_session_active_sketch(nsession))));
		_csetf_nusketch_session_active_layer(nsession, rkfcoll_nusketch_send_message(nsession, list(GET_ACTIVE_LAYER, $SKETCH_ID, nusketch_session_active_sketch(nsession))));
		{
		    SubLObject sketch = rkfcoll_nusketch_get_sketch_by_id(nsession, sketch_id);
		    SubLObject sketch_name = nusketch_sketch_name(sketch);
		    rkfcoll_nusketch_trace(format(NIL, $str_alt215$Opening_sketch__A__, sketch_name), v_agenda);
		}
	    }
	}
	return NIL;
    }

    public static final SubLObject rkfcoll_nusketch_send_ask_user_glyph_request(SubLObject v_agenda, SubLObject title, SubLObject prompt, SubLObject acceptable_glyph_lists, SubLObject n_aryP) {
	{
	    SubLObject nsession = user_interaction_agenda.uima_state_lookup(user_interaction_agenda.uia_meta_agenda(v_agenda), $NSESSION, UNPROVIDED);
	    SubLObject sketch_id = nusketch_session_active_sketch(nsession);
	    SubLObject bundle_id = nusketch_session_active_bundle(nsession);
	    SubLObject translated_glyphs = rkfcoll_nusketch_translate_acceptable_glyph_lists(v_agenda, acceptable_glyph_lists);
	    SubLObject request_id = NIL;
	    request_id = rkfcoll_nusketch_send_message(nsession, list(new SubLObject[] { ASK_USER_FOR_GLYPHS, $SKETCH_ID, sketch_id, $BUNDLE_ID, bundle_id, $TITLE, title, $PROMPT, prompt, $LOGO, $CYC_LOGO, $kw221$N_ARY_, n_aryP, $ACCEPTABLE_GLYPHS, translated_glyphs }));
	    return request_id;
	}
    }

    public static final SubLObject rkfcoll_nusketch_translate_acceptable_glyph_lists(SubLObject v_agenda, SubLObject glyph_lists) {
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    if (NIL == glyph_lists) {
		return list($ALL_GLYPHS);
	    }
	    {
		SubLObject translated_glyph_lists = NIL;
		SubLObject cdolist_list_var = glyph_lists;
		SubLObject glyph_list = NIL;
		for (glyph_list = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), glyph_list = cdolist_list_var.first()) {
		    {
			SubLObject new_glyph_list = NIL;
			if (!glyph_list.isCons()) {
			    if (NIL != $rkfcoll_nusketch_expand_all_glyphs$.getDynamicValue(thread)) {
				new_glyph_list = rkfcoll_nusketch_generate_all_glyphs_list(v_agenda);
			    } else {
				new_glyph_list = make_keyword($str_alt225$all_glyphs);
			    }
			} else {
			    {
				SubLObject cdolist_list_var_24 = glyph_list;
				SubLObject glyph = NIL;
				for (glyph = cdolist_list_var_24.first(); NIL != cdolist_list_var_24; cdolist_list_var_24 = cdolist_list_var_24.rest(), glyph = cdolist_list_var_24.first()) {
				    {
					SubLObject mapping = rkfcoll_nusketch_map_term_to_object_id(glyph);
					if (NIL == mapping) {
					    Errors.warn($str_alt226$Sorry__could_not_map_glyph__A_int);
					} else {
					    new_glyph_list = cons(mapping, new_glyph_list);
					}
				    }
				}
			    }
			    new_glyph_list = nreverse(new_glyph_list);
			}
			translated_glyph_lists = cons(new_glyph_list, translated_glyph_lists);
		    }
		}
		return nreverse(translated_glyph_lists);
	    }
	}
    }

    public static final SubLObject rkfcoll_nusketch_generate_all_glyphs_list(SubLObject v_agenda) {
	{
	    SubLObject nsession = user_interaction_agenda.uima_state_lookup(user_interaction_agenda.uia_meta_agenda(v_agenda), $NSESSION, UNPROVIDED);
	    SubLObject bundle_mt = rkfcoll_nusketch_bundle_constant_from_session(v_agenda, nsession);
	    SubLObject v_bindings = NIL;
	    SubLObject results = NIL;
	    v_bindings = rkf_query_utilities.rkf_query($list_alt227, bundle_mt, ZERO_INTEGER, NIL, UNPROVIDED, UNPROVIDED);
	    {
		SubLObject cdolist_list_var = v_bindings;
		SubLObject binding = NIL;
		for (binding = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), binding = cdolist_list_var.first()) {
		    {
			SubLObject datum = binding;
			SubLObject current = datum;
			SubLObject result = NIL;
			SubLObject justification = NIL;
			destructuring_bind_must_consp(current, datum, $list_alt228);
			result = current.first();
			current = current.rest();
			destructuring_bind_must_consp(current, datum, $list_alt228);
			justification = current.first();
			current = current.rest();
			if (NIL == current) {
			    {
				SubLObject datum_25 = assoc($sym229$_ID, result, UNPROVIDED, UNPROVIDED);
				SubLObject current_26 = datum_25;
				SubLObject variable = NIL;
				SubLObject id = NIL;
				destructuring_bind_must_consp(current_26, datum_25, $list_alt230);
				variable = current_26.first();
				current_26 = current_26.rest();
				id = current_26;
				results = cons(id, results);
			    }
			} else {
			    cdestructuring_bind_error(datum, $list_alt228);
			}
		    }
		}
	    }
	    return results;
	}
    }

    public static final SubLObject rkfcoll_nusketch_transform_echelon_assertion(SubLObject full_assertion) {
	{
	    SubLObject datum = full_assertion.first();
	    SubLObject current = datum;
	    SubLObject ist_info = NIL;
	    SubLObject bcase = NIL;
	    SubLObject assertion = NIL;
	    destructuring_bind_must_consp(current, datum, $list_alt231);
	    ist_info = current.first();
	    current = current.rest();
	    destructuring_bind_must_consp(current, datum, $list_alt231);
	    bcase = current.first();
	    current = current.rest();
	    destructuring_bind_must_consp(current, datum, $list_alt231);
	    assertion = current.first();
	    current = current.rest();
	    if (NIL == current) {
		{
		    SubLObject echelon_designation = symbol_name(third(assertion));
		    SubLObject echelon = string_utilities.string_substitute($$$MilitaryEchelon, $$$UnitDesignation, echelon_designation, UNPROVIDED);
		    return list(intern($$$isa, UNPROVIDED), second(assertion), intern(echelon, UNPROVIDED));
		}
	    } else {
		cdestructuring_bind_error(datum, $list_alt231);
	    }
	}
	return NIL;
    }

    public static final SubLObject rkfcoll_nusketch_transform_allegiance_assertion(SubLObject full_assertion) {
	{
	    SubLObject datum = full_assertion.first();
	    SubLObject current = datum;
	    SubLObject ist_info = NIL;
	    SubLObject bcase = NIL;
	    SubLObject assertion = NIL;
	    destructuring_bind_must_consp(current, datum, $list_alt231);
	    ist_info = current.first();
	    current = current.rest();
	    destructuring_bind_must_consp(current, datum, $list_alt231);
	    bcase = current.first();
	    current = current.rest();
	    destructuring_bind_must_consp(current, datum, $list_alt231);
	    assertion = current.first();
	    current = current.rest();
	    if (NIL == current) {
		{
		    SubLObject allegiance_designation = symbol_name(third(assertion));
		    SubLObject allegiance = string_utilities.string_substitute($$$Unit, $str_alt236$_Side, allegiance_designation, UNPROVIDED);
		    return list(intern($$$isa, UNPROVIDED), second(assertion), intern(allegiance, UNPROVIDED));
		}
	    } else {
		cdestructuring_bind_error(datum, $list_alt231);
	    }
	}
	return NIL;
    }

    /**
     * transform assertions of the form (|ist-Information| |bundle-name| (|isa| |X| |Y|))
     * or of the form (|isa| |X| |Y|) to (#$isa #$X #$Y)
     */
    public static final SubLObject rkfcoll_nusketch_transform_assertions(SubLObject assertions, SubLObject v_agenda) {
	{
	    SubLObject result = NIL;
	    SubLObject cdolist_list_var = assertions;
	    SubLObject assertion = NIL;
	    for (assertion = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), assertion = cdolist_list_var.first()) {
		if (assertion.first() == ist_Information) {
		    result = cons(rkfcoll_nusketch_transform_assertion(third(assertion), v_agenda), result);
		} else {
		    result = cons(rkfcoll_nusketch_transform_assertion(assertion, v_agenda), result);
		}
	    }
	    return nreverse(result);
	}
    }

    public static final SubLObject rkfcoll_nusketch_transform_assertion(SubLObject assertion, SubLObject v_agenda) {
	{
	    SubLObject result = NIL;
	    SubLObject cdolist_list_var = assertion;
	    SubLObject v_term = NIL;
	    for (v_term = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), v_term = cdolist_list_var.first()) {
		if (v_term.isList()) {
		    result = cons(rkfcoll_nusketch_transform_assertion(v_term, v_agenda), result);
		} else if (v_term.isNumber()) {
		    result = cons(v_term, result);
		} else if (v_term.isString()) {
		    result = cons(v_term, result);
		} else {
		    result = cons(rkfcoll_nusketch_find_or_create_constant(symbol_name(v_term), v_agenda), result);
		}

	    }
	    return nreverse(result);
	}
    }

    public static final SubLObject rkfcoll_nusketch_find_or_create_constant(SubLObject name, SubLObject v_agenda) {
	if (NIL != forts.fort_p(name)) {
	    return name;
	}
	if (!name.isString()) {
	    Errors.warn($str_alt237$_A_is_not_a_string___, name);
	}
	{
	    SubLObject potential_constant = ask_utilities.ask_variable($sym238$_TERM, list($$synonymousExternalConcept, $sym238$_TERM, $$NuSketchKB2002, name), $$NuSketchVocabularyMt, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
	    if (NIL != potential_constant) {
		return potential_constant.first();
	    }
	    potential_constant = constants_high.find_constant(name);
	    if (NIL != potential_constant) {
		return potential_constant;
	    }
	    potential_constant = rkfcoll_nusketch_find_nusketch_term(name, v_agenda);
	    if (NIL != potential_constant) {
		return potential_constant;
	    }
	    return rkfcoll_nusketch_add_nusketch_term(name, v_agenda);
	}
    }

    public static final SubLObject rkfcoll_nusketch_find_nusketch_term(SubLObject name, SubLObject v_agenda) {
	{
	    SubLObject nusketch_name = rkfcoll_nusketch_generate_unique_name(name, v_agenda);
	    return ask_utilities.ask_variable($sym238$_TERM, list($$synonymousExternalConcept, $sym238$_TERM, $$NuSketchKB2002, nusketch_name), $$NuSketchVocabularyMt, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED).first();
	}
    }

    public static final SubLObject rkfcoll_nusketch_add_nusketch_term(SubLObject name, SubLObject v_agenda) {
	{
	    SubLObject nusketch_name = rkfcoll_nusketch_generate_unique_name(name, v_agenda);
	    SubLObject domain_interaction_mt = user_interaction_agenda.uia_domain_interaction_mt(v_agenda);
	    SubLObject lexical_interaction_mt = user_interaction_agenda.uia_lexical_interaction_mt(v_agenda);
	    SubLObject new_term = uia_trampolines.uia_create_named_concept(name, domain_interaction_mt, lexical_interaction_mt);
	    rkfcoll_nusketch_add_synonymous_assertion(nusketch_name, new_term, v_agenda);
	    return new_term;
	}
    }

    public static final SubLObject rkfcoll_nusketch_add_synonymous_assertion(SubLObject name, SubLObject v_term, SubLObject v_agenda) {
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    {
		SubLObject tool_cycl = uia_tool_declaration.ui_operator_cycl($NUSKETCH);
		{
		    SubLObject _prev_bind_0 = rkf_macros.$rkf_asserting_tool$.currentBinding(thread);
		    try {
			rkf_macros.$rkf_asserting_tool$.bind(tool_cycl, thread);
			uia_trampolines.uia_assert_exact(v_agenda, list($$synonymousExternalConcept, v_term, $$NuSketchKB2002, name), $$NuSketchVocabularyMt);
		    } finally {
			rkf_macros.$rkf_asserting_tool$.rebind(_prev_bind_0, thread);
		    }
		}
	    }
	    return NIL;
	}
    }

    public static final SubLObject rkfcoll_nusketch_generate_unique_name(SubLObject name, SubLObject v_agenda) {
	{
	    SubLObject nsession = user_interaction_agenda.uima_state_lookup(user_interaction_agenda.uia_meta_agenda(v_agenda), $NSESSION, UNPROVIDED);
	    SubLObject sketch_id = nusketch_session_active_sketch(nsession);
	    SubLObject sketch = rkfcoll_nusketch_get_sketch_by_id(nsession, sketch_id);
	    SubLObject sketch_guid = nusketch_sketch_guid(sketch);
	    return cconcatenate(name, new SubLObject[] { $str_alt242$_, Guids.guid_to_string(sketch_guid) });
	}
    }

    /**
     *
     *
     * @unknown this relies in a BAD way on a correctly rebound agenda, which is
    now almost universally true, but still VERY VERY suboptimal.
     */
    public static final SubLObject rkfcoll_nusketch_lookup_or_create_sketch_guid(SubLObject nsession, SubLObject sketch) {
	{
	    SubLObject v_answer = rkfcoll_nusketch_lookup_sketch_guid(nsession, sketch);
	    SubLObject guid = NIL;
	    if (NIL != v_answer) {
		return Guids.string_to_guid(second(third(v_answer.first())));
	    }
	    if ((NIL != user_interaction_agenda.user_interaction_meta_agenda_p(cb_user_interaction_agenda.cb_current_uima())) && (NIL != Guids.guid_p(user_interaction_agenda.uima_state_lookup(cb_user_interaction_agenda.cb_current_uima(), $NUSKETCH_GUID, UNPROVIDED)))) {
		guid = user_interaction_agenda.uima_state_lookup(cb_user_interaction_agenda.cb_current_uima(), $NUSKETCH_GUID, UNPROVIDED);
	    }
	    if (NIL == guid) {
		guid = Guids.new_guid();
	    }
	    rkfcoll_nusketch_assert_sketch_guid(nsession, sketch, guid);
	    return guid;
	}
    }

    public static final SubLObject rkfcoll_nusketch_lookup_sketch_guid(SubLObject nsession, SubLObject sketch) {
	{
	    SubLObject sketch_id = nusketch_sketch_id(sketch);
	    SubLObject sketch_object_name = nusketch_sketch_name(sketch);
	    return rkfcoll_nusketch_send_message(nsession, list(ASK, $SKETCH_ID, sketch_id, $QUERY, listS(ist_Information, sketch_object_name, $list_alt244)));
	}
    }

    public static final SubLObject rkfcoll_nusketch_assert_sketch_guid(SubLObject nsession, SubLObject sketch, SubLObject guid) {
	{
	    SubLObject sketch_id = nusketch_sketch_id(sketch);
	    SubLObject sketch_object_name = nusketch_sketch_name(sketch);
	    return rkfcoll_nusketch_send_message(nsession, list(TELL, $SKETCH_ID, sketch_id, $FACT, list(ist_Information, sketch_object_name, list(guid, Guids.guid_to_string(guid)))));
	}
    }

    public static final SubLObject rkfcoll_nusketch_glyph_name(SubLObject id) {
	return cconcatenate($str_alt248$Object_, string_utilities.to_string(id));
    }

    public static final SubLObject rkfcoll_nusketch_map_term_to_object_id(SubLObject constant) {
	return kb_mapping_utilities.fpred_value_in_any_mt(constant, $$coaObjectId, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    /**
     * Valid values are :mumble, :standard-err, or :off
     */
    // defparameter
    public static final SubLSymbol $nusketch_trace$ = makeSymbol("*NUSKETCH-TRACE*");

    public static final SubLObject rkfcoll_nusketch_trace(SubLObject message, SubLObject v_agenda) {
	if (v_agenda == UNPROVIDED) {
	    v_agenda = NIL;
	}
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    {
		SubLObject pcase_var = $nusketch_trace$.getDynamicValue(thread);
		if (pcase_var.eql($MUMBLE)) {
		    if (NIL != v_agenda) {
			user_interaction_agenda.uia_act_new_comment(v_agenda, message);
		    } else {
			Errors.warn(message);
		    }
		} else if (pcase_var.eql($STANDARD_ERR)) {
		    Errors.warn(message);
		} else if (pcase_var.eql($OFF)) {
		}

	    }
	    return NIL;
	}
    }

    public static final SubLObject rkfcoll_nusketch_valid_connection_p(SubLObject nsession) {
	return makeBoolean((NIL != nusketch_session_p(nsession)) && (NIL != rkfcoll_nusketch_send_message(nsession, $list_alt252)));
    }

    public static final SubLObject get_nusketch_connection_test_case_nsession(SubLObject nusketch_connection_test_case) {
	return classes.subloop_get_access_protected_instance_slot(nusketch_connection_test_case, THREE_INTEGER, NSESSION);
    }

    public static final SubLObject set_nusketch_connection_test_case_nsession(SubLObject nusketch_connection_test_case, SubLObject value) {
	return classes.subloop_set_access_protected_instance_slot(nusketch_connection_test_case, value, THREE_INTEGER, NSESSION);
    }

    public static final SubLObject subloop_reserved_initialize_nusketch_connection_test_case_class(SubLObject new_instance) {
	classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
	classes.subloop_initialize_slot(new_instance, TEST_CASE, MODULE, NIL);
	classes.subloop_initialize_slot(new_instance, TEST_CASE, CATEGORIES, NIL);
	classes.subloop_initialize_slot(new_instance, TEST_CASE, SUITES, NIL);
	classes.subloop_initialize_slot(new_instance, TEST_CASE, TEST_METHODS, NIL);
	classes.subloop_initialize_slot(new_instance, TEST_CASE, ENABLED, NIL);
	classes.subloop_initialize_slot(new_instance, TEST_CASE, LOCK, NIL);
	return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_nusketch_connection_test_case_instance(SubLObject new_instance) {
	classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
	classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
	classes.subloop_initialize_slot(new_instance, TEST_CASE, RESULT, NIL);
	classes.subloop_initialize_slot(new_instance, TEST_CASE, TEST_METHOD, NIL);
	classes.subloop_initialize_slot(new_instance, NUSKETCH_CONNECTION_TEST_CASE, NSESSION, NIL);
	return NIL;
    }

    public static final SubLObject nusketch_connection_test_case_p(SubLObject nusketch_connection_test_case) {
	return classes.subloop_instanceof_class(nusketch_connection_test_case, NUSKETCH_CONNECTION_TEST_CASE);
    }

    public static final SubLObject declare_rkf_collaborator_nusketch_file() {
	declareFunction("nusketch_session_print_function_trampoline", "NUSKETCH-SESSION-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
	declareFunction("nusketch_session_p", "NUSKETCH-SESSION-P", 1, 0, false);
	new rkf_collaborator_nusketch.$nusketch_session_p$UnaryFunction();
	declareFunction("nusketch_session_machine", "NUSKETCH-SESSION-MACHINE", 1, 0, false);
	declareFunction("nusketch_session_port", "NUSKETCH-SESSION-PORT", 1, 0, false);
	declareFunction("nusketch_session_open_sketches", "NUSKETCH-SESSION-OPEN-SKETCHES", 1, 0, false);
	declareFunction("nusketch_session_active_sketch", "NUSKETCH-SESSION-ACTIVE-SKETCH", 1, 0, false);
	declareFunction("nusketch_session_active_bundle", "NUSKETCH-SESSION-ACTIVE-BUNDLE", 1, 0, false);
	declareFunction("nusketch_session_active_layer", "NUSKETCH-SESSION-ACTIVE-LAYER", 1, 0, false);
	declareFunction("_csetf_nusketch_session_machine", "_CSETF-NUSKETCH-SESSION-MACHINE", 2, 0, false);
	declareFunction("_csetf_nusketch_session_port", "_CSETF-NUSKETCH-SESSION-PORT", 2, 0, false);
	declareFunction("_csetf_nusketch_session_open_sketches", "_CSETF-NUSKETCH-SESSION-OPEN-SKETCHES", 2, 0, false);
	declareFunction("_csetf_nusketch_session_active_sketch", "_CSETF-NUSKETCH-SESSION-ACTIVE-SKETCH", 2, 0, false);
	declareFunction("_csetf_nusketch_session_active_bundle", "_CSETF-NUSKETCH-SESSION-ACTIVE-BUNDLE", 2, 0, false);
	declareFunction("_csetf_nusketch_session_active_layer", "_CSETF-NUSKETCH-SESSION-ACTIVE-LAYER", 2, 0, false);
	declareFunction("make_nusketch_session", "MAKE-NUSKETCH-SESSION", 0, 1, false);
	declareFunction("rkfcoll_nusketch_print_nusketch_session", "RKFCOLL-NUSKETCH-PRINT-NUSKETCH-SESSION", 3, 0, false);
	declareMacro("do_sketches", "DO-SKETCHES");
	declareFunction("rkfcoll_nusketch_get_sketch_by_id", "RKFCOLL-NUSKETCH-GET-SKETCH-BY-ID", 2, 0, false);
	declareFunction("nusketch_sketch_print_function_trampoline", "NUSKETCH-SKETCH-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
	declareFunction("nusketch_sketch_p", "NUSKETCH-SKETCH-P", 1, 0, false);
	new rkf_collaborator_nusketch.$nusketch_sketch_p$UnaryFunction();
	declareFunction("nusketch_sketch_id", "NUSKETCH-SKETCH-ID", 1, 0, false);
	declareFunction("nusketch_sketch_name", "NUSKETCH-SKETCH-NAME", 1, 0, false);
	declareFunction("nusketch_sketch_bundles", "NUSKETCH-SKETCH-BUNDLES", 1, 0, false);
	declareFunction("nusketch_sketch_meta_layer", "NUSKETCH-SKETCH-META-LAYER", 1, 0, false);
	declareFunction("nusketch_sketch_guid", "NUSKETCH-SKETCH-GUID", 1, 0, false);
	declareFunction("_csetf_nusketch_sketch_id", "_CSETF-NUSKETCH-SKETCH-ID", 2, 0, false);
	declareFunction("_csetf_nusketch_sketch_name", "_CSETF-NUSKETCH-SKETCH-NAME", 2, 0, false);
	declareFunction("_csetf_nusketch_sketch_bundles", "_CSETF-NUSKETCH-SKETCH-BUNDLES", 2, 0, false);
	declareFunction("_csetf_nusketch_sketch_meta_layer", "_CSETF-NUSKETCH-SKETCH-META-LAYER", 2, 0, false);
	declareFunction("_csetf_nusketch_sketch_guid", "_CSETF-NUSKETCH-SKETCH-GUID", 2, 0, false);
	declareFunction("make_nusketch_sketch", "MAKE-NUSKETCH-SKETCH", 0, 1, false);
	declareFunction("rkfcoll_nusketch_print_nusketch_sketch", "RKFCOLL-NUSKETCH-PRINT-NUSKETCH-SKETCH", 3, 0, false);
	declareFunction("nusketch_bundle_print_function_trampoline", "NUSKETCH-BUNDLE-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
	declareFunction("nusketch_bundle_p", "NUSKETCH-BUNDLE-P", 1, 0, false);
	new rkf_collaborator_nusketch.$nusketch_bundle_p$UnaryFunction();
	declareFunction("nusketch_bundle_id", "NUSKETCH-BUNDLE-ID", 1, 0, false);
	declareFunction("nusketch_bundle_name", "NUSKETCH-BUNDLE-NAME", 1, 0, false);
	declareFunction("nusketch_bundle_object_name", "NUSKETCH-BUNDLE-OBJECT-NAME", 1, 0, false);
	declareFunction("nusketch_bundle_layers", "NUSKETCH-BUNDLE-LAYERS", 1, 0, false);
	declareFunction("_csetf_nusketch_bundle_id", "_CSETF-NUSKETCH-BUNDLE-ID", 2, 0, false);
	declareFunction("_csetf_nusketch_bundle_name", "_CSETF-NUSKETCH-BUNDLE-NAME", 2, 0, false);
	declareFunction("_csetf_nusketch_bundle_object_name", "_CSETF-NUSKETCH-BUNDLE-OBJECT-NAME", 2, 0, false);
	declareFunction("_csetf_nusketch_bundle_layers", "_CSETF-NUSKETCH-BUNDLE-LAYERS", 2, 0, false);
	declareFunction("make_nusketch_bundle", "MAKE-NUSKETCH-BUNDLE", 0, 1, false);
	declareFunction("rkfcoll_nusketch_print_nusketch_bundle", "RKFCOLL-NUSKETCH-PRINT-NUSKETCH-BUNDLE", 3, 0, false);
	declareMacro("do_bundles", "DO-BUNDLES");
	declareFunction("rkfcoll_nusketch_get_bundle_by_id", "RKFCOLL-NUSKETCH-GET-BUNDLE-BY-ID", 3, 0, false);
	declareFunction("nusketch_layer_print_function_trampoline", "NUSKETCH-LAYER-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
	declareFunction("nusketch_layer_p", "NUSKETCH-LAYER-P", 1, 0, false);
	new rkf_collaborator_nusketch.$nusketch_layer_p$UnaryFunction();
	declareFunction("nusketch_layer_id", "NUSKETCH-LAYER-ID", 1, 0, false);
	declareFunction("nusketch_layer_name", "NUSKETCH-LAYER-NAME", 1, 0, false);
	declareFunction("nusketch_layer_object_name", "NUSKETCH-LAYER-OBJECT-NAME", 1, 0, false);
	declareFunction("_csetf_nusketch_layer_id", "_CSETF-NUSKETCH-LAYER-ID", 2, 0, false);
	declareFunction("_csetf_nusketch_layer_name", "_CSETF-NUSKETCH-LAYER-NAME", 2, 0, false);
	declareFunction("_csetf_nusketch_layer_object_name", "_CSETF-NUSKETCH-LAYER-OBJECT-NAME", 2, 0, false);
	declareFunction("make_nusketch_layer", "MAKE-NUSKETCH-LAYER", 0, 1, false);
	declareFunction("rkfcoll_nusketch_print_nusketch_layer", "RKFCOLL-NUSKETCH-PRINT-NUSKETCH-LAYER", 3, 0, false);
	declareMacro("do_layers", "DO-LAYERS");
	declareFunction("nusketch_glyph_print_function_trampoline", "NUSKETCH-GLYPH-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
	declareFunction("nusketch_glyph_p", "NUSKETCH-GLYPH-P", 1, 0, false);
	new rkf_collaborator_nusketch.$nusketch_glyph_p$UnaryFunction();
	declareFunction("nusketch_glyph_id", "NUSKETCH-GLYPH-ID", 1, 0, false);
	declareFunction("nusketch_glyph_name", "NUSKETCH-GLYPH-NAME", 1, 0, false);
	declareFunction("nusketch_glyph_object_name", "NUSKETCH-GLYPH-OBJECT-NAME", 1, 0, false);
	declareFunction("_csetf_nusketch_glyph_id", "_CSETF-NUSKETCH-GLYPH-ID", 2, 0, false);
	declareFunction("_csetf_nusketch_glyph_name", "_CSETF-NUSKETCH-GLYPH-NAME", 2, 0, false);
	declareFunction("_csetf_nusketch_glyph_object_name", "_CSETF-NUSKETCH-GLYPH-OBJECT-NAME", 2, 0, false);
	declareFunction("make_nusketch_glyph", "MAKE-NUSKETCH-GLYPH", 0, 1, false);
	declareFunction("rkfcoll_nusketch_clear_nusketch_session", "RKFCOLL-NUSKETCH-CLEAR-NUSKETCH-SESSION", 1, 0, false);
	declareFunction("rkfcoll_nusketch_clear_nusketch_sketch", "RKFCOLL-NUSKETCH-CLEAR-NUSKETCH-SKETCH", 1, 0, false);
	declareFunction("rkfcoll_nusketch_clear_nusketch_bundle", "RKFCOLL-NUSKETCH-CLEAR-NUSKETCH-BUNDLE", 1, 0, false);
	declareFunction("rkfcoll_nusketch_clear_nusketch_layer", "RKFCOLL-NUSKETCH-CLEAR-NUSKETCH-LAYER", 1, 0, false);
	declareFunction("rkfcoll_nusketch_fill_session_info", "RKFCOLL-NUSKETCH-FILL-SESSION-INFO", 1, 0, false);
	declareFunction("rkfcoll_nusketch_fill_sketch_info", "RKFCOLL-NUSKETCH-FILL-SKETCH-INFO", 2, 0, false);
	declareFunction("rkfcoll_nusketch_fill_bundle_info", "RKFCOLL-NUSKETCH-FILL-BUNDLE-INFO", 3, 0, false);
	declareFunction("rkfcoll_nusketch_fill_layer_info", "RKFCOLL-NUSKETCH-FILL-LAYER-INFO", 3, 0, false);
	declareFunction("rkfcoll_nusketch_highlight_entity", "RKFCOLL-NUSKETCH-HIGHLIGHT-ENTITY", 2, 0, false);
	declareFunction("rkfcoll_nusketch_unhighlight_entity", "RKFCOLL-NUSKETCH-UNHIGHLIGHT-ENTITY", 2, 0, false);
	declareFunction("rkfcoll_nusketch_send_message", "RKFCOLL-NUSKETCH-SEND-MESSAGE", 2, 0, false);
	declareFunction("rkfcoll_nusketch_make_bundle_assertions", "RKFCOLL-NUSKETCH-MAKE-BUNDLE-ASSERTIONS", 2, 0, false);
	declareFunction("rkfcoll_nusketch_assign_sketch_guid", "RKFCOLL-NUSKETCH-ASSIGN-SKETCH-GUID", 2, 1, false);
	declareFunction("rkfcoll_nusketch_create_bundle_microtheory", "RKFCOLL-NUSKETCH-CREATE-BUNDLE-MICROTHEORY", 2, 0, false);
	declareFunction("rkfcoll_nusketch_slurp_all_assertions", "RKFCOLL-NUSKETCH-SLURP-ALL-ASSERTIONS", 2, 0, false);
	declareFunction("rkfcoll_nusketch_member_of_filtered_termsP", "RKFCOLL-NUSKETCH-MEMBER-OF-FILTERED-TERMS?", 1, 0, false);
	declareFunction("rkfcoll_nusketch_contains_filtered_termP", "RKFCOLL-NUSKETCH-CONTAINS-FILTERED-TERM?", 1, 0, false);
	declareFunction("rkfcoll_nusketch_filter_assertions", "RKFCOLL-NUSKETCH-FILTER-ASSERTIONS", 2, 0, false);
	declareFunction("rkfcoll_nusketch_find_and_remove_inkb", "RKFCOLL-NUSKETCH-FIND-AND-REMOVE-INKB", 1, 0, false);
	declareFunction("rkfcoll_nusketch_remove_filtered_assertions", "RKFCOLL-NUSKETCH-REMOVE-FILTERED-ASSERTIONS", 1, 0, false);
	declareFunction("rkfcoll_nusketch_polling_start", "RKFCOLL-NUSKETCH-POLLING-START", 1, 0, false);
	declareFunction("rkfcoll_nusketch_polling_stop", "RKFCOLL-NUSKETCH-POLLING-STOP", 1, 0, false);
	declareFunction("rkfcoll_nusketch_polling_thread", "RKFCOLL-NUSKETCH-POLLING-THREAD", 1, 0, false);
	declareFunction("rkfcoll_nusketch_add_new_bundle", "RKFCOLL-NUSKETCH-ADD-NEW-BUNDLE", 3, 0, false);
	declareFunction("rkfcoll_nusketch_add_new_entity", "RKFCOLL-NUSKETCH-ADD-NEW-ENTITY", 3, 0, false);
	declareFunction("rkfcoll_nusketch_bundle_constant_from_session", "RKFCOLL-NUSKETCH-BUNDLE-CONSTANT-FROM-SESSION", 2, 0, false);
	declareFunction("rkfcoll_nusketch_get_and_assert_isas_of_entity", "RKFCOLL-NUSKETCH-GET-AND-ASSERT-ISAS-OF-ENTITY", 4, 0, false);
	declareFunction("rkfcoll_nusketch_make_namestring_assertion", "RKFCOLL-NUSKETCH-MAKE-NAMESTRING-ASSERTION", 4, 0, false);
	declareFunction("rkfcoll_nusketch_make_assertions", "RKFCOLL-NUSKETCH-MAKE-ASSERTIONS", 4, 0, false);
	declareFunction("rkfcoll_nusketch_remove_isas", "RKFCOLL-NUSKETCH-REMOVE-ISAS", 1, 0, false);
	declareFunction("rkfcoll_nusketch_remove_redundant_assertions", "RKFCOLL-NUSKETCH-REMOVE-REDUNDANT-ASSERTIONS", 1, 0, false);
	declareFunction("rkfcoll_nusketch_modify_entity", "RKFCOLL-NUSKETCH-MODIFY-ENTITY", 3, 0, false);
	declareFunction("rkfcoll_nusketch_handle_knowledge_change", "RKFCOLL-NUSKETCH-HANDLE-KNOWLEDGE-CHANGE", 4, 0, false);
	declareFunction("rkfcoll_nusketch_handle_renaming", "RKFCOLL-NUSKETCH-HANDLE-RENAMING", 4, 0, false);
	declareFunction("rkfcoll_nusketch_extract_namestring", "RKFCOLL-NUSKETCH-EXTRACT-NAMESTRING", 1, 0, false);
	declareFunction("rkfcoll_nusketch_unassert_preferred_namestring", "RKFCOLL-NUSKETCH-UNASSERT-PREFERRED-NAMESTRING", 2, 0, false);
	declareFunction("rkfcoll_nusketch_assert_namestring", "RKFCOLL-NUSKETCH-ASSERT-NAMESTRING", 3, 0, false);
	declareFunction("rkfcoll_nusketch_assert_preferred_namestring", "RKFCOLL-NUSKETCH-ASSERT-PREFERRED-NAMESTRING", 3, 0, false);
	declareFunction("rkfcoll_nusketch_delete_entity", "RKFCOLL-NUSKETCH-DELETE-ENTITY", 3, 0, false);
	declareFunction("rkfcoll_nusketch_report_glyphs", "RKFCOLL-NUSKETCH-REPORT-GLYPHS", 2, 0, false);
	declareFunction("rkfcoll_nusketch_close_sketch", "RKFCOLL-NUSKETCH-CLOSE-SKETCH", 3, 0, false);
	declareFunction("rkfcoll_nusketch_open_sketch", "RKFCOLL-NUSKETCH-OPEN-SKETCH", 3, 0, false);
	declareFunction("rkfcoll_nusketch_send_ask_user_glyph_request", "RKFCOLL-NUSKETCH-SEND-ASK-USER-GLYPH-REQUEST", 5, 0, false);
	declareFunction("rkfcoll_nusketch_translate_acceptable_glyph_lists", "RKFCOLL-NUSKETCH-TRANSLATE-ACCEPTABLE-GLYPH-LISTS", 2, 0, false);
	declareFunction("rkfcoll_nusketch_generate_all_glyphs_list", "RKFCOLL-NUSKETCH-GENERATE-ALL-GLYPHS-LIST", 1, 0, false);
	declareFunction("rkfcoll_nusketch_transform_echelon_assertion", "RKFCOLL-NUSKETCH-TRANSFORM-ECHELON-ASSERTION", 1, 0, false);
	declareFunction("rkfcoll_nusketch_transform_allegiance_assertion", "RKFCOLL-NUSKETCH-TRANSFORM-ALLEGIANCE-ASSERTION", 1, 0, false);
	declareFunction("rkfcoll_nusketch_transform_assertions", "RKFCOLL-NUSKETCH-TRANSFORM-ASSERTIONS", 2, 0, false);
	declareFunction("rkfcoll_nusketch_transform_assertion", "RKFCOLL-NUSKETCH-TRANSFORM-ASSERTION", 2, 0, false);
	declareFunction("rkfcoll_nusketch_find_or_create_constant", "RKFCOLL-NUSKETCH-FIND-OR-CREATE-CONSTANT", 2, 0, false);
	declareFunction("rkfcoll_nusketch_find_nusketch_term", "RKFCOLL-NUSKETCH-FIND-NUSKETCH-TERM", 2, 0, false);
	declareFunction("rkfcoll_nusketch_add_nusketch_term", "RKFCOLL-NUSKETCH-ADD-NUSKETCH-TERM", 2, 0, false);
	declareFunction("rkfcoll_nusketch_add_synonymous_assertion", "RKFCOLL-NUSKETCH-ADD-SYNONYMOUS-ASSERTION", 3, 0, false);
	declareFunction("rkfcoll_nusketch_generate_unique_name", "RKFCOLL-NUSKETCH-GENERATE-UNIQUE-NAME", 2, 0, false);
	declareFunction("rkfcoll_nusketch_lookup_or_create_sketch_guid", "RKFCOLL-NUSKETCH-LOOKUP-OR-CREATE-SKETCH-GUID", 2, 0, false);
	declareFunction("rkfcoll_nusketch_lookup_sketch_guid", "RKFCOLL-NUSKETCH-LOOKUP-SKETCH-GUID", 2, 0, false);
	declareFunction("rkfcoll_nusketch_assert_sketch_guid", "RKFCOLL-NUSKETCH-ASSERT-SKETCH-GUID", 3, 0, false);
	declareFunction("rkfcoll_nusketch_glyph_name", "RKFCOLL-NUSKETCH-GLYPH-NAME", 1, 0, false);
	declareFunction("rkfcoll_nusketch_map_term_to_object_id", "RKFCOLL-NUSKETCH-MAP-TERM-TO-OBJECT-ID", 1, 0, false);
	declareFunction("rkfcoll_nusketch_trace", "RKFCOLL-NUSKETCH-TRACE", 1, 1, false);
	declareFunction("rkfcoll_nusketch_valid_connection_p", "RKFCOLL-NUSKETCH-VALID-CONNECTION-P", 1, 0, false);
	declareFunction("get_nusketch_connection_test_case_nsession", "GET-NUSKETCH-CONNECTION-TEST-CASE-NSESSION", 1, 0, false);
	declareFunction("set_nusketch_connection_test_case_nsession", "SET-NUSKETCH-CONNECTION-TEST-CASE-NSESSION", 2, 0, false);
	declareFunction("subloop_reserved_initialize_nusketch_connection_test_case_class", "SUBLOOP-RESERVED-INITIALIZE-NUSKETCH-CONNECTION-TEST-CASE-CLASS", 1, 0, false);
	declareFunction("subloop_reserved_initialize_nusketch_connection_test_case_instance", "SUBLOOP-RESERVED-INITIALIZE-NUSKETCH-CONNECTION-TEST-CASE-INSTANCE", 1, 0, false);
	declareFunction("nusketch_connection_test_case_p", "NUSKETCH-CONNECTION-TEST-CASE-P", 1, 0, false);
	return NIL;
    }

    public static final SubLObject init_rkf_collaborator_nusketch_file() {
	defconstant("*DTP-NUSKETCH-SESSION*", NUSKETCH_SESSION);
	defconstant("*DTP-NUSKETCH-SKETCH*", NUSKETCH_SKETCH);
	defconstant("*DTP-NUSKETCH-BUNDLE*", NUSKETCH_BUNDLE);
	defconstant("*DTP-NUSKETCH-LAYER*", NUSKETCH_LAYER);
	defconstant("*DTP-NUSKETCH-GLYPH*", NUSKETCH_GLYPH);
	defparameter("*RKFCOLL-NUSKETCH-BUNDLE-MICROTHEORY-GENLMT*", $const143$UIA_GeneralMilitary_DemoEnvironme);
	defparameter("*RKFCOLL-NUSKETCH-FILTER-TERMS*", set_utilities.construct_set_from_list($list_alt156, symbol_function(EQL), $int$28));
	defparameter("*RKFCOLL-NUSKETCH-EXPAND-ALL-GLYPHS*", NIL);
	defparameter("*NUSKETCH-TRACE*", $MUMBLE);
	return NIL;
    }

    public static final SubLObject setup_rkf_collaborator_nusketch_file() {
	register_method($print_object_method_table$.getGlobalValue(), $dtp_nusketch_session$.getGlobalValue(), symbol_function(NUSKETCH_SESSION_PRINT_FUNCTION_TRAMPOLINE));
	def_csetf(NUSKETCH_SESSION_MACHINE, _CSETF_NUSKETCH_SESSION_MACHINE);
	def_csetf(NUSKETCH_SESSION_PORT, _CSETF_NUSKETCH_SESSION_PORT);
	def_csetf(NUSKETCH_SESSION_OPEN_SKETCHES, _CSETF_NUSKETCH_SESSION_OPEN_SKETCHES);
	def_csetf(NUSKETCH_SESSION_ACTIVE_SKETCH, _CSETF_NUSKETCH_SESSION_ACTIVE_SKETCH);
	def_csetf(NUSKETCH_SESSION_ACTIVE_BUNDLE, _CSETF_NUSKETCH_SESSION_ACTIVE_BUNDLE);
	def_csetf(NUSKETCH_SESSION_ACTIVE_LAYER, _CSETF_NUSKETCH_SESSION_ACTIVE_LAYER);
	identity(NUSKETCH_SESSION);
	register_method($print_object_method_table$.getGlobalValue(), $dtp_nusketch_sketch$.getGlobalValue(), symbol_function(NUSKETCH_SKETCH_PRINT_FUNCTION_TRAMPOLINE));
	def_csetf(NUSKETCH_SKETCH_ID, _CSETF_NUSKETCH_SKETCH_ID);
	def_csetf(NUSKETCH_SKETCH_NAME, _CSETF_NUSKETCH_SKETCH_NAME);
	def_csetf(NUSKETCH_SKETCH_BUNDLES, _CSETF_NUSKETCH_SKETCH_BUNDLES);
	def_csetf(NUSKETCH_SKETCH_META_LAYER, _CSETF_NUSKETCH_SKETCH_META_LAYER);
	def_csetf(NUSKETCH_SKETCH_GUID, _CSETF_NUSKETCH_SKETCH_GUID);
	identity(NUSKETCH_SKETCH);
	register_method($print_object_method_table$.getGlobalValue(), $dtp_nusketch_bundle$.getGlobalValue(), symbol_function(NUSKETCH_BUNDLE_PRINT_FUNCTION_TRAMPOLINE));
	def_csetf(NUSKETCH_BUNDLE_ID, _CSETF_NUSKETCH_BUNDLE_ID);
	def_csetf(NUSKETCH_BUNDLE_NAME, _CSETF_NUSKETCH_BUNDLE_NAME);
	def_csetf(NUSKETCH_BUNDLE_OBJECT_NAME, _CSETF_NUSKETCH_BUNDLE_OBJECT_NAME);
	def_csetf(NUSKETCH_BUNDLE_LAYERS, _CSETF_NUSKETCH_BUNDLE_LAYERS);
	identity(NUSKETCH_BUNDLE);
	register_method($print_object_method_table$.getGlobalValue(), $dtp_nusketch_layer$.getGlobalValue(), symbol_function(NUSKETCH_LAYER_PRINT_FUNCTION_TRAMPOLINE));
	def_csetf(NUSKETCH_LAYER_ID, _CSETF_NUSKETCH_LAYER_ID);
	def_csetf(NUSKETCH_LAYER_NAME, _CSETF_NUSKETCH_LAYER_NAME);
	def_csetf(NUSKETCH_LAYER_OBJECT_NAME, _CSETF_NUSKETCH_LAYER_OBJECT_NAME);
	identity(NUSKETCH_LAYER);
	register_method($print_object_method_table$.getGlobalValue(), $dtp_nusketch_glyph$.getGlobalValue(), symbol_function(NUSKETCH_GLYPH_PRINT_FUNCTION_TRAMPOLINE));
	def_csetf(NUSKETCH_GLYPH_ID, _CSETF_NUSKETCH_GLYPH_ID);
	def_csetf(NUSKETCH_GLYPH_NAME, _CSETF_NUSKETCH_GLYPH_NAME);
	def_csetf(NUSKETCH_GLYPH_OBJECT_NAME, _CSETF_NUSKETCH_GLYPH_OBJECT_NAME);
	identity(NUSKETCH_GLYPH);
	utilities_macros.register_html_state_variable($rkfcoll_nusketch_expand_all_glyphs$);
	sunit_external.define_test_category($$$nusketch_Module_Supercategory, UNPROVIDED);
	sunit_external.define_test_category($str_alt254$nusketch_Module_Connection_Subcat, list($$$nusketch_Module_Supercategory));
	sunit_external.define_test_category($str_alt255$nusketch_Module_Glyph_Addition_Su, list($$$nusketch_Module_Supercategory));
	sunit_external.define_test_category($str_alt256$nusketch_Module_Glyph_Deletion_Su, list($$$nusketch_Module_Supercategory));
	sunit_external.define_test_category($str_alt257$nusketch_Module_Glyph_Modificatio, list($$$nusketch_Module_Supercategory));
	sunit_external.define_test_category($str_alt258$nusketch_Module_Metalayer_Switchi, list($$$nusketch_Module_Supercategory));
	sunit_external.define_test_category($str_alt259$nusketch_Module_Metalayer_Cloning, list($$$nusketch_Module_Supercategory));
	sunit_external.define_test_category($str_alt260$nusketch_Module_Sketch_Switching_, list($$$nusketch_Module_Supercategory));
	sunit_external.define_test_category($str_alt261$nusketch_Module_Microtheory_Creat, list($$$nusketch_Module_Supercategory));
	sunit_external.define_test_category($str_alt262$nusketch_Module_Temporal_Relation, list($$$nusketch_Module_Supercategory));
	sunit_external.define_test_suite($$$nusketch_Module_Testing_Suite, list($$$nusketch_Module_Supercategory), UNPROVIDED, UNPROVIDED);
	sunit_macros.$current_module_sunit_tests$.setDynamicValue(cons(NUSKETCH_CONNECTION_TEST_CASE, sunit_macros.$current_module_sunit_tests$.getDynamicValue()));
	sunit_macros.define_test_case_preamble(NUSKETCH_CONNECTION_TEST_CASE);
	classes.subloop_new_class(NUSKETCH_CONNECTION_TEST_CASE, TEST_CASE, NIL, NIL, $list_alt266);
	classes.class_set_implements_slot_listeners(NUSKETCH_CONNECTION_TEST_CASE, NIL);
	classes.subloop_note_class_initialization_function(NUSKETCH_CONNECTION_TEST_CASE, SUBLOOP_RESERVED_INITIALIZE_NUSKETCH_CONNECTION_TEST_CASE_CLASS);
	classes.subloop_note_instance_initialization_function(NUSKETCH_CONNECTION_TEST_CASE, $sym281$SUBLOOP_RESERVED_INITIALIZE_NUSKETCH_CONNECTION_TEST_CASE_INSTANC);
	subloop_reserved_initialize_nusketch_connection_test_case_class(NUSKETCH_CONNECTION_TEST_CASE);
	sunit_macros.define_test_case_postamble(NUSKETCH_CONNECTION_TEST_CASE, $str_alt282$rkf_collaborator_nusketch, $$$cycl, $list_alt284);
	sunit_macros.def_test_method_register(NUSKETCH_CONNECTION_TEST_CASE, SETUP_TEARDOWN_TEST);
	sunit_macros.def_test_method_register(NUSKETCH_CONNECTION_TEST_CASE, FILE_OPEN_CLOSE_TEST);
	sunit_macros.def_test_method_register(NUSKETCH_CONNECTION_TEST_CASE, GUID_CREATE_SAVE_TEST);
	return NIL;
    }

    // // Internal Constants
    private static final SubLSymbol NUSKETCH_SESSION = makeSymbol("NUSKETCH-SESSION");

    private static final SubLSymbol NUSKETCH_SESSION_P = makeSymbol("NUSKETCH-SESSION-P");

    static private final SubLList $list_alt2 = list(makeSymbol("MACHINE"), makeSymbol("PORT"), makeSymbol("OPEN-SKETCHES"), makeSymbol("ACTIVE-SKETCH"), makeSymbol("ACTIVE-BUNDLE"), makeSymbol("ACTIVE-LAYER"));

    static private final SubLList $list_alt3 = list(makeKeyword("MACHINE"), $PORT, makeKeyword("OPEN-SKETCHES"), makeKeyword("ACTIVE-SKETCH"), makeKeyword("ACTIVE-BUNDLE"), makeKeyword("ACTIVE-LAYER"));

    static private final SubLList $list_alt4 = list(makeSymbol("NUSKETCH-SESSION-MACHINE"), makeSymbol("NUSKETCH-SESSION-PORT"), makeSymbol("NUSKETCH-SESSION-OPEN-SKETCHES"), makeSymbol("NUSKETCH-SESSION-ACTIVE-SKETCH"), makeSymbol("NUSKETCH-SESSION-ACTIVE-BUNDLE"),
	    makeSymbol("NUSKETCH-SESSION-ACTIVE-LAYER"));

    static private final SubLList $list_alt5 = list(makeSymbol("_CSETF-NUSKETCH-SESSION-MACHINE"), makeSymbol("_CSETF-NUSKETCH-SESSION-PORT"), makeSymbol("_CSETF-NUSKETCH-SESSION-OPEN-SKETCHES"), makeSymbol("_CSETF-NUSKETCH-SESSION-ACTIVE-SKETCH"),
	    makeSymbol("_CSETF-NUSKETCH-SESSION-ACTIVE-BUNDLE"), makeSymbol("_CSETF-NUSKETCH-SESSION-ACTIVE-LAYER"));

    private static final SubLSymbol RKFCOLL_NUSKETCH_PRINT_NUSKETCH_SESSION = makeSymbol("RKFCOLL-NUSKETCH-PRINT-NUSKETCH-SESSION");

    private static final SubLSymbol NUSKETCH_SESSION_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("NUSKETCH-SESSION-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLSymbol NUSKETCH_SESSION_MACHINE = makeSymbol("NUSKETCH-SESSION-MACHINE");

    public static final SubLSymbol _CSETF_NUSKETCH_SESSION_MACHINE = makeSymbol("_CSETF-NUSKETCH-SESSION-MACHINE");

    private static final SubLSymbol NUSKETCH_SESSION_PORT = makeSymbol("NUSKETCH-SESSION-PORT");

    public static final SubLSymbol _CSETF_NUSKETCH_SESSION_PORT = makeSymbol("_CSETF-NUSKETCH-SESSION-PORT");

    private static final SubLSymbol NUSKETCH_SESSION_OPEN_SKETCHES = makeSymbol("NUSKETCH-SESSION-OPEN-SKETCHES");

    public static final SubLSymbol _CSETF_NUSKETCH_SESSION_OPEN_SKETCHES = makeSymbol("_CSETF-NUSKETCH-SESSION-OPEN-SKETCHES");

    private static final SubLSymbol NUSKETCH_SESSION_ACTIVE_SKETCH = makeSymbol("NUSKETCH-SESSION-ACTIVE-SKETCH");

    public static final SubLSymbol _CSETF_NUSKETCH_SESSION_ACTIVE_SKETCH = makeSymbol("_CSETF-NUSKETCH-SESSION-ACTIVE-SKETCH");

    private static final SubLSymbol NUSKETCH_SESSION_ACTIVE_BUNDLE = makeSymbol("NUSKETCH-SESSION-ACTIVE-BUNDLE");

    public static final SubLSymbol _CSETF_NUSKETCH_SESSION_ACTIVE_BUNDLE = makeSymbol("_CSETF-NUSKETCH-SESSION-ACTIVE-BUNDLE");

    private static final SubLSymbol NUSKETCH_SESSION_ACTIVE_LAYER = makeSymbol("NUSKETCH-SESSION-ACTIVE-LAYER");

    public static final SubLSymbol _CSETF_NUSKETCH_SESSION_ACTIVE_LAYER = makeSymbol("_CSETF-NUSKETCH-SESSION-ACTIVE-LAYER");

    private static final SubLSymbol $OPEN_SKETCHES = makeKeyword("OPEN-SKETCHES");

    private static final SubLSymbol $ACTIVE_SKETCH = makeKeyword("ACTIVE-SKETCH");

    private static final SubLSymbol $ACTIVE_BUNDLE = makeKeyword("ACTIVE-BUNDLE");

    private static final SubLSymbol $ACTIVE_LAYER = makeKeyword("ACTIVE-LAYER");

    static private final SubLString $str_alt26$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");

    static private final SubLString $str_alt27$__ = makeString("#<");

    static private final SubLString $str_alt29$__A__A_ = makeString("(~A:~A)");

    static private final SubLList $list_alt31 = list(list(makeSymbol("NSESSION"), makeSymbol("SKETCH")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLSymbol SKETCH_ID = makeSymbol("SKETCH-ID");

    static private final SubLList $list_alt34 = list(makeSymbol("IGNORE"), makeSymbol("SKETCH-ID"));

    private static final SubLSymbol NUSKETCH_SKETCH = makeSymbol("NUSKETCH-SKETCH");

    private static final SubLSymbol NUSKETCH_SKETCH_P = makeSymbol("NUSKETCH-SKETCH-P");

    static private final SubLList $list_alt37 = list(makeSymbol("ID"), makeSymbol("NAME"), makeSymbol("BUNDLES"), makeSymbol("META-LAYER"), makeSymbol("GUID"));

    static private final SubLList $list_alt38 = list(makeKeyword("ID"), $NAME, makeKeyword("BUNDLES"), makeKeyword("META-LAYER"), $GUID);

    static private final SubLList $list_alt39 = list(makeSymbol("NUSKETCH-SKETCH-ID"), makeSymbol("NUSKETCH-SKETCH-NAME"), makeSymbol("NUSKETCH-SKETCH-BUNDLES"), makeSymbol("NUSKETCH-SKETCH-META-LAYER"), makeSymbol("NUSKETCH-SKETCH-GUID"));

    static private final SubLList $list_alt40 = list(makeSymbol("_CSETF-NUSKETCH-SKETCH-ID"), makeSymbol("_CSETF-NUSKETCH-SKETCH-NAME"), makeSymbol("_CSETF-NUSKETCH-SKETCH-BUNDLES"), makeSymbol("_CSETF-NUSKETCH-SKETCH-META-LAYER"), makeSymbol("_CSETF-NUSKETCH-SKETCH-GUID"));

    private static final SubLSymbol RKFCOLL_NUSKETCH_PRINT_NUSKETCH_SKETCH = makeSymbol("RKFCOLL-NUSKETCH-PRINT-NUSKETCH-SKETCH");

    private static final SubLSymbol NUSKETCH_SKETCH_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("NUSKETCH-SKETCH-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLSymbol NUSKETCH_SKETCH_ID = makeSymbol("NUSKETCH-SKETCH-ID");

    public static final SubLSymbol _CSETF_NUSKETCH_SKETCH_ID = makeSymbol("_CSETF-NUSKETCH-SKETCH-ID");

    private static final SubLSymbol NUSKETCH_SKETCH_NAME = makeSymbol("NUSKETCH-SKETCH-NAME");

    public static final SubLSymbol _CSETF_NUSKETCH_SKETCH_NAME = makeSymbol("_CSETF-NUSKETCH-SKETCH-NAME");

    private static final SubLSymbol NUSKETCH_SKETCH_BUNDLES = makeSymbol("NUSKETCH-SKETCH-BUNDLES");

    public static final SubLSymbol _CSETF_NUSKETCH_SKETCH_BUNDLES = makeSymbol("_CSETF-NUSKETCH-SKETCH-BUNDLES");

    private static final SubLSymbol NUSKETCH_SKETCH_META_LAYER = makeSymbol("NUSKETCH-SKETCH-META-LAYER");

    public static final SubLSymbol _CSETF_NUSKETCH_SKETCH_META_LAYER = makeSymbol("_CSETF-NUSKETCH-SKETCH-META-LAYER");

    private static final SubLSymbol NUSKETCH_SKETCH_GUID = makeSymbol("NUSKETCH-SKETCH-GUID");

    public static final SubLSymbol _CSETF_NUSKETCH_SKETCH_GUID = makeSymbol("_CSETF-NUSKETCH-SKETCH-GUID");

    private static final SubLSymbol $BUNDLES = makeKeyword("BUNDLES");

    private static final SubLSymbol $META_LAYER = makeKeyword("META-LAYER");

    static private final SubLString $str_alt58$_id__A____name__A_ = makeString("(id:~A :: name:~A)");

    private static final SubLSymbol NUSKETCH_BUNDLE = makeSymbol("NUSKETCH-BUNDLE");

    private static final SubLSymbol NUSKETCH_BUNDLE_P = makeSymbol("NUSKETCH-BUNDLE-P");

    static private final SubLList $list_alt61 = list(makeSymbol("ID"), makeSymbol("NAME"), makeSymbol("OBJECT-NAME"), makeSymbol("LAYERS"));

    static private final SubLList $list_alt62 = list(makeKeyword("ID"), $NAME, makeKeyword("OBJECT-NAME"), makeKeyword("LAYERS"));

    static private final SubLList $list_alt63 = list(makeSymbol("NUSKETCH-BUNDLE-ID"), makeSymbol("NUSKETCH-BUNDLE-NAME"), makeSymbol("NUSKETCH-BUNDLE-OBJECT-NAME"), makeSymbol("NUSKETCH-BUNDLE-LAYERS"));

    static private final SubLList $list_alt64 = list(makeSymbol("_CSETF-NUSKETCH-BUNDLE-ID"), makeSymbol("_CSETF-NUSKETCH-BUNDLE-NAME"), makeSymbol("_CSETF-NUSKETCH-BUNDLE-OBJECT-NAME"), makeSymbol("_CSETF-NUSKETCH-BUNDLE-LAYERS"));

    private static final SubLSymbol RKFCOLL_NUSKETCH_PRINT_NUSKETCH_BUNDLE = makeSymbol("RKFCOLL-NUSKETCH-PRINT-NUSKETCH-BUNDLE");

    private static final SubLSymbol NUSKETCH_BUNDLE_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("NUSKETCH-BUNDLE-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLSymbol NUSKETCH_BUNDLE_ID = makeSymbol("NUSKETCH-BUNDLE-ID");

    public static final SubLSymbol _CSETF_NUSKETCH_BUNDLE_ID = makeSymbol("_CSETF-NUSKETCH-BUNDLE-ID");

    private static final SubLSymbol NUSKETCH_BUNDLE_NAME = makeSymbol("NUSKETCH-BUNDLE-NAME");

    public static final SubLSymbol _CSETF_NUSKETCH_BUNDLE_NAME = makeSymbol("_CSETF-NUSKETCH-BUNDLE-NAME");

    private static final SubLSymbol NUSKETCH_BUNDLE_OBJECT_NAME = makeSymbol("NUSKETCH-BUNDLE-OBJECT-NAME");

    public static final SubLSymbol _CSETF_NUSKETCH_BUNDLE_OBJECT_NAME = makeSymbol("_CSETF-NUSKETCH-BUNDLE-OBJECT-NAME");

    private static final SubLSymbol NUSKETCH_BUNDLE_LAYERS = makeSymbol("NUSKETCH-BUNDLE-LAYERS");

    public static final SubLSymbol _CSETF_NUSKETCH_BUNDLE_LAYERS = makeSymbol("_CSETF-NUSKETCH-BUNDLE-LAYERS");

    private static final SubLSymbol $OBJECT_NAME = makeKeyword("OBJECT-NAME");

    private static final SubLSymbol $LAYERS = makeKeyword("LAYERS");

    static private final SubLString $str_alt77$_id__A____name__A____object_name_ = makeString("(id:~A :: name:~A :: object name:~A)");

    static private final SubLList $list_alt78 = list(list(makeSymbol("SKETCH"), makeSymbol("BUNDLE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLSymbol BUNDLE_ID = makeSymbol("BUNDLE-ID");

    static private final SubLList $list_alt80 = list(makeSymbol("IGNORE"), makeSymbol("BUNDLE-ID"));

    private static final SubLSymbol NUSKETCH_LAYER = makeSymbol("NUSKETCH-LAYER");

    private static final SubLSymbol NUSKETCH_LAYER_P = makeSymbol("NUSKETCH-LAYER-P");

    static private final SubLList $list_alt83 = list(makeSymbol("ID"), makeSymbol("NAME"), makeSymbol("OBJECT-NAME"));

    static private final SubLList $list_alt84 = list(makeKeyword("ID"), $NAME, makeKeyword("OBJECT-NAME"));

    static private final SubLList $list_alt85 = list(makeSymbol("NUSKETCH-LAYER-ID"), makeSymbol("NUSKETCH-LAYER-NAME"), makeSymbol("NUSKETCH-LAYER-OBJECT-NAME"));

    static private final SubLList $list_alt86 = list(makeSymbol("_CSETF-NUSKETCH-LAYER-ID"), makeSymbol("_CSETF-NUSKETCH-LAYER-NAME"), makeSymbol("_CSETF-NUSKETCH-LAYER-OBJECT-NAME"));

    private static final SubLSymbol RKFCOLL_NUSKETCH_PRINT_NUSKETCH_LAYER = makeSymbol("RKFCOLL-NUSKETCH-PRINT-NUSKETCH-LAYER");

    private static final SubLSymbol NUSKETCH_LAYER_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("NUSKETCH-LAYER-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLSymbol NUSKETCH_LAYER_ID = makeSymbol("NUSKETCH-LAYER-ID");

    public static final SubLSymbol _CSETF_NUSKETCH_LAYER_ID = makeSymbol("_CSETF-NUSKETCH-LAYER-ID");

    private static final SubLSymbol NUSKETCH_LAYER_NAME = makeSymbol("NUSKETCH-LAYER-NAME");

    public static final SubLSymbol _CSETF_NUSKETCH_LAYER_NAME = makeSymbol("_CSETF-NUSKETCH-LAYER-NAME");

    private static final SubLSymbol NUSKETCH_LAYER_OBJECT_NAME = makeSymbol("NUSKETCH-LAYER-OBJECT-NAME");

    public static final SubLSymbol _CSETF_NUSKETCH_LAYER_OBJECT_NAME = makeSymbol("_CSETF-NUSKETCH-LAYER-OBJECT-NAME");

    static private final SubLList $list_alt95 = list(list(makeSymbol("BUNDLE"), makeSymbol("LAYER")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLSymbol LAYER_ID = makeSymbol("LAYER-ID");

    static private final SubLList $list_alt97 = list(makeSymbol("IGNORE"), makeSymbol("LAYER-ID"));

    private static final SubLSymbol NUSKETCH_GLYPH = makeSymbol("NUSKETCH-GLYPH");

    private static final SubLSymbol NUSKETCH_GLYPH_P = makeSymbol("NUSKETCH-GLYPH-P");

    static private final SubLList $list_alt100 = list(makeSymbol("NUSKETCH-GLYPH-ID"), makeSymbol("NUSKETCH-GLYPH-NAME"), makeSymbol("NUSKETCH-GLYPH-OBJECT-NAME"));

    static private final SubLList $list_alt101 = list(makeSymbol("_CSETF-NUSKETCH-GLYPH-ID"), makeSymbol("_CSETF-NUSKETCH-GLYPH-NAME"), makeSymbol("_CSETF-NUSKETCH-GLYPH-OBJECT-NAME"));

    private static final SubLSymbol NUSKETCH_GLYPH_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("NUSKETCH-GLYPH-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLSymbol NUSKETCH_GLYPH_ID = makeSymbol("NUSKETCH-GLYPH-ID");

    public static final SubLSymbol _CSETF_NUSKETCH_GLYPH_ID = makeSymbol("_CSETF-NUSKETCH-GLYPH-ID");

    private static final SubLSymbol NUSKETCH_GLYPH_NAME = makeSymbol("NUSKETCH-GLYPH-NAME");

    public static final SubLSymbol _CSETF_NUSKETCH_GLYPH_NAME = makeSymbol("_CSETF-NUSKETCH-GLYPH-NAME");

    private static final SubLSymbol NUSKETCH_GLYPH_OBJECT_NAME = makeSymbol("NUSKETCH-GLYPH-OBJECT-NAME");

    public static final SubLSymbol _CSETF_NUSKETCH_GLYPH_OBJECT_NAME = makeSymbol("_CSETF-NUSKETCH-GLYPH-OBJECT-NAME");

    static private final SubLList $list_alt110 = list(makeSymbol("LIST-OPEN-SKETCHES"));

    static private final SubLList $list_alt111 = list(makeSymbol("GET-ACTIVE-SKETCH"));

    private static final SubLSymbol GET_ACTIVE_BUNDLE = makeSymbol("GET-ACTIVE-BUNDLE");

    private static final SubLSymbol $SKETCH_ID = makeKeyword("SKETCH-ID");

    private static final SubLSymbol GET_ACTIVE_LAYER = makeSymbol("GET-ACTIVE-LAYER");

    private static final SubLSymbol LIST_BUNDLES = makeSymbol("LIST-BUNDLES");

    private static final SubLSymbol NAME_OF_SKETCH = makeSymbol("NAME-OF-SKETCH");

    private static final SubLSymbol GET_METALAYER = makeSymbol("GET-METALAYER");

    private static final SubLSymbol LIST_LAYERS = makeSymbol("LIST-LAYERS");

    private static final SubLSymbol $BUNDLE_ID = makeKeyword("BUNDLE-ID");

    private static final SubLSymbol NAME_OF_BUNDLE = makeSymbol("NAME-OF-BUNDLE");

    private static final SubLSymbol OBJECT_NAME_OF_BUNDLE = makeSymbol("OBJECT-NAME-OF-BUNDLE");

    private static final SubLSymbol NAME_OF_LAYER = makeSymbol("NAME-OF-LAYER");

    private static final SubLSymbol $LAYER_ID = makeKeyword("LAYER-ID");

    private static final SubLSymbol OBJECT_NAME_OF_LAYER = makeSymbol("OBJECT-NAME-OF-LAYER");

    public static final SubLObject $$coaObjectId = constant_handles.reader_make_constant_shell(makeString("coaObjectId"));

    static private final SubLList $list_alt127 = list(makeSymbol("GIVE-FOCUS-TO-NUSKETCH"));

    private static final SubLSymbol HIGHLIGHT_ENTITY = makeSymbol("HIGHLIGHT-ENTITY");

    private static final SubLSymbol $GLYPH_ID = makeKeyword("GLYPH-ID");

    private static final SubLSymbol UNHIGHLIGHT_ENTITY = makeSymbol("UNHIGHLIGHT-ENTITY");

    private static final SubLSymbol $IGNORE_ERRORS_TARGET = makeKeyword("IGNORE-ERRORS-TARGET");

    private static final SubLSymbol IGNORE_ERRORS_HANDLER = makeSymbol("IGNORE-ERRORS-HANDLER", "SUBLISP");

    static private final SubLString $$$unknown = makeString("unknown");

    static private final SubLString $str_alt136$Cannot_establish_proper_nuSketch_ = makeString("Cannot establish proper nuSketch connection to ~A:~A~%");

    static private final SubLString $str_alt137$Getting_session_info_from_nuSketc = makeString("Getting session info from nuSketch on ~A:~A ...");

    static private final SubLString $str_alt138$_done___ = makeString(" done.~%");

    static private final SubLString $str_alt139$Stamping_sketch__A_hosted_on__A__ = makeString("Stamping sketch ~A hosted on ~A:~A with GUID ~A.~%");

    static private final SubLString $str_alt140$NuSketch_is_told___A__ = makeString("NuSketch is told: ~A~%");

    static private final SubLString $str_alt141$NuSketch_now_knows_that_the_GUID_ = makeString("NuSketch now knows that the GUID is ~A.~%");

    static private final SubLString $str_alt142$Sorry__NuSketch_did_not_grasp_tha = makeString("Sorry, NuSketch did not grasp that the GUID is ~A and not ~A.~%");

    public static final SubLObject $const143$UIA_GeneralMilitary_DemoEnvironme = constant_handles.reader_make_constant_shell(makeString("UIA-GeneralMilitary-DemoEnvironmentMt"));

    static private final SubLString $str_alt144$Creating_new_microtheory_for_bund = makeString("Creating new microtheory for bundle: ~A~%");

    public static final SubLObject $$isa = constant_handles.reader_make_constant_shell(makeString("isa"));

    static private final SubLList $list_alt146 = list(constant_handles.reader_make_constant_shell(makeString("BattlespaceState")));

    public static final SubLObject $$UniversalVocabularyMt = constant_handles.reader_make_constant_shell(makeString("UniversalVocabularyMt"));

    public static final SubLObject $$genlMt = constant_handles.reader_make_constant_shell(makeString("genlMt"));

    static private final SubLList $list_alt149 = list(constant_handles.reader_make_constant_shell(makeString("HPKBCrisisMt")));

    static private final SubLList $list_alt150 = list(constant_handles.reader_make_constant_shell(makeString("NuSketchVocabularyMt")));

    static private final SubLList $list_alt151 = list(constant_handles.reader_make_constant_shell(makeString("BattlespaceMilitaryMt")));

    static private final SubLList $list_alt152 = list(constant_handles.reader_make_constant_shell(makeString("ModernMilitaryTacticsMt")));

    private static final SubLSymbol GET_FACTS_ABOUT_BUNDLE = makeSymbol("GET-FACTS-ABOUT-BUNDLE");

    static private final SubLString $str_alt154$Asserting___A__ = makeString("Asserting: ~A~%");

    private static final SubLSymbol $NUSKETCH = makeKeyword("NUSKETCH");

    static private final SubLList $list_alt156 = list(new SubLObject[] { makeSymbol("inkLastModifiedTime"), makeSymbol("intentLastModifiedTime"), makeSymbol("bboxLastModifiedTime"), makeSymbol("ccysLastModifiedTime"), makeSymbol("timelineLastModifiedTime"), makeSymbol("q-2D-orientation"),
	    makeSymbol("q-roundness"), makeSymbol("userCreated"), makeSymbol("kbDateModified"), makeSymbol("justifiedBy"), makeSymbol("composableFigureFor"), makeSymbol("directionalSignature"), makeSymbol("angleBetween"), makeSymbol("members"), makeSymbol("NuSketchCoaFiguresLibrary"),
	    makeSymbol("overallBlueForcePqSlotVal"), makeSymbol("overallRedForcePqSlotVal"), makeSymbol("methodPurposePqSlotVal"), makeSymbol("methodPurposePqString"), makeSymbol("voronoiFor"), makeSymbol("subSketchFor"), makeSymbol("rcc8-DC"), makeSymbol("vDiagramForItem"),
	    makeSymbol("subSketchGroupFor"), makeSymbol("cgOfGG"), makeSymbol("GGOfGlyph"), makeSymbol("nameStringLastModifiedTime"), makeSymbol("GlyphFn") });

    public static final SubLInteger $int$28 = makeInteger(28);

    public static final SubLSymbol inKB = makeSymbol("inKB");

    static private final SubLSymbol $sym160$RKFCOLL_NUSKETCH_CONTAINS_FILTERED_TERM_ = makeSymbol("RKFCOLL-NUSKETCH-CONTAINS-FILTERED-TERM?");

    private static final SubLSymbol USER_INTERACTION_META_AGENDA_P = makeSymbol("USER-INTERACTION-META-AGENDA-P");

    private static final SubLSymbol $POLLING_LOCK = makeKeyword("POLLING-LOCK");

    private static final SubLSymbol $POLLING_THREAD = makeKeyword("POLLING-THREAD");

    static private final SubLString $$$nuSketch_Polling_Thread = makeString("nuSketch Polling Thread");

    private static final SubLSymbol UIAEXT_NUSKETCH_POLLING_THREAD = makeSymbol("UIAEXT-NUSKETCH-POLLING-THREAD");

    private static final SubLSymbol $NSESSION = makeKeyword("NSESSION");

    static private final SubLList $list_alt170 = list(makeSymbol("POP-NOTIFICATION"));

    static private final SubLString $$$NIL = makeString("NIL");

    static private final SubLString $str_alt172$new_entity_added = makeString("new-entity-added");

    static private final SubLString $str_alt173$new_bundle_added = makeString("new-bundle-added");

    static private final SubLString $str_alt174$entity_modified = makeString("entity-modified");

    static private final SubLString $str_alt175$entity_deleted = makeString("entity-deleted");

    static private final SubLString $str_alt176$switch_active_sketch = makeString("switch-active-sketch");

    static private final SubLString $str_alt177$switch_active_bundle = makeString("switch-active-bundle");

    static private final SubLString $str_alt178$switch_active_layer = makeString("switch-active-layer");

    static private final SubLString $str_alt179$sketch_closed = makeString("sketch-closed");

    static private final SubLString $str_alt180$sketch_opened = makeString("sketch-opened");

    static private final SubLString $str_alt181$ask_user_for_glyphs__done = makeString("ask-user-for-glyphs--done");

    static private final SubLString $str_alt182$__Error_occurred_in_polling_threa = makeString("~%Error occurred in polling thread: ~A~%Thread dying...~%");

    static private final SubLString $str_alt183$__Polling_thread_done___ = makeString("~%Polling thread done.~%");

    static private final SubLList $list_alt184 = list(constant_handles.reader_make_constant_shell(makeString("AssignedTaskType")), constant_handles.reader_make_constant_shell(makeString("MilitaryTaskedActionType")),
	    constant_handles.reader_make_constant_shell(makeString("Mission-AssignedActionType")), constant_handles.reader_make_constant_shell(makeString("MilitaryDecisionMakingActionType")));

    public static final SubLSymbol ist_Information = makeSymbol("ist-Information");

    public static final SubLSymbol isa = makeSymbol("isa");

    static private final SubLList $list_alt190 = list(makeSymbol("?X"));

    static private final SubLString $str_alt191$What_the_hell__why_is__A_here_in_ = makeString("What the hell: why is ~A here in ISA asserting???");

    static private final SubLString $str_alt192$__isa_Asserting___A_in_Mt__A__ = makeString("#$isa Asserting: ~A in Mt ~A~%");

    public static final SubLSymbol nameString = makeSymbol("nameString");

    private static final SubLSymbol GET_FACTS_ABOUT_GLYPH = makeSymbol("GET-FACTS-ABOUT-GLYPH");

    public static final SubLObject $$ModernMilitaryUnit_Deployable = constant_handles.reader_make_constant_shell(makeString("ModernMilitaryUnit-Deployable"));

    public static final SubLSymbol sovereignAllegianceOfOrg = makeSymbol("sovereignAllegianceOfOrg");

    public static final SubLSymbol echelonOfUnit = makeSymbol("echelonOfUnit");

    static private final SubLString $str_alt198$Asserting___A_in_Mt__A__ = makeString("Asserting: ~A in Mt ~A~%");

    static private final SubLString $$$moved = makeString("moved");

    static private final SubLString $str_alt200$Movement_detected_for__A__ = makeString("Movement detected for ~A~%");

    static private final SubLString $str_alt201$user_changed_knowledge = makeString("user-changed-knowledge");

    static private final SubLString $$$rotated = makeString("rotated");

    static private final SubLString $str_alt203$Rotation_detected___ = makeString("Rotation detected.~%");

    static private final SubLString $$$redrawn = makeString("redrawn");

    static private final SubLString $str_alt205$Redraw_detected___ = makeString("Redraw detected.~%");

    static private final SubLSymbol $sym206$_X = makeSymbol("?X");

    public static final SubLObject $$preferredNameString = constant_handles.reader_make_constant_shell(makeString("preferredNameString"));

    static private final SubLString $str_alt208$Unasserting___A__ = makeString("Unasserting: ~A~%");

    public static final SubLObject $$nameString = constant_handles.reader_make_constant_shell(makeString("nameString"));

    static private final SubLString $str_alt210$Asserting___A_in_mt__A__ = makeString("Asserting: ~A in mt ~A~%");

    static private final SubLString $str_alt211$Potentially_deleting___A__ = makeString("Potentially deleting: ~A~%");

    static private final SubLList $list_alt213 = list(makeSymbol("GET-ACTIVE-BUNDLE"));

    static private final SubLString $str_alt214$Closing_sketch__A__ = makeString("Closing sketch ~A~%");

    static private final SubLString $str_alt215$Opening_sketch__A__ = makeString("Opening sketch ~A~%");

    private static final SubLSymbol ASK_USER_FOR_GLYPHS = makeSymbol("ASK-USER-FOR-GLYPHS");

    private static final SubLSymbol $CYC_LOGO = makeKeyword("CYC-LOGO");

    public static final SubLSymbol $kw221$N_ARY_ = makeKeyword("N-ARY?");

    private static final SubLSymbol $ACCEPTABLE_GLYPHS = makeKeyword("ACCEPTABLE-GLYPHS");

    public static final SubLSymbol $rkfcoll_nusketch_expand_all_glyphs$ = makeSymbol("*RKFCOLL-NUSKETCH-EXPAND-ALL-GLYPHS*");

    private static final SubLSymbol $ALL_GLYPHS = makeKeyword("ALL-GLYPHS");

    static private final SubLString $str_alt225$all_glyphs = makeString("all-glyphs");

    static private final SubLString $str_alt226$Sorry__could_not_map_glyph__A_int = makeString("Sorry, could not map glyph ~A into a nuSketch object Id.");

    static private final SubLList $list_alt227 = list(constant_handles.reader_make_constant_shell(makeString("coaObjectId")), makeSymbol("?TERMS"), makeSymbol("?ID"));

    static private final SubLList $list_alt228 = list(makeSymbol("RESULT"), makeSymbol("JUSTIFICATION"));

    static private final SubLSymbol $sym229$_ID = makeSymbol("?ID");

    static private final SubLList $list_alt230 = cons(makeSymbol("VARIABLE"), makeSymbol("ID"));

    static private final SubLList $list_alt231 = list(makeSymbol("IST-INFO"), makeSymbol("BCASE"), makeSymbol("ASSERTION"));

    static private final SubLString $$$MilitaryEchelon = makeString("MilitaryEchelon");

    static private final SubLString $$$UnitDesignation = makeString("UnitDesignation");

    static private final SubLString $$$isa = makeString("isa");

    static private final SubLString $$$Unit = makeString("Unit");

    static private final SubLString $str_alt236$_Side = makeString("-Side");

    static private final SubLString $str_alt237$_A_is_not_a_string___ = makeString("~A is not a string!~%");

    static private final SubLSymbol $sym238$_TERM = makeSymbol("?TERM");

    public static final SubLObject $$synonymousExternalConcept = constant_handles.reader_make_constant_shell(makeString("synonymousExternalConcept"));

    public static final SubLObject $$NuSketchKB2002 = constant_handles.reader_make_constant_shell(makeString("NuSketchKB2002"));

    public static final SubLObject $$NuSketchVocabularyMt = constant_handles.reader_make_constant_shell(makeString("NuSketchVocabularyMt"));

    static private final SubLString $str_alt242$_ = makeString("-");

    private static final SubLSymbol $NUSKETCH_GUID = makeKeyword("NUSKETCH-GUID");

    static private final SubLList $list_alt244 = list(list(makeSymbol("guid"), makeSymbol("?X")));

    private static final SubLSymbol TELL = makeSymbol("TELL");

    public static final SubLSymbol guid = makeSymbol("guid");

    static private final SubLString $str_alt248$Object_ = makeString("Object-");

    private static final SubLSymbol $MUMBLE = makeKeyword("MUMBLE");

    private static final SubLSymbol $STANDARD_ERR = makeKeyword("STANDARD-ERR");

    static private final SubLList $list_alt252 = list(makeSymbol("PING"));

    static private final SubLString $$$nusketch_Module_Supercategory = makeString("nusketch Module Supercategory");

    static private final SubLString $str_alt254$nusketch_Module_Connection_Subcat = makeString("nusketch Module Connection Subcategory");

    static private final SubLString $str_alt255$nusketch_Module_Glyph_Addition_Su = makeString("nusketch Module Glyph Addition Subcategory");

    static private final SubLString $str_alt256$nusketch_Module_Glyph_Deletion_Su = makeString("nusketch Module Glyph Deletion Subcategory");

    static private final SubLString $str_alt257$nusketch_Module_Glyph_Modificatio = makeString("nusketch Module Glyph Modification Subcategory");

    static private final SubLString $str_alt258$nusketch_Module_Metalayer_Switchi = makeString("nusketch Module Metalayer Switching Subcategory");

    static private final SubLString $str_alt259$nusketch_Module_Metalayer_Cloning = makeString("nusketch Module Metalayer Cloning Subcategory");

    static private final SubLString $str_alt260$nusketch_Module_Sketch_Switching_ = makeString("nusketch Module Sketch Switching Subcategory");

    static private final SubLString $str_alt261$nusketch_Module_Microtheory_Creat = makeString("nusketch Module Microtheory Creation Subcategory");

    static private final SubLString $str_alt262$nusketch_Module_Temporal_Relation = makeString("nusketch Module Temporal Relations Subcategory");

    static private final SubLString $$$nusketch_Module_Testing_Suite = makeString("nusketch Module Testing Suite");

    private static final SubLSymbol NUSKETCH_CONNECTION_TEST_CASE = makeSymbol("NUSKETCH-CONNECTION-TEST-CASE");

    static private final SubLList $list_alt266 = list(list(makeSymbol("NSESSION"), makeKeyword("INSTANCE"), makeKeyword("PRIVATE")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SETUP"), NIL, makeKeyword("PROTECTED")),
	    list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("CLEANUP"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SETUP-TEARDOWN-TEST"), NIL, makeKeyword("PROTECTED")),
	    list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("FILE-OPEN-CLOSE-TEST"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GUID-CREATE-SAVE-TEST"), NIL, makeKeyword("PROTECTED")));

    private static final SubLSymbol NSESSION = makeSymbol("NSESSION");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_NUSKETCH_CONNECTION_TEST_CASE_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-NUSKETCH-CONNECTION-TEST-CASE-CLASS");

    static private final SubLSymbol $sym281$SUBLOOP_RESERVED_INITIALIZE_NUSKETCH_CONNECTION_TEST_CASE_INSTANC = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-NUSKETCH-CONNECTION-TEST-CASE-INSTANCE");

    static private final SubLString $str_alt282$rkf_collaborator_nusketch = makeString("rkf-collaborator-nusketch");

    static private final SubLString $$$cycl = makeString("cycl");

    static private final SubLList $list_alt284 = list(makeString("nusketch Module Connection Subcategory"));

    private static final SubLSymbol SETUP_TEARDOWN_TEST = makeSymbol("SETUP-TEARDOWN-TEST");

    private static final SubLSymbol FILE_OPEN_CLOSE_TEST = makeSymbol("FILE-OPEN-CLOSE-TEST");

    private static final SubLSymbol GUID_CREATE_SAVE_TEST = makeSymbol("GUID-CREATE-SAVE-TEST");

    // // Initializers
    @Override
    public void declareFunctions() {
	declare_rkf_collaborator_nusketch_file();
    }

    @Override
    public void initializeVariables() {
	init_rkf_collaborator_nusketch_file();
    }

    @Override
    public void runTopLevelForms() {
	setup_rkf_collaborator_nusketch_file();
    }
}
