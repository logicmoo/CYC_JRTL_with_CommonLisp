package com.cyc.tool.subl.jrtl.nativeCode.commonLisp;

import java.util.HashMap;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;

public class StandardGenericFunctionTrampolines {
	// AMOP (p. 216) specifies the following readers as generic functions:
	// generic-function-argument-precedence-order
	// generic-function-declarations
	// generic-function-lambda-list
	// generic-function-method-class
	// generic-function-method-combination
	// generic-function-methods
	// generic-function-name

	public static class CacheEntry {
		final SubLObject[] array;

		CacheEntry(SubLObject[] array) {
			this.array = array;
		}

		public boolean equals(Object object) {
			if (!(object instanceof CacheEntry))
				return false;
			final CacheEntry otherEntry = (CacheEntry) object;
			if (otherEntry.array.length != this.array.length)
				return false;
			final SubLObject[] otherArray = otherEntry.array;
			for (int i = this.array.length; i-- > 0;)
				if (this.array[i] != otherArray[i])
					return false;
			return true;
		}

		public int hashCode() {
			int result = 0;
			for (int i = this.array.length; i-- > 0;)
				result ^= this.array[i].hashCodeLisp();
			return result;
		}
	}

	protected static class EqlSpecialization extends AbstractLispObject {
		public SubLObject eqlTo;

		public EqlSpecialization(SubLObject eqlTo) {
			this.eqlTo = eqlTo;
		}

		public String writeToString() {
			return this.unreadableString(this.getClass().getSimpleName());
		}

	}

	// ### %generic-function-name
	private static Primitive _GENERIC_FUNCTION_NAME = new JavaPrimitive("%generic-function-name", Lisp.PACKAGE_SYS,
			true) {

		public SubLObject execute(SubLObject arg) {
			return StandardGenericFunctionTrampolines
					.checkStandardGenericFunction(arg).slots[StandardGenericFunctionClass.SLOT_INDEX_NAME];
		}
	};

	// ### %set-generic-function-name
	private static Primitive _SET_GENERIC_FUNCTION_NAME = new JavaPrimitive("%set-generic-function-name",
			Lisp.PACKAGE_SYS, true) {

		public SubLObject execute(SubLObject first, SubLObject second)

		{
			StandardGenericFunctionTrampolines
					.checkStandardGenericFunction(first).slots[StandardGenericFunctionClass.SLOT_INDEX_NAME] = second;
			return second;
		}
	};

	// ### %generic-function-lambda-list
	private static Primitive _GENERIC_FUNCTION_LAMBDA_LIST = new JavaPrimitive("%generic-function-lambda-list",
			Lisp.PACKAGE_SYS, true) {

		public SubLObject execute(SubLObject arg) {
			return StandardGenericFunctionTrampolines
					.checkStandardGenericFunction(arg).slots[StandardGenericFunctionClass.SLOT_INDEX_LAMBDA_LIST];
		}
	};

	// ### %set-generic-function-lambdaList
	private static Primitive _SET_GENERIC_FUNCTION_LAMBDA_LIST = new JavaPrimitive("%set-generic-function-lambda-list",
			Lisp.PACKAGE_SYS, true) {

		public SubLObject execute(SubLObject first, SubLObject second)

		{
			StandardGenericFunctionTrampolines.checkStandardGenericFunction(
					first).slots[StandardGenericFunctionClass.SLOT_INDEX_LAMBDA_LIST] = second;
			return second;
		}
	};

	// ### funcallable-instance-function funcallable-instance => function
	private static Primitive FUNCALLABLE_INSTANCE_FUNCTION = new JavaPrimitive("funcallable-instance-function",
			Lisp.PACKAGE_MOP, false, "funcallable-instance") {

		public SubLObject execute(SubLObject arg)

		{
			return StandardGenericFunctionTrampolines.checkStandardGenericFunction(arg).function;
		}
	};

	// ### set-funcallable-instance-function funcallable-instance function =>
	// unspecified
	// AMOP p. 230
	private static Primitive SET_FUNCALLABLE_INSTANCE_FUNCTION = new JavaPrimitive("set-funcallable-instance-function",
			Lisp.PACKAGE_MOP, true, "funcallable-instance function") {

		public SubLObject execute(SubLObject first, SubLObject second)

		{
			StandardGenericFunctionTrampolines.checkStandardGenericFunction(first).function = second;
			return second;
		}
	};

