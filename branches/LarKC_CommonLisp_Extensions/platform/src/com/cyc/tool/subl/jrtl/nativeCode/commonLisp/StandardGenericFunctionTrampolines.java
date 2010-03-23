package com.cyc.tool.subl.jrtl.nativeCode.commonLisp;

import static com.cyc.tool.subl.jrtl.nativeCode.commonLisp.Lisp.NIL;
import static com.cyc.tool.subl.jrtl.nativeCode.commonLisp.Lisp.PACKAGE_MOP;
import static com.cyc.tool.subl.jrtl.nativeCode.commonLisp.Lisp.PACKAGE_SYS;
import static com.cyc.tool.subl.jrtl.nativeCode.commonLisp.Lisp.T;
import static com.cyc.tool.subl.jrtl.nativeCode.commonLisp.Lisp.list;
import static com.cyc.tool.subl.jrtl.nativeCode.commonLisp.Lisp.type_error;

import java.util.HashMap;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;

public class StandardGenericFunctionTrampolines {
	// AMOP (p. 216) specifies the following readers as generic functions:
	//   generic-function-argument-precedence-order
	//   generic-function-declarations
	//   generic-function-lambda-list
	//   generic-function-method-class
	//   generic-function-method-combination
	//   generic-function-methods
	//   generic-function-name

	// ### %generic-function-name
	private static final Primitive _GENERIC_FUNCTION_NAME = new JavaPrimitive("%generic-function-name", PACKAGE_SYS, true) {
		@Override
		public SubLObject execute(SubLObject arg) {
			return checkStandardGenericFunction(arg).slots[StandardGenericFunctionClass.SLOT_INDEX_NAME];
		}
	};

	// ### %set-generic-function-name
	private static final Primitive _SET_GENERIC_FUNCTION_NAME = new JavaPrimitive("%set-generic-function-name",
			PACKAGE_SYS, true) {
		@Override
		public SubLObject execute(SubLObject first, SubLObject second)

		{
			checkStandardGenericFunction(first).slots[StandardGenericFunctionClass.SLOT_INDEX_NAME] = second;
			return second;
		}
	};

	// ### %generic-function-lambda-list
	private static final Primitive _GENERIC_FUNCTION_LAMBDA_LIST = new JavaPrimitive("%generic-function-lambda-list",
			PACKAGE_SYS, true) {
		@Override
		public SubLObject execute(SubLObject arg) {
			return checkStandardGenericFunction(arg).slots[StandardGenericFunctionClass.SLOT_INDEX_LAMBDA_LIST];
		}
	};

	// ### %set-generic-function-lambdaList
	private static final Primitive _SET_GENERIC_FUNCTION_LAMBDA_LIST = new JavaPrimitive(
			"%set-generic-function-lambda-list", PACKAGE_SYS, true) {
		@Override
		public SubLObject execute(SubLObject first, SubLObject second)

		{
			checkStandardGenericFunction(first).slots[StandardGenericFunctionClass.SLOT_INDEX_LAMBDA_LIST] = second;
			return second;
		}
	};

	// ### funcallable-instance-function funcallable-instance => function
	private static final Primitive FUNCALLABLE_INSTANCE_FUNCTION = new JavaPrimitive("funcallable-instance-function",
			PACKAGE_MOP, false, "funcallable-instance") {
		@Override
		public SubLObject execute(SubLObject arg)

		{
			return checkStandardGenericFunction(arg).function;
		}
	};

	// ### set-funcallable-instance-function funcallable-instance function => unspecified
	// AMOP p. 230
	private static final Primitive SET_FUNCALLABLE_INSTANCE_FUNCTION = new JavaPrimitive(
			"set-funcallable-instance-function", PACKAGE_MOP, true, "funcallable-instance function") {
		@Override
		public SubLObject execute(SubLObject first, SubLObject second)

		{
			checkStandardGenericFunction(first).function = second;
			return second;
		}
	};

	// ### gf-required-args
	private static final Primitive GF_REQUIRED_ARGS = new JavaPrimitive("gf-required-args", PACKAGE_SYS, true) {
		@Override
		public SubLObject execute(SubLObject arg) {
			return checkStandardGenericFunction(arg).slots[StandardGenericFunctionClass.SLOT_INDEX_REQUIRED_ARGS];
		}
	};

