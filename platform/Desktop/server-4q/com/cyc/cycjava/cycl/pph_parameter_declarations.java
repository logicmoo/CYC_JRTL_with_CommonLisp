package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class pph_parameter_declarations extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.pph_parameter_declarations";
    public static final String myFingerPrint = "9d1b582b4408a7178612c25a37a91116d8f0d229a64d146da94c38b834494738";
    private static final SubLSymbol $sym0$SET_PPH_LEXICAL_CONTEXT_INTERNAL;
    private static final SubLSymbol $sym1$SET_PPH_LEXICAL_CONTEXT;
    private static final SubLSymbol $sym2$LEXICAL_CONTEXT_P;
    private static final SubLSymbol $sym3$PPH_MUTABLE_API_PARAMS_P;
    private static final SubLSymbol $kw4$PPH_LEXICAL_CONTEXT;
    private static final SubLList $list5;
    private static final SubLSymbol $sym6$PARAMS;
    private static final SubLList $list7;
    private static final SubLSymbol $kw8$SETTER;
    private static final SubLSymbol $sym9$SET_PPH_SEMANTIC_MT_INTERNAL;
    private static final SubLSymbol $sym10$SET_PPH_SEMANTIC_MT;
    private static final SubLSymbol $sym11$HLMT_P;
    private static final SubLSymbol $kw12$PPH_SEMANTIC_MT;
    private static final SubLSymbol $sym13$PARAMS;
    private static final SubLList $list14;
    private static final SubLSymbol $sym15$SET_PPH_BACKGROUND_DISCOURSE_INTERNAL;
    private static final SubLSymbol $sym16$SET_PPH_BACKGROUND_DISCOURSE;
    private static final SubLSymbol $sym17$TRUE;
    private static final SubLSymbol $kw18$PPH_BACKGROUND_DISCOURSE;
    private static final SubLSymbol $sym19$PARAMS;
    private static final SubLList $list20;
    private static final SubLSymbol $sym21$SET_PPH_DISCOURSE_CONTEXTS_TO_UPDATE_INTERNAL;
    private static final SubLSymbol $sym22$SET_PPH_DISCOURSE_CONTEXTS_TO_UPDATE;
    private static final SubLSymbol $kw23$PPH_DISCOURSE_CONTEXTS_TO_UPDATE;
    private static final SubLSymbol $sym24$PARAMS;
    private static final SubLList $list25;
    private static final SubLSymbol $sym26$SET_PPH_GENERATION_COUNT_INTERNAL;
    private static final SubLSymbol $sym27$SET_PPH_GENERATION_COUNT;
    private static final SubLSymbol $sym28$POSITIVE_POTENTIALLY_INFINITE_INTEGER_P;
    private static final SubLSymbol $kw29$PPH_GENERATION_COUNT;
    private static final SubLSymbol $sym30$PARAMS;
    private static final SubLList $list31;
    private static final SubLSymbol $sym32$SET_PPH_AGREEMENT_INTERNAL;
    private static final SubLSymbol $sym33$SET_PPH_AGREEMENT;
    private static final SubLSymbol $sym34$VALID_EXTERNAL_PPH_NL_PREDS_;
    private static final SubLSymbol $kw35$PPH_AGREEMENT;
    private static final SubLSymbol $sym36$PARAMS;
    private static final SubLList $list37;
    private static final SubLSymbol $sym38$SET_PPH_SENTENTIAL_FORCE_INTERNAL;
    private static final SubLSymbol $sym39$SET_PPH_SENTENTIAL_FORCE;
    private static final SubLSymbol $sym40$PPH_FORCE_P;
    private static final SubLSymbol $kw41$PPH_SENTENTIAL_FORCE;
    private static final SubLSymbol $sym42$PARAMS;
    private static final SubLList $list43;
    private static final SubLSymbol $sym44$SET_PPH_TIMEOUT_INTERNAL;
    private static final SubLSymbol $sym45$SET_PPH_TIMEOUT;
    private static final SubLSymbol $kw46$PPH_TIMEOUT;
    private static final SubLSymbol $sym47$PARAMS;
    private static final SubLList $list48;
    private static final SubLSymbol $kw49$TOP_LEVEL;
    private static final SubLSymbol $sym50$TOP_LEVEL_PPH_API_PARAM_P;
    private static final SubLSymbol $sym51$SET_MAX_DIGITS_WITHOUT_COMMA_INTERNAL;
    private static final SubLSymbol $sym52$SET_MAX_DIGITS_WITHOUT_COMMA;
    private static final SubLSymbol $kw53$MAX_DIGITS_WITHOUT_COMMA;
    private static final SubLSymbol $sym54$PARAMS;
    private static final SubLList $list55;
    private static final SubLSymbol $sym56$SET_SIGNIFICANT_DIGITS_CUTOFF_INTERNAL;
    private static final SubLSymbol $sym57$SET_SIGNIFICANT_DIGITS_CUTOFF;
    private static final SubLSymbol $kw58$SIGNIFICANT_DIGITS_CUTOFF;
    private static final SubLSymbol $sym59$PARAMS;
    private static final SubLList $list60;
    private static final SubLSymbol $sym61$SET_USE_INDEXICAL_DATES__INTERNAL;
    private static final SubLSymbol $sym62$SET_USE_INDEXICAL_DATES_;
    private static final SubLSymbol $sym63$BOOLEANP;
    private static final SubLSymbol $kw64$USE_INDEXICAL_DATES_;
    private static final SubLSymbol $sym65$PARAMS;
    private static final SubLList $list66;
    private static final SubLSymbol $kw67$PPH_FORMAT;
    private static final SubLSymbol $sym68$PPH_FORMAT_PARAM_P;
    private static final SubLSymbol $sym69$SET_DEMERIT_CUTOFF_INTERNAL;
    private static final SubLSymbol $sym70$SET_DEMERIT_CUTOFF;
    private static final SubLSymbol $sym71$NON_NEGATIVE_POTENTIALLY_INFINITE_NUMBER_P;
    private static final SubLSymbol $kw72$DEMERIT_CUTOFF;
    private static final SubLSymbol $sym73$PARAMS;
    private static final SubLList $list74;
    private static final SubLSymbol $sym75$SET_USE_SMART_VARIABLE_REPLACEMENT__INTERNAL;
    private static final SubLSymbol $sym76$SET_USE_SMART_VARIABLE_REPLACEMENT_;
    private static final SubLSymbol $kw77$USE_SMART_VARIABLE_REPLACEMENT_;
    private static final SubLSymbol $sym78$PARAMS;
    private static final SubLList $list79;
    private static final SubLSymbol $sym80$SET_GENLPREDS_BACKOFF_LIMIT_INTERNAL;
    private static final SubLSymbol $sym81$SET_GENLPREDS_BACKOFF_LIMIT;
    private static final SubLSymbol $sym82$NON_NEGATIVE_INTEGER_P;
    private static final SubLSymbol $kw83$GENLPREDS_BACKOFF_LIMIT;
    private static final SubLSymbol $sym84$PARAMS;
    private static final SubLList $list85;
    private static final SubLSymbol $kw86$PPH_GOODNESS;
    private static final SubLSymbol $sym87$PPH_GOODNESS_PARAM_P;
    private static final SubLSymbol $sym88$SET_PREFER_TERSE_PARAPHRASE__INTERNAL;
    private static final SubLSymbol $sym89$SET_PREFER_TERSE_PARAPHRASE_;
    private static final SubLSymbol $kw90$PREFER_TERSE_PARAPHRASE_;
    private static final SubLSymbol $sym91$PARAMS;
    private static final SubLList $list92;
    private static final SubLSymbol $sym93$SET_MAXIMIZE_LINKS__INTERNAL;
    private static final SubLSymbol $sym94$SET_MAXIMIZE_LINKS_;
    private static final SubLSymbol $kw95$MAXIMIZE_LINKS_;
    private static final SubLSymbol $sym96$PARAMS;
    private static final SubLList $list97;
    private static final SubLSymbol $kw98$PPH_PRECISION;
    private static final SubLSymbol $sym99$PPH_PRECISION_PARAM_P;
    private static final SubLSymbol $kw100$PPH_FORMALITY;
    private static final SubLSymbol $sym101$PPH_FORMALITY_PARAM_P;
    private static final SubLSymbol $sym102$SET_USE_TITLE_CAPITALIZATION__INTERNAL;
    private static final SubLSymbol $sym103$SET_USE_TITLE_CAPITALIZATION_;
    private static final SubLSymbol $kw104$USE_TITLE_CAPITALIZATION_;
    private static final SubLSymbol $sym105$PARAMS;
    private static final SubLList $list106;
    private static final SubLSymbol $sym107$SET_ADD_DETERMINERS_BEFORE_VARIABLES__INTERNAL;
    private static final SubLSymbol $sym108$SET_ADD_DETERMINERS_BEFORE_VARIABLES_;
    private static final SubLSymbol $kw109$ADD_DETERMINERS_BEFORE_VARIABLES_;
    private static final SubLSymbol $sym110$PARAMS;
    private static final SubLList $list111;
    private static final SubLSymbol $sym112$SET_QUANTIFY_VARIABLES__INTERNAL;
    private static final SubLSymbol $sym113$SET_QUANTIFY_VARIABLES_;
    private static final SubLSymbol $kw114$QUANTIFY_VARIABLES_;
    private static final SubLSymbol $sym115$PARAMS;
    private static final SubLList $list116;
    private static final SubLSymbol $sym117$SET_HIDE_EXPLICIT_UNIVERSALS__INTERNAL;
    private static final SubLSymbol $sym118$SET_HIDE_EXPLICIT_UNIVERSALS_;
    private static final SubLSymbol $kw119$HIDE_EXPLICIT_UNIVERSALS_;
    private static final SubLSymbol $sym120$PARAMS;
    private static final SubLList $list121;
    private static final SubLSymbol $kw122$PPH_MISC;
    private static final SubLSymbol $sym123$PPH_MISC_PARAM_P;
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-parameter-declarations.lisp", position = 855L)
    public static SubLObject set_pph_lexical_context_internal(final SubLObject params, final SubLObject value) {
        assert pph_parameter_declarations.NIL != nl_generation_api.lexical_context_p(value) : value;
        assert pph_parameter_declarations.NIL != nl_generation_api.pph_mutable_api_params_p(params) : params;
        pph_parameter_declaration.set_pph_parameter_value(params, (SubLObject)pph_parameter_declarations.$kw4$PPH_LEXICAL_CONTEXT, value);
        return params;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-parameter-declarations.lisp", position = 855L)
    public static SubLObject set_pph_lexical_context(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject params_form = (SubLObject)pph_parameter_declarations.NIL;
        SubLObject value = (SubLObject)pph_parameter_declarations.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)pph_parameter_declarations.$list5);
        params_form = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)pph_parameter_declarations.$list5);
        value = current.first();
        current = current.rest();
        if (pph_parameter_declarations.NIL == current) {
            final SubLObject params = (SubLObject)pph_parameter_declarations.$sym6$PARAMS;
            return pph_parameter_declaration.pph_parameter_setter_body(params_form, params, value, (SubLObject)pph_parameter_declarations.$sym0$SET_PPH_LEXICAL_CONTEXT_INTERNAL);
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)pph_parameter_declarations.$list5);
        return (SubLObject)pph_parameter_declarations.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-parameter-declarations.lisp", position = 1101L)
    public static SubLObject set_pph_semantic_mt_internal(final SubLObject params, final SubLObject value) {
        assert pph_parameter_declarations.NIL != hlmt.hlmt_p(value) : value;
        assert pph_parameter_declarations.NIL != nl_generation_api.pph_mutable_api_params_p(params) : params;
        pph_parameter_declaration.set_pph_parameter_value(params, (SubLObject)pph_parameter_declarations.$kw12$PPH_SEMANTIC_MT, value);
        return params;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-parameter-declarations.lisp", position = 1101L)
    public static SubLObject set_pph_semantic_mt(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject params_form = (SubLObject)pph_parameter_declarations.NIL;
        SubLObject value = (SubLObject)pph_parameter_declarations.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)pph_parameter_declarations.$list5);
        params_form = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)pph_parameter_declarations.$list5);
        value = current.first();
        current = current.rest();
        if (pph_parameter_declarations.NIL == current) {
            final SubLObject params = (SubLObject)pph_parameter_declarations.$sym13$PARAMS;
            return pph_parameter_declaration.pph_parameter_setter_body(params_form, params, value, (SubLObject)pph_parameter_declarations.$sym9$SET_PPH_SEMANTIC_MT_INTERNAL);
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)pph_parameter_declarations.$list5);
        return (SubLObject)pph_parameter_declarations.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-parameter-declarations.lisp", position = 1325L)
    public static SubLObject set_pph_background_discourse_internal(final SubLObject params, final SubLObject value) {
        assert pph_parameter_declarations.NIL != Types.sublisp_true(value) : value;
        assert pph_parameter_declarations.NIL != nl_generation_api.pph_mutable_api_params_p(params) : params;
        pph_parameter_declaration.set_pph_parameter_value(params, (SubLObject)pph_parameter_declarations.$kw18$PPH_BACKGROUND_DISCOURSE, value);
        return params;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-parameter-declarations.lisp", position = 1325L)
    public static SubLObject set_pph_background_discourse(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject params_form = (SubLObject)pph_parameter_declarations.NIL;
        SubLObject value = (SubLObject)pph_parameter_declarations.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)pph_parameter_declarations.$list5);
        params_form = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)pph_parameter_declarations.$list5);
        value = current.first();
        current = current.rest();
        if (pph_parameter_declarations.NIL == current) {
            final SubLObject params = (SubLObject)pph_parameter_declarations.$sym19$PARAMS;
            return pph_parameter_declaration.pph_parameter_setter_body(params_form, params, value, (SubLObject)pph_parameter_declarations.$sym15$SET_PPH_BACKGROUND_DISCOURSE_INTERNAL);
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)pph_parameter_declarations.$list5);
        return (SubLObject)pph_parameter_declarations.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-parameter-declarations.lisp", position = 1541L)
    public static SubLObject set_pph_discourse_contexts_to_update_internal(final SubLObject params, final SubLObject value) {
        assert pph_parameter_declarations.NIL != Types.sublisp_true(value) : value;
        assert pph_parameter_declarations.NIL != nl_generation_api.pph_mutable_api_params_p(params) : params;
        pph_parameter_declaration.set_pph_parameter_value(params, (SubLObject)pph_parameter_declarations.$kw23$PPH_DISCOURSE_CONTEXTS_TO_UPDATE, value);
        return params;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-parameter-declarations.lisp", position = 1541L)
    public static SubLObject set_pph_discourse_contexts_to_update(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject params_form = (SubLObject)pph_parameter_declarations.NIL;
        SubLObject value = (SubLObject)pph_parameter_declarations.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)pph_parameter_declarations.$list5);
        params_form = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)pph_parameter_declarations.$list5);
        value = current.first();
        current = current.rest();
        if (pph_parameter_declarations.NIL == current) {
            final SubLObject params = (SubLObject)pph_parameter_declarations.$sym24$PARAMS;
            return pph_parameter_declaration.pph_parameter_setter_body(params_form, params, value, (SubLObject)pph_parameter_declarations.$sym21$SET_PPH_DISCOURSE_CONTEXTS_TO_UPDATE_INTERNAL);
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)pph_parameter_declarations.$list5);
        return (SubLObject)pph_parameter_declarations.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-parameter-declarations.lisp", position = 1811L)
    public static SubLObject set_pph_generation_count_internal(final SubLObject params, final SubLObject value) {
        assert pph_parameter_declarations.NIL != number_utilities.positive_potentially_infinite_integer_p(value) : value;
        assert pph_parameter_declarations.NIL != nl_generation_api.pph_mutable_api_params_p(params) : params;
        pph_parameter_declaration.set_pph_parameter_value(params, (SubLObject)pph_parameter_declarations.$kw29$PPH_GENERATION_COUNT, value);
        return params;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-parameter-declarations.lisp", position = 1811L)
    public static SubLObject set_pph_generation_count(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject params_form = (SubLObject)pph_parameter_declarations.NIL;
        SubLObject value = (SubLObject)pph_parameter_declarations.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)pph_parameter_declarations.$list5);
        params_form = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)pph_parameter_declarations.$list5);
        value = current.first();
        current = current.rest();
        if (pph_parameter_declarations.NIL == current) {
            final SubLObject params = (SubLObject)pph_parameter_declarations.$sym30$PARAMS;
            return pph_parameter_declaration.pph_parameter_setter_body(params_form, params, value, (SubLObject)pph_parameter_declarations.$sym26$SET_PPH_GENERATION_COUNT_INTERNAL);
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)pph_parameter_declarations.$list5);
        return (SubLObject)pph_parameter_declarations.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-parameter-declarations.lisp", position = 2027L)
    public static SubLObject set_pph_agreement_internal(final SubLObject params, final SubLObject value) {
        assert pph_parameter_declarations.NIL != pph_utilities.valid_external_pph_nl_predsP(value) : value;
        assert pph_parameter_declarations.NIL != nl_generation_api.pph_mutable_api_params_p(params) : params;
        pph_parameter_declaration.set_pph_parameter_value(params, (SubLObject)pph_parameter_declarations.$kw35$PPH_AGREEMENT, value);
        return params;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-parameter-declarations.lisp", position = 2027L)
    public static SubLObject set_pph_agreement(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject params_form = (SubLObject)pph_parameter_declarations.NIL;
        SubLObject value = (SubLObject)pph_parameter_declarations.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)pph_parameter_declarations.$list5);
        params_form = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)pph_parameter_declarations.$list5);
        value = current.first();
        current = current.rest();
        if (pph_parameter_declarations.NIL == current) {
            final SubLObject params = (SubLObject)pph_parameter_declarations.$sym36$PARAMS;
            return pph_parameter_declaration.pph_parameter_setter_body(params_form, params, value, (SubLObject)pph_parameter_declarations.$sym32$SET_PPH_AGREEMENT_INTERNAL);
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)pph_parameter_declarations.$list5);
        return (SubLObject)pph_parameter_declarations.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-parameter-declarations.lisp", position = 2349L)
    public static SubLObject set_pph_sentential_force_internal(final SubLObject params, final SubLObject value) {
        assert pph_parameter_declarations.NIL != pph_speech_act.pph_force_p(value) : value;
        assert pph_parameter_declarations.NIL != nl_generation_api.pph_mutable_api_params_p(params) : params;
        pph_parameter_declaration.set_pph_parameter_value(params, (SubLObject)pph_parameter_declarations.$kw41$PPH_SENTENTIAL_FORCE, value);
        return params;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-parameter-declarations.lisp", position = 2349L)
    public static SubLObject set_pph_sentential_force(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject params_form = (SubLObject)pph_parameter_declarations.NIL;
        SubLObject value = (SubLObject)pph_parameter_declarations.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)pph_parameter_declarations.$list5);
        params_form = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)pph_parameter_declarations.$list5);
        value = current.first();
        current = current.rest();
        if (pph_parameter_declarations.NIL == current) {
            final SubLObject params = (SubLObject)pph_parameter_declarations.$sym42$PARAMS;
            return pph_parameter_declaration.pph_parameter_setter_body(params_form, params, value, (SubLObject)pph_parameter_declarations.$sym38$SET_PPH_SENTENTIAL_FORCE_INTERNAL);
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)pph_parameter_declarations.$list5);
        return (SubLObject)pph_parameter_declarations.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-parameter-declarations.lisp", position = 2645L)
    public static SubLObject set_pph_timeout_internal(final SubLObject params, final SubLObject value) {
        assert pph_parameter_declarations.NIL != number_utilities.positive_potentially_infinite_integer_p(value) : value;
        assert pph_parameter_declarations.NIL != nl_generation_api.pph_mutable_api_params_p(params) : params;
        pph_parameter_declaration.set_pph_parameter_value(params, (SubLObject)pph_parameter_declarations.$kw46$PPH_TIMEOUT, value);
        return params;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-parameter-declarations.lisp", position = 2645L)
    public static SubLObject set_pph_timeout(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject params_form = (SubLObject)pph_parameter_declarations.NIL;
        SubLObject value = (SubLObject)pph_parameter_declarations.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)pph_parameter_declarations.$list5);
        params_form = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)pph_parameter_declarations.$list5);
        value = current.first();
        current = current.rest();
        if (pph_parameter_declarations.NIL == current) {
            final SubLObject params = (SubLObject)pph_parameter_declarations.$sym47$PARAMS;
            return pph_parameter_declaration.pph_parameter_setter_body(params_form, params, value, (SubLObject)pph_parameter_declarations.$sym44$SET_PPH_TIMEOUT_INTERNAL);
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)pph_parameter_declarations.$list5);
        return (SubLObject)pph_parameter_declarations.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-parameter-declarations.lisp", position = 2955L)
    public static SubLObject top_level_pph_api_param_p(final SubLObject param_name) {
        return Equality.eq((SubLObject)pph_parameter_declarations.$kw49$TOP_LEVEL, pph_parameter_declaration.get_pph_param_type(param_name));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-parameter-declarations.lisp", position = 3070L)
    public static SubLObject top_level_pph_api_param_list_p(final SubLObject v_object) {
        return list_utilities.plist_of_type_p(v_object, (SubLObject)pph_parameter_declarations.$sym50$TOP_LEVEL_PPH_API_PARAM_P);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-parameter-declarations.lisp", position = 3303L)
    public static SubLObject set_max_digits_without_comma_internal(final SubLObject params, final SubLObject value) {
        assert pph_parameter_declarations.NIL != number_utilities.positive_potentially_infinite_integer_p(value) : value;
        assert pph_parameter_declarations.NIL != nl_generation_api.pph_mutable_api_params_p(params) : params;
        pph_parameter_declaration.set_pph_parameter_value(params, (SubLObject)pph_parameter_declarations.$kw53$MAX_DIGITS_WITHOUT_COMMA, value);
        return params;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-parameter-declarations.lisp", position = 3303L)
    public static SubLObject set_max_digits_without_comma(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject params_form = (SubLObject)pph_parameter_declarations.NIL;
        SubLObject value = (SubLObject)pph_parameter_declarations.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)pph_parameter_declarations.$list5);
        params_form = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)pph_parameter_declarations.$list5);
        value = current.first();
        current = current.rest();
        if (pph_parameter_declarations.NIL == current) {
            final SubLObject params = (SubLObject)pph_parameter_declarations.$sym54$PARAMS;
            return pph_parameter_declaration.pph_parameter_setter_body(params_form, params, value, (SubLObject)pph_parameter_declarations.$sym51$SET_MAX_DIGITS_WITHOUT_COMMA_INTERNAL);
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)pph_parameter_declarations.$list5);
        return (SubLObject)pph_parameter_declarations.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-parameter-declarations.lisp", position = 3579L)
    public static SubLObject set_significant_digits_cutoff_internal(final SubLObject params, final SubLObject value) {
        assert pph_parameter_declarations.NIL != number_utilities.positive_potentially_infinite_integer_p(value) : value;
        assert pph_parameter_declarations.NIL != nl_generation_api.pph_mutable_api_params_p(params) : params;
        pph_parameter_declaration.set_pph_parameter_value(params, (SubLObject)pph_parameter_declarations.$kw58$SIGNIFICANT_DIGITS_CUTOFF, value);
        return params;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-parameter-declarations.lisp", position = 3579L)
    public static SubLObject set_significant_digits_cutoff(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject params_form = (SubLObject)pph_parameter_declarations.NIL;
        SubLObject value = (SubLObject)pph_parameter_declarations.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)pph_parameter_declarations.$list5);
        params_form = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)pph_parameter_declarations.$list5);
        value = current.first();
        current = current.rest();
        if (pph_parameter_declarations.NIL == current) {
            final SubLObject params = (SubLObject)pph_parameter_declarations.$sym59$PARAMS;
            return pph_parameter_declaration.pph_parameter_setter_body(params_form, params, value, (SubLObject)pph_parameter_declarations.$sym56$SET_SIGNIFICANT_DIGITS_CUTOFF_INTERNAL);
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)pph_parameter_declarations.$list5);
        return (SubLObject)pph_parameter_declarations.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-parameter-declarations.lisp", position = 3860L)
    public static SubLObject set_use_indexical_datesP_internal(final SubLObject params, final SubLObject value) {
        assert pph_parameter_declarations.NIL != Types.booleanp(value) : value;
        assert pph_parameter_declarations.NIL != nl_generation_api.pph_mutable_api_params_p(params) : params;
        pph_parameter_declaration.set_pph_parameter_value(params, (SubLObject)pph_parameter_declarations.$kw64$USE_INDEXICAL_DATES_, value);
        return params;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-parameter-declarations.lisp", position = 3860L)
    public static SubLObject set_use_indexical_datesP(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject params_form = (SubLObject)pph_parameter_declarations.NIL;
        SubLObject value = (SubLObject)pph_parameter_declarations.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)pph_parameter_declarations.$list5);
        params_form = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)pph_parameter_declarations.$list5);
        value = current.first();
        current = current.rest();
        if (pph_parameter_declarations.NIL == current) {
            final SubLObject params = (SubLObject)pph_parameter_declarations.$sym65$PARAMS;
            return pph_parameter_declaration.pph_parameter_setter_body(params_form, params, value, (SubLObject)pph_parameter_declarations.$sym61$SET_USE_INDEXICAL_DATES__INTERNAL);
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)pph_parameter_declarations.$list5);
        return (SubLObject)pph_parameter_declarations.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-parameter-declarations.lisp", position = 4090L)
    public static SubLObject pph_format_param_p(final SubLObject param_name) {
        return Equality.eq(pph_parameter_declaration.get_pph_param_type(param_name), (SubLObject)pph_parameter_declarations.$kw67$PPH_FORMAT);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-parameter-declarations.lisp", position = 4196L)
    public static SubLObject pph_format_param_list_p(final SubLObject v_object) {
        return list_utilities.plist_of_type_p(v_object, (SubLObject)pph_parameter_declarations.$sym68$PPH_FORMAT_PARAM_P);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-parameter-declarations.lisp", position = 4299L)
    public static SubLObject set_demerit_cutoff_internal(final SubLObject params, final SubLObject value) {
        assert pph_parameter_declarations.NIL != number_utilities.non_negative_potentially_infinite_number_p(value) : value;
        assert pph_parameter_declarations.NIL != nl_generation_api.pph_mutable_api_params_p(params) : params;
        pph_parameter_declaration.set_pph_parameter_value(params, (SubLObject)pph_parameter_declarations.$kw72$DEMERIT_CUTOFF, value);
        return params;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-parameter-declarations.lisp", position = 4299L)
    public static SubLObject set_demerit_cutoff(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject params_form = (SubLObject)pph_parameter_declarations.NIL;
        SubLObject value = (SubLObject)pph_parameter_declarations.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)pph_parameter_declarations.$list5);
        params_form = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)pph_parameter_declarations.$list5);
        value = current.first();
        current = current.rest();
        if (pph_parameter_declarations.NIL == current) {
            final SubLObject params = (SubLObject)pph_parameter_declarations.$sym73$PARAMS;
            return pph_parameter_declaration.pph_parameter_setter_body(params_form, params, value, (SubLObject)pph_parameter_declarations.$sym69$SET_DEMERIT_CUTOFF_INTERNAL);
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)pph_parameter_declarations.$list5);
        return (SubLObject)pph_parameter_declarations.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-parameter-declarations.lisp", position = 4758L)
    public static SubLObject set_use_smart_variable_replacementP_internal(final SubLObject params, final SubLObject value) {
        assert pph_parameter_declarations.NIL != Types.booleanp(value) : value;
        assert pph_parameter_declarations.NIL != nl_generation_api.pph_mutable_api_params_p(params) : params;
        pph_parameter_declaration.set_pph_parameter_value(params, (SubLObject)pph_parameter_declarations.$kw77$USE_SMART_VARIABLE_REPLACEMENT_, value);
        return params;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-parameter-declarations.lisp", position = 4758L)
    public static SubLObject set_use_smart_variable_replacementP(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject params_form = (SubLObject)pph_parameter_declarations.NIL;
        SubLObject value = (SubLObject)pph_parameter_declarations.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)pph_parameter_declarations.$list5);
        params_form = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)pph_parameter_declarations.$list5);
        value = current.first();
        current = current.rest();
        if (pph_parameter_declarations.NIL == current) {
            final SubLObject params = (SubLObject)pph_parameter_declarations.$sym78$PARAMS;
            return pph_parameter_declaration.pph_parameter_setter_body(params_form, params, value, (SubLObject)pph_parameter_declarations.$sym75$SET_USE_SMART_VARIABLE_REPLACEMENT__INTERNAL);
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)pph_parameter_declarations.$list5);
        return (SubLObject)pph_parameter_declarations.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-parameter-declarations.lisp", position = 5068L)
    public static SubLObject set_genlpreds_backoff_limit_internal(final SubLObject params, final SubLObject value) {
        assert pph_parameter_declarations.NIL != subl_promotions.non_negative_integer_p(value) : value;
        assert pph_parameter_declarations.NIL != nl_generation_api.pph_mutable_api_params_p(params) : params;
        pph_parameter_declaration.set_pph_parameter_value(params, (SubLObject)pph_parameter_declarations.$kw83$GENLPREDS_BACKOFF_LIMIT, value);
        return params;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-parameter-declarations.lisp", position = 5068L)
    public static SubLObject set_genlpreds_backoff_limit(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject params_form = (SubLObject)pph_parameter_declarations.NIL;
        SubLObject value = (SubLObject)pph_parameter_declarations.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)pph_parameter_declarations.$list5);
        params_form = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)pph_parameter_declarations.$list5);
        value = current.first();
        current = current.rest();
        if (pph_parameter_declarations.NIL == current) {
            final SubLObject params = (SubLObject)pph_parameter_declarations.$sym84$PARAMS;
            return pph_parameter_declaration.pph_parameter_setter_body(params_form, params, value, (SubLObject)pph_parameter_declarations.$sym80$SET_GENLPREDS_BACKOFF_LIMIT_INTERNAL);
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)pph_parameter_declarations.$list5);
        return (SubLObject)pph_parameter_declarations.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-parameter-declarations.lisp", position = 5438L)
    public static SubLObject pph_goodness_param_p(final SubLObject param_name) {
        return Equality.eq(pph_parameter_declaration.get_pph_param_type(param_name), (SubLObject)pph_parameter_declarations.$kw86$PPH_GOODNESS);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-parameter-declarations.lisp", position = 5548L)
    public static SubLObject pph_goodness_param_list_p(final SubLObject v_object) {
        return list_utilities.plist_of_type_p(v_object, (SubLObject)pph_parameter_declarations.$sym87$PPH_GOODNESS_PARAM_P);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-parameter-declarations.lisp", position = 5656L)
    public static SubLObject set_prefer_terse_paraphraseP_internal(final SubLObject params, final SubLObject value) {
        assert pph_parameter_declarations.NIL != Types.booleanp(value) : value;
        assert pph_parameter_declarations.NIL != nl_generation_api.pph_mutable_api_params_p(params) : params;
        pph_parameter_declaration.set_pph_parameter_value(params, (SubLObject)pph_parameter_declarations.$kw90$PREFER_TERSE_PARAPHRASE_, value);
        return params;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-parameter-declarations.lisp", position = 5656L)
    public static SubLObject set_prefer_terse_paraphraseP(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject params_form = (SubLObject)pph_parameter_declarations.NIL;
        SubLObject value = (SubLObject)pph_parameter_declarations.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)pph_parameter_declarations.$list5);
        params_form = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)pph_parameter_declarations.$list5);
        value = current.first();
        current = current.rest();
        if (pph_parameter_declarations.NIL == current) {
            final SubLObject params = (SubLObject)pph_parameter_declarations.$sym91$PARAMS;
            return pph_parameter_declaration.pph_parameter_setter_body(params_form, params, value, (SubLObject)pph_parameter_declarations.$sym88$SET_PREFER_TERSE_PARAPHRASE__INTERNAL);
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)pph_parameter_declarations.$list5);
        return (SubLObject)pph_parameter_declarations.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-parameter-declarations.lisp", position = 5856L)
    public static SubLObject set_maximize_linksP_internal(final SubLObject params, final SubLObject value) {
        assert pph_parameter_declarations.NIL != Types.booleanp(value) : value;
        assert pph_parameter_declarations.NIL != nl_generation_api.pph_mutable_api_params_p(params) : params;
        pph_parameter_declaration.set_pph_parameter_value(params, (SubLObject)pph_parameter_declarations.$kw95$MAXIMIZE_LINKS_, value);
        return params;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-parameter-declarations.lisp", position = 5856L)
    public static SubLObject set_maximize_linksP(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject params_form = (SubLObject)pph_parameter_declarations.NIL;
        SubLObject value = (SubLObject)pph_parameter_declarations.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)pph_parameter_declarations.$list5);
        params_form = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)pph_parameter_declarations.$list5);
        value = current.first();
        current = current.rest();
        if (pph_parameter_declarations.NIL == current) {
            final SubLObject params = (SubLObject)pph_parameter_declarations.$sym96$PARAMS;
            return pph_parameter_declaration.pph_parameter_setter_body(params_form, params, value, (SubLObject)pph_parameter_declarations.$sym93$SET_MAXIMIZE_LINKS__INTERNAL);
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)pph_parameter_declarations.$list5);
        return (SubLObject)pph_parameter_declarations.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-parameter-declarations.lisp", position = 6147L)
    public static SubLObject pph_precision_param_p(final SubLObject param_name) {
        return Equality.eq(pph_parameter_declaration.get_pph_param_type(param_name), (SubLObject)pph_parameter_declarations.$kw98$PPH_PRECISION);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-parameter-declarations.lisp", position = 6259L)
    public static SubLObject pph_precision_param_list_p(final SubLObject v_object) {
        return list_utilities.plist_of_type_p(v_object, (SubLObject)pph_parameter_declarations.$sym99$PPH_PRECISION_PARAM_P);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-parameter-declarations.lisp", position = 6369L)
    public static SubLObject pph_formality_param_p(final SubLObject param_name) {
        return Equality.eq(pph_parameter_declaration.get_pph_param_type(param_name), (SubLObject)pph_parameter_declarations.$kw100$PPH_FORMALITY);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-parameter-declarations.lisp", position = 6482L)
    public static SubLObject pph_formality_param_list_p(final SubLObject v_object) {
        return list_utilities.plist_of_type_p(v_object, (SubLObject)pph_parameter_declarations.$sym101$PPH_FORMALITY_PARAM_P);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-parameter-declarations.lisp", position = 6592L)
    public static SubLObject set_use_title_capitalizationP_internal(final SubLObject params, final SubLObject value) {
        assert pph_parameter_declarations.NIL != Types.booleanp(value) : value;
        assert pph_parameter_declarations.NIL != nl_generation_api.pph_mutable_api_params_p(params) : params;
        pph_parameter_declaration.set_pph_parameter_value(params, (SubLObject)pph_parameter_declarations.$kw104$USE_TITLE_CAPITALIZATION_, value);
        return params;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-parameter-declarations.lisp", position = 6592L)
    public static SubLObject set_use_title_capitalizationP(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject params_form = (SubLObject)pph_parameter_declarations.NIL;
        SubLObject value = (SubLObject)pph_parameter_declarations.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)pph_parameter_declarations.$list5);
        params_form = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)pph_parameter_declarations.$list5);
        value = current.first();
        current = current.rest();
        if (pph_parameter_declarations.NIL == current) {
            final SubLObject params = (SubLObject)pph_parameter_declarations.$sym105$PARAMS;
            return pph_parameter_declaration.pph_parameter_setter_body(params_form, params, value, (SubLObject)pph_parameter_declarations.$sym102$SET_USE_TITLE_CAPITALIZATION__INTERNAL);
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)pph_parameter_declarations.$list5);
        return (SubLObject)pph_parameter_declarations.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-parameter-declarations.lisp", position = 6825L)
    public static SubLObject set_add_determiners_before_variablesP_internal(final SubLObject params, final SubLObject value) {
        assert pph_parameter_declarations.NIL != Types.booleanp(value) : value;
        assert pph_parameter_declarations.NIL != nl_generation_api.pph_mutable_api_params_p(params) : params;
        pph_parameter_declaration.set_pph_parameter_value(params, (SubLObject)pph_parameter_declarations.$kw109$ADD_DETERMINERS_BEFORE_VARIABLES_, value);
        return params;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-parameter-declarations.lisp", position = 6825L)
    public static SubLObject set_add_determiners_before_variablesP(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject params_form = (SubLObject)pph_parameter_declarations.NIL;
        SubLObject value = (SubLObject)pph_parameter_declarations.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)pph_parameter_declarations.$list5);
        params_form = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)pph_parameter_declarations.$list5);
        value = current.first();
        current = current.rest();
        if (pph_parameter_declarations.NIL == current) {
            final SubLObject params = (SubLObject)pph_parameter_declarations.$sym110$PARAMS;
            return pph_parameter_declaration.pph_parameter_setter_body(params_form, params, value, (SubLObject)pph_parameter_declarations.$sym107$SET_ADD_DETERMINERS_BEFORE_VARIABLES__INTERNAL);
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)pph_parameter_declarations.$list5);
        return (SubLObject)pph_parameter_declarations.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-parameter-declarations.lisp", position = 7072L)
    public static SubLObject set_quantify_variablesP_internal(final SubLObject params, final SubLObject value) {
        assert pph_parameter_declarations.NIL != Types.booleanp(value) : value;
        assert pph_parameter_declarations.NIL != nl_generation_api.pph_mutable_api_params_p(params) : params;
        pph_parameter_declaration.set_pph_parameter_value(params, (SubLObject)pph_parameter_declarations.$kw114$QUANTIFY_VARIABLES_, value);
        return params;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-parameter-declarations.lisp", position = 7072L)
    public static SubLObject set_quantify_variablesP(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject params_form = (SubLObject)pph_parameter_declarations.NIL;
        SubLObject value = (SubLObject)pph_parameter_declarations.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)pph_parameter_declarations.$list5);
        params_form = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)pph_parameter_declarations.$list5);
        value = current.first();
        current = current.rest();
        if (pph_parameter_declarations.NIL == current) {
            final SubLObject params = (SubLObject)pph_parameter_declarations.$sym115$PARAMS;
            return pph_parameter_declaration.pph_parameter_setter_body(params_form, params, value, (SubLObject)pph_parameter_declarations.$sym112$SET_QUANTIFY_VARIABLES__INTERNAL);
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)pph_parameter_declarations.$list5);
        return (SubLObject)pph_parameter_declarations.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-parameter-declarations.lisp", position = 7334L)
    public static SubLObject set_hide_explicit_universalsP_internal(final SubLObject params, final SubLObject value) {
        assert pph_parameter_declarations.NIL != Types.booleanp(value) : value;
        assert pph_parameter_declarations.NIL != nl_generation_api.pph_mutable_api_params_p(params) : params;
        pph_parameter_declaration.set_pph_parameter_value(params, (SubLObject)pph_parameter_declarations.$kw119$HIDE_EXPLICIT_UNIVERSALS_, value);
        return params;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-parameter-declarations.lisp", position = 7334L)
    public static SubLObject set_hide_explicit_universalsP(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject params_form = (SubLObject)pph_parameter_declarations.NIL;
        SubLObject value = (SubLObject)pph_parameter_declarations.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)pph_parameter_declarations.$list5);
        params_form = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)pph_parameter_declarations.$list5);
        value = current.first();
        current = current.rest();
        if (pph_parameter_declarations.NIL == current) {
            final SubLObject params = (SubLObject)pph_parameter_declarations.$sym120$PARAMS;
            return pph_parameter_declaration.pph_parameter_setter_body(params_form, params, value, (SubLObject)pph_parameter_declarations.$sym117$SET_HIDE_EXPLICIT_UNIVERSALS__INTERNAL);
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)pph_parameter_declarations.$list5);
        return (SubLObject)pph_parameter_declarations.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-parameter-declarations.lisp", position = 7552L)
    public static SubLObject pph_misc_param_p(final SubLObject param_name) {
        return Equality.eq(pph_parameter_declaration.get_pph_param_type(param_name), (SubLObject)pph_parameter_declarations.$kw122$PPH_MISC);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/pph-parameter-declarations.lisp", position = 7654L)
    public static SubLObject pph_misc_param_list_p(final SubLObject v_object) {
        return list_utilities.plist_of_type_p(v_object, (SubLObject)pph_parameter_declarations.$sym123$PPH_MISC_PARAM_P);
    }
    
    public static SubLObject declare_pph_parameter_declarations_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_parameter_declarations", "set_pph_lexical_context_internal", "SET-PPH-LEXICAL-CONTEXT-INTERNAL", 2, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.pph_parameter_declarations", "set_pph_lexical_context", "SET-PPH-LEXICAL-CONTEXT");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_parameter_declarations", "set_pph_semantic_mt_internal", "SET-PPH-SEMANTIC-MT-INTERNAL", 2, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.pph_parameter_declarations", "set_pph_semantic_mt", "SET-PPH-SEMANTIC-MT");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_parameter_declarations", "set_pph_background_discourse_internal", "SET-PPH-BACKGROUND-DISCOURSE-INTERNAL", 2, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.pph_parameter_declarations", "set_pph_background_discourse", "SET-PPH-BACKGROUND-DISCOURSE");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_parameter_declarations", "set_pph_discourse_contexts_to_update_internal", "SET-PPH-DISCOURSE-CONTEXTS-TO-UPDATE-INTERNAL", 2, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.pph_parameter_declarations", "set_pph_discourse_contexts_to_update", "SET-PPH-DISCOURSE-CONTEXTS-TO-UPDATE");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_parameter_declarations", "set_pph_generation_count_internal", "SET-PPH-GENERATION-COUNT-INTERNAL", 2, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.pph_parameter_declarations", "set_pph_generation_count", "SET-PPH-GENERATION-COUNT");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_parameter_declarations", "set_pph_agreement_internal", "SET-PPH-AGREEMENT-INTERNAL", 2, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.pph_parameter_declarations", "set_pph_agreement", "SET-PPH-AGREEMENT");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_parameter_declarations", "set_pph_sentential_force_internal", "SET-PPH-SENTENTIAL-FORCE-INTERNAL", 2, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.pph_parameter_declarations", "set_pph_sentential_force", "SET-PPH-SENTENTIAL-FORCE");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_parameter_declarations", "set_pph_timeout_internal", "SET-PPH-TIMEOUT-INTERNAL", 2, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.pph_parameter_declarations", "set_pph_timeout", "SET-PPH-TIMEOUT");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_parameter_declarations", "top_level_pph_api_param_p", "TOP-LEVEL-PPH-API-PARAM-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_parameter_declarations", "top_level_pph_api_param_list_p", "TOP-LEVEL-PPH-API-PARAM-LIST-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_parameter_declarations", "set_max_digits_without_comma_internal", "SET-MAX-DIGITS-WITHOUT-COMMA-INTERNAL", 2, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.pph_parameter_declarations", "set_max_digits_without_comma", "SET-MAX-DIGITS-WITHOUT-COMMA");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_parameter_declarations", "set_significant_digits_cutoff_internal", "SET-SIGNIFICANT-DIGITS-CUTOFF-INTERNAL", 2, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.pph_parameter_declarations", "set_significant_digits_cutoff", "SET-SIGNIFICANT-DIGITS-CUTOFF");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_parameter_declarations", "set_use_indexical_datesP_internal", "SET-USE-INDEXICAL-DATES?-INTERNAL", 2, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.pph_parameter_declarations", "set_use_indexical_datesP", "SET-USE-INDEXICAL-DATES?");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_parameter_declarations", "pph_format_param_p", "PPH-FORMAT-PARAM-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_parameter_declarations", "pph_format_param_list_p", "PPH-FORMAT-PARAM-LIST-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_parameter_declarations", "set_demerit_cutoff_internal", "SET-DEMERIT-CUTOFF-INTERNAL", 2, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.pph_parameter_declarations", "set_demerit_cutoff", "SET-DEMERIT-CUTOFF");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_parameter_declarations", "set_use_smart_variable_replacementP_internal", "SET-USE-SMART-VARIABLE-REPLACEMENT?-INTERNAL", 2, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.pph_parameter_declarations", "set_use_smart_variable_replacementP", "SET-USE-SMART-VARIABLE-REPLACEMENT?");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_parameter_declarations", "set_genlpreds_backoff_limit_internal", "SET-GENLPREDS-BACKOFF-LIMIT-INTERNAL", 2, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.pph_parameter_declarations", "set_genlpreds_backoff_limit", "SET-GENLPREDS-BACKOFF-LIMIT");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_parameter_declarations", "pph_goodness_param_p", "PPH-GOODNESS-PARAM-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_parameter_declarations", "pph_goodness_param_list_p", "PPH-GOODNESS-PARAM-LIST-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_parameter_declarations", "set_prefer_terse_paraphraseP_internal", "SET-PREFER-TERSE-PARAPHRASE?-INTERNAL", 2, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.pph_parameter_declarations", "set_prefer_terse_paraphraseP", "SET-PREFER-TERSE-PARAPHRASE?");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_parameter_declarations", "set_maximize_linksP_internal", "SET-MAXIMIZE-LINKS?-INTERNAL", 2, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.pph_parameter_declarations", "set_maximize_linksP", "SET-MAXIMIZE-LINKS?");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_parameter_declarations", "pph_precision_param_p", "PPH-PRECISION-PARAM-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_parameter_declarations", "pph_precision_param_list_p", "PPH-PRECISION-PARAM-LIST-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_parameter_declarations", "pph_formality_param_p", "PPH-FORMALITY-PARAM-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_parameter_declarations", "pph_formality_param_list_p", "PPH-FORMALITY-PARAM-LIST-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_parameter_declarations", "set_use_title_capitalizationP_internal", "SET-USE-TITLE-CAPITALIZATION?-INTERNAL", 2, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.pph_parameter_declarations", "set_use_title_capitalizationP", "SET-USE-TITLE-CAPITALIZATION?");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_parameter_declarations", "set_add_determiners_before_variablesP_internal", "SET-ADD-DETERMINERS-BEFORE-VARIABLES?-INTERNAL", 2, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.pph_parameter_declarations", "set_add_determiners_before_variablesP", "SET-ADD-DETERMINERS-BEFORE-VARIABLES?");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_parameter_declarations", "set_quantify_variablesP_internal", "SET-QUANTIFY-VARIABLES?-INTERNAL", 2, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.pph_parameter_declarations", "set_quantify_variablesP", "SET-QUANTIFY-VARIABLES?");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_parameter_declarations", "set_hide_explicit_universalsP_internal", "SET-HIDE-EXPLICIT-UNIVERSALS?-INTERNAL", 2, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.pph_parameter_declarations", "set_hide_explicit_universalsP", "SET-HIDE-EXPLICIT-UNIVERSALS?");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_parameter_declarations", "pph_misc_param_p", "PPH-MISC-PARAM-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.pph_parameter_declarations", "pph_misc_param_list_p", "PPH-MISC-PARAM-LIST-P", 1, 0, false);
        return (SubLObject)pph_parameter_declarations.NIL;
    }
    
    public static SubLObject init_pph_parameter_declarations_file() {
        return (SubLObject)pph_parameter_declarations.NIL;
    }
    
    public static SubLObject setup_pph_parameter_declarations_file() {
        access_macros.register_macro_helper((SubLObject)pph_parameter_declarations.$sym0$SET_PPH_LEXICAL_CONTEXT_INTERNAL, (SubLObject)pph_parameter_declarations.$sym1$SET_PPH_LEXICAL_CONTEXT);
        access_macros.register_external_symbol((SubLObject)pph_parameter_declarations.$sym1$SET_PPH_LEXICAL_CONTEXT);
        SubLObject v_properties = (SubLObject)pph_parameter_declarations.$list7;
        v_properties = conses_high.putf(v_properties, (SubLObject)pph_parameter_declarations.$kw8$SETTER, pph_parameter_declaration.pph_parameter_setter_name((SubLObject)pph_parameter_declarations.$kw4$PPH_LEXICAL_CONTEXT));
        pph_parameter_declaration.validate_pph_parameter_declaration((SubLObject)pph_parameter_declarations.$kw4$PPH_LEXICAL_CONTEXT, v_properties);
        pph_parameter_declaration.enter_pph_parameter_declaration((SubLObject)pph_parameter_declarations.$kw4$PPH_LEXICAL_CONTEXT, v_properties);
        access_macros.register_macro_helper((SubLObject)pph_parameter_declarations.$sym9$SET_PPH_SEMANTIC_MT_INTERNAL, (SubLObject)pph_parameter_declarations.$sym10$SET_PPH_SEMANTIC_MT);
        access_macros.register_external_symbol((SubLObject)pph_parameter_declarations.$sym10$SET_PPH_SEMANTIC_MT);
        v_properties = (SubLObject)pph_parameter_declarations.$list14;
        v_properties = conses_high.putf(v_properties, (SubLObject)pph_parameter_declarations.$kw8$SETTER, pph_parameter_declaration.pph_parameter_setter_name((SubLObject)pph_parameter_declarations.$kw12$PPH_SEMANTIC_MT));
        pph_parameter_declaration.validate_pph_parameter_declaration((SubLObject)pph_parameter_declarations.$kw12$PPH_SEMANTIC_MT, v_properties);
        pph_parameter_declaration.enter_pph_parameter_declaration((SubLObject)pph_parameter_declarations.$kw12$PPH_SEMANTIC_MT, v_properties);
        access_macros.register_macro_helper((SubLObject)pph_parameter_declarations.$sym15$SET_PPH_BACKGROUND_DISCOURSE_INTERNAL, (SubLObject)pph_parameter_declarations.$sym16$SET_PPH_BACKGROUND_DISCOURSE);
        access_macros.register_external_symbol((SubLObject)pph_parameter_declarations.$sym16$SET_PPH_BACKGROUND_DISCOURSE);
        v_properties = (SubLObject)pph_parameter_declarations.$list20;
        v_properties = conses_high.putf(v_properties, (SubLObject)pph_parameter_declarations.$kw8$SETTER, pph_parameter_declaration.pph_parameter_setter_name((SubLObject)pph_parameter_declarations.$kw18$PPH_BACKGROUND_DISCOURSE));
        pph_parameter_declaration.validate_pph_parameter_declaration((SubLObject)pph_parameter_declarations.$kw18$PPH_BACKGROUND_DISCOURSE, v_properties);
        pph_parameter_declaration.enter_pph_parameter_declaration((SubLObject)pph_parameter_declarations.$kw18$PPH_BACKGROUND_DISCOURSE, v_properties);
        access_macros.register_macro_helper((SubLObject)pph_parameter_declarations.$sym21$SET_PPH_DISCOURSE_CONTEXTS_TO_UPDATE_INTERNAL, (SubLObject)pph_parameter_declarations.$sym22$SET_PPH_DISCOURSE_CONTEXTS_TO_UPDATE);
        access_macros.register_external_symbol((SubLObject)pph_parameter_declarations.$sym22$SET_PPH_DISCOURSE_CONTEXTS_TO_UPDATE);
        v_properties = (SubLObject)pph_parameter_declarations.$list25;
        v_properties = conses_high.putf(v_properties, (SubLObject)pph_parameter_declarations.$kw8$SETTER, pph_parameter_declaration.pph_parameter_setter_name((SubLObject)pph_parameter_declarations.$kw23$PPH_DISCOURSE_CONTEXTS_TO_UPDATE));
        pph_parameter_declaration.validate_pph_parameter_declaration((SubLObject)pph_parameter_declarations.$kw23$PPH_DISCOURSE_CONTEXTS_TO_UPDATE, v_properties);
        pph_parameter_declaration.enter_pph_parameter_declaration((SubLObject)pph_parameter_declarations.$kw23$PPH_DISCOURSE_CONTEXTS_TO_UPDATE, v_properties);
        access_macros.register_macro_helper((SubLObject)pph_parameter_declarations.$sym26$SET_PPH_GENERATION_COUNT_INTERNAL, (SubLObject)pph_parameter_declarations.$sym27$SET_PPH_GENERATION_COUNT);
        access_macros.register_external_symbol((SubLObject)pph_parameter_declarations.$sym27$SET_PPH_GENERATION_COUNT);
        v_properties = (SubLObject)pph_parameter_declarations.$list31;
        v_properties = conses_high.putf(v_properties, (SubLObject)pph_parameter_declarations.$kw8$SETTER, pph_parameter_declaration.pph_parameter_setter_name((SubLObject)pph_parameter_declarations.$kw29$PPH_GENERATION_COUNT));
        pph_parameter_declaration.validate_pph_parameter_declaration((SubLObject)pph_parameter_declarations.$kw29$PPH_GENERATION_COUNT, v_properties);
        pph_parameter_declaration.enter_pph_parameter_declaration((SubLObject)pph_parameter_declarations.$kw29$PPH_GENERATION_COUNT, v_properties);
        access_macros.register_macro_helper((SubLObject)pph_parameter_declarations.$sym32$SET_PPH_AGREEMENT_INTERNAL, (SubLObject)pph_parameter_declarations.$sym33$SET_PPH_AGREEMENT);
        access_macros.register_external_symbol((SubLObject)pph_parameter_declarations.$sym33$SET_PPH_AGREEMENT);
        v_properties = (SubLObject)pph_parameter_declarations.$list37;
        v_properties = conses_high.putf(v_properties, (SubLObject)pph_parameter_declarations.$kw8$SETTER, pph_parameter_declaration.pph_parameter_setter_name((SubLObject)pph_parameter_declarations.$kw35$PPH_AGREEMENT));
        pph_parameter_declaration.validate_pph_parameter_declaration((SubLObject)pph_parameter_declarations.$kw35$PPH_AGREEMENT, v_properties);
        pph_parameter_declaration.enter_pph_parameter_declaration((SubLObject)pph_parameter_declarations.$kw35$PPH_AGREEMENT, v_properties);
        access_macros.register_macro_helper((SubLObject)pph_parameter_declarations.$sym38$SET_PPH_SENTENTIAL_FORCE_INTERNAL, (SubLObject)pph_parameter_declarations.$sym39$SET_PPH_SENTENTIAL_FORCE);
        access_macros.register_external_symbol((SubLObject)pph_parameter_declarations.$sym39$SET_PPH_SENTENTIAL_FORCE);
        v_properties = (SubLObject)pph_parameter_declarations.$list43;
        v_properties = conses_high.putf(v_properties, (SubLObject)pph_parameter_declarations.$kw8$SETTER, pph_parameter_declaration.pph_parameter_setter_name((SubLObject)pph_parameter_declarations.$kw41$PPH_SENTENTIAL_FORCE));
        pph_parameter_declaration.validate_pph_parameter_declaration((SubLObject)pph_parameter_declarations.$kw41$PPH_SENTENTIAL_FORCE, v_properties);
        pph_parameter_declaration.enter_pph_parameter_declaration((SubLObject)pph_parameter_declarations.$kw41$PPH_SENTENTIAL_FORCE, v_properties);
        access_macros.register_macro_helper((SubLObject)pph_parameter_declarations.$sym44$SET_PPH_TIMEOUT_INTERNAL, (SubLObject)pph_parameter_declarations.$sym45$SET_PPH_TIMEOUT);
        access_macros.register_external_symbol((SubLObject)pph_parameter_declarations.$sym45$SET_PPH_TIMEOUT);
        v_properties = (SubLObject)pph_parameter_declarations.$list48;
        v_properties = conses_high.putf(v_properties, (SubLObject)pph_parameter_declarations.$kw8$SETTER, pph_parameter_declaration.pph_parameter_setter_name((SubLObject)pph_parameter_declarations.$kw46$PPH_TIMEOUT));
        pph_parameter_declaration.validate_pph_parameter_declaration((SubLObject)pph_parameter_declarations.$kw46$PPH_TIMEOUT, v_properties);
        pph_parameter_declaration.enter_pph_parameter_declaration((SubLObject)pph_parameter_declarations.$kw46$PPH_TIMEOUT, v_properties);
        access_macros.register_macro_helper((SubLObject)pph_parameter_declarations.$sym51$SET_MAX_DIGITS_WITHOUT_COMMA_INTERNAL, (SubLObject)pph_parameter_declarations.$sym52$SET_MAX_DIGITS_WITHOUT_COMMA);
        access_macros.register_external_symbol((SubLObject)pph_parameter_declarations.$sym52$SET_MAX_DIGITS_WITHOUT_COMMA);
        v_properties = (SubLObject)pph_parameter_declarations.$list55;
        v_properties = conses_high.putf(v_properties, (SubLObject)pph_parameter_declarations.$kw8$SETTER, pph_parameter_declaration.pph_parameter_setter_name((SubLObject)pph_parameter_declarations.$kw53$MAX_DIGITS_WITHOUT_COMMA));
        pph_parameter_declaration.validate_pph_parameter_declaration((SubLObject)pph_parameter_declarations.$kw53$MAX_DIGITS_WITHOUT_COMMA, v_properties);
        pph_parameter_declaration.enter_pph_parameter_declaration((SubLObject)pph_parameter_declarations.$kw53$MAX_DIGITS_WITHOUT_COMMA, v_properties);
        access_macros.register_macro_helper((SubLObject)pph_parameter_declarations.$sym56$SET_SIGNIFICANT_DIGITS_CUTOFF_INTERNAL, (SubLObject)pph_parameter_declarations.$sym57$SET_SIGNIFICANT_DIGITS_CUTOFF);
        access_macros.register_external_symbol((SubLObject)pph_parameter_declarations.$sym57$SET_SIGNIFICANT_DIGITS_CUTOFF);
        v_properties = (SubLObject)pph_parameter_declarations.$list60;
        v_properties = conses_high.putf(v_properties, (SubLObject)pph_parameter_declarations.$kw8$SETTER, pph_parameter_declaration.pph_parameter_setter_name((SubLObject)pph_parameter_declarations.$kw58$SIGNIFICANT_DIGITS_CUTOFF));
        pph_parameter_declaration.validate_pph_parameter_declaration((SubLObject)pph_parameter_declarations.$kw58$SIGNIFICANT_DIGITS_CUTOFF, v_properties);
        pph_parameter_declaration.enter_pph_parameter_declaration((SubLObject)pph_parameter_declarations.$kw58$SIGNIFICANT_DIGITS_CUTOFF, v_properties);
        access_macros.register_macro_helper((SubLObject)pph_parameter_declarations.$sym61$SET_USE_INDEXICAL_DATES__INTERNAL, (SubLObject)pph_parameter_declarations.$sym62$SET_USE_INDEXICAL_DATES_);
        access_macros.register_external_symbol((SubLObject)pph_parameter_declarations.$sym62$SET_USE_INDEXICAL_DATES_);
        v_properties = (SubLObject)pph_parameter_declarations.$list66;
        v_properties = conses_high.putf(v_properties, (SubLObject)pph_parameter_declarations.$kw8$SETTER, pph_parameter_declaration.pph_parameter_setter_name((SubLObject)pph_parameter_declarations.$kw64$USE_INDEXICAL_DATES_));
        pph_parameter_declaration.validate_pph_parameter_declaration((SubLObject)pph_parameter_declarations.$kw64$USE_INDEXICAL_DATES_, v_properties);
        pph_parameter_declaration.enter_pph_parameter_declaration((SubLObject)pph_parameter_declarations.$kw64$USE_INDEXICAL_DATES_, v_properties);
        access_macros.register_macro_helper((SubLObject)pph_parameter_declarations.$sym69$SET_DEMERIT_CUTOFF_INTERNAL, (SubLObject)pph_parameter_declarations.$sym70$SET_DEMERIT_CUTOFF);
        access_macros.register_external_symbol((SubLObject)pph_parameter_declarations.$sym70$SET_DEMERIT_CUTOFF);
        v_properties = (SubLObject)pph_parameter_declarations.$list74;
        v_properties = conses_high.putf(v_properties, (SubLObject)pph_parameter_declarations.$kw8$SETTER, pph_parameter_declaration.pph_parameter_setter_name((SubLObject)pph_parameter_declarations.$kw72$DEMERIT_CUTOFF));
        pph_parameter_declaration.validate_pph_parameter_declaration((SubLObject)pph_parameter_declarations.$kw72$DEMERIT_CUTOFF, v_properties);
        pph_parameter_declaration.enter_pph_parameter_declaration((SubLObject)pph_parameter_declarations.$kw72$DEMERIT_CUTOFF, v_properties);
        access_macros.register_macro_helper((SubLObject)pph_parameter_declarations.$sym75$SET_USE_SMART_VARIABLE_REPLACEMENT__INTERNAL, (SubLObject)pph_parameter_declarations.$sym76$SET_USE_SMART_VARIABLE_REPLACEMENT_);
        access_macros.register_external_symbol((SubLObject)pph_parameter_declarations.$sym76$SET_USE_SMART_VARIABLE_REPLACEMENT_);
        v_properties = (SubLObject)pph_parameter_declarations.$list79;
        v_properties = conses_high.putf(v_properties, (SubLObject)pph_parameter_declarations.$kw8$SETTER, pph_parameter_declaration.pph_parameter_setter_name((SubLObject)pph_parameter_declarations.$kw77$USE_SMART_VARIABLE_REPLACEMENT_));
        pph_parameter_declaration.validate_pph_parameter_declaration((SubLObject)pph_parameter_declarations.$kw77$USE_SMART_VARIABLE_REPLACEMENT_, v_properties);
        pph_parameter_declaration.enter_pph_parameter_declaration((SubLObject)pph_parameter_declarations.$kw77$USE_SMART_VARIABLE_REPLACEMENT_, v_properties);
        access_macros.register_macro_helper((SubLObject)pph_parameter_declarations.$sym80$SET_GENLPREDS_BACKOFF_LIMIT_INTERNAL, (SubLObject)pph_parameter_declarations.$sym81$SET_GENLPREDS_BACKOFF_LIMIT);
        access_macros.register_external_symbol((SubLObject)pph_parameter_declarations.$sym81$SET_GENLPREDS_BACKOFF_LIMIT);
        v_properties = (SubLObject)pph_parameter_declarations.$list85;
        v_properties = conses_high.putf(v_properties, (SubLObject)pph_parameter_declarations.$kw8$SETTER, pph_parameter_declaration.pph_parameter_setter_name((SubLObject)pph_parameter_declarations.$kw83$GENLPREDS_BACKOFF_LIMIT));
        pph_parameter_declaration.validate_pph_parameter_declaration((SubLObject)pph_parameter_declarations.$kw83$GENLPREDS_BACKOFF_LIMIT, v_properties);
        pph_parameter_declaration.enter_pph_parameter_declaration((SubLObject)pph_parameter_declarations.$kw83$GENLPREDS_BACKOFF_LIMIT, v_properties);
        access_macros.register_macro_helper((SubLObject)pph_parameter_declarations.$sym88$SET_PREFER_TERSE_PARAPHRASE__INTERNAL, (SubLObject)pph_parameter_declarations.$sym89$SET_PREFER_TERSE_PARAPHRASE_);
        access_macros.register_external_symbol((SubLObject)pph_parameter_declarations.$sym89$SET_PREFER_TERSE_PARAPHRASE_);
        v_properties = (SubLObject)pph_parameter_declarations.$list92;
        v_properties = conses_high.putf(v_properties, (SubLObject)pph_parameter_declarations.$kw8$SETTER, pph_parameter_declaration.pph_parameter_setter_name((SubLObject)pph_parameter_declarations.$kw90$PREFER_TERSE_PARAPHRASE_));
        pph_parameter_declaration.validate_pph_parameter_declaration((SubLObject)pph_parameter_declarations.$kw90$PREFER_TERSE_PARAPHRASE_, v_properties);
        pph_parameter_declaration.enter_pph_parameter_declaration((SubLObject)pph_parameter_declarations.$kw90$PREFER_TERSE_PARAPHRASE_, v_properties);
        access_macros.register_macro_helper((SubLObject)pph_parameter_declarations.$sym93$SET_MAXIMIZE_LINKS__INTERNAL, (SubLObject)pph_parameter_declarations.$sym94$SET_MAXIMIZE_LINKS_);
        access_macros.register_external_symbol((SubLObject)pph_parameter_declarations.$sym94$SET_MAXIMIZE_LINKS_);
        v_properties = (SubLObject)pph_parameter_declarations.$list97;
        v_properties = conses_high.putf(v_properties, (SubLObject)pph_parameter_declarations.$kw8$SETTER, pph_parameter_declaration.pph_parameter_setter_name((SubLObject)pph_parameter_declarations.$kw95$MAXIMIZE_LINKS_));
        pph_parameter_declaration.validate_pph_parameter_declaration((SubLObject)pph_parameter_declarations.$kw95$MAXIMIZE_LINKS_, v_properties);
        pph_parameter_declaration.enter_pph_parameter_declaration((SubLObject)pph_parameter_declarations.$kw95$MAXIMIZE_LINKS_, v_properties);
        access_macros.register_macro_helper((SubLObject)pph_parameter_declarations.$sym102$SET_USE_TITLE_CAPITALIZATION__INTERNAL, (SubLObject)pph_parameter_declarations.$sym103$SET_USE_TITLE_CAPITALIZATION_);
        access_macros.register_external_symbol((SubLObject)pph_parameter_declarations.$sym103$SET_USE_TITLE_CAPITALIZATION_);
        v_properties = (SubLObject)pph_parameter_declarations.$list106;
        v_properties = conses_high.putf(v_properties, (SubLObject)pph_parameter_declarations.$kw8$SETTER, pph_parameter_declaration.pph_parameter_setter_name((SubLObject)pph_parameter_declarations.$kw104$USE_TITLE_CAPITALIZATION_));
        pph_parameter_declaration.validate_pph_parameter_declaration((SubLObject)pph_parameter_declarations.$kw104$USE_TITLE_CAPITALIZATION_, v_properties);
        pph_parameter_declaration.enter_pph_parameter_declaration((SubLObject)pph_parameter_declarations.$kw104$USE_TITLE_CAPITALIZATION_, v_properties);
        access_macros.register_macro_helper((SubLObject)pph_parameter_declarations.$sym107$SET_ADD_DETERMINERS_BEFORE_VARIABLES__INTERNAL, (SubLObject)pph_parameter_declarations.$sym108$SET_ADD_DETERMINERS_BEFORE_VARIABLES_);
        access_macros.register_external_symbol((SubLObject)pph_parameter_declarations.$sym108$SET_ADD_DETERMINERS_BEFORE_VARIABLES_);
        v_properties = (SubLObject)pph_parameter_declarations.$list111;
        v_properties = conses_high.putf(v_properties, (SubLObject)pph_parameter_declarations.$kw8$SETTER, pph_parameter_declaration.pph_parameter_setter_name((SubLObject)pph_parameter_declarations.$kw109$ADD_DETERMINERS_BEFORE_VARIABLES_));
        pph_parameter_declaration.validate_pph_parameter_declaration((SubLObject)pph_parameter_declarations.$kw109$ADD_DETERMINERS_BEFORE_VARIABLES_, v_properties);
        pph_parameter_declaration.enter_pph_parameter_declaration((SubLObject)pph_parameter_declarations.$kw109$ADD_DETERMINERS_BEFORE_VARIABLES_, v_properties);
        access_macros.register_macro_helper((SubLObject)pph_parameter_declarations.$sym112$SET_QUANTIFY_VARIABLES__INTERNAL, (SubLObject)pph_parameter_declarations.$sym113$SET_QUANTIFY_VARIABLES_);
        access_macros.register_external_symbol((SubLObject)pph_parameter_declarations.$sym113$SET_QUANTIFY_VARIABLES_);
        v_properties = (SubLObject)pph_parameter_declarations.$list116;
        v_properties = conses_high.putf(v_properties, (SubLObject)pph_parameter_declarations.$kw8$SETTER, pph_parameter_declaration.pph_parameter_setter_name((SubLObject)pph_parameter_declarations.$kw114$QUANTIFY_VARIABLES_));
        pph_parameter_declaration.validate_pph_parameter_declaration((SubLObject)pph_parameter_declarations.$kw114$QUANTIFY_VARIABLES_, v_properties);
        pph_parameter_declaration.enter_pph_parameter_declaration((SubLObject)pph_parameter_declarations.$kw114$QUANTIFY_VARIABLES_, v_properties);
        access_macros.register_macro_helper((SubLObject)pph_parameter_declarations.$sym117$SET_HIDE_EXPLICIT_UNIVERSALS__INTERNAL, (SubLObject)pph_parameter_declarations.$sym118$SET_HIDE_EXPLICIT_UNIVERSALS_);
        access_macros.register_external_symbol((SubLObject)pph_parameter_declarations.$sym118$SET_HIDE_EXPLICIT_UNIVERSALS_);
        v_properties = (SubLObject)pph_parameter_declarations.$list121;
        v_properties = conses_high.putf(v_properties, (SubLObject)pph_parameter_declarations.$kw8$SETTER, pph_parameter_declaration.pph_parameter_setter_name((SubLObject)pph_parameter_declarations.$kw119$HIDE_EXPLICIT_UNIVERSALS_));
        pph_parameter_declaration.validate_pph_parameter_declaration((SubLObject)pph_parameter_declarations.$kw119$HIDE_EXPLICIT_UNIVERSALS_, v_properties);
        pph_parameter_declaration.enter_pph_parameter_declaration((SubLObject)pph_parameter_declarations.$kw119$HIDE_EXPLICIT_UNIVERSALS_, v_properties);
        return (SubLObject)pph_parameter_declarations.NIL;
    }
    
    public void declareFunctions() {
        declare_pph_parameter_declarations_file();
    }
    
    public void initializeVariables() {
        init_pph_parameter_declarations_file();
    }
    
    public void runTopLevelForms() {
        setup_pph_parameter_declarations_file();
    }
    
    static {
        me = (SubLFile)new pph_parameter_declarations();
        $sym0$SET_PPH_LEXICAL_CONTEXT_INTERNAL = SubLObjectFactory.makeSymbol("SET-PPH-LEXICAL-CONTEXT-INTERNAL");
        $sym1$SET_PPH_LEXICAL_CONTEXT = SubLObjectFactory.makeSymbol("SET-PPH-LEXICAL-CONTEXT");
        $sym2$LEXICAL_CONTEXT_P = SubLObjectFactory.makeSymbol("LEXICAL-CONTEXT-P");
        $sym3$PPH_MUTABLE_API_PARAMS_P = SubLObjectFactory.makeSymbol("PPH-MUTABLE-API-PARAMS-P");
        $kw4$PPH_LEXICAL_CONTEXT = SubLObjectFactory.makeKeyword("PPH-LEXICAL-CONTEXT");
        $list5 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PARAMS-FORM"), (SubLObject)SubLObjectFactory.makeSymbol("VALUE"));
        $sym6$PARAMS = SubLObjectFactory.makeUninternedSymbol("PARAMS");
        $list7 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TYPE"), (SubLObject)SubLObjectFactory.makeKeyword("TOP-LEVEL"), (SubLObject)SubLObjectFactory.makeKeyword("CORRESPONDING-GLOBAL"), (SubLObject)SubLObjectFactory.makeSymbol("*PPH-LANGUAGE-MT*"), (SubLObject)SubLObjectFactory.makeKeyword("CHECK-TYPE"), (SubLObject)SubLObjectFactory.makeSymbol("LEXICAL-CONTEXT-P"), (SubLObject)SubLObjectFactory.makeKeyword("DOCUMENTATION"), (SubLObject)SubLObjectFactory.makeString("The context from which to look up lexical information and paraphrase templates."));
        $kw8$SETTER = SubLObjectFactory.makeKeyword("SETTER");
        $sym9$SET_PPH_SEMANTIC_MT_INTERNAL = SubLObjectFactory.makeSymbol("SET-PPH-SEMANTIC-MT-INTERNAL");
        $sym10$SET_PPH_SEMANTIC_MT = SubLObjectFactory.makeSymbol("SET-PPH-SEMANTIC-MT");
        $sym11$HLMT_P = SubLObjectFactory.makeSymbol("HLMT-P");
        $kw12$PPH_SEMANTIC_MT = SubLObjectFactory.makeKeyword("PPH-SEMANTIC-MT");
        $sym13$PARAMS = SubLObjectFactory.makeUninternedSymbol("PARAMS");
        $list14 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TYPE"), (SubLObject)SubLObjectFactory.makeKeyword("TOP-LEVEL"), (SubLObject)SubLObjectFactory.makeKeyword("CORRESPONDING-GLOBAL"), (SubLObject)SubLObjectFactory.makeSymbol("*PPH-DOMAIN-MT*"), (SubLObject)SubLObjectFactory.makeKeyword("CHECK-TYPE"), (SubLObject)SubLObjectFactory.makeSymbol("HLMT-P"), (SubLObject)SubLObjectFactory.makeKeyword("DOCUMENTATION"), (SubLObject)SubLObjectFactory.makeString("The context from which to look up information about the domain of discourse."));
        $sym15$SET_PPH_BACKGROUND_DISCOURSE_INTERNAL = SubLObjectFactory.makeSymbol("SET-PPH-BACKGROUND-DISCOURSE-INTERNAL");
        $sym16$SET_PPH_BACKGROUND_DISCOURSE = SubLObjectFactory.makeSymbol("SET-PPH-BACKGROUND-DISCOURSE");
        $sym17$TRUE = SubLObjectFactory.makeSymbol("TRUE");
        $kw18$PPH_BACKGROUND_DISCOURSE = SubLObjectFactory.makeKeyword("PPH-BACKGROUND-DISCOURSE");
        $sym19$PARAMS = SubLObjectFactory.makeUninternedSymbol("PARAMS");
        $list20 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TYPE"), (SubLObject)SubLObjectFactory.makeKeyword("TOP-LEVEL"), (SubLObject)SubLObjectFactory.makeKeyword("CHECK-TYPE"), (SubLObject)SubLObjectFactory.makeSymbol("TRUE"), (SubLObject)SubLObjectFactory.makeKeyword("DOCUMENTATION"), (SubLObject)SubLObjectFactory.makeString("The background discourse for paraphrasing."), (SubLObject)SubLObjectFactory.makeKeyword("DEFAULT-VALUE-FORM"), (SubLObject)pph_parameter_declarations.NIL);
        $sym21$SET_PPH_DISCOURSE_CONTEXTS_TO_UPDATE_INTERNAL = SubLObjectFactory.makeSymbol("SET-PPH-DISCOURSE-CONTEXTS-TO-UPDATE-INTERNAL");
        $sym22$SET_PPH_DISCOURSE_CONTEXTS_TO_UPDATE = SubLObjectFactory.makeSymbol("SET-PPH-DISCOURSE-CONTEXTS-TO-UPDATE");
        $kw23$PPH_DISCOURSE_CONTEXTS_TO_UPDATE = SubLObjectFactory.makeKeyword("PPH-DISCOURSE-CONTEXTS-TO-UPDATE");
        $sym24$PARAMS = SubLObjectFactory.makeUninternedSymbol("PARAMS");
        $list25 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TYPE"), (SubLObject)SubLObjectFactory.makeKeyword("TOP-LEVEL"), (SubLObject)SubLObjectFactory.makeKeyword("CHECK-TYPE"), (SubLObject)SubLObjectFactory.makeSymbol("TRUE"), (SubLObject)SubLObjectFactory.makeKeyword("DOCUMENTATION"), (SubLObject)SubLObjectFactory.makeString("Discourse contexts that should be updated with information from this paraphrase."), (SubLObject)SubLObjectFactory.makeKeyword("DEFAULT-VALUE-FORM"), (SubLObject)pph_parameter_declarations.NIL);
        $sym26$SET_PPH_GENERATION_COUNT_INTERNAL = SubLObjectFactory.makeSymbol("SET-PPH-GENERATION-COUNT-INTERNAL");
        $sym27$SET_PPH_GENERATION_COUNT = SubLObjectFactory.makeSymbol("SET-PPH-GENERATION-COUNT");
        $sym28$POSITIVE_POTENTIALLY_INFINITE_INTEGER_P = SubLObjectFactory.makeSymbol("POSITIVE-POTENTIALLY-INFINITE-INTEGER-P");
        $kw29$PPH_GENERATION_COUNT = SubLObjectFactory.makeKeyword("PPH-GENERATION-COUNT");
        $sym30$PARAMS = SubLObjectFactory.makeUninternedSymbol("PARAMS");
        $list31 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TYPE"), (SubLObject)SubLObjectFactory.makeKeyword("TOP-LEVEL"), (SubLObject)SubLObjectFactory.makeKeyword("CHECK-TYPE"), (SubLObject)SubLObjectFactory.makeSymbol("POSITIVE-POTENTIALLY-INFINITE-INTEGER-P"), (SubLObject)SubLObjectFactory.makeKeyword("DOCUMENTATION"), (SubLObject)SubLObjectFactory.makeString("The maximum number of paraphrases to generate."), (SubLObject)SubLObjectFactory.makeKeyword("DEFAULT-VALUE-FORM"), (SubLObject)pph_parameter_declarations.ONE_INTEGER);
        $sym32$SET_PPH_AGREEMENT_INTERNAL = SubLObjectFactory.makeSymbol("SET-PPH-AGREEMENT-INTERNAL");
        $sym33$SET_PPH_AGREEMENT = SubLObjectFactory.makeSymbol("SET-PPH-AGREEMENT");
        $sym34$VALID_EXTERNAL_PPH_NL_PREDS_ = SubLObjectFactory.makeSymbol("VALID-EXTERNAL-PPH-NL-PREDS?");
        $kw35$PPH_AGREEMENT = SubLObjectFactory.makeKeyword("PPH-AGREEMENT");
        $sym36$PARAMS = SubLObjectFactory.makeUninternedSymbol("PARAMS");
        $list37 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TYPE"), (SubLObject)SubLObjectFactory.makeKeyword("TOP-LEVEL"), (SubLObject)SubLObjectFactory.makeKeyword("CHECK-TYPE"), (SubLObject)SubLObjectFactory.makeSymbol("VALID-EXTERNAL-PPH-NL-PREDS?"), (SubLObject)SubLObjectFactory.makeKeyword("DOCUMENTATION"), (SubLObject)SubLObjectFactory.makeString("Which agreement predicates are preferred for the head of this phrase? If left at the default, the paraphrase code will attempt to set this parameter appropriately."), (SubLObject)SubLObjectFactory.makeKeyword("DEFAULT-VALUE-FORM"), (SubLObject)SubLObjectFactory.makeKeyword("DEFAULT"));
        $sym38$SET_PPH_SENTENTIAL_FORCE_INTERNAL = SubLObjectFactory.makeSymbol("SET-PPH-SENTENTIAL-FORCE-INTERNAL");
        $sym39$SET_PPH_SENTENTIAL_FORCE = SubLObjectFactory.makeSymbol("SET-PPH-SENTENTIAL-FORCE");
        $sym40$PPH_FORCE_P = SubLObjectFactory.makeSymbol("PPH-FORCE-P");
        $kw41$PPH_SENTENTIAL_FORCE = SubLObjectFactory.makeKeyword("PPH-SENTENTIAL-FORCE");
        $sym42$PARAMS = SubLObjectFactory.makeUninternedSymbol("PARAMS");
        $list43 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TYPE"), (SubLObject)SubLObjectFactory.makeKeyword("TOP-LEVEL"), (SubLObject)SubLObjectFactory.makeKeyword("CHECK-TYPE"), (SubLObject)SubLObjectFactory.makeSymbol("PPH-FORCE-P"), (SubLObject)SubLObjectFactory.makeKeyword("DOCUMENTATION"), (SubLObject)SubLObjectFactory.makeString("What sentential force should be used for paraphrases? If left at the default, the paraphrase code will attempt to set this parameter appropriately."), (SubLObject)SubLObjectFactory.makeKeyword("DEFAULT-VALUE-FORM"), (SubLObject)SubLObjectFactory.makeKeyword("DEFAULT"));
        $sym44$SET_PPH_TIMEOUT_INTERNAL = SubLObjectFactory.makeSymbol("SET-PPH-TIMEOUT-INTERNAL");
        $sym45$SET_PPH_TIMEOUT = SubLObjectFactory.makeSymbol("SET-PPH-TIMEOUT");
        $kw46$PPH_TIMEOUT = SubLObjectFactory.makeKeyword("PPH-TIMEOUT");
        $sym47$PARAMS = SubLObjectFactory.makeUninternedSymbol("PARAMS");
        $list48 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TYPE"), (SubLObject)SubLObjectFactory.makeKeyword("TOP-LEVEL"), (SubLObject)SubLObjectFactory.makeKeyword("CHECK-TYPE"), (SubLObject)SubLObjectFactory.makeSymbol("POSITIVE-POTENTIALLY-INFINITE-INTEGER-P"), (SubLObject)SubLObjectFactory.makeKeyword("DOCUMENTATION"), (SubLObject)SubLObjectFactory.makeString("After how many seconds should we give up? Granularity is the internal time unit of the image, typically millisecond or microsecond."), (SubLObject)SubLObjectFactory.makeKeyword("DEFAULT-VALUE-FORM"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("POSITIVE-INFINITY")));
        $kw49$TOP_LEVEL = SubLObjectFactory.makeKeyword("TOP-LEVEL");
        $sym50$TOP_LEVEL_PPH_API_PARAM_P = SubLObjectFactory.makeSymbol("TOP-LEVEL-PPH-API-PARAM-P");
        $sym51$SET_MAX_DIGITS_WITHOUT_COMMA_INTERNAL = SubLObjectFactory.makeSymbol("SET-MAX-DIGITS-WITHOUT-COMMA-INTERNAL");
        $sym52$SET_MAX_DIGITS_WITHOUT_COMMA = SubLObjectFactory.makeSymbol("SET-MAX-DIGITS-WITHOUT-COMMA");
        $kw53$MAX_DIGITS_WITHOUT_COMMA = SubLObjectFactory.makeKeyword("MAX-DIGITS-WITHOUT-COMMA");
        $sym54$PARAMS = SubLObjectFactory.makeUninternedSymbol("PARAMS");
        $list55 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TYPE"), (SubLObject)SubLObjectFactory.makeKeyword("PPH-FORMAT"), (SubLObject)SubLObjectFactory.makeKeyword("CHECK-TYPE"), (SubLObject)SubLObjectFactory.makeSymbol("POSITIVE-POTENTIALLY-INFINITE-INTEGER-P"), (SubLObject)SubLObjectFactory.makeKeyword("DOCUMENTATION"), (SubLObject)SubLObjectFactory.makeString("max number of digits a number can have and still generate with no commas."), (SubLObject)SubLObjectFactory.makeKeyword("CORRESPONDING-GLOBAL"), (SubLObject)SubLObjectFactory.makeSymbol("*PPH-MAX-NO-COMMA-LENGTH*"));
        $sym56$SET_SIGNIFICANT_DIGITS_CUTOFF_INTERNAL = SubLObjectFactory.makeSymbol("SET-SIGNIFICANT-DIGITS-CUTOFF-INTERNAL");
        $sym57$SET_SIGNIFICANT_DIGITS_CUTOFF = SubLObjectFactory.makeSymbol("SET-SIGNIFICANT-DIGITS-CUTOFF");
        $kw58$SIGNIFICANT_DIGITS_CUTOFF = SubLObjectFactory.makeKeyword("SIGNIFICANT-DIGITS-CUTOFF");
        $sym59$PARAMS = SubLObjectFactory.makeUninternedSymbol("PARAMS");
        $list60 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TYPE"), (SubLObject)SubLObjectFactory.makeKeyword("PPH-FORMAT"), (SubLObject)SubLObjectFactory.makeKeyword("CHECK-TYPE"), (SubLObject)SubLObjectFactory.makeSymbol("POSITIVE-POTENTIALLY-INFINITE-INTEGER-P"), (SubLObject)SubLObjectFactory.makeKeyword("DOCUMENTATION"), (SubLObject)SubLObjectFactory.makeString("To how many significant digits should we truncate the display of numbers?"), (SubLObject)SubLObjectFactory.makeKeyword("CORRESPONDING-GLOBAL"), (SubLObject)SubLObjectFactory.makeSymbol("*PPH-SIGNIFICANT-DIGITS-CUTOFF*"));
        $sym61$SET_USE_INDEXICAL_DATES__INTERNAL = SubLObjectFactory.makeSymbol("SET-USE-INDEXICAL-DATES?-INTERNAL");
        $sym62$SET_USE_INDEXICAL_DATES_ = SubLObjectFactory.makeSymbol("SET-USE-INDEXICAL-DATES?");
        $sym63$BOOLEANP = SubLObjectFactory.makeSymbol("BOOLEANP");
        $kw64$USE_INDEXICAL_DATES_ = SubLObjectFactory.makeKeyword("USE-INDEXICAL-DATES?");
        $sym65$PARAMS = SubLObjectFactory.makeUninternedSymbol("PARAMS");
        $list66 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TYPE"), (SubLObject)SubLObjectFactory.makeKeyword("PPH-FORMAT"), (SubLObject)SubLObjectFactory.makeKeyword("CHECK-TYPE"), (SubLObject)SubLObjectFactory.makeSymbol("BOOLEANP"), (SubLObject)SubLObjectFactory.makeKeyword("DOCUMENTATION"), (SubLObject)SubLObjectFactory.makeString("Should we use 'yesterday', etc. for dates that we can identify?"), (SubLObject)SubLObjectFactory.makeKeyword("CORRESPONDING-GLOBAL"), (SubLObject)SubLObjectFactory.makeSymbol("*PPH-USE-INDEXICAL-DATES?*"));
        $kw67$PPH_FORMAT = SubLObjectFactory.makeKeyword("PPH-FORMAT");
        $sym68$PPH_FORMAT_PARAM_P = SubLObjectFactory.makeSymbol("PPH-FORMAT-PARAM-P");
        $sym69$SET_DEMERIT_CUTOFF_INTERNAL = SubLObjectFactory.makeSymbol("SET-DEMERIT-CUTOFF-INTERNAL");
        $sym70$SET_DEMERIT_CUTOFF = SubLObjectFactory.makeSymbol("SET-DEMERIT-CUTOFF");
        $sym71$NON_NEGATIVE_POTENTIALLY_INFINITE_NUMBER_P = SubLObjectFactory.makeSymbol("NON-NEGATIVE-POTENTIALLY-INFINITE-NUMBER-P");
        $kw72$DEMERIT_CUTOFF = SubLObjectFactory.makeKeyword("DEMERIT-CUTOFF");
        $sym73$PARAMS = SubLObjectFactory.makeUninternedSymbol("PARAMS");
        $list74 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("TYPE"), SubLObjectFactory.makeKeyword("PPH-GOODNESS"), SubLObjectFactory.makeKeyword("CORRESPONDING-GLOBAL"), SubLObjectFactory.makeSymbol("*PPH-DEMERIT-CUTOFF*"), SubLObjectFactory.makeKeyword("CHECK-TYPE"), SubLObjectFactory.makeSymbol("NON-NEGATIVE-POTENTIALLY-INFINITE-NUMBER-P"), SubLObjectFactory.makeKeyword("DOCUMENTATION"), SubLObjectFactory.makeString("What is the worst paraphase quality we should tolerate before returning NIL instead of a string.\nDefault is to consider any string better than nothing.\nSee @xref *PPH-SUGGESTED-DEMERIT-CUTOFF* for a middle-of-the-road value."), SubLObjectFactory.makeKeyword("DEFAULT-VALUE-FORM"), SubLObjectFactory.makeSymbol("*PPH-DEMERIT-CUTOFF*") });
        $sym75$SET_USE_SMART_VARIABLE_REPLACEMENT__INTERNAL = SubLObjectFactory.makeSymbol("SET-USE-SMART-VARIABLE-REPLACEMENT?-INTERNAL");
        $sym76$SET_USE_SMART_VARIABLE_REPLACEMENT_ = SubLObjectFactory.makeSymbol("SET-USE-SMART-VARIABLE-REPLACEMENT?");
        $kw77$USE_SMART_VARIABLE_REPLACEMENT_ = SubLObjectFactory.makeKeyword("USE-SMART-VARIABLE-REPLACEMENT?");
        $sym78$PARAMS = SubLObjectFactory.makeUninternedSymbol("PARAMS");
        $list79 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TYPE"), (SubLObject)SubLObjectFactory.makeKeyword("PPH-GOODNESS"), (SubLObject)SubLObjectFactory.makeKeyword("CORRESPONDING-GLOBAL"), (SubLObject)SubLObjectFactory.makeSymbol("*PPH-USE-SMART-VARIABLE-REPLACEMENT?*"), (SubLObject)SubLObjectFactory.makeKeyword("CHECK-TYPE"), (SubLObject)SubLObjectFactory.makeSymbol("BOOLEANP"), (SubLObject)SubLObjectFactory.makeKeyword("DOCUMENTATION"), (SubLObject)SubLObjectFactory.makeString("Should the paraphrase code 'intelligently' use NL phrases for variables that look like they need it?"));
        $sym80$SET_GENLPREDS_BACKOFF_LIMIT_INTERNAL = SubLObjectFactory.makeSymbol("SET-GENLPREDS-BACKOFF-LIMIT-INTERNAL");
        $sym81$SET_GENLPREDS_BACKOFF_LIMIT = SubLObjectFactory.makeSymbol("SET-GENLPREDS-BACKOFF-LIMIT");
        $sym82$NON_NEGATIVE_INTEGER_P = SubLObjectFactory.makeSymbol("NON-NEGATIVE-INTEGER-P");
        $kw83$GENLPREDS_BACKOFF_LIMIT = SubLObjectFactory.makeKeyword("GENLPREDS-BACKOFF-LIMIT");
        $sym84$PARAMS = SubLObjectFactory.makeUninternedSymbol("PARAMS");
        $list85 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TYPE"), (SubLObject)SubLObjectFactory.makeKeyword("PPH-GOODNESS"), (SubLObject)SubLObjectFactory.makeKeyword("CORRESPONDING-GLOBAL"), (SubLObject)SubLObjectFactory.makeSymbol("*PPH-SEARCH-LIMIT*"), (SubLObject)SubLObjectFactory.makeKeyword("CHECK-TYPE"), (SubLObject)SubLObjectFactory.makeSymbol("NON-NEGATIVE-INTEGER-P"), (SubLObject)SubLObjectFactory.makeKeyword("DOCUMENTATION"), (SubLObject)SubLObjectFactory.makeString("When traversing the genl-preds hierarchy looking for alternative preds with which to paraphrase the input, stop looking after you've looked this many times -- then meaning starts getting lost."));
        $kw86$PPH_GOODNESS = SubLObjectFactory.makeKeyword("PPH-GOODNESS");
        $sym87$PPH_GOODNESS_PARAM_P = SubLObjectFactory.makeSymbol("PPH-GOODNESS-PARAM-P");
        $sym88$SET_PREFER_TERSE_PARAPHRASE__INTERNAL = SubLObjectFactory.makeSymbol("SET-PREFER-TERSE-PARAPHRASE?-INTERNAL");
        $sym89$SET_PREFER_TERSE_PARAPHRASE_ = SubLObjectFactory.makeSymbol("SET-PREFER-TERSE-PARAPHRASE?");
        $kw90$PREFER_TERSE_PARAPHRASE_ = SubLObjectFactory.makeKeyword("PREFER-TERSE-PARAPHRASE?");
        $sym91$PARAMS = SubLObjectFactory.makeUninternedSymbol("PARAMS");
        $list92 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TYPE"), (SubLObject)SubLObjectFactory.makeKeyword("PPH-PRECISION"), (SubLObject)SubLObjectFactory.makeKeyword("CORRESPONDING-GLOBAL"), (SubLObject)SubLObjectFactory.makeSymbol("*PPH-TERSE-MODE?*"), (SubLObject)SubLObjectFactory.makeKeyword("CHECK-TYPE"), (SubLObject)SubLObjectFactory.makeSymbol("BOOLEANP"), (SubLObject)SubLObjectFactory.makeKeyword("DOCUMENTATION"), (SubLObject)SubLObjectFactory.makeString("Should we prefer terse paraphrases?"));
        $sym93$SET_MAXIMIZE_LINKS__INTERNAL = SubLObjectFactory.makeSymbol("SET-MAXIMIZE-LINKS?-INTERNAL");
        $sym94$SET_MAXIMIZE_LINKS_ = SubLObjectFactory.makeSymbol("SET-MAXIMIZE-LINKS?");
        $kw95$MAXIMIZE_LINKS_ = SubLObjectFactory.makeKeyword("MAXIMIZE-LINKS?");
        $sym96$PARAMS = SubLObjectFactory.makeUninternedSymbol("PARAMS");
        $list97 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TYPE"), (SubLObject)SubLObjectFactory.makeKeyword("PPH-PRECISION"), (SubLObject)SubLObjectFactory.makeKeyword("CORRESPONDING-GLOBAL"), (SubLObject)SubLObjectFactory.makeSymbol("*PPH-MAXIMIZE-LINKS?*"), (SubLObject)SubLObjectFactory.makeKeyword("CHECK-TYPE"), (SubLObject)SubLObjectFactory.makeSymbol("BOOLEANP"), (SubLObject)SubLObjectFactory.makeKeyword("DOCUMENTATION"), (SubLObject)SubLObjectFactory.makeString("Should we link as much of the input CycL to output strings as we can? The tradeoff for this is typically terseness and readability."));
        $kw98$PPH_PRECISION = SubLObjectFactory.makeKeyword("PPH-PRECISION");
        $sym99$PPH_PRECISION_PARAM_P = SubLObjectFactory.makeSymbol("PPH-PRECISION-PARAM-P");
        $kw100$PPH_FORMALITY = SubLObjectFactory.makeKeyword("PPH-FORMALITY");
        $sym101$PPH_FORMALITY_PARAM_P = SubLObjectFactory.makeSymbol("PPH-FORMALITY-PARAM-P");
        $sym102$SET_USE_TITLE_CAPITALIZATION__INTERNAL = SubLObjectFactory.makeSymbol("SET-USE-TITLE-CAPITALIZATION?-INTERNAL");
        $sym103$SET_USE_TITLE_CAPITALIZATION_ = SubLObjectFactory.makeSymbol("SET-USE-TITLE-CAPITALIZATION?");
        $kw104$USE_TITLE_CAPITALIZATION_ = SubLObjectFactory.makeKeyword("USE-TITLE-CAPITALIZATION?");
        $sym105$PARAMS = SubLObjectFactory.makeUninternedSymbol("PARAMS");
        $list106 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TYPE"), (SubLObject)SubLObjectFactory.makeKeyword("PPH-MISC"), (SubLObject)SubLObjectFactory.makeKeyword("CORRESPONDING-GLOBAL"), (SubLObject)SubLObjectFactory.makeSymbol("*PPH-USE-TITLE-CAPITALIZATION?*"), (SubLObject)SubLObjectFactory.makeKeyword("CHECK-TYPE"), (SubLObject)SubLObjectFactory.makeSymbol("BOOLEANP"), (SubLObject)SubLObjectFactory.makeKeyword("DOCUMENTATION"), (SubLObject)SubLObjectFactory.makeString("Should we capitalize the output like a book, etc., title?"));
        $sym107$SET_ADD_DETERMINERS_BEFORE_VARIABLES__INTERNAL = SubLObjectFactory.makeSymbol("SET-ADD-DETERMINERS-BEFORE-VARIABLES?-INTERNAL");
        $sym108$SET_ADD_DETERMINERS_BEFORE_VARIABLES_ = SubLObjectFactory.makeSymbol("SET-ADD-DETERMINERS-BEFORE-VARIABLES?");
        $kw109$ADD_DETERMINERS_BEFORE_VARIABLES_ = SubLObjectFactory.makeKeyword("ADD-DETERMINERS-BEFORE-VARIABLES?");
        $sym110$PARAMS = SubLObjectFactory.makeUninternedSymbol("PARAMS");
        $list111 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TYPE"), (SubLObject)SubLObjectFactory.makeKeyword("PPH-MISC"), (SubLObject)SubLObjectFactory.makeKeyword("CORRESPONDING-GLOBAL"), (SubLObject)SubLObjectFactory.makeSymbol("*DETERMINERS-BEFORE-VARIABLES*"), (SubLObject)SubLObjectFactory.makeKeyword("CHECK-TYPE"), (SubLObject)SubLObjectFactory.makeSymbol("BOOLEANP"), (SubLObject)SubLObjectFactory.makeKeyword("DOCUMENTATION"), (SubLObject)SubLObjectFactory.makeString("Shall we try to put the correct determiner before variables, too?"));
        $sym112$SET_QUANTIFY_VARIABLES__INTERNAL = SubLObjectFactory.makeSymbol("SET-QUANTIFY-VARIABLES?-INTERNAL");
        $sym113$SET_QUANTIFY_VARIABLES_ = SubLObjectFactory.makeSymbol("SET-QUANTIFY-VARIABLES?");
        $kw114$QUANTIFY_VARIABLES_ = SubLObjectFactory.makeKeyword("QUANTIFY-VARIABLES?");
        $sym115$PARAMS = SubLObjectFactory.makeUninternedSymbol("PARAMS");
        $list116 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TYPE"), (SubLObject)SubLObjectFactory.makeKeyword("PPH-MISC"), (SubLObject)SubLObjectFactory.makeKeyword("CORRESPONDING-GLOBAL"), (SubLObject)SubLObjectFactory.makeSymbol("*PPH-QUANTIFY-VARS?*"), (SubLObject)SubLObjectFactory.makeKeyword("CHECK-TYPE"), (SubLObject)SubLObjectFactory.makeSymbol("BOOLEANP"), (SubLObject)SubLObjectFactory.makeKeyword("DOCUMENTATION"), (SubLObject)SubLObjectFactory.makeString("Should the paraphrase code 'intelligently' add quantification for variables that look like they need it?"));
        $sym117$SET_HIDE_EXPLICIT_UNIVERSALS__INTERNAL = SubLObjectFactory.makeSymbol("SET-HIDE-EXPLICIT-UNIVERSALS?-INTERNAL");
        $sym118$SET_HIDE_EXPLICIT_UNIVERSALS_ = SubLObjectFactory.makeSymbol("SET-HIDE-EXPLICIT-UNIVERSALS?");
        $kw119$HIDE_EXPLICIT_UNIVERSALS_ = SubLObjectFactory.makeKeyword("HIDE-EXPLICIT-UNIVERSALS?");
        $sym120$PARAMS = SubLObjectFactory.makeUninternedSymbol("PARAMS");
        $list121 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TYPE"), (SubLObject)SubLObjectFactory.makeKeyword("PPH-MISC"), (SubLObject)SubLObjectFactory.makeKeyword("CORRESPONDING-GLOBAL"), (SubLObject)SubLObjectFactory.makeSymbol("*PPH-HIDE-EXPLICIT-UNIVERSALS?*"), (SubLObject)SubLObjectFactory.makeKeyword("CHECK-TYPE"), (SubLObject)SubLObjectFactory.makeSymbol("BOOLEANP"), (SubLObject)SubLObjectFactory.makeKeyword("DOCUMENTATION"), (SubLObject)SubLObjectFactory.makeString("Should we skip the 'For every X, Y, and Z'?"));
        $kw122$PPH_MISC = SubLObjectFactory.makeKeyword("PPH-MISC");
        $sym123$PPH_MISC_PARAM_P = SubLObjectFactory.makeSymbol("PPH-MISC-PARAM-P");
    }
}

/*

	Total time: 212 ms
	
*/