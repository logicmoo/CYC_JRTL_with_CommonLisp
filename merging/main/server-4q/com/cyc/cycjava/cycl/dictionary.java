/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;

import static com.cyc.cycjava.cycl.access_macros.register_macro_helper;
import static com.cyc.cycjava.cycl.cfasl.$cfasl_output_object_method_table$;
import static com.cyc.cycjava.cycl.cfasl.cfasl_input;
import static com.cyc.cycjava.cycl.cfasl.cfasl_input_object;
import static com.cyc.cycjava.cycl.cfasl.cfasl_output;
import static com.cyc.cycjava.cycl.cfasl.cfasl_raw_write_byte;
import static com.cyc.cycjava.cycl.cfasl.register_cfasl_input_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_greater;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_space;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.append;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.listS;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.make_list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.rplaca;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.identity;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.pointer;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.funcall;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.gethash;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.gethash_without_values;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.hash_table_count;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.make_hash_table;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.remhash;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.sethash;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.write;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.length;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.def_csetf;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.makeStructDeclNative;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.register_method;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_name;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.function_spec_p;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.integerp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.sublisp_null;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.type_of;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeInteger;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeUninternedSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.cdestructuring_bind_error;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_listp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.property_list_member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cadr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cddr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.$print_object_method_table$;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.$print_readably$;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.princ;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.print_not_readable;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.bq_cons;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.write_char;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.write_string;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.declareMacro;
import static com.cyc.tool.subl.util.SubLFiles.defconstant;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;

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
 * module:      DICTIONARY
 * source file: /cyc/top/cycl/dictionary.lisp
 * created:     2019/07/03 17:37:14
 */
public final class dictionary extends SubLTranslatedFile implements V12 {
    public static final class $dictionary_native extends SubLStructNative {
	@Override
	public SubLStructDecl getStructDecl() {
	    return structDecl;
	}

	@Override
	public SubLObject getField2() {
	    return com.cyc.cycjava.cycl.dictionary.$dictionary_native.this.$database;
	}

	@Override
	public SubLObject getField3() {
	    return com.cyc.cycjava.cycl.dictionary.$dictionary_native.this.$test;
	}

	@Override
	public SubLObject setField2(SubLObject value) {
	    return com.cyc.cycjava.cycl.dictionary.$dictionary_native.this.$database = value;
	}

	@Override
	public SubLObject setField3(SubLObject value) {
	    return com.cyc.cycjava.cycl.dictionary.$dictionary_native.this.$test = value;
	}

	public SubLObject $database = Lisp.NIL;

	public SubLObject $test = Lisp.NIL;

	private static final SubLStructDeclNative structDecl = makeStructDeclNative(com.cyc.cycjava.cycl.dictionary.$dictionary_native.class, DICTIONARY, DICTIONARY_P, $list_alt3, $list_alt4, new String[] { "$database", "$test" }, $list_alt5, $list_alt6, PRINT_DICTIONARY);
    }

    public static final SubLFile me = new dictionary();

 public static final String myName = "com.cyc.cycjava.cycl.dictionary";


    // deflexical
    @LispMethod(comment = "deflexical")
    // Definitions
    private static final SubLSymbol $dictionary_high_water_mark$ = makeSymbol("*DICTIONARY-HIGH-WATER-MARK*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $dictionary_low_water_mark$ = makeSymbol("*DICTIONARY-LOW-WATER-MARK*");

    // defconstant
    @LispMethod(comment = "defconstant")
    public static final SubLSymbol $dtp_dictionary$ = makeSymbol("*DTP-DICTIONARY*");

    // defconstant
    @LispMethod(comment = "defconstant")
    private static final SubLSymbol $cfasl_opcode_dictionary$ = makeSymbol("*CFASL-OPCODE-DICTIONARY*");

    // defconstant
    @LispMethod(comment = "defconstant")
    private static final SubLSymbol $cfasl_opcode_legacy_dictionary$ = makeSymbol("*CFASL-OPCODE-LEGACY-DICTIONARY*");

    private static final SubLInteger $int$133 = makeInteger(133);

    static private final SubLList $list3 = list(makeSymbol("DATABASE"), makeSymbol("TEST"));

    static private final SubLList $list4 = list(makeKeyword("DATABASE"), $TEST);

    static private final SubLList $list5 = list(makeSymbol("DICTIONARY-DATABASE"), makeSymbol("DICTIONARY-TEST"));

    static private final SubLList $list6 = list(makeSymbol("_CSETF-DICTIONARY-DATABASE"), makeSymbol("_CSETF-DICTIONARY-TEST"));

    private static final SubLSymbol PRINT_DICTIONARY = makeSymbol("PRINT-DICTIONARY");

    private static final SubLSymbol DICTIONARY_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("DICTIONARY-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLList $list9 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("DICTIONARY-P"));

    private static final SubLSymbol DICTIONARY_DATABASE = makeSymbol("DICTIONARY-DATABASE");

    private static final SubLSymbol _CSETF_DICTIONARY_DATABASE = makeSymbol("_CSETF-DICTIONARY-DATABASE");

    private static final SubLSymbol DICTIONARY_TEST = makeSymbol("DICTIONARY-TEST");

    private static final SubLSymbol _CSETF_DICTIONARY_TEST = makeSymbol("_CSETF-DICTIONARY-TEST");

    private static final SubLString $str16$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");

    private static final SubLSymbol MAKE_DICTIONARY = makeSymbol("MAKE-DICTIONARY");

    private static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_DICTIONARY_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-DICTIONARY-METHOD");

    private static final SubLString $str22$_ = makeString("(");

    private static final SubLString $$$_ = makeString(" ");

    private static final SubLString $str24$_ = makeString(")");

    private static final SubLString $str25$_size_ = makeString(" size=");

    private static final SubLList $list26 = list(makeSymbol("INLINE"), makeSymbol("DICTIONARY-DATABASE-STYLE"), makeSymbol("DICTIONARY-STYLE"), makeSymbol("DICTIONARY-STYLE-ERROR"));

    private static final SubLString $str30$Corrupted_dictionary__unsupported = makeString("Corrupted dictionary; unsupported style ~S.~%");

    private static final SubLList $list31 = list(new SubLObject[] { makeSymbol("INLINE"), makeSymbol("DICTIONARY-EMPTY-ALIST-STYLE"), makeSymbol("DICTIONARY-SIZE-ALIST-STYLE"), makeSymbol("DICTIONARY-LOOKUP-ALIST-STYLE"), makeSymbol("DICTIONARY-LOOKUP-WITHOUT-VALUES-ALIST-STYLE"),
	    makeSymbol("DICTIONARY-ENTER-ALIST-STYLE"), makeSymbol("DICTIONARY-REMOVE-ALIST-STYLE"), makeSymbol("DICTIONARY-OPTIMIZE-ALIST-STYLE"), makeSymbol("MAKE-HASHTABLE-DICTIONARY-FROM-ALIST") });

    private static final SubLList $list32 = list(new SubLObject[] { makeSymbol("INLINE"), makeSymbol("DICTIONARY-EMPTY-HASHTABLE-STYLE"), makeSymbol("DICTIONARY-SIZE-HASHTABLE-STYLE"), makeSymbol("DICTIONARY-LOOKUP-HASHTABLE-STYLE"), makeSymbol("DICTIONARY-LOOKUP-WITHOUT-VALUES-HASHTABLE-STYLE"),
	    makeSymbol("DICTIONARY-ENTER-HASHTABLE-STYLE"), makeSymbol("DICTIONARY-REMOVE-HASHTABLE-STYLE"), makeSymbol("DICTIONARY-OPTIMIZE-HASHTABLE-STYLE"), makeSymbol("MAKE-ALIST-DICTIONARY-FROM-HASHTABLE") });

    static private final SubLList $list35 = list(list(makeSymbol("KEY"), makeSymbol("VALUE"), makeSymbol("DICTIONARY"), makeSymbol("&OPTIONAL"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLSymbol DO_DICTIONARY_CONTENTS = makeSymbol("DO-DICTIONARY-CONTENTS");

    private static final SubLSymbol DICTIONARY_CONTENTS = makeSymbol("DICTIONARY-CONTENTS");

    private static final SubLList $list40 = list(list(makeSymbol("KEY"), makeSymbol("VALUE"), makeSymbol("DICTIONARY"), makeSymbol("&KEY"), makeSymbol("DONE"), list(makeSymbol("PROGRESS-NOTE"), makeString("Mapping .."))), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLList $list41 = list($DONE, makeKeyword("PROGRESS-NOTE"));

    private static final SubLSymbol $ALLOW_OTHER_KEYS = makeKeyword("ALLOW-OTHER-KEYS");

    private static final SubLString $str44$Mapping_dictionary___ = makeString("Mapping ..");

    private static final SubLSymbol $sym45$SO_FAR = makeUninternedSymbol("SO-FAR");

    private static final SubLSymbol $sym46$TOTAL = makeUninternedSymbol("TOTAL");

    private static final SubLList $list48 = list(ZERO_INTEGER);

    private static final SubLSymbol DICTIONARY_LENGTH = makeSymbol("DICTIONARY-LENGTH");

    private static final SubLInteger $int$61 = makeInteger(61);

    private static final SubLSymbol CFASL_INPUT_DICTIONARY = makeSymbol("CFASL-INPUT-DICTIONARY");

    private static final SubLSymbol CFASL_OUTPUT_OBJECT_DICTIONARY_METHOD = makeSymbol("CFASL-OUTPUT-OBJECT-DICTIONARY-METHOD");

    private static final SubLSymbol CFASL_INPUT_LEGACY_DICTIONARY = makeSymbol("CFASL-INPUT-LEGACY-DICTIONARY");

    public static final SubLObject dictionary_print_function_trampoline_alt(SubLObject v_object, SubLObject stream) {
	print_dictionary(v_object, stream, ZERO_INTEGER);
	return NIL;
    }

    public static SubLObject dictionary_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
	print_dictionary(v_object, stream, ZERO_INTEGER);
	return NIL;
    }

    public static final SubLObject dictionary_p_alt(SubLObject v_object) {
	return v_object.getClass() == com.cyc.cycjava.cycl.dictionary.$dictionary_native.class ? ((SubLObject) (T)) : NIL;
    }

    public static SubLObject dictionary_p(final SubLObject v_object) {
	final boolean isDict = ((v_object.getClass() == com.cyc.cycjava.cycl.dictionary.$dictionary_native.class) || v_object.isHashtable()) || (NIL != v_object.toLispObject().typep(DICTIONARY.toLispObject()));
	return isDict ? T : NIL;
    }

    public static final SubLObject dictionary_database_alt(SubLObject v_object) {
	SubLTrampolineFile.checkType(v_object, DICTIONARY_P);
	return v_object.getField2();
    }

    public static SubLObject dictionary_database(final SubLObject v_object) {
	assert NIL != dictionary_p(v_object) : "! dictionary.dictionary_p(v_object) " + "dictionary.dictionary_p error :" + v_object;
	if (v_object.isHashtable())
	    return v_object;
	if (v_object.isCons())
	    return v_object;

	return v_object.getField2();
    }

    public static final SubLObject dictionary_test_alt(SubLObject v_object) {
	SubLTrampolineFile.checkType(v_object, DICTIONARY_P);
	return v_object.getField3();
    }

    public static SubLObject dictionary_test(final SubLObject v_object) {
	assert NIL != dictionary_p(v_object) : "! dictionary.dictionary_p(v_object) " + "dictionary.dictionary_p error :" + v_object;
	if (v_object.isHashtable())
	    return v_object.toHashtable().getTestSymbol();
	if (v_object.isCons())
	    return EQUAL;

	return v_object.getField3();
    }

    public static final SubLObject _csetf_dictionary_database_alt(SubLObject v_object, SubLObject value) {
	SubLTrampolineFile.checkType(v_object, DICTIONARY_P);
	return v_object.setField2(value);
    }

    public static SubLObject _csetf_dictionary_database(final SubLObject v_object, final SubLObject value) {
	assert NIL != dictionary_p(v_object) : "! dictionary.dictionary_p(v_object) " + "dictionary.dictionary_p error :" + v_object;
	return v_object.setField2(value);
    }

    public static final SubLObject _csetf_dictionary_test_alt(SubLObject v_object, SubLObject value) {
	SubLTrampolineFile.checkType(v_object, DICTIONARY_P);
	return v_object.setField3(value);
    }

    public static SubLObject _csetf_dictionary_test(final SubLObject v_object, final SubLObject value) {
	assert NIL != dictionary_p(v_object) : "! dictionary.dictionary_p(v_object) " + "dictionary.dictionary_p error :" + v_object;
	return v_object.setField3(value);
    }

    public static final SubLObject make_dictionary_alt(SubLObject arglist) {
	if (arglist == UNPROVIDED) {
	    arglist = NIL;
	}
	{
	    SubLObject v_new = new com.cyc.cycjava.cycl.dictionary.$dictionary_native();
	    SubLObject next = NIL;
	    for (next = arglist; NIL != next; next = cddr(next)) {
		{
		    SubLObject current_arg = next.first();
		    SubLObject current_value = cadr(next);
		    SubLObject pcase_var = current_arg;
		    if (pcase_var.eql($DATABASE)) {
			_csetf_dictionary_database(v_new, current_value);
		    } else {
			if (pcase_var.eql($TEST)) {
			    _csetf_dictionary_test(v_new, current_value);
			} else {
			    Errors.error($str_alt15$Invalid_slot__S_for_construction_, current_arg);
			}
		    }
		}
	    }
	    return v_new;
	}
    }

    public static SubLObject make_dictionary(SubLObject arglist) {
	if (arglist == UNPROVIDED) {
	    arglist = NIL;
	}
	final SubLObject v_new = new com.cyc.cycjava.cycl.dictionary.$dictionary_native();
	SubLObject next;
	SubLObject current_arg;
	SubLObject current_value;
	SubLObject pcase_var;
	for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
	    current_arg = next.first();
	    current_value = cadr(next);
	    pcase_var = current_arg;
	    if (pcase_var.eql($DATABASE)) {
		_csetf_dictionary_database(v_new, current_value);
	    } else if (pcase_var.eql($TEST)) {
		_csetf_dictionary_test(v_new, current_value);
	    } else {
		Errors.error($str16$Invalid_slot__S_for_construction_, current_arg);
	    }

	}
	return v_new;
    }

    public static SubLObject visit_defstruct_dictionary(final SubLObject obj, final SubLObject visitor_fn) {
	funcall(visitor_fn, obj, $BEGIN, MAKE_DICTIONARY, TWO_INTEGER);
	funcall(visitor_fn, obj, $SLOT, $DATABASE, dictionary_database(obj));
	funcall(visitor_fn, obj, $SLOT, $TEST, dictionary_test(obj));
	funcall(visitor_fn, obj, $END, MAKE_DICTIONARY, TWO_INTEGER);
	return obj;
    }

    public static SubLObject visit_defstruct_object_dictionary_method(final SubLObject obj, final SubLObject visitor_fn) {
	return visit_defstruct_dictionary(obj, visitor_fn);
    }

    public static final SubLObject print_dictionary_alt(SubLObject v_object, SubLObject stream, SubLObject depth) {
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    if (NIL != $print_readably$.getDynamicValue(thread)) {
		print_not_readable(v_object, stream);
	    } else {
		{
		    SubLObject v_object_1 = v_object;
		    SubLObject stream_2 = stream;
		    write_string($str_alt16$__, stream_2, UNPROVIDED, UNPROVIDED);
		    write(type_of(v_object_1), new SubLObject[] { $STREAM, stream_2 });
		    write_char(CHAR_space, stream_2);
		    write_string($str_alt18$_, stream, UNPROVIDED, UNPROVIDED);
		    princ(hash_table_utilities.hash_test_to_symbol(dictionary_test(v_object)), stream);
		    write_string($str_alt19$_, stream, UNPROVIDED, UNPROVIDED);
		    write_string(symbol_name(dictionary_style(v_object)), stream, UNPROVIDED, UNPROVIDED);
		    write_string($str_alt20$_, stream, UNPROVIDED, UNPROVIDED);
		    write_string($str_alt21$_size_, stream, UNPROVIDED, UNPROVIDED);
		    princ(dictionary_length(v_object), stream);
		    write_char(CHAR_space, stream_2);
		    write(pointer(v_object_1), new SubLObject[] { $STREAM, stream_2, $BASE, SIXTEEN_INTEGER });
		    write_char(CHAR_greater, stream_2);
		}
	    }
	    return v_object;
	}
    }

    public static SubLObject print_dictionary(final SubLObject v_object, final SubLObject stream, final SubLObject depth) {
	final SubLThread thread = SubLProcess.currentSubLThread();
	if (NIL != $print_readably$.getDynamicValue(thread)) {
	    print_not_readable(v_object, stream);
	} else {
	    print_macros.print_unreadable_object_preamble(stream, v_object, T, T);
	    write_string($str22$_, stream, UNPROVIDED, UNPROVIDED);
	    princ(hash_table_utilities.hash_test_to_symbol(dictionary_test(v_object)), stream);
	    write_string($$$_, stream, UNPROVIDED, UNPROVIDED);
	    write_string(symbol_name(dictionary_style(v_object)), stream, UNPROVIDED, UNPROVIDED);
	    write_string($str24$_, stream, UNPROVIDED, UNPROVIDED);
	    write_string($str25$_size_, stream, UNPROVIDED, UNPROVIDED);
	    princ(dictionary_length(v_object), stream);
	    print_macros.print_unreadable_object_postamble(stream, v_object, T, T);
	}
	return v_object;
    }

    /**
     * Return the current style of dictionary database DICTIONARY-DATABASE
     *
     * @return type-symbol.
     */
    @LispMethod(comment = "Return the current style of dictionary database DICTIONARY-DATABASE\r\n\r\n@return type-symbol.")
    public static final SubLObject dictionary_database_style_alt(SubLObject dictionary_database) {
	if (dictionary_database.isList()) {
	    return $ALIST;
	} else {
	    if (dictionary_database.isHashtable()) {
		return $HASHTABLE;
	    } else {
		return $UNKNOWN;
	    }
	}
    }

    /**
     * Return the current style of dictionary database DICTIONARY-DATABASE
     *
     * @return type-symbol.
     */
    @LispMethod(comment = "Return the current style of dictionary database DICTIONARY-DATABASE\r\n\r\n@return type-symbol.")
    public static SubLObject dictionary_database_style(final SubLObject dictionary_database) {
	if (dictionary_database.isList()) {
	    return $ALIST;
	}
	if (dictionary_database.isHashtable()) {
	    return $HASHTABLE;
	}
	return $UNKNOWN;
    }

    /**
     * Return the current style of dictionary DICTIONARY
     *
     * @return type-symbol.
     */
    @LispMethod(comment = "Return the current style of dictionary DICTIONARY\r\n\r\n@return type-symbol.")
    public static final SubLObject dictionary_style_alt(SubLObject v_dictionary) {
	return dictionary_database_style(dictionary_database(v_dictionary));
    }

    /**
     * Return the current style of dictionary DICTIONARY
     *
     * @return type-symbol.
     */
    @LispMethod(comment = "Return the current style of dictionary DICTIONARY\r\n\r\n@return type-symbol.")
    public static SubLObject dictionary_style(final SubLObject v_dictionary) {
	return dictionary_database_style(dictionary_database(v_dictionary));
    }

    public static final SubLObject dictionary_style_error_alt(SubLObject v_dictionary) {
	return Errors.error($str_alt26$Corrupted_dictionary__unsupported, dictionary_style(v_dictionary));
    }

    public static SubLObject dictionary_style_error(final SubLObject v_dictionary) {
	return Errors.error($str30$Corrupted_dictionary__unsupported, dictionary_style(v_dictionary));
    }

    public static final SubLObject dictionary_empty_alist_style_alt(SubLObject v_dictionary, SubLObject alist) {
	return sublisp_null(alist);
    }

    public static SubLObject dictionary_empty_alist_style(final SubLObject v_dictionary, final SubLObject alist) {
	return sublisp_null(alist);
    }

    public static final SubLObject dictionary_size_alist_style_alt(SubLObject v_dictionary, SubLObject alist) {
	return length(alist);
    }

    public static SubLObject dictionary_size_alist_style(final SubLObject v_dictionary, final SubLObject alist) {
	return length(alist);
    }

    public static final SubLObject dictionary_lookup_alist_style_alt(SubLObject v_dictionary, SubLObject alist, SubLObject key, SubLObject not_found) {
	{
	    SubLObject test = dictionary_test(v_dictionary);
	    return list_utilities.alist_lookup(alist, key, test, not_found);
	}
    }

    public static SubLObject dictionary_lookup_alist_style(final SubLObject v_dictionary, final SubLObject alist, final SubLObject key, final SubLObject not_found) {
	final SubLObject test = dictionary_test(v_dictionary);
	return list_utilities.alist_lookup(alist, key, test, not_found);
    }

    public static final SubLObject dictionary_lookup_without_values_alist_style_alt(SubLObject v_dictionary, SubLObject alist, SubLObject key, SubLObject not_found) {
	{
	    SubLObject test = dictionary_test(v_dictionary);
	    return list_utilities.alist_lookup_without_values(alist, key, test, not_found);
	}
    }

    public static SubLObject dictionary_lookup_without_values_alist_style(final SubLObject v_dictionary, final SubLObject alist, final SubLObject key, final SubLObject not_found) {
	final SubLObject test = dictionary_test(v_dictionary);
	return list_utilities.alist_lookup_without_values(alist, key, test, not_found);
    }

    public static final SubLObject dictionary_enter_alist_style_alt(SubLObject v_dictionary, SubLObject alist, SubLObject key, SubLObject value) {
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    {
		SubLObject test = dictionary_test(v_dictionary);
		thread.resetMultipleValues();
		{
		    SubLObject new_alist = list_utilities.alist_enter(alist, key, value, test);
		    SubLObject replacement_p = thread.secondMultipleValue();
		    thread.resetMultipleValues();
		    if (NIL == replacement_p) {
			_csetf_dictionary_database(v_dictionary, new_alist);
			if (dictionary_length(v_dictionary).numG($dictionary_high_water_mark$.getGlobalValue())) {
			    make_hashtable_dictionary_from_alist(v_dictionary, new_alist);
			}
		    }
		}
	    }
	    return key;
	}
    }

    public static SubLObject dictionary_enter_alist_style(final SubLObject v_dictionary, final SubLObject alist, final SubLObject key, final SubLObject value) {
	final SubLThread thread = SubLProcess.currentSubLThread();
	final SubLObject test = dictionary_test(v_dictionary);
	thread.resetMultipleValues();
	final SubLObject new_alist = list_utilities.alist_enter(alist, key, value, test);
	final SubLObject replacement_p = thread.secondMultipleValue();
	thread.resetMultipleValues();
	if (NIL == replacement_p) {
	    _csetf_dictionary_database(v_dictionary, new_alist);
	    if (dictionary_length(v_dictionary).numG($dictionary_high_water_mark$.getGlobalValue())) {
		make_hashtable_dictionary_from_alist(v_dictionary, new_alist);
	    }
	}
	return key;
    }

    public static final SubLObject dictionary_remove_alist_style_alt(SubLObject v_dictionary, SubLObject alist, SubLObject key) {
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    {
		SubLObject test = dictionary_test(v_dictionary);
		thread.resetMultipleValues();
		{
		    SubLObject new_alist = list_utilities.alist_delete(alist, key, test);
		    SubLObject removed_p = thread.secondMultipleValue();
		    thread.resetMultipleValues();
		    if (NIL != removed_p) {
			_csetf_dictionary_database(v_dictionary, new_alist);
		    }
		}
	    }
	    return key;
	}
    }

    public static SubLObject dictionary_remove_alist_style(final SubLObject v_dictionary, final SubLObject alist, final SubLObject key) {
	final SubLThread thread = SubLProcess.currentSubLThread();
	final SubLObject test = dictionary_test(v_dictionary);
	thread.resetMultipleValues();
	final SubLObject new_alist = list_utilities.alist_delete(alist, key, test);
	final SubLObject removed_p = thread.secondMultipleValue();
	thread.resetMultipleValues();
	if (NIL != removed_p) {
	    _csetf_dictionary_database(v_dictionary, new_alist);
	}
	return key;
    }

    public static final SubLObject dictionary_optimize_alist_style_alt(SubLObject v_dictionary, SubLObject alist, SubLObject predicate) {
	{
	    SubLObject new_database = list_utilities.alist_optimize(alist, predicate);
	    _csetf_dictionary_database(v_dictionary, new_database);
	}
	return v_dictionary;
    }

    public static SubLObject dictionary_optimize_alist_style(final SubLObject v_dictionary, final SubLObject alist, final SubLObject predicate) {
	final SubLObject new_database = list_utilities.alist_optimize(alist, predicate);
	_csetf_dictionary_database(v_dictionary, new_database);
	return v_dictionary;
    }

    public static final SubLObject make_hashtable_dictionary_from_alist_alt(SubLObject v_dictionary, SubLObject old_database) {
	{
	    SubLObject test = dictionary_test(v_dictionary);
	    SubLObject new_database = list_utilities.alist_to_hash_table(old_database, test);
	    _csetf_dictionary_database(v_dictionary, new_database);
	}
	return v_dictionary;
    }

    public static SubLObject make_hashtable_dictionary_from_alist(final SubLObject v_dictionary, final SubLObject old_database) {
	final SubLObject test = dictionary_test(v_dictionary);
	final SubLObject new_database = list_utilities.alist_to_hash_table(old_database, test);
	_csetf_dictionary_database(v_dictionary, new_database);
	return v_dictionary;
    }

    public static final SubLObject dictionary_empty_hashtable_style_alt(SubLObject v_dictionary, SubLObject hashtable) {
	return hash_table_utilities.hash_table_empty_p(hashtable);
    }

    public static SubLObject dictionary_empty_hashtable_style(final SubLObject v_dictionary, final SubLObject hashtable) {
	return hash_table_utilities.hash_table_empty_p(hashtable);
    }

    public static final SubLObject dictionary_size_hashtable_style_alt(SubLObject v_dictionary, SubLObject hashtable) {
	return hash_table_count(hashtable);
    }

    public static SubLObject dictionary_size_hashtable_style(final SubLObject v_dictionary, final SubLObject hashtable) {
	return hash_table_count(hashtable);
    }

    public static final SubLObject dictionary_lookup_hashtable_style_alt(SubLObject v_dictionary, SubLObject table, SubLObject key, SubLObject not_found) {
	return gethash(key, table, not_found);
    }

    public static SubLObject dictionary_lookup_hashtable_style(final SubLObject v_dictionary, final SubLObject table, final SubLObject key, final SubLObject not_found) {
	return gethash(key, table, not_found);
    }

    public static final SubLObject dictionary_lookup_without_values_hashtable_style_alt(SubLObject v_dictionary, SubLObject table, SubLObject key, SubLObject not_found) {
	return gethash_without_values(key, table, not_found);
    }

    public static SubLObject dictionary_lookup_without_values_hashtable_style(final SubLObject v_dictionary, final SubLObject table, final SubLObject key, final SubLObject not_found) {
	return gethash_without_values(key, table, not_found);
    }

    public static final SubLObject dictionary_enter_hashtable_style_alt(SubLObject v_dictionary, SubLObject table, SubLObject key, SubLObject value) {
	sethash(key, table, value);
	return key;
    }

    public static SubLObject dictionary_enter_hashtable_style(final SubLObject v_dictionary, final SubLObject table, final SubLObject key, final SubLObject value) {
	sethash(key, table, value);
	return key;
    }

    public static final SubLObject dictionary_remove_hashtable_style_alt(SubLObject v_dictionary, SubLObject table, SubLObject key) {
	{
	    SubLObject removed_p = remhash(key, table);
	    if (NIL != removed_p) {
		if (dictionary_length(v_dictionary).numL($dictionary_low_water_mark$.getGlobalValue())) {
		    make_alist_dictionary_from_hashtable(v_dictionary, table);
		}
	    }
	}
	return key;
    }

    public static SubLObject dictionary_remove_hashtable_style(final SubLObject v_dictionary, final SubLObject table, final SubLObject key) {
	final SubLObject removed_p = remhash(key, table);
	if ((NIL != removed_p) && dictionary_length(v_dictionary).numL($dictionary_low_water_mark$.getGlobalValue())) {
	    make_alist_dictionary_from_hashtable(v_dictionary, table);
	}
	return key;
    }

    public static final SubLObject dictionary_optimize_hashtable_style_alt(SubLObject v_dictionary, SubLObject table, SubLObject predicate) {
	return v_dictionary;
    }

    public static SubLObject dictionary_optimize_hashtable_style(final SubLObject v_dictionary, final SubLObject table, final SubLObject predicate) {
	return v_dictionary;
    }

    public static final SubLObject make_alist_dictionary_from_hashtable_alt(SubLObject v_dictionary, SubLObject old_database) {
	{
	    SubLObject new_database = hash_table_utilities.hash_table_to_alist(old_database);
	    _csetf_dictionary_database(v_dictionary, new_database);
	}
	return v_dictionary;
    }

    public static SubLObject make_alist_dictionary_from_hashtable(final SubLObject v_dictionary, final SubLObject old_database) {
	final SubLObject new_database = hash_table_utilities.hash_table_to_alist(old_database);
	_csetf_dictionary_database(v_dictionary, new_database);
	return v_dictionary;
    }

    /**
     * Allocate a new dictionary with TEST as the equality test.
     * Assume that SIZE elements will likely be immediately added.
     *
     * @return dictionary
     */
    @LispMethod(comment = "Allocate a new dictionary with TEST as the equality test.\r\nAssume that SIZE elements will likely be immediately added.\r\n\r\n@return dictionary\nAllocate a new dictionary with TEST as the equality test.\nAssume that SIZE elements will likely be immediately added.")
    public static final SubLObject new_dictionary_alt(SubLObject test, SubLObject size) {
	if (test == UNPROVIDED) {
	    test = symbol_function(EQL);
	}
	if (size == UNPROVIDED) {
	    size = ZERO_INTEGER;
	}
	SubLTrampolineFile.checkType(test, VALID_HASH_TEST_P);
	SubLTrampolineFile.checkType(size, INTEGERP);
	if (test.isSymbol()) {
	    test = symbol_function(test);
	}
	{
	    SubLObject v_dictionary = make_dictionary(UNPROVIDED);
	    clear_dictionary(v_dictionary);
	    _csetf_dictionary_test(v_dictionary, test);
	    if (size.numG($dictionary_high_water_mark$.getGlobalValue())) {
		_csetf_dictionary_database(v_dictionary, make_hash_table(size, test, UNPROVIDED));
	    }
	    return v_dictionary;
	}
    }

    @LispMethod(comment = "Allocate a new dictionary with TEST as the equality test.\r\nAssume that SIZE elements will likely be immediately added.\r\n\r\n@return dictionary\nAllocate a new dictionary with TEST as the equality test.\nAssume that SIZE elements will likely be immediately added.")
    public static SubLObject new_dictionary(SubLObject test, SubLObject size) {
	if (test == UNPROVIDED) {
	    test = symbol_function(EQL);
	}
	if (size == UNPROVIDED) {
	    size = ZERO_INTEGER;
	}
	assert NIL != hash_table_utilities.valid_hash_test_p(test) : "! hash_table_utilities.valid_hash_test_p(test) " + ("hash_table_utilities.valid_hash_test_p(test) " + "CommonSymbols.NIL != hash_table_utilities.valid_hash_test_p(test) ") + test;
	assert NIL != integerp(size) : "! integerp(size) " + ("Types.integerp(size) " + "CommonSymbols.NIL != Types.integerp(size) ") + size;
	if (test.isSymbol()) {
	    test = symbol_function(test);
	}
	final SubLObject v_dictionary = make_dictionary(UNPROVIDED);
	clear_dictionary(v_dictionary);
	_csetf_dictionary_test(v_dictionary, test);
	if (size.numG($dictionary_high_water_mark$.getGlobalValue())) {
	    _csetf_dictionary_database(v_dictionary, make_hash_table(size, test, UNPROVIDED));
	}
	return v_dictionary;
    }

    /**
     * Reset a dictionary to the status of being just allocated.
     *
     * @return dictionary
     */
    @LispMethod(comment = "Reset a dictionary to the status of being just allocated.\r\n\r\n@return dictionary")
    public static final SubLObject clear_dictionary_alt(SubLObject v_dictionary) {
	SubLTrampolineFile.checkType(v_dictionary, DICTIONARY_P);
	_csetf_dictionary_database(v_dictionary, NIL);
	return v_dictionary;
    }

    @LispMethod(comment = "Reset a dictionary to the status of being just allocated.\r\n\r\n@return dictionary")
    public static SubLObject clear_dictionary(final SubLObject v_dictionary) {
	assert NIL != dictionary_p(v_dictionary) : "! dictionary.dictionary_p(v_dictionary) " + ("dictionary.dictionary_p(v_dictionary) " + "CommonSymbols.NIL != dictionary.dictionary_p(v_dictionary) ") + v_dictionary;
	_csetf_dictionary_database(v_dictionary, NIL);
	return v_dictionary;
    }

    /**
     * Return the number of items currently indexed in dictionary DICTIONARY.
     *
     * @return integerp.
     */
    @LispMethod(comment = "Return the number of items currently indexed in dictionary DICTIONARY.\r\n\r\n@return integerp.")
    public static final SubLObject dictionary_length_alt(SubLObject v_dictionary) {
	SubLTrampolineFile.checkType(v_dictionary, DICTIONARY_P);
	{
	    SubLObject database = dictionary_database(v_dictionary);
	    SubLObject pcase_var = dictionary_database_style(database);
	    if (pcase_var.eql($ALIST)) {
		return dictionary_size_alist_style(v_dictionary, database);
	    } else {
		if (pcase_var.eql($HASHTABLE)) {
		    return dictionary_size_hashtable_style(v_dictionary, database);
		} else {
		    return dictionary_style_error(v_dictionary);
		}
	    }
	}
    }

    @LispMethod(comment = "Return the number of items currently indexed in dictionary DICTIONARY.\r\n\r\n@return integerp.")
    public static SubLObject dictionary_length(final SubLObject v_dictionary) {
	assert NIL != dictionary_p(v_dictionary) : "! dictionary.dictionary_p(v_dictionary) " + ("dictionary.dictionary_p(v_dictionary) " + "CommonSymbols.NIL != dictionary.dictionary_p(v_dictionary) ") + v_dictionary;
	final SubLObject database = dictionary_database(v_dictionary);
	final SubLObject pcase_var = dictionary_database_style(database);
	if (pcase_var.eql($ALIST)) {
	    return dictionary_size_alist_style(v_dictionary, database);
	}
	if (pcase_var.eql($HASHTABLE)) {
	    return dictionary_size_hashtable_style(v_dictionary, database);
	}
	return dictionary_style_error(v_dictionary);
    }

    /**
     * Return T iff DICTIONARY is empty.
     */
    @LispMethod(comment = "Return T iff DICTIONARY is empty.")
    public static final SubLObject dictionary_empty_p_alt(SubLObject v_dictionary) {
	SubLTrampolineFile.checkType(v_dictionary, DICTIONARY_P);
	{
	    SubLObject database = dictionary_database(v_dictionary);
	    SubLObject pcase_var = dictionary_database_style(database);
	    if (pcase_var.eql($ALIST)) {
		return dictionary_empty_alist_style(v_dictionary, database);
	    } else {
		if (pcase_var.eql($HASHTABLE)) {
		    return dictionary_empty_hashtable_style(v_dictionary, database);
		} else {
		    return dictionary_style_error(v_dictionary);
		}
	    }
	}
    }

    @LispMethod(comment = "Return T iff DICTIONARY is empty.")
    public static SubLObject dictionary_empty_p(final SubLObject v_dictionary) {
	assert NIL != dictionary_p(v_dictionary) : "! dictionary.dictionary_p(v_dictionary) " + ("dictionary.dictionary_p(v_dictionary) " + "CommonSymbols.NIL != dictionary.dictionary_p(v_dictionary) ") + v_dictionary;
	final SubLObject database = dictionary_database(v_dictionary);
	final SubLObject pcase_var = dictionary_database_style(database);
	if (pcase_var.eql($ALIST)) {
	    return dictionary_empty_alist_style(v_dictionary, database);
	}
	if (pcase_var.eql($HASHTABLE)) {
	    return dictionary_empty_hashtable_style(v_dictionary, database);
	}
	return dictionary_style_error(v_dictionary);
    }

    /**
     * Return T iff OBJECT is a dictionary that is not empty.
     */
    @LispMethod(comment = "Return T iff OBJECT is a dictionary that is not empty.")
    public static final SubLObject non_empty_dictionary_p_alt(SubLObject v_object) {
	return makeBoolean((NIL != dictionary_p(v_object)) && (NIL == dictionary_empty_p(v_object)));
    }

    @LispMethod(comment = "Return T iff OBJECT is a dictionary that is not empty.")
    public static SubLObject non_empty_dictionary_p(final SubLObject v_object) {
	return makeBoolean((NIL != dictionary_p(v_object)) && (NIL == dictionary_empty_p(v_object)));
    }

    /**
     * Return the value mapped from KEY in DICTIONARY.
     * Return the formal <tt>not-found</tt> if there was no entry.
     * Return a second value of T iff KEY was found.
     */
    @LispMethod(comment = "Return the value mapped from KEY in DICTIONARY.\r\nReturn the formal <tt>not-found</tt> if there was no entry.\r\nReturn a second value of T iff KEY was found.\nReturn the value mapped from KEY in DICTIONARY.\nReturn the formal <tt>not-found</tt> if there was no entry.\nReturn a second value of T iff KEY was found.")
    public static final SubLObject dictionary_lookup_alt(SubLObject v_dictionary, SubLObject key, SubLObject not_found) {
	if (not_found == UNPROVIDED) {
	    not_found = NIL;
	}
	SubLTrampolineFile.checkType(v_dictionary, DICTIONARY_P);
	{
	    SubLObject database = dictionary_database(v_dictionary);
	    SubLObject pcase_var = dictionary_database_style(database);
	    if (pcase_var.eql($ALIST)) {
		return dictionary_lookup_alist_style(v_dictionary, database, key, not_found);
	    } else {
		if (pcase_var.eql($HASHTABLE)) {
		    return dictionary_lookup_hashtable_style(v_dictionary, database, key, not_found);
		} else {
		    return dictionary_style_error(v_dictionary);
		}
	    }
	}
    }

    @LispMethod(comment = "Return the value mapped from KEY in DICTIONARY.\r\nReturn the formal <tt>not-found</tt> if there was no entry.\r\nReturn a second value of T iff KEY was found.\nReturn the value mapped from KEY in DICTIONARY.\nReturn the formal <tt>not-found</tt> if there was no entry.\nReturn a second value of T iff KEY was found.")
    public static SubLObject dictionary_lookup(final SubLObject v_dictionary, final SubLObject key, SubLObject not_found) {
	if (not_found == UNPROVIDED) {
	    not_found = NIL;
	}
	assert NIL != dictionary_p(v_dictionary) : "! dictionary.dictionary_p(v_dictionary) " + ("dictionary.dictionary_p(v_dictionary) " + "CommonSymbols.NIL != dictionary.dictionary_p(v_dictionary) ") + v_dictionary;
	final SubLObject database = dictionary_database(v_dictionary);
	final SubLObject pcase_var = dictionary_database_style(database);
	if (pcase_var.eql($ALIST)) {
	    return dictionary_lookup_alist_style(v_dictionary, database, key, not_found);
	}
	if (pcase_var.eql($HASHTABLE)) {
	    return dictionary_lookup_hashtable_style(v_dictionary, database, key, not_found);
	}
	return dictionary_style_error(v_dictionary);
    }

    /**
     * Return the value mapped from KEY in DICTIONARY.
     * Return the formal <tt>not-found</tt> if there was no entry.
     * Unlike DICTIONARY-LOOKUP, only 1 value is returned.
     */
    @LispMethod(comment = "Return the value mapped from KEY in DICTIONARY.\r\nReturn the formal <tt>not-found</tt> if there was no entry.\r\nUnlike DICTIONARY-LOOKUP, only 1 value is returned.\nReturn the value mapped from KEY in DICTIONARY.\nReturn the formal <tt>not-found</tt> if there was no entry.\nUnlike DICTIONARY-LOOKUP, only 1 value is returned.")
    public static final SubLObject dictionary_lookup_without_values_alt(SubLObject v_dictionary, SubLObject key, SubLObject not_found) {
	if (not_found == UNPROVIDED) {
	    not_found = NIL;
	}
	SubLTrampolineFile.checkType(v_dictionary, DICTIONARY_P);
	{
	    SubLObject database = dictionary_database(v_dictionary);
	    SubLObject pcase_var = dictionary_database_style(database);
	    if (pcase_var.eql($ALIST)) {
		return dictionary_lookup_without_values_alist_style(v_dictionary, database, key, not_found);
	    } else {
		if (pcase_var.eql($HASHTABLE)) {
		    return dictionary_lookup_without_values_hashtable_style(v_dictionary, database, key, not_found);
		} else {
		    return dictionary_style_error(v_dictionary);
		}
	    }
	}
    }

    @LispMethod(comment = "Return the value mapped from KEY in DICTIONARY.\r\nReturn the formal <tt>not-found</tt> if there was no entry.\r\nUnlike DICTIONARY-LOOKUP, only 1 value is returned.\nReturn the value mapped from KEY in DICTIONARY.\nReturn the formal <tt>not-found</tt> if there was no entry.\nUnlike DICTIONARY-LOOKUP, only 1 value is returned.")
    public static SubLObject dictionary_lookup_without_values(final SubLObject v_dictionary, final SubLObject key, SubLObject not_found) {
	if (not_found == UNPROVIDED) {
	    not_found = NIL;
	}
	assert NIL != dictionary_p(v_dictionary) : "! dictionary.dictionary_p(v_dictionary) " + ("dictionary.dictionary_p(v_dictionary) " + "CommonSymbols.NIL != dictionary.dictionary_p(v_dictionary) ") + v_dictionary;
	final SubLObject database = dictionary_database(v_dictionary);
	final SubLObject pcase_var = dictionary_database_style(database);
	if (pcase_var.eql($ALIST)) {
	    return dictionary_lookup_without_values_alist_style(v_dictionary, database, key, not_found);
	}
	if (pcase_var.eql($HASHTABLE)) {
	    return dictionary_lookup_without_values_hashtable_style(v_dictionary, database, key, not_found);
	}
	return dictionary_style_error(v_dictionary);
    }

    /**
     * Note that KEY maps to VALUE in DICTIONARY.
     *
     * @return key
     */
    @LispMethod(comment = "Note that KEY maps to VALUE in DICTIONARY.\r\n\r\n@return key")
    public static final SubLObject dictionary_enter_alt(SubLObject v_dictionary, SubLObject key, SubLObject value) {
	SubLTrampolineFile.checkType(v_dictionary, DICTIONARY_P);
	{
	    SubLObject database = dictionary_database(v_dictionary);
	    SubLObject pcase_var = dictionary_database_style(database);
	    if (pcase_var.eql($ALIST)) {
		return dictionary_enter_alist_style(v_dictionary, database, key, value);
	    } else {
		if (pcase_var.eql($HASHTABLE)) {
		    return dictionary_enter_hashtable_style(v_dictionary, database, key, value);
		} else {
		    return dictionary_style_error(v_dictionary);
		}
	    }
	}
    }

    @LispMethod(comment = "Note that KEY maps to VALUE in DICTIONARY.\r\n\r\n@return key")
    public static SubLObject dictionary_enter(final SubLObject v_dictionary, final SubLObject key, final SubLObject value) {
	assert NIL != dictionary_p(v_dictionary) : "! dictionary.dictionary_p(v_dictionary) " + ("dictionary.dictionary_p(v_dictionary) " + "CommonSymbols.NIL != dictionary.dictionary_p(v_dictionary) ") + v_dictionary;
	final SubLObject database = dictionary_database(v_dictionary);
	final SubLObject pcase_var = dictionary_database_style(database);
	if (pcase_var.eql($ALIST)) {
	    return dictionary_enter_alist_style(v_dictionary, database, key, value);
	}
	if (pcase_var.eql($HASHTABLE)) {
	    return dictionary_enter_hashtable_style(v_dictionary, database, key, value);
	}
	return dictionary_style_error(v_dictionary);
    }

    /**
     * Remove any mapping for KEY in DICTIONARY.
     *
     * @return key iff found, else NIL
     */
    @LispMethod(comment = "Remove any mapping for KEY in DICTIONARY.\r\n\r\n@return key iff found, else NIL")
    public static final SubLObject dictionary_remove_alt(SubLObject v_dictionary, SubLObject key) {
	SubLTrampolineFile.checkType(v_dictionary, DICTIONARY_P);
	{
	    SubLObject database = dictionary_database(v_dictionary);
	    SubLObject pcase_var = dictionary_database_style(database);
	    if (pcase_var.eql($ALIST)) {
		return dictionary_remove_alist_style(v_dictionary, database, key);
	    } else {
		if (pcase_var.eql($HASHTABLE)) {
		    return dictionary_remove_hashtable_style(v_dictionary, database, key);
		} else {
		    return dictionary_style_error(v_dictionary);
		}
	    }
	}
    }

    @LispMethod(comment = "Remove any mapping for KEY in DICTIONARY.\r\n\r\n@return key iff found, else NIL")
    public static SubLObject dictionary_remove(final SubLObject v_dictionary, final SubLObject key) {
	assert NIL != dictionary_p(v_dictionary) : "! dictionary.dictionary_p(v_dictionary) " + ("dictionary.dictionary_p(v_dictionary) " + "CommonSymbols.NIL != dictionary.dictionary_p(v_dictionary) ") + v_dictionary;
	final SubLObject database = dictionary_database(v_dictionary);
	final SubLObject pcase_var = dictionary_database_style(database);
	if (pcase_var.eql($ALIST)) {
	    return dictionary_remove_alist_style(v_dictionary, database, key);
	}
	if (pcase_var.eql($HASHTABLE)) {
	    return dictionary_remove_hashtable_style(v_dictionary, database, key);
	}
	return dictionary_style_error(v_dictionary);
    }

    /**
     * Optimize the keys of DICTIONARY for access based on the preference function PREDICATE.
     * PREDICATE is a method with a signature (KEY1 KEY2) and returns T iff
     * KEY1 is preferred over KEY2.
     *
     * @return DICTIONARY
     */
    @LispMethod(comment = "Optimize the keys of DICTIONARY for access based on the preference function PREDICATE.\r\nPREDICATE is a method with a signature (KEY1 KEY2) and returns T iff\r\nKEY1 is preferred over KEY2.\r\n\r\n@return DICTIONARY\nOptimize the keys of DICTIONARY for access based on the preference function PREDICATE.\nPREDICATE is a method with a signature (KEY1 KEY2) and returns T iff\nKEY1 is preferred over KEY2.")
    public static final SubLObject dictionary_optimize_alt(SubLObject v_dictionary, SubLObject predicate) {
	SubLTrampolineFile.checkType(v_dictionary, DICTIONARY_P);
	{
	    SubLObject database = dictionary_database(v_dictionary);
	    SubLObject pcase_var = dictionary_database_style(database);
	    if (pcase_var.eql($ALIST)) {
		return dictionary_optimize_alist_style(v_dictionary, database, predicate);
	    } else {
		if (pcase_var.eql($HASHTABLE)) {
		    return dictionary_optimize_hashtable_style(v_dictionary, database, predicate);
		} else {
		    return dictionary_style_error(v_dictionary);
		}
	    }
	}
    }

    @LispMethod(comment = "Optimize the keys of DICTIONARY for access based on the preference function PREDICATE.\r\nPREDICATE is a method with a signature (KEY1 KEY2) and returns T iff\r\nKEY1 is preferred over KEY2.\r\n\r\n@return DICTIONARY\nOptimize the keys of DICTIONARY for access based on the preference function PREDICATE.\nPREDICATE is a method with a signature (KEY1 KEY2) and returns T iff\nKEY1 is preferred over KEY2.")
    public static SubLObject dictionary_optimize(final SubLObject v_dictionary, final SubLObject predicate) {
	assert NIL != dictionary_p(v_dictionary) : "! dictionary.dictionary_p(v_dictionary) " + ("dictionary.dictionary_p(v_dictionary) " + "CommonSymbols.NIL != dictionary.dictionary_p(v_dictionary) ") + v_dictionary;
	final SubLObject database = dictionary_database(v_dictionary);
	final SubLObject pcase_var = dictionary_database_style(database);
	if (pcase_var.eql($ALIST)) {
	    return dictionary_optimize_alist_style(v_dictionary, database, predicate);
	}
	if (pcase_var.eql($HASHTABLE)) {
	    return dictionary_optimize_hashtable_style(v_dictionary, database, predicate);
	}
	return dictionary_style_error(v_dictionary);
    }

    /**
     * Returns an iterator for DICTIONARY.
     * Values returned are tuples of the form (<key> <value>).
     */
    @LispMethod(comment = "Returns an iterator for DICTIONARY.\r\nValues returned are tuples of the form (<key> <value>).\nReturns an iterator for DICTIONARY.\nValues returned are tuples of the form (<key> <value>).")
    public static final SubLObject new_dictionary_iterator_alt(SubLObject v_dictionary) {
	SubLTrampolineFile.checkType(v_dictionary, DICTIONARY_P);
	{
	    SubLObject database = dictionary_database(v_dictionary);
	    SubLObject pcase_var = dictionary_database_style(database);
	    if (pcase_var.eql($ALIST)) {
		return iteration.new_alist_iterator(database);
	    } else {
		if (pcase_var.eql($HASHTABLE)) {
		    return iteration.new_hash_table_iterator(database);
		} else {
		    return dictionary_style_error(v_dictionary);
		}
	    }
	}
    }

    @LispMethod(comment = "Returns an iterator for DICTIONARY.\r\nValues returned are tuples of the form (<key> <value>).\nReturns an iterator for DICTIONARY.\nValues returned are tuples of the form (<key> <value>).")
    public static SubLObject new_dictionary_iterator(final SubLObject v_dictionary) {
	assert NIL != dictionary_p(v_dictionary) : "! dictionary.dictionary_p(v_dictionary) " + ("dictionary.dictionary_p(v_dictionary) " + "CommonSymbols.NIL != dictionary.dictionary_p(v_dictionary) ") + v_dictionary;
	final SubLObject database = dictionary_database(v_dictionary);
	final SubLObject pcase_var = dictionary_database_style(database);
	if (pcase_var.eql($ALIST)) {
	    return iteration.new_alist_iterator(database);
	}
	if (pcase_var.eql($HASHTABLE)) {
	    return iteration.new_hash_table_iterator(database);
	}
	return dictionary_style_error(v_dictionary);
    }

    /**
     * Iterate over DICTIONARY, binding KEY and VALUE to each key and value indexed.
     * BODY is executed once within the scope of each binding of KEY VALUE.
     * Iteration halts as soon as DONE becomes non-nil.
     */
    @LispMethod(comment = "Iterate over DICTIONARY, binding KEY and VALUE to each key and value indexed.\r\nBODY is executed once within the scope of each binding of KEY VALUE.\r\nIteration halts as soon as DONE becomes non-nil.\nIterate over DICTIONARY, binding KEY and VALUE to each key and value indexed.\nBODY is executed once within the scope of each binding of KEY VALUE.\nIteration halts as soon as DONE becomes non-nil.")
    public static final SubLObject do_dictionary_alt(SubLObject macroform, SubLObject environment) {
	{
	    SubLObject datum = macroform.rest();
	    SubLObject current = datum;
	    destructuring_bind_must_consp(current, datum, $list_alt29);
	    {
		SubLObject temp = current.rest();
		current = current.first();
		{
		    SubLObject key = NIL;
		    SubLObject value = NIL;
		    SubLObject v_dictionary = NIL;
		    destructuring_bind_must_consp(current, datum, $list_alt29);
		    key = current.first();
		    current = current.rest();
		    destructuring_bind_must_consp(current, datum, $list_alt29);
		    value = current.first();
		    current = current.rest();
		    destructuring_bind_must_consp(current, datum, $list_alt29);
		    v_dictionary = current.first();
		    current = current.rest();
		    {
			SubLObject done = (current.isCons()) ? ((SubLObject) (current.first())) : NIL;
			destructuring_bind_must_listp(current, datum, $list_alt29);
			current = current.rest();
			if (NIL == current) {
			    current = temp;
			    {
				SubLObject body = current;
				return listS(DO_DICTIONARY_CONTENTS, list(key, value, list(DICTIONARY_CONTENTS, v_dictionary), $DONE, done), append(body, NIL));
			    }
			} else {
			    cdestructuring_bind_error(datum, $list_alt29);
			}
		    }
		}
	    }
	}
	return NIL;
    }

    @LispMethod(comment = "Iterate over DICTIONARY, binding KEY and VALUE to each key and value indexed.\r\nBODY is executed once within the scope of each binding of KEY VALUE.\r\nIteration halts as soon as DONE becomes non-nil.\nIterate over DICTIONARY, binding KEY and VALUE to each key and value indexed.\nBODY is executed once within the scope of each binding of KEY VALUE.\nIteration halts as soon as DONE becomes non-nil.")
    public static SubLObject do_dictionary(final SubLObject macroform, final SubLObject environment) {
	SubLObject current;
	final SubLObject datum = current = macroform.rest();
	destructuring_bind_must_consp(current, datum, $list35);
	final SubLObject temp = current.rest();
	current = current.first();
	SubLObject key = NIL;
	SubLObject value = NIL;
	SubLObject v_dictionary = NIL;
	destructuring_bind_must_consp(current, datum, $list35);
	key = current.first();
	current = current.rest();
	destructuring_bind_must_consp(current, datum, $list35);
	value = current.first();
	current = current.rest();
	destructuring_bind_must_consp(current, datum, $list35);
	v_dictionary = current.first();
	current = current.rest();
	final SubLObject done = (current.isCons()) ? current.first() : NIL;
	destructuring_bind_must_listp(current, datum, $list35);
	current = current.rest();
	if (NIL == current) {
	    final SubLObject body;
	    current = body = temp;
	    return listS(DO_DICTIONARY_CONTENTS, list(key, value, list(DICTIONARY_CONTENTS, v_dictionary), $DONE, done), append(body, NIL));
	}
	cdestructuring_bind_error(datum, $list35);
	return NIL;
    }

    /**
     * Return the contents of the dictionary.
     *
     * @return (or alist-p hash-table-p)
     */
    @LispMethod(comment = "Return the contents of the dictionary.\r\n\r\n@return (or alist-p hash-table-p)")
    public static final SubLObject dictionary_contents_alt(SubLObject v_dictionary) {
	SubLTrampolineFile.checkType(v_dictionary, DICTIONARY_P);
	return dictionary_database(v_dictionary);
    }

    @LispMethod(comment = "Return the contents of the dictionary.\r\n\r\n@return (or alist-p hash-table-p)")
    public static SubLObject dictionary_contents(final SubLObject v_dictionary) {
	assert NIL != dictionary_p(v_dictionary) : "! dictionary.dictionary_p(v_dictionary) " + ("dictionary.dictionary_p(v_dictionary) " + "CommonSymbols.NIL != dictionary.dictionary_p(v_dictionary) ") + v_dictionary;
	return dictionary_database(v_dictionary);
    }

    /**
    * Return the contents of the dictionary.
    *
    * @return (or alist-p hash-table-p)
    */

    /**
     * Like @xref DO-DICTIONARY, but with percent progress reporting.
     * Iterate over DICTIONARY, binding KEY and VALUE to each key and value indexed.
     * BODY is executed once within the scope of each binding of KEY VALUE.
     * Iteration halts as soon as DONE becomes non-nil.
     */
    @LispMethod(comment = "Like @xref DO-DICTIONARY, but with percent progress reporting.\r\nIterate over DICTIONARY, binding KEY and VALUE to each key and value indexed.\r\nBODY is executed once within the scope of each binding of KEY VALUE.\r\nIteration halts as soon as DONE becomes non-nil.\nLike @xref DO-DICTIONARY, but with percent progress reporting.\nIterate over DICTIONARY, binding KEY and VALUE to each key and value indexed.\nBODY is executed once within the scope of each binding of KEY VALUE.\nIteration halts as soon as DONE becomes non-nil.")
    public static final SubLObject do_dictionary_progress_alt(SubLObject macroform, SubLObject environment) {
	{
	    SubLObject datum = macroform.rest();
	    SubLObject current = datum;
	    destructuring_bind_must_consp(current, datum, $list_alt34);
	    {
		SubLObject temp = current.rest();
		current = current.first();
		{
		    SubLObject key = NIL;
		    SubLObject value = NIL;
		    SubLObject v_dictionary = NIL;
		    destructuring_bind_must_consp(current, datum, $list_alt34);
		    key = current.first();
		    current = current.rest();
		    destructuring_bind_must_consp(current, datum, $list_alt34);
		    value = current.first();
		    current = current.rest();
		    destructuring_bind_must_consp(current, datum, $list_alt34);
		    v_dictionary = current.first();
		    current = current.rest();
		    {
			SubLObject allow_other_keys_p = NIL;
			SubLObject rest = current;
			SubLObject bad = NIL;
			SubLObject current_3 = NIL;
			for (; NIL != rest;) {
			    destructuring_bind_must_consp(rest, datum, $list_alt34);
			    current_3 = rest.first();
			    rest = rest.rest();
			    destructuring_bind_must_consp(rest, datum, $list_alt34);
			    if (NIL == member(current_3, $list_alt35, UNPROVIDED, UNPROVIDED)) {
				bad = T;
			    }
			    if (current_3 == $ALLOW_OTHER_KEYS) {
				allow_other_keys_p = rest.first();
			    }
			    rest = rest.rest();
			}
			if ((NIL != bad) && (NIL == allow_other_keys_p)) {
			    cdestructuring_bind_error(datum, $list_alt34);
			}
			{
			    SubLObject done_tail = property_list_member($DONE, current);
			    SubLObject done = (NIL != done_tail) ? ((SubLObject) (cadr(done_tail))) : NIL;
			    SubLObject progress_note_tail = property_list_member($PROGRESS_NOTE, current);
			    SubLObject progress_note = (NIL != progress_note_tail) ? ((SubLObject) (cadr(progress_note_tail))) : $str_alt38$Mapping_dictionary___;
			    current = temp;
			    {
				SubLObject body = current;
				SubLObject so_far = $sym39$SO_FAR;
				SubLObject total = $sym40$TOTAL;
				return list(CLET, list(bq_cons(so_far, $list_alt42), list(total, list(DICTIONARY_LENGTH, v_dictionary))),
					list(NOTING_PERCENT_PROGRESS, progress_note, listS(DO_DICTIONARY, list(key, value, v_dictionary, done), append(body, list(list(CINC, so_far), list(NOTE_PERCENT_PROGRESS, so_far, total))))));
			    }
			}
		    }
		}
	    }
	}
    }

    /**
     * Like @xref DO-DICTIONARY, but with percent progress reporting.
     * Iterate over DICTIONARY, binding KEY and VALUE to each key and value indexed.
     * BODY is executed once within the scope of each binding of KEY VALUE.
     * Iteration halts as soon as DONE becomes non-nil.
     */
    @LispMethod(comment = "Like @xref DO-DICTIONARY, but with percent progress reporting.\r\nIterate over DICTIONARY, binding KEY and VALUE to each key and value indexed.\r\nBODY is executed once within the scope of each binding of KEY VALUE.\r\nIteration halts as soon as DONE becomes non-nil.\nLike @xref DO-DICTIONARY, but with percent progress reporting.\nIterate over DICTIONARY, binding KEY and VALUE to each key and value indexed.\nBODY is executed once within the scope of each binding of KEY VALUE.\nIteration halts as soon as DONE becomes non-nil.")
    public static SubLObject do_dictionary_progress(final SubLObject macroform, final SubLObject environment) {
	SubLObject current;
	final SubLObject datum = current = macroform.rest();
	destructuring_bind_must_consp(current, datum, $list40);
	final SubLObject temp = current.rest();
	current = current.first();
	SubLObject key = NIL;
	SubLObject value = NIL;
	SubLObject v_dictionary = NIL;
	destructuring_bind_must_consp(current, datum, $list40);
	key = current.first();
	current = current.rest();
	destructuring_bind_must_consp(current, datum, $list40);
	value = current.first();
	current = current.rest();
	destructuring_bind_must_consp(current, datum, $list40);
	v_dictionary = current.first();
	current = current.rest();
	SubLObject allow_other_keys_p = NIL;
	SubLObject rest = current;
	SubLObject bad = NIL;
	SubLObject current_$1 = NIL;
	while (NIL != rest) {
	    destructuring_bind_must_consp(rest, datum, $list40);
	    current_$1 = rest.first();
	    rest = rest.rest();
	    destructuring_bind_must_consp(rest, datum, $list40);
	    if (NIL == member(current_$1, $list41, UNPROVIDED, UNPROVIDED)) {
		bad = T;
	    }
	    if (current_$1 == $ALLOW_OTHER_KEYS) {
		allow_other_keys_p = rest.first();
	    }
	    rest = rest.rest();
	}
	if ((NIL != bad) && (NIL == allow_other_keys_p)) {
	    cdestructuring_bind_error(datum, $list40);
	}
	final SubLObject done_tail = property_list_member($DONE, current);
	final SubLObject done = (NIL != done_tail) ? cadr(done_tail) : NIL;
	final SubLObject progress_note_tail = property_list_member($PROGRESS_NOTE, current);
	final SubLObject progress_note = (NIL != progress_note_tail) ? cadr(progress_note_tail) : $str44$Mapping_dictionary___;
	final SubLObject body;
	current = body = temp;
	final SubLObject so_far = $sym45$SO_FAR;
	final SubLObject total = $sym46$TOTAL;
	return list(CLET, list(bq_cons(so_far, $list48), list(total, list(DICTIONARY_LENGTH, v_dictionary))), list(NOTING_PERCENT_PROGRESS, progress_note, listS(DO_DICTIONARY, list(key, value, v_dictionary, done), append(body, list(list(CINC, so_far), list(NOTE_PERCENT_PROGRESS, so_far, total))))));
    }

    /**
     * Map across the dictionary, calling function on each entry.
     * Function should have a formal parameter list of (key value).
     *
     * @return NIL
     */
    @LispMethod(comment = "Map across the dictionary, calling function on each entry.\r\nFunction should have a formal parameter list of (key value).\r\n\r\n@return NIL\nMap across the dictionary, calling function on each entry.\nFunction should have a formal parameter list of (key value).")
    public static final SubLObject mapdictionary_alt(SubLObject v_dictionary, SubLObject function) {
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    SubLTrampolineFile.checkType(v_dictionary, DICTIONARY_P);
	    SubLTrampolineFile.checkType(function, FUNCTION_SPEC_P);
	    {
		SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary_contents(v_dictionary));
		while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)) {
		    thread.resetMultipleValues();
		    {
			SubLObject key = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
			SubLObject value = thread.secondMultipleValue();
			thread.resetMultipleValues();
			funcall(function, key, value);
			iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state);
		    }
		}
		dictionary_contents.do_dictionary_contents_finalize(iteration_state);
	    }
	    return NIL;
	}
    }

    @LispMethod(comment = "Map across the dictionary, calling function on each entry.\r\nFunction should have a formal parameter list of (key value).\r\n\r\n@return NIL\nMap across the dictionary, calling function on each entry.\nFunction should have a formal parameter list of (key value).")
    public static SubLObject mapdictionary(final SubLObject v_dictionary, final SubLObject function) {
	final SubLThread thread = SubLProcess.currentSubLThread();
	assert NIL != dictionary_p(v_dictionary) : "! dictionary.dictionary_p(v_dictionary) " + ("dictionary.dictionary_p(v_dictionary) " + "CommonSymbols.NIL != dictionary.dictionary_p(v_dictionary) ") + v_dictionary;
	assert NIL != function_spec_p(function) : "! function_spec_p(function) " + ("Types.function_spec_p(function) " + "CommonSymbols.NIL != Types.function_spec_p(function) ") + function;
	SubLObject iteration_state;
	for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary_contents(v_dictionary)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
	    thread.resetMultipleValues();
	    final SubLObject key = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
	    final SubLObject value = thread.secondMultipleValue();
	    thread.resetMultipleValues();
	    funcall(function, key, value);
	}
	dictionary_contents.do_dictionary_contents_finalize(iteration_state);
	return NIL;
    }

    /**
    * Map across the dictionary, calling function on each entry.
    * Function should have a formal parameter list of (key value).
    *
    * @return NIL
    */

    /**
     * Map across the dictionary, calling function with additional parameter
     * args on each of the entry pairs.
     * Function should have a formal parameter list of (key val args).
     *
     * @return NIL
     */
    @LispMethod(comment = "Map across the dictionary, calling function with additional parameter\r\nargs on each of the entry pairs.\r\nFunction should have a formal parameter list of (key val args).\r\n\r\n@return NIL\nMap across the dictionary, calling function with additional parameter\nargs on each of the entry pairs.\nFunction should have a formal parameter list of (key val args).")
    public static final SubLObject mapdictionary_parameterized_alt(SubLObject v_dictionary, SubLObject function, SubLObject args) {
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    SubLTrampolineFile.checkType(v_dictionary, DICTIONARY_P);
	    SubLTrampolineFile.checkType(function, FUNCTION_SPEC_P);
	    {
		SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary_contents(v_dictionary));
		while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)) {
		    thread.resetMultipleValues();
		    {
			SubLObject key = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
			SubLObject value = thread.secondMultipleValue();
			thread.resetMultipleValues();
			funcall(function, key, value, args);
			iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state);
		    }
		}
		dictionary_contents.do_dictionary_contents_finalize(iteration_state);
	    }
	    return NIL;
	}
    }

    @LispMethod(comment = "Map across the dictionary, calling function with additional parameter\r\nargs on each of the entry pairs.\r\nFunction should have a formal parameter list of (key val args).\r\n\r\n@return NIL\nMap across the dictionary, calling function with additional parameter\nargs on each of the entry pairs.\nFunction should have a formal parameter list of (key val args).")
    public static SubLObject mapdictionary_parameterized(final SubLObject v_dictionary, final SubLObject function, final SubLObject args) {
	final SubLThread thread = SubLProcess.currentSubLThread();
	assert NIL != dictionary_p(v_dictionary) : "! dictionary.dictionary_p(v_dictionary) " + ("dictionary.dictionary_p(v_dictionary) " + "CommonSymbols.NIL != dictionary.dictionary_p(v_dictionary) ") + v_dictionary;
	assert NIL != function_spec_p(function) : "! function_spec_p(function) " + ("Types.function_spec_p(function) " + "CommonSymbols.NIL != Types.function_spec_p(function) ") + function;
	SubLObject iteration_state;
	for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary_contents(v_dictionary)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
	    thread.resetMultipleValues();
	    final SubLObject key = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
	    final SubLObject value = thread.secondMultipleValue();
	    thread.resetMultipleValues();
	    funcall(function, key, value, args);
	}
	dictionary_contents.do_dictionary_contents_finalize(iteration_state);
	return NIL;
    }

    /**
    * Map across the dictionary, calling function with additional parameter
    * args on each of the entry pairs.
    * Function should have a formal parameter list of (key val args).
    *
    * @return NIL
    */

    public static final SubLObject cfasl_output_object_dictionary_method_alt(SubLObject v_object, SubLObject stream) {
	return cfasl_output_dictionary(v_object, stream);
    }

    public static SubLObject cfasl_output_object_dictionary_method(final SubLObject v_object, final SubLObject stream) {
	return cfasl_output_dictionary(v_object, stream);
    }

    public static final SubLObject cfasl_output_dictionary_alt(SubLObject v_object, SubLObject stream) {
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    cfasl_raw_write_byte($cfasl_opcode_dictionary$.getGlobalValue(), stream);
	    {
		SubLObject test = hash_table_utilities.hash_test_to_symbol(dictionary_test(v_object));
		SubLObject size = dictionary_length(v_object);
		cfasl_output(test, stream);
		cfasl_output(size, stream);
		{
		    SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary_contents(v_object));
		    while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)) {
			thread.resetMultipleValues();
			{
			    SubLObject key = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
			    SubLObject value = thread.secondMultipleValue();
			    thread.resetMultipleValues();
			    cfasl_output(key, stream);
			    cfasl_output(value, stream);
			    iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state);
			}
		    }
		    dictionary_contents.do_dictionary_contents_finalize(iteration_state);
		}
	    }
	    return v_object;
	}
    }

    public static SubLObject cfasl_output_dictionary(final SubLObject v_object, final SubLObject stream) {
	final SubLThread thread = SubLProcess.currentSubLThread();
	cfasl_raw_write_byte($cfasl_opcode_dictionary$.getGlobalValue(), stream);
	final SubLObject test = hash_table_utilities.hash_test_to_symbol(dictionary_test(v_object));
	final SubLObject size = dictionary_length(v_object);
	cfasl_output(test, stream);
	cfasl_output(size, stream);
	SubLObject iteration_state;
	for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary_contents(v_object)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
	    thread.resetMultipleValues();
	    final SubLObject key = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
	    final SubLObject value = thread.secondMultipleValue();
	    thread.resetMultipleValues();
	    cfasl_output(key, stream);
	    cfasl_output(value, stream);
	}
	dictionary_contents.do_dictionary_contents_finalize(iteration_state);
	return v_object;
    }

    public static final SubLObject cfasl_input_dictionary_alt(SubLObject stream) {
	{
	    SubLObject test = cfasl_input(stream, UNPROVIDED, UNPROVIDED);
	    SubLObject size = cfasl_input(stream, UNPROVIDED, UNPROVIDED);
	    SubLObject v_dictionary = NIL;
	    {
		SubLObject pcase_var = test;
		if (((pcase_var.eql(EQ) || pcase_var.eql(EQL)) || pcase_var.eql(EQUAL)) || pcase_var.eql(EQUALP)) {
		    test = symbol_function(test);
		}
	    }
	    v_dictionary = new_dictionary(test, size);
	    {
		SubLObject pcase_var = dictionary_style(v_dictionary);
		if (pcase_var.eql($ALIST)) {
		    cfasl_input_dictionary_content_alist_style(v_dictionary, size, stream);
		} else {
		    if (pcase_var.eql($HASHTABLE)) {
			cfasl_input_dictionary_content_hashtable_style(v_dictionary, size, stream);
		    } else {
			cfasl_input_dictionary_content_logically(v_dictionary, size, stream);
		    }
		}
	    }
	    return v_dictionary;
	}
    }

    public static SubLObject cfasl_input_dictionary(final SubLObject stream) {
	SubLObject test = cfasl_input(stream, UNPROVIDED, UNPROVIDED);
	final SubLObject size = cfasl_input(stream, UNPROVIDED, UNPROVIDED);
	SubLObject v_dictionary = NIL;
	SubLObject pcase_var = test;
	if (((pcase_var.eql(EQ) || pcase_var.eql(EQL)) || pcase_var.eql(EQUAL)) || pcase_var.eql(EQUALP)) {
	    test = symbol_function(test);
	}
	v_dictionary = new_dictionary(test, size);
	pcase_var = dictionary_style(v_dictionary);
	if (pcase_var.eql($ALIST)) {
	    cfasl_input_dictionary_content_alist_style(v_dictionary, size, stream);
	} else if (pcase_var.eql($HASHTABLE)) {
	    cfasl_input_dictionary_content_hashtable_style(v_dictionary, size, stream);
	} else {
	    cfasl_input_dictionary_content_logically(v_dictionary, size, stream);
	}

	return v_dictionary;
    }

    public static final SubLObject cfasl_input_dictionary_content_alist_style_alt(SubLObject v_dictionary, SubLObject size, SubLObject stream) {
	{
	    SubLObject database = NIL;
	    database = make_list(size, NIL);
	    {
		SubLObject cons = NIL;
		for (cons = database; !cons.isAtom(); cons = cons.rest()) {
		    {
			SubLObject key = cfasl_input(stream, UNPROVIDED, UNPROVIDED);
			SubLObject value = cfasl_input(stream, UNPROVIDED, UNPROVIDED);
			SubLObject association = NIL;
			association = cons(key, value);
			rplaca(cons, association);
		    }
		}
	    }
	    _csetf_dictionary_database(v_dictionary, database);
	}
	return v_dictionary;
    }

    public static SubLObject cfasl_input_dictionary_content_alist_style(final SubLObject v_dictionary, final SubLObject size, final SubLObject stream) {
	SubLObject database = NIL;
	database = make_list(size, NIL);
	SubLObject cons;
	SubLObject key;
	SubLObject value;
	SubLObject association;
	for (cons = NIL, cons = database; !cons.isAtom(); cons = cons.rest()) {
	    key = cfasl_input(stream, UNPROVIDED, UNPROVIDED);
	    value = cfasl_input(stream, UNPROVIDED, UNPROVIDED);
	    association = NIL;
	    association = cons(key, value);
	    rplaca(cons, association);
	}
	_csetf_dictionary_database(v_dictionary, database);
	return v_dictionary;
    }

    public static final SubLObject cfasl_input_dictionary_content_hashtable_style_alt(SubLObject v_dictionary, SubLObject size, SubLObject stream) {
	return cfasl_input_dictionary_content_logically(v_dictionary, size, stream);
    }

    public static SubLObject cfasl_input_dictionary_content_hashtable_style(final SubLObject v_dictionary, final SubLObject size, final SubLObject stream) {
	return cfasl_input_dictionary_content_logically(v_dictionary, size, stream);
    }

    public static final SubLObject cfasl_input_dictionary_content_logically_alt(SubLObject v_dictionary, SubLObject size, SubLObject stream) {
	{
	    SubLObject i = NIL;
	    for (i = ZERO_INTEGER; i.numL(size); i = add(i, ONE_INTEGER)) {
		{
		    SubLObject key = cfasl_input(stream, UNPROVIDED, UNPROVIDED);
		    SubLObject value = cfasl_input(stream, UNPROVIDED, UNPROVIDED);
		    dictionary_enter(v_dictionary, key, value);
		}
	    }
	}
	return v_dictionary;
    }

    public static SubLObject cfasl_input_dictionary_content_logically(final SubLObject v_dictionary, final SubLObject size, final SubLObject stream) {
	SubLObject i;
	SubLObject key;
	SubLObject value;
	for (i = NIL, i = ZERO_INTEGER; i.numL(size); i = add(i, ONE_INTEGER)) {
	    key = cfasl_input(stream, UNPROVIDED, UNPROVIDED);
	    value = cfasl_input(stream, UNPROVIDED, UNPROVIDED);
	    dictionary_enter(v_dictionary, key, value);
	}
	return v_dictionary;
    }

    public static final SubLObject cfasl_input_legacy_dictionary_alt(SubLObject stream) {
	{
	    SubLObject v_dictionary = NIL;
	    v_dictionary = new_dictionary(UNPROVIDED, UNPROVIDED);
	    cfasl_input_object(stream);
	    _csetf_dictionary_database(v_dictionary, cfasl_input_object(stream));
	    _csetf_dictionary_test(v_dictionary, symbol_function(cfasl_input_object(stream)));
	    return v_dictionary;
	}
    }

    public static SubLObject cfasl_input_legacy_dictionary(final SubLObject stream) {
	SubLObject v_dictionary = NIL;
	v_dictionary = new_dictionary(UNPROVIDED, UNPROVIDED);
	cfasl_input_object(stream);
	_csetf_dictionary_database(v_dictionary, cfasl_input_object(stream));
	_csetf_dictionary_test(v_dictionary, symbol_function(cfasl_input_object(stream)));
	return v_dictionary;
    }

    /**
     *
     *
     * @param DICT
     * 		dictionary; @return list; a list of all keys of DICT
     * @unknown aldag
     */
    @LispMethod(comment = "@param DICT\r\n\t\tdictionary; @return list; a list of all keys of DICT\r\n@unknown aldag")
    public static final SubLObject dictionary_keys_alt(SubLObject v_dictionary) {
	SubLTrampolineFile.checkType(v_dictionary, DICTIONARY_P);
	{
	    SubLObject database = dictionary_database(v_dictionary);
	    SubLObject pcase_var = dictionary_database_style(database);
	    if (pcase_var.eql($ALIST)) {
		return list_utilities.alist_keys(database);
	    } else {
		if (pcase_var.eql($HASHTABLE)) {
		    return hash_table_utilities.hash_table_keys(database);
		} else {
		    return dictionary_style_error(v_dictionary);
		}
	    }
	}
    }

    /**
     *
     *
     * @param DICT
     * 		dictionary; @return list; a list of all keys of DICT
     * @unknown aldag
     */
    @LispMethod(comment = "@param DICT\r\n\t\tdictionary; @return list; a list of all keys of DICT\r\n@unknown aldag")
    public static SubLObject dictionary_keys(final SubLObject v_dictionary) {
	assert NIL != dictionary_p(v_dictionary) : "! dictionary.dictionary_p(v_dictionary) " + ("dictionary.dictionary_p(v_dictionary) " + "CommonSymbols.NIL != dictionary.dictionary_p(v_dictionary) ") + v_dictionary;
	final SubLObject database = dictionary_database(v_dictionary);
	final SubLObject pcase_var = dictionary_database_style(database);
	if (pcase_var.eql($ALIST)) {
	    return list_utilities.alist_keys(database);
	}
	if (pcase_var.eql($HASHTABLE)) {
	    return hash_table_utilities.hash_table_keys(database);
	}
	return dictionary_style_error(v_dictionary);
    }

    /**
     *
     *
     * @param DICTIONARY
     * 		dictionary; @return list; a list of all values of DICTIONARY
     * @unknown aldag
     */
    @LispMethod(comment = "@param DICTIONARY\r\n\t\tdictionary; @return list; a list of all values of DICTIONARY\r\n@unknown aldag")
    public static final SubLObject dictionary_values_alt(SubLObject v_dictionary) {
	SubLTrampolineFile.checkType(v_dictionary, DICTIONARY_P);
	{
	    SubLObject database = dictionary_database(v_dictionary);
	    SubLObject pcase_var = dictionary_database_style(database);
	    if (pcase_var.eql($ALIST)) {
		return list_utilities.alist_values(database);
	    } else {
		if (pcase_var.eql($HASHTABLE)) {
		    return hash_table_utilities.hash_table_values(database);
		} else {
		    return dictionary_style_error(v_dictionary);
		}
	    }
	}
    }

    /**
     *
     *
     * @param DICTIONARY
     * 		dictionary; @return list; a list of all values of DICTIONARY
     * @unknown aldag
     */
    @LispMethod(comment = "@param DICTIONARY\r\n\t\tdictionary; @return list; a list of all values of DICTIONARY\r\n@unknown aldag")
    public static SubLObject dictionary_values(final SubLObject v_dictionary) {
	assert NIL != dictionary_p(v_dictionary) : "! dictionary.dictionary_p(v_dictionary) " + ("dictionary.dictionary_p(v_dictionary) " + "CommonSymbols.NIL != dictionary.dictionary_p(v_dictionary) ") + v_dictionary;
	final SubLObject database = dictionary_database(v_dictionary);
	final SubLObject pcase_var = dictionary_database_style(database);
	if (pcase_var.eql($ALIST)) {
	    return list_utilities.alist_values(database);
	}
	if (pcase_var.eql($HASHTABLE)) {
	    return hash_table_utilities.hash_table_values(database);
	}
	return dictionary_style_error(v_dictionary);
    }

    /**
     * Rehashes a dictionary if its contents is hashtable style
     *
     * @unknown pace
     */
    @LispMethod(comment = "Rehashes a dictionary if its contents is hashtable style\r\n\r\n@unknown pace")
    public static final SubLObject dictionary_rebuild_alt(SubLObject v_dictionary) {
	SubLTrampolineFile.checkType(v_dictionary, DICTIONARY_P);
	{
	    SubLObject database = dictionary_database(v_dictionary);
	    SubLObject pcase_var = dictionary_database_style(database);
	    if (pcase_var.eql($ALIST)) {
		return v_dictionary;
	    } else {
		if (pcase_var.eql($HASHTABLE)) {
		    hash_table_utilities.rehash(database);
		    return v_dictionary;
		} else {
		    return dictionary_style_error(v_dictionary);
		}
	    }
	}
    }

    @LispMethod(comment = "Rehashes a dictionary if its contents is hashtable style\r\n\r\n@unknown pace")
    public static SubLObject dictionary_rebuild(final SubLObject v_dictionary) {
	assert NIL != dictionary_p(v_dictionary) : "! dictionary.dictionary_p(v_dictionary) " + ("dictionary.dictionary_p(v_dictionary) " + "CommonSymbols.NIL != dictionary.dictionary_p(v_dictionary) ") + v_dictionary;
	final SubLObject database = dictionary_database(v_dictionary);
	final SubLObject pcase_var = dictionary_database_style(database);
	if (pcase_var.eql($ALIST)) {
	    return v_dictionary;
	}
	if (pcase_var.eql($HASHTABLE)) {
	    hash_table_utilities.rehash(database);
	    return v_dictionary;
	}
	return dictionary_style_error(v_dictionary);
    }

    /**
    * Rehashes a dictionary if its contents is hashtable style
    *
    * @unknown pace
    */

    public static SubLObject declare_dictionary_file() {
	declareFunction("dictionary_print_function_trampoline", "DICTIONARY-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
	declareFunction("dictionary_p", "DICTIONARY-P", 1, 0, false);
	new dictionary.$dictionary_p$UnaryFunction();
	declareFunction("dictionary_database", "DICTIONARY-DATABASE", 1, 0, false);
	declareFunction("dictionary_test", "DICTIONARY-TEST", 1, 0, false);
	declareFunction("_csetf_dictionary_database", "_CSETF-DICTIONARY-DATABASE", 2, 0, false);
	declareFunction("_csetf_dictionary_test", "_CSETF-DICTIONARY-TEST", 2, 0, false);
	declareFunction("make_dictionary", "MAKE-DICTIONARY", 0, 1, false);
	declareFunction("visit_defstruct_dictionary", "VISIT-DEFSTRUCT-DICTIONARY", 2, 0, false);
	declareFunction("visit_defstruct_object_dictionary_method", "VISIT-DEFSTRUCT-OBJECT-DICTIONARY-METHOD", 2, 0, false);
	declareFunction("print_dictionary", "PRINT-DICTIONARY", 3, 0, false);
	declareFunction("dictionary_database_style", "DICTIONARY-DATABASE-STYLE", 1, 0, false);
	declareFunction("dictionary_style", "DICTIONARY-STYLE", 1, 0, false);
	declareFunction("dictionary_style_error", "DICTIONARY-STYLE-ERROR", 1, 0, false);
	declareFunction("dictionary_empty_alist_style", "DICTIONARY-EMPTY-ALIST-STYLE", 2, 0, false);
	declareFunction("dictionary_size_alist_style", "DICTIONARY-SIZE-ALIST-STYLE", 2, 0, false);
	declareFunction("dictionary_lookup_alist_style", "DICTIONARY-LOOKUP-ALIST-STYLE", 4, 0, false);
	declareFunction("dictionary_lookup_without_values_alist_style", "DICTIONARY-LOOKUP-WITHOUT-VALUES-ALIST-STYLE", 4, 0, false);
	declareFunction("dictionary_enter_alist_style", "DICTIONARY-ENTER-ALIST-STYLE", 4, 0, false);
	declareFunction("dictionary_remove_alist_style", "DICTIONARY-REMOVE-ALIST-STYLE", 3, 0, false);
	declareFunction("dictionary_optimize_alist_style", "DICTIONARY-OPTIMIZE-ALIST-STYLE", 3, 0, false);
	declareFunction("make_hashtable_dictionary_from_alist", "MAKE-HASHTABLE-DICTIONARY-FROM-ALIST", 2, 0, false);
	declareFunction("dictionary_empty_hashtable_style", "DICTIONARY-EMPTY-HASHTABLE-STYLE", 2, 0, false);
	declareFunction("dictionary_size_hashtable_style", "DICTIONARY-SIZE-HASHTABLE-STYLE", 2, 0, false);
	declareFunction("dictionary_lookup_hashtable_style", "DICTIONARY-LOOKUP-HASHTABLE-STYLE", 4, 0, false);
	declareFunction("dictionary_lookup_without_values_hashtable_style", "DICTIONARY-LOOKUP-WITHOUT-VALUES-HASHTABLE-STYLE", 4, 0, false);
	declareFunction("dictionary_enter_hashtable_style", "DICTIONARY-ENTER-HASHTABLE-STYLE", 4, 0, false);
	declareFunction("dictionary_remove_hashtable_style", "DICTIONARY-REMOVE-HASHTABLE-STYLE", 3, 0, false);
	declareFunction("dictionary_optimize_hashtable_style", "DICTIONARY-OPTIMIZE-HASHTABLE-STYLE", 3, 0, false);
	declareFunction("make_alist_dictionary_from_hashtable", "MAKE-ALIST-DICTIONARY-FROM-HASHTABLE", 2, 0, false);
	declareFunction("new_dictionary", "NEW-DICTIONARY", 0, 2, false);
	declareFunction("clear_dictionary", "CLEAR-DICTIONARY", 1, 0, false);
	declareFunction("dictionary_length", "DICTIONARY-LENGTH", 1, 0, false);
	declareFunction("dictionary_empty_p", "DICTIONARY-EMPTY-P", 1, 0, false);
	declareFunction("non_empty_dictionary_p", "NON-EMPTY-DICTIONARY-P", 1, 0, false);
	declareFunction("dictionary_lookup", "DICTIONARY-LOOKUP", 2, 1, false);
	declareFunction("dictionary_lookup_without_values", "DICTIONARY-LOOKUP-WITHOUT-VALUES", 2, 1, false);
	declareFunction("dictionary_enter", "DICTIONARY-ENTER", 3, 0, false);
	declareFunction("dictionary_remove", "DICTIONARY-REMOVE", 2, 0, false);
	declareFunction("dictionary_optimize", "DICTIONARY-OPTIMIZE", 2, 0, false);
	declareFunction("new_dictionary_iterator", "NEW-DICTIONARY-ITERATOR", 1, 0, false);
	declareMacro("do_dictionary", "DO-DICTIONARY");
	declareFunction("dictionary_contents", "DICTIONARY-CONTENTS", 1, 0, false);
	declareMacro("do_dictionary_progress", "DO-DICTIONARY-PROGRESS");
	declareFunction("mapdictionary", "MAPDICTIONARY", 2, 0, false);
	declareFunction("mapdictionary_parameterized", "MAPDICTIONARY-PARAMETERIZED", 3, 0, false);
	declareFunction("cfasl_output_object_dictionary_method", "CFASL-OUTPUT-OBJECT-DICTIONARY-METHOD", 2, 0, false);
	declareFunction("cfasl_output_dictionary", "CFASL-OUTPUT-DICTIONARY", 2, 0, false);
	declareFunction("cfasl_input_dictionary", "CFASL-INPUT-DICTIONARY", 1, 0, false);
	new dictionary.$cfasl_input_dictionary$UnaryFunction();
	declareFunction("cfasl_input_dictionary_content_alist_style", "CFASL-INPUT-DICTIONARY-CONTENT-ALIST-STYLE", 3, 0, false);
	declareFunction("cfasl_input_dictionary_content_hashtable_style", "CFASL-INPUT-DICTIONARY-CONTENT-HASHTABLE-STYLE", 3, 0, false);
	declareFunction("cfasl_input_dictionary_content_logically", "CFASL-INPUT-DICTIONARY-CONTENT-LOGICALLY", 3, 0, false);
	declareFunction("cfasl_input_legacy_dictionary", "CFASL-INPUT-LEGACY-DICTIONARY", 1, 0, false);
	declareFunction("dictionary_keys", "DICTIONARY-KEYS", 1, 0, false);
	declareFunction("dictionary_values", "DICTIONARY-VALUES", 1, 0, false);
	declareFunction("dictionary_rebuild", "DICTIONARY-REBUILD", 1, 0, false);
	return NIL;
    }

    public static SubLObject init_dictionary_file() {
	deflexical("*DICTIONARY-HIGH-WATER-MARK*", TWELVE_INTEGER);
	deflexical("*DICTIONARY-LOW-WATER-MARK*", EIGHT_INTEGER);
	defconstant("*DTP-DICTIONARY*", DICTIONARY);
	defconstant("*CFASL-OPCODE-DICTIONARY*", $int$61);
	defconstant("*CFASL-OPCODE-LEGACY-DICTIONARY*", $int$64);
	return NIL;
    }

    public static SubLObject setup_dictionary_file() {
	register_method($print_object_method_table$.getGlobalValue(), $dtp_dictionary$.getGlobalValue(), symbol_function(DICTIONARY_PRINT_FUNCTION_TRAMPOLINE));
	SubLSpecialOperatorDeclarations.proclaim($list9);
	def_csetf(DICTIONARY_DATABASE, _CSETF_DICTIONARY_DATABASE);
	def_csetf(DICTIONARY_TEST, _CSETF_DICTIONARY_TEST);
	identity(DICTIONARY);
	register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_dictionary$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_DICTIONARY_METHOD));
	SubLSpecialOperatorDeclarations.proclaim($list26);
	SubLSpecialOperatorDeclarations.proclaim($list31);
	SubLSpecialOperatorDeclarations.proclaim($list32);
	register_macro_helper(DICTIONARY_CONTENTS, DO_DICTIONARY);
	register_cfasl_input_function($cfasl_opcode_dictionary$.getGlobalValue(), CFASL_INPUT_DICTIONARY);
	register_method($cfasl_output_object_method_table$.getGlobalValue(), $dtp_dictionary$.getGlobalValue(), symbol_function(CFASL_OUTPUT_OBJECT_DICTIONARY_METHOD));
	register_cfasl_input_function($cfasl_opcode_legacy_dictionary$.getGlobalValue(), CFASL_INPUT_LEGACY_DICTIONARY);
	return NIL;
    }

    @Override
    public void declareFunctions() {
	declare_dictionary_file();
    }

    @Override
    public void initializeVariables() {
	init_dictionary_file();
    }

    @Override
    public void runTopLevelForms() {
	setup_dictionary_file();
    }

    

    public static final class $dictionary_p$UnaryFunction extends UnaryFunction {
	public $dictionary_p$UnaryFunction() {
	    super(extractFunctionNamed("DICTIONARY-P"));
	}

	@Override
	public SubLObject processItem(final SubLObject arg1) {
	    return dictionary_p(arg1);
	}
    }

    public static final class $cfasl_input_dictionary$UnaryFunction extends UnaryFunction {
	public $cfasl_input_dictionary$UnaryFunction() {
	    super(extractFunctionNamed("CFASL-INPUT-DICTIONARY"));
	}

	@Override
	public SubLObject processItem(final SubLObject arg1) {
	    return cfasl_input_dictionary(arg1);
	}
    }

    static private final SubLList $list_alt3 = list(makeSymbol("DATABASE"), makeSymbol("TEST"));

    static private final SubLList $list_alt4 = list(makeKeyword("DATABASE"), $TEST);

    static private final SubLList $list_alt5 = list(makeSymbol("DICTIONARY-DATABASE"), makeSymbol("DICTIONARY-TEST"));

    static private final SubLList $list_alt6 = list(makeSymbol("_CSETF-DICTIONARY-DATABASE"), makeSymbol("_CSETF-DICTIONARY-TEST"));

    static private final SubLString $str_alt15$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");

    static private final SubLString $str_alt16$__ = makeString("#<");

    static private final SubLString $str_alt18$_ = makeString("(");

    static private final SubLString $str_alt19$_ = makeString(" ");

    static private final SubLString $str_alt20$_ = makeString(")");

    static private final SubLString $str_alt21$_size_ = makeString(" size=");

    static private final SubLString $str_alt26$Corrupted_dictionary__unsupported = makeString("Corrupted dictionary; unsupported style ~S.~%");

    static private final SubLList $list_alt29 = list(list(makeSymbol("KEY"), makeSymbol("VALUE"), makeSymbol("DICTIONARY"), makeSymbol("&OPTIONAL"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list_alt34 = list(list(makeSymbol("KEY"), makeSymbol("VALUE"), makeSymbol("DICTIONARY"), makeSymbol("&KEY"), makeSymbol("DONE"), list(makeSymbol("PROGRESS-NOTE"), makeString("Mapping dictionary..."))), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list_alt35 = list($DONE, makeKeyword("PROGRESS-NOTE"));

    static private final SubLString $str_alt38$Mapping_dictionary___ = makeString("Mapping dictionary...");

    static private final SubLSymbol $sym39$SO_FAR = makeUninternedSymbol("SO-FAR");

    static private final SubLSymbol $sym40$TOTAL = makeUninternedSymbol("TOTAL");

    static private final SubLList $list_alt42 = list(ZERO_INTEGER);
}

/**
 * Total time: 177 ms
 */
