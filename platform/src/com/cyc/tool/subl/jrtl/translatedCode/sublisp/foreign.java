//
// For LarKC
//
package com.cyc.tool.subl.jrtl.translatedCode.sublisp;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Alien;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Filesys;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLNil;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public class foreign extends SubLTranslatedFile {
    @SubL(source = "sublisp/foreign.lisp", position = 3616L)
    public static SubLObject all_foreign_shared_libraries() {
	SubLThread thread = SubLProcess.currentSubLThread();
	return conses_high.copy_list(foreign.$foreign_shared_libraries$.getDynamicValue(thread));
    }

    @SubL(source = "sublisp/foreign.lisp", position = 10911L)
    public static SubLObject analyze_define_foreign_function_arguments(SubLObject symbol, SubLObject arglist, SubLObject rules) {
	SubLThread thread = SubLProcess.currentSubLThread();
	SubLObject allow_other_keys_p = SubLNil.NIL;
	SubLObject rest = rules;
	SubLObject bad = SubLNil.NIL;
	SubLObject current_$1 = SubLNil.NIL;
	while (SubLNil.NIL != rest) {
	    cdestructuring_bind.destructuring_bind_must_consp(rest, rules, foreign.$list17);
	    current_$1 = rest.first();
	    rest = rest.rest();
	    cdestructuring_bind.destructuring_bind_must_consp(rest, rules, foreign.$list17);
	    if (SubLNil.NIL == conses_high.member(current_$1, foreign.$list18, UNPROVIDED, UNPROVIDED))
		bad = T;
	    if (current_$1 == foreign.$kw19$ALLOW_OTHER_KEYS)
		allow_other_keys_p = rest.first();
	    rest = rest.rest();
	}
	if (SubLNil.NIL != bad && SubLNil.NIL == allow_other_keys_p)
	    cdestructuring_bind.cdestructuring_bind_error(rules, foreign.$list17);
	SubLObject calling_convention_tail = cdestructuring_bind.property_list_member(foreign.$kw20$CALLING_CONVENTION, rules);
	SubLObject calling_convention = SubLNil.NIL != calling_convention_tail ? conses_high.cadr(calling_convention_tail) : foreign.$kw21$C;
	SubLObject foreign_shared_library_tail = cdestructuring_bind.property_list_member(foreign.$kw22$FOREIGN_SHARED_LIBRARY, rules);
	SubLObject foreign_shared_library = SubLNil.NIL != foreign_shared_library_tail ? conses_high.cadr(foreign_shared_library_tail) : SubLNil.NIL;
	SubLObject foreign_name_tail = cdestructuring_bind.property_list_member(foreign.$kw23$FOREIGN_NAME, rules);
	SubLObject foreign_name = SubLNil.NIL != foreign_name_tail ? conses_high.cadr(foreign_name_tail) : SubLNil.NIL;
	SubLObject arg_conversion_tail = cdestructuring_bind.property_list_member(foreign.$kw24$ARG_CONVERSION, rules);
	SubLObject arg_conversion = SubLNil.NIL != arg_conversion_tail ? conses_high.cadr(arg_conversion_tail) : SubLNil.NIL;
	SubLObject return_type_tail = cdestructuring_bind.property_list_member(foreign.$kw25$RETURN_TYPE, rules);
	SubLObject return_type = SubLNil.NIL != return_type_tail ? conses_high.cadr(return_type_tail) : foreign.$kw26$VOID;
	if (SubLNil.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && calling_convention != foreign.$kw21$C)
	    Errors.error(foreign.$str27$Currently__only_calling_conventio);
	if (SubLNil.NIL == foreign_name)
	    foreign_name = generate_foreign_name_from_sublisp_symbol(calling_convention, symbol);
	if (SubLNil.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && !foreign_name.isString())
	    Errors.error(foreign.$str28$_FOREIGN_NAME_expects_STRING__not, foreign_name);
	if (SubLNil.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && !Sequences.length(arglist).numE(Sequences.length(arg_conversion)))
	    Errors.error(foreign.$str29$The_argument_list__S_and_the__ARG, arglist, arg_conversion);
	if (SubLNil.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && SubLNil.NIL == valid_arg_conversion_pattern(arg_conversion))
	    Errors.error(foreign.$str30$_S_is_not_a_valid__ARG_CONVERSION, arg_conversion);
	if (SubLNil.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && !return_type.isKeyword() && !return_type.isList())
	    Errors.error(foreign.$str31$_S_is_not_a_valid__RETURN_TYPE_ar, return_type);
	return Values.values(calling_convention, foreign_shared_library, foreign_name, arg_conversion, return_type);
    }

    public static SubLObject declare_foreign_file() {
	SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.foreign", "declare_foreign_shared_library", "DECLARE-FOREIGN-SHARED-LIBRARY", 2, 0, false);
	SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.foreign", "find_foreign_shared_library_by_pathname", "FIND-FOREIGN-SHARED-LIBRARY-BY-PATHNAME", 1, 0, false);
	SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.foreign", "get_foreign_shared_library_pathname", "GET-FOREIGN-SHARED-LIBRARY-PATHNAME", 1, 0, false);
	SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.foreign", "get_foreign_shared_library_dependencies", "GET-FOREIGN-SHARED-LIBRARY-DEPENDENCIES", 1, 0, false);
	SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.foreign", "get_foreign_shared_library_property", "GET-FOREIGN-SHARED-LIBRARY-PROPERTY", 2, 1, false);
	SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.foreign", "foreign_shared_library_p", "FOREIGN-SHARED-LIBRARY-P", 1, 0, false);
	SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.foreign", "undeclare_foreign_shared_library", "UNDECLARE-FOREIGN-SHARED-LIBRARY", 1, 0, false);
	SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.foreign", "all_foreign_shared_libraries", "ALL-FOREIGN-SHARED-LIBRARIES", 0, 0, false);
	SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.foreign", "foreign_shared_library_loadableP", "FOREIGN-SHARED-LIBRARY-LOADABLE?", 1, 0, false);
	SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.foreign", "find_foreign_shared_library_by_property", "FIND-FOREIGN-SHARED-LIBRARY-BY-PROPERTY", 2, 1, false);
	SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.foreign", "find_foreign_shared_library_int", "FIND-FOREIGN-SHARED-LIBRARY-INT", 1, 0, false);
	SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.foreign", "edit_foreign_shared_library", "EDIT-FOREIGN-SHARED-LIBRARY", 2, 0, false);
	SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.foreign", "foreign_shared_library_accessibleP", "FOREIGN-SHARED-LIBRARY-ACCESSIBLE?", 1, 0, false);
	SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.foreign", "load_foreign_shared_library", "LOAD-FOREIGN-SHARED-LIBRARY", 1, 1, false);
	SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.foreign", "ensure_foreign_shared_library_loaded", "ENSURE-FOREIGN-SHARED-LIBRARY-LOADED", 1, 1, false);
	SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.foreign", "foreign_shared_library_loadedP", "FOREIGN-SHARED-LIBRARY-LOADED?", 1, 0, false);
	SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.foreign", "unload_foreign_shared_library", "UNLOAD-FOREIGN-SHARED-LIBRARY", 1, 0, false);
	SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.foreign", "foreign_shared_library_installedP", "FOREIGN-SHARED-LIBRARY-INSTALLED?", 1, 0, false);
	SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.foreign", "load_shared_library_int", "LOAD-SHARED-LIBRARY-INT", 3, 0, false);
	SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.foreign", "unload_shared_library_int", "UNLOAD-SHARED-LIBRARY-INT", 2, 0, false);
	SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.foreign", "foreign_shared_library_loaded_intP", "FOREIGN-SHARED-LIBRARY-LOADED-INT?", 1, 0, false);
	SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.foreign", "return_type_string_p", "RETURN-TYPE-STRING-P", 1, 0, false);
	SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.foreign", "return_type_pointer_p", "RETURN-TYPE-POINTER-P", 1, 0, false);
	SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.foreign", "default_return_value", "DEFAULT-RETURN-VALUE", 1, 0, false);
	SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.foreign", "make_helper_function_symbol", "MAKE-HELPER-FUNCTION-SYMBOL", 2, 0, false);
	SubLFiles.declareMacro("com.cyc.tool.subl.jrtl.translatedCode.sublisp.foreign", "define_foreign_function", "DEFINE-FOREIGN-FUNCTION");
	SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.foreign", "analyze_define_foreign_function_arguments", "ANALYZE-DEFINE-FOREIGN-FUNCTION-ARGUMENTS", 3, 0, false);
	SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.foreign", "generate_foreign_name_from_sublisp_symbol", "GENERATE-FOREIGN-NAME-FROM-SUBLISP-SYMBOL", 2, 0, false);
	SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.foreign", "valid_arg_conversion_pattern", "VALID-ARG-CONVERSION-PATTERN", 1, 0, false);
	SubLFiles.declareMacro("com.cyc.tool.subl.jrtl.translatedCode.sublisp.foreign", "ffuncall", "FFUNCALL");
	SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.foreign", "make_dummy_arg_list", "MAKE-DUMMY-ARG-LIST", 1, 0, false);
	SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.foreign", "define_foreign_function_internal", "DEFINE-FOREIGN-FUNCTION-INTERNAL", 7, 0, false);
	SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.foreign", "vector_for_marshalling", "VECTOR-FOR-MARSHALLING", 3, 0, false);
	return SubLNil.NIL;
    }

    @SubL(source = "sublisp/foreign.lisp", position = 1223L)
    public static SubLObject declare_foreign_shared_library(SubLObject moniker, SubLObject properties) {
	SubLThread thread = SubLProcess.currentSubLThread();
	SubLObject pathname = conses_high.getf(properties, foreign.$kw4$FILENAME, SubLNil.NIL);
	SubLObject result = SubLNil.NIL;
	if (SubLNil.NIL == pathname)
	    Errors.error(foreign.$str5$Foreign_shared_library_must_have_);
	SubLObject release = SubLNil.NIL;
	try {
	    release = Locks.seize_lock(foreign.$foreign_shared_library_lock$.getGlobalValue());
	    if (SubLNil.NIL != foreign_shared_library_p(moniker))
		edit_foreign_shared_library(moniker, properties);
	    else {
		foreign.$foreign_shared_libraries$.setDynamicValue(conses_high.acons(moniker, properties, foreign.$foreign_shared_libraries$.getDynamicValue(thread)), thread);
		result = foreign.$foreign_shared_libraries$.getDynamicValue(thread);
	    }
	} finally {
	    if (SubLNil.NIL != release)
		Locks.release_lock(foreign.$foreign_shared_library_lock$.getGlobalValue());
	}
	return result;
    }

    @SubL(source = "sublisp/foreign.lisp", position = 9300L)
    public static SubLObject default_return_value(SubLObject return_type) {
	if (SubLNil.NIL == return_type_pointer_p(return_type))
	    return SubLNil.NIL;
	if (Sequences.length(return_type).numL(THREE_INTEGER))
	    return SubLNil.NIL;
	return conses_high.third(return_type);
    }

    @SubL(source = "sublisp/foreign.lisp", position = 9669L)
    public static SubLObject define_foreign_function(SubLObject macroform, SubLObject environment) {
	SubLThread thread = SubLProcess.currentSubLThread();
	SubLObject current;
	SubLObject datum = current = macroform.rest();
	SubLObject symbol = SubLNil.NIL;
	SubLObject arglist = SubLNil.NIL;
	SubLObject rules = SubLNil.NIL;
	cdestructuring_bind.destructuring_bind_must_consp(current, datum, foreign.$list14);
	symbol = current.first();
	current = current.rest();
	cdestructuring_bind.destructuring_bind_must_consp(current, datum, foreign.$list14);
	arglist = current.first();
	current = current.rest();
	cdestructuring_bind.destructuring_bind_must_consp(current, datum, foreign.$list14);
	rules = current.first();
	current = current.rest();
	if (SubLNil.NIL != current) {
	    cdestructuring_bind.cdestructuring_bind_error(datum, foreign.$list14);
	    return SubLNil.NIL;
	}
	assert SubLNil.NIL != Types.symbolp(symbol) : symbol;
	assert SubLNil.NIL != Types.listp(arglist) : arglist;
	assert SubLNil.NIL != Types.listp(rules) : rules;
	thread.resetMultipleValues();
	SubLObject calling_convention = analyze_define_foreign_function_arguments(symbol, arglist, rules);
	SubLObject foreign_shared_library = thread.secondMultipleValue();
	SubLObject foreign_name = thread.thirdMultipleValue();
	SubLObject arg_conversion = thread.fourthMultipleValue();
	SubLObject return_type = thread.fifthMultipleValue();
	thread.resetMultipleValues();
	return define_foreign_function_internal(symbol, arglist, calling_convention, foreign_shared_library, foreign_name, arg_conversion, return_type);
    }

    @SubL(source = "sublisp/foreign.lisp", position = 14259L)
    public static SubLObject define_foreign_function_internal(SubLObject symbol, SubLObject arglist, SubLObject calling_convention, SubLObject foreign_shared_library, SubLObject foreign_name, SubLObject arg_conversion, SubLObject return_type) {
	SubLObject ret_type = return_type.isList() ? return_type.first() : SubLNil.NIL;
	SubLObject symbol_ff = make_helper_function_symbol(symbol, return_type);
	SubLObject default_return_value = default_return_value(return_type);
	SubLObject main_function = ConsesLow.list(foreign.$sym35$DEF_FOREIGN_FUNCTION, foreign_shared_library, foreign_name, ConsesLow.list(foreign.$sym36$QUOTE, symbol_ff), ConsesLow.list(foreign.$sym36$QUOTE, arg_conversion), ConsesLow.list(foreign.$sym36$QUOTE, ret_type), calling_convention,
		default_return_value);
	if (!symbol.equal(symbol_ff)) {
	    SubLObject dummy_arglist = make_dummy_arg_list(arglist);
	    SubLObject retit = ConsesLow.list(foreign.$sym37$PROGN, main_function,
		    ConsesLow.list(foreign.$sym38$DEFINE, symbol, dummy_arglist,
			    ConsesLow.list(foreign.$sym39$CLET, ConsesLow.list(ConsesLow.list(foreign.$sym40$_VAL, ConsesLow.listS(foreign.$sym41$FFUNCALL, ConsesLow.list(foreign.$sym36$QUOTE, symbol_ff), ConsesLow.append(dummy_arglist, SubLNil.NIL)))),
				    ConsesLow.listS(foreign.$sym42$PIF, foreign.$list43, ConsesLow.list(foreign.$sym44$RET, default_return_value), foreign.$list45))));
	    return retit;
	}
	return main_function;
    }

    @SubL(source = "sublisp/foreign.lisp", position = 4406L)
    public static SubLObject edit_foreign_shared_library(SubLObject moniker, SubLObject properties) {
	SubLObject tuple = find_foreign_shared_library_int(moniker);
	if (SubLNil.NIL != tuple)
	    ConsesLow.rplacd(tuple, properties);
	return moniker;
    }

    @SubL(source = "sublisp/foreign.lisp", position = 5971L)
    public static SubLObject ensure_foreign_shared_library_loaded(SubLObject moniker, SubLObject options) {
	if (options == UNPROVIDED)
	    options = SubLNil.NIL;
	if (SubLNil.NIL == foreign_shared_library_loaded_intP(moniker)) {
	    SubLObject release = SubLNil.NIL;
	    try {
		release = Locks.seize_lock(foreign.$active_foreign_shared_library_lock$.getGlobalValue());
		if (SubLNil.NIL == foreign_shared_library_loadedP(moniker)) {
		    SubLObject cdolist_list_var;
		    SubLObject dependencies = cdolist_list_var = get_foreign_shared_library_dependencies(moniker);
		    SubLObject dependency = SubLNil.NIL;
		    dependency = cdolist_list_var.first();
		    while (SubLNil.NIL != cdolist_list_var) {
			ensure_foreign_shared_library_loaded(dependency, UNPROVIDED);
			cdolist_list_var = cdolist_list_var.rest();
			dependency = cdolist_list_var.first();
		    }
		    load_foreign_shared_library(moniker, options);
		}
	    } finally {
		if (SubLNil.NIL != release)
		    Locks.release_lock(foreign.$active_foreign_shared_library_lock$.getGlobalValue());
	    }
	}
	return moniker;
    }

    @SubL(source = "sublisp/foreign.lisp", position = 14016L)
    public static SubLObject ffuncall(SubLObject macroform, SubLObject environment) {
	SubLObject current;
	SubLObject datum = current = macroform.rest();
	SubLObject symbol = SubLNil.NIL;
	cdestructuring_bind.destructuring_bind_must_consp(current, datum, foreign.$list33);
	symbol = current.first();
	SubLObject args;
	current = args = current.rest();
	return ConsesLow.listS(foreign.$sym34$FUNCALL, symbol, ConsesLow.append(args, SubLNil.NIL));
    }

    @SubL(source = "sublisp/foreign.lisp", position = 1810L)
    public static SubLObject find_foreign_shared_library_by_pathname(SubLObject pathname) {
	SubLObject tuple = SubLNil.NIL;
	SubLObject release = SubLNil.NIL;
	try {
	    release = Locks.seize_lock(foreign.$foreign_shared_library_lock$.getGlobalValue());
	    tuple = find_foreign_shared_library_by_property(foreign.$kw4$FILENAME, pathname, EQUAL);
	} finally {
	    if (SubLNil.NIL != release)
		Locks.release_lock(foreign.$foreign_shared_library_lock$.getGlobalValue());
	}
	return tuple;
    }

    @SubL(source = "sublisp/foreign.lisp", position = 3916L)
    public static SubLObject find_foreign_shared_library_by_property(SubLObject property, SubLObject value, SubLObject test) {
	if (test == UNPROVIDED)
	    test = Symbols.symbol_function(EQL);
	SubLThread thread = SubLProcess.currentSubLThread();
	SubLObject found = SubLNil.NIL;
	if (SubLNil.NIL == found) {
	    SubLObject csome_list_var = foreign.$foreign_shared_libraries$.getDynamicValue(thread);
	    SubLObject libinfo = SubLNil.NIL;
	    libinfo = csome_list_var.first();
	    while (SubLNil.NIL == found && SubLNil.NIL != csome_list_var) {
		SubLObject moniker = libinfo.first();
		SubLObject properties = libinfo.rest();
		if (SubLNil.NIL != Functions.funcall(test, value, conses_high.getf(properties, property, UNPROVIDED)))
		    found = moniker;
		csome_list_var = csome_list_var.rest();
		libinfo = csome_list_var.first();
	    }
	}
	return found;
    }

    @SubL(source = "sublisp/foreign.lisp", position = 4302L)
    public static SubLObject find_foreign_shared_library_int(SubLObject moniker) {
	SubLThread thread = SubLProcess.currentSubLThread();
	return conses_high.assoc(moniker, foreign.$foreign_shared_libraries$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED);
    }

    @SubL(source = "sublisp/foreign.lisp", position = 4988L)
    public static SubLObject foreign_shared_library_accessibleP(SubLObject moniker) {
	return Filesys.probe_file(get_foreign_shared_library_pathname(moniker));
    }

    @SubL(source = "sublisp/foreign.lisp", position = 7660L)
    public static SubLObject foreign_shared_library_installedP(SubLObject moniker) {
	return SubLObjectFactory.makeBoolean(SubLNil.NIL != foreign_shared_library_loadedP(moniker) || SubLNil.NIL != foreign_shared_library_loadableP(moniker));
    }

    @SubL(source = "sublisp/foreign.lisp", position = 3706L)
    public static SubLObject foreign_shared_library_loadableP(SubLObject moniker) {
	SubLObject pathname = get_foreign_shared_library_pathname(moniker);
	if (SubLNil.NIL != pathname)
	    return SubLNil.NIL != Filesys.probe_file(pathname) ? T : SubLNil.NIL;
	return SubLNil.NIL;
    }

    @SubL(source = "sublisp/foreign.lisp", position = 8565L)
    public static SubLObject foreign_shared_library_loaded_intP(SubLObject moniker) {
	SubLThread thread = SubLProcess.currentSubLThread();
	return SubLObjectFactory.makeBoolean(SubLNil.NIL != conses_high.member(moniker, foreign.$active_foreign_shared_libraries$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED));
    }

    @SubL(source = "sublisp/foreign.lisp", position = 6608L)
    public static SubLObject foreign_shared_library_loadedP(SubLObject moniker) {
	SubLObject result = SubLNil.NIL;
	SubLObject release = SubLNil.NIL;
	try {
	    release = Locks.seize_lock(foreign.$active_foreign_shared_library_lock$.getGlobalValue());
	    result = foreign_shared_library_loaded_intP(moniker);
	} finally {
	    if (SubLNil.NIL != release)
		Locks.release_lock(foreign.$active_foreign_shared_library_lock$.getGlobalValue());
	}
	return result;
    }

    @SubL(source = "sublisp/foreign.lisp", position = 2866L)
    public static SubLObject foreign_shared_library_p(SubLObject moniker) {
	return SubLObjectFactory.makeBoolean(SubLNil.NIL != get_foreign_shared_library_pathname(moniker));
    }

    @SubL(source = "sublisp/foreign.lisp", position = 13607L)
    public static SubLObject generate_foreign_name_from_sublisp_symbol(SubLObject calling_convention, SubLObject symbol) {
	if (calling_convention.eql(foreign.$kw21$C))
	    return Strings.string_downcase(Symbols.symbol_name(symbol), UNPROVIDED, UNPROVIDED);
	Errors.error(foreign.$str32$Do_not_know_how_to_generate_a_for, symbol, calling_convention);
	return SubLNil.NIL;
    }

    @SubL(source = "sublisp/foreign.lisp", position = 2323L)
    public static SubLObject get_foreign_shared_library_dependencies(SubLObject moniker) {
	return get_foreign_shared_library_property(moniker, foreign.$kw6$DEPENDS_ON, SubLNil.NIL);
    }

    @SubL(source = "sublisp/foreign.lisp", position = 2136L)
    public static SubLObject get_foreign_shared_library_pathname(SubLObject moniker) {
	return get_foreign_shared_library_property(moniker, foreign.$kw4$FILENAME, SubLNil.NIL);
    }

    @SubL(source = "sublisp/foreign.lisp", position = 2513L)
    public static SubLObject get_foreign_shared_library_property(SubLObject moniker, SubLObject property, SubLObject v_default) {
	if (v_default == UNPROVIDED)
	    v_default = SubLNil.NIL;
	SubLObject tuple = SubLNil.NIL;
	SubLObject release = SubLNil.NIL;
	try {
	    release = Locks.seize_lock(foreign.$foreign_shared_library_lock$.getGlobalValue());
	    tuple = find_foreign_shared_library_int(moniker);
	} finally {
	    if (SubLNil.NIL != release)
		Locks.release_lock(foreign.$foreign_shared_library_lock$.getGlobalValue());
	}
	SubLObject properties = tuple.rest();
	return conses_high.getf(properties, property, v_default);
    }

    public static SubLObject init_foreign_file() {
	foreign.$foreign_shared_library_lock$ = SubLFiles.deflexical("*FOREIGN-SHARED-LIBRARY-LOCK*", Locks.make_lock(foreign.$str0$Foreign_Shared_Libraries_Lock));
	foreign.$char_pointer_idiom_declaration$ = SubLFiles.deflexical("*CHAR-POINTER-IDIOM-DECLARATION*", foreign.$list1);
	foreign.$pointer_idiom_declaration$ = SubLFiles.deflexical("*POINTER-IDIOM-DECLARATION*", foreign.$list2);
	foreign.$char_pointer_idiom_allegro$ = SubLFiles.deflexical("*CHAR-POINTER-IDIOM-ALLEGRO*", foreign.$list3);
	foreign.$foreign_shared_libraries$ = SubLFiles.defvar("*FOREIGN-SHARED-LIBRARIES*", SubLNil.NIL);
	foreign.$active_foreign_shared_library_lock$ = SubLFiles.deflexical("*ACTIVE-FOREIGN-SHARED-LIBRARY-LOCK*", Locks.make_lock(foreign.$str8$Active_Foreign_Shared_Libraries));
	foreign.$active_foreign_shared_libraries$ = SubLFiles.defvar("*ACTIVE-FOREIGN-SHARED-LIBRARIES*", SubLNil.NIL);
	return SubLNil.NIL;
    }

    @SubL(source = "sublisp/foreign.lisp", position = 5210L)
    public static SubLObject load_foreign_shared_library(SubLObject moniker, SubLObject options) {
	if (options == UNPROVIDED)
	    options = SubLNil.NIL;
	SubLThread thread = SubLProcess.currentSubLThread();
	SubLObject pathname = get_foreign_shared_library_pathname(moniker);
	if (SubLNil.NIL == pathname)
	    Errors.error(foreign.$str9$_S_is_not_associated_with_any_for, moniker);
	SubLObject release = SubLNil.NIL;
	try {
	    release = Locks.seize_lock(foreign.$active_foreign_shared_library_lock$.getGlobalValue());
	    if (SubLNil.NIL != foreign_shared_library_loadedP(moniker))
		Errors.warn(foreign.$str10$Shared_library__S___S__is_already, moniker, pathname);
	    else {
		load_shared_library_int(moniker, pathname, options);
		foreign.$active_foreign_shared_libraries$.setDynamicValue(ConsesLow.cons(moniker, foreign.$active_foreign_shared_libraries$.getDynamicValue(thread)), thread);
	    }
	} finally {
	    if (SubLNil.NIL != release)
		Locks.release_lock(foreign.$active_foreign_shared_library_lock$.getGlobalValue());
	}
	return moniker;
    }

    @SubL(source = "sublisp/foreign.lisp", position = 7825L)
    public static SubLObject load_shared_library_int(SubLObject moniker, SubLObject pathname, SubLObject options) {
	return Alien.load_shared_object(moniker, pathname, options);
    }

    @SubL(source = "sublisp/foreign.lisp", position = 14129L)
    public static SubLObject make_dummy_arg_list(SubLObject arglist) {
	return arglist;
    }

    @SubL(source = "sublisp/foreign.lisp", position = 9479L)
    public static SubLObject make_helper_function_symbol(SubLObject symbol, SubLObject return_type) {
	if (SubLNil.NIL != return_type_pointer_p(return_type))
	    return Symbols.make_symbol(Sequences.cconcatenate(Symbols.symbol_name(symbol), foreign.$str13$_));
	return symbol;
    }

    @SubL(source = "sublisp/foreign.lisp", position = 8977L)
    public static SubLObject return_type_pointer_p(SubLObject return_type) {
	if (SubLNil.NIL != return_type_string_p(return_type))
	    return T;
	if (!return_type.isList() || !Sequences.length(return_type).numG(ONE_INTEGER))
	    return SubLNil.NIL;
	return SubLObjectFactory.makeBoolean(foreign.$pointer_idiom_declaration$.getGlobalValue().first().equal(return_type.first()) && conses_high.second(foreign.$pointer_idiom_declaration$.getGlobalValue()).equal(conses_high.second(return_type)));
    }

    @SubL(source = "sublisp/foreign.lisp", position = 8696L)
    public static SubLObject return_type_string_p(SubLObject return_type) {
	if (!return_type.isList() || !Sequences.length(return_type).numG(ONE_INTEGER))
	    return SubLNil.NIL;
	return SubLObjectFactory.makeBoolean(foreign.$char_pointer_idiom_declaration$.getGlobalValue().first().equal(return_type.first()) && conses_high.second(foreign.$char_pointer_idiom_declaration$.getGlobalValue()).equal(conses_high.second(return_type)));
    }

    public static SubLObject setup_foreign_file() {
	return SubLNil.NIL;
    }

    @SubL(source = "sublisp/foreign.lisp", position = 3038L)
    public static SubLObject undeclare_foreign_shared_library(SubLObject moniker) {
	SubLThread thread = SubLProcess.currentSubLThread();
	SubLObject okP = SubLNil.NIL;
	SubLObject release = SubLNil.NIL;
	try {
	    release = Locks.seize_lock(foreign.$foreign_shared_library_lock$.getGlobalValue());
	    if (SubLNil.NIL != foreign_shared_library_p(moniker)) {
		SubLObject tuple = find_foreign_shared_library_int(moniker);
		foreign.$foreign_shared_libraries$.setDynamicValue(Sequences.delete(tuple, foreign.$foreign_shared_libraries$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), thread);
		okP = T;
	    }
	} finally {
	    if (SubLNil.NIL != release)
		Locks.release_lock(foreign.$foreign_shared_library_lock$.getGlobalValue());
	}
	if (SubLNil.NIL == okP)
	    Errors.error(foreign.$str7$_A_does_not_reference_a_known_for, moniker);
	return okP;
    }

    @SubL(source = "sublisp/foreign.lisp", position = 6879L)
    public static SubLObject unload_foreign_shared_library(SubLObject moniker) {
	SubLThread thread = SubLProcess.currentSubLThread();
	SubLObject success = SubLNil.NIL;
	SubLObject release = SubLNil.NIL;
	try {
	    release = Locks.seize_lock(foreign.$active_foreign_shared_library_lock$.getGlobalValue());
	    if (SubLNil.NIL != foreign_shared_library_loadedP(moniker)) {
		SubLObject pathname = get_foreign_shared_library_pathname(moniker);
		unload_shared_library_int(moniker, pathname);
		foreign.$active_foreign_shared_libraries$.setDynamicValue(Sequences.delete(moniker, foreign.$active_foreign_shared_libraries$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), thread);
		success = T;
	    }
	} finally {
	    if (SubLNil.NIL != release)
		Locks.release_lock(foreign.$active_foreign_shared_library_lock$.getGlobalValue());
	}
	if (SubLNil.NIL == success)
	    if (SubLNil.NIL != foreign_shared_library_p(moniker))
		Errors.error(foreign.$str11$_S_does_not_designate_one_of_the_, moniker, all_foreign_shared_libraries());
	    else
		Errors.error(foreign.$str12$_S_does_not_designate_a_known_sha, moniker);
	return success;
    }

    @SubL(source = "sublisp/foreign.lisp", position = 8180L)
    public static SubLObject unload_shared_library_int(SubLObject moniker, SubLObject pathname) {
	return Alien.unload_shared_object(moniker);
    }

    @SubL(source = "sublisp/foreign.lisp", position = 13918L)
    public static SubLObject valid_arg_conversion_pattern(SubLObject arg_conversion) {
	return Types.listp(arg_conversion);
    }

    @SubL(source = "sublisp/foreign.lisp", position = 15537L)
    public static SubLObject vector_for_marshalling(SubLObject size, SubLObject type, SubLObject initial_value) {
	return Vectors.make_vector(size, initial_value);
    }

    public static SubLFile me;
    public static String myName = "com.cyc.tool.subl.jrtl.translatedCode.sublisp.foreign";
    @SubL(source = "sublisp/foreign.lisp", position = 783L)
    public static SubLSymbol $foreign_shared_library_lock$;
    @SubL(source = "sublisp/foreign.lisp", position = 918L)
    public static SubLSymbol $char_pointer_idiom_declaration$;
    @SubL(source = "sublisp/foreign.lisp", position = 993L)
    public static SubLSymbol $pointer_idiom_declaration$;
    @SubL(source = "sublisp/foreign.lisp", position = 1052L)
    public static SubLSymbol $char_pointer_idiom_allegro$;
    @SubL(source = "sublisp/foreign.lisp", position = 1112L)
    public static SubLSymbol $foreign_shared_libraries$;
    @SubL(source = "sublisp/foreign.lisp", position = 4601L)
    public static SubLSymbol $active_foreign_shared_library_lock$;
    @SubL(source = "sublisp/foreign.lisp", position = 4779L)
    public static SubLSymbol $active_foreign_shared_libraries$;
    private static SubLString $str0$Foreign_Shared_Libraries_Lock;
    private static SubLList $list1;
    private static SubLList $list2;
    private static SubLList $list3;
    private static SubLSymbol $kw4$FILENAME;
    private static SubLString $str5$Foreign_shared_library_must_have_;
    private static SubLSymbol $kw6$DEPENDS_ON;
    private static SubLString $str7$_A_does_not_reference_a_known_for;
    private static SubLString $str8$Active_Foreign_Shared_Libraries;
    private static SubLString $str9$_S_is_not_associated_with_any_for;
    private static SubLString $str10$Shared_library__S___S__is_already;
    private static SubLString $str11$_S_does_not_designate_one_of_the_;
    private static SubLString $str12$_S_does_not_designate_a_known_sha;
    private static SubLString $str13$_;
    private static SubLList $list14;
    private static SubLSymbol $sym15$SYMBOLP;
    private static SubLSymbol $sym16$LISTP;
    private static SubLList $list17;
    private static SubLList $list18;
    private static SubLSymbol $kw19$ALLOW_OTHER_KEYS;
    private static SubLSymbol $kw20$CALLING_CONVENTION;
    private static SubLSymbol $kw21$C;
    private static SubLSymbol $kw22$FOREIGN_SHARED_LIBRARY;
    private static SubLSymbol $kw23$FOREIGN_NAME;
    private static SubLSymbol $kw24$ARG_CONVERSION;
    private static SubLSymbol $kw25$RETURN_TYPE;
    private static SubLSymbol $kw26$VOID;
    private static SubLString $str27$Currently__only_calling_conventio;
    private static SubLString $str28$_FOREIGN_NAME_expects_STRING__not;
    private static SubLString $str29$The_argument_list__S_and_the__ARG;
    private static SubLString $str30$_S_is_not_a_valid__ARG_CONVERSION;
    private static SubLString $str31$_S_is_not_a_valid__RETURN_TYPE_ar;
    private static SubLString $str32$Do_not_know_how_to_generate_a_for;
    private static SubLList $list33;
    private static SubLSymbol $sym34$FUNCALL;
    private static SubLSymbol $sym35$DEF_FOREIGN_FUNCTION;
    private static SubLSymbol $sym36$QUOTE;
    private static SubLSymbol $sym37$PROGN;
    private static SubLSymbol $sym38$DEFINE;
    private static SubLSymbol $sym39$CLET;
    private static SubLSymbol $sym40$_VAL;
    private static SubLSymbol $sym41$FFUNCALL;
    private static SubLSymbol $sym42$PIF;
    private static SubLList $list43;
    private static SubLSymbol $sym44$RET;
    private static SubLList $list45;
    static {
	me = new foreign();
	foreign.$foreign_shared_library_lock$ = null;
	foreign.$char_pointer_idiom_declaration$ = null;
	foreign.$pointer_idiom_declaration$ = null;
	foreign.$char_pointer_idiom_allegro$ = null;
	foreign.$foreign_shared_libraries$ = null;
	foreign.$active_foreign_shared_library_lock$ = null;
	foreign.$active_foreign_shared_libraries$ = null;
	$str0$Foreign_Shared_Libraries_Lock = SubLObjectFactory.makeString("Foreign Shared Libraries Lock");
	$list1 = ConsesLow.list(ConsesLow.list(SubLObjectFactory.makeKeyword("POINTER"), SubLObjectFactory.makeKeyword("CHAR")), SubLObjectFactory.makeKeyword("STRING"));
	$list2 = ConsesLow.list(SubLObjectFactory.makeKeyword("OPAQUE"), SubLObjectFactory.makeKeyword("ALIEN"));
	$list3 = ConsesLow.list(SubLObjectFactory.makeKeyword("INT32"), SubLObjectFactory.makeKeyword("FIXNUM"));
	$kw4$FILENAME = SubLObjectFactory.makeKeyword("FILENAME");
	$str5$Foreign_shared_library_must_have_ = SubLObjectFactory.makeString("Foreign shared library must have :FILENAME property.");
	$kw6$DEPENDS_ON = SubLObjectFactory.makeKeyword("DEPENDS-ON");
	$str7$_A_does_not_reference_a_known_for = SubLObjectFactory.makeString("~A does not reference a known foreign shared library.");
	$str8$Active_Foreign_Shared_Libraries = SubLObjectFactory.makeString("Active Foreign Shared Libraries");
	$str9$_S_is_not_associated_with_any_for = SubLObjectFactory.makeString("~S is not associated with any foreign shared library.");
	$str10$Shared_library__S___S__is_already = SubLObjectFactory.makeString("Shared library ~S (~S) is already loaded.");
	$str11$_S_does_not_designate_one_of_the_ = SubLObjectFactory.makeString("~S does not designate one of the libraries (~S) currently loaded.");
	$str12$_S_does_not_designate_a_known_sha = SubLObjectFactory.makeString("~S does not designate a known shared library.");
	$str13$_ = SubLObjectFactory.makeString("%");
	$list14 = ConsesLow.list(SubLObjectFactory.makeSymbol("SYMBOL"), SubLObjectFactory.makeSymbol("ARGLIST"), SubLObjectFactory.makeSymbol("RULES"));
	$sym15$SYMBOLP = SubLObjectFactory.makeSymbol("SYMBOLP");
	$sym16$LISTP = SubLObjectFactory.makeSymbol("LISTP");
	$list17 = ConsesLow.list(SubLObjectFactory.makeSymbol("&KEY"), ConsesLow.list(SubLObjectFactory.makeSymbol("CALLING-CONVENTION"), SubLObjectFactory.makeKeyword("C")), SubLObjectFactory.makeSymbol("FOREIGN-SHARED-LIBRARY"), SubLObjectFactory.makeSymbol("FOREIGN-NAME"),
		SubLObjectFactory.makeSymbol("ARG-CONVERSION"), ConsesLow.list(SubLObjectFactory.makeSymbol("RETURN-TYPE"), SubLObjectFactory.makeKeyword("VOID")));
	$list18 = ConsesLow.list(SubLObjectFactory.makeKeyword("CALLING-CONVENTION"), SubLObjectFactory.makeKeyword("FOREIGN-SHARED-LIBRARY"), SubLObjectFactory.makeKeyword("FOREIGN-NAME"), SubLObjectFactory.makeKeyword("ARG-CONVERSION"), SubLObjectFactory.makeKeyword("RETURN-TYPE"));
	$kw19$ALLOW_OTHER_KEYS = SubLObjectFactory.makeKeyword("ALLOW-OTHER-KEYS");
	$kw20$CALLING_CONVENTION = SubLObjectFactory.makeKeyword("CALLING-CONVENTION");
	$kw21$C = SubLObjectFactory.makeKeyword("C");
	$kw22$FOREIGN_SHARED_LIBRARY = SubLObjectFactory.makeKeyword("FOREIGN-SHARED-LIBRARY");
	$kw23$FOREIGN_NAME = SubLObjectFactory.makeKeyword("FOREIGN-NAME");
	$kw24$ARG_CONVERSION = SubLObjectFactory.makeKeyword("ARG-CONVERSION");
	$kw25$RETURN_TYPE = SubLObjectFactory.makeKeyword("RETURN-TYPE");
	$kw26$VOID = SubLObjectFactory.makeKeyword("VOID");
	$str27$Currently__only_calling_conventio = SubLObjectFactory.makeString("Currently, only calling-convention :C is supported.");
	$str28$_FOREIGN_NAME_expects_STRING__not = SubLObjectFactory.makeString(":FOREIGN-NAME expects STRING, not ~S.");
	$str29$The_argument_list__S_and_the__ARG = SubLObjectFactory.makeString("The argument list ~S and the :ARG-CONVERSION pattern ~S appear malaligned.");
	$str30$_S_is_not_a_valid__ARG_CONVERSION = SubLObjectFactory.makeString("~S is not a valid :ARG-CONVERSION argument.");
	$str31$_S_is_not_a_valid__RETURN_TYPE_ar = SubLObjectFactory.makeString("~S is not a valid :RETURN-TYPE argument.");
	$str32$Do_not_know_how_to_generate_a_for = SubLObjectFactory.makeString("Do not know how to generate a foreign name from ~S for ~S.");
	$list33 = ConsesLow.list(SubLObjectFactory.makeSymbol("SYMBOL"), SubLObjectFactory.makeSymbol("&REST"), SubLObjectFactory.makeSymbol("ARGS"));
	$sym34$FUNCALL = SubLObjectFactory.makeSymbol("FUNCALL");
	$sym35$DEF_FOREIGN_FUNCTION = SubLObjectFactory.makeSymbol("DEF-FOREIGN-FUNCTION");
	$sym36$QUOTE = SubLObjectFactory.makeSymbol("QUOTE");
	$sym37$PROGN = SubLObjectFactory.makeSymbol("PROGN");
	$sym38$DEFINE = SubLObjectFactory.makeSymbol("DEFINE");
	$sym39$CLET = SubLObjectFactory.makeSymbol("CLET");
	$sym40$_VAL = SubLObjectFactory.makeSymbol("%VAL");
	$sym41$FFUNCALL = SubLObjectFactory.makeSymbol("FFUNCALL");
	$sym42$PIF = SubLObjectFactory.makeSymbol("PIF");
	$list43 = ConsesLow.list(SubLObjectFactory.makeSymbol("ALIEN-NULL-PTR?"), SubLObjectFactory.makeSymbol("%VAL"), SubLObjectFactory.makeKeyword("C"));
	$sym44$RET = SubLObjectFactory.makeSymbol("RET");
	$list45 = ConsesLow.list(ConsesLow.list(SubLObjectFactory.makeSymbol("RET"), SubLObjectFactory.makeSymbol("%VAL")));
    }

    @Override
    public void declareFunctions() {
	declare_foreign_file();
    }

    @Override
    public void initializeVariables() {
	init_foreign_file();
    }

    @Override
    public void runTopLevelForms() {
	setup_foreign_file();
    }
}
