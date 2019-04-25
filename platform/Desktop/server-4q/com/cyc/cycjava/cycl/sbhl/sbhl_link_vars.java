package com.cyc.cycjava.cycl.sbhl;

import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ReadWriteLocks;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.cycjava.cycl.hlmt;
import com.cyc.cycjava.cycl.forts;
import com.cyc.cycjava.cycl.subl_promotions;
import com.cyc.cycjava.cycl.enumeration_types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class sbhl_link_vars extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.sbhl.sbhl_link_vars";
    public static final String myFingerPrint = "9ed2d63cd293830567aeae1e4297fc9fc9a55414ca0d1c91c1b395bd7b3ba717";
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-link-vars.lisp", position = 759L)
    private static SubLSymbol $sbhl_directions$;
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-link-vars.lisp", position = 954L)
    private static SubLSymbol $sbhl_directed_directions$;
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-link-vars.lisp", position = 1081L)
    private static SubLSymbol $sbhl_forward_directed_direction$;
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-link-vars.lisp", position = 1224L)
    private static SubLSymbol $sbhl_forward_directed_direction_as_list$;
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-link-vars.lisp", position = 1389L)
    private static SubLSymbol $sbhl_backward_directed_direction$;
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-link-vars.lisp", position = 1532L)
    private static SubLSymbol $sbhl_backward_directed_direction_as_list$;
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-link-vars.lisp", position = 1696L)
    private static SubLSymbol $sbhl_undirected_direction$;
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-link-vars.lisp", position = 1803L)
    private static SubLSymbol $sbhl_undirected_direction_as_list$;
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-link-vars.lisp", position = 4853L)
    public static SubLSymbol $sbhl_link_direction$;
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-link-vars.lisp", position = 7638L)
    private static SubLSymbol $sbhl_link_truth_values$;
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-link-vars.lisp", position = 7867L)
    public static SubLSymbol $sbhl_true_link_truth_values$;
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-link-vars.lisp", position = 9984L)
    public static SubLSymbol $sbhl_randomize_lists_p$;
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-link-vars.lisp", position = 10911L)
    public static SubLSymbol $sbhl_link_mt$;
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-link-vars.lisp", position = 11212L)
    public static SubLSymbol $sbhl_link_tv$;
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-link-vars.lisp", position = 11438L)
    public static SubLSymbol $sbhl_link_generator$;
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-link-vars.lisp", position = 11743L)
    public static SubLSymbol $sbhl_rw_lock$;
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-link-vars.lisp", position = 12113L)
    public static SubLSymbol $added_assertion$;
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-link-vars.lisp", position = 12198L)
    public static SubLSymbol $added_source$;
    private static final SubLList $list0;
    private static final SubLList $list1;
    private static final SubLSymbol $kw2$PREDICATE;
    private static final SubLList $list3;
    private static final SubLSymbol $kw4$INVERSE;
    private static final SubLList $list5;
    private static final SubLSymbol $kw6$LINK;
    private static final SubLList $list7;
    private static final SubLSymbol $kw8$ERROR;
    private static final SubLString $str9$_A_is_not_a__A;
    private static final SubLSymbol $sym10$SBHL_DIRECTION_P;
    private static final SubLSymbol $kw11$CERROR;
    private static final SubLString $str12$continue_anyway;
    private static final SubLSymbol $kw13$WARN;
    private static final SubLString $str14$_A_is_not_a_valid__sbhl_type_erro;
    private static final SubLList $list15;
    private static final SubLSymbol $sym16$CLET;
    private static final SubLSymbol $sym17$_SBHL_LINK_DIRECTION_;
    private static final SubLList $list18;
    private static final SubLSymbol $sym19$WITH_SBHL_LINK_DIRECTION;
    private static final SubLList $list20;
    private static final SubLList $list21;
    private static final SubLSymbol $sym22$GET_SBHL_MODULE_FORWARD_DIRECTION;
    private static final SubLList $list23;
    private static final SubLList $list24;
    private static final SubLList $list25;
    private static final SubLList $list26;
    private static final SubLSymbol $sym27$DO_SET_OR_LIST;
    private static final SubLSymbol $sym28$_SBHL_TRUE_LINK_TRUTH_VALUES_;
    private static final SubLSymbol $kw29$DONE;
    private static final SubLSymbol $kw30$TRUE;
    private static final SubLSymbol $kw31$MONOTONIC;
    private static final SubLObject $const32$MonotonicallyTrue;
    private static final SubLSymbol $kw33$DEFAULT;
    private static final SubLObject $const34$DefaultTrue;
    private static final SubLSymbol $kw35$FALSE;
    private static final SubLObject $const36$MonotonicallyFalse;
    private static final SubLObject $const37$DefaultFalse;
    private static final SubLSymbol $kw38$UNKNOWN;
    private static final SubLString $str39$could_not_compute_an_SBHL_tv_from;
    private static final SubLList $list40;
    private static final SubLList $list41;
    private static final SubLSymbol $sym42$NEW_LIST;
    private static final SubLSymbol $sym43$FIF;
    private static final SubLList $list44;
    private static final SubLSymbol $sym45$RANDOMIZE_LIST;
    private static final SubLSymbol $sym46$SMART_CSOME;
    private static final SubLString $str47$SBHL;
    private static final SubLSymbol $sym48$WITH_WRITER_LOCK;
    private static final SubLList $list49;
    private static final SubLSymbol $sym50$WITH_READER_LOCK;
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-link-vars.lisp", position = 1934L)
    public static SubLObject sbhl_direction_p(final SubLObject direction) {
        return (SubLObject)SubLObjectFactory.makeBoolean(sbhl_link_vars.NIL != sbhl_directed_direction_p(direction) || sbhl_link_vars.NIL != sbhl_undirected_direction_p(direction));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-link-vars.lisp", position = 2770L)
    public static SubLObject sbhl_directed_direction_p(final SubLObject direction) {
        return (SubLObject)SubLObjectFactory.makeBoolean(direction.eql(sbhl_link_vars.$sbhl_forward_directed_direction$.getGlobalValue()) || direction.eql(sbhl_link_vars.$sbhl_backward_directed_direction$.getGlobalValue()));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-link-vars.lisp", position = 3021L)
    public static SubLObject sbhl_undirected_direction_p(final SubLObject direction) {
        return Equality.eq(direction, sbhl_link_vars.$sbhl_undirected_direction$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-link-vars.lisp", position = 3213L)
    public static SubLObject get_sbhl_directed_directions() {
        return sbhl_link_vars.$sbhl_directed_directions$.getGlobalValue();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-link-vars.lisp", position = 3346L)
    public static SubLObject get_sbhl_forward_directed_direction() {
        return sbhl_link_vars.$sbhl_forward_directed_direction$.getGlobalValue();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-link-vars.lisp", position = 3543L)
    public static SubLObject sbhl_forward_directed_direction_p(final SubLObject direction) {
        return Equality.eq(direction, get_sbhl_forward_directed_direction());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-link-vars.lisp", position = 3759L)
    public static SubLObject get_sbhl_forward_directed_direction_as_list() {
        return sbhl_link_vars.$sbhl_forward_directed_direction_as_list$.getGlobalValue();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-link-vars.lisp", position = 3943L)
    public static SubLObject get_sbhl_backward_directed_direction() {
        return sbhl_link_vars.$sbhl_backward_directed_direction$.getGlobalValue();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-link-vars.lisp", position = 4143L)
    public static SubLObject sbhl_backward_directed_direction_p(final SubLObject direction) {
        return Equality.eq(direction, get_sbhl_backward_directed_direction());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-link-vars.lisp", position = 4362L)
    public static SubLObject get_sbhl_backward_directed_direction_as_list() {
        return sbhl_link_vars.$sbhl_backward_directed_direction_as_list$.getGlobalValue();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-link-vars.lisp", position = 4549L)
    public static SubLObject get_sbhl_undirected_direction() {
        return sbhl_link_vars.$sbhl_undirected_direction$.getGlobalValue();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-link-vars.lisp", position = 4693L)
    public static SubLObject get_sbhl_undirected_direction_as_list() {
        return sbhl_link_vars.$sbhl_undirected_direction_as_list$.getGlobalValue();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-link-vars.lisp", position = 5028L)
    public static SubLObject get_sbhl_link_direction() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return sbhl_link_vars.$sbhl_link_direction$.getDynamicValue(thread);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-link-vars.lisp", position = 5177L)
    public static SubLObject get_sbhl_opposite_link_direction() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (get_sbhl_link_direction().eql(get_sbhl_forward_directed_direction())) {
            return get_sbhl_backward_directed_direction();
        }
        if (get_sbhl_link_direction().eql(get_sbhl_backward_directed_direction())) {
            return get_sbhl_forward_directed_direction();
        }
        if (get_sbhl_link_direction().eql(get_sbhl_undirected_direction())) {
            return get_sbhl_undirected_direction();
        }
        if (sbhl_link_vars.NIL != sbhl_paranoia.sbhl_object_type_checking_p() && sbhl_link_vars.NIL == sbhl_direction_p(sbhl_link_vars.$sbhl_link_direction$.getDynamicValue(thread))) {
            final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
            if (pcase_var.eql((SubLObject)sbhl_link_vars.$kw8$ERROR)) {
                sbhl_paranoia.sbhl_error((SubLObject)sbhl_link_vars.ONE_INTEGER, (SubLObject)sbhl_link_vars.$str9$_A_is_not_a__A, sbhl_link_vars.$sbhl_link_direction$.getDynamicValue(thread), (SubLObject)sbhl_link_vars.$sym10$SBHL_DIRECTION_P, (SubLObject)sbhl_link_vars.UNPROVIDED, (SubLObject)sbhl_link_vars.UNPROVIDED, (SubLObject)sbhl_link_vars.UNPROVIDED);
            }
            else if (pcase_var.eql((SubLObject)sbhl_link_vars.$kw11$CERROR)) {
                sbhl_paranoia.sbhl_cerror((SubLObject)sbhl_link_vars.ONE_INTEGER, (SubLObject)sbhl_link_vars.$str12$continue_anyway, (SubLObject)sbhl_link_vars.$str9$_A_is_not_a__A, sbhl_link_vars.$sbhl_link_direction$.getDynamicValue(thread), (SubLObject)sbhl_link_vars.$sym10$SBHL_DIRECTION_P, (SubLObject)sbhl_link_vars.UNPROVIDED, (SubLObject)sbhl_link_vars.UNPROVIDED, (SubLObject)sbhl_link_vars.UNPROVIDED);
            }
            else if (pcase_var.eql((SubLObject)sbhl_link_vars.$kw13$WARN)) {
                Errors.warn((SubLObject)sbhl_link_vars.$str9$_A_is_not_a__A, sbhl_link_vars.$sbhl_link_direction$.getDynamicValue(thread), (SubLObject)sbhl_link_vars.$sym10$SBHL_DIRECTION_P);
            }
            else {
                Errors.warn((SubLObject)sbhl_link_vars.$str14$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                Errors.cerror((SubLObject)sbhl_link_vars.$str12$continue_anyway, (SubLObject)sbhl_link_vars.$str9$_A_is_not_a__A, sbhl_link_vars.$sbhl_link_direction$.getDynamicValue(thread), (SubLObject)sbhl_link_vars.$sym10$SBHL_DIRECTION_P);
            }
        }
        return (SubLObject)sbhl_link_vars.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-link-vars.lisp", position = 5820L)
    public static SubLObject get_sbhl_link_direction_as_list() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (get_sbhl_link_direction().eql(get_sbhl_forward_directed_direction())) {
            return get_sbhl_forward_directed_direction_as_list();
        }
        if (get_sbhl_link_direction().eql(get_sbhl_backward_directed_direction())) {
            return get_sbhl_backward_directed_direction_as_list();
        }
        if (get_sbhl_link_direction().eql(get_sbhl_undirected_direction())) {
            return get_sbhl_undirected_direction_as_list();
        }
        if (sbhl_link_vars.NIL != sbhl_paranoia.sbhl_object_type_checking_p() && sbhl_link_vars.NIL == sbhl_direction_p(sbhl_link_vars.$sbhl_link_direction$.getDynamicValue(thread))) {
            final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
            if (pcase_var.eql((SubLObject)sbhl_link_vars.$kw8$ERROR)) {
                sbhl_paranoia.sbhl_error((SubLObject)sbhl_link_vars.ONE_INTEGER, (SubLObject)sbhl_link_vars.$str9$_A_is_not_a__A, sbhl_link_vars.$sbhl_link_direction$.getDynamicValue(thread), (SubLObject)sbhl_link_vars.$sym10$SBHL_DIRECTION_P, (SubLObject)sbhl_link_vars.UNPROVIDED, (SubLObject)sbhl_link_vars.UNPROVIDED, (SubLObject)sbhl_link_vars.UNPROVIDED);
            }
            else if (pcase_var.eql((SubLObject)sbhl_link_vars.$kw11$CERROR)) {
                sbhl_paranoia.sbhl_cerror((SubLObject)sbhl_link_vars.ONE_INTEGER, (SubLObject)sbhl_link_vars.$str12$continue_anyway, (SubLObject)sbhl_link_vars.$str9$_A_is_not_a__A, sbhl_link_vars.$sbhl_link_direction$.getDynamicValue(thread), (SubLObject)sbhl_link_vars.$sym10$SBHL_DIRECTION_P, (SubLObject)sbhl_link_vars.UNPROVIDED, (SubLObject)sbhl_link_vars.UNPROVIDED, (SubLObject)sbhl_link_vars.UNPROVIDED);
            }
            else if (pcase_var.eql((SubLObject)sbhl_link_vars.$kw13$WARN)) {
                Errors.warn((SubLObject)sbhl_link_vars.$str9$_A_is_not_a__A, sbhl_link_vars.$sbhl_link_direction$.getDynamicValue(thread), (SubLObject)sbhl_link_vars.$sym10$SBHL_DIRECTION_P);
            }
            else {
                Errors.warn((SubLObject)sbhl_link_vars.$str14$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                Errors.cerror((SubLObject)sbhl_link_vars.$str12$continue_anyway, (SubLObject)sbhl_link_vars.$str9$_A_is_not_a__A, sbhl_link_vars.$sbhl_link_direction$.getDynamicValue(thread), (SubLObject)sbhl_link_vars.$sym10$SBHL_DIRECTION_P);
            }
        }
        return (SubLObject)sbhl_link_vars.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-link-vars.lisp", position = 6444L)
    public static SubLObject with_sbhl_link_direction(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject direction = (SubLObject)sbhl_link_vars.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_link_vars.$list15);
        direction = current.first();
        final SubLObject body;
        current = (body = current.rest());
        return (SubLObject)ConsesLow.listS((SubLObject)sbhl_link_vars.$sym16$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)sbhl_link_vars.$sym17$_SBHL_LINK_DIRECTION_, direction)), ConsesLow.append(body, (SubLObject)sbhl_link_vars.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-link-vars.lisp", position = 6609L)
    public static SubLObject with_sbhl_opposite_link_direction(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return (SubLObject)ConsesLow.listS((SubLObject)sbhl_link_vars.$sym16$CLET, (SubLObject)sbhl_link_vars.$list18, ConsesLow.append(body, (SubLObject)sbhl_link_vars.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-link-vars.lisp", position = 6852L)
    public static SubLObject with_sbhl_forward_link_direction(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return (SubLObject)ConsesLow.listS((SubLObject)sbhl_link_vars.$sym19$WITH_SBHL_LINK_DIRECTION, (SubLObject)sbhl_link_vars.$list20, ConsesLow.append(body, (SubLObject)sbhl_link_vars.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-link-vars.lisp", position = 7094L)
    public static SubLObject with_sbhl_forward_link_direction_for_module(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject module = (SubLObject)sbhl_link_vars.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_link_vars.$list21);
        module = current.first();
        final SubLObject body;
        current = (body = current.rest());
        return (SubLObject)ConsesLow.listS((SubLObject)sbhl_link_vars.$sym19$WITH_SBHL_LINK_DIRECTION, (SubLObject)ConsesLow.list((SubLObject)sbhl_link_vars.$sym22$GET_SBHL_MODULE_FORWARD_DIRECTION, module), ConsesLow.append(body, (SubLObject)sbhl_link_vars.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-link-vars.lisp", position = 7393L)
    public static SubLObject with_sbhl_backward_link_direction(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return (SubLObject)ConsesLow.listS((SubLObject)sbhl_link_vars.$sym19$WITH_SBHL_LINK_DIRECTION, (SubLObject)sbhl_link_vars.$list23, ConsesLow.append(body, (SubLObject)sbhl_link_vars.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-link-vars.lisp", position = 7958L)
    public static SubLObject do_sbhl_true_link_truths(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_link_vars.$list26);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject truth_var = (SubLObject)sbhl_link_vars.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_link_vars.$list26);
        truth_var = current.first();
        current = current.rest();
        final SubLObject done_var = (SubLObject)(current.isCons() ? current.first() : sbhl_link_vars.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)sbhl_link_vars.$list26);
        current = current.rest();
        if (sbhl_link_vars.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            return (SubLObject)ConsesLow.listS((SubLObject)sbhl_link_vars.$sym27$DO_SET_OR_LIST, (SubLObject)ConsesLow.list(truth_var, (SubLObject)sbhl_link_vars.$sym28$_SBHL_TRUE_LINK_TRUTH_VALUES_, (SubLObject)sbhl_link_vars.$kw29$DONE, done_var), ConsesLow.append(body, (SubLObject)sbhl_link_vars.NIL));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)sbhl_link_vars.$list26);
        return (SubLObject)sbhl_link_vars.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-link-vars.lisp", position = 8144L)
    public static SubLObject truth_strength_to_sbhl_tv(final SubLObject truth, final SubLObject strength) {
        if (truth == sbhl_link_vars.$kw30$TRUE && strength == sbhl_link_vars.$kw31$MONOTONIC) {
            return sbhl_link_vars.$const32$MonotonicallyTrue;
        }
        if (truth == sbhl_link_vars.$kw30$TRUE && strength == sbhl_link_vars.$kw33$DEFAULT) {
            return sbhl_link_vars.$const34$DefaultTrue;
        }
        if (truth == sbhl_link_vars.$kw35$FALSE && strength == sbhl_link_vars.$kw31$MONOTONIC) {
            return sbhl_link_vars.$const36$MonotonicallyFalse;
        }
        if (truth == sbhl_link_vars.$kw35$FALSE && strength == sbhl_link_vars.$kw33$DEFAULT) {
            return sbhl_link_vars.$const37$DefaultFalse;
        }
        if (truth == sbhl_link_vars.$kw38$UNKNOWN) {
            return (SubLObject)sbhl_link_vars.$kw38$UNKNOWN;
        }
        sbhl_paranoia.sbhl_error((SubLObject)sbhl_link_vars.ONE_INTEGER, (SubLObject)sbhl_link_vars.$str39$could_not_compute_an_SBHL_tv_from, truth, strength, (SubLObject)sbhl_link_vars.UNPROVIDED, (SubLObject)sbhl_link_vars.UNPROVIDED, (SubLObject)sbhl_link_vars.UNPROVIDED);
        return (SubLObject)sbhl_link_vars.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-link-vars.lisp", position = 8775L)
    public static SubLObject support_tv_to_sbhl_tv(final SubLObject support_tv) {
        final SubLObject truth = enumeration_types.tv_truth(support_tv);
        final SubLObject strength = enumeration_types.tv_strength(support_tv);
        return truth_strength_to_sbhl_tv(truth, strength);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-link-vars.lisp", position = 9030L)
    public static SubLObject sbhl_link_truth_value_p(final SubLObject truth) {
        return subl_promotions.memberP(truth, sbhl_link_vars.$sbhl_link_truth_values$.getGlobalValue(), (SubLObject)sbhl_link_vars.UNPROVIDED, (SubLObject)sbhl_link_vars.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-link-vars.lisp", position = 9207L)
    public static SubLObject sbhl_link_nodes_object_p(final SubLObject v_object) {
        SubLObject invalidP = (SubLObject)sbhl_link_vars.NIL;
        if (v_object.isList()) {
            if (sbhl_link_vars.NIL == invalidP) {
                SubLObject csome_list_var = v_object;
                SubLObject link_object = (SubLObject)sbhl_link_vars.NIL;
                link_object = csome_list_var.first();
                while (sbhl_link_vars.NIL == invalidP && sbhl_link_vars.NIL != csome_list_var) {
                    if (sbhl_link_vars.NIL == sbhl_node_object_p(link_object)) {
                        invalidP = (SubLObject)sbhl_link_vars.T;
                    }
                    csome_list_var = csome_list_var.rest();
                    link_object = csome_list_var.first();
                }
            }
        }
        else {
            invalidP = (SubLObject)sbhl_link_vars.T;
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(sbhl_link_vars.NIL == invalidP);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-link-vars.lisp", position = 9605L)
    public static SubLObject sbhl_node_object_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(sbhl_link_vars.NIL != forts.fort_p(v_object) || sbhl_link_vars.NIL != sbhl_time_utilities.sbhl_time_node_object_p(v_object));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-link-vars.lisp", position = 9829L)
    public static SubLObject sbhl_mt_object_p(final SubLObject v_object) {
        return hlmt.chlmt_p(v_object);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-link-vars.lisp", position = 10153L)
    public static SubLObject with_sbhl_randomized(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return (SubLObject)ConsesLow.listS((SubLObject)sbhl_link_vars.$sym16$CLET, (SubLObject)sbhl_link_vars.$list40, ConsesLow.append(body, (SubLObject)sbhl_link_vars.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-link-vars.lisp", position = 10312L)
    public static SubLObject sbhl_randomize_lists_p() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return sbhl_link_vars.$sbhl_randomize_lists_p$.getDynamicValue(thread);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-link-vars.lisp", position = 10453L)
    public static SubLObject sbhl_csome(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_link_vars.$list41);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject elt_var = (SubLObject)sbhl_link_vars.NIL;
        SubLObject list = (SubLObject)sbhl_link_vars.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_link_vars.$list41);
        elt_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_link_vars.$list41);
        list = current.first();
        current = current.rest();
        final SubLObject done_var = (SubLObject)(current.isCons() ? current.first() : sbhl_link_vars.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)sbhl_link_vars.$list41);
        current = current.rest();
        if (sbhl_link_vars.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            final SubLObject new_list = (SubLObject)sbhl_link_vars.$sym42$NEW_LIST;
            return (SubLObject)ConsesLow.list((SubLObject)sbhl_link_vars.$sym16$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(new_list, (SubLObject)ConsesLow.list((SubLObject)sbhl_link_vars.$sym43$FIF, (SubLObject)sbhl_link_vars.$list44, (SubLObject)ConsesLow.list((SubLObject)sbhl_link_vars.$sym45$RANDOMIZE_LIST, list), list))), (SubLObject)ConsesLow.listS((SubLObject)sbhl_link_vars.$sym46$SMART_CSOME, (SubLObject)ConsesLow.list(elt_var, new_list, done_var), ConsesLow.append(body, (SubLObject)sbhl_link_vars.NIL)));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)sbhl_link_vars.$list41);
        return (SubLObject)sbhl_link_vars.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-link-vars.lisp", position = 11086L)
    public static SubLObject get_sbhl_link_mt() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return sbhl_link_vars.$sbhl_link_mt$.getDynamicValue(thread);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-link-vars.lisp", position = 11313L)
    public static SubLObject get_sbhl_link_tv() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return sbhl_link_vars.$sbhl_link_tv$.getDynamicValue(thread);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-link-vars.lisp", position = 11600L)
    public static SubLObject get_sbhl_link_generator() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return sbhl_link_vars.$sbhl_link_generator$.getDynamicValue(thread);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-link-vars.lisp", position = 11889L)
    public static SubLObject with_sbhl_writer_lock(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return (SubLObject)ConsesLow.listS((SubLObject)sbhl_link_vars.$sym48$WITH_WRITER_LOCK, (SubLObject)sbhl_link_vars.$list49, ConsesLow.append(body, (SubLObject)sbhl_link_vars.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-link-vars.lisp", position = 12001L)
    public static SubLObject with_sbhl_reader_lock(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return (SubLObject)ConsesLow.listS((SubLObject)sbhl_link_vars.$sym50$WITH_READER_LOCK, (SubLObject)sbhl_link_vars.$list49, ConsesLow.append(body, (SubLObject)sbhl_link_vars.NIL));
    }
    
    public static SubLObject declare_sbhl_link_vars_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_link_vars", "sbhl_direction_p", "SBHL-DIRECTION-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_link_vars", "sbhl_directed_direction_p", "SBHL-DIRECTED-DIRECTION-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_link_vars", "sbhl_undirected_direction_p", "SBHL-UNDIRECTED-DIRECTION-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_link_vars", "get_sbhl_directed_directions", "GET-SBHL-DIRECTED-DIRECTIONS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_link_vars", "get_sbhl_forward_directed_direction", "GET-SBHL-FORWARD-DIRECTED-DIRECTION", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_link_vars", "sbhl_forward_directed_direction_p", "SBHL-FORWARD-DIRECTED-DIRECTION-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_link_vars", "get_sbhl_forward_directed_direction_as_list", "GET-SBHL-FORWARD-DIRECTED-DIRECTION-AS-LIST", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_link_vars", "get_sbhl_backward_directed_direction", "GET-SBHL-BACKWARD-DIRECTED-DIRECTION", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_link_vars", "sbhl_backward_directed_direction_p", "SBHL-BACKWARD-DIRECTED-DIRECTION-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_link_vars", "get_sbhl_backward_directed_direction_as_list", "GET-SBHL-BACKWARD-DIRECTED-DIRECTION-AS-LIST", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_link_vars", "get_sbhl_undirected_direction", "GET-SBHL-UNDIRECTED-DIRECTION", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_link_vars", "get_sbhl_undirected_direction_as_list", "GET-SBHL-UNDIRECTED-DIRECTION-AS-LIST", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_link_vars", "get_sbhl_link_direction", "GET-SBHL-LINK-DIRECTION", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_link_vars", "get_sbhl_opposite_link_direction", "GET-SBHL-OPPOSITE-LINK-DIRECTION", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_link_vars", "get_sbhl_link_direction_as_list", "GET-SBHL-LINK-DIRECTION-AS-LIST", 0, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.sbhl.sbhl_link_vars", "with_sbhl_link_direction", "WITH-SBHL-LINK-DIRECTION");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.sbhl.sbhl_link_vars", "with_sbhl_opposite_link_direction", "WITH-SBHL-OPPOSITE-LINK-DIRECTION");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.sbhl.sbhl_link_vars", "with_sbhl_forward_link_direction", "WITH-SBHL-FORWARD-LINK-DIRECTION");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.sbhl.sbhl_link_vars", "with_sbhl_forward_link_direction_for_module", "WITH-SBHL-FORWARD-LINK-DIRECTION-FOR-MODULE");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.sbhl.sbhl_link_vars", "with_sbhl_backward_link_direction", "WITH-SBHL-BACKWARD-LINK-DIRECTION");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.sbhl.sbhl_link_vars", "do_sbhl_true_link_truths", "DO-SBHL-TRUE-LINK-TRUTHS");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_link_vars", "truth_strength_to_sbhl_tv", "TRUTH-STRENGTH-TO-SBHL-TV", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_link_vars", "support_tv_to_sbhl_tv", "SUPPORT-TV-TO-SBHL-TV", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_link_vars", "sbhl_link_truth_value_p", "SBHL-LINK-TRUTH-VALUE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_link_vars", "sbhl_link_nodes_object_p", "SBHL-LINK-NODES-OBJECT-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_link_vars", "sbhl_node_object_p", "SBHL-NODE-OBJECT-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_link_vars", "sbhl_mt_object_p", "SBHL-MT-OBJECT-P", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.sbhl.sbhl_link_vars", "with_sbhl_randomized", "WITH-SBHL-RANDOMIZED");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_link_vars", "sbhl_randomize_lists_p", "SBHL-RANDOMIZE-LISTS-P", 0, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.sbhl.sbhl_link_vars", "sbhl_csome", "SBHL-CSOME");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_link_vars", "get_sbhl_link_mt", "GET-SBHL-LINK-MT", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_link_vars", "get_sbhl_link_tv", "GET-SBHL-LINK-TV", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_link_vars", "get_sbhl_link_generator", "GET-SBHL-LINK-GENERATOR", 0, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.sbhl.sbhl_link_vars", "with_sbhl_writer_lock", "WITH-SBHL-WRITER-LOCK");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.sbhl.sbhl_link_vars", "with_sbhl_reader_lock", "WITH-SBHL-READER-LOCK");
        return (SubLObject)sbhl_link_vars.NIL;
    }
    
    public static SubLObject init_sbhl_link_vars_file() {
        sbhl_link_vars.$sbhl_directions$ = SubLFiles.deflexical("*SBHL-DIRECTIONS*", (SubLObject)sbhl_link_vars.$list0);
        sbhl_link_vars.$sbhl_directed_directions$ = SubLFiles.deflexical("*SBHL-DIRECTED-DIRECTIONS*", (SubLObject)sbhl_link_vars.$list1);
        sbhl_link_vars.$sbhl_forward_directed_direction$ = SubLFiles.deflexical("*SBHL-FORWARD-DIRECTED-DIRECTION*", (SubLObject)sbhl_link_vars.$kw2$PREDICATE);
        sbhl_link_vars.$sbhl_forward_directed_direction_as_list$ = SubLFiles.deflexical("*SBHL-FORWARD-DIRECTED-DIRECTION-AS-LIST*", (SubLObject)sbhl_link_vars.$list3);
        sbhl_link_vars.$sbhl_backward_directed_direction$ = SubLFiles.deflexical("*SBHL-BACKWARD-DIRECTED-DIRECTION*", (SubLObject)sbhl_link_vars.$kw4$INVERSE);
        sbhl_link_vars.$sbhl_backward_directed_direction_as_list$ = SubLFiles.deflexical("*SBHL-BACKWARD-DIRECTED-DIRECTION-AS-LIST*", (SubLObject)sbhl_link_vars.$list5);
        sbhl_link_vars.$sbhl_undirected_direction$ = SubLFiles.deflexical("*SBHL-UNDIRECTED-DIRECTION*", (SubLObject)sbhl_link_vars.$kw6$LINK);
        sbhl_link_vars.$sbhl_undirected_direction_as_list$ = SubLFiles.deflexical("*SBHL-UNDIRECTED-DIRECTION-AS-LIST*", (SubLObject)sbhl_link_vars.$list7);
        sbhl_link_vars.$sbhl_link_direction$ = SubLFiles.defparameter("*SBHL-LINK-DIRECTION*", (SubLObject)sbhl_link_vars.NIL);
        sbhl_link_vars.$sbhl_link_truth_values$ = SubLFiles.deflexical("*SBHL-LINK-TRUTH-VALUES*", (SubLObject)sbhl_link_vars.$list24);
        sbhl_link_vars.$sbhl_true_link_truth_values$ = SubLFiles.deflexical("*SBHL-TRUE-LINK-TRUTH-VALUES*", (SubLObject)sbhl_link_vars.$list25);
        sbhl_link_vars.$sbhl_randomize_lists_p$ = SubLFiles.defparameter("*SBHL-RANDOMIZE-LISTS-P*", (SubLObject)sbhl_link_vars.NIL);
        sbhl_link_vars.$sbhl_link_mt$ = SubLFiles.defparameter("*SBHL-LINK-MT*", (SubLObject)sbhl_link_vars.NIL);
        sbhl_link_vars.$sbhl_link_tv$ = SubLFiles.defparameter("*SBHL-LINK-TV*", (SubLObject)sbhl_link_vars.NIL);
        sbhl_link_vars.$sbhl_link_generator$ = SubLFiles.defparameter("*SBHL-LINK-GENERATOR*", (SubLObject)sbhl_link_vars.NIL);
        sbhl_link_vars.$sbhl_rw_lock$ = SubLFiles.deflexical("*SBHL-RW-LOCK*", ReadWriteLocks.new_rw_lock((SubLObject)sbhl_link_vars.$str47$SBHL));
        sbhl_link_vars.$added_assertion$ = SubLFiles.defparameter("*ADDED-ASSERTION*", (SubLObject)sbhl_link_vars.NIL);
        sbhl_link_vars.$added_source$ = SubLFiles.defparameter("*ADDED-SOURCE*", (SubLObject)sbhl_link_vars.NIL);
        return (SubLObject)sbhl_link_vars.NIL;
    }
    
    public static SubLObject setup_sbhl_link_vars_file() {
        return (SubLObject)sbhl_link_vars.NIL;
    }
    
    @Override
	public void declareFunctions() {
        declare_sbhl_link_vars_file();
    }
    
    @Override
	public void initializeVariables() {
        init_sbhl_link_vars_file();
    }
    
    @Override
	public void runTopLevelForms() {
        setup_sbhl_link_vars_file();
    }
    
    static {
        me = (SubLFile)new sbhl_link_vars();
        sbhl_link_vars.$sbhl_directions$ = null;
        sbhl_link_vars.$sbhl_directed_directions$ = null;
        sbhl_link_vars.$sbhl_forward_directed_direction$ = null;
        sbhl_link_vars.$sbhl_forward_directed_direction_as_list$ = null;
        sbhl_link_vars.$sbhl_backward_directed_direction$ = null;
        sbhl_link_vars.$sbhl_backward_directed_direction_as_list$ = null;
        sbhl_link_vars.$sbhl_undirected_direction$ = null;
        sbhl_link_vars.$sbhl_undirected_direction_as_list$ = null;
        sbhl_link_vars.$sbhl_link_direction$ = null;
        sbhl_link_vars.$sbhl_link_truth_values$ = null;
        sbhl_link_vars.$sbhl_true_link_truth_values$ = null;
        sbhl_link_vars.$sbhl_randomize_lists_p$ = null;
        sbhl_link_vars.$sbhl_link_mt$ = null;
        sbhl_link_vars.$sbhl_link_tv$ = null;
        sbhl_link_vars.$sbhl_link_generator$ = null;
        sbhl_link_vars.$sbhl_rw_lock$ = null;
        sbhl_link_vars.$added_assertion$ = null;
        sbhl_link_vars.$added_source$ = null;
        $list0 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("PREDICATE"), (SubLObject)SubLObjectFactory.makeKeyword("INVERSE"), (SubLObject)SubLObjectFactory.makeKeyword("LINK"));
        $list1 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("PREDICATE"), (SubLObject)SubLObjectFactory.makeKeyword("INVERSE"));
        $kw2$PREDICATE = SubLObjectFactory.makeKeyword("PREDICATE");
        $list3 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("PREDICATE"));
        $kw4$INVERSE = SubLObjectFactory.makeKeyword("INVERSE");
        $list5 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("INVERSE"));
        $kw6$LINK = SubLObjectFactory.makeKeyword("LINK");
        $list7 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("LINK"));
        $kw8$ERROR = SubLObjectFactory.makeKeyword("ERROR");
        $str9$_A_is_not_a__A = SubLObjectFactory.makeString("~A is not a ~A");
        $sym10$SBHL_DIRECTION_P = SubLObjectFactory.makeSymbol("SBHL-DIRECTION-P");
        $kw11$CERROR = SubLObjectFactory.makeKeyword("CERROR");
        $str12$continue_anyway = SubLObjectFactory.makeString("continue anyway");
        $kw13$WARN = SubLObjectFactory.makeKeyword("WARN");
        $str14$_A_is_not_a_valid__sbhl_type_erro = SubLObjectFactory.makeString("~A is not a valid *sbhl-type-error-action* value");
        $list15 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DIRECTION"), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym16$CLET = SubLObjectFactory.makeSymbol("CLET");
        $sym17$_SBHL_LINK_DIRECTION_ = SubLObjectFactory.makeSymbol("*SBHL-LINK-DIRECTION*");
        $list18 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*SBHL-LINK-DIRECTION*"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-SBHL-OPPOSITE-LINK-DIRECTION"))));
        $sym19$WITH_SBHL_LINK_DIRECTION = SubLObjectFactory.makeSymbol("WITH-SBHL-LINK-DIRECTION");
        $list20 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-SBHL-MODULE-FORWARD-DIRECTION"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-SBHL-MODULE")));
        $list21 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MODULE"), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym22$GET_SBHL_MODULE_FORWARD_DIRECTION = SubLObjectFactory.makeSymbol("GET-SBHL-MODULE-FORWARD-DIRECTION");
        $list23 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-SBHL-MODULE-BACKWARD-DIRECTION"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-SBHL-MODULE")));
        $list24 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MonotonicallyTrue")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("DefaultTrue")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MonotonicallyFalse")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("DefaultFalse")));
        $list25 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MonotonicallyTrue")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("DefaultTrue")));
        $list26 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TRUTH-VAR"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("DONE-VAR")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym27$DO_SET_OR_LIST = SubLObjectFactory.makeSymbol("DO-SET-OR-LIST");
        $sym28$_SBHL_TRUE_LINK_TRUTH_VALUES_ = SubLObjectFactory.makeSymbol("*SBHL-TRUE-LINK-TRUTH-VALUES*");
        $kw29$DONE = SubLObjectFactory.makeKeyword("DONE");
        $kw30$TRUE = SubLObjectFactory.makeKeyword("TRUE");
        $kw31$MONOTONIC = SubLObjectFactory.makeKeyword("MONOTONIC");
        $const32$MonotonicallyTrue = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MonotonicallyTrue"));
        $kw33$DEFAULT = SubLObjectFactory.makeKeyword("DEFAULT");
        $const34$DefaultTrue = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("DefaultTrue"));
        $kw35$FALSE = SubLObjectFactory.makeKeyword("FALSE");
        $const36$MonotonicallyFalse = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MonotonicallyFalse"));
        $const37$DefaultFalse = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("DefaultFalse"));
        $kw38$UNKNOWN = SubLObjectFactory.makeKeyword("UNKNOWN");
        $str39$could_not_compute_an_SBHL_tv_from = SubLObjectFactory.makeString("could not compute an SBHL tv from ~s and ~s");
        $list40 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*SBHL-RANDOMIZE-LISTS-P*"), (SubLObject)sbhl_link_vars.T));
        $list41 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ELT-VAR"), (SubLObject)SubLObjectFactory.makeSymbol("LIST"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("DONE-VAR")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym42$NEW_LIST = SubLObjectFactory.makeUninternedSymbol("NEW-LIST");
        $sym43$FIF = SubLObjectFactory.makeSymbol("FIF");
        $list44 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SBHL-RANDOMIZE-LISTS-P"));
        $sym45$RANDOMIZE_LIST = SubLObjectFactory.makeSymbol("RANDOMIZE-LIST");
        $sym46$SMART_CSOME = SubLObjectFactory.makeSymbol("SMART-CSOME");
        $str47$SBHL = SubLObjectFactory.makeString("SBHL");
        $sym48$WITH_WRITER_LOCK = SubLObjectFactory.makeSymbol("WITH-WRITER-LOCK");
        $list49 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*SBHL-RW-LOCK*"));
        $sym50$WITH_READER_LOCK = SubLObjectFactory.makeSymbol("WITH-READER-LOCK");
    }
}

/*

	Total time: 124 ms
	
*/