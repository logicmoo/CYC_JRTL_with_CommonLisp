package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.cycjava.cycl.nl.document_disambiguation;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_store;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.stream_macros;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import java.util.Map;
import java.util.Iterator;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.cycjava.cycl.inference.ask_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Filesys;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLFloat;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class rule_disambiguation extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.rule_disambiguation";
    public static final String myFingerPrint = "891c642dbb822fe6626a2e438c6789a014bae17b876bd1204b065b2df69a6775";
    @SubLTranslatedFile.SubL(source = "cycl/rule-disambiguation.lisp", position = 1212L)
    private static SubLSymbol $word_sense_disambiguation_rule_file$;
    @SubLTranslatedFile.SubL(source = "cycl/rule-disambiguation.lisp", position = 1346L)
    private static SubLSymbol $word_sense_disambiguation_count_file$;
    @SubLTranslatedFile.SubL(source = "cycl/rule-disambiguation.lisp", position = 1685L)
    public static SubLSymbol $dtp_rule_disambiguator$;
    private static final SubLString $str0$data_word_sense_disambiguation_ru;
    private static final SubLString $str1$data_word_sense_disambiguation_co;
    private static final SubLList $list2;
    private static final SubLSymbol $sym3$CLET;
    private static final SubLList $list4;
    private static final SubLSymbol $sym5$FINALIZE_RULE_DISAMBIGUATOR;
    private static final SubLSymbol $sym6$RULE_DISAMBIGUATOR;
    private static final SubLSymbol $sym7$RULE_DISAMBIGUATOR_P;
    private static final SubLList $list8;
    private static final SubLList $list9;
    private static final SubLList $list10;
    private static final SubLList $list11;
    private static final SubLSymbol $sym12$RDIS_PRINT;
    private static final SubLSymbol $sym13$RULE_DISAMBIGUATOR_PRINT_FUNCTION_TRAMPOLINE;
    private static final SubLList $list14;
    private static final SubLSymbol $sym15$RDIS_RULE_FILE;
    private static final SubLSymbol $sym16$_CSETF_RDIS_RULE_FILE;
    private static final SubLSymbol $sym17$RDIS_COUNT_FILE;
    private static final SubLSymbol $sym18$_CSETF_RDIS_COUNT_FILE;
    private static final SubLSymbol $sym19$RDIS_RULES;
    private static final SubLSymbol $sym20$_CSETF_RDIS_RULES;
    private static final SubLSymbol $sym21$RDIS_COUNTS;
    private static final SubLSymbol $sym22$_CSETF_RDIS_COUNTS;
    private static final SubLSymbol $kw23$RULE_FILE;
    private static final SubLSymbol $kw24$COUNT_FILE;
    private static final SubLSymbol $kw25$RULES;
    private static final SubLSymbol $kw26$COUNTS;
    private static final SubLString $str27$Invalid_slot__S_for_construction_;
    private static final SubLSymbol $kw28$BEGIN;
    private static final SubLSymbol $sym29$MAKE_RULE_DISAMBIGUATOR;
    private static final SubLSymbol $kw30$SLOT;
    private static final SubLSymbol $kw31$END;
    private static final SubLSymbol $sym32$VISIT_DEFSTRUCT_OBJECT_RULE_DISAMBIGUATOR_METHOD;
    private static final SubLSymbol $sym33$STRINGP;
    private static final SubLString $str34$__RULE_DISAMBIGUATOR_;
    private static final SubLString $str35$_;
    private static final SubLString $str36$_;
    private static final SubLList $list37;
    private static final SubLSymbol $sym38$CYCL;
    private static final SubLSymbol $sym39$GENL_CYCL;
    private static final SubLSymbol $sym40$PROGN;
    private static final SubLSymbol $sym41$CDOLIST;
    private static final SubLSymbol $sym42$WORD_CYCLS;
    private static final SubLSymbol $sym43$CINC_HASH;
    private static final SubLList $list44;
    private static final SubLSymbol $sym45$GET_UPWARDS_CLOSURE;
    private static final SubLSymbol $sym46$DOCUMENT_DISAMBIGUATE_RULE_DISAMBIGUATOR_METHOD;
    private static final SubLSymbol $sym47$DOCUMENT_P;
    private static final SubLSymbol $sym48$HASH_TABLE_P;
    private static final SubLSymbol $kw49$INTERPS;
    private static final SubLObject $const50$VanishinglyRareLexicalMapping;
    private static final SubLObject $const51$ContextuallyDependentLexicalMappi;
    private static final SubLSymbol $kw52$NOT_FOUND;
    private static final SubLString $str53$Can_t_load_rules_from__a;
    private static final SubLString $str54$Can_t_load_counts_from__a;
    private static final SubLInteger $int55$1024;
    private static final SubLList $list56;
    private static final SubLObject $const57$InferencePSC;
    private static final SubLList $list58;
    private static final SubLString $str59$data_word_sense_disambiguation_ru;
    private static final SubLObject $const60$isLicensedBy;
    private static final SubLObject $const61$isDelicensedBy;
    private static final SubLInteger $int62$65536;
    private static final SubLSymbol $kw63$OUTPUT;
    private static final SubLString $str64$Unable_to_open__S;
    private static final SubLString $str65$___;
    private static final SubLString $str66$__S____S___;
    private static final SubLString $str67$___;
    private static final SubLSymbol $kw68$DONE;
    private static final SubLList $list69;
    private static final SubLSymbol $kw70$INFERENCE_MODE;
    private static final SubLSymbol $kw71$SHALLOW;
    private static final SubLSymbol $kw72$ALLOW_INDETERMINATE_RESULTS_;
    private static final SubLSymbol $kw73$DISJUNCTION_FREE_EL_VARS_POLICY;
    private static final SubLSymbol $kw74$COMPUTE_INTERSECTION;
    private static final SubLSymbol $kw75$INTERMEDIATE_STEP_VALIDATION_LEVEL;
    private static final SubLSymbol $kw76$MINIMAL;
    private static final SubLSymbol $kw77$MAX_TIME;
    private static final SubLInteger $int78$57600;
    private static final SubLSymbol $kw79$PROBABLY_APPROXIMATELY_DONE;
    private static final SubLFloat $float80$1_0;
    private static final SubLSymbol $kw81$ANSWER_LANGUAGE;
    private static final SubLSymbol $kw82$EL;
    private static final SubLSymbol $kw83$CONTINUABLE_;
    private static final SubLSymbol $kw84$PROBLEM_STORE;
    private static final SubLString $str85$_tmp_;
    private static final SubLSymbol $sym86$LISTP;
    private static final SubLString $str87$_a_is_invalid;
    private static final SubLString $str88$Can_t_load__a___a;
    private static final SubLSymbol $kw89$INPUT;
    private static final SubLString $str90$cdolist;
    private static final SubLSymbol $kw91$IMAGE_INDEPENDENT_CFASL;
    private static final SubLString $str92$Iterating_over_FHT;
    private static final SubLList $list93;
    private static final SubLString $str94$don_t_know_how_to_convert__A;
    private static final SubLString $str95$_A__A_;
    private static final SubLString $str96$_A_;
    private static final SubLString $str97$__;
    private static final SubLList $list98;
    private static final SubLString $str99$mapping_Cyc_FORTs;
    private static final SubLSymbol $kw100$SKIP;
    private static final SubLString $str101$_host_george_term_id_lists_;
    private static final SubLString $str102$_host_george_disambig_rules_;
    private static final SubLString $str103$_Afort_id__4__0D_cfasl;
    private static final SubLString $str104$_Adisambiguator_rule_file__4__0D_;
    private static final SubLString $str105$created_using_CREATE_RULE_DISAMBI;
    private static final SubLString $str106$arguments______progn__load____hom;
    private static final SubLString $str107$queue____;
    
    @SubLTranslatedFile.SubL(source = "cycl/rule-disambiguation.lisp", position = 1457L)
    public static SubLObject with_new_rule_disambiguator(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)rule_disambiguation.$list2);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject disambiguator = (SubLObject)rule_disambiguation.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)rule_disambiguation.$list2);
        disambiguator = current.first();
        current = current.rest();
        if (rule_disambiguation.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            return (SubLObject)ConsesLow.listS((SubLObject)rule_disambiguation.$sym3$CLET, (SubLObject)ConsesLow.list(reader.bq_cons(disambiguator, (SubLObject)rule_disambiguation.$list4)), ConsesLow.append(body, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)rule_disambiguation.$sym5$FINALIZE_RULE_DISAMBIGUATOR, disambiguator))));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)rule_disambiguation.$list2);
        return (SubLObject)rule_disambiguation.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rule-disambiguation.lisp", position = 1685L)
    public static SubLObject rule_disambiguator_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        rdis_print(v_object, stream, (SubLObject)rule_disambiguation.ZERO_INTEGER);
        return (SubLObject)rule_disambiguation.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rule-disambiguation.lisp", position = 1685L)
    public static SubLObject rule_disambiguator_p(final SubLObject v_object) {
        return (SubLObject)((v_object.getClass() == $rule_disambiguator_native.class) ? rule_disambiguation.T : rule_disambiguation.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rule-disambiguation.lisp", position = 1685L)
    public static SubLObject rdis_rule_file(final SubLObject v_object) {
        assert rule_disambiguation.NIL != rule_disambiguator_p(v_object) : v_object;
        return v_object.getField2();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rule-disambiguation.lisp", position = 1685L)
    public static SubLObject rdis_count_file(final SubLObject v_object) {
        assert rule_disambiguation.NIL != rule_disambiguator_p(v_object) : v_object;
        return v_object.getField3();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rule-disambiguation.lisp", position = 1685L)
    public static SubLObject rdis_rules(final SubLObject v_object) {
        assert rule_disambiguation.NIL != rule_disambiguator_p(v_object) : v_object;
        return v_object.getField4();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rule-disambiguation.lisp", position = 1685L)
    public static SubLObject rdis_counts(final SubLObject v_object) {
        assert rule_disambiguation.NIL != rule_disambiguator_p(v_object) : v_object;
        return v_object.getField5();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rule-disambiguation.lisp", position = 1685L)
    public static SubLObject _csetf_rdis_rule_file(final SubLObject v_object, final SubLObject value) {
        assert rule_disambiguation.NIL != rule_disambiguator_p(v_object) : v_object;
        return v_object.setField2(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rule-disambiguation.lisp", position = 1685L)
    public static SubLObject _csetf_rdis_count_file(final SubLObject v_object, final SubLObject value) {
        assert rule_disambiguation.NIL != rule_disambiguator_p(v_object) : v_object;
        return v_object.setField3(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rule-disambiguation.lisp", position = 1685L)
    public static SubLObject _csetf_rdis_rules(final SubLObject v_object, final SubLObject value) {
        assert rule_disambiguation.NIL != rule_disambiguator_p(v_object) : v_object;
        return v_object.setField4(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rule-disambiguation.lisp", position = 1685L)
    public static SubLObject _csetf_rdis_counts(final SubLObject v_object, final SubLObject value) {
        assert rule_disambiguation.NIL != rule_disambiguator_p(v_object) : v_object;
        return v_object.setField5(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rule-disambiguation.lisp", position = 1685L)
    public static SubLObject make_rule_disambiguator(SubLObject arglist) {
        if (arglist == rule_disambiguation.UNPROVIDED) {
            arglist = (SubLObject)rule_disambiguation.NIL;
        }
        final SubLObject v_new = (SubLObject)new $rule_disambiguator_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = (SubLObject)rule_disambiguation.NIL, next = arglist; rule_disambiguation.NIL != next; next = conses_high.cddr(next)) {
            current_arg = next.first();
            current_value = conses_high.cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql((SubLObject)rule_disambiguation.$kw23$RULE_FILE)) {
                _csetf_rdis_rule_file(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)rule_disambiguation.$kw24$COUNT_FILE)) {
                _csetf_rdis_count_file(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)rule_disambiguation.$kw25$RULES)) {
                _csetf_rdis_rules(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)rule_disambiguation.$kw26$COUNTS)) {
                _csetf_rdis_counts(v_new, current_value);
            }
            else {
                Errors.error((SubLObject)rule_disambiguation.$str27$Invalid_slot__S_for_construction_, current_arg);
            }
        }
        return v_new;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rule-disambiguation.lisp", position = 1685L)
    public static SubLObject visit_defstruct_rule_disambiguator(final SubLObject obj, final SubLObject visitor_fn) {
        Functions.funcall(visitor_fn, obj, (SubLObject)rule_disambiguation.$kw28$BEGIN, (SubLObject)rule_disambiguation.$sym29$MAKE_RULE_DISAMBIGUATOR, (SubLObject)rule_disambiguation.FOUR_INTEGER);
        Functions.funcall(visitor_fn, obj, (SubLObject)rule_disambiguation.$kw30$SLOT, (SubLObject)rule_disambiguation.$kw23$RULE_FILE, rdis_rule_file(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)rule_disambiguation.$kw30$SLOT, (SubLObject)rule_disambiguation.$kw24$COUNT_FILE, rdis_count_file(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)rule_disambiguation.$kw30$SLOT, (SubLObject)rule_disambiguation.$kw25$RULES, rdis_rules(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)rule_disambiguation.$kw30$SLOT, (SubLObject)rule_disambiguation.$kw26$COUNTS, rdis_counts(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)rule_disambiguation.$kw31$END, (SubLObject)rule_disambiguation.$sym29$MAKE_RULE_DISAMBIGUATOR, (SubLObject)rule_disambiguation.FOUR_INTEGER);
        return obj;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rule-disambiguation.lisp", position = 1685L)
    public static SubLObject visit_defstruct_object_rule_disambiguator_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_rule_disambiguator(obj, visitor_fn);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rule-disambiguation.lisp", position = 2076L)
    public static SubLObject new_rule_disambiguator(SubLObject rulepath, SubLObject countpath) {
        if (rulepath == rule_disambiguation.UNPROVIDED) {
            rulepath = rule_disambiguation.$word_sense_disambiguation_rule_file$.getDynamicValue();
        }
        if (countpath == rule_disambiguation.UNPROVIDED) {
            countpath = rule_disambiguation.$word_sense_disambiguation_count_file$.getDynamicValue();
        }
        assert rule_disambiguation.NIL != Types.stringp(rulepath) : rulepath;
        assert rule_disambiguation.NIL != Types.stringp(countpath) : countpath;
        final SubLObject dis = make_rule_disambiguator((SubLObject)rule_disambiguation.UNPROVIDED);
        _csetf_rdis_rule_file(dis, rulepath);
        _csetf_rdis_rules(dis, load_disambiguator_rules(rulepath));
        _csetf_rdis_count_file(dis, countpath);
        _csetf_rdis_counts(dis, load_disambiguator_counts(countpath));
        return dis;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rule-disambiguation.lisp", position = 2666L)
    public static SubLObject finalize_rule_disambiguator(final SubLObject rdis) {
        assert rule_disambiguation.NIL != rule_disambiguator_p(rdis) : rdis;
        file_backed_cache.file_backed_cache_finalize(rdis_rules(rdis));
        file_backed_cache.file_backed_cache_finalize(rdis_counts(rdis));
        return (SubLObject)rule_disambiguation.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rule-disambiguation.lisp", position = 2914L)
    public static SubLObject rdis_print(final SubLObject rdis, final SubLObject stream, final SubLObject depth) {
        streams_high.write_string((SubLObject)rule_disambiguation.$str34$__RULE_DISAMBIGUATOR_, stream, (SubLObject)rule_disambiguation.UNPROVIDED, (SubLObject)rule_disambiguation.UNPROVIDED);
        streams_high.write_string(rdis_rule_file(rdis), stream, (SubLObject)rule_disambiguation.UNPROVIDED, (SubLObject)rule_disambiguation.UNPROVIDED);
        streams_high.write_string((SubLObject)rule_disambiguation.$str35$_, stream, (SubLObject)rule_disambiguation.UNPROVIDED, (SubLObject)rule_disambiguation.UNPROVIDED);
        streams_high.write_string(rdis_count_file(rdis), stream, (SubLObject)rule_disambiguation.UNPROVIDED, (SubLObject)rule_disambiguation.UNPROVIDED);
        streams_high.write_string((SubLObject)rule_disambiguation.$str36$_, stream, (SubLObject)rule_disambiguation.UNPROVIDED, (SubLObject)rule_disambiguation.UNPROVIDED);
        return rdis;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rule-disambiguation.lisp", position = 3234L)
    public static SubLObject with_sense_bag_excepting_word(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)rule_disambiguation.$list37);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject v_bag = (SubLObject)rule_disambiguation.NIL;
        SubLObject word = (SubLObject)rule_disambiguation.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)rule_disambiguation.$list37);
        v_bag = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)rule_disambiguation.$list37);
        word = current.first();
        current = current.rest();
        if (rule_disambiguation.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            final SubLObject cycl = (SubLObject)rule_disambiguation.$sym38$CYCL;
            final SubLObject genl_cycl = (SubLObject)rule_disambiguation.$sym39$GENL_CYCL;
            return (SubLObject)ConsesLow.listS((SubLObject)rule_disambiguation.$sym40$PROGN, (SubLObject)ConsesLow.list((SubLObject)rule_disambiguation.$sym41$CDOLIST, (SubLObject)ConsesLow.list(cycl, (SubLObject)ConsesLow.list((SubLObject)rule_disambiguation.$sym42$WORD_CYCLS, word)), (SubLObject)ConsesLow.listS((SubLObject)rule_disambiguation.$sym43$CINC_HASH, cycl, v_bag, (SubLObject)rule_disambiguation.$list44), (SubLObject)ConsesLow.list((SubLObject)rule_disambiguation.$sym41$CDOLIST, (SubLObject)ConsesLow.list(genl_cycl, (SubLObject)ConsesLow.list((SubLObject)rule_disambiguation.$sym45$GET_UPWARDS_CLOSURE, cycl)), (SubLObject)ConsesLow.listS((SubLObject)rule_disambiguation.$sym43$CINC_HASH, genl_cycl, v_bag, (SubLObject)rule_disambiguation.$list44))), ConsesLow.append(body, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)rule_disambiguation.$sym41$CDOLIST, (SubLObject)ConsesLow.list(cycl, (SubLObject)ConsesLow.list((SubLObject)rule_disambiguation.$sym42$WORD_CYCLS, word)), (SubLObject)ConsesLow.list((SubLObject)rule_disambiguation.$sym43$CINC_HASH, cycl, v_bag), (SubLObject)ConsesLow.list((SubLObject)rule_disambiguation.$sym41$CDOLIST, (SubLObject)ConsesLow.list(genl_cycl, (SubLObject)ConsesLow.list((SubLObject)rule_disambiguation.$sym45$GET_UPWARDS_CLOSURE, cycl)), (SubLObject)ConsesLow.list((SubLObject)rule_disambiguation.$sym43$CINC_HASH, genl_cycl, v_bag))))));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)rule_disambiguation.$list37);
        return (SubLObject)rule_disambiguation.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rule-disambiguation.lisp", position = 3830L)
    public static SubLObject document_disambiguate_rule_disambiguator_method(final SubLObject disambiguator, final SubLObject doc, SubLObject v_context) {
        if (v_context == rule_disambiguation.UNPROVIDED) {
            v_context = new_sense_bag(doc);
        }
        return rdis_disambiguate(disambiguator, doc, v_context);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rule-disambiguation.lisp", position = 4004L)
    public static SubLObject rdis_disambiguate(final SubLObject rdis, final SubLObject doc, SubLObject v_context) {
        if (v_context == rule_disambiguation.UNPROVIDED) {
            v_context = new_sense_bag(doc);
        }
        assert rule_disambiguation.NIL != rule_disambiguator_p(rdis) : rdis;
        assert rule_disambiguation.NIL != document.document_p(doc) : doc;
        assert rule_disambiguation.NIL != Types.hash_table_p(v_context) : v_context;
        final SubLObject vector_var = document.document_paragraphs(doc);
        final SubLObject backwardP_var = (SubLObject)rule_disambiguation.NIL;
        SubLObject length;
        SubLObject v_iteration;
        SubLObject element_num;
        SubLObject paragraph;
        SubLObject vector_var_$1;
        SubLObject backwardP_var_$2;
        SubLObject length_$3;
        SubLObject v_iteration_$4;
        SubLObject element_num_$5;
        SubLObject sentence;
        SubLObject cdolist_list_var;
        SubLObject word;
        SubLObject cdolist_list_var_$6;
        SubLObject cycl;
        SubLObject cdolist_list_var_$7;
        SubLObject genl_cycl;
        SubLObject sense_markers;
        SubLObject new_senses;
        SubLObject cdolist_list_var_$8;
        SubLObject sense_marker;
        SubLObject cdolist_list_var_$9;
        SubLObject cdolist_list_var_$10;
        for (length = Sequences.length(vector_var), v_iteration = (SubLObject)rule_disambiguation.NIL, v_iteration = (SubLObject)rule_disambiguation.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)rule_disambiguation.ONE_INTEGER)) {
            element_num = ((rule_disambiguation.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)rule_disambiguation.ONE_INTEGER) : v_iteration);
            paragraph = Vectors.aref(vector_var, element_num);
            vector_var_$1 = document.paragraph_sentences(paragraph);
            backwardP_var_$2 = (SubLObject)rule_disambiguation.NIL;
            for (length_$3 = Sequences.length(vector_var_$1), v_iteration_$4 = (SubLObject)rule_disambiguation.NIL, v_iteration_$4 = (SubLObject)rule_disambiguation.ZERO_INTEGER; v_iteration_$4.numL(length_$3); v_iteration_$4 = Numbers.add(v_iteration_$4, (SubLObject)rule_disambiguation.ONE_INTEGER)) {
                element_num_$5 = ((rule_disambiguation.NIL != backwardP_var_$2) ? Numbers.subtract(length_$3, v_iteration_$4, (SubLObject)rule_disambiguation.ONE_INTEGER) : v_iteration_$4);
                sentence = Vectors.aref(vector_var_$1, element_num_$5);
                cdolist_list_var = document.sentence_yield_exhaustive(sentence);
                word = (SubLObject)rule_disambiguation.NIL;
                word = cdolist_list_var.first();
                while (rule_disambiguation.NIL != cdolist_list_var) {
                    cdolist_list_var_$6 = document.word_cycls(word);
                    cycl = (SubLObject)rule_disambiguation.NIL;
                    cycl = cdolist_list_var_$6.first();
                    while (rule_disambiguation.NIL != cdolist_list_var_$6) {
                        hash_table_utilities.cinc_hash(cycl, v_context, (SubLObject)rule_disambiguation.MINUS_ONE_INTEGER, (SubLObject)rule_disambiguation.UNPROVIDED);
                        cdolist_list_var_$7 = document_annotation_widgets.get_upwards_closure(cycl);
                        genl_cycl = (SubLObject)rule_disambiguation.NIL;
                        genl_cycl = cdolist_list_var_$7.first();
                        while (rule_disambiguation.NIL != cdolist_list_var_$7) {
                            hash_table_utilities.cinc_hash(genl_cycl, v_context, (SubLObject)rule_disambiguation.MINUS_ONE_INTEGER, (SubLObject)rule_disambiguation.UNPROVIDED);
                            cdolist_list_var_$7 = cdolist_list_var_$7.rest();
                            genl_cycl = cdolist_list_var_$7.first();
                        }
                        cdolist_list_var_$6 = cdolist_list_var_$6.rest();
                        cycl = cdolist_list_var_$6.first();
                    }
                    sense_markers = document.word_interps(word);
                    new_senses = (SubLObject)rule_disambiguation.NIL;
                    cdolist_list_var_$8 = sense_markers;
                    sense_marker = (SubLObject)rule_disambiguation.NIL;
                    sense_marker = cdolist_list_var_$8.first();
                    while (rule_disambiguation.NIL != cdolist_list_var_$8) {
                        if (rule_disambiguation.NIL != is_licensed_p(sense_marker, rdis_rules(rdis), v_context)) {
                            new_senses = (SubLObject)ConsesLow.cons(sense_marker, new_senses);
                        }
                        cdolist_list_var_$8 = cdolist_list_var_$8.rest();
                        sense_marker = cdolist_list_var_$8.first();
                    }
                    if (rule_disambiguation.NIL == new_senses) {
                        new_senses = sense_markers_not_requiring_licensing(rule_void(sense_markers, rdis_rules(rdis)));
                    }
                    conses_high.putf(document.word_info(word), (SubLObject)rule_disambiguation.$kw49$INTERPS, new_senses);
                    cdolist_list_var_$9 = document.word_cycls(word);
                    cycl = (SubLObject)rule_disambiguation.NIL;
                    cycl = cdolist_list_var_$9.first();
                    while (rule_disambiguation.NIL != cdolist_list_var_$9) {
                        hash_table_utilities.cinc_hash(cycl, v_context, (SubLObject)rule_disambiguation.UNPROVIDED, (SubLObject)rule_disambiguation.UNPROVIDED);
                        cdolist_list_var_$10 = document_annotation_widgets.get_upwards_closure(cycl);
                        genl_cycl = (SubLObject)rule_disambiguation.NIL;
                        genl_cycl = cdolist_list_var_$10.first();
                        while (rule_disambiguation.NIL != cdolist_list_var_$10) {
                            hash_table_utilities.cinc_hash(genl_cycl, v_context, (SubLObject)rule_disambiguation.UNPROVIDED, (SubLObject)rule_disambiguation.UNPROVIDED);
                            cdolist_list_var_$10 = cdolist_list_var_$10.rest();
                            genl_cycl = cdolist_list_var_$10.first();
                        }
                        cdolist_list_var_$9 = cdolist_list_var_$9.rest();
                        cycl = cdolist_list_var_$9.first();
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    word = cdolist_list_var.first();
                }
            }
        }
        return doc;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rule-disambiguation.lisp", position = 5337L)
    public static SubLObject sense_markers_not_requiring_licensing(final SubLObject sense_markers) {
        SubLObject valid_markers = (SubLObject)rule_disambiguation.NIL;
        SubLObject cdolist_list_var = sense_markers;
        SubLObject sense_marker = (SubLObject)rule_disambiguation.NIL;
        sense_marker = cdolist_list_var.first();
        while (rule_disambiguation.NIL != cdolist_list_var) {
            if (rule_disambiguation.NIL == list_utilities.tree_find(rule_disambiguation.$const50$VanishinglyRareLexicalMapping, nl_api_datastructures.get_nl_interp_pragmatics(sense_marker), (SubLObject)rule_disambiguation.UNPROVIDED, (SubLObject)rule_disambiguation.UNPROVIDED) && rule_disambiguation.NIL == list_utilities.tree_find(rule_disambiguation.$const51$ContextuallyDependentLexicalMappi, nl_api_datastructures.get_nl_interp_pragmatics(sense_marker), (SubLObject)rule_disambiguation.UNPROVIDED, (SubLObject)rule_disambiguation.UNPROVIDED)) {
                valid_markers = (SubLObject)ConsesLow.cons(sense_marker, valid_markers);
            }
            cdolist_list_var = cdolist_list_var.rest();
            sense_marker = cdolist_list_var.first();
        }
        return valid_markers;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rule-disambiguation.lisp", position = 5764L)
    public static SubLObject rule_void(final SubLObject sense_markers, final SubLObject rules) {
        SubLObject rule_void = (SubLObject)rule_disambiguation.NIL;
        SubLObject cdolist_list_var = sense_markers;
        SubLObject sense_marker = (SubLObject)rule_disambiguation.NIL;
        sense_marker = cdolist_list_var.first();
        while (rule_disambiguation.NIL != cdolist_list_var) {
            if (file_backed_cache.file_backed_cache_lookup(sense_marker, rules, (SubLObject)rule_disambiguation.UNPROVIDED, (SubLObject)rule_disambiguation.UNPROVIDED) == rule_disambiguation.$kw52$NOT_FOUND) {
                rule_void = (SubLObject)ConsesLow.cons(sense_marker, rule_void);
            }
            cdolist_list_var = cdolist_list_var.rest();
            sense_marker = cdolist_list_var.first();
        }
        return rule_void;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rule-disambiguation.lisp", position = 6093L)
    public static SubLObject load_disambiguator_rules(final SubLObject path) {
        if (rule_disambiguation.NIL == Filesys.probe_file(path)) {
            Errors.error((SubLObject)rule_disambiguation.$str53$Can_t_load_rules_from__a, path);
        }
        return file_backed_cache.file_backed_cache_create(path, (SubLObject)rule_disambiguation.UNPROVIDED, (SubLObject)rule_disambiguation.UNPROVIDED, (SubLObject)rule_disambiguation.UNPROVIDED, (SubLObject)rule_disambiguation.UNPROVIDED, (SubLObject)rule_disambiguation.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rule-disambiguation.lisp", position = 6307L)
    public static SubLObject load_disambiguator_counts(final SubLObject path) {
        if (rule_disambiguation.NIL == Filesys.probe_file(path)) {
            Errors.error((SubLObject)rule_disambiguation.$str54$Can_t_load_counts_from__a, path);
        }
        return file_backed_cache.file_backed_cache_create(path, (SubLObject)rule_disambiguation.UNPROVIDED, (SubLObject)rule_disambiguation.UNPROVIDED, (SubLObject)rule_disambiguation.UNPROVIDED, (SubLObject)rule_disambiguation.UNPROVIDED, (SubLObject)rule_disambiguation.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rule-disambiguation.lisp", position = 6519L)
    public static SubLObject highest_count_sense_markers(final SubLObject sense_markers, final SubLObject counts) {
        SubLObject max_count = (SubLObject)rule_disambiguation.ZERO_INTEGER;
        SubLObject highest_count_sense_markers = (SubLObject)rule_disambiguation.NIL;
        SubLObject count = (SubLObject)rule_disambiguation.NIL;
        SubLObject cdolist_list_var = sense_markers;
        SubLObject sense_marker = (SubLObject)rule_disambiguation.NIL;
        sense_marker = cdolist_list_var.first();
        while (rule_disambiguation.NIL != cdolist_list_var) {
            count = file_backed_cache.file_backed_cache_lookup(nl_api_datastructures.get_nl_interp_cycl(sense_marker), counts, (SubLObject)rule_disambiguation.ZERO_INTEGER, (SubLObject)rule_disambiguation.UNPROVIDED);
            if (count.numG(max_count)) {
                max_count = count;
                highest_count_sense_markers = (SubLObject)ConsesLow.list(sense_marker);
            }
            else if (count.numE(max_count)) {
                highest_count_sense_markers = (SubLObject)ConsesLow.cons(sense_marker, highest_count_sense_markers);
            }
            cdolist_list_var = cdolist_list_var.rest();
            sense_marker = cdolist_list_var.first();
        }
        return Sequences.nreverse(highest_count_sense_markers);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rule-disambiguation.lisp", position = 7224L)
    public static SubLObject ambiguous_p(final SubLObject word) {
        return Numbers.numG(Sequences.length(document.word_interps(word)), (SubLObject)rule_disambiguation.ONE_INTEGER);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rule-disambiguation.lisp", position = 7384L)
    public static SubLObject is_licensed_p(final SubLObject sense_marker, final SubLObject rules, final SubLObject v_context) {
        final SubLObject sense = nl_api_datastructures.get_nl_interp_cycl(sense_marker);
        final SubLObject rule = file_backed_cache.file_backed_cache_lookup(sense, rules, (SubLObject)rule_disambiguation.NIL, (SubLObject)rule_disambiguation.UNPROVIDED);
        SubLObject is_licensed = (SubLObject)rule_disambiguation.NIL;
        SubLObject not_licensed = (SubLObject)rule_disambiguation.NIL;
        SubLObject v_term = (SubLObject)rule_disambiguation.NIL;
        if (rule_disambiguation.NIL == is_licensed) {
            SubLObject csome_list_var = rule;
            SubLObject clause = (SubLObject)rule_disambiguation.NIL;
            clause = csome_list_var.first();
            while (rule_disambiguation.NIL == is_licensed && rule_disambiguation.NIL != csome_list_var) {
                if (rule_disambiguation.NIL != positive_clause_p(clause)) {
                    v_term = clause_term(clause);
                    is_licensed = (SubLObject)SubLObjectFactory.makeBoolean(rule_disambiguation.NIL != is_licensed || rule_disambiguation.NIL != sense_bag_licensesP(v_term, v_context));
                }
                csome_list_var = csome_list_var.rest();
                clause = csome_list_var.first();
            }
        }
        if (rule_disambiguation.NIL != is_licensed && rule_disambiguation.NIL == not_licensed) {
            SubLObject csome_list_var = rule;
            SubLObject clause = (SubLObject)rule_disambiguation.NIL;
            clause = csome_list_var.first();
            while (rule_disambiguation.NIL == not_licensed && rule_disambiguation.NIL != csome_list_var) {
                if (rule_disambiguation.NIL != negative_clause_p(clause)) {
                    v_term = clause_term(clause);
                    is_licensed = (SubLObject)SubLObjectFactory.makeBoolean(rule_disambiguation.NIL != is_licensed && rule_disambiguation.NIL == sense_bag_licensesP(v_term, v_context));
                    not_licensed = (SubLObject)SubLObjectFactory.makeBoolean(rule_disambiguation.NIL == is_licensed);
                }
                csome_list_var = csome_list_var.rest();
                clause = csome_list_var.first();
            }
        }
        return is_licensed;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rule-disambiguation.lisp", position = 8422L)
    public static SubLObject positive_clause_p(final SubLObject clause) {
        return clause_sign(clause);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rule-disambiguation.lisp", position = 8542L)
    public static SubLObject negative_clause_p(final SubLObject clause) {
        return (SubLObject)SubLObjectFactory.makeBoolean(rule_disambiguation.NIL == clause_sign(clause));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rule-disambiguation.lisp", position = 8669L)
    public static SubLObject clause_sign(final SubLObject clause) {
        return clause.first();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rule-disambiguation.lisp", position = 8760L)
    public static SubLObject clause_term(final SubLObject clause) {
        return clause.rest();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rule-disambiguation.lisp", position = 8851L)
    public static SubLObject new_sense_bag(final SubLObject doc) {
        assert rule_disambiguation.NIL != document.document_p(doc) : doc;
        final SubLObject senses = Hashtables.make_hash_table((SubLObject)rule_disambiguation.$int55$1024, (SubLObject)rule_disambiguation.EQUAL, (SubLObject)rule_disambiguation.UNPROVIDED);
        SubLObject sense = (SubLObject)rule_disambiguation.NIL;
        final SubLObject vector_var = document.document_paragraphs(doc);
        final SubLObject backwardP_var = (SubLObject)rule_disambiguation.NIL;
        SubLObject length;
        SubLObject v_iteration;
        SubLObject element_num;
        SubLObject paragraph;
        SubLObject vector_var_$11;
        SubLObject backwardP_var_$12;
        SubLObject length_$13;
        SubLObject v_iteration_$14;
        SubLObject element_num_$15;
        SubLObject sentence;
        SubLObject cdolist_list_var;
        SubLObject word;
        SubLObject cdolist_list_var_$16;
        SubLObject sense_marker;
        SubLObject cdolist_list_var_$17;
        SubLObject general;
        for (length = Sequences.length(vector_var), v_iteration = (SubLObject)rule_disambiguation.NIL, v_iteration = (SubLObject)rule_disambiguation.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)rule_disambiguation.ONE_INTEGER)) {
            element_num = ((rule_disambiguation.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)rule_disambiguation.ONE_INTEGER) : v_iteration);
            paragraph = Vectors.aref(vector_var, element_num);
            vector_var_$11 = document.paragraph_sentences(paragraph);
            backwardP_var_$12 = (SubLObject)rule_disambiguation.NIL;
            for (length_$13 = Sequences.length(vector_var_$11), v_iteration_$14 = (SubLObject)rule_disambiguation.NIL, v_iteration_$14 = (SubLObject)rule_disambiguation.ZERO_INTEGER; v_iteration_$14.numL(length_$13); v_iteration_$14 = Numbers.add(v_iteration_$14, (SubLObject)rule_disambiguation.ONE_INTEGER)) {
                element_num_$15 = ((rule_disambiguation.NIL != backwardP_var_$12) ? Numbers.subtract(length_$13, v_iteration_$14, (SubLObject)rule_disambiguation.ONE_INTEGER) : v_iteration_$14);
                sentence = Vectors.aref(vector_var_$11, element_num_$15);
                cdolist_list_var = document.sentence_yield_exhaustive(sentence);
                word = (SubLObject)rule_disambiguation.NIL;
                word = cdolist_list_var.first();
                while (rule_disambiguation.NIL != cdolist_list_var) {
                    cdolist_list_var_$16 = document.word_interps(word);
                    sense_marker = (SubLObject)rule_disambiguation.NIL;
                    sense_marker = cdolist_list_var_$16.first();
                    while (rule_disambiguation.NIL != cdolist_list_var_$16) {
                        sense = nl_api_datastructures.get_nl_interp_cycl(sense_marker);
                        hash_table_utilities.cinc_hash(sense, senses, (SubLObject)rule_disambiguation.UNPROVIDED, (SubLObject)rule_disambiguation.UNPROVIDED);
                        cdolist_list_var_$17 = document_annotation_widgets.get_upwards_closure(sense);
                        general = (SubLObject)rule_disambiguation.NIL;
                        general = cdolist_list_var_$17.first();
                        while (rule_disambiguation.NIL != cdolist_list_var_$17) {
                            hash_table_utilities.cinc_hash(general, senses, (SubLObject)rule_disambiguation.UNPROVIDED, (SubLObject)rule_disambiguation.UNPROVIDED);
                            cdolist_list_var_$17 = cdolist_list_var_$17.rest();
                            general = cdolist_list_var_$17.first();
                        }
                        cdolist_list_var_$16 = cdolist_list_var_$16.rest();
                        sense_marker = cdolist_list_var_$16.first();
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    word = cdolist_list_var.first();
                }
            }
        }
        return senses;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rule-disambiguation.lisp", position = 9387L)
    public static SubLObject sense_bag_licensesP(final SubLObject v_term, final SubLObject v_bag) {
        return subl_promotions.positive_integer_p(Hashtables.gethash_without_values(v_term, v_bag, (SubLObject)rule_disambiguation.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rule-disambiguation.lisp", position = 9550L)
    public static SubLObject disambiguation_rule_query(final SubLObject pred) {
        return ask_utilities.query_template((SubLObject)rule_disambiguation.$list56, reader.bq_cons(pred, (SubLObject)rule_disambiguation.$list56), rule_disambiguation.$const57$InferencePSC, (SubLObject)rule_disambiguation.$list58);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rule-disambiguation.lisp", position = 9968L)
    public static SubLObject create_disambiguator_rules_file(SubLObject f_out) {
        if (f_out == rule_disambiguation.UNPROVIDED) {
            f_out = (SubLObject)rule_disambiguation.$str59$data_word_sense_disambiguation_ru;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject licensing_term_pairs = disambiguation_rule_query(rule_disambiguation.$const60$isLicensedBy);
        final SubLObject delicensing_term_pairs = disambiguation_rule_query(rule_disambiguation.$const61$isDelicensedBy);
        final SubLObject rule_hash_table = Hashtables.make_hash_table((SubLObject)rule_disambiguation.$int62$65536, (SubLObject)rule_disambiguation.EQUAL, (SubLObject)rule_disambiguation.UNPROVIDED);
        SubLObject cdolist_list_var = licensing_term_pairs;
        SubLObject licensing_term_pair = (SubLObject)rule_disambiguation.NIL;
        licensing_term_pair = cdolist_list_var.first();
        while (rule_disambiguation.NIL != cdolist_list_var) {
            hash_table_utilities.push_hash(licensing_term_pair.first(), (SubLObject)ConsesLow.cons((SubLObject)rule_disambiguation.T, conses_high.second(licensing_term_pair)), rule_hash_table);
            cdolist_list_var = cdolist_list_var.rest();
            licensing_term_pair = cdolist_list_var.first();
        }
        cdolist_list_var = delicensing_term_pairs;
        SubLObject delicensing_term_pair = (SubLObject)rule_disambiguation.NIL;
        delicensing_term_pair = cdolist_list_var.first();
        while (rule_disambiguation.NIL != cdolist_list_var) {
            hash_table_utilities.push_hash(delicensing_term_pair.first(), (SubLObject)ConsesLow.cons((SubLObject)rule_disambiguation.NIL, conses_high.second(delicensing_term_pair)), rule_hash_table);
            cdolist_list_var = cdolist_list_var.rest();
            delicensing_term_pair = cdolist_list_var.first();
        }
        SubLObject stream = (SubLObject)rule_disambiguation.NIL;
        try {
            stream = compatibility.open_text(f_out, (SubLObject)rule_disambiguation.$kw63$OUTPUT);
            if (!stream.isStream()) {
                Errors.error((SubLObject)rule_disambiguation.$str64$Unable_to_open__S, f_out);
            }
            final SubLObject s_out = stream;
            final SubLObject _prev_bind_0 = print_high.$print_pretty$.currentBinding(thread);
            try {
                print_high.$print_pretty$.bind((SubLObject)rule_disambiguation.NIL, thread);
                PrintLow.format(s_out, (SubLObject)rule_disambiguation.$str65$___);
                SubLObject key = (SubLObject)rule_disambiguation.NIL;
                SubLObject value = (SubLObject)rule_disambiguation.NIL;
                final Iterator cdohash_iterator = Hashtables.getEntrySetIterator(rule_hash_table);
                try {
                    while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                        final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                        key = Hashtables.getEntryKey(cdohash_entry);
                        value = Hashtables.getEntryValue(cdohash_entry);
                        PrintLow.format(s_out, (SubLObject)rule_disambiguation.$str66$__S____S___, key, value);
                    }
                }
                finally {
                    Hashtables.releaseEntrySetIterator(cdohash_iterator);
                }
                PrintLow.format(s_out, (SubLObject)rule_disambiguation.$str67$___);
            }
            finally {
                print_high.$print_pretty$.rebind(_prev_bind_0, thread);
            }
        }
        finally {
            final SubLObject _prev_bind_2 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)rule_disambiguation.T, thread);
                final SubLObject _values = Values.getValuesAsVector();
                if (stream.isStream()) {
                    streams_high.close(stream, (SubLObject)rule_disambiguation.UNPROVIDED);
                }
                Values.restoreValuesFromVector(_values);
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
            }
        }
        return (SubLObject)rule_disambiguation.$kw68$DONE;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rule-disambiguation.lisp", position = 10880L)
    public static SubLObject fort_disambiguation_rule_query(final SubLObject fort, final SubLObject pred, final SubLObject pstore) {
        return ask_utilities.query_template(reader.bq_cons(fort, (SubLObject)rule_disambiguation.$list69), (SubLObject)ConsesLow.listS(pred, fort, (SubLObject)rule_disambiguation.$list69), rule_disambiguation.$const57$InferencePSC, (SubLObject)ConsesLow.list(new SubLObject[] { rule_disambiguation.$kw70$INFERENCE_MODE, rule_disambiguation.$kw71$SHALLOW, rule_disambiguation.$kw72$ALLOW_INDETERMINATE_RESULTS_, rule_disambiguation.NIL, rule_disambiguation.$kw73$DISJUNCTION_FREE_EL_VARS_POLICY, rule_disambiguation.$kw74$COMPUTE_INTERSECTION, rule_disambiguation.$kw75$INTERMEDIATE_STEP_VALIDATION_LEVEL, rule_disambiguation.$kw76$MINIMAL, rule_disambiguation.$kw77$MAX_TIME, rule_disambiguation.$int78$57600, rule_disambiguation.$kw79$PROBABLY_APPROXIMATELY_DONE, rule_disambiguation.$float80$1_0, rule_disambiguation.$kw81$ANSWER_LANGUAGE, rule_disambiguation.$kw82$EL, rule_disambiguation.$kw83$CONTINUABLE_, rule_disambiguation.NIL, rule_disambiguation.$kw84$PROBLEM_STORE, pstore }));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rule-disambiguation.lisp", position = 11335L)
    public static SubLObject term_alist_to_file_hash_table(final SubLObject alist, final SubLObject path, SubLObject testfn, SubLObject serialization, SubLObject tempstem) {
        if (testfn == rule_disambiguation.UNPROVIDED) {
            testfn = file_hash_table.$default_fht_test_function$.getGlobalValue();
        }
        if (serialization == rule_disambiguation.UNPROVIDED) {
            serialization = file_hash_table.$default_fht_serialization_protocol$.getGlobalValue();
        }
        if (tempstem == rule_disambiguation.UNPROVIDED) {
            tempstem = (SubLObject)rule_disambiguation.$str85$_tmp_;
        }
        assert rule_disambiguation.NIL != Types.listp(alist) : alist;
        assert rule_disambiguation.NIL != Types.stringp(path) : path;
        final SubLObject fht = file_hash_table.fast_create_file_hash_table(path, tempstem, testfn, serialization);
        SubLObject cdolist_list_var = Sequences.reverse(alist);
        SubLObject keyXvalue = (SubLObject)rule_disambiguation.NIL;
        keyXvalue = cdolist_list_var.first();
        while (rule_disambiguation.NIL != cdolist_list_var) {
            final SubLObject key = keyXvalue.first();
            if (rule_disambiguation.NIL != constant_handles.invalid_constantP(key, (SubLObject)rule_disambiguation.UNPROVIDED) || rule_disambiguation.NIL != narts_high.invalid_nartP(key, (SubLObject)rule_disambiguation.UNPROVIDED)) {
                Errors.warn((SubLObject)rule_disambiguation.$str87$_a_is_invalid, key);
            }
            else {
                file_hash_table.fast_put_file_hash_table(keyXvalue.first(), fht, keyXvalue.rest());
            }
            cdolist_list_var = cdolist_list_var.rest();
            keyXvalue = cdolist_list_var.first();
        }
        file_hash_table.finalize_fast_create_file_hash_table(fht, (SubLObject)rule_disambiguation.UNPROVIDED, (SubLObject)rule_disambiguation.UNPROVIDED);
        return path;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rule-disambiguation.lisp", position = 12115L)
    public static SubLObject alist_file_to_fht(final SubLObject infile, final SubLObject outfht) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert rule_disambiguation.NIL != Types.stringp(infile) : infile;
        assert rule_disambiguation.NIL != Types.stringp(outfht) : outfht;
        if (rule_disambiguation.NIL == Filesys.probe_file(infile)) {
            Errors.error((SubLObject)rule_disambiguation.$str88$Can_t_load__a___a, infile, file_utilities.why_not_probe_fileP(infile));
        }
        SubLObject alist = (SubLObject)rule_disambiguation.NIL;
        final SubLObject hash = Hashtables.make_hash_table((SubLObject)rule_disambiguation.$int55$1024, (SubLObject)rule_disambiguation.EQUAL, (SubLObject)rule_disambiguation.UNPROVIDED);
        SubLObject stream = (SubLObject)rule_disambiguation.NIL;
        try {
            stream = compatibility.open_text(infile, (SubLObject)rule_disambiguation.$kw89$INPUT);
            if (!stream.isStream()) {
                Errors.error((SubLObject)rule_disambiguation.$str64$Unable_to_open__S, infile);
            }
            final SubLObject in = stream;
            alist = reader.read(in, (SubLObject)rule_disambiguation.T, (SubLObject)rule_disambiguation.NIL, (SubLObject)rule_disambiguation.UNPROVIDED);
        }
        finally {
            final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)rule_disambiguation.T, thread);
                final SubLObject _values = Values.getValuesAsVector();
                if (stream.isStream()) {
                    streams_high.close(stream, (SubLObject)rule_disambiguation.UNPROVIDED);
                }
                Values.restoreValuesFromVector(_values);
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
            }
        }
        final SubLObject list_var = alist;
        final SubLObject _prev_bind_2 = utilities_macros.$progress_note$.currentBinding(thread);
        final SubLObject _prev_bind_3 = utilities_macros.$progress_start_time$.currentBinding(thread);
        final SubLObject _prev_bind_4 = utilities_macros.$progress_total$.currentBinding(thread);
        final SubLObject _prev_bind_5 = utilities_macros.$progress_sofar$.currentBinding(thread);
        final SubLObject _prev_bind_6 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
        final SubLObject _prev_bind_7 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
        final SubLObject _prev_bind_8 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
        final SubLObject _prev_bind_9 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
        try {
            utilities_macros.$progress_note$.bind((SubLObject)rule_disambiguation.$str90$cdolist, thread);
            utilities_macros.$progress_start_time$.bind(Time.get_universal_time(), thread);
            utilities_macros.$progress_total$.bind(Sequences.length(list_var), thread);
            utilities_macros.$progress_sofar$.bind((SubLObject)rule_disambiguation.ZERO_INTEGER, thread);
            utilities_macros.$last_percent_progress_index$.bind((SubLObject)rule_disambiguation.ZERO_INTEGER, thread);
            utilities_macros.$last_percent_progress_prediction$.bind((SubLObject)rule_disambiguation.NIL, thread);
            utilities_macros.$within_noting_percent_progress$.bind((SubLObject)rule_disambiguation.T, thread);
            utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
            try {
                utilities_macros.noting_percent_progress_preamble(utilities_macros.$progress_note$.getDynamicValue(thread));
                SubLObject csome_list_var = list_var;
                SubLObject keyXvalue = (SubLObject)rule_disambiguation.NIL;
                keyXvalue = csome_list_var.first();
                while (rule_disambiguation.NIL != csome_list_var) {
                    final SubLObject key = keyXvalue.first();
                    if (rule_disambiguation.NIL != constant_handles.invalid_constantP(key, (SubLObject)rule_disambiguation.UNPROVIDED) || rule_disambiguation.NIL != narts_high.invalid_nartP(key, (SubLObject)rule_disambiguation.UNPROVIDED)) {
                        Errors.warn((SubLObject)rule_disambiguation.$str87$_a_is_invalid, key);
                    }
                    else {
                        Hashtables.sethash(keyXvalue.first(), hash, keyXvalue.rest());
                    }
                    utilities_macros.$progress_sofar$.setDynamicValue(Numbers.add(utilities_macros.$progress_sofar$.getDynamicValue(thread), (SubLObject)rule_disambiguation.ONE_INTEGER), thread);
                    utilities_macros.note_percent_progress(utilities_macros.$progress_sofar$.getDynamicValue(thread), utilities_macros.$progress_total$.getDynamicValue(thread));
                    csome_list_var = csome_list_var.rest();
                    keyXvalue = csome_list_var.first();
                }
            }
            finally {
                final SubLObject _prev_bind_0_$18 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)rule_disambiguation.T, thread);
                    final SubLObject _values2 = Values.getValuesAsVector();
                    utilities_macros.noting_percent_progress_postamble();
                    Values.restoreValuesFromVector(_values2);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$18, thread);
                }
            }
        }
        finally {
            utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_9, thread);
            utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_8, thread);
            utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_7, thread);
            utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_6, thread);
            utilities_macros.$progress_sofar$.rebind(_prev_bind_5, thread);
            utilities_macros.$progress_total$.rebind(_prev_bind_4, thread);
            utilities_macros.$progress_start_time$.rebind(_prev_bind_3, thread);
            utilities_macros.$progress_note$.rebind(_prev_bind_2, thread);
        }
        return file_hash_table.hash_table_to_file_hash_table(hash, outfht, (SubLObject)rule_disambiguation.$str85$_tmp_, (SubLObject)rule_disambiguation.EQUAL, (SubLObject)rule_disambiguation.$kw91$IMAGE_INDEPENDENT_CFASL, (SubLObject)rule_disambiguation.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rule-disambiguation.lisp", position = 12774L)
    public static SubLObject disambiguator_rule_fht_to_hl_id_text_file(final SubLObject infht, final SubLObject outfile) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (rule_disambiguation.NIL == Filesys.probe_file(infht)) {
            Errors.error((SubLObject)rule_disambiguation.$str88$Can_t_load__a___a, infht, file_utilities.why_not_probe_fileP(infht));
        }
        final SubLObject fht = file_hash_table.open_file_hash_table_read_only(infht, (SubLObject)rule_disambiguation.UNPROVIDED, (SubLObject)rule_disambiguation.UNPROVIDED);
        final SubLObject doneP = (SubLObject)rule_disambiguation.NIL;
        SubLObject stream = (SubLObject)rule_disambiguation.NIL;
        try {
            final SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding(thread);
            try {
                stream_macros.$stream_requires_locking$.bind((SubLObject)rule_disambiguation.NIL, thread);
                stream = compatibility.open_text(outfile, (SubLObject)rule_disambiguation.$kw63$OUTPUT);
            }
            finally {
                stream_macros.$stream_requires_locking$.rebind(_prev_bind_0, thread);
            }
            if (!stream.isStream()) {
                Errors.error((SubLObject)rule_disambiguation.$str64$Unable_to_open__S, outfile);
            }
            final SubLObject out = stream;
            final SubLObject table_var = fht;
            utilities_macros.$progress_note$.setDynamicValue((SubLObject)rule_disambiguation.$str92$Iterating_over_FHT, thread);
            utilities_macros.$progress_start_time$.setDynamicValue(Time.get_universal_time(), thread);
            utilities_macros.$progress_total$.setDynamicValue(file_hash_table.file_hash_table_count(table_var), thread);
            utilities_macros.$progress_sofar$.setDynamicValue((SubLObject)rule_disambiguation.ZERO_INTEGER, thread);
            final SubLObject _prev_bind_2 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
            final SubLObject _prev_bind_3 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
            final SubLObject _prev_bind_4 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
            final SubLObject _prev_bind_5 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
            try {
                utilities_macros.$last_percent_progress_index$.bind((SubLObject)rule_disambiguation.ZERO_INTEGER, thread);
                utilities_macros.$last_percent_progress_prediction$.bind((SubLObject)rule_disambiguation.NIL, thread);
                utilities_macros.$within_noting_percent_progress$.bind((SubLObject)rule_disambiguation.T, thread);
                utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
                try {
                    utilities_macros.noting_percent_progress_preamble(utilities_macros.$progress_note$.getDynamicValue(thread));
                    SubLObject continuation = (SubLObject)rule_disambiguation.NIL;
                    SubLObject next;
                    for (SubLObject completeP = (SubLObject)rule_disambiguation.NIL; rule_disambiguation.NIL == doneP && rule_disambiguation.NIL == completeP; completeP = Types.sublisp_null(next)) {
                        thread.resetMultipleValues();
                        final SubLObject the_key = file_hash_table.get_file_hash_table_any(table_var, continuation, (SubLObject)rule_disambiguation.NIL);
                        final SubLObject the_value = thread.secondMultipleValue();
                        next = thread.thirdMultipleValue();
                        thread.resetMultipleValues();
                        if (rule_disambiguation.NIL != next) {
                            final SubLObject key = the_key;
                            final SubLObject licensers = the_value;
                            utilities_macros.note_percent_progress(utilities_macros.$progress_sofar$.getDynamicValue(thread), utilities_macros.$progress_total$.getDynamicValue(thread));
                            utilities_macros.$progress_sofar$.setDynamicValue(Numbers.add(utilities_macros.$progress_sofar$.getDynamicValue(thread), (SubLObject)rule_disambiguation.ONE_INTEGER), thread);
                            SubLObject licensing_terms = (SubLObject)rule_disambiguation.NIL;
                            SubLObject cdolist_list_var = licensers;
                            SubLObject licenser = (SubLObject)rule_disambiguation.NIL;
                            licenser = cdolist_list_var.first();
                            while (rule_disambiguation.NIL != cdolist_list_var) {
                                SubLObject current;
                                final SubLObject datum = current = licenser;
                                SubLObject licensedP = (SubLObject)rule_disambiguation.NIL;
                                SubLObject v_term = (SubLObject)rule_disambiguation.NIL;
                                cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)rule_disambiguation.$list93);
                                licensedP = current.first();
                                current = (v_term = current.rest());
                                if (licensedP == rule_disambiguation.T) {
                                    licensing_terms = (SubLObject)ConsesLow.cons(v_term, licensing_terms);
                                }
                                else {
                                    Errors.warn((SubLObject)rule_disambiguation.$str94$don_t_know_how_to_convert__A, licensedP);
                                }
                                cdolist_list_var = cdolist_list_var.rest();
                                licenser = cdolist_list_var.first();
                            }
                            PrintLow.format(out, (SubLObject)rule_disambiguation.$str95$_A__A_, kb_utilities.compact_hl_external_id_string(key), (SubLObject)rule_disambiguation.T);
                            cdolist_list_var = licensing_terms;
                            SubLObject v_term2 = (SubLObject)rule_disambiguation.NIL;
                            v_term2 = cdolist_list_var.first();
                            while (rule_disambiguation.NIL != cdolist_list_var) {
                                PrintLow.format(out, (SubLObject)rule_disambiguation.$str96$_A_, kb_utilities.compact_hl_external_id_string(v_term2));
                                cdolist_list_var = cdolist_list_var.rest();
                                v_term2 = cdolist_list_var.first();
                            }
                            PrintLow.format(out, (SubLObject)rule_disambiguation.$str97$__);
                        }
                        continuation = next;
                    }
                }
                finally {
                    final SubLObject _prev_bind_0_$19 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)rule_disambiguation.T, thread);
                        final SubLObject _values = Values.getValuesAsVector();
                        utilities_macros.noting_percent_progress_postamble();
                        Values.restoreValuesFromVector(_values);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$19, thread);
                    }
                }
            }
            finally {
                utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_5, thread);
                utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_4, thread);
                utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_3, thread);
                utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_2, thread);
            }
        }
        finally {
            final SubLObject _prev_bind_6 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)rule_disambiguation.T, thread);
                final SubLObject _values2 = Values.getValuesAsVector();
                if (stream.isStream()) {
                    streams_high.close(stream, (SubLObject)rule_disambiguation.UNPROVIDED);
                }
                Values.restoreValuesFromVector(_values2);
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_6, thread);
            }
        }
        return outfile;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rule-disambiguation.lisp", position = 13597L)
    public static SubLObject create_disambiguator_rules_file_from_forts(final SubLObject f_out) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert rule_disambiguation.NIL != Types.stringp(f_out) : f_out;
        final SubLObject rule_hash_table = Hashtables.make_hash_table((SubLObject)rule_disambiguation.$int62$65536, (SubLObject)rule_disambiguation.EQUAL, (SubLObject)rule_disambiguation.UNPROVIDED);
        SubLObject store = (SubLObject)rule_disambiguation.NIL;
        try {
            store = inference_datastructures_problem_store.new_problem_store((SubLObject)rule_disambiguation.$list98);
            final SubLObject message = (SubLObject)rule_disambiguation.$str99$mapping_Cyc_FORTs;
            final SubLObject total = forts.fort_count();
            SubLObject sofar = (SubLObject)rule_disambiguation.ZERO_INTEGER;
            final SubLObject _prev_bind_0 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
            final SubLObject _prev_bind_2 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
            final SubLObject _prev_bind_3 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
            final SubLObject _prev_bind_4 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
            try {
                utilities_macros.$last_percent_progress_index$.bind((SubLObject)rule_disambiguation.ZERO_INTEGER, thread);
                utilities_macros.$last_percent_progress_prediction$.bind((SubLObject)rule_disambiguation.NIL, thread);
                utilities_macros.$within_noting_percent_progress$.bind((SubLObject)rule_disambiguation.T, thread);
                utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
                try {
                    utilities_macros.noting_percent_progress_preamble(message);
                    SubLObject cdolist_list_var = forts.do_forts_tables();
                    SubLObject table_var = (SubLObject)rule_disambiguation.NIL;
                    table_var = cdolist_list_var.first();
                    while (rule_disambiguation.NIL != cdolist_list_var) {
                        final SubLObject idx = table_var;
                        if (rule_disambiguation.NIL == id_index.id_index_objects_empty_p(idx, (SubLObject)rule_disambiguation.$kw100$SKIP)) {
                            final SubLObject idx_$20 = idx;
                            if (rule_disambiguation.NIL == id_index.id_index_dense_objects_empty_p(idx_$20, (SubLObject)rule_disambiguation.$kw100$SKIP)) {
                                final SubLObject vector_var = id_index.id_index_dense_objects(idx_$20);
                                final SubLObject backwardP_var = (SubLObject)rule_disambiguation.NIL;
                                SubLObject length;
                                SubLObject v_iteration;
                                SubLObject id;
                                SubLObject fort;
                                SubLObject cdolist_list_var_$21;
                                SubLObject pair;
                                SubLObject cdolist_list_var_$22;
                                for (length = Sequences.length(vector_var), v_iteration = (SubLObject)rule_disambiguation.NIL, v_iteration = (SubLObject)rule_disambiguation.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)rule_disambiguation.ONE_INTEGER)) {
                                    id = ((rule_disambiguation.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)rule_disambiguation.ONE_INTEGER) : v_iteration);
                                    fort = Vectors.aref(vector_var, id);
                                    if (rule_disambiguation.NIL == id_index.id_index_tombstone_p(fort) || rule_disambiguation.NIL == id_index.id_index_skip_tombstones_p((SubLObject)rule_disambiguation.$kw100$SKIP)) {
                                        if (rule_disambiguation.NIL != id_index.id_index_tombstone_p(fort)) {
                                            fort = (SubLObject)rule_disambiguation.$kw100$SKIP;
                                        }
                                        sofar = Numbers.add(sofar, (SubLObject)rule_disambiguation.ONE_INTEGER);
                                        utilities_macros.note_percent_progress(sofar, total);
                                        cdolist_list_var_$21 = fort_disambiguation_rule_query(fort, rule_disambiguation.$const60$isLicensedBy, store);
                                        pair = (SubLObject)rule_disambiguation.NIL;
                                        pair = cdolist_list_var_$21.first();
                                        while (rule_disambiguation.NIL != cdolist_list_var_$21) {
                                            hash_table_utilities.push_hash(pair.first(), (SubLObject)ConsesLow.cons((SubLObject)rule_disambiguation.T, conses_high.second(pair)), rule_hash_table);
                                            cdolist_list_var_$21 = cdolist_list_var_$21.rest();
                                            pair = cdolist_list_var_$21.first();
                                        }
                                        cdolist_list_var_$22 = fort_disambiguation_rule_query(fort, rule_disambiguation.$const61$isDelicensedBy, store);
                                        pair = (SubLObject)rule_disambiguation.NIL;
                                        pair = cdolist_list_var_$22.first();
                                        while (rule_disambiguation.NIL != cdolist_list_var_$22) {
                                            hash_table_utilities.push_hash(pair.first(), (SubLObject)ConsesLow.cons((SubLObject)rule_disambiguation.NIL, conses_high.second(pair)), rule_hash_table);
                                            cdolist_list_var_$22 = cdolist_list_var_$22.rest();
                                            pair = cdolist_list_var_$22.first();
                                        }
                                    }
                                }
                            }
                            final SubLObject idx_$21 = idx;
                            if (rule_disambiguation.NIL == id_index.id_index_sparse_objects_empty_p(idx_$21) || rule_disambiguation.NIL == id_index.id_index_skip_tombstones_p((SubLObject)rule_disambiguation.$kw100$SKIP)) {
                                final SubLObject sparse = id_index.id_index_sparse_objects(idx_$21);
                                SubLObject id2 = id_index.id_index_sparse_id_threshold(idx_$21);
                                final SubLObject end_id = id_index.id_index_next_id(idx_$21);
                                final SubLObject v_default = (SubLObject)((rule_disambiguation.NIL != id_index.id_index_skip_tombstones_p((SubLObject)rule_disambiguation.$kw100$SKIP)) ? rule_disambiguation.NIL : rule_disambiguation.$kw100$SKIP);
                                while (id2.numL(end_id)) {
                                    final SubLObject fort2 = Hashtables.gethash_without_values(id2, sparse, v_default);
                                    if (rule_disambiguation.NIL == id_index.id_index_skip_tombstones_p((SubLObject)rule_disambiguation.$kw100$SKIP) || rule_disambiguation.NIL == id_index.id_index_tombstone_p(fort2)) {
                                        sofar = Numbers.add(sofar, (SubLObject)rule_disambiguation.ONE_INTEGER);
                                        utilities_macros.note_percent_progress(sofar, total);
                                        SubLObject cdolist_list_var_$23 = fort_disambiguation_rule_query(fort2, rule_disambiguation.$const60$isLicensedBy, store);
                                        SubLObject pair2 = (SubLObject)rule_disambiguation.NIL;
                                        pair2 = cdolist_list_var_$23.first();
                                        while (rule_disambiguation.NIL != cdolist_list_var_$23) {
                                            hash_table_utilities.push_hash(pair2.first(), (SubLObject)ConsesLow.cons((SubLObject)rule_disambiguation.T, conses_high.second(pair2)), rule_hash_table);
                                            cdolist_list_var_$23 = cdolist_list_var_$23.rest();
                                            pair2 = cdolist_list_var_$23.first();
                                        }
                                        SubLObject cdolist_list_var_$24 = fort_disambiguation_rule_query(fort2, rule_disambiguation.$const61$isDelicensedBy, store);
                                        pair2 = (SubLObject)rule_disambiguation.NIL;
                                        pair2 = cdolist_list_var_$24.first();
                                        while (rule_disambiguation.NIL != cdolist_list_var_$24) {
                                            hash_table_utilities.push_hash(pair2.first(), (SubLObject)ConsesLow.cons((SubLObject)rule_disambiguation.NIL, conses_high.second(pair2)), rule_hash_table);
                                            cdolist_list_var_$24 = cdolist_list_var_$24.rest();
                                            pair2 = cdolist_list_var_$24.first();
                                        }
                                    }
                                    id2 = Numbers.add(id2, (SubLObject)rule_disambiguation.ONE_INTEGER);
                                }
                            }
                        }
                        cdolist_list_var = cdolist_list_var.rest();
                        table_var = cdolist_list_var.first();
                    }
                }
                finally {
                    final SubLObject _prev_bind_0_$26 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)rule_disambiguation.T, thread);
                        final SubLObject _values = Values.getValuesAsVector();
                        utilities_macros.noting_percent_progress_postamble();
                        Values.restoreValuesFromVector(_values);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$26, thread);
                    }
                }
            }
            finally {
                utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_4, thread);
                utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_3, thread);
                utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_2, thread);
                utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_0, thread);
            }
        }
        finally {
            final SubLObject _prev_bind_5 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)rule_disambiguation.T, thread);
                final SubLObject _values2 = Values.getValuesAsVector();
                inference_datastructures_problem_store.destroy_problem_store(store);
                Values.restoreValuesFromVector(_values2);
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_5, thread);
            }
        }
        SubLObject stream = (SubLObject)rule_disambiguation.NIL;
        try {
            stream = compatibility.open_text(f_out, (SubLObject)rule_disambiguation.$kw63$OUTPUT);
            if (!stream.isStream()) {
                Errors.error((SubLObject)rule_disambiguation.$str64$Unable_to_open__S, f_out);
            }
            final SubLObject s_out = stream;
            final SubLObject _prev_bind_6 = print_high.$print_pretty$.currentBinding(thread);
            try {
                print_high.$print_pretty$.bind((SubLObject)rule_disambiguation.NIL, thread);
                PrintLow.format(s_out, (SubLObject)rule_disambiguation.$str65$___);
                SubLObject key = (SubLObject)rule_disambiguation.NIL;
                SubLObject value = (SubLObject)rule_disambiguation.NIL;
                final Iterator cdohash_iterator = Hashtables.getEntrySetIterator(rule_hash_table);
                try {
                    while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                        final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                        key = Hashtables.getEntryKey(cdohash_entry);
                        value = Hashtables.getEntryValue(cdohash_entry);
                        PrintLow.format(s_out, (SubLObject)rule_disambiguation.$str66$__S____S___, key, value);
                    }
                }
                finally {
                    Hashtables.releaseEntrySetIterator(cdohash_iterator);
                }
                PrintLow.format(s_out, (SubLObject)rule_disambiguation.$str67$___);
            }
            finally {
                print_high.$print_pretty$.rebind(_prev_bind_6, thread);
            }
        }
        finally {
            final SubLObject _prev_bind_7 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)rule_disambiguation.T, thread);
                final SubLObject _values3 = Values.getValuesAsVector();
                if (stream.isStream()) {
                    streams_high.close(stream, (SubLObject)rule_disambiguation.UNPROVIDED);
                }
                Values.restoreValuesFromVector(_values3);
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_7, thread);
            }
        }
        return (SubLObject)rule_disambiguation.$kw68$DONE;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rule-disambiguation.lisp", position = 15516L)
    public static SubLObject create_disambiguator_rules_file_from_fort_list(final SubLObject fort_list, final SubLObject f_out) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert rule_disambiguation.NIL != Types.stringp(f_out) : f_out;
        final SubLObject rule_hash_table = Hashtables.make_hash_table((SubLObject)rule_disambiguation.$int62$65536, (SubLObject)rule_disambiguation.EQUAL, (SubLObject)rule_disambiguation.UNPROVIDED);
        final SubLObject _prev_bind_0 = utilities_macros.$progress_note$.currentBinding(thread);
        final SubLObject _prev_bind_2 = utilities_macros.$progress_start_time$.currentBinding(thread);
        final SubLObject _prev_bind_3 = utilities_macros.$progress_total$.currentBinding(thread);
        final SubLObject _prev_bind_4 = utilities_macros.$progress_sofar$.currentBinding(thread);
        final SubLObject _prev_bind_5 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
        final SubLObject _prev_bind_6 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
        final SubLObject _prev_bind_7 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
        final SubLObject _prev_bind_8 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
        try {
            utilities_macros.$progress_note$.bind((SubLObject)rule_disambiguation.$str90$cdolist, thread);
            utilities_macros.$progress_start_time$.bind(Time.get_universal_time(), thread);
            utilities_macros.$progress_total$.bind(Sequences.length(fort_list), thread);
            utilities_macros.$progress_sofar$.bind((SubLObject)rule_disambiguation.ZERO_INTEGER, thread);
            utilities_macros.$last_percent_progress_index$.bind((SubLObject)rule_disambiguation.ZERO_INTEGER, thread);
            utilities_macros.$last_percent_progress_prediction$.bind((SubLObject)rule_disambiguation.NIL, thread);
            utilities_macros.$within_noting_percent_progress$.bind((SubLObject)rule_disambiguation.T, thread);
            utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
            try {
                utilities_macros.noting_percent_progress_preamble(utilities_macros.$progress_note$.getDynamicValue(thread));
                SubLObject csome_list_var = fort_list;
                SubLObject fort = (SubLObject)rule_disambiguation.NIL;
                fort = csome_list_var.first();
                while (rule_disambiguation.NIL != csome_list_var) {
                    SubLObject store = (SubLObject)rule_disambiguation.NIL;
                    try {
                        store = inference_datastructures_problem_store.new_problem_store((SubLObject)rule_disambiguation.NIL);
                        SubLObject cdolist_list_var = fort_disambiguation_rule_query(fort, rule_disambiguation.$const60$isLicensedBy, store);
                        SubLObject pair = (SubLObject)rule_disambiguation.NIL;
                        pair = cdolist_list_var.first();
                        while (rule_disambiguation.NIL != cdolist_list_var) {
                            hash_table_utilities.push_hash(pair.first(), (SubLObject)ConsesLow.cons((SubLObject)rule_disambiguation.T, conses_high.second(pair)), rule_hash_table);
                            cdolist_list_var = cdolist_list_var.rest();
                            pair = cdolist_list_var.first();
                        }
                        cdolist_list_var = fort_disambiguation_rule_query(fort, rule_disambiguation.$const61$isDelicensedBy, store);
                        pair = (SubLObject)rule_disambiguation.NIL;
                        pair = cdolist_list_var.first();
                        while (rule_disambiguation.NIL != cdolist_list_var) {
                            hash_table_utilities.push_hash(pair.first(), (SubLObject)ConsesLow.cons((SubLObject)rule_disambiguation.NIL, conses_high.second(pair)), rule_hash_table);
                            cdolist_list_var = cdolist_list_var.rest();
                            pair = cdolist_list_var.first();
                        }
                    }
                    finally {
                        final SubLObject _prev_bind_0_$27 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)rule_disambiguation.T, thread);
                            final SubLObject _values = Values.getValuesAsVector();
                            inference_datastructures_problem_store.destroy_problem_store(store);
                            Values.restoreValuesFromVector(_values);
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$27, thread);
                        }
                    }
                    utilities_macros.$progress_sofar$.setDynamicValue(Numbers.add(utilities_macros.$progress_sofar$.getDynamicValue(thread), (SubLObject)rule_disambiguation.ONE_INTEGER), thread);
                    utilities_macros.note_percent_progress(utilities_macros.$progress_sofar$.getDynamicValue(thread), utilities_macros.$progress_total$.getDynamicValue(thread));
                    csome_list_var = csome_list_var.rest();
                    fort = csome_list_var.first();
                }
            }
            finally {
                final SubLObject _prev_bind_0_$28 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)rule_disambiguation.T, thread);
                    final SubLObject _values2 = Values.getValuesAsVector();
                    utilities_macros.noting_percent_progress_postamble();
                    Values.restoreValuesFromVector(_values2);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$28, thread);
                }
            }
        }
        finally {
            utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_8, thread);
            utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_7, thread);
            utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_6, thread);
            utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_5, thread);
            utilities_macros.$progress_sofar$.rebind(_prev_bind_4, thread);
            utilities_macros.$progress_total$.rebind(_prev_bind_3, thread);
            utilities_macros.$progress_start_time$.rebind(_prev_bind_2, thread);
            utilities_macros.$progress_note$.rebind(_prev_bind_0, thread);
        }
        SubLObject stream = (SubLObject)rule_disambiguation.NIL;
        try {
            stream = compatibility.open_text(f_out, (SubLObject)rule_disambiguation.$kw63$OUTPUT);
            if (!stream.isStream()) {
                Errors.error((SubLObject)rule_disambiguation.$str64$Unable_to_open__S, f_out);
            }
            final SubLObject s_out = stream;
            final SubLObject _prev_bind_9 = print_high.$print_pretty$.currentBinding(thread);
            try {
                print_high.$print_pretty$.bind((SubLObject)rule_disambiguation.NIL, thread);
                PrintLow.format(s_out, (SubLObject)rule_disambiguation.$str65$___);
                SubLObject key = (SubLObject)rule_disambiguation.NIL;
                SubLObject value = (SubLObject)rule_disambiguation.NIL;
                final Iterator cdohash_iterator = Hashtables.getEntrySetIterator(rule_hash_table);
                try {
                    while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                        final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                        key = Hashtables.getEntryKey(cdohash_entry);
                        value = Hashtables.getEntryValue(cdohash_entry);
                        PrintLow.format(s_out, (SubLObject)rule_disambiguation.$str66$__S____S___, key, value);
                    }
                }
                finally {
                    Hashtables.releaseEntrySetIterator(cdohash_iterator);
                }
                PrintLow.format(s_out, (SubLObject)rule_disambiguation.$str67$___);
            }
            finally {
                print_high.$print_pretty$.rebind(_prev_bind_9, thread);
            }
        }
        finally {
            final SubLObject _prev_bind_10 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)rule_disambiguation.T, thread);
                final SubLObject _values3 = Values.getValuesAsVector();
                if (stream.isStream()) {
                    streams_high.close(stream, (SubLObject)rule_disambiguation.UNPROVIDED);
                }
                Values.restoreValuesFromVector(_values3);
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_10, thread);
            }
        }
        return (SubLObject)rule_disambiguation.$kw68$DONE;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rule-disambiguation.lisp", position = 16350L)
    public static SubLObject create_disambiguator_rules_file_from_fort_file_id(final SubLObject file_id_num, SubLObject in_path, SubLObject out_path) {
        if (in_path == rule_disambiguation.UNPROVIDED) {
            in_path = (SubLObject)rule_disambiguation.$str101$_host_george_term_id_lists_;
        }
        if (out_path == rule_disambiguation.UNPROVIDED) {
            out_path = (SubLObject)rule_disambiguation.$str102$_host_george_disambig_rules_;
        }
        final SubLObject file_name = PrintLow.format((SubLObject)rule_disambiguation.NIL, (SubLObject)rule_disambiguation.$str103$_Afort_id__4__0D_cfasl, in_path, file_id_num);
        final SubLObject terms = cfasl_utilities.cfasl_load(file_name);
        final SubLObject out_file_name = PrintLow.format((SubLObject)rule_disambiguation.NIL, (SubLObject)rule_disambiguation.$str104$_Adisambiguator_rule_file__4__0D_, out_path, file_id_num);
        return create_disambiguator_rules_file_from_fort_list(terms, out_file_name);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rule-disambiguation.lisp", position = 16812L)
    public static SubLObject create_rule_disambugation_condor_jobs(final SubLObject count) {
        SubLObject n;
        for (n = (SubLObject)rule_disambiguation.NIL, n = (SubLObject)rule_disambiguation.ZERO_INTEGER; n.numL(count); n = Numbers.add(n, (SubLObject)rule_disambiguation.ONE_INTEGER)) {
            PrintLow.format((SubLObject)rule_disambiguation.T, (SubLObject)rule_disambiguation.$str105$created_using_CREATE_RULE_DISAMBI);
            PrintLow.format((SubLObject)rule_disambiguation.T, (SubLObject)rule_disambiguation.$str106$arguments______progn__load____hom, n);
            PrintLow.format((SubLObject)rule_disambiguation.T, (SubLObject)rule_disambiguation.$str107$queue____);
        }
        return (SubLObject)rule_disambiguation.NIL;
    }
    
    public static SubLObject declare_rule_disambiguation_file() {
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.rule_disambiguation", "with_new_rule_disambiguator", "WITH-NEW-RULE-DISAMBIGUATOR");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rule_disambiguation", "rule_disambiguator_print_function_trampoline", "RULE-DISAMBIGUATOR-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rule_disambiguation", "rule_disambiguator_p", "RULE-DISAMBIGUATOR-P", 1, 0, false);
        new $rule_disambiguator_p$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rule_disambiguation", "rdis_rule_file", "RDIS-RULE-FILE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rule_disambiguation", "rdis_count_file", "RDIS-COUNT-FILE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rule_disambiguation", "rdis_rules", "RDIS-RULES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rule_disambiguation", "rdis_counts", "RDIS-COUNTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rule_disambiguation", "_csetf_rdis_rule_file", "_CSETF-RDIS-RULE-FILE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rule_disambiguation", "_csetf_rdis_count_file", "_CSETF-RDIS-COUNT-FILE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rule_disambiguation", "_csetf_rdis_rules", "_CSETF-RDIS-RULES", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rule_disambiguation", "_csetf_rdis_counts", "_CSETF-RDIS-COUNTS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rule_disambiguation", "make_rule_disambiguator", "MAKE-RULE-DISAMBIGUATOR", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rule_disambiguation", "visit_defstruct_rule_disambiguator", "VISIT-DEFSTRUCT-RULE-DISAMBIGUATOR", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rule_disambiguation", "visit_defstruct_object_rule_disambiguator_method", "VISIT-DEFSTRUCT-OBJECT-RULE-DISAMBIGUATOR-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rule_disambiguation", "new_rule_disambiguator", "NEW-RULE-DISAMBIGUATOR", 0, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rule_disambiguation", "finalize_rule_disambiguator", "FINALIZE-RULE-DISAMBIGUATOR", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rule_disambiguation", "rdis_print", "RDIS-PRINT", 3, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.rule_disambiguation", "with_sense_bag_excepting_word", "WITH-SENSE-BAG-EXCEPTING-WORD");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rule_disambiguation", "document_disambiguate_rule_disambiguator_method", "DOCUMENT-DISAMBIGUATE-RULE-DISAMBIGUATOR-METHOD", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rule_disambiguation", "rdis_disambiguate", "RDIS-DISAMBIGUATE", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rule_disambiguation", "sense_markers_not_requiring_licensing", "SENSE-MARKERS-NOT-REQUIRING-LICENSING", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rule_disambiguation", "rule_void", "RULE-VOID", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rule_disambiguation", "load_disambiguator_rules", "LOAD-DISAMBIGUATOR-RULES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rule_disambiguation", "load_disambiguator_counts", "LOAD-DISAMBIGUATOR-COUNTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rule_disambiguation", "highest_count_sense_markers", "HIGHEST-COUNT-SENSE-MARKERS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rule_disambiguation", "ambiguous_p", "AMBIGUOUS-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rule_disambiguation", "is_licensed_p", "IS-LICENSED-P", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rule_disambiguation", "positive_clause_p", "POSITIVE-CLAUSE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rule_disambiguation", "negative_clause_p", "NEGATIVE-CLAUSE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rule_disambiguation", "clause_sign", "CLAUSE-SIGN", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rule_disambiguation", "clause_term", "CLAUSE-TERM", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rule_disambiguation", "new_sense_bag", "NEW-SENSE-BAG", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rule_disambiguation", "sense_bag_licensesP", "SENSE-BAG-LICENSES?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rule_disambiguation", "disambiguation_rule_query", "DISAMBIGUATION-RULE-QUERY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rule_disambiguation", "create_disambiguator_rules_file", "CREATE-DISAMBIGUATOR-RULES-FILE", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rule_disambiguation", "fort_disambiguation_rule_query", "FORT-DISAMBIGUATION-RULE-QUERY", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rule_disambiguation", "term_alist_to_file_hash_table", "TERM-ALIST-TO-FILE-HASH-TABLE", 2, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rule_disambiguation", "alist_file_to_fht", "ALIST-FILE-TO-FHT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rule_disambiguation", "disambiguator_rule_fht_to_hl_id_text_file", "DISAMBIGUATOR-RULE-FHT-TO-HL-ID-TEXT-FILE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rule_disambiguation", "create_disambiguator_rules_file_from_forts", "CREATE-DISAMBIGUATOR-RULES-FILE-FROM-FORTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rule_disambiguation", "create_disambiguator_rules_file_from_fort_list", "CREATE-DISAMBIGUATOR-RULES-FILE-FROM-FORT-LIST", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rule_disambiguation", "create_disambiguator_rules_file_from_fort_file_id", "CREATE-DISAMBIGUATOR-RULES-FILE-FROM-FORT-FILE-ID", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rule_disambiguation", "create_rule_disambugation_condor_jobs", "CREATE-RULE-DISAMBUGATION-CONDOR-JOBS", 1, 0, false);
        return (SubLObject)rule_disambiguation.NIL;
    }
    
    public static SubLObject init_rule_disambiguation_file() {
        rule_disambiguation.$word_sense_disambiguation_rule_file$ = SubLFiles.defparameter("*WORD-SENSE-DISAMBIGUATION-RULE-FILE*", (SubLObject)rule_disambiguation.$str0$data_word_sense_disambiguation_ru);
        rule_disambiguation.$word_sense_disambiguation_count_file$ = SubLFiles.defparameter("*WORD-SENSE-DISAMBIGUATION-COUNT-FILE*", (SubLObject)rule_disambiguation.$str1$data_word_sense_disambiguation_co);
        rule_disambiguation.$dtp_rule_disambiguator$ = SubLFiles.defconstant("*DTP-RULE-DISAMBIGUATOR*", (SubLObject)rule_disambiguation.$sym6$RULE_DISAMBIGUATOR);
        return (SubLObject)rule_disambiguation.NIL;
    }
    
    public static SubLObject setup_rule_disambiguation_file() {
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), rule_disambiguation.$dtp_rule_disambiguator$.getGlobalValue(), Symbols.symbol_function((SubLObject)rule_disambiguation.$sym13$RULE_DISAMBIGUATOR_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)rule_disambiguation.$list14);
        Structures.def_csetf((SubLObject)rule_disambiguation.$sym15$RDIS_RULE_FILE, (SubLObject)rule_disambiguation.$sym16$_CSETF_RDIS_RULE_FILE);
        Structures.def_csetf((SubLObject)rule_disambiguation.$sym17$RDIS_COUNT_FILE, (SubLObject)rule_disambiguation.$sym18$_CSETF_RDIS_COUNT_FILE);
        Structures.def_csetf((SubLObject)rule_disambiguation.$sym19$RDIS_RULES, (SubLObject)rule_disambiguation.$sym20$_CSETF_RDIS_RULES);
        Structures.def_csetf((SubLObject)rule_disambiguation.$sym21$RDIS_COUNTS, (SubLObject)rule_disambiguation.$sym22$_CSETF_RDIS_COUNTS);
        Equality.identity((SubLObject)rule_disambiguation.$sym6$RULE_DISAMBIGUATOR);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), rule_disambiguation.$dtp_rule_disambiguator$.getGlobalValue(), Symbols.symbol_function((SubLObject)rule_disambiguation.$sym32$VISIT_DEFSTRUCT_OBJECT_RULE_DISAMBIGUATOR_METHOD));
        Structures.register_method(document_disambiguation.$document_disambiguate_method_table$.getGlobalValue(), rule_disambiguation.$dtp_rule_disambiguator$.getGlobalValue(), Symbols.symbol_function((SubLObject)rule_disambiguation.$sym46$DOCUMENT_DISAMBIGUATE_RULE_DISAMBIGUATOR_METHOD));
        return (SubLObject)rule_disambiguation.NIL;
    }
    
    public void declareFunctions() {
        declare_rule_disambiguation_file();
    }
    
    public void initializeVariables() {
        init_rule_disambiguation_file();
    }
    
    public void runTopLevelForms() {
        setup_rule_disambiguation_file();
    }
    
    static {
        me = (SubLFile)new rule_disambiguation();
        rule_disambiguation.$word_sense_disambiguation_rule_file$ = null;
        rule_disambiguation.$word_sense_disambiguation_count_file$ = null;
        rule_disambiguation.$dtp_rule_disambiguator$ = null;
        $str0$data_word_sense_disambiguation_ru = SubLObjectFactory.makeString("data/word-sense-disambiguation-rules.fht");
        $str1$data_word_sense_disambiguation_co = SubLObjectFactory.makeString("data/word-sense-disambiguation-counts.fht");
        $list2 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DISAMBIGUATOR")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym3$CLET = SubLObjectFactory.makeSymbol("CLET");
        $list4 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-RULE-DISAMBIGUATOR")));
        $sym5$FINALIZE_RULE_DISAMBIGUATOR = SubLObjectFactory.makeSymbol("FINALIZE-RULE-DISAMBIGUATOR");
        $sym6$RULE_DISAMBIGUATOR = SubLObjectFactory.makeSymbol("RULE-DISAMBIGUATOR");
        $sym7$RULE_DISAMBIGUATOR_P = SubLObjectFactory.makeSymbol("RULE-DISAMBIGUATOR-P");
        $list8 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RULE-FILE"), (SubLObject)SubLObjectFactory.makeSymbol("COUNT-FILE"), (SubLObject)SubLObjectFactory.makeSymbol("RULES"), (SubLObject)SubLObjectFactory.makeSymbol("COUNTS"));
        $list9 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("RULE-FILE"), (SubLObject)SubLObjectFactory.makeKeyword("COUNT-FILE"), (SubLObject)SubLObjectFactory.makeKeyword("RULES"), (SubLObject)SubLObjectFactory.makeKeyword("COUNTS"));
        $list10 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RDIS-RULE-FILE"), (SubLObject)SubLObjectFactory.makeSymbol("RDIS-COUNT-FILE"), (SubLObject)SubLObjectFactory.makeSymbol("RDIS-RULES"), (SubLObject)SubLObjectFactory.makeSymbol("RDIS-COUNTS"));
        $list11 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("_CSETF-RDIS-RULE-FILE"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-RDIS-COUNT-FILE"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-RDIS-RULES"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-RDIS-COUNTS"));
        $sym12$RDIS_PRINT = SubLObjectFactory.makeSymbol("RDIS-PRINT");
        $sym13$RULE_DISAMBIGUATOR_PRINT_FUNCTION_TRAMPOLINE = SubLObjectFactory.makeSymbol("RULE-DISAMBIGUATOR-PRINT-FUNCTION-TRAMPOLINE");
        $list14 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("RULE-DISAMBIGUATOR-P"));
        $sym15$RDIS_RULE_FILE = SubLObjectFactory.makeSymbol("RDIS-RULE-FILE");
        $sym16$_CSETF_RDIS_RULE_FILE = SubLObjectFactory.makeSymbol("_CSETF-RDIS-RULE-FILE");
        $sym17$RDIS_COUNT_FILE = SubLObjectFactory.makeSymbol("RDIS-COUNT-FILE");
        $sym18$_CSETF_RDIS_COUNT_FILE = SubLObjectFactory.makeSymbol("_CSETF-RDIS-COUNT-FILE");
        $sym19$RDIS_RULES = SubLObjectFactory.makeSymbol("RDIS-RULES");
        $sym20$_CSETF_RDIS_RULES = SubLObjectFactory.makeSymbol("_CSETF-RDIS-RULES");
        $sym21$RDIS_COUNTS = SubLObjectFactory.makeSymbol("RDIS-COUNTS");
        $sym22$_CSETF_RDIS_COUNTS = SubLObjectFactory.makeSymbol("_CSETF-RDIS-COUNTS");
        $kw23$RULE_FILE = SubLObjectFactory.makeKeyword("RULE-FILE");
        $kw24$COUNT_FILE = SubLObjectFactory.makeKeyword("COUNT-FILE");
        $kw25$RULES = SubLObjectFactory.makeKeyword("RULES");
        $kw26$COUNTS = SubLObjectFactory.makeKeyword("COUNTS");
        $str27$Invalid_slot__S_for_construction_ = SubLObjectFactory.makeString("Invalid slot ~S for construction function");
        $kw28$BEGIN = SubLObjectFactory.makeKeyword("BEGIN");
        $sym29$MAKE_RULE_DISAMBIGUATOR = SubLObjectFactory.makeSymbol("MAKE-RULE-DISAMBIGUATOR");
        $kw30$SLOT = SubLObjectFactory.makeKeyword("SLOT");
        $kw31$END = SubLObjectFactory.makeKeyword("END");
        $sym32$VISIT_DEFSTRUCT_OBJECT_RULE_DISAMBIGUATOR_METHOD = SubLObjectFactory.makeSymbol("VISIT-DEFSTRUCT-OBJECT-RULE-DISAMBIGUATOR-METHOD");
        $sym33$STRINGP = SubLObjectFactory.makeSymbol("STRINGP");
        $str34$__RULE_DISAMBIGUATOR_ = SubLObjectFactory.makeString("#<RULE-DISAMBIGUATOR ");
        $str35$_ = SubLObjectFactory.makeString(" ");
        $str36$_ = SubLObjectFactory.makeString(">");
        $list37 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("BAG"), (SubLObject)SubLObjectFactory.makeSymbol("WORD")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym38$CYCL = SubLObjectFactory.makeUninternedSymbol("CYCL");
        $sym39$GENL_CYCL = SubLObjectFactory.makeUninternedSymbol("GENL-CYCL");
        $sym40$PROGN = SubLObjectFactory.makeSymbol("PROGN");
        $sym41$CDOLIST = SubLObjectFactory.makeSymbol("CDOLIST");
        $sym42$WORD_CYCLS = SubLObjectFactory.makeSymbol("WORD-CYCLS");
        $sym43$CINC_HASH = SubLObjectFactory.makeSymbol("CINC-HASH");
        $list44 = ConsesLow.list((SubLObject)rule_disambiguation.MINUS_ONE_INTEGER);
        $sym45$GET_UPWARDS_CLOSURE = SubLObjectFactory.makeSymbol("GET-UPWARDS-CLOSURE");
        $sym46$DOCUMENT_DISAMBIGUATE_RULE_DISAMBIGUATOR_METHOD = SubLObjectFactory.makeSymbol("DOCUMENT-DISAMBIGUATE-RULE-DISAMBIGUATOR-METHOD");
        $sym47$DOCUMENT_P = SubLObjectFactory.makeSymbol("DOCUMENT-P");
        $sym48$HASH_TABLE_P = SubLObjectFactory.makeSymbol("HASH-TABLE-P");
        $kw49$INTERPS = SubLObjectFactory.makeKeyword("INTERPS");
        $const50$VanishinglyRareLexicalMapping = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("VanishinglyRareLexicalMapping"));
        $const51$ContextuallyDependentLexicalMappi = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ContextuallyDependentLexicalMapping"));
        $kw52$NOT_FOUND = SubLObjectFactory.makeKeyword("NOT-FOUND");
        $str53$Can_t_load_rules_from__a = SubLObjectFactory.makeString("Can't load rules from ~a");
        $str54$Can_t_load_counts_from__a = SubLObjectFactory.makeString("Can't load counts from ~a");
        $int55$1024 = SubLObjectFactory.makeInteger(1024);
        $list56 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("?X"), (SubLObject)SubLObjectFactory.makeSymbol("?Y"));
        $const57$InferencePSC = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("InferencePSC"));
        $list58 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("INFERENCE-MODE"), SubLObjectFactory.makeKeyword("SHALLOW"), SubLObjectFactory.makeKeyword("ALLOW-INDETERMINATE-RESULTS?"), rule_disambiguation.NIL, SubLObjectFactory.makeKeyword("DISJUNCTION-FREE-EL-VARS-POLICY"), SubLObjectFactory.makeKeyword("COMPUTE-INTERSECTION"), SubLObjectFactory.makeKeyword("INTERMEDIATE-STEP-VALIDATION-LEVEL"), SubLObjectFactory.makeKeyword("MINIMAL"), SubLObjectFactory.makeKeyword("MAX-TIME"), SubLObjectFactory.makeInteger(57600), SubLObjectFactory.makeKeyword("PROBABLY-APPROXIMATELY-DONE"), SubLObjectFactory.makeDouble(1.0), SubLObjectFactory.makeKeyword("ANSWER-LANGUAGE"), SubLObjectFactory.makeKeyword("EL"), SubLObjectFactory.makeKeyword("CONTINUABLE?"), rule_disambiguation.NIL });
        $str59$data_word_sense_disambiguation_ru = SubLObjectFactory.makeString("data/word-sense-disambiguation-rules.txt");
        $const60$isLicensedBy = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isLicensedBy"));
        $const61$isDelicensedBy = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isDelicensedBy"));
        $int62$65536 = SubLObjectFactory.makeInteger(65536);
        $kw63$OUTPUT = SubLObjectFactory.makeKeyword("OUTPUT");
        $str64$Unable_to_open__S = SubLObjectFactory.makeString("Unable to open ~S");
        $str65$___ = SubLObjectFactory.makeString("(~%");
        $str66$__S____S___ = SubLObjectFactory.makeString("(~S . ~S)~%");
        $str67$___ = SubLObjectFactory.makeString(")~%");
        $kw68$DONE = SubLObjectFactory.makeKeyword("DONE");
        $list69 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("?LICENSOR"));
        $kw70$INFERENCE_MODE = SubLObjectFactory.makeKeyword("INFERENCE-MODE");
        $kw71$SHALLOW = SubLObjectFactory.makeKeyword("SHALLOW");
        $kw72$ALLOW_INDETERMINATE_RESULTS_ = SubLObjectFactory.makeKeyword("ALLOW-INDETERMINATE-RESULTS?");
        $kw73$DISJUNCTION_FREE_EL_VARS_POLICY = SubLObjectFactory.makeKeyword("DISJUNCTION-FREE-EL-VARS-POLICY");
        $kw74$COMPUTE_INTERSECTION = SubLObjectFactory.makeKeyword("COMPUTE-INTERSECTION");
        $kw75$INTERMEDIATE_STEP_VALIDATION_LEVEL = SubLObjectFactory.makeKeyword("INTERMEDIATE-STEP-VALIDATION-LEVEL");
        $kw76$MINIMAL = SubLObjectFactory.makeKeyword("MINIMAL");
        $kw77$MAX_TIME = SubLObjectFactory.makeKeyword("MAX-TIME");
        $int78$57600 = SubLObjectFactory.makeInteger(57600);
        $kw79$PROBABLY_APPROXIMATELY_DONE = SubLObjectFactory.makeKeyword("PROBABLY-APPROXIMATELY-DONE");
        $float80$1_0 = (SubLFloat)SubLObjectFactory.makeDouble(1.0);
        $kw81$ANSWER_LANGUAGE = SubLObjectFactory.makeKeyword("ANSWER-LANGUAGE");
        $kw82$EL = SubLObjectFactory.makeKeyword("EL");
        $kw83$CONTINUABLE_ = SubLObjectFactory.makeKeyword("CONTINUABLE?");
        $kw84$PROBLEM_STORE = SubLObjectFactory.makeKeyword("PROBLEM-STORE");
        $str85$_tmp_ = SubLObjectFactory.makeString("/tmp/");
        $sym86$LISTP = SubLObjectFactory.makeSymbol("LISTP");
        $str87$_a_is_invalid = SubLObjectFactory.makeString("~a is invalid");
        $str88$Can_t_load__a___a = SubLObjectFactory.makeString("Can't load ~a: ~a");
        $kw89$INPUT = SubLObjectFactory.makeKeyword("INPUT");
        $str90$cdolist = SubLObjectFactory.makeString("cdolist");
        $kw91$IMAGE_INDEPENDENT_CFASL = SubLObjectFactory.makeKeyword("IMAGE-INDEPENDENT-CFASL");
        $str92$Iterating_over_FHT = SubLObjectFactory.makeString("Iterating over FHT");
        $list93 = (SubLList)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("LICENSED?"), (SubLObject)SubLObjectFactory.makeSymbol("TERM"));
        $str94$don_t_know_how_to_convert__A = SubLObjectFactory.makeString("don't know how to convert ~A");
        $str95$_A__A_ = SubLObjectFactory.makeString("~A,~A,");
        $str96$_A_ = SubLObjectFactory.makeString("~A,");
        $str97$__ = SubLObjectFactory.makeString("~%");
        $list98 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("INTERMEDIATE-STEP-VALIDATION-LEVEL"), (SubLObject)SubLObjectFactory.makeKeyword("MINIMAL"));
        $str99$mapping_Cyc_FORTs = SubLObjectFactory.makeString("mapping Cyc FORTs");
        $kw100$SKIP = SubLObjectFactory.makeKeyword("SKIP");
        $str101$_host_george_term_id_lists_ = SubLObjectFactory.makeString("/host/george/term-id-lists/");
        $str102$_host_george_disambig_rules_ = SubLObjectFactory.makeString("/host/george/disambig-rules/");
        $str103$_Afort_id__4__0D_cfasl = SubLObjectFactory.makeString("~Afort-id-~4,'0D.cfasl");
        $str104$_Adisambiguator_rule_file__4__0D_ = SubLObjectFactory.makeString("~Adisambiguator-rule-file-~4,'0D.txt");
        $str105$created_using_CREATE_RULE_DISAMBI = SubLObjectFactory.makeString("created using CREATE-RULE-DISAMBIGUATION-CONDOR-JOBS in RULE-DISAMBIGUATION");
        $str106$arguments______progn__load____hom = SubLObjectFactory.makeString("arguments = \"'(progn (load \"\"/home/daves/cycl/rule-disambiguation.lisp\"\") (load-transcript-file \"\"/cyc/top/transcripts/0917/billie-20061025103022-21843-local-0-sent.ts\"\" nil :none) (load-transcript-file \"\"/cyc/top/transcripts/0917/billie-20061025103022-21843-local-1-sent.ts\"\" nil :none) (create-disambiguator-rules-file-from-fort-file-id ~A))'\"~%");
        $str107$queue____ = SubLObjectFactory.makeString("queue~%~%");
    }
    
    public static final class $rule_disambiguator_native extends SubLStructNative
    {
        public SubLObject $rule_file;
        public SubLObject $count_file;
        public SubLObject $rules;
        public SubLObject $counts;
        private static final SubLStructDeclNative structDecl;
        
        public $rule_disambiguator_native() {
            this.$rule_file = (SubLObject)CommonSymbols.NIL;
            this.$count_file = (SubLObject)CommonSymbols.NIL;
            this.$rules = (SubLObject)CommonSymbols.NIL;
            this.$counts = (SubLObject)CommonSymbols.NIL;
        }
        
        public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$rule_disambiguator_native.structDecl;
        }
        
        public SubLObject getField2() {
            return this.$rule_file;
        }
        
        public SubLObject getField3() {
            return this.$count_file;
        }
        
        public SubLObject getField4() {
            return this.$rules;
        }
        
        public SubLObject getField5() {
            return this.$counts;
        }
        
        public SubLObject setField2(final SubLObject value) {
            return this.$rule_file = value;
        }
        
        public SubLObject setField3(final SubLObject value) {
            return this.$count_file = value;
        }
        
        public SubLObject setField4(final SubLObject value) {
            return this.$rules = value;
        }
        
        public SubLObject setField5(final SubLObject value) {
            return this.$counts = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$rule_disambiguator_native.class, rule_disambiguation.$sym6$RULE_DISAMBIGUATOR, rule_disambiguation.$sym7$RULE_DISAMBIGUATOR_P, rule_disambiguation.$list8, rule_disambiguation.$list9, new String[] { "$rule_file", "$count_file", "$rules", "$counts" }, rule_disambiguation.$list10, rule_disambiguation.$list11, rule_disambiguation.$sym12$RDIS_PRINT);
        }
    }
    
    public static final class $rule_disambiguator_p$UnaryFunction extends UnaryFunction
    {
        public $rule_disambiguator_p$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("RULE-DISAMBIGUATOR-P"));
        }
        
        public SubLObject processItem(final SubLObject arg1) {
            return rule_disambiguation.rule_disambiguator_p(arg1);
        }
    }
}

/*

	Total time: 755 ms
	
*/