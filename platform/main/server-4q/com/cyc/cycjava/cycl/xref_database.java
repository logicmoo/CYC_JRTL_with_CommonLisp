/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.access_macros.register_macro_helper;
import static com.cyc.cycjava.cycl.control_vars.$cyc_package$;
import static com.cyc.cycjava.cycl.form_translation.private_global_p;
import static com.cyc.cycjava.cycl.form_translation.private_method_p;
import static com.cyc.cycjava.cycl.list_utilities.delete_if_not;
import static com.cyc.cycjava.cycl.list_utilities.fast_delete_duplicates;
import static com.cyc.cycjava.cycl.list_utilities.member_eqP;
import static com.cyc.cycjava.cycl.list_utilities.member_equalP;
import static com.cyc.cycjava.cycl.list_utilities.nmapcar;
import static com.cyc.cycjava.cycl.list_utilities.singletonP;
import static com.cyc.cycjava.cycl.list_utilities.sublisp_boolean;
import static com.cyc.cycjava.cycl.subl_promotions.function_symbol_arglist;
import static com.cyc.cycjava.cycl.subl_promotions.function_symbol_p;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_greater;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_space;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.append;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.listS;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.nconc;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.identity;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.pointer;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.funcall;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.gethash_without_values;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.hash_table_count;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.make_hash_table;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.remhash;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.sethash;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.numE;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.numLE;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.write;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.cconcatenate;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.count;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.delete;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.length;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.nreverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.remove;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.def_csetf;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.makeStructDeclNative;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.register_method;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_package;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.listp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.stringp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.symbolp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.type_of;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.arg2;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.multiple_value_list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.values;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeInteger;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeUninternedSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.cdestructuring_bind_error;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.property_list_member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cadr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cddr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.copy_list;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.copy_tree;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.$print_object_method_table$;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.$print_readably$;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.print_not_readable;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.bq_cons;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.force_output;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.write_char;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.write_string;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.declareMacro;
import static com.cyc.tool.subl.util.SubLFiles.defconstant;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;
import static com.cyc.tool.subl.util.SubLFiles.defvar;

import org.armedbear.lisp.Lisp;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.StreamsLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sxhash;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_macros;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles.LispMethod;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      XREF-DATABASE
 * source file: /cyc/top/cycl/xref-database.lisp
 * created:     2019/07/03 17:39:07
 */
public final class xref_database extends SubLTranslatedFile implements V12 {
    public static final class $xref_system_native extends SubLStructNative {
        public SubLStructDecl getStructDecl() {
            return structDecl;
        }

        public SubLObject getField2() {
            return com.cyc.cycjava.cycl.xref_database.$xref_system_native.this.$name;
        }

        public SubLObject getField3() {
            return com.cyc.cycjava.cycl.xref_database.$xref_system_native.this.$features;
        }

        public SubLObject getField4() {
            return com.cyc.cycjava.cycl.xref_database.$xref_system_native.this.$xref_module_table;
        }

        public SubLObject getField5() {
            return com.cyc.cycjava.cycl.xref_database.$xref_system_native.this.$method_definition_table;
        }

        public SubLObject getField6() {
            return com.cyc.cycjava.cycl.xref_database.$xref_system_native.this.$global_definition_table;
        }

        public SubLObject getField7() {
            return com.cyc.cycjava.cycl.xref_database.$xref_system_native.this.$method_called_by_method_table;
        }

        public SubLObject getField8() {
            return com.cyc.cycjava.cycl.xref_database.$xref_system_native.this.$method_called_by_global_table;
        }

        public SubLObject getField9() {
            return com.cyc.cycjava.cycl.xref_database.$xref_system_native.this.$method_called_at_top_level_table;
        }

        public SubLObject getField10() {
            return com.cyc.cycjava.cycl.xref_database.$xref_system_native.this.$global_referenced_by_method_table;
        }

        public SubLObject getField11() {
            return com.cyc.cycjava.cycl.xref_database.$xref_system_native.this.$global_modified_by_method_table;
        }

        public SubLObject getField12() {
            return com.cyc.cycjava.cycl.xref_database.$xref_system_native.this.$global_rebound_by_method_table;
        }

        public SubLObject getField13() {
            return com.cyc.cycjava.cycl.xref_database.$xref_system_native.this.$global_referenced_by_global_table;
        }

        public SubLObject getField14() {
            return com.cyc.cycjava.cycl.xref_database.$xref_system_native.this.$global_referenced_at_top_level_table;
        }

        public SubLObject getField15() {
            return com.cyc.cycjava.cycl.xref_database.$xref_system_native.this.$global_modified_at_top_level_table;
        }

        public SubLObject getField16() {
            return com.cyc.cycjava.cycl.xref_database.$xref_system_native.this.$global_rebound_at_top_level_table;
        }

        public SubLObject setField2(SubLObject value) {
            return com.cyc.cycjava.cycl.xref_database.$xref_system_native.this.$name = value;
        }

        public SubLObject setField3(SubLObject value) {
            return com.cyc.cycjava.cycl.xref_database.$xref_system_native.this.$features = value;
        }

        public SubLObject setField4(SubLObject value) {
            return com.cyc.cycjava.cycl.xref_database.$xref_system_native.this.$xref_module_table = value;
        }

        public SubLObject setField5(SubLObject value) {
            return com.cyc.cycjava.cycl.xref_database.$xref_system_native.this.$method_definition_table = value;
        }

        public SubLObject setField6(SubLObject value) {
            return com.cyc.cycjava.cycl.xref_database.$xref_system_native.this.$global_definition_table = value;
        }

        public SubLObject setField7(SubLObject value) {
            return com.cyc.cycjava.cycl.xref_database.$xref_system_native.this.$method_called_by_method_table = value;
        }

        public SubLObject setField8(SubLObject value) {
            return com.cyc.cycjava.cycl.xref_database.$xref_system_native.this.$method_called_by_global_table = value;
        }

        public SubLObject setField9(SubLObject value) {
            return com.cyc.cycjava.cycl.xref_database.$xref_system_native.this.$method_called_at_top_level_table = value;
        }

        public SubLObject setField10(SubLObject value) {
            return com.cyc.cycjava.cycl.xref_database.$xref_system_native.this.$global_referenced_by_method_table = value;
        }

        public SubLObject setField11(SubLObject value) {
            return com.cyc.cycjava.cycl.xref_database.$xref_system_native.this.$global_modified_by_method_table = value;
        }

        public SubLObject setField12(SubLObject value) {
            return com.cyc.cycjava.cycl.xref_database.$xref_system_native.this.$global_rebound_by_method_table = value;
        }

        public SubLObject setField13(SubLObject value) {
            return com.cyc.cycjava.cycl.xref_database.$xref_system_native.this.$global_referenced_by_global_table = value;
        }

        public SubLObject setField14(SubLObject value) {
            return com.cyc.cycjava.cycl.xref_database.$xref_system_native.this.$global_referenced_at_top_level_table = value;
        }

        public SubLObject setField15(SubLObject value) {
            return com.cyc.cycjava.cycl.xref_database.$xref_system_native.this.$global_modified_at_top_level_table = value;
        }

        public SubLObject setField16(SubLObject value) {
            return com.cyc.cycjava.cycl.xref_database.$xref_system_native.this.$global_rebound_at_top_level_table = value;
        }

        public SubLObject $name = Lisp.NIL;

        public SubLObject $features = Lisp.NIL;

        public SubLObject $xref_module_table = Lisp.NIL;

        public SubLObject $method_definition_table = Lisp.NIL;

        public SubLObject $global_definition_table = Lisp.NIL;

        public SubLObject $method_called_by_method_table = Lisp.NIL;

        public SubLObject $method_called_by_global_table = Lisp.NIL;

        public SubLObject $method_called_at_top_level_table = Lisp.NIL;

        public SubLObject $global_referenced_by_method_table = Lisp.NIL;

        public SubLObject $global_modified_by_method_table = Lisp.NIL;

        public SubLObject $global_rebound_by_method_table = Lisp.NIL;

        public SubLObject $global_referenced_by_global_table = Lisp.NIL;

        public SubLObject $global_referenced_at_top_level_table = Lisp.NIL;

        public SubLObject $global_modified_at_top_level_table = Lisp.NIL;

        public SubLObject $global_rebound_at_top_level_table = Lisp.NIL;

        private static final SubLStructDeclNative structDecl = makeStructDeclNative(com.cyc.cycjava.cycl.xref_database.$xref_system_native.class, XREF_SYSTEM, XREF_SYSTEM_P, $list_alt111, $list_alt112, new String[]{ "$name", "$features", "$xref_module_table", "$method_definition_table", "$global_definition_table", "$method_called_by_method_table", "$method_called_by_global_table", "$method_called_at_top_level_table", "$global_referenced_by_method_table", "$global_modified_by_method_table", "$global_rebound_by_method_table", "$global_referenced_by_global_table", "$global_referenced_at_top_level_table", "$global_modified_at_top_level_table", "$global_rebound_at_top_level_table" }, $list_alt113, $list_alt114, PRINT_XREF_SYSTEM);
    }

    public static final class $xref_module_native extends SubLStructNative {
        public SubLStructDecl getStructDecl() {
            return structDecl;
        }

        public SubLObject getField2() {
            return com.cyc.cycjava.cycl.xref_database.$xref_module_native.this.$name;
        }

        public SubLObject getField3() {
            return com.cyc.cycjava.cycl.xref_database.$xref_module_native.this.$xref_system;
        }

        public SubLObject getField4() {
            return com.cyc.cycjava.cycl.xref_database.$xref_module_native.this.$features;
        }

        public SubLObject getField5() {
            return com.cyc.cycjava.cycl.xref_database.$xref_module_native.this.$method_definitions;
        }

        public SubLObject getField6() {
            return com.cyc.cycjava.cycl.xref_database.$xref_module_native.this.$method_position_table;
        }

        public SubLObject getField7() {
            return com.cyc.cycjava.cycl.xref_database.$xref_module_native.this.$method_method_table;
        }

        public SubLObject getField8() {
            return com.cyc.cycjava.cycl.xref_database.$xref_module_native.this.$method_global_reference_table;
        }

        public SubLObject getField9() {
            return com.cyc.cycjava.cycl.xref_database.$xref_module_native.this.$method_global_modification_table;
        }

        public SubLObject getField10() {
            return com.cyc.cycjava.cycl.xref_database.$xref_module_native.this.$method_global_binding_table;
        }

        public SubLObject getField11() {
            return com.cyc.cycjava.cycl.xref_database.$xref_module_native.this.$global_definitions;
        }

        public SubLObject getField12() {
            return com.cyc.cycjava.cycl.xref_database.$xref_module_native.this.$global_position_table;
        }

        public SubLObject getField13() {
            return com.cyc.cycjava.cycl.xref_database.$xref_module_native.this.$global_method_table;
        }

        public SubLObject getField14() {
            return com.cyc.cycjava.cycl.xref_database.$xref_module_native.this.$global_global_reference_table;
        }

        public SubLObject getField15() {
            return com.cyc.cycjava.cycl.xref_database.$xref_module_native.this.$top_method_table;
        }

        public SubLObject getField16() {
            return com.cyc.cycjava.cycl.xref_database.$xref_module_native.this.$top_global_reference_table;
        }

        public SubLObject getField17() {
            return com.cyc.cycjava.cycl.xref_database.$xref_module_native.this.$top_global_modification_table;
        }

        public SubLObject getField18() {
            return com.cyc.cycjava.cycl.xref_database.$xref_module_native.this.$top_global_binding_table;
        }

        public SubLObject getField19() {
            return com.cyc.cycjava.cycl.xref_database.$xref_module_native.this.$method_formal_arglist_table;
        }

        public SubLObject getField20() {
            return com.cyc.cycjava.cycl.xref_database.$xref_module_native.this.$global_binding_type_table;
        }

        public SubLObject setField2(SubLObject value) {
            return com.cyc.cycjava.cycl.xref_database.$xref_module_native.this.$name = value;
        }

        public SubLObject setField3(SubLObject value) {
            return com.cyc.cycjava.cycl.xref_database.$xref_module_native.this.$xref_system = value;
        }

        public SubLObject setField4(SubLObject value) {
            return com.cyc.cycjava.cycl.xref_database.$xref_module_native.this.$features = value;
        }

        public SubLObject setField5(SubLObject value) {
            return com.cyc.cycjava.cycl.xref_database.$xref_module_native.this.$method_definitions = value;
        }

        public SubLObject setField6(SubLObject value) {
            return com.cyc.cycjava.cycl.xref_database.$xref_module_native.this.$method_position_table = value;
        }

        public SubLObject setField7(SubLObject value) {
            return com.cyc.cycjava.cycl.xref_database.$xref_module_native.this.$method_method_table = value;
        }

        public SubLObject setField8(SubLObject value) {
            return com.cyc.cycjava.cycl.xref_database.$xref_module_native.this.$method_global_reference_table = value;
        }

        public SubLObject setField9(SubLObject value) {
            return com.cyc.cycjava.cycl.xref_database.$xref_module_native.this.$method_global_modification_table = value;
        }

        public SubLObject setField10(SubLObject value) {
            return com.cyc.cycjava.cycl.xref_database.$xref_module_native.this.$method_global_binding_table = value;
        }

        public SubLObject setField11(SubLObject value) {
            return com.cyc.cycjava.cycl.xref_database.$xref_module_native.this.$global_definitions = value;
        }

        public SubLObject setField12(SubLObject value) {
            return com.cyc.cycjava.cycl.xref_database.$xref_module_native.this.$global_position_table = value;
        }

        public SubLObject setField13(SubLObject value) {
            return com.cyc.cycjava.cycl.xref_database.$xref_module_native.this.$global_method_table = value;
        }

        public SubLObject setField14(SubLObject value) {
            return com.cyc.cycjava.cycl.xref_database.$xref_module_native.this.$global_global_reference_table = value;
        }

        public SubLObject setField15(SubLObject value) {
            return com.cyc.cycjava.cycl.xref_database.$xref_module_native.this.$top_method_table = value;
        }

        public SubLObject setField16(SubLObject value) {
            return com.cyc.cycjava.cycl.xref_database.$xref_module_native.this.$top_global_reference_table = value;
        }

        public SubLObject setField17(SubLObject value) {
            return com.cyc.cycjava.cycl.xref_database.$xref_module_native.this.$top_global_modification_table = value;
        }

        public SubLObject setField18(SubLObject value) {
            return com.cyc.cycjava.cycl.xref_database.$xref_module_native.this.$top_global_binding_table = value;
        }

        public SubLObject setField19(SubLObject value) {
            return com.cyc.cycjava.cycl.xref_database.$xref_module_native.this.$method_formal_arglist_table = value;
        }

        public SubLObject setField20(SubLObject value) {
            return com.cyc.cycjava.cycl.xref_database.$xref_module_native.this.$global_binding_type_table = value;
        }

        public SubLObject $name = Lisp.NIL;

        public SubLObject $xref_system = Lisp.NIL;

        public SubLObject $features = Lisp.NIL;

        public SubLObject $method_definitions = Lisp.NIL;

        public SubLObject $method_position_table = Lisp.NIL;

        public SubLObject $method_method_table = Lisp.NIL;

        public SubLObject $method_global_reference_table = Lisp.NIL;

        public SubLObject $method_global_modification_table = Lisp.NIL;

        public SubLObject $method_global_binding_table = Lisp.NIL;

        public SubLObject $global_definitions = Lisp.NIL;

        public SubLObject $global_position_table = Lisp.NIL;

        public SubLObject $global_method_table = Lisp.NIL;

        public SubLObject $global_global_reference_table = Lisp.NIL;

        public SubLObject $top_method_table = Lisp.NIL;

        public SubLObject $top_global_reference_table = Lisp.NIL;

        public SubLObject $top_global_modification_table = Lisp.NIL;

        public SubLObject $top_global_binding_table = Lisp.NIL;

        public SubLObject $method_formal_arglist_table = Lisp.NIL;

        public SubLObject $global_binding_type_table = Lisp.NIL;

        private static final SubLStructDeclNative structDecl = makeStructDeclNative(com.cyc.cycjava.cycl.xref_database.$xref_module_native.class, XREF_MODULE, XREF_MODULE_P, $list_alt2, $list_alt3, new String[]{ "$name", "$xref_system", "$features", "$method_definitions", "$method_position_table", "$method_method_table", "$method_global_reference_table", "$method_global_modification_table", "$method_global_binding_table", "$global_definitions", "$global_position_table", "$global_method_table", "$global_global_reference_table", "$top_method_table", "$top_global_reference_table", "$top_global_modification_table", "$top_global_binding_table", "$method_formal_arglist_table", "$global_binding_type_table" }, $list_alt4, $list_alt5, PRINT_XREF_MODULE);
    }

    public static final SubLFile me = new xref_database();



    // deflexical
    // Definitions
    @LispMethod(comment = "deflexical")
    public static final SubLSymbol $empty_set_contents$ = makeSymbol("*EMPTY-SET-CONTENTS*");

    // defconstant
    @LispMethod(comment = "defconstant")
    public static final SubLSymbol $dtp_xref_module$ = makeSymbol("*DTP-XREF-MODULE*");

    // defconstant
    @LispMethod(comment = "defconstant")
    public static final SubLSymbol $dtp_xref_system$ = makeSymbol("*DTP-XREF-SYSTEM*");

    // defvar
    // When T, trace the progress of translation.
    /**
     * When T, trace the progress of translation.
     */
    @LispMethod(comment = "When T, trace the progress of translation.\ndefvar")
    public static final SubLSymbol $xref_trace$ = makeSymbol("*XREF-TRACE*");

    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    private static final SubLSymbol XREF_MODULE = makeSymbol("XREF-MODULE");

    private static final SubLSymbol XREF_MODULE_P = makeSymbol("XREF-MODULE-P");

    static private final SubLList $list2 = list(new SubLObject[]{ makeSymbol("NAME"), makeSymbol("XREF-SYSTEM"), makeSymbol("FEATURES"), makeSymbol("METHOD-DEFINITIONS"), makeSymbol("METHOD-POSITION-TABLE"), makeSymbol("METHOD-METHOD-TABLE"), makeSymbol("METHOD-GLOBAL-REFERENCE-TABLE"), makeSymbol("METHOD-GLOBAL-MODIFICATION-TABLE"), makeSymbol("METHOD-GLOBAL-BINDING-TABLE"), makeSymbol("GLOBAL-DEFINITIONS"), makeSymbol("GLOBAL-POSITION-TABLE"), makeSymbol("GLOBAL-METHOD-TABLE"), makeSymbol("GLOBAL-GLOBAL-REFERENCE-TABLE"), makeSymbol("TOP-METHOD-TABLE"), makeSymbol("TOP-GLOBAL-REFERENCE-TABLE"), makeSymbol("TOP-GLOBAL-MODIFICATION-TABLE"), makeSymbol("TOP-GLOBAL-BINDING-TABLE"), makeSymbol("METHOD-FORMAL-ARGLIST-TABLE"), makeSymbol("GLOBAL-BINDING-TYPE-TABLE") });

    static private final SubLList $list3 = list(new SubLObject[]{ $NAME, makeKeyword("XREF-SYSTEM"), makeKeyword("FEATURES"), makeKeyword("METHOD-DEFINITIONS"), makeKeyword("METHOD-POSITION-TABLE"), makeKeyword("METHOD-METHOD-TABLE"), makeKeyword("METHOD-GLOBAL-REFERENCE-TABLE"), makeKeyword("METHOD-GLOBAL-MODIFICATION-TABLE"), makeKeyword("METHOD-GLOBAL-BINDING-TABLE"), makeKeyword("GLOBAL-DEFINITIONS"), makeKeyword("GLOBAL-POSITION-TABLE"), makeKeyword("GLOBAL-METHOD-TABLE"), makeKeyword("GLOBAL-GLOBAL-REFERENCE-TABLE"), makeKeyword("TOP-METHOD-TABLE"), makeKeyword("TOP-GLOBAL-REFERENCE-TABLE"), makeKeyword("TOP-GLOBAL-MODIFICATION-TABLE"), makeKeyword("TOP-GLOBAL-BINDING-TABLE"), makeKeyword("METHOD-FORMAL-ARGLIST-TABLE"), makeKeyword("GLOBAL-BINDING-TYPE-TABLE") });

    static private final SubLList $list4 = list(new SubLObject[]{ makeSymbol("XREF-M-NAME"), makeSymbol("XREF-M-XREF-SYSTEM"), makeSymbol("XREF-M-FEATURES"), makeSymbol("XREF-M-METHOD-DEFINITIONS"), makeSymbol("XREF-M-METHOD-POSITION-TABLE"), makeSymbol("XREF-M-METHOD-METHOD-TABLE"), makeSymbol("XREF-M-METHOD-GLOBAL-REFERENCE-TABLE"), makeSymbol("XREF-M-METHOD-GLOBAL-MODIFICATION-TABLE"), makeSymbol("XREF-M-METHOD-GLOBAL-BINDING-TABLE"), makeSymbol("XREF-M-GLOBAL-DEFINITIONS"), makeSymbol("XREF-M-GLOBAL-POSITION-TABLE"), makeSymbol("XREF-M-GLOBAL-METHOD-TABLE"), makeSymbol("XREF-M-GLOBAL-GLOBAL-REFERENCE-TABLE"), makeSymbol("XREF-M-TOP-METHOD-TABLE"), makeSymbol("XREF-M-TOP-GLOBAL-REFERENCE-TABLE"), makeSymbol("XREF-M-TOP-GLOBAL-MODIFICATION-TABLE"), makeSymbol("XREF-M-TOP-GLOBAL-BINDING-TABLE"), makeSymbol("XREF-M-METHOD-FORMAL-ARGLIST-TABLE"), makeSymbol("XREF-M-GLOBAL-BINDING-TYPE-TABLE") });

    static private final SubLList $list5 = list(new SubLObject[]{ makeSymbol("_CSETF-XREF-M-NAME"), makeSymbol("_CSETF-XREF-M-XREF-SYSTEM"), makeSymbol("_CSETF-XREF-M-FEATURES"), makeSymbol("_CSETF-XREF-M-METHOD-DEFINITIONS"), makeSymbol("_CSETF-XREF-M-METHOD-POSITION-TABLE"), makeSymbol("_CSETF-XREF-M-METHOD-METHOD-TABLE"), makeSymbol("_CSETF-XREF-M-METHOD-GLOBAL-REFERENCE-TABLE"), makeSymbol("_CSETF-XREF-M-METHOD-GLOBAL-MODIFICATION-TABLE"), makeSymbol("_CSETF-XREF-M-METHOD-GLOBAL-BINDING-TABLE"), makeSymbol("_CSETF-XREF-M-GLOBAL-DEFINITIONS"), makeSymbol("_CSETF-XREF-M-GLOBAL-POSITION-TABLE"), makeSymbol("_CSETF-XREF-M-GLOBAL-METHOD-TABLE"), makeSymbol("_CSETF-XREF-M-GLOBAL-GLOBAL-REFERENCE-TABLE"), makeSymbol("_CSETF-XREF-M-TOP-METHOD-TABLE"), makeSymbol("_CSETF-XREF-M-TOP-GLOBAL-REFERENCE-TABLE"), makeSymbol("_CSETF-XREF-M-TOP-GLOBAL-MODIFICATION-TABLE"), makeSymbol("_CSETF-XREF-M-TOP-GLOBAL-BINDING-TABLE"), makeSymbol("_CSETF-XREF-M-METHOD-FORMAL-ARGLIST-TABLE"), makeSymbol("_CSETF-XREF-M-GLOBAL-BINDING-TYPE-TABLE") });

    private static final SubLSymbol PRINT_XREF_MODULE = makeSymbol("PRINT-XREF-MODULE");

    private static final SubLSymbol XREF_MODULE_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("XREF-MODULE-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLList $list8 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("XREF-MODULE-P"));

    private static final SubLSymbol XREF_M_NAME = makeSymbol("XREF-M-NAME");

    private static final SubLSymbol _CSETF_XREF_M_NAME = makeSymbol("_CSETF-XREF-M-NAME");

    private static final SubLSymbol XREF_M_XREF_SYSTEM = makeSymbol("XREF-M-XREF-SYSTEM");

    private static final SubLSymbol _CSETF_XREF_M_XREF_SYSTEM = makeSymbol("_CSETF-XREF-M-XREF-SYSTEM");

    private static final SubLSymbol XREF_M_FEATURES = makeSymbol("XREF-M-FEATURES");

    private static final SubLSymbol _CSETF_XREF_M_FEATURES = makeSymbol("_CSETF-XREF-M-FEATURES");

    private static final SubLSymbol XREF_M_METHOD_DEFINITIONS = makeSymbol("XREF-M-METHOD-DEFINITIONS");

    private static final SubLSymbol _CSETF_XREF_M_METHOD_DEFINITIONS = makeSymbol("_CSETF-XREF-M-METHOD-DEFINITIONS");

    private static final SubLSymbol XREF_M_METHOD_POSITION_TABLE = makeSymbol("XREF-M-METHOD-POSITION-TABLE");

    private static final SubLSymbol _CSETF_XREF_M_METHOD_POSITION_TABLE = makeSymbol("_CSETF-XREF-M-METHOD-POSITION-TABLE");

    private static final SubLSymbol XREF_M_METHOD_METHOD_TABLE = makeSymbol("XREF-M-METHOD-METHOD-TABLE");

    private static final SubLSymbol _CSETF_XREF_M_METHOD_METHOD_TABLE = makeSymbol("_CSETF-XREF-M-METHOD-METHOD-TABLE");

    private static final SubLSymbol XREF_M_METHOD_GLOBAL_REFERENCE_TABLE = makeSymbol("XREF-M-METHOD-GLOBAL-REFERENCE-TABLE");

    private static final SubLSymbol _CSETF_XREF_M_METHOD_GLOBAL_REFERENCE_TABLE = makeSymbol("_CSETF-XREF-M-METHOD-GLOBAL-REFERENCE-TABLE");

    private static final SubLSymbol XREF_M_METHOD_GLOBAL_MODIFICATION_TABLE = makeSymbol("XREF-M-METHOD-GLOBAL-MODIFICATION-TABLE");

    private static final SubLSymbol _CSETF_XREF_M_METHOD_GLOBAL_MODIFICATION_TABLE = makeSymbol("_CSETF-XREF-M-METHOD-GLOBAL-MODIFICATION-TABLE");

    private static final SubLSymbol XREF_M_METHOD_GLOBAL_BINDING_TABLE = makeSymbol("XREF-M-METHOD-GLOBAL-BINDING-TABLE");

    private static final SubLSymbol _CSETF_XREF_M_METHOD_GLOBAL_BINDING_TABLE = makeSymbol("_CSETF-XREF-M-METHOD-GLOBAL-BINDING-TABLE");

    private static final SubLSymbol XREF_M_GLOBAL_DEFINITIONS = makeSymbol("XREF-M-GLOBAL-DEFINITIONS");

    private static final SubLSymbol _CSETF_XREF_M_GLOBAL_DEFINITIONS = makeSymbol("_CSETF-XREF-M-GLOBAL-DEFINITIONS");

    private static final SubLSymbol XREF_M_GLOBAL_POSITION_TABLE = makeSymbol("XREF-M-GLOBAL-POSITION-TABLE");

    private static final SubLSymbol _CSETF_XREF_M_GLOBAL_POSITION_TABLE = makeSymbol("_CSETF-XREF-M-GLOBAL-POSITION-TABLE");

    private static final SubLSymbol XREF_M_GLOBAL_METHOD_TABLE = makeSymbol("XREF-M-GLOBAL-METHOD-TABLE");

    private static final SubLSymbol _CSETF_XREF_M_GLOBAL_METHOD_TABLE = makeSymbol("_CSETF-XREF-M-GLOBAL-METHOD-TABLE");

    private static final SubLSymbol XREF_M_GLOBAL_GLOBAL_REFERENCE_TABLE = makeSymbol("XREF-M-GLOBAL-GLOBAL-REFERENCE-TABLE");

    private static final SubLSymbol _CSETF_XREF_M_GLOBAL_GLOBAL_REFERENCE_TABLE = makeSymbol("_CSETF-XREF-M-GLOBAL-GLOBAL-REFERENCE-TABLE");

    private static final SubLSymbol XREF_M_TOP_METHOD_TABLE = makeSymbol("XREF-M-TOP-METHOD-TABLE");

    private static final SubLSymbol _CSETF_XREF_M_TOP_METHOD_TABLE = makeSymbol("_CSETF-XREF-M-TOP-METHOD-TABLE");

    private static final SubLSymbol XREF_M_TOP_GLOBAL_REFERENCE_TABLE = makeSymbol("XREF-M-TOP-GLOBAL-REFERENCE-TABLE");

    private static final SubLSymbol _CSETF_XREF_M_TOP_GLOBAL_REFERENCE_TABLE = makeSymbol("_CSETF-XREF-M-TOP-GLOBAL-REFERENCE-TABLE");

    private static final SubLSymbol XREF_M_TOP_GLOBAL_MODIFICATION_TABLE = makeSymbol("XREF-M-TOP-GLOBAL-MODIFICATION-TABLE");

    private static final SubLSymbol _CSETF_XREF_M_TOP_GLOBAL_MODIFICATION_TABLE = makeSymbol("_CSETF-XREF-M-TOP-GLOBAL-MODIFICATION-TABLE");

    private static final SubLSymbol XREF_M_TOP_GLOBAL_BINDING_TABLE = makeSymbol("XREF-M-TOP-GLOBAL-BINDING-TABLE");

    private static final SubLSymbol _CSETF_XREF_M_TOP_GLOBAL_BINDING_TABLE = makeSymbol("_CSETF-XREF-M-TOP-GLOBAL-BINDING-TABLE");

    private static final SubLSymbol XREF_M_METHOD_FORMAL_ARGLIST_TABLE = makeSymbol("XREF-M-METHOD-FORMAL-ARGLIST-TABLE");

    private static final SubLSymbol _CSETF_XREF_M_METHOD_FORMAL_ARGLIST_TABLE = makeSymbol("_CSETF-XREF-M-METHOD-FORMAL-ARGLIST-TABLE");

    private static final SubLSymbol XREF_M_GLOBAL_BINDING_TYPE_TABLE = makeSymbol("XREF-M-GLOBAL-BINDING-TYPE-TABLE");

    private static final SubLSymbol _CSETF_XREF_M_GLOBAL_BINDING_TYPE_TABLE = makeSymbol("_CSETF-XREF-M-GLOBAL-BINDING-TYPE-TABLE");

    private static final SubLSymbol $METHOD_POSITION_TABLE = makeKeyword("METHOD-POSITION-TABLE");

    private static final SubLSymbol $METHOD_METHOD_TABLE = makeKeyword("METHOD-METHOD-TABLE");

    private static final SubLSymbol $METHOD_GLOBAL_REFERENCE_TABLE = makeKeyword("METHOD-GLOBAL-REFERENCE-TABLE");

    private static final SubLSymbol $METHOD_GLOBAL_MODIFICATION_TABLE = makeKeyword("METHOD-GLOBAL-MODIFICATION-TABLE");

    private static final SubLSymbol $METHOD_GLOBAL_BINDING_TABLE = makeKeyword("METHOD-GLOBAL-BINDING-TABLE");

    private static final SubLSymbol $GLOBAL_POSITION_TABLE = makeKeyword("GLOBAL-POSITION-TABLE");

    private static final SubLSymbol $GLOBAL_METHOD_TABLE = makeKeyword("GLOBAL-METHOD-TABLE");

    private static final SubLSymbol $GLOBAL_GLOBAL_REFERENCE_TABLE = makeKeyword("GLOBAL-GLOBAL-REFERENCE-TABLE");

    private static final SubLSymbol $TOP_METHOD_TABLE = makeKeyword("TOP-METHOD-TABLE");

    private static final SubLSymbol $TOP_GLOBAL_REFERENCE_TABLE = makeKeyword("TOP-GLOBAL-REFERENCE-TABLE");

    private static final SubLSymbol $TOP_GLOBAL_MODIFICATION_TABLE = makeKeyword("TOP-GLOBAL-MODIFICATION-TABLE");

    private static final SubLSymbol $TOP_GLOBAL_BINDING_TABLE = makeKeyword("TOP-GLOBAL-BINDING-TABLE");

    private static final SubLSymbol $METHOD_FORMAL_ARGLIST_TABLE = makeKeyword("METHOD-FORMAL-ARGLIST-TABLE");

    private static final SubLSymbol $GLOBAL_BINDING_TYPE_TABLE = makeKeyword("GLOBAL-BINDING-TYPE-TABLE");

    private static final SubLString $str66$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");

    private static final SubLSymbol MAKE_XREF_MODULE = makeSymbol("MAKE-XREF-MODULE");

    private static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_XREF_MODULE_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-XREF-MODULE-METHOD");

    private static final SubLString $str72$_A____S_methods___S_globals = makeString("~A : ~S methods, ~S globals");

    private static final SubLSymbol SXHASH_XREF_MODULE_METHOD = makeSymbol("SXHASH-XREF-MODULE-METHOD");

    private static final SubLSymbol XREF_SYSTEM_P = makeSymbol("XREF-SYSTEM-P");

    private static final SubLList $list78 = list(list(makeSymbol("METHOD"), makeSymbol("XRM"), makeSymbol("&KEY"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLList $list79 = list($DONE);

    private static final SubLSymbol $ALLOW_OTHER_KEYS = makeKeyword("ALLOW-OTHER-KEYS");

    private static final SubLSymbol $sym82$XRM_VAR = makeUninternedSymbol("XRM-VAR");

    private static final SubLSymbol $sym83$DEFINITION = makeUninternedSymbol("DEFINITION");

    private static final SubLSymbol $sym84$POSITION = makeUninternedSymbol("POSITION");

    private static final SubLSymbol XRM_METHOD_DEFINITIONS = makeSymbol("XRM-METHOD-DEFINITIONS");

    private static final SubLSymbol DO_XRM_METHOD_DEFINITIONS = makeSymbol("DO-XRM-METHOD-DEFINITIONS");

    private static final SubLSymbol $sym91$XRM_VAR = makeUninternedSymbol("XRM-VAR");

    private static final SubLSymbol $sym92$POSITION = makeUninternedSymbol("POSITION");

    private static final SubLSymbol XRM_METHOD_POSITION_TABLE = makeSymbol("XRM-METHOD-POSITION-TABLE");

    private static final SubLSymbol DO_XRM_METHODS = makeSymbol("DO-XRM-METHODS");

    private static final SubLList $list96 = list(list(makeSymbol("GLOBAL"), makeSymbol("XRM"), makeSymbol("&KEY"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLSymbol $sym97$XRM_VAR = makeUninternedSymbol("XRM-VAR");

    private static final SubLSymbol $sym98$DEFINITION = makeUninternedSymbol("DEFINITION");

    private static final SubLSymbol $sym99$POSITION = makeUninternedSymbol("POSITION");

    private static final SubLSymbol XRM_GLOBAL_DEFINITIONS = makeSymbol("XRM-GLOBAL-DEFINITIONS");

    private static final SubLSymbol DO_XRM_GLOBAL_DEFINITIONS = makeSymbol("DO-XRM-GLOBAL-DEFINITIONS");

    private static final SubLSymbol $sym102$XRM_VAR = makeUninternedSymbol("XRM-VAR");

    private static final SubLSymbol $sym103$POSITION = makeUninternedSymbol("POSITION");

    private static final SubLSymbol XRM_GLOBAL_POSITION_TABLE = makeSymbol("XRM-GLOBAL-POSITION-TABLE");

    private static final SubLSymbol DO_XRM_GLOBALS = makeSymbol("DO-XRM-GLOBALS");

    private static final SubLList $list107 = cons(makeSymbol("CANDIDATE-METHOD"), makeSymbol("POSITION"));

    private static final SubLList $list108 = cons(makeSymbol("CANDIDATE-GLOBAL"), makeSymbol("POSITION"));

    private static final SubLSymbol BINDING_TYPE_P = makeSymbol("BINDING-TYPE-P");

    private static final SubLSymbol XREF_SYSTEM = makeSymbol("XREF-SYSTEM");

    static private final SubLList $list114 = list(new SubLObject[]{ makeSymbol("NAME"), makeSymbol("FEATURES"), makeSymbol("XREF-MODULE-TABLE"), makeSymbol("METHOD-DEFINITION-TABLE"), makeSymbol("GLOBAL-DEFINITION-TABLE"), makeSymbol("METHOD-CALLED-BY-METHOD-TABLE"), makeSymbol("METHOD-CALLED-BY-GLOBAL-TABLE"), makeSymbol("METHOD-CALLED-AT-TOP-LEVEL-TABLE"), makeSymbol("GLOBAL-REFERENCED-BY-METHOD-TABLE"), makeSymbol("GLOBAL-MODIFIED-BY-METHOD-TABLE"), makeSymbol("GLOBAL-REBOUND-BY-METHOD-TABLE"), makeSymbol("GLOBAL-REFERENCED-BY-GLOBAL-TABLE"), makeSymbol("GLOBAL-REFERENCED-AT-TOP-LEVEL-TABLE"), makeSymbol("GLOBAL-MODIFIED-AT-TOP-LEVEL-TABLE"), makeSymbol("GLOBAL-REBOUND-AT-TOP-LEVEL-TABLE") });

    private static final SubLList $list115 = list(new SubLObject[]{ $NAME, makeKeyword("FEATURES"), makeKeyword("XREF-MODULE-TABLE"), makeKeyword("METHOD-DEFINITION-TABLE"), makeKeyword("GLOBAL-DEFINITION-TABLE"), makeKeyword("METHOD-CALLED-BY-METHOD-TABLE"), makeKeyword("METHOD-CALLED-BY-GLOBAL-TABLE"), makeKeyword("METHOD-CALLED-AT-TOP-LEVEL-TABLE"), makeKeyword("GLOBAL-REFERENCED-BY-METHOD-TABLE"), makeKeyword("GLOBAL-MODIFIED-BY-METHOD-TABLE"), makeKeyword("GLOBAL-REBOUND-BY-METHOD-TABLE"), makeKeyword("GLOBAL-REFERENCED-BY-GLOBAL-TABLE"), makeKeyword("GLOBAL-REFERENCED-AT-TOP-LEVEL-TABLE"), makeKeyword("GLOBAL-MODIFIED-AT-TOP-LEVEL-TABLE"), makeKeyword("GLOBAL-REBOUND-AT-TOP-LEVEL-TABLE") });

    private static final SubLList $list116 = list(new SubLObject[]{ makeSymbol("XREF-S-NAME"), makeSymbol("XREF-S-FEATURES"), makeSymbol("XREF-S-XREF-MODULE-TABLE"), makeSymbol("XREF-S-METHOD-DEFINITION-TABLE"), makeSymbol("XREF-S-GLOBAL-DEFINITION-TABLE"), makeSymbol("XREF-S-METHOD-CALLED-BY-METHOD-TABLE"), makeSymbol("XREF-S-METHOD-CALLED-BY-GLOBAL-TABLE"), makeSymbol("XREF-S-METHOD-CALLED-AT-TOP-LEVEL-TABLE"), makeSymbol("XREF-S-GLOBAL-REFERENCED-BY-METHOD-TABLE"), makeSymbol("XREF-S-GLOBAL-MODIFIED-BY-METHOD-TABLE"), makeSymbol("XREF-S-GLOBAL-REBOUND-BY-METHOD-TABLE"), makeSymbol("XREF-S-GLOBAL-REFERENCED-BY-GLOBAL-TABLE"), makeSymbol("XREF-S-GLOBAL-REFERENCED-AT-TOP-LEVEL-TABLE"), makeSymbol("XREF-S-GLOBAL-MODIFIED-AT-TOP-LEVEL-TABLE"), makeSymbol("XREF-S-GLOBAL-REBOUND-AT-TOP-LEVEL-TABLE") });

    private static final SubLList $list117 = list(new SubLObject[]{ makeSymbol("_CSETF-XREF-S-NAME"), makeSymbol("_CSETF-XREF-S-FEATURES"), makeSymbol("_CSETF-XREF-S-XREF-MODULE-TABLE"), makeSymbol("_CSETF-XREF-S-METHOD-DEFINITION-TABLE"), makeSymbol("_CSETF-XREF-S-GLOBAL-DEFINITION-TABLE"), makeSymbol("_CSETF-XREF-S-METHOD-CALLED-BY-METHOD-TABLE"), makeSymbol("_CSETF-XREF-S-METHOD-CALLED-BY-GLOBAL-TABLE"), makeSymbol("_CSETF-XREF-S-METHOD-CALLED-AT-TOP-LEVEL-TABLE"), makeSymbol("_CSETF-XREF-S-GLOBAL-REFERENCED-BY-METHOD-TABLE"), makeSymbol("_CSETF-XREF-S-GLOBAL-MODIFIED-BY-METHOD-TABLE"), makeSymbol("_CSETF-XREF-S-GLOBAL-REBOUND-BY-METHOD-TABLE"), makeSymbol("_CSETF-XREF-S-GLOBAL-REFERENCED-BY-GLOBAL-TABLE"), makeSymbol("_CSETF-XREF-S-GLOBAL-REFERENCED-AT-TOP-LEVEL-TABLE"), makeSymbol("_CSETF-XREF-S-GLOBAL-MODIFIED-AT-TOP-LEVEL-TABLE"), makeSymbol("_CSETF-XREF-S-GLOBAL-REBOUND-AT-TOP-LEVEL-TABLE") });

    private static final SubLSymbol PRINT_XREF_SYSTEM = makeSymbol("PRINT-XREF-SYSTEM");

    private static final SubLSymbol XREF_SYSTEM_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("XREF-SYSTEM-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLList $list120 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("XREF-SYSTEM-P"));

    private static final SubLSymbol XREF_S_NAME = makeSymbol("XREF-S-NAME");

    private static final SubLSymbol _CSETF_XREF_S_NAME = makeSymbol("_CSETF-XREF-S-NAME");

    private static final SubLSymbol XREF_S_FEATURES = makeSymbol("XREF-S-FEATURES");

    private static final SubLSymbol _CSETF_XREF_S_FEATURES = makeSymbol("_CSETF-XREF-S-FEATURES");

    private static final SubLSymbol XREF_S_XREF_MODULE_TABLE = makeSymbol("XREF-S-XREF-MODULE-TABLE");

    private static final SubLSymbol _CSETF_XREF_S_XREF_MODULE_TABLE = makeSymbol("_CSETF-XREF-S-XREF-MODULE-TABLE");

    private static final SubLSymbol XREF_S_METHOD_DEFINITION_TABLE = makeSymbol("XREF-S-METHOD-DEFINITION-TABLE");

    private static final SubLSymbol _CSETF_XREF_S_METHOD_DEFINITION_TABLE = makeSymbol("_CSETF-XREF-S-METHOD-DEFINITION-TABLE");

    private static final SubLSymbol XREF_S_GLOBAL_DEFINITION_TABLE = makeSymbol("XREF-S-GLOBAL-DEFINITION-TABLE");

    private static final SubLSymbol _CSETF_XREF_S_GLOBAL_DEFINITION_TABLE = makeSymbol("_CSETF-XREF-S-GLOBAL-DEFINITION-TABLE");

    private static final SubLSymbol XREF_S_METHOD_CALLED_BY_METHOD_TABLE = makeSymbol("XREF-S-METHOD-CALLED-BY-METHOD-TABLE");

    private static final SubLSymbol _CSETF_XREF_S_METHOD_CALLED_BY_METHOD_TABLE = makeSymbol("_CSETF-XREF-S-METHOD-CALLED-BY-METHOD-TABLE");

    private static final SubLSymbol XREF_S_METHOD_CALLED_BY_GLOBAL_TABLE = makeSymbol("XREF-S-METHOD-CALLED-BY-GLOBAL-TABLE");

    private static final SubLSymbol _CSETF_XREF_S_METHOD_CALLED_BY_GLOBAL_TABLE = makeSymbol("_CSETF-XREF-S-METHOD-CALLED-BY-GLOBAL-TABLE");

    private static final SubLSymbol XREF_S_METHOD_CALLED_AT_TOP_LEVEL_TABLE = makeSymbol("XREF-S-METHOD-CALLED-AT-TOP-LEVEL-TABLE");

    private static final SubLSymbol _CSETF_XREF_S_METHOD_CALLED_AT_TOP_LEVEL_TABLE = makeSymbol("_CSETF-XREF-S-METHOD-CALLED-AT-TOP-LEVEL-TABLE");

    private static final SubLSymbol XREF_S_GLOBAL_REFERENCED_BY_METHOD_TABLE = makeSymbol("XREF-S-GLOBAL-REFERENCED-BY-METHOD-TABLE");

    private static final SubLSymbol _CSETF_XREF_S_GLOBAL_REFERENCED_BY_METHOD_TABLE = makeSymbol("_CSETF-XREF-S-GLOBAL-REFERENCED-BY-METHOD-TABLE");

    private static final SubLSymbol XREF_S_GLOBAL_MODIFIED_BY_METHOD_TABLE = makeSymbol("XREF-S-GLOBAL-MODIFIED-BY-METHOD-TABLE");

    private static final SubLSymbol _CSETF_XREF_S_GLOBAL_MODIFIED_BY_METHOD_TABLE = makeSymbol("_CSETF-XREF-S-GLOBAL-MODIFIED-BY-METHOD-TABLE");

    private static final SubLSymbol XREF_S_GLOBAL_REBOUND_BY_METHOD_TABLE = makeSymbol("XREF-S-GLOBAL-REBOUND-BY-METHOD-TABLE");

    private static final SubLSymbol _CSETF_XREF_S_GLOBAL_REBOUND_BY_METHOD_TABLE = makeSymbol("_CSETF-XREF-S-GLOBAL-REBOUND-BY-METHOD-TABLE");

    private static final SubLSymbol XREF_S_GLOBAL_REFERENCED_BY_GLOBAL_TABLE = makeSymbol("XREF-S-GLOBAL-REFERENCED-BY-GLOBAL-TABLE");

    private static final SubLSymbol _CSETF_XREF_S_GLOBAL_REFERENCED_BY_GLOBAL_TABLE = makeSymbol("_CSETF-XREF-S-GLOBAL-REFERENCED-BY-GLOBAL-TABLE");

    private static final SubLSymbol XREF_S_GLOBAL_REFERENCED_AT_TOP_LEVEL_TABLE = makeSymbol("XREF-S-GLOBAL-REFERENCED-AT-TOP-LEVEL-TABLE");

    private static final SubLSymbol _CSETF_XREF_S_GLOBAL_REFERENCED_AT_TOP_LEVEL_TABLE = makeSymbol("_CSETF-XREF-S-GLOBAL-REFERENCED-AT-TOP-LEVEL-TABLE");

    private static final SubLSymbol XREF_S_GLOBAL_MODIFIED_AT_TOP_LEVEL_TABLE = makeSymbol("XREF-S-GLOBAL-MODIFIED-AT-TOP-LEVEL-TABLE");

    private static final SubLSymbol _CSETF_XREF_S_GLOBAL_MODIFIED_AT_TOP_LEVEL_TABLE = makeSymbol("_CSETF-XREF-S-GLOBAL-MODIFIED-AT-TOP-LEVEL-TABLE");

    private static final SubLSymbol XREF_S_GLOBAL_REBOUND_AT_TOP_LEVEL_TABLE = makeSymbol("XREF-S-GLOBAL-REBOUND-AT-TOP-LEVEL-TABLE");

    private static final SubLSymbol _CSETF_XREF_S_GLOBAL_REBOUND_AT_TOP_LEVEL_TABLE = makeSymbol("_CSETF-XREF-S-GLOBAL-REBOUND-AT-TOP-LEVEL-TABLE");

    private static final SubLSymbol $XREF_MODULE_TABLE = makeKeyword("XREF-MODULE-TABLE");

    private static final SubLSymbol $METHOD_DEFINITION_TABLE = makeKeyword("METHOD-DEFINITION-TABLE");

    private static final SubLSymbol $GLOBAL_DEFINITION_TABLE = makeKeyword("GLOBAL-DEFINITION-TABLE");

    private static final SubLSymbol $METHOD_CALLED_BY_METHOD_TABLE = makeKeyword("METHOD-CALLED-BY-METHOD-TABLE");

    private static final SubLSymbol $METHOD_CALLED_BY_GLOBAL_TABLE = makeKeyword("METHOD-CALLED-BY-GLOBAL-TABLE");

    private static final SubLSymbol $METHOD_CALLED_AT_TOP_LEVEL_TABLE = makeKeyword("METHOD-CALLED-AT-TOP-LEVEL-TABLE");

    private static final SubLSymbol $GLOBAL_REFERENCED_BY_METHOD_TABLE = makeKeyword("GLOBAL-REFERENCED-BY-METHOD-TABLE");

    private static final SubLSymbol $GLOBAL_MODIFIED_BY_METHOD_TABLE = makeKeyword("GLOBAL-MODIFIED-BY-METHOD-TABLE");

    private static final SubLSymbol $GLOBAL_REBOUND_BY_METHOD_TABLE = makeKeyword("GLOBAL-REBOUND-BY-METHOD-TABLE");

    private static final SubLSymbol $GLOBAL_REFERENCED_BY_GLOBAL_TABLE = makeKeyword("GLOBAL-REFERENCED-BY-GLOBAL-TABLE");

    private static final SubLSymbol $GLOBAL_REFERENCED_AT_TOP_LEVEL_TABLE = makeKeyword("GLOBAL-REFERENCED-AT-TOP-LEVEL-TABLE");

    private static final SubLSymbol $GLOBAL_MODIFIED_AT_TOP_LEVEL_TABLE = makeKeyword("GLOBAL-MODIFIED-AT-TOP-LEVEL-TABLE");

    private static final SubLSymbol $GLOBAL_REBOUND_AT_TOP_LEVEL_TABLE = makeKeyword("GLOBAL-REBOUND-AT-TOP-LEVEL-TABLE");

    private static final SubLSymbol MAKE_XREF_SYSTEM = makeSymbol("MAKE-XREF-SYSTEM");

    private static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_XREF_SYSTEM_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-XREF-SYSTEM-METHOD");

    private static final SubLString $str166$_A____S_features___S_modules = makeString("~A : ~S features, ~S modules");

    private static final SubLInteger $int$10000 = makeInteger(10000);

    private static final SubLInteger $int$500 = makeInteger(500);

    private static final SubLString $str170$Module__A_features_changed_to__S = makeString("Module ~A features changed to ~S");

    private static final SubLString $str173$Unexpected_backend__S = makeString("Unexpected backend ~S");

    private static final SubLSymbol XRM_NAME = makeSymbol("XRM-NAME");

    private static final SubLSymbol XREF_METHOD_POTENTIALLY_PRIVATE_P = makeSymbol("XREF-METHOD-POTENTIALLY-PRIVATE-P");

    private static final SubLSymbol XREF_GLOBAL_POTENTIALLY_PRIVATE_P = makeSymbol("XREF-GLOBAL-POTENTIALLY-PRIVATE-P");

    private static final SubLSymbol CODE_COMMENT = makeSymbol("CODE-COMMENT");

    private static final SubLString $str182$_subl_ = makeString("@subl ");

    private static final SubLString $$$_ = makeString(" ");

    private static final SubLSymbol XREF_MODULE_RELATIVE_INPUT_FILENAME = makeSymbol("XREF-MODULE-RELATIVE-INPUT-FILENAME");

    private static final SubLList $list185 = list(list(makeSymbol("&KEY"), makeSymbol("NAME"), makeSymbol("FEATURES")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLList $list186 = list($NAME, makeKeyword("FEATURES"));

    private static final SubLSymbol $sym187$SYSTEM_VAR = makeUninternedSymbol("SYSTEM-VAR");

    private static final SubLSymbol $sym188$MODULE_VAR = makeUninternedSymbol("MODULE-VAR");

    private static final SubLList $list189 = list(list(makeSymbol("CURRENT-XREF-SYSTEM")));

    private static final SubLSymbol NEW_XREF_MODULE = makeSymbol("NEW-XREF-MODULE");

    public static final SubLSymbol $current_xref_module$ = makeSymbol("*CURRENT-XREF-MODULE*");

    private static final SubLSymbol XRS_MERGE_XREF_MODULE = makeSymbol("XRS-MERGE-XREF-MODULE");

    private static final SubLList $list195 = list(makeSymbol("XRM"), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLList $list196 = list(list(makeSymbol("CURRENT-XREF-MODULE")));

    private static final SubLSymbol CURRENT_XREF_MODULE = makeSymbol("CURRENT-XREF-MODULE");

    private static final SubLSymbol WITH_CURRENT_XREF_MODULE = makeSymbol("WITH-CURRENT-XREF-MODULE");

    static private final SubLList $list199 = list(makeSymbol("MODULE-NAME"), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLSymbol $sym200$NAME_VAR = makeUninternedSymbol("NAME-VAR");

    private static final SubLList $list202 = list(makeSymbol("STRINGP"));

    public static final SubLSymbol $xref_module_scope$ = makeSymbol("*XREF-MODULE-SCOPE*");

    private static final SubLList $list204 = list(makeSymbol("FILE-POSITION"), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLSymbol $sym205$POSITION_VAR = makeUninternedSymbol("POSITION-VAR");

    private static final SubLList $list206 = list(makeSymbol("NON-NEGATIVE-INTEGER-P"));

    public static final SubLSymbol $xref_file_position_scope$ = makeSymbol("*XREF-FILE-POSITION-SCOPE*");

    private static final SubLList $list208 = list(makeSymbol("NAME"), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLSymbol XREF_WITHIN_METHOD = makeSymbol("XREF-WITHIN-METHOD");

    private static final SubLList $list210 = list(makeSymbol("METHOD"), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLSymbol $sym211$METHOD_VAR = makeUninternedSymbol("METHOD-VAR");

    private static final SubLList $list212 = list(makeSymbol("SYMBOLP"));

    public static final SubLSymbol $xref_method_scope$ = makeSymbol("*XREF-METHOD-SCOPE*");

    private static final SubLList $list214 = list(makeSymbol("GLOBAL"), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLSymbol $sym215$GLOBAL_VAR = makeUninternedSymbol("GLOBAL-VAR");

    public static final SubLSymbol $xref_global_scope$ = makeSymbol("*XREF-GLOBAL-SCOPE*");

    private static final SubLString $str220$___def_glob____S = makeString("~% def glob : ~S");

    private static final SubLString $str221$___defmacro____S = makeString("~% defmacro : ~S");

    private static final SubLString $str222$___define______S = makeString("~% define   : ~S");

    private static final SubLString $str223$____arglist____S = makeString("~%  arglist : ~S");

    private static final SubLString $str224$____binding_type____S = makeString("~%  binding-type : ~S");

    private static final SubLString $str225$____ref_glob_____S = makeString("~%  ref glob  : ~S");

    private static final SubLString $str226$____mod_glob_____S = makeString("~%  mod glob  : ~S");

    private static final SubLString $str227$Initializer_for__S_modifies__S = makeString("Initializer for ~S modifies ~S");

    private static final SubLString $str228$____bind_glob_____S = makeString("~%  bind glob  : ~S");

    private static final SubLString $str229$Initializer_for__S_rebinds__S = makeString("Initializer for ~S rebinds ~S");

    private static final SubLString $str230$____macro_use____S = makeString("~%  macro use : ~S");

    private static final SubLString $str231$____fun_call_____S = makeString("~%  fun call  : ~S");

    private static final SubLString $str232$__module_removed_____A = makeString("~%module removed  : ~A");

    private static final SubLSymbol $sym235$_ = makeSymbol("<");

    private static final SubLSymbol XREF_GLOBAL_ACCESS_COUNT = makeSymbol("XREF-GLOBAL-ACCESS-COUNT");

    private static final SubLSymbol XREF_METHOD_CALL_COUNT = makeSymbol("XREF-METHOD-CALL-COUNT");

    public static final SubLObject xref_module_print_function_trampoline_alt(SubLObject v_object, SubLObject stream) {
        print_xref_module(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject xref_module_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        print_xref_module(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject xref_module_p_alt(SubLObject v_object) {
        return v_object.getClass() == com.cyc.cycjava.cycl.xref_database.$xref_module_native.class ? ((SubLObject) (T)) : NIL;
    }

    public static SubLObject xref_module_p(final SubLObject v_object) {
        return v_object.getClass() == com.cyc.cycjava.cycl.xref_database.$xref_module_native.class ? T : NIL;
    }

    public static final SubLObject xref_m_name_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, XREF_MODULE_P);
        return v_object.getField2();
    }

    public static SubLObject xref_m_name(final SubLObject v_object) {
        assert NIL != xref_module_p(v_object) : "! xref_database.xref_module_p(v_object) " + "xref_database.xref_module_p error :" + v_object;
        return v_object.getField2();
    }

    public static final SubLObject xref_m_xref_system_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, XREF_MODULE_P);
        return v_object.getField3();
    }

    public static SubLObject xref_m_xref_system(final SubLObject v_object) {
        assert NIL != xref_module_p(v_object) : "! xref_database.xref_module_p(v_object) " + "xref_database.xref_module_p error :" + v_object;
        return v_object.getField3();
    }

    public static final SubLObject xref_m_features_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, XREF_MODULE_P);
        return v_object.getField4();
    }

    public static SubLObject xref_m_features(final SubLObject v_object) {
        assert NIL != xref_module_p(v_object) : "! xref_database.xref_module_p(v_object) " + "xref_database.xref_module_p error :" + v_object;
        return v_object.getField4();
    }

    public static final SubLObject xref_m_method_definitions_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, XREF_MODULE_P);
        return v_object.getField5();
    }

    public static SubLObject xref_m_method_definitions(final SubLObject v_object) {
        assert NIL != xref_module_p(v_object) : "! xref_database.xref_module_p(v_object) " + "xref_database.xref_module_p error :" + v_object;
        return v_object.getField5();
    }

    public static final SubLObject xref_m_method_position_table_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, XREF_MODULE_P);
        return v_object.getField6();
    }

    public static SubLObject xref_m_method_position_table(final SubLObject v_object) {
        assert NIL != xref_module_p(v_object) : "! xref_database.xref_module_p(v_object) " + "xref_database.xref_module_p error :" + v_object;
        return v_object.getField6();
    }

    public static final SubLObject xref_m_method_method_table_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, XREF_MODULE_P);
        return v_object.getField7();
    }

    public static SubLObject xref_m_method_method_table(final SubLObject v_object) {
        assert NIL != xref_module_p(v_object) : "! xref_database.xref_module_p(v_object) " + "xref_database.xref_module_p error :" + v_object;
        return v_object.getField7();
    }

    public static final SubLObject xref_m_method_global_reference_table_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, XREF_MODULE_P);
        return v_object.getField8();
    }

    public static SubLObject xref_m_method_global_reference_table(final SubLObject v_object) {
        assert NIL != xref_module_p(v_object) : "! xref_database.xref_module_p(v_object) " + "xref_database.xref_module_p error :" + v_object;
        return v_object.getField8();
    }

    public static final SubLObject xref_m_method_global_modification_table_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, XREF_MODULE_P);
        return v_object.getField9();
    }

    public static SubLObject xref_m_method_global_modification_table(final SubLObject v_object) {
        assert NIL != xref_module_p(v_object) : "! xref_database.xref_module_p(v_object) " + "xref_database.xref_module_p error :" + v_object;
        return v_object.getField9();
    }

    public static final SubLObject xref_m_method_global_binding_table_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, XREF_MODULE_P);
        return v_object.getField10();
    }

    public static SubLObject xref_m_method_global_binding_table(final SubLObject v_object) {
        assert NIL != xref_module_p(v_object) : "! xref_database.xref_module_p(v_object) " + "xref_database.xref_module_p error :" + v_object;
        return v_object.getField10();
    }

    public static final SubLObject xref_m_global_definitions_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, XREF_MODULE_P);
        return v_object.getField11();
    }

    public static SubLObject xref_m_global_definitions(final SubLObject v_object) {
        assert NIL != xref_module_p(v_object) : "! xref_database.xref_module_p(v_object) " + "xref_database.xref_module_p error :" + v_object;
        return v_object.getField11();
    }

    public static final SubLObject xref_m_global_position_table_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, XREF_MODULE_P);
        return v_object.getField12();
    }

    public static SubLObject xref_m_global_position_table(final SubLObject v_object) {
        assert NIL != xref_module_p(v_object) : "! xref_database.xref_module_p(v_object) " + "xref_database.xref_module_p error :" + v_object;
        return v_object.getField12();
    }

    public static final SubLObject xref_m_global_method_table_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, XREF_MODULE_P);
        return v_object.getField13();
    }

    public static SubLObject xref_m_global_method_table(final SubLObject v_object) {
        assert NIL != xref_module_p(v_object) : "! xref_database.xref_module_p(v_object) " + "xref_database.xref_module_p error :" + v_object;
        return v_object.getField13();
    }

    public static final SubLObject xref_m_global_global_reference_table_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, XREF_MODULE_P);
        return v_object.getField14();
    }

    public static SubLObject xref_m_global_global_reference_table(final SubLObject v_object) {
        assert NIL != xref_module_p(v_object) : "! xref_database.xref_module_p(v_object) " + "xref_database.xref_module_p error :" + v_object;
        return v_object.getField14();
    }

    public static final SubLObject xref_m_top_method_table_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, XREF_MODULE_P);
        return v_object.getField15();
    }

    public static SubLObject xref_m_top_method_table(final SubLObject v_object) {
        assert NIL != xref_module_p(v_object) : "! xref_database.xref_module_p(v_object) " + "xref_database.xref_module_p error :" + v_object;
        return v_object.getField15();
    }

    public static final SubLObject xref_m_top_global_reference_table_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, XREF_MODULE_P);
        return v_object.getField16();
    }

    public static SubLObject xref_m_top_global_reference_table(final SubLObject v_object) {
        assert NIL != xref_module_p(v_object) : "! xref_database.xref_module_p(v_object) " + "xref_database.xref_module_p error :" + v_object;
        return v_object.getField16();
    }

    public static final SubLObject xref_m_top_global_modification_table_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, XREF_MODULE_P);
        return v_object.getField17();
    }

    public static SubLObject xref_m_top_global_modification_table(final SubLObject v_object) {
        assert NIL != xref_module_p(v_object) : "! xref_database.xref_module_p(v_object) " + "xref_database.xref_module_p error :" + v_object;
        return v_object.getField17();
    }

    public static final SubLObject xref_m_top_global_binding_table_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, XREF_MODULE_P);
        return v_object.getField18();
    }

    public static SubLObject xref_m_top_global_binding_table(final SubLObject v_object) {
        assert NIL != xref_module_p(v_object) : "! xref_database.xref_module_p(v_object) " + "xref_database.xref_module_p error :" + v_object;
        return v_object.getField18();
    }

    public static final SubLObject xref_m_method_formal_arglist_table_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, XREF_MODULE_P);
        return v_object.getField19();
    }

    public static SubLObject xref_m_method_formal_arglist_table(final SubLObject v_object) {
        assert NIL != xref_module_p(v_object) : "! xref_database.xref_module_p(v_object) " + "xref_database.xref_module_p error :" + v_object;
        return v_object.getField19();
    }

    public static final SubLObject xref_m_global_binding_type_table_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, XREF_MODULE_P);
        return v_object.getField20();
    }

    public static SubLObject xref_m_global_binding_type_table(final SubLObject v_object) {
        assert NIL != xref_module_p(v_object) : "! xref_database.xref_module_p(v_object) " + "xref_database.xref_module_p error :" + v_object;
        return v_object.getField20();
    }

    public static final SubLObject _csetf_xref_m_name_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, XREF_MODULE_P);
        return v_object.setField2(value);
    }

    public static SubLObject _csetf_xref_m_name(final SubLObject v_object, final SubLObject value) {
        assert NIL != xref_module_p(v_object) : "! xref_database.xref_module_p(v_object) " + "xref_database.xref_module_p error :" + v_object;
        return v_object.setField2(value);
    }

    public static final SubLObject _csetf_xref_m_xref_system_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, XREF_MODULE_P);
        return v_object.setField3(value);
    }

    public static SubLObject _csetf_xref_m_xref_system(final SubLObject v_object, final SubLObject value) {
        assert NIL != xref_module_p(v_object) : "! xref_database.xref_module_p(v_object) " + "xref_database.xref_module_p error :" + v_object;
        return v_object.setField3(value);
    }

    public static final SubLObject _csetf_xref_m_features_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, XREF_MODULE_P);
        return v_object.setField4(value);
    }

    public static SubLObject _csetf_xref_m_features(final SubLObject v_object, final SubLObject value) {
        assert NIL != xref_module_p(v_object) : "! xref_database.xref_module_p(v_object) " + "xref_database.xref_module_p error :" + v_object;
        return v_object.setField4(value);
    }

    public static final SubLObject _csetf_xref_m_method_definitions_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, XREF_MODULE_P);
        return v_object.setField5(value);
    }

    public static SubLObject _csetf_xref_m_method_definitions(final SubLObject v_object, final SubLObject value) {
        assert NIL != xref_module_p(v_object) : "! xref_database.xref_module_p(v_object) " + "xref_database.xref_module_p error :" + v_object;
        return v_object.setField5(value);
    }

    public static final SubLObject _csetf_xref_m_method_position_table_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, XREF_MODULE_P);
        return v_object.setField6(value);
    }

    public static SubLObject _csetf_xref_m_method_position_table(final SubLObject v_object, final SubLObject value) {
        assert NIL != xref_module_p(v_object) : "! xref_database.xref_module_p(v_object) " + "xref_database.xref_module_p error :" + v_object;
        return v_object.setField6(value);
    }

    public static final SubLObject _csetf_xref_m_method_method_table_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, XREF_MODULE_P);
        return v_object.setField7(value);
    }

    public static SubLObject _csetf_xref_m_method_method_table(final SubLObject v_object, final SubLObject value) {
        assert NIL != xref_module_p(v_object) : "! xref_database.xref_module_p(v_object) " + "xref_database.xref_module_p error :" + v_object;
        return v_object.setField7(value);
    }

    public static final SubLObject _csetf_xref_m_method_global_reference_table_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, XREF_MODULE_P);
        return v_object.setField8(value);
    }

    public static SubLObject _csetf_xref_m_method_global_reference_table(final SubLObject v_object, final SubLObject value) {
        assert NIL != xref_module_p(v_object) : "! xref_database.xref_module_p(v_object) " + "xref_database.xref_module_p error :" + v_object;
        return v_object.setField8(value);
    }

    public static final SubLObject _csetf_xref_m_method_global_modification_table_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, XREF_MODULE_P);
        return v_object.setField9(value);
    }

    public static SubLObject _csetf_xref_m_method_global_modification_table(final SubLObject v_object, final SubLObject value) {
        assert NIL != xref_module_p(v_object) : "! xref_database.xref_module_p(v_object) " + "xref_database.xref_module_p error :" + v_object;
        return v_object.setField9(value);
    }

    public static final SubLObject _csetf_xref_m_method_global_binding_table_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, XREF_MODULE_P);
        return v_object.setField10(value);
    }

    public static SubLObject _csetf_xref_m_method_global_binding_table(final SubLObject v_object, final SubLObject value) {
        assert NIL != xref_module_p(v_object) : "! xref_database.xref_module_p(v_object) " + "xref_database.xref_module_p error :" + v_object;
        return v_object.setField10(value);
    }

    public static final SubLObject _csetf_xref_m_global_definitions_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, XREF_MODULE_P);
        return v_object.setField11(value);
    }

    public static SubLObject _csetf_xref_m_global_definitions(final SubLObject v_object, final SubLObject value) {
        assert NIL != xref_module_p(v_object) : "! xref_database.xref_module_p(v_object) " + "xref_database.xref_module_p error :" + v_object;
        return v_object.setField11(value);
    }

    public static final SubLObject _csetf_xref_m_global_position_table_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, XREF_MODULE_P);
        return v_object.setField12(value);
    }

    public static SubLObject _csetf_xref_m_global_position_table(final SubLObject v_object, final SubLObject value) {
        assert NIL != xref_module_p(v_object) : "! xref_database.xref_module_p(v_object) " + "xref_database.xref_module_p error :" + v_object;
        return v_object.setField12(value);
    }

    public static final SubLObject _csetf_xref_m_global_method_table_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, XREF_MODULE_P);
        return v_object.setField13(value);
    }

    public static SubLObject _csetf_xref_m_global_method_table(final SubLObject v_object, final SubLObject value) {
        assert NIL != xref_module_p(v_object) : "! xref_database.xref_module_p(v_object) " + "xref_database.xref_module_p error :" + v_object;
        return v_object.setField13(value);
    }

    public static final SubLObject _csetf_xref_m_global_global_reference_table_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, XREF_MODULE_P);
        return v_object.setField14(value);
    }

    public static SubLObject _csetf_xref_m_global_global_reference_table(final SubLObject v_object, final SubLObject value) {
        assert NIL != xref_module_p(v_object) : "! xref_database.xref_module_p(v_object) " + "xref_database.xref_module_p error :" + v_object;
        return v_object.setField14(value);
    }

    public static final SubLObject _csetf_xref_m_top_method_table_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, XREF_MODULE_P);
        return v_object.setField15(value);
    }

    public static SubLObject _csetf_xref_m_top_method_table(final SubLObject v_object, final SubLObject value) {
        assert NIL != xref_module_p(v_object) : "! xref_database.xref_module_p(v_object) " + "xref_database.xref_module_p error :" + v_object;
        return v_object.setField15(value);
    }

    public static final SubLObject _csetf_xref_m_top_global_reference_table_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, XREF_MODULE_P);
        return v_object.setField16(value);
    }

    public static SubLObject _csetf_xref_m_top_global_reference_table(final SubLObject v_object, final SubLObject value) {
        assert NIL != xref_module_p(v_object) : "! xref_database.xref_module_p(v_object) " + "xref_database.xref_module_p error :" + v_object;
        return v_object.setField16(value);
    }

    public static final SubLObject _csetf_xref_m_top_global_modification_table_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, XREF_MODULE_P);
        return v_object.setField17(value);
    }

    public static SubLObject _csetf_xref_m_top_global_modification_table(final SubLObject v_object, final SubLObject value) {
        assert NIL != xref_module_p(v_object) : "! xref_database.xref_module_p(v_object) " + "xref_database.xref_module_p error :" + v_object;
        return v_object.setField17(value);
    }

    public static final SubLObject _csetf_xref_m_top_global_binding_table_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, XREF_MODULE_P);
        return v_object.setField18(value);
    }

    public static SubLObject _csetf_xref_m_top_global_binding_table(final SubLObject v_object, final SubLObject value) {
        assert NIL != xref_module_p(v_object) : "! xref_database.xref_module_p(v_object) " + "xref_database.xref_module_p error :" + v_object;
        return v_object.setField18(value);
    }

    public static final SubLObject _csetf_xref_m_method_formal_arglist_table_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, XREF_MODULE_P);
        return v_object.setField19(value);
    }

    public static SubLObject _csetf_xref_m_method_formal_arglist_table(final SubLObject v_object, final SubLObject value) {
        assert NIL != xref_module_p(v_object) : "! xref_database.xref_module_p(v_object) " + "xref_database.xref_module_p error :" + v_object;
        return v_object.setField19(value);
    }

    public static final SubLObject _csetf_xref_m_global_binding_type_table_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, XREF_MODULE_P);
        return v_object.setField20(value);
    }

    public static SubLObject _csetf_xref_m_global_binding_type_table(final SubLObject v_object, final SubLObject value) {
        assert NIL != xref_module_p(v_object) : "! xref_database.xref_module_p(v_object) " + "xref_database.xref_module_p error :" + v_object;
        return v_object.setField20(value);
    }

    public static final SubLObject make_xref_module_alt(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        {
            SubLObject v_new = new com.cyc.cycjava.cycl.xref_database.$xref_module_native();
            SubLObject next = NIL;
            for (next = arglist; NIL != next; next = cddr(next)) {
                {
                    SubLObject current_arg = next.first();
                    SubLObject current_value = cadr(next);
                    SubLObject pcase_var = current_arg;
                    if (pcase_var.eql($NAME)) {
                        _csetf_xref_m_name(v_new, current_value);
                    } else {
                        if (pcase_var.eql($XREF_SYSTEM)) {
                            _csetf_xref_m_xref_system(v_new, current_value);
                        } else {
                            if (pcase_var.eql($FEATURES)) {
                                _csetf_xref_m_features(v_new, current_value);
                            } else {
                                if (pcase_var.eql($METHOD_DEFINITIONS)) {
                                    _csetf_xref_m_method_definitions(v_new, current_value);
                                } else {
                                    if (pcase_var.eql($METHOD_POSITION_TABLE)) {
                                        _csetf_xref_m_method_position_table(v_new, current_value);
                                    } else {
                                        if (pcase_var.eql($METHOD_METHOD_TABLE)) {
                                            _csetf_xref_m_method_method_table(v_new, current_value);
                                        } else {
                                            if (pcase_var.eql($METHOD_GLOBAL_REFERENCE_TABLE)) {
                                                _csetf_xref_m_method_global_reference_table(v_new, current_value);
                                            } else {
                                                if (pcase_var.eql($METHOD_GLOBAL_MODIFICATION_TABLE)) {
                                                    _csetf_xref_m_method_global_modification_table(v_new, current_value);
                                                } else {
                                                    if (pcase_var.eql($METHOD_GLOBAL_BINDING_TABLE)) {
                                                        _csetf_xref_m_method_global_binding_table(v_new, current_value);
                                                    } else {
                                                        if (pcase_var.eql($GLOBAL_DEFINITIONS)) {
                                                            _csetf_xref_m_global_definitions(v_new, current_value);
                                                        } else {
                                                            if (pcase_var.eql($GLOBAL_POSITION_TABLE)) {
                                                                _csetf_xref_m_global_position_table(v_new, current_value);
                                                            } else {
                                                                if (pcase_var.eql($GLOBAL_METHOD_TABLE)) {
                                                                    _csetf_xref_m_global_method_table(v_new, current_value);
                                                                } else {
                                                                    if (pcase_var.eql($GLOBAL_GLOBAL_REFERENCE_TABLE)) {
                                                                        _csetf_xref_m_global_global_reference_table(v_new, current_value);
                                                                    } else {
                                                                        if (pcase_var.eql($TOP_METHOD_TABLE)) {
                                                                            _csetf_xref_m_top_method_table(v_new, current_value);
                                                                        } else {
                                                                            if (pcase_var.eql($TOP_GLOBAL_REFERENCE_TABLE)) {
                                                                                _csetf_xref_m_top_global_reference_table(v_new, current_value);
                                                                            } else {
                                                                                if (pcase_var.eql($TOP_GLOBAL_MODIFICATION_TABLE)) {
                                                                                    _csetf_xref_m_top_global_modification_table(v_new, current_value);
                                                                                } else {
                                                                                    if (pcase_var.eql($TOP_GLOBAL_BINDING_TABLE)) {
                                                                                        _csetf_xref_m_top_global_binding_table(v_new, current_value);
                                                                                    } else {
                                                                                        if (pcase_var.eql($METHOD_FORMAL_ARGLIST_TABLE)) {
                                                                                            _csetf_xref_m_method_formal_arglist_table(v_new, current_value);
                                                                                        } else {
                                                                                            if (pcase_var.eql($GLOBAL_BINDING_TYPE_TABLE)) {
                                                                                                _csetf_xref_m_global_binding_type_table(v_new, current_value);
                                                                                            } else {
                                                                                                Errors.error($str_alt65$Invalid_slot__S_for_construction_, current_arg);
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
                            }
                        }
                    }
                }
            }
            return v_new;
        }
    }

    public static SubLObject make_xref_module(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new com.cyc.cycjava.cycl.xref_database.$xref_module_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
            current_arg = next.first();
            current_value = cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql($NAME)) {
                _csetf_xref_m_name(v_new, current_value);
            } else
                if (pcase_var.eql($XREF_SYSTEM)) {
                    _csetf_xref_m_xref_system(v_new, current_value);
                } else
                    if (pcase_var.eql($FEATURES)) {
                        _csetf_xref_m_features(v_new, current_value);
                    } else
                        if (pcase_var.eql($METHOD_DEFINITIONS)) {
                            _csetf_xref_m_method_definitions(v_new, current_value);
                        } else
                            if (pcase_var.eql($METHOD_POSITION_TABLE)) {
                                _csetf_xref_m_method_position_table(v_new, current_value);
                            } else
                                if (pcase_var.eql($METHOD_METHOD_TABLE)) {
                                    _csetf_xref_m_method_method_table(v_new, current_value);
                                } else
                                    if (pcase_var.eql($METHOD_GLOBAL_REFERENCE_TABLE)) {
                                        _csetf_xref_m_method_global_reference_table(v_new, current_value);
                                    } else
                                        if (pcase_var.eql($METHOD_GLOBAL_MODIFICATION_TABLE)) {
                                            _csetf_xref_m_method_global_modification_table(v_new, current_value);
                                        } else
                                            if (pcase_var.eql($METHOD_GLOBAL_BINDING_TABLE)) {
                                                _csetf_xref_m_method_global_binding_table(v_new, current_value);
                                            } else
                                                if (pcase_var.eql($GLOBAL_DEFINITIONS)) {
                                                    _csetf_xref_m_global_definitions(v_new, current_value);
                                                } else
                                                    if (pcase_var.eql($GLOBAL_POSITION_TABLE)) {
                                                        _csetf_xref_m_global_position_table(v_new, current_value);
                                                    } else
                                                        if (pcase_var.eql($GLOBAL_METHOD_TABLE)) {
                                                            _csetf_xref_m_global_method_table(v_new, current_value);
                                                        } else
                                                            if (pcase_var.eql($GLOBAL_GLOBAL_REFERENCE_TABLE)) {
                                                                _csetf_xref_m_global_global_reference_table(v_new, current_value);
                                                            } else
                                                                if (pcase_var.eql($TOP_METHOD_TABLE)) {
                                                                    _csetf_xref_m_top_method_table(v_new, current_value);
                                                                } else
                                                                    if (pcase_var.eql($TOP_GLOBAL_REFERENCE_TABLE)) {
                                                                        _csetf_xref_m_top_global_reference_table(v_new, current_value);
                                                                    } else
                                                                        if (pcase_var.eql($TOP_GLOBAL_MODIFICATION_TABLE)) {
                                                                            _csetf_xref_m_top_global_modification_table(v_new, current_value);
                                                                        } else
                                                                            if (pcase_var.eql($TOP_GLOBAL_BINDING_TABLE)) {
                                                                                _csetf_xref_m_top_global_binding_table(v_new, current_value);
                                                                            } else
                                                                                if (pcase_var.eql($METHOD_FORMAL_ARGLIST_TABLE)) {
                                                                                    _csetf_xref_m_method_formal_arglist_table(v_new, current_value);
                                                                                } else
                                                                                    if (pcase_var.eql($GLOBAL_BINDING_TYPE_TABLE)) {
                                                                                        _csetf_xref_m_global_binding_type_table(v_new, current_value);
                                                                                    } else {
                                                                                        Errors.error($str66$Invalid_slot__S_for_construction_, current_arg);
                                                                                    }


















        }
        return v_new;
    }

    public static SubLObject visit_defstruct_xref_module(final SubLObject obj, final SubLObject visitor_fn) {
        funcall(visitor_fn, obj, $BEGIN, MAKE_XREF_MODULE, NINETEEN_INTEGER);
        funcall(visitor_fn, obj, $SLOT, $NAME, xref_m_name(obj));
        funcall(visitor_fn, obj, $SLOT, $XREF_SYSTEM, xref_m_xref_system(obj));
        funcall(visitor_fn, obj, $SLOT, $FEATURES, xref_m_features(obj));
        funcall(visitor_fn, obj, $SLOT, $METHOD_DEFINITIONS, xref_m_method_definitions(obj));
        funcall(visitor_fn, obj, $SLOT, $METHOD_POSITION_TABLE, xref_m_method_position_table(obj));
        funcall(visitor_fn, obj, $SLOT, $METHOD_METHOD_TABLE, xref_m_method_method_table(obj));
        funcall(visitor_fn, obj, $SLOT, $METHOD_GLOBAL_REFERENCE_TABLE, xref_m_method_global_reference_table(obj));
        funcall(visitor_fn, obj, $SLOT, $METHOD_GLOBAL_MODIFICATION_TABLE, xref_m_method_global_modification_table(obj));
        funcall(visitor_fn, obj, $SLOT, $METHOD_GLOBAL_BINDING_TABLE, xref_m_method_global_binding_table(obj));
        funcall(visitor_fn, obj, $SLOT, $GLOBAL_DEFINITIONS, xref_m_global_definitions(obj));
        funcall(visitor_fn, obj, $SLOT, $GLOBAL_POSITION_TABLE, xref_m_global_position_table(obj));
        funcall(visitor_fn, obj, $SLOT, $GLOBAL_METHOD_TABLE, xref_m_global_method_table(obj));
        funcall(visitor_fn, obj, $SLOT, $GLOBAL_GLOBAL_REFERENCE_TABLE, xref_m_global_global_reference_table(obj));
        funcall(visitor_fn, obj, $SLOT, $TOP_METHOD_TABLE, xref_m_top_method_table(obj));
        funcall(visitor_fn, obj, $SLOT, $TOP_GLOBAL_REFERENCE_TABLE, xref_m_top_global_reference_table(obj));
        funcall(visitor_fn, obj, $SLOT, $TOP_GLOBAL_MODIFICATION_TABLE, xref_m_top_global_modification_table(obj));
        funcall(visitor_fn, obj, $SLOT, $TOP_GLOBAL_BINDING_TABLE, xref_m_top_global_binding_table(obj));
        funcall(visitor_fn, obj, $SLOT, $METHOD_FORMAL_ARGLIST_TABLE, xref_m_method_formal_arglist_table(obj));
        funcall(visitor_fn, obj, $SLOT, $GLOBAL_BINDING_TYPE_TABLE, xref_m_global_binding_type_table(obj));
        funcall(visitor_fn, obj, $END, MAKE_XREF_MODULE, NINETEEN_INTEGER);
        return obj;
    }

    public static SubLObject visit_defstruct_object_xref_module_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_xref_module(obj, visitor_fn);
    }

    public static final SubLObject print_xref_module_alt(SubLObject v_object, SubLObject stream, SubLObject depth) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != $print_readably$.getDynamicValue(thread)) {
                print_not_readable(v_object, stream);
            } else {
                {
                    SubLObject v_object_1 = v_object;
                    SubLObject stream_2 = stream;
                    write_string($str_alt66$__, stream_2, UNPROVIDED, UNPROVIDED);
                    write(type_of(v_object_1), new SubLObject[]{ $STREAM, stream_2 });
                    write_char(CHAR_space, stream_2);
                    {
                        SubLObject name = xrm_name(v_object);
                        SubLObject module_count = xrm_total_method_count(v_object);
                        SubLObject global_count = xrm_total_global_count(v_object);
                        format(stream, $str_alt68$_A____S_methods___S_globals, new SubLObject[]{ name, module_count, global_count });
                    }
                    write_char(CHAR_space, stream_2);
                    write(pointer(v_object_1), new SubLObject[]{ $STREAM, stream_2, $BASE, SIXTEEN_INTEGER });
                    write_char(CHAR_greater, stream_2);
                }
            }
            return v_object;
        }
    }

    public static SubLObject print_xref_module(final SubLObject v_object, final SubLObject stream, final SubLObject depth) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != $print_readably$.getDynamicValue(thread)) {
            print_not_readable(v_object, stream);
        } else {
            print_macros.print_unreadable_object_preamble(stream, v_object, T, T);
            final SubLObject name = xrm_name(v_object);
            final SubLObject module_count = xrm_total_method_count(v_object);
            final SubLObject global_count = xrm_total_global_count(v_object);
            format(stream, $str72$_A____S_methods___S_globals, new SubLObject[]{ name, module_count, global_count });
            print_macros.print_unreadable_object_postamble(stream, v_object, T, T);
        }
        return v_object;
    }

    public static final SubLObject sxhash_xref_module_method_alt(SubLObject v_object) {
        return Sxhash.sxhash(xref_m_name(v_object));
    }

    public static SubLObject sxhash_xref_module_method(final SubLObject v_object) {
        return Sxhash.sxhash(xref_m_name(v_object));
    }

    public static final SubLObject new_xref_module_alt(SubLObject xref_system, SubLObject name, SubLObject features) {
        SubLTrampolineFile.checkType(name, STRINGP);
        SubLTrampolineFile.checkType(xref_system, XREF_SYSTEM_P);
        {
            SubLObject list_var = features;
            SubLTrampolineFile.checkType(list_var, NON_DOTTED_LIST_P);
            {
                SubLObject cdolist_list_var = list_var;
                SubLObject elem = NIL;
                for (elem = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , elem = cdolist_list_var.first()) {
                    SubLTrampolineFile.checkType(elem, SYMBOLP);
                }
            }
        }
        {
            SubLObject xrm = make_xref_module(UNPROVIDED);
            _csetf_xref_m_name(xrm, name);
            _csetf_xref_m_xref_system(xrm, xref_system);
            _csetf_xref_m_features(xrm, features);
            _csetf_xref_m_method_definitions(xrm, NIL);
            _csetf_xref_m_method_position_table(xrm, dictionary.new_dictionary(symbol_function(EQ), UNPROVIDED));
            _csetf_xref_m_method_method_table(xrm, dictionary.new_dictionary(symbol_function(EQ), UNPROVIDED));
            _csetf_xref_m_method_global_reference_table(xrm, dictionary.new_dictionary(symbol_function(EQ), UNPROVIDED));
            _csetf_xref_m_method_global_modification_table(xrm, dictionary.new_dictionary(symbol_function(EQ), UNPROVIDED));
            _csetf_xref_m_method_global_binding_table(xrm, dictionary.new_dictionary(symbol_function(EQ), UNPROVIDED));
            _csetf_xref_m_global_definitions(xrm, NIL);
            _csetf_xref_m_global_position_table(xrm, dictionary.new_dictionary(symbol_function(EQ), UNPROVIDED));
            _csetf_xref_m_global_method_table(xrm, dictionary.new_dictionary(symbol_function(EQ), UNPROVIDED));
            _csetf_xref_m_global_global_reference_table(xrm, dictionary.new_dictionary(symbol_function(EQ), UNPROVIDED));
            _csetf_xref_m_top_method_table(xrm, dictionary.new_dictionary(symbol_function(EQ), UNPROVIDED));
            _csetf_xref_m_top_global_reference_table(xrm, dictionary.new_dictionary(symbol_function(EQ), UNPROVIDED));
            _csetf_xref_m_top_global_modification_table(xrm, dictionary.new_dictionary(symbol_function(EQ), UNPROVIDED));
            _csetf_xref_m_top_global_binding_table(xrm, dictionary.new_dictionary(symbol_function(EQ), UNPROVIDED));
            _csetf_xref_m_method_formal_arglist_table(xrm, dictionary.new_dictionary(symbol_function(EQ), UNPROVIDED));
            _csetf_xref_m_global_binding_type_table(xrm, dictionary.new_dictionary(symbol_function(EQ), UNPROVIDED));
            return xrm;
        }
    }

    public static SubLObject new_xref_module(final SubLObject xref_system, final SubLObject name, final SubLObject features) {
        assert NIL != stringp(name) : "! stringp(name) " + ("Types.stringp(name) " + "CommonSymbols.NIL != Types.stringp(name) ") + name;
        assert NIL != xref_system_p(xref_system) : "! xref_database.xref_system_p(xref_system) " + ("xref_database.xref_system_p(xref_system) " + "CommonSymbols.NIL != xref_database.xref_system_p(xref_system) ") + xref_system;
        assert NIL != list_utilities.non_dotted_list_p(features) : "! list_utilities.non_dotted_list_p(features) " + ("list_utilities.non_dotted_list_p(features) " + "CommonSymbols.NIL != list_utilities.non_dotted_list_p(features) ") + features;
        SubLObject cdolist_list_var = features;
        SubLObject elem = NIL;
        elem = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            assert NIL != symbolp(elem) : "! symbolp(elem) " + ("Types.symbolp(elem) " + "CommonSymbols.NIL != Types.symbolp(elem) ") + elem;
            cdolist_list_var = cdolist_list_var.rest();
            elem = cdolist_list_var.first();
        } 
        final SubLObject xrm = make_xref_module(UNPROVIDED);
        _csetf_xref_m_name(xrm, name);
        _csetf_xref_m_xref_system(xrm, xref_system);
        _csetf_xref_m_features(xrm, features);
        _csetf_xref_m_method_definitions(xrm, NIL);
        _csetf_xref_m_method_position_table(xrm, dictionary.new_dictionary(symbol_function(EQ), UNPROVIDED));
        _csetf_xref_m_method_method_table(xrm, dictionary.new_dictionary(symbol_function(EQ), UNPROVIDED));
        _csetf_xref_m_method_global_reference_table(xrm, dictionary.new_dictionary(symbol_function(EQ), UNPROVIDED));
        _csetf_xref_m_method_global_modification_table(xrm, dictionary.new_dictionary(symbol_function(EQ), UNPROVIDED));
        _csetf_xref_m_method_global_binding_table(xrm, dictionary.new_dictionary(symbol_function(EQ), UNPROVIDED));
        _csetf_xref_m_global_definitions(xrm, NIL);
        _csetf_xref_m_global_position_table(xrm, dictionary.new_dictionary(symbol_function(EQ), UNPROVIDED));
        _csetf_xref_m_global_method_table(xrm, dictionary.new_dictionary(symbol_function(EQ), UNPROVIDED));
        _csetf_xref_m_global_global_reference_table(xrm, dictionary.new_dictionary(symbol_function(EQ), UNPROVIDED));
        _csetf_xref_m_top_method_table(xrm, dictionary.new_dictionary(symbol_function(EQ), UNPROVIDED));
        _csetf_xref_m_top_global_reference_table(xrm, dictionary.new_dictionary(symbol_function(EQ), UNPROVIDED));
        _csetf_xref_m_top_global_modification_table(xrm, dictionary.new_dictionary(symbol_function(EQ), UNPROVIDED));
        _csetf_xref_m_top_global_binding_table(xrm, dictionary.new_dictionary(symbol_function(EQ), UNPROVIDED));
        _csetf_xref_m_method_formal_arglist_table(xrm, dictionary.new_dictionary(symbol_function(EQ), UNPROVIDED));
        _csetf_xref_m_global_binding_type_table(xrm, dictionary.new_dictionary(symbol_function(EQ), UNPROVIDED));
        return xrm;
    }

    public static final SubLObject do_xrm_method_definitions_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt75);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject method = NIL;
                    SubLObject xrm = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt75);
                    method = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt75);
                    xrm = current.first();
                    current = current.rest();
                    {
                        SubLObject allow_other_keys_p = NIL;
                        SubLObject rest = current;
                        SubLObject bad = NIL;
                        SubLObject current_3 = NIL;
                        for (; NIL != rest;) {
                            destructuring_bind_must_consp(rest, datum, $list_alt75);
                            current_3 = rest.first();
                            rest = rest.rest();
                            destructuring_bind_must_consp(rest, datum, $list_alt75);
                            if (NIL == member(current_3, $list_alt76, UNPROVIDED, UNPROVIDED)) {
                                bad = T;
                            }
                            if (current_3 == $ALLOW_OTHER_KEYS) {
                                allow_other_keys_p = rest.first();
                            }
                            rest = rest.rest();
                        }
                        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                            cdestructuring_bind_error(datum, $list_alt75);
                        }
                        {
                            SubLObject done_tail = property_list_member($DONE, current);
                            SubLObject done = (NIL != done_tail) ? ((SubLObject) (cadr(done_tail))) : NIL;
                            current = temp;
                            {
                                SubLObject body = current;
                                SubLObject xrm_var = $sym79$XRM_VAR;
                                SubLObject definition = $sym80$DEFINITION;
                                SubLObject position = $sym81$POSITION;
                                return list(CLET, list(list(xrm_var, xrm)), list(DO_LIST, list(definition, list(XRM_METHOD_DEFINITIONS, xrm_var), $DONE, done), listS(CDESTRUCTURING_BIND, bq_cons(method, position), definition, list(IGNORE, position), append(body, NIL))));
                            }
                        }
                    }
                }
            }
        }
    }

    public static SubLObject do_xrm_method_definitions(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list78);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject method = NIL;
        SubLObject xrm = NIL;
        destructuring_bind_must_consp(current, datum, $list78);
        method = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list78);
        xrm = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$1 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list78);
            current_$1 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list78);
            if (NIL == member(current_$1, $list79, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$1 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list78);
        }
        final SubLObject done_tail = property_list_member($DONE, current);
        final SubLObject done = (NIL != done_tail) ? cadr(done_tail) : NIL;
        final SubLObject body;
        current = body = temp;
        final SubLObject xrm_var = $sym82$XRM_VAR;
        final SubLObject definition = $sym83$DEFINITION;
        final SubLObject position = $sym84$POSITION;
        return list(CLET, list(list(xrm_var, xrm)), list(DO_LIST, list(definition, list(XRM_METHOD_DEFINITIONS, xrm_var), $DONE, done), listS(CDESTRUCTURING_BIND, bq_cons(method, position), definition, list(IGNORE, position), append(body, NIL))));
    }

    public static final SubLObject xrm_method_definitions_alt(SubLObject xrm) {
        SubLTrampolineFile.checkType(xrm, XREF_MODULE_P);
        return xref_m_method_definitions(xrm);
    }

    public static SubLObject xrm_method_definitions(final SubLObject xrm) {
        assert NIL != xref_module_p(xrm) : "! xref_database.xref_module_p(xrm) " + ("xref_database.xref_module_p(xrm) " + "CommonSymbols.NIL != xref_database.xref_module_p(xrm) ") + xrm;
        return xref_m_method_definitions(xrm);
    }

    public static final SubLObject do_xrm_methods_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt75);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject method = NIL;
                    SubLObject xrm = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt75);
                    method = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt75);
                    xrm = current.first();
                    current = current.rest();
                    {
                        SubLObject allow_other_keys_p = NIL;
                        SubLObject rest = current;
                        SubLObject bad = NIL;
                        SubLObject current_4 = NIL;
                        for (; NIL != rest;) {
                            destructuring_bind_must_consp(rest, datum, $list_alt75);
                            current_4 = rest.first();
                            rest = rest.rest();
                            destructuring_bind_must_consp(rest, datum, $list_alt75);
                            if (NIL == member(current_4, $list_alt76, UNPROVIDED, UNPROVIDED)) {
                                bad = T;
                            }
                            if (current_4 == $ALLOW_OTHER_KEYS) {
                                allow_other_keys_p = rest.first();
                            }
                            rest = rest.rest();
                        }
                        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                            cdestructuring_bind_error(datum, $list_alt75);
                        }
                        {
                            SubLObject done_tail = property_list_member($DONE, current);
                            SubLObject done = (NIL != done_tail) ? ((SubLObject) (cadr(done_tail))) : NIL;
                            current = temp;
                            {
                                SubLObject body = current;
                                SubLObject xrm_var = $sym88$XRM_VAR;
                                SubLObject position = $sym89$POSITION;
                                return list(CLET, list(list(xrm_var, xrm)), listS(DO_DICTIONARY, list(method, position, list(XRM_METHOD_POSITION_TABLE, xrm_var), done), list(IGNORE, position), append(body, NIL)));
                            }
                        }
                    }
                }
            }
        }
    }

    public static SubLObject do_xrm_methods(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list78);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject method = NIL;
        SubLObject xrm = NIL;
        destructuring_bind_must_consp(current, datum, $list78);
        method = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list78);
        xrm = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$2 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list78);
            current_$2 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list78);
            if (NIL == member(current_$2, $list79, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$2 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list78);
        }
        final SubLObject done_tail = property_list_member($DONE, current);
        final SubLObject done = (NIL != done_tail) ? cadr(done_tail) : NIL;
        final SubLObject body;
        current = body = temp;
        final SubLObject xrm_var = $sym91$XRM_VAR;
        final SubLObject position = $sym92$POSITION;
        return list(CLET, list(list(xrm_var, xrm)), listS(DO_DICTIONARY, list(method, position, list(XRM_METHOD_POSITION_TABLE, xrm_var), done), list(IGNORE, position), append(body, NIL)));
    }

    public static final SubLObject xrm_method_position_table_alt(SubLObject xrm) {
        return xref_m_method_position_table(xrm);
    }

    public static SubLObject xrm_method_position_table(final SubLObject xrm) {
        return xref_m_method_position_table(xrm);
    }

    public static final SubLObject do_xrm_global_definitions_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt93);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject global = NIL;
                    SubLObject xrm = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt93);
                    global = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt93);
                    xrm = current.first();
                    current = current.rest();
                    {
                        SubLObject allow_other_keys_p = NIL;
                        SubLObject rest = current;
                        SubLObject bad = NIL;
                        SubLObject current_5 = NIL;
                        for (; NIL != rest;) {
                            destructuring_bind_must_consp(rest, datum, $list_alt93);
                            current_5 = rest.first();
                            rest = rest.rest();
                            destructuring_bind_must_consp(rest, datum, $list_alt93);
                            if (NIL == member(current_5, $list_alt76, UNPROVIDED, UNPROVIDED)) {
                                bad = T;
                            }
                            if (current_5 == $ALLOW_OTHER_KEYS) {
                                allow_other_keys_p = rest.first();
                            }
                            rest = rest.rest();
                        }
                        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                            cdestructuring_bind_error(datum, $list_alt93);
                        }
                        {
                            SubLObject done_tail = property_list_member($DONE, current);
                            SubLObject done = (NIL != done_tail) ? ((SubLObject) (cadr(done_tail))) : NIL;
                            current = temp;
                            {
                                SubLObject body = current;
                                SubLObject xrm_var = $sym94$XRM_VAR;
                                SubLObject definition = $sym95$DEFINITION;
                                SubLObject position = $sym96$POSITION;
                                return list(CLET, list(list(xrm_var, xrm)), list(DO_LIST, list(definition, list(XRM_GLOBAL_DEFINITIONS, xrm_var), $DONE, done), listS(CDESTRUCTURING_BIND, bq_cons(global, position), definition, list(IGNORE, position), append(body, NIL))));
                            }
                        }
                    }
                }
            }
        }
    }

    public static SubLObject do_xrm_global_definitions(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list96);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject global = NIL;
        SubLObject xrm = NIL;
        destructuring_bind_must_consp(current, datum, $list96);
        global = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list96);
        xrm = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$3 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list96);
            current_$3 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list96);
            if (NIL == member(current_$3, $list79, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$3 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list96);
        }
        final SubLObject done_tail = property_list_member($DONE, current);
        final SubLObject done = (NIL != done_tail) ? cadr(done_tail) : NIL;
        final SubLObject body;
        current = body = temp;
        final SubLObject xrm_var = $sym97$XRM_VAR;
        final SubLObject definition = $sym98$DEFINITION;
        final SubLObject position = $sym99$POSITION;
        return list(CLET, list(list(xrm_var, xrm)), list(DO_LIST, list(definition, list(XRM_GLOBAL_DEFINITIONS, xrm_var), $DONE, done), listS(CDESTRUCTURING_BIND, bq_cons(global, position), definition, list(IGNORE, position), append(body, NIL))));
    }

    public static final SubLObject xrm_global_definitions_alt(SubLObject xrm) {
        SubLTrampolineFile.checkType(xrm, XREF_MODULE_P);
        return xref_m_global_definitions(xrm);
    }

    public static SubLObject xrm_global_definitions(final SubLObject xrm) {
        assert NIL != xref_module_p(xrm) : "! xref_database.xref_module_p(xrm) " + ("xref_database.xref_module_p(xrm) " + "CommonSymbols.NIL != xref_database.xref_module_p(xrm) ") + xrm;
        return xref_m_global_definitions(xrm);
    }

    public static final SubLObject do_xrm_globals_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt93);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject global = NIL;
                    SubLObject xrm = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt93);
                    global = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt93);
                    xrm = current.first();
                    current = current.rest();
                    {
                        SubLObject allow_other_keys_p = NIL;
                        SubLObject rest = current;
                        SubLObject bad = NIL;
                        SubLObject current_6 = NIL;
                        for (; NIL != rest;) {
                            destructuring_bind_must_consp(rest, datum, $list_alt93);
                            current_6 = rest.first();
                            rest = rest.rest();
                            destructuring_bind_must_consp(rest, datum, $list_alt93);
                            if (NIL == member(current_6, $list_alt76, UNPROVIDED, UNPROVIDED)) {
                                bad = T;
                            }
                            if (current_6 == $ALLOW_OTHER_KEYS) {
                                allow_other_keys_p = rest.first();
                            }
                            rest = rest.rest();
                        }
                        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                            cdestructuring_bind_error(datum, $list_alt93);
                        }
                        {
                            SubLObject done_tail = property_list_member($DONE, current);
                            SubLObject done = (NIL != done_tail) ? ((SubLObject) (cadr(done_tail))) : NIL;
                            current = temp;
                            {
                                SubLObject body = current;
                                SubLObject xrm_var = $sym99$XRM_VAR;
                                SubLObject position = $sym100$POSITION;
                                return list(CLET, list(list(xrm_var, xrm)), listS(DO_DICTIONARY, list(global, position, list(XRM_GLOBAL_POSITION_TABLE, xrm_var), done), list(IGNORE, position), append(body, NIL)));
                            }
                        }
                    }
                }
            }
        }
    }

    public static SubLObject do_xrm_globals(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list96);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject global = NIL;
        SubLObject xrm = NIL;
        destructuring_bind_must_consp(current, datum, $list96);
        global = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list96);
        xrm = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$4 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list96);
            current_$4 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list96);
            if (NIL == member(current_$4, $list79, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$4 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list96);
        }
        final SubLObject done_tail = property_list_member($DONE, current);
        final SubLObject done = (NIL != done_tail) ? cadr(done_tail) : NIL;
        final SubLObject body;
        current = body = temp;
        final SubLObject xrm_var = $sym102$XRM_VAR;
        final SubLObject position = $sym103$POSITION;
        return list(CLET, list(list(xrm_var, xrm)), listS(DO_DICTIONARY, list(global, position, list(XRM_GLOBAL_POSITION_TABLE, xrm_var), done), list(IGNORE, position), append(body, NIL)));
    }

    public static final SubLObject xrm_global_position_table_alt(SubLObject xrm) {
        return xref_m_global_position_table(xrm);
    }

    public static SubLObject xrm_global_position_table(final SubLObject xrm) {
        return xref_m_global_position_table(xrm);
    }

    public static final SubLObject xrm_name_alt(SubLObject xrm) {
        SubLTrampolineFile.checkType(xrm, XREF_MODULE_P);
        return xref_m_name(xrm);
    }

    public static SubLObject xrm_name(final SubLObject xrm) {
        assert NIL != xref_module_p(xrm) : "! xref_database.xref_module_p(xrm) " + ("xref_database.xref_module_p(xrm) " + "CommonSymbols.NIL != xref_database.xref_module_p(xrm) ") + xrm;
        return xref_m_name(xrm);
    }

    public static final SubLObject xrm_xref_system_alt(SubLObject xrm) {
        SubLTrampolineFile.checkType(xrm, XREF_MODULE_P);
        return xref_m_xref_system(xrm);
    }

    public static SubLObject xrm_xref_system(final SubLObject xrm) {
        assert NIL != xref_module_p(xrm) : "! xref_database.xref_module_p(xrm) " + ("xref_database.xref_module_p(xrm) " + "CommonSymbols.NIL != xref_database.xref_module_p(xrm) ") + xrm;
        return xref_m_xref_system(xrm);
    }

    public static final SubLObject xrm_module_features_alt(SubLObject xrm) {
        SubLTrampolineFile.checkType(xrm, XREF_MODULE_P);
        return xref_m_features(xrm);
    }

    public static SubLObject xrm_module_features(final SubLObject xrm) {
        assert NIL != xref_module_p(xrm) : "! xref_database.xref_module_p(xrm) " + ("xref_database.xref_module_p(xrm) " + "CommonSymbols.NIL != xref_database.xref_module_p(xrm) ") + xrm;
        return xref_m_features(xrm);
    }

    public static final SubLObject xrm_method_definition_count_alt(SubLObject xrm, SubLObject method) {
        SubLTrampolineFile.checkType(xrm, XREF_MODULE_P);
        SubLTrampolineFile.checkType(method, SYMBOLP);
        return count(method, xref_m_method_definitions(xrm), symbol_function(EQ), symbol_function(CAR), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject xrm_method_definition_count(final SubLObject xrm, final SubLObject method) {
        assert NIL != xref_module_p(xrm) : "! xref_database.xref_module_p(xrm) " + ("xref_database.xref_module_p(xrm) " + "CommonSymbols.NIL != xref_database.xref_module_p(xrm) ") + xrm;
        assert NIL != symbolp(method) : "! symbolp(method) " + ("Types.symbolp(method) " + "CommonSymbols.NIL != Types.symbolp(method) ") + method;
        return count(method, xref_m_method_definitions(xrm), symbol_function(EQ), symbol_function(CAR), UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject xrm_total_method_definition_count_alt(SubLObject xrm) {
        SubLTrampolineFile.checkType(xrm, XREF_MODULE_P);
        return length(xref_m_method_definitions(xrm));
    }

    public static SubLObject xrm_total_method_definition_count(final SubLObject xrm) {
        assert NIL != xref_module_p(xrm) : "! xref_database.xref_module_p(xrm) " + ("xref_database.xref_module_p(xrm) " + "CommonSymbols.NIL != xref_database.xref_module_p(xrm) ") + xrm;
        return length(xref_m_method_definitions(xrm));
    }

    public static final SubLObject xrm_total_method_count_alt(SubLObject xrm) {
        SubLTrampolineFile.checkType(xrm, XREF_MODULE_P);
        return dictionary.dictionary_length(xref_m_method_position_table(xrm));
    }

    public static SubLObject xrm_total_method_count(final SubLObject xrm) {
        assert NIL != xref_module_p(xrm) : "! xref_database.xref_module_p(xrm) " + ("xref_database.xref_module_p(xrm) " + "CommonSymbols.NIL != xref_database.xref_module_p(xrm) ") + xrm;
        return dictionary.dictionary_length(xref_m_method_position_table(xrm));
    }

    public static final SubLObject xrm_has_multiple_method_definitionsP_alt(SubLObject xrm) {
        return makeBoolean(!xrm_total_method_definition_count(xrm).numE(xrm_total_method_count(xrm)));
    }

    public static SubLObject xrm_has_multiple_method_definitionsP(final SubLObject xrm) {
        return makeBoolean(!xrm_total_method_definition_count(xrm).numE(xrm_total_method_count(xrm)));
    }

    public static final SubLObject xrm_global_definition_count_alt(SubLObject xrm, SubLObject global) {
        SubLTrampolineFile.checkType(xrm, XREF_MODULE_P);
        SubLTrampolineFile.checkType(global, SYMBOLP);
        return count(global, xref_m_global_definitions(xrm), symbol_function(EQ), symbol_function(CAR), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject xrm_global_definition_count(final SubLObject xrm, final SubLObject global) {
        assert NIL != xref_module_p(xrm) : "! xref_database.xref_module_p(xrm) " + ("xref_database.xref_module_p(xrm) " + "CommonSymbols.NIL != xref_database.xref_module_p(xrm) ") + xrm;
        assert NIL != symbolp(global) : "! symbolp(global) " + ("Types.symbolp(global) " + "CommonSymbols.NIL != Types.symbolp(global) ") + global;
        return count(global, xref_m_global_definitions(xrm), symbol_function(EQ), symbol_function(CAR), UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject xrm_total_global_definition_count_alt(SubLObject xrm) {
        SubLTrampolineFile.checkType(xrm, XREF_MODULE_P);
        return length(xref_m_global_definitions(xrm));
    }

    public static SubLObject xrm_total_global_definition_count(final SubLObject xrm) {
        assert NIL != xref_module_p(xrm) : "! xref_database.xref_module_p(xrm) " + ("xref_database.xref_module_p(xrm) " + "CommonSymbols.NIL != xref_database.xref_module_p(xrm) ") + xrm;
        return length(xref_m_global_definitions(xrm));
    }

    public static final SubLObject xrm_total_global_count_alt(SubLObject xrm) {
        SubLTrampolineFile.checkType(xrm, XREF_MODULE_P);
        return dictionary.dictionary_length(xref_m_global_position_table(xrm));
    }

    public static SubLObject xrm_total_global_count(final SubLObject xrm) {
        assert NIL != xref_module_p(xrm) : "! xref_database.xref_module_p(xrm) " + ("xref_database.xref_module_p(xrm) " + "CommonSymbols.NIL != xref_database.xref_module_p(xrm) ") + xrm;
        return dictionary.dictionary_length(xref_m_global_position_table(xrm));
    }

    public static final SubLObject xrm_has_multiple_global_definitionsP_alt(SubLObject xrm) {
        return makeBoolean(!xrm_total_global_definition_count(xrm).numE(xrm_total_global_count(xrm)));
    }

    public static SubLObject xrm_has_multiple_global_definitionsP(final SubLObject xrm) {
        return makeBoolean(!xrm_total_global_definition_count(xrm).numE(xrm_total_global_count(xrm)));
    }

    public static final SubLObject xrm_method_definition_postion_alt(SubLObject xrm, SubLObject method) {
        SubLTrampolineFile.checkType(xrm, XREF_MODULE_P);
        SubLTrampolineFile.checkType(method, SYMBOLP);
        return dictionary.dictionary_lookup_without_values(xref_m_method_position_table(xrm), method, MINUS_ONE_INTEGER);
    }

    public static SubLObject xrm_method_definition_postion(final SubLObject xrm, final SubLObject method) {
        assert NIL != xref_module_p(xrm) : "! xref_database.xref_module_p(xrm) " + ("xref_database.xref_module_p(xrm) " + "CommonSymbols.NIL != xref_database.xref_module_p(xrm) ") + xrm;
        assert NIL != symbolp(method) : "! symbolp(method) " + ("Types.symbolp(method) " + "CommonSymbols.NIL != Types.symbolp(method) ") + method;
        return dictionary.dictionary_lookup_without_values(xref_m_method_position_table(xrm), method, MINUS_ONE_INTEGER);
    }

    public static final SubLObject xrm_method_definition_positions_alt(SubLObject xrm, SubLObject method) {
        SubLTrampolineFile.checkType(xrm, XREF_MODULE_P);
        SubLTrampolineFile.checkType(method, SYMBOLP);
        {
            SubLObject positions = NIL;
            SubLObject cdolist_list_var = xref_m_method_definitions(xrm);
            SubLObject tuple = NIL;
            for (tuple = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , tuple = cdolist_list_var.first()) {
                {
                    SubLObject datum = tuple;
                    SubLObject current = datum;
                    SubLObject candidate_method = NIL;
                    SubLObject position = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt104);
                    candidate_method = current.first();
                    current = current.rest();
                    position = current;
                    if (candidate_method == method) {
                        positions = cons(position, positions);
                    }
                }
            }
            return nreverse(positions);
        }
    }

    public static SubLObject xrm_method_definition_positions(final SubLObject xrm, final SubLObject method) {
        assert NIL != xref_module_p(xrm) : "! xref_database.xref_module_p(xrm) " + ("xref_database.xref_module_p(xrm) " + "CommonSymbols.NIL != xref_database.xref_module_p(xrm) ") + xrm;
        assert NIL != symbolp(method) : "! symbolp(method) " + ("Types.symbolp(method) " + "CommonSymbols.NIL != Types.symbolp(method) ") + method;
        SubLObject positions = NIL;
        SubLObject cdolist_list_var = xref_m_method_definitions(xrm);
        SubLObject tuple = NIL;
        tuple = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = tuple;
            SubLObject candidate_method = NIL;
            SubLObject position = NIL;
            destructuring_bind_must_consp(current, datum, $list107);
            candidate_method = current.first();
            current = position = current.rest();
            if (candidate_method.eql(method)) {
                positions = cons(position, positions);
            }
            cdolist_list_var = cdolist_list_var.rest();
            tuple = cdolist_list_var.first();
        } 
        return nreverse(positions);
    }

    public static final SubLObject xrm_global_definition_postion_alt(SubLObject xrm, SubLObject global) {
        SubLTrampolineFile.checkType(xrm, XREF_MODULE_P);
        SubLTrampolineFile.checkType(global, SYMBOLP);
        return dictionary.dictionary_lookup_without_values(xref_m_global_position_table(xrm), global, MINUS_ONE_INTEGER);
    }

    public static SubLObject xrm_global_definition_postion(final SubLObject xrm, final SubLObject global) {
        assert NIL != xref_module_p(xrm) : "! xref_database.xref_module_p(xrm) " + ("xref_database.xref_module_p(xrm) " + "CommonSymbols.NIL != xref_database.xref_module_p(xrm) ") + xrm;
        assert NIL != symbolp(global) : "! symbolp(global) " + ("Types.symbolp(global) " + "CommonSymbols.NIL != Types.symbolp(global) ") + global;
        return dictionary.dictionary_lookup_without_values(xref_m_global_position_table(xrm), global, MINUS_ONE_INTEGER);
    }

    public static final SubLObject xrm_global_definition_positions_alt(SubLObject xrm, SubLObject global) {
        SubLTrampolineFile.checkType(xrm, XREF_MODULE_P);
        SubLTrampolineFile.checkType(global, SYMBOLP);
        {
            SubLObject positions = NIL;
            SubLObject cdolist_list_var = xref_m_global_definitions(xrm);
            SubLObject tuple = NIL;
            for (tuple = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , tuple = cdolist_list_var.first()) {
                {
                    SubLObject datum = tuple;
                    SubLObject current = datum;
                    SubLObject candidate_global = NIL;
                    SubLObject position = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt105);
                    candidate_global = current.first();
                    current = current.rest();
                    position = current;
                    if (candidate_global == global) {
                        positions = cons(position, positions);
                    }
                }
            }
            return nreverse(positions);
        }
    }

    public static SubLObject xrm_global_definition_positions(final SubLObject xrm, final SubLObject global) {
        assert NIL != xref_module_p(xrm) : "! xref_database.xref_module_p(xrm) " + ("xref_database.xref_module_p(xrm) " + "CommonSymbols.NIL != xref_database.xref_module_p(xrm) ") + xrm;
        assert NIL != symbolp(global) : "! symbolp(global) " + ("Types.symbolp(global) " + "CommonSymbols.NIL != Types.symbolp(global) ") + global;
        SubLObject positions = NIL;
        SubLObject cdolist_list_var = xref_m_global_definitions(xrm);
        SubLObject tuple = NIL;
        tuple = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = tuple;
            SubLObject candidate_global = NIL;
            SubLObject position = NIL;
            destructuring_bind_must_consp(current, datum, $list108);
            candidate_global = current.first();
            current = position = current.rest();
            if (candidate_global.eql(global)) {
                positions = cons(position, positions);
            }
            cdolist_list_var = cdolist_list_var.rest();
            tuple = cdolist_list_var.first();
        } 
        return nreverse(positions);
    }

    public static final SubLObject xrm_method_formal_arglist_alt(SubLObject xrm, SubLObject method) {
        SubLTrampolineFile.checkType(xrm, XREF_MODULE_P);
        SubLTrampolineFile.checkType(method, SYMBOLP);
        return dictionary.dictionary_lookup_without_values(xref_m_method_formal_arglist_table(xrm), method, $UNSPECIFIED);
    }

    public static SubLObject xrm_method_formal_arglist(final SubLObject xrm, final SubLObject method) {
        assert NIL != xref_module_p(xrm) : "! xref_database.xref_module_p(xrm) " + ("xref_database.xref_module_p(xrm) " + "CommonSymbols.NIL != xref_database.xref_module_p(xrm) ") + xrm;
        assert NIL != symbolp(method) : "! symbolp(method) " + ("Types.symbolp(method) " + "CommonSymbols.NIL != Types.symbolp(method) ") + method;
        return dictionary.dictionary_lookup_without_values(xref_m_method_formal_arglist_table(xrm), method, $UNSPECIFIED);
    }

    public static final SubLObject xrm_global_binding_type_alt(SubLObject xrm, SubLObject global) {
        SubLTrampolineFile.checkType(xrm, XREF_MODULE_P);
        SubLTrampolineFile.checkType(global, SYMBOLP);
        return dictionary.dictionary_lookup_without_values(xref_m_global_binding_type_table(xrm), global, $UNSPECIFIED);
    }

    public static SubLObject xrm_global_binding_type(final SubLObject xrm, final SubLObject global) {
        assert NIL != xref_module_p(xrm) : "! xref_database.xref_module_p(xrm) " + ("xref_database.xref_module_p(xrm) " + "CommonSymbols.NIL != xref_database.xref_module_p(xrm) ") + xrm;
        assert NIL != symbolp(global) : "! symbolp(global) " + ("Types.symbolp(global) " + "CommonSymbols.NIL != Types.symbolp(global) ") + global;
        return dictionary.dictionary_lookup_without_values(xref_m_global_binding_type_table(xrm), global, $UNSPECIFIED);
    }

    public static final SubLObject xrm_record_method_definition_alt(SubLObject xrm, SubLObject method, SubLObject position) {
        SubLTrampolineFile.checkType(xrm, XREF_MODULE_P);
        SubLTrampolineFile.checkType(method, SYMBOLP);
        SubLTrampolineFile.checkType(position, NON_NEGATIVE_INTEGER_P);
        _csetf_xref_m_method_definitions(xrm, cons(cons(method, position), xref_m_method_definitions(xrm)));
        dictionary.dictionary_enter(xrm_method_position_table(xrm), method, position);
        return xrm;
    }

    public static SubLObject xrm_record_method_definition(final SubLObject xrm, final SubLObject method, SubLObject position) {
        assert NIL != xref_module_p(xrm) : "! xref_database.xref_module_p(xrm) " + ("xref_database.xref_module_p(xrm) " + "CommonSymbols.NIL != xref_database.xref_module_p(xrm) ") + xrm;
        assert NIL != symbolp(method) : "! symbolp(method) " + ("Types.symbolp(method) " + "CommonSymbols.NIL != Types.symbolp(method) ") + method;
        assert NIL != subl_promotions.non_negative_integer_p(position) : "! subl_promotions.non_negative_integer_p(position) " + ("subl_promotions.non_negative_integer_p(position) " + "CommonSymbols.NIL != subl_promotions.non_negative_integer_p(position) ") + position;
        _csetf_xref_m_method_definitions(xrm, cons(cons(method, position), xref_m_method_definitions(xrm)));
        dictionary.dictionary_enter(xrm_method_position_table(xrm), method, position);
        return xrm;
    }

    public static final SubLObject xrm_unrecord_method_definition_alt(SubLObject xrm, SubLObject method) {
        SubLTrampolineFile.checkType(xrm, XREF_MODULE_P);
        SubLTrampolineFile.checkType(method, SYMBOLP);
        _csetf_xref_m_method_definitions(xrm, delete(method, xref_m_method_definitions(xrm), symbol_function(EQ), symbol_function(CAR), UNPROVIDED, UNPROVIDED, UNPROVIDED));
        dictionary.dictionary_remove(xrm_method_position_table(xrm), method);
        return xrm;
    }

    public static SubLObject xrm_unrecord_method_definition(final SubLObject xrm, final SubLObject method) {
        assert NIL != xref_module_p(xrm) : "! xref_database.xref_module_p(xrm) " + ("xref_database.xref_module_p(xrm) " + "CommonSymbols.NIL != xref_database.xref_module_p(xrm) ") + xrm;
        assert NIL != symbolp(method) : "! symbolp(method) " + ("Types.symbolp(method) " + "CommonSymbols.NIL != Types.symbolp(method) ") + method;
        _csetf_xref_m_method_definitions(xrm, delete(method, xref_m_method_definitions(xrm), symbol_function(EQ), symbol_function(CAR), UNPROVIDED, UNPROVIDED, UNPROVIDED));
        dictionary.dictionary_remove(xrm_method_position_table(xrm), method);
        return xrm;
    }

    public static final SubLObject xrm_record_method_formal_arglist_alt(SubLObject xrm, SubLObject method, SubLObject formal_arglist) {
        SubLTrampolineFile.checkType(xrm, XREF_MODULE_P);
        SubLTrampolineFile.checkType(method, SYMBOLP);
        SubLTrampolineFile.checkType(formal_arglist, LISTP);
        dictionary.dictionary_enter(xref_m_method_formal_arglist_table(xrm), method, formal_arglist);
        return xrm;
    }

    public static SubLObject xrm_record_method_formal_arglist(final SubLObject xrm, final SubLObject method, final SubLObject formal_arglist) {
        assert NIL != xref_module_p(xrm) : "! xref_database.xref_module_p(xrm) " + ("xref_database.xref_module_p(xrm) " + "CommonSymbols.NIL != xref_database.xref_module_p(xrm) ") + xrm;
        assert NIL != symbolp(method) : "! symbolp(method) " + ("Types.symbolp(method) " + "CommonSymbols.NIL != Types.symbolp(method) ") + method;
        assert NIL != listp(formal_arglist) : "! listp(formal_arglist) " + ("Types.listp(formal_arglist) " + "CommonSymbols.NIL != Types.listp(formal_arglist) ") + formal_arglist;
        dictionary.dictionary_enter(xref_m_method_formal_arglist_table(xrm), method, formal_arglist);
        return xrm;
    }

    public static final SubLObject xrm_record_global_binding_type_alt(SubLObject xrm, SubLObject global, SubLObject binding_type) {
        SubLTrampolineFile.checkType(xrm, XREF_MODULE_P);
        SubLTrampolineFile.checkType(global, SYMBOLP);
        SubLTrampolineFile.checkType(binding_type, BINDING_TYPE_P);
        dictionary.dictionary_enter(xref_m_global_binding_type_table(xrm), global, binding_type);
        return xrm;
    }

    public static SubLObject xrm_record_global_binding_type(final SubLObject xrm, final SubLObject global, final SubLObject binding_type) {
        assert NIL != xref_module_p(xrm) : "! xref_database.xref_module_p(xrm) " + ("xref_database.xref_module_p(xrm) " + "CommonSymbols.NIL != xref_database.xref_module_p(xrm) ") + xrm;
        assert NIL != symbolp(global) : "! symbolp(global) " + ("Types.symbolp(global) " + "CommonSymbols.NIL != Types.symbolp(global) ") + global;
        assert NIL != form_translation.binding_type_p(binding_type) : "! form_translation.binding_type_p(binding_type) " + ("form_translation.binding_type_p(binding_type) " + "CommonSymbols.NIL != form_translation.binding_type_p(binding_type) ") + binding_type;
        dictionary.dictionary_enter(xref_m_global_binding_type_table(xrm), global, binding_type);
        return xrm;
    }

    public static final SubLObject xrm_record_global_definition_alt(SubLObject xrm, SubLObject global, SubLObject position) {
        SubLTrampolineFile.checkType(xrm, XREF_MODULE_P);
        SubLTrampolineFile.checkType(global, SYMBOLP);
        SubLTrampolineFile.checkType(position, NON_NEGATIVE_INTEGER_P);
        _csetf_xref_m_global_definitions(xrm, cons(cons(global, position), xref_m_global_definitions(xrm)));
        dictionary.dictionary_enter(xrm_global_position_table(xrm), global, position);
        return xrm;
    }

    public static SubLObject xrm_record_global_definition(final SubLObject xrm, final SubLObject global, SubLObject position) {
        assert NIL != xref_module_p(xrm) : "! xref_database.xref_module_p(xrm) " + ("xref_database.xref_module_p(xrm) " + "CommonSymbols.NIL != xref_database.xref_module_p(xrm) ") + xrm;
        assert NIL != symbolp(global) : "! symbolp(global) " + ("Types.symbolp(global) " + "CommonSymbols.NIL != Types.symbolp(global) ") + global;
        assert NIL != subl_promotions.non_negative_integer_p(position) : "! subl_promotions.non_negative_integer_p(position) " + ("subl_promotions.non_negative_integer_p(position) " + "CommonSymbols.NIL != subl_promotions.non_negative_integer_p(position) ") + position;
        _csetf_xref_m_global_definitions(xrm, cons(cons(global, position), xref_m_global_definitions(xrm)));
        dictionary.dictionary_enter(xrm_global_position_table(xrm), global, position);
        return xrm;
    }

    public static final SubLObject xrm_unrecord_global_definition_alt(SubLObject xrm, SubLObject global) {
        SubLTrampolineFile.checkType(xrm, XREF_MODULE_P);
        SubLTrampolineFile.checkType(global, SYMBOLP);
        _csetf_xref_m_global_definitions(xrm, delete(global, xref_m_global_definitions(xrm), symbol_function(EQ), symbol_function(CAR), UNPROVIDED, UNPROVIDED, UNPROVIDED));
        dictionary.dictionary_remove(xrm_global_position_table(xrm), global);
        return xrm;
    }

    public static SubLObject xrm_unrecord_global_definition(final SubLObject xrm, final SubLObject global) {
        assert NIL != xref_module_p(xrm) : "! xref_database.xref_module_p(xrm) " + ("xref_database.xref_module_p(xrm) " + "CommonSymbols.NIL != xref_database.xref_module_p(xrm) ") + xrm;
        assert NIL != symbolp(global) : "! symbolp(global) " + ("Types.symbolp(global) " + "CommonSymbols.NIL != Types.symbolp(global) ") + global;
        _csetf_xref_m_global_definitions(xrm, delete(global, xref_m_global_definitions(xrm), symbol_function(EQ), symbol_function(CAR), UNPROVIDED, UNPROVIDED, UNPROVIDED));
        dictionary.dictionary_remove(xrm_global_position_table(xrm), global);
        return xrm;
    }

    public static final SubLObject xrm_record_method_calls_method_alt(SubLObject xrm, SubLObject defined_method, SubLObject referenced_method) {
        SubLTrampolineFile.checkType(xrm, XREF_MODULE_P);
        SubLTrampolineFile.checkType(defined_method, SYMBOLP);
        SubLTrampolineFile.checkType(referenced_method, SYMBOLP);
        dictionary_utilities.dictionary_pushnew(xref_m_method_method_table(xrm), defined_method, referenced_method, symbol_function(EQ), UNPROVIDED);
        return xrm;
    }

    public static SubLObject xrm_record_method_calls_method(final SubLObject xrm, final SubLObject defined_method, final SubLObject referenced_method) {
        assert NIL != xref_module_p(xrm) : "! xref_database.xref_module_p(xrm) " + ("xref_database.xref_module_p(xrm) " + "CommonSymbols.NIL != xref_database.xref_module_p(xrm) ") + xrm;
        assert NIL != symbolp(defined_method) : "! symbolp(defined_method) " + ("Types.symbolp(defined_method) " + "CommonSymbols.NIL != Types.symbolp(defined_method) ") + defined_method;
        assert NIL != symbolp(referenced_method) : "! symbolp(referenced_method) " + ("Types.symbolp(referenced_method) " + "CommonSymbols.NIL != Types.symbolp(referenced_method) ") + referenced_method;
        dictionary_utilities.dictionary_pushnew(xref_m_method_method_table(xrm), defined_method, referenced_method, symbol_function(EQ), UNPROVIDED);
        return xrm;
    }

    public static final SubLObject xrm_record_method_references_global_alt(SubLObject xrm, SubLObject defined_method, SubLObject referenced_global) {
        SubLTrampolineFile.checkType(xrm, XREF_MODULE_P);
        SubLTrampolineFile.checkType(defined_method, SYMBOLP);
        SubLTrampolineFile.checkType(referenced_global, SYMBOLP);
        dictionary_utilities.dictionary_pushnew(xref_m_method_global_reference_table(xrm), defined_method, referenced_global, symbol_function(EQ), UNPROVIDED);
        return xrm;
    }

    public static SubLObject xrm_record_method_references_global(final SubLObject xrm, final SubLObject defined_method, final SubLObject referenced_global) {
        assert NIL != xref_module_p(xrm) : "! xref_database.xref_module_p(xrm) " + ("xref_database.xref_module_p(xrm) " + "CommonSymbols.NIL != xref_database.xref_module_p(xrm) ") + xrm;
        assert NIL != symbolp(defined_method) : "! symbolp(defined_method) " + ("Types.symbolp(defined_method) " + "CommonSymbols.NIL != Types.symbolp(defined_method) ") + defined_method;
        assert NIL != symbolp(referenced_global) : "! symbolp(referenced_global) " + ("Types.symbolp(referenced_global) " + "CommonSymbols.NIL != Types.symbolp(referenced_global) ") + referenced_global;
        dictionary_utilities.dictionary_pushnew(xref_m_method_global_reference_table(xrm), defined_method, referenced_global, symbol_function(EQ), UNPROVIDED);
        return xrm;
    }

    public static final SubLObject xrm_record_method_modifies_global_alt(SubLObject xrm, SubLObject defined_method, SubLObject modified_global) {
        SubLTrampolineFile.checkType(xrm, XREF_MODULE_P);
        SubLTrampolineFile.checkType(defined_method, SYMBOLP);
        SubLTrampolineFile.checkType(modified_global, SYMBOLP);
        dictionary_utilities.dictionary_pushnew(xref_m_method_global_modification_table(xrm), defined_method, modified_global, symbol_function(EQ), UNPROVIDED);
        return xrm;
    }

    public static SubLObject xrm_record_method_modifies_global(final SubLObject xrm, final SubLObject defined_method, final SubLObject modified_global) {
        assert NIL != xref_module_p(xrm) : "! xref_database.xref_module_p(xrm) " + ("xref_database.xref_module_p(xrm) " + "CommonSymbols.NIL != xref_database.xref_module_p(xrm) ") + xrm;
        assert NIL != symbolp(defined_method) : "! symbolp(defined_method) " + ("Types.symbolp(defined_method) " + "CommonSymbols.NIL != Types.symbolp(defined_method) ") + defined_method;
        assert NIL != symbolp(modified_global) : "! symbolp(modified_global) " + ("Types.symbolp(modified_global) " + "CommonSymbols.NIL != Types.symbolp(modified_global) ") + modified_global;
        dictionary_utilities.dictionary_pushnew(xref_m_method_global_modification_table(xrm), defined_method, modified_global, symbol_function(EQ), UNPROVIDED);
        return xrm;
    }

    public static final SubLObject xrm_record_method_rebinds_global_alt(SubLObject xrm, SubLObject defined_method, SubLObject rebound_global) {
        SubLTrampolineFile.checkType(xrm, XREF_MODULE_P);
        SubLTrampolineFile.checkType(defined_method, SYMBOLP);
        SubLTrampolineFile.checkType(rebound_global, SYMBOLP);
        dictionary_utilities.dictionary_pushnew(xref_m_method_global_binding_table(xrm), defined_method, rebound_global, symbol_function(EQ), UNPROVIDED);
        return xrm;
    }

    public static SubLObject xrm_record_method_rebinds_global(final SubLObject xrm, final SubLObject defined_method, final SubLObject rebound_global) {
        assert NIL != xref_module_p(xrm) : "! xref_database.xref_module_p(xrm) " + ("xref_database.xref_module_p(xrm) " + "CommonSymbols.NIL != xref_database.xref_module_p(xrm) ") + xrm;
        assert NIL != symbolp(defined_method) : "! symbolp(defined_method) " + ("Types.symbolp(defined_method) " + "CommonSymbols.NIL != Types.symbolp(defined_method) ") + defined_method;
        assert NIL != symbolp(rebound_global) : "! symbolp(rebound_global) " + ("Types.symbolp(rebound_global) " + "CommonSymbols.NIL != Types.symbolp(rebound_global) ") + rebound_global;
        dictionary_utilities.dictionary_pushnew(xref_m_method_global_binding_table(xrm), defined_method, rebound_global, symbol_function(EQ), UNPROVIDED);
        return xrm;
    }

    public static final SubLObject xrm_record_global_calls_method_alt(SubLObject xrm, SubLObject defined_global, SubLObject referenced_method) {
        SubLTrampolineFile.checkType(xrm, XREF_MODULE_P);
        SubLTrampolineFile.checkType(defined_global, SYMBOLP);
        SubLTrampolineFile.checkType(referenced_method, SYMBOLP);
        dictionary_utilities.dictionary_pushnew(xref_m_global_method_table(xrm), defined_global, referenced_method, symbol_function(EQ), UNPROVIDED);
        return xrm;
    }

    public static SubLObject xrm_record_global_calls_method(final SubLObject xrm, final SubLObject defined_global, final SubLObject referenced_method) {
        assert NIL != xref_module_p(xrm) : "! xref_database.xref_module_p(xrm) " + ("xref_database.xref_module_p(xrm) " + "CommonSymbols.NIL != xref_database.xref_module_p(xrm) ") + xrm;
        assert NIL != symbolp(defined_global) : "! symbolp(defined_global) " + ("Types.symbolp(defined_global) " + "CommonSymbols.NIL != Types.symbolp(defined_global) ") + defined_global;
        assert NIL != symbolp(referenced_method) : "! symbolp(referenced_method) " + ("Types.symbolp(referenced_method) " + "CommonSymbols.NIL != Types.symbolp(referenced_method) ") + referenced_method;
        dictionary_utilities.dictionary_pushnew(xref_m_global_method_table(xrm), defined_global, referenced_method, symbol_function(EQ), UNPROVIDED);
        return xrm;
    }

    public static final SubLObject xrm_record_global_references_global_alt(SubLObject xrm, SubLObject defined_global, SubLObject referenced_global) {
        SubLTrampolineFile.checkType(xrm, XREF_MODULE_P);
        SubLTrampolineFile.checkType(defined_global, SYMBOLP);
        SubLTrampolineFile.checkType(referenced_global, SYMBOLP);
        dictionary_utilities.dictionary_pushnew(xref_m_global_global_reference_table(xrm), defined_global, referenced_global, symbol_function(EQ), UNPROVIDED);
        return xrm;
    }

    public static SubLObject xrm_record_global_references_global(final SubLObject xrm, final SubLObject defined_global, final SubLObject referenced_global) {
        assert NIL != xref_module_p(xrm) : "! xref_database.xref_module_p(xrm) " + ("xref_database.xref_module_p(xrm) " + "CommonSymbols.NIL != xref_database.xref_module_p(xrm) ") + xrm;
        assert NIL != symbolp(defined_global) : "! symbolp(defined_global) " + ("Types.symbolp(defined_global) " + "CommonSymbols.NIL != Types.symbolp(defined_global) ") + defined_global;
        assert NIL != symbolp(referenced_global) : "! symbolp(referenced_global) " + ("Types.symbolp(referenced_global) " + "CommonSymbols.NIL != Types.symbolp(referenced_global) ") + referenced_global;
        dictionary_utilities.dictionary_pushnew(xref_m_global_global_reference_table(xrm), defined_global, referenced_global, symbol_function(EQ), UNPROVIDED);
        return xrm;
    }

    public static final SubLObject xrm_record_top_calls_method_alt(SubLObject xrm, SubLObject referenced_method, SubLObject position) {
        SubLTrampolineFile.checkType(xrm, XREF_MODULE_P);
        SubLTrampolineFile.checkType(referenced_method, SYMBOLP);
        SubLTrampolineFile.checkType(position, NON_NEGATIVE_INTEGER_P);
        {
            SubLObject positions = dictionary.dictionary_lookup_without_values(xref_m_top_method_table(xrm), referenced_method, UNPROVIDED);
            if (!position.eql(positions.first())) {
                positions = cons(position, positions);
                dictionary.dictionary_enter(xref_m_top_method_table(xrm), referenced_method, positions);
            }
        }
        return xrm;
    }

    public static SubLObject xrm_record_top_calls_method(final SubLObject xrm, final SubLObject referenced_method, SubLObject position) {
        assert NIL != xref_module_p(xrm) : "! xref_database.xref_module_p(xrm) " + ("xref_database.xref_module_p(xrm) " + "CommonSymbols.NIL != xref_database.xref_module_p(xrm) ") + xrm;
        assert NIL != symbolp(referenced_method) : "! symbolp(referenced_method) " + ("Types.symbolp(referenced_method) " + "CommonSymbols.NIL != Types.symbolp(referenced_method) ") + referenced_method;
        assert NIL != subl_promotions.non_negative_integer_p(position) : "! subl_promotions.non_negative_integer_p(position) " + ("subl_promotions.non_negative_integer_p(position) " + "CommonSymbols.NIL != subl_promotions.non_negative_integer_p(position) ") + position;
        SubLObject positions = dictionary.dictionary_lookup_without_values(xref_m_top_method_table(xrm), referenced_method, UNPROVIDED);
        if (!position.eql(positions.first())) {
            positions = cons(position, positions);
            dictionary.dictionary_enter(xref_m_top_method_table(xrm), referenced_method, positions);
        }
        return xrm;
    }

    public static final SubLObject xrm_record_top_references_global_alt(SubLObject xrm, SubLObject referenced_global, SubLObject position) {
        SubLTrampolineFile.checkType(xrm, XREF_MODULE_P);
        SubLTrampolineFile.checkType(referenced_global, SYMBOLP);
        SubLTrampolineFile.checkType(position, NON_NEGATIVE_INTEGER_P);
        {
            SubLObject positions = dictionary.dictionary_lookup_without_values(xref_m_top_global_reference_table(xrm), referenced_global, UNPROVIDED);
            if (!position.eql(positions.first())) {
                positions = cons(position, positions);
                dictionary.dictionary_enter(xref_m_top_global_reference_table(xrm), referenced_global, positions);
            }
        }
        return xrm;
    }

    public static SubLObject xrm_record_top_references_global(final SubLObject xrm, final SubLObject referenced_global, SubLObject position) {
        assert NIL != xref_module_p(xrm) : "! xref_database.xref_module_p(xrm) " + ("xref_database.xref_module_p(xrm) " + "CommonSymbols.NIL != xref_database.xref_module_p(xrm) ") + xrm;
        assert NIL != symbolp(referenced_global) : "! symbolp(referenced_global) " + ("Types.symbolp(referenced_global) " + "CommonSymbols.NIL != Types.symbolp(referenced_global) ") + referenced_global;
        assert NIL != subl_promotions.non_negative_integer_p(position) : "! subl_promotions.non_negative_integer_p(position) " + ("subl_promotions.non_negative_integer_p(position) " + "CommonSymbols.NIL != subl_promotions.non_negative_integer_p(position) ") + position;
        SubLObject positions = dictionary.dictionary_lookup_without_values(xref_m_top_global_reference_table(xrm), referenced_global, UNPROVIDED);
        if (!position.eql(positions.first())) {
            positions = cons(position, positions);
            dictionary.dictionary_enter(xref_m_top_global_reference_table(xrm), referenced_global, positions);
        }
        return xrm;
    }

    public static final SubLObject xrm_record_top_modifies_global_alt(SubLObject xrm, SubLObject modified_global, SubLObject position) {
        SubLTrampolineFile.checkType(xrm, XREF_MODULE_P);
        SubLTrampolineFile.checkType(modified_global, SYMBOLP);
        SubLTrampolineFile.checkType(position, NON_NEGATIVE_INTEGER_P);
        {
            SubLObject positions = dictionary.dictionary_lookup_without_values(xref_m_top_global_modification_table(xrm), modified_global, UNPROVIDED);
            if (!position.eql(positions.first())) {
                positions = cons(position, positions);
                dictionary.dictionary_enter(xref_m_top_global_modification_table(xrm), modified_global, positions);
            }
        }
        return xrm;
    }

    public static SubLObject xrm_record_top_modifies_global(final SubLObject xrm, final SubLObject modified_global, SubLObject position) {
        assert NIL != xref_module_p(xrm) : "! xref_database.xref_module_p(xrm) " + ("xref_database.xref_module_p(xrm) " + "CommonSymbols.NIL != xref_database.xref_module_p(xrm) ") + xrm;
        assert NIL != symbolp(modified_global) : "! symbolp(modified_global) " + ("Types.symbolp(modified_global) " + "CommonSymbols.NIL != Types.symbolp(modified_global) ") + modified_global;
        assert NIL != subl_promotions.non_negative_integer_p(position) : "! subl_promotions.non_negative_integer_p(position) " + ("subl_promotions.non_negative_integer_p(position) " + "CommonSymbols.NIL != subl_promotions.non_negative_integer_p(position) ") + position;
        SubLObject positions = dictionary.dictionary_lookup_without_values(xref_m_top_global_modification_table(xrm), modified_global, UNPROVIDED);
        if (!position.eql(positions.first())) {
            positions = cons(position, positions);
            dictionary.dictionary_enter(xref_m_top_global_modification_table(xrm), modified_global, positions);
        }
        return xrm;
    }

    public static final SubLObject xrm_record_top_rebinds_global_alt(SubLObject xrm, SubLObject rebound_global, SubLObject position) {
        SubLTrampolineFile.checkType(xrm, XREF_MODULE_P);
        SubLTrampolineFile.checkType(rebound_global, SYMBOLP);
        SubLTrampolineFile.checkType(position, NON_NEGATIVE_INTEGER_P);
        {
            SubLObject positions = dictionary.dictionary_lookup_without_values(xref_m_top_global_binding_table(xrm), rebound_global, UNPROVIDED);
            if (!position.eql(positions.first())) {
                positions = cons(position, positions);
                dictionary.dictionary_enter(xref_m_top_global_binding_table(xrm), rebound_global, positions);
            }
        }
        return xrm;
    }

    public static SubLObject xrm_record_top_rebinds_global(final SubLObject xrm, final SubLObject rebound_global, SubLObject position) {
        assert NIL != xref_module_p(xrm) : "! xref_database.xref_module_p(xrm) " + ("xref_database.xref_module_p(xrm) " + "CommonSymbols.NIL != xref_database.xref_module_p(xrm) ") + xrm;
        assert NIL != symbolp(rebound_global) : "! symbolp(rebound_global) " + ("Types.symbolp(rebound_global) " + "CommonSymbols.NIL != Types.symbolp(rebound_global) ") + rebound_global;
        assert NIL != subl_promotions.non_negative_integer_p(position) : "! subl_promotions.non_negative_integer_p(position) " + ("subl_promotions.non_negative_integer_p(position) " + "CommonSymbols.NIL != subl_promotions.non_negative_integer_p(position) ") + position;
        SubLObject positions = dictionary.dictionary_lookup_without_values(xref_m_top_global_binding_table(xrm), rebound_global, UNPROVIDED);
        if (!position.eql(positions.first())) {
            positions = cons(position, positions);
            dictionary.dictionary_enter(xref_m_top_global_binding_table(xrm), rebound_global, positions);
        }
        return xrm;
    }

    public static final SubLObject xref_system_print_function_trampoline_alt(SubLObject v_object, SubLObject stream) {
        print_xref_system(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject xref_system_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        print_xref_system(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject xref_system_p_alt(SubLObject v_object) {
        return v_object.getClass() == com.cyc.cycjava.cycl.xref_database.$xref_system_native.class ? ((SubLObject) (T)) : NIL;
    }

    public static SubLObject xref_system_p(final SubLObject v_object) {
        return v_object.getClass() == com.cyc.cycjava.cycl.xref_database.$xref_system_native.class ? T : NIL;
    }

    public static final SubLObject xref_s_name_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, XREF_SYSTEM_P);
        return v_object.getField2();
    }

    public static SubLObject xref_s_name(final SubLObject v_object) {
        assert NIL != xref_system_p(v_object) : "! xref_database.xref_system_p(v_object) " + "xref_database.xref_system_p error :" + v_object;
        return v_object.getField2();
    }

    public static final SubLObject xref_s_features_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, XREF_SYSTEM_P);
        return v_object.getField3();
    }

    public static SubLObject xref_s_features(final SubLObject v_object) {
        assert NIL != xref_system_p(v_object) : "! xref_database.xref_system_p(v_object) " + "xref_database.xref_system_p error :" + v_object;
        return v_object.getField3();
    }

    public static final SubLObject xref_s_xref_module_table_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, XREF_SYSTEM_P);
        return v_object.getField4();
    }

    public static SubLObject xref_s_xref_module_table(final SubLObject v_object) {
        assert NIL != xref_system_p(v_object) : "! xref_database.xref_system_p(v_object) " + "xref_database.xref_system_p error :" + v_object;
        return v_object.getField4();
    }

    public static final SubLObject xref_s_method_definition_table_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, XREF_SYSTEM_P);
        return v_object.getField5();
    }

    public static SubLObject xref_s_method_definition_table(final SubLObject v_object) {
        assert NIL != xref_system_p(v_object) : "! xref_database.xref_system_p(v_object) " + "xref_database.xref_system_p error :" + v_object;
        return v_object.getField5();
    }

    public static final SubLObject xref_s_global_definition_table_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, XREF_SYSTEM_P);
        return v_object.getField6();
    }

    public static SubLObject xref_s_global_definition_table(final SubLObject v_object) {
        assert NIL != xref_system_p(v_object) : "! xref_database.xref_system_p(v_object) " + "xref_database.xref_system_p error :" + v_object;
        return v_object.getField6();
    }

    public static final SubLObject xref_s_method_called_by_method_table_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, XREF_SYSTEM_P);
        return v_object.getField7();
    }

    public static SubLObject xref_s_method_called_by_method_table(final SubLObject v_object) {
        assert NIL != xref_system_p(v_object) : "! xref_database.xref_system_p(v_object) " + "xref_database.xref_system_p error :" + v_object;
        return v_object.getField7();
    }

    public static final SubLObject xref_s_method_called_by_global_table_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, XREF_SYSTEM_P);
        return v_object.getField8();
    }

    public static SubLObject xref_s_method_called_by_global_table(final SubLObject v_object) {
        assert NIL != xref_system_p(v_object) : "! xref_database.xref_system_p(v_object) " + "xref_database.xref_system_p error :" + v_object;
        return v_object.getField8();
    }

    public static final SubLObject xref_s_method_called_at_top_level_table_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, XREF_SYSTEM_P);
        return v_object.getField9();
    }

    public static SubLObject xref_s_method_called_at_top_level_table(final SubLObject v_object) {
        assert NIL != xref_system_p(v_object) : "! xref_database.xref_system_p(v_object) " + "xref_database.xref_system_p error :" + v_object;
        return v_object.getField9();
    }

    public static final SubLObject xref_s_global_referenced_by_method_table_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, XREF_SYSTEM_P);
        return v_object.getField10();
    }

    public static SubLObject xref_s_global_referenced_by_method_table(final SubLObject v_object) {
        assert NIL != xref_system_p(v_object) : "! xref_database.xref_system_p(v_object) " + "xref_database.xref_system_p error :" + v_object;
        return v_object.getField10();
    }

    public static final SubLObject xref_s_global_modified_by_method_table_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, XREF_SYSTEM_P);
        return v_object.getField11();
    }

    public static SubLObject xref_s_global_modified_by_method_table(final SubLObject v_object) {
        assert NIL != xref_system_p(v_object) : "! xref_database.xref_system_p(v_object) " + "xref_database.xref_system_p error :" + v_object;
        return v_object.getField11();
    }

    public static final SubLObject xref_s_global_rebound_by_method_table_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, XREF_SYSTEM_P);
        return v_object.getField12();
    }

    public static SubLObject xref_s_global_rebound_by_method_table(final SubLObject v_object) {
        assert NIL != xref_system_p(v_object) : "! xref_database.xref_system_p(v_object) " + "xref_database.xref_system_p error :" + v_object;
        return v_object.getField12();
    }

    public static final SubLObject xref_s_global_referenced_by_global_table_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, XREF_SYSTEM_P);
        return v_object.getField13();
    }

    public static SubLObject xref_s_global_referenced_by_global_table(final SubLObject v_object) {
        assert NIL != xref_system_p(v_object) : "! xref_database.xref_system_p(v_object) " + "xref_database.xref_system_p error :" + v_object;
        return v_object.getField13();
    }

    public static final SubLObject xref_s_global_referenced_at_top_level_table_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, XREF_SYSTEM_P);
        return v_object.getField14();
    }

    public static SubLObject xref_s_global_referenced_at_top_level_table(final SubLObject v_object) {
        assert NIL != xref_system_p(v_object) : "! xref_database.xref_system_p(v_object) " + "xref_database.xref_system_p error :" + v_object;
        return v_object.getField14();
    }

    public static final SubLObject xref_s_global_modified_at_top_level_table_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, XREF_SYSTEM_P);
        return v_object.getField15();
    }

    public static SubLObject xref_s_global_modified_at_top_level_table(final SubLObject v_object) {
        assert NIL != xref_system_p(v_object) : "! xref_database.xref_system_p(v_object) " + "xref_database.xref_system_p error :" + v_object;
        return v_object.getField15();
    }

    public static final SubLObject xref_s_global_rebound_at_top_level_table_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, XREF_SYSTEM_P);
        return v_object.getField16();
    }

    public static SubLObject xref_s_global_rebound_at_top_level_table(final SubLObject v_object) {
        assert NIL != xref_system_p(v_object) : "! xref_database.xref_system_p(v_object) " + "xref_database.xref_system_p error :" + v_object;
        return v_object.getField16();
    }

    public static final SubLObject _csetf_xref_s_name_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, XREF_SYSTEM_P);
        return v_object.setField2(value);
    }

    public static SubLObject _csetf_xref_s_name(final SubLObject v_object, final SubLObject value) {
        assert NIL != xref_system_p(v_object) : "! xref_database.xref_system_p(v_object) " + "xref_database.xref_system_p error :" + v_object;
        return v_object.setField2(value);
    }

    public static final SubLObject _csetf_xref_s_features_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, XREF_SYSTEM_P);
        return v_object.setField3(value);
    }

    public static SubLObject _csetf_xref_s_features(final SubLObject v_object, final SubLObject value) {
        assert NIL != xref_system_p(v_object) : "! xref_database.xref_system_p(v_object) " + "xref_database.xref_system_p error :" + v_object;
        return v_object.setField3(value);
    }

    public static final SubLObject _csetf_xref_s_xref_module_table_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, XREF_SYSTEM_P);
        return v_object.setField4(value);
    }

    public static SubLObject _csetf_xref_s_xref_module_table(final SubLObject v_object, final SubLObject value) {
        assert NIL != xref_system_p(v_object) : "! xref_database.xref_system_p(v_object) " + "xref_database.xref_system_p error :" + v_object;
        return v_object.setField4(value);
    }

    public static final SubLObject _csetf_xref_s_method_definition_table_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, XREF_SYSTEM_P);
        return v_object.setField5(value);
    }

    public static SubLObject _csetf_xref_s_method_definition_table(final SubLObject v_object, final SubLObject value) {
        assert NIL != xref_system_p(v_object) : "! xref_database.xref_system_p(v_object) " + "xref_database.xref_system_p error :" + v_object;
        return v_object.setField5(value);
    }

    public static final SubLObject _csetf_xref_s_global_definition_table_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, XREF_SYSTEM_P);
        return v_object.setField6(value);
    }

    public static SubLObject _csetf_xref_s_global_definition_table(final SubLObject v_object, final SubLObject value) {
        assert NIL != xref_system_p(v_object) : "! xref_database.xref_system_p(v_object) " + "xref_database.xref_system_p error :" + v_object;
        return v_object.setField6(value);
    }

    public static final SubLObject _csetf_xref_s_method_called_by_method_table_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, XREF_SYSTEM_P);
        return v_object.setField7(value);
    }

    public static SubLObject _csetf_xref_s_method_called_by_method_table(final SubLObject v_object, final SubLObject value) {
        assert NIL != xref_system_p(v_object) : "! xref_database.xref_system_p(v_object) " + "xref_database.xref_system_p error :" + v_object;
        return v_object.setField7(value);
    }

    public static final SubLObject _csetf_xref_s_method_called_by_global_table_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, XREF_SYSTEM_P);
        return v_object.setField8(value);
    }

    public static SubLObject _csetf_xref_s_method_called_by_global_table(final SubLObject v_object, final SubLObject value) {
        assert NIL != xref_system_p(v_object) : "! xref_database.xref_system_p(v_object) " + "xref_database.xref_system_p error :" + v_object;
        return v_object.setField8(value);
    }

    public static final SubLObject _csetf_xref_s_method_called_at_top_level_table_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, XREF_SYSTEM_P);
        return v_object.setField9(value);
    }

    public static SubLObject _csetf_xref_s_method_called_at_top_level_table(final SubLObject v_object, final SubLObject value) {
        assert NIL != xref_system_p(v_object) : "! xref_database.xref_system_p(v_object) " + "xref_database.xref_system_p error :" + v_object;
        return v_object.setField9(value);
    }

    public static final SubLObject _csetf_xref_s_global_referenced_by_method_table_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, XREF_SYSTEM_P);
        return v_object.setField10(value);
    }

    public static SubLObject _csetf_xref_s_global_referenced_by_method_table(final SubLObject v_object, final SubLObject value) {
        assert NIL != xref_system_p(v_object) : "! xref_database.xref_system_p(v_object) " + "xref_database.xref_system_p error :" + v_object;
        return v_object.setField10(value);
    }

    public static final SubLObject _csetf_xref_s_global_modified_by_method_table_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, XREF_SYSTEM_P);
        return v_object.setField11(value);
    }

    public static SubLObject _csetf_xref_s_global_modified_by_method_table(final SubLObject v_object, final SubLObject value) {
        assert NIL != xref_system_p(v_object) : "! xref_database.xref_system_p(v_object) " + "xref_database.xref_system_p error :" + v_object;
        return v_object.setField11(value);
    }

    public static final SubLObject _csetf_xref_s_global_rebound_by_method_table_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, XREF_SYSTEM_P);
        return v_object.setField12(value);
    }

    public static SubLObject _csetf_xref_s_global_rebound_by_method_table(final SubLObject v_object, final SubLObject value) {
        assert NIL != xref_system_p(v_object) : "! xref_database.xref_system_p(v_object) " + "xref_database.xref_system_p error :" + v_object;
        return v_object.setField12(value);
    }

    public static final SubLObject _csetf_xref_s_global_referenced_by_global_table_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, XREF_SYSTEM_P);
        return v_object.setField13(value);
    }

    public static SubLObject _csetf_xref_s_global_referenced_by_global_table(final SubLObject v_object, final SubLObject value) {
        assert NIL != xref_system_p(v_object) : "! xref_database.xref_system_p(v_object) " + "xref_database.xref_system_p error :" + v_object;
        return v_object.setField13(value);
    }

    public static final SubLObject _csetf_xref_s_global_referenced_at_top_level_table_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, XREF_SYSTEM_P);
        return v_object.setField14(value);
    }

    public static SubLObject _csetf_xref_s_global_referenced_at_top_level_table(final SubLObject v_object, final SubLObject value) {
        assert NIL != xref_system_p(v_object) : "! xref_database.xref_system_p(v_object) " + "xref_database.xref_system_p error :" + v_object;
        return v_object.setField14(value);
    }

    public static final SubLObject _csetf_xref_s_global_modified_at_top_level_table_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, XREF_SYSTEM_P);
        return v_object.setField15(value);
    }

    public static SubLObject _csetf_xref_s_global_modified_at_top_level_table(final SubLObject v_object, final SubLObject value) {
        assert NIL != xref_system_p(v_object) : "! xref_database.xref_system_p(v_object) " + "xref_database.xref_system_p error :" + v_object;
        return v_object.setField15(value);
    }

    public static final SubLObject _csetf_xref_s_global_rebound_at_top_level_table_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, XREF_SYSTEM_P);
        return v_object.setField16(value);
    }

    public static SubLObject _csetf_xref_s_global_rebound_at_top_level_table(final SubLObject v_object, final SubLObject value) {
        assert NIL != xref_system_p(v_object) : "! xref_database.xref_system_p(v_object) " + "xref_database.xref_system_p error :" + v_object;
        return v_object.setField16(value);
    }

    public static final SubLObject make_xref_system_alt(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        {
            SubLObject v_new = new com.cyc.cycjava.cycl.xref_database.$xref_system_native();
            SubLObject next = NIL;
            for (next = arglist; NIL != next; next = cddr(next)) {
                {
                    SubLObject current_arg = next.first();
                    SubLObject current_value = cadr(next);
                    SubLObject pcase_var = current_arg;
                    if (pcase_var.eql($NAME)) {
                        _csetf_xref_s_name(v_new, current_value);
                    } else {
                        if (pcase_var.eql($FEATURES)) {
                            _csetf_xref_s_features(v_new, current_value);
                        } else {
                            if (pcase_var.eql($XREF_MODULE_TABLE)) {
                                _csetf_xref_s_xref_module_table(v_new, current_value);
                            } else {
                                if (pcase_var.eql($METHOD_DEFINITION_TABLE)) {
                                    _csetf_xref_s_method_definition_table(v_new, current_value);
                                } else {
                                    if (pcase_var.eql($GLOBAL_DEFINITION_TABLE)) {
                                        _csetf_xref_s_global_definition_table(v_new, current_value);
                                    } else {
                                        if (pcase_var.eql($METHOD_CALLED_BY_METHOD_TABLE)) {
                                            _csetf_xref_s_method_called_by_method_table(v_new, current_value);
                                        } else {
                                            if (pcase_var.eql($METHOD_CALLED_BY_GLOBAL_TABLE)) {
                                                _csetf_xref_s_method_called_by_global_table(v_new, current_value);
                                            } else {
                                                if (pcase_var.eql($METHOD_CALLED_AT_TOP_LEVEL_TABLE)) {
                                                    _csetf_xref_s_method_called_at_top_level_table(v_new, current_value);
                                                } else {
                                                    if (pcase_var.eql($GLOBAL_REFERENCED_BY_METHOD_TABLE)) {
                                                        _csetf_xref_s_global_referenced_by_method_table(v_new, current_value);
                                                    } else {
                                                        if (pcase_var.eql($GLOBAL_MODIFIED_BY_METHOD_TABLE)) {
                                                            _csetf_xref_s_global_modified_by_method_table(v_new, current_value);
                                                        } else {
                                                            if (pcase_var.eql($GLOBAL_REBOUND_BY_METHOD_TABLE)) {
                                                                _csetf_xref_s_global_rebound_by_method_table(v_new, current_value);
                                                            } else {
                                                                if (pcase_var.eql($GLOBAL_REFERENCED_BY_GLOBAL_TABLE)) {
                                                                    _csetf_xref_s_global_referenced_by_global_table(v_new, current_value);
                                                                } else {
                                                                    if (pcase_var.eql($GLOBAL_REFERENCED_AT_TOP_LEVEL_TABLE)) {
                                                                        _csetf_xref_s_global_referenced_at_top_level_table(v_new, current_value);
                                                                    } else {
                                                                        if (pcase_var.eql($GLOBAL_MODIFIED_AT_TOP_LEVEL_TABLE)) {
                                                                            _csetf_xref_s_global_modified_at_top_level_table(v_new, current_value);
                                                                        } else {
                                                                            if (pcase_var.eql($GLOBAL_REBOUND_AT_TOP_LEVEL_TABLE)) {
                                                                                _csetf_xref_s_global_rebound_at_top_level_table(v_new, current_value);
                                                                            } else {
                                                                                Errors.error($str_alt65$Invalid_slot__S_for_construction_, current_arg);
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
            }
            return v_new;
        }
    }

    public static SubLObject make_xref_system(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new com.cyc.cycjava.cycl.xref_database.$xref_system_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
            current_arg = next.first();
            current_value = cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql($NAME)) {
                _csetf_xref_s_name(v_new, current_value);
            } else
                if (pcase_var.eql($FEATURES)) {
                    _csetf_xref_s_features(v_new, current_value);
                } else
                    if (pcase_var.eql($XREF_MODULE_TABLE)) {
                        _csetf_xref_s_xref_module_table(v_new, current_value);
                    } else
                        if (pcase_var.eql($METHOD_DEFINITION_TABLE)) {
                            _csetf_xref_s_method_definition_table(v_new, current_value);
                        } else
                            if (pcase_var.eql($GLOBAL_DEFINITION_TABLE)) {
                                _csetf_xref_s_global_definition_table(v_new, current_value);
                            } else
                                if (pcase_var.eql($METHOD_CALLED_BY_METHOD_TABLE)) {
                                    _csetf_xref_s_method_called_by_method_table(v_new, current_value);
                                } else
                                    if (pcase_var.eql($METHOD_CALLED_BY_GLOBAL_TABLE)) {
                                        _csetf_xref_s_method_called_by_global_table(v_new, current_value);
                                    } else
                                        if (pcase_var.eql($METHOD_CALLED_AT_TOP_LEVEL_TABLE)) {
                                            _csetf_xref_s_method_called_at_top_level_table(v_new, current_value);
                                        } else
                                            if (pcase_var.eql($GLOBAL_REFERENCED_BY_METHOD_TABLE)) {
                                                _csetf_xref_s_global_referenced_by_method_table(v_new, current_value);
                                            } else
                                                if (pcase_var.eql($GLOBAL_MODIFIED_BY_METHOD_TABLE)) {
                                                    _csetf_xref_s_global_modified_by_method_table(v_new, current_value);
                                                } else
                                                    if (pcase_var.eql($GLOBAL_REBOUND_BY_METHOD_TABLE)) {
                                                        _csetf_xref_s_global_rebound_by_method_table(v_new, current_value);
                                                    } else
                                                        if (pcase_var.eql($GLOBAL_REFERENCED_BY_GLOBAL_TABLE)) {
                                                            _csetf_xref_s_global_referenced_by_global_table(v_new, current_value);
                                                        } else
                                                            if (pcase_var.eql($GLOBAL_REFERENCED_AT_TOP_LEVEL_TABLE)) {
                                                                _csetf_xref_s_global_referenced_at_top_level_table(v_new, current_value);
                                                            } else
                                                                if (pcase_var.eql($GLOBAL_MODIFIED_AT_TOP_LEVEL_TABLE)) {
                                                                    _csetf_xref_s_global_modified_at_top_level_table(v_new, current_value);
                                                                } else
                                                                    if (pcase_var.eql($GLOBAL_REBOUND_AT_TOP_LEVEL_TABLE)) {
                                                                        _csetf_xref_s_global_rebound_at_top_level_table(v_new, current_value);
                                                                    } else {
                                                                        Errors.error($str66$Invalid_slot__S_for_construction_, current_arg);
                                                                    }














        }
        return v_new;
    }

    public static SubLObject visit_defstruct_xref_system(final SubLObject obj, final SubLObject visitor_fn) {
        funcall(visitor_fn, obj, $BEGIN, MAKE_XREF_SYSTEM, FIFTEEN_INTEGER);
        funcall(visitor_fn, obj, $SLOT, $NAME, xref_s_name(obj));
        funcall(visitor_fn, obj, $SLOT, $FEATURES, xref_s_features(obj));
        funcall(visitor_fn, obj, $SLOT, $XREF_MODULE_TABLE, xref_s_xref_module_table(obj));
        funcall(visitor_fn, obj, $SLOT, $METHOD_DEFINITION_TABLE, xref_s_method_definition_table(obj));
        funcall(visitor_fn, obj, $SLOT, $GLOBAL_DEFINITION_TABLE, xref_s_global_definition_table(obj));
        funcall(visitor_fn, obj, $SLOT, $METHOD_CALLED_BY_METHOD_TABLE, xref_s_method_called_by_method_table(obj));
        funcall(visitor_fn, obj, $SLOT, $METHOD_CALLED_BY_GLOBAL_TABLE, xref_s_method_called_by_global_table(obj));
        funcall(visitor_fn, obj, $SLOT, $METHOD_CALLED_AT_TOP_LEVEL_TABLE, xref_s_method_called_at_top_level_table(obj));
        funcall(visitor_fn, obj, $SLOT, $GLOBAL_REFERENCED_BY_METHOD_TABLE, xref_s_global_referenced_by_method_table(obj));
        funcall(visitor_fn, obj, $SLOT, $GLOBAL_MODIFIED_BY_METHOD_TABLE, xref_s_global_modified_by_method_table(obj));
        funcall(visitor_fn, obj, $SLOT, $GLOBAL_REBOUND_BY_METHOD_TABLE, xref_s_global_rebound_by_method_table(obj));
        funcall(visitor_fn, obj, $SLOT, $GLOBAL_REFERENCED_BY_GLOBAL_TABLE, xref_s_global_referenced_by_global_table(obj));
        funcall(visitor_fn, obj, $SLOT, $GLOBAL_REFERENCED_AT_TOP_LEVEL_TABLE, xref_s_global_referenced_at_top_level_table(obj));
        funcall(visitor_fn, obj, $SLOT, $GLOBAL_MODIFIED_AT_TOP_LEVEL_TABLE, xref_s_global_modified_at_top_level_table(obj));
        funcall(visitor_fn, obj, $SLOT, $GLOBAL_REBOUND_AT_TOP_LEVEL_TABLE, xref_s_global_rebound_at_top_level_table(obj));
        funcall(visitor_fn, obj, $END, MAKE_XREF_SYSTEM, FIFTEEN_INTEGER);
        return obj;
    }

    public static SubLObject visit_defstruct_object_xref_system_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_xref_system(obj, visitor_fn);
    }

    public static final SubLObject print_xref_system_alt(SubLObject v_object, SubLObject stream, SubLObject depth) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != $print_readably$.getDynamicValue(thread)) {
                print_not_readable(v_object, stream);
            } else {
                {
                    SubLObject v_object_7 = v_object;
                    SubLObject stream_8 = stream;
                    write_string($str_alt66$__, stream_8, UNPROVIDED, UNPROVIDED);
                    write(type_of(v_object_7), new SubLObject[]{ $STREAM, stream_8 });
                    write_char(CHAR_space, stream_8);
                    {
                        SubLObject name = xrs_name(v_object);
                        SubLObject feature_count = length(xref_s_features(v_object));
                        SubLObject module_count = xrs_module_count(v_object);
                        format(stream, $str_alt160$_A____S_features___S_modules, new SubLObject[]{ name, feature_count, module_count });
                    }
                    write_char(CHAR_space, stream_8);
                    write(pointer(v_object_7), new SubLObject[]{ $STREAM, stream_8, $BASE, SIXTEEN_INTEGER });
                    write_char(CHAR_greater, stream_8);
                }
            }
            return v_object;
        }
    }

    public static SubLObject print_xref_system(final SubLObject v_object, final SubLObject stream, final SubLObject depth) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != $print_readably$.getDynamicValue(thread)) {
            print_not_readable(v_object, stream);
        } else {
            print_macros.print_unreadable_object_preamble(stream, v_object, T, T);
            final SubLObject name = xrs_name(v_object);
            final SubLObject feature_count = length(xref_s_features(v_object));
            final SubLObject module_count = xrs_module_count(v_object);
            format(stream, $str166$_A____S_features___S_modules, new SubLObject[]{ name, feature_count, module_count });
            print_macros.print_unreadable_object_postamble(stream, v_object, T, T);
        }
        return v_object;
    }

    public static final SubLObject new_xref_system_alt(SubLObject name, SubLObject features) {
        SubLTrampolineFile.checkType(name, STRINGP);
        {
            SubLObject list_var = features;
            SubLTrampolineFile.checkType(list_var, NON_DOTTED_LIST_P);
            {
                SubLObject cdolist_list_var = list_var;
                SubLObject elem = NIL;
                for (elem = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , elem = cdolist_list_var.first()) {
                    SubLTrampolineFile.checkType(elem, SYMBOLP);
                }
            }
        }
        {
            SubLObject method_count = $int$10000;
            SubLObject global_count = $int$1000;
            SubLObject module_count = $int$500;
            SubLObject xrs = make_xref_system(UNPROVIDED);
            _csetf_xref_s_name(xrs, name);
            _csetf_xref_s_features(xrs, features);
            _csetf_xref_s_xref_module_table(xrs, make_hash_table(module_count, symbol_function(EQUAL), UNPROVIDED));
            _csetf_xref_s_method_definition_table(xrs, make_hash_table(method_count, symbol_function(EQ), UNPROVIDED));
            _csetf_xref_s_global_definition_table(xrs, make_hash_table(global_count, symbol_function(EQ), UNPROVIDED));
            _csetf_xref_s_method_called_by_method_table(xrs, make_hash_table(method_count, symbol_function(EQ), UNPROVIDED));
            _csetf_xref_s_method_called_by_global_table(xrs, make_hash_table(method_count, symbol_function(EQ), UNPROVIDED));
            _csetf_xref_s_method_called_at_top_level_table(xrs, make_hash_table(method_count, symbol_function(EQ), UNPROVIDED));
            _csetf_xref_s_global_referenced_by_method_table(xrs, make_hash_table(global_count, symbol_function(EQ), UNPROVIDED));
            _csetf_xref_s_global_modified_by_method_table(xrs, make_hash_table(global_count, symbol_function(EQ), UNPROVIDED));
            _csetf_xref_s_global_rebound_by_method_table(xrs, make_hash_table(global_count, symbol_function(EQ), UNPROVIDED));
            _csetf_xref_s_global_referenced_by_global_table(xrs, make_hash_table(global_count, symbol_function(EQ), UNPROVIDED));
            _csetf_xref_s_global_referenced_at_top_level_table(xrs, make_hash_table(global_count, symbol_function(EQ), UNPROVIDED));
            _csetf_xref_s_global_modified_at_top_level_table(xrs, make_hash_table(global_count, symbol_function(EQ), UNPROVIDED));
            _csetf_xref_s_global_rebound_at_top_level_table(xrs, make_hash_table(global_count, symbol_function(EQ), UNPROVIDED));
            return xrs;
        }
    }

    public static SubLObject new_xref_system(final SubLObject name, final SubLObject features) {
        assert NIL != stringp(name) : "! stringp(name) " + ("Types.stringp(name) " + "CommonSymbols.NIL != Types.stringp(name) ") + name;
        assert NIL != list_utilities.non_dotted_list_p(features) : "! list_utilities.non_dotted_list_p(features) " + ("list_utilities.non_dotted_list_p(features) " + "CommonSymbols.NIL != list_utilities.non_dotted_list_p(features) ") + features;
        SubLObject cdolist_list_var = features;
        SubLObject elem = NIL;
        elem = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            assert NIL != symbolp(elem) : "! symbolp(elem) " + ("Types.symbolp(elem) " + "CommonSymbols.NIL != Types.symbolp(elem) ") + elem;
            cdolist_list_var = cdolist_list_var.rest();
            elem = cdolist_list_var.first();
        } 
        final SubLObject method_count = $int$10000;
        final SubLObject global_count = $int$1000;
        final SubLObject module_count = $int$500;
        final SubLObject xrs = make_xref_system(UNPROVIDED);
        _csetf_xref_s_name(xrs, name);
        _csetf_xref_s_features(xrs, features);
        _csetf_xref_s_xref_module_table(xrs, make_hash_table(module_count, symbol_function(EQUAL), UNPROVIDED));
        _csetf_xref_s_method_definition_table(xrs, make_hash_table(method_count, symbol_function(EQ), UNPROVIDED));
        _csetf_xref_s_global_definition_table(xrs, make_hash_table(global_count, symbol_function(EQ), UNPROVIDED));
        _csetf_xref_s_method_called_by_method_table(xrs, make_hash_table(method_count, symbol_function(EQ), UNPROVIDED));
        _csetf_xref_s_method_called_by_global_table(xrs, make_hash_table(method_count, symbol_function(EQ), UNPROVIDED));
        _csetf_xref_s_method_called_at_top_level_table(xrs, make_hash_table(method_count, symbol_function(EQ), UNPROVIDED));
        _csetf_xref_s_global_referenced_by_method_table(xrs, make_hash_table(global_count, symbol_function(EQ), UNPROVIDED));
        _csetf_xref_s_global_modified_by_method_table(xrs, make_hash_table(global_count, symbol_function(EQ), UNPROVIDED));
        _csetf_xref_s_global_rebound_by_method_table(xrs, make_hash_table(global_count, symbol_function(EQ), UNPROVIDED));
        _csetf_xref_s_global_referenced_by_global_table(xrs, make_hash_table(global_count, symbol_function(EQ), UNPROVIDED));
        _csetf_xref_s_global_referenced_at_top_level_table(xrs, make_hash_table(global_count, symbol_function(EQ), UNPROVIDED));
        _csetf_xref_s_global_modified_at_top_level_table(xrs, make_hash_table(global_count, symbol_function(EQ), UNPROVIDED));
        _csetf_xref_s_global_rebound_at_top_level_table(xrs, make_hash_table(global_count, symbol_function(EQ), UNPROVIDED));
        return xrs;
    }

    public static final SubLObject xrs_name_alt(SubLObject xrs) {
        SubLTrampolineFile.checkType(xrs, XREF_SYSTEM_P);
        return xref_s_name(xrs);
    }

    public static SubLObject xrs_name(final SubLObject xrs) {
        assert NIL != xref_system_p(xrs) : "! xref_database.xref_system_p(xrs) " + ("xref_database.xref_system_p(xrs) " + "CommonSymbols.NIL != xref_database.xref_system_p(xrs) ") + xrs;
        return xref_s_name(xrs);
    }

    public static final SubLObject xrs_features_alt(SubLObject xrs) {
        SubLTrampolineFile.checkType(xrs, XREF_SYSTEM_P);
        return xref_s_features(xrs);
    }

    public static SubLObject xrs_features(final SubLObject xrs) {
        assert NIL != xref_system_p(xrs) : "! xref_database.xref_system_p(xrs) " + ("xref_database.xref_system_p(xrs) " + "CommonSymbols.NIL != xref_database.xref_system_p(xrs) ") + xrs;
        return xref_s_features(xrs);
    }

    public static final SubLObject xrs_module_count_alt(SubLObject xrs) {
        SubLTrampolineFile.checkType(xrs, XREF_SYSTEM_P);
        return hash_table_count(xref_s_xref_module_table(xrs));
    }

    public static SubLObject xrs_module_count(final SubLObject xrs) {
        assert NIL != xref_system_p(xrs) : "! xref_database.xref_system_p(xrs) " + ("xref_database.xref_system_p(xrs) " + "CommonSymbols.NIL != xref_database.xref_system_p(xrs) ") + xrs;
        return hash_table_count(xref_s_xref_module_table(xrs));
    }

    public static final SubLObject xrs_lookup_module_alt(SubLObject xrs, SubLObject module_name) {
        SubLTrampolineFile.checkType(xrs, XREF_SYSTEM_P);
        SubLTrampolineFile.checkType(module_name, STRINGP);
        return gethash_without_values(module_name, xref_s_xref_module_table(xrs), NIL);
    }

    public static SubLObject xrs_lookup_module(final SubLObject xrs, final SubLObject module_name) {
        assert NIL != xref_system_p(xrs) : "! xref_database.xref_system_p(xrs) " + ("xref_database.xref_system_p(xrs) " + "CommonSymbols.NIL != xref_database.xref_system_p(xrs) ") + xrs;
        assert NIL != stringp(module_name) : "! stringp(module_name) " + ("Types.stringp(module_name) " + "CommonSymbols.NIL != Types.stringp(module_name) ") + module_name;
        return gethash_without_values(module_name, xref_s_xref_module_table(xrs), NIL);
    }

    public static final SubLObject xrs_method_defining_xrm_alt(SubLObject xrs, SubLObject method) {
        SubLTrampolineFile.checkType(xrs, XREF_SYSTEM_P);
        SubLTrampolineFile.checkType(method, SYMBOLP);
        {
            SubLObject table = xref_s_method_definition_table(xrs);
            SubLObject xrm_data = gethash_without_values(method, table, NIL);
            if (NIL != xref_module_p(xrm_data)) {
                return xrm_data;
            } else {
                return xrm_data.first();
            }
        }
    }

    public static SubLObject xrs_method_defining_xrm(final SubLObject xrs, final SubLObject method) {
        assert NIL != xref_system_p(xrs) : "! xref_database.xref_system_p(xrs) " + ("xref_database.xref_system_p(xrs) " + "CommonSymbols.NIL != xref_database.xref_system_p(xrs) ") + xrs;
        assert NIL != symbolp(method) : "! symbolp(method) " + ("Types.symbolp(method) " + "CommonSymbols.NIL != Types.symbolp(method) ") + method;
        final SubLObject table = xref_s_method_definition_table(xrs);
        final SubLObject xrm_data = gethash_without_values(method, table, NIL);
        if (NIL != xref_module_p(xrm_data)) {
            return xrm_data;
        }
        return xrm_data.first();
    }

    public static final SubLObject xrs_method_defining_xrms_alt(SubLObject xrs, SubLObject method) {
        SubLTrampolineFile.checkType(xrs, XREF_SYSTEM_P);
        SubLTrampolineFile.checkType(method, SYMBOLP);
        {
            SubLObject table = xref_s_method_definition_table(xrs);
            SubLObject xrm_data = gethash_without_values(method, table, NIL);
            if (NIL != xref_module_p(xrm_data)) {
                return list(xrm_data);
            } else {
                return copy_list(xrm_data);
            }
        }
    }

    public static SubLObject xrs_method_defining_xrms(final SubLObject xrs, final SubLObject method) {
        assert NIL != xref_system_p(xrs) : "! xref_database.xref_system_p(xrs) " + ("xref_database.xref_system_p(xrs) " + "CommonSymbols.NIL != xref_database.xref_system_p(xrs) ") + xrs;
        assert NIL != symbolp(method) : "! symbolp(method) " + ("Types.symbolp(method) " + "CommonSymbols.NIL != Types.symbolp(method) ") + method;
        final SubLObject table = xref_s_method_definition_table(xrs);
        final SubLObject xrm_data = gethash_without_values(method, table, NIL);
        if (NIL != xref_module_p(xrm_data)) {
            return list(xrm_data);
        }
        return copy_list(xrm_data);
    }

    public static final SubLObject xrs_method_definition_count_alt(SubLObject xrs, SubLObject method) {
        SubLTrampolineFile.checkType(xrs, XREF_SYSTEM_P);
        {
            SubLObject table = xref_s_method_definition_table(xrs);
            SubLObject xrm_data = gethash_without_values(method, table, NIL);
            SubLObject count = ZERO_INTEGER;
            if (NIL != xref_module_p(xrm_data)) {
                {
                    SubLObject xrm = xrm_data;
                    count = add(count, xrm_method_definition_count(xrm, method));
                }
            } else {
                {
                    SubLObject cdolist_list_var = xrm_data;
                    SubLObject xrm = NIL;
                    for (xrm = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , xrm = cdolist_list_var.first()) {
                        count = add(count, xrm_method_definition_count(xrm, method));
                    }
                }
            }
            return count;
        }
    }

    public static SubLObject xrs_method_definition_count(final SubLObject xrs, final SubLObject method) {
        assert NIL != xref_system_p(xrs) : "! xref_database.xref_system_p(xrs) " + ("xref_database.xref_system_p(xrs) " + "CommonSymbols.NIL != xref_database.xref_system_p(xrs) ") + xrs;
        final SubLObject table = xref_s_method_definition_table(xrs);
        final SubLObject xrm_data = gethash_without_values(method, table, NIL);
        SubLObject count = ZERO_INTEGER;
        if (NIL != xref_module_p(xrm_data)) {
            final SubLObject xrm = xrm_data;
            count = add(count, xrm_method_definition_count(xrm, method));
        } else {
            SubLObject cdolist_list_var = xrm_data;
            SubLObject xrm2 = NIL;
            xrm2 = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                count = add(count, xrm_method_definition_count(xrm2, method));
                cdolist_list_var = cdolist_list_var.rest();
                xrm2 = cdolist_list_var.first();
            } 
        }
        return count;
    }

    public static final SubLObject xrs_global_defining_xrm_alt(SubLObject xrs, SubLObject global) {
        SubLTrampolineFile.checkType(xrs, XREF_SYSTEM_P);
        SubLTrampolineFile.checkType(global, SYMBOLP);
        {
            SubLObject table = xref_s_global_definition_table(xrs);
            SubLObject xrm_data = gethash_without_values(global, table, NIL);
            if (NIL != xref_module_p(xrm_data)) {
                return xrm_data;
            } else {
                return xrm_data.first();
            }
        }
    }

    public static SubLObject xrs_global_defining_xrm(final SubLObject xrs, final SubLObject global) {
        assert NIL != xref_system_p(xrs) : "! xref_database.xref_system_p(xrs) " + ("xref_database.xref_system_p(xrs) " + "CommonSymbols.NIL != xref_database.xref_system_p(xrs) ") + xrs;
        assert NIL != symbolp(global) : "! symbolp(global) " + ("Types.symbolp(global) " + "CommonSymbols.NIL != Types.symbolp(global) ") + global;
        final SubLObject table = xref_s_global_definition_table(xrs);
        final SubLObject xrm_data = gethash_without_values(global, table, NIL);
        if (NIL != xref_module_p(xrm_data)) {
            return xrm_data;
        }
        return xrm_data.first();
    }

    public static final SubLObject xrs_global_defining_xrms_alt(SubLObject xrs, SubLObject global) {
        SubLTrampolineFile.checkType(xrs, XREF_SYSTEM_P);
        SubLTrampolineFile.checkType(global, SYMBOLP);
        {
            SubLObject table = xref_s_global_definition_table(xrs);
            SubLObject xrm_data = gethash_without_values(global, table, NIL);
            if (NIL != xref_module_p(xrm_data)) {
                return list(xrm_data);
            } else {
                return copy_list(xrm_data);
            }
        }
    }

    public static SubLObject xrs_global_defining_xrms(final SubLObject xrs, final SubLObject global) {
        assert NIL != xref_system_p(xrs) : "! xref_database.xref_system_p(xrs) " + ("xref_database.xref_system_p(xrs) " + "CommonSymbols.NIL != xref_database.xref_system_p(xrs) ") + xrs;
        assert NIL != symbolp(global) : "! symbolp(global) " + ("Types.symbolp(global) " + "CommonSymbols.NIL != Types.symbolp(global) ") + global;
        final SubLObject table = xref_s_global_definition_table(xrs);
        final SubLObject xrm_data = gethash_without_values(global, table, NIL);
        if (NIL != xref_module_p(xrm_data)) {
            return list(xrm_data);
        }
        return copy_list(xrm_data);
    }

    public static final SubLObject xrs_global_definition_count_alt(SubLObject xrs, SubLObject global) {
        SubLTrampolineFile.checkType(xrs, XREF_SYSTEM_P);
        {
            SubLObject table = xref_s_global_definition_table(xrs);
            SubLObject xrm_data = gethash_without_values(global, table, NIL);
            SubLObject count = ZERO_INTEGER;
            if (NIL != xref_module_p(xrm_data)) {
                {
                    SubLObject xrm = xrm_data;
                    count = add(count, xrm_global_definition_count(xrm, global));
                }
            } else {
                {
                    SubLObject cdolist_list_var = xrm_data;
                    SubLObject xrm = NIL;
                    for (xrm = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , xrm = cdolist_list_var.first()) {
                        count = add(count, xrm_global_definition_count(xrm, global));
                    }
                }
            }
            return count;
        }
    }

    public static SubLObject xrs_global_definition_count(final SubLObject xrs, final SubLObject global) {
        assert NIL != xref_system_p(xrs) : "! xref_database.xref_system_p(xrs) " + ("xref_database.xref_system_p(xrs) " + "CommonSymbols.NIL != xref_database.xref_system_p(xrs) ") + xrs;
        final SubLObject table = xref_s_global_definition_table(xrs);
        final SubLObject xrm_data = gethash_without_values(global, table, NIL);
        SubLObject count = ZERO_INTEGER;
        if (NIL != xref_module_p(xrm_data)) {
            final SubLObject xrm = xrm_data;
            count = add(count, xrm_global_definition_count(xrm, global));
        } else {
            SubLObject cdolist_list_var = xrm_data;
            SubLObject xrm2 = NIL;
            xrm2 = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                count = add(count, xrm_global_definition_count(xrm2, global));
                cdolist_list_var = cdolist_list_var.rest();
                xrm2 = cdolist_list_var.first();
            } 
        }
        return count;
    }

    public static final SubLObject xrs_possibly_note_module_features_alt(SubLObject xrs, SubLObject module, SubLObject new_features) {
        SubLTrampolineFile.checkType(xrs, XREF_SYSTEM_P);
        SubLTrampolineFile.checkType(module, STRINGP);
        {
            SubLObject xrm = xrs_lookup_module(xrs, module);
            if (NIL != xrm) {
                {
                    SubLObject old_features = xrm_module_features(xrm);
                    if (!old_features.equal(new_features)) {
                        Errors.warn($str_alt164$Module__A_features_changed_to__S, module, new_features);
                        _csetf_xref_m_features(xrm, new_features);
                        return T;
                    }
                }
            }
        }
        return NIL;
    }

    public static SubLObject xrs_possibly_note_module_features(final SubLObject xrs, final SubLObject module, final SubLObject new_features) {
        assert NIL != xref_system_p(xrs) : "! xref_database.xref_system_p(xrs) " + ("xref_database.xref_system_p(xrs) " + "CommonSymbols.NIL != xref_database.xref_system_p(xrs) ") + xrs;
        assert NIL != stringp(module) : "! stringp(module) " + ("Types.stringp(module) " + "CommonSymbols.NIL != Types.stringp(module) ") + module;
        final SubLObject xrm = xrs_lookup_module(xrs, module);
        if (NIL != xrm) {
            final SubLObject old_features = xrm_module_features(xrm);
            if (!old_features.equal(new_features)) {
                Errors.warn($str170$Module__A_features_changed_to__S, module, new_features);
                _csetf_xref_m_features(xrm, new_features);
                return T;
            }
        }
        return NIL;
    }

    public static final SubLObject current_xref_system_alt() {
        {
            SubLObject sys_tran = system_translation.current_system_translation();
            if (NIL != sys_tran) {
                return system_translation.sys_tran_xref_database(sys_tran);
            }
        }
        return NIL;
    }

    public static SubLObject current_xref_system() {
        final SubLObject sys_tran = system_translation.current_system_translation();
        if (NIL != sys_tran) {
            return system_translation.sys_tran_xref_database(sys_tran);
        }
        return NIL;
    }

    public static final SubLObject current_xref_system_modules_alt() {
        {
            SubLObject sys_tran = system_translation.current_system_translation();
            if (NIL != sys_tran) {
                return copy_list(system_translation.sys_tran_modules(sys_tran));
            }
        }
        return NIL;
    }

    public static SubLObject current_xref_system_modules() {
        final SubLObject sys_tran = system_translation.current_system_translation();
        if (NIL != sys_tran) {
            return copy_list(system_translation.sys_tran_modules(sys_tran));
        }
        return NIL;
    }

    public static final SubLObject current_xref_system_features_alt() {
        {
            SubLObject sys_tran = system_translation.current_system_translation();
            if (NIL != sys_tran) {
                return copy_tree(system_translation.sys_tran_features(sys_tran));
            }
        }
        return NIL;
    }

    public static SubLObject current_xref_system_features() {
        final SubLObject sys_tran = system_translation.current_system_translation();
        if (NIL != sys_tran) {
            return copy_tree(system_translation.sys_tran_features(sys_tran));
        }
        return NIL;
    }

    public static final SubLObject current_xref_system_relevant_modules_alt(SubLObject candidate_modules) {
        {
            SubLObject sys_tran = system_translation.current_system_translation();
            if (NIL != sys_tran) {
                {
                    SubLObject relevant_modules = NIL;
                    SubLObject cdolist_list_var = candidate_modules;
                    SubLObject module = NIL;
                    for (module = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , module = cdolist_list_var.first()) {
                        if (NIL != system_translation.sys_tran_includes_moduleP(sys_tran, module)) {
                            relevant_modules = cons(module, relevant_modules);
                        }
                    }
                    return nreverse(relevant_modules);
                }
            }
        }
        return NIL;
    }

    public static SubLObject current_xref_system_relevant_modules(final SubLObject candidate_modules) {
        final SubLObject sys_tran = system_translation.current_system_translation();
        if (NIL != sys_tran) {
            SubLObject relevant_modules = NIL;
            SubLObject cdolist_list_var = candidate_modules;
            SubLObject module = NIL;
            module = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if (NIL != system_translation.sys_tran_includes_moduleP(sys_tran, module)) {
                    relevant_modules = cons(module, relevant_modules);
                }
                cdolist_list_var = cdolist_list_var.rest();
                module = cdolist_list_var.first();
            } 
            return nreverse(relevant_modules);
        }
        return NIL;
    }

    /**
     * Return T iff MODULE is a module in the current XREF database.
     */
    @LispMethod(comment = "Return T iff MODULE is a module in the current XREF database.")
    public static final SubLObject current_xref_module_p_alt(SubLObject module) {
        return sublisp_boolean(xref_find_xrm_by_module(module));
    }

    /**
     * Return T iff MODULE is a module in the current XREF database.
     */
    @LispMethod(comment = "Return T iff MODULE is a module in the current XREF database.")
    public static SubLObject current_xref_module_p(final SubLObject module) {
        return list_utilities.sublisp_boolean(xref_find_xrm_by_module(module));
    }

    public static final SubLObject xref_find_xrm_by_module_alt(SubLObject module) {
        SubLTrampolineFile.checkType(module, STRINGP);
        {
            SubLObject xrs = current_xref_system();
            if (NIL != xrs) {
                return xrs_lookup_module(xrs, module);
            }
        }
        return NIL;
    }

    public static SubLObject xref_find_xrm_by_module(final SubLObject module) {
        assert NIL != stringp(module) : "! stringp(module) " + ("Types.stringp(module) " + "CommonSymbols.NIL != Types.stringp(module) ") + module;
        final SubLObject xrs = current_xref_system();
        if (NIL != xrs) {
            return xrs_lookup_module(xrs, module);
        }
        return NIL;
    }

    public static final SubLObject xref_module_features_alt(SubLObject module) {
        SubLTrampolineFile.checkType(module, STRINGP);
        {
            SubLObject sys_tran = system_translation.current_system_translation();
            if (NIL != sys_tran) {
                return copy_tree(system_translation.sys_tran_module_features(sys_tran, module));
            }
        }
        return NIL;
    }

    public static SubLObject xref_module_features(final SubLObject module) {
        assert NIL != stringp(module) : "! stringp(module) " + ("Types.stringp(module) " + "CommonSymbols.NIL != Types.stringp(module) ") + module;
        final SubLObject sys_tran = system_translation.current_system_translation();
        if (NIL != sys_tran) {
            return copy_tree(system_translation.sys_tran_module_features(sys_tran, module));
        }
        return NIL;
    }

    public static final SubLObject xref_module_input_filename_alt(SubLObject module) {
        SubLTrampolineFile.checkType(module, STRINGP);
        {
            SubLObject sys_tran = system_translation.current_system_translation();
            if (NIL != sys_tran) {
                return system_translation.sys_tran_module_input_filename(sys_tran, module);
            }
        }
        return NIL;
    }

    public static SubLObject xref_module_input_filename(final SubLObject module) {
        assert NIL != stringp(module) : "! stringp(module) " + ("Types.stringp(module) " + "CommonSymbols.NIL != Types.stringp(module) ") + module;
        final SubLObject sys_tran = system_translation.current_system_translation();
        if (NIL != sys_tran) {
            return system_translation.sys_tran_module_input_filename(sys_tran, module);
        }
        return NIL;
    }

    public static final SubLObject xref_predefined_method_p_alt(SubLObject method) {
        SubLTrampolineFile.checkType(method, SYMBOLP);
        if (method.isMacroOperator()) {
            return makeBoolean($cyc_package$.getGlobalValue() != symbol_package(method));
        }
        {
            SubLObject sys_tran = system_translation.current_system_translation();
            if (NIL != sys_tran) {
                {
                    SubLObject backend = system_translation.sys_tran_backend(sys_tran);
                    SubLObject pcase_var = backend;
                    if (pcase_var.eql($SL2C)) {
                        return c_name_translation.c_backend_predefined_function_p(method);
                    } else {
                        if (pcase_var.eql($SL2JAVA)) {
                            return java_name_translation.java_backend_predefined_function_p(method);
                        } else {
                            return Errors.error($str_alt167$Unexpected_backend__S, backend);
                        }
                    }
                }
            }
        }
        return NIL;
    }

    public static SubLObject xref_predefined_method_p(final SubLObject method) {
        assert NIL != symbolp(method) : "! symbolp(method) " + ("Types.symbolp(method) " + "CommonSymbols.NIL != Types.symbolp(method) ") + method;
        if (method.isMacroOperator()) {
            return makeBoolean(!$cyc_package$.getGlobalValue().eql(symbol_package(method)));
        }
        final SubLObject sys_tran = system_translation.current_system_translation();
        if (NIL == sys_tran) {
            return NIL;
        }
        final SubLObject pcase_var;
        final SubLObject backend = pcase_var = system_translation.sys_tran_backend(sys_tran);
        if (pcase_var.eql($SL2C)) {
            return c_name_translation.c_backend_predefined_function_p(method);
        }
        if (pcase_var.eql($SL2JAVA)) {
            return java_name_translation.java_backend_predefined_function_p(method);
        }
        return Errors.error($str173$Unexpected_backend__S, backend);
    }

    public static final SubLObject xref_predefined_global_p_alt(SubLObject global) {
        SubLTrampolineFile.checkType(global, SYMBOLP);
        {
            SubLObject sys_tran = system_translation.current_system_translation();
            if (NIL != sys_tran) {
                {
                    SubLObject backend = system_translation.sys_tran_backend(sys_tran);
                    SubLObject pcase_var = backend;
                    if (pcase_var.eql($SL2C)) {
                        return c_name_translation.c_backend_predefined_global_p(global);
                    } else {
                        if (pcase_var.eql($SL2JAVA)) {
                            return java_name_translation.java_backend_predefined_global_p(global);
                        } else {
                            return Errors.error($str_alt167$Unexpected_backend__S, backend);
                        }
                    }
                }
            }
        }
        return NIL;
    }

    public static SubLObject xref_predefined_global_p(final SubLObject global) {
        assert NIL != symbolp(global) : "! symbolp(global) " + ("Types.symbolp(global) " + "CommonSymbols.NIL != Types.symbolp(global) ") + global;
        final SubLObject sys_tran = system_translation.current_system_translation();
        if (NIL == sys_tran) {
            return NIL;
        }
        final SubLObject pcase_var;
        final SubLObject backend = pcase_var = system_translation.sys_tran_backend(sys_tran);
        if (pcase_var.eql($SL2C)) {
            return c_name_translation.c_backend_predefined_global_p(global);
        }
        if (pcase_var.eql($SL2JAVA)) {
            return java_name_translation.java_backend_predefined_global_p(global);
        }
        return Errors.error($str173$Unexpected_backend__S, backend);
    }

    /**
     * Return the formal arglist of the most recent definition
     * for METHOD in the current translation.
     */
    @LispMethod(comment = "Return the formal arglist of the most recent definition\r\nfor METHOD in the current translation.\nReturn the formal arglist of the most recent definition\nfor METHOD in the current translation.")
    public static final SubLObject xref_method_formal_arglist_alt(SubLObject method) {
        {
            SubLObject xrs = current_xref_system();
            if (NIL != xrs) {
                {
                    SubLObject xrm = xrs_method_defining_xrm(xrs, method);
                    if (NIL != xrm) {
                        return xrm_method_formal_arglist(xrm, method);
                    }
                }
            }
        }
        return $UNSPECIFIED;
    }

    /**
     * Return the formal arglist of the most recent definition
     * for METHOD in the current translation.
     */
    @LispMethod(comment = "Return the formal arglist of the most recent definition\r\nfor METHOD in the current translation.\nReturn the formal arglist of the most recent definition\nfor METHOD in the current translation.")
    public static SubLObject xref_method_formal_arglist(final SubLObject method) {
        final SubLObject xrs = current_xref_system();
        if (NIL != xrs) {
            final SubLObject xrm = xrs_method_defining_xrm(xrs, method);
            if (NIL != xrm) {
                return xrm_method_formal_arglist(xrm, method);
            }
        }
        return $UNSPECIFIED;
    }

    /**
     * Return the formal arglist of METHOD or :unspecified if it is not defined.
     * When available, the XREF database is used rather than introspection.
     */
    @LispMethod(comment = "Return the formal arglist of METHOD or :unspecified if it is not defined.\r\nWhen available, the XREF database is used rather than introspection.\nReturn the formal arglist of METHOD or :unspecified if it is not defined.\nWhen available, the XREF database is used rather than introspection.")
    public static final SubLObject method_formal_arglist_alt(SubLObject method) {
        SubLTrampolineFile.checkType(method, SYMBOLP);
        {
            SubLObject arglist = xref_method_formal_arglist(method);
            if (arglist == $UNSPECIFIED) {
                if (NIL != function_symbol_p(method)) {
                    arglist = function_symbol_arglist(method);
                }
            }
            return arglist;
        }
    }

    /**
     * Return the formal arglist of METHOD or :unspecified if it is not defined.
     * When available, the XREF database is used rather than introspection.
     */
    @LispMethod(comment = "Return the formal arglist of METHOD or :unspecified if it is not defined.\r\nWhen available, the XREF database is used rather than introspection.\nReturn the formal arglist of METHOD or :unspecified if it is not defined.\nWhen available, the XREF database is used rather than introspection.")
    public static SubLObject method_formal_arglist(final SubLObject method) {
        assert NIL != symbolp(method) : "! symbolp(method) " + ("Types.symbolp(method) " + "CommonSymbols.NIL != Types.symbolp(method) ") + method;
        SubLObject arglist = xref_method_formal_arglist(method);
        if ((arglist == $UNSPECIFIED) && (NIL != subl_promotions.function_symbol_p(method))) {
            arglist = subl_promotions.function_symbol_arglist(method);
        }
        return arglist;
    }

    /**
     * Return the binding type of the most recent definition
     * for GLOBAL in the current translation.
     */
    @LispMethod(comment = "Return the binding type of the most recent definition\r\nfor GLOBAL in the current translation.\nReturn the binding type of the most recent definition\nfor GLOBAL in the current translation.")
    public static final SubLObject xref_global_binding_type_alt(SubLObject global) {
        {
            SubLObject xrs = current_xref_system();
            if (NIL != xrs) {
                {
                    SubLObject xrm = xrs_global_defining_xrm(xrs, global);
                    if (NIL != xrm) {
                        return xrm_global_binding_type(xrm, global);
                    }
                }
            }
        }
        return $UNSPECIFIED;
    }

    /**
     * Return the binding type of the most recent definition
     * for GLOBAL in the current translation.
     */
    @LispMethod(comment = "Return the binding type of the most recent definition\r\nfor GLOBAL in the current translation.\nReturn the binding type of the most recent definition\nfor GLOBAL in the current translation.")
    public static SubLObject xref_global_binding_type(final SubLObject global) {
        final SubLObject xrs = current_xref_system();
        if (NIL != xrs) {
            final SubLObject xrm = xrs_global_defining_xrm(xrs, global);
            if (NIL != xrm) {
                return xrm_global_binding_type(xrm, global);
            }
        }
        return $UNSPECIFIED;
    }

    /**
     * Return the number of definitions for METHOD in the current translation.
     * 0 = undefined
     * 1 = single definition (normal)
     * >=2 = multiple definitions
     */
    @LispMethod(comment = "Return the number of definitions for METHOD in the current translation.\r\n0 = undefined\r\n1 = single definition (normal)\r\n>=2 = multiple definitions\nReturn the number of definitions for METHOD in the current translation.\n0 = undefined\n1 = single definition (normal)\n>=2 = multiple definitions")
    public static final SubLObject xref_method_definition_count_alt(SubLObject method) {
        {
            SubLObject xrs = current_xref_system();
            return NIL != xrs ? ((SubLObject) (xrs_method_definition_count(xrs, method))) : ZERO_INTEGER;
        }
    }

    @LispMethod(comment = "Return the number of definitions for METHOD in the current translation.\r\n0 = undefined\r\n1 = single definition (normal)\r\n>=2 = multiple definitions\nReturn the number of definitions for METHOD in the current translation.\n0 = undefined\n1 = single definition (normal)\n>=2 = multiple definitions")
    public static SubLObject xref_method_definition_count(final SubLObject method) {
        final SubLObject xrs = current_xref_system();
        return NIL != xrs ? xrs_method_definition_count(xrs, method) : ZERO_INTEGER;
    }

    /**
     * Return T iff METHOD is undefined in the current translation.
     */
    @LispMethod(comment = "Return T iff METHOD is undefined in the current translation.")
    public static final SubLObject xref_method_undefinedP_alt(SubLObject method) {
        return numE(ZERO_INTEGER, xref_method_definition_count(method));
    }

    @LispMethod(comment = "Return T iff METHOD is undefined in the current translation.")
    public static SubLObject xref_method_undefinedP(final SubLObject method) {
        return numE(ZERO_INTEGER, xref_method_definition_count(method));
    }

    public static final SubLObject xref_method_defining_xrm_alt(SubLObject method) {
        {
            SubLObject xrs = current_xref_system();
            if (NIL != xrs) {
                return xrs_method_defining_xrm(xrs, method);
            }
        }
        return NIL;
    }

    public static SubLObject xref_method_defining_xrm(final SubLObject method) {
        final SubLObject xrs = current_xref_system();
        if (NIL != xrs) {
            return xrs_method_defining_xrm(xrs, method);
        }
        return NIL;
    }

    /**
     * Return the module of the most recent definition of METHOD in the current translation.
     */
    @LispMethod(comment = "Return the module of the most recent definition of METHOD in the current translation.")
    public static final SubLObject xref_method_defining_module_alt(SubLObject method) {
        {
            SubLObject xrm = xref_method_defining_xrm(method);
            return NIL != xrm ? ((SubLObject) (xrm_name(xrm))) : NIL;
        }
    }

    @LispMethod(comment = "Return the module of the most recent definition of METHOD in the current translation.")
    public static SubLObject xref_method_defining_module(final SubLObject method) {
        final SubLObject xrm = xref_method_defining_xrm(method);
        return NIL != xrm ? xrm_name(xrm) : NIL;
    }

    /**
     * Return T iff METHOD has multiple definitions in the current translation.
     */
    @LispMethod(comment = "Return T iff METHOD has multiple definitions in the current translation.")
    public static final SubLObject xref_method_has_multiple_definitionsP_alt(SubLObject method) {
        return numLE(TWO_INTEGER, xref_method_definition_count(method));
    }

    @LispMethod(comment = "Return T iff METHOD has multiple definitions in the current translation.")
    public static SubLObject xref_method_has_multiple_definitionsP(final SubLObject method) {
        return numLE(TWO_INTEGER, xref_method_definition_count(method));
    }

    /**
     * Return a list of the modules in which METHOD has a definition in the current translation.
     */
    @LispMethod(comment = "Return a list of the modules in which METHOD has a definition in the current translation.")
    public static final SubLObject xref_method_defining_modules_alt(SubLObject method) {
        {
            SubLObject xrs = current_xref_system();
            if (NIL != xrs) {
                return nmapcar(symbol_function(XRM_NAME), xrs_method_defining_xrms(xrs, method));
            }
        }
        return NIL;
    }

    @LispMethod(comment = "Return a list of the modules in which METHOD has a definition in the current translation.")
    public static SubLObject xref_method_defining_modules(final SubLObject method) {
        final SubLObject xrs = current_xref_system();
        if (NIL != xrs) {
            return list_utilities.nmapcar(symbol_function(XRM_NAME), xrs_method_defining_xrms(xrs, method));
        }
        return NIL;
    }

    /**
     * Return the number of definitions for GLOBAL in the current translation.
     * 0 = undefined
     * 1 = single definition (normal)
     * >=2 = multiple definitions
     */
    @LispMethod(comment = "Return the number of definitions for GLOBAL in the current translation.\r\n0 = undefined\r\n1 = single definition (normal)\r\n>=2 = multiple definitions\nReturn the number of definitions for GLOBAL in the current translation.\n0 = undefined\n1 = single definition (normal)\n>=2 = multiple definitions")
    public static final SubLObject xref_global_definition_count_alt(SubLObject global) {
        {
            SubLObject xrs = current_xref_system();
            return NIL != xrs ? ((SubLObject) (xrs_global_definition_count(xrs, global))) : ZERO_INTEGER;
        }
    }

    @LispMethod(comment = "Return the number of definitions for GLOBAL in the current translation.\r\n0 = undefined\r\n1 = single definition (normal)\r\n>=2 = multiple definitions\nReturn the number of definitions for GLOBAL in the current translation.\n0 = undefined\n1 = single definition (normal)\n>=2 = multiple definitions")
    public static SubLObject xref_global_definition_count(final SubLObject global) {
        final SubLObject xrs = current_xref_system();
        return NIL != xrs ? xrs_global_definition_count(xrs, global) : ZERO_INTEGER;
    }

    /**
     * Return T iff GLOBAL is undefined in the current translation.
     */
    @LispMethod(comment = "Return T iff GLOBAL is undefined in the current translation.")
    public static final SubLObject xref_global_undefinedP_alt(SubLObject global) {
        return numE(ZERO_INTEGER, xref_global_definition_count(global));
    }

    @LispMethod(comment = "Return T iff GLOBAL is undefined in the current translation.")
    public static SubLObject xref_global_undefinedP(final SubLObject global) {
        return numE(ZERO_INTEGER, xref_global_definition_count(global));
    }

    public static final SubLObject xref_global_defining_xrm_alt(SubLObject global) {
        {
            SubLObject xrs = current_xref_system();
            if (NIL != xrs) {
                return xrs_global_defining_xrm(xrs, global);
            }
        }
        return NIL;
    }

    public static SubLObject xref_global_defining_xrm(final SubLObject global) {
        final SubLObject xrs = current_xref_system();
        if (NIL != xrs) {
            return xrs_global_defining_xrm(xrs, global);
        }
        return NIL;
    }

    /**
     * Return the module of the most recent definition of GLOBAL in the current translation.
     */
    @LispMethod(comment = "Return the module of the most recent definition of GLOBAL in the current translation.")
    public static final SubLObject xref_global_defining_module_alt(SubLObject global) {
        {
            SubLObject xrm = xref_global_defining_xrm(global);
            return NIL != xrm ? ((SubLObject) (xrm_name(xrm))) : NIL;
        }
    }

    @LispMethod(comment = "Return the module of the most recent definition of GLOBAL in the current translation.")
    public static SubLObject xref_global_defining_module(final SubLObject global) {
        final SubLObject xrm = xref_global_defining_xrm(global);
        return NIL != xrm ? xrm_name(xrm) : NIL;
    }

    /**
     * Return T iff GLOBAL has multiple definitions in the current translation.
     */
    @LispMethod(comment = "Return T iff GLOBAL has multiple definitions in the current translation.")
    public static final SubLObject xref_global_has_multiple_definitionsP_alt(SubLObject global) {
        return numLE(TWO_INTEGER, xref_global_definition_count(global));
    }

    @LispMethod(comment = "Return T iff GLOBAL has multiple definitions in the current translation.")
    public static SubLObject xref_global_has_multiple_definitionsP(final SubLObject global) {
        return numLE(TWO_INTEGER, xref_global_definition_count(global));
    }

    /**
     * Return a list of the modules in which GLOBAL has a definition in the current translation.
     */
    @LispMethod(comment = "Return a list of the modules in which GLOBAL has a definition in the current translation.")
    public static final SubLObject xref_global_defining_modules_alt(SubLObject global) {
        {
            SubLObject xrs = current_xref_system();
            if (NIL != xrs) {
                return nmapcar(symbol_function(XRM_NAME), xrs_global_defining_xrms(xrs, global));
            }
        }
        return NIL;
    }

    @LispMethod(comment = "Return a list of the modules in which GLOBAL has a definition in the current translation.")
    public static SubLObject xref_global_defining_modules(final SubLObject global) {
        final SubLObject xrs = current_xref_system();
        if (NIL != xrs) {
            return list_utilities.nmapcar(symbol_function(XRM_NAME), xrs_global_defining_xrms(xrs, global));
        }
        return NIL;
    }

    /**
     * Return the file position of the most recent definition
     * for METHOD in the current translation.
     */
    @LispMethod(comment = "Return the file position of the most recent definition\r\nfor METHOD in the current translation.\nReturn the file position of the most recent definition\nfor METHOD in the current translation.")
    public static final SubLObject xref_method_definition_position_alt(SubLObject method) {
        {
            SubLObject xrs = current_xref_system();
            if (NIL != xrs) {
                {
                    SubLObject xrm = xrs_method_defining_xrm(xrs, method);
                    if (NIL != xrm) {
                        return xrm_method_definition_postion(xrm, method);
                    }
                }
            }
        }
        return NIL;
    }

    @LispMethod(comment = "Return the file position of the most recent definition\r\nfor METHOD in the current translation.\nReturn the file position of the most recent definition\nfor METHOD in the current translation.")
    public static SubLObject xref_method_definition_position(final SubLObject method) {
        final SubLObject xrs = current_xref_system();
        if (NIL != xrs) {
            final SubLObject xrm = xrs_method_defining_xrm(xrs, method);
            if (NIL != xrm) {
                return xrm_method_definition_postion(xrm, method);
            }
        }
        return NIL;
    }

    /**
     * Return a list of (module . position) pairs indicating all the
     * definition positions for METHOD in the current translation.
     */
    @LispMethod(comment = "Return a list of (module . position) pairs indicating all the\r\ndefinition positions for METHOD in the current translation.\nReturn a list of (module . position) pairs indicating all the\ndefinition positions for METHOD in the current translation.")
    public static final SubLObject xref_method_definition_positions_alt(SubLObject method) {
        {
            SubLObject pcase_var = xref_method_definition_count(method);
            if (pcase_var.eql(ZERO_INTEGER)) {
                return NIL;
            } else {
                if (pcase_var.eql(ONE_INTEGER)) {
                    {
                        SubLObject module = xref_method_defining_module(method);
                        SubLObject position = xref_method_definition_position(method);
                        return list(cons(module, position));
                    }
                } else {
                    {
                        SubLObject xrs = current_xref_system();
                        SubLObject results = NIL;
                        SubLObject cdolist_list_var = xrs_method_defining_xrms(xrs, method);
                        SubLObject xrm = NIL;
                        for (xrm = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , xrm = cdolist_list_var.first()) {
                            {
                                SubLObject module = xrm_name(xrm);
                                SubLObject positions = xrm_method_definition_positions(xrm, method);
                                SubLObject cdolist_list_var_9 = positions;
                                SubLObject position = NIL;
                                for (position = cdolist_list_var_9.first(); NIL != cdolist_list_var_9; cdolist_list_var_9 = cdolist_list_var_9.rest() , position = cdolist_list_var_9.first()) {
                                    results = cons(cons(module, position), results);
                                }
                            }
                        }
                        return nreverse(results);
                    }
                }
            }
        }
    }

    @LispMethod(comment = "Return a list of (module . position) pairs indicating all the\r\ndefinition positions for METHOD in the current translation.\nReturn a list of (module . position) pairs indicating all the\ndefinition positions for METHOD in the current translation.")
    public static SubLObject xref_method_definition_positions(final SubLObject method) {
        final SubLObject pcase_var = xref_method_definition_count(method);
        if (pcase_var.eql(ZERO_INTEGER)) {
            return NIL;
        }
        if (pcase_var.eql(ONE_INTEGER)) {
            final SubLObject module = xref_method_defining_module(method);
            final SubLObject position = xref_method_definition_position(method);
            return list(cons(module, position));
        }
        final SubLObject xrs = current_xref_system();
        SubLObject results = NIL;
        SubLObject cdolist_list_var = xrs_method_defining_xrms(xrs, method);
        SubLObject xrm = NIL;
        xrm = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject module2 = xrm_name(xrm);
            SubLObject cdolist_list_var_$5;
            final SubLObject positions = cdolist_list_var_$5 = xrm_method_definition_positions(xrm, method);
            SubLObject position2 = NIL;
            position2 = cdolist_list_var_$5.first();
            while (NIL != cdolist_list_var_$5) {
                results = cons(cons(module2, position2), results);
                cdolist_list_var_$5 = cdolist_list_var_$5.rest();
                position2 = cdolist_list_var_$5.first();
            } 
            cdolist_list_var = cdolist_list_var.rest();
            xrm = cdolist_list_var.first();
        } 
        return nreverse(results);
    }

    /**
     * Return the file position of the most recent definition
     * for GLOBAL in the current translation.
     */
    @LispMethod(comment = "Return the file position of the most recent definition\r\nfor GLOBAL in the current translation.\nReturn the file position of the most recent definition\nfor GLOBAL in the current translation.")
    public static final SubLObject xref_global_definition_position_alt(SubLObject global) {
        {
            SubLObject xrs = current_xref_system();
            if (NIL != xrs) {
                {
                    SubLObject xrm = xrs_global_defining_xrm(xrs, global);
                    if (NIL != xrm) {
                        return xrm_global_definition_postion(xrm, global);
                    }
                }
            }
        }
        return NIL;
    }

    @LispMethod(comment = "Return the file position of the most recent definition\r\nfor GLOBAL in the current translation.\nReturn the file position of the most recent definition\nfor GLOBAL in the current translation.")
    public static SubLObject xref_global_definition_position(final SubLObject global) {
        final SubLObject xrs = current_xref_system();
        if (NIL != xrs) {
            final SubLObject xrm = xrs_global_defining_xrm(xrs, global);
            if (NIL != xrm) {
                return xrm_global_definition_postion(xrm, global);
            }
        }
        return NIL;
    }

    /**
     * Return a list of (module . position) pairs indicating all the
     * definition positions for GLOBAL in the current translation.
     */
    @LispMethod(comment = "Return a list of (module . position) pairs indicating all the\r\ndefinition positions for GLOBAL in the current translation.\nReturn a list of (module . position) pairs indicating all the\ndefinition positions for GLOBAL in the current translation.")
    public static final SubLObject xref_global_definition_positions_alt(SubLObject global) {
        {
            SubLObject pcase_var = xref_global_definition_count(global);
            if (pcase_var.eql(ZERO_INTEGER)) {
                return NIL;
            } else {
                if (pcase_var.eql(ONE_INTEGER)) {
                    {
                        SubLObject module = xref_global_defining_module(global);
                        SubLObject position = xref_global_definition_position(global);
                        return list(cons(module, position));
                    }
                } else {
                    {
                        SubLObject xrs = current_xref_system();
                        SubLObject results = NIL;
                        SubLObject cdolist_list_var = xrs_global_defining_xrms(xrs, global);
                        SubLObject xrm = NIL;
                        for (xrm = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , xrm = cdolist_list_var.first()) {
                            {
                                SubLObject module = xrm_name(xrm);
                                SubLObject positions = xrm_global_definition_positions(xrm, global);
                                SubLObject cdolist_list_var_10 = positions;
                                SubLObject position = NIL;
                                for (position = cdolist_list_var_10.first(); NIL != cdolist_list_var_10; cdolist_list_var_10 = cdolist_list_var_10.rest() , position = cdolist_list_var_10.first()) {
                                    results = cons(cons(module, position), results);
                                }
                            }
                        }
                        return nreverse(results);
                    }
                }
            }
        }
    }

    @LispMethod(comment = "Return a list of (module . position) pairs indicating all the\r\ndefinition positions for GLOBAL in the current translation.\nReturn a list of (module . position) pairs indicating all the\ndefinition positions for GLOBAL in the current translation.")
    public static SubLObject xref_global_definition_positions(final SubLObject global) {
        final SubLObject pcase_var = xref_global_definition_count(global);
        if (pcase_var.eql(ZERO_INTEGER)) {
            return NIL;
        }
        if (pcase_var.eql(ONE_INTEGER)) {
            final SubLObject module = xref_global_defining_module(global);
            final SubLObject position = xref_global_definition_position(global);
            return list(cons(module, position));
        }
        final SubLObject xrs = current_xref_system();
        SubLObject results = NIL;
        SubLObject cdolist_list_var = xrs_global_defining_xrms(xrs, global);
        SubLObject xrm = NIL;
        xrm = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject module2 = xrm_name(xrm);
            SubLObject cdolist_list_var_$6;
            final SubLObject positions = cdolist_list_var_$6 = xrm_global_definition_positions(xrm, global);
            SubLObject position2 = NIL;
            position2 = cdolist_list_var_$6.first();
            while (NIL != cdolist_list_var_$6) {
                results = cons(cons(module2, position2), results);
                cdolist_list_var_$6 = cdolist_list_var_$6.rest();
                position2 = cdolist_list_var_$6.first();
            } 
            cdolist_list_var = cdolist_list_var.rest();
            xrm = cdolist_list_var.first();
        } 
        return nreverse(results);
    }

    /**
     * Return a list of methods defined in MODULE, in order of most recent definition.
     */
    @LispMethod(comment = "Return a list of methods defined in MODULE, in order of most recent definition.")
    public static final SubLObject xref_methods_defined_by_module_alt(SubLObject module) {
        SubLTrampolineFile.checkType(module, STRINGP);
        {
            SubLObject xrm = xref_find_xrm_by_module(module);
            if (NIL != xrm) {
                {
                    SubLObject v_methods = nreverse(Mapping.mapcar(symbol_function(CAR), xrm_method_definitions(xrm)));
                    if (NIL != xrm_has_multiple_method_definitionsP(xrm)) {
                        return fast_delete_duplicates(v_methods, symbol_function(EQ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    } else {
                        return v_methods;
                    }
                }
            }
        }
        return NIL;
    }

    @LispMethod(comment = "Return a list of methods defined in MODULE, in order of most recent definition.")
    public static SubLObject xref_methods_defined_by_module(final SubLObject module) {
        assert NIL != stringp(module) : "! stringp(module) " + ("Types.stringp(module) " + "CommonSymbols.NIL != Types.stringp(module) ") + module;
        final SubLObject xrm = xref_find_xrm_by_module(module);
        if (NIL == xrm) {
            return NIL;
        }
        final SubLObject v_methods = nreverse(Mapping.mapcar(symbol_function(CAR), xrm_method_definitions(xrm)));
        if (NIL != xrm_has_multiple_method_definitionsP(xrm)) {
            return list_utilities.fast_delete_duplicates(v_methods, symbol_function(EQ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        return v_methods;
    }

    /**
     * Return the number of definitions for METHOD in module.
     */
    @LispMethod(comment = "Return the number of definitions for METHOD in module.")
    public static final SubLObject xref_module_method_definition_count_alt(SubLObject module, SubLObject method) {
        SubLTrampolineFile.checkType(module, STRINGP);
        SubLTrampolineFile.checkType(method, SYMBOLP);
        {
            SubLObject xrm = xref_find_xrm_by_module(module);
            if (NIL != xrm) {
                if (NIL != xrm_has_multiple_method_definitionsP(xrm)) {
                    return count(method, xrm_method_definitions(xrm), symbol_function(EQ), symbol_function(CAR), UNPROVIDED, UNPROVIDED);
                } else {
                    return NIL != dictionary.dictionary_lookup_without_values(xrm_method_position_table(xrm), method, UNPROVIDED) ? ((SubLObject) (ONE_INTEGER)) : ZERO_INTEGER;
                }
            } else {
                return ZERO_INTEGER;
            }
        }
    }

    @LispMethod(comment = "Return the number of definitions for METHOD in module.")
    public static SubLObject xref_module_method_definition_count(final SubLObject module, final SubLObject method) {
        assert NIL != stringp(module) : "! stringp(module) " + ("Types.stringp(module) " + "CommonSymbols.NIL != Types.stringp(module) ") + module;
        assert NIL != symbolp(method) : "! symbolp(method) " + ("Types.symbolp(method) " + "CommonSymbols.NIL != Types.symbolp(method) ") + method;
        final SubLObject xrm = xref_find_xrm_by_module(module);
        if (NIL == xrm) {
            return ZERO_INTEGER;
        }
        if (NIL != xrm_has_multiple_method_definitionsP(xrm)) {
            return count(method, xrm_method_definitions(xrm), symbol_function(EQ), symbol_function(CAR), UNPROVIDED, UNPROVIDED);
        }
        return NIL != dictionary.dictionary_lookup_without_values(xrm_method_position_table(xrm), method, UNPROVIDED) ? ONE_INTEGER : ZERO_INTEGER;
    }

    /**
     * Return a list of the file positions of all the definitions for METHOD in MODULE.
     */
    @LispMethod(comment = "Return a list of the file positions of all the definitions for METHOD in MODULE.")
    public static final SubLObject xref_module_method_definition_positions_alt(SubLObject module, SubLObject method) {
        SubLTrampolineFile.checkType(module, STRINGP);
        SubLTrampolineFile.checkType(method, SYMBOLP);
        {
            SubLObject xrm = xref_find_xrm_by_module(module);
            if (NIL != xrm) {
                if (NIL != xrm_has_multiple_method_definitionsP(xrm)) {
                    {
                        SubLObject all_position_info = xrm_method_definitions(xrm);
                        SubLObject position_info = remove(method, all_position_info, symbol_function(NOT_EQ), symbol_function(CAR), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        SubLObject positions = nmapcar(symbol_function(CDR), position_info);
                        return positions;
                    }
                } else {
                    {
                        SubLObject table = xrm_method_position_table(xrm);
                        SubLObject position = dictionary.dictionary_lookup_without_values(table, method, UNPROVIDED);
                        return NIL != position ? ((SubLObject) (list(position))) : NIL;
                    }
                }
            }
        }
        return NIL;
    }

    @LispMethod(comment = "Return a list of the file positions of all the definitions for METHOD in MODULE.")
    public static SubLObject xref_module_method_definition_positions(final SubLObject module, final SubLObject method) {
        assert NIL != stringp(module) : "! stringp(module) " + ("Types.stringp(module) " + "CommonSymbols.NIL != Types.stringp(module) ") + module;
        assert NIL != symbolp(method) : "! symbolp(method) " + ("Types.symbolp(method) " + "CommonSymbols.NIL != Types.symbolp(method) ") + method;
        final SubLObject xrm = xref_find_xrm_by_module(module);
        if (NIL == xrm) {
            return NIL;
        }
        if (NIL != xrm_has_multiple_method_definitionsP(xrm)) {
            final SubLObject all_position_info = xrm_method_definitions(xrm);
            final SubLObject position_info = remove(method, all_position_info, symbol_function(NOT_EQ), symbol_function(CAR), UNPROVIDED, UNPROVIDED, UNPROVIDED);
            final SubLObject positions = list_utilities.nmapcar(symbol_function(CDR), position_info);
            return positions;
        }
        final SubLObject table = xrm_method_position_table(xrm);
        final SubLObject position = dictionary.dictionary_lookup_without_values(table, method, UNPROVIDED);
        return NIL != position ? list(position) : NIL;
    }

    /**
     * Return a list of globals defined in MODULE, in order of most recent definition.
     */
    @LispMethod(comment = "Return a list of globals defined in MODULE, in order of most recent definition.")
    public static final SubLObject xref_globals_defined_by_module_alt(SubLObject module) {
        SubLTrampolineFile.checkType(module, STRINGP);
        {
            SubLObject xrm = xref_find_xrm_by_module(module);
            if (NIL != xrm) {
                {
                    SubLObject globals = nreverse(Mapping.mapcar(symbol_function(CAR), xrm_global_definitions(xrm)));
                    if (NIL != xrm_has_multiple_global_definitionsP(xrm)) {
                        return fast_delete_duplicates(globals, symbol_function(EQ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    } else {
                        return globals;
                    }
                }
            }
        }
        return NIL;
    }

    @LispMethod(comment = "Return a list of globals defined in MODULE, in order of most recent definition.")
    public static SubLObject xref_globals_defined_by_module(final SubLObject module) {
        assert NIL != stringp(module) : "! stringp(module) " + ("Types.stringp(module) " + "CommonSymbols.NIL != Types.stringp(module) ") + module;
        final SubLObject xrm = xref_find_xrm_by_module(module);
        if (NIL == xrm) {
            return NIL;
        }
        final SubLObject globals = nreverse(Mapping.mapcar(symbol_function(CAR), xrm_global_definitions(xrm)));
        if (NIL != xrm_has_multiple_global_definitionsP(xrm)) {
            return list_utilities.fast_delete_duplicates(globals, symbol_function(EQ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        return globals;
    }

    /**
     * Return the number of definitions for GLOBAL in module.
     */
    @LispMethod(comment = "Return the number of definitions for GLOBAL in module.")
    public static final SubLObject xref_module_global_definition_count_alt(SubLObject module, SubLObject global) {
        SubLTrampolineFile.checkType(module, STRINGP);
        SubLTrampolineFile.checkType(global, SYMBOLP);
        {
            SubLObject xrm = xref_find_xrm_by_module(module);
            if (NIL != xrm) {
                if (NIL != xrm_has_multiple_global_definitionsP(xrm)) {
                    return count(global, xrm_global_definitions(xrm), symbol_function(EQ), symbol_function(CAR), UNPROVIDED, UNPROVIDED);
                } else {
                    return NIL != dictionary.dictionary_lookup_without_values(xrm_global_position_table(xrm), global, UNPROVIDED) ? ((SubLObject) (ONE_INTEGER)) : ZERO_INTEGER;
                }
            } else {
                return ZERO_INTEGER;
            }
        }
    }

    @LispMethod(comment = "Return the number of definitions for GLOBAL in module.")
    public static SubLObject xref_module_global_definition_count(final SubLObject module, final SubLObject global) {
        assert NIL != stringp(module) : "! stringp(module) " + ("Types.stringp(module) " + "CommonSymbols.NIL != Types.stringp(module) ") + module;
        assert NIL != symbolp(global) : "! symbolp(global) " + ("Types.symbolp(global) " + "CommonSymbols.NIL != Types.symbolp(global) ") + global;
        final SubLObject xrm = xref_find_xrm_by_module(module);
        if (NIL == xrm) {
            return ZERO_INTEGER;
        }
        if (NIL != xrm_has_multiple_global_definitionsP(xrm)) {
            return count(global, xrm_global_definitions(xrm), symbol_function(EQ), symbol_function(CAR), UNPROVIDED, UNPROVIDED);
        }
        return NIL != dictionary.dictionary_lookup_without_values(xrm_global_position_table(xrm), global, UNPROVIDED) ? ONE_INTEGER : ZERO_INTEGER;
    }

    /**
     * Return a list of the file positions of all the definitions for GLOBAL in MODULE.
     */
    @LispMethod(comment = "Return a list of the file positions of all the definitions for GLOBAL in MODULE.")
    public static final SubLObject xref_module_global_definition_positions_alt(SubLObject module, SubLObject global) {
        SubLTrampolineFile.checkType(module, STRINGP);
        SubLTrampolineFile.checkType(global, SYMBOLP);
        {
            SubLObject xrm = xref_find_xrm_by_module(module);
            if (NIL != xrm) {
                if (NIL != xrm_has_multiple_global_definitionsP(xrm)) {
                    {
                        SubLObject all_position_info = xrm_global_definitions(xrm);
                        SubLObject position_info = remove(global, all_position_info, symbol_function(NOT_EQ), symbol_function(CAR), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        SubLObject positions = nmapcar(symbol_function(CDR), position_info);
                        return positions;
                    }
                } else {
                    {
                        SubLObject table = xrm_global_position_table(xrm);
                        SubLObject position = dictionary.dictionary_lookup_without_values(table, global, UNPROVIDED);
                        return NIL != position ? ((SubLObject) (list(position))) : NIL;
                    }
                }
            }
        }
        return NIL;
    }

    @LispMethod(comment = "Return a list of the file positions of all the definitions for GLOBAL in MODULE.")
    public static SubLObject xref_module_global_definition_positions(final SubLObject module, final SubLObject global) {
        assert NIL != stringp(module) : "! stringp(module) " + ("Types.stringp(module) " + "CommonSymbols.NIL != Types.stringp(module) ") + module;
        assert NIL != symbolp(global) : "! symbolp(global) " + ("Types.symbolp(global) " + "CommonSymbols.NIL != Types.symbolp(global) ") + global;
        final SubLObject xrm = xref_find_xrm_by_module(module);
        if (NIL == xrm) {
            return NIL;
        }
        if (NIL != xrm_has_multiple_global_definitionsP(xrm)) {
            final SubLObject all_position_info = xrm_global_definitions(xrm);
            final SubLObject position_info = remove(global, all_position_info, symbol_function(NOT_EQ), symbol_function(CAR), UNPROVIDED, UNPROVIDED, UNPROVIDED);
            final SubLObject positions = list_utilities.nmapcar(symbol_function(CDR), position_info);
            return positions;
        }
        final SubLObject table = xrm_global_position_table(xrm);
        final SubLObject position = dictionary.dictionary_lookup_without_values(table, global, UNPROVIDED);
        return NIL != position ? list(position) : NIL;
    }

    /**
     * Return T iff CLIENT-METHOD is called by METHOD.
     */
    @LispMethod(comment = "Return T iff CLIENT-METHOD is called by METHOD.")
    public static final SubLObject xref_method_called_by_methodP_alt(SubLObject client_method, SubLObject method) {
        {
            SubLObject xrm = xref_method_defining_xrm(method);
            if (NIL != xrm) {
                {
                    SubLObject table = xref_m_method_method_table(xrm);
                    SubLObject method_set = dictionary.dictionary_lookup_without_values(table, method, NIL);
                    return member_eqP(client_method, method_set);
                }
            }
        }
        return NIL;
    }

    @LispMethod(comment = "Return T iff CLIENT-METHOD is called by METHOD.")
    public static SubLObject xref_method_called_by_methodP(final SubLObject client_method, final SubLObject method) {
        final SubLObject xrm = xref_method_defining_xrm(method);
        if (NIL != xrm) {
            final SubLObject table = xref_m_method_method_table(xrm);
            final SubLObject method_set = dictionary.dictionary_lookup_without_values(table, method, NIL);
            return list_utilities.member_eqP(client_method, method_set);
        }
        return NIL;
    }

    /**
     * Return a list of all the methods called by METHOD.
     */
    @LispMethod(comment = "Return a list of all the methods called by METHOD.")
    public static final SubLObject xref_methods_called_by_method_alt(SubLObject method) {
        {
            SubLObject xrm = xref_method_defining_xrm(method);
            if (NIL != xrm) {
                {
                    SubLObject table = xref_m_method_method_table(xrm);
                    SubLObject method_set = dictionary.dictionary_lookup_without_values(table, method, NIL);
                    return copy_list(method_set);
                }
            }
        }
        return NIL;
    }

    @LispMethod(comment = "Return a list of all the methods called by METHOD.")
    public static SubLObject xref_methods_called_by_method(final SubLObject method) {
        final SubLObject xrm = xref_method_defining_xrm(method);
        if (NIL != xrm) {
            final SubLObject table = xref_m_method_method_table(xrm);
            final SubLObject method_set = dictionary.dictionary_lookup_without_values(table, method, NIL);
            return copy_list(method_set);
        }
        return NIL;
    }

    /**
     * Return a list of all the globals referenced by METHOD.
     */
    @LispMethod(comment = "Return a list of all the globals referenced by METHOD.")
    public static final SubLObject xref_globals_referenced_by_method_alt(SubLObject method) {
        {
            SubLObject xrm = xref_method_defining_xrm(method);
            if (NIL != xrm) {
                {
                    SubLObject table = xref_m_method_global_reference_table(xrm);
                    SubLObject global_set = dictionary.dictionary_lookup_without_values(table, method, NIL);
                    return copy_list(global_set);
                }
            }
        }
        return NIL;
    }

    @LispMethod(comment = "Return a list of all the globals referenced by METHOD.")
    public static SubLObject xref_globals_referenced_by_method(final SubLObject method) {
        final SubLObject xrm = xref_method_defining_xrm(method);
        if (NIL != xrm) {
            final SubLObject table = xref_m_method_global_reference_table(xrm);
            final SubLObject global_set = dictionary.dictionary_lookup_without_values(table, method, NIL);
            return copy_list(global_set);
        }
        return NIL;
    }

    /**
     * Return a list of all the globals modified by METHOD.
     */
    @LispMethod(comment = "Return a list of all the globals modified by METHOD.")
    public static final SubLObject xref_globals_modified_by_method_alt(SubLObject method) {
        {
            SubLObject xrm = xref_method_defining_xrm(method);
            if (NIL != xrm) {
                {
                    SubLObject table = xref_m_method_global_modification_table(xrm);
                    SubLObject global_set = dictionary.dictionary_lookup_without_values(table, method, NIL);
                    return copy_list(global_set);
                }
            }
        }
        return NIL;
    }

    @LispMethod(comment = "Return a list of all the globals modified by METHOD.")
    public static SubLObject xref_globals_modified_by_method(final SubLObject method) {
        final SubLObject xrm = xref_method_defining_xrm(method);
        if (NIL != xrm) {
            final SubLObject table = xref_m_method_global_modification_table(xrm);
            final SubLObject global_set = dictionary.dictionary_lookup_without_values(table, method, NIL);
            return copy_list(global_set);
        }
        return NIL;
    }

    /**
     * Return a list of all the globals rebound by METHOD.
     */
    @LispMethod(comment = "Return a list of all the globals rebound by METHOD.")
    public static final SubLObject xref_globals_rebound_by_method_alt(SubLObject method) {
        {
            SubLObject xrm = xref_method_defining_xrm(method);
            if (NIL != xrm) {
                {
                    SubLObject table = xref_m_method_global_binding_table(xrm);
                    SubLObject global_set = dictionary.dictionary_lookup_without_values(table, method, NIL);
                    return copy_list(global_set);
                }
            }
        }
        return NIL;
    }

    @LispMethod(comment = "Return a list of all the globals rebound by METHOD.")
    public static SubLObject xref_globals_rebound_by_method(final SubLObject method) {
        final SubLObject xrm = xref_method_defining_xrm(method);
        if (NIL != xrm) {
            final SubLObject table = xref_m_method_global_binding_table(xrm);
            final SubLObject global_set = dictionary.dictionary_lookup_without_values(table, method, NIL);
            return copy_list(global_set);
        }
        return NIL;
    }

    /**
     * Return a list of all the globals accessed (referenced, modified or rebound) by METHOD.
     */
    @LispMethod(comment = "Return a list of all the globals accessed (referenced, modified or rebound) by METHOD.")
    public static final SubLObject xref_globals_accessed_by_method_alt(SubLObject method) {
        return fast_delete_duplicates(nconc(xref_globals_referenced_by_method(method), xref_globals_modified_by_method(method), xref_globals_rebound_by_method(method)), symbol_function(EQ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    @LispMethod(comment = "Return a list of all the globals accessed (referenced, modified or rebound) by METHOD.")
    public static SubLObject xref_globals_accessed_by_method(final SubLObject method) {
        return list_utilities.fast_delete_duplicates(nconc(xref_globals_referenced_by_method(method), xref_globals_modified_by_method(method), xref_globals_rebound_by_method(method)), symbol_function(EQ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    /**
     * Return T iff CLIENT-METHOD is called by GLOBAL.
     */
    @LispMethod(comment = "Return T iff CLIENT-METHOD is called by GLOBAL.")
    public static final SubLObject xref_method_called_by_globalP_alt(SubLObject client_method, SubLObject global) {
        {
            SubLObject xrm = xref_global_defining_xrm(global);
            if (NIL != xrm) {
                {
                    SubLObject table = xref_m_global_method_table(xrm);
                    SubLObject method_set = dictionary.dictionary_lookup_without_values(table, global, NIL);
                    return member_eqP(client_method, method_set);
                }
            }
        }
        return NIL;
    }

    @LispMethod(comment = "Return T iff CLIENT-METHOD is called by GLOBAL.")
    public static SubLObject xref_method_called_by_globalP(final SubLObject client_method, final SubLObject global) {
        final SubLObject xrm = xref_global_defining_xrm(global);
        if (NIL != xrm) {
            final SubLObject table = xref_m_global_method_table(xrm);
            final SubLObject method_set = dictionary.dictionary_lookup_without_values(table, global, NIL);
            return list_utilities.member_eqP(client_method, method_set);
        }
        return NIL;
    }

    /**
     * Return a list of all the methods called by GLOBAL.
     */
    @LispMethod(comment = "Return a list of all the methods called by GLOBAL.")
    public static final SubLObject xref_methods_called_by_global_alt(SubLObject global) {
        {
            SubLObject xrm = xref_global_defining_xrm(global);
            if (NIL != xrm) {
                {
                    SubLObject table = xref_m_global_method_table(xrm);
                    SubLObject method_set = dictionary.dictionary_lookup_without_values(table, global, NIL);
                    return copy_list(method_set);
                }
            }
        }
        return NIL;
    }

    @LispMethod(comment = "Return a list of all the methods called by GLOBAL.")
    public static SubLObject xref_methods_called_by_global(final SubLObject global) {
        final SubLObject xrm = xref_global_defining_xrm(global);
        if (NIL != xrm) {
            final SubLObject table = xref_m_global_method_table(xrm);
            final SubLObject method_set = dictionary.dictionary_lookup_without_values(table, global, NIL);
            return copy_list(method_set);
        }
        return NIL;
    }

    /**
     * Return a list of all the globals referenced by GLOBAL.
     */
    @LispMethod(comment = "Return a list of all the globals referenced by GLOBAL.")
    public static final SubLObject xref_globals_referenced_by_global_alt(SubLObject global) {
        {
            SubLObject xrm = xref_global_defining_xrm(global);
            if (NIL != xrm) {
                {
                    SubLObject table = xref_m_global_global_reference_table(xrm);
                    SubLObject global_set = dictionary.dictionary_lookup_without_values(table, global, NIL);
                    return copy_list(global_set);
                }
            }
        }
        return NIL;
    }

    @LispMethod(comment = "Return a list of all the globals referenced by GLOBAL.")
    public static SubLObject xref_globals_referenced_by_global(final SubLObject global) {
        final SubLObject xrm = xref_global_defining_xrm(global);
        if (NIL != xrm) {
            final SubLObject table = xref_m_global_global_reference_table(xrm);
            final SubLObject global_set = dictionary.dictionary_lookup_without_values(table, global, NIL);
            return copy_list(global_set);
        }
        return NIL;
    }

    /**
     * Return T iff CLIENT-METHOD is called by some top-level form in MODULE.
     */
    @LispMethod(comment = "Return T iff CLIENT-METHOD is called by some top-level form in MODULE.")
    public static final SubLObject xref_method_called_by_moduleP_alt(SubLObject client_method, SubLObject module) {
        {
            SubLObject xrm = xref_find_xrm_by_module(module);
            if (NIL != xrm) {
                {
                    SubLObject table = xref_m_top_method_table(xrm);
                    SubLObject positions = dictionary.dictionary_lookup_without_values(table, client_method, NIL);
                    return sublisp_boolean(positions);
                }
            }
        }
        return NIL;
    }

    @LispMethod(comment = "Return T iff CLIENT-METHOD is called by some top-level form in MODULE.")
    public static SubLObject xref_method_called_by_moduleP(final SubLObject client_method, final SubLObject module) {
        final SubLObject xrm = xref_find_xrm_by_module(module);
        if (NIL != xrm) {
            final SubLObject table = xref_m_top_method_table(xrm);
            final SubLObject positions = dictionary.dictionary_lookup_without_values(table, client_method, NIL);
            return list_utilities.sublisp_boolean(positions);
        }
        return NIL;
    }

    /**
     * Return a list of the file positions in MODULE with top-level calls to CLIENT-METHOD.
     */
    @LispMethod(comment = "Return a list of the file positions in MODULE with top-level calls to CLIENT-METHOD.")
    public static final SubLObject xref_module_positions_calling_method_alt(SubLObject module, SubLObject client_method) {
        {
            SubLObject xrm = xref_find_xrm_by_module(module);
            if (NIL != xrm) {
                {
                    SubLObject table = xref_m_top_method_table(xrm);
                    SubLObject positions = dictionary.dictionary_lookup_without_values(table, client_method, NIL);
                    return copy_list(positions);
                }
            }
        }
        return NIL;
    }

    @LispMethod(comment = "Return a list of the file positions in MODULE with top-level calls to CLIENT-METHOD.")
    public static SubLObject xref_module_positions_calling_method(final SubLObject module, final SubLObject client_method) {
        final SubLObject xrm = xref_find_xrm_by_module(module);
        if (NIL != xrm) {
            final SubLObject table = xref_m_top_method_table(xrm);
            final SubLObject positions = dictionary.dictionary_lookup_without_values(table, client_method, NIL);
            return copy_list(positions);
        }
        return NIL;
    }

    /**
     * Return a list of all the methods called by top-level forms in MODULE.
     */
    @LispMethod(comment = "Return a list of all the methods called by top-level forms in MODULE.")
    public static final SubLObject xref_methods_called_by_module_alt(SubLObject module) {
        {
            SubLObject xrm = xref_find_xrm_by_module(module);
            if (NIL != xrm) {
                {
                    SubLObject table = xref_m_top_method_table(xrm);
                    return dictionary.dictionary_keys(table);
                }
            }
        }
        return NIL;
    }

    @LispMethod(comment = "Return a list of all the methods called by top-level forms in MODULE.")
    public static SubLObject xref_methods_called_by_module(final SubLObject module) {
        final SubLObject xrm = xref_find_xrm_by_module(module);
        if (NIL != xrm) {
            final SubLObject table = xref_m_top_method_table(xrm);
            return dictionary.dictionary_keys(table);
        }
        return NIL;
    }

    /**
     * Return a list of the file positions in MODULE with top-level calls that reference CLIENT-GLOBAL.
     */
    @LispMethod(comment = "Return a list of the file positions in MODULE with top-level calls that reference CLIENT-GLOBAL.")
    public static final SubLObject xref_module_positions_referencing_global_alt(SubLObject module, SubLObject client_global) {
        {
            SubLObject xrm = xref_find_xrm_by_module(module);
            if (NIL != xrm) {
                {
                    SubLObject table = xref_m_top_global_reference_table(xrm);
                    SubLObject positions = dictionary.dictionary_lookup_without_values(table, client_global, NIL);
                    return copy_list(positions);
                }
            }
        }
        return NIL;
    }

    @LispMethod(comment = "Return a list of the file positions in MODULE with top-level calls that reference CLIENT-GLOBAL.")
    public static SubLObject xref_module_positions_referencing_global(final SubLObject module, final SubLObject client_global) {
        final SubLObject xrm = xref_find_xrm_by_module(module);
        if (NIL != xrm) {
            final SubLObject table = xref_m_top_global_reference_table(xrm);
            final SubLObject positions = dictionary.dictionary_lookup_without_values(table, client_global, NIL);
            return copy_list(positions);
        }
        return NIL;
    }

    /**
     * Return a list of all the globals referenced in a top-level form in MODULE.
     */
    @LispMethod(comment = "Return a list of all the globals referenced in a top-level form in MODULE.")
    public static final SubLObject xref_globals_referenced_by_module_alt(SubLObject module) {
        {
            SubLObject xrm = xref_find_xrm_by_module(module);
            if (NIL != xrm) {
                {
                    SubLObject table = xref_m_top_global_reference_table(xrm);
                    return dictionary.dictionary_keys(table);
                }
            }
        }
        return NIL;
    }

    @LispMethod(comment = "Return a list of all the globals referenced in a top-level form in MODULE.")
    public static SubLObject xref_globals_referenced_by_module(final SubLObject module) {
        final SubLObject xrm = xref_find_xrm_by_module(module);
        if (NIL != xrm) {
            final SubLObject table = xref_m_top_global_reference_table(xrm);
            return dictionary.dictionary_keys(table);
        }
        return NIL;
    }

    /**
     * Return a list of the file positions in MODULE with top-level calls that modify CLIENT-GLOBAL.
     */
    @LispMethod(comment = "Return a list of the file positions in MODULE with top-level calls that modify CLIENT-GLOBAL.")
    public static final SubLObject xref_module_positions_modifying_global_alt(SubLObject module, SubLObject client_global) {
        {
            SubLObject xrm = xref_find_xrm_by_module(module);
            if (NIL != xrm) {
                {
                    SubLObject table = xref_m_top_global_modification_table(xrm);
                    SubLObject positions = dictionary.dictionary_lookup_without_values(table, client_global, NIL);
                    return copy_list(positions);
                }
            }
        }
        return NIL;
    }

    @LispMethod(comment = "Return a list of the file positions in MODULE with top-level calls that modify CLIENT-GLOBAL.")
    public static SubLObject xref_module_positions_modifying_global(final SubLObject module, final SubLObject client_global) {
        final SubLObject xrm = xref_find_xrm_by_module(module);
        if (NIL != xrm) {
            final SubLObject table = xref_m_top_global_modification_table(xrm);
            final SubLObject positions = dictionary.dictionary_lookup_without_values(table, client_global, NIL);
            return copy_list(positions);
        }
        return NIL;
    }

    /**
     * Return a list of all the globals modified in a top-level form in MODULE.
     */
    @LispMethod(comment = "Return a list of all the globals modified in a top-level form in MODULE.")
    public static final SubLObject xref_globals_modified_by_module_alt(SubLObject module) {
        {
            SubLObject xrm = xref_find_xrm_by_module(module);
            if (NIL != xrm) {
                {
                    SubLObject table = xref_m_top_global_modification_table(xrm);
                    return dictionary.dictionary_keys(table);
                }
            }
        }
        return NIL;
    }

    @LispMethod(comment = "Return a list of all the globals modified in a top-level form in MODULE.")
    public static SubLObject xref_globals_modified_by_module(final SubLObject module) {
        final SubLObject xrm = xref_find_xrm_by_module(module);
        if (NIL != xrm) {
            final SubLObject table = xref_m_top_global_modification_table(xrm);
            return dictionary.dictionary_keys(table);
        }
        return NIL;
    }

    /**
     * Return a list of the file positions in MODULE with top-level calls that rebind CLIENT-GLOBAL.
     */
    @LispMethod(comment = "Return a list of the file positions in MODULE with top-level calls that rebind CLIENT-GLOBAL.")
    public static final SubLObject xref_module_positions_rebinding_global_alt(SubLObject module, SubLObject client_global) {
        {
            SubLObject xrm = xref_find_xrm_by_module(module);
            if (NIL != xrm) {
                {
                    SubLObject table = xref_m_top_global_binding_table(xrm);
                    SubLObject positions = dictionary.dictionary_lookup_without_values(table, client_global, NIL);
                    return copy_list(positions);
                }
            }
        }
        return NIL;
    }

    @LispMethod(comment = "Return a list of the file positions in MODULE with top-level calls that rebind CLIENT-GLOBAL.")
    public static SubLObject xref_module_positions_rebinding_global(final SubLObject module, final SubLObject client_global) {
        final SubLObject xrm = xref_find_xrm_by_module(module);
        if (NIL != xrm) {
            final SubLObject table = xref_m_top_global_binding_table(xrm);
            final SubLObject positions = dictionary.dictionary_lookup_without_values(table, client_global, NIL);
            return copy_list(positions);
        }
        return NIL;
    }

    /**
     * Return a list of all the globals rebound in a top-level form in MODULE.
     */
    @LispMethod(comment = "Return a list of all the globals rebound in a top-level form in MODULE.")
    public static final SubLObject xref_globals_rebound_by_module_alt(SubLObject module) {
        {
            SubLObject xrm = xref_find_xrm_by_module(module);
            if (NIL != xrm) {
                {
                    SubLObject table = xref_m_top_global_binding_table(xrm);
                    return dictionary.dictionary_keys(table);
                }
            }
        }
        return NIL;
    }

    @LispMethod(comment = "Return a list of all the globals rebound in a top-level form in MODULE.")
    public static SubLObject xref_globals_rebound_by_module(final SubLObject module) {
        final SubLObject xrm = xref_find_xrm_by_module(module);
        if (NIL != xrm) {
            final SubLObject table = xref_m_top_global_binding_table(xrm);
            return dictionary.dictionary_keys(table);
        }
        return NIL;
    }

    /**
     * Return a list of the file positions in MODULE with top-level calls that
     * access (reference, modify or rebind) CLIENT-GLOBAL.
     */
    @LispMethod(comment = "Return a list of the file positions in MODULE with top-level calls that\r\naccess (reference, modify or rebind) CLIENT-GLOBAL.\nReturn a list of the file positions in MODULE with top-level calls that\naccess (reference, modify or rebind) CLIENT-GLOBAL.")
    public static final SubLObject xref_module_positions_accessing_global_alt(SubLObject module, SubLObject client_global) {
        return fast_delete_duplicates(nconc(xref_module_positions_referencing_global(module, client_global), xref_module_positions_modifying_global(module, client_global), xref_module_positions_rebinding_global(module, client_global)), symbol_function(EQL), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    @LispMethod(comment = "Return a list of the file positions in MODULE with top-level calls that\r\naccess (reference, modify or rebind) CLIENT-GLOBAL.\nReturn a list of the file positions in MODULE with top-level calls that\naccess (reference, modify or rebind) CLIENT-GLOBAL.")
    public static SubLObject xref_module_positions_accessing_global(final SubLObject module, final SubLObject client_global) {
        return list_utilities.fast_delete_duplicates(nconc(xref_module_positions_referencing_global(module, client_global), xref_module_positions_modifying_global(module, client_global), xref_module_positions_rebinding_global(module, client_global)), symbol_function(EQL), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    /**
     * Return a list of all the globals accessed (referenced, modified or rebound) in a top-level form in MODULE.
     */
    @LispMethod(comment = "Return a list of all the globals accessed (referenced, modified or rebound) in a top-level form in MODULE.")
    public static final SubLObject xref_globals_accessed_by_module_alt(SubLObject module) {
        return fast_delete_duplicates(nconc(xref_globals_referenced_by_module(module), xref_globals_modified_by_module(module), xref_globals_rebound_by_module(module)), symbol_function(EQ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    @LispMethod(comment = "Return a list of all the globals accessed (referenced, modified or rebound) in a top-level form in MODULE.")
    public static SubLObject xref_globals_accessed_by_module(final SubLObject module) {
        return list_utilities.fast_delete_duplicates(nconc(xref_globals_referenced_by_module(module), xref_globals_modified_by_module(module), xref_globals_rebound_by_module(module)), symbol_function(EQ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    /**
     * Return a list of all the methods that call METHOD.
     */
    @LispMethod(comment = "Return a list of all the methods that call METHOD.")
    public static final SubLObject xref_methods_that_call_method_alt(SubLObject method) {
        {
            SubLObject xrs = current_xref_system();
            if (NIL != xrs) {
                {
                    SubLObject table = xref_s_method_called_by_method_table(xrs);
                    SubLObject method_set = gethash_without_values(method, table, UNPROVIDED);
                    return set_contents.set_contents_element_list(method_set);
                }
            }
        }
        return NIL;
    }

    @LispMethod(comment = "Return a list of all the methods that call METHOD.")
    public static SubLObject xref_methods_that_call_method(final SubLObject method) {
        final SubLObject xrs = current_xref_system();
        if (NIL != xrs) {
            final SubLObject table = xref_s_method_called_by_method_table(xrs);
            final SubLObject method_set = gethash_without_values(method, table, UNPROVIDED);
            return set_contents.set_contents_element_list(method_set);
        }
        return NIL;
    }

    /**
     * Return a list of all the globals whose initializations call METHOD.
     */
    @LispMethod(comment = "Return a list of all the globals whose initializations call METHOD.")
    public static final SubLObject xref_globals_that_call_method_alt(SubLObject method) {
        {
            SubLObject xrs = current_xref_system();
            if (NIL != xrs) {
                {
                    SubLObject table = xref_s_method_called_by_global_table(xrs);
                    SubLObject global_set = gethash_without_values(method, table, UNPROVIDED);
                    return set_contents.set_contents_element_list(global_set);
                }
            }
        }
        return NIL;
    }

    @LispMethod(comment = "Return a list of all the globals whose initializations call METHOD.")
    public static SubLObject xref_globals_that_call_method(final SubLObject method) {
        final SubLObject xrs = current_xref_system();
        if (NIL != xrs) {
            final SubLObject table = xref_s_method_called_by_global_table(xrs);
            final SubLObject global_set = gethash_without_values(method, table, UNPROVIDED);
            return set_contents.set_contents_element_list(global_set);
        }
        return NIL;
    }

    /**
     * Return a list of all the xref-modules that call METHOD in a top-level form.
     */
    @LispMethod(comment = "Return a list of all the xref-modules that call METHOD in a top-level form.")
    public static final SubLObject xrms_that_call_method_alt(SubLObject method) {
        {
            SubLObject xrs = current_xref_system();
            if (NIL != xrs) {
                {
                    SubLObject table = xref_s_method_called_at_top_level_table(xrs);
                    SubLObject xrm_set = gethash_without_values(method, table, UNPROVIDED);
                    return set_contents.set_contents_element_list(xrm_set);
                }
            }
        }
        return NIL;
    }

    @LispMethod(comment = "Return a list of all the xref-modules that call METHOD in a top-level form.")
    public static SubLObject xrms_that_call_method(final SubLObject method) {
        final SubLObject xrs = current_xref_system();
        if (NIL != xrs) {
            final SubLObject table = xref_s_method_called_at_top_level_table(xrs);
            final SubLObject xrm_set = gethash_without_values(method, table, UNPROVIDED);
            return set_contents.set_contents_element_list(xrm_set);
        }
        return NIL;
    }

    /**
     * Return a list of all the modules that call METHOD in a top-level form.
     */
    @LispMethod(comment = "Return a list of all the modules that call METHOD in a top-level form.")
    public static final SubLObject xref_modules_that_call_method_alt(SubLObject method) {
        return nmapcar(symbol_function(XRM_NAME), xrms_that_call_method(method));
    }

    @LispMethod(comment = "Return a list of all the modules that call METHOD in a top-level form.")
    public static SubLObject xref_modules_that_call_method(final SubLObject method) {
        return list_utilities.nmapcar(symbol_function(XRM_NAME), xrms_that_call_method(method));
    }

    /**
     * Return the total number of callers of METHOD.
     */
    @LispMethod(comment = "Return the total number of callers of METHOD.")
    public static final SubLObject xref_method_call_count_alt(SubLObject method) {
        {
            SubLObject xrs = current_xref_system();
            SubLObject count = ZERO_INTEGER;
            if (NIL != xrs) {
                {
                    SubLObject table = xref_s_method_called_by_method_table(xrs);
                    SubLObject method_set = gethash_without_values(method, table, UNPROVIDED);
                    count = add(count, set_contents.set_contents_size(method_set));
                }
                {
                    SubLObject table = xref_s_method_called_by_global_table(xrs);
                    SubLObject global_set = gethash_without_values(method, table, UNPROVIDED);
                    count = add(count, set_contents.set_contents_size(global_set));
                }
                {
                    SubLObject table = xref_s_method_called_at_top_level_table(xrs);
                    SubLObject xrm_set = gethash_without_values(method, table, UNPROVIDED);
                    count = add(count, set_contents.set_contents_size(xrm_set));
                }
            }
            return count;
        }
    }

    @LispMethod(comment = "Return the total number of callers of METHOD.")
    public static SubLObject xref_method_call_count(final SubLObject method) {
        final SubLObject xrs = current_xref_system();
        SubLObject count = ZERO_INTEGER;
        if (NIL != xrs) {
            SubLObject table = xref_s_method_called_by_method_table(xrs);
            final SubLObject method_set = gethash_without_values(method, table, UNPROVIDED);
            count = add(count, set_contents.set_contents_size(method_set));
            table = xref_s_method_called_by_global_table(xrs);
            final SubLObject global_set = gethash_without_values(method, table, UNPROVIDED);
            count = add(count, set_contents.set_contents_size(global_set));
            table = xref_s_method_called_at_top_level_table(xrs);
            final SubLObject xrm_set = gethash_without_values(method, table, UNPROVIDED);
            count = add(count, set_contents.set_contents_size(xrm_set));
        }
        return count;
    }

    /**
     * Return T iff METHOD has no callers.
     */
    @LispMethod(comment = "Return T iff METHOD has no callers.")
    public static final SubLObject xref_method_unused_p_alt(SubLObject method) {
        return numE(ZERO_INTEGER, xref_method_call_count(method));
    }

    @LispMethod(comment = "Return T iff METHOD has no callers.")
    public static SubLObject xref_method_unused_p(final SubLObject method) {
        return numE(ZERO_INTEGER, xref_method_call_count(method));
    }

    /**
     * Return a list of all the methods that reference GLOBAL.
     */
    @LispMethod(comment = "Return a list of all the methods that reference GLOBAL.")
    public static final SubLObject xref_methods_that_reference_global_alt(SubLObject global) {
        {
            SubLObject xrs = current_xref_system();
            if (NIL != xrs) {
                {
                    SubLObject table = xref_s_global_referenced_by_method_table(xrs);
                    SubLObject method_set = gethash_without_values(global, table, UNPROVIDED);
                    return set_contents.set_contents_element_list(method_set);
                }
            }
        }
        return NIL;
    }

    @LispMethod(comment = "Return a list of all the methods that reference GLOBAL.")
    public static SubLObject xref_methods_that_reference_global(final SubLObject global) {
        final SubLObject xrs = current_xref_system();
        if (NIL != xrs) {
            final SubLObject table = xref_s_global_referenced_by_method_table(xrs);
            final SubLObject method_set = gethash_without_values(global, table, UNPROVIDED);
            return set_contents.set_contents_element_list(method_set);
        }
        return NIL;
    }

    /**
     * Return a list of all the globals whose initializations reference GLOBAL.
     */
    @LispMethod(comment = "Return a list of all the globals whose initializations reference GLOBAL.")
    public static final SubLObject xref_globals_that_reference_global_alt(SubLObject global) {
        {
            SubLObject xrs = current_xref_system();
            if (NIL != xrs) {
                {
                    SubLObject table = xref_s_global_referenced_by_global_table(xrs);
                    SubLObject global_set = gethash_without_values(global, table, UNPROVIDED);
                    return set_contents.set_contents_element_list(global_set);
                }
            }
        }
        return NIL;
    }

    @LispMethod(comment = "Return a list of all the globals whose initializations reference GLOBAL.")
    public static SubLObject xref_globals_that_reference_global(final SubLObject global) {
        final SubLObject xrs = current_xref_system();
        if (NIL != xrs) {
            final SubLObject table = xref_s_global_referenced_by_global_table(xrs);
            final SubLObject global_set = gethash_without_values(global, table, UNPROVIDED);
            return set_contents.set_contents_element_list(global_set);
        }
        return NIL;
    }

    /**
     * Return a list of all the xref-modules that reference GLOBAL in a top-level form.
     */
    @LispMethod(comment = "Return a list of all the xref-modules that reference GLOBAL in a top-level form.")
    public static final SubLObject xrms_that_reference_global_alt(SubLObject global) {
        {
            SubLObject xrs = current_xref_system();
            if (NIL != xrs) {
                {
                    SubLObject table = xref_s_global_referenced_at_top_level_table(xrs);
                    SubLObject xrm_set = gethash_without_values(global, table, UNPROVIDED);
                    return set_contents.set_contents_element_list(xrm_set);
                }
            }
        }
        return NIL;
    }

    @LispMethod(comment = "Return a list of all the xref-modules that reference GLOBAL in a top-level form.")
    public static SubLObject xrms_that_reference_global(final SubLObject global) {
        final SubLObject xrs = current_xref_system();
        if (NIL != xrs) {
            final SubLObject table = xref_s_global_referenced_at_top_level_table(xrs);
            final SubLObject xrm_set = gethash_without_values(global, table, UNPROVIDED);
            return set_contents.set_contents_element_list(xrm_set);
        }
        return NIL;
    }

    /**
     * Return a list of all the modules that reference GLOBAL in a top-level form.
     */
    @LispMethod(comment = "Return a list of all the modules that reference GLOBAL in a top-level form.")
    public static final SubLObject xref_modules_that_reference_global_alt(SubLObject global) {
        return nmapcar(symbol_function(XRM_NAME), xrms_that_reference_global(global));
    }

    @LispMethod(comment = "Return a list of all the modules that reference GLOBAL in a top-level form.")
    public static SubLObject xref_modules_that_reference_global(final SubLObject global) {
        return list_utilities.nmapcar(symbol_function(XRM_NAME), xrms_that_reference_global(global));
    }

    /**
     * Return the total number of clients that reference GLOBAL.
     */
    @LispMethod(comment = "Return the total number of clients that reference GLOBAL.")
    public static final SubLObject xref_global_reference_count_alt(SubLObject global) {
        {
            SubLObject xrs = current_xref_system();
            SubLObject count = ZERO_INTEGER;
            if (NIL != xrs) {
                {
                    SubLObject table = xref_s_global_referenced_by_method_table(xrs);
                    SubLObject method_set = gethash_without_values(global, table, UNPROVIDED);
                    count = add(count, set_contents.set_contents_size(method_set));
                }
                {
                    SubLObject table = xref_s_global_referenced_by_global_table(xrs);
                    SubLObject global_set = gethash_without_values(global, table, UNPROVIDED);
                    count = add(count, set_contents.set_contents_size(global_set));
                }
                {
                    SubLObject table = xref_s_global_referenced_at_top_level_table(xrs);
                    SubLObject xrm_set = gethash_without_values(global, table, UNPROVIDED);
                    count = add(count, set_contents.set_contents_size(xrm_set));
                }
            }
            return count;
        }
    }

    @LispMethod(comment = "Return the total number of clients that reference GLOBAL.")
    public static SubLObject xref_global_reference_count(final SubLObject global) {
        final SubLObject xrs = current_xref_system();
        SubLObject count = ZERO_INTEGER;
        if (NIL != xrs) {
            SubLObject table = xref_s_global_referenced_by_method_table(xrs);
            final SubLObject method_set = gethash_without_values(global, table, UNPROVIDED);
            count = add(count, set_contents.set_contents_size(method_set));
            table = xref_s_global_referenced_by_global_table(xrs);
            final SubLObject global_set = gethash_without_values(global, table, UNPROVIDED);
            count = add(count, set_contents.set_contents_size(global_set));
            table = xref_s_global_referenced_at_top_level_table(xrs);
            final SubLObject xrm_set = gethash_without_values(global, table, UNPROVIDED);
            count = add(count, set_contents.set_contents_size(xrm_set));
        }
        return count;
    }

    /**
     * Return T iff GLOBAL has no references.
     */
    @LispMethod(comment = "Return T iff GLOBAL has no references.")
    public static final SubLObject xref_global_never_referenced_p_alt(SubLObject global) {
        return numE(ZERO_INTEGER, xref_global_reference_count(global));
    }

    @LispMethod(comment = "Return T iff GLOBAL has no references.")
    public static SubLObject xref_global_never_referenced_p(final SubLObject global) {
        return numE(ZERO_INTEGER, xref_global_reference_count(global));
    }

    /**
     * Return a list of all the methods that modify GLOBAL.
     */
    @LispMethod(comment = "Return a list of all the methods that modify GLOBAL.")
    public static final SubLObject xref_methods_that_modify_global_alt(SubLObject global) {
        {
            SubLObject xrs = current_xref_system();
            if (NIL != xrs) {
                {
                    SubLObject table = xref_s_global_modified_by_method_table(xrs);
                    SubLObject method_set = gethash_without_values(global, table, UNPROVIDED);
                    return set_contents.set_contents_element_list(method_set);
                }
            }
        }
        return NIL;
    }

    @LispMethod(comment = "Return a list of all the methods that modify GLOBAL.")
    public static SubLObject xref_methods_that_modify_global(final SubLObject global) {
        final SubLObject xrs = current_xref_system();
        if (NIL != xrs) {
            final SubLObject table = xref_s_global_modified_by_method_table(xrs);
            final SubLObject method_set = gethash_without_values(global, table, UNPROVIDED);
            return set_contents.set_contents_element_list(method_set);
        }
        return NIL;
    }

    /**
     * Return a list of all the xref-modules that modify GLOBAL in a top-level form.
     */
    @LispMethod(comment = "Return a list of all the xref-modules that modify GLOBAL in a top-level form.")
    public static final SubLObject xrms_that_modify_global_alt(SubLObject global) {
        {
            SubLObject xrs = current_xref_system();
            if (NIL != xrs) {
                {
                    SubLObject table = xref_s_global_modified_at_top_level_table(xrs);
                    SubLObject xrm_set = gethash_without_values(global, table, UNPROVIDED);
                    return set_contents.set_contents_element_list(xrm_set);
                }
            }
        }
        return NIL;
    }

    @LispMethod(comment = "Return a list of all the xref-modules that modify GLOBAL in a top-level form.")
    public static SubLObject xrms_that_modify_global(final SubLObject global) {
        final SubLObject xrs = current_xref_system();
        if (NIL != xrs) {
            final SubLObject table = xref_s_global_modified_at_top_level_table(xrs);
            final SubLObject xrm_set = gethash_without_values(global, table, UNPROVIDED);
            return set_contents.set_contents_element_list(xrm_set);
        }
        return NIL;
    }

    /**
     * Return a list of all the modules that modify GLOBAL in a top-level form.
     */
    @LispMethod(comment = "Return a list of all the modules that modify GLOBAL in a top-level form.")
    public static final SubLObject xref_modules_that_modify_global_alt(SubLObject global) {
        return nmapcar(symbol_function(XRM_NAME), xrms_that_modify_global(global));
    }

    @LispMethod(comment = "Return a list of all the modules that modify GLOBAL in a top-level form.")
    public static SubLObject xref_modules_that_modify_global(final SubLObject global) {
        return list_utilities.nmapcar(symbol_function(XRM_NAME), xrms_that_modify_global(global));
    }

    /**
     * Return the total number of clients that modify GLOBAL.
     */
    @LispMethod(comment = "Return the total number of clients that modify GLOBAL.")
    public static final SubLObject xref_global_modification_count_alt(SubLObject global) {
        {
            SubLObject xrs = current_xref_system();
            SubLObject count = ZERO_INTEGER;
            if (NIL != xrs) {
                {
                    SubLObject table = xref_s_global_modified_by_method_table(xrs);
                    SubLObject method_set = gethash_without_values(global, table, UNPROVIDED);
                    count = add(count, set_contents.set_contents_size(method_set));
                }
                {
                    SubLObject table = xref_s_global_modified_at_top_level_table(xrs);
                    SubLObject xrm_set = gethash_without_values(global, table, UNPROVIDED);
                    count = add(count, set_contents.set_contents_size(xrm_set));
                }
            }
            return count;
        }
    }

    @LispMethod(comment = "Return the total number of clients that modify GLOBAL.")
    public static SubLObject xref_global_modification_count(final SubLObject global) {
        final SubLObject xrs = current_xref_system();
        SubLObject count = ZERO_INTEGER;
        if (NIL != xrs) {
            SubLObject table = xref_s_global_modified_by_method_table(xrs);
            final SubLObject method_set = gethash_without_values(global, table, UNPROVIDED);
            count = add(count, set_contents.set_contents_size(method_set));
            table = xref_s_global_modified_at_top_level_table(xrs);
            final SubLObject xrm_set = gethash_without_values(global, table, UNPROVIDED);
            count = add(count, set_contents.set_contents_size(xrm_set));
        }
        return count;
    }

    /**
     * Return T iff GLOBAL has no modifications.
     */
    @LispMethod(comment = "Return T iff GLOBAL has no modifications.")
    public static final SubLObject xref_global_never_modified_p_alt(SubLObject global) {
        return numE(ZERO_INTEGER, xref_global_modification_count(global));
    }

    @LispMethod(comment = "Return T iff GLOBAL has no modifications.")
    public static SubLObject xref_global_never_modified_p(final SubLObject global) {
        return numE(ZERO_INTEGER, xref_global_modification_count(global));
    }

    /**
     * Return a list of all the methods that rebind GLOBAL.
     */
    @LispMethod(comment = "Return a list of all the methods that rebind GLOBAL.")
    public static final SubLObject xref_methods_that_rebind_global_alt(SubLObject global) {
        {
            SubLObject xrs = current_xref_system();
            if (NIL != xrs) {
                {
                    SubLObject table = xref_s_global_rebound_by_method_table(xrs);
                    SubLObject method_set = gethash_without_values(global, table, UNPROVIDED);
                    return set_contents.set_contents_element_list(method_set);
                }
            }
        }
        return NIL;
    }

    @LispMethod(comment = "Return a list of all the methods that rebind GLOBAL.")
    public static SubLObject xref_methods_that_rebind_global(final SubLObject global) {
        final SubLObject xrs = current_xref_system();
        if (NIL != xrs) {
            final SubLObject table = xref_s_global_rebound_by_method_table(xrs);
            final SubLObject method_set = gethash_without_values(global, table, UNPROVIDED);
            return set_contents.set_contents_element_list(method_set);
        }
        return NIL;
    }

    /**
     * Return a list of all the xref-modules that rebind GLOBAL in a top-level form.
     */
    @LispMethod(comment = "Return a list of all the xref-modules that rebind GLOBAL in a top-level form.")
    public static final SubLObject xrms_that_rebind_global_alt(SubLObject global) {
        {
            SubLObject xrs = current_xref_system();
            if (NIL != xrs) {
                {
                    SubLObject table = xref_s_global_rebound_at_top_level_table(xrs);
                    SubLObject xrm_set = gethash_without_values(global, table, UNPROVIDED);
                    return set_contents.set_contents_element_list(xrm_set);
                }
            }
        }
        return NIL;
    }

    @LispMethod(comment = "Return a list of all the xref-modules that rebind GLOBAL in a top-level form.")
    public static SubLObject xrms_that_rebind_global(final SubLObject global) {
        final SubLObject xrs = current_xref_system();
        if (NIL != xrs) {
            final SubLObject table = xref_s_global_rebound_at_top_level_table(xrs);
            final SubLObject xrm_set = gethash_without_values(global, table, UNPROVIDED);
            return set_contents.set_contents_element_list(xrm_set);
        }
        return NIL;
    }

    /**
     * Return a list of all the modules that rebind GLOBAL in a top-level form.
     */
    @LispMethod(comment = "Return a list of all the modules that rebind GLOBAL in a top-level form.")
    public static final SubLObject xref_modules_that_rebind_global_alt(SubLObject global) {
        return nmapcar(symbol_function(XRM_NAME), xrms_that_rebind_global(global));
    }

    @LispMethod(comment = "Return a list of all the modules that rebind GLOBAL in a top-level form.")
    public static SubLObject xref_modules_that_rebind_global(final SubLObject global) {
        return list_utilities.nmapcar(symbol_function(XRM_NAME), xrms_that_rebind_global(global));
    }

    /**
     * Return the total number of clients that rebind GLOBAL.
     */
    @LispMethod(comment = "Return the total number of clients that rebind GLOBAL.")
    public static final SubLObject xref_global_binding_count_alt(SubLObject global) {
        {
            SubLObject xrs = current_xref_system();
            SubLObject count = ZERO_INTEGER;
            if (NIL != xrs) {
                {
                    SubLObject table = xref_s_global_rebound_by_method_table(xrs);
                    SubLObject method_set = gethash_without_values(global, table, UNPROVIDED);
                    count = add(count, set_contents.set_contents_size(method_set));
                }
                {
                    SubLObject table = xref_s_global_rebound_at_top_level_table(xrs);
                    SubLObject xrm_set = gethash_without_values(global, table, UNPROVIDED);
                    count = add(count, set_contents.set_contents_size(xrm_set));
                }
            }
            return count;
        }
    }

    @LispMethod(comment = "Return the total number of clients that rebind GLOBAL.")
    public static SubLObject xref_global_binding_count(final SubLObject global) {
        final SubLObject xrs = current_xref_system();
        SubLObject count = ZERO_INTEGER;
        if (NIL != xrs) {
            SubLObject table = xref_s_global_rebound_by_method_table(xrs);
            final SubLObject method_set = gethash_without_values(global, table, UNPROVIDED);
            count = add(count, set_contents.set_contents_size(method_set));
            table = xref_s_global_rebound_at_top_level_table(xrs);
            final SubLObject xrm_set = gethash_without_values(global, table, UNPROVIDED);
            count = add(count, set_contents.set_contents_size(xrm_set));
        }
        return count;
    }

    /**
     * Return T iff GLOBAL has no rebindings.
     */
    @LispMethod(comment = "Return T iff GLOBAL has no rebindings.")
    public static final SubLObject xref_global_never_rebound_p_alt(SubLObject global) {
        return numE(ZERO_INTEGER, xref_global_binding_count(global));
    }

    @LispMethod(comment = "Return T iff GLOBAL has no rebindings.")
    public static SubLObject xref_global_never_rebound_p(final SubLObject global) {
        return numE(ZERO_INTEGER, xref_global_binding_count(global));
    }

    /**
     * Return a list of all the methods that access (reference, modify or rebind) GLOBAL.
     */
    @LispMethod(comment = "Return a list of all the methods that access (reference, modify or rebind) GLOBAL.")
    public static final SubLObject xref_methods_that_access_global_alt(SubLObject global) {
        return fast_delete_duplicates(nconc(xref_methods_that_reference_global(global), xref_methods_that_modify_global(global), xref_methods_that_rebind_global(global)), symbol_function(EQ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    @LispMethod(comment = "Return a list of all the methods that access (reference, modify or rebind) GLOBAL.")
    public static SubLObject xref_methods_that_access_global(final SubLObject global) {
        return list_utilities.fast_delete_duplicates(nconc(xref_methods_that_reference_global(global), xref_methods_that_modify_global(global), xref_methods_that_rebind_global(global)), symbol_function(EQ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    /**
     * Return a list of all the xref-modules that access (reference, modify or rebind) GLOBAL.
     */
    @LispMethod(comment = "Return a list of all the xref-modules that access (reference, modify or rebind) GLOBAL.")
    public static final SubLObject xrms_that_access_global_alt(SubLObject global) {
        return fast_delete_duplicates(nconc(xrms_that_reference_global(global), xrms_that_modify_global(global), xrms_that_rebind_global(global)), symbol_function(EQ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    @LispMethod(comment = "Return a list of all the xref-modules that access (reference, modify or rebind) GLOBAL.")
    public static SubLObject xrms_that_access_global(final SubLObject global) {
        return list_utilities.fast_delete_duplicates(nconc(xrms_that_reference_global(global), xrms_that_modify_global(global), xrms_that_rebind_global(global)), symbol_function(EQ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    /**
     * Return a list of all the modules that access (reference, modify or rebind) GLOBAL.
     */
    @LispMethod(comment = "Return a list of all the modules that access (reference, modify or rebind) GLOBAL.")
    public static final SubLObject xref_modules_that_access_global_alt(SubLObject global) {
        return nmapcar(symbol_function(XRM_NAME), xrms_that_access_global(global));
    }

    @LispMethod(comment = "Return a list of all the modules that access (reference, modify or rebind) GLOBAL.")
    public static SubLObject xref_modules_that_access_global(final SubLObject global) {
        return list_utilities.nmapcar(symbol_function(XRM_NAME), xrms_that_access_global(global));
    }

    /**
     * Return the total number of clients that access (reference, modify or rebind) GLOBAL.
     */
    @LispMethod(comment = "Return the total number of clients that access (reference, modify or rebind) GLOBAL.")
    public static final SubLObject xref_global_access_count_alt(SubLObject global) {
        return add(xref_global_reference_count(global), xref_global_modification_count(global), xref_global_binding_count(global));
    }

    @LispMethod(comment = "Return the total number of clients that access (reference, modify or rebind) GLOBAL.")
    public static SubLObject xref_global_access_count(final SubLObject global) {
        return add(xref_global_reference_count(global), xref_global_modification_count(global), xref_global_binding_count(global));
    }

    /**
     * Return T iff GLOBAL is never accessed (referenced, modified or rebound).
     */
    @LispMethod(comment = "Return T iff GLOBAL is never accessed (referenced, modified or rebound).")
    public static final SubLObject xref_global_never_accessed_p_alt(SubLObject global) {
        return makeBoolean(((NIL != xref_global_never_referenced_p(global)) && (NIL != xref_global_never_modified_p(global))) && (NIL != xref_global_never_rebound_p(global)));
    }

    @LispMethod(comment = "Return T iff GLOBAL is never accessed (referenced, modified or rebound).")
    public static SubLObject xref_global_never_accessed_p(final SubLObject global) {
        return makeBoolean(((NIL != xref_global_never_referenced_p(global)) && (NIL != xref_global_never_modified_p(global))) && (NIL != xref_global_never_rebound_p(global)));
    }

    /**
     * Return a list of xref-modules that define some object accessed by METHOD.
     */
    @LispMethod(comment = "Return a list of xref-modules that define some object accessed by METHOD.")
    public static final SubLObject xref_xrms_accessed_by_method_alt(SubLObject method) {
        {
            SubLObject xrm = xref_method_defining_xrm(method);
            if (NIL != xrm) {
                {
                    SubLObject accessed_xrms = set_contents.new_set_contents(ZERO_INTEGER, symbol_function(EQ));
                    {
                        SubLObject table = xref_m_method_global_reference_table(xrm);
                        SubLObject referenced_globals = dictionary.dictionary_lookup_without_values(table, method, NIL);
                        SubLObject cdolist_list_var = referenced_globals;
                        SubLObject referenced_global = NIL;
                        for (referenced_global = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , referenced_global = cdolist_list_var.first()) {
                            {
                                SubLObject accessed_xrm = xref_global_defining_xrm(referenced_global);
                                if (NIL != accessed_xrm) {
                                    accessed_xrms = set_contents.set_contents_add(accessed_xrm, accessed_xrms, symbol_function(EQ));
                                }
                            }
                        }
                    }
                    {
                        SubLObject table = xref_m_method_global_modification_table(xrm);
                        SubLObject modified_globals = dictionary.dictionary_lookup_without_values(table, method, NIL);
                        SubLObject cdolist_list_var = modified_globals;
                        SubLObject modified_global = NIL;
                        for (modified_global = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , modified_global = cdolist_list_var.first()) {
                            {
                                SubLObject accessed_xrm = xref_global_defining_xrm(modified_global);
                                if (NIL != accessed_xrm) {
                                    accessed_xrms = set_contents.set_contents_add(accessed_xrm, accessed_xrms, symbol_function(EQ));
                                }
                            }
                        }
                    }
                    {
                        SubLObject table = xref_m_method_global_binding_table(xrm);
                        SubLObject rebound_globals = dictionary.dictionary_lookup_without_values(table, method, NIL);
                        SubLObject cdolist_list_var = rebound_globals;
                        SubLObject rebound_global = NIL;
                        for (rebound_global = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , rebound_global = cdolist_list_var.first()) {
                            {
                                SubLObject accessed_xrm = xref_global_defining_xrm(rebound_global);
                                if (NIL != accessed_xrm) {
                                    accessed_xrms = set_contents.set_contents_add(accessed_xrm, accessed_xrms, symbol_function(EQ));
                                }
                            }
                        }
                    }
                    {
                        SubLObject table = xref_m_method_method_table(xrm);
                        SubLObject called_methods = dictionary.dictionary_lookup_without_values(table, method, NIL);
                        SubLObject cdolist_list_var = called_methods;
                        SubLObject called_method = NIL;
                        for (called_method = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , called_method = cdolist_list_var.first()) {
                            {
                                SubLObject accessed_xrm = xref_method_defining_xrm(called_method);
                                if (NIL != accessed_xrm) {
                                    accessed_xrms = set_contents.set_contents_add(accessed_xrm, accessed_xrms, symbol_function(EQ));
                                }
                            }
                        }
                    }
                    return set_contents.set_contents_element_list(accessed_xrms);
                }
            }
        }
        return NIL;
    }

    @LispMethod(comment = "Return a list of xref-modules that define some object accessed by METHOD.")
    public static SubLObject xref_xrms_accessed_by_method(final SubLObject method) {
        final SubLObject xrm = xref_method_defining_xrm(method);
        if (NIL != xrm) {
            SubLObject accessed_xrms = set_contents.new_set_contents(ZERO_INTEGER, symbol_function(EQ));
            SubLObject table = xref_m_method_global_reference_table(xrm);
            SubLObject cdolist_list_var;
            final SubLObject referenced_globals = cdolist_list_var = dictionary.dictionary_lookup_without_values(table, method, NIL);
            SubLObject referenced_global = NIL;
            referenced_global = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                final SubLObject accessed_xrm = xref_global_defining_xrm(referenced_global);
                if (NIL != accessed_xrm) {
                    accessed_xrms = set_contents.set_contents_add(accessed_xrm, accessed_xrms, symbol_function(EQ));
                }
                cdolist_list_var = cdolist_list_var.rest();
                referenced_global = cdolist_list_var.first();
            } 
            table = xref_m_method_global_modification_table(xrm);
            final SubLObject modified_globals = cdolist_list_var = dictionary.dictionary_lookup_without_values(table, method, NIL);
            SubLObject modified_global = NIL;
            modified_global = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                final SubLObject accessed_xrm = xref_global_defining_xrm(modified_global);
                if (NIL != accessed_xrm) {
                    accessed_xrms = set_contents.set_contents_add(accessed_xrm, accessed_xrms, symbol_function(EQ));
                }
                cdolist_list_var = cdolist_list_var.rest();
                modified_global = cdolist_list_var.first();
            } 
            table = xref_m_method_global_binding_table(xrm);
            final SubLObject rebound_globals = cdolist_list_var = dictionary.dictionary_lookup_without_values(table, method, NIL);
            SubLObject rebound_global = NIL;
            rebound_global = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                final SubLObject accessed_xrm = xref_global_defining_xrm(rebound_global);
                if (NIL != accessed_xrm) {
                    accessed_xrms = set_contents.set_contents_add(accessed_xrm, accessed_xrms, symbol_function(EQ));
                }
                cdolist_list_var = cdolist_list_var.rest();
                rebound_global = cdolist_list_var.first();
            } 
            table = xref_m_method_method_table(xrm);
            final SubLObject called_methods = cdolist_list_var = dictionary.dictionary_lookup_without_values(table, method, NIL);
            SubLObject called_method = NIL;
            called_method = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                final SubLObject accessed_xrm = xref_method_defining_xrm(called_method);
                if (NIL != accessed_xrm) {
                    accessed_xrms = set_contents.set_contents_add(accessed_xrm, accessed_xrms, symbol_function(EQ));
                }
                cdolist_list_var = cdolist_list_var.rest();
                called_method = cdolist_list_var.first();
            } 
            return set_contents.set_contents_element_list(accessed_xrms);
        }
        return NIL;
    }

    /**
     * Return a list of modules that define some object accessed by METHOD.
     */
    @LispMethod(comment = "Return a list of modules that define some object accessed by METHOD.")
    public static final SubLObject xref_modules_accessed_by_method_alt(SubLObject method) {
        return nmapcar(symbol_function(XRM_NAME), xref_xrms_accessed_by_method(method));
    }

    @LispMethod(comment = "Return a list of modules that define some object accessed by METHOD.")
    public static SubLObject xref_modules_accessed_by_method(final SubLObject method) {
        return list_utilities.nmapcar(symbol_function(XRM_NAME), xref_xrms_accessed_by_method(method));
    }

    /**
     * Return a list of xref-modules that define some object accessed by GLOBAL.
     */
    @LispMethod(comment = "Return a list of xref-modules that define some object accessed by GLOBAL.")
    public static final SubLObject xref_xrms_accessed_by_global_alt(SubLObject global) {
        {
            SubLObject xrm = xref_global_defining_xrm(global);
            if (NIL != xrm) {
                {
                    SubLObject accessed_xrms = set_contents.new_set_contents(ZERO_INTEGER, symbol_function(EQ));
                    {
                        SubLObject table = xref_m_global_global_reference_table(xrm);
                        SubLObject referenced_globals = dictionary.dictionary_lookup_without_values(table, global, NIL);
                        SubLObject cdolist_list_var = referenced_globals;
                        SubLObject referenced_global = NIL;
                        for (referenced_global = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , referenced_global = cdolist_list_var.first()) {
                            {
                                SubLObject accessed_xrm = xref_global_defining_xrm(referenced_global);
                                if (NIL != accessed_xrm) {
                                    accessed_xrms = set_contents.set_contents_add(accessed_xrm, accessed_xrms, symbol_function(EQ));
                                }
                            }
                        }
                    }
                    {
                        SubLObject table = xref_m_global_method_table(xrm);
                        SubLObject called_methods = dictionary.dictionary_lookup_without_values(table, global, NIL);
                        SubLObject cdolist_list_var = called_methods;
                        SubLObject called_method = NIL;
                        for (called_method = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , called_method = cdolist_list_var.first()) {
                            {
                                SubLObject accessed_xrm = xref_method_defining_xrm(called_method);
                                if (NIL != accessed_xrm) {
                                    accessed_xrms = set_contents.set_contents_add(accessed_xrm, accessed_xrms, symbol_function(EQ));
                                }
                            }
                        }
                    }
                    return set_contents.set_contents_element_list(accessed_xrms);
                }
            }
        }
        return NIL;
    }

    @LispMethod(comment = "Return a list of xref-modules that define some object accessed by GLOBAL.")
    public static SubLObject xref_xrms_accessed_by_global(final SubLObject global) {
        final SubLObject xrm = xref_global_defining_xrm(global);
        if (NIL != xrm) {
            SubLObject accessed_xrms = set_contents.new_set_contents(ZERO_INTEGER, symbol_function(EQ));
            SubLObject table = xref_m_global_global_reference_table(xrm);
            SubLObject cdolist_list_var;
            final SubLObject referenced_globals = cdolist_list_var = dictionary.dictionary_lookup_without_values(table, global, NIL);
            SubLObject referenced_global = NIL;
            referenced_global = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                final SubLObject accessed_xrm = xref_global_defining_xrm(referenced_global);
                if (NIL != accessed_xrm) {
                    accessed_xrms = set_contents.set_contents_add(accessed_xrm, accessed_xrms, symbol_function(EQ));
                }
                cdolist_list_var = cdolist_list_var.rest();
                referenced_global = cdolist_list_var.first();
            } 
            table = xref_m_global_method_table(xrm);
            final SubLObject called_methods = cdolist_list_var = dictionary.dictionary_lookup_without_values(table, global, NIL);
            SubLObject called_method = NIL;
            called_method = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                final SubLObject accessed_xrm = xref_method_defining_xrm(called_method);
                if (NIL != accessed_xrm) {
                    accessed_xrms = set_contents.set_contents_add(accessed_xrm, accessed_xrms, symbol_function(EQ));
                }
                cdolist_list_var = cdolist_list_var.rest();
                called_method = cdolist_list_var.first();
            } 
            return set_contents.set_contents_element_list(accessed_xrms);
        }
        return NIL;
    }

    /**
     * Return a list of modules that define some object accessed by GLOBAL.
     */
    @LispMethod(comment = "Return a list of modules that define some object accessed by GLOBAL.")
    public static final SubLObject xref_modules_accessed_by_global_alt(SubLObject global) {
        return nmapcar(symbol_function(XRM_NAME), xref_xrms_accessed_by_global(global));
    }

    @LispMethod(comment = "Return a list of modules that define some object accessed by GLOBAL.")
    public static SubLObject xref_modules_accessed_by_global(final SubLObject global) {
        return list_utilities.nmapcar(symbol_function(XRM_NAME), xref_xrms_accessed_by_global(global));
    }

    /**
     * Return a list of xref-modules that define some object
     * accessed by a top-level form in XRM.
     */
    @LispMethod(comment = "Return a list of xref-modules that define some object\r\naccessed by a top-level form in XRM.\nReturn a list of xref-modules that define some object\naccessed by a top-level form in XRM.")
    public static final SubLObject xref_xrms_accessed_by_xrm_alt(SubLObject xrm) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(xrm, XREF_MODULE_P);
            {
                SubLObject accessed_xrms = set_contents.new_set_contents(ZERO_INTEGER, symbol_function(EQ));
                {
                    SubLObject table = xref_m_top_global_reference_table(xrm);
                    SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(table));
                    while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)) {
                        thread.resetMultipleValues();
                        {
                            SubLObject referenced_global = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                            SubLObject positions = thread.secondMultipleValue();
                            thread.resetMultipleValues();
                            {
                                SubLObject accessed_xrm = xref_global_defining_xrm(referenced_global);
                                if (NIL != accessed_xrm) {
                                    accessed_xrms = set_contents.set_contents_add(accessed_xrm, accessed_xrms, symbol_function(EQ));
                                }
                            }
                            iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state);
                        }
                    } 
                    dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                }
                {
                    SubLObject table = xref_m_top_global_modification_table(xrm);
                    SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(table));
                    while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)) {
                        thread.resetMultipleValues();
                        {
                            SubLObject modified_global = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                            SubLObject positions = thread.secondMultipleValue();
                            thread.resetMultipleValues();
                            {
                                SubLObject accessed_xrm = xref_global_defining_xrm(modified_global);
                                if (NIL != accessed_xrm) {
                                    accessed_xrms = set_contents.set_contents_add(accessed_xrm, accessed_xrms, symbol_function(EQ));
                                }
                            }
                            iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state);
                        }
                    } 
                    dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                }
                {
                    SubLObject table = xref_m_top_global_binding_table(xrm);
                    SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(table));
                    while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)) {
                        thread.resetMultipleValues();
                        {
                            SubLObject rebound_global = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                            SubLObject positions = thread.secondMultipleValue();
                            thread.resetMultipleValues();
                            {
                                SubLObject accessed_xrm = xref_global_defining_xrm(rebound_global);
                                if (NIL != accessed_xrm) {
                                    accessed_xrms = set_contents.set_contents_add(accessed_xrm, accessed_xrms, symbol_function(EQ));
                                }
                            }
                            iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state);
                        }
                    } 
                    dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                }
                {
                    SubLObject table = xref_m_top_method_table(xrm);
                    SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(table));
                    while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)) {
                        thread.resetMultipleValues();
                        {
                            SubLObject called_method = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                            SubLObject positions = thread.secondMultipleValue();
                            thread.resetMultipleValues();
                            {
                                SubLObject accessed_xrm = xref_method_defining_xrm(called_method);
                                if (NIL != accessed_xrm) {
                                    accessed_xrms = set_contents.set_contents_add(accessed_xrm, accessed_xrms, symbol_function(EQ));
                                }
                            }
                            iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state);
                        }
                    } 
                    dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                }
                return set_contents.set_contents_element_list(accessed_xrms);
            }
        }
    }

    @LispMethod(comment = "Return a list of xref-modules that define some object\r\naccessed by a top-level form in XRM.\nReturn a list of xref-modules that define some object\naccessed by a top-level form in XRM.")
    public static SubLObject xref_xrms_accessed_by_xrm(final SubLObject xrm) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != xref_module_p(xrm) : "! xref_database.xref_module_p(xrm) " + ("xref_database.xref_module_p(xrm) " + "CommonSymbols.NIL != xref_database.xref_module_p(xrm) ") + xrm;
        SubLObject accessed_xrms = set_contents.new_set_contents(ZERO_INTEGER, symbol_function(EQ));
        SubLObject table = xref_m_top_global_reference_table(xrm);
        SubLObject iteration_state;
        for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(table)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
            thread.resetMultipleValues();
            final SubLObject referenced_global = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
            final SubLObject positions = thread.secondMultipleValue();
            thread.resetMultipleValues();
            final SubLObject accessed_xrm = xref_global_defining_xrm(referenced_global);
            if (NIL != accessed_xrm) {
                accessed_xrms = set_contents.set_contents_add(accessed_xrm, accessed_xrms, symbol_function(EQ));
            }
        }
        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
        table = xref_m_top_global_modification_table(xrm);
        for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(table)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
            thread.resetMultipleValues();
            final SubLObject modified_global = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
            final SubLObject positions = thread.secondMultipleValue();
            thread.resetMultipleValues();
            final SubLObject accessed_xrm = xref_global_defining_xrm(modified_global);
            if (NIL != accessed_xrm) {
                accessed_xrms = set_contents.set_contents_add(accessed_xrm, accessed_xrms, symbol_function(EQ));
            }
        }
        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
        table = xref_m_top_global_binding_table(xrm);
        for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(table)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
            thread.resetMultipleValues();
            final SubLObject rebound_global = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
            final SubLObject positions = thread.secondMultipleValue();
            thread.resetMultipleValues();
            final SubLObject accessed_xrm = xref_global_defining_xrm(rebound_global);
            if (NIL != accessed_xrm) {
                accessed_xrms = set_contents.set_contents_add(accessed_xrm, accessed_xrms, symbol_function(EQ));
            }
        }
        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
        table = xref_m_top_method_table(xrm);
        for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(table)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
            thread.resetMultipleValues();
            final SubLObject called_method = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
            final SubLObject positions = thread.secondMultipleValue();
            thread.resetMultipleValues();
            final SubLObject accessed_xrm = xref_method_defining_xrm(called_method);
            if (NIL != accessed_xrm) {
                accessed_xrms = set_contents.set_contents_add(accessed_xrm, accessed_xrms, symbol_function(EQ));
            }
        }
        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
        return set_contents.set_contents_element_list(accessed_xrms);
    }

    /**
     * Return a list of modules that define some object
     * accessed by a top-level form in MODULE.
     */
    @LispMethod(comment = "Return a list of modules that define some object\r\naccessed by a top-level form in MODULE.\nReturn a list of modules that define some object\naccessed by a top-level form in MODULE.")
    public static final SubLObject xref_modules_accessed_by_module_alt(SubLObject module) {
        {
            SubLObject xrm = xref_find_xrm_by_module(module);
            if (NIL != xrm) {
                return nmapcar(symbol_function(XRM_NAME), xref_xrms_accessed_by_xrm(xrm));
            }
        }
        return NIL;
    }

    @LispMethod(comment = "Return a list of modules that define some object\r\naccessed by a top-level form in MODULE.\nReturn a list of modules that define some object\naccessed by a top-level form in MODULE.")
    public static SubLObject xref_modules_accessed_by_module(final SubLObject module) {
        final SubLObject xrm = xref_find_xrm_by_module(module);
        if (NIL != xrm) {
            return list_utilities.nmapcar(symbol_function(XRM_NAME), xref_xrms_accessed_by_xrm(xrm));
        }
        return NIL;
    }

    /**
     * Return a list of xref-modules that define some object
     * accessed from definitions or top-level forms in XRM.
     */
    @LispMethod(comment = "Return a list of xref-modules that define some object\r\naccessed from definitions or top-level forms in XRM.\nReturn a list of xref-modules that define some object\naccessed from definitions or top-level forms in XRM.")
    public static final SubLObject xref_xrms_accessed_anywhere_by_xrm_alt(SubLObject xrm) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject accessed_xrms = set_contents.new_set_contents(ZERO_INTEGER, symbol_function(EQ));
                {
                    SubLObject xrm_var = xrm;
                    SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(xrm_global_position_table(xrm_var)));
                    while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)) {
                        thread.resetMultipleValues();
                        {
                            SubLObject defined_global = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                            SubLObject position = thread.secondMultipleValue();
                            thread.resetMultipleValues();
                            {
                                SubLObject cdolist_list_var = xref_xrms_accessed_by_global(defined_global);
                                SubLObject accessed_xrm = NIL;
                                for (accessed_xrm = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , accessed_xrm = cdolist_list_var.first()) {
                                    accessed_xrms = set_contents.set_contents_add(accessed_xrm, accessed_xrms, symbol_function(EQ));
                                }
                            }
                            iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state);
                        }
                    } 
                    dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                }
                {
                    SubLObject xrm_var = xrm;
                    SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(xrm_method_position_table(xrm_var)));
                    while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)) {
                        thread.resetMultipleValues();
                        {
                            SubLObject defined_method = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                            SubLObject position = thread.secondMultipleValue();
                            thread.resetMultipleValues();
                            {
                                SubLObject cdolist_list_var = xref_xrms_accessed_by_method(defined_method);
                                SubLObject accessed_xrm = NIL;
                                for (accessed_xrm = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , accessed_xrm = cdolist_list_var.first()) {
                                    accessed_xrms = set_contents.set_contents_add(accessed_xrm, accessed_xrms, symbol_function(EQ));
                                }
                            }
                            iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state);
                        }
                    } 
                    dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                }
                {
                    SubLObject cdolist_list_var = xref_xrms_accessed_by_xrm(xrm);
                    SubLObject accessed_xrm = NIL;
                    for (accessed_xrm = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , accessed_xrm = cdolist_list_var.first()) {
                        accessed_xrms = set_contents.set_contents_add(accessed_xrm, accessed_xrms, symbol_function(EQ));
                    }
                }
                return set_contents.set_contents_element_list(accessed_xrms);
            }
        }
    }

    @LispMethod(comment = "Return a list of xref-modules that define some object\r\naccessed from definitions or top-level forms in XRM.\nReturn a list of xref-modules that define some object\naccessed from definitions or top-level forms in XRM.")
    public static SubLObject xref_xrms_accessed_anywhere_by_xrm(final SubLObject xrm) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject accessed_xrms = set_contents.new_set_contents(ZERO_INTEGER, symbol_function(EQ));
        SubLObject iteration_state;
        for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(xrm_global_position_table(xrm))); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
            thread.resetMultipleValues();
            final SubLObject defined_global = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
            final SubLObject position = thread.secondMultipleValue();
            thread.resetMultipleValues();
            SubLObject cdolist_list_var = xref_xrms_accessed_by_global(defined_global);
            SubLObject accessed_xrm = NIL;
            accessed_xrm = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                accessed_xrms = set_contents.set_contents_add(accessed_xrm, accessed_xrms, symbol_function(EQ));
                cdolist_list_var = cdolist_list_var.rest();
                accessed_xrm = cdolist_list_var.first();
            } 
        }
        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
        for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(xrm_method_position_table(xrm))); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
            thread.resetMultipleValues();
            final SubLObject defined_method = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
            final SubLObject position = thread.secondMultipleValue();
            thread.resetMultipleValues();
            SubLObject cdolist_list_var = xref_xrms_accessed_by_method(defined_method);
            SubLObject accessed_xrm = NIL;
            accessed_xrm = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                accessed_xrms = set_contents.set_contents_add(accessed_xrm, accessed_xrms, symbol_function(EQ));
                cdolist_list_var = cdolist_list_var.rest();
                accessed_xrm = cdolist_list_var.first();
            } 
        }
        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
        SubLObject cdolist_list_var2 = xref_xrms_accessed_by_xrm(xrm);
        SubLObject accessed_xrm2 = NIL;
        accessed_xrm2 = cdolist_list_var2.first();
        while (NIL != cdolist_list_var2) {
            accessed_xrms = set_contents.set_contents_add(accessed_xrm2, accessed_xrms, symbol_function(EQ));
            cdolist_list_var2 = cdolist_list_var2.rest();
            accessed_xrm2 = cdolist_list_var2.first();
        } 
        return set_contents.set_contents_element_list(accessed_xrms);
    }

    /**
     * Return a list of modules that define some object
     * accessed from definitions or top-level forms in MODULE.
     */
    @LispMethod(comment = "Return a list of modules that define some object\r\naccessed from definitions or top-level forms in MODULE.\nReturn a list of modules that define some object\naccessed from definitions or top-level forms in MODULE.")
    public static final SubLObject xref_modules_accessed_anywhere_by_module_alt(SubLObject module) {
        {
            SubLObject xrm = xref_find_xrm_by_module(module);
            if (NIL != xrm) {
                return nmapcar(symbol_function(XRM_NAME), xref_xrms_accessed_anywhere_by_xrm(xrm));
            }
        }
        return NIL;
    }

    @LispMethod(comment = "Return a list of modules that define some object\r\naccessed from definitions or top-level forms in MODULE.\nReturn a list of modules that define some object\naccessed from definitions or top-level forms in MODULE.")
    public static SubLObject xref_modules_accessed_anywhere_by_module(final SubLObject module) {
        final SubLObject xrm = xref_find_xrm_by_module(module);
        if (NIL != xrm) {
            return list_utilities.nmapcar(symbol_function(XRM_NAME), xref_xrms_accessed_anywhere_by_xrm(xrm));
        }
        return NIL;
    }

    /**
     * Return a list of globals that are accessed from definitions or top-level forms in MODULE.
     * See @xref XREF-GLOBALS-ACCESSED-BY-MODULE for globals accessed only by top-level forms in MODULE.
     */
    @LispMethod(comment = "Return a list of globals that are accessed from definitions or top-level forms in MODULE.\r\nSee @xref XREF-GLOBALS-ACCESSED-BY-MODULE for globals accessed only by top-level forms in MODULE.\nReturn a list of globals that are accessed from definitions or top-level forms in MODULE.\nSee @xref XREF-GLOBALS-ACCESSED-BY-MODULE for globals accessed only by top-level forms in MODULE.")
    public static final SubLObject xref_globals_accessed_anywhere_by_module_alt(SubLObject module) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject xrm = xref_find_xrm_by_module(module);
                if (NIL != xrm) {
                    {
                        SubLObject accessed_globals = set_contents.new_set_contents(ZERO_INTEGER, symbol_function(EQ));
                        {
                            SubLObject xrm_var = xrm;
                            SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(xrm_global_position_table(xrm_var)));
                            while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)) {
                                thread.resetMultipleValues();
                                {
                                    SubLObject defined_global = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                    SubLObject position = thread.secondMultipleValue();
                                    thread.resetMultipleValues();
                                    {
                                        SubLObject cdolist_list_var = xref_globals_referenced_by_global(defined_global);
                                        SubLObject accessed_global = NIL;
                                        for (accessed_global = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , accessed_global = cdolist_list_var.first()) {
                                            accessed_globals = set_contents.set_contents_add(accessed_global, accessed_globals, symbol_function(EQ));
                                        }
                                    }
                                    iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state);
                                }
                            } 
                            dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                        }
                        {
                            SubLObject xrm_var = xrm;
                            SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(xrm_method_position_table(xrm_var)));
                            while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)) {
                                thread.resetMultipleValues();
                                {
                                    SubLObject defined_method = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                    SubLObject position = thread.secondMultipleValue();
                                    thread.resetMultipleValues();
                                    {
                                        SubLObject cdolist_list_var = xref_globals_accessed_by_method(defined_method);
                                        SubLObject accessed_global = NIL;
                                        for (accessed_global = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , accessed_global = cdolist_list_var.first()) {
                                            accessed_globals = set_contents.set_contents_add(accessed_global, accessed_globals, symbol_function(EQ));
                                        }
                                    }
                                    iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state);
                                }
                            } 
                            dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                        }
                        {
                            SubLObject cdolist_list_var = xref_globals_accessed_by_module(module);
                            SubLObject accessed_global = NIL;
                            for (accessed_global = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , accessed_global = cdolist_list_var.first()) {
                                accessed_globals = set_contents.set_contents_add(accessed_global, accessed_globals, symbol_function(EQ));
                            }
                        }
                        return set_contents.set_contents_element_list(accessed_globals);
                    }
                }
            }
            return NIL;
        }
    }

    @LispMethod(comment = "Return a list of globals that are accessed from definitions or top-level forms in MODULE.\r\nSee @xref XREF-GLOBALS-ACCESSED-BY-MODULE for globals accessed only by top-level forms in MODULE.\nReturn a list of globals that are accessed from definitions or top-level forms in MODULE.\nSee @xref XREF-GLOBALS-ACCESSED-BY-MODULE for globals accessed only by top-level forms in MODULE.")
    public static SubLObject xref_globals_accessed_anywhere_by_module(final SubLObject module) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject xrm = xref_find_xrm_by_module(module);
        if (NIL != xrm) {
            SubLObject accessed_globals = set_contents.new_set_contents(ZERO_INTEGER, symbol_function(EQ));
            SubLObject xrm_var = xrm;
            SubLObject iteration_state;
            for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(xrm_global_position_table(xrm_var))); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                thread.resetMultipleValues();
                final SubLObject defined_global = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                final SubLObject position = thread.secondMultipleValue();
                thread.resetMultipleValues();
                SubLObject cdolist_list_var = xref_globals_referenced_by_global(defined_global);
                SubLObject accessed_global = NIL;
                accessed_global = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    accessed_globals = set_contents.set_contents_add(accessed_global, accessed_globals, symbol_function(EQ));
                    cdolist_list_var = cdolist_list_var.rest();
                    accessed_global = cdolist_list_var.first();
                } 
            }
            dictionary_contents.do_dictionary_contents_finalize(iteration_state);
            xrm_var = xrm;
            for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(xrm_method_position_table(xrm_var))); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                thread.resetMultipleValues();
                final SubLObject defined_method = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                final SubLObject position = thread.secondMultipleValue();
                thread.resetMultipleValues();
                SubLObject cdolist_list_var = xref_globals_accessed_by_method(defined_method);
                SubLObject accessed_global = NIL;
                accessed_global = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    accessed_globals = set_contents.set_contents_add(accessed_global, accessed_globals, symbol_function(EQ));
                    cdolist_list_var = cdolist_list_var.rest();
                    accessed_global = cdolist_list_var.first();
                } 
            }
            dictionary_contents.do_dictionary_contents_finalize(iteration_state);
            SubLObject cdolist_list_var2 = xref_globals_accessed_by_module(module);
            SubLObject accessed_global2 = NIL;
            accessed_global2 = cdolist_list_var2.first();
            while (NIL != cdolist_list_var2) {
                accessed_globals = set_contents.set_contents_add(accessed_global2, accessed_globals, symbol_function(EQ));
                cdolist_list_var2 = cdolist_list_var2.rest();
                accessed_global2 = cdolist_list_var2.first();
            } 
            return set_contents.set_contents_element_list(accessed_globals);
        }
        return NIL;
    }

    /**
     * Return a list of methods that are accessed from definitions or top-level forms in MODULE.
     * See @xref XREF-METHODS-CALLED-BY-MODULE for globals called only by top-level forms in MODULE.
     */
    @LispMethod(comment = "Return a list of methods that are accessed from definitions or top-level forms in MODULE.\r\nSee @xref XREF-METHODS-CALLED-BY-MODULE for globals called only by top-level forms in MODULE.\nReturn a list of methods that are accessed from definitions or top-level forms in MODULE.\nSee @xref XREF-METHODS-CALLED-BY-MODULE for globals called only by top-level forms in MODULE.")
    public static final SubLObject xref_methods_accessed_anywhere_by_module_alt(SubLObject module) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject xrm = xref_find_xrm_by_module(module);
                if (NIL != xrm) {
                    {
                        SubLObject accessed_methods = set_contents.new_set_contents(ZERO_INTEGER, symbol_function(EQ));
                        {
                            SubLObject xrm_var = xrm;
                            SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(xrm_global_position_table(xrm_var)));
                            while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)) {
                                thread.resetMultipleValues();
                                {
                                    SubLObject defined_global = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                    SubLObject position = thread.secondMultipleValue();
                                    thread.resetMultipleValues();
                                    {
                                        SubLObject cdolist_list_var = xref_methods_called_by_global(defined_global);
                                        SubLObject accessed_method = NIL;
                                        for (accessed_method = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , accessed_method = cdolist_list_var.first()) {
                                            accessed_methods = set_contents.set_contents_add(accessed_method, accessed_methods, symbol_function(EQ));
                                        }
                                    }
                                    iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state);
                                }
                            } 
                            dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                        }
                        {
                            SubLObject xrm_var = xrm;
                            SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(xrm_method_position_table(xrm_var)));
                            while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)) {
                                thread.resetMultipleValues();
                                {
                                    SubLObject defined_method = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                    SubLObject position = thread.secondMultipleValue();
                                    thread.resetMultipleValues();
                                    {
                                        SubLObject cdolist_list_var = xref_methods_called_by_method(defined_method);
                                        SubLObject accessed_method = NIL;
                                        for (accessed_method = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , accessed_method = cdolist_list_var.first()) {
                                            accessed_methods = set_contents.set_contents_add(accessed_method, accessed_methods, symbol_function(EQ));
                                        }
                                    }
                                    iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state);
                                }
                            } 
                            dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                        }
                        {
                            SubLObject cdolist_list_var = xref_methods_called_by_module(module);
                            SubLObject accessed_method = NIL;
                            for (accessed_method = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , accessed_method = cdolist_list_var.first()) {
                                accessed_methods = set_contents.set_contents_add(accessed_method, accessed_methods, symbol_function(EQ));
                            }
                        }
                        return set_contents.set_contents_element_list(accessed_methods);
                    }
                }
            }
            return NIL;
        }
    }

    @LispMethod(comment = "Return a list of methods that are accessed from definitions or top-level forms in MODULE.\r\nSee @xref XREF-METHODS-CALLED-BY-MODULE for globals called only by top-level forms in MODULE.\nReturn a list of methods that are accessed from definitions or top-level forms in MODULE.\nSee @xref XREF-METHODS-CALLED-BY-MODULE for globals called only by top-level forms in MODULE.")
    public static SubLObject xref_methods_accessed_anywhere_by_module(final SubLObject module) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject xrm = xref_find_xrm_by_module(module);
        if (NIL != xrm) {
            SubLObject accessed_methods = set_contents.new_set_contents(ZERO_INTEGER, symbol_function(EQ));
            SubLObject xrm_var = xrm;
            SubLObject iteration_state;
            for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(xrm_global_position_table(xrm_var))); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                thread.resetMultipleValues();
                final SubLObject defined_global = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                final SubLObject position = thread.secondMultipleValue();
                thread.resetMultipleValues();
                SubLObject cdolist_list_var = xref_methods_called_by_global(defined_global);
                SubLObject accessed_method = NIL;
                accessed_method = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    accessed_methods = set_contents.set_contents_add(accessed_method, accessed_methods, symbol_function(EQ));
                    cdolist_list_var = cdolist_list_var.rest();
                    accessed_method = cdolist_list_var.first();
                } 
            }
            dictionary_contents.do_dictionary_contents_finalize(iteration_state);
            xrm_var = xrm;
            for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(xrm_method_position_table(xrm_var))); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                thread.resetMultipleValues();
                final SubLObject defined_method = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                final SubLObject position = thread.secondMultipleValue();
                thread.resetMultipleValues();
                SubLObject cdolist_list_var = xref_methods_called_by_method(defined_method);
                SubLObject accessed_method = NIL;
                accessed_method = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    accessed_methods = set_contents.set_contents_add(accessed_method, accessed_methods, symbol_function(EQ));
                    cdolist_list_var = cdolist_list_var.rest();
                    accessed_method = cdolist_list_var.first();
                } 
            }
            dictionary_contents.do_dictionary_contents_finalize(iteration_state);
            SubLObject cdolist_list_var2 = xref_methods_called_by_module(module);
            SubLObject accessed_method2 = NIL;
            accessed_method2 = cdolist_list_var2.first();
            while (NIL != cdolist_list_var2) {
                accessed_methods = set_contents.set_contents_add(accessed_method2, accessed_methods, symbol_function(EQ));
                cdolist_list_var2 = cdolist_list_var2.rest();
                accessed_method2 = cdolist_list_var2.first();
            } 
            return set_contents.set_contents_element_list(accessed_methods);
        }
        return NIL;
    }

    /**
     * Return a list of xref-modules with definitions or top-level forms that call METHOD.
     */
    @LispMethod(comment = "Return a list of xref-modules with definitions or top-level forms that call METHOD.")
    public static final SubLObject xrms_that_access_method_alt(SubLObject method) {
        {
            SubLObject client_xrms = set_contents.new_set_contents(ZERO_INTEGER, symbol_function(EQ));
            {
                SubLObject cdolist_list_var = xref_globals_that_call_method(method);
                SubLObject client_global = NIL;
                for (client_global = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , client_global = cdolist_list_var.first()) {
                    {
                        SubLObject client_xrm = xref_global_defining_xrm(client_global);
                        client_xrms = set_contents.set_contents_add(client_xrm, client_xrms, symbol_function(EQ));
                    }
                }
            }
            {
                SubLObject cdolist_list_var = xref_methods_that_call_method(method);
                SubLObject client_method = NIL;
                for (client_method = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , client_method = cdolist_list_var.first()) {
                    {
                        SubLObject client_xrm = xref_method_defining_xrm(client_method);
                        client_xrms = set_contents.set_contents_add(client_xrm, client_xrms, symbol_function(EQ));
                    }
                }
            }
            {
                SubLObject cdolist_list_var = xrms_that_call_method(method);
                SubLObject client_xrm = NIL;
                for (client_xrm = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , client_xrm = cdolist_list_var.first()) {
                    client_xrms = set_contents.set_contents_add(client_xrm, client_xrms, symbol_function(EQ));
                }
            }
            return set_contents.set_contents_element_list(client_xrms);
        }
    }

    @LispMethod(comment = "Return a list of xref-modules with definitions or top-level forms that call METHOD.")
    public static SubLObject xrms_that_access_method(final SubLObject method) {
        SubLObject client_xrms = set_contents.new_set_contents(ZERO_INTEGER, symbol_function(EQ));
        SubLObject cdolist_list_var = xref_globals_that_call_method(method);
        SubLObject client_global = NIL;
        client_global = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject client_xrm = xref_global_defining_xrm(client_global);
            client_xrms = set_contents.set_contents_add(client_xrm, client_xrms, symbol_function(EQ));
            cdolist_list_var = cdolist_list_var.rest();
            client_global = cdolist_list_var.first();
        } 
        cdolist_list_var = xref_methods_that_call_method(method);
        SubLObject client_method = NIL;
        client_method = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject client_xrm = xref_method_defining_xrm(client_method);
            client_xrms = set_contents.set_contents_add(client_xrm, client_xrms, symbol_function(EQ));
            cdolist_list_var = cdolist_list_var.rest();
            client_method = cdolist_list_var.first();
        } 
        cdolist_list_var = xrms_that_call_method(method);
        SubLObject client_xrm2 = NIL;
        client_xrm2 = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            client_xrms = set_contents.set_contents_add(client_xrm2, client_xrms, symbol_function(EQ));
            cdolist_list_var = cdolist_list_var.rest();
            client_xrm2 = cdolist_list_var.first();
        } 
        return set_contents.set_contents_element_list(client_xrms);
    }

    /**
     * Return a list of modules with definitions or top-level forms that call METHOD.
     */
    @LispMethod(comment = "Return a list of modules with definitions or top-level forms that call METHOD.")
    public static final SubLObject xref_modules_that_access_method_alt(SubLObject method) {
        return nmapcar(symbol_function(XRM_NAME), xrms_that_access_method(method));
    }

    @LispMethod(comment = "Return a list of modules with definitions or top-level forms that call METHOD.")
    public static SubLObject xref_modules_that_access_method(final SubLObject method) {
        return list_utilities.nmapcar(symbol_function(XRM_NAME), xrms_that_access_method(method));
    }

    /**
     * Return a list of modules with definitions or top-level forms that
     * access (reference, modify or rebind) GLOBAL
     */
    @LispMethod(comment = "Return a list of modules with definitions or top-level forms that\r\naccess (reference, modify or rebind) GLOBAL\nReturn a list of modules with definitions or top-level forms that\naccess (reference, modify or rebind) GLOBAL")
    public static final SubLObject xrms_that_access_global_anywhere_alt(SubLObject global) {
        {
            SubLObject client_xrms = set_contents.new_set_contents(ZERO_INTEGER, symbol_function(EQ));
            {
                SubLObject cdolist_list_var = xref_globals_that_reference_global(global);
                SubLObject client_global = NIL;
                for (client_global = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , client_global = cdolist_list_var.first()) {
                    {
                        SubLObject client_xrm = xref_global_defining_xrm(client_global);
                        client_xrms = set_contents.set_contents_add(client_xrm, client_xrms, symbol_function(EQ));
                    }
                }
            }
            {
                SubLObject cdolist_list_var = xref_methods_that_access_global(global);
                SubLObject client_method = NIL;
                for (client_method = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , client_method = cdolist_list_var.first()) {
                    {
                        SubLObject client_xrm = xref_method_defining_xrm(client_method);
                        client_xrms = set_contents.set_contents_add(client_xrm, client_xrms, symbol_function(EQ));
                    }
                }
            }
            {
                SubLObject cdolist_list_var = xrms_that_access_global(global);
                SubLObject client_xrm = NIL;
                for (client_xrm = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , client_xrm = cdolist_list_var.first()) {
                    client_xrms = set_contents.set_contents_add(client_xrm, client_xrms, symbol_function(EQ));
                }
            }
            return set_contents.set_contents_element_list(client_xrms);
        }
    }

    @LispMethod(comment = "Return a list of modules with definitions or top-level forms that\r\naccess (reference, modify or rebind) GLOBAL\nReturn a list of modules with definitions or top-level forms that\naccess (reference, modify or rebind) GLOBAL")
    public static SubLObject xrms_that_access_global_anywhere(final SubLObject global) {
        SubLObject client_xrms = set_contents.new_set_contents(ZERO_INTEGER, symbol_function(EQ));
        SubLObject cdolist_list_var = xref_globals_that_reference_global(global);
        SubLObject client_global = NIL;
        client_global = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject client_xrm = xref_global_defining_xrm(client_global);
            client_xrms = set_contents.set_contents_add(client_xrm, client_xrms, symbol_function(EQ));
            cdolist_list_var = cdolist_list_var.rest();
            client_global = cdolist_list_var.first();
        } 
        cdolist_list_var = xref_methods_that_access_global(global);
        SubLObject client_method = NIL;
        client_method = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject client_xrm = xref_method_defining_xrm(client_method);
            client_xrms = set_contents.set_contents_add(client_xrm, client_xrms, symbol_function(EQ));
            cdolist_list_var = cdolist_list_var.rest();
            client_method = cdolist_list_var.first();
        } 
        cdolist_list_var = xrms_that_access_global(global);
        SubLObject client_xrm2 = NIL;
        client_xrm2 = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            client_xrms = set_contents.set_contents_add(client_xrm2, client_xrms, symbol_function(EQ));
            cdolist_list_var = cdolist_list_var.rest();
            client_xrm2 = cdolist_list_var.first();
        } 
        return set_contents.set_contents_element_list(client_xrms);
    }

    public static final SubLObject xref_modules_that_access_global_anywhere_alt(SubLObject global) {
        return nmapcar(symbol_function(XRM_NAME), xrms_that_access_global_anywhere(global));
    }

    public static SubLObject xref_modules_that_access_global_anywhere(final SubLObject global) {
        return list_utilities.nmapcar(symbol_function(XRM_NAME), xrms_that_access_global_anywhere(global));
    }

    /**
     * Return a list of xref-modules with definitions or top-level forms
     * that call some object defined in SERVER-XRM.
     */
    @LispMethod(comment = "Return a list of xref-modules with definitions or top-level forms\r\nthat call some object defined in SERVER-XRM.\nReturn a list of xref-modules with definitions or top-level forms\nthat call some object defined in SERVER-XRM.")
    public static final SubLObject xrms_that_access_xrm_anywhere_alt(SubLObject server_xrm) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject client_xrms = set_contents.new_set_contents(ZERO_INTEGER, symbol_function(EQ));
                {
                    SubLObject xrm_var = server_xrm;
                    SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(xrm_method_position_table(xrm_var)));
                    while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)) {
                        thread.resetMultipleValues();
                        {
                            SubLObject server_method = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                            SubLObject position = thread.secondMultipleValue();
                            thread.resetMultipleValues();
                            {
                                SubLObject cdolist_list_var = xrms_that_access_method(server_method);
                                SubLObject client_xrm = NIL;
                                for (client_xrm = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , client_xrm = cdolist_list_var.first()) {
                                    client_xrms = set_contents.set_contents_add(client_xrm, client_xrms, symbol_function(EQ));
                                }
                            }
                            iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state);
                        }
                    } 
                    dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                }
                {
                    SubLObject xrm_var = server_xrm;
                    SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(xrm_global_position_table(xrm_var)));
                    while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)) {
                        thread.resetMultipleValues();
                        {
                            SubLObject server_global = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                            SubLObject position = thread.secondMultipleValue();
                            thread.resetMultipleValues();
                            {
                                SubLObject cdolist_list_var = xrms_that_access_global_anywhere(server_global);
                                SubLObject client_xrm = NIL;
                                for (client_xrm = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , client_xrm = cdolist_list_var.first()) {
                                    client_xrms = set_contents.set_contents_add(client_xrm, client_xrms, symbol_function(EQ));
                                }
                            }
                            iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state);
                        }
                    } 
                    dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                }
                return set_contents.set_contents_element_list(client_xrms);
            }
        }
    }

    @LispMethod(comment = "Return a list of xref-modules with definitions or top-level forms\r\nthat call some object defined in SERVER-XRM.\nReturn a list of xref-modules with definitions or top-level forms\nthat call some object defined in SERVER-XRM.")
    public static SubLObject xrms_that_access_xrm_anywhere(final SubLObject server_xrm) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject client_xrms = set_contents.new_set_contents(ZERO_INTEGER, symbol_function(EQ));
        SubLObject iteration_state;
        for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(xrm_method_position_table(server_xrm))); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
            thread.resetMultipleValues();
            final SubLObject server_method = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
            final SubLObject position = thread.secondMultipleValue();
            thread.resetMultipleValues();
            SubLObject cdolist_list_var = xrms_that_access_method(server_method);
            SubLObject client_xrm = NIL;
            client_xrm = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                client_xrms = set_contents.set_contents_add(client_xrm, client_xrms, symbol_function(EQ));
                cdolist_list_var = cdolist_list_var.rest();
                client_xrm = cdolist_list_var.first();
            } 
        }
        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
        for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(xrm_global_position_table(server_xrm))); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
            thread.resetMultipleValues();
            final SubLObject server_global = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
            final SubLObject position = thread.secondMultipleValue();
            thread.resetMultipleValues();
            SubLObject cdolist_list_var = xrms_that_access_global_anywhere(server_global);
            SubLObject client_xrm = NIL;
            client_xrm = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                client_xrms = set_contents.set_contents_add(client_xrm, client_xrms, symbol_function(EQ));
                cdolist_list_var = cdolist_list_var.rest();
                client_xrm = cdolist_list_var.first();
            } 
        }
        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
        return set_contents.set_contents_element_list(client_xrms);
    }

    /**
     * Return a list of modules with definitions or top-level forms
     * that call some object defined in SERVER-MODULE.
     */
    @LispMethod(comment = "Return a list of modules with definitions or top-level forms\r\nthat call some object defined in SERVER-MODULE.\nReturn a list of modules with definitions or top-level forms\nthat call some object defined in SERVER-MODULE.")
    public static final SubLObject xref_modules_that_access_module_anywhere_alt(SubLObject server_module) {
        {
            SubLObject server_xrm = xref_find_xrm_by_module(server_module);
            if (NIL != server_xrm) {
                return nmapcar(symbol_function(XRM_NAME), xrms_that_access_xrm_anywhere(server_xrm));
            }
        }
        return NIL;
    }

    @LispMethod(comment = "Return a list of modules with definitions or top-level forms\r\nthat call some object defined in SERVER-MODULE.\nReturn a list of modules with definitions or top-level forms\nthat call some object defined in SERVER-MODULE.")
    public static SubLObject xref_modules_that_access_module_anywhere(final SubLObject server_module) {
        final SubLObject server_xrm = xref_find_xrm_by_module(server_module);
        if (NIL != server_xrm) {
            return list_utilities.nmapcar(symbol_function(XRM_NAME), xrms_that_access_xrm_anywhere(server_xrm));
        }
        return NIL;
    }

    /**
     * Return an object of the form ((:methods METHODS)(:globals GLOBALS)) where
     * METHODS and GLOBALS are lists of methods and globals defined in SERVER-MODULE
     * that are called by a definition or top-level form in CLIENT-MODULE.
     */
    @LispMethod(comment = "Return an object of the form ((:methods METHODS)(:globals GLOBALS)) where\r\nMETHODS and GLOBALS are lists of methods and globals defined in SERVER-MODULE\r\nthat are called by a definition or top-level form in CLIENT-MODULE.\nReturn an object of the form ((:methods METHODS)(:globals GLOBALS)) where\nMETHODS and GLOBALS are lists of methods and globals defined in SERVER-MODULE\nthat are called by a definition or top-level form in CLIENT-MODULE.")
    public static final SubLObject xref_justify_module_referencing_module_alt(SubLObject client_module, SubLObject server_module) {
        {
            SubLObject used_methods = NIL;
            SubLObject used_globals = NIL;
            {
                SubLObject v_methods = xref_methods_defined_by_module(server_module);
                SubLObject cdolist_list_var = v_methods;
                SubLObject method = NIL;
                for (method = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , method = cdolist_list_var.first()) {
                    {
                        SubLObject client_modules = xref_modules_that_access_method(method);
                        if (NIL != member_equalP(client_module, client_modules)) {
                            used_methods = cons(method, used_methods);
                        }
                    }
                }
            }
            {
                SubLObject globals = xref_globals_defined_by_module(server_module);
                SubLObject cdolist_list_var = globals;
                SubLObject global = NIL;
                for (global = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , global = cdolist_list_var.first()) {
                    {
                        SubLObject client_modules = xref_modules_that_access_global_anywhere(global);
                        if (NIL != member_equalP(client_module, client_modules)) {
                            used_globals = cons(global, used_globals);
                        }
                    }
                }
            }
            return list(list($METHODS, used_methods), list($GLOBALS, used_globals));
        }
    }

    @LispMethod(comment = "Return an object of the form ((:methods METHODS)(:globals GLOBALS)) where\r\nMETHODS and GLOBALS are lists of methods and globals defined in SERVER-MODULE\r\nthat are called by a definition or top-level form in CLIENT-MODULE.\nReturn an object of the form ((:methods METHODS)(:globals GLOBALS)) where\nMETHODS and GLOBALS are lists of methods and globals defined in SERVER-MODULE\nthat are called by a definition or top-level form in CLIENT-MODULE.")
    public static SubLObject xref_justify_module_referencing_module(final SubLObject client_module, final SubLObject server_module) {
        SubLObject used_methods = NIL;
        SubLObject used_globals = NIL;
        SubLObject cdolist_list_var;
        final SubLObject v_methods = cdolist_list_var = xref_methods_defined_by_module(server_module);
        SubLObject method = NIL;
        method = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject client_modules = xref_modules_that_access_method(method);
            if (NIL != list_utilities.member_equalP(client_module, client_modules)) {
                used_methods = cons(method, used_methods);
            }
            cdolist_list_var = cdolist_list_var.rest();
            method = cdolist_list_var.first();
        } 
        final SubLObject globals = cdolist_list_var = xref_globals_defined_by_module(server_module);
        SubLObject global = NIL;
        global = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject client_modules = xref_modules_that_access_global_anywhere(global);
            if (NIL != list_utilities.member_equalP(client_module, client_modules)) {
                used_globals = cons(global, used_globals);
            }
            cdolist_list_var = cdolist_list_var.rest();
            global = cdolist_list_var.first();
        } 
        return list(list($METHODS, used_methods), list($GLOBALS, used_globals));
    }

    /**
     * Return T iff some module accesses METHOD in a definition or a top-level form
     * besides the module that defines METHOD.
     */
    @LispMethod(comment = "Return T iff some module accesses METHOD in a definition or a top-level form\r\nbesides the module that defines METHOD.\nReturn T iff some module accesses METHOD in a definition or a top-level form\nbesides the module that defines METHOD.")
    public static final SubLObject xref_some_external_module_accesses_method_anywhereP_alt(SubLObject method) {
        {
            SubLObject defining_xrm = xref_method_defining_xrm(method);
            SubLObject accessing_xrms = xrms_that_access_method(method);
            SubLObject cdolist_list_var = accessing_xrms;
            SubLObject accessing_xrm = NIL;
            for (accessing_xrm = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , accessing_xrm = cdolist_list_var.first()) {
                if (defining_xrm != accessing_xrm) {
                    return T;
                }
            }
        }
        return NIL;
    }

    @LispMethod(comment = "Return T iff some module accesses METHOD in a definition or a top-level form\r\nbesides the module that defines METHOD.\nReturn T iff some module accesses METHOD in a definition or a top-level form\nbesides the module that defines METHOD.")
    public static SubLObject xref_some_external_module_accesses_method_anywhereP(final SubLObject method) {
        final SubLObject defining_xrm = xref_method_defining_xrm(method);
        SubLObject cdolist_list_var;
        final SubLObject accessing_xrms = cdolist_list_var = xrms_that_access_method(method);
        SubLObject accessing_xrm = NIL;
        accessing_xrm = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (!defining_xrm.eql(accessing_xrm)) {
                return T;
            }
            cdolist_list_var = cdolist_list_var.rest();
            accessing_xrm = cdolist_list_var.first();
        } 
        return NIL;
    }

    /**
     * Return T iff METHOD is non-private and has no callers outside of its defining module.
     */
    @LispMethod(comment = "Return T iff METHOD is non-private and has no callers outside of its defining module.")
    public static final SubLObject xref_method_potentially_private_p_alt(SubLObject method) {
        return makeBoolean((NIL == private_method_p(method)) && (NIL == xref_some_external_module_accesses_method_anywhereP(method)));
    }

    @LispMethod(comment = "Return T iff METHOD is non-private and has no callers outside of its defining module.")
    public static SubLObject xref_method_potentially_private_p(final SubLObject method) {
        return makeBoolean((NIL == form_translation.private_method_p(method)) && (NIL == xref_some_external_module_accesses_method_anywhereP(method)));
    }

    /**
     * Returns non-private methods defined by MODULE which have no callers outside of MODULE.
     */
    @LispMethod(comment = "Returns non-private methods defined by MODULE which have no callers outside of MODULE.")
    public static final SubLObject xref_module_potentially_private_methods_alt(SubLObject module) {
        return delete_if_not(XREF_METHOD_POTENTIALLY_PRIVATE_P, xref_methods_defined_by_module(module), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    @LispMethod(comment = "Returns non-private methods defined by MODULE which have no callers outside of MODULE.")
    public static SubLObject xref_module_potentially_private_methods(final SubLObject module) {
        return list_utilities.delete_if_not(XREF_METHOD_POTENTIALLY_PRIVATE_P, xref_methods_defined_by_module(module), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    /**
     * Return T iff some module accesses GLOBAL in a definition or a top-level form
     * besides the module that defines GLOBAL.
     */
    @LispMethod(comment = "Return T iff some module accesses GLOBAL in a definition or a top-level form\r\nbesides the module that defines GLOBAL.\nReturn T iff some module accesses GLOBAL in a definition or a top-level form\nbesides the module that defines GLOBAL.")
    public static final SubLObject xref_some_external_module_accesses_global_anywhereP_alt(SubLObject global) {
        {
            SubLObject defining_xrm = xref_global_defining_xrm(global);
            SubLObject accessing_xrms = xrms_that_access_global_anywhere(global);
            SubLObject cdolist_list_var = accessing_xrms;
            SubLObject accessing_xrm = NIL;
            for (accessing_xrm = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , accessing_xrm = cdolist_list_var.first()) {
                if (defining_xrm != accessing_xrm) {
                    return T;
                }
            }
        }
        return NIL;
    }

    @LispMethod(comment = "Return T iff some module accesses GLOBAL in a definition or a top-level form\r\nbesides the module that defines GLOBAL.\nReturn T iff some module accesses GLOBAL in a definition or a top-level form\nbesides the module that defines GLOBAL.")
    public static SubLObject xref_some_external_module_accesses_global_anywhereP(final SubLObject global) {
        final SubLObject defining_xrm = xref_global_defining_xrm(global);
        SubLObject cdolist_list_var;
        final SubLObject accessing_xrms = cdolist_list_var = xrms_that_access_global_anywhere(global);
        SubLObject accessing_xrm = NIL;
        accessing_xrm = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (!defining_xrm.eql(accessing_xrm)) {
                return T;
            }
            cdolist_list_var = cdolist_list_var.rest();
            accessing_xrm = cdolist_list_var.first();
        } 
        return NIL;
    }

    /**
     * Return T iff GLOBAL is non-private and has no callers outside of its defining module.
     */
    @LispMethod(comment = "Return T iff GLOBAL is non-private and has no callers outside of its defining module.")
    public static final SubLObject xref_global_potentially_private_p_alt(SubLObject global) {
        return makeBoolean((NIL == private_global_p(global)) && (NIL == xref_some_external_module_accesses_global_anywhereP(global)));
    }

    @LispMethod(comment = "Return T iff GLOBAL is non-private and has no callers outside of its defining module.")
    public static SubLObject xref_global_potentially_private_p(final SubLObject global) {
        return makeBoolean((NIL == form_translation.private_global_p(global)) && (NIL == xref_some_external_module_accesses_global_anywhereP(global)));
    }

    /**
     * Returns non-private globals defined by MODULE which have no accessors outside of MODULE.
     */
    @LispMethod(comment = "Returns non-private globals defined by MODULE which have no accessors outside of MODULE.")
    public static final SubLObject xref_module_potentially_private_globals_alt(SubLObject module) {
        return delete_if_not(XREF_GLOBAL_POTENTIALLY_PRIVATE_P, xref_globals_defined_by_module(module), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    @LispMethod(comment = "Returns non-private globals defined by MODULE which have no accessors outside of MODULE.")
    public static SubLObject xref_module_potentially_private_globals(final SubLObject module) {
        return list_utilities.delete_if_not(XREF_GLOBAL_POTENTIALLY_PRIVATE_P, xref_globals_defined_by_module(module), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject xref_method_source_definition_info_alt(SubLObject method) {
        {
            SubLObject position = xref_method_definition_position(method);
            if (NIL != position) {
                {
                    SubLObject module = xref_method_defining_module(method);
                    if (NIL != module) {
                        {
                            SubLObject filename = xref_module_relative_input_filename(module);
                            if (NIL != filename) {
                                return values(filename, position);
                            }
                        }
                    }
                }
            }
        }
        return values(NIL, NIL);
    }

    public static SubLObject xref_method_source_definition_info(final SubLObject method) {
        final SubLObject position = xref_method_definition_position(method);
        if (NIL != position) {
            final SubLObject module = xref_method_defining_module(method);
            if (NIL != module) {
                final SubLObject filename = xref_module_relative_input_filename(module);
                if (NIL != filename) {
                    return values(filename, position);
                }
            }
        }
        return values(NIL, NIL);
    }

    public static final SubLObject xref_global_source_definition_info_alt(SubLObject global) {
        {
            SubLObject position = xref_global_definition_position(global);
            if (NIL != position) {
                {
                    SubLObject module = xref_global_defining_module(global);
                    if (NIL != module) {
                        {
                            SubLObject filename = xref_module_relative_input_filename(module);
                            if (NIL != filename) {
                                return values(filename, position);
                            }
                        }
                    }
                }
            }
        }
        return values(NIL, NIL);
    }

    public static SubLObject xref_global_source_definition_info(final SubLObject global) {
        final SubLObject position = xref_global_definition_position(global);
        if (NIL != position) {
            final SubLObject module = xref_global_defining_module(global);
            if (NIL != module) {
                final SubLObject filename = xref_module_relative_input_filename(module);
                if (NIL != filename) {
                    return values(filename, position);
                }
            }
        }
        return values(NIL, NIL);
    }

    public static final SubLObject xref_method_source_definition_comment_alt(SubLObject method) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            thread.resetMultipleValues();
            {
                SubLObject filename = xref_method_source_definition_info(method);
                SubLObject position = thread.secondMultipleValue();
                thread.resetMultipleValues();
                if ((NIL != filename) && (NIL != position)) {
                    return xref_source_definition_comment(filename, position);
                }
            }
            return NIL;
        }
    }

    public static SubLObject xref_method_source_definition_comment(final SubLObject method) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject filename = xref_method_source_definition_info(method);
        final SubLObject position = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if ((NIL != filename) && (NIL != position)) {
            return xref_source_definition_comment(filename, position);
        }
        return NIL;
    }

    public static final SubLObject xref_global_source_definition_comment_alt(SubLObject global) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            thread.resetMultipleValues();
            {
                SubLObject filename = xref_global_source_definition_info(global);
                SubLObject position = thread.secondMultipleValue();
                thread.resetMultipleValues();
                if ((NIL != filename) && (NIL != position)) {
                    return xref_source_definition_comment(filename, position);
                }
            }
            return NIL;
        }
    }

    public static SubLObject xref_global_source_definition_comment(final SubLObject global) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject filename = xref_global_source_definition_info(global);
        final SubLObject position = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if ((NIL != filename) && (NIL != position)) {
            return xref_source_definition_comment(filename, position);
        }
        return NIL;
    }

    public static final SubLObject xref_source_definition_comment_alt(SubLObject filename, SubLObject position) {
        SubLTrampolineFile.checkType(filename, STRINGP);
        SubLTrampolineFile.checkType(position, NON_NEGATIVE_INTEGER_P);
        return list(CODE_COMMENT, cconcatenate($str_alt176$_subl_, new SubLObject[]{ format_nil.format_nil_a_no_copy(filename), $str_alt177$_, format_nil.format_nil_a_no_copy(position) }));
    }

    public static SubLObject xref_source_definition_comment(final SubLObject filename, SubLObject position) {
        assert NIL != stringp(filename) : "! stringp(filename) " + ("Types.stringp(filename) " + "CommonSymbols.NIL != Types.stringp(filename) ") + filename;
        assert NIL != subl_promotions.non_negative_integer_p(position) : "! subl_promotions.non_negative_integer_p(position) " + ("subl_promotions.non_negative_integer_p(position) " + "CommonSymbols.NIL != subl_promotions.non_negative_integer_p(position) ") + position;
        return list(CODE_COMMENT, cconcatenate($str182$_subl_, new SubLObject[]{ format_nil.format_nil_a_no_copy(filename), $$$_, format_nil.format_nil_a_no_copy(position) }));
    }

    public static final SubLObject xref_module_relative_input_filename_internal_alt(SubLObject module) {
        {
            SubLObject sys_tran = system_translation.current_system_translation();
            if (NIL != sys_tran) {
                return system_translation.sys_tran_relative_input_filename(sys_tran, module);
            }
        }
        return NIL;
    }

    public static SubLObject xref_module_relative_input_filename_internal(final SubLObject module) {
        final SubLObject sys_tran = system_translation.current_system_translation();
        if (NIL != sys_tran) {
            return system_translation.sys_tran_relative_input_filename(sys_tran, module);
        }
        return NIL;
    }

    public static final SubLObject xref_module_relative_input_filename_alt(SubLObject module) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
                SubLObject caching_state = NIL;
                if (NIL == v_memoization_state) {
                    return xref_module_relative_input_filename_internal(module);
                }
                caching_state = memoization_state.memoization_state_lookup(v_memoization_state, XREF_MODULE_RELATIVE_INPUT_FILENAME, UNPROVIDED);
                if (NIL == caching_state) {
                    caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), XREF_MODULE_RELATIVE_INPUT_FILENAME, ONE_INTEGER, NIL, EQUAL, UNPROVIDED);
                    memoization_state.memoization_state_put(v_memoization_state, XREF_MODULE_RELATIVE_INPUT_FILENAME, caching_state);
                }
                {
                    SubLObject results = memoization_state.caching_state_lookup(caching_state, module, $kw179$_MEMOIZED_ITEM_NOT_FOUND_);
                    if (results == $kw179$_MEMOIZED_ITEM_NOT_FOUND_) {
                        results = arg2(thread.resetMultipleValues(), multiple_value_list(xref_module_relative_input_filename_internal(module)));
                        memoization_state.caching_state_put(caching_state, module, results, UNPROVIDED);
                    }
                    return memoization_state.caching_results(results);
                }
            }
        }
    }

    public static SubLObject xref_module_relative_input_filename(final SubLObject module) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return xref_module_relative_input_filename_internal(module);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, XREF_MODULE_RELATIVE_INPUT_FILENAME, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), XREF_MODULE_RELATIVE_INPUT_FILENAME, ONE_INTEGER, NIL, EQUAL, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, XREF_MODULE_RELATIVE_INPUT_FILENAME, caching_state);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, module, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(thread.resetMultipleValues(), multiple_value_list(xref_module_relative_input_filename_internal(module)));
            memoization_state.caching_state_put(caching_state, module, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    public static final SubLObject xrs_merge_xref_module_alt(SubLObject xrs, SubLObject new_xrm) {
        SubLTrampolineFile.checkType(xrs, XREF_SYSTEM_P);
        SubLTrampolineFile.checkType(new_xrm, XREF_MODULE_P);
        {
            SubLObject name = xrm_name(new_xrm);
            SubLObject old_xrm = xrs_lookup_module(xrs, name);
            if (NIL != old_xrm) {
                xrs_remove_old_xrm(xrs, old_xrm);
            }
        }
        xrs_merge_new_xrm(xrs, new_xrm);
        return xrs;
    }

    public static SubLObject xrs_merge_xref_module(final SubLObject xrs, final SubLObject new_xrm) {
        assert NIL != xref_system_p(xrs) : "! xref_database.xref_system_p(xrs) " + ("xref_database.xref_system_p(xrs) " + "CommonSymbols.NIL != xref_database.xref_system_p(xrs) ") + xrs;
        assert NIL != xref_module_p(new_xrm) : "! xref_database.xref_module_p(new_xrm) " + ("xref_database.xref_module_p(new_xrm) " + "CommonSymbols.NIL != xref_database.xref_module_p(new_xrm) ") + new_xrm;
        final SubLObject name = xrm_name(new_xrm);
        final SubLObject old_xrm = xrs_lookup_module(xrs, name);
        if (NIL != old_xrm) {
            xrs_remove_old_xrm(xrs, old_xrm);
        }
        xrs_merge_new_xrm(xrs, new_xrm);
        return xrs;
    }

    public static final SubLObject xrs_merge_new_xrm_alt(SubLObject xrs, SubLObject new_xrm) {
        {
            SubLObject name = xrm_name(new_xrm);
            SubLObject table = xref_s_xref_module_table(xrs);
            sethash(name, table, new_xrm);
        }
        xrs_merge_new_method_definitions(xrs, new_xrm);
        xrs_merge_new_global_definitions(xrs, new_xrm);
        xrs_merge_new_method_called_by_method(xrs, new_xrm);
        xrs_merge_new_method_called_by_global(xrs, new_xrm);
        xrs_merge_new_method_called_at_top_level(xrs, new_xrm);
        xrs_merge_new_global_referenced_by_method(xrs, new_xrm);
        xrs_merge_new_global_referenced_by_global(xrs, new_xrm);
        xrs_merge_new_global_referenced_at_top_level(xrs, new_xrm);
        xrs_merge_new_global_modified_by_method(xrs, new_xrm);
        xrs_merge_new_global_modified_at_top_level(xrs, new_xrm);
        xrs_merge_new_global_rebound_by_method(xrs, new_xrm);
        xrs_merge_new_global_rebound_at_top_level(xrs, new_xrm);
        return xrs;
    }

    public static SubLObject xrs_merge_new_xrm(final SubLObject xrs, final SubLObject new_xrm) {
        final SubLObject name = xrm_name(new_xrm);
        final SubLObject table = xref_s_xref_module_table(xrs);
        sethash(name, table, new_xrm);
        xrs_merge_new_method_definitions(xrs, new_xrm);
        xrs_merge_new_global_definitions(xrs, new_xrm);
        xrs_merge_new_method_called_by_method(xrs, new_xrm);
        xrs_merge_new_method_called_by_global(xrs, new_xrm);
        xrs_merge_new_method_called_at_top_level(xrs, new_xrm);
        xrs_merge_new_global_referenced_by_method(xrs, new_xrm);
        xrs_merge_new_global_referenced_by_global(xrs, new_xrm);
        xrs_merge_new_global_referenced_at_top_level(xrs, new_xrm);
        xrs_merge_new_global_modified_by_method(xrs, new_xrm);
        xrs_merge_new_global_modified_at_top_level(xrs, new_xrm);
        xrs_merge_new_global_rebound_by_method(xrs, new_xrm);
        xrs_merge_new_global_rebound_at_top_level(xrs, new_xrm);
        return xrs;
    }

    public static final SubLObject xrs_merge_definition_alt(SubLObject new_xrm, SubLObject new_object, SubLObject backtable) {
        {
            SubLObject old_module_spec = gethash_without_values(new_object, backtable, UNPROVIDED);
            SubLObject new_module_spec = NIL;
            if (NIL == old_module_spec) {
                new_module_spec = new_xrm;
            } else {
                if (NIL != xref_module_p(old_module_spec)) {
                    new_module_spec = list(new_xrm, old_module_spec);
                } else {
                    new_module_spec = cons(new_xrm, old_module_spec);
                }
            }
            sethash(new_object, backtable, new_module_spec);
        }
        return NIL;
    }

    public static SubLObject xrs_merge_definition(final SubLObject new_xrm, final SubLObject new_object, final SubLObject backtable) {
        final SubLObject old_module_spec = gethash_without_values(new_object, backtable, UNPROVIDED);
        SubLObject new_module_spec = NIL;
        if (NIL == old_module_spec) {
            new_module_spec = new_xrm;
        } else
            if (NIL != xref_module_p(old_module_spec)) {
                new_module_spec = list(new_xrm, old_module_spec);
            } else {
                new_module_spec = cons(new_xrm, old_module_spec);
            }

        sethash(new_object, backtable, new_module_spec);
        return NIL;
    }

    public static final SubLObject xrs_merge_new_method_definitions_alt(SubLObject xrs, SubLObject new_xrm) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject backtable = xref_s_method_definition_table(xrs);
                SubLObject xrm_var = new_xrm;
                SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(xrm_method_position_table(xrm_var)));
                while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)) {
                    thread.resetMultipleValues();
                    {
                        SubLObject method = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                        SubLObject position = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        xrs_merge_definition(new_xrm, method, backtable);
                        iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state);
                    }
                } 
                dictionary_contents.do_dictionary_contents_finalize(iteration_state);
            }
            return xrs;
        }
    }

    public static SubLObject xrs_merge_new_method_definitions(final SubLObject xrs, final SubLObject new_xrm) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject backtable = xref_s_method_definition_table(xrs);
        SubLObject iteration_state;
        for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(xrm_method_position_table(new_xrm))); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
            thread.resetMultipleValues();
            final SubLObject method = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
            final SubLObject position = thread.secondMultipleValue();
            thread.resetMultipleValues();
            xrs_merge_definition(new_xrm, method, backtable);
        }
        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
        return xrs;
    }

    public static final SubLObject xrs_merge_new_global_definitions_alt(SubLObject xrs, SubLObject new_xrm) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject backtable = xref_s_global_definition_table(xrs);
                SubLObject xrm_var = new_xrm;
                SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(xrm_global_position_table(xrm_var)));
                while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)) {
                    thread.resetMultipleValues();
                    {
                        SubLObject global = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                        SubLObject position = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        xrs_merge_definition(new_xrm, global, backtable);
                        iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state);
                    }
                } 
                dictionary_contents.do_dictionary_contents_finalize(iteration_state);
            }
            return xrs;
        }
    }

    public static SubLObject xrs_merge_new_global_definitions(final SubLObject xrs, final SubLObject new_xrm) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject backtable = xref_s_global_definition_table(xrs);
        SubLObject iteration_state;
        for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(xrm_global_position_table(new_xrm))); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
            thread.resetMultipleValues();
            final SubLObject global = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
            final SubLObject position = thread.secondMultipleValue();
            thread.resetMultipleValues();
            xrs_merge_definition(new_xrm, global, backtable);
        }
        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
        return xrs;
    }

    public static final SubLObject xrs_merge_update_backpointer_alt(SubLObject client_object, SubLObject server_object, SubLObject backtable) {
        {
            SubLObject back_contents = gethash_without_values(server_object, backtable, $empty_set_contents$.getGlobalValue());
            back_contents = set_contents.set_contents_add(client_object, back_contents, symbol_function(EQ));
            sethash(server_object, backtable, back_contents);
        }
        return NIL;
    }

    public static SubLObject xrs_merge_update_backpointer(final SubLObject client_object, final SubLObject server_object, final SubLObject backtable) {
        SubLObject back_contents = gethash_without_values(server_object, backtable, $empty_set_contents$.getGlobalValue());
        back_contents = set_contents.set_contents_add(client_object, back_contents, symbol_function(EQ));
        sethash(server_object, backtable, back_contents);
        return NIL;
    }

    public static final SubLObject xrs_merge_new_method_called_by_method_alt(SubLObject xrs, SubLObject new_xrm) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject table = xref_m_method_method_table(new_xrm);
                SubLObject backtable = xref_s_method_called_by_method_table(xrs);
                SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(table));
                while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)) {
                    thread.resetMultipleValues();
                    {
                        SubLObject method = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                        SubLObject calls_methods = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        {
                            SubLObject cdolist_list_var = calls_methods;
                            SubLObject call_method = NIL;
                            for (call_method = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , call_method = cdolist_list_var.first()) {
                                xrs_merge_update_backpointer(method, call_method, backtable);
                            }
                        }
                        iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state);
                    }
                } 
                dictionary_contents.do_dictionary_contents_finalize(iteration_state);
            }
            return xrs;
        }
    }

    public static SubLObject xrs_merge_new_method_called_by_method(final SubLObject xrs, final SubLObject new_xrm) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject table = xref_m_method_method_table(new_xrm);
        final SubLObject backtable = xref_s_method_called_by_method_table(xrs);
        SubLObject iteration_state;
        for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(table)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
            thread.resetMultipleValues();
            final SubLObject method = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
            final SubLObject calls_methods = thread.secondMultipleValue();
            thread.resetMultipleValues();
            SubLObject cdolist_list_var = calls_methods;
            SubLObject call_method = NIL;
            call_method = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                xrs_merge_update_backpointer(method, call_method, backtable);
                cdolist_list_var = cdolist_list_var.rest();
                call_method = cdolist_list_var.first();
            } 
        }
        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
        return xrs;
    }

    public static final SubLObject xrs_merge_new_method_called_by_global_alt(SubLObject xrs, SubLObject new_xrm) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject table = xref_m_global_method_table(new_xrm);
                SubLObject backtable = xref_s_method_called_by_global_table(xrs);
                SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(table));
                while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)) {
                    thread.resetMultipleValues();
                    {
                        SubLObject global = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                        SubLObject calls_methods = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        {
                            SubLObject cdolist_list_var = calls_methods;
                            SubLObject call_method = NIL;
                            for (call_method = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , call_method = cdolist_list_var.first()) {
                                xrs_merge_update_backpointer(global, call_method, backtable);
                            }
                        }
                        iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state);
                    }
                } 
                dictionary_contents.do_dictionary_contents_finalize(iteration_state);
            }
            return xrs;
        }
    }

    public static SubLObject xrs_merge_new_method_called_by_global(final SubLObject xrs, final SubLObject new_xrm) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject table = xref_m_global_method_table(new_xrm);
        final SubLObject backtable = xref_s_method_called_by_global_table(xrs);
        SubLObject iteration_state;
        for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(table)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
            thread.resetMultipleValues();
            final SubLObject global = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
            final SubLObject calls_methods = thread.secondMultipleValue();
            thread.resetMultipleValues();
            SubLObject cdolist_list_var = calls_methods;
            SubLObject call_method = NIL;
            call_method = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                xrs_merge_update_backpointer(global, call_method, backtable);
                cdolist_list_var = cdolist_list_var.rest();
                call_method = cdolist_list_var.first();
            } 
        }
        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
        return xrs;
    }

    public static final SubLObject xrs_merge_new_method_called_at_top_level_alt(SubLObject xrs, SubLObject new_xrm) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject table = xref_m_top_method_table(new_xrm);
                SubLObject backtable = xref_s_method_called_at_top_level_table(xrs);
                SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(table));
                while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)) {
                    thread.resetMultipleValues();
                    {
                        SubLObject call_method = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                        SubLObject positions = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        xrs_merge_update_backpointer(new_xrm, call_method, backtable);
                        iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state);
                    }
                } 
                dictionary_contents.do_dictionary_contents_finalize(iteration_state);
            }
            return xrs;
        }
    }

    public static SubLObject xrs_merge_new_method_called_at_top_level(final SubLObject xrs, final SubLObject new_xrm) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject table = xref_m_top_method_table(new_xrm);
        final SubLObject backtable = xref_s_method_called_at_top_level_table(xrs);
        SubLObject iteration_state;
        for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(table)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
            thread.resetMultipleValues();
            final SubLObject call_method = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
            final SubLObject positions = thread.secondMultipleValue();
            thread.resetMultipleValues();
            xrs_merge_update_backpointer(new_xrm, call_method, backtable);
        }
        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
        return xrs;
    }

    public static final SubLObject xrs_merge_new_global_referenced_by_method_alt(SubLObject xrs, SubLObject new_xrm) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject table = xref_m_method_global_reference_table(new_xrm);
                SubLObject backtable = xref_s_global_referenced_by_method_table(xrs);
                SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(table));
                while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)) {
                    thread.resetMultipleValues();
                    {
                        SubLObject method = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                        SubLObject referenced_globals = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        {
                            SubLObject cdolist_list_var = referenced_globals;
                            SubLObject referenced_global = NIL;
                            for (referenced_global = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , referenced_global = cdolist_list_var.first()) {
                                xrs_merge_update_backpointer(method, referenced_global, backtable);
                            }
                        }
                        iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state);
                    }
                } 
                dictionary_contents.do_dictionary_contents_finalize(iteration_state);
            }
            return xrs;
        }
    }

    public static SubLObject xrs_merge_new_global_referenced_by_method(final SubLObject xrs, final SubLObject new_xrm) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject table = xref_m_method_global_reference_table(new_xrm);
        final SubLObject backtable = xref_s_global_referenced_by_method_table(xrs);
        SubLObject iteration_state;
        for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(table)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
            thread.resetMultipleValues();
            final SubLObject method = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
            final SubLObject referenced_globals = thread.secondMultipleValue();
            thread.resetMultipleValues();
            SubLObject cdolist_list_var = referenced_globals;
            SubLObject referenced_global = NIL;
            referenced_global = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                xrs_merge_update_backpointer(method, referenced_global, backtable);
                cdolist_list_var = cdolist_list_var.rest();
                referenced_global = cdolist_list_var.first();
            } 
        }
        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
        return xrs;
    }

    public static final SubLObject xrs_merge_new_global_referenced_by_global_alt(SubLObject xrs, SubLObject new_xrm) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject table = xref_m_global_global_reference_table(new_xrm);
                SubLObject backtable = xref_s_global_referenced_by_global_table(xrs);
                SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(table));
                while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)) {
                    thread.resetMultipleValues();
                    {
                        SubLObject global = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                        SubLObject referenced_globals = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        {
                            SubLObject cdolist_list_var = referenced_globals;
                            SubLObject referenced_global = NIL;
                            for (referenced_global = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , referenced_global = cdolist_list_var.first()) {
                                xrs_merge_update_backpointer(global, referenced_global, backtable);
                            }
                        }
                        iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state);
                    }
                } 
                dictionary_contents.do_dictionary_contents_finalize(iteration_state);
            }
            return xrs;
        }
    }

    public static SubLObject xrs_merge_new_global_referenced_by_global(final SubLObject xrs, final SubLObject new_xrm) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject table = xref_m_global_global_reference_table(new_xrm);
        final SubLObject backtable = xref_s_global_referenced_by_global_table(xrs);
        SubLObject iteration_state;
        for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(table)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
            thread.resetMultipleValues();
            final SubLObject global = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
            final SubLObject referenced_globals = thread.secondMultipleValue();
            thread.resetMultipleValues();
            SubLObject cdolist_list_var = referenced_globals;
            SubLObject referenced_global = NIL;
            referenced_global = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                xrs_merge_update_backpointer(global, referenced_global, backtable);
                cdolist_list_var = cdolist_list_var.rest();
                referenced_global = cdolist_list_var.first();
            } 
        }
        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
        return xrs;
    }

    public static final SubLObject xrs_merge_new_global_referenced_at_top_level_alt(SubLObject xrs, SubLObject new_xrm) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject table = xref_m_top_global_reference_table(new_xrm);
                SubLObject backtable = xref_s_global_referenced_at_top_level_table(xrs);
                SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(table));
                while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)) {
                    thread.resetMultipleValues();
                    {
                        SubLObject referenced_global = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                        SubLObject positions = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        xrs_merge_update_backpointer(new_xrm, referenced_global, backtable);
                        iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state);
                    }
                } 
                dictionary_contents.do_dictionary_contents_finalize(iteration_state);
            }
            return xrs;
        }
    }

    public static SubLObject xrs_merge_new_global_referenced_at_top_level(final SubLObject xrs, final SubLObject new_xrm) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject table = xref_m_top_global_reference_table(new_xrm);
        final SubLObject backtable = xref_s_global_referenced_at_top_level_table(xrs);
        SubLObject iteration_state;
        for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(table)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
            thread.resetMultipleValues();
            final SubLObject referenced_global = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
            final SubLObject positions = thread.secondMultipleValue();
            thread.resetMultipleValues();
            xrs_merge_update_backpointer(new_xrm, referenced_global, backtable);
        }
        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
        return xrs;
    }

    public static final SubLObject xrs_merge_new_global_modified_by_method_alt(SubLObject xrs, SubLObject new_xrm) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject table = xref_m_method_global_modification_table(new_xrm);
                SubLObject backtable = xref_s_global_modified_by_method_table(xrs);
                SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(table));
                while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)) {
                    thread.resetMultipleValues();
                    {
                        SubLObject method = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                        SubLObject modified_globals = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        {
                            SubLObject cdolist_list_var = modified_globals;
                            SubLObject modified_global = NIL;
                            for (modified_global = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , modified_global = cdolist_list_var.first()) {
                                xrs_merge_update_backpointer(method, modified_global, backtable);
                            }
                        }
                        iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state);
                    }
                } 
                dictionary_contents.do_dictionary_contents_finalize(iteration_state);
            }
            return xrs;
        }
    }

    public static SubLObject xrs_merge_new_global_modified_by_method(final SubLObject xrs, final SubLObject new_xrm) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject table = xref_m_method_global_modification_table(new_xrm);
        final SubLObject backtable = xref_s_global_modified_by_method_table(xrs);
        SubLObject iteration_state;
        for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(table)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
            thread.resetMultipleValues();
            final SubLObject method = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
            final SubLObject modified_globals = thread.secondMultipleValue();
            thread.resetMultipleValues();
            SubLObject cdolist_list_var = modified_globals;
            SubLObject modified_global = NIL;
            modified_global = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                xrs_merge_update_backpointer(method, modified_global, backtable);
                cdolist_list_var = cdolist_list_var.rest();
                modified_global = cdolist_list_var.first();
            } 
        }
        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
        return xrs;
    }

    public static final SubLObject xrs_merge_new_global_modified_at_top_level_alt(SubLObject xrs, SubLObject new_xrm) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject table = xref_m_top_global_modification_table(new_xrm);
                SubLObject backtable = xref_s_global_modified_at_top_level_table(xrs);
                SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(table));
                while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)) {
                    thread.resetMultipleValues();
                    {
                        SubLObject modified_global = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                        SubLObject positions = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        xrs_merge_update_backpointer(new_xrm, modified_global, backtable);
                        iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state);
                    }
                } 
                dictionary_contents.do_dictionary_contents_finalize(iteration_state);
            }
            return xrs;
        }
    }

    public static SubLObject xrs_merge_new_global_modified_at_top_level(final SubLObject xrs, final SubLObject new_xrm) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject table = xref_m_top_global_modification_table(new_xrm);
        final SubLObject backtable = xref_s_global_modified_at_top_level_table(xrs);
        SubLObject iteration_state;
        for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(table)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
            thread.resetMultipleValues();
            final SubLObject modified_global = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
            final SubLObject positions = thread.secondMultipleValue();
            thread.resetMultipleValues();
            xrs_merge_update_backpointer(new_xrm, modified_global, backtable);
        }
        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
        return xrs;
    }

    public static final SubLObject xrs_merge_new_global_rebound_by_method_alt(SubLObject xrs, SubLObject new_xrm) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject table = xref_m_method_global_binding_table(new_xrm);
                SubLObject backtable = xref_s_global_rebound_by_method_table(xrs);
                SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(table));
                while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)) {
                    thread.resetMultipleValues();
                    {
                        SubLObject method = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                        SubLObject rebound_globals = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        {
                            SubLObject cdolist_list_var = rebound_globals;
                            SubLObject rebound_global = NIL;
                            for (rebound_global = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , rebound_global = cdolist_list_var.first()) {
                                xrs_merge_update_backpointer(method, rebound_global, backtable);
                            }
                        }
                        iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state);
                    }
                } 
                dictionary_contents.do_dictionary_contents_finalize(iteration_state);
            }
            return xrs;
        }
    }

    public static SubLObject xrs_merge_new_global_rebound_by_method(final SubLObject xrs, final SubLObject new_xrm) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject table = xref_m_method_global_binding_table(new_xrm);
        final SubLObject backtable = xref_s_global_rebound_by_method_table(xrs);
        SubLObject iteration_state;
        for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(table)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
            thread.resetMultipleValues();
            final SubLObject method = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
            final SubLObject rebound_globals = thread.secondMultipleValue();
            thread.resetMultipleValues();
            SubLObject cdolist_list_var = rebound_globals;
            SubLObject rebound_global = NIL;
            rebound_global = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                xrs_merge_update_backpointer(method, rebound_global, backtable);
                cdolist_list_var = cdolist_list_var.rest();
                rebound_global = cdolist_list_var.first();
            } 
        }
        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
        return xrs;
    }

    public static final SubLObject xrs_merge_new_global_rebound_at_top_level_alt(SubLObject xrs, SubLObject new_xrm) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject table = xref_m_top_global_binding_table(new_xrm);
                SubLObject backtable = xref_s_global_rebound_at_top_level_table(xrs);
                SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(table));
                while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)) {
                    thread.resetMultipleValues();
                    {
                        SubLObject rebound_global = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                        SubLObject positions = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        xrs_merge_update_backpointer(new_xrm, rebound_global, backtable);
                        iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state);
                    }
                } 
                dictionary_contents.do_dictionary_contents_finalize(iteration_state);
            }
            return xrs;
        }
    }

    public static SubLObject xrs_merge_new_global_rebound_at_top_level(final SubLObject xrs, final SubLObject new_xrm) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject table = xref_m_top_global_binding_table(new_xrm);
        final SubLObject backtable = xref_s_global_rebound_at_top_level_table(xrs);
        SubLObject iteration_state;
        for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(table)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
            thread.resetMultipleValues();
            final SubLObject rebound_global = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
            final SubLObject positions = thread.secondMultipleValue();
            thread.resetMultipleValues();
            xrs_merge_update_backpointer(new_xrm, rebound_global, backtable);
        }
        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
        return xrs;
    }

    public static final SubLObject xrs_remove_old_xrm_alt(SubLObject xrs, SubLObject old_xrm) {
        {
            SubLObject name = xrm_name(old_xrm);
            SubLObject table = xref_s_xref_module_table(xrs);
            remhash(name, table);
        }
        xrs_remove_old_method_definitions(xrs, old_xrm);
        xrs_remove_old_global_definitions(xrs, old_xrm);
        xrs_remove_old_method_called_by_method(xrs, old_xrm);
        xrs_remove_old_method_called_by_global(xrs, old_xrm);
        xrs_remove_old_method_called_at_top_level(xrs, old_xrm);
        xrs_remove_old_global_referenced_by_method(xrs, old_xrm);
        xrs_remove_old_global_referenced_by_global(xrs, old_xrm);
        xrs_remove_old_global_referenced_at_top_level(xrs, old_xrm);
        xrs_remove_old_global_modified_by_method(xrs, old_xrm);
        xrs_remove_old_global_modified_at_top_level(xrs, old_xrm);
        xrs_remove_old_global_rebound_by_method(xrs, old_xrm);
        xrs_remove_old_global_rebound_at_top_level(xrs, old_xrm);
        return xrs;
    }

    public static SubLObject xrs_remove_old_xrm(final SubLObject xrs, final SubLObject old_xrm) {
        final SubLObject name = xrm_name(old_xrm);
        final SubLObject table = xref_s_xref_module_table(xrs);
        remhash(name, table);
        xrs_remove_old_method_definitions(xrs, old_xrm);
        xrs_remove_old_global_definitions(xrs, old_xrm);
        xrs_remove_old_method_called_by_method(xrs, old_xrm);
        xrs_remove_old_method_called_by_global(xrs, old_xrm);
        xrs_remove_old_method_called_at_top_level(xrs, old_xrm);
        xrs_remove_old_global_referenced_by_method(xrs, old_xrm);
        xrs_remove_old_global_referenced_by_global(xrs, old_xrm);
        xrs_remove_old_global_referenced_at_top_level(xrs, old_xrm);
        xrs_remove_old_global_modified_by_method(xrs, old_xrm);
        xrs_remove_old_global_modified_at_top_level(xrs, old_xrm);
        xrs_remove_old_global_rebound_by_method(xrs, old_xrm);
        xrs_remove_old_global_rebound_at_top_level(xrs, old_xrm);
        return xrs;
    }

    public static final SubLObject xrs_remove_definition_alt(SubLObject old_xrm, SubLObject old_object, SubLObject backtable) {
        {
            SubLObject old_module_spec = gethash_without_values(old_object, backtable, UNPROVIDED);
            SubLObject new_module_spec = NIL;
            if (NIL == old_module_spec) {
            } else {
                if (NIL != xref_module_p(old_module_spec)) {
                    new_module_spec = NIL;
                } else {
                    new_module_spec = delete(old_xrm, old_module_spec, symbol_function(EQ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    if (NIL != singletonP(new_module_spec)) {
                        new_module_spec = new_module_spec.first();
                    }
                }
            }
            if (NIL == new_module_spec) {
                remhash(old_object, backtable);
            } else {
                sethash(old_object, backtable, new_module_spec);
            }
        }
        return NIL;
    }

    public static SubLObject xrs_remove_definition(final SubLObject old_xrm, final SubLObject old_object, final SubLObject backtable) {
        final SubLObject old_module_spec = gethash_without_values(old_object, backtable, UNPROVIDED);
        SubLObject new_module_spec = NIL;
        if (NIL != old_module_spec) {
            if (NIL != xref_module_p(old_module_spec)) {
                new_module_spec = NIL;
            } else {
                new_module_spec = delete(old_xrm, old_module_spec, symbol_function(EQ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                if (NIL != list_utilities.singletonP(new_module_spec)) {
                    new_module_spec = new_module_spec.first();
                }
            }
        }
        if (NIL == new_module_spec) {
            remhash(old_object, backtable);
        } else {
            sethash(old_object, backtable, new_module_spec);
        }
        return NIL;
    }

    public static final SubLObject xrs_remove_old_method_definitions_alt(SubLObject xrs, SubLObject old_xrm) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject backtable = xref_s_method_definition_table(xrs);
                SubLObject xrm_var = old_xrm;
                SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(xrm_method_position_table(xrm_var)));
                while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)) {
                    thread.resetMultipleValues();
                    {
                        SubLObject method = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                        SubLObject position = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        xrs_remove_definition(old_xrm, method, backtable);
                        iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state);
                    }
                } 
                dictionary_contents.do_dictionary_contents_finalize(iteration_state);
            }
            return xrs;
        }
    }

    public static SubLObject xrs_remove_old_method_definitions(final SubLObject xrs, final SubLObject old_xrm) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject backtable = xref_s_method_definition_table(xrs);
        SubLObject iteration_state;
        for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(xrm_method_position_table(old_xrm))); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
            thread.resetMultipleValues();
            final SubLObject method = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
            final SubLObject position = thread.secondMultipleValue();
            thread.resetMultipleValues();
            xrs_remove_definition(old_xrm, method, backtable);
        }
        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
        return xrs;
    }

    public static final SubLObject xrs_remove_old_global_definitions_alt(SubLObject xrs, SubLObject old_xrm) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject backtable = xref_s_global_definition_table(xrs);
                SubLObject xrm_var = old_xrm;
                SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(xrm_global_position_table(xrm_var)));
                while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)) {
                    thread.resetMultipleValues();
                    {
                        SubLObject global = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                        SubLObject position = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        xrs_remove_definition(old_xrm, global, backtable);
                        iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state);
                    }
                } 
                dictionary_contents.do_dictionary_contents_finalize(iteration_state);
            }
            return xrs;
        }
    }

    public static SubLObject xrs_remove_old_global_definitions(final SubLObject xrs, final SubLObject old_xrm) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject backtable = xref_s_global_definition_table(xrs);
        SubLObject iteration_state;
        for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(xrm_global_position_table(old_xrm))); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
            thread.resetMultipleValues();
            final SubLObject global = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
            final SubLObject position = thread.secondMultipleValue();
            thread.resetMultipleValues();
            xrs_remove_definition(old_xrm, global, backtable);
        }
        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
        return xrs;
    }

    public static final SubLObject xrs_remove_update_backpointer_alt(SubLObject client_object, SubLObject server_object, SubLObject backtable) {
        {
            SubLObject back_contents = gethash_without_values(server_object, backtable, $empty_set_contents$.getGlobalValue());
            back_contents = set_contents.set_contents_delete(client_object, back_contents, symbol_function(EQ));
            if (NIL != set_contents.set_contents_emptyP(back_contents)) {
                remhash(server_object, backtable);
            } else {
                sethash(server_object, backtable, back_contents);
            }
        }
        return NIL;
    }

    public static SubLObject xrs_remove_update_backpointer(final SubLObject client_object, final SubLObject server_object, final SubLObject backtable) {
        SubLObject back_contents = gethash_without_values(server_object, backtable, $empty_set_contents$.getGlobalValue());
        back_contents = set_contents.set_contents_delete(client_object, back_contents, symbol_function(EQ));
        if (NIL != set_contents.set_contents_emptyP(back_contents)) {
            remhash(server_object, backtable);
        } else {
            sethash(server_object, backtable, back_contents);
        }
        return NIL;
    }

    public static final SubLObject xrs_remove_old_method_called_by_method_alt(SubLObject xrs, SubLObject old_xrm) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject table = xref_m_method_method_table(old_xrm);
                SubLObject backtable = xref_s_method_called_by_method_table(xrs);
                SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(table));
                while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)) {
                    thread.resetMultipleValues();
                    {
                        SubLObject method = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                        SubLObject calls_methods = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        {
                            SubLObject cdolist_list_var = calls_methods;
                            SubLObject call_method = NIL;
                            for (call_method = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , call_method = cdolist_list_var.first()) {
                                xrs_remove_update_backpointer(method, call_method, backtable);
                            }
                        }
                        iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state);
                    }
                } 
                dictionary_contents.do_dictionary_contents_finalize(iteration_state);
            }
            return xrs;
        }
    }

    public static SubLObject xrs_remove_old_method_called_by_method(final SubLObject xrs, final SubLObject old_xrm) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject table = xref_m_method_method_table(old_xrm);
        final SubLObject backtable = xref_s_method_called_by_method_table(xrs);
        SubLObject iteration_state;
        for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(table)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
            thread.resetMultipleValues();
            final SubLObject method = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
            final SubLObject calls_methods = thread.secondMultipleValue();
            thread.resetMultipleValues();
            SubLObject cdolist_list_var = calls_methods;
            SubLObject call_method = NIL;
            call_method = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                xrs_remove_update_backpointer(method, call_method, backtable);
                cdolist_list_var = cdolist_list_var.rest();
                call_method = cdolist_list_var.first();
            } 
        }
        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
        return xrs;
    }

    public static final SubLObject xrs_remove_old_method_called_by_global_alt(SubLObject xrs, SubLObject old_xrm) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject table = xref_m_global_method_table(old_xrm);
                SubLObject backtable = xref_s_method_called_by_global_table(xrs);
                SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(table));
                while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)) {
                    thread.resetMultipleValues();
                    {
                        SubLObject global = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                        SubLObject calls_methods = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        {
                            SubLObject cdolist_list_var = calls_methods;
                            SubLObject call_method = NIL;
                            for (call_method = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , call_method = cdolist_list_var.first()) {
                                xrs_remove_update_backpointer(global, call_method, backtable);
                            }
                        }
                        iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state);
                    }
                } 
                dictionary_contents.do_dictionary_contents_finalize(iteration_state);
            }
            return xrs;
        }
    }

    public static SubLObject xrs_remove_old_method_called_by_global(final SubLObject xrs, final SubLObject old_xrm) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject table = xref_m_global_method_table(old_xrm);
        final SubLObject backtable = xref_s_method_called_by_global_table(xrs);
        SubLObject iteration_state;
        for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(table)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
            thread.resetMultipleValues();
            final SubLObject global = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
            final SubLObject calls_methods = thread.secondMultipleValue();
            thread.resetMultipleValues();
            SubLObject cdolist_list_var = calls_methods;
            SubLObject call_method = NIL;
            call_method = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                xrs_remove_update_backpointer(global, call_method, backtable);
                cdolist_list_var = cdolist_list_var.rest();
                call_method = cdolist_list_var.first();
            } 
        }
        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
        return xrs;
    }

    public static final SubLObject xrs_remove_old_method_called_at_top_level_alt(SubLObject xrs, SubLObject old_xrm) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject table = xref_m_top_method_table(old_xrm);
                SubLObject backtable = xref_s_method_called_at_top_level_table(xrs);
                SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(table));
                while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)) {
                    thread.resetMultipleValues();
                    {
                        SubLObject call_method = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                        SubLObject positions = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        xrs_remove_update_backpointer(old_xrm, call_method, backtable);
                        iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state);
                    }
                } 
                dictionary_contents.do_dictionary_contents_finalize(iteration_state);
            }
            return xrs;
        }
    }

    public static SubLObject xrs_remove_old_method_called_at_top_level(final SubLObject xrs, final SubLObject old_xrm) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject table = xref_m_top_method_table(old_xrm);
        final SubLObject backtable = xref_s_method_called_at_top_level_table(xrs);
        SubLObject iteration_state;
        for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(table)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
            thread.resetMultipleValues();
            final SubLObject call_method = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
            final SubLObject positions = thread.secondMultipleValue();
            thread.resetMultipleValues();
            xrs_remove_update_backpointer(old_xrm, call_method, backtable);
        }
        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
        return xrs;
    }

    public static final SubLObject xrs_remove_old_global_referenced_by_method_alt(SubLObject xrs, SubLObject old_xrm) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject table = xref_m_method_global_reference_table(old_xrm);
                SubLObject backtable = xref_s_global_referenced_by_method_table(xrs);
                SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(table));
                while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)) {
                    thread.resetMultipleValues();
                    {
                        SubLObject method = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                        SubLObject referenced_globals = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        {
                            SubLObject cdolist_list_var = referenced_globals;
                            SubLObject referenced_global = NIL;
                            for (referenced_global = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , referenced_global = cdolist_list_var.first()) {
                                xrs_remove_update_backpointer(method, referenced_global, backtable);
                            }
                        }
                        iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state);
                    }
                } 
                dictionary_contents.do_dictionary_contents_finalize(iteration_state);
            }
            return xrs;
        }
    }

    public static SubLObject xrs_remove_old_global_referenced_by_method(final SubLObject xrs, final SubLObject old_xrm) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject table = xref_m_method_global_reference_table(old_xrm);
        final SubLObject backtable = xref_s_global_referenced_by_method_table(xrs);
        SubLObject iteration_state;
        for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(table)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
            thread.resetMultipleValues();
            final SubLObject method = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
            final SubLObject referenced_globals = thread.secondMultipleValue();
            thread.resetMultipleValues();
            SubLObject cdolist_list_var = referenced_globals;
            SubLObject referenced_global = NIL;
            referenced_global = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                xrs_remove_update_backpointer(method, referenced_global, backtable);
                cdolist_list_var = cdolist_list_var.rest();
                referenced_global = cdolist_list_var.first();
            } 
        }
        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
        return xrs;
    }

    public static final SubLObject xrs_remove_old_global_referenced_by_global_alt(SubLObject xrs, SubLObject old_xrm) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject table = xref_m_global_global_reference_table(old_xrm);
                SubLObject backtable = xref_s_global_referenced_by_global_table(xrs);
                SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(table));
                while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)) {
                    thread.resetMultipleValues();
                    {
                        SubLObject global = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                        SubLObject referenced_globals = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        {
                            SubLObject cdolist_list_var = referenced_globals;
                            SubLObject referenced_global = NIL;
                            for (referenced_global = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , referenced_global = cdolist_list_var.first()) {
                                xrs_remove_update_backpointer(global, referenced_global, backtable);
                            }
                        }
                        iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state);
                    }
                } 
                dictionary_contents.do_dictionary_contents_finalize(iteration_state);
            }
            return xrs;
        }
    }

    public static SubLObject xrs_remove_old_global_referenced_by_global(final SubLObject xrs, final SubLObject old_xrm) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject table = xref_m_global_global_reference_table(old_xrm);
        final SubLObject backtable = xref_s_global_referenced_by_global_table(xrs);
        SubLObject iteration_state;
        for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(table)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
            thread.resetMultipleValues();
            final SubLObject global = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
            final SubLObject referenced_globals = thread.secondMultipleValue();
            thread.resetMultipleValues();
            SubLObject cdolist_list_var = referenced_globals;
            SubLObject referenced_global = NIL;
            referenced_global = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                xrs_remove_update_backpointer(global, referenced_global, backtable);
                cdolist_list_var = cdolist_list_var.rest();
                referenced_global = cdolist_list_var.first();
            } 
        }
        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
        return xrs;
    }

    public static final SubLObject xrs_remove_old_global_referenced_at_top_level_alt(SubLObject xrs, SubLObject old_xrm) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject table = xref_m_top_global_reference_table(old_xrm);
                SubLObject backtable = xref_s_global_referenced_at_top_level_table(xrs);
                SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(table));
                while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)) {
                    thread.resetMultipleValues();
                    {
                        SubLObject referenced_global = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                        SubLObject positions = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        xrs_remove_update_backpointer(old_xrm, referenced_global, backtable);
                        iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state);
                    }
                } 
                dictionary_contents.do_dictionary_contents_finalize(iteration_state);
            }
            return xrs;
        }
    }

    public static SubLObject xrs_remove_old_global_referenced_at_top_level(final SubLObject xrs, final SubLObject old_xrm) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject table = xref_m_top_global_reference_table(old_xrm);
        final SubLObject backtable = xref_s_global_referenced_at_top_level_table(xrs);
        SubLObject iteration_state;
        for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(table)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
            thread.resetMultipleValues();
            final SubLObject referenced_global = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
            final SubLObject positions = thread.secondMultipleValue();
            thread.resetMultipleValues();
            xrs_remove_update_backpointer(old_xrm, referenced_global, backtable);
        }
        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
        return xrs;
    }

    public static final SubLObject xrs_remove_old_global_modified_by_method_alt(SubLObject xrs, SubLObject old_xrm) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject table = xref_m_method_global_modification_table(old_xrm);
                SubLObject backtable = xref_s_global_modified_by_method_table(xrs);
                SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(table));
                while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)) {
                    thread.resetMultipleValues();
                    {
                        SubLObject method = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                        SubLObject modified_globals = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        {
                            SubLObject cdolist_list_var = modified_globals;
                            SubLObject modified_global = NIL;
                            for (modified_global = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , modified_global = cdolist_list_var.first()) {
                                xrs_remove_update_backpointer(method, modified_global, backtable);
                            }
                        }
                        iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state);
                    }
                } 
                dictionary_contents.do_dictionary_contents_finalize(iteration_state);
            }
            return xrs;
        }
    }

    public static SubLObject xrs_remove_old_global_modified_by_method(final SubLObject xrs, final SubLObject old_xrm) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject table = xref_m_method_global_modification_table(old_xrm);
        final SubLObject backtable = xref_s_global_modified_by_method_table(xrs);
        SubLObject iteration_state;
        for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(table)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
            thread.resetMultipleValues();
            final SubLObject method = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
            final SubLObject modified_globals = thread.secondMultipleValue();
            thread.resetMultipleValues();
            SubLObject cdolist_list_var = modified_globals;
            SubLObject modified_global = NIL;
            modified_global = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                xrs_remove_update_backpointer(method, modified_global, backtable);
                cdolist_list_var = cdolist_list_var.rest();
                modified_global = cdolist_list_var.first();
            } 
        }
        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
        return xrs;
    }

    public static final SubLObject xrs_remove_old_global_modified_at_top_level_alt(SubLObject xrs, SubLObject old_xrm) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject table = xref_m_top_global_modification_table(old_xrm);
                SubLObject backtable = xref_s_global_modified_at_top_level_table(xrs);
                SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(table));
                while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)) {
                    thread.resetMultipleValues();
                    {
                        SubLObject modified_global = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                        SubLObject positions = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        xrs_remove_update_backpointer(old_xrm, modified_global, backtable);
                        iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state);
                    }
                } 
                dictionary_contents.do_dictionary_contents_finalize(iteration_state);
            }
            return xrs;
        }
    }

    public static SubLObject xrs_remove_old_global_modified_at_top_level(final SubLObject xrs, final SubLObject old_xrm) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject table = xref_m_top_global_modification_table(old_xrm);
        final SubLObject backtable = xref_s_global_modified_at_top_level_table(xrs);
        SubLObject iteration_state;
        for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(table)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
            thread.resetMultipleValues();
            final SubLObject modified_global = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
            final SubLObject positions = thread.secondMultipleValue();
            thread.resetMultipleValues();
            xrs_remove_update_backpointer(old_xrm, modified_global, backtable);
        }
        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
        return xrs;
    }

    public static final SubLObject xrs_remove_old_global_rebound_by_method_alt(SubLObject xrs, SubLObject old_xrm) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject table = xref_m_method_global_binding_table(old_xrm);
                SubLObject backtable = xref_s_global_rebound_by_method_table(xrs);
                SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(table));
                while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)) {
                    thread.resetMultipleValues();
                    {
                        SubLObject method = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                        SubLObject rebound_globals = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        {
                            SubLObject cdolist_list_var = rebound_globals;
                            SubLObject rebound_global = NIL;
                            for (rebound_global = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , rebound_global = cdolist_list_var.first()) {
                                xrs_remove_update_backpointer(method, rebound_global, backtable);
                            }
                        }
                        iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state);
                    }
                } 
                dictionary_contents.do_dictionary_contents_finalize(iteration_state);
            }
            return xrs;
        }
    }

    public static SubLObject xrs_remove_old_global_rebound_by_method(final SubLObject xrs, final SubLObject old_xrm) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject table = xref_m_method_global_binding_table(old_xrm);
        final SubLObject backtable = xref_s_global_rebound_by_method_table(xrs);
        SubLObject iteration_state;
        for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(table)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
            thread.resetMultipleValues();
            final SubLObject method = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
            final SubLObject rebound_globals = thread.secondMultipleValue();
            thread.resetMultipleValues();
            SubLObject cdolist_list_var = rebound_globals;
            SubLObject rebound_global = NIL;
            rebound_global = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                xrs_remove_update_backpointer(method, rebound_global, backtable);
                cdolist_list_var = cdolist_list_var.rest();
                rebound_global = cdolist_list_var.first();
            } 
        }
        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
        return xrs;
    }

    public static final SubLObject xrs_remove_old_global_rebound_at_top_level_alt(SubLObject xrs, SubLObject old_xrm) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject table = xref_m_top_global_binding_table(old_xrm);
                SubLObject backtable = xref_s_global_rebound_at_top_level_table(xrs);
                SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(table));
                while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)) {
                    thread.resetMultipleValues();
                    {
                        SubLObject rebound_global = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                        SubLObject positions = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        xrs_remove_update_backpointer(old_xrm, rebound_global, backtable);
                        iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state);
                    }
                } 
                dictionary_contents.do_dictionary_contents_finalize(iteration_state);
            }
            return xrs;
        }
    }

    public static SubLObject xrs_remove_old_global_rebound_at_top_level(final SubLObject xrs, final SubLObject old_xrm) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject table = xref_m_top_global_binding_table(old_xrm);
        final SubLObject backtable = xref_s_global_rebound_at_top_level_table(xrs);
        SubLObject iteration_state;
        for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(table)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
            thread.resetMultipleValues();
            final SubLObject rebound_global = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
            final SubLObject positions = thread.secondMultipleValue();
            thread.resetMultipleValues();
            xrs_remove_update_backpointer(old_xrm, rebound_global, backtable);
        }
        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
        return xrs;
    }

    public static final SubLObject xref_possibly_record_global_undefinition_alt(SubLObject global, SubLObject new_xrm) {
        {
            SubLObject old_xrm = xref_global_defining_xrm(global);
            if (NIL != old_xrm) {
                if (!xrm_name(old_xrm).equal(xrm_name(new_xrm))) {
                    {
                        SubLObject xrs = xrm_xref_system(old_xrm);
                        xrs_unrecord_global_backpointers(xrs, old_xrm, global);
                        xrm_unrecord_global_definition(old_xrm, global);
                        return T;
                    }
                }
            }
        }
        return NIL;
    }

    public static SubLObject xref_possibly_record_global_undefinition(final SubLObject global, final SubLObject new_xrm) {
        final SubLObject old_xrm = xref_global_defining_xrm(global);
        if ((NIL != old_xrm) && (!xrm_name(old_xrm).equal(xrm_name(new_xrm)))) {
            final SubLObject xrs = xrm_xref_system(old_xrm);
            xrs_unrecord_global_backpointers(xrs, old_xrm, global);
            xrm_unrecord_global_definition(old_xrm, global);
            return T;
        }
        return NIL;
    }

    public static final SubLObject xrs_unrecord_global_backpointers_alt(SubLObject xrs, SubLObject old_xrm, SubLObject global) {
        {
            SubLObject backtable = xref_s_method_called_by_global_table(xrs);
            SubLObject table = xref_m_global_method_table(old_xrm);
            SubLObject called_methods = dictionary.dictionary_lookup_without_values(table, global, UNPROVIDED);
            SubLObject cdolist_list_var = called_methods;
            SubLObject called_method = NIL;
            for (called_method = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , called_method = cdolist_list_var.first()) {
                xrs_remove_update_backpointer(global, called_method, backtable);
            }
        }
        {
            SubLObject backtable = xref_s_global_referenced_by_global_table(xrs);
            SubLObject table = xref_m_global_global_reference_table(old_xrm);
            SubLObject referenced_globals = dictionary.dictionary_lookup_without_values(table, global, UNPROVIDED);
            SubLObject cdolist_list_var = referenced_globals;
            SubLObject referenced_global = NIL;
            for (referenced_global = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , referenced_global = cdolist_list_var.first()) {
                xrs_remove_update_backpointer(global, referenced_global, backtable);
            }
        }
        {
            SubLObject backtable = xref_s_global_definition_table(xrs);
            xrs_remove_definition(old_xrm, global, backtable);
        }
        return xrs;
    }

    public static SubLObject xrs_unrecord_global_backpointers(final SubLObject xrs, final SubLObject old_xrm, final SubLObject global) {
        SubLObject backtable = xref_s_method_called_by_global_table(xrs);
        SubLObject table = xref_m_global_method_table(old_xrm);
        SubLObject cdolist_list_var;
        final SubLObject called_methods = cdolist_list_var = dictionary.dictionary_lookup_without_values(table, global, UNPROVIDED);
        SubLObject called_method = NIL;
        called_method = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            xrs_remove_update_backpointer(global, called_method, backtable);
            cdolist_list_var = cdolist_list_var.rest();
            called_method = cdolist_list_var.first();
        } 
        backtable = xref_s_global_referenced_by_global_table(xrs);
        table = xref_m_global_global_reference_table(old_xrm);
        final SubLObject referenced_globals = cdolist_list_var = dictionary.dictionary_lookup_without_values(table, global, UNPROVIDED);
        SubLObject referenced_global = NIL;
        referenced_global = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            xrs_remove_update_backpointer(global, referenced_global, backtable);
            cdolist_list_var = cdolist_list_var.rest();
            referenced_global = cdolist_list_var.first();
        } 
        backtable = xref_s_global_definition_table(xrs);
        xrs_remove_definition(old_xrm, global, backtable);
        return xrs;
    }

    public static final SubLObject xref_possibly_record_method_undefinition_alt(SubLObject method, SubLObject new_xrm) {
        {
            SubLObject old_xrm = xref_method_defining_xrm(method);
            if (NIL != old_xrm) {
                if (!xrm_name(old_xrm).equal(xrm_name(new_xrm))) {
                    {
                        SubLObject xrs = xrm_xref_system(old_xrm);
                        xrs_unrecord_method_backpointers(xrs, old_xrm, method);
                        xrm_unrecord_method_definition(old_xrm, method);
                        return T;
                    }
                }
            }
        }
        return NIL;
    }

    public static SubLObject xref_possibly_record_method_undefinition(final SubLObject method, final SubLObject new_xrm) {
        final SubLObject old_xrm = xref_method_defining_xrm(method);
        if ((NIL != old_xrm) && (!xrm_name(old_xrm).equal(xrm_name(new_xrm)))) {
            final SubLObject xrs = xrm_xref_system(old_xrm);
            xrs_unrecord_method_backpointers(xrs, old_xrm, method);
            xrm_unrecord_method_definition(old_xrm, method);
            return T;
        }
        return NIL;
    }

    public static final SubLObject xrs_unrecord_method_backpointers_alt(SubLObject xrs, SubLObject old_xrm, SubLObject method) {
        {
            SubLObject backtable = xref_s_method_called_by_method_table(xrs);
            SubLObject table = xref_m_method_method_table(old_xrm);
            SubLObject called_methods = dictionary.dictionary_lookup_without_values(table, method, UNPROVIDED);
            SubLObject cdolist_list_var = called_methods;
            SubLObject called_method = NIL;
            for (called_method = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , called_method = cdolist_list_var.first()) {
                xrs_remove_update_backpointer(method, called_method, backtable);
            }
        }
        {
            SubLObject backtable = xref_s_global_referenced_by_method_table(xrs);
            SubLObject table = xref_m_method_global_reference_table(old_xrm);
            SubLObject referenced_globals = dictionary.dictionary_lookup_without_values(table, method, UNPROVIDED);
            SubLObject cdolist_list_var = referenced_globals;
            SubLObject referenced_global = NIL;
            for (referenced_global = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , referenced_global = cdolist_list_var.first()) {
                xrs_remove_update_backpointer(method, referenced_global, backtable);
            }
        }
        {
            SubLObject backtable = xref_s_global_modified_by_method_table(xrs);
            SubLObject table = xref_m_method_global_modification_table(old_xrm);
            SubLObject modified_globals = dictionary.dictionary_lookup_without_values(table, method, UNPROVIDED);
            SubLObject cdolist_list_var = modified_globals;
            SubLObject modified_global = NIL;
            for (modified_global = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , modified_global = cdolist_list_var.first()) {
                xrs_remove_update_backpointer(method, modified_global, backtable);
            }
        }
        {
            SubLObject backtable = xref_s_global_rebound_by_method_table(xrs);
            SubLObject table = xref_m_method_global_binding_table(old_xrm);
            SubLObject rebound_globals = dictionary.dictionary_lookup_without_values(table, method, UNPROVIDED);
            SubLObject cdolist_list_var = rebound_globals;
            SubLObject rebound_global = NIL;
            for (rebound_global = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , rebound_global = cdolist_list_var.first()) {
                xrs_remove_update_backpointer(method, rebound_global, backtable);
            }
        }
        {
            SubLObject backtable = xref_s_method_definition_table(xrs);
            xrs_remove_definition(old_xrm, method, backtable);
        }
        return xrs;
    }

    public static SubLObject xrs_unrecord_method_backpointers(final SubLObject xrs, final SubLObject old_xrm, final SubLObject method) {
        SubLObject backtable = xref_s_method_called_by_method_table(xrs);
        SubLObject table = xref_m_method_method_table(old_xrm);
        SubLObject cdolist_list_var;
        final SubLObject called_methods = cdolist_list_var = dictionary.dictionary_lookup_without_values(table, method, UNPROVIDED);
        SubLObject called_method = NIL;
        called_method = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            xrs_remove_update_backpointer(method, called_method, backtable);
            cdolist_list_var = cdolist_list_var.rest();
            called_method = cdolist_list_var.first();
        } 
        backtable = xref_s_global_referenced_by_method_table(xrs);
        table = xref_m_method_global_reference_table(old_xrm);
        final SubLObject referenced_globals = cdolist_list_var = dictionary.dictionary_lookup_without_values(table, method, UNPROVIDED);
        SubLObject referenced_global = NIL;
        referenced_global = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            xrs_remove_update_backpointer(method, referenced_global, backtable);
            cdolist_list_var = cdolist_list_var.rest();
            referenced_global = cdolist_list_var.first();
        } 
        backtable = xref_s_global_modified_by_method_table(xrs);
        table = xref_m_method_global_modification_table(old_xrm);
        final SubLObject modified_globals = cdolist_list_var = dictionary.dictionary_lookup_without_values(table, method, UNPROVIDED);
        SubLObject modified_global = NIL;
        modified_global = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            xrs_remove_update_backpointer(method, modified_global, backtable);
            cdolist_list_var = cdolist_list_var.rest();
            modified_global = cdolist_list_var.first();
        } 
        backtable = xref_s_global_rebound_by_method_table(xrs);
        table = xref_m_method_global_binding_table(old_xrm);
        final SubLObject rebound_globals = cdolist_list_var = dictionary.dictionary_lookup_without_values(table, method, UNPROVIDED);
        SubLObject rebound_global = NIL;
        rebound_global = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            xrs_remove_update_backpointer(method, rebound_global, backtable);
            cdolist_list_var = cdolist_list_var.rest();
            rebound_global = cdolist_list_var.first();
        } 
        backtable = xref_s_method_definition_table(xrs);
        xrs_remove_definition(old_xrm, method, backtable);
        return xrs;
    }

    public static final SubLObject within_new_xref_module_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt180);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject allow_other_keys_p = NIL;
                    SubLObject rest = current;
                    SubLObject bad = NIL;
                    SubLObject current_11 = NIL;
                    for (; NIL != rest;) {
                        destructuring_bind_must_consp(rest, datum, $list_alt180);
                        current_11 = rest.first();
                        rest = rest.rest();
                        destructuring_bind_must_consp(rest, datum, $list_alt180);
                        if (NIL == member(current_11, $list_alt181, UNPROVIDED, UNPROVIDED)) {
                            bad = T;
                        }
                        if (current_11 == $ALLOW_OTHER_KEYS) {
                            allow_other_keys_p = rest.first();
                        }
                        rest = rest.rest();
                    }
                    if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                        cdestructuring_bind_error(datum, $list_alt180);
                    }
                    {
                        SubLObject name_tail = property_list_member($NAME, current);
                        SubLObject name = (NIL != name_tail) ? ((SubLObject) (cadr(name_tail))) : NIL;
                        SubLObject features_tail = property_list_member($FEATURES, current);
                        SubLObject features = (NIL != features_tail) ? ((SubLObject) (cadr(features_tail))) : NIL;
                        current = temp;
                        {
                            SubLObject body = current;
                            SubLObject system_var = $sym182$SYSTEM_VAR;
                            SubLObject module_var = $sym183$MODULE_VAR;
                            return list(CLET, list(bq_cons(system_var, $list_alt184), list(module_var, list(FWHEN, system_var, list(NEW_XREF_MODULE, system_var, name, features)))), listS(CLET, list(list($current_xref_module$, module_var)), append(body, NIL)), list(PWHEN, module_var, list(XRS_MERGE_XREF_MODULE, system_var, module_var)));
                        }
                    }
                }
            }
        }
    }

    public static SubLObject within_new_xref_module(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list185);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$7 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list185);
            current_$7 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list185);
            if (NIL == member(current_$7, $list186, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$7 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list185);
        }
        final SubLObject name_tail = property_list_member($NAME, current);
        final SubLObject name = (NIL != name_tail) ? cadr(name_tail) : NIL;
        final SubLObject features_tail = property_list_member($FEATURES, current);
        final SubLObject features = (NIL != features_tail) ? cadr(features_tail) : NIL;
        final SubLObject body;
        current = body = temp;
        final SubLObject system_var = $sym187$SYSTEM_VAR;
        final SubLObject module_var = $sym188$MODULE_VAR;
        return list(CLET, list(bq_cons(system_var, $list189), list(module_var, list(FWHEN, system_var, list(NEW_XREF_MODULE, system_var, name, features)))), listS(CLET, list(list($current_xref_module$, module_var)), append(body, NIL)), list(PWHEN, module_var, list(XRS_MERGE_XREF_MODULE, system_var, module_var)));
    }

    public static final SubLObject with_current_xref_module_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject xrm = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt190);
            xrm = current.first();
            current = current.rest();
            {
                SubLObject body = current;
                return list(CLET, list(bq_cons(xrm, $list_alt191)), listS(PWHEN, xrm, append(body, NIL)));
            }
        }
    }

    public static SubLObject with_current_xref_module(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject xrm = NIL;
        destructuring_bind_must_consp(current, datum, $list195);
        xrm = current.first();
        final SubLObject body;
        current = body = current.rest();
        return list(CLET, list(bq_cons(xrm, $list196)), listS(PWHEN, xrm, append(body, NIL)));
    }

    public static final SubLObject current_xref_module_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return $current_xref_module$.getDynamicValue(thread);
        }
    }

    public static SubLObject current_xref_module() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return $current_xref_module$.getDynamicValue(thread);
    }

    public static final SubLObject xref_within_module_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject module_name = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt194);
            module_name = current.first();
            current = current.rest();
            {
                SubLObject body = current;
                SubLObject name_var = $sym195$NAME_VAR;
                return list(CLET, list(list(name_var, module_name)), listS(CHECK_TYPE, name_var, $list_alt197), listS(CLET, list(list($xref_module_scope$, name_var)), append(body, NIL)));
            }
        }
    }

    public static SubLObject xref_within_module(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject module_name = NIL;
        destructuring_bind_must_consp(current, datum, $list199);
        module_name = current.first();
        final SubLObject body;
        current = body = current.rest();
        final SubLObject name_var = $sym200$NAME_VAR;
        return list(CLET, list(list(name_var, module_name)), listS(CHECK_TYPE, name_var, $list202), listS(CLET, list(list($xref_module_scope$, name_var)), append(body, NIL)));
    }

    public static final SubLObject xref_module_scope_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return $xref_module_scope$.getDynamicValue(thread);
        }
    }

    public static SubLObject xref_module_scope() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return $xref_module_scope$.getDynamicValue(thread);
    }

    public static final SubLObject xref_within_file_position_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject file_position = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt199);
            file_position = current.first();
            current = current.rest();
            {
                SubLObject body = current;
                SubLObject position_var = $sym200$POSITION_VAR;
                return list(CLET, list(list(position_var, file_position)), listS(CHECK_TYPE, position_var, $list_alt201), listS(CLET, list(list($xref_file_position_scope$, position_var)), append(body, NIL)));
            }
        }
    }

    public static SubLObject xref_within_file_position(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject file_position = NIL;
        destructuring_bind_must_consp(current, datum, $list204);
        file_position = current.first();
        final SubLObject body;
        current = body = current.rest();
        final SubLObject position_var = $sym205$POSITION_VAR;
        return list(CLET, list(list(position_var, file_position)), listS(CHECK_TYPE, position_var, $list206), listS(CLET, list(list($xref_file_position_scope$, position_var)), append(body, NIL)));
    }

    public static final SubLObject xref_file_position_scope_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return $xref_file_position_scope$.getDynamicValue(thread);
        }
    }

    public static SubLObject xref_file_position_scope() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return $xref_file_position_scope$.getDynamicValue(thread);
    }

    public static final SubLObject xref_within_define_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject name = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt203);
            name = current.first();
            current = current.rest();
            {
                SubLObject body = current;
                return listS(XREF_WITHIN_METHOD, name, append(body, NIL));
            }
        }
    }

    public static SubLObject xref_within_define(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject name = NIL;
        destructuring_bind_must_consp(current, datum, $list208);
        name = current.first();
        final SubLObject body;
        current = body = current.rest();
        return listS(XREF_WITHIN_METHOD, name, append(body, NIL));
    }

    public static final SubLObject xref_within_defmacro_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject name = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt203);
            name = current.first();
            current = current.rest();
            {
                SubLObject body = current;
                return listS(XREF_WITHIN_METHOD, name, append(body, NIL));
            }
        }
    }

    public static SubLObject xref_within_defmacro(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject name = NIL;
        destructuring_bind_must_consp(current, datum, $list208);
        name = current.first();
        final SubLObject body;
        current = body = current.rest();
        return listS(XREF_WITHIN_METHOD, name, append(body, NIL));
    }

    public static final SubLObject xref_within_method_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject method = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt205);
            method = current.first();
            current = current.rest();
            {
                SubLObject body = current;
                SubLObject method_var = $sym206$METHOD_VAR;
                return list(CLET, list(list(method_var, method)), listS(CHECK_TYPE, method_var, $list_alt207), listS(CLET, list(list($xref_method_scope$, method_var)), append(body, NIL)));
            }
        }
    }

    public static SubLObject xref_within_method(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject method = NIL;
        destructuring_bind_must_consp(current, datum, $list210);
        method = current.first();
        final SubLObject body;
        current = body = current.rest();
        final SubLObject method_var = $sym211$METHOD_VAR;
        return list(CLET, list(list(method_var, method)), listS(CHECK_TYPE, method_var, $list212), listS(CLET, list(list($xref_method_scope$, method_var)), append(body, NIL)));
    }

    public static final SubLObject xref_method_scope_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return $xref_method_scope$.getDynamicValue(thread);
        }
    }

    public static SubLObject xref_method_scope() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return $xref_method_scope$.getDynamicValue(thread);
    }

    public static final SubLObject xref_within_global_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject global = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt209);
            global = current.first();
            current = current.rest();
            {
                SubLObject body = current;
                SubLObject global_var = $sym210$GLOBAL_VAR;
                return list(CLET, list(list(global_var, global)), listS(CHECK_TYPE, global_var, $list_alt207), listS(CLET, list(list($xref_global_scope$, global_var)), append(body, NIL)));
            }
        }
    }

    public static SubLObject xref_within_global(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject global = NIL;
        destructuring_bind_must_consp(current, datum, $list214);
        global = current.first();
        final SubLObject body;
        current = body = current.rest();
        final SubLObject global_var = $sym215$GLOBAL_VAR;
        return list(CLET, list(list(global_var, global)), listS(CHECK_TYPE, global_var, $list212), listS(CLET, list(list($xref_global_scope$, global_var)), append(body, NIL)));
    }

    public static final SubLObject xref_global_scope_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return $xref_global_scope$.getDynamicValue(thread);
        }
    }

    public static SubLObject xref_global_scope() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return $xref_global_scope$.getDynamicValue(thread);
    }

    public static final SubLObject xref_reference_scope_alt() {
        {
            SubLObject file_position_scope = xref_file_position_scope();
            if (NIL != xref_method_scope()) {
                return values($METHOD, xref_method_scope(), file_position_scope);
            } else {
                if (NIL != xref_global_scope()) {
                    return values($GLOBAL, xref_global_scope(), file_position_scope);
                } else {
                    if (NIL != xref_module_scope()) {
                        return values($FILE, xref_module_scope(), file_position_scope);
                    } else {
                        return values(NIL, NIL, NIL);
                    }
                }
            }
        }
    }

    public static SubLObject xref_reference_scope() {
        final SubLObject file_position_scope = xref_file_position_scope();
        if (NIL != xref_method_scope()) {
            return values($METHOD, xref_method_scope(), file_position_scope);
        }
        if (NIL != xref_global_scope()) {
            return values($GLOBAL, xref_global_scope(), file_position_scope);
        }
        if (NIL != xref_module_scope()) {
            return values($FILE, xref_module_scope(), file_position_scope);
        }
        return values(NIL, NIL, NIL);
    }

    public static final SubLObject xref_note_global_definition_alt(SubLObject global) {
        xref_trace($str_alt215$___def_glob____S, global, UNPROVIDED);
        {
            SubLObject xrm = current_xref_module();
            if (NIL != xrm) {
                {
                    SubLObject position = xref_file_position_scope();
                    xref_possibly_record_global_undefinition(global, xrm);
                    xrm_record_global_definition(xrm, global, position);
                }
            }
        }
        return global;
    }

    public static SubLObject xref_note_global_definition(final SubLObject global) {
        xref_trace($str220$___def_glob____S, global, UNPROVIDED);
        final SubLObject xrm = current_xref_module();
        if (NIL != xrm) {
            final SubLObject position = xref_file_position_scope();
            xref_possibly_record_global_undefinition(global, xrm);
            xrm_record_global_definition(xrm, global, position);
        }
        return global;
    }

    public static final SubLObject xref_note_macro_definition_alt(SubLObject macro) {
        xref_trace($str_alt216$___defmacro____S, macro, UNPROVIDED);
        {
            SubLObject xrm = current_xref_module();
            if (NIL != xrm) {
                {
                    SubLObject position = xref_file_position_scope();
                    xref_possibly_record_method_undefinition(macro, xrm);
                    xrm_record_method_definition(xrm, macro, position);
                }
            }
        }
        return macro;
    }

    public static SubLObject xref_note_macro_definition(final SubLObject macro) {
        xref_trace($str221$___defmacro____S, macro, UNPROVIDED);
        final SubLObject xrm = current_xref_module();
        if (NIL != xrm) {
            final SubLObject position = xref_file_position_scope();
            xref_possibly_record_method_undefinition(macro, xrm);
            xrm_record_method_definition(xrm, macro, position);
        }
        return macro;
    }

    public static final SubLObject xref_note_function_definition_alt(SubLObject function) {
        xref_trace($str_alt217$___define______S, function, UNPROVIDED);
        {
            SubLObject xrm = current_xref_module();
            if (NIL != xrm) {
                {
                    SubLObject position = xref_file_position_scope();
                    xref_possibly_record_method_undefinition(function, xrm);
                    xrm_record_method_definition(xrm, function, position);
                }
            }
        }
        return function;
    }

    public static SubLObject xref_note_function_definition(final SubLObject function) {
        xref_trace($str222$___define______S, function, UNPROVIDED);
        final SubLObject xrm = current_xref_module();
        if (NIL != xrm) {
            final SubLObject position = xref_file_position_scope();
            xref_possibly_record_method_undefinition(function, xrm);
            xrm_record_method_definition(xrm, function, position);
        }
        return function;
    }

    public static final SubLObject xref_note_method_formal_arglist_alt(SubLObject method, SubLObject arglist) {
        xref_trace($str_alt218$____arglist____S, arglist, UNPROVIDED);
        {
            SubLObject xrm = current_xref_module();
            if (NIL != xrm) {
                xrm_record_method_formal_arglist(xrm, method, arglist);
            }
        }
        return method;
    }

    public static SubLObject xref_note_method_formal_arglist(final SubLObject method, final SubLObject arglist) {
        xref_trace($str223$____arglist____S, arglist, UNPROVIDED);
        final SubLObject xrm = current_xref_module();
        if (NIL != xrm) {
            xrm_record_method_formal_arglist(xrm, method, arglist);
        }
        return method;
    }

    public static final SubLObject xref_note_global_binding_type_alt(SubLObject global, SubLObject binding_type) {
        xref_trace($str_alt219$____binding_type____S, binding_type, UNPROVIDED);
        {
            SubLObject xrm = current_xref_module();
            if (NIL != xrm) {
                xrm_record_global_binding_type(xrm, global, binding_type);
            }
        }
        return global;
    }

    public static SubLObject xref_note_global_binding_type(final SubLObject global, final SubLObject binding_type) {
        xref_trace($str224$____binding_type____S, binding_type, UNPROVIDED);
        final SubLObject xrm = current_xref_module();
        if (NIL != xrm) {
            xrm_record_global_binding_type(xrm, global, binding_type);
        }
        return global;
    }

    public static final SubLObject xref_note_global_reference_alt(SubLObject global) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            xref_trace($str_alt220$____ref_glob_____S, global, UNPROVIDED);
            {
                SubLObject xrm = current_xref_module();
                if (NIL != xrm) {
                    thread.resetMultipleValues();
                    {
                        SubLObject definition_type = xref_reference_scope();
                        SubLObject definer = thread.secondMultipleValue();
                        SubLObject file_position = thread.thirdMultipleValue();
                        thread.resetMultipleValues();
                        {
                            SubLObject pcase_var = definition_type;
                            if (pcase_var.eql($METHOD)) {
                                xrm_record_method_references_global(xrm, definer, global);
                            } else {
                                if (pcase_var.eql($GLOBAL)) {
                                    xrm_record_global_references_global(xrm, definer, global);
                                } else {
                                    if (pcase_var.eql($FILE)) {
                                        xrm_record_top_references_global(xrm, global, file_position);
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return global;
        }
    }

    public static SubLObject xref_note_global_reference(final SubLObject global) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        xref_trace($str225$____ref_glob_____S, global, UNPROVIDED);
        final SubLObject xrm = current_xref_module();
        if (NIL != xrm) {
            thread.resetMultipleValues();
            final SubLObject definition_type = xref_reference_scope();
            final SubLObject definer = thread.secondMultipleValue();
            final SubLObject file_position = thread.thirdMultipleValue();
            thread.resetMultipleValues();
            final SubLObject pcase_var = definition_type;
            if (pcase_var.eql($METHOD)) {
                xrm_record_method_references_global(xrm, definer, global);
            } else
                if (pcase_var.eql($GLOBAL)) {
                    xrm_record_global_references_global(xrm, definer, global);
                } else
                    if (pcase_var.eql($FILE)) {
                        xrm_record_top_references_global(xrm, global, file_position);
                    }


        }
        return global;
    }

    public static final SubLObject xref_note_global_modification_alt(SubLObject global) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            xref_trace($str_alt221$____mod_glob_____S, global, UNPROVIDED);
            {
                SubLObject xrm = current_xref_module();
                if (NIL != xrm) {
                    thread.resetMultipleValues();
                    {
                        SubLObject definition_type = xref_reference_scope();
                        SubLObject definer = thread.secondMultipleValue();
                        SubLObject file_position = thread.thirdMultipleValue();
                        thread.resetMultipleValues();
                        {
                            SubLObject pcase_var = definition_type;
                            if (pcase_var.eql($METHOD)) {
                                xrm_record_method_modifies_global(xrm, definer, global);
                            } else {
                                if (pcase_var.eql($GLOBAL)) {
                                    Errors.error($str_alt222$Initializer_for__S_modifies__S, definer, global);
                                } else {
                                    if (pcase_var.eql($FILE)) {
                                        xrm_record_top_modifies_global(xrm, global, file_position);
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return global;
        }
    }

    public static SubLObject xref_note_global_modification(final SubLObject global) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        xref_trace($str226$____mod_glob_____S, global, UNPROVIDED);
        final SubLObject xrm = current_xref_module();
        if (NIL != xrm) {
            thread.resetMultipleValues();
            final SubLObject definition_type = xref_reference_scope();
            final SubLObject definer = thread.secondMultipleValue();
            final SubLObject file_position = thread.thirdMultipleValue();
            thread.resetMultipleValues();
            final SubLObject pcase_var = definition_type;
            if (pcase_var.eql($METHOD)) {
                xrm_record_method_modifies_global(xrm, definer, global);
            } else
                if (pcase_var.eql($GLOBAL)) {
                    Errors.error($str227$Initializer_for__S_modifies__S, definer, global);
                } else
                    if (pcase_var.eql($FILE)) {
                        xrm_record_top_modifies_global(xrm, global, file_position);
                    }


        }
        return global;
    }

    public static final SubLObject xref_note_global_binding_alt(SubLObject global) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            xref_trace($str_alt223$____bind_glob_____S, global, UNPROVIDED);
            {
                SubLObject xrm = current_xref_module();
                if (NIL != xrm) {
                    thread.resetMultipleValues();
                    {
                        SubLObject definition_type = xref_reference_scope();
                        SubLObject definer = thread.secondMultipleValue();
                        SubLObject file_position = thread.thirdMultipleValue();
                        thread.resetMultipleValues();
                        {
                            SubLObject pcase_var = definition_type;
                            if (pcase_var.eql($METHOD)) {
                                xrm_record_method_rebinds_global(xrm, definer, global);
                            } else {
                                if (pcase_var.eql($GLOBAL)) {
                                    Errors.error($str_alt224$Initializer_for__S_rebinds__S, definer, global);
                                } else {
                                    if (pcase_var.eql($FILE)) {
                                        xrm_record_top_rebinds_global(xrm, global, file_position);
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return global;
        }
    }

    public static SubLObject xref_note_global_binding(final SubLObject global) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        xref_trace($str228$____bind_glob_____S, global, UNPROVIDED);
        final SubLObject xrm = current_xref_module();
        if (NIL != xrm) {
            thread.resetMultipleValues();
            final SubLObject definition_type = xref_reference_scope();
            final SubLObject definer = thread.secondMultipleValue();
            final SubLObject file_position = thread.thirdMultipleValue();
            thread.resetMultipleValues();
            final SubLObject pcase_var = definition_type;
            if (pcase_var.eql($METHOD)) {
                xrm_record_method_rebinds_global(xrm, definer, global);
            } else
                if (pcase_var.eql($GLOBAL)) {
                    Errors.error($str229$Initializer_for__S_rebinds__S, definer, global);
                } else
                    if (pcase_var.eql($FILE)) {
                        xrm_record_top_rebinds_global(xrm, global, file_position);
                    }


        }
        return global;
    }

    public static final SubLObject xref_note_macro_use_alt(SubLObject macro) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            xref_trace($str_alt225$____macro_use____S, macro, UNPROVIDED);
            {
                SubLObject xrm = current_xref_module();
                if (NIL != xrm) {
                    thread.resetMultipleValues();
                    {
                        SubLObject definition_type = xref_reference_scope();
                        SubLObject definer = thread.secondMultipleValue();
                        SubLObject file_position = thread.thirdMultipleValue();
                        thread.resetMultipleValues();
                        {
                            SubLObject pcase_var = definition_type;
                            if (pcase_var.eql($METHOD)) {
                                xrm_record_method_calls_method(xrm, definer, macro);
                            } else {
                                if (pcase_var.eql($GLOBAL)) {
                                    xrm_record_global_calls_method(xrm, definer, macro);
                                } else {
                                    if (pcase_var.eql($FILE)) {
                                        xrm_record_top_calls_method(xrm, macro, file_position);
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return macro;
        }
    }

    public static SubLObject xref_note_macro_use(final SubLObject macro) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        xref_trace($str230$____macro_use____S, macro, UNPROVIDED);
        final SubLObject xrm = current_xref_module();
        if (NIL != xrm) {
            thread.resetMultipleValues();
            final SubLObject definition_type = xref_reference_scope();
            final SubLObject definer = thread.secondMultipleValue();
            final SubLObject file_position = thread.thirdMultipleValue();
            thread.resetMultipleValues();
            final SubLObject pcase_var = definition_type;
            if (pcase_var.eql($METHOD)) {
                xrm_record_method_calls_method(xrm, definer, macro);
            } else
                if (pcase_var.eql($GLOBAL)) {
                    xrm_record_global_calls_method(xrm, definer, macro);
                } else
                    if (pcase_var.eql($FILE)) {
                        xrm_record_top_calls_method(xrm, macro, file_position);
                    }


        }
        return macro;
    }

    public static final SubLObject xref_note_function_call_alt(SubLObject function) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            xref_trace($str_alt226$____fun_call_____S, function, UNPROVIDED);
            {
                SubLObject xrm = current_xref_module();
                if (NIL != xrm) {
                    thread.resetMultipleValues();
                    {
                        SubLObject definition_type = xref_reference_scope();
                        SubLObject definer = thread.secondMultipleValue();
                        SubLObject file_position = thread.thirdMultipleValue();
                        thread.resetMultipleValues();
                        {
                            SubLObject pcase_var = definition_type;
                            if (pcase_var.eql($METHOD)) {
                                xrm_record_method_calls_method(xrm, definer, function);
                            } else {
                                if (pcase_var.eql($GLOBAL)) {
                                    xrm_record_global_calls_method(xrm, definer, function);
                                } else {
                                    if (pcase_var.eql($FILE)) {
                                        xrm_record_top_calls_method(xrm, function, file_position);
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return function;
        }
    }

    public static SubLObject xref_note_function_call(final SubLObject function) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        xref_trace($str231$____fun_call_____S, function, UNPROVIDED);
        final SubLObject xrm = current_xref_module();
        if (NIL != xrm) {
            thread.resetMultipleValues();
            final SubLObject definition_type = xref_reference_scope();
            final SubLObject definer = thread.secondMultipleValue();
            final SubLObject file_position = thread.thirdMultipleValue();
            thread.resetMultipleValues();
            final SubLObject pcase_var = definition_type;
            if (pcase_var.eql($METHOD)) {
                xrm_record_method_calls_method(xrm, definer, function);
            } else
                if (pcase_var.eql($GLOBAL)) {
                    xrm_record_global_calls_method(xrm, definer, function);
                } else
                    if (pcase_var.eql($FILE)) {
                        xrm_record_top_calls_method(xrm, function, file_position);
                    }


        }
        return function;
    }

    public static final SubLObject xref_note_module_removal_alt(SubLObject module_name) {
        xref_trace($str_alt227$__module_removed_____A, module_name, UNPROVIDED);
        {
            SubLObject xrs = current_xref_system();
            if (NIL != xrs) {
                {
                    SubLObject old_xrm = xrs_lookup_module(xrs, module_name);
                    if (NIL != old_xrm) {
                        xrs_remove_old_xrm(xrs, old_xrm);
                    }
                }
            }
        }
        return module_name;
    }

    public static SubLObject xref_note_module_removal(final SubLObject module_name) {
        xref_trace($str232$__module_removed_____A, module_name, UNPROVIDED);
        final SubLObject xrs = current_xref_system();
        if (NIL != xrs) {
            final SubLObject old_xrm = xrs_lookup_module(xrs, module_name);
            if (NIL != old_xrm) {
                xrs_remove_old_xrm(xrs, old_xrm);
            }
        }
        return module_name;
    }

    public static final SubLObject xref_trace_alt(SubLObject control_string, SubLObject arg1, SubLObject arg2) {
        if (arg1 == UNPROVIDED) {
            arg1 = NIL;
        }
        if (arg2 == UNPROVIDED) {
            arg2 = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != $xref_trace$.getDynamicValue(thread)) {
                format(StreamsLow.$standard_output$.getDynamicValue(thread), control_string, arg1, arg2);
                force_output(StreamsLow.$standard_output$.getDynamicValue(thread));
                return T;
            }
            return NIL;
        }
    }

    public static SubLObject xref_trace(final SubLObject control_string, SubLObject arg1, SubLObject arg2) {
        if (arg1 == UNPROVIDED) {
            arg1 = NIL;
        }
        if (arg2 == UNPROVIDED) {
            arg2 = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != $xref_trace$.getDynamicValue(thread)) {
            format(StreamsLow.$standard_output$.getDynamicValue(thread), control_string, arg1, arg2);
            force_output(StreamsLow.$standard_output$.getDynamicValue(thread));
            return T;
        }
        return NIL;
    }

    public static final SubLObject xref_sort_called_globals_alt(SubLObject globals) {
        globals = Sort.sort(globals, symbol_function(STRING_LESSP), symbol_function(SYMBOL_NAME));
        if (NIL != current_xref_system()) {
            globals = Sort.stable_sort(globals, symbol_function($sym230$_), symbol_function(XREF_GLOBAL_ACCESS_COUNT));
        }
        return globals;
    }

    public static SubLObject xref_sort_called_globals(SubLObject globals) {
        globals = Sort.sort(globals, symbol_function(STRING_LESSP), symbol_function(SYMBOL_NAME));
        if (NIL != current_xref_system()) {
            globals = Sort.stable_sort(globals, symbol_function($sym235$_), symbol_function(XREF_GLOBAL_ACCESS_COUNT));
        }
        return globals;
    }

    public static final SubLObject xref_sort_called_methods_alt(SubLObject v_methods) {
        v_methods = Sort.sort(v_methods, symbol_function(STRING_LESSP), symbol_function(SYMBOL_NAME));
        if (NIL != current_xref_system()) {
            v_methods = Sort.stable_sort(v_methods, symbol_function($sym230$_), symbol_function(XREF_METHOD_CALL_COUNT));
        }
        return v_methods;
    }

    public static SubLObject xref_sort_called_methods(SubLObject v_methods) {
        v_methods = Sort.sort(v_methods, symbol_function(STRING_LESSP), symbol_function(SYMBOL_NAME));
        if (NIL != current_xref_system()) {
            v_methods = Sort.stable_sort(v_methods, symbol_function($sym235$_), symbol_function(XREF_METHOD_CALL_COUNT));
        }
        return v_methods;
    }

    public static final SubLObject xref_sort_referenced_xrms_alt(SubLObject xrms) {
        return Sort.sort(xrms, symbol_function(STRING_LESSP), symbol_function(XRM_NAME));
    }

    public static SubLObject xref_sort_referenced_xrms(final SubLObject xrms) {
        return Sort.sort(xrms, symbol_function(STRING_LESSP), symbol_function(XRM_NAME));
    }

    public static final SubLObject xref_sort_referenced_modules_alt(SubLObject v_modules) {
        return Sort.sort(v_modules, symbol_function(STRING_LESSP), UNPROVIDED);
    }

    public static SubLObject xref_sort_referenced_modules(final SubLObject v_modules) {
        return Sort.sort(v_modules, symbol_function(STRING_LESSP), UNPROVIDED);
    }

    public static final SubLObject xref_sort_calling_globals_alt(SubLObject globals) {
        return Sort.sort(globals, symbol_function(STRING_LESSP), symbol_function(SYMBOL_NAME));
    }

    public static SubLObject xref_sort_calling_globals(final SubLObject globals) {
        return Sort.sort(globals, symbol_function(STRING_LESSP), symbol_function(SYMBOL_NAME));
    }

    public static final SubLObject xref_sort_calling_methods_alt(SubLObject v_methods) {
        return Sort.sort(v_methods, symbol_function(STRING_LESSP), symbol_function(SYMBOL_NAME));
    }

    public static SubLObject xref_sort_calling_methods(final SubLObject v_methods) {
        return Sort.sort(v_methods, symbol_function(STRING_LESSP), symbol_function(SYMBOL_NAME));
    }

    public static final SubLObject xref_sort_calling_xrms_alt(SubLObject xrms) {
        return xref_sort_referenced_xrms(xrms);
    }

    public static SubLObject xref_sort_calling_xrms(final SubLObject xrms) {
        return xref_sort_referenced_xrms(xrms);
    }

    public static final SubLObject xref_sort_calling_modules_alt(SubLObject v_modules) {
        return xref_sort_referenced_modules(v_modules);
    }

    public static SubLObject xref_sort_calling_modules(final SubLObject v_modules) {
        return xref_sort_referenced_modules(v_modules);
    }

    public static SubLObject declare_xref_database_file() {
        declareFunction("xref_module_print_function_trampoline", "XREF-MODULE-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction("xref_module_p", "XREF-MODULE-P", 1, 0, false);
        new xref_database.$xref_module_p$UnaryFunction();
        declareFunction("xref_m_name", "XREF-M-NAME", 1, 0, false);
        declareFunction("xref_m_xref_system", "XREF-M-XREF-SYSTEM", 1, 0, false);
        declareFunction("xref_m_features", "XREF-M-FEATURES", 1, 0, false);
        declareFunction("xref_m_method_definitions", "XREF-M-METHOD-DEFINITIONS", 1, 0, false);
        declareFunction("xref_m_method_position_table", "XREF-M-METHOD-POSITION-TABLE", 1, 0, false);
        declareFunction("xref_m_method_method_table", "XREF-M-METHOD-METHOD-TABLE", 1, 0, false);
        declareFunction("xref_m_method_global_reference_table", "XREF-M-METHOD-GLOBAL-REFERENCE-TABLE", 1, 0, false);
        declareFunction("xref_m_method_global_modification_table", "XREF-M-METHOD-GLOBAL-MODIFICATION-TABLE", 1, 0, false);
        declareFunction("xref_m_method_global_binding_table", "XREF-M-METHOD-GLOBAL-BINDING-TABLE", 1, 0, false);
        declareFunction("xref_m_global_definitions", "XREF-M-GLOBAL-DEFINITIONS", 1, 0, false);
        declareFunction("xref_m_global_position_table", "XREF-M-GLOBAL-POSITION-TABLE", 1, 0, false);
        declareFunction("xref_m_global_method_table", "XREF-M-GLOBAL-METHOD-TABLE", 1, 0, false);
        declareFunction("xref_m_global_global_reference_table", "XREF-M-GLOBAL-GLOBAL-REFERENCE-TABLE", 1, 0, false);
        declareFunction("xref_m_top_method_table", "XREF-M-TOP-METHOD-TABLE", 1, 0, false);
        declareFunction("xref_m_top_global_reference_table", "XREF-M-TOP-GLOBAL-REFERENCE-TABLE", 1, 0, false);
        declareFunction("xref_m_top_global_modification_table", "XREF-M-TOP-GLOBAL-MODIFICATION-TABLE", 1, 0, false);
        declareFunction("xref_m_top_global_binding_table", "XREF-M-TOP-GLOBAL-BINDING-TABLE", 1, 0, false);
        declareFunction("xref_m_method_formal_arglist_table", "XREF-M-METHOD-FORMAL-ARGLIST-TABLE", 1, 0, false);
        declareFunction("xref_m_global_binding_type_table", "XREF-M-GLOBAL-BINDING-TYPE-TABLE", 1, 0, false);
        declareFunction("_csetf_xref_m_name", "_CSETF-XREF-M-NAME", 2, 0, false);
        declareFunction("_csetf_xref_m_xref_system", "_CSETF-XREF-M-XREF-SYSTEM", 2, 0, false);
        declareFunction("_csetf_xref_m_features", "_CSETF-XREF-M-FEATURES", 2, 0, false);
        declareFunction("_csetf_xref_m_method_definitions", "_CSETF-XREF-M-METHOD-DEFINITIONS", 2, 0, false);
        declareFunction("_csetf_xref_m_method_position_table", "_CSETF-XREF-M-METHOD-POSITION-TABLE", 2, 0, false);
        declareFunction("_csetf_xref_m_method_method_table", "_CSETF-XREF-M-METHOD-METHOD-TABLE", 2, 0, false);
        declareFunction("_csetf_xref_m_method_global_reference_table", "_CSETF-XREF-M-METHOD-GLOBAL-REFERENCE-TABLE", 2, 0, false);
        declareFunction("_csetf_xref_m_method_global_modification_table", "_CSETF-XREF-M-METHOD-GLOBAL-MODIFICATION-TABLE", 2, 0, false);
        declareFunction("_csetf_xref_m_method_global_binding_table", "_CSETF-XREF-M-METHOD-GLOBAL-BINDING-TABLE", 2, 0, false);
        declareFunction("_csetf_xref_m_global_definitions", "_CSETF-XREF-M-GLOBAL-DEFINITIONS", 2, 0, false);
        declareFunction("_csetf_xref_m_global_position_table", "_CSETF-XREF-M-GLOBAL-POSITION-TABLE", 2, 0, false);
        declareFunction("_csetf_xref_m_global_method_table", "_CSETF-XREF-M-GLOBAL-METHOD-TABLE", 2, 0, false);
        declareFunction("_csetf_xref_m_global_global_reference_table", "_CSETF-XREF-M-GLOBAL-GLOBAL-REFERENCE-TABLE", 2, 0, false);
        declareFunction("_csetf_xref_m_top_method_table", "_CSETF-XREF-M-TOP-METHOD-TABLE", 2, 0, false);
        declareFunction("_csetf_xref_m_top_global_reference_table", "_CSETF-XREF-M-TOP-GLOBAL-REFERENCE-TABLE", 2, 0, false);
        declareFunction("_csetf_xref_m_top_global_modification_table", "_CSETF-XREF-M-TOP-GLOBAL-MODIFICATION-TABLE", 2, 0, false);
        declareFunction("_csetf_xref_m_top_global_binding_table", "_CSETF-XREF-M-TOP-GLOBAL-BINDING-TABLE", 2, 0, false);
        declareFunction("_csetf_xref_m_method_formal_arglist_table", "_CSETF-XREF-M-METHOD-FORMAL-ARGLIST-TABLE", 2, 0, false);
        declareFunction("_csetf_xref_m_global_binding_type_table", "_CSETF-XREF-M-GLOBAL-BINDING-TYPE-TABLE", 2, 0, false);
        declareFunction("make_xref_module", "MAKE-XREF-MODULE", 0, 1, false);
        declareFunction("visit_defstruct_xref_module", "VISIT-DEFSTRUCT-XREF-MODULE", 2, 0, false);
        declareFunction("visit_defstruct_object_xref_module_method", "VISIT-DEFSTRUCT-OBJECT-XREF-MODULE-METHOD", 2, 0, false);
        declareFunction("print_xref_module", "PRINT-XREF-MODULE", 3, 0, false);
        declareFunction("sxhash_xref_module_method", "SXHASH-XREF-MODULE-METHOD", 1, 0, false);
        declareFunction("new_xref_module", "NEW-XREF-MODULE", 3, 0, false);
        declareMacro("do_xrm_method_definitions", "DO-XRM-METHOD-DEFINITIONS");
        declareFunction("xrm_method_definitions", "XRM-METHOD-DEFINITIONS", 1, 0, false);
        declareMacro("do_xrm_methods", "DO-XRM-METHODS");
        declareFunction("xrm_method_position_table", "XRM-METHOD-POSITION-TABLE", 1, 0, false);
        declareMacro("do_xrm_global_definitions", "DO-XRM-GLOBAL-DEFINITIONS");
        declareFunction("xrm_global_definitions", "XRM-GLOBAL-DEFINITIONS", 1, 0, false);
        declareMacro("do_xrm_globals", "DO-XRM-GLOBALS");
        declareFunction("xrm_global_position_table", "XRM-GLOBAL-POSITION-TABLE", 1, 0, false);
        declareFunction("xrm_name", "XRM-NAME", 1, 0, false);
        declareFunction("xrm_xref_system", "XRM-XREF-SYSTEM", 1, 0, false);
        declareFunction("xrm_module_features", "XRM-MODULE-FEATURES", 1, 0, false);
        declareFunction("xrm_method_definition_count", "XRM-METHOD-DEFINITION-COUNT", 2, 0, false);
        declareFunction("xrm_total_method_definition_count", "XRM-TOTAL-METHOD-DEFINITION-COUNT", 1, 0, false);
        declareFunction("xrm_total_method_count", "XRM-TOTAL-METHOD-COUNT", 1, 0, false);
        declareFunction("xrm_has_multiple_method_definitionsP", "XRM-HAS-MULTIPLE-METHOD-DEFINITIONS?", 1, 0, false);
        declareFunction("xrm_global_definition_count", "XRM-GLOBAL-DEFINITION-COUNT", 2, 0, false);
        declareFunction("xrm_total_global_definition_count", "XRM-TOTAL-GLOBAL-DEFINITION-COUNT", 1, 0, false);
        declareFunction("xrm_total_global_count", "XRM-TOTAL-GLOBAL-COUNT", 1, 0, false);
        declareFunction("xrm_has_multiple_global_definitionsP", "XRM-HAS-MULTIPLE-GLOBAL-DEFINITIONS?", 1, 0, false);
        declareFunction("xrm_method_definition_postion", "XRM-METHOD-DEFINITION-POSTION", 2, 0, false);
        declareFunction("xrm_method_definition_positions", "XRM-METHOD-DEFINITION-POSITIONS", 2, 0, false);
        declareFunction("xrm_global_definition_postion", "XRM-GLOBAL-DEFINITION-POSTION", 2, 0, false);
        declareFunction("xrm_global_definition_positions", "XRM-GLOBAL-DEFINITION-POSITIONS", 2, 0, false);
        declareFunction("xrm_method_formal_arglist", "XRM-METHOD-FORMAL-ARGLIST", 2, 0, false);
        declareFunction("xrm_global_binding_type", "XRM-GLOBAL-BINDING-TYPE", 2, 0, false);
        declareFunction("xrm_record_method_definition", "XRM-RECORD-METHOD-DEFINITION", 3, 0, false);
        declareFunction("xrm_unrecord_method_definition", "XRM-UNRECORD-METHOD-DEFINITION", 2, 0, false);
        declareFunction("xrm_record_method_formal_arglist", "XRM-RECORD-METHOD-FORMAL-ARGLIST", 3, 0, false);
        declareFunction("xrm_record_global_binding_type", "XRM-RECORD-GLOBAL-BINDING-TYPE", 3, 0, false);
        declareFunction("xrm_record_global_definition", "XRM-RECORD-GLOBAL-DEFINITION", 3, 0, false);
        declareFunction("xrm_unrecord_global_definition", "XRM-UNRECORD-GLOBAL-DEFINITION", 2, 0, false);
        declareFunction("xrm_record_method_calls_method", "XRM-RECORD-METHOD-CALLS-METHOD", 3, 0, false);
        declareFunction("xrm_record_method_references_global", "XRM-RECORD-METHOD-REFERENCES-GLOBAL", 3, 0, false);
        declareFunction("xrm_record_method_modifies_global", "XRM-RECORD-METHOD-MODIFIES-GLOBAL", 3, 0, false);
        declareFunction("xrm_record_method_rebinds_global", "XRM-RECORD-METHOD-REBINDS-GLOBAL", 3, 0, false);
        declareFunction("xrm_record_global_calls_method", "XRM-RECORD-GLOBAL-CALLS-METHOD", 3, 0, false);
        declareFunction("xrm_record_global_references_global", "XRM-RECORD-GLOBAL-REFERENCES-GLOBAL", 3, 0, false);
        declareFunction("xrm_record_top_calls_method", "XRM-RECORD-TOP-CALLS-METHOD", 3, 0, false);
        declareFunction("xrm_record_top_references_global", "XRM-RECORD-TOP-REFERENCES-GLOBAL", 3, 0, false);
        declareFunction("xrm_record_top_modifies_global", "XRM-RECORD-TOP-MODIFIES-GLOBAL", 3, 0, false);
        declareFunction("xrm_record_top_rebinds_global", "XRM-RECORD-TOP-REBINDS-GLOBAL", 3, 0, false);
        declareFunction("xref_system_print_function_trampoline", "XREF-SYSTEM-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction("xref_system_p", "XREF-SYSTEM-P", 1, 0, false);
        new xref_database.$xref_system_p$UnaryFunction();
        declareFunction("xref_s_name", "XREF-S-NAME", 1, 0, false);
        declareFunction("xref_s_features", "XREF-S-FEATURES", 1, 0, false);
        declareFunction("xref_s_xref_module_table", "XREF-S-XREF-MODULE-TABLE", 1, 0, false);
        declareFunction("xref_s_method_definition_table", "XREF-S-METHOD-DEFINITION-TABLE", 1, 0, false);
        declareFunction("xref_s_global_definition_table", "XREF-S-GLOBAL-DEFINITION-TABLE", 1, 0, false);
        declareFunction("xref_s_method_called_by_method_table", "XREF-S-METHOD-CALLED-BY-METHOD-TABLE", 1, 0, false);
        declareFunction("xref_s_method_called_by_global_table", "XREF-S-METHOD-CALLED-BY-GLOBAL-TABLE", 1, 0, false);
        declareFunction("xref_s_method_called_at_top_level_table", "XREF-S-METHOD-CALLED-AT-TOP-LEVEL-TABLE", 1, 0, false);
        declareFunction("xref_s_global_referenced_by_method_table", "XREF-S-GLOBAL-REFERENCED-BY-METHOD-TABLE", 1, 0, false);
        declareFunction("xref_s_global_modified_by_method_table", "XREF-S-GLOBAL-MODIFIED-BY-METHOD-TABLE", 1, 0, false);
        declareFunction("xref_s_global_rebound_by_method_table", "XREF-S-GLOBAL-REBOUND-BY-METHOD-TABLE", 1, 0, false);
        declareFunction("xref_s_global_referenced_by_global_table", "XREF-S-GLOBAL-REFERENCED-BY-GLOBAL-TABLE", 1, 0, false);
        declareFunction("xref_s_global_referenced_at_top_level_table", "XREF-S-GLOBAL-REFERENCED-AT-TOP-LEVEL-TABLE", 1, 0, false);
        declareFunction("xref_s_global_modified_at_top_level_table", "XREF-S-GLOBAL-MODIFIED-AT-TOP-LEVEL-TABLE", 1, 0, false);
        declareFunction("xref_s_global_rebound_at_top_level_table", "XREF-S-GLOBAL-REBOUND-AT-TOP-LEVEL-TABLE", 1, 0, false);
        declareFunction("_csetf_xref_s_name", "_CSETF-XREF-S-NAME", 2, 0, false);
        declareFunction("_csetf_xref_s_features", "_CSETF-XREF-S-FEATURES", 2, 0, false);
        declareFunction("_csetf_xref_s_xref_module_table", "_CSETF-XREF-S-XREF-MODULE-TABLE", 2, 0, false);
        declareFunction("_csetf_xref_s_method_definition_table", "_CSETF-XREF-S-METHOD-DEFINITION-TABLE", 2, 0, false);
        declareFunction("_csetf_xref_s_global_definition_table", "_CSETF-XREF-S-GLOBAL-DEFINITION-TABLE", 2, 0, false);
        declareFunction("_csetf_xref_s_method_called_by_method_table", "_CSETF-XREF-S-METHOD-CALLED-BY-METHOD-TABLE", 2, 0, false);
        declareFunction("_csetf_xref_s_method_called_by_global_table", "_CSETF-XREF-S-METHOD-CALLED-BY-GLOBAL-TABLE", 2, 0, false);
        declareFunction("_csetf_xref_s_method_called_at_top_level_table", "_CSETF-XREF-S-METHOD-CALLED-AT-TOP-LEVEL-TABLE", 2, 0, false);
        declareFunction("_csetf_xref_s_global_referenced_by_method_table", "_CSETF-XREF-S-GLOBAL-REFERENCED-BY-METHOD-TABLE", 2, 0, false);
        declareFunction("_csetf_xref_s_global_modified_by_method_table", "_CSETF-XREF-S-GLOBAL-MODIFIED-BY-METHOD-TABLE", 2, 0, false);
        declareFunction("_csetf_xref_s_global_rebound_by_method_table", "_CSETF-XREF-S-GLOBAL-REBOUND-BY-METHOD-TABLE", 2, 0, false);
        declareFunction("_csetf_xref_s_global_referenced_by_global_table", "_CSETF-XREF-S-GLOBAL-REFERENCED-BY-GLOBAL-TABLE", 2, 0, false);
        declareFunction("_csetf_xref_s_global_referenced_at_top_level_table", "_CSETF-XREF-S-GLOBAL-REFERENCED-AT-TOP-LEVEL-TABLE", 2, 0, false);
        declareFunction("_csetf_xref_s_global_modified_at_top_level_table", "_CSETF-XREF-S-GLOBAL-MODIFIED-AT-TOP-LEVEL-TABLE", 2, 0, false);
        declareFunction("_csetf_xref_s_global_rebound_at_top_level_table", "_CSETF-XREF-S-GLOBAL-REBOUND-AT-TOP-LEVEL-TABLE", 2, 0, false);
        declareFunction("make_xref_system", "MAKE-XREF-SYSTEM", 0, 1, false);
        declareFunction("visit_defstruct_xref_system", "VISIT-DEFSTRUCT-XREF-SYSTEM", 2, 0, false);
        declareFunction("visit_defstruct_object_xref_system_method", "VISIT-DEFSTRUCT-OBJECT-XREF-SYSTEM-METHOD", 2, 0, false);
        declareFunction("print_xref_system", "PRINT-XREF-SYSTEM", 3, 0, false);
        declareFunction("new_xref_system", "NEW-XREF-SYSTEM", 2, 0, false);
        declareFunction("xrs_name", "XRS-NAME", 1, 0, false);
        declareFunction("xrs_features", "XRS-FEATURES", 1, 0, false);
        declareFunction("xrs_module_count", "XRS-MODULE-COUNT", 1, 0, false);
        declareFunction("xrs_lookup_module", "XRS-LOOKUP-MODULE", 2, 0, false);
        declareFunction("xrs_method_defining_xrm", "XRS-METHOD-DEFINING-XRM", 2, 0, false);
        declareFunction("xrs_method_defining_xrms", "XRS-METHOD-DEFINING-XRMS", 2, 0, false);
        declareFunction("xrs_method_definition_count", "XRS-METHOD-DEFINITION-COUNT", 2, 0, false);
        declareFunction("xrs_global_defining_xrm", "XRS-GLOBAL-DEFINING-XRM", 2, 0, false);
        declareFunction("xrs_global_defining_xrms", "XRS-GLOBAL-DEFINING-XRMS", 2, 0, false);
        declareFunction("xrs_global_definition_count", "XRS-GLOBAL-DEFINITION-COUNT", 2, 0, false);
        declareFunction("xrs_possibly_note_module_features", "XRS-POSSIBLY-NOTE-MODULE-FEATURES", 3, 0, false);
        declareFunction("current_xref_system", "CURRENT-XREF-SYSTEM", 0, 0, false);
        declareFunction("current_xref_system_modules", "CURRENT-XREF-SYSTEM-MODULES", 0, 0, false);
        declareFunction("current_xref_system_features", "CURRENT-XREF-SYSTEM-FEATURES", 0, 0, false);
        declareFunction("current_xref_system_relevant_modules", "CURRENT-XREF-SYSTEM-RELEVANT-MODULES", 1, 0, false);
        declareFunction("current_xref_module_p", "CURRENT-XREF-MODULE-P", 1, 0, false);
        declareFunction("xref_find_xrm_by_module", "XREF-FIND-XRM-BY-MODULE", 1, 0, false);
        declareFunction("xref_module_features", "XREF-MODULE-FEATURES", 1, 0, false);
        declareFunction("xref_module_input_filename", "XREF-MODULE-INPUT-FILENAME", 1, 0, false);
        declareFunction("xref_predefined_method_p", "XREF-PREDEFINED-METHOD-P", 1, 0, false);
        declareFunction("xref_predefined_global_p", "XREF-PREDEFINED-GLOBAL-P", 1, 0, false);
        declareFunction("xref_method_formal_arglist", "XREF-METHOD-FORMAL-ARGLIST", 1, 0, false);
        declareFunction("method_formal_arglist", "METHOD-FORMAL-ARGLIST", 1, 0, false);
        declareFunction("xref_global_binding_type", "XREF-GLOBAL-BINDING-TYPE", 1, 0, false);
        declareFunction("xref_method_definition_count", "XREF-METHOD-DEFINITION-COUNT", 1, 0, false);
        declareFunction("xref_method_undefinedP", "XREF-METHOD-UNDEFINED?", 1, 0, false);
        declareFunction("xref_method_defining_xrm", "XREF-METHOD-DEFINING-XRM", 1, 0, false);
        declareFunction("xref_method_defining_module", "XREF-METHOD-DEFINING-MODULE", 1, 0, false);
        declareFunction("xref_method_has_multiple_definitionsP", "XREF-METHOD-HAS-MULTIPLE-DEFINITIONS?", 1, 0, false);
        declareFunction("xref_method_defining_modules", "XREF-METHOD-DEFINING-MODULES", 1, 0, false);
        declareFunction("xref_global_definition_count", "XREF-GLOBAL-DEFINITION-COUNT", 1, 0, false);
        declareFunction("xref_global_undefinedP", "XREF-GLOBAL-UNDEFINED?", 1, 0, false);
        declareFunction("xref_global_defining_xrm", "XREF-GLOBAL-DEFINING-XRM", 1, 0, false);
        declareFunction("xref_global_defining_module", "XREF-GLOBAL-DEFINING-MODULE", 1, 0, false);
        declareFunction("xref_global_has_multiple_definitionsP", "XREF-GLOBAL-HAS-MULTIPLE-DEFINITIONS?", 1, 0, false);
        declareFunction("xref_global_defining_modules", "XREF-GLOBAL-DEFINING-MODULES", 1, 0, false);
        declareFunction("xref_method_definition_position", "XREF-METHOD-DEFINITION-POSITION", 1, 0, false);
        declareFunction("xref_method_definition_positions", "XREF-METHOD-DEFINITION-POSITIONS", 1, 0, false);
        declareFunction("xref_global_definition_position", "XREF-GLOBAL-DEFINITION-POSITION", 1, 0, false);
        declareFunction("xref_global_definition_positions", "XREF-GLOBAL-DEFINITION-POSITIONS", 1, 0, false);
        declareFunction("xref_methods_defined_by_module", "XREF-METHODS-DEFINED-BY-MODULE", 1, 0, false);
        declareFunction("xref_module_method_definition_count", "XREF-MODULE-METHOD-DEFINITION-COUNT", 2, 0, false);
        declareFunction("xref_module_method_definition_positions", "XREF-MODULE-METHOD-DEFINITION-POSITIONS", 2, 0, false);
        declareFunction("xref_globals_defined_by_module", "XREF-GLOBALS-DEFINED-BY-MODULE", 1, 0, false);
        declareFunction("xref_module_global_definition_count", "XREF-MODULE-GLOBAL-DEFINITION-COUNT", 2, 0, false);
        declareFunction("xref_module_global_definition_positions", "XREF-MODULE-GLOBAL-DEFINITION-POSITIONS", 2, 0, false);
        declareFunction("xref_method_called_by_methodP", "XREF-METHOD-CALLED-BY-METHOD?", 2, 0, false);
        declareFunction("xref_methods_called_by_method", "XREF-METHODS-CALLED-BY-METHOD", 1, 0, false);
        declareFunction("xref_globals_referenced_by_method", "XREF-GLOBALS-REFERENCED-BY-METHOD", 1, 0, false);
        declareFunction("xref_globals_modified_by_method", "XREF-GLOBALS-MODIFIED-BY-METHOD", 1, 0, false);
        declareFunction("xref_globals_rebound_by_method", "XREF-GLOBALS-REBOUND-BY-METHOD", 1, 0, false);
        declareFunction("xref_globals_accessed_by_method", "XREF-GLOBALS-ACCESSED-BY-METHOD", 1, 0, false);
        declareFunction("xref_method_called_by_globalP", "XREF-METHOD-CALLED-BY-GLOBAL?", 2, 0, false);
        declareFunction("xref_methods_called_by_global", "XREF-METHODS-CALLED-BY-GLOBAL", 1, 0, false);
        declareFunction("xref_globals_referenced_by_global", "XREF-GLOBALS-REFERENCED-BY-GLOBAL", 1, 0, false);
        declareFunction("xref_method_called_by_moduleP", "XREF-METHOD-CALLED-BY-MODULE?", 2, 0, false);
        declareFunction("xref_module_positions_calling_method", "XREF-MODULE-POSITIONS-CALLING-METHOD", 2, 0, false);
        declareFunction("xref_methods_called_by_module", "XREF-METHODS-CALLED-BY-MODULE", 1, 0, false);
        declareFunction("xref_module_positions_referencing_global", "XREF-MODULE-POSITIONS-REFERENCING-GLOBAL", 2, 0, false);
        declareFunction("xref_globals_referenced_by_module", "XREF-GLOBALS-REFERENCED-BY-MODULE", 1, 0, false);
        declareFunction("xref_module_positions_modifying_global", "XREF-MODULE-POSITIONS-MODIFYING-GLOBAL", 2, 0, false);
        declareFunction("xref_globals_modified_by_module", "XREF-GLOBALS-MODIFIED-BY-MODULE", 1, 0, false);
        declareFunction("xref_module_positions_rebinding_global", "XREF-MODULE-POSITIONS-REBINDING-GLOBAL", 2, 0, false);
        declareFunction("xref_globals_rebound_by_module", "XREF-GLOBALS-REBOUND-BY-MODULE", 1, 0, false);
        declareFunction("xref_module_positions_accessing_global", "XREF-MODULE-POSITIONS-ACCESSING-GLOBAL", 2, 0, false);
        declareFunction("xref_globals_accessed_by_module", "XREF-GLOBALS-ACCESSED-BY-MODULE", 1, 0, false);
        declareFunction("xref_methods_that_call_method", "XREF-METHODS-THAT-CALL-METHOD", 1, 0, false);
        declareFunction("xref_globals_that_call_method", "XREF-GLOBALS-THAT-CALL-METHOD", 1, 0, false);
        declareFunction("xrms_that_call_method", "XRMS-THAT-CALL-METHOD", 1, 0, false);
        declareFunction("xref_modules_that_call_method", "XREF-MODULES-THAT-CALL-METHOD", 1, 0, false);
        declareFunction("xref_method_call_count", "XREF-METHOD-CALL-COUNT", 1, 0, false);
        declareFunction("xref_method_unused_p", "XREF-METHOD-UNUSED-P", 1, 0, false);
        declareFunction("xref_methods_that_reference_global", "XREF-METHODS-THAT-REFERENCE-GLOBAL", 1, 0, false);
        declareFunction("xref_globals_that_reference_global", "XREF-GLOBALS-THAT-REFERENCE-GLOBAL", 1, 0, false);
        declareFunction("xrms_that_reference_global", "XRMS-THAT-REFERENCE-GLOBAL", 1, 0, false);
        declareFunction("xref_modules_that_reference_global", "XREF-MODULES-THAT-REFERENCE-GLOBAL", 1, 0, false);
        declareFunction("xref_global_reference_count", "XREF-GLOBAL-REFERENCE-COUNT", 1, 0, false);
        declareFunction("xref_global_never_referenced_p", "XREF-GLOBAL-NEVER-REFERENCED-P", 1, 0, false);
        declareFunction("xref_methods_that_modify_global", "XREF-METHODS-THAT-MODIFY-GLOBAL", 1, 0, false);
        declareFunction("xrms_that_modify_global", "XRMS-THAT-MODIFY-GLOBAL", 1, 0, false);
        declareFunction("xref_modules_that_modify_global", "XREF-MODULES-THAT-MODIFY-GLOBAL", 1, 0, false);
        declareFunction("xref_global_modification_count", "XREF-GLOBAL-MODIFICATION-COUNT", 1, 0, false);
        declareFunction("xref_global_never_modified_p", "XREF-GLOBAL-NEVER-MODIFIED-P", 1, 0, false);
        declareFunction("xref_methods_that_rebind_global", "XREF-METHODS-THAT-REBIND-GLOBAL", 1, 0, false);
        declareFunction("xrms_that_rebind_global", "XRMS-THAT-REBIND-GLOBAL", 1, 0, false);
        declareFunction("xref_modules_that_rebind_global", "XREF-MODULES-THAT-REBIND-GLOBAL", 1, 0, false);
        declareFunction("xref_global_binding_count", "XREF-GLOBAL-BINDING-COUNT", 1, 0, false);
        declareFunction("xref_global_never_rebound_p", "XREF-GLOBAL-NEVER-REBOUND-P", 1, 0, false);
        declareFunction("xref_methods_that_access_global", "XREF-METHODS-THAT-ACCESS-GLOBAL", 1, 0, false);
        declareFunction("xrms_that_access_global", "XRMS-THAT-ACCESS-GLOBAL", 1, 0, false);
        declareFunction("xref_modules_that_access_global", "XREF-MODULES-THAT-ACCESS-GLOBAL", 1, 0, false);
        declareFunction("xref_global_access_count", "XREF-GLOBAL-ACCESS-COUNT", 1, 0, false);
        declareFunction("xref_global_never_accessed_p", "XREF-GLOBAL-NEVER-ACCESSED-P", 1, 0, false);
        declareFunction("xref_xrms_accessed_by_method", "XREF-XRMS-ACCESSED-BY-METHOD", 1, 0, false);
        declareFunction("xref_modules_accessed_by_method", "XREF-MODULES-ACCESSED-BY-METHOD", 1, 0, false);
        declareFunction("xref_xrms_accessed_by_global", "XREF-XRMS-ACCESSED-BY-GLOBAL", 1, 0, false);
        declareFunction("xref_modules_accessed_by_global", "XREF-MODULES-ACCESSED-BY-GLOBAL", 1, 0, false);
        declareFunction("xref_xrms_accessed_by_xrm", "XREF-XRMS-ACCESSED-BY-XRM", 1, 0, false);
        declareFunction("xref_modules_accessed_by_module", "XREF-MODULES-ACCESSED-BY-MODULE", 1, 0, false);
        declareFunction("xref_xrms_accessed_anywhere_by_xrm", "XREF-XRMS-ACCESSED-ANYWHERE-BY-XRM", 1, 0, false);
        declareFunction("xref_modules_accessed_anywhere_by_module", "XREF-MODULES-ACCESSED-ANYWHERE-BY-MODULE", 1, 0, false);
        declareFunction("xref_globals_accessed_anywhere_by_module", "XREF-GLOBALS-ACCESSED-ANYWHERE-BY-MODULE", 1, 0, false);
        declareFunction("xref_methods_accessed_anywhere_by_module", "XREF-METHODS-ACCESSED-ANYWHERE-BY-MODULE", 1, 0, false);
        declareFunction("xrms_that_access_method", "XRMS-THAT-ACCESS-METHOD", 1, 0, false);
        declareFunction("xref_modules_that_access_method", "XREF-MODULES-THAT-ACCESS-METHOD", 1, 0, false);
        declareFunction("xrms_that_access_global_anywhere", "XRMS-THAT-ACCESS-GLOBAL-ANYWHERE", 1, 0, false);
        declareFunction("xref_modules_that_access_global_anywhere", "XREF-MODULES-THAT-ACCESS-GLOBAL-ANYWHERE", 1, 0, false);
        declareFunction("xrms_that_access_xrm_anywhere", "XRMS-THAT-ACCESS-XRM-ANYWHERE", 1, 0, false);
        declareFunction("xref_modules_that_access_module_anywhere", "XREF-MODULES-THAT-ACCESS-MODULE-ANYWHERE", 1, 0, false);
        declareFunction("xref_justify_module_referencing_module", "XREF-JUSTIFY-MODULE-REFERENCING-MODULE", 2, 0, false);
        declareFunction("xref_some_external_module_accesses_method_anywhereP", "XREF-SOME-EXTERNAL-MODULE-ACCESSES-METHOD-ANYWHERE?", 1, 0, false);
        declareFunction("xref_method_potentially_private_p", "XREF-METHOD-POTENTIALLY-PRIVATE-P", 1, 0, false);
        declareFunction("xref_module_potentially_private_methods", "XREF-MODULE-POTENTIALLY-PRIVATE-METHODS", 1, 0, false);
        declareFunction("xref_some_external_module_accesses_global_anywhereP", "XREF-SOME-EXTERNAL-MODULE-ACCESSES-GLOBAL-ANYWHERE?", 1, 0, false);
        declareFunction("xref_global_potentially_private_p", "XREF-GLOBAL-POTENTIALLY-PRIVATE-P", 1, 0, false);
        declareFunction("xref_module_potentially_private_globals", "XREF-MODULE-POTENTIALLY-PRIVATE-GLOBALS", 1, 0, false);
        declareFunction("xref_method_source_definition_info", "XREF-METHOD-SOURCE-DEFINITION-INFO", 1, 0, false);
        declareFunction("xref_global_source_definition_info", "XREF-GLOBAL-SOURCE-DEFINITION-INFO", 1, 0, false);
        declareFunction("xref_method_source_definition_comment", "XREF-METHOD-SOURCE-DEFINITION-COMMENT", 1, 0, false);
        declareFunction("xref_global_source_definition_comment", "XREF-GLOBAL-SOURCE-DEFINITION-COMMENT", 1, 0, false);
        declareFunction("xref_source_definition_comment", "XREF-SOURCE-DEFINITION-COMMENT", 2, 0, false);
        declareFunction("xref_module_relative_input_filename_internal", "XREF-MODULE-RELATIVE-INPUT-FILENAME-INTERNAL", 1, 0, false);
        declareFunction("xref_module_relative_input_filename", "XREF-MODULE-RELATIVE-INPUT-FILENAME", 1, 0, false);
        declareFunction("xrs_merge_xref_module", "XRS-MERGE-XREF-MODULE", 2, 0, false);
        declareFunction("xrs_merge_new_xrm", "XRS-MERGE-NEW-XRM", 2, 0, false);
        declareFunction("xrs_merge_definition", "XRS-MERGE-DEFINITION", 3, 0, false);
        declareFunction("xrs_merge_new_method_definitions", "XRS-MERGE-NEW-METHOD-DEFINITIONS", 2, 0, false);
        declareFunction("xrs_merge_new_global_definitions", "XRS-MERGE-NEW-GLOBAL-DEFINITIONS", 2, 0, false);
        declareFunction("xrs_merge_update_backpointer", "XRS-MERGE-UPDATE-BACKPOINTER", 3, 0, false);
        declareFunction("xrs_merge_new_method_called_by_method", "XRS-MERGE-NEW-METHOD-CALLED-BY-METHOD", 2, 0, false);
        declareFunction("xrs_merge_new_method_called_by_global", "XRS-MERGE-NEW-METHOD-CALLED-BY-GLOBAL", 2, 0, false);
        declareFunction("xrs_merge_new_method_called_at_top_level", "XRS-MERGE-NEW-METHOD-CALLED-AT-TOP-LEVEL", 2, 0, false);
        declareFunction("xrs_merge_new_global_referenced_by_method", "XRS-MERGE-NEW-GLOBAL-REFERENCED-BY-METHOD", 2, 0, false);
        declareFunction("xrs_merge_new_global_referenced_by_global", "XRS-MERGE-NEW-GLOBAL-REFERENCED-BY-GLOBAL", 2, 0, false);
        declareFunction("xrs_merge_new_global_referenced_at_top_level", "XRS-MERGE-NEW-GLOBAL-REFERENCED-AT-TOP-LEVEL", 2, 0, false);
        declareFunction("xrs_merge_new_global_modified_by_method", "XRS-MERGE-NEW-GLOBAL-MODIFIED-BY-METHOD", 2, 0, false);
        declareFunction("xrs_merge_new_global_modified_at_top_level", "XRS-MERGE-NEW-GLOBAL-MODIFIED-AT-TOP-LEVEL", 2, 0, false);
        declareFunction("xrs_merge_new_global_rebound_by_method", "XRS-MERGE-NEW-GLOBAL-REBOUND-BY-METHOD", 2, 0, false);
        declareFunction("xrs_merge_new_global_rebound_at_top_level", "XRS-MERGE-NEW-GLOBAL-REBOUND-AT-TOP-LEVEL", 2, 0, false);
        declareFunction("xrs_remove_old_xrm", "XRS-REMOVE-OLD-XRM", 2, 0, false);
        declareFunction("xrs_remove_definition", "XRS-REMOVE-DEFINITION", 3, 0, false);
        declareFunction("xrs_remove_old_method_definitions", "XRS-REMOVE-OLD-METHOD-DEFINITIONS", 2, 0, false);
        declareFunction("xrs_remove_old_global_definitions", "XRS-REMOVE-OLD-GLOBAL-DEFINITIONS", 2, 0, false);
        declareFunction("xrs_remove_update_backpointer", "XRS-REMOVE-UPDATE-BACKPOINTER", 3, 0, false);
        declareFunction("xrs_remove_old_method_called_by_method", "XRS-REMOVE-OLD-METHOD-CALLED-BY-METHOD", 2, 0, false);
        declareFunction("xrs_remove_old_method_called_by_global", "XRS-REMOVE-OLD-METHOD-CALLED-BY-GLOBAL", 2, 0, false);
        declareFunction("xrs_remove_old_method_called_at_top_level", "XRS-REMOVE-OLD-METHOD-CALLED-AT-TOP-LEVEL", 2, 0, false);
        declareFunction("xrs_remove_old_global_referenced_by_method", "XRS-REMOVE-OLD-GLOBAL-REFERENCED-BY-METHOD", 2, 0, false);
        declareFunction("xrs_remove_old_global_referenced_by_global", "XRS-REMOVE-OLD-GLOBAL-REFERENCED-BY-GLOBAL", 2, 0, false);
        declareFunction("xrs_remove_old_global_referenced_at_top_level", "XRS-REMOVE-OLD-GLOBAL-REFERENCED-AT-TOP-LEVEL", 2, 0, false);
        declareFunction("xrs_remove_old_global_modified_by_method", "XRS-REMOVE-OLD-GLOBAL-MODIFIED-BY-METHOD", 2, 0, false);
        declareFunction("xrs_remove_old_global_modified_at_top_level", "XRS-REMOVE-OLD-GLOBAL-MODIFIED-AT-TOP-LEVEL", 2, 0, false);
        declareFunction("xrs_remove_old_global_rebound_by_method", "XRS-REMOVE-OLD-GLOBAL-REBOUND-BY-METHOD", 2, 0, false);
        declareFunction("xrs_remove_old_global_rebound_at_top_level", "XRS-REMOVE-OLD-GLOBAL-REBOUND-AT-TOP-LEVEL", 2, 0, false);
        declareFunction("xref_possibly_record_global_undefinition", "XREF-POSSIBLY-RECORD-GLOBAL-UNDEFINITION", 2, 0, false);
        declareFunction("xrs_unrecord_global_backpointers", "XRS-UNRECORD-GLOBAL-BACKPOINTERS", 3, 0, false);
        declareFunction("xref_possibly_record_method_undefinition", "XREF-POSSIBLY-RECORD-METHOD-UNDEFINITION", 2, 0, false);
        declareFunction("xrs_unrecord_method_backpointers", "XRS-UNRECORD-METHOD-BACKPOINTERS", 3, 0, false);
        declareMacro("within_new_xref_module", "WITHIN-NEW-XREF-MODULE");
        declareMacro("with_current_xref_module", "WITH-CURRENT-XREF-MODULE");
        declareFunction("current_xref_module", "CURRENT-XREF-MODULE", 0, 0, false);
        declareMacro("xref_within_module", "XREF-WITHIN-MODULE");
        declareFunction("xref_module_scope", "XREF-MODULE-SCOPE", 0, 0, false);
        declareMacro("xref_within_file_position", "XREF-WITHIN-FILE-POSITION");
        declareFunction("xref_file_position_scope", "XREF-FILE-POSITION-SCOPE", 0, 0, false);
        declareMacro("xref_within_define", "XREF-WITHIN-DEFINE");
        declareMacro("xref_within_defmacro", "XREF-WITHIN-DEFMACRO");
        declareMacro("xref_within_method", "XREF-WITHIN-METHOD");
        declareFunction("xref_method_scope", "XREF-METHOD-SCOPE", 0, 0, false);
        declareMacro("xref_within_global", "XREF-WITHIN-GLOBAL");
        declareFunction("xref_global_scope", "XREF-GLOBAL-SCOPE", 0, 0, false);
        declareFunction("xref_reference_scope", "XREF-REFERENCE-SCOPE", 0, 0, false);
        declareFunction("xref_note_global_definition", "XREF-NOTE-GLOBAL-DEFINITION", 1, 0, false);
        declareFunction("xref_note_macro_definition", "XREF-NOTE-MACRO-DEFINITION", 1, 0, false);
        declareFunction("xref_note_function_definition", "XREF-NOTE-FUNCTION-DEFINITION", 1, 0, false);
        declareFunction("xref_note_method_formal_arglist", "XREF-NOTE-METHOD-FORMAL-ARGLIST", 2, 0, false);
        declareFunction("xref_note_global_binding_type", "XREF-NOTE-GLOBAL-BINDING-TYPE", 2, 0, false);
        declareFunction("xref_note_global_reference", "XREF-NOTE-GLOBAL-REFERENCE", 1, 0, false);
        declareFunction("xref_note_global_modification", "XREF-NOTE-GLOBAL-MODIFICATION", 1, 0, false);
        declareFunction("xref_note_global_binding", "XREF-NOTE-GLOBAL-BINDING", 1, 0, false);
        declareFunction("xref_note_macro_use", "XREF-NOTE-MACRO-USE", 1, 0, false);
        declareFunction("xref_note_function_call", "XREF-NOTE-FUNCTION-CALL", 1, 0, false);
        declareFunction("xref_note_module_removal", "XREF-NOTE-MODULE-REMOVAL", 1, 0, false);
        declareFunction("xref_trace", "XREF-TRACE", 1, 2, false);
        declareFunction("xref_sort_called_globals", "XREF-SORT-CALLED-GLOBALS", 1, 0, false);
        declareFunction("xref_sort_called_methods", "XREF-SORT-CALLED-METHODS", 1, 0, false);
        declareFunction("xref_sort_referenced_xrms", "XREF-SORT-REFERENCED-XRMS", 1, 0, false);
        declareFunction("xref_sort_referenced_modules", "XREF-SORT-REFERENCED-MODULES", 1, 0, false);
        declareFunction("xref_sort_calling_globals", "XREF-SORT-CALLING-GLOBALS", 1, 0, false);
        declareFunction("xref_sort_calling_methods", "XREF-SORT-CALLING-METHODS", 1, 0, false);
        declareFunction("xref_sort_calling_xrms", "XREF-SORT-CALLING-XRMS", 1, 0, false);
        declareFunction("xref_sort_calling_modules", "XREF-SORT-CALLING-MODULES", 1, 0, false);
        return NIL;
    }

    public static SubLObject init_xref_database_file() {
        deflexical("*EMPTY-SET-CONTENTS*", set_contents.new_set_contents(ZERO_INTEGER, UNPROVIDED));
        defconstant("*DTP-XREF-MODULE*", XREF_MODULE);
        defconstant("*DTP-XREF-SYSTEM*", XREF_SYSTEM);
        defparameter("*CURRENT-XREF-MODULE*", NIL);
        defparameter("*XREF-MODULE-SCOPE*", NIL);
        defparameter("*XREF-FILE-POSITION-SCOPE*", NIL);
        defparameter("*XREF-METHOD-SCOPE*", NIL);
        defparameter("*XREF-GLOBAL-SCOPE*", NIL);
        defvar("*XREF-TRACE*", NIL);
        return NIL;
    }

    public static SubLObject setup_xref_database_file() {
        register_method($print_object_method_table$.getGlobalValue(), $dtp_xref_module$.getGlobalValue(), symbol_function(XREF_MODULE_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim($list8);
        def_csetf(XREF_M_NAME, _CSETF_XREF_M_NAME);
        def_csetf(XREF_M_XREF_SYSTEM, _CSETF_XREF_M_XREF_SYSTEM);
        def_csetf(XREF_M_FEATURES, _CSETF_XREF_M_FEATURES);
        def_csetf(XREF_M_METHOD_DEFINITIONS, _CSETF_XREF_M_METHOD_DEFINITIONS);
        def_csetf(XREF_M_METHOD_POSITION_TABLE, _CSETF_XREF_M_METHOD_POSITION_TABLE);
        def_csetf(XREF_M_METHOD_METHOD_TABLE, _CSETF_XREF_M_METHOD_METHOD_TABLE);
        def_csetf(XREF_M_METHOD_GLOBAL_REFERENCE_TABLE, _CSETF_XREF_M_METHOD_GLOBAL_REFERENCE_TABLE);
        def_csetf(XREF_M_METHOD_GLOBAL_MODIFICATION_TABLE, _CSETF_XREF_M_METHOD_GLOBAL_MODIFICATION_TABLE);
        def_csetf(XREF_M_METHOD_GLOBAL_BINDING_TABLE, _CSETF_XREF_M_METHOD_GLOBAL_BINDING_TABLE);
        def_csetf(XREF_M_GLOBAL_DEFINITIONS, _CSETF_XREF_M_GLOBAL_DEFINITIONS);
        def_csetf(XREF_M_GLOBAL_POSITION_TABLE, _CSETF_XREF_M_GLOBAL_POSITION_TABLE);
        def_csetf(XREF_M_GLOBAL_METHOD_TABLE, _CSETF_XREF_M_GLOBAL_METHOD_TABLE);
        def_csetf(XREF_M_GLOBAL_GLOBAL_REFERENCE_TABLE, _CSETF_XREF_M_GLOBAL_GLOBAL_REFERENCE_TABLE);
        def_csetf(XREF_M_TOP_METHOD_TABLE, _CSETF_XREF_M_TOP_METHOD_TABLE);
        def_csetf(XREF_M_TOP_GLOBAL_REFERENCE_TABLE, _CSETF_XREF_M_TOP_GLOBAL_REFERENCE_TABLE);
        def_csetf(XREF_M_TOP_GLOBAL_MODIFICATION_TABLE, _CSETF_XREF_M_TOP_GLOBAL_MODIFICATION_TABLE);
        def_csetf(XREF_M_TOP_GLOBAL_BINDING_TABLE, _CSETF_XREF_M_TOP_GLOBAL_BINDING_TABLE);
        def_csetf(XREF_M_METHOD_FORMAL_ARGLIST_TABLE, _CSETF_XREF_M_METHOD_FORMAL_ARGLIST_TABLE);
        def_csetf(XREF_M_GLOBAL_BINDING_TYPE_TABLE, _CSETF_XREF_M_GLOBAL_BINDING_TYPE_TABLE);
        identity(XREF_MODULE);
        register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_xref_module$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_XREF_MODULE_METHOD));
        register_method(Sxhash.$sxhash_method_table$.getGlobalValue(), $dtp_xref_module$.getGlobalValue(), symbol_function(SXHASH_XREF_MODULE_METHOD));
        register_macro_helper(XRM_METHOD_DEFINITIONS, DO_XRM_METHOD_DEFINITIONS);
        register_macro_helper(XRM_METHOD_POSITION_TABLE, DO_XRM_METHODS);
        register_macro_helper(XRM_GLOBAL_DEFINITIONS, DO_XRM_GLOBAL_DEFINITIONS);
        register_macro_helper(XRM_GLOBAL_POSITION_TABLE, DO_XRM_GLOBALS);
        register_method($print_object_method_table$.getGlobalValue(), $dtp_xref_system$.getGlobalValue(), symbol_function(XREF_SYSTEM_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim($list120);
        def_csetf(XREF_S_NAME, _CSETF_XREF_S_NAME);
        def_csetf(XREF_S_FEATURES, _CSETF_XREF_S_FEATURES);
        def_csetf(XREF_S_XREF_MODULE_TABLE, _CSETF_XREF_S_XREF_MODULE_TABLE);
        def_csetf(XREF_S_METHOD_DEFINITION_TABLE, _CSETF_XREF_S_METHOD_DEFINITION_TABLE);
        def_csetf(XREF_S_GLOBAL_DEFINITION_TABLE, _CSETF_XREF_S_GLOBAL_DEFINITION_TABLE);
        def_csetf(XREF_S_METHOD_CALLED_BY_METHOD_TABLE, _CSETF_XREF_S_METHOD_CALLED_BY_METHOD_TABLE);
        def_csetf(XREF_S_METHOD_CALLED_BY_GLOBAL_TABLE, _CSETF_XREF_S_METHOD_CALLED_BY_GLOBAL_TABLE);
        def_csetf(XREF_S_METHOD_CALLED_AT_TOP_LEVEL_TABLE, _CSETF_XREF_S_METHOD_CALLED_AT_TOP_LEVEL_TABLE);
        def_csetf(XREF_S_GLOBAL_REFERENCED_BY_METHOD_TABLE, _CSETF_XREF_S_GLOBAL_REFERENCED_BY_METHOD_TABLE);
        def_csetf(XREF_S_GLOBAL_MODIFIED_BY_METHOD_TABLE, _CSETF_XREF_S_GLOBAL_MODIFIED_BY_METHOD_TABLE);
        def_csetf(XREF_S_GLOBAL_REBOUND_BY_METHOD_TABLE, _CSETF_XREF_S_GLOBAL_REBOUND_BY_METHOD_TABLE);
        def_csetf(XREF_S_GLOBAL_REFERENCED_BY_GLOBAL_TABLE, _CSETF_XREF_S_GLOBAL_REFERENCED_BY_GLOBAL_TABLE);
        def_csetf(XREF_S_GLOBAL_REFERENCED_AT_TOP_LEVEL_TABLE, _CSETF_XREF_S_GLOBAL_REFERENCED_AT_TOP_LEVEL_TABLE);
        def_csetf(XREF_S_GLOBAL_MODIFIED_AT_TOP_LEVEL_TABLE, _CSETF_XREF_S_GLOBAL_MODIFIED_AT_TOP_LEVEL_TABLE);
        def_csetf(XREF_S_GLOBAL_REBOUND_AT_TOP_LEVEL_TABLE, _CSETF_XREF_S_GLOBAL_REBOUND_AT_TOP_LEVEL_TABLE);
        identity(XREF_SYSTEM);
        register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_xref_system$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_XREF_SYSTEM_METHOD));
        memoization_state.note_memoized_function(XREF_MODULE_RELATIVE_INPUT_FILENAME);
        register_macro_helper(CURRENT_XREF_MODULE, WITH_CURRENT_XREF_MODULE);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_xref_database_file();
    }

    @Override
    public void initializeVariables() {
        init_xref_database_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_xref_database_file();
    }

    static {
    }

    static private final SubLList $list_alt2 = list(new SubLObject[]{ makeSymbol("NAME"), makeSymbol("XREF-SYSTEM"), makeSymbol("FEATURES"), makeSymbol("METHOD-DEFINITIONS"), makeSymbol("METHOD-POSITION-TABLE"), makeSymbol("METHOD-METHOD-TABLE"), makeSymbol("METHOD-GLOBAL-REFERENCE-TABLE"), makeSymbol("METHOD-GLOBAL-MODIFICATION-TABLE"), makeSymbol("METHOD-GLOBAL-BINDING-TABLE"), makeSymbol("GLOBAL-DEFINITIONS"), makeSymbol("GLOBAL-POSITION-TABLE"), makeSymbol("GLOBAL-METHOD-TABLE"), makeSymbol("GLOBAL-GLOBAL-REFERENCE-TABLE"), makeSymbol("TOP-METHOD-TABLE"), makeSymbol("TOP-GLOBAL-REFERENCE-TABLE"), makeSymbol("TOP-GLOBAL-MODIFICATION-TABLE"), makeSymbol("TOP-GLOBAL-BINDING-TABLE"), makeSymbol("METHOD-FORMAL-ARGLIST-TABLE"), makeSymbol("GLOBAL-BINDING-TYPE-TABLE") });

    static private final SubLList $list_alt3 = list(new SubLObject[]{ $NAME, makeKeyword("XREF-SYSTEM"), makeKeyword("FEATURES"), makeKeyword("METHOD-DEFINITIONS"), makeKeyword("METHOD-POSITION-TABLE"), makeKeyword("METHOD-METHOD-TABLE"), makeKeyword("METHOD-GLOBAL-REFERENCE-TABLE"), makeKeyword("METHOD-GLOBAL-MODIFICATION-TABLE"), makeKeyword("METHOD-GLOBAL-BINDING-TABLE"), makeKeyword("GLOBAL-DEFINITIONS"), makeKeyword("GLOBAL-POSITION-TABLE"), makeKeyword("GLOBAL-METHOD-TABLE"), makeKeyword("GLOBAL-GLOBAL-REFERENCE-TABLE"), makeKeyword("TOP-METHOD-TABLE"), makeKeyword("TOP-GLOBAL-REFERENCE-TABLE"), makeKeyword("TOP-GLOBAL-MODIFICATION-TABLE"), makeKeyword("TOP-GLOBAL-BINDING-TABLE"), makeKeyword("METHOD-FORMAL-ARGLIST-TABLE"), makeKeyword("GLOBAL-BINDING-TYPE-TABLE") });

    public static final class $xref_module_p$UnaryFunction extends UnaryFunction {
        public $xref_module_p$UnaryFunction() {
            super(extractFunctionNamed("XREF-MODULE-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return xref_module_p(arg1);
        }
    }

    static private final SubLList $list_alt4 = list(new SubLObject[]{ makeSymbol("XREF-M-NAME"), makeSymbol("XREF-M-XREF-SYSTEM"), makeSymbol("XREF-M-FEATURES"), makeSymbol("XREF-M-METHOD-DEFINITIONS"), makeSymbol("XREF-M-METHOD-POSITION-TABLE"), makeSymbol("XREF-M-METHOD-METHOD-TABLE"), makeSymbol("XREF-M-METHOD-GLOBAL-REFERENCE-TABLE"), makeSymbol("XREF-M-METHOD-GLOBAL-MODIFICATION-TABLE"), makeSymbol("XREF-M-METHOD-GLOBAL-BINDING-TABLE"), makeSymbol("XREF-M-GLOBAL-DEFINITIONS"), makeSymbol("XREF-M-GLOBAL-POSITION-TABLE"), makeSymbol("XREF-M-GLOBAL-METHOD-TABLE"), makeSymbol("XREF-M-GLOBAL-GLOBAL-REFERENCE-TABLE"), makeSymbol("XREF-M-TOP-METHOD-TABLE"), makeSymbol("XREF-M-TOP-GLOBAL-REFERENCE-TABLE"), makeSymbol("XREF-M-TOP-GLOBAL-MODIFICATION-TABLE"), makeSymbol("XREF-M-TOP-GLOBAL-BINDING-TABLE"), makeSymbol("XREF-M-METHOD-FORMAL-ARGLIST-TABLE"), makeSymbol("XREF-M-GLOBAL-BINDING-TYPE-TABLE") });

    static private final SubLList $list_alt5 = list(new SubLObject[]{ makeSymbol("_CSETF-XREF-M-NAME"), makeSymbol("_CSETF-XREF-M-XREF-SYSTEM"), makeSymbol("_CSETF-XREF-M-FEATURES"), makeSymbol("_CSETF-XREF-M-METHOD-DEFINITIONS"), makeSymbol("_CSETF-XREF-M-METHOD-POSITION-TABLE"), makeSymbol("_CSETF-XREF-M-METHOD-METHOD-TABLE"), makeSymbol("_CSETF-XREF-M-METHOD-GLOBAL-REFERENCE-TABLE"), makeSymbol("_CSETF-XREF-M-METHOD-GLOBAL-MODIFICATION-TABLE"), makeSymbol("_CSETF-XREF-M-METHOD-GLOBAL-BINDING-TABLE"), makeSymbol("_CSETF-XREF-M-GLOBAL-DEFINITIONS"), makeSymbol("_CSETF-XREF-M-GLOBAL-POSITION-TABLE"), makeSymbol("_CSETF-XREF-M-GLOBAL-METHOD-TABLE"), makeSymbol("_CSETF-XREF-M-GLOBAL-GLOBAL-REFERENCE-TABLE"), makeSymbol("_CSETF-XREF-M-TOP-METHOD-TABLE"), makeSymbol("_CSETF-XREF-M-TOP-GLOBAL-REFERENCE-TABLE"), makeSymbol("_CSETF-XREF-M-TOP-GLOBAL-MODIFICATION-TABLE"), makeSymbol("_CSETF-XREF-M-TOP-GLOBAL-BINDING-TABLE"), makeSymbol("_CSETF-XREF-M-METHOD-FORMAL-ARGLIST-TABLE"), makeSymbol("_CSETF-XREF-M-GLOBAL-BINDING-TYPE-TABLE") });

    public static final class $xref_system_p$UnaryFunction extends UnaryFunction {
        public $xref_system_p$UnaryFunction() {
            super(extractFunctionNamed("XREF-SYSTEM-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return xref_system_p(arg1);
        }
    }

    static private final SubLString $str_alt65$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");

    static private final SubLString $str_alt66$__ = makeString("#<");

    static private final SubLString $str_alt68$_A____S_methods___S_globals = makeString("~A : ~S methods, ~S globals");

    static private final SubLList $list_alt75 = list(list(makeSymbol("METHOD"), makeSymbol("XRM"), makeSymbol("&KEY"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list_alt76 = list($DONE);

    static private final SubLSymbol $sym79$XRM_VAR = makeUninternedSymbol("XRM-VAR");

    static private final SubLSymbol $sym80$DEFINITION = makeUninternedSymbol("DEFINITION");

    static private final SubLSymbol $sym81$POSITION = makeUninternedSymbol("POSITION");

    static private final SubLSymbol $sym88$XRM_VAR = makeUninternedSymbol("XRM-VAR");

    static private final SubLSymbol $sym89$POSITION = makeUninternedSymbol("POSITION");

    static private final SubLList $list_alt93 = list(list(makeSymbol("GLOBAL"), makeSymbol("XRM"), makeSymbol("&KEY"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLSymbol $sym94$XRM_VAR = makeUninternedSymbol("XRM-VAR");

    static private final SubLSymbol $sym95$DEFINITION = makeUninternedSymbol("DEFINITION");

    static private final SubLSymbol $sym96$POSITION = makeUninternedSymbol("POSITION");

    static private final SubLSymbol $sym99$XRM_VAR = makeUninternedSymbol("XRM-VAR");

    static private final SubLSymbol $sym100$POSITION = makeUninternedSymbol("POSITION");

    static private final SubLList $list_alt104 = cons(makeSymbol("CANDIDATE-METHOD"), makeSymbol("POSITION"));

    static private final SubLList $list_alt105 = cons(makeSymbol("CANDIDATE-GLOBAL"), makeSymbol("POSITION"));

    static private final SubLList $list_alt111 = list(new SubLObject[]{ makeSymbol("NAME"), makeSymbol("FEATURES"), makeSymbol("XREF-MODULE-TABLE"), makeSymbol("METHOD-DEFINITION-TABLE"), makeSymbol("GLOBAL-DEFINITION-TABLE"), makeSymbol("METHOD-CALLED-BY-METHOD-TABLE"), makeSymbol("METHOD-CALLED-BY-GLOBAL-TABLE"), makeSymbol("METHOD-CALLED-AT-TOP-LEVEL-TABLE"), makeSymbol("GLOBAL-REFERENCED-BY-METHOD-TABLE"), makeSymbol("GLOBAL-MODIFIED-BY-METHOD-TABLE"), makeSymbol("GLOBAL-REBOUND-BY-METHOD-TABLE"), makeSymbol("GLOBAL-REFERENCED-BY-GLOBAL-TABLE"), makeSymbol("GLOBAL-REFERENCED-AT-TOP-LEVEL-TABLE"), makeSymbol("GLOBAL-MODIFIED-AT-TOP-LEVEL-TABLE"), makeSymbol("GLOBAL-REBOUND-AT-TOP-LEVEL-TABLE") });

    static private final SubLList $list_alt112 = list(new SubLObject[]{ $NAME, makeKeyword("FEATURES"), makeKeyword("XREF-MODULE-TABLE"), makeKeyword("METHOD-DEFINITION-TABLE"), makeKeyword("GLOBAL-DEFINITION-TABLE"), makeKeyword("METHOD-CALLED-BY-METHOD-TABLE"), makeKeyword("METHOD-CALLED-BY-GLOBAL-TABLE"), makeKeyword("METHOD-CALLED-AT-TOP-LEVEL-TABLE"), makeKeyword("GLOBAL-REFERENCED-BY-METHOD-TABLE"), makeKeyword("GLOBAL-MODIFIED-BY-METHOD-TABLE"), makeKeyword("GLOBAL-REBOUND-BY-METHOD-TABLE"), makeKeyword("GLOBAL-REFERENCED-BY-GLOBAL-TABLE"), makeKeyword("GLOBAL-REFERENCED-AT-TOP-LEVEL-TABLE"), makeKeyword("GLOBAL-MODIFIED-AT-TOP-LEVEL-TABLE"), makeKeyword("GLOBAL-REBOUND-AT-TOP-LEVEL-TABLE") });

    static private final SubLList $list_alt113 = list(new SubLObject[]{ makeSymbol("XREF-S-NAME"), makeSymbol("XREF-S-FEATURES"), makeSymbol("XREF-S-XREF-MODULE-TABLE"), makeSymbol("XREF-S-METHOD-DEFINITION-TABLE"), makeSymbol("XREF-S-GLOBAL-DEFINITION-TABLE"), makeSymbol("XREF-S-METHOD-CALLED-BY-METHOD-TABLE"), makeSymbol("XREF-S-METHOD-CALLED-BY-GLOBAL-TABLE"), makeSymbol("XREF-S-METHOD-CALLED-AT-TOP-LEVEL-TABLE"), makeSymbol("XREF-S-GLOBAL-REFERENCED-BY-METHOD-TABLE"), makeSymbol("XREF-S-GLOBAL-MODIFIED-BY-METHOD-TABLE"), makeSymbol("XREF-S-GLOBAL-REBOUND-BY-METHOD-TABLE"), makeSymbol("XREF-S-GLOBAL-REFERENCED-BY-GLOBAL-TABLE"), makeSymbol("XREF-S-GLOBAL-REFERENCED-AT-TOP-LEVEL-TABLE"), makeSymbol("XREF-S-GLOBAL-MODIFIED-AT-TOP-LEVEL-TABLE"), makeSymbol("XREF-S-GLOBAL-REBOUND-AT-TOP-LEVEL-TABLE") });

    static private final SubLList $list_alt114 = list(new SubLObject[]{ makeSymbol("_CSETF-XREF-S-NAME"), makeSymbol("_CSETF-XREF-S-FEATURES"), makeSymbol("_CSETF-XREF-S-XREF-MODULE-TABLE"), makeSymbol("_CSETF-XREF-S-METHOD-DEFINITION-TABLE"), makeSymbol("_CSETF-XREF-S-GLOBAL-DEFINITION-TABLE"), makeSymbol("_CSETF-XREF-S-METHOD-CALLED-BY-METHOD-TABLE"), makeSymbol("_CSETF-XREF-S-METHOD-CALLED-BY-GLOBAL-TABLE"), makeSymbol("_CSETF-XREF-S-METHOD-CALLED-AT-TOP-LEVEL-TABLE"), makeSymbol("_CSETF-XREF-S-GLOBAL-REFERENCED-BY-METHOD-TABLE"), makeSymbol("_CSETF-XREF-S-GLOBAL-MODIFIED-BY-METHOD-TABLE"), makeSymbol("_CSETF-XREF-S-GLOBAL-REBOUND-BY-METHOD-TABLE"), makeSymbol("_CSETF-XREF-S-GLOBAL-REFERENCED-BY-GLOBAL-TABLE"), makeSymbol("_CSETF-XREF-S-GLOBAL-REFERENCED-AT-TOP-LEVEL-TABLE"), makeSymbol("_CSETF-XREF-S-GLOBAL-MODIFIED-AT-TOP-LEVEL-TABLE"), makeSymbol("_CSETF-XREF-S-GLOBAL-REBOUND-AT-TOP-LEVEL-TABLE") });

    static private final SubLString $str_alt160$_A____S_features___S_modules = makeString("~A : ~S features, ~S modules");

    static private final SubLString $str_alt164$Module__A_features_changed_to__S = makeString("Module ~A features changed to ~S");

    static private final SubLString $str_alt167$Unexpected_backend__S = makeString("Unexpected backend ~S");

    static private final SubLString $str_alt176$_subl_ = makeString("@subl ");

    static private final SubLString $str_alt177$_ = makeString(" ");

    public static final SubLSymbol $kw179$_MEMOIZED_ITEM_NOT_FOUND_ = makeKeyword("&MEMOIZED-ITEM-NOT-FOUND&");

    static private final SubLList $list_alt180 = list(list(makeSymbol("&KEY"), makeSymbol("NAME"), makeSymbol("FEATURES")), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list_alt181 = list($NAME, makeKeyword("FEATURES"));

    static private final SubLSymbol $sym182$SYSTEM_VAR = makeUninternedSymbol("SYSTEM-VAR");

    static private final SubLSymbol $sym183$MODULE_VAR = makeUninternedSymbol("MODULE-VAR");

    static private final SubLList $list_alt184 = list(list(makeSymbol("CURRENT-XREF-SYSTEM")));

    static private final SubLList $list_alt190 = list(makeSymbol("XRM"), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list_alt191 = list(list(makeSymbol("CURRENT-XREF-MODULE")));

    static private final SubLList $list_alt194 = list(makeSymbol("MODULE-NAME"), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLSymbol $sym195$NAME_VAR = makeUninternedSymbol("NAME-VAR");

    static private final SubLList $list_alt197 = list(makeSymbol("STRINGP"));

    static private final SubLList $list_alt199 = list(makeSymbol("FILE-POSITION"), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLSymbol $sym200$POSITION_VAR = makeUninternedSymbol("POSITION-VAR");

    static private final SubLList $list_alt201 = list(makeSymbol("NON-NEGATIVE-INTEGER-P"));

    static private final SubLList $list_alt203 = list(makeSymbol("NAME"), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list_alt205 = list(makeSymbol("METHOD"), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLSymbol $sym206$METHOD_VAR = makeUninternedSymbol("METHOD-VAR");

    static private final SubLList $list_alt207 = list(makeSymbol("SYMBOLP"));

    static private final SubLList $list_alt209 = list(makeSymbol("GLOBAL"), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLSymbol $sym210$GLOBAL_VAR = makeUninternedSymbol("GLOBAL-VAR");

    static private final SubLString $str_alt215$___def_glob____S = makeString("~% def glob : ~S");

    static private final SubLString $str_alt216$___defmacro____S = makeString("~% defmacro : ~S");

    static private final SubLString $str_alt217$___define______S = makeString("~% define   : ~S");

    static private final SubLString $str_alt218$____arglist____S = makeString("~%  arglist : ~S");

    static private final SubLString $str_alt219$____binding_type____S = makeString("~%  binding-type : ~S");

    static private final SubLString $str_alt220$____ref_glob_____S = makeString("~%  ref glob  : ~S");

    static private final SubLString $str_alt221$____mod_glob_____S = makeString("~%  mod glob  : ~S");

    static private final SubLString $str_alt222$Initializer_for__S_modifies__S = makeString("Initializer for ~S modifies ~S");

    static private final SubLString $str_alt223$____bind_glob_____S = makeString("~%  bind glob  : ~S");

    static private final SubLString $str_alt224$Initializer_for__S_rebinds__S = makeString("Initializer for ~S rebinds ~S");

    static private final SubLString $str_alt225$____macro_use____S = makeString("~%  macro use : ~S");

    static private final SubLString $str_alt226$____fun_call_____S = makeString("~%  fun call  : ~S");

    static private final SubLString $str_alt227$__module_removed_____A = makeString("~%module removed  : ~A");

    static private final SubLSymbol $sym230$_ = makeSymbol("<");
}

/**
 * Total time: 1047 ms
 */