	// ### gf-required-args
	private static Primitive GF_REQUIRED_ARGS = new JavaPrimitive("gf-required-args", Lisp.PACKAGE_SYS, true) {

		public SubLObject execute(SubLObject arg) {
			return StandardGenericFunctionTrampolines
					.checkStandardGenericFunction(arg).slots[StandardGenericFunctionClass.SLOT_INDEX_REQUIRED_ARGS];
		}
	};

	// ### %set-gf-required-args
	private static Primitive _SET_GF_REQUIRED_ARGS = new JavaPrimitive("%set-gf-required-args", Lisp.PACKAGE_SYS,
			true) {

		public SubLObject execute(SubLObject first, SubLObject second)

		{
			final StandardGenericFunction gf = StandardGenericFunctionTrampolines.checkStandardGenericFunction(first);
			gf.slots[StandardGenericFunctionClass.SLOT_INDEX_REQUIRED_ARGS] = second;
			gf.numberOfRequiredArgs = second.cl_length();
			return second;
		}
	};

	// ### generic-function-initial-methods
	private static Primitive GENERIC_FUNCTION_INITIAL_METHODS = new JavaPrimitive("generic-function-initial-methods",
			Lisp.PACKAGE_SYS, true) {

		public SubLObject execute(SubLObject arg) {
			return StandardGenericFunctionTrampolines
					.checkStandardGenericFunction(arg).slots[StandardGenericFunctionClass.SLOT_INDEX_INITIAL_METHODS];
		}
	};

	// ### set-generic-function-initial-methods
	private static Primitive SET_GENERIC_FUNCTION_INITIAL_METHODS = new JavaPrimitive(
			"set-generic-function-initial-methods", Lisp.PACKAGE_SYS, true) {

		public SubLObject execute(SubLObject first, SubLObject second)

		{
			StandardGenericFunctionTrampolines.checkStandardGenericFunction(
					first).slots[StandardGenericFunctionClass.SLOT_INDEX_INITIAL_METHODS] = second;
			return second;
		}
	};

	// ### generic-function-methods
	private static Primitive GENERIC_FUNCTION_METHODS = new JavaPrimitive("generic-function-methods", Lisp.PACKAGE_SYS,
			true) {

		public SubLObject execute(SubLObject arg) {
			return StandardGenericFunctionTrampolines
					.checkStandardGenericFunction(arg).slots[StandardGenericFunctionClass.SLOT_INDEX_METHODS];
		}
	};

	// ### set-generic-function-methods
	private static Primitive SET_GENERIC_FUNCTION_METHODS = new JavaPrimitive("set-generic-function-methods",
			Lisp.PACKAGE_SYS, true) {

		public SubLObject execute(SubLObject first, SubLObject second)

		{
			StandardGenericFunctionTrampolines.checkStandardGenericFunction(
					first).slots[StandardGenericFunctionClass.SLOT_INDEX_METHODS] = second;
			return second;
		}
	};

	// ### generic-function-method-class
	private static Primitive GENERIC_FUNCTION_METHOD_CLASS = new JavaPrimitive("generic-function-method-class",
			Lisp.PACKAGE_SYS, true) {

		public SubLObject execute(SubLObject arg) {
			return StandardGenericFunctionTrampolines
					.checkStandardGenericFunction(arg).slots[StandardGenericFunctionClass.SLOT_INDEX_METHOD_CLASS];
		}
	};

	// ### set-generic-function-method-class
	private static Primitive SET_GENERIC_FUNCTION_METHOD_CLASS = new JavaPrimitive("set-generic-function-method-class",
			Lisp.PACKAGE_SYS, true) {

		public SubLObject execute(SubLObject first, SubLObject second)

		{
			StandardGenericFunctionTrampolines.checkStandardGenericFunction(
					first).slots[StandardGenericFunctionClass.SLOT_INDEX_METHOD_CLASS] = second;
			return second;
		}
	};

	// ### generic-function-method-combination
	private static Primitive GENERIC_FUNCTION_METHOD_COMBINATION = new JavaPrimitive(
			"generic-function-method-combination", Lisp.PACKAGE_SYS, true) {

		public SubLObject execute(SubLObject arg) {
			return StandardGenericFunctionTrampolines.checkStandardGenericFunction(
					arg).slots[StandardGenericFunctionClass.SLOT_INDEX_METHOD_COMBINATION];
		}
	};

