/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl.rdf;


import static com.cyc.cycjava.cycl.format_nil.format_nil_a_no_copy;
import static com.cyc.cycjava.cycl.memoization_state.$memoization_state$;
import static com.cyc.cycjava.cycl.memoization_state.$memoized_item_not_found$;
import static com.cyc.cycjava.cycl.memoization_state.caching_results;
import static com.cyc.cycjava.cycl.memoization_state.caching_state_clear;
import static com.cyc.cycjava.cycl.memoization_state.caching_state_enter_multi_key_n;
import static com.cyc.cycjava.cycl.memoization_state.caching_state_lookup;
import static com.cyc.cycjava.cycl.memoization_state.caching_state_put;
import static com.cyc.cycjava.cycl.memoization_state.caching_state_remove_function_results_with_args;
import static com.cyc.cycjava.cycl.memoization_state.create_caching_state;
import static com.cyc.cycjava.cycl.memoization_state.create_global_caching_state_for_name;
import static com.cyc.cycjava.cycl.memoization_state.memoization_state_lock;
import static com.cyc.cycjava.cycl.memoization_state.memoization_state_lookup;
import static com.cyc.cycjava.cycl.memoization_state.memoization_state_put;
import static com.cyc.cycjava.cycl.memoization_state.note_globally_cached_function;
import static com.cyc.cycjava.cycl.memoization_state.note_memoized_function;
import static com.cyc.cycjava.cycl.memoization_state.sxhash_calc_3;
import static com.cyc.cycjava.cycl.number_utilities.f_1X;
import static com.cyc.cycjava.cycl.number_utilities.f_1_;
import static com.cyc.cycjava.cycl.string_utilities.copy_string;
import static com.cyc.cycjava.cycl.string_utilities.ends_with;
import static com.cyc.cycjava.cycl.string_utilities.first_char;
import static com.cyc.cycjava.cycl.string_utilities.last_char;
import static com.cyc.cycjava.cycl.string_utilities.remove_last_char;
import static com.cyc.cycjava.cycl.string_utilities.starts_with;
import static com.cyc.cycjava.cycl.string_utilities.substring;
import static com.cyc.cycjava.cycl.string_utilities.substring_matchP;
import static com.cyc.cycjava.cycl.unicode_nauts.non_ascii_string_to_unicode;
import static com.cyc.cycjava.cycl.unicode_strings.ascii_string_p;
import static com.cyc.cycjava.cycl.utilities_macros.note_funcall_helper_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_hash;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_slash;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.eql;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.equal;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.identity;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.funcall;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks.make_lock;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks.release_lock;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks.seize_lock;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.logxor;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.subtract;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.cconcatenate;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.length;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.subseq;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.def_csetf;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.makeStructDeclNative;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.register_method;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.stringp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.arg2;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.multiple_value_list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.resetMultipleValues;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.values;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cadr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cddr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.second;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.$print_object_method_table$;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.princ;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.defconstant;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;

import org.armedbear.lisp.Lisp;

import com.cyc.cycjava.cycl.V12;
import com.cyc.cycjava.cycl.format_nil;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.memoization_state;
import com.cyc.cycjava.cycl.number_utilities;
import com.cyc.cycjava.cycl.string_utilities;
import com.cyc.cycjava.cycl.unicode_nauts;
import com.cyc.cycjava.cycl.unicode_strings;
import com.cyc.cycjava.cycl.web_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
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
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles.LispMethod;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      RDF-URI
 * source file: /cyc/top/cycl/rdf/rdf-uri.lisp
 * created:     2019/07/03 17:38:13
 */
public final class rdf_uri extends SubLTranslatedFile implements V12 {
    public static final class $rdf_uri_native extends SubLStructNative {
        public SubLStructDecl getStructDecl() {
            return structDecl;
        }

        public SubLObject getField2() {
            return com.cyc.cycjava.cycl.rdf.rdf_uri.$rdf_uri_native.this.$base_uri;
        }

        public SubLObject getField3() {
            return com.cyc.cycjava.cycl.rdf.rdf_uri.$rdf_uri_native.this.$connector;
        }

        public SubLObject getField4() {
            return com.cyc.cycjava.cycl.rdf.rdf_uri.$rdf_uri_native.this.$local_part;
        }

        public SubLObject setField2(SubLObject value) {
            return com.cyc.cycjava.cycl.rdf.rdf_uri.$rdf_uri_native.this.$base_uri = value;
        }

        public SubLObject setField3(SubLObject value) {
            return com.cyc.cycjava.cycl.rdf.rdf_uri.$rdf_uri_native.this.$connector = value;
        }

        public SubLObject setField4(SubLObject value) {
            return com.cyc.cycjava.cycl.rdf.rdf_uri.$rdf_uri_native.this.$local_part = value;
        }

        public SubLObject $base_uri = Lisp.NIL;

        public SubLObject $connector = Lisp.NIL;

        public SubLObject $local_part = Lisp.NIL;

        private static final SubLStructDeclNative structDecl = makeStructDeclNative(com.cyc.cycjava.cycl.rdf.rdf_uri.$rdf_uri_native.class, RDF_URI, RDF_URI_P, $list_alt11, $list_alt12, new String[]{ "$base_uri", "$connector", "$local_part" }, $list_alt13, $list_alt14, PRINT_RDF_URI);
    }

    public static final SubLFile me = new rdf_uri();

 public static final String myName = "com.cyc.cycjava.cycl.rdf.rdf_uri";


    // deflexical
    @LispMethod(comment = "deflexical")
    // Definitions
    private static final SubLSymbol $rdf_uri_standard_connectors$ = makeSymbol("*RDF-URI-STANDARD-CONNECTORS*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $rdf_uri_lock$ = makeSymbol("*RDF-URI-LOCK*");

    // defconstant
    @LispMethod(comment = "defconstant")
    public static final SubLSymbol $dtp_rdf_uri$ = makeSymbol("*DTP-RDF-URI*");

    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    static private final SubLList $list0 = list(CHAR_hash, CHAR_slash);

    static private final SubLString $$$RDF_URI_Lock = makeString("RDF URI Lock");

    private static final SubLSymbol VALID_URI_CONNECTOR_P = makeSymbol("VALID-URI-CONNECTOR-P");

    private static final SubLString $str4$_ = makeString("<");

    private static final SubLString $str5$_ = makeString(">");

    private static final SubLSymbol RDF_FIND_BASE_URI = makeSymbol("RDF-FIND-BASE-URI");

    private static final SubLSymbol $rdf_find_base_uri_caching_state$ = makeSymbol("*RDF-FIND-BASE-URI-CACHING-STATE*");

    private static final SubLSymbol GET_RDF_URI_INTERNAL = makeSymbol("GET-RDF-URI-INTERNAL");

    private static final SubLSymbol $get_rdf_uri_internal_caching_state$ = makeSymbol("*GET-RDF-URI-INTERNAL-CACHING-STATE*");

    private static final SubLSymbol RDF_URI_P = makeSymbol("RDF-URI-P");

    private static final SubLSymbol RDF_URI = makeSymbol("RDF-URI");

    static private final SubLList $list12 = list(makeSymbol("BASE-URI"), makeSymbol("CONNECTOR"), makeSymbol("LOCAL-PART"));

    static private final SubLList $list13 = list(makeKeyword("BASE-URI"), makeKeyword("CONNECTOR"), makeKeyword("LOCAL-PART"));

    static private final SubLList $list14 = list(makeSymbol("RDF-URI-STRUCT-BASE-URI"), makeSymbol("RDF-URI-STRUCT-CONNECTOR"), makeSymbol("RDF-URI-STRUCT-LOCAL-PART"));

    private static final SubLList $list15 = list(makeSymbol("_CSETF-RDF-URI-STRUCT-BASE-URI"), makeSymbol("_CSETF-RDF-URI-STRUCT-CONNECTOR"), makeSymbol("_CSETF-RDF-URI-STRUCT-LOCAL-PART"));

    private static final SubLSymbol PRINT_RDF_URI = makeSymbol("PRINT-RDF-URI");

    private static final SubLSymbol RDF_URI_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("RDF-URI-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLList $list18 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("RDF-URI-P"));

    private static final SubLSymbol RDF_URI_STRUCT_BASE_URI = makeSymbol("RDF-URI-STRUCT-BASE-URI");

    private static final SubLSymbol _CSETF_RDF_URI_STRUCT_BASE_URI = makeSymbol("_CSETF-RDF-URI-STRUCT-BASE-URI");

    private static final SubLSymbol RDF_URI_STRUCT_CONNECTOR = makeSymbol("RDF-URI-STRUCT-CONNECTOR");

    private static final SubLSymbol _CSETF_RDF_URI_STRUCT_CONNECTOR = makeSymbol("_CSETF-RDF-URI-STRUCT-CONNECTOR");

    private static final SubLSymbol RDF_URI_STRUCT_LOCAL_PART = makeSymbol("RDF-URI-STRUCT-LOCAL-PART");

    private static final SubLSymbol _CSETF_RDF_URI_STRUCT_LOCAL_PART = makeSymbol("_CSETF-RDF-URI-STRUCT-LOCAL-PART");

    private static final SubLString $str28$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");

    private static final SubLSymbol MAKE_RDF_URI = makeSymbol("MAKE-RDF-URI");

    private static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_RDF_URI_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-RDF-URI-METHOD");

    private static final SubLString $str34$_RDF_URI__A = makeString("<RDF-URI ~A");

    private static final SubLSymbol URI_P = makeSymbol("URI-P");

    private static final SubLSymbol RDF_URI_UTF8_STRING = makeSymbol("RDF-URI-UTF8-STRING");

    private static final SubLSymbol SXHASH_RDF_URI_METHOD = makeSymbol("SXHASH-RDF-URI-METHOD");

    public static final SubLObject get_rdf_uri_alt(SubLObject base_uri, SubLObject connector, SubLObject local_part) {
        if (connector == UNPROVIDED) {
            connector = NIL;
        }
        if (local_part == UNPROVIDED) {
            local_part = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(base_uri, STRINGP);
            if (NIL != connector) {
                SubLTrampolineFile.checkType(connector, VALID_URI_CONNECTOR_P);
            }
            if (NIL != local_part) {
                SubLTrampolineFile.checkType(local_part, STRINGP);
            }
            if ((NIL == connector) && (NIL == local_part)) {
                thread.resetMultipleValues();
                {
                    SubLObject nbase = com.cyc.cycjava.cycl.rdf.rdf_uri.parse_uri(base_uri);
                    SubLObject nconnector = thread.secondMultipleValue();
                    SubLObject nlocal_part = thread.thirdMultipleValue();
                    thread.resetMultipleValues();
                    if (NIL != nbase) {
                        base_uri = com.cyc.cycjava.cycl.rdf.rdf_uri.rdf_find_base_uri(nbase);
                        connector = nconnector;
                        local_part = nlocal_part;
                    }
                }
            }
            {
                SubLObject uri = NIL;
                SubLObject lock = $rdf_uri_lock$.getGlobalValue();
                SubLObject release = NIL;
                try {
                    release = seize_lock(lock);
                    uri = com.cyc.cycjava.cycl.rdf.rdf_uri.get_rdf_uri_internal(base_uri, connector, local_part);
                } finally {
                    if (NIL != release) {
                        release_lock(lock);
                    }
                }
                return uri;
            }
        }
    }

    public static SubLObject get_rdf_uri(SubLObject base_uri, SubLObject connector, SubLObject local_part) {
        if (connector == UNPROVIDED) {
            connector = NIL;
        }
        if (local_part == UNPROVIDED) {
            local_part = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != stringp(base_uri) : "! stringp(base_uri) " + ("Types.stringp(base_uri) " + "CommonSymbols.NIL != Types.stringp(base_uri) ") + base_uri;
        if (((NIL != connector) && (!SubLTrampolineFile.assertionsDisabledInClass)) && (NIL == rdf_uri.valid_uri_connector_p(connector))) {
            throw new AssertionError(connector);
        }
        if (((NIL != local_part) && (!SubLTrampolineFile.assertionsDisabledInClass)) && (NIL == stringp(local_part))) {
            throw new AssertionError(local_part);
        }
        if ((NIL == connector) && (NIL == local_part)) {
            if ((NIL != string_utilities.starts_with(base_uri, rdf_uri.$str4$_)) && (NIL != string_utilities.ends_with(base_uri, rdf_uri.$str5$_, UNPROVIDED))) {
                base_uri = subseq(base_uri, ONE_INTEGER, subtract(length(base_uri), ONE_INTEGER));
            }
            thread.resetMultipleValues();
            final SubLObject nbase = rdf_uri.parse_uri(base_uri);
            final SubLObject nconnector = thread.secondMultipleValue();
            final SubLObject nlocal_part = thread.thirdMultipleValue();
            thread.resetMultipleValues();
            if (NIL != nbase) {
                base_uri = rdf_uri.rdf_find_base_uri(nbase);
                connector = nconnector;
                local_part = nlocal_part;
            }
        }
        SubLObject uri = NIL;
        SubLObject release = NIL;
        try {
            release = seize_lock(rdf_uri.$rdf_uri_lock$.getGlobalValue());
            uri = rdf_uri.get_rdf_uri_internal(base_uri, connector, local_part);
        } finally {
            if (NIL != release) {
                release_lock(rdf_uri.$rdf_uri_lock$.getGlobalValue());
            }
        }
        return uri;
    }

    public static final SubLObject clear_rdf_find_base_uri_alt() {
        {
            SubLObject cs = $rdf_find_base_uri_caching_state$.getGlobalValue();
            if (NIL != cs) {
                memoization_state.caching_state_clear(cs);
            }
        }
        return NIL;
    }

    public static SubLObject clear_rdf_find_base_uri() {
        final SubLObject cs = rdf_uri.$rdf_find_base_uri_caching_state$.getGlobalValue();
        if (NIL != cs) {
            caching_state_clear(cs);
        }
        return NIL;
    }

    public static final SubLObject remove_rdf_find_base_uri_alt(SubLObject base_uri) {
        return memoization_state.caching_state_remove_function_results_with_args($rdf_find_base_uri_caching_state$.getGlobalValue(), list(base_uri), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject remove_rdf_find_base_uri(final SubLObject base_uri) {
        return caching_state_remove_function_results_with_args(rdf_uri.$rdf_find_base_uri_caching_state$.getGlobalValue(), list(base_uri), UNPROVIDED, UNPROVIDED);
    }

    /**
     * Cached function to reuse strings for base URIs.
     */
    @LispMethod(comment = "Cached function to reuse strings for base URIs.")
    public static final SubLObject rdf_find_base_uri_internal_alt(SubLObject base_uri) {
        return base_uri;
    }

    /**
     * Cached function to reuse strings for base URIs.
     */
    @LispMethod(comment = "Cached function to reuse strings for base URIs.")
    public static SubLObject rdf_find_base_uri_internal(final SubLObject base_uri) {
        return base_uri;
    }

    public static final SubLObject rdf_find_base_uri_alt(SubLObject base_uri) {
        {
            SubLObject caching_state = $rdf_find_base_uri_caching_state$.getGlobalValue();
            if (NIL == caching_state) {
                caching_state = memoization_state.create_global_caching_state_for_name(RDF_FIND_BASE_URI, $rdf_find_base_uri_caching_state$, NIL, EQUAL, ONE_INTEGER, ZERO_INTEGER);
            }
            {
                SubLObject results = memoization_state.caching_state_lookup(caching_state, base_uri, $kw6$_MEMOIZED_ITEM_NOT_FOUND_);
                if (results == $kw6$_MEMOIZED_ITEM_NOT_FOUND_) {
                    results = arg2(resetMultipleValues(), multiple_value_list(com.cyc.cycjava.cycl.rdf.rdf_uri.rdf_find_base_uri_internal(base_uri)));
                    memoization_state.caching_state_put(caching_state, base_uri, results, UNPROVIDED);
                }
                return memoization_state.caching_results(results);
            }
        }
    }

    public static SubLObject rdf_find_base_uri(final SubLObject base_uri) {
        SubLObject caching_state = rdf_uri.$rdf_find_base_uri_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = create_global_caching_state_for_name(rdf_uri.RDF_FIND_BASE_URI, rdf_uri.$rdf_find_base_uri_caching_state$, NIL, EQUAL, ONE_INTEGER, ZERO_INTEGER);
        }
        SubLObject results = caching_state_lookup(caching_state, base_uri, $memoized_item_not_found$.getGlobalValue());
        if (results.eql($memoized_item_not_found$.getGlobalValue())) {
            results = arg2(resetMultipleValues(), multiple_value_list(rdf_uri.rdf_find_base_uri_internal(base_uri)));
            caching_state_put(caching_state, base_uri, results, UNPROVIDED);
        }
        return caching_results(results);
    }

    public static final SubLObject clear_get_rdf_uri_internal_alt() {
        {
            SubLObject cs = $get_rdf_uri_internal_caching_state$.getGlobalValue();
            if (NIL != cs) {
                memoization_state.caching_state_clear(cs);
            }
        }
        return NIL;
    }

    public static SubLObject clear_get_rdf_uri_internal() {
        final SubLObject cs = rdf_uri.$get_rdf_uri_internal_caching_state$.getGlobalValue();
        if (NIL != cs) {
            caching_state_clear(cs);
        }
        return NIL;
    }

    public static final SubLObject remove_get_rdf_uri_internal_alt(SubLObject base_uri, SubLObject connector, SubLObject local_part) {
        return memoization_state.caching_state_remove_function_results_with_args($get_rdf_uri_internal_caching_state$.getGlobalValue(), list(base_uri, connector, local_part), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject remove_get_rdf_uri_internal(final SubLObject base_uri, final SubLObject connector, final SubLObject local_part) {
        return caching_state_remove_function_results_with_args(rdf_uri.$get_rdf_uri_internal_caching_state$.getGlobalValue(), list(base_uri, connector, local_part), UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject get_rdf_uri_internal_internal_alt(SubLObject base_uri, SubLObject connector, SubLObject local_part) {
        return com.cyc.cycjava.cycl.rdf.rdf_uri.new_rdf_uri(base_uri, connector, local_part);
    }

    public static SubLObject get_rdf_uri_internal_internal(final SubLObject base_uri, final SubLObject connector, final SubLObject local_part) {
        return rdf_uri.new_rdf_uri(base_uri, connector, local_part);
    }

    public static final SubLObject get_rdf_uri_internal_alt(SubLObject base_uri, SubLObject connector, SubLObject local_part) {
        {
            SubLObject caching_state = $get_rdf_uri_internal_caching_state$.getGlobalValue();
            if (NIL == caching_state) {
                caching_state = memoization_state.create_global_caching_state_for_name(GET_RDF_URI_INTERNAL, $get_rdf_uri_internal_caching_state$, NIL, EQUAL, THREE_INTEGER, ZERO_INTEGER);
            }
            {
                SubLObject sxhash = memoization_state.sxhash_calc_3(base_uri, connector, local_part);
                SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
                if (collisions != $kw6$_MEMOIZED_ITEM_NOT_FOUND_) {
                    {
                        SubLObject cdolist_list_var = collisions;
                        SubLObject collision = NIL;
                        for (collision = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , collision = cdolist_list_var.first()) {
                            {
                                SubLObject cached_args = collision.first();
                                SubLObject results2 = second(collision);
                                if (base_uri.equal(cached_args.first())) {
                                    cached_args = cached_args.rest();
                                    if (connector.equal(cached_args.first())) {
                                        cached_args = cached_args.rest();
                                        if (((NIL != cached_args) && (NIL == cached_args.rest())) && local_part.equal(cached_args.first())) {
                                            return memoization_state.caching_results(results2);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                {
                    SubLObject results = arg2(resetMultipleValues(), multiple_value_list(com.cyc.cycjava.cycl.rdf.rdf_uri.get_rdf_uri_internal_internal(base_uri, connector, local_part)));
                    memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results, list(base_uri, connector, local_part));
                    return memoization_state.caching_results(results);
                }
            }
        }
    }

    public static SubLObject get_rdf_uri_internal(final SubLObject base_uri, final SubLObject connector, final SubLObject local_part) {
        SubLObject caching_state = rdf_uri.$get_rdf_uri_internal_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = create_global_caching_state_for_name(rdf_uri.GET_RDF_URI_INTERNAL, rdf_uri.$get_rdf_uri_internal_caching_state$, NIL, EQUAL, THREE_INTEGER, ZERO_INTEGER);
        }
        final SubLObject sxhash = sxhash_calc_3(base_uri, connector, local_part);
        final SubLObject collisions = caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql($memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (base_uri.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (connector.equal(cached_args.first())) {
                        cached_args = cached_args.rest();
                        if (((NIL != cached_args) && (NIL == cached_args.rest())) && local_part.equal(cached_args.first())) {
                            return caching_results(results2);
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(resetMultipleValues(), multiple_value_list(rdf_uri.get_rdf_uri_internal_internal(base_uri, connector, local_part)));
        caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(base_uri, connector, local_part));
        return caching_results(results3);
    }

    public static final SubLObject parse_uri_alt(SubLObject uri) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject base_uri = (NIL != web_utilities.uri_p(uri, UNPROVIDED)) ? ((SubLObject) (uri)) : NIL;
                SubLObject local_part = NIL;
                thread.resetMultipleValues();
                {
                    SubLObject connector_pos = com.cyc.cycjava.cycl.rdf.rdf_uri.find_rdf_uri_standard_connector(uri);
                    SubLObject connector = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    if (NIL != connector_pos) {
                        base_uri = substring(uri, ZERO_INTEGER, connector_pos);
                        local_part = substring(uri, number_utilities.f_1X(connector_pos), UNPROVIDED);
                    }
                    return values(base_uri, connector, local_part);
                }
            }
        }
    }

    public static SubLObject parse_uri(final SubLObject uri) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject base_uri = (NIL != web_utilities.uri_p(uri, UNPROVIDED)) ? uri : NIL;
        SubLObject local_part = NIL;
        thread.resetMultipleValues();
        final SubLObject connector_pos = rdf_uri.find_rdf_uri_standard_connector(uri);
        final SubLObject connector = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (NIL != connector_pos) {
            base_uri = string_utilities.substring(uri, ZERO_INTEGER, connector_pos);
            local_part = string_utilities.substring(uri, f_1X(connector_pos), UNPROVIDED);
        }
        return values(base_uri, connector, local_part);
    }

    public static final SubLObject rdf_uri_starts_withP_alt(SubLObject v_rdf_uri, SubLObject prefix) {
        SubLTrampolineFile.checkType(v_rdf_uri, RDF_URI_P);
        SubLTrampolineFile.checkType(prefix, STRINGP);
        if (NIL != starts_with(com.cyc.cycjava.cycl.rdf.rdf_uri.rdf_uri_base_uri(v_rdf_uri), prefix)) {
            return T;
        } else {
            if ((NIL != list_utilities.greater_length_p(prefix, com.cyc.cycjava.cycl.rdf.rdf_uri.rdf_uri_base_uri(v_rdf_uri))) && (NIL != starts_with(com.cyc.cycjava.cycl.rdf.rdf_uri.rdf_uri_utf8_string(v_rdf_uri), prefix))) {
                return T;
            } else {
                return NIL;
            }
        }
    }

    public static SubLObject rdf_uri_starts_withP(final SubLObject v_rdf_uri, final SubLObject prefix) {
        assert NIL != rdf_uri.rdf_uri_p(v_rdf_uri) : "! rdf_uri.rdf_uri_p(v_rdf_uri) " + ("rdf_uri.rdf_uri_p(v_rdf_uri) " + "CommonSymbols.NIL != rdf_uri.rdf_uri_p(v_rdf_uri) ") + v_rdf_uri;
        assert NIL != stringp(prefix) : "! stringp(prefix) " + ("Types.stringp(prefix) " + "CommonSymbols.NIL != Types.stringp(prefix) ") + prefix;
        if (NIL != string_utilities.starts_with(rdf_uri.rdf_uri_base_uri(v_rdf_uri), prefix)) {
            return T;
        }
        if ((NIL != list_utilities.greater_length_p(prefix, rdf_uri.rdf_uri_base_uri(v_rdf_uri))) && (NIL != string_utilities.starts_with(rdf_uri.rdf_uri_utf8_string(v_rdf_uri), prefix))) {
            return T;
        }
        return NIL;
    }

    public static final SubLObject rdf_uri_equal_p_alt(SubLObject uri1, SubLObject uri2) {
        SubLTrampolineFile.checkType(uri1, RDF_URI_P);
        SubLTrampolineFile.checkType(uri2, RDF_URI_P);
        return equal(com.cyc.cycjava.cycl.rdf.rdf_uri.rdf_uri_utf8_string(uri1), com.cyc.cycjava.cycl.rdf.rdf_uri.rdf_uri_utf8_string(uri2));
    }

    public static SubLObject rdf_uri_equal_p(final SubLObject uri1, final SubLObject uri2) {
        assert NIL != rdf_uri.rdf_uri_p(uri1) : "! rdf_uri.rdf_uri_p(uri1) " + ("rdf_uri.rdf_uri_p(uri1) " + "CommonSymbols.NIL != rdf_uri.rdf_uri_p(uri1) ") + uri1;
        assert NIL != rdf_uri.rdf_uri_p(uri2) : "! rdf_uri.rdf_uri_p(uri2) " + ("rdf_uri.rdf_uri_p(uri2) " + "CommonSymbols.NIL != rdf_uri.rdf_uri_p(uri2) ") + uri2;
        return equal(rdf_uri.rdf_uri_utf8_string(uri1), rdf_uri.rdf_uri_utf8_string(uri2));
    }

    public static final SubLObject rdf_uri_matchesP_alt(SubLObject v_rdf_uri, SubLObject uri) {
        SubLTrampolineFile.checkType(v_rdf_uri, RDF_URI_P);
        SubLTrampolineFile.checkType(uri, STRINGP);
        return makeBoolean((((NIL != com.cyc.cycjava.cycl.rdf.rdf_uri.rdf_uri_length_matchesP(v_rdf_uri, uri)) && (NIL != com.cyc.cycjava.cycl.rdf.rdf_uri.rdf_uri_base_matchesP(v_rdf_uri, uri))) && (NIL != com.cyc.cycjava.cycl.rdf.rdf_uri.rdf_uri_connector_matchesP(v_rdf_uri, uri))) && (NIL != com.cyc.cycjava.cycl.rdf.rdf_uri.rdf_uri_local_part_matchesP(v_rdf_uri, uri)));
    }

    public static SubLObject rdf_uri_matchesP(final SubLObject v_rdf_uri, final SubLObject uri) {
        assert NIL != rdf_uri.rdf_uri_p(v_rdf_uri) : "! rdf_uri.rdf_uri_p(v_rdf_uri) " + ("rdf_uri.rdf_uri_p(v_rdf_uri) " + "CommonSymbols.NIL != rdf_uri.rdf_uri_p(v_rdf_uri) ") + v_rdf_uri;
        assert NIL != stringp(uri) : "! stringp(uri) " + ("Types.stringp(uri) " + "CommonSymbols.NIL != Types.stringp(uri) ") + uri;
        return makeBoolean((((NIL != rdf_uri.rdf_uri_length_matchesP(v_rdf_uri, uri)) && (NIL != rdf_uri.rdf_uri_base_matchesP(v_rdf_uri, uri))) && (NIL != rdf_uri.rdf_uri_connector_matchesP(v_rdf_uri, uri))) && (NIL != rdf_uri.rdf_uri_local_part_matchesP(v_rdf_uri, uri)));
    }

    public static final SubLObject rdf_uri_cyc_string_alt(SubLObject v_rdf_uri) {
        {
            SubLObject utf8 = com.cyc.cycjava.cycl.rdf.rdf_uri.rdf_uri_utf8_string(v_rdf_uri);
            return NIL != unicode_strings.ascii_string_p(utf8) ? ((SubLObject) (utf8)) : unicode_nauts.non_ascii_string_to_unicode(utf8);
        }
    }

    public static SubLObject rdf_uri_cyc_string(final SubLObject v_rdf_uri) {
        final SubLObject utf8 = rdf_uri.rdf_uri_utf8_string(v_rdf_uri);
        return NIL != ascii_string_p(utf8) ? utf8 : non_ascii_string_to_unicode(utf8);
    }

    public static final SubLObject rdf_namespace_uri_with_local_partP_alt(SubLObject v_rdf_uri, SubLObject local_part) {
        SubLTrampolineFile.checkType(v_rdf_uri, RDF_URI_P);
        return makeBoolean(((com.cyc.cycjava.cycl.rdf.rdf_uri.rdf_uri_connector(v_rdf_uri).eql(CHAR_hash) && com.cyc.cycjava.cycl.rdf.rdf_uri.rdf_uri_local_part(v_rdf_uri).equal(local_part)) && (NIL != list_utilities.lengthE(com.cyc.cycjava.cycl.rdf.rdf_uri.rdf_uri_base_uri(v_rdf_uri), number_utilities.f_1_(length(rdf_utilities.rdf_namespace())), UNPROVIDED))) && (NIL != starts_with(rdf_utilities.rdf_namespace(), com.cyc.cycjava.cycl.rdf.rdf_uri.rdf_uri_base_uri(v_rdf_uri))));
    }

    public static SubLObject rdf_namespace_uri_with_local_partP(final SubLObject v_rdf_uri, final SubLObject local_part) {
        assert NIL != rdf_uri.rdf_uri_p(v_rdf_uri) : "! rdf_uri.rdf_uri_p(v_rdf_uri) " + ("rdf_uri.rdf_uri_p(v_rdf_uri) " + "CommonSymbols.NIL != rdf_uri.rdf_uri_p(v_rdf_uri) ") + v_rdf_uri;
        return makeBoolean(((rdf_uri.rdf_uri_connector(v_rdf_uri).eql(CHAR_hash) && rdf_uri.rdf_uri_local_part(v_rdf_uri).equal(local_part)) && (NIL != list_utilities.lengthE(rdf_uri.rdf_uri_base_uri(v_rdf_uri), f_1_(length(rdf_utilities.rdf_namespace())), UNPROVIDED))) && (NIL != string_utilities.starts_with(rdf_utilities.rdf_namespace(), rdf_uri.rdf_uri_base_uri(v_rdf_uri))));
    }

    public static final SubLObject find_rdf_uri_standard_connector_alt(SubLObject string) {
        {
            SubLObject cdolist_list_var = $rdf_uri_standard_connectors$.getGlobalValue();
            SubLObject standard_connector = NIL;
            for (standard_connector = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , standard_connector = cdolist_list_var.first()) {
                {
                    SubLObject connector_pos = list_utilities.position_from_end(standard_connector, string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    if (NIL != connector_pos) {
                        return values(connector_pos, standard_connector);
                    }
                }
            }
        }
        return values(NIL, NIL);
    }

    public static SubLObject find_rdf_uri_standard_connector(final SubLObject string) {
        SubLObject cdolist_list_var = rdf_uri.$rdf_uri_standard_connectors$.getGlobalValue();
        SubLObject standard_connector = NIL;
        standard_connector = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject connector_pos = list_utilities.position_from_end(standard_connector, string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            if (NIL != connector_pos) {
                return values(connector_pos, standard_connector);
            }
            cdolist_list_var = cdolist_list_var.rest();
            standard_connector = cdolist_list_var.first();
        } 
        return values(NIL, NIL);
    }

    public static final SubLObject rdf_uri_print_function_trampoline_alt(SubLObject v_object, SubLObject stream) {
        com.cyc.cycjava.cycl.rdf.rdf_uri.print_rdf_uri(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject rdf_uri_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        rdf_uri.print_rdf_uri(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject rdf_uri_p_alt(SubLObject v_object) {
        return v_object.getClass() == com.cyc.cycjava.cycl.rdf.rdf_uri.$rdf_uri_native.class ? ((SubLObject) (T)) : NIL;
    }

    public static SubLObject rdf_uri_p(final SubLObject v_object) {
        return v_object.getClass() == com.cyc.cycjava.cycl.rdf.rdf_uri.$rdf_uri_native.class ? T : NIL;
    }

    public static final SubLObject rdf_uri_struct_base_uri_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, RDF_URI_P);
        return v_object.getField2();
    }

    public static SubLObject rdf_uri_struct_base_uri(final SubLObject v_object) {
        assert NIL != rdf_uri.rdf_uri_p(v_object) : "! rdf_uri.rdf_uri_p(v_object) " + "rdf_uri.rdf_uri_p error :" + v_object;
        return v_object.getField2();
    }

    public static final SubLObject rdf_uri_struct_connector_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, RDF_URI_P);
        return v_object.getField3();
    }

    public static SubLObject rdf_uri_struct_connector(final SubLObject v_object) {
        assert NIL != rdf_uri.rdf_uri_p(v_object) : "! rdf_uri.rdf_uri_p(v_object) " + "rdf_uri.rdf_uri_p error :" + v_object;
        return v_object.getField3();
    }

    public static final SubLObject rdf_uri_struct_local_part_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, RDF_URI_P);
        return v_object.getField4();
    }

    public static SubLObject rdf_uri_struct_local_part(final SubLObject v_object) {
        assert NIL != rdf_uri.rdf_uri_p(v_object) : "! rdf_uri.rdf_uri_p(v_object) " + "rdf_uri.rdf_uri_p error :" + v_object;
        return v_object.getField4();
    }

    public static final SubLObject _csetf_rdf_uri_struct_base_uri_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, RDF_URI_P);
        return v_object.setField2(value);
    }

    public static SubLObject _csetf_rdf_uri_struct_base_uri(final SubLObject v_object, final SubLObject value) {
        assert NIL != rdf_uri.rdf_uri_p(v_object) : "! rdf_uri.rdf_uri_p(v_object) " + "rdf_uri.rdf_uri_p error :" + v_object;
        return v_object.setField2(value);
    }

    public static final SubLObject _csetf_rdf_uri_struct_connector_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, RDF_URI_P);
        return v_object.setField3(value);
    }

    public static SubLObject _csetf_rdf_uri_struct_connector(final SubLObject v_object, final SubLObject value) {
        assert NIL != rdf_uri.rdf_uri_p(v_object) : "! rdf_uri.rdf_uri_p(v_object) " + "rdf_uri.rdf_uri_p error :" + v_object;
        return v_object.setField3(value);
    }

    public static final SubLObject _csetf_rdf_uri_struct_local_part_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, RDF_URI_P);
        return v_object.setField4(value);
    }

    public static SubLObject _csetf_rdf_uri_struct_local_part(final SubLObject v_object, final SubLObject value) {
        assert NIL != rdf_uri.rdf_uri_p(v_object) : "! rdf_uri.rdf_uri_p(v_object) " + "rdf_uri.rdf_uri_p error :" + v_object;
        return v_object.setField4(value);
    }

    public static final SubLObject make_rdf_uri_alt(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        {
            SubLObject v_new = new com.cyc.cycjava.cycl.rdf.rdf_uri.$rdf_uri_native();
            SubLObject next = NIL;
            for (next = arglist; NIL != next; next = cddr(next)) {
                {
                    SubLObject current_arg = next.first();
                    SubLObject current_value = cadr(next);
                    SubLObject pcase_var = current_arg;
                    if (pcase_var.eql($BASE_URI)) {
                        com.cyc.cycjava.cycl.rdf.rdf_uri._csetf_rdf_uri_struct_base_uri(v_new, current_value);
                    } else {
                        if (pcase_var.eql($CONNECTOR)) {
                            com.cyc.cycjava.cycl.rdf.rdf_uri._csetf_rdf_uri_struct_connector(v_new, current_value);
                        } else {
                            if (pcase_var.eql($LOCAL_PART)) {
                                com.cyc.cycjava.cycl.rdf.rdf_uri._csetf_rdf_uri_struct_local_part(v_new, current_value);
                            } else {
                                Errors.error($str_alt26$Invalid_slot__S_for_construction_, current_arg);
                            }
                        }
                    }
                }
            }
            return v_new;
        }
    }

    public static SubLObject make_rdf_uri(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new com.cyc.cycjava.cycl.rdf.rdf_uri.$rdf_uri_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
            current_arg = next.first();
            current_value = cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql($BASE_URI)) {
                rdf_uri._csetf_rdf_uri_struct_base_uri(v_new, current_value);
            } else
                if (pcase_var.eql($CONNECTOR)) {
                    rdf_uri._csetf_rdf_uri_struct_connector(v_new, current_value);
                } else
                    if (pcase_var.eql($LOCAL_PART)) {
                        rdf_uri._csetf_rdf_uri_struct_local_part(v_new, current_value);
                    } else {
                        Errors.error(rdf_uri.$str28$Invalid_slot__S_for_construction_, current_arg);
                    }


        }
        return v_new;
    }

    public static SubLObject visit_defstruct_rdf_uri(final SubLObject obj, final SubLObject visitor_fn) {
        funcall(visitor_fn, obj, $BEGIN, rdf_uri.MAKE_RDF_URI, THREE_INTEGER);
        funcall(visitor_fn, obj, $SLOT, $BASE_URI, rdf_uri.rdf_uri_struct_base_uri(obj));
        funcall(visitor_fn, obj, $SLOT, $CONNECTOR, rdf_uri.rdf_uri_struct_connector(obj));
        funcall(visitor_fn, obj, $SLOT, $LOCAL_PART, rdf_uri.rdf_uri_struct_local_part(obj));
        funcall(visitor_fn, obj, $END, rdf_uri.MAKE_RDF_URI, THREE_INTEGER);
        return obj;
    }

    public static SubLObject visit_defstruct_object_rdf_uri_method(final SubLObject obj, final SubLObject visitor_fn) {
        return rdf_uri.visit_defstruct_rdf_uri(obj, visitor_fn);
    }

    public static final SubLObject print_rdf_uri_alt(SubLObject v_object, SubLObject stream, SubLObject depth) {
        format(stream, $str_alt27$_RDF_URI__A, com.cyc.cycjava.cycl.rdf.rdf_uri.rdf_uri_struct_base_uri(v_object));
        if (NIL != com.cyc.cycjava.cycl.rdf.rdf_uri.rdf_uri_struct_connector(v_object)) {
            princ(com.cyc.cycjava.cycl.rdf.rdf_uri.rdf_uri_struct_connector(v_object), stream);
            princ(com.cyc.cycjava.cycl.rdf.rdf_uri.rdf_uri_struct_local_part(v_object), stream);
        }
        princ($str_alt28$_, stream);
        return v_object;
    }

    public static SubLObject print_rdf_uri(final SubLObject v_object, final SubLObject stream, final SubLObject depth) {
        format(stream, rdf_uri.$str34$_RDF_URI__A, rdf_uri.rdf_uri_struct_base_uri(v_object));
        if (NIL != rdf_uri.rdf_uri_struct_connector(v_object)) {
            princ(rdf_uri.rdf_uri_struct_connector(v_object), stream);
            princ(rdf_uri.rdf_uri_struct_local_part(v_object), stream);
        }
        princ(rdf_uri.$str5$_, stream);
        return v_object;
    }

    public static final SubLObject new_rdf_uri_from_two_parts_alt(SubLObject start, SubLObject end) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            thread.resetMultipleValues();
            {
                SubLObject base_uri = com.cyc.cycjava.cycl.rdf.rdf_uri.rdf_uri_parts_from_two_parts(start, end);
                SubLObject connector = thread.secondMultipleValue();
                SubLObject local_part = thread.thirdMultipleValue();
                thread.resetMultipleValues();
                return com.cyc.cycjava.cycl.rdf.rdf_uri.get_rdf_uri(base_uri, connector, local_part);
            }
        }
    }

    public static SubLObject new_rdf_uri_from_two_parts(final SubLObject start, final SubLObject end) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject base_uri = rdf_uri.rdf_uri_parts_from_two_parts(start, end);
        final SubLObject connector = thread.secondMultipleValue();
        final SubLObject local_part = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        return rdf_uri.get_rdf_uri(base_uri, connector, local_part);
    }

    public static final SubLObject rdf_uri_parts_from_two_parts_alt(SubLObject start, SubLObject end) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            thread.resetMultipleValues();
            {
                SubLObject connector_pos = com.cyc.cycjava.cycl.rdf.rdf_uri.find_rdf_uri_standard_connector(end);
                SubLObject connector = thread.secondMultipleValue();
                thread.resetMultipleValues();
                if (ZERO_INTEGER.eql(connector_pos)) {
                    return values(start, connector, substring(end, ONE_INTEGER, UNPROVIDED));
                } else {
                    if (NIL != connector_pos) {
                        {
                            SubLObject base_uri = cconcatenate(start, substring(end, ZERO_INTEGER, connector_pos));
                            SubLObject local_part = substring(end, number_utilities.f_1X(connector_pos), UNPROVIDED);
                            return values(base_uri, connector, local_part);
                        }
                    }
                }
            }
            thread.resetMultipleValues();
            {
                SubLObject connector_pos = com.cyc.cycjava.cycl.rdf.rdf_uri.find_rdf_uri_standard_connector(start);
                SubLObject connector = thread.secondMultipleValue();
                thread.resetMultipleValues();
                if (connector.eql(last_char(start))) {
                    return values(remove_last_char(start, UNPROVIDED), connector, end);
                } else {
                    if (NIL != connector_pos) {
                        {
                            SubLObject base_uri = substring(start, ZERO_INTEGER, connector_pos);
                            SubLObject local_part = cconcatenate(substring(start, number_utilities.f_1X(connector_pos), UNPROVIDED), end);
                            return values(base_uri, connector, local_part);
                        }
                    }
                }
            }
            thread.resetMultipleValues();
            {
                SubLObject base_uri = com.cyc.cycjava.cycl.rdf.rdf_uri.parse_uri(cconcatenate(start, end));
                SubLObject connector = thread.secondMultipleValue();
                SubLObject local_part = thread.thirdMultipleValue();
                thread.resetMultipleValues();
                return values(base_uri, connector, local_part);
            }
        }
    }

    public static SubLObject rdf_uri_parts_from_two_parts(final SubLObject start, final SubLObject end) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        SubLObject connector_pos = rdf_uri.find_rdf_uri_standard_connector(end);
        SubLObject connector = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (ZERO_INTEGER.eql(connector_pos)) {
            return values(start, connector, string_utilities.substring(end, ONE_INTEGER, UNPROVIDED));
        }
        if (NIL != connector_pos) {
            final SubLObject base_uri = cconcatenate(start, string_utilities.substring(end, ZERO_INTEGER, connector_pos));
            final SubLObject local_part = string_utilities.substring(end, f_1X(connector_pos), UNPROVIDED);
            return values(base_uri, connector, local_part);
        }
        thread.resetMultipleValues();
        connector_pos = rdf_uri.find_rdf_uri_standard_connector(start);
        connector = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (connector.eql(string_utilities.last_char(start))) {
            return values(string_utilities.remove_last_char(start, UNPROVIDED), connector, end);
        }
        if (NIL != connector_pos) {
            final SubLObject base_uri = string_utilities.substring(start, ZERO_INTEGER, connector_pos);
            final SubLObject local_part = cconcatenate(string_utilities.substring(start, f_1X(connector_pos), UNPROVIDED), end);
            return values(base_uri, connector, local_part);
        }
        thread.resetMultipleValues();
        final SubLObject base_uri2 = rdf_uri.parse_uri(cconcatenate(start, end));
        connector = thread.secondMultipleValue();
        final SubLObject local_part2 = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        return values(base_uri2, connector, local_part2);
    }

    public static final SubLObject resolve_rdf_uri_alt(SubLObject base_uri, SubLObject relative_uri) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            thread.resetMultipleValues();
            {
                SubLObject new_base_uri = web_utilities.canonicalize_relative_uri(base_uri, relative_uri);
                SubLObject new_local_name = thread.secondMultipleValue();
                thread.resetMultipleValues();
                return com.cyc.cycjava.cycl.rdf.rdf_uri.new_rdf_uri_from_two_parts(new_base_uri, new_local_name);
            }
        }
    }

    public static SubLObject resolve_rdf_uri(final SubLObject base_uri, final SubLObject relative_uri) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject new_base_uri = web_utilities.canonicalize_relative_uri(base_uri, relative_uri);
        final SubLObject new_local_name = thread.secondMultipleValue();
        thread.resetMultipleValues();
        return rdf_uri.new_rdf_uri_from_two_parts(new_base_uri, new_local_name);
    }

    /**
     *
     *
     * @param CONNECTOR
     * 		stringp; Typically '#' or '/'.
     */
    @LispMethod(comment = "@param CONNECTOR\r\n\t\tstringp; Typically \'#\' or \'/\'.")
    public static final SubLObject new_rdf_uri_alt(SubLObject base_uri, SubLObject connector, SubLObject local_part) {
        SubLTrampolineFile.checkType(base_uri, URI_P);
        if (NIL != local_part) {
            SubLTrampolineFile.checkType(local_part, STRINGP);
        }
        if (NIL != connector) {
            SubLTrampolineFile.checkType(connector, VALID_URI_CONNECTOR_P);
        }
        {
            SubLObject uri_struct = com.cyc.cycjava.cycl.rdf.rdf_uri.make_rdf_uri(UNPROVIDED);
            com.cyc.cycjava.cycl.rdf.rdf_uri._csetf_rdf_uri_struct_base_uri(uri_struct, base_uri);
            if (NIL != connector) {
                if (connector.isString() && (NIL != list_utilities.lengthE(connector, ONE_INTEGER, UNPROVIDED))) {
                    com.cyc.cycjava.cycl.rdf.rdf_uri._csetf_rdf_uri_struct_connector(uri_struct, first_char(connector));
                } else {
                    com.cyc.cycjava.cycl.rdf.rdf_uri._csetf_rdf_uri_struct_connector(uri_struct, connector);
                }
                com.cyc.cycjava.cycl.rdf.rdf_uri._csetf_rdf_uri_struct_local_part(uri_struct, local_part);
            }
            return uri_struct;
        }
    }

    /**
     *
     *
     * @param CONNECTOR
     * 		stringp; Typically '#' or '/'.
     */
    @LispMethod(comment = "@param CONNECTOR\r\n\t\tstringp; Typically \'#\' or \'/\'.")
    public static SubLObject new_rdf_uri(final SubLObject base_uri, final SubLObject connector, final SubLObject local_part) {
        assert NIL != web_utilities.uri_p(base_uri, UNPROVIDED) : "! web_utilities.uri_p(base_uri, .UNPROVIDED) " + ("web_utilities.uri_p(base_uri, CommonSymbols.UNPROVIDED) " + "CommonSymbols.NIL != web_utilities.uri_p(base_uri, CommonSymbols.UNPROVIDED) ") + base_uri;
        if (((NIL != local_part) && (!SubLTrampolineFile.assertionsDisabledInClass)) && (NIL == stringp(local_part))) {
            throw new AssertionError(local_part);
        }
        if (((NIL != connector) && (!SubLTrampolineFile.assertionsDisabledInClass)) && (NIL == rdf_uri.valid_uri_connector_p(connector))) {
            throw new AssertionError(connector);
        }
        final SubLObject uri_struct = rdf_uri.make_rdf_uri(UNPROVIDED);
        rdf_uri._csetf_rdf_uri_struct_base_uri(uri_struct, base_uri);
        if (NIL != connector) {
            if (connector.isString() && (NIL != list_utilities.lengthE(connector, ONE_INTEGER, UNPROVIDED))) {
                rdf_uri._csetf_rdf_uri_struct_connector(uri_struct, string_utilities.first_char(connector));
            } else {
                rdf_uri._csetf_rdf_uri_struct_connector(uri_struct, connector);
            }
            rdf_uri._csetf_rdf_uri_struct_local_part(uri_struct, local_part);
        }
        return uri_struct;
    }

    public static final SubLObject valid_uri_connector_p_alt(SubLObject v_object) {
        return makeBoolean(v_object.isChar() || v_object.isString());
    }

    public static SubLObject valid_uri_connector_p(final SubLObject v_object) {
        return makeBoolean(v_object.isChar() || v_object.isString());
    }

    public static final SubLObject rdf_uri_base_matchesP_alt(SubLObject v_rdf_uri, SubLObject uri) {
        return makeBoolean((NIL != substring_matchP(uri, com.cyc.cycjava.cycl.rdf.rdf_uri.rdf_uri_struct_base_uri(v_rdf_uri), ZERO_INTEGER, UNPROVIDED)) && ((NIL != com.cyc.cycjava.cycl.rdf.rdf_uri.rdf_uri_struct_connector(v_rdf_uri)) || com.cyc.cycjava.cycl.rdf.rdf_uri.rdf_uri_struct_base_uri(v_rdf_uri).equal(uri)));
    }

    public static SubLObject rdf_uri_base_matchesP(final SubLObject v_rdf_uri, final SubLObject uri) {
        return makeBoolean((NIL != string_utilities.substring_matchP(uri, rdf_uri.rdf_uri_struct_base_uri(v_rdf_uri), ZERO_INTEGER, UNPROVIDED)) && ((NIL != rdf_uri.rdf_uri_struct_connector(v_rdf_uri)) || rdf_uri.rdf_uri_struct_base_uri(v_rdf_uri).equal(uri)));
    }

    public static final SubLObject rdf_uri_connector_matchesP_alt(SubLObject v_rdf_uri, SubLObject uri) {
        {
            SubLObject connector = com.cyc.cycjava.cycl.rdf.rdf_uri.rdf_uri_struct_connector(v_rdf_uri);
            if (NIL == connector) {
                return T;
            } else {
                if (connector.isChar()) {
                    return eql(connector, Strings.sublisp_char(uri, length(com.cyc.cycjava.cycl.rdf.rdf_uri.rdf_uri_struct_base_uri(v_rdf_uri))));
                } else {
                    return substring_matchP(uri, connector, length(com.cyc.cycjava.cycl.rdf.rdf_uri.rdf_uri_struct_base_uri(v_rdf_uri)), UNPROVIDED);
                }
            }
        }
    }

    public static SubLObject rdf_uri_connector_matchesP(final SubLObject v_rdf_uri, final SubLObject uri) {
        final SubLObject connector = rdf_uri.rdf_uri_struct_connector(v_rdf_uri);
        if (NIL == connector) {
            return T;
        }
        if (connector.isChar()) {
            return eql(connector, Strings.sublisp_char(uri, length(rdf_uri.rdf_uri_struct_base_uri(v_rdf_uri))));
        }
        return string_utilities.substring_matchP(uri, connector, length(rdf_uri.rdf_uri_struct_base_uri(v_rdf_uri)), UNPROVIDED);
    }

    public static final SubLObject rdf_uri_local_part_matchesP_alt(SubLObject v_rdf_uri, SubLObject uri) {
        return ends_with(uri, com.cyc.cycjava.cycl.rdf.rdf_uri.rdf_uri_struct_local_part(v_rdf_uri), UNPROVIDED);
    }

    public static SubLObject rdf_uri_local_part_matchesP(final SubLObject v_rdf_uri, final SubLObject uri) {
        return string_utilities.ends_with(uri, rdf_uri.rdf_uri_struct_local_part(v_rdf_uri), UNPROVIDED);
    }

    public static final SubLObject rdf_uri_length_matchesP_alt(SubLObject v_rdf_uri, SubLObject uri) {
        {
            SubLObject connector_length = (com.cyc.cycjava.cycl.rdf.rdf_uri.rdf_uri_struct_connector(v_rdf_uri).isChar()) ? ((SubLObject) (ONE_INTEGER)) : length(com.cyc.cycjava.cycl.rdf.rdf_uri.rdf_uri_struct_connector(v_rdf_uri));
            return list_utilities.lengthE(uri, add(length(com.cyc.cycjava.cycl.rdf.rdf_uri.rdf_uri_struct_base_uri(v_rdf_uri)), connector_length, length(com.cyc.cycjava.cycl.rdf.rdf_uri.rdf_uri_struct_local_part(v_rdf_uri))), UNPROVIDED);
        }
    }

    public static SubLObject rdf_uri_length_matchesP(final SubLObject v_rdf_uri, final SubLObject uri) {
        final SubLObject connector_length = (rdf_uri.rdf_uri_struct_connector(v_rdf_uri).isChar()) ? ONE_INTEGER : length(rdf_uri.rdf_uri_struct_connector(v_rdf_uri));
        return list_utilities.lengthE(uri, add(length(rdf_uri.rdf_uri_struct_base_uri(v_rdf_uri)), connector_length, length(rdf_uri.rdf_uri_struct_local_part(v_rdf_uri))), UNPROVIDED);
    }

    public static SubLObject rdf_uri_utf8_string_internal(final SubLObject uri) {
        assert NIL != rdf_uri.rdf_uri_p(uri) : "! rdf_uri.rdf_uri_p(uri) " + ("rdf_uri.rdf_uri_p(uri) " + "CommonSymbols.NIL != rdf_uri.rdf_uri_p(uri) ") + uri;
        final SubLObject base = rdf_uri.rdf_uri_struct_base_uri(uri);
        return NIL != rdf_uri.rdf_uri_struct_connector(uri) ? cconcatenate(format_nil.format_nil_a_no_copy(base), new SubLObject[]{ format_nil.format_nil_a_no_copy(rdf_uri.rdf_uri_struct_connector(uri)), format_nil.format_nil_a_no_copy(rdf_uri.rdf_uri_struct_local_part(uri)) }) : string_utilities.copy_string(base);
    }

    public static final SubLObject rdf_uri_utf8_string_alt(SubLObject uri) {
        SubLTrampolineFile.checkType(uri, RDF_URI_P);
        {
            SubLObject base = com.cyc.cycjava.cycl.rdf.rdf_uri.rdf_uri_struct_base_uri(uri);
            return NIL != com.cyc.cycjava.cycl.rdf.rdf_uri.rdf_uri_struct_connector(uri) ? ((SubLObject) (cconcatenate(format_nil_a_no_copy(base), new SubLObject[]{ format_nil_a_no_copy(com.cyc.cycjava.cycl.rdf.rdf_uri.rdf_uri_struct_connector(uri)), format_nil_a_no_copy(com.cyc.cycjava.cycl.rdf.rdf_uri.rdf_uri_struct_local_part(uri)) }))) : copy_string(base);
        }
    }

    public static SubLObject rdf_uri_utf8_string(final SubLObject uri) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = $memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return rdf_uri.rdf_uri_utf8_string_internal(uri);
        }
        caching_state = memoization_state_lookup(v_memoization_state, rdf_uri.RDF_URI_UTF8_STRING, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = create_caching_state(memoization_state_lock(v_memoization_state), rdf_uri.RDF_URI_UTF8_STRING, ONE_INTEGER, NIL, EQUAL, UNPROVIDED);
            memoization_state_put(v_memoization_state, rdf_uri.RDF_URI_UTF8_STRING, caching_state);
        }
        SubLObject results = caching_state_lookup(caching_state, uri, $memoized_item_not_found$.getGlobalValue());
        if (results.eql($memoized_item_not_found$.getGlobalValue())) {
            results = arg2(thread.resetMultipleValues(), multiple_value_list(rdf_uri.rdf_uri_utf8_string_internal(uri)));
            caching_state_put(caching_state, uri, results, UNPROVIDED);
        }
        return caching_results(results);
    }

    public static final SubLObject rdf_uri_base_uri_alt(SubLObject uri) {
        SubLTrampolineFile.checkType(uri, RDF_URI_P);
        return com.cyc.cycjava.cycl.rdf.rdf_uri.rdf_uri_struct_base_uri(uri);
    }

    public static SubLObject rdf_uri_base_uri(final SubLObject uri) {
        assert NIL != rdf_uri.rdf_uri_p(uri) : "! rdf_uri.rdf_uri_p(uri) " + ("rdf_uri.rdf_uri_p(uri) " + "CommonSymbols.NIL != rdf_uri.rdf_uri_p(uri) ") + uri;
        return rdf_uri.rdf_uri_struct_base_uri(uri);
    }

    public static final SubLObject rdf_uri_connector_alt(SubLObject uri) {
        SubLTrampolineFile.checkType(uri, RDF_URI_P);
        return com.cyc.cycjava.cycl.rdf.rdf_uri.rdf_uri_struct_connector(uri);
    }

    public static SubLObject rdf_uri_connector(final SubLObject uri) {
        assert NIL != rdf_uri.rdf_uri_p(uri) : "! rdf_uri.rdf_uri_p(uri) " + ("rdf_uri.rdf_uri_p(uri) " + "CommonSymbols.NIL != rdf_uri.rdf_uri_p(uri) ") + uri;
        return rdf_uri.rdf_uri_struct_connector(uri);
    }

    public static SubLObject rdf_uri_base_and_connector(final SubLObject uri) {
        return cconcatenate(format_nil.format_nil_a_no_copy(rdf_uri.rdf_uri_base_uri(uri)), format_nil.format_nil_a_no_copy(rdf_uri.rdf_uri_connector(uri)));
    }

    public static final SubLObject rdf_uri_local_part_alt(SubLObject uri) {
        SubLTrampolineFile.checkType(uri, RDF_URI_P);
        return com.cyc.cycjava.cycl.rdf.rdf_uri.rdf_uri_struct_local_part(uri);
    }

    public static SubLObject rdf_uri_local_part(final SubLObject uri) {
        assert NIL != rdf_uri.rdf_uri_p(uri) : "! rdf_uri.rdf_uri_p(uri) " + ("rdf_uri.rdf_uri_p(uri) " + "CommonSymbols.NIL != rdf_uri.rdf_uri_p(uri) ") + uri;
        return rdf_uri.rdf_uri_struct_local_part(uri);
    }

    public static final SubLObject sxhash_rdf_uri_method_alt(SubLObject v_object) {
        return com.cyc.cycjava.cycl.rdf.rdf_uri.sxhash_rdf_uri(v_object);
    }

    public static SubLObject sxhash_rdf_uri_method(final SubLObject v_object) {
        return rdf_uri.sxhash_rdf_uri(v_object);
    }

    public static final SubLObject sxhash_rdf_uri_alt(SubLObject uri) {
        return logxor(new SubLObject[]{ Sxhash.sxhash(com.cyc.cycjava.cycl.rdf.rdf_uri.rdf_uri_struct_base_uri(uri)), Sxhash.sxhash(com.cyc.cycjava.cycl.rdf.rdf_uri.rdf_uri_struct_connector(uri)), Sxhash.sxhash(com.cyc.cycjava.cycl.rdf.rdf_uri.rdf_uri_struct_local_part(uri)) });
    }

    public static SubLObject sxhash_rdf_uri(final SubLObject uri) {
        return logxor(new SubLObject[]{ Sxhash.sxhash(rdf_uri.rdf_uri_struct_base_uri(uri)), Sxhash.sxhash(rdf_uri.rdf_uri_struct_connector(uri)), Sxhash.sxhash(rdf_uri.rdf_uri_struct_local_part(uri)) });
    }

    public static SubLObject declare_rdf_uri_file() {
        declareFunction("get_rdf_uri", "GET-RDF-URI", 1, 2, false);
        declareFunction("clear_rdf_find_base_uri", "CLEAR-RDF-FIND-BASE-URI", 0, 0, false);
        declareFunction("remove_rdf_find_base_uri", "REMOVE-RDF-FIND-BASE-URI", 1, 0, false);
        declareFunction("rdf_find_base_uri_internal", "RDF-FIND-BASE-URI-INTERNAL", 1, 0, false);
        declareFunction("rdf_find_base_uri", "RDF-FIND-BASE-URI", 1, 0, false);
        declareFunction("clear_get_rdf_uri_internal", "CLEAR-GET-RDF-URI-INTERNAL", 0, 0, false);
        declareFunction("remove_get_rdf_uri_internal", "REMOVE-GET-RDF-URI-INTERNAL", 3, 0, false);
        declareFunction("get_rdf_uri_internal_internal", "GET-RDF-URI-INTERNAL-INTERNAL", 3, 0, false);
        declareFunction("get_rdf_uri_internal", "GET-RDF-URI-INTERNAL", 3, 0, false);
        declareFunction("parse_uri", "PARSE-URI", 1, 0, false);
        declareFunction("rdf_uri_starts_withP", "RDF-URI-STARTS-WITH?", 2, 0, false);
        declareFunction("rdf_uri_equal_p", "RDF-URI-EQUAL-P", 2, 0, false);
        declareFunction("rdf_uri_matchesP", "RDF-URI-MATCHES?", 2, 0, false);
        declareFunction("rdf_uri_cyc_string", "RDF-URI-CYC-STRING", 1, 0, false);
        declareFunction("rdf_namespace_uri_with_local_partP", "RDF-NAMESPACE-URI-WITH-LOCAL-PART?", 2, 0, false);
        declareFunction("find_rdf_uri_standard_connector", "FIND-RDF-URI-STANDARD-CONNECTOR", 1, 0, false);
        declareFunction("rdf_uri_print_function_trampoline", "RDF-URI-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction("rdf_uri_p", "RDF-URI-P", 1, 0, false);
        new rdf_uri.$rdf_uri_p$UnaryFunction();
        declareFunction("rdf_uri_struct_base_uri", "RDF-URI-STRUCT-BASE-URI", 1, 0, false);
        declareFunction("rdf_uri_struct_connector", "RDF-URI-STRUCT-CONNECTOR", 1, 0, false);
        declareFunction("rdf_uri_struct_local_part", "RDF-URI-STRUCT-LOCAL-PART", 1, 0, false);
        declareFunction("_csetf_rdf_uri_struct_base_uri", "_CSETF-RDF-URI-STRUCT-BASE-URI", 2, 0, false);
        declareFunction("_csetf_rdf_uri_struct_connector", "_CSETF-RDF-URI-STRUCT-CONNECTOR", 2, 0, false);
        declareFunction("_csetf_rdf_uri_struct_local_part", "_CSETF-RDF-URI-STRUCT-LOCAL-PART", 2, 0, false);
        declareFunction("make_rdf_uri", "MAKE-RDF-URI", 0, 1, false);
        declareFunction("visit_defstruct_rdf_uri", "VISIT-DEFSTRUCT-RDF-URI", 2, 0, false);
        declareFunction("visit_defstruct_object_rdf_uri_method", "VISIT-DEFSTRUCT-OBJECT-RDF-URI-METHOD", 2, 0, false);
        declareFunction("print_rdf_uri", "PRINT-RDF-URI", 3, 0, false);
        declareFunction("new_rdf_uri_from_two_parts", "NEW-RDF-URI-FROM-TWO-PARTS", 2, 0, false);
        declareFunction("rdf_uri_parts_from_two_parts", "RDF-URI-PARTS-FROM-TWO-PARTS", 2, 0, false);
        declareFunction("resolve_rdf_uri", "RESOLVE-RDF-URI", 2, 0, false);
        declareFunction("new_rdf_uri", "NEW-RDF-URI", 3, 0, false);
        declareFunction("valid_uri_connector_p", "VALID-URI-CONNECTOR-P", 1, 0, false);
        declareFunction("rdf_uri_base_matchesP", "RDF-URI-BASE-MATCHES?", 2, 0, false);
        declareFunction("rdf_uri_connector_matchesP", "RDF-URI-CONNECTOR-MATCHES?", 2, 0, false);
        declareFunction("rdf_uri_local_part_matchesP", "RDF-URI-LOCAL-PART-MATCHES?", 2, 0, false);
        declareFunction("rdf_uri_length_matchesP", "RDF-URI-LENGTH-MATCHES?", 2, 0, false);
        declareFunction("rdf_uri_utf8_string_internal", "RDF-URI-UTF8-STRING-INTERNAL", 1, 0, false);
        declareFunction("rdf_uri_utf8_string", "RDF-URI-UTF8-STRING", 1, 0, false);
        declareFunction("rdf_uri_base_uri", "RDF-URI-BASE-URI", 1, 0, false);
        declareFunction("rdf_uri_connector", "RDF-URI-CONNECTOR", 1, 0, false);
        declareFunction("rdf_uri_base_and_connector", "RDF-URI-BASE-AND-CONNECTOR", 1, 0, false);
        declareFunction("rdf_uri_local_part", "RDF-URI-LOCAL-PART", 1, 0, false);
        declareFunction("sxhash_rdf_uri_method", "SXHASH-RDF-URI-METHOD", 1, 0, false);
        declareFunction("sxhash_rdf_uri", "SXHASH-RDF-URI", 1, 0, false);
        return NIL;
    }

    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    static private final SubLList $list_alt0 = list(CHAR_hash, CHAR_slash);

    public static final SubLSymbol $kw6$_MEMOIZED_ITEM_NOT_FOUND_ = makeKeyword("&MEMOIZED-ITEM-NOT-FOUND&");

    static private final SubLList $list_alt11 = list(makeSymbol("BASE-URI"), makeSymbol("CONNECTOR"), makeSymbol("LOCAL-PART"));

    static private final SubLList $list_alt12 = list(makeKeyword("BASE-URI"), makeKeyword("CONNECTOR"), makeKeyword("LOCAL-PART"));

    static private final SubLList $list_alt13 = list(makeSymbol("RDF-URI-STRUCT-BASE-URI"), makeSymbol("RDF-URI-STRUCT-CONNECTOR"), makeSymbol("RDF-URI-STRUCT-LOCAL-PART"));

    static private final SubLList $list_alt14 = list(makeSymbol("_CSETF-RDF-URI-STRUCT-BASE-URI"), makeSymbol("_CSETF-RDF-URI-STRUCT-CONNECTOR"), makeSymbol("_CSETF-RDF-URI-STRUCT-LOCAL-PART"));

    public static SubLObject init_rdf_uri_file() {
        deflexical("*RDF-URI-STANDARD-CONNECTORS*", rdf_uri.$list0);
        deflexical("*RDF-URI-LOCK*", make_lock(rdf_uri.$$$RDF_URI_Lock));
        deflexical("*RDF-FIND-BASE-URI-CACHING-STATE*", NIL);
        deflexical("*GET-RDF-URI-INTERNAL-CACHING-STATE*", NIL);
        defconstant("*DTP-RDF-URI*", rdf_uri.RDF_URI);
        return NIL;
    }

    public static SubLObject setup_rdf_uri_file() {
        note_globally_cached_function(rdf_uri.RDF_FIND_BASE_URI);
        note_globally_cached_function(rdf_uri.GET_RDF_URI_INTERNAL);
        register_method($print_object_method_table$.getGlobalValue(), rdf_uri.$dtp_rdf_uri$.getGlobalValue(), symbol_function(rdf_uri.RDF_URI_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim(rdf_uri.$list18);
        def_csetf(rdf_uri.RDF_URI_STRUCT_BASE_URI, rdf_uri._CSETF_RDF_URI_STRUCT_BASE_URI);
        def_csetf(rdf_uri.RDF_URI_STRUCT_CONNECTOR, rdf_uri._CSETF_RDF_URI_STRUCT_CONNECTOR);
        def_csetf(rdf_uri.RDF_URI_STRUCT_LOCAL_PART, rdf_uri._CSETF_RDF_URI_STRUCT_LOCAL_PART);
        identity(rdf_uri.RDF_URI);
        register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), rdf_uri.$dtp_rdf_uri$.getGlobalValue(), symbol_function(rdf_uri.VISIT_DEFSTRUCT_OBJECT_RDF_URI_METHOD));
        note_funcall_helper_function(rdf_uri.PRINT_RDF_URI);
        note_memoized_function(rdf_uri.RDF_URI_UTF8_STRING);
        register_method(Sxhash.$sxhash_method_table$.getGlobalValue(), rdf_uri.$dtp_rdf_uri$.getGlobalValue(), symbol_function(rdf_uri.SXHASH_RDF_URI_METHOD));
        return NIL;
    }

    static private final SubLString $str_alt26$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");

    static private final SubLString $str_alt27$_RDF_URI__A = makeString("<RDF-URI ~A");

    static private final SubLString $str_alt28$_ = makeString(">");

    @Override
    public void declareFunctions() {
        rdf_uri.declare_rdf_uri_file();
    }

    @Override
    public void initializeVariables() {
        rdf_uri.init_rdf_uri_file();
    }

    @Override
    public void runTopLevelForms() {
        rdf_uri.setup_rdf_uri_file();
    }

    static {
    }

    public static final class $rdf_uri_p$UnaryFunction extends UnaryFunction {
        public $rdf_uri_p$UnaryFunction() {
            super(extractFunctionNamed("RDF-URI-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return rdf_uri.rdf_uri_p(arg1);
        }
    }
}

/**
 * Total time: 173 ms synthetic
 */
