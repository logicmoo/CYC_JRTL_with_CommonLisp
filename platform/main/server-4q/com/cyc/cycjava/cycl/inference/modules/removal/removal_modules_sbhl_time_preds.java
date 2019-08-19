package com.cyc.cycjava.cycl.inference.modules.removal;

import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import com.cyc.cycjava.cycl.arguments;
import com.cyc.cycjava.cycl.backward;
import com.cyc.cycjava.cycl.backward_utilities;
import com.cyc.cycjava.cycl.control_vars;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.cycjava.cycl.iteration;
import com.cyc.cycjava.cycl.utilities_macros;
import com.cyc.cycjava.cycl.inference.harness.inference_modules;
import com.cyc.cycjava.cycl.inference.modules.preference_modules;
import com.cyc.cycjava.cycl.sbhl.sbhl_time_modules;
import com.cyc.cycjava.cycl.sbhl.sbhl_time_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public class removal_modules_sbhl_time_preds extends SubLTranslatedFile {
    public static SubLFile me;
    public static String myName = "com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_sbhl_time_preds";
    public static String myFingerPrint = "aa6643f08706fb8a53cc36e2e015181027d5ec0821c86a902a110d83ab1bb7df";
    @SubL(source = "cycl/inference/modules/removal/removal-modules-sbhl-time-preds.lisp", position = 1200L)
    private static SubLSymbol $sbhl_time_generic_modules$;
    @SubL(source = "cycl/inference/modules/removal/removal-modules-sbhl-time-preds.lisp", position = 4500L)
    private static SubLSymbol $default_temporal_relation_check_cost$;
    @SubL(source = "cycl/inference/modules/removal/removal-modules-sbhl-time-preds.lisp", position = 4700L)
    private static SubLSymbol $default_all_temporal_relation_cost$;
    @SubL(source = "cycl/inference/modules/removal/removal-modules-sbhl-time-preds.lisp", position = 4800L)
    private static SubLSymbol $default_all_temporal_relation_inverse_cost$;
    @SubL(source = "cycl/inference/modules/removal/removal-modules-sbhl-time-preds.lisp", position = 4800L)
    private static SubLSymbol $default_not_temporal_relation_check_cost$;
    private static SubLList $list0;
    private static SubLSymbol $SBHL_TIME_TOTAL_EXCLUSIVITY_POS;
    private static SubLSymbol $SENSE;
    private static SubLSymbol $POS;
    private static SubLSymbol $ARITY;
    private static SubLSymbol $REQUIRED_PATTERN;
    private static SubLList $list6;
    private static SubLSymbol $EXCLUSIVE;
    private static SubLSymbol $sym8$TRUE;
    private static SubLSymbol $SUPPLANTS;
    private static SubLList $list10;
    private static SubLList $list11;
    private static SubLInteger $int$200;
    private static SubLObject $$startsAfterStartingOf;
    private static SubLSymbol $REMOVAL_STARTS_AFTER_STARTING_OF;
    private static SubLList $list15;
    private static SubLSymbol $sym16$REMOVAL_ALL_STARTS_AFTER_STARTING_OF_OUTPUT_GENERATE;
    private static SubLSymbol $REMOVAL_ALL_STARTS_AFTER_STARTING_OF;
    private static SubLList $list18;
    private static SubLSymbol $ALL_STARTS_AFTER_STARTING_OF_POS;
    private static SubLList $list20;
    private static SubLSymbol $sym21$REMOVAL_ALL_STARTS_AFTER_STARTING_OF_INVERSE_OUTPUT_GENERATE;
    private static SubLSymbol $REMOVAL_ALL_STARTS_AFTER_STARTING_OF_INVERSE;
    private static SubLList $list23;
    private static SubLSymbol $ALL_STARTS_AFTER_STARTING_OF_INVERSE_POS;
    private static SubLList $list25;
    private static SubLSymbol $MINIMIZE;
    private static SubLSymbol $TIME;
    private static SubLSymbol $REMOVAL_NOT_STARTS_AFTER_STARTING_OF;
    private static SubLList $list29;
    private static SubLObject $$startsAfterEndingOf;
    private static SubLSymbol $REMOVAL_STARTS_AFTER_ENDING_OF;
    private static SubLList $list32;
    private static SubLSymbol $sym33$REMOVAL_ALL_STARTS_AFTER_ENDING_OF_OUTPUT_GENERATE;
    private static SubLSymbol $REMOVAL_ALL_STARTS_AFTER_ENDING_OF;
    private static SubLList $list35;
    private static SubLSymbol $ALL_STARTS_AFTER_ENDING_OF_POS;
    private static SubLList $list37;
    private static SubLSymbol $sym38$REMOVAL_ALL_STARTS_AFTER_ENDING_OF_INVERSE_OUTPUT_GENERATE;
    private static SubLSymbol $REMOVAL_ALL_STARTS_AFTER_ENDING_OF_INVERSE;
    private static SubLList $list40;
    private static SubLSymbol $ALL_STARTS_AFTER_ENDING_OF_INVERSE_POS;
    private static SubLList $list42;
    private static SubLSymbol $REMOVAL_NOT_STARTS_AFTER_ENDING_OF;
    private static SubLList $list44;
    private static SubLObject $$endsAfterStartingOf;
    private static SubLSymbol $REMOVAL_ENDS_AFTER_STARTING_OF;
    private static SubLList $list47;
    private static SubLSymbol $sym48$REMOVAL_ALL_ENDS_AFTER_STARTING_OF_OUTPUT_GENERATE;
    private static SubLSymbol $REMOVAL_ALL_ENDS_AFTER_STARTING_OF;
    private static SubLList $list50;
    private static SubLSymbol $ALL_ENDS_AFTER_STARTING_OF_POS;
    private static SubLList $list52;
    private static SubLSymbol $sym53$REMOVAL_ALL_ENDS_AFTER_STARTING_OF_INVERSE_OUTPUT_GENERATE;
    private static SubLSymbol $REMOVAL_ALL_ENDS_AFTER_STARTING_OF_INVERSE;
    private static SubLList $list55;
    private static SubLSymbol $ALL_ENDS_AFTER_STARTING_OF_INVERSE_POS;
    private static SubLList $list57;
    private static SubLSymbol $REMOVAL_NOT_ENDS_AFTER_STARTING_OF;
    private static SubLList $list59;
    private static SubLObject $$endsAfterEndingOf;
    private static SubLSymbol $REMOVAL_ENDS_AFTER_ENDING_OF;
    private static SubLList $list62;
    private static SubLSymbol $sym63$REMOVAL_ALL_ENDS_AFTER_ENDING_OF_OUTPUT_GENERATE;
    private static SubLSymbol $REMOVAL_ALL_ENDS_AFTER_ENDING_OF;
    private static SubLList $list65;
    private static SubLSymbol $ALL_ENDS_AFTER_ENDING_OF_POS;
    private static SubLList $list67;
    private static SubLSymbol $sym68$REMOVAL_ALL_ENDS_AFTER_ENDING_OF_INVERSE_OUTPUT_GENERATE;
    private static SubLSymbol $REMOVAL_ALL_ENDS_AFTER_ENDING_OF_INVERSE;
    private static SubLList $list70;
    private static SubLSymbol $ALL_ENDS_AFTER_ENDING_OF_INVERSE_POS;
    private static SubLList $list72;
    private static SubLSymbol $REMOVAL_NOT_ENDS_AFTER_ENDING_OF;
    private static SubLList $list74;
    private static SubLObject $$temporallySubsumes;
    private static SubLSymbol $REMOVAL_TEMPORALLY_SUBSUMES;
    private static SubLList $list77;
    private static SubLSymbol $sym78$REMOVAL_ALL_TEMPORALLY_SUBSUMES_OUTPUT_GENERATE;
    private static SubLSymbol $REMOVAL_ALL_TEMPORALLY_SUBSUMES;
    private static SubLList $list80;
    private static SubLSymbol $ALL_TEMPORALLY_SUBSUMES_POS;
    private static SubLList $list82;
    private static SubLSymbol $sym83$REMOVAL_ALL_TEMPORALLY_SUBSUMES_INVERSE_OUTPUT_GENERATE;
    private static SubLSymbol $REMOVAL_ALL_TEMPORALLY_SUBSUMES_INVERSE;
    private static SubLList $list85;
    private static SubLSymbol $ALL_TEMPORALLY_SUBSUMES_INVERSE_POS;
    private static SubLList $list87;
    private static SubLSymbol $REMOVAL_NOT_TEMPORALLY_SUBSUMES;
    private static SubLList $list89;
    private static SubLObject $$dateOfEvent;
    private static SubLSymbol $REMOVAL_DATE_OF_EVENT;
    private static SubLList $list92;
    private static SubLSymbol $sym93$REMOVAL_ALL_DATE_OF_EVENT_INVERSE_OUTPUT_GENERATE;
    private static SubLSymbol $REMOVAL_ALL_DATE_OF_EVENT_INVERSE;
    private static SubLList $list95;
    private static SubLSymbol $ALL_DATE_OF_EVENT_INVERSE_POS;
    private static SubLList $list97;
    private static SubLSymbol $REMOVAL_NOT_DATE_OF_EVENT;
    private static SubLList $list99;
    private static SubLSymbol $REMOVAL_DATE_OF_EVENT_DELAY;
    private static SubLList $list101;
    private static SubLObject $$cotemporal;
    private static SubLSymbol $REMOVAL_COTEMPORAL;
    private static SubLList $list104;
    private static SubLSymbol $sym105$REMOVAL_ALL_COTEMPORAL_OUTPUT_GENERATE;
    private static SubLSymbol $REMOVAL_ALL_COTEMPORAL;
    private static SubLList $list107;
    private static SubLSymbol $ALL_COTEMPORAL_POS;
    private static SubLList $list109;
    private static SubLSymbol $REMOVAL_ALL_COTEMPORAL_INVERSE;
    private static SubLList $list111;
    private static SubLSymbol $ALL_COTEMPORAL_INVERSE_POS;
    private static SubLList $list113;
    private static SubLSymbol $REMOVAL_NOT_COTEMPORAL;
    private static SubLList $list115;
    private static SubLObject $$temporallyIntersects;
    private static SubLSymbol $REMOVAL_TEMPORALLY_INTERSECTS;
    private static SubLList $list118;
    private static SubLSymbol $sym119$REMOVAL_ALL_TEMPORALLY_INTERSECTS_OUTPUT_GENERATE;
    private static SubLSymbol $REMOVAL_ALL_TEMPORALLY_INTERSECTS;
    private static SubLList $list121;
    private static SubLSymbol $ALL_TEMPORALLY_INTERSECTS_POS;
    private static SubLList $list123;
    private static SubLSymbol $REMOVAL_ALL_TEMPORALLY_INTERSECTS_INVERSE;
    private static SubLList $list125;
    private static SubLSymbol $ALL_TEMPORALLY_INTERSECTS_INVERSE_POS;
    private static SubLList $list127;
    private static SubLSymbol $REMOVAL_NOT_TEMPORALLY_INTERSECTS;
    private static SubLList $list129;
    private static SubLObject $$temporallyDisjoint;
    private static SubLSymbol $REMOVAL_TEMPORALLY_DISJOINT;
    private static SubLList $list132;
    private static SubLSymbol $sym133$REMOVAL_ALL_TEMPORALLY_DISJOINT_OUTPUT_GENERATE;
    private static SubLSymbol $REMOVAL_ALL_TEMPORALLY_DISJOINT;
    private static SubLList $list135;
    private static SubLSymbol $ALL_TEMPORALLY_DISJOINT_POS;
    private static SubLList $list137;
    private static SubLSymbol $REMOVAL_ALL_TEMPORALLY_DISJOINT_INVERSE;
    private static SubLList $list139;
    private static SubLSymbol $ALL_TEMPORALLY_DISJOINT_INVERSE_POS;
    private static SubLList $list141;
    private static SubLSymbol $REMOVAL_NOT_TEMPORALLY_DISJOINT;
    private static SubLList $list143;
    private static SubLObject $$temporalBoundsContain;
    private static SubLSymbol $REMOVAL_TEMPORAL_BOUNDS_CONTAIN;
    private static SubLList $list146;
    private static SubLSymbol $sym147$REMOVAL_ALL_TEMPORAL_BOUNDS_CONTAIN_OUTPUT_GENERATE;
    private static SubLSymbol $REMOVAL_ALL_TEMPORAL_BOUNDS_CONTAIN;
    private static SubLList $list149;
    private static SubLSymbol $ALL_TEMPORAL_BOUNDS_CONTAIN_POS;
    private static SubLList $list151;
    private static SubLSymbol $sym152$REMOVAL_ALL_TEMPORAL_BOUNDS_CONTAIN_INVERSE_OUTPUT_GENERATE;
    private static SubLSymbol $REMOVAL_ALL_TEMPORAL_BOUNDS_CONTAIN_INVERSE;
    private static SubLList $list154;
    private static SubLSymbol $ALL_TEMPORAL_BOUNDS_CONTAIN_INVERSE_POS;
    private static SubLList $list156;
    private static SubLSymbol $REMOVAL_NOT_TEMPORAL_BOUNDS_CONTAIN;
    private static SubLList $list158;
    private static SubLObject $$temporalBoundsSubsume;
    private static SubLSymbol $REMOVAL_TEMPORAL_BOUNDS_SUBSUME;
    private static SubLList $list161;
    private static SubLSymbol $sym162$REMOVAL_ALL_TEMPORAL_BOUNDS_SUBSUME_OUTPUT_GENERATE;
    private static SubLSymbol $REMOVAL_ALL_TEMPORAL_BOUNDS_SUBSUME;
    private static SubLList $list164;
    private static SubLSymbol $ALL_TEMPORAL_BOUNDS_SUBSUME_POS;
    private static SubLList $list166;
    private static SubLSymbol $sym167$REMOVAL_ALL_TEMPORAL_BOUNDS_SUBSUME_INVERSE_OUTPUT_GENERATE;
    private static SubLSymbol $REMOVAL_ALL_TEMPORAL_BOUNDS_SUBSUME_INVERSE;
    private static SubLList $list169;
    private static SubLSymbol $ALL_TEMPORAL_BOUNDS_SUBSUME_INVERSE_POS;
    private static SubLList $list171;
    private static SubLSymbol $REMOVAL_NOT_TEMPORAL_BOUNDS_SUBSUME;
    private static SubLList $list173;
    private static SubLObject $$temporalBoundsIdentical;
    private static SubLSymbol $REMOVAL_TEMPORAL_BOUNDS_IDENTICAL;
    private static SubLList $list176;
    private static SubLSymbol $sym177$REMOVAL_ALL_TEMPORAL_BOUNDS_IDENTICAL_OUTPUT_GENERATE;
    private static SubLSymbol $REMOVAL_ALL_TEMPORAL_BOUNDS_IDENTICAL;
    private static SubLList $list179;
    private static SubLSymbol $ALL_TEMPORAL_BOUNDS_IDENTICAL_POS;
    private static SubLList $list181;
    private static SubLSymbol $REMOVAL_ALL_TEMPORAL_BOUNDS_IDENTICAL_INVERSE;
    private static SubLList $list183;
    private static SubLSymbol $ALL_TEMPORAL_BOUNDS_IDENTICAL_INVERSE_POS;
    private static SubLList $list185;
    private static SubLSymbol $REMOVAL_NOT_TEMPORAL_BOUNDS_IDENTICAL;
    private static SubLList $list187;
    private static SubLObject $$temporalBoundsIntersect;
    private static SubLSymbol $REMOVAL_TEMPORAL_BOUNDS_INTERSECT;
    private static SubLList $list190;
    private static SubLSymbol $sym191$REMOVAL_ALL_TEMPORAL_BOUNDS_INTERSECT_OUTPUT_GENERATE;
    private static SubLSymbol $REMOVAL_ALL_TEMPORAL_BOUNDS_INTERSECT;
    private static SubLList $list193;
    private static SubLSymbol $ALL_TEMPORAL_BOUNDS_INTERSECT_POS;
    private static SubLList $list195;
    private static SubLSymbol $REMOVAL_ALL_TEMPORAL_BOUNDS_INTERSECT_INVERSE;
    private static SubLList $list197;
    private static SubLSymbol $ALL_TEMPORAL_BOUNDS_INTERSECT_INVERSE_POS;
    private static SubLList $list199;
    private static SubLSymbol $REMOVAL_NOT_TEMPORAL_BOUNDS_INTERSECT;
    private static SubLList $list201;
    private static SubLObject $$temporallyCooriginating;
    private static SubLSymbol $REMOVAL_TEMPORALLY_COORIGINATING;
    private static SubLList $list204;
    private static SubLSymbol $sym205$REMOVAL_ALL_TEMPORALLY_COORIGINATING_OUTPUT_GENERATE;
    private static SubLSymbol $REMOVAL_ALL_TEMPORALLY_COORIGINATING;
    private static SubLList $list207;
    private static SubLSymbol $ALL_TEMPORALLY_COORIGINATING_POS;
    private static SubLList $list209;
    private static SubLSymbol $REMOVAL_ALL_TEMPORALLY_COORIGINATING_INVERSE;
    private static SubLList $list211;
    private static SubLSymbol $ALL_TEMPORALLY_COORIGINATING_INVERSE_POS;
    private static SubLList $list213;
    private static SubLSymbol $REMOVAL_NOT_TEMPORALLY_COORIGINATING;
    private static SubLList $list215;
    private static SubLObject $$temporallyCoterminal;
    private static SubLSymbol $REMOVAL_TEMPORALLY_COTERMINAL;
    private static SubLList $list218;
    private static SubLSymbol $sym219$REMOVAL_ALL_TEMPORALLY_COTERMINAL_OUTPUT_GENERATE;
    private static SubLSymbol $REMOVAL_ALL_TEMPORALLY_COTERMINAL;
    private static SubLList $list221;
    private static SubLSymbol $ALL_TEMPORALLY_COTERMINAL_POS;
    private static SubLList $list223;
    private static SubLSymbol $REMOVAL_ALL_TEMPORALLY_COTERMINAL_INVERSE;
    private static SubLList $list225;
    private static SubLSymbol $ALL_TEMPORALLY_COTERMINAL_INVERSE_POS;
    private static SubLList $list227;
    private static SubLSymbol $REMOVAL_NOT_TEMPORALLY_COTERMINAL;
    private static SubLList $list229;
    private static SubLObject $$contiguousAfter;
    private static SubLSymbol $REMOVAL_CONTIGUOUS_AFTER;
    private static SubLList $list232;
    private static SubLSymbol $sym233$REMOVAL_ALL_CONTIGUOUS_AFTER_OUTPUT_GENERATE;
    private static SubLSymbol $REMOVAL_ALL_CONTIGUOUS_AFTER;
    private static SubLList $list235;
    private static SubLSymbol $ALL_CONTIGUOUS_AFTER_POS;
    private static SubLList $list237;
    private static SubLSymbol $sym238$REMOVAL_ALL_CONTIGUOUS_AFTER_INVERSE_OUTPUT_GENERATE;
    private static SubLSymbol $REMOVAL_ALL_CONTIGUOUS_AFTER_INVERSE;
    private static SubLList $list240;
    private static SubLSymbol $ALL_CONTIGUOUS_AFTER_INVERSE_POS;
    private static SubLList $list242;
    private static SubLSymbol $REMOVAL_NOT_CONTIGUOUS_AFTER;
    private static SubLList $list244;
    private static SubLObject $$startsDuring;
    private static SubLSymbol $REMOVAL_STARTS_DURING;
    private static SubLList $list247;
    private static SubLSymbol $sym248$REMOVAL_ALL_STARTS_DURING_OUTPUT_GENERATE;
    private static SubLSymbol $REMOVAL_ALL_STARTS_DURING;
    private static SubLList $list250;
    private static SubLSymbol $ALL_STARTS_DURING_POS;
    private static SubLList $list252;
    private static SubLSymbol $sym253$REMOVAL_ALL_STARTS_DURING_INVERSE_OUTPUT_GENERATE;
    private static SubLSymbol $REMOVAL_ALL_STARTS_DURING_INVERSE;
    private static SubLList $list255;
    private static SubLSymbol $ALL_STARTS_DURING_INVERSE_POS;
    private static SubLList $list257;
    private static SubLSymbol $REMOVAL_NOT_STARTS_DURING;
    private static SubLList $list259;
    private static SubLObject $$endsDuring;
    private static SubLSymbol $REMOVAL_ENDS_DURING;
    private static SubLList $list262;
    private static SubLSymbol $sym263$REMOVAL_ALL_ENDS_DURING_OUTPUT_GENERATE;
    private static SubLSymbol $REMOVAL_ALL_ENDS_DURING;
    private static SubLList $list265;
    private static SubLSymbol $ALL_ENDS_DURING_POS;
    private static SubLList $list267;
    private static SubLSymbol $sym268$REMOVAL_ALL_ENDS_DURING_INVERSE_OUTPUT_GENERATE;
    private static SubLSymbol $REMOVAL_ALL_ENDS_DURING_INVERSE;
    private static SubLList $list270;
    private static SubLSymbol $ALL_ENDS_DURING_INVERSE_POS;
    private static SubLList $list272;
    private static SubLSymbol $REMOVAL_NOT_ENDS_DURING;
    private static SubLList $list274;
    private static SubLObject $$startingDate;
    private static SubLSymbol $REMOVAL_STARTING_DATE;
    private static SubLList $list277;
    private static SubLSymbol $sym278$REMOVAL_ALL_STARTING_DATE_INVERSE_OUTPUT_GENERATE;
    private static SubLSymbol $REMOVAL_ALL_STARTING_DATE_INVERSE;
    private static SubLList $list280;
    private static SubLSymbol $ALL_STARTING_DATE_INVERSE_POS;
    private static SubLList $list282;
    private static SubLSymbol $REMOVAL_NOT_STARTING_DATE;
    private static SubLList $list284;
    private static SubLObject $$endingDate;
    private static SubLSymbol $REMOVAL_ENDING_DATE;
    private static SubLList $list287;
    private static SubLSymbol $sym288$REMOVAL_ALL_ENDING_DATE_INVERSE_OUTPUT_GENERATE;
    private static SubLSymbol $REMOVAL_ALL_ENDING_DATE_INVERSE;
    private static SubLList $list290;
    private static SubLSymbol $ALL_ENDING_DATE_INVERSE_POS;
    private static SubLList $list292;
    private static SubLSymbol $REMOVAL_NOT_ENDING_DATE;
    private static SubLList $list294;
    private static SubLObject $$birthDate;
    private static SubLSymbol $REMOVAL_BIRTH_DATE;
    private static SubLList $list297;
    private static SubLSymbol $sym298$REMOVAL_ALL_BIRTH_DATE_INVERSE_OUTPUT_GENERATE;
    private static SubLSymbol $REMOVAL_ALL_BIRTH_DATE_INVERSE;
    private static SubLList $list300;
    private static SubLSymbol $ALL_BIRTH_DATE_INVERSE_POS;
    private static SubLList $list302;
    private static SubLSymbol $REMOVAL_NOT_BIRTH_DATE;
    private static SubLList $list304;
    private static SubLObject $$dateOfDeath;
    private static SubLSymbol $REMOVAL_DATE_OF_DEATH;
    private static SubLList $list307;
    private static SubLSymbol $sym308$REMOVAL_ALL_DATE_OF_DEATH_INVERSE_OUTPUT_GENERATE;
    private static SubLSymbol $REMOVAL_ALL_DATE_OF_DEATH_INVERSE;
    private static SubLList $list310;
    private static SubLSymbol $ALL_DATE_OF_DEATH_INVERSE_POS;
    private static SubLList $list312;
    private static SubLSymbol $REMOVAL_NOT_DATE_OF_DEATH;
    private static SubLList $list314;
    private static SubLObject $$temporallyStartedBy;
    private static SubLSymbol $REMOVAL_TEMPORALLY_STARTED_BY;
    private static SubLList $list317;
    private static SubLSymbol $sym318$REMOVAL_ALL_TEMPORALLY_STARTED_BY_OUTPUT_GENERATE;
    private static SubLSymbol $REMOVAL_ALL_TEMPORALLY_STARTED_BY;
    private static SubLList $list320;
    private static SubLSymbol $ALL_TEMPORALLY_STARTED_BY_POS;
    private static SubLList $list322;
    private static SubLSymbol $sym323$REMOVAL_ALL_TEMPORALLY_STARTED_BY_INVERSE_OUTPUT_GENERATE;
    private static SubLSymbol $REMOVAL_ALL_TEMPORALLY_STARTED_BY_INVERSE;
    private static SubLList $list325;
    private static SubLSymbol $ALL_TEMPORALLY_STARTED_BY_INVERSE_POS;
    private static SubLList $list327;
    private static SubLSymbol $REMOVAL_NOT_TEMPORALLY_STARTED_BY;
    private static SubLList $list329;
    private static SubLObject $$temporallyFinishedBy;
    private static SubLSymbol $REMOVAL_TEMPORALLY_FINISHED_BY;
    private static SubLList $list332;
    private static SubLSymbol $sym333$REMOVAL_ALL_TEMPORALLY_FINISHED_BY_OUTPUT_GENERATE;
    private static SubLSymbol $REMOVAL_ALL_TEMPORALLY_FINISHED_BY;
    private static SubLList $list335;
    private static SubLSymbol $ALL_TEMPORALLY_FINISHED_BY_POS;
    private static SubLList $list337;
    private static SubLSymbol $sym338$REMOVAL_ALL_TEMPORALLY_FINISHED_BY_INVERSE_OUTPUT_GENERATE;
    private static SubLSymbol $REMOVAL_ALL_TEMPORALLY_FINISHED_BY_INVERSE;
    private static SubLList $list340;
    private static SubLSymbol $ALL_TEMPORALLY_FINISHED_BY_INVERSE_POS;
    private static SubLList $list342;
    private static SubLSymbol $REMOVAL_NOT_TEMPORALLY_FINISHED_BY;
    private static SubLList $list344;
    private static SubLObject $$overlapsStart;
    private static SubLSymbol $REMOVAL_OVERLAPS_START;
    private static SubLList $list347;
    private static SubLSymbol $sym348$REMOVAL_ALL_OVERLAPS_START_OUTPUT_GENERATE;
    private static SubLSymbol $REMOVAL_ALL_OVERLAPS_START;
    private static SubLList $list350;
    private static SubLSymbol $ALL_OVERLAPS_START_POS;
    private static SubLList $list352;
    private static SubLSymbol $sym353$REMOVAL_ALL_OVERLAPS_START_INVERSE_OUTPUT_GENERATE;
    private static SubLSymbol $REMOVAL_ALL_OVERLAPS_START_INVERSE;
    private static SubLList $list355;
    private static SubLSymbol $ALL_OVERLAPS_START_INVERSE_POS;
    private static SubLList $list357;
    private static SubLSymbol $REMOVAL_NOT_OVERLAPS_START;
    private static SubLList $list359;

    @SubL(source = "cycl/inference/modules/removal/removal-modules-sbhl-time-preds.lisp", position = 6100L)
    public static SubLObject removal_all_starts_after_starting_of_output_generate(SubLObject temporal_thing) {
        return iteration.new_list_iterator(sbhl_time_modules.all_starts_after_starting_of(temporal_thing, UNPROVIDED));
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-sbhl-time-preds.lisp", position = 7500L)
    public static SubLObject removal_all_starts_after_starting_of_inverse_output_generate(SubLObject temporal_thing) {
        return iteration.new_list_iterator(sbhl_time_modules.all_starts_after_starting_of_inverse(temporal_thing, UNPROVIDED));
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-sbhl-time-preds.lisp", position = 8800L)
    public static SubLObject removal_not_starts_after_starting_of_expand(SubLObject literal, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        SubLObject arg1 = sbhl_time_utilities.sbhl_time_inference_args(literal);
        SubLObject arg2 = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (NIL != control_vars.$negation_by_failure$.getDynamicValue(thread) && NIL == sbhl_time_modules.starts_after_starting_ofP(arg1, arg2, UNPROVIDED)) {
            backward.removal_add_node(arguments.make_hl_support($MINIMIZE, cycl_utilities.negate(literal), UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED);
        } else if (NIL != sbhl_time_modules.not_starts_after_starting_ofP(arg1, arg2, UNPROVIDED)) {
            backward.removal_add_node(arguments.make_hl_support($TIME, cycl_utilities.negate(literal), UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED);
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-sbhl-time-preds.lisp", position = 11100L)
    public static SubLObject removal_all_starts_after_ending_of_output_generate(SubLObject temporal_thing) {
        return iteration.new_list_iterator(sbhl_time_modules.all_starts_after_ending_of(temporal_thing, UNPROVIDED));
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-sbhl-time-preds.lisp", position = 12400L)
    public static SubLObject removal_all_starts_after_ending_of_inverse_output_generate(SubLObject temporal_thing) {
        return iteration.new_list_iterator(sbhl_time_modules.all_starts_after_ending_of_inverse(temporal_thing, UNPROVIDED));
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-sbhl-time-preds.lisp", position = 13700L)
    public static SubLObject removal_not_starts_after_ending_of_expand(SubLObject literal, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        SubLObject arg1 = sbhl_time_utilities.sbhl_time_inference_args(literal);
        SubLObject arg2 = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (NIL != control_vars.$negation_by_failure$.getDynamicValue(thread) && NIL == sbhl_time_modules.starts_after_ending_ofP(arg1, arg2, UNPROVIDED)) {
            backward.removal_add_node(arguments.make_hl_support($MINIMIZE, cycl_utilities.negate(literal), UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED);
        } else if (NIL != sbhl_time_modules.not_starts_after_ending_ofP(arg1, arg2, UNPROVIDED)) {
            backward.removal_add_node(arguments.make_hl_support($TIME, cycl_utilities.negate(literal), UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED);
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-sbhl-time-preds.lisp", position = 16000L)
    public static SubLObject removal_all_ends_after_starting_of_output_generate(SubLObject temporal_thing) {
        return iteration.new_list_iterator(sbhl_time_modules.all_ends_after_starting_of(temporal_thing, UNPROVIDED));
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-sbhl-time-preds.lisp", position = 17300L)
    public static SubLObject removal_all_ends_after_starting_of_inverse_output_generate(SubLObject temporal_thing) {
        return iteration.new_list_iterator(sbhl_time_modules.all_ends_after_starting_of_inverse(temporal_thing, UNPROVIDED));
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-sbhl-time-preds.lisp", position = 18600L)
    public static SubLObject removal_not_ends_after_starting_of_expand(SubLObject literal, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        SubLObject arg1 = sbhl_time_utilities.sbhl_time_inference_args(literal);
        SubLObject arg2 = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (NIL != control_vars.$negation_by_failure$.getDynamicValue(thread) && NIL == sbhl_time_modules.ends_after_starting_ofP(arg1, arg2, UNPROVIDED)) {
            backward.removal_add_node(arguments.make_hl_support($MINIMIZE, cycl_utilities.negate(literal), UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED);
        } else if (NIL != sbhl_time_modules.not_ends_after_starting_ofP(arg1, arg2, UNPROVIDED)) {
            backward.removal_add_node(arguments.make_hl_support($TIME, cycl_utilities.negate(literal), UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED);
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-sbhl-time-preds.lisp", position = 20900L)
    public static SubLObject removal_all_ends_after_ending_of_output_generate(SubLObject temporal_thing) {
        return iteration.new_list_iterator(sbhl_time_modules.all_ends_after_ending_of(temporal_thing, UNPROVIDED));
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-sbhl-time-preds.lisp", position = 22100L)
    public static SubLObject removal_all_ends_after_ending_of_inverse_output_generate(SubLObject temporal_thing) {
        return iteration.new_list_iterator(sbhl_time_modules.all_ends_after_ending_of_inverse(temporal_thing, UNPROVIDED));
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-sbhl-time-preds.lisp", position = 23500L)
    public static SubLObject removal_not_ends_after_ending_of_expand(SubLObject literal, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        SubLObject arg1 = sbhl_time_utilities.sbhl_time_inference_args(literal);
        SubLObject arg2 = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (NIL != control_vars.$negation_by_failure$.getDynamicValue(thread) && NIL == sbhl_time_modules.ends_after_ending_ofP(arg1, arg2, UNPROVIDED)) {
            backward.removal_add_node(arguments.make_hl_support($MINIMIZE, cycl_utilities.negate(literal), UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED);
        } else if (NIL != sbhl_time_modules.not_ends_after_ending_ofP(arg1, arg2, UNPROVIDED)) {
            backward.removal_add_node(arguments.make_hl_support($TIME, cycl_utilities.negate(literal), UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED);
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-sbhl-time-preds.lisp", position = 25700L)
    public static SubLObject removal_all_temporally_subsumes_output_generate(SubLObject temporal_thing) {
        return iteration.new_list_iterator(sbhl_time_modules.all_temporally_subsumes(temporal_thing, UNPROVIDED));
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-sbhl-time-preds.lisp", position = 27000L)
    public static SubLObject removal_all_temporally_subsumes_inverse_output_generate(SubLObject temporal_thing) {
        return iteration.new_list_iterator(sbhl_time_modules.all_temporally_subsumes_inverse(temporal_thing, UNPROVIDED));
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-sbhl-time-preds.lisp", position = 28300L)
    public static SubLObject removal_not_temporally_subsumes_expand(SubLObject literal, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        SubLObject arg1 = sbhl_time_utilities.sbhl_time_inference_args(literal);
        SubLObject arg2 = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (NIL != control_vars.$negation_by_failure$.getDynamicValue(thread) && NIL == sbhl_time_modules.temporally_subsumesP(arg1, arg2, UNPROVIDED)) {
            backward.removal_add_node(arguments.make_hl_support($MINIMIZE, cycl_utilities.negate(literal), UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED);
        } else if (NIL != sbhl_time_modules.not_temporally_subsumesP(arg1, arg2, UNPROVIDED)) {
            backward.removal_add_node(arguments.make_hl_support($TIME, cycl_utilities.negate(literal), UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED);
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-sbhl-time-preds.lisp", position = 30300L)
    public static SubLObject removal_all_date_of_event_inverse_output_generate(SubLObject temporal_thing) {
        return iteration.new_list_iterator(sbhl_time_modules.all_date_of_event_inverse(temporal_thing, UNPROVIDED));
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-sbhl-time-preds.lisp", position = 31500L)
    public static SubLObject removal_not_date_of_event_expand(SubLObject literal, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        SubLObject arg1 = sbhl_time_utilities.sbhl_time_inference_args(literal);
        SubLObject arg2 = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (NIL != control_vars.$negation_by_failure$.getDynamicValue(thread) && NIL == sbhl_time_modules.date_of_eventP(arg1, arg2, UNPROVIDED)) {
            backward.removal_add_node(arguments.make_hl_support($MINIMIZE, cycl_utilities.negate(literal), UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED);
        } else if (NIL != sbhl_time_modules.not_date_of_eventP(arg1, arg2, UNPROVIDED)) {
            backward.removal_add_node(arguments.make_hl_support($TIME, cycl_utilities.negate(literal), UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED);
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-sbhl-time-preds.lisp", position = 33900L)
    public static SubLObject removal_all_cotemporal_output_generate(SubLObject temporal_thing) {
        return iteration.new_list_iterator(sbhl_time_modules.all_cotemporal(temporal_thing, UNPROVIDED));
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-sbhl-time-preds.lisp", position = 36200L)
    public static SubLObject removal_not_cotemporal_expand(SubLObject literal, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        SubLObject arg1 = sbhl_time_utilities.sbhl_time_inference_args(literal);
        SubLObject arg2 = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (NIL != control_vars.$negation_by_failure$.getDynamicValue(thread) && NIL == sbhl_time_modules.cotemporalP(arg1, arg2, UNPROVIDED)) {
            SubLObject formula = cycl_utilities.negate(backward_utilities.inference_make_commutative_literal($$cotemporal, list(arg1, arg2)));
            backward.removal_add_node(arguments.make_hl_support($MINIMIZE, formula, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED);
        } else if (NIL != sbhl_time_modules.not_cotemporalP(arg1, arg2, UNPROVIDED)) {
            SubLObject formula = cycl_utilities.negate(backward_utilities.inference_make_commutative_literal($$cotemporal, list(arg1, arg2)));
            backward.removal_add_node(arguments.make_hl_support($TIME, formula, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED);
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-sbhl-time-preds.lisp", position = 38400L)
    public static SubLObject removal_all_temporally_intersects_output_generate(SubLObject temporal_thing) {
        return iteration.new_list_iterator(sbhl_time_modules.all_temporally_intersects(temporal_thing, UNPROVIDED));
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-sbhl-time-preds.lisp", position = 40900L)
    public static SubLObject removal_not_temporally_intersects_expand(SubLObject literal, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        SubLObject arg1 = sbhl_time_utilities.sbhl_time_inference_args(literal);
        SubLObject arg2 = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (NIL != control_vars.$negation_by_failure$.getDynamicValue(thread) && NIL == sbhl_time_modules.temporally_intersectsP(arg1, arg2, UNPROVIDED)) {
            SubLObject formula = cycl_utilities.negate(backward_utilities.inference_make_commutative_literal($$temporallyIntersects, list(arg1, arg2)));
            backward.removal_add_node(arguments.make_hl_support($MINIMIZE, formula, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED);
        } else if (NIL != sbhl_time_modules.not_temporally_intersectsP(arg1, arg2, UNPROVIDED)) {
            SubLObject formula = cycl_utilities.negate(backward_utilities.inference_make_commutative_literal($$temporallyIntersects, list(arg1, arg2)));
            backward.removal_add_node(arguments.make_hl_support($TIME, formula, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED);
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-sbhl-time-preds.lisp", position = 43200L)
    public static SubLObject removal_all_temporally_disjoint_output_generate(SubLObject temporal_thing) {
        return iteration.new_list_iterator(sbhl_time_modules.all_temporally_disjoint(temporal_thing, UNPROVIDED));
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-sbhl-time-preds.lisp", position = 45700L)
    public static SubLObject removal_not_temporally_disjoint_expand(SubLObject literal, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        SubLObject arg1 = sbhl_time_utilities.sbhl_time_inference_args(literal);
        SubLObject arg2 = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (NIL != control_vars.$negation_by_failure$.getDynamicValue(thread) && NIL == sbhl_time_modules.temporally_disjointP(arg1, arg2, UNPROVIDED)) {
            SubLObject formula = cycl_utilities.negate(backward_utilities.inference_make_commutative_literal($$temporallyDisjoint, list(arg1, arg2)));
            backward.removal_add_node(arguments.make_hl_support($MINIMIZE, formula, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED);
        } else if (NIL != sbhl_time_modules.not_temporally_disjointP(arg1, arg2, UNPROVIDED)) {
            SubLObject formula = cycl_utilities.negate(backward_utilities.inference_make_commutative_literal($$temporallyDisjoint, list(arg1, arg2)));
            backward.removal_add_node(arguments.make_hl_support($TIME, formula, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED);
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-sbhl-time-preds.lisp", position = 48000L)
    public static SubLObject removal_all_temporal_bounds_contain_output_generate(SubLObject temporal_thing) {
        return iteration.new_list_iterator(sbhl_time_modules.all_temporal_bounds_contain(temporal_thing, UNPROVIDED));
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-sbhl-time-preds.lisp", position = 49300L)
    public static SubLObject removal_all_temporal_bounds_contain_inverse_output_generate(SubLObject temporal_thing) {
        return iteration.new_list_iterator(sbhl_time_modules.all_temporal_bounds_contain_inverse(temporal_thing, UNPROVIDED));
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-sbhl-time-preds.lisp", position = 50700L)
    public static SubLObject removal_not_temporal_bounds_contain_expand(SubLObject literal, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        SubLObject arg1 = sbhl_time_utilities.sbhl_time_inference_args(literal);
        SubLObject arg2 = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (NIL != control_vars.$negation_by_failure$.getDynamicValue(thread) && NIL == sbhl_time_modules.temporal_bounds_containP(arg1, arg2, UNPROVIDED)) {
            backward.removal_add_node(arguments.make_hl_support($MINIMIZE, cycl_utilities.negate(literal), UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED);
        } else if (NIL != sbhl_time_modules.not_temporal_bounds_containP(arg1, arg2, UNPROVIDED)) {
            backward.removal_add_node(arguments.make_hl_support($TIME, cycl_utilities.negate(literal), UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED);
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-sbhl-time-preds.lisp", position = 52900L)
    public static SubLObject removal_all_temporal_bounds_subsume_output_generate(SubLObject temporal_thing) {
        return iteration.new_list_iterator(sbhl_time_modules.all_temporal_bounds_subsume(temporal_thing, UNPROVIDED));
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-sbhl-time-preds.lisp", position = 54200L)
    public static SubLObject removal_all_temporal_bounds_subsume_inverse_output_generate(SubLObject temporal_thing) {
        return iteration.new_list_iterator(sbhl_time_modules.all_temporal_bounds_subsume_inverse(temporal_thing, UNPROVIDED));
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-sbhl-time-preds.lisp", position = 55600L)
    public static SubLObject removal_not_temporal_bounds_subsume_expand(SubLObject literal, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        SubLObject arg1 = sbhl_time_utilities.sbhl_time_inference_args(literal);
        SubLObject arg2 = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (NIL != control_vars.$negation_by_failure$.getDynamicValue(thread) && NIL == sbhl_time_modules.temporal_bounds_subsumeP(arg1, arg2, UNPROVIDED)) {
            backward.removal_add_node(arguments.make_hl_support($MINIMIZE, cycl_utilities.negate(literal), UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED);
        } else if (NIL != sbhl_time_modules.not_temporal_bounds_subsumeP(arg1, arg2, UNPROVIDED)) {
            backward.removal_add_node(arguments.make_hl_support($TIME, cycl_utilities.negate(literal), UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED);
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-sbhl-time-preds.lisp", position = 57800L)
    public static SubLObject removal_all_temporal_bounds_identical_output_generate(SubLObject temporal_thing) {
        return iteration.new_list_iterator(sbhl_time_modules.all_temporal_bounds_identical(temporal_thing, UNPROVIDED));
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-sbhl-time-preds.lisp", position = 60400L)
    public static SubLObject removal_not_temporal_bounds_identical_expand(SubLObject literal, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        SubLObject arg1 = sbhl_time_utilities.sbhl_time_inference_args(literal);
        SubLObject arg2 = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (NIL != control_vars.$negation_by_failure$.getDynamicValue(thread) && NIL == sbhl_time_modules.temporal_bounds_identicalP(arg1, arg2, UNPROVIDED)) {
            SubLObject formula = cycl_utilities.negate(backward_utilities.inference_make_commutative_literal($$temporalBoundsIdentical, list(arg1, arg2)));
            backward.removal_add_node(arguments.make_hl_support($MINIMIZE, formula, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED);
        } else if (NIL != sbhl_time_modules.not_temporal_bounds_identicalP(arg1, arg2, UNPROVIDED)) {
            SubLObject formula = cycl_utilities.negate(backward_utilities.inference_make_commutative_literal($$temporalBoundsIdentical, list(arg1, arg2)));
            backward.removal_add_node(arguments.make_hl_support($TIME, formula, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED);
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-sbhl-time-preds.lisp", position = 62700L)
    public static SubLObject removal_all_temporal_bounds_intersect_output_generate(SubLObject temporal_thing) {
        return iteration.new_list_iterator(sbhl_time_modules.all_temporal_bounds_intersect(temporal_thing, UNPROVIDED));
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-sbhl-time-preds.lisp", position = 65300L)
    public static SubLObject removal_not_temporal_bounds_intersect_expand(SubLObject literal, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        SubLObject arg1 = sbhl_time_utilities.sbhl_time_inference_args(literal);
        SubLObject arg2 = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (NIL != control_vars.$negation_by_failure$.getDynamicValue(thread) && NIL == sbhl_time_modules.temporal_bounds_intersectP(arg1, arg2, UNPROVIDED)) {
            SubLObject formula = cycl_utilities.negate(backward_utilities.inference_make_commutative_literal($$temporalBoundsIntersect, list(arg1, arg2)));
            backward.removal_add_node(arguments.make_hl_support($MINIMIZE, formula, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED);
        } else if (NIL != sbhl_time_modules.not_temporal_bounds_intersectP(arg1, arg2, UNPROVIDED)) {
            SubLObject formula = cycl_utilities.negate(backward_utilities.inference_make_commutative_literal($$temporalBoundsIntersect, list(arg1, arg2)));
            backward.removal_add_node(arguments.make_hl_support($TIME, formula, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED);
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-sbhl-time-preds.lisp", position = 67700L)
    public static SubLObject removal_all_temporally_cooriginating_output_generate(SubLObject temporal_thing) {
        return iteration.new_list_iterator(sbhl_time_modules.all_temporally_cooriginating(temporal_thing, UNPROVIDED));
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-sbhl-time-preds.lisp", position = 70200L)
    public static SubLObject removal_not_temporally_cooriginating_expand(SubLObject literal, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        SubLObject arg1 = sbhl_time_utilities.sbhl_time_inference_args(literal);
        SubLObject arg2 = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (NIL != control_vars.$negation_by_failure$.getDynamicValue(thread) && NIL == sbhl_time_modules.temporally_cooriginatingP(arg1, arg2, UNPROVIDED)) {
            SubLObject formula = cycl_utilities.negate(backward_utilities.inference_make_commutative_literal($$temporallyCooriginating, list(arg1, arg2)));
            backward.removal_add_node(arguments.make_hl_support($MINIMIZE, formula, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED);
        } else if (NIL != sbhl_time_modules.not_temporally_cooriginatingP(arg1, arg2, UNPROVIDED)) {
            SubLObject formula = cycl_utilities.negate(backward_utilities.inference_make_commutative_literal($$temporallyCooriginating, list(arg1, arg2)));
            backward.removal_add_node(arguments.make_hl_support($TIME, formula, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED);
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-sbhl-time-preds.lisp", position = 72600L)
    public static SubLObject removal_all_temporally_coterminal_output_generate(SubLObject temporal_thing) {
        return iteration.new_list_iterator(sbhl_time_modules.all_temporally_coterminal(temporal_thing, UNPROVIDED));
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-sbhl-time-preds.lisp", position = 75100L)
    public static SubLObject removal_not_temporally_coterminal_expand(SubLObject literal, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        SubLObject arg1 = sbhl_time_utilities.sbhl_time_inference_args(literal);
        SubLObject arg2 = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (NIL != control_vars.$negation_by_failure$.getDynamicValue(thread) && NIL == sbhl_time_modules.temporally_coterminalP(arg1, arg2, UNPROVIDED)) {
            SubLObject formula = cycl_utilities.negate(backward_utilities.inference_make_commutative_literal($$temporallyCoterminal, list(arg1, arg2)));
            backward.removal_add_node(arguments.make_hl_support($MINIMIZE, formula, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED);
        } else if (NIL != sbhl_time_modules.not_temporally_coterminalP(arg1, arg2, UNPROVIDED)) {
            SubLObject formula = cycl_utilities.negate(backward_utilities.inference_make_commutative_literal($$temporallyCoterminal, list(arg1, arg2)));
            backward.removal_add_node(arguments.make_hl_support($TIME, formula, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED);
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-sbhl-time-preds.lisp", position = 77400L)
    public static SubLObject removal_all_contiguous_after_output_generate(SubLObject temporal_thing) {
        return iteration.new_list_iterator(sbhl_time_modules.all_contiguous_after(temporal_thing, UNPROVIDED));
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-sbhl-time-preds.lisp", position = 78600L)
    public static SubLObject removal_all_contiguous_after_inverse_output_generate(SubLObject temporal_thing) {
        return iteration.new_list_iterator(sbhl_time_modules.all_contiguous_after_inverse(temporal_thing, UNPROVIDED));
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-sbhl-time-preds.lisp", position = 79900L)
    public static SubLObject removal_not_contiguous_after_expand(SubLObject literal, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        SubLObject arg1 = sbhl_time_utilities.sbhl_time_inference_args(literal);
        SubLObject arg2 = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (NIL != control_vars.$negation_by_failure$.getDynamicValue(thread) && NIL == sbhl_time_modules.contiguous_afterP(arg1, arg2, UNPROVIDED)) {
            backward.removal_add_node(arguments.make_hl_support($MINIMIZE, cycl_utilities.negate(literal), UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED);
        } else if (NIL != sbhl_time_modules.not_contiguous_afterP(arg1, arg2, UNPROVIDED)) {
            backward.removal_add_node(arguments.make_hl_support($TIME, cycl_utilities.negate(literal), UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED);
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-sbhl-time-preds.lisp", position = 81900L)
    public static SubLObject removal_all_starts_during_output_generate(SubLObject temporal_thing) {
        return iteration.new_list_iterator(sbhl_time_modules.all_starts_during(temporal_thing, UNPROVIDED));
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-sbhl-time-preds.lisp", position = 83200L)
    public static SubLObject removal_all_starts_during_inverse_output_generate(SubLObject temporal_thing) {
        return iteration.new_list_iterator(sbhl_time_modules.all_starts_during_inverse(temporal_thing, UNPROVIDED));
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-sbhl-time-preds.lisp", position = 84400L)
    public static SubLObject removal_not_starts_during_expand(SubLObject literal, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        SubLObject arg1 = sbhl_time_utilities.sbhl_time_inference_args(literal);
        SubLObject arg2 = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (NIL != control_vars.$negation_by_failure$.getDynamicValue(thread) && NIL == sbhl_time_modules.starts_duringP(arg1, arg2, UNPROVIDED)) {
            backward.removal_add_node(arguments.make_hl_support($MINIMIZE, cycl_utilities.negate(literal), UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED);
        } else if (NIL != sbhl_time_modules.not_starts_duringP(arg1, arg2, UNPROVIDED)) {
            backward.removal_add_node(arguments.make_hl_support($TIME, cycl_utilities.negate(literal), UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED);
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-sbhl-time-preds.lisp", position = 86400L)
    public static SubLObject removal_all_ends_during_output_generate(SubLObject temporal_thing) {
        return iteration.new_list_iterator(sbhl_time_modules.all_ends_during(temporal_thing, UNPROVIDED));
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-sbhl-time-preds.lisp", position = 87600L)
    public static SubLObject removal_all_ends_during_inverse_output_generate(SubLObject temporal_thing) {
        return iteration.new_list_iterator(sbhl_time_modules.all_ends_during_inverse(temporal_thing, UNPROVIDED));
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-sbhl-time-preds.lisp", position = 88900L)
    public static SubLObject removal_not_ends_during_expand(SubLObject literal, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        SubLObject arg1 = sbhl_time_utilities.sbhl_time_inference_args(literal);
        SubLObject arg2 = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (NIL != control_vars.$negation_by_failure$.getDynamicValue(thread) && NIL == sbhl_time_modules.ends_duringP(arg1, arg2, UNPROVIDED)) {
            backward.removal_add_node(arguments.make_hl_support($MINIMIZE, cycl_utilities.negate(literal), UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED);
        } else if (NIL != sbhl_time_modules.not_ends_duringP(arg1, arg2, UNPROVIDED)) {
            backward.removal_add_node(arguments.make_hl_support($TIME, cycl_utilities.negate(literal), UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED);
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-sbhl-time-preds.lisp", position = 90800L)
    public static SubLObject removal_all_starting_date_inverse_output_generate(SubLObject temporal_thing) {
        return iteration.new_list_iterator(sbhl_time_modules.all_starting_date_inverse(temporal_thing, UNPROVIDED));
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-sbhl-time-preds.lisp", position = 92000L)
    public static SubLObject removal_not_starting_date_expand(SubLObject literal, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        SubLObject arg1 = sbhl_time_utilities.sbhl_time_inference_args(literal);
        SubLObject arg2 = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (NIL != control_vars.$negation_by_failure$.getDynamicValue(thread) && NIL == sbhl_time_modules.starting_dateP(arg1, arg2, UNPROVIDED)) {
            backward.removal_add_node(arguments.make_hl_support($MINIMIZE, cycl_utilities.negate(literal), UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED);
        } else if (NIL != sbhl_time_modules.not_starting_dateP(arg1, arg2, UNPROVIDED)) {
            backward.removal_add_node(arguments.make_hl_support($TIME, cycl_utilities.negate(literal), UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED);
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-sbhl-time-preds.lisp", position = 93900L)
    public static SubLObject removal_all_ending_date_inverse_output_generate(SubLObject temporal_thing) {
        return iteration.new_list_iterator(sbhl_time_modules.all_ending_date_inverse(temporal_thing, UNPROVIDED));
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-sbhl-time-preds.lisp", position = 95100L)
    public static SubLObject removal_not_ending_date_expand(SubLObject literal, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        SubLObject arg1 = sbhl_time_utilities.sbhl_time_inference_args(literal);
        SubLObject arg2 = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (NIL != control_vars.$negation_by_failure$.getDynamicValue(thread) && NIL == sbhl_time_modules.ending_dateP(arg1, arg2, UNPROVIDED)) {
            backward.removal_add_node(arguments.make_hl_support($MINIMIZE, cycl_utilities.negate(literal), UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED);
        } else if (NIL != sbhl_time_modules.not_ending_dateP(arg1, arg2, UNPROVIDED)) {
            backward.removal_add_node(arguments.make_hl_support($TIME, cycl_utilities.negate(literal), UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED);
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-sbhl-time-preds.lisp", position = 97000L)
    public static SubLObject removal_all_birth_date_inverse_output_generate(SubLObject temporal_thing) {
        return iteration.new_list_iterator(sbhl_time_modules.all_birth_date_inverse(temporal_thing, UNPROVIDED));
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-sbhl-time-preds.lisp", position = 98200L)
    public static SubLObject removal_not_birth_date_expand(SubLObject literal, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        SubLObject arg1 = sbhl_time_utilities.sbhl_time_inference_args(literal);
        SubLObject arg2 = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (NIL != control_vars.$negation_by_failure$.getDynamicValue(thread) && NIL == sbhl_time_modules.birth_dateP(arg1, arg2, UNPROVIDED)) {
            backward.removal_add_node(arguments.make_hl_support($MINIMIZE, cycl_utilities.negate(literal), UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED);
        } else if (NIL != sbhl_time_modules.not_birth_dateP(arg1, arg2, UNPROVIDED)) {
            backward.removal_add_node(arguments.make_hl_support($TIME, cycl_utilities.negate(literal), UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED);
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-sbhl-time-preds.lisp", position = 100100L)
    public static SubLObject removal_all_date_of_death_inverse_output_generate(SubLObject temporal_thing) {
        return iteration.new_list_iterator(sbhl_time_modules.all_date_of_death_inverse(temporal_thing, UNPROVIDED));
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-sbhl-time-preds.lisp", position = 101300L)
    public static SubLObject removal_not_date_of_death_expand(SubLObject literal, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        SubLObject arg1 = sbhl_time_utilities.sbhl_time_inference_args(literal);
        SubLObject arg2 = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (NIL != control_vars.$negation_by_failure$.getDynamicValue(thread) && NIL == sbhl_time_modules.date_of_deathP(arg1, arg2, UNPROVIDED)) {
            backward.removal_add_node(arguments.make_hl_support($MINIMIZE, cycl_utilities.negate(literal), UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED);
        } else if (NIL != sbhl_time_modules.not_date_of_deathP(arg1, arg2, UNPROVIDED)) {
            backward.removal_add_node(arguments.make_hl_support($TIME, cycl_utilities.negate(literal), UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED);
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-sbhl-time-preds.lisp", position = 103400L)
    public static SubLObject removal_all_temporally_started_by_output_generate(SubLObject temporal_thing) {
        return iteration.new_list_iterator(sbhl_time_modules.all_temporally_started_by(temporal_thing, UNPROVIDED));
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-sbhl-time-preds.lisp", position = 104700L)
    public static SubLObject removal_all_temporally_started_by_inverse_output_generate(SubLObject temporal_thing) {
        return iteration.new_list_iterator(sbhl_time_modules.all_temporally_started_by_inverse(temporal_thing, UNPROVIDED));
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-sbhl-time-preds.lisp", position = 106100L)
    public static SubLObject removal_not_temporally_started_by_expand(SubLObject literal, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        SubLObject arg1 = sbhl_time_utilities.sbhl_time_inference_args(literal);
        SubLObject arg2 = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (NIL != control_vars.$negation_by_failure$.getDynamicValue(thread) && NIL == sbhl_time_modules.temporally_started_byP(arg1, arg2, UNPROVIDED)) {
            backward.removal_add_node(arguments.make_hl_support($MINIMIZE, cycl_utilities.negate(literal), UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED);
        } else if (NIL != sbhl_time_modules.not_temporally_started_byP(arg1, arg2, UNPROVIDED)) {
            backward.removal_add_node(arguments.make_hl_support($TIME, cycl_utilities.negate(literal), UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED);
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-sbhl-time-preds.lisp", position = 108200L)
    public static SubLObject removal_all_temporally_finished_by_output_generate(SubLObject temporal_thing) {
        return iteration.new_list_iterator(sbhl_time_modules.all_temporally_finished_by(temporal_thing, UNPROVIDED));
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-sbhl-time-preds.lisp", position = 109500L)
    public static SubLObject removal_all_temporally_finished_by_inverse_output_generate(SubLObject temporal_thing) {
        return iteration.new_list_iterator(sbhl_time_modules.all_temporally_finished_by_inverse(temporal_thing, UNPROVIDED));
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-sbhl-time-preds.lisp", position = 110900L)
    public static SubLObject removal_not_temporally_finished_by_expand(SubLObject literal, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        SubLObject arg1 = sbhl_time_utilities.sbhl_time_inference_args(literal);
        SubLObject arg2 = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (NIL != control_vars.$negation_by_failure$.getDynamicValue(thread) && NIL == sbhl_time_modules.temporally_finished_byP(arg1, arg2, UNPROVIDED)) {
            backward.removal_add_node(arguments.make_hl_support($MINIMIZE, cycl_utilities.negate(literal), UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED);
        } else if (NIL != sbhl_time_modules.not_temporally_finished_byP(arg1, arg2, UNPROVIDED)) {
            backward.removal_add_node(arguments.make_hl_support($TIME, cycl_utilities.negate(literal), UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED);
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-sbhl-time-preds.lisp", position = 113000L)
    public static SubLObject removal_all_overlaps_start_output_generate(SubLObject temporal_thing) {
        return iteration.new_list_iterator(sbhl_time_modules.all_overlaps_start(temporal_thing, UNPROVIDED));
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-sbhl-time-preds.lisp", position = 114200L)
    public static SubLObject removal_all_overlaps_start_inverse_output_generate(SubLObject temporal_thing) {
        return iteration.new_list_iterator(sbhl_time_modules.all_overlaps_start_inverse(temporal_thing, UNPROVIDED));
    }

    @SubL(source = "cycl/inference/modules/removal/removal-modules-sbhl-time-preds.lisp", position = 115500L)
    public static SubLObject removal_not_overlaps_start_expand(SubLObject literal, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        SubLObject arg1 = sbhl_time_utilities.sbhl_time_inference_args(literal);
        SubLObject arg2 = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (NIL != control_vars.$negation_by_failure$.getDynamicValue(thread) && NIL == sbhl_time_modules.overlaps_startP(arg1, arg2, UNPROVIDED)) {
            backward.removal_add_node(arguments.make_hl_support($MINIMIZE, cycl_utilities.negate(literal), UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED);
        } else if (NIL != sbhl_time_modules.not_overlaps_startP(arg1, arg2, UNPROVIDED)) {
            backward.removal_add_node(arguments.make_hl_support($TIME, cycl_utilities.negate(literal), UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED);
        }
        return NIL;
    }

    public static SubLObject declare_removal_modules_sbhl_time_preds_file() {
        declareFunction(myName, "removal_all_starts_after_starting_of_output_generate", "REMOVAL-ALL-STARTS-AFTER-STARTING-OF-OUTPUT-GENERATE", 1, 0, false);
        declareFunction(myName, "removal_all_starts_after_starting_of_inverse_output_generate", "REMOVAL-ALL-STARTS-AFTER-STARTING-OF-INVERSE-OUTPUT-GENERATE", 1, 0, false);
        declareFunction(myName, "removal_not_starts_after_starting_of_expand", "REMOVAL-NOT-STARTS-AFTER-STARTING-OF-EXPAND", 1, 1, false);
        declareFunction(myName, "removal_all_starts_after_ending_of_output_generate", "REMOVAL-ALL-STARTS-AFTER-ENDING-OF-OUTPUT-GENERATE", 1, 0, false);
        declareFunction(myName, "removal_all_starts_after_ending_of_inverse_output_generate", "REMOVAL-ALL-STARTS-AFTER-ENDING-OF-INVERSE-OUTPUT-GENERATE", 1, 0, false);
        declareFunction(myName, "removal_not_starts_after_ending_of_expand", "REMOVAL-NOT-STARTS-AFTER-ENDING-OF-EXPAND", 1, 1, false);
        declareFunction(myName, "removal_all_ends_after_starting_of_output_generate", "REMOVAL-ALL-ENDS-AFTER-STARTING-OF-OUTPUT-GENERATE", 1, 0, false);
        declareFunction(myName, "removal_all_ends_after_starting_of_inverse_output_generate", "REMOVAL-ALL-ENDS-AFTER-STARTING-OF-INVERSE-OUTPUT-GENERATE", 1, 0, false);
        declareFunction(myName, "removal_not_ends_after_starting_of_expand", "REMOVAL-NOT-ENDS-AFTER-STARTING-OF-EXPAND", 1, 1, false);
        declareFunction(myName, "removal_all_ends_after_ending_of_output_generate", "REMOVAL-ALL-ENDS-AFTER-ENDING-OF-OUTPUT-GENERATE", 1, 0, false);
        declareFunction(myName, "removal_all_ends_after_ending_of_inverse_output_generate", "REMOVAL-ALL-ENDS-AFTER-ENDING-OF-INVERSE-OUTPUT-GENERATE", 1, 0, false);
        declareFunction(myName, "removal_not_ends_after_ending_of_expand", "REMOVAL-NOT-ENDS-AFTER-ENDING-OF-EXPAND", 1, 1, false);
        declareFunction(myName, "removal_all_temporally_subsumes_output_generate", "REMOVAL-ALL-TEMPORALLY-SUBSUMES-OUTPUT-GENERATE", 1, 0, false);
        declareFunction(myName, "removal_all_temporally_subsumes_inverse_output_generate", "REMOVAL-ALL-TEMPORALLY-SUBSUMES-INVERSE-OUTPUT-GENERATE", 1, 0, false);
        declareFunction(myName, "removal_not_temporally_subsumes_expand", "REMOVAL-NOT-TEMPORALLY-SUBSUMES-EXPAND", 1, 1, false);
        declareFunction(myName, "removal_all_date_of_event_inverse_output_generate", "REMOVAL-ALL-DATE-OF-EVENT-INVERSE-OUTPUT-GENERATE", 1, 0, false);
        declareFunction(myName, "removal_not_date_of_event_expand", "REMOVAL-NOT-DATE-OF-EVENT-EXPAND", 1, 1, false);
        declareFunction(myName, "removal_all_cotemporal_output_generate", "REMOVAL-ALL-COTEMPORAL-OUTPUT-GENERATE", 1, 0, false);
        declareFunction(myName, "removal_not_cotemporal_expand", "REMOVAL-NOT-COTEMPORAL-EXPAND", 1, 1, false);
        declareFunction(myName, "removal_all_temporally_intersects_output_generate", "REMOVAL-ALL-TEMPORALLY-INTERSECTS-OUTPUT-GENERATE", 1, 0, false);
        declareFunction(myName, "removal_not_temporally_intersects_expand", "REMOVAL-NOT-TEMPORALLY-INTERSECTS-EXPAND", 1, 1, false);
        declareFunction(myName, "removal_all_temporally_disjoint_output_generate", "REMOVAL-ALL-TEMPORALLY-DISJOINT-OUTPUT-GENERATE", 1, 0, false);
        declareFunction(myName, "removal_not_temporally_disjoint_expand", "REMOVAL-NOT-TEMPORALLY-DISJOINT-EXPAND", 1, 1, false);
        declareFunction(myName, "removal_all_temporal_bounds_contain_output_generate", "REMOVAL-ALL-TEMPORAL-BOUNDS-CONTAIN-OUTPUT-GENERATE", 1, 0, false);
        declareFunction(myName, "removal_all_temporal_bounds_contain_inverse_output_generate", "REMOVAL-ALL-TEMPORAL-BOUNDS-CONTAIN-INVERSE-OUTPUT-GENERATE", 1, 0, false);
        declareFunction(myName, "removal_not_temporal_bounds_contain_expand", "REMOVAL-NOT-TEMPORAL-BOUNDS-CONTAIN-EXPAND", 1, 1, false);
        declareFunction(myName, "removal_all_temporal_bounds_subsume_output_generate", "REMOVAL-ALL-TEMPORAL-BOUNDS-SUBSUME-OUTPUT-GENERATE", 1, 0, false);
        declareFunction(myName, "removal_all_temporal_bounds_subsume_inverse_output_generate", "REMOVAL-ALL-TEMPORAL-BOUNDS-SUBSUME-INVERSE-OUTPUT-GENERATE", 1, 0, false);
        declareFunction(myName, "removal_not_temporal_bounds_subsume_expand", "REMOVAL-NOT-TEMPORAL-BOUNDS-SUBSUME-EXPAND", 1, 1, false);
        declareFunction(myName, "removal_all_temporal_bounds_identical_output_generate", "REMOVAL-ALL-TEMPORAL-BOUNDS-IDENTICAL-OUTPUT-GENERATE", 1, 0, false);
        declareFunction(myName, "removal_not_temporal_bounds_identical_expand", "REMOVAL-NOT-TEMPORAL-BOUNDS-IDENTICAL-EXPAND", 1, 1, false);
        declareFunction(myName, "removal_all_temporal_bounds_intersect_output_generate", "REMOVAL-ALL-TEMPORAL-BOUNDS-INTERSECT-OUTPUT-GENERATE", 1, 0, false);
        declareFunction(myName, "removal_not_temporal_bounds_intersect_expand", "REMOVAL-NOT-TEMPORAL-BOUNDS-INTERSECT-EXPAND", 1, 1, false);
        declareFunction(myName, "removal_all_temporally_cooriginating_output_generate", "REMOVAL-ALL-TEMPORALLY-COORIGINATING-OUTPUT-GENERATE", 1, 0, false);
        declareFunction(myName, "removal_not_temporally_cooriginating_expand", "REMOVAL-NOT-TEMPORALLY-COORIGINATING-EXPAND", 1, 1, false);
        declareFunction(myName, "removal_all_temporally_coterminal_output_generate", "REMOVAL-ALL-TEMPORALLY-COTERMINAL-OUTPUT-GENERATE", 1, 0, false);
        declareFunction(myName, "removal_not_temporally_coterminal_expand", "REMOVAL-NOT-TEMPORALLY-COTERMINAL-EXPAND", 1, 1, false);
        declareFunction(myName, "removal_all_contiguous_after_output_generate", "REMOVAL-ALL-CONTIGUOUS-AFTER-OUTPUT-GENERATE", 1, 0, false);
        declareFunction(myName, "removal_all_contiguous_after_inverse_output_generate", "REMOVAL-ALL-CONTIGUOUS-AFTER-INVERSE-OUTPUT-GENERATE", 1, 0, false);
        declareFunction(myName, "removal_not_contiguous_after_expand", "REMOVAL-NOT-CONTIGUOUS-AFTER-EXPAND", 1, 1, false);
        declareFunction(myName, "removal_all_starts_during_output_generate", "REMOVAL-ALL-STARTS-DURING-OUTPUT-GENERATE", 1, 0, false);
        declareFunction(myName, "removal_all_starts_during_inverse_output_generate", "REMOVAL-ALL-STARTS-DURING-INVERSE-OUTPUT-GENERATE", 1, 0, false);
        declareFunction(myName, "removal_not_starts_during_expand", "REMOVAL-NOT-STARTS-DURING-EXPAND", 1, 1, false);
        declareFunction(myName, "removal_all_ends_during_output_generate", "REMOVAL-ALL-ENDS-DURING-OUTPUT-GENERATE", 1, 0, false);
        declareFunction(myName, "removal_all_ends_during_inverse_output_generate", "REMOVAL-ALL-ENDS-DURING-INVERSE-OUTPUT-GENERATE", 1, 0, false);
        declareFunction(myName, "removal_not_ends_during_expand", "REMOVAL-NOT-ENDS-DURING-EXPAND", 1, 1, false);
        declareFunction(myName, "removal_all_starting_date_inverse_output_generate", "REMOVAL-ALL-STARTING-DATE-INVERSE-OUTPUT-GENERATE", 1, 0, false);
        declareFunction(myName, "removal_not_starting_date_expand", "REMOVAL-NOT-STARTING-DATE-EXPAND", 1, 1, false);
        declareFunction(myName, "removal_all_ending_date_inverse_output_generate", "REMOVAL-ALL-ENDING-DATE-INVERSE-OUTPUT-GENERATE", 1, 0, false);
        declareFunction(myName, "removal_not_ending_date_expand", "REMOVAL-NOT-ENDING-DATE-EXPAND", 1, 1, false);
        declareFunction(myName, "removal_all_birth_date_inverse_output_generate", "REMOVAL-ALL-BIRTH-DATE-INVERSE-OUTPUT-GENERATE", 1, 0, false);
        declareFunction(myName, "removal_not_birth_date_expand", "REMOVAL-NOT-BIRTH-DATE-EXPAND", 1, 1, false);
        declareFunction(myName, "removal_all_date_of_death_inverse_output_generate", "REMOVAL-ALL-DATE-OF-DEATH-INVERSE-OUTPUT-GENERATE", 1, 0, false);
        declareFunction(myName, "removal_not_date_of_death_expand", "REMOVAL-NOT-DATE-OF-DEATH-EXPAND", 1, 1, false);
        declareFunction(myName, "removal_all_temporally_started_by_output_generate", "REMOVAL-ALL-TEMPORALLY-STARTED-BY-OUTPUT-GENERATE", 1, 0, false);
        declareFunction(myName, "removal_all_temporally_started_by_inverse_output_generate", "REMOVAL-ALL-TEMPORALLY-STARTED-BY-INVERSE-OUTPUT-GENERATE", 1, 0, false);
        declareFunction(myName, "removal_not_temporally_started_by_expand", "REMOVAL-NOT-TEMPORALLY-STARTED-BY-EXPAND", 1, 1, false);
        declareFunction(myName, "removal_all_temporally_finished_by_output_generate", "REMOVAL-ALL-TEMPORALLY-FINISHED-BY-OUTPUT-GENERATE", 1, 0, false);
        declareFunction(myName, "removal_all_temporally_finished_by_inverse_output_generate", "REMOVAL-ALL-TEMPORALLY-FINISHED-BY-INVERSE-OUTPUT-GENERATE", 1, 0, false);
        declareFunction(myName, "removal_not_temporally_finished_by_expand", "REMOVAL-NOT-TEMPORALLY-FINISHED-BY-EXPAND", 1, 1, false);
        declareFunction(myName, "removal_all_overlaps_start_output_generate", "REMOVAL-ALL-OVERLAPS-START-OUTPUT-GENERATE", 1, 0, false);
        declareFunction(myName, "removal_all_overlaps_start_inverse_output_generate", "REMOVAL-ALL-OVERLAPS-START-INVERSE-OUTPUT-GENERATE", 1, 0, false);
        declareFunction(myName, "removal_not_overlaps_start_expand", "REMOVAL-NOT-OVERLAPS-START-EXPAND", 1, 1, false);
        return NIL;
    }

    public static SubLObject init_removal_modules_sbhl_time_preds_file() {
        $sbhl_time_generic_modules$ = deflexical("*SBHL-TIME-GENERIC-MODULES*", $list0);
        $default_temporal_relation_check_cost$ = defparameter("*DEFAULT-TEMPORAL-RELATION-CHECK-COST*", control_vars.$hl_module_check_cost$.getDynamicValue());
        $default_all_temporal_relation_cost$ = defparameter("*DEFAULT-ALL-TEMPORAL-RELATION-COST*", $int$200);
        $default_all_temporal_relation_inverse_cost$ = SubLFiles.defparameter("*DEFAULT-ALL-TEMPORAL-RELATION-INVERSE-COST*", $int$200);
        $default_not_temporal_relation_check_cost$ = SubLFiles.defparameter("*DEFAULT-NOT-TEMPORAL-RELATION-CHECK-COST*", ONE_INTEGER);
        return NIL;
    }

    public static SubLObject setup_removal_modules_sbhl_time_preds_file() {
        inference_modules.inference_removal_module($SBHL_TIME_TOTAL_EXCLUSIVITY_POS,
                listS($SENSE, new SubLObject[] { $POS, $ARITY, TWO_INTEGER, $REQUIRED_PATTERN, $list6, $EXCLUSIVE, $sym8$TRUE, $SUPPLANTS, conses_high.copy_list($sbhl_time_generic_modules$.getGlobalValue()), $list10 }));
        SubLObject predicates = $list11;
        SubLObject removal_modules = $sbhl_time_generic_modules$.getGlobalValue();
        SubLObject cdolist_list_var = predicates;
        SubLObject pred = NIL;
        pred = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            inference_modules.inference_removal_module_use_generic(pred, $SBHL_TIME_TOTAL_EXCLUSIVITY_POS);
            SubLObject cdolist_list_var_$1 = removal_modules;
            SubLObject module = NIL;
            module = cdolist_list_var_$1.first();
            while (NIL != cdolist_list_var_$1) {
                inference_modules.inference_removal_module_use_generic(pred, module);
                cdolist_list_var_$1 = cdolist_list_var_$1.rest();
                module = cdolist_list_var_$1.first();
            }
            cdolist_list_var = cdolist_list_var.rest();
            pred = cdolist_list_var.first();
        }
        inference_modules.register_solely_specific_removal_module_predicate($$startsAfterStartingOf);
        inference_modules.inference_removal_module($REMOVAL_STARTS_AFTER_STARTING_OF, $list15);
        utilities_macros.note_funcall_helper_function($sym16$REMOVAL_ALL_STARTS_AFTER_STARTING_OF_OUTPUT_GENERATE);
        inference_modules.inference_removal_module($REMOVAL_ALL_STARTS_AFTER_STARTING_OF, $list18);
        preference_modules.inference_preference_module($ALL_STARTS_AFTER_STARTING_OF_POS, $list20);
        utilities_macros.note_funcall_helper_function($sym21$REMOVAL_ALL_STARTS_AFTER_STARTING_OF_INVERSE_OUTPUT_GENERATE);
        inference_modules.inference_removal_module($REMOVAL_ALL_STARTS_AFTER_STARTING_OF_INVERSE, $list23);
        preference_modules.inference_preference_module($ALL_STARTS_AFTER_STARTING_OF_INVERSE_POS, $list25);
        inference_modules.inference_removal_module($REMOVAL_NOT_STARTS_AFTER_STARTING_OF, $list29);
        inference_modules.register_solely_specific_removal_module_predicate($$startsAfterEndingOf);
        inference_modules.inference_removal_module($REMOVAL_STARTS_AFTER_ENDING_OF, $list32);
        utilities_macros.note_funcall_helper_function($sym33$REMOVAL_ALL_STARTS_AFTER_ENDING_OF_OUTPUT_GENERATE);
        inference_modules.inference_removal_module($REMOVAL_ALL_STARTS_AFTER_ENDING_OF, $list35);
        preference_modules.inference_preference_module($ALL_STARTS_AFTER_ENDING_OF_POS, $list37);
        utilities_macros.note_funcall_helper_function($sym38$REMOVAL_ALL_STARTS_AFTER_ENDING_OF_INVERSE_OUTPUT_GENERATE);
        inference_modules.inference_removal_module($REMOVAL_ALL_STARTS_AFTER_ENDING_OF_INVERSE, $list40);
        preference_modules.inference_preference_module($ALL_STARTS_AFTER_ENDING_OF_INVERSE_POS, $list42);
        inference_modules.inference_removal_module($REMOVAL_NOT_STARTS_AFTER_ENDING_OF, $list44);
        inference_modules.register_solely_specific_removal_module_predicate($$endsAfterStartingOf);
        inference_modules.inference_removal_module($REMOVAL_ENDS_AFTER_STARTING_OF, $list47);
        utilities_macros.note_funcall_helper_function($sym48$REMOVAL_ALL_ENDS_AFTER_STARTING_OF_OUTPUT_GENERATE);
        inference_modules.inference_removal_module($REMOVAL_ALL_ENDS_AFTER_STARTING_OF, $list50);
        preference_modules.inference_preference_module($ALL_ENDS_AFTER_STARTING_OF_POS, $list52);
        utilities_macros.note_funcall_helper_function($sym53$REMOVAL_ALL_ENDS_AFTER_STARTING_OF_INVERSE_OUTPUT_GENERATE);
        inference_modules.inference_removal_module($REMOVAL_ALL_ENDS_AFTER_STARTING_OF_INVERSE, $list55);
        preference_modules.inference_preference_module($ALL_ENDS_AFTER_STARTING_OF_INVERSE_POS, $list57);
        inference_modules.inference_removal_module($REMOVAL_NOT_ENDS_AFTER_STARTING_OF, $list59);
        inference_modules.register_solely_specific_removal_module_predicate($$endsAfterEndingOf);
        inference_modules.inference_removal_module($REMOVAL_ENDS_AFTER_ENDING_OF, $list62);
        utilities_macros.note_funcall_helper_function($sym63$REMOVAL_ALL_ENDS_AFTER_ENDING_OF_OUTPUT_GENERATE);
        inference_modules.inference_removal_module($REMOVAL_ALL_ENDS_AFTER_ENDING_OF, $list65);
        preference_modules.inference_preference_module($ALL_ENDS_AFTER_ENDING_OF_POS, $list67);
        utilities_macros.note_funcall_helper_function($sym68$REMOVAL_ALL_ENDS_AFTER_ENDING_OF_INVERSE_OUTPUT_GENERATE);
        inference_modules.inference_removal_module($REMOVAL_ALL_ENDS_AFTER_ENDING_OF_INVERSE, $list70);
        preference_modules.inference_preference_module($ALL_ENDS_AFTER_ENDING_OF_INVERSE_POS, $list72);
        inference_modules.inference_removal_module($REMOVAL_NOT_ENDS_AFTER_ENDING_OF, $list74);
        inference_modules.register_solely_specific_removal_module_predicate($$temporallySubsumes);
        inference_modules.inference_removal_module($REMOVAL_TEMPORALLY_SUBSUMES, $list77);
        utilities_macros.note_funcall_helper_function($sym78$REMOVAL_ALL_TEMPORALLY_SUBSUMES_OUTPUT_GENERATE);
        inference_modules.inference_removal_module($REMOVAL_ALL_TEMPORALLY_SUBSUMES, $list80);
        preference_modules.inference_preference_module($ALL_TEMPORALLY_SUBSUMES_POS, $list82);
        utilities_macros.note_funcall_helper_function($sym83$REMOVAL_ALL_TEMPORALLY_SUBSUMES_INVERSE_OUTPUT_GENERATE);
        inference_modules.inference_removal_module($REMOVAL_ALL_TEMPORALLY_SUBSUMES_INVERSE, $list85);
        preference_modules.inference_preference_module($ALL_TEMPORALLY_SUBSUMES_INVERSE_POS, $list87);
        inference_modules.inference_removal_module($REMOVAL_NOT_TEMPORALLY_SUBSUMES, $list89);
        inference_modules.register_solely_specific_removal_module_predicate($$dateOfEvent);
        preference_modules.doomed_unless_either_arg_bindable($POS, $$dateOfEvent);
        inference_modules.inference_removal_module($REMOVAL_DATE_OF_EVENT, $list92);
        utilities_macros.note_funcall_helper_function($sym93$REMOVAL_ALL_DATE_OF_EVENT_INVERSE_OUTPUT_GENERATE);
        inference_modules.inference_removal_module($REMOVAL_ALL_DATE_OF_EVENT_INVERSE, $list95);
        preference_modules.inference_preference_module($ALL_DATE_OF_EVENT_INVERSE_POS, $list97);
        inference_modules.inference_removal_module($REMOVAL_NOT_DATE_OF_EVENT, $list99);
        inference_modules.inference_removal_module($REMOVAL_DATE_OF_EVENT_DELAY, $list101);
        inference_modules.register_solely_specific_removal_module_predicate($$cotemporal);
        inference_modules.inference_removal_module($REMOVAL_COTEMPORAL, $list104);
        utilities_macros.note_funcall_helper_function($sym105$REMOVAL_ALL_COTEMPORAL_OUTPUT_GENERATE);
        inference_modules.inference_removal_module($REMOVAL_ALL_COTEMPORAL, $list107);
        preference_modules.inference_preference_module($ALL_COTEMPORAL_POS, $list109);
        inference_modules.inference_removal_module($REMOVAL_ALL_COTEMPORAL_INVERSE, $list111);
        preference_modules.inference_preference_module($ALL_COTEMPORAL_INVERSE_POS, $list113);
        inference_modules.inference_removal_module($REMOVAL_NOT_COTEMPORAL, $list115);
        inference_modules.register_solely_specific_removal_module_predicate($$temporallyIntersects);
        inference_modules.inference_removal_module($REMOVAL_TEMPORALLY_INTERSECTS, $list118);
        utilities_macros.note_funcall_helper_function($sym119$REMOVAL_ALL_TEMPORALLY_INTERSECTS_OUTPUT_GENERATE);
        inference_modules.inference_removal_module($REMOVAL_ALL_TEMPORALLY_INTERSECTS, $list121);
        preference_modules.inference_preference_module($ALL_TEMPORALLY_INTERSECTS_POS, $list123);
        inference_modules.inference_removal_module($REMOVAL_ALL_TEMPORALLY_INTERSECTS_INVERSE, $list125);
        preference_modules.inference_preference_module($ALL_TEMPORALLY_INTERSECTS_INVERSE_POS, $list127);
        inference_modules.inference_removal_module($REMOVAL_NOT_TEMPORALLY_INTERSECTS, $list129);
        inference_modules.register_solely_specific_removal_module_predicate($$temporallyDisjoint);
        inference_modules.inference_removal_module($REMOVAL_TEMPORALLY_DISJOINT, $list132);
        utilities_macros.note_funcall_helper_function($sym133$REMOVAL_ALL_TEMPORALLY_DISJOINT_OUTPUT_GENERATE);
        inference_modules.inference_removal_module($REMOVAL_ALL_TEMPORALLY_DISJOINT, $list135);
        preference_modules.inference_preference_module($ALL_TEMPORALLY_DISJOINT_POS, $list137);
        inference_modules.inference_removal_module($REMOVAL_ALL_TEMPORALLY_DISJOINT_INVERSE, $list139);
        preference_modules.inference_preference_module($ALL_TEMPORALLY_DISJOINT_INVERSE_POS, $list141);
        inference_modules.inference_removal_module($REMOVAL_NOT_TEMPORALLY_DISJOINT, $list143);
        inference_modules.register_solely_specific_removal_module_predicate($$temporalBoundsContain);
        inference_modules.inference_removal_module($REMOVAL_TEMPORAL_BOUNDS_CONTAIN, $list146);
        utilities_macros.note_funcall_helper_function($sym147$REMOVAL_ALL_TEMPORAL_BOUNDS_CONTAIN_OUTPUT_GENERATE);
        inference_modules.inference_removal_module($REMOVAL_ALL_TEMPORAL_BOUNDS_CONTAIN, $list149);
        preference_modules.inference_preference_module($ALL_TEMPORAL_BOUNDS_CONTAIN_POS, $list151);
        utilities_macros.note_funcall_helper_function($sym152$REMOVAL_ALL_TEMPORAL_BOUNDS_CONTAIN_INVERSE_OUTPUT_GENERATE);
        inference_modules.inference_removal_module($REMOVAL_ALL_TEMPORAL_BOUNDS_CONTAIN_INVERSE, $list154);
        preference_modules.inference_preference_module($ALL_TEMPORAL_BOUNDS_CONTAIN_INVERSE_POS, $list156);
        inference_modules.inference_removal_module($REMOVAL_NOT_TEMPORAL_BOUNDS_CONTAIN, $list158);
        inference_modules.register_solely_specific_removal_module_predicate($$temporalBoundsSubsume);
        inference_modules.inference_removal_module($REMOVAL_TEMPORAL_BOUNDS_SUBSUME, $list161);
        utilities_macros.note_funcall_helper_function($sym162$REMOVAL_ALL_TEMPORAL_BOUNDS_SUBSUME_OUTPUT_GENERATE);
        inference_modules.inference_removal_module($REMOVAL_ALL_TEMPORAL_BOUNDS_SUBSUME, $list164);
        preference_modules.inference_preference_module($ALL_TEMPORAL_BOUNDS_SUBSUME_POS, $list166);
        utilities_macros.note_funcall_helper_function($sym167$REMOVAL_ALL_TEMPORAL_BOUNDS_SUBSUME_INVERSE_OUTPUT_GENERATE);
        inference_modules.inference_removal_module($REMOVAL_ALL_TEMPORAL_BOUNDS_SUBSUME_INVERSE, $list169);
        preference_modules.inference_preference_module($ALL_TEMPORAL_BOUNDS_SUBSUME_INVERSE_POS, $list171);
        inference_modules.inference_removal_module($REMOVAL_NOT_TEMPORAL_BOUNDS_SUBSUME, $list173);
        inference_modules.register_solely_specific_removal_module_predicate($$temporalBoundsIdentical);
        inference_modules.inference_removal_module($REMOVAL_TEMPORAL_BOUNDS_IDENTICAL, $list176);
        utilities_macros.note_funcall_helper_function($sym177$REMOVAL_ALL_TEMPORAL_BOUNDS_IDENTICAL_OUTPUT_GENERATE);
        inference_modules.inference_removal_module($REMOVAL_ALL_TEMPORAL_BOUNDS_IDENTICAL, $list179);
        preference_modules.inference_preference_module($ALL_TEMPORAL_BOUNDS_IDENTICAL_POS, $list181);
        inference_modules.inference_removal_module($REMOVAL_ALL_TEMPORAL_BOUNDS_IDENTICAL_INVERSE, $list183);
        preference_modules.inference_preference_module($ALL_TEMPORAL_BOUNDS_IDENTICAL_INVERSE_POS, $list185);
        inference_modules.inference_removal_module($REMOVAL_NOT_TEMPORAL_BOUNDS_IDENTICAL, $list187);
        inference_modules.register_solely_specific_removal_module_predicate($$temporalBoundsIntersect);
        inference_modules.inference_removal_module($REMOVAL_TEMPORAL_BOUNDS_INTERSECT, $list190);
        utilities_macros.note_funcall_helper_function($sym191$REMOVAL_ALL_TEMPORAL_BOUNDS_INTERSECT_OUTPUT_GENERATE);
        inference_modules.inference_removal_module($REMOVAL_ALL_TEMPORAL_BOUNDS_INTERSECT, $list193);
        preference_modules.inference_preference_module($ALL_TEMPORAL_BOUNDS_INTERSECT_POS, $list195);
        inference_modules.inference_removal_module($REMOVAL_ALL_TEMPORAL_BOUNDS_INTERSECT_INVERSE, $list197);
        preference_modules.inference_preference_module($ALL_TEMPORAL_BOUNDS_INTERSECT_INVERSE_POS, $list199);
        inference_modules.inference_removal_module($REMOVAL_NOT_TEMPORAL_BOUNDS_INTERSECT, $list201);
        inference_modules.register_solely_specific_removal_module_predicate($$temporallyCooriginating);
        inference_modules.inference_removal_module($REMOVAL_TEMPORALLY_COORIGINATING, $list204);
        utilities_macros.note_funcall_helper_function($sym205$REMOVAL_ALL_TEMPORALLY_COORIGINATING_OUTPUT_GENERATE);
        inference_modules.inference_removal_module($REMOVAL_ALL_TEMPORALLY_COORIGINATING, $list207);
        preference_modules.inference_preference_module($ALL_TEMPORALLY_COORIGINATING_POS, $list209);
        inference_modules.inference_removal_module($REMOVAL_ALL_TEMPORALLY_COORIGINATING_INVERSE, $list211);
        preference_modules.inference_preference_module($ALL_TEMPORALLY_COORIGINATING_INVERSE_POS, $list213);
        inference_modules.inference_removal_module($REMOVAL_NOT_TEMPORALLY_COORIGINATING, $list215);
        inference_modules.register_solely_specific_removal_module_predicate($$temporallyCoterminal);
        inference_modules.inference_removal_module($REMOVAL_TEMPORALLY_COTERMINAL, $list218);
        utilities_macros.note_funcall_helper_function($sym219$REMOVAL_ALL_TEMPORALLY_COTERMINAL_OUTPUT_GENERATE);
        inference_modules.inference_removal_module($REMOVAL_ALL_TEMPORALLY_COTERMINAL, $list221);
        preference_modules.inference_preference_module($ALL_TEMPORALLY_COTERMINAL_POS, $list223);
        inference_modules.inference_removal_module($REMOVAL_ALL_TEMPORALLY_COTERMINAL_INVERSE, $list225);
        preference_modules.inference_preference_module($ALL_TEMPORALLY_COTERMINAL_INVERSE_POS, $list227);
        inference_modules.inference_removal_module($REMOVAL_NOT_TEMPORALLY_COTERMINAL, $list229);
        inference_modules.register_solely_specific_removal_module_predicate($$contiguousAfter);
        inference_modules.inference_removal_module($REMOVAL_CONTIGUOUS_AFTER, $list232);
        utilities_macros.note_funcall_helper_function($sym233$REMOVAL_ALL_CONTIGUOUS_AFTER_OUTPUT_GENERATE);
        inference_modules.inference_removal_module($REMOVAL_ALL_CONTIGUOUS_AFTER, $list235);
        preference_modules.inference_preference_module($ALL_CONTIGUOUS_AFTER_POS, $list237);
        utilities_macros.note_funcall_helper_function($sym238$REMOVAL_ALL_CONTIGUOUS_AFTER_INVERSE_OUTPUT_GENERATE);
        inference_modules.inference_removal_module($REMOVAL_ALL_CONTIGUOUS_AFTER_INVERSE, $list240);
        preference_modules.inference_preference_module($ALL_CONTIGUOUS_AFTER_INVERSE_POS, $list242);
        inference_modules.inference_removal_module($REMOVAL_NOT_CONTIGUOUS_AFTER, $list244);
        inference_modules.register_solely_specific_removal_module_predicate($$startsDuring);
        inference_modules.inference_removal_module($REMOVAL_STARTS_DURING, $list247);
        utilities_macros.note_funcall_helper_function($sym248$REMOVAL_ALL_STARTS_DURING_OUTPUT_GENERATE);
        inference_modules.inference_removal_module($REMOVAL_ALL_STARTS_DURING, $list250);
        preference_modules.inference_preference_module($ALL_STARTS_DURING_POS, $list252);
        utilities_macros.note_funcall_helper_function($sym253$REMOVAL_ALL_STARTS_DURING_INVERSE_OUTPUT_GENERATE);
        inference_modules.inference_removal_module($REMOVAL_ALL_STARTS_DURING_INVERSE, $list255);
        preference_modules.inference_preference_module($ALL_STARTS_DURING_INVERSE_POS, $list257);
        inference_modules.inference_removal_module($REMOVAL_NOT_STARTS_DURING, $list259);
        inference_modules.register_solely_specific_removal_module_predicate($$endsDuring);
        inference_modules.inference_removal_module($REMOVAL_ENDS_DURING, $list262);
        utilities_macros.note_funcall_helper_function($sym263$REMOVAL_ALL_ENDS_DURING_OUTPUT_GENERATE);
        inference_modules.inference_removal_module($REMOVAL_ALL_ENDS_DURING, $list265);
        preference_modules.inference_preference_module($ALL_ENDS_DURING_POS, $list267);
        utilities_macros.note_funcall_helper_function($sym268$REMOVAL_ALL_ENDS_DURING_INVERSE_OUTPUT_GENERATE);
        inference_modules.inference_removal_module($REMOVAL_ALL_ENDS_DURING_INVERSE, $list270);
        preference_modules.inference_preference_module($ALL_ENDS_DURING_INVERSE_POS, $list272);
        inference_modules.inference_removal_module($REMOVAL_NOT_ENDS_DURING, $list274);
        inference_modules.register_solely_specific_removal_module_predicate($$startingDate);
        inference_modules.inference_removal_module($REMOVAL_STARTING_DATE, $list277);
        utilities_macros.note_funcall_helper_function($sym278$REMOVAL_ALL_STARTING_DATE_INVERSE_OUTPUT_GENERATE);
        inference_modules.inference_removal_module($REMOVAL_ALL_STARTING_DATE_INVERSE, $list280);
        preference_modules.inference_preference_module($ALL_STARTING_DATE_INVERSE_POS, $list282);
        inference_modules.inference_removal_module($REMOVAL_NOT_STARTING_DATE, $list284);
        inference_modules.register_solely_specific_removal_module_predicate($$endingDate);
        inference_modules.inference_removal_module($REMOVAL_ENDING_DATE, $list287);
        utilities_macros.note_funcall_helper_function($sym288$REMOVAL_ALL_ENDING_DATE_INVERSE_OUTPUT_GENERATE);
        inference_modules.inference_removal_module($REMOVAL_ALL_ENDING_DATE_INVERSE, $list290);
        preference_modules.inference_preference_module($ALL_ENDING_DATE_INVERSE_POS, $list292);
        inference_modules.inference_removal_module($REMOVAL_NOT_ENDING_DATE, $list294);
        inference_modules.register_solely_specific_removal_module_predicate($$birthDate);
        inference_modules.inference_removal_module($REMOVAL_BIRTH_DATE, $list297);
        utilities_macros.note_funcall_helper_function($sym298$REMOVAL_ALL_BIRTH_DATE_INVERSE_OUTPUT_GENERATE);
        inference_modules.inference_removal_module($REMOVAL_ALL_BIRTH_DATE_INVERSE, $list300);
        preference_modules.inference_preference_module($ALL_BIRTH_DATE_INVERSE_POS, $list302);
        inference_modules.inference_removal_module($REMOVAL_NOT_BIRTH_DATE, $list304);
        inference_modules.register_solely_specific_removal_module_predicate($$dateOfDeath);
        inference_modules.inference_removal_module($REMOVAL_DATE_OF_DEATH, $list307);
        utilities_macros.note_funcall_helper_function($sym308$REMOVAL_ALL_DATE_OF_DEATH_INVERSE_OUTPUT_GENERATE);
        inference_modules.inference_removal_module($REMOVAL_ALL_DATE_OF_DEATH_INVERSE, $list310);
        preference_modules.inference_preference_module($ALL_DATE_OF_DEATH_INVERSE_POS, $list312);
        inference_modules.inference_removal_module($REMOVAL_NOT_DATE_OF_DEATH, $list314);
        inference_modules.register_solely_specific_removal_module_predicate($$temporallyStartedBy);
        inference_modules.inference_removal_module($REMOVAL_TEMPORALLY_STARTED_BY, $list317);
        utilities_macros.note_funcall_helper_function($sym318$REMOVAL_ALL_TEMPORALLY_STARTED_BY_OUTPUT_GENERATE);
        inference_modules.inference_removal_module($REMOVAL_ALL_TEMPORALLY_STARTED_BY, $list320);
        preference_modules.inference_preference_module($ALL_TEMPORALLY_STARTED_BY_POS, $list322);
        utilities_macros.note_funcall_helper_function($sym323$REMOVAL_ALL_TEMPORALLY_STARTED_BY_INVERSE_OUTPUT_GENERATE);
        inference_modules.inference_removal_module($REMOVAL_ALL_TEMPORALLY_STARTED_BY_INVERSE, $list325);
        preference_modules.inference_preference_module($ALL_TEMPORALLY_STARTED_BY_INVERSE_POS, $list327);
        inference_modules.inference_removal_module($REMOVAL_NOT_TEMPORALLY_STARTED_BY, $list329);
        inference_modules.register_solely_specific_removal_module_predicate($$temporallyFinishedBy);
        inference_modules.inference_removal_module($REMOVAL_TEMPORALLY_FINISHED_BY, $list332);
        utilities_macros.note_funcall_helper_function($sym333$REMOVAL_ALL_TEMPORALLY_FINISHED_BY_OUTPUT_GENERATE);
        inference_modules.inference_removal_module($REMOVAL_ALL_TEMPORALLY_FINISHED_BY, $list335);
        preference_modules.inference_preference_module($ALL_TEMPORALLY_FINISHED_BY_POS, $list337);
        utilities_macros.note_funcall_helper_function($sym338$REMOVAL_ALL_TEMPORALLY_FINISHED_BY_INVERSE_OUTPUT_GENERATE);
        inference_modules.inference_removal_module($REMOVAL_ALL_TEMPORALLY_FINISHED_BY_INVERSE, $list340);
        preference_modules.inference_preference_module($ALL_TEMPORALLY_FINISHED_BY_INVERSE_POS, $list342);
        inference_modules.inference_removal_module($REMOVAL_NOT_TEMPORALLY_FINISHED_BY, $list344);
        inference_modules.register_solely_specific_removal_module_predicate($$overlapsStart);
        inference_modules.inference_removal_module($REMOVAL_OVERLAPS_START, $list347);
        utilities_macros.note_funcall_helper_function($sym348$REMOVAL_ALL_OVERLAPS_START_OUTPUT_GENERATE);
        inference_modules.inference_removal_module($REMOVAL_ALL_OVERLAPS_START, $list350);
        preference_modules.inference_preference_module($ALL_OVERLAPS_START_POS, $list352);
        utilities_macros.note_funcall_helper_function($sym353$REMOVAL_ALL_OVERLAPS_START_INVERSE_OUTPUT_GENERATE);
        inference_modules.inference_removal_module($REMOVAL_ALL_OVERLAPS_START_INVERSE, $list355);
        preference_modules.inference_preference_module($ALL_OVERLAPS_START_INVERSE_POS, $list357);
        inference_modules.inference_removal_module($REMOVAL_NOT_OVERLAPS_START, $list359);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_removal_modules_sbhl_time_preds_file();
    }

    @Override
    public void initializeVariables() {
        init_removal_modules_sbhl_time_preds_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_removal_modules_sbhl_time_preds_file();
    }

    static {
        me = new removal_modules_sbhl_time_preds();
        $sbhl_time_generic_modules$ = null;
        $default_temporal_relation_check_cost$ = null;
        $default_all_temporal_relation_cost$ = null;
        $default_all_temporal_relation_inverse_cost$ = null;
        $default_not_temporal_relation_check_cost$ = null;
        $list0 = list(new SubLObject[] { makeKeyword("REMOVAL-LOOKUP-POS"), makeKeyword("REMOVAL-LOOKUP-NEG"), makeKeyword("REMOVAL-GENLPREDS-LOOKUP-POS"), makeKeyword("REMOVAL-GENLPREDS-LOOKUP-NEG"), makeKeyword("REMOVAL-GENLPREDS-PRED-INDEX-POS"), makeKeyword("REMOVAL-GENLPREDS-PRED-INDEX-NEG"),
                makeKeyword("REMOVAL-GENLINVERSE-LOOKUP-POS"), makeKeyword("REMOVAL-GENLINVERSE-LOOKUP-NEG"), makeKeyword("REMOVAL-GENLINVERSE-PRED-INDEX-POS"), makeKeyword("REMOVAL-GENLINVERSE-PRED-INDEX-NEG"), makeKeyword("REMOVAL-NEGATIONPREDS-LOOKUP"),
                makeKeyword("REMOVAL-NEGATIONINVERSE-LOOKUP"), makeKeyword("REMOVAL-REFLEXIVE-MAP"), makeKeyword("REMOVAL-IRREFLEXIVE-ONE-ARG"), makeKeyword("REMOVAL-IRREFLEXIVE-MAP"), makeKeyword("REMOVAL-COMPLETELY-DECIDABLE-NEG"), makeKeyword("REMOVAL-RELATION-ALL-INSTANCE-CHECK"),
                makeKeyword("REMOVAL-RELATION-ALL-INSTANCE-UNIFY"), makeKeyword("REMOVAL-RELATION-INSTANCE-ALL-CHECK"), makeKeyword("REMOVAL-RELATION-INSTANCE-ALL-UNIFY"), makeKeyword("REMOVAL-REFLEXIVE-BOTH"), makeKeyword("REMOVAL-REFLEXIVE-ONE-ARG"),
                makeKeyword("REMOVAL-FCP-WITH-GENL-PREDS-WRT-ARGS") });
        $SBHL_TIME_TOTAL_EXCLUSIVITY_POS = makeKeyword("SBHL-TIME-TOTAL-EXCLUSIVITY-POS");
        $SENSE = makeKeyword("SENSE");
        $POS = makeKeyword("POS");
        $ARITY = makeKeyword("ARITY");
        $REQUIRED_PATTERN = makeKeyword("REQUIRED-PATTERN");
        $list6 = list(makeKeyword("OR"), list(list(makeKeyword("TEST"), makeSymbol("SBHL-TIME-PREDICATE-P")), list(makeKeyword("TEST"), makeSymbol("DATE-INTERVAL-P")), list(makeKeyword("TEST"), makeSymbol("DATE-INTERVAL-P"))),
                list(list(makeKeyword("TEST"), makeSymbol("SBHL-TIME-PREDICATE-WITH-NO-SPEC-PRED-OR-INVERSE?")), list(makeKeyword("TEST"), makeSymbol("SBHL-TIME-INFERENCE-ARG-P")), list(makeKeyword("TEST"), makeSymbol("SBHL-TIME-INFERENCE-ARG-P"))));
        $EXCLUSIVE = makeKeyword("EXCLUSIVE");
        $sym8$TRUE = makeSymbol("TRUE");
        $SUPPLANTS = makeKeyword("SUPPLANTS");
        $list10 = list(makeKeyword("REQUIRED"), makeSymbol("FALSE"), makeKeyword("DOCUMENTATION"), makeString("An exclusivity module that identifies when SBHL time will totally handle a problem."));
        $list11 = list(new SubLObject[] { makeConstSym(("startsAfterStartingOf")), makeConstSym(("startsAfterEndingOf")), makeConstSym(("endsAfterStartingOf")), makeConstSym(("endsAfterEndingOf")), makeConstSym(("temporallySubsumes")), makeConstSym(("dateOfEvent")), makeConstSym(("cotemporal")),
                makeConstSym(("temporallyIntersects")), makeConstSym(("temporallyDisjoint")), makeConstSym(("temporalBoundsContain")), makeConstSym(("temporalBoundsSubsume")), makeConstSym(("temporalBoundsIdentical")), makeConstSym(("temporalBoundsIntersect")),
                makeConstSym(("temporallyCooriginating")), makeConstSym(("temporallyCoterminal")), makeConstSym(("contiguousAfter")), makeConstSym(("startsDuring")), makeConstSym(("endsDuring")), makeConstSym(("startingDate")), makeConstSym(("endingDate")), makeConstSym(("birthDate")),
                makeConstSym(("dateOfDeath")), makeConstSym(("temporallyStartedBy")), makeConstSym(("temporallyFinishedBy")), makeConstSym(("overlapsStart")) });
        $int$200 = makeInteger(200);
        $$startsAfterStartingOf = makeConstSym(("startsAfterStartingOf"));
        $REMOVAL_STARTS_AFTER_STARTING_OF = makeKeyword("REMOVAL-STARTS-AFTER-STARTING-OF");
        $list15 = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("startsAfterStartingOf")), makeKeyword("CHECK"), T, makeKeyword("REQUIRED-PATTERN"),
                list(makeConstSym(("startsAfterStartingOf")), list(makeKeyword("TEST"), makeSymbol("SBHL-TIME-INFERENCE-ARG-P")), list(makeKeyword("TEST"), makeSymbol("SBHL-TIME-INFERENCE-ARG-P"))), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-TEMPORAL-RELATION-CHECK-COST*"),
                makeKeyword("INPUT-EXTRACT-PATTERN"),
                list(makeKeyword("TEMPLATE"), list(makeConstSym(("startsAfterStartingOf")), list(makeKeyword("BIND"), makeSymbol("TEMPORAL-THING1")), list(makeKeyword("BIND"), makeSymbol("TEMPORAL-THING2"))),
                        list(list(makeKeyword("VALUE"), makeSymbol("TEMPORAL-THING1")), list(makeKeyword("VALUE"), makeSymbol("TEMPORAL-THING2")))),
                makeKeyword("INPUT-ENCODE-PATTERN"),
                ConsesLow.list(makeKeyword("TUPLE"), list(makeSymbol("TEMPORAL-THING1"), makeSymbol("TEMPORAL-THING2")),
                        list(list(makeKeyword("CALL"), makeSymbol("POSSIBLY-BIND-TEMPORAL-INDEXICAL-IN-OBJECT"), list(makeKeyword("VALUE"), makeSymbol("TEMPORAL-THING1"))),
                                list(makeKeyword("CALL"), makeSymbol("POSSIBLY-BIND-TEMPORAL-INDEXICAL-IN-OBJECT"), list(makeKeyword("VALUE"), makeSymbol("TEMPORAL-THING2"))))),
                makeKeyword("OUTPUT-CHECK-PATTERN"),
                list(makeKeyword("TUPLE"), list(makeSymbol("TEMPORAL-THING1"), makeSymbol("TEMPORAL-THING2")), list(makeKeyword("CALL"), makeSymbol("STARTS-AFTER-STARTING-OF?"), list(makeKeyword("VALUE"), makeSymbol("TEMPORAL-THING1")), list(makeKeyword("VALUE"), makeSymbol("TEMPORAL-THING2")))),
                makeKeyword("SUPPORT-MODULE"), makeKeyword("TIME"), makeKeyword("DOCUMENTATION"), makeString("(#$startsAfterStartingOf <TemporalThing> <TemporalThing>)") });
        $sym16$REMOVAL_ALL_STARTS_AFTER_STARTING_OF_OUTPUT_GENERATE = makeSymbol("REMOVAL-ALL-STARTS-AFTER-STARTING-OF-OUTPUT-GENERATE");
        $REMOVAL_ALL_STARTS_AFTER_STARTING_OF = makeKeyword("REMOVAL-ALL-STARTS-AFTER-STARTING-OF");
        $list18 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("startsAfterStartingOf")), makeKeyword("REQUIRED-PATTERN"),
                list(makeConstSym(("startsAfterStartingOf")), list(makeKeyword("TEST"), makeSymbol("SBHL-TIME-INFERENCE-ARG-P")), makeKeyword("NOT-FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-ALL-TEMPORAL-RELATION-COST*"), makeKeyword("COMPLETENESS"),
                makeKeyword("GROSSLY-INCOMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"),
                list(makeKeyword("TEMPLATE"), list(makeConstSym(("startsAfterStartingOf")), list(makeKeyword("BIND"), makeSymbol("TEMPORAL-THING")), makeKeyword("ANYTHING")), list(makeKeyword("VALUE"), makeSymbol("TEMPORAL-THING"))), makeKeyword("INPUT-ENCODE-PATTERN"),
                list(makeKeyword("CALL"), makeSymbol("POSSIBLY-BIND-TEMPORAL-INDEXICAL-IN-OBJECT"), makeKeyword("INPUT")), makeKeyword("OUTPUT-GENERATE-PATTERN"), list(makeKeyword("CALL"), makeSymbol("REMOVAL-ALL-STARTS-AFTER-STARTING-OF-OUTPUT-GENERATE"), makeKeyword("INPUT")),
                makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(makeConstSym(("startsAfterStartingOf")), list(makeKeyword("VALUE"), makeSymbol("TEMPORAL-THING")), makeKeyword("INPUT")), makeKeyword("SUPPORT-MODULE"), makeKeyword("TIME"), makeKeyword("DOCUMENTATION"),
                makeString("(#$startsAfterStartingOf <TemporalThing> <not-fully-bound>)") });
        $ALL_STARTS_AFTER_STARTING_OF_POS = makeKeyword("ALL-STARTS-AFTER-STARTING-OF-POS");
        $list20 = list(makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("startsAfterStartingOf")), makeKeyword("REQUIRED-PATTERN"), list(makeConstSym(("startsAfterStartingOf")), makeKeyword("ANYTHING"), makeKeyword("NOT-FULLY-BOUND")),
                makeKeyword("PREFERENCE-LEVEL"), makeKeyword("GROSSLY-DISPREFERRED"));
        $sym21$REMOVAL_ALL_STARTS_AFTER_STARTING_OF_INVERSE_OUTPUT_GENERATE = makeSymbol("REMOVAL-ALL-STARTS-AFTER-STARTING-OF-INVERSE-OUTPUT-GENERATE");
        $REMOVAL_ALL_STARTS_AFTER_STARTING_OF_INVERSE = makeKeyword("REMOVAL-ALL-STARTS-AFTER-STARTING-OF-INVERSE");
        $list23 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("startsAfterStartingOf")), makeKeyword("REQUIRED-PATTERN"),
                list(makeConstSym(("startsAfterStartingOf")), makeKeyword("NOT-FULLY-BOUND"), list(makeKeyword("TEST"), makeSymbol("SBHL-TIME-INFERENCE-ARG-P"))), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-ALL-TEMPORAL-RELATION-INVERSE-COST*"), makeKeyword("COMPLETENESS"),
                makeKeyword("GROSSLY-INCOMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"),
                list(makeKeyword("TEMPLATE"), list(makeConstSym(("startsAfterStartingOf")), makeKeyword("ANYTHING"), list(makeKeyword("BIND"), makeSymbol("TEMPORAL-THING"))), list(makeKeyword("VALUE"), makeSymbol("TEMPORAL-THING"))), makeKeyword("INPUT-ENCODE-PATTERN"),
                list(makeKeyword("CALL"), makeSymbol("POSSIBLY-BIND-TEMPORAL-INDEXICAL-IN-OBJECT"), makeKeyword("INPUT")), makeKeyword("OUTPUT-GENERATE-PATTERN"), list(makeKeyword("CALL"), makeSymbol("REMOVAL-ALL-STARTS-AFTER-STARTING-OF-INVERSE-OUTPUT-GENERATE"), makeKeyword("INPUT")),
                makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(makeConstSym(("startsAfterStartingOf")), makeKeyword("INPUT"), list(makeKeyword("VALUE"), makeSymbol("TEMPORAL-THING"))), makeKeyword("SUPPORT-MODULE"), makeKeyword("TIME"), makeKeyword("DOCUMENTATION"),
                makeString("(#$startsAfterStartingOf <not-fully-bound> <TemporalThing>)") });
        $ALL_STARTS_AFTER_STARTING_OF_INVERSE_POS = makeKeyword("ALL-STARTS-AFTER-STARTING-OF-INVERSE-POS");
        $list25 = list(makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("startsAfterStartingOf")), makeKeyword("REQUIRED-PATTERN"), list(makeConstSym(("startsAfterStartingOf")), makeKeyword("NOT-FULLY-BOUND"), makeKeyword("ANYTHING")),
                makeKeyword("PREFERENCE-LEVEL"), makeKeyword("GROSSLY-DISPREFERRED"));
        $MINIMIZE = makeKeyword("MINIMIZE");
        $TIME = makeKeyword("TIME");
        $REMOVAL_NOT_STARTS_AFTER_STARTING_OF = makeKeyword("REMOVAL-NOT-STARTS-AFTER-STARTING-OF");
        $list29 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("PREDICATE"), makeConstSym(("startsAfterStartingOf")), makeKeyword("REQUIRED-PATTERN"),
                list(makeConstSym(("startsAfterStartingOf")), list(makeKeyword("TEST"), makeSymbol("SBHL-TIME-INFERENCE-ARG-P")), list(makeKeyword("TEST"), makeSymbol("SBHL-TIME-INFERENCE-ARG-P"))), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-NOT-TEMPORAL-RELATION-CHECK-COST*"),
                makeKeyword("EXPAND"), makeSymbol("REMOVAL-NOT-STARTS-AFTER-STARTING-OF-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$not (#$startsAfterStartingOf <TemporalThing> <TemporalThing>))") });
        $$startsAfterEndingOf = makeConstSym(("startsAfterEndingOf"));
        $REMOVAL_STARTS_AFTER_ENDING_OF = makeKeyword("REMOVAL-STARTS-AFTER-ENDING-OF");
        $list32 = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("startsAfterEndingOf")), makeKeyword("CHECK"), T, makeKeyword("REQUIRED-PATTERN"),
                list(makeConstSym(("startsAfterEndingOf")), list(makeKeyword("TEST"), makeSymbol("SBHL-TIME-INFERENCE-ARG-P")), list(makeKeyword("TEST"), makeSymbol("SBHL-TIME-INFERENCE-ARG-P"))), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-TEMPORAL-RELATION-CHECK-COST*"),
                makeKeyword("INPUT-EXTRACT-PATTERN"),
                list(makeKeyword("TEMPLATE"), list(makeConstSym(("startsAfterEndingOf")), list(makeKeyword("BIND"), makeSymbol("TEMPORAL-THING1")), list(makeKeyword("BIND"), makeSymbol("TEMPORAL-THING2"))),
                        list(list(makeKeyword("VALUE"), makeSymbol("TEMPORAL-THING1")), list(makeKeyword("VALUE"), makeSymbol("TEMPORAL-THING2")))),
                makeKeyword("INPUT-ENCODE-PATTERN"),
                ConsesLow.list(makeKeyword("TUPLE"), list(makeSymbol("TEMPORAL-THING1"), makeSymbol("TEMPORAL-THING2")),
                        list(list(makeKeyword("CALL"), makeSymbol("POSSIBLY-BIND-TEMPORAL-INDEXICAL-IN-OBJECT"), list(makeKeyword("VALUE"), makeSymbol("TEMPORAL-THING1"))),
                                list(makeKeyword("CALL"), makeSymbol("POSSIBLY-BIND-TEMPORAL-INDEXICAL-IN-OBJECT"), list(makeKeyword("VALUE"), makeSymbol("TEMPORAL-THING2"))))),
                makeKeyword("OUTPUT-CHECK-PATTERN"),
                list(makeKeyword("TUPLE"), list(makeSymbol("TEMPORAL-THING1"), makeSymbol("TEMPORAL-THING2")), list(makeKeyword("CALL"), makeSymbol("STARTS-AFTER-ENDING-OF?"), list(makeKeyword("VALUE"), makeSymbol("TEMPORAL-THING1")), list(makeKeyword("VALUE"), makeSymbol("TEMPORAL-THING2")))),
                makeKeyword("SUPPORT-MODULE"), makeKeyword("TIME"), makeKeyword("DOCUMENTATION"), makeString("(#$startsAfterEndingOf <TemporalThing> <TemporalThing>)") });
        $sym33$REMOVAL_ALL_STARTS_AFTER_ENDING_OF_OUTPUT_GENERATE = makeSymbol("REMOVAL-ALL-STARTS-AFTER-ENDING-OF-OUTPUT-GENERATE");
        $REMOVAL_ALL_STARTS_AFTER_ENDING_OF = makeKeyword("REMOVAL-ALL-STARTS-AFTER-ENDING-OF");
        $list35 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("startsAfterEndingOf")), makeKeyword("REQUIRED-PATTERN"),
                list(makeConstSym(("startsAfterEndingOf")), list(makeKeyword("TEST"), makeSymbol("SBHL-TIME-INFERENCE-ARG-P")), makeKeyword("NOT-FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-ALL-TEMPORAL-RELATION-COST*"), makeKeyword("COMPLETENESS"),
                makeKeyword("GROSSLY-INCOMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"),
                list(makeKeyword("TEMPLATE"), list(makeConstSym(("startsAfterEndingOf")), list(makeKeyword("BIND"), makeSymbol("TEMPORAL-THING")), makeKeyword("ANYTHING")), list(makeKeyword("VALUE"), makeSymbol("TEMPORAL-THING"))), makeKeyword("INPUT-ENCODE-PATTERN"),
                list(makeKeyword("CALL"), makeSymbol("POSSIBLY-BIND-TEMPORAL-INDEXICAL-IN-OBJECT"), makeKeyword("INPUT")), makeKeyword("OUTPUT-GENERATE-PATTERN"), list(makeKeyword("CALL"), makeSymbol("REMOVAL-ALL-STARTS-AFTER-ENDING-OF-OUTPUT-GENERATE"), makeKeyword("INPUT")),
                makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(makeConstSym(("startsAfterEndingOf")), list(makeKeyword("VALUE"), makeSymbol("TEMPORAL-THING")), makeKeyword("INPUT")), makeKeyword("SUPPORT-MODULE"), makeKeyword("TIME"), makeKeyword("DOCUMENTATION"),
                makeString("(#$startsAfterEndingOf <TemporalThing> <not-fully-bound>)") });
        $ALL_STARTS_AFTER_ENDING_OF_POS = makeKeyword("ALL-STARTS-AFTER-ENDING-OF-POS");
        $list37 = list(makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("startsAfterEndingOf")), makeKeyword("REQUIRED-PATTERN"), list(makeConstSym(("startsAfterEndingOf")), makeKeyword("ANYTHING"), makeKeyword("NOT-FULLY-BOUND")), makeKeyword("PREFERENCE-LEVEL"),
                makeKeyword("GROSSLY-DISPREFERRED"));
        $sym38$REMOVAL_ALL_STARTS_AFTER_ENDING_OF_INVERSE_OUTPUT_GENERATE = makeSymbol("REMOVAL-ALL-STARTS-AFTER-ENDING-OF-INVERSE-OUTPUT-GENERATE");
        $REMOVAL_ALL_STARTS_AFTER_ENDING_OF_INVERSE = makeKeyword("REMOVAL-ALL-STARTS-AFTER-ENDING-OF-INVERSE");
        $list40 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("startsAfterEndingOf")), makeKeyword("REQUIRED-PATTERN"),
                list(makeConstSym(("startsAfterEndingOf")), makeKeyword("NOT-FULLY-BOUND"), list(makeKeyword("TEST"), makeSymbol("SBHL-TIME-INFERENCE-ARG-P"))), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-ALL-TEMPORAL-RELATION-INVERSE-COST*"), makeKeyword("COMPLETENESS"),
                makeKeyword("GROSSLY-INCOMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"),
                list(makeKeyword("TEMPLATE"), list(makeConstSym(("startsAfterEndingOf")), makeKeyword("ANYTHING"), list(makeKeyword("BIND"), makeSymbol("TEMPORAL-THING"))), list(makeKeyword("VALUE"), makeSymbol("TEMPORAL-THING"))), makeKeyword("INPUT-ENCODE-PATTERN"),
                list(makeKeyword("CALL"), makeSymbol("POSSIBLY-BIND-TEMPORAL-INDEXICAL-IN-OBJECT"), makeKeyword("INPUT")), makeKeyword("OUTPUT-GENERATE-PATTERN"), list(makeKeyword("CALL"), makeSymbol("REMOVAL-ALL-STARTS-AFTER-ENDING-OF-INVERSE-OUTPUT-GENERATE"), makeKeyword("INPUT")),
                makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(makeConstSym(("startsAfterEndingOf")), makeKeyword("INPUT"), list(makeKeyword("VALUE"), makeSymbol("TEMPORAL-THING"))), makeKeyword("SUPPORT-MODULE"), makeKeyword("TIME"), makeKeyword("DOCUMENTATION"),
                makeString("(#$startsAfterEndingOf <not-fully-bound> <TemporalThing>)") });
        $ALL_STARTS_AFTER_ENDING_OF_INVERSE_POS = makeKeyword("ALL-STARTS-AFTER-ENDING-OF-INVERSE-POS");
        $list42 = list(makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("startsAfterEndingOf")), makeKeyword("REQUIRED-PATTERN"), list(makeConstSym(("startsAfterEndingOf")), makeKeyword("NOT-FULLY-BOUND"), makeKeyword("ANYTHING")), makeKeyword("PREFERENCE-LEVEL"),
                makeKeyword("GROSSLY-DISPREFERRED"));
        $REMOVAL_NOT_STARTS_AFTER_ENDING_OF = makeKeyword("REMOVAL-NOT-STARTS-AFTER-ENDING-OF");
        $list44 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("PREDICATE"), makeConstSym(("startsAfterEndingOf")), makeKeyword("REQUIRED-PATTERN"),
                list(makeConstSym(("startsAfterEndingOf")), list(makeKeyword("TEST"), makeSymbol("SBHL-TIME-INFERENCE-ARG-P")), list(makeKeyword("TEST"), makeSymbol("SBHL-TIME-INFERENCE-ARG-P"))), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-NOT-TEMPORAL-RELATION-CHECK-COST*"),
                makeKeyword("EXPAND"), makeSymbol("REMOVAL-NOT-STARTS-AFTER-ENDING-OF-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$not (#$startsAfterEndingOf <TemporalThing> <TemporalThing>))") });
        $$endsAfterStartingOf = makeConstSym(("endsAfterStartingOf"));
        $REMOVAL_ENDS_AFTER_STARTING_OF = makeKeyword("REMOVAL-ENDS-AFTER-STARTING-OF");
        $list47 = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("endsAfterStartingOf")), makeKeyword("CHECK"), T, makeKeyword("REQUIRED-PATTERN"),
                list(makeConstSym(("endsAfterStartingOf")), list(makeKeyword("TEST"), makeSymbol("SBHL-TIME-INFERENCE-ARG-P")), list(makeKeyword("TEST"), makeSymbol("SBHL-TIME-INFERENCE-ARG-P"))), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-TEMPORAL-RELATION-CHECK-COST*"),
                makeKeyword("INPUT-EXTRACT-PATTERN"),
                list(makeKeyword("TEMPLATE"), list(makeConstSym(("endsAfterStartingOf")), list(makeKeyword("BIND"), makeSymbol("TEMPORAL-THING1")), list(makeKeyword("BIND"), makeSymbol("TEMPORAL-THING2"))),
                        list(list(makeKeyword("VALUE"), makeSymbol("TEMPORAL-THING1")), list(makeKeyword("VALUE"), makeSymbol("TEMPORAL-THING2")))),
                makeKeyword("INPUT-ENCODE-PATTERN"),
                ConsesLow.list(makeKeyword("TUPLE"), list(makeSymbol("TEMPORAL-THING1"), makeSymbol("TEMPORAL-THING2")),
                        list(list(makeKeyword("CALL"), makeSymbol("POSSIBLY-BIND-TEMPORAL-INDEXICAL-IN-OBJECT"), list(makeKeyword("VALUE"), makeSymbol("TEMPORAL-THING1"))),
                                list(makeKeyword("CALL"), makeSymbol("POSSIBLY-BIND-TEMPORAL-INDEXICAL-IN-OBJECT"), list(makeKeyword("VALUE"), makeSymbol("TEMPORAL-THING2"))))),
                makeKeyword("OUTPUT-CHECK-PATTERN"),
                list(makeKeyword("TUPLE"), list(makeSymbol("TEMPORAL-THING1"), makeSymbol("TEMPORAL-THING2")), list(makeKeyword("CALL"), makeSymbol("ENDS-AFTER-STARTING-OF?"), list(makeKeyword("VALUE"), makeSymbol("TEMPORAL-THING1")), list(makeKeyword("VALUE"), makeSymbol("TEMPORAL-THING2")))),
                makeKeyword("SUPPORT-MODULE"), makeKeyword("TIME"), makeKeyword("DOCUMENTATION"), makeString("(#$endsAfterStartingOf <TemporalThing> <TemporalThing>)") });
        $sym48$REMOVAL_ALL_ENDS_AFTER_STARTING_OF_OUTPUT_GENERATE = makeSymbol("REMOVAL-ALL-ENDS-AFTER-STARTING-OF-OUTPUT-GENERATE");
        $REMOVAL_ALL_ENDS_AFTER_STARTING_OF = makeKeyword("REMOVAL-ALL-ENDS-AFTER-STARTING-OF");
        $list50 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("endsAfterStartingOf")), makeKeyword("REQUIRED-PATTERN"),
                list(makeConstSym(("endsAfterStartingOf")), list(makeKeyword("TEST"), makeSymbol("SBHL-TIME-INFERENCE-ARG-P")), makeKeyword("NOT-FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-ALL-TEMPORAL-RELATION-COST*"), makeKeyword("COMPLETENESS"),
                makeKeyword("GROSSLY-INCOMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"),
                list(makeKeyword("TEMPLATE"), list(makeConstSym(("endsAfterStartingOf")), list(makeKeyword("BIND"), makeSymbol("TEMPORAL-THING")), makeKeyword("ANYTHING")), list(makeKeyword("VALUE"), makeSymbol("TEMPORAL-THING"))), makeKeyword("INPUT-ENCODE-PATTERN"),
                list(makeKeyword("CALL"), makeSymbol("POSSIBLY-BIND-TEMPORAL-INDEXICAL-IN-OBJECT"), makeKeyword("INPUT")), makeKeyword("OUTPUT-GENERATE-PATTERN"), list(makeKeyword("CALL"), makeSymbol("REMOVAL-ALL-ENDS-AFTER-STARTING-OF-OUTPUT-GENERATE"), makeKeyword("INPUT")),
                makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(makeConstSym(("endsAfterStartingOf")), list(makeKeyword("VALUE"), makeSymbol("TEMPORAL-THING1")), makeKeyword("INPUT")), makeKeyword("SUPPORT-MODULE"), makeKeyword("TIME"), makeKeyword("DOCUMENTATION"),
                makeString("(#$endsAfterStartingOf <TemporalThing> <not-fully-bound>)") });
        $ALL_ENDS_AFTER_STARTING_OF_POS = makeKeyword("ALL-ENDS-AFTER-STARTING-OF-POS");
        $list52 = list(makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("endsAfterStartingOf")), makeKeyword("REQUIRED-PATTERN"), list(makeConstSym(("endsAfterStartingOf")), makeKeyword("ANYTHING"), makeKeyword("NOT-FULLY-BOUND")), makeKeyword("PREFERENCE-LEVEL"),
                makeKeyword("GROSSLY-DISPREFERRED"));
        $sym53$REMOVAL_ALL_ENDS_AFTER_STARTING_OF_INVERSE_OUTPUT_GENERATE = makeSymbol("REMOVAL-ALL-ENDS-AFTER-STARTING-OF-INVERSE-OUTPUT-GENERATE");
        $REMOVAL_ALL_ENDS_AFTER_STARTING_OF_INVERSE = makeKeyword("REMOVAL-ALL-ENDS-AFTER-STARTING-OF-INVERSE");
        $list55 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("endsAfterStartingOf")), makeKeyword("REQUIRED-PATTERN"),
                list(makeConstSym(("endsAfterStartingOf")), makeKeyword("NOT-FULLY-BOUND"), list(makeKeyword("TEST"), makeSymbol("SBHL-TIME-INFERENCE-ARG-P"))), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-ALL-TEMPORAL-RELATION-INVERSE-COST*"), makeKeyword("COMPLETENESS"),
                makeKeyword("GROSSLY-INCOMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"),
                list(makeKeyword("TEMPLATE"), list(makeConstSym(("endsAfterStartingOf")), makeKeyword("ANYTHING"), list(makeKeyword("BIND"), makeSymbol("TEMPORAL-THING"))), list(makeKeyword("VALUE"), makeSymbol("TEMPORAL-THING"))), makeKeyword("INPUT-ENCODE-PATTERN"),
                list(makeKeyword("CALL"), makeSymbol("POSSIBLY-BIND-TEMPORAL-INDEXICAL-IN-OBJECT"), makeKeyword("INPUT")), makeKeyword("OUTPUT-GENERATE-PATTERN"), list(makeKeyword("CALL"), makeSymbol("REMOVAL-ALL-ENDS-AFTER-STARTING-OF-INVERSE-OUTPUT-GENERATE"), makeKeyword("INPUT")),
                makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(makeConstSym(("endsAfterStartingOf")), makeKeyword("INPUT"), list(makeKeyword("VALUE"), makeSymbol("TEMPORAL-THING"))), makeKeyword("SUPPORT-MODULE"), makeKeyword("TIME"), makeKeyword("DOCUMENTATION"),
                makeString("(#$endsAfterStartingOf <not-fully-bound> <TemporalThing>)") });
        $ALL_ENDS_AFTER_STARTING_OF_INVERSE_POS = makeKeyword("ALL-ENDS-AFTER-STARTING-OF-INVERSE-POS");
        $list57 = list(makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("endsAfterStartingOf")), makeKeyword("REQUIRED-PATTERN"), list(makeConstSym(("endsAfterStartingOf")), makeKeyword("NOT-FULLY-BOUND"), makeKeyword("ANYTHING")), makeKeyword("PREFERENCE-LEVEL"),
                makeKeyword("GROSSLY-DISPREFERRED"));
        $REMOVAL_NOT_ENDS_AFTER_STARTING_OF = makeKeyword("REMOVAL-NOT-ENDS-AFTER-STARTING-OF");
        $list59 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("PREDICATE"), makeConstSym(("endsAfterStartingOf")), makeKeyword("REQUIRED-PATTERN"),
                list(makeConstSym(("endsAfterStartingOf")), list(makeKeyword("TEST"), makeSymbol("SBHL-TIME-INFERENCE-ARG-P")), list(makeKeyword("TEST"), makeSymbol("SBHL-TIME-INFERENCE-ARG-P"))), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-NOT-TEMPORAL-RELATION-CHECK-COST*"),
                makeKeyword("EXPAND"), makeSymbol("REMOVAL-NOT-ENDS-AFTER-STARTING-OF-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$not (#$endsAfterStartingOf <TemporalThing> <TemporalThing>))") });
        $$endsAfterEndingOf = makeConstSym(("endsAfterEndingOf"));
        $REMOVAL_ENDS_AFTER_ENDING_OF = makeKeyword("REMOVAL-ENDS-AFTER-ENDING-OF");
        $list62 = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("endsAfterEndingOf")), makeKeyword("CHECK"), T, makeKeyword("REQUIRED-PATTERN"),
                list(makeConstSym(("endsAfterEndingOf")), list(makeKeyword("TEST"), makeSymbol("SBHL-TIME-INFERENCE-ARG-P")), list(makeKeyword("TEST"), makeSymbol("SBHL-TIME-INFERENCE-ARG-P"))), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-TEMPORAL-RELATION-CHECK-COST*"),
                makeKeyword("INPUT-EXTRACT-PATTERN"),
                list(makeKeyword("TEMPLATE"), list(makeConstSym(("endsAfterEndingOf")), ConsesLow.list(makeKeyword("BIND"), makeSymbol("TEMPORAL-THING1")), list(makeKeyword("BIND"), makeSymbol("TEMPORAL-THING2"))),
                        list(list(makeKeyword("VALUE"), makeSymbol("TEMPORAL-THING1")), list(makeKeyword("VALUE"), makeSymbol("TEMPORAL-THING2")))),
                makeKeyword("INPUT-ENCODE-PATTERN"),
                ConsesLow.list(makeKeyword("TUPLE"), list(makeSymbol("TEMPORAL-THING1"), makeSymbol("TEMPORAL-THING2")),
                        list(list(makeKeyword("CALL"), makeSymbol("POSSIBLY-BIND-TEMPORAL-INDEXICAL-IN-OBJECT"), list(makeKeyword("VALUE"), makeSymbol("TEMPORAL-THING1"))),
                                list(makeKeyword("CALL"), makeSymbol("POSSIBLY-BIND-TEMPORAL-INDEXICAL-IN-OBJECT"), list(makeKeyword("VALUE"), makeSymbol("TEMPORAL-THING2"))))),
                makeKeyword("OUTPUT-CHECK-PATTERN"),
                list(makeKeyword("TUPLE"), list(makeSymbol("TEMPORAL-THING1"), makeSymbol("TEMPORAL-THING2")), list(makeKeyword("CALL"), makeSymbol("ENDS-AFTER-ENDING-OF?"), list(makeKeyword("VALUE"), makeSymbol("TEMPORAL-THING1")), list(makeKeyword("VALUE"), makeSymbol("TEMPORAL-THING2")))),
                makeKeyword("SUPPORT-MODULE"), makeKeyword("TIME"), makeKeyword("DOCUMENTATION"), makeString("(#$endsAfterEndingOf <TemporalThing> <TemporalThing>)") });
        $sym63$REMOVAL_ALL_ENDS_AFTER_ENDING_OF_OUTPUT_GENERATE = makeSymbol("REMOVAL-ALL-ENDS-AFTER-ENDING-OF-OUTPUT-GENERATE");
        $REMOVAL_ALL_ENDS_AFTER_ENDING_OF = makeKeyword("REMOVAL-ALL-ENDS-AFTER-ENDING-OF");
        $list65 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("endsAfterEndingOf")), makeKeyword("REQUIRED-PATTERN"),
                list(makeConstSym(("endsAfterEndingOf")), list(makeKeyword("TEST"), makeSymbol("SBHL-TIME-INFERENCE-ARG-P")), makeKeyword("NOT-FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-ALL-TEMPORAL-RELATION-COST*"), makeKeyword("COMPLETENESS"),
                makeKeyword("GROSSLY-INCOMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"),
                list(makeKeyword("TEMPLATE"), list(makeConstSym(("endsAfterEndingOf")), list(makeKeyword("BIND"), makeSymbol("TEMPORAL-THING")), makeKeyword("ANYTHING")), list(makeKeyword("VALUE"), makeSymbol("TEMPORAL-THING"))), makeKeyword("INPUT-ENCODE-PATTERN"),
                list(makeKeyword("CALL"), makeSymbol("POSSIBLY-BIND-TEMPORAL-INDEXICAL-IN-OBJECT"), makeKeyword("INPUT")), makeKeyword("OUTPUT-GENERATE-PATTERN"), list(makeKeyword("CALL"), makeSymbol("REMOVAL-ALL-ENDS-AFTER-ENDING-OF-OUTPUT-GENERATE"), makeKeyword("INPUT")),
                makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(makeConstSym(("endsAfterEndingOf")), list(makeKeyword("VALUE"), makeSymbol("TEMPORAL-THING")), makeKeyword("INPUT")), makeKeyword("SUPPORT-MODULE"), makeKeyword("TIME"), makeKeyword("DOCUMENTATION"),
                makeString("(#$endsAfterEndingOf <TemporalThing> <not-fully-bound>)") });
        $ALL_ENDS_AFTER_ENDING_OF_POS = makeKeyword("ALL-ENDS-AFTER-ENDING-OF-POS");
        $list67 = list(makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("endsAfterEndingOf")), makeKeyword("REQUIRED-PATTERN"), list(makeConstSym(("endsAfterEndingOf")), makeKeyword("ANYTHING"), makeKeyword("NOT-FULLY-BOUND")), makeKeyword("PREFERENCE-LEVEL"),
                makeKeyword("GROSSLY-DISPREFERRED"));
        $sym68$REMOVAL_ALL_ENDS_AFTER_ENDING_OF_INVERSE_OUTPUT_GENERATE = makeSymbol("REMOVAL-ALL-ENDS-AFTER-ENDING-OF-INVERSE-OUTPUT-GENERATE");
        $REMOVAL_ALL_ENDS_AFTER_ENDING_OF_INVERSE = makeKeyword("REMOVAL-ALL-ENDS-AFTER-ENDING-OF-INVERSE");
        $list70 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("endsAfterEndingOf")), makeKeyword("REQUIRED-PATTERN"),
                list(makeConstSym(("endsAfterEndingOf")), makeKeyword("NOT-FULLY-BOUND"), list(makeKeyword("TEST"), makeSymbol("SBHL-TIME-INFERENCE-ARG-P"))), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-ALL-TEMPORAL-RELATION-INVERSE-COST*"), makeKeyword("COMPLETENESS"),
                makeKeyword("GROSSLY-INCOMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"),
                list(makeKeyword("TEMPLATE"), list(makeConstSym(("endsAfterEndingOf")), makeKeyword("ANYTHING"), list(makeKeyword("BIND"), makeSymbol("TEMPORAL-THING"))), list(makeKeyword("VALUE"), makeSymbol("TEMPORAL-THING"))), makeKeyword("INPUT-ENCODE-PATTERN"),
                list(makeKeyword("CALL"), makeSymbol("POSSIBLY-BIND-TEMPORAL-INDEXICAL-IN-OBJECT"), makeKeyword("INPUT")), makeKeyword("OUTPUT-GENERATE-PATTERN"), list(makeKeyword("CALL"), makeSymbol("REMOVAL-ALL-ENDS-AFTER-ENDING-OF-INVERSE-OUTPUT-GENERATE"), makeKeyword("INPUT")),
                makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(makeConstSym(("endsAfterEndingOf")), makeKeyword("INPUT"), list(makeKeyword("VALUE"), makeSymbol("TEMPORAL-THING"))), makeKeyword("SUPPORT-MODULE"), makeKeyword("TIME"), makeKeyword("DOCUMENTATION"),
                makeString("(#$endsAfterEndingOf <not-fully-bound> <TemporalThing>)") });
        $ALL_ENDS_AFTER_ENDING_OF_INVERSE_POS = makeKeyword("ALL-ENDS-AFTER-ENDING-OF-INVERSE-POS");
        $list72 = list(makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("endsAfterEndingOf")), makeKeyword("REQUIRED-PATTERN"), list(makeConstSym(("endsAfterEndingOf")), makeKeyword("NOT-FULLY-BOUND"), makeKeyword("ANYTHING")), makeKeyword("PREFERENCE-LEVEL"),
                makeKeyword("GROSSLY-DISPREFERRED"));
        $REMOVAL_NOT_ENDS_AFTER_ENDING_OF = makeKeyword("REMOVAL-NOT-ENDS-AFTER-ENDING-OF");
        $list74 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("PREDICATE"), makeConstSym(("endsAfterEndingOf")), makeKeyword("REQUIRED-PATTERN"),
                list(makeConstSym(("endsAfterEndingOf")), list(makeKeyword("TEST"), makeSymbol("SBHL-TIME-INFERENCE-ARG-P")), list(makeKeyword("TEST"), makeSymbol("SBHL-TIME-INFERENCE-ARG-P"))), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-NOT-TEMPORAL-RELATION-CHECK-COST*"),
                makeKeyword("EXPAND"), makeSymbol("REMOVAL-NOT-ENDS-AFTER-ENDING-OF-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$not (#$endsAfterEndingOf <TemporalThing> <TemporalThing>))") });
        $$temporallySubsumes = makeConstSym(("temporallySubsumes"));
        $REMOVAL_TEMPORALLY_SUBSUMES = makeKeyword("REMOVAL-TEMPORALLY-SUBSUMES");
        $list77 = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("temporallySubsumes")), makeKeyword("CHECK"), T, makeKeyword("REQUIRED-PATTERN"),
                list(makeConstSym(("temporallySubsumes")), list(makeKeyword("TEST"), makeSymbol("SBHL-TIME-INFERENCE-ARG-P")), list(makeKeyword("TEST"), makeSymbol("SBHL-TIME-INFERENCE-ARG-P"))), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-TEMPORAL-RELATION-CHECK-COST*"),
                makeKeyword("INPUT-EXTRACT-PATTERN"),
                list(makeKeyword("TEMPLATE"), list(makeConstSym(("temporallySubsumes")), ConsesLow.list(makeKeyword("BIND"), makeSymbol("TEMPORAL-THING1")), list(makeKeyword("BIND"), makeSymbol("TEMPORAL-THING2"))),
                        list(list(makeKeyword("VALUE"), makeSymbol("TEMPORAL-THING1")), list(makeKeyword("VALUE"), makeSymbol("TEMPORAL-THING2")))),
                makeKeyword("INPUT-ENCODE-PATTERN"),
                ConsesLow.list(makeKeyword("TUPLE"), list(makeSymbol("TEMPORAL-THING1"), makeSymbol("TEMPORAL-THING2")),
                        list(list(makeKeyword("CALL"), makeSymbol("POSSIBLY-BIND-TEMPORAL-INDEXICAL-IN-OBJECT"), list(makeKeyword("VALUE"), makeSymbol("TEMPORAL-THING1"))),
                                list(makeKeyword("CALL"), makeSymbol("POSSIBLY-BIND-TEMPORAL-INDEXICAL-IN-OBJECT"), list(makeKeyword("VALUE"), makeSymbol("TEMPORAL-THING2"))))),
                makeKeyword("OUTPUT-CHECK-PATTERN"),
                list(makeKeyword("TUPLE"), list(makeSymbol("TEMPORAL-THING1"), makeSymbol("TEMPORAL-THING2")), list(makeKeyword("CALL"), makeSymbol("TEMPORALLY-SUBSUMES?"), list(makeKeyword("VALUE"), makeSymbol("TEMPORAL-THING1")), list(makeKeyword("VALUE"), makeSymbol("TEMPORAL-THING2")))),
                makeKeyword("SUPPORT-MODULE"), makeKeyword("TIME"), makeKeyword("DOCUMENTATION"), makeString("(#$temporallySubsumes <TemporalThing> <TemporalThing>)") });
        $sym78$REMOVAL_ALL_TEMPORALLY_SUBSUMES_OUTPUT_GENERATE = makeSymbol("REMOVAL-ALL-TEMPORALLY-SUBSUMES-OUTPUT-GENERATE");
        $REMOVAL_ALL_TEMPORALLY_SUBSUMES = makeKeyword("REMOVAL-ALL-TEMPORALLY-SUBSUMES");
        $list80 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("temporallySubsumes")), makeKeyword("REQUIRED-PATTERN"),
                list(makeConstSym(("temporallySubsumes")), list(makeKeyword("TEST"), makeSymbol("SBHL-TIME-INFERENCE-ARG-P")), makeKeyword("NOT-FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-ALL-TEMPORAL-RELATION-COST*"), makeKeyword("COMPLETENESS"),
                makeKeyword("GROSSLY-INCOMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"),
                list(makeKeyword("TEMPLATE"), list(makeConstSym(("temporallySubsumes")), list(makeKeyword("BIND"), makeSymbol("TEMPORAL-THING")), makeKeyword("ANYTHING")), list(makeKeyword("VALUE"), makeSymbol("TEMPORAL-THING"))), makeKeyword("INPUT-ENCODE-PATTERN"),
                list(makeKeyword("CALL"), makeSymbol("POSSIBLY-BIND-TEMPORAL-INDEXICAL-IN-OBJECT"), makeKeyword("INPUT")), makeKeyword("OUTPUT-GENERATE-PATTERN"), list(makeKeyword("CALL"), makeSymbol("REMOVAL-ALL-TEMPORALLY-SUBSUMES-OUTPUT-GENERATE"), makeKeyword("INPUT")),
                makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(makeConstSym(("temporallySubsumes")), list(makeKeyword("VALUE"), makeSymbol("TEMPORAL-THING")), makeKeyword("INPUT")), makeKeyword("SUPPORT-MODULE"), makeKeyword("TIME"), makeKeyword("DOCUMENTATION"),
                makeString("(#$temporallySubsumes <TemporalThing> <not-fully-bound>)") });
        $ALL_TEMPORALLY_SUBSUMES_POS = makeKeyword("ALL-TEMPORALLY-SUBSUMES-POS");
        $list82 = list(makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("temporallySubsumes")), makeKeyword("REQUIRED-PATTERN"), list(makeConstSym(("temporallySubsumes")), makeKeyword("ANYTHING"), makeKeyword("NOT-FULLY-BOUND")), makeKeyword("PREFERENCE-LEVEL"),
                makeKeyword("GROSSLY-DISPREFERRED"));
        $sym83$REMOVAL_ALL_TEMPORALLY_SUBSUMES_INVERSE_OUTPUT_GENERATE = makeSymbol("REMOVAL-ALL-TEMPORALLY-SUBSUMES-INVERSE-OUTPUT-GENERATE");
        $REMOVAL_ALL_TEMPORALLY_SUBSUMES_INVERSE = makeKeyword("REMOVAL-ALL-TEMPORALLY-SUBSUMES-INVERSE");
        $list85 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("temporallySubsumes")), makeKeyword("REQUIRED-PATTERN"),
                list(makeConstSym(("temporallySubsumes")), makeKeyword("NOT-FULLY-BOUND"), list(makeKeyword("TEST"), makeSymbol("SBHL-TIME-INFERENCE-ARG-P"))), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-ALL-TEMPORAL-RELATION-INVERSE-COST*"), makeKeyword("COMPLETENESS"),
                makeKeyword("GROSSLY-INCOMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"),
                list(makeKeyword("TEMPLATE"), list(makeConstSym(("temporallySubsumes")), makeKeyword("ANYTHING"), list(makeKeyword("BIND"), makeSymbol("TEMPORAL-THING"))), list(makeKeyword("VALUE"), makeSymbol("TEMPORAL-THING"))), makeKeyword("INPUT-ENCODE-PATTERN"),
                list(makeKeyword("CALL"), makeSymbol("POSSIBLY-BIND-TEMPORAL-INDEXICAL-IN-OBJECT"), makeKeyword("INPUT")), makeKeyword("OUTPUT-GENERATE-PATTERN"), list(makeKeyword("CALL"), makeSymbol("REMOVAL-ALL-TEMPORALLY-SUBSUMES-INVERSE-OUTPUT-GENERATE"), makeKeyword("INPUT")),
                makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(makeConstSym(("temporallySubsumes")), makeKeyword("INPUT"), list(makeKeyword("VALUE"), makeSymbol("TEMPORAL-THING"))), makeKeyword("SUPPORT-MODULE"), makeKeyword("TIME"), makeKeyword("DOCUMENTATION"),
                makeString("(#$temporallySubsumes <not-fully-bound> <TemporalThing>)") });
        $ALL_TEMPORALLY_SUBSUMES_INVERSE_POS = makeKeyword("ALL-TEMPORALLY-SUBSUMES-INVERSE-POS");
        $list87 = list(makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("temporallySubsumes")), makeKeyword("REQUIRED-PATTERN"), list(makeConstSym(("temporallySubsumes")), makeKeyword("NOT-FULLY-BOUND"), makeKeyword("ANYTHING")), makeKeyword("PREFERENCE-LEVEL"),
                makeKeyword("GROSSLY-DISPREFERRED"));
        $REMOVAL_NOT_TEMPORALLY_SUBSUMES = makeKeyword("REMOVAL-NOT-TEMPORALLY-SUBSUMES");
        $list89 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("PREDICATE"), makeConstSym(("temporallySubsumes")), makeKeyword("REQUIRED-PATTERN"),
                list(makeConstSym(("temporallySubsumes")), list(makeKeyword("TEST"), makeSymbol("SBHL-TIME-INFERENCE-ARG-P")), list(makeKeyword("TEST"), makeSymbol("SBHL-TIME-INFERENCE-ARG-P"))), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-NOT-TEMPORAL-RELATION-CHECK-COST*"),
                makeKeyword("EXPAND"), makeSymbol("REMOVAL-NOT-TEMPORALLY-SUBSUMES-EXPAND") });
        $$dateOfEvent = makeConstSym(("dateOfEvent"));
        $REMOVAL_DATE_OF_EVENT = makeKeyword("REMOVAL-DATE-OF-EVENT");
        $list92 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("dateOfEvent")), makeKeyword("CHECK"), T, makeKeyword("REQUIRED-PATTERN"),
                list(makeConstSym(("dateOfEvent")), list(makeKeyword("TEST"), makeSymbol("SBHL-TIME-INFERENCE-ARG-P")), list(makeKeyword("TEST"), makeSymbol("SBHL-TIME-INFERENCE-ARG-P"))), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-TEMPORAL-RELATION-CHECK-COST*"),
                makeKeyword("INPUT-EXTRACT-PATTERN"),
                list(makeKeyword("TEMPLATE"), list(makeConstSym(("dateOfEvent")), list(makeKeyword("BIND"), makeSymbol("EVENT")), list(makeKeyword("BIND"), makeSymbol("DATE"))), list(list(makeKeyword("VALUE"), makeSymbol("EVENT")), list(makeKeyword("VALUE"), makeSymbol("DATE")))),
                makeKeyword("INPUT-ENCODE-PATTERN"),
                list(makeKeyword("TUPLE"), list(makeSymbol("EVENT"), makeSymbol("DATE")),
                        list(list(makeKeyword("CALL"), makeSymbol("POSSIBLY-BIND-TEMPORAL-INDEXICAL-IN-OBJECT"), list(makeKeyword("VALUE"), makeSymbol("EVENT"))), list(makeKeyword("CALL"), makeSymbol("POSSIBLY-BIND-TEMPORAL-INDEXICAL-IN-OBJECT"), list(makeKeyword("VALUE"), makeSymbol("DATE"))))),
                makeKeyword("OUTPUT-CHECK-PATTERN"), list(makeKeyword("TUPLE"), list(makeSymbol("EVENT"), makeSymbol("DATE")), list(makeKeyword("CALL"), makeSymbol("DATE-OF-EVENT?"), list(makeKeyword("VALUE"), makeSymbol("EVENT")), list(makeKeyword("VALUE"), makeSymbol("DATE")))),
                makeKeyword("SUPPORT-MODULE"), makeKeyword("TIME"), makeKeyword("DOCUMENTATION"), makeString("(#$dateOfEvent <Event> <Date>)") });
        $sym93$REMOVAL_ALL_DATE_OF_EVENT_INVERSE_OUTPUT_GENERATE = makeSymbol("REMOVAL-ALL-DATE-OF-EVENT-INVERSE-OUTPUT-GENERATE");
        $REMOVAL_ALL_DATE_OF_EVENT_INVERSE = makeKeyword("REMOVAL-ALL-DATE-OF-EVENT-INVERSE");
        $list95 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("dateOfEvent")), makeKeyword("REQUIRED-PATTERN"),
                list(makeConstSym(("dateOfEvent")), makeKeyword("NOT-FULLY-BOUND"), list(makeKeyword("TEST"), makeSymbol("SBHL-TIME-INFERENCE-ARG-P"))), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-ALL-TEMPORAL-RELATION-INVERSE-COST*"), makeKeyword("COMPLETENESS"),
                makeKeyword("GROSSLY-INCOMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(makeConstSym(("dateOfEvent")), makeKeyword("ANYTHING"), list(makeKeyword("BIND"), makeSymbol("DATE"))), list(makeKeyword("VALUE"), makeSymbol("DATE"))),
                makeKeyword("INPUT-ENCODE-PATTERN"), list(makeKeyword("CALL"), makeSymbol("POSSIBLY-BIND-TEMPORAL-INDEXICAL-IN-OBJECT"), makeKeyword("INPUT")), makeKeyword("OUTPUT-GENERATE-PATTERN"),
                list(makeKeyword("CALL"), makeSymbol("REMOVAL-ALL-DATE-OF-EVENT-INVERSE-OUTPUT-GENERATE"), makeKeyword("INPUT")), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(makeConstSym(("dateOfEvent")), makeKeyword("INPUT"), list(makeKeyword("VALUE"), makeSymbol("DATE"))),
                makeKeyword("SUPPORT-MODULE"), makeKeyword("TIME"), makeKeyword("DOCUMENTATION"), makeString("(#$dateOfEvent <not-fully-bound> <Date>)") });
        $ALL_DATE_OF_EVENT_INVERSE_POS = makeKeyword("ALL-DATE-OF-EVENT-INVERSE-POS");
        $list97 = list(makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("dateOfEvent")), makeKeyword("REQUIRED-PATTERN"), list(makeConstSym(("dateOfEvent")), makeKeyword("NOT-FULLY-BOUND"), makeKeyword("ANYTHING")), makeKeyword("PREFERENCE-LEVEL"),
                makeKeyword("GROSSLY-DISPREFERRED"));
        $REMOVAL_NOT_DATE_OF_EVENT = makeKeyword("REMOVAL-NOT-DATE-OF-EVENT");
        $list99 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("PREDICATE"), makeConstSym(("dateOfEvent")), makeKeyword("REQUIRED-PATTERN"),
                list(makeConstSym(("dateOfEvent")), list(makeKeyword("TEST"), makeSymbol("SBHL-TIME-INFERENCE-ARG-P")), list(makeKeyword("TEST"), makeSymbol("SBHL-TIME-INFERENCE-ARG-P"))), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-NOT-TEMPORAL-RELATION-CHECK-COST*"),
                makeKeyword("EXPAND"), makeSymbol("REMOVAL-NOT-DATE-OF-EVENT-EXPAND") });
        $REMOVAL_DATE_OF_EVENT_DELAY = makeKeyword("REMOVAL-DATE-OF-EVENT-DELAY");
        $list101 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("dateOfEvent")), makeKeyword("REQUIRED-PATTERN"), list(makeConstSym(("dateOfEvent")), makeKeyword("VARIABLE"), makeKeyword("VARIABLE")), makeKeyword("EXCLUSIVE"),
                makeSymbol("TRUE"), makeKeyword("REQUIRED"), makeSymbol("FALSE"), makeKeyword("DOCUMENTATION"), makeString("Delay module that ensures that \n    (#$dateOfEvent <variable> <variable>)\n    is not worked on"), makeKeyword("EXAMPLE"), makeString("(#$dateOfEvent ?X ?Y)") });
        $$cotemporal = makeConstSym(("cotemporal"));
        $REMOVAL_COTEMPORAL = makeKeyword("REMOVAL-COTEMPORAL");
        $list104 = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("cotemporal")), makeKeyword("CHECK"), T, makeKeyword("REQUIRED-PATTERN"),
                list(makeConstSym(("cotemporal")), list(makeKeyword("TEST"), makeSymbol("SBHL-TIME-INFERENCE-ARG-P")), list(makeKeyword("TEST"), makeSymbol("SBHL-TIME-INFERENCE-ARG-P"))), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-TEMPORAL-RELATION-CHECK-COST*"),
                makeKeyword("INPUT-EXTRACT-PATTERN"),
                list(makeKeyword("TEMPLATE"), list(makeConstSym(("cotemporal")), ConsesLow.list(makeKeyword("BIND"), makeSymbol("TEMPORAL-THING1")), list(makeKeyword("BIND"), makeSymbol("TEMPORAL-THING2"))),
                        list(list(makeKeyword("VALUE"), makeSymbol("TEMPORAL-THING1")), list(makeKeyword("VALUE"), makeSymbol("TEMPORAL-THING2")))),
                makeKeyword("INPUT-ENCODE-PATTERN"),
                ConsesLow.list(makeKeyword("TUPLE"), list(makeSymbol("TEMPORAL-THING1"), makeSymbol("TEMPORAL-THING2")),
                        list(list(makeKeyword("CALL"), makeSymbol("POSSIBLY-BIND-TEMPORAL-INDEXICAL-IN-OBJECT"), list(makeKeyword("VALUE"), makeSymbol("TEMPORAL-THING1"))),
                                list(makeKeyword("CALL"), makeSymbol("POSSIBLY-BIND-TEMPORAL-INDEXICAL-IN-OBJECT"), list(makeKeyword("VALUE"), makeSymbol("TEMPORAL-THING2"))))),
                makeKeyword("OUTPUT-CHECK-PATTERN"),
                list(makeKeyword("TUPLE"), list(makeSymbol("TEMPORAL-THING1"), makeSymbol("TEMPORAL-THING2")), list(makeKeyword("CALL"), makeSymbol("COTEMPORAL?"), list(makeKeyword("VALUE"), makeSymbol("TEMPORAL-THING1")), list(makeKeyword("VALUE"), makeSymbol("TEMPORAL-THING2")))),
                makeKeyword("SUPPORT-MODULE"), makeKeyword("TIME"), makeKeyword("DOCUMENTATION"), makeString("(#$cotemporal <TemporalThing> <TemporalThing>)") });
        $sym105$REMOVAL_ALL_COTEMPORAL_OUTPUT_GENERATE = makeSymbol("REMOVAL-ALL-COTEMPORAL-OUTPUT-GENERATE");
        $REMOVAL_ALL_COTEMPORAL = makeKeyword("REMOVAL-ALL-COTEMPORAL");
        $list107 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("cotemporal")), makeKeyword("REQUIRED-PATTERN"),
                list(makeConstSym(("cotemporal")), list(makeKeyword("TEST"), makeSymbol("SBHL-TIME-INFERENCE-ARG-P")), makeKeyword("NOT-FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-ALL-TEMPORAL-RELATION-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("GROSSLY-INCOMPLETE"),
                makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(makeConstSym(("cotemporal")), list(makeKeyword("BIND"), makeSymbol("TEMPORAL-THING")), makeKeyword("ANYTHING")), list(makeKeyword("VALUE"), makeSymbol("TEMPORAL-THING"))), makeKeyword("INPUT-ENCODE-PATTERN"),
                list(makeKeyword("CALL"), makeSymbol("POSSIBLY-BIND-TEMPORAL-INDEXICAL-IN-OBJECT"), makeKeyword("INPUT")), makeKeyword("OUTPUT-GENERATE-PATTERN"), list(makeKeyword("CALL"), makeSymbol("REMOVAL-ALL-COTEMPORAL-OUTPUT-GENERATE"), makeKeyword("INPUT")),
                makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(makeConstSym(("cotemporal")), list(makeKeyword("VALUE"), makeSymbol("TEMPORAL-THING")), makeKeyword("INPUT")), makeKeyword("SUPPORT-MODULE"), makeKeyword("TIME"), makeKeyword("DOCUMENTATION"),
                makeString("(#$cotemporal <TemporalThing> <not-fully-bound>)") });
        $ALL_COTEMPORAL_POS = makeKeyword("ALL-COTEMPORAL-POS");
        $list109 = list(makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("cotemporal")), makeKeyword("REQUIRED-PATTERN"), list(makeConstSym(("cotemporal")), makeKeyword("ANYTHING"), makeKeyword("NOT-FULLY-BOUND")), makeKeyword("PREFERENCE-LEVEL"),
                makeKeyword("GROSSLY-DISPREFERRED"));
        $REMOVAL_ALL_COTEMPORAL_INVERSE = makeKeyword("REMOVAL-ALL-COTEMPORAL-INVERSE");
        $list111 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("cotemporal")), makeKeyword("REQUIRED-PATTERN"),
                list(makeConstSym(("cotemporal")), makeKeyword("NOT-FULLY-BOUND"), list(makeKeyword("TEST"), makeSymbol("SBHL-TIME-INFERENCE-ARG-P"))), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-ALL-TEMPORAL-RELATION-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("GROSSLY-INCOMPLETE"),
                makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(makeConstSym(("cotemporal")), makeKeyword("ANYTHING"), list(makeKeyword("BIND"), makeSymbol("TEMPORAL-THING"))), list(makeKeyword("VALUE"), makeSymbol("TEMPORAL-THING"))), makeKeyword("INPUT-ENCODE-PATTERN"),
                list(makeKeyword("CALL"), makeSymbol("POSSIBLY-BIND-TEMPORAL-INDEXICAL-IN-OBJECT"), makeKeyword("INPUT")), makeKeyword("OUTPUT-GENERATE-PATTERN"), list(makeKeyword("CALL"), makeSymbol("REMOVAL-ALL-COTEMPORAL-OUTPUT-GENERATE"), makeKeyword("INPUT")),
                makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(makeConstSym(("cotemporal")), makeKeyword("INPUT"), list(makeKeyword("VALUE"), makeSymbol("TEMPORAL-THING"))), makeKeyword("SUPPORT-MODULE"), makeKeyword("TIME"), makeKeyword("DOCUMENTATION"),
                makeString("(#$cotemporal <not-fully-bound> <TemporalThing>)") });
        $ALL_COTEMPORAL_INVERSE_POS = makeKeyword("ALL-COTEMPORAL-INVERSE-POS");
        $list113 = list(makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("cotemporal")), makeKeyword("REQUIRED-PATTERN"), list(makeConstSym(("cotemporal")), makeKeyword("NOT-FULLY-BOUND"), makeKeyword("ANYTHING")), makeKeyword("PREFERENCE-LEVEL"),
                makeKeyword("GROSSLY-DISPREFERRED"));
        $REMOVAL_NOT_COTEMPORAL = makeKeyword("REMOVAL-NOT-COTEMPORAL");
        $list115 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("PREDICATE"), makeConstSym(("cotemporal")), makeKeyword("REQUIRED-PATTERN"),
                list(makeConstSym(("cotemporal")), list(makeKeyword("TEST"), makeSymbol("SBHL-TIME-INFERENCE-ARG-P")), list(makeKeyword("TEST"), makeSymbol("SBHL-TIME-INFERENCE-ARG-P"))), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-NOT-TEMPORAL-RELATION-CHECK-COST*"), makeKeyword("EXPAND"),
                makeSymbol("REMOVAL-NOT-COTEMPORAL-EXPAND") });
        $$temporallyIntersects = makeConstSym(("temporallyIntersects"));
        $REMOVAL_TEMPORALLY_INTERSECTS = makeKeyword("REMOVAL-TEMPORALLY-INTERSECTS");
        $list118 = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("temporallyIntersects")), makeKeyword("CHECK"), T, makeKeyword("REQUIRED-PATTERN"),
                list(makeConstSym(("temporallyIntersects")), list(makeKeyword("TEST"), makeSymbol("SBHL-TIME-INFERENCE-ARG-P")), list(makeKeyword("TEST"), makeSymbol("SBHL-TIME-INFERENCE-ARG-P"))), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-TEMPORAL-RELATION-CHECK-COST*"),
                makeKeyword("INPUT-EXTRACT-PATTERN"),
                list(makeKeyword("TEMPLATE"), list(makeConstSym(("temporallyIntersects")), list(makeKeyword("BIND"), makeSymbol("TEMPORAL-THING1")), list(makeKeyword("BIND"), makeSymbol("TEMPORAL-THING2"))),
                        list(list(makeKeyword("VALUE"), makeSymbol("TEMPORAL-THING1")), list(makeKeyword("VALUE"), makeSymbol("TEMPORAL-THING2")))),
                makeKeyword("INPUT-ENCODE-PATTERN"),
                ConsesLow.list(makeKeyword("TUPLE"), list(makeSymbol("TEMPORAL-THING1"), makeSymbol("TEMPORAL-THING2")),
                        list(list(makeKeyword("CALL"), makeSymbol("POSSIBLY-BIND-TEMPORAL-INDEXICAL-IN-OBJECT"), list(makeKeyword("VALUE"), makeSymbol("TEMPORAL-THING1"))),
                                list(makeKeyword("CALL"), makeSymbol("POSSIBLY-BIND-TEMPORAL-INDEXICAL-IN-OBJECT"), list(makeKeyword("VALUE"), makeSymbol("TEMPORAL-THING2"))))),
                makeKeyword("OUTPUT-CHECK-PATTERN"),
                list(makeKeyword("TUPLE"), list(makeSymbol("TEMPORAL-THING1"), makeSymbol("TEMPORAL-THING2")), list(makeKeyword("CALL"), makeSymbol("TEMPORALLY-INTERSECTS?"), list(makeKeyword("VALUE"), makeSymbol("TEMPORAL-THING1")), list(makeKeyword("VALUE"), makeSymbol("TEMPORAL-THING2")))),
                makeKeyword("SUPPORT-MODULE"), makeKeyword("TIME"), makeKeyword("DOCUMENTATION"), makeString("(#$temporallyIntersects <TemporalThing> <TemporalThing>)") });
        $sym119$REMOVAL_ALL_TEMPORALLY_INTERSECTS_OUTPUT_GENERATE = makeSymbol("REMOVAL-ALL-TEMPORALLY-INTERSECTS-OUTPUT-GENERATE");
        $REMOVAL_ALL_TEMPORALLY_INTERSECTS = makeKeyword("REMOVAL-ALL-TEMPORALLY-INTERSECTS");
        $list121 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("temporallyIntersects")), makeKeyword("REQUIRED-PATTERN"),
                list(makeConstSym(("temporallyIntersects")), list(makeKeyword("TEST"), makeSymbol("SBHL-TIME-INFERENCE-ARG-P")), makeKeyword("NOT-FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-ALL-TEMPORAL-RELATION-COST*"), makeKeyword("COMPLETENESS"),
                makeKeyword("GROSSLY-INCOMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"),
                list(makeKeyword("TEMPLATE"), list(makeConstSym(("temporallyIntersects")), list(makeKeyword("BIND"), makeSymbol("TEMPORAL-THING")), makeKeyword("ANYTHING")), list(makeKeyword("VALUE"), makeSymbol("TEMPORAL-THING"))), makeKeyword("INPUT-ENCODE-PATTERN"),
                list(makeKeyword("CALL"), makeSymbol("POSSIBLY-BIND-TEMPORAL-INDEXICAL-IN-OBJECT"), makeKeyword("INPUT")), makeKeyword("OUTPUT-GENERATE-PATTERN"), list(makeKeyword("CALL"), makeSymbol("REMOVAL-ALL-TEMPORALLY-INTERSECTS-OUTPUT-GENERATE"), makeKeyword("INPUT")),
                makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(makeConstSym(("temporallyIntersects")), list(makeKeyword("VALUE"), makeSymbol("TEMPORAL-THING")), makeKeyword("INPUT")), makeKeyword("SUPPORT-MODULE"), makeKeyword("TIME"), makeKeyword("DOCUMENTATION"),
                makeString("(#$temporallyIntersects <TemporalThing> <not-fully-bound>)") });
        $ALL_TEMPORALLY_INTERSECTS_POS = makeKeyword("ALL-TEMPORALLY-INTERSECTS-POS");
        $list123 = list(makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("temporallyIntersects")), makeKeyword("REQUIRED-PATTERN"), list(makeConstSym(("temporallyIntersects")), makeKeyword("ANYTHING"), makeKeyword("NOT-FULLY-BOUND")), makeKeyword("PREFERENCE-LEVEL"),
                makeKeyword("GROSSLY-DISPREFERRED"));
        $REMOVAL_ALL_TEMPORALLY_INTERSECTS_INVERSE = makeKeyword("REMOVAL-ALL-TEMPORALLY-INTERSECTS-INVERSE");
        $list125 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("temporallyIntersects")), makeKeyword("REQUIRED-PATTERN"),
                list(makeConstSym(("temporallyIntersects")), makeKeyword("NOT-FULLY-BOUND"), list(makeKeyword("TEST"), makeSymbol("SBHL-TIME-INFERENCE-ARG-P"))), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-ALL-TEMPORAL-RELATION-COST*"), makeKeyword("COMPLETENESS"),
                makeKeyword("GROSSLY-INCOMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"),
                list(makeKeyword("TEMPLATE"), list(makeConstSym(("temporallyIntersects")), makeKeyword("ANYTHING"), list(makeKeyword("BIND"), makeSymbol("TEMPORAL-THING"))), list(makeKeyword("VALUE"), makeSymbol("TEMPORAL-THING"))), makeKeyword("INPUT-ENCODE-PATTERN"),
                list(makeKeyword("CALL"), makeSymbol("POSSIBLY-BIND-TEMPORAL-INDEXICAL-IN-OBJECT"), makeKeyword("INPUT")), makeKeyword("OUTPUT-GENERATE-PATTERN"), list(makeKeyword("CALL"), makeSymbol("REMOVAL-ALL-TEMPORALLY-INTERSECTS-OUTPUT-GENERATE"), makeKeyword("INPUT")),
                makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(makeConstSym(("temporallyIntersects")), makeKeyword("INPUT"), list(makeKeyword("VALUE"), makeSymbol("TEMPORAL-THING"))), makeKeyword("SUPPORT-MODULE"), makeKeyword("TIME"), makeKeyword("DOCUMENTATION"),
                makeString("(#$temporallyIntersects <not-fully-bound> <TemporalThing>)") });
        $ALL_TEMPORALLY_INTERSECTS_INVERSE_POS = makeKeyword("ALL-TEMPORALLY-INTERSECTS-INVERSE-POS");
        $list127 = list(makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("temporallyIntersects")), makeKeyword("REQUIRED-PATTERN"), list(makeConstSym(("temporallyIntersects")), makeKeyword("NOT-FULLY-BOUND"), makeKeyword("ANYTHING")), makeKeyword("PREFERENCE-LEVEL"),
                makeKeyword("GROSSLY-DISPREFERRED"));
        $REMOVAL_NOT_TEMPORALLY_INTERSECTS = makeKeyword("REMOVAL-NOT-TEMPORALLY-INTERSECTS");
        $list129 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("PREDICATE"), makeConstSym(("temporallyIntersects")), makeKeyword("REQUIRED-PATTERN"),
                list(makeConstSym(("temporallyIntersects")), list(makeKeyword("TEST"), makeSymbol("SBHL-TIME-INFERENCE-ARG-P")), list(makeKeyword("TEST"), makeSymbol("SBHL-TIME-INFERENCE-ARG-P"))), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-NOT-TEMPORAL-RELATION-CHECK-COST*"),
                makeKeyword("EXPAND"), makeSymbol("REMOVAL-NOT-TEMPORALLY-INTERSECTS-EXPAND") });
        $$temporallyDisjoint = makeConstSym(("temporallyDisjoint"));
        $REMOVAL_TEMPORALLY_DISJOINT = makeKeyword("REMOVAL-TEMPORALLY-DISJOINT");
        $list132 = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("temporallyDisjoint")), makeKeyword("CHECK"), T, makeKeyword("REQUIRED-PATTERN"),
                list(makeConstSym(("temporallyDisjoint")), list(makeKeyword("TEST"), makeSymbol("SBHL-TIME-INFERENCE-ARG-P")), list(makeKeyword("TEST"), makeSymbol("SBHL-TIME-INFERENCE-ARG-P"))), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-TEMPORAL-RELATION-CHECK-COST*"),
                makeKeyword("INPUT-EXTRACT-PATTERN"),
                list(makeKeyword("TEMPLATE"), list(makeConstSym(("temporallyDisjoint")), ConsesLow.list(makeKeyword("BIND"), makeSymbol("TEMPORAL-THING1")), list(makeKeyword("BIND"), makeSymbol("TEMPORAL-THING2"))),
                        list(list(makeKeyword("VALUE"), makeSymbol("TEMPORAL-THING1")), list(makeKeyword("VALUE"), makeSymbol("TEMPORAL-THING2")))),
                makeKeyword("INPUT-ENCODE-PATTERN"),
                ConsesLow.list(makeKeyword("TUPLE"), list(makeSymbol("TEMPORAL-THING1"), makeSymbol("TEMPORAL-THING2")),
                        list(list(makeKeyword("CALL"), makeSymbol("POSSIBLY-BIND-TEMPORAL-INDEXICAL-IN-OBJECT"), list(makeKeyword("VALUE"), makeSymbol("TEMPORAL-THING1"))),
                                list(makeKeyword("CALL"), makeSymbol("POSSIBLY-BIND-TEMPORAL-INDEXICAL-IN-OBJECT"), list(makeKeyword("VALUE"), makeSymbol("TEMPORAL-THING2"))))),
                makeKeyword("OUTPUT-CHECK-PATTERN"),
                list(makeKeyword("TUPLE"), list(makeSymbol("TEMPORAL-THING1"), makeSymbol("TEMPORAL-THING2")), list(makeKeyword("CALL"), makeSymbol("TEMPORALLY-DISJOINT?"), list(makeKeyword("VALUE"), makeSymbol("TEMPORAL-THING1")), list(makeKeyword("VALUE"), makeSymbol("TEMPORAL-THING2")))),
                makeKeyword("SUPPORT-MODULE"), makeKeyword("TIME"), makeKeyword("DOCUMENTATION"), makeString("(#$temporallyDisjoint <TemporalThing> <TemporalThing>)") });
        $sym133$REMOVAL_ALL_TEMPORALLY_DISJOINT_OUTPUT_GENERATE = makeSymbol("REMOVAL-ALL-TEMPORALLY-DISJOINT-OUTPUT-GENERATE");
        $REMOVAL_ALL_TEMPORALLY_DISJOINT = makeKeyword("REMOVAL-ALL-TEMPORALLY-DISJOINT");
        $list135 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("temporallyDisjoint")), makeKeyword("REQUIRED-PATTERN"),
                list(makeConstSym(("temporallyDisjoint")), list(makeKeyword("TEST"), makeSymbol("SBHL-TIME-INFERENCE-ARG-P")), makeKeyword("NOT-FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-ALL-TEMPORAL-RELATION-COST*"), makeKeyword("COMPLETENESS"),
                makeKeyword("GROSSLY-INCOMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"),
                list(makeKeyword("TEMPLATE"), list(makeConstSym(("temporallyDisjoint")), list(makeKeyword("BIND"), makeSymbol("TEMPORAL-THING")), makeKeyword("ANYTHING")), list(makeKeyword("VALUE"), makeSymbol("TEMPORAL-THING"))), makeKeyword("INPUT-ENCODE-PATTERN"),
                list(makeKeyword("CALL"), makeSymbol("POSSIBLY-BIND-TEMPORAL-INDEXICAL-IN-OBJECT"), makeKeyword("INPUT")), makeKeyword("OUTPUT-GENERATE-PATTERN"), list(makeKeyword("CALL"), makeSymbol("REMOVAL-ALL-TEMPORALLY-DISJOINT-OUTPUT-GENERATE"), makeKeyword("INPUT")),
                makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(makeConstSym(("temporallyDisjoint")), list(makeKeyword("VALUE"), makeSymbol("TEMPORAL-THING")), makeKeyword("INPUT")), makeKeyword("SUPPORT-MODULE"), makeKeyword("TIME"), makeKeyword("DOCUMENTATION"),
                makeString("(#$temporallyDisjoint <TemporalThing> <not-fully-bound>)") });
        $ALL_TEMPORALLY_DISJOINT_POS = makeKeyword("ALL-TEMPORALLY-DISJOINT-POS");
        $list137 = list(makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("temporallyDisjoint")), makeKeyword("REQUIRED-PATTERN"), list(makeConstSym(("temporallyDisjoint")), makeKeyword("ANYTHING"), makeKeyword("NOT-FULLY-BOUND")), makeKeyword("PREFERENCE-LEVEL"),
                makeKeyword("GROSSLY-DISPREFERRED"));
        $REMOVAL_ALL_TEMPORALLY_DISJOINT_INVERSE = makeKeyword("REMOVAL-ALL-TEMPORALLY-DISJOINT-INVERSE");
        $list139 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("temporallyDisjoint")), makeKeyword("REQUIRED-PATTERN"),
                list(makeConstSym(("temporallyDisjoint")), makeKeyword("NOT-FULLY-BOUND"), list(makeKeyword("TEST"), makeSymbol("SBHL-TIME-INFERENCE-ARG-P"))), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-ALL-TEMPORAL-RELATION-COST*"), makeKeyword("COMPLETENESS"),
                makeKeyword("GROSSLY-INCOMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"),
                list(makeKeyword("TEMPLATE"), list(makeConstSym(("temporallyDisjoint")), makeKeyword("ANYTHING"), list(makeKeyword("BIND"), makeSymbol("TEMPORAL-THING"))), list(makeKeyword("VALUE"), makeSymbol("TEMPORAL-THING"))), makeKeyword("INPUT-ENCODE-PATTERN"),
                list(makeKeyword("CALL"), makeSymbol("POSSIBLY-BIND-TEMPORAL-INDEXICAL-IN-OBJECT"), makeKeyword("INPUT")), makeKeyword("OUTPUT-GENERATE-PATTERN"), list(makeKeyword("CALL"), makeSymbol("REMOVAL-ALL-TEMPORALLY-DISJOINT-OUTPUT-GENERATE"), makeKeyword("INPUT")),
                makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(makeConstSym(("temporallyDisjoint")), makeKeyword("INPUT"), list(makeKeyword("VALUE"), makeSymbol("TEMPORAL-THING"))), makeKeyword("SUPPORT-MODULE"), makeKeyword("TIME"), makeKeyword("DOCUMENTATION"),
                makeString("(#$temporallyDisjoint <not-fully-bound> <TemporalThing>)") });
        $ALL_TEMPORALLY_DISJOINT_INVERSE_POS = makeKeyword("ALL-TEMPORALLY-DISJOINT-INVERSE-POS");
        $list141 = list(makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("temporallyDisjoint")), makeKeyword("REQUIRED-PATTERN"), list(makeConstSym(("temporallyDisjoint")), makeKeyword("NOT-FULLY-BOUND"), makeKeyword("ANYTHING")), makeKeyword("PREFERENCE-LEVEL"),
                makeKeyword("GROSSLY-DISPREFERRED"));
        $REMOVAL_NOT_TEMPORALLY_DISJOINT = makeKeyword("REMOVAL-NOT-TEMPORALLY-DISJOINT");
        $list143 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("PREDICATE"), makeConstSym(("temporallyDisjoint")), makeKeyword("REQUIRED-PATTERN"),
                list(makeConstSym(("temporallyDisjoint")), list(makeKeyword("TEST"), makeSymbol("SBHL-TIME-INFERENCE-ARG-P")), list(makeKeyword("TEST"), makeSymbol("SBHL-TIME-INFERENCE-ARG-P"))), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-NOT-TEMPORAL-RELATION-CHECK-COST*"),
                makeKeyword("EXPAND"), makeSymbol("REMOVAL-NOT-TEMPORALLY-DISJOINT-EXPAND") });
        $$temporalBoundsContain = makeConstSym(("temporalBoundsContain"));
        $REMOVAL_TEMPORAL_BOUNDS_CONTAIN = makeKeyword("REMOVAL-TEMPORAL-BOUNDS-CONTAIN");
        $list146 = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("temporalBoundsContain")), makeKeyword("CHECK"), T, makeKeyword("REQUIRED-PATTERN"),
                list(makeConstSym(("temporalBoundsContain")), list(makeKeyword("TEST"), makeSymbol("SBHL-TIME-INFERENCE-ARG-P")), list(makeKeyword("TEST"), makeSymbol("SBHL-TIME-INFERENCE-ARG-P"))), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-TEMPORAL-RELATION-CHECK-COST*"),
                makeKeyword("INPUT-EXTRACT-PATTERN"),
                list(makeKeyword("TEMPLATE"), list(makeConstSym(("temporalBoundsContain")), list(makeKeyword("BIND"), makeSymbol("TEMPORAL-THING1")), list(makeKeyword("BIND"), makeSymbol("TEMPORAL-THING2"))),
                        list(list(makeKeyword("VALUE"), makeSymbol("TEMPORAL-THING1")), list(makeKeyword("VALUE"), makeSymbol("TEMPORAL-THING2")))),
                makeKeyword("INPUT-ENCODE-PATTERN"),
                ConsesLow.list(makeKeyword("TUPLE"), list(makeSymbol("TEMPORAL-THING1"), makeSymbol("TEMPORAL-THING2")),
                        list(list(makeKeyword("CALL"), makeSymbol("POSSIBLY-BIND-TEMPORAL-INDEXICAL-IN-OBJECT"), list(makeKeyword("VALUE"), makeSymbol("TEMPORAL-THING1"))),
                                list(makeKeyword("CALL"), makeSymbol("POSSIBLY-BIND-TEMPORAL-INDEXICAL-IN-OBJECT"), list(makeKeyword("VALUE"), makeSymbol("TEMPORAL-THING2"))))),
                makeKeyword("OUTPUT-CHECK-PATTERN"),
                list(makeKeyword("TUPLE"), list(makeSymbol("TEMPORAL-THING1"), makeSymbol("TEMPORAL-THING2")), list(makeKeyword("CALL"), makeSymbol("TEMPORAL-BOUNDS-CONTAIN?"), list(makeKeyword("VALUE"), makeSymbol("TEMPORAL-THING1")), list(makeKeyword("VALUE"), makeSymbol("TEMPORAL-THING2")))),
                makeKeyword("SUPPORT-MODULE"), makeKeyword("TIME"), makeKeyword("DOCUMENTATION"), makeString("(#$temporalBoundsContain <TemporalThing> <TemporalThing>)") });
        $sym147$REMOVAL_ALL_TEMPORAL_BOUNDS_CONTAIN_OUTPUT_GENERATE = makeSymbol("REMOVAL-ALL-TEMPORAL-BOUNDS-CONTAIN-OUTPUT-GENERATE");
        $REMOVAL_ALL_TEMPORAL_BOUNDS_CONTAIN = makeKeyword("REMOVAL-ALL-TEMPORAL-BOUNDS-CONTAIN");
        $list149 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("temporalBoundsContain")), makeKeyword("REQUIRED-PATTERN"),
                list(makeConstSym(("temporalBoundsContain")), list(makeKeyword("TEST"), makeSymbol("SBHL-TIME-INFERENCE-ARG-P")), makeKeyword("NOT-FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-ALL-TEMPORAL-RELATION-COST*"), makeKeyword("COMPLETENESS"),
                makeKeyword("GROSSLY-INCOMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"),
                list(makeKeyword("TEMPLATE"), list(makeConstSym(("temporalBoundsContain")), list(makeKeyword("BIND"), makeSymbol("TEMPORAL-THING")), makeKeyword("ANYTHING")), list(makeKeyword("VALUE"), makeSymbol("TEMPORAL-THING"))), makeKeyword("INPUT-ENCODE-PATTERN"),
                list(makeKeyword("CALL"), makeSymbol("POSSIBLY-BIND-TEMPORAL-INDEXICAL-IN-OBJECT"), makeKeyword("INPUT")), makeKeyword("OUTPUT-GENERATE-PATTERN"), list(makeKeyword("CALL"), makeSymbol("REMOVAL-ALL-TEMPORAL-BOUNDS-CONTAIN-OUTPUT-GENERATE"), makeKeyword("INPUT")),
                makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(makeConstSym(("temporalBoundsContain")), list(makeKeyword("VALUE"), makeSymbol("TEMPORAL-THING")), makeKeyword("INPUT")), makeKeyword("SUPPORT-MODULE"), makeKeyword("TIME"), makeKeyword("DOCUMENTATION"),
                makeString("(#$temporalBoundsContain <TemporalThing> <not-fully-bound>)") });
        $ALL_TEMPORAL_BOUNDS_CONTAIN_POS = makeKeyword("ALL-TEMPORAL-BOUNDS-CONTAIN-POS");
        $list151 = list(makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("temporalBoundsContain")), makeKeyword("REQUIRED-PATTERN"), list(makeConstSym(("temporalBoundsContain")), makeKeyword("ANYTHING"), makeKeyword("NOT-FULLY-BOUND")),
                makeKeyword("PREFERENCE-LEVEL"), makeKeyword("GROSSLY-DISPREFERRED"));
        $sym152$REMOVAL_ALL_TEMPORAL_BOUNDS_CONTAIN_INVERSE_OUTPUT_GENERATE = makeSymbol("REMOVAL-ALL-TEMPORAL-BOUNDS-CONTAIN-INVERSE-OUTPUT-GENERATE");
        $REMOVAL_ALL_TEMPORAL_BOUNDS_CONTAIN_INVERSE = makeKeyword("REMOVAL-ALL-TEMPORAL-BOUNDS-CONTAIN-INVERSE");
        $list154 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("temporalBoundsContain")), makeKeyword("REQUIRED-PATTERN"),
                list(makeConstSym(("temporalBoundsContain")), makeKeyword("NOT-FULLY-BOUND"), list(makeKeyword("TEST"), makeSymbol("SBHL-TIME-INFERENCE-ARG-P"))), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-ALL-TEMPORAL-RELATION-INVERSE-COST*"), makeKeyword("COMPLETENESS"),
                makeKeyword("GROSSLY-INCOMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"),
                list(makeKeyword("TEMPLATE"), list(makeConstSym(("temporalBoundsContain")), makeKeyword("ANYTHING"), list(makeKeyword("BIND"), makeSymbol("TEMPORAL-THING"))), list(makeKeyword("VALUE"), makeSymbol("TEMPORAL-THING"))), makeKeyword("INPUT-ENCODE-PATTERN"),
                list(makeKeyword("CALL"), makeSymbol("POSSIBLY-BIND-TEMPORAL-INDEXICAL-IN-OBJECT"), makeKeyword("INPUT")), makeKeyword("OUTPUT-GENERATE-PATTERN"), list(makeKeyword("CALL"), makeSymbol("REMOVAL-ALL-TEMPORAL-BOUNDS-CONTAIN-INVERSE-OUTPUT-GENERATE"), makeKeyword("INPUT")),
                makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(makeConstSym(("temporalBoundsContain")), makeKeyword("INPUT"), list(makeKeyword("VALUE"), makeSymbol("TEMPORAL-THING"))), makeKeyword("SUPPORT-MODULE"), makeKeyword("TIME"), makeKeyword("DOCUMENTATION"),
                makeString("(#$temporalBoundsContain <not-fully-bound> <TemporalThing>)") });
        $ALL_TEMPORAL_BOUNDS_CONTAIN_INVERSE_POS = makeKeyword("ALL-TEMPORAL-BOUNDS-CONTAIN-INVERSE-POS");
        $list156 = list(makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("temporalBoundsContain")), makeKeyword("REQUIRED-PATTERN"), list(makeConstSym(("temporalBoundsContain")), makeKeyword("NOT-FULLY-BOUND"), makeKeyword("ANYTHING")),
                makeKeyword("PREFERENCE-LEVEL"), makeKeyword("GROSSLY-DISPREFERRED"));
        $REMOVAL_NOT_TEMPORAL_BOUNDS_CONTAIN = makeKeyword("REMOVAL-NOT-TEMPORAL-BOUNDS-CONTAIN");
        $list158 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("PREDICATE"), makeConstSym(("temporalBoundsContain")), makeKeyword("REQUIRED-PATTERN"),
                list(makeConstSym(("temporalBoundsContain")), list(makeKeyword("TEST"), makeSymbol("SBHL-TIME-INFERENCE-ARG-P")), list(makeKeyword("TEST"), makeSymbol("SBHL-TIME-INFERENCE-ARG-P"))), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-NOT-TEMPORAL-RELATION-CHECK-COST*"),
                makeKeyword("EXPAND"), makeSymbol("REMOVAL-NOT-TEMPORAL-BOUNDS-CONTAIN-EXPAND") });
        $$temporalBoundsSubsume = makeConstSym(("temporalBoundsSubsume"));
        $REMOVAL_TEMPORAL_BOUNDS_SUBSUME = makeKeyword("REMOVAL-TEMPORAL-BOUNDS-SUBSUME");
        $list161 = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("temporalBoundsSubsume")), makeKeyword("CHECK"), T, makeKeyword("REQUIRED-PATTERN"),
                list(makeConstSym(("temporalBoundsSubsume")), list(makeKeyword("TEST"), makeSymbol("SBHL-TIME-INFERENCE-ARG-P")), list(makeKeyword("TEST"), makeSymbol("SBHL-TIME-INFERENCE-ARG-P"))), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-TEMPORAL-RELATION-CHECK-COST*"),
                makeKeyword("INPUT-EXTRACT-PATTERN"),
                list(makeKeyword("TEMPLATE"), list(makeConstSym(("temporalBoundsSubsume")), list(makeKeyword("BIND"), makeSymbol("TEMPORAL-THING1")), list(makeKeyword("BIND"), makeSymbol("TEMPORAL-THING2"))),
                        list(list(makeKeyword("VALUE"), makeSymbol("TEMPORAL-THING1")), list(makeKeyword("VALUE"), makeSymbol("TEMPORAL-THING2")))),
                makeKeyword("INPUT-ENCODE-PATTERN"),
                ConsesLow.list(makeKeyword("TUPLE"), list(makeSymbol("TEMPORAL-THING1"), makeSymbol("TEMPORAL-THING2")),
                        list(list(makeKeyword("CALL"), makeSymbol("POSSIBLY-BIND-TEMPORAL-INDEXICAL-IN-OBJECT"), list(makeKeyword("VALUE"), makeSymbol("TEMPORAL-THING1"))),
                                list(makeKeyword("CALL"), makeSymbol("POSSIBLY-BIND-TEMPORAL-INDEXICAL-IN-OBJECT"), list(makeKeyword("VALUE"), makeSymbol("TEMPORAL-THING2"))))),
                makeKeyword("OUTPUT-CHECK-PATTERN"),
                list(makeKeyword("TUPLE"), list(makeSymbol("TEMPORAL-THING1"), makeSymbol("TEMPORAL-THING2")), list(makeKeyword("CALL"), makeSymbol("TEMPORAL-BOUNDS-SUBSUME?"), list(makeKeyword("VALUE"), makeSymbol("TEMPORAL-THING1")), list(makeKeyword("VALUE"), makeSymbol("TEMPORAL-THING2")))),
                makeKeyword("SUPPORT-MODULE"), makeKeyword("TIME"), makeKeyword("DOCUMENTATION"), makeString("(#$temporalBoundsSubsume <TemporalThing> <TemporalThing>)") });
        $sym162$REMOVAL_ALL_TEMPORAL_BOUNDS_SUBSUME_OUTPUT_GENERATE = makeSymbol("REMOVAL-ALL-TEMPORAL-BOUNDS-SUBSUME-OUTPUT-GENERATE");
        $REMOVAL_ALL_TEMPORAL_BOUNDS_SUBSUME = makeKeyword("REMOVAL-ALL-TEMPORAL-BOUNDS-SUBSUME");
        $list164 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("temporalBoundsSubsume")), makeKeyword("REQUIRED-PATTERN"),
                list(makeConstSym(("temporalBoundsSubsume")), list(makeKeyword("TEST"), makeSymbol("SBHL-TIME-INFERENCE-ARG-P")), makeKeyword("NOT-FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-ALL-TEMPORAL-RELATION-COST*"), makeKeyword("COMPLETENESS"),
                makeKeyword("GROSSLY-INCOMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"),
                list(makeKeyword("TEMPLATE"), list(makeConstSym(("temporalBoundsSubsume")), list(makeKeyword("BIND"), makeSymbol("TEMPORAL-THING")), makeKeyword("ANYTHING")), list(makeKeyword("VALUE"), makeSymbol("TEMPORAL-THING"))), makeKeyword("INPUT-ENCODE-PATTERN"),
                list(makeKeyword("CALL"), makeSymbol("POSSIBLY-BIND-TEMPORAL-INDEXICAL-IN-OBJECT"), makeKeyword("INPUT")), makeKeyword("OUTPUT-GENERATE-PATTERN"), list(makeKeyword("CALL"), makeSymbol("REMOVAL-ALL-TEMPORAL-BOUNDS-SUBSUME-OUTPUT-GENERATE"), makeKeyword("INPUT")),
                makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(makeConstSym(("temporalBoundsSubsume")), list(makeKeyword("VALUE"), makeSymbol("TEMPORAL-THING")), makeKeyword("INPUT")), makeKeyword("SUPPORT-MODULE"), makeKeyword("TIME"), makeKeyword("DOCUMENTATION"),
                makeString("(#$temporalBoundsSubsume <TemporalThing> <not-fully-bound>)") });
        $ALL_TEMPORAL_BOUNDS_SUBSUME_POS = makeKeyword("ALL-TEMPORAL-BOUNDS-SUBSUME-POS");
        $list166 = list(makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("temporalBoundsSubsume")), makeKeyword("REQUIRED-PATTERN"), list(makeConstSym(("temporalBoundsSubsume")), makeKeyword("ANYTHING"), makeKeyword("NOT-FULLY-BOUND")),
                makeKeyword("PREFERENCE-LEVEL"), makeKeyword("GROSSLY-DISPREFERRED"));
        $sym167$REMOVAL_ALL_TEMPORAL_BOUNDS_SUBSUME_INVERSE_OUTPUT_GENERATE = makeSymbol("REMOVAL-ALL-TEMPORAL-BOUNDS-SUBSUME-INVERSE-OUTPUT-GENERATE");
        $REMOVAL_ALL_TEMPORAL_BOUNDS_SUBSUME_INVERSE = makeKeyword("REMOVAL-ALL-TEMPORAL-BOUNDS-SUBSUME-INVERSE");
        $list169 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("temporalBoundsSubsume")), makeKeyword("REQUIRED-PATTERN"),
                list(makeConstSym(("temporalBoundsSubsume")), makeKeyword("NOT-FULLY-BOUND"), list(makeKeyword("TEST"), makeSymbol("SBHL-TIME-INFERENCE-ARG-P"))), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-ALL-TEMPORAL-RELATION-INVERSE-COST*"), makeKeyword("COMPLETENESS"),
                makeKeyword("GROSSLY-INCOMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"),
                list(makeKeyword("TEMPLATE"), list(makeConstSym(("temporalBoundsSubsume")), makeKeyword("ANYTHING"), list(makeKeyword("BIND"), makeSymbol("TEMPORAL-THING"))), list(makeKeyword("VALUE"), makeSymbol("TEMPORAL-THING"))), makeKeyword("INPUT-ENCODE-PATTERN"),
                list(makeKeyword("CALL"), makeSymbol("POSSIBLY-BIND-TEMPORAL-INDEXICAL-IN-OBJECT"), makeKeyword("INPUT")), makeKeyword("OUTPUT-GENERATE-PATTERN"), list(makeKeyword("CALL"), makeSymbol("REMOVAL-ALL-TEMPORAL-BOUNDS-SUBSUME-INVERSE-OUTPUT-GENERATE"), makeKeyword("INPUT")),
                makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(makeConstSym(("temporalBoundsSubsume")), makeKeyword("INPUT"), list(makeKeyword("VALUE"), makeSymbol("TEMPORAL-THING"))), makeKeyword("SUPPORT-MODULE"), makeKeyword("TIME"), makeKeyword("DOCUMENTATION"),
                makeString("(#$temporalBoundsSubsume <not-fully-bound> <TemporalThing>)") });
        $ALL_TEMPORAL_BOUNDS_SUBSUME_INVERSE_POS = makeKeyword("ALL-TEMPORAL-BOUNDS-SUBSUME-INVERSE-POS");
        $list171 = list(makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("temporalBoundsSubsume")), makeKeyword("REQUIRED-PATTERN"), list(makeConstSym(("temporalBoundsSubsume")), makeKeyword("NOT-FULLY-BOUND"), makeKeyword("ANYTHING")),
                makeKeyword("PREFERENCE-LEVEL"), makeKeyword("GROSSLY-DISPREFERRED"));
        $REMOVAL_NOT_TEMPORAL_BOUNDS_SUBSUME = makeKeyword("REMOVAL-NOT-TEMPORAL-BOUNDS-SUBSUME");
        $list173 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("PREDICATE"), makeConstSym(("temporalBoundsSubsume")), makeKeyword("REQUIRED-PATTERN"),
                list(makeConstSym(("temporalBoundsSubsume")), list(makeKeyword("TEST"), makeSymbol("SBHL-TIME-INFERENCE-ARG-P")), list(makeKeyword("TEST"), makeSymbol("SBHL-TIME-INFERENCE-ARG-P"))), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-NOT-TEMPORAL-RELATION-CHECK-COST*"),
                makeKeyword("EXPAND"), makeSymbol("REMOVAL-NOT-TEMPORAL-BOUNDS-SUBSUME-EXPAND") });
        $$temporalBoundsIdentical = makeConstSym(("temporalBoundsIdentical"));
        $REMOVAL_TEMPORAL_BOUNDS_IDENTICAL = makeKeyword("REMOVAL-TEMPORAL-BOUNDS-IDENTICAL");
        $list176 = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("temporalBoundsIdentical")), makeKeyword("CHECK"), T, makeKeyword("REQUIRED-PATTERN"),
                list(makeConstSym(("temporalBoundsIdentical")), list(makeKeyword("TEST"), makeSymbol("SBHL-TIME-INFERENCE-ARG-P")), list(makeKeyword("TEST"), makeSymbol("SBHL-TIME-INFERENCE-ARG-P"))), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-TEMPORAL-RELATION-CHECK-COST*"),
                makeKeyword("INPUT-EXTRACT-PATTERN"),
                list(makeKeyword("TEMPLATE"), list(makeConstSym(("temporalBoundsIdentical")), list(makeKeyword("BIND"), makeSymbol("TEMPORAL-THING1")), list(makeKeyword("BIND"), makeSymbol("TEMPORAL-THING2"))),
                        list(list(makeKeyword("VALUE"), makeSymbol("TEMPORAL-THING1")), list(makeKeyword("VALUE"), makeSymbol("TEMPORAL-THING2")))),
                makeKeyword("INPUT-ENCODE-PATTERN"),
                ConsesLow.list(makeKeyword("TUPLE"), list(makeSymbol("TEMPORAL-THING1"), makeSymbol("TEMPORAL-THING2")),
                        list(list(makeKeyword("CALL"), makeSymbol("POSSIBLY-BIND-TEMPORAL-INDEXICAL-IN-OBJECT"), list(makeKeyword("VALUE"), makeSymbol("TEMPORAL-THING1"))),
                                list(makeKeyword("CALL"), makeSymbol("POSSIBLY-BIND-TEMPORAL-INDEXICAL-IN-OBJECT"), list(makeKeyword("VALUE"), makeSymbol("TEMPORAL-THING2"))))),
                makeKeyword("OUTPUT-CHECK-PATTERN"),
                list(makeKeyword("TUPLE"), list(makeSymbol("TEMPORAL-THING1"), makeSymbol("TEMPORAL-THING2")), list(makeKeyword("CALL"), makeSymbol("TEMPORAL-BOUNDS-IDENTICAL?"), list(makeKeyword("VALUE"), makeSymbol("TEMPORAL-THING1")), list(makeKeyword("VALUE"), makeSymbol("TEMPORAL-THING2")))),
                makeKeyword("SUPPORT-MODULE"), makeKeyword("TIME"), makeKeyword("DOCUMENTATION"), makeString("(#$temporalBoundsIdentical <TemporalThing> <TemporalThing>)") });
        $sym177$REMOVAL_ALL_TEMPORAL_BOUNDS_IDENTICAL_OUTPUT_GENERATE = makeSymbol("REMOVAL-ALL-TEMPORAL-BOUNDS-IDENTICAL-OUTPUT-GENERATE");
        $REMOVAL_ALL_TEMPORAL_BOUNDS_IDENTICAL = makeKeyword("REMOVAL-ALL-TEMPORAL-BOUNDS-IDENTICAL");
        $list179 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("temporalBoundsIdentical")), makeKeyword("REQUIRED-PATTERN"),
                list(makeConstSym(("temporalBoundsIdentical")), list(makeKeyword("TEST"), makeSymbol("SBHL-TIME-INFERENCE-ARG-P")), makeKeyword("NOT-FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-ALL-TEMPORAL-RELATION-COST*"), makeKeyword("COMPLETENESS"),
                makeKeyword("GROSSLY-INCOMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"),
                list(makeKeyword("TEMPLATE"), list(makeConstSym(("temporalBoundsIdentical")), list(makeKeyword("BIND"), makeSymbol("TEMPORAL-THING")), makeKeyword("ANYTHING")), list(makeKeyword("VALUE"), makeSymbol("TEMPORAL-THING"))), makeKeyword("INPUT-ENCODE-PATTERN"),
                list(makeKeyword("CALL"), makeSymbol("POSSIBLY-BIND-TEMPORAL-INDEXICAL-IN-OBJECT"), makeKeyword("INPUT")), makeKeyword("OUTPUT-GENERATE-PATTERN"), list(makeKeyword("CALL"), makeSymbol("REMOVAL-ALL-TEMPORAL-BOUNDS-IDENTICAL-OUTPUT-GENERATE"), makeKeyword("INPUT")),
                makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(makeConstSym(("temporalBoundsIdentical")), list(makeKeyword("VALUE"), makeSymbol("TEMPORAL-THING")), makeKeyword("INPUT")), makeKeyword("SUPPORT-MODULE"), makeKeyword("TIME"), makeKeyword("DOCUMENTATION"),
                makeString("(#$temporalBoundsIdentical <TemporalThing> <not-fully-bound>)") });
        $ALL_TEMPORAL_BOUNDS_IDENTICAL_POS = makeKeyword("ALL-TEMPORAL-BOUNDS-IDENTICAL-POS");
        $list181 = list(makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("temporalBoundsIdentical")), makeKeyword("REQUIRED-PATTERN"), list(makeConstSym(("temporalBoundsIdentical")), makeKeyword("ANYTHING"), makeKeyword("NOT-FULLY-BOUND")),
                makeKeyword("PREFERENCE-LEVEL"), makeKeyword("GROSSLY-DISPREFERRED"));
        $REMOVAL_ALL_TEMPORAL_BOUNDS_IDENTICAL_INVERSE = makeKeyword("REMOVAL-ALL-TEMPORAL-BOUNDS-IDENTICAL-INVERSE");
        $list183 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("temporalBoundsIdentical")), makeKeyword("REQUIRED-PATTERN"),
                list(makeConstSym(("temporalBoundsIdentical")), makeKeyword("NOT-FULLY-BOUND"), list(makeKeyword("TEST"), makeSymbol("SBHL-TIME-INFERENCE-ARG-P"))), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-ALL-TEMPORAL-RELATION-COST*"), makeKeyword("COMPLETENESS"),
                makeKeyword("GROSSLY-INCOMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"),
                list(makeKeyword("TEMPLATE"), list(makeConstSym(("temporalBoundsIdentical")), makeKeyword("ANYTHING"), list(makeKeyword("BIND"), makeSymbol("TEMPORAL-THING"))), list(makeKeyword("VALUE"), makeSymbol("TEMPORAL-THING"))), makeKeyword("INPUT-ENCODE-PATTERN"),
                list(makeKeyword("CALL"), makeSymbol("POSSIBLY-BIND-TEMPORAL-INDEXICAL-IN-OBJECT"), makeKeyword("INPUT")), makeKeyword("OUTPUT-GENERATE-PATTERN"), list(makeKeyword("CALL"), makeSymbol("REMOVAL-ALL-TEMPORAL-BOUNDS-IDENTICAL-OUTPUT-GENERATE"), makeKeyword("INPUT")),
                makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(makeConstSym(("temporalBoundsIdentical")), makeKeyword("INPUT"), list(makeKeyword("VALUE"), makeSymbol("TEMPORAL-THING"))), makeKeyword("SUPPORT-MODULE"), makeKeyword("TIME"), makeKeyword("DOCUMENTATION"),
                makeString("(#$temporalBoundsIdentical <not-fully-bound> <TemporalThing>)") });
        $ALL_TEMPORAL_BOUNDS_IDENTICAL_INVERSE_POS = makeKeyword("ALL-TEMPORAL-BOUNDS-IDENTICAL-INVERSE-POS");
        $list185 = list(makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("temporalBoundsIdentical")), makeKeyword("REQUIRED-PATTERN"), list(makeConstSym(("temporalBoundsIdentical")), makeKeyword("NOT-FULLY-BOUND"), makeKeyword("ANYTHING")),
                makeKeyword("PREFERENCE-LEVEL"), makeKeyword("GROSSLY-DISPREFERRED"));
        $REMOVAL_NOT_TEMPORAL_BOUNDS_IDENTICAL = makeKeyword("REMOVAL-NOT-TEMPORAL-BOUNDS-IDENTICAL");
        $list187 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("PREDICATE"), makeConstSym(("temporalBoundsIdentical")), makeKeyword("REQUIRED-PATTERN"),
                list(makeConstSym(("temporalBoundsIdentical")), list(makeKeyword("TEST"), makeSymbol("SBHL-TIME-INFERENCE-ARG-P")), list(makeKeyword("TEST"), makeSymbol("SBHL-TIME-INFERENCE-ARG-P"))), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-NOT-TEMPORAL-RELATION-CHECK-COST*"),
                makeKeyword("EXPAND"), makeSymbol("REMOVAL-NOT-TEMPORAL-BOUNDS-IDENTICAL-EXPAND") });
        $$temporalBoundsIntersect = makeConstSym(("temporalBoundsIntersect"));
        $REMOVAL_TEMPORAL_BOUNDS_INTERSECT = makeKeyword("REMOVAL-TEMPORAL-BOUNDS-INTERSECT");
        $list190 = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("temporalBoundsIntersect")), makeKeyword("CHECK"), T, makeKeyword("REQUIRED-PATTERN"),
                list(makeConstSym(("temporalBoundsIntersect")), list(makeKeyword("TEST"), makeSymbol("SBHL-TIME-INFERENCE-ARG-P")), list(makeKeyword("TEST"), makeSymbol("SBHL-TIME-INFERENCE-ARG-P"))), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-TEMPORAL-RELATION-CHECK-COST*"),
                makeKeyword("INPUT-EXTRACT-PATTERN"),
                list(makeKeyword("TEMPLATE"), list(makeConstSym(("temporalBoundsIntersect")), list(makeKeyword("BIND"), makeSymbol("TEMPORAL-THING1")), list(makeKeyword("BIND"), makeSymbol("TEMPORAL-THING2"))),
                        list(list(makeKeyword("VALUE"), makeSymbol("TEMPORAL-THING1")), list(makeKeyword("VALUE"), makeSymbol("TEMPORAL-THING2")))),
                makeKeyword("INPUT-ENCODE-PATTERN"),
                ConsesLow.list(makeKeyword("TUPLE"), list(makeSymbol("TEMPORAL-THING1"), makeSymbol("TEMPORAL-THING2")),
                        list(list(makeKeyword("CALL"), makeSymbol("POSSIBLY-BIND-TEMPORAL-INDEXICAL-IN-OBJECT"), list(makeKeyword("VALUE"), makeSymbol("TEMPORAL-THING1"))),
                                list(makeKeyword("CALL"), makeSymbol("POSSIBLY-BIND-TEMPORAL-INDEXICAL-IN-OBJECT"), list(makeKeyword("VALUE"), makeSymbol("TEMPORAL-THING2"))))),
                makeKeyword("OUTPUT-CHECK-PATTERN"),
                list(makeKeyword("TUPLE"), list(makeSymbol("TEMPORAL-THING1"), makeSymbol("TEMPORAL-THING2")), list(makeKeyword("CALL"), makeSymbol("TEMPORAL-BOUNDS-INTERSECT?"), list(makeKeyword("VALUE"), makeSymbol("TEMPORAL-THING1")), list(makeKeyword("VALUE"), makeSymbol("TEMPORAL-THING2")))),
                makeKeyword("SUPPORT-MODULE"), makeKeyword("TIME"), makeKeyword("DOCUMENTATION"), makeString("(#$temporalBoundsIntersect <TemporalThing> <TemporalThing>)") });
        $sym191$REMOVAL_ALL_TEMPORAL_BOUNDS_INTERSECT_OUTPUT_GENERATE = makeSymbol("REMOVAL-ALL-TEMPORAL-BOUNDS-INTERSECT-OUTPUT-GENERATE");
        $REMOVAL_ALL_TEMPORAL_BOUNDS_INTERSECT = makeKeyword("REMOVAL-ALL-TEMPORAL-BOUNDS-INTERSECT");
        $list193 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("temporalBoundsIntersect")), makeKeyword("REQUIRED-PATTERN"),
                list(makeConstSym(("temporalBoundsIntersect")), list(makeKeyword("TEST"), makeSymbol("SBHL-TIME-INFERENCE-ARG-P")), makeKeyword("NOT-FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-ALL-TEMPORAL-RELATION-COST*"), makeKeyword("COMPLETENESS"),
                makeKeyword("GROSSLY-INCOMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"),
                list(makeKeyword("TEMPLATE"), list(makeConstSym(("temporalBoundsIntersect")), makeKeyword("ANYTHING"), list(makeKeyword("BIND"), makeSymbol("TEMPORAL-THING"))), list(makeKeyword("VALUE"), makeSymbol("TEMPORAL-THING"))), makeKeyword("INPUT-ENCODE-PATTERN"),
                list(makeKeyword("CALL"), makeSymbol("POSSIBLY-BIND-TEMPORAL-INDEXICAL-IN-OBJECT"), makeKeyword("INPUT")), makeKeyword("OUTPUT-GENERATE-PATTERN"), list(makeKeyword("CALL"), makeSymbol("REMOVAL-ALL-TEMPORAL-BOUNDS-INTERSECT-OUTPUT-GENERATE"), makeKeyword("INPUT")),
                makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(makeConstSym(("temporalBoundsIntersect")), makeKeyword("INPUT"), list(makeKeyword("VALUE"), makeSymbol("TEMPORAL-THING"))), makeKeyword("SUPPORT-MODULE"), makeKeyword("TIME"), makeKeyword("DOCUMENTATION"),
                makeString("(#$temporalBoundsIntersect <TemporalThing> <not-fully-bound>)") });
        $ALL_TEMPORAL_BOUNDS_INTERSECT_POS = makeKeyword("ALL-TEMPORAL-BOUNDS-INTERSECT-POS");
        $list195 = list(makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("temporalBoundsIntersect")), makeKeyword("REQUIRED-PATTERN"), list(makeConstSym(("temporalBoundsIntersect")), makeKeyword("ANYTHING"), makeKeyword("NOT-FULLY-BOUND")),
                makeKeyword("PREFERENCE-LEVEL"), makeKeyword("GROSSLY-DISPREFERRED"));
        $REMOVAL_ALL_TEMPORAL_BOUNDS_INTERSECT_INVERSE = makeKeyword("REMOVAL-ALL-TEMPORAL-BOUNDS-INTERSECT-INVERSE");
        $list197 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("temporalBoundsIntersect")), makeKeyword("REQUIRED-PATTERN"),
                list(makeConstSym(("temporalBoundsIntersect")), makeKeyword("NOT-FULLY-BOUND"), list(makeKeyword("TEST"), makeSymbol("SBHL-TIME-INFERENCE-ARG-P"))), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-ALL-TEMPORAL-RELATION-COST*"), makeKeyword("COMPLETENESS"),
                makeKeyword("GROSSLY-INCOMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"),
                list(makeKeyword("TEMPLATE"), list(makeConstSym(("temporalBoundsIntersect")), makeKeyword("ANYTHING"), list(makeKeyword("BIND"), makeSymbol("TEMPORAL-THING"))), list(makeKeyword("VALUE"), makeSymbol("TEMPORAL-THING"))), makeKeyword("INPUT-ENCODE-PATTERN"),
                list(makeKeyword("CALL"), makeSymbol("POSSIBLY-BIND-TEMPORAL-INDEXICAL-IN-OBJECT"), makeKeyword("INPUT")), makeKeyword("OUTPUT-GENERATE-PATTERN"), list(makeKeyword("CALL"), makeSymbol("REMOVAL-ALL-TEMPORAL-BOUNDS-INTERSECT-OUTPUT-GENERATE"), makeKeyword("INPUT")),
                makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(makeConstSym(("temporalBoundsIntersect")), makeKeyword("INPUT"), list(makeKeyword("VALUE"), makeSymbol("TEMPORAL-THING"))), makeKeyword("SUPPORT-MODULE"), makeKeyword("TIME"), makeKeyword("DOCUMENTATION"),
                makeString("(#$temporalBoundsIntersect <not-fully-bound> <TemporalThing>)") });
        $ALL_TEMPORAL_BOUNDS_INTERSECT_INVERSE_POS = makeKeyword("ALL-TEMPORAL-BOUNDS-INTERSECT-INVERSE-POS");
        $list199 = list(makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("temporalBoundsIntersect")), makeKeyword("REQUIRED-PATTERN"), list(makeConstSym(("temporalBoundsIntersect")), makeKeyword("NOT-FULLY-BOUND"), makeKeyword("ANYTHING")),
                makeKeyword("PREFERENCE-LEVEL"), makeKeyword("GROSSLY-DISPREFERRED"));
        $REMOVAL_NOT_TEMPORAL_BOUNDS_INTERSECT = makeKeyword("REMOVAL-NOT-TEMPORAL-BOUNDS-INTERSECT");
        $list201 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("PREDICATE"), makeConstSym(("temporalBoundsIntersect")), makeKeyword("REQUIRED-PATTERN"),
                list(makeConstSym(("temporalBoundsIntersect")), list(makeKeyword("TEST"), makeSymbol("SBHL-TIME-INFERENCE-ARG-P")), list(makeKeyword("TEST"), makeSymbol("SBHL-TIME-INFERENCE-ARG-P"))), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-NOT-TEMPORAL-RELATION-CHECK-COST*"),
                makeKeyword("EXPAND"), makeSymbol("REMOVAL-NOT-TEMPORAL-BOUNDS-INTERSECT-EXPAND") });
        $$temporallyCooriginating = makeConstSym(("temporallyCooriginating"));
        $REMOVAL_TEMPORALLY_COORIGINATING = makeKeyword("REMOVAL-TEMPORALLY-COORIGINATING");
        $list204 = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("temporallyCooriginating")), makeKeyword("CHECK"), T, makeKeyword("REQUIRED-PATTERN"),
                list(makeConstSym(("temporallyCooriginating")), list(makeKeyword("TEST"), makeSymbol("SBHL-TIME-INFERENCE-ARG-P")), list(makeKeyword("TEST"), makeSymbol("SBHL-TIME-INFERENCE-ARG-P"))), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-TEMPORAL-RELATION-CHECK-COST*"),
                makeKeyword("INPUT-EXTRACT-PATTERN"),
                list(makeKeyword("TEMPLATE"), list(makeConstSym(("temporallyCooriginating")), list(makeKeyword("BIND"), makeSymbol("TEMPORAL-THING1")), list(makeKeyword("BIND"), makeSymbol("TEMPORAL-THING2"))),
                        list(list(makeKeyword("VALUE"), makeSymbol("TEMPORAL-THING1")), list(makeKeyword("VALUE"), makeSymbol("TEMPORAL-THING2")))),
                makeKeyword("INPUT-ENCODE-PATTERN"),
                ConsesLow.list(makeKeyword("TUPLE"), list(makeSymbol("TEMPORAL-THING1"), makeSymbol("TEMPORAL-THING2")),
                        list(list(makeKeyword("CALL"), makeSymbol("POSSIBLY-BIND-TEMPORAL-INDEXICAL-IN-OBJECT"), list(makeKeyword("VALUE"), makeSymbol("TEMPORAL-THING1"))),
                                list(makeKeyword("CALL"), makeSymbol("POSSIBLY-BIND-TEMPORAL-INDEXICAL-IN-OBJECT"), list(makeKeyword("VALUE"), makeSymbol("TEMPORAL-THING2"))))),
                makeKeyword("OUTPUT-CHECK-PATTERN"),
                list(makeKeyword("TUPLE"), list(makeSymbol("TEMPORAL-THING1"), makeSymbol("TEMPORAL-THING2")), list(makeKeyword("CALL"), makeSymbol("TEMPORALLY-COORIGINATING?"), list(makeKeyword("VALUE"), makeSymbol("TEMPORAL-THING1")), list(makeKeyword("VALUE"), makeSymbol("TEMPORAL-THING2")))),
                makeKeyword("SUPPORT-MODULE"), makeKeyword("TIME"), makeKeyword("DOCUMENTATION"), makeString("(#$temporallyCooriginating <TemporalThing> <TemporalThing>)") });
        $sym205$REMOVAL_ALL_TEMPORALLY_COORIGINATING_OUTPUT_GENERATE = makeSymbol("REMOVAL-ALL-TEMPORALLY-COORIGINATING-OUTPUT-GENERATE");
        $REMOVAL_ALL_TEMPORALLY_COORIGINATING = makeKeyword("REMOVAL-ALL-TEMPORALLY-COORIGINATING");
        $list207 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("temporallyCooriginating")), makeKeyword("REQUIRED-PATTERN"),
                list(makeConstSym(("temporallyCooriginating")), list(makeKeyword("TEST"), makeSymbol("SBHL-TIME-INFERENCE-ARG-P")), makeKeyword("NOT-FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-ALL-TEMPORAL-RELATION-COST*"), makeKeyword("COMPLETENESS"),
                makeKeyword("GROSSLY-INCOMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"),
                list(makeKeyword("TEMPLATE"), list(makeConstSym(("temporallyCooriginating")), list(makeKeyword("BIND"), makeSymbol("TEMPORAL-THING")), makeKeyword("ANYTHING")), list(makeKeyword("VALUE"), makeSymbol("TEMPORAL-THING"))), makeKeyword("INPUT-ENCODE-PATTERN"),
                list(makeKeyword("CALL"), makeSymbol("POSSIBLY-BIND-TEMPORAL-INDEXICAL-IN-OBJECT"), makeKeyword("INPUT")), makeKeyword("OUTPUT-GENERATE-PATTERN"), list(makeKeyword("CALL"), makeSymbol("REMOVAL-ALL-TEMPORALLY-COORIGINATING-OUTPUT-GENERATE"), makeKeyword("INPUT")),
                makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(makeConstSym(("temporallyCooriginating")), list(makeKeyword("VALUE"), makeSymbol("TEMPORAL-THING")), makeKeyword("INPUT")), makeKeyword("SUPPORT-MODULE"), makeKeyword("TIME"), makeKeyword("DOCUMENTATION"),
                makeString("(#$temporallyCooriginating <TemporalThing> <not-fully-bound>") });
        $ALL_TEMPORALLY_COORIGINATING_POS = makeKeyword("ALL-TEMPORALLY-COORIGINATING-POS");
        $list209 = list(makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("temporallyCooriginating")), makeKeyword("REQUIRED-PATTERN"), list(makeConstSym(("temporallyCooriginating")), makeKeyword("ANYTHING"), makeKeyword("NOT-FULLY-BOUND")),
                makeKeyword("PREFERENCE-LEVEL"), makeKeyword("GROSSLY-DISPREFERRED"));
        $REMOVAL_ALL_TEMPORALLY_COORIGINATING_INVERSE = makeKeyword("REMOVAL-ALL-TEMPORALLY-COORIGINATING-INVERSE");
        $list211 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("temporallyCooriginating")), makeKeyword("REQUIRED-PATTERN"),
                list(makeConstSym(("temporallyCooriginating")), makeKeyword("NOT-FULLY-BOUND"), list(makeKeyword("TEST"), makeSymbol("SBHL-TIME-INFERENCE-ARG-P"))), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-ALL-TEMPORAL-RELATION-COST*"), makeKeyword("COMPLETENESS"),
                makeKeyword("GROSSLY-INCOMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"),
                list(makeKeyword("TEMPLATE"), list(makeConstSym(("temporallyCooriginating")), makeKeyword("ANYTHING"), list(makeKeyword("BIND"), makeSymbol("TEMPORAL-THING"))), list(makeKeyword("VALUE"), makeSymbol("TEMPORAL-THING"))), makeKeyword("INPUT-ENCODE-PATTERN"),
                list(makeKeyword("CALL"), makeSymbol("POSSIBLY-BIND-TEMPORAL-INDEXICAL-IN-OBJECT"), makeKeyword("INPUT")), makeKeyword("OUTPUT-GENERATE-PATTERN"), list(makeKeyword("CALL"), makeSymbol("REMOVAL-ALL-TEMPORALLY-COORIGINATING-OUTPUT-GENERATE"), makeKeyword("INPUT")),
                makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(makeConstSym(("temporallyCooriginating")), makeKeyword("INPUT"), list(makeKeyword("VALUE"), makeSymbol("TEMPORAL-THING"))), makeKeyword("SUPPORT-MODULE"), makeKeyword("TIME"), makeKeyword("DOCUMENTATION"),
                makeString("(#$temporallyCooriginating <not-fully-bound> <TemporalThing>)") });
        $ALL_TEMPORALLY_COORIGINATING_INVERSE_POS = makeKeyword("ALL-TEMPORALLY-COORIGINATING-INVERSE-POS");
        $list213 = list(makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("temporallyCooriginating")), makeKeyword("REQUIRED-PATTERN"), list(makeConstSym(("temporallyCooriginating")), makeKeyword("NOT-FULLY-BOUND"), makeKeyword("ANYTHING")),
                makeKeyword("PREFERENCE-LEVEL"), makeKeyword("GROSSLY-DISPREFERRED"));
        $REMOVAL_NOT_TEMPORALLY_COORIGINATING = makeKeyword("REMOVAL-NOT-TEMPORALLY-COORIGINATING");
        $list215 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("PREDICATE"), makeConstSym(("temporallyCooriginating")), makeKeyword("REQUIRED-PATTERN"),
                list(makeConstSym(("temporallyCooriginating")), list(makeKeyword("TEST"), makeSymbol("SBHL-TIME-INFERENCE-ARG-P")), list(makeKeyword("TEST"), makeSymbol("SBHL-TIME-INFERENCE-ARG-P"))), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-NOT-TEMPORAL-RELATION-CHECK-COST*"),
                makeKeyword("EXPAND"), makeSymbol("REMOVAL-NOT-TEMPORALLY-COORIGINATING-EXPAND") });
        $$temporallyCoterminal = makeConstSym(("temporallyCoterminal"));
        $REMOVAL_TEMPORALLY_COTERMINAL = makeKeyword("REMOVAL-TEMPORALLY-COTERMINAL");
        $list218 = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("temporallyCoterminal")), makeKeyword("CHECK"), T, makeKeyword("REQUIRED-PATTERN"),
                list(makeConstSym(("temporallyCoterminal")), list(makeKeyword("TEST"), makeSymbol("SBHL-TIME-INFERENCE-ARG-P")), list(makeKeyword("TEST"), makeSymbol("SBHL-TIME-INFERENCE-ARG-P"))), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-TEMPORAL-RELATION-CHECK-COST*"),
                makeKeyword("INPUT-EXTRACT-PATTERN"),
                list(makeKeyword("TEMPLATE"), list(makeConstSym(("temporallyCoterminal")), list(makeKeyword("BIND"), makeSymbol("TEMPORAL-THING1")), list(makeKeyword("BIND"), makeSymbol("TEMPORAL-THING2"))),
                        list(list(makeKeyword("VALUE"), makeSymbol("TEMPORAL-THING1")), list(makeKeyword("VALUE"), makeSymbol("TEMPORAL-THING2")))),
                makeKeyword("INPUT-ENCODE-PATTERN"),
                ConsesLow.list(makeKeyword("TUPLE"), list(makeSymbol("TEMPORAL-THING1"), makeSymbol("TEMPORAL-THING2")),
                        list(list(makeKeyword("CALL"), makeSymbol("POSSIBLY-BIND-TEMPORAL-INDEXICAL-IN-OBJECT"), list(makeKeyword("VALUE"), makeSymbol("TEMPORAL-THING1"))),
                                list(makeKeyword("CALL"), makeSymbol("POSSIBLY-BIND-TEMPORAL-INDEXICAL-IN-OBJECT"), list(makeKeyword("VALUE"), makeSymbol("TEMPORAL-THING2"))))),
                makeKeyword("OUTPUT-CHECK-PATTERN"),
                list(makeKeyword("TUPLE"), list(makeSymbol("TEMPORAL-THING1"), makeSymbol("TEMPORAL-THING2")), list(makeKeyword("CALL"), makeSymbol("TEMPORALLY-COTERMINAL?"), list(makeKeyword("VALUE"), makeSymbol("TEMPORAL-THING1")), list(makeKeyword("VALUE"), makeSymbol("TEMPORAL-THING2")))),
                makeKeyword("SUPPORT-MODULE"), makeKeyword("TIME"), makeKeyword("DOCUMENTATION"), makeString("(#$temporallyCoterminal <TemporalThing> <TemporalThing>)") });
        $sym219$REMOVAL_ALL_TEMPORALLY_COTERMINAL_OUTPUT_GENERATE = makeSymbol("REMOVAL-ALL-TEMPORALLY-COTERMINAL-OUTPUT-GENERATE");
        $REMOVAL_ALL_TEMPORALLY_COTERMINAL = makeKeyword("REMOVAL-ALL-TEMPORALLY-COTERMINAL");
        $list221 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("temporallyCoterminal")), makeKeyword("REQUIRED-PATTERN"),
                list(makeConstSym(("temporallyCoterminal")), list(makeKeyword("TEST"), makeSymbol("SBHL-TIME-INFERENCE-ARG-P")), makeKeyword("NOT-FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-ALL-TEMPORAL-RELATION-COST*"), makeKeyword("COMPLETENESS"),
                makeKeyword("GROSSLY-INCOMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"),
                list(makeKeyword("TEMPLATE"), list(makeConstSym(("temporallyCoterminal")), list(makeKeyword("BIND"), makeSymbol("TEMPORAL-THING")), makeKeyword("ANYTHING")), list(makeKeyword("VALUE"), makeSymbol("TEMPORAL-THING"))), makeKeyword("INPUT-ENCODE-PATTERN"),
                list(makeKeyword("CALL"), makeSymbol("POSSIBLY-BIND-TEMPORAL-INDEXICAL-IN-OBJECT"), makeKeyword("INPUT")), makeKeyword("OUTPUT-GENERATE-PATTERN"), list(makeKeyword("CALL"), makeSymbol("REMOVAL-ALL-TEMPORALLY-COTERMINAL-OUTPUT-GENERATE"), makeKeyword("INPUT")),
                makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(makeConstSym(("temporallyCoterminal")), list(makeKeyword("VALUE"), makeSymbol("TEMPORAL-THING")), makeKeyword("INPUT")), makeKeyword("SUPPORT-MODULE"), makeKeyword("TIME"), makeKeyword("DOCUMENTATION"),
                makeString("(#$temporallyCoterminal <TemporalThing> <not-fully-bound>") });
        $ALL_TEMPORALLY_COTERMINAL_POS = makeKeyword("ALL-TEMPORALLY-COTERMINAL-POS");
        $list223 = list(makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("temporallyCoterminal")), makeKeyword("REQUIRED-PATTERN"), list(makeConstSym(("temporallyCoterminal")), makeKeyword("ANYTHING"), makeKeyword("NOT-FULLY-BOUND")), makeKeyword("PREFERENCE-LEVEL"),
                makeKeyword("GROSSLY-DISPREFERRED"));
        $REMOVAL_ALL_TEMPORALLY_COTERMINAL_INVERSE = makeKeyword("REMOVAL-ALL-TEMPORALLY-COTERMINAL-INVERSE");
        $list225 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("temporallyCoterminal")), makeKeyword("REQUIRED-PATTERN"),
                list(makeConstSym(("temporallyCoterminal")), makeKeyword("NOT-FULLY-BOUND"), list(makeKeyword("TEST"), makeSymbol("SBHL-TIME-INFERENCE-ARG-P"))), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-ALL-TEMPORAL-RELATION-COST*"), makeKeyword("COMPLETENESS"),
                makeKeyword("GROSSLY-INCOMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"),
                list(makeKeyword("TEMPLATE"), list(makeConstSym(("temporallyCoterminal")), makeKeyword("ANYTHING"), list(makeKeyword("BIND"), makeSymbol("TEMPORAL-THING"))), list(makeKeyword("VALUE"), makeSymbol("TEMPORAL-THING"))), makeKeyword("INPUT-ENCODE-PATTERN"),
                list(makeKeyword("CALL"), makeSymbol("POSSIBLY-BIND-TEMPORAL-INDEXICAL-IN-OBJECT"), makeKeyword("INPUT")), makeKeyword("OUTPUT-GENERATE-PATTERN"), list(makeKeyword("CALL"), makeSymbol("REMOVAL-ALL-TEMPORALLY-COTERMINAL-OUTPUT-GENERATE"), makeKeyword("INPUT")),
                makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(makeConstSym(("temporallyCoterminal")), makeKeyword("INPUT"), list(makeKeyword("VALUE"), makeSymbol("TEMPORAL-THING"))), makeKeyword("SUPPORT-MODULE"), makeKeyword("TIME"), makeKeyword("DOCUMENTATION"),
                makeString("(#$temporallyCoterminal <not-fully-bound> <TemporalThing>)") });
        $ALL_TEMPORALLY_COTERMINAL_INVERSE_POS = makeKeyword("ALL-TEMPORALLY-COTERMINAL-INVERSE-POS");
        $list227 = list(makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("temporallyCoterminal")), makeKeyword("REQUIRED-PATTERN"), list(makeConstSym(("temporallyCoterminal")), makeKeyword("NOT-FULLY-BOUND"), makeKeyword("ANYTHING")), makeKeyword("PREFERENCE-LEVEL"),
                makeKeyword("GROSSLY-DISPREFERRED"));
        $REMOVAL_NOT_TEMPORALLY_COTERMINAL = makeKeyword("REMOVAL-NOT-TEMPORALLY-COTERMINAL");
        $list229 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("PREDICATE"), makeConstSym(("temporallyCoterminal")), makeKeyword("REQUIRED-PATTERN"),
                list(makeConstSym(("temporallyCoterminal")), list(makeKeyword("TEST"), makeSymbol("SBHL-TIME-INFERENCE-ARG-P")), list(makeKeyword("TEST"), makeSymbol("SBHL-TIME-INFERENCE-ARG-P"))), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-NOT-TEMPORAL-RELATION-CHECK-COST*"),
                makeKeyword("EXPAND"), makeSymbol("REMOVAL-NOT-TEMPORALLY-COTERMINAL-EXPAND") });
        $$contiguousAfter = makeConstSym(("contiguousAfter"));
        $REMOVAL_CONTIGUOUS_AFTER = makeKeyword("REMOVAL-CONTIGUOUS-AFTER");
        $list232 = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("contiguousAfter")), makeKeyword("CHECK"), T, makeKeyword("REQUIRED-PATTERN"),
                list(makeConstSym(("contiguousAfter")), list(makeKeyword("TEST"), makeSymbol("SBHL-TIME-INFERENCE-ARG-P")), list(makeKeyword("TEST"), makeSymbol("SBHL-TIME-INFERENCE-ARG-P"))), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-TEMPORAL-RELATION-CHECK-COST*"),
                makeKeyword("INPUT-EXTRACT-PATTERN"),
                list(makeKeyword("TEMPLATE"), list(makeConstSym(("contiguousAfter")), ConsesLow.list(makeKeyword("BIND"), makeSymbol("TEMPORAL-THING1")), list(makeKeyword("BIND"), makeSymbol("TEMPORAL-THING2"))),
                        list(list(makeKeyword("VALUE"), makeSymbol("TEMPORAL-THING1")), list(makeKeyword("VALUE"), makeSymbol("TEMPORAL-THING2")))),
                makeKeyword("INPUT-ENCODE-PATTERN"),
                ConsesLow.list(makeKeyword("TUPLE"), list(makeSymbol("TEMPORAL-THING1"), makeSymbol("TEMPORAL-THING2")),
                        list(list(makeKeyword("CALL"), makeSymbol("POSSIBLY-BIND-TEMPORAL-INDEXICAL-IN-OBJECT"), list(makeKeyword("VALUE"), makeSymbol("TEMPORAL-THING1"))),
                                list(makeKeyword("CALL"), makeSymbol("POSSIBLY-BIND-TEMPORAL-INDEXICAL-IN-OBJECT"), list(makeKeyword("VALUE"), makeSymbol("TEMPORAL-THING2"))))),
                makeKeyword("OUTPUT-CHECK-PATTERN"),
                list(makeKeyword("TUPLE"), list(makeSymbol("TEMPORAL-THING1"), makeSymbol("TEMPORAL-THING2")), list(makeKeyword("CALL"), makeSymbol("CONTIGUOUS-AFTER?"), list(makeKeyword("VALUE"), makeSymbol("TEMPORAL-THING1")), list(makeKeyword("VALUE"), makeSymbol("TEMPORAL-THING2")))),
                makeKeyword("SUPPORT-MODULE"), makeKeyword("TIME"), makeKeyword("DOCUMENTATION"), makeString("(#$contiguousAfter <TemporalThing> <TemporalThing>)") });
        $sym233$REMOVAL_ALL_CONTIGUOUS_AFTER_OUTPUT_GENERATE = makeSymbol("REMOVAL-ALL-CONTIGUOUS-AFTER-OUTPUT-GENERATE");
        $REMOVAL_ALL_CONTIGUOUS_AFTER = makeKeyword("REMOVAL-ALL-CONTIGUOUS-AFTER");
        $list235 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("contiguousAfter")), makeKeyword("REQUIRED-PATTERN"),
                list(makeConstSym(("contiguousAfter")), list(makeKeyword("TEST"), makeSymbol("SBHL-TIME-INFERENCE-ARG-P")), makeKeyword("NOT-FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-ALL-TEMPORAL-RELATION-COST*"), makeKeyword("COMPLETENESS"),
                makeKeyword("GROSSLY-INCOMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(makeConstSym(("contiguousAfter")), list(makeKeyword("BIND"), makeSymbol("TEMPORAL-THING")), makeKeyword("ANYTHING")), list(makeKeyword("VALUE"), makeSymbol("TEMPORAL-THING"))),
                makeKeyword("INPUT-ENCODE-PATTERN"), list(makeKeyword("CALL"), makeSymbol("POSSIBLY-BIND-TEMPORAL-INDEXICAL-IN-OBJECT"), makeKeyword("INPUT")), makeKeyword("OUTPUT-GENERATE-PATTERN"),
                list(makeKeyword("CALL"), makeSymbol("REMOVAL-ALL-CONTIGUOUS-AFTER-OUTPUT-GENERATE"), makeKeyword("INPUT")), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(makeConstSym(("contiguousAfter")), list(makeKeyword("VALUE"), makeSymbol("TEMPORAL-THING")), makeKeyword("INPUT")),
                makeKeyword("SUPPORT-MODULE"), makeKeyword("TIME"), makeKeyword("DOCUMENTATION"), makeString("(#$contiguousAfter <TemporalThing> <not-fully-bound>)") });
        $ALL_CONTIGUOUS_AFTER_POS = makeKeyword("ALL-CONTIGUOUS-AFTER-POS");
        $list237 = list(makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("contiguousAfter")), makeKeyword("REQUIRED-PATTERN"), list(makeConstSym(("contiguousAfter")), makeKeyword("ANYTHING"), makeKeyword("NOT-FULLY-BOUND")), makeKeyword("PREFERENCE-LEVEL"),
                makeKeyword("GROSSLY-DISPREFERRED"));
        $sym238$REMOVAL_ALL_CONTIGUOUS_AFTER_INVERSE_OUTPUT_GENERATE = makeSymbol("REMOVAL-ALL-CONTIGUOUS-AFTER-INVERSE-OUTPUT-GENERATE");
        $REMOVAL_ALL_CONTIGUOUS_AFTER_INVERSE = makeKeyword("REMOVAL-ALL-CONTIGUOUS-AFTER-INVERSE");
        $list240 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("contiguousAfter")), makeKeyword("REQUIRED-PATTERN"),
                list(makeConstSym(("contiguousAfter")), makeKeyword("NOT-FULLY-BOUND"), list(makeKeyword("TEST"), makeSymbol("SBHL-TIME-INFERENCE-ARG-P"))), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-ALL-TEMPORAL-RELATION-INVERSE-COST*"), makeKeyword("COMPLETENESS"),
                makeKeyword("GROSSLY-INCOMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(makeConstSym(("contiguousAfter")), makeKeyword("ANYTHING"), list(makeKeyword("BIND"), makeSymbol("TEMPORAL-THING"))), list(makeKeyword("VALUE"), makeSymbol("TEMPORAL-THING"))),
                makeKeyword("INPUT-ENCODE-PATTERN"), list(makeKeyword("CALL"), makeSymbol("POSSIBLY-BIND-TEMPORAL-INDEXICAL-IN-OBJECT"), makeKeyword("INPUT")), makeKeyword("OUTPUT-GENERATE-PATTERN"),
                list(makeKeyword("CALL"), makeSymbol("REMOVAL-ALL-CONTIGUOUS-AFTER-INVERSE-OUTPUT-GENERATE"), makeKeyword("INPUT")), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(makeConstSym(("contiguousAfter")), makeKeyword("INPUT"), list(makeKeyword("VALUE"), makeSymbol("TEMPORAL-THING"))),
                makeKeyword("SUPPORT-MODULE"), makeKeyword("TIME"), makeKeyword("DOCUMENTATION"), makeString("(#$contiguousAfter <not-fully-bound> <TemporalThing>)") });
        $ALL_CONTIGUOUS_AFTER_INVERSE_POS = makeKeyword("ALL-CONTIGUOUS-AFTER-INVERSE-POS");
        $list242 = list(makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("contiguousAfter")), makeKeyword("REQUIRED-PATTERN"), list(makeConstSym(("contiguousAfter")), makeKeyword("NOT-FULLY-BOUND"), makeKeyword("ANYTHING")), makeKeyword("PREFERENCE-LEVEL"),
                makeKeyword("GROSSLY-DISPREFERRED"));
        $REMOVAL_NOT_CONTIGUOUS_AFTER = makeKeyword("REMOVAL-NOT-CONTIGUOUS-AFTER");
        $list244 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("PREDICATE"), makeConstSym(("contiguousAfter")), makeKeyword("REQUIRED-PATTERN"),
                list(makeConstSym(("contiguousAfter")), list(makeKeyword("TEST"), makeSymbol("SBHL-TIME-INFERENCE-ARG-P")), list(makeKeyword("TEST"), makeSymbol("SBHL-TIME-INFERENCE-ARG-P"))), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-NOT-TEMPORAL-RELATION-CHECK-COST*"),
                makeKeyword("EXPAND"), makeSymbol("REMOVAL-NOT-CONTIGUOUS-AFTER-EXPAND") });
        $$startsDuring = makeConstSym(("startsDuring"));
        $REMOVAL_STARTS_DURING = makeKeyword("REMOVAL-STARTS-DURING");
        $list247 = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("startsDuring")), makeKeyword("CHECK"), T, makeKeyword("REQUIRED-PATTERN"),
                list(makeConstSym(("startsDuring")), list(makeKeyword("TEST"), makeSymbol("SBHL-TIME-INFERENCE-ARG-P")), list(makeKeyword("TEST"), makeSymbol("SBHL-TIME-INFERENCE-ARG-P"))), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-TEMPORAL-RELATION-CHECK-COST*"),
                makeKeyword("INPUT-EXTRACT-PATTERN"),
                list(makeKeyword("TEMPLATE"), list(makeConstSym(("startsDuring")), ConsesLow.list(makeKeyword("BIND"), makeSymbol("TEMPORAL-THING1")), list(makeKeyword("BIND"), makeSymbol("TEMPORAL-THING2"))),
                        list(list(makeKeyword("VALUE"), makeSymbol("TEMPORAL-THING1")), list(makeKeyword("VALUE"), makeSymbol("TEMPORAL-THING2")))),
                makeKeyword("INPUT-ENCODE-PATTERN"),
                ConsesLow.list(makeKeyword("TUPLE"), list(makeSymbol("TEMPORAL-THING1"), makeSymbol("TEMPORAL-THING2")),
                        list(list(makeKeyword("CALL"), makeSymbol("POSSIBLY-BIND-TEMPORAL-INDEXICAL-IN-OBJECT"), list(makeKeyword("VALUE"), makeSymbol("TEMPORAL-THING1"))),
                                list(makeKeyword("CALL"), makeSymbol("POSSIBLY-BIND-TEMPORAL-INDEXICAL-IN-OBJECT"), list(makeKeyword("VALUE"), makeSymbol("TEMPORAL-THING2"))))),
                makeKeyword("OUTPUT-CHECK-PATTERN"),
                list(makeKeyword("TUPLE"), list(makeSymbol("TEMPORAL-THING1"), makeSymbol("TEMPORAL-THING2")), list(makeKeyword("CALL"), makeSymbol("STARTS-DURING?"), list(makeKeyword("VALUE"), makeSymbol("TEMPORAL-THING1")), list(makeKeyword("VALUE"), makeSymbol("TEMPORAL-THING2")))),
                makeKeyword("SUPPORT-MODULE"), makeKeyword("TIME"), makeKeyword("DOCUMENTATION"), makeString("(#$startsDuring <TemporalThing> <TemporalThing>)") });
        $sym248$REMOVAL_ALL_STARTS_DURING_OUTPUT_GENERATE = makeSymbol("REMOVAL-ALL-STARTS-DURING-OUTPUT-GENERATE");
        $REMOVAL_ALL_STARTS_DURING = makeKeyword("REMOVAL-ALL-STARTS-DURING");
        $list250 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("startsDuring")), makeKeyword("REQUIRED-PATTERN"),
                list(makeConstSym(("startsDuring")), list(makeKeyword("TEST"), makeSymbol("SBHL-TIME-INFERENCE-ARG-P")), makeKeyword("NOT-FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-ALL-TEMPORAL-RELATION-COST*"), makeKeyword("COMPLETENESS"),
                makeKeyword("GROSSLY-INCOMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(makeConstSym(("startsDuring")), list(makeKeyword("BIND"), makeSymbol("TEMPORAL-THING")), makeKeyword("ANYTHING")), list(makeKeyword("VALUE"), makeSymbol("TEMPORAL-THING"))),
                makeKeyword("INPUT-ENCODE-PATTERN"), list(makeKeyword("CALL"), makeSymbol("POSSIBLY-BIND-TEMPORAL-INDEXICAL-IN-OBJECT"), makeKeyword("INPUT")), makeKeyword("OUTPUT-GENERATE-PATTERN"),
                list(makeKeyword("CALL"), makeSymbol("REMOVAL-ALL-STARTS-DURING-OUTPUT-GENERATE"), makeKeyword("INPUT")), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(makeConstSym(("startsDuring")), list(makeKeyword("VALUE"), makeSymbol("TEMPORAL-THING")), makeKeyword("INPUT")),
                makeKeyword("SUPPORT-MODULE"), makeKeyword("TIME"), makeKeyword("DOCUMENTATION"), makeString("(#$startsDuring <TemporalThing> <not-fully-bound>)") });
        $ALL_STARTS_DURING_POS = makeKeyword("ALL-STARTS-DURING-POS");
        $list252 = list(makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("startsDuring")), makeKeyword("REQUIRED-PATTERN"), list(makeConstSym(("startsDuring")), makeKeyword("ANYTHING"), makeKeyword("NOT-FULLY-BOUND")), makeKeyword("PREFERENCE-LEVEL"),
                makeKeyword("GROSSLY-DISPREFERRED"));
        $sym253$REMOVAL_ALL_STARTS_DURING_INVERSE_OUTPUT_GENERATE = makeSymbol("REMOVAL-ALL-STARTS-DURING-INVERSE-OUTPUT-GENERATE");
        $REMOVAL_ALL_STARTS_DURING_INVERSE = makeKeyword("REMOVAL-ALL-STARTS-DURING-INVERSE");
        $list255 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("startsDuring")), makeKeyword("REQUIRED-PATTERN"),
                list(makeConstSym(("startsDuring")), makeKeyword("NOT-FULLY-BOUND"), list(makeKeyword("TEST"), makeSymbol("SBHL-TIME-INFERENCE-ARG-P"))), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-ALL-TEMPORAL-RELATION-INVERSE-COST*"), makeKeyword("COMPLETENESS"),
                makeKeyword("GROSSLY-INCOMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(makeConstSym(("startsDuring")), makeKeyword("ANYTHING"), list(makeKeyword("BIND"), makeSymbol("TEMPORAL-THING"))), list(makeKeyword("VALUE"), makeSymbol("TEMPORAL-THING"))),
                makeKeyword("INPUT-ENCODE-PATTERN"), list(makeKeyword("CALL"), makeSymbol("POSSIBLY-BIND-TEMPORAL-INDEXICAL-IN-OBJECT"), makeKeyword("INPUT")), makeKeyword("OUTPUT-GENERATE-PATTERN"),
                list(makeKeyword("CALL"), makeSymbol("REMOVAL-ALL-STARTS-DURING-INVERSE-OUTPUT-GENERATE"), makeKeyword("INPUT")), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(makeConstSym(("startsDuring")), makeKeyword("INPUT"), list(makeKeyword("VALUE"), makeSymbol("TEMPORAL-THING"))),
                makeKeyword("SUPPORT-MODULE"), makeKeyword("TIME"), makeKeyword("DOCUMENTATION"), makeString("(#$startsDuring <not-fully-bound> <TemporalThing>)") });
        $ALL_STARTS_DURING_INVERSE_POS = makeKeyword("ALL-STARTS-DURING-INVERSE-POS");
        $list257 = list(makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("startsDuring")), makeKeyword("REQUIRED-PATTERN"), list(makeConstSym(("startsDuring")), makeKeyword("NOT-FULLY-BOUND"), makeKeyword("ANYTHING")), makeKeyword("PREFERENCE-LEVEL"),
                makeKeyword("GROSSLY-DISPREFERRED"));
        $REMOVAL_NOT_STARTS_DURING = makeKeyword("REMOVAL-NOT-STARTS-DURING");
        $list259 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("PREDICATE"), makeConstSym(("startsDuring")), makeKeyword("REQUIRED-PATTERN"),
                list(makeConstSym(("startsDuring")), list(makeKeyword("TEST"), makeSymbol("SBHL-TIME-INFERENCE-ARG-P")), list(makeKeyword("TEST"), makeSymbol("SBHL-TIME-INFERENCE-ARG-P"))), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-NOT-TEMPORAL-RELATION-CHECK-COST*"),
                makeKeyword("EXPAND"), makeSymbol("REMOVAL-NOT-STARTS-DURING-EXPAND") });
        $$endsDuring = makeConstSym(("endsDuring"));
        $REMOVAL_ENDS_DURING = makeKeyword("REMOVAL-ENDS-DURING");
        $list262 = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("endsDuring")), makeKeyword("CHECK"), T, makeKeyword("REQUIRED-PATTERN"),
                list(makeConstSym(("endsDuring")), list(makeKeyword("TEST"), makeSymbol("SBHL-TIME-INFERENCE-ARG-P")), list(makeKeyword("TEST"), makeSymbol("SBHL-TIME-INFERENCE-ARG-P"))), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-TEMPORAL-RELATION-CHECK-COST*"),
                makeKeyword("INPUT-EXTRACT-PATTERN"),
                list(makeKeyword("TEMPLATE"), list(makeConstSym(("endsDuring")), ConsesLow.list(makeKeyword("BIND"), makeSymbol("TEMPORAL-THING1")), list(makeKeyword("BIND"), makeSymbol("TEMPORAL-THING2"))),
                        list(list(makeKeyword("VALUE"), makeSymbol("TEMPORAL-THING1")), list(makeKeyword("VALUE"), makeSymbol("TEMPORAL-THING2")))),
                makeKeyword("INPUT-ENCODE-PATTERN"),
                ConsesLow.list(makeKeyword("TUPLE"), list(makeSymbol("TEMPORAL-THING1"), makeSymbol("TEMPORAL-THING2")),
                        list(list(makeKeyword("CALL"), makeSymbol("POSSIBLY-BIND-TEMPORAL-INDEXICAL-IN-OBJECT"), list(makeKeyword("VALUE"), makeSymbol("TEMPORAL-THING1"))),
                                list(makeKeyword("CALL"), makeSymbol("POSSIBLY-BIND-TEMPORAL-INDEXICAL-IN-OBJECT"), list(makeKeyword("VALUE"), makeSymbol("TEMPORAL-THING2"))))),
                makeKeyword("OUTPUT-CHECK-PATTERN"),
                list(makeKeyword("TUPLE"), list(makeSymbol("TEMPORAL-THING1"), makeSymbol("TEMPORAL-THING2")), list(makeKeyword("CALL"), makeSymbol("ENDS-DURING?"), list(makeKeyword("VALUE"), makeSymbol("TEMPORAL-THING1")), list(makeKeyword("VALUE"), makeSymbol("TEMPORAL-THING2")))),
                makeKeyword("SUPPORT-MODULE"), makeKeyword("TIME"), makeKeyword("DOCUMENTATION"), makeString("(#$endsDuring <TemporalThing> <TemporalThing>)") });
        $sym263$REMOVAL_ALL_ENDS_DURING_OUTPUT_GENERATE = makeSymbol("REMOVAL-ALL-ENDS-DURING-OUTPUT-GENERATE");
        $REMOVAL_ALL_ENDS_DURING = makeKeyword("REMOVAL-ALL-ENDS-DURING");
        $list265 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("endsDuring")), makeKeyword("REQUIRED-PATTERN"),
                list(makeConstSym(("endsDuring")), list(makeKeyword("TEST"), makeSymbol("SBHL-TIME-INFERENCE-ARG-P")), makeKeyword("NOT-FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-ALL-TEMPORAL-RELATION-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("GROSSLY-INCOMPLETE"),
                makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(makeConstSym(("endsDuring")), list(makeKeyword("BIND"), makeSymbol("TEMPORAL-THING")), makeKeyword("ANYTHING")), list(makeKeyword("VALUE"), makeSymbol("TEMPORAL-THING"))), makeKeyword("INPUT-ENCODE-PATTERN"),
                list(makeKeyword("CALL"), makeSymbol("POSSIBLY-BIND-TEMPORAL-INDEXICAL-IN-OBJECT"), makeKeyword("INPUT")), makeKeyword("OUTPUT-GENERATE-PATTERN"), list(makeKeyword("CALL"), makeSymbol("REMOVAL-ALL-ENDS-DURING-OUTPUT-GENERATE"), makeKeyword("INPUT")),
                makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(makeConstSym(("endsDuring")), list(makeKeyword("VALUE"), makeSymbol("TEMPORAL-THING")), makeKeyword("INPUT")), makeKeyword("SUPPORT-MODULE"), makeKeyword("TIME"), makeKeyword("DOCUMENTATION"),
                makeString("(#$endsDuring <TemporalThing> <not-fully-bound>)") });
        $ALL_ENDS_DURING_POS = makeKeyword("ALL-ENDS-DURING-POS");
        $list267 = list(makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("endsDuring")), makeKeyword("REQUIRED-PATTERN"), list(makeConstSym(("endsDuring")), makeKeyword("ANYTHING"), makeKeyword("NOT-FULLY-BOUND")), makeKeyword("PREFERENCE-LEVEL"),
                makeKeyword("GROSSLY-DISPREFERRED"));
        $sym268$REMOVAL_ALL_ENDS_DURING_INVERSE_OUTPUT_GENERATE = makeSymbol("REMOVAL-ALL-ENDS-DURING-INVERSE-OUTPUT-GENERATE");
        $REMOVAL_ALL_ENDS_DURING_INVERSE = makeKeyword("REMOVAL-ALL-ENDS-DURING-INVERSE");
        $list270 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("endsDuring")), makeKeyword("REQUIRED-PATTERN"),
                list(makeConstSym(("endsDuring")), makeKeyword("NOT-FULLY-BOUND"), list(makeKeyword("TEST"), makeSymbol("SBHL-TIME-INFERENCE-ARG-P"))), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-ALL-TEMPORAL-RELATION-INVERSE-COST*"), makeKeyword("COMPLETENESS"),
                makeKeyword("GROSSLY-INCOMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(makeConstSym(("endsDuring")), makeKeyword("ANYTHING"), list(makeKeyword("BIND"), makeSymbol("TEMPORAL-THING"))), list(makeKeyword("VALUE"), makeSymbol("TEMPORAL-THING"))),
                makeKeyword("INPUT-ENCODE-PATTERN"), list(makeKeyword("CALL"), makeSymbol("POSSIBLY-BIND-TEMPORAL-INDEXICAL-IN-OBJECT"), makeKeyword("INPUT")), makeKeyword("OUTPUT-GENERATE-PATTERN"),
                list(makeKeyword("CALL"), makeSymbol("REMOVAL-ALL-ENDS-DURING-INVERSE-OUTPUT-GENERATE"), makeKeyword("INPUT")), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(makeConstSym(("endsDuring")), makeKeyword("INPUT"), list(makeKeyword("VALUE"), makeSymbol("TEMPORAL-THING"))),
                makeKeyword("SUPPORT-MODULE"), makeKeyword("TIME"), makeKeyword("DOCUMENTATION"), makeString("(#$endsDuring <not-fully-bound> <TemporalThing>)") });
        $ALL_ENDS_DURING_INVERSE_POS = makeKeyword("ALL-ENDS-DURING-INVERSE-POS");
        $list272 = list(makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("endsDuring")), makeKeyword("REQUIRED-PATTERN"), list(makeConstSym(("endsDuring")), makeKeyword("NOT-FULLY-BOUND"), makeKeyword("ANYTHING")), makeKeyword("PREFERENCE-LEVEL"),
                makeKeyword("GROSSLY-DISPREFERRED"));
        $REMOVAL_NOT_ENDS_DURING = makeKeyword("REMOVAL-NOT-ENDS-DURING");
        $list274 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("PREDICATE"), makeConstSym(("endsDuring")), makeKeyword("REQUIRED-PATTERN"),
                list(makeConstSym(("endsDuring")), list(makeKeyword("TEST"), makeSymbol("SBHL-TIME-INFERENCE-ARG-P")), list(makeKeyword("TEST"), makeSymbol("SBHL-TIME-INFERENCE-ARG-P"))), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-NOT-TEMPORAL-RELATION-CHECK-COST*"), makeKeyword("EXPAND"),
                makeSymbol("REMOVAL-NOT-ENDS-DURING-EXPAND") });
        $$startingDate = makeConstSym(("startingDate"));
        $REMOVAL_STARTING_DATE = makeKeyword("REMOVAL-STARTING-DATE");
        $list277 = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("startingDate")), makeKeyword("CHECK"), T, makeKeyword("REQUIRED-PATTERN"),
                list(makeConstSym(("startingDate")), list(makeKeyword("TEST"), makeSymbol("SBHL-TIME-INFERENCE-ARG-P")), list(makeKeyword("TEST"), makeSymbol("SBHL-TIME-INFERENCE-ARG-P"))), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-TEMPORAL-RELATION-CHECK-COST*"),
                makeKeyword("INPUT-EXTRACT-PATTERN"),
                list(makeKeyword("TEMPLATE"), list(makeConstSym(("startingDate")), list(makeKeyword("BIND"), makeSymbol("TEMPORAL-THING")), list(makeKeyword("BIND"), makeSymbol("DATE"))), list(list(makeKeyword("VALUE"), makeSymbol("TEMPORAL-THING")), list(makeKeyword("VALUE"), makeSymbol("DATE")))),
                makeKeyword("INPUT-ENCODE-PATTERN"),
                ConsesLow.list(makeKeyword("TUPLE"), list(makeSymbol("TEMPORAL-THING"), makeSymbol("DATE")),
                        list(list(makeKeyword("CALL"), makeSymbol("POSSIBLY-BIND-TEMPORAL-INDEXICAL-IN-OBJECT"), list(makeKeyword("VALUE"), makeSymbol("TEMPORAL-THING"))),
                                list(makeKeyword("CALL"), makeSymbol("POSSIBLY-BIND-TEMPORAL-INDEXICAL-IN-OBJECT"), list(makeKeyword("VALUE"), makeSymbol("DATE"))))),
                makeKeyword("OUTPUT-CHECK-PATTERN"), list(makeKeyword("TUPLE"), list(makeSymbol("TEMPORAL-THING"), makeSymbol("DATE")), list(makeKeyword("CALL"), makeSymbol("STARTING-DATE?"), list(makeKeyword("VALUE"), makeSymbol("TEMPORAL-THING")), list(makeKeyword("VALUE"), makeSymbol("DATE")))),
                makeKeyword("SUPPORT-MODULE"), makeKeyword("TIME"), makeKeyword("DOCUMENTATION"), makeString("(#$startingDate <TemporalThing> <Date>)") });
        $sym278$REMOVAL_ALL_STARTING_DATE_INVERSE_OUTPUT_GENERATE = makeSymbol("REMOVAL-ALL-STARTING-DATE-INVERSE-OUTPUT-GENERATE");
        $REMOVAL_ALL_STARTING_DATE_INVERSE = makeKeyword("REMOVAL-ALL-STARTING-DATE-INVERSE");
        $list280 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("startingDate")), makeKeyword("REQUIRED-PATTERN"),
                list(makeConstSym(("startingDate")), makeKeyword("NOT-FULLY-BOUND"), list(makeKeyword("TEST"), makeSymbol("SBHL-TIME-INFERENCE-ARG-P"))), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-ALL-TEMPORAL-RELATION-INVERSE-COST*"), makeKeyword("COMPLETENESS"),
                makeKeyword("GROSSLY-INCOMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(makeConstSym(("startingDate")), makeKeyword("ANYTHING"), list(makeKeyword("BIND"), makeSymbol("DATE"))), list(makeKeyword("VALUE"), makeSymbol("DATE"))),
                makeKeyword("INPUT-ENCODE-PATTERN"), list(makeKeyword("CALL"), makeSymbol("POSSIBLY-BIND-TEMPORAL-INDEXICAL-IN-OBJECT"), makeKeyword("INPUT")), makeKeyword("OUTPUT-GENERATE-PATTERN"),
                list(makeKeyword("CALL"), makeSymbol("REMOVAL-ALL-STARTING-DATE-INVERSE-OUTPUT-GENERATE"), makeKeyword("INPUT")), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(makeConstSym(("startingDate")), makeKeyword("INPUT"), list(makeKeyword("VALUE"), makeSymbol("DATE"))),
                makeKeyword("SUPPORT-MODULE"), makeKeyword("TIME"), makeKeyword("DOCUMENTATION"), makeString("(#$startingDate <not-fully-bound> <Date>)") });
        $ALL_STARTING_DATE_INVERSE_POS = makeKeyword("ALL-STARTING-DATE-INVERSE-POS");
        $list282 = list(makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("startingDate")), makeKeyword("REQUIRED-PATTERN"), list(makeConstSym(("startingDate")), makeKeyword("NOT-FULLY-BOUND"), makeKeyword("ANYTHING")), makeKeyword("PREFERENCE-LEVEL"),
                makeKeyword("GROSSLY-DISPREFERRED"));
        $REMOVAL_NOT_STARTING_DATE = makeKeyword("REMOVAL-NOT-STARTING-DATE");
        $list284 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("PREDICATE"), makeConstSym(("startingDate")), makeKeyword("REQUIRED-PATTERN"),
                list(makeConstSym(("startingDate")), list(makeKeyword("TEST"), makeSymbol("SBHL-TIME-INFERENCE-ARG-P")), list(makeKeyword("TEST"), makeSymbol("SBHL-TIME-INFERENCE-ARG-P"))), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-NOT-TEMPORAL-RELATION-CHECK-COST*"),
                makeKeyword("EXPAND"), makeSymbol("REMOVAL-NOT-STARTING-DATE-EXPAND") });
        $$endingDate = makeConstSym(("endingDate"));
        $REMOVAL_ENDING_DATE = makeKeyword("REMOVAL-ENDING-DATE");
        $list287 = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("endingDate")), makeKeyword("CHECK"), T, makeKeyword("REQUIRED-PATTERN"),
                list(makeConstSym(("endingDate")), list(makeKeyword("TEST"), makeSymbol("SBHL-TIME-INFERENCE-ARG-P")), list(makeKeyword("TEST"), makeSymbol("SBHL-TIME-INFERENCE-ARG-P"))), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-TEMPORAL-RELATION-CHECK-COST*"),
                makeKeyword("INPUT-EXTRACT-PATTERN"),
                list(makeKeyword("TEMPLATE"), list(makeConstSym(("endingDate")), list(makeKeyword("BIND"), makeSymbol("TEMPORAL-THING")), list(makeKeyword("BIND"), makeSymbol("DATE"))), list(list(makeKeyword("VALUE"), makeSymbol("TEMPORAL-THING")), list(makeKeyword("VALUE"), makeSymbol("DATE")))),
                makeKeyword("INPUT-ENCODE-PATTERN"),
                ConsesLow.list(makeKeyword("TUPLE"), list(makeSymbol("TEMPORAL-THING"), makeSymbol("DATE")),
                        list(list(makeKeyword("CALL"), makeSymbol("POSSIBLY-BIND-TEMPORAL-INDEXICAL-IN-OBJECT"), list(makeKeyword("VALUE"), makeSymbol("TEMPORAL-THING"))),
                                list(makeKeyword("CALL"), makeSymbol("POSSIBLY-BIND-TEMPORAL-INDEXICAL-IN-OBJECT"), list(makeKeyword("VALUE"), makeSymbol("DATE"))))),
                makeKeyword("OUTPUT-CHECK-PATTERN"), list(makeKeyword("TUPLE"), list(makeSymbol("TEMPORAL-THING"), makeSymbol("DATE")), list(makeKeyword("CALL"), makeSymbol("ENDING-DATE?"), list(makeKeyword("VALUE"), makeSymbol("TEMPORAL-THING")), list(makeKeyword("VALUE"), makeSymbol("DATE")))),
                makeKeyword("SUPPORT-MODULE"), makeKeyword("TIME"), makeKeyword("DOCUMENTATION"), makeString("(#$endingDate <TemporalThing> <Date>)") });
        $sym288$REMOVAL_ALL_ENDING_DATE_INVERSE_OUTPUT_GENERATE = makeSymbol("REMOVAL-ALL-ENDING-DATE-INVERSE-OUTPUT-GENERATE");
        $REMOVAL_ALL_ENDING_DATE_INVERSE = makeKeyword("REMOVAL-ALL-ENDING-DATE-INVERSE");
        $list290 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("endingDate")), makeKeyword("REQUIRED-PATTERN"),
                list(makeConstSym(("endingDate")), makeKeyword("NOT-FULLY-BOUND"), list(makeKeyword("TEST"), makeSymbol("SBHL-TIME-INFERENCE-ARG-P"))), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-ALL-TEMPORAL-RELATION-INVERSE-COST*"), makeKeyword("COMPLETENESS"),
                makeKeyword("GROSSLY-INCOMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(makeConstSym(("endingDate")), makeKeyword("ANYTHING"), list(makeKeyword("BIND"), makeSymbol("DATE"))), list(makeKeyword("VALUE"), makeSymbol("DATE"))),
                makeKeyword("INPUT-ENCODE-PATTERN"), list(makeKeyword("CALL"), makeSymbol("POSSIBLY-BIND-TEMPORAL-INDEXICAL-IN-OBJECT"), makeKeyword("INPUT")), makeKeyword("OUTPUT-GENERATE-PATTERN"),
                list(makeKeyword("CALL"), makeSymbol("REMOVAL-ALL-ENDING-DATE-INVERSE-OUTPUT-GENERATE"), makeKeyword("INPUT")), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(makeConstSym(("endingDate")), makeKeyword("INPUT"), list(makeKeyword("VALUE"), makeSymbol("DATE"))),
                makeKeyword("SUPPORT-MODULE"), makeKeyword("TIME"), makeKeyword("DOCUMENTATION"), makeString("(#$endingDate <not-fully-bound> <Date>)") });
        $ALL_ENDING_DATE_INVERSE_POS = makeKeyword("ALL-ENDING-DATE-INVERSE-POS");
        $list292 = list(makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("endingDate")), makeKeyword("REQUIRED-PATTERN"), list(makeConstSym(("endingDate")), makeKeyword("NOT-FULLY-BOUND"), makeKeyword("ANYTHING")), makeKeyword("PREFERENCE-LEVEL"),
                makeKeyword("GROSSLY-DISPREFERRED"));
        $REMOVAL_NOT_ENDING_DATE = makeKeyword("REMOVAL-NOT-ENDING-DATE");
        $list294 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("PREDICATE"), makeConstSym(("endingDate")), makeKeyword("REQUIRED-PATTERN"),
                list(makeConstSym(("endingDate")), list(makeKeyword("TEST"), makeSymbol("SBHL-TIME-INFERENCE-ARG-P")), list(makeKeyword("TEST"), makeSymbol("SBHL-TIME-INFERENCE-ARG-P"))), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-NOT-TEMPORAL-RELATION-CHECK-COST*"), makeKeyword("EXPAND"),
                makeSymbol("REMOVAL-NOT-ENDING-DATE-EXPAND") });
        $$birthDate = makeConstSym(("birthDate"));
        $REMOVAL_BIRTH_DATE = makeKeyword("REMOVAL-BIRTH-DATE");
        $list297 = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("birthDate")), makeKeyword("CHECK"), T, makeKeyword("REQUIRED-PATTERN"),
                list(makeConstSym(("birthDate")), list(makeKeyword("TEST"), makeSymbol("SBHL-TIME-INFERENCE-ARG-P")), list(makeKeyword("TEST"), makeSymbol("SBHL-TIME-INFERENCE-ARG-P"))), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-TEMPORAL-RELATION-CHECK-COST*"),
                makeKeyword("INPUT-EXTRACT-PATTERN"),
                list(makeKeyword("TEMPLATE"), list(makeConstSym(("birthDate")), list(makeKeyword("BIND"), makeSymbol("TEMPORAL-THING")), list(makeKeyword("BIND"), makeSymbol("DATE"))), list(list(makeKeyword("VALUE"), makeSymbol("TEMPORAL-THING")), list(makeKeyword("VALUE"), makeSymbol("DATE")))),
                makeKeyword("INPUT-ENCODE-PATTERN"),
                ConsesLow.list(makeKeyword("TUPLE"), list(makeSymbol("TEMPORAL-THING"), makeSymbol("DATE")),
                        list(list(makeKeyword("CALL"), makeSymbol("POSSIBLY-BIND-TEMPORAL-INDEXICAL-IN-OBJECT"), list(makeKeyword("VALUE"), makeSymbol("TEMPORAL-THING"))),
                                list(makeKeyword("CALL"), makeSymbol("POSSIBLY-BIND-TEMPORAL-INDEXICAL-IN-OBJECT"), list(makeKeyword("VALUE"), makeSymbol("DATE"))))),
                makeKeyword("OUTPUT-CHECK-PATTERN"), list(makeKeyword("TUPLE"), list(makeSymbol("TEMPORAL-THING"), makeSymbol("DATE")), list(makeKeyword("CALL"), makeSymbol("BIRTH-DATE?"), list(makeKeyword("VALUE"), makeSymbol("TEMPORAL-THING")), list(makeKeyword("VALUE"), makeSymbol("DATE")))),
                makeKeyword("SUPPORT-MODULE"), makeKeyword("TIME"), makeKeyword("DOCUMENTATION"), makeString("(#$birthDate <TemporalThing> <Date>)") });
        $sym298$REMOVAL_ALL_BIRTH_DATE_INVERSE_OUTPUT_GENERATE = makeSymbol("REMOVAL-ALL-BIRTH-DATE-INVERSE-OUTPUT-GENERATE");
        $REMOVAL_ALL_BIRTH_DATE_INVERSE = makeKeyword("REMOVAL-ALL-BIRTH-DATE-INVERSE");
        $list300 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("birthDate")), makeKeyword("REQUIRED-PATTERN"),
                list(makeConstSym(("birthDate")), makeKeyword("NOT-FULLY-BOUND"), list(makeKeyword("TEST"), makeSymbol("SBHL-TIME-INFERENCE-ARG-P"))), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-ALL-TEMPORAL-RELATION-INVERSE-COST*"), makeKeyword("COMPLETENESS"),
                makeKeyword("GROSSLY-INCOMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(makeConstSym(("birthDate")), makeKeyword("ANYTHING"), list(makeKeyword("BIND"), makeSymbol("DATE"))), list(makeKeyword("VALUE"), makeSymbol("TEMPORAL-THING"))),
                makeKeyword("INPUT-ENCODE-PATTERN"), list(makeKeyword("CALL"), makeSymbol("POSSIBLY-BIND-TEMPORAL-INDEXICAL-IN-OBJECT"), makeKeyword("INPUT")), makeKeyword("OUTPUT-GENERATE-PATTERN"),
                list(makeKeyword("CALL"), makeSymbol("REMOVAL-ALL-BIRTH-DATE-INVERSE-OUTPUT-GENERATE"), makeKeyword("INPUT")), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(makeConstSym(("birthDate")), makeKeyword("INPUT"), list(makeKeyword("VALUE"), makeSymbol("DATE"))),
                makeKeyword("SUPPORT-MODULE"), makeKeyword("TIME"), makeKeyword("DOCUMENTATION"), makeString("(#$birthDate <not-fully-bound> <Date>)") });
        $ALL_BIRTH_DATE_INVERSE_POS = makeKeyword("ALL-BIRTH-DATE-INVERSE-POS");
        $list302 = list(makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("birthDate")), makeKeyword("REQUIRED-PATTERN"), list(makeConstSym(("birthDate")), makeKeyword("NOT-FULLY-BOUND"), makeKeyword("ANYTHING")), makeKeyword("PREFERENCE-LEVEL"),
                makeKeyword("GROSSLY-DISPREFERRED"));
        $REMOVAL_NOT_BIRTH_DATE = makeKeyword("REMOVAL-NOT-BIRTH-DATE");
        $list304 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("PREDICATE"), makeConstSym(("birthDate")), makeKeyword("REQUIRED-PATTERN"),
                list(makeConstSym(("birthDate")), list(makeKeyword("TEST"), makeSymbol("SBHL-TIME-INFERENCE-ARG-P")), list(makeKeyword("TEST"), makeSymbol("SBHL-TIME-INFERENCE-ARG-P"))), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-NOT-TEMPORAL-RELATION-CHECK-COST*"), makeKeyword("EXPAND"),
                makeSymbol("REMOVAL-NOT-BIRTH-DATE-EXPAND") });
        $$dateOfDeath = makeConstSym(("dateOfDeath"));
        $REMOVAL_DATE_OF_DEATH = makeKeyword("REMOVAL-DATE-OF-DEATH");
        $list307 = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("dateOfDeath")), makeKeyword("CHECK"), T, makeKeyword("REQUIRED-PATTERN"),
                list(makeConstSym(("dateOfDeath")), list(makeKeyword("TEST"), makeSymbol("SBHL-TIME-INFERENCE-ARG-P")), list(makeKeyword("TEST"), makeSymbol("SBHL-TIME-INFERENCE-ARG-P"))), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-TEMPORAL-RELATION-CHECK-COST*"),
                makeKeyword("INPUT-EXTRACT-PATTERN"),
                list(makeKeyword("TEMPLATE"), list(makeConstSym(("dateOfDeath")), list(makeKeyword("BIND"), makeSymbol("TEMPORAL-THING")), list(makeKeyword("BIND"), makeSymbol("DATE"))), list(list(makeKeyword("VALUE"), makeSymbol("TEMPORAL-THING")), list(makeKeyword("VALUE"), makeSymbol("DATE")))),
                makeKeyword("INPUT-ENCODE-PATTERN"),
                ConsesLow.list(makeKeyword("TUPLE"), list(makeSymbol("TEMPORAL-THING"), makeSymbol("DATE")),
                        list(list(makeKeyword("CALL"), makeSymbol("POSSIBLY-BIND-TEMPORAL-INDEXICAL-IN-OBJECT"), list(makeKeyword("VALUE"), makeSymbol("TEMPORAL-THING"))),
                                list(makeKeyword("CALL"), makeSymbol("POSSIBLY-BIND-TEMPORAL-INDEXICAL-IN-OBJECT"), list(makeKeyword("VALUE"), makeSymbol("DATE"))))),
                makeKeyword("OUTPUT-CHECK-PATTERN"), list(makeKeyword("TUPLE"), list(makeSymbol("TEMPORAL-THING"), makeSymbol("DATE")), list(makeKeyword("CALL"), makeSymbol("DATE-OF-DEATH?"), list(makeKeyword("VALUE"), makeSymbol("TEMPORAL-THING")), list(makeKeyword("VALUE"), makeSymbol("DATE")))),
                makeKeyword("SUPPORT-MODULE"), makeKeyword("TIME"), makeKeyword("DOCUMENTATION"), makeString("(#$dateOfDeath <TemporalThing> <Date>)") });
        $sym308$REMOVAL_ALL_DATE_OF_DEATH_INVERSE_OUTPUT_GENERATE = makeSymbol("REMOVAL-ALL-DATE-OF-DEATH-INVERSE-OUTPUT-GENERATE");
        $REMOVAL_ALL_DATE_OF_DEATH_INVERSE = makeKeyword("REMOVAL-ALL-DATE-OF-DEATH-INVERSE");
        $list310 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("dateOfDeath")), makeKeyword("REQUIRED-PATTERN"),
                list(makeConstSym(("dateOfDeath")), makeKeyword("NOT-FULLY-BOUND"), list(makeKeyword("TEST"), makeSymbol("SBHL-TIME-INFERENCE-ARG-P"))), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-ALL-TEMPORAL-RELATION-INVERSE-COST*"), makeKeyword("COMPLETENESS"),
                makeKeyword("GROSSLY-INCOMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(makeConstSym(("dateOfDeath")), makeKeyword("ANYTHING"), list(makeKeyword("BIND"), makeSymbol("DATE"))), list(makeKeyword("VALUE"), makeSymbol("DATE"))),
                makeKeyword("INPUT-ENCODE-PATTERN"), list(makeKeyword("CALL"), makeSymbol("POSSIBLY-BIND-TEMPORAL-INDEXICAL-IN-OBJECT"), makeKeyword("INPUT")), makeKeyword("OUTPUT-GENERATE-PATTERN"),
                list(makeKeyword("CALL"), makeSymbol("REMOVAL-ALL-DATE-OF-DEATH-INVERSE-OUTPUT-GENERATE"), makeKeyword("INPUT")), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(makeConstSym(("dateOfDeath")), makeKeyword("INPUT"), list(makeKeyword("VALUE"), makeSymbol("DATE"))),
                makeKeyword("SUPPORT-MODULE"), makeKeyword("TIME"), makeKeyword("DOCUMENTATION"), makeString("(#$dateOfDeath <not-fully-bound> <Date>)") });
        $ALL_DATE_OF_DEATH_INVERSE_POS = makeKeyword("ALL-DATE-OF-DEATH-INVERSE-POS");
        $list312 = list(makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("dateOfDeath")), makeKeyword("REQUIRED-PATTERN"), list(makeConstSym(("dateOfDeath")), makeKeyword("NOT-FULLY-BOUND"), makeKeyword("ANYTHING")), makeKeyword("PREFERENCE-LEVEL"),
                makeKeyword("GROSSLY-DISPREFERRED"));
        $REMOVAL_NOT_DATE_OF_DEATH = makeKeyword("REMOVAL-NOT-DATE-OF-DEATH");
        $list314 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("PREDICATE"), makeConstSym(("dateOfDeath")), makeKeyword("REQUIRED-PATTERN"),
                list(makeConstSym(("dateOfDeath")), list(makeKeyword("TEST"), makeSymbol("SBHL-TIME-INFERENCE-ARG-P")), list(makeKeyword("TEST"), makeSymbol("SBHL-TIME-INFERENCE-ARG-P"))), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-NOT-TEMPORAL-RELATION-CHECK-COST*"),
                makeKeyword("EXPAND"), makeSymbol("REMOVAL-NOT-DATE-OF-DEATH-EXPAND") });
        $$temporallyStartedBy = makeConstSym(("temporallyStartedBy"));
        $REMOVAL_TEMPORALLY_STARTED_BY = makeKeyword("REMOVAL-TEMPORALLY-STARTED-BY");
        $list317 = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("temporallyStartedBy")), makeKeyword("CHECK"), T, makeKeyword("REQUIRED-PATTERN"),
                list(makeConstSym(("temporallyStartedBy")), list(makeKeyword("TEST"), makeSymbol("SBHL-TIME-INFERENCE-ARG-P")), list(makeKeyword("TEST"), makeSymbol("SBHL-TIME-INFERENCE-ARG-P"))), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-TEMPORAL-RELATION-CHECK-COST*"),
                makeKeyword("INPUT-EXTRACT-PATTERN"),
                list(makeKeyword("TEMPLATE"), list(makeConstSym(("temporallyStartedBy")), list(makeKeyword("BIND"), makeSymbol("TEMPORAL-THING1")), list(makeKeyword("BIND"), makeSymbol("TEMPORAL-THING2"))),
                        list(list(makeKeyword("VALUE"), makeSymbol("TEMPORAL-THING1")), list(makeKeyword("VALUE"), makeSymbol("TEMPORAL-THING2")))),
                makeKeyword("INPUT-ENCODE-PATTERN"),
                ConsesLow.list(makeKeyword("TUPLE"), list(makeSymbol("TEMPORAL-THING1"), makeSymbol("TEMPORAL-THING2")),
                        list(list(makeKeyword("CALL"), makeSymbol("POSSIBLY-BIND-TEMPORAL-INDEXICAL-IN-OBJECT"), list(makeKeyword("VALUE"), makeSymbol("TEMPORAL-THING1"))),
                                list(makeKeyword("CALL"), makeSymbol("POSSIBLY-BIND-TEMPORAL-INDEXICAL-IN-OBJECT"), list(makeKeyword("VALUE"), makeSymbol("TEMPORAL-THING2"))))),
                makeKeyword("OUTPUT-CHECK-PATTERN"),
                list(makeKeyword("TUPLE"), list(makeSymbol("TEMPORAL-THING1"), makeSymbol("TEMPORAL-THING2")), list(makeKeyword("CALL"), makeSymbol("TEMPORALLY-STARTED-BY?"), list(makeKeyword("VALUE"), makeSymbol("TEMPORAL-THING1")), list(makeKeyword("VALUE"), makeSymbol("TEMPORAL-THING2")))),
                makeKeyword("SUPPORT-MODULE"), makeKeyword("TIME"), makeKeyword("DOCUMENTATION"), makeString("(#$temporallyStartedBy <TemporalThing> <TemporalThing>)") });
        $sym318$REMOVAL_ALL_TEMPORALLY_STARTED_BY_OUTPUT_GENERATE = makeSymbol("REMOVAL-ALL-TEMPORALLY-STARTED-BY-OUTPUT-GENERATE");
        $REMOVAL_ALL_TEMPORALLY_STARTED_BY = makeKeyword("REMOVAL-ALL-TEMPORALLY-STARTED-BY");
        $list320 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("temporallyStartedBy")), makeKeyword("REQUIRED-PATTERN"),
                list(makeConstSym(("temporallyStartedBy")), list(makeKeyword("TEST"), makeSymbol("SBHL-TIME-INFERENCE-ARG-P")), makeKeyword("NOT-FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-ALL-TEMPORAL-RELATION-COST*"), makeKeyword("COMPLETENESS"),
                makeKeyword("GROSSLY-INCOMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"),
                list(makeKeyword("TEMPLATE"), list(makeConstSym(("temporallyStartedBy")), list(makeKeyword("BIND"), makeSymbol("TEMPORAL-THING")), makeKeyword("ANYTHING")), list(makeKeyword("VALUE"), makeSymbol("TEMPORAL-THING"))), makeKeyword("INPUT-ENCODE-PATTERN"),
                list(makeKeyword("CALL"), makeSymbol("POSSIBLY-BIND-TEMPORAL-INDEXICAL-IN-OBJECT"), makeKeyword("INPUT")), makeKeyword("OUTPUT-GENERATE-PATTERN"), list(makeKeyword("CALL"), makeSymbol("REMOVAL-ALL-TEMPORALLY-STARTED-BY-OUTPUT-GENERATE"), makeKeyword("INPUT")),
                makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(makeConstSym(("temporallyStartedBy")), list(makeKeyword("VALUE"), makeSymbol("TEMPORAL-THING")), makeKeyword("INPUT")), makeKeyword("SUPPORT-MODULE"), makeKeyword("TIME"), makeKeyword("DOCUMENTATION"),
                makeString("(#$temporallyStartedBy <TemporalThing> <not-fully-bound>)") });
        $ALL_TEMPORALLY_STARTED_BY_POS = makeKeyword("ALL-TEMPORALLY-STARTED-BY-POS");
        $list322 = list(makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("temporallyStartedBy")), makeKeyword("REQUIRED-PATTERN"), list(makeConstSym(("temporallyStartedBy")), makeKeyword("ANYTHING"), makeKeyword("NOT-FULLY-BOUND")), makeKeyword("PREFERENCE-LEVEL"),
                makeKeyword("GROSSLY-DISPREFERRED"));
        $sym323$REMOVAL_ALL_TEMPORALLY_STARTED_BY_INVERSE_OUTPUT_GENERATE = makeSymbol("REMOVAL-ALL-TEMPORALLY-STARTED-BY-INVERSE-OUTPUT-GENERATE");
        $REMOVAL_ALL_TEMPORALLY_STARTED_BY_INVERSE = makeKeyword("REMOVAL-ALL-TEMPORALLY-STARTED-BY-INVERSE");
        $list325 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("temporallyStartedBy")), makeKeyword("REQUIRED-PATTERN"),
                list(makeConstSym(("temporallyStartedBy")), makeKeyword("NOT-FULLY-BOUND"), list(makeKeyword("TEST"), makeSymbol("SBHL-TIME-INFERENCE-ARG-P"))), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-ALL-TEMPORAL-RELATION-INVERSE-COST*"), makeKeyword("COMPLETENESS"),
                makeKeyword("GROSSLY-INCOMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"),
                list(makeKeyword("TEMPLATE"), list(makeConstSym(("temporallyStartedBy")), makeKeyword("ANYTHING"), list(makeKeyword("BIND"), makeSymbol("TEMPORAL-THING"))), list(makeKeyword("VALUE"), makeSymbol("TEMPORAL-THING"))), makeKeyword("INPUT-ENCODE-PATTERN"),
                list(makeKeyword("CALL"), makeSymbol("POSSIBLY-BIND-TEMPORAL-INDEXICAL-IN-OBJECT"), makeKeyword("INPUT")), makeKeyword("OUTPUT-GENERATE-PATTERN"), list(makeKeyword("CALL"), makeSymbol("REMOVAL-ALL-TEMPORALLY-STARTED-BY-INVERSE-OUTPUT-GENERATE"), makeKeyword("INPUT")),
                makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(makeConstSym(("temporallyStartedBy")), makeKeyword("INPUT"), list(makeKeyword("VALUE"), makeSymbol("TEMPORAL-THING"))), makeKeyword("SUPPORT-MODULE"), makeKeyword("TIME"), makeKeyword("DOCUMENTATION"),
                makeString("(#$temporallyStartedBy <not-fully-bound> <TemporalThing>)") });
        $ALL_TEMPORALLY_STARTED_BY_INVERSE_POS = makeKeyword("ALL-TEMPORALLY-STARTED-BY-INVERSE-POS");
        $list327 = list(makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("temporallyStartedBy")), makeKeyword("REQUIRED-PATTERN"), list(makeConstSym(("temporallyStartedBy")), makeKeyword("NOT-FULLY-BOUND"), makeKeyword("ANYTHING")), makeKeyword("PREFERENCE-LEVEL"),
                makeKeyword("GROSSLY-DISPREFERRED"));
        $REMOVAL_NOT_TEMPORALLY_STARTED_BY = makeKeyword("REMOVAL-NOT-TEMPORALLY-STARTED-BY");
        $list329 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("PREDICATE"), makeConstSym(("temporallyStartedBy")), makeKeyword("REQUIRED-PATTERN"),
                list(makeConstSym(("temporallyStartedBy")), list(makeKeyword("TEST"), makeSymbol("SBHL-TIME-INFERENCE-ARG-P")), list(makeKeyword("TEST"), makeSymbol("SBHL-TIME-INFERENCE-ARG-P"))), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-NOT-TEMPORAL-RELATION-CHECK-COST*"),
                makeKeyword("EXPAND"), makeSymbol("REMOVAL-NOT-TEMPORALLY-STARTED-BY-EXPAND") });
        $$temporallyFinishedBy = makeConstSym(("temporallyFinishedBy"));
        $REMOVAL_TEMPORALLY_FINISHED_BY = makeKeyword("REMOVAL-TEMPORALLY-FINISHED-BY");
        $list332 = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("temporallyFinishedBy")), makeKeyword("CHECK"), T, makeKeyword("REQUIRED-PATTERN"),
                list(makeConstSym(("temporallyFinishedBy")), list(makeKeyword("TEST"), makeSymbol("SBHL-TIME-INFERENCE-ARG-P")), list(makeKeyword("TEST"), makeSymbol("SBHL-TIME-INFERENCE-ARG-P"))), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-TEMPORAL-RELATION-CHECK-COST*"),
                makeKeyword("INPUT-EXTRACT-PATTERN"),
                list(makeKeyword("TEMPLATE"), list(makeConstSym(("temporallyFinishedBy")), list(makeKeyword("BIND"), makeSymbol("TEMPORAL-THING1")), list(makeKeyword("BIND"), makeSymbol("TEMPORAL-THING2"))),
                        list(list(makeKeyword("VALUE"), makeSymbol("TEMPORAL-THING1")), list(makeKeyword("VALUE"), makeSymbol("TEMPORAL-THING2")))),
                makeKeyword("INPUT-ENCODE-PATTERN"),
                ConsesLow.list(makeKeyword("TUPLE"), list(makeSymbol("TEMPORAL-THING1"), makeSymbol("TEMPORAL-THING2")),
                        list(list(makeKeyword("CALL"), makeSymbol("POSSIBLY-BIND-TEMPORAL-INDEXICAL-IN-OBJECT"), list(makeKeyword("VALUE"), makeSymbol("TEMPORAL-THING1"))),
                                list(makeKeyword("CALL"), makeSymbol("POSSIBLY-BIND-TEMPORAL-INDEXICAL-IN-OBJECT"), list(makeKeyword("VALUE"), makeSymbol("TEMPORAL-THING2"))))),
                makeKeyword("OUTPUT-CHECK-PATTERN"),
                list(makeKeyword("TUPLE"), list(makeSymbol("TEMPORAL-THING1"), makeSymbol("TEMPORAL-THING2")), list(makeKeyword("CALL"), makeSymbol("TEMPORALLY-FINISHED-BY?"), list(makeKeyword("VALUE"), makeSymbol("TEMPORAL-THING1")), list(makeKeyword("VALUE"), makeSymbol("TEMPORAL-THING2")))),
                makeKeyword("SUPPORT-MODULE"), makeKeyword("TIME"), makeKeyword("DOCUMENTATION"), makeString("(#$temporallyFinishedBy <TemporalThing> <TemporalThing>)") });
        $sym333$REMOVAL_ALL_TEMPORALLY_FINISHED_BY_OUTPUT_GENERATE = makeSymbol("REMOVAL-ALL-TEMPORALLY-FINISHED-BY-OUTPUT-GENERATE");
        $REMOVAL_ALL_TEMPORALLY_FINISHED_BY = makeKeyword("REMOVAL-ALL-TEMPORALLY-FINISHED-BY");
        $list335 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("temporallyFinishedBy")), makeKeyword("REQUIRED-PATTERN"),
                list(makeConstSym(("temporallyFinishedBy")), list(makeKeyword("TEST"), makeSymbol("SBHL-TIME-INFERENCE-ARG-P")), makeKeyword("NOT-FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-ALL-TEMPORAL-RELATION-COST*"), makeKeyword("COMPLETENESS"),
                makeKeyword("GROSSLY-INCOMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"),
                list(makeKeyword("TEMPLATE"), list(makeConstSym(("temporallyFinishedBy")), list(makeKeyword("BIND"), makeSymbol("TEMPORAL-THING")), makeKeyword("ANYTHING")), list(makeKeyword("VALUE"), makeSymbol("TEMPORAL-THING"))), makeKeyword("INPUT-ENCODE-PATTERN"),
                list(makeKeyword("CALL"), makeSymbol("POSSIBLY-BIND-TEMPORAL-INDEXICAL-IN-OBJECT"), makeKeyword("INPUT")), makeKeyword("OUTPUT-GENERATE-PATTERN"), list(makeKeyword("CALL"), makeSymbol("REMOVAL-ALL-TEMPORALLY-FINISHED-BY-OUTPUT-GENERATE"), makeKeyword("INPUT")),
                makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(makeConstSym(("temporallyFinishedBy")), list(makeKeyword("VALUE"), makeSymbol("TEMPORAL-THING")), makeKeyword("INPUT")), makeKeyword("SUPPORT-MODULE"), makeKeyword("TIME"), makeKeyword("DOCUMENTATION"),
                makeString("(#$temporallyFinishedBy <TemporalThing> <not-fully-bound>)") });
        $ALL_TEMPORALLY_FINISHED_BY_POS = makeKeyword("ALL-TEMPORALLY-FINISHED-BY-POS");
        $list337 = list(makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("temporallyFinishedBy")), makeKeyword("REQUIRED-PATTERN"),
                list(makeConstSym(("temporallyFinishedBy")), list(makeKeyword("TEST"), makeSymbol("SBHL-TIME-INFERENCE-ARG-P")), makeKeyword("NOT-FULLY-BOUND")), makeKeyword("PREFERENCE-LEVEL"), makeKeyword("GROSSLY-DISPREFERRED"));
        $sym338$REMOVAL_ALL_TEMPORALLY_FINISHED_BY_INVERSE_OUTPUT_GENERATE = makeSymbol("REMOVAL-ALL-TEMPORALLY-FINISHED-BY-INVERSE-OUTPUT-GENERATE");
        $REMOVAL_ALL_TEMPORALLY_FINISHED_BY_INVERSE = makeKeyword("REMOVAL-ALL-TEMPORALLY-FINISHED-BY-INVERSE");
        $list340 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("temporallyFinishedBy")), makeKeyword("REQUIRED-PATTERN"),
                list(makeConstSym(("temporallyFinishedBy")), makeKeyword("NOT-FULLY-BOUND"), list(makeKeyword("TEST"), makeSymbol("SBHL-TIME-INFERENCE-ARG-P"))), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-ALL-TEMPORAL-RELATION-INVERSE-COST*"), makeKeyword("COMPLETENESS"),
                makeKeyword("GROSSLY-INCOMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"),
                list(makeKeyword("TEMPLATE"), list(makeConstSym(("temporallyFinishedBy")), makeKeyword("ANYTHING"), list(makeKeyword("BIND"), makeSymbol("TEMPORAL-THING"))), list(makeKeyword("VALUE"), makeSymbol("TEMPORAL-THING"))), makeKeyword("INPUT-ENCODE-PATTERN"),
                list(makeKeyword("CALL"), makeSymbol("POSSIBLY-BIND-TEMPORAL-INDEXICAL-IN-OBJECT"), makeKeyword("INPUT")), makeKeyword("OUTPUT-GENERATE-PATTERN"), list(makeKeyword("CALL"), makeSymbol("REMOVAL-ALL-TEMPORALLY-FINISHED-BY-INVERSE-OUTPUT-GENERATE"), makeKeyword("INPUT")),
                makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(makeConstSym(("temporallyFinishedBy")), makeKeyword("INPUT"), list(makeKeyword("VALUE"), makeSymbol("TEMPORAL-THING"))), makeKeyword("SUPPORT-MODULE"), makeKeyword("TIME"), makeKeyword("DOCUMENTATION"),
                makeString("(#$temporallyFinishedBy <not-fully-bound> <TemporalThing>)") });
        $ALL_TEMPORALLY_FINISHED_BY_INVERSE_POS = makeKeyword("ALL-TEMPORALLY-FINISHED-BY-INVERSE-POS");
        $list342 = list(makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("temporallyFinishedBy")), makeKeyword("REQUIRED-PATTERN"), list(makeConstSym(("temporallyFinishedBy")), makeKeyword("NOT-FULLY-BOUND"), makeKeyword("ANYTHING")), makeKeyword("PREFERENCE-LEVEL"),
                makeKeyword("GROSSLY-DISPREFERRED"));
        $REMOVAL_NOT_TEMPORALLY_FINISHED_BY = makeKeyword("REMOVAL-NOT-TEMPORALLY-FINISHED-BY");
        $list344 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("PREDICATE"), makeConstSym(("temporallyFinishedBy")), makeKeyword("REQUIRED-PATTERN"),
                list(makeConstSym(("temporallyFinishedBy")), list(makeKeyword("TEST"), makeSymbol("SBHL-TIME-INFERENCE-ARG-P")), list(makeKeyword("TEST"), makeSymbol("SBHL-TIME-INFERENCE-ARG-P"))), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-NOT-TEMPORAL-RELATION-CHECK-COST*"),
                makeKeyword("EXPAND"), makeSymbol("REMOVAL-NOT-TEMPORALLY-FINISHED-BY-EXPAND") });
        $$overlapsStart = makeConstSym(("overlapsStart"));
        $REMOVAL_OVERLAPS_START = makeKeyword("REMOVAL-OVERLAPS-START");
        $list347 = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("overlapsStart")), makeKeyword("CHECK"), T, makeKeyword("REQUIRED-PATTERN"),
                list(makeConstSym(("overlapsStart")), list(makeKeyword("TEST"), makeSymbol("SBHL-TIME-INFERENCE-ARG-P")), list(makeKeyword("TEST"), makeSymbol("SBHL-TIME-INFERENCE-ARG-P"))), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-TEMPORAL-RELATION-CHECK-COST*"),
                makeKeyword("INPUT-EXTRACT-PATTERN"),
                list(makeKeyword("TEMPLATE"), list(makeConstSym(("overlapsStart")), ConsesLow.list(makeKeyword("BIND"), makeSymbol("TEMPORAL-THING1")), list(makeKeyword("BIND"), makeSymbol("TEMPORAL-THING2"))),
                        list(list(makeKeyword("VALUE"), makeSymbol("TEMPORAL-THING1")), list(makeKeyword("VALUE"), makeSymbol("TEMPORAL-THING2")))),
                makeKeyword("INPUT-ENCODE-PATTERN"),
                ConsesLow.list(makeKeyword("TUPLE"), list(makeSymbol("TEMPORAL-THING1"), makeSymbol("TEMPORAL-THING2")),
                        list(list(makeKeyword("CALL"), makeSymbol("POSSIBLY-BIND-TEMPORAL-INDEXICAL-IN-OBJECT"), list(makeKeyword("VALUE"), makeSymbol("TEMPORAL-THING1"))),
                                list(makeKeyword("CALL"), makeSymbol("POSSIBLY-BIND-TEMPORAL-INDEXICAL-IN-OBJECT"), list(makeKeyword("VALUE"), makeSymbol("TEMPORAL-THING2"))))),
                makeKeyword("OUTPUT-CHECK-PATTERN"),
                list(makeKeyword("TUPLE"), list(makeSymbol("TEMPORAL-THING1"), makeSymbol("TEMPORAL-THING2")), list(makeKeyword("CALL"), makeSymbol("OVERLAPS-START?"), list(makeKeyword("VALUE"), makeSymbol("TEMPORAL-THING1")), list(makeKeyword("VALUE"), makeSymbol("TEMPORAL-THING2")))),
                makeKeyword("SUPPORT-MODULE"), makeKeyword("TIME"), makeKeyword("DOCUMENTATION"), makeString("(#$overlapsStart <TemporalThing> <TemporalThing>)") });
        $sym348$REMOVAL_ALL_OVERLAPS_START_OUTPUT_GENERATE = makeSymbol("REMOVAL-ALL-OVERLAPS-START-OUTPUT-GENERATE");
        $REMOVAL_ALL_OVERLAPS_START = makeKeyword("REMOVAL-ALL-OVERLAPS-START");
        $list350 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("overlapsStart")), makeKeyword("REQUIRED-PATTERN"),
                list(makeConstSym(("overlapsStart")), list(makeKeyword("TEST"), makeSymbol("SBHL-TIME-INFERENCE-ARG-P")), makeKeyword("NOT-FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-ALL-TEMPORAL-RELATION-COST*"), makeKeyword("COMPLETENESS"),
                makeKeyword("GROSSLY-INCOMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(makeConstSym(("overlapsStart")), list(makeKeyword("BIND"), makeSymbol("TEMPORAL-THING")), makeKeyword("ANYTHING")), list(makeKeyword("VALUE"), makeSymbol("TEMPORAL-THING"))),
                makeKeyword("INPUT-ENCODE-PATTERN"), list(makeKeyword("CALL"), makeSymbol("POSSIBLY-BIND-TEMPORAL-INDEXICAL-IN-OBJECT"), makeKeyword("INPUT")), makeKeyword("OUTPUT-GENERATE-PATTERN"),
                list(makeKeyword("CALL"), makeSymbol("REMOVAL-ALL-OVERLAPS-START-OUTPUT-GENERATE"), makeKeyword("INPUT")), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(makeConstSym(("overlapsStart")), list(makeKeyword("VALUE"), makeSymbol("TEMPORAL-THING")), makeKeyword("INPUT")),
                makeKeyword("SUPPORT-MODULE"), makeKeyword("TIME"), makeKeyword("DOCUMENTATION"), makeString("(#$overlapsStart <TemporalThing> <not-fully-bound>)") });
        $ALL_OVERLAPS_START_POS = makeKeyword("ALL-OVERLAPS-START-POS");
        $list352 = list(makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("overlapsStart")), makeKeyword("REQUIRED-PATTERN"), list(makeConstSym(("overlapsStart")), makeKeyword("ANYTHING"), makeKeyword("NOT-FULLY-BOUND")), makeKeyword("PREFERENCE-LEVEL"),
                makeKeyword("GROSSLY-DISPREFERRED"));
        $sym353$REMOVAL_ALL_OVERLAPS_START_INVERSE_OUTPUT_GENERATE = makeSymbol("REMOVAL-ALL-OVERLAPS-START-INVERSE-OUTPUT-GENERATE");
        $REMOVAL_ALL_OVERLAPS_START_INVERSE = makeKeyword("REMOVAL-ALL-OVERLAPS-START-INVERSE");
        $list355 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("overlapsStart")), makeKeyword("REQUIRED-PATTERN"),
                list(makeConstSym(("overlapsStart")), makeKeyword("NOT-FULLY-BOUND"), list(makeKeyword("TEST"), makeSymbol("SBHL-TIME-INFERENCE-ARG-P"))), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-ALL-TEMPORAL-RELATION-INVERSE-COST*"), makeKeyword("COMPLETENESS"),
                makeKeyword("GROSSLY-INCOMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(makeConstSym(("overlapsStart")), makeKeyword("ANYTHING"), list(makeKeyword("BIND"), makeSymbol("TEMPORAL-THING"))), list(makeKeyword("VALUE"), makeSymbol("TEMPORAL-THING"))),
                makeKeyword("INPUT-ENCODE-PATTERN"), list(makeKeyword("CALL"), makeSymbol("POSSIBLY-BIND-TEMPORAL-INDEXICAL-IN-OBJECT"), makeKeyword("INPUT")), makeKeyword("OUTPUT-GENERATE-PATTERN"),
                list(makeKeyword("CALL"), makeSymbol("REMOVAL-ALL-OVERLAPS-START-INVERSE-OUTPUT-GENERATE"), makeKeyword("INPUT")), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(makeConstSym(("overlapsStart")), makeKeyword("INPUT"), list(makeKeyword("VALUE"), makeSymbol("TEMPORAL-THING"))),
                makeKeyword("SUPPORT-MODULE"), makeKeyword("TIME"), makeKeyword("DOCUMENTATION"), makeString("(#$overlapsStart <not-fully-bound> <TemporalThing>)") });
        $ALL_OVERLAPS_START_INVERSE_POS = makeKeyword("ALL-OVERLAPS-START-INVERSE-POS");
        $list357 = list(makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), makeConstSym(("overlapsStart")), makeKeyword("REQUIRED-PATTERN"), list(makeConstSym(("overlapsStart")), makeKeyword("NOT-FULLY-BOUND"), makeKeyword("ANYTHING")), makeKeyword("PREFERENCE-LEVEL"),
                makeKeyword("GROSSLY-DISPREFERRED"));
        $REMOVAL_NOT_OVERLAPS_START = makeKeyword("REMOVAL-NOT-OVERLAPS-START");
        $list359 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("PREDICATE"), makeConstSym(("overlapsStart")), makeKeyword("REQUIRED-PATTERN"),
                list(makeConstSym(("overlapsStart")), list(makeKeyword("TEST"), makeSymbol("SBHL-TIME-INFERENCE-ARG-P")), list(makeKeyword("TEST"), makeSymbol("SBHL-TIME-INFERENCE-ARG-P"))), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-NOT-TEMPORAL-RELATION-CHECK-COST*"),
                makeKeyword("EXPAND"), makeSymbol("REMOVAL-NOT-OVERLAPS-START-EXPAND") });
    }
}
/*
 *
 * Total time: 3094 ms
 *
 */