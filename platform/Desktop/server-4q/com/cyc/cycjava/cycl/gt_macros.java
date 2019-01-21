package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class gt_macros extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.gt_macros";
    public static final String myFingerPrint = "98712826175262e07b5bd2ed5289c9f61addd0abe13d8e48c420f12492025132";
    @SubLTranslatedFile.SubL(source = "cycl/gt-macros.lisp", position = 4592L)
    public static SubLSymbol $gt_recursion_cutoff$;
    private static final SubLList $list0;
    private static final SubLSymbol $sym1$PROGN;
    private static final SubLSymbol $sym2$MUST;
    private static final SubLSymbol $sym3$GT_MODE_;
    private static final SubLString $str4$invalid_gt_mode___a;
    private static final SubLSymbol $sym5$CLET;
    private static final SubLSymbol $sym6$_GT_MODE_;
    private static final SubLSymbol $sym7$WITH_SBHL_READER_LOCK;
    private static final SubLList $list8;
    private static final SubLList $list9;
    private static final SubLSymbol $sym10$CHECK_TYPE;
    private static final SubLList $list11;
    private static final SubLSymbol $sym12$_GT_TRUTH_;
    private static final SubLList $list13;
    private static final SubLList $list14;
    private static final SubLSymbol $sym15$_GT_PRED_;
    private static final SubLList $list16;
    private static final SubLList $list17;
    private static final SubLSymbol $sym18$_GT_COMBINE_FN_;
    private static final SubLSymbol $sym19$_GT_BASE_FN_;
    private static final SubLSymbol $sym20$PWHEN;
    private static final SubLSymbol $sym21$_GT_STEP_FN_;
    private static final SubLSymbol $sym22$_TT_STEP_FN_;
    private static final SubLSymbol $sym23$FUNCTION_SPEC_P;
    private static final SubLString $str24$_a_is_not_a_function;
    private static final SubLSymbol $sym25$_GT_GATHER_FN_;
    private static final SubLSymbol $sym26$_GT_COMPOSE_FN_;
    private static final SubLSymbol $sym27$_GT_COMPARE_FN_;
    private static final SubLList $list28;
    private static final SubLSymbol $sym29$_GT_TARGET_;
    private static final SubLList $list30;
    private static final SubLSymbol $sym31$_GT_SEARCHER_;
    private static final SubLSymbol $sym32$_GT_COMPOSE_PRED_;
    private static final SubLList $list33;
    private static final SubLList $list34;
    private static final SubLSymbol $sym35$_GT_COMPOSE_INDEX_ARG_;
    private static final SubLSymbol $sym36$_GT_COMPOSE_GATHER_ARG_;
    private static final SubLList $list37;
    private static final SubLSymbol $sym38$_GT_LINK_SUPPORT_;
    private static final SubLSymbol $sym39$CCATCH_IGNORE;
    private static final SubLSymbol $kw40$GT_ERROR;
    private static final SubLList $list41;
    private static final SubLList $list42;
    private static final SubLSymbol $sym43$PUNLESS;
    private static final SubLList $list44;
    private static final SubLSymbol $sym45$GT_CHECK_TYPE_INTERNAL;
    private static final SubLInteger $int46$64;
    private static final SubLList $list47;
    private static final SubLList $list48;
    private static final SubLList $list49;
    private static final SubLList $list50;
    private static final SubLSymbol $sym51$CUTOFF_REACHED;
    private static final SubLList $list52;
    private static final SubLList $list53;
    private static final SubLSymbol $sym54$_GT_DEPTH_CUTOFF_;
    private static final SubLList $list55;
    private static final SubLList $list56;
    private static final SubLSymbol $sym57$_GT_TIME_CUTOFF_;
    private static final SubLList $list58;
    private static final SubLList $list59;
    private static final SubLSymbol $sym60$PIF;
    private static final SubLSymbol $sym61$_;
    private static final SubLList $list62;
    private static final SubLList $list63;
    private static final SubLList $list64;
    private static final SubLSymbol $sym65$_GT_ANSWERS_CUTOFF_;
    private static final SubLList $list66;
    private static final SubLList $list67;
    private static final SubLList $list68;
    private static final SubLList $list69;
    private static final SubLList $list70;
    private static final SubLSymbol $sym71$_GT_EDGE_LIST_RETURN__;
    private static final SubLSymbol $sym72$CPUSH;
    private static final SubLSymbol $sym73$LIST;
    private static final SubLSymbol $sym74$GAF_ARG1;
    private static final SubLSymbol $sym75$GAF_ARG2;
    private static final SubLList $list76;
    private static final SubLList $list77;
    private static final SubLList $list78;
    private static final SubLSymbol $sym79$_GT_MARKING_TABLE_;
    private static final SubLList $list80;
    private static final SubLList $list81;
    private static final SubLList $list82;
    private static final SubLList $list83;
    private static final SubLList $list84;
    
    @SubLTranslatedFile.SubL(source = "cycl/gt-macros.lisp", position = 444L)
    public static SubLObject with_gt_mode(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject mode = (SubLObject)gt_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)gt_macros.$list0);
        mode = current.first();
        final SubLObject body;
        current = (body = current.rest());
        return (SubLObject)ConsesLow.list((SubLObject)gt_macros.$sym1$PROGN, (SubLObject)ConsesLow.list((SubLObject)gt_macros.$sym2$MUST, (SubLObject)ConsesLow.list((SubLObject)gt_macros.$sym3$GT_MODE_, mode), (SubLObject)gt_macros.$str4$invalid_gt_mode___a, mode), (SubLObject)ConsesLow.listS((SubLObject)gt_macros.$sym5$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)gt_macros.$sym6$_GT_MODE_, mode)), ConsesLow.append(body, (SubLObject)gt_macros.NIL)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/gt-macros.lisp", position = 712L)
    public static SubLObject with_gt_lock(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return (SubLObject)ConsesLow.list((SubLObject)gt_macros.$sym1$PROGN, reader.bq_cons((SubLObject)gt_macros.$sym7$WITH_SBHL_READER_LOCK, ConsesLow.append(body, (SubLObject)gt_macros.$list8)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/gt-macros.lisp", position = 1057L)
    public static SubLObject with_gt_truth(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject truth = (SubLObject)gt_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)gt_macros.$list9);
        truth = current.first();
        final SubLObject body;
        current = (body = current.rest());
        return (SubLObject)ConsesLow.list((SubLObject)gt_macros.$sym1$PROGN, (SubLObject)ConsesLow.listS((SubLObject)gt_macros.$sym10$CHECK_TYPE, truth, (SubLObject)gt_macros.$list11), (SubLObject)ConsesLow.listS((SubLObject)gt_macros.$sym5$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)gt_macros.$sym12$_GT_TRUTH_, truth)), ConsesLow.append(body, (SubLObject)gt_macros.NIL)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/gt-macros.lisp", position = 1273L)
    public static SubLObject with_gt_pred(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject pred = (SubLObject)gt_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)gt_macros.$list13);
        pred = current.first();
        final SubLObject body;
        current = (body = current.rest());
        return (SubLObject)ConsesLow.list((SubLObject)gt_macros.$sym1$PROGN, (SubLObject)ConsesLow.listS((SubLObject)gt_macros.$sym10$CHECK_TYPE, pred, (SubLObject)gt_macros.$list14), (SubLObject)ConsesLow.listS((SubLObject)gt_macros.$sym5$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)gt_macros.$sym15$_GT_PRED_, pred)), ConsesLow.append(body, (SubLObject)gt_macros.NIL)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/gt-macros.lisp", position = 1482L)
    public static SubLObject with_gt_combine_fn(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject fn = (SubLObject)gt_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)gt_macros.$list16);
        fn = current.first();
        final SubLObject body;
        current = (body = current.rest());
        return (SubLObject)ConsesLow.list((SubLObject)gt_macros.$sym1$PROGN, (SubLObject)ConsesLow.listS((SubLObject)gt_macros.$sym10$CHECK_TYPE, fn, (SubLObject)gt_macros.$list17), (SubLObject)ConsesLow.listS((SubLObject)gt_macros.$sym5$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)gt_macros.$sym18$_GT_COMBINE_FN_, fn)), ConsesLow.append(body, (SubLObject)gt_macros.NIL)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/gt-macros.lisp", position = 1707L)
    public static SubLObject with_gt_base_fn(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject fn = (SubLObject)gt_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)gt_macros.$list16);
        fn = current.first();
        final SubLObject body;
        current = (body = current.rest());
        return (SubLObject)ConsesLow.list((SubLObject)gt_macros.$sym1$PROGN, (SubLObject)ConsesLow.listS((SubLObject)gt_macros.$sym10$CHECK_TYPE, fn, (SubLObject)gt_macros.$list17), (SubLObject)ConsesLow.listS((SubLObject)gt_macros.$sym5$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)gt_macros.$sym19$_GT_BASE_FN_, fn)), ConsesLow.append(body, (SubLObject)gt_macros.NIL)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/gt-macros.lisp", position = 1926L)
    public static SubLObject with_gt_step_fn(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject fn = (SubLObject)gt_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)gt_macros.$list16);
        fn = current.first();
        final SubLObject body;
        current = (body = current.rest());
        return (SubLObject)ConsesLow.list((SubLObject)gt_macros.$sym1$PROGN, (SubLObject)ConsesLow.list((SubLObject)gt_macros.$sym20$PWHEN, fn, (SubLObject)ConsesLow.listS((SubLObject)gt_macros.$sym10$CHECK_TYPE, fn, (SubLObject)gt_macros.$list17)), (SubLObject)ConsesLow.listS((SubLObject)gt_macros.$sym5$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)gt_macros.$sym21$_GT_STEP_FN_, fn)), ConsesLow.append(body, (SubLObject)gt_macros.NIL)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/gt-macros.lisp", position = 2156L)
    public static SubLObject with_tt_step_fn(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject fn = (SubLObject)gt_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)gt_macros.$list16);
        fn = current.first();
        final SubLObject body;
        current = (body = current.rest());
        return (SubLObject)ConsesLow.list((SubLObject)gt_macros.$sym1$PROGN, (SubLObject)ConsesLow.listS((SubLObject)gt_macros.$sym10$CHECK_TYPE, fn, (SubLObject)gt_macros.$list17), (SubLObject)ConsesLow.listS((SubLObject)gt_macros.$sym5$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)gt_macros.$sym22$_TT_STEP_FN_, fn)), ConsesLow.append(body, (SubLObject)gt_macros.NIL)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/gt-macros.lisp", position = 2375L)
    public static SubLObject with_gt_gather_fn(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject fn = (SubLObject)gt_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)gt_macros.$list16);
        fn = current.first();
        final SubLObject body;
        current = (body = current.rest());
        return (SubLObject)ConsesLow.list((SubLObject)gt_macros.$sym1$PROGN, (SubLObject)ConsesLow.list((SubLObject)gt_macros.$sym2$MUST, (SubLObject)ConsesLow.list((SubLObject)gt_macros.$sym23$FUNCTION_SPEC_P, fn), (SubLObject)gt_macros.$str24$_a_is_not_a_function, fn), (SubLObject)ConsesLow.listS((SubLObject)gt_macros.$sym5$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)gt_macros.$sym25$_GT_GATHER_FN_, fn)), ConsesLow.append(body, (SubLObject)gt_macros.NIL)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/gt-macros.lisp", position = 2542L)
    public static SubLObject with_gt_compose_fn(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject fn = (SubLObject)gt_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)gt_macros.$list16);
        fn = current.first();
        final SubLObject body;
        current = (body = current.rest());
        return (SubLObject)ConsesLow.list((SubLObject)gt_macros.$sym1$PROGN, (SubLObject)ConsesLow.listS((SubLObject)gt_macros.$sym10$CHECK_TYPE, fn, (SubLObject)gt_macros.$list17), (SubLObject)ConsesLow.listS((SubLObject)gt_macros.$sym5$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)gt_macros.$sym26$_GT_COMPOSE_FN_, fn)), ConsesLow.append(body, (SubLObject)gt_macros.NIL)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/gt-macros.lisp", position = 2767L)
    public static SubLObject with_gt_compare_fn(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject fn = (SubLObject)gt_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)gt_macros.$list16);
        fn = current.first();
        final SubLObject body;
        current = (body = current.rest());
        return (SubLObject)ConsesLow.list((SubLObject)gt_macros.$sym1$PROGN, (SubLObject)ConsesLow.listS((SubLObject)gt_macros.$sym10$CHECK_TYPE, fn, (SubLObject)gt_macros.$list17), (SubLObject)ConsesLow.listS((SubLObject)gt_macros.$sym5$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)gt_macros.$sym27$_GT_COMPARE_FN_, fn)), ConsesLow.append(body, (SubLObject)gt_macros.NIL)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/gt-macros.lisp", position = 2992L)
    public static SubLObject with_gt_target(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject target = (SubLObject)gt_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)gt_macros.$list28);
        target = current.first();
        final SubLObject body;
        current = (body = current.rest());
        return (SubLObject)ConsesLow.listS((SubLObject)gt_macros.$sym5$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)gt_macros.$sym29$_GT_TARGET_, target)), ConsesLow.append(body, (SubLObject)gt_macros.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/gt-macros.lisp", position = 3164L)
    public static SubLObject with_gt_searcher(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject searcher = (SubLObject)gt_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)gt_macros.$list30);
        searcher = current.first();
        final SubLObject body;
        current = (body = current.rest());
        return (SubLObject)ConsesLow.listS((SubLObject)gt_macros.$sym5$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)gt_macros.$sym31$_GT_SEARCHER_, searcher)), ConsesLow.append(body, (SubLObject)gt_macros.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/gt-macros.lisp", position = 3344L)
    public static SubLObject with_gt_compose_pred(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject pred = (SubLObject)gt_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)gt_macros.$list13);
        pred = current.first();
        final SubLObject body;
        current = (body = current.rest());
        return (SubLObject)ConsesLow.list((SubLObject)gt_macros.$sym1$PROGN, (SubLObject)ConsesLow.listS((SubLObject)gt_macros.$sym10$CHECK_TYPE, pred, (SubLObject)gt_macros.$list14), (SubLObject)ConsesLow.listS((SubLObject)gt_macros.$sym5$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)gt_macros.$sym32$_GT_COMPOSE_PRED_, pred)), ConsesLow.append(body, (SubLObject)gt_macros.NIL)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/gt-macros.lisp", position = 3570L)
    public static SubLObject with_gt_compose_index_arg(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject arg = (SubLObject)gt_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)gt_macros.$list33);
        arg = current.first();
        final SubLObject body;
        current = (body = current.rest());
        return (SubLObject)ConsesLow.list((SubLObject)gt_macros.$sym1$PROGN, (SubLObject)ConsesLow.listS((SubLObject)gt_macros.$sym10$CHECK_TYPE, arg, (SubLObject)gt_macros.$list34), (SubLObject)ConsesLow.listS((SubLObject)gt_macros.$sym5$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)gt_macros.$sym35$_GT_COMPOSE_INDEX_ARG_, arg)), ConsesLow.append(body, (SubLObject)gt_macros.NIL)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/gt-macros.lisp", position = 3804L)
    public static SubLObject with_gt_compose_gather_arg(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject arg = (SubLObject)gt_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)gt_macros.$list33);
        arg = current.first();
        final SubLObject body;
        current = (body = current.rest());
        return (SubLObject)ConsesLow.list((SubLObject)gt_macros.$sym1$PROGN, (SubLObject)ConsesLow.listS((SubLObject)gt_macros.$sym10$CHECK_TYPE, arg, (SubLObject)gt_macros.$list34), (SubLObject)ConsesLow.listS((SubLObject)gt_macros.$sym5$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)gt_macros.$sym36$_GT_COMPOSE_GATHER_ARG_, arg)), ConsesLow.append(body, (SubLObject)gt_macros.NIL)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/gt-macros.lisp", position = 4040L)
    public static SubLObject with_gt_link_support(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject sup = (SubLObject)gt_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)gt_macros.$list37);
        sup = current.first();
        final SubLObject body;
        current = (body = current.rest());
        return (SubLObject)ConsesLow.listS((SubLObject)gt_macros.$sym5$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)gt_macros.$sym38$_GT_LINK_SUPPORT_, sup)), ConsesLow.append(body, (SubLObject)gt_macros.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/gt-macros.lisp", position = 4143L)
    public static SubLObject unless_gt_error(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return (SubLObject)ConsesLow.listS((SubLObject)gt_macros.$sym39$CCATCH_IGNORE, (SubLObject)gt_macros.$kw40$GT_ERROR, ConsesLow.append(body, (SubLObject)gt_macros.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/gt-macros.lisp", position = 4256L)
    public static SubLObject without_gt_type_checking(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return (SubLObject)ConsesLow.listS((SubLObject)gt_macros.$sym5$CLET, (SubLObject)gt_macros.$list41, ConsesLow.append(body, (SubLObject)gt_macros.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/gt-macros.lisp", position = 4373L)
    public static SubLObject gt_check_type(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject v_object = (SubLObject)gt_macros.NIL;
        SubLObject type = (SubLObject)gt_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)gt_macros.$list42);
        v_object = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)gt_macros.$list42);
        type = current.first();
        current = current.rest();
        final SubLObject level = (SubLObject)(current.isCons() ? current.first() : gt_macros.THREE_INTEGER);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)gt_macros.$list42);
        current = current.rest();
        if (gt_macros.NIL == current) {
            return (SubLObject)ConsesLow.list((SubLObject)gt_macros.$sym43$PUNLESS, (SubLObject)gt_macros.$list44, (SubLObject)ConsesLow.list((SubLObject)gt_macros.$sym45$GT_CHECK_TYPE_INTERNAL, v_object, type, level));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)gt_macros.$list42);
        return (SubLObject)gt_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/gt-macros.lisp", position = 4694L)
    public static SubLObject possibly_with_gt_cutoff(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return (SubLObject)ConsesLow.list((SubLObject)gt_macros.$sym5$CLET, (SubLObject)gt_macros.$list47, (SubLObject)gt_macros.$list48, (SubLObject)gt_macros.$list49, (SubLObject)gt_macros.$list50, (SubLObject)ConsesLow.listS((SubLObject)gt_macros.$sym43$PUNLESS, (SubLObject)gt_macros.$sym51$CUTOFF_REACHED, ConsesLow.append(body, (SubLObject)gt_macros.NIL)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/gt-macros.lisp", position = 5627L)
    public static SubLObject with_gt_depth_cutoff(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject cutoff = (SubLObject)gt_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)gt_macros.$list52);
        cutoff = current.first();
        final SubLObject body;
        current = (body = current.rest());
        return (SubLObject)ConsesLow.listS((SubLObject)gt_macros.$sym5$CLET, (SubLObject)ConsesLow.list((SubLObject)gt_macros.$list53, (SubLObject)ConsesLow.list((SubLObject)gt_macros.$sym54$_GT_DEPTH_CUTOFF_, cutoff)), ConsesLow.append(body, (SubLObject)gt_macros.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/gt-macros.lisp", position = 5840L)
    public static SubLObject with_gt_time_cutoff(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject seconds = (SubLObject)gt_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)gt_macros.$list55);
        seconds = current.first();
        final SubLObject body;
        current = (body = current.rest());
        return (SubLObject)ConsesLow.listS((SubLObject)gt_macros.$sym5$CLET, (SubLObject)ConsesLow.listS((SubLObject)gt_macros.$list56, (SubLObject)ConsesLow.list((SubLObject)gt_macros.$sym57$_GT_TIME_CUTOFF_, seconds), (SubLObject)gt_macros.$list58), ConsesLow.append(body, (SubLObject)gt_macros.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/gt-macros.lisp", position = 6101L)
    public static SubLObject with_gt_answers_cutoff(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject num = (SubLObject)gt_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)gt_macros.$list59);
        num = current.first();
        final SubLObject body;
        current = (body = current.rest());
        return (SubLObject)ConsesLow.list((SubLObject)gt_macros.$sym60$PIF, (SubLObject)ConsesLow.listS((SubLObject)gt_macros.$sym61$_, num, (SubLObject)gt_macros.$list62), (SubLObject)gt_macros.$list63, (SubLObject)ConsesLow.listS((SubLObject)gt_macros.$sym5$CLET, (SubLObject)ConsesLow.listS((SubLObject)gt_macros.$list64, (SubLObject)ConsesLow.list((SubLObject)gt_macros.$sym65$_GT_ANSWERS_CUTOFF_, num), (SubLObject)gt_macros.$list66), ConsesLow.append(body, (SubLObject)gt_macros.NIL)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/gt-macros.lisp", position = 6447L)
    public static SubLObject possibly_with_number_of_answers_cutoff(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return (SubLObject)ConsesLow.list((SubLObject)gt_macros.$sym5$CLET, (SubLObject)gt_macros.$list67, (SubLObject)gt_macros.$list68, (SubLObject)ConsesLow.listS((SubLObject)gt_macros.$sym43$PUNLESS, (SubLObject)gt_macros.$sym51$CUTOFF_REACHED, (SubLObject)gt_macros.$list69, ConsesLow.append(body, (SubLObject)gt_macros.NIL)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/gt-macros.lisp", position = 6840L)
    public static SubLObject possibly_with_gt_edge_list_accumulation(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject assertion = (SubLObject)gt_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)gt_macros.$list70);
        assertion = current.first();
        final SubLObject body;
        current = (body = current.rest());
        return (SubLObject)ConsesLow.listS((SubLObject)gt_macros.$sym1$PROGN, (SubLObject)ConsesLow.list((SubLObject)gt_macros.$sym20$PWHEN, (SubLObject)gt_macros.$sym71$_GT_EDGE_LIST_RETURN__, (SubLObject)ConsesLow.listS((SubLObject)gt_macros.$sym72$CPUSH, (SubLObject)ConsesLow.list((SubLObject)gt_macros.$sym73$LIST, (SubLObject)ConsesLow.list((SubLObject)gt_macros.$sym74$GAF_ARG1, assertion), (SubLObject)ConsesLow.list((SubLObject)gt_macros.$sym75$GAF_ARG2, assertion)), (SubLObject)gt_macros.$list76)), ConsesLow.append(body, (SubLObject)gt_macros.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/gt-macros.lisp", position = 7090L)
    public static SubLObject with_gt_edge_list_return(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return (SubLObject)ConsesLow.list((SubLObject)gt_macros.$sym5$CLET, (SubLObject)gt_macros.$list77, reader.bq_cons((SubLObject)gt_macros.$sym1$PROGN, ConsesLow.append(body, (SubLObject)gt_macros.$list76)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/gt-macros.lisp", position = 7324L)
    public static SubLObject gt_search_with_this_hashtable(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject table = (SubLObject)gt_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)gt_macros.$list78);
        table = current.first();
        final SubLObject body;
        current = (body = current.rest());
        return (SubLObject)ConsesLow.listS((SubLObject)gt_macros.$sym5$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)gt_macros.$sym79$_GT_MARKING_TABLE_, table)), ConsesLow.append(body, (SubLObject)gt_macros.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/gt-macros.lisp", position = 7538L)
    public static SubLObject gt_search_with_dynamic_hash(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return (SubLObject)ConsesLow.listS((SubLObject)gt_macros.$sym5$CLET, (SubLObject)gt_macros.$list80, (SubLObject)gt_macros.$list81, ConsesLow.append(body, (SubLObject)gt_macros.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/gt-macros.lisp", position = 7828L)
    public static SubLObject gt_within_transitive_via_arg(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return (SubLObject)ConsesLow.listS((SubLObject)gt_macros.$sym5$CLET, (SubLObject)gt_macros.$list82, ConsesLow.append(body, (SubLObject)gt_macros.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/gt-macros.lisp", position = 8051L)
    public static SubLObject without_gt_sksi(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return (SubLObject)ConsesLow.listS((SubLObject)gt_macros.$sym5$CLET, (SubLObject)gt_macros.$list83, ConsesLow.append(body, (SubLObject)gt_macros.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/gt-macros.lisp", position = 8218L)
    public static SubLObject with_gt_sksi(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return (SubLObject)ConsesLow.listS((SubLObject)gt_macros.$sym5$CLET, (SubLObject)gt_macros.$list84, ConsesLow.append(body, (SubLObject)gt_macros.NIL));
    }
    
    public static SubLObject declare_gt_macros_file() {
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.gt_macros", "with_gt_mode", "WITH-GT-MODE");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.gt_macros", "with_gt_lock", "WITH-GT-LOCK");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.gt_macros", "with_gt_truth", "WITH-GT-TRUTH");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.gt_macros", "with_gt_pred", "WITH-GT-PRED");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.gt_macros", "with_gt_combine_fn", "WITH-GT-COMBINE-FN");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.gt_macros", "with_gt_base_fn", "WITH-GT-BASE-FN");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.gt_macros", "with_gt_step_fn", "WITH-GT-STEP-FN");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.gt_macros", "with_tt_step_fn", "WITH-TT-STEP-FN");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.gt_macros", "with_gt_gather_fn", "WITH-GT-GATHER-FN");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.gt_macros", "with_gt_compose_fn", "WITH-GT-COMPOSE-FN");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.gt_macros", "with_gt_compare_fn", "WITH-GT-COMPARE-FN");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.gt_macros", "with_gt_target", "WITH-GT-TARGET");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.gt_macros", "with_gt_searcher", "WITH-GT-SEARCHER");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.gt_macros", "with_gt_compose_pred", "WITH-GT-COMPOSE-PRED");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.gt_macros", "with_gt_compose_index_arg", "WITH-GT-COMPOSE-INDEX-ARG");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.gt_macros", "with_gt_compose_gather_arg", "WITH-GT-COMPOSE-GATHER-ARG");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.gt_macros", "with_gt_link_support", "WITH-GT-LINK-SUPPORT");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.gt_macros", "unless_gt_error", "UNLESS-GT-ERROR");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.gt_macros", "without_gt_type_checking", "WITHOUT-GT-TYPE-CHECKING");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.gt_macros", "gt_check_type", "GT-CHECK-TYPE");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.gt_macros", "possibly_with_gt_cutoff", "POSSIBLY-WITH-GT-CUTOFF");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.gt_macros", "with_gt_depth_cutoff", "WITH-GT-DEPTH-CUTOFF");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.gt_macros", "with_gt_time_cutoff", "WITH-GT-TIME-CUTOFF");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.gt_macros", "with_gt_answers_cutoff", "WITH-GT-ANSWERS-CUTOFF");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.gt_macros", "possibly_with_number_of_answers_cutoff", "POSSIBLY-WITH-NUMBER-OF-ANSWERS-CUTOFF");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.gt_macros", "possibly_with_gt_edge_list_accumulation", "POSSIBLY-WITH-GT-EDGE-LIST-ACCUMULATION");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.gt_macros", "with_gt_edge_list_return", "WITH-GT-EDGE-LIST-RETURN");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.gt_macros", "gt_search_with_this_hashtable", "GT-SEARCH-WITH-THIS-HASHTABLE");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.gt_macros", "gt_search_with_dynamic_hash", "GT-SEARCH-WITH-DYNAMIC-HASH");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.gt_macros", "gt_within_transitive_via_arg", "GT-WITHIN-TRANSITIVE-VIA-ARG");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.gt_macros", "without_gt_sksi", "WITHOUT-GT-SKSI");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.gt_macros", "with_gt_sksi", "WITH-GT-SKSI");
        return (SubLObject)gt_macros.NIL;
    }
    
    public static SubLObject init_gt_macros_file() {
        gt_macros.$gt_recursion_cutoff$ = SubLFiles.defparameter("*GT-RECURSION-CUTOFF*", (SubLObject)gt_macros.$int46$64);
        return (SubLObject)gt_macros.NIL;
    }
    
    public static SubLObject setup_gt_macros_file() {
        return (SubLObject)gt_macros.NIL;
    }
    
    @Override
	public void declareFunctions() {
        declare_gt_macros_file();
    }
    
    @Override
	public void initializeVariables() {
        init_gt_macros_file();
    }
    
    @Override
	public void runTopLevelForms() {
        setup_gt_macros_file();
    }
    
    static {
        me = (SubLFile)new gt_macros();
        gt_macros.$gt_recursion_cutoff$ = null;
        $list0 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MODE"), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym1$PROGN = SubLObjectFactory.makeSymbol("PROGN");
        $sym2$MUST = SubLObjectFactory.makeSymbol("MUST");
        $sym3$GT_MODE_ = SubLObjectFactory.makeSymbol("GT-MODE?");
        $str4$invalid_gt_mode___a = SubLObjectFactory.makeString("invalid gt mode: ~a");
        $sym5$CLET = SubLObjectFactory.makeSymbol("CLET");
        $sym6$_GT_MODE_ = SubLObjectFactory.makeSymbol("*GT-MODE*");
        $sym7$WITH_SBHL_READER_LOCK = SubLObjectFactory.makeSymbol("WITH-SBHL-READER-LOCK");
        $list8 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol(">="), (SubLObject)SubLObjectFactory.makeSymbol("*GT-TEST-LEVEL*"), (SubLObject)gt_macros.FIVE_INTEGER), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SEARCHED"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SBHL-MARKED-NODES")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)SubLObjectFactory.makeSymbol("SEARCHED"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GT-ERROR"), (SubLObject)gt_macros.THREE_INTEGER, (SubLObject)SubLObjectFactory.makeString("~s marked constants: ~s"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LENGTH"), (SubLObject)SubLObjectFactory.makeSymbol("SEARCHED")), (SubLObject)SubLObjectFactory.makeSymbol("SEARCHED"))))));
        $list9 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TRUTH"), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym10$CHECK_TYPE = SubLObjectFactory.makeSymbol("CHECK-TYPE");
        $list11 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TRUTH-P"));
        $sym12$_GT_TRUTH_ = SubLObjectFactory.makeSymbol("*GT-TRUTH*");
        $list13 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PRED"), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $list14 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FORT-P"));
        $sym15$_GT_PRED_ = SubLObjectFactory.makeSymbol("*GT-PRED*");
        $list16 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FN"), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $list17 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCTION-SPEC-P"));
        $sym18$_GT_COMBINE_FN_ = SubLObjectFactory.makeSymbol("*GT-COMBINE-FN*");
        $sym19$_GT_BASE_FN_ = SubLObjectFactory.makeSymbol("*GT-BASE-FN*");
        $sym20$PWHEN = SubLObjectFactory.makeSymbol("PWHEN");
        $sym21$_GT_STEP_FN_ = SubLObjectFactory.makeSymbol("*GT-STEP-FN*");
        $sym22$_TT_STEP_FN_ = SubLObjectFactory.makeSymbol("*TT-STEP-FN*");
        $sym23$FUNCTION_SPEC_P = SubLObjectFactory.makeSymbol("FUNCTION-SPEC-P");
        $str24$_a_is_not_a_function = SubLObjectFactory.makeString("~a is not a function");
        $sym25$_GT_GATHER_FN_ = SubLObjectFactory.makeSymbol("*GT-GATHER-FN*");
        $sym26$_GT_COMPOSE_FN_ = SubLObjectFactory.makeSymbol("*GT-COMPOSE-FN*");
        $sym27$_GT_COMPARE_FN_ = SubLObjectFactory.makeSymbol("*GT-COMPARE-FN*");
        $list28 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TARGET"), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym29$_GT_TARGET_ = SubLObjectFactory.makeSymbol("*GT-TARGET*");
        $list30 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SEARCHER"), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym31$_GT_SEARCHER_ = SubLObjectFactory.makeSymbol("*GT-SEARCHER*");
        $sym32$_GT_COMPOSE_PRED_ = SubLObjectFactory.makeSymbol("*GT-COMPOSE-PRED*");
        $list33 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ARG"), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $list34 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIXNUMP"));
        $sym35$_GT_COMPOSE_INDEX_ARG_ = SubLObjectFactory.makeSymbol("*GT-COMPOSE-INDEX-ARG*");
        $sym36$_GT_COMPOSE_GATHER_ARG_ = SubLObjectFactory.makeSymbol("*GT-COMPOSE-GATHER-ARG*");
        $list37 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SUP"), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym38$_GT_LINK_SUPPORT_ = SubLObjectFactory.makeSymbol("*GT-LINK-SUPPORT*");
        $sym39$CCATCH_IGNORE = SubLObjectFactory.makeSymbol("CCATCH-IGNORE");
        $kw40$GT_ERROR = SubLObjectFactory.makeKeyword("GT-ERROR");
        $list41 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*SUSPEND-GT-TYPE-CHECKING?*"), (SubLObject)gt_macros.T));
        $list42 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OBJECT"), (SubLObject)SubLObjectFactory.makeSymbol("TYPE"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LEVEL"), (SubLObject)gt_macros.THREE_INTEGER));
        $sym43$PUNLESS = SubLObjectFactory.makeSymbol("PUNLESS");
        $list44 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("COR"), (SubLObject)SubLObjectFactory.makeSymbol("*SUSPEND-TYPE-CHECKING?*"), (SubLObject)SubLObjectFactory.makeSymbol("*SUSPEND-GT-TYPE-CHECKING?*"), (SubLObject)SubLObjectFactory.makeSymbol("*IGNORE-MUSTS?*"));
        $sym45$GT_CHECK_TYPE_INTERNAL = SubLObjectFactory.makeSymbol("GT-CHECK-TYPE-INTERNAL");
        $int46$64 = SubLObjectFactory.makeInteger(64);
        $list47 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CUTOFF-REACHED"), (SubLObject)gt_macros.NIL), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*GT-RECURSION-CUTOFF*"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FWHEN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INTEGERP"), (SubLObject)SubLObjectFactory.makeSymbol("*GT-RECURSION-CUTOFF*")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("-"), (SubLObject)SubLObjectFactory.makeSymbol("*GT-RECURSION-CUTOFF*"), (SubLObject)gt_macros.ONE_INTEGER))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*GT-DEPTH-CUTOFF*"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("-"), (SubLObject)SubLObjectFactory.makeSymbol("*GT-DEPTH-CUTOFF*"), (SubLObject)gt_macros.ONE_INTEGER)));
        $list48 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CAND"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INTEGERP"), (SubLObject)SubLObjectFactory.makeSymbol("*GT-RECURSION-CUTOFF*")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("<"), (SubLObject)SubLObjectFactory.makeSymbol("*GT-RECURSION-CUTOFF*"), (SubLObject)gt_macros.ZERO_INTEGER)), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PIF-FEATURE"), (SubLObject)SubLObjectFactory.makeKeyword("CYC-MAINT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ERROR"), (SubLObject)SubLObjectFactory.makeString("GT recursion limit reached.  Please report this problem on bug 15244.")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ERROR"), (SubLObject)SubLObjectFactory.makeString("GT recursion limit reached."))));
        $list49 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)SubLObjectFactory.makeSymbol("*GT-DEPTH-CUTOFF?*"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("<"), (SubLObject)SubLObjectFactory.makeSymbol("*GT-DEPTH-CUTOFF*"), (SubLObject)gt_macros.ZERO_INTEGER), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("CUTOFF-REACHED"), (SubLObject)gt_macros.T)));
        $list50 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)SubLObjectFactory.makeSymbol("*GT-TIME-CUTOFF?*"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("<"), (SubLObject)SubLObjectFactory.makeSymbol("*GT-TIME-CUTOFF*"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("/"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("-"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-INTERNAL-REAL-TIME")), (SubLObject)SubLObjectFactory.makeSymbol("*GT-INITIAL-TIME*")), (SubLObject)SubLObjectFactory.makeSymbol("*INTERNAL-TIME-UNITS-PER-SECOND*"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("CUTOFF-REACHED"), (SubLObject)gt_macros.T)));
        $sym51$CUTOFF_REACHED = SubLObjectFactory.makeSymbol("CUTOFF-REACHED");
        $list52 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CUTOFF"), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $list53 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*GT-DEPTH-CUTOFF?*"), (SubLObject)gt_macros.T);
        $sym54$_GT_DEPTH_CUTOFF_ = SubLObjectFactory.makeSymbol("*GT-DEPTH-CUTOFF*");
        $list55 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SECONDS"), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $list56 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*GT-TIME-CUTOFF?*"), (SubLObject)gt_macros.T);
        $sym57$_GT_TIME_CUTOFF_ = SubLObjectFactory.makeSymbol("*GT-TIME-CUTOFF*");
        $list58 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*GT-INITIAL-TIME*"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-INTERNAL-REAL-TIME"))));
        $list59 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NUM"), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym60$PIF = SubLObjectFactory.makeSymbol("PIF");
        $sym61$_ = SubLObjectFactory.makeSymbol("<");
        $list62 = ConsesLow.list((SubLObject)gt_macros.ONE_INTEGER);
        $list63 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GT-ERROR"), (SubLObject)gt_macros.THREE_INTEGER, (SubLObject)SubLObjectFactory.makeString("illegal value for number of answers cutoff. try a bigger one"));
        $list64 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*GT-ANSWERS-CUTOFF?*"), (SubLObject)gt_macros.T);
        $sym65$_GT_ANSWERS_CUTOFF_ = SubLObjectFactory.makeSymbol("*GT-ANSWERS-CUTOFF*");
        $list66 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*GT-ANSWERS-SO-FAR*"), (SubLObject)gt_macros.ZERO_INTEGER));
        $list67 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CUTOFF-REACHED"), (SubLObject)gt_macros.NIL));
        $list68 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)SubLObjectFactory.makeSymbol("*GT-ANSWERS-CUTOFF?*"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PWHEN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol(">="), (SubLObject)SubLObjectFactory.makeSymbol("*GT-ANSWERS-SO-FAR*"), (SubLObject)SubLObjectFactory.makeSymbol("*GT-ANSWERS-CUTOFF*")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MAPPING-FINISHED")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("CUTOFF-REACHED"), (SubLObject)gt_macros.T)));
        $list69 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CINC"), (SubLObject)SubLObjectFactory.makeSymbol("*GT-ANSWERS-SO-FAR*"));
        $list70 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ASSERTION"), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym71$_GT_EDGE_LIST_RETURN__ = SubLObjectFactory.makeSymbol("*GT-EDGE-LIST-RETURN?*");
        $sym72$CPUSH = SubLObjectFactory.makeSymbol("CPUSH");
        $sym73$LIST = SubLObjectFactory.makeSymbol("LIST");
        $sym74$GAF_ARG1 = SubLObjectFactory.makeSymbol("GAF-ARG1");
        $sym75$GAF_ARG2 = SubLObjectFactory.makeSymbol("GAF-ARG2");
        $list76 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*GT-EDGE-LIST*"));
        $list77 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*GT-EDGE-LIST-RETURN?*"), (SubLObject)gt_macros.T), (SubLObject)SubLObjectFactory.makeSymbol("*GT-EDGE-LIST*"));
        $list78 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TABLE"), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym79$_GT_MARKING_TABLE_ = SubLObjectFactory.makeSymbol("*GT-MARKING-TABLE*");
        $list80 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*GT-TARGET-MARKING-TABLE*"), (SubLObject)SubLObjectFactory.makeSymbol("*GT-MARKING-TABLE*")), (SubLObject)SubLObjectFactory.makeSymbol("*GT-MARKING-TABLE*"));
        $list81 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("*GT-MARKING-TABLE*"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MAKE-HASH-TABLE"), (SubLObject)SubLObjectFactory.makeInteger(128)));
        $list82 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*GT-WITHIN-TRANSITIVE-VIA-ARG?*"), (SubLObject)gt_macros.T));
        $list83 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*GT-USE-SKSI?*"), (SubLObject)gt_macros.NIL));
        $list84 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*GT-USE-SKSI?*"), (SubLObject)gt_macros.T));
    }
}

/*

	Total time: 149 ms
	
*/