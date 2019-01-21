package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.complex_special_forms;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.StreamsLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Eval;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class form_translation extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.form_translation";
    public static final String myFingerPrint = "829fbca44c1183cb0d4eaea0e5f78ca054c996b847b972ddac89821644063b53";
    @SubLTranslatedFile.SubL(source = "cycl/form-translation.lisp", position = 863L)
    private static SubLSymbol $translator_within_binding_constructP$;
    @SubLTranslatedFile.SubL(source = "cycl/form-translation.lisp", position = 7953L)
    private static SubLSymbol $consider_translator_expansion_factor$;
    @SubLTranslatedFile.SubL(source = "cycl/form-translation.lisp", position = 10959L)
    private static SubLSymbol $operator_translators$;
    @SubLTranslatedFile.SubL(source = "cycl/form-translation.lisp", position = 33820L)
    private static SubLSymbol $translator_current_method$;
    @SubLTranslatedFile.SubL(source = "cycl/form-translation.lisp", position = 56605L)
    private static SubLSymbol $translator_implementation_symbols$;
    private static final SubLSymbol $kw0$SL2C;
    private static final SubLString $str1$unexpected_form____S;
    private static final SubLSymbol $kw2$UNSPECIFIED;
    private static final SubLSymbol $kw3$LOCAL;
    private static final SubLSymbol $kw4$DYNAMIC;
    private static final SubLSymbol $sym5$_DYN;
    private static final SubLSymbol $kw6$LEXICAL;
    private static final SubLSymbol $sym7$_LEX;
    private static final SubLSymbol $kw8$CONSTANT;
    private static final SubLString $str9$Unexpected_binding_type__S_for_va;
    private static final SubLString $str10$time_to_implement__S;
    private static final SubLList $list11;
    private static final SubLList $list12;
    private static final SubLSymbol $sym13$VACCESS;
    private static final SubLSymbol $sym14$PROTECTED;
    private static final SubLSymbol $sym15$FACCESS;
    private static final SubLSymbol $sym16$PRIVATE;
    private static final SubLList $list17;
    private static final SubLList $list18;
    private static final SubLList $list19;
    private static final SubLSymbol $kw20$BINDING_TYPE;
    private static final SubLSymbol $sym21$OPTIMIZE_FUNCALL;
    private static final SubLInteger $int22$50;
    private static final SubLString $str23$Method__S_undergoes_a__Sx_expansi;
    private static final SubLSymbol $sym24$_;
    private static final SubLSymbol $sym25$SECOND;
    private static final SubLString $str26$__Total_forms______________S;
    private static final SubLString $str27$__Mean_form_size___________S;
    private static final SubLString $str28$__Mean_expansion_factor____Sx;
    private static final SubLString $str29$__Largest_expansions__;
    private static final SubLList $list30;
    private static final SubLString $str31$___4___Dx___S;
    private static final SubLList $list32;
    private static final SubLList $list33;
    private static final SubLSymbol $sym34$CAND;
    private static final SubLSymbol $sym35$_DTB;
    private static final SubLSymbol $sym36$_BTD;
    private static final SubLSymbol $sym37$_AND;
    private static final SubLList $list38;
    private static final SubLSymbol $sym39$CCATCH;
    private static final SubLSymbol $sym40$CCATCH_ENV_VAR;
    private static final SubLSymbol $sym41$_CCATCH;
    private static final SubLList $list42;
    private static final SubLSymbol $sym43$CDEC;
    private static final SubLSymbol $sym44$CSETF;
    private static final SubLSymbol $sym45$_;
    private static final SubLList $list46;
    private static final SubLSymbol $sym47$CDO;
    private static final SubLList $list48;
    private static final SubLSymbol $sym49$CSETQ;
    private static final SubLList $list50;
    private static final SubLSymbol $sym51$CNOT;
    private static final SubLSymbol $sym52$CLET;
    private static final SubLSymbol $sym53$_FOR;
    private static final SubLList $list54;
    private static final SubLSymbol $sym55$_CDO_SYMBOLS;
    private static final SubLList $list56;
    private static final SubLSymbol $sym57$CDO_SYMBOLS;
    private static final SubLSymbol $sym58$CDO_SYMBOLS_PACKAGE;
    private static final SubLSymbol $sym59$CDO_SYMBOLS_ITERATOR;
    private static final SubLList $list60;
    private static final SubLSymbol $sym61$_CDOHASH;
    private static final SubLList $list62;
    private static final SubLSymbol $sym63$CDOHASH;
    private static final SubLSymbol $sym64$CDOHASH_TABLE;
    private static final SubLSymbol $sym65$CDOHASH_ITERATOR;
    private static final SubLSymbol $sym66$CDOHASH_ENTRY;
    private static final SubLList $list67;
    private static final SubLSymbol $sym68$CDOLIST;
    private static final SubLSymbol $sym69$CDOLIST_LIST_VAR;
    private static final SubLSymbol $sym70$CLET_LOCAL;
    private static final SubLSymbol $sym71$FOR;
    private static final SubLSymbol $sym72$FIRST;
    private static final SubLSymbol $sym73$NULL;
    private static final SubLSymbol $sym74$REST;
    private static final SubLList $list75;
    private static final SubLSymbol $sym76$CDOTIMES;
    private static final SubLSymbol $sym77$CDOTIMES_END_VAR;
    private static final SubLList $list78;
    private static final SubLSymbol $sym79$_;
    private static final SubLSymbol $sym80$CINC;
    private static final SubLList $list81;
    private static final SubLSymbol $sym82$CHECK_TYPE;
    private static final SubLSymbol $sym83$QUOTE;
    private static final SubLSymbol $sym84$_DP_CHECK_TYPE;
    private static final SubLSymbol $sym85$_;
    private static final SubLList $list86;
    private static final SubLList $list87;
    private static final SubLSymbol $kw88$UNSET;
    private static final SubLList $list89;
    private static final SubLSymbol $sym90$CLET_BIND;
    private static final SubLString $str91$CLET_of_lexical_variable__S_being;
    private static final SubLString $str92$CLET_of_constant__S_is_not_allowe;
    private static final SubLString $str93$Unexpected_variable__S;
    private static final SubLSymbol $sym94$PROGN;
    private static final SubLList $list95;
    private static final SubLSymbol $sym96$CMULTIPLE_VALUE_BIND;
    private static final SubLList $list97;
    private static final SubLList $list98;
    private static final SubLSymbol $sym99$_MVAL;
    private static final SubLList $list100;
    private static final SubLSymbol $sym101$_NOT;
    private static final SubLSymbol $sym102$COR;
    private static final SubLSymbol $sym103$_OR;
    private static final SubLList $list104;
    private static final SubLSymbol $sym105$CPOP;
    private static final SubLSymbol $sym106$CDR;
    private static final SubLList $list107;
    private static final SubLSymbol $sym108$CPROGV;
    private static final SubLSymbol $sym109$CPROGV_VAR;
    private static final SubLSymbol $sym110$_CPROGV;
    private static final SubLList $list111;
    private static final SubLSymbol $sym112$CPUSH;
    private static final SubLSymbol $sym113$CONS;
    private static final SubLList $list114;
    private static final SubLList $list115;
    private static final SubLList $list116;
    private static final SubLSymbol $sym117$CPUSHNEW;
    private static final SubLSymbol $sym118$ITEM_VAR;
    private static final SubLSymbol $sym119$PUNLESS;
    private static final SubLSymbol $sym120$MEMBER;
    private static final SubLList $list121;
    private static final SubLSymbol $sym122$CAR;
    private static final SubLSymbol $sym123$RPLACA;
    private static final SubLSymbol $sym124$RPLACD;
    private static final SubLSymbol $sym125$NTH;
    private static final SubLSymbol $sym126$SET_NTH;
    private static final SubLSymbol $sym127$GETHASH;
    private static final SubLSymbol $sym128$SETHASH;
    private static final SubLSymbol $sym129$GETHASH_WITHOUT_VALUES;
    private static final SubLSymbol $sym130$CHAR;
    private static final SubLSymbol $sym131$SET_CHAR;
    private static final SubLSymbol $sym132$AREF;
    private static final SubLSymbol $sym133$SET_AREF;
    private static final SubLSymbol $sym134$GET;
    private static final SubLSymbol $sym135$PUT;
    private static final SubLSymbol $sym136$SYMBOL_VALUE;
    private static final SubLSymbol $sym137$SET;
    private static final SubLList $list138;
    private static final SubLSymbol $sym139$SETTER_FROM_ACCESSOR;
    private static final SubLList $list140;
    private static final SubLList $list141;
    private static final SubLList $list142;
    private static final SubLSymbol $sym143$CSOME;
    private static final SubLSymbol $sym144$CSOME_LIST_VAR;
    private static final SubLList $list145;
    private static final SubLSymbol $sym146$CTIME;
    private static final SubLSymbol $sym147$TIME_VAR;
    private static final SubLList $list148;
    private static final SubLSymbol $sym149$_;
    private static final SubLList $list150;
    private static final SubLList $list151;
    private static final SubLList $list152;
    private static final SubLSymbol $sym153$CUNWIND_PROTECT;
    private static final SubLSymbol $sym154$CUNWIND_PROTECT_ENV_VAR;
    private static final SubLSymbol $sym155$_CUNWIND_PROTECT;
    private static final SubLList $list156;
    private static final SubLSymbol $sym157$DECLAIM;
    private static final SubLSymbol $sym158$PROCLAIM;
    private static final SubLList $list159;
    private static final SubLSymbol $sym160$DECLARE;
    private static final SubLList $list161;
    private static final SubLSymbol $sym162$DEFCONSTANT;
    private static final SubLSymbol $sym163$SYMBOLP;
    private static final SubLList $list164;
    private static final SubLSymbol $sym165$DEFINE;
    private static final SubLList $list166;
    private static final SubLList $list167;
    private static final SubLSymbol $sym168$RET;
    private static final SubLSymbol $sym169$POSSIBLY_NOTE_FUNCTION_ENTRY;
    private static final SubLSymbol $sym170$THREAD;
    private static final SubLSymbol $sym171$_WITH_CURRENT_THREAD;
    private static final SubLSymbol $sym172$TRANSLATOR_CURRENT_THREAD_ACCESS_CONSTRUCT_P;
    private static final SubLList $list173;
    private static final SubLSymbol $sym174$DEFLEXICAL;
    private static final SubLList $list175;
    private static final SubLSymbol $sym176$DEFMACRO;
    private static final SubLList $list177;
    private static final SubLSymbol $sym178$CDESTRUCTURING_BIND;
    private static final SubLList $list179;
    private static final SubLSymbol $sym180$DEFINE_MACROEXPANDER;
    private static final SubLSymbol $sym181$DEFPARAMETER;
    private static final SubLList $list182;
    private static final SubLSymbol $sym183$DEFSTRUCT;
    private static final SubLSymbol $sym184$_DEFSTRUCT_CLASS;
    private static final SubLList $list185;
    private static final SubLSymbol $kw186$NAME;
    private static final SubLSymbol $kw187$C_STRUCTURE_TAG;
    private static final SubLSymbol $kw188$PREDICATE;
    private static final SubLSymbol $kw189$SLOTS;
    private static final SubLSymbol $kw190$SLOT_KEYWORDS;
    private static final SubLSymbol $kw191$GETTERS;
    private static final SubLSymbol $kw192$SETTERS;
    private static final SubLSymbol $kw193$PRINT_FUNCTION;
    private static final SubLSymbol $sym194$DEFAULT_STRUCT_PRINT_FUNCTION;
    private static final SubLList $list195;
    private static final SubLSymbol $sym196$DEFVAR;
    private static final SubLList $list197;
    private static final SubLSymbol $sym198$ENFORCE_TYPE;
    private static final SubLSymbol $sym199$_DP_ENFORCE_TYPE;
    private static final SubLList $list200;
    private static final SubLSymbol $sym201$ENFORCE_MUST;
    private static final SubLSymbol $sym202$ERROR;
    private static final SubLList $list203;
    private static final SubLSymbol $sym204$FIF;
    private static final SubLList $list205;
    private static final SubLSymbol $sym206$FUNCTION;
    private static final SubLSymbol $sym207$SYMBOL_FUNCTION;
    private static final SubLList $list208;
    private static final SubLSymbol $sym209$FUNLESS;
    private static final SubLList $list210;
    private static final SubLSymbol $sym211$FWHEN;
    private static final SubLList $list212;
    private static final SubLList $list213;
    private static final SubLSymbol $sym214$MULTIPLE_VALUE_LIST;
    private static final SubLSymbol $sym215$MUST;
    private static final SubLSymbol $sym216$_IGNORE_MUSTS__;
    private static final SubLList $list217;
    private static final SubLSymbol $sym218$NTH_VALUE;
    private static final SubLList $list219;
    private static final SubLSymbol $sym220$PCASE;
    private static final SubLSymbol $sym221$PCASE_VAR;
    private static final SubLSymbol $sym222$PCOND;
    private static final SubLList $list223;
    private static final SubLSymbol $sym224$OTHERWISE;
    private static final SubLString $str225$_AEncountered_a_PCASE_that_uses_T;
    private static final SubLString $str226$Within_;
    private static final SubLString $str227$___;
    private static final SubLString $str228$;
    private static final SubLList $list229;
    private static final SubLList $list230;
    private static final SubLList $list231;
    private static final SubLSymbol $sym232$PIF;
    private static final SubLList $list233;
    private static final SubLList $list234;
    private static final SubLList $list235;
    private static final SubLList $list236;
    private static final SubLList $list237;
    private static final SubLSymbol $sym238$INLINE;
    private static final SubLSymbol $sym239$NOTINLINE;
    private static final SubLSymbol $sym240$_PROCLAIM;
    private static final SubLList $list241;
    private static final SubLList $list242;
    private static final SubLList $list243;
    private static final SubLSymbol $sym244$PWHEN;
    private static final SubLList $list245;
    private static final SubLList $list246;
    private static final SubLList $list247;
    private static final SubLSymbol $sym248$WITH_ERROR_HANDLER;
    private static final SubLSymbol $sym249$CATCH_VAR;
    private static final SubLSymbol $sym250$ERROR_VAR;
    private static final SubLSymbol $sym251$_WITH_ERROR_HANDLER;
    private static final SubLSymbol $sym252$WITH_PROCESS_RESOURCE_TRACKING;
    private static final SubLSymbol $sym253$RESOURCE_TRACKING_ENV_VAR;
    private static final SubLSymbol $sym254$_WITH_PROCESS_RESOURCE_TRACKING;
    private static final SubLSymbol $sym255$WITH_STATIC_AREA;
    private static final SubLList $list256;
    private static final SubLSymbol $sym257$WITH_THREAD_PRIVATE_AREA;
    private static final SubLList $list258;
    private static final SubLSymbol $sym259$WITH_WORKING_AREA;
    private static final SubLList $list260;
    private static final SubLList $list261;
    private static final SubLList $list262;
    private static final SubLList $list263;
    private static final SubLList $list264;
    private static final SubLSymbol $sym265$_DEFSTRUCT_CONSTRUCT;
    private static final SubLSymbol $sym266$INTEGERP;
    private static final SubLList $list267;
    private static final SubLSymbol $sym268$_DEFSTRUCT_GET_SLOT;
    private static final SubLList $list269;
    private static final SubLSymbol $sym270$_DEFSTRUCT_OBJECT_P;
    private static final SubLList $list271;
    private static final SubLSymbol $sym272$_DEFSTRUCT_SET_SLOT;
    private static final SubLList $list273;
    private static final SubLList $list274;
    private static final SubLList $list275;
    private static final SubLList $list276;
    private static final SubLSymbol $sym277$IN_PACKAGE;
    private static final SubLSymbol $sym278$_PACKAGE_;
    private static final SubLSymbol $sym279$FIND_PACKAGE;
    private static final SubLList $list280;
    private static final SubLList $list281;
    private static final SubLSymbol $sym282$UNTIL;
    private static final SubLSymbol $sym283$WHILE;
    private static final SubLList $list284;
    private static final SubLList $list285;
    private static final SubLList $list286;
    private static final SubLList $list287;
    private static final SubLList $list288;
    private static final SubLList $list289;
    private static final SubLList $list290;
    private static final SubLList $list291;
    private static final SubLList $list292;
    private static final SubLList $list293;
    private static final SubLList $list294;
    private static final SubLList $list295;
    private static final SubLList $list296;
    private static final SubLList $list297;
    private static final SubLList $list298;
    static  boolean assertionsDisabledSynth = true;
    
    @SubLTranslatedFile.SubL(source = "cycl/form-translation.lisp", position = 1048L)
    public static SubLObject translator_within_binding_constructP() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return form_translation.$translator_within_binding_constructP$.getDynamicValue(thread);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/form-translation.lisp", position = 1153L)
    public static SubLObject translate_form(SubLObject form) {
        if (form.isAtom()) {
            return translate_atom(form);
        }
        form = possibly_translate_implementation_symbols(form);
        final SubLObject operator = form.first();
        final SubLObject translator = operator_translator(operator);
        if (form_translation.NIL != translator) {
            return translate_form_via_translator(translator, form);
        }
        if (operator.isMacroOperator()) {
            return translate_form_via_macroexpansion(form);
        }
        return translate_form_as_function_call(form);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/form-translation.lisp", position = 1823L)
    public static SubLObject test_translate_form(final SubLObject form, SubLObject backend, SubLObject translation_features) {
        if (backend == form_translation.UNPROVIDED) {
            backend = (SubLObject)form_translation.$kw0$SL2C;
        }
        if (translation_features == form_translation.UNPROVIDED) {
            translation_features = (SubLObject)form_translation.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)form_translation.NIL;
        final SubLObject _prev_bind_0 = reader.$features$.currentBinding(thread);
        try {
            reader.$features$.bind(conses_high.adjoin(backend, translation_features, (SubLObject)form_translation.UNPROVIDED, (SubLObject)form_translation.UNPROVIDED), thread);
            result = translate_form(form);
        }
        finally {
            reader.$features$.rebind(_prev_bind_0, thread);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/form-translation.lisp", position = 2064L)
    public static SubLObject translate_atom(final SubLObject form) {
        if (form.isKeyword()) {
            return translate_constant_atom(form);
        }
        if (form == form_translation.NIL || form == form_translation.T) {
            return translate_constant_atom(form);
        }
        if (form.isSymbol()) {
            return translate_variable_reference(form);
        }
        if (form_translation.NIL != Eval.constantp(form, (SubLObject)form_translation.UNPROVIDED)) {
            return translate_constant_atom(form);
        }
        return Errors.error((SubLObject)form_translation.$str1$unexpected_form____S, form);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/form-translation.lisp", position = 2689L)
    public static SubLObject translate_constant_atom(final SubLObject form) {
        return file_translation.tsf_possibly_convert_internal_constant(form);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/form-translation.lisp", position = 2792L)
    public static SubLObject translator_variable_binding_type(final SubLObject variable) {
        SubLObject binding_type = xref_database.xref_global_binding_type(variable);
        if (binding_type != form_translation.$kw2$UNSPECIFIED) {
            return binding_type;
        }
        binding_type = file_translation.current_ts_file_global_binding_type(variable);
        if (binding_type != form_translation.$kw2$UNSPECIFIED) {
            return binding_type;
        }
        return (SubLObject)form_translation.$kw3$LOCAL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/form-translation.lisp", position = 3180L)
    public static SubLObject translate_variable_reference(final SubLObject variable) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject binding_type = translator_variable_binding_type(variable);
        if (binding_type != form_translation.$kw3$LOCAL) {
            xref_database.xref_note_global_reference(variable);
        }
        final SubLObject pcase_var = binding_type;
        if (pcase_var.eql((SubLObject)form_translation.$kw3$LOCAL)) {
            return translate_variable(variable);
        }
        if (pcase_var.eql((SubLObject)form_translation.$kw4$DYNAMIC)) {
            return (SubLObject)ConsesLow.list((SubLObject)form_translation.$sym5$_DYN, translate_variable(variable));
        }
        if (pcase_var.eql((SubLObject)form_translation.$kw6$LEXICAL)) {
            return (SubLObject)ConsesLow.list((SubLObject)form_translation.$sym7$_LEX, translate_variable(variable));
        }
        if (pcase_var.eql((SubLObject)form_translation.$kw8$CONSTANT)) {
            return (SubLObject)ConsesLow.list((SubLObject)form_translation.$sym7$_LEX, translate_variable(variable));
        }
        return Errors.error((SubLObject)form_translation.$str9$Unexpected_binding_type__S_for_va, binding_type, variable);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/form-translation.lisp", position = 3773L)
    public static SubLObject translate_variable(final SubLObject variable) {
        final SubLObject binding_type = translator_variable_binding_type(variable);
        if (binding_type != form_translation.$kw3$LOCAL) {
            file_translation.tsf_possibly_note_referenced_global(variable);
        }
        return variable;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/form-translation.lisp", position = 4000L)
    public static SubLObject translate_form_via_translator(final SubLObject translator, final SubLObject form) {
        if (form_translation.NIL == subl_promotions.function_symbol_p(translator)) {
            return Errors.error((SubLObject)form_translation.$str10$time_to_implement__S, translator);
        }
        return Functions.funcall(translator, form);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/form-translation.lisp", position = 4195L)
    public static SubLObject translate_form_via_macroexpansion(final SubLObject form) {
        SubLObject macro = (SubLObject)form_translation.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(form, form, (SubLObject)form_translation.$list11);
        macro = form.first();
        final SubLObject args;
        final SubLObject current = args = form.rest();
        xref_database.xref_note_macro_use(macro);
        return translate_form(Eval.macroexpand_1(form, (SubLObject)form_translation.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/form-translation.lisp", position = 4400L)
    public static SubLObject translate_form_as_function_call(final SubLObject form) {
        SubLObject operator = (SubLObject)form_translation.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(form, form, (SubLObject)form_translation.$list12);
        operator = form.first();
        final SubLObject args;
        final SubLObject current = args = form.rest();
        xref_database.xref_note_function_call(operator);
        final SubLObject translated_operator = translate_function_symbol(operator);
        SubLObject translated_args = (SubLObject)form_translation.NIL;
        SubLObject cdolist_list_var = args;
        SubLObject arg = (SubLObject)form_translation.NIL;
        arg = cdolist_list_var.first();
        while (form_translation.NIL != cdolist_list_var) {
            translated_args = (SubLObject)ConsesLow.cons(translate_form(arg), translated_args);
            cdolist_list_var = cdolist_list_var.rest();
            arg = cdolist_list_var.first();
        }
        return reader.bq_cons(translated_operator, ConsesLow.append(Sequences.nreverse(translated_args), (SubLObject)form_translation.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/form-translation.lisp", position = 4782L)
    public static SubLObject translate_function_symbol(final SubLObject form) {
        file_translation.tsf_possibly_note_referenced_function(form);
        return form;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/form-translation.lisp", position = 4893L)
    public static SubLObject vaccess_level(final SubLObject symbol) {
        return Symbols.get(symbol, (SubLObject)form_translation.$sym13$VACCESS, (SubLObject)form_translation.$sym14$PROTECTED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/form-translation.lisp", position = 5330L)
    public static SubLObject faccess_level(final SubLObject symbol) {
        return Symbols.get(symbol, (SubLObject)form_translation.$sym15$FACCESS, (SubLObject)form_translation.$sym14$PROTECTED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/form-translation.lisp", position = 5525L)
    public static SubLObject private_global_p(final SubLObject symbol) {
        return (SubLObject)SubLObjectFactory.makeBoolean(symbol.isSymbol() && form_translation.$sym16$PRIVATE == vaccess_level(symbol));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/form-translation.lisp", position = 5647L)
    public static SubLObject private_method_p(final SubLObject symbol) {
        return (SubLObject)SubLObjectFactory.makeBoolean(symbol.isSymbol() && form_translation.$sym16$PRIVATE == faccess_level(symbol));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/form-translation.lisp", position = 5768L)
    public static SubLObject translate_body(final SubLObject body) {
        SubLObject translated_body = (SubLObject)form_translation.NIL;
        SubLObject cdolist_list_var = body;
        SubLObject form = (SubLObject)form_translation.NIL;
        form = cdolist_list_var.first();
        while (form_translation.NIL != cdolist_list_var) {
            final SubLObject translated_form = translate_form(form);
            translated_body = (SubLObject)ConsesLow.cons(translated_form, translated_body);
            cdolist_list_var = cdolist_list_var.rest();
            form = cdolist_list_var.first();
        }
        return common_optimization.translator_optimize_body(Sequences.nreverse(translated_body));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/form-translation.lisp", position = 6025L)
    public static SubLObject translate_arglist(final SubLObject arglist) {
        SubLObject translated_arglist = (SubLObject)form_translation.NIL;
        SubLObject cdolist_list_var = arglist;
        SubLObject arg = (SubLObject)form_translation.NIL;
        arg = cdolist_list_var.first();
        while (form_translation.NIL != cdolist_list_var) {
            if (arg.isCons()) {
                SubLObject current;
                final SubLObject datum = current = arg;
                SubLObject variable = (SubLObject)form_translation.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)form_translation.$list17);
                variable = current.first();
                current = current.rest();
                final SubLObject initialization = (SubLObject)(current.isCons() ? current.first() : form_translation.NIL);
                cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)form_translation.$list17);
                current = current.rest();
                final SubLObject providedP = (SubLObject)(current.isCons() ? current.first() : form_translation.NIL);
                cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)form_translation.$list17);
                current = current.rest();
                if (form_translation.NIL == current) {
                    translated_arglist = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.listS(variable, translate_form(initialization), ConsesLow.append((SubLObject)((form_translation.NIL != providedP) ? ConsesLow.list(providedP) : form_translation.NIL), (SubLObject)form_translation.NIL)), translated_arglist);
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)form_translation.$list17);
                }
            }
            else {
                translated_arglist = (SubLObject)ConsesLow.cons(arg, translated_arglist);
            }
            cdolist_list_var = cdolist_list_var.rest();
            arg = cdolist_list_var.first();
        }
        return Sequences.nreverse(translated_arglist);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/form-translation.lisp", position = 6432L)
    public static SubLObject translate_empty_progn(SubLObject form) {
        if (form == form_translation.UNPROVIDED) {
            form = (SubLObject)form_translation.NIL;
        }
        return (SubLObject)form_translation.$list18;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/form-translation.lisp", position = 6522L)
    public static SubLObject binding_type_p(final SubLObject obj) {
        return list_utilities.member_eqP(obj, (SubLObject)form_translation.$list19);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/form-translation.lisp", position = 6745L)
    public static SubLObject dynamic_global_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(v_object.isSymbol() && form_translation.$kw4$DYNAMIC == Symbols.get(v_object, (SubLObject)form_translation.$kw20$BINDING_TYPE, (SubLObject)form_translation.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/form-translation.lisp", position = 6989L)
    public static SubLObject lexical_global_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(v_object.isSymbol() && form_translation.$kw6$LEXICAL == Symbols.get(v_object, (SubLObject)form_translation.$kw20$BINDING_TYPE, (SubLObject)form_translation.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/form-translation.lisp", position = 7233L)
    public static SubLObject constant_global_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(v_object.isSymbol() && form_translation.$kw8$CONSTANT == Symbols.get(v_object, (SubLObject)form_translation.$kw20$BINDING_TYPE, (SubLObject)form_translation.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/form-translation.lisp", position = 7509L)
    public static SubLObject global_binding_type(final SubLObject global) {
        if (form_translation.NIL != dynamic_global_p(global)) {
            return (SubLObject)form_translation.$kw4$DYNAMIC;
        }
        if (form_translation.NIL != lexical_global_p(global)) {
            return (SubLObject)form_translation.$kw6$LEXICAL;
        }
        if (form_translation.NIL != constant_global_p(global)) {
            return (SubLObject)form_translation.$kw8$CONSTANT;
        }
        return (SubLObject)form_translation.$kw2$UNSPECIFIED;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/form-translation.lisp", position = 7798L)
    public static SubLObject optimize_funcall_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(v_object.isSymbol() && form_translation.NIL != Symbols.get(v_object, (SubLObject)form_translation.$sym21$OPTIMIZE_FUNCALL, (SubLObject)form_translation.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/form-translation.lisp", position = 8465L)
    public static SubLObject translator_consider_expansion_factor(final SubLObject method, final SubLObject form, final SubLObject translated_form) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (form_translation.NIL == form_translation.$consider_translator_expansion_factor$.getDynamicValue(thread)) {
            return (SubLObject)form_translation.NIL;
        }
        final SubLObject form_size = list_utilities.cons_count(form);
        final SubLObject translated_form_size = list_utilities.cons_count(translated_form);
        final SubLObject expansion_factor = translate_form_expansion_factor_int(form_size, translated_form_size);
        final SubLObject expansion_cutoff = (SubLObject)form_translation.$int22$50;
        SubLObject stats = (SubLObject)form_translation.NIL;
        if (form_translation.$consider_translator_expansion_factor$.getDynamicValue(thread).isVector()) {
            stats = form_translation.$consider_translator_expansion_factor$.getDynamicValue(thread);
            Vectors.set_aref(stats, (SubLObject)form_translation.ZERO_INTEGER, Numbers.add(Vectors.aref(stats, (SubLObject)form_translation.ZERO_INTEGER), (SubLObject)form_translation.ONE_INTEGER));
            Vectors.set_aref(stats, (SubLObject)form_translation.ONE_INTEGER, Numbers.add(Vectors.aref(stats, (SubLObject)form_translation.ONE_INTEGER), form_size));
            Vectors.set_aref(stats, (SubLObject)form_translation.TWO_INTEGER, Numbers.add(Vectors.aref(stats, (SubLObject)form_translation.TWO_INTEGER), translated_form_size));
            Vectors.set_aref(stats, (SubLObject)form_translation.THREE_INTEGER, Numbers.add(Vectors.aref(stats, (SubLObject)form_translation.THREE_INTEGER), expansion_factor));
        }
        if (expansion_factor.numG(expansion_cutoff)) {
            if (form_translation.$consider_translator_expansion_factor$.getDynamicValue(thread).isVector()) {
                Vectors.set_aref(stats, (SubLObject)form_translation.FOUR_INTEGER, (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(method, expansion_factor), Vectors.aref(stats, (SubLObject)form_translation.FOUR_INTEGER)));
            }
            else {
                Errors.warn((SubLObject)form_translation.$str23$Method__S_undergoes_a__Sx_expansi, method, Numbers.round(number_utilities.significant_digits(expansion_factor, (SubLObject)form_translation.TWO_INTEGER), (SubLObject)form_translation.UNPROVIDED));
            }
        }
        return expansion_factor;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/form-translation.lisp", position = 9454L)
    public static SubLObject translate_form_expansion_factor(final SubLObject form, final SubLObject backend, final SubLObject features) {
        final SubLObject translated_form = test_translate_form(form, backend, features);
        final SubLObject form_size = list_utilities.cons_count(form);
        final SubLObject translated_form_size = list_utilities.cons_count(translated_form);
        return translate_form_expansion_factor_int(form_size, translated_form_size);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/form-translation.lisp", position = 9854L)
    public static SubLObject translate_form_expansion_factor_int(final SubLObject form_size, final SubLObject translated_form_size) {
        return (SubLObject)(form_size.isZero() ? form_translation.ZERO_INTEGER : Numbers.divide(translated_form_size, form_size));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/form-translation.lisp", position = 10037L)
    public static SubLObject show_translation_expansion_factor_stats(SubLObject stats, SubLObject stream) {
        if (stats == form_translation.UNPROVIDED) {
            stats = form_translation.$consider_translator_expansion_factor$.getDynamicValue();
        }
        if (stream == form_translation.UNPROVIDED) {
            stream = StreamsLow.$standard_output$.getDynamicValue();
        }
        final SubLObject total_forms = Vectors.aref(stats, (SubLObject)form_translation.ZERO_INTEGER);
        final SubLObject total_form_size = Vectors.aref(stats, (SubLObject)form_translation.ONE_INTEGER);
        final SubLObject total_translated_form_size = Vectors.aref(stats, (SubLObject)form_translation.TWO_INTEGER);
        final SubLObject largest_expansions = Sort.sort(conses_high.copy_list(Vectors.aref(stats, (SubLObject)form_translation.FOUR_INTEGER)), Symbols.symbol_function((SubLObject)form_translation.$sym24$_), Symbols.symbol_function((SubLObject)form_translation.$sym25$SECOND));
        PrintLow.format(stream, (SubLObject)form_translation.$str26$__Total_forms______________S, total_forms);
        PrintLow.format(stream, (SubLObject)form_translation.$str27$__Mean_form_size___________S, number_utilities.significant_digits(Numbers.divide(total_form_size, total_forms), (SubLObject)form_translation.THREE_INTEGER));
        PrintLow.format(stream, (SubLObject)form_translation.$str28$__Mean_expansion_factor____Sx, number_utilities.significant_digits(Numbers.divide(total_translated_form_size, total_form_size), (SubLObject)form_translation.THREE_INTEGER));
        PrintLow.format(stream, (SubLObject)form_translation.$str29$__Largest_expansions__);
        SubLObject cdolist_list_var = largest_expansions;
        SubLObject datum = (SubLObject)form_translation.NIL;
        datum = cdolist_list_var.first();
        while (form_translation.NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum_$1 = current = datum;
            SubLObject method = (SubLObject)form_translation.NIL;
            SubLObject expansion_factor = (SubLObject)form_translation.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum_$1, (SubLObject)form_translation.$list30);
            method = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum_$1, (SubLObject)form_translation.$list30);
            expansion_factor = current.first();
            current = current.rest();
            if (form_translation.NIL == current) {
                PrintLow.format(stream, (SubLObject)form_translation.$str31$___4___Dx___S, Numbers.round(number_utilities.significant_digits(expansion_factor, (SubLObject)form_translation.THREE_INTEGER), (SubLObject)form_translation.UNPROVIDED), method);
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(datum_$1, (SubLObject)form_translation.$list30);
            }
            cdolist_list_var = cdolist_list_var.rest();
            datum = cdolist_list_var.first();
        }
        return (SubLObject)form_translation.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/form-translation.lisp", position = 15583L)
    public static SubLObject operator_translator(final SubLObject operator) {
        return list_utilities.alist_lookup_without_values(form_translation.$operator_translators$.getGlobalValue(), operator, Symbols.symbol_function((SubLObject)form_translation.EQ), (SubLObject)form_translation.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/form-translation.lisp", position = 15707L)
    public static SubLObject translate_cand(final SubLObject form) {
        SubLObject operator = (SubLObject)form_translation.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(form, form, (SubLObject)form_translation.$list33);
        operator = form.first();
        final SubLObject expressions;
        final SubLObject current = expressions = form.rest();
        list_utilities.verify_operator(operator, (SubLObject)form_translation.$sym34$CAND);
        SubLObject translated_expressions = (SubLObject)form_translation.NIL;
        SubLObject cdolist_list_var = expressions;
        SubLObject expression = (SubLObject)form_translation.NIL;
        expression = cdolist_list_var.first();
        while (form_translation.NIL != cdolist_list_var) {
            final SubLObject translated_expression = translate_Xdtb((SubLObject)ConsesLow.list((SubLObject)form_translation.$sym35$_DTB, expression));
            translated_expressions = (SubLObject)ConsesLow.cons(translated_expression, translated_expressions);
            cdolist_list_var = cdolist_list_var.rest();
            expression = cdolist_list_var.first();
        }
        return common_optimization.translator_optimize_Xbtd((SubLObject)ConsesLow.list((SubLObject)form_translation.$sym36$_BTD, common_optimization.translator_optimize_Xand(reader.bq_cons((SubLObject)form_translation.$sym37$_AND, ConsesLow.append(Sequences.nreverse(translated_expressions), (SubLObject)form_translation.NIL)))));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/form-translation.lisp", position = 16381L)
    public static SubLObject translate_ccatch(final SubLObject form) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject operator = (SubLObject)form_translation.NIL;
        SubLObject tag = (SubLObject)form_translation.NIL;
        SubLObject ans_var = (SubLObject)form_translation.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(form, form, (SubLObject)form_translation.$list38);
        operator = form.first();
        SubLObject current = form.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, form, (SubLObject)form_translation.$list38);
        tag = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, form, (SubLObject)form_translation.$list38);
        ans_var = current.first();
        final SubLObject body;
        current = (body = current.rest());
        list_utilities.verify_operator(operator, (SubLObject)form_translation.$sym39$CCATCH);
        final SubLObject translated_tag = translate_form(tag);
        final SubLObject translated_body = translate_binding_construct_body(body);
        final SubLObject ccatch_env_var = (SubLObject)form_translation.$sym40$CCATCH_ENV_VAR;
        return (SubLObject)ConsesLow.listS((SubLObject)form_translation.$sym41$_CCATCH, (SubLObject)ConsesLow.list(translated_tag, ans_var, ccatch_env_var), ConsesLow.append(translated_body, (SubLObject)form_translation.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/form-translation.lisp", position = 16809L)
    public static SubLObject translate_binding_construct_body(final SubLObject body) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)form_translation.NIL;
        final SubLObject _prev_bind_0 = form_translation.$translator_within_binding_constructP$.currentBinding(thread);
        try {
            form_translation.$translator_within_binding_constructP$.bind((SubLObject)form_translation.T, thread);
            result = translate_body(body);
        }
        finally {
            form_translation.$translator_within_binding_constructP$.rebind(_prev_bind_0, thread);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/form-translation.lisp", position = 17001L)
    public static SubLObject translate_binding_construct_form(final SubLObject form) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)form_translation.NIL;
        final SubLObject _prev_bind_0 = form_translation.$translator_within_binding_constructP$.currentBinding(thread);
        try {
            form_translation.$translator_within_binding_constructP$.bind((SubLObject)form_translation.T, thread);
            result = translate_form(form);
        }
        finally {
            form_translation.$translator_within_binding_constructP$.rebind(_prev_bind_0, thread);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/form-translation.lisp", position = 17193L)
    public static SubLObject translate_cdec(final SubLObject form) {
        SubLObject operator = (SubLObject)form_translation.NIL;
        SubLObject place = (SubLObject)form_translation.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(form, form, (SubLObject)form_translation.$list42);
        operator = form.first();
        SubLObject current = form.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, form, (SubLObject)form_translation.$list42);
        place = current.first();
        current = current.rest();
        final SubLObject delta = (SubLObject)(current.isCons() ? current.first() : form_translation.ONE_INTEGER);
        cdestructuring_bind.destructuring_bind_must_listp(current, form, (SubLObject)form_translation.$list42);
        current = current.rest();
        if (form_translation.NIL == current) {
            list_utilities.verify_operator(operator, (SubLObject)form_translation.$sym43$CDEC);
            return translate_csetf((SubLObject)ConsesLow.list((SubLObject)form_translation.$sym44$CSETF, place, (SubLObject)ConsesLow.list((SubLObject)form_translation.$sym45$_, place, delta)));
        }
        cdestructuring_bind.cdestructuring_bind_error(form, (SubLObject)form_translation.$list42);
        return (SubLObject)form_translation.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/form-translation.lisp", position = 17410L)
    public static SubLObject translate_cdo(final SubLObject form) {
        SubLObject operator = (SubLObject)form_translation.NIL;
        SubLObject vars = (SubLObject)form_translation.NIL;
        SubLObject endtest = (SubLObject)form_translation.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(form, form, (SubLObject)form_translation.$list46);
        operator = form.first();
        SubLObject current = form.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, form, (SubLObject)form_translation.$list46);
        vars = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, form, (SubLObject)form_translation.$list46);
        endtest = current.first();
        final SubLObject body;
        current = (body = current.rest());
        list_utilities.verify_operator(operator, (SubLObject)form_translation.$sym47$CDO);
        SubLObject clet_vars = (SubLObject)form_translation.NIL;
        SubLObject for_initializations = (SubLObject)form_translation.NIL;
        SubLObject for_test = (SubLObject)form_translation.NIL;
        SubLObject for_updates = (SubLObject)form_translation.NIL;
        SubLObject result_body = (SubLObject)form_translation.NIL;
        SubLObject cdolist_list_var = vars;
        SubLObject var_form = (SubLObject)form_translation.NIL;
        var_form = cdolist_list_var.first();
        while (form_translation.NIL != cdolist_list_var) {
            SubLObject current_$3;
            final SubLObject datum_$2 = current_$3 = var_form;
            SubLObject var = (SubLObject)form_translation.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current_$3, datum_$2, (SubLObject)form_translation.$list48);
            var = current_$3.first();
            current_$3 = current_$3.rest();
            final SubLObject initialization = (SubLObject)(current_$3.isCons() ? current_$3.first() : form_translation.NIL);
            cdestructuring_bind.destructuring_bind_must_listp(current_$3, datum_$2, (SubLObject)form_translation.$list48);
            current_$3 = current_$3.rest();
            final SubLObject update = (SubLObject)(current_$3.isCons() ? current_$3.first() : form_translation.NIL);
            final SubLObject updateP = Types.consp(current_$3);
            cdestructuring_bind.destructuring_bind_must_listp(current_$3, datum_$2, (SubLObject)form_translation.$list48);
            current_$3 = current_$3.rest();
            if (form_translation.NIL == current_$3) {
                clet_vars = (SubLObject)ConsesLow.cons(var, clet_vars);
                for_initializations = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)form_translation.$sym49$CSETQ, var, initialization), for_initializations);
                if (form_translation.NIL != updateP) {
                    for_updates = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)form_translation.$sym49$CSETQ, var, update), for_updates);
                }
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(datum_$2, (SubLObject)form_translation.$list48);
            }
            cdolist_list_var = cdolist_list_var.rest();
            var_form = cdolist_list_var.first();
        }
        clet_vars = Sequences.nreverse(clet_vars);
        for_initializations = Sequences.nreverse(for_initializations);
        for_updates = Sequences.nreverse(for_updates);
        SubLObject current_$4;
        final SubLObject datum_$3 = current_$4 = endtest;
        SubLObject test = (SubLObject)form_translation.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current_$4, datum_$3, (SubLObject)form_translation.$list50);
        test = current_$4.first();
        final SubLObject result;
        current_$4 = (result = current_$4.rest());
        for_test = (SubLObject)ConsesLow.list((SubLObject)form_translation.$sym51$CNOT, test);
        result_body = result;
        return translate_clet((SubLObject)ConsesLow.listS((SubLObject)form_translation.$sym52$CLET, clet_vars, (SubLObject)ConsesLow.listS((SubLObject)form_translation.$sym53$_FOR, (SubLObject)ConsesLow.list(for_initializations, for_test, for_updates), ConsesLow.append(body, (SubLObject)form_translation.NIL)), ConsesLow.append(result_body, (SubLObject)form_translation.NIL)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/form-translation.lisp", position = 18449L)
    public static SubLObject translate_Xcdo_symbols(final SubLObject form) {
        SubLObject operator = (SubLObject)form_translation.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(form, form, (SubLObject)form_translation.$list54);
        operator = form.first();
        SubLObject current = form.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, form, (SubLObject)form_translation.$list54);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject sym = (SubLObject)form_translation.NIL;
        SubLObject v_package = (SubLObject)form_translation.NIL;
        SubLObject iterator = (SubLObject)form_translation.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, form, (SubLObject)form_translation.$list54);
        sym = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, form, (SubLObject)form_translation.$list54);
        v_package = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, form, (SubLObject)form_translation.$list54);
        iterator = current.first();
        current = current.rest();
        if (form_translation.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            list_utilities.verify_operator(operator, (SubLObject)form_translation.$sym55$_CDO_SYMBOLS);
            final SubLObject translated_body = translate_body(body);
            return (SubLObject)ConsesLow.listS((SubLObject)form_translation.$sym55$_CDO_SYMBOLS, (SubLObject)ConsesLow.list(sym, v_package, iterator), ConsesLow.append(translated_body, (SubLObject)form_translation.NIL));
        }
        cdestructuring_bind.cdestructuring_bind_error(form, (SubLObject)form_translation.$list54);
        return (SubLObject)form_translation.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/form-translation.lisp", position = 18875L)
    public static SubLObject translate_cdo_symbols(final SubLObject form) {
        SubLObject operator = (SubLObject)form_translation.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(form, form, (SubLObject)form_translation.$list56);
        operator = form.first();
        SubLObject current = form.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, form, (SubLObject)form_translation.$list56);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject sym = (SubLObject)form_translation.NIL;
        SubLObject v_package = (SubLObject)form_translation.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, form, (SubLObject)form_translation.$list56);
        sym = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, form, (SubLObject)form_translation.$list56);
        v_package = current.first();
        current = current.rest();
        if (form_translation.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            list_utilities.verify_operator(operator, (SubLObject)form_translation.$sym57$CDO_SYMBOLS);
            final SubLObject cdo_symbols_package = (SubLObject)form_translation.$sym58$CDO_SYMBOLS_PACKAGE;
            final SubLObject cdo_symbols_iterator = (SubLObject)form_translation.$sym59$CDO_SYMBOLS_ITERATOR;
            return translate_clet((SubLObject)ConsesLow.list((SubLObject)form_translation.$sym52$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(cdo_symbols_package, v_package), cdo_symbols_iterator, sym), (SubLObject)ConsesLow.listS((SubLObject)form_translation.$sym55$_CDO_SYMBOLS, (SubLObject)ConsesLow.list(sym, cdo_symbols_package, cdo_symbols_iterator), ConsesLow.append(body, (SubLObject)form_translation.NIL))));
        }
        cdestructuring_bind.cdestructuring_bind_error(form, (SubLObject)form_translation.$list56);
        return (SubLObject)form_translation.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/form-translation.lisp", position = 19309L)
    public static SubLObject translate_Xcdohash(final SubLObject form) {
        SubLObject operator = (SubLObject)form_translation.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(form, form, (SubLObject)form_translation.$list60);
        operator = form.first();
        SubLObject current = form.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, form, (SubLObject)form_translation.$list60);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject key = (SubLObject)form_translation.NIL;
        SubLObject val = (SubLObject)form_translation.NIL;
        SubLObject table = (SubLObject)form_translation.NIL;
        SubLObject iterator = (SubLObject)form_translation.NIL;
        SubLObject entry = (SubLObject)form_translation.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, form, (SubLObject)form_translation.$list60);
        key = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, form, (SubLObject)form_translation.$list60);
        val = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, form, (SubLObject)form_translation.$list60);
        table = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, form, (SubLObject)form_translation.$list60);
        iterator = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, form, (SubLObject)form_translation.$list60);
        entry = current.first();
        current = current.rest();
        if (form_translation.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            list_utilities.verify_operator(operator, (SubLObject)form_translation.$sym61$_CDOHASH);
            final SubLObject translated_body = translate_body(body);
            final SubLObject translated_table = translate_form(table);
            return (SubLObject)ConsesLow.listS((SubLObject)form_translation.$sym61$_CDOHASH, (SubLObject)ConsesLow.list(key, val, translated_table, iterator, entry), ConsesLow.append(translated_body, (SubLObject)form_translation.NIL));
        }
        cdestructuring_bind.cdestructuring_bind_error(form, (SubLObject)form_translation.$list60);
        return (SubLObject)form_translation.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/form-translation.lisp", position = 19729L)
    public static SubLObject translate_cdohash(final SubLObject form) {
        SubLObject operator = (SubLObject)form_translation.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(form, form, (SubLObject)form_translation.$list62);
        operator = form.first();
        SubLObject current = form.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, form, (SubLObject)form_translation.$list62);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject key = (SubLObject)form_translation.NIL;
        SubLObject val = (SubLObject)form_translation.NIL;
        SubLObject table = (SubLObject)form_translation.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, form, (SubLObject)form_translation.$list62);
        key = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, form, (SubLObject)form_translation.$list62);
        val = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, form, (SubLObject)form_translation.$list62);
        table = current.first();
        current = current.rest();
        if (form_translation.NIL != current) {
            cdestructuring_bind.cdestructuring_bind_error(form, (SubLObject)form_translation.$list62);
            return (SubLObject)form_translation.NIL;
        }
        final SubLObject body;
        current = (body = temp);
        list_utilities.verify_operator(operator, (SubLObject)form_translation.$sym63$CDOHASH);
        if (!table.isAtom() || form_translation.NIL != dynamic_global_p(table)) {
            final SubLObject cdohash_table = (SubLObject)form_translation.$sym64$CDOHASH_TABLE;
            return translate_clet((SubLObject)ConsesLow.list((SubLObject)form_translation.$sym52$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(cdohash_table, table)), (SubLObject)ConsesLow.listS((SubLObject)form_translation.$sym63$CDOHASH, (SubLObject)ConsesLow.list(key, val, cdohash_table), ConsesLow.append(body, (SubLObject)form_translation.NIL))));
        }
        final SubLObject cdohash_iterator = (SubLObject)form_translation.$sym65$CDOHASH_ITERATOR;
        final SubLObject cdohash_entry = (SubLObject)form_translation.$sym66$CDOHASH_ENTRY;
        return translate_clet((SubLObject)ConsesLow.list((SubLObject)form_translation.$sym52$CLET, (SubLObject)ConsesLow.list(key, val), (SubLObject)ConsesLow.listS((SubLObject)form_translation.$sym61$_CDOHASH, (SubLObject)ConsesLow.list(key, val, table, cdohash_iterator, cdohash_entry), ConsesLow.append(body, (SubLObject)form_translation.NIL))));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/form-translation.lisp", position = 20301L)
    public static SubLObject translate_cdolist(final SubLObject form) {
        SubLObject operator = (SubLObject)form_translation.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(form, form, (SubLObject)form_translation.$list67);
        operator = form.first();
        SubLObject current = form.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, form, (SubLObject)form_translation.$list67);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject var = (SubLObject)form_translation.NIL;
        SubLObject listform = (SubLObject)form_translation.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, form, (SubLObject)form_translation.$list67);
        var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, form, (SubLObject)form_translation.$list67);
        listform = current.first();
        current = current.rest();
        if (form_translation.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            list_utilities.verify_operator(operator, (SubLObject)form_translation.$sym68$CDOLIST);
            final SubLObject cdolist_list_var = (SubLObject)form_translation.$sym69$CDOLIST_LIST_VAR;
            return translate_clet_local((SubLObject)ConsesLow.list((SubLObject)form_translation.$sym70$CLET_LOCAL, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(cdolist_list_var, listform)), (SubLObject)ConsesLow.listS((SubLObject)form_translation.$sym71$FOR, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var, (SubLObject)ConsesLow.list((SubLObject)form_translation.$sym72$FIRST, cdolist_list_var))), (SubLObject)ConsesLow.list((SubLObject)form_translation.$sym51$CNOT, (SubLObject)ConsesLow.list((SubLObject)form_translation.$sym73$NULL, cdolist_list_var)), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)form_translation.$sym49$CSETQ, cdolist_list_var, (SubLObject)ConsesLow.list((SubLObject)form_translation.$sym74$REST, cdolist_list_var)), (SubLObject)ConsesLow.list((SubLObject)form_translation.$sym49$CSETQ, var, (SubLObject)ConsesLow.list((SubLObject)form_translation.$sym72$FIRST, cdolist_list_var)))), ConsesLow.append(body, (SubLObject)form_translation.NIL))));
        }
        cdestructuring_bind.cdestructuring_bind_error(form, (SubLObject)form_translation.$list67);
        return (SubLObject)form_translation.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/form-translation.lisp", position = 20809L)
    public static SubLObject translate_cdotimes(final SubLObject form) {
        SubLObject operator = (SubLObject)form_translation.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(form, form, (SubLObject)form_translation.$list75);
        operator = form.first();
        SubLObject current = form.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, form, (SubLObject)form_translation.$list75);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject var = (SubLObject)form_translation.NIL;
        SubLObject integer = (SubLObject)form_translation.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, form, (SubLObject)form_translation.$list75);
        var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, form, (SubLObject)form_translation.$list75);
        integer = current.first();
        current = current.rest();
        if (form_translation.NIL != current) {
            cdestructuring_bind.cdestructuring_bind_error(form, (SubLObject)form_translation.$list75);
            return (SubLObject)form_translation.NIL;
        }
        final SubLObject body;
        current = (body = temp);
        list_utilities.verify_operator(operator, (SubLObject)form_translation.$sym76$CDOTIMES);
        if (!integer.isAtom()) {
            final SubLObject cdotimes_end_var = (SubLObject)form_translation.$sym77$CDOTIMES_END_VAR;
            return translate_clet_local((SubLObject)ConsesLow.list((SubLObject)form_translation.$sym70$CLET_LOCAL, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(cdotimes_end_var, integer)), (SubLObject)ConsesLow.listS((SubLObject)form_translation.$sym76$CDOTIMES, (SubLObject)ConsesLow.list(var, cdotimes_end_var), ConsesLow.append(body, (SubLObject)form_translation.NIL))));
        }
        return translate_for((SubLObject)ConsesLow.listS((SubLObject)form_translation.$sym71$FOR, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(reader.bq_cons(var, (SubLObject)form_translation.$list78)), (SubLObject)ConsesLow.list((SubLObject)form_translation.$sym79$_, var, integer), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)form_translation.$sym80$CINC, var))), ConsesLow.append(body, (SubLObject)form_translation.NIL)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/form-translation.lisp", position = 21270L)
    public static SubLObject translate_check_type(final SubLObject form) {
        SubLObject operator = (SubLObject)form_translation.NIL;
        SubLObject v_object = (SubLObject)form_translation.NIL;
        SubLObject pred = (SubLObject)form_translation.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(form, form, (SubLObject)form_translation.$list81);
        operator = form.first();
        SubLObject current = form.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, form, (SubLObject)form_translation.$list81);
        v_object = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, form, (SubLObject)form_translation.$list81);
        pred = current.first();
        current = current.rest();
        if (form_translation.NIL == current) {
            list_utilities.verify_operator(operator, (SubLObject)form_translation.$sym82$CHECK_TYPE);
            xref_database.xref_note_function_call(pred);
            final SubLObject translated_object = translate_form(v_object);
            final SubLObject translated_pred = translate_function_symbol(pred);
            translate_form((SubLObject)ConsesLow.list((SubLObject)form_translation.$sym83$QUOTE, pred));
            return (SubLObject)ConsesLow.list((SubLObject)form_translation.$sym84$_DP_CHECK_TYPE, translated_object, translated_pred);
        }
        cdestructuring_bind.cdestructuring_bind_error(form, (SubLObject)form_translation.$list81);
        return (SubLObject)form_translation.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/form-translation.lisp", position = 21749L)
    public static SubLObject translate_cinc(final SubLObject form) {
        SubLObject operator = (SubLObject)form_translation.NIL;
        SubLObject place = (SubLObject)form_translation.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(form, form, (SubLObject)form_translation.$list42);
        operator = form.first();
        SubLObject current = form.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, form, (SubLObject)form_translation.$list42);
        place = current.first();
        current = current.rest();
        final SubLObject delta = (SubLObject)(current.isCons() ? current.first() : form_translation.ONE_INTEGER);
        cdestructuring_bind.destructuring_bind_must_listp(current, form, (SubLObject)form_translation.$list42);
        current = current.rest();
        if (form_translation.NIL == current) {
            list_utilities.verify_operator(operator, (SubLObject)form_translation.$sym80$CINC);
            return translate_csetf((SubLObject)ConsesLow.list((SubLObject)form_translation.$sym44$CSETF, place, (SubLObject)ConsesLow.list((SubLObject)form_translation.$sym85$_, place, delta)));
        }
        cdestructuring_bind.cdestructuring_bind_error(form, (SubLObject)form_translation.$list42);
        return (SubLObject)form_translation.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/form-translation.lisp", position = 21966L)
    public static SubLObject translate_clet(final SubLObject form) {
        SubLObject operator = (SubLObject)form_translation.NIL;
        SubLObject v_bindings = (SubLObject)form_translation.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(form, form, (SubLObject)form_translation.$list86);
        operator = form.first();
        SubLObject current = form.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, form, (SubLObject)form_translation.$list86);
        v_bindings = current.first();
        final SubLObject body;
        current = (body = current.rest());
        list_utilities.verify_operator(operator, (SubLObject)form_translation.$sym52$CLET);
        return translate_clet_int((SubLObject)form_translation.NIL, v_bindings, body);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/form-translation.lisp", position = 22161L)
    public static SubLObject translate_clet_int(final SubLObject some_globalP, final SubLObject v_bindings, final SubLObject body) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (form_translation.NIL == v_bindings) {
            return translate_final_clet_body(some_globalP, body);
        }
        SubLObject first_binding = (SubLObject)form_translation.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(v_bindings, v_bindings, (SubLObject)form_translation.$list87);
        first_binding = v_bindings.first();
        final SubLObject rest_bindings;
        final SubLObject current = rest_bindings = v_bindings.rest();
        SubLObject variable = (SubLObject)form_translation.$kw88$UNSET;
        SubLObject initialization = (SubLObject)form_translation.NIL;
        if (first_binding.isCons()) {
            SubLObject current_$7;
            final SubLObject datum_$6 = current_$7 = first_binding;
            SubLObject binding_variable = (SubLObject)form_translation.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current_$7, datum_$6, (SubLObject)form_translation.$list89);
            binding_variable = current_$7.first();
            current_$7 = current_$7.rest();
            final SubLObject binding_initialization = (SubLObject)(current_$7.isCons() ? current_$7.first() : form_translation.NIL);
            cdestructuring_bind.destructuring_bind_must_listp(current_$7, datum_$6, (SubLObject)form_translation.$list89);
            current_$7 = current_$7.rest();
            if (form_translation.NIL == current_$7) {
                variable = binding_variable;
                initialization = binding_initialization;
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(datum_$6, (SubLObject)form_translation.$list89);
            }
        }
        else {
            variable = first_binding;
        }
        final SubLObject binding_type = translator_variable_binding_type(variable);
        final SubLObject translated_variable = translate_variable(variable);
        final SubLObject translated_initialization = translate_form(initialization);
        final SubLObject translated_sub_body = translate_clet_int((SubLObject)SubLObjectFactory.makeBoolean(form_translation.NIL != some_globalP || binding_type == form_translation.$kw4$DYNAMIC), rest_bindings, body);
        final SubLObject pcase_var = binding_type;
        if (pcase_var.eql((SubLObject)form_translation.$kw3$LOCAL)) {
            return common_optimization.translator_optimize_clet_local((SubLObject)ConsesLow.list((SubLObject)form_translation.$sym70$CLET_LOCAL, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(translated_variable, translated_initialization)), translated_sub_body));
        }
        if (pcase_var.eql((SubLObject)form_translation.$kw4$DYNAMIC)) {
            xref_database.xref_note_global_binding(variable);
            return common_optimization.translator_optimize_clet_bind((SubLObject)ConsesLow.list((SubLObject)form_translation.$sym90$CLET_BIND, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(translated_variable, translated_initialization)), translated_sub_body));
        }
        if (pcase_var.eql((SubLObject)form_translation.$kw6$LEXICAL)) {
            return Errors.error((SubLObject)form_translation.$str91$CLET_of_lexical_variable__S_being, variable);
        }
        if (pcase_var.eql((SubLObject)form_translation.$kw8$CONSTANT)) {
            return Errors.error((SubLObject)form_translation.$str92$CLET_of_constant__S_is_not_allowe, variable);
        }
        return Errors.error((SubLObject)form_translation.$str93$Unexpected_variable__S, variable);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/form-translation.lisp", position = 24088L)
    public static SubLObject translate_final_clet_body(final SubLObject some_globalP, final SubLObject body) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)form_translation.NIL;
        if (form_translation.NIL != some_globalP) {
            final SubLObject _prev_bind_0 = form_translation.$translator_within_binding_constructP$.currentBinding(thread);
            try {
                form_translation.$translator_within_binding_constructP$.bind((SubLObject)form_translation.T, thread);
                result = translate_final_clet_body((SubLObject)form_translation.NIL, body);
            }
            finally {
                form_translation.$translator_within_binding_constructP$.rebind(_prev_bind_0, thread);
            }
        }
        else {
            result = translate_progn(reader.bq_cons((SubLObject)form_translation.$sym94$PROGN, ConsesLow.append(body, (SubLObject)form_translation.NIL)));
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/form-translation.lisp", position = 24377L)
    public static SubLObject translate_cmultiple_value_bind(final SubLObject form) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject operator = (SubLObject)form_translation.NIL;
        SubLObject vars = (SubLObject)form_translation.NIL;
        SubLObject value = (SubLObject)form_translation.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(form, form, (SubLObject)form_translation.$list95);
        operator = form.first();
        SubLObject current = form.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, form, (SubLObject)form_translation.$list95);
        vars = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, form, (SubLObject)form_translation.$list95);
        value = current.first();
        final SubLObject body;
        current = (body = current.rest());
        list_utilities.verify_operator(operator, (SubLObject)form_translation.$sym96$CMULTIPLE_VALUE_BIND);
        final SubLObject v_bindings = translate_cmultiple_value_bind_bindings(vars, value);
        return translate_progn((SubLObject)ConsesLow.list((SubLObject)form_translation.$sym94$PROGN, (SubLObject)form_translation.$list97, (SubLObject)ConsesLow.listS((SubLObject)form_translation.$sym52$CLET, v_bindings, (SubLObject)form_translation.$list97, ConsesLow.append(body, (SubLObject)form_translation.NIL))));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/form-translation.lisp", position = 24770L)
    public static SubLObject translate_cmultiple_value_bind_bindings(final SubLObject vars, final SubLObject value) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject first_var = (SubLObject)form_translation.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(vars, vars, (SubLObject)form_translation.$list98);
        first_var = vars.first();
        final SubLObject rest_vars;
        final SubLObject current = rest_vars = vars.rest();
        SubLObject v_bindings = (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(first_var, value));
        SubLObject list_var = (SubLObject)form_translation.NIL;
        SubLObject var = (SubLObject)form_translation.NIL;
        SubLObject num = (SubLObject)form_translation.NIL;
        list_var = rest_vars;
        var = list_var.first();
        for (num = (SubLObject)form_translation.ZERO_INTEGER; form_translation.NIL != list_var; list_var = list_var.rest(), var = list_var.first(), num = Numbers.add((SubLObject)form_translation.ONE_INTEGER, num)) {
            v_bindings = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(var, (SubLObject)ConsesLow.list((SubLObject)form_translation.$sym99$_MVAL, number_utilities.f_1X(num))), v_bindings);
        }
        return Sequences.nreverse(v_bindings);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/form-translation.lisp", position = 25071L)
    public static SubLObject translate_cnot(final SubLObject form) {
        SubLObject operator = (SubLObject)form_translation.NIL;
        SubLObject expression = (SubLObject)form_translation.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(form, form, (SubLObject)form_translation.$list100);
        operator = form.first();
        SubLObject current = form.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, form, (SubLObject)form_translation.$list100);
        expression = current.first();
        current = current.rest();
        if (form_translation.NIL == current) {
            list_utilities.verify_operator(operator, (SubLObject)form_translation.$sym51$CNOT);
            final SubLObject translated_expression = translate_Xdtb((SubLObject)ConsesLow.list((SubLObject)form_translation.$sym35$_DTB, expression));
            return common_optimization.translator_optimize_Xbtd((SubLObject)ConsesLow.list((SubLObject)form_translation.$sym36$_BTD, common_optimization.translator_optimize_Xnot((SubLObject)ConsesLow.list((SubLObject)form_translation.$sym101$_NOT, translated_expression))));
        }
        cdestructuring_bind.cdestructuring_bind_error(form, (SubLObject)form_translation.$list100);
        return (SubLObject)form_translation.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/form-translation.lisp", position = 25388L)
    public static SubLObject translate_cor(final SubLObject form) {
        SubLObject operator = (SubLObject)form_translation.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(form, form, (SubLObject)form_translation.$list33);
        operator = form.first();
        final SubLObject expressions;
        final SubLObject current = expressions = form.rest();
        list_utilities.verify_operator(operator, (SubLObject)form_translation.$sym102$COR);
        SubLObject translated_expressions = (SubLObject)form_translation.NIL;
        SubLObject cdolist_list_var = expressions;
        SubLObject expression = (SubLObject)form_translation.NIL;
        expression = cdolist_list_var.first();
        while (form_translation.NIL != cdolist_list_var) {
            final SubLObject translated_expression = translate_Xdtb((SubLObject)ConsesLow.list((SubLObject)form_translation.$sym35$_DTB, expression));
            translated_expressions = (SubLObject)ConsesLow.cons(translated_expression, translated_expressions);
            cdolist_list_var = cdolist_list_var.rest();
            expression = cdolist_list_var.first();
        }
        return common_optimization.translator_optimize_Xbtd((SubLObject)ConsesLow.list((SubLObject)form_translation.$sym36$_BTD, common_optimization.translator_optimize_Xor(reader.bq_cons((SubLObject)form_translation.$sym103$_OR, ConsesLow.append(Sequences.nreverse(translated_expressions), (SubLObject)form_translation.NIL)))));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/form-translation.lisp", position = 25855L)
    public static SubLObject translate_cpop(final SubLObject form) {
        SubLObject operator = (SubLObject)form_translation.NIL;
        SubLObject place = (SubLObject)form_translation.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(form, form, (SubLObject)form_translation.$list104);
        operator = form.first();
        SubLObject current = form.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, form, (SubLObject)form_translation.$list104);
        place = current.first();
        current = current.rest();
        if (form_translation.NIL == current) {
            list_utilities.verify_operator(operator, (SubLObject)form_translation.$sym105$CPOP);
            return translate_csetf((SubLObject)ConsesLow.list((SubLObject)form_translation.$sym44$CSETF, place, (SubLObject)ConsesLow.list((SubLObject)form_translation.$sym106$CDR, place)));
        }
        cdestructuring_bind.cdestructuring_bind_error(form, (SubLObject)form_translation.$list104);
        return (SubLObject)form_translation.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/form-translation.lisp", position = 26047L)
    public static SubLObject translate_cprogv(final SubLObject form) {
        SubLObject operator = (SubLObject)form_translation.NIL;
        SubLObject special_vars = (SubLObject)form_translation.NIL;
        SubLObject v_bindings = (SubLObject)form_translation.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(form, form, (SubLObject)form_translation.$list107);
        operator = form.first();
        SubLObject current = form.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, form, (SubLObject)form_translation.$list107);
        special_vars = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, form, (SubLObject)form_translation.$list107);
        v_bindings = current.first();
        final SubLObject body;
        current = (body = current.rest());
        list_utilities.verify_operator(operator, (SubLObject)form_translation.$sym108$CPROGV);
        final SubLObject translated_special_vars = translate_form(special_vars);
        final SubLObject translated_bindings = translate_form(v_bindings);
        final SubLObject translated_body = translate_body(body);
        final SubLObject cprogv_var = (SubLObject)form_translation.$sym109$CPROGV_VAR;
        return (SubLObject)ConsesLow.listS((SubLObject)form_translation.$sym110$_CPROGV, (SubLObject)ConsesLow.list(translated_special_vars, translated_bindings, cprogv_var), ConsesLow.append(translated_body, (SubLObject)form_translation.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/form-translation.lisp", position = 26561L)
    public static SubLObject translate_cpush(final SubLObject form) {
        SubLObject operator = (SubLObject)form_translation.NIL;
        SubLObject item = (SubLObject)form_translation.NIL;
        SubLObject place = (SubLObject)form_translation.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(form, form, (SubLObject)form_translation.$list111);
        operator = form.first();
        SubLObject current = form.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, form, (SubLObject)form_translation.$list111);
        item = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, form, (SubLObject)form_translation.$list111);
        place = current.first();
        current = current.rest();
        if (form_translation.NIL == current) {
            list_utilities.verify_operator(operator, (SubLObject)form_translation.$sym112$CPUSH);
            return translate_csetf((SubLObject)ConsesLow.list((SubLObject)form_translation.$sym44$CSETF, place, (SubLObject)ConsesLow.list((SubLObject)form_translation.$sym113$CONS, item, place)));
        }
        cdestructuring_bind.cdestructuring_bind_error(form, (SubLObject)form_translation.$list111);
        return (SubLObject)form_translation.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/form-translation.lisp", position = 26768L)
    public static SubLObject translate_cpushnew(final SubLObject form) {
        SubLObject operator = (SubLObject)form_translation.NIL;
        SubLObject item = (SubLObject)form_translation.NIL;
        SubLObject place = (SubLObject)form_translation.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(form, form, (SubLObject)form_translation.$list114);
        operator = form.first();
        SubLObject current = form.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, form, (SubLObject)form_translation.$list114);
        item = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, form, (SubLObject)form_translation.$list114);
        place = current.first();
        current = current.rest();
        final SubLObject test = (SubLObject)(current.isCons() ? current.first() : form_translation.$list115);
        cdestructuring_bind.destructuring_bind_must_listp(current, form, (SubLObject)form_translation.$list114);
        current = current.rest();
        final SubLObject key = (SubLObject)(current.isCons() ? current.first() : form_translation.$list116);
        cdestructuring_bind.destructuring_bind_must_listp(current, form, (SubLObject)form_translation.$list114);
        current = current.rest();
        if (form_translation.NIL == current) {
            list_utilities.verify_operator(operator, (SubLObject)form_translation.$sym117$CPUSHNEW);
            final SubLObject item_var = (SubLObject)form_translation.$sym118$ITEM_VAR;
            return translate_clet((SubLObject)ConsesLow.list((SubLObject)form_translation.$sym52$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(item_var, item)), (SubLObject)ConsesLow.list((SubLObject)form_translation.$sym119$PUNLESS, (SubLObject)ConsesLow.list((SubLObject)form_translation.$sym120$MEMBER, item_var, place, test, key), (SubLObject)ConsesLow.list((SubLObject)form_translation.$sym112$CPUSH, item_var, place))));
        }
        cdestructuring_bind.cdestructuring_bind_error(form, (SubLObject)form_translation.$list114);
        return (SubLObject)form_translation.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/form-translation.lisp", position = 27136L)
    public static SubLObject translate_csetf(final SubLObject form) {
        SubLObject operator = (SubLObject)form_translation.NIL;
        SubLObject place = (SubLObject)form_translation.NIL;
        SubLObject value = (SubLObject)form_translation.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(form, form, (SubLObject)form_translation.$list121);
        operator = form.first();
        SubLObject current = form.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, form, (SubLObject)form_translation.$list121);
        place = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, form, (SubLObject)form_translation.$list121);
        value = current.first();
        current = current.rest();
        if (form_translation.NIL != current) {
            cdestructuring_bind.cdestructuring_bind_error(form, (SubLObject)form_translation.$list121);
            return (SubLObject)form_translation.NIL;
        }
        list_utilities.verify_operator(operator, (SubLObject)form_translation.$sym44$CSETF);
        if (place.isAtom()) {
            return translate_csetq((SubLObject)ConsesLow.list((SubLObject)form_translation.$sym49$CSETQ, place, value));
        }
        final SubLObject accessor = place.first();
        SubLObject expansion = (SubLObject)form_translation.NIL;
        final SubLObject pcase_var = accessor;
        if (pcase_var.eql((SubLObject)form_translation.$sym122$CAR)) {
            expansion = (SubLObject)ConsesLow.list((SubLObject)form_translation.$sym123$RPLACA, conses_high.second(place), value);
        }
        else if (pcase_var.eql((SubLObject)form_translation.$sym106$CDR)) {
            expansion = (SubLObject)ConsesLow.list((SubLObject)form_translation.$sym124$RPLACD, conses_high.second(place), value);
        }
        else if (pcase_var.eql((SubLObject)form_translation.$sym125$NTH)) {
            expansion = (SubLObject)ConsesLow.list((SubLObject)form_translation.$sym126$SET_NTH, conses_high.second(place), conses_high.third(place), value);
        }
        else if (pcase_var.eql((SubLObject)form_translation.$sym127$GETHASH)) {
            expansion = (SubLObject)ConsesLow.list((SubLObject)form_translation.$sym128$SETHASH, conses_high.second(place), conses_high.third(place), value);
        }
        else if (pcase_var.eql((SubLObject)form_translation.$sym129$GETHASH_WITHOUT_VALUES)) {
            expansion = (SubLObject)ConsesLow.list((SubLObject)form_translation.$sym128$SETHASH, conses_high.second(place), conses_high.third(place), value);
        }
        else if (pcase_var.eql((SubLObject)form_translation.$sym130$CHAR)) {
            expansion = (SubLObject)ConsesLow.list((SubLObject)form_translation.$sym131$SET_CHAR, conses_high.second(place), conses_high.third(place), value);
        }
        else if (pcase_var.eql((SubLObject)form_translation.$sym132$AREF)) {
            expansion = (SubLObject)ConsesLow.list((SubLObject)form_translation.$sym133$SET_AREF, conses_high.second(place), conses_high.third(place), value);
        }
        else if (pcase_var.eql((SubLObject)form_translation.$sym134$GET)) {
            expansion = (SubLObject)ConsesLow.list((SubLObject)form_translation.$sym135$PUT, conses_high.second(place), conses_high.third(place), value);
        }
        else if (pcase_var.eql((SubLObject)form_translation.$sym136$SYMBOL_VALUE)) {
            expansion = (SubLObject)ConsesLow.list((SubLObject)form_translation.$sym137$SET, conses_high.second(place), value);
        }
        else {
            SubLObject current_$9;
            final SubLObject datum_$8 = current_$9 = place;
            SubLObject accessor_$10 = (SubLObject)form_translation.NIL;
            SubLObject expression = (SubLObject)form_translation.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current_$9, datum_$8, (SubLObject)form_translation.$list138);
            accessor_$10 = current_$9.first();
            current_$9 = current_$9.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current_$9, datum_$8, (SubLObject)form_translation.$list138);
            expression = current_$9.first();
            current_$9 = current_$9.rest();
            if (form_translation.NIL == current_$9) {
                final SubLObject setter = translator_setter_from_accessor(accessor_$10);
                expansion = (SubLObject)ConsesLow.list(setter, expression, value);
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(datum_$8, (SubLObject)form_translation.$list138);
            }
        }
        return translate_form(expansion);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/form-translation.lisp", position = 28626L)
    public static SubLObject translator_setter_from_accessor(final SubLObject accessor) {
        return Functions.funcall((SubLObject)form_translation.$sym139$SETTER_FROM_ACCESSOR, accessor);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/form-translation.lisp", position = 28816L)
    public static SubLObject translate_csetq(final SubLObject form) {
        SubLObject operator = (SubLObject)form_translation.NIL;
        SubLObject var = (SubLObject)form_translation.NIL;
        SubLObject value = (SubLObject)form_translation.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(form, form, (SubLObject)form_translation.$list140);
        operator = form.first();
        SubLObject current = form.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, form, (SubLObject)form_translation.$list140);
        var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, form, (SubLObject)form_translation.$list140);
        value = current.first();
        final SubLObject var_val_pairs;
        current = (var_val_pairs = current.rest());
        list_utilities.verify_operator(operator, (SubLObject)form_translation.$sym49$CSETQ);
        translate_possibly_note_global_modification(var);
        final SubLObject translated_variable = translate_variable(var);
        final SubLObject translated_value = translate_form(value);
        if (form_translation.NIL == var_val_pairs) {
            return (SubLObject)ConsesLow.list((SubLObject)form_translation.$sym49$CSETQ, translated_variable, translated_value);
        }
        final SubLObject more_forms = translate_csetq_int(var_val_pairs);
        return (SubLObject)ConsesLow.listS((SubLObject)form_translation.$sym94$PROGN, (SubLObject)ConsesLow.list((SubLObject)form_translation.$sym49$CSETQ, translated_variable, translated_value), ConsesLow.append(more_forms, (SubLObject)form_translation.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/form-translation.lisp", position = 29386L)
    public static SubLObject translate_csetq_int(final SubLObject var_val_pairs) {
        if (form_translation.NIL == var_val_pairs) {
            return (SubLObject)form_translation.NIL;
        }
        SubLObject var = (SubLObject)form_translation.NIL;
        SubLObject value = (SubLObject)form_translation.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(var_val_pairs, var_val_pairs, (SubLObject)form_translation.$list141);
        var = var_val_pairs.first();
        SubLObject current = var_val_pairs.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, var_val_pairs, (SubLObject)form_translation.$list141);
        value = current.first();
        final SubLObject more_var_val_pairs;
        current = (more_var_val_pairs = current.rest());
        translate_possibly_note_global_modification(var);
        final SubLObject translated_variable = translate_variable(var);
        final SubLObject translated_value = translate_form(value);
        final SubLObject more_forms = translate_csetq_int(more_var_val_pairs);
        return reader.bq_cons((SubLObject)ConsesLow.list((SubLObject)form_translation.$sym49$CSETQ, translated_variable, translated_value), ConsesLow.append(more_forms, (SubLObject)form_translation.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/form-translation.lisp", position = 29861L)
    public static SubLObject translate_possibly_note_global_modification(final SubLObject variable) {
        final SubLObject pcase_var;
        final SubLObject binding_type = pcase_var = translator_variable_binding_type(variable);
        if (pcase_var.eql((SubLObject)form_translation.$kw6$LEXICAL) || pcase_var.eql((SubLObject)form_translation.$kw4$DYNAMIC)) {
            xref_database.xref_note_global_modification(variable);
            return (SubLObject)form_translation.T;
        }
        return (SubLObject)form_translation.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/form-translation.lisp", position = 30120L)
    public static SubLObject translate_csome(final SubLObject form) {
        SubLObject operator = (SubLObject)form_translation.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(form, form, (SubLObject)form_translation.$list142);
        operator = form.first();
        SubLObject current = form.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, form, (SubLObject)form_translation.$list142);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject var = (SubLObject)form_translation.NIL;
        SubLObject listform = (SubLObject)form_translation.NIL;
        SubLObject endvar = (SubLObject)form_translation.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, form, (SubLObject)form_translation.$list142);
        var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, form, (SubLObject)form_translation.$list142);
        listform = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, form, (SubLObject)form_translation.$list142);
        endvar = current.first();
        current = current.rest();
        if (form_translation.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            list_utilities.verify_operator(operator, (SubLObject)form_translation.$sym143$CSOME);
            final SubLObject csome_list_var = (SubLObject)form_translation.$sym144$CSOME_LIST_VAR;
            return translate_punless((SubLObject)ConsesLow.list((SubLObject)form_translation.$sym119$PUNLESS, endvar, (SubLObject)ConsesLow.list((SubLObject)form_translation.$sym70$CLET_LOCAL, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(csome_list_var, listform)), (SubLObject)ConsesLow.listS((SubLObject)form_translation.$sym71$FOR, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(var, (SubLObject)ConsesLow.list((SubLObject)form_translation.$sym72$FIRST, csome_list_var))), (SubLObject)ConsesLow.list((SubLObject)form_translation.$sym51$CNOT, (SubLObject)ConsesLow.list((SubLObject)form_translation.$sym102$COR, endvar, (SubLObject)ConsesLow.list((SubLObject)form_translation.$sym73$NULL, csome_list_var))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)form_translation.$sym49$CSETQ, csome_list_var, (SubLObject)ConsesLow.list((SubLObject)form_translation.$sym74$REST, csome_list_var)), (SubLObject)ConsesLow.list((SubLObject)form_translation.$sym49$CSETQ, var, (SubLObject)ConsesLow.list((SubLObject)form_translation.$sym72$FIRST, csome_list_var)))), ConsesLow.append(body, (SubLObject)form_translation.NIL)))));
        }
        cdestructuring_bind.cdestructuring_bind_error(form, (SubLObject)form_translation.$list142);
        return (SubLObject)form_translation.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/form-translation.lisp", position = 30646L)
    public static SubLObject translate_ctime(final SubLObject form) {
        SubLObject operator = (SubLObject)form_translation.NIL;
        SubLObject var = (SubLObject)form_translation.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(form, form, (SubLObject)form_translation.$list145);
        operator = form.first();
        SubLObject current = form.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, form, (SubLObject)form_translation.$list145);
        var = current.first();
        final SubLObject body;
        current = (body = current.rest());
        list_utilities.verify_operator(operator, (SubLObject)form_translation.$sym146$CTIME);
        final SubLObject time_var = (SubLObject)form_translation.$sym147$TIME_VAR;
        return translate_clet_local((SubLObject)ConsesLow.listS((SubLObject)form_translation.$sym70$CLET_LOCAL, (SubLObject)ConsesLow.list(reader.bq_cons(time_var, (SubLObject)form_translation.$list148)), ConsesLow.append(body, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)form_translation.$sym49$CSETQ, var, (SubLObject)ConsesLow.listS((SubLObject)form_translation.$sym149$_, (SubLObject)ConsesLow.list((SubLObject)form_translation.$sym45$_, (SubLObject)form_translation.$list150, time_var), (SubLObject)form_translation.$list151))))));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/form-translation.lisp", position = 31039L)
    public static SubLObject translate_cunwind_protect(final SubLObject form) {
        SubLObject operator = (SubLObject)form_translation.NIL;
        SubLObject protected_form = (SubLObject)form_translation.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(form, form, (SubLObject)form_translation.$list152);
        operator = form.first();
        SubLObject current = form.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, form, (SubLObject)form_translation.$list152);
        protected_form = current.first();
        final SubLObject body;
        current = (body = current.rest());
        list_utilities.verify_operator(operator, (SubLObject)form_translation.$sym153$CUNWIND_PROTECT);
        final SubLObject translated_protected_form = translate_binding_construct_form(protected_form);
        final SubLObject translated_body = translate_body(body);
        final SubLObject cunwind_protect_env_var = (SubLObject)form_translation.$sym154$CUNWIND_PROTECT_ENV_VAR;
        return common_optimization.translator_optimize_Xcunwind_protect((SubLObject)ConsesLow.listS((SubLObject)form_translation.$sym155$_CUNWIND_PROTECT, cunwind_protect_env_var, translated_protected_form, ConsesLow.append(translated_body, (SubLObject)form_translation.NIL)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/form-translation.lisp", position = 31569L)
    public static SubLObject translate_cvs_id(final SubLObject form) {
        return form;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/form-translation.lisp", position = 31635L)
    public static SubLObject translate_declaim(final SubLObject form) {
        SubLObject operator = (SubLObject)form_translation.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(form, form, (SubLObject)form_translation.$list156);
        operator = form.first();
        final SubLObject declaration_specifiers;
        final SubLObject current = declaration_specifiers = form.rest();
        list_utilities.verify_operator(operator, (SubLObject)form_translation.$sym157$DECLAIM);
        SubLObject result_forms = (SubLObject)form_translation.NIL;
        SubLObject cdolist_list_var = declaration_specifiers;
        SubLObject declaration_specifier = (SubLObject)form_translation.NIL;
        declaration_specifier = cdolist_list_var.first();
        while (form_translation.NIL != cdolist_list_var) {
            result_forms = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)form_translation.$sym158$PROCLAIM, list_utilities.quotify(declaration_specifier)), result_forms);
            cdolist_list_var = cdolist_list_var.rest();
            declaration_specifier = cdolist_list_var.first();
        }
        return translate_progn(reader.bq_cons((SubLObject)form_translation.$sym94$PROGN, ConsesLow.append(Sequences.nreverse(result_forms), (SubLObject)form_translation.NIL)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/form-translation.lisp", position = 32038L)
    public static SubLObject translate_declare(final SubLObject form) {
        SubLObject operator = (SubLObject)form_translation.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(form, form, (SubLObject)form_translation.$list159);
        operator = form.first();
        final SubLObject declarations;
        final SubLObject current = declarations = form.rest();
        list_utilities.verify_operator(operator, (SubLObject)form_translation.$sym160$DECLARE);
        return translate_empty_progn(form);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/form-translation.lisp", position = 32257L)
    public static SubLObject translate_defconstant(final SubLObject form) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject operator = (SubLObject)form_translation.NIL;
        SubLObject variable = (SubLObject)form_translation.NIL;
        SubLObject initialization = (SubLObject)form_translation.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(form, form, (SubLObject)form_translation.$list161);
        operator = form.first();
        SubLObject current = form.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, form, (SubLObject)form_translation.$list161);
        variable = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, form, (SubLObject)form_translation.$list161);
        initialization = current.first();
        current = current.rest();
        final SubLObject documentation = (SubLObject)(current.isCons() ? current.first() : form_translation.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, form, (SubLObject)form_translation.$list161);
        current = current.rest();
        if (form_translation.NIL != current) {
            cdestructuring_bind.cdestructuring_bind_error(form, (SubLObject)form_translation.$list161);
            return (SubLObject)form_translation.NIL;
        }
        list_utilities.verify_operator(operator, (SubLObject)form_translation.$sym162$DEFCONSTANT);
        file_translation.tsf_possibly_note_defined_global_binding_type(variable, (SubLObject)form_translation.$kw8$CONSTANT);
        SubLObject translated_form = (SubLObject)form_translation.NIL;
        final SubLObject global_var = variable;
        assert form_translation.NIL != Types.symbolp(global_var) : global_var;
        final SubLObject _prev_bind_0 = xref_database.$xref_global_scope$.currentBinding(thread);
        try {
            xref_database.$xref_global_scope$.bind(global_var, thread);
            xref_database.xref_note_global_definition(variable);
            xref_database.xref_note_global_binding_type(variable, (SubLObject)form_translation.$kw8$CONSTANT);
            final SubLObject translated_initialization = translate_form(initialization);
            translated_form = (SubLObject)ConsesLow.listS((SubLObject)form_translation.$sym162$DEFCONSTANT, variable, translated_initialization, ConsesLow.append((SubLObject)((form_translation.NIL != documentation) ? ConsesLow.list(documentation) : form_translation.NIL), (SubLObject)form_translation.NIL));
        }
        finally {
            xref_database.$xref_global_scope$.rebind(_prev_bind_0, thread);
        }
        return translated_form;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/form-translation.lisp", position = 32908L)
    public static SubLObject translate_define(final SubLObject form) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject operator = (SubLObject)form_translation.NIL;
        SubLObject name = (SubLObject)form_translation.NIL;
        SubLObject arglist = (SubLObject)form_translation.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(form, form, (SubLObject)form_translation.$list164);
        operator = form.first();
        SubLObject current = form.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, form, (SubLObject)form_translation.$list164);
        name = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, form, (SubLObject)form_translation.$list164);
        arglist = current.first();
        final SubLObject body;
        current = (body = current.rest());
        list_utilities.verify_operator(operator, (SubLObject)form_translation.$sym165$DEFINE);
        file_translation.tsf_possibly_note_defined_function_arglist(name, arglist);
        SubLObject current_$12;
        final SubLObject datum_$11 = current_$12 = body;
        SubLObject documentation = (SubLObject)form_translation.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current_$12, datum_$11, (SubLObject)form_translation.$list166);
        documentation = current_$12.first();
        SubLObject real_body;
        current_$12 = (real_body = current_$12.rest());
        if (!documentation.isString()) {
            documentation = (SubLObject)form_translation.NIL;
            real_body = body;
        }
        SubLObject translated_form = (SubLObject)form_translation.NIL;
        final SubLObject method_var = name;
        assert form_translation.NIL != Types.symbolp(method_var) : method_var;
        final SubLObject _prev_bind_0 = xref_database.$xref_method_scope$.currentBinding(thread);
        try {
            xref_database.$xref_method_scope$.bind(method_var, thread);
            xref_database.xref_note_function_definition(name);
            xref_database.xref_note_method_formal_arglist(name, arglist);
            final SubLObject translated_arglist = translate_arglist(arglist);
            final SubLObject translated_real_body = translate_method_body(name, real_body);
            translated_form = (SubLObject)ConsesLow.listS((SubLObject)form_translation.$sym165$DEFINE, name, translated_arglist, ConsesLow.append((SubLObject)((form_translation.NIL != documentation) ? ConsesLow.list(documentation) : form_translation.NIL), translated_real_body, (SubLObject)form_translation.NIL));
        }
        finally {
            xref_database.$xref_method_scope$.rebind(_prev_bind_0, thread);
        }
        translator_consider_expansion_factor(name, form, translated_form);
        return translated_form;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/form-translation.lisp", position = 33952L)
    public static SubLObject translator_current_method() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return form_translation.$translator_current_method$.getDynamicValue(thread);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/form-translation.lisp", position = 34035L)
    public static SubLObject translate_method_body(final SubLObject name, final SubLObject body) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject translated_body = (SubLObject)form_translation.NIL;
        final SubLObject _prev_bind_0 = form_translation.$translator_current_method$.currentBinding(thread);
        try {
            form_translation.$translator_current_method$.bind(name, thread);
            translated_body = translate_method_possibly_add_final_ret(body);
            translated_body = translate_method_possibly_add_entry(name, body);
            translated_body = translate_body(translated_body);
            translated_body = translate_method_possibly_add_with_current_thread(translated_body);
        }
        finally {
            form_translation.$translator_current_method$.rebind(_prev_bind_0, thread);
        }
        return translated_body;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/form-translation.lisp", position = 34505L)
    public static SubLObject translate_method_possibly_add_final_ret(final SubLObject body) {
        if (form_translation.NIL == body) {
            return conses_high.copy_tree((SubLObject)form_translation.$list167);
        }
        final SubLObject last_cons = conses_high.last(body, (SubLObject)form_translation.UNPROVIDED);
        final SubLObject last_form = last_cons.first();
        if (last_form.isCons()) {
            SubLObject current;
            final SubLObject datum = current = last_form;
            SubLObject operator = (SubLObject)form_translation.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)form_translation.$list12);
            operator = current.first();
            final SubLObject args;
            current = (args = current.rest());
            if (form_translation.$sym168$RET == operator) {
                return body;
            }
        }
        final SubLObject final_ret_forms = conses_high.copy_tree((SubLObject)form_translation.$list167);
        ConsesLow.rplacd(last_cons, final_ret_forms);
        return body;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/form-translation.lisp", position = 34948L)
    public static SubLObject translate_method_possibly_add_entry(final SubLObject name, SubLObject body) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (form_translation.NIL != complex_special_forms.$call_profiling_enabledP$.getDynamicValue(thread)) {
            body = reader.bq_cons((SubLObject)ConsesLow.list((SubLObject)form_translation.$sym169$POSSIBLY_NOTE_FUNCTION_ENTRY, (SubLObject)ConsesLow.list((SubLObject)form_translation.$sym83$QUOTE, name)), ConsesLow.append(body, (SubLObject)form_translation.NIL));
        }
        return body;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/form-translation.lisp", position = 35140L)
    public static SubLObject translate_method_possibly_add_with_current_thread(SubLObject translated_body) {
        if (form_translation.NIL != translator_body_accesses_current_thread_p(translated_body)) {
            final SubLObject thread = (SubLObject)form_translation.$sym170$THREAD;
            translated_body = (SubLObject)ConsesLow.list((SubLObject)ConsesLow.listS((SubLObject)form_translation.$sym171$_WITH_CURRENT_THREAD, thread, ConsesLow.append(translated_body, (SubLObject)form_translation.NIL)));
        }
        return translated_body;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/form-translation.lisp", position = 35441L)
    public static SubLObject translator_body_accesses_current_thread_p(final SubLObject body) {
        return list_utilities.tree_find_if((SubLObject)form_translation.$sym172$TRANSLATOR_CURRENT_THREAD_ACCESS_CONSTRUCT_P, body, (SubLObject)form_translation.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/form-translation.lisp", position = 35582L)
    public static SubLObject translator_current_thread_access_construct_p(final SubLObject v_object) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return (SubLObject)SubLObjectFactory.makeBoolean(v_object.isSymbol() && form_translation.NIL != list_utilities.member_eqP(v_object, (SubLObject)form_translation.$list173));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/form-translation.lisp", position = 35796L)
    public static SubLObject translate_deflexical(final SubLObject form) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject operator = (SubLObject)form_translation.NIL;
        SubLObject variable = (SubLObject)form_translation.NIL;
        SubLObject initialization = (SubLObject)form_translation.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(form, form, (SubLObject)form_translation.$list161);
        operator = form.first();
        SubLObject current = form.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, form, (SubLObject)form_translation.$list161);
        variable = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, form, (SubLObject)form_translation.$list161);
        initialization = current.first();
        current = current.rest();
        final SubLObject documentation = (SubLObject)(current.isCons() ? current.first() : form_translation.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, form, (SubLObject)form_translation.$list161);
        current = current.rest();
        if (form_translation.NIL != current) {
            cdestructuring_bind.cdestructuring_bind_error(form, (SubLObject)form_translation.$list161);
            return (SubLObject)form_translation.NIL;
        }
        list_utilities.verify_operator(operator, (SubLObject)form_translation.$sym174$DEFLEXICAL);
        file_translation.tsf_possibly_note_defined_global_binding_type(variable, (SubLObject)form_translation.$kw6$LEXICAL);
        SubLObject translated_form = (SubLObject)form_translation.NIL;
        final SubLObject global_var = variable;
        assert form_translation.NIL != Types.symbolp(global_var) : global_var;
        final SubLObject _prev_bind_0 = xref_database.$xref_global_scope$.currentBinding(thread);
        try {
            xref_database.$xref_global_scope$.bind(global_var, thread);
            xref_database.xref_note_global_definition(variable);
            xref_database.xref_note_global_binding_type(variable, (SubLObject)form_translation.$kw6$LEXICAL);
            final SubLObject translated_initialization = translate_form(initialization);
            translated_form = (SubLObject)ConsesLow.listS((SubLObject)form_translation.$sym174$DEFLEXICAL, variable, translated_initialization, ConsesLow.append((SubLObject)((form_translation.NIL != documentation) ? ConsesLow.list(documentation) : form_translation.NIL), (SubLObject)form_translation.NIL));
        }
        finally {
            xref_database.$xref_global_scope$.rebind(_prev_bind_0, thread);
        }
        return translated_form;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/form-translation.lisp", position = 36441L)
    public static SubLObject translate_defmacro(final SubLObject form) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject operator = (SubLObject)form_translation.NIL;
        SubLObject name = (SubLObject)form_translation.NIL;
        SubLObject pattern = (SubLObject)form_translation.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(form, form, (SubLObject)form_translation.$list175);
        operator = form.first();
        SubLObject current = form.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, form, (SubLObject)form_translation.$list175);
        name = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, form, (SubLObject)form_translation.$list175);
        pattern = current.first();
        final SubLObject body;
        current = (body = current.rest());
        list_utilities.verify_operator(operator, (SubLObject)form_translation.$sym176$DEFMACRO);
        SubLObject current_$14;
        final SubLObject datum_$13 = current_$14 = body;
        SubLObject documentation = (SubLObject)form_translation.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current_$14, datum_$13, (SubLObject)form_translation.$list166);
        documentation = current_$14.first();
        SubLObject real_body;
        current_$14 = (real_body = current_$14.rest());
        if (!documentation.isString()) {
            documentation = (SubLObject)form_translation.NIL;
            real_body = body;
        }
        final SubLObject macroexpander_arglist = (SubLObject)form_translation.$list177;
        final SubLObject macroexpander_body = (SubLObject)ConsesLow.list((SubLObject)ConsesLow.listS((SubLObject)form_translation.$sym178$CDESTRUCTURING_BIND, pattern, (SubLObject)form_translation.$list179, ConsesLow.append(real_body, (SubLObject)form_translation.NIL)));
        SubLObject translated_form = (SubLObject)form_translation.NIL;
        final SubLObject method_var = name;
        assert form_translation.NIL != Types.symbolp(method_var) : method_var;
        final SubLObject _prev_bind_0 = xref_database.$xref_method_scope$.currentBinding(thread);
        try {
            xref_database.$xref_method_scope$.bind(method_var, thread);
            xref_database.xref_note_macro_definition(name);
            xref_database.xref_note_method_formal_arglist(name, pattern);
            final SubLObject translated_arglist = macroexpander_arglist;
            final SubLObject translated_body = translate_method_body(name, macroexpander_body);
            translated_form = (SubLObject)ConsesLow.listS((SubLObject)form_translation.$sym180$DEFINE_MACROEXPANDER, name, translated_arglist, ConsesLow.append((SubLObject)((form_translation.NIL != documentation) ? ConsesLow.list(documentation) : form_translation.NIL), translated_body, (SubLObject)form_translation.NIL));
        }
        finally {
            xref_database.$xref_method_scope$.rebind(_prev_bind_0, thread);
        }
        translator_consider_expansion_factor(name, form, translated_form);
        return translated_form;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/form-translation.lisp", position = 37462L)
    public static SubLObject translate_defparameter(final SubLObject form) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject operator = (SubLObject)form_translation.NIL;
        SubLObject variable = (SubLObject)form_translation.NIL;
        SubLObject initialization = (SubLObject)form_translation.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(form, form, (SubLObject)form_translation.$list161);
        operator = form.first();
        SubLObject current = form.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, form, (SubLObject)form_translation.$list161);
        variable = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, form, (SubLObject)form_translation.$list161);
        initialization = current.first();
        current = current.rest();
        final SubLObject documentation = (SubLObject)(current.isCons() ? current.first() : form_translation.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, form, (SubLObject)form_translation.$list161);
        current = current.rest();
        if (form_translation.NIL != current) {
            cdestructuring_bind.cdestructuring_bind_error(form, (SubLObject)form_translation.$list161);
            return (SubLObject)form_translation.NIL;
        }
        list_utilities.verify_operator(operator, (SubLObject)form_translation.$sym181$DEFPARAMETER);
        file_translation.tsf_possibly_note_defined_global_binding_type(variable, (SubLObject)form_translation.$kw4$DYNAMIC);
        SubLObject translated_form = (SubLObject)form_translation.NIL;
        final SubLObject global_var = variable;
        assert form_translation.NIL != Types.symbolp(global_var) : global_var;
        final SubLObject _prev_bind_0 = xref_database.$xref_global_scope$.currentBinding(thread);
        try {
            xref_database.$xref_global_scope$.bind(global_var, thread);
            xref_database.xref_note_global_definition(variable);
            xref_database.xref_note_global_binding_type(variable, (SubLObject)form_translation.$kw4$DYNAMIC);
            final SubLObject translated_initialization = translate_form(initialization);
            translated_form = (SubLObject)ConsesLow.listS((SubLObject)form_translation.$sym181$DEFPARAMETER, variable, translated_initialization, ConsesLow.append((SubLObject)((form_translation.NIL != documentation) ? ConsesLow.list(documentation) : form_translation.NIL), (SubLObject)form_translation.NIL));
        }
        finally {
            xref_database.$xref_global_scope$.rebind(_prev_bind_0, thread);
        }
        return translated_form;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/form-translation.lisp", position = 38115L)
    public static SubLObject translate_defstruct(final SubLObject form) {
        SubLObject operator = (SubLObject)form_translation.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(form, form, (SubLObject)form_translation.$list182);
        operator = form.first();
        SubLObject current = form.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, form, (SubLObject)form_translation.$list182);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject name = (SubLObject)form_translation.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, form, (SubLObject)form_translation.$list182);
        name = current.first();
        final SubLObject options;
        current = (options = current.rest());
        final SubLObject v_slots;
        current = (v_slots = temp);
        list_utilities.verify_operator(operator, (SubLObject)form_translation.$sym183$DEFSTRUCT);
        final SubLObject analysis = complex_special_forms.defstruct_analyze(name, options, v_slots);
        translate_defstruct_ensure_translated_constants(analysis);
        final SubLObject class_form = reader.bq_cons((SubLObject)form_translation.$sym184$_DEFSTRUCT_CLASS, ConsesLow.append(analysis, (SubLObject)form_translation.NIL));
        final SubLObject translated_form = translate_form_via_macroexpansion(form);
        SubLObject current_$16;
        final SubLObject datum_$15 = current_$16 = translated_form;
        SubLObject operator_$17 = (SubLObject)form_translation.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current_$16, datum_$15, (SubLObject)form_translation.$list185);
        operator_$17 = current_$16.first();
        final SubLObject translated_body;
        current_$16 = (translated_body = current_$16.rest());
        list_utilities.verify_operator(operator_$17, (SubLObject)form_translation.$sym94$PROGN);
        final SubLObject final_translated_form = (SubLObject)ConsesLow.listS((SubLObject)form_translation.$sym94$PROGN, class_form, ConsesLow.append(translated_body, (SubLObject)form_translation.NIL));
        return final_translated_form;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/form-translation.lisp", position = 38781L)
    public static SubLObject translate_defstruct_ensure_translated_constants(final SubLObject analysis) {
        final SubLObject name_tail = cdestructuring_bind.property_list_member((SubLObject)form_translation.$kw186$NAME, analysis);
        final SubLObject name = (SubLObject)((form_translation.NIL != name_tail) ? conses_high.cadr(name_tail) : form_translation.NIL);
        final SubLObject c_structure_tag_tail = cdestructuring_bind.property_list_member((SubLObject)form_translation.$kw187$C_STRUCTURE_TAG, analysis);
        final SubLObject c_structure_tag = (SubLObject)((form_translation.NIL != c_structure_tag_tail) ? conses_high.cadr(c_structure_tag_tail) : form_translation.NIL);
        final SubLObject predicate_tail = cdestructuring_bind.property_list_member((SubLObject)form_translation.$kw188$PREDICATE, analysis);
        final SubLObject predicate = (SubLObject)((form_translation.NIL != predicate_tail) ? conses_high.cadr(predicate_tail) : form_translation.NIL);
        final SubLObject slots_tail = cdestructuring_bind.property_list_member((SubLObject)form_translation.$kw189$SLOTS, analysis);
        final SubLObject v_slots = (SubLObject)((form_translation.NIL != slots_tail) ? conses_high.cadr(slots_tail) : form_translation.NIL);
        final SubLObject slot_keywords_tail = cdestructuring_bind.property_list_member((SubLObject)form_translation.$kw190$SLOT_KEYWORDS, analysis);
        final SubLObject slot_keywords = (SubLObject)((form_translation.NIL != slot_keywords_tail) ? conses_high.cadr(slot_keywords_tail) : form_translation.NIL);
        final SubLObject getters_tail = cdestructuring_bind.property_list_member((SubLObject)form_translation.$kw191$GETTERS, analysis);
        final SubLObject getters = (SubLObject)((form_translation.NIL != getters_tail) ? conses_high.cadr(getters_tail) : form_translation.NIL);
        final SubLObject setters_tail = cdestructuring_bind.property_list_member((SubLObject)form_translation.$kw192$SETTERS, analysis);
        final SubLObject setters = (SubLObject)((form_translation.NIL != setters_tail) ? conses_high.cadr(setters_tail) : form_translation.NIL);
        final SubLObject print_function_tail = cdestructuring_bind.property_list_member((SubLObject)form_translation.$kw193$PRINT_FUNCTION, analysis);
        SubLObject print_function = (SubLObject)((form_translation.NIL != print_function_tail) ? conses_high.cadr(print_function_tail) : form_translation.NIL);
        if (form_translation.NIL == print_function) {
            print_function = (SubLObject)form_translation.$sym194$DEFAULT_STRUCT_PRINT_FUNCTION;
        }
        translate_form((SubLObject)ConsesLow.list((SubLObject)form_translation.$sym83$QUOTE, name));
        translate_form((SubLObject)ConsesLow.list((SubLObject)form_translation.$sym83$QUOTE, predicate));
        translate_form((SubLObject)ConsesLow.list((SubLObject)form_translation.$sym83$QUOTE, c_structure_tag));
        translate_form((SubLObject)ConsesLow.list((SubLObject)form_translation.$sym83$QUOTE, v_slots));
        translate_form((SubLObject)ConsesLow.list((SubLObject)form_translation.$sym83$QUOTE, slot_keywords));
        translate_form((SubLObject)ConsesLow.list((SubLObject)form_translation.$sym83$QUOTE, getters));
        translate_form((SubLObject)ConsesLow.list((SubLObject)form_translation.$sym83$QUOTE, setters));
        translate_form((SubLObject)ConsesLow.list((SubLObject)form_translation.$sym83$QUOTE, print_function));
        SubLObject end_var;
        SubLObject index;
        for (end_var = Numbers.add((SubLObject)form_translation.TWO_INTEGER, Sequences.length(v_slots)), index = (SubLObject)form_translation.NIL, index = (SubLObject)form_translation.TWO_INTEGER; !index.numGE(end_var); index = number_utilities.f_1X(index)) {
            translate_form((SubLObject)ConsesLow.list((SubLObject)form_translation.$sym83$QUOTE, index));
        }
        return (SubLObject)form_translation.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/form-translation.lisp", position = 39603L)
    public static SubLObject translate_defvar(final SubLObject form) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject operator = (SubLObject)form_translation.NIL;
        SubLObject variable = (SubLObject)form_translation.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(form, form, (SubLObject)form_translation.$list195);
        operator = form.first();
        SubLObject current = form.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, form, (SubLObject)form_translation.$list195);
        variable = current.first();
        current = current.rest();
        final SubLObject initialization = (SubLObject)(current.isCons() ? current.first() : form_translation.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, form, (SubLObject)form_translation.$list195);
        current = current.rest();
        final SubLObject documentation = (SubLObject)(current.isCons() ? current.first() : form_translation.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, form, (SubLObject)form_translation.$list195);
        current = current.rest();
        if (form_translation.NIL != current) {
            cdestructuring_bind.cdestructuring_bind_error(form, (SubLObject)form_translation.$list195);
            return (SubLObject)form_translation.NIL;
        }
        list_utilities.verify_operator(operator, (SubLObject)form_translation.$sym196$DEFVAR);
        file_translation.tsf_possibly_note_defined_global_binding_type(variable, (SubLObject)form_translation.$kw4$DYNAMIC);
        SubLObject translated_form = (SubLObject)form_translation.NIL;
        final SubLObject global_var = variable;
        assert form_translation.NIL != Types.symbolp(global_var) : global_var;
        final SubLObject _prev_bind_0 = xref_database.$xref_global_scope$.currentBinding(thread);
        try {
            xref_database.$xref_global_scope$.bind(global_var, thread);
            xref_database.xref_note_global_definition(variable);
            xref_database.xref_note_global_binding_type(variable, (SubLObject)form_translation.$kw4$DYNAMIC);
            final SubLObject translated_initialization = translate_form(initialization);
            translated_form = (SubLObject)ConsesLow.listS((SubLObject)form_translation.$sym196$DEFVAR, variable, translated_initialization, ConsesLow.append((SubLObject)((form_translation.NIL != documentation) ? ConsesLow.list(documentation) : form_translation.NIL), (SubLObject)form_translation.NIL));
        }
        finally {
            xref_database.$xref_global_scope$.rebind(_prev_bind_0, thread);
        }
        return translated_form;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/form-translation.lisp", position = 40232L)
    public static SubLObject translate_Xdtb(final SubLObject form) {
        SubLObject operator = (SubLObject)form_translation.NIL;
        SubLObject condition = (SubLObject)form_translation.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(form, form, (SubLObject)form_translation.$list197);
        operator = form.first();
        SubLObject current = form.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, form, (SubLObject)form_translation.$list197);
        condition = current.first();
        current = current.rest();
        if (form_translation.NIL == current) {
            list_utilities.verify_operator(operator, (SubLObject)form_translation.$sym35$_DTB);
            final SubLObject translated_condition = translate_form(condition);
            return common_optimization.translator_optimize_Xdtb((SubLObject)ConsesLow.list((SubLObject)form_translation.$sym35$_DTB, translated_condition));
        }
        cdestructuring_bind.cdestructuring_bind_error(form, (SubLObject)form_translation.$list197);
        return (SubLObject)form_translation.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/form-translation.lisp", position = 40500L)
    public static SubLObject translate_enforce_type(final SubLObject form) {
        SubLObject operator = (SubLObject)form_translation.NIL;
        SubLObject v_object = (SubLObject)form_translation.NIL;
        SubLObject pred = (SubLObject)form_translation.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(form, form, (SubLObject)form_translation.$list81);
        operator = form.first();
        SubLObject current = form.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, form, (SubLObject)form_translation.$list81);
        v_object = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, form, (SubLObject)form_translation.$list81);
        pred = current.first();
        current = current.rest();
        if (form_translation.NIL == current) {
            list_utilities.verify_operator(operator, (SubLObject)form_translation.$sym198$ENFORCE_TYPE);
            xref_database.xref_note_function_call(pred);
            final SubLObject translated_object = translate_form(v_object);
            final SubLObject translated_pred = translate_function_symbol(pred);
            translate_form((SubLObject)ConsesLow.list((SubLObject)form_translation.$sym83$QUOTE, pred));
            return (SubLObject)ConsesLow.list((SubLObject)form_translation.$sym199$_DP_ENFORCE_TYPE, translated_object, translated_pred);
        }
        cdestructuring_bind.cdestructuring_bind_error(form, (SubLObject)form_translation.$list81);
        return (SubLObject)form_translation.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/form-translation.lisp", position = 40987L)
    public static SubLObject translate_enforce_must(final SubLObject form) {
        SubLObject operator = (SubLObject)form_translation.NIL;
        SubLObject form_$18 = (SubLObject)form_translation.NIL;
        SubLObject format_string = (SubLObject)form_translation.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(form, form, (SubLObject)form_translation.$list200);
        operator = form.first();
        SubLObject current = form.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, form, (SubLObject)form_translation.$list200);
        form_$18 = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, form, (SubLObject)form_translation.$list200);
        format_string = current.first();
        final SubLObject v_arguments;
        current = (v_arguments = current.rest());
        list_utilities.verify_operator(operator, (SubLObject)form_translation.$sym201$ENFORCE_MUST);
        return translate_punless((SubLObject)ConsesLow.list((SubLObject)form_translation.$sym119$PUNLESS, form_$18, (SubLObject)ConsesLow.listS((SubLObject)form_translation.$sym202$ERROR, format_string, ConsesLow.append(v_arguments, (SubLObject)form_translation.NIL))));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/form-translation.lisp", position = 41263L)
    public static SubLObject translate_fif(final SubLObject form) {
        SubLObject operator = (SubLObject)form_translation.NIL;
        SubLObject condition = (SubLObject)form_translation.NIL;
        SubLObject true_value = (SubLObject)form_translation.NIL;
        SubLObject false_value = (SubLObject)form_translation.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(form, form, (SubLObject)form_translation.$list203);
        operator = form.first();
        SubLObject current = form.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, form, (SubLObject)form_translation.$list203);
        condition = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, form, (SubLObject)form_translation.$list203);
        true_value = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, form, (SubLObject)form_translation.$list203);
        false_value = current.first();
        current = current.rest();
        if (form_translation.NIL == current) {
            list_utilities.verify_operator(operator, (SubLObject)form_translation.$sym204$FIF);
            final SubLObject translated_condition = translate_Xdtb((SubLObject)ConsesLow.list((SubLObject)form_translation.$sym35$_DTB, condition));
            final SubLObject translated_true_value = translate_form(true_value);
            final SubLObject translated_false_value = translate_form(false_value);
            return common_optimization.translator_optimize_fif((SubLObject)ConsesLow.list((SubLObject)form_translation.$sym204$FIF, translated_condition, translated_true_value, translated_false_value));
        }
        cdestructuring_bind.cdestructuring_bind_error(form, (SubLObject)form_translation.$list203);
        return (SubLObject)form_translation.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/form-translation.lisp", position = 41735L)
    public static SubLObject translate_function(final SubLObject form) {
        SubLObject operator = (SubLObject)form_translation.NIL;
        SubLObject symbol = (SubLObject)form_translation.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(form, form, (SubLObject)form_translation.$list205);
        operator = form.first();
        SubLObject current = form.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, form, (SubLObject)form_translation.$list205);
        symbol = current.first();
        current = current.rest();
        if (form_translation.NIL == current) {
            list_utilities.verify_operator(operator, (SubLObject)form_translation.$sym206$FUNCTION);
            return translate_form((SubLObject)ConsesLow.list((SubLObject)form_translation.$sym207$SYMBOL_FUNCTION, (SubLObject)ConsesLow.list((SubLObject)form_translation.$sym83$QUOTE, symbol)));
        }
        cdestructuring_bind.cdestructuring_bind_error(form, (SubLObject)form_translation.$list205);
        return (SubLObject)form_translation.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/form-translation.lisp", position = 41938L)
    public static SubLObject translate_funless(final SubLObject form) {
        SubLObject operator = (SubLObject)form_translation.NIL;
        SubLObject condition = (SubLObject)form_translation.NIL;
        SubLObject false_value = (SubLObject)form_translation.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(form, form, (SubLObject)form_translation.$list208);
        operator = form.first();
        SubLObject current = form.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, form, (SubLObject)form_translation.$list208);
        condition = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, form, (SubLObject)form_translation.$list208);
        false_value = current.first();
        current = current.rest();
        if (form_translation.NIL == current) {
            list_utilities.verify_operator(operator, (SubLObject)form_translation.$sym209$FUNLESS);
            return translate_fif((SubLObject)ConsesLow.list((SubLObject)form_translation.$sym204$FIF, condition, (SubLObject)form_translation.NIL, false_value));
        }
        cdestructuring_bind.cdestructuring_bind_error(form, (SubLObject)form_translation.$list208);
        return (SubLObject)form_translation.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/form-translation.lisp", position = 42159L)
    public static SubLObject translate_fwhen(final SubLObject form) {
        SubLObject operator = (SubLObject)form_translation.NIL;
        SubLObject condition = (SubLObject)form_translation.NIL;
        SubLObject true_value = (SubLObject)form_translation.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(form, form, (SubLObject)form_translation.$list210);
        operator = form.first();
        SubLObject current = form.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, form, (SubLObject)form_translation.$list210);
        condition = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, form, (SubLObject)form_translation.$list210);
        true_value = current.first();
        current = current.rest();
        if (form_translation.NIL == current) {
            list_utilities.verify_operator(operator, (SubLObject)form_translation.$sym211$FWHEN);
            return translate_fif((SubLObject)ConsesLow.listS((SubLObject)form_translation.$sym204$FIF, condition, true_value, (SubLObject)form_translation.$list212));
        }
        cdestructuring_bind.cdestructuring_bind_error(form, (SubLObject)form_translation.$list210);
        return (SubLObject)form_translation.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/form-translation.lisp", position = 42372L)
    public static SubLObject translate_ignore(final SubLObject form) {
        return translate_empty_progn(form);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/form-translation.lisp", position = 42462L)
    public static SubLObject translate_multiple_value_list(final SubLObject form) {
        SubLObject operator = (SubLObject)form_translation.NIL;
        SubLObject subform = (SubLObject)form_translation.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(form, form, (SubLObject)form_translation.$list213);
        operator = form.first();
        SubLObject current = form.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, form, (SubLObject)form_translation.$list213);
        subform = current.first();
        current = current.rest();
        if (form_translation.NIL == current) {
            list_utilities.verify_operator(operator, (SubLObject)form_translation.$sym214$MULTIPLE_VALUE_LIST);
            final SubLObject translated_subform = translate_form(subform);
            return (SubLObject)ConsesLow.list((SubLObject)form_translation.$sym214$MULTIPLE_VALUE_LIST, translated_subform);
        }
        cdestructuring_bind.cdestructuring_bind_error(form, (SubLObject)form_translation.$list213);
        return (SubLObject)form_translation.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/form-translation.lisp", position = 42755L)
    public static SubLObject translate_must(final SubLObject form) {
        SubLObject operator = (SubLObject)form_translation.NIL;
        SubLObject form_$19 = (SubLObject)form_translation.NIL;
        SubLObject format_string = (SubLObject)form_translation.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(form, form, (SubLObject)form_translation.$list200);
        operator = form.first();
        SubLObject current = form.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, form, (SubLObject)form_translation.$list200);
        form_$19 = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, form, (SubLObject)form_translation.$list200);
        format_string = current.first();
        final SubLObject v_arguments;
        current = (v_arguments = current.rest());
        list_utilities.verify_operator(operator, (SubLObject)form_translation.$sym215$MUST);
        return translate_punless((SubLObject)ConsesLow.list((SubLObject)form_translation.$sym119$PUNLESS, (SubLObject)form_translation.$sym216$_IGNORE_MUSTS__, (SubLObject)ConsesLow.listS((SubLObject)form_translation.$sym201$ENFORCE_MUST, form_$19, format_string, ConsesLow.append(v_arguments, (SubLObject)form_translation.NIL))));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/form-translation.lisp", position = 43030L)
    public static SubLObject translate_nth_value(final SubLObject form) {
        SubLObject operator = (SubLObject)form_translation.NIL;
        SubLObject n = (SubLObject)form_translation.NIL;
        SubLObject subform = (SubLObject)form_translation.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(form, form, (SubLObject)form_translation.$list217);
        operator = form.first();
        SubLObject current = form.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, form, (SubLObject)form_translation.$list217);
        n = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, form, (SubLObject)form_translation.$list217);
        subform = current.first();
        current = current.rest();
        if (form_translation.NIL == current) {
            list_utilities.verify_operator(operator, (SubLObject)form_translation.$sym218$NTH_VALUE);
            final SubLObject translated_n = translate_form(n);
            final SubLObject translated_subform = translate_form(subform);
            return (SubLObject)ConsesLow.list((SubLObject)form_translation.$sym218$NTH_VALUE, translated_n, translated_subform);
        }
        cdestructuring_bind.cdestructuring_bind_error(form, (SubLObject)form_translation.$list217);
        return (SubLObject)form_translation.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/form-translation.lisp", position = 43344L)
    public static SubLObject translate_pcase(final SubLObject form) {
        SubLObject operator = (SubLObject)form_translation.NIL;
        SubLObject test_object = (SubLObject)form_translation.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(form, form, (SubLObject)form_translation.$list219);
        operator = form.first();
        SubLObject current = form.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, form, (SubLObject)form_translation.$list219);
        test_object = current.first();
        final SubLObject v_clauses;
        current = (v_clauses = current.rest());
        list_utilities.verify_operator(operator, (SubLObject)form_translation.$sym220$PCASE);
        final SubLObject pcase_var = (SubLObject)form_translation.$sym221$PCASE_VAR;
        SubLObject pcond_clauses = (SubLObject)form_translation.NIL;
        SubLObject cdolist_list_var = v_clauses;
        SubLObject clause = (SubLObject)form_translation.NIL;
        clause = cdolist_list_var.first();
        while (form_translation.NIL != cdolist_list_var) {
            pcond_clauses = (SubLObject)ConsesLow.cons(translate_pcase_clause(pcase_var, clause), pcond_clauses);
            cdolist_list_var = cdolist_list_var.rest();
            clause = cdolist_list_var.first();
        }
        return translate_clet_local((SubLObject)ConsesLow.list((SubLObject)form_translation.$sym70$CLET_LOCAL, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(pcase_var, test_object)), reader.bq_cons((SubLObject)form_translation.$sym222$PCOND, ConsesLow.append(Sequences.nreverse(pcond_clauses), (SubLObject)form_translation.NIL))));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/form-translation.lisp", position = 43781L)
    public static SubLObject translate_pcase_clause(final SubLObject test_object, final SubLObject clause) {
        SubLObject key = (SubLObject)form_translation.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(clause, clause, (SubLObject)form_translation.$list223);
        key = clause.first();
        final SubLObject clause_body;
        final SubLObject current = clause_body = clause.rest();
        SubLObject pcond_test = (SubLObject)form_translation.NIL;
        if (key == form_translation.$sym224$OTHERWISE) {
            pcond_test = (SubLObject)form_translation.T;
        }
        else if (key == form_translation.T) {
            Errors.warn((SubLObject)form_translation.$str225$_AEncountered_a_PCASE_that_uses_T, (SubLObject)((form_translation.NIL != translator_current_method()) ? Sequences.cconcatenate((SubLObject)form_translation.$str226$Within_, new SubLObject[] { format_nil.format_nil_s_no_copy(translator_current_method()), form_translation.$str227$___ }) : form_translation.$str228$));
            pcond_test = (SubLObject)form_translation.T;
        }
        else if (key.isCons()) {
            SubLObject disjuncts = (SubLObject)form_translation.NIL;
            SubLObject cdolist_list_var = key;
            SubLObject item = (SubLObject)form_translation.NIL;
            item = cdolist_list_var.first();
            while (form_translation.NIL != cdolist_list_var) {
                disjuncts = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)form_translation.EQL, test_object, list_utilities.quotify(item)), disjuncts);
                cdolist_list_var = cdolist_list_var.rest();
                item = cdolist_list_var.first();
            }
            pcond_test = reader.bq_cons((SubLObject)form_translation.$sym102$COR, ConsesLow.append(Sequences.nreverse(disjuncts), (SubLObject)form_translation.NIL));
        }
        else {
            pcond_test = (SubLObject)ConsesLow.list((SubLObject)form_translation.EQL, test_object, list_utilities.quotify(key));
        }
        return reader.bq_cons(pcond_test, ConsesLow.append(clause_body, (SubLObject)form_translation.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/form-translation.lisp", position = 44507L)
    public static SubLObject translate_pcond(final SubLObject form) {
        SubLObject operator = (SubLObject)form_translation.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(form, form, (SubLObject)form_translation.$list229);
        operator = form.first();
        final SubLObject v_clauses;
        final SubLObject current = v_clauses = form.rest();
        list_utilities.verify_operator(operator, (SubLObject)form_translation.$sym222$PCOND);
        SubLObject translated_clauses = (SubLObject)form_translation.NIL;
        SubLObject cdolist_list_var = v_clauses;
        SubLObject clause = (SubLObject)form_translation.NIL;
        clause = cdolist_list_var.first();
        while (form_translation.NIL != cdolist_list_var) {
            SubLObject current_$21;
            final SubLObject datum_$20 = current_$21 = clause;
            SubLObject condition = (SubLObject)form_translation.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current_$21, datum_$20, (SubLObject)form_translation.$list230);
            condition = current_$21.first();
            final SubLObject clause_body;
            current_$21 = (clause_body = current_$21.rest());
            final SubLObject translated_condition = translate_Xdtb((SubLObject)ConsesLow.list((SubLObject)form_translation.$sym35$_DTB, condition));
            final SubLObject translated_clause_body = translate_body(clause_body);
            translated_clauses = (SubLObject)ConsesLow.cons(reader.bq_cons(translated_condition, ConsesLow.append(translated_clause_body, (SubLObject)form_translation.NIL)), translated_clauses);
            cdolist_list_var = cdolist_list_var.rest();
            clause = cdolist_list_var.first();
        }
        return common_optimization.translator_optimize_pcond(reader.bq_cons((SubLObject)form_translation.$sym222$PCOND, ConsesLow.append(Sequences.nreverse(translated_clauses), (SubLObject)form_translation.NIL)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/form-translation.lisp", position = 45097L)
    public static SubLObject translate_pif(final SubLObject form) {
        SubLObject operator = (SubLObject)form_translation.NIL;
        SubLObject condition = (SubLObject)form_translation.NIL;
        SubLObject action = (SubLObject)form_translation.NIL;
        SubLObject else_action = (SubLObject)form_translation.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(form, form, (SubLObject)form_translation.$list231);
        operator = form.first();
        SubLObject current = form.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, form, (SubLObject)form_translation.$list231);
        condition = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, form, (SubLObject)form_translation.$list231);
        action = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, form, (SubLObject)form_translation.$list231);
        else_action = current.first();
        current = current.rest();
        if (form_translation.NIL == current) {
            list_utilities.verify_operator(operator, (SubLObject)form_translation.$sym232$PIF);
            return translate_pcond((SubLObject)ConsesLow.list((SubLObject)form_translation.$sym222$PCOND, (SubLObject)ConsesLow.list(condition, action), (SubLObject)ConsesLow.list((SubLObject)form_translation.T, else_action)));
        }
        cdestructuring_bind.cdestructuring_bind_error(form, (SubLObject)form_translation.$list231);
        return (SubLObject)form_translation.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/form-translation.lisp", position = 45341L)
    public static SubLObject translate_proclaim(final SubLObject form) {
        SubLObject operator = (SubLObject)form_translation.NIL;
        SubLObject declaration_specifier = (SubLObject)form_translation.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(form, form, (SubLObject)form_translation.$list233);
        operator = form.first();
        SubLObject current = form.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, form, (SubLObject)form_translation.$list233);
        declaration_specifier = current.first();
        current = current.rest();
        if (form_translation.NIL == current) {
            list_utilities.verify_operator(operator, (SubLObject)form_translation.$sym158$PROCLAIM);
            final SubLObject evaluated_declaration_specifier = Eval.eval(declaration_specifier);
            SubLObject result_forms = (SubLObject)form_translation.NIL;
            if (declaration_specifier.isCons()) {
                SubLObject current_$23;
                final SubLObject datum_$22 = current_$23 = evaluated_declaration_specifier;
                SubLObject declaration_identifier = (SubLObject)form_translation.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(current_$23, datum_$22, (SubLObject)form_translation.$list234);
                declaration_identifier = current_$23.first();
                final SubLObject args;
                current_$23 = (args = current_$23.rest());
                if (form_translation.$sym15$FACCESS == declaration_identifier) {
                    SubLObject current_$24;
                    final SubLObject datum_$23 = current_$24 = args;
                    SubLObject visibility = (SubLObject)form_translation.NIL;
                    cdestructuring_bind.destructuring_bind_must_consp(current_$24, datum_$23, (SubLObject)form_translation.$list235);
                    visibility = current_$24.first();
                    final SubLObject v_methods;
                    current_$24 = (v_methods = current_$24.rest());
                    if (form_translation.NIL != list_utilities.member_eqP(visibility, (SubLObject)form_translation.$list236)) {
                        SubLObject cdolist_list_var = v_methods;
                        SubLObject method = (SubLObject)form_translation.NIL;
                        method = cdolist_list_var.first();
                        while (form_translation.NIL != cdolist_list_var) {
                            file_translation.tsf_possibly_note_defined_method_visibility(method, visibility);
                            cdolist_list_var = cdolist_list_var.rest();
                            method = cdolist_list_var.first();
                        }
                    }
                }
                else if (form_translation.$sym13$VACCESS == declaration_identifier) {
                    SubLObject current_$25;
                    final SubLObject datum_$24 = current_$25 = args;
                    SubLObject visibility = (SubLObject)form_translation.NIL;
                    cdestructuring_bind.destructuring_bind_must_consp(current_$25, datum_$24, (SubLObject)form_translation.$list237);
                    visibility = current_$25.first();
                    final SubLObject globals;
                    current_$25 = (globals = current_$25.rest());
                    if (form_translation.NIL != list_utilities.member_eqP(visibility, (SubLObject)form_translation.$list236)) {
                        SubLObject cdolist_list_var = globals;
                        SubLObject global = (SubLObject)form_translation.NIL;
                        global = cdolist_list_var.first();
                        while (form_translation.NIL != cdolist_list_var) {
                            file_translation.tsf_possibly_note_defined_global_visibility(global, visibility);
                            cdolist_list_var = cdolist_list_var.rest();
                            global = cdolist_list_var.first();
                        }
                    }
                }
                else if (form_translation.$sym21$OPTIMIZE_FUNCALL == declaration_identifier || form_translation.$sym238$INLINE == declaration_identifier || form_translation.$sym239$NOTINLINE == declaration_identifier) {
                    result_forms = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)form_translation.$sym240$_PROCLAIM, list_utilities.quotify(evaluated_declaration_specifier)), result_forms);
                }
            }
            return translate_progn(reader.bq_cons((SubLObject)form_translation.$sym94$PROGN, ConsesLow.append(Sequences.nreverse(result_forms), (SubLObject)form_translation.NIL)));
        }
        cdestructuring_bind.cdestructuring_bind_error(form, (SubLObject)form_translation.$list233);
        return (SubLObject)form_translation.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/form-translation.lisp", position = 46658L)
    public static SubLObject translate_progn(final SubLObject form) {
        SubLObject operator = (SubLObject)form_translation.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(form, form, (SubLObject)form_translation.$list241);
        operator = form.first();
        final SubLObject body;
        final SubLObject current = body = form.rest();
        list_utilities.verify_operator(operator, (SubLObject)form_translation.$sym94$PROGN);
        final SubLObject translated_body = translate_body(body);
        return common_optimization.translator_optimize_progn(reader.bq_cons((SubLObject)form_translation.$sym94$PROGN, ConsesLow.append(translated_body, (SubLObject)form_translation.NIL)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/form-translation.lisp", position = 46930L)
    public static SubLObject translate_punless(final SubLObject form) {
        SubLObject operator = (SubLObject)form_translation.NIL;
        SubLObject condition = (SubLObject)form_translation.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(form, form, (SubLObject)form_translation.$list242);
        operator = form.first();
        SubLObject current = form.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, form, (SubLObject)form_translation.$list242);
        condition = current.first();
        final SubLObject body;
        current = (body = current.rest());
        list_utilities.verify_operator(operator, (SubLObject)form_translation.$sym119$PUNLESS);
        return translate_pcond((SubLObject)ConsesLow.listS((SubLObject)form_translation.$sym222$PCOND, reader.bq_cons((SubLObject)ConsesLow.list((SubLObject)form_translation.$sym51$CNOT, condition), ConsesLow.append(body, (SubLObject)form_translation.NIL)), (SubLObject)form_translation.$list243));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/form-translation.lisp", position = 47172L)
    public static SubLObject translate_pwhen(final SubLObject form) {
        SubLObject operator = (SubLObject)form_translation.NIL;
        SubLObject condition = (SubLObject)form_translation.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(form, form, (SubLObject)form_translation.$list242);
        operator = form.first();
        SubLObject current = form.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, form, (SubLObject)form_translation.$list242);
        condition = current.first();
        final SubLObject body;
        current = (body = current.rest());
        list_utilities.verify_operator(operator, (SubLObject)form_translation.$sym244$PWHEN);
        return translate_pcond((SubLObject)ConsesLow.listS((SubLObject)form_translation.$sym222$PCOND, reader.bq_cons(condition, ConsesLow.append(body, (SubLObject)form_translation.NIL)), (SubLObject)form_translation.$list243));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/form-translation.lisp", position = 47401L)
    public static SubLObject translate_quote(final SubLObject form) {
        SubLObject operator = (SubLObject)form_translation.NIL;
        SubLObject v_object = (SubLObject)form_translation.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(form, form, (SubLObject)form_translation.$list245);
        operator = form.first();
        SubLObject current = form.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, form, (SubLObject)form_translation.$list245);
        v_object = current.first();
        current = current.rest();
        if (form_translation.NIL != current) {
            cdestructuring_bind.cdestructuring_bind_error(form, (SubLObject)form_translation.$list245);
            return (SubLObject)form_translation.NIL;
        }
        list_utilities.verify_operator(operator, (SubLObject)form_translation.$sym83$QUOTE);
        final SubLObject object_to_use = file_translation.tsf_possibly_convert_internal_constant(v_object);
        if (object_to_use.eql(v_object)) {
            return form;
        }
        return object_to_use;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/form-translation.lisp", position = 47750L)
    public static SubLObject translate_ret(final SubLObject form) {
        SubLObject operator = (SubLObject)form_translation.NIL;
        SubLObject expression = (SubLObject)form_translation.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(form, form, (SubLObject)form_translation.$list100);
        operator = form.first();
        SubLObject current = form.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, form, (SubLObject)form_translation.$list100);
        expression = current.first();
        current = current.rest();
        if (form_translation.NIL == current) {
            list_utilities.verify_operator(operator, (SubLObject)form_translation.$sym168$RET);
            if (form_translation.NIL != translator_within_binding_constructP()) {
                file_translation.tsf_possibly_note_method_returns_within_binding_construct(translator_current_method());
                translate_form((SubLObject)form_translation.$list246);
            }
            final SubLObject translated_expression = translate_form(expression);
            return (SubLObject)ConsesLow.list((SubLObject)form_translation.$sym168$RET, translated_expression);
        }
        cdestructuring_bind.cdestructuring_bind_error(form, (SubLObject)form_translation.$list100);
        return (SubLObject)form_translation.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/form-translation.lisp", position = 48252L)
    public static SubLObject translate_with_error_handler(final SubLObject form) {
        SubLObject operator = (SubLObject)form_translation.NIL;
        SubLObject handler = (SubLObject)form_translation.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(form, form, (SubLObject)form_translation.$list247);
        operator = form.first();
        SubLObject current = form.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, form, (SubLObject)form_translation.$list247);
        handler = current.first();
        final SubLObject body;
        current = (body = current.rest());
        list_utilities.verify_operator(operator, (SubLObject)form_translation.$sym248$WITH_ERROR_HANDLER);
        final SubLObject translated_handler = translate_form(handler);
        final SubLObject translated_body = translate_binding_construct_body(body);
        final SubLObject catch_var = (SubLObject)form_translation.$sym249$CATCH_VAR;
        final SubLObject error_var = (SubLObject)form_translation.$sym250$ERROR_VAR;
        return (SubLObject)ConsesLow.listS((SubLObject)form_translation.$sym251$_WITH_ERROR_HANDLER, (SubLObject)ConsesLow.list(translated_handler, catch_var, error_var), ConsesLow.append(translated_body, (SubLObject)form_translation.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/form-translation.lisp", position = 48752L)
    public static SubLObject translate_with_process_resource_tracking(final SubLObject form) {
        SubLObject operator = (SubLObject)form_translation.NIL;
        SubLObject var = (SubLObject)form_translation.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(form, form, (SubLObject)form_translation.$list145);
        operator = form.first();
        SubLObject current = form.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, form, (SubLObject)form_translation.$list145);
        var = current.first();
        final SubLObject body;
        current = (body = current.rest());
        list_utilities.verify_operator(operator, (SubLObject)form_translation.$sym252$WITH_PROCESS_RESOURCE_TRACKING);
        final SubLObject resource_tracking_env_var = (SubLObject)form_translation.$sym253$RESOURCE_TRACKING_ENV_VAR;
        final SubLObject translated_body = translate_binding_construct_body(body);
        return (SubLObject)ConsesLow.listS((SubLObject)form_translation.$sym254$_WITH_PROCESS_RESOURCE_TRACKING, resource_tracking_env_var, var, ConsesLow.append(translated_body, (SubLObject)form_translation.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/form-translation.lisp", position = 49279L)
    public static SubLObject translate_with_static_area(final SubLObject form) {
        SubLObject operator = (SubLObject)form_translation.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(form, form, (SubLObject)form_translation.$list241);
        operator = form.first();
        final SubLObject body;
        final SubLObject current = body = form.rest();
        list_utilities.verify_operator(operator, (SubLObject)form_translation.$sym255$WITH_STATIC_AREA);
        return translate_clet((SubLObject)ConsesLow.listS((SubLObject)form_translation.$sym52$CLET, (SubLObject)form_translation.$list256, ConsesLow.append(body, (SubLObject)form_translation.NIL)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/form-translation.lisp", position = 49548L)
    public static SubLObject translate_with_thread_private_area(final SubLObject form) {
        SubLObject operator = (SubLObject)form_translation.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(form, form, (SubLObject)form_translation.$list241);
        operator = form.first();
        final SubLObject body;
        final SubLObject current = body = form.rest();
        list_utilities.verify_operator(operator, (SubLObject)form_translation.$sym257$WITH_THREAD_PRIVATE_AREA);
        return translate_clet((SubLObject)ConsesLow.listS((SubLObject)form_translation.$sym52$CLET, (SubLObject)form_translation.$list258, ConsesLow.append(body, (SubLObject)form_translation.NIL)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/form-translation.lisp", position = 49849L)
    public static SubLObject translate_with_working_area(final SubLObject form) {
        SubLObject operator = (SubLObject)form_translation.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(form, form, (SubLObject)form_translation.$list241);
        operator = form.first();
        final SubLObject body;
        final SubLObject current = body = form.rest();
        list_utilities.verify_operator(operator, (SubLObject)form_translation.$sym259$WITH_WORKING_AREA);
        return translate_clet((SubLObject)ConsesLow.listS((SubLObject)form_translation.$sym52$CLET, (SubLObject)form_translation.$list260, ConsesLow.append(body, (SubLObject)form_translation.NIL)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/form-translation.lisp", position = 50122L)
    public static SubLObject translate_clet_bind(final SubLObject form) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject operator = (SubLObject)form_translation.NIL;
        SubLObject dynamic_bindings = (SubLObject)form_translation.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(form, form, (SubLObject)form_translation.$list261);
        operator = form.first();
        SubLObject current = form.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, form, (SubLObject)form_translation.$list261);
        dynamic_bindings = current.first();
        final SubLObject body;
        current = (body = current.rest());
        list_utilities.verify_operator(operator, (SubLObject)form_translation.$sym90$CLET_BIND);
        if (form_translation.NIL == dynamic_bindings) {
            return translate_progn(reader.bq_cons((SubLObject)form_translation.$sym94$PROGN, ConsesLow.append(body, (SubLObject)form_translation.NIL)));
        }
        SubLObject translated_bindings = (SubLObject)form_translation.NIL;
        final SubLObject translated_body = translate_binding_construct_body(body);
        SubLObject cdolist_list_var = dynamic_bindings;
        SubLObject dynamic_binding = (SubLObject)form_translation.NIL;
        dynamic_binding = cdolist_list_var.first();
        while (form_translation.NIL != cdolist_list_var) {
            SubLObject current_$29;
            final SubLObject datum_$28 = current_$29 = dynamic_binding;
            SubLObject variable = (SubLObject)form_translation.NIL;
            SubLObject initialization = (SubLObject)form_translation.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current_$29, datum_$28, (SubLObject)form_translation.$list262);
            variable = current_$29.first();
            current_$29 = current_$29.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current_$29, datum_$28, (SubLObject)form_translation.$list262);
            initialization = current_$29.first();
            current_$29 = current_$29.rest();
            if (form_translation.NIL == current_$29) {
                xref_database.xref_note_global_binding(variable);
                final SubLObject translated_variable = translate_variable(variable);
                final SubLObject translated_initialization = translate_form(initialization);
                translated_bindings = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(translated_variable, translated_initialization), translated_bindings);
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(datum_$28, (SubLObject)form_translation.$list262);
            }
            cdolist_list_var = cdolist_list_var.rest();
            dynamic_binding = cdolist_list_var.first();
        }
        return common_optimization.translator_optimize_clet_bind((SubLObject)ConsesLow.listS((SubLObject)form_translation.$sym90$CLET_BIND, Sequences.nreverse(translated_bindings), ConsesLow.append(translated_body, (SubLObject)form_translation.NIL)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/form-translation.lisp", position = 51199L)
    public static SubLObject translate_clet_local(final SubLObject form) {
        SubLObject operator = (SubLObject)form_translation.NIL;
        SubLObject local_bindings = (SubLObject)form_translation.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(form, form, (SubLObject)form_translation.$list263);
        operator = form.first();
        SubLObject current = form.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, form, (SubLObject)form_translation.$list263);
        local_bindings = current.first();
        final SubLObject body;
        current = (body = current.rest());
        list_utilities.verify_operator(operator, (SubLObject)form_translation.$sym70$CLET_LOCAL);
        if (form_translation.NIL == local_bindings) {
            return translate_progn(reader.bq_cons((SubLObject)form_translation.$sym94$PROGN, ConsesLow.append(body, (SubLObject)form_translation.NIL)));
        }
        SubLObject translated_bindings = (SubLObject)form_translation.NIL;
        final SubLObject translated_body = translate_body(body);
        SubLObject cdolist_list_var = local_bindings;
        SubLObject local_binding = (SubLObject)form_translation.NIL;
        local_binding = cdolist_list_var.first();
        while (form_translation.NIL != cdolist_list_var) {
            SubLObject current_$31;
            final SubLObject datum_$30 = current_$31 = local_binding;
            SubLObject variable = (SubLObject)form_translation.NIL;
            SubLObject initialization = (SubLObject)form_translation.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current_$31, datum_$30, (SubLObject)form_translation.$list262);
            variable = current_$31.first();
            current_$31 = current_$31.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current_$31, datum_$30, (SubLObject)form_translation.$list262);
            initialization = current_$31.first();
            current_$31 = current_$31.rest();
            if (form_translation.NIL == current_$31) {
                final SubLObject translated_variable = translate_variable(variable);
                final SubLObject translated_initialization = translate_form(initialization);
                translated_bindings = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(translated_variable, translated_initialization), translated_bindings);
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(datum_$30, (SubLObject)form_translation.$list262);
            }
            cdolist_list_var = cdolist_list_var.rest();
            local_binding = cdolist_list_var.first();
        }
        return common_optimization.translator_optimize_clet_local((SubLObject)ConsesLow.listS((SubLObject)form_translation.$sym70$CLET_LOCAL, Sequences.nreverse(translated_bindings), ConsesLow.append(translated_body, (SubLObject)form_translation.NIL)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/form-translation.lisp", position = 51989L)
    public static SubLObject translate_code_comment(final SubLObject form) {
        return form;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/form-translation.lisp", position = 52067L)
    public static SubLObject translate_defstruct_construct(final SubLObject form) {
        SubLObject operator = (SubLObject)form_translation.NIL;
        SubLObject c_structure_tag = (SubLObject)form_translation.NIL;
        SubLObject size = (SubLObject)form_translation.NIL;
        SubLObject type_var = (SubLObject)form_translation.NIL;
        SubLObject type = (SubLObject)form_translation.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(form, form, (SubLObject)form_translation.$list264);
        operator = form.first();
        SubLObject current = form.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, form, (SubLObject)form_translation.$list264);
        c_structure_tag = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, form, (SubLObject)form_translation.$list264);
        size = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, form, (SubLObject)form_translation.$list264);
        type_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, form, (SubLObject)form_translation.$list264);
        type = current.first();
        current = current.rest();
        if (form_translation.NIL != current) {
            cdestructuring_bind.cdestructuring_bind_error(form, (SubLObject)form_translation.$list264);
            return (SubLObject)form_translation.NIL;
        }
        list_utilities.verify_operator(operator, (SubLObject)form_translation.$sym265$_DEFSTRUCT_CONSTRUCT);
        if (form_translation.NIL != c_structure_tag && !form_translation.assertionsDisabledSynth && form_translation.NIL == Types.integerp(c_structure_tag)) {
            throw new AssertionError(c_structure_tag);
        }
        assert form_translation.NIL != Types.integerp(size) : size;
        assert form_translation.NIL != Types.symbolp(type_var) : type_var;
        assert form_translation.NIL != Types.symbolp(type) : type;
        final SubLObject translated_type_var = translate_variable(type_var);
        return (SubLObject)ConsesLow.list((SubLObject)form_translation.$sym265$_DEFSTRUCT_CONSTRUCT, c_structure_tag, size, translated_type_var, type);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/form-translation.lisp", position = 52657L)
    public static SubLObject translate_defstruct_get_slot(final SubLObject form) {
        SubLObject operator = (SubLObject)form_translation.NIL;
        SubLObject v_object = (SubLObject)form_translation.NIL;
        SubLObject index = (SubLObject)form_translation.NIL;
        SubLObject type = (SubLObject)form_translation.NIL;
        SubLObject slot = (SubLObject)form_translation.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(form, form, (SubLObject)form_translation.$list267);
        operator = form.first();
        SubLObject current = form.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, form, (SubLObject)form_translation.$list267);
        v_object = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, form, (SubLObject)form_translation.$list267);
        index = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, form, (SubLObject)form_translation.$list267);
        type = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, form, (SubLObject)form_translation.$list267);
        slot = current.first();
        current = current.rest();
        if (form_translation.NIL != current) {
            cdestructuring_bind.cdestructuring_bind_error(form, (SubLObject)form_translation.$list267);
            return (SubLObject)form_translation.NIL;
        }
        list_utilities.verify_operator(operator, (SubLObject)form_translation.$sym268$_DEFSTRUCT_GET_SLOT);
        assert form_translation.NIL != Types.symbolp(type) : type;
        assert form_translation.NIL != Types.symbolp(slot) : slot;
        final SubLObject translated_object = translate_form(v_object);
        return (SubLObject)ConsesLow.list((SubLObject)form_translation.$sym268$_DEFSTRUCT_GET_SLOT, translated_object, index, type, slot);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/form-translation.lisp", position = 53052L)
    public static SubLObject translate_defstruct_object_p(final SubLObject form) {
        SubLObject operator = (SubLObject)form_translation.NIL;
        SubLObject v_object = (SubLObject)form_translation.NIL;
        SubLObject c_structure_tag = (SubLObject)form_translation.NIL;
        SubLObject type_var = (SubLObject)form_translation.NIL;
        SubLObject type = (SubLObject)form_translation.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(form, form, (SubLObject)form_translation.$list269);
        operator = form.first();
        SubLObject current = form.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, form, (SubLObject)form_translation.$list269);
        v_object = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, form, (SubLObject)form_translation.$list269);
        c_structure_tag = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, form, (SubLObject)form_translation.$list269);
        type_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, form, (SubLObject)form_translation.$list269);
        type = current.first();
        current = current.rest();
        if (form_translation.NIL != current) {
            cdestructuring_bind.cdestructuring_bind_error(form, (SubLObject)form_translation.$list269);
            return (SubLObject)form_translation.NIL;
        }
        list_utilities.verify_operator(operator, (SubLObject)form_translation.$sym270$_DEFSTRUCT_OBJECT_P);
        if (form_translation.NIL != c_structure_tag && !form_translation.assertionsDisabledSynth && form_translation.NIL == Types.integerp(c_structure_tag)) {
            throw new AssertionError(c_structure_tag);
        }
        assert form_translation.NIL != Types.symbolp(type_var) : type_var;
        assert form_translation.NIL != Types.symbolp(type) : type;
        final SubLObject translated_object = translate_form(v_object);
        final SubLObject translated_type_var = translate_variable(type_var);
        return (SubLObject)ConsesLow.list((SubLObject)form_translation.$sym270$_DEFSTRUCT_OBJECT_P, translated_object, c_structure_tag, translated_type_var, type);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/form-translation.lisp", position = 53607L)
    public static SubLObject translate_defstruct_set_slot(final SubLObject form) {
        SubLObject operator = (SubLObject)form_translation.NIL;
        SubLObject v_object = (SubLObject)form_translation.NIL;
        SubLObject index = (SubLObject)form_translation.NIL;
        SubLObject value = (SubLObject)form_translation.NIL;
        SubLObject type = (SubLObject)form_translation.NIL;
        SubLObject slot = (SubLObject)form_translation.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(form, form, (SubLObject)form_translation.$list271);
        operator = form.first();
        SubLObject current = form.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, form, (SubLObject)form_translation.$list271);
        v_object = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, form, (SubLObject)form_translation.$list271);
        index = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, form, (SubLObject)form_translation.$list271);
        value = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, form, (SubLObject)form_translation.$list271);
        type = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, form, (SubLObject)form_translation.$list271);
        slot = current.first();
        current = current.rest();
        if (form_translation.NIL != current) {
            cdestructuring_bind.cdestructuring_bind_error(form, (SubLObject)form_translation.$list271);
            return (SubLObject)form_translation.NIL;
        }
        list_utilities.verify_operator(operator, (SubLObject)form_translation.$sym272$_DEFSTRUCT_SET_SLOT);
        assert form_translation.NIL != Types.symbolp(type) : type;
        assert form_translation.NIL != Types.symbolp(slot) : slot;
        final SubLObject translated_object = translate_form(v_object);
        final SubLObject translated_value = translate_form(value);
        return (SubLObject)ConsesLow.list((SubLObject)form_translation.$sym272$_DEFSTRUCT_SET_SLOT, translated_object, index, translated_value, type, slot);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/form-translation.lisp", position = 54073L)
    public static SubLObject translate_Xfor(final SubLObject form) {
        SubLObject operator = (SubLObject)form_translation.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(form, form, (SubLObject)form_translation.$list273);
        operator = form.first();
        SubLObject current = form.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, form, (SubLObject)form_translation.$list273);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject initializations = (SubLObject)form_translation.NIL;
        SubLObject test = (SubLObject)form_translation.NIL;
        SubLObject updates = (SubLObject)form_translation.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, form, (SubLObject)form_translation.$list273);
        initializations = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, form, (SubLObject)form_translation.$list273);
        test = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, form, (SubLObject)form_translation.$list273);
        updates = current.first();
        current = current.rest();
        if (form_translation.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            list_utilities.verify_operator(operator, (SubLObject)form_translation.$sym53$_FOR);
            final SubLObject translated_initializations = translate_body(initializations);
            final SubLObject translated_test = translate_form(test);
            final SubLObject translated_updates = translate_body(updates);
            final SubLObject translated_body = translate_body(body);
            return common_optimization.translator_optimize_Xfor((SubLObject)ConsesLow.listS((SubLObject)form_translation.$sym53$_FOR, (SubLObject)ConsesLow.list(translated_initializations, (SubLObject)ConsesLow.list((SubLObject)form_translation.$sym35$_DTB, translated_test), translated_updates), ConsesLow.append(translated_body, (SubLObject)form_translation.NIL)));
        }
        cdestructuring_bind.cdestructuring_bind_error(form, (SubLObject)form_translation.$list273);
        return (SubLObject)form_translation.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/form-translation.lisp", position = 54636L)
    public static SubLObject translate_for(final SubLObject form) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject operator = (SubLObject)form_translation.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(form, form, (SubLObject)form_translation.$list274);
        operator = form.first();
        SubLObject current = form.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, form, (SubLObject)form_translation.$list274);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject v_bindings = (SubLObject)form_translation.NIL;
        SubLObject test = (SubLObject)form_translation.NIL;
        SubLObject updates = (SubLObject)form_translation.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, form, (SubLObject)form_translation.$list274);
        v_bindings = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, form, (SubLObject)form_translation.$list274);
        test = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, form, (SubLObject)form_translation.$list274);
        updates = current.first();
        current = current.rest();
        if (form_translation.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            list_utilities.verify_operator(operator, (SubLObject)form_translation.$sym71$FOR);
            thread.resetMultipleValues();
            final SubLObject clet_vars = translate_for_bindings(v_bindings);
            final SubLObject initializations = thread.secondMultipleValue();
            thread.resetMultipleValues();
            return translate_clet((SubLObject)ConsesLow.list((SubLObject)form_translation.$sym52$CLET, clet_vars, (SubLObject)ConsesLow.listS((SubLObject)form_translation.$sym53$_FOR, (SubLObject)ConsesLow.list(initializations, test, updates), ConsesLow.append(body, (SubLObject)form_translation.NIL))));
        }
        cdestructuring_bind.cdestructuring_bind_error(form, (SubLObject)form_translation.$list274);
        return (SubLObject)form_translation.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/form-translation.lisp", position = 54996L)
    public static SubLObject translate_for_bindings(final SubLObject v_bindings) {
        SubLObject clet_vars = (SubLObject)form_translation.NIL;
        SubLObject initializations = (SubLObject)form_translation.NIL;
        SubLObject cdolist_list_var = v_bindings;
        SubLObject binding = (SubLObject)form_translation.NIL;
        binding = cdolist_list_var.first();
        while (form_translation.NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = binding;
            SubLObject variable = (SubLObject)form_translation.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)form_translation.$list275);
            variable = current.first();
            current = current.rest();
            final SubLObject initialization = (SubLObject)(current.isCons() ? current.first() : form_translation.NIL);
            cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)form_translation.$list275);
            current = current.rest();
            if (form_translation.NIL == current) {
                clet_vars = (SubLObject)ConsesLow.cons(variable, clet_vars);
                initializations = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)form_translation.$sym49$CSETQ, variable, initialization), initializations);
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)form_translation.$list275);
            }
            cdolist_list_var = cdolist_list_var.rest();
            binding = cdolist_list_var.first();
        }
        return Values.values(Sequences.nreverse(clet_vars), Sequences.nreverse(initializations));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/form-translation.lisp", position = 55366L)
    public static SubLObject translate_in_package(final SubLObject form) {
        SubLObject operator = (SubLObject)form_translation.NIL;
        SubLObject name = (SubLObject)form_translation.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(form, form, (SubLObject)form_translation.$list276);
        operator = form.first();
        SubLObject current = form.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, form, (SubLObject)form_translation.$list276);
        name = current.first();
        current = current.rest();
        if (form_translation.NIL != current) {
            cdestructuring_bind.cdestructuring_bind_error(form, (SubLObject)form_translation.$list276);
            return (SubLObject)form_translation.NIL;
        }
        list_utilities.verify_operator(operator, (SubLObject)form_translation.$sym277$IN_PACKAGE);
        if (form_translation.NIL != translator_current_method()) {
            return translate_csetq((SubLObject)ConsesLow.list((SubLObject)form_translation.$sym49$CSETQ, (SubLObject)form_translation.$sym278$_PACKAGE_, (SubLObject)ConsesLow.list((SubLObject)form_translation.$sym279$FIND_PACKAGE, (SubLObject)ConsesLow.list((SubLObject)form_translation.$sym83$QUOTE, name))));
        }
        return form;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/form-translation.lisp", position = 55704L)
    public static SubLObject translate_Xmval(final SubLObject form) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject operator = (SubLObject)form_translation.NIL;
        SubLObject n = (SubLObject)form_translation.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(form, form, (SubLObject)form_translation.$list280);
        operator = form.first();
        SubLObject current = form.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, form, (SubLObject)form_translation.$list280);
        n = current.first();
        current = current.rest();
        if (form_translation.NIL == current) {
            list_utilities.verify_operator(operator, (SubLObject)form_translation.$sym99$_MVAL);
            final SubLObject translated_n = translate_form(n);
            return (SubLObject)ConsesLow.list((SubLObject)form_translation.$sym99$_MVAL, translated_n);
        }
        cdestructuring_bind.cdestructuring_bind_error(form, (SubLObject)form_translation.$list280);
        return (SubLObject)form_translation.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/form-translation.lisp", position = 55917L)
    public static SubLObject translate_Xreset_mval(final SubLObject form) {
        return form;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/form-translation.lisp", position = 55993L)
    public static SubLObject translate_until(final SubLObject form) {
        SubLObject operator = (SubLObject)form_translation.NIL;
        SubLObject test = (SubLObject)form_translation.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(form, form, (SubLObject)form_translation.$list281);
        operator = form.first();
        SubLObject current = form.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, form, (SubLObject)form_translation.$list281);
        test = current.first();
        final SubLObject body;
        current = (body = current.rest());
        list_utilities.verify_operator(operator, (SubLObject)form_translation.$sym282$UNTIL);
        final SubLObject negated_test = (SubLObject)ConsesLow.list((SubLObject)form_translation.$sym51$CNOT, test);
        return translate_while((SubLObject)ConsesLow.listS((SubLObject)form_translation.$sym283$WHILE, negated_test, ConsesLow.append(body, (SubLObject)form_translation.NIL)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/form-translation.lisp", position = 56253L)
    public static SubLObject translate_while(final SubLObject form) {
        SubLObject operator = (SubLObject)form_translation.NIL;
        SubLObject test = (SubLObject)form_translation.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(form, form, (SubLObject)form_translation.$list281);
        operator = form.first();
        SubLObject current = form.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, form, (SubLObject)form_translation.$list281);
        test = current.first();
        final SubLObject body;
        current = (body = current.rest());
        list_utilities.verify_operator(operator, (SubLObject)form_translation.$sym283$WHILE);
        final SubLObject translated_test = translate_form(test);
        final SubLObject translated_body = translate_body(body);
        return (SubLObject)ConsesLow.listS((SubLObject)form_translation.$sym283$WHILE, (SubLObject)ConsesLow.list((SubLObject)form_translation.$sym35$_DTB, translated_test), ConsesLow.append(translated_body, (SubLObject)form_translation.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/form-translation.lisp", position = 57570L)
    public static SubLObject translator_implementation_symbol_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(v_object.isSymbol() && form_translation.NIL != list_utilities.sublisp_boolean(list_utilities.alist_lookup_without_values(form_translation.$translator_implementation_symbols$.getGlobalValue(), v_object, Symbols.symbol_function((SubLObject)form_translation.EQ), (SubLObject)form_translation.UNPROVIDED)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/form-translation.lisp", position = 57758L)
    public static SubLObject translate_implementation_symbol(final SubLObject symbol) {
        return list_utilities.alist_lookup_without_values(form_translation.$translator_implementation_symbols$.getGlobalValue(), symbol, Symbols.symbol_function((SubLObject)form_translation.EQ), (SubLObject)form_translation.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/form-translation.lisp", position = 57934L)
    public static SubLObject possibly_translate_implementation_symbols(SubLObject form) {
        if (form_translation.NIL != translator_implementation_symbol_p(form)) {
            form = translate_implementation_symbol(form);
        }
        else if (form.isCons()) {
            SubLObject current;
            final SubLObject datum = current = form;
            SubLObject operator = (SubLObject)form_translation.NIL;
            SubLObject args = (SubLObject)form_translation.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)form_translation.$list284);
            operator = current.first();
            current = (args = current.rest());
            if (form_translation.NIL != translator_implementation_symbol_p(operator)) {
                operator = translate_implementation_symbol(operator);
                form = reader.bq_cons(operator, ConsesLow.append(args, (SubLObject)form_translation.NIL));
            }
        }
        return form;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/form-translation.lisp", position = 58351L)
    public static SubLObject clet_bind(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject dynamic_bindings = (SubLObject)form_translation.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)form_translation.$list285);
        dynamic_bindings = current.first();
        final SubLObject body;
        current = (body = current.rest());
        if (form_translation.NIL == dynamic_bindings) {
            return reader.bq_cons((SubLObject)form_translation.$sym94$PROGN, ConsesLow.append(body, (SubLObject)form_translation.NIL));
        }
        return (SubLObject)ConsesLow.listS((SubLObject)form_translation.$sym52$CLET, dynamic_bindings, ConsesLow.append(body, (SubLObject)form_translation.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/form-translation.lisp", position = 58814L)
    public static SubLObject clet_local(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject local_bindings = (SubLObject)form_translation.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)form_translation.$list286);
        local_bindings = current.first();
        final SubLObject body;
        current = (body = current.rest());
        if (form_translation.NIL == local_bindings) {
            return reader.bq_cons((SubLObject)form_translation.$sym94$PROGN, ConsesLow.append(body, (SubLObject)form_translation.NIL));
        }
        return (SubLObject)ConsesLow.listS((SubLObject)form_translation.$sym52$CLET, local_bindings, ConsesLow.append(body, (SubLObject)form_translation.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/form-translation.lisp", position = 59040L)
    public static SubLObject csetq_dynamic(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject variable = (SubLObject)form_translation.NIL;
        SubLObject value = (SubLObject)form_translation.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)form_translation.$list287);
        variable = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)form_translation.$list287);
        value = current.first();
        current = current.rest();
        if (form_translation.NIL == current) {
            return (SubLObject)ConsesLow.list((SubLObject)form_translation.$sym49$CSETQ, variable, value);
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)form_translation.$list287);
        return (SubLObject)form_translation.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/form-translation.lisp", position = 59170L)
    public static SubLObject csetq_lexical(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject variable = (SubLObject)form_translation.NIL;
        SubLObject value = (SubLObject)form_translation.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)form_translation.$list287);
        variable = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)form_translation.$list287);
        value = current.first();
        current = current.rest();
        if (form_translation.NIL == current) {
            return (SubLObject)ConsesLow.list((SubLObject)form_translation.$sym49$CSETQ, variable, value);
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)form_translation.$list287);
        return (SubLObject)form_translation.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/form-translation.lisp", position = 59299L)
    public static SubLObject csetq_local(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject variable = (SubLObject)form_translation.NIL;
        SubLObject value = (SubLObject)form_translation.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)form_translation.$list287);
        variable = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)form_translation.$list287);
        value = current.first();
        current = current.rest();
        if (form_translation.NIL == current) {
            return (SubLObject)ConsesLow.list((SubLObject)form_translation.$sym49$CSETQ, variable, value);
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)form_translation.$list287);
        return (SubLObject)form_translation.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/form-translation.lisp", position = 59420L)
    public static SubLObject sublisp_for(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)form_translation.$list288);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject v_bindings = (SubLObject)form_translation.NIL;
        SubLObject test = (SubLObject)form_translation.NIL;
        SubLObject updates = (SubLObject)form_translation.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)form_translation.$list288);
        v_bindings = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)form_translation.$list288);
        test = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)form_translation.$list288);
        updates = current.first();
        current = current.rest();
        if (form_translation.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            return (SubLObject)ConsesLow.list((SubLObject)form_translation.$sym52$CLET, v_bindings, (SubLObject)ConsesLow.listS((SubLObject)form_translation.$sym283$WHILE, (SubLObject)ConsesLow.list((SubLObject)form_translation.$sym51$CNOT, test), ConsesLow.append(body, updates, (SubLObject)form_translation.NIL)));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)form_translation.$list288);
        return (SubLObject)form_translation.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/form-translation.lisp", position = 59578L)
    public static SubLObject Xfor(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)form_translation.$list289);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject initializations = (SubLObject)form_translation.NIL;
        SubLObject test = (SubLObject)form_translation.NIL;
        SubLObject updates = (SubLObject)form_translation.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)form_translation.$list289);
        initializations = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)form_translation.$list289);
        test = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)form_translation.$list289);
        updates = current.first();
        current = current.rest();
        if (form_translation.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            return reader.bq_cons((SubLObject)form_translation.$sym94$PROGN, ConsesLow.append(initializations, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.listS((SubLObject)form_translation.$sym283$WHILE, (SubLObject)ConsesLow.list((SubLObject)form_translation.$sym51$CNOT, test), ConsesLow.append(body, updates, (SubLObject)form_translation.NIL)))));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)form_translation.$list289);
        return (SubLObject)form_translation.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/form-translation.lisp", position = 59728L)
    public static SubLObject Xcdohash(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)form_translation.$list290);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject key = (SubLObject)form_translation.NIL;
        SubLObject val = (SubLObject)form_translation.NIL;
        SubLObject table = (SubLObject)form_translation.NIL;
        SubLObject table_var = (SubLObject)form_translation.NIL;
        SubLObject iterator_var = (SubLObject)form_translation.NIL;
        SubLObject entry_var = (SubLObject)form_translation.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)form_translation.$list290);
        key = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)form_translation.$list290);
        val = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)form_translation.$list290);
        table = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)form_translation.$list290);
        table_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)form_translation.$list290);
        iterator_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)form_translation.$list290);
        entry_var = current.first();
        current = current.rest();
        if (form_translation.NIL != current) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)form_translation.$list290);
            return (SubLObject)form_translation.NIL;
        }
        final SubLObject body;
        current = (body = temp);
        assert form_translation.NIL != Types.symbolp(iterator_var) : iterator_var;
        assert form_translation.NIL != Types.symbolp(entry_var) : entry_var;
        return (SubLObject)ConsesLow.list((SubLObject)form_translation.$sym52$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(table_var, table)), (SubLObject)ConsesLow.listS((SubLObject)form_translation.$sym63$CDOHASH, (SubLObject)ConsesLow.list(key, val, table_var), ConsesLow.append(body, (SubLObject)form_translation.NIL)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/form-translation.lisp", position = 59970L)
    public static SubLObject Xccatch(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)form_translation.$list291);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject tag = (SubLObject)form_translation.NIL;
        SubLObject ans_var = (SubLObject)form_translation.NIL;
        SubLObject env_var = (SubLObject)form_translation.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)form_translation.$list291);
        tag = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)form_translation.$list291);
        ans_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)form_translation.$list291);
        env_var = current.first();
        current = current.rest();
        if (form_translation.NIL != current) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)form_translation.$list291);
            return (SubLObject)form_translation.NIL;
        }
        final SubLObject body;
        current = (body = temp);
        assert form_translation.NIL != Types.symbolp(env_var) : env_var;
        return (SubLObject)ConsesLow.listS((SubLObject)form_translation.$sym39$CCATCH, tag, ans_var, ConsesLow.append(body, (SubLObject)form_translation.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/form-translation.lisp", position = 60098L)
    public static SubLObject Xcunwind_protect(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject env_var = (SubLObject)form_translation.NIL;
        SubLObject protected_form = (SubLObject)form_translation.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)form_translation.$list292);
        env_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)form_translation.$list292);
        protected_form = current.first();
        final SubLObject body;
        current = (body = current.rest());
        assert form_translation.NIL != Types.symbolp(env_var) : env_var;
        return (SubLObject)ConsesLow.listS((SubLObject)form_translation.$sym153$CUNWIND_PROTECT, protected_form, ConsesLow.append(body, (SubLObject)form_translation.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/form-translation.lisp", position = 60252L)
    public static SubLObject Xcprogv(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)form_translation.$list293);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject special_vars = (SubLObject)form_translation.NIL;
        SubLObject v_bindings = (SubLObject)form_translation.NIL;
        SubLObject internal_var = (SubLObject)form_translation.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)form_translation.$list293);
        special_vars = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)form_translation.$list293);
        v_bindings = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)form_translation.$list293);
        internal_var = current.first();
        current = current.rest();
        if (form_translation.NIL != current) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)form_translation.$list293);
            return (SubLObject)form_translation.NIL;
        }
        final SubLObject body;
        current = (body = temp);
        assert form_translation.NIL != Types.symbolp(internal_var) : internal_var;
        return (SubLObject)ConsesLow.listS((SubLObject)form_translation.$sym108$CPROGV, special_vars, v_bindings, ConsesLow.append(body, (SubLObject)form_translation.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/form-translation.lisp", position = 60410L)
    public static SubLObject Xcdo_symbols(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)form_translation.$list294);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject sym = (SubLObject)form_translation.NIL;
        SubLObject v_package = (SubLObject)form_translation.NIL;
        SubLObject package_var = (SubLObject)form_translation.NIL;
        SubLObject iterator_var = (SubLObject)form_translation.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)form_translation.$list294);
        sym = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)form_translation.$list294);
        v_package = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)form_translation.$list294);
        package_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)form_translation.$list294);
        iterator_var = current.first();
        current = current.rest();
        if (form_translation.NIL != current) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)form_translation.$list294);
            return (SubLObject)form_translation.NIL;
        }
        final SubLObject body;
        current = (body = temp);
        assert form_translation.NIL != Types.symbolp(package_var) : package_var;
        assert form_translation.NIL != Types.symbolp(iterator_var) : iterator_var;
        return (SubLObject)ConsesLow.listS((SubLObject)form_translation.$sym57$CDO_SYMBOLS, (SubLObject)ConsesLow.list(sym, v_package), ConsesLow.append(body, (SubLObject)form_translation.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/form-translation.lisp", position = 60607L)
    public static SubLObject Xwith_error_handler(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)form_translation.$list295);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject handler = (SubLObject)form_translation.NIL;
        SubLObject catch_var = (SubLObject)form_translation.NIL;
        SubLObject error_var = (SubLObject)form_translation.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)form_translation.$list295);
        handler = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)form_translation.$list295);
        catch_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)form_translation.$list295);
        error_var = current.first();
        current = current.rest();
        if (form_translation.NIL != current) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)form_translation.$list295);
            return (SubLObject)form_translation.NIL;
        }
        final SubLObject body;
        current = (body = temp);
        assert form_translation.NIL != Types.symbolp(catch_var) : catch_var;
        assert form_translation.NIL != Types.symbolp(error_var) : error_var;
        return (SubLObject)ConsesLow.listS((SubLObject)form_translation.$sym248$WITH_ERROR_HANDLER, handler, ConsesLow.append(body, (SubLObject)form_translation.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/form-translation.lisp", position = 60797L)
    public static SubLObject Xwith_process_resource_tracking(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject resource_var = (SubLObject)form_translation.NIL;
        SubLObject result_var = (SubLObject)form_translation.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)form_translation.$list296);
        resource_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)form_translation.$list296);
        result_var = current.first();
        final SubLObject body;
        current = (body = current.rest());
        assert form_translation.NIL != Types.symbolp(resource_var) : resource_var;
        assert form_translation.NIL != Types.symbolp(result_var) : result_var;
        return (SubLObject)ConsesLow.listS((SubLObject)form_translation.$sym252$WITH_PROCESS_RESOURCE_TRACKING, result_var, ConsesLow.append(body, (SubLObject)form_translation.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/form-translation.lisp", position = 61012L)
    public static SubLObject Xwith_current_thread(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject thread_var = (SubLObject)form_translation.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)form_translation.$list297);
        thread_var = current.first();
        final SubLObject body;
        current = (body = current.rest());
        assert form_translation.NIL != Types.symbolp(thread_var) : thread_var;
        return (SubLObject)ConsesLow.listS((SubLObject)form_translation.$sym52$CLET, (SubLObject)ConsesLow.list(reader.bq_cons(thread_var, (SubLObject)form_translation.$list298)), ConsesLow.append(body, (SubLObject)form_translation.NIL));
    }
    
    public static SubLObject declare_form_translation_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.form_translation", "translator_within_binding_constructP", "TRANSLATOR-WITHIN-BINDING-CONSTRUCT?", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.form_translation", "translate_form", "TRANSLATE-FORM", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.form_translation", "test_translate_form", "TEST-TRANSLATE-FORM", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.form_translation", "translate_atom", "TRANSLATE-ATOM", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.form_translation", "translate_constant_atom", "TRANSLATE-CONSTANT-ATOM", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.form_translation", "translator_variable_binding_type", "TRANSLATOR-VARIABLE-BINDING-TYPE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.form_translation", "translate_variable_reference", "TRANSLATE-VARIABLE-REFERENCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.form_translation", "translate_variable", "TRANSLATE-VARIABLE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.form_translation", "translate_form_via_translator", "TRANSLATE-FORM-VIA-TRANSLATOR", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.form_translation", "translate_form_via_macroexpansion", "TRANSLATE-FORM-VIA-MACROEXPANSION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.form_translation", "translate_form_as_function_call", "TRANSLATE-FORM-AS-FUNCTION-CALL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.form_translation", "translate_function_symbol", "TRANSLATE-FUNCTION-SYMBOL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.form_translation", "vaccess_level", "VACCESS-LEVEL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.form_translation", "faccess_level", "FACCESS-LEVEL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.form_translation", "private_global_p", "PRIVATE-GLOBAL-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.form_translation", "private_method_p", "PRIVATE-METHOD-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.form_translation", "translate_body", "TRANSLATE-BODY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.form_translation", "translate_arglist", "TRANSLATE-ARGLIST", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.form_translation", "translate_empty_progn", "TRANSLATE-EMPTY-PROGN", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.form_translation", "binding_type_p", "BINDING-TYPE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.form_translation", "dynamic_global_p", "DYNAMIC-GLOBAL-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.form_translation", "lexical_global_p", "LEXICAL-GLOBAL-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.form_translation", "constant_global_p", "CONSTANT-GLOBAL-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.form_translation", "global_binding_type", "GLOBAL-BINDING-TYPE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.form_translation", "optimize_funcall_p", "OPTIMIZE-FUNCALL-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.form_translation", "translator_consider_expansion_factor", "TRANSLATOR-CONSIDER-EXPANSION-FACTOR", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.form_translation", "translate_form_expansion_factor", "TRANSLATE-FORM-EXPANSION-FACTOR", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.form_translation", "translate_form_expansion_factor_int", "TRANSLATE-FORM-EXPANSION-FACTOR-INT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.form_translation", "show_translation_expansion_factor_stats", "SHOW-TRANSLATION-EXPANSION-FACTOR-STATS", 0, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.form_translation", "operator_translator", "OPERATOR-TRANSLATOR", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.form_translation", "translate_cand", "TRANSLATE-CAND", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.form_translation", "translate_ccatch", "TRANSLATE-CCATCH", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.form_translation", "translate_binding_construct_body", "TRANSLATE-BINDING-CONSTRUCT-BODY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.form_translation", "translate_binding_construct_form", "TRANSLATE-BINDING-CONSTRUCT-FORM", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.form_translation", "translate_cdec", "TRANSLATE-CDEC", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.form_translation", "translate_cdo", "TRANSLATE-CDO", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.form_translation", "translate_Xcdo_symbols", "TRANSLATE-%CDO-SYMBOLS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.form_translation", "translate_cdo_symbols", "TRANSLATE-CDO-SYMBOLS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.form_translation", "translate_Xcdohash", "TRANSLATE-%CDOHASH", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.form_translation", "translate_cdohash", "TRANSLATE-CDOHASH", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.form_translation", "translate_cdolist", "TRANSLATE-CDOLIST", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.form_translation", "translate_cdotimes", "TRANSLATE-CDOTIMES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.form_translation", "translate_check_type", "TRANSLATE-CHECK-TYPE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.form_translation", "translate_cinc", "TRANSLATE-CINC", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.form_translation", "translate_clet", "TRANSLATE-CLET", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.form_translation", "translate_clet_int", "TRANSLATE-CLET-INT", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.form_translation", "translate_final_clet_body", "TRANSLATE-FINAL-CLET-BODY", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.form_translation", "translate_cmultiple_value_bind", "TRANSLATE-CMULTIPLE-VALUE-BIND", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.form_translation", "translate_cmultiple_value_bind_bindings", "TRANSLATE-CMULTIPLE-VALUE-BIND-BINDINGS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.form_translation", "translate_cnot", "TRANSLATE-CNOT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.form_translation", "translate_cor", "TRANSLATE-COR", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.form_translation", "translate_cpop", "TRANSLATE-CPOP", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.form_translation", "translate_cprogv", "TRANSLATE-CPROGV", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.form_translation", "translate_cpush", "TRANSLATE-CPUSH", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.form_translation", "translate_cpushnew", "TRANSLATE-CPUSHNEW", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.form_translation", "translate_csetf", "TRANSLATE-CSETF", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.form_translation", "translator_setter_from_accessor", "TRANSLATOR-SETTER-FROM-ACCESSOR", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.form_translation", "translate_csetq", "TRANSLATE-CSETQ", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.form_translation", "translate_csetq_int", "TRANSLATE-CSETQ-INT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.form_translation", "translate_possibly_note_global_modification", "TRANSLATE-POSSIBLY-NOTE-GLOBAL-MODIFICATION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.form_translation", "translate_csome", "TRANSLATE-CSOME", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.form_translation", "translate_ctime", "TRANSLATE-CTIME", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.form_translation", "translate_cunwind_protect", "TRANSLATE-CUNWIND-PROTECT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.form_translation", "translate_cvs_id", "TRANSLATE-CVS-ID", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.form_translation", "translate_declaim", "TRANSLATE-DECLAIM", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.form_translation", "translate_declare", "TRANSLATE-DECLARE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.form_translation", "translate_defconstant", "TRANSLATE-DEFCONSTANT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.form_translation", "translate_define", "TRANSLATE-DEFINE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.form_translation", "translator_current_method", "TRANSLATOR-CURRENT-METHOD", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.form_translation", "translate_method_body", "TRANSLATE-METHOD-BODY", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.form_translation", "translate_method_possibly_add_final_ret", "TRANSLATE-METHOD-POSSIBLY-ADD-FINAL-RET", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.form_translation", "translate_method_possibly_add_entry", "TRANSLATE-METHOD-POSSIBLY-ADD-ENTRY", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.form_translation", "translate_method_possibly_add_with_current_thread", "TRANSLATE-METHOD-POSSIBLY-ADD-WITH-CURRENT-THREAD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.form_translation", "translator_body_accesses_current_thread_p", "TRANSLATOR-BODY-ACCESSES-CURRENT-THREAD-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.form_translation", "translator_current_thread_access_construct_p", "TRANSLATOR-CURRENT-THREAD-ACCESS-CONSTRUCT-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.form_translation", "translate_deflexical", "TRANSLATE-DEFLEXICAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.form_translation", "translate_defmacro", "TRANSLATE-DEFMACRO", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.form_translation", "translate_defparameter", "TRANSLATE-DEFPARAMETER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.form_translation", "translate_defstruct", "TRANSLATE-DEFSTRUCT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.form_translation", "translate_defstruct_ensure_translated_constants", "TRANSLATE-DEFSTRUCT-ENSURE-TRANSLATED-CONSTANTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.form_translation", "translate_defvar", "TRANSLATE-DEFVAR", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.form_translation", "translate_Xdtb", "TRANSLATE-%DTB", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.form_translation", "translate_enforce_type", "TRANSLATE-ENFORCE-TYPE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.form_translation", "translate_enforce_must", "TRANSLATE-ENFORCE-MUST", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.form_translation", "translate_fif", "TRANSLATE-FIF", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.form_translation", "translate_function", "TRANSLATE-FUNCTION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.form_translation", "translate_funless", "TRANSLATE-FUNLESS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.form_translation", "translate_fwhen", "TRANSLATE-FWHEN", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.form_translation", "translate_ignore", "TRANSLATE-IGNORE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.form_translation", "translate_multiple_value_list", "TRANSLATE-MULTIPLE-VALUE-LIST", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.form_translation", "translate_must", "TRANSLATE-MUST", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.form_translation", "translate_nth_value", "TRANSLATE-NTH-VALUE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.form_translation", "translate_pcase", "TRANSLATE-PCASE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.form_translation", "translate_pcase_clause", "TRANSLATE-PCASE-CLAUSE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.form_translation", "translate_pcond", "TRANSLATE-PCOND", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.form_translation", "translate_pif", "TRANSLATE-PIF", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.form_translation", "translate_proclaim", "TRANSLATE-PROCLAIM", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.form_translation", "translate_progn", "TRANSLATE-PROGN", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.form_translation", "translate_punless", "TRANSLATE-PUNLESS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.form_translation", "translate_pwhen", "TRANSLATE-PWHEN", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.form_translation", "translate_quote", "TRANSLATE-QUOTE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.form_translation", "translate_ret", "TRANSLATE-RET", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.form_translation", "translate_with_error_handler", "TRANSLATE-WITH-ERROR-HANDLER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.form_translation", "translate_with_process_resource_tracking", "TRANSLATE-WITH-PROCESS-RESOURCE-TRACKING", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.form_translation", "translate_with_static_area", "TRANSLATE-WITH-STATIC-AREA", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.form_translation", "translate_with_thread_private_area", "TRANSLATE-WITH-THREAD-PRIVATE-AREA", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.form_translation", "translate_with_working_area", "TRANSLATE-WITH-WORKING-AREA", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.form_translation", "translate_clet_bind", "TRANSLATE-CLET-BIND", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.form_translation", "translate_clet_local", "TRANSLATE-CLET-LOCAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.form_translation", "translate_code_comment", "TRANSLATE-CODE-COMMENT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.form_translation", "translate_defstruct_construct", "TRANSLATE-DEFSTRUCT-CONSTRUCT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.form_translation", "translate_defstruct_get_slot", "TRANSLATE-DEFSTRUCT-GET-SLOT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.form_translation", "translate_defstruct_object_p", "TRANSLATE-DEFSTRUCT-OBJECT-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.form_translation", "translate_defstruct_set_slot", "TRANSLATE-DEFSTRUCT-SET-SLOT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.form_translation", "translate_Xfor", "TRANSLATE-%FOR", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.form_translation", "translate_for", "TRANSLATE-FOR", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.form_translation", "translate_for_bindings", "TRANSLATE-FOR-BINDINGS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.form_translation", "translate_in_package", "TRANSLATE-IN-PACKAGE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.form_translation", "translate_Xmval", "TRANSLATE-%MVAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.form_translation", "translate_Xreset_mval", "TRANSLATE-%RESET-MVAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.form_translation", "translate_until", "TRANSLATE-UNTIL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.form_translation", "translate_while", "TRANSLATE-WHILE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.form_translation", "translator_implementation_symbol_p", "TRANSLATOR-IMPLEMENTATION-SYMBOL-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.form_translation", "translate_implementation_symbol", "TRANSLATE-IMPLEMENTATION-SYMBOL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.form_translation", "possibly_translate_implementation_symbols", "POSSIBLY-TRANSLATE-IMPLEMENTATION-SYMBOLS", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.form_translation", "clet_bind", "CLET-BIND");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.form_translation", "clet_local", "CLET-LOCAL");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.form_translation", "csetq_dynamic", "CSETQ-DYNAMIC");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.form_translation", "csetq_lexical", "CSETQ-LEXICAL");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.form_translation", "csetq_local", "CSETQ-LOCAL");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.form_translation", "sublisp_for", "FOR");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.form_translation", "Xfor", "%FOR");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.form_translation", "Xcdohash", "%CDOHASH");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.form_translation", "Xccatch", "%CCATCH");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.form_translation", "Xcunwind_protect", "%CUNWIND-PROTECT");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.form_translation", "Xcprogv", "%CPROGV");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.form_translation", "Xcdo_symbols", "%CDO-SYMBOLS");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.form_translation", "Xwith_error_handler", "%WITH-ERROR-HANDLER");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.form_translation", "Xwith_process_resource_tracking", "%WITH-PROCESS-RESOURCE-TRACKING");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.form_translation", "Xwith_current_thread", "%WITH-CURRENT-THREAD");
        return (SubLObject)form_translation.NIL;
    }
    
    public static SubLObject init_form_translation_file() {
        form_translation.$translator_within_binding_constructP$ = SubLFiles.defparameter("*TRANSLATOR-WITHIN-BINDING-CONSTRUCT?*", (SubLObject)form_translation.NIL);
        form_translation.$consider_translator_expansion_factor$ = SubLFiles.defvar("*CONSIDER-TRANSLATOR-EXPANSION-FACTOR*", (SubLObject)form_translation.NIL);
        form_translation.$operator_translators$ = SubLFiles.deflexical("*OPERATOR-TRANSLATORS*", (SubLObject)form_translation.$list32);
        form_translation.$translator_current_method$ = SubLFiles.defparameter("*TRANSLATOR-CURRENT-METHOD*", (SubLObject)form_translation.NIL);
        form_translation.$translator_implementation_symbols$ = SubLFiles.deflexical("*TRANSLATOR-IMPLEMENTATION-SYMBOLS*", (SubLObject)form_translation.NIL);
        return (SubLObject)form_translation.NIL;
    }
    
    public static SubLObject setup_form_translation_file() {
        utilities_macros.note_funcall_helper_function((SubLObject)form_translation.$sym172$TRANSLATOR_CURRENT_THREAD_ACCESS_CONSTRUCT_P);
        return (SubLObject)form_translation.NIL;
    }
    
    @Override
	public void declareFunctions() {
        declare_form_translation_file();
    }
    
    @Override
	public void initializeVariables() {
        init_form_translation_file();
    }
    
    @Override
	public void runTopLevelForms() {
        setup_form_translation_file();
    }
    
    static {
        me = (SubLFile)new form_translation();
        form_translation.$translator_within_binding_constructP$ = null;
        form_translation.$consider_translator_expansion_factor$ = null;
        form_translation.$operator_translators$ = null;
        form_translation.$translator_current_method$ = null;
        form_translation.$translator_implementation_symbols$ = null;
        $kw0$SL2C = SubLObjectFactory.makeKeyword("SL2C");
        $str1$unexpected_form____S = SubLObjectFactory.makeString("unexpected form : ~S");
        $kw2$UNSPECIFIED = SubLObjectFactory.makeKeyword("UNSPECIFIED");
        $kw3$LOCAL = SubLObjectFactory.makeKeyword("LOCAL");
        $kw4$DYNAMIC = SubLObjectFactory.makeKeyword("DYNAMIC");
        $sym5$_DYN = SubLObjectFactory.makeSymbol("%DYN");
        $kw6$LEXICAL = SubLObjectFactory.makeKeyword("LEXICAL");
        $sym7$_LEX = SubLObjectFactory.makeSymbol("%LEX");
        $kw8$CONSTANT = SubLObjectFactory.makeKeyword("CONSTANT");
        $str9$Unexpected_binding_type__S_for_va = SubLObjectFactory.makeString("Unexpected binding type ~S for variable ~S");
        $str10$time_to_implement__S = SubLObjectFactory.makeString("time to implement ~S");
        $list11 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MACRO"), (SubLObject)SubLObjectFactory.makeSymbol("&REST"), (SubLObject)SubLObjectFactory.makeSymbol("ARGS"));
        $list12 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPERATOR"), (SubLObject)SubLObjectFactory.makeSymbol("&REST"), (SubLObject)SubLObjectFactory.makeSymbol("ARGS"));
        $sym13$VACCESS = SubLObjectFactory.makeSymbol("VACCESS");
        $sym14$PROTECTED = SubLObjectFactory.makeSymbol("PROTECTED");
        $sym15$FACCESS = SubLObjectFactory.makeSymbol("FACCESS");
        $sym16$PRIVATE = SubLObjectFactory.makeSymbol("PRIVATE");
        $list17 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("VARIABLE"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("INITIALIZATION"), (SubLObject)SubLObjectFactory.makeSymbol("PROVIDED?"));
        $list18 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PROGN"));
        $list19 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("DYNAMIC"), (SubLObject)SubLObjectFactory.makeKeyword("LEXICAL"), (SubLObject)SubLObjectFactory.makeKeyword("CONSTANT"));
        $kw20$BINDING_TYPE = SubLObjectFactory.makeKeyword("BINDING-TYPE");
        $sym21$OPTIMIZE_FUNCALL = SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL");
        $int22$50 = SubLObjectFactory.makeInteger(50);
        $str23$Method__S_undergoes_a__Sx_expansi = SubLObjectFactory.makeString("Method ~S undergoes a ~Sx expansion when translated");
        $sym24$_ = SubLObjectFactory.makeSymbol(">");
        $sym25$SECOND = SubLObjectFactory.makeSymbol("SECOND");
        $str26$__Total_forms______________S = SubLObjectFactory.makeString("~%Total forms :           ~S");
        $str27$__Mean_form_size___________S = SubLObjectFactory.makeString("~%Mean form size :        ~S");
        $str28$__Mean_expansion_factor____Sx = SubLObjectFactory.makeString("~%Mean expansion factor : ~Sx");
        $str29$__Largest_expansions__ = SubLObjectFactory.makeString("~%Largest expansions :");
        $list30 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("EXPANSION-FACTOR"));
        $str31$___4___Dx___S = SubLObjectFactory.makeString("~%~4,' Dx  ~S");
        $list32 = ConsesLow.list(new SubLObject[] { ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("CAND"), (SubLObject)SubLObjectFactory.makeSymbol("TRANSLATE-CAND")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("CCATCH"), (SubLObject)SubLObjectFactory.makeSymbol("TRANSLATE-CCATCH")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("CDEC"), (SubLObject)SubLObjectFactory.makeSymbol("TRANSLATE-CDEC")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("CDO"), (SubLObject)SubLObjectFactory.makeSymbol("TRANSLATE-CDO")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("CDO-ALL-SYMBOLS"), (SubLObject)SubLObjectFactory.makeSymbol("TRANSLATE-CDO-ALL-SYMBOLS")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("CDO-EXTERNAL-SYMBOLS"), (SubLObject)SubLObjectFactory.makeSymbol("TRANSLATE-CDO-EXTERNAL-SYMBOLS")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("%CDO-SYMBOLS"), (SubLObject)SubLObjectFactory.makeSymbol("TRANSLATE-%CDO-SYMBOLS")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("CDO-SYMBOLS"), (SubLObject)SubLObjectFactory.makeSymbol("TRANSLATE-CDO-SYMBOLS")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("%CDOHASH"), (SubLObject)SubLObjectFactory.makeSymbol("TRANSLATE-%CDOHASH")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("CDOHASH"), (SubLObject)SubLObjectFactory.makeSymbol("TRANSLATE-CDOHASH")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("CDOLIST"), (SubLObject)SubLObjectFactory.makeSymbol("TRANSLATE-CDOLIST")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("CDOTIMES"), (SubLObject)SubLObjectFactory.makeSymbol("TRANSLATE-CDOTIMES")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("CHECK-TYPE"), (SubLObject)SubLObjectFactory.makeSymbol("TRANSLATE-CHECK-TYPE")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("CINC"), (SubLObject)SubLObjectFactory.makeSymbol("TRANSLATE-CINC")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)SubLObjectFactory.makeSymbol("TRANSLATE-CLET")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("CMULTIPLE-VALUE-BIND"), (SubLObject)SubLObjectFactory.makeSymbol("TRANSLATE-CMULTIPLE-VALUE-BIND")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("CNOT"), (SubLObject)SubLObjectFactory.makeSymbol("TRANSLATE-CNOT")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("COR"), (SubLObject)SubLObjectFactory.makeSymbol("TRANSLATE-COR")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("CPOP"), (SubLObject)SubLObjectFactory.makeSymbol("TRANSLATE-CPOP")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("CPROGV"), (SubLObject)SubLObjectFactory.makeSymbol("TRANSLATE-CPROGV")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("CPUSH"), (SubLObject)SubLObjectFactory.makeSymbol("TRANSLATE-CPUSH")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("CPUSHNEW"), (SubLObject)SubLObjectFactory.makeSymbol("TRANSLATE-CPUSHNEW")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("CSETF"), (SubLObject)SubLObjectFactory.makeSymbol("TRANSLATE-CSETF")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("TRANSLATE-CSETQ")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("CSOME"), (SubLObject)SubLObjectFactory.makeSymbol("TRANSLATE-CSOME")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("CTIME"), (SubLObject)SubLObjectFactory.makeSymbol("TRANSLATE-CTIME")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("CUNWIND-PROTECT"), (SubLObject)SubLObjectFactory.makeSymbol("TRANSLATE-CUNWIND-PROTECT")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("CVS-ID"), (SubLObject)SubLObjectFactory.makeSymbol("TRANSLATE-CVS-ID")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("DECLAIM"), (SubLObject)SubLObjectFactory.makeSymbol("TRANSLATE-DECLAIM")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("DECLARE"), (SubLObject)SubLObjectFactory.makeSymbol("TRANSLATE-DECLARE")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("DEFCONSTANT"), (SubLObject)SubLObjectFactory.makeSymbol("TRANSLATE-DEFCONSTANT")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("DEFINE"), (SubLObject)SubLObjectFactory.makeSymbol("TRANSLATE-DEFINE")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("DEFLEXICAL"), (SubLObject)SubLObjectFactory.makeSymbol("TRANSLATE-DEFLEXICAL")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("DEFMACRO"), (SubLObject)SubLObjectFactory.makeSymbol("TRANSLATE-DEFMACRO")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("DEFPARAMETER"), (SubLObject)SubLObjectFactory.makeSymbol("TRANSLATE-DEFPARAMETER")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("DEFSTRUCT"), (SubLObject)SubLObjectFactory.makeSymbol("TRANSLATE-DEFSTRUCT")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("DEFVAR"), (SubLObject)SubLObjectFactory.makeSymbol("TRANSLATE-DEFVAR")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("%DTB"), (SubLObject)SubLObjectFactory.makeSymbol("TRANSLATE-%DTB")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("ENFORCE-TYPE"), (SubLObject)SubLObjectFactory.makeSymbol("TRANSLATE-ENFORCE-TYPE")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("ENFORCE-MUST"), (SubLObject)SubLObjectFactory.makeSymbol("TRANSLATE-ENFORCE-MUST")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("FIF"), (SubLObject)SubLObjectFactory.makeSymbol("TRANSLATE-FIF")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("FUNCTION"), (SubLObject)SubLObjectFactory.makeSymbol("TRANSLATE-FUNCTION")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("FUNLESS"), (SubLObject)SubLObjectFactory.makeSymbol("TRANSLATE-FUNLESS")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("FWHEN"), (SubLObject)SubLObjectFactory.makeSymbol("TRANSLATE-FWHEN")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("IGNORE"), (SubLObject)SubLObjectFactory.makeSymbol("TRANSLATE-IGNORE")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("MULTIPLE-VALUE-LIST"), (SubLObject)SubLObjectFactory.makeSymbol("TRANSLATE-MULTIPLE-VALUE-LIST")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("MUST"), (SubLObject)SubLObjectFactory.makeSymbol("TRANSLATE-MUST")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("NTH-VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("TRANSLATE-NTH-VALUE")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("PCASE"), (SubLObject)SubLObjectFactory.makeSymbol("TRANSLATE-PCASE")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("PCOND"), (SubLObject)SubLObjectFactory.makeSymbol("TRANSLATE-PCOND")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("PIF"), (SubLObject)SubLObjectFactory.makeSymbol("TRANSLATE-PIF")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("PROCLAIM"), (SubLObject)SubLObjectFactory.makeSymbol("TRANSLATE-PROCLAIM")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("PROGN"), (SubLObject)SubLObjectFactory.makeSymbol("TRANSLATE-PROGN")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("PUNLESS"), (SubLObject)SubLObjectFactory.makeSymbol("TRANSLATE-PUNLESS")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)SubLObjectFactory.makeSymbol("TRANSLATE-PWHEN")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("TRANSLATE-QUOTE")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("TRANSLATE-RET")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("WITH-ERROR-HANDLER"), (SubLObject)SubLObjectFactory.makeSymbol("TRANSLATE-WITH-ERROR-HANDLER")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("WITH-PROCESS-RESOURCE-TRACKING"), (SubLObject)SubLObjectFactory.makeSymbol("TRANSLATE-WITH-PROCESS-RESOURCE-TRACKING")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("WITH-STATIC-AREA"), (SubLObject)SubLObjectFactory.makeSymbol("TRANSLATE-WITH-STATIC-AREA")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("WITH-THREAD-PRIVATE-AREA"), (SubLObject)SubLObjectFactory.makeSymbol("TRANSLATE-WITH-THREAD-PRIVATE-AREA")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("WITH-WORKING-AREA"), (SubLObject)SubLObjectFactory.makeSymbol("TRANSLATE-WITH-WORKING-AREA")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("VOLATILE"), (SubLObject)SubLObjectFactory.makeSymbol("TRANSLATE-VOLATILE")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("CLET-BIND"), (SubLObject)SubLObjectFactory.makeSymbol("TRANSLATE-CLET-BIND")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("CLET-LOCAL"), (SubLObject)SubLObjectFactory.makeSymbol("TRANSLATE-CLET-LOCAL")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("CODE-COMMENT"), (SubLObject)SubLObjectFactory.makeSymbol("TRANSLATE-CODE-COMMENT")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("CSETQ-DYNAMIC"), (SubLObject)SubLObjectFactory.makeSymbol("TRANSLATE-CSETQ-DYNAMIC")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("CSETQ-LEXICAL"), (SubLObject)SubLObjectFactory.makeSymbol("TRANSLATE-CSETQ-LEXICAL")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("CSETQ-LOCAL"), (SubLObject)SubLObjectFactory.makeSymbol("TRANSLATE-CSETQ-LOCAL")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("_DEFSTRUCT-CONSTRUCT", "SUBLISP"), (SubLObject)SubLObjectFactory.makeSymbol("TRANSLATE-DEFSTRUCT-CONSTRUCT")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("_DEFSTRUCT-GET-SLOT", "SUBLISP"), (SubLObject)SubLObjectFactory.makeSymbol("TRANSLATE-DEFSTRUCT-GET-SLOT")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("_DEFSTRUCT-OBJECT-P", "SUBLISP"), (SubLObject)SubLObjectFactory.makeSymbol("TRANSLATE-DEFSTRUCT-OBJECT-P")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("_DEFSTRUCT-SET-SLOT", "SUBLISP"), (SubLObject)SubLObjectFactory.makeSymbol("TRANSLATE-DEFSTRUCT-SET-SLOT")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("%FOR"), (SubLObject)SubLObjectFactory.makeSymbol("TRANSLATE-%FOR")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("FOR"), (SubLObject)SubLObjectFactory.makeSymbol("TRANSLATE-FOR")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("IN-PACKAGE"), (SubLObject)SubLObjectFactory.makeSymbol("TRANSLATE-IN-PACKAGE")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("%MVAL"), (SubLObject)SubLObjectFactory.makeSymbol("TRANSLATE-%MVAL")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("%RESET-MVAL"), (SubLObject)SubLObjectFactory.makeSymbol("TRANSLATE-%RESET-MVAL")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("UNTIL"), (SubLObject)SubLObjectFactory.makeSymbol("TRANSLATE-UNTIL")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("WHILE"), (SubLObject)SubLObjectFactory.makeSymbol("TRANSLATE-WHILE")) });
        $list33 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPERATOR"), (SubLObject)SubLObjectFactory.makeSymbol("&REST"), (SubLObject)SubLObjectFactory.makeSymbol("EXPRESSIONS"));
        $sym34$CAND = SubLObjectFactory.makeSymbol("CAND");
        $sym35$_DTB = SubLObjectFactory.makeSymbol("%DTB");
        $sym36$_BTD = SubLObjectFactory.makeSymbol("%BTD");
        $sym37$_AND = SubLObjectFactory.makeSymbol("%AND");
        $list38 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPERATOR"), (SubLObject)SubLObjectFactory.makeSymbol("TAG"), (SubLObject)SubLObjectFactory.makeSymbol("ANS-VAR"), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym39$CCATCH = SubLObjectFactory.makeSymbol("CCATCH");
        $sym40$CCATCH_ENV_VAR = SubLObjectFactory.makeUninternedSymbol("CCATCH-ENV-VAR");
        $sym41$_CCATCH = SubLObjectFactory.makeSymbol("%CCATCH");
        $list42 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPERATOR"), (SubLObject)SubLObjectFactory.makeSymbol("PLACE"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DELTA"), (SubLObject)form_translation.ONE_INTEGER));
        $sym43$CDEC = SubLObjectFactory.makeSymbol("CDEC");
        $sym44$CSETF = SubLObjectFactory.makeSymbol("CSETF");
        $sym45$_ = SubLObjectFactory.makeSymbol("-");
        $list46 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPERATOR"), (SubLObject)SubLObjectFactory.makeSymbol("VARS"), (SubLObject)SubLObjectFactory.makeSymbol("ENDTEST"), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym47$CDO = SubLObjectFactory.makeSymbol("CDO");
        $list48 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("VAR"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("INITIALIZATION"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("UPDATE"), (SubLObject)form_translation.NIL, (SubLObject)SubLObjectFactory.makeSymbol("UPDATE?")));
        $sym49$CSETQ = SubLObjectFactory.makeSymbol("CSETQ");
        $list50 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("&REST"), (SubLObject)SubLObjectFactory.makeSymbol("RESULT"));
        $sym51$CNOT = SubLObjectFactory.makeSymbol("CNOT");
        $sym52$CLET = SubLObjectFactory.makeSymbol("CLET");
        $sym53$_FOR = SubLObjectFactory.makeSymbol("%FOR");
        $list54 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPERATOR"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SYM"), (SubLObject)SubLObjectFactory.makeSymbol("PACKAGE"), (SubLObject)SubLObjectFactory.makeSymbol("ITERATOR")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym55$_CDO_SYMBOLS = SubLObjectFactory.makeSymbol("%CDO-SYMBOLS");
        $list56 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPERATOR"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SYM"), (SubLObject)SubLObjectFactory.makeSymbol("PACKAGE")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym57$CDO_SYMBOLS = SubLObjectFactory.makeSymbol("CDO-SYMBOLS");
        $sym58$CDO_SYMBOLS_PACKAGE = SubLObjectFactory.makeUninternedSymbol("CDO-SYMBOLS-PACKAGE");
        $sym59$CDO_SYMBOLS_ITERATOR = SubLObjectFactory.makeUninternedSymbol("CDO-SYMBOLS-ITERATOR");
        $list60 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPERATOR"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("KEY"), (SubLObject)SubLObjectFactory.makeSymbol("VAL"), (SubLObject)SubLObjectFactory.makeSymbol("TABLE"), (SubLObject)SubLObjectFactory.makeSymbol("ITERATOR"), (SubLObject)SubLObjectFactory.makeSymbol("ENTRY")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym61$_CDOHASH = SubLObjectFactory.makeSymbol("%CDOHASH");
        $list62 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPERATOR"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("KEY"), (SubLObject)SubLObjectFactory.makeSymbol("VAL"), (SubLObject)SubLObjectFactory.makeSymbol("TABLE")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym63$CDOHASH = SubLObjectFactory.makeSymbol("CDOHASH");
        $sym64$CDOHASH_TABLE = SubLObjectFactory.makeUninternedSymbol("CDOHASH-TABLE");
        $sym65$CDOHASH_ITERATOR = SubLObjectFactory.makeUninternedSymbol("CDOHASH-ITERATOR");
        $sym66$CDOHASH_ENTRY = SubLObjectFactory.makeUninternedSymbol("CDOHASH-ENTRY");
        $list67 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPERATOR"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("VAR"), (SubLObject)SubLObjectFactory.makeSymbol("LISTFORM")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym68$CDOLIST = SubLObjectFactory.makeSymbol("CDOLIST");
        $sym69$CDOLIST_LIST_VAR = SubLObjectFactory.makeUninternedSymbol("CDOLIST-LIST-VAR");
        $sym70$CLET_LOCAL = SubLObjectFactory.makeSymbol("CLET-LOCAL");
        $sym71$FOR = SubLObjectFactory.makeSymbol("FOR");
        $sym72$FIRST = SubLObjectFactory.makeSymbol("FIRST");
        $sym73$NULL = SubLObjectFactory.makeSymbol("NULL");
        $sym74$REST = SubLObjectFactory.makeSymbol("REST");
        $list75 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPERATOR"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("VAR"), (SubLObject)SubLObjectFactory.makeSymbol("INTEGER")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym76$CDOTIMES = SubLObjectFactory.makeSymbol("CDOTIMES");
        $sym77$CDOTIMES_END_VAR = SubLObjectFactory.makeUninternedSymbol("CDOTIMES-END-VAR");
        $list78 = ConsesLow.list((SubLObject)form_translation.ZERO_INTEGER);
        $sym79$_ = SubLObjectFactory.makeSymbol("<");
        $sym80$CINC = SubLObjectFactory.makeSymbol("CINC");
        $list81 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPERATOR"), (SubLObject)SubLObjectFactory.makeSymbol("OBJECT"), (SubLObject)SubLObjectFactory.makeSymbol("PRED"));
        $sym82$CHECK_TYPE = SubLObjectFactory.makeSymbol("CHECK-TYPE");
        $sym83$QUOTE = SubLObjectFactory.makeSymbol("QUOTE");
        $sym84$_DP_CHECK_TYPE = SubLObjectFactory.makeSymbol("%DP-CHECK-TYPE");
        $sym85$_ = SubLObjectFactory.makeSymbol("+");
        $list86 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPERATOR"), (SubLObject)SubLObjectFactory.makeSymbol("BINDINGS"), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $list87 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIRST-BINDING"), (SubLObject)SubLObjectFactory.makeSymbol("&REST"), (SubLObject)SubLObjectFactory.makeSymbol("REST-BINDINGS"));
        $kw88$UNSET = SubLObjectFactory.makeKeyword("UNSET");
        $list89 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("BINDING-VARIABLE"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("BINDING-INITIALIZATION"));
        $sym90$CLET_BIND = SubLObjectFactory.makeSymbol("CLET-BIND");
        $str91$CLET_of_lexical_variable__S_being = SubLObjectFactory.makeString("CLET of lexical variable ~S being converted to CUNWIND-PROTECT CSETQ idiom");
        $str92$CLET_of_constant__S_is_not_allowe = SubLObjectFactory.makeString("CLET of constant ~S is not allowed");
        $str93$Unexpected_variable__S = SubLObjectFactory.makeString("Unexpected variable ~S");
        $sym94$PROGN = SubLObjectFactory.makeSymbol("PROGN");
        $list95 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPERATOR"), (SubLObject)SubLObjectFactory.makeSymbol("VARS"), (SubLObject)SubLObjectFactory.makeSymbol("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym96$CMULTIPLE_VALUE_BIND = SubLObjectFactory.makeSymbol("CMULTIPLE-VALUE-BIND");
        $list97 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("%RESET-MVAL"));
        $list98 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIRST-VAR"), (SubLObject)SubLObjectFactory.makeSymbol("&REST"), (SubLObject)SubLObjectFactory.makeSymbol("REST-VARS"));
        $sym99$_MVAL = SubLObjectFactory.makeSymbol("%MVAL");
        $list100 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPERATOR"), (SubLObject)SubLObjectFactory.makeSymbol("EXPRESSION"));
        $sym101$_NOT = SubLObjectFactory.makeSymbol("%NOT");
        $sym102$COR = SubLObjectFactory.makeSymbol("COR");
        $sym103$_OR = SubLObjectFactory.makeSymbol("%OR");
        $list104 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPERATOR"), (SubLObject)SubLObjectFactory.makeSymbol("PLACE"));
        $sym105$CPOP = SubLObjectFactory.makeSymbol("CPOP");
        $sym106$CDR = SubLObjectFactory.makeSymbol("CDR");
        $list107 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPERATOR"), (SubLObject)SubLObjectFactory.makeSymbol("SPECIAL-VARS"), (SubLObject)SubLObjectFactory.makeSymbol("BINDINGS"), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym108$CPROGV = SubLObjectFactory.makeSymbol("CPROGV");
        $sym109$CPROGV_VAR = SubLObjectFactory.makeUninternedSymbol("CPROGV-VAR");
        $sym110$_CPROGV = SubLObjectFactory.makeSymbol("%CPROGV");
        $list111 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPERATOR"), (SubLObject)SubLObjectFactory.makeSymbol("ITEM"), (SubLObject)SubLObjectFactory.makeSymbol("PLACE"));
        $sym112$CPUSH = SubLObjectFactory.makeSymbol("CPUSH");
        $sym113$CONS = SubLObjectFactory.makeSymbol("CONS");
        $list114 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPERATOR"), (SubLObject)SubLObjectFactory.makeSymbol("ITEM"), (SubLObject)SubLObjectFactory.makeSymbol("PLACE"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TEST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCTION"), (SubLObject)form_translation.EQL))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("KEY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCTION"), (SubLObject)form_translation.IDENTITY))));
        $list115 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCTION"), (SubLObject)form_translation.EQL);
        $list116 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCTION"), (SubLObject)form_translation.IDENTITY);
        $sym117$CPUSHNEW = SubLObjectFactory.makeSymbol("CPUSHNEW");
        $sym118$ITEM_VAR = SubLObjectFactory.makeUninternedSymbol("ITEM-VAR");
        $sym119$PUNLESS = SubLObjectFactory.makeSymbol("PUNLESS");
        $sym120$MEMBER = SubLObjectFactory.makeSymbol("MEMBER");
        $list121 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPERATOR"), (SubLObject)SubLObjectFactory.makeSymbol("PLACE"), (SubLObject)SubLObjectFactory.makeSymbol("VALUE"));
        $sym122$CAR = SubLObjectFactory.makeSymbol("CAR");
        $sym123$RPLACA = SubLObjectFactory.makeSymbol("RPLACA");
        $sym124$RPLACD = SubLObjectFactory.makeSymbol("RPLACD");
        $sym125$NTH = SubLObjectFactory.makeSymbol("NTH");
        $sym126$SET_NTH = SubLObjectFactory.makeSymbol("SET-NTH");
        $sym127$GETHASH = SubLObjectFactory.makeSymbol("GETHASH");
        $sym128$SETHASH = SubLObjectFactory.makeSymbol("SETHASH");
        $sym129$GETHASH_WITHOUT_VALUES = SubLObjectFactory.makeSymbol("GETHASH-WITHOUT-VALUES");
        $sym130$CHAR = SubLObjectFactory.makeSymbol("CHAR");
        $sym131$SET_CHAR = SubLObjectFactory.makeSymbol("SET-CHAR");
        $sym132$AREF = SubLObjectFactory.makeSymbol("AREF");
        $sym133$SET_AREF = SubLObjectFactory.makeSymbol("SET-AREF");
        $sym134$GET = SubLObjectFactory.makeSymbol("GET");
        $sym135$PUT = SubLObjectFactory.makeSymbol("PUT");
        $sym136$SYMBOL_VALUE = SubLObjectFactory.makeSymbol("SYMBOL-VALUE");
        $sym137$SET = SubLObjectFactory.makeSymbol("SET");
        $list138 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ACCESSOR"), (SubLObject)SubLObjectFactory.makeSymbol("EXPRESSION"));
        $sym139$SETTER_FROM_ACCESSOR = SubLObjectFactory.makeSymbol("SETTER-FROM-ACCESSOR", "SUBLISP");
        $list140 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPERATOR"), (SubLObject)SubLObjectFactory.makeSymbol("VAR"), (SubLObject)SubLObjectFactory.makeSymbol("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("&REST"), (SubLObject)SubLObjectFactory.makeSymbol("VAR-VAL-PAIRS"));
        $list141 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("VAR"), (SubLObject)SubLObjectFactory.makeSymbol("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("&REST"), (SubLObject)SubLObjectFactory.makeSymbol("MORE-VAR-VAL-PAIRS"));
        $list142 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPERATOR"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("VAR"), (SubLObject)SubLObjectFactory.makeSymbol("LISTFORM"), (SubLObject)SubLObjectFactory.makeSymbol("ENDVAR")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym143$CSOME = SubLObjectFactory.makeSymbol("CSOME");
        $sym144$CSOME_LIST_VAR = SubLObjectFactory.makeUninternedSymbol("CSOME-LIST-VAR");
        $list145 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPERATOR"), (SubLObject)SubLObjectFactory.makeSymbol("VAR"), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym146$CTIME = SubLObjectFactory.makeSymbol("CTIME");
        $sym147$TIME_VAR = SubLObjectFactory.makeUninternedSymbol("TIME-VAR");
        $list148 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-INTERNAL-REAL-TIME")));
        $sym149$_ = SubLObjectFactory.makeSymbol("/");
        $list150 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-INTERNAL-REAL-TIME"));
        $list151 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*INTERNAL-TIME-UNITS-PER-SECOND*"));
        $list152 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPERATOR"), (SubLObject)SubLObjectFactory.makeSymbol("PROTECTED-FORM"), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym153$CUNWIND_PROTECT = SubLObjectFactory.makeSymbol("CUNWIND-PROTECT");
        $sym154$CUNWIND_PROTECT_ENV_VAR = SubLObjectFactory.makeUninternedSymbol("CUNWIND-PROTECT-ENV-VAR");
        $sym155$_CUNWIND_PROTECT = SubLObjectFactory.makeSymbol("%CUNWIND-PROTECT");
        $list156 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPERATOR"), (SubLObject)SubLObjectFactory.makeSymbol("&REST"), (SubLObject)SubLObjectFactory.makeSymbol("DECLARATION-SPECIFIERS"));
        $sym157$DECLAIM = SubLObjectFactory.makeSymbol("DECLAIM");
        $sym158$PROCLAIM = SubLObjectFactory.makeSymbol("PROCLAIM");
        $list159 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPERATOR"), (SubLObject)SubLObjectFactory.makeSymbol("&REST"), (SubLObject)SubLObjectFactory.makeSymbol("DECLARATIONS"));
        $sym160$DECLARE = SubLObjectFactory.makeSymbol("DECLARE");
        $list161 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPERATOR"), (SubLObject)SubLObjectFactory.makeSymbol("VARIABLE"), (SubLObject)SubLObjectFactory.makeSymbol("INITIALIZATION"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("DOCUMENTATION"));
        $sym162$DEFCONSTANT = SubLObjectFactory.makeSymbol("DEFCONSTANT");
        $sym163$SYMBOLP = SubLObjectFactory.makeSymbol("SYMBOLP");
        $list164 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPERATOR"), (SubLObject)SubLObjectFactory.makeSymbol("NAME"), (SubLObject)SubLObjectFactory.makeSymbol("ARGLIST"), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym165$DEFINE = SubLObjectFactory.makeSymbol("DEFINE");
        $list166 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DOCUMENTATION"), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("REAL-BODY"));
        $list167 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)form_translation.NIL));
        $sym168$RET = SubLObjectFactory.makeSymbol("RET");
        $sym169$POSSIBLY_NOTE_FUNCTION_ENTRY = SubLObjectFactory.makeSymbol("POSSIBLY-NOTE-FUNCTION-ENTRY", "SUBLISP");
        $sym170$THREAD = SubLObjectFactory.makeUninternedSymbol("THREAD");
        $sym171$_WITH_CURRENT_THREAD = SubLObjectFactory.makeSymbol("%WITH-CURRENT-THREAD");
        $sym172$TRANSLATOR_CURRENT_THREAD_ACCESS_CONSTRUCT_P = SubLObjectFactory.makeSymbol("TRANSLATOR-CURRENT-THREAD-ACCESS-CONSTRUCT-P");
        $list173 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("%RESET-MVAL"), (SubLObject)SubLObjectFactory.makeSymbol("%MVAL"), (SubLObject)SubLObjectFactory.makeSymbol("CLET-BIND"), (SubLObject)SubLObjectFactory.makeSymbol("%DYN"), (SubLObject)SubLObjectFactory.makeSymbol("%CCATCH"));
        $sym174$DEFLEXICAL = SubLObjectFactory.makeSymbol("DEFLEXICAL");
        $list175 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPERATOR"), (SubLObject)SubLObjectFactory.makeSymbol("NAME"), (SubLObject)SubLObjectFactory.makeSymbol("PATTERN"), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym176$DEFMACRO = SubLObjectFactory.makeSymbol("DEFMACRO");
        $list177 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MACROFORM"), (SubLObject)SubLObjectFactory.makeSymbol("ENVIRONMENT"));
        $sym178$CDESTRUCTURING_BIND = SubLObjectFactory.makeSymbol("CDESTRUCTURING-BIND");
        $list179 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDR"), (SubLObject)SubLObjectFactory.makeSymbol("MACROFORM"));
        $sym180$DEFINE_MACROEXPANDER = SubLObjectFactory.makeSymbol("DEFINE-MACROEXPANDER");
        $sym181$DEFPARAMETER = SubLObjectFactory.makeSymbol("DEFPARAMETER");
        $list182 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPERATOR"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NAME"), (SubLObject)SubLObjectFactory.makeSymbol("&REST"), (SubLObject)SubLObjectFactory.makeSymbol("OPTIONS")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("SLOTS"));
        $sym183$DEFSTRUCT = SubLObjectFactory.makeSymbol("DEFSTRUCT");
        $sym184$_DEFSTRUCT_CLASS = SubLObjectFactory.makeSymbol("%DEFSTRUCT-CLASS");
        $list185 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPERATOR"), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("TRANSLATED-BODY"));
        $kw186$NAME = SubLObjectFactory.makeKeyword("NAME");
        $kw187$C_STRUCTURE_TAG = SubLObjectFactory.makeKeyword("C-STRUCTURE-TAG");
        $kw188$PREDICATE = SubLObjectFactory.makeKeyword("PREDICATE");
        $kw189$SLOTS = SubLObjectFactory.makeKeyword("SLOTS");
        $kw190$SLOT_KEYWORDS = SubLObjectFactory.makeKeyword("SLOT-KEYWORDS");
        $kw191$GETTERS = SubLObjectFactory.makeKeyword("GETTERS");
        $kw192$SETTERS = SubLObjectFactory.makeKeyword("SETTERS");
        $kw193$PRINT_FUNCTION = SubLObjectFactory.makeKeyword("PRINT-FUNCTION");
        $sym194$DEFAULT_STRUCT_PRINT_FUNCTION = SubLObjectFactory.makeSymbol("DEFAULT-STRUCT-PRINT-FUNCTION");
        $list195 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPERATOR"), (SubLObject)SubLObjectFactory.makeSymbol("VARIABLE"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("INITIALIZATION"), (SubLObject)SubLObjectFactory.makeSymbol("DOCUMENTATION"));
        $sym196$DEFVAR = SubLObjectFactory.makeSymbol("DEFVAR");
        $list197 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPERATOR"), (SubLObject)SubLObjectFactory.makeSymbol("CONDITION"));
        $sym198$ENFORCE_TYPE = SubLObjectFactory.makeSymbol("ENFORCE-TYPE");
        $sym199$_DP_ENFORCE_TYPE = SubLObjectFactory.makeSymbol("%DP-ENFORCE-TYPE");
        $list200 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPERATOR"), (SubLObject)SubLObjectFactory.makeSymbol("FORM"), (SubLObject)SubLObjectFactory.makeSymbol("FORMAT-STRING"), (SubLObject)SubLObjectFactory.makeSymbol("&REST"), (SubLObject)SubLObjectFactory.makeSymbol("ARGUMENTS"));
        $sym201$ENFORCE_MUST = SubLObjectFactory.makeSymbol("ENFORCE-MUST");
        $sym202$ERROR = SubLObjectFactory.makeSymbol("ERROR");
        $list203 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPERATOR"), (SubLObject)SubLObjectFactory.makeSymbol("CONDITION"), (SubLObject)SubLObjectFactory.makeSymbol("TRUE-VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("FALSE-VALUE"));
        $sym204$FIF = SubLObjectFactory.makeSymbol("FIF");
        $list205 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPERATOR"), (SubLObject)SubLObjectFactory.makeSymbol("SYMBOL"));
        $sym206$FUNCTION = SubLObjectFactory.makeSymbol("FUNCTION");
        $sym207$SYMBOL_FUNCTION = SubLObjectFactory.makeSymbol("SYMBOL-FUNCTION");
        $list208 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPERATOR"), (SubLObject)SubLObjectFactory.makeSymbol("CONDITION"), (SubLObject)SubLObjectFactory.makeSymbol("FALSE-VALUE"));
        $sym209$FUNLESS = SubLObjectFactory.makeSymbol("FUNLESS");
        $list210 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPERATOR"), (SubLObject)SubLObjectFactory.makeSymbol("CONDITION"), (SubLObject)SubLObjectFactory.makeSymbol("TRUE-VALUE"));
        $sym211$FWHEN = SubLObjectFactory.makeSymbol("FWHEN");
        $list212 = ConsesLow.list((SubLObject)form_translation.NIL);
        $list213 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPERATOR"), (SubLObject)SubLObjectFactory.makeSymbol("SUBFORM"));
        $sym214$MULTIPLE_VALUE_LIST = SubLObjectFactory.makeSymbol("MULTIPLE-VALUE-LIST");
        $sym215$MUST = SubLObjectFactory.makeSymbol("MUST");
        $sym216$_IGNORE_MUSTS__ = SubLObjectFactory.makeSymbol("*IGNORE-MUSTS?*");
        $list217 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPERATOR"), (SubLObject)SubLObjectFactory.makeSymbol("N"), (SubLObject)SubLObjectFactory.makeSymbol("SUBFORM"));
        $sym218$NTH_VALUE = SubLObjectFactory.makeSymbol("NTH-VALUE");
        $list219 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPERATOR"), (SubLObject)SubLObjectFactory.makeSymbol("TEST-OBJECT"), (SubLObject)SubLObjectFactory.makeSymbol("&REST"), (SubLObject)SubLObjectFactory.makeSymbol("CLAUSES"));
        $sym220$PCASE = SubLObjectFactory.makeSymbol("PCASE");
        $sym221$PCASE_VAR = SubLObjectFactory.makeUninternedSymbol("PCASE-VAR");
        $sym222$PCOND = SubLObjectFactory.makeSymbol("PCOND");
        $list223 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("KEY"), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("CLAUSE-BODY"));
        $sym224$OTHERWISE = SubLObjectFactory.makeSymbol("OTHERWISE");
        $str225$_AEncountered_a_PCASE_that_uses_T = SubLObjectFactory.makeString("~AEncountered a PCASE that uses T rather than OTHERWISE");
        $str226$Within_ = SubLObjectFactory.makeString("Within ");
        $str227$___ = SubLObjectFactory.makeString(" : ");
        $str228$ = SubLObjectFactory.makeString("");
        $list229 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPERATOR"), (SubLObject)SubLObjectFactory.makeSymbol("&REST"), (SubLObject)SubLObjectFactory.makeSymbol("CLAUSES"));
        $list230 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CONDITION"), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("CLAUSE-BODY"));
        $list231 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPERATOR"), (SubLObject)SubLObjectFactory.makeSymbol("CONDITION"), (SubLObject)SubLObjectFactory.makeSymbol("ACTION"), (SubLObject)SubLObjectFactory.makeSymbol("ELSE-ACTION"));
        $sym232$PIF = SubLObjectFactory.makeSymbol("PIF");
        $list233 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPERATOR"), (SubLObject)SubLObjectFactory.makeSymbol("DECLARATION-SPECIFIER"));
        $list234 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DECLARATION-IDENTIFIER"), (SubLObject)SubLObjectFactory.makeSymbol("&REST"), (SubLObject)SubLObjectFactory.makeSymbol("ARGS"));
        $list235 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("VISIBILITY"), (SubLObject)SubLObjectFactory.makeSymbol("&REST"), (SubLObject)SubLObjectFactory.makeSymbol("METHODS"));
        $list236 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PRIVATE"), (SubLObject)SubLObjectFactory.makeSymbol("PROTECTED"), (SubLObject)SubLObjectFactory.makeSymbol("PUBLIC"));
        $list237 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("VISIBILITY"), (SubLObject)SubLObjectFactory.makeSymbol("&REST"), (SubLObject)SubLObjectFactory.makeSymbol("GLOBALS"));
        $sym238$INLINE = SubLObjectFactory.makeSymbol("INLINE");
        $sym239$NOTINLINE = SubLObjectFactory.makeSymbol("NOTINLINE");
        $sym240$_PROCLAIM = SubLObjectFactory.makeSymbol("%PROCLAIM");
        $list241 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPERATOR"), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $list242 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPERATOR"), (SubLObject)SubLObjectFactory.makeSymbol("CONDITION"), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $list243 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)form_translation.T));
        $sym244$PWHEN = SubLObjectFactory.makeSymbol("PWHEN");
        $list245 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPERATOR"), (SubLObject)SubLObjectFactory.makeSymbol("OBJECT"));
        $list246 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("%EXIT"));
        $list247 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPERATOR"), (SubLObject)SubLObjectFactory.makeSymbol("HANDLER"), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym248$WITH_ERROR_HANDLER = SubLObjectFactory.makeSymbol("WITH-ERROR-HANDLER");
        $sym249$CATCH_VAR = SubLObjectFactory.makeUninternedSymbol("CATCH-VAR");
        $sym250$ERROR_VAR = SubLObjectFactory.makeUninternedSymbol("ERROR-VAR");
        $sym251$_WITH_ERROR_HANDLER = SubLObjectFactory.makeSymbol("%WITH-ERROR-HANDLER");
        $sym252$WITH_PROCESS_RESOURCE_TRACKING = SubLObjectFactory.makeSymbol("WITH-PROCESS-RESOURCE-TRACKING");
        $sym253$RESOURCE_TRACKING_ENV_VAR = SubLObjectFactory.makeUninternedSymbol("RESOURCE-TRACKING-ENV-VAR");
        $sym254$_WITH_PROCESS_RESOURCE_TRACKING = SubLObjectFactory.makeSymbol("%WITH-PROCESS-RESOURCE-TRACKING");
        $sym255$WITH_STATIC_AREA = SubLObjectFactory.makeSymbol("WITH-STATIC-AREA");
        $list256 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*CURRENT-AREA*"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-STATIC-AREA"))));
        $sym257$WITH_THREAD_PRIVATE_AREA = SubLObjectFactory.makeSymbol("WITH-THREAD-PRIVATE-AREA");
        $list258 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*CURRENT-AREA*"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-THREAD-PRIVATE-AREA"))));
        $sym259$WITH_WORKING_AREA = SubLObjectFactory.makeSymbol("WITH-WORKING-AREA");
        $list260 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*CURRENT-AREA*"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-WORKING-AREA"))));
        $list261 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPERATOR"), (SubLObject)SubLObjectFactory.makeSymbol("DYNAMIC-BINDINGS"), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $list262 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("VARIABLE"), (SubLObject)SubLObjectFactory.makeSymbol("INITIALIZATION"));
        $list263 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPERATOR"), (SubLObject)SubLObjectFactory.makeSymbol("LOCAL-BINDINGS"), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $list264 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPERATOR"), (SubLObject)SubLObjectFactory.makeSymbol("C-STRUCTURE-TAG"), (SubLObject)SubLObjectFactory.makeSymbol("SIZE"), (SubLObject)SubLObjectFactory.makeSymbol("TYPE-VAR"), (SubLObject)SubLObjectFactory.makeSymbol("TYPE"));
        $sym265$_DEFSTRUCT_CONSTRUCT = SubLObjectFactory.makeSymbol("_DEFSTRUCT-CONSTRUCT", "SUBLISP");
        $sym266$INTEGERP = SubLObjectFactory.makeSymbol("INTEGERP");
        $list267 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPERATOR"), (SubLObject)SubLObjectFactory.makeSymbol("OBJECT"), (SubLObject)SubLObjectFactory.makeSymbol("INDEX"), (SubLObject)SubLObjectFactory.makeSymbol("TYPE"), (SubLObject)SubLObjectFactory.makeSymbol("SLOT"));
        $sym268$_DEFSTRUCT_GET_SLOT = SubLObjectFactory.makeSymbol("_DEFSTRUCT-GET-SLOT", "SUBLISP");
        $list269 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPERATOR"), (SubLObject)SubLObjectFactory.makeSymbol("OBJECT"), (SubLObject)SubLObjectFactory.makeSymbol("C-STRUCTURE-TAG"), (SubLObject)SubLObjectFactory.makeSymbol("TYPE-VAR"), (SubLObject)SubLObjectFactory.makeSymbol("TYPE"));
        $sym270$_DEFSTRUCT_OBJECT_P = SubLObjectFactory.makeSymbol("_DEFSTRUCT-OBJECT-P", "SUBLISP");
        $list271 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPERATOR"), (SubLObject)SubLObjectFactory.makeSymbol("OBJECT"), (SubLObject)SubLObjectFactory.makeSymbol("INDEX"), (SubLObject)SubLObjectFactory.makeSymbol("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("TYPE"), (SubLObject)SubLObjectFactory.makeSymbol("SLOT"));
        $sym272$_DEFSTRUCT_SET_SLOT = SubLObjectFactory.makeSymbol("_DEFSTRUCT-SET-SLOT", "SUBLISP");
        $list273 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPERATOR"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INITIALIZATIONS"), (SubLObject)SubLObjectFactory.makeSymbol("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("UPDATES")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $list274 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPERATOR"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("BINDINGS"), (SubLObject)SubLObjectFactory.makeSymbol("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("UPDATES")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $list275 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("VARIABLE"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("INITIALIZATION"));
        $list276 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPERATOR"), (SubLObject)SubLObjectFactory.makeSymbol("NAME"));
        $sym277$IN_PACKAGE = SubLObjectFactory.makeSymbol("IN-PACKAGE");
        $sym278$_PACKAGE_ = SubLObjectFactory.makeSymbol("*PACKAGE*");
        $sym279$FIND_PACKAGE = SubLObjectFactory.makeSymbol("FIND-PACKAGE");
        $list280 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPERATOR"), (SubLObject)SubLObjectFactory.makeSymbol("N"));
        $list281 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPERATOR"), (SubLObject)SubLObjectFactory.makeSymbol("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym282$UNTIL = SubLObjectFactory.makeSymbol("UNTIL");
        $sym283$WHILE = SubLObjectFactory.makeSymbol("WHILE");
        $list284 = (SubLList)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("OPERATOR"), (SubLObject)SubLObjectFactory.makeSymbol("ARGS"));
        $list285 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DYNAMIC-BINDINGS"), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $list286 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LOCAL-BINDINGS"), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $list287 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("VARIABLE"), (SubLObject)SubLObjectFactory.makeSymbol("VALUE"));
        $list288 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("BINDINGS"), (SubLObject)SubLObjectFactory.makeSymbol("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("UPDATES")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $list289 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INITIALIZATIONS"), (SubLObject)SubLObjectFactory.makeSymbol("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("UPDATES")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $list290 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("KEY"), (SubLObject)SubLObjectFactory.makeSymbol("VAL"), (SubLObject)SubLObjectFactory.makeSymbol("TABLE"), (SubLObject)SubLObjectFactory.makeSymbol("TABLE-VAR"), (SubLObject)SubLObjectFactory.makeSymbol("ITERATOR-VAR"), (SubLObject)SubLObjectFactory.makeSymbol("ENTRY-VAR")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $list291 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TAG"), (SubLObject)SubLObjectFactory.makeSymbol("ANS-VAR"), (SubLObject)SubLObjectFactory.makeSymbol("ENV-VAR")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $list292 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ENV-VAR"), (SubLObject)SubLObjectFactory.makeSymbol("PROTECTED-FORM"), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $list293 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SPECIAL-VARS"), (SubLObject)SubLObjectFactory.makeSymbol("BINDINGS"), (SubLObject)SubLObjectFactory.makeSymbol("INTERNAL-VAR")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $list294 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SYM"), (SubLObject)SubLObjectFactory.makeSymbol("PACKAGE"), (SubLObject)SubLObjectFactory.makeSymbol("PACKAGE-VAR"), (SubLObject)SubLObjectFactory.makeSymbol("ITERATOR-VAR")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $list295 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HANDLER"), (SubLObject)SubLObjectFactory.makeSymbol("CATCH-VAR"), (SubLObject)SubLObjectFactory.makeSymbol("ERROR-VAR")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $list296 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RESOURCE-VAR"), (SubLObject)SubLObjectFactory.makeSymbol("RESULT-VAR"), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $list297 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("THREAD-VAR"), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $list298 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CURRENT-PROCESS")));
    }
}

/*

	Total time: 897 ms
	 synthetic 
*/