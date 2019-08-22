/**
 *
 */
/**
 * For LarKC
 */
/**
 *
 */
package com.cyc.tool.subl.jrtl.translatedCode.sublisp;


import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.append;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.listS;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.rplacd;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.funcall;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks.make_lock;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks.release_lock;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks.seize_lock;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.cconcatenate;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.delete;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.length;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.make_symbol;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_name;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.listp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.symbolp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.values;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors.make_vector;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.cdestructuring_bind_error;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.property_list_member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.acons;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.assoc;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cadr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.copy_list;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.getf;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.second;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.third;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.declareMacro;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;
import static com.cyc.tool.subl.util.SubLFiles.defvar;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Alien;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Filesys;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLNil;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


public class foreign extends SubLTranslatedFile {
    public static SubLObject all_foreign_shared_libraries() {
        SubLThread thread = SubLProcess.currentSubLThread();
        return copy_list($foreign_shared_libraries$.getDynamicValue(thread));
    }

    public static SubLObject analyze_define_foreign_function_arguments(SubLObject symbol, SubLObject arglist, SubLObject rules) {
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject allow_other_keys_p = SubLNil.NIL;
        SubLObject rest = rules;
        SubLObject bad = SubLNil.NIL;
        SubLObject current_$1 = SubLNil.NIL;
        while (SubLNil.NIL != rest) {
            destructuring_bind_must_consp(rest, rules, $list17);
            current_$1 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, rules, $list17);
            if (SubLNil.NIL == member(current_$1, $list18, UNPROVIDED, UNPROVIDED))
                bad = T;

            if (current_$1 == $ALLOW_OTHER_KEYS)
                allow_other_keys_p = rest.first();

            rest = rest.rest();
        } 
        if ((SubLNil.NIL != bad) && (SubLNil.NIL == allow_other_keys_p))
            cdestructuring_bind_error(rules, $list17);

        SubLObject calling_convention_tail = property_list_member($CALLING_CONVENTION, rules);
        SubLObject calling_convention = (SubLNil.NIL != calling_convention_tail) ? cadr(calling_convention_tail) : $C;
        SubLObject foreign_shared_library_tail = property_list_member($FOREIGN_SHARED_LIBRARY, rules);
        SubLObject foreign_shared_library = (SubLNil.NIL != foreign_shared_library_tail) ? cadr(foreign_shared_library_tail) : SubLNil.NIL;
        SubLObject foreign_name_tail = property_list_member($FOREIGN_NAME, rules);
        SubLObject foreign_name = (SubLNil.NIL != foreign_name_tail) ? cadr(foreign_name_tail) : SubLNil.NIL;
        SubLObject arg_conversion_tail = property_list_member($ARG_CONVERSION, rules);
        SubLObject arg_conversion = (SubLNil.NIL != arg_conversion_tail) ? cadr(arg_conversion_tail) : SubLNil.NIL;
        SubLObject return_type_tail = property_list_member($RETURN_TYPE, rules);
        SubLObject return_type = (SubLNil.NIL != return_type_tail) ? cadr(return_type_tail) : $VOID;
        if ((SubLNil.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (calling_convention != $C))
            Errors.error($str27$Currently__only_calling_conventio);

        if (SubLNil.NIL == foreign_name)
            foreign_name = generate_foreign_name_from_sublisp_symbol(calling_convention, symbol);

        if ((SubLNil.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (!foreign_name.isString()))
            Errors.error($str28$_FOREIGN_NAME_expects_STRING__not, foreign_name);

        if ((SubLNil.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (!length(arglist).numE(length(arg_conversion))))
            Errors.error($str29$The_argument_list__S_and_the__ARG, arglist, arg_conversion);

        if ((SubLNil.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (SubLNil.NIL == valid_arg_conversion_pattern(arg_conversion)))
            Errors.error($str30$_S_is_not_a_valid__ARG_CONVERSION, arg_conversion);

        if (((SubLNil.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (!return_type.isKeyword())) && (!return_type.isList()))
            Errors.error($str31$_S_is_not_a_valid__RETURN_TYPE_ar, return_type);

        return values(calling_convention, foreign_shared_library, foreign_name, arg_conversion, return_type);
    }

    public static SubLObject declare_foreign_file() {
        declareFunction("declare_foreign_shared_library", "DECLARE-FOREIGN-SHARED-LIBRARY", 2, 0, false);
        declareFunction("find_foreign_shared_library_by_pathname", "FIND-FOREIGN-SHARED-LIBRARY-BY-PATHNAME", 1, 0, false);
        declareFunction("get_foreign_shared_library_pathname", "GET-FOREIGN-SHARED-LIBRARY-PATHNAME", 1, 0, false);
        declareFunction("get_foreign_shared_library_dependencies", "GET-FOREIGN-SHARED-LIBRARY-DEPENDENCIES", 1, 0, false);
        declareFunction("get_foreign_shared_library_property", "GET-FOREIGN-SHARED-LIBRARY-PROPERTY", 2, 1, false);
        declareFunction("foreign_shared_library_p", "FOREIGN-SHARED-LIBRARY-P", 1, 0, false);
        declareFunction("undeclare_foreign_shared_library", "UNDECLARE-FOREIGN-SHARED-LIBRARY", 1, 0, false);
        declareFunction("all_foreign_shared_libraries", "ALL-FOREIGN-SHARED-LIBRARIES", 0, 0, false);
        declareFunction("foreign_shared_library_loadableP", "FOREIGN-SHARED-LIBRARY-LOADABLE?", 1, 0, false);
        declareFunction("find_foreign_shared_library_by_property", "FIND-FOREIGN-SHARED-LIBRARY-BY-PROPERTY", 2, 1, false);
        declareFunction("find_foreign_shared_library_int", "FIND-FOREIGN-SHARED-LIBRARY-INT", 1, 0, false);
        declareFunction("edit_foreign_shared_library", "EDIT-FOREIGN-SHARED-LIBRARY", 2, 0, false);
        declareFunction("foreign_shared_library_accessibleP", "FOREIGN-SHARED-LIBRARY-ACCESSIBLE?", 1, 0, false);
        declareFunction("load_foreign_shared_library", "LOAD-FOREIGN-SHARED-LIBRARY", 1, 1, false);
        declareFunction("ensure_foreign_shared_library_loaded", "ENSURE-FOREIGN-SHARED-LIBRARY-LOADED", 1, 1, false);
        declareFunction("foreign_shared_library_loadedP", "FOREIGN-SHARED-LIBRARY-LOADED?", 1, 0, false);
        declareFunction("unload_foreign_shared_library", "UNLOAD-FOREIGN-SHARED-LIBRARY", 1, 0, false);
        declareFunction("foreign_shared_library_installedP", "FOREIGN-SHARED-LIBRARY-INSTALLED?", 1, 0, false);
        declareFunction("load_shared_library_int", "LOAD-SHARED-LIBRARY-INT", 3, 0, false);
        declareFunction("unload_shared_library_int", "UNLOAD-SHARED-LIBRARY-INT", 2, 0, false);
        declareFunction("foreign_shared_library_loaded_intP", "FOREIGN-SHARED-LIBRARY-LOADED-INT?", 1, 0, false);
        declareFunction("return_type_string_p", "RETURN-TYPE-STRING-P", 1, 0, false);
        declareFunction("return_type_pointer_p", "RETURN-TYPE-POINTER-P", 1, 0, false);
        declareFunction("default_return_value", "DEFAULT-RETURN-VALUE", 1, 0, false);
        declareFunction("make_helper_function_symbol", "MAKE-HELPER-FUNCTION-SYMBOL", 2, 0, false);
        declareMacro("define_foreign_function", "DEFINE-FOREIGN-FUNCTION");
        declareFunction("analyze_define_foreign_function_arguments", "ANALYZE-DEFINE-FOREIGN-FUNCTION-ARGUMENTS", 3, 0, false);
        declareFunction("generate_foreign_name_from_sublisp_symbol", "GENERATE-FOREIGN-NAME-FROM-SUBLISP-SYMBOL", 2, 0, false);
        declareFunction("valid_arg_conversion_pattern", "VALID-ARG-CONVERSION-PATTERN", 1, 0, false);
        declareMacro("ffuncall", "FFUNCALL");
        declareFunction("make_dummy_arg_list", "MAKE-DUMMY-ARG-LIST", 1, 0, false);
        declareFunction("define_foreign_function_internal", "DEFINE-FOREIGN-FUNCTION-INTERNAL", 7, 0, false);
        declareFunction("vector_for_marshalling", "VECTOR-FOR-MARSHALLING", 3, 0, false);
        return SubLNil.NIL;
    }

    public static SubLObject declare_foreign_shared_library(SubLObject moniker, SubLObject properties) {
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject pathname = getf(properties, $FILENAME, SubLNil.NIL);
        SubLObject result = SubLNil.NIL;
        if (SubLNil.NIL == pathname)
            Errors.error($str5$Foreign_shared_library_must_have_);

        SubLObject release = SubLNil.NIL;
        try {
            release = seize_lock($foreign_shared_library_lock$.getGlobalValue());
            if (SubLNil.NIL != foreign_shared_library_p(moniker))
                edit_foreign_shared_library(moniker, properties);
            else {
                $foreign_shared_libraries$.setDynamicValue(acons(moniker, properties, $foreign_shared_libraries$.getDynamicValue(thread)), thread);
                result = $foreign_shared_libraries$.getDynamicValue(thread);
            }
        } finally {
            if (SubLNil.NIL != release)
                release_lock($foreign_shared_library_lock$.getGlobalValue());

        }
        return result;
    }

    public static SubLObject default_return_value(SubLObject return_type) {
        if (SubLNil.NIL == return_type_pointer_p(return_type))
            return SubLNil.NIL;

        if (length(return_type).numL(THREE_INTEGER))
            return SubLNil.NIL;

        return third(return_type);
    }

    public static SubLObject define_foreign_function(SubLObject macroform, SubLObject environment) {
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject current;
        SubLObject datum = current = macroform.rest();
        SubLObject symbol = SubLNil.NIL;
        SubLObject arglist = SubLNil.NIL;
        SubLObject rules = SubLNil.NIL;
        destructuring_bind_must_consp(current, datum, $list14);
        symbol = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list14);
        arglist = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list14);
        rules = current.first();
        current = current.rest();
        if (SubLNil.NIL != current) {
            cdestructuring_bind_error(datum, $list14);
            return SubLNil.NIL;
        }
        assert SubLNil.NIL != symbolp(symbol) : symbol;
        assert SubLNil.NIL != listp(arglist) : arglist;
        assert SubLNil.NIL != listp(rules) : rules;
        thread.resetMultipleValues();
        SubLObject calling_convention = analyze_define_foreign_function_arguments(symbol, arglist, rules);
        SubLObject foreign_shared_library = thread.secondMultipleValue();
        SubLObject foreign_name = thread.thirdMultipleValue();
        SubLObject arg_conversion = thread.fourthMultipleValue();
        SubLObject return_type = thread.fifthMultipleValue();
        thread.resetMultipleValues();
        return define_foreign_function_internal(symbol, arglist, calling_convention, foreign_shared_library, foreign_name, arg_conversion, return_type);
    }

    public static SubLObject define_foreign_function_internal(SubLObject symbol, SubLObject arglist, SubLObject calling_convention, SubLObject foreign_shared_library, SubLObject foreign_name, SubLObject arg_conversion, SubLObject return_type) {
        SubLObject ret_type = (return_type.isList()) ? return_type.first() : SubLNil.NIL;
        SubLObject symbol_ff = make_helper_function_symbol(symbol, return_type);
        SubLObject default_return_value = default_return_value(return_type);
        SubLObject main_function = list(DEF_FOREIGN_FUNCTION, foreign_shared_library, foreign_name, list(QUOTE, symbol_ff), list(QUOTE, arg_conversion), list(QUOTE, ret_type), calling_convention, default_return_value);
        if (!symbol.equal(symbol_ff)) {
            SubLObject dummy_arglist = make_dummy_arg_list(arglist);
            SubLObject retit = list(PROGN, main_function, list(DEFINE, symbol, dummy_arglist, list(CLET, list(list($sym40$_VAL, listS(FFUNCALL, list(QUOTE, symbol_ff), append(dummy_arglist, SubLNil.NIL)))), listS(PIF, $list43, list(RET, default_return_value), $list45))));
            return retit;
        }
        return main_function;
    }

    public static SubLObject edit_foreign_shared_library(SubLObject moniker, SubLObject properties) {
        SubLObject tuple = find_foreign_shared_library_int(moniker);
        if (SubLNil.NIL != tuple)
            rplacd(tuple, properties);

        return moniker;
    }

    public static SubLObject ensure_foreign_shared_library_loaded(SubLObject moniker, SubLObject options) {
        if (options == UNPROVIDED)
            options = SubLNil.NIL;

        if (SubLNil.NIL == foreign_shared_library_loaded_intP(moniker)) {
            SubLObject release = SubLNil.NIL;
            try {
                release = seize_lock($active_foreign_shared_library_lock$.getGlobalValue());
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
                    release_lock($active_foreign_shared_library_lock$.getGlobalValue());

            }
        }
        return moniker;
    }

    public static SubLObject ffuncall(SubLObject macroform, SubLObject environment) {
        SubLObject current;
        SubLObject datum = current = macroform.rest();
        SubLObject symbol = SubLNil.NIL;
        destructuring_bind_must_consp(current, datum, $list33);
        symbol = current.first();
        SubLObject args;
        current = args = current.rest();
        return listS(FUNCALL, symbol, append(args, SubLNil.NIL));
    }

    public static SubLObject find_foreign_shared_library_by_pathname(SubLObject pathname) {
        SubLObject tuple = SubLNil.NIL;
        SubLObject release = SubLNil.NIL;
        try {
            release = seize_lock($foreign_shared_library_lock$.getGlobalValue());
            tuple = find_foreign_shared_library_by_property($FILENAME, pathname, EQUAL);
        } finally {
            if (SubLNil.NIL != release)
                release_lock($foreign_shared_library_lock$.getGlobalValue());

        }
        return tuple;
    }

    public static SubLObject find_foreign_shared_library_by_property(SubLObject property, SubLObject value, SubLObject test) {
        if (test == UNPROVIDED)
            test = symbol_function(EQL);

        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject found = SubLNil.NIL;
        if (SubLNil.NIL == found) {
            SubLObject csome_list_var = $foreign_shared_libraries$.getDynamicValue(thread);
            SubLObject libinfo = SubLNil.NIL;
            libinfo = csome_list_var.first();
            while ((SubLNil.NIL == found) && (SubLNil.NIL != csome_list_var)) {
                SubLObject moniker = libinfo.first();
                SubLObject properties = libinfo.rest();
                if (SubLNil.NIL != funcall(test, value, getf(properties, property, UNPROVIDED)))
                    found = moniker;

                csome_list_var = csome_list_var.rest();
                libinfo = csome_list_var.first();
            } 
        }
        return found;
    }

    public static SubLObject find_foreign_shared_library_int(SubLObject moniker) {
        SubLThread thread = SubLProcess.currentSubLThread();
        return assoc(moniker, $foreign_shared_libraries$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject foreign_shared_library_accessibleP(SubLObject moniker) {
        return Filesys.probe_file(get_foreign_shared_library_pathname(moniker));
    }

    public static SubLObject foreign_shared_library_installedP(SubLObject moniker) {
        return makeBoolean((SubLNil.NIL != foreign_shared_library_loadedP(moniker)) || (SubLNil.NIL != foreign_shared_library_loadableP(moniker)));
    }

    public static SubLObject foreign_shared_library_loadableP(SubLObject moniker) {
        SubLObject pathname = get_foreign_shared_library_pathname(moniker);
        if (SubLNil.NIL != pathname)
            return SubLNil.NIL != Filesys.probe_file(pathname) ? T : SubLNil.NIL;

        return SubLNil.NIL;
    }

    public static SubLObject foreign_shared_library_loaded_intP(SubLObject moniker) {
        SubLThread thread = SubLProcess.currentSubLThread();
        return makeBoolean(SubLNil.NIL != member(moniker, $active_foreign_shared_libraries$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED));
    }

    public static SubLObject foreign_shared_library_loadedP(SubLObject moniker) {
        SubLObject result = SubLNil.NIL;
        SubLObject release = SubLNil.NIL;
        try {
            release = seize_lock($active_foreign_shared_library_lock$.getGlobalValue());
            result = foreign_shared_library_loaded_intP(moniker);
        } finally {
            if (SubLNil.NIL != release)
                release_lock($active_foreign_shared_library_lock$.getGlobalValue());

        }
        return result;
    }

    public static SubLObject foreign_shared_library_p(SubLObject moniker) {
        return makeBoolean(SubLNil.NIL != get_foreign_shared_library_pathname(moniker));
    }

    public static SubLObject generate_foreign_name_from_sublisp_symbol(SubLObject calling_convention, SubLObject symbol) {
        if (calling_convention.eql($C))
            return Strings.string_downcase(symbol_name(symbol), UNPROVIDED, UNPROVIDED);

        Errors.error($str32$Do_not_know_how_to_generate_a_for, symbol, calling_convention);
        return SubLNil.NIL;
    }

    public static SubLObject get_foreign_shared_library_dependencies(SubLObject moniker) {
        return get_foreign_shared_library_property(moniker, $DEPENDS_ON, SubLNil.NIL);
    }

    public static SubLObject get_foreign_shared_library_pathname(SubLObject moniker) {
        return get_foreign_shared_library_property(moniker, $FILENAME, SubLNil.NIL);
    }

    public static SubLObject get_foreign_shared_library_property(SubLObject moniker, SubLObject property, SubLObject v_default) {
        if (v_default == UNPROVIDED)
            v_default = SubLNil.NIL;

        SubLObject tuple = SubLNil.NIL;
        SubLObject release = SubLNil.NIL;
        try {
            release = seize_lock($foreign_shared_library_lock$.getGlobalValue());
            tuple = find_foreign_shared_library_int(moniker);
        } finally {
            if (SubLNil.NIL != release)
                release_lock($foreign_shared_library_lock$.getGlobalValue());

        }
        SubLObject properties = tuple.rest();
        return getf(properties, property, v_default);
    }

    public static SubLObject init_foreign_file() {
        deflexical("*FOREIGN-SHARED-LIBRARY-LOCK*", make_lock($$$Foreign_Shared_Libraries_Lock));
        deflexical("*CHAR-POINTER-IDIOM-DECLARATION*", $list1);
        deflexical("*POINTER-IDIOM-DECLARATION*", $list2);
        deflexical("*CHAR-POINTER-IDIOM-ALLEGRO*", $list3);
        defvar("*FOREIGN-SHARED-LIBRARIES*", SubLNil.NIL);
        deflexical("*ACTIVE-FOREIGN-SHARED-LIBRARY-LOCK*", make_lock($$$Active_Foreign_Shared_Libraries));
        defvar("*ACTIVE-FOREIGN-SHARED-LIBRARIES*", SubLNil.NIL);
        return SubLNil.NIL;
    }

    public static SubLObject load_foreign_shared_library(SubLObject moniker, SubLObject options) {
        if (options == UNPROVIDED)
            options = SubLNil.NIL;

        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject pathname = get_foreign_shared_library_pathname(moniker);
        if (SubLNil.NIL == pathname)
            Errors.error($str9$_S_is_not_associated_with_any_for, moniker);

        SubLObject release = SubLNil.NIL;
        try {
            release = seize_lock($active_foreign_shared_library_lock$.getGlobalValue());
            if (SubLNil.NIL != foreign_shared_library_loadedP(moniker))
                Errors.warn($str10$Shared_library__S___S__is_already, moniker, pathname);
            else {
                load_shared_library_int(moniker, pathname, options);
                $active_foreign_shared_libraries$.setDynamicValue(cons(moniker, $active_foreign_shared_libraries$.getDynamicValue(thread)), thread);
            }
        } finally {
            if (SubLNil.NIL != release)
                release_lock($active_foreign_shared_library_lock$.getGlobalValue());

        }
        return moniker;
    }

    public static SubLObject load_shared_library_int(SubLObject moniker, SubLObject pathname, SubLObject options) {
        return Alien.load_shared_object(moniker, pathname, options);
    }

    public static SubLObject make_dummy_arg_list(SubLObject arglist) {
        return arglist;
    }

    public static SubLObject make_helper_function_symbol(SubLObject symbol, SubLObject return_type) {
        if (SubLNil.NIL != return_type_pointer_p(return_type))
            return make_symbol(cconcatenate(symbol_name(symbol), $str13$_));

        return symbol;
    }

    public static SubLObject return_type_pointer_p(SubLObject return_type) {
        if (SubLNil.NIL != return_type_string_p(return_type))
            return T;

        if ((!return_type.isList()) || (!length(return_type).numG(ONE_INTEGER)))
            return SubLNil.NIL;

        return makeBoolean($pointer_idiom_declaration$.getGlobalValue().first().equal(return_type.first()) && second($pointer_idiom_declaration$.getGlobalValue()).equal(second(return_type)));
    }

    public static SubLObject return_type_string_p(SubLObject return_type) {
        if ((!return_type.isList()) || (!length(return_type).numG(ONE_INTEGER)))
            return SubLNil.NIL;

        return makeBoolean($char_pointer_idiom_declaration$.getGlobalValue().first().equal(return_type.first()) && second($char_pointer_idiom_declaration$.getGlobalValue()).equal(second(return_type)));
    }

    public static SubLObject setup_foreign_file() {
        return SubLNil.NIL;
    }

    public static SubLObject undeclare_foreign_shared_library(SubLObject moniker) {
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject okP = SubLNil.NIL;
        SubLObject release = SubLNil.NIL;
        try {
            release = seize_lock($foreign_shared_library_lock$.getGlobalValue());
            if (SubLNil.NIL != foreign_shared_library_p(moniker)) {
                SubLObject tuple = find_foreign_shared_library_int(moniker);
                $foreign_shared_libraries$.setDynamicValue(delete(tuple, $foreign_shared_libraries$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), thread);
                okP = T;
            }
        } finally {
            if (SubLNil.NIL != release)
                release_lock($foreign_shared_library_lock$.getGlobalValue());

        }
        if (SubLNil.NIL == okP)
            Errors.error($str7$_A_does_not_reference_a_known_for, moniker);

        return okP;
    }

    public static SubLObject unload_foreign_shared_library(SubLObject moniker) {
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject success = SubLNil.NIL;
        SubLObject release = SubLNil.NIL;
        try {
            release = seize_lock($active_foreign_shared_library_lock$.getGlobalValue());
            if (SubLNil.NIL != foreign_shared_library_loadedP(moniker)) {
                SubLObject pathname = get_foreign_shared_library_pathname(moniker);
                unload_shared_library_int(moniker, pathname);
                $active_foreign_shared_libraries$.setDynamicValue(delete(moniker, $active_foreign_shared_libraries$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), thread);
                success = T;
            }
        } finally {
            if (SubLNil.NIL != release)
                release_lock($active_foreign_shared_library_lock$.getGlobalValue());

        }
        if (SubLNil.NIL == success)
            if (SubLNil.NIL != foreign_shared_library_p(moniker))
                Errors.error($str11$_S_does_not_designate_one_of_the_, moniker, all_foreign_shared_libraries());
            else
                Errors.error($str12$_S_does_not_designate_a_known_sha, moniker);


        return success;
    }

    public static SubLObject unload_shared_library_int(SubLObject moniker, SubLObject pathname) {
        return Alien.unload_shared_object(moniker);
    }

    public static SubLObject valid_arg_conversion_pattern(SubLObject arg_conversion) {
        return listp(arg_conversion);
    }

    public static SubLObject vector_for_marshalling(SubLObject size, SubLObject type, SubLObject initial_value) {
        return make_vector(size, initial_value);
    }

    public static final SubLFile me = new foreign();

    public static final String myName = "com.cyc.tool.subl.jrtl.translatedCode.sublisp.foreign";

    // deflexical
    // Definitions
    public static final SubLSymbol $foreign_shared_library_lock$ = makeSymbol("*FOREIGN-SHARED-LIBRARY-LOCK*");

    // deflexical
    public static final SubLSymbol $char_pointer_idiom_declaration$ = makeSymbol("*CHAR-POINTER-IDIOM-DECLARATION*");

    // deflexical
    public static final SubLSymbol $pointer_idiom_declaration$ = makeSymbol("*POINTER-IDIOM-DECLARATION*");

    // deflexical
    public static final SubLSymbol $char_pointer_idiom_allegro$ = makeSymbol("*CHAR-POINTER-IDIOM-ALLEGRO*");

    // defvar
    // This is the list of foreign shared libraries that SL knows about.
    public static final SubLSymbol $foreign_shared_libraries$ = makeSymbol("*FOREIGN-SHARED-LIBRARIES*");

    // deflexical
    public static final SubLSymbol $active_foreign_shared_library_lock$ = makeSymbol("*ACTIVE-FOREIGN-SHARED-LIBRARY-LOCK*");

    // defvar
    // This is the list of monikers foreign shared libraries that SL maintains itself (beyond
    // the ones that the system has itself and that are currently loaded.
    public static final SubLSymbol $active_foreign_shared_libraries$ = makeSymbol("*ACTIVE-FOREIGN-SHARED-LIBRARIES*");

    // Internal Constants
    public static final SubLString $$$Foreign_Shared_Libraries_Lock = makeString("Foreign Shared Libraries Lock");

    public static final SubLList $list1 = list(list(makeKeyword("POINTER"), makeKeyword("CHAR")), makeKeyword("STRING"));

    public static final SubLList $list2 = list(makeKeyword("OPAQUE"), makeKeyword("ALIEN"));

    public static final SubLList $list3 = list(makeKeyword("INT32"), makeKeyword("FIXNUM"));



    public static final SubLString $str5$Foreign_shared_library_must_have_ = makeString("Foreign shared library must have :FILENAME property.");

    public static final SubLSymbol $DEPENDS_ON = makeKeyword("DEPENDS-ON");

    public static final SubLString $str7$_A_does_not_reference_a_known_for = makeString("~A does not reference a known foreign shared library.");

    public static final SubLString $$$Active_Foreign_Shared_Libraries = makeString("Active Foreign Shared Libraries");

    public static final SubLString $str9$_S_is_not_associated_with_any_for = makeString("~S is not associated with any foreign shared library.");

    public static final SubLString $str10$Shared_library__S___S__is_already = makeString("Shared library ~S (~S) is already loaded.");

    public static final SubLString $str11$_S_does_not_designate_one_of_the_ = makeString("~S does not designate one of the libraries (~S) currently loaded.");

    public static final SubLString $str12$_S_does_not_designate_a_known_sha = makeString("~S does not designate a known shared library.");

    public static final SubLString $str13$_ = makeString("%");

    public static final SubLList $list14 = list(makeSymbol("SYMBOL"), makeSymbol("ARGLIST"), makeSymbol("RULES"));





    public static final SubLList $list17 = list(makeSymbol("&KEY"), list(makeSymbol("CALLING-CONVENTION"), makeKeyword("C")), makeSymbol("FOREIGN-SHARED-LIBRARY"), makeSymbol("FOREIGN-NAME"), makeSymbol("ARG-CONVERSION"), list(makeSymbol("RETURN-TYPE"), makeKeyword("VOID")));

    public static final SubLList $list18 = list(makeKeyword("CALLING-CONVENTION"), makeKeyword("FOREIGN-SHARED-LIBRARY"), makeKeyword("FOREIGN-NAME"), makeKeyword("ARG-CONVERSION"), makeKeyword("RETURN-TYPE"));

    public static final SubLSymbol $ALLOW_OTHER_KEYS = makeKeyword("ALLOW-OTHER-KEYS");

    public static final SubLSymbol $CALLING_CONVENTION = makeKeyword("CALLING-CONVENTION");



    public static final SubLSymbol $FOREIGN_SHARED_LIBRARY = makeKeyword("FOREIGN-SHARED-LIBRARY");

    public static final SubLSymbol $FOREIGN_NAME = makeKeyword("FOREIGN-NAME");

    public static final SubLSymbol $ARG_CONVERSION = makeKeyword("ARG-CONVERSION");





    public static final SubLString $str27$Currently__only_calling_conventio = makeString("Currently, only calling-convention :C is supported.");

    public static final SubLString $str28$_FOREIGN_NAME_expects_STRING__not = makeString(":FOREIGN-NAME expects STRING, not ~S.");

    public static final SubLString $str29$The_argument_list__S_and_the__ARG = makeString("The argument list ~S and the :ARG-CONVERSION pattern ~S appear malaligned.");

    public static final SubLString $str30$_S_is_not_a_valid__ARG_CONVERSION = makeString("~S is not a valid :ARG-CONVERSION argument.");

    public static final SubLString $str31$_S_is_not_a_valid__RETURN_TYPE_ar = makeString("~S is not a valid :RETURN-TYPE argument.");

    public static final SubLString $str32$Do_not_know_how_to_generate_a_for = makeString("Do not know how to generate a foreign name from ~S for ~S.");

    public static final SubLList $list33 = list(makeSymbol("SYMBOL"), makeSymbol("&REST"), makeSymbol("ARGS"));



    public static final SubLSymbol DEF_FOREIGN_FUNCTION = makeSymbol("DEF-FOREIGN-FUNCTION");









    public static final SubLSymbol $sym40$_VAL = makeSymbol("%VAL");

    public static final SubLSymbol FFUNCALL = makeSymbol("FFUNCALL");



    public static final SubLList $list43 = list(makeSymbol("ALIEN-NULL-PTR?"), makeSymbol("%VAL"), makeKeyword("C"));



    public static final SubLList $list45 = list(list(makeSymbol("RET"), makeSymbol("%VAL")));

    

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