	// ### set-generic-function-method-combination
	private static Primitive SET_GENERIC_FUNCTION_METHOD_COMBINATION = new JavaPrimitive(
			"set-generic-function-method-combination", Lisp.PACKAGE_SYS, true) {

		public SubLObject execute(SubLObject first, SubLObject second)

		{
			StandardGenericFunctionTrampolines.checkStandardGenericFunction(
					first).slots[StandardGenericFunctionClass.SLOT_INDEX_METHOD_COMBINATION] = second;
			return second;
		}
	};

	// ### generic-function-argument-precedence-order
	private static Primitive GENERIC_FUNCTION_ARGUMENT_PRECEDENCE_ORDER = new JavaPrimitive(
			"generic-function-argument-precedence-order", Lisp.PACKAGE_SYS, true) {

		public SubLObject execute(SubLObject arg) {
			return StandardGenericFunctionTrampolines.checkStandardGenericFunction(
					arg).slots[StandardGenericFunctionClass.SLOT_INDEX_ARGUMENT_PRECEDENCE_ORDER];
		}
	};

	// ### set-generic-function-argument-precedence-order
	private static Primitive SET_GENERIC_FUNCTION_ARGUMENT_PRECEDENCE_ORDER = new JavaPrimitive(
			"set-generic-function-argument-precedence-order", Lisp.PACKAGE_SYS, true) {

		public SubLObject execute(SubLObject first, SubLObject second)

		{
			StandardGenericFunctionTrampolines.checkStandardGenericFunction(
					first).slots[StandardGenericFunctionClass.SLOT_INDEX_ARGUMENT_PRECEDENCE_ORDER] = second;
			return second;
		}
	};

	// ### generic-function-classes-to-emf-table
	private static Primitive GENERIC_FUNCTION_CLASSES_TO_EMF_TABLE = new JavaPrimitive(
			"generic-function-classes-to-emf-table", Lisp.PACKAGE_SYS, true) {

		public SubLObject execute(SubLObject arg) {
			return StandardGenericFunctionTrampolines.checkStandardGenericFunction(
					arg).slots[StandardGenericFunctionClass.SLOT_INDEX_CLASSES_TO_EMF_TABLE];
		}
	};

	// ### set-generic-function-classes-to-emf-table
	private static Primitive SET_GENERIC_FUNCTION_CLASSES_TO_EMF_TABLE = new JavaPrimitive(
			"set-generic-function-classes-to-emf-table", Lisp.PACKAGE_SYS, true) {

		public SubLObject execute(SubLObject first, SubLObject second)

		{
			StandardGenericFunctionTrampolines.checkStandardGenericFunction(
					first).slots[StandardGenericFunctionClass.SLOT_INDEX_CLASSES_TO_EMF_TABLE] = second;
			return second;
		}
	};

	// ### generic-function-documentation
	private static Primitive GENERIC_FUNCTION_DOCUMENTATION = new JavaPrimitive("generic-function-documentation",
			Lisp.PACKAGE_SYS, true) {

		public SubLObject execute(SubLObject arg) {
			return StandardGenericFunctionTrampolines
					.checkStandardGenericFunction(arg).slots[StandardGenericFunctionClass.SLOT_INDEX_DOCUMENTATION];
		}
	};

	// ### set-generic-function-documentation
	private static Primitive SET_GENERIC_FUNCTION_DOCUMENTATION = new JavaPrimitive(
			"set-generic-function-documentation", Lisp.PACKAGE_SYS, true) {

		public SubLObject execute(SubLObject first, SubLObject second)

		{
			StandardGenericFunctionTrampolines.checkStandardGenericFunction(
					first).slots[StandardGenericFunctionClass.SLOT_INDEX_DOCUMENTATION] = second;
			return second;
		}
	};

	// ### %finalize-generic-function
	private static Primitive _FINALIZE_GENERIC_FUNCTION = new JavaPrimitive("%finalize-generic-function",
			Lisp.PACKAGE_SYS, true, "generic-function") {

		public SubLObject execute(SubLObject arg) {
			final StandardGenericFunction gf = StandardGenericFunctionTrampolines.checkStandardGenericFunction(arg);
			gf.finalizeInternal();
			return Lisp.T;
		}
	};

