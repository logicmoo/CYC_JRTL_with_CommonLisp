package com.cyc.cycjava.cycl.sbhl;

import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.cycjava.cycl.access_macros;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.cycjava.cycl.hash_table_utilities;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class sbhl_marking_vars extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.sbhl.sbhl_marking_vars";
    public static final String myFingerPrint = "75b882ee6eb24166b556451db44a9962f269cc0f31dbcf2363cef4689f5da977";
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-marking-vars.lisp", position = 510L)
    public static SubLSymbol $debug_sbhl_marking_spacesP$;
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-marking-vars.lisp", position = 569L)
    public static SubLSymbol $use_zero_size_sbhl_marking_spacesP$;
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-marking-vars.lisp", position = 2344L)
    public static SubLSymbol $resourcing_sbhl_marking_spaces_p$;
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-marking-vars.lisp", position = 2494L)
    public static SubLSymbol $resourced_sbhl_marking_space_limit$;
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-marking-vars.lisp", position = 2604L)
    public static SubLSymbol $resourced_sbhl_marking_spaces$;
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-marking-vars.lisp", position = 2713L)
    private static SubLSymbol $default_resourced_sbhl_space_limit$;
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-marking-vars.lisp", position = 4361L)
    private static SubLSymbol $within_new_sbhl_marking_space_resource$;
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-marking-vars.lisp", position = 7474L)
    public static SubLSymbol $sbhl_space$;
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-marking-vars.lisp", position = 7578L)
    public static SubLSymbol $sbhl_gather_space$;
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-marking-vars.lisp", position = 7695L)
    public static SubLSymbol $sbhl_disjoins_space$;
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-marking-vars.lisp", position = 7790L)
    public static SubLSymbol $sbhl_space_0$;
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-marking-vars.lisp", position = 7871L)
    public static SubLSymbol $sbhl_space_1$;
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-marking-vars.lisp", position = 7951L)
    public static SubLSymbol $sbhl_space_2$;
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-marking-vars.lisp", position = 8031L)
    public static SubLSymbol $sbhl_space_3$;
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-marking-vars.lisp", position = 8111L)
    public static SubLSymbol $sbhl_space_4$;
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-marking-vars.lisp", position = 8191L)
    public static SubLSymbol $sbhl_space_5$;
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-marking-vars.lisp", position = 12612L)
    public static SubLSymbol $sbhl_suspend_new_spacesP$;
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-marking-vars.lisp", position = 13349L)
    public static SubLSymbol $sbhl_goal_space$;
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-marking-vars.lisp", position = 13753L)
    public static SubLSymbol $sbhl_target_space$;
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-marking-vars.lisp", position = 13898L)
    public static SubLSymbol $sbhl_target_gather_space$;
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-marking-vars.lisp", position = 16214L)
    public static SubLSymbol $sbhl_terminating_marking_space$;
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-marking-vars.lisp", position = 16946L)
    public static SubLSymbol $sbhl_apply_marking_space$;
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-marking-vars.lisp", position = 17181L)
    public static SubLSymbol $sbhl_genl_preds_marking$;
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-marking-vars.lisp", position = 17430L)
    public static SubLSymbol $sbhl_genl_inverse_marking$;
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-marking-vars.lisp", position = 17576L)
    public static SubLSymbol $sbhl_genl_preds_and_genl_inverse_marking$;
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-marking-vars.lisp", position = 17764L)
    public static SubLSymbol $sbhl_genl_inverse_and_genl_preds_marking$;
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-marking-vars.lisp", position = 19033L)
    public static SubLSymbol $sbhl_marking_generation$;
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-marking-vars.lisp", position = 19706L)
    public static SubLSymbol $sbhl_suspend_new_spaces_during_mappingP$;
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-marking-vars.lisp", position = 20156L)
    public static SubLSymbol $sbhl_mapping_marking_space$;
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-marking-vars.lisp", position = 20261L)
    public static SubLSymbol $sbhl_mapping_gather_marking_space$;
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-marking-vars.lisp", position = 22146L)
    public static SubLSymbol $sbhl_temporality_search_checks_nodes_in_target_space_p$;
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-marking-vars.lisp", position = 22927L)
    public static SubLSymbol $sbhl_table$;
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-marking-vars.lisp", position = 24967L)
    public static SubLSymbol $sbhl_goal_table$;
    private static final SubLInteger $int0$100;
    private static final SubLInteger $int1$3000;
    private static final SubLList $list2;
    private static final SubLSymbol $sym3$CLET;
    private static final SubLList $list4;
    private static final SubLSymbol $sym5$CUNWIND_PROTECT;
    private static final SubLSymbol $sym6$PROGN;
    private static final SubLSymbol $sym7$FREE_SBHL_MARKING_SPACE;
    private static final SubLList $list8;
    private static final SubLSymbol $sym9$ALREADY_RESOURCING_P;
    private static final SubLList $list10;
    private static final SubLSymbol $sym11$_RESOURCED_SBHL_MARKING_SPACE_LIMIT_;
    private static final SubLSymbol $sym12$DETERMINE_RESOURCE_LIMIT;
    private static final SubLSymbol $sym13$_RESOURCED_SBHL_MARKING_SPACES_;
    private static final SubLSymbol $sym14$POSSIBLY_NEW_MARKING_RESOURCE;
    private static final SubLList $list15;
    private static final SubLSymbol $sym16$WITH_SBHL_RESOURCED_MARKING_SPACES;
    private static final SubLList $list17;
    private static final SubLList $list18;
    private static final SubLSymbol $sym19$_RESOURCING_SBHL_MARKING_SPACES_P_;
    private static final SubLList $list20;
    private static final SubLList $list21;
    private static final SubLSymbol $sym22$CSETQ;
    private static final SubLList $list23;
    private static final SubLList $list24;
    private static final SubLList $list25;
    private static final SubLSymbol $kw26$ALLOW_OTHER_KEYS;
    private static final SubLSymbol $kw27$NUM;
    private static final SubLSymbol $sym28$SBHL_MS_RESOURCE;
    private static final SubLSymbol $sym29$NEW_SBHL_MARKING_SPACE_RESOURCE;
    private static final SubLSymbol $sym30$WITH_SBHL_MARKING_SPACE_RESOURCE;
    private static final SubLSymbol $sym31$DETERMINE_MARKING_SPACE_LIMIT;
    private static final SubLString $str32$Dirty_resourced_marking_space_bei;
    private static final SubLString $str33$Have__S_more_spaces_than_the_limi;
    private static final SubLSymbol $sym34$INSTANTIATE_SBHL_MARKING_SPACE_FOR;
    private static final SubLSymbol $sym35$_SBHL_SPACE_;
    private static final SubLList $list36;
    private static final SubLSymbol $sym37$WITH_NEW_SBHL_SPACE;
    private static final SubLSymbol $sym38$WITH_SBHL_SPACE_VAR;
    private static final SubLSymbol $sym39$_SBHL_GATHER_SPACE_;
    private static final SubLSymbol $sym40$WITH_NEW_SBHL_GATHER_SPACE;
    private static final SubLSymbol $sym41$WITH_NEW_SBHL_SPACES;
    private static final SubLSymbol $sym42$WITH_SAME_SBHL_SPACES;
    private static final SubLSymbol $sym43$SOURCE;
    private static final SubLList $list44;
    private static final SubLSymbol $sym45$POSSIBLY_WITH_NEW_SBHL_SPACE;
    private static final SubLSymbol $sym46$POSSIBLY_WITH_NEW_SBHL_SPACES;
    private static final SubLList $list47;
    private static final SubLSymbol $sym48$FIF;
    private static final SubLList $list49;
    private static final SubLSymbol $sym50$SBHL_GET_NEW_SPACE;
    private static final SubLSymbol $sym51$PWHEN;
    private static final SubLList $list52;
    private static final SubLSymbol $sym53$UPDATE_SBHL_RESOURCED_SPACES;
    private static final SubLSymbol $sym54$SBHL_NEW_SPACE_SOURCE;
    private static final SubLSymbol $kw55$OLD;
    private static final SubLSymbol $kw56$RESOURCE;
    private static final SubLSymbol $kw57$NEW;
    private static final SubLList $list58;
    private static final SubLList $list59;
    private static final SubLList $list60;
    private static final SubLList $list61;
    private static final SubLSymbol $sym62$DO_HASH_TABLE;
    private static final SubLSymbol $kw63$DONE;
    private static final SubLList $list64;
    private static final SubLSymbol $sym65$NODE;
    private static final SubLSymbol $sym66$TAG;
    private static final SubLSymbol $sym67$PCOND;
    private static final SubLSymbol $sym68$HASH_TABLE_P;
    private static final SubLSymbol $sym69$CDOHASH;
    private static final SubLSymbol $sym70$IGNORE;
    private static final SubLSymbol $sym71$FUNCALL;
    private static final SubLSymbol $sym72$SBHL_ERROR;
    private static final SubLString $str73$no_mapping_method_defiend_for_sbh;
    private static final SubLList $list74;
    private static final SubLList $list75;
    private static final SubLSymbol $sym76$_SBHL_GOAL_SPACE_;
    private static final SubLSymbol $sym77$WITH_NEW_SBHL_TARGET_SPACES;
    private static final SubLList $list78;
    private static final SubLSymbol $sym79$_SBHL_TARGET_SPACE_;
    private static final SubLSymbol $sym80$_SBHL_TARGET_GATHER_SPACE_;
    private static final SubLList $list81;
    private static final SubLSymbol $sym82$WITH_NEW_SBHL_TARGET_SPACE;
    private static final SubLSymbol $sym83$WITHIN_SBHL_TARGET_SPACE;
    private static final SubLList $list84;
    private static final SubLSymbol $sym85$_SBHL_TERMINATING_MARKING_SPACE_;
    private static final SubLList $list86;
    private static final SubLSymbol $sym87$_SBHL_APPLY_MARKING_SPACE_;
    private static final SubLList $list88;
    private static final SubLList $list89;
    private static final SubLList $list90;
    private static final SubLList $list91;
    private static final SubLList $list92;
    private static final SubLSymbol $sym93$_SBHL_MAPPING_MARKING_SPACE_;
    private static final SubLSymbol $sym94$_SBHL_MAPPING_GATHER_MARKING_SPACE_;
    private static final SubLList $list95;
    private static final SubLList $list96;
    private static final SubLList $list97;
    private static final SubLList $list98;
    private static final SubLString $str99$Table_used_for_public_marking_int;
    private static final SubLSymbol $sym100$_SBHL_TABLE_;
    private static final SubLList $list101;
    private static final SubLSymbol $sym102$RESOURCING_P;
    private static final SubLList $list103;
    private static final SubLSymbol $sym104$WITHOUT_SBHL_RESOURCED_MARKING_SPACES;
    private static final SubLSymbol $sym105$WITH_NEW_SBHL_TABLE;
    private static final SubLSymbol $sym106$WITH_SBHL_TABLE_VAR;
    private static final SubLSymbol $sym107$TOGGLE_SBHL_RESOURCED_MARKING_SPACES;
    private static final SubLList $list108;
    private static final SubLList $list109;
    private static final SubLSymbol $sym110$NODE;
    private static final SubLSymbol $sym111$TAG;
    private static final SubLString $str112$no_mapping_method_defiend_for_sbh;
    private static final SubLSymbol $sym113$WITHIN_SBHL_SPACE;
    private static final SubLList $list114;
    private static final SubLSymbol $sym115$_SBHL_GOAL_TABLE_;
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-marking-vars.lisp", position = 634L)
    public static SubLObject average_genl_cardinality(SubLObject module) {
        if (module == sbhl_marking_vars.UNPROVIDED) {
            module = (SubLObject)sbhl_marking_vars.NIL;
        }
        return (SubLObject)sbhl_marking_vars.$int0$100;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-marking-vars.lisp", position = 822L)
    public static SubLObject average_spec_cardinality(SubLObject module) {
        if (module == sbhl_marking_vars.UNPROVIDED) {
            module = (SubLObject)sbhl_marking_vars.NIL;
        }
        return (SubLObject)sbhl_marking_vars.$int1$3000;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-marking-vars.lisp", position = 917L)
    public static SubLObject get_sbhl_marking_space() {
        if (sbhl_marking_vars.NIL != resourcing_sbhl_marking_spaces_p()) {
            return get_sbhl_resourced_marking_space();
        }
        return instantiate_sbhl_marking_space();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-marking-vars.lisp", position = 1100L)
    public static SubLObject free_sbhl_marking_space(final SubLObject space) {
        if (sbhl_marking_vars.NIL != resourcing_sbhl_marking_spaces_p()) {
            update_sbhl_resourced_spaces(space);
        }
        return (SubLObject)sbhl_marking_vars.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-marking-vars.lisp", position = 1250L)
    public static SubLObject instantiate_sbhl_marking_space() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (sbhl_marking_vars.NIL != sbhl_marking_vars.$use_zero_size_sbhl_marking_spacesP$.getDynamicValue(thread)) {
            return Hashtables.make_hash_table((SubLObject)sbhl_marking_vars.ZERO_INTEGER, Symbols.symbol_function((SubLObject)sbhl_marking_vars.EQUAL), (SubLObject)sbhl_marking_vars.UNPROVIDED);
        }
        if (sbhl_marking_vars.NIL != sbhl_search_vars.sbhl_forward_search_p()) {
            return Hashtables.make_hash_table(average_genl_cardinality((SubLObject)sbhl_marking_vars.UNPROVIDED), Symbols.symbol_function((SubLObject)sbhl_marking_vars.EQUAL), (SubLObject)sbhl_marking_vars.UNPROVIDED);
        }
        if (sbhl_marking_vars.NIL != sbhl_search_vars.sbhl_backward_search_p()) {
            return Hashtables.make_hash_table(average_spec_cardinality((SubLObject)sbhl_marking_vars.UNPROVIDED), Symbols.symbol_function((SubLObject)sbhl_marking_vars.EQUAL), (SubLObject)sbhl_marking_vars.UNPROVIDED);
        }
        return Hashtables.make_hash_table(average_genl_cardinality((SubLObject)sbhl_marking_vars.UNPROVIDED), Symbols.symbol_function((SubLObject)sbhl_marking_vars.EQUAL), (SubLObject)sbhl_marking_vars.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-marking-vars.lisp", position = 2054L)
    public static SubLObject instantiate_sbhl_marking_space_for(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject space = (SubLObject)sbhl_marking_vars.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_marking_vars.$list2);
        space = current.first();
        final SubLObject body;
        current = (body = current.rest());
        return (SubLObject)ConsesLow.list((SubLObject)sbhl_marking_vars.$sym3$CLET, (SubLObject)ConsesLow.list(reader.bq_cons(space, (SubLObject)sbhl_marking_vars.$list4)), (SubLObject)ConsesLow.list((SubLObject)sbhl_marking_vars.$sym5$CUNWIND_PROTECT, reader.bq_cons((SubLObject)sbhl_marking_vars.$sym6$PROGN, ConsesLow.append(body, (SubLObject)sbhl_marking_vars.NIL)), (SubLObject)ConsesLow.list((SubLObject)sbhl_marking_vars.$sym7$FREE_SBHL_MARKING_SPACE, space)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-marking-vars.lisp", position = 2817L)
    public static SubLObject resourcing_sbhl_marking_spaces_p() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.getDynamicValue(thread);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-marking-vars.lisp", position = 2982L)
    public static SubLObject with_sbhl_resourced_marking_spaces(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject num = (SubLObject)sbhl_marking_vars.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_marking_vars.$list8);
        num = current.first();
        final SubLObject body;
        current = (body = current.rest());
        final SubLObject already_resourcing_p = (SubLObject)sbhl_marking_vars.$sym9$ALREADY_RESOURCING_P;
        return (SubLObject)ConsesLow.listS((SubLObject)sbhl_marking_vars.$sym3$CLET, (SubLObject)ConsesLow.listS(reader.bq_cons(already_resourcing_p, (SubLObject)sbhl_marking_vars.$list10), (SubLObject)ConsesLow.list((SubLObject)sbhl_marking_vars.$sym11$_RESOURCED_SBHL_MARKING_SPACE_LIMIT_, (SubLObject)ConsesLow.list((SubLObject)sbhl_marking_vars.$sym12$DETERMINE_RESOURCE_LIMIT, already_resourcing_p, num)), (SubLObject)ConsesLow.list((SubLObject)sbhl_marking_vars.$sym13$_RESOURCED_SBHL_MARKING_SPACES_, (SubLObject)ConsesLow.list((SubLObject)sbhl_marking_vars.$sym14$POSSIBLY_NEW_MARKING_RESOURCE, already_resourcing_p)), (SubLObject)sbhl_marking_vars.$list15), ConsesLow.append(body, (SubLObject)sbhl_marking_vars.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-marking-vars.lisp", position = 3531L)
    public static SubLObject determine_resource_limit(final SubLObject resourcing_p, final SubLObject num) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (sbhl_marking_vars.NIL != resourcing_p) {
            return Numbers.max(sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.getDynamicValue(thread), num);
        }
        return num;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-marking-vars.lisp", position = 3736L)
    public static SubLObject possibly_new_marking_resource(final SubLObject resourcing_p) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (sbhl_marking_vars.NIL != resourcing_p) {
            return sbhl_marking_vars.$resourced_sbhl_marking_spaces$.getDynamicValue(thread);
        }
        return (SubLObject)sbhl_marking_vars.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-marking-vars.lisp", position = 3927L)
    public static SubLObject without_sbhl_resourced_marking_spaces(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return (SubLObject)ConsesLow.listS((SubLObject)sbhl_marking_vars.$sym3$CLET, (SubLObject)sbhl_marking_vars.$list17, ConsesLow.append(body, (SubLObject)sbhl_marking_vars.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-marking-vars.lisp", position = 4135L)
    public static SubLObject toggle_sbhl_resourced_marking_spaces(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject resourcing_p = (SubLObject)sbhl_marking_vars.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_marking_vars.$list18);
        resourcing_p = current.first();
        final SubLObject body;
        current = (body = current.rest());
        return (SubLObject)ConsesLow.listS((SubLObject)sbhl_marking_vars.$sym3$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)sbhl_marking_vars.$sym19$_RESOURCING_SBHL_MARKING_SPACES_P_, resourcing_p)), ConsesLow.append(body, (SubLObject)sbhl_marking_vars.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-marking-vars.lisp", position = 4430L)
    public static SubLObject new_sbhl_marking_space_resource(SubLObject num) {
        if (num == sbhl_marking_vars.UNPROVIDED) {
            num = (SubLObject)sbhl_marking_vars.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject default_num = (SubLObject)((sbhl_marking_vars.NIL != num) ? num : sbhl_marking_vars.ZERO_INTEGER);
        SubLObject result = (SubLObject)sbhl_marking_vars.NIL;
        final SubLObject _prev_bind_0 = sbhl_marking_vars.$within_new_sbhl_marking_space_resource$.currentBinding(thread);
        try {
            sbhl_marking_vars.$within_new_sbhl_marking_space_resource$.bind((SubLObject)sbhl_marking_vars.T, thread);
            SubLObject i;
            for (i = (SubLObject)sbhl_marking_vars.NIL, i = (SubLObject)sbhl_marking_vars.ZERO_INTEGER; i.numL(default_num); i = Numbers.add(i, (SubLObject)sbhl_marking_vars.ONE_INTEGER)) {
                result = (SubLObject)ConsesLow.cons(instantiate_sbhl_marking_space(), result);
            }
        }
        finally {
            sbhl_marking_vars.$within_new_sbhl_marking_space_resource$.rebind(_prev_bind_0, thread);
        }
        return Sequences.nreverse(result);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-marking-vars.lisp", position = 4768L)
    public static SubLObject current_sbhl_marking_space_resource() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return sbhl_marking_vars.$resourced_sbhl_marking_spaces$.getDynamicValue(thread);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-marking-vars.lisp", position = 4960L)
    public static SubLObject with_sbhl_marking_space_resource(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject sbhl_ms_resource = (SubLObject)sbhl_marking_vars.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_marking_vars.$list20);
        sbhl_ms_resource = current.first();
        final SubLObject body;
        current = (body = current.rest());
        return (SubLObject)ConsesLow.list((SubLObject)sbhl_marking_vars.$sym3$CLET, reader.bq_cons((SubLObject)ConsesLow.list((SubLObject)sbhl_marking_vars.$sym13$_RESOURCED_SBHL_MARKING_SPACES_, sbhl_ms_resource), (SubLObject)sbhl_marking_vars.$list21), (SubLObject)ConsesLow.list((SubLObject)sbhl_marking_vars.$sym5$CUNWIND_PROTECT, reader.bq_cons((SubLObject)sbhl_marking_vars.$sym6$PROGN, ConsesLow.append(body, (SubLObject)sbhl_marking_vars.NIL)), (SubLObject)ConsesLow.listS((SubLObject)sbhl_marking_vars.$sym22$CSETQ, sbhl_ms_resource, (SubLObject)sbhl_marking_vars.$list23)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-marking-vars.lisp", position = 5453L)
    public static SubLObject with_new_sbhl_marking_space_resource(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_marking_vars.$list24);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject allow_other_keys_p = (SubLObject)sbhl_marking_vars.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)sbhl_marking_vars.NIL;
        SubLObject current_$1 = (SubLObject)sbhl_marking_vars.NIL;
        while (sbhl_marking_vars.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)sbhl_marking_vars.$list24);
            current_$1 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)sbhl_marking_vars.$list24);
            if (sbhl_marking_vars.NIL == conses_high.member(current_$1, (SubLObject)sbhl_marking_vars.$list25, (SubLObject)sbhl_marking_vars.UNPROVIDED, (SubLObject)sbhl_marking_vars.UNPROVIDED)) {
                bad = (SubLObject)sbhl_marking_vars.T;
            }
            if (current_$1 == sbhl_marking_vars.$kw26$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (sbhl_marking_vars.NIL != bad && sbhl_marking_vars.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)sbhl_marking_vars.$list24);
        }
        final SubLObject num_tail = cdestructuring_bind.property_list_member((SubLObject)sbhl_marking_vars.$kw27$NUM, current);
        final SubLObject num = (SubLObject)((sbhl_marking_vars.NIL != num_tail) ? conses_high.cadr(num_tail) : sbhl_marking_vars.NIL);
        final SubLObject body;
        current = (body = temp);
        final SubLObject sbhl_ms_resource = (SubLObject)sbhl_marking_vars.$sym28$SBHL_MS_RESOURCE;
        return (SubLObject)ConsesLow.list((SubLObject)sbhl_marking_vars.$sym3$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(sbhl_ms_resource, (SubLObject)ConsesLow.list((SubLObject)sbhl_marking_vars.$sym29$NEW_SBHL_MARKING_SPACE_RESOURCE, num))), (SubLObject)ConsesLow.listS((SubLObject)sbhl_marking_vars.$sym30$WITH_SBHL_MARKING_SPACE_RESOURCE, sbhl_ms_resource, ConsesLow.append(body, (SubLObject)sbhl_marking_vars.NIL)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-marking-vars.lisp", position = 5865L)
    public static SubLObject determine_marking_space_limit(final SubLObject marking_resource) {
        final SubLObject length = Sequences.length(marking_resource);
        if (length.eql((SubLObject)sbhl_marking_vars.ZERO_INTEGER)) {
            return sbhl_marking_vars.$default_resourced_sbhl_space_limit$.getGlobalValue();
        }
        return length;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-marking-vars.lisp", position = 6070L)
    public static SubLObject get_sbhl_resourced_marking_space() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)sbhl_marking_vars.NIL;
        result = sbhl_marking_vars.$resourced_sbhl_marking_spaces$.getDynamicValue(thread).first();
        if (sbhl_marking_vars.NIL != result) {
            if (sbhl_marking_vars.NIL != sbhl_marking_vars.$debug_sbhl_marking_spacesP$.getDynamicValue(thread) && sbhl_marking_vars.NIL == hash_table_utilities.hash_table_empty_p(result)) {
                Errors.warn((SubLObject)sbhl_marking_vars.$str32$Dirty_resourced_marking_space_bei, result);
            }
            sbhl_marking_vars.$resourced_sbhl_marking_spaces$.setDynamicValue(sbhl_marking_vars.$resourced_sbhl_marking_spaces$.getDynamicValue(thread).rest(), thread);
        }
        else {
            result = instantiate_sbhl_marking_space();
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-marking-vars.lisp", position = 6620L)
    public static SubLObject update_sbhl_resourced_spaces(final SubLObject space) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (sbhl_marking_vars.NIL != list_utilities.lengthG(sbhl_marking_vars.$resourced_sbhl_marking_spaces$.getDynamicValue(thread), sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.getDynamicValue(thread), (SubLObject)sbhl_marking_vars.UNPROVIDED)) {
            if (sbhl_marking_vars.NIL != sbhl_marking_vars.$debug_sbhl_marking_spacesP$.getDynamicValue(thread)) {
                Errors.sublisp_break((SubLObject)sbhl_marking_vars.$str33$Have__S_more_spaces_than_the_limi, new SubLObject[] { Numbers.subtract(Sequences.length(sbhl_marking_vars.$resourced_sbhl_marking_spaces$.getDynamicValue(thread)), sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.getDynamicValue(thread)), sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.getDynamicValue(thread) });
            }
        }
        else {
            sbhl_marking_utilities.clear_sbhl_space(space);
            sbhl_marking_vars.$resourced_sbhl_marking_spaces$.setDynamicValue((SubLObject)ConsesLow.cons(space, sbhl_marking_vars.$resourced_sbhl_marking_spaces$.getDynamicValue(thread)), thread);
        }
        return (SubLObject)sbhl_marking_vars.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-marking-vars.lisp", position = 7296L)
    public static SubLObject clear_recourced_sbhl_spaces() {
        sbhl_marking_vars.$resourced_sbhl_marking_spaces$.setDynamicValue((SubLObject)sbhl_marking_vars.NIL);
        return (SubLObject)sbhl_marking_vars.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-marking-vars.lisp", position = 8271L)
    public static SubLObject sbhl_space_obect_p(final SubLObject space) {
        return Types.hash_table_p(space);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-marking-vars.lisp", position = 8429L)
    public static SubLObject get_sbhl_space() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-marking-vars.lisp", position = 8563L)
    public static SubLObject get_sbhl_gather_space() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-marking-vars.lisp", position = 8704L)
    public static SubLObject with_new_sbhl_space(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return (SubLObject)ConsesLow.listS((SubLObject)sbhl_marking_vars.$sym34$INSTANTIATE_SBHL_MARKING_SPACE_FOR, (SubLObject)sbhl_marking_vars.$sym35$_SBHL_SPACE_, ConsesLow.append(body, (SubLObject)sbhl_marking_vars.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-marking-vars.lisp", position = 8878L)
    public static SubLObject with_new_sbhl_space_named(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject name = (SubLObject)sbhl_marking_vars.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_marking_vars.$list36);
        name = current.first();
        final SubLObject body;
        current = (body = current.rest());
        return (SubLObject)ConsesLow.list((SubLObject)sbhl_marking_vars.$sym37$WITH_NEW_SBHL_SPACE, (SubLObject)ConsesLow.listS((SubLObject)sbhl_marking_vars.$sym38$WITH_SBHL_SPACE_VAR, name, ConsesLow.append(body, (SubLObject)sbhl_marking_vars.NIL)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-marking-vars.lisp", position = 9066L)
    public static SubLObject with_new_sbhl_gather_space(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return (SubLObject)ConsesLow.listS((SubLObject)sbhl_marking_vars.$sym34$INSTANTIATE_SBHL_MARKING_SPACE_FOR, (SubLObject)sbhl_marking_vars.$sym39$_SBHL_GATHER_SPACE_, ConsesLow.append(body, (SubLObject)sbhl_marking_vars.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-marking-vars.lisp", position = 9260L)
    public static SubLObject with_new_sbhl_spaces(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return (SubLObject)ConsesLow.list((SubLObject)sbhl_marking_vars.$sym37$WITH_NEW_SBHL_SPACE, reader.bq_cons((SubLObject)sbhl_marking_vars.$sym40$WITH_NEW_SBHL_GATHER_SPACE, ConsesLow.append(body, (SubLObject)sbhl_marking_vars.NIL)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-marking-vars.lisp", position = 9468L)
    public static SubLObject with_new_sbhl_spaces_used_repeatedly(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return (SubLObject)ConsesLow.list((SubLObject)sbhl_marking_vars.$sym41$WITH_NEW_SBHL_SPACES, reader.bq_cons((SubLObject)sbhl_marking_vars.$sym42$WITH_SAME_SBHL_SPACES, ConsesLow.append(body, (SubLObject)sbhl_marking_vars.NIL)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-marking-vars.lisp", position = 9733L)
    public static SubLObject with_new_sbhl_space_used_repeatedly(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return (SubLObject)ConsesLow.list((SubLObject)sbhl_marking_vars.$sym37$WITH_NEW_SBHL_SPACE, reader.bq_cons((SubLObject)sbhl_marking_vars.$sym42$WITH_SAME_SBHL_SPACES, ConsesLow.append(body, (SubLObject)sbhl_marking_vars.NIL)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-marking-vars.lisp", position = 9971L)
    public static SubLObject possibly_with_new_sbhl_spaces(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        final SubLObject source = (SubLObject)sbhl_marking_vars.$sym43$SOURCE;
        return (SubLObject)ConsesLow.list((SubLObject)sbhl_marking_vars.$sym3$CLET, (SubLObject)ConsesLow.list(reader.bq_cons(source, (SubLObject)sbhl_marking_vars.$list44)), (SubLObject)ConsesLow.list((SubLObject)sbhl_marking_vars.$sym45$POSSIBLY_WITH_NEW_SBHL_SPACE, (SubLObject)ConsesLow.list((SubLObject)sbhl_marking_vars.$sym35$_SBHL_SPACE_, source), (SubLObject)ConsesLow.listS((SubLObject)sbhl_marking_vars.$sym45$POSSIBLY_WITH_NEW_SBHL_SPACE, (SubLObject)ConsesLow.list((SubLObject)sbhl_marking_vars.$sym39$_SBHL_GATHER_SPACE_, source), ConsesLow.append(body, (SubLObject)sbhl_marking_vars.NIL))));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-marking-vars.lisp", position = 10384L)
    public static SubLObject possibly_with_new_sbhl_space(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_marking_vars.$list47);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject space = (SubLObject)sbhl_marking_vars.NIL;
        SubLObject source = (SubLObject)sbhl_marking_vars.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_marking_vars.$list47);
        space = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_marking_vars.$list47);
        source = current.first();
        current = current.rest();
        if (sbhl_marking_vars.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            return (SubLObject)ConsesLow.listS((SubLObject)sbhl_marking_vars.$sym3$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(space, (SubLObject)ConsesLow.list((SubLObject)sbhl_marking_vars.$sym48$FIF, (SubLObject)ConsesLow.listS((SubLObject)sbhl_marking_vars.EQ, source, (SubLObject)sbhl_marking_vars.$list49), space, (SubLObject)ConsesLow.list((SubLObject)sbhl_marking_vars.$sym50$SBHL_GET_NEW_SPACE, source)))), ConsesLow.append(body, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)sbhl_marking_vars.$sym51$PWHEN, (SubLObject)ConsesLow.listS((SubLObject)sbhl_marking_vars.EQ, source, (SubLObject)sbhl_marking_vars.$list52), (SubLObject)ConsesLow.list((SubLObject)sbhl_marking_vars.$sym53$UPDATE_SBHL_RESOURCED_SPACES, space)))));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)sbhl_marking_vars.$list47);
        return (SubLObject)sbhl_marking_vars.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-marking-vars.lisp", position = 10788L)
    public static SubLObject sbhl_new_space_source() {
        if (sbhl_marking_vars.NIL != sbhl_suspend_new_spacesP()) {
            return (SubLObject)sbhl_marking_vars.$kw55$OLD;
        }
        if (sbhl_marking_vars.NIL != resourcing_sbhl_marking_spaces_p()) {
            return (SubLObject)sbhl_marking_vars.$kw56$RESOURCE;
        }
        return (SubLObject)sbhl_marking_vars.$kw57$NEW;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-marking-vars.lisp", position = 11072L)
    public static SubLObject sbhl_get_new_space(SubLObject source) {
        if (source.eql((SubLObject)sbhl_marking_vars.$kw56$RESOURCE)) {
            return get_sbhl_resourced_marking_space();
        }
        return instantiate_sbhl_marking_space();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-marking-vars.lisp", position = 11351L)
    public static SubLObject with_sbhl_space_var(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject var = (SubLObject)sbhl_marking_vars.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_marking_vars.$list58);
        var = current.first();
        final SubLObject body;
        current = (body = current.rest());
        return (SubLObject)ConsesLow.listS((SubLObject)sbhl_marking_vars.$sym3$CLET, (SubLObject)ConsesLow.list(reader.bq_cons(var, (SubLObject)sbhl_marking_vars.$list59)), ConsesLow.append(body, (SubLObject)sbhl_marking_vars.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-marking-vars.lisp", position = 11497L)
    public static SubLObject with_sbhl_gather_space_var(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject var = (SubLObject)sbhl_marking_vars.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_marking_vars.$list58);
        var = current.first();
        final SubLObject body;
        current = (body = current.rest());
        return (SubLObject)ConsesLow.listS((SubLObject)sbhl_marking_vars.$sym3$CLET, (SubLObject)ConsesLow.list(reader.bq_cons(var, (SubLObject)sbhl_marking_vars.$list60)), ConsesLow.append(body, (SubLObject)sbhl_marking_vars.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-marking-vars.lisp", position = 11664L)
    public static SubLObject within_sbhl_space(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject var = (SubLObject)sbhl_marking_vars.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_marking_vars.$list58);
        var = current.first();
        final SubLObject body;
        current = (body = current.rest());
        return (SubLObject)ConsesLow.listS((SubLObject)sbhl_marking_vars.$sym3$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)sbhl_marking_vars.$sym35$_SBHL_SPACE_, var)), ConsesLow.append(body, (SubLObject)sbhl_marking_vars.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-marking-vars.lisp", position = 11801L)
    public static SubLObject within_sbhl_gather_space(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject var = (SubLObject)sbhl_marking_vars.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_marking_vars.$list58);
        var = current.first();
        final SubLObject body;
        current = (body = current.rest());
        return (SubLObject)ConsesLow.listS((SubLObject)sbhl_marking_vars.$sym3$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)sbhl_marking_vars.$sym39$_SBHL_GATHER_SPACE_, var)), ConsesLow.append(body, (SubLObject)sbhl_marking_vars.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-marking-vars.lisp", position = 11957L)
    public static SubLObject do_sbhl_space(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_marking_vars.$list61);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject node_var = (SubLObject)sbhl_marking_vars.NIL;
        SubLObject marking_var = (SubLObject)sbhl_marking_vars.NIL;
        SubLObject sbhl_space = (SubLObject)sbhl_marking_vars.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_marking_vars.$list61);
        node_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_marking_vars.$list61);
        marking_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_marking_vars.$list61);
        sbhl_space = current.first();
        current = current.rest();
        final SubLObject done_var = (SubLObject)(current.isCons() ? current.first() : sbhl_marking_vars.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)sbhl_marking_vars.$list61);
        current = current.rest();
        if (sbhl_marking_vars.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            return (SubLObject)ConsesLow.listS((SubLObject)sbhl_marking_vars.$sym62$DO_HASH_TABLE, (SubLObject)ConsesLow.list(node_var, marking_var, sbhl_space, (SubLObject)sbhl_marking_vars.$kw63$DONE, done_var), ConsesLow.append(body, (SubLObject)sbhl_marking_vars.NIL));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)sbhl_marking_vars.$list61);
        return (SubLObject)sbhl_marking_vars.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-marking-vars.lisp", position = 12248L)
    public static SubLObject map_sbhl_space(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject function = (SubLObject)sbhl_marking_vars.NIL;
        SubLObject sbhl_space = (SubLObject)sbhl_marking_vars.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_marking_vars.$list64);
        function = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_marking_vars.$list64);
        sbhl_space = current.first();
        current = current.rest();
        if (sbhl_marking_vars.NIL == current) {
            final SubLObject node = (SubLObject)sbhl_marking_vars.$sym65$NODE;
            final SubLObject tag = (SubLObject)sbhl_marking_vars.$sym66$TAG;
            return (SubLObject)ConsesLow.list((SubLObject)sbhl_marking_vars.$sym67$PCOND, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)sbhl_marking_vars.$sym68$HASH_TABLE_P, sbhl_space), (SubLObject)ConsesLow.list((SubLObject)sbhl_marking_vars.$sym69$CDOHASH, (SubLObject)ConsesLow.list(node, tag, sbhl_space), (SubLObject)ConsesLow.list((SubLObject)sbhl_marking_vars.$sym70$IGNORE, tag), (SubLObject)ConsesLow.list((SubLObject)sbhl_marking_vars.$sym71$FUNCALL, function, node))), (SubLObject)ConsesLow.list((SubLObject)sbhl_marking_vars.T, (SubLObject)ConsesLow.list((SubLObject)sbhl_marking_vars.$sym72$SBHL_ERROR, (SubLObject)sbhl_marking_vars.THREE_INTEGER, (SubLObject)sbhl_marking_vars.$str73$no_mapping_method_defiend_for_sbh, sbhl_space)));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)sbhl_marking_vars.$list64);
        return (SubLObject)sbhl_marking_vars.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-marking-vars.lisp", position = 12760L)
    public static SubLObject sbhl_suspend_new_spacesP() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return sbhl_marking_vars.$sbhl_suspend_new_spacesP$.getDynamicValue(thread);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-marking-vars.lisp", position = 12932L)
    public static SubLObject with_same_sbhl_spaces(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return (SubLObject)ConsesLow.listS((SubLObject)sbhl_marking_vars.$sym3$CLET, (SubLObject)sbhl_marking_vars.$list74, ConsesLow.append(body, (SubLObject)sbhl_marking_vars.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-marking-vars.lisp", position = 13133L)
    public static SubLObject without_suspending_new_sbhl_spaces(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return (SubLObject)ConsesLow.listS((SubLObject)sbhl_marking_vars.$sym3$CLET, (SubLObject)sbhl_marking_vars.$list75, ConsesLow.append(body, (SubLObject)sbhl_marking_vars.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-marking-vars.lisp", position = 13464L)
    public static SubLObject get_sbhl_goal_space() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return sbhl_marking_vars.$sbhl_goal_space$.getDynamicValue(thread);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-marking-vars.lisp", position = 13599L)
    public static SubLObject with_sbhl_goal_space(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject space = (SubLObject)sbhl_marking_vars.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_marking_vars.$list2);
        space = current.first();
        final SubLObject body;
        current = (body = current.rest());
        return (SubLObject)ConsesLow.listS((SubLObject)sbhl_marking_vars.$sym3$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)sbhl_marking_vars.$sym76$_SBHL_GOAL_SPACE_, space)), ConsesLow.append(body, (SubLObject)sbhl_marking_vars.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-marking-vars.lisp", position = 14032L)
    public static SubLObject with_sbhl_target_spaces(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return (SubLObject)ConsesLow.list((SubLObject)sbhl_marking_vars.$sym77$WITH_NEW_SBHL_TARGET_SPACES, (SubLObject)ConsesLow.listS((SubLObject)sbhl_marking_vars.$sym3$CLET, (SubLObject)sbhl_marking_vars.$list78, ConsesLow.append(body, (SubLObject)sbhl_marking_vars.NIL)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-marking-vars.lisp", position = 14399L)
    public static SubLObject with_new_sbhl_target_spaces(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return (SubLObject)ConsesLow.list((SubLObject)sbhl_marking_vars.$sym34$INSTANTIATE_SBHL_MARKING_SPACE_FOR, (SubLObject)sbhl_marking_vars.$sym79$_SBHL_TARGET_SPACE_, (SubLObject)ConsesLow.listS((SubLObject)sbhl_marking_vars.$sym34$INSTANTIATE_SBHL_MARKING_SPACE_FOR, (SubLObject)sbhl_marking_vars.$sym80$_SBHL_TARGET_GATHER_SPACE_, ConsesLow.append(body, (SubLObject)sbhl_marking_vars.NIL)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-marking-vars.lisp", position = 14693L)
    public static SubLObject with_new_sbhl_target_space(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return (SubLObject)ConsesLow.listS((SubLObject)sbhl_marking_vars.$sym34$INSTANTIATE_SBHL_MARKING_SPACE_FOR, (SubLObject)sbhl_marking_vars.$sym79$_SBHL_TARGET_SPACE_, ConsesLow.append(body, (SubLObject)sbhl_marking_vars.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-marking-vars.lisp", position = 14885L)
    public static SubLObject with_new_sbhl_target_gather_space(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return (SubLObject)ConsesLow.listS((SubLObject)sbhl_marking_vars.$sym34$INSTANTIATE_SBHL_MARKING_SPACE_FOR, (SubLObject)sbhl_marking_vars.$sym80$_SBHL_TARGET_GATHER_SPACE_, ConsesLow.append(body, (SubLObject)sbhl_marking_vars.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-marking-vars.lisp", position = 15098L)
    public static SubLObject within_sbhl_target_spaces(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return (SubLObject)ConsesLow.listS((SubLObject)sbhl_marking_vars.$sym3$CLET, (SubLObject)sbhl_marking_vars.$list78, ConsesLow.append(body, (SubLObject)sbhl_marking_vars.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-marking-vars.lisp", position = 15394L)
    public static SubLObject within_sbhl_target_space(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return (SubLObject)ConsesLow.listS((SubLObject)sbhl_marking_vars.$sym3$CLET, (SubLObject)sbhl_marking_vars.$list81, ConsesLow.append(body, (SubLObject)sbhl_marking_vars.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-marking-vars.lisp", position = 15563L)
    public static SubLObject within_new_sbhl_target_space(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return (SubLObject)ConsesLow.list((SubLObject)sbhl_marking_vars.$sym82$WITH_NEW_SBHL_TARGET_SPACE, reader.bq_cons((SubLObject)sbhl_marking_vars.$sym83$WITHIN_SBHL_TARGET_SPACE, ConsesLow.append(body, (SubLObject)sbhl_marking_vars.NIL)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-marking-vars.lisp", position = 15782L)
    public static SubLObject with_sbhl_target_space_named(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject space_var = (SubLObject)sbhl_marking_vars.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_marking_vars.$list84);
        space_var = current.first();
        final SubLObject body;
        current = (body = current.rest());
        return (SubLObject)ConsesLow.listS((SubLObject)sbhl_marking_vars.$sym3$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)sbhl_marking_vars.$sym79$_SBHL_TARGET_SPACE_, space_var)), ConsesLow.append(body, (SubLObject)sbhl_marking_vars.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-marking-vars.lisp", position = 15917L)
    public static SubLObject clear_sbhl_target_spaces() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        sbhl_marking_utilities.clear_sbhl_space(sbhl_marking_vars.$sbhl_target_space$.getDynamicValue(thread));
        sbhl_marking_utilities.clear_sbhl_space(sbhl_marking_vars.$sbhl_target_gather_space$.getDynamicValue(thread));
        return (SubLObject)sbhl_marking_vars.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-marking-vars.lisp", position = 16114L)
    public static SubLObject clear_sbhl_target_space() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        sbhl_marking_utilities.clear_sbhl_space(sbhl_marking_vars.$sbhl_target_space$.getDynamicValue(thread));
        return (SubLObject)sbhl_marking_vars.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-marking-vars.lisp", position = 16382L)
    public static SubLObject get_sbhl_terminating_marking_space() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return sbhl_marking_vars.$sbhl_terminating_marking_space$.getDynamicValue(thread);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-marking-vars.lisp", position = 16547L)
    public static SubLObject with_sbhl_terminating_space(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject space = (SubLObject)sbhl_marking_vars.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_marking_vars.$list2);
        space = current.first();
        final SubLObject body;
        current = (body = current.rest());
        return (SubLObject)ConsesLow.listS((SubLObject)sbhl_marking_vars.$sym3$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)sbhl_marking_vars.$sym85$_SBHL_TERMINATING_MARKING_SPACE_, space)), ConsesLow.append(body, (SubLObject)sbhl_marking_vars.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-marking-vars.lisp", position = 16738L)
    public static SubLObject within_sbhl_terminating_marking_space(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return (SubLObject)ConsesLow.listS((SubLObject)sbhl_marking_vars.$sym3$CLET, (SubLObject)sbhl_marking_vars.$list86, ConsesLow.append(body, (SubLObject)sbhl_marking_vars.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-marking-vars.lisp", position = 17046L)
    public static SubLObject with_sbhl_apply_marking_space(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject space = (SubLObject)sbhl_marking_vars.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_marking_vars.$list2);
        space = current.first();
        final SubLObject body;
        current = (body = current.rest());
        return (SubLObject)ConsesLow.listS((SubLObject)sbhl_marking_vars.$sym3$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)sbhl_marking_vars.$sym87$_SBHL_APPLY_MARKING_SPACE_, space)), ConsesLow.append(body, (SubLObject)sbhl_marking_vars.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-marking-vars.lisp", position = 17952L)
    public static SubLObject genl_preds_marking_p(final SubLObject marking) {
        return Equality.eql(marking, sbhl_marking_vars.$sbhl_genl_preds_marking$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-marking-vars.lisp", position = 18141L)
    public static SubLObject genl_inverse_marking_p(final SubLObject marking) {
        return Equality.eql(marking, sbhl_marking_vars.$sbhl_genl_inverse_marking$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-marking-vars.lisp", position = 18340L)
    public static SubLObject genl_preds_and_genl_inverse_marking_p(final SubLObject marking) {
        return (SubLObject)SubLObjectFactory.makeBoolean(marking.eql(sbhl_marking_vars.$sbhl_genl_preds_and_genl_inverse_marking$.getGlobalValue()) || marking.eql(sbhl_marking_vars.$sbhl_genl_inverse_and_genl_preds_marking$.getGlobalValue()));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-marking-vars.lisp", position = 18649L)
    public static SubLObject genl_preds_opposite_marking(final SubLObject marking) {
        if (sbhl_marking_vars.NIL != genl_preds_marking_p(marking)) {
            return sbhl_marking_vars.$sbhl_genl_inverse_marking$.getGlobalValue();
        }
        if (sbhl_marking_vars.NIL != genl_inverse_marking_p(marking)) {
            return sbhl_marking_vars.$sbhl_genl_preds_marking$.getGlobalValue();
        }
        return marking;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-marking-vars.lisp", position = 19196L)
    public static SubLObject increment_sbhl_marking_generation() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        sbhl_marking_vars.$sbhl_marking_generation$.setDynamicValue(Numbers.add(sbhl_marking_vars.$sbhl_marking_generation$.getDynamicValue(thread), (SubLObject)sbhl_marking_vars.ONE_INTEGER), thread);
        return (SubLObject)sbhl_marking_vars.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-marking-vars.lisp", position = 19363L)
    public static SubLObject get_sbhl_marking_generation() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return sbhl_marking_vars.$sbhl_marking_generation$.getDynamicValue(thread);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-marking-vars.lisp", position = 19511L)
    public static SubLObject with_new_sbhl_marking_generation(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return (SubLObject)ConsesLow.listS((SubLObject)sbhl_marking_vars.$sym3$CLET, (SubLObject)sbhl_marking_vars.$list92, ConsesLow.append(body, (SubLObject)sbhl_marking_vars.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-marking-vars.lisp", position = 19942L)
    public static SubLObject sbhl_suspend_new_spaces_during_mappingP() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return sbhl_marking_vars.$sbhl_suspend_new_spaces_during_mappingP$.getDynamicValue(thread);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-marking-vars.lisp", position = 20373L)
    public static SubLObject with_sbhl_mapping_marking_space(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject space = (SubLObject)sbhl_marking_vars.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_marking_vars.$list2);
        space = current.first();
        final SubLObject body;
        current = (body = current.rest());
        return (SubLObject)ConsesLow.listS((SubLObject)sbhl_marking_vars.$sym3$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)sbhl_marking_vars.$sym93$_SBHL_MAPPING_MARKING_SPACE_, space)), ConsesLow.append(body, (SubLObject)sbhl_marking_vars.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-marking-vars.lisp", position = 20560L)
    public static SubLObject with_sbhl_mapping_gather_marking_space(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject space = (SubLObject)sbhl_marking_vars.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_marking_vars.$list2);
        space = current.first();
        final SubLObject body;
        current = (body = current.rest());
        return (SubLObject)ConsesLow.listS((SubLObject)sbhl_marking_vars.$sym3$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)sbhl_marking_vars.$sym94$_SBHL_MAPPING_GATHER_MARKING_SPACE_, space)), ConsesLow.append(body, (SubLObject)sbhl_marking_vars.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-marking-vars.lisp", position = 20768L)
    public static SubLObject within_sbhl_mapping_marking_spaces(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return (SubLObject)ConsesLow.list((SubLObject)sbhl_marking_vars.$sym3$CLET, (SubLObject)sbhl_marking_vars.$list95, reader.bq_cons((SubLObject)sbhl_marking_vars.$sym42$WITH_SAME_SBHL_SPACES, ConsesLow.append(body, (SubLObject)sbhl_marking_vars.NIL)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-marking-vars.lisp", position = 21139L)
    public static SubLObject sbhl_mark_mapping_fn_in_new_target_spaces(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return (SubLObject)ConsesLow.list((SubLObject)sbhl_marking_vars.$sym77$WITH_NEW_SBHL_TARGET_SPACES, (SubLObject)ConsesLow.listS((SubLObject)sbhl_marking_vars.$sym3$CLET, (SubLObject)sbhl_marking_vars.$list96, ConsesLow.append(body, (SubLObject)sbhl_marking_vars.NIL)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-marking-vars.lisp", position = 21554L)
    public static SubLObject sbhl_mark_mapping_fn_within_space(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject space = (SubLObject)sbhl_marking_vars.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_marking_vars.$list2);
        space = current.first();
        final SubLObject body;
        current = (body = current.rest());
        return (SubLObject)ConsesLow.listS((SubLObject)sbhl_marking_vars.$sym3$CLET, reader.bq_cons((SubLObject)ConsesLow.list((SubLObject)sbhl_marking_vars.$sym93$_SBHL_MAPPING_MARKING_SPACE_, space), (SubLObject)sbhl_marking_vars.$list97), ConsesLow.append(body, (SubLObject)sbhl_marking_vars.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-marking-vars.lisp", position = 21836L)
    public static SubLObject sbhl_mark_gather_mapping_fn_within_gather_space(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject space = (SubLObject)sbhl_marking_vars.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_marking_vars.$list2);
        space = current.first();
        final SubLObject body;
        current = (body = current.rest());
        return (SubLObject)ConsesLow.listS((SubLObject)sbhl_marking_vars.$sym3$CLET, reader.bq_cons((SubLObject)ConsesLow.list((SubLObject)sbhl_marking_vars.$sym94$_SBHL_MAPPING_GATHER_MARKING_SPACE_, space), (SubLObject)sbhl_marking_vars.$list97), ConsesLow.append(body, (SubLObject)sbhl_marking_vars.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-marking-vars.lisp", position = 22435L)
    public static SubLObject sbhl_temporality_search_checks_nodes_in_target_space_p() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return sbhl_marking_vars.$sbhl_temporality_search_checks_nodes_in_target_space_p$.getDynamicValue(thread);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-marking-vars.lisp", position = 22663L)
    public static SubLObject with_sbhl_temporality_search_checks_nodes_in_target_space(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return (SubLObject)ConsesLow.listS((SubLObject)sbhl_marking_vars.$sym3$CLET, (SubLObject)sbhl_marking_vars.$list98, ConsesLow.append(body, (SubLObject)sbhl_marking_vars.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-marking-vars.lisp", position = 23145L)
    public static SubLObject sbhl_table_p(final SubLObject table) {
        return Types.hash_table_p(table);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-marking-vars.lisp", position = 23297L)
    public static SubLObject with_new_sbhl_table(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return (SubLObject)ConsesLow.listS((SubLObject)sbhl_marking_vars.$sym34$INSTANTIATE_SBHL_MARKING_SPACE_FOR, (SubLObject)sbhl_marking_vars.$sym100$_SBHL_TABLE_, ConsesLow.append(body, (SubLObject)sbhl_marking_vars.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-marking-vars.lisp", position = 23468L)
    public static SubLObject with_sbhl_table_var(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject var = (SubLObject)sbhl_marking_vars.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_marking_vars.$list58);
        var = current.first();
        final SubLObject body;
        current = (body = current.rest());
        return (SubLObject)ConsesLow.listS((SubLObject)sbhl_marking_vars.$sym3$CLET, (SubLObject)ConsesLow.list(reader.bq_cons(var, (SubLObject)sbhl_marking_vars.$list101)), ConsesLow.append(body, (SubLObject)sbhl_marking_vars.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-marking-vars.lisp", position = 23610L)
    public static SubLObject with_new_sbhl_table_named(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject name = (SubLObject)sbhl_marking_vars.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_marking_vars.$list36);
        name = current.first();
        final SubLObject body;
        current = (body = current.rest());
        final SubLObject resourcing_p = (SubLObject)sbhl_marking_vars.$sym102$RESOURCING_P;
        return (SubLObject)ConsesLow.list((SubLObject)sbhl_marking_vars.$sym3$CLET, (SubLObject)ConsesLow.list(reader.bq_cons(resourcing_p, (SubLObject)sbhl_marking_vars.$list103)), (SubLObject)ConsesLow.list((SubLObject)sbhl_marking_vars.$sym104$WITHOUT_SBHL_RESOURCED_MARKING_SPACES, (SubLObject)ConsesLow.list((SubLObject)sbhl_marking_vars.$sym105$WITH_NEW_SBHL_TABLE, (SubLObject)ConsesLow.list((SubLObject)sbhl_marking_vars.$sym106$WITH_SBHL_TABLE_VAR, name, (SubLObject)ConsesLow.listS((SubLObject)sbhl_marking_vars.$sym107$TOGGLE_SBHL_RESOURCED_MARKING_SPACES, resourcing_p, ConsesLow.append(body, (SubLObject)sbhl_marking_vars.NIL))))));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-marking-vars.lisp", position = 24028L)
    public static SubLObject within_sbhl_table(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject var = (SubLObject)sbhl_marking_vars.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_marking_vars.$list58);
        var = current.first();
        final SubLObject body;
        current = (body = current.rest());
        return (SubLObject)ConsesLow.listS((SubLObject)sbhl_marking_vars.$sym3$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)sbhl_marking_vars.$sym100$_SBHL_TABLE_, var)), ConsesLow.append(body, (SubLObject)sbhl_marking_vars.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-marking-vars.lisp", position = 24165L)
    public static SubLObject do_sbhl_table(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_marking_vars.$list108);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject node_var = (SubLObject)sbhl_marking_vars.NIL;
        SubLObject marking_var = (SubLObject)sbhl_marking_vars.NIL;
        SubLObject sbhl_table = (SubLObject)sbhl_marking_vars.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_marking_vars.$list108);
        node_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_marking_vars.$list108);
        marking_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_marking_vars.$list108);
        sbhl_table = current.first();
        current = current.rest();
        final SubLObject done_var = (SubLObject)(current.isCons() ? current.first() : sbhl_marking_vars.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)sbhl_marking_vars.$list108);
        current = current.rest();
        if (sbhl_marking_vars.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            return (SubLObject)ConsesLow.listS((SubLObject)sbhl_marking_vars.$sym62$DO_HASH_TABLE, (SubLObject)ConsesLow.list(node_var, marking_var, sbhl_table, (SubLObject)sbhl_marking_vars.$kw63$DONE, done_var), ConsesLow.append(body, (SubLObject)sbhl_marking_vars.NIL));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)sbhl_marking_vars.$list108);
        return (SubLObject)sbhl_marking_vars.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-marking-vars.lisp", position = 24453L)
    public static SubLObject map_sbhl_table(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject function = (SubLObject)sbhl_marking_vars.NIL;
        SubLObject sbhl_table = (SubLObject)sbhl_marking_vars.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_marking_vars.$list109);
        function = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_marking_vars.$list109);
        sbhl_table = current.first();
        current = current.rest();
        if (sbhl_marking_vars.NIL == current) {
            final SubLObject node = (SubLObject)sbhl_marking_vars.$sym110$NODE;
            final SubLObject tag = (SubLObject)sbhl_marking_vars.$sym111$TAG;
            return (SubLObject)ConsesLow.list((SubLObject)sbhl_marking_vars.$sym67$PCOND, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)sbhl_marking_vars.$sym68$HASH_TABLE_P, sbhl_table), (SubLObject)ConsesLow.list((SubLObject)sbhl_marking_vars.$sym69$CDOHASH, (SubLObject)ConsesLow.list(node, tag, sbhl_table), (SubLObject)ConsesLow.list((SubLObject)sbhl_marking_vars.$sym70$IGNORE, tag), (SubLObject)ConsesLow.list((SubLObject)sbhl_marking_vars.$sym71$FUNCALL, function, node))), (SubLObject)ConsesLow.list((SubLObject)sbhl_marking_vars.T, (SubLObject)ConsesLow.list((SubLObject)sbhl_marking_vars.$sym72$SBHL_ERROR, (SubLObject)sbhl_marking_vars.THREE_INTEGER, (SubLObject)sbhl_marking_vars.$str112$no_mapping_method_defiend_for_sbh, sbhl_table)));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)sbhl_marking_vars.$list109);
        return (SubLObject)sbhl_marking_vars.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-marking-vars.lisp", position = 24814L)
    public static SubLObject mark_in_sbhl_table(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return (SubLObject)ConsesLow.listS((SubLObject)sbhl_marking_vars.$sym113$WITHIN_SBHL_SPACE, (SubLObject)sbhl_marking_vars.$sym100$_SBHL_TABLE_, ConsesLow.append(body, (SubLObject)sbhl_marking_vars.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-marking-vars.lisp", position = 25067L)
    public static SubLObject get_sbhl_goal_table() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return sbhl_marking_vars.$sbhl_goal_table$.getDynamicValue(thread);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-marking-vars.lisp", position = 25202L)
    public static SubLObject with_sbhl_goal_table(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject table = (SubLObject)sbhl_marking_vars.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_marking_vars.$list114);
        table = current.first();
        final SubLObject body;
        current = (body = current.rest());
        return (SubLObject)ConsesLow.listS((SubLObject)sbhl_marking_vars.$sym3$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)sbhl_marking_vars.$sym115$_SBHL_GOAL_TABLE_, table)), ConsesLow.append(body, (SubLObject)sbhl_marking_vars.NIL));
    }
    
    public static SubLObject declare_sbhl_marking_vars_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_marking_vars", "average_genl_cardinality", "AVERAGE-GENL-CARDINALITY", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_marking_vars", "average_spec_cardinality", "AVERAGE-SPEC-CARDINALITY", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_marking_vars", "get_sbhl_marking_space", "GET-SBHL-MARKING-SPACE", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_marking_vars", "free_sbhl_marking_space", "FREE-SBHL-MARKING-SPACE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_marking_vars", "instantiate_sbhl_marking_space", "INSTANTIATE-SBHL-MARKING-SPACE", 0, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.sbhl.sbhl_marking_vars", "instantiate_sbhl_marking_space_for", "INSTANTIATE-SBHL-MARKING-SPACE-FOR");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_marking_vars", "resourcing_sbhl_marking_spaces_p", "RESOURCING-SBHL-MARKING-SPACES-P", 0, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.sbhl.sbhl_marking_vars", "with_sbhl_resourced_marking_spaces", "WITH-SBHL-RESOURCED-MARKING-SPACES");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_marking_vars", "determine_resource_limit", "DETERMINE-RESOURCE-LIMIT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_marking_vars", "possibly_new_marking_resource", "POSSIBLY-NEW-MARKING-RESOURCE", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.sbhl.sbhl_marking_vars", "without_sbhl_resourced_marking_spaces", "WITHOUT-SBHL-RESOURCED-MARKING-SPACES");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.sbhl.sbhl_marking_vars", "toggle_sbhl_resourced_marking_spaces", "TOGGLE-SBHL-RESOURCED-MARKING-SPACES");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_marking_vars", "new_sbhl_marking_space_resource", "NEW-SBHL-MARKING-SPACE-RESOURCE", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_marking_vars", "current_sbhl_marking_space_resource", "CURRENT-SBHL-MARKING-SPACE-RESOURCE", 0, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.sbhl.sbhl_marking_vars", "with_sbhl_marking_space_resource", "WITH-SBHL-MARKING-SPACE-RESOURCE");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.sbhl.sbhl_marking_vars", "with_new_sbhl_marking_space_resource", "WITH-NEW-SBHL-MARKING-SPACE-RESOURCE");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_marking_vars", "determine_marking_space_limit", "DETERMINE-MARKING-SPACE-LIMIT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_marking_vars", "get_sbhl_resourced_marking_space", "GET-SBHL-RESOURCED-MARKING-SPACE", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_marking_vars", "update_sbhl_resourced_spaces", "UPDATE-SBHL-RESOURCED-SPACES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_marking_vars", "clear_recourced_sbhl_spaces", "CLEAR-RECOURCED-SBHL-SPACES", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_marking_vars", "sbhl_space_obect_p", "SBHL-SPACE-OBECT-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_marking_vars", "get_sbhl_space", "GET-SBHL-SPACE", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_marking_vars", "get_sbhl_gather_space", "GET-SBHL-GATHER-SPACE", 0, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.sbhl.sbhl_marking_vars", "with_new_sbhl_space", "WITH-NEW-SBHL-SPACE");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.sbhl.sbhl_marking_vars", "with_new_sbhl_space_named", "WITH-NEW-SBHL-SPACE-NAMED");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.sbhl.sbhl_marking_vars", "with_new_sbhl_gather_space", "WITH-NEW-SBHL-GATHER-SPACE");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.sbhl.sbhl_marking_vars", "with_new_sbhl_spaces", "WITH-NEW-SBHL-SPACES");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.sbhl.sbhl_marking_vars", "with_new_sbhl_spaces_used_repeatedly", "WITH-NEW-SBHL-SPACES-USED-REPEATEDLY");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.sbhl.sbhl_marking_vars", "with_new_sbhl_space_used_repeatedly", "WITH-NEW-SBHL-SPACE-USED-REPEATEDLY");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.sbhl.sbhl_marking_vars", "possibly_with_new_sbhl_spaces", "POSSIBLY-WITH-NEW-SBHL-SPACES");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.sbhl.sbhl_marking_vars", "possibly_with_new_sbhl_space", "POSSIBLY-WITH-NEW-SBHL-SPACE");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_marking_vars", "sbhl_new_space_source", "SBHL-NEW-SPACE-SOURCE", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_marking_vars", "sbhl_get_new_space", "SBHL-GET-NEW-SPACE", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.sbhl.sbhl_marking_vars", "with_sbhl_space_var", "WITH-SBHL-SPACE-VAR");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.sbhl.sbhl_marking_vars", "with_sbhl_gather_space_var", "WITH-SBHL-GATHER-SPACE-VAR");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.sbhl.sbhl_marking_vars", "within_sbhl_space", "WITHIN-SBHL-SPACE");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.sbhl.sbhl_marking_vars", "within_sbhl_gather_space", "WITHIN-SBHL-GATHER-SPACE");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.sbhl.sbhl_marking_vars", "do_sbhl_space", "DO-SBHL-SPACE");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.sbhl.sbhl_marking_vars", "map_sbhl_space", "MAP-SBHL-SPACE");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_marking_vars", "sbhl_suspend_new_spacesP", "SBHL-SUSPEND-NEW-SPACES?", 0, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.sbhl.sbhl_marking_vars", "with_same_sbhl_spaces", "WITH-SAME-SBHL-SPACES");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.sbhl.sbhl_marking_vars", "without_suspending_new_sbhl_spaces", "WITHOUT-SUSPENDING-NEW-SBHL-SPACES");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_marking_vars", "get_sbhl_goal_space", "GET-SBHL-GOAL-SPACE", 0, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.sbhl.sbhl_marking_vars", "with_sbhl_goal_space", "WITH-SBHL-GOAL-SPACE");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.sbhl.sbhl_marking_vars", "with_sbhl_target_spaces", "WITH-SBHL-TARGET-SPACES");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.sbhl.sbhl_marking_vars", "with_new_sbhl_target_spaces", "WITH-NEW-SBHL-TARGET-SPACES");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.sbhl.sbhl_marking_vars", "with_new_sbhl_target_space", "WITH-NEW-SBHL-TARGET-SPACE");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.sbhl.sbhl_marking_vars", "with_new_sbhl_target_gather_space", "WITH-NEW-SBHL-TARGET-GATHER-SPACE");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.sbhl.sbhl_marking_vars", "within_sbhl_target_spaces", "WITHIN-SBHL-TARGET-SPACES");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.sbhl.sbhl_marking_vars", "within_sbhl_target_space", "WITHIN-SBHL-TARGET-SPACE");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.sbhl.sbhl_marking_vars", "within_new_sbhl_target_space", "WITHIN-NEW-SBHL-TARGET-SPACE");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.sbhl.sbhl_marking_vars", "with_sbhl_target_space_named", "WITH-SBHL-TARGET-SPACE-NAMED");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_marking_vars", "clear_sbhl_target_spaces", "CLEAR-SBHL-TARGET-SPACES", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_marking_vars", "clear_sbhl_target_space", "CLEAR-SBHL-TARGET-SPACE", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_marking_vars", "get_sbhl_terminating_marking_space", "GET-SBHL-TERMINATING-MARKING-SPACE", 0, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.sbhl.sbhl_marking_vars", "with_sbhl_terminating_space", "WITH-SBHL-TERMINATING-SPACE");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.sbhl.sbhl_marking_vars", "within_sbhl_terminating_marking_space", "WITHIN-SBHL-TERMINATING-MARKING-SPACE");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.sbhl.sbhl_marking_vars", "with_sbhl_apply_marking_space", "WITH-SBHL-APPLY-MARKING-SPACE");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_marking_vars", "genl_preds_marking_p", "GENL-PREDS-MARKING-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_marking_vars", "genl_inverse_marking_p", "GENL-INVERSE-MARKING-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_marking_vars", "genl_preds_and_genl_inverse_marking_p", "GENL-PREDS-AND-GENL-INVERSE-MARKING-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_marking_vars", "genl_preds_opposite_marking", "GENL-PREDS-OPPOSITE-MARKING", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_marking_vars", "increment_sbhl_marking_generation", "INCREMENT-SBHL-MARKING-GENERATION", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_marking_vars", "get_sbhl_marking_generation", "GET-SBHL-MARKING-GENERATION", 0, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.sbhl.sbhl_marking_vars", "with_new_sbhl_marking_generation", "WITH-NEW-SBHL-MARKING-GENERATION");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_marking_vars", "sbhl_suspend_new_spaces_during_mappingP", "SBHL-SUSPEND-NEW-SPACES-DURING-MAPPING?", 0, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.sbhl.sbhl_marking_vars", "with_sbhl_mapping_marking_space", "WITH-SBHL-MAPPING-MARKING-SPACE");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.sbhl.sbhl_marking_vars", "with_sbhl_mapping_gather_marking_space", "WITH-SBHL-MAPPING-GATHER-MARKING-SPACE");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.sbhl.sbhl_marking_vars", "within_sbhl_mapping_marking_spaces", "WITHIN-SBHL-MAPPING-MARKING-SPACES");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.sbhl.sbhl_marking_vars", "sbhl_mark_mapping_fn_in_new_target_spaces", "SBHL-MARK-MAPPING-FN-IN-NEW-TARGET-SPACES");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.sbhl.sbhl_marking_vars", "sbhl_mark_mapping_fn_within_space", "SBHL-MARK-MAPPING-FN-WITHIN-SPACE");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.sbhl.sbhl_marking_vars", "sbhl_mark_gather_mapping_fn_within_gather_space", "SBHL-MARK-GATHER-MAPPING-FN-WITHIN-GATHER-SPACE");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_marking_vars", "sbhl_temporality_search_checks_nodes_in_target_space_p", "SBHL-TEMPORALITY-SEARCH-CHECKS-NODES-IN-TARGET-SPACE-P", 0, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.sbhl.sbhl_marking_vars", "with_sbhl_temporality_search_checks_nodes_in_target_space", "WITH-SBHL-TEMPORALITY-SEARCH-CHECKS-NODES-IN-TARGET-SPACE");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_marking_vars", "sbhl_table_p", "SBHL-TABLE-P", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.sbhl.sbhl_marking_vars", "with_new_sbhl_table", "WITH-NEW-SBHL-TABLE");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.sbhl.sbhl_marking_vars", "with_sbhl_table_var", "WITH-SBHL-TABLE-VAR");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.sbhl.sbhl_marking_vars", "with_new_sbhl_table_named", "WITH-NEW-SBHL-TABLE-NAMED");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.sbhl.sbhl_marking_vars", "within_sbhl_table", "WITHIN-SBHL-TABLE");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.sbhl.sbhl_marking_vars", "do_sbhl_table", "DO-SBHL-TABLE");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.sbhl.sbhl_marking_vars", "map_sbhl_table", "MAP-SBHL-TABLE");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.sbhl.sbhl_marking_vars", "mark_in_sbhl_table", "MARK-IN-SBHL-TABLE");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_marking_vars", "get_sbhl_goal_table", "GET-SBHL-GOAL-TABLE", 0, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.sbhl.sbhl_marking_vars", "with_sbhl_goal_table", "WITH-SBHL-GOAL-TABLE");
        return (SubLObject)sbhl_marking_vars.NIL;
    }
    
    public static SubLObject init_sbhl_marking_vars_file() {
        sbhl_marking_vars.$debug_sbhl_marking_spacesP$ = SubLFiles.defparameter("*DEBUG-SBHL-MARKING-SPACES?*", (SubLObject)sbhl_marking_vars.NIL);
        sbhl_marking_vars.$use_zero_size_sbhl_marking_spacesP$ = SubLFiles.defparameter("*USE-ZERO-SIZE-SBHL-MARKING-SPACES?*", (SubLObject)sbhl_marking_vars.T);
        sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$ = SubLFiles.defparameter("*RESOURCING-SBHL-MARKING-SPACES-P*", (SubLObject)sbhl_marking_vars.NIL);
        sbhl_marking_vars.$resourced_sbhl_marking_space_limit$ = SubLFiles.defparameter("*RESOURCED-SBHL-MARKING-SPACE-LIMIT*", (SubLObject)sbhl_marking_vars.NIL);
        sbhl_marking_vars.$resourced_sbhl_marking_spaces$ = SubLFiles.defparameter("*RESOURCED-SBHL-MARKING-SPACES*", (SubLObject)sbhl_marking_vars.NIL);
        sbhl_marking_vars.$default_resourced_sbhl_space_limit$ = SubLFiles.deflexical("*DEFAULT-RESOURCED-SBHL-SPACE-LIMIT*", (SubLObject)sbhl_marking_vars.FOUR_INTEGER);
        sbhl_marking_vars.$within_new_sbhl_marking_space_resource$ = SubLFiles.defparameter("*WITHIN-NEW-SBHL-MARKING-SPACE-RESOURCE*", (SubLObject)sbhl_marking_vars.NIL);
        sbhl_marking_vars.$sbhl_space$ = SubLFiles.defparameter("*SBHL-SPACE*", (SubLObject)sbhl_marking_vars.NIL);
        sbhl_marking_vars.$sbhl_gather_space$ = SubLFiles.defparameter("*SBHL-GATHER-SPACE*", (SubLObject)sbhl_marking_vars.NIL);
        sbhl_marking_vars.$sbhl_disjoins_space$ = SubLFiles.defparameter("*SBHL-DISJOINS-SPACE*", (SubLObject)sbhl_marking_vars.NIL);
        sbhl_marking_vars.$sbhl_space_0$ = SubLFiles.defparameter("*SBHL-SPACE-0*", (SubLObject)sbhl_marking_vars.NIL);
        sbhl_marking_vars.$sbhl_space_1$ = SubLFiles.defparameter("*SBHL-SPACE-1*", (SubLObject)sbhl_marking_vars.NIL);
        sbhl_marking_vars.$sbhl_space_2$ = SubLFiles.defparameter("*SBHL-SPACE-2*", (SubLObject)sbhl_marking_vars.NIL);
        sbhl_marking_vars.$sbhl_space_3$ = SubLFiles.defparameter("*SBHL-SPACE-3*", (SubLObject)sbhl_marking_vars.NIL);
        sbhl_marking_vars.$sbhl_space_4$ = SubLFiles.defparameter("*SBHL-SPACE-4*", (SubLObject)sbhl_marking_vars.NIL);
        sbhl_marking_vars.$sbhl_space_5$ = SubLFiles.defparameter("*SBHL-SPACE-5*", (SubLObject)sbhl_marking_vars.NIL);
        sbhl_marking_vars.$sbhl_suspend_new_spacesP$ = SubLFiles.defparameter("*SBHL-SUSPEND-NEW-SPACES?*", (SubLObject)sbhl_marking_vars.NIL);
        sbhl_marking_vars.$sbhl_goal_space$ = SubLFiles.defparameter("*SBHL-GOAL-SPACE*", (SubLObject)sbhl_marking_vars.NIL);
        sbhl_marking_vars.$sbhl_target_space$ = SubLFiles.defparameter("*SBHL-TARGET-SPACE*", (SubLObject)sbhl_marking_vars.NIL);
        sbhl_marking_vars.$sbhl_target_gather_space$ = SubLFiles.defparameter("*SBHL-TARGET-GATHER-SPACE*", (SubLObject)sbhl_marking_vars.NIL);
        sbhl_marking_vars.$sbhl_terminating_marking_space$ = SubLFiles.defparameter("*SBHL-TERMINATING-MARKING-SPACE*", (SubLObject)sbhl_marking_vars.NIL);
        sbhl_marking_vars.$sbhl_apply_marking_space$ = SubLFiles.defparameter("*SBHL-APPLY-MARKING-SPACE*", (SubLObject)sbhl_marking_vars.NIL);
        sbhl_marking_vars.$sbhl_genl_preds_marking$ = SubLFiles.deflexical("*SBHL-GENL-PREDS-MARKING*", (SubLObject)sbhl_marking_vars.$list88);
        sbhl_marking_vars.$sbhl_genl_inverse_marking$ = SubLFiles.deflexical("*SBHL-GENL-INVERSE-MARKING*", (SubLObject)sbhl_marking_vars.$list89);
        sbhl_marking_vars.$sbhl_genl_preds_and_genl_inverse_marking$ = SubLFiles.deflexical("*SBHL-GENL-PREDS-AND-GENL-INVERSE-MARKING*", (SubLObject)sbhl_marking_vars.$list90);
        sbhl_marking_vars.$sbhl_genl_inverse_and_genl_preds_marking$ = SubLFiles.deflexical("*SBHL-GENL-INVERSE-AND-GENL-PREDS-MARKING*", (SubLObject)sbhl_marking_vars.$list91);
        sbhl_marking_vars.$sbhl_marking_generation$ = SubLFiles.defparameter("*SBHL-MARKING-GENERATION*", (SubLObject)sbhl_marking_vars.NIL);
        sbhl_marking_vars.$sbhl_suspend_new_spaces_during_mappingP$ = SubLFiles.defparameter("*SBHL-SUSPEND-NEW-SPACES-DURING-MAPPING?*", (SubLObject)sbhl_marking_vars.NIL);
        sbhl_marking_vars.$sbhl_mapping_marking_space$ = SubLFiles.defparameter("*SBHL-MAPPING-MARKING-SPACE*", (SubLObject)sbhl_marking_vars.NIL);
        sbhl_marking_vars.$sbhl_mapping_gather_marking_space$ = SubLFiles.defparameter("*SBHL-MAPPING-GATHER-MARKING-SPACE*", (SubLObject)sbhl_marking_vars.NIL);
        sbhl_marking_vars.$sbhl_temporality_search_checks_nodes_in_target_space_p$ = SubLFiles.defparameter("*SBHL-TEMPORALITY-SEARCH-CHECKS-NODES-IN-TARGET-SPACE-P*", (SubLObject)sbhl_marking_vars.NIL);
        sbhl_marking_vars.$sbhl_table$ = SubLFiles.defparameter("*SBHL-TABLE*", (SubLObject)sbhl_marking_vars.$str99$Table_used_for_public_marking_int);
        sbhl_marking_vars.$sbhl_goal_table$ = SubLFiles.defparameter("*SBHL-GOAL-TABLE*", (SubLObject)sbhl_marking_vars.NIL);
        return (SubLObject)sbhl_marking_vars.NIL;
    }
    
    public static SubLObject setup_sbhl_marking_vars_file() {
        access_macros.register_macro_helper((SubLObject)sbhl_marking_vars.$sym12$DETERMINE_RESOURCE_LIMIT, (SubLObject)sbhl_marking_vars.$sym16$WITH_SBHL_RESOURCED_MARKING_SPACES);
        access_macros.register_macro_helper((SubLObject)sbhl_marking_vars.$sym14$POSSIBLY_NEW_MARKING_RESOURCE, (SubLObject)sbhl_marking_vars.$sym16$WITH_SBHL_RESOURCED_MARKING_SPACES);
        access_macros.register_macro_helper((SubLObject)sbhl_marking_vars.$sym31$DETERMINE_MARKING_SPACE_LIMIT, (SubLObject)sbhl_marking_vars.NIL);
        access_macros.register_macro_helper((SubLObject)sbhl_marking_vars.$sym45$POSSIBLY_WITH_NEW_SBHL_SPACE, (SubLObject)sbhl_marking_vars.$sym46$POSSIBLY_WITH_NEW_SBHL_SPACES);
        access_macros.register_macro_helper((SubLObject)sbhl_marking_vars.$sym54$SBHL_NEW_SPACE_SOURCE, (SubLObject)sbhl_marking_vars.$sym46$POSSIBLY_WITH_NEW_SBHL_SPACES);
        access_macros.register_macro_helper((SubLObject)sbhl_marking_vars.$sym50$SBHL_GET_NEW_SPACE, (SubLObject)sbhl_marking_vars.$sym46$POSSIBLY_WITH_NEW_SBHL_SPACES);
        return (SubLObject)sbhl_marking_vars.NIL;
    }
    
    public void declareFunctions() {
        declare_sbhl_marking_vars_file();
    }
    
    public void initializeVariables() {
        init_sbhl_marking_vars_file();
    }
    
    public void runTopLevelForms() {
        setup_sbhl_marking_vars_file();
    }
    
    static {
        me = (SubLFile)new sbhl_marking_vars();
        sbhl_marking_vars.$debug_sbhl_marking_spacesP$ = null;
        sbhl_marking_vars.$use_zero_size_sbhl_marking_spacesP$ = null;
        sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$ = null;
        sbhl_marking_vars.$resourced_sbhl_marking_space_limit$ = null;
        sbhl_marking_vars.$resourced_sbhl_marking_spaces$ = null;
        sbhl_marking_vars.$default_resourced_sbhl_space_limit$ = null;
        sbhl_marking_vars.$within_new_sbhl_marking_space_resource$ = null;
        sbhl_marking_vars.$sbhl_space$ = null;
        sbhl_marking_vars.$sbhl_gather_space$ = null;
        sbhl_marking_vars.$sbhl_disjoins_space$ = null;
        sbhl_marking_vars.$sbhl_space_0$ = null;
        sbhl_marking_vars.$sbhl_space_1$ = null;
        sbhl_marking_vars.$sbhl_space_2$ = null;
        sbhl_marking_vars.$sbhl_space_3$ = null;
        sbhl_marking_vars.$sbhl_space_4$ = null;
        sbhl_marking_vars.$sbhl_space_5$ = null;
        sbhl_marking_vars.$sbhl_suspend_new_spacesP$ = null;
        sbhl_marking_vars.$sbhl_goal_space$ = null;
        sbhl_marking_vars.$sbhl_target_space$ = null;
        sbhl_marking_vars.$sbhl_target_gather_space$ = null;
        sbhl_marking_vars.$sbhl_terminating_marking_space$ = null;
        sbhl_marking_vars.$sbhl_apply_marking_space$ = null;
        sbhl_marking_vars.$sbhl_genl_preds_marking$ = null;
        sbhl_marking_vars.$sbhl_genl_inverse_marking$ = null;
        sbhl_marking_vars.$sbhl_genl_preds_and_genl_inverse_marking$ = null;
        sbhl_marking_vars.$sbhl_genl_inverse_and_genl_preds_marking$ = null;
        sbhl_marking_vars.$sbhl_marking_generation$ = null;
        sbhl_marking_vars.$sbhl_suspend_new_spaces_during_mappingP$ = null;
        sbhl_marking_vars.$sbhl_mapping_marking_space$ = null;
        sbhl_marking_vars.$sbhl_mapping_gather_marking_space$ = null;
        sbhl_marking_vars.$sbhl_temporality_search_checks_nodes_in_target_space_p$ = null;
        sbhl_marking_vars.$sbhl_table$ = null;
        sbhl_marking_vars.$sbhl_goal_table$ = null;
        $int0$100 = SubLObjectFactory.makeInteger(100);
        $int1$3000 = SubLObjectFactory.makeInteger(3000);
        $list2 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SPACE"), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym3$CLET = SubLObjectFactory.makeSymbol("CLET");
        $list4 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-SBHL-MARKING-SPACE")));
        $sym5$CUNWIND_PROTECT = SubLObjectFactory.makeSymbol("CUNWIND-PROTECT");
        $sym6$PROGN = SubLObjectFactory.makeSymbol("PROGN");
        $sym7$FREE_SBHL_MARKING_SPACE = SubLObjectFactory.makeSymbol("FREE-SBHL-MARKING-SPACE");
        $list8 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NUM"), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym9$ALREADY_RESOURCING_P = SubLObjectFactory.makeUninternedSymbol("ALREADY-RESOURCING-P");
        $list10 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*RESOURCING-SBHL-MARKING-SPACES-P*"));
        $sym11$_RESOURCED_SBHL_MARKING_SPACE_LIMIT_ = SubLObjectFactory.makeSymbol("*RESOURCED-SBHL-MARKING-SPACE-LIMIT*");
        $sym12$DETERMINE_RESOURCE_LIMIT = SubLObjectFactory.makeSymbol("DETERMINE-RESOURCE-LIMIT");
        $sym13$_RESOURCED_SBHL_MARKING_SPACES_ = SubLObjectFactory.makeSymbol("*RESOURCED-SBHL-MARKING-SPACES*");
        $sym14$POSSIBLY_NEW_MARKING_RESOURCE = SubLObjectFactory.makeSymbol("POSSIBLY-NEW-MARKING-RESOURCE");
        $list15 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*RESOURCING-SBHL-MARKING-SPACES-P*"), (SubLObject)sbhl_marking_vars.T));
        $sym16$WITH_SBHL_RESOURCED_MARKING_SPACES = SubLObjectFactory.makeSymbol("WITH-SBHL-RESOURCED-MARKING-SPACES");
        $list17 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*RESOURCING-SBHL-MARKING-SPACES-P*"), (SubLObject)sbhl_marking_vars.NIL));
        $list18 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RESOURCING-P"), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym19$_RESOURCING_SBHL_MARKING_SPACES_P_ = SubLObjectFactory.makeSymbol("*RESOURCING-SBHL-MARKING-SPACES-P*");
        $list20 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SBHL-MS-RESOURCE"), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $list21 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*RESOURCING-SBHL-MARKING-SPACES-P*"), (SubLObject)sbhl_marking_vars.T), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*RESOURCED-SBHL-MARKING-SPACE-LIMIT*"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DETERMINE-MARKING-SPACE-LIMIT"), (SubLObject)SubLObjectFactory.makeSymbol("*RESOURCED-SBHL-MARKING-SPACES*"))));
        $sym22$CSETQ = SubLObjectFactory.makeSymbol("CSETQ");
        $list23 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*RESOURCED-SBHL-MARKING-SPACES*"));
        $list24 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("NUM")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $list25 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NUM"));
        $kw26$ALLOW_OTHER_KEYS = SubLObjectFactory.makeKeyword("ALLOW-OTHER-KEYS");
        $kw27$NUM = SubLObjectFactory.makeKeyword("NUM");
        $sym28$SBHL_MS_RESOURCE = SubLObjectFactory.makeUninternedSymbol("SBHL-MS-RESOURCE");
        $sym29$NEW_SBHL_MARKING_SPACE_RESOURCE = SubLObjectFactory.makeSymbol("NEW-SBHL-MARKING-SPACE-RESOURCE");
        $sym30$WITH_SBHL_MARKING_SPACE_RESOURCE = SubLObjectFactory.makeSymbol("WITH-SBHL-MARKING-SPACE-RESOURCE");
        $sym31$DETERMINE_MARKING_SPACE_LIMIT = SubLObjectFactory.makeSymbol("DETERMINE-MARKING-SPACE-LIMIT");
        $str32$Dirty_resourced_marking_space_bei = SubLObjectFactory.makeString("Dirty resourced marking space being reused ~A!");
        $str33$Have__S_more_spaces_than_the_limi = SubLObjectFactory.makeString("Have ~S more spaces than the limit of ~A marking spaces.");
        $sym34$INSTANTIATE_SBHL_MARKING_SPACE_FOR = SubLObjectFactory.makeSymbol("INSTANTIATE-SBHL-MARKING-SPACE-FOR");
        $sym35$_SBHL_SPACE_ = SubLObjectFactory.makeSymbol("*SBHL-SPACE*");
        $list36 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NAME"), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym37$WITH_NEW_SBHL_SPACE = SubLObjectFactory.makeSymbol("WITH-NEW-SBHL-SPACE");
        $sym38$WITH_SBHL_SPACE_VAR = SubLObjectFactory.makeSymbol("WITH-SBHL-SPACE-VAR");
        $sym39$_SBHL_GATHER_SPACE_ = SubLObjectFactory.makeSymbol("*SBHL-GATHER-SPACE*");
        $sym40$WITH_NEW_SBHL_GATHER_SPACE = SubLObjectFactory.makeSymbol("WITH-NEW-SBHL-GATHER-SPACE");
        $sym41$WITH_NEW_SBHL_SPACES = SubLObjectFactory.makeSymbol("WITH-NEW-SBHL-SPACES");
        $sym42$WITH_SAME_SBHL_SPACES = SubLObjectFactory.makeSymbol("WITH-SAME-SBHL-SPACES");
        $sym43$SOURCE = SubLObjectFactory.makeUninternedSymbol("SOURCE");
        $list44 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SBHL-NEW-SPACE-SOURCE")));
        $sym45$POSSIBLY_WITH_NEW_SBHL_SPACE = SubLObjectFactory.makeSymbol("POSSIBLY-WITH-NEW-SBHL-SPACE");
        $sym46$POSSIBLY_WITH_NEW_SBHL_SPACES = SubLObjectFactory.makeSymbol("POSSIBLY-WITH-NEW-SBHL-SPACES");
        $list47 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SPACE"), (SubLObject)SubLObjectFactory.makeSymbol("SOURCE")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym48$FIF = SubLObjectFactory.makeSymbol("FIF");
        $list49 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("OLD"));
        $sym50$SBHL_GET_NEW_SPACE = SubLObjectFactory.makeSymbol("SBHL-GET-NEW-SPACE");
        $sym51$PWHEN = SubLObjectFactory.makeSymbol("PWHEN");
        $list52 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("RESOURCE"));
        $sym53$UPDATE_SBHL_RESOURCED_SPACES = SubLObjectFactory.makeSymbol("UPDATE-SBHL-RESOURCED-SPACES");
        $sym54$SBHL_NEW_SPACE_SOURCE = SubLObjectFactory.makeSymbol("SBHL-NEW-SPACE-SOURCE");
        $kw55$OLD = SubLObjectFactory.makeKeyword("OLD");
        $kw56$RESOURCE = SubLObjectFactory.makeKeyword("RESOURCE");
        $kw57$NEW = SubLObjectFactory.makeKeyword("NEW");
        $list58 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("VAR"), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $list59 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*SBHL-SPACE*"));
        $list60 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*SBHL-GATHER-SPACE*"));
        $list61 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NODE-VAR"), (SubLObject)SubLObjectFactory.makeSymbol("MARKING-VAR"), (SubLObject)SubLObjectFactory.makeSymbol("SBHL-SPACE"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("DONE-VAR")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym62$DO_HASH_TABLE = SubLObjectFactory.makeSymbol("DO-HASH-TABLE");
        $kw63$DONE = SubLObjectFactory.makeKeyword("DONE");
        $list64 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCTION"), (SubLObject)SubLObjectFactory.makeSymbol("SBHL-SPACE"));
        $sym65$NODE = SubLObjectFactory.makeUninternedSymbol("NODE");
        $sym66$TAG = SubLObjectFactory.makeUninternedSymbol("TAG");
        $sym67$PCOND = SubLObjectFactory.makeSymbol("PCOND");
        $sym68$HASH_TABLE_P = SubLObjectFactory.makeSymbol("HASH-TABLE-P");
        $sym69$CDOHASH = SubLObjectFactory.makeSymbol("CDOHASH");
        $sym70$IGNORE = SubLObjectFactory.makeSymbol("IGNORE");
        $sym71$FUNCALL = SubLObjectFactory.makeSymbol("FUNCALL");
        $sym72$SBHL_ERROR = SubLObjectFactory.makeSymbol("SBHL-ERROR");
        $str73$no_mapping_method_defiend_for_sbh = SubLObjectFactory.makeString("no mapping method defiend for sbhl-space ~s");
        $list74 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*SBHL-SUSPEND-NEW-SPACES?*"), (SubLObject)sbhl_marking_vars.T));
        $list75 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*SBHL-SUSPEND-NEW-SPACES?*"), (SubLObject)sbhl_marking_vars.NIL));
        $sym76$_SBHL_GOAL_SPACE_ = SubLObjectFactory.makeSymbol("*SBHL-GOAL-SPACE*");
        $sym77$WITH_NEW_SBHL_TARGET_SPACES = SubLObjectFactory.makeSymbol("WITH-NEW-SBHL-TARGET-SPACES");
        $list78 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*SBHL-SPACE*"), (SubLObject)SubLObjectFactory.makeSymbol("*SBHL-TARGET-SPACE*")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*SBHL-GATHER-SPACE*"), (SubLObject)SubLObjectFactory.makeSymbol("*SBHL-TARGET-GATHER-SPACE*")));
        $sym79$_SBHL_TARGET_SPACE_ = SubLObjectFactory.makeSymbol("*SBHL-TARGET-SPACE*");
        $sym80$_SBHL_TARGET_GATHER_SPACE_ = SubLObjectFactory.makeSymbol("*SBHL-TARGET-GATHER-SPACE*");
        $list81 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*SBHL-SPACE*"), (SubLObject)SubLObjectFactory.makeSymbol("*SBHL-TARGET-SPACE*")));
        $sym82$WITH_NEW_SBHL_TARGET_SPACE = SubLObjectFactory.makeSymbol("WITH-NEW-SBHL-TARGET-SPACE");
        $sym83$WITHIN_SBHL_TARGET_SPACE = SubLObjectFactory.makeSymbol("WITHIN-SBHL-TARGET-SPACE");
        $list84 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SPACE-VAR"), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym85$_SBHL_TERMINATING_MARKING_SPACE_ = SubLObjectFactory.makeSymbol("*SBHL-TERMINATING-MARKING-SPACE*");
        $list86 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*SBHL-SPACE*"), (SubLObject)SubLObjectFactory.makeSymbol("*SBHL-TERMINATING-MARKING-SPACE*")));
        $sym87$_SBHL_APPLY_MARKING_SPACE_ = SubLObjectFactory.makeSymbol("*SBHL-APPLY-MARKING-SPACE*");
        $list88 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genlPreds")));
        $list89 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genlInverse")));
        $list90 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genlPreds")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genlInverse")));
        $list91 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genlInverse")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genlPreds")));
        $list92 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*SBHL-MARKING-GENERATION*"), (SubLObject)sbhl_marking_vars.ZERO_INTEGER));
        $sym93$_SBHL_MAPPING_MARKING_SPACE_ = SubLObjectFactory.makeSymbol("*SBHL-MAPPING-MARKING-SPACE*");
        $sym94$_SBHL_MAPPING_GATHER_MARKING_SPACE_ = SubLObjectFactory.makeSymbol("*SBHL-MAPPING-GATHER-MARKING-SPACE*");
        $list95 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*SBHL-SPACE*"), (SubLObject)SubLObjectFactory.makeSymbol("*SBHL-MAPPING-MARKING-SPACE*")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*SBHL-GATHER-SPACE*"), (SubLObject)SubLObjectFactory.makeSymbol("*SBHL-MAPPING-GATHER-MARKING-SPACE*")));
        $list96 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*SBHL-MAPPING-MARKING-SPACE*"), (SubLObject)SubLObjectFactory.makeSymbol("*SBHL-TARGET-SPACE*")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*SBHL-MAPPING-GATHER-MARKING-SPACE*"), (SubLObject)SubLObjectFactory.makeSymbol("*SBHL-TARGET-GATHER-SPACE*")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*SBHL-SUSPEND-NEW-SPACES-DURING-MAPPING?*"), (SubLObject)sbhl_marking_vars.T));
        $list97 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*SBHL-SUSPEND-NEW-SPACES-DURING-MAPPING?*"), (SubLObject)sbhl_marking_vars.T));
        $list98 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*SBHL-TEMPORALITY-SEARCH-CHECKS-NODES-IN-TARGET-SPACE-P*"), (SubLObject)sbhl_marking_vars.T));
        $str99$Table_used_for_public_marking_int = SubLObjectFactory.makeString("Table used for public marking interface");
        $sym100$_SBHL_TABLE_ = SubLObjectFactory.makeSymbol("*SBHL-TABLE*");
        $list101 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*SBHL-TABLE*"));
        $sym102$RESOURCING_P = SubLObjectFactory.makeUninternedSymbol("RESOURCING-P");
        $list103 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RESOURCING-SBHL-MARKING-SPACES-P")));
        $sym104$WITHOUT_SBHL_RESOURCED_MARKING_SPACES = SubLObjectFactory.makeSymbol("WITHOUT-SBHL-RESOURCED-MARKING-SPACES");
        $sym105$WITH_NEW_SBHL_TABLE = SubLObjectFactory.makeSymbol("WITH-NEW-SBHL-TABLE");
        $sym106$WITH_SBHL_TABLE_VAR = SubLObjectFactory.makeSymbol("WITH-SBHL-TABLE-VAR");
        $sym107$TOGGLE_SBHL_RESOURCED_MARKING_SPACES = SubLObjectFactory.makeSymbol("TOGGLE-SBHL-RESOURCED-MARKING-SPACES");
        $list108 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NODE-VAR"), (SubLObject)SubLObjectFactory.makeSymbol("MARKING-VAR"), (SubLObject)SubLObjectFactory.makeSymbol("SBHL-TABLE"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("DONE-VAR")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $list109 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCTION"), (SubLObject)SubLObjectFactory.makeSymbol("SBHL-TABLE"));
        $sym110$NODE = SubLObjectFactory.makeUninternedSymbol("NODE");
        $sym111$TAG = SubLObjectFactory.makeUninternedSymbol("TAG");
        $str112$no_mapping_method_defiend_for_sbh = SubLObjectFactory.makeString("no mapping method defiend for sbhl-table ~s");
        $sym113$WITHIN_SBHL_SPACE = SubLObjectFactory.makeSymbol("WITHIN-SBHL-SPACE");
        $list114 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TABLE"), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym115$_SBHL_GOAL_TABLE_ = SubLObjectFactory.makeSymbol("*SBHL-GOAL-TABLE*");
    }
}

/*

	Total time: 253 ms
	
*/