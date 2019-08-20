/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl.sksi.query_sks;


import static com.cyc.cycjava.cycl.constant_handles.reader_make_constant_shell;
import static com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_kb_accessors.sk_source_complex_logical_schemata;
import static com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_kb_accessors.sk_source_complex_physical_schemata;
import static com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_kb_accessors.sk_source_complex_required_fields;
import static com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_kb_accessors.sk_source_content_mt;
import static com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_kb_accessors.sk_source_ks_type;
import static com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_kb_accessors.sk_source_mapping_mt;
import static com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_kb_accessors.sksi_content_mt_p;
import static com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_kb_accessors.sksi_mapping_mt_p;
import static com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_sks_accessors.sks_p;
import static com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_sks_accessors.sks_type_p;
import static com.cyc.cycjava.cycl.subl_macro_promotions.$catch_error_message_target$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_greater;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_space;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.append;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.equal;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.identity;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.pointer;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.funcall;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.write;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.cconcatenate;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.def_csetf;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.makeStructDeclNative;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.register_method;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.gensym;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.integerp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.stringp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.type_of;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cadr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cddr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.copy_tree;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.$print_object_method_table$;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.$print_readably$;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.print_not_readable;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.write_char;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.write_string;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.defconstant;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;
import static com.cyc.tool.subl.util.SubLFiles.defvar;

import org.armedbear.lisp.Lisp;

import com.cyc.cycjava.cycl.V12;
import com.cyc.cycjava.cycl.dictionary;
import com.cyc.cycjava.cycl.dictionary_contents;
import com.cyc.cycjava.cycl.dictionary_utilities;
import com.cyc.cycjava.cycl.format_nil;
import com.cyc.cycjava.cycl.integer_sequence_generator;
import com.cyc.cycjava.cycl.kb_utilities;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.mt_relevance_macros;
import com.cyc.cycjava.cycl.string_utilities;
import com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_kb_accessors;
import com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_sks_accessors;
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
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_macros;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.util.SubLFiles.LispMethod;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      SKSI-QUERY-DATASTRUCTURES
 * source file: /cyc/top/cycl/sksi/query-sks/sksi-query-datastructures.lisp
 * created:     2019/07/03 17:38:33
 */
public final class sksi_query_datastructures extends SubLTranslatedFile implements V12 {
    public static final SubLObject tac_lookup_all_table_alias_pairs(SubLObject tac) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(tac, TABLE_ALIASING_CONTEXT_P);
            {
                SubLObject pairs = NIL;
                SubLObject cdolist_list_var = com.cyc.cycjava.cycl.sksi.query_sks.sksi_query_datastructures.tac_lits(tac);
                SubLObject lit = NIL;
                for (lit = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , lit = cdolist_list_var.first()) {
                    {
                        SubLObject lit_aliases = dictionary.dictionary_lookup(com.cyc.cycjava.cycl.sksi.query_sks.sksi_query_datastructures.tac_aliases(tac), lit, UNPROVIDED);
                        SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(lit_aliases));
                        while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)) {
                            thread.resetMultipleValues();
                            {
                                SubLObject key = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                SubLObject lit_index_aliases = thread.secondMultipleValue();
                                thread.resetMultipleValues();
                                {
                                    SubLObject iteration_state_4 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(lit_index_aliases));
                                    while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_4)) {
                                        thread.resetMultipleValues();
                                        {
                                            SubLObject table = dictionary_contents.do_dictionary_contents_key_value(iteration_state_4);
                                            SubLObject alias = thread.secondMultipleValue();
                                            thread.resetMultipleValues();
                                            pairs = cons(list(table, alias), pairs);
                                            iteration_state_4 = dictionary_contents.do_dictionary_contents_next(iteration_state_4);
                                        }
                                    } 
                                    dictionary_contents.do_dictionary_contents_finalize(iteration_state_4);
                                }
                                iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state);
                            }
                        } 
                        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                    }
                }
                return list_utilities.fast_delete_duplicates(pairs, symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            }
        }
    }

    public static final SubLFile me = new sksi_query_datastructures();



    // defconstant
    @LispMethod(comment = "defconstant")
    public static final SubLSymbol $dtp_sks_profile$ = makeSymbol("*DTP-SKS-PROFILE*");

    // defvar
    @LispMethod(comment = "defvar")
    private static final SubLSymbol $conjunctive_sparql_supportedP$ = makeSymbol("*CONJUNCTIVE-SPARQL-SUPPORTED?*");

    // defconstant
    @LispMethod(comment = "defconstant")
    public static final SubLSymbol $dtp_table_aliasing_context$ = makeSymbol("*DTP-TABLE-ALIASING-CONTEXT*");

    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $table_alias_isg$ = makeSymbol("*TABLE-ALIAS-ISG*");

    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    private static final SubLSymbol SKS_PROFILE = makeSymbol("SKS-PROFILE");

    private static final SubLSymbol SKS_PROFILE_P = makeSymbol("SKS-PROFILE-P");

    static private final SubLList $list2 = list(makeSymbol("SKS"), makeSymbol("TYPE"), makeSymbol("CONTENT-MT"), makeSymbol("MAPPING-MT"), makeSymbol("LOGICAL-SCHEMATA"), makeSymbol("PHYSICAL-SCHEMATA"), makeSymbol("REQUIRED-FIELDS"));

    static private final SubLList $list3 = list(makeKeyword("SKS"), $TYPE, makeKeyword("CONTENT-MT"), makeKeyword("MAPPING-MT"), makeKeyword("LOGICAL-SCHEMATA"), makeKeyword("PHYSICAL-SCHEMATA"), makeKeyword("REQUIRED-FIELDS"));

    static private final SubLList $list4 = list(makeSymbol("SKS-PROFILE-SKS"), makeSymbol("SKS-PROFILE-TYPE"), makeSymbol("SKS-PROFILE-CONTENT-MT"), makeSymbol("SKS-PROFILE-MAPPING-MT"), makeSymbol("SKS-PROFILE-LOGICAL-SCHEMATA"), makeSymbol("SKS-PROFILE-PHYSICAL-SCHEMATA"), makeSymbol("SKS-PROFILE-REQUIRED-FIELDS"));

    static private final SubLList $list5 = list(makeSymbol("_CSETF-SKS-PROFILE-SKS"), makeSymbol("_CSETF-SKS-PROFILE-TYPE"), makeSymbol("_CSETF-SKS-PROFILE-CONTENT-MT"), makeSymbol("_CSETF-SKS-PROFILE-MAPPING-MT"), makeSymbol("_CSETF-SKS-PROFILE-LOGICAL-SCHEMATA"), makeSymbol("_CSETF-SKS-PROFILE-PHYSICAL-SCHEMATA"), makeSymbol("_CSETF-SKS-PROFILE-REQUIRED-FIELDS"));

    private static final SubLSymbol SKS_PROFILE_PRINT = makeSymbol("SKS-PROFILE-PRINT");

    private static final SubLSymbol SKS_PROFILE_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("SKS-PROFILE-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLList $list8 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("SKS-PROFILE-P"));

    private static final SubLSymbol SKS_PROFILE_SKS = makeSymbol("SKS-PROFILE-SKS");

    private static final SubLSymbol _CSETF_SKS_PROFILE_SKS = makeSymbol("_CSETF-SKS-PROFILE-SKS");

    private static final SubLSymbol SKS_PROFILE_TYPE = makeSymbol("SKS-PROFILE-TYPE");

    private static final SubLSymbol _CSETF_SKS_PROFILE_TYPE = makeSymbol("_CSETF-SKS-PROFILE-TYPE");

    private static final SubLSymbol SKS_PROFILE_CONTENT_MT = makeSymbol("SKS-PROFILE-CONTENT-MT");

    private static final SubLSymbol _CSETF_SKS_PROFILE_CONTENT_MT = makeSymbol("_CSETF-SKS-PROFILE-CONTENT-MT");

    private static final SubLSymbol SKS_PROFILE_MAPPING_MT = makeSymbol("SKS-PROFILE-MAPPING-MT");

    private static final SubLSymbol _CSETF_SKS_PROFILE_MAPPING_MT = makeSymbol("_CSETF-SKS-PROFILE-MAPPING-MT");

    private static final SubLSymbol SKS_PROFILE_LOGICAL_SCHEMATA = makeSymbol("SKS-PROFILE-LOGICAL-SCHEMATA");

    private static final SubLSymbol _CSETF_SKS_PROFILE_LOGICAL_SCHEMATA = makeSymbol("_CSETF-SKS-PROFILE-LOGICAL-SCHEMATA");

    private static final SubLSymbol SKS_PROFILE_PHYSICAL_SCHEMATA = makeSymbol("SKS-PROFILE-PHYSICAL-SCHEMATA");

    private static final SubLSymbol _CSETF_SKS_PROFILE_PHYSICAL_SCHEMATA = makeSymbol("_CSETF-SKS-PROFILE-PHYSICAL-SCHEMATA");

    private static final SubLSymbol SKS_PROFILE_REQUIRED_FIELDS = makeSymbol("SKS-PROFILE-REQUIRED-FIELDS");

    private static final SubLSymbol _CSETF_SKS_PROFILE_REQUIRED_FIELDS = makeSymbol("_CSETF-SKS-PROFILE-REQUIRED-FIELDS");

    private static final SubLString $str30$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");

    private static final SubLSymbol MAKE_SKS_PROFILE = makeSymbol("MAKE-SKS-PROFILE");

    private static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_SKS_PROFILE_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-SKS-PROFILE-METHOD");

    private static final SubLString $str36$_a = makeString("~a");

    private static final SubLObject $$Database_Physical = reader_make_constant_shell("Database-Physical");

    private static final SubLObject $$RDFTripleStore_Physical = reader_make_constant_shell("RDFTripleStore-Physical");

    private static final SubLString $str40$SKS___a__ = makeString("SKS: ~a~%");

    private static final SubLString $str41$SKS_Type___a__ = makeString("SKS Type: ~a~%");

    private static final SubLString $str42$Content_Mt___a__ = makeString("Content Mt: ~a~%");

    private static final SubLString $str43$Mapping_Mt___a__ = makeString("Mapping Mt: ~a~%");

    private static final SubLString $str44$Logical_Schemata___a__ = makeString("Logical Schemata: ~a~%");

    private static final SubLString $str45$Physical_Schemata___a__ = makeString("Physical Schemata: ~a~%");

    private static final SubLString $str46$Required_Fields___a__ = makeString("Required Fields: ~a~%");

    private static final SubLSymbol TABLE_ALIASING_CONTEXT = makeSymbol("TABLE-ALIASING-CONTEXT");

    private static final SubLSymbol TABLE_ALIASING_CONTEXT_P = makeSymbol("TABLE-ALIASING-CONTEXT-P");

    static private final SubLList $list49 = list(makeSymbol("LITS"), makeSymbol("ALIASES"), makeSymbol("PRIMARY-KEYS"), makeSymbol("PRIMARY-KEY-LITS"), makeSymbol("FIXED?"), makeSymbol("NAMESPACES"));

    private static final SubLList $list50 = list($LITS, makeKeyword("ALIASES"), makeKeyword("PRIMARY-KEYS"), makeKeyword("PRIMARY-KEY-LITS"), makeKeyword("FIXED?"), makeKeyword("NAMESPACES"));

    private static final SubLList $list51 = list(makeSymbol("TAC-LITS"), makeSymbol("TAC-ALIASES"), makeSymbol("TAC-PRIMARY-KEYS"), makeSymbol("TAC-PRIMARY-KEY-LITS"), makeSymbol("TAC-FIXED?"), makeSymbol("TAC-NAMESPACES"));

    private static final SubLList $list52 = list(makeSymbol("_CSETF-TAC-LITS"), makeSymbol("_CSETF-TAC-ALIASES"), makeSymbol("_CSETF-TAC-PRIMARY-KEYS"), makeSymbol("_CSETF-TAC-PRIMARY-KEY-LITS"), makeSymbol("_CSETF-TAC-FIXED?"), makeSymbol("_CSETF-TAC-NAMESPACES"));

    private static final SubLSymbol TABLE_ALIASING_CONTEXT_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("TABLE-ALIASING-CONTEXT-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLList $list55 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("TABLE-ALIASING-CONTEXT-P"));

    private static final SubLSymbol TAC_LITS = makeSymbol("TAC-LITS");

    private static final SubLSymbol _CSETF_TAC_LITS = makeSymbol("_CSETF-TAC-LITS");

    private static final SubLSymbol TAC_ALIASES = makeSymbol("TAC-ALIASES");

    private static final SubLSymbol _CSETF_TAC_ALIASES = makeSymbol("_CSETF-TAC-ALIASES");

    private static final SubLSymbol TAC_PRIMARY_KEYS = makeSymbol("TAC-PRIMARY-KEYS");

    private static final SubLSymbol _CSETF_TAC_PRIMARY_KEYS = makeSymbol("_CSETF-TAC-PRIMARY-KEYS");

    private static final SubLSymbol TAC_PRIMARY_KEY_LITS = makeSymbol("TAC-PRIMARY-KEY-LITS");

    private static final SubLSymbol _CSETF_TAC_PRIMARY_KEY_LITS = makeSymbol("_CSETF-TAC-PRIMARY-KEY-LITS");

    private static final SubLSymbol $sym64$TAC_FIXED_ = makeSymbol("TAC-FIXED?");

    private static final SubLSymbol $sym65$_CSETF_TAC_FIXED_ = makeSymbol("_CSETF-TAC-FIXED?");

    private static final SubLSymbol TAC_NAMESPACES = makeSymbol("TAC-NAMESPACES");

    private static final SubLSymbol _CSETF_TAC_NAMESPACES = makeSymbol("_CSETF-TAC-NAMESPACES");

    private static final SubLSymbol $PRIMARY_KEY_LITS = makeKeyword("PRIMARY-KEY-LITS");

    private static final SubLSymbol MAKE_TABLE_ALIASING_CONTEXT = makeSymbol("MAKE-TABLE-ALIASING-CONTEXT");

    private static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_TABLE_ALIASING_CONTEXT_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-TABLE-ALIASING-CONTEXT-METHOD");

    private static final SubLString $str78$__ = makeString("~%");

    private static final SubLString $str79$_s__ = makeString("~s~%");

    private static final SubLString $str80$_____s__ = makeString(" -> ~s~%");

    private static final SubLString $str81$________s_____s__ = makeString("    -> ~s -> ~s~%");

    public static final SubLObject sks_profile_print_function_trampoline_alt(SubLObject v_object, SubLObject stream) {
        com.cyc.cycjava.cycl.sksi.query_sks.sksi_query_datastructures.sks_profile_print(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject sks_profile_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        sksi_query_datastructures.sks_profile_print(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject sks_profile_p_alt(SubLObject v_object) {
        return v_object.getClass() == com.cyc.cycjava.cycl.sksi.query_sks.sksi_query_datastructures.$sks_profile_native.class ? ((SubLObject) (T)) : NIL;
    }

    public static SubLObject sks_profile_p(final SubLObject v_object) {
        return v_object.getClass() == com.cyc.cycjava.cycl.sksi.query_sks.sksi_query_datastructures.$sks_profile_native.class ? T : NIL;
    }

    public static final SubLObject sks_profile_sks_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, SKS_PROFILE_P);
        return v_object.getField2();
    }

    public static SubLObject sks_profile_sks(final SubLObject v_object) {
        assert NIL != sksi_query_datastructures.sks_profile_p(v_object) : "! sksi_query_datastructures.sks_profile_p(v_object) " + "sksi_query_datastructures.sks_profile_p error :" + v_object;
        return v_object.getField2();
    }

    public static final SubLObject sks_profile_type_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, SKS_PROFILE_P);
        return v_object.getField3();
    }

    public static SubLObject sks_profile_type(final SubLObject v_object) {
        assert NIL != sksi_query_datastructures.sks_profile_p(v_object) : "! sksi_query_datastructures.sks_profile_p(v_object) " + "sksi_query_datastructures.sks_profile_p error :" + v_object;
        return v_object.getField3();
    }

    public static final SubLObject sks_profile_content_mt_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, SKS_PROFILE_P);
        return v_object.getField4();
    }

    public static SubLObject sks_profile_content_mt(final SubLObject v_object) {
        assert NIL != sksi_query_datastructures.sks_profile_p(v_object) : "! sksi_query_datastructures.sks_profile_p(v_object) " + "sksi_query_datastructures.sks_profile_p error :" + v_object;
        return v_object.getField4();
    }

    public static final SubLObject sks_profile_mapping_mt_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, SKS_PROFILE_P);
        return v_object.getField5();
    }

    public static SubLObject sks_profile_mapping_mt(final SubLObject v_object) {
        assert NIL != sksi_query_datastructures.sks_profile_p(v_object) : "! sksi_query_datastructures.sks_profile_p(v_object) " + "sksi_query_datastructures.sks_profile_p error :" + v_object;
        return v_object.getField5();
    }

    public static final SubLObject sks_profile_logical_schemata_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, SKS_PROFILE_P);
        return v_object.getField6();
    }

    public static SubLObject sks_profile_logical_schemata(final SubLObject v_object) {
        assert NIL != sksi_query_datastructures.sks_profile_p(v_object) : "! sksi_query_datastructures.sks_profile_p(v_object) " + "sksi_query_datastructures.sks_profile_p error :" + v_object;
        return v_object.getField6();
    }

    public static final SubLObject sks_profile_physical_schemata_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, SKS_PROFILE_P);
        return v_object.getField7();
    }

    public static SubLObject sks_profile_physical_schemata(final SubLObject v_object) {
        assert NIL != sksi_query_datastructures.sks_profile_p(v_object) : "! sksi_query_datastructures.sks_profile_p(v_object) " + "sksi_query_datastructures.sks_profile_p error :" + v_object;
        return v_object.getField7();
    }

    public static final SubLObject sks_profile_required_fields_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, SKS_PROFILE_P);
        return v_object.getField8();
    }

    public static SubLObject sks_profile_required_fields(final SubLObject v_object) {
        assert NIL != sksi_query_datastructures.sks_profile_p(v_object) : "! sksi_query_datastructures.sks_profile_p(v_object) " + "sksi_query_datastructures.sks_profile_p error :" + v_object;
        return v_object.getField8();
    }

    public static final SubLObject _csetf_sks_profile_sks_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, SKS_PROFILE_P);
        return v_object.setField2(value);
    }

    public static SubLObject _csetf_sks_profile_sks(final SubLObject v_object, final SubLObject value) {
        assert NIL != sksi_query_datastructures.sks_profile_p(v_object) : "! sksi_query_datastructures.sks_profile_p(v_object) " + "sksi_query_datastructures.sks_profile_p error :" + v_object;
        return v_object.setField2(value);
    }

    public static final SubLObject _csetf_sks_profile_type_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, SKS_PROFILE_P);
        return v_object.setField3(value);
    }

    public static SubLObject _csetf_sks_profile_type(final SubLObject v_object, final SubLObject value) {
        assert NIL != sksi_query_datastructures.sks_profile_p(v_object) : "! sksi_query_datastructures.sks_profile_p(v_object) " + "sksi_query_datastructures.sks_profile_p error :" + v_object;
        return v_object.setField3(value);
    }

    public static final SubLObject _csetf_sks_profile_content_mt_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, SKS_PROFILE_P);
        return v_object.setField4(value);
    }

    public static SubLObject _csetf_sks_profile_content_mt(final SubLObject v_object, final SubLObject value) {
        assert NIL != sksi_query_datastructures.sks_profile_p(v_object) : "! sksi_query_datastructures.sks_profile_p(v_object) " + "sksi_query_datastructures.sks_profile_p error :" + v_object;
        return v_object.setField4(value);
    }

    public static final SubLObject _csetf_sks_profile_mapping_mt_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, SKS_PROFILE_P);
        return v_object.setField5(value);
    }

    public static SubLObject _csetf_sks_profile_mapping_mt(final SubLObject v_object, final SubLObject value) {
        assert NIL != sksi_query_datastructures.sks_profile_p(v_object) : "! sksi_query_datastructures.sks_profile_p(v_object) " + "sksi_query_datastructures.sks_profile_p error :" + v_object;
        return v_object.setField5(value);
    }

    public static final SubLObject _csetf_sks_profile_logical_schemata_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, SKS_PROFILE_P);
        return v_object.setField6(value);
    }

    public static SubLObject _csetf_sks_profile_logical_schemata(final SubLObject v_object, final SubLObject value) {
        assert NIL != sksi_query_datastructures.sks_profile_p(v_object) : "! sksi_query_datastructures.sks_profile_p(v_object) " + "sksi_query_datastructures.sks_profile_p error :" + v_object;
        return v_object.setField6(value);
    }

    public static final SubLObject _csetf_sks_profile_physical_schemata_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, SKS_PROFILE_P);
        return v_object.setField7(value);
    }

    public static SubLObject _csetf_sks_profile_physical_schemata(final SubLObject v_object, final SubLObject value) {
        assert NIL != sksi_query_datastructures.sks_profile_p(v_object) : "! sksi_query_datastructures.sks_profile_p(v_object) " + "sksi_query_datastructures.sks_profile_p error :" + v_object;
        return v_object.setField7(value);
    }

    public static final SubLObject _csetf_sks_profile_required_fields_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, SKS_PROFILE_P);
        return v_object.setField8(value);
    }

    public static SubLObject _csetf_sks_profile_required_fields(final SubLObject v_object, final SubLObject value) {
        assert NIL != sksi_query_datastructures.sks_profile_p(v_object) : "! sksi_query_datastructures.sks_profile_p(v_object) " + "sksi_query_datastructures.sks_profile_p error :" + v_object;
        return v_object.setField8(value);
    }

    public static final SubLObject make_sks_profile_alt(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        {
            SubLObject v_new = new com.cyc.cycjava.cycl.sksi.query_sks.sksi_query_datastructures.$sks_profile_native();
            SubLObject next = NIL;
            for (next = arglist; NIL != next; next = cddr(next)) {
                {
                    SubLObject current_arg = next.first();
                    SubLObject current_value = cadr(next);
                    SubLObject pcase_var = current_arg;
                    if (pcase_var.eql($SKS)) {
                        com.cyc.cycjava.cycl.sksi.query_sks.sksi_query_datastructures._csetf_sks_profile_sks(v_new, current_value);
                    } else {
                        if (pcase_var.eql($TYPE)) {
                            com.cyc.cycjava.cycl.sksi.query_sks.sksi_query_datastructures._csetf_sks_profile_type(v_new, current_value);
                        } else {
                            if (pcase_var.eql($CONTENT_MT)) {
                                com.cyc.cycjava.cycl.sksi.query_sks.sksi_query_datastructures._csetf_sks_profile_content_mt(v_new, current_value);
                            } else {
                                if (pcase_var.eql($MAPPING_MT)) {
                                    com.cyc.cycjava.cycl.sksi.query_sks.sksi_query_datastructures._csetf_sks_profile_mapping_mt(v_new, current_value);
                                } else {
                                    if (pcase_var.eql($LOGICAL_SCHEMATA)) {
                                        com.cyc.cycjava.cycl.sksi.query_sks.sksi_query_datastructures._csetf_sks_profile_logical_schemata(v_new, current_value);
                                    } else {
                                        if (pcase_var.eql($PHYSICAL_SCHEMATA)) {
                                            com.cyc.cycjava.cycl.sksi.query_sks.sksi_query_datastructures._csetf_sks_profile_physical_schemata(v_new, current_value);
                                        } else {
                                            if (pcase_var.eql($REQUIRED_FIELDS)) {
                                                com.cyc.cycjava.cycl.sksi.query_sks.sksi_query_datastructures._csetf_sks_profile_required_fields(v_new, current_value);
                                            } else {
                                                Errors.error($str_alt29$Invalid_slot__S_for_construction_, current_arg);
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

    public static SubLObject make_sks_profile(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new com.cyc.cycjava.cycl.sksi.query_sks.sksi_query_datastructures.$sks_profile_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
            current_arg = next.first();
            current_value = cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql($SKS)) {
                sksi_query_datastructures._csetf_sks_profile_sks(v_new, current_value);
            } else
                if (pcase_var.eql($TYPE)) {
                    sksi_query_datastructures._csetf_sks_profile_type(v_new, current_value);
                } else
                    if (pcase_var.eql($CONTENT_MT)) {
                        sksi_query_datastructures._csetf_sks_profile_content_mt(v_new, current_value);
                    } else
                        if (pcase_var.eql($MAPPING_MT)) {
                            sksi_query_datastructures._csetf_sks_profile_mapping_mt(v_new, current_value);
                        } else
                            if (pcase_var.eql($LOGICAL_SCHEMATA)) {
                                sksi_query_datastructures._csetf_sks_profile_logical_schemata(v_new, current_value);
                            } else
                                if (pcase_var.eql($PHYSICAL_SCHEMATA)) {
                                    sksi_query_datastructures._csetf_sks_profile_physical_schemata(v_new, current_value);
                                } else
                                    if (pcase_var.eql($REQUIRED_FIELDS)) {
                                        sksi_query_datastructures._csetf_sks_profile_required_fields(v_new, current_value);
                                    } else {
                                        Errors.error(sksi_query_datastructures.$str30$Invalid_slot__S_for_construction_, current_arg);
                                    }






        }
        return v_new;
    }

    public static SubLObject visit_defstruct_sks_profile(final SubLObject obj, final SubLObject visitor_fn) {
        funcall(visitor_fn, obj, $BEGIN, sksi_query_datastructures.MAKE_SKS_PROFILE, SEVEN_INTEGER);
        funcall(visitor_fn, obj, $SLOT, $SKS, sksi_query_datastructures.sks_profile_sks(obj));
        funcall(visitor_fn, obj, $SLOT, $TYPE, sksi_query_datastructures.sks_profile_type(obj));
        funcall(visitor_fn, obj, $SLOT, $CONTENT_MT, sksi_query_datastructures.sks_profile_content_mt(obj));
        funcall(visitor_fn, obj, $SLOT, $MAPPING_MT, sksi_query_datastructures.sks_profile_mapping_mt(obj));
        funcall(visitor_fn, obj, $SLOT, $LOGICAL_SCHEMATA, sksi_query_datastructures.sks_profile_logical_schemata(obj));
        funcall(visitor_fn, obj, $SLOT, $PHYSICAL_SCHEMATA, sksi_query_datastructures.sks_profile_physical_schemata(obj));
        funcall(visitor_fn, obj, $SLOT, $REQUIRED_FIELDS, sksi_query_datastructures.sks_profile_required_fields(obj));
        funcall(visitor_fn, obj, $END, sksi_query_datastructures.MAKE_SKS_PROFILE, SEVEN_INTEGER);
        return obj;
    }

    public static SubLObject visit_defstruct_object_sks_profile_method(final SubLObject obj, final SubLObject visitor_fn) {
        return sksi_query_datastructures.visit_defstruct_sks_profile(obj, visitor_fn);
    }

    public static final SubLObject sks_profile_print_alt(SubLObject v_object, SubLObject stream, SubLObject depth) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != $print_readably$.getDynamicValue(thread)) {
                print_not_readable(v_object, stream);
            } else {
                {
                    SubLObject v_object_1 = v_object;
                    SubLObject stream_2 = stream;
                    write_string($str_alt30$__, stream_2, UNPROVIDED, UNPROVIDED);
                    write(type_of(v_object_1), new SubLObject[]{ $STREAM, stream_2 });
                    write_char(CHAR_space, stream_2);
                    format(stream, $str_alt32$_a, com.cyc.cycjava.cycl.sksi.query_sks.sksi_query_datastructures.sks_profile_sks(v_object));
                    write_char(CHAR_space, stream_2);
                    write(pointer(v_object_1), new SubLObject[]{ $STREAM, stream_2, $BASE, SIXTEEN_INTEGER });
                    write_char(CHAR_greater, stream_2);
                }
            }
            return v_object;
        }
    }

    public static SubLObject sks_profile_print(final SubLObject v_object, final SubLObject stream, final SubLObject depth) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != $print_readably$.getDynamicValue(thread)) {
            print_not_readable(v_object, stream);
        } else {
            print_macros.print_unreadable_object_preamble(stream, v_object, T, T);
            format(stream, sksi_query_datastructures.$str36$_a, sksi_query_datastructures.sks_profile_sks(v_object));
            print_macros.print_unreadable_object_postamble(stream, v_object, T, T);
        }
        return v_object;
    }

    public static final SubLObject new_sks_profile_alt(SubLObject sks, SubLObject mt, SubLObject ignore_errorsP) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (ignore_errorsP == UNPROVIDED) {
            ignore_errorsP = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject meta_mt = (NIL != mt) ? ((SubLObject) (mt)) : sksi_kb_accessors.sk_source_mapping_mt(sks);
                SubLObject sp = NIL;
                SubLObject error = NIL;
                try {
                    {
                        SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
                        try {
                            Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                            try {
                                {
                                    SubLObject mt_var = meta_mt;
                                    {
                                        SubLObject _prev_bind_0_3 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                                        SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                                        try {
                                            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt_var), thread);
                                            mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt_var), thread);
                                            {
                                                SubLObject type = sksi_kb_accessors.sk_source_ks_type(sks);
                                                SubLObject content_mt = sksi_kb_accessors.sk_source_content_mt(sks);
                                                SubLObject mapping_mt = sksi_kb_accessors.sk_source_mapping_mt(sks);
                                                SubLObject logical_schemata = sksi_kb_accessors.sk_source_complex_logical_schemata(sks);
                                                SubLObject physical_schemata = sksi_kb_accessors.sk_source_complex_physical_schemata(sks);
                                                SubLObject required_fields = sksi_kb_accessors.sk_source_complex_required_fields(sks);
                                                sp = com.cyc.cycjava.cycl.sksi.query_sks.sksi_query_datastructures.make_sks_profile(UNPROVIDED);
                                                com.cyc.cycjava.cycl.sksi.query_sks.sksi_query_datastructures._csetf_sks_profile_sks(sp, sks);
                                                com.cyc.cycjava.cycl.sksi.query_sks.sksi_query_datastructures._csetf_sks_profile_type(sp, type);
                                                com.cyc.cycjava.cycl.sksi.query_sks.sksi_query_datastructures._csetf_sks_profile_content_mt(sp, content_mt);
                                                com.cyc.cycjava.cycl.sksi.query_sks.sksi_query_datastructures._csetf_sks_profile_mapping_mt(sp, mapping_mt);
                                                com.cyc.cycjava.cycl.sksi.query_sks.sksi_query_datastructures._csetf_sks_profile_logical_schemata(sp, logical_schemata);
                                                com.cyc.cycjava.cycl.sksi.query_sks.sksi_query_datastructures._csetf_sks_profile_physical_schemata(sp, physical_schemata);
                                                com.cyc.cycjava.cycl.sksi.query_sks.sksi_query_datastructures._csetf_sks_profile_required_fields(sp, required_fields);
                                            }
                                        } finally {
                                            mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                                            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0_3, thread);
                                        }
                                    }
                                }
                            } catch (Throwable catch_var) {
                                Errors.handleThrowable(catch_var, NIL);
                            }
                        } finally {
                            Errors.$error_handler$.rebind(_prev_bind_0, thread);
                        }
                    }
                } catch (Throwable ccatch_env_var) {
                    error = Errors.handleThrowable(ccatch_env_var, $catch_error_message_target$.getGlobalValue());
                }
                if (NIL != error) {
                    if (NIL != ignore_errorsP) {
                        Errors.warn(error);
                        sp = NIL;
                    } else {
                        Errors.error(error);
                    }
                }
                return sp;
            }
        }
    }

    public static SubLObject new_sks_profile(final SubLObject sks, SubLObject mt, SubLObject ignore_errorsP) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (ignore_errorsP == UNPROVIDED) {
            ignore_errorsP = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject meta_mt = (NIL != mt) ? mt : sk_source_mapping_mt(sks);
        SubLObject sp = NIL;
        SubLObject error = NIL;
        try {
            thread.throwStack.push($catch_error_message_target$.getGlobalValue());
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                try {
                    final SubLObject mt_var = meta_mt;
                    final SubLObject _prev_bind_0_$1 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt_var), thread);
                        mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt_var), thread);
                        final SubLObject type = sk_source_ks_type(sks);
                        final SubLObject content_mt = sk_source_content_mt(sks);
                        final SubLObject mapping_mt = sk_source_mapping_mt(sks);
                        final SubLObject logical_schemata = sk_source_complex_logical_schemata(sks);
                        final SubLObject physical_schemata = sk_source_complex_physical_schemata(sks);
                        final SubLObject required_fields = sk_source_complex_required_fields(sks);
                        sp = sksi_query_datastructures.make_sks_profile(UNPROVIDED);
                        sksi_query_datastructures._csetf_sks_profile_sks(sp, sks);
                        sksi_query_datastructures._csetf_sks_profile_type(sp, type);
                        sksi_query_datastructures._csetf_sks_profile_content_mt(sp, content_mt);
                        sksi_query_datastructures._csetf_sks_profile_mapping_mt(sp, mapping_mt);
                        sksi_query_datastructures._csetf_sks_profile_logical_schemata(sp, logical_schemata);
                        sksi_query_datastructures._csetf_sks_profile_physical_schemata(sp, physical_schemata);
                        sksi_query_datastructures._csetf_sks_profile_required_fields(sp, required_fields);
                    } finally {
                        mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0_$1, thread);
                    }
                } catch (final Throwable catch_var) {
                    Errors.handleThrowable(catch_var, NIL);
                }
            } finally {
                Errors.$error_handler$.rebind(_prev_bind_0, thread);
            }
        } catch (final Throwable ccatch_env_var) {
            error = Errors.handleThrowable(ccatch_env_var, $catch_error_message_target$.getGlobalValue());
        } finally {
            thread.throwStack.pop();
        }
        if (NIL != error) {
            if (NIL != ignore_errorsP) {
                Errors.warn(error);
                sp = NIL;
            } else {
                Errors.error(error);
            }
        }
        return sp;
    }

    public static final SubLObject valid_sks_profile_alt(SubLObject sp) {
        return makeBoolean((((((((NIL != com.cyc.cycjava.cycl.sksi.query_sks.sksi_query_datastructures.sks_profile_p(sp)) && (NIL != sksi_sks_accessors.sks_p(com.cyc.cycjava.cycl.sksi.query_sks.sksi_query_datastructures.sks_profile_sks(sp)))) && (NIL != sksi_sks_accessors.sks_type_p(com.cyc.cycjava.cycl.sksi.query_sks.sksi_query_datastructures.sks_profile_type(sp)))) && (NIL != sksi_kb_accessors.sksi_content_mt_p(com.cyc.cycjava.cycl.sksi.query_sks.sksi_query_datastructures.sks_profile_content_mt(sp)))) && (NIL != sksi_kb_accessors.sksi_mapping_mt_p(com.cyc.cycjava.cycl.sksi.query_sks.sksi_query_datastructures.sks_profile_mapping_mt(sp)))) && (NIL != list_utilities.non_empty_list_p(com.cyc.cycjava.cycl.sksi.query_sks.sksi_query_datastructures.sks_profile_logical_schemata(sp)))) && (NIL != list_utilities.non_empty_list_p(com.cyc.cycjava.cycl.sksi.query_sks.sksi_query_datastructures.sks_profile_physical_schemata(sp)))) && com.cyc.cycjava.cycl.sksi.query_sks.sksi_query_datastructures.sks_profile_required_fields(sp).isList());
    }

    public static SubLObject valid_sks_profile(final SubLObject sp) {
        return makeBoolean((((((((NIL != sksi_query_datastructures.sks_profile_p(sp)) && (NIL != sks_p(sksi_query_datastructures.sks_profile_sks(sp)))) && (NIL != sks_type_p(sksi_query_datastructures.sks_profile_type(sp)))) && (NIL != sksi_content_mt_p(sksi_query_datastructures.sks_profile_content_mt(sp)))) && (NIL != sksi_mapping_mt_p(sksi_query_datastructures.sks_profile_mapping_mt(sp)))) && (NIL != list_utilities.non_empty_list_p(sksi_query_datastructures.sks_profile_logical_schemata(sp)))) && (NIL != list_utilities.non_empty_list_p(sksi_query_datastructures.sks_profile_physical_schemata(sp)))) && sksi_query_datastructures.sks_profile_required_fields(sp).isList());
    }

    public static final SubLObject valid_and_supported_sks_profile_alt(SubLObject sp) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return makeBoolean((NIL != com.cyc.cycjava.cycl.sksi.query_sks.sksi_query_datastructures.valid_sks_profile(sp)) && ((com.cyc.cycjava.cycl.sksi.query_sks.sksi_query_datastructures.sks_profile_type(sp) == $$Database_Physical) || (((NIL != $conjunctive_sparql_supportedP$.getDynamicValue(thread)) && (com.cyc.cycjava.cycl.sksi.query_sks.sksi_query_datastructures.sks_profile_type(sp) == $$RDFTripleStore_Physical)) && (NIL != sksi_sks_accessors.sks_atomic_p(com.cyc.cycjava.cycl.sksi.query_sks.sksi_query_datastructures.sks_profile_sks(sp))))));
        }
    }

    public static SubLObject valid_and_supported_sks_profile(final SubLObject sp) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return makeBoolean((NIL != sksi_query_datastructures.valid_sks_profile(sp)) && ((NIL != kb_utilities.kbeq(sksi_query_datastructures.sks_profile_type(sp), sksi_query_datastructures.$$Database_Physical)) || ((NIL != sksi_query_datastructures.$conjunctive_sparql_supportedP$.getDynamicValue(thread)) && (NIL != kb_utilities.kbeq(sksi_query_datastructures.sks_profile_type(sp), sksi_query_datastructures.$$RDFTripleStore_Physical)))));
    }

    public static final SubLObject print_sks_profile_contents_alt(SubLObject sp, SubLObject stream) {
        if (stream == UNPROVIDED) {
            stream = NIL;
        }
        format(stream, $str_alt37$SKS___a__, com.cyc.cycjava.cycl.sksi.query_sks.sksi_query_datastructures.sks_profile_sks(sp));
        format(stream, $str_alt38$SKS_Type___a__, com.cyc.cycjava.cycl.sksi.query_sks.sksi_query_datastructures.sks_profile_type(sp));
        format(stream, $str_alt39$Content_Mt___a__, com.cyc.cycjava.cycl.sksi.query_sks.sksi_query_datastructures.sks_profile_content_mt(sp));
        format(stream, $str_alt40$Mapping_Mt___a__, com.cyc.cycjava.cycl.sksi.query_sks.sksi_query_datastructures.sks_profile_mapping_mt(sp));
        format(stream, $str_alt41$Logical_Schemata___a__, com.cyc.cycjava.cycl.sksi.query_sks.sksi_query_datastructures.sks_profile_logical_schemata(sp));
        format(stream, $str_alt42$Physical_Schemata___a__, com.cyc.cycjava.cycl.sksi.query_sks.sksi_query_datastructures.sks_profile_physical_schemata(sp));
        format(stream, $str_alt43$Required_Fields___a__, com.cyc.cycjava.cycl.sksi.query_sks.sksi_query_datastructures.sks_profile_required_fields(sp));
        return NIL;
    }

    public static SubLObject print_sks_profile_contents(final SubLObject sp, SubLObject stream) {
        if (stream == UNPROVIDED) {
            stream = NIL;
        }
        format(stream, sksi_query_datastructures.$str40$SKS___a__, sksi_query_datastructures.sks_profile_sks(sp));
        format(stream, sksi_query_datastructures.$str41$SKS_Type___a__, sksi_query_datastructures.sks_profile_type(sp));
        format(stream, sksi_query_datastructures.$str42$Content_Mt___a__, sksi_query_datastructures.sks_profile_content_mt(sp));
        format(stream, sksi_query_datastructures.$str43$Mapping_Mt___a__, sksi_query_datastructures.sks_profile_mapping_mt(sp));
        format(stream, sksi_query_datastructures.$str44$Logical_Schemata___a__, sksi_query_datastructures.sks_profile_logical_schemata(sp));
        format(stream, sksi_query_datastructures.$str45$Physical_Schemata___a__, sksi_query_datastructures.sks_profile_physical_schemata(sp));
        format(stream, sksi_query_datastructures.$str46$Required_Fields___a__, sksi_query_datastructures.sks_profile_required_fields(sp));
        return NIL;
    }

    public static final SubLObject table_aliasing_context_print_function_trampoline_alt(SubLObject v_object, SubLObject stream) {
        compatibility.default_struct_print_function(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject table_aliasing_context_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        compatibility.default_struct_print_function(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject table_aliasing_context_p_alt(SubLObject v_object) {
        return v_object.getClass() == com.cyc.cycjava.cycl.sksi.query_sks.sksi_query_datastructures.$table_aliasing_context_native.class ? ((SubLObject) (T)) : NIL;
    }

    public static SubLObject table_aliasing_context_p(final SubLObject v_object) {
        return v_object.getClass() == com.cyc.cycjava.cycl.sksi.query_sks.sksi_query_datastructures.$table_aliasing_context_native.class ? T : NIL;
    }

    public static final SubLObject tac_lits_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, sksi_query_datastructures.TABLE_ALIASING_CONTEXT_P);
        return (($table_aliasing_context_native)v_object).$lits;
    }

    public static SubLObject tac_lits(final SubLObject v_object) {
        assert NIL != sksi_query_datastructures.table_aliasing_context_p(v_object) : "! sksi_query_datastructures.table_aliasing_context_p(v_object) " + "sksi_query_datastructures.table_aliasing_context_p error :" + v_object;
        return v_object.getField2();
    }

    public static final SubLObject tac_aliases_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, sksi_query_datastructures.TABLE_ALIASING_CONTEXT_P);
        return (($table_aliasing_context_native)v_object).$aliases;
    }

    public static SubLObject tac_aliases(final SubLObject v_object) {
        assert NIL != sksi_query_datastructures.table_aliasing_context_p(v_object) : "! sksi_query_datastructures.table_aliasing_context_p(v_object) " + "sksi_query_datastructures.table_aliasing_context_p error :" + v_object;
        return v_object.getField3();
    }

    public static final SubLObject tac_primary_keys_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, sksi_query_datastructures.TABLE_ALIASING_CONTEXT_P);
        return (($table_aliasing_context_native)v_object).$primary_keys;
    }

    public static SubLObject tac_primary_keys(final SubLObject v_object) {
        assert NIL != sksi_query_datastructures.table_aliasing_context_p(v_object) : "! sksi_query_datastructures.table_aliasing_context_p(v_object) " + "sksi_query_datastructures.table_aliasing_context_p error :" + v_object;
        return v_object.getField4();
    }

    public static SubLObject tac_primary_key_lits(final SubLObject v_object) {
        assert NIL != sksi_query_datastructures.table_aliasing_context_p(v_object) : "! sksi_query_datastructures.table_aliasing_context_p(v_object) " + "sksi_query_datastructures.table_aliasing_context_p error :" + v_object;
        return v_object.getField5();
    }

    public static final SubLObject tac_fixedP_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, sksi_query_datastructures.TABLE_ALIASING_CONTEXT_P);
        return (($table_aliasing_context_native)v_object).$fixedP;
    }

    public static SubLObject tac_fixedP(final SubLObject v_object) {
        assert NIL != sksi_query_datastructures.table_aliasing_context_p(v_object) : "! sksi_query_datastructures.table_aliasing_context_p(v_object) " + "sksi_query_datastructures.table_aliasing_context_p error :" + v_object;
        return v_object.getField6();
    }

    public static SubLObject tac_namespaces(final SubLObject v_object) {
        assert NIL != sksi_query_datastructures.table_aliasing_context_p(v_object) : "! sksi_query_datastructures.table_aliasing_context_p(v_object) " + "sksi_query_datastructures.table_aliasing_context_p error :" + v_object;
        return v_object.getField7();
    }

    public static final SubLObject _csetf_tac_lits_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, sksi_query_datastructures.TABLE_ALIASING_CONTEXT_P);
        return (($table_aliasing_context_native)v_object).$lits = (value);
    }

    public static SubLObject _csetf_tac_lits(final SubLObject v_object, final SubLObject value) {
        assert NIL != sksi_query_datastructures.table_aliasing_context_p(v_object) : "! sksi_query_datastructures.table_aliasing_context_p(v_object) " + "sksi_query_datastructures.table_aliasing_context_p error :" + v_object;
        return v_object.setField2(value);
    }

    public static final SubLObject _csetf_tac_aliases_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, sksi_query_datastructures.TABLE_ALIASING_CONTEXT_P);
        return (($table_aliasing_context_native)v_object).$aliases = (value);
    }

    public static SubLObject _csetf_tac_aliases(final SubLObject v_object, final SubLObject value) {
        assert NIL != sksi_query_datastructures.table_aliasing_context_p(v_object) : "! sksi_query_datastructures.table_aliasing_context_p(v_object) " + "sksi_query_datastructures.table_aliasing_context_p error :" + v_object;
        return v_object.setField3(value);
    }

    public static final SubLObject _csetf_tac_primary_keys_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, sksi_query_datastructures.TABLE_ALIASING_CONTEXT_P);
        return (($table_aliasing_context_native)v_object).$primary_keys = (value);
    }

    public static SubLObject _csetf_tac_primary_keys(final SubLObject v_object, final SubLObject value) {
        assert NIL != sksi_query_datastructures.table_aliasing_context_p(v_object) : "! sksi_query_datastructures.table_aliasing_context_p(v_object) " + "sksi_query_datastructures.table_aliasing_context_p error :" + v_object;
        return v_object.setField4(value);
    }

    public static SubLObject _csetf_tac_primary_key_lits(final SubLObject v_object, final SubLObject value) {
        assert NIL != sksi_query_datastructures.table_aliasing_context_p(v_object) : "! sksi_query_datastructures.table_aliasing_context_p(v_object) " + "sksi_query_datastructures.table_aliasing_context_p error :" + v_object;
        return v_object.setField5(value);
    }

    public static final SubLObject _csetf_tac_fixedP_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, sksi_query_datastructures.TABLE_ALIASING_CONTEXT_P);
        return (($table_aliasing_context_native)v_object).$fixedP = (value);
    }

    public static SubLObject _csetf_tac_fixedP(final SubLObject v_object, final SubLObject value) {
        assert NIL != sksi_query_datastructures.table_aliasing_context_p(v_object) : "! sksi_query_datastructures.table_aliasing_context_p(v_object) " + "sksi_query_datastructures.table_aliasing_context_p error :" + v_object;
        return v_object.setField6(value);
    }

    public static SubLObject _csetf_tac_namespaces(final SubLObject v_object, final SubLObject value) {
        assert NIL != sksi_query_datastructures.table_aliasing_context_p(v_object) : "! sksi_query_datastructures.table_aliasing_context_p(v_object) " + "sksi_query_datastructures.table_aliasing_context_p error :" + v_object;
        return v_object.setField7(value);
    }

    public static final SubLObject make_table_aliasing_context_alt(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        {
            SubLObject v_new = new com.cyc.cycjava.cycl.sksi.query_sks.sksi_query_datastructures.$table_aliasing_context_native();
            SubLObject next = NIL;
            for (next = arglist; NIL != next; next = cddr(next)) {
                {
                    SubLObject current_arg = next.first();
                    SubLObject current_value = cadr(next);
                    SubLObject pcase_var = current_arg;
                    if (pcase_var.eql($LITS)) {
                        com.cyc.cycjava.cycl.sksi.query_sks.sksi_query_datastructures._csetf_tac_lits(v_new, current_value);
                    } else {
                        if (pcase_var.eql($ALIASES)) {
                            com.cyc.cycjava.cycl.sksi.query_sks.sksi_query_datastructures._csetf_tac_aliases(v_new, current_value);
                        } else {
                            if (pcase_var.eql($PRIMARY_KEYS)) {
                                com.cyc.cycjava.cycl.sksi.query_sks.sksi_query_datastructures._csetf_tac_primary_keys(v_new, current_value);
                            } else {
                                if (pcase_var.eql($FIXED_)) {
                                    com.cyc.cycjava.cycl.sksi.query_sks.sksi_query_datastructures._csetf_tac_fixedP(v_new, current_value);
                                } else {
                                    Errors.error($str_alt29$Invalid_slot__S_for_construction_, current_arg);
                                }
                            }
                        }
                    }
                }
            }
            return v_new;
        }
    }

    public static SubLObject make_table_aliasing_context(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new com.cyc.cycjava.cycl.sksi.query_sks.sksi_query_datastructures.$table_aliasing_context_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
            current_arg = next.first();
            current_value = cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql($LITS)) {
                sksi_query_datastructures._csetf_tac_lits(v_new, current_value);
            } else
                if (pcase_var.eql($ALIASES)) {
                    sksi_query_datastructures._csetf_tac_aliases(v_new, current_value);
                } else
                    if (pcase_var.eql($PRIMARY_KEYS)) {
                        sksi_query_datastructures._csetf_tac_primary_keys(v_new, current_value);
                    } else
                        if (pcase_var.eql(sksi_query_datastructures.$PRIMARY_KEY_LITS)) {
                            sksi_query_datastructures._csetf_tac_primary_key_lits(v_new, current_value);
                        } else
                            if (pcase_var.eql($FIXED_)) {
                                sksi_query_datastructures._csetf_tac_fixedP(v_new, current_value);
                            } else
                                if (pcase_var.eql($NAMESPACES)) {
                                    sksi_query_datastructures._csetf_tac_namespaces(v_new, current_value);
                                } else {
                                    Errors.error(sksi_query_datastructures.$str30$Invalid_slot__S_for_construction_, current_arg);
                                }





        }
        return v_new;
    }

    public static SubLObject visit_defstruct_table_aliasing_context(final SubLObject obj, final SubLObject visitor_fn) {
        funcall(visitor_fn, obj, $BEGIN, sksi_query_datastructures.MAKE_TABLE_ALIASING_CONTEXT, SIX_INTEGER);
        funcall(visitor_fn, obj, $SLOT, $LITS, sksi_query_datastructures.tac_lits(obj));
        funcall(visitor_fn, obj, $SLOT, $ALIASES, sksi_query_datastructures.tac_aliases(obj));
        funcall(visitor_fn, obj, $SLOT, $PRIMARY_KEYS, sksi_query_datastructures.tac_primary_keys(obj));
        funcall(visitor_fn, obj, $SLOT, sksi_query_datastructures.$PRIMARY_KEY_LITS, sksi_query_datastructures.tac_primary_key_lits(obj));
        funcall(visitor_fn, obj, $SLOT, $FIXED_, sksi_query_datastructures.tac_fixedP(obj));
        funcall(visitor_fn, obj, $SLOT, $NAMESPACES, sksi_query_datastructures.tac_namespaces(obj));
        funcall(visitor_fn, obj, $END, sksi_query_datastructures.MAKE_TABLE_ALIASING_CONTEXT, SIX_INTEGER);
        return obj;
    }

    public static SubLObject visit_defstruct_object_table_aliasing_context_method(final SubLObject obj, final SubLObject visitor_fn) {
        return sksi_query_datastructures.visit_defstruct_table_aliasing_context(obj, visitor_fn);
    }

    public static final SubLObject new_table_aliasing_context_alt() {
        {
            SubLObject tac = com.cyc.cycjava.cycl.sksi.query_sks.sksi_query_datastructures.make_table_aliasing_context(UNPROVIDED);
            com.cyc.cycjava.cycl.sksi.query_sks.sksi_query_datastructures._csetf_tac_aliases(tac, dictionary.new_dictionary(symbol_function(EQUAL), UNPROVIDED));
            com.cyc.cycjava.cycl.sksi.query_sks.sksi_query_datastructures._csetf_tac_primary_keys(tac, dictionary.new_dictionary(symbol_function(EQUAL), UNPROVIDED));
            return tac;
        }
    }

    public static SubLObject new_table_aliasing_context() {
        final SubLObject tac = sksi_query_datastructures.make_table_aliasing_context(UNPROVIDED);
        sksi_query_datastructures._csetf_tac_aliases(tac, dictionary.new_dictionary(symbol_function(EQUAL), UNPROVIDED));
        sksi_query_datastructures._csetf_tac_primary_keys(tac, dictionary.new_dictionary(symbol_function(EQUAL), UNPROVIDED));
        sksi_query_datastructures._csetf_tac_namespaces(tac, dictionary.new_dictionary(symbol_function(EQUAL), UNPROVIDED));
        return tac;
    }

    public static SubLObject copy_table_aliasing_context(final SubLObject tac) {
        final SubLObject new_tac = sksi_query_datastructures.make_table_aliasing_context(UNPROVIDED);
        sksi_query_datastructures._csetf_tac_lits(new_tac, copy_tree(sksi_query_datastructures.tac_lits(tac)));
        sksi_query_datastructures._csetf_tac_aliases(new_tac, dictionary_utilities.copy_dictionary_recursive(sksi_query_datastructures.tac_aliases(tac)));
        sksi_query_datastructures._csetf_tac_primary_keys(new_tac, dictionary_utilities.copy_dictionary_recursive(sksi_query_datastructures.tac_primary_keys(tac)));
        sksi_query_datastructures._csetf_tac_namespaces(new_tac, dictionary_utilities.copy_dictionary_recursive(sksi_query_datastructures.tac_namespaces(tac)));
        return new_tac;
    }

    public static final SubLObject tac_lit_has_alias_indexP_alt(SubLObject tac, SubLObject lit, SubLObject alias_index) {
        {
            SubLObject lit_entry = dictionary.dictionary_lookup(com.cyc.cycjava.cycl.sksi.query_sks.sksi_query_datastructures.tac_aliases(tac), lit, UNPROVIDED);
            SubLObject index_entry = (NIL != dictionary.dictionary_p(lit_entry)) ? ((SubLObject) (dictionary.dictionary_lookup(lit_entry, alias_index, UNPROVIDED))) : NIL;
            return dictionary.dictionary_p(index_entry);
        }
    }

    public static SubLObject tac_lit_has_alias_indexP(final SubLObject tac, final SubLObject lit, final SubLObject alias_index) {
        final SubLObject lit_entry = dictionary.dictionary_lookup(sksi_query_datastructures.tac_aliases(tac), lit, UNPROVIDED);
        final SubLObject index_entry = (NIL != dictionary.dictionary_p(lit_entry)) ? dictionary.dictionary_lookup(lit_entry, alias_index, UNPROVIDED) : NIL;
        return dictionary.dictionary_p(index_entry);
    }

    public static final SubLObject tac_lit_tables_alt(SubLObject tac, SubLObject lit, SubLObject alias_index) {
        {
            SubLObject lit_entry = dictionary.dictionary_lookup(com.cyc.cycjava.cycl.sksi.query_sks.sksi_query_datastructures.tac_aliases(tac), lit, UNPROVIDED);
            SubLObject index_entry = (NIL != dictionary.dictionary_p(lit_entry)) ? ((SubLObject) (dictionary.dictionary_lookup(lit_entry, alias_index, UNPROVIDED))) : NIL;
            return NIL != dictionary.dictionary_p(index_entry) ? ((SubLObject) (dictionary.dictionary_keys(index_entry))) : NIL;
        }
    }

    public static SubLObject tac_lit_tables(final SubLObject tac, final SubLObject lit, final SubLObject alias_index) {
        final SubLObject lit_entry = dictionary.dictionary_lookup(sksi_query_datastructures.tac_aliases(tac), lit, UNPROVIDED);
        final SubLObject index_entry = (NIL != dictionary.dictionary_p(lit_entry)) ? dictionary.dictionary_lookup(lit_entry, alias_index, UNPROVIDED) : NIL;
        return NIL != dictionary.dictionary_p(index_entry) ? dictionary.dictionary_keys(index_entry) : NIL;
    }

    public static final SubLObject tac_lit_table_alias_alt(SubLObject tac, SubLObject lit, SubLObject alias_index, SubLObject table) {
        {
            SubLObject lit_entry = dictionary.dictionary_lookup(com.cyc.cycjava.cycl.sksi.query_sks.sksi_query_datastructures.tac_aliases(tac), lit, UNPROVIDED);
            SubLObject index_entry = (NIL != dictionary.dictionary_p(lit_entry)) ? ((SubLObject) (dictionary.dictionary_lookup(lit_entry, alias_index, UNPROVIDED))) : NIL;
            return NIL != dictionary.dictionary_p(index_entry) ? ((SubLObject) (dictionary.dictionary_lookup(index_entry, table, UNPROVIDED))) : NIL;
        }
    }

    public static SubLObject tac_lit_table_alias(final SubLObject tac, final SubLObject lit, final SubLObject alias_index, final SubLObject table) {
        final SubLObject lit_entry = dictionary.dictionary_lookup(sksi_query_datastructures.tac_aliases(tac), lit, UNPROVIDED);
        final SubLObject index_entry = (NIL != dictionary.dictionary_p(lit_entry)) ? dictionary.dictionary_lookup(lit_entry, alias_index, UNPROVIDED) : NIL;
        return NIL != dictionary.dictionary_p(index_entry) ? dictionary.dictionary_lookup(index_entry, table, UNPROVIDED) : NIL;
    }

    public static final SubLObject tac_lit_primary_keys_alt(SubLObject tac, SubLObject lit) {
        {
            SubLObject lit_entry = dictionary.dictionary_lookup(com.cyc.cycjava.cycl.sksi.query_sks.sksi_query_datastructures.tac_primary_keys(tac), lit, UNPROVIDED);
            return NIL != dictionary.dictionary_p(lit_entry) ? ((SubLObject) (dictionary.dictionary_keys(lit_entry))) : NIL;
        }
    }

    public static SubLObject tac_lit_primary_keys(final SubLObject tac, final SubLObject lit) {
        final SubLObject lit_entry = dictionary.dictionary_lookup(sksi_query_datastructures.tac_primary_keys(tac), lit, UNPROVIDED);
        return NIL != dictionary.dictionary_p(lit_entry) ? dictionary.dictionary_keys(lit_entry) : NIL;
    }

    public static final SubLObject tac_lit_primary_key_value_alt(SubLObject tac, SubLObject lit, SubLObject primary_key) {
        {
            SubLObject lit_entry = dictionary.dictionary_lookup(com.cyc.cycjava.cycl.sksi.query_sks.sksi_query_datastructures.tac_primary_keys(tac), lit, UNPROVIDED);
            return NIL != dictionary.dictionary_p(lit_entry) ? ((SubLObject) (dictionary.dictionary_lookup(lit_entry, primary_key, UNPROVIDED))) : NIL;
        }
    }

    public static SubLObject tac_lit_primary_key_value(final SubLObject tac, final SubLObject lit, final SubLObject primary_key) {
        final SubLObject lit_entry = dictionary.dictionary_lookup(sksi_query_datastructures.tac_primary_keys(tac), lit, UNPROVIDED);
        return NIL != dictionary.dictionary_p(lit_entry) ? dictionary.dictionary_lookup(lit_entry, primary_key, UNPROVIDED) : NIL;
    }

    public static final SubLObject tac_add_lit_alt(SubLObject tac, SubLObject lit) {
        {
            SubLObject item_var = lit;
            if (NIL == member(item_var, com.cyc.cycjava.cycl.sksi.query_sks.sksi_query_datastructures.tac_lits(tac), symbol_function(EQL), symbol_function(IDENTITY))) {
                com.cyc.cycjava.cycl.sksi.query_sks.sksi_query_datastructures._csetf_tac_lits(tac, cons(item_var, com.cyc.cycjava.cycl.sksi.query_sks.sksi_query_datastructures.tac_lits(tac)));
            }
        }
        return NIL;
    }

    public static SubLObject tac_add_lit(final SubLObject tac, final SubLObject lit) {
        if (NIL == member(lit, sksi_query_datastructures.tac_lits(tac), symbol_function(EQUAL), symbol_function(IDENTITY))) {
            sksi_query_datastructures._csetf_tac_lits(tac, cons(lit, sksi_query_datastructures.tac_lits(tac)));
        }
        return NIL;
    }

    public static final SubLObject tac_add_lit_table_alias(SubLObject tac, SubLObject lit, SubLObject alias_index, SubLObject table, SubLObject alias) {
        {
            SubLObject lit_entry = dictionary.dictionary_lookup(com.cyc.cycjava.cycl.sksi.query_sks.sksi_query_datastructures.tac_aliases(tac), lit, UNPROVIDED);
            if (NIL == dictionary.dictionary_p(lit_entry)) {
                {
                    SubLObject item_var = lit;
                    if (NIL == member(item_var, com.cyc.cycjava.cycl.sksi.query_sks.sksi_query_datastructures.tac_lits(tac), symbol_function(EQL), symbol_function(IDENTITY))) {
                        com.cyc.cycjava.cycl.sksi.query_sks.sksi_query_datastructures._csetf_tac_lits(tac, cons(item_var, com.cyc.cycjava.cycl.sksi.query_sks.sksi_query_datastructures.tac_lits(tac)));
                    }
                }
                lit_entry = dictionary.new_dictionary(symbol_function(EQL), UNPROVIDED);
                dictionary.dictionary_enter(com.cyc.cycjava.cycl.sksi.query_sks.sksi_query_datastructures.tac_aliases(tac), lit, lit_entry);
            }
            {
                SubLObject index_entry = dictionary.dictionary_lookup(lit_entry, alias_index, UNPROVIDED);
                if (NIL == dictionary.dictionary_p(index_entry)) {
                    index_entry = dictionary.new_dictionary(symbol_function(EQUAL), UNPROVIDED);
                    dictionary.dictionary_enter(lit_entry, alias_index, index_entry);
                }
                return dictionary.dictionary_enter(index_entry, table, alias);
            }
        }
    }

    public static SubLObject tac_add_lit_table_alias(final SubLObject tac, final SubLObject lit, final SubLObject alias_index, final SubLObject table_name, final SubLObject alias, final SubLObject namespace) {
        sksi_query_datastructures.tac_note_namespace(tac, alias, namespace);
        SubLObject lit_entry = dictionary.dictionary_lookup(sksi_query_datastructures.tac_aliases(tac), lit, UNPROVIDED);
        if (NIL == dictionary.dictionary_p(lit_entry)) {
            if (NIL == member(lit, sksi_query_datastructures.tac_lits(tac), symbol_function(EQUAL), symbol_function(IDENTITY))) {
                sksi_query_datastructures._csetf_tac_lits(tac, cons(lit, sksi_query_datastructures.tac_lits(tac)));
            }
            lit_entry = dictionary.new_dictionary(symbol_function(EQL), UNPROVIDED);
            dictionary.dictionary_enter(sksi_query_datastructures.tac_aliases(tac), lit, lit_entry);
        }
        SubLObject index_entry = dictionary.dictionary_lookup(lit_entry, alias_index, UNPROVIDED);
        if (NIL == dictionary.dictionary_p(index_entry)) {
            index_entry = dictionary.new_dictionary(symbol_function(EQUAL), UNPROVIDED);
            dictionary.dictionary_enter(lit_entry, alias_index, index_entry);
        }
        return dictionary.dictionary_enter(index_entry, table_name, alias);
    }

    public static final SubLObject tac_add_lit_key_value_alt(SubLObject tac, SubLObject lit, SubLObject primary_key, SubLObject value) {
        {
            SubLObject lit_entry = dictionary.dictionary_lookup(com.cyc.cycjava.cycl.sksi.query_sks.sksi_query_datastructures.tac_primary_keys(tac), lit, UNPROVIDED);
            if (NIL == dictionary.dictionary_p(lit_entry)) {
                lit_entry = dictionary.new_dictionary(symbol_function(EQUAL), UNPROVIDED);
                dictionary.dictionary_enter(com.cyc.cycjava.cycl.sksi.query_sks.sksi_query_datastructures.tac_primary_keys(tac), lit, lit_entry);
            }
            return dictionary.dictionary_enter(lit_entry, primary_key, value);
        }
    }

    public static SubLObject tac_add_lit_key_value(final SubLObject tac, final SubLObject lit, final SubLObject primary_key, final SubLObject value) {
        SubLObject lit_entry = dictionary.dictionary_lookup(sksi_query_datastructures.tac_primary_keys(tac), lit, UNPROVIDED);
        if (NIL == dictionary.dictionary_p(lit_entry)) {
            lit_entry = dictionary.new_dictionary(symbol_function(EQUAL), UNPROVIDED);
            dictionary.dictionary_enter(sksi_query_datastructures.tac_primary_keys(tac), lit, lit_entry);
            sksi_query_datastructures._csetf_tac_primary_key_lits(tac, cons(lit, sksi_query_datastructures.tac_primary_key_lits(tac)));
        }
        return dictionary.dictionary_enter(lit_entry, primary_key, value);
    }

    public static final SubLObject tac_fix_alt(SubLObject tac) {
        com.cyc.cycjava.cycl.sksi.query_sks.sksi_query_datastructures._csetf_tac_fixedP(tac, T);
        return com.cyc.cycjava.cycl.sksi.query_sks.sksi_query_datastructures.tac_fixedP(tac);
    }

    public static SubLObject tac_fix(final SubLObject tac) {
        sksi_query_datastructures._csetf_tac_fixedP(tac, T);
        return sksi_query_datastructures.tac_fixedP(tac);
    }

    public static SubLObject tac_note_namespace(final SubLObject tac, final SubLObject alias, final SubLObject namespace) {
        return dictionary.dictionary_enter(sksi_query_datastructures.tac_namespaces(tac), alias, namespace);
    }

    public static SubLObject tac_lookup_namespace(final SubLObject tac, final SubLObject alias) {
        return dictionary.dictionary_lookup_without_values(sksi_query_datastructures.tac_namespaces(tac), alias, UNPROVIDED);
    }

    public static final SubLObject tac_add_primary_key_and_value_alt(SubLObject tac, SubLObject lit, SubLObject primary_key, SubLObject value) {
        return com.cyc.cycjava.cycl.sksi.query_sks.sksi_query_datastructures.tac_add_lit_key_value(tac, lit, primary_key, value);
    }

    public static SubLObject tac_add_primary_key_and_value(final SubLObject tac, final SubLObject lit, final SubLObject primary_key, final SubLObject value) {
        return sksi_query_datastructures.tac_add_lit_key_value(tac, lit, primary_key, value);
    }

    public static final SubLObject tac_alias_table(SubLObject tac, SubLObject lit, SubLObject table, SubLObject alias_index) {
        if (alias_index == UNPROVIDED) {
            alias_index = ZERO_INTEGER;
        }
        SubLTrampolineFile.checkType(tac, TABLE_ALIASING_CONTEXT_P);
        {
            SubLObject alias = com.cyc.cycjava.cycl.sksi.query_sks.sksi_query_datastructures.tac_lit_table_alias(tac, lit, alias_index, table);
            if (NIL == com.cyc.cycjava.cycl.sksi.query_sks.sksi_query_datastructures.tac_fixedP(tac)) {
                if (NIL == alias) {
                    alias = com.cyc.cycjava.cycl.sksi.query_sks.sksi_query_datastructures.generate_table_alias(table);
                }
                com.cyc.cycjava.cycl.sksi.query_sks.sksi_query_datastructures.tac_add_lit_table_alias(tac, lit, alias_index, table, alias);
            }
            return alias;
        }
    }

    public static SubLObject tac_alias_table(final SubLObject tac, final SubLObject lit, final SubLObject table_name, final SubLObject namespace, SubLObject alias_index) {
        if (alias_index == UNPROVIDED) {
            alias_index = ZERO_INTEGER;
        }
        assert NIL != sksi_query_datastructures.table_aliasing_context_p(tac) : "! sksi_query_datastructures.table_aliasing_context_p(tac) " + ("sksi_query_datastructures.table_aliasing_context_p(tac) " + "CommonSymbols.NIL != sksi_query_datastructures.table_aliasing_context_p(tac) ") + tac;
        if (((NIL != namespace) && (!SubLTrampolineFile.assertionsDisabledInClass)) && (NIL == stringp(namespace))) {
            throw new AssertionError(namespace);
        }
        if (((NIL != alias_index) && (!SubLTrampolineFile.assertionsDisabledInClass)) && (NIL == integerp(alias_index))) {
            throw new AssertionError(alias_index);
        }
        SubLObject alias = sksi_query_datastructures.tac_lit_table_alias(tac, lit, alias_index, table_name);
        if (NIL == sksi_query_datastructures.tac_fixedP(tac)) {
            if (NIL == alias) {
                alias = sksi_query_datastructures.generate_table_alias(table_name);
            }
            sksi_query_datastructures.tac_add_lit_table_alias(tac, lit, alias_index, table_name, alias, namespace);
        }
        return alias;
    }

    public static final SubLObject generate_table_alias_alt(SubLObject table) {
        return format_nil.format_nil_a(gensym(table));
    }

    public static SubLObject generate_table_alias(final SubLObject table) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != integer_sequence_generator.integer_sequence_generator_p(sksi_query_datastructures.$table_alias_isg$.getDynamicValue(thread))) {
            final SubLObject next_number = integer_sequence_generator.integer_sequence_generator_next(sksi_query_datastructures.$table_alias_isg$.getDynamicValue(thread));
            return cconcatenate(format_nil.format_nil_a_no_copy(table), format_nil.format_nil_a_no_copy(next_number));
        }
        return format_nil.format_nil_a(gensym(table));
    }

    public static final SubLObject table_alias_alias_suffix_alt(SubLObject table_alias, SubLObject table_name) {
        return string_utilities.pre_remove(table_alias, table_name, UNPROVIDED);
    }

    public static SubLObject table_alias_alias_suffix(final SubLObject table_alias, final SubLObject table_name) {
        return string_utilities.pre_remove(table_alias, table_name, UNPROVIDED);
    }

    public static final SubLObject tac_lookup_aliases_for_table_alt(SubLObject tac, SubLObject table, SubLObject alias_index) {
        if (alias_index == UNPROVIDED) {
            alias_index = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(tac, TABLE_ALIASING_CONTEXT_P);
            {
                SubLObject aliases = NIL;
                if (NIL != alias_index) {
                    {
                        SubLObject cdolist_list_var = com.cyc.cycjava.cycl.sksi.query_sks.sksi_query_datastructures.tac_lits(tac);
                        SubLObject lit = NIL;
                        for (lit = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , lit = cdolist_list_var.first()) {
                            {
                                SubLObject lit_aliases = dictionary.dictionary_lookup(com.cyc.cycjava.cycl.sksi.query_sks.sksi_query_datastructures.tac_aliases(tac), lit, UNPROVIDED);
                                SubLObject lit_index_aliases = dictionary.dictionary_lookup(lit_aliases, alias_index, UNPROVIDED);
                                if (NIL != dictionary.dictionary_p(lit_index_aliases)) {
                                    {
                                        SubLObject alias = dictionary.dictionary_lookup(lit_index_aliases, table, UNPROVIDED);
                                        if (NIL != alias) {
                                            aliases = cons(alias, aliases);
                                        }
                                    }
                                }
                            }
                        }
                    }
                } else {
                    {
                        SubLObject cdolist_list_var = com.cyc.cycjava.cycl.sksi.query_sks.sksi_query_datastructures.tac_lits(tac);
                        SubLObject lit = NIL;
                        for (lit = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , lit = cdolist_list_var.first()) {
                            {
                                SubLObject lit_aliases = dictionary.dictionary_lookup(com.cyc.cycjava.cycl.sksi.query_sks.sksi_query_datastructures.tac_aliases(tac), lit, UNPROVIDED);
                                SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(lit_aliases));
                                while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)) {
                                    thread.resetMultipleValues();
                                    {
                                        SubLObject key = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                        SubLObject lit_index_aliases = thread.secondMultipleValue();
                                        thread.resetMultipleValues();
                                        {
                                            SubLObject alias = dictionary.dictionary_lookup(lit_index_aliases, table, UNPROVIDED);
                                            if (NIL != alias) {
                                                aliases = cons(alias, aliases);
                                            }
                                        }
                                        iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state);
                                    }
                                } 
                                dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                            }
                        }
                    }
                }
                return aliases;
            }
        }
    }

    public static SubLObject tac_lookup_aliases_for_table(final SubLObject tac, final SubLObject table_name, SubLObject alias_index) {
        if (alias_index == UNPROVIDED) {
            alias_index = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != sksi_query_datastructures.table_aliasing_context_p(tac) : "! sksi_query_datastructures.table_aliasing_context_p(tac) " + ("sksi_query_datastructures.table_aliasing_context_p(tac) " + "CommonSymbols.NIL != sksi_query_datastructures.table_aliasing_context_p(tac) ") + tac;
        SubLObject aliases = NIL;
        if (NIL != alias_index) {
            SubLObject cdolist_list_var = sksi_query_datastructures.tac_lits(tac);
            SubLObject lit = NIL;
            lit = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                final SubLObject lit_aliases = dictionary.dictionary_lookup(sksi_query_datastructures.tac_aliases(tac), lit, UNPROVIDED);
                final SubLObject lit_index_aliases = dictionary.dictionary_lookup(lit_aliases, alias_index, UNPROVIDED);
                if (NIL != dictionary.dictionary_p(lit_index_aliases)) {
                    final SubLObject alias = dictionary.dictionary_lookup(lit_index_aliases, table_name, UNPROVIDED);
                    if (NIL != alias) {
                        aliases = cons(alias, aliases);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                lit = cdolist_list_var.first();
            } 
        } else {
            SubLObject cdolist_list_var = sksi_query_datastructures.tac_lits(tac);
            SubLObject lit = NIL;
            lit = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                final SubLObject lit_aliases = dictionary.dictionary_lookup(sksi_query_datastructures.tac_aliases(tac), lit, UNPROVIDED);
                SubLObject iteration_state;
                for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(lit_aliases)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                    thread.resetMultipleValues();
                    final SubLObject key = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                    final SubLObject lit_index_aliases2 = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    final SubLObject alias2 = dictionary.dictionary_lookup(lit_index_aliases2, table_name, UNPROVIDED);
                    if (NIL != alias2) {
                        aliases = cons(alias2, aliases);
                    }
                }
                dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                cdolist_list_var = cdolist_list_var.rest();
                lit = cdolist_list_var.first();
            } 
        }
        return aliases;
    }

    public static SubLObject tac_lookup_all_table_expressions(final SubLObject tac) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != sksi_query_datastructures.table_aliasing_context_p(tac) : "! sksi_query_datastructures.table_aliasing_context_p(tac) " + ("sksi_query_datastructures.table_aliasing_context_p(tac) " + "CommonSymbols.NIL != sksi_query_datastructures.table_aliasing_context_p(tac) ") + tac;
        SubLObject tuples = NIL;
        SubLObject cdolist_list_var = sksi_query_datastructures.tac_lits(tac);
        SubLObject lit = NIL;
        lit = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject lit_aliases = dictionary.dictionary_lookup(sksi_query_datastructures.tac_aliases(tac), lit, UNPROVIDED);
            SubLObject iteration_state;
            for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(lit_aliases)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                thread.resetMultipleValues();
                final SubLObject key = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                final SubLObject lit_index_aliases = thread.secondMultipleValue();
                thread.resetMultipleValues();
                SubLObject iteration_state_$2;
                for (iteration_state_$2 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(lit_index_aliases)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$2); iteration_state_$2 = dictionary_contents.do_dictionary_contents_next(iteration_state_$2)) {
                    thread.resetMultipleValues();
                    final SubLObject table = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$2);
                    final SubLObject alias = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    final SubLObject namespace = sksi_query_datastructures.tac_lookup_namespace(tac, alias);
                    tuples = cons(list(table, alias, namespace), tuples);
                }
                dictionary_contents.do_dictionary_contents_finalize(iteration_state_$2);
            }
            dictionary_contents.do_dictionary_contents_finalize(iteration_state);
            cdolist_list_var = cdolist_list_var.rest();
            lit = cdolist_list_var.first();
        } 
        return list_utilities.fast_delete_duplicates(tuples, symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject tac_clear_lits_alt(SubLObject tac) {
        com.cyc.cycjava.cycl.sksi.query_sks.sksi_query_datastructures._csetf_tac_lits(tac, NIL);
        return NIL;
    }

    public static SubLObject tac_clear_lits(final SubLObject tac) {
        sksi_query_datastructures._csetf_tac_lits(tac, NIL);
        return NIL;
    }

    public static final SubLObject tac_lookup_all_table_alias_index_triples_alt(SubLObject tac) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(tac, TABLE_ALIASING_CONTEXT_P);
            {
                SubLObject triples = NIL;
                SubLObject cdolist_list_var = com.cyc.cycjava.cycl.sksi.query_sks.sksi_query_datastructures.tac_lits(tac);
                SubLObject lit = NIL;
                for (lit = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , lit = cdolist_list_var.first()) {
                    {
                        SubLObject lit_aliases = dictionary.dictionary_lookup(com.cyc.cycjava.cycl.sksi.query_sks.sksi_query_datastructures.tac_aliases(tac), lit, UNPROVIDED);
                        SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(lit_aliases));
                        while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)) {
                            thread.resetMultipleValues();
                            {
                                SubLObject index = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                SubLObject lit_index_aliases = thread.secondMultipleValue();
                                thread.resetMultipleValues();
                                {
                                    SubLObject iteration_state_5 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(lit_index_aliases));
                                    while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_5)) {
                                        thread.resetMultipleValues();
                                        {
                                            SubLObject table = dictionary_contents.do_dictionary_contents_key_value(iteration_state_5);
                                            SubLObject alias = thread.secondMultipleValue();
                                            thread.resetMultipleValues();
                                            triples = cons(list(table, alias, index), triples);
                                            iteration_state_5 = dictionary_contents.do_dictionary_contents_next(iteration_state_5);
                                        }
                                    } 
                                    dictionary_contents.do_dictionary_contents_finalize(iteration_state_5);
                                }
                                iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state);
                            }
                        } 
                        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                    }
                }
                return list_utilities.fast_delete_duplicates(triples, symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            }
        }
    }

    public static SubLObject tac_lookup_all_table_alias_index_triples(final SubLObject tac) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != sksi_query_datastructures.table_aliasing_context_p(tac) : "! sksi_query_datastructures.table_aliasing_context_p(tac) " + ("sksi_query_datastructures.table_aliasing_context_p(tac) " + "CommonSymbols.NIL != sksi_query_datastructures.table_aliasing_context_p(tac) ") + tac;
        SubLObject triples = NIL;
        SubLObject cdolist_list_var = sksi_query_datastructures.tac_lits(tac);
        SubLObject lit = NIL;
        lit = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject lit_aliases = dictionary.dictionary_lookup(sksi_query_datastructures.tac_aliases(tac), lit, UNPROVIDED);
            SubLObject iteration_state;
            for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(lit_aliases)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                thread.resetMultipleValues();
                final SubLObject index = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                final SubLObject lit_index_aliases = thread.secondMultipleValue();
                thread.resetMultipleValues();
                SubLObject iteration_state_$3;
                for (iteration_state_$3 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(lit_index_aliases)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$3); iteration_state_$3 = dictionary_contents.do_dictionary_contents_next(iteration_state_$3)) {
                    thread.resetMultipleValues();
                    final SubLObject table = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$3);
                    final SubLObject alias = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    triples = cons(list(table, alias, index), triples);
                }
                dictionary_contents.do_dictionary_contents_finalize(iteration_state_$3);
            }
            dictionary_contents.do_dictionary_contents_finalize(iteration_state);
            cdolist_list_var = cdolist_list_var.rest();
            lit = cdolist_list_var.first();
        } 
        return list_utilities.fast_delete_duplicates(triples, symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject fix_table_aliasing_context_alt(SubLObject tac) {
        SubLTrampolineFile.checkType(tac, TABLE_ALIASING_CONTEXT_P);
        return com.cyc.cycjava.cycl.sksi.query_sks.sksi_query_datastructures.tac_fix(tac);
    }

    public static SubLObject fix_table_aliasing_context(final SubLObject tac) {
        assert NIL != sksi_query_datastructures.table_aliasing_context_p(tac) : "! sksi_query_datastructures.table_aliasing_context_p(tac) " + ("sksi_query_datastructures.table_aliasing_context_p(tac) " + "CommonSymbols.NIL != sksi_query_datastructures.table_aliasing_context_p(tac) ") + tac;
        return sksi_query_datastructures.tac_fix(tac);
    }

    public static final SubLObject tac_realias_tables_alt(SubLObject tac) {
        return NIL != com.cyc.cycjava.cycl.sksi.query_sks.sksi_query_datastructures.tac_fixedP(tac) ? ((SubLObject) (NIL)) : com.cyc.cycjava.cycl.sksi.query_sks.sksi_query_datastructures.tac_realias_tables_recursive(NIL, dictionary.dictionary_keys(com.cyc.cycjava.cycl.sksi.query_sks.sksi_query_datastructures.tac_primary_keys(tac)), tac);
    }

    public static SubLObject tac_realias_tables(final SubLObject tac) {
        return NIL != sksi_query_datastructures.tac_fixedP(tac) ? NIL : sksi_query_datastructures.tac_realias_tables_recursive(NIL, sksi_query_datastructures.tac_primary_key_lits(tac), tac);
    }

    public static final SubLObject tac_realias_tables_recursive_alt(SubLObject lits_so_far, SubLObject remaining_lits, SubLObject tac) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == remaining_lits) {
                return NIL;
            } else {
                {
                    SubLObject lit0 = remaining_lits.first();
                    SubLObject lit0_primary_keys = dictionary.dictionary_lookup(com.cyc.cycjava.cycl.sksi.query_sks.sksi_query_datastructures.tac_primary_keys(tac), lit0, UNPROVIDED);
                    SubLObject lit0_indices = dictionary.dictionary_lookup(com.cyc.cycjava.cycl.sksi.query_sks.sksi_query_datastructures.tac_aliases(tac), lit0, UNPROVIDED);
                    SubLObject alist = NIL;
                    SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(lit0_indices));
                    while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)) {
                        thread.resetMultipleValues();
                        {
                            SubLObject alias_index = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                            SubLObject lit0_index_tables = thread.secondMultipleValue();
                            thread.resetMultipleValues();
                            {
                                SubLObject doneP = NIL;
                                if (NIL == doneP) {
                                    {
                                        SubLObject csome_list_var = lits_so_far;
                                        SubLObject lit1 = NIL;
                                        for (lit1 = csome_list_var.first(); !((NIL != doneP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , lit1 = csome_list_var.first()) {
                                            if (NIL != com.cyc.cycjava.cycl.sksi.query_sks.sksi_query_datastructures.tac_lit_has_alias_indexP(tac, lit1, alias_index)) {
                                                {
                                                    SubLObject primary_key_matchP = NIL;
                                                    {
                                                        SubLObject iteration_state_6 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(lit0_primary_keys));
                                                        while (!((NIL != primary_key_matchP) || (NIL != dictionary_contents.do_dictionary_contents_doneP(iteration_state_6)))) {
                                                            thread.resetMultipleValues();
                                                            {
                                                                SubLObject lit0_key = dictionary_contents.do_dictionary_contents_key_value(iteration_state_6);
                                                                SubLObject lit0_value = thread.secondMultipleValue();
                                                                thread.resetMultipleValues();
                                                                primary_key_matchP = equal(lit0_value, com.cyc.cycjava.cycl.sksi.query_sks.sksi_query_datastructures.tac_lit_primary_key_value(tac, lit1, lit0_key));
                                                                iteration_state_6 = dictionary_contents.do_dictionary_contents_next(iteration_state_6);
                                                            }
                                                        } 
                                                        dictionary_contents.do_dictionary_contents_finalize(iteration_state_6);
                                                    }
                                                    if (NIL != primary_key_matchP) {
                                                        {
                                                            SubLObject iteration_state_7 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(lit0_index_tables));
                                                            while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_7)) {
                                                                thread.resetMultipleValues();
                                                                {
                                                                    SubLObject lit0_table = dictionary_contents.do_dictionary_contents_key_value(iteration_state_7);
                                                                    SubLObject lit0_alias = thread.secondMultipleValue();
                                                                    thread.resetMultipleValues();
                                                                    {
                                                                        SubLObject lit1_alias = com.cyc.cycjava.cycl.sksi.query_sks.sksi_query_datastructures.tac_lit_table_alias(tac, lit1, alias_index, lit0_table);
                                                                        if (!lit0_alias.equal(lit1_alias)) {
                                                                            com.cyc.cycjava.cycl.sksi.query_sks.sksi_query_datastructures.tac_add_lit_table_alias(tac, lit0, alias_index, lit0_table, lit1_alias);
                                                                            alist = cons(cons(lit0_alias, lit1_alias), alist);
                                                                            doneP = T;
                                                                        }
                                                                    }
                                                                    iteration_state_7 = dictionary_contents.do_dictionary_contents_next(iteration_state_7);
                                                                }
                                                            } 
                                                            dictionary_contents.do_dictionary_contents_finalize(iteration_state_7);
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state);
                        }
                    } 
                    dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                    return append(alist, com.cyc.cycjava.cycl.sksi.query_sks.sksi_query_datastructures.tac_realias_tables_recursive(list_utilities.snoc(lit0, lits_so_far), remaining_lits.rest(), tac));
                }
            }
        }
    }

    public static SubLObject tac_realias_tables_recursive(final SubLObject lits_so_far, final SubLObject remaining_lits, final SubLObject tac) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == remaining_lits) {
            return NIL;
        }
        final SubLObject lit0 = remaining_lits.first();
        final SubLObject lit0_primary_keys = dictionary.dictionary_lookup(sksi_query_datastructures.tac_primary_keys(tac), lit0, UNPROVIDED);
        final SubLObject lit0_indices = dictionary.dictionary_lookup(sksi_query_datastructures.tac_aliases(tac), lit0, UNPROVIDED);
        SubLObject alist = NIL;
        SubLObject iteration_state;
        for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(lit0_indices)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
            thread.resetMultipleValues();
            final SubLObject alias_index = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
            final SubLObject lit0_index_tables = thread.secondMultipleValue();
            thread.resetMultipleValues();
            SubLObject doneP = NIL;
            if (NIL == doneP) {
                SubLObject csome_list_var = lits_so_far;
                SubLObject lit2 = NIL;
                lit2 = csome_list_var.first();
                while ((NIL == doneP) && (NIL != csome_list_var)) {
                    if (NIL != sksi_query_datastructures.tac_lit_has_alias_indexP(tac, lit2, alias_index)) {
                        SubLObject primary_key_matchP;
                        SubLObject iteration_state_$4;
                        SubLObject lit0_key;
                        SubLObject lit0_value;
                        for (primary_key_matchP = NIL, iteration_state_$4 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(lit0_primary_keys)); (NIL == primary_key_matchP) && (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$4)); primary_key_matchP = equal(lit0_value, sksi_query_datastructures.tac_lit_primary_key_value(tac, lit2, lit0_key)) , iteration_state_$4 = dictionary_contents.do_dictionary_contents_next(iteration_state_$4)) {
                            thread.resetMultipleValues();
                            lit0_key = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$4);
                            lit0_value = thread.secondMultipleValue();
                            thread.resetMultipleValues();
                        }
                        dictionary_contents.do_dictionary_contents_finalize(iteration_state_$4);
                        if (NIL != primary_key_matchP) {
                            SubLObject iteration_state_$5;
                            for (iteration_state_$5 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(lit0_index_tables)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$5); iteration_state_$5 = dictionary_contents.do_dictionary_contents_next(iteration_state_$5)) {
                                thread.resetMultipleValues();
                                final SubLObject lit0_table = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$5);
                                final SubLObject lit0_alias = thread.secondMultipleValue();
                                thread.resetMultipleValues();
                                final SubLObject lit1_alias = sksi_query_datastructures.tac_lit_table_alias(tac, lit2, alias_index, lit0_table);
                                if (!lit0_alias.equal(lit1_alias)) {
                                    final SubLObject lit1_namespace = sksi_query_datastructures.tac_lookup_namespace(tac, lit1_alias);
                                    sksi_query_datastructures.tac_add_lit_table_alias(tac, lit0, alias_index, lit0_table, lit1_alias, lit1_namespace);
                                    alist = cons(cons(lit0_alias, lit1_alias), alist);
                                    doneP = T;
                                }
                            }
                            dictionary_contents.do_dictionary_contents_finalize(iteration_state_$5);
                        }
                    }
                    csome_list_var = csome_list_var.rest();
                    lit2 = csome_list_var.first();
                } 
            }
        }
        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
        return append(alist, sksi_query_datastructures.tac_realias_tables_recursive(list_utilities.snoc(lit0, lits_so_far), remaining_lits.rest(), tac));
    }

    public static final SubLObject print_table_aliasing_context_contents_alt(SubLObject tac, SubLObject stream) {
        if (stream == UNPROVIDED) {
            stream = T;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            format(stream, $str_alt64$__);
            {
                SubLObject cdolist_list_var = com.cyc.cycjava.cycl.sksi.query_sks.sksi_query_datastructures.tac_lits(tac);
                SubLObject lit = NIL;
                for (lit = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , lit = cdolist_list_var.first()) {
                    {
                        SubLObject lit_aliases = dictionary.dictionary_lookup(com.cyc.cycjava.cycl.sksi.query_sks.sksi_query_datastructures.tac_aliases(tac), lit, UNPROVIDED);
                        format(stream, $str_alt65$_s__, lit);
                        {
                            SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(lit_aliases));
                            while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)) {
                                thread.resetMultipleValues();
                                {
                                    SubLObject index = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                    SubLObject lit_index_tables = thread.secondMultipleValue();
                                    thread.resetMultipleValues();
                                    format(stream, $str_alt66$_____s__, index);
                                    {
                                        SubLObject iteration_state_8 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(lit_index_tables));
                                        while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_8)) {
                                            thread.resetMultipleValues();
                                            {
                                                SubLObject table = dictionary_contents.do_dictionary_contents_key_value(iteration_state_8);
                                                SubLObject alias = thread.secondMultipleValue();
                                                thread.resetMultipleValues();
                                                format(stream, $str_alt67$________s_____s__, table, alias);
                                                iteration_state_8 = dictionary_contents.do_dictionary_contents_next(iteration_state_8);
                                            }
                                        } 
                                        dictionary_contents.do_dictionary_contents_finalize(iteration_state_8);
                                    }
                                    iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state);
                                }
                            } 
                            dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                        }
                    }
                }
            }
            return NIL;
        }
    }

    public static SubLObject print_table_aliasing_context_contents(final SubLObject tac, SubLObject stream) {
        if (stream == UNPROVIDED) {
            stream = T;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        format(stream, sksi_query_datastructures.$str78$__);
        SubLObject cdolist_list_var = sksi_query_datastructures.tac_lits(tac);
        SubLObject lit = NIL;
        lit = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject lit_aliases = dictionary.dictionary_lookup(sksi_query_datastructures.tac_aliases(tac), lit, UNPROVIDED);
            format(stream, sksi_query_datastructures.$str79$_s__, lit);
            SubLObject iteration_state;
            for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(lit_aliases)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                thread.resetMultipleValues();
                final SubLObject index = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                final SubLObject lit_index_tables = thread.secondMultipleValue();
                thread.resetMultipleValues();
                format(stream, sksi_query_datastructures.$str80$_____s__, index);
                SubLObject iteration_state_$6;
                for (iteration_state_$6 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(lit_index_tables)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$6); iteration_state_$6 = dictionary_contents.do_dictionary_contents_next(iteration_state_$6)) {
                    thread.resetMultipleValues();
                    final SubLObject table = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$6);
                    final SubLObject alias = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    format(stream, sksi_query_datastructures.$str81$________s_____s__, table, alias);
                }
                dictionary_contents.do_dictionary_contents_finalize(iteration_state_$6);
            }
            dictionary_contents.do_dictionary_contents_finalize(iteration_state);
            cdolist_list_var = cdolist_list_var.rest();
            lit = cdolist_list_var.first();
        } 
        return NIL;
    }

    public static final SubLObject declare_sksi_query_datastructures_file_alt() {
        declareFunction("sks_profile_print_function_trampoline", "SKS-PROFILE-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction("sks_profile_p", "SKS-PROFILE-P", 1, 0, false);
        new com.cyc.cycjava.cycl.sksi.query_sks.sksi_query_datastructures.$sks_profile_p$UnaryFunction();
        declareFunction("sks_profile_sks", "SKS-PROFILE-SKS", 1, 0, false);
        declareFunction("sks_profile_type", "SKS-PROFILE-TYPE", 1, 0, false);
        declareFunction("sks_profile_content_mt", "SKS-PROFILE-CONTENT-MT", 1, 0, false);
        declareFunction("sks_profile_mapping_mt", "SKS-PROFILE-MAPPING-MT", 1, 0, false);
        declareFunction("sks_profile_logical_schemata", "SKS-PROFILE-LOGICAL-SCHEMATA", 1, 0, false);
        declareFunction("sks_profile_physical_schemata", "SKS-PROFILE-PHYSICAL-SCHEMATA", 1, 0, false);
        declareFunction("sks_profile_required_fields", "SKS-PROFILE-REQUIRED-FIELDS", 1, 0, false);
        declareFunction("_csetf_sks_profile_sks", "_CSETF-SKS-PROFILE-SKS", 2, 0, false);
        declareFunction("_csetf_sks_profile_type", "_CSETF-SKS-PROFILE-TYPE", 2, 0, false);
        declareFunction("_csetf_sks_profile_content_mt", "_CSETF-SKS-PROFILE-CONTENT-MT", 2, 0, false);
        declareFunction("_csetf_sks_profile_mapping_mt", "_CSETF-SKS-PROFILE-MAPPING-MT", 2, 0, false);
        declareFunction("_csetf_sks_profile_logical_schemata", "_CSETF-SKS-PROFILE-LOGICAL-SCHEMATA", 2, 0, false);
        declareFunction("_csetf_sks_profile_physical_schemata", "_CSETF-SKS-PROFILE-PHYSICAL-SCHEMATA", 2, 0, false);
        declareFunction("_csetf_sks_profile_required_fields", "_CSETF-SKS-PROFILE-REQUIRED-FIELDS", 2, 0, false);
        declareFunction("make_sks_profile", "MAKE-SKS-PROFILE", 0, 1, false);
        declareFunction("sks_profile_print", "SKS-PROFILE-PRINT", 3, 0, false);
        declareFunction("new_sks_profile", "NEW-SKS-PROFILE", 1, 2, false);
        declareFunction("valid_sks_profile", "VALID-SKS-PROFILE", 1, 0, false);
        declareFunction("valid_and_supported_sks_profile", "VALID-AND-SUPPORTED-SKS-PROFILE", 1, 0, false);
        declareFunction("print_sks_profile_contents", "PRINT-SKS-PROFILE-CONTENTS", 1, 1, false);
        declareFunction("table_aliasing_context_print_function_trampoline", "TABLE-ALIASING-CONTEXT-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction("table_aliasing_context_p", "TABLE-ALIASING-CONTEXT-P", 1, 0, false);
        new com.cyc.cycjava.cycl.sksi.query_sks.sksi_query_datastructures.$table_aliasing_context_p$UnaryFunction();
        declareFunction("tac_lits", "TAC-LITS", 1, 0, false);
        declareFunction("tac_aliases", "TAC-ALIASES", 1, 0, false);
        declareFunction("tac_primary_keys", "TAC-PRIMARY-KEYS", 1, 0, false);
        declareFunction("tac_fixedP", "TAC-FIXED?", 1, 0, false);
        declareFunction("_csetf_tac_lits", "_CSETF-TAC-LITS", 2, 0, false);
        declareFunction("_csetf_tac_aliases", "_CSETF-TAC-ALIASES", 2, 0, false);
        declareFunction("_csetf_tac_primary_keys", "_CSETF-TAC-PRIMARY-KEYS", 2, 0, false);
        declareFunction("_csetf_tac_fixedP", "_CSETF-TAC-FIXED?", 2, 0, false);
        declareFunction("make_table_aliasing_context", "MAKE-TABLE-ALIASING-CONTEXT", 0, 1, false);
        declareFunction("new_table_aliasing_context", "NEW-TABLE-ALIASING-CONTEXT", 0, 0, false);
        declareFunction("tac_lit_has_alias_indexP", "TAC-LIT-HAS-ALIAS-INDEX?", 3, 0, false);
        declareFunction("tac_lit_tables", "TAC-LIT-TABLES", 3, 0, false);
        declareFunction("tac_lit_table_alias", "TAC-LIT-TABLE-ALIAS", 4, 0, false);
        declareFunction("tac_lit_primary_keys", "TAC-LIT-PRIMARY-KEYS", 2, 0, false);
        declareFunction("tac_lit_primary_key_value", "TAC-LIT-PRIMARY-KEY-VALUE", 3, 0, false);
        declareFunction("tac_add_lit", "TAC-ADD-LIT", 2, 0, false);
        declareFunction("tac_add_lit_table_alias", "TAC-ADD-LIT-TABLE-ALIAS", 5, 0, false);
        declareFunction("tac_add_lit_key_value", "TAC-ADD-LIT-KEY-VALUE", 4, 0, false);
        declareFunction("tac_fix", "TAC-FIX", 1, 0, false);
        declareFunction("tac_add_primary_key_and_value", "TAC-ADD-PRIMARY-KEY-AND-VALUE", 4, 0, false);
        declareFunction("tac_alias_table", "TAC-ALIAS-TABLE", 3, 1, false);
        declareFunction("generate_table_alias", "GENERATE-TABLE-ALIAS", 1, 0, false);
        declareFunction("table_alias_alias_suffix", "TABLE-ALIAS-ALIAS-SUFFIX", 2, 0, false);
        declareFunction("tac_lookup_aliases_for_table", "TAC-LOOKUP-ALIASES-FOR-TABLE", 2, 1, false);
        declareFunction("tac_lookup_all_table_alias_pairs", "TAC-LOOKUP-ALL-TABLE-ALIAS-PAIRS", 1, 0, false);
        declareFunction("tac_clear_lits", "TAC-CLEAR-LITS", 1, 0, false);
        declareFunction("tac_lookup_all_table_alias_index_triples", "TAC-LOOKUP-ALL-TABLE-ALIAS-INDEX-TRIPLES", 1, 0, false);
        declareFunction("fix_table_aliasing_context", "FIX-TABLE-ALIASING-CONTEXT", 1, 0, false);
        declareFunction("tac_realias_tables", "TAC-REALIAS-TABLES", 1, 0, false);
        declareFunction("tac_realias_tables_recursive", "TAC-REALIAS-TABLES-RECURSIVE", 3, 0, false);
        declareFunction("print_table_aliasing_context_contents", "PRINT-TABLE-ALIASING-CONTEXT-CONTENTS", 1, 1, false);
        return NIL;
    }

    public static SubLObject declare_sksi_query_datastructures_file() {
        if (SubLFiles.USE_V1) {
            declareFunction("sks_profile_print_function_trampoline", "SKS-PROFILE-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
            declareFunction("sks_profile_p", "SKS-PROFILE-P", 1, 0, false);
            new sksi_query_datastructures.$sks_profile_p$UnaryFunction();
            declareFunction("sks_profile_sks", "SKS-PROFILE-SKS", 1, 0, false);
            declareFunction("sks_profile_type", "SKS-PROFILE-TYPE", 1, 0, false);
            declareFunction("sks_profile_content_mt", "SKS-PROFILE-CONTENT-MT", 1, 0, false);
            declareFunction("sks_profile_mapping_mt", "SKS-PROFILE-MAPPING-MT", 1, 0, false);
            declareFunction("sks_profile_logical_schemata", "SKS-PROFILE-LOGICAL-SCHEMATA", 1, 0, false);
            declareFunction("sks_profile_physical_schemata", "SKS-PROFILE-PHYSICAL-SCHEMATA", 1, 0, false);
            declareFunction("sks_profile_required_fields", "SKS-PROFILE-REQUIRED-FIELDS", 1, 0, false);
            declareFunction("_csetf_sks_profile_sks", "_CSETF-SKS-PROFILE-SKS", 2, 0, false);
            declareFunction("_csetf_sks_profile_type", "_CSETF-SKS-PROFILE-TYPE", 2, 0, false);
            declareFunction("_csetf_sks_profile_content_mt", "_CSETF-SKS-PROFILE-CONTENT-MT", 2, 0, false);
            declareFunction("_csetf_sks_profile_mapping_mt", "_CSETF-SKS-PROFILE-MAPPING-MT", 2, 0, false);
            declareFunction("_csetf_sks_profile_logical_schemata", "_CSETF-SKS-PROFILE-LOGICAL-SCHEMATA", 2, 0, false);
            declareFunction("_csetf_sks_profile_physical_schemata", "_CSETF-SKS-PROFILE-PHYSICAL-SCHEMATA", 2, 0, false);
            declareFunction("_csetf_sks_profile_required_fields", "_CSETF-SKS-PROFILE-REQUIRED-FIELDS", 2, 0, false);
            declareFunction("make_sks_profile", "MAKE-SKS-PROFILE", 0, 1, false);
            declareFunction("visit_defstruct_sks_profile", "VISIT-DEFSTRUCT-SKS-PROFILE", 2, 0, false);
            declareFunction("visit_defstruct_object_sks_profile_method", "VISIT-DEFSTRUCT-OBJECT-SKS-PROFILE-METHOD", 2, 0, false);
            declareFunction("sks_profile_print", "SKS-PROFILE-PRINT", 3, 0, false);
            declareFunction("new_sks_profile", "NEW-SKS-PROFILE", 1, 2, false);
            declareFunction("valid_sks_profile", "VALID-SKS-PROFILE", 1, 0, false);
            declareFunction("valid_and_supported_sks_profile", "VALID-AND-SUPPORTED-SKS-PROFILE", 1, 0, false);
            declareFunction("print_sks_profile_contents", "PRINT-SKS-PROFILE-CONTENTS", 1, 1, false);
            declareFunction("table_aliasing_context_print_function_trampoline", "TABLE-ALIASING-CONTEXT-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
            declareFunction("table_aliasing_context_p", "TABLE-ALIASING-CONTEXT-P", 1, 0, false);
            new sksi_query_datastructures.$table_aliasing_context_p$UnaryFunction();
            declareFunction("tac_lits", "TAC-LITS", 1, 0, false);
            declareFunction("tac_aliases", "TAC-ALIASES", 1, 0, false);
            declareFunction("tac_primary_keys", "TAC-PRIMARY-KEYS", 1, 0, false);
            declareFunction("tac_primary_key_lits", "TAC-PRIMARY-KEY-LITS", 1, 0, false);
            declareFunction("tac_fixedP", "TAC-FIXED?", 1, 0, false);
            declareFunction("tac_namespaces", "TAC-NAMESPACES", 1, 0, false);
            declareFunction("_csetf_tac_lits", "_CSETF-TAC-LITS", 2, 0, false);
            declareFunction("_csetf_tac_aliases", "_CSETF-TAC-ALIASES", 2, 0, false);
            declareFunction("_csetf_tac_primary_keys", "_CSETF-TAC-PRIMARY-KEYS", 2, 0, false);
            declareFunction("_csetf_tac_primary_key_lits", "_CSETF-TAC-PRIMARY-KEY-LITS", 2, 0, false);
            declareFunction("_csetf_tac_fixedP", "_CSETF-TAC-FIXED?", 2, 0, false);
            declareFunction("_csetf_tac_namespaces", "_CSETF-TAC-NAMESPACES", 2, 0, false);
            declareFunction("make_table_aliasing_context", "MAKE-TABLE-ALIASING-CONTEXT", 0, 1, false);
            declareFunction("visit_defstruct_table_aliasing_context", "VISIT-DEFSTRUCT-TABLE-ALIASING-CONTEXT", 2, 0, false);
            declareFunction("visit_defstruct_object_table_aliasing_context_method", "VISIT-DEFSTRUCT-OBJECT-TABLE-ALIASING-CONTEXT-METHOD", 2, 0, false);
            declareFunction("new_table_aliasing_context", "NEW-TABLE-ALIASING-CONTEXT", 0, 0, false);
            declareFunction("copy_table_aliasing_context", "COPY-TABLE-ALIASING-CONTEXT", 1, 0, false);
            declareFunction("tac_lit_has_alias_indexP", "TAC-LIT-HAS-ALIAS-INDEX?", 3, 0, false);
            declareFunction("tac_lit_tables", "TAC-LIT-TABLES", 3, 0, false);
            declareFunction("tac_lit_table_alias", "TAC-LIT-TABLE-ALIAS", 4, 0, false);
            declareFunction("tac_lit_primary_keys", "TAC-LIT-PRIMARY-KEYS", 2, 0, false);
            declareFunction("tac_lit_primary_key_value", "TAC-LIT-PRIMARY-KEY-VALUE", 3, 0, false);
            declareFunction("tac_add_lit", "TAC-ADD-LIT", 2, 0, false);
            declareFunction("tac_add_lit_table_alias", "TAC-ADD-LIT-TABLE-ALIAS", 6, 0, false);
            declareFunction("tac_add_lit_key_value", "TAC-ADD-LIT-KEY-VALUE", 4, 0, false);
            declareFunction("tac_fix", "TAC-FIX", 1, 0, false);
            declareFunction("tac_note_namespace", "TAC-NOTE-NAMESPACE", 3, 0, false);
            declareFunction("tac_lookup_namespace", "TAC-LOOKUP-NAMESPACE", 2, 0, false);
            declareFunction("tac_add_primary_key_and_value", "TAC-ADD-PRIMARY-KEY-AND-VALUE", 4, 0, false);
            declareFunction("tac_alias_table", "TAC-ALIAS-TABLE", 4, 1, false);
            declareFunction("generate_table_alias", "GENERATE-TABLE-ALIAS", 1, 0, false);
            declareFunction("table_alias_alias_suffix", "TABLE-ALIAS-ALIAS-SUFFIX", 2, 0, false);
            declareFunction("tac_lookup_aliases_for_table", "TAC-LOOKUP-ALIASES-FOR-TABLE", 2, 1, false);
            declareFunction("tac_lookup_all_table_expressions", "TAC-LOOKUP-ALL-TABLE-EXPRESSIONS", 1, 0, false);
            declareFunction("tac_clear_lits", "TAC-CLEAR-LITS", 1, 0, false);
            declareFunction("tac_lookup_all_table_alias_index_triples", "TAC-LOOKUP-ALL-TABLE-ALIAS-INDEX-TRIPLES", 1, 0, false);
            declareFunction("fix_table_aliasing_context", "FIX-TABLE-ALIASING-CONTEXT", 1, 0, false);
            declareFunction("tac_realias_tables", "TAC-REALIAS-TABLES", 1, 0, false);
            declareFunction("tac_realias_tables_recursive", "TAC-REALIAS-TABLES-RECURSIVE", 3, 0, false);
            declareFunction("print_table_aliasing_context_contents", "PRINT-TABLE-ALIASING-CONTEXT-CONTENTS", 1, 1, false);
        }
        if (SubLFiles.USE_V2) {
            declareFunction("tac_add_lit_table_alias", "TAC-ADD-LIT-TABLE-ALIAS", 5, 0, false);
            declareFunction("tac_alias_table", "TAC-ALIAS-TABLE", 3, 1, false);
            declareFunction("tac_lookup_all_table_alias_pairs", "TAC-LOOKUP-ALL-TABLE-ALIAS-PAIRS", 1, 0, false);
        }
        return NIL;
    }

    public static SubLObject declare_sksi_query_datastructures_file_Previous() {
        declareFunction("sks_profile_print_function_trampoline", "SKS-PROFILE-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction("sks_profile_p", "SKS-PROFILE-P", 1, 0, false);
        new sksi_query_datastructures.$sks_profile_p$UnaryFunction();
        declareFunction("sks_profile_sks", "SKS-PROFILE-SKS", 1, 0, false);
        declareFunction("sks_profile_type", "SKS-PROFILE-TYPE", 1, 0, false);
        declareFunction("sks_profile_content_mt", "SKS-PROFILE-CONTENT-MT", 1, 0, false);
        declareFunction("sks_profile_mapping_mt", "SKS-PROFILE-MAPPING-MT", 1, 0, false);
        declareFunction("sks_profile_logical_schemata", "SKS-PROFILE-LOGICAL-SCHEMATA", 1, 0, false);
        declareFunction("sks_profile_physical_schemata", "SKS-PROFILE-PHYSICAL-SCHEMATA", 1, 0, false);
        declareFunction("sks_profile_required_fields", "SKS-PROFILE-REQUIRED-FIELDS", 1, 0, false);
        declareFunction("_csetf_sks_profile_sks", "_CSETF-SKS-PROFILE-SKS", 2, 0, false);
        declareFunction("_csetf_sks_profile_type", "_CSETF-SKS-PROFILE-TYPE", 2, 0, false);
        declareFunction("_csetf_sks_profile_content_mt", "_CSETF-SKS-PROFILE-CONTENT-MT", 2, 0, false);
        declareFunction("_csetf_sks_profile_mapping_mt", "_CSETF-SKS-PROFILE-MAPPING-MT", 2, 0, false);
        declareFunction("_csetf_sks_profile_logical_schemata", "_CSETF-SKS-PROFILE-LOGICAL-SCHEMATA", 2, 0, false);
        declareFunction("_csetf_sks_profile_physical_schemata", "_CSETF-SKS-PROFILE-PHYSICAL-SCHEMATA", 2, 0, false);
        declareFunction("_csetf_sks_profile_required_fields", "_CSETF-SKS-PROFILE-REQUIRED-FIELDS", 2, 0, false);
        declareFunction("make_sks_profile", "MAKE-SKS-PROFILE", 0, 1, false);
        declareFunction("visit_defstruct_sks_profile", "VISIT-DEFSTRUCT-SKS-PROFILE", 2, 0, false);
        declareFunction("visit_defstruct_object_sks_profile_method", "VISIT-DEFSTRUCT-OBJECT-SKS-PROFILE-METHOD", 2, 0, false);
        declareFunction("sks_profile_print", "SKS-PROFILE-PRINT", 3, 0, false);
        declareFunction("new_sks_profile", "NEW-SKS-PROFILE", 1, 2, false);
        declareFunction("valid_sks_profile", "VALID-SKS-PROFILE", 1, 0, false);
        declareFunction("valid_and_supported_sks_profile", "VALID-AND-SUPPORTED-SKS-PROFILE", 1, 0, false);
        declareFunction("print_sks_profile_contents", "PRINT-SKS-PROFILE-CONTENTS", 1, 1, false);
        declareFunction("table_aliasing_context_print_function_trampoline", "TABLE-ALIASING-CONTEXT-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction("table_aliasing_context_p", "TABLE-ALIASING-CONTEXT-P", 1, 0, false);
        new sksi_query_datastructures.$table_aliasing_context_p$UnaryFunction();
        declareFunction("tac_lits", "TAC-LITS", 1, 0, false);
        declareFunction("tac_aliases", "TAC-ALIASES", 1, 0, false);
        declareFunction("tac_primary_keys", "TAC-PRIMARY-KEYS", 1, 0, false);
        declareFunction("tac_primary_key_lits", "TAC-PRIMARY-KEY-LITS", 1, 0, false);
        declareFunction("tac_fixedP", "TAC-FIXED?", 1, 0, false);
        declareFunction("tac_namespaces", "TAC-NAMESPACES", 1, 0, false);
        declareFunction("_csetf_tac_lits", "_CSETF-TAC-LITS", 2, 0, false);
        declareFunction("_csetf_tac_aliases", "_CSETF-TAC-ALIASES", 2, 0, false);
        declareFunction("_csetf_tac_primary_keys", "_CSETF-TAC-PRIMARY-KEYS", 2, 0, false);
        declareFunction("_csetf_tac_primary_key_lits", "_CSETF-TAC-PRIMARY-KEY-LITS", 2, 0, false);
        declareFunction("_csetf_tac_fixedP", "_CSETF-TAC-FIXED?", 2, 0, false);
        declareFunction("_csetf_tac_namespaces", "_CSETF-TAC-NAMESPACES", 2, 0, false);
        declareFunction("make_table_aliasing_context", "MAKE-TABLE-ALIASING-CONTEXT", 0, 1, false);
        declareFunction("visit_defstruct_table_aliasing_context", "VISIT-DEFSTRUCT-TABLE-ALIASING-CONTEXT", 2, 0, false);
        declareFunction("visit_defstruct_object_table_aliasing_context_method", "VISIT-DEFSTRUCT-OBJECT-TABLE-ALIASING-CONTEXT-METHOD", 2, 0, false);
        declareFunction("new_table_aliasing_context", "NEW-TABLE-ALIASING-CONTEXT", 0, 0, false);
        declareFunction("copy_table_aliasing_context", "COPY-TABLE-ALIASING-CONTEXT", 1, 0, false);
        declareFunction("tac_lit_has_alias_indexP", "TAC-LIT-HAS-ALIAS-INDEX?", 3, 0, false);
        declareFunction("tac_lit_tables", "TAC-LIT-TABLES", 3, 0, false);
        declareFunction("tac_lit_table_alias", "TAC-LIT-TABLE-ALIAS", 4, 0, false);
        declareFunction("tac_lit_primary_keys", "TAC-LIT-PRIMARY-KEYS", 2, 0, false);
        declareFunction("tac_lit_primary_key_value", "TAC-LIT-PRIMARY-KEY-VALUE", 3, 0, false);
        declareFunction("tac_add_lit", "TAC-ADD-LIT", 2, 0, false);
        declareFunction("tac_add_lit_table_alias", "TAC-ADD-LIT-TABLE-ALIAS", 6, 0, false);
        declareFunction("tac_add_lit_key_value", "TAC-ADD-LIT-KEY-VALUE", 4, 0, false);
        declareFunction("tac_fix", "TAC-FIX", 1, 0, false);
        declareFunction("tac_note_namespace", "TAC-NOTE-NAMESPACE", 3, 0, false);
        declareFunction("tac_lookup_namespace", "TAC-LOOKUP-NAMESPACE", 2, 0, false);
        declareFunction("tac_add_primary_key_and_value", "TAC-ADD-PRIMARY-KEY-AND-VALUE", 4, 0, false);
        declareFunction("tac_alias_table", "TAC-ALIAS-TABLE", 4, 1, false);
        declareFunction("generate_table_alias", "GENERATE-TABLE-ALIAS", 1, 0, false);
        declareFunction("table_alias_alias_suffix", "TABLE-ALIAS-ALIAS-SUFFIX", 2, 0, false);
        declareFunction("tac_lookup_aliases_for_table", "TAC-LOOKUP-ALIASES-FOR-TABLE", 2, 1, false);
        declareFunction("tac_lookup_all_table_expressions", "TAC-LOOKUP-ALL-TABLE-EXPRESSIONS", 1, 0, false);
        declareFunction("tac_clear_lits", "TAC-CLEAR-LITS", 1, 0, false);
        declareFunction("tac_lookup_all_table_alias_index_triples", "TAC-LOOKUP-ALL-TABLE-ALIAS-INDEX-TRIPLES", 1, 0, false);
        declareFunction("fix_table_aliasing_context", "FIX-TABLE-ALIASING-CONTEXT", 1, 0, false);
        declareFunction("tac_realias_tables", "TAC-REALIAS-TABLES", 1, 0, false);
        declareFunction("tac_realias_tables_recursive", "TAC-REALIAS-TABLES-RECURSIVE", 3, 0, false);
        declareFunction("print_table_aliasing_context_contents", "PRINT-TABLE-ALIASING-CONTEXT-CONTENTS", 1, 1, false);
        return NIL;
    }

    static private final SubLList $list_alt2 = list(makeSymbol("SKS"), makeSymbol("TYPE"), makeSymbol("CONTENT-MT"), makeSymbol("MAPPING-MT"), makeSymbol("LOGICAL-SCHEMATA"), makeSymbol("PHYSICAL-SCHEMATA"), makeSymbol("REQUIRED-FIELDS"));

    static private final SubLList $list_alt3 = list(makeKeyword("SKS"), $TYPE, makeKeyword("CONTENT-MT"), makeKeyword("MAPPING-MT"), makeKeyword("LOGICAL-SCHEMATA"), makeKeyword("PHYSICAL-SCHEMATA"), makeKeyword("REQUIRED-FIELDS"));

    static private final SubLList $list_alt4 = list(makeSymbol("SKS-PROFILE-SKS"), makeSymbol("SKS-PROFILE-TYPE"), makeSymbol("SKS-PROFILE-CONTENT-MT"), makeSymbol("SKS-PROFILE-MAPPING-MT"), makeSymbol("SKS-PROFILE-LOGICAL-SCHEMATA"), makeSymbol("SKS-PROFILE-PHYSICAL-SCHEMATA"), makeSymbol("SKS-PROFILE-REQUIRED-FIELDS"));

    static private final SubLList $list_alt5 = list(makeSymbol("_CSETF-SKS-PROFILE-SKS"), makeSymbol("_CSETF-SKS-PROFILE-TYPE"), makeSymbol("_CSETF-SKS-PROFILE-CONTENT-MT"), makeSymbol("_CSETF-SKS-PROFILE-MAPPING-MT"), makeSymbol("_CSETF-SKS-PROFILE-LOGICAL-SCHEMATA"), makeSymbol("_CSETF-SKS-PROFILE-PHYSICAL-SCHEMATA"), makeSymbol("_CSETF-SKS-PROFILE-REQUIRED-FIELDS"));

    public static SubLObject init_sksi_query_datastructures_file() {
        defconstant("*DTP-SKS-PROFILE*", sksi_query_datastructures.SKS_PROFILE);
        defvar("*CONJUNCTIVE-SPARQL-SUPPORTED?*", T);
        defconstant("*DTP-TABLE-ALIASING-CONTEXT*", sksi_query_datastructures.TABLE_ALIASING_CONTEXT);
        defparameter("*TABLE-ALIAS-ISG*", NIL);
        return NIL;
    }

    public static final SubLObject setup_sksi_query_datastructures_file_alt() {
        register_method($print_object_method_table$.getGlobalValue(), $dtp_sks_profile$.getGlobalValue(), symbol_function(SKS_PROFILE_PRINT_FUNCTION_TRAMPOLINE));
        def_csetf(SKS_PROFILE_SKS, _CSETF_SKS_PROFILE_SKS);
        def_csetf(SKS_PROFILE_TYPE, _CSETF_SKS_PROFILE_TYPE);
        def_csetf(SKS_PROFILE_CONTENT_MT, _CSETF_SKS_PROFILE_CONTENT_MT);
        def_csetf(SKS_PROFILE_MAPPING_MT, _CSETF_SKS_PROFILE_MAPPING_MT);
        def_csetf(SKS_PROFILE_LOGICAL_SCHEMATA, _CSETF_SKS_PROFILE_LOGICAL_SCHEMATA);
        def_csetf(SKS_PROFILE_PHYSICAL_SCHEMATA, _CSETF_SKS_PROFILE_PHYSICAL_SCHEMATA);
        def_csetf(SKS_PROFILE_REQUIRED_FIELDS, _CSETF_SKS_PROFILE_REQUIRED_FIELDS);
        identity(SKS_PROFILE);
        register_method($print_object_method_table$.getGlobalValue(), $dtp_table_aliasing_context$.getGlobalValue(), symbol_function(TABLE_ALIASING_CONTEXT_PRINT_FUNCTION_TRAMPOLINE));
        def_csetf(TAC_LITS, _CSETF_TAC_LITS);
        def_csetf(TAC_ALIASES, _CSETF_TAC_ALIASES);
        def_csetf(TAC_PRIMARY_KEYS, _CSETF_TAC_PRIMARY_KEYS);
        def_csetf($sym58$TAC_FIXED_, $sym59$_CSETF_TAC_FIXED_);
        identity(TABLE_ALIASING_CONTEXT);
        return NIL;
    }

    public static SubLObject setup_sksi_query_datastructures_file() {
        if (SubLFiles.USE_V1) {
            register_method($print_object_method_table$.getGlobalValue(), sksi_query_datastructures.$dtp_sks_profile$.getGlobalValue(), symbol_function(sksi_query_datastructures.SKS_PROFILE_PRINT_FUNCTION_TRAMPOLINE));
            SubLSpecialOperatorDeclarations.proclaim(sksi_query_datastructures.$list8);
            def_csetf(sksi_query_datastructures.SKS_PROFILE_SKS, sksi_query_datastructures._CSETF_SKS_PROFILE_SKS);
            def_csetf(sksi_query_datastructures.SKS_PROFILE_TYPE, sksi_query_datastructures._CSETF_SKS_PROFILE_TYPE);
            def_csetf(sksi_query_datastructures.SKS_PROFILE_CONTENT_MT, sksi_query_datastructures._CSETF_SKS_PROFILE_CONTENT_MT);
            def_csetf(sksi_query_datastructures.SKS_PROFILE_MAPPING_MT, sksi_query_datastructures._CSETF_SKS_PROFILE_MAPPING_MT);
            def_csetf(sksi_query_datastructures.SKS_PROFILE_LOGICAL_SCHEMATA, sksi_query_datastructures._CSETF_SKS_PROFILE_LOGICAL_SCHEMATA);
            def_csetf(sksi_query_datastructures.SKS_PROFILE_PHYSICAL_SCHEMATA, sksi_query_datastructures._CSETF_SKS_PROFILE_PHYSICAL_SCHEMATA);
            def_csetf(sksi_query_datastructures.SKS_PROFILE_REQUIRED_FIELDS, sksi_query_datastructures._CSETF_SKS_PROFILE_REQUIRED_FIELDS);
            identity(sksi_query_datastructures.SKS_PROFILE);
            register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), sksi_query_datastructures.$dtp_sks_profile$.getGlobalValue(), symbol_function(sksi_query_datastructures.VISIT_DEFSTRUCT_OBJECT_SKS_PROFILE_METHOD));
            register_method($print_object_method_table$.getGlobalValue(), sksi_query_datastructures.$dtp_table_aliasing_context$.getGlobalValue(), symbol_function(sksi_query_datastructures.TABLE_ALIASING_CONTEXT_PRINT_FUNCTION_TRAMPOLINE));
            SubLSpecialOperatorDeclarations.proclaim(sksi_query_datastructures.$list55);
            def_csetf(sksi_query_datastructures.TAC_LITS, sksi_query_datastructures._CSETF_TAC_LITS);
            def_csetf(sksi_query_datastructures.TAC_ALIASES, sksi_query_datastructures._CSETF_TAC_ALIASES);
            def_csetf(sksi_query_datastructures.TAC_PRIMARY_KEYS, sksi_query_datastructures._CSETF_TAC_PRIMARY_KEYS);
            def_csetf(sksi_query_datastructures.TAC_PRIMARY_KEY_LITS, sksi_query_datastructures._CSETF_TAC_PRIMARY_KEY_LITS);
            def_csetf(sksi_query_datastructures.$sym64$TAC_FIXED_, sksi_query_datastructures.$sym65$_CSETF_TAC_FIXED_);
            def_csetf(sksi_query_datastructures.TAC_NAMESPACES, sksi_query_datastructures._CSETF_TAC_NAMESPACES);
            identity(sksi_query_datastructures.TABLE_ALIASING_CONTEXT);
            register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), sksi_query_datastructures.$dtp_table_aliasing_context$.getGlobalValue(), symbol_function(sksi_query_datastructures.VISIT_DEFSTRUCT_OBJECT_TABLE_ALIASING_CONTEXT_METHOD));
        }
        if (SubLFiles.USE_V2) {
            def_csetf($sym58$TAC_FIXED_, $sym59$_CSETF_TAC_FIXED_);
        }
        return NIL;
    }

    public static SubLObject setup_sksi_query_datastructures_file_Previous() {
        register_method($print_object_method_table$.getGlobalValue(), sksi_query_datastructures.$dtp_sks_profile$.getGlobalValue(), symbol_function(sksi_query_datastructures.SKS_PROFILE_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim(sksi_query_datastructures.$list8);
        def_csetf(sksi_query_datastructures.SKS_PROFILE_SKS, sksi_query_datastructures._CSETF_SKS_PROFILE_SKS);
        def_csetf(sksi_query_datastructures.SKS_PROFILE_TYPE, sksi_query_datastructures._CSETF_SKS_PROFILE_TYPE);
        def_csetf(sksi_query_datastructures.SKS_PROFILE_CONTENT_MT, sksi_query_datastructures._CSETF_SKS_PROFILE_CONTENT_MT);
        def_csetf(sksi_query_datastructures.SKS_PROFILE_MAPPING_MT, sksi_query_datastructures._CSETF_SKS_PROFILE_MAPPING_MT);
        def_csetf(sksi_query_datastructures.SKS_PROFILE_LOGICAL_SCHEMATA, sksi_query_datastructures._CSETF_SKS_PROFILE_LOGICAL_SCHEMATA);
        def_csetf(sksi_query_datastructures.SKS_PROFILE_PHYSICAL_SCHEMATA, sksi_query_datastructures._CSETF_SKS_PROFILE_PHYSICAL_SCHEMATA);
        def_csetf(sksi_query_datastructures.SKS_PROFILE_REQUIRED_FIELDS, sksi_query_datastructures._CSETF_SKS_PROFILE_REQUIRED_FIELDS);
        identity(sksi_query_datastructures.SKS_PROFILE);
        register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), sksi_query_datastructures.$dtp_sks_profile$.getGlobalValue(), symbol_function(sksi_query_datastructures.VISIT_DEFSTRUCT_OBJECT_SKS_PROFILE_METHOD));
        register_method($print_object_method_table$.getGlobalValue(), sksi_query_datastructures.$dtp_table_aliasing_context$.getGlobalValue(), symbol_function(sksi_query_datastructures.TABLE_ALIASING_CONTEXT_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim(sksi_query_datastructures.$list55);
        def_csetf(sksi_query_datastructures.TAC_LITS, sksi_query_datastructures._CSETF_TAC_LITS);
        def_csetf(sksi_query_datastructures.TAC_ALIASES, sksi_query_datastructures._CSETF_TAC_ALIASES);
        def_csetf(sksi_query_datastructures.TAC_PRIMARY_KEYS, sksi_query_datastructures._CSETF_TAC_PRIMARY_KEYS);
        def_csetf(sksi_query_datastructures.TAC_PRIMARY_KEY_LITS, sksi_query_datastructures._CSETF_TAC_PRIMARY_KEY_LITS);
        def_csetf(sksi_query_datastructures.$sym64$TAC_FIXED_, sksi_query_datastructures.$sym65$_CSETF_TAC_FIXED_);
        def_csetf(sksi_query_datastructures.TAC_NAMESPACES, sksi_query_datastructures._CSETF_TAC_NAMESPACES);
        identity(sksi_query_datastructures.TABLE_ALIASING_CONTEXT);
        register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), sksi_query_datastructures.$dtp_table_aliasing_context$.getGlobalValue(), symbol_function(sksi_query_datastructures.VISIT_DEFSTRUCT_OBJECT_TABLE_ALIASING_CONTEXT_METHOD));
        return NIL;
    }

    static private final SubLString $str_alt29$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");

    static private final SubLString $str_alt30$__ = makeString("#<");

    static private final SubLString $str_alt32$_a = makeString("~a");

    static private final SubLString $str_alt37$SKS___a__ = makeString("SKS: ~a~%");

    static private final SubLString $str_alt38$SKS_Type___a__ = makeString("SKS Type: ~a~%");

    static private final SubLString $str_alt39$Content_Mt___a__ = makeString("Content Mt: ~a~%");

    static private final SubLString $str_alt40$Mapping_Mt___a__ = makeString("Mapping Mt: ~a~%");

    @Override
    public void declareFunctions() {
        sksi_query_datastructures.declare_sksi_query_datastructures_file();
    }

    static private final SubLString $str_alt41$Logical_Schemata___a__ = makeString("Logical Schemata: ~a~%");

    @Override
    public void initializeVariables() {
        sksi_query_datastructures.init_sksi_query_datastructures_file();
    }

    static private final SubLString $str_alt42$Physical_Schemata___a__ = makeString("Physical Schemata: ~a~%");

    @Override
    public void runTopLevelForms() {
        sksi_query_datastructures.setup_sksi_query_datastructures_file();
    }

    static private final SubLString $str_alt43$Required_Fields___a__ = makeString("Required Fields: ~a~%");

    static {
    }

    public static final class $sks_profile_native extends SubLStructNative {
        public SubLObject $sks;

        public SubLObject $type;

        public SubLObject $content_mt;

        public SubLObject $mapping_mt;

        public SubLObject $logical_schemata;

        public SubLObject $physical_schemata;

        public SubLObject $required_fields;

        private static final SubLStructDeclNative structDecl;

        public $sks_profile_native() {
            sksi_query_datastructures.$sks_profile_native.this.$sks = Lisp.NIL;
            sksi_query_datastructures.$sks_profile_native.this.$type = Lisp.NIL;
            sksi_query_datastructures.$sks_profile_native.this.$content_mt = Lisp.NIL;
            sksi_query_datastructures.$sks_profile_native.this.$mapping_mt = Lisp.NIL;
            sksi_query_datastructures.$sks_profile_native.this.$logical_schemata = Lisp.NIL;
            sksi_query_datastructures.$sks_profile_native.this.$physical_schemata = Lisp.NIL;
            sksi_query_datastructures.$sks_profile_native.this.$required_fields = Lisp.NIL;
        }

        @Override
        public SubLStructDecl getStructDecl() {
            return structDecl;
        }

        @Override
        public SubLObject getField2() {
            return sksi_query_datastructures.$sks_profile_native.this.$sks;
        }

        @Override
        public SubLObject getField3() {
            return sksi_query_datastructures.$sks_profile_native.this.$type;
        }

        @Override
        public SubLObject getField4() {
            return sksi_query_datastructures.$sks_profile_native.this.$content_mt;
        }

        @Override
        public SubLObject getField5() {
            return sksi_query_datastructures.$sks_profile_native.this.$mapping_mt;
        }

        @Override
        public SubLObject getField6() {
            return sksi_query_datastructures.$sks_profile_native.this.$logical_schemata;
        }

        @Override
        public SubLObject getField7() {
            return sksi_query_datastructures.$sks_profile_native.this.$physical_schemata;
        }

        @Override
        public SubLObject getField8() {
            return sksi_query_datastructures.$sks_profile_native.this.$required_fields;
        }

        @Override
        public SubLObject setField2(final SubLObject value) {
            return sksi_query_datastructures.$sks_profile_native.this.$sks = value;
        }

        @Override
        public SubLObject setField3(final SubLObject value) {
            return sksi_query_datastructures.$sks_profile_native.this.$type = value;
        }

        @Override
        public SubLObject setField4(final SubLObject value) {
            return sksi_query_datastructures.$sks_profile_native.this.$content_mt = value;
        }

        @Override
        public SubLObject setField5(final SubLObject value) {
            return sksi_query_datastructures.$sks_profile_native.this.$mapping_mt = value;
        }

        @Override
        public SubLObject setField6(final SubLObject value) {
            return sksi_query_datastructures.$sks_profile_native.this.$logical_schemata = value;
        }

        @Override
        public SubLObject setField7(final SubLObject value) {
            return sksi_query_datastructures.$sks_profile_native.this.$physical_schemata = value;
        }

        @Override
        public SubLObject setField8(final SubLObject value) {
            return sksi_query_datastructures.$sks_profile_native.this.$required_fields = value;
        }

        static {
           structDecl = makeStructDeclNative(com.cyc.cycjava.cycl.sksi.query_sks.sksi_query_datastructures.$sks_profile_native.class, sksi_query_datastructures.SKS_PROFILE, sksi_query_datastructures.SKS_PROFILE_P, sksi_query_datastructures.$list2, sksi_query_datastructures.$list3, new String[]{ "$sks", "$type", "$content_mt", "$mapping_mt", "$logical_schemata", "$physical_schemata", "$required_fields" }, sksi_query_datastructures.$list4, sksi_query_datastructures.$list5, sksi_query_datastructures.SKS_PROFILE_PRINT);
        }
    }

    static private final SubLList $list_alt46 = list(makeSymbol("LITS"), makeSymbol("ALIASES"), makeSymbol("PRIMARY-KEYS"), makeSymbol("FIXED?"));

    static private final SubLList $list_alt47 = list($LITS, makeKeyword("ALIASES"), makeKeyword("PRIMARY-KEYS"), makeKeyword("FIXED?"));

    static private final SubLList $list_alt48 = list(makeSymbol("TAC-LITS"), makeSymbol("TAC-ALIASES"), makeSymbol("TAC-PRIMARY-KEYS"), makeSymbol("TAC-FIXED?"));

    static private final SubLList $list_alt49 = list(makeSymbol("_CSETF-TAC-LITS"), makeSymbol("_CSETF-TAC-ALIASES"), makeSymbol("_CSETF-TAC-PRIMARY-KEYS"), makeSymbol("_CSETF-TAC-FIXED?"));

    static private final SubLSymbol $sym58$TAC_FIXED_ = makeSymbol("TAC-FIXED?");

    static private final SubLSymbol $sym59$_CSETF_TAC_FIXED_ = makeSymbol("_CSETF-TAC-FIXED?");

    static private final SubLString $str_alt64$__ = makeString("~%");

    static private final SubLString $str_alt65$_s__ = makeString("~s~%");

    static private final SubLString $str_alt66$_____s__ = makeString(" -> ~s~%");

    static private final SubLString $str_alt67$________s_____s__ = makeString("    -> ~s -> ~s~%");

    public static final class $sks_profile_p$UnaryFunction extends UnaryFunction {
        public $sks_profile_p$UnaryFunction() {
            super(extractFunctionNamed("SKS-PROFILE-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return sksi_query_datastructures.sks_profile_p(arg1);
        }
    }

    public static final class $table_aliasing_context_native extends SubLStructNative {
        public SubLObject $lits;

        public SubLObject $aliases;

        public SubLObject $primary_keys;

        public SubLObject $primary_key_lits;

        public SubLObject $fixedP;

        public SubLObject $namespaces;

        private static final SubLStructDeclNative structDecl;

        public $table_aliasing_context_native() {
            sksi_query_datastructures.$table_aliasing_context_native.this.$lits = Lisp.NIL;
            sksi_query_datastructures.$table_aliasing_context_native.this.$aliases = Lisp.NIL;
            sksi_query_datastructures.$table_aliasing_context_native.this.$primary_keys = Lisp.NIL;
            sksi_query_datastructures.$table_aliasing_context_native.this.$primary_key_lits = Lisp.NIL;
            sksi_query_datastructures.$table_aliasing_context_native.this.$fixedP = Lisp.NIL;
            sksi_query_datastructures.$table_aliasing_context_native.this.$namespaces = Lisp.NIL;
        }

        @Override
        public SubLStructDecl getStructDecl() {
            return structDecl;
        }

        @Override
        public SubLObject getField2() {
            return sksi_query_datastructures.$table_aliasing_context_native.this.$lits;
        }

        @Override
        public SubLObject getField3() {
            return sksi_query_datastructures.$table_aliasing_context_native.this.$aliases;
        }

        @Override
        public SubLObject getField4() {
            return sksi_query_datastructures.$table_aliasing_context_native.this.$primary_keys;
        }

        @Override
        public SubLObject getField5() {
            return sksi_query_datastructures.$table_aliasing_context_native.this.$primary_key_lits;
        }

        @Override
        public SubLObject getField6() {
            return sksi_query_datastructures.$table_aliasing_context_native.this.$fixedP;
        }

        @Override
        public SubLObject getField7() {
            return sksi_query_datastructures.$table_aliasing_context_native.this.$namespaces;
        }

        @Override
        public SubLObject setField2(final SubLObject value) {
            return sksi_query_datastructures.$table_aliasing_context_native.this.$lits = value;
        }

        @Override
        public SubLObject setField3(final SubLObject value) {
            return sksi_query_datastructures.$table_aliasing_context_native.this.$aliases = value;
        }

        @Override
        public SubLObject setField4(final SubLObject value) {
            return sksi_query_datastructures.$table_aliasing_context_native.this.$primary_keys = value;
        }

        @Override
        public SubLObject setField5(final SubLObject value) {
            return sksi_query_datastructures.$table_aliasing_context_native.this.$primary_key_lits = value;
        }

        @Override
        public SubLObject setField6(final SubLObject value) {
            return sksi_query_datastructures.$table_aliasing_context_native.this.$fixedP = value;
        }

        @Override
        public SubLObject setField7(final SubLObject value) {
            return sksi_query_datastructures.$table_aliasing_context_native.this.$namespaces = value;
        }

        static {
            structDecl = makeStructDeclNative(com.cyc.cycjava.cycl.sksi.query_sks.sksi_query_datastructures.$table_aliasing_context_native.class, sksi_query_datastructures.TABLE_ALIASING_CONTEXT, sksi_query_datastructures.TABLE_ALIASING_CONTEXT_P, sksi_query_datastructures.$list49, sksi_query_datastructures.$list50, new String[]{ "$lits", "$aliases", "$primary_keys", "$primary_key_lits", "$fixedP", "$namespaces" }, sksi_query_datastructures.$list51, sksi_query_datastructures.$list52, DEFAULT_STRUCT_PRINT_FUNCTION);
        }
    }

    public static final class $table_aliasing_context_p$UnaryFunction extends UnaryFunction {
        public $table_aliasing_context_p$UnaryFunction() {
            super(extractFunctionNamed("TABLE-ALIASING-CONTEXT-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return sksi_query_datastructures.table_aliasing_context_p(arg1);
        }
    }
}

/**
 * Total time: 306 ms synthetic
 */