	// ### cache-emf
	private static Primitive CACHE_EMF = new JavaPrimitive("cache-emf", Lisp.PACKAGE_SYS, true,
			"generic-function args emf") {

		public SubLObject execute(SubLObject first, SubLObject second, SubLObject third)

		{
			final StandardGenericFunction gf = StandardGenericFunctionTrampolines.checkStandardGenericFunction(first);
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
	private static Primitive GET_CACHED_EMF = new JavaPrimitive("get-cached-emf", Lisp.PACKAGE_SYS, true,
			"generic-function args") {

		public SubLObject execute(SubLObject first, SubLObject second)

		{
			final StandardGenericFunction gf = StandardGenericFunctionTrampolines.checkStandardGenericFunction(first);
			SubLObject args = second;
			SubLObject[] array = new SubLObject[gf.numberOfRequiredArgs];
			for (int i = gf.numberOfRequiredArgs; i-- > 0;) {
				array[i] = gf.getArgSpecialization(args.first());
				args = args.rest();
			}
			CacheEntry specializations = new CacheEntry(array);
			HashMap<CacheEntry, SubLObject> ht = gf.cache;
			if (ht == null)
				return Lisp.NIL;
			SubLObject emf = ht.get(specializations);
			return emf != null ? emf : Lisp.NIL;
		}
	};

	// ### %get-arg-specialization
	private static Primitive _GET_ARG_SPECIALIZATION = new JavaPrimitive("%get-arg-specialization", Lisp.PACKAGE_SYS,
			true, "generic-function arg") {

		public SubLObject execute(SubLObject first, SubLObject second)

		{
			final StandardGenericFunction gf = StandardGenericFunctionTrampolines.checkStandardGenericFunction(first);
			return gf.getArgSpecialization(second);
		}
	};

	// ### cache-slot-location
	private static Primitive CACHE_SLOT_LOCATION = new JavaPrimitive("cache-slot-location", Lisp.PACKAGE_SYS, true,
			"generic-function layout location") {

		public SubLObject execute(SubLObject first, SubLObject second, SubLObject third)

		{
			final StandardGenericFunction gf = StandardGenericFunctionTrampolines.checkStandardGenericFunction(first);
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
	private static Primitive GET_CACHED_SLOT_LOCATION = new JavaPrimitive("get-cached-slot-location", Lisp.PACKAGE_SYS,
			true, "generic-function layout") {

		public SubLObject execute(SubLObject first, SubLObject second)

		{
			final StandardGenericFunction gf = StandardGenericFunctionTrampolines.checkStandardGenericFunction(first);
			SubLObject layout = second;
			HashMap<SubLObject, SubLObject> ht = gf.slotCache;
			if (ht == null)
				return Lisp.NIL;
			SubLObject location = ht.get(layout);
			return location != null ? location : Lisp.NIL;
		}
	};

	private static StandardGenericFunction GENERIC_FUNCTION_NAME = new StandardGenericFunction("generic-function-name",
			Lisp.PACKAGE_MOP, true, StandardGenericFunctionTrampolines._GENERIC_FUNCTION_NAME,
			Lisp.list(LispSymbols.GENERIC_FUNCTION), Lisp.list(StandardClass.STANDARD_GENERIC_FUNCTION));

	// ### %init-eql-specializations
	private static Primitive _INIT_EQL_SPECIALIZATIONS = new JavaPrimitive("%init-eql-specializations",
			Lisp.PACKAGE_SYS, true, "generic-function eql-specilizer-objects-list") {

		public SubLObject execute(SubLObject first, SubLObject second)

		{
			final StandardGenericFunction gf = StandardGenericFunctionTrampolines.checkStandardGenericFunction(first);
			SubLObject eqlSpecializerObjects = second;
			gf.eqlSpecializations = new EqlSpecialization[eqlSpecializerObjects.cl_length()];
			for (int i = 0; i < gf.eqlSpecializations.length; i++) {
				gf.eqlSpecializations[i] = new EqlSpecialization(eqlSpecializerObjects.first());
				eqlSpecializerObjects = eqlSpecializerObjects.rest();
			}
			return Lisp.NIL;
		}
	};

	public static StandardGenericFunction checkStandardGenericFunction(SubLObject obj)

	{
		if (obj instanceof StandardGenericFunction)
			return (StandardGenericFunction) obj;
		return (StandardGenericFunction) // Not reached.
		Lisp.type_error(obj, LispSymbols.STANDARD_GENERIC_FUNCTION);
	}

}