	// ### %set-gf-required-args
	private static final Primitive _SET_GF_REQUIRED_ARGS = new JavaPrimitive("%set-gf-required-args", PACKAGE_SYS, true) {
		@Override
		public SubLObject execute(SubLObject first, SubLObject second)

		{
			final StandardGenericFunction gf = checkStandardGenericFunction(first);
			gf.slots[StandardGenericFunctionClass.SLOT_INDEX_REQUIRED_ARGS] = second;
			gf.numberOfRequiredArgs = second.cl_length();
			return second;
		}
	};

	// ### generic-function-initial-methods
	private static final Primitive GENERIC_FUNCTION_INITIAL_METHODS = new JavaPrimitive(
			"generic-function-initial-methods", PACKAGE_SYS, true) {
		@Override
		public SubLObject execute(SubLObject arg) {
			return checkStandardGenericFunction(arg).slots[StandardGenericFunctionClass.SLOT_INDEX_INITIAL_METHODS];
		}
	};

	// ### set-generic-function-initial-methods
	private static final Primitive SET_GENERIC_FUNCTION_INITIAL_METHODS = new JavaPrimitive(
			"set-generic-function-initial-methods", PACKAGE_SYS, true) {
		@Override
		public SubLObject execute(SubLObject first, SubLObject second)

		{
			checkStandardGenericFunction(first).slots[StandardGenericFunctionClass.SLOT_INDEX_INITIAL_METHODS] = second;
			return second;
		}
	};

	// ### generic-function-methods
	private static final Primitive GENERIC_FUNCTION_METHODS = new JavaPrimitive("generic-function-methods", PACKAGE_SYS,
			true) {
		@Override
		public SubLObject execute(SubLObject arg) {
			return checkStandardGenericFunction(arg).slots[StandardGenericFunctionClass.SLOT_INDEX_METHODS];
		}
	};

	// ### set-generic-function-methods
	private static final Primitive SET_GENERIC_FUNCTION_METHODS = new JavaPrimitive("set-generic-function-methods",
			PACKAGE_SYS, true) {
		@Override
		public SubLObject execute(SubLObject first, SubLObject second)

		{
			checkStandardGenericFunction(first).slots[StandardGenericFunctionClass.SLOT_INDEX_METHODS] = second;
			return second;
		}
	};

	// ### generic-function-method-class
	private static final Primitive GENERIC_FUNCTION_METHOD_CLASS = new JavaPrimitive("generic-function-method-class",
			PACKAGE_SYS, true) {
		@Override
		public SubLObject execute(SubLObject arg) {
			return checkStandardGenericFunction(arg).slots[StandardGenericFunctionClass.SLOT_INDEX_METHOD_CLASS];
		}
	};

	// ### set-generic-function-method-class
	private static final Primitive SET_GENERIC_FUNCTION_METHOD_CLASS = new JavaPrimitive(
			"set-generic-function-method-class", PACKAGE_SYS, true) {
		@Override
		public SubLObject execute(SubLObject first, SubLObject second)

		{
			checkStandardGenericFunction(first).slots[StandardGenericFunctionClass.SLOT_INDEX_METHOD_CLASS] = second;
			return second;
		}
	};

	// ### generic-function-method-combination
	private static final Primitive GENERIC_FUNCTION_METHOD_COMBINATION = new JavaPrimitive(
			"generic-function-method-combination", PACKAGE_SYS, true) {
		@Override
		public SubLObject execute(SubLObject arg) {
			return checkStandardGenericFunction(arg).slots[StandardGenericFunctionClass.SLOT_INDEX_METHOD_COMBINATION];
		}
	};

	// ### set-generic-function-method-combination
	private static final Primitive SET_GENERIC_FUNCTION_METHOD_COMBINATION = new JavaPrimitive(
			"set-generic-function-method-combination", PACKAGE_SYS, true) {
		@Override
		public SubLObject execute(SubLObject first, SubLObject second)

		{
			checkStandardGenericFunction(first).slots[StandardGenericFunctionClass.SLOT_INDEX_METHOD_COMBINATION] = second;
			return second;
		}
	};

	// ### generic-function-argument-precedence-order
	private static final Primitive GENERIC_FUNCTION_ARGUMENT_PRECEDENCE_ORDER = new JavaPrimitive(
			"generic-function-argument-precedence-order", PACKAGE_SYS, true) {
		@Override
		public SubLObject execute(SubLObject arg) {
			return checkStandardGenericFunction(arg).slots[StandardGenericFunctionClass.SLOT_INDEX_ARGUMENT_PRECEDENCE_ORDER];
		}
	};

	// ### set-generic-function-argument-precedence-order
	private static final Primitive SET_GENERIC_FUNCTION_ARGUMENT_PRECEDENCE_ORDER = new JavaPrimitive(
			"set-generic-function-argument-precedence-order", PACKAGE_SYS, true) {
		@Override
		public SubLObject execute(SubLObject first, SubLObject second)

		{
			checkStandardGenericFunction(first).slots[StandardGenericFunctionClass.SLOT_INDEX_ARGUMENT_PRECEDENCE_ORDER] = second;
			return second;
		}
	};

	// ### generic-function-classes-to-emf-table
	private static final Primitive GENERIC_FUNCTION_CLASSES_TO_EMF_TABLE = new JavaPrimitive(
			"generic-function-classes-to-emf-table", PACKAGE_SYS, true) {
		@Override
		public SubLObject execute(SubLObject arg) {
			return checkStandardGenericFunction(arg).slots[StandardGenericFunctionClass.SLOT_INDEX_CLASSES_TO_EMF_TABLE];
		}
	};

	// ### set-generic-function-classes-to-emf-table
	private static final Primitive SET_GENERIC_FUNCTION_CLASSES_TO_EMF_TABLE = new JavaPrimitive(
			"set-generic-function-classes-to-emf-table", PACKAGE_SYS, true) {
		@Override
		public SubLObject execute(SubLObject first, SubLObject second)

		{
			checkStandardGenericFunction(first).slots[StandardGenericFunctionClass.SLOT_INDEX_CLASSES_TO_EMF_TABLE] = second;
			return second;
		}
	};

	// ### generic-function-documentation
	private static final Primitive GENERIC_FUNCTION_DOCUMENTATION = new JavaPrimitive("generic-function-documentation",
			PACKAGE_SYS, true) {
		@Override
		public SubLObject execute(SubLObject arg) {
			return checkStandardGenericFunction(arg).slots[StandardGenericFunctionClass.SLOT_INDEX_DOCUMENTATION];
		}
	};

	// ### set-generic-function-documentation
	private static final Primitive SET_GENERIC_FUNCTION_DOCUMENTATION = new JavaPrimitive(
			"set-generic-function-documentation", PACKAGE_SYS, true) {
		@Override
		public SubLObject execute(SubLObject first, SubLObject second)

		{
			checkStandardGenericFunction(first).slots[StandardGenericFunctionClass.SLOT_INDEX_DOCUMENTATION] = second;
			return second;
		}
	};

	// ### %finalize-generic-function
	private static final Primitive _FINALIZE_GENERIC_FUNCTION = new JavaPrimitive("%finalize-generic-function",
			PACKAGE_SYS, true, "generic-function") {
		@Override
		public SubLObject execute(SubLObject arg) {
			final StandardGenericFunction gf = checkStandardGenericFunction(arg);
			gf.finalizeInternal();
			return T;
		}
	};

	// ### cache-emf
	private static final Primitive CACHE_EMF = new JavaPrimitive("cache-emf", PACKAGE_SYS, true,
			"generic-function args emf") {
		@Override
		public SubLObject execute(SubLObject first, SubLObject second, SubLObject third)

		{
			final StandardGenericFunction gf = checkStandardGenericFunction(first);
			SubLObject args = second;
			SubLObject[] array = new SubLObject[gf.numberOfRequiredArgs];
			for (int i = gf.numberOfRequiredArgs; i-- > 0;) {
				array[i] = gf.getArgSpecialization(args.first());
				args = args.rest();
			}
			CacheEntry specializations = new CacheEntry(array);
			HashMap<CacheEntry, SubLObject> ht = gf.cache;
			if (ht == null)
				ht = gf.cache = new HashMap<CacheEntry, SubLObject>();
			ht.put(specializations, third);
			return third;
		}
	};

	// ### get-cached-emf
	private static final Primitive GET_CACHED_EMF = new JavaPrimitive("get-cached-emf", PACKAGE_SYS, true,
			"generic-function args") {
		@Override
		public SubLObject execute(SubLObject first, SubLObject second)

		{
			final StandardGenericFunction gf = checkStandardGenericFunction(first);
			SubLObject args = second;
			SubLObject[] array = new SubLObject[gf.numberOfRequiredArgs];
			for (int i = gf.numberOfRequiredArgs; i-- > 0;) {
				array[i] = gf.getArgSpecialization(args.first());
				args = args.rest();
			}
			CacheEntry specializations = new CacheEntry(array);
			HashMap<CacheEntry, SubLObject> ht = gf.cache;
			if (ht == null)
				return NIL;
			SubLObject emf = (SubLObject) ht.get(specializations);
			return emf != null ? emf : NIL;
		}
	};

	// ### %get-arg-specialization
	private static final Primitive _GET_ARG_SPECIALIZATION = new JavaPrimitive("%get-arg-specialization", PACKAGE_SYS,
			true, "generic-function arg") {
		@Override
		public SubLObject execute(SubLObject first, SubLObject second)

		{
			final StandardGenericFunction gf = checkStandardGenericFunction(first);
			return gf.getArgSpecialization(second);
		}
	};

	// ### cache-slot-location
	private static final Primitive CACHE_SLOT_LOCATION = new JavaPrimitive("cache-slot-location", PACKAGE_SYS, true,
			"generic-function layout location") {
		@Override
		public SubLObject execute(SubLObject first, SubLObject second, SubLObject third)

		{
			final StandardGenericFunction gf = checkStandardGenericFunction(first);
			SubLObject layout = second;
			SubLObject location = third;
			HashMap<SubLObject, SubLObject> ht = gf.slotCache;
			if (ht == null)
				ht = gf.slotCache = new HashMap<SubLObject, SubLObject>();
			ht.put(layout, location);
			return third;
		}
	};

	// ### get-cached-slot-location
	private static final Primitive GET_CACHED_SLOT_LOCATION = new JavaPrimitive("get-cached-slot-location", PACKAGE_SYS,
			true, "generic-function layout") {
		@Override
		public SubLObject execute(SubLObject first, SubLObject second)

		{
			final StandardGenericFunction gf = checkStandardGenericFunction(first);
			SubLObject layout = second;
			HashMap<SubLObject, SubLObject> ht = gf.slotCache;
			if (ht == null)
				return NIL;
			SubLObject location = (SubLObject) ht.get(layout);
			return location != null ? location : NIL;
		}
	};

	private static final StandardGenericFunction GENERIC_FUNCTION_NAME = new StandardGenericFunction(
			"generic-function-name", PACKAGE_MOP, true, _GENERIC_FUNCTION_NAME, list(LispSymbols.GENERIC_FUNCTION),
			list(StandardClass.STANDARD_GENERIC_FUNCTION));

	public static class CacheEntry {
		final SubLObject[] array;

		CacheEntry(SubLObject[] array) {
			this.array = array;
		}

		@Override
		public int hashCode() {
			int result = 0;
			for (int i = array.length; i-- > 0;)
				result ^= array[i].hashCodeLisp();
			return result;
		}

		@Override
		public boolean equals(Object object) {
			if (!(object instanceof CacheEntry))
				return false;
			final CacheEntry otherEntry = (CacheEntry) object;
			if (otherEntry.array.length != array.length)
				return false;
			final SubLObject[] otherArray = otherEntry.array;
			for (int i = array.length; i-- > 0;)
				if (array[i] != otherArray[i])
					return false;
			return true;
		}
	}

	// ### %init-eql-specializations
	private static final Primitive _INIT_EQL_SPECIALIZATIONS = new JavaPrimitive("%init-eql-specializations",
			PACKAGE_SYS, true, "generic-function eql-specilizer-objects-list") {
		@Override
		public SubLObject execute(SubLObject first, SubLObject second)

		{
			final StandardGenericFunction gf = checkStandardGenericFunction(first);
			SubLObject eqlSpecializerObjects = second;
			gf.eqlSpecializations = new EqlSpecialization[eqlSpecializerObjects.cl_length()];
			for (int i = 0; i < gf.eqlSpecializations.length; i++) {
				gf.eqlSpecializations[i] = new EqlSpecialization(eqlSpecializerObjects.first());
				eqlSpecializerObjects = eqlSpecializerObjects.rest();
			}
			return NIL;
		}
	};

	protected static class EqlSpecialization extends AbstractLispObject {
		public SubLObject eqlTo;

		public EqlSpecialization(SubLObject eqlTo) {
			this.eqlTo = eqlTo;
		}
	  @Override
	  public String writeToString() {
	  	return unreadableString(getClass().getSimpleName());
	  }

	}

	public static final StandardGenericFunction checkStandardGenericFunction(SubLObject obj)

	{
		if (obj instanceof StandardGenericFunction)
			return (StandardGenericFunction) obj;
		return (StandardGenericFunction) // Not reached.
		type_error(obj, LispSymbols.STANDARD_GENERIC_FUNCTION);
	}

}
