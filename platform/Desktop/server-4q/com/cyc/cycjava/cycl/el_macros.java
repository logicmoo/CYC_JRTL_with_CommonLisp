package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class el_macros extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.el_macros";
    public static final String myFingerPrint = "73bd8e7f8016851e62e076ec451c07e0d9b0e2f5cebd7dc2fd1d33bfb749b99b";
    private static final SubLList $list0;
    private static final SubLSymbol $sym1$TEMPFORMULA;
    private static final SubLSymbol $sym2$CLET;
    private static final SubLSymbol $sym3$FIF;
    private static final SubLSymbol $sym4$SEQUENCE_VAR;
    private static final SubLSymbol $sym5$STRIP_SEQUENCE_VAR;
    private static final SubLSymbol $sym6$SEQVAR;
    private static final SubLSymbol $sym7$TEMPFORMULA;
    private static final SubLSymbol $sym8$APPEND;
    private static final SubLSymbol $sym9$LIST;
    private static final SubLList $list10;
    private static final SubLSymbol $sym11$SEQVAR;
    private static final SubLSymbol $sym12$TEMPFORMULA;
    private static final SubLList $list13;
    private static final SubLSymbol $sym14$PIF;
    private static final SubLSymbol $sym15$RET;
    private static final SubLSymbol $sym16$NADD_SEQUENCE_VAR_TO_END;
    private static final SubLSymbol $sym17$SEQVAR;
    private static final SubLSymbol $sym18$TEMPFORMULA;
    private static final SubLList $list19;
    private static final SubLList $list20;
    private static final SubLSymbol $kw21$ALLOW_OTHER_KEYS;
    private static final SubLSymbol $kw22$ARGNUM;
    private static final SubLSymbol $kw23$SEQVAR_HANDLING;
    private static final SubLSymbol $kw24$IGNORE;
    private static final SubLSymbol $kw25$DONE;
    private static final SubLList $list26;
    private static final SubLSymbol $sym27$DO_FORMULA_ARGS;
    private static final SubLSymbol $sym28$CINC;
    private static final SubLSymbol $sym29$ARGS;
    private static final SubLSymbol $sym30$FORMULA_ARGS;
    private static final SubLSymbol $sym31$DO_LIST;
    private static final SubLList $list32;
    private static final SubLList $list33;
    private static final SubLList $list34;
    private static final SubLList $list35;
    private static final SubLSymbol $sym36$DO_FORMULA_ARGS_NUMBERED;
    private static final SubLList $list37;
    private static final SubLSymbol $sym38$TERMS;
    private static final SubLSymbol $sym39$FORMULA_TERMS;
    private static final SubLSymbol $sym40$DO_LIST_INDEX;
    private static final SubLSymbol $sym41$TERMS;
    private static final SubLList $list42;
    private static final SubLSymbol $sym43$DO_FORMULA_TERMS;
    private static final SubLList $list44;
    private static final SubLList $list45;
    private static final SubLSymbol $sym46$DO_FORMULA_TERMS_NUMBERED;
    private static final SubLList $list47;
    private static final SubLSymbol $sym48$ARGS;
    private static final SubLSymbol $sym49$LITERAL_ARGS;
    private static final SubLList $list50;
    private static final SubLSymbol $sym51$ARGS;
    private static final SubLSymbol $sym52$LIST_VAR;
    private static final SubLSymbol $sym53$CDO;
    private static final SubLSymbol $sym54$CDR;
    private static final SubLSymbol $sym55$CAR;
    private static final SubLSymbol $sym56$_;
    private static final SubLSymbol $sym57$COR;
    private static final SubLSymbol $sym58$NULL;
    private static final SubLList $list59;
    private static final SubLSymbol $sym60$TERMS;
    private static final SubLSymbol $sym61$LITERAL_TERMS;
    private static final SubLList $list62;
    private static final SubLSymbol $sym63$TERMS;
    private static final SubLSymbol $sym64$LIST_VAR;
    private static final SubLList $list65;
    private static final SubLSymbol $sym66$STACK;
    private static final SubLSymbol $sym67$ENTRY;
    private static final SubLList $list68;
    private static final SubLSymbol $sym69$STACK_PUSH;
    private static final SubLSymbol $sym70$UNTIL;
    private static final SubLSymbol $sym71$STACK_EMPTY_P;
    private static final SubLSymbol $sym72$STACK_POP;
    private static final SubLSymbol $sym73$PWHEN;
    private static final SubLSymbol $sym74$LITERAL_;
    private static final SubLSymbol $sym75$PROGN;
    private static final SubLSymbol $sym76$CSETQ;
    private static final SubLSymbol $sym77$CDOLIST;
    private static final SubLSymbol $sym78$ARG;
    private static final SubLList $list79;
    private static final SubLSymbol $sym80$STACK;
    private static final SubLSymbol $sym81$ENTRY;
    private static final SubLList $list82;
    private static final SubLSymbol $sym83$ARG_STACK;
    private static final SubLSymbol $sym84$POS_STACK;
    private static final SubLSymbol $sym85$ENTRY;
    private static final SubLSymbol $sym86$POS_ENTRY;
    private static final SubLSymbol $sym87$ARG_NUM;
    private static final SubLSymbol $sym88$SNOC;
    private static final SubLList $list89;
    private static final SubLList $list90;
    private static final SubLSymbol $sym91$WITHOUT_WFF_SEMANTICS;
    private static final SubLList $list92;
    private static final SubLSymbol $sym93$WITHOUT_WFF_SEMANTICS_OR_ARITY;
    private static final SubLSymbol $sym94$WITHOUT_GRAMMAR_USING_KB;
    private static final SubLList $list95;
    private static final SubLList $list96;
    private static final SubLList $list97;
    private static final SubLList $list98;
    private static final SubLList $list99;
    private static final SubLList $list100;
    private static final SubLSymbol $sym101$NEG_LITS;
    private static final SubLList $list102;
    private static final SubLSymbol $sym103$DO_NEG_LITS;
    private static final SubLSymbol $sym104$POS_LITS;
    private static final SubLSymbol $sym105$DO_POS_LITS;
    private static final SubLList $list106;
    private static final SubLList $list107;
    private static final SubLSymbol $kw108$SENSE;
    private static final SubLSymbol $kw109$POS;
    private static final SubLSymbol $kw110$NEG;
    private static final SubLSymbol $sym111$DO_ALL_LITS_AS_ASENTS;
    private static final SubLSymbol $sym112$PCOND;
    private static final SubLSymbol $sym113$ERROR;
    private static final SubLString $str114$Invalid_sense__s;
    private static final SubLList $list115;
    private static final SubLSymbol $sym116$DO_NEG_LITS_NUMBERED;
    private static final SubLList $list117;
    private static final SubLSymbol $sym118$DO_POS_LITS_NUMBERED;
    private static final SubLList $list119;
    private static final SubLList $list120;
    private static final SubLSymbol $sym121$INDEX_VAR;
    private static final SubLSymbol $sym122$DO_LITERALS_NUMBERED;
    private static final SubLSymbol $sym123$IGNORE;
    private static final SubLList $list124;
    private static final SubLList $list125;
    private static final SubLSymbol $kw126$SENSE_VAR;
    private static final SubLSymbol $sym127$CLAUSE;
    private static final SubLList $list128;
    private static final SubLSymbol $sym129$CLAUSE;
    private static final SubLSymbol $sym130$CDOLIST_NUMBERED;
    private static final SubLList $list131;
    private static final SubLSymbol $sym132$CDESTRUCTURING_BIND;
    
    @SubLTranslatedFile.SubL(source = "cycl/el-macros.lisp", position = 791L)
    public static SubLObject ignoring_sequence_vars(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)el_macros.$list0);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject formula = (SubLObject)el_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)el_macros.$list0);
        formula = current.first();
        current = current.rest();
        if (el_macros.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            final SubLObject tempformula = (SubLObject)el_macros.$sym1$TEMPFORMULA;
            return (SubLObject)ConsesLow.listS((SubLObject)el_macros.$sym2$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(tempformula, (SubLObject)ConsesLow.list((SubLObject)el_macros.$sym3$FIF, (SubLObject)ConsesLow.list((SubLObject)el_macros.$sym4$SEQUENCE_VAR, formula), (SubLObject)ConsesLow.list((SubLObject)el_macros.$sym5$STRIP_SEQUENCE_VAR, formula), formula)), (SubLObject)ConsesLow.list(formula, tempformula)), ConsesLow.append(body, (SubLObject)el_macros.NIL));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)el_macros.$list0);
        return (SubLObject)el_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/el-macros.lisp", position = 1231L)
    public static SubLObject regularizing_sequence_vars(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)el_macros.$list0);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject formula = (SubLObject)el_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)el_macros.$list0);
        formula = current.first();
        current = current.rest();
        if (el_macros.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            final SubLObject seqvar = (SubLObject)el_macros.$sym6$SEQVAR;
            final SubLObject tempformula = (SubLObject)el_macros.$sym7$TEMPFORMULA;
            return (SubLObject)ConsesLow.listS((SubLObject)el_macros.$sym2$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(seqvar, (SubLObject)ConsesLow.list((SubLObject)el_macros.$sym4$SEQUENCE_VAR, formula)), (SubLObject)ConsesLow.list(tempformula, (SubLObject)ConsesLow.list((SubLObject)el_macros.$sym3$FIF, seqvar, (SubLObject)ConsesLow.list((SubLObject)el_macros.$sym8$APPEND, (SubLObject)ConsesLow.list((SubLObject)el_macros.$sym5$STRIP_SEQUENCE_VAR, formula), (SubLObject)ConsesLow.list((SubLObject)el_macros.$sym9$LIST, seqvar)), formula)), (SubLObject)ConsesLow.list(formula, tempformula)), ConsesLow.append(body, (SubLObject)el_macros.NIL));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)el_macros.$list0);
        return (SubLObject)el_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/el-macros.lisp", position = 1739L)
    public static SubLObject return_after_ignoring_sequence_vars(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)el_macros.$list10);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject formula = (SubLObject)el_macros.NIL;
        SubLObject result = (SubLObject)el_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)el_macros.$list10);
        formula = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)el_macros.$list10);
        result = current.first();
        current = current.rest();
        if (el_macros.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            final SubLObject seqvar = (SubLObject)el_macros.$sym11$SEQVAR;
            final SubLObject tempformula = (SubLObject)el_macros.$sym12$TEMPFORMULA;
            return (SubLObject)ConsesLow.listS((SubLObject)el_macros.$sym2$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(seqvar, (SubLObject)ConsesLow.list((SubLObject)el_macros.$sym4$SEQUENCE_VAR, formula)), (SubLObject)ConsesLow.list(tempformula, formula), (SubLObject)ConsesLow.list(formula, (SubLObject)ConsesLow.list((SubLObject)el_macros.$sym3$FIF, seqvar, (SubLObject)ConsesLow.list((SubLObject)el_macros.$sym5$STRIP_SEQUENCE_VAR, tempformula), tempformula)), reader.bq_cons(result, (SubLObject)el_macros.$list13)), ConsesLow.append(body, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)el_macros.$sym14$PIF, seqvar, (SubLObject)ConsesLow.list((SubLObject)el_macros.$sym15$RET, (SubLObject)ConsesLow.list((SubLObject)el_macros.$sym16$NADD_SEQUENCE_VAR_TO_END, seqvar, result)), (SubLObject)ConsesLow.list((SubLObject)el_macros.$sym15$RET, result)))));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)el_macros.$list10);
        return (SubLObject)el_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/el-macros.lisp", position = 2252L)
    public static SubLObject return_after_regularizing_sequence_vars(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)el_macros.$list10);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject formula = (SubLObject)el_macros.NIL;
        SubLObject result = (SubLObject)el_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)el_macros.$list10);
        formula = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)el_macros.$list10);
        result = current.first();
        current = current.rest();
        if (el_macros.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            final SubLObject seqvar = (SubLObject)el_macros.$sym17$SEQVAR;
            final SubLObject tempformula = (SubLObject)el_macros.$sym18$TEMPFORMULA;
            return (SubLObject)ConsesLow.listS((SubLObject)el_macros.$sym2$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(seqvar, (SubLObject)ConsesLow.list((SubLObject)el_macros.$sym4$SEQUENCE_VAR, formula)), (SubLObject)ConsesLow.list(tempformula, (SubLObject)ConsesLow.list((SubLObject)el_macros.$sym3$FIF, seqvar, (SubLObject)ConsesLow.list((SubLObject)el_macros.$sym8$APPEND, (SubLObject)ConsesLow.list((SubLObject)el_macros.$sym5$STRIP_SEQUENCE_VAR, formula), (SubLObject)ConsesLow.list((SubLObject)el_macros.$sym9$LIST, seqvar)), formula)), (SubLObject)ConsesLow.list(formula, tempformula), reader.bq_cons(result, (SubLObject)el_macros.$list13)), ConsesLow.append(body, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)el_macros.$sym14$PIF, seqvar, (SubLObject)ConsesLow.list((SubLObject)el_macros.$sym15$RET, (SubLObject)ConsesLow.list((SubLObject)el_macros.$sym16$NADD_SEQUENCE_VAR_TO_END, seqvar, (SubLObject)ConsesLow.list((SubLObject)el_macros.$sym5$STRIP_SEQUENCE_VAR, result))), (SubLObject)ConsesLow.list((SubLObject)el_macros.$sym15$RET, result)))));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)el_macros.$list10);
        return (SubLObject)el_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/el-macros.lisp", position = 2813L)
    public static SubLObject do_formula_args(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)el_macros.$list19);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject arg_var = (SubLObject)el_macros.NIL;
        SubLObject formula = (SubLObject)el_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)el_macros.$list19);
        arg_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)el_macros.$list19);
        formula = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = (SubLObject)el_macros.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)el_macros.NIL;
        SubLObject current_$1 = (SubLObject)el_macros.NIL;
        while (el_macros.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)el_macros.$list19);
            current_$1 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)el_macros.$list19);
            if (el_macros.NIL == conses_high.member(current_$1, (SubLObject)el_macros.$list20, (SubLObject)el_macros.UNPROVIDED, (SubLObject)el_macros.UNPROVIDED)) {
                bad = (SubLObject)el_macros.T;
            }
            if (current_$1 == el_macros.$kw21$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (el_macros.NIL != bad && el_macros.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)el_macros.$list19);
        }
        final SubLObject argnum_tail = cdestructuring_bind.property_list_member((SubLObject)el_macros.$kw22$ARGNUM, current);
        final SubLObject argnum = (SubLObject)((el_macros.NIL != argnum_tail) ? conses_high.cadr(argnum_tail) : el_macros.NIL);
        final SubLObject seqvar_handling_tail = cdestructuring_bind.property_list_member((SubLObject)el_macros.$kw23$SEQVAR_HANDLING, current);
        final SubLObject seqvar_handling = (SubLObject)((el_macros.NIL != seqvar_handling_tail) ? conses_high.cadr(seqvar_handling_tail) : el_macros.$kw24$IGNORE);
        final SubLObject done_tail = cdestructuring_bind.property_list_member((SubLObject)el_macros.$kw25$DONE, current);
        final SubLObject done = (SubLObject)((el_macros.NIL != done_tail) ? conses_high.cadr(done_tail) : el_macros.NIL);
        final SubLObject body;
        current = (body = temp);
        if (el_macros.NIL != argnum) {
            return (SubLObject)ConsesLow.list((SubLObject)el_macros.$sym2$CLET, (SubLObject)ConsesLow.list(reader.bq_cons(argnum, (SubLObject)el_macros.$list26)), (SubLObject)ConsesLow.listS((SubLObject)el_macros.$sym27$DO_FORMULA_ARGS, (SubLObject)ConsesLow.list(arg_var, formula, (SubLObject)el_macros.$kw23$SEQVAR_HANDLING, seqvar_handling, (SubLObject)el_macros.$kw25$DONE, done), (SubLObject)ConsesLow.list((SubLObject)el_macros.$sym28$CINC, argnum), ConsesLow.append(body, (SubLObject)el_macros.NIL)));
        }
        final SubLObject args = (SubLObject)el_macros.$sym29$ARGS;
        return (SubLObject)ConsesLow.list((SubLObject)el_macros.$sym2$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(args, (SubLObject)ConsesLow.list((SubLObject)el_macros.$sym30$FORMULA_ARGS, formula, seqvar_handling))), (SubLObject)ConsesLow.listS((SubLObject)el_macros.$sym31$DO_LIST, (SubLObject)ConsesLow.list(arg_var, args, (SubLObject)el_macros.$kw25$DONE, done), ConsesLow.append(body, (SubLObject)el_macros.NIL)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/el-macros.lisp", position = 3535L)
    public static SubLObject do_formula_args_numbered(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)el_macros.$list32);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject arg_var = (SubLObject)el_macros.NIL;
        SubLObject argnum_var = (SubLObject)el_macros.NIL;
        SubLObject formula = (SubLObject)el_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)el_macros.$list32);
        arg_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)el_macros.$list32);
        argnum_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)el_macros.$list32);
        formula = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = (SubLObject)el_macros.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)el_macros.NIL;
        SubLObject current_$2 = (SubLObject)el_macros.NIL;
        while (el_macros.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)el_macros.$list32);
            current_$2 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)el_macros.$list32);
            if (el_macros.NIL == conses_high.member(current_$2, (SubLObject)el_macros.$list33, (SubLObject)el_macros.UNPROVIDED, (SubLObject)el_macros.UNPROVIDED)) {
                bad = (SubLObject)el_macros.T;
            }
            if (current_$2 == el_macros.$kw21$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (el_macros.NIL != bad && el_macros.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)el_macros.$list32);
        }
        final SubLObject seqvar_handling_tail = cdestructuring_bind.property_list_member((SubLObject)el_macros.$kw23$SEQVAR_HANDLING, current);
        final SubLObject seqvar_handling = (SubLObject)((el_macros.NIL != seqvar_handling_tail) ? conses_high.cadr(seqvar_handling_tail) : el_macros.$kw24$IGNORE);
        final SubLObject done_tail = cdestructuring_bind.property_list_member((SubLObject)el_macros.$kw25$DONE, current);
        final SubLObject done = (SubLObject)((el_macros.NIL != done_tail) ? conses_high.cadr(done_tail) : el_macros.NIL);
        final SubLObject body;
        current = (body = temp);
        return (SubLObject)ConsesLow.listS((SubLObject)el_macros.$sym27$DO_FORMULA_ARGS, (SubLObject)ConsesLow.list(arg_var, formula, (SubLObject)el_macros.$kw22$ARGNUM, argnum_var, (SubLObject)el_macros.$kw23$SEQVAR_HANDLING, seqvar_handling, (SubLObject)el_macros.$kw25$DONE, done), ConsesLow.append(body, (SubLObject)el_macros.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/el-macros.lisp", position = 3970L)
    public static SubLObject some_el_formula_args(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)el_macros.$list34);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject arg_var = (SubLObject)el_macros.NIL;
        SubLObject formula = (SubLObject)el_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)el_macros.$list34);
        arg_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)el_macros.$list34);
        formula = current.first();
        current = current.rest();
        final SubLObject done_var = (SubLObject)(current.isCons() ? current.first() : el_macros.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)el_macros.$list34);
        current = current.rest();
        final SubLObject seqvar_handling = (SubLObject)(current.isCons() ? current.first() : el_macros.$kw24$IGNORE);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)el_macros.$list34);
        current = current.rest();
        if (el_macros.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            return (SubLObject)ConsesLow.listS((SubLObject)el_macros.$sym27$DO_FORMULA_ARGS, (SubLObject)ConsesLow.list(arg_var, formula, (SubLObject)el_macros.$kw23$SEQVAR_HANDLING, seqvar_handling, (SubLObject)el_macros.$kw25$DONE, done_var), ConsesLow.append(body, (SubLObject)el_macros.NIL));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)el_macros.$list34);
        return (SubLObject)el_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/el-macros.lisp", position = 4361L)
    public static SubLObject some_el_formula_args_numbered(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)el_macros.$list35);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject arg_var = (SubLObject)el_macros.NIL;
        SubLObject argnum_var = (SubLObject)el_macros.NIL;
        SubLObject formula = (SubLObject)el_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)el_macros.$list35);
        arg_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)el_macros.$list35);
        argnum_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)el_macros.$list35);
        formula = current.first();
        current = current.rest();
        final SubLObject done_var = (SubLObject)(current.isCons() ? current.first() : el_macros.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)el_macros.$list35);
        current = current.rest();
        final SubLObject seqvar_handling = (SubLObject)(current.isCons() ? current.first() : el_macros.$kw24$IGNORE);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)el_macros.$list35);
        current = current.rest();
        if (el_macros.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            return (SubLObject)ConsesLow.listS((SubLObject)el_macros.$sym36$DO_FORMULA_ARGS_NUMBERED, (SubLObject)ConsesLow.list(arg_var, argnum_var, formula, (SubLObject)el_macros.$kw23$SEQVAR_HANDLING, seqvar_handling, (SubLObject)el_macros.$kw25$DONE, done_var), ConsesLow.append(body, (SubLObject)el_macros.NIL));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)el_macros.$list35);
        return (SubLObject)el_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/el-macros.lisp", position = 4876L)
    public static SubLObject do_formula_terms(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)el_macros.$list37);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject term_var = (SubLObject)el_macros.NIL;
        SubLObject formula = (SubLObject)el_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)el_macros.$list37);
        term_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)el_macros.$list37);
        formula = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = (SubLObject)el_macros.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)el_macros.NIL;
        SubLObject current_$3 = (SubLObject)el_macros.NIL;
        while (el_macros.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)el_macros.$list37);
            current_$3 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)el_macros.$list37);
            if (el_macros.NIL == conses_high.member(current_$3, (SubLObject)el_macros.$list20, (SubLObject)el_macros.UNPROVIDED, (SubLObject)el_macros.UNPROVIDED)) {
                bad = (SubLObject)el_macros.T;
            }
            if (current_$3 == el_macros.$kw21$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (el_macros.NIL != bad && el_macros.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)el_macros.$list37);
        }
        final SubLObject argnum_tail = cdestructuring_bind.property_list_member((SubLObject)el_macros.$kw22$ARGNUM, current);
        final SubLObject argnum = (SubLObject)((el_macros.NIL != argnum_tail) ? conses_high.cadr(argnum_tail) : el_macros.NIL);
        final SubLObject seqvar_handling_tail = cdestructuring_bind.property_list_member((SubLObject)el_macros.$kw23$SEQVAR_HANDLING, current);
        final SubLObject seqvar_handling = (SubLObject)((el_macros.NIL != seqvar_handling_tail) ? conses_high.cadr(seqvar_handling_tail) : el_macros.$kw24$IGNORE);
        final SubLObject done_tail = cdestructuring_bind.property_list_member((SubLObject)el_macros.$kw25$DONE, current);
        final SubLObject done = (SubLObject)((el_macros.NIL != done_tail) ? conses_high.cadr(done_tail) : el_macros.NIL);
        final SubLObject body;
        current = (body = temp);
        if (el_macros.NIL != argnum) {
            final SubLObject terms = (SubLObject)el_macros.$sym38$TERMS;
            return (SubLObject)ConsesLow.list((SubLObject)el_macros.$sym2$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(terms, (SubLObject)ConsesLow.list((SubLObject)el_macros.$sym39$FORMULA_TERMS, formula, seqvar_handling))), (SubLObject)ConsesLow.listS((SubLObject)el_macros.$sym40$DO_LIST_INDEX, (SubLObject)ConsesLow.list(argnum, term_var, terms, (SubLObject)el_macros.$kw25$DONE, done), ConsesLow.append(body, (SubLObject)el_macros.NIL)));
        }
        final SubLObject terms = (SubLObject)el_macros.$sym41$TERMS;
        return (SubLObject)ConsesLow.list((SubLObject)el_macros.$sym2$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(terms, (SubLObject)ConsesLow.list((SubLObject)el_macros.$sym39$FORMULA_TERMS, formula, seqvar_handling))), (SubLObject)ConsesLow.listS((SubLObject)el_macros.$sym31$DO_LIST, (SubLObject)ConsesLow.list(term_var, terms, (SubLObject)el_macros.$kw25$DONE, done), ConsesLow.append(body, (SubLObject)el_macros.NIL)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/el-macros.lisp", position = 5601L)
    public static SubLObject do_formula_terms_numbered(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)el_macros.$list42);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject term_var = (SubLObject)el_macros.NIL;
        SubLObject argnum_var = (SubLObject)el_macros.NIL;
        SubLObject formula = (SubLObject)el_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)el_macros.$list42);
        term_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)el_macros.$list42);
        argnum_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)el_macros.$list42);
        formula = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = (SubLObject)el_macros.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)el_macros.NIL;
        SubLObject current_$4 = (SubLObject)el_macros.NIL;
        while (el_macros.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)el_macros.$list42);
            current_$4 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)el_macros.$list42);
            if (el_macros.NIL == conses_high.member(current_$4, (SubLObject)el_macros.$list33, (SubLObject)el_macros.UNPROVIDED, (SubLObject)el_macros.UNPROVIDED)) {
                bad = (SubLObject)el_macros.T;
            }
            if (current_$4 == el_macros.$kw21$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (el_macros.NIL != bad && el_macros.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)el_macros.$list42);
        }
        final SubLObject seqvar_handling_tail = cdestructuring_bind.property_list_member((SubLObject)el_macros.$kw23$SEQVAR_HANDLING, current);
        final SubLObject seqvar_handling = (SubLObject)((el_macros.NIL != seqvar_handling_tail) ? conses_high.cadr(seqvar_handling_tail) : el_macros.$kw24$IGNORE);
        final SubLObject done_tail = cdestructuring_bind.property_list_member((SubLObject)el_macros.$kw25$DONE, current);
        final SubLObject done = (SubLObject)((el_macros.NIL != done_tail) ? conses_high.cadr(done_tail) : el_macros.NIL);
        final SubLObject body;
        current = (body = temp);
        return (SubLObject)ConsesLow.listS((SubLObject)el_macros.$sym43$DO_FORMULA_TERMS, (SubLObject)ConsesLow.list(term_var, formula, (SubLObject)el_macros.$kw22$ARGNUM, argnum_var, (SubLObject)el_macros.$kw23$SEQVAR_HANDLING, seqvar_handling, (SubLObject)el_macros.$kw25$DONE, done), ConsesLow.append(body, (SubLObject)el_macros.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/el-macros.lisp", position = 6047L)
    public static SubLObject some_el_formula_terms(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)el_macros.$list44);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject term_var = (SubLObject)el_macros.NIL;
        SubLObject formula = (SubLObject)el_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)el_macros.$list44);
        term_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)el_macros.$list44);
        formula = current.first();
        current = current.rest();
        final SubLObject done_var = (SubLObject)(current.isCons() ? current.first() : el_macros.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)el_macros.$list44);
        current = current.rest();
        final SubLObject seqvar_handling = (SubLObject)(current.isCons() ? current.first() : el_macros.$kw24$IGNORE);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)el_macros.$list44);
        current = current.rest();
        if (el_macros.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            return (SubLObject)ConsesLow.listS((SubLObject)el_macros.$sym43$DO_FORMULA_TERMS, (SubLObject)ConsesLow.list(term_var, formula, (SubLObject)el_macros.$kw23$SEQVAR_HANDLING, seqvar_handling, (SubLObject)el_macros.$kw25$DONE, done_var), ConsesLow.append(body, (SubLObject)el_macros.NIL));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)el_macros.$list44);
        return (SubLObject)el_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/el-macros.lisp", position = 6450L)
    public static SubLObject some_el_formula_terms_numbered(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)el_macros.$list45);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject term_var = (SubLObject)el_macros.NIL;
        SubLObject argnum_var = (SubLObject)el_macros.NIL;
        SubLObject formula = (SubLObject)el_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)el_macros.$list45);
        term_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)el_macros.$list45);
        argnum_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)el_macros.$list45);
        formula = current.first();
        current = current.rest();
        final SubLObject done_var = (SubLObject)(current.isCons() ? current.first() : el_macros.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)el_macros.$list45);
        current = current.rest();
        final SubLObject seqvar_handling = (SubLObject)(current.isCons() ? current.first() : el_macros.$kw24$IGNORE);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)el_macros.$list45);
        current = current.rest();
        if (el_macros.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            return (SubLObject)ConsesLow.listS((SubLObject)el_macros.$sym46$DO_FORMULA_TERMS_NUMBERED, (SubLObject)ConsesLow.list(term_var, argnum_var, formula, (SubLObject)el_macros.$kw23$SEQVAR_HANDLING, seqvar_handling, (SubLObject)el_macros.$kw25$DONE, done_var), ConsesLow.append(body, (SubLObject)el_macros.NIL));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)el_macros.$list45);
        return (SubLObject)el_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/el-macros.lisp", position = 6978L)
    public static SubLObject some_el_literal_args(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)el_macros.$list47);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject arg_var = (SubLObject)el_macros.NIL;
        SubLObject literal = (SubLObject)el_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)el_macros.$list47);
        arg_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)el_macros.$list47);
        literal = current.first();
        current = current.rest();
        final SubLObject done_var = (SubLObject)(current.isCons() ? current.first() : el_macros.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)el_macros.$list47);
        current = current.rest();
        final SubLObject seqvar_handling = (SubLObject)(current.isCons() ? current.first() : el_macros.$kw24$IGNORE);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)el_macros.$list47);
        current = current.rest();
        if (el_macros.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            final SubLObject args = (SubLObject)el_macros.$sym48$ARGS;
            return (SubLObject)ConsesLow.list((SubLObject)el_macros.$sym2$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(args, (SubLObject)ConsesLow.list((SubLObject)el_macros.$sym49$LITERAL_ARGS, literal, seqvar_handling))), (SubLObject)ConsesLow.listS((SubLObject)el_macros.$sym31$DO_LIST, (SubLObject)ConsesLow.list(arg_var, args, (SubLObject)el_macros.$kw25$DONE, done_var), ConsesLow.append(body, (SubLObject)el_macros.NIL)));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)el_macros.$list47);
        return (SubLObject)el_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/el-macros.lisp", position = 7423L)
    public static SubLObject some_el_literal_args_numbered(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)el_macros.$list50);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject arg_var = (SubLObject)el_macros.NIL;
        SubLObject argnum_var = (SubLObject)el_macros.NIL;
        SubLObject literal = (SubLObject)el_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)el_macros.$list50);
        arg_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)el_macros.$list50);
        argnum_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)el_macros.$list50);
        literal = current.first();
        current = current.rest();
        final SubLObject done_var = (SubLObject)(current.isCons() ? current.first() : el_macros.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)el_macros.$list50);
        current = current.rest();
        final SubLObject seqvar_handling = (SubLObject)(current.isCons() ? current.first() : el_macros.$kw24$IGNORE);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)el_macros.$list50);
        current = current.rest();
        if (el_macros.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            final SubLObject args = (SubLObject)el_macros.$sym51$ARGS;
            final SubLObject list_var = (SubLObject)el_macros.$sym52$LIST_VAR;
            return (SubLObject)ConsesLow.list((SubLObject)el_macros.$sym2$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(args, (SubLObject)ConsesLow.list((SubLObject)el_macros.$sym49$LITERAL_ARGS, literal, seqvar_handling))), (SubLObject)ConsesLow.listS((SubLObject)el_macros.$sym53$CDO, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(list_var, args, (SubLObject)ConsesLow.list((SubLObject)el_macros.$sym54$CDR, list_var)), (SubLObject)ConsesLow.list(arg_var, (SubLObject)ConsesLow.list((SubLObject)el_macros.$sym55$CAR, list_var), (SubLObject)ConsesLow.list((SubLObject)el_macros.$sym55$CAR, list_var)), (SubLObject)ConsesLow.list(argnum_var, (SubLObject)el_macros.ONE_INTEGER, (SubLObject)ConsesLow.list((SubLObject)el_macros.$sym56$_, (SubLObject)el_macros.ONE_INTEGER, argnum_var))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)el_macros.$sym57$COR, done_var, (SubLObject)ConsesLow.list((SubLObject)el_macros.$sym58$NULL, list_var))), ConsesLow.append(body, (SubLObject)el_macros.NIL)));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)el_macros.$list50);
        return (SubLObject)el_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/el-macros.lisp", position = 8016L)
    public static SubLObject some_el_literal_terms(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)el_macros.$list59);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject term_var = (SubLObject)el_macros.NIL;
        SubLObject literal = (SubLObject)el_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)el_macros.$list59);
        term_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)el_macros.$list59);
        literal = current.first();
        current = current.rest();
        final SubLObject done_var = (SubLObject)(current.isCons() ? current.first() : el_macros.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)el_macros.$list59);
        current = current.rest();
        final SubLObject seqvar_handling = (SubLObject)(current.isCons() ? current.first() : el_macros.$kw24$IGNORE);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)el_macros.$list59);
        current = current.rest();
        if (el_macros.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            final SubLObject terms = (SubLObject)el_macros.$sym60$TERMS;
            return (SubLObject)ConsesLow.list((SubLObject)el_macros.$sym2$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(terms, (SubLObject)ConsesLow.list((SubLObject)el_macros.$sym61$LITERAL_TERMS, literal, seqvar_handling))), (SubLObject)ConsesLow.listS((SubLObject)el_macros.$sym31$DO_LIST, (SubLObject)ConsesLow.list(term_var, terms, (SubLObject)el_macros.$kw25$DONE, done_var), ConsesLow.append(body, (SubLObject)el_macros.NIL)));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)el_macros.$list59);
        return (SubLObject)el_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/el-macros.lisp", position = 8477L)
    public static SubLObject some_el_literal_terms_numbered(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)el_macros.$list62);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject term_var = (SubLObject)el_macros.NIL;
        SubLObject argnum_var = (SubLObject)el_macros.NIL;
        SubLObject literal = (SubLObject)el_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)el_macros.$list62);
        term_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)el_macros.$list62);
        argnum_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)el_macros.$list62);
        literal = current.first();
        current = current.rest();
        final SubLObject done_var = (SubLObject)(current.isCons() ? current.first() : el_macros.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)el_macros.$list62);
        current = current.rest();
        final SubLObject seqvar_handling = (SubLObject)(current.isCons() ? current.first() : el_macros.$kw24$IGNORE);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)el_macros.$list62);
        current = current.rest();
        if (el_macros.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            final SubLObject terms = (SubLObject)el_macros.$sym63$TERMS;
            final SubLObject list_var = (SubLObject)el_macros.$sym64$LIST_VAR;
            return (SubLObject)ConsesLow.list((SubLObject)el_macros.$sym2$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(terms, (SubLObject)ConsesLow.list((SubLObject)el_macros.$sym61$LITERAL_TERMS, literal, seqvar_handling))), (SubLObject)ConsesLow.listS((SubLObject)el_macros.$sym53$CDO, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(list_var, terms, (SubLObject)ConsesLow.list((SubLObject)el_macros.$sym54$CDR, list_var)), (SubLObject)ConsesLow.list(term_var, (SubLObject)ConsesLow.list((SubLObject)el_macros.$sym55$CAR, list_var), (SubLObject)ConsesLow.list((SubLObject)el_macros.$sym55$CAR, list_var)), (SubLObject)ConsesLow.list(argnum_var, (SubLObject)el_macros.ZERO_INTEGER, (SubLObject)ConsesLow.list((SubLObject)el_macros.$sym56$_, (SubLObject)el_macros.ONE_INTEGER, argnum_var))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)el_macros.$sym57$COR, done_var, (SubLObject)ConsesLow.list((SubLObject)el_macros.$sym58$NULL, list_var))), ConsesLow.append(body, (SubLObject)el_macros.NIL)));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)el_macros.$list62);
        return (SubLObject)el_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/el-macros.lisp", position = 9084L)
    public static SubLObject do_el_formula_literals(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)el_macros.$list65);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject literal = (SubLObject)el_macros.NIL;
        SubLObject formula = (SubLObject)el_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)el_macros.$list65);
        literal = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)el_macros.$list65);
        formula = current.first();
        current = current.rest();
        if (el_macros.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            final SubLObject stack = (SubLObject)el_macros.$sym66$STACK;
            final SubLObject entry = (SubLObject)el_macros.$sym67$ENTRY;
            return (SubLObject)ConsesLow.list((SubLObject)el_macros.$sym2$CLET, (SubLObject)ConsesLow.list(reader.bq_cons(stack, (SubLObject)el_macros.$list68), literal), (SubLObject)ConsesLow.list((SubLObject)el_macros.$sym69$STACK_PUSH, formula, stack), (SubLObject)ConsesLow.list((SubLObject)el_macros.$sym70$UNTIL, (SubLObject)ConsesLow.list((SubLObject)el_macros.$sym71$STACK_EMPTY_P, stack), (SubLObject)ConsesLow.list((SubLObject)el_macros.$sym2$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(entry, (SubLObject)ConsesLow.list((SubLObject)el_macros.$sym72$STACK_POP, stack))), (SubLObject)ConsesLow.list((SubLObject)el_macros.$sym73$PWHEN, (SubLObject)ConsesLow.list((SubLObject)el_macros.$sym74$LITERAL_, entry), (SubLObject)ConsesLow.listS((SubLObject)el_macros.$sym75$PROGN, (SubLObject)ConsesLow.list((SubLObject)el_macros.$sym76$CSETQ, literal, entry), ConsesLow.append(body, (SubLObject)el_macros.NIL))), (SubLObject)ConsesLow.list((SubLObject)el_macros.$sym77$CDOLIST, (SubLObject)ConsesLow.list((SubLObject)el_macros.$sym78$ARG, (SubLObject)ConsesLow.list((SubLObject)el_macros.$sym30$FORMULA_ARGS, entry)), (SubLObject)ConsesLow.list((SubLObject)el_macros.$sym69$STACK_PUSH, (SubLObject)el_macros.$sym78$ARG, stack)))));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)el_macros.$list65);
        return (SubLObject)el_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/el-macros.lisp", position = 9643L)
    public static SubLObject do_el_formula_args_recursive(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)el_macros.$list79);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject arg = (SubLObject)el_macros.NIL;
        SubLObject formula = (SubLObject)el_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)el_macros.$list79);
        arg = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)el_macros.$list79);
        formula = current.first();
        current = current.rest();
        if (el_macros.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            final SubLObject stack = (SubLObject)el_macros.$sym80$STACK;
            final SubLObject entry = (SubLObject)el_macros.$sym81$ENTRY;
            return (SubLObject)ConsesLow.list((SubLObject)el_macros.$sym2$CLET, (SubLObject)ConsesLow.list(reader.bq_cons(stack, (SubLObject)el_macros.$list68), arg), (SubLObject)ConsesLow.list((SubLObject)el_macros.$sym69$STACK_PUSH, formula, stack), (SubLObject)ConsesLow.list((SubLObject)el_macros.$sym70$UNTIL, (SubLObject)ConsesLow.list((SubLObject)el_macros.$sym71$STACK_EMPTY_P, stack), (SubLObject)ConsesLow.list((SubLObject)el_macros.$sym2$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(entry, (SubLObject)ConsesLow.list((SubLObject)el_macros.$sym72$STACK_POP, stack))), (SubLObject)ConsesLow.listS((SubLObject)el_macros.$sym75$PROGN, (SubLObject)ConsesLow.list((SubLObject)el_macros.$sym76$CSETQ, arg, entry), ConsesLow.append(body, (SubLObject)el_macros.NIL)), (SubLObject)ConsesLow.list((SubLObject)el_macros.$sym77$CDOLIST, (SubLObject)ConsesLow.list((SubLObject)el_macros.$sym78$ARG, (SubLObject)ConsesLow.list((SubLObject)el_macros.$sym30$FORMULA_ARGS, entry)), (SubLObject)ConsesLow.list((SubLObject)el_macros.$sym69$STACK_PUSH, (SubLObject)el_macros.$sym78$ARG, stack)))));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)el_macros.$list79);
        return (SubLObject)el_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/el-macros.lisp", position = 10191L)
    public static SubLObject do_formula_terms_and_positions_recursive(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)el_macros.$list82);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject arg = (SubLObject)el_macros.NIL;
        SubLObject argpos = (SubLObject)el_macros.NIL;
        SubLObject formula = (SubLObject)el_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)el_macros.$list82);
        arg = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)el_macros.$list82);
        argpos = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)el_macros.$list82);
        formula = current.first();
        current = current.rest();
        if (el_macros.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            final SubLObject arg_stack = (SubLObject)el_macros.$sym83$ARG_STACK;
            final SubLObject pos_stack = (SubLObject)el_macros.$sym84$POS_STACK;
            final SubLObject entry = (SubLObject)el_macros.$sym85$ENTRY;
            final SubLObject pos_entry = (SubLObject)el_macros.$sym86$POS_ENTRY;
            final SubLObject arg_num = (SubLObject)el_macros.$sym87$ARG_NUM;
            return (SubLObject)ConsesLow.list((SubLObject)el_macros.$sym2$CLET, (SubLObject)ConsesLow.list(reader.bq_cons(arg_stack, (SubLObject)el_macros.$list68), reader.bq_cons(pos_stack, (SubLObject)el_macros.$list68), arg, argpos), (SubLObject)ConsesLow.list((SubLObject)el_macros.$sym69$STACK_PUSH, formula, arg_stack), (SubLObject)ConsesLow.list((SubLObject)el_macros.$sym69$STACK_PUSH, argpos, pos_stack), (SubLObject)ConsesLow.list((SubLObject)el_macros.$sym70$UNTIL, (SubLObject)ConsesLow.list((SubLObject)el_macros.$sym71$STACK_EMPTY_P, arg_stack), (SubLObject)ConsesLow.list((SubLObject)el_macros.$sym2$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(entry, (SubLObject)ConsesLow.list((SubLObject)el_macros.$sym72$STACK_POP, arg_stack)), (SubLObject)ConsesLow.list(pos_entry, (SubLObject)ConsesLow.list((SubLObject)el_macros.$sym72$STACK_POP, pos_stack))), (SubLObject)ConsesLow.listS((SubLObject)el_macros.$sym75$PROGN, (SubLObject)ConsesLow.list((SubLObject)el_macros.$sym76$CSETQ, arg, entry), (SubLObject)ConsesLow.list((SubLObject)el_macros.$sym76$CSETQ, argpos, pos_entry), ConsesLow.append(body, (SubLObject)el_macros.NIL)), (SubLObject)ConsesLow.list((SubLObject)el_macros.$sym46$DO_FORMULA_TERMS_NUMBERED, (SubLObject)ConsesLow.list((SubLObject)el_macros.$sym78$ARG, arg_num, entry), (SubLObject)ConsesLow.list((SubLObject)el_macros.$sym69$STACK_PUSH, (SubLObject)el_macros.$sym78$ARG, arg_stack), (SubLObject)ConsesLow.list((SubLObject)el_macros.$sym69$STACK_PUSH, (SubLObject)ConsesLow.list((SubLObject)el_macros.$sym88$SNOC, arg_num, argpos), pos_stack)))));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)el_macros.$list82);
        return (SubLObject)el_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/el-macros.lisp", position = 11067L)
    public static SubLObject without_wff_semantics(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return (SubLObject)ConsesLow.listS((SubLObject)el_macros.$sym2$CLET, (SubLObject)el_macros.$list89, ConsesLow.append(body, (SubLObject)el_macros.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/el-macros.lisp", position = 11659L)
    public static SubLObject with_wff_semantics(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return (SubLObject)ConsesLow.listS((SubLObject)el_macros.$sym2$CLET, (SubLObject)el_macros.$list90, ConsesLow.append(body, (SubLObject)el_macros.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/el-macros.lisp", position = 11877L)
    public static SubLObject without_wff_semantics_or_arity(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return (SubLObject)ConsesLow.list((SubLObject)el_macros.$sym91$WITHOUT_WFF_SEMANTICS, (SubLObject)ConsesLow.listS((SubLObject)el_macros.$sym2$CLET, (SubLObject)el_macros.$list92, ConsesLow.append(body, (SubLObject)el_macros.NIL)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/el-macros.lisp", position = 12109L)
    public static SubLObject without_wff_semantics_or_arity_or_kb(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return (SubLObject)ConsesLow.list((SubLObject)el_macros.$sym93$WITHOUT_WFF_SEMANTICS_OR_ARITY, reader.bq_cons((SubLObject)el_macros.$sym94$WITHOUT_GRAMMAR_USING_KB, ConsesLow.append(body, (SubLObject)el_macros.NIL)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/el-macros.lisp", position = 12422L)
    public static SubLObject with_el_var_namespace(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return (SubLObject)ConsesLow.listS((SubLObject)el_macros.$sym2$CLET, (SubLObject)el_macros.$list95, ConsesLow.append(body, (SubLObject)el_macros.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/el-macros.lisp", position = 12827L)
    public static SubLObject with_clean_el_var_namespace(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return (SubLObject)ConsesLow.listS((SubLObject)el_macros.$sym2$CLET, (SubLObject)el_macros.$list96, ConsesLow.append(body, (SubLObject)el_macros.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/el-macros.lisp", position = 13137L)
    public static SubLObject without_encapsulation(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return (SubLObject)ConsesLow.listS((SubLObject)el_macros.$sym2$CLET, (SubLObject)el_macros.$list97, ConsesLow.append(body, (SubLObject)el_macros.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/el-macros.lisp", position = 13362L)
    public static SubLObject do_clauses(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)el_macros.$list98);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject clause_var = (SubLObject)el_macros.NIL;
        SubLObject v_clauses = (SubLObject)el_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)el_macros.$list98);
        clause_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)el_macros.$list98);
        v_clauses = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = (SubLObject)el_macros.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)el_macros.NIL;
        SubLObject current_$5 = (SubLObject)el_macros.NIL;
        while (el_macros.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)el_macros.$list98);
            current_$5 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)el_macros.$list98);
            if (el_macros.NIL == conses_high.member(current_$5, (SubLObject)el_macros.$list99, (SubLObject)el_macros.UNPROVIDED, (SubLObject)el_macros.UNPROVIDED)) {
                bad = (SubLObject)el_macros.T;
            }
            if (current_$5 == el_macros.$kw21$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (el_macros.NIL != bad && el_macros.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)el_macros.$list98);
        }
        final SubLObject done_tail = cdestructuring_bind.property_list_member((SubLObject)el_macros.$kw25$DONE, current);
        final SubLObject done = (SubLObject)((el_macros.NIL != done_tail) ? conses_high.cadr(done_tail) : el_macros.NIL);
        final SubLObject body;
        current = (body = temp);
        return (SubLObject)ConsesLow.listS((SubLObject)el_macros.$sym31$DO_LIST, (SubLObject)ConsesLow.list(clause_var, v_clauses, (SubLObject)el_macros.$kw25$DONE, done), ConsesLow.append(body, (SubLObject)el_macros.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/el-macros.lisp", position = 13524L)
    public static SubLObject do_neg_lits(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)el_macros.$list100);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject lit_var = (SubLObject)el_macros.NIL;
        SubLObject cnf = (SubLObject)el_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)el_macros.$list100);
        lit_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)el_macros.$list100);
        cnf = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = (SubLObject)el_macros.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)el_macros.NIL;
        SubLObject current_$6 = (SubLObject)el_macros.NIL;
        while (el_macros.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)el_macros.$list100);
            current_$6 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)el_macros.$list100);
            if (el_macros.NIL == conses_high.member(current_$6, (SubLObject)el_macros.$list99, (SubLObject)el_macros.UNPROVIDED, (SubLObject)el_macros.UNPROVIDED)) {
                bad = (SubLObject)el_macros.T;
            }
            if (current_$6 == el_macros.$kw21$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (el_macros.NIL != bad && el_macros.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)el_macros.$list100);
        }
        final SubLObject done_tail = cdestructuring_bind.property_list_member((SubLObject)el_macros.$kw25$DONE, current);
        final SubLObject done = (SubLObject)((el_macros.NIL != done_tail) ? conses_high.cadr(done_tail) : el_macros.NIL);
        final SubLObject body;
        current = (body = temp);
        return (SubLObject)ConsesLow.listS((SubLObject)el_macros.$sym31$DO_LIST, (SubLObject)ConsesLow.list(lit_var, (SubLObject)ConsesLow.list((SubLObject)el_macros.$sym101$NEG_LITS, cnf), (SubLObject)el_macros.$kw25$DONE, done), ConsesLow.append(body, (SubLObject)el_macros.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/el-macros.lisp", position = 13699L)
    public static SubLObject do_neg_lits_numbered(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)el_macros.$list102);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject lit_var = (SubLObject)el_macros.NIL;
        SubLObject index = (SubLObject)el_macros.NIL;
        SubLObject cnf = (SubLObject)el_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)el_macros.$list102);
        lit_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)el_macros.$list102);
        index = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)el_macros.$list102);
        cnf = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = (SubLObject)el_macros.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)el_macros.NIL;
        SubLObject current_$7 = (SubLObject)el_macros.NIL;
        while (el_macros.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)el_macros.$list102);
            current_$7 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)el_macros.$list102);
            if (el_macros.NIL == conses_high.member(current_$7, (SubLObject)el_macros.$list99, (SubLObject)el_macros.UNPROVIDED, (SubLObject)el_macros.UNPROVIDED)) {
                bad = (SubLObject)el_macros.T;
            }
            if (current_$7 == el_macros.$kw21$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (el_macros.NIL != bad && el_macros.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)el_macros.$list102);
        }
        final SubLObject done_tail = cdestructuring_bind.property_list_member((SubLObject)el_macros.$kw25$DONE, current);
        final SubLObject done = (SubLObject)((el_macros.NIL != done_tail) ? conses_high.cadr(done_tail) : el_macros.NIL);
        final SubLObject body;
        current = (body = temp);
        return (SubLObject)ConsesLow.list((SubLObject)el_macros.$sym2$CLET, (SubLObject)ConsesLow.list(reader.bq_cons(index, (SubLObject)el_macros.$list26)), (SubLObject)ConsesLow.listS((SubLObject)el_macros.$sym103$DO_NEG_LITS, (SubLObject)ConsesLow.list(lit_var, cnf, (SubLObject)el_macros.$kw25$DONE, done), ConsesLow.append(body, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)el_macros.$sym28$CINC, index)))));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/el-macros.lisp", position = 13926L)
    public static SubLObject do_pos_lits(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)el_macros.$list100);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject lit_var = (SubLObject)el_macros.NIL;
        SubLObject cnf = (SubLObject)el_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)el_macros.$list100);
        lit_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)el_macros.$list100);
        cnf = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = (SubLObject)el_macros.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)el_macros.NIL;
        SubLObject current_$8 = (SubLObject)el_macros.NIL;
        while (el_macros.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)el_macros.$list100);
            current_$8 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)el_macros.$list100);
            if (el_macros.NIL == conses_high.member(current_$8, (SubLObject)el_macros.$list99, (SubLObject)el_macros.UNPROVIDED, (SubLObject)el_macros.UNPROVIDED)) {
                bad = (SubLObject)el_macros.T;
            }
            if (current_$8 == el_macros.$kw21$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (el_macros.NIL != bad && el_macros.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)el_macros.$list100);
        }
        final SubLObject done_tail = cdestructuring_bind.property_list_member((SubLObject)el_macros.$kw25$DONE, current);
        final SubLObject done = (SubLObject)((el_macros.NIL != done_tail) ? conses_high.cadr(done_tail) : el_macros.NIL);
        final SubLObject body;
        current = (body = temp);
        return (SubLObject)ConsesLow.listS((SubLObject)el_macros.$sym31$DO_LIST, (SubLObject)ConsesLow.list(lit_var, (SubLObject)ConsesLow.list((SubLObject)el_macros.$sym104$POS_LITS, cnf), (SubLObject)el_macros.$kw25$DONE, done), ConsesLow.append(body, (SubLObject)el_macros.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/el-macros.lisp", position = 14101L)
    public static SubLObject do_pos_lits_numbered(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)el_macros.$list102);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject lit_var = (SubLObject)el_macros.NIL;
        SubLObject index = (SubLObject)el_macros.NIL;
        SubLObject cnf = (SubLObject)el_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)el_macros.$list102);
        lit_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)el_macros.$list102);
        index = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)el_macros.$list102);
        cnf = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = (SubLObject)el_macros.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)el_macros.NIL;
        SubLObject current_$9 = (SubLObject)el_macros.NIL;
        while (el_macros.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)el_macros.$list102);
            current_$9 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)el_macros.$list102);
            if (el_macros.NIL == conses_high.member(current_$9, (SubLObject)el_macros.$list99, (SubLObject)el_macros.UNPROVIDED, (SubLObject)el_macros.UNPROVIDED)) {
                bad = (SubLObject)el_macros.T;
            }
            if (current_$9 == el_macros.$kw21$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (el_macros.NIL != bad && el_macros.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)el_macros.$list102);
        }
        final SubLObject done_tail = cdestructuring_bind.property_list_member((SubLObject)el_macros.$kw25$DONE, current);
        final SubLObject done = (SubLObject)((el_macros.NIL != done_tail) ? conses_high.cadr(done_tail) : el_macros.NIL);
        final SubLObject body;
        current = (body = temp);
        return (SubLObject)ConsesLow.list((SubLObject)el_macros.$sym2$CLET, (SubLObject)ConsesLow.list(reader.bq_cons(index, (SubLObject)el_macros.$list26)), (SubLObject)ConsesLow.listS((SubLObject)el_macros.$sym105$DO_POS_LITS, (SubLObject)ConsesLow.list(lit_var, cnf, (SubLObject)el_macros.$kw25$DONE, done), ConsesLow.append(body, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)el_macros.$sym28$CINC, index)))));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/el-macros.lisp", position = 14328L)
    public static SubLObject do_all_lits_as_asents(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)el_macros.$list106);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject lit_var = (SubLObject)el_macros.NIL;
        SubLObject clause = (SubLObject)el_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)el_macros.$list106);
        lit_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)el_macros.$list106);
        clause = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = (SubLObject)el_macros.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)el_macros.NIL;
        SubLObject current_$10 = (SubLObject)el_macros.NIL;
        while (el_macros.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)el_macros.$list106);
            current_$10 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)el_macros.$list106);
            if (el_macros.NIL == conses_high.member(current_$10, (SubLObject)el_macros.$list107, (SubLObject)el_macros.UNPROVIDED, (SubLObject)el_macros.UNPROVIDED)) {
                bad = (SubLObject)el_macros.T;
            }
            if (current_$10 == el_macros.$kw21$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (el_macros.NIL != bad && el_macros.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)el_macros.$list106);
        }
        final SubLObject sense_tail = cdestructuring_bind.property_list_member((SubLObject)el_macros.$kw108$SENSE, current);
        final SubLObject sense = (SubLObject)((el_macros.NIL != sense_tail) ? conses_high.cadr(sense_tail) : el_macros.NIL);
        final SubLObject done_tail = cdestructuring_bind.property_list_member((SubLObject)el_macros.$kw25$DONE, current);
        final SubLObject done = (SubLObject)((el_macros.NIL != done_tail) ? conses_high.cadr(done_tail) : el_macros.NIL);
        final SubLObject body;
        current = (body = temp);
        if (el_macros.$kw109$POS == sense) {
            return (SubLObject)ConsesLow.listS((SubLObject)el_macros.$sym105$DO_POS_LITS, (SubLObject)ConsesLow.list(lit_var, clause, (SubLObject)el_macros.$kw25$DONE, done), ConsesLow.append(body, (SubLObject)el_macros.NIL));
        }
        if (el_macros.$kw110$NEG == sense) {
            return (SubLObject)ConsesLow.listS((SubLObject)el_macros.$sym103$DO_NEG_LITS, (SubLObject)ConsesLow.list(lit_var, clause, (SubLObject)el_macros.$kw25$DONE, done), ConsesLow.append(body, (SubLObject)el_macros.NIL));
        }
        if (el_macros.NIL == sense) {
            return (SubLObject)ConsesLow.list((SubLObject)el_macros.$sym75$PROGN, (SubLObject)ConsesLow.listS((SubLObject)el_macros.$sym111$DO_ALL_LITS_AS_ASENTS, (SubLObject)ConsesLow.list(lit_var, clause, (SubLObject)el_macros.$kw108$SENSE, (SubLObject)el_macros.$kw110$NEG, (SubLObject)el_macros.$kw25$DONE, done), ConsesLow.append(body, (SubLObject)el_macros.NIL)), (SubLObject)ConsesLow.listS((SubLObject)el_macros.$sym111$DO_ALL_LITS_AS_ASENTS, (SubLObject)ConsesLow.list(lit_var, clause, (SubLObject)el_macros.$kw108$SENSE, (SubLObject)el_macros.$kw109$POS, (SubLObject)el_macros.$kw25$DONE, done), ConsesLow.append(body, (SubLObject)el_macros.NIL)));
        }
        return (SubLObject)ConsesLow.list((SubLObject)el_macros.$sym112$PCOND, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)el_macros.EQ, (SubLObject)el_macros.$kw109$POS, sense), (SubLObject)ConsesLow.listS((SubLObject)el_macros.$sym111$DO_ALL_LITS_AS_ASENTS, (SubLObject)ConsesLow.list(lit_var, clause, (SubLObject)el_macros.$kw108$SENSE, (SubLObject)el_macros.$kw109$POS, (SubLObject)el_macros.$kw25$DONE, done), ConsesLow.append(body, (SubLObject)el_macros.NIL))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)el_macros.EQ, (SubLObject)el_macros.$kw110$NEG, sense), (SubLObject)ConsesLow.listS((SubLObject)el_macros.$sym111$DO_ALL_LITS_AS_ASENTS, (SubLObject)ConsesLow.list(lit_var, clause, (SubLObject)el_macros.$kw108$SENSE, (SubLObject)el_macros.$kw110$NEG, (SubLObject)el_macros.$kw25$DONE, done), ConsesLow.append(body, (SubLObject)el_macros.NIL))), (SubLObject)ConsesLow.list((SubLObject)el_macros.T, (SubLObject)ConsesLow.list((SubLObject)el_macros.$sym113$ERROR, (SubLObject)el_macros.$str114$Invalid_sense__s, sense)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/el-macros.lisp", position = 15194L)
    public static SubLObject do_literals_numbered(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)el_macros.$list115);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject lit_var = (SubLObject)el_macros.NIL;
        SubLObject index_var = (SubLObject)el_macros.NIL;
        SubLObject sense_var = (SubLObject)el_macros.NIL;
        SubLObject clause = (SubLObject)el_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)el_macros.$list115);
        lit_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)el_macros.$list115);
        index_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)el_macros.$list115);
        sense_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)el_macros.$list115);
        clause = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = (SubLObject)el_macros.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)el_macros.NIL;
        SubLObject current_$11 = (SubLObject)el_macros.NIL;
        while (el_macros.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)el_macros.$list115);
            current_$11 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)el_macros.$list115);
            if (el_macros.NIL == conses_high.member(current_$11, (SubLObject)el_macros.$list99, (SubLObject)el_macros.UNPROVIDED, (SubLObject)el_macros.UNPROVIDED)) {
                bad = (SubLObject)el_macros.T;
            }
            if (current_$11 == el_macros.$kw21$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (el_macros.NIL != bad && el_macros.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)el_macros.$list115);
        }
        final SubLObject done_tail = cdestructuring_bind.property_list_member((SubLObject)el_macros.$kw25$DONE, current);
        final SubLObject done = (SubLObject)((el_macros.NIL != done_tail) ? conses_high.cadr(done_tail) : el_macros.NIL);
        final SubLObject body;
        current = (body = temp);
        return (SubLObject)ConsesLow.list((SubLObject)el_macros.$sym75$PROGN, (SubLObject)ConsesLow.list((SubLObject)el_macros.$sym116$DO_NEG_LITS_NUMBERED, (SubLObject)ConsesLow.list(lit_var, index_var, clause, (SubLObject)el_macros.$kw25$DONE, done), (SubLObject)ConsesLow.listS((SubLObject)el_macros.$sym2$CLET, (SubLObject)ConsesLow.list(reader.bq_cons(sense_var, (SubLObject)el_macros.$list117)), ConsesLow.append(body, (SubLObject)el_macros.NIL))), (SubLObject)ConsesLow.list((SubLObject)el_macros.$sym118$DO_POS_LITS_NUMBERED, (SubLObject)ConsesLow.list(lit_var, index_var, clause, (SubLObject)el_macros.$kw25$DONE, done), (SubLObject)ConsesLow.listS((SubLObject)el_macros.$sym2$CLET, (SubLObject)ConsesLow.list(reader.bq_cons(sense_var, (SubLObject)el_macros.$list119)), ConsesLow.append(body, (SubLObject)el_macros.NIL))));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/el-macros.lisp", position = 15672L)
    public static SubLObject do_clause_asents(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)el_macros.$list120);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject asent_var = (SubLObject)el_macros.NIL;
        SubLObject sense_var = (SubLObject)el_macros.NIL;
        SubLObject clause = (SubLObject)el_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)el_macros.$list120);
        asent_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)el_macros.$list120);
        sense_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)el_macros.$list120);
        clause = current.first();
        current = current.rest();
        if (el_macros.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            final SubLObject index_var = (SubLObject)el_macros.$sym121$INDEX_VAR;
            return (SubLObject)ConsesLow.listS((SubLObject)el_macros.$sym122$DO_LITERALS_NUMBERED, (SubLObject)ConsesLow.list(asent_var, index_var, sense_var, clause), (SubLObject)ConsesLow.list((SubLObject)el_macros.$sym123$IGNORE, index_var), ConsesLow.append(body, (SubLObject)el_macros.NIL));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)el_macros.$list120);
        return (SubLObject)el_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/el-macros.lisp", position = 16017L)
    public static SubLObject do_clauses_asents(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)el_macros.$list124);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject lit_var = (SubLObject)el_macros.NIL;
        SubLObject v_clauses = (SubLObject)el_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)el_macros.$list124);
        lit_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)el_macros.$list124);
        v_clauses = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = (SubLObject)el_macros.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)el_macros.NIL;
        SubLObject current_$12 = (SubLObject)el_macros.NIL;
        while (el_macros.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)el_macros.$list124);
            current_$12 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)el_macros.$list124);
            if (el_macros.NIL == conses_high.member(current_$12, (SubLObject)el_macros.$list125, (SubLObject)el_macros.UNPROVIDED, (SubLObject)el_macros.UNPROVIDED)) {
                bad = (SubLObject)el_macros.T;
            }
            if (current_$12 == el_macros.$kw21$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (el_macros.NIL != bad && el_macros.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)el_macros.$list124);
        }
        final SubLObject done_tail = cdestructuring_bind.property_list_member((SubLObject)el_macros.$kw25$DONE, current);
        final SubLObject done = (SubLObject)((el_macros.NIL != done_tail) ? conses_high.cadr(done_tail) : el_macros.NIL);
        final SubLObject sense_var_tail = cdestructuring_bind.property_list_member((SubLObject)el_macros.$kw126$SENSE_VAR, current);
        final SubLObject sense_var = (SubLObject)((el_macros.NIL != sense_var_tail) ? conses_high.cadr(sense_var_tail) : el_macros.NIL);
        final SubLObject body;
        current = (body = temp);
        final SubLObject clause = (SubLObject)el_macros.$sym127$CLAUSE;
        return (SubLObject)ConsesLow.list((SubLObject)el_macros.$sym31$DO_LIST, (SubLObject)ConsesLow.list(clause, v_clauses, (SubLObject)el_macros.$kw25$DONE, done), (SubLObject)ConsesLow.listS((SubLObject)el_macros.$sym111$DO_ALL_LITS_AS_ASENTS, (SubLObject)ConsesLow.list(lit_var, clause, (SubLObject)el_macros.$kw108$SENSE, sense_var, (SubLObject)el_macros.$kw25$DONE, done), ConsesLow.append(body, (SubLObject)el_macros.NIL)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/el-macros.lisp", position = 16411L)
    public static SubLObject do_clauses_literals_numbered(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)el_macros.$list128);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject lit_var = (SubLObject)el_macros.NIL;
        SubLObject literal_index_var = (SubLObject)el_macros.NIL;
        SubLObject sense_var = (SubLObject)el_macros.NIL;
        SubLObject clause_index_var = (SubLObject)el_macros.NIL;
        SubLObject v_clauses = (SubLObject)el_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)el_macros.$list128);
        lit_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)el_macros.$list128);
        literal_index_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)el_macros.$list128);
        sense_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)el_macros.$list128);
        clause_index_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)el_macros.$list128);
        v_clauses = current.first();
        current = current.rest();
        if (el_macros.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            final SubLObject clause = (SubLObject)el_macros.$sym129$CLAUSE;
            return (SubLObject)ConsesLow.list((SubLObject)el_macros.$sym130$CDOLIST_NUMBERED, (SubLObject)ConsesLow.list(clause, clause_index_var, v_clauses), (SubLObject)ConsesLow.listS((SubLObject)el_macros.$sym122$DO_LITERALS_NUMBERED, (SubLObject)ConsesLow.list(lit_var, literal_index_var, sense_var, clause), ConsesLow.append(body, (SubLObject)el_macros.NIL)));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)el_macros.$list128);
        return (SubLObject)el_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/el-macros.lisp", position = 16855L)
    public static SubLObject destructure_binding(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)el_macros.$list131);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject variable_var = (SubLObject)el_macros.NIL;
        SubLObject value_var = (SubLObject)el_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)el_macros.$list131);
        variable_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)el_macros.$list131);
        value_var = current.first();
        current = current.rest();
        if (el_macros.NIL == current) {
            current = temp;
            SubLObject binding = (SubLObject)el_macros.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)el_macros.$list131);
            binding = current.first();
            final SubLObject body;
            current = (body = current.rest());
            return (SubLObject)ConsesLow.listS((SubLObject)el_macros.$sym132$CDESTRUCTURING_BIND, reader.bq_cons(variable_var, value_var), binding, ConsesLow.append(body, (SubLObject)el_macros.NIL));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)el_macros.$list131);
        return (SubLObject)el_macros.NIL;
    }
    
    public static SubLObject declare_el_macros_file() {
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.el_macros", "ignoring_sequence_vars", "IGNORING-SEQUENCE-VARS");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.el_macros", "regularizing_sequence_vars", "REGULARIZING-SEQUENCE-VARS");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.el_macros", "return_after_ignoring_sequence_vars", "RETURN-AFTER-IGNORING-SEQUENCE-VARS");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.el_macros", "return_after_regularizing_sequence_vars", "RETURN-AFTER-REGULARIZING-SEQUENCE-VARS");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.el_macros", "do_formula_args", "DO-FORMULA-ARGS");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.el_macros", "do_formula_args_numbered", "DO-FORMULA-ARGS-NUMBERED");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.el_macros", "some_el_formula_args", "SOME-EL-FORMULA-ARGS");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.el_macros", "some_el_formula_args_numbered", "SOME-EL-FORMULA-ARGS-NUMBERED");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.el_macros", "do_formula_terms", "DO-FORMULA-TERMS");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.el_macros", "do_formula_terms_numbered", "DO-FORMULA-TERMS-NUMBERED");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.el_macros", "some_el_formula_terms", "SOME-EL-FORMULA-TERMS");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.el_macros", "some_el_formula_terms_numbered", "SOME-EL-FORMULA-TERMS-NUMBERED");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.el_macros", "some_el_literal_args", "SOME-EL-LITERAL-ARGS");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.el_macros", "some_el_literal_args_numbered", "SOME-EL-LITERAL-ARGS-NUMBERED");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.el_macros", "some_el_literal_terms", "SOME-EL-LITERAL-TERMS");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.el_macros", "some_el_literal_terms_numbered", "SOME-EL-LITERAL-TERMS-NUMBERED");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.el_macros", "do_el_formula_literals", "DO-EL-FORMULA-LITERALS");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.el_macros", "do_el_formula_args_recursive", "DO-EL-FORMULA-ARGS-RECURSIVE");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.el_macros", "do_formula_terms_and_positions_recursive", "DO-FORMULA-TERMS-AND-POSITIONS-RECURSIVE");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.el_macros", "without_wff_semantics", "WITHOUT-WFF-SEMANTICS");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.el_macros", "with_wff_semantics", "WITH-WFF-SEMANTICS");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.el_macros", "without_wff_semantics_or_arity", "WITHOUT-WFF-SEMANTICS-OR-ARITY");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.el_macros", "without_wff_semantics_or_arity_or_kb", "WITHOUT-WFF-SEMANTICS-OR-ARITY-OR-KB");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.el_macros", "with_el_var_namespace", "WITH-EL-VAR-NAMESPACE");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.el_macros", "with_clean_el_var_namespace", "WITH-CLEAN-EL-VAR-NAMESPACE");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.el_macros", "without_encapsulation", "WITHOUT-ENCAPSULATION");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.el_macros", "do_clauses", "DO-CLAUSES");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.el_macros", "do_neg_lits", "DO-NEG-LITS");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.el_macros", "do_neg_lits_numbered", "DO-NEG-LITS-NUMBERED");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.el_macros", "do_pos_lits", "DO-POS-LITS");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.el_macros", "do_pos_lits_numbered", "DO-POS-LITS-NUMBERED");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.el_macros", "do_all_lits_as_asents", "DO-ALL-LITS-AS-ASENTS");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.el_macros", "do_literals_numbered", "DO-LITERALS-NUMBERED");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.el_macros", "do_clause_asents", "DO-CLAUSE-ASENTS");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.el_macros", "do_clauses_asents", "DO-CLAUSES-ASENTS");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.el_macros", "do_clauses_literals_numbered", "DO-CLAUSES-LITERALS-NUMBERED");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.el_macros", "destructure_binding", "DESTRUCTURE-BINDING");
        return (SubLObject)el_macros.NIL;
    }
    
    public static SubLObject init_el_macros_file() {
        return (SubLObject)el_macros.NIL;
    }
    
    public static SubLObject setup_el_macros_file() {
        return (SubLObject)el_macros.NIL;
    }
    
    @Override
	public void declareFunctions() {
        declare_el_macros_file();
    }
    
    @Override
	public void initializeVariables() {
        init_el_macros_file();
    }
    
    @Override
	public void runTopLevelForms() {
        setup_el_macros_file();
    }
    
    static {
        me = (SubLFile)new el_macros();
        $list0 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FORMULA")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym1$TEMPFORMULA = SubLObjectFactory.makeUninternedSymbol("TEMPFORMULA");
        $sym2$CLET = SubLObjectFactory.makeSymbol("CLET");
        $sym3$FIF = SubLObjectFactory.makeSymbol("FIF");
        $sym4$SEQUENCE_VAR = SubLObjectFactory.makeSymbol("SEQUENCE-VAR");
        $sym5$STRIP_SEQUENCE_VAR = SubLObjectFactory.makeSymbol("STRIP-SEQUENCE-VAR");
        $sym6$SEQVAR = SubLObjectFactory.makeUninternedSymbol("SEQVAR");
        $sym7$TEMPFORMULA = SubLObjectFactory.makeUninternedSymbol("TEMPFORMULA");
        $sym8$APPEND = SubLObjectFactory.makeSymbol("APPEND");
        $sym9$LIST = SubLObjectFactory.makeSymbol("LIST");
        $list10 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FORMULA"), (SubLObject)SubLObjectFactory.makeSymbol("RESULT")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym11$SEQVAR = SubLObjectFactory.makeUninternedSymbol("SEQVAR");
        $sym12$TEMPFORMULA = SubLObjectFactory.makeUninternedSymbol("TEMPFORMULA");
        $list13 = ConsesLow.list((SubLObject)el_macros.NIL);
        $sym14$PIF = SubLObjectFactory.makeSymbol("PIF");
        $sym15$RET = SubLObjectFactory.makeSymbol("RET");
        $sym16$NADD_SEQUENCE_VAR_TO_END = SubLObjectFactory.makeSymbol("NADD-SEQUENCE-VAR-TO-END");
        $sym17$SEQVAR = SubLObjectFactory.makeUninternedSymbol("SEQVAR");
        $sym18$TEMPFORMULA = SubLObjectFactory.makeUninternedSymbol("TEMPFORMULA");
        $list19 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ARG-VAR"), (SubLObject)SubLObjectFactory.makeSymbol("FORMULA"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("ARGNUM"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SEQVAR-HANDLING"), (SubLObject)SubLObjectFactory.makeKeyword("IGNORE")), (SubLObject)SubLObjectFactory.makeSymbol("DONE")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $list20 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("ARGNUM"), (SubLObject)SubLObjectFactory.makeKeyword("SEQVAR-HANDLING"), (SubLObject)SubLObjectFactory.makeKeyword("DONE"));
        $kw21$ALLOW_OTHER_KEYS = SubLObjectFactory.makeKeyword("ALLOW-OTHER-KEYS");
        $kw22$ARGNUM = SubLObjectFactory.makeKeyword("ARGNUM");
        $kw23$SEQVAR_HANDLING = SubLObjectFactory.makeKeyword("SEQVAR-HANDLING");
        $kw24$IGNORE = SubLObjectFactory.makeKeyword("IGNORE");
        $kw25$DONE = SubLObjectFactory.makeKeyword("DONE");
        $list26 = ConsesLow.list((SubLObject)el_macros.ZERO_INTEGER);
        $sym27$DO_FORMULA_ARGS = SubLObjectFactory.makeSymbol("DO-FORMULA-ARGS");
        $sym28$CINC = SubLObjectFactory.makeSymbol("CINC");
        $sym29$ARGS = SubLObjectFactory.makeUninternedSymbol("ARGS");
        $sym30$FORMULA_ARGS = SubLObjectFactory.makeSymbol("FORMULA-ARGS");
        $sym31$DO_LIST = SubLObjectFactory.makeSymbol("DO-LIST");
        $list32 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ARG-VAR"), (SubLObject)SubLObjectFactory.makeSymbol("ARGNUM-VAR"), (SubLObject)SubLObjectFactory.makeSymbol("FORMULA"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SEQVAR-HANDLING"), (SubLObject)SubLObjectFactory.makeKeyword("IGNORE")), (SubLObject)SubLObjectFactory.makeSymbol("DONE")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $list33 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("SEQVAR-HANDLING"), (SubLObject)SubLObjectFactory.makeKeyword("DONE"));
        $list34 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ARG-VAR"), (SubLObject)SubLObjectFactory.makeSymbol("FORMULA"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DONE-VAR"), (SubLObject)el_macros.NIL), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SEQVAR-HANDLING"), (SubLObject)SubLObjectFactory.makeKeyword("IGNORE"))), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $list35 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ARG-VAR"), (SubLObject)SubLObjectFactory.makeSymbol("ARGNUM-VAR"), (SubLObject)SubLObjectFactory.makeSymbol("FORMULA"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DONE-VAR"), (SubLObject)el_macros.NIL), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SEQVAR-HANDLING"), (SubLObject)SubLObjectFactory.makeKeyword("IGNORE"))), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym36$DO_FORMULA_ARGS_NUMBERED = SubLObjectFactory.makeSymbol("DO-FORMULA-ARGS-NUMBERED");
        $list37 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TERM-VAR"), (SubLObject)SubLObjectFactory.makeSymbol("FORMULA"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("ARGNUM"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SEQVAR-HANDLING"), (SubLObject)SubLObjectFactory.makeKeyword("IGNORE")), (SubLObject)SubLObjectFactory.makeSymbol("DONE")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym38$TERMS = SubLObjectFactory.makeUninternedSymbol("TERMS");
        $sym39$FORMULA_TERMS = SubLObjectFactory.makeSymbol("FORMULA-TERMS");
        $sym40$DO_LIST_INDEX = SubLObjectFactory.makeSymbol("DO-LIST-INDEX");
        $sym41$TERMS = SubLObjectFactory.makeUninternedSymbol("TERMS");
        $list42 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TERM-VAR"), (SubLObject)SubLObjectFactory.makeSymbol("ARGNUM-VAR"), (SubLObject)SubLObjectFactory.makeSymbol("FORMULA"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SEQVAR-HANDLING"), (SubLObject)SubLObjectFactory.makeKeyword("IGNORE")), (SubLObject)SubLObjectFactory.makeSymbol("DONE")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym43$DO_FORMULA_TERMS = SubLObjectFactory.makeSymbol("DO-FORMULA-TERMS");
        $list44 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TERM-VAR"), (SubLObject)SubLObjectFactory.makeSymbol("FORMULA"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DONE-VAR"), (SubLObject)el_macros.NIL), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SEQVAR-HANDLING"), (SubLObject)SubLObjectFactory.makeKeyword("IGNORE"))), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $list45 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TERM-VAR"), (SubLObject)SubLObjectFactory.makeSymbol("ARGNUM-VAR"), (SubLObject)SubLObjectFactory.makeSymbol("FORMULA"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DONE-VAR"), (SubLObject)el_macros.NIL), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SEQVAR-HANDLING"), (SubLObject)SubLObjectFactory.makeKeyword("IGNORE"))), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym46$DO_FORMULA_TERMS_NUMBERED = SubLObjectFactory.makeSymbol("DO-FORMULA-TERMS-NUMBERED");
        $list47 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ARG-VAR"), (SubLObject)SubLObjectFactory.makeSymbol("LITERAL"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DONE-VAR"), (SubLObject)el_macros.NIL), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SEQVAR-HANDLING"), (SubLObject)SubLObjectFactory.makeKeyword("IGNORE"))), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym48$ARGS = SubLObjectFactory.makeUninternedSymbol("ARGS");
        $sym49$LITERAL_ARGS = SubLObjectFactory.makeSymbol("LITERAL-ARGS");
        $list50 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ARG-VAR"), (SubLObject)SubLObjectFactory.makeSymbol("ARGNUM-VAR"), (SubLObject)SubLObjectFactory.makeSymbol("LITERAL"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DONE-VAR"), (SubLObject)el_macros.NIL), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SEQVAR-HANDLING"), (SubLObject)SubLObjectFactory.makeKeyword("IGNORE"))), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym51$ARGS = SubLObjectFactory.makeUninternedSymbol("ARGS");
        $sym52$LIST_VAR = SubLObjectFactory.makeUninternedSymbol("LIST-VAR");
        $sym53$CDO = SubLObjectFactory.makeSymbol("CDO");
        $sym54$CDR = SubLObjectFactory.makeSymbol("CDR");
        $sym55$CAR = SubLObjectFactory.makeSymbol("CAR");
        $sym56$_ = SubLObjectFactory.makeSymbol("+");
        $sym57$COR = SubLObjectFactory.makeSymbol("COR");
        $sym58$NULL = SubLObjectFactory.makeSymbol("NULL");
        $list59 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TERM-VAR"), (SubLObject)SubLObjectFactory.makeSymbol("LITERAL"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DONE-VAR"), (SubLObject)el_macros.NIL), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SEQVAR-HANDLING"), (SubLObject)SubLObjectFactory.makeKeyword("IGNORE"))), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym60$TERMS = SubLObjectFactory.makeUninternedSymbol("TERMS");
        $sym61$LITERAL_TERMS = SubLObjectFactory.makeSymbol("LITERAL-TERMS");
        $list62 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TERM-VAR"), (SubLObject)SubLObjectFactory.makeSymbol("ARGNUM-VAR"), (SubLObject)SubLObjectFactory.makeSymbol("LITERAL"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DONE-VAR"), (SubLObject)el_macros.NIL), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SEQVAR-HANDLING"), (SubLObject)SubLObjectFactory.makeKeyword("IGNORE"))), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym63$TERMS = SubLObjectFactory.makeUninternedSymbol("TERMS");
        $sym64$LIST_VAR = SubLObjectFactory.makeUninternedSymbol("LIST-VAR");
        $list65 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LITERAL"), (SubLObject)SubLObjectFactory.makeSymbol("FORMULA")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym66$STACK = SubLObjectFactory.makeUninternedSymbol("STACK");
        $sym67$ENTRY = SubLObjectFactory.makeUninternedSymbol("ENTRY");
        $list68 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CREATE-STACK")));
        $sym69$STACK_PUSH = SubLObjectFactory.makeSymbol("STACK-PUSH");
        $sym70$UNTIL = SubLObjectFactory.makeSymbol("UNTIL");
        $sym71$STACK_EMPTY_P = SubLObjectFactory.makeSymbol("STACK-EMPTY-P");
        $sym72$STACK_POP = SubLObjectFactory.makeSymbol("STACK-POP");
        $sym73$PWHEN = SubLObjectFactory.makeSymbol("PWHEN");
        $sym74$LITERAL_ = SubLObjectFactory.makeSymbol("LITERAL?");
        $sym75$PROGN = SubLObjectFactory.makeSymbol("PROGN");
        $sym76$CSETQ = SubLObjectFactory.makeSymbol("CSETQ");
        $sym77$CDOLIST = SubLObjectFactory.makeSymbol("CDOLIST");
        $sym78$ARG = SubLObjectFactory.makeSymbol("ARG");
        $list79 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ARG"), (SubLObject)SubLObjectFactory.makeSymbol("FORMULA")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym80$STACK = SubLObjectFactory.makeUninternedSymbol("STACK");
        $sym81$ENTRY = SubLObjectFactory.makeUninternedSymbol("ENTRY");
        $list82 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ARG"), (SubLObject)SubLObjectFactory.makeSymbol("ARGPOS"), (SubLObject)SubLObjectFactory.makeSymbol("FORMULA")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym83$ARG_STACK = SubLObjectFactory.makeUninternedSymbol("ARG-STACK");
        $sym84$POS_STACK = SubLObjectFactory.makeUninternedSymbol("POS-STACK");
        $sym85$ENTRY = SubLObjectFactory.makeUninternedSymbol("ENTRY");
        $sym86$POS_ENTRY = SubLObjectFactory.makeUninternedSymbol("POS-ENTRY");
        $sym87$ARG_NUM = SubLObjectFactory.makeUninternedSymbol("ARG-NUM");
        $sym88$SNOC = SubLObjectFactory.makeSymbol("SNOC");
        $list89 = ConsesLow.list(new SubLObject[] { ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*WITHIN-ASSERT*"), (SubLObject)el_macros.NIL), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*CHECK-ARG-TYPES?*"), (SubLObject)el_macros.NIL), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*AT-CHECK-ARG-TYPES?*"), (SubLObject)el_macros.NIL), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*CHECK-WFF-SEMANTICS?*"), (SubLObject)el_macros.NIL), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*CHECK-WFF-COHERENCE?*"), (SubLObject)el_macros.NIL), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*CHECK-VAR-TYPES?*"), (SubLObject)el_macros.NIL), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*SIMPLIFY-LITERAL?*"), (SubLObject)el_macros.NIL), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*AT-CHECK-RELATOR-CONSTRAINTS?*"), (SubLObject)el_macros.NIL), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*AT-CHECK-ARG-FORMAT?*"), (SubLObject)el_macros.NIL), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*VALIDATE-CONSTANTS?*"), (SubLObject)el_macros.NIL), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*SUSPEND-SBHL-TYPE-CHECKING?*"), (SubLObject)el_macros.T) });
        $list90 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*CHECK-WFF-SEMANTICS?*"), (SubLObject)el_macros.T));
        $sym91$WITHOUT_WFF_SEMANTICS = SubLObjectFactory.makeSymbol("WITHOUT-WFF-SEMANTICS");
        $list92 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*CHECK-ARITY?*"), (SubLObject)el_macros.NIL));
        $sym93$WITHOUT_WFF_SEMANTICS_OR_ARITY = SubLObjectFactory.makeSymbol("WITHOUT-WFF-SEMANTICS-OR-ARITY");
        $sym94$WITHOUT_GRAMMAR_USING_KB = SubLObjectFactory.makeSymbol("WITHOUT-GRAMMAR-USING-KB");
        $list95 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*EL-SYMBOL-SUFFIX-TABLE*"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIF"), (SubLObject)SubLObjectFactory.makeSymbol("*EL-SYMBOL-SUFFIX-TABLE*"), (SubLObject)SubLObjectFactory.makeSymbol("*EL-SYMBOL-SUFFIX-TABLE*"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MAKE-HASH-TABLE"), (SubLObject)SubLObjectFactory.makeInteger(32), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCTION"), (SubLObject)el_macros.EQL)))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*STANDARDIZE-VARIABLES-MEMORY*"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIF"), (SubLObject)SubLObjectFactory.makeSymbol("*STANDARDIZE-VARIABLES-MEMORY*"), (SubLObject)SubLObjectFactory.makeSymbol("*STANDARDIZE-VARIABLES-MEMORY*"), (SubLObject)el_macros.NIL)));
        $list96 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*EL-SYMBOL-SUFFIX-TABLE*"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MAKE-HASH-TABLE"), (SubLObject)el_macros.FOUR_INTEGER, (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCTION"), (SubLObject)el_macros.EQL))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*STANDARDIZE-VARIABLES-MEMORY*"), (SubLObject)el_macros.NIL));
        $list97 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*ENCAPSULATE-VAR-FORMULA?*"), (SubLObject)el_macros.NIL), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*ENCAPSULATE-INTENSIONAL-FORMULA?*"), (SubLObject)el_macros.NIL));
        $list98 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLAUSE-VAR"), (SubLObject)SubLObjectFactory.makeSymbol("CLAUSES"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("DONE")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $list99 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("DONE"));
        $list100 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LIT-VAR"), (SubLObject)SubLObjectFactory.makeSymbol("CNF"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("DONE")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym101$NEG_LITS = SubLObjectFactory.makeSymbol("NEG-LITS");
        $list102 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LIT-VAR"), (SubLObject)SubLObjectFactory.makeSymbol("INDEX"), (SubLObject)SubLObjectFactory.makeSymbol("CNF"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("DONE")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym103$DO_NEG_LITS = SubLObjectFactory.makeSymbol("DO-NEG-LITS");
        $sym104$POS_LITS = SubLObjectFactory.makeSymbol("POS-LITS");
        $sym105$DO_POS_LITS = SubLObjectFactory.makeSymbol("DO-POS-LITS");
        $list106 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LIT-VAR"), (SubLObject)SubLObjectFactory.makeSymbol("CLAUSE"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("SENSE"), (SubLObject)SubLObjectFactory.makeSymbol("DONE")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $list107 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("SENSE"), (SubLObject)SubLObjectFactory.makeKeyword("DONE"));
        $kw108$SENSE = SubLObjectFactory.makeKeyword("SENSE");
        $kw109$POS = SubLObjectFactory.makeKeyword("POS");
        $kw110$NEG = SubLObjectFactory.makeKeyword("NEG");
        $sym111$DO_ALL_LITS_AS_ASENTS = SubLObjectFactory.makeSymbol("DO-ALL-LITS-AS-ASENTS");
        $sym112$PCOND = SubLObjectFactory.makeSymbol("PCOND");
        $sym113$ERROR = SubLObjectFactory.makeSymbol("ERROR");
        $str114$Invalid_sense__s = SubLObjectFactory.makeString("Invalid sense ~s");
        $list115 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LIT-VAR"), (SubLObject)SubLObjectFactory.makeSymbol("INDEX-VAR"), (SubLObject)SubLObjectFactory.makeSymbol("SENSE-VAR"), (SubLObject)SubLObjectFactory.makeSymbol("CLAUSE"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("DONE")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym116$DO_NEG_LITS_NUMBERED = SubLObjectFactory.makeSymbol("DO-NEG-LITS-NUMBERED");
        $list117 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NEG"));
        $sym118$DO_POS_LITS_NUMBERED = SubLObjectFactory.makeSymbol("DO-POS-LITS-NUMBERED");
        $list119 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("POS"));
        $list120 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ASENT-VAR"), (SubLObject)SubLObjectFactory.makeSymbol("SENSE-VAR"), (SubLObject)SubLObjectFactory.makeSymbol("CLAUSE")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym121$INDEX_VAR = SubLObjectFactory.makeUninternedSymbol("INDEX-VAR");
        $sym122$DO_LITERALS_NUMBERED = SubLObjectFactory.makeSymbol("DO-LITERALS-NUMBERED");
        $sym123$IGNORE = SubLObjectFactory.makeSymbol("IGNORE");
        $list124 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LIT-VAR"), (SubLObject)SubLObjectFactory.makeSymbol("CLAUSES"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("DONE"), (SubLObject)SubLObjectFactory.makeSymbol("SENSE-VAR")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $list125 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("DONE"), (SubLObject)SubLObjectFactory.makeKeyword("SENSE-VAR"));
        $kw126$SENSE_VAR = SubLObjectFactory.makeKeyword("SENSE-VAR");
        $sym127$CLAUSE = SubLObjectFactory.makeUninternedSymbol("CLAUSE");
        $list128 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LIT-VAR"), (SubLObject)SubLObjectFactory.makeSymbol("LITERAL-INDEX-VAR"), (SubLObject)SubLObjectFactory.makeSymbol("SENSE-VAR"), (SubLObject)SubLObjectFactory.makeSymbol("CLAUSE-INDEX-VAR"), (SubLObject)SubLObjectFactory.makeSymbol("CLAUSES")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym129$CLAUSE = SubLObjectFactory.makeUninternedSymbol("CLAUSE");
        $sym130$CDOLIST_NUMBERED = SubLObjectFactory.makeSymbol("CDOLIST-NUMBERED");
        $list131 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("VARIABLE-VAR"), (SubLObject)SubLObjectFactory.makeSymbol("VALUE-VAR")), (SubLObject)SubLObjectFactory.makeSymbol("BINDING"), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym132$CDESTRUCTURING_BIND = SubLObjectFactory.makeSymbol("CDESTRUCTURING-BIND");
    }
}

/*

	Total time: 1988 ms
	
*/