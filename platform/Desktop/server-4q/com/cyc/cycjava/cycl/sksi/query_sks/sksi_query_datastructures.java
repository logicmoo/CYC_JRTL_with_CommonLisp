package com.cyc.cycjava.cycl.sksi.query_sks;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.cycjava.cycl.dictionary_contents;
import com.cyc.cycjava.cycl.string_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.cycjava.cycl.format_nil;
import com.cyc.cycjava.cycl.integer_sequence_generator;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.cycjava.cycl.dictionary_utilities;
import com.cyc.cycjava.cycl.dictionary;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.cycjava.cycl.kb_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_sks_accessors;
import com.cyc.cycjava.cycl.mt_relevance_macros;
import com.cyc.cycjava.cycl.subl_macro_promotions;
import com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_kb_accessors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_macros;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class sksi_query_datastructures extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.sksi.query_sks.sksi_query_datastructures";
    public static final String myFingerPrint = "df1209e662ba01d06b090385735911f62469ff4bbafa01213e103fd0a682b2dd";
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-query-datastructures.lisp", position = 1298L)
    public static SubLSymbol $dtp_sks_profile$;
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-query-datastructures.lisp", position = 3393L)
    private static SubLSymbol $conjunctive_sparql_supportedP$;
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-query-datastructures.lisp", position = 4763L)
    public static SubLSymbol $dtp_table_aliasing_context$;
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-query-datastructures.lisp", position = 9407L)
    private static SubLSymbol $table_alias_isg$;
    private static final SubLSymbol $sym0$SKS_PROFILE;
    private static final SubLSymbol $sym1$SKS_PROFILE_P;
    private static final SubLList $list2;
    private static final SubLList $list3;
    private static final SubLList $list4;
    private static final SubLList $list5;
    private static final SubLSymbol $sym6$SKS_PROFILE_PRINT;
    private static final SubLSymbol $sym7$SKS_PROFILE_PRINT_FUNCTION_TRAMPOLINE;
    private static final SubLList $list8;
    private static final SubLSymbol $sym9$SKS_PROFILE_SKS;
    private static final SubLSymbol $sym10$_CSETF_SKS_PROFILE_SKS;
    private static final SubLSymbol $sym11$SKS_PROFILE_TYPE;
    private static final SubLSymbol $sym12$_CSETF_SKS_PROFILE_TYPE;
    private static final SubLSymbol $sym13$SKS_PROFILE_CONTENT_MT;
    private static final SubLSymbol $sym14$_CSETF_SKS_PROFILE_CONTENT_MT;
    private static final SubLSymbol $sym15$SKS_PROFILE_MAPPING_MT;
    private static final SubLSymbol $sym16$_CSETF_SKS_PROFILE_MAPPING_MT;
    private static final SubLSymbol $sym17$SKS_PROFILE_LOGICAL_SCHEMATA;
    private static final SubLSymbol $sym18$_CSETF_SKS_PROFILE_LOGICAL_SCHEMATA;
    private static final SubLSymbol $sym19$SKS_PROFILE_PHYSICAL_SCHEMATA;
    private static final SubLSymbol $sym20$_CSETF_SKS_PROFILE_PHYSICAL_SCHEMATA;
    private static final SubLSymbol $sym21$SKS_PROFILE_REQUIRED_FIELDS;
    private static final SubLSymbol $sym22$_CSETF_SKS_PROFILE_REQUIRED_FIELDS;
    private static final SubLSymbol $kw23$SKS;
    private static final SubLSymbol $kw24$TYPE;
    private static final SubLSymbol $kw25$CONTENT_MT;
    private static final SubLSymbol $kw26$MAPPING_MT;
    private static final SubLSymbol $kw27$LOGICAL_SCHEMATA;
    private static final SubLSymbol $kw28$PHYSICAL_SCHEMATA;
    private static final SubLSymbol $kw29$REQUIRED_FIELDS;
    private static final SubLString $str30$Invalid_slot__S_for_construction_;
    private static final SubLSymbol $kw31$BEGIN;
    private static final SubLSymbol $sym32$MAKE_SKS_PROFILE;
    private static final SubLSymbol $kw33$SLOT;
    private static final SubLSymbol $kw34$END;
    private static final SubLSymbol $sym35$VISIT_DEFSTRUCT_OBJECT_SKS_PROFILE_METHOD;
    private static final SubLString $str36$_a;
    private static final SubLSymbol $sym37$CATCH_ERROR_MESSAGE_HANDLER;
    private static final SubLObject $const38$Database_Physical;
    private static final SubLObject $const39$RDFTripleStore_Physical;
    private static final SubLString $str40$SKS___a__;
    private static final SubLString $str41$SKS_Type___a__;
    private static final SubLString $str42$Content_Mt___a__;
    private static final SubLString $str43$Mapping_Mt___a__;
    private static final SubLString $str44$Logical_Schemata___a__;
    private static final SubLString $str45$Physical_Schemata___a__;
    private static final SubLString $str46$Required_Fields___a__;
    private static final SubLSymbol $sym47$TABLE_ALIASING_CONTEXT;
    private static final SubLSymbol $sym48$TABLE_ALIASING_CONTEXT_P;
    private static final SubLList $list49;
    private static final SubLList $list50;
    private static final SubLList $list51;
    private static final SubLList $list52;
    private static final SubLSymbol $sym53$DEFAULT_STRUCT_PRINT_FUNCTION;
    private static final SubLSymbol $sym54$TABLE_ALIASING_CONTEXT_PRINT_FUNCTION_TRAMPOLINE;
    private static final SubLList $list55;
    private static final SubLSymbol $sym56$TAC_LITS;
    private static final SubLSymbol $sym57$_CSETF_TAC_LITS;
    private static final SubLSymbol $sym58$TAC_ALIASES;
    private static final SubLSymbol $sym59$_CSETF_TAC_ALIASES;
    private static final SubLSymbol $sym60$TAC_PRIMARY_KEYS;
    private static final SubLSymbol $sym61$_CSETF_TAC_PRIMARY_KEYS;
    private static final SubLSymbol $sym62$TAC_PRIMARY_KEY_LITS;
    private static final SubLSymbol $sym63$_CSETF_TAC_PRIMARY_KEY_LITS;
    private static final SubLSymbol $sym64$TAC_FIXED_;
    private static final SubLSymbol $sym65$_CSETF_TAC_FIXED_;
    private static final SubLSymbol $sym66$TAC_NAMESPACES;
    private static final SubLSymbol $sym67$_CSETF_TAC_NAMESPACES;
    private static final SubLSymbol $kw68$LITS;
    private static final SubLSymbol $kw69$ALIASES;
    private static final SubLSymbol $kw70$PRIMARY_KEYS;
    private static final SubLSymbol $kw71$PRIMARY_KEY_LITS;
    private static final SubLSymbol $kw72$FIXED_;
    private static final SubLSymbol $kw73$NAMESPACES;
    private static final SubLSymbol $sym74$MAKE_TABLE_ALIASING_CONTEXT;
    private static final SubLSymbol $sym75$VISIT_DEFSTRUCT_OBJECT_TABLE_ALIASING_CONTEXT_METHOD;
    private static final SubLSymbol $sym76$STRINGP;
    private static final SubLSymbol $sym77$INTEGERP;
    private static final SubLString $str78$__;
    private static final SubLString $str79$_s__;
    private static final SubLString $str80$_____s__;
    private static final SubLString $str81$________s_____s__;
    
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-query-datastructures.lisp", position = 1298L)
    public static SubLObject sks_profile_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        sks_profile_print(v_object, stream, (SubLObject)sksi_query_datastructures.ZERO_INTEGER);
        return (SubLObject)sksi_query_datastructures.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-query-datastructures.lisp", position = 1298L)
    public static SubLObject sks_profile_p(final SubLObject v_object) {
        return (SubLObject)((v_object.getClass() == $sks_profile_native.class) ? sksi_query_datastructures.T : sksi_query_datastructures.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-query-datastructures.lisp", position = 1298L)
    public static SubLObject sks_profile_sks(final SubLObject v_object) {
        assert sksi_query_datastructures.NIL != sks_profile_p(v_object) : v_object;
        return v_object.getField2();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-query-datastructures.lisp", position = 1298L)
    public static SubLObject sks_profile_type(final SubLObject v_object) {
        assert sksi_query_datastructures.NIL != sks_profile_p(v_object) : v_object;
        return v_object.getField3();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-query-datastructures.lisp", position = 1298L)
    public static SubLObject sks_profile_content_mt(final SubLObject v_object) {
        assert sksi_query_datastructures.NIL != sks_profile_p(v_object) : v_object;
        return v_object.getField4();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-query-datastructures.lisp", position = 1298L)
    public static SubLObject sks_profile_mapping_mt(final SubLObject v_object) {
        assert sksi_query_datastructures.NIL != sks_profile_p(v_object) : v_object;
        return v_object.getField5();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-query-datastructures.lisp", position = 1298L)
    public static SubLObject sks_profile_logical_schemata(final SubLObject v_object) {
        assert sksi_query_datastructures.NIL != sks_profile_p(v_object) : v_object;
        return v_object.getField6();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-query-datastructures.lisp", position = 1298L)
    public static SubLObject sks_profile_physical_schemata(final SubLObject v_object) {
        assert sksi_query_datastructures.NIL != sks_profile_p(v_object) : v_object;
        return v_object.getField7();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-query-datastructures.lisp", position = 1298L)
    public static SubLObject sks_profile_required_fields(final SubLObject v_object) {
        assert sksi_query_datastructures.NIL != sks_profile_p(v_object) : v_object;
        return v_object.getField8();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-query-datastructures.lisp", position = 1298L)
    public static SubLObject _csetf_sks_profile_sks(final SubLObject v_object, final SubLObject value) {
        assert sksi_query_datastructures.NIL != sks_profile_p(v_object) : v_object;
        return v_object.setField2(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-query-datastructures.lisp", position = 1298L)
    public static SubLObject _csetf_sks_profile_type(final SubLObject v_object, final SubLObject value) {
        assert sksi_query_datastructures.NIL != sks_profile_p(v_object) : v_object;
        return v_object.setField3(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-query-datastructures.lisp", position = 1298L)
    public static SubLObject _csetf_sks_profile_content_mt(final SubLObject v_object, final SubLObject value) {
        assert sksi_query_datastructures.NIL != sks_profile_p(v_object) : v_object;
        return v_object.setField4(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-query-datastructures.lisp", position = 1298L)
    public static SubLObject _csetf_sks_profile_mapping_mt(final SubLObject v_object, final SubLObject value) {
        assert sksi_query_datastructures.NIL != sks_profile_p(v_object) : v_object;
        return v_object.setField5(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-query-datastructures.lisp", position = 1298L)
    public static SubLObject _csetf_sks_profile_logical_schemata(final SubLObject v_object, final SubLObject value) {
        assert sksi_query_datastructures.NIL != sks_profile_p(v_object) : v_object;
        return v_object.setField6(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-query-datastructures.lisp", position = 1298L)
    public static SubLObject _csetf_sks_profile_physical_schemata(final SubLObject v_object, final SubLObject value) {
        assert sksi_query_datastructures.NIL != sks_profile_p(v_object) : v_object;
        return v_object.setField7(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-query-datastructures.lisp", position = 1298L)
    public static SubLObject _csetf_sks_profile_required_fields(final SubLObject v_object, final SubLObject value) {
        assert sksi_query_datastructures.NIL != sks_profile_p(v_object) : v_object;
        return v_object.setField8(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-query-datastructures.lisp", position = 1298L)
    public static SubLObject make_sks_profile(SubLObject arglist) {
        if (arglist == sksi_query_datastructures.UNPROVIDED) {
            arglist = (SubLObject)sksi_query_datastructures.NIL;
        }
        final SubLObject v_new = (SubLObject)new $sks_profile_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = (SubLObject)sksi_query_datastructures.NIL, next = arglist; sksi_query_datastructures.NIL != next; next = conses_high.cddr(next)) {
            current_arg = next.first();
            current_value = conses_high.cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql((SubLObject)sksi_query_datastructures.$kw23$SKS)) {
                _csetf_sks_profile_sks(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)sksi_query_datastructures.$kw24$TYPE)) {
                _csetf_sks_profile_type(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)sksi_query_datastructures.$kw25$CONTENT_MT)) {
                _csetf_sks_profile_content_mt(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)sksi_query_datastructures.$kw26$MAPPING_MT)) {
                _csetf_sks_profile_mapping_mt(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)sksi_query_datastructures.$kw27$LOGICAL_SCHEMATA)) {
                _csetf_sks_profile_logical_schemata(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)sksi_query_datastructures.$kw28$PHYSICAL_SCHEMATA)) {
                _csetf_sks_profile_physical_schemata(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)sksi_query_datastructures.$kw29$REQUIRED_FIELDS)) {
                _csetf_sks_profile_required_fields(v_new, current_value);
            }
            else {
                Errors.error((SubLObject)sksi_query_datastructures.$str30$Invalid_slot__S_for_construction_, current_arg);
            }
        }
        return v_new;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-query-datastructures.lisp", position = 1298L)
    public static SubLObject visit_defstruct_sks_profile(final SubLObject obj, final SubLObject visitor_fn) {
        Functions.funcall(visitor_fn, obj, (SubLObject)sksi_query_datastructures.$kw31$BEGIN, (SubLObject)sksi_query_datastructures.$sym32$MAKE_SKS_PROFILE, (SubLObject)sksi_query_datastructures.SEVEN_INTEGER);
        Functions.funcall(visitor_fn, obj, (SubLObject)sksi_query_datastructures.$kw33$SLOT, (SubLObject)sksi_query_datastructures.$kw23$SKS, sks_profile_sks(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)sksi_query_datastructures.$kw33$SLOT, (SubLObject)sksi_query_datastructures.$kw24$TYPE, sks_profile_type(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)sksi_query_datastructures.$kw33$SLOT, (SubLObject)sksi_query_datastructures.$kw25$CONTENT_MT, sks_profile_content_mt(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)sksi_query_datastructures.$kw33$SLOT, (SubLObject)sksi_query_datastructures.$kw26$MAPPING_MT, sks_profile_mapping_mt(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)sksi_query_datastructures.$kw33$SLOT, (SubLObject)sksi_query_datastructures.$kw27$LOGICAL_SCHEMATA, sks_profile_logical_schemata(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)sksi_query_datastructures.$kw33$SLOT, (SubLObject)sksi_query_datastructures.$kw28$PHYSICAL_SCHEMATA, sks_profile_physical_schemata(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)sksi_query_datastructures.$kw33$SLOT, (SubLObject)sksi_query_datastructures.$kw29$REQUIRED_FIELDS, sks_profile_required_fields(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)sksi_query_datastructures.$kw34$END, (SubLObject)sksi_query_datastructures.$sym32$MAKE_SKS_PROFILE, (SubLObject)sksi_query_datastructures.SEVEN_INTEGER);
        return obj;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-query-datastructures.lisp", position = 1298L)
    public static SubLObject visit_defstruct_object_sks_profile_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_sks_profile(obj, visitor_fn);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-query-datastructures.lisp", position = 1493L)
    public static SubLObject sks_profile_print(final SubLObject v_object, final SubLObject stream, final SubLObject depth) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (sksi_query_datastructures.NIL != print_high.$print_readably$.getDynamicValue(thread)) {
            print_high.print_not_readable(v_object, stream);
        }
        else {
            print_macros.print_unreadable_object_preamble(stream, v_object, (SubLObject)sksi_query_datastructures.T, (SubLObject)sksi_query_datastructures.T);
            PrintLow.format(stream, (SubLObject)sksi_query_datastructures.$str36$_a, sks_profile_sks(v_object));
            print_macros.print_unreadable_object_postamble(stream, v_object, (SubLObject)sksi_query_datastructures.T, (SubLObject)sksi_query_datastructures.T);
        }
        return v_object;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-query-datastructures.lisp", position = 1698L)
    public static SubLObject new_sks_profile(final SubLObject sks, SubLObject mt, SubLObject ignore_errorsP) {
        if (mt == sksi_query_datastructures.UNPROVIDED) {
            mt = (SubLObject)sksi_query_datastructures.NIL;
        }
        if (ignore_errorsP == sksi_query_datastructures.UNPROVIDED) {
            ignore_errorsP = (SubLObject)sksi_query_datastructures.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject meta_mt = (sksi_query_datastructures.NIL != mt) ? mt : sksi_kb_accessors.sk_source_mapping_mt(sks);
        SubLObject sp = (SubLObject)sksi_query_datastructures.NIL;
        SubLObject error = (SubLObject)sksi_query_datastructures.NIL;
        try {
            thread.throwStack.push(subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind((SubLObject)sksi_query_datastructures.$sym37$CATCH_ERROR_MESSAGE_HANDLER, thread);
                try {
                    final SubLObject mt_var = meta_mt;
                    final SubLObject _prev_bind_0_$1 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt_var), thread);
                        mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt_var), thread);
                        final SubLObject type = sksi_kb_accessors.sk_source_ks_type(sks);
                        final SubLObject content_mt = sksi_kb_accessors.sk_source_content_mt(sks);
                        final SubLObject mapping_mt = sksi_kb_accessors.sk_source_mapping_mt(sks);
                        final SubLObject logical_schemata = sksi_kb_accessors.sk_source_complex_logical_schemata(sks);
                        final SubLObject physical_schemata = sksi_kb_accessors.sk_source_complex_physical_schemata(sks);
                        final SubLObject required_fields = sksi_kb_accessors.sk_source_complex_required_fields(sks);
                        sp = make_sks_profile((SubLObject)sksi_query_datastructures.UNPROVIDED);
                        _csetf_sks_profile_sks(sp, sks);
                        _csetf_sks_profile_type(sp, type);
                        _csetf_sks_profile_content_mt(sp, content_mt);
                        _csetf_sks_profile_mapping_mt(sp, mapping_mt);
                        _csetf_sks_profile_logical_schemata(sp, logical_schemata);
                        _csetf_sks_profile_physical_schemata(sp, physical_schemata);
                        _csetf_sks_profile_required_fields(sp, required_fields);
                    }
                    finally {
                        mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0_$1, thread);
                    }
                }
                catch (Throwable catch_var) {
                    Errors.handleThrowable(catch_var, (SubLObject)sksi_query_datastructures.NIL);
                }
            }
            finally {
                Errors.$error_handler$.rebind(_prev_bind_0, thread);
            }
        }
        catch (Throwable ccatch_env_var) {
            error = Errors.handleThrowable(ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
        }
        finally {
            thread.throwStack.pop();
        }
        if (sksi_query_datastructures.NIL != error) {
            if (sksi_query_datastructures.NIL != ignore_errorsP) {
                Errors.warn(error);
                sp = (SubLObject)sksi_query_datastructures.NIL;
            }
            else {
                Errors.error(error);
            }
        }
        return sp;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-query-datastructures.lisp", position = 2888L)
    public static SubLObject valid_sks_profile(final SubLObject sp) {
        return (SubLObject)SubLObjectFactory.makeBoolean(sksi_query_datastructures.NIL != sks_profile_p(sp) && sksi_query_datastructures.NIL != sksi_sks_accessors.sks_p(sks_profile_sks(sp)) && sksi_query_datastructures.NIL != sksi_sks_accessors.sks_type_p(sks_profile_type(sp)) && sksi_query_datastructures.NIL != sksi_kb_accessors.sksi_content_mt_p(sks_profile_content_mt(sp)) && sksi_query_datastructures.NIL != sksi_kb_accessors.sksi_mapping_mt_p(sks_profile_mapping_mt(sp)) && sksi_query_datastructures.NIL != list_utilities.non_empty_list_p(sks_profile_logical_schemata(sp)) && sksi_query_datastructures.NIL != list_utilities.non_empty_list_p(sks_profile_physical_schemata(sp)) && sks_profile_required_fields(sp).isList());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-query-datastructures.lisp", position = 3445L)
    public static SubLObject valid_and_supported_sks_profile(final SubLObject sp) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return (SubLObject)SubLObjectFactory.makeBoolean(sksi_query_datastructures.NIL != valid_sks_profile(sp) && (sksi_query_datastructures.NIL != kb_utilities.kbeq(sks_profile_type(sp), sksi_query_datastructures.$const38$Database_Physical) || (sksi_query_datastructures.NIL != sksi_query_datastructures.$conjunctive_sparql_supportedP$.getDynamicValue(thread) && sksi_query_datastructures.NIL != kb_utilities.kbeq(sks_profile_type(sp), sksi_query_datastructures.$const39$RDFTripleStore_Physical))));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-query-datastructures.lisp", position = 3903L)
    public static SubLObject print_sks_profile_contents(final SubLObject sp, SubLObject stream) {
        if (stream == sksi_query_datastructures.UNPROVIDED) {
            stream = (SubLObject)sksi_query_datastructures.NIL;
        }
        PrintLow.format(stream, (SubLObject)sksi_query_datastructures.$str40$SKS___a__, sks_profile_sks(sp));
        PrintLow.format(stream, (SubLObject)sksi_query_datastructures.$str41$SKS_Type___a__, sks_profile_type(sp));
        PrintLow.format(stream, (SubLObject)sksi_query_datastructures.$str42$Content_Mt___a__, sks_profile_content_mt(sp));
        PrintLow.format(stream, (SubLObject)sksi_query_datastructures.$str43$Mapping_Mt___a__, sks_profile_mapping_mt(sp));
        PrintLow.format(stream, (SubLObject)sksi_query_datastructures.$str44$Logical_Schemata___a__, sks_profile_logical_schemata(sp));
        PrintLow.format(stream, (SubLObject)sksi_query_datastructures.$str45$Physical_Schemata___a__, sks_profile_physical_schemata(sp));
        PrintLow.format(stream, (SubLObject)sksi_query_datastructures.$str46$Required_Fields___a__, sks_profile_required_fields(sp));
        return (SubLObject)sksi_query_datastructures.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-query-datastructures.lisp", position = 4763L)
    public static SubLObject table_aliasing_context_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        compatibility.default_struct_print_function(v_object, stream, (SubLObject)sksi_query_datastructures.ZERO_INTEGER);
        return (SubLObject)sksi_query_datastructures.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-query-datastructures.lisp", position = 4763L)
    public static SubLObject table_aliasing_context_p(final SubLObject v_object) {
        return (SubLObject)((v_object.getClass() == $table_aliasing_context_native.class) ? sksi_query_datastructures.T : sksi_query_datastructures.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-query-datastructures.lisp", position = 4763L)
    public static SubLObject tac_lits(final SubLObject v_object) {
        assert sksi_query_datastructures.NIL != table_aliasing_context_p(v_object) : v_object;
        return v_object.getField2();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-query-datastructures.lisp", position = 4763L)
    public static SubLObject tac_aliases(final SubLObject v_object) {
        assert sksi_query_datastructures.NIL != table_aliasing_context_p(v_object) : v_object;
        return v_object.getField3();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-query-datastructures.lisp", position = 4763L)
    public static SubLObject tac_primary_keys(final SubLObject v_object) {
        assert sksi_query_datastructures.NIL != table_aliasing_context_p(v_object) : v_object;
        return v_object.getField4();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-query-datastructures.lisp", position = 4763L)
    public static SubLObject tac_primary_key_lits(final SubLObject v_object) {
        assert sksi_query_datastructures.NIL != table_aliasing_context_p(v_object) : v_object;
        return v_object.getField5();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-query-datastructures.lisp", position = 4763L)
    public static SubLObject tac_fixedP(final SubLObject v_object) {
        assert sksi_query_datastructures.NIL != table_aliasing_context_p(v_object) : v_object;
        return v_object.getField6();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-query-datastructures.lisp", position = 4763L)
    public static SubLObject tac_namespaces(final SubLObject v_object) {
        assert sksi_query_datastructures.NIL != table_aliasing_context_p(v_object) : v_object;
        return v_object.getField7();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-query-datastructures.lisp", position = 4763L)
    public static SubLObject _csetf_tac_lits(final SubLObject v_object, final SubLObject value) {
        assert sksi_query_datastructures.NIL != table_aliasing_context_p(v_object) : v_object;
        return v_object.setField2(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-query-datastructures.lisp", position = 4763L)
    public static SubLObject _csetf_tac_aliases(final SubLObject v_object, final SubLObject value) {
        assert sksi_query_datastructures.NIL != table_aliasing_context_p(v_object) : v_object;
        return v_object.setField3(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-query-datastructures.lisp", position = 4763L)
    public static SubLObject _csetf_tac_primary_keys(final SubLObject v_object, final SubLObject value) {
        assert sksi_query_datastructures.NIL != table_aliasing_context_p(v_object) : v_object;
        return v_object.setField4(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-query-datastructures.lisp", position = 4763L)
    public static SubLObject _csetf_tac_primary_key_lits(final SubLObject v_object, final SubLObject value) {
        assert sksi_query_datastructures.NIL != table_aliasing_context_p(v_object) : v_object;
        return v_object.setField5(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-query-datastructures.lisp", position = 4763L)
    public static SubLObject _csetf_tac_fixedP(final SubLObject v_object, final SubLObject value) {
        assert sksi_query_datastructures.NIL != table_aliasing_context_p(v_object) : v_object;
        return v_object.setField6(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-query-datastructures.lisp", position = 4763L)
    public static SubLObject _csetf_tac_namespaces(final SubLObject v_object, final SubLObject value) {
        assert sksi_query_datastructures.NIL != table_aliasing_context_p(v_object) : v_object;
        return v_object.setField7(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-query-datastructures.lisp", position = 4763L)
    public static SubLObject make_table_aliasing_context(SubLObject arglist) {
        if (arglist == sksi_query_datastructures.UNPROVIDED) {
            arglist = (SubLObject)sksi_query_datastructures.NIL;
        }
        final SubLObject v_new = (SubLObject)new $table_aliasing_context_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = (SubLObject)sksi_query_datastructures.NIL, next = arglist; sksi_query_datastructures.NIL != next; next = conses_high.cddr(next)) {
            current_arg = next.first();
            current_value = conses_high.cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql((SubLObject)sksi_query_datastructures.$kw68$LITS)) {
                _csetf_tac_lits(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)sksi_query_datastructures.$kw69$ALIASES)) {
                _csetf_tac_aliases(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)sksi_query_datastructures.$kw70$PRIMARY_KEYS)) {
                _csetf_tac_primary_keys(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)sksi_query_datastructures.$kw71$PRIMARY_KEY_LITS)) {
                _csetf_tac_primary_key_lits(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)sksi_query_datastructures.$kw72$FIXED_)) {
                _csetf_tac_fixedP(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)sksi_query_datastructures.$kw73$NAMESPACES)) {
                _csetf_tac_namespaces(v_new, current_value);
            }
            else {
                Errors.error((SubLObject)sksi_query_datastructures.$str30$Invalid_slot__S_for_construction_, current_arg);
            }
        }
        return v_new;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-query-datastructures.lisp", position = 4763L)
    public static SubLObject visit_defstruct_table_aliasing_context(final SubLObject obj, final SubLObject visitor_fn) {
        Functions.funcall(visitor_fn, obj, (SubLObject)sksi_query_datastructures.$kw31$BEGIN, (SubLObject)sksi_query_datastructures.$sym74$MAKE_TABLE_ALIASING_CONTEXT, (SubLObject)sksi_query_datastructures.SIX_INTEGER);
        Functions.funcall(visitor_fn, obj, (SubLObject)sksi_query_datastructures.$kw33$SLOT, (SubLObject)sksi_query_datastructures.$kw68$LITS, tac_lits(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)sksi_query_datastructures.$kw33$SLOT, (SubLObject)sksi_query_datastructures.$kw69$ALIASES, tac_aliases(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)sksi_query_datastructures.$kw33$SLOT, (SubLObject)sksi_query_datastructures.$kw70$PRIMARY_KEYS, tac_primary_keys(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)sksi_query_datastructures.$kw33$SLOT, (SubLObject)sksi_query_datastructures.$kw71$PRIMARY_KEY_LITS, tac_primary_key_lits(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)sksi_query_datastructures.$kw33$SLOT, (SubLObject)sksi_query_datastructures.$kw72$FIXED_, tac_fixedP(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)sksi_query_datastructures.$kw33$SLOT, (SubLObject)sksi_query_datastructures.$kw73$NAMESPACES, tac_namespaces(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)sksi_query_datastructures.$kw34$END, (SubLObject)sksi_query_datastructures.$sym74$MAKE_TABLE_ALIASING_CONTEXT, (SubLObject)sksi_query_datastructures.SIX_INTEGER);
        return obj;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-query-datastructures.lisp", position = 4763L)
    public static SubLObject visit_defstruct_object_table_aliasing_context_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_table_aliasing_context(obj, visitor_fn);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-query-datastructures.lisp", position = 4994L)
    public static SubLObject new_table_aliasing_context() {
        final SubLObject tac = make_table_aliasing_context((SubLObject)sksi_query_datastructures.UNPROVIDED);
        _csetf_tac_aliases(tac, dictionary.new_dictionary(Symbols.symbol_function((SubLObject)sksi_query_datastructures.EQUAL), (SubLObject)sksi_query_datastructures.UNPROVIDED));
        _csetf_tac_primary_keys(tac, dictionary.new_dictionary(Symbols.symbol_function((SubLObject)sksi_query_datastructures.EQUAL), (SubLObject)sksi_query_datastructures.UNPROVIDED));
        _csetf_tac_namespaces(tac, dictionary.new_dictionary(Symbols.symbol_function((SubLObject)sksi_query_datastructures.EQUAL), (SubLObject)sksi_query_datastructures.UNPROVIDED));
        return tac;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-query-datastructures.lisp", position = 5325L)
    public static SubLObject copy_table_aliasing_context(final SubLObject tac) {
        final SubLObject new_tac = make_table_aliasing_context((SubLObject)sksi_query_datastructures.UNPROVIDED);
        _csetf_tac_lits(new_tac, conses_high.copy_tree(tac_lits(tac)));
        _csetf_tac_aliases(new_tac, dictionary_utilities.copy_dictionary_recursive(tac_aliases(tac)));
        _csetf_tac_primary_keys(new_tac, dictionary_utilities.copy_dictionary_recursive(tac_primary_keys(tac)));
        _csetf_tac_namespaces(new_tac, dictionary_utilities.copy_dictionary_recursive(tac_namespaces(tac)));
        return new_tac;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-query-datastructures.lisp", position = 5762L)
    public static SubLObject tac_lit_has_alias_indexP(final SubLObject tac, final SubLObject lit, final SubLObject alias_index) {
        final SubLObject lit_entry = dictionary.dictionary_lookup(tac_aliases(tac), lit, (SubLObject)sksi_query_datastructures.UNPROVIDED);
        final SubLObject index_entry = (SubLObject)((sksi_query_datastructures.NIL != dictionary.dictionary_p(lit_entry)) ? dictionary.dictionary_lookup(lit_entry, alias_index, (SubLObject)sksi_query_datastructures.UNPROVIDED) : sksi_query_datastructures.NIL);
        return dictionary.dictionary_p(index_entry);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-query-datastructures.lisp", position = 6065L)
    public static SubLObject tac_lit_tables(final SubLObject tac, final SubLObject lit, final SubLObject alias_index) {
        final SubLObject lit_entry = dictionary.dictionary_lookup(tac_aliases(tac), lit, (SubLObject)sksi_query_datastructures.UNPROVIDED);
        final SubLObject index_entry = (SubLObject)((sksi_query_datastructures.NIL != dictionary.dictionary_p(lit_entry)) ? dictionary.dictionary_lookup(lit_entry, alias_index, (SubLObject)sksi_query_datastructures.UNPROVIDED) : sksi_query_datastructures.NIL);
        return (SubLObject)((sksi_query_datastructures.NIL != dictionary.dictionary_p(index_entry)) ? dictionary.dictionary_keys(index_entry) : sksi_query_datastructures.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-query-datastructures.lisp", position = 6353L)
    public static SubLObject tac_lit_table_alias(final SubLObject tac, final SubLObject lit, final SubLObject alias_index, final SubLObject table) {
        final SubLObject lit_entry = dictionary.dictionary_lookup(tac_aliases(tac), lit, (SubLObject)sksi_query_datastructures.UNPROVIDED);
        final SubLObject index_entry = (SubLObject)((sksi_query_datastructures.NIL != dictionary.dictionary_p(lit_entry)) ? dictionary.dictionary_lookup(lit_entry, alias_index, (SubLObject)sksi_query_datastructures.UNPROVIDED) : sksi_query_datastructures.NIL);
        return (SubLObject)((sksi_query_datastructures.NIL != dictionary.dictionary_p(index_entry)) ? dictionary.dictionary_lookup(index_entry, table, (SubLObject)sksi_query_datastructures.UNPROVIDED) : sksi_query_datastructures.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-query-datastructures.lisp", position = 6660L)
    public static SubLObject tac_lit_primary_keys(final SubLObject tac, final SubLObject lit) {
        final SubLObject lit_entry = dictionary.dictionary_lookup(tac_primary_keys(tac), lit, (SubLObject)sksi_query_datastructures.UNPROVIDED);
        return (SubLObject)((sksi_query_datastructures.NIL != dictionary.dictionary_p(lit_entry)) ? dictionary.dictionary_keys(lit_entry) : sksi_query_datastructures.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-query-datastructures.lisp", position = 6850L)
    public static SubLObject tac_lit_primary_key_value(final SubLObject tac, final SubLObject lit, final SubLObject primary_key) {
        final SubLObject lit_entry = dictionary.dictionary_lookup(tac_primary_keys(tac), lit, (SubLObject)sksi_query_datastructures.UNPROVIDED);
        return (SubLObject)((sksi_query_datastructures.NIL != dictionary.dictionary_p(lit_entry)) ? dictionary.dictionary_lookup(lit_entry, primary_key, (SubLObject)sksi_query_datastructures.UNPROVIDED) : sksi_query_datastructures.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-query-datastructures.lisp", position = 7071L)
    public static SubLObject tac_add_lit(final SubLObject tac, final SubLObject lit) {
        if (sksi_query_datastructures.NIL == conses_high.member(lit, tac_lits(tac), Symbols.symbol_function((SubLObject)sksi_query_datastructures.EQUAL), Symbols.symbol_function((SubLObject)sksi_query_datastructures.IDENTITY))) {
            _csetf_tac_lits(tac, (SubLObject)ConsesLow.cons(lit, tac_lits(tac)));
        }
        return (SubLObject)sksi_query_datastructures.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-query-datastructures.lisp", position = 7356L)
    public static SubLObject tac_add_lit_table_alias(final SubLObject tac, final SubLObject lit, final SubLObject alias_index, final SubLObject table_name, final SubLObject alias, final SubLObject namespace) {
        tac_note_namespace(tac, alias, namespace);
        SubLObject lit_entry = dictionary.dictionary_lookup(tac_aliases(tac), lit, (SubLObject)sksi_query_datastructures.UNPROVIDED);
        if (sksi_query_datastructures.NIL == dictionary.dictionary_p(lit_entry)) {
            if (sksi_query_datastructures.NIL == conses_high.member(lit, tac_lits(tac), Symbols.symbol_function((SubLObject)sksi_query_datastructures.EQUAL), Symbols.symbol_function((SubLObject)sksi_query_datastructures.IDENTITY))) {
                _csetf_tac_lits(tac, (SubLObject)ConsesLow.cons(lit, tac_lits(tac)));
            }
            lit_entry = dictionary.new_dictionary(Symbols.symbol_function((SubLObject)sksi_query_datastructures.EQL), (SubLObject)sksi_query_datastructures.UNPROVIDED);
            dictionary.dictionary_enter(tac_aliases(tac), lit, lit_entry);
        }
        SubLObject index_entry = dictionary.dictionary_lookup(lit_entry, alias_index, (SubLObject)sksi_query_datastructures.UNPROVIDED);
        if (sksi_query_datastructures.NIL == dictionary.dictionary_p(index_entry)) {
            index_entry = dictionary.new_dictionary(Symbols.symbol_function((SubLObject)sksi_query_datastructures.EQUAL), (SubLObject)sksi_query_datastructures.UNPROVIDED);
            dictionary.dictionary_enter(lit_entry, alias_index, index_entry);
        }
        return dictionary.dictionary_enter(index_entry, table_name, alias);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-query-datastructures.lisp", position = 8013L)
    public static SubLObject tac_add_lit_key_value(final SubLObject tac, final SubLObject lit, final SubLObject primary_key, final SubLObject value) {
        SubLObject lit_entry = dictionary.dictionary_lookup(tac_primary_keys(tac), lit, (SubLObject)sksi_query_datastructures.UNPROVIDED);
        if (sksi_query_datastructures.NIL == dictionary.dictionary_p(lit_entry)) {
            lit_entry = dictionary.new_dictionary(Symbols.symbol_function((SubLObject)sksi_query_datastructures.EQUAL), (SubLObject)sksi_query_datastructures.UNPROVIDED);
            dictionary.dictionary_enter(tac_primary_keys(tac), lit, lit_entry);
            _csetf_tac_primary_key_lits(tac, (SubLObject)ConsesLow.cons(lit, tac_primary_key_lits(tac)));
        }
        return dictionary.dictionary_enter(lit_entry, primary_key, value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-query-datastructures.lisp", position = 8403L)
    public static SubLObject tac_fix(final SubLObject tac) {
        _csetf_tac_fixedP(tac, (SubLObject)sksi_query_datastructures.T);
        return tac_fixedP(tac);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-query-datastructures.lisp", position = 8489L)
    public static SubLObject tac_note_namespace(final SubLObject tac, final SubLObject alias, final SubLObject namespace) {
        return dictionary.dictionary_enter(tac_namespaces(tac), alias, namespace);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-query-datastructures.lisp", position = 8612L)
    public static SubLObject tac_lookup_namespace(final SubLObject tac, final SubLObject alias) {
        return dictionary.dictionary_lookup_without_values(tac_namespaces(tac), alias, (SubLObject)sksi_query_datastructures.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-query-datastructures.lisp", position = 8733L)
    public static SubLObject tac_add_primary_key_and_value(final SubLObject tac, final SubLObject lit, final SubLObject primary_key, final SubLObject value) {
        return tac_add_lit_key_value(tac, lit, primary_key, value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-query-datastructures.lisp", position = 8909L)
    public static SubLObject tac_alias_table(final SubLObject tac, final SubLObject lit, final SubLObject table_name, final SubLObject namespace, SubLObject alias_index) {
        if (alias_index == sksi_query_datastructures.UNPROVIDED) {
            alias_index = (SubLObject)sksi_query_datastructures.ZERO_INTEGER;
        }
        assert sksi_query_datastructures.NIL != table_aliasing_context_p(tac) : tac;
        if (sksi_query_datastructures.NIL != namespace && !sksi_query_datastructures.assertionsDisabledInClass && sksi_query_datastructures.NIL == Types.stringp(namespace)) {
            throw new AssertionError(namespace);
        }
        if (sksi_query_datastructures.NIL != alias_index && !sksi_query_datastructures.assertionsDisabledInClass && sksi_query_datastructures.NIL == Types.integerp(alias_index)) {
            throw new AssertionError(alias_index);
        }
        SubLObject alias = tac_lit_table_alias(tac, lit, alias_index, table_name);
        if (sksi_query_datastructures.NIL == tac_fixedP(tac)) {
            if (sksi_query_datastructures.NIL == alias) {
                alias = generate_table_alias(table_name);
            }
            tac_add_lit_table_alias(tac, lit, alias_index, table_name, alias, namespace);
        }
        return alias;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-query-datastructures.lisp", position = 9536L)
    public static SubLObject generate_table_alias(final SubLObject table) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (sksi_query_datastructures.NIL != integer_sequence_generator.integer_sequence_generator_p(sksi_query_datastructures.$table_alias_isg$.getDynamicValue(thread))) {
            final SubLObject next_number = integer_sequence_generator.integer_sequence_generator_next(sksi_query_datastructures.$table_alias_isg$.getDynamicValue(thread));
            return Sequences.cconcatenate(format_nil.format_nil_a_no_copy(table), format_nil.format_nil_a_no_copy(next_number));
        }
        return format_nil.format_nil_a(Symbols.gensym(table));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-query-datastructures.lisp", position = 9816L)
    public static SubLObject table_alias_alias_suffix(final SubLObject table_alias, final SubLObject table_name) {
        return string_utilities.pre_remove(table_alias, table_name, (SubLObject)sksi_query_datastructures.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-query-datastructures.lisp", position = 9930L)
    public static SubLObject tac_lookup_aliases_for_table(final SubLObject tac, final SubLObject table_name, SubLObject alias_index) {
        if (alias_index == sksi_query_datastructures.UNPROVIDED) {
            alias_index = (SubLObject)sksi_query_datastructures.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert sksi_query_datastructures.NIL != table_aliasing_context_p(tac) : tac;
        SubLObject aliases = (SubLObject)sksi_query_datastructures.NIL;
        if (sksi_query_datastructures.NIL != alias_index) {
            SubLObject cdolist_list_var = tac_lits(tac);
            SubLObject lit = (SubLObject)sksi_query_datastructures.NIL;
            lit = cdolist_list_var.first();
            while (sksi_query_datastructures.NIL != cdolist_list_var) {
                final SubLObject lit_aliases = dictionary.dictionary_lookup(tac_aliases(tac), lit, (SubLObject)sksi_query_datastructures.UNPROVIDED);
                final SubLObject lit_index_aliases = dictionary.dictionary_lookup(lit_aliases, alias_index, (SubLObject)sksi_query_datastructures.UNPROVIDED);
                if (sksi_query_datastructures.NIL != dictionary.dictionary_p(lit_index_aliases)) {
                    final SubLObject alias = dictionary.dictionary_lookup(lit_index_aliases, table_name, (SubLObject)sksi_query_datastructures.UNPROVIDED);
                    if (sksi_query_datastructures.NIL != alias) {
                        aliases = (SubLObject)ConsesLow.cons(alias, aliases);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                lit = cdolist_list_var.first();
            }
        }
        else {
            SubLObject cdolist_list_var = tac_lits(tac);
            SubLObject lit = (SubLObject)sksi_query_datastructures.NIL;
            lit = cdolist_list_var.first();
            while (sksi_query_datastructures.NIL != cdolist_list_var) {
                final SubLObject lit_aliases = dictionary.dictionary_lookup(tac_aliases(tac), lit, (SubLObject)sksi_query_datastructures.UNPROVIDED);
                SubLObject iteration_state;
                for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(lit_aliases)); sksi_query_datastructures.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                    thread.resetMultipleValues();
                    final SubLObject key = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                    final SubLObject lit_index_aliases2 = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    final SubLObject alias2 = dictionary.dictionary_lookup(lit_index_aliases2, table_name, (SubLObject)sksi_query_datastructures.UNPROVIDED);
                    if (sksi_query_datastructures.NIL != alias2) {
                        aliases = (SubLObject)ConsesLow.cons(alias2, aliases);
                    }
                }
                dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                cdolist_list_var = cdolist_list_var.rest();
                lit = cdolist_list_var.first();
            }
        }
        return aliases;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-query-datastructures.lisp", position = 10737L)
    public static SubLObject tac_lookup_all_table_expressions(final SubLObject tac) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert sksi_query_datastructures.NIL != table_aliasing_context_p(tac) : tac;
        SubLObject tuples = (SubLObject)sksi_query_datastructures.NIL;
        SubLObject cdolist_list_var = tac_lits(tac);
        SubLObject lit = (SubLObject)sksi_query_datastructures.NIL;
        lit = cdolist_list_var.first();
        while (sksi_query_datastructures.NIL != cdolist_list_var) {
            final SubLObject lit_aliases = dictionary.dictionary_lookup(tac_aliases(tac), lit, (SubLObject)sksi_query_datastructures.UNPROVIDED);
            SubLObject iteration_state;
            for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(lit_aliases)); sksi_query_datastructures.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                thread.resetMultipleValues();
                final SubLObject key = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                final SubLObject lit_index_aliases = thread.secondMultipleValue();
                thread.resetMultipleValues();
                SubLObject iteration_state_$2;
                for (iteration_state_$2 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(lit_index_aliases)); sksi_query_datastructures.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$2); iteration_state_$2 = dictionary_contents.do_dictionary_contents_next(iteration_state_$2)) {
                    thread.resetMultipleValues();
                    final SubLObject table = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$2);
                    final SubLObject alias = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    final SubLObject namespace = tac_lookup_namespace(tac, alias);
                    tuples = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(table, alias, namespace), tuples);
                }
                dictionary_contents.do_dictionary_contents_finalize(iteration_state_$2);
            }
            dictionary_contents.do_dictionary_contents_finalize(iteration_state);
            cdolist_list_var = cdolist_list_var.rest();
            lit = cdolist_list_var.first();
        }
        return list_utilities.fast_delete_duplicates(tuples, Symbols.symbol_function((SubLObject)sksi_query_datastructures.EQUAL), (SubLObject)sksi_query_datastructures.UNPROVIDED, (SubLObject)sksi_query_datastructures.UNPROVIDED, (SubLObject)sksi_query_datastructures.UNPROVIDED, (SubLObject)sksi_query_datastructures.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-query-datastructures.lisp", position = 11230L)
    public static SubLObject tac_clear_lits(final SubLObject tac) {
        _csetf_tac_lits(tac, (SubLObject)sksi_query_datastructures.NIL);
        return (SubLObject)sksi_query_datastructures.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-query-datastructures.lisp", position = 11312L)
    public static SubLObject tac_lookup_all_table_alias_index_triples(final SubLObject tac) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert sksi_query_datastructures.NIL != table_aliasing_context_p(tac) : tac;
        SubLObject triples = (SubLObject)sksi_query_datastructures.NIL;
        SubLObject cdolist_list_var = tac_lits(tac);
        SubLObject lit = (SubLObject)sksi_query_datastructures.NIL;
        lit = cdolist_list_var.first();
        while (sksi_query_datastructures.NIL != cdolist_list_var) {
            final SubLObject lit_aliases = dictionary.dictionary_lookup(tac_aliases(tac), lit, (SubLObject)sksi_query_datastructures.UNPROVIDED);
            SubLObject iteration_state;
            for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(lit_aliases)); sksi_query_datastructures.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                thread.resetMultipleValues();
                final SubLObject index = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                final SubLObject lit_index_aliases = thread.secondMultipleValue();
                thread.resetMultipleValues();
                SubLObject iteration_state_$3;
                for (iteration_state_$3 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(lit_index_aliases)); sksi_query_datastructures.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$3); iteration_state_$3 = dictionary_contents.do_dictionary_contents_next(iteration_state_$3)) {
                    thread.resetMultipleValues();
                    final SubLObject table = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$3);
                    final SubLObject alias = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    triples = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(table, alias, index), triples);
                }
                dictionary_contents.do_dictionary_contents_finalize(iteration_state_$3);
            }
            dictionary_contents.do_dictionary_contents_finalize(iteration_state);
            cdolist_list_var = cdolist_list_var.rest();
            lit = cdolist_list_var.first();
        }
        return list_utilities.fast_delete_duplicates(triples, Symbols.symbol_function((SubLObject)sksi_query_datastructures.EQUAL), (SubLObject)sksi_query_datastructures.UNPROVIDED, (SubLObject)sksi_query_datastructures.UNPROVIDED, (SubLObject)sksi_query_datastructures.UNPROVIDED, (SubLObject)sksi_query_datastructures.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-query-datastructures.lisp", position = 11750L)
    public static SubLObject fix_table_aliasing_context(final SubLObject tac) {
        assert sksi_query_datastructures.NIL != table_aliasing_context_p(tac) : tac;
        return tac_fix(tac);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-query-datastructures.lisp", position = 11870L)
    public static SubLObject tac_realias_tables(final SubLObject tac) {
        return (SubLObject)((sksi_query_datastructures.NIL != tac_fixedP(tac)) ? sksi_query_datastructures.NIL : tac_realias_tables_recursive((SubLObject)sksi_query_datastructures.NIL, tac_primary_key_lits(tac), tac));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-query-datastructures.lisp", position = 12297L)
    public static SubLObject tac_realias_tables_recursive(final SubLObject lits_so_far, final SubLObject remaining_lits, final SubLObject tac) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (sksi_query_datastructures.NIL == remaining_lits) {
            return (SubLObject)sksi_query_datastructures.NIL;
        }
        final SubLObject lit0 = remaining_lits.first();
        final SubLObject lit0_primary_keys = dictionary.dictionary_lookup(tac_primary_keys(tac), lit0, (SubLObject)sksi_query_datastructures.UNPROVIDED);
        final SubLObject lit0_indices = dictionary.dictionary_lookup(tac_aliases(tac), lit0, (SubLObject)sksi_query_datastructures.UNPROVIDED);
        SubLObject alist = (SubLObject)sksi_query_datastructures.NIL;
        SubLObject iteration_state;
        for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(lit0_indices)); sksi_query_datastructures.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
            thread.resetMultipleValues();
            final SubLObject alias_index = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
            final SubLObject lit0_index_tables = thread.secondMultipleValue();
            thread.resetMultipleValues();
            SubLObject doneP = (SubLObject)sksi_query_datastructures.NIL;
            if (sksi_query_datastructures.NIL == doneP) {
                SubLObject csome_list_var = lits_so_far;
                SubLObject lit2 = (SubLObject)sksi_query_datastructures.NIL;
                lit2 = csome_list_var.first();
                while (sksi_query_datastructures.NIL == doneP && sksi_query_datastructures.NIL != csome_list_var) {
                    if (sksi_query_datastructures.NIL != tac_lit_has_alias_indexP(tac, lit2, alias_index)) {
                        SubLObject primary_key_matchP;
                        SubLObject iteration_state_$4;
                        SubLObject lit0_key;
                        SubLObject lit0_value;
                        for (primary_key_matchP = (SubLObject)sksi_query_datastructures.NIL, iteration_state_$4 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(lit0_primary_keys)); sksi_query_datastructures.NIL == primary_key_matchP && sksi_query_datastructures.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$4); primary_key_matchP = Equality.equal(lit0_value, tac_lit_primary_key_value(tac, lit2, lit0_key)), iteration_state_$4 = dictionary_contents.do_dictionary_contents_next(iteration_state_$4)) {
                            thread.resetMultipleValues();
                            lit0_key = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$4);
                            lit0_value = thread.secondMultipleValue();
                            thread.resetMultipleValues();
                        }
                        dictionary_contents.do_dictionary_contents_finalize(iteration_state_$4);
                        if (sksi_query_datastructures.NIL != primary_key_matchP) {
                            SubLObject iteration_state_$5;
                            for (iteration_state_$5 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(lit0_index_tables)); sksi_query_datastructures.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$5); iteration_state_$5 = dictionary_contents.do_dictionary_contents_next(iteration_state_$5)) {
                                thread.resetMultipleValues();
                                final SubLObject lit0_table = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$5);
                                final SubLObject lit0_alias = thread.secondMultipleValue();
                                thread.resetMultipleValues();
                                final SubLObject lit1_alias = tac_lit_table_alias(tac, lit2, alias_index, lit0_table);
                                if (!lit0_alias.equal(lit1_alias)) {
                                    final SubLObject lit1_namespace = tac_lookup_namespace(tac, lit1_alias);
                                    tac_add_lit_table_alias(tac, lit0, alias_index, lit0_table, lit1_alias, lit1_namespace);
                                    alist = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.cons(lit0_alias, lit1_alias), alist);
                                    doneP = (SubLObject)sksi_query_datastructures.T;
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
        return ConsesLow.append(alist, tac_realias_tables_recursive(list_utilities.snoc(lit0, lits_so_far), remaining_lits.rest(), tac));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-query-datastructures.lisp", position = 13629L)
    public static SubLObject print_table_aliasing_context_contents(final SubLObject tac, SubLObject stream) {
        if (stream == sksi_query_datastructures.UNPROVIDED) {
            stream = (SubLObject)sksi_query_datastructures.T;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        PrintLow.format(stream, (SubLObject)sksi_query_datastructures.$str78$__);
        SubLObject cdolist_list_var = tac_lits(tac);
        SubLObject lit = (SubLObject)sksi_query_datastructures.NIL;
        lit = cdolist_list_var.first();
        while (sksi_query_datastructures.NIL != cdolist_list_var) {
            final SubLObject lit_aliases = dictionary.dictionary_lookup(tac_aliases(tac), lit, (SubLObject)sksi_query_datastructures.UNPROVIDED);
            PrintLow.format(stream, (SubLObject)sksi_query_datastructures.$str79$_s__, lit);
            SubLObject iteration_state;
            for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(lit_aliases)); sksi_query_datastructures.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                thread.resetMultipleValues();
                final SubLObject index = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                final SubLObject lit_index_tables = thread.secondMultipleValue();
                thread.resetMultipleValues();
                PrintLow.format(stream, (SubLObject)sksi_query_datastructures.$str80$_____s__, index);
                SubLObject iteration_state_$6;
                for (iteration_state_$6 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(lit_index_tables)); sksi_query_datastructures.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$6); iteration_state_$6 = dictionary_contents.do_dictionary_contents_next(iteration_state_$6)) {
                    thread.resetMultipleValues();
                    final SubLObject table = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$6);
                    final SubLObject alias = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    PrintLow.format(stream, (SubLObject)sksi_query_datastructures.$str81$________s_____s__, table, alias);
                }
                dictionary_contents.do_dictionary_contents_finalize(iteration_state_$6);
            }
            dictionary_contents.do_dictionary_contents_finalize(iteration_state);
            cdolist_list_var = cdolist_list_var.rest();
            lit = cdolist_list_var.first();
        }
        return (SubLObject)sksi_query_datastructures.NIL;
    }
    
    public static SubLObject declare_sksi_query_datastructures_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_query_datastructures", "sks_profile_print_function_trampoline", "SKS-PROFILE-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_query_datastructures", "sks_profile_p", "SKS-PROFILE-P", 1, 0, false);
        new $sks_profile_p$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_query_datastructures", "sks_profile_sks", "SKS-PROFILE-SKS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_query_datastructures", "sks_profile_type", "SKS-PROFILE-TYPE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_query_datastructures", "sks_profile_content_mt", "SKS-PROFILE-CONTENT-MT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_query_datastructures", "sks_profile_mapping_mt", "SKS-PROFILE-MAPPING-MT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_query_datastructures", "sks_profile_logical_schemata", "SKS-PROFILE-LOGICAL-SCHEMATA", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_query_datastructures", "sks_profile_physical_schemata", "SKS-PROFILE-PHYSICAL-SCHEMATA", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_query_datastructures", "sks_profile_required_fields", "SKS-PROFILE-REQUIRED-FIELDS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_query_datastructures", "_csetf_sks_profile_sks", "_CSETF-SKS-PROFILE-SKS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_query_datastructures", "_csetf_sks_profile_type", "_CSETF-SKS-PROFILE-TYPE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_query_datastructures", "_csetf_sks_profile_content_mt", "_CSETF-SKS-PROFILE-CONTENT-MT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_query_datastructures", "_csetf_sks_profile_mapping_mt", "_CSETF-SKS-PROFILE-MAPPING-MT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_query_datastructures", "_csetf_sks_profile_logical_schemata", "_CSETF-SKS-PROFILE-LOGICAL-SCHEMATA", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_query_datastructures", "_csetf_sks_profile_physical_schemata", "_CSETF-SKS-PROFILE-PHYSICAL-SCHEMATA", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_query_datastructures", "_csetf_sks_profile_required_fields", "_CSETF-SKS-PROFILE-REQUIRED-FIELDS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_query_datastructures", "make_sks_profile", "MAKE-SKS-PROFILE", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_query_datastructures", "visit_defstruct_sks_profile", "VISIT-DEFSTRUCT-SKS-PROFILE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_query_datastructures", "visit_defstruct_object_sks_profile_method", "VISIT-DEFSTRUCT-OBJECT-SKS-PROFILE-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_query_datastructures", "sks_profile_print", "SKS-PROFILE-PRINT", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_query_datastructures", "new_sks_profile", "NEW-SKS-PROFILE", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_query_datastructures", "valid_sks_profile", "VALID-SKS-PROFILE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_query_datastructures", "valid_and_supported_sks_profile", "VALID-AND-SUPPORTED-SKS-PROFILE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_query_datastructures", "print_sks_profile_contents", "PRINT-SKS-PROFILE-CONTENTS", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_query_datastructures", "table_aliasing_context_print_function_trampoline", "TABLE-ALIASING-CONTEXT-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_query_datastructures", "table_aliasing_context_p", "TABLE-ALIASING-CONTEXT-P", 1, 0, false);
        new $table_aliasing_context_p$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_query_datastructures", "tac_lits", "TAC-LITS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_query_datastructures", "tac_aliases", "TAC-ALIASES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_query_datastructures", "tac_primary_keys", "TAC-PRIMARY-KEYS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_query_datastructures", "tac_primary_key_lits", "TAC-PRIMARY-KEY-LITS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_query_datastructures", "tac_fixedP", "TAC-FIXED?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_query_datastructures", "tac_namespaces", "TAC-NAMESPACES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_query_datastructures", "_csetf_tac_lits", "_CSETF-TAC-LITS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_query_datastructures", "_csetf_tac_aliases", "_CSETF-TAC-ALIASES", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_query_datastructures", "_csetf_tac_primary_keys", "_CSETF-TAC-PRIMARY-KEYS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_query_datastructures", "_csetf_tac_primary_key_lits", "_CSETF-TAC-PRIMARY-KEY-LITS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_query_datastructures", "_csetf_tac_fixedP", "_CSETF-TAC-FIXED?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_query_datastructures", "_csetf_tac_namespaces", "_CSETF-TAC-NAMESPACES", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_query_datastructures", "make_table_aliasing_context", "MAKE-TABLE-ALIASING-CONTEXT", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_query_datastructures", "visit_defstruct_table_aliasing_context", "VISIT-DEFSTRUCT-TABLE-ALIASING-CONTEXT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_query_datastructures", "visit_defstruct_object_table_aliasing_context_method", "VISIT-DEFSTRUCT-OBJECT-TABLE-ALIASING-CONTEXT-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_query_datastructures", "new_table_aliasing_context", "NEW-TABLE-ALIASING-CONTEXT", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_query_datastructures", "copy_table_aliasing_context", "COPY-TABLE-ALIASING-CONTEXT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_query_datastructures", "tac_lit_has_alias_indexP", "TAC-LIT-HAS-ALIAS-INDEX?", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_query_datastructures", "tac_lit_tables", "TAC-LIT-TABLES", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_query_datastructures", "tac_lit_table_alias", "TAC-LIT-TABLE-ALIAS", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_query_datastructures", "tac_lit_primary_keys", "TAC-LIT-PRIMARY-KEYS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_query_datastructures", "tac_lit_primary_key_value", "TAC-LIT-PRIMARY-KEY-VALUE", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_query_datastructures", "tac_add_lit", "TAC-ADD-LIT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_query_datastructures", "tac_add_lit_table_alias", "TAC-ADD-LIT-TABLE-ALIAS", 6, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_query_datastructures", "tac_add_lit_key_value", "TAC-ADD-LIT-KEY-VALUE", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_query_datastructures", "tac_fix", "TAC-FIX", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_query_datastructures", "tac_note_namespace", "TAC-NOTE-NAMESPACE", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_query_datastructures", "tac_lookup_namespace", "TAC-LOOKUP-NAMESPACE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_query_datastructures", "tac_add_primary_key_and_value", "TAC-ADD-PRIMARY-KEY-AND-VALUE", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_query_datastructures", "tac_alias_table", "TAC-ALIAS-TABLE", 4, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_query_datastructures", "generate_table_alias", "GENERATE-TABLE-ALIAS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_query_datastructures", "table_alias_alias_suffix", "TABLE-ALIAS-ALIAS-SUFFIX", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_query_datastructures", "tac_lookup_aliases_for_table", "TAC-LOOKUP-ALIASES-FOR-TABLE", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_query_datastructures", "tac_lookup_all_table_expressions", "TAC-LOOKUP-ALL-TABLE-EXPRESSIONS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_query_datastructures", "tac_clear_lits", "TAC-CLEAR-LITS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_query_datastructures", "tac_lookup_all_table_alias_index_triples", "TAC-LOOKUP-ALL-TABLE-ALIAS-INDEX-TRIPLES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_query_datastructures", "fix_table_aliasing_context", "FIX-TABLE-ALIASING-CONTEXT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_query_datastructures", "tac_realias_tables", "TAC-REALIAS-TABLES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_query_datastructures", "tac_realias_tables_recursive", "TAC-REALIAS-TABLES-RECURSIVE", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_query_datastructures", "print_table_aliasing_context_contents", "PRINT-TABLE-ALIASING-CONTEXT-CONTENTS", 1, 1, false);
        return (SubLObject)sksi_query_datastructures.NIL;
    }
    
    public static SubLObject init_sksi_query_datastructures_file() {
        sksi_query_datastructures.$dtp_sks_profile$ = SubLFiles.defconstant("*DTP-SKS-PROFILE*", (SubLObject)sksi_query_datastructures.$sym0$SKS_PROFILE);
        sksi_query_datastructures.$conjunctive_sparql_supportedP$ = SubLFiles.defvar("*CONJUNCTIVE-SPARQL-SUPPORTED?*", (SubLObject)sksi_query_datastructures.T);
        sksi_query_datastructures.$dtp_table_aliasing_context$ = SubLFiles.defconstant("*DTP-TABLE-ALIASING-CONTEXT*", (SubLObject)sksi_query_datastructures.$sym47$TABLE_ALIASING_CONTEXT);
        sksi_query_datastructures.$table_alias_isg$ = SubLFiles.defparameter("*TABLE-ALIAS-ISG*", (SubLObject)sksi_query_datastructures.NIL);
        return (SubLObject)sksi_query_datastructures.NIL;
    }
    
    public static SubLObject setup_sksi_query_datastructures_file() {
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), sksi_query_datastructures.$dtp_sks_profile$.getGlobalValue(), Symbols.symbol_function((SubLObject)sksi_query_datastructures.$sym7$SKS_PROFILE_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)sksi_query_datastructures.$list8);
        Structures.def_csetf((SubLObject)sksi_query_datastructures.$sym9$SKS_PROFILE_SKS, (SubLObject)sksi_query_datastructures.$sym10$_CSETF_SKS_PROFILE_SKS);
        Structures.def_csetf((SubLObject)sksi_query_datastructures.$sym11$SKS_PROFILE_TYPE, (SubLObject)sksi_query_datastructures.$sym12$_CSETF_SKS_PROFILE_TYPE);
        Structures.def_csetf((SubLObject)sksi_query_datastructures.$sym13$SKS_PROFILE_CONTENT_MT, (SubLObject)sksi_query_datastructures.$sym14$_CSETF_SKS_PROFILE_CONTENT_MT);
        Structures.def_csetf((SubLObject)sksi_query_datastructures.$sym15$SKS_PROFILE_MAPPING_MT, (SubLObject)sksi_query_datastructures.$sym16$_CSETF_SKS_PROFILE_MAPPING_MT);
        Structures.def_csetf((SubLObject)sksi_query_datastructures.$sym17$SKS_PROFILE_LOGICAL_SCHEMATA, (SubLObject)sksi_query_datastructures.$sym18$_CSETF_SKS_PROFILE_LOGICAL_SCHEMATA);
        Structures.def_csetf((SubLObject)sksi_query_datastructures.$sym19$SKS_PROFILE_PHYSICAL_SCHEMATA, (SubLObject)sksi_query_datastructures.$sym20$_CSETF_SKS_PROFILE_PHYSICAL_SCHEMATA);
        Structures.def_csetf((SubLObject)sksi_query_datastructures.$sym21$SKS_PROFILE_REQUIRED_FIELDS, (SubLObject)sksi_query_datastructures.$sym22$_CSETF_SKS_PROFILE_REQUIRED_FIELDS);
        Equality.identity((SubLObject)sksi_query_datastructures.$sym0$SKS_PROFILE);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), sksi_query_datastructures.$dtp_sks_profile$.getGlobalValue(), Symbols.symbol_function((SubLObject)sksi_query_datastructures.$sym35$VISIT_DEFSTRUCT_OBJECT_SKS_PROFILE_METHOD));
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), sksi_query_datastructures.$dtp_table_aliasing_context$.getGlobalValue(), Symbols.symbol_function((SubLObject)sksi_query_datastructures.$sym54$TABLE_ALIASING_CONTEXT_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)sksi_query_datastructures.$list55);
        Structures.def_csetf((SubLObject)sksi_query_datastructures.$sym56$TAC_LITS, (SubLObject)sksi_query_datastructures.$sym57$_CSETF_TAC_LITS);
        Structures.def_csetf((SubLObject)sksi_query_datastructures.$sym58$TAC_ALIASES, (SubLObject)sksi_query_datastructures.$sym59$_CSETF_TAC_ALIASES);
        Structures.def_csetf((SubLObject)sksi_query_datastructures.$sym60$TAC_PRIMARY_KEYS, (SubLObject)sksi_query_datastructures.$sym61$_CSETF_TAC_PRIMARY_KEYS);
        Structures.def_csetf((SubLObject)sksi_query_datastructures.$sym62$TAC_PRIMARY_KEY_LITS, (SubLObject)sksi_query_datastructures.$sym63$_CSETF_TAC_PRIMARY_KEY_LITS);
        Structures.def_csetf((SubLObject)sksi_query_datastructures.$sym64$TAC_FIXED_, (SubLObject)sksi_query_datastructures.$sym65$_CSETF_TAC_FIXED_);
        Structures.def_csetf((SubLObject)sksi_query_datastructures.$sym66$TAC_NAMESPACES, (SubLObject)sksi_query_datastructures.$sym67$_CSETF_TAC_NAMESPACES);
        Equality.identity((SubLObject)sksi_query_datastructures.$sym47$TABLE_ALIASING_CONTEXT);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), sksi_query_datastructures.$dtp_table_aliasing_context$.getGlobalValue(), Symbols.symbol_function((SubLObject)sksi_query_datastructures.$sym75$VISIT_DEFSTRUCT_OBJECT_TABLE_ALIASING_CONTEXT_METHOD));
        return (SubLObject)sksi_query_datastructures.NIL;
    }
    
    @Override
	public void declareFunctions() {
        declare_sksi_query_datastructures_file();
    }
    
    @Override
	public void initializeVariables() {
        init_sksi_query_datastructures_file();
    }
    
    @Override
	public void runTopLevelForms() {
        setup_sksi_query_datastructures_file();
    }
    
    static {
        me = (SubLFile)new sksi_query_datastructures();
        sksi_query_datastructures.$dtp_sks_profile$ = null;
        sksi_query_datastructures.$conjunctive_sparql_supportedP$ = null;
        sksi_query_datastructures.$dtp_table_aliasing_context$ = null;
        sksi_query_datastructures.$table_alias_isg$ = null;
        $sym0$SKS_PROFILE = SubLObjectFactory.makeSymbol("SKS-PROFILE");
        $sym1$SKS_PROFILE_P = SubLObjectFactory.makeSymbol("SKS-PROFILE-P");
        $list2 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SKS"), (SubLObject)SubLObjectFactory.makeSymbol("TYPE"), (SubLObject)SubLObjectFactory.makeSymbol("CONTENT-MT"), (SubLObject)SubLObjectFactory.makeSymbol("MAPPING-MT"), (SubLObject)SubLObjectFactory.makeSymbol("LOGICAL-SCHEMATA"), (SubLObject)SubLObjectFactory.makeSymbol("PHYSICAL-SCHEMATA"), (SubLObject)SubLObjectFactory.makeSymbol("REQUIRED-FIELDS"));
        $list3 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("SKS"), (SubLObject)SubLObjectFactory.makeKeyword("TYPE"), (SubLObject)SubLObjectFactory.makeKeyword("CONTENT-MT"), (SubLObject)SubLObjectFactory.makeKeyword("MAPPING-MT"), (SubLObject)SubLObjectFactory.makeKeyword("LOGICAL-SCHEMATA"), (SubLObject)SubLObjectFactory.makeKeyword("PHYSICAL-SCHEMATA"), (SubLObject)SubLObjectFactory.makeKeyword("REQUIRED-FIELDS"));
        $list4 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SKS-PROFILE-SKS"), (SubLObject)SubLObjectFactory.makeSymbol("SKS-PROFILE-TYPE"), (SubLObject)SubLObjectFactory.makeSymbol("SKS-PROFILE-CONTENT-MT"), (SubLObject)SubLObjectFactory.makeSymbol("SKS-PROFILE-MAPPING-MT"), (SubLObject)SubLObjectFactory.makeSymbol("SKS-PROFILE-LOGICAL-SCHEMATA"), (SubLObject)SubLObjectFactory.makeSymbol("SKS-PROFILE-PHYSICAL-SCHEMATA"), (SubLObject)SubLObjectFactory.makeSymbol("SKS-PROFILE-REQUIRED-FIELDS"));
        $list5 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("_CSETF-SKS-PROFILE-SKS"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-SKS-PROFILE-TYPE"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-SKS-PROFILE-CONTENT-MT"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-SKS-PROFILE-MAPPING-MT"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-SKS-PROFILE-LOGICAL-SCHEMATA"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-SKS-PROFILE-PHYSICAL-SCHEMATA"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-SKS-PROFILE-REQUIRED-FIELDS"));
        $sym6$SKS_PROFILE_PRINT = SubLObjectFactory.makeSymbol("SKS-PROFILE-PRINT");
        $sym7$SKS_PROFILE_PRINT_FUNCTION_TRAMPOLINE = SubLObjectFactory.makeSymbol("SKS-PROFILE-PRINT-FUNCTION-TRAMPOLINE");
        $list8 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("SKS-PROFILE-P"));
        $sym9$SKS_PROFILE_SKS = SubLObjectFactory.makeSymbol("SKS-PROFILE-SKS");
        $sym10$_CSETF_SKS_PROFILE_SKS = SubLObjectFactory.makeSymbol("_CSETF-SKS-PROFILE-SKS");
        $sym11$SKS_PROFILE_TYPE = SubLObjectFactory.makeSymbol("SKS-PROFILE-TYPE");
        $sym12$_CSETF_SKS_PROFILE_TYPE = SubLObjectFactory.makeSymbol("_CSETF-SKS-PROFILE-TYPE");
        $sym13$SKS_PROFILE_CONTENT_MT = SubLObjectFactory.makeSymbol("SKS-PROFILE-CONTENT-MT");
        $sym14$_CSETF_SKS_PROFILE_CONTENT_MT = SubLObjectFactory.makeSymbol("_CSETF-SKS-PROFILE-CONTENT-MT");
        $sym15$SKS_PROFILE_MAPPING_MT = SubLObjectFactory.makeSymbol("SKS-PROFILE-MAPPING-MT");
        $sym16$_CSETF_SKS_PROFILE_MAPPING_MT = SubLObjectFactory.makeSymbol("_CSETF-SKS-PROFILE-MAPPING-MT");
        $sym17$SKS_PROFILE_LOGICAL_SCHEMATA = SubLObjectFactory.makeSymbol("SKS-PROFILE-LOGICAL-SCHEMATA");
        $sym18$_CSETF_SKS_PROFILE_LOGICAL_SCHEMATA = SubLObjectFactory.makeSymbol("_CSETF-SKS-PROFILE-LOGICAL-SCHEMATA");
        $sym19$SKS_PROFILE_PHYSICAL_SCHEMATA = SubLObjectFactory.makeSymbol("SKS-PROFILE-PHYSICAL-SCHEMATA");
        $sym20$_CSETF_SKS_PROFILE_PHYSICAL_SCHEMATA = SubLObjectFactory.makeSymbol("_CSETF-SKS-PROFILE-PHYSICAL-SCHEMATA");
        $sym21$SKS_PROFILE_REQUIRED_FIELDS = SubLObjectFactory.makeSymbol("SKS-PROFILE-REQUIRED-FIELDS");
        $sym22$_CSETF_SKS_PROFILE_REQUIRED_FIELDS = SubLObjectFactory.makeSymbol("_CSETF-SKS-PROFILE-REQUIRED-FIELDS");
        $kw23$SKS = SubLObjectFactory.makeKeyword("SKS");
        $kw24$TYPE = SubLObjectFactory.makeKeyword("TYPE");
        $kw25$CONTENT_MT = SubLObjectFactory.makeKeyword("CONTENT-MT");
        $kw26$MAPPING_MT = SubLObjectFactory.makeKeyword("MAPPING-MT");
        $kw27$LOGICAL_SCHEMATA = SubLObjectFactory.makeKeyword("LOGICAL-SCHEMATA");
        $kw28$PHYSICAL_SCHEMATA = SubLObjectFactory.makeKeyword("PHYSICAL-SCHEMATA");
        $kw29$REQUIRED_FIELDS = SubLObjectFactory.makeKeyword("REQUIRED-FIELDS");
        $str30$Invalid_slot__S_for_construction_ = SubLObjectFactory.makeString("Invalid slot ~S for construction function");
        $kw31$BEGIN = SubLObjectFactory.makeKeyword("BEGIN");
        $sym32$MAKE_SKS_PROFILE = SubLObjectFactory.makeSymbol("MAKE-SKS-PROFILE");
        $kw33$SLOT = SubLObjectFactory.makeKeyword("SLOT");
        $kw34$END = SubLObjectFactory.makeKeyword("END");
        $sym35$VISIT_DEFSTRUCT_OBJECT_SKS_PROFILE_METHOD = SubLObjectFactory.makeSymbol("VISIT-DEFSTRUCT-OBJECT-SKS-PROFILE-METHOD");
        $str36$_a = SubLObjectFactory.makeString("~a");
        $sym37$CATCH_ERROR_MESSAGE_HANDLER = SubLObjectFactory.makeSymbol("CATCH-ERROR-MESSAGE-HANDLER");
        $const38$Database_Physical = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Database-Physical"));
        $const39$RDFTripleStore_Physical = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("RDFTripleStore-Physical"));
        $str40$SKS___a__ = SubLObjectFactory.makeString("SKS: ~a~%");
        $str41$SKS_Type___a__ = SubLObjectFactory.makeString("SKS Type: ~a~%");
        $str42$Content_Mt___a__ = SubLObjectFactory.makeString("Content Mt: ~a~%");
        $str43$Mapping_Mt___a__ = SubLObjectFactory.makeString("Mapping Mt: ~a~%");
        $str44$Logical_Schemata___a__ = SubLObjectFactory.makeString("Logical Schemata: ~a~%");
        $str45$Physical_Schemata___a__ = SubLObjectFactory.makeString("Physical Schemata: ~a~%");
        $str46$Required_Fields___a__ = SubLObjectFactory.makeString("Required Fields: ~a~%");
        $sym47$TABLE_ALIASING_CONTEXT = SubLObjectFactory.makeSymbol("TABLE-ALIASING-CONTEXT");
        $sym48$TABLE_ALIASING_CONTEXT_P = SubLObjectFactory.makeSymbol("TABLE-ALIASING-CONTEXT-P");
        $list49 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LITS"), (SubLObject)SubLObjectFactory.makeSymbol("ALIASES"), (SubLObject)SubLObjectFactory.makeSymbol("PRIMARY-KEYS"), (SubLObject)SubLObjectFactory.makeSymbol("PRIMARY-KEY-LITS"), (SubLObject)SubLObjectFactory.makeSymbol("FIXED?"), (SubLObject)SubLObjectFactory.makeSymbol("NAMESPACES"));
        $list50 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("LITS"), (SubLObject)SubLObjectFactory.makeKeyword("ALIASES"), (SubLObject)SubLObjectFactory.makeKeyword("PRIMARY-KEYS"), (SubLObject)SubLObjectFactory.makeKeyword("PRIMARY-KEY-LITS"), (SubLObject)SubLObjectFactory.makeKeyword("FIXED?"), (SubLObject)SubLObjectFactory.makeKeyword("NAMESPACES"));
        $list51 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TAC-LITS"), (SubLObject)SubLObjectFactory.makeSymbol("TAC-ALIASES"), (SubLObject)SubLObjectFactory.makeSymbol("TAC-PRIMARY-KEYS"), (SubLObject)SubLObjectFactory.makeSymbol("TAC-PRIMARY-KEY-LITS"), (SubLObject)SubLObjectFactory.makeSymbol("TAC-FIXED?"), (SubLObject)SubLObjectFactory.makeSymbol("TAC-NAMESPACES"));
        $list52 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("_CSETF-TAC-LITS"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-TAC-ALIASES"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-TAC-PRIMARY-KEYS"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-TAC-PRIMARY-KEY-LITS"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-TAC-FIXED?"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-TAC-NAMESPACES"));
        $sym53$DEFAULT_STRUCT_PRINT_FUNCTION = SubLObjectFactory.makeSymbol("DEFAULT-STRUCT-PRINT-FUNCTION");
        $sym54$TABLE_ALIASING_CONTEXT_PRINT_FUNCTION_TRAMPOLINE = SubLObjectFactory.makeSymbol("TABLE-ALIASING-CONTEXT-PRINT-FUNCTION-TRAMPOLINE");
        $list55 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("TABLE-ALIASING-CONTEXT-P"));
        $sym56$TAC_LITS = SubLObjectFactory.makeSymbol("TAC-LITS");
        $sym57$_CSETF_TAC_LITS = SubLObjectFactory.makeSymbol("_CSETF-TAC-LITS");
        $sym58$TAC_ALIASES = SubLObjectFactory.makeSymbol("TAC-ALIASES");
        $sym59$_CSETF_TAC_ALIASES = SubLObjectFactory.makeSymbol("_CSETF-TAC-ALIASES");
        $sym60$TAC_PRIMARY_KEYS = SubLObjectFactory.makeSymbol("TAC-PRIMARY-KEYS");
        $sym61$_CSETF_TAC_PRIMARY_KEYS = SubLObjectFactory.makeSymbol("_CSETF-TAC-PRIMARY-KEYS");
        $sym62$TAC_PRIMARY_KEY_LITS = SubLObjectFactory.makeSymbol("TAC-PRIMARY-KEY-LITS");
        $sym63$_CSETF_TAC_PRIMARY_KEY_LITS = SubLObjectFactory.makeSymbol("_CSETF-TAC-PRIMARY-KEY-LITS");
        $sym64$TAC_FIXED_ = SubLObjectFactory.makeSymbol("TAC-FIXED?");
        $sym65$_CSETF_TAC_FIXED_ = SubLObjectFactory.makeSymbol("_CSETF-TAC-FIXED?");
        $sym66$TAC_NAMESPACES = SubLObjectFactory.makeSymbol("TAC-NAMESPACES");
        $sym67$_CSETF_TAC_NAMESPACES = SubLObjectFactory.makeSymbol("_CSETF-TAC-NAMESPACES");
        $kw68$LITS = SubLObjectFactory.makeKeyword("LITS");
        $kw69$ALIASES = SubLObjectFactory.makeKeyword("ALIASES");
        $kw70$PRIMARY_KEYS = SubLObjectFactory.makeKeyword("PRIMARY-KEYS");
        $kw71$PRIMARY_KEY_LITS = SubLObjectFactory.makeKeyword("PRIMARY-KEY-LITS");
        $kw72$FIXED_ = SubLObjectFactory.makeKeyword("FIXED?");
        $kw73$NAMESPACES = SubLObjectFactory.makeKeyword("NAMESPACES");
        $sym74$MAKE_TABLE_ALIASING_CONTEXT = SubLObjectFactory.makeSymbol("MAKE-TABLE-ALIASING-CONTEXT");
        $sym75$VISIT_DEFSTRUCT_OBJECT_TABLE_ALIASING_CONTEXT_METHOD = SubLObjectFactory.makeSymbol("VISIT-DEFSTRUCT-OBJECT-TABLE-ALIASING-CONTEXT-METHOD");
        $sym76$STRINGP = SubLObjectFactory.makeSymbol("STRINGP");
        $sym77$INTEGERP = SubLObjectFactory.makeSymbol("INTEGERP");
        $str78$__ = SubLObjectFactory.makeString("~%");
        $str79$_s__ = SubLObjectFactory.makeString("~s~%");
        $str80$_____s__ = SubLObjectFactory.makeString(" -> ~s~%");
        $str81$________s_____s__ = SubLObjectFactory.makeString("    -> ~s -> ~s~%");
    }
    
    public static final class $sks_profile_native extends SubLStructNative
    {
        public SubLObject $sks;
        public SubLObject $type;
        public SubLObject $content_mt;
        public SubLObject $mapping_mt;
        public SubLObject $logical_schemata;
        public SubLObject $physical_schemata;
        public SubLObject $required_fields;
        private static final SubLStructDeclNative structDecl;
        
        public $sks_profile_native() {
            this.$sks = (SubLObject)CommonSymbols.NIL;
            this.$type = (SubLObject)CommonSymbols.NIL;
            this.$content_mt = (SubLObject)CommonSymbols.NIL;
            this.$mapping_mt = (SubLObject)CommonSymbols.NIL;
            this.$logical_schemata = (SubLObject)CommonSymbols.NIL;
            this.$physical_schemata = (SubLObject)CommonSymbols.NIL;
            this.$required_fields = (SubLObject)CommonSymbols.NIL;
        }
        
        @Override
		public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$sks_profile_native.structDecl;
        }
        
        @Override
		public SubLObject getField2() {
            return this.$sks;
        }
        
        @Override
		public SubLObject getField3() {
            return this.$type;
        }
        
        @Override
		public SubLObject getField4() {
            return this.$content_mt;
        }
        
        @Override
		public SubLObject getField5() {
            return this.$mapping_mt;
        }
        
        @Override
		public SubLObject getField6() {
            return this.$logical_schemata;
        }
        
        @Override
		public SubLObject getField7() {
            return this.$physical_schemata;
        }
        
        @Override
		public SubLObject getField8() {
            return this.$required_fields;
        }
        
        @Override
		public SubLObject setField2(final SubLObject value) {
            return this.$sks = value;
        }
        
        @Override
		public SubLObject setField3(final SubLObject value) {
            return this.$type = value;
        }
        
        @Override
		public SubLObject setField4(final SubLObject value) {
            return this.$content_mt = value;
        }
        
        @Override
		public SubLObject setField5(final SubLObject value) {
            return this.$mapping_mt = value;
        }
        
        @Override
		public SubLObject setField6(final SubLObject value) {
            return this.$logical_schemata = value;
        }
        
        @Override
		public SubLObject setField7(final SubLObject value) {
            return this.$physical_schemata = value;
        }
        
        @Override
		public SubLObject setField8(final SubLObject value) {
            return this.$required_fields = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$sks_profile_native.class, sksi_query_datastructures.$sym0$SKS_PROFILE, sksi_query_datastructures.$sym1$SKS_PROFILE_P, sksi_query_datastructures.$list2, sksi_query_datastructures.$list3, new String[] { "$sks", "$type", "$content_mt", "$mapping_mt", "$logical_schemata", "$physical_schemata", "$required_fields" }, sksi_query_datastructures.$list4, sksi_query_datastructures.$list5, sksi_query_datastructures.$sym6$SKS_PROFILE_PRINT);
        }
    }
    
    public static final class $sks_profile_p$UnaryFunction extends UnaryFunction
    {
        public $sks_profile_p$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("SKS-PROFILE-P"));
        }
        
        @Override
		public SubLObject processItem(final SubLObject arg1) {
            return sksi_query_datastructures.sks_profile_p(arg1);
        }
    }
    
    public static final class $table_aliasing_context_native extends SubLStructNative
    {
        public SubLObject $lits;
        public SubLObject $aliases;
        public SubLObject $primary_keys;
        public SubLObject $primary_key_lits;
        public SubLObject $fixedP;
        public SubLObject $namespaces;
        private static final SubLStructDeclNative structDecl;
        
        public $table_aliasing_context_native() {
            this.$lits = (SubLObject)CommonSymbols.NIL;
            this.$aliases = (SubLObject)CommonSymbols.NIL;
            this.$primary_keys = (SubLObject)CommonSymbols.NIL;
            this.$primary_key_lits = (SubLObject)CommonSymbols.NIL;
            this.$fixedP = (SubLObject)CommonSymbols.NIL;
            this.$namespaces = (SubLObject)CommonSymbols.NIL;
        }
        
        @Override
		public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$table_aliasing_context_native.structDecl;
        }
        
        @Override
		public SubLObject getField2() {
            return this.$lits;
        }
        
        @Override
		public SubLObject getField3() {
            return this.$aliases;
        }
        
        @Override
		public SubLObject getField4() {
            return this.$primary_keys;
        }
        
        @Override
		public SubLObject getField5() {
            return this.$primary_key_lits;
        }
        
        @Override
		public SubLObject getField6() {
            return this.$fixedP;
        }
        
        @Override
		public SubLObject getField7() {
            return this.$namespaces;
        }
        
        @Override
		public SubLObject setField2(final SubLObject value) {
            return this.$lits = value;
        }
        
        @Override
		public SubLObject setField3(final SubLObject value) {
            return this.$aliases = value;
        }
        
        @Override
		public SubLObject setField4(final SubLObject value) {
            return this.$primary_keys = value;
        }
        
        @Override
		public SubLObject setField5(final SubLObject value) {
            return this.$primary_key_lits = value;
        }
        
        @Override
		public SubLObject setField6(final SubLObject value) {
            return this.$fixedP = value;
        }
        
        @Override
		public SubLObject setField7(final SubLObject value) {
            return this.$namespaces = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$table_aliasing_context_native.class, sksi_query_datastructures.$sym47$TABLE_ALIASING_CONTEXT, sksi_query_datastructures.$sym48$TABLE_ALIASING_CONTEXT_P, sksi_query_datastructures.$list49, sksi_query_datastructures.$list50, new String[] { "$lits", "$aliases", "$primary_keys", "$primary_key_lits", "$fixedP", "$namespaces" }, sksi_query_datastructures.$list51, sksi_query_datastructures.$list52, sksi_query_datastructures.$sym53$DEFAULT_STRUCT_PRINT_FUNCTION);
        }
    }
    
    public static final class $table_aliasing_context_p$UnaryFunction extends UnaryFunction
    {
        public $table_aliasing_context_p$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("TABLE-ALIASING-CONTEXT-P"));
        }
        
        @Override
		public SubLObject processItem(final SubLObject arg1) {
            return sksi_query_datastructures.table_aliasing_context_p(arg1);
        }
    }
}

/*

	Total time: 306 ms
	 synthetic 
*/