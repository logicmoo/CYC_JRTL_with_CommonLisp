package com.cyc.cycjava.cycl.inference.harness;

import com.cyc.cycjava.cycl.access_macros;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class inference_macros extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.inference.harness.inference_macros";
    public static final String myFingerPrint = "e0262c5ae6eab43218eb3a8aeec595534794dedcd6d3f2dfeb492b03196ade88";
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-macros.lisp", position = 7737L)
    public static SubLSymbol $controlling_inferences$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-macros.lisp", position = 8560L)
    public static SubLSymbol $controlling_strategy$;
    private static final SubLList $list0;
    private static final SubLSymbol $sym1$SYMBOLP;
    private static final SubLSymbol $sym2$CLET;
    private static final SubLSymbol $sym3$CUNWIND_PROTECT;
    private static final SubLSymbol $sym4$PROGN;
    private static final SubLSymbol $sym5$DESTROY_INFERENCE_AND_PROBLEM_STORE;
    private static final SubLList $list6;
    private static final SubLSymbol $sym7$DESTROY_PROBLEM_STORE;
    private static final SubLList $list8;
    private static final SubLSymbol $sym9$WITH_PROBLEM_STORE_VAR;
    private static final SubLSymbol $sym10$CSETQ;
    private static final SubLSymbol $sym11$NEW_PROBLEM_STORE;
    private static final SubLList $list12;
    private static final SubLList $list13;
    private static final SubLSymbol $kw14$ALLOW_OTHER_KEYS;
    private static final SubLSymbol $kw15$TYPE;
    private static final SubLSymbol $kw16$DONE;
    private static final SubLSymbol $sym17$DO_SET_CONTENTS;
    private static final SubLSymbol $sym18$PROBLEM_ARGUMENT_LINKS;
    private static final SubLSymbol $sym19$DO_PROBLEM_ARGUMENT_LINKS;
    private static final SubLSymbol $sym20$PWHEN;
    private static final SubLSymbol $sym21$PROBLEM_LINK_HAS_TYPE_;
    private static final SubLList $list22;
    private static final SubLList $list23;
    private static final SubLSymbol $kw24$OPEN_;
    private static final SubLSymbol $sym25$LINK_VAR;
    private static final SubLSymbol $sym26$DO_LIST;
    private static final SubLSymbol $sym27$PROBLEM_LINK_SUPPORTING_MAPPED_PROBLEMS;
    private static final SubLSymbol $sym28$DO_PROBLEM_LINK_OPEN_MATCH_;
    private static final SubLSymbol $sym29$DO_PROBLEM_LINK_SUPPORTING_MAPPED_PROBLEMS;
    private static final SubLList $list30;
    private static final SubLList $list31;
    private static final SubLSymbol $sym32$CINC;
    private static final SubLList $list33;
    private static final SubLSymbol $sym34$SUPPORTING_MAPPED_PROBLEM;
    private static final SubLSymbol $sym35$MAPPED_PROBLEM_PROBLEM;
    private static final SubLSymbol $sym36$MAPPED_PROBLEM_VARIABLE_MAP;
    private static final SubLList $list37;
    private static final SubLList $list38;
    private static final SubLSymbol $sym39$SUPPORTED_PROBLEM;
    private static final SubLSymbol $sym40$LINK_VAR;
    private static final SubLSymbol $sym41$PROBLEM_LINK_SUPPORTED_PROBLEM;
    private static final SubLSymbol $sym42$PUNLESS;
    private static final SubLList $list43;
    private static final SubLList $list44;
    private static final SubLSymbol $kw45$LINK_TYPE;
    private static final SubLSymbol $sym46$SUPPORTED_PROBLEM;
    private static final SubLSymbol $sym47$DO_PROBLEM_DEPENDENT_LINKS;
    private static final SubLList $list48;
    private static final SubLList $list49;
    private static final SubLSymbol $sym50$SUPPORTING_PROBLEM;
    private static final SubLSymbol $sym51$VARIABLE_MAP;
    private static final SubLSymbol $sym52$DO_PROBLEM_LINK_SUPPORTING_PROBLEMS;
    private static final SubLSymbol $sym53$IGNORE;
    private static final SubLList $list54;
    private static final SubLList $list55;
    private static final SubLSymbol $kw56$PROOF_STATUS;
    private static final SubLSymbol $sym57$CDOLIST;
    private static final SubLSymbol $sym58$PROBLEM_LINK_PROOFS;
    private static final SubLSymbol $sym59$PROOF_HAS_STATUS_;
    private static final SubLList $list60;
    private static final SubLSymbol $sym61$JO_LINK_VAR;
    private static final SubLSymbol $sym62$MOTIVATING_CONJUNCTION_PROBLEM;
    private static final SubLSymbol $kw63$RESIDUAL_TRANSFORMATION;
    private static final SubLSymbol $sym64$RESIDUAL_TRANSFORMATION_LINK_MOTIVATED_BY_JOIN_ORDERED_LINK_;
    private static final SubLList $list65;
    private static final SubLSymbol $sym66$T_LINK_VAR;
    private static final SubLSymbol $sym67$JO_LINK_VAR;
    private static final SubLSymbol $sym68$DO_PROBLEM_LINK_DEPENDENT_LINKS;
    private static final SubLSymbol $kw69$JOIN_ORDERED;
    private static final SubLSymbol $sym70$DO_JOIN_ORDERED_LINK_MOTIVATED_RESIDUAL_TRANSFORMATION_LINKS;
    private static final SubLSymbol $sym71$RESIDUAL_TRANSFORMATION_LINK_MOTIVATED_BY_TRANSFORMATION_LINK_;
    private static final SubLList $list72;
    private static final SubLList $list73;
    private static final SubLList $list74;
    private static final SubLList $list75;
    private static final SubLSymbol $sym76$_FORWARD_INFERENCE_ALLOWED_RULES_;
    private static final SubLSymbol $sym77$WITH_FORWARD_INFERENCE_ALLOWED_RULES;
    private static final SubLSymbol $kw78$ALL;
    private static final SubLSymbol $sym79$_FORWARD_INFERENCE_FORBIDDEN_RULES_;
    private static final SubLSymbol $sym80$WITH_FORWARD_INFERENCE_FORBIDDEN_RULES;
    private static final SubLSymbol $kw81$NONE;
    private static final SubLSymbol $sym82$INFERENCE_P;
    private static final SubLList $list83;
    private static final SubLSymbol $sym84$_CONTROLLING_INFERENCES_;
    private static final SubLSymbol $sym85$CONS;
    private static final SubLList $list86;
    private static final SubLSymbol $sym87$WITHIN_CONTROLLING_INFERENCE;
    private static final SubLSymbol $sym88$WITHIN_NO_CONTROLLING_STRATEGY;
    private static final SubLList $list89;
    private static final SubLSymbol $sym90$_CONTROLLING_STRATEGY_;
    private static final SubLSymbol $sym91$WITHIN_CONTROLLING_STRATEGY;
    private static final SubLList $list92;
    private static final SubLSymbol $kw93$CYC_MAINT;
    private static final SubLSymbol $sym94$GATHER_TICK_DATA_;
    private static final SubLSymbol $sym95$INITIAL_ARETE_TERMS_TOUCHED_COUNT;
    private static final SubLSymbol $sym96$INITIAL_ARETE_ASSERTIONS_TOUCHED_COUNT;
    private static final SubLSymbol $sym97$INITIAL_ARETE_LOG_LAST_KB_TOUCH_;
    private static final SubLSymbol $sym98$INITIAL_ARETE_LOG_KB_TOUCH_COUNTS_;
    private static final SubLSymbol $sym99$FINAL_ARETE_TERMS_TOUCHED_COUNT;
    private static final SubLSymbol $sym100$FINAL_ARETE_ASSERTIONS_TOUCHED_COUNT;
    private static final SubLSymbol $sym101$INFERENCE_GATHERS_TICK_INDEXED_PROGRESS_DATA_;
    private static final SubLList $list102;
    private static final SubLList $list103;
    private static final SubLList $list104;
    private static final SubLList $list105;
    private static final SubLSymbol $sym106$_ARETE_TERMS_TOUCHED_COUNT_;
    private static final SubLSymbol $sym107$FIF;
    private static final SubLSymbol $sym108$_ARETE_ASSERTIONS_TOUCHED_COUNT_;
    private static final SubLSymbol $sym109$_ARETE_LOG_LAST_KB_TOUCH__;
    private static final SubLSymbol $sym110$_ARETE_LOG_KB_TOUCH_COUNTS__;
    private static final SubLSymbol $sym111$_;
    private static final SubLSymbol $sym112$GATHER_TICK_DATA_;
    private static final SubLSymbol $sym113$INITIAL_ARETE_ASSERTIONS_TOUCHED;
    private static final SubLSymbol $sym114$INITIAL_ARETE_CONSTANTS_TOUCHED;
    private static final SubLSymbol $sym115$INITIAL_ARETE_NARTS_TOUCHED;
    private static final SubLSymbol $sym116$INITIAL_ARETE_LOG_LAST_KB_TOUCH_;
    private static final SubLSymbol $sym117$INITIAL_ARETE_LOG_KB_TOUCHES_;
    private static final SubLSymbol $sym118$FINAL_ARETE_ASSERTIONS_TOUCHED;
    private static final SubLSymbol $sym119$FINAL_ARETE_CONSTANTS_TOUCHED;
    private static final SubLSymbol $sym120$FINAL_ARETE_NARTS_TOUCHED;
    private static final SubLSymbol $sym121$INFERENCE_SHOULD_GATHER_TICK_INDEXED_PROGRESS_DATA_;
    private static final SubLList $list122;
    private static final SubLList $list123;
    private static final SubLList $list124;
    private static final SubLList $list125;
    private static final SubLSymbol $sym126$_ARETE_ASSERTIONS_TOUCHED_;
    private static final SubLList $list127;
    private static final SubLSymbol $sym128$_ARETE_CONSTANTS_TOUCHED_;
    private static final SubLSymbol $sym129$_ARETE_NARTS_TOUCHED_;
    private static final SubLSymbol $sym130$_ARETE_LOG_KB_TOUCHES__;
    private static final SubLSymbol $sym131$SET_NMERGE;
    private static final SubLList $list132;
    private static final SubLSymbol $sym133$PATTERN_VAR;
    private static final SubLSymbol $sym134$PIF;
    private static final SubLSymbol $sym135$OR_PATTERN_P;
    private static final SubLSymbol $sym136$REST;
    private static final SubLList $list137;
    private static final SubLList $list138;
    private static final SubLSymbol $kw139$ELEMENT_NUM;
    private static final SubLSymbol $kw140$DONE_;
    private static final SubLSymbol $sym141$DONE_VAR_;
    private static final SubLSymbol $sym142$I;
    private static final SubLSymbol $sym143$INPUT_STREAM;
    private static final SubLList $list144;
    private static final SubLSymbol $sym145$WITH_PRIVATE_BINARY_FILE;
    private static final SubLList $list146;
    private static final SubLSymbol $sym147$WITH_CFASL_COMMON_SYMBOLS;
    private static final SubLList $list148;
    private static final SubLSymbol $sym149$UNTIL;
    private static final SubLSymbol $sym150$LOAD_ASKED_QUERY_FROM_STREAM;
    private static final SubLSymbol $sym151$PCOND;
    private static final SubLSymbol $kw152$EOF;
    private static final SubLList $list153;
    private static final SubLSymbol $sym154$STRINGP;
    private static final SubLSymbol $sym155$WARN;
    private static final SubLString $str156$Read_invalid_query_info__s;
    private static final SubLList $list157;
    private static final SubLList $list158;
    private static final SubLSymbol $sym159$DO_DIRECTORY_CONTENTS;
    private static final SubLSymbol $sym160$ASKED_QUERIES_FILENAME_;
    private static final SubLSymbol $sym161$DO_ASKED_QUERIES;
    private static final SubLList $list162;
    private static final SubLSymbol $sym163$__;
    private static final SubLSymbol $sym164$_INFERENCE_TRACE_LEVEL_;
    private static final SubLSymbol $sym165$FORCE_FORMAT;
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-macros.lisp", position = 801L)
    public static SubLObject with_inference_var(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)inference_macros.$list0);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject inference_var = (SubLObject)inference_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)inference_macros.$list0);
        inference_var = current.first();
        current = current.rest();
        if (inference_macros.NIL != current) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)inference_macros.$list0);
            return (SubLObject)inference_macros.NIL;
        }
        final SubLObject body;
        current = (body = temp);
        assert inference_macros.NIL != Types.symbolp(inference_var) : inference_var;
        return (SubLObject)ConsesLow.list((SubLObject)inference_macros.$sym2$CLET, (SubLObject)ConsesLow.list(inference_var), (SubLObject)ConsesLow.list((SubLObject)inference_macros.$sym3$CUNWIND_PROTECT, reader.bq_cons((SubLObject)inference_macros.$sym4$PROGN, ConsesLow.append(body, (SubLObject)inference_macros.NIL)), (SubLObject)ConsesLow.list((SubLObject)inference_macros.$sym5$DESTROY_INFERENCE_AND_PROBLEM_STORE, inference_var)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-macros.lisp", position = 1207L)
    public static SubLObject with_problem_store_var(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)inference_macros.$list6);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject problem_store_var = (SubLObject)inference_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)inference_macros.$list6);
        problem_store_var = current.first();
        current = current.rest();
        if (inference_macros.NIL != current) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)inference_macros.$list6);
            return (SubLObject)inference_macros.NIL;
        }
        final SubLObject body;
        current = (body = temp);
        assert inference_macros.NIL != Types.symbolp(problem_store_var) : problem_store_var;
        return (SubLObject)ConsesLow.list((SubLObject)inference_macros.$sym2$CLET, (SubLObject)ConsesLow.list(problem_store_var), (SubLObject)ConsesLow.list((SubLObject)inference_macros.$sym3$CUNWIND_PROTECT, reader.bq_cons((SubLObject)inference_macros.$sym4$PROGN, ConsesLow.append(body, (SubLObject)inference_macros.NIL)), (SubLObject)ConsesLow.list((SubLObject)inference_macros.$sym7$DESTROY_PROBLEM_STORE, problem_store_var)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-macros.lisp", position = 1597L)
    public static SubLObject with_new_problem_store(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)inference_macros.$list8);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject problem_store_var = (SubLObject)inference_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)inference_macros.$list8);
        problem_store_var = current.first();
        current = current.rest();
        final SubLObject v_properties = (SubLObject)(current.isCons() ? current.first() : inference_macros.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)inference_macros.$list8);
        current = current.rest();
        if (inference_macros.NIL != current) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)inference_macros.$list8);
            return (SubLObject)inference_macros.NIL;
        }
        final SubLObject body;
        current = (body = temp);
        assert inference_macros.NIL != Types.symbolp(problem_store_var) : problem_store_var;
        return (SubLObject)ConsesLow.listS((SubLObject)inference_macros.$sym9$WITH_PROBLEM_STORE_VAR, (SubLObject)ConsesLow.list(problem_store_var), (SubLObject)ConsesLow.list((SubLObject)inference_macros.$sym10$CSETQ, problem_store_var, (SubLObject)ConsesLow.list((SubLObject)inference_macros.$sym11$NEW_PROBLEM_STORE, v_properties)), ConsesLow.append(body, (SubLObject)inference_macros.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-macros.lisp", position = 1985L)
    public static SubLObject do_problem_argument_links(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)inference_macros.$list12);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject link_var = (SubLObject)inference_macros.NIL;
        SubLObject problem = (SubLObject)inference_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)inference_macros.$list12);
        link_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)inference_macros.$list12);
        problem = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = (SubLObject)inference_macros.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)inference_macros.NIL;
        SubLObject current_$1 = (SubLObject)inference_macros.NIL;
        while (inference_macros.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)inference_macros.$list12);
            current_$1 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)inference_macros.$list12);
            if (inference_macros.NIL == conses_high.member(current_$1, (SubLObject)inference_macros.$list13, (SubLObject)inference_macros.UNPROVIDED, (SubLObject)inference_macros.UNPROVIDED)) {
                bad = (SubLObject)inference_macros.T;
            }
            if (current_$1 == inference_macros.$kw14$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (inference_macros.NIL != bad && inference_macros.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)inference_macros.$list12);
        }
        final SubLObject type_tail = cdestructuring_bind.property_list_member((SubLObject)inference_macros.$kw15$TYPE, current);
        final SubLObject type = (SubLObject)((inference_macros.NIL != type_tail) ? conses_high.cadr(type_tail) : inference_macros.NIL);
        final SubLObject done_tail = cdestructuring_bind.property_list_member((SubLObject)inference_macros.$kw16$DONE, current);
        final SubLObject done = (SubLObject)((inference_macros.NIL != done_tail) ? conses_high.cadr(done_tail) : inference_macros.NIL);
        final SubLObject body;
        current = (body = temp);
        if (inference_macros.NIL == type) {
            return (SubLObject)ConsesLow.listS((SubLObject)inference_macros.$sym17$DO_SET_CONTENTS, (SubLObject)ConsesLow.list(link_var, (SubLObject)ConsesLow.list((SubLObject)inference_macros.$sym18$PROBLEM_ARGUMENT_LINKS, problem), (SubLObject)inference_macros.$kw16$DONE, done), ConsesLow.append(body, (SubLObject)inference_macros.NIL));
        }
        return (SubLObject)ConsesLow.list((SubLObject)inference_macros.$sym19$DO_PROBLEM_ARGUMENT_LINKS, (SubLObject)ConsesLow.list(link_var, problem, (SubLObject)inference_macros.$kw16$DONE, done), (SubLObject)ConsesLow.listS((SubLObject)inference_macros.$sym20$PWHEN, (SubLObject)ConsesLow.list((SubLObject)inference_macros.$sym21$PROBLEM_LINK_HAS_TYPE_, link_var, type), ConsesLow.append(body, (SubLObject)inference_macros.NIL)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-macros.lisp", position = 2348L)
    public static SubLObject do_problem_link_supporting_mapped_problems(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)inference_macros.$list22);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject supporting_mapped_problem_var = (SubLObject)inference_macros.NIL;
        SubLObject link = (SubLObject)inference_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)inference_macros.$list22);
        supporting_mapped_problem_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)inference_macros.$list22);
        link = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = (SubLObject)inference_macros.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)inference_macros.NIL;
        SubLObject current_$2 = (SubLObject)inference_macros.NIL;
        while (inference_macros.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)inference_macros.$list22);
            current_$2 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)inference_macros.$list22);
            if (inference_macros.NIL == conses_high.member(current_$2, (SubLObject)inference_macros.$list23, (SubLObject)inference_macros.UNPROVIDED, (SubLObject)inference_macros.UNPROVIDED)) {
                bad = (SubLObject)inference_macros.T;
            }
            if (current_$2 == inference_macros.$kw14$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (inference_macros.NIL != bad && inference_macros.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)inference_macros.$list22);
        }
        final SubLObject openP_tail = cdestructuring_bind.property_list_member((SubLObject)inference_macros.$kw24$OPEN_, current);
        final SubLObject openP = (SubLObject)((inference_macros.NIL != openP_tail) ? conses_high.cadr(openP_tail) : inference_macros.NIL);
        final SubLObject done_tail = cdestructuring_bind.property_list_member((SubLObject)inference_macros.$kw16$DONE, current);
        final SubLObject done = (SubLObject)((inference_macros.NIL != done_tail) ? conses_high.cadr(done_tail) : inference_macros.NIL);
        final SubLObject body;
        current = (body = temp);
        final SubLObject link_var = (SubLObject)inference_macros.$sym25$LINK_VAR;
        return (SubLObject)ConsesLow.list((SubLObject)inference_macros.$sym2$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(link_var, link)), (SubLObject)ConsesLow.list((SubLObject)inference_macros.$sym26$DO_LIST, (SubLObject)ConsesLow.list(supporting_mapped_problem_var, (SubLObject)ConsesLow.list((SubLObject)inference_macros.$sym27$PROBLEM_LINK_SUPPORTING_MAPPED_PROBLEMS, link_var), (SubLObject)inference_macros.$kw16$DONE, done), (SubLObject)ConsesLow.listS((SubLObject)inference_macros.$sym20$PWHEN, (SubLObject)ConsesLow.list((SubLObject)inference_macros.$sym28$DO_PROBLEM_LINK_OPEN_MATCH_, openP, link_var, supporting_mapped_problem_var), ConsesLow.append(body, (SubLObject)inference_macros.NIL))));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-macros.lisp", position = 2788L)
    public static SubLObject do_problem_link_open_matchP(final SubLObject openP, final SubLObject link, final SubLObject supporting_mapped_problem) {
        return (SubLObject)SubLObjectFactory.makeBoolean(inference_macros.NIL == openP || inference_macros.NIL != inference_datastructures_problem_link.problem_link_supporting_mapped_problem_openP(link, supporting_mapped_problem));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-macros.lisp", position = 3042L)
    public static SubLObject do_problem_link_supporting_mapped_problems_numbered(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)inference_macros.$list30);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject supporting_mapped_problem_var = (SubLObject)inference_macros.NIL;
        SubLObject index_var = (SubLObject)inference_macros.NIL;
        SubLObject link = (SubLObject)inference_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)inference_macros.$list30);
        supporting_mapped_problem_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)inference_macros.$list30);
        index_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)inference_macros.$list30);
        link = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = (SubLObject)inference_macros.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)inference_macros.NIL;
        SubLObject current_$3 = (SubLObject)inference_macros.NIL;
        while (inference_macros.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)inference_macros.$list30);
            current_$3 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)inference_macros.$list30);
            if (inference_macros.NIL == conses_high.member(current_$3, (SubLObject)inference_macros.$list23, (SubLObject)inference_macros.UNPROVIDED, (SubLObject)inference_macros.UNPROVIDED)) {
                bad = (SubLObject)inference_macros.T;
            }
            if (current_$3 == inference_macros.$kw14$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (inference_macros.NIL != bad && inference_macros.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)inference_macros.$list30);
        }
        final SubLObject openP_tail = cdestructuring_bind.property_list_member((SubLObject)inference_macros.$kw24$OPEN_, current);
        final SubLObject openP = (SubLObject)((inference_macros.NIL != openP_tail) ? conses_high.cadr(openP_tail) : inference_macros.NIL);
        final SubLObject done_tail = cdestructuring_bind.property_list_member((SubLObject)inference_macros.$kw16$DONE, current);
        final SubLObject done = (SubLObject)((inference_macros.NIL != done_tail) ? conses_high.cadr(done_tail) : inference_macros.NIL);
        final SubLObject body;
        current = (body = temp);
        return (SubLObject)ConsesLow.list((SubLObject)inference_macros.$sym2$CLET, (SubLObject)ConsesLow.list(reader.bq_cons(index_var, (SubLObject)inference_macros.$list31)), (SubLObject)ConsesLow.listS((SubLObject)inference_macros.$sym29$DO_PROBLEM_LINK_SUPPORTING_MAPPED_PROBLEMS, (SubLObject)ConsesLow.list(supporting_mapped_problem_var, link, (SubLObject)inference_macros.$kw24$OPEN_, openP, (SubLObject)inference_macros.$kw16$DONE, done), ConsesLow.append(body, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)inference_macros.$sym32$CINC, index_var)))));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-macros.lisp", position = 3373L)
    public static SubLObject do_problem_link_supporting_problems(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)inference_macros.$list33);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject supporting_problem_var = (SubLObject)inference_macros.NIL;
        SubLObject variable_map_var = (SubLObject)inference_macros.NIL;
        SubLObject link = (SubLObject)inference_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)inference_macros.$list33);
        supporting_problem_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)inference_macros.$list33);
        variable_map_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)inference_macros.$list33);
        link = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = (SubLObject)inference_macros.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)inference_macros.NIL;
        SubLObject current_$4 = (SubLObject)inference_macros.NIL;
        while (inference_macros.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)inference_macros.$list33);
            current_$4 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)inference_macros.$list33);
            if (inference_macros.NIL == conses_high.member(current_$4, (SubLObject)inference_macros.$list23, (SubLObject)inference_macros.UNPROVIDED, (SubLObject)inference_macros.UNPROVIDED)) {
                bad = (SubLObject)inference_macros.T;
            }
            if (current_$4 == inference_macros.$kw14$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (inference_macros.NIL != bad && inference_macros.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)inference_macros.$list33);
        }
        final SubLObject openP_tail = cdestructuring_bind.property_list_member((SubLObject)inference_macros.$kw24$OPEN_, current);
        final SubLObject openP = (SubLObject)((inference_macros.NIL != openP_tail) ? conses_high.cadr(openP_tail) : inference_macros.NIL);
        final SubLObject done_tail = cdestructuring_bind.property_list_member((SubLObject)inference_macros.$kw16$DONE, current);
        final SubLObject done = (SubLObject)((inference_macros.NIL != done_tail) ? conses_high.cadr(done_tail) : inference_macros.NIL);
        final SubLObject body;
        current = (body = temp);
        final SubLObject supporting_mapped_problem = (SubLObject)inference_macros.$sym34$SUPPORTING_MAPPED_PROBLEM;
        return (SubLObject)ConsesLow.list((SubLObject)inference_macros.$sym29$DO_PROBLEM_LINK_SUPPORTING_MAPPED_PROBLEMS, (SubLObject)ConsesLow.list(supporting_mapped_problem, link, (SubLObject)inference_macros.$kw24$OPEN_, openP, (SubLObject)inference_macros.$kw16$DONE, done), (SubLObject)ConsesLow.listS((SubLObject)inference_macros.$sym2$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(supporting_problem_var, (SubLObject)ConsesLow.list((SubLObject)inference_macros.$sym35$MAPPED_PROBLEM_PROBLEM, supporting_mapped_problem)), (SubLObject)ConsesLow.list(variable_map_var, (SubLObject)ConsesLow.list((SubLObject)inference_macros.$sym36$MAPPED_PROBLEM_VARIABLE_MAP, supporting_mapped_problem))), ConsesLow.append(body, (SubLObject)inference_macros.NIL)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-macros.lisp", position = 3870L)
    public static SubLObject do_problem_link_sibling_links(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)inference_macros.$list37);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject sibling_link_var = (SubLObject)inference_macros.NIL;
        SubLObject link = (SubLObject)inference_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)inference_macros.$list37);
        sibling_link_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)inference_macros.$list37);
        link = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = (SubLObject)inference_macros.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)inference_macros.NIL;
        SubLObject current_$5 = (SubLObject)inference_macros.NIL;
        while (inference_macros.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)inference_macros.$list37);
            current_$5 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)inference_macros.$list37);
            if (inference_macros.NIL == conses_high.member(current_$5, (SubLObject)inference_macros.$list38, (SubLObject)inference_macros.UNPROVIDED, (SubLObject)inference_macros.UNPROVIDED)) {
                bad = (SubLObject)inference_macros.T;
            }
            if (current_$5 == inference_macros.$kw14$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (inference_macros.NIL != bad && inference_macros.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)inference_macros.$list37);
        }
        final SubLObject done_tail = cdestructuring_bind.property_list_member((SubLObject)inference_macros.$kw16$DONE, current);
        final SubLObject done = (SubLObject)((inference_macros.NIL != done_tail) ? conses_high.cadr(done_tail) : inference_macros.NIL);
        final SubLObject body;
        current = (body = temp);
        final SubLObject supported_problem = (SubLObject)inference_macros.$sym39$SUPPORTED_PROBLEM;
        final SubLObject link_var = (SubLObject)inference_macros.$sym40$LINK_VAR;
        return (SubLObject)ConsesLow.list((SubLObject)inference_macros.$sym2$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(link_var, link), (SubLObject)ConsesLow.list(supported_problem, (SubLObject)ConsesLow.list((SubLObject)inference_macros.$sym41$PROBLEM_LINK_SUPPORTED_PROBLEM, link_var))), (SubLObject)ConsesLow.list((SubLObject)inference_macros.$sym19$DO_PROBLEM_ARGUMENT_LINKS, (SubLObject)ConsesLow.list(sibling_link_var, supported_problem, (SubLObject)inference_macros.$kw16$DONE, done), (SubLObject)ConsesLow.listS((SubLObject)inference_macros.$sym42$PUNLESS, (SubLObject)ConsesLow.list((SubLObject)inference_macros.EQ, link_var, sibling_link_var), ConsesLow.append(body, (SubLObject)inference_macros.NIL))));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-macros.lisp", position = 4265L)
    public static SubLObject do_problem_link_dependent_links(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)inference_macros.$list43);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject dependent_link_var = (SubLObject)inference_macros.NIL;
        SubLObject link = (SubLObject)inference_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)inference_macros.$list43);
        dependent_link_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)inference_macros.$list43);
        link = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = (SubLObject)inference_macros.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)inference_macros.NIL;
        SubLObject current_$6 = (SubLObject)inference_macros.NIL;
        while (inference_macros.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)inference_macros.$list43);
            current_$6 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)inference_macros.$list43);
            if (inference_macros.NIL == conses_high.member(current_$6, (SubLObject)inference_macros.$list44, (SubLObject)inference_macros.UNPROVIDED, (SubLObject)inference_macros.UNPROVIDED)) {
                bad = (SubLObject)inference_macros.T;
            }
            if (current_$6 == inference_macros.$kw14$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (inference_macros.NIL != bad && inference_macros.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)inference_macros.$list43);
        }
        final SubLObject link_type_tail = cdestructuring_bind.property_list_member((SubLObject)inference_macros.$kw45$LINK_TYPE, current);
        final SubLObject link_type = (SubLObject)((inference_macros.NIL != link_type_tail) ? conses_high.cadr(link_type_tail) : inference_macros.NIL);
        final SubLObject done_tail = cdestructuring_bind.property_list_member((SubLObject)inference_macros.$kw16$DONE, current);
        final SubLObject done = (SubLObject)((inference_macros.NIL != done_tail) ? conses_high.cadr(done_tail) : inference_macros.NIL);
        final SubLObject body;
        current = (body = temp);
        final SubLObject supported_problem = (SubLObject)inference_macros.$sym46$SUPPORTED_PROBLEM;
        return (SubLObject)ConsesLow.list((SubLObject)inference_macros.$sym2$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(supported_problem, (SubLObject)ConsesLow.list((SubLObject)inference_macros.$sym41$PROBLEM_LINK_SUPPORTED_PROBLEM, link))), (SubLObject)ConsesLow.listS((SubLObject)inference_macros.$sym47$DO_PROBLEM_DEPENDENT_LINKS, (SubLObject)ConsesLow.list(dependent_link_var, supported_problem, (SubLObject)inference_macros.$kw15$TYPE, link_type, (SubLObject)inference_macros.$kw16$DONE, done), ConsesLow.append(body, (SubLObject)inference_macros.NIL)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-macros.lisp", position = 4697L)
    public static SubLObject do_problem_link_argument_links(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)inference_macros.$list48);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject argument_link_var = (SubLObject)inference_macros.NIL;
        SubLObject link = (SubLObject)inference_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)inference_macros.$list48);
        argument_link_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)inference_macros.$list48);
        link = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = (SubLObject)inference_macros.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)inference_macros.NIL;
        SubLObject current_$7 = (SubLObject)inference_macros.NIL;
        while (inference_macros.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)inference_macros.$list48);
            current_$7 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)inference_macros.$list48);
            if (inference_macros.NIL == conses_high.member(current_$7, (SubLObject)inference_macros.$list49, (SubLObject)inference_macros.UNPROVIDED, (SubLObject)inference_macros.UNPROVIDED)) {
                bad = (SubLObject)inference_macros.T;
            }
            if (current_$7 == inference_macros.$kw14$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (inference_macros.NIL != bad && inference_macros.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)inference_macros.$list48);
        }
        final SubLObject openP_tail = cdestructuring_bind.property_list_member((SubLObject)inference_macros.$kw24$OPEN_, current);
        final SubLObject openP = (SubLObject)((inference_macros.NIL != openP_tail) ? conses_high.cadr(openP_tail) : inference_macros.NIL);
        final SubLObject link_type_tail = cdestructuring_bind.property_list_member((SubLObject)inference_macros.$kw45$LINK_TYPE, current);
        final SubLObject link_type = (SubLObject)((inference_macros.NIL != link_type_tail) ? conses_high.cadr(link_type_tail) : inference_macros.NIL);
        final SubLObject done_tail = cdestructuring_bind.property_list_member((SubLObject)inference_macros.$kw16$DONE, current);
        final SubLObject done = (SubLObject)((inference_macros.NIL != done_tail) ? conses_high.cadr(done_tail) : inference_macros.NIL);
        final SubLObject body;
        current = (body = temp);
        final SubLObject supporting_problem = (SubLObject)inference_macros.$sym50$SUPPORTING_PROBLEM;
        final SubLObject variable_map = (SubLObject)inference_macros.$sym51$VARIABLE_MAP;
        return (SubLObject)ConsesLow.list((SubLObject)inference_macros.$sym52$DO_PROBLEM_LINK_SUPPORTING_PROBLEMS, (SubLObject)ConsesLow.list(supporting_problem, variable_map, link, (SubLObject)inference_macros.$kw24$OPEN_, openP, (SubLObject)inference_macros.$kw16$DONE, done), (SubLObject)ConsesLow.list((SubLObject)inference_macros.$sym53$IGNORE, variable_map), (SubLObject)ConsesLow.listS((SubLObject)inference_macros.$sym19$DO_PROBLEM_ARGUMENT_LINKS, (SubLObject)ConsesLow.list(argument_link_var, supporting_problem, (SubLObject)inference_macros.$kw15$TYPE, link_type, (SubLObject)inference_macros.$kw16$DONE, done), ConsesLow.append(body, (SubLObject)inference_macros.NIL)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-macros.lisp", position = 5242L)
    public static SubLObject do_problem_link_proofs(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)inference_macros.$list54);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject proof_var = (SubLObject)inference_macros.NIL;
        SubLObject link = (SubLObject)inference_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)inference_macros.$list54);
        proof_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)inference_macros.$list54);
        link = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = (SubLObject)inference_macros.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)inference_macros.NIL;
        SubLObject current_$8 = (SubLObject)inference_macros.NIL;
        while (inference_macros.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)inference_macros.$list54);
            current_$8 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)inference_macros.$list54);
            if (inference_macros.NIL == conses_high.member(current_$8, (SubLObject)inference_macros.$list55, (SubLObject)inference_macros.UNPROVIDED, (SubLObject)inference_macros.UNPROVIDED)) {
                bad = (SubLObject)inference_macros.T;
            }
            if (current_$8 == inference_macros.$kw14$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (inference_macros.NIL != bad && inference_macros.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)inference_macros.$list54);
        }
        final SubLObject proof_status_tail = cdestructuring_bind.property_list_member((SubLObject)inference_macros.$kw56$PROOF_STATUS, current);
        final SubLObject proof_status = (SubLObject)((inference_macros.NIL != proof_status_tail) ? conses_high.cadr(proof_status_tail) : inference_macros.NIL);
        final SubLObject body;
        current = (body = temp);
        return (SubLObject)ConsesLow.list((SubLObject)inference_macros.$sym57$CDOLIST, (SubLObject)ConsesLow.list(proof_var, (SubLObject)ConsesLow.list((SubLObject)inference_macros.$sym58$PROBLEM_LINK_PROOFS, link)), (SubLObject)ConsesLow.listS((SubLObject)inference_macros.$sym20$PWHEN, (SubLObject)ConsesLow.list((SubLObject)inference_macros.$sym59$PROOF_HAS_STATUS_, proof_var, proof_status), ConsesLow.append(body, (SubLObject)inference_macros.NIL)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-macros.lisp", position = 5463L)
    public static SubLObject do_join_ordered_link_motivated_residual_transformation_links(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)inference_macros.$list60);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject rt_link_var = (SubLObject)inference_macros.NIL;
        SubLObject jo_link = (SubLObject)inference_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)inference_macros.$list60);
        rt_link_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)inference_macros.$list60);
        jo_link = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = (SubLObject)inference_macros.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)inference_macros.NIL;
        SubLObject current_$9 = (SubLObject)inference_macros.NIL;
        while (inference_macros.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)inference_macros.$list60);
            current_$9 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)inference_macros.$list60);
            if (inference_macros.NIL == conses_high.member(current_$9, (SubLObject)inference_macros.$list38, (SubLObject)inference_macros.UNPROVIDED, (SubLObject)inference_macros.UNPROVIDED)) {
                bad = (SubLObject)inference_macros.T;
            }
            if (current_$9 == inference_macros.$kw14$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (inference_macros.NIL != bad && inference_macros.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)inference_macros.$list60);
        }
        final SubLObject done_tail = cdestructuring_bind.property_list_member((SubLObject)inference_macros.$kw16$DONE, current);
        final SubLObject done = (SubLObject)((inference_macros.NIL != done_tail) ? conses_high.cadr(done_tail) : inference_macros.NIL);
        final SubLObject body;
        current = (body = temp);
        final SubLObject jo_link_var = (SubLObject)inference_macros.$sym61$JO_LINK_VAR;
        final SubLObject motivating_conjunction_problem = (SubLObject)inference_macros.$sym62$MOTIVATING_CONJUNCTION_PROBLEM;
        return (SubLObject)ConsesLow.list((SubLObject)inference_macros.$sym2$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(jo_link_var, jo_link), (SubLObject)ConsesLow.list(motivating_conjunction_problem, (SubLObject)ConsesLow.list((SubLObject)inference_macros.$sym41$PROBLEM_LINK_SUPPORTED_PROBLEM, jo_link_var))), (SubLObject)ConsesLow.list((SubLObject)inference_macros.$sym19$DO_PROBLEM_ARGUMENT_LINKS, (SubLObject)ConsesLow.list(rt_link_var, motivating_conjunction_problem, (SubLObject)inference_macros.$kw15$TYPE, (SubLObject)inference_macros.$kw63$RESIDUAL_TRANSFORMATION, (SubLObject)inference_macros.$kw16$DONE, done), (SubLObject)ConsesLow.listS((SubLObject)inference_macros.$sym20$PWHEN, (SubLObject)ConsesLow.list((SubLObject)inference_macros.$sym64$RESIDUAL_TRANSFORMATION_LINK_MOTIVATED_BY_JOIN_ORDERED_LINK_, rt_link_var, jo_link_var), ConsesLow.append(body, (SubLObject)inference_macros.NIL))));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-macros.lisp", position = 6015L)
    public static SubLObject do_transformation_link_motivated_residual_transformation_links(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)inference_macros.$list65);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject rt_link_var = (SubLObject)inference_macros.NIL;
        SubLObject t_link = (SubLObject)inference_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)inference_macros.$list65);
        rt_link_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)inference_macros.$list65);
        t_link = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = (SubLObject)inference_macros.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)inference_macros.NIL;
        SubLObject current_$10 = (SubLObject)inference_macros.NIL;
        while (inference_macros.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)inference_macros.$list65);
            current_$10 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)inference_macros.$list65);
            if (inference_macros.NIL == conses_high.member(current_$10, (SubLObject)inference_macros.$list38, (SubLObject)inference_macros.UNPROVIDED, (SubLObject)inference_macros.UNPROVIDED)) {
                bad = (SubLObject)inference_macros.T;
            }
            if (current_$10 == inference_macros.$kw14$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (inference_macros.NIL != bad && inference_macros.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)inference_macros.$list65);
        }
        final SubLObject done_tail = cdestructuring_bind.property_list_member((SubLObject)inference_macros.$kw16$DONE, current);
        final SubLObject done = (SubLObject)((inference_macros.NIL != done_tail) ? conses_high.cadr(done_tail) : inference_macros.NIL);
        final SubLObject body;
        current = (body = temp);
        final SubLObject t_link_var = (SubLObject)inference_macros.$sym66$T_LINK_VAR;
        final SubLObject jo_link_var = (SubLObject)inference_macros.$sym67$JO_LINK_VAR;
        return (SubLObject)ConsesLow.list((SubLObject)inference_macros.$sym2$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(t_link_var, t_link)), (SubLObject)ConsesLow.list((SubLObject)inference_macros.$sym68$DO_PROBLEM_LINK_DEPENDENT_LINKS, (SubLObject)ConsesLow.list(jo_link_var, t_link_var, (SubLObject)inference_macros.$kw45$LINK_TYPE, (SubLObject)inference_macros.$kw69$JOIN_ORDERED, (SubLObject)inference_macros.$kw16$DONE, done), (SubLObject)ConsesLow.list((SubLObject)inference_macros.$sym70$DO_JOIN_ORDERED_LINK_MOTIVATED_RESIDUAL_TRANSFORMATION_LINKS, (SubLObject)ConsesLow.list(rt_link_var, jo_link_var, (SubLObject)inference_macros.$kw16$DONE, done), (SubLObject)ConsesLow.listS((SubLObject)inference_macros.$sym20$PWHEN, (SubLObject)ConsesLow.list((SubLObject)inference_macros.$sym71$RESIDUAL_TRANSFORMATION_LINK_MOTIVATED_BY_TRANSFORMATION_LINK_, rt_link_var, t_link_var), ConsesLow.append(body, (SubLObject)inference_macros.NIL)))));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-macros.lisp", position = 6624L)
    public static SubLObject with_forward_problem_store_reuse(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return (SubLObject)ConsesLow.list((SubLObject)inference_macros.$sym2$CLET, (SubLObject)inference_macros.$list72, (SubLObject)ConsesLow.listS((SubLObject)inference_macros.$sym3$CUNWIND_PROTECT, reader.bq_cons((SubLObject)inference_macros.$sym4$PROGN, ConsesLow.append(body, (SubLObject)inference_macros.NIL)), (SubLObject)inference_macros.$list73));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-macros.lisp", position = 6889L)
    public static SubLObject with_forward_dnf_type_filtering(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return (SubLObject)ConsesLow.listS((SubLObject)inference_macros.$sym2$CLET, (SubLObject)inference_macros.$list74, ConsesLow.append(body, (SubLObject)inference_macros.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-macros.lisp", position = 7014L)
    public static SubLObject with_forward_inference_allowed_rules(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject rules = (SubLObject)inference_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)inference_macros.$list75);
        rules = current.first();
        final SubLObject body;
        current = (body = current.rest());
        return (SubLObject)ConsesLow.listS((SubLObject)inference_macros.$sym2$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)inference_macros.$sym76$_FORWARD_INFERENCE_ALLOWED_RULES_, rules)), ConsesLow.append(body, (SubLObject)inference_macros.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-macros.lisp", position = 7164L)
    public static SubLObject with_forward_inference_all_rules_allowed(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return (SubLObject)ConsesLow.listS((SubLObject)inference_macros.$sym77$WITH_FORWARD_INFERENCE_ALLOWED_RULES, (SubLObject)inference_macros.$kw78$ALL, ConsesLow.append(body, (SubLObject)inference_macros.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-macros.lisp", position = 7303L)
    public static SubLObject with_forward_inference_no_rules_allowed(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return (SubLObject)ConsesLow.listS((SubLObject)inference_macros.$sym77$WITH_FORWARD_INFERENCE_ALLOWED_RULES, (SubLObject)inference_macros.NIL, ConsesLow.append(body, (SubLObject)inference_macros.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-macros.lisp", position = 7440L)
    public static SubLObject with_forward_inference_forbidden_rules(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject rules = (SubLObject)inference_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)inference_macros.$list75);
        rules = current.first();
        final SubLObject body;
        current = (body = current.rest());
        return (SubLObject)ConsesLow.listS((SubLObject)inference_macros.$sym2$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)inference_macros.$sym79$_FORWARD_INFERENCE_FORBIDDEN_RULES_, rules)), ConsesLow.append(body, (SubLObject)inference_macros.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-macros.lisp", position = 7594L)
    public static SubLObject with_forward_inference_no_rules_forbidden(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return (SubLObject)ConsesLow.listS((SubLObject)inference_macros.$sym80$WITH_FORWARD_INFERENCE_FORBIDDEN_RULES, (SubLObject)inference_macros.$kw81$NONE, ConsesLow.append(body, (SubLObject)inference_macros.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-macros.lisp", position = 7905L)
    public static SubLObject current_controlling_inference() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return inference_macros.$controlling_inferences$.getDynamicValue(thread).first();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-macros.lisp", position = 8108L)
    public static SubLObject current_controlling_inferences() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return list_utilities.find_all_if((SubLObject)inference_macros.$sym82$INFERENCE_P, inference_macros.$controlling_inferences$.getDynamicValue(thread), (SubLObject)inference_macros.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-macros.lisp", position = 8222L)
    public static SubLObject within_controlling_inference(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject inference = (SubLObject)inference_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)inference_macros.$list83);
        inference = current.first();
        final SubLObject body;
        current = (body = current.rest());
        return (SubLObject)ConsesLow.listS((SubLObject)inference_macros.$sym2$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)inference_macros.$sym84$_CONTROLLING_INFERENCES_, (SubLObject)ConsesLow.listS((SubLObject)inference_macros.$sym85$CONS, inference, (SubLObject)inference_macros.$list86))), ConsesLow.append(body, (SubLObject)inference_macros.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-macros.lisp", position = 8394L)
    public static SubLObject within_no_controlling_inference(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return (SubLObject)ConsesLow.list((SubLObject)inference_macros.$sym87$WITHIN_CONTROLLING_INFERENCE, (SubLObject)inference_macros.NIL, reader.bq_cons((SubLObject)inference_macros.$sym88$WITHIN_NO_CONTROLLING_STRATEGY, ConsesLow.append(body, (SubLObject)inference_macros.NIL)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-macros.lisp", position = 8723L)
    public static SubLObject current_controlling_strategy() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return inference_macros.$controlling_strategy$.getDynamicValue(thread);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-macros.lisp", position = 8915L)
    public static SubLObject within_controlling_strategy(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject strategy = (SubLObject)inference_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)inference_macros.$list89);
        strategy = current.first();
        final SubLObject body;
        current = (body = current.rest());
        return (SubLObject)ConsesLow.listS((SubLObject)inference_macros.$sym2$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)inference_macros.$sym90$_CONTROLLING_STRATEGY_, strategy)), ConsesLow.append(body, (SubLObject)inference_macros.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-macros.lisp", position = 9050L)
    public static SubLObject within_no_controlling_strategy(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return (SubLObject)ConsesLow.listS((SubLObject)inference_macros.$sym91$WITHIN_CONTROLLING_STRATEGY, (SubLObject)inference_macros.NIL, ConsesLow.append(body, (SubLObject)inference_macros.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-macros.lisp", position = 9429L)
    public static SubLObject possibly_gathering_pad_metrics(final SubLObject macroform, final SubLObject environment) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)inference_macros.$list92);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject inference = (SubLObject)inference_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)inference_macros.$list92);
        inference = current.first();
        current = current.rest();
        if (inference_macros.NIL != current) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)inference_macros.$list92);
            return (SubLObject)inference_macros.NIL;
        }
        final SubLObject body;
        current = (body = temp);
        if (inference_macros.NIL == list_utilities.member_eqP((SubLObject)inference_macros.$kw93$CYC_MAINT, reader.$features$.getDynamicValue(thread))) {
            return reader.bq_cons((SubLObject)inference_macros.$sym4$PROGN, ConsesLow.append(body, (SubLObject)inference_macros.NIL));
        }
        return reader.bq_cons((SubLObject)inference_macros.$sym4$PROGN, ConsesLow.append(body, (SubLObject)inference_macros.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-macros.lisp", position = 9857L)
    public static SubLObject possibly_gathering_tick_indexed_inference_progress_metrics_count_method(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)inference_macros.$list92);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject inference = (SubLObject)inference_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)inference_macros.$list92);
        inference = current.first();
        current = current.rest();
        if (inference_macros.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            final SubLObject gather_tick_dataP = (SubLObject)inference_macros.$sym94$GATHER_TICK_DATA_;
            final SubLObject initial_arete_terms_touched_count = (SubLObject)inference_macros.$sym95$INITIAL_ARETE_TERMS_TOUCHED_COUNT;
            final SubLObject initial_arete_assertions_touched_count = (SubLObject)inference_macros.$sym96$INITIAL_ARETE_ASSERTIONS_TOUCHED_COUNT;
            final SubLObject initial_arete_log_last_kb_touchP = (SubLObject)inference_macros.$sym97$INITIAL_ARETE_LOG_LAST_KB_TOUCH_;
            final SubLObject initial_arete_log_kb_touch_countsP = (SubLObject)inference_macros.$sym98$INITIAL_ARETE_LOG_KB_TOUCH_COUNTS_;
            final SubLObject final_arete_terms_touched_count = (SubLObject)inference_macros.$sym99$FINAL_ARETE_TERMS_TOUCHED_COUNT;
            final SubLObject final_arete_assertions_touched_count = (SubLObject)inference_macros.$sym100$FINAL_ARETE_ASSERTIONS_TOUCHED_COUNT;
            return (SubLObject)ConsesLow.list((SubLObject)inference_macros.$sym2$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(gather_tick_dataP, (SubLObject)ConsesLow.list((SubLObject)inference_macros.$sym101$INFERENCE_GATHERS_TICK_INDEXED_PROGRESS_DATA_, inference)), reader.bq_cons(initial_arete_terms_touched_count, (SubLObject)inference_macros.$list102), reader.bq_cons(initial_arete_assertions_touched_count, (SubLObject)inference_macros.$list103), reader.bq_cons(initial_arete_log_last_kb_touchP, (SubLObject)inference_macros.$list104), reader.bq_cons(initial_arete_log_kb_touch_countsP, (SubLObject)inference_macros.$list105), final_arete_terms_touched_count, final_arete_assertions_touched_count), (SubLObject)ConsesLow.listS((SubLObject)inference_macros.$sym2$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)inference_macros.$sym106$_ARETE_TERMS_TOUCHED_COUNT_, (SubLObject)ConsesLow.list((SubLObject)inference_macros.$sym107$FIF, gather_tick_dataP, (SubLObject)inference_macros.ZERO_INTEGER, initial_arete_terms_touched_count)), (SubLObject)ConsesLow.list((SubLObject)inference_macros.$sym108$_ARETE_ASSERTIONS_TOUCHED_COUNT_, (SubLObject)ConsesLow.list((SubLObject)inference_macros.$sym107$FIF, gather_tick_dataP, (SubLObject)inference_macros.ZERO_INTEGER, initial_arete_assertions_touched_count)), (SubLObject)ConsesLow.list((SubLObject)inference_macros.$sym109$_ARETE_LOG_LAST_KB_TOUCH__, (SubLObject)ConsesLow.list((SubLObject)inference_macros.$sym107$FIF, gather_tick_dataP, (SubLObject)inference_macros.T, initial_arete_log_last_kb_touchP)), (SubLObject)ConsesLow.list((SubLObject)inference_macros.$sym110$_ARETE_LOG_KB_TOUCH_COUNTS__, (SubLObject)ConsesLow.list((SubLObject)inference_macros.$sym107$FIF, gather_tick_dataP, (SubLObject)inference_macros.T, initial_arete_log_kb_touch_countsP))), ConsesLow.append(body, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.listS((SubLObject)inference_macros.$sym10$CSETQ, final_arete_terms_touched_count, (SubLObject)inference_macros.$list102), (SubLObject)ConsesLow.listS((SubLObject)inference_macros.$sym10$CSETQ, final_arete_assertions_touched_count, (SubLObject)inference_macros.$list103)))), (SubLObject)ConsesLow.list((SubLObject)inference_macros.$sym20$PWHEN, initial_arete_terms_touched_count, (SubLObject)ConsesLow.list((SubLObject)inference_macros.$sym10$CSETQ, (SubLObject)inference_macros.$sym106$_ARETE_TERMS_TOUCHED_COUNT_, (SubLObject)ConsesLow.list((SubLObject)inference_macros.$sym107$FIF, gather_tick_dataP, (SubLObject)ConsesLow.list((SubLObject)inference_macros.$sym111$_, initial_arete_terms_touched_count, final_arete_assertions_touched_count), final_arete_terms_touched_count))), (SubLObject)ConsesLow.list((SubLObject)inference_macros.$sym20$PWHEN, initial_arete_assertions_touched_count, (SubLObject)ConsesLow.list((SubLObject)inference_macros.$sym10$CSETQ, (SubLObject)inference_macros.$sym108$_ARETE_ASSERTIONS_TOUCHED_COUNT_, (SubLObject)ConsesLow.list((SubLObject)inference_macros.$sym107$FIF, gather_tick_dataP, (SubLObject)ConsesLow.list((SubLObject)inference_macros.$sym111$_, initial_arete_assertions_touched_count, final_arete_assertions_touched_count), final_arete_assertions_touched_count))));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)inference_macros.$list92);
        return (SubLObject)inference_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-macros.lisp", position = 11917L)
    public static SubLObject possibly_gathering_tick_indexed_inference_progress_metrics(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)inference_macros.$list92);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject inference = (SubLObject)inference_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)inference_macros.$list92);
        inference = current.first();
        current = current.rest();
        if (inference_macros.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            final SubLObject gather_tick_dataP = (SubLObject)inference_macros.$sym112$GATHER_TICK_DATA_;
            final SubLObject initial_arete_assertions_touched = (SubLObject)inference_macros.$sym113$INITIAL_ARETE_ASSERTIONS_TOUCHED;
            final SubLObject initial_arete_constants_touched = (SubLObject)inference_macros.$sym114$INITIAL_ARETE_CONSTANTS_TOUCHED;
            final SubLObject initial_arete_narts_touched = (SubLObject)inference_macros.$sym115$INITIAL_ARETE_NARTS_TOUCHED;
            final SubLObject initial_arete_log_last_kb_touchP = (SubLObject)inference_macros.$sym116$INITIAL_ARETE_LOG_LAST_KB_TOUCH_;
            final SubLObject initial_arete_log_kb_touchesP = (SubLObject)inference_macros.$sym117$INITIAL_ARETE_LOG_KB_TOUCHES_;
            final SubLObject final_arete_assertions_touched = (SubLObject)inference_macros.$sym118$FINAL_ARETE_ASSERTIONS_TOUCHED;
            final SubLObject final_arete_constants_touched = (SubLObject)inference_macros.$sym119$FINAL_ARETE_CONSTANTS_TOUCHED;
            final SubLObject final_arete_narts_touched = (SubLObject)inference_macros.$sym120$FINAL_ARETE_NARTS_TOUCHED;
            return (SubLObject)ConsesLow.list((SubLObject)inference_macros.$sym2$CLET, (SubLObject)ConsesLow.list(new SubLObject[] { ConsesLow.list(gather_tick_dataP, (SubLObject)ConsesLow.list((SubLObject)inference_macros.$sym121$INFERENCE_SHOULD_GATHER_TICK_INDEXED_PROGRESS_DATA_, inference)), reader.bq_cons(initial_arete_assertions_touched, (SubLObject)inference_macros.$list122), reader.bq_cons(initial_arete_constants_touched, (SubLObject)inference_macros.$list123), reader.bq_cons(initial_arete_narts_touched, (SubLObject)inference_macros.$list124), reader.bq_cons(initial_arete_log_last_kb_touchP, (SubLObject)inference_macros.$list104), reader.bq_cons(initial_arete_log_kb_touchesP, (SubLObject)inference_macros.$list125), final_arete_assertions_touched, final_arete_constants_touched, final_arete_narts_touched }), (SubLObject)ConsesLow.listS((SubLObject)inference_macros.$sym2$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)inference_macros.$sym126$_ARETE_ASSERTIONS_TOUCHED_, (SubLObject)ConsesLow.list((SubLObject)inference_macros.$sym107$FIF, gather_tick_dataP, (SubLObject)inference_macros.$list127, initial_arete_assertions_touched)), (SubLObject)ConsesLow.list((SubLObject)inference_macros.$sym128$_ARETE_CONSTANTS_TOUCHED_, (SubLObject)ConsesLow.list((SubLObject)inference_macros.$sym107$FIF, gather_tick_dataP, (SubLObject)inference_macros.$list127, initial_arete_constants_touched)), (SubLObject)ConsesLow.list((SubLObject)inference_macros.$sym129$_ARETE_NARTS_TOUCHED_, (SubLObject)ConsesLow.list((SubLObject)inference_macros.$sym107$FIF, gather_tick_dataP, (SubLObject)inference_macros.$list127, initial_arete_narts_touched)), (SubLObject)ConsesLow.list((SubLObject)inference_macros.$sym109$_ARETE_LOG_LAST_KB_TOUCH__, (SubLObject)ConsesLow.list((SubLObject)inference_macros.$sym107$FIF, gather_tick_dataP, (SubLObject)inference_macros.T, initial_arete_log_last_kb_touchP)), (SubLObject)ConsesLow.list((SubLObject)inference_macros.$sym130$_ARETE_LOG_KB_TOUCHES__, (SubLObject)ConsesLow.list((SubLObject)inference_macros.$sym107$FIF, gather_tick_dataP, (SubLObject)inference_macros.T, initial_arete_log_kb_touchesP))), ConsesLow.append(body, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.listS((SubLObject)inference_macros.$sym10$CSETQ, final_arete_assertions_touched, (SubLObject)inference_macros.$list122), (SubLObject)ConsesLow.listS((SubLObject)inference_macros.$sym10$CSETQ, final_arete_constants_touched, (SubLObject)inference_macros.$list123), (SubLObject)ConsesLow.listS((SubLObject)inference_macros.$sym10$CSETQ, final_arete_narts_touched, (SubLObject)inference_macros.$list124)))), (SubLObject)ConsesLow.list((SubLObject)inference_macros.$sym20$PWHEN, initial_arete_assertions_touched, (SubLObject)ConsesLow.list((SubLObject)inference_macros.$sym10$CSETQ, (SubLObject)inference_macros.$sym126$_ARETE_ASSERTIONS_TOUCHED_, (SubLObject)ConsesLow.list((SubLObject)inference_macros.$sym107$FIF, gather_tick_dataP, (SubLObject)ConsesLow.list((SubLObject)inference_macros.$sym131$SET_NMERGE, initial_arete_assertions_touched, final_arete_assertions_touched), final_arete_assertions_touched))), (SubLObject)ConsesLow.list((SubLObject)inference_macros.$sym20$PWHEN, initial_arete_constants_touched, (SubLObject)ConsesLow.list((SubLObject)inference_macros.$sym10$CSETQ, (SubLObject)inference_macros.$sym128$_ARETE_CONSTANTS_TOUCHED_, (SubLObject)ConsesLow.list((SubLObject)inference_macros.$sym107$FIF, gather_tick_dataP, (SubLObject)ConsesLow.list((SubLObject)inference_macros.$sym131$SET_NMERGE, initial_arete_constants_touched, final_arete_constants_touched), final_arete_constants_touched))), (SubLObject)ConsesLow.list((SubLObject)inference_macros.$sym20$PWHEN, initial_arete_narts_touched, (SubLObject)ConsesLow.list((SubLObject)inference_macros.$sym10$CSETQ, (SubLObject)inference_macros.$sym129$_ARETE_NARTS_TOUCHED_, (SubLObject)ConsesLow.list((SubLObject)inference_macros.$sym107$FIF, gather_tick_dataP, (SubLObject)ConsesLow.list((SubLObject)inference_macros.$sym131$SET_NMERGE, initial_arete_narts_touched, final_arete_narts_touched), final_arete_narts_touched))));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)inference_macros.$list92);
        return (SubLObject)inference_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-macros.lisp", position = 14375L)
    public static SubLObject do_pattern_possible_disjuncts(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)inference_macros.$list132);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject disjunct_var = (SubLObject)inference_macros.NIL;
        SubLObject pattern = (SubLObject)inference_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)inference_macros.$list132);
        disjunct_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)inference_macros.$list132);
        pattern = current.first();
        current = current.rest();
        if (inference_macros.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            final SubLObject pattern_var = (SubLObject)inference_macros.$sym133$PATTERN_VAR;
            return (SubLObject)ConsesLow.list((SubLObject)inference_macros.$sym2$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(pattern_var, pattern)), (SubLObject)ConsesLow.list((SubLObject)inference_macros.$sym134$PIF, (SubLObject)ConsesLow.list((SubLObject)inference_macros.$sym135$OR_PATTERN_P, pattern_var), (SubLObject)ConsesLow.listS((SubLObject)inference_macros.$sym57$CDOLIST, (SubLObject)ConsesLow.list(disjunct_var, (SubLObject)ConsesLow.list((SubLObject)inference_macros.$sym136$REST, pattern_var)), ConsesLow.append(body, (SubLObject)inference_macros.NIL)), (SubLObject)ConsesLow.listS((SubLObject)inference_macros.$sym2$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(disjunct_var, pattern_var)), ConsesLow.append(body, (SubLObject)inference_macros.NIL))));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)inference_macros.$list132);
        return (SubLObject)inference_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-macros.lisp", position = 14708L)
    public static SubLObject do_asked_queries(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)inference_macros.$list137);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject query_info_var = (SubLObject)inference_macros.NIL;
        SubLObject filename = (SubLObject)inference_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)inference_macros.$list137);
        query_info_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)inference_macros.$list137);
        filename = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = (SubLObject)inference_macros.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)inference_macros.NIL;
        SubLObject current_$11 = (SubLObject)inference_macros.NIL;
        while (inference_macros.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)inference_macros.$list137);
            current_$11 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)inference_macros.$list137);
            if (inference_macros.NIL == conses_high.member(current_$11, (SubLObject)inference_macros.$list138, (SubLObject)inference_macros.UNPROVIDED, (SubLObject)inference_macros.UNPROVIDED)) {
                bad = (SubLObject)inference_macros.T;
            }
            if (current_$11 == inference_macros.$kw14$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (inference_macros.NIL != bad && inference_macros.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)inference_macros.$list137);
        }
        final SubLObject element_num_tail = cdestructuring_bind.property_list_member((SubLObject)inference_macros.$kw139$ELEMENT_NUM, current);
        final SubLObject element_num = (SubLObject)((inference_macros.NIL != element_num_tail) ? conses_high.cadr(element_num_tail) : inference_macros.NIL);
        final SubLObject doneP_tail = cdestructuring_bind.property_list_member((SubLObject)inference_macros.$kw140$DONE_, current);
        final SubLObject doneP = (SubLObject)((inference_macros.NIL != doneP_tail) ? conses_high.cadr(doneP_tail) : inference_macros.NIL);
        final SubLObject body;
        current = (body = temp);
        final SubLObject done_varP = (SubLObject)inference_macros.$sym141$DONE_VAR_;
        final SubLObject i = (SubLObject)inference_macros.$sym142$I;
        final SubLObject input_stream = (SubLObject)inference_macros.$sym143$INPUT_STREAM;
        return (SubLObject)ConsesLow.list((SubLObject)inference_macros.$sym2$CLET, (SubLObject)ConsesLow.list(reader.bq_cons(done_varP, (SubLObject)inference_macros.$list144), reader.bq_cons(i, (SubLObject)inference_macros.$list31)), (SubLObject)ConsesLow.list((SubLObject)inference_macros.$sym145$WITH_PRIVATE_BINARY_FILE, (SubLObject)ConsesLow.listS(input_stream, filename, (SubLObject)inference_macros.$list146), (SubLObject)ConsesLow.list((SubLObject)inference_macros.$sym147$WITH_CFASL_COMMON_SYMBOLS, (SubLObject)inference_macros.$list148, (SubLObject)ConsesLow.list((SubLObject)inference_macros.$sym149$UNTIL, done_varP, (SubLObject)ConsesLow.list((SubLObject)inference_macros.$sym2$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(query_info_var, (SubLObject)ConsesLow.list((SubLObject)inference_macros.$sym150$LOAD_ASKED_QUERY_FROM_STREAM, input_stream))), (SubLObject)ConsesLow.list((SubLObject)inference_macros.$sym151$PCOND, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)inference_macros.EQ, (SubLObject)inference_macros.$kw152$EOF, query_info_var), (SubLObject)ConsesLow.listS((SubLObject)inference_macros.$sym10$CSETQ, done_varP, (SubLObject)inference_macros.$list153)), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)inference_macros.$sym154$STRINGP, query_info_var), (SubLObject)ConsesLow.list((SubLObject)inference_macros.$sym155$WARN, (SubLObject)inference_macros.$str156$Read_invalid_query_info__s, query_info_var)), (SubLObject)ConsesLow.list((SubLObject)inference_macros.T, (SubLObject)((inference_macros.NIL != element_num) ? ConsesLow.listS((SubLObject)inference_macros.$sym2$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(element_num, i)), ConsesLow.append(body, (SubLObject)inference_macros.NIL)) : reader.bq_cons((SubLObject)inference_macros.$sym4$PROGN, ConsesLow.append(body, (SubLObject)inference_macros.NIL))), (SubLObject)ConsesLow.list((SubLObject)inference_macros.$sym32$CINC, i)))), (SubLObject)ConsesLow.list((SubLObject)inference_macros.$sym20$PWHEN, doneP, (SubLObject)ConsesLow.list((SubLObject)inference_macros.$sym10$CSETQ, done_varP, doneP))))));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-macros.lisp", position = 15493L)
    public static SubLObject do_asked_queries_in_directory(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)inference_macros.$list157);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject query_info_var = (SubLObject)inference_macros.NIL;
        SubLObject filename_var = (SubLObject)inference_macros.NIL;
        SubLObject directory = (SubLObject)inference_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)inference_macros.$list157);
        query_info_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)inference_macros.$list157);
        filename_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)inference_macros.$list157);
        directory = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = (SubLObject)inference_macros.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)inference_macros.NIL;
        SubLObject current_$12 = (SubLObject)inference_macros.NIL;
        while (inference_macros.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)inference_macros.$list157);
            current_$12 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)inference_macros.$list157);
            if (inference_macros.NIL == conses_high.member(current_$12, (SubLObject)inference_macros.$list158, (SubLObject)inference_macros.UNPROVIDED, (SubLObject)inference_macros.UNPROVIDED)) {
                bad = (SubLObject)inference_macros.T;
            }
            if (current_$12 == inference_macros.$kw14$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (inference_macros.NIL != bad && inference_macros.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)inference_macros.$list157);
        }
        final SubLObject doneP_tail = cdestructuring_bind.property_list_member((SubLObject)inference_macros.$kw140$DONE_, current);
        final SubLObject doneP = (SubLObject)((inference_macros.NIL != doneP_tail) ? conses_high.cadr(doneP_tail) : inference_macros.NIL);
        final SubLObject body;
        current = (body = temp);
        return (SubLObject)ConsesLow.list((SubLObject)inference_macros.$sym159$DO_DIRECTORY_CONTENTS, (SubLObject)ConsesLow.list(filename_var, directory, (SubLObject)inference_macros.$kw16$DONE, doneP), (SubLObject)ConsesLow.list((SubLObject)inference_macros.$sym20$PWHEN, (SubLObject)ConsesLow.list((SubLObject)inference_macros.$sym160$ASKED_QUERIES_FILENAME_, filename_var), (SubLObject)ConsesLow.listS((SubLObject)inference_macros.$sym161$DO_ASKED_QUERIES, (SubLObject)ConsesLow.list(query_info_var, filename_var, (SubLObject)inference_macros.$kw140$DONE_, doneP), ConsesLow.append(body, (SubLObject)inference_macros.NIL))));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-macros.lisp", position = 15814L)
    public static SubLObject inference_trace(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject trace_level = (SubLObject)inference_macros.NIL;
        SubLObject control_string = (SubLObject)inference_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)inference_macros.$list162);
        trace_level = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)inference_macros.$list162);
        control_string = current.first();
        current = current.rest();
        final SubLObject arg1 = (SubLObject)(current.isCons() ? current.first() : inference_macros.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)inference_macros.$list162);
        current = current.rest();
        final SubLObject arg2 = (SubLObject)(current.isCons() ? current.first() : inference_macros.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)inference_macros.$list162);
        current = current.rest();
        final SubLObject arg3 = (SubLObject)(current.isCons() ? current.first() : inference_macros.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)inference_macros.$list162);
        current = current.rest();
        final SubLObject arg4 = (SubLObject)(current.isCons() ? current.first() : inference_macros.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)inference_macros.$list162);
        current = current.rest();
        final SubLObject arg5 = (SubLObject)(current.isCons() ? current.first() : inference_macros.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)inference_macros.$list162);
        current = current.rest();
        final SubLObject arg6 = (SubLObject)(current.isCons() ? current.first() : inference_macros.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)inference_macros.$list162);
        current = current.rest();
        final SubLObject arg7 = (SubLObject)(current.isCons() ? current.first() : inference_macros.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)inference_macros.$list162);
        current = current.rest();
        final SubLObject arg8 = (SubLObject)(current.isCons() ? current.first() : inference_macros.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)inference_macros.$list162);
        current = current.rest();
        if (inference_macros.NIL == current) {
            return (SubLObject)ConsesLow.list((SubLObject)inference_macros.$sym20$PWHEN, (SubLObject)ConsesLow.list((SubLObject)inference_macros.$sym163$__, (SubLObject)inference_macros.$sym164$_INFERENCE_TRACE_LEVEL_, trace_level), (SubLObject)ConsesLow.list(new SubLObject[] { inference_macros.$sym165$FORCE_FORMAT, inference_macros.T, control_string, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8 }));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)inference_macros.$list162);
        return (SubLObject)inference_macros.NIL;
    }
    
    public static SubLObject declare_inference_macros_file() {
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.inference.harness.inference_macros", "with_inference_var", "WITH-INFERENCE-VAR");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.inference.harness.inference_macros", "with_problem_store_var", "WITH-PROBLEM-STORE-VAR");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.inference.harness.inference_macros", "with_new_problem_store", "WITH-NEW-PROBLEM-STORE");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.inference.harness.inference_macros", "do_problem_argument_links", "DO-PROBLEM-ARGUMENT-LINKS");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.inference.harness.inference_macros", "do_problem_link_supporting_mapped_problems", "DO-PROBLEM-LINK-SUPPORTING-MAPPED-PROBLEMS");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_macros", "do_problem_link_open_matchP", "DO-PROBLEM-LINK-OPEN-MATCH?", 3, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.inference.harness.inference_macros", "do_problem_link_supporting_mapped_problems_numbered", "DO-PROBLEM-LINK-SUPPORTING-MAPPED-PROBLEMS-NUMBERED");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.inference.harness.inference_macros", "do_problem_link_supporting_problems", "DO-PROBLEM-LINK-SUPPORTING-PROBLEMS");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.inference.harness.inference_macros", "do_problem_link_sibling_links", "DO-PROBLEM-LINK-SIBLING-LINKS");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.inference.harness.inference_macros", "do_problem_link_dependent_links", "DO-PROBLEM-LINK-DEPENDENT-LINKS");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.inference.harness.inference_macros", "do_problem_link_argument_links", "DO-PROBLEM-LINK-ARGUMENT-LINKS");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.inference.harness.inference_macros", "do_problem_link_proofs", "DO-PROBLEM-LINK-PROOFS");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.inference.harness.inference_macros", "do_join_ordered_link_motivated_residual_transformation_links", "DO-JOIN-ORDERED-LINK-MOTIVATED-RESIDUAL-TRANSFORMATION-LINKS");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.inference.harness.inference_macros", "do_transformation_link_motivated_residual_transformation_links", "DO-TRANSFORMATION-LINK-MOTIVATED-RESIDUAL-TRANSFORMATION-LINKS");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.inference.harness.inference_macros", "with_forward_problem_store_reuse", "WITH-FORWARD-PROBLEM-STORE-REUSE");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.inference.harness.inference_macros", "with_forward_dnf_type_filtering", "WITH-FORWARD-DNF-TYPE-FILTERING");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.inference.harness.inference_macros", "with_forward_inference_allowed_rules", "WITH-FORWARD-INFERENCE-ALLOWED-RULES");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.inference.harness.inference_macros", "with_forward_inference_all_rules_allowed", "WITH-FORWARD-INFERENCE-ALL-RULES-ALLOWED");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.inference.harness.inference_macros", "with_forward_inference_no_rules_allowed", "WITH-FORWARD-INFERENCE-NO-RULES-ALLOWED");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.inference.harness.inference_macros", "with_forward_inference_forbidden_rules", "WITH-FORWARD-INFERENCE-FORBIDDEN-RULES");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.inference.harness.inference_macros", "with_forward_inference_no_rules_forbidden", "WITH-FORWARD-INFERENCE-NO-RULES-FORBIDDEN");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_macros", "current_controlling_inference", "CURRENT-CONTROLLING-INFERENCE", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_macros", "current_controlling_inferences", "CURRENT-CONTROLLING-INFERENCES", 0, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.inference.harness.inference_macros", "within_controlling_inference", "WITHIN-CONTROLLING-INFERENCE");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.inference.harness.inference_macros", "within_no_controlling_inference", "WITHIN-NO-CONTROLLING-INFERENCE");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_macros", "current_controlling_strategy", "CURRENT-CONTROLLING-STRATEGY", 0, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.inference.harness.inference_macros", "within_controlling_strategy", "WITHIN-CONTROLLING-STRATEGY");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.inference.harness.inference_macros", "within_no_controlling_strategy", "WITHIN-NO-CONTROLLING-STRATEGY");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.inference.harness.inference_macros", "possibly_gathering_pad_metrics", "POSSIBLY-GATHERING-PAD-METRICS");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.inference.harness.inference_macros", "possibly_gathering_tick_indexed_inference_progress_metrics_count_method", "POSSIBLY-GATHERING-TICK-INDEXED-INFERENCE-PROGRESS-METRICS-COUNT-METHOD");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.inference.harness.inference_macros", "possibly_gathering_tick_indexed_inference_progress_metrics", "POSSIBLY-GATHERING-TICK-INDEXED-INFERENCE-PROGRESS-METRICS");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.inference.harness.inference_macros", "do_pattern_possible_disjuncts", "DO-PATTERN-POSSIBLE-DISJUNCTS");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.inference.harness.inference_macros", "do_asked_queries", "DO-ASKED-QUERIES");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.inference.harness.inference_macros", "do_asked_queries_in_directory", "DO-ASKED-QUERIES-IN-DIRECTORY");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.inference.harness.inference_macros", "inference_trace", "INFERENCE-TRACE");
        return (SubLObject)inference_macros.NIL;
    }
    
    public static SubLObject init_inference_macros_file() {
        inference_macros.$controlling_inferences$ = SubLFiles.defparameter("*CONTROLLING-INFERENCES*", (SubLObject)inference_macros.NIL);
        inference_macros.$controlling_strategy$ = SubLFiles.defparameter("*CONTROLLING-STRATEGY*", (SubLObject)inference_macros.NIL);
        return (SubLObject)inference_macros.NIL;
    }
    
    public static SubLObject setup_inference_macros_file() {
        access_macros.register_macro_helper((SubLObject)inference_macros.$sym28$DO_PROBLEM_LINK_OPEN_MATCH_, (SubLObject)inference_macros.$sym29$DO_PROBLEM_LINK_SUPPORTING_MAPPED_PROBLEMS);
        return (SubLObject)inference_macros.NIL;
    }
    
    @Override
	public void declareFunctions() {
        declare_inference_macros_file();
    }
    
    @Override
	public void initializeVariables() {
        init_inference_macros_file();
    }
    
    @Override
	public void runTopLevelForms() {
        setup_inference_macros_file();
    }
    
    static {
        me = (SubLFile)new inference_macros();
        inference_macros.$controlling_inferences$ = null;
        inference_macros.$controlling_strategy$ = null;
        $list0 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INFERENCE-VAR")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym1$SYMBOLP = SubLObjectFactory.makeSymbol("SYMBOLP");
        $sym2$CLET = SubLObjectFactory.makeSymbol("CLET");
        $sym3$CUNWIND_PROTECT = SubLObjectFactory.makeSymbol("CUNWIND-PROTECT");
        $sym4$PROGN = SubLObjectFactory.makeSymbol("PROGN");
        $sym5$DESTROY_INFERENCE_AND_PROBLEM_STORE = SubLObjectFactory.makeSymbol("DESTROY-INFERENCE-AND-PROBLEM-STORE");
        $list6 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PROBLEM-STORE-VAR")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym7$DESTROY_PROBLEM_STORE = SubLObjectFactory.makeSymbol("DESTROY-PROBLEM-STORE");
        $list8 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PROBLEM-STORE-VAR"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("PROPERTIES")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym9$WITH_PROBLEM_STORE_VAR = SubLObjectFactory.makeSymbol("WITH-PROBLEM-STORE-VAR");
        $sym10$CSETQ = SubLObjectFactory.makeSymbol("CSETQ");
        $sym11$NEW_PROBLEM_STORE = SubLObjectFactory.makeSymbol("NEW-PROBLEM-STORE");
        $list12 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LINK-VAR"), (SubLObject)SubLObjectFactory.makeSymbol("PROBLEM"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("TYPE"), (SubLObject)SubLObjectFactory.makeSymbol("DONE")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $list13 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TYPE"), (SubLObject)SubLObjectFactory.makeKeyword("DONE"));
        $kw14$ALLOW_OTHER_KEYS = SubLObjectFactory.makeKeyword("ALLOW-OTHER-KEYS");
        $kw15$TYPE = SubLObjectFactory.makeKeyword("TYPE");
        $kw16$DONE = SubLObjectFactory.makeKeyword("DONE");
        $sym17$DO_SET_CONTENTS = SubLObjectFactory.makeSymbol("DO-SET-CONTENTS");
        $sym18$PROBLEM_ARGUMENT_LINKS = SubLObjectFactory.makeSymbol("PROBLEM-ARGUMENT-LINKS");
        $sym19$DO_PROBLEM_ARGUMENT_LINKS = SubLObjectFactory.makeSymbol("DO-PROBLEM-ARGUMENT-LINKS");
        $sym20$PWHEN = SubLObjectFactory.makeSymbol("PWHEN");
        $sym21$PROBLEM_LINK_HAS_TYPE_ = SubLObjectFactory.makeSymbol("PROBLEM-LINK-HAS-TYPE?");
        $list22 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SUPPORTING-MAPPED-PROBLEM-VAR"), (SubLObject)SubLObjectFactory.makeSymbol("LINK"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("OPEN?"), (SubLObject)SubLObjectFactory.makeSymbol("DONE")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $list23 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("OPEN?"), (SubLObject)SubLObjectFactory.makeKeyword("DONE"));
        $kw24$OPEN_ = SubLObjectFactory.makeKeyword("OPEN?");
        $sym25$LINK_VAR = SubLObjectFactory.makeUninternedSymbol("LINK-VAR");
        $sym26$DO_LIST = SubLObjectFactory.makeSymbol("DO-LIST");
        $sym27$PROBLEM_LINK_SUPPORTING_MAPPED_PROBLEMS = SubLObjectFactory.makeSymbol("PROBLEM-LINK-SUPPORTING-MAPPED-PROBLEMS");
        $sym28$DO_PROBLEM_LINK_OPEN_MATCH_ = SubLObjectFactory.makeSymbol("DO-PROBLEM-LINK-OPEN-MATCH?");
        $sym29$DO_PROBLEM_LINK_SUPPORTING_MAPPED_PROBLEMS = SubLObjectFactory.makeSymbol("DO-PROBLEM-LINK-SUPPORTING-MAPPED-PROBLEMS");
        $list30 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SUPPORTING-MAPPED-PROBLEM-VAR"), (SubLObject)SubLObjectFactory.makeSymbol("INDEX-VAR"), (SubLObject)SubLObjectFactory.makeSymbol("LINK"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("OPEN?"), (SubLObject)SubLObjectFactory.makeSymbol("DONE")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $list31 = ConsesLow.list((SubLObject)inference_macros.ZERO_INTEGER);
        $sym32$CINC = SubLObjectFactory.makeSymbol("CINC");
        $list33 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SUPPORTING-PROBLEM-VAR"), (SubLObject)SubLObjectFactory.makeSymbol("VARIABLE-MAP-VAR"), (SubLObject)SubLObjectFactory.makeSymbol("LINK"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("OPEN?"), (SubLObject)SubLObjectFactory.makeSymbol("DONE")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym34$SUPPORTING_MAPPED_PROBLEM = SubLObjectFactory.makeUninternedSymbol("SUPPORTING-MAPPED-PROBLEM");
        $sym35$MAPPED_PROBLEM_PROBLEM = SubLObjectFactory.makeSymbol("MAPPED-PROBLEM-PROBLEM");
        $sym36$MAPPED_PROBLEM_VARIABLE_MAP = SubLObjectFactory.makeSymbol("MAPPED-PROBLEM-VARIABLE-MAP");
        $list37 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SIBLING-LINK-VAR"), (SubLObject)SubLObjectFactory.makeSymbol("LINK"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("DONE")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $list38 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("DONE"));
        $sym39$SUPPORTED_PROBLEM = SubLObjectFactory.makeUninternedSymbol("SUPPORTED-PROBLEM");
        $sym40$LINK_VAR = SubLObjectFactory.makeUninternedSymbol("LINK-VAR");
        $sym41$PROBLEM_LINK_SUPPORTED_PROBLEM = SubLObjectFactory.makeSymbol("PROBLEM-LINK-SUPPORTED-PROBLEM");
        $sym42$PUNLESS = SubLObjectFactory.makeSymbol("PUNLESS");
        $list43 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEPENDENT-LINK-VAR"), (SubLObject)SubLObjectFactory.makeSymbol("LINK"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("LINK-TYPE"), (SubLObject)SubLObjectFactory.makeSymbol("DONE")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $list44 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("LINK-TYPE"), (SubLObject)SubLObjectFactory.makeKeyword("DONE"));
        $kw45$LINK_TYPE = SubLObjectFactory.makeKeyword("LINK-TYPE");
        $sym46$SUPPORTED_PROBLEM = SubLObjectFactory.makeUninternedSymbol("SUPPORTED-PROBLEM");
        $sym47$DO_PROBLEM_DEPENDENT_LINKS = SubLObjectFactory.makeSymbol("DO-PROBLEM-DEPENDENT-LINKS");
        $list48 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ARGUMENT-LINK-VAR"), (SubLObject)SubLObjectFactory.makeSymbol("LINK"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("OPEN?"), (SubLObject)SubLObjectFactory.makeSymbol("LINK-TYPE"), (SubLObject)SubLObjectFactory.makeSymbol("DONE")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $list49 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("OPEN?"), (SubLObject)SubLObjectFactory.makeKeyword("LINK-TYPE"), (SubLObject)SubLObjectFactory.makeKeyword("DONE"));
        $sym50$SUPPORTING_PROBLEM = SubLObjectFactory.makeUninternedSymbol("SUPPORTING-PROBLEM");
        $sym51$VARIABLE_MAP = SubLObjectFactory.makeUninternedSymbol("VARIABLE-MAP");
        $sym52$DO_PROBLEM_LINK_SUPPORTING_PROBLEMS = SubLObjectFactory.makeSymbol("DO-PROBLEM-LINK-SUPPORTING-PROBLEMS");
        $sym53$IGNORE = SubLObjectFactory.makeSymbol("IGNORE");
        $list54 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PROOF-VAR"), (SubLObject)SubLObjectFactory.makeSymbol("LINK"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("PROOF-STATUS")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $list55 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("PROOF-STATUS"));
        $kw56$PROOF_STATUS = SubLObjectFactory.makeKeyword("PROOF-STATUS");
        $sym57$CDOLIST = SubLObjectFactory.makeSymbol("CDOLIST");
        $sym58$PROBLEM_LINK_PROOFS = SubLObjectFactory.makeSymbol("PROBLEM-LINK-PROOFS");
        $sym59$PROOF_HAS_STATUS_ = SubLObjectFactory.makeSymbol("PROOF-HAS-STATUS?");
        $list60 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RT-LINK-VAR"), (SubLObject)SubLObjectFactory.makeSymbol("JO-LINK"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("DONE")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym61$JO_LINK_VAR = SubLObjectFactory.makeUninternedSymbol("JO-LINK-VAR");
        $sym62$MOTIVATING_CONJUNCTION_PROBLEM = SubLObjectFactory.makeUninternedSymbol("MOTIVATING-CONJUNCTION-PROBLEM");
        $kw63$RESIDUAL_TRANSFORMATION = SubLObjectFactory.makeKeyword("RESIDUAL-TRANSFORMATION");
        $sym64$RESIDUAL_TRANSFORMATION_LINK_MOTIVATED_BY_JOIN_ORDERED_LINK_ = SubLObjectFactory.makeSymbol("RESIDUAL-TRANSFORMATION-LINK-MOTIVATED-BY-JOIN-ORDERED-LINK?");
        $list65 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RT-LINK-VAR"), (SubLObject)SubLObjectFactory.makeSymbol("T-LINK"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("DONE")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym66$T_LINK_VAR = SubLObjectFactory.makeUninternedSymbol("T-LINK-VAR");
        $sym67$JO_LINK_VAR = SubLObjectFactory.makeUninternedSymbol("JO-LINK-VAR");
        $sym68$DO_PROBLEM_LINK_DEPENDENT_LINKS = SubLObjectFactory.makeSymbol("DO-PROBLEM-LINK-DEPENDENT-LINKS");
        $kw69$JOIN_ORDERED = SubLObjectFactory.makeKeyword("JOIN-ORDERED");
        $sym70$DO_JOIN_ORDERED_LINK_MOTIVATED_RESIDUAL_TRANSFORMATION_LINKS = SubLObjectFactory.makeSymbol("DO-JOIN-ORDERED-LINK-MOTIVATED-RESIDUAL-TRANSFORMATION-LINKS");
        $sym71$RESIDUAL_TRANSFORMATION_LINK_MOTIVATED_BY_TRANSFORMATION_LINK_ = SubLObjectFactory.makeSymbol("RESIDUAL-TRANSFORMATION-LINK-MOTIVATED-BY-TRANSFORMATION-LINK?");
        $list72 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*CURRENT-FORWARD-PROBLEM-STORE*"), (SubLObject)inference_macros.NIL));
        $list73 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLEAR-CURRENT-FORWARD-PROBLEM-STORE")));
        $list74 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*TYPE-FILTER-FORWARD-DNF*"), (SubLObject)inference_macros.T));
        $list75 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RULES"), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym76$_FORWARD_INFERENCE_ALLOWED_RULES_ = SubLObjectFactory.makeSymbol("*FORWARD-INFERENCE-ALLOWED-RULES*");
        $sym77$WITH_FORWARD_INFERENCE_ALLOWED_RULES = SubLObjectFactory.makeSymbol("WITH-FORWARD-INFERENCE-ALLOWED-RULES");
        $kw78$ALL = SubLObjectFactory.makeKeyword("ALL");
        $sym79$_FORWARD_INFERENCE_FORBIDDEN_RULES_ = SubLObjectFactory.makeSymbol("*FORWARD-INFERENCE-FORBIDDEN-RULES*");
        $sym80$WITH_FORWARD_INFERENCE_FORBIDDEN_RULES = SubLObjectFactory.makeSymbol("WITH-FORWARD-INFERENCE-FORBIDDEN-RULES");
        $kw81$NONE = SubLObjectFactory.makeKeyword("NONE");
        $sym82$INFERENCE_P = SubLObjectFactory.makeSymbol("INFERENCE-P");
        $list83 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INFERENCE"), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym84$_CONTROLLING_INFERENCES_ = SubLObjectFactory.makeSymbol("*CONTROLLING-INFERENCES*");
        $sym85$CONS = SubLObjectFactory.makeSymbol("CONS");
        $list86 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*CONTROLLING-INFERENCES*"));
        $sym87$WITHIN_CONTROLLING_INFERENCE = SubLObjectFactory.makeSymbol("WITHIN-CONTROLLING-INFERENCE");
        $sym88$WITHIN_NO_CONTROLLING_STRATEGY = SubLObjectFactory.makeSymbol("WITHIN-NO-CONTROLLING-STRATEGY");
        $list89 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("STRATEGY"), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym90$_CONTROLLING_STRATEGY_ = SubLObjectFactory.makeSymbol("*CONTROLLING-STRATEGY*");
        $sym91$WITHIN_CONTROLLING_STRATEGY = SubLObjectFactory.makeSymbol("WITHIN-CONTROLLING-STRATEGY");
        $list92 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INFERENCE")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $kw93$CYC_MAINT = SubLObjectFactory.makeKeyword("CYC-MAINT");
        $sym94$GATHER_TICK_DATA_ = SubLObjectFactory.makeUninternedSymbol("GATHER-TICK-DATA?");
        $sym95$INITIAL_ARETE_TERMS_TOUCHED_COUNT = SubLObjectFactory.makeUninternedSymbol("INITIAL-ARETE-TERMS-TOUCHED-COUNT");
        $sym96$INITIAL_ARETE_ASSERTIONS_TOUCHED_COUNT = SubLObjectFactory.makeUninternedSymbol("INITIAL-ARETE-ASSERTIONS-TOUCHED-COUNT");
        $sym97$INITIAL_ARETE_LOG_LAST_KB_TOUCH_ = SubLObjectFactory.makeUninternedSymbol("INITIAL-ARETE-LOG-LAST-KB-TOUCH?");
        $sym98$INITIAL_ARETE_LOG_KB_TOUCH_COUNTS_ = SubLObjectFactory.makeUninternedSymbol("INITIAL-ARETE-LOG-KB-TOUCH-COUNTS?");
        $sym99$FINAL_ARETE_TERMS_TOUCHED_COUNT = SubLObjectFactory.makeUninternedSymbol("FINAL-ARETE-TERMS-TOUCHED-COUNT");
        $sym100$FINAL_ARETE_ASSERTIONS_TOUCHED_COUNT = SubLObjectFactory.makeUninternedSymbol("FINAL-ARETE-ASSERTIONS-TOUCHED-COUNT");
        $sym101$INFERENCE_GATHERS_TICK_INDEXED_PROGRESS_DATA_ = SubLObjectFactory.makeSymbol("INFERENCE-GATHERS-TICK-INDEXED-PROGRESS-DATA?");
        $list102 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*ARETE-TERMS-TOUCHED-COUNT*"));
        $list103 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*ARETE-ASSERTIONS-TOUCHED-COUNT*"));
        $list104 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*ARETE-LOG-LAST-KB-TOUCH?*"));
        $list105 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*ARETE-LOG-KB-TOUCH-COUNTS?*"));
        $sym106$_ARETE_TERMS_TOUCHED_COUNT_ = SubLObjectFactory.makeSymbol("*ARETE-TERMS-TOUCHED-COUNT*");
        $sym107$FIF = SubLObjectFactory.makeSymbol("FIF");
        $sym108$_ARETE_ASSERTIONS_TOUCHED_COUNT_ = SubLObjectFactory.makeSymbol("*ARETE-ASSERTIONS-TOUCHED-COUNT*");
        $sym109$_ARETE_LOG_LAST_KB_TOUCH__ = SubLObjectFactory.makeSymbol("*ARETE-LOG-LAST-KB-TOUCH?*");
        $sym110$_ARETE_LOG_KB_TOUCH_COUNTS__ = SubLObjectFactory.makeSymbol("*ARETE-LOG-KB-TOUCH-COUNTS?*");
        $sym111$_ = SubLObjectFactory.makeSymbol("+");
        $sym112$GATHER_TICK_DATA_ = SubLObjectFactory.makeUninternedSymbol("GATHER-TICK-DATA?");
        $sym113$INITIAL_ARETE_ASSERTIONS_TOUCHED = SubLObjectFactory.makeUninternedSymbol("INITIAL-ARETE-ASSERTIONS-TOUCHED");
        $sym114$INITIAL_ARETE_CONSTANTS_TOUCHED = SubLObjectFactory.makeUninternedSymbol("INITIAL-ARETE-CONSTANTS-TOUCHED");
        $sym115$INITIAL_ARETE_NARTS_TOUCHED = SubLObjectFactory.makeUninternedSymbol("INITIAL-ARETE-NARTS-TOUCHED");
        $sym116$INITIAL_ARETE_LOG_LAST_KB_TOUCH_ = SubLObjectFactory.makeUninternedSymbol("INITIAL-ARETE-LOG-LAST-KB-TOUCH?");
        $sym117$INITIAL_ARETE_LOG_KB_TOUCHES_ = SubLObjectFactory.makeUninternedSymbol("INITIAL-ARETE-LOG-KB-TOUCHES?");
        $sym118$FINAL_ARETE_ASSERTIONS_TOUCHED = SubLObjectFactory.makeUninternedSymbol("FINAL-ARETE-ASSERTIONS-TOUCHED");
        $sym119$FINAL_ARETE_CONSTANTS_TOUCHED = SubLObjectFactory.makeUninternedSymbol("FINAL-ARETE-CONSTANTS-TOUCHED");
        $sym120$FINAL_ARETE_NARTS_TOUCHED = SubLObjectFactory.makeUninternedSymbol("FINAL-ARETE-NARTS-TOUCHED");
        $sym121$INFERENCE_SHOULD_GATHER_TICK_INDEXED_PROGRESS_DATA_ = SubLObjectFactory.makeSymbol("INFERENCE-SHOULD-GATHER-TICK-INDEXED-PROGRESS-DATA?");
        $list122 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*ARETE-ASSERTIONS-TOUCHED*"));
        $list123 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*ARETE-CONSTANTS-TOUCHED*"));
        $list124 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*ARETE-NARTS-TOUCHED*"));
        $list125 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*ARETE-LOG-KB-TOUCHES?*"));
        $sym126$_ARETE_ASSERTIONS_TOUCHED_ = SubLObjectFactory.makeSymbol("*ARETE-ASSERTIONS-TOUCHED*");
        $list127 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-SET"));
        $sym128$_ARETE_CONSTANTS_TOUCHED_ = SubLObjectFactory.makeSymbol("*ARETE-CONSTANTS-TOUCHED*");
        $sym129$_ARETE_NARTS_TOUCHED_ = SubLObjectFactory.makeSymbol("*ARETE-NARTS-TOUCHED*");
        $sym130$_ARETE_LOG_KB_TOUCHES__ = SubLObjectFactory.makeSymbol("*ARETE-LOG-KB-TOUCHES?*");
        $sym131$SET_NMERGE = SubLObjectFactory.makeSymbol("SET-NMERGE");
        $list132 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DISJUNCT-VAR"), (SubLObject)SubLObjectFactory.makeSymbol("PATTERN")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym133$PATTERN_VAR = SubLObjectFactory.makeUninternedSymbol("PATTERN-VAR");
        $sym134$PIF = SubLObjectFactory.makeSymbol("PIF");
        $sym135$OR_PATTERN_P = SubLObjectFactory.makeSymbol("OR-PATTERN-P");
        $sym136$REST = SubLObjectFactory.makeSymbol("REST");
        $list137 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUERY-INFO-VAR"), (SubLObject)SubLObjectFactory.makeSymbol("FILENAME"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("ELEMENT-NUM"), (SubLObject)SubLObjectFactory.makeSymbol("DONE?")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $list138 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("ELEMENT-NUM"), (SubLObject)SubLObjectFactory.makeKeyword("DONE?"));
        $kw139$ELEMENT_NUM = SubLObjectFactory.makeKeyword("ELEMENT-NUM");
        $kw140$DONE_ = SubLObjectFactory.makeKeyword("DONE?");
        $sym141$DONE_VAR_ = SubLObjectFactory.makeUninternedSymbol("DONE-VAR?");
        $sym142$I = SubLObjectFactory.makeUninternedSymbol("I");
        $sym143$INPUT_STREAM = SubLObjectFactory.makeUninternedSymbol("INPUT-STREAM");
        $list144 = ConsesLow.list((SubLObject)inference_macros.NIL);
        $sym145$WITH_PRIVATE_BINARY_FILE = SubLObjectFactory.makeSymbol("WITH-PRIVATE-BINARY-FILE");
        $list146 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("INPUT"));
        $sym147$WITH_CFASL_COMMON_SYMBOLS = SubLObjectFactory.makeSymbol("WITH-CFASL-COMMON-SYMBOLS");
        $list148 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ASKED-QUERY-COMMON-SYMBOLS"));
        $sym149$UNTIL = SubLObjectFactory.makeSymbol("UNTIL");
        $sym150$LOAD_ASKED_QUERY_FROM_STREAM = SubLObjectFactory.makeSymbol("LOAD-ASKED-QUERY-FROM-STREAM");
        $sym151$PCOND = SubLObjectFactory.makeSymbol("PCOND");
        $kw152$EOF = SubLObjectFactory.makeKeyword("EOF");
        $list153 = ConsesLow.list((SubLObject)inference_macros.T);
        $sym154$STRINGP = SubLObjectFactory.makeSymbol("STRINGP");
        $sym155$WARN = SubLObjectFactory.makeSymbol("WARN");
        $str156$Read_invalid_query_info__s = SubLObjectFactory.makeString("Read invalid query info ~s");
        $list157 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUERY-INFO-VAR"), (SubLObject)SubLObjectFactory.makeSymbol("FILENAME-VAR"), (SubLObject)SubLObjectFactory.makeSymbol("DIRECTORY"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("DONE?")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $list158 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("DONE?"));
        $sym159$DO_DIRECTORY_CONTENTS = SubLObjectFactory.makeSymbol("DO-DIRECTORY-CONTENTS");
        $sym160$ASKED_QUERIES_FILENAME_ = SubLObjectFactory.makeSymbol("ASKED-QUERIES-FILENAME?");
        $sym161$DO_ASKED_QUERIES = SubLObjectFactory.makeSymbol("DO-ASKED-QUERIES");
        $list162 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("TRACE-LEVEL"), SubLObjectFactory.makeSymbol("CONTROL-STRING"), SubLObjectFactory.makeSymbol("&OPTIONAL"), SubLObjectFactory.makeSymbol("ARG1"), SubLObjectFactory.makeSymbol("ARG2"), SubLObjectFactory.makeSymbol("ARG3"), SubLObjectFactory.makeSymbol("ARG4"), SubLObjectFactory.makeSymbol("ARG5"), SubLObjectFactory.makeSymbol("ARG6"), SubLObjectFactory.makeSymbol("ARG7"), SubLObjectFactory.makeSymbol("ARG8") });
        $sym163$__ = SubLObjectFactory.makeSymbol(">=");
        $sym164$_INFERENCE_TRACE_LEVEL_ = SubLObjectFactory.makeSymbol("*INFERENCE-TRACE-LEVEL*");
        $sym165$FORCE_FORMAT = SubLObjectFactory.makeSymbol("FORCE-FORMAT");
    }
}

/*

	Total time: 368 ms
	
*/