package com.cyc.cycjava.cycl;

import static com.cyc.cycjava.cycl.utilities_macros.generate_instance_variable_bindings_for_structure_slots;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.identity;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.funcall;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Packages.intern;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.cconcatenate;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.values;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.$print_object_method_table$;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.bq_cons;
import static com.cyc.tool.subl.util.SubLFiles.*;

import org.armedbear.lisp.Lisp;

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
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class slots extends SubLTranslatedFile {
	public static final SubLFile me = new slots();

	public static final String myName = "com.cyc.cycjava.cycl.slots";

	public static final String myFingerPrint = "4a2d23291686817aab2f337e9d998cd2f3f0d5b3d7a3f58d8bce6a0ae050d63f";

	// defconstant
	public static final SubLSymbol $dtp_slot$ = makeSymbol("*DTP-SLOT*");

	public static final SubLSymbol SLOT_P = makeSymbol("SLOT-P");

	public static final SubLList $list2 = list(makeSymbol("NAME"), makeSymbol("INDEX"), makeSymbol("PROTECTION"), makeSymbol("CLASS-NAME"), makeSymbol("ESSENTIAL"), makeSymbol("INIT-VALUE"));

	public static final SubLList $list3 = list(makeKeyword("NAME"), makeKeyword("INDEX"), makeKeyword("PROTECTION"), makeKeyword("CLASS-NAME"), makeKeyword("ESSENTIAL"), makeKeyword("INIT-VALUE"));

	public static final SubLList $list4 = list(makeSymbol("SLOT-NAME"), makeSymbol("SLOT-INDEX"), makeSymbol("SLOT-PROTECTION"), makeSymbol("SLOT-CLASS-NAME"), makeSymbol("SLOT-ESSENTIAL"), makeSymbol("SLOT-INIT-VALUE"));

	public static final SubLList $list5 = list(makeSymbol("_CSETF-SLOT-NAME"), makeSymbol("_CSETF-SLOT-INDEX"), makeSymbol("_CSETF-SLOT-PROTECTION"), makeSymbol("_CSETF-SLOT-CLASS-NAME"), makeSymbol("_CSETF-SLOT-ESSENTIAL"), makeSymbol("_CSETF-SLOT-INIT-VALUE"));

	public static final SubLSymbol PRINT_SLOT = makeSymbol("PRINT-SLOT");

	public static final SubLSymbol SLOT_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("SLOT-PRINT-FUNCTION-TRAMPOLINE");

	private static final SubLList $list8 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("SLOT-P"));

	private static final SubLSymbol _CSETF_SLOT_NAME = makeSymbol("_CSETF-SLOT-NAME");

	private static final SubLSymbol SLOT_INDEX = makeSymbol("SLOT-INDEX");

	private static final SubLSymbol _CSETF_SLOT_INDEX = makeSymbol("_CSETF-SLOT-INDEX");

	private static final SubLSymbol SLOT_PROTECTION = makeSymbol("SLOT-PROTECTION");

	private static final SubLSymbol _CSETF_SLOT_PROTECTION = makeSymbol("_CSETF-SLOT-PROTECTION");

	private static final SubLSymbol SLOT_CLASS_NAME = makeSymbol("SLOT-CLASS-NAME");

	private static final SubLSymbol _CSETF_SLOT_CLASS_NAME = makeSymbol("_CSETF-SLOT-CLASS-NAME");

	private static final SubLSymbol SLOT_ESSENTIAL = makeSymbol("SLOT-ESSENTIAL");

	private static final SubLSymbol _CSETF_SLOT_ESSENTIAL = makeSymbol("_CSETF-SLOT-ESSENTIAL");

	private static final SubLSymbol SLOT_INIT_VALUE = makeSymbol("SLOT-INIT-VALUE");

	private static final SubLSymbol _CSETF_SLOT_INIT_VALUE = makeSymbol("_CSETF-SLOT-INIT-VALUE");

	private static final SubLString $str27$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");

	private static final SubLSymbol MAKE_SLOT = makeSymbol("MAKE-SLOT");

	private static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_SLOT_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-SLOT-METHOD");

	private static final SubLList $list34 = list(makeSymbol("SLOT"), makeSymbol("&BODY"), makeSymbol("FORMS"));

	private static final SubLString $$$slot = makeString("slot");

	private static final SubLSymbol SLOT_ = makeSymbol("SLOT-");

	private static final SubLString $str37$__SLOT__name__S__index__S__protec = makeString("#<SLOT: name=~S, index=~S, protection=~S, essential=~S, class=~S, init-value=~S>");

	private static final SubLList $list38 = list(list(makeSymbol("NAME-VAR"), makeSymbol("INDEX-VAR"), makeSymbol("PROTECTION-VAR"), makeSymbol("CLASS-NAME-VAR"), makeSymbol("INIT-VALUE-VAR"), makeSymbol("SLOTS-FORM")), makeSymbol("&BODY"), makeSymbol("BODY"));

	private static final SubLString $str43$GET_ = makeString("GET-");

	private static final SubLString $str44$_ = makeString("-");

	private static final SubLString $str45$SET_ = makeString("SET-");

	private static final SubLString $str46$INLINE_GET_SLOT___S_is_not_a_vali = makeString("INLINE-GET-SLOT: ~S is not a valid slot name.  A non-nil symbol was expected.");

	private static final SubLString $str47$INLINE_GET_SLOT___S_is_not_a_vali = makeString("INLINE-GET-SLOT: ~S is not a valid class name.  A non-nil symbol was expected.");

	private static final SubLList $list50 = list(list(makeSymbol("SLOT-NAME"), makeSymbol("CLASS-NAME")), makeSymbol("CLASS-OR-INSTANCE"));

	private static final SubLList $list52 = list(list(makeSymbol("SLOT-NAME"), makeSymbol("CLASS-NAME")), makeSymbol("CLASS-OR-INSTANCE"), makeSymbol("NEW-VALUE"));

	public static SubLObject slot_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
		print_slot(v_object, stream, ZERO_INTEGER);
		return NIL;
	}

	public static SubLObject slot_p(final SubLObject v_object) {
		return v_object.getJavaClass() ==$slot_native.class ? T : NIL;
	}

	public static SubLObject slot_name(final SubLObject v_object) {
		assert NIL != slot_p(v_object) : "slots.slot_p error :" + v_object;
		return v_object.getField2();
	}

	public static SubLObject slot_index(final SubLObject v_object) {
		assert NIL != slot_p(v_object) : "slots.slot_p error :" + v_object;
		return v_object.getField3();
	}

	public static SubLObject slot_protection(final SubLObject v_object) {
		assert NIL != slot_p(v_object) : "slots.slot_p error :" + v_object;
		return v_object.getField4();
	}

	public static SubLObject slot_class_name(final SubLObject v_object) {
		assert NIL != slot_p(v_object) : "slots.slot_p error :" + v_object;
		return v_object.getField5();
	}

	public static SubLObject slot_essential(final SubLObject v_object) {
		assert NIL != slot_p(v_object) : "slots.slot_p error :" + v_object;
		return v_object.getField6();
	}

	public static SubLObject slot_init_value(final SubLObject v_object) {
		assert NIL != slot_p(v_object) : "slots.slot_p error :" + v_object;
		return v_object.getField7();
	}

	public static SubLObject _csetf_slot_name(final SubLObject v_object, final SubLObject value) {
		assert NIL != slot_p(v_object) : "slots.slot_p error :" + v_object;
		return v_object.setField2(value);
	}

	public static SubLObject _csetf_slot_index(final SubLObject v_object, final SubLObject value) {
		assert NIL != slot_p(v_object) : "slots.slot_p error :" + v_object;
		return v_object.setField3(value);
	}

	public static SubLObject _csetf_slot_protection(final SubLObject v_object, final SubLObject value) {
		assert NIL != slot_p(v_object) : "slots.slot_p error :" + v_object;
		return v_object.setField4(value);
	}

	public static SubLObject _csetf_slot_class_name(final SubLObject v_object, final SubLObject value) {
		assert NIL != slot_p(v_object) : "slots.slot_p error :" + v_object;
		return v_object.setField5(value);
	}

	public static SubLObject _csetf_slot_essential(final SubLObject v_object, final SubLObject value) {
		assert NIL != slot_p(v_object) : "slots.slot_p error :" + v_object;
		return v_object.setField6(value);
	}

	public static SubLObject _csetf_slot_init_value(final SubLObject v_object, final SubLObject value) {
		assert NIL != slot_p(v_object) : "slots.slot_p error :" + v_object;
		return v_object.setField7(value);
	}

	public static SubLObject make_slot(SubLObject arglist) {
		if (arglist == UNPROVIDED) {
			arglist = NIL;
		}
		final SubLObject v_new = new $slot_native();
		SubLObject next;
		SubLObject current_arg;
		SubLObject current_value;
		SubLObject pcase_var;
		for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
			current_arg = next.first();
			current_value = cadr(next);
			pcase_var = current_arg;
			if (pcase_var.eql($NAME)) {
				_csetf_slot_name(v_new, current_value);
			} else if (pcase_var.eql($INDEX)) {
				_csetf_slot_index(v_new, current_value);
			} else if (pcase_var.eql($PROTECTION)) {
				_csetf_slot_protection(v_new, current_value);
			} else if (pcase_var.eql($CLASS_NAME)) {
				_csetf_slot_class_name(v_new, current_value);
			} else if (pcase_var.eql($ESSENTIAL)) {
				_csetf_slot_essential(v_new, current_value);
			} else if (pcase_var.eql($INIT_VALUE)) {
				_csetf_slot_init_value(v_new, current_value);
			} else {
				Errors.error($str27$Invalid_slot__S_for_construction_, current_arg);
			}

		}
		return v_new;
	}

	public static SubLObject visit_defstruct_slot(final SubLObject obj, final SubLObject visitor_fn) {
		funcall(visitor_fn, obj, $BEGIN, MAKE_SLOT, SIX_INTEGER);
		funcall(visitor_fn, obj, $SLOT, $NAME, slot_name(obj));
		funcall(visitor_fn, obj, $SLOT, $INDEX, slot_index(obj));
		funcall(visitor_fn, obj, $SLOT, $PROTECTION, slot_protection(obj));
		funcall(visitor_fn, obj, $SLOT, $CLASS_NAME, slot_class_name(obj));
		funcall(visitor_fn, obj, $SLOT, $ESSENTIAL, slot_essential(obj));
		funcall(visitor_fn, obj, $SLOT, $INIT_VALUE, slot_init_value(obj));
		funcall(visitor_fn, obj, $END, MAKE_SLOT, SIX_INTEGER);
		return obj;
	}

	public static SubLObject visit_defstruct_object_slot_method(final SubLObject obj, final SubLObject visitor_fn) {
		return visit_defstruct_slot(obj, visitor_fn);
	}

	public static SubLObject new_slot(final SubLObject name, final SubLObject index, final SubLObject class_name, SubLObject protection, SubLObject is_essential, SubLObject init_value) {
		if (protection == UNPROVIDED) {
			protection = $PUBLIC;
		}
		if (is_essential == UNPROVIDED) {
			is_essential = NIL;
		}
		if (init_value == UNPROVIDED) {
			init_value = NIL;
		}
		final SubLObject slot = make_slot(UNPROVIDED);
		_csetf_slot_name(slot, name);
		_csetf_slot_index(slot, index);
		_csetf_slot_protection(slot, protection);
		_csetf_slot_class_name(slot, class_name);
		_csetf_slot_essential(slot, is_essential);
		_csetf_slot_init_value(slot, copy_tree(init_value));
		return slot;
	}

	public static SubLObject with_slot(final SubLObject macroform, final SubLObject environment) {
		SubLObject current;
		final SubLObject datum = current = macroform.rest();
		SubLObject slot = NIL;
		destructuring_bind_must_consp(current, datum, $list34);
		slot = current.first();
		final SubLObject forms;
		current = forms = current.rest();
		final SubLObject slot_var = make_symbol($$$slot);
		return generate_instance_variable_bindings_for_structure_slots(slot_var, slot, SLOT_, $list2, forms, UNPROVIDED);
	}

	public static SubLObject with_slot_private(final SubLObject macroform, final SubLObject environment) {
		SubLObject current;
		final SubLObject datum = current = macroform.rest();
		SubLObject slot = NIL;
		destructuring_bind_must_consp(current, datum, $list34);
		slot = current.first();
		final SubLObject forms;
		current = forms = current.rest();
		final SubLObject slot_var = make_symbol($$$slot);
		return generate_instance_variable_bindings_for_structure_slots(slot_var, slot, SLOT_, $list2, forms, NIL);
	}

	public static SubLObject print_slot(final SubLObject v_object, final SubLObject stream, final SubLObject depth) {
		final SubLObject name = slot_name(v_object);
		final SubLObject index = slot_index(v_object);
		final SubLObject protection = slot_protection(v_object);
		final SubLObject class_name = slot_class_name(v_object);
		final SubLObject essential = slot_essential(v_object);
		final SubLObject init_value = slot_init_value(v_object);
		format(stream, $str37$__SLOT__name__S__index__S__protec, new SubLObject[] { name, index, protection, essential, class_name, init_value });
		return v_object;
	}

	public static SubLObject slot_assoc(final SubLObject slot_name, final SubLObject v_slots) {
		SubLObject cdolist_list_var = v_slots;
		SubLObject slot = NIL;
		slot = cdolist_list_var.first();
		while (NIL != cdolist_list_var) {
			final SubLObject slot_$1 = slot;
			final SubLObject name = slot_name(slot_$1);
			if (slot_name.eql(name)) {
				return slot;
			}
			cdolist_list_var = cdolist_list_var.rest();
			slot = cdolist_list_var.first();
		}
		return NIL;
	}

	public static SubLObject slot_assoc_by_name(final SubLObject string, final SubLObject v_slots) {
		SubLObject cdolist_list_var = v_slots;
		SubLObject slot = NIL;
		slot = cdolist_list_var.first();
		while (NIL != cdolist_list_var) {
			final SubLObject slot_$2 = slot;
			final SubLObject name = slot_name(slot_$2);
			if (string.equal(symbol_name(name))) {
				return slot;
			}
			cdolist_list_var = cdolist_list_var.rest();
			slot = cdolist_list_var.first();
		}
		return NIL;
	}

	public static SubLObject find_slot_index(final SubLObject slot_name, final SubLObject v_slots) {
		final SubLObject slot = slot_assoc(slot_name, v_slots);
		if (NIL != slot) {
			return slot_index(slot);
		}
		return NIL;
	}

	public static SubLObject find_slot_protection(final SubLObject slot_name, final SubLObject v_slots) {
		final SubLObject slot = slot_assoc(slot_name, v_slots);
		if (NIL != slot) {
			return slot_protection(slot);
		}
		return NIL;
	}

	public static SubLObject find_slot_class_name(final SubLObject slot_name, final SubLObject v_slots) {
		final SubLObject slot = slot_assoc(slot_name, v_slots);
		if (NIL != slot) {
			return slot_class_name(slot);
		}
		return NIL;
	}

	public static SubLObject find_slot_essential(final SubLObject slot_name, final SubLObject v_slots) {
		final SubLObject slot = slot_assoc(slot_name, v_slots);
		if (NIL != slot) {
			return slot_essential(slot);
		}
		return NIL;
	}

	public static SubLObject find_slot_init_value(final SubLObject slot_name, final SubLObject v_slots) {
		final SubLObject slot = slot_assoc(slot_name, v_slots);
		if (NIL != slot) {
			return slot_init_value(slot);
		}
		return NIL;
	}

	public static SubLObject set_slot_init_value(final SubLObject slot_name, final SubLObject v_slots, final SubLObject init_value) {
		final SubLObject slot = slot_assoc(slot_name, v_slots);
		if (NIL != slot) {
			_csetf_slot_init_value(slot, copy_tree(init_value));
			return NIL;
		}
		return NIL;
	}

	public static SubLObject cdoslots(final SubLObject macroform, final SubLObject environment) {
		SubLObject current;
		final SubLObject datum = current = macroform.rest();
		destructuring_bind_must_consp(current, datum, $list38);
		final SubLObject temp = current.rest();
		current = current.first();
		SubLObject name_var = NIL;
		SubLObject index_var = NIL;
		SubLObject protection_var = NIL;
		SubLObject class_name_var = NIL;
		SubLObject init_value_var = NIL;
		SubLObject slots_form = NIL;
		destructuring_bind_must_consp(current, datum, $list38);
		name_var = current.first();
		current = current.rest();
		destructuring_bind_must_consp(current, datum, $list38);
		index_var = current.first();
		current = current.rest();
		destructuring_bind_must_consp(current, datum, $list38);
		protection_var = current.first();
		current = current.rest();
		destructuring_bind_must_consp(current, datum, $list38);
		class_name_var = current.first();
		current = current.rest();
		destructuring_bind_must_consp(current, datum, $list38);
		init_value_var = current.first();
		current = current.rest();
		destructuring_bind_must_consp(current, datum, $list38);
		slots_form = current.first();
		current = current.rest();
		if (NIL == current) {
			final SubLObject body;
			current = body = temp;
			final SubLObject slot_var = make_symbol($$$slot);
			return list(CLET, bq_cons(name_var, append(new SubLObject[] { NIL != index_var ? list(index_var) : NIL, NIL != protection_var ? list(protection_var) : NIL, NIL != class_name_var ? list(class_name_var) : NIL, NIL != init_value_var ? list(init_value_var) : NIL, NIL })), listS(CDOLIST, list(slot_var, slots_form), list(CSETQ, name_var, list(SLOT_NAME, slot_var)), append(new SubLObject[] {
					NIL != index_var ? list(list(CSETQ, index_var, list(SLOT_INDEX, slot_var))) : NIL, NIL != protection_var ? list(list(CSETQ, protection_var, list(SLOT_PROTECTION, slot_var))) : NIL, NIL != class_name_var ? list(list(CSETQ, class_name_var, list(SLOT_CLASS_NAME, slot_var))) : NIL, NIL != init_value_var ? list(list(CSETQ, init_value_var, list(SLOT_INIT_VALUE, slot_var))) : NIL, body })));
		}
		cdestructuring_bind_error(datum, $list38);
		return NIL;
	}

	public static SubLObject cdo_essential_slots(final SubLObject macroform, final SubLObject environment) {
		SubLObject current;
		final SubLObject datum = current = macroform.rest();
		destructuring_bind_must_consp(current, datum, $list38);
		final SubLObject temp = current.rest();
		current = current.first();
		SubLObject name_var = NIL;
		SubLObject index_var = NIL;
		SubLObject protection_var = NIL;
		SubLObject class_name_var = NIL;
		SubLObject init_value_var = NIL;
		SubLObject slots_form = NIL;
		destructuring_bind_must_consp(current, datum, $list38);
		name_var = current.first();
		current = current.rest();
		destructuring_bind_must_consp(current, datum, $list38);
		index_var = current.first();
		current = current.rest();
		destructuring_bind_must_consp(current, datum, $list38);
		protection_var = current.first();
		current = current.rest();
		destructuring_bind_must_consp(current, datum, $list38);
		class_name_var = current.first();
		current = current.rest();
		destructuring_bind_must_consp(current, datum, $list38);
		init_value_var = current.first();
		current = current.rest();
		destructuring_bind_must_consp(current, datum, $list38);
		slots_form = current.first();
		current = current.rest();
		if (NIL == current) {
			final SubLObject body;
			current = body = temp;
			final SubLObject slot_var = make_symbol($$$slot);
			return list(CLET, bq_cons(name_var, append(new SubLObject[] { NIL != index_var ? list(index_var) : NIL, NIL != protection_var ? list(protection_var) : NIL, NIL != class_name_var ? list(class_name_var) : NIL, NIL != init_value_var ? list(init_value_var) : NIL, NIL })),
					list(CDOLIST, list(slot_var, slots_form), listS(PWHEN, list(SLOT_ESSENTIAL, slot_var), list(CSETQ, name_var, list(SLOT_NAME, slot_var)), append(new SubLObject[] { NIL != index_var ? list(list(CSETQ, index_var, list(SLOT_INDEX, slot_var))) : NIL, NIL != protection_var ? list(list(CSETQ, protection_var, list(SLOT_PROTECTION, slot_var))) : NIL,
							NIL != class_name_var ? list(list(CSETQ, class_name_var, list(SLOT_CLASS_NAME, slot_var))) : NIL, NIL != init_value_var ? list(list(CSETQ, init_value_var, list(SLOT_INIT_VALUE, slot_var))) : NIL, body }))));
		}
		cdestructuring_bind_error(datum, $list38);
		return NIL;
	}

	public static SubLObject get_slot_accessors(final SubLObject v_slots, final SubLObject target_slot_name) {
		SubLObject slot_name = NIL;
		SubLObject class_name = NIL;
		SubLObject cdolist_list_var = v_slots;
		SubLObject slot = NIL;
		slot = cdolist_list_var.first();
		while (NIL != cdolist_list_var) {
			slot_name = slot_name(slot);
			class_name = slot_class_name(slot);
			if (slot_name.eql(target_slot_name)) {
				return values(intern(cconcatenate($str43$GET_, new SubLObject[] { symbol_name(class_name), $str44$_, symbol_name(slot_name) }), UNPROVIDED), intern(cconcatenate($str45$SET_, new SubLObject[] { symbol_name(class_name), $str44$_, symbol_name(slot_name) }), UNPROVIDED));
			}
			cdolist_list_var = cdolist_list_var.rest();
			slot = cdolist_list_var.first();
		}
		return values(NIL, NIL);
	}

	public static SubLObject get_instance_slot_accessors(final SubLObject v_class, final SubLObject target_slot_name) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		final SubLObject compiled_instance_slot_access_alist = subloop_structures.class_compiled_instance_slot_access_alist(v_class);
		final SubLObject compiled_instance_boolean_slot_access_alist = subloop_structures.class_compiled_instance_boolean_slot_access_alist(v_class);
		final SubLObject compiled_class_slot_access_alist = subloop_structures.class_compiled_class_slot_access_alist(v_class);
		final SubLObject compiled_class_boolean_slot_access_alist = subloop_structures.class_compiled_class_boolean_slot_access_alist(v_class);
		thread.resetMultipleValues();
		SubLObject getter = get_slot_accessors(compiled_class_boolean_slot_access_alist, target_slot_name);
		SubLObject setter = thread.secondMultipleValue();
		thread.resetMultipleValues();
		if ((NIL != getter) && (NIL != setter)) {
			return values(getter, setter);
		}
		thread.resetMultipleValues();
		getter = get_slot_accessors(compiled_class_slot_access_alist, target_slot_name);
		setter = thread.secondMultipleValue();
		thread.resetMultipleValues();
		if ((NIL != getter) && (NIL != setter)) {
			return values(getter, setter);
		}
		thread.resetMultipleValues();
		getter = get_slot_accessors(compiled_instance_boolean_slot_access_alist, target_slot_name);
		setter = thread.secondMultipleValue();
		thread.resetMultipleValues();
		if ((NIL != getter) && (NIL != setter)) {
			return values(getter, setter);
		}
		thread.resetMultipleValues();
		getter = get_slot_accessors(compiled_instance_slot_access_alist, target_slot_name);
		setter = thread.secondMultipleValue();
		thread.resetMultipleValues();
		if ((NIL != getter) && (NIL != setter)) {
			return values(getter, setter);
		}
		return values(NIL, NIL);
	}

	public static SubLObject get_class_slot_accessors(final SubLObject v_class, final SubLObject target_slot_name) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		final SubLObject compiled_class_slot_access_alist = subloop_structures.class_compiled_class_slot_access_alist(v_class);
		final SubLObject compiled_class_boolean_slot_access_alist = subloop_structures.class_compiled_class_boolean_slot_access_alist(v_class);
		thread.resetMultipleValues();
		SubLObject getter = get_slot_accessors(compiled_class_boolean_slot_access_alist, target_slot_name);
		SubLObject setter = thread.secondMultipleValue();
		thread.resetMultipleValues();
		if ((NIL != getter) && (NIL != setter)) {
			return values(getter, setter);
		}
		thread.resetMultipleValues();
		getter = get_slot_accessors(compiled_class_slot_access_alist, target_slot_name);
		setter = thread.secondMultipleValue();
		thread.resetMultipleValues();
		if ((NIL != getter) && (NIL != setter)) {
			return values(getter, setter);
		}
		return values(NIL, NIL);
	}

	public static SubLObject expand_inline_get_slot(final SubLObject slot_name, final SubLObject class_name, final SubLObject class_or_instance) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && ((NIL == slot_name) || (!slot_name.isSymbol()))) {
			Errors.error($str46$INLINE_GET_SLOT___S_is_not_a_vali, slot_name);
		}
		if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && ((NIL == class_name) || (!class_name.isSymbol()))) {
			Errors.error($str47$INLINE_GET_SLOT___S_is_not_a_vali, class_name);
		}
		final SubLObject actual_class = classes.classes_retrieve_class(class_name);
		if (NIL == actual_class) {
			return list(GET_SLOT, class_or_instance, list(QUOTE, slot_name));
		}
		thread.resetMultipleValues();
		final SubLObject getter = get_instance_slot_accessors(actual_class, slot_name);
		final SubLObject setter = thread.secondMultipleValue();
		thread.resetMultipleValues();
		if (NIL != getter) {
			return list(getter, class_or_instance);
		}
		list(GET_SLOT, class_or_instance, list(QUOTE, slot_name));
		return NIL;
	}

	public static SubLObject inline_get_slot(final SubLObject macroform, final SubLObject environment) {
		SubLObject current;
		final SubLObject datum = current = macroform.rest();
		destructuring_bind_must_consp(current, datum, $list50);
		final SubLObject temp = current.rest();
		current = current.first();
		SubLObject slot_name = NIL;
		SubLObject class_name = NIL;
		destructuring_bind_must_consp(current, datum, $list50);
		slot_name = current.first();
		current = current.rest();
		destructuring_bind_must_consp(current, datum, $list50);
		class_name = current.first();
		current = current.rest();
		if (NIL == current) {
			current = temp;
			SubLObject class_or_instance = NIL;
			destructuring_bind_must_consp(current, datum, $list50);
			class_or_instance = current.first();
			current = current.rest();
			if (NIL == current) {
				return expand_inline_get_slot(slot_name, class_name, class_or_instance);
			}
			cdestructuring_bind_error(datum, $list50);
		} else {
			cdestructuring_bind_error(datum, $list50);
		}
		return NIL;
	}

	public static SubLObject expand_inline_set_slot(final SubLObject slot_name, final SubLObject class_name, final SubLObject class_or_instance, final SubLObject new_value) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && ((NIL == slot_name) || (!slot_name.isSymbol()))) {
			Errors.error($str46$INLINE_GET_SLOT___S_is_not_a_vali, slot_name);
		}
		if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && ((NIL == class_name) || (!class_name.isSymbol()))) {
			Errors.error($str47$INLINE_GET_SLOT___S_is_not_a_vali, class_name);
		}
		final SubLObject actual_class = classes.classes_retrieve_class(class_name);
		if (NIL == actual_class) {
			return list(SET_SLOT, class_or_instance, list(QUOTE, slot_name), new_value);
		}
		thread.resetMultipleValues();
		final SubLObject getter = get_instance_slot_accessors(actual_class, slot_name);
		final SubLObject setter = thread.secondMultipleValue();
		thread.resetMultipleValues();
		if (NIL != setter) {
			return list(setter, class_or_instance, new_value);
		}
		list(SET_SLOT, class_or_instance, list(QUOTE, slot_name), new_value);
		return NIL;
	}

	public static SubLObject inline_set_slot(final SubLObject macroform, final SubLObject environment) {
		SubLObject current;
		final SubLObject datum = current = macroform.rest();
		destructuring_bind_must_consp(current, datum, $list52);
		final SubLObject temp = current.rest();
		current = current.first();
		SubLObject slot_name = NIL;
		SubLObject class_name = NIL;
		destructuring_bind_must_consp(current, datum, $list52);
		slot_name = current.first();
		current = current.rest();
		destructuring_bind_must_consp(current, datum, $list52);
		class_name = current.first();
		current = current.rest();
		if (NIL == current) {
			current = temp;
			SubLObject class_or_instance = NIL;
			SubLObject new_value = NIL;
			destructuring_bind_must_consp(current, datum, $list52);
			class_or_instance = current.first();
			current = current.rest();
			destructuring_bind_must_consp(current, datum, $list52);
			new_value = current.first();
			current = current.rest();
			if (NIL == current) {
				return expand_inline_set_slot(slot_name, class_name, class_or_instance, new_value);
			}
			cdestructuring_bind_error(datum, $list52);
		} else {
			cdestructuring_bind_error(datum, $list52);
		}
		return NIL;
	}

	public static SubLObject declare_slots_file() {
		declareFunction(me, "slot_print_function_trampoline", "SLOT-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
		declareFunction(me, "slot_p", "SLOT-P", 1, 0, false);
		new slots.$slot_p$UnaryFunction();
		declareFunction(me, "slot_name", "SLOT-NAME", 1, 0, false);
		declareFunction(me, "slot_index", "SLOT-INDEX", 1, 0, false);
		declareFunction(me, "slot_protection", "SLOT-PROTECTION", 1, 0, false);
		declareFunction(me, "slot_class_name", "SLOT-CLASS-NAME", 1, 0, false);
		declareFunction(me, "slot_essential", "SLOT-ESSENTIAL", 1, 0, false);
		declareFunction(me, "slot_init_value", "SLOT-INIT-VALUE", 1, 0, false);
		declareFunction(me, "_csetf_slot_name", "_CSETF-SLOT-NAME", 2, 0, false);
		declareFunction(me, "_csetf_slot_index", "_CSETF-SLOT-INDEX", 2, 0, false);
		declareFunction(me, "_csetf_slot_protection", "_CSETF-SLOT-PROTECTION", 2, 0, false);
		declareFunction(me, "_csetf_slot_class_name", "_CSETF-SLOT-CLASS-NAME", 2, 0, false);
		declareFunction(me, "_csetf_slot_essential", "_CSETF-SLOT-ESSENTIAL", 2, 0, false);
		declareFunction(me, "_csetf_slot_init_value", "_CSETF-SLOT-INIT-VALUE", 2, 0, false);
		declareFunction(me, "make_slot", "MAKE-SLOT", 0, 1, false);
		declareFunction(me, "visit_defstruct_slot", "VISIT-DEFSTRUCT-SLOT", 2, 0, false);
		declareFunction(me, "visit_defstruct_object_slot_method", "VISIT-DEFSTRUCT-OBJECT-SLOT-METHOD", 2, 0, false);
		declareFunction(me, "new_slot", "NEW-SLOT", 3, 3, false);
		declareMacro(me, "with_slot", "WITH-SLOT");
		declareMacro(me, "with_slot_private", "WITH-SLOT-PRIVATE");
		declareFunction(me, "print_slot", "PRINT-SLOT", 3, 0, false);
		declareFunction(me, "slot_assoc", "SLOT-ASSOC", 2, 0, false);
		declareFunction(me, "slot_assoc_by_name", "SLOT-ASSOC-BY-NAME", 2, 0, false);
		declareFunction(me, "find_slot_index", "FIND-SLOT-INDEX", 2, 0, false);
		declareFunction(me, "find_slot_protection", "FIND-SLOT-PROTECTION", 2, 0, false);
		declareFunction(me, "find_slot_class_name", "FIND-SLOT-CLASS-NAME", 2, 0, false);
		declareFunction(me, "find_slot_essential", "FIND-SLOT-ESSENTIAL", 2, 0, false);
		declareFunction(me, "find_slot_init_value", "FIND-SLOT-INIT-VALUE", 2, 0, false);
		declareFunction(me, "set_slot_init_value", "SET-SLOT-INIT-VALUE", 3, 0, false);
		declareMacro(me, "cdoslots", "CDOSLOTS");
		declareMacro(me, "cdo_essential_slots", "CDO-ESSENTIAL-SLOTS");
		declareFunction(me, "get_slot_accessors", "GET-SLOT-ACCESSORS", 2, 0, false);
		declareFunction(me, "get_instance_slot_accessors", "GET-INSTANCE-SLOT-ACCESSORS", 2, 0, false);
		declareFunction(me, "get_class_slot_accessors", "GET-CLASS-SLOT-ACCESSORS", 2, 0, false);
		declareFunction(me, "expand_inline_get_slot", "EXPAND-INLINE-GET-SLOT", 3, 0, false);
		declareMacro(me, "inline_get_slot", "INLINE-GET-SLOT");
		declareFunction(me, "expand_inline_set_slot", "EXPAND-INLINE-SET-SLOT", 4, 0, false);
		declareMacro(me, "inline_set_slot", "INLINE-SET-SLOT");
		return NIL;
	}

	public static SubLObject init_slots_file() {
		defconstant("*DTP-SLOT*", SLOT);
		return NIL;
	}

	public static SubLObject setup_slots_file() {
		register_method($print_object_method_table$.getGlobalValue(), $dtp_slot$.getGlobalValue(), symbol_function(SLOT_PRINT_FUNCTION_TRAMPOLINE));
		SubLSpecialOperatorDeclarations.proclaim($list8);
		def_csetf(SLOT_NAME, _CSETF_SLOT_NAME);
		def_csetf(SLOT_INDEX, _CSETF_SLOT_INDEX);
		def_csetf(SLOT_PROTECTION, _CSETF_SLOT_PROTECTION);
		def_csetf(SLOT_CLASS_NAME, _CSETF_SLOT_CLASS_NAME);
		def_csetf(SLOT_ESSENTIAL, _CSETF_SLOT_ESSENTIAL);
		def_csetf(SLOT_INIT_VALUE, _CSETF_SLOT_INIT_VALUE);
		identity(SLOT);
		register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_slot$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_SLOT_METHOD));
		return NIL;
	}

	@Override
	public void declareFunctions() {
		declare_slots_file();
	}

	@Override
	public void initializeVariables() {
		init_slots_file();
	}

	@Override
	public void runTopLevelForms() {
		setup_slots_file();
	}

	

	public static final class $slot_native extends SubLStructNative {
		public SubLObject $name;

		public SubLObject $index;

		public SubLObject $protection;

		public SubLObject $class_name;

		public SubLObject $essential;

		public SubLObject $init_value;

		private static final SubLStructDeclNative structDecl;

		private $slot_native() {
			this.$name = Lisp.NIL;
			this.$index = Lisp.NIL;
			this.$protection = Lisp.NIL;
			this.$class_name = Lisp.NIL;
			this.$essential = Lisp.NIL;
			this.$init_value = Lisp.NIL;
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
			return this.$index;
		}

		@Override
		public SubLObject getField4() {
			return this.$protection;
		}

		@Override
		public SubLObject getField5() {
			return this.$class_name;
		}

		@Override
		public SubLObject getField6() {
			return this.$essential;
		}

		@Override
		public SubLObject getField7() {
			return this.$init_value;
		}

		@Override
		public SubLObject setField2(final SubLObject value) {
			return this.$name = value;
		}

		@Override
		public SubLObject setField3(final SubLObject value) {
			return this.$index = value;
		}

		@Override
		public SubLObject setField4(final SubLObject value) {
			return this.$protection = value;
		}

		@Override
		public SubLObject setField5(final SubLObject value) {
			return this.$class_name = value;
		}

		@Override
		public SubLObject setField6(final SubLObject value) {
			return this.$essential = value;
		}

		@Override
		public SubLObject setField7(final SubLObject value) {
			return this.$init_value = value;
		}

		static {
			structDecl = makeStructDeclNative($slot_native.class, SLOT, SLOT_P, $list2, $list3, new String[] { "$name", "$index", "$protection", "$class_name", "$essential", "$init_value" }, $list4, $list5, PRINT_SLOT);
		}
	}

	public static final class $slot_p$UnaryFunction extends UnaryFunction {
		public $slot_p$UnaryFunction() {
			super(extractFunctionNamed("SLOT-P"));
		}

		@Override
		public SubLObject processItem(final SubLObject arg1) {
			return slot_p(arg1);
		}
	}
}

/**
 * Total time: 212 ms
 */
