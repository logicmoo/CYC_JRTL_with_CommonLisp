package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class lexicon_macros extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.lexicon_macros";
    public static final String myFingerPrint = "e4c748af1818ebbbecd6d689fb27405affb060fcccbfd84b3fe7ae66698aa126";
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-macros.lisp", position = 2398L)
    public static SubLSymbol $nl_trie_assumed_validP$;
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-macros.lisp", position = 2763L)
    public static SubLSymbol $nl_trie_accessor_default_case_sensitivity$;
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-macros.lisp", position = 4278L)
    public static SubLSymbol $nl_trie_subword_index_default_case_sensitivity$;
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-macros.lisp", position = 5584L)
    public static SubLSymbol $nl_trie_assume_standardized_stringsP$;
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-macros.lisp", position = 5994L)
    public static SubLSymbol $lexicon_memoization_state$;
    private static final SubLList $list0;
    private static final SubLSymbol $sym1$CLET;
    private static final SubLSymbol $sym2$_EXCLUDE_VULGARITIES__;
    private static final SubLSymbol $sym3$MEMBER_;
    private static final SubLList $list4;
    private static final SubLSymbol $sym5$_EXCLUDE_SLANG__;
    private static final SubLList $list6;
    private static final SubLSymbol $sym7$_EXCLUDE_ARCHAIC_SPEECH__;
    private static final SubLList $list8;
    private static final SubLSymbol $sym9$_EXCLUDE_INDIRECT_RELATIONS__;
    private static final SubLList $list10;
    private static final SubLList $list11;
    private static final SubLObject $const12$LexicalAffix;
    private static final SubLString $str13$Mapping_reified_affixes;
    private static final SubLSymbol $sym14$TOTAL;
    private static final SubLSymbol $sym15$SO_FAR;
    private static final SubLSymbol $sym16$REIFIED_AFFIXES;
    private static final SubLSymbol $sym17$ALL_FORT_INSTANCES;
    private static final SubLSymbol $sym18$LENGTH;
    private static final SubLList $list19;
    private static final SubLSymbol $sym20$NOTING_PERCENT_PROGRESS;
    private static final SubLSymbol $sym21$CDOLIST;
    private static final SubLSymbol $sym22$CINC;
    private static final SubLSymbol $sym23$NOTE_PERCENT_PROGRESS;
    private static final SubLList $list24;
    private static final SubLList $list25;
    private static final SubLSymbol $kw26$ALLOW_OTHER_KEYS;
    private static final SubLSymbol $kw27$MT;
    private static final SubLSymbol $kw28$ANY;
    private static final SubLList $list29;
    private static final SubLSymbol $sym30$PWHEN;
    private static final SubLSymbol $sym31$DERIVED_PRED_;
    private static final SubLList $list32;
    private static final SubLList $list33;
    private static final SubLSymbol $kw34$DONE;
    private static final SubLSymbol $sym35$RULE;
    private static final SubLSymbol $sym36$CSOME;
    private static final SubLSymbol $sym37$SUFFIX_RULES_FOR_PRED;
    private static final SubLSymbol $sym38$CDESTRUCTURING_BIND;
    private static final SubLSymbol $sym39$REST;
    private static final SubLSymbol $sym40$GAF_ARGS;
    private static final SubLList $list41;
    private static final SubLSymbol $kw42$OFF;
    private static final SubLList $list43;
    private static final SubLSymbol $sym44$_NL_TRIE_ACCESSOR_DEFAULT_CASE_SENSITIVITY_;
    private static final SubLSymbol $sym45$FIF;
    private static final SubLList $list46;
    private static final SubLList $list47;
    private static final SubLList $list48;
    private static final SubLList $list49;
    private static final SubLList $list50;
    private static final SubLSymbol $sym51$CNOT;
    private static final SubLList $list52;
    private static final SubLList $list53;
    private static final SubLList $list54;
    private static final SubLSymbol $sym55$_NL_TRIE_SUBWORD_INDEX_DEFAULT_CASE_SENSITIVITY_;
    private static final SubLList $list56;
    private static final SubLList $list57;
    private static final SubLSymbol $sym58$WITH_MEMOIZATION_STATE;
    private static final SubLList $list59;
    private static final SubLSymbol $sym60$FIND_OR_CREATE_LEXICON_MEMOIZATION_STATE;
    private static final SubLSymbol $sym61$WITH_LEXICON_MEMOIZATION;
    private static final SubLSymbol $kw62$REUSED;
    private static final SubLSymbol $kw63$NEW;
    private static final SubLList $list64;
    private static final SubLSymbol $sym65$PROGN;
    private static final SubLList $list66;
    private static final SubLList $list67;
    private static final SubLList $list68;
    private static final SubLSymbol $sym69$_USE_SME_LEXWIZ_;
    private static final SubLSymbol $sym70$WITH_SME_LEXWIZ_CONDITIONED;
    
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-macros.lisp", position = 754L)
    public static SubLObject with_lexicon_filters(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject filters = (SubLObject)lexicon_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)lexicon_macros.$list0);
        filters = current.first();
        final SubLObject body;
        current = (body = current.rest());
        return (SubLObject)ConsesLow.listS((SubLObject)lexicon_macros.$sym1$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)lexicon_macros.$sym2$_EXCLUDE_VULGARITIES__, (SubLObject)ConsesLow.list((SubLObject)lexicon_macros.$sym3$MEMBER_, (SubLObject)lexicon_macros.$list4, filters)), (SubLObject)ConsesLow.list((SubLObject)lexicon_macros.$sym5$_EXCLUDE_SLANG__, (SubLObject)ConsesLow.list((SubLObject)lexicon_macros.$sym3$MEMBER_, (SubLObject)lexicon_macros.$list6, filters)), (SubLObject)ConsesLow.list((SubLObject)lexicon_macros.$sym7$_EXCLUDE_ARCHAIC_SPEECH__, (SubLObject)ConsesLow.list((SubLObject)lexicon_macros.$sym3$MEMBER_, (SubLObject)lexicon_macros.$list8, filters)), (SubLObject)ConsesLow.list((SubLObject)lexicon_macros.$sym9$_EXCLUDE_INDIRECT_RELATIONS__, (SubLObject)ConsesLow.list((SubLObject)lexicon_macros.$sym3$MEMBER_, (SubLObject)lexicon_macros.$list10, filters))), ConsesLow.append(body, (SubLObject)lexicon_macros.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-macros.lisp", position = 1216L)
    public static SubLObject do_reified_affixes(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)lexicon_macros.$list11);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject reified_affix = (SubLObject)lexicon_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)lexicon_macros.$list11);
        reified_affix = current.first();
        current = current.rest();
        final SubLObject affix_type = current.isCons() ? current.first() : lexicon_macros.$const12$LexicalAffix;
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)lexicon_macros.$list11);
        current = current.rest();
        final SubLObject message = (SubLObject)(current.isCons() ? current.first() : lexicon_macros.$str13$Mapping_reified_affixes);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)lexicon_macros.$list11);
        current = current.rest();
        if (lexicon_macros.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            final SubLObject total = (SubLObject)lexicon_macros.$sym14$TOTAL;
            final SubLObject so_far = (SubLObject)lexicon_macros.$sym15$SO_FAR;
            final SubLObject reified_affixes = (SubLObject)lexicon_macros.$sym16$REIFIED_AFFIXES;
            return (SubLObject)ConsesLow.list((SubLObject)lexicon_macros.$sym1$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(reified_affixes, (SubLObject)ConsesLow.list((SubLObject)lexicon_macros.$sym17$ALL_FORT_INSTANCES, affix_type)), (SubLObject)ConsesLow.list(total, (SubLObject)ConsesLow.list((SubLObject)lexicon_macros.$sym18$LENGTH, reified_affixes)), reader.bq_cons(so_far, (SubLObject)lexicon_macros.$list19)), (SubLObject)ConsesLow.list((SubLObject)lexicon_macros.$sym20$NOTING_PERCENT_PROGRESS, message, (SubLObject)ConsesLow.listS((SubLObject)lexicon_macros.$sym21$CDOLIST, (SubLObject)ConsesLow.list(reified_affix, reified_affixes), ConsesLow.append(body, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)lexicon_macros.$sym22$CINC, so_far), (SubLObject)ConsesLow.list((SubLObject)lexicon_macros.$sym23$NOTE_PERCENT_PROGRESS, so_far, total))))));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)lexicon_macros.$list11);
        return (SubLObject)lexicon_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-macros.lisp", position = 1847L)
    public static SubLObject do_derived_preds(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)lexicon_macros.$list24);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject derived_pred = (SubLObject)lexicon_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)lexicon_macros.$list24);
        derived_pred = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = (SubLObject)lexicon_macros.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)lexicon_macros.NIL;
        SubLObject current_$1 = (SubLObject)lexicon_macros.NIL;
        while (lexicon_macros.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)lexicon_macros.$list24);
            current_$1 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)lexicon_macros.$list24);
            if (lexicon_macros.NIL == conses_high.member(current_$1, (SubLObject)lexicon_macros.$list25, (SubLObject)lexicon_macros.UNPROVIDED, (SubLObject)lexicon_macros.UNPROVIDED)) {
                bad = (SubLObject)lexicon_macros.T;
            }
            if (current_$1 == lexicon_macros.$kw26$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (lexicon_macros.NIL != bad && lexicon_macros.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)lexicon_macros.$list24);
        }
        final SubLObject mt_tail = cdestructuring_bind.property_list_member((SubLObject)lexicon_macros.$kw27$MT, current);
        final SubLObject mt = (SubLObject)((lexicon_macros.NIL != mt_tail) ? conses_high.cadr(mt_tail) : lexicon_macros.$kw28$ANY);
        final SubLObject body;
        current = (body = temp);
        return (SubLObject)ConsesLow.list((SubLObject)lexicon_macros.$sym21$CDOLIST, reader.bq_cons(derived_pred, (SubLObject)lexicon_macros.$list29), (SubLObject)ConsesLow.listS((SubLObject)lexicon_macros.$sym30$PWHEN, (SubLObject)ConsesLow.list((SubLObject)lexicon_macros.$sym31$DERIVED_PRED_, derived_pred, mt), ConsesLow.append(body, (SubLObject)lexicon_macros.NIL)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-macros.lisp", position = 2129L)
    public static SubLObject do_suffix_rules_for_pred(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)lexicon_macros.$list32);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject base_pred = (SubLObject)lexicon_macros.NIL;
        SubLObject suffix = (SubLObject)lexicon_macros.NIL;
        SubLObject pred = (SubLObject)lexicon_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)lexicon_macros.$list32);
        base_pred = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)lexicon_macros.$list32);
        suffix = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)lexicon_macros.$list32);
        pred = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = (SubLObject)lexicon_macros.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)lexicon_macros.NIL;
        SubLObject current_$2 = (SubLObject)lexicon_macros.NIL;
        while (lexicon_macros.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)lexicon_macros.$list32);
            current_$2 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)lexicon_macros.$list32);
            if (lexicon_macros.NIL == conses_high.member(current_$2, (SubLObject)lexicon_macros.$list33, (SubLObject)lexicon_macros.UNPROVIDED, (SubLObject)lexicon_macros.UNPROVIDED)) {
                bad = (SubLObject)lexicon_macros.T;
            }
            if (current_$2 == lexicon_macros.$kw26$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (lexicon_macros.NIL != bad && lexicon_macros.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)lexicon_macros.$list32);
        }
        final SubLObject done_tail = cdestructuring_bind.property_list_member((SubLObject)lexicon_macros.$kw34$DONE, current);
        final SubLObject done = (SubLObject)((lexicon_macros.NIL != done_tail) ? conses_high.cadr(done_tail) : lexicon_macros.NIL);
        final SubLObject body;
        current = (body = temp);
        final SubLObject rule = (SubLObject)lexicon_macros.$sym35$RULE;
        return (SubLObject)ConsesLow.list((SubLObject)lexicon_macros.$sym36$CSOME, (SubLObject)ConsesLow.list(rule, (SubLObject)ConsesLow.list((SubLObject)lexicon_macros.$sym37$SUFFIX_RULES_FOR_PRED, pred), done), (SubLObject)ConsesLow.listS((SubLObject)lexicon_macros.$sym38$CDESTRUCTURING_BIND, (SubLObject)ConsesLow.list(base_pred, suffix), (SubLObject)ConsesLow.list((SubLObject)lexicon_macros.$sym39$REST, (SubLObject)ConsesLow.list((SubLObject)lexicon_macros.$sym40$GAF_ARGS, rule)), ConsesLow.append(body, (SubLObject)lexicon_macros.NIL)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-macros.lisp", position = 2512L)
    public static SubLObject assuming_nl_trie_validity(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return (SubLObject)ConsesLow.listS((SubLObject)lexicon_macros.$sym1$CLET, (SubLObject)lexicon_macros.$list41, ConsesLow.append(body, (SubLObject)lexicon_macros.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-macros.lisp", position = 2685L)
    public static SubLObject assume_nl_trie_validP() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return lexicon_macros.$nl_trie_assumed_validP$.getDynamicValue(thread);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-macros.lisp", position = 3058L)
    public static SubLObject with_nl_trie_case_sensitivity_boolean(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)lexicon_macros.$list43);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject bool = (SubLObject)lexicon_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)lexicon_macros.$list43);
        bool = current.first();
        current = current.rest();
        if (lexicon_macros.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            return (SubLObject)ConsesLow.listS((SubLObject)lexicon_macros.$sym1$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)lexicon_macros.$sym44$_NL_TRIE_ACCESSOR_DEFAULT_CASE_SENSITIVITY_, (SubLObject)ConsesLow.listS((SubLObject)lexicon_macros.$sym45$FIF, bool, (SubLObject)lexicon_macros.$list46))), ConsesLow.append(body, (SubLObject)lexicon_macros.NIL));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)lexicon_macros.$list43);
        return (SubLObject)lexicon_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-macros.lisp", position = 3360L)
    public static SubLObject with_nl_trie_case_sensitivity_on(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return (SubLObject)ConsesLow.listS((SubLObject)lexicon_macros.$sym1$CLET, (SubLObject)lexicon_macros.$list47, ConsesLow.append(body, (SubLObject)lexicon_macros.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-macros.lisp", position = 3567L)
    public static SubLObject with_nl_trie_case_sensitivity_off(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return (SubLObject)ConsesLow.listS((SubLObject)lexicon_macros.$sym1$CLET, (SubLObject)lexicon_macros.$list48, ConsesLow.append(body, (SubLObject)lexicon_macros.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-macros.lisp", position = 3778L)
    public static SubLObject with_nl_trie_case_sensitivity_preferred(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return (SubLObject)ConsesLow.listS((SubLObject)lexicon_macros.$sym1$CLET, (SubLObject)lexicon_macros.$list49, ConsesLow.append(body, (SubLObject)lexicon_macros.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-macros.lisp", position = 4009L)
    public static SubLObject with_nl_trie_case_sensitivity_on_unless(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject test = (SubLObject)lexicon_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)lexicon_macros.$list50);
        test = current.first();
        final SubLObject body;
        current = (body = current.rest());
        return (SubLObject)ConsesLow.listS((SubLObject)lexicon_macros.$sym1$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)lexicon_macros.$sym44$_NL_TRIE_ACCESSOR_DEFAULT_CASE_SENSITIVITY_, (SubLObject)ConsesLow.listS((SubLObject)lexicon_macros.$sym45$FIF, (SubLObject)ConsesLow.list((SubLObject)lexicon_macros.$sym51$CNOT, test), (SubLObject)lexicon_macros.$list46))), ConsesLow.append(body, (SubLObject)lexicon_macros.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-macros.lisp", position = 4590L)
    public static SubLObject with_nl_trie_subword_index_case_sensitivity_on(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return (SubLObject)ConsesLow.listS((SubLObject)lexicon_macros.$sym1$CLET, (SubLObject)lexicon_macros.$list52, ConsesLow.append(body, (SubLObject)lexicon_macros.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-macros.lisp", position = 4816L)
    public static SubLObject with_nl_trie_subword_index_case_sensitivity_off(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return (SubLObject)ConsesLow.listS((SubLObject)lexicon_macros.$sym1$CLET, (SubLObject)lexicon_macros.$list53, ConsesLow.append(body, (SubLObject)lexicon_macros.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-macros.lisp", position = 5046L)
    public static SubLObject with_nl_trie_subword_index_case_sensitivity_preferred(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return (SubLObject)ConsesLow.listS((SubLObject)lexicon_macros.$sym1$CLET, (SubLObject)lexicon_macros.$list54, ConsesLow.append(body, (SubLObject)lexicon_macros.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-macros.lisp", position = 5296L)
    public static SubLObject with_nl_trie_subword_index_case_sensitivity_on_unless(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject test = (SubLObject)lexicon_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)lexicon_macros.$list50);
        test = current.first();
        final SubLObject body;
        current = (body = current.rest());
        return (SubLObject)ConsesLow.listS((SubLObject)lexicon_macros.$sym1$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)lexicon_macros.$sym55$_NL_TRIE_SUBWORD_INDEX_DEFAULT_CASE_SENSITIVITY_, (SubLObject)ConsesLow.listS((SubLObject)lexicon_macros.$sym45$FIF, (SubLObject)ConsesLow.list((SubLObject)lexicon_macros.$sym51$CNOT, test), (SubLObject)lexicon_macros.$list46))), ConsesLow.append(body, (SubLObject)lexicon_macros.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-macros.lisp", position = 5740L)
    public static SubLObject with_nl_trie_standard_strings(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return (SubLObject)ConsesLow.listS((SubLObject)lexicon_macros.$sym1$CLET, (SubLObject)lexicon_macros.$list56, ConsesLow.append(body, (SubLObject)lexicon_macros.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-macros.lisp", position = 6111L)
    public static SubLObject with_lexicon_memoization(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return (SubLObject)ConsesLow.list((SubLObject)lexicon_macros.$sym1$CLET, (SubLObject)lexicon_macros.$list57, (SubLObject)ConsesLow.listS((SubLObject)lexicon_macros.$sym58$WITH_MEMOIZATION_STATE, (SubLObject)lexicon_macros.$list59, ConsesLow.append(body, (SubLObject)lexicon_macros.NIL)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-macros.lisp", position = 6574L)
    public static SubLObject find_or_create_lexicon_memoization_state() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return (lexicon_macros.NIL != memoization_state.memoization_state_p(lexicon_macros.$lexicon_memoization_state$.getDynamicValue(thread))) ? Values.values(lexicon_macros.$lexicon_memoization_state$.getDynamicValue(thread), (SubLObject)lexicon_macros.$kw62$REUSED) : Values.values(memoization_state.new_memoization_state((SubLObject)lexicon_macros.UNPROVIDED, (SubLObject)lexicon_macros.UNPROVIDED, (SubLObject)lexicon_macros.UNPROVIDED, (SubLObject)lexicon_macros.UNPROVIDED), (SubLObject)lexicon_macros.$kw63$NEW);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-macros.lisp", position = 6834L)
    public static SubLObject parsing_morphologically_as_fallback(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)lexicon_macros.$list64);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject fallbackP = (SubLObject)lexicon_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)lexicon_macros.$list64);
        fallbackP = current.first();
        current = current.rest();
        if (lexicon_macros.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            return (SubLObject)ConsesLow.list((SubLObject)lexicon_macros.$sym65$PROGN, (SubLObject)ConsesLow.listS((SubLObject)lexicon_macros.$sym1$CLET, (SubLObject)lexicon_macros.$list66, ConsesLow.append(body, (SubLObject)lexicon_macros.NIL)), (SubLObject)ConsesLow.list((SubLObject)lexicon_macros.$sym30$PWHEN, fallbackP, (SubLObject)ConsesLow.listS((SubLObject)lexicon_macros.$sym1$CLET, (SubLObject)lexicon_macros.$list67, ConsesLow.append(body, (SubLObject)lexicon_macros.NIL))));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)lexicon_macros.$list64);
        return (SubLObject)lexicon_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-macros.lisp", position = 7189L)
    public static SubLObject with_sme_lexwiz_conditioned(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject use_sme_lexwizP = (SubLObject)lexicon_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)lexicon_macros.$list68);
        use_sme_lexwizP = current.first();
        final SubLObject body;
        current = (body = current.rest());
        return (SubLObject)ConsesLow.listS((SubLObject)lexicon_macros.$sym1$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)lexicon_macros.$sym69$_USE_SME_LEXWIZ_, use_sme_lexwizP)), ConsesLow.append(body, (SubLObject)lexicon_macros.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-macros.lisp", position = 7474L)
    public static SubLObject with_sme_lexwiz(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return (SubLObject)ConsesLow.listS((SubLObject)lexicon_macros.$sym70$WITH_SME_LEXWIZ_CONDITIONED, (SubLObject)lexicon_macros.T, ConsesLow.append(body, (SubLObject)lexicon_macros.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/lexicon-macros.lisp", position = 7766L)
    public static SubLObject with_oe_lexwiz(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return (SubLObject)ConsesLow.listS((SubLObject)lexicon_macros.$sym70$WITH_SME_LEXWIZ_CONDITIONED, (SubLObject)lexicon_macros.NIL, ConsesLow.append(body, (SubLObject)lexicon_macros.NIL));
    }
    
    public static SubLObject declare_lexicon_macros_file() {
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.lexicon_macros", "with_lexicon_filters", "WITH-LEXICON-FILTERS");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.lexicon_macros", "do_reified_affixes", "DO-REIFIED-AFFIXES");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.lexicon_macros", "do_derived_preds", "DO-DERIVED-PREDS");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.lexicon_macros", "do_suffix_rules_for_pred", "DO-SUFFIX-RULES-FOR-PRED");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.lexicon_macros", "assuming_nl_trie_validity", "ASSUMING-NL-TRIE-VALIDITY");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.lexicon_macros", "assume_nl_trie_validP", "ASSUME-NL-TRIE-VALID?", 0, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.lexicon_macros", "with_nl_trie_case_sensitivity_boolean", "WITH-NL-TRIE-CASE-SENSITIVITY-BOOLEAN");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.lexicon_macros", "with_nl_trie_case_sensitivity_on", "WITH-NL-TRIE-CASE-SENSITIVITY-ON");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.lexicon_macros", "with_nl_trie_case_sensitivity_off", "WITH-NL-TRIE-CASE-SENSITIVITY-OFF");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.lexicon_macros", "with_nl_trie_case_sensitivity_preferred", "WITH-NL-TRIE-CASE-SENSITIVITY-PREFERRED");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.lexicon_macros", "with_nl_trie_case_sensitivity_on_unless", "WITH-NL-TRIE-CASE-SENSITIVITY-ON-UNLESS");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.lexicon_macros", "with_nl_trie_subword_index_case_sensitivity_on", "WITH-NL-TRIE-SUBWORD-INDEX-CASE-SENSITIVITY-ON");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.lexicon_macros", "with_nl_trie_subword_index_case_sensitivity_off", "WITH-NL-TRIE-SUBWORD-INDEX-CASE-SENSITIVITY-OFF");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.lexicon_macros", "with_nl_trie_subword_index_case_sensitivity_preferred", "WITH-NL-TRIE-SUBWORD-INDEX-CASE-SENSITIVITY-PREFERRED");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.lexicon_macros", "with_nl_trie_subword_index_case_sensitivity_on_unless", "WITH-NL-TRIE-SUBWORD-INDEX-CASE-SENSITIVITY-ON-UNLESS");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.lexicon_macros", "with_nl_trie_standard_strings", "WITH-NL-TRIE-STANDARD-STRINGS");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.lexicon_macros", "with_lexicon_memoization", "WITH-LEXICON-MEMOIZATION");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.lexicon_macros", "find_or_create_lexicon_memoization_state", "FIND-OR-CREATE-LEXICON-MEMOIZATION-STATE", 0, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.lexicon_macros", "parsing_morphologically_as_fallback", "PARSING-MORPHOLOGICALLY-AS-FALLBACK");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.lexicon_macros", "with_sme_lexwiz_conditioned", "WITH-SME-LEXWIZ-CONDITIONED");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.lexicon_macros", "with_sme_lexwiz", "WITH-SME-LEXWIZ");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.lexicon_macros", "with_oe_lexwiz", "WITH-OE-LEXWIZ");
        return (SubLObject)lexicon_macros.NIL;
    }
    
    public static SubLObject init_lexicon_macros_file() {
        lexicon_macros.$nl_trie_assumed_validP$ = SubLFiles.defparameter("*NL-TRIE-ASSUMED-VALID?*", (SubLObject)lexicon_macros.NIL);
        lexicon_macros.$nl_trie_accessor_default_case_sensitivity$ = SubLFiles.defparameter("*NL-TRIE-ACCESSOR-DEFAULT-CASE-SENSITIVITY*", (SubLObject)lexicon_macros.$kw42$OFF);
        lexicon_macros.$nl_trie_subword_index_default_case_sensitivity$ = SubLFiles.defparameter("*NL-TRIE-SUBWORD-INDEX-DEFAULT-CASE-SENSITIVITY*", (SubLObject)lexicon_macros.$kw42$OFF);
        lexicon_macros.$nl_trie_assume_standardized_stringsP$ = SubLFiles.defparameter("*NL-TRIE-ASSUME-STANDARDIZED-STRINGS?*", (SubLObject)lexicon_macros.NIL);
        lexicon_macros.$lexicon_memoization_state$ = SubLFiles.defparameter("*LEXICON-MEMOIZATION-STATE*", (SubLObject)lexicon_macros.NIL);
        return (SubLObject)lexicon_macros.NIL;
    }
    
    public static SubLObject setup_lexicon_macros_file() {
        access_macros.register_macro_helper((SubLObject)lexicon_macros.$sym60$FIND_OR_CREATE_LEXICON_MEMOIZATION_STATE, (SubLObject)lexicon_macros.$sym61$WITH_LEXICON_MEMOIZATION);
        return (SubLObject)lexicon_macros.NIL;
    }
    
    @Override
	public void declareFunctions() {
        declare_lexicon_macros_file();
    }
    
    @Override
	public void initializeVariables() {
        init_lexicon_macros_file();
    }
    
    @Override
	public void runTopLevelForms() {
        setup_lexicon_macros_file();
    }
    
    static {
        me = (SubLFile)new lexicon_macros();
        lexicon_macros.$nl_trie_assumed_validP$ = null;
        lexicon_macros.$nl_trie_accessor_default_case_sensitivity$ = null;
        lexicon_macros.$nl_trie_subword_index_default_case_sensitivity$ = null;
        lexicon_macros.$nl_trie_assume_standardized_stringsP$ = null;
        lexicon_macros.$lexicon_memoization_state$ = null;
        $list0 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FILTERS"), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym1$CLET = SubLObjectFactory.makeSymbol("CLET");
        $sym2$_EXCLUDE_VULGARITIES__ = SubLObjectFactory.makeSymbol("*EXCLUDE-VULGARITIES?*");
        $sym3$MEMBER_ = SubLObjectFactory.makeSymbol("MEMBER?");
        $list4 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("*EXCLUDE-VULGARITIES?*"));
        $sym5$_EXCLUDE_SLANG__ = SubLObjectFactory.makeSymbol("*EXCLUDE-SLANG?*");
        $list6 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("*EXCLUDE-SLANG?*"));
        $sym7$_EXCLUDE_ARCHAIC_SPEECH__ = SubLObjectFactory.makeSymbol("*EXCLUDE-ARCHAIC-SPEECH?*");
        $list8 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("*EXCLUDE-ARCHAIC-SPEECH?*"));
        $sym9$_EXCLUDE_INDIRECT_RELATIONS__ = SubLObjectFactory.makeSymbol("*EXCLUDE-INDIRECT-RELATIONS?*");
        $list10 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("*EXCLUDE-INDIRECT-RELATIONS?*"));
        $list11 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("REIFIED-AFFIX"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("AFFIX-TYPE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("LexicalAffix"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MESSAGE"), (SubLObject)SubLObjectFactory.makeString("Mapping reified affixes"))), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $const12$LexicalAffix = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("LexicalAffix"));
        $str13$Mapping_reified_affixes = SubLObjectFactory.makeString("Mapping reified affixes");
        $sym14$TOTAL = SubLObjectFactory.makeUninternedSymbol("TOTAL");
        $sym15$SO_FAR = SubLObjectFactory.makeUninternedSymbol("SO-FAR");
        $sym16$REIFIED_AFFIXES = SubLObjectFactory.makeUninternedSymbol("REIFIED-AFFIXES");
        $sym17$ALL_FORT_INSTANCES = SubLObjectFactory.makeSymbol("ALL-FORT-INSTANCES");
        $sym18$LENGTH = SubLObjectFactory.makeSymbol("LENGTH");
        $list19 = ConsesLow.list((SubLObject)lexicon_macros.ZERO_INTEGER);
        $sym20$NOTING_PERCENT_PROGRESS = SubLObjectFactory.makeSymbol("NOTING-PERCENT-PROGRESS");
        $sym21$CDOLIST = SubLObjectFactory.makeSymbol("CDOLIST");
        $sym22$CINC = SubLObjectFactory.makeSymbol("CINC");
        $sym23$NOTE_PERCENT_PROGRESS = SubLObjectFactory.makeSymbol("NOTE-PERCENT-PROGRESS");
        $list24 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DERIVED-PRED"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MT"), (SubLObject)SubLObjectFactory.makeKeyword("ANY"))), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $list25 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("MT"));
        $kw26$ALLOW_OTHER_KEYS = SubLObjectFactory.makeKeyword("ALLOW-OTHER-KEYS");
        $kw27$MT = SubLObjectFactory.makeKeyword("MT");
        $kw28$ANY = SubLObjectFactory.makeKeyword("ANY");
        $list29 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HASH-TABLE-KEYS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DERIVED-PREDS"))));
        $sym30$PWHEN = SubLObjectFactory.makeSymbol("PWHEN");
        $sym31$DERIVED_PRED_ = SubLObjectFactory.makeSymbol("DERIVED-PRED?");
        $list32 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("BASE-PRED"), (SubLObject)SubLObjectFactory.makeSymbol("SUFFIX"), (SubLObject)SubLObjectFactory.makeSymbol("PRED"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("DONE")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $list33 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("DONE"));
        $kw34$DONE = SubLObjectFactory.makeKeyword("DONE");
        $sym35$RULE = SubLObjectFactory.makeUninternedSymbol("RULE");
        $sym36$CSOME = SubLObjectFactory.makeSymbol("CSOME");
        $sym37$SUFFIX_RULES_FOR_PRED = SubLObjectFactory.makeSymbol("SUFFIX-RULES-FOR-PRED");
        $sym38$CDESTRUCTURING_BIND = SubLObjectFactory.makeSymbol("CDESTRUCTURING-BIND");
        $sym39$REST = SubLObjectFactory.makeSymbol("REST");
        $sym40$GAF_ARGS = SubLObjectFactory.makeSymbol("GAF-ARGS");
        $list41 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*NL-TRIE-ASSUMED-VALID?*"), (SubLObject)lexicon_macros.T));
        $kw42$OFF = SubLObjectFactory.makeKeyword("OFF");
        $list43 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("BOOL")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym44$_NL_TRIE_ACCESSOR_DEFAULT_CASE_SENSITIVITY_ = SubLObjectFactory.makeSymbol("*NL-TRIE-ACCESSOR-DEFAULT-CASE-SENSITIVITY*");
        $sym45$FIF = SubLObjectFactory.makeSymbol("FIF");
        $list46 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("ON"), (SubLObject)SubLObjectFactory.makeKeyword("OFF"));
        $list47 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*NL-TRIE-ACCESSOR-DEFAULT-CASE-SENSITIVITY*"), (SubLObject)SubLObjectFactory.makeKeyword("ON")));
        $list48 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*NL-TRIE-ACCESSOR-DEFAULT-CASE-SENSITIVITY*"), (SubLObject)SubLObjectFactory.makeKeyword("OFF")));
        $list49 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*NL-TRIE-ACCESSOR-DEFAULT-CASE-SENSITIVITY*"), (SubLObject)SubLObjectFactory.makeKeyword("PREFERRED")));
        $list50 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TEST"), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym51$CNOT = SubLObjectFactory.makeSymbol("CNOT");
        $list52 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*NL-TRIE-SUBWORD-INDEX-DEFAULT-CASE-SENSITIVITY*"), (SubLObject)SubLObjectFactory.makeKeyword("ON")));
        $list53 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*NL-TRIE-SUBWORD-INDEX-DEFAULT-CASE-SENSITIVITY*"), (SubLObject)SubLObjectFactory.makeKeyword("OFF")));
        $list54 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*NL-TRIE-SUBWORD-INDEX-DEFAULT-CASE-SENSITIVITY*"), (SubLObject)SubLObjectFactory.makeKeyword("PREFERRED")));
        $sym55$_NL_TRIE_SUBWORD_INDEX_DEFAULT_CASE_SENSITIVITY_ = SubLObjectFactory.makeSymbol("*NL-TRIE-SUBWORD-INDEX-DEFAULT-CASE-SENSITIVITY*");
        $list56 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*NL-TRIE-ASSUME-STANDARDIZED-STRINGS?*"), (SubLObject)lexicon_macros.T));
        $list57 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CURRENT-STATE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CURRENT-MEMOIZATION-STATE"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*LEXICON-MEMOIZATION-STATE*"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIRST-OF"), (SubLObject)SubLObjectFactory.makeSymbol("CURRENT-STATE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIND-OR-CREATE-LEXICON-MEMOIZATION-STATE")))));
        $sym58$WITH_MEMOIZATION_STATE = SubLObjectFactory.makeSymbol("WITH-MEMOIZATION-STATE");
        $list59 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*LEXICON-MEMOIZATION-STATE*"));
        $sym60$FIND_OR_CREATE_LEXICON_MEMOIZATION_STATE = SubLObjectFactory.makeSymbol("FIND-OR-CREATE-LEXICON-MEMOIZATION-STATE");
        $sym61$WITH_LEXICON_MEMOIZATION = SubLObjectFactory.makeSymbol("WITH-LEXICON-MEMOIZATION");
        $kw62$REUSED = SubLObjectFactory.makeKeyword("REUSED");
        $kw63$NEW = SubLObjectFactory.makeKeyword("NEW");
        $list64 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FALLBACK?")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym65$PROGN = SubLObjectFactory.makeSymbol("PROGN");
        $list66 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*PARSE-MORPHOLOGICALLY*"), (SubLObject)SubLObjectFactory.makeKeyword("NEVER")));
        $list67 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*PARSE-MORPHOLOGICALLY*"), (SubLObject)SubLObjectFactory.makeKeyword("ONLY")));
        $list68 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("USE-SME-LEXWIZ?"), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym69$_USE_SME_LEXWIZ_ = SubLObjectFactory.makeSymbol("*USE-SME-LEXWIZ*");
        $sym70$WITH_SME_LEXWIZ_CONDITIONED = SubLObjectFactory.makeSymbol("WITH-SME-LEXWIZ-CONDITIONED");
    }
}

/*

	Total time: 129 ms
	
*/