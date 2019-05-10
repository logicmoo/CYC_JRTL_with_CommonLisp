package com.cyc.cycjava.cycl.inference.modules.removal;

import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.cycjava.cycl.inference.modules.preference_modules;
import com.cyc.cycjava.cycl.utilities_macros;
import com.cyc.cycjava.cycl.inference.harness.inference_modules;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.cycjava.cycl.backward_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.cycjava.cycl.backward;
import com.cyc.cycjava.cycl.arguments;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.cycjava.cycl.control_vars;
import com.cyc.cycjava.cycl.sbhl.sbhl_time_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.cycjava.cycl.iteration;
import com.cyc.cycjava.cycl.sbhl.sbhl_time_modules;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class removal_modules_sbhl_time_preds
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_sbhl_time_preds";
  public static final String myFingerPrint = "aa6643f08706fb8a53cc36e2e015181027d5ec0821c86a902a110d83ab1bb7df";
  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-sbhl-time-preds.lisp", position = 1268L)
  private static SubLSymbol $sbhl_time_generic_modules$;
  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-sbhl-time-preds.lisp", position = 4542L)
  private static SubLSymbol $default_temporal_relation_check_cost$;
  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-sbhl-time-preds.lisp", position = 4737L)
  private static SubLSymbol $default_all_temporal_relation_cost$;
  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-sbhl-time-preds.lisp", position = 4802L)
  private static SubLSymbol $default_all_temporal_relation_inverse_cost$;
  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-sbhl-time-preds.lisp", position = 4875L)
  private static SubLSymbol $default_not_temporal_relation_check_cost$;
  private static final SubLList $list0;
  private static final SubLSymbol $kw1$SBHL_TIME_TOTAL_EXCLUSIVITY_POS;
  private static final SubLSymbol $kw2$SENSE;
  private static final SubLSymbol $kw3$POS;
  private static final SubLSymbol $kw4$ARITY;
  private static final SubLSymbol $kw5$REQUIRED_PATTERN;
  private static final SubLList $list6;
  private static final SubLSymbol $kw7$EXCLUSIVE;
  private static final SubLSymbol $sym8$TRUE;
  private static final SubLSymbol $kw9$SUPPLANTS;
  private static final SubLList $list10;
  private static final SubLList $list11;
  private static final SubLInteger $int12$200;
  private static final SubLObject $const13$startsAfterStartingOf;
  private static final SubLSymbol $kw14$REMOVAL_STARTS_AFTER_STARTING_OF;
  private static final SubLList $list15;
  private static final SubLSymbol $sym16$REMOVAL_ALL_STARTS_AFTER_STARTING_OF_OUTPUT_GENERATE;
  private static final SubLSymbol $kw17$REMOVAL_ALL_STARTS_AFTER_STARTING_OF;
  private static final SubLList $list18;
  private static final SubLSymbol $kw19$ALL_STARTS_AFTER_STARTING_OF_POS;
  private static final SubLList $list20;
  private static final SubLSymbol $sym21$REMOVAL_ALL_STARTS_AFTER_STARTING_OF_INVERSE_OUTPUT_GENERATE;
  private static final SubLSymbol $kw22$REMOVAL_ALL_STARTS_AFTER_STARTING_OF_INVERSE;
  private static final SubLList $list23;
  private static final SubLSymbol $kw24$ALL_STARTS_AFTER_STARTING_OF_INVERSE_POS;
  private static final SubLList $list25;
  private static final SubLSymbol $kw26$MINIMIZE;
  private static final SubLSymbol $kw27$TIME;
  private static final SubLSymbol $kw28$REMOVAL_NOT_STARTS_AFTER_STARTING_OF;
  private static final SubLList $list29;
  private static final SubLObject $const30$startsAfterEndingOf;
  private static final SubLSymbol $kw31$REMOVAL_STARTS_AFTER_ENDING_OF;
  private static final SubLList $list32;
  private static final SubLSymbol $sym33$REMOVAL_ALL_STARTS_AFTER_ENDING_OF_OUTPUT_GENERATE;
  private static final SubLSymbol $kw34$REMOVAL_ALL_STARTS_AFTER_ENDING_OF;
  private static final SubLList $list35;
  private static final SubLSymbol $kw36$ALL_STARTS_AFTER_ENDING_OF_POS;
  private static final SubLList $list37;
  private static final SubLSymbol $sym38$REMOVAL_ALL_STARTS_AFTER_ENDING_OF_INVERSE_OUTPUT_GENERATE;
  private static final SubLSymbol $kw39$REMOVAL_ALL_STARTS_AFTER_ENDING_OF_INVERSE;
  private static final SubLList $list40;
  private static final SubLSymbol $kw41$ALL_STARTS_AFTER_ENDING_OF_INVERSE_POS;
  private static final SubLList $list42;
  private static final SubLSymbol $kw43$REMOVAL_NOT_STARTS_AFTER_ENDING_OF;
  private static final SubLList $list44;
  private static final SubLObject $const45$endsAfterStartingOf;
  private static final SubLSymbol $kw46$REMOVAL_ENDS_AFTER_STARTING_OF;
  private static final SubLList $list47;
  private static final SubLSymbol $sym48$REMOVAL_ALL_ENDS_AFTER_STARTING_OF_OUTPUT_GENERATE;
  private static final SubLSymbol $kw49$REMOVAL_ALL_ENDS_AFTER_STARTING_OF;
  private static final SubLList $list50;
  private static final SubLSymbol $kw51$ALL_ENDS_AFTER_STARTING_OF_POS;
  private static final SubLList $list52;
  private static final SubLSymbol $sym53$REMOVAL_ALL_ENDS_AFTER_STARTING_OF_INVERSE_OUTPUT_GENERATE;
  private static final SubLSymbol $kw54$REMOVAL_ALL_ENDS_AFTER_STARTING_OF_INVERSE;
  private static final SubLList $list55;
  private static final SubLSymbol $kw56$ALL_ENDS_AFTER_STARTING_OF_INVERSE_POS;
  private static final SubLList $list57;
  private static final SubLSymbol $kw58$REMOVAL_NOT_ENDS_AFTER_STARTING_OF;
  private static final SubLList $list59;
  private static final SubLObject $const60$endsAfterEndingOf;
  private static final SubLSymbol $kw61$REMOVAL_ENDS_AFTER_ENDING_OF;
  private static final SubLList $list62;
  private static final SubLSymbol $sym63$REMOVAL_ALL_ENDS_AFTER_ENDING_OF_OUTPUT_GENERATE;
  private static final SubLSymbol $kw64$REMOVAL_ALL_ENDS_AFTER_ENDING_OF;
  private static final SubLList $list65;
  private static final SubLSymbol $kw66$ALL_ENDS_AFTER_ENDING_OF_POS;
  private static final SubLList $list67;
  private static final SubLSymbol $sym68$REMOVAL_ALL_ENDS_AFTER_ENDING_OF_INVERSE_OUTPUT_GENERATE;
  private static final SubLSymbol $kw69$REMOVAL_ALL_ENDS_AFTER_ENDING_OF_INVERSE;
  private static final SubLList $list70;
  private static final SubLSymbol $kw71$ALL_ENDS_AFTER_ENDING_OF_INVERSE_POS;
  private static final SubLList $list72;
  private static final SubLSymbol $kw73$REMOVAL_NOT_ENDS_AFTER_ENDING_OF;
  private static final SubLList $list74;
  private static final SubLObject $const75$temporallySubsumes;
  private static final SubLSymbol $kw76$REMOVAL_TEMPORALLY_SUBSUMES;
  private static final SubLList $list77;
  private static final SubLSymbol $sym78$REMOVAL_ALL_TEMPORALLY_SUBSUMES_OUTPUT_GENERATE;
  private static final SubLSymbol $kw79$REMOVAL_ALL_TEMPORALLY_SUBSUMES;
  private static final SubLList $list80;
  private static final SubLSymbol $kw81$ALL_TEMPORALLY_SUBSUMES_POS;
  private static final SubLList $list82;
  private static final SubLSymbol $sym83$REMOVAL_ALL_TEMPORALLY_SUBSUMES_INVERSE_OUTPUT_GENERATE;
  private static final SubLSymbol $kw84$REMOVAL_ALL_TEMPORALLY_SUBSUMES_INVERSE;
  private static final SubLList $list85;
  private static final SubLSymbol $kw86$ALL_TEMPORALLY_SUBSUMES_INVERSE_POS;
  private static final SubLList $list87;
  private static final SubLSymbol $kw88$REMOVAL_NOT_TEMPORALLY_SUBSUMES;
  private static final SubLList $list89;
  private static final SubLObject $const90$dateOfEvent;
  private static final SubLSymbol $kw91$REMOVAL_DATE_OF_EVENT;
  private static final SubLList $list92;
  private static final SubLSymbol $sym93$REMOVAL_ALL_DATE_OF_EVENT_INVERSE_OUTPUT_GENERATE;
  private static final SubLSymbol $kw94$REMOVAL_ALL_DATE_OF_EVENT_INVERSE;
  private static final SubLList $list95;
  private static final SubLSymbol $kw96$ALL_DATE_OF_EVENT_INVERSE_POS;
  private static final SubLList $list97;
  private static final SubLSymbol $kw98$REMOVAL_NOT_DATE_OF_EVENT;
  private static final SubLList $list99;
  private static final SubLSymbol $kw100$REMOVAL_DATE_OF_EVENT_DELAY;
  private static final SubLList $list101;
  private static final SubLObject $const102$cotemporal;
  private static final SubLSymbol $kw103$REMOVAL_COTEMPORAL;
  private static final SubLList $list104;
  private static final SubLSymbol $sym105$REMOVAL_ALL_COTEMPORAL_OUTPUT_GENERATE;
  private static final SubLSymbol $kw106$REMOVAL_ALL_COTEMPORAL;
  private static final SubLList $list107;
  private static final SubLSymbol $kw108$ALL_COTEMPORAL_POS;
  private static final SubLList $list109;
  private static final SubLSymbol $kw110$REMOVAL_ALL_COTEMPORAL_INVERSE;
  private static final SubLList $list111;
  private static final SubLSymbol $kw112$ALL_COTEMPORAL_INVERSE_POS;
  private static final SubLList $list113;
  private static final SubLSymbol $kw114$REMOVAL_NOT_COTEMPORAL;
  private static final SubLList $list115;
  private static final SubLObject $const116$temporallyIntersects;
  private static final SubLSymbol $kw117$REMOVAL_TEMPORALLY_INTERSECTS;
  private static final SubLList $list118;
  private static final SubLSymbol $sym119$REMOVAL_ALL_TEMPORALLY_INTERSECTS_OUTPUT_GENERATE;
  private static final SubLSymbol $kw120$REMOVAL_ALL_TEMPORALLY_INTERSECTS;
  private static final SubLList $list121;
  private static final SubLSymbol $kw122$ALL_TEMPORALLY_INTERSECTS_POS;
  private static final SubLList $list123;
  private static final SubLSymbol $kw124$REMOVAL_ALL_TEMPORALLY_INTERSECTS_INVERSE;
  private static final SubLList $list125;
  private static final SubLSymbol $kw126$ALL_TEMPORALLY_INTERSECTS_INVERSE_POS;
  private static final SubLList $list127;
  private static final SubLSymbol $kw128$REMOVAL_NOT_TEMPORALLY_INTERSECTS;
  private static final SubLList $list129;
  private static final SubLObject $const130$temporallyDisjoint;
  private static final SubLSymbol $kw131$REMOVAL_TEMPORALLY_DISJOINT;
  private static final SubLList $list132;
  private static final SubLSymbol $sym133$REMOVAL_ALL_TEMPORALLY_DISJOINT_OUTPUT_GENERATE;
  private static final SubLSymbol $kw134$REMOVAL_ALL_TEMPORALLY_DISJOINT;
  private static final SubLList $list135;
  private static final SubLSymbol $kw136$ALL_TEMPORALLY_DISJOINT_POS;
  private static final SubLList $list137;
  private static final SubLSymbol $kw138$REMOVAL_ALL_TEMPORALLY_DISJOINT_INVERSE;
  private static final SubLList $list139;
  private static final SubLSymbol $kw140$ALL_TEMPORALLY_DISJOINT_INVERSE_POS;
  private static final SubLList $list141;
  private static final SubLSymbol $kw142$REMOVAL_NOT_TEMPORALLY_DISJOINT;
  private static final SubLList $list143;
  private static final SubLObject $const144$temporalBoundsContain;
  private static final SubLSymbol $kw145$REMOVAL_TEMPORAL_BOUNDS_CONTAIN;
  private static final SubLList $list146;
  private static final SubLSymbol $sym147$REMOVAL_ALL_TEMPORAL_BOUNDS_CONTAIN_OUTPUT_GENERATE;
  private static final SubLSymbol $kw148$REMOVAL_ALL_TEMPORAL_BOUNDS_CONTAIN;
  private static final SubLList $list149;
  private static final SubLSymbol $kw150$ALL_TEMPORAL_BOUNDS_CONTAIN_POS;
  private static final SubLList $list151;
  private static final SubLSymbol $sym152$REMOVAL_ALL_TEMPORAL_BOUNDS_CONTAIN_INVERSE_OUTPUT_GENERATE;
  private static final SubLSymbol $kw153$REMOVAL_ALL_TEMPORAL_BOUNDS_CONTAIN_INVERSE;
  private static final SubLList $list154;
  private static final SubLSymbol $kw155$ALL_TEMPORAL_BOUNDS_CONTAIN_INVERSE_POS;
  private static final SubLList $list156;
  private static final SubLSymbol $kw157$REMOVAL_NOT_TEMPORAL_BOUNDS_CONTAIN;
  private static final SubLList $list158;
  private static final SubLObject $const159$temporalBoundsSubsume;
  private static final SubLSymbol $kw160$REMOVAL_TEMPORAL_BOUNDS_SUBSUME;
  private static final SubLList $list161;
  private static final SubLSymbol $sym162$REMOVAL_ALL_TEMPORAL_BOUNDS_SUBSUME_OUTPUT_GENERATE;
  private static final SubLSymbol $kw163$REMOVAL_ALL_TEMPORAL_BOUNDS_SUBSUME;
  private static final SubLList $list164;
  private static final SubLSymbol $kw165$ALL_TEMPORAL_BOUNDS_SUBSUME_POS;
  private static final SubLList $list166;
  private static final SubLSymbol $sym167$REMOVAL_ALL_TEMPORAL_BOUNDS_SUBSUME_INVERSE_OUTPUT_GENERATE;
  private static final SubLSymbol $kw168$REMOVAL_ALL_TEMPORAL_BOUNDS_SUBSUME_INVERSE;
  private static final SubLList $list169;
  private static final SubLSymbol $kw170$ALL_TEMPORAL_BOUNDS_SUBSUME_INVERSE_POS;
  private static final SubLList $list171;
  private static final SubLSymbol $kw172$REMOVAL_NOT_TEMPORAL_BOUNDS_SUBSUME;
  private static final SubLList $list173;
  private static final SubLObject $const174$temporalBoundsIdentical;
  private static final SubLSymbol $kw175$REMOVAL_TEMPORAL_BOUNDS_IDENTICAL;
  private static final SubLList $list176;
  private static final SubLSymbol $sym177$REMOVAL_ALL_TEMPORAL_BOUNDS_IDENTICAL_OUTPUT_GENERATE;
  private static final SubLSymbol $kw178$REMOVAL_ALL_TEMPORAL_BOUNDS_IDENTICAL;
  private static final SubLList $list179;
  private static final SubLSymbol $kw180$ALL_TEMPORAL_BOUNDS_IDENTICAL_POS;
  private static final SubLList $list181;
  private static final SubLSymbol $kw182$REMOVAL_ALL_TEMPORAL_BOUNDS_IDENTICAL_INVERSE;
  private static final SubLList $list183;
  private static final SubLSymbol $kw184$ALL_TEMPORAL_BOUNDS_IDENTICAL_INVERSE_POS;
  private static final SubLList $list185;
  private static final SubLSymbol $kw186$REMOVAL_NOT_TEMPORAL_BOUNDS_IDENTICAL;
  private static final SubLList $list187;
  private static final SubLObject $const188$temporalBoundsIntersect;
  private static final SubLSymbol $kw189$REMOVAL_TEMPORAL_BOUNDS_INTERSECT;
  private static final SubLList $list190;
  private static final SubLSymbol $sym191$REMOVAL_ALL_TEMPORAL_BOUNDS_INTERSECT_OUTPUT_GENERATE;
  private static final SubLSymbol $kw192$REMOVAL_ALL_TEMPORAL_BOUNDS_INTERSECT;
  private static final SubLList $list193;
  private static final SubLSymbol $kw194$ALL_TEMPORAL_BOUNDS_INTERSECT_POS;
  private static final SubLList $list195;
  private static final SubLSymbol $kw196$REMOVAL_ALL_TEMPORAL_BOUNDS_INTERSECT_INVERSE;
  private static final SubLList $list197;
  private static final SubLSymbol $kw198$ALL_TEMPORAL_BOUNDS_INTERSECT_INVERSE_POS;
  private static final SubLList $list199;
  private static final SubLSymbol $kw200$REMOVAL_NOT_TEMPORAL_BOUNDS_INTERSECT;
  private static final SubLList $list201;
  private static final SubLObject $const202$temporallyCooriginating;
  private static final SubLSymbol $kw203$REMOVAL_TEMPORALLY_COORIGINATING;
  private static final SubLList $list204;
  private static final SubLSymbol $sym205$REMOVAL_ALL_TEMPORALLY_COORIGINATING_OUTPUT_GENERATE;
  private static final SubLSymbol $kw206$REMOVAL_ALL_TEMPORALLY_COORIGINATING;
  private static final SubLList $list207;
  private static final SubLSymbol $kw208$ALL_TEMPORALLY_COORIGINATING_POS;
  private static final SubLList $list209;
  private static final SubLSymbol $kw210$REMOVAL_ALL_TEMPORALLY_COORIGINATING_INVERSE;
  private static final SubLList $list211;
  private static final SubLSymbol $kw212$ALL_TEMPORALLY_COORIGINATING_INVERSE_POS;
  private static final SubLList $list213;
  private static final SubLSymbol $kw214$REMOVAL_NOT_TEMPORALLY_COORIGINATING;
  private static final SubLList $list215;
  private static final SubLObject $const216$temporallyCoterminal;
  private static final SubLSymbol $kw217$REMOVAL_TEMPORALLY_COTERMINAL;
  private static final SubLList $list218;
  private static final SubLSymbol $sym219$REMOVAL_ALL_TEMPORALLY_COTERMINAL_OUTPUT_GENERATE;
  private static final SubLSymbol $kw220$REMOVAL_ALL_TEMPORALLY_COTERMINAL;
  private static final SubLList $list221;
  private static final SubLSymbol $kw222$ALL_TEMPORALLY_COTERMINAL_POS;
  private static final SubLList $list223;
  private static final SubLSymbol $kw224$REMOVAL_ALL_TEMPORALLY_COTERMINAL_INVERSE;
  private static final SubLList $list225;
  private static final SubLSymbol $kw226$ALL_TEMPORALLY_COTERMINAL_INVERSE_POS;
  private static final SubLList $list227;
  private static final SubLSymbol $kw228$REMOVAL_NOT_TEMPORALLY_COTERMINAL;
  private static final SubLList $list229;
  private static final SubLObject $const230$contiguousAfter;
  private static final SubLSymbol $kw231$REMOVAL_CONTIGUOUS_AFTER;
  private static final SubLList $list232;
  private static final SubLSymbol $sym233$REMOVAL_ALL_CONTIGUOUS_AFTER_OUTPUT_GENERATE;
  private static final SubLSymbol $kw234$REMOVAL_ALL_CONTIGUOUS_AFTER;
  private static final SubLList $list235;
  private static final SubLSymbol $kw236$ALL_CONTIGUOUS_AFTER_POS;
  private static final SubLList $list237;
  private static final SubLSymbol $sym238$REMOVAL_ALL_CONTIGUOUS_AFTER_INVERSE_OUTPUT_GENERATE;
  private static final SubLSymbol $kw239$REMOVAL_ALL_CONTIGUOUS_AFTER_INVERSE;
  private static final SubLList $list240;
  private static final SubLSymbol $kw241$ALL_CONTIGUOUS_AFTER_INVERSE_POS;
  private static final SubLList $list242;
  private static final SubLSymbol $kw243$REMOVAL_NOT_CONTIGUOUS_AFTER;
  private static final SubLList $list244;
  private static final SubLObject $const245$startsDuring;
  private static final SubLSymbol $kw246$REMOVAL_STARTS_DURING;
  private static final SubLList $list247;
  private static final SubLSymbol $sym248$REMOVAL_ALL_STARTS_DURING_OUTPUT_GENERATE;
  private static final SubLSymbol $kw249$REMOVAL_ALL_STARTS_DURING;
  private static final SubLList $list250;
  private static final SubLSymbol $kw251$ALL_STARTS_DURING_POS;
  private static final SubLList $list252;
  private static final SubLSymbol $sym253$REMOVAL_ALL_STARTS_DURING_INVERSE_OUTPUT_GENERATE;
  private static final SubLSymbol $kw254$REMOVAL_ALL_STARTS_DURING_INVERSE;
  private static final SubLList $list255;
  private static final SubLSymbol $kw256$ALL_STARTS_DURING_INVERSE_POS;
  private static final SubLList $list257;
  private static final SubLSymbol $kw258$REMOVAL_NOT_STARTS_DURING;
  private static final SubLList $list259;
  private static final SubLObject $const260$endsDuring;
  private static final SubLSymbol $kw261$REMOVAL_ENDS_DURING;
  private static final SubLList $list262;
  private static final SubLSymbol $sym263$REMOVAL_ALL_ENDS_DURING_OUTPUT_GENERATE;
  private static final SubLSymbol $kw264$REMOVAL_ALL_ENDS_DURING;
  private static final SubLList $list265;
  private static final SubLSymbol $kw266$ALL_ENDS_DURING_POS;
  private static final SubLList $list267;
  private static final SubLSymbol $sym268$REMOVAL_ALL_ENDS_DURING_INVERSE_OUTPUT_GENERATE;
  private static final SubLSymbol $kw269$REMOVAL_ALL_ENDS_DURING_INVERSE;
  private static final SubLList $list270;
  private static final SubLSymbol $kw271$ALL_ENDS_DURING_INVERSE_POS;
  private static final SubLList $list272;
  private static final SubLSymbol $kw273$REMOVAL_NOT_ENDS_DURING;
  private static final SubLList $list274;
  private static final SubLObject $const275$startingDate;
  private static final SubLSymbol $kw276$REMOVAL_STARTING_DATE;
  private static final SubLList $list277;
  private static final SubLSymbol $sym278$REMOVAL_ALL_STARTING_DATE_INVERSE_OUTPUT_GENERATE;
  private static final SubLSymbol $kw279$REMOVAL_ALL_STARTING_DATE_INVERSE;
  private static final SubLList $list280;
  private static final SubLSymbol $kw281$ALL_STARTING_DATE_INVERSE_POS;
  private static final SubLList $list282;
  private static final SubLSymbol $kw283$REMOVAL_NOT_STARTING_DATE;
  private static final SubLList $list284;
  private static final SubLObject $const285$endingDate;
  private static final SubLSymbol $kw286$REMOVAL_ENDING_DATE;
  private static final SubLList $list287;
  private static final SubLSymbol $sym288$REMOVAL_ALL_ENDING_DATE_INVERSE_OUTPUT_GENERATE;
  private static final SubLSymbol $kw289$REMOVAL_ALL_ENDING_DATE_INVERSE;
  private static final SubLList $list290;
  private static final SubLSymbol $kw291$ALL_ENDING_DATE_INVERSE_POS;
  private static final SubLList $list292;
  private static final SubLSymbol $kw293$REMOVAL_NOT_ENDING_DATE;
  private static final SubLList $list294;
  private static final SubLObject $const295$birthDate;
  private static final SubLSymbol $kw296$REMOVAL_BIRTH_DATE;
  private static final SubLList $list297;
  private static final SubLSymbol $sym298$REMOVAL_ALL_BIRTH_DATE_INVERSE_OUTPUT_GENERATE;
  private static final SubLSymbol $kw299$REMOVAL_ALL_BIRTH_DATE_INVERSE;
  private static final SubLList $list300;
  private static final SubLSymbol $kw301$ALL_BIRTH_DATE_INVERSE_POS;
  private static final SubLList $list302;
  private static final SubLSymbol $kw303$REMOVAL_NOT_BIRTH_DATE;
  private static final SubLList $list304;
  private static final SubLObject $const305$dateOfDeath;
  private static final SubLSymbol $kw306$REMOVAL_DATE_OF_DEATH;
  private static final SubLList $list307;
  private static final SubLSymbol $sym308$REMOVAL_ALL_DATE_OF_DEATH_INVERSE_OUTPUT_GENERATE;
  private static final SubLSymbol $kw309$REMOVAL_ALL_DATE_OF_DEATH_INVERSE;
  private static final SubLList $list310;
  private static final SubLSymbol $kw311$ALL_DATE_OF_DEATH_INVERSE_POS;
  private static final SubLList $list312;
  private static final SubLSymbol $kw313$REMOVAL_NOT_DATE_OF_DEATH;
  private static final SubLList $list314;
  private static final SubLObject $const315$temporallyStartedBy;
  private static final SubLSymbol $kw316$REMOVAL_TEMPORALLY_STARTED_BY;
  private static final SubLList $list317;
  private static final SubLSymbol $sym318$REMOVAL_ALL_TEMPORALLY_STARTED_BY_OUTPUT_GENERATE;
  private static final SubLSymbol $kw319$REMOVAL_ALL_TEMPORALLY_STARTED_BY;
  private static final SubLList $list320;
  private static final SubLSymbol $kw321$ALL_TEMPORALLY_STARTED_BY_POS;
  private static final SubLList $list322;
  private static final SubLSymbol $sym323$REMOVAL_ALL_TEMPORALLY_STARTED_BY_INVERSE_OUTPUT_GENERATE;
  private static final SubLSymbol $kw324$REMOVAL_ALL_TEMPORALLY_STARTED_BY_INVERSE;
  private static final SubLList $list325;
  private static final SubLSymbol $kw326$ALL_TEMPORALLY_STARTED_BY_INVERSE_POS;
  private static final SubLList $list327;
  private static final SubLSymbol $kw328$REMOVAL_NOT_TEMPORALLY_STARTED_BY;
  private static final SubLList $list329;
  private static final SubLObject $const330$temporallyFinishedBy;
  private static final SubLSymbol $kw331$REMOVAL_TEMPORALLY_FINISHED_BY;
  private static final SubLList $list332;
  private static final SubLSymbol $sym333$REMOVAL_ALL_TEMPORALLY_FINISHED_BY_OUTPUT_GENERATE;
  private static final SubLSymbol $kw334$REMOVAL_ALL_TEMPORALLY_FINISHED_BY;
  private static final SubLList $list335;
  private static final SubLSymbol $kw336$ALL_TEMPORALLY_FINISHED_BY_POS;
  private static final SubLList $list337;
  private static final SubLSymbol $sym338$REMOVAL_ALL_TEMPORALLY_FINISHED_BY_INVERSE_OUTPUT_GENERATE;
  private static final SubLSymbol $kw339$REMOVAL_ALL_TEMPORALLY_FINISHED_BY_INVERSE;
  private static final SubLList $list340;
  private static final SubLSymbol $kw341$ALL_TEMPORALLY_FINISHED_BY_INVERSE_POS;
  private static final SubLList $list342;
  private static final SubLSymbol $kw343$REMOVAL_NOT_TEMPORALLY_FINISHED_BY;
  private static final SubLList $list344;
  private static final SubLObject $const345$overlapsStart;
  private static final SubLSymbol $kw346$REMOVAL_OVERLAPS_START;
  private static final SubLList $list347;
  private static final SubLSymbol $sym348$REMOVAL_ALL_OVERLAPS_START_OUTPUT_GENERATE;
  private static final SubLSymbol $kw349$REMOVAL_ALL_OVERLAPS_START;
  private static final SubLList $list350;
  private static final SubLSymbol $kw351$ALL_OVERLAPS_START_POS;
  private static final SubLList $list352;
  private static final SubLSymbol $sym353$REMOVAL_ALL_OVERLAPS_START_INVERSE_OUTPUT_GENERATE;
  private static final SubLSymbol $kw354$REMOVAL_ALL_OVERLAPS_START_INVERSE;
  private static final SubLList $list355;
  private static final SubLSymbol $kw356$ALL_OVERLAPS_START_INVERSE_POS;
  private static final SubLList $list357;
  private static final SubLSymbol $kw358$REMOVAL_NOT_OVERLAPS_START;
  private static final SubLList $list359;

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-sbhl-time-preds.lisp", position = 6173L)
  public static SubLObject removal_all_starts_after_starting_of_output_generate(final SubLObject temporal_thing)
  {
    return iteration.new_list_iterator( sbhl_time_modules.all_starts_after_starting_of( temporal_thing, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-sbhl-time-preds.lisp", position = 7505L)
  public static SubLObject removal_all_starts_after_starting_of_inverse_output_generate(final SubLObject temporal_thing)
  {
    return iteration.new_list_iterator( sbhl_time_modules.all_starts_after_starting_of_inverse( temporal_thing, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-sbhl-time-preds.lisp", position = 8881L)
  public static SubLObject removal_not_starts_after_starting_of_expand(final SubLObject literal, SubLObject sense)
  {
    if( sense == UNPROVIDED )
    {
      sense = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    thread.resetMultipleValues();
    final SubLObject arg1 = sbhl_time_utilities.sbhl_time_inference_args( literal );
    final SubLObject arg2 = thread.secondMultipleValue();
    thread.resetMultipleValues();
    if( NIL != control_vars.$negation_by_failure$.getDynamicValue( thread ) && NIL == sbhl_time_modules.starts_after_starting_ofP( arg1, arg2, UNPROVIDED ) )
    {
      backward.removal_add_node( arguments.make_hl_support( $kw26$MINIMIZE, cycl_utilities.negate( literal ), UNPROVIDED, UNPROVIDED ), UNPROVIDED, UNPROVIDED );
    }
    else if( NIL != sbhl_time_modules.not_starts_after_starting_ofP( arg1, arg2, UNPROVIDED ) )
    {
      backward.removal_add_node( arguments.make_hl_support( $kw27$TIME, cycl_utilities.negate( literal ), UNPROVIDED, UNPROVIDED ), UNPROVIDED, UNPROVIDED );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-sbhl-time-preds.lisp", position = 11136L)
  public static SubLObject removal_all_starts_after_ending_of_output_generate(final SubLObject temporal_thing)
  {
    return iteration.new_list_iterator( sbhl_time_modules.all_starts_after_ending_of( temporal_thing, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-sbhl-time-preds.lisp", position = 12440L)
  public static SubLObject removal_all_starts_after_ending_of_inverse_output_generate(final SubLObject temporal_thing)
  {
    return iteration.new_list_iterator( sbhl_time_modules.all_starts_after_ending_of_inverse( temporal_thing, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-sbhl-time-preds.lisp", position = 13796L)
  public static SubLObject removal_not_starts_after_ending_of_expand(final SubLObject literal, SubLObject sense)
  {
    if( sense == UNPROVIDED )
    {
      sense = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    thread.resetMultipleValues();
    final SubLObject arg1 = sbhl_time_utilities.sbhl_time_inference_args( literal );
    final SubLObject arg2 = thread.secondMultipleValue();
    thread.resetMultipleValues();
    if( NIL != control_vars.$negation_by_failure$.getDynamicValue( thread ) && NIL == sbhl_time_modules.starts_after_ending_ofP( arg1, arg2, UNPROVIDED ) )
    {
      backward.removal_add_node( arguments.make_hl_support( $kw26$MINIMIZE, cycl_utilities.negate( literal ), UNPROVIDED, UNPROVIDED ), UNPROVIDED, UNPROVIDED );
    }
    else if( NIL != sbhl_time_modules.not_starts_after_ending_ofP( arg1, arg2, UNPROVIDED ) )
    {
      backward.removal_add_node( arguments.make_hl_support( $kw27$TIME, cycl_utilities.negate( literal ), UNPROVIDED, UNPROVIDED ), UNPROVIDED, UNPROVIDED );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-sbhl-time-preds.lisp", position = 16029L)
  public static SubLObject removal_all_ends_after_starting_of_output_generate(final SubLObject temporal_thing)
  {
    return iteration.new_list_iterator( sbhl_time_modules.all_ends_after_starting_of( temporal_thing, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-sbhl-time-preds.lisp", position = 17338L)
  public static SubLObject removal_all_ends_after_starting_of_inverse_output_generate(final SubLObject temporal_thing)
  {
    return iteration.new_list_iterator( sbhl_time_modules.all_ends_after_starting_of_inverse( temporal_thing, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-sbhl-time-preds.lisp", position = 18690L)
  public static SubLObject removal_not_ends_after_starting_of_expand(final SubLObject literal, SubLObject sense)
  {
    if( sense == UNPROVIDED )
    {
      sense = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    thread.resetMultipleValues();
    final SubLObject arg1 = sbhl_time_utilities.sbhl_time_inference_args( literal );
    final SubLObject arg2 = thread.secondMultipleValue();
    thread.resetMultipleValues();
    if( NIL != control_vars.$negation_by_failure$.getDynamicValue( thread ) && NIL == sbhl_time_modules.ends_after_starting_ofP( arg1, arg2, UNPROVIDED ) )
    {
      backward.removal_add_node( arguments.make_hl_support( $kw26$MINIMIZE, cycl_utilities.negate( literal ), UNPROVIDED, UNPROVIDED ), UNPROVIDED, UNPROVIDED );
    }
    else if( NIL != sbhl_time_modules.not_ends_after_starting_ofP( arg1, arg2, UNPROVIDED ) )
    {
      backward.removal_add_node( arguments.make_hl_support( $kw27$TIME, cycl_utilities.negate( literal ), UNPROVIDED, UNPROVIDED ), UNPROVIDED, UNPROVIDED );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-sbhl-time-preds.lisp", position = 20910L)
  public static SubLObject removal_all_ends_after_ending_of_output_generate(final SubLObject temporal_thing)
  {
    return iteration.new_list_iterator( sbhl_time_modules.all_ends_after_ending_of( temporal_thing, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-sbhl-time-preds.lisp", position = 22190L)
  public static SubLObject removal_all_ends_after_ending_of_inverse_output_generate(final SubLObject temporal_thing)
  {
    return iteration.new_list_iterator( sbhl_time_modules.all_ends_after_ending_of_inverse( temporal_thing, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-sbhl-time-preds.lisp", position = 23518L)
  public static SubLObject removal_not_ends_after_ending_of_expand(final SubLObject literal, SubLObject sense)
  {
    if( sense == UNPROVIDED )
    {
      sense = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    thread.resetMultipleValues();
    final SubLObject arg1 = sbhl_time_utilities.sbhl_time_inference_args( literal );
    final SubLObject arg2 = thread.secondMultipleValue();
    thread.resetMultipleValues();
    if( NIL != control_vars.$negation_by_failure$.getDynamicValue( thread ) && NIL == sbhl_time_modules.ends_after_ending_ofP( arg1, arg2, UNPROVIDED ) )
    {
      backward.removal_add_node( arguments.make_hl_support( $kw26$MINIMIZE, cycl_utilities.negate( literal ), UNPROVIDED, UNPROVIDED ), UNPROVIDED, UNPROVIDED );
    }
    else if( NIL != sbhl_time_modules.not_ends_after_ending_ofP( arg1, arg2, UNPROVIDED ) )
    {
      backward.removal_add_node( arguments.make_hl_support( $kw27$TIME, cycl_utilities.negate( literal ), UNPROVIDED, UNPROVIDED ), UNPROVIDED, UNPROVIDED );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-sbhl-time-preds.lisp", position = 25728L)
  public static SubLObject removal_all_temporally_subsumes_output_generate(final SubLObject temporal_thing)
  {
    return iteration.new_list_iterator( sbhl_time_modules.all_temporally_subsumes( temporal_thing, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-sbhl-time-preds.lisp", position = 27010L)
  public static SubLObject removal_all_temporally_subsumes_inverse_output_generate(final SubLObject temporal_thing)
  {
    return iteration.new_list_iterator( sbhl_time_modules.all_temporally_subsumes_inverse( temporal_thing, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-sbhl-time-preds.lisp", position = 28340L)
  public static SubLObject removal_not_temporally_subsumes_expand(final SubLObject literal, SubLObject sense)
  {
    if( sense == UNPROVIDED )
    {
      sense = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    thread.resetMultipleValues();
    final SubLObject arg1 = sbhl_time_utilities.sbhl_time_inference_args( literal );
    final SubLObject arg2 = thread.secondMultipleValue();
    thread.resetMultipleValues();
    if( NIL != control_vars.$negation_by_failure$.getDynamicValue( thread ) && NIL == sbhl_time_modules.temporally_subsumesP( arg1, arg2, UNPROVIDED ) )
    {
      backward.removal_add_node( arguments.make_hl_support( $kw26$MINIMIZE, cycl_utilities.negate( literal ), UNPROVIDED, UNPROVIDED ), UNPROVIDED, UNPROVIDED );
    }
    else if( NIL != sbhl_time_modules.not_temporally_subsumesP( arg1, arg2, UNPROVIDED ) )
    {
      backward.removal_add_node( arguments.make_hl_support( $kw27$TIME, cycl_utilities.negate( literal ), UNPROVIDED, UNPROVIDED ), UNPROVIDED, UNPROVIDED );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-sbhl-time-preds.lisp", position = 30300L)
  public static SubLObject removal_all_date_of_event_inverse_output_generate(final SubLObject temporal_thing)
  {
    return iteration.new_list_iterator( sbhl_time_modules.all_date_of_event_inverse( temporal_thing, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-sbhl-time-preds.lisp", position = 31512L)
  public static SubLObject removal_not_date_of_event_expand(final SubLObject literal, SubLObject sense)
  {
    if( sense == UNPROVIDED )
    {
      sense = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    thread.resetMultipleValues();
    final SubLObject arg1 = sbhl_time_utilities.sbhl_time_inference_args( literal );
    final SubLObject arg2 = thread.secondMultipleValue();
    thread.resetMultipleValues();
    if( NIL != control_vars.$negation_by_failure$.getDynamicValue( thread ) && NIL == sbhl_time_modules.date_of_eventP( arg1, arg2, UNPROVIDED ) )
    {
      backward.removal_add_node( arguments.make_hl_support( $kw26$MINIMIZE, cycl_utilities.negate( literal ), UNPROVIDED, UNPROVIDED ), UNPROVIDED, UNPROVIDED );
    }
    else if( NIL != sbhl_time_modules.not_date_of_eventP( arg1, arg2, UNPROVIDED ) )
    {
      backward.removal_add_node( arguments.make_hl_support( $kw27$TIME, cycl_utilities.negate( literal ), UNPROVIDED, UNPROVIDED ), UNPROVIDED, UNPROVIDED );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-sbhl-time-preds.lisp", position = 33941L)
  public static SubLObject removal_all_cotemporal_output_generate(final SubLObject temporal_thing)
  {
    return iteration.new_list_iterator( sbhl_time_modules.all_cotemporal( temporal_thing, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-sbhl-time-preds.lisp", position = 36213L)
  public static SubLObject removal_not_cotemporal_expand(final SubLObject literal, SubLObject sense)
  {
    if( sense == UNPROVIDED )
    {
      sense = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    thread.resetMultipleValues();
    final SubLObject arg1 = sbhl_time_utilities.sbhl_time_inference_args( literal );
    final SubLObject arg2 = thread.secondMultipleValue();
    thread.resetMultipleValues();
    if( NIL != control_vars.$negation_by_failure$.getDynamicValue( thread ) && NIL == sbhl_time_modules.cotemporalP( arg1, arg2, UNPROVIDED ) )
    {
      final SubLObject formula = cycl_utilities.negate( backward_utilities.inference_make_commutative_literal( $const102$cotemporal, ConsesLow.list( arg1, arg2 ) ) );
      backward.removal_add_node( arguments.make_hl_support( $kw26$MINIMIZE, formula, UNPROVIDED, UNPROVIDED ), UNPROVIDED, UNPROVIDED );
    }
    else if( NIL != sbhl_time_modules.not_cotemporalP( arg1, arg2, UNPROVIDED ) )
    {
      final SubLObject formula = cycl_utilities.negate( backward_utilities.inference_make_commutative_literal( $const102$cotemporal, ConsesLow.list( arg1, arg2 ) ) );
      backward.removal_add_node( arguments.make_hl_support( $kw27$TIME, formula, UNPROVIDED, UNPROVIDED ), UNPROVIDED, UNPROVIDED );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-sbhl-time-preds.lisp", position = 38462L)
  public static SubLObject removal_all_temporally_intersects_output_generate(final SubLObject temporal_thing)
  {
    return iteration.new_list_iterator( sbhl_time_modules.all_temporally_intersects( temporal_thing, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-sbhl-time-preds.lisp", position = 40961L)
  public static SubLObject removal_not_temporally_intersects_expand(final SubLObject literal, SubLObject sense)
  {
    if( sense == UNPROVIDED )
    {
      sense = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    thread.resetMultipleValues();
    final SubLObject arg1 = sbhl_time_utilities.sbhl_time_inference_args( literal );
    final SubLObject arg2 = thread.secondMultipleValue();
    thread.resetMultipleValues();
    if( NIL != control_vars.$negation_by_failure$.getDynamicValue( thread ) && NIL == sbhl_time_modules.temporally_intersectsP( arg1, arg2, UNPROVIDED ) )
    {
      final SubLObject formula = cycl_utilities.negate( backward_utilities.inference_make_commutative_literal( $const116$temporallyIntersects, ConsesLow.list( arg1, arg2 ) ) );
      backward.removal_add_node( arguments.make_hl_support( $kw26$MINIMIZE, formula, UNPROVIDED, UNPROVIDED ), UNPROVIDED, UNPROVIDED );
    }
    else if( NIL != sbhl_time_modules.not_temporally_intersectsP( arg1, arg2, UNPROVIDED ) )
    {
      final SubLObject formula = cycl_utilities.negate( backward_utilities.inference_make_commutative_literal( $const116$temporallyIntersects, ConsesLow.list( arg1, arg2 ) ) );
      backward.removal_add_node( arguments.make_hl_support( $kw27$TIME, formula, UNPROVIDED, UNPROVIDED ), UNPROVIDED, UNPROVIDED );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-sbhl-time-preds.lisp", position = 43281L)
  public static SubLObject removal_all_temporally_disjoint_output_generate(final SubLObject temporal_thing)
  {
    return iteration.new_list_iterator( sbhl_time_modules.all_temporally_disjoint( temporal_thing, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-sbhl-time-preds.lisp", position = 45727L)
  public static SubLObject removal_not_temporally_disjoint_expand(final SubLObject literal, SubLObject sense)
  {
    if( sense == UNPROVIDED )
    {
      sense = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    thread.resetMultipleValues();
    final SubLObject arg1 = sbhl_time_utilities.sbhl_time_inference_args( literal );
    final SubLObject arg2 = thread.secondMultipleValue();
    thread.resetMultipleValues();
    if( NIL != control_vars.$negation_by_failure$.getDynamicValue( thread ) && NIL == sbhl_time_modules.temporally_disjointP( arg1, arg2, UNPROVIDED ) )
    {
      final SubLObject formula = cycl_utilities.negate( backward_utilities.inference_make_commutative_literal( $const130$temporallyDisjoint, ConsesLow.list( arg1, arg2 ) ) );
      backward.removal_add_node( arguments.make_hl_support( $kw26$MINIMIZE, formula, UNPROVIDED, UNPROVIDED ), UNPROVIDED, UNPROVIDED );
    }
    else if( NIL != sbhl_time_modules.not_temporally_disjointP( arg1, arg2, UNPROVIDED ) )
    {
      final SubLObject formula = cycl_utilities.negate( backward_utilities.inference_make_commutative_literal( $const130$temporallyDisjoint, ConsesLow.list( arg1, arg2 ) ) );
      backward.removal_add_node( arguments.make_hl_support( $kw27$TIME, formula, UNPROVIDED, UNPROVIDED ), UNPROVIDED, UNPROVIDED );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-sbhl-time-preds.lisp", position = 48052L)
  public static SubLObject removal_all_temporal_bounds_contain_output_generate(final SubLObject temporal_thing)
  {
    return iteration.new_list_iterator( sbhl_time_modules.all_temporal_bounds_contain( temporal_thing, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-sbhl-time-preds.lisp", position = 49388L)
  public static SubLObject removal_all_temporal_bounds_contain_inverse_output_generate(final SubLObject temporal_thing)
  {
    return iteration.new_list_iterator( sbhl_time_modules.all_temporal_bounds_contain_inverse( temporal_thing, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-sbhl-time-preds.lisp", position = 50772L)
  public static SubLObject removal_not_temporal_bounds_contain_expand(final SubLObject literal, SubLObject sense)
  {
    if( sense == UNPROVIDED )
    {
      sense = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    thread.resetMultipleValues();
    final SubLObject arg1 = sbhl_time_utilities.sbhl_time_inference_args( literal );
    final SubLObject arg2 = thread.secondMultipleValue();
    thread.resetMultipleValues();
    if( NIL != control_vars.$negation_by_failure$.getDynamicValue( thread ) && NIL == sbhl_time_modules.temporal_bounds_containP( arg1, arg2, UNPROVIDED ) )
    {
      backward.removal_add_node( arguments.make_hl_support( $kw26$MINIMIZE, cycl_utilities.negate( literal ), UNPROVIDED, UNPROVIDED ), UNPROVIDED, UNPROVIDED );
    }
    else if( NIL != sbhl_time_modules.not_temporal_bounds_containP( arg1, arg2, UNPROVIDED ) )
    {
      backward.removal_add_node( arguments.make_hl_support( $kw27$TIME, cycl_utilities.negate( literal ), UNPROVIDED, UNPROVIDED ), UNPROVIDED, UNPROVIDED );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-sbhl-time-preds.lisp", position = 52938L)
  public static SubLObject removal_all_temporal_bounds_subsume_output_generate(final SubLObject temporal_thing)
  {
    return iteration.new_list_iterator( sbhl_time_modules.all_temporal_bounds_subsume( temporal_thing, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-sbhl-time-preds.lisp", position = 54274L)
  public static SubLObject removal_all_temporal_bounds_subsume_inverse_output_generate(final SubLObject temporal_thing)
  {
    return iteration.new_list_iterator( sbhl_time_modules.all_temporal_bounds_subsume_inverse( temporal_thing, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-sbhl-time-preds.lisp", position = 55658L)
  public static SubLObject removal_not_temporal_bounds_subsume_expand(final SubLObject literal, SubLObject sense)
  {
    if( sense == UNPROVIDED )
    {
      sense = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    thread.resetMultipleValues();
    final SubLObject arg1 = sbhl_time_utilities.sbhl_time_inference_args( literal );
    final SubLObject arg2 = thread.secondMultipleValue();
    thread.resetMultipleValues();
    if( NIL != control_vars.$negation_by_failure$.getDynamicValue( thread ) && NIL == sbhl_time_modules.temporal_bounds_subsumeP( arg1, arg2, UNPROVIDED ) )
    {
      backward.removal_add_node( arguments.make_hl_support( $kw26$MINIMIZE, cycl_utilities.negate( literal ), UNPROVIDED, UNPROVIDED ), UNPROVIDED, UNPROVIDED );
    }
    else if( NIL != sbhl_time_modules.not_temporal_bounds_subsumeP( arg1, arg2, UNPROVIDED ) )
    {
      backward.removal_add_node( arguments.make_hl_support( $kw27$TIME, cycl_utilities.negate( literal ), UNPROVIDED, UNPROVIDED ), UNPROVIDED, UNPROVIDED );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-sbhl-time-preds.lisp", position = 57840L)
  public static SubLObject removal_all_temporal_bounds_identical_output_generate(final SubLObject temporal_thing)
  {
    return iteration.new_list_iterator( sbhl_time_modules.all_temporal_bounds_identical( temporal_thing, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-sbhl-time-preds.lisp", position = 60404L)
  public static SubLObject removal_not_temporal_bounds_identical_expand(final SubLObject literal, SubLObject sense)
  {
    if( sense == UNPROVIDED )
    {
      sense = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    thread.resetMultipleValues();
    final SubLObject arg1 = sbhl_time_utilities.sbhl_time_inference_args( literal );
    final SubLObject arg2 = thread.secondMultipleValue();
    thread.resetMultipleValues();
    if( NIL != control_vars.$negation_by_failure$.getDynamicValue( thread ) && NIL == sbhl_time_modules.temporal_bounds_identicalP( arg1, arg2, UNPROVIDED ) )
    {
      final SubLObject formula = cycl_utilities.negate( backward_utilities.inference_make_commutative_literal( $const174$temporalBoundsIdentical, ConsesLow.list( arg1, arg2 ) ) );
      backward.removal_add_node( arguments.make_hl_support( $kw26$MINIMIZE, formula, UNPROVIDED, UNPROVIDED ), UNPROVIDED, UNPROVIDED );
    }
    else if( NIL != sbhl_time_modules.not_temporal_bounds_identicalP( arg1, arg2, UNPROVIDED ) )
    {
      final SubLObject formula = cycl_utilities.negate( backward_utilities.inference_make_commutative_literal( $const174$temporalBoundsIdentical, ConsesLow.list( arg1, arg2 ) ) );
      backward.removal_add_node( arguments.make_hl_support( $kw27$TIME, formula, UNPROVIDED, UNPROVIDED ), UNPROVIDED, UNPROVIDED );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-sbhl-time-preds.lisp", position = 62760L)
  public static SubLObject removal_all_temporal_bounds_intersect_output_generate(final SubLObject temporal_thing)
  {
    return iteration.new_list_iterator( sbhl_time_modules.all_temporal_bounds_intersect( temporal_thing, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-sbhl-time-preds.lisp", position = 65324L)
  public static SubLObject removal_not_temporal_bounds_intersect_expand(final SubLObject literal, SubLObject sense)
  {
    if( sense == UNPROVIDED )
    {
      sense = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    thread.resetMultipleValues();
    final SubLObject arg1 = sbhl_time_utilities.sbhl_time_inference_args( literal );
    final SubLObject arg2 = thread.secondMultipleValue();
    thread.resetMultipleValues();
    if( NIL != control_vars.$negation_by_failure$.getDynamicValue( thread ) && NIL == sbhl_time_modules.temporal_bounds_intersectP( arg1, arg2, UNPROVIDED ) )
    {
      final SubLObject formula = cycl_utilities.negate( backward_utilities.inference_make_commutative_literal( $const188$temporalBoundsIntersect, ConsesLow.list( arg1, arg2 ) ) );
      backward.removal_add_node( arguments.make_hl_support( $kw26$MINIMIZE, formula, UNPROVIDED, UNPROVIDED ), UNPROVIDED, UNPROVIDED );
    }
    else if( NIL != sbhl_time_modules.not_temporal_bounds_intersectP( arg1, arg2, UNPROVIDED ) )
    {
      final SubLObject formula = cycl_utilities.negate( backward_utilities.inference_make_commutative_literal( $const188$temporalBoundsIntersect, ConsesLow.list( arg1, arg2 ) ) );
      backward.removal_add_node( arguments.make_hl_support( $kw27$TIME, formula, UNPROVIDED, UNPROVIDED ), UNPROVIDED, UNPROVIDED );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-sbhl-time-preds.lisp", position = 67718L)
  public static SubLObject removal_all_temporally_cooriginating_output_generate(final SubLObject temporal_thing)
  {
    return iteration.new_list_iterator( sbhl_time_modules.all_temporally_cooriginating( temporal_thing, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-sbhl-time-preds.lisp", position = 70273L)
  public static SubLObject removal_not_temporally_cooriginating_expand(final SubLObject literal, SubLObject sense)
  {
    if( sense == UNPROVIDED )
    {
      sense = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    thread.resetMultipleValues();
    final SubLObject arg1 = sbhl_time_utilities.sbhl_time_inference_args( literal );
    final SubLObject arg2 = thread.secondMultipleValue();
    thread.resetMultipleValues();
    if( NIL != control_vars.$negation_by_failure$.getDynamicValue( thread ) && NIL == sbhl_time_modules.temporally_cooriginatingP( arg1, arg2, UNPROVIDED ) )
    {
      final SubLObject formula = cycl_utilities.negate( backward_utilities.inference_make_commutative_literal( $const202$temporallyCooriginating, ConsesLow.list( arg1, arg2 ) ) );
      backward.removal_add_node( arguments.make_hl_support( $kw26$MINIMIZE, formula, UNPROVIDED, UNPROVIDED ), UNPROVIDED, UNPROVIDED );
    }
    else if( NIL != sbhl_time_modules.not_temporally_cooriginatingP( arg1, arg2, UNPROVIDED ) )
    {
      final SubLObject formula = cycl_utilities.negate( backward_utilities.inference_make_commutative_literal( $const202$temporallyCooriginating, ConsesLow.list( arg1, arg2 ) ) );
      backward.removal_add_node( arguments.make_hl_support( $kw27$TIME, formula, UNPROVIDED, UNPROVIDED ), UNPROVIDED, UNPROVIDED );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-sbhl-time-preds.lisp", position = 72632L)
  public static SubLObject removal_all_temporally_coterminal_output_generate(final SubLObject temporal_thing)
  {
    return iteration.new_list_iterator( sbhl_time_modules.all_temporally_coterminal( temporal_thing, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-sbhl-time-preds.lisp", position = 75121L)
  public static SubLObject removal_not_temporally_coterminal_expand(final SubLObject literal, SubLObject sense)
  {
    if( sense == UNPROVIDED )
    {
      sense = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    thread.resetMultipleValues();
    final SubLObject arg1 = sbhl_time_utilities.sbhl_time_inference_args( literal );
    final SubLObject arg2 = thread.secondMultipleValue();
    thread.resetMultipleValues();
    if( NIL != control_vars.$negation_by_failure$.getDynamicValue( thread ) && NIL == sbhl_time_modules.temporally_coterminalP( arg1, arg2, UNPROVIDED ) )
    {
      final SubLObject formula = cycl_utilities.negate( backward_utilities.inference_make_commutative_literal( $const216$temporallyCoterminal, ConsesLow.list( arg1, arg2 ) ) );
      backward.removal_add_node( arguments.make_hl_support( $kw26$MINIMIZE, formula, UNPROVIDED, UNPROVIDED ), UNPROVIDED, UNPROVIDED );
    }
    else if( NIL != sbhl_time_modules.not_temporally_coterminalP( arg1, arg2, UNPROVIDED ) )
    {
      final SubLObject formula = cycl_utilities.negate( backward_utilities.inference_make_commutative_literal( $const216$temporallyCoterminal, ConsesLow.list( arg1, arg2 ) ) );
      backward.removal_add_node( arguments.make_hl_support( $kw27$TIME, formula, UNPROVIDED, UNPROVIDED ), UNPROVIDED, UNPROVIDED );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-sbhl-time-preds.lisp", position = 77403L)
  public static SubLObject removal_all_contiguous_after_output_generate(final SubLObject temporal_thing)
  {
    return iteration.new_list_iterator( sbhl_time_modules.all_contiguous_after( temporal_thing, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-sbhl-time-preds.lisp", position = 78662L)
  public static SubLObject removal_all_contiguous_after_inverse_output_generate(final SubLObject temporal_thing)
  {
    return iteration.new_list_iterator( sbhl_time_modules.all_contiguous_after_inverse( temporal_thing, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-sbhl-time-preds.lisp", position = 79969L)
  public static SubLObject removal_not_contiguous_after_expand(final SubLObject literal, SubLObject sense)
  {
    if( sense == UNPROVIDED )
    {
      sense = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    thread.resetMultipleValues();
    final SubLObject arg1 = sbhl_time_utilities.sbhl_time_inference_args( literal );
    final SubLObject arg2 = thread.secondMultipleValue();
    thread.resetMultipleValues();
    if( NIL != control_vars.$negation_by_failure$.getDynamicValue( thread ) && NIL == sbhl_time_modules.contiguous_afterP( arg1, arg2, UNPROVIDED ) )
    {
      backward.removal_add_node( arguments.make_hl_support( $kw26$MINIMIZE, cycl_utilities.negate( literal ), UNPROVIDED, UNPROVIDED ), UNPROVIDED, UNPROVIDED );
    }
    else if( NIL != sbhl_time_modules.not_contiguous_afterP( arg1, arg2, UNPROVIDED ) )
    {
      backward.removal_add_node( arguments.make_hl_support( $kw27$TIME, cycl_utilities.negate( literal ), UNPROVIDED, UNPROVIDED ), UNPROVIDED, UNPROVIDED );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-sbhl-time-preds.lisp", position = 81992L)
  public static SubLObject removal_all_starts_during_output_generate(final SubLObject temporal_thing)
  {
    return iteration.new_list_iterator( sbhl_time_modules.all_starts_during( temporal_thing, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-sbhl-time-preds.lisp", position = 83215L)
  public static SubLObject removal_all_starts_during_inverse_output_generate(final SubLObject temporal_thing)
  {
    return iteration.new_list_iterator( sbhl_time_modules.all_starts_during_inverse( temporal_thing, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-sbhl-time-preds.lisp", position = 84486L)
  public static SubLObject removal_not_starts_during_expand(final SubLObject literal, SubLObject sense)
  {
    if( sense == UNPROVIDED )
    {
      sense = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    thread.resetMultipleValues();
    final SubLObject arg1 = sbhl_time_utilities.sbhl_time_inference_args( literal );
    final SubLObject arg2 = thread.secondMultipleValue();
    thread.resetMultipleValues();
    if( NIL != control_vars.$negation_by_failure$.getDynamicValue( thread ) && NIL == sbhl_time_modules.starts_duringP( arg1, arg2, UNPROVIDED ) )
    {
      backward.removal_add_node( arguments.make_hl_support( $kw26$MINIMIZE, cycl_utilities.negate( literal ), UNPROVIDED, UNPROVIDED ), UNPROVIDED, UNPROVIDED );
    }
    else if( NIL != sbhl_time_modules.not_starts_duringP( arg1, arg2, UNPROVIDED ) )
    {
      backward.removal_add_node( arguments.make_hl_support( $kw27$TIME, cycl_utilities.negate( literal ), UNPROVIDED, UNPROVIDED ), UNPROVIDED, UNPROVIDED );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-sbhl-time-preds.lisp", position = 86468L)
  public static SubLObject removal_all_ends_during_output_generate(final SubLObject temporal_thing)
  {
    return iteration.new_list_iterator( sbhl_time_modules.all_ends_during( temporal_thing, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-sbhl-time-preds.lisp", position = 87667L)
  public static SubLObject removal_all_ends_during_inverse_output_generate(final SubLObject temporal_thing)
  {
    return iteration.new_list_iterator( sbhl_time_modules.all_ends_during_inverse( temporal_thing, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-sbhl-time-preds.lisp", position = 88914L)
  public static SubLObject removal_not_ends_during_expand(final SubLObject literal, SubLObject sense)
  {
    if( sense == UNPROVIDED )
    {
      sense = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    thread.resetMultipleValues();
    final SubLObject arg1 = sbhl_time_utilities.sbhl_time_inference_args( literal );
    final SubLObject arg2 = thread.secondMultipleValue();
    thread.resetMultipleValues();
    if( NIL != control_vars.$negation_by_failure$.getDynamicValue( thread ) && NIL == sbhl_time_modules.ends_duringP( arg1, arg2, UNPROVIDED ) )
    {
      backward.removal_add_node( arguments.make_hl_support( $kw26$MINIMIZE, cycl_utilities.negate( literal ), UNPROVIDED, UNPROVIDED ), UNPROVIDED, UNPROVIDED );
    }
    else if( NIL != sbhl_time_modules.not_ends_duringP( arg1, arg2, UNPROVIDED ) )
    {
      backward.removal_add_node( arguments.make_hl_support( $kw27$TIME, cycl_utilities.negate( literal ), UNPROVIDED, UNPROVIDED ), UNPROVIDED, UNPROVIDED );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-sbhl-time-preds.lisp", position = 90821L)
  public static SubLObject removal_all_starting_date_inverse_output_generate(final SubLObject temporal_thing)
  {
    return iteration.new_list_iterator( sbhl_time_modules.all_starting_date_inverse( temporal_thing, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-sbhl-time-preds.lisp", position = 92053L)
  public static SubLObject removal_not_starting_date_expand(final SubLObject literal, SubLObject sense)
  {
    if( sense == UNPROVIDED )
    {
      sense = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    thread.resetMultipleValues();
    final SubLObject arg1 = sbhl_time_utilities.sbhl_time_inference_args( literal );
    final SubLObject arg2 = thread.secondMultipleValue();
    thread.resetMultipleValues();
    if( NIL != control_vars.$negation_by_failure$.getDynamicValue( thread ) && NIL == sbhl_time_modules.starting_dateP( arg1, arg2, UNPROVIDED ) )
    {
      backward.removal_add_node( arguments.make_hl_support( $kw26$MINIMIZE, cycl_utilities.negate( literal ), UNPROVIDED, UNPROVIDED ), UNPROVIDED, UNPROVIDED );
    }
    else if( NIL != sbhl_time_modules.not_starting_dateP( arg1, arg2, UNPROVIDED ) )
    {
      backward.removal_add_node( arguments.make_hl_support( $kw27$TIME, cycl_utilities.negate( literal ), UNPROVIDED, UNPROVIDED ), UNPROVIDED, UNPROVIDED );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-sbhl-time-preds.lisp", position = 93954L)
  public static SubLObject removal_all_ending_date_inverse_output_generate(final SubLObject temporal_thing)
  {
    return iteration.new_list_iterator( sbhl_time_modules.all_ending_date_inverse( temporal_thing, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-sbhl-time-preds.lisp", position = 95162L)
  public static SubLObject removal_not_ending_date_expand(final SubLObject literal, SubLObject sense)
  {
    if( sense == UNPROVIDED )
    {
      sense = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    thread.resetMultipleValues();
    final SubLObject arg1 = sbhl_time_utilities.sbhl_time_inference_args( literal );
    final SubLObject arg2 = thread.secondMultipleValue();
    thread.resetMultipleValues();
    if( NIL != control_vars.$negation_by_failure$.getDynamicValue( thread ) && NIL == sbhl_time_modules.ending_dateP( arg1, arg2, UNPROVIDED ) )
    {
      backward.removal_add_node( arguments.make_hl_support( $kw26$MINIMIZE, cycl_utilities.negate( literal ), UNPROVIDED, UNPROVIDED ), UNPROVIDED, UNPROVIDED );
    }
    else if( NIL != sbhl_time_modules.not_ending_dateP( arg1, arg2, UNPROVIDED ) )
    {
      backward.removal_add_node( arguments.make_hl_support( $kw27$TIME, cycl_utilities.negate( literal ), UNPROVIDED, UNPROVIDED ), UNPROVIDED, UNPROVIDED );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-sbhl-time-preds.lisp", position = 97039L)
  public static SubLObject removal_all_birth_date_inverse_output_generate(final SubLObject temporal_thing)
  {
    return iteration.new_list_iterator( sbhl_time_modules.all_birth_date_inverse( temporal_thing, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-sbhl-time-preds.lisp", position = 98245L)
  public static SubLObject removal_not_birth_date_expand(final SubLObject literal, SubLObject sense)
  {
    if( sense == UNPROVIDED )
    {
      sense = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    thread.resetMultipleValues();
    final SubLObject arg1 = sbhl_time_utilities.sbhl_time_inference_args( literal );
    final SubLObject arg2 = thread.secondMultipleValue();
    thread.resetMultipleValues();
    if( NIL != control_vars.$negation_by_failure$.getDynamicValue( thread ) && NIL == sbhl_time_modules.birth_dateP( arg1, arg2, UNPROVIDED ) )
    {
      backward.removal_add_node( arguments.make_hl_support( $kw26$MINIMIZE, cycl_utilities.negate( literal ), UNPROVIDED, UNPROVIDED ), UNPROVIDED, UNPROVIDED );
    }
    else if( NIL != sbhl_time_modules.not_birth_dateP( arg1, arg2, UNPROVIDED ) )
    {
      backward.removal_add_node( arguments.make_hl_support( $kw27$TIME, cycl_utilities.negate( literal ), UNPROVIDED, UNPROVIDED ), UNPROVIDED, UNPROVIDED );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-sbhl-time-preds.lisp", position = 100135L)
  public static SubLObject removal_all_date_of_death_inverse_output_generate(final SubLObject temporal_thing)
  {
    return iteration.new_list_iterator( sbhl_time_modules.all_date_of_death_inverse( temporal_thing, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-sbhl-time-preds.lisp", position = 101360L)
  public static SubLObject removal_not_date_of_death_expand(final SubLObject literal, SubLObject sense)
  {
    if( sense == UNPROVIDED )
    {
      sense = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    thread.resetMultipleValues();
    final SubLObject arg1 = sbhl_time_utilities.sbhl_time_inference_args( literal );
    final SubLObject arg2 = thread.secondMultipleValue();
    thread.resetMultipleValues();
    if( NIL != control_vars.$negation_by_failure$.getDynamicValue( thread ) && NIL == sbhl_time_modules.date_of_deathP( arg1, arg2, UNPROVIDED ) )
    {
      backward.removal_add_node( arguments.make_hl_support( $kw26$MINIMIZE, cycl_utilities.negate( literal ), UNPROVIDED, UNPROVIDED ), UNPROVIDED, UNPROVIDED );
    }
    else if( NIL != sbhl_time_modules.not_date_of_deathP( arg1, arg2, UNPROVIDED ) )
    {
      backward.removal_add_node( arguments.make_hl_support( $kw27$TIME, cycl_utilities.negate( literal ), UNPROVIDED, UNPROVIDED ), UNPROVIDED, UNPROVIDED );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-sbhl-time-preds.lisp", position = 103432L)
  public static SubLObject removal_all_temporally_started_by_output_generate(final SubLObject temporal_thing)
  {
    return iteration.new_list_iterator( sbhl_time_modules.all_temporally_started_by( temporal_thing, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-sbhl-time-preds.lisp", position = 104744L)
  public static SubLObject removal_all_temporally_started_by_inverse_output_generate(final SubLObject temporal_thing)
  {
    return iteration.new_list_iterator( sbhl_time_modules.all_temporally_started_by_inverse( temporal_thing, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-sbhl-time-preds.lisp", position = 106104L)
  public static SubLObject removal_not_temporally_started_by_expand(final SubLObject literal, SubLObject sense)
  {
    if( sense == UNPROVIDED )
    {
      sense = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    thread.resetMultipleValues();
    final SubLObject arg1 = sbhl_time_utilities.sbhl_time_inference_args( literal );
    final SubLObject arg2 = thread.secondMultipleValue();
    thread.resetMultipleValues();
    if( NIL != control_vars.$negation_by_failure$.getDynamicValue( thread ) && NIL == sbhl_time_modules.temporally_started_byP( arg1, arg2, UNPROVIDED ) )
    {
      backward.removal_add_node( arguments.make_hl_support( $kw26$MINIMIZE, cycl_utilities.negate( literal ), UNPROVIDED, UNPROVIDED ), UNPROVIDED, UNPROVIDED );
    }
    else if( NIL != sbhl_time_modules.not_temporally_started_byP( arg1, arg2, UNPROVIDED ) )
    {
      backward.removal_add_node( arguments.make_hl_support( $kw27$TIME, cycl_utilities.negate( literal ), UNPROVIDED, UNPROVIDED ), UNPROVIDED, UNPROVIDED );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-sbhl-time-preds.lisp", position = 108242L)
  public static SubLObject removal_all_temporally_finished_by_output_generate(final SubLObject temporal_thing)
  {
    return iteration.new_list_iterator( sbhl_time_modules.all_temporally_finished_by( temporal_thing, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-sbhl-time-preds.lisp", position = 109590L)
  public static SubLObject removal_all_temporally_finished_by_inverse_output_generate(final SubLObject temporal_thing)
  {
    return iteration.new_list_iterator( sbhl_time_modules.all_temporally_finished_by_inverse( temporal_thing, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-sbhl-time-preds.lisp", position = 110962L)
  public static SubLObject removal_not_temporally_finished_by_expand(final SubLObject literal, SubLObject sense)
  {
    if( sense == UNPROVIDED )
    {
      sense = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    thread.resetMultipleValues();
    final SubLObject arg1 = sbhl_time_utilities.sbhl_time_inference_args( literal );
    final SubLObject arg2 = thread.secondMultipleValue();
    thread.resetMultipleValues();
    if( NIL != control_vars.$negation_by_failure$.getDynamicValue( thread ) && NIL == sbhl_time_modules.temporally_finished_byP( arg1, arg2, UNPROVIDED ) )
    {
      backward.removal_add_node( arguments.make_hl_support( $kw26$MINIMIZE, cycl_utilities.negate( literal ), UNPROVIDED, UNPROVIDED ), UNPROVIDED, UNPROVIDED );
    }
    else if( NIL != sbhl_time_modules.not_temporally_finished_byP( arg1, arg2, UNPROVIDED ) )
    {
      backward.removal_add_node( arguments.make_hl_support( $kw27$TIME, cycl_utilities.negate( literal ), UNPROVIDED, UNPROVIDED ), UNPROVIDED, UNPROVIDED );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-sbhl-time-preds.lisp", position = 113035L)
  public static SubLObject removal_all_overlaps_start_output_generate(final SubLObject temporal_thing)
  {
    return iteration.new_list_iterator( sbhl_time_modules.all_overlaps_start( temporal_thing, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-sbhl-time-preds.lisp", position = 114270L)
  public static SubLObject removal_all_overlaps_start_inverse_output_generate(final SubLObject temporal_thing)
  {
    return iteration.new_list_iterator( sbhl_time_modules.all_overlaps_start_inverse( temporal_thing, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-sbhl-time-preds.lisp", position = 115553L)
  public static SubLObject removal_not_overlaps_start_expand(final SubLObject literal, SubLObject sense)
  {
    if( sense == UNPROVIDED )
    {
      sense = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    thread.resetMultipleValues();
    final SubLObject arg1 = sbhl_time_utilities.sbhl_time_inference_args( literal );
    final SubLObject arg2 = thread.secondMultipleValue();
    thread.resetMultipleValues();
    if( NIL != control_vars.$negation_by_failure$.getDynamicValue( thread ) && NIL == sbhl_time_modules.overlaps_startP( arg1, arg2, UNPROVIDED ) )
    {
      backward.removal_add_node( arguments.make_hl_support( $kw26$MINIMIZE, cycl_utilities.negate( literal ), UNPROVIDED, UNPROVIDED ), UNPROVIDED, UNPROVIDED );
    }
    else if( NIL != sbhl_time_modules.not_overlaps_startP( arg1, arg2, UNPROVIDED ) )
    {
      backward.removal_add_node( arguments.make_hl_support( $kw27$TIME, cycl_utilities.negate( literal ), UNPROVIDED, UNPROVIDED ), UNPROVIDED, UNPROVIDED );
    }
    return NIL;
  }

  public static SubLObject declare_removal_modules_sbhl_time_preds_file()
  {
    SubLFiles.declareFunction( me, "removal_all_starts_after_starting_of_output_generate", "REMOVAL-ALL-STARTS-AFTER-STARTING-OF-OUTPUT-GENERATE", 1, 0, false );
    SubLFiles.declareFunction( me, "removal_all_starts_after_starting_of_inverse_output_generate", "REMOVAL-ALL-STARTS-AFTER-STARTING-OF-INVERSE-OUTPUT-GENERATE", 1, 0, false );
    SubLFiles.declareFunction( me, "removal_not_starts_after_starting_of_expand", "REMOVAL-NOT-STARTS-AFTER-STARTING-OF-EXPAND", 1, 1, false );
    SubLFiles.declareFunction( me, "removal_all_starts_after_ending_of_output_generate", "REMOVAL-ALL-STARTS-AFTER-ENDING-OF-OUTPUT-GENERATE", 1, 0, false );
    SubLFiles.declareFunction( me, "removal_all_starts_after_ending_of_inverse_output_generate", "REMOVAL-ALL-STARTS-AFTER-ENDING-OF-INVERSE-OUTPUT-GENERATE", 1, 0, false );
    SubLFiles.declareFunction( me, "removal_not_starts_after_ending_of_expand", "REMOVAL-NOT-STARTS-AFTER-ENDING-OF-EXPAND", 1, 1, false );
    SubLFiles.declareFunction( me, "removal_all_ends_after_starting_of_output_generate", "REMOVAL-ALL-ENDS-AFTER-STARTING-OF-OUTPUT-GENERATE", 1, 0, false );
    SubLFiles.declareFunction( me, "removal_all_ends_after_starting_of_inverse_output_generate", "REMOVAL-ALL-ENDS-AFTER-STARTING-OF-INVERSE-OUTPUT-GENERATE", 1, 0, false );
    SubLFiles.declareFunction( me, "removal_not_ends_after_starting_of_expand", "REMOVAL-NOT-ENDS-AFTER-STARTING-OF-EXPAND", 1, 1, false );
    SubLFiles.declareFunction( me, "removal_all_ends_after_ending_of_output_generate", "REMOVAL-ALL-ENDS-AFTER-ENDING-OF-OUTPUT-GENERATE", 1, 0, false );
    SubLFiles.declareFunction( me, "removal_all_ends_after_ending_of_inverse_output_generate", "REMOVAL-ALL-ENDS-AFTER-ENDING-OF-INVERSE-OUTPUT-GENERATE", 1, 0, false );
    SubLFiles.declareFunction( me, "removal_not_ends_after_ending_of_expand", "REMOVAL-NOT-ENDS-AFTER-ENDING-OF-EXPAND", 1, 1, false );
    SubLFiles.declareFunction( me, "removal_all_temporally_subsumes_output_generate", "REMOVAL-ALL-TEMPORALLY-SUBSUMES-OUTPUT-GENERATE", 1, 0, false );
    SubLFiles.declareFunction( me, "removal_all_temporally_subsumes_inverse_output_generate", "REMOVAL-ALL-TEMPORALLY-SUBSUMES-INVERSE-OUTPUT-GENERATE", 1, 0, false );
    SubLFiles.declareFunction( me, "removal_not_temporally_subsumes_expand", "REMOVAL-NOT-TEMPORALLY-SUBSUMES-EXPAND", 1, 1, false );
    SubLFiles.declareFunction( me, "removal_all_date_of_event_inverse_output_generate", "REMOVAL-ALL-DATE-OF-EVENT-INVERSE-OUTPUT-GENERATE", 1, 0, false );
    SubLFiles.declareFunction( me, "removal_not_date_of_event_expand", "REMOVAL-NOT-DATE-OF-EVENT-EXPAND", 1, 1, false );
    SubLFiles.declareFunction( me, "removal_all_cotemporal_output_generate", "REMOVAL-ALL-COTEMPORAL-OUTPUT-GENERATE", 1, 0, false );
    SubLFiles.declareFunction( me, "removal_not_cotemporal_expand", "REMOVAL-NOT-COTEMPORAL-EXPAND", 1, 1, false );
    SubLFiles.declareFunction( me, "removal_all_temporally_intersects_output_generate", "REMOVAL-ALL-TEMPORALLY-INTERSECTS-OUTPUT-GENERATE", 1, 0, false );
    SubLFiles.declareFunction( me, "removal_not_temporally_intersects_expand", "REMOVAL-NOT-TEMPORALLY-INTERSECTS-EXPAND", 1, 1, false );
    SubLFiles.declareFunction( me, "removal_all_temporally_disjoint_output_generate", "REMOVAL-ALL-TEMPORALLY-DISJOINT-OUTPUT-GENERATE", 1, 0, false );
    SubLFiles.declareFunction( me, "removal_not_temporally_disjoint_expand", "REMOVAL-NOT-TEMPORALLY-DISJOINT-EXPAND", 1, 1, false );
    SubLFiles.declareFunction( me, "removal_all_temporal_bounds_contain_output_generate", "REMOVAL-ALL-TEMPORAL-BOUNDS-CONTAIN-OUTPUT-GENERATE", 1, 0, false );
    SubLFiles.declareFunction( me, "removal_all_temporal_bounds_contain_inverse_output_generate", "REMOVAL-ALL-TEMPORAL-BOUNDS-CONTAIN-INVERSE-OUTPUT-GENERATE", 1, 0, false );
    SubLFiles.declareFunction( me, "removal_not_temporal_bounds_contain_expand", "REMOVAL-NOT-TEMPORAL-BOUNDS-CONTAIN-EXPAND", 1, 1, false );
    SubLFiles.declareFunction( me, "removal_all_temporal_bounds_subsume_output_generate", "REMOVAL-ALL-TEMPORAL-BOUNDS-SUBSUME-OUTPUT-GENERATE", 1, 0, false );
    SubLFiles.declareFunction( me, "removal_all_temporal_bounds_subsume_inverse_output_generate", "REMOVAL-ALL-TEMPORAL-BOUNDS-SUBSUME-INVERSE-OUTPUT-GENERATE", 1, 0, false );
    SubLFiles.declareFunction( me, "removal_not_temporal_bounds_subsume_expand", "REMOVAL-NOT-TEMPORAL-BOUNDS-SUBSUME-EXPAND", 1, 1, false );
    SubLFiles.declareFunction( me, "removal_all_temporal_bounds_identical_output_generate", "REMOVAL-ALL-TEMPORAL-BOUNDS-IDENTICAL-OUTPUT-GENERATE", 1, 0, false );
    SubLFiles.declareFunction( me, "removal_not_temporal_bounds_identical_expand", "REMOVAL-NOT-TEMPORAL-BOUNDS-IDENTICAL-EXPAND", 1, 1, false );
    SubLFiles.declareFunction( me, "removal_all_temporal_bounds_intersect_output_generate", "REMOVAL-ALL-TEMPORAL-BOUNDS-INTERSECT-OUTPUT-GENERATE", 1, 0, false );
    SubLFiles.declareFunction( me, "removal_not_temporal_bounds_intersect_expand", "REMOVAL-NOT-TEMPORAL-BOUNDS-INTERSECT-EXPAND", 1, 1, false );
    SubLFiles.declareFunction( me, "removal_all_temporally_cooriginating_output_generate", "REMOVAL-ALL-TEMPORALLY-COORIGINATING-OUTPUT-GENERATE", 1, 0, false );
    SubLFiles.declareFunction( me, "removal_not_temporally_cooriginating_expand", "REMOVAL-NOT-TEMPORALLY-COORIGINATING-EXPAND", 1, 1, false );
    SubLFiles.declareFunction( me, "removal_all_temporally_coterminal_output_generate", "REMOVAL-ALL-TEMPORALLY-COTERMINAL-OUTPUT-GENERATE", 1, 0, false );
    SubLFiles.declareFunction( me, "removal_not_temporally_coterminal_expand", "REMOVAL-NOT-TEMPORALLY-COTERMINAL-EXPAND", 1, 1, false );
    SubLFiles.declareFunction( me, "removal_all_contiguous_after_output_generate", "REMOVAL-ALL-CONTIGUOUS-AFTER-OUTPUT-GENERATE", 1, 0, false );
    SubLFiles.declareFunction( me, "removal_all_contiguous_after_inverse_output_generate", "REMOVAL-ALL-CONTIGUOUS-AFTER-INVERSE-OUTPUT-GENERATE", 1, 0, false );
    SubLFiles.declareFunction( me, "removal_not_contiguous_after_expand", "REMOVAL-NOT-CONTIGUOUS-AFTER-EXPAND", 1, 1, false );
    SubLFiles.declareFunction( me, "removal_all_starts_during_output_generate", "REMOVAL-ALL-STARTS-DURING-OUTPUT-GENERATE", 1, 0, false );
    SubLFiles.declareFunction( me, "removal_all_starts_during_inverse_output_generate", "REMOVAL-ALL-STARTS-DURING-INVERSE-OUTPUT-GENERATE", 1, 0, false );
    SubLFiles.declareFunction( me, "removal_not_starts_during_expand", "REMOVAL-NOT-STARTS-DURING-EXPAND", 1, 1, false );
    SubLFiles.declareFunction( me, "removal_all_ends_during_output_generate", "REMOVAL-ALL-ENDS-DURING-OUTPUT-GENERATE", 1, 0, false );
    SubLFiles.declareFunction( me, "removal_all_ends_during_inverse_output_generate", "REMOVAL-ALL-ENDS-DURING-INVERSE-OUTPUT-GENERATE", 1, 0, false );
    SubLFiles.declareFunction( me, "removal_not_ends_during_expand", "REMOVAL-NOT-ENDS-DURING-EXPAND", 1, 1, false );
    SubLFiles.declareFunction( me, "removal_all_starting_date_inverse_output_generate", "REMOVAL-ALL-STARTING-DATE-INVERSE-OUTPUT-GENERATE", 1, 0, false );
    SubLFiles.declareFunction( me, "removal_not_starting_date_expand", "REMOVAL-NOT-STARTING-DATE-EXPAND", 1, 1, false );
    SubLFiles.declareFunction( me, "removal_all_ending_date_inverse_output_generate", "REMOVAL-ALL-ENDING-DATE-INVERSE-OUTPUT-GENERATE", 1, 0, false );
    SubLFiles.declareFunction( me, "removal_not_ending_date_expand", "REMOVAL-NOT-ENDING-DATE-EXPAND", 1, 1, false );
    SubLFiles.declareFunction( me, "removal_all_birth_date_inverse_output_generate", "REMOVAL-ALL-BIRTH-DATE-INVERSE-OUTPUT-GENERATE", 1, 0, false );
    SubLFiles.declareFunction( me, "removal_not_birth_date_expand", "REMOVAL-NOT-BIRTH-DATE-EXPAND", 1, 1, false );
    SubLFiles.declareFunction( me, "removal_all_date_of_death_inverse_output_generate", "REMOVAL-ALL-DATE-OF-DEATH-INVERSE-OUTPUT-GENERATE", 1, 0, false );
    SubLFiles.declareFunction( me, "removal_not_date_of_death_expand", "REMOVAL-NOT-DATE-OF-DEATH-EXPAND", 1, 1, false );
    SubLFiles.declareFunction( me, "removal_all_temporally_started_by_output_generate", "REMOVAL-ALL-TEMPORALLY-STARTED-BY-OUTPUT-GENERATE", 1, 0, false );
    SubLFiles.declareFunction( me, "removal_all_temporally_started_by_inverse_output_generate", "REMOVAL-ALL-TEMPORALLY-STARTED-BY-INVERSE-OUTPUT-GENERATE", 1, 0, false );
    SubLFiles.declareFunction( me, "removal_not_temporally_started_by_expand", "REMOVAL-NOT-TEMPORALLY-STARTED-BY-EXPAND", 1, 1, false );
    SubLFiles.declareFunction( me, "removal_all_temporally_finished_by_output_generate", "REMOVAL-ALL-TEMPORALLY-FINISHED-BY-OUTPUT-GENERATE", 1, 0, false );
    SubLFiles.declareFunction( me, "removal_all_temporally_finished_by_inverse_output_generate", "REMOVAL-ALL-TEMPORALLY-FINISHED-BY-INVERSE-OUTPUT-GENERATE", 1, 0, false );
    SubLFiles.declareFunction( me, "removal_not_temporally_finished_by_expand", "REMOVAL-NOT-TEMPORALLY-FINISHED-BY-EXPAND", 1, 1, false );
    SubLFiles.declareFunction( me, "removal_all_overlaps_start_output_generate", "REMOVAL-ALL-OVERLAPS-START-OUTPUT-GENERATE", 1, 0, false );
    SubLFiles.declareFunction( me, "removal_all_overlaps_start_inverse_output_generate", "REMOVAL-ALL-OVERLAPS-START-INVERSE-OUTPUT-GENERATE", 1, 0, false );
    SubLFiles.declareFunction( me, "removal_not_overlaps_start_expand", "REMOVAL-NOT-OVERLAPS-START-EXPAND", 1, 1, false );
    return NIL;
  }

  public static SubLObject init_removal_modules_sbhl_time_preds_file()
  {
    $sbhl_time_generic_modules$ = SubLFiles.deflexical( "*SBHL-TIME-GENERIC-MODULES*", $list0 );
    $default_temporal_relation_check_cost$ = SubLFiles.defparameter( "*DEFAULT-TEMPORAL-RELATION-CHECK-COST*", control_vars.$hl_module_check_cost$.getDynamicValue() );
    $default_all_temporal_relation_cost$ = SubLFiles.defparameter( "*DEFAULT-ALL-TEMPORAL-RELATION-COST*", $int12$200 );
    $default_all_temporal_relation_inverse_cost$ = SubLFiles.defparameter( "*DEFAULT-ALL-TEMPORAL-RELATION-INVERSE-COST*", $int12$200 );
    $default_not_temporal_relation_check_cost$ = SubLFiles.defparameter( "*DEFAULT-NOT-TEMPORAL-RELATION-CHECK-COST*", ONE_INTEGER );
    return NIL;
  }

  public static SubLObject setup_removal_modules_sbhl_time_preds_file()
  {
    inference_modules.inference_removal_module( $kw1$SBHL_TIME_TOTAL_EXCLUSIVITY_POS, ConsesLow.listS( $kw2$SENSE, new SubLObject[] { $kw3$POS, $kw4$ARITY, TWO_INTEGER, $kw5$REQUIRED_PATTERN, $list6, $kw7$EXCLUSIVE,
      $sym8$TRUE, $kw9$SUPPLANTS, conses_high.copy_list( $sbhl_time_generic_modules$.getGlobalValue() ), $list10
    } ) );
    final SubLObject predicates = $list11;
    final SubLObject removal_modules = $sbhl_time_generic_modules$.getGlobalValue();
    SubLObject cdolist_list_var = predicates;
    SubLObject pred = NIL;
    pred = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      inference_modules.inference_removal_module_use_generic( pred, $kw1$SBHL_TIME_TOTAL_EXCLUSIVITY_POS );
      SubLObject cdolist_list_var_$1 = removal_modules;
      SubLObject module = NIL;
      module = cdolist_list_var_$1.first();
      while ( NIL != cdolist_list_var_$1)
      {
        inference_modules.inference_removal_module_use_generic( pred, module );
        cdolist_list_var_$1 = cdolist_list_var_$1.rest();
        module = cdolist_list_var_$1.first();
      }
      cdolist_list_var = cdolist_list_var.rest();
      pred = cdolist_list_var.first();
    }
    inference_modules.register_solely_specific_removal_module_predicate( $const13$startsAfterStartingOf );
    inference_modules.inference_removal_module( $kw14$REMOVAL_STARTS_AFTER_STARTING_OF, $list15 );
    utilities_macros.note_funcall_helper_function( $sym16$REMOVAL_ALL_STARTS_AFTER_STARTING_OF_OUTPUT_GENERATE );
    inference_modules.inference_removal_module( $kw17$REMOVAL_ALL_STARTS_AFTER_STARTING_OF, $list18 );
    preference_modules.inference_preference_module( $kw19$ALL_STARTS_AFTER_STARTING_OF_POS, $list20 );
    utilities_macros.note_funcall_helper_function( $sym21$REMOVAL_ALL_STARTS_AFTER_STARTING_OF_INVERSE_OUTPUT_GENERATE );
    inference_modules.inference_removal_module( $kw22$REMOVAL_ALL_STARTS_AFTER_STARTING_OF_INVERSE, $list23 );
    preference_modules.inference_preference_module( $kw24$ALL_STARTS_AFTER_STARTING_OF_INVERSE_POS, $list25 );
    inference_modules.inference_removal_module( $kw28$REMOVAL_NOT_STARTS_AFTER_STARTING_OF, $list29 );
    inference_modules.register_solely_specific_removal_module_predicate( $const30$startsAfterEndingOf );
    inference_modules.inference_removal_module( $kw31$REMOVAL_STARTS_AFTER_ENDING_OF, $list32 );
    utilities_macros.note_funcall_helper_function( $sym33$REMOVAL_ALL_STARTS_AFTER_ENDING_OF_OUTPUT_GENERATE );
    inference_modules.inference_removal_module( $kw34$REMOVAL_ALL_STARTS_AFTER_ENDING_OF, $list35 );
    preference_modules.inference_preference_module( $kw36$ALL_STARTS_AFTER_ENDING_OF_POS, $list37 );
    utilities_macros.note_funcall_helper_function( $sym38$REMOVAL_ALL_STARTS_AFTER_ENDING_OF_INVERSE_OUTPUT_GENERATE );
    inference_modules.inference_removal_module( $kw39$REMOVAL_ALL_STARTS_AFTER_ENDING_OF_INVERSE, $list40 );
    preference_modules.inference_preference_module( $kw41$ALL_STARTS_AFTER_ENDING_OF_INVERSE_POS, $list42 );
    inference_modules.inference_removal_module( $kw43$REMOVAL_NOT_STARTS_AFTER_ENDING_OF, $list44 );
    inference_modules.register_solely_specific_removal_module_predicate( $const45$endsAfterStartingOf );
    inference_modules.inference_removal_module( $kw46$REMOVAL_ENDS_AFTER_STARTING_OF, $list47 );
    utilities_macros.note_funcall_helper_function( $sym48$REMOVAL_ALL_ENDS_AFTER_STARTING_OF_OUTPUT_GENERATE );
    inference_modules.inference_removal_module( $kw49$REMOVAL_ALL_ENDS_AFTER_STARTING_OF, $list50 );
    preference_modules.inference_preference_module( $kw51$ALL_ENDS_AFTER_STARTING_OF_POS, $list52 );
    utilities_macros.note_funcall_helper_function( $sym53$REMOVAL_ALL_ENDS_AFTER_STARTING_OF_INVERSE_OUTPUT_GENERATE );
    inference_modules.inference_removal_module( $kw54$REMOVAL_ALL_ENDS_AFTER_STARTING_OF_INVERSE, $list55 );
    preference_modules.inference_preference_module( $kw56$ALL_ENDS_AFTER_STARTING_OF_INVERSE_POS, $list57 );
    inference_modules.inference_removal_module( $kw58$REMOVAL_NOT_ENDS_AFTER_STARTING_OF, $list59 );
    inference_modules.register_solely_specific_removal_module_predicate( $const60$endsAfterEndingOf );
    inference_modules.inference_removal_module( $kw61$REMOVAL_ENDS_AFTER_ENDING_OF, $list62 );
    utilities_macros.note_funcall_helper_function( $sym63$REMOVAL_ALL_ENDS_AFTER_ENDING_OF_OUTPUT_GENERATE );
    inference_modules.inference_removal_module( $kw64$REMOVAL_ALL_ENDS_AFTER_ENDING_OF, $list65 );
    preference_modules.inference_preference_module( $kw66$ALL_ENDS_AFTER_ENDING_OF_POS, $list67 );
    utilities_macros.note_funcall_helper_function( $sym68$REMOVAL_ALL_ENDS_AFTER_ENDING_OF_INVERSE_OUTPUT_GENERATE );
    inference_modules.inference_removal_module( $kw69$REMOVAL_ALL_ENDS_AFTER_ENDING_OF_INVERSE, $list70 );
    preference_modules.inference_preference_module( $kw71$ALL_ENDS_AFTER_ENDING_OF_INVERSE_POS, $list72 );
    inference_modules.inference_removal_module( $kw73$REMOVAL_NOT_ENDS_AFTER_ENDING_OF, $list74 );
    inference_modules.register_solely_specific_removal_module_predicate( $const75$temporallySubsumes );
    inference_modules.inference_removal_module( $kw76$REMOVAL_TEMPORALLY_SUBSUMES, $list77 );
    utilities_macros.note_funcall_helper_function( $sym78$REMOVAL_ALL_TEMPORALLY_SUBSUMES_OUTPUT_GENERATE );
    inference_modules.inference_removal_module( $kw79$REMOVAL_ALL_TEMPORALLY_SUBSUMES, $list80 );
    preference_modules.inference_preference_module( $kw81$ALL_TEMPORALLY_SUBSUMES_POS, $list82 );
    utilities_macros.note_funcall_helper_function( $sym83$REMOVAL_ALL_TEMPORALLY_SUBSUMES_INVERSE_OUTPUT_GENERATE );
    inference_modules.inference_removal_module( $kw84$REMOVAL_ALL_TEMPORALLY_SUBSUMES_INVERSE, $list85 );
    preference_modules.inference_preference_module( $kw86$ALL_TEMPORALLY_SUBSUMES_INVERSE_POS, $list87 );
    inference_modules.inference_removal_module( $kw88$REMOVAL_NOT_TEMPORALLY_SUBSUMES, $list89 );
    inference_modules.register_solely_specific_removal_module_predicate( $const90$dateOfEvent );
    preference_modules.doomed_unless_either_arg_bindable( $kw3$POS, $const90$dateOfEvent );
    inference_modules.inference_removal_module( $kw91$REMOVAL_DATE_OF_EVENT, $list92 );
    utilities_macros.note_funcall_helper_function( $sym93$REMOVAL_ALL_DATE_OF_EVENT_INVERSE_OUTPUT_GENERATE );
    inference_modules.inference_removal_module( $kw94$REMOVAL_ALL_DATE_OF_EVENT_INVERSE, $list95 );
    preference_modules.inference_preference_module( $kw96$ALL_DATE_OF_EVENT_INVERSE_POS, $list97 );
    inference_modules.inference_removal_module( $kw98$REMOVAL_NOT_DATE_OF_EVENT, $list99 );
    inference_modules.inference_removal_module( $kw100$REMOVAL_DATE_OF_EVENT_DELAY, $list101 );
    inference_modules.register_solely_specific_removal_module_predicate( $const102$cotemporal );
    inference_modules.inference_removal_module( $kw103$REMOVAL_COTEMPORAL, $list104 );
    utilities_macros.note_funcall_helper_function( $sym105$REMOVAL_ALL_COTEMPORAL_OUTPUT_GENERATE );
    inference_modules.inference_removal_module( $kw106$REMOVAL_ALL_COTEMPORAL, $list107 );
    preference_modules.inference_preference_module( $kw108$ALL_COTEMPORAL_POS, $list109 );
    inference_modules.inference_removal_module( $kw110$REMOVAL_ALL_COTEMPORAL_INVERSE, $list111 );
    preference_modules.inference_preference_module( $kw112$ALL_COTEMPORAL_INVERSE_POS, $list113 );
    inference_modules.inference_removal_module( $kw114$REMOVAL_NOT_COTEMPORAL, $list115 );
    inference_modules.register_solely_specific_removal_module_predicate( $const116$temporallyIntersects );
    inference_modules.inference_removal_module( $kw117$REMOVAL_TEMPORALLY_INTERSECTS, $list118 );
    utilities_macros.note_funcall_helper_function( $sym119$REMOVAL_ALL_TEMPORALLY_INTERSECTS_OUTPUT_GENERATE );
    inference_modules.inference_removal_module( $kw120$REMOVAL_ALL_TEMPORALLY_INTERSECTS, $list121 );
    preference_modules.inference_preference_module( $kw122$ALL_TEMPORALLY_INTERSECTS_POS, $list123 );
    inference_modules.inference_removal_module( $kw124$REMOVAL_ALL_TEMPORALLY_INTERSECTS_INVERSE, $list125 );
    preference_modules.inference_preference_module( $kw126$ALL_TEMPORALLY_INTERSECTS_INVERSE_POS, $list127 );
    inference_modules.inference_removal_module( $kw128$REMOVAL_NOT_TEMPORALLY_INTERSECTS, $list129 );
    inference_modules.register_solely_specific_removal_module_predicate( $const130$temporallyDisjoint );
    inference_modules.inference_removal_module( $kw131$REMOVAL_TEMPORALLY_DISJOINT, $list132 );
    utilities_macros.note_funcall_helper_function( $sym133$REMOVAL_ALL_TEMPORALLY_DISJOINT_OUTPUT_GENERATE );
    inference_modules.inference_removal_module( $kw134$REMOVAL_ALL_TEMPORALLY_DISJOINT, $list135 );
    preference_modules.inference_preference_module( $kw136$ALL_TEMPORALLY_DISJOINT_POS, $list137 );
    inference_modules.inference_removal_module( $kw138$REMOVAL_ALL_TEMPORALLY_DISJOINT_INVERSE, $list139 );
    preference_modules.inference_preference_module( $kw140$ALL_TEMPORALLY_DISJOINT_INVERSE_POS, $list141 );
    inference_modules.inference_removal_module( $kw142$REMOVAL_NOT_TEMPORALLY_DISJOINT, $list143 );
    inference_modules.register_solely_specific_removal_module_predicate( $const144$temporalBoundsContain );
    inference_modules.inference_removal_module( $kw145$REMOVAL_TEMPORAL_BOUNDS_CONTAIN, $list146 );
    utilities_macros.note_funcall_helper_function( $sym147$REMOVAL_ALL_TEMPORAL_BOUNDS_CONTAIN_OUTPUT_GENERATE );
    inference_modules.inference_removal_module( $kw148$REMOVAL_ALL_TEMPORAL_BOUNDS_CONTAIN, $list149 );
    preference_modules.inference_preference_module( $kw150$ALL_TEMPORAL_BOUNDS_CONTAIN_POS, $list151 );
    utilities_macros.note_funcall_helper_function( $sym152$REMOVAL_ALL_TEMPORAL_BOUNDS_CONTAIN_INVERSE_OUTPUT_GENERATE );
    inference_modules.inference_removal_module( $kw153$REMOVAL_ALL_TEMPORAL_BOUNDS_CONTAIN_INVERSE, $list154 );
    preference_modules.inference_preference_module( $kw155$ALL_TEMPORAL_BOUNDS_CONTAIN_INVERSE_POS, $list156 );
    inference_modules.inference_removal_module( $kw157$REMOVAL_NOT_TEMPORAL_BOUNDS_CONTAIN, $list158 );
    inference_modules.register_solely_specific_removal_module_predicate( $const159$temporalBoundsSubsume );
    inference_modules.inference_removal_module( $kw160$REMOVAL_TEMPORAL_BOUNDS_SUBSUME, $list161 );
    utilities_macros.note_funcall_helper_function( $sym162$REMOVAL_ALL_TEMPORAL_BOUNDS_SUBSUME_OUTPUT_GENERATE );
    inference_modules.inference_removal_module( $kw163$REMOVAL_ALL_TEMPORAL_BOUNDS_SUBSUME, $list164 );
    preference_modules.inference_preference_module( $kw165$ALL_TEMPORAL_BOUNDS_SUBSUME_POS, $list166 );
    utilities_macros.note_funcall_helper_function( $sym167$REMOVAL_ALL_TEMPORAL_BOUNDS_SUBSUME_INVERSE_OUTPUT_GENERATE );
    inference_modules.inference_removal_module( $kw168$REMOVAL_ALL_TEMPORAL_BOUNDS_SUBSUME_INVERSE, $list169 );
    preference_modules.inference_preference_module( $kw170$ALL_TEMPORAL_BOUNDS_SUBSUME_INVERSE_POS, $list171 );
    inference_modules.inference_removal_module( $kw172$REMOVAL_NOT_TEMPORAL_BOUNDS_SUBSUME, $list173 );
    inference_modules.register_solely_specific_removal_module_predicate( $const174$temporalBoundsIdentical );
    inference_modules.inference_removal_module( $kw175$REMOVAL_TEMPORAL_BOUNDS_IDENTICAL, $list176 );
    utilities_macros.note_funcall_helper_function( $sym177$REMOVAL_ALL_TEMPORAL_BOUNDS_IDENTICAL_OUTPUT_GENERATE );
    inference_modules.inference_removal_module( $kw178$REMOVAL_ALL_TEMPORAL_BOUNDS_IDENTICAL, $list179 );
    preference_modules.inference_preference_module( $kw180$ALL_TEMPORAL_BOUNDS_IDENTICAL_POS, $list181 );
    inference_modules.inference_removal_module( $kw182$REMOVAL_ALL_TEMPORAL_BOUNDS_IDENTICAL_INVERSE, $list183 );
    preference_modules.inference_preference_module( $kw184$ALL_TEMPORAL_BOUNDS_IDENTICAL_INVERSE_POS, $list185 );
    inference_modules.inference_removal_module( $kw186$REMOVAL_NOT_TEMPORAL_BOUNDS_IDENTICAL, $list187 );
    inference_modules.register_solely_specific_removal_module_predicate( $const188$temporalBoundsIntersect );
    inference_modules.inference_removal_module( $kw189$REMOVAL_TEMPORAL_BOUNDS_INTERSECT, $list190 );
    utilities_macros.note_funcall_helper_function( $sym191$REMOVAL_ALL_TEMPORAL_BOUNDS_INTERSECT_OUTPUT_GENERATE );
    inference_modules.inference_removal_module( $kw192$REMOVAL_ALL_TEMPORAL_BOUNDS_INTERSECT, $list193 );
    preference_modules.inference_preference_module( $kw194$ALL_TEMPORAL_BOUNDS_INTERSECT_POS, $list195 );
    inference_modules.inference_removal_module( $kw196$REMOVAL_ALL_TEMPORAL_BOUNDS_INTERSECT_INVERSE, $list197 );
    preference_modules.inference_preference_module( $kw198$ALL_TEMPORAL_BOUNDS_INTERSECT_INVERSE_POS, $list199 );
    inference_modules.inference_removal_module( $kw200$REMOVAL_NOT_TEMPORAL_BOUNDS_INTERSECT, $list201 );
    inference_modules.register_solely_specific_removal_module_predicate( $const202$temporallyCooriginating );
    inference_modules.inference_removal_module( $kw203$REMOVAL_TEMPORALLY_COORIGINATING, $list204 );
    utilities_macros.note_funcall_helper_function( $sym205$REMOVAL_ALL_TEMPORALLY_COORIGINATING_OUTPUT_GENERATE );
    inference_modules.inference_removal_module( $kw206$REMOVAL_ALL_TEMPORALLY_COORIGINATING, $list207 );
    preference_modules.inference_preference_module( $kw208$ALL_TEMPORALLY_COORIGINATING_POS, $list209 );
    inference_modules.inference_removal_module( $kw210$REMOVAL_ALL_TEMPORALLY_COORIGINATING_INVERSE, $list211 );
    preference_modules.inference_preference_module( $kw212$ALL_TEMPORALLY_COORIGINATING_INVERSE_POS, $list213 );
    inference_modules.inference_removal_module( $kw214$REMOVAL_NOT_TEMPORALLY_COORIGINATING, $list215 );
    inference_modules.register_solely_specific_removal_module_predicate( $const216$temporallyCoterminal );
    inference_modules.inference_removal_module( $kw217$REMOVAL_TEMPORALLY_COTERMINAL, $list218 );
    utilities_macros.note_funcall_helper_function( $sym219$REMOVAL_ALL_TEMPORALLY_COTERMINAL_OUTPUT_GENERATE );
    inference_modules.inference_removal_module( $kw220$REMOVAL_ALL_TEMPORALLY_COTERMINAL, $list221 );
    preference_modules.inference_preference_module( $kw222$ALL_TEMPORALLY_COTERMINAL_POS, $list223 );
    inference_modules.inference_removal_module( $kw224$REMOVAL_ALL_TEMPORALLY_COTERMINAL_INVERSE, $list225 );
    preference_modules.inference_preference_module( $kw226$ALL_TEMPORALLY_COTERMINAL_INVERSE_POS, $list227 );
    inference_modules.inference_removal_module( $kw228$REMOVAL_NOT_TEMPORALLY_COTERMINAL, $list229 );
    inference_modules.register_solely_specific_removal_module_predicate( $const230$contiguousAfter );
    inference_modules.inference_removal_module( $kw231$REMOVAL_CONTIGUOUS_AFTER, $list232 );
    utilities_macros.note_funcall_helper_function( $sym233$REMOVAL_ALL_CONTIGUOUS_AFTER_OUTPUT_GENERATE );
    inference_modules.inference_removal_module( $kw234$REMOVAL_ALL_CONTIGUOUS_AFTER, $list235 );
    preference_modules.inference_preference_module( $kw236$ALL_CONTIGUOUS_AFTER_POS, $list237 );
    utilities_macros.note_funcall_helper_function( $sym238$REMOVAL_ALL_CONTIGUOUS_AFTER_INVERSE_OUTPUT_GENERATE );
    inference_modules.inference_removal_module( $kw239$REMOVAL_ALL_CONTIGUOUS_AFTER_INVERSE, $list240 );
    preference_modules.inference_preference_module( $kw241$ALL_CONTIGUOUS_AFTER_INVERSE_POS, $list242 );
    inference_modules.inference_removal_module( $kw243$REMOVAL_NOT_CONTIGUOUS_AFTER, $list244 );
    inference_modules.register_solely_specific_removal_module_predicate( $const245$startsDuring );
    inference_modules.inference_removal_module( $kw246$REMOVAL_STARTS_DURING, $list247 );
    utilities_macros.note_funcall_helper_function( $sym248$REMOVAL_ALL_STARTS_DURING_OUTPUT_GENERATE );
    inference_modules.inference_removal_module( $kw249$REMOVAL_ALL_STARTS_DURING, $list250 );
    preference_modules.inference_preference_module( $kw251$ALL_STARTS_DURING_POS, $list252 );
    utilities_macros.note_funcall_helper_function( $sym253$REMOVAL_ALL_STARTS_DURING_INVERSE_OUTPUT_GENERATE );
    inference_modules.inference_removal_module( $kw254$REMOVAL_ALL_STARTS_DURING_INVERSE, $list255 );
    preference_modules.inference_preference_module( $kw256$ALL_STARTS_DURING_INVERSE_POS, $list257 );
    inference_modules.inference_removal_module( $kw258$REMOVAL_NOT_STARTS_DURING, $list259 );
    inference_modules.register_solely_specific_removal_module_predicate( $const260$endsDuring );
    inference_modules.inference_removal_module( $kw261$REMOVAL_ENDS_DURING, $list262 );
    utilities_macros.note_funcall_helper_function( $sym263$REMOVAL_ALL_ENDS_DURING_OUTPUT_GENERATE );
    inference_modules.inference_removal_module( $kw264$REMOVAL_ALL_ENDS_DURING, $list265 );
    preference_modules.inference_preference_module( $kw266$ALL_ENDS_DURING_POS, $list267 );
    utilities_macros.note_funcall_helper_function( $sym268$REMOVAL_ALL_ENDS_DURING_INVERSE_OUTPUT_GENERATE );
    inference_modules.inference_removal_module( $kw269$REMOVAL_ALL_ENDS_DURING_INVERSE, $list270 );
    preference_modules.inference_preference_module( $kw271$ALL_ENDS_DURING_INVERSE_POS, $list272 );
    inference_modules.inference_removal_module( $kw273$REMOVAL_NOT_ENDS_DURING, $list274 );
    inference_modules.register_solely_specific_removal_module_predicate( $const275$startingDate );
    inference_modules.inference_removal_module( $kw276$REMOVAL_STARTING_DATE, $list277 );
    utilities_macros.note_funcall_helper_function( $sym278$REMOVAL_ALL_STARTING_DATE_INVERSE_OUTPUT_GENERATE );
    inference_modules.inference_removal_module( $kw279$REMOVAL_ALL_STARTING_DATE_INVERSE, $list280 );
    preference_modules.inference_preference_module( $kw281$ALL_STARTING_DATE_INVERSE_POS, $list282 );
    inference_modules.inference_removal_module( $kw283$REMOVAL_NOT_STARTING_DATE, $list284 );
    inference_modules.register_solely_specific_removal_module_predicate( $const285$endingDate );
    inference_modules.inference_removal_module( $kw286$REMOVAL_ENDING_DATE, $list287 );
    utilities_macros.note_funcall_helper_function( $sym288$REMOVAL_ALL_ENDING_DATE_INVERSE_OUTPUT_GENERATE );
    inference_modules.inference_removal_module( $kw289$REMOVAL_ALL_ENDING_DATE_INVERSE, $list290 );
    preference_modules.inference_preference_module( $kw291$ALL_ENDING_DATE_INVERSE_POS, $list292 );
    inference_modules.inference_removal_module( $kw293$REMOVAL_NOT_ENDING_DATE, $list294 );
    inference_modules.register_solely_specific_removal_module_predicate( $const295$birthDate );
    inference_modules.inference_removal_module( $kw296$REMOVAL_BIRTH_DATE, $list297 );
    utilities_macros.note_funcall_helper_function( $sym298$REMOVAL_ALL_BIRTH_DATE_INVERSE_OUTPUT_GENERATE );
    inference_modules.inference_removal_module( $kw299$REMOVAL_ALL_BIRTH_DATE_INVERSE, $list300 );
    preference_modules.inference_preference_module( $kw301$ALL_BIRTH_DATE_INVERSE_POS, $list302 );
    inference_modules.inference_removal_module( $kw303$REMOVAL_NOT_BIRTH_DATE, $list304 );
    inference_modules.register_solely_specific_removal_module_predicate( $const305$dateOfDeath );
    inference_modules.inference_removal_module( $kw306$REMOVAL_DATE_OF_DEATH, $list307 );
    utilities_macros.note_funcall_helper_function( $sym308$REMOVAL_ALL_DATE_OF_DEATH_INVERSE_OUTPUT_GENERATE );
    inference_modules.inference_removal_module( $kw309$REMOVAL_ALL_DATE_OF_DEATH_INVERSE, $list310 );
    preference_modules.inference_preference_module( $kw311$ALL_DATE_OF_DEATH_INVERSE_POS, $list312 );
    inference_modules.inference_removal_module( $kw313$REMOVAL_NOT_DATE_OF_DEATH, $list314 );
    inference_modules.register_solely_specific_removal_module_predicate( $const315$temporallyStartedBy );
    inference_modules.inference_removal_module( $kw316$REMOVAL_TEMPORALLY_STARTED_BY, $list317 );
    utilities_macros.note_funcall_helper_function( $sym318$REMOVAL_ALL_TEMPORALLY_STARTED_BY_OUTPUT_GENERATE );
    inference_modules.inference_removal_module( $kw319$REMOVAL_ALL_TEMPORALLY_STARTED_BY, $list320 );
    preference_modules.inference_preference_module( $kw321$ALL_TEMPORALLY_STARTED_BY_POS, $list322 );
    utilities_macros.note_funcall_helper_function( $sym323$REMOVAL_ALL_TEMPORALLY_STARTED_BY_INVERSE_OUTPUT_GENERATE );
    inference_modules.inference_removal_module( $kw324$REMOVAL_ALL_TEMPORALLY_STARTED_BY_INVERSE, $list325 );
    preference_modules.inference_preference_module( $kw326$ALL_TEMPORALLY_STARTED_BY_INVERSE_POS, $list327 );
    inference_modules.inference_removal_module( $kw328$REMOVAL_NOT_TEMPORALLY_STARTED_BY, $list329 );
    inference_modules.register_solely_specific_removal_module_predicate( $const330$temporallyFinishedBy );
    inference_modules.inference_removal_module( $kw331$REMOVAL_TEMPORALLY_FINISHED_BY, $list332 );
    utilities_macros.note_funcall_helper_function( $sym333$REMOVAL_ALL_TEMPORALLY_FINISHED_BY_OUTPUT_GENERATE );
    inference_modules.inference_removal_module( $kw334$REMOVAL_ALL_TEMPORALLY_FINISHED_BY, $list335 );
    preference_modules.inference_preference_module( $kw336$ALL_TEMPORALLY_FINISHED_BY_POS, $list337 );
    utilities_macros.note_funcall_helper_function( $sym338$REMOVAL_ALL_TEMPORALLY_FINISHED_BY_INVERSE_OUTPUT_GENERATE );
    inference_modules.inference_removal_module( $kw339$REMOVAL_ALL_TEMPORALLY_FINISHED_BY_INVERSE, $list340 );
    preference_modules.inference_preference_module( $kw341$ALL_TEMPORALLY_FINISHED_BY_INVERSE_POS, $list342 );
    inference_modules.inference_removal_module( $kw343$REMOVAL_NOT_TEMPORALLY_FINISHED_BY, $list344 );
    inference_modules.register_solely_specific_removal_module_predicate( $const345$overlapsStart );
    inference_modules.inference_removal_module( $kw346$REMOVAL_OVERLAPS_START, $list347 );
    utilities_macros.note_funcall_helper_function( $sym348$REMOVAL_ALL_OVERLAPS_START_OUTPUT_GENERATE );
    inference_modules.inference_removal_module( $kw349$REMOVAL_ALL_OVERLAPS_START, $list350 );
    preference_modules.inference_preference_module( $kw351$ALL_OVERLAPS_START_POS, $list352 );
    utilities_macros.note_funcall_helper_function( $sym353$REMOVAL_ALL_OVERLAPS_START_INVERSE_OUTPUT_GENERATE );
    inference_modules.inference_removal_module( $kw354$REMOVAL_ALL_OVERLAPS_START_INVERSE, $list355 );
    preference_modules.inference_preference_module( $kw356$ALL_OVERLAPS_START_INVERSE_POS, $list357 );
    inference_modules.inference_removal_module( $kw358$REMOVAL_NOT_OVERLAPS_START, $list359 );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_removal_modules_sbhl_time_preds_file();
  }

  @Override
  public void initializeVariables()
  {
    init_removal_modules_sbhl_time_preds_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_removal_modules_sbhl_time_preds_file();
  }
  static
  {
    me = new removal_modules_sbhl_time_preds();
    $sbhl_time_generic_modules$ = null;
    $default_temporal_relation_check_cost$ = null;
    $default_all_temporal_relation_cost$ = null;
    $default_all_temporal_relation_inverse_cost$ = null;
    $default_not_temporal_relation_check_cost$ = null;
    $list0 = ConsesLow.list( new SubLObject[] { makeKeyword( "REMOVAL-LOOKUP-POS" ), makeKeyword( "REMOVAL-LOOKUP-NEG" ), makeKeyword( "REMOVAL-GENLPREDS-LOOKUP-POS" ), makeKeyword( "REMOVAL-GENLPREDS-LOOKUP-NEG" ),
      makeKeyword( "REMOVAL-GENLPREDS-PRED-INDEX-POS" ), makeKeyword( "REMOVAL-GENLPREDS-PRED-INDEX-NEG" ), makeKeyword( "REMOVAL-GENLINVERSE-LOOKUP-POS" ), makeKeyword( "REMOVAL-GENLINVERSE-LOOKUP-NEG" ), makeKeyword(
          "REMOVAL-GENLINVERSE-PRED-INDEX-POS" ), makeKeyword( "REMOVAL-GENLINVERSE-PRED-INDEX-NEG" ), makeKeyword( "REMOVAL-NEGATIONPREDS-LOOKUP" ), makeKeyword( "REMOVAL-NEGATIONINVERSE-LOOKUP" ), makeKeyword(
              "REMOVAL-REFLEXIVE-MAP" ), makeKeyword( "REMOVAL-IRREFLEXIVE-ONE-ARG" ), makeKeyword( "REMOVAL-IRREFLEXIVE-MAP" ), makeKeyword( "REMOVAL-COMPLETELY-DECIDABLE-NEG" ), makeKeyword(
                  "REMOVAL-RELATION-ALL-INSTANCE-CHECK" ), makeKeyword( "REMOVAL-RELATION-ALL-INSTANCE-UNIFY" ), makeKeyword( "REMOVAL-RELATION-INSTANCE-ALL-CHECK" ), makeKeyword( "REMOVAL-RELATION-INSTANCE-ALL-UNIFY" ),
      makeKeyword( "REMOVAL-REFLEXIVE-BOTH" ), makeKeyword( "REMOVAL-REFLEXIVE-ONE-ARG" ), makeKeyword( "REMOVAL-FCP-WITH-GENL-PREDS-WRT-ARGS" )
    } );
    $kw1$SBHL_TIME_TOTAL_EXCLUSIVITY_POS = makeKeyword( "SBHL-TIME-TOTAL-EXCLUSIVITY-POS" );
    $kw2$SENSE = makeKeyword( "SENSE" );
    $kw3$POS = makeKeyword( "POS" );
    $kw4$ARITY = makeKeyword( "ARITY" );
    $kw5$REQUIRED_PATTERN = makeKeyword( "REQUIRED-PATTERN" );
    $list6 = ConsesLow.list( makeKeyword( "OR" ), ConsesLow.list( ConsesLow.list( makeKeyword( "TEST" ), makeSymbol( "SBHL-TIME-PREDICATE-P" ) ), ConsesLow.list( makeKeyword( "TEST" ), makeSymbol( "DATE-INTERVAL-P" ) ),
        ConsesLow.list( makeKeyword( "TEST" ), makeSymbol( "DATE-INTERVAL-P" ) ) ), ConsesLow.list( ConsesLow.list( makeKeyword( "TEST" ), makeSymbol( "SBHL-TIME-PREDICATE-WITH-NO-SPEC-PRED-OR-INVERSE?" ) ), ConsesLow
            .list( makeKeyword( "TEST" ), makeSymbol( "SBHL-TIME-INFERENCE-ARG-P" ) ), ConsesLow.list( makeKeyword( "TEST" ), makeSymbol( "SBHL-TIME-INFERENCE-ARG-P" ) ) ) );
    $kw7$EXCLUSIVE = makeKeyword( "EXCLUSIVE" );
    $sym8$TRUE = makeSymbol( "TRUE" );
    $kw9$SUPPLANTS = makeKeyword( "SUPPLANTS" );
    $list10 = ConsesLow.list( makeKeyword( "REQUIRED" ), makeSymbol( "FALSE" ), makeKeyword( "DOCUMENTATION" ), makeString( "An exclusivity module that identifies when SBHL time will totally handle a problem." ) );
    $list11 = ConsesLow.list( new SubLObject[] { constant_handles.reader_make_constant_shell( makeString( "startsAfterStartingOf" ) ), constant_handles.reader_make_constant_shell( makeString( "startsAfterEndingOf" ) ),
      constant_handles.reader_make_constant_shell( makeString( "endsAfterStartingOf" ) ), constant_handles.reader_make_constant_shell( makeString( "endsAfterEndingOf" ) ), constant_handles.reader_make_constant_shell(
          makeString( "temporallySubsumes" ) ), constant_handles.reader_make_constant_shell( makeString( "dateOfEvent" ) ), constant_handles.reader_make_constant_shell( makeString( "cotemporal" ) ), constant_handles
              .reader_make_constant_shell( makeString( "temporallyIntersects" ) ), constant_handles.reader_make_constant_shell( makeString( "temporallyDisjoint" ) ), constant_handles.reader_make_constant_shell(
                  makeString( "temporalBoundsContain" ) ), constant_handles.reader_make_constant_shell( makeString( "temporalBoundsSubsume" ) ), constant_handles.reader_make_constant_shell( makeString(
                      "temporalBoundsIdentical" ) ), constant_handles.reader_make_constant_shell( makeString( "temporalBoundsIntersect" ) ), constant_handles.reader_make_constant_shell( makeString(
                          "temporallyCooriginating" ) ), constant_handles.reader_make_constant_shell( makeString( "temporallyCoterminal" ) ), constant_handles.reader_make_constant_shell( makeString(
                              "contiguousAfter" ) ), constant_handles.reader_make_constant_shell( makeString( "startsDuring" ) ), constant_handles.reader_make_constant_shell( makeString( "endsDuring" ) ),
      constant_handles.reader_make_constant_shell( makeString( "startingDate" ) ), constant_handles.reader_make_constant_shell( makeString( "endingDate" ) ), constant_handles.reader_make_constant_shell( makeString(
          "birthDate" ) ), constant_handles.reader_make_constant_shell( makeString( "dateOfDeath" ) ), constant_handles.reader_make_constant_shell( makeString( "temporallyStartedBy" ) ), constant_handles
              .reader_make_constant_shell( makeString( "temporallyFinishedBy" ) ), constant_handles.reader_make_constant_shell( makeString( "overlapsStart" ) )
    } );
    $int12$200 = makeInteger( 200 );
    $const13$startsAfterStartingOf = constant_handles.reader_make_constant_shell( makeString( "startsAfterStartingOf" ) );
    $kw14$REMOVAL_STARTS_AFTER_STARTING_OF = makeKeyword( "REMOVAL-STARTS-AFTER-STARTING-OF" );
    $list15 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "startsAfterStartingOf" ) ),
      makeKeyword( "CHECK" ), T, makeKeyword( "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "startsAfterStartingOf" ) ), ConsesLow.list( makeKeyword( "TEST" ), makeSymbol(
          "SBHL-TIME-INFERENCE-ARG-P" ) ), ConsesLow.list( makeKeyword( "TEST" ), makeSymbol( "SBHL-TIME-INFERENCE-ARG-P" ) ) ), makeKeyword( "COST-EXPRESSION" ), makeSymbol( "*DEFAULT-TEMPORAL-RELATION-CHECK-COST*" ),
      makeKeyword( "INPUT-EXTRACT-PATTERN" ), ConsesLow.list( makeKeyword( "TEMPLATE" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "startsAfterStartingOf" ) ), ConsesLow.list( makeKeyword(
          "BIND" ), makeSymbol( "TEMPORAL-THING1" ) ), ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "TEMPORAL-THING2" ) ) ), ConsesLow.list( ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol(
              "TEMPORAL-THING1" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "TEMPORAL-THING2" ) ) ) ), makeKeyword( "INPUT-ENCODE-PATTERN" ), ConsesLow.list( makeKeyword( "TUPLE" ), ConsesLow.list(
                  makeSymbol( "TEMPORAL-THING1" ), makeSymbol( "TEMPORAL-THING2" ) ), ConsesLow.list( ConsesLow.list( makeKeyword( "CALL" ), makeSymbol( "POSSIBLY-BIND-TEMPORAL-INDEXICAL-IN-OBJECT" ), ConsesLow.list(
                      makeKeyword( "VALUE" ), makeSymbol( "TEMPORAL-THING1" ) ) ), ConsesLow.list( makeKeyword( "CALL" ), makeSymbol( "POSSIBLY-BIND-TEMPORAL-INDEXICAL-IN-OBJECT" ), ConsesLow.list( makeKeyword(
                          "VALUE" ), makeSymbol( "TEMPORAL-THING2" ) ) ) ) ), makeKeyword( "OUTPUT-CHECK-PATTERN" ), ConsesLow.list( makeKeyword( "TUPLE" ), ConsesLow.list( makeSymbol( "TEMPORAL-THING1" ), makeSymbol(
                              "TEMPORAL-THING2" ) ), ConsesLow.list( makeKeyword( "CALL" ), makeSymbol( "STARTS-AFTER-STARTING-OF?" ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "TEMPORAL-THING1" ) ), ConsesLow
                                  .list( makeKeyword( "VALUE" ), makeSymbol( "TEMPORAL-THING2" ) ) ) ), makeKeyword( "SUPPORT-MODULE" ), makeKeyword( "TIME" ), makeKeyword( "DOCUMENTATION" ), makeString(
                                      "(#$startsAfterStartingOf <TemporalThing> <TemporalThing>)" )
    } );
    $sym16$REMOVAL_ALL_STARTS_AFTER_STARTING_OF_OUTPUT_GENERATE = makeSymbol( "REMOVAL-ALL-STARTS-AFTER-STARTING-OF-OUTPUT-GENERATE" );
    $kw17$REMOVAL_ALL_STARTS_AFTER_STARTING_OF = makeKeyword( "REMOVAL-ALL-STARTS-AFTER-STARTING-OF" );
    $list18 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "startsAfterStartingOf" ) ),
      makeKeyword( "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "startsAfterStartingOf" ) ), ConsesLow.list( makeKeyword( "TEST" ), makeSymbol(
          "SBHL-TIME-INFERENCE-ARG-P" ) ), makeKeyword( "NOT-FULLY-BOUND" ) ), makeKeyword( "COST-EXPRESSION" ), makeSymbol( "*DEFAULT-ALL-TEMPORAL-RELATION-COST*" ), makeKeyword( "COMPLETENESS" ), makeKeyword(
              "GROSSLY-INCOMPLETE" ), makeKeyword( "INPUT-EXTRACT-PATTERN" ), ConsesLow.list( makeKeyword( "TEMPLATE" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
                  "startsAfterStartingOf" ) ), ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "TEMPORAL-THING" ) ), makeKeyword( "ANYTHING" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol(
                      "TEMPORAL-THING" ) ) ), makeKeyword( "INPUT-ENCODE-PATTERN" ), ConsesLow.list( makeKeyword( "CALL" ), makeSymbol( "POSSIBLY-BIND-TEMPORAL-INDEXICAL-IN-OBJECT" ), makeKeyword( "INPUT" ) ),
      makeKeyword( "OUTPUT-GENERATE-PATTERN" ), ConsesLow.list( makeKeyword( "CALL" ), makeSymbol( "REMOVAL-ALL-STARTS-AFTER-STARTING-OF-OUTPUT-GENERATE" ), makeKeyword( "INPUT" ) ), makeKeyword(
          "OUTPUT-CONSTRUCT-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "startsAfterStartingOf" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "TEMPORAL-THING" ) ),
              makeKeyword( "INPUT" ) ), makeKeyword( "SUPPORT-MODULE" ), makeKeyword( "TIME" ), makeKeyword( "DOCUMENTATION" ), makeString( "(#$startsAfterStartingOf <TemporalThing> <not-fully-bound>)" )
    } );
    $kw19$ALL_STARTS_AFTER_STARTING_OF_POS = makeKeyword( "ALL-STARTS-AFTER-STARTING-OF-POS" );
    $list20 = ConsesLow.list( makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "startsAfterStartingOf" ) ), makeKeyword(
        "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "startsAfterStartingOf" ) ), makeKeyword( "ANYTHING" ), makeKeyword( "NOT-FULLY-BOUND" ) ), makeKeyword(
            "PREFERENCE-LEVEL" ), makeKeyword( "GROSSLY-DISPREFERRED" ) );
    $sym21$REMOVAL_ALL_STARTS_AFTER_STARTING_OF_INVERSE_OUTPUT_GENERATE = makeSymbol( "REMOVAL-ALL-STARTS-AFTER-STARTING-OF-INVERSE-OUTPUT-GENERATE" );
    $kw22$REMOVAL_ALL_STARTS_AFTER_STARTING_OF_INVERSE = makeKeyword( "REMOVAL-ALL-STARTS-AFTER-STARTING-OF-INVERSE" );
    $list23 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "startsAfterStartingOf" ) ),
      makeKeyword( "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "startsAfterStartingOf" ) ), makeKeyword( "NOT-FULLY-BOUND" ), ConsesLow.list( makeKeyword( "TEST" ),
          makeSymbol( "SBHL-TIME-INFERENCE-ARG-P" ) ) ), makeKeyword( "COST-EXPRESSION" ), makeSymbol( "*DEFAULT-ALL-TEMPORAL-RELATION-INVERSE-COST*" ), makeKeyword( "COMPLETENESS" ), makeKeyword( "GROSSLY-INCOMPLETE" ),
      makeKeyword( "INPUT-EXTRACT-PATTERN" ), ConsesLow.list( makeKeyword( "TEMPLATE" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "startsAfterStartingOf" ) ), makeKeyword( "ANYTHING" ),
          ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "TEMPORAL-THING" ) ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "TEMPORAL-THING" ) ) ), makeKeyword( "INPUT-ENCODE-PATTERN" ), ConsesLow.list(
              makeKeyword( "CALL" ), makeSymbol( "POSSIBLY-BIND-TEMPORAL-INDEXICAL-IN-OBJECT" ), makeKeyword( "INPUT" ) ), makeKeyword( "OUTPUT-GENERATE-PATTERN" ), ConsesLow.list( makeKeyword( "CALL" ), makeSymbol(
                  "REMOVAL-ALL-STARTS-AFTER-STARTING-OF-INVERSE-OUTPUT-GENERATE" ), makeKeyword( "INPUT" ) ), makeKeyword( "OUTPUT-CONSTRUCT-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell(
                      makeString( "startsAfterStartingOf" ) ), makeKeyword( "INPUT" ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "TEMPORAL-THING" ) ) ), makeKeyword( "SUPPORT-MODULE" ), makeKeyword( "TIME" ),
      makeKeyword( "DOCUMENTATION" ), makeString( "(#$startsAfterStartingOf <not-fully-bound> <TemporalThing>)" )
    } );
    $kw24$ALL_STARTS_AFTER_STARTING_OF_INVERSE_POS = makeKeyword( "ALL-STARTS-AFTER-STARTING-OF-INVERSE-POS" );
    $list25 = ConsesLow.list( makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "startsAfterStartingOf" ) ), makeKeyword(
        "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "startsAfterStartingOf" ) ), makeKeyword( "NOT-FULLY-BOUND" ), makeKeyword( "ANYTHING" ) ), makeKeyword(
            "PREFERENCE-LEVEL" ), makeKeyword( "GROSSLY-DISPREFERRED" ) );
    $kw26$MINIMIZE = makeKeyword( "MINIMIZE" );
    $kw27$TIME = makeKeyword( "TIME" );
    $kw28$REMOVAL_NOT_STARTS_AFTER_STARTING_OF = makeKeyword( "REMOVAL-NOT-STARTS-AFTER-STARTING-OF" );
    $list29 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "NEG" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "startsAfterStartingOf" ) ),
      makeKeyword( "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "startsAfterStartingOf" ) ), ConsesLow.list( makeKeyword( "TEST" ), makeSymbol(
          "SBHL-TIME-INFERENCE-ARG-P" ) ), ConsesLow.list( makeKeyword( "TEST" ), makeSymbol( "SBHL-TIME-INFERENCE-ARG-P" ) ) ), makeKeyword( "COST-EXPRESSION" ), makeSymbol(
              "*DEFAULT-NOT-TEMPORAL-RELATION-CHECK-COST*" ), makeKeyword( "EXPAND" ), makeSymbol( "REMOVAL-NOT-STARTS-AFTER-STARTING-OF-EXPAND" ), makeKeyword( "DOCUMENTATION" ), makeString(
                  "(#$not (#$startsAfterStartingOf <TemporalThing> <TemporalThing>))" )
    } );
    $const30$startsAfterEndingOf = constant_handles.reader_make_constant_shell( makeString( "startsAfterEndingOf" ) );
    $kw31$REMOVAL_STARTS_AFTER_ENDING_OF = makeKeyword( "REMOVAL-STARTS-AFTER-ENDING-OF" );
    $list32 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "startsAfterEndingOf" ) ), makeKeyword(
        "CHECK" ), T, makeKeyword( "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "startsAfterEndingOf" ) ), ConsesLow.list( makeKeyword( "TEST" ), makeSymbol(
            "SBHL-TIME-INFERENCE-ARG-P" ) ), ConsesLow.list( makeKeyword( "TEST" ), makeSymbol( "SBHL-TIME-INFERENCE-ARG-P" ) ) ), makeKeyword( "COST-EXPRESSION" ), makeSymbol( "*DEFAULT-TEMPORAL-RELATION-CHECK-COST*" ),
      makeKeyword( "INPUT-EXTRACT-PATTERN" ), ConsesLow.list( makeKeyword( "TEMPLATE" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "startsAfterEndingOf" ) ), ConsesLow.list( makeKeyword(
          "BIND" ), makeSymbol( "TEMPORAL-THING1" ) ), ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "TEMPORAL-THING2" ) ) ), ConsesLow.list( ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol(
              "TEMPORAL-THING1" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "TEMPORAL-THING2" ) ) ) ), makeKeyword( "INPUT-ENCODE-PATTERN" ), ConsesLow.list( makeKeyword( "TUPLE" ), ConsesLow.list(
                  makeSymbol( "TEMPORAL-THING1" ), makeSymbol( "TEMPORAL-THING2" ) ), ConsesLow.list( ConsesLow.list( makeKeyword( "CALL" ), makeSymbol( "POSSIBLY-BIND-TEMPORAL-INDEXICAL-IN-OBJECT" ), ConsesLow.list(
                      makeKeyword( "VALUE" ), makeSymbol( "TEMPORAL-THING1" ) ) ), ConsesLow.list( makeKeyword( "CALL" ), makeSymbol( "POSSIBLY-BIND-TEMPORAL-INDEXICAL-IN-OBJECT" ), ConsesLow.list( makeKeyword(
                          "VALUE" ), makeSymbol( "TEMPORAL-THING2" ) ) ) ) ), makeKeyword( "OUTPUT-CHECK-PATTERN" ), ConsesLow.list( makeKeyword( "TUPLE" ), ConsesLow.list( makeSymbol( "TEMPORAL-THING1" ), makeSymbol(
                              "TEMPORAL-THING2" ) ), ConsesLow.list( makeKeyword( "CALL" ), makeSymbol( "STARTS-AFTER-ENDING-OF?" ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "TEMPORAL-THING1" ) ), ConsesLow
                                  .list( makeKeyword( "VALUE" ), makeSymbol( "TEMPORAL-THING2" ) ) ) ), makeKeyword( "SUPPORT-MODULE" ), makeKeyword( "TIME" ), makeKeyword( "DOCUMENTATION" ), makeString(
                                      "(#$startsAfterEndingOf <TemporalThing> <TemporalThing>)" )
    } );
    $sym33$REMOVAL_ALL_STARTS_AFTER_ENDING_OF_OUTPUT_GENERATE = makeSymbol( "REMOVAL-ALL-STARTS-AFTER-ENDING-OF-OUTPUT-GENERATE" );
    $kw34$REMOVAL_ALL_STARTS_AFTER_ENDING_OF = makeKeyword( "REMOVAL-ALL-STARTS-AFTER-ENDING-OF" );
    $list35 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "startsAfterEndingOf" ) ), makeKeyword(
        "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "startsAfterEndingOf" ) ), ConsesLow.list( makeKeyword( "TEST" ), makeSymbol( "SBHL-TIME-INFERENCE-ARG-P" ) ),
            makeKeyword( "NOT-FULLY-BOUND" ) ), makeKeyword( "COST-EXPRESSION" ), makeSymbol( "*DEFAULT-ALL-TEMPORAL-RELATION-COST*" ), makeKeyword( "COMPLETENESS" ), makeKeyword( "GROSSLY-INCOMPLETE" ), makeKeyword(
                "INPUT-EXTRACT-PATTERN" ), ConsesLow.list( makeKeyword( "TEMPLATE" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "startsAfterEndingOf" ) ), ConsesLow.list( makeKeyword(
                    "BIND" ), makeSymbol( "TEMPORAL-THING" ) ), makeKeyword( "ANYTHING" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "TEMPORAL-THING" ) ) ), makeKeyword( "INPUT-ENCODE-PATTERN" ), ConsesLow
                        .list( makeKeyword( "CALL" ), makeSymbol( "POSSIBLY-BIND-TEMPORAL-INDEXICAL-IN-OBJECT" ), makeKeyword( "INPUT" ) ), makeKeyword( "OUTPUT-GENERATE-PATTERN" ), ConsesLow.list( makeKeyword( "CALL" ),
                            makeSymbol( "REMOVAL-ALL-STARTS-AFTER-ENDING-OF-OUTPUT-GENERATE" ), makeKeyword( "INPUT" ) ), makeKeyword( "OUTPUT-CONSTRUCT-PATTERN" ), ConsesLow.list( constant_handles
                                .reader_make_constant_shell( makeString( "startsAfterEndingOf" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "TEMPORAL-THING" ) ), makeKeyword( "INPUT" ) ), makeKeyword(
                                    "SUPPORT-MODULE" ), makeKeyword( "TIME" ), makeKeyword( "DOCUMENTATION" ), makeString( "(#$startsAfterEndingOf <TemporalThing> <not-fully-bound>)" )
    } );
    $kw36$ALL_STARTS_AFTER_ENDING_OF_POS = makeKeyword( "ALL-STARTS-AFTER-ENDING-OF-POS" );
    $list37 = ConsesLow.list( makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "startsAfterEndingOf" ) ), makeKeyword(
        "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "startsAfterEndingOf" ) ), makeKeyword( "ANYTHING" ), makeKeyword( "NOT-FULLY-BOUND" ) ), makeKeyword(
            "PREFERENCE-LEVEL" ), makeKeyword( "GROSSLY-DISPREFERRED" ) );
    $sym38$REMOVAL_ALL_STARTS_AFTER_ENDING_OF_INVERSE_OUTPUT_GENERATE = makeSymbol( "REMOVAL-ALL-STARTS-AFTER-ENDING-OF-INVERSE-OUTPUT-GENERATE" );
    $kw39$REMOVAL_ALL_STARTS_AFTER_ENDING_OF_INVERSE = makeKeyword( "REMOVAL-ALL-STARTS-AFTER-ENDING-OF-INVERSE" );
    $list40 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "startsAfterEndingOf" ) ), makeKeyword(
        "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "startsAfterEndingOf" ) ), makeKeyword( "NOT-FULLY-BOUND" ), ConsesLow.list( makeKeyword( "TEST" ), makeSymbol(
            "SBHL-TIME-INFERENCE-ARG-P" ) ) ), makeKeyword( "COST-EXPRESSION" ), makeSymbol( "*DEFAULT-ALL-TEMPORAL-RELATION-INVERSE-COST*" ), makeKeyword( "COMPLETENESS" ), makeKeyword( "GROSSLY-INCOMPLETE" ),
      makeKeyword( "INPUT-EXTRACT-PATTERN" ), ConsesLow.list( makeKeyword( "TEMPLATE" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "startsAfterEndingOf" ) ), makeKeyword( "ANYTHING" ),
          ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "TEMPORAL-THING" ) ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "TEMPORAL-THING" ) ) ), makeKeyword( "INPUT-ENCODE-PATTERN" ), ConsesLow.list(
              makeKeyword( "CALL" ), makeSymbol( "POSSIBLY-BIND-TEMPORAL-INDEXICAL-IN-OBJECT" ), makeKeyword( "INPUT" ) ), makeKeyword( "OUTPUT-GENERATE-PATTERN" ), ConsesLow.list( makeKeyword( "CALL" ), makeSymbol(
                  "REMOVAL-ALL-STARTS-AFTER-ENDING-OF-INVERSE-OUTPUT-GENERATE" ), makeKeyword( "INPUT" ) ), makeKeyword( "OUTPUT-CONSTRUCT-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell(
                      makeString( "startsAfterEndingOf" ) ), makeKeyword( "INPUT" ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "TEMPORAL-THING" ) ) ), makeKeyword( "SUPPORT-MODULE" ), makeKeyword( "TIME" ),
      makeKeyword( "DOCUMENTATION" ), makeString( "(#$startsAfterEndingOf <not-fully-bound> <TemporalThing>)" )
    } );
    $kw41$ALL_STARTS_AFTER_ENDING_OF_INVERSE_POS = makeKeyword( "ALL-STARTS-AFTER-ENDING-OF-INVERSE-POS" );
    $list42 = ConsesLow.list( makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "startsAfterEndingOf" ) ), makeKeyword(
        "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "startsAfterEndingOf" ) ), makeKeyword( "NOT-FULLY-BOUND" ), makeKeyword( "ANYTHING" ) ), makeKeyword(
            "PREFERENCE-LEVEL" ), makeKeyword( "GROSSLY-DISPREFERRED" ) );
    $kw43$REMOVAL_NOT_STARTS_AFTER_ENDING_OF = makeKeyword( "REMOVAL-NOT-STARTS-AFTER-ENDING-OF" );
    $list44 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "NEG" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "startsAfterEndingOf" ) ), makeKeyword(
        "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "startsAfterEndingOf" ) ), ConsesLow.list( makeKeyword( "TEST" ), makeSymbol( "SBHL-TIME-INFERENCE-ARG-P" ) ),
            ConsesLow.list( makeKeyword( "TEST" ), makeSymbol( "SBHL-TIME-INFERENCE-ARG-P" ) ) ), makeKeyword( "COST-EXPRESSION" ), makeSymbol( "*DEFAULT-NOT-TEMPORAL-RELATION-CHECK-COST*" ), makeKeyword( "EXPAND" ),
      makeSymbol( "REMOVAL-NOT-STARTS-AFTER-ENDING-OF-EXPAND" ), makeKeyword( "DOCUMENTATION" ), makeString( "(#$not (#$startsAfterEndingOf <TemporalThing> <TemporalThing>))" )
    } );
    $const45$endsAfterStartingOf = constant_handles.reader_make_constant_shell( makeString( "endsAfterStartingOf" ) );
    $kw46$REMOVAL_ENDS_AFTER_STARTING_OF = makeKeyword( "REMOVAL-ENDS-AFTER-STARTING-OF" );
    $list47 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "endsAfterStartingOf" ) ), makeKeyword(
        "CHECK" ), T, makeKeyword( "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "endsAfterStartingOf" ) ), ConsesLow.list( makeKeyword( "TEST" ), makeSymbol(
            "SBHL-TIME-INFERENCE-ARG-P" ) ), ConsesLow.list( makeKeyword( "TEST" ), makeSymbol( "SBHL-TIME-INFERENCE-ARG-P" ) ) ), makeKeyword( "COST-EXPRESSION" ), makeSymbol( "*DEFAULT-TEMPORAL-RELATION-CHECK-COST*" ),
      makeKeyword( "INPUT-EXTRACT-PATTERN" ), ConsesLow.list( makeKeyword( "TEMPLATE" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "endsAfterStartingOf" ) ), ConsesLow.list( makeKeyword(
          "BIND" ), makeSymbol( "TEMPORAL-THING1" ) ), ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "TEMPORAL-THING2" ) ) ), ConsesLow.list( ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol(
              "TEMPORAL-THING1" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "TEMPORAL-THING2" ) ) ) ), makeKeyword( "INPUT-ENCODE-PATTERN" ), ConsesLow.list( makeKeyword( "TUPLE" ), ConsesLow.list(
                  makeSymbol( "TEMPORAL-THING1" ), makeSymbol( "TEMPORAL-THING2" ) ), ConsesLow.list( ConsesLow.list( makeKeyword( "CALL" ), makeSymbol( "POSSIBLY-BIND-TEMPORAL-INDEXICAL-IN-OBJECT" ), ConsesLow.list(
                      makeKeyword( "VALUE" ), makeSymbol( "TEMPORAL-THING1" ) ) ), ConsesLow.list( makeKeyword( "CALL" ), makeSymbol( "POSSIBLY-BIND-TEMPORAL-INDEXICAL-IN-OBJECT" ), ConsesLow.list( makeKeyword(
                          "VALUE" ), makeSymbol( "TEMPORAL-THING2" ) ) ) ) ), makeKeyword( "OUTPUT-CHECK-PATTERN" ), ConsesLow.list( makeKeyword( "TUPLE" ), ConsesLow.list( makeSymbol( "TEMPORAL-THING1" ), makeSymbol(
                              "TEMPORAL-THING2" ) ), ConsesLow.list( makeKeyword( "CALL" ), makeSymbol( "ENDS-AFTER-STARTING-OF?" ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "TEMPORAL-THING1" ) ), ConsesLow
                                  .list( makeKeyword( "VALUE" ), makeSymbol( "TEMPORAL-THING2" ) ) ) ), makeKeyword( "SUPPORT-MODULE" ), makeKeyword( "TIME" ), makeKeyword( "DOCUMENTATION" ), makeString(
                                      "(#$endsAfterStartingOf <TemporalThing> <TemporalThing>)" )
    } );
    $sym48$REMOVAL_ALL_ENDS_AFTER_STARTING_OF_OUTPUT_GENERATE = makeSymbol( "REMOVAL-ALL-ENDS-AFTER-STARTING-OF-OUTPUT-GENERATE" );
    $kw49$REMOVAL_ALL_ENDS_AFTER_STARTING_OF = makeKeyword( "REMOVAL-ALL-ENDS-AFTER-STARTING-OF" );
    $list50 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "endsAfterStartingOf" ) ), makeKeyword(
        "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "endsAfterStartingOf" ) ), ConsesLow.list( makeKeyword( "TEST" ), makeSymbol( "SBHL-TIME-INFERENCE-ARG-P" ) ),
            makeKeyword( "NOT-FULLY-BOUND" ) ), makeKeyword( "COST-EXPRESSION" ), makeSymbol( "*DEFAULT-ALL-TEMPORAL-RELATION-COST*" ), makeKeyword( "COMPLETENESS" ), makeKeyword( "GROSSLY-INCOMPLETE" ), makeKeyword(
                "INPUT-EXTRACT-PATTERN" ), ConsesLow.list( makeKeyword( "TEMPLATE" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "endsAfterStartingOf" ) ), ConsesLow.list( makeKeyword(
                    "BIND" ), makeSymbol( "TEMPORAL-THING" ) ), makeKeyword( "ANYTHING" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "TEMPORAL-THING" ) ) ), makeKeyword( "INPUT-ENCODE-PATTERN" ), ConsesLow
                        .list( makeKeyword( "CALL" ), makeSymbol( "POSSIBLY-BIND-TEMPORAL-INDEXICAL-IN-OBJECT" ), makeKeyword( "INPUT" ) ), makeKeyword( "OUTPUT-GENERATE-PATTERN" ), ConsesLow.list( makeKeyword( "CALL" ),
                            makeSymbol( "REMOVAL-ALL-ENDS-AFTER-STARTING-OF-OUTPUT-GENERATE" ), makeKeyword( "INPUT" ) ), makeKeyword( "OUTPUT-CONSTRUCT-PATTERN" ), ConsesLow.list( constant_handles
                                .reader_make_constant_shell( makeString( "endsAfterStartingOf" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "TEMPORAL-THING1" ) ), makeKeyword( "INPUT" ) ), makeKeyword(
                                    "SUPPORT-MODULE" ), makeKeyword( "TIME" ), makeKeyword( "DOCUMENTATION" ), makeString( "(#$endsAfterStartingOf <TemporalThing> <not-fully-bound>)" )
    } );
    $kw51$ALL_ENDS_AFTER_STARTING_OF_POS = makeKeyword( "ALL-ENDS-AFTER-STARTING-OF-POS" );
    $list52 = ConsesLow.list( makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "endsAfterStartingOf" ) ), makeKeyword(
        "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "endsAfterStartingOf" ) ), makeKeyword( "ANYTHING" ), makeKeyword( "NOT-FULLY-BOUND" ) ), makeKeyword(
            "PREFERENCE-LEVEL" ), makeKeyword( "GROSSLY-DISPREFERRED" ) );
    $sym53$REMOVAL_ALL_ENDS_AFTER_STARTING_OF_INVERSE_OUTPUT_GENERATE = makeSymbol( "REMOVAL-ALL-ENDS-AFTER-STARTING-OF-INVERSE-OUTPUT-GENERATE" );
    $kw54$REMOVAL_ALL_ENDS_AFTER_STARTING_OF_INVERSE = makeKeyword( "REMOVAL-ALL-ENDS-AFTER-STARTING-OF-INVERSE" );
    $list55 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "endsAfterStartingOf" ) ), makeKeyword(
        "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "endsAfterStartingOf" ) ), makeKeyword( "NOT-FULLY-BOUND" ), ConsesLow.list( makeKeyword( "TEST" ), makeSymbol(
            "SBHL-TIME-INFERENCE-ARG-P" ) ) ), makeKeyword( "COST-EXPRESSION" ), makeSymbol( "*DEFAULT-ALL-TEMPORAL-RELATION-INVERSE-COST*" ), makeKeyword( "COMPLETENESS" ), makeKeyword( "GROSSLY-INCOMPLETE" ),
      makeKeyword( "INPUT-EXTRACT-PATTERN" ), ConsesLow.list( makeKeyword( "TEMPLATE" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "endsAfterStartingOf" ) ), makeKeyword( "ANYTHING" ),
          ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "TEMPORAL-THING" ) ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "TEMPORAL-THING" ) ) ), makeKeyword( "INPUT-ENCODE-PATTERN" ), ConsesLow.list(
              makeKeyword( "CALL" ), makeSymbol( "POSSIBLY-BIND-TEMPORAL-INDEXICAL-IN-OBJECT" ), makeKeyword( "INPUT" ) ), makeKeyword( "OUTPUT-GENERATE-PATTERN" ), ConsesLow.list( makeKeyword( "CALL" ), makeSymbol(
                  "REMOVAL-ALL-ENDS-AFTER-STARTING-OF-INVERSE-OUTPUT-GENERATE" ), makeKeyword( "INPUT" ) ), makeKeyword( "OUTPUT-CONSTRUCT-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell(
                      makeString( "endsAfterStartingOf" ) ), makeKeyword( "INPUT" ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "TEMPORAL-THING" ) ) ), makeKeyword( "SUPPORT-MODULE" ), makeKeyword( "TIME" ),
      makeKeyword( "DOCUMENTATION" ), makeString( "(#$endsAfterStartingOf <not-fully-bound> <TemporalThing>)" )
    } );
    $kw56$ALL_ENDS_AFTER_STARTING_OF_INVERSE_POS = makeKeyword( "ALL-ENDS-AFTER-STARTING-OF-INVERSE-POS" );
    $list57 = ConsesLow.list( makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "endsAfterStartingOf" ) ), makeKeyword(
        "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "endsAfterStartingOf" ) ), makeKeyword( "NOT-FULLY-BOUND" ), makeKeyword( "ANYTHING" ) ), makeKeyword(
            "PREFERENCE-LEVEL" ), makeKeyword( "GROSSLY-DISPREFERRED" ) );
    $kw58$REMOVAL_NOT_ENDS_AFTER_STARTING_OF = makeKeyword( "REMOVAL-NOT-ENDS-AFTER-STARTING-OF" );
    $list59 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "NEG" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "endsAfterStartingOf" ) ), makeKeyword(
        "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "endsAfterStartingOf" ) ), ConsesLow.list( makeKeyword( "TEST" ), makeSymbol( "SBHL-TIME-INFERENCE-ARG-P" ) ),
            ConsesLow.list( makeKeyword( "TEST" ), makeSymbol( "SBHL-TIME-INFERENCE-ARG-P" ) ) ), makeKeyword( "COST-EXPRESSION" ), makeSymbol( "*DEFAULT-NOT-TEMPORAL-RELATION-CHECK-COST*" ), makeKeyword( "EXPAND" ),
      makeSymbol( "REMOVAL-NOT-ENDS-AFTER-STARTING-OF-EXPAND" ), makeKeyword( "DOCUMENTATION" ), makeString( "(#$not (#$endsAfterStartingOf <TemporalThing> <TemporalThing>))" )
    } );
    $const60$endsAfterEndingOf = constant_handles.reader_make_constant_shell( makeString( "endsAfterEndingOf" ) );
    $kw61$REMOVAL_ENDS_AFTER_ENDING_OF = makeKeyword( "REMOVAL-ENDS-AFTER-ENDING-OF" );
    $list62 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "endsAfterEndingOf" ) ), makeKeyword(
        "CHECK" ), T, makeKeyword( "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "endsAfterEndingOf" ) ), ConsesLow.list( makeKeyword( "TEST" ), makeSymbol(
            "SBHL-TIME-INFERENCE-ARG-P" ) ), ConsesLow.list( makeKeyword( "TEST" ), makeSymbol( "SBHL-TIME-INFERENCE-ARG-P" ) ) ), makeKeyword( "COST-EXPRESSION" ), makeSymbol( "*DEFAULT-TEMPORAL-RELATION-CHECK-COST*" ),
      makeKeyword( "INPUT-EXTRACT-PATTERN" ), ConsesLow.list( makeKeyword( "TEMPLATE" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "endsAfterEndingOf" ) ), ConsesLow.list( makeKeyword(
          "BIND" ), makeSymbol( "TEMPORAL-THING1" ) ), ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "TEMPORAL-THING2" ) ) ), ConsesLow.list( ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol(
              "TEMPORAL-THING1" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "TEMPORAL-THING2" ) ) ) ), makeKeyword( "INPUT-ENCODE-PATTERN" ), ConsesLow.list( makeKeyword( "TUPLE" ), ConsesLow.list(
                  makeSymbol( "TEMPORAL-THING1" ), makeSymbol( "TEMPORAL-THING2" ) ), ConsesLow.list( ConsesLow.list( makeKeyword( "CALL" ), makeSymbol( "POSSIBLY-BIND-TEMPORAL-INDEXICAL-IN-OBJECT" ), ConsesLow.list(
                      makeKeyword( "VALUE" ), makeSymbol( "TEMPORAL-THING1" ) ) ), ConsesLow.list( makeKeyword( "CALL" ), makeSymbol( "POSSIBLY-BIND-TEMPORAL-INDEXICAL-IN-OBJECT" ), ConsesLow.list( makeKeyword(
                          "VALUE" ), makeSymbol( "TEMPORAL-THING2" ) ) ) ) ), makeKeyword( "OUTPUT-CHECK-PATTERN" ), ConsesLow.list( makeKeyword( "TUPLE" ), ConsesLow.list( makeSymbol( "TEMPORAL-THING1" ), makeSymbol(
                              "TEMPORAL-THING2" ) ), ConsesLow.list( makeKeyword( "CALL" ), makeSymbol( "ENDS-AFTER-ENDING-OF?" ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "TEMPORAL-THING1" ) ), ConsesLow
                                  .list( makeKeyword( "VALUE" ), makeSymbol( "TEMPORAL-THING2" ) ) ) ), makeKeyword( "SUPPORT-MODULE" ), makeKeyword( "TIME" ), makeKeyword( "DOCUMENTATION" ), makeString(
                                      "(#$endsAfterEndingOf <TemporalThing> <TemporalThing>)" )
    } );
    $sym63$REMOVAL_ALL_ENDS_AFTER_ENDING_OF_OUTPUT_GENERATE = makeSymbol( "REMOVAL-ALL-ENDS-AFTER-ENDING-OF-OUTPUT-GENERATE" );
    $kw64$REMOVAL_ALL_ENDS_AFTER_ENDING_OF = makeKeyword( "REMOVAL-ALL-ENDS-AFTER-ENDING-OF" );
    $list65 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "endsAfterEndingOf" ) ), makeKeyword(
        "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "endsAfterEndingOf" ) ), ConsesLow.list( makeKeyword( "TEST" ), makeSymbol( "SBHL-TIME-INFERENCE-ARG-P" ) ),
            makeKeyword( "NOT-FULLY-BOUND" ) ), makeKeyword( "COST-EXPRESSION" ), makeSymbol( "*DEFAULT-ALL-TEMPORAL-RELATION-COST*" ), makeKeyword( "COMPLETENESS" ), makeKeyword( "GROSSLY-INCOMPLETE" ), makeKeyword(
                "INPUT-EXTRACT-PATTERN" ), ConsesLow.list( makeKeyword( "TEMPLATE" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "endsAfterEndingOf" ) ), ConsesLow.list( makeKeyword(
                    "BIND" ), makeSymbol( "TEMPORAL-THING" ) ), makeKeyword( "ANYTHING" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "TEMPORAL-THING" ) ) ), makeKeyword( "INPUT-ENCODE-PATTERN" ), ConsesLow
                        .list( makeKeyword( "CALL" ), makeSymbol( "POSSIBLY-BIND-TEMPORAL-INDEXICAL-IN-OBJECT" ), makeKeyword( "INPUT" ) ), makeKeyword( "OUTPUT-GENERATE-PATTERN" ), ConsesLow.list( makeKeyword( "CALL" ),
                            makeSymbol( "REMOVAL-ALL-ENDS-AFTER-ENDING-OF-OUTPUT-GENERATE" ), makeKeyword( "INPUT" ) ), makeKeyword( "OUTPUT-CONSTRUCT-PATTERN" ), ConsesLow.list( constant_handles
                                .reader_make_constant_shell( makeString( "endsAfterEndingOf" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "TEMPORAL-THING" ) ), makeKeyword( "INPUT" ) ), makeKeyword(
                                    "SUPPORT-MODULE" ), makeKeyword( "TIME" ), makeKeyword( "DOCUMENTATION" ), makeString( "(#$endsAfterEndingOf <TemporalThing> <not-fully-bound>)" )
    } );
    $kw66$ALL_ENDS_AFTER_ENDING_OF_POS = makeKeyword( "ALL-ENDS-AFTER-ENDING-OF-POS" );
    $list67 = ConsesLow.list( makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "endsAfterEndingOf" ) ), makeKeyword( "REQUIRED-PATTERN" ),
        ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "endsAfterEndingOf" ) ), makeKeyword( "ANYTHING" ), makeKeyword( "NOT-FULLY-BOUND" ) ), makeKeyword( "PREFERENCE-LEVEL" ), makeKeyword(
            "GROSSLY-DISPREFERRED" ) );
    $sym68$REMOVAL_ALL_ENDS_AFTER_ENDING_OF_INVERSE_OUTPUT_GENERATE = makeSymbol( "REMOVAL-ALL-ENDS-AFTER-ENDING-OF-INVERSE-OUTPUT-GENERATE" );
    $kw69$REMOVAL_ALL_ENDS_AFTER_ENDING_OF_INVERSE = makeKeyword( "REMOVAL-ALL-ENDS-AFTER-ENDING-OF-INVERSE" );
    $list70 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "endsAfterEndingOf" ) ), makeKeyword(
        "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "endsAfterEndingOf" ) ), makeKeyword( "NOT-FULLY-BOUND" ), ConsesLow.list( makeKeyword( "TEST" ), makeSymbol(
            "SBHL-TIME-INFERENCE-ARG-P" ) ) ), makeKeyword( "COST-EXPRESSION" ), makeSymbol( "*DEFAULT-ALL-TEMPORAL-RELATION-INVERSE-COST*" ), makeKeyword( "COMPLETENESS" ), makeKeyword( "GROSSLY-INCOMPLETE" ),
      makeKeyword( "INPUT-EXTRACT-PATTERN" ), ConsesLow.list( makeKeyword( "TEMPLATE" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "endsAfterEndingOf" ) ), makeKeyword( "ANYTHING" ),
          ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "TEMPORAL-THING" ) ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "TEMPORAL-THING" ) ) ), makeKeyword( "INPUT-ENCODE-PATTERN" ), ConsesLow.list(
              makeKeyword( "CALL" ), makeSymbol( "POSSIBLY-BIND-TEMPORAL-INDEXICAL-IN-OBJECT" ), makeKeyword( "INPUT" ) ), makeKeyword( "OUTPUT-GENERATE-PATTERN" ), ConsesLow.list( makeKeyword( "CALL" ), makeSymbol(
                  "REMOVAL-ALL-ENDS-AFTER-ENDING-OF-INVERSE-OUTPUT-GENERATE" ), makeKeyword( "INPUT" ) ), makeKeyword( "OUTPUT-CONSTRUCT-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell(
                      makeString( "endsAfterEndingOf" ) ), makeKeyword( "INPUT" ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "TEMPORAL-THING" ) ) ), makeKeyword( "SUPPORT-MODULE" ), makeKeyword( "TIME" ),
      makeKeyword( "DOCUMENTATION" ), makeString( "(#$endsAfterEndingOf <not-fully-bound> <TemporalThing>)" )
    } );
    $kw71$ALL_ENDS_AFTER_ENDING_OF_INVERSE_POS = makeKeyword( "ALL-ENDS-AFTER-ENDING-OF-INVERSE-POS" );
    $list72 = ConsesLow.list( makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "endsAfterEndingOf" ) ), makeKeyword( "REQUIRED-PATTERN" ),
        ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "endsAfterEndingOf" ) ), makeKeyword( "NOT-FULLY-BOUND" ), makeKeyword( "ANYTHING" ) ), makeKeyword( "PREFERENCE-LEVEL" ), makeKeyword(
            "GROSSLY-DISPREFERRED" ) );
    $kw73$REMOVAL_NOT_ENDS_AFTER_ENDING_OF = makeKeyword( "REMOVAL-NOT-ENDS-AFTER-ENDING-OF" );
    $list74 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "NEG" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "endsAfterEndingOf" ) ), makeKeyword(
        "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "endsAfterEndingOf" ) ), ConsesLow.list( makeKeyword( "TEST" ), makeSymbol( "SBHL-TIME-INFERENCE-ARG-P" ) ),
            ConsesLow.list( makeKeyword( "TEST" ), makeSymbol( "SBHL-TIME-INFERENCE-ARG-P" ) ) ), makeKeyword( "COST-EXPRESSION" ), makeSymbol( "*DEFAULT-NOT-TEMPORAL-RELATION-CHECK-COST*" ), makeKeyword( "EXPAND" ),
      makeSymbol( "REMOVAL-NOT-ENDS-AFTER-ENDING-OF-EXPAND" ), makeKeyword( "DOCUMENTATION" ), makeString( "(#$not (#$endsAfterEndingOf <TemporalThing> <TemporalThing>))" )
    } );
    $const75$temporallySubsumes = constant_handles.reader_make_constant_shell( makeString( "temporallySubsumes" ) );
    $kw76$REMOVAL_TEMPORALLY_SUBSUMES = makeKeyword( "REMOVAL-TEMPORALLY-SUBSUMES" );
    $list77 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "temporallySubsumes" ) ), makeKeyword(
        "CHECK" ), T, makeKeyword( "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "temporallySubsumes" ) ), ConsesLow.list( makeKeyword( "TEST" ), makeSymbol(
            "SBHL-TIME-INFERENCE-ARG-P" ) ), ConsesLow.list( makeKeyword( "TEST" ), makeSymbol( "SBHL-TIME-INFERENCE-ARG-P" ) ) ), makeKeyword( "COST-EXPRESSION" ), makeSymbol( "*DEFAULT-TEMPORAL-RELATION-CHECK-COST*" ),
      makeKeyword( "INPUT-EXTRACT-PATTERN" ), ConsesLow.list( makeKeyword( "TEMPLATE" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "temporallySubsumes" ) ), ConsesLow.list( makeKeyword(
          "BIND" ), makeSymbol( "TEMPORAL-THING1" ) ), ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "TEMPORAL-THING2" ) ) ), ConsesLow.list( ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol(
              "TEMPORAL-THING1" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "TEMPORAL-THING2" ) ) ) ), makeKeyword( "INPUT-ENCODE-PATTERN" ), ConsesLow.list( makeKeyword( "TUPLE" ), ConsesLow.list(
                  makeSymbol( "TEMPORAL-THING1" ), makeSymbol( "TEMPORAL-THING2" ) ), ConsesLow.list( ConsesLow.list( makeKeyword( "CALL" ), makeSymbol( "POSSIBLY-BIND-TEMPORAL-INDEXICAL-IN-OBJECT" ), ConsesLow.list(
                      makeKeyword( "VALUE" ), makeSymbol( "TEMPORAL-THING1" ) ) ), ConsesLow.list( makeKeyword( "CALL" ), makeSymbol( "POSSIBLY-BIND-TEMPORAL-INDEXICAL-IN-OBJECT" ), ConsesLow.list( makeKeyword(
                          "VALUE" ), makeSymbol( "TEMPORAL-THING2" ) ) ) ) ), makeKeyword( "OUTPUT-CHECK-PATTERN" ), ConsesLow.list( makeKeyword( "TUPLE" ), ConsesLow.list( makeSymbol( "TEMPORAL-THING1" ), makeSymbol(
                              "TEMPORAL-THING2" ) ), ConsesLow.list( makeKeyword( "CALL" ), makeSymbol( "TEMPORALLY-SUBSUMES?" ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "TEMPORAL-THING1" ) ), ConsesLow.list(
                                  makeKeyword( "VALUE" ), makeSymbol( "TEMPORAL-THING2" ) ) ) ), makeKeyword( "SUPPORT-MODULE" ), makeKeyword( "TIME" ), makeKeyword( "DOCUMENTATION" ), makeString(
                                      "(#$temporallySubsumes <TemporalThing> <TemporalThing>)" )
    } );
    $sym78$REMOVAL_ALL_TEMPORALLY_SUBSUMES_OUTPUT_GENERATE = makeSymbol( "REMOVAL-ALL-TEMPORALLY-SUBSUMES-OUTPUT-GENERATE" );
    $kw79$REMOVAL_ALL_TEMPORALLY_SUBSUMES = makeKeyword( "REMOVAL-ALL-TEMPORALLY-SUBSUMES" );
    $list80 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "temporallySubsumes" ) ), makeKeyword(
        "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "temporallySubsumes" ) ), ConsesLow.list( makeKeyword( "TEST" ), makeSymbol( "SBHL-TIME-INFERENCE-ARG-P" ) ),
            makeKeyword( "NOT-FULLY-BOUND" ) ), makeKeyword( "COST-EXPRESSION" ), makeSymbol( "*DEFAULT-ALL-TEMPORAL-RELATION-COST*" ), makeKeyword( "COMPLETENESS" ), makeKeyword( "GROSSLY-INCOMPLETE" ), makeKeyword(
                "INPUT-EXTRACT-PATTERN" ), ConsesLow.list( makeKeyword( "TEMPLATE" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "temporallySubsumes" ) ), ConsesLow.list( makeKeyword(
                    "BIND" ), makeSymbol( "TEMPORAL-THING" ) ), makeKeyword( "ANYTHING" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "TEMPORAL-THING" ) ) ), makeKeyword( "INPUT-ENCODE-PATTERN" ), ConsesLow
                        .list( makeKeyword( "CALL" ), makeSymbol( "POSSIBLY-BIND-TEMPORAL-INDEXICAL-IN-OBJECT" ), makeKeyword( "INPUT" ) ), makeKeyword( "OUTPUT-GENERATE-PATTERN" ), ConsesLow.list( makeKeyword( "CALL" ),
                            makeSymbol( "REMOVAL-ALL-TEMPORALLY-SUBSUMES-OUTPUT-GENERATE" ), makeKeyword( "INPUT" ) ), makeKeyword( "OUTPUT-CONSTRUCT-PATTERN" ), ConsesLow.list( constant_handles
                                .reader_make_constant_shell( makeString( "temporallySubsumes" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "TEMPORAL-THING" ) ), makeKeyword( "INPUT" ) ), makeKeyword(
                                    "SUPPORT-MODULE" ), makeKeyword( "TIME" ), makeKeyword( "DOCUMENTATION" ), makeString( "(#$temporallySubsumes <TemporalThing> <not-fully-bound>)" )
    } );
    $kw81$ALL_TEMPORALLY_SUBSUMES_POS = makeKeyword( "ALL-TEMPORALLY-SUBSUMES-POS" );
    $list82 = ConsesLow.list( makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "temporallySubsumes" ) ), makeKeyword(
        "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "temporallySubsumes" ) ), makeKeyword( "ANYTHING" ), makeKeyword( "NOT-FULLY-BOUND" ) ), makeKeyword(
            "PREFERENCE-LEVEL" ), makeKeyword( "GROSSLY-DISPREFERRED" ) );
    $sym83$REMOVAL_ALL_TEMPORALLY_SUBSUMES_INVERSE_OUTPUT_GENERATE = makeSymbol( "REMOVAL-ALL-TEMPORALLY-SUBSUMES-INVERSE-OUTPUT-GENERATE" );
    $kw84$REMOVAL_ALL_TEMPORALLY_SUBSUMES_INVERSE = makeKeyword( "REMOVAL-ALL-TEMPORALLY-SUBSUMES-INVERSE" );
    $list85 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "temporallySubsumes" ) ), makeKeyword(
        "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "temporallySubsumes" ) ), makeKeyword( "NOT-FULLY-BOUND" ), ConsesLow.list( makeKeyword( "TEST" ), makeSymbol(
            "SBHL-TIME-INFERENCE-ARG-P" ) ) ), makeKeyword( "COST-EXPRESSION" ), makeSymbol( "*DEFAULT-ALL-TEMPORAL-RELATION-INVERSE-COST*" ), makeKeyword( "COMPLETENESS" ), makeKeyword( "GROSSLY-INCOMPLETE" ),
      makeKeyword( "INPUT-EXTRACT-PATTERN" ), ConsesLow.list( makeKeyword( "TEMPLATE" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "temporallySubsumes" ) ), makeKeyword( "ANYTHING" ),
          ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "TEMPORAL-THING" ) ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "TEMPORAL-THING" ) ) ), makeKeyword( "INPUT-ENCODE-PATTERN" ), ConsesLow.list(
              makeKeyword( "CALL" ), makeSymbol( "POSSIBLY-BIND-TEMPORAL-INDEXICAL-IN-OBJECT" ), makeKeyword( "INPUT" ) ), makeKeyword( "OUTPUT-GENERATE-PATTERN" ), ConsesLow.list( makeKeyword( "CALL" ), makeSymbol(
                  "REMOVAL-ALL-TEMPORALLY-SUBSUMES-INVERSE-OUTPUT-GENERATE" ), makeKeyword( "INPUT" ) ), makeKeyword( "OUTPUT-CONSTRUCT-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
                      "temporallySubsumes" ) ), makeKeyword( "INPUT" ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "TEMPORAL-THING" ) ) ), makeKeyword( "SUPPORT-MODULE" ), makeKeyword( "TIME" ), makeKeyword(
                          "DOCUMENTATION" ), makeString( "(#$temporallySubsumes <not-fully-bound> <TemporalThing>)" )
    } );
    $kw86$ALL_TEMPORALLY_SUBSUMES_INVERSE_POS = makeKeyword( "ALL-TEMPORALLY-SUBSUMES-INVERSE-POS" );
    $list87 = ConsesLow.list( makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "temporallySubsumes" ) ), makeKeyword(
        "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "temporallySubsumes" ) ), makeKeyword( "NOT-FULLY-BOUND" ), makeKeyword( "ANYTHING" ) ), makeKeyword(
            "PREFERENCE-LEVEL" ), makeKeyword( "GROSSLY-DISPREFERRED" ) );
    $kw88$REMOVAL_NOT_TEMPORALLY_SUBSUMES = makeKeyword( "REMOVAL-NOT-TEMPORALLY-SUBSUMES" );
    $list89 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "NEG" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "temporallySubsumes" ) ), makeKeyword(
        "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "temporallySubsumes" ) ), ConsesLow.list( makeKeyword( "TEST" ), makeSymbol( "SBHL-TIME-INFERENCE-ARG-P" ) ),
            ConsesLow.list( makeKeyword( "TEST" ), makeSymbol( "SBHL-TIME-INFERENCE-ARG-P" ) ) ), makeKeyword( "COST-EXPRESSION" ), makeSymbol( "*DEFAULT-NOT-TEMPORAL-RELATION-CHECK-COST*" ), makeKeyword( "EXPAND" ),
      makeSymbol( "REMOVAL-NOT-TEMPORALLY-SUBSUMES-EXPAND" )
    } );
    $const90$dateOfEvent = constant_handles.reader_make_constant_shell( makeString( "dateOfEvent" ) );
    $kw91$REMOVAL_DATE_OF_EVENT = makeKeyword( "REMOVAL-DATE-OF-EVENT" );
    $list92 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "dateOfEvent" ) ), makeKeyword(
        "CHECK" ), T, makeKeyword( "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "dateOfEvent" ) ), ConsesLow.list( makeKeyword( "TEST" ), makeSymbol(
            "SBHL-TIME-INFERENCE-ARG-P" ) ), ConsesLow.list( makeKeyword( "TEST" ), makeSymbol( "SBHL-TIME-INFERENCE-ARG-P" ) ) ), makeKeyword( "COST-EXPRESSION" ), makeSymbol( "*DEFAULT-TEMPORAL-RELATION-CHECK-COST*" ),
      makeKeyword( "INPUT-EXTRACT-PATTERN" ), ConsesLow.list( makeKeyword( "TEMPLATE" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "dateOfEvent" ) ), ConsesLow.list( makeKeyword( "BIND" ),
          makeSymbol( "EVENT" ) ), ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "DATE" ) ) ), ConsesLow.list( ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "EVENT" ) ), ConsesLow.list( makeKeyword( "VALUE" ),
              makeSymbol( "DATE" ) ) ) ), makeKeyword( "INPUT-ENCODE-PATTERN" ), ConsesLow.list( makeKeyword( "TUPLE" ), ConsesLow.list( makeSymbol( "EVENT" ), makeSymbol( "DATE" ) ), ConsesLow.list( ConsesLow.list(
                  makeKeyword( "CALL" ), makeSymbol( "POSSIBLY-BIND-TEMPORAL-INDEXICAL-IN-OBJECT" ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "EVENT" ) ) ), ConsesLow.list( makeKeyword( "CALL" ), makeSymbol(
                      "POSSIBLY-BIND-TEMPORAL-INDEXICAL-IN-OBJECT" ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "DATE" ) ) ) ) ), makeKeyword( "OUTPUT-CHECK-PATTERN" ), ConsesLow.list( makeKeyword( "TUPLE" ),
                          ConsesLow.list( makeSymbol( "EVENT" ), makeSymbol( "DATE" ) ), ConsesLow.list( makeKeyword( "CALL" ), makeSymbol( "DATE-OF-EVENT?" ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol(
                              "EVENT" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "DATE" ) ) ) ), makeKeyword( "SUPPORT-MODULE" ), makeKeyword( "TIME" ), makeKeyword( "DOCUMENTATION" ), makeString(
                                  "(#$dateOfEvent <Event> <Date>)" )
    } );
    $sym93$REMOVAL_ALL_DATE_OF_EVENT_INVERSE_OUTPUT_GENERATE = makeSymbol( "REMOVAL-ALL-DATE-OF-EVENT-INVERSE-OUTPUT-GENERATE" );
    $kw94$REMOVAL_ALL_DATE_OF_EVENT_INVERSE = makeKeyword( "REMOVAL-ALL-DATE-OF-EVENT-INVERSE" );
    $list95 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "dateOfEvent" ) ), makeKeyword(
        "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "dateOfEvent" ) ), makeKeyword( "NOT-FULLY-BOUND" ), ConsesLow.list( makeKeyword( "TEST" ), makeSymbol(
            "SBHL-TIME-INFERENCE-ARG-P" ) ) ), makeKeyword( "COST-EXPRESSION" ), makeSymbol( "*DEFAULT-ALL-TEMPORAL-RELATION-INVERSE-COST*" ), makeKeyword( "COMPLETENESS" ), makeKeyword( "GROSSLY-INCOMPLETE" ),
      makeKeyword( "INPUT-EXTRACT-PATTERN" ), ConsesLow.list( makeKeyword( "TEMPLATE" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "dateOfEvent" ) ), makeKeyword( "ANYTHING" ), ConsesLow
          .list( makeKeyword( "BIND" ), makeSymbol( "DATE" ) ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "DATE" ) ) ), makeKeyword( "INPUT-ENCODE-PATTERN" ), ConsesLow.list( makeKeyword( "CALL" ),
              makeSymbol( "POSSIBLY-BIND-TEMPORAL-INDEXICAL-IN-OBJECT" ), makeKeyword( "INPUT" ) ), makeKeyword( "OUTPUT-GENERATE-PATTERN" ), ConsesLow.list( makeKeyword( "CALL" ), makeSymbol(
                  "REMOVAL-ALL-DATE-OF-EVENT-INVERSE-OUTPUT-GENERATE" ), makeKeyword( "INPUT" ) ), makeKeyword( "OUTPUT-CONSTRUCT-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
                      "dateOfEvent" ) ), makeKeyword( "INPUT" ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "DATE" ) ) ), makeKeyword( "SUPPORT-MODULE" ), makeKeyword( "TIME" ), makeKeyword( "DOCUMENTATION" ),
      makeString( "(#$dateOfEvent <not-fully-bound> <Date>)" )
    } );
    $kw96$ALL_DATE_OF_EVENT_INVERSE_POS = makeKeyword( "ALL-DATE-OF-EVENT-INVERSE-POS" );
    $list97 = ConsesLow.list( makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "dateOfEvent" ) ), makeKeyword( "REQUIRED-PATTERN" ),
        ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "dateOfEvent" ) ), makeKeyword( "NOT-FULLY-BOUND" ), makeKeyword( "ANYTHING" ) ), makeKeyword( "PREFERENCE-LEVEL" ), makeKeyword(
            "GROSSLY-DISPREFERRED" ) );
    $kw98$REMOVAL_NOT_DATE_OF_EVENT = makeKeyword( "REMOVAL-NOT-DATE-OF-EVENT" );
    $list99 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "NEG" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "dateOfEvent" ) ), makeKeyword(
        "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "dateOfEvent" ) ), ConsesLow.list( makeKeyword( "TEST" ), makeSymbol( "SBHL-TIME-INFERENCE-ARG-P" ) ), ConsesLow
            .list( makeKeyword( "TEST" ), makeSymbol( "SBHL-TIME-INFERENCE-ARG-P" ) ) ), makeKeyword( "COST-EXPRESSION" ), makeSymbol( "*DEFAULT-NOT-TEMPORAL-RELATION-CHECK-COST*" ), makeKeyword( "EXPAND" ), makeSymbol(
                "REMOVAL-NOT-DATE-OF-EVENT-EXPAND" )
    } );
    $kw100$REMOVAL_DATE_OF_EVENT_DELAY = makeKeyword( "REMOVAL-DATE-OF-EVENT-DELAY" );
    $list101 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "dateOfEvent" ) ), makeKeyword(
        "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "dateOfEvent" ) ), makeKeyword( "VARIABLE" ), makeKeyword( "VARIABLE" ) ), makeKeyword( "EXCLUSIVE" ), makeSymbol(
            "TRUE" ), makeKeyword( "REQUIRED" ), makeSymbol( "FALSE" ), makeKeyword( "DOCUMENTATION" ), makeString( "Delay module that ensures that \n    (#$dateOfEvent <variable> <variable>)\n    is not worked on" ),
      makeKeyword( "EXAMPLE" ), makeString( "(#$dateOfEvent ?X ?Y)" )
    } );
    $const102$cotemporal = constant_handles.reader_make_constant_shell( makeString( "cotemporal" ) );
    $kw103$REMOVAL_COTEMPORAL = makeKeyword( "REMOVAL-COTEMPORAL" );
    $list104 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "cotemporal" ) ), makeKeyword(
        "CHECK" ), T, makeKeyword( "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "cotemporal" ) ), ConsesLow.list( makeKeyword( "TEST" ), makeSymbol(
            "SBHL-TIME-INFERENCE-ARG-P" ) ), ConsesLow.list( makeKeyword( "TEST" ), makeSymbol( "SBHL-TIME-INFERENCE-ARG-P" ) ) ), makeKeyword( "COST-EXPRESSION" ), makeSymbol( "*DEFAULT-TEMPORAL-RELATION-CHECK-COST*" ),
      makeKeyword( "INPUT-EXTRACT-PATTERN" ), ConsesLow.list( makeKeyword( "TEMPLATE" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "cotemporal" ) ), ConsesLow.list( makeKeyword( "BIND" ),
          makeSymbol( "TEMPORAL-THING1" ) ), ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "TEMPORAL-THING2" ) ) ), ConsesLow.list( ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "TEMPORAL-THING1" ) ),
              ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "TEMPORAL-THING2" ) ) ) ), makeKeyword( "INPUT-ENCODE-PATTERN" ), ConsesLow.list( makeKeyword( "TUPLE" ), ConsesLow.list( makeSymbol( "TEMPORAL-THING1" ),
                  makeSymbol( "TEMPORAL-THING2" ) ), ConsesLow.list( ConsesLow.list( makeKeyword( "CALL" ), makeSymbol( "POSSIBLY-BIND-TEMPORAL-INDEXICAL-IN-OBJECT" ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol(
                      "TEMPORAL-THING1" ) ) ), ConsesLow.list( makeKeyword( "CALL" ), makeSymbol( "POSSIBLY-BIND-TEMPORAL-INDEXICAL-IN-OBJECT" ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol(
                          "TEMPORAL-THING2" ) ) ) ) ), makeKeyword( "OUTPUT-CHECK-PATTERN" ), ConsesLow.list( makeKeyword( "TUPLE" ), ConsesLow.list( makeSymbol( "TEMPORAL-THING1" ), makeSymbol( "TEMPORAL-THING2" ) ),
                              ConsesLow.list( makeKeyword( "CALL" ), makeSymbol( "COTEMPORAL?" ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "TEMPORAL-THING1" ) ), ConsesLow.list( makeKeyword( "VALUE" ),
                                  makeSymbol( "TEMPORAL-THING2" ) ) ) ), makeKeyword( "SUPPORT-MODULE" ), makeKeyword( "TIME" ), makeKeyword( "DOCUMENTATION" ), makeString(
                                      "(#$cotemporal <TemporalThing> <TemporalThing>)" )
    } );
    $sym105$REMOVAL_ALL_COTEMPORAL_OUTPUT_GENERATE = makeSymbol( "REMOVAL-ALL-COTEMPORAL-OUTPUT-GENERATE" );
    $kw106$REMOVAL_ALL_COTEMPORAL = makeKeyword( "REMOVAL-ALL-COTEMPORAL" );
    $list107 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "cotemporal" ) ), makeKeyword(
        "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "cotemporal" ) ), ConsesLow.list( makeKeyword( "TEST" ), makeSymbol( "SBHL-TIME-INFERENCE-ARG-P" ) ), makeKeyword(
            "NOT-FULLY-BOUND" ) ), makeKeyword( "COST-EXPRESSION" ), makeSymbol( "*DEFAULT-ALL-TEMPORAL-RELATION-COST*" ), makeKeyword( "COMPLETENESS" ), makeKeyword( "GROSSLY-INCOMPLETE" ), makeKeyword(
                "INPUT-EXTRACT-PATTERN" ), ConsesLow.list( makeKeyword( "TEMPLATE" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "cotemporal" ) ), ConsesLow.list( makeKeyword( "BIND" ),
                    makeSymbol( "TEMPORAL-THING" ) ), makeKeyword( "ANYTHING" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "TEMPORAL-THING" ) ) ), makeKeyword( "INPUT-ENCODE-PATTERN" ), ConsesLow.list(
                        makeKeyword( "CALL" ), makeSymbol( "POSSIBLY-BIND-TEMPORAL-INDEXICAL-IN-OBJECT" ), makeKeyword( "INPUT" ) ), makeKeyword( "OUTPUT-GENERATE-PATTERN" ), ConsesLow.list( makeKeyword( "CALL" ),
                            makeSymbol( "REMOVAL-ALL-COTEMPORAL-OUTPUT-GENERATE" ), makeKeyword( "INPUT" ) ), makeKeyword( "OUTPUT-CONSTRUCT-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell(
                                makeString( "cotemporal" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "TEMPORAL-THING" ) ), makeKeyword( "INPUT" ) ), makeKeyword( "SUPPORT-MODULE" ), makeKeyword( "TIME" ),
      makeKeyword( "DOCUMENTATION" ), makeString( "(#$cotemporal <TemporalThing> <not-fully-bound>)" )
    } );
    $kw108$ALL_COTEMPORAL_POS = makeKeyword( "ALL-COTEMPORAL-POS" );
    $list109 = ConsesLow.list( makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "cotemporal" ) ), makeKeyword( "REQUIRED-PATTERN" ),
        ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "cotemporal" ) ), makeKeyword( "ANYTHING" ), makeKeyword( "NOT-FULLY-BOUND" ) ), makeKeyword( "PREFERENCE-LEVEL" ), makeKeyword(
            "GROSSLY-DISPREFERRED" ) );
    $kw110$REMOVAL_ALL_COTEMPORAL_INVERSE = makeKeyword( "REMOVAL-ALL-COTEMPORAL-INVERSE" );
    $list111 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "cotemporal" ) ), makeKeyword(
        "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "cotemporal" ) ), makeKeyword( "NOT-FULLY-BOUND" ), ConsesLow.list( makeKeyword( "TEST" ), makeSymbol(
            "SBHL-TIME-INFERENCE-ARG-P" ) ) ), makeKeyword( "COST-EXPRESSION" ), makeSymbol( "*DEFAULT-ALL-TEMPORAL-RELATION-COST*" ), makeKeyword( "COMPLETENESS" ), makeKeyword( "GROSSLY-INCOMPLETE" ), makeKeyword(
                "INPUT-EXTRACT-PATTERN" ), ConsesLow.list( makeKeyword( "TEMPLATE" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "cotemporal" ) ), makeKeyword( "ANYTHING" ), ConsesLow.list(
                    makeKeyword( "BIND" ), makeSymbol( "TEMPORAL-THING" ) ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "TEMPORAL-THING" ) ) ), makeKeyword( "INPUT-ENCODE-PATTERN" ), ConsesLow.list(
                        makeKeyword( "CALL" ), makeSymbol( "POSSIBLY-BIND-TEMPORAL-INDEXICAL-IN-OBJECT" ), makeKeyword( "INPUT" ) ), makeKeyword( "OUTPUT-GENERATE-PATTERN" ), ConsesLow.list( makeKeyword( "CALL" ),
                            makeSymbol( "REMOVAL-ALL-COTEMPORAL-OUTPUT-GENERATE" ), makeKeyword( "INPUT" ) ), makeKeyword( "OUTPUT-CONSTRUCT-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell(
                                makeString( "cotemporal" ) ), makeKeyword( "INPUT" ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "TEMPORAL-THING" ) ) ), makeKeyword( "SUPPORT-MODULE" ), makeKeyword( "TIME" ),
      makeKeyword( "DOCUMENTATION" ), makeString( "(#$cotemporal <not-fully-bound> <TemporalThing>)" )
    } );
    $kw112$ALL_COTEMPORAL_INVERSE_POS = makeKeyword( "ALL-COTEMPORAL-INVERSE-POS" );
    $list113 = ConsesLow.list( makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "cotemporal" ) ), makeKeyword( "REQUIRED-PATTERN" ),
        ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "cotemporal" ) ), makeKeyword( "NOT-FULLY-BOUND" ), makeKeyword( "ANYTHING" ) ), makeKeyword( "PREFERENCE-LEVEL" ), makeKeyword(
            "GROSSLY-DISPREFERRED" ) );
    $kw114$REMOVAL_NOT_COTEMPORAL = makeKeyword( "REMOVAL-NOT-COTEMPORAL" );
    $list115 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "NEG" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "cotemporal" ) ), makeKeyword(
        "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "cotemporal" ) ), ConsesLow.list( makeKeyword( "TEST" ), makeSymbol( "SBHL-TIME-INFERENCE-ARG-P" ) ), ConsesLow.list(
            makeKeyword( "TEST" ), makeSymbol( "SBHL-TIME-INFERENCE-ARG-P" ) ) ), makeKeyword( "COST-EXPRESSION" ), makeSymbol( "*DEFAULT-NOT-TEMPORAL-RELATION-CHECK-COST*" ), makeKeyword( "EXPAND" ), makeSymbol(
                "REMOVAL-NOT-COTEMPORAL-EXPAND" )
    } );
    $const116$temporallyIntersects = constant_handles.reader_make_constant_shell( makeString( "temporallyIntersects" ) );
    $kw117$REMOVAL_TEMPORALLY_INTERSECTS = makeKeyword( "REMOVAL-TEMPORALLY-INTERSECTS" );
    $list118 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "temporallyIntersects" ) ),
      makeKeyword( "CHECK" ), T, makeKeyword( "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "temporallyIntersects" ) ), ConsesLow.list( makeKeyword( "TEST" ), makeSymbol(
          "SBHL-TIME-INFERENCE-ARG-P" ) ), ConsesLow.list( makeKeyword( "TEST" ), makeSymbol( "SBHL-TIME-INFERENCE-ARG-P" ) ) ), makeKeyword( "COST-EXPRESSION" ), makeSymbol( "*DEFAULT-TEMPORAL-RELATION-CHECK-COST*" ),
      makeKeyword( "INPUT-EXTRACT-PATTERN" ), ConsesLow.list( makeKeyword( "TEMPLATE" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "temporallyIntersects" ) ), ConsesLow.list( makeKeyword(
          "BIND" ), makeSymbol( "TEMPORAL-THING1" ) ), ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "TEMPORAL-THING2" ) ) ), ConsesLow.list( ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol(
              "TEMPORAL-THING1" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "TEMPORAL-THING2" ) ) ) ), makeKeyword( "INPUT-ENCODE-PATTERN" ), ConsesLow.list( makeKeyword( "TUPLE" ), ConsesLow.list(
                  makeSymbol( "TEMPORAL-THING1" ), makeSymbol( "TEMPORAL-THING2" ) ), ConsesLow.list( ConsesLow.list( makeKeyword( "CALL" ), makeSymbol( "POSSIBLY-BIND-TEMPORAL-INDEXICAL-IN-OBJECT" ), ConsesLow.list(
                      makeKeyword( "VALUE" ), makeSymbol( "TEMPORAL-THING1" ) ) ), ConsesLow.list( makeKeyword( "CALL" ), makeSymbol( "POSSIBLY-BIND-TEMPORAL-INDEXICAL-IN-OBJECT" ), ConsesLow.list( makeKeyword(
                          "VALUE" ), makeSymbol( "TEMPORAL-THING2" ) ) ) ) ), makeKeyword( "OUTPUT-CHECK-PATTERN" ), ConsesLow.list( makeKeyword( "TUPLE" ), ConsesLow.list( makeSymbol( "TEMPORAL-THING1" ), makeSymbol(
                              "TEMPORAL-THING2" ) ), ConsesLow.list( makeKeyword( "CALL" ), makeSymbol( "TEMPORALLY-INTERSECTS?" ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "TEMPORAL-THING1" ) ), ConsesLow
                                  .list( makeKeyword( "VALUE" ), makeSymbol( "TEMPORAL-THING2" ) ) ) ), makeKeyword( "SUPPORT-MODULE" ), makeKeyword( "TIME" ), makeKeyword( "DOCUMENTATION" ), makeString(
                                      "(#$temporallyIntersects <TemporalThing> <TemporalThing>)" )
    } );
    $sym119$REMOVAL_ALL_TEMPORALLY_INTERSECTS_OUTPUT_GENERATE = makeSymbol( "REMOVAL-ALL-TEMPORALLY-INTERSECTS-OUTPUT-GENERATE" );
    $kw120$REMOVAL_ALL_TEMPORALLY_INTERSECTS = makeKeyword( "REMOVAL-ALL-TEMPORALLY-INTERSECTS" );
    $list121 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "temporallyIntersects" ) ),
      makeKeyword( "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "temporallyIntersects" ) ), ConsesLow.list( makeKeyword( "TEST" ), makeSymbol(
          "SBHL-TIME-INFERENCE-ARG-P" ) ), makeKeyword( "NOT-FULLY-BOUND" ) ), makeKeyword( "COST-EXPRESSION" ), makeSymbol( "*DEFAULT-ALL-TEMPORAL-RELATION-COST*" ), makeKeyword( "COMPLETENESS" ), makeKeyword(
              "GROSSLY-INCOMPLETE" ), makeKeyword( "INPUT-EXTRACT-PATTERN" ), ConsesLow.list( makeKeyword( "TEMPLATE" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
                  "temporallyIntersects" ) ), ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "TEMPORAL-THING" ) ), makeKeyword( "ANYTHING" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol(
                      "TEMPORAL-THING" ) ) ), makeKeyword( "INPUT-ENCODE-PATTERN" ), ConsesLow.list( makeKeyword( "CALL" ), makeSymbol( "POSSIBLY-BIND-TEMPORAL-INDEXICAL-IN-OBJECT" ), makeKeyword( "INPUT" ) ),
      makeKeyword( "OUTPUT-GENERATE-PATTERN" ), ConsesLow.list( makeKeyword( "CALL" ), makeSymbol( "REMOVAL-ALL-TEMPORALLY-INTERSECTS-OUTPUT-GENERATE" ), makeKeyword( "INPUT" ) ), makeKeyword(
          "OUTPUT-CONSTRUCT-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "temporallyIntersects" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "TEMPORAL-THING" ) ),
              makeKeyword( "INPUT" ) ), makeKeyword( "SUPPORT-MODULE" ), makeKeyword( "TIME" ), makeKeyword( "DOCUMENTATION" ), makeString( "(#$temporallyIntersects <TemporalThing> <not-fully-bound>)" )
    } );
    $kw122$ALL_TEMPORALLY_INTERSECTS_POS = makeKeyword( "ALL-TEMPORALLY-INTERSECTS-POS" );
    $list123 = ConsesLow.list( makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "temporallyIntersects" ) ), makeKeyword(
        "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "temporallyIntersects" ) ), makeKeyword( "ANYTHING" ), makeKeyword( "NOT-FULLY-BOUND" ) ), makeKeyword(
            "PREFERENCE-LEVEL" ), makeKeyword( "GROSSLY-DISPREFERRED" ) );
    $kw124$REMOVAL_ALL_TEMPORALLY_INTERSECTS_INVERSE = makeKeyword( "REMOVAL-ALL-TEMPORALLY-INTERSECTS-INVERSE" );
    $list125 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "temporallyIntersects" ) ),
      makeKeyword( "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "temporallyIntersects" ) ), makeKeyword( "NOT-FULLY-BOUND" ), ConsesLow.list( makeKeyword( "TEST" ),
          makeSymbol( "SBHL-TIME-INFERENCE-ARG-P" ) ) ), makeKeyword( "COST-EXPRESSION" ), makeSymbol( "*DEFAULT-ALL-TEMPORAL-RELATION-COST*" ), makeKeyword( "COMPLETENESS" ), makeKeyword( "GROSSLY-INCOMPLETE" ),
      makeKeyword( "INPUT-EXTRACT-PATTERN" ), ConsesLow.list( makeKeyword( "TEMPLATE" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "temporallyIntersects" ) ), makeKeyword( "ANYTHING" ),
          ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "TEMPORAL-THING" ) ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "TEMPORAL-THING" ) ) ), makeKeyword( "INPUT-ENCODE-PATTERN" ), ConsesLow.list(
              makeKeyword( "CALL" ), makeSymbol( "POSSIBLY-BIND-TEMPORAL-INDEXICAL-IN-OBJECT" ), makeKeyword( "INPUT" ) ), makeKeyword( "OUTPUT-GENERATE-PATTERN" ), ConsesLow.list( makeKeyword( "CALL" ), makeSymbol(
                  "REMOVAL-ALL-TEMPORALLY-INTERSECTS-OUTPUT-GENERATE" ), makeKeyword( "INPUT" ) ), makeKeyword( "OUTPUT-CONSTRUCT-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
                      "temporallyIntersects" ) ), makeKeyword( "INPUT" ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "TEMPORAL-THING" ) ) ), makeKeyword( "SUPPORT-MODULE" ), makeKeyword( "TIME" ), makeKeyword(
                          "DOCUMENTATION" ), makeString( "(#$temporallyIntersects <not-fully-bound> <TemporalThing>)" )
    } );
    $kw126$ALL_TEMPORALLY_INTERSECTS_INVERSE_POS = makeKeyword( "ALL-TEMPORALLY-INTERSECTS-INVERSE-POS" );
    $list127 = ConsesLow.list( makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "temporallyIntersects" ) ), makeKeyword(
        "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "temporallyIntersects" ) ), makeKeyword( "NOT-FULLY-BOUND" ), makeKeyword( "ANYTHING" ) ), makeKeyword(
            "PREFERENCE-LEVEL" ), makeKeyword( "GROSSLY-DISPREFERRED" ) );
    $kw128$REMOVAL_NOT_TEMPORALLY_INTERSECTS = makeKeyword( "REMOVAL-NOT-TEMPORALLY-INTERSECTS" );
    $list129 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "NEG" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "temporallyIntersects" ) ),
      makeKeyword( "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "temporallyIntersects" ) ), ConsesLow.list( makeKeyword( "TEST" ), makeSymbol(
          "SBHL-TIME-INFERENCE-ARG-P" ) ), ConsesLow.list( makeKeyword( "TEST" ), makeSymbol( "SBHL-TIME-INFERENCE-ARG-P" ) ) ), makeKeyword( "COST-EXPRESSION" ), makeSymbol(
              "*DEFAULT-NOT-TEMPORAL-RELATION-CHECK-COST*" ), makeKeyword( "EXPAND" ), makeSymbol( "REMOVAL-NOT-TEMPORALLY-INTERSECTS-EXPAND" )
    } );
    $const130$temporallyDisjoint = constant_handles.reader_make_constant_shell( makeString( "temporallyDisjoint" ) );
    $kw131$REMOVAL_TEMPORALLY_DISJOINT = makeKeyword( "REMOVAL-TEMPORALLY-DISJOINT" );
    $list132 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "temporallyDisjoint" ) ), makeKeyword(
        "CHECK" ), T, makeKeyword( "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "temporallyDisjoint" ) ), ConsesLow.list( makeKeyword( "TEST" ), makeSymbol(
            "SBHL-TIME-INFERENCE-ARG-P" ) ), ConsesLow.list( makeKeyword( "TEST" ), makeSymbol( "SBHL-TIME-INFERENCE-ARG-P" ) ) ), makeKeyword( "COST-EXPRESSION" ), makeSymbol( "*DEFAULT-TEMPORAL-RELATION-CHECK-COST*" ),
      makeKeyword( "INPUT-EXTRACT-PATTERN" ), ConsesLow.list( makeKeyword( "TEMPLATE" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "temporallyDisjoint" ) ), ConsesLow.list( makeKeyword(
          "BIND" ), makeSymbol( "TEMPORAL-THING1" ) ), ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "TEMPORAL-THING2" ) ) ), ConsesLow.list( ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol(
              "TEMPORAL-THING1" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "TEMPORAL-THING2" ) ) ) ), makeKeyword( "INPUT-ENCODE-PATTERN" ), ConsesLow.list( makeKeyword( "TUPLE" ), ConsesLow.list(
                  makeSymbol( "TEMPORAL-THING1" ), makeSymbol( "TEMPORAL-THING2" ) ), ConsesLow.list( ConsesLow.list( makeKeyword( "CALL" ), makeSymbol( "POSSIBLY-BIND-TEMPORAL-INDEXICAL-IN-OBJECT" ), ConsesLow.list(
                      makeKeyword( "VALUE" ), makeSymbol( "TEMPORAL-THING1" ) ) ), ConsesLow.list( makeKeyword( "CALL" ), makeSymbol( "POSSIBLY-BIND-TEMPORAL-INDEXICAL-IN-OBJECT" ), ConsesLow.list( makeKeyword(
                          "VALUE" ), makeSymbol( "TEMPORAL-THING2" ) ) ) ) ), makeKeyword( "OUTPUT-CHECK-PATTERN" ), ConsesLow.list( makeKeyword( "TUPLE" ), ConsesLow.list( makeSymbol( "TEMPORAL-THING1" ), makeSymbol(
                              "TEMPORAL-THING2" ) ), ConsesLow.list( makeKeyword( "CALL" ), makeSymbol( "TEMPORALLY-DISJOINT?" ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "TEMPORAL-THING1" ) ), ConsesLow.list(
                                  makeKeyword( "VALUE" ), makeSymbol( "TEMPORAL-THING2" ) ) ) ), makeKeyword( "SUPPORT-MODULE" ), makeKeyword( "TIME" ), makeKeyword( "DOCUMENTATION" ), makeString(
                                      "(#$temporallyDisjoint <TemporalThing> <TemporalThing>)" )
    } );
    $sym133$REMOVAL_ALL_TEMPORALLY_DISJOINT_OUTPUT_GENERATE = makeSymbol( "REMOVAL-ALL-TEMPORALLY-DISJOINT-OUTPUT-GENERATE" );
    $kw134$REMOVAL_ALL_TEMPORALLY_DISJOINT = makeKeyword( "REMOVAL-ALL-TEMPORALLY-DISJOINT" );
    $list135 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "temporallyDisjoint" ) ), makeKeyword(
        "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "temporallyDisjoint" ) ), ConsesLow.list( makeKeyword( "TEST" ), makeSymbol( "SBHL-TIME-INFERENCE-ARG-P" ) ),
            makeKeyword( "NOT-FULLY-BOUND" ) ), makeKeyword( "COST-EXPRESSION" ), makeSymbol( "*DEFAULT-ALL-TEMPORAL-RELATION-COST*" ), makeKeyword( "COMPLETENESS" ), makeKeyword( "GROSSLY-INCOMPLETE" ), makeKeyword(
                "INPUT-EXTRACT-PATTERN" ), ConsesLow.list( makeKeyword( "TEMPLATE" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "temporallyDisjoint" ) ), ConsesLow.list( makeKeyword(
                    "BIND" ), makeSymbol( "TEMPORAL-THING" ) ), makeKeyword( "ANYTHING" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "TEMPORAL-THING" ) ) ), makeKeyword( "INPUT-ENCODE-PATTERN" ), ConsesLow
                        .list( makeKeyword( "CALL" ), makeSymbol( "POSSIBLY-BIND-TEMPORAL-INDEXICAL-IN-OBJECT" ), makeKeyword( "INPUT" ) ), makeKeyword( "OUTPUT-GENERATE-PATTERN" ), ConsesLow.list( makeKeyword( "CALL" ),
                            makeSymbol( "REMOVAL-ALL-TEMPORALLY-DISJOINT-OUTPUT-GENERATE" ), makeKeyword( "INPUT" ) ), makeKeyword( "OUTPUT-CONSTRUCT-PATTERN" ), ConsesLow.list( constant_handles
                                .reader_make_constant_shell( makeString( "temporallyDisjoint" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "TEMPORAL-THING" ) ), makeKeyword( "INPUT" ) ), makeKeyword(
                                    "SUPPORT-MODULE" ), makeKeyword( "TIME" ), makeKeyword( "DOCUMENTATION" ), makeString( "(#$temporallyDisjoint <TemporalThing> <not-fully-bound>)" )
    } );
    $kw136$ALL_TEMPORALLY_DISJOINT_POS = makeKeyword( "ALL-TEMPORALLY-DISJOINT-POS" );
    $list137 = ConsesLow.list( makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "temporallyDisjoint" ) ), makeKeyword(
        "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "temporallyDisjoint" ) ), makeKeyword( "ANYTHING" ), makeKeyword( "NOT-FULLY-BOUND" ) ), makeKeyword(
            "PREFERENCE-LEVEL" ), makeKeyword( "GROSSLY-DISPREFERRED" ) );
    $kw138$REMOVAL_ALL_TEMPORALLY_DISJOINT_INVERSE = makeKeyword( "REMOVAL-ALL-TEMPORALLY-DISJOINT-INVERSE" );
    $list139 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "temporallyDisjoint" ) ), makeKeyword(
        "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "temporallyDisjoint" ) ), makeKeyword( "NOT-FULLY-BOUND" ), ConsesLow.list( makeKeyword( "TEST" ), makeSymbol(
            "SBHL-TIME-INFERENCE-ARG-P" ) ) ), makeKeyword( "COST-EXPRESSION" ), makeSymbol( "*DEFAULT-ALL-TEMPORAL-RELATION-COST*" ), makeKeyword( "COMPLETENESS" ), makeKeyword( "GROSSLY-INCOMPLETE" ), makeKeyword(
                "INPUT-EXTRACT-PATTERN" ), ConsesLow.list( makeKeyword( "TEMPLATE" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "temporallyDisjoint" ) ), makeKeyword( "ANYTHING" ),
                    ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "TEMPORAL-THING" ) ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "TEMPORAL-THING" ) ) ), makeKeyword( "INPUT-ENCODE-PATTERN" ), ConsesLow
                        .list( makeKeyword( "CALL" ), makeSymbol( "POSSIBLY-BIND-TEMPORAL-INDEXICAL-IN-OBJECT" ), makeKeyword( "INPUT" ) ), makeKeyword( "OUTPUT-GENERATE-PATTERN" ), ConsesLow.list( makeKeyword( "CALL" ),
                            makeSymbol( "REMOVAL-ALL-TEMPORALLY-DISJOINT-OUTPUT-GENERATE" ), makeKeyword( "INPUT" ) ), makeKeyword( "OUTPUT-CONSTRUCT-PATTERN" ), ConsesLow.list( constant_handles
                                .reader_make_constant_shell( makeString( "temporallyDisjoint" ) ), makeKeyword( "INPUT" ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "TEMPORAL-THING" ) ) ), makeKeyword(
                                    "SUPPORT-MODULE" ), makeKeyword( "TIME" ), makeKeyword( "DOCUMENTATION" ), makeString( "(#$temporallyDisjoint <not-fully-bound> <TemporalThing>)" )
    } );
    $kw140$ALL_TEMPORALLY_DISJOINT_INVERSE_POS = makeKeyword( "ALL-TEMPORALLY-DISJOINT-INVERSE-POS" );
    $list141 = ConsesLow.list( makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "temporallyDisjoint" ) ), makeKeyword(
        "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "temporallyDisjoint" ) ), makeKeyword( "NOT-FULLY-BOUND" ), makeKeyword( "ANYTHING" ) ), makeKeyword(
            "PREFERENCE-LEVEL" ), makeKeyword( "GROSSLY-DISPREFERRED" ) );
    $kw142$REMOVAL_NOT_TEMPORALLY_DISJOINT = makeKeyword( "REMOVAL-NOT-TEMPORALLY-DISJOINT" );
    $list143 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "NEG" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "temporallyDisjoint" ) ), makeKeyword(
        "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "temporallyDisjoint" ) ), ConsesLow.list( makeKeyword( "TEST" ), makeSymbol( "SBHL-TIME-INFERENCE-ARG-P" ) ),
            ConsesLow.list( makeKeyword( "TEST" ), makeSymbol( "SBHL-TIME-INFERENCE-ARG-P" ) ) ), makeKeyword( "COST-EXPRESSION" ), makeSymbol( "*DEFAULT-NOT-TEMPORAL-RELATION-CHECK-COST*" ), makeKeyword( "EXPAND" ),
      makeSymbol( "REMOVAL-NOT-TEMPORALLY-DISJOINT-EXPAND" )
    } );
    $const144$temporalBoundsContain = constant_handles.reader_make_constant_shell( makeString( "temporalBoundsContain" ) );
    $kw145$REMOVAL_TEMPORAL_BOUNDS_CONTAIN = makeKeyword( "REMOVAL-TEMPORAL-BOUNDS-CONTAIN" );
    $list146 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "temporalBoundsContain" ) ),
      makeKeyword( "CHECK" ), T, makeKeyword( "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "temporalBoundsContain" ) ), ConsesLow.list( makeKeyword( "TEST" ), makeSymbol(
          "SBHL-TIME-INFERENCE-ARG-P" ) ), ConsesLow.list( makeKeyword( "TEST" ), makeSymbol( "SBHL-TIME-INFERENCE-ARG-P" ) ) ), makeKeyword( "COST-EXPRESSION" ), makeSymbol( "*DEFAULT-TEMPORAL-RELATION-CHECK-COST*" ),
      makeKeyword( "INPUT-EXTRACT-PATTERN" ), ConsesLow.list( makeKeyword( "TEMPLATE" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "temporalBoundsContain" ) ), ConsesLow.list( makeKeyword(
          "BIND" ), makeSymbol( "TEMPORAL-THING1" ) ), ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "TEMPORAL-THING2" ) ) ), ConsesLow.list( ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol(
              "TEMPORAL-THING1" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "TEMPORAL-THING2" ) ) ) ), makeKeyword( "INPUT-ENCODE-PATTERN" ), ConsesLow.list( makeKeyword( "TUPLE" ), ConsesLow.list(
                  makeSymbol( "TEMPORAL-THING1" ), makeSymbol( "TEMPORAL-THING2" ) ), ConsesLow.list( ConsesLow.list( makeKeyword( "CALL" ), makeSymbol( "POSSIBLY-BIND-TEMPORAL-INDEXICAL-IN-OBJECT" ), ConsesLow.list(
                      makeKeyword( "VALUE" ), makeSymbol( "TEMPORAL-THING1" ) ) ), ConsesLow.list( makeKeyword( "CALL" ), makeSymbol( "POSSIBLY-BIND-TEMPORAL-INDEXICAL-IN-OBJECT" ), ConsesLow.list( makeKeyword(
                          "VALUE" ), makeSymbol( "TEMPORAL-THING2" ) ) ) ) ), makeKeyword( "OUTPUT-CHECK-PATTERN" ), ConsesLow.list( makeKeyword( "TUPLE" ), ConsesLow.list( makeSymbol( "TEMPORAL-THING1" ), makeSymbol(
                              "TEMPORAL-THING2" ) ), ConsesLow.list( makeKeyword( "CALL" ), makeSymbol( "TEMPORAL-BOUNDS-CONTAIN?" ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "TEMPORAL-THING1" ) ), ConsesLow
                                  .list( makeKeyword( "VALUE" ), makeSymbol( "TEMPORAL-THING2" ) ) ) ), makeKeyword( "SUPPORT-MODULE" ), makeKeyword( "TIME" ), makeKeyword( "DOCUMENTATION" ), makeString(
                                      "(#$temporalBoundsContain <TemporalThing> <TemporalThing>)" )
    } );
    $sym147$REMOVAL_ALL_TEMPORAL_BOUNDS_CONTAIN_OUTPUT_GENERATE = makeSymbol( "REMOVAL-ALL-TEMPORAL-BOUNDS-CONTAIN-OUTPUT-GENERATE" );
    $kw148$REMOVAL_ALL_TEMPORAL_BOUNDS_CONTAIN = makeKeyword( "REMOVAL-ALL-TEMPORAL-BOUNDS-CONTAIN" );
    $list149 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "temporalBoundsContain" ) ),
      makeKeyword( "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "temporalBoundsContain" ) ), ConsesLow.list( makeKeyword( "TEST" ), makeSymbol(
          "SBHL-TIME-INFERENCE-ARG-P" ) ), makeKeyword( "NOT-FULLY-BOUND" ) ), makeKeyword( "COST-EXPRESSION" ), makeSymbol( "*DEFAULT-ALL-TEMPORAL-RELATION-COST*" ), makeKeyword( "COMPLETENESS" ), makeKeyword(
              "GROSSLY-INCOMPLETE" ), makeKeyword( "INPUT-EXTRACT-PATTERN" ), ConsesLow.list( makeKeyword( "TEMPLATE" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
                  "temporalBoundsContain" ) ), ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "TEMPORAL-THING" ) ), makeKeyword( "ANYTHING" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol(
                      "TEMPORAL-THING" ) ) ), makeKeyword( "INPUT-ENCODE-PATTERN" ), ConsesLow.list( makeKeyword( "CALL" ), makeSymbol( "POSSIBLY-BIND-TEMPORAL-INDEXICAL-IN-OBJECT" ), makeKeyword( "INPUT" ) ),
      makeKeyword( "OUTPUT-GENERATE-PATTERN" ), ConsesLow.list( makeKeyword( "CALL" ), makeSymbol( "REMOVAL-ALL-TEMPORAL-BOUNDS-CONTAIN-OUTPUT-GENERATE" ), makeKeyword( "INPUT" ) ), makeKeyword(
          "OUTPUT-CONSTRUCT-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "temporalBoundsContain" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "TEMPORAL-THING" ) ),
              makeKeyword( "INPUT" ) ), makeKeyword( "SUPPORT-MODULE" ), makeKeyword( "TIME" ), makeKeyword( "DOCUMENTATION" ), makeString( "(#$temporalBoundsContain <TemporalThing> <not-fully-bound>)" )
    } );
    $kw150$ALL_TEMPORAL_BOUNDS_CONTAIN_POS = makeKeyword( "ALL-TEMPORAL-BOUNDS-CONTAIN-POS" );
    $list151 = ConsesLow.list( makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "temporalBoundsContain" ) ), makeKeyword(
        "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "temporalBoundsContain" ) ), makeKeyword( "ANYTHING" ), makeKeyword( "NOT-FULLY-BOUND" ) ), makeKeyword(
            "PREFERENCE-LEVEL" ), makeKeyword( "GROSSLY-DISPREFERRED" ) );
    $sym152$REMOVAL_ALL_TEMPORAL_BOUNDS_CONTAIN_INVERSE_OUTPUT_GENERATE = makeSymbol( "REMOVAL-ALL-TEMPORAL-BOUNDS-CONTAIN-INVERSE-OUTPUT-GENERATE" );
    $kw153$REMOVAL_ALL_TEMPORAL_BOUNDS_CONTAIN_INVERSE = makeKeyword( "REMOVAL-ALL-TEMPORAL-BOUNDS-CONTAIN-INVERSE" );
    $list154 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "temporalBoundsContain" ) ),
      makeKeyword( "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "temporalBoundsContain" ) ), makeKeyword( "NOT-FULLY-BOUND" ), ConsesLow.list( makeKeyword( "TEST" ),
          makeSymbol( "SBHL-TIME-INFERENCE-ARG-P" ) ) ), makeKeyword( "COST-EXPRESSION" ), makeSymbol( "*DEFAULT-ALL-TEMPORAL-RELATION-INVERSE-COST*" ), makeKeyword( "COMPLETENESS" ), makeKeyword( "GROSSLY-INCOMPLETE" ),
      makeKeyword( "INPUT-EXTRACT-PATTERN" ), ConsesLow.list( makeKeyword( "TEMPLATE" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "temporalBoundsContain" ) ), makeKeyword( "ANYTHING" ),
          ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "TEMPORAL-THING" ) ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "TEMPORAL-THING" ) ) ), makeKeyword( "INPUT-ENCODE-PATTERN" ), ConsesLow.list(
              makeKeyword( "CALL" ), makeSymbol( "POSSIBLY-BIND-TEMPORAL-INDEXICAL-IN-OBJECT" ), makeKeyword( "INPUT" ) ), makeKeyword( "OUTPUT-GENERATE-PATTERN" ), ConsesLow.list( makeKeyword( "CALL" ), makeSymbol(
                  "REMOVAL-ALL-TEMPORAL-BOUNDS-CONTAIN-INVERSE-OUTPUT-GENERATE" ), makeKeyword( "INPUT" ) ), makeKeyword( "OUTPUT-CONSTRUCT-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell(
                      makeString( "temporalBoundsContain" ) ), makeKeyword( "INPUT" ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "TEMPORAL-THING" ) ) ), makeKeyword( "SUPPORT-MODULE" ), makeKeyword( "TIME" ),
      makeKeyword( "DOCUMENTATION" ), makeString( "(#$temporalBoundsContain <not-fully-bound> <TemporalThing>)" )
    } );
    $kw155$ALL_TEMPORAL_BOUNDS_CONTAIN_INVERSE_POS = makeKeyword( "ALL-TEMPORAL-BOUNDS-CONTAIN-INVERSE-POS" );
    $list156 = ConsesLow.list( makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "temporalBoundsContain" ) ), makeKeyword(
        "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "temporalBoundsContain" ) ), makeKeyword( "NOT-FULLY-BOUND" ), makeKeyword( "ANYTHING" ) ), makeKeyword(
            "PREFERENCE-LEVEL" ), makeKeyword( "GROSSLY-DISPREFERRED" ) );
    $kw157$REMOVAL_NOT_TEMPORAL_BOUNDS_CONTAIN = makeKeyword( "REMOVAL-NOT-TEMPORAL-BOUNDS-CONTAIN" );
    $list158 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "NEG" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "temporalBoundsContain" ) ),
      makeKeyword( "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "temporalBoundsContain" ) ), ConsesLow.list( makeKeyword( "TEST" ), makeSymbol(
          "SBHL-TIME-INFERENCE-ARG-P" ) ), ConsesLow.list( makeKeyword( "TEST" ), makeSymbol( "SBHL-TIME-INFERENCE-ARG-P" ) ) ), makeKeyword( "COST-EXPRESSION" ), makeSymbol(
              "*DEFAULT-NOT-TEMPORAL-RELATION-CHECK-COST*" ), makeKeyword( "EXPAND" ), makeSymbol( "REMOVAL-NOT-TEMPORAL-BOUNDS-CONTAIN-EXPAND" )
    } );
    $const159$temporalBoundsSubsume = constant_handles.reader_make_constant_shell( makeString( "temporalBoundsSubsume" ) );
    $kw160$REMOVAL_TEMPORAL_BOUNDS_SUBSUME = makeKeyword( "REMOVAL-TEMPORAL-BOUNDS-SUBSUME" );
    $list161 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "temporalBoundsSubsume" ) ),
      makeKeyword( "CHECK" ), T, makeKeyword( "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "temporalBoundsSubsume" ) ), ConsesLow.list( makeKeyword( "TEST" ), makeSymbol(
          "SBHL-TIME-INFERENCE-ARG-P" ) ), ConsesLow.list( makeKeyword( "TEST" ), makeSymbol( "SBHL-TIME-INFERENCE-ARG-P" ) ) ), makeKeyword( "COST-EXPRESSION" ), makeSymbol( "*DEFAULT-TEMPORAL-RELATION-CHECK-COST*" ),
      makeKeyword( "INPUT-EXTRACT-PATTERN" ), ConsesLow.list( makeKeyword( "TEMPLATE" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "temporalBoundsSubsume" ) ), ConsesLow.list( makeKeyword(
          "BIND" ), makeSymbol( "TEMPORAL-THING1" ) ), ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "TEMPORAL-THING2" ) ) ), ConsesLow.list( ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol(
              "TEMPORAL-THING1" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "TEMPORAL-THING2" ) ) ) ), makeKeyword( "INPUT-ENCODE-PATTERN" ), ConsesLow.list( makeKeyword( "TUPLE" ), ConsesLow.list(
                  makeSymbol( "TEMPORAL-THING1" ), makeSymbol( "TEMPORAL-THING2" ) ), ConsesLow.list( ConsesLow.list( makeKeyword( "CALL" ), makeSymbol( "POSSIBLY-BIND-TEMPORAL-INDEXICAL-IN-OBJECT" ), ConsesLow.list(
                      makeKeyword( "VALUE" ), makeSymbol( "TEMPORAL-THING1" ) ) ), ConsesLow.list( makeKeyword( "CALL" ), makeSymbol( "POSSIBLY-BIND-TEMPORAL-INDEXICAL-IN-OBJECT" ), ConsesLow.list( makeKeyword(
                          "VALUE" ), makeSymbol( "TEMPORAL-THING2" ) ) ) ) ), makeKeyword( "OUTPUT-CHECK-PATTERN" ), ConsesLow.list( makeKeyword( "TUPLE" ), ConsesLow.list( makeSymbol( "TEMPORAL-THING1" ), makeSymbol(
                              "TEMPORAL-THING2" ) ), ConsesLow.list( makeKeyword( "CALL" ), makeSymbol( "TEMPORAL-BOUNDS-SUBSUME?" ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "TEMPORAL-THING1" ) ), ConsesLow
                                  .list( makeKeyword( "VALUE" ), makeSymbol( "TEMPORAL-THING2" ) ) ) ), makeKeyword( "SUPPORT-MODULE" ), makeKeyword( "TIME" ), makeKeyword( "DOCUMENTATION" ), makeString(
                                      "(#$temporalBoundsSubsume <TemporalThing> <TemporalThing>)" )
    } );
    $sym162$REMOVAL_ALL_TEMPORAL_BOUNDS_SUBSUME_OUTPUT_GENERATE = makeSymbol( "REMOVAL-ALL-TEMPORAL-BOUNDS-SUBSUME-OUTPUT-GENERATE" );
    $kw163$REMOVAL_ALL_TEMPORAL_BOUNDS_SUBSUME = makeKeyword( "REMOVAL-ALL-TEMPORAL-BOUNDS-SUBSUME" );
    $list164 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "temporalBoundsSubsume" ) ),
      makeKeyword( "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "temporalBoundsSubsume" ) ), ConsesLow.list( makeKeyword( "TEST" ), makeSymbol(
          "SBHL-TIME-INFERENCE-ARG-P" ) ), makeKeyword( "NOT-FULLY-BOUND" ) ), makeKeyword( "COST-EXPRESSION" ), makeSymbol( "*DEFAULT-ALL-TEMPORAL-RELATION-COST*" ), makeKeyword( "COMPLETENESS" ), makeKeyword(
              "GROSSLY-INCOMPLETE" ), makeKeyword( "INPUT-EXTRACT-PATTERN" ), ConsesLow.list( makeKeyword( "TEMPLATE" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
                  "temporalBoundsSubsume" ) ), ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "TEMPORAL-THING" ) ), makeKeyword( "ANYTHING" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol(
                      "TEMPORAL-THING" ) ) ), makeKeyword( "INPUT-ENCODE-PATTERN" ), ConsesLow.list( makeKeyword( "CALL" ), makeSymbol( "POSSIBLY-BIND-TEMPORAL-INDEXICAL-IN-OBJECT" ), makeKeyword( "INPUT" ) ),
      makeKeyword( "OUTPUT-GENERATE-PATTERN" ), ConsesLow.list( makeKeyword( "CALL" ), makeSymbol( "REMOVAL-ALL-TEMPORAL-BOUNDS-SUBSUME-OUTPUT-GENERATE" ), makeKeyword( "INPUT" ) ), makeKeyword(
          "OUTPUT-CONSTRUCT-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "temporalBoundsSubsume" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "TEMPORAL-THING" ) ),
              makeKeyword( "INPUT" ) ), makeKeyword( "SUPPORT-MODULE" ), makeKeyword( "TIME" ), makeKeyword( "DOCUMENTATION" ), makeString( "(#$temporalBoundsSubsume <TemporalThing> <not-fully-bound>)" )
    } );
    $kw165$ALL_TEMPORAL_BOUNDS_SUBSUME_POS = makeKeyword( "ALL-TEMPORAL-BOUNDS-SUBSUME-POS" );
    $list166 = ConsesLow.list( makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "temporalBoundsSubsume" ) ), makeKeyword(
        "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "temporalBoundsSubsume" ) ), makeKeyword( "ANYTHING" ), makeKeyword( "NOT-FULLY-BOUND" ) ), makeKeyword(
            "PREFERENCE-LEVEL" ), makeKeyword( "GROSSLY-DISPREFERRED" ) );
    $sym167$REMOVAL_ALL_TEMPORAL_BOUNDS_SUBSUME_INVERSE_OUTPUT_GENERATE = makeSymbol( "REMOVAL-ALL-TEMPORAL-BOUNDS-SUBSUME-INVERSE-OUTPUT-GENERATE" );
    $kw168$REMOVAL_ALL_TEMPORAL_BOUNDS_SUBSUME_INVERSE = makeKeyword( "REMOVAL-ALL-TEMPORAL-BOUNDS-SUBSUME-INVERSE" );
    $list169 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "temporalBoundsSubsume" ) ),
      makeKeyword( "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "temporalBoundsSubsume" ) ), makeKeyword( "NOT-FULLY-BOUND" ), ConsesLow.list( makeKeyword( "TEST" ),
          makeSymbol( "SBHL-TIME-INFERENCE-ARG-P" ) ) ), makeKeyword( "COST-EXPRESSION" ), makeSymbol( "*DEFAULT-ALL-TEMPORAL-RELATION-INVERSE-COST*" ), makeKeyword( "COMPLETENESS" ), makeKeyword( "GROSSLY-INCOMPLETE" ),
      makeKeyword( "INPUT-EXTRACT-PATTERN" ), ConsesLow.list( makeKeyword( "TEMPLATE" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "temporalBoundsSubsume" ) ), makeKeyword( "ANYTHING" ),
          ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "TEMPORAL-THING" ) ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "TEMPORAL-THING" ) ) ), makeKeyword( "INPUT-ENCODE-PATTERN" ), ConsesLow.list(
              makeKeyword( "CALL" ), makeSymbol( "POSSIBLY-BIND-TEMPORAL-INDEXICAL-IN-OBJECT" ), makeKeyword( "INPUT" ) ), makeKeyword( "OUTPUT-GENERATE-PATTERN" ), ConsesLow.list( makeKeyword( "CALL" ), makeSymbol(
                  "REMOVAL-ALL-TEMPORAL-BOUNDS-SUBSUME-INVERSE-OUTPUT-GENERATE" ), makeKeyword( "INPUT" ) ), makeKeyword( "OUTPUT-CONSTRUCT-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell(
                      makeString( "temporalBoundsSubsume" ) ), makeKeyword( "INPUT" ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "TEMPORAL-THING" ) ) ), makeKeyword( "SUPPORT-MODULE" ), makeKeyword( "TIME" ),
      makeKeyword( "DOCUMENTATION" ), makeString( "(#$temporalBoundsSubsume <not-fully-bound> <TemporalThing>)" )
    } );
    $kw170$ALL_TEMPORAL_BOUNDS_SUBSUME_INVERSE_POS = makeKeyword( "ALL-TEMPORAL-BOUNDS-SUBSUME-INVERSE-POS" );
    $list171 = ConsesLow.list( makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "temporalBoundsSubsume" ) ), makeKeyword(
        "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "temporalBoundsSubsume" ) ), makeKeyword( "NOT-FULLY-BOUND" ), makeKeyword( "ANYTHING" ) ), makeKeyword(
            "PREFERENCE-LEVEL" ), makeKeyword( "GROSSLY-DISPREFERRED" ) );
    $kw172$REMOVAL_NOT_TEMPORAL_BOUNDS_SUBSUME = makeKeyword( "REMOVAL-NOT-TEMPORAL-BOUNDS-SUBSUME" );
    $list173 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "NEG" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "temporalBoundsSubsume" ) ),
      makeKeyword( "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "temporalBoundsSubsume" ) ), ConsesLow.list( makeKeyword( "TEST" ), makeSymbol(
          "SBHL-TIME-INFERENCE-ARG-P" ) ), ConsesLow.list( makeKeyword( "TEST" ), makeSymbol( "SBHL-TIME-INFERENCE-ARG-P" ) ) ), makeKeyword( "COST-EXPRESSION" ), makeSymbol(
              "*DEFAULT-NOT-TEMPORAL-RELATION-CHECK-COST*" ), makeKeyword( "EXPAND" ), makeSymbol( "REMOVAL-NOT-TEMPORAL-BOUNDS-SUBSUME-EXPAND" )
    } );
    $const174$temporalBoundsIdentical = constant_handles.reader_make_constant_shell( makeString( "temporalBoundsIdentical" ) );
    $kw175$REMOVAL_TEMPORAL_BOUNDS_IDENTICAL = makeKeyword( "REMOVAL-TEMPORAL-BOUNDS-IDENTICAL" );
    $list176 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "temporalBoundsIdentical" ) ),
      makeKeyword( "CHECK" ), T, makeKeyword( "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "temporalBoundsIdentical" ) ), ConsesLow.list( makeKeyword( "TEST" ),
          makeSymbol( "SBHL-TIME-INFERENCE-ARG-P" ) ), ConsesLow.list( makeKeyword( "TEST" ), makeSymbol( "SBHL-TIME-INFERENCE-ARG-P" ) ) ), makeKeyword( "COST-EXPRESSION" ), makeSymbol(
              "*DEFAULT-TEMPORAL-RELATION-CHECK-COST*" ), makeKeyword( "INPUT-EXTRACT-PATTERN" ), ConsesLow.list( makeKeyword( "TEMPLATE" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
                  "temporalBoundsIdentical" ) ), ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "TEMPORAL-THING1" ) ), ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "TEMPORAL-THING2" ) ) ), ConsesLow.list(
                      ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "TEMPORAL-THING1" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "TEMPORAL-THING2" ) ) ) ), makeKeyword( "INPUT-ENCODE-PATTERN" ),
      ConsesLow.list( makeKeyword( "TUPLE" ), ConsesLow.list( makeSymbol( "TEMPORAL-THING1" ), makeSymbol( "TEMPORAL-THING2" ) ), ConsesLow.list( ConsesLow.list( makeKeyword( "CALL" ), makeSymbol(
          "POSSIBLY-BIND-TEMPORAL-INDEXICAL-IN-OBJECT" ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "TEMPORAL-THING1" ) ) ), ConsesLow.list( makeKeyword( "CALL" ), makeSymbol(
              "POSSIBLY-BIND-TEMPORAL-INDEXICAL-IN-OBJECT" ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "TEMPORAL-THING2" ) ) ) ) ), makeKeyword( "OUTPUT-CHECK-PATTERN" ), ConsesLow.list( makeKeyword(
                  "TUPLE" ), ConsesLow.list( makeSymbol( "TEMPORAL-THING1" ), makeSymbol( "TEMPORAL-THING2" ) ), ConsesLow.list( makeKeyword( "CALL" ), makeSymbol( "TEMPORAL-BOUNDS-IDENTICAL?" ), ConsesLow.list(
                      makeKeyword( "VALUE" ), makeSymbol( "TEMPORAL-THING1" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "TEMPORAL-THING2" ) ) ) ), makeKeyword( "SUPPORT-MODULE" ), makeKeyword( "TIME" ),
      makeKeyword( "DOCUMENTATION" ), makeString( "(#$temporalBoundsIdentical <TemporalThing> <TemporalThing>)" )
    } );
    $sym177$REMOVAL_ALL_TEMPORAL_BOUNDS_IDENTICAL_OUTPUT_GENERATE = makeSymbol( "REMOVAL-ALL-TEMPORAL-BOUNDS-IDENTICAL-OUTPUT-GENERATE" );
    $kw178$REMOVAL_ALL_TEMPORAL_BOUNDS_IDENTICAL = makeKeyword( "REMOVAL-ALL-TEMPORAL-BOUNDS-IDENTICAL" );
    $list179 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "temporalBoundsIdentical" ) ),
      makeKeyword( "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "temporalBoundsIdentical" ) ), ConsesLow.list( makeKeyword( "TEST" ), makeSymbol(
          "SBHL-TIME-INFERENCE-ARG-P" ) ), makeKeyword( "NOT-FULLY-BOUND" ) ), makeKeyword( "COST-EXPRESSION" ), makeSymbol( "*DEFAULT-ALL-TEMPORAL-RELATION-COST*" ), makeKeyword( "COMPLETENESS" ), makeKeyword(
              "GROSSLY-INCOMPLETE" ), makeKeyword( "INPUT-EXTRACT-PATTERN" ), ConsesLow.list( makeKeyword( "TEMPLATE" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
                  "temporalBoundsIdentical" ) ), ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "TEMPORAL-THING" ) ), makeKeyword( "ANYTHING" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol(
                      "TEMPORAL-THING" ) ) ), makeKeyword( "INPUT-ENCODE-PATTERN" ), ConsesLow.list( makeKeyword( "CALL" ), makeSymbol( "POSSIBLY-BIND-TEMPORAL-INDEXICAL-IN-OBJECT" ), makeKeyword( "INPUT" ) ),
      makeKeyword( "OUTPUT-GENERATE-PATTERN" ), ConsesLow.list( makeKeyword( "CALL" ), makeSymbol( "REMOVAL-ALL-TEMPORAL-BOUNDS-IDENTICAL-OUTPUT-GENERATE" ), makeKeyword( "INPUT" ) ), makeKeyword(
          "OUTPUT-CONSTRUCT-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "temporalBoundsIdentical" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "TEMPORAL-THING" ) ),
              makeKeyword( "INPUT" ) ), makeKeyword( "SUPPORT-MODULE" ), makeKeyword( "TIME" ), makeKeyword( "DOCUMENTATION" ), makeString( "(#$temporalBoundsIdentical <TemporalThing> <not-fully-bound>)" )
    } );
    $kw180$ALL_TEMPORAL_BOUNDS_IDENTICAL_POS = makeKeyword( "ALL-TEMPORAL-BOUNDS-IDENTICAL-POS" );
    $list181 = ConsesLow.list( makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "temporalBoundsIdentical" ) ), makeKeyword(
        "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "temporalBoundsIdentical" ) ), makeKeyword( "ANYTHING" ), makeKeyword( "NOT-FULLY-BOUND" ) ), makeKeyword(
            "PREFERENCE-LEVEL" ), makeKeyword( "GROSSLY-DISPREFERRED" ) );
    $kw182$REMOVAL_ALL_TEMPORAL_BOUNDS_IDENTICAL_INVERSE = makeKeyword( "REMOVAL-ALL-TEMPORAL-BOUNDS-IDENTICAL-INVERSE" );
    $list183 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "temporalBoundsIdentical" ) ),
      makeKeyword( "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "temporalBoundsIdentical" ) ), makeKeyword( "NOT-FULLY-BOUND" ), ConsesLow.list( makeKeyword( "TEST" ),
          makeSymbol( "SBHL-TIME-INFERENCE-ARG-P" ) ) ), makeKeyword( "COST-EXPRESSION" ), makeSymbol( "*DEFAULT-ALL-TEMPORAL-RELATION-COST*" ), makeKeyword( "COMPLETENESS" ), makeKeyword( "GROSSLY-INCOMPLETE" ),
      makeKeyword( "INPUT-EXTRACT-PATTERN" ), ConsesLow.list( makeKeyword( "TEMPLATE" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "temporalBoundsIdentical" ) ), makeKeyword( "ANYTHING" ),
          ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "TEMPORAL-THING" ) ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "TEMPORAL-THING" ) ) ), makeKeyword( "INPUT-ENCODE-PATTERN" ), ConsesLow.list(
              makeKeyword( "CALL" ), makeSymbol( "POSSIBLY-BIND-TEMPORAL-INDEXICAL-IN-OBJECT" ), makeKeyword( "INPUT" ) ), makeKeyword( "OUTPUT-GENERATE-PATTERN" ), ConsesLow.list( makeKeyword( "CALL" ), makeSymbol(
                  "REMOVAL-ALL-TEMPORAL-BOUNDS-IDENTICAL-OUTPUT-GENERATE" ), makeKeyword( "INPUT" ) ), makeKeyword( "OUTPUT-CONSTRUCT-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
                      "temporalBoundsIdentical" ) ), makeKeyword( "INPUT" ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "TEMPORAL-THING" ) ) ), makeKeyword( "SUPPORT-MODULE" ), makeKeyword( "TIME" ),
      makeKeyword( "DOCUMENTATION" ), makeString( "(#$temporalBoundsIdentical <not-fully-bound> <TemporalThing>)" )
    } );
    $kw184$ALL_TEMPORAL_BOUNDS_IDENTICAL_INVERSE_POS = makeKeyword( "ALL-TEMPORAL-BOUNDS-IDENTICAL-INVERSE-POS" );
    $list185 = ConsesLow.list( makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "temporalBoundsIdentical" ) ), makeKeyword(
        "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "temporalBoundsIdentical" ) ), makeKeyword( "NOT-FULLY-BOUND" ), makeKeyword( "ANYTHING" ) ), makeKeyword(
            "PREFERENCE-LEVEL" ), makeKeyword( "GROSSLY-DISPREFERRED" ) );
    $kw186$REMOVAL_NOT_TEMPORAL_BOUNDS_IDENTICAL = makeKeyword( "REMOVAL-NOT-TEMPORAL-BOUNDS-IDENTICAL" );
    $list187 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "NEG" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "temporalBoundsIdentical" ) ),
      makeKeyword( "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "temporalBoundsIdentical" ) ), ConsesLow.list( makeKeyword( "TEST" ), makeSymbol(
          "SBHL-TIME-INFERENCE-ARG-P" ) ), ConsesLow.list( makeKeyword( "TEST" ), makeSymbol( "SBHL-TIME-INFERENCE-ARG-P" ) ) ), makeKeyword( "COST-EXPRESSION" ), makeSymbol(
              "*DEFAULT-NOT-TEMPORAL-RELATION-CHECK-COST*" ), makeKeyword( "EXPAND" ), makeSymbol( "REMOVAL-NOT-TEMPORAL-BOUNDS-IDENTICAL-EXPAND" )
    } );
    $const188$temporalBoundsIntersect = constant_handles.reader_make_constant_shell( makeString( "temporalBoundsIntersect" ) );
    $kw189$REMOVAL_TEMPORAL_BOUNDS_INTERSECT = makeKeyword( "REMOVAL-TEMPORAL-BOUNDS-INTERSECT" );
    $list190 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "temporalBoundsIntersect" ) ),
      makeKeyword( "CHECK" ), T, makeKeyword( "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "temporalBoundsIntersect" ) ), ConsesLow.list( makeKeyword( "TEST" ),
          makeSymbol( "SBHL-TIME-INFERENCE-ARG-P" ) ), ConsesLow.list( makeKeyword( "TEST" ), makeSymbol( "SBHL-TIME-INFERENCE-ARG-P" ) ) ), makeKeyword( "COST-EXPRESSION" ), makeSymbol(
              "*DEFAULT-TEMPORAL-RELATION-CHECK-COST*" ), makeKeyword( "INPUT-EXTRACT-PATTERN" ), ConsesLow.list( makeKeyword( "TEMPLATE" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
                  "temporalBoundsIntersect" ) ), ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "TEMPORAL-THING1" ) ), ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "TEMPORAL-THING2" ) ) ), ConsesLow.list(
                      ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "TEMPORAL-THING1" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "TEMPORAL-THING2" ) ) ) ), makeKeyword( "INPUT-ENCODE-PATTERN" ),
      ConsesLow.list( makeKeyword( "TUPLE" ), ConsesLow.list( makeSymbol( "TEMPORAL-THING1" ), makeSymbol( "TEMPORAL-THING2" ) ), ConsesLow.list( ConsesLow.list( makeKeyword( "CALL" ), makeSymbol(
          "POSSIBLY-BIND-TEMPORAL-INDEXICAL-IN-OBJECT" ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "TEMPORAL-THING1" ) ) ), ConsesLow.list( makeKeyword( "CALL" ), makeSymbol(
              "POSSIBLY-BIND-TEMPORAL-INDEXICAL-IN-OBJECT" ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "TEMPORAL-THING2" ) ) ) ) ), makeKeyword( "OUTPUT-CHECK-PATTERN" ), ConsesLow.list( makeKeyword(
                  "TUPLE" ), ConsesLow.list( makeSymbol( "TEMPORAL-THING1" ), makeSymbol( "TEMPORAL-THING2" ) ), ConsesLow.list( makeKeyword( "CALL" ), makeSymbol( "TEMPORAL-BOUNDS-INTERSECT?" ), ConsesLow.list(
                      makeKeyword( "VALUE" ), makeSymbol( "TEMPORAL-THING1" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "TEMPORAL-THING2" ) ) ) ), makeKeyword( "SUPPORT-MODULE" ), makeKeyword( "TIME" ),
      makeKeyword( "DOCUMENTATION" ), makeString( "(#$temporalBoundsIntersect <TemporalThing> <TemporalThing>)" )
    } );
    $sym191$REMOVAL_ALL_TEMPORAL_BOUNDS_INTERSECT_OUTPUT_GENERATE = makeSymbol( "REMOVAL-ALL-TEMPORAL-BOUNDS-INTERSECT-OUTPUT-GENERATE" );
    $kw192$REMOVAL_ALL_TEMPORAL_BOUNDS_INTERSECT = makeKeyword( "REMOVAL-ALL-TEMPORAL-BOUNDS-INTERSECT" );
    $list193 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "temporalBoundsIntersect" ) ),
      makeKeyword( "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "temporalBoundsIntersect" ) ), ConsesLow.list( makeKeyword( "TEST" ), makeSymbol(
          "SBHL-TIME-INFERENCE-ARG-P" ) ), makeKeyword( "NOT-FULLY-BOUND" ) ), makeKeyword( "COST-EXPRESSION" ), makeSymbol( "*DEFAULT-ALL-TEMPORAL-RELATION-COST*" ), makeKeyword( "COMPLETENESS" ), makeKeyword(
              "GROSSLY-INCOMPLETE" ), makeKeyword( "INPUT-EXTRACT-PATTERN" ), ConsesLow.list( makeKeyword( "TEMPLATE" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
                  "temporalBoundsIntersect" ) ), makeKeyword( "ANYTHING" ), ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "TEMPORAL-THING" ) ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol(
                      "TEMPORAL-THING" ) ) ), makeKeyword( "INPUT-ENCODE-PATTERN" ), ConsesLow.list( makeKeyword( "CALL" ), makeSymbol( "POSSIBLY-BIND-TEMPORAL-INDEXICAL-IN-OBJECT" ), makeKeyword( "INPUT" ) ),
      makeKeyword( "OUTPUT-GENERATE-PATTERN" ), ConsesLow.list( makeKeyword( "CALL" ), makeSymbol( "REMOVAL-ALL-TEMPORAL-BOUNDS-INTERSECT-OUTPUT-GENERATE" ), makeKeyword( "INPUT" ) ), makeKeyword(
          "OUTPUT-CONSTRUCT-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "temporalBoundsIntersect" ) ), makeKeyword( "INPUT" ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol(
              "TEMPORAL-THING" ) ) ), makeKeyword( "SUPPORT-MODULE" ), makeKeyword( "TIME" ), makeKeyword( "DOCUMENTATION" ), makeString( "(#$temporalBoundsIntersect <TemporalThing> <not-fully-bound>)" )
    } );
    $kw194$ALL_TEMPORAL_BOUNDS_INTERSECT_POS = makeKeyword( "ALL-TEMPORAL-BOUNDS-INTERSECT-POS" );
    $list195 = ConsesLow.list( makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "temporalBoundsIntersect" ) ), makeKeyword(
        "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "temporalBoundsIntersect" ) ), makeKeyword( "ANYTHING" ), makeKeyword( "NOT-FULLY-BOUND" ) ), makeKeyword(
            "PREFERENCE-LEVEL" ), makeKeyword( "GROSSLY-DISPREFERRED" ) );
    $kw196$REMOVAL_ALL_TEMPORAL_BOUNDS_INTERSECT_INVERSE = makeKeyword( "REMOVAL-ALL-TEMPORAL-BOUNDS-INTERSECT-INVERSE" );
    $list197 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "temporalBoundsIntersect" ) ),
      makeKeyword( "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "temporalBoundsIntersect" ) ), makeKeyword( "NOT-FULLY-BOUND" ), ConsesLow.list( makeKeyword( "TEST" ),
          makeSymbol( "SBHL-TIME-INFERENCE-ARG-P" ) ) ), makeKeyword( "COST-EXPRESSION" ), makeSymbol( "*DEFAULT-ALL-TEMPORAL-RELATION-COST*" ), makeKeyword( "COMPLETENESS" ), makeKeyword( "GROSSLY-INCOMPLETE" ),
      makeKeyword( "INPUT-EXTRACT-PATTERN" ), ConsesLow.list( makeKeyword( "TEMPLATE" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "temporalBoundsIntersect" ) ), makeKeyword( "ANYTHING" ),
          ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "TEMPORAL-THING" ) ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "TEMPORAL-THING" ) ) ), makeKeyword( "INPUT-ENCODE-PATTERN" ), ConsesLow.list(
              makeKeyword( "CALL" ), makeSymbol( "POSSIBLY-BIND-TEMPORAL-INDEXICAL-IN-OBJECT" ), makeKeyword( "INPUT" ) ), makeKeyword( "OUTPUT-GENERATE-PATTERN" ), ConsesLow.list( makeKeyword( "CALL" ), makeSymbol(
                  "REMOVAL-ALL-TEMPORAL-BOUNDS-INTERSECT-OUTPUT-GENERATE" ), makeKeyword( "INPUT" ) ), makeKeyword( "OUTPUT-CONSTRUCT-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
                      "temporalBoundsIntersect" ) ), makeKeyword( "INPUT" ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "TEMPORAL-THING" ) ) ), makeKeyword( "SUPPORT-MODULE" ), makeKeyword( "TIME" ),
      makeKeyword( "DOCUMENTATION" ), makeString( "(#$temporalBoundsIntersect <not-fully-bound> <TemporalThing>)" )
    } );
    $kw198$ALL_TEMPORAL_BOUNDS_INTERSECT_INVERSE_POS = makeKeyword( "ALL-TEMPORAL-BOUNDS-INTERSECT-INVERSE-POS" );
    $list199 = ConsesLow.list( makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "temporalBoundsIntersect" ) ), makeKeyword(
        "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "temporalBoundsIntersect" ) ), makeKeyword( "NOT-FULLY-BOUND" ), makeKeyword( "ANYTHING" ) ), makeKeyword(
            "PREFERENCE-LEVEL" ), makeKeyword( "GROSSLY-DISPREFERRED" ) );
    $kw200$REMOVAL_NOT_TEMPORAL_BOUNDS_INTERSECT = makeKeyword( "REMOVAL-NOT-TEMPORAL-BOUNDS-INTERSECT" );
    $list201 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "NEG" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "temporalBoundsIntersect" ) ),
      makeKeyword( "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "temporalBoundsIntersect" ) ), ConsesLow.list( makeKeyword( "TEST" ), makeSymbol(
          "SBHL-TIME-INFERENCE-ARG-P" ) ), ConsesLow.list( makeKeyword( "TEST" ), makeSymbol( "SBHL-TIME-INFERENCE-ARG-P" ) ) ), makeKeyword( "COST-EXPRESSION" ), makeSymbol(
              "*DEFAULT-NOT-TEMPORAL-RELATION-CHECK-COST*" ), makeKeyword( "EXPAND" ), makeSymbol( "REMOVAL-NOT-TEMPORAL-BOUNDS-INTERSECT-EXPAND" )
    } );
    $const202$temporallyCooriginating = constant_handles.reader_make_constant_shell( makeString( "temporallyCooriginating" ) );
    $kw203$REMOVAL_TEMPORALLY_COORIGINATING = makeKeyword( "REMOVAL-TEMPORALLY-COORIGINATING" );
    $list204 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "temporallyCooriginating" ) ),
      makeKeyword( "CHECK" ), T, makeKeyword( "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "temporallyCooriginating" ) ), ConsesLow.list( makeKeyword( "TEST" ),
          makeSymbol( "SBHL-TIME-INFERENCE-ARG-P" ) ), ConsesLow.list( makeKeyword( "TEST" ), makeSymbol( "SBHL-TIME-INFERENCE-ARG-P" ) ) ), makeKeyword( "COST-EXPRESSION" ), makeSymbol(
              "*DEFAULT-TEMPORAL-RELATION-CHECK-COST*" ), makeKeyword( "INPUT-EXTRACT-PATTERN" ), ConsesLow.list( makeKeyword( "TEMPLATE" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
                  "temporallyCooriginating" ) ), ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "TEMPORAL-THING1" ) ), ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "TEMPORAL-THING2" ) ) ), ConsesLow.list(
                      ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "TEMPORAL-THING1" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "TEMPORAL-THING2" ) ) ) ), makeKeyword( "INPUT-ENCODE-PATTERN" ),
      ConsesLow.list( makeKeyword( "TUPLE" ), ConsesLow.list( makeSymbol( "TEMPORAL-THING1" ), makeSymbol( "TEMPORAL-THING2" ) ), ConsesLow.list( ConsesLow.list( makeKeyword( "CALL" ), makeSymbol(
          "POSSIBLY-BIND-TEMPORAL-INDEXICAL-IN-OBJECT" ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "TEMPORAL-THING1" ) ) ), ConsesLow.list( makeKeyword( "CALL" ), makeSymbol(
              "POSSIBLY-BIND-TEMPORAL-INDEXICAL-IN-OBJECT" ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "TEMPORAL-THING2" ) ) ) ) ), makeKeyword( "OUTPUT-CHECK-PATTERN" ), ConsesLow.list( makeKeyword(
                  "TUPLE" ), ConsesLow.list( makeSymbol( "TEMPORAL-THING1" ), makeSymbol( "TEMPORAL-THING2" ) ), ConsesLow.list( makeKeyword( "CALL" ), makeSymbol( "TEMPORALLY-COORIGINATING?" ), ConsesLow.list(
                      makeKeyword( "VALUE" ), makeSymbol( "TEMPORAL-THING1" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "TEMPORAL-THING2" ) ) ) ), makeKeyword( "SUPPORT-MODULE" ), makeKeyword( "TIME" ),
      makeKeyword( "DOCUMENTATION" ), makeString( "(#$temporallyCooriginating <TemporalThing> <TemporalThing>)" )
    } );
    $sym205$REMOVAL_ALL_TEMPORALLY_COORIGINATING_OUTPUT_GENERATE = makeSymbol( "REMOVAL-ALL-TEMPORALLY-COORIGINATING-OUTPUT-GENERATE" );
    $kw206$REMOVAL_ALL_TEMPORALLY_COORIGINATING = makeKeyword( "REMOVAL-ALL-TEMPORALLY-COORIGINATING" );
    $list207 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "temporallyCooriginating" ) ),
      makeKeyword( "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "temporallyCooriginating" ) ), ConsesLow.list( makeKeyword( "TEST" ), makeSymbol(
          "SBHL-TIME-INFERENCE-ARG-P" ) ), makeKeyword( "NOT-FULLY-BOUND" ) ), makeKeyword( "COST-EXPRESSION" ), makeSymbol( "*DEFAULT-ALL-TEMPORAL-RELATION-COST*" ), makeKeyword( "COMPLETENESS" ), makeKeyword(
              "GROSSLY-INCOMPLETE" ), makeKeyword( "INPUT-EXTRACT-PATTERN" ), ConsesLow.list( makeKeyword( "TEMPLATE" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
                  "temporallyCooriginating" ) ), ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "TEMPORAL-THING" ) ), makeKeyword( "ANYTHING" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol(
                      "TEMPORAL-THING" ) ) ), makeKeyword( "INPUT-ENCODE-PATTERN" ), ConsesLow.list( makeKeyword( "CALL" ), makeSymbol( "POSSIBLY-BIND-TEMPORAL-INDEXICAL-IN-OBJECT" ), makeKeyword( "INPUT" ) ),
      makeKeyword( "OUTPUT-GENERATE-PATTERN" ), ConsesLow.list( makeKeyword( "CALL" ), makeSymbol( "REMOVAL-ALL-TEMPORALLY-COORIGINATING-OUTPUT-GENERATE" ), makeKeyword( "INPUT" ) ), makeKeyword(
          "OUTPUT-CONSTRUCT-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "temporallyCooriginating" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "TEMPORAL-THING" ) ),
              makeKeyword( "INPUT" ) ), makeKeyword( "SUPPORT-MODULE" ), makeKeyword( "TIME" ), makeKeyword( "DOCUMENTATION" ), makeString( "(#$temporallyCooriginating <TemporalThing> <not-fully-bound>" )
    } );
    $kw208$ALL_TEMPORALLY_COORIGINATING_POS = makeKeyword( "ALL-TEMPORALLY-COORIGINATING-POS" );
    $list209 = ConsesLow.list( makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "temporallyCooriginating" ) ), makeKeyword(
        "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "temporallyCooriginating" ) ), makeKeyword( "ANYTHING" ), makeKeyword( "NOT-FULLY-BOUND" ) ), makeKeyword(
            "PREFERENCE-LEVEL" ), makeKeyword( "GROSSLY-DISPREFERRED" ) );
    $kw210$REMOVAL_ALL_TEMPORALLY_COORIGINATING_INVERSE = makeKeyword( "REMOVAL-ALL-TEMPORALLY-COORIGINATING-INVERSE" );
    $list211 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "temporallyCooriginating" ) ),
      makeKeyword( "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "temporallyCooriginating" ) ), makeKeyword( "NOT-FULLY-BOUND" ), ConsesLow.list( makeKeyword( "TEST" ),
          makeSymbol( "SBHL-TIME-INFERENCE-ARG-P" ) ) ), makeKeyword( "COST-EXPRESSION" ), makeSymbol( "*DEFAULT-ALL-TEMPORAL-RELATION-COST*" ), makeKeyword( "COMPLETENESS" ), makeKeyword( "GROSSLY-INCOMPLETE" ),
      makeKeyword( "INPUT-EXTRACT-PATTERN" ), ConsesLow.list( makeKeyword( "TEMPLATE" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "temporallyCooriginating" ) ), makeKeyword( "ANYTHING" ),
          ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "TEMPORAL-THING" ) ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "TEMPORAL-THING" ) ) ), makeKeyword( "INPUT-ENCODE-PATTERN" ), ConsesLow.list(
              makeKeyword( "CALL" ), makeSymbol( "POSSIBLY-BIND-TEMPORAL-INDEXICAL-IN-OBJECT" ), makeKeyword( "INPUT" ) ), makeKeyword( "OUTPUT-GENERATE-PATTERN" ), ConsesLow.list( makeKeyword( "CALL" ), makeSymbol(
                  "REMOVAL-ALL-TEMPORALLY-COORIGINATING-OUTPUT-GENERATE" ), makeKeyword( "INPUT" ) ), makeKeyword( "OUTPUT-CONSTRUCT-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
                      "temporallyCooriginating" ) ), makeKeyword( "INPUT" ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "TEMPORAL-THING" ) ) ), makeKeyword( "SUPPORT-MODULE" ), makeKeyword( "TIME" ),
      makeKeyword( "DOCUMENTATION" ), makeString( "(#$temporallyCooriginating <not-fully-bound> <TemporalThing>)" )
    } );
    $kw212$ALL_TEMPORALLY_COORIGINATING_INVERSE_POS = makeKeyword( "ALL-TEMPORALLY-COORIGINATING-INVERSE-POS" );
    $list213 = ConsesLow.list( makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "temporallyCooriginating" ) ), makeKeyword(
        "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "temporallyCooriginating" ) ), makeKeyword( "NOT-FULLY-BOUND" ), makeKeyword( "ANYTHING" ) ), makeKeyword(
            "PREFERENCE-LEVEL" ), makeKeyword( "GROSSLY-DISPREFERRED" ) );
    $kw214$REMOVAL_NOT_TEMPORALLY_COORIGINATING = makeKeyword( "REMOVAL-NOT-TEMPORALLY-COORIGINATING" );
    $list215 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "NEG" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "temporallyCooriginating" ) ),
      makeKeyword( "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "temporallyCooriginating" ) ), ConsesLow.list( makeKeyword( "TEST" ), makeSymbol(
          "SBHL-TIME-INFERENCE-ARG-P" ) ), ConsesLow.list( makeKeyword( "TEST" ), makeSymbol( "SBHL-TIME-INFERENCE-ARG-P" ) ) ), makeKeyword( "COST-EXPRESSION" ), makeSymbol(
              "*DEFAULT-NOT-TEMPORAL-RELATION-CHECK-COST*" ), makeKeyword( "EXPAND" ), makeSymbol( "REMOVAL-NOT-TEMPORALLY-COORIGINATING-EXPAND" )
    } );
    $const216$temporallyCoterminal = constant_handles.reader_make_constant_shell( makeString( "temporallyCoterminal" ) );
    $kw217$REMOVAL_TEMPORALLY_COTERMINAL = makeKeyword( "REMOVAL-TEMPORALLY-COTERMINAL" );
    $list218 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "temporallyCoterminal" ) ),
      makeKeyword( "CHECK" ), T, makeKeyword( "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "temporallyCoterminal" ) ), ConsesLow.list( makeKeyword( "TEST" ), makeSymbol(
          "SBHL-TIME-INFERENCE-ARG-P" ) ), ConsesLow.list( makeKeyword( "TEST" ), makeSymbol( "SBHL-TIME-INFERENCE-ARG-P" ) ) ), makeKeyword( "COST-EXPRESSION" ), makeSymbol( "*DEFAULT-TEMPORAL-RELATION-CHECK-COST*" ),
      makeKeyword( "INPUT-EXTRACT-PATTERN" ), ConsesLow.list( makeKeyword( "TEMPLATE" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "temporallyCoterminal" ) ), ConsesLow.list( makeKeyword(
          "BIND" ), makeSymbol( "TEMPORAL-THING1" ) ), ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "TEMPORAL-THING2" ) ) ), ConsesLow.list( ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol(
              "TEMPORAL-THING1" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "TEMPORAL-THING2" ) ) ) ), makeKeyword( "INPUT-ENCODE-PATTERN" ), ConsesLow.list( makeKeyword( "TUPLE" ), ConsesLow.list(
                  makeSymbol( "TEMPORAL-THING1" ), makeSymbol( "TEMPORAL-THING2" ) ), ConsesLow.list( ConsesLow.list( makeKeyword( "CALL" ), makeSymbol( "POSSIBLY-BIND-TEMPORAL-INDEXICAL-IN-OBJECT" ), ConsesLow.list(
                      makeKeyword( "VALUE" ), makeSymbol( "TEMPORAL-THING1" ) ) ), ConsesLow.list( makeKeyword( "CALL" ), makeSymbol( "POSSIBLY-BIND-TEMPORAL-INDEXICAL-IN-OBJECT" ), ConsesLow.list( makeKeyword(
                          "VALUE" ), makeSymbol( "TEMPORAL-THING2" ) ) ) ) ), makeKeyword( "OUTPUT-CHECK-PATTERN" ), ConsesLow.list( makeKeyword( "TUPLE" ), ConsesLow.list( makeSymbol( "TEMPORAL-THING1" ), makeSymbol(
                              "TEMPORAL-THING2" ) ), ConsesLow.list( makeKeyword( "CALL" ), makeSymbol( "TEMPORALLY-COTERMINAL?" ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "TEMPORAL-THING1" ) ), ConsesLow
                                  .list( makeKeyword( "VALUE" ), makeSymbol( "TEMPORAL-THING2" ) ) ) ), makeKeyword( "SUPPORT-MODULE" ), makeKeyword( "TIME" ), makeKeyword( "DOCUMENTATION" ), makeString(
                                      "(#$temporallyCoterminal <TemporalThing> <TemporalThing>)" )
    } );
    $sym219$REMOVAL_ALL_TEMPORALLY_COTERMINAL_OUTPUT_GENERATE = makeSymbol( "REMOVAL-ALL-TEMPORALLY-COTERMINAL-OUTPUT-GENERATE" );
    $kw220$REMOVAL_ALL_TEMPORALLY_COTERMINAL = makeKeyword( "REMOVAL-ALL-TEMPORALLY-COTERMINAL" );
    $list221 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "temporallyCoterminal" ) ),
      makeKeyword( "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "temporallyCoterminal" ) ), ConsesLow.list( makeKeyword( "TEST" ), makeSymbol(
          "SBHL-TIME-INFERENCE-ARG-P" ) ), makeKeyword( "NOT-FULLY-BOUND" ) ), makeKeyword( "COST-EXPRESSION" ), makeSymbol( "*DEFAULT-ALL-TEMPORAL-RELATION-COST*" ), makeKeyword( "COMPLETENESS" ), makeKeyword(
              "GROSSLY-INCOMPLETE" ), makeKeyword( "INPUT-EXTRACT-PATTERN" ), ConsesLow.list( makeKeyword( "TEMPLATE" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
                  "temporallyCoterminal" ) ), ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "TEMPORAL-THING" ) ), makeKeyword( "ANYTHING" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol(
                      "TEMPORAL-THING" ) ) ), makeKeyword( "INPUT-ENCODE-PATTERN" ), ConsesLow.list( makeKeyword( "CALL" ), makeSymbol( "POSSIBLY-BIND-TEMPORAL-INDEXICAL-IN-OBJECT" ), makeKeyword( "INPUT" ) ),
      makeKeyword( "OUTPUT-GENERATE-PATTERN" ), ConsesLow.list( makeKeyword( "CALL" ), makeSymbol( "REMOVAL-ALL-TEMPORALLY-COTERMINAL-OUTPUT-GENERATE" ), makeKeyword( "INPUT" ) ), makeKeyword(
          "OUTPUT-CONSTRUCT-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "temporallyCoterminal" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "TEMPORAL-THING" ) ),
              makeKeyword( "INPUT" ) ), makeKeyword( "SUPPORT-MODULE" ), makeKeyword( "TIME" ), makeKeyword( "DOCUMENTATION" ), makeString( "(#$temporallyCoterminal <TemporalThing> <not-fully-bound>" )
    } );
    $kw222$ALL_TEMPORALLY_COTERMINAL_POS = makeKeyword( "ALL-TEMPORALLY-COTERMINAL-POS" );
    $list223 = ConsesLow.list( makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "temporallyCoterminal" ) ), makeKeyword(
        "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "temporallyCoterminal" ) ), makeKeyword( "ANYTHING" ), makeKeyword( "NOT-FULLY-BOUND" ) ), makeKeyword(
            "PREFERENCE-LEVEL" ), makeKeyword( "GROSSLY-DISPREFERRED" ) );
    $kw224$REMOVAL_ALL_TEMPORALLY_COTERMINAL_INVERSE = makeKeyword( "REMOVAL-ALL-TEMPORALLY-COTERMINAL-INVERSE" );
    $list225 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "temporallyCoterminal" ) ),
      makeKeyword( "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "temporallyCoterminal" ) ), makeKeyword( "NOT-FULLY-BOUND" ), ConsesLow.list( makeKeyword( "TEST" ),
          makeSymbol( "SBHL-TIME-INFERENCE-ARG-P" ) ) ), makeKeyword( "COST-EXPRESSION" ), makeSymbol( "*DEFAULT-ALL-TEMPORAL-RELATION-COST*" ), makeKeyword( "COMPLETENESS" ), makeKeyword( "GROSSLY-INCOMPLETE" ),
      makeKeyword( "INPUT-EXTRACT-PATTERN" ), ConsesLow.list( makeKeyword( "TEMPLATE" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "temporallyCoterminal" ) ), makeKeyword( "ANYTHING" ),
          ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "TEMPORAL-THING" ) ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "TEMPORAL-THING" ) ) ), makeKeyword( "INPUT-ENCODE-PATTERN" ), ConsesLow.list(
              makeKeyword( "CALL" ), makeSymbol( "POSSIBLY-BIND-TEMPORAL-INDEXICAL-IN-OBJECT" ), makeKeyword( "INPUT" ) ), makeKeyword( "OUTPUT-GENERATE-PATTERN" ), ConsesLow.list( makeKeyword( "CALL" ), makeSymbol(
                  "REMOVAL-ALL-TEMPORALLY-COTERMINAL-OUTPUT-GENERATE" ), makeKeyword( "INPUT" ) ), makeKeyword( "OUTPUT-CONSTRUCT-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
                      "temporallyCoterminal" ) ), makeKeyword( "INPUT" ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "TEMPORAL-THING" ) ) ), makeKeyword( "SUPPORT-MODULE" ), makeKeyword( "TIME" ), makeKeyword(
                          "DOCUMENTATION" ), makeString( "(#$temporallyCoterminal <not-fully-bound> <TemporalThing>)" )
    } );
    $kw226$ALL_TEMPORALLY_COTERMINAL_INVERSE_POS = makeKeyword( "ALL-TEMPORALLY-COTERMINAL-INVERSE-POS" );
    $list227 = ConsesLow.list( makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "temporallyCoterminal" ) ), makeKeyword(
        "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "temporallyCoterminal" ) ), makeKeyword( "NOT-FULLY-BOUND" ), makeKeyword( "ANYTHING" ) ), makeKeyword(
            "PREFERENCE-LEVEL" ), makeKeyword( "GROSSLY-DISPREFERRED" ) );
    $kw228$REMOVAL_NOT_TEMPORALLY_COTERMINAL = makeKeyword( "REMOVAL-NOT-TEMPORALLY-COTERMINAL" );
    $list229 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "NEG" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "temporallyCoterminal" ) ),
      makeKeyword( "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "temporallyCoterminal" ) ), ConsesLow.list( makeKeyword( "TEST" ), makeSymbol(
          "SBHL-TIME-INFERENCE-ARG-P" ) ), ConsesLow.list( makeKeyword( "TEST" ), makeSymbol( "SBHL-TIME-INFERENCE-ARG-P" ) ) ), makeKeyword( "COST-EXPRESSION" ), makeSymbol(
              "*DEFAULT-NOT-TEMPORAL-RELATION-CHECK-COST*" ), makeKeyword( "EXPAND" ), makeSymbol( "REMOVAL-NOT-TEMPORALLY-COTERMINAL-EXPAND" )
    } );
    $const230$contiguousAfter = constant_handles.reader_make_constant_shell( makeString( "contiguousAfter" ) );
    $kw231$REMOVAL_CONTIGUOUS_AFTER = makeKeyword( "REMOVAL-CONTIGUOUS-AFTER" );
    $list232 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "contiguousAfter" ) ), makeKeyword(
        "CHECK" ), T, makeKeyword( "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "contiguousAfter" ) ), ConsesLow.list( makeKeyword( "TEST" ), makeSymbol(
            "SBHL-TIME-INFERENCE-ARG-P" ) ), ConsesLow.list( makeKeyword( "TEST" ), makeSymbol( "SBHL-TIME-INFERENCE-ARG-P" ) ) ), makeKeyword( "COST-EXPRESSION" ), makeSymbol( "*DEFAULT-TEMPORAL-RELATION-CHECK-COST*" ),
      makeKeyword( "INPUT-EXTRACT-PATTERN" ), ConsesLow.list( makeKeyword( "TEMPLATE" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "contiguousAfter" ) ), ConsesLow.list( makeKeyword(
          "BIND" ), makeSymbol( "TEMPORAL-THING1" ) ), ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "TEMPORAL-THING2" ) ) ), ConsesLow.list( ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol(
              "TEMPORAL-THING1" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "TEMPORAL-THING2" ) ) ) ), makeKeyword( "INPUT-ENCODE-PATTERN" ), ConsesLow.list( makeKeyword( "TUPLE" ), ConsesLow.list(
                  makeSymbol( "TEMPORAL-THING1" ), makeSymbol( "TEMPORAL-THING2" ) ), ConsesLow.list( ConsesLow.list( makeKeyword( "CALL" ), makeSymbol( "POSSIBLY-BIND-TEMPORAL-INDEXICAL-IN-OBJECT" ), ConsesLow.list(
                      makeKeyword( "VALUE" ), makeSymbol( "TEMPORAL-THING1" ) ) ), ConsesLow.list( makeKeyword( "CALL" ), makeSymbol( "POSSIBLY-BIND-TEMPORAL-INDEXICAL-IN-OBJECT" ), ConsesLow.list( makeKeyword(
                          "VALUE" ), makeSymbol( "TEMPORAL-THING2" ) ) ) ) ), makeKeyword( "OUTPUT-CHECK-PATTERN" ), ConsesLow.list( makeKeyword( "TUPLE" ), ConsesLow.list( makeSymbol( "TEMPORAL-THING1" ), makeSymbol(
                              "TEMPORAL-THING2" ) ), ConsesLow.list( makeKeyword( "CALL" ), makeSymbol( "CONTIGUOUS-AFTER?" ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "TEMPORAL-THING1" ) ), ConsesLow.list(
                                  makeKeyword( "VALUE" ), makeSymbol( "TEMPORAL-THING2" ) ) ) ), makeKeyword( "SUPPORT-MODULE" ), makeKeyword( "TIME" ), makeKeyword( "DOCUMENTATION" ), makeString(
                                      "(#$contiguousAfter <TemporalThing> <TemporalThing>)" )
    } );
    $sym233$REMOVAL_ALL_CONTIGUOUS_AFTER_OUTPUT_GENERATE = makeSymbol( "REMOVAL-ALL-CONTIGUOUS-AFTER-OUTPUT-GENERATE" );
    $kw234$REMOVAL_ALL_CONTIGUOUS_AFTER = makeKeyword( "REMOVAL-ALL-CONTIGUOUS-AFTER" );
    $list235 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "contiguousAfter" ) ), makeKeyword(
        "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "contiguousAfter" ) ), ConsesLow.list( makeKeyword( "TEST" ), makeSymbol( "SBHL-TIME-INFERENCE-ARG-P" ) ),
            makeKeyword( "NOT-FULLY-BOUND" ) ), makeKeyword( "COST-EXPRESSION" ), makeSymbol( "*DEFAULT-ALL-TEMPORAL-RELATION-COST*" ), makeKeyword( "COMPLETENESS" ), makeKeyword( "GROSSLY-INCOMPLETE" ), makeKeyword(
                "INPUT-EXTRACT-PATTERN" ), ConsesLow.list( makeKeyword( "TEMPLATE" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "contiguousAfter" ) ), ConsesLow.list( makeKeyword( "BIND" ),
                    makeSymbol( "TEMPORAL-THING" ) ), makeKeyword( "ANYTHING" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "TEMPORAL-THING" ) ) ), makeKeyword( "INPUT-ENCODE-PATTERN" ), ConsesLow.list(
                        makeKeyword( "CALL" ), makeSymbol( "POSSIBLY-BIND-TEMPORAL-INDEXICAL-IN-OBJECT" ), makeKeyword( "INPUT" ) ), makeKeyword( "OUTPUT-GENERATE-PATTERN" ), ConsesLow.list( makeKeyword( "CALL" ),
                            makeSymbol( "REMOVAL-ALL-CONTIGUOUS-AFTER-OUTPUT-GENERATE" ), makeKeyword( "INPUT" ) ), makeKeyword( "OUTPUT-CONSTRUCT-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell(
                                makeString( "contiguousAfter" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "TEMPORAL-THING" ) ), makeKeyword( "INPUT" ) ), makeKeyword( "SUPPORT-MODULE" ), makeKeyword(
                                    "TIME" ), makeKeyword( "DOCUMENTATION" ), makeString( "(#$contiguousAfter <TemporalThing> <not-fully-bound>)" )
    } );
    $kw236$ALL_CONTIGUOUS_AFTER_POS = makeKeyword( "ALL-CONTIGUOUS-AFTER-POS" );
    $list237 = ConsesLow.list( makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "contiguousAfter" ) ), makeKeyword( "REQUIRED-PATTERN" ),
        ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "contiguousAfter" ) ), makeKeyword( "ANYTHING" ), makeKeyword( "NOT-FULLY-BOUND" ) ), makeKeyword( "PREFERENCE-LEVEL" ), makeKeyword(
            "GROSSLY-DISPREFERRED" ) );
    $sym238$REMOVAL_ALL_CONTIGUOUS_AFTER_INVERSE_OUTPUT_GENERATE = makeSymbol( "REMOVAL-ALL-CONTIGUOUS-AFTER-INVERSE-OUTPUT-GENERATE" );
    $kw239$REMOVAL_ALL_CONTIGUOUS_AFTER_INVERSE = makeKeyword( "REMOVAL-ALL-CONTIGUOUS-AFTER-INVERSE" );
    $list240 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "contiguousAfter" ) ), makeKeyword(
        "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "contiguousAfter" ) ), makeKeyword( "NOT-FULLY-BOUND" ), ConsesLow.list( makeKeyword( "TEST" ), makeSymbol(
            "SBHL-TIME-INFERENCE-ARG-P" ) ) ), makeKeyword( "COST-EXPRESSION" ), makeSymbol( "*DEFAULT-ALL-TEMPORAL-RELATION-INVERSE-COST*" ), makeKeyword( "COMPLETENESS" ), makeKeyword( "GROSSLY-INCOMPLETE" ),
      makeKeyword( "INPUT-EXTRACT-PATTERN" ), ConsesLow.list( makeKeyword( "TEMPLATE" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "contiguousAfter" ) ), makeKeyword( "ANYTHING" ),
          ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "TEMPORAL-THING" ) ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "TEMPORAL-THING" ) ) ), makeKeyword( "INPUT-ENCODE-PATTERN" ), ConsesLow.list(
              makeKeyword( "CALL" ), makeSymbol( "POSSIBLY-BIND-TEMPORAL-INDEXICAL-IN-OBJECT" ), makeKeyword( "INPUT" ) ), makeKeyword( "OUTPUT-GENERATE-PATTERN" ), ConsesLow.list( makeKeyword( "CALL" ), makeSymbol(
                  "REMOVAL-ALL-CONTIGUOUS-AFTER-INVERSE-OUTPUT-GENERATE" ), makeKeyword( "INPUT" ) ), makeKeyword( "OUTPUT-CONSTRUCT-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
                      "contiguousAfter" ) ), makeKeyword( "INPUT" ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "TEMPORAL-THING" ) ) ), makeKeyword( "SUPPORT-MODULE" ), makeKeyword( "TIME" ), makeKeyword(
                          "DOCUMENTATION" ), makeString( "(#$contiguousAfter <not-fully-bound> <TemporalThing>)" )
    } );
    $kw241$ALL_CONTIGUOUS_AFTER_INVERSE_POS = makeKeyword( "ALL-CONTIGUOUS-AFTER-INVERSE-POS" );
    $list242 = ConsesLow.list( makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "contiguousAfter" ) ), makeKeyword( "REQUIRED-PATTERN" ),
        ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "contiguousAfter" ) ), makeKeyword( "NOT-FULLY-BOUND" ), makeKeyword( "ANYTHING" ) ), makeKeyword( "PREFERENCE-LEVEL" ), makeKeyword(
            "GROSSLY-DISPREFERRED" ) );
    $kw243$REMOVAL_NOT_CONTIGUOUS_AFTER = makeKeyword( "REMOVAL-NOT-CONTIGUOUS-AFTER" );
    $list244 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "NEG" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "contiguousAfter" ) ), makeKeyword(
        "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "contiguousAfter" ) ), ConsesLow.list( makeKeyword( "TEST" ), makeSymbol( "SBHL-TIME-INFERENCE-ARG-P" ) ), ConsesLow
            .list( makeKeyword( "TEST" ), makeSymbol( "SBHL-TIME-INFERENCE-ARG-P" ) ) ), makeKeyword( "COST-EXPRESSION" ), makeSymbol( "*DEFAULT-NOT-TEMPORAL-RELATION-CHECK-COST*" ), makeKeyword( "EXPAND" ), makeSymbol(
                "REMOVAL-NOT-CONTIGUOUS-AFTER-EXPAND" )
    } );
    $const245$startsDuring = constant_handles.reader_make_constant_shell( makeString( "startsDuring" ) );
    $kw246$REMOVAL_STARTS_DURING = makeKeyword( "REMOVAL-STARTS-DURING" );
    $list247 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "startsDuring" ) ), makeKeyword(
        "CHECK" ), T, makeKeyword( "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "startsDuring" ) ), ConsesLow.list( makeKeyword( "TEST" ), makeSymbol(
            "SBHL-TIME-INFERENCE-ARG-P" ) ), ConsesLow.list( makeKeyword( "TEST" ), makeSymbol( "SBHL-TIME-INFERENCE-ARG-P" ) ) ), makeKeyword( "COST-EXPRESSION" ), makeSymbol( "*DEFAULT-TEMPORAL-RELATION-CHECK-COST*" ),
      makeKeyword( "INPUT-EXTRACT-PATTERN" ), ConsesLow.list( makeKeyword( "TEMPLATE" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "startsDuring" ) ), ConsesLow.list( makeKeyword( "BIND" ),
          makeSymbol( "TEMPORAL-THING1" ) ), ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "TEMPORAL-THING2" ) ) ), ConsesLow.list( ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "TEMPORAL-THING1" ) ),
              ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "TEMPORAL-THING2" ) ) ) ), makeKeyword( "INPUT-ENCODE-PATTERN" ), ConsesLow.list( makeKeyword( "TUPLE" ), ConsesLow.list( makeSymbol( "TEMPORAL-THING1" ),
                  makeSymbol( "TEMPORAL-THING2" ) ), ConsesLow.list( ConsesLow.list( makeKeyword( "CALL" ), makeSymbol( "POSSIBLY-BIND-TEMPORAL-INDEXICAL-IN-OBJECT" ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol(
                      "TEMPORAL-THING1" ) ) ), ConsesLow.list( makeKeyword( "CALL" ), makeSymbol( "POSSIBLY-BIND-TEMPORAL-INDEXICAL-IN-OBJECT" ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol(
                          "TEMPORAL-THING2" ) ) ) ) ), makeKeyword( "OUTPUT-CHECK-PATTERN" ), ConsesLow.list( makeKeyword( "TUPLE" ), ConsesLow.list( makeSymbol( "TEMPORAL-THING1" ), makeSymbol( "TEMPORAL-THING2" ) ),
                              ConsesLow.list( makeKeyword( "CALL" ), makeSymbol( "STARTS-DURING?" ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "TEMPORAL-THING1" ) ), ConsesLow.list( makeKeyword( "VALUE" ),
                                  makeSymbol( "TEMPORAL-THING2" ) ) ) ), makeKeyword( "SUPPORT-MODULE" ), makeKeyword( "TIME" ), makeKeyword( "DOCUMENTATION" ), makeString(
                                      "(#$startsDuring <TemporalThing> <TemporalThing>)" )
    } );
    $sym248$REMOVAL_ALL_STARTS_DURING_OUTPUT_GENERATE = makeSymbol( "REMOVAL-ALL-STARTS-DURING-OUTPUT-GENERATE" );
    $kw249$REMOVAL_ALL_STARTS_DURING = makeKeyword( "REMOVAL-ALL-STARTS-DURING" );
    $list250 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "startsDuring" ) ), makeKeyword(
        "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "startsDuring" ) ), ConsesLow.list( makeKeyword( "TEST" ), makeSymbol( "SBHL-TIME-INFERENCE-ARG-P" ) ), makeKeyword(
            "NOT-FULLY-BOUND" ) ), makeKeyword( "COST-EXPRESSION" ), makeSymbol( "*DEFAULT-ALL-TEMPORAL-RELATION-COST*" ), makeKeyword( "COMPLETENESS" ), makeKeyword( "GROSSLY-INCOMPLETE" ), makeKeyword(
                "INPUT-EXTRACT-PATTERN" ), ConsesLow.list( makeKeyword( "TEMPLATE" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "startsDuring" ) ), ConsesLow.list( makeKeyword( "BIND" ),
                    makeSymbol( "TEMPORAL-THING" ) ), makeKeyword( "ANYTHING" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "TEMPORAL-THING" ) ) ), makeKeyword( "INPUT-ENCODE-PATTERN" ), ConsesLow.list(
                        makeKeyword( "CALL" ), makeSymbol( "POSSIBLY-BIND-TEMPORAL-INDEXICAL-IN-OBJECT" ), makeKeyword( "INPUT" ) ), makeKeyword( "OUTPUT-GENERATE-PATTERN" ), ConsesLow.list( makeKeyword( "CALL" ),
                            makeSymbol( "REMOVAL-ALL-STARTS-DURING-OUTPUT-GENERATE" ), makeKeyword( "INPUT" ) ), makeKeyword( "OUTPUT-CONSTRUCT-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell(
                                makeString( "startsDuring" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "TEMPORAL-THING" ) ), makeKeyword( "INPUT" ) ), makeKeyword( "SUPPORT-MODULE" ), makeKeyword( "TIME" ),
      makeKeyword( "DOCUMENTATION" ), makeString( "(#$startsDuring <TemporalThing> <not-fully-bound>)" )
    } );
    $kw251$ALL_STARTS_DURING_POS = makeKeyword( "ALL-STARTS-DURING-POS" );
    $list252 = ConsesLow.list( makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "startsDuring" ) ), makeKeyword( "REQUIRED-PATTERN" ),
        ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "startsDuring" ) ), makeKeyword( "ANYTHING" ), makeKeyword( "NOT-FULLY-BOUND" ) ), makeKeyword( "PREFERENCE-LEVEL" ), makeKeyword(
            "GROSSLY-DISPREFERRED" ) );
    $sym253$REMOVAL_ALL_STARTS_DURING_INVERSE_OUTPUT_GENERATE = makeSymbol( "REMOVAL-ALL-STARTS-DURING-INVERSE-OUTPUT-GENERATE" );
    $kw254$REMOVAL_ALL_STARTS_DURING_INVERSE = makeKeyword( "REMOVAL-ALL-STARTS-DURING-INVERSE" );
    $list255 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "startsDuring" ) ), makeKeyword(
        "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "startsDuring" ) ), makeKeyword( "NOT-FULLY-BOUND" ), ConsesLow.list( makeKeyword( "TEST" ), makeSymbol(
            "SBHL-TIME-INFERENCE-ARG-P" ) ) ), makeKeyword( "COST-EXPRESSION" ), makeSymbol( "*DEFAULT-ALL-TEMPORAL-RELATION-INVERSE-COST*" ), makeKeyword( "COMPLETENESS" ), makeKeyword( "GROSSLY-INCOMPLETE" ),
      makeKeyword( "INPUT-EXTRACT-PATTERN" ), ConsesLow.list( makeKeyword( "TEMPLATE" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "startsDuring" ) ), makeKeyword( "ANYTHING" ), ConsesLow
          .list( makeKeyword( "BIND" ), makeSymbol( "TEMPORAL-THING" ) ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "TEMPORAL-THING" ) ) ), makeKeyword( "INPUT-ENCODE-PATTERN" ), ConsesLow.list( makeKeyword(
              "CALL" ), makeSymbol( "POSSIBLY-BIND-TEMPORAL-INDEXICAL-IN-OBJECT" ), makeKeyword( "INPUT" ) ), makeKeyword( "OUTPUT-GENERATE-PATTERN" ), ConsesLow.list( makeKeyword( "CALL" ), makeSymbol(
                  "REMOVAL-ALL-STARTS-DURING-INVERSE-OUTPUT-GENERATE" ), makeKeyword( "INPUT" ) ), makeKeyword( "OUTPUT-CONSTRUCT-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
                      "startsDuring" ) ), makeKeyword( "INPUT" ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "TEMPORAL-THING" ) ) ), makeKeyword( "SUPPORT-MODULE" ), makeKeyword( "TIME" ), makeKeyword(
                          "DOCUMENTATION" ), makeString( "(#$startsDuring <not-fully-bound> <TemporalThing>)" )
    } );
    $kw256$ALL_STARTS_DURING_INVERSE_POS = makeKeyword( "ALL-STARTS-DURING-INVERSE-POS" );
    $list257 = ConsesLow.list( makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "startsDuring" ) ), makeKeyword( "REQUIRED-PATTERN" ),
        ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "startsDuring" ) ), makeKeyword( "NOT-FULLY-BOUND" ), makeKeyword( "ANYTHING" ) ), makeKeyword( "PREFERENCE-LEVEL" ), makeKeyword(
            "GROSSLY-DISPREFERRED" ) );
    $kw258$REMOVAL_NOT_STARTS_DURING = makeKeyword( "REMOVAL-NOT-STARTS-DURING" );
    $list259 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "NEG" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "startsDuring" ) ), makeKeyword(
        "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "startsDuring" ) ), ConsesLow.list( makeKeyword( "TEST" ), makeSymbol( "SBHL-TIME-INFERENCE-ARG-P" ) ), ConsesLow
            .list( makeKeyword( "TEST" ), makeSymbol( "SBHL-TIME-INFERENCE-ARG-P" ) ) ), makeKeyword( "COST-EXPRESSION" ), makeSymbol( "*DEFAULT-NOT-TEMPORAL-RELATION-CHECK-COST*" ), makeKeyword( "EXPAND" ), makeSymbol(
                "REMOVAL-NOT-STARTS-DURING-EXPAND" )
    } );
    $const260$endsDuring = constant_handles.reader_make_constant_shell( makeString( "endsDuring" ) );
    $kw261$REMOVAL_ENDS_DURING = makeKeyword( "REMOVAL-ENDS-DURING" );
    $list262 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "endsDuring" ) ), makeKeyword(
        "CHECK" ), T, makeKeyword( "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "endsDuring" ) ), ConsesLow.list( makeKeyword( "TEST" ), makeSymbol(
            "SBHL-TIME-INFERENCE-ARG-P" ) ), ConsesLow.list( makeKeyword( "TEST" ), makeSymbol( "SBHL-TIME-INFERENCE-ARG-P" ) ) ), makeKeyword( "COST-EXPRESSION" ), makeSymbol( "*DEFAULT-TEMPORAL-RELATION-CHECK-COST*" ),
      makeKeyword( "INPUT-EXTRACT-PATTERN" ), ConsesLow.list( makeKeyword( "TEMPLATE" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "endsDuring" ) ), ConsesLow.list( makeKeyword( "BIND" ),
          makeSymbol( "TEMPORAL-THING1" ) ), ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "TEMPORAL-THING2" ) ) ), ConsesLow.list( ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "TEMPORAL-THING1" ) ),
              ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "TEMPORAL-THING2" ) ) ) ), makeKeyword( "INPUT-ENCODE-PATTERN" ), ConsesLow.list( makeKeyword( "TUPLE" ), ConsesLow.list( makeSymbol( "TEMPORAL-THING1" ),
                  makeSymbol( "TEMPORAL-THING2" ) ), ConsesLow.list( ConsesLow.list( makeKeyword( "CALL" ), makeSymbol( "POSSIBLY-BIND-TEMPORAL-INDEXICAL-IN-OBJECT" ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol(
                      "TEMPORAL-THING1" ) ) ), ConsesLow.list( makeKeyword( "CALL" ), makeSymbol( "POSSIBLY-BIND-TEMPORAL-INDEXICAL-IN-OBJECT" ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol(
                          "TEMPORAL-THING2" ) ) ) ) ), makeKeyword( "OUTPUT-CHECK-PATTERN" ), ConsesLow.list( makeKeyword( "TUPLE" ), ConsesLow.list( makeSymbol( "TEMPORAL-THING1" ), makeSymbol( "TEMPORAL-THING2" ) ),
                              ConsesLow.list( makeKeyword( "CALL" ), makeSymbol( "ENDS-DURING?" ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "TEMPORAL-THING1" ) ), ConsesLow.list( makeKeyword( "VALUE" ),
                                  makeSymbol( "TEMPORAL-THING2" ) ) ) ), makeKeyword( "SUPPORT-MODULE" ), makeKeyword( "TIME" ), makeKeyword( "DOCUMENTATION" ), makeString(
                                      "(#$endsDuring <TemporalThing> <TemporalThing>)" )
    } );
    $sym263$REMOVAL_ALL_ENDS_DURING_OUTPUT_GENERATE = makeSymbol( "REMOVAL-ALL-ENDS-DURING-OUTPUT-GENERATE" );
    $kw264$REMOVAL_ALL_ENDS_DURING = makeKeyword( "REMOVAL-ALL-ENDS-DURING" );
    $list265 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "endsDuring" ) ), makeKeyword(
        "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "endsDuring" ) ), ConsesLow.list( makeKeyword( "TEST" ), makeSymbol( "SBHL-TIME-INFERENCE-ARG-P" ) ), makeKeyword(
            "NOT-FULLY-BOUND" ) ), makeKeyword( "COST-EXPRESSION" ), makeSymbol( "*DEFAULT-ALL-TEMPORAL-RELATION-COST*" ), makeKeyword( "COMPLETENESS" ), makeKeyword( "GROSSLY-INCOMPLETE" ), makeKeyword(
                "INPUT-EXTRACT-PATTERN" ), ConsesLow.list( makeKeyword( "TEMPLATE" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "endsDuring" ) ), ConsesLow.list( makeKeyword( "BIND" ),
                    makeSymbol( "TEMPORAL-THING" ) ), makeKeyword( "ANYTHING" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "TEMPORAL-THING" ) ) ), makeKeyword( "INPUT-ENCODE-PATTERN" ), ConsesLow.list(
                        makeKeyword( "CALL" ), makeSymbol( "POSSIBLY-BIND-TEMPORAL-INDEXICAL-IN-OBJECT" ), makeKeyword( "INPUT" ) ), makeKeyword( "OUTPUT-GENERATE-PATTERN" ), ConsesLow.list( makeKeyword( "CALL" ),
                            makeSymbol( "REMOVAL-ALL-ENDS-DURING-OUTPUT-GENERATE" ), makeKeyword( "INPUT" ) ), makeKeyword( "OUTPUT-CONSTRUCT-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell(
                                makeString( "endsDuring" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "TEMPORAL-THING" ) ), makeKeyword( "INPUT" ) ), makeKeyword( "SUPPORT-MODULE" ), makeKeyword( "TIME" ),
      makeKeyword( "DOCUMENTATION" ), makeString( "(#$endsDuring <TemporalThing> <not-fully-bound>)" )
    } );
    $kw266$ALL_ENDS_DURING_POS = makeKeyword( "ALL-ENDS-DURING-POS" );
    $list267 = ConsesLow.list( makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "endsDuring" ) ), makeKeyword( "REQUIRED-PATTERN" ),
        ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "endsDuring" ) ), makeKeyword( "ANYTHING" ), makeKeyword( "NOT-FULLY-BOUND" ) ), makeKeyword( "PREFERENCE-LEVEL" ), makeKeyword(
            "GROSSLY-DISPREFERRED" ) );
    $sym268$REMOVAL_ALL_ENDS_DURING_INVERSE_OUTPUT_GENERATE = makeSymbol( "REMOVAL-ALL-ENDS-DURING-INVERSE-OUTPUT-GENERATE" );
    $kw269$REMOVAL_ALL_ENDS_DURING_INVERSE = makeKeyword( "REMOVAL-ALL-ENDS-DURING-INVERSE" );
    $list270 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "endsDuring" ) ), makeKeyword(
        "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "endsDuring" ) ), makeKeyword( "NOT-FULLY-BOUND" ), ConsesLow.list( makeKeyword( "TEST" ), makeSymbol(
            "SBHL-TIME-INFERENCE-ARG-P" ) ) ), makeKeyword( "COST-EXPRESSION" ), makeSymbol( "*DEFAULT-ALL-TEMPORAL-RELATION-INVERSE-COST*" ), makeKeyword( "COMPLETENESS" ), makeKeyword( "GROSSLY-INCOMPLETE" ),
      makeKeyword( "INPUT-EXTRACT-PATTERN" ), ConsesLow.list( makeKeyword( "TEMPLATE" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "endsDuring" ) ), makeKeyword( "ANYTHING" ), ConsesLow
          .list( makeKeyword( "BIND" ), makeSymbol( "TEMPORAL-THING" ) ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "TEMPORAL-THING" ) ) ), makeKeyword( "INPUT-ENCODE-PATTERN" ), ConsesLow.list( makeKeyword(
              "CALL" ), makeSymbol( "POSSIBLY-BIND-TEMPORAL-INDEXICAL-IN-OBJECT" ), makeKeyword( "INPUT" ) ), makeKeyword( "OUTPUT-GENERATE-PATTERN" ), ConsesLow.list( makeKeyword( "CALL" ), makeSymbol(
                  "REMOVAL-ALL-ENDS-DURING-INVERSE-OUTPUT-GENERATE" ), makeKeyword( "INPUT" ) ), makeKeyword( "OUTPUT-CONSTRUCT-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
                      "endsDuring" ) ), makeKeyword( "INPUT" ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "TEMPORAL-THING" ) ) ), makeKeyword( "SUPPORT-MODULE" ), makeKeyword( "TIME" ), makeKeyword(
                          "DOCUMENTATION" ), makeString( "(#$endsDuring <not-fully-bound> <TemporalThing>)" )
    } );
    $kw271$ALL_ENDS_DURING_INVERSE_POS = makeKeyword( "ALL-ENDS-DURING-INVERSE-POS" );
    $list272 = ConsesLow.list( makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "endsDuring" ) ), makeKeyword( "REQUIRED-PATTERN" ),
        ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "endsDuring" ) ), makeKeyword( "NOT-FULLY-BOUND" ), makeKeyword( "ANYTHING" ) ), makeKeyword( "PREFERENCE-LEVEL" ), makeKeyword(
            "GROSSLY-DISPREFERRED" ) );
    $kw273$REMOVAL_NOT_ENDS_DURING = makeKeyword( "REMOVAL-NOT-ENDS-DURING" );
    $list274 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "NEG" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "endsDuring" ) ), makeKeyword(
        "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "endsDuring" ) ), ConsesLow.list( makeKeyword( "TEST" ), makeSymbol( "SBHL-TIME-INFERENCE-ARG-P" ) ), ConsesLow.list(
            makeKeyword( "TEST" ), makeSymbol( "SBHL-TIME-INFERENCE-ARG-P" ) ) ), makeKeyword( "COST-EXPRESSION" ), makeSymbol( "*DEFAULT-NOT-TEMPORAL-RELATION-CHECK-COST*" ), makeKeyword( "EXPAND" ), makeSymbol(
                "REMOVAL-NOT-ENDS-DURING-EXPAND" )
    } );
    $const275$startingDate = constant_handles.reader_make_constant_shell( makeString( "startingDate" ) );
    $kw276$REMOVAL_STARTING_DATE = makeKeyword( "REMOVAL-STARTING-DATE" );
    $list277 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "startingDate" ) ), makeKeyword(
        "CHECK" ), T, makeKeyword( "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "startingDate" ) ), ConsesLow.list( makeKeyword( "TEST" ), makeSymbol(
            "SBHL-TIME-INFERENCE-ARG-P" ) ), ConsesLow.list( makeKeyword( "TEST" ), makeSymbol( "SBHL-TIME-INFERENCE-ARG-P" ) ) ), makeKeyword( "COST-EXPRESSION" ), makeSymbol( "*DEFAULT-TEMPORAL-RELATION-CHECK-COST*" ),
      makeKeyword( "INPUT-EXTRACT-PATTERN" ), ConsesLow.list( makeKeyword( "TEMPLATE" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "startingDate" ) ), ConsesLow.list( makeKeyword( "BIND" ),
          makeSymbol( "TEMPORAL-THING" ) ), ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "DATE" ) ) ), ConsesLow.list( ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "TEMPORAL-THING" ) ), ConsesLow.list(
              makeKeyword( "VALUE" ), makeSymbol( "DATE" ) ) ) ), makeKeyword( "INPUT-ENCODE-PATTERN" ), ConsesLow.list( makeKeyword( "TUPLE" ), ConsesLow.list( makeSymbol( "TEMPORAL-THING" ), makeSymbol( "DATE" ) ),
                  ConsesLow.list( ConsesLow.list( makeKeyword( "CALL" ), makeSymbol( "POSSIBLY-BIND-TEMPORAL-INDEXICAL-IN-OBJECT" ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "TEMPORAL-THING" ) ) ), ConsesLow
                      .list( makeKeyword( "CALL" ), makeSymbol( "POSSIBLY-BIND-TEMPORAL-INDEXICAL-IN-OBJECT" ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "DATE" ) ) ) ) ), makeKeyword( "OUTPUT-CHECK-PATTERN" ),
      ConsesLow.list( makeKeyword( "TUPLE" ), ConsesLow.list( makeSymbol( "TEMPORAL-THING" ), makeSymbol( "DATE" ) ), ConsesLow.list( makeKeyword( "CALL" ), makeSymbol( "STARTING-DATE?" ), ConsesLow.list( makeKeyword(
          "VALUE" ), makeSymbol( "TEMPORAL-THING" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "DATE" ) ) ) ), makeKeyword( "SUPPORT-MODULE" ), makeKeyword( "TIME" ), makeKeyword( "DOCUMENTATION" ),
      makeString( "(#$startingDate <TemporalThing> <Date>)" )
    } );
    $sym278$REMOVAL_ALL_STARTING_DATE_INVERSE_OUTPUT_GENERATE = makeSymbol( "REMOVAL-ALL-STARTING-DATE-INVERSE-OUTPUT-GENERATE" );
    $kw279$REMOVAL_ALL_STARTING_DATE_INVERSE = makeKeyword( "REMOVAL-ALL-STARTING-DATE-INVERSE" );
    $list280 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "startingDate" ) ), makeKeyword(
        "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "startingDate" ) ), makeKeyword( "NOT-FULLY-BOUND" ), ConsesLow.list( makeKeyword( "TEST" ), makeSymbol(
            "SBHL-TIME-INFERENCE-ARG-P" ) ) ), makeKeyword( "COST-EXPRESSION" ), makeSymbol( "*DEFAULT-ALL-TEMPORAL-RELATION-INVERSE-COST*" ), makeKeyword( "COMPLETENESS" ), makeKeyword( "GROSSLY-INCOMPLETE" ),
      makeKeyword( "INPUT-EXTRACT-PATTERN" ), ConsesLow.list( makeKeyword( "TEMPLATE" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "startingDate" ) ), makeKeyword( "ANYTHING" ), ConsesLow
          .list( makeKeyword( "BIND" ), makeSymbol( "DATE" ) ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "DATE" ) ) ), makeKeyword( "INPUT-ENCODE-PATTERN" ), ConsesLow.list( makeKeyword( "CALL" ),
              makeSymbol( "POSSIBLY-BIND-TEMPORAL-INDEXICAL-IN-OBJECT" ), makeKeyword( "INPUT" ) ), makeKeyword( "OUTPUT-GENERATE-PATTERN" ), ConsesLow.list( makeKeyword( "CALL" ), makeSymbol(
                  "REMOVAL-ALL-STARTING-DATE-INVERSE-OUTPUT-GENERATE" ), makeKeyword( "INPUT" ) ), makeKeyword( "OUTPUT-CONSTRUCT-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
                      "startingDate" ) ), makeKeyword( "INPUT" ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "DATE" ) ) ), makeKeyword( "SUPPORT-MODULE" ), makeKeyword( "TIME" ), makeKeyword( "DOCUMENTATION" ),
      makeString( "(#$startingDate <not-fully-bound> <Date>)" )
    } );
    $kw281$ALL_STARTING_DATE_INVERSE_POS = makeKeyword( "ALL-STARTING-DATE-INVERSE-POS" );
    $list282 = ConsesLow.list( makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "startingDate" ) ), makeKeyword( "REQUIRED-PATTERN" ),
        ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "startingDate" ) ), makeKeyword( "NOT-FULLY-BOUND" ), makeKeyword( "ANYTHING" ) ), makeKeyword( "PREFERENCE-LEVEL" ), makeKeyword(
            "GROSSLY-DISPREFERRED" ) );
    $kw283$REMOVAL_NOT_STARTING_DATE = makeKeyword( "REMOVAL-NOT-STARTING-DATE" );
    $list284 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "NEG" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "startingDate" ) ), makeKeyword(
        "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "startingDate" ) ), ConsesLow.list( makeKeyword( "TEST" ), makeSymbol( "SBHL-TIME-INFERENCE-ARG-P" ) ), ConsesLow
            .list( makeKeyword( "TEST" ), makeSymbol( "SBHL-TIME-INFERENCE-ARG-P" ) ) ), makeKeyword( "COST-EXPRESSION" ), makeSymbol( "*DEFAULT-NOT-TEMPORAL-RELATION-CHECK-COST*" ), makeKeyword( "EXPAND" ), makeSymbol(
                "REMOVAL-NOT-STARTING-DATE-EXPAND" )
    } );
    $const285$endingDate = constant_handles.reader_make_constant_shell( makeString( "endingDate" ) );
    $kw286$REMOVAL_ENDING_DATE = makeKeyword( "REMOVAL-ENDING-DATE" );
    $list287 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "endingDate" ) ), makeKeyword(
        "CHECK" ), T, makeKeyword( "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "endingDate" ) ), ConsesLow.list( makeKeyword( "TEST" ), makeSymbol(
            "SBHL-TIME-INFERENCE-ARG-P" ) ), ConsesLow.list( makeKeyword( "TEST" ), makeSymbol( "SBHL-TIME-INFERENCE-ARG-P" ) ) ), makeKeyword( "COST-EXPRESSION" ), makeSymbol( "*DEFAULT-TEMPORAL-RELATION-CHECK-COST*" ),
      makeKeyword( "INPUT-EXTRACT-PATTERN" ), ConsesLow.list( makeKeyword( "TEMPLATE" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "endingDate" ) ), ConsesLow.list( makeKeyword( "BIND" ),
          makeSymbol( "TEMPORAL-THING" ) ), ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "DATE" ) ) ), ConsesLow.list( ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "TEMPORAL-THING" ) ), ConsesLow.list(
              makeKeyword( "VALUE" ), makeSymbol( "DATE" ) ) ) ), makeKeyword( "INPUT-ENCODE-PATTERN" ), ConsesLow.list( makeKeyword( "TUPLE" ), ConsesLow.list( makeSymbol( "TEMPORAL-THING" ), makeSymbol( "DATE" ) ),
                  ConsesLow.list( ConsesLow.list( makeKeyword( "CALL" ), makeSymbol( "POSSIBLY-BIND-TEMPORAL-INDEXICAL-IN-OBJECT" ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "TEMPORAL-THING" ) ) ), ConsesLow
                      .list( makeKeyword( "CALL" ), makeSymbol( "POSSIBLY-BIND-TEMPORAL-INDEXICAL-IN-OBJECT" ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "DATE" ) ) ) ) ), makeKeyword( "OUTPUT-CHECK-PATTERN" ),
      ConsesLow.list( makeKeyword( "TUPLE" ), ConsesLow.list( makeSymbol( "TEMPORAL-THING" ), makeSymbol( "DATE" ) ), ConsesLow.list( makeKeyword( "CALL" ), makeSymbol( "ENDING-DATE?" ), ConsesLow.list( makeKeyword(
          "VALUE" ), makeSymbol( "TEMPORAL-THING" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "DATE" ) ) ) ), makeKeyword( "SUPPORT-MODULE" ), makeKeyword( "TIME" ), makeKeyword( "DOCUMENTATION" ),
      makeString( "(#$endingDate <TemporalThing> <Date>)" )
    } );
    $sym288$REMOVAL_ALL_ENDING_DATE_INVERSE_OUTPUT_GENERATE = makeSymbol( "REMOVAL-ALL-ENDING-DATE-INVERSE-OUTPUT-GENERATE" );
    $kw289$REMOVAL_ALL_ENDING_DATE_INVERSE = makeKeyword( "REMOVAL-ALL-ENDING-DATE-INVERSE" );
    $list290 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "endingDate" ) ), makeKeyword(
        "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "endingDate" ) ), makeKeyword( "NOT-FULLY-BOUND" ), ConsesLow.list( makeKeyword( "TEST" ), makeSymbol(
            "SBHL-TIME-INFERENCE-ARG-P" ) ) ), makeKeyword( "COST-EXPRESSION" ), makeSymbol( "*DEFAULT-ALL-TEMPORAL-RELATION-INVERSE-COST*" ), makeKeyword( "COMPLETENESS" ), makeKeyword( "GROSSLY-INCOMPLETE" ),
      makeKeyword( "INPUT-EXTRACT-PATTERN" ), ConsesLow.list( makeKeyword( "TEMPLATE" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "endingDate" ) ), makeKeyword( "ANYTHING" ), ConsesLow
          .list( makeKeyword( "BIND" ), makeSymbol( "DATE" ) ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "DATE" ) ) ), makeKeyword( "INPUT-ENCODE-PATTERN" ), ConsesLow.list( makeKeyword( "CALL" ),
              makeSymbol( "POSSIBLY-BIND-TEMPORAL-INDEXICAL-IN-OBJECT" ), makeKeyword( "INPUT" ) ), makeKeyword( "OUTPUT-GENERATE-PATTERN" ), ConsesLow.list( makeKeyword( "CALL" ), makeSymbol(
                  "REMOVAL-ALL-ENDING-DATE-INVERSE-OUTPUT-GENERATE" ), makeKeyword( "INPUT" ) ), makeKeyword( "OUTPUT-CONSTRUCT-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
                      "endingDate" ) ), makeKeyword( "INPUT" ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "DATE" ) ) ), makeKeyword( "SUPPORT-MODULE" ), makeKeyword( "TIME" ), makeKeyword( "DOCUMENTATION" ),
      makeString( "(#$endingDate <not-fully-bound> <Date>)" )
    } );
    $kw291$ALL_ENDING_DATE_INVERSE_POS = makeKeyword( "ALL-ENDING-DATE-INVERSE-POS" );
    $list292 = ConsesLow.list( makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "endingDate" ) ), makeKeyword( "REQUIRED-PATTERN" ),
        ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "endingDate" ) ), makeKeyword( "NOT-FULLY-BOUND" ), makeKeyword( "ANYTHING" ) ), makeKeyword( "PREFERENCE-LEVEL" ), makeKeyword(
            "GROSSLY-DISPREFERRED" ) );
    $kw293$REMOVAL_NOT_ENDING_DATE = makeKeyword( "REMOVAL-NOT-ENDING-DATE" );
    $list294 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "NEG" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "endingDate" ) ), makeKeyword(
        "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "endingDate" ) ), ConsesLow.list( makeKeyword( "TEST" ), makeSymbol( "SBHL-TIME-INFERENCE-ARG-P" ) ), ConsesLow.list(
            makeKeyword( "TEST" ), makeSymbol( "SBHL-TIME-INFERENCE-ARG-P" ) ) ), makeKeyword( "COST-EXPRESSION" ), makeSymbol( "*DEFAULT-NOT-TEMPORAL-RELATION-CHECK-COST*" ), makeKeyword( "EXPAND" ), makeSymbol(
                "REMOVAL-NOT-ENDING-DATE-EXPAND" )
    } );
    $const295$birthDate = constant_handles.reader_make_constant_shell( makeString( "birthDate" ) );
    $kw296$REMOVAL_BIRTH_DATE = makeKeyword( "REMOVAL-BIRTH-DATE" );
    $list297 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "birthDate" ) ), makeKeyword(
        "CHECK" ), T, makeKeyword( "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "birthDate" ) ), ConsesLow.list( makeKeyword( "TEST" ), makeSymbol(
            "SBHL-TIME-INFERENCE-ARG-P" ) ), ConsesLow.list( makeKeyword( "TEST" ), makeSymbol( "SBHL-TIME-INFERENCE-ARG-P" ) ) ), makeKeyword( "COST-EXPRESSION" ), makeSymbol( "*DEFAULT-TEMPORAL-RELATION-CHECK-COST*" ),
      makeKeyword( "INPUT-EXTRACT-PATTERN" ), ConsesLow.list( makeKeyword( "TEMPLATE" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "birthDate" ) ), ConsesLow.list( makeKeyword( "BIND" ),
          makeSymbol( "TEMPORAL-THING" ) ), ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "DATE" ) ) ), ConsesLow.list( ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "TEMPORAL-THING" ) ), ConsesLow.list(
              makeKeyword( "VALUE" ), makeSymbol( "DATE" ) ) ) ), makeKeyword( "INPUT-ENCODE-PATTERN" ), ConsesLow.list( makeKeyword( "TUPLE" ), ConsesLow.list( makeSymbol( "TEMPORAL-THING" ), makeSymbol( "DATE" ) ),
                  ConsesLow.list( ConsesLow.list( makeKeyword( "CALL" ), makeSymbol( "POSSIBLY-BIND-TEMPORAL-INDEXICAL-IN-OBJECT" ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "TEMPORAL-THING" ) ) ), ConsesLow
                      .list( makeKeyword( "CALL" ), makeSymbol( "POSSIBLY-BIND-TEMPORAL-INDEXICAL-IN-OBJECT" ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "DATE" ) ) ) ) ), makeKeyword( "OUTPUT-CHECK-PATTERN" ),
      ConsesLow.list( makeKeyword( "TUPLE" ), ConsesLow.list( makeSymbol( "TEMPORAL-THING" ), makeSymbol( "DATE" ) ), ConsesLow.list( makeKeyword( "CALL" ), makeSymbol( "BIRTH-DATE?" ), ConsesLow.list( makeKeyword(
          "VALUE" ), makeSymbol( "TEMPORAL-THING" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "DATE" ) ) ) ), makeKeyword( "SUPPORT-MODULE" ), makeKeyword( "TIME" ), makeKeyword( "DOCUMENTATION" ),
      makeString( "(#$birthDate <TemporalThing> <Date>)" )
    } );
    $sym298$REMOVAL_ALL_BIRTH_DATE_INVERSE_OUTPUT_GENERATE = makeSymbol( "REMOVAL-ALL-BIRTH-DATE-INVERSE-OUTPUT-GENERATE" );
    $kw299$REMOVAL_ALL_BIRTH_DATE_INVERSE = makeKeyword( "REMOVAL-ALL-BIRTH-DATE-INVERSE" );
    $list300 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "birthDate" ) ), makeKeyword(
        "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "birthDate" ) ), makeKeyword( "NOT-FULLY-BOUND" ), ConsesLow.list( makeKeyword( "TEST" ), makeSymbol(
            "SBHL-TIME-INFERENCE-ARG-P" ) ) ), makeKeyword( "COST-EXPRESSION" ), makeSymbol( "*DEFAULT-ALL-TEMPORAL-RELATION-INVERSE-COST*" ), makeKeyword( "COMPLETENESS" ), makeKeyword( "GROSSLY-INCOMPLETE" ),
      makeKeyword( "INPUT-EXTRACT-PATTERN" ), ConsesLow.list( makeKeyword( "TEMPLATE" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "birthDate" ) ), makeKeyword( "ANYTHING" ), ConsesLow
          .list( makeKeyword( "BIND" ), makeSymbol( "DATE" ) ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "TEMPORAL-THING" ) ) ), makeKeyword( "INPUT-ENCODE-PATTERN" ), ConsesLow.list( makeKeyword( "CALL" ),
              makeSymbol( "POSSIBLY-BIND-TEMPORAL-INDEXICAL-IN-OBJECT" ), makeKeyword( "INPUT" ) ), makeKeyword( "OUTPUT-GENERATE-PATTERN" ), ConsesLow.list( makeKeyword( "CALL" ), makeSymbol(
                  "REMOVAL-ALL-BIRTH-DATE-INVERSE-OUTPUT-GENERATE" ), makeKeyword( "INPUT" ) ), makeKeyword( "OUTPUT-CONSTRUCT-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
                      "birthDate" ) ), makeKeyword( "INPUT" ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "DATE" ) ) ), makeKeyword( "SUPPORT-MODULE" ), makeKeyword( "TIME" ), makeKeyword( "DOCUMENTATION" ),
      makeString( "(#$birthDate <not-fully-bound> <Date>)" )
    } );
    $kw301$ALL_BIRTH_DATE_INVERSE_POS = makeKeyword( "ALL-BIRTH-DATE-INVERSE-POS" );
    $list302 = ConsesLow.list( makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "birthDate" ) ), makeKeyword( "REQUIRED-PATTERN" ),
        ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "birthDate" ) ), makeKeyword( "NOT-FULLY-BOUND" ), makeKeyword( "ANYTHING" ) ), makeKeyword( "PREFERENCE-LEVEL" ), makeKeyword(
            "GROSSLY-DISPREFERRED" ) );
    $kw303$REMOVAL_NOT_BIRTH_DATE = makeKeyword( "REMOVAL-NOT-BIRTH-DATE" );
    $list304 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "NEG" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "birthDate" ) ), makeKeyword(
        "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "birthDate" ) ), ConsesLow.list( makeKeyword( "TEST" ), makeSymbol( "SBHL-TIME-INFERENCE-ARG-P" ) ), ConsesLow.list(
            makeKeyword( "TEST" ), makeSymbol( "SBHL-TIME-INFERENCE-ARG-P" ) ) ), makeKeyword( "COST-EXPRESSION" ), makeSymbol( "*DEFAULT-NOT-TEMPORAL-RELATION-CHECK-COST*" ), makeKeyword( "EXPAND" ), makeSymbol(
                "REMOVAL-NOT-BIRTH-DATE-EXPAND" )
    } );
    $const305$dateOfDeath = constant_handles.reader_make_constant_shell( makeString( "dateOfDeath" ) );
    $kw306$REMOVAL_DATE_OF_DEATH = makeKeyword( "REMOVAL-DATE-OF-DEATH" );
    $list307 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "dateOfDeath" ) ), makeKeyword(
        "CHECK" ), T, makeKeyword( "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "dateOfDeath" ) ), ConsesLow.list( makeKeyword( "TEST" ), makeSymbol(
            "SBHL-TIME-INFERENCE-ARG-P" ) ), ConsesLow.list( makeKeyword( "TEST" ), makeSymbol( "SBHL-TIME-INFERENCE-ARG-P" ) ) ), makeKeyword( "COST-EXPRESSION" ), makeSymbol( "*DEFAULT-TEMPORAL-RELATION-CHECK-COST*" ),
      makeKeyword( "INPUT-EXTRACT-PATTERN" ), ConsesLow.list( makeKeyword( "TEMPLATE" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "dateOfDeath" ) ), ConsesLow.list( makeKeyword( "BIND" ),
          makeSymbol( "TEMPORAL-THING" ) ), ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "DATE" ) ) ), ConsesLow.list( ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "TEMPORAL-THING" ) ), ConsesLow.list(
              makeKeyword( "VALUE" ), makeSymbol( "DATE" ) ) ) ), makeKeyword( "INPUT-ENCODE-PATTERN" ), ConsesLow.list( makeKeyword( "TUPLE" ), ConsesLow.list( makeSymbol( "TEMPORAL-THING" ), makeSymbol( "DATE" ) ),
                  ConsesLow.list( ConsesLow.list( makeKeyword( "CALL" ), makeSymbol( "POSSIBLY-BIND-TEMPORAL-INDEXICAL-IN-OBJECT" ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "TEMPORAL-THING" ) ) ), ConsesLow
                      .list( makeKeyword( "CALL" ), makeSymbol( "POSSIBLY-BIND-TEMPORAL-INDEXICAL-IN-OBJECT" ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "DATE" ) ) ) ) ), makeKeyword( "OUTPUT-CHECK-PATTERN" ),
      ConsesLow.list( makeKeyword( "TUPLE" ), ConsesLow.list( makeSymbol( "TEMPORAL-THING" ), makeSymbol( "DATE" ) ), ConsesLow.list( makeKeyword( "CALL" ), makeSymbol( "DATE-OF-DEATH?" ), ConsesLow.list( makeKeyword(
          "VALUE" ), makeSymbol( "TEMPORAL-THING" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "DATE" ) ) ) ), makeKeyword( "SUPPORT-MODULE" ), makeKeyword( "TIME" ), makeKeyword( "DOCUMENTATION" ),
      makeString( "(#$dateOfDeath <TemporalThing> <Date>)" )
    } );
    $sym308$REMOVAL_ALL_DATE_OF_DEATH_INVERSE_OUTPUT_GENERATE = makeSymbol( "REMOVAL-ALL-DATE-OF-DEATH-INVERSE-OUTPUT-GENERATE" );
    $kw309$REMOVAL_ALL_DATE_OF_DEATH_INVERSE = makeKeyword( "REMOVAL-ALL-DATE-OF-DEATH-INVERSE" );
    $list310 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "dateOfDeath" ) ), makeKeyword(
        "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "dateOfDeath" ) ), makeKeyword( "NOT-FULLY-BOUND" ), ConsesLow.list( makeKeyword( "TEST" ), makeSymbol(
            "SBHL-TIME-INFERENCE-ARG-P" ) ) ), makeKeyword( "COST-EXPRESSION" ), makeSymbol( "*DEFAULT-ALL-TEMPORAL-RELATION-INVERSE-COST*" ), makeKeyword( "COMPLETENESS" ), makeKeyword( "GROSSLY-INCOMPLETE" ),
      makeKeyword( "INPUT-EXTRACT-PATTERN" ), ConsesLow.list( makeKeyword( "TEMPLATE" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "dateOfDeath" ) ), makeKeyword( "ANYTHING" ), ConsesLow
          .list( makeKeyword( "BIND" ), makeSymbol( "DATE" ) ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "DATE" ) ) ), makeKeyword( "INPUT-ENCODE-PATTERN" ), ConsesLow.list( makeKeyword( "CALL" ),
              makeSymbol( "POSSIBLY-BIND-TEMPORAL-INDEXICAL-IN-OBJECT" ), makeKeyword( "INPUT" ) ), makeKeyword( "OUTPUT-GENERATE-PATTERN" ), ConsesLow.list( makeKeyword( "CALL" ), makeSymbol(
                  "REMOVAL-ALL-DATE-OF-DEATH-INVERSE-OUTPUT-GENERATE" ), makeKeyword( "INPUT" ) ), makeKeyword( "OUTPUT-CONSTRUCT-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
                      "dateOfDeath" ) ), makeKeyword( "INPUT" ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "DATE" ) ) ), makeKeyword( "SUPPORT-MODULE" ), makeKeyword( "TIME" ), makeKeyword( "DOCUMENTATION" ),
      makeString( "(#$dateOfDeath <not-fully-bound> <Date>)" )
    } );
    $kw311$ALL_DATE_OF_DEATH_INVERSE_POS = makeKeyword( "ALL-DATE-OF-DEATH-INVERSE-POS" );
    $list312 = ConsesLow.list( makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "dateOfDeath" ) ), makeKeyword( "REQUIRED-PATTERN" ),
        ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "dateOfDeath" ) ), makeKeyword( "NOT-FULLY-BOUND" ), makeKeyword( "ANYTHING" ) ), makeKeyword( "PREFERENCE-LEVEL" ), makeKeyword(
            "GROSSLY-DISPREFERRED" ) );
    $kw313$REMOVAL_NOT_DATE_OF_DEATH = makeKeyword( "REMOVAL-NOT-DATE-OF-DEATH" );
    $list314 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "NEG" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "dateOfDeath" ) ), makeKeyword(
        "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "dateOfDeath" ) ), ConsesLow.list( makeKeyword( "TEST" ), makeSymbol( "SBHL-TIME-INFERENCE-ARG-P" ) ), ConsesLow
            .list( makeKeyword( "TEST" ), makeSymbol( "SBHL-TIME-INFERENCE-ARG-P" ) ) ), makeKeyword( "COST-EXPRESSION" ), makeSymbol( "*DEFAULT-NOT-TEMPORAL-RELATION-CHECK-COST*" ), makeKeyword( "EXPAND" ), makeSymbol(
                "REMOVAL-NOT-DATE-OF-DEATH-EXPAND" )
    } );
    $const315$temporallyStartedBy = constant_handles.reader_make_constant_shell( makeString( "temporallyStartedBy" ) );
    $kw316$REMOVAL_TEMPORALLY_STARTED_BY = makeKeyword( "REMOVAL-TEMPORALLY-STARTED-BY" );
    $list317 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "temporallyStartedBy" ) ), makeKeyword(
        "CHECK" ), T, makeKeyword( "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "temporallyStartedBy" ) ), ConsesLow.list( makeKeyword( "TEST" ), makeSymbol(
            "SBHL-TIME-INFERENCE-ARG-P" ) ), ConsesLow.list( makeKeyword( "TEST" ), makeSymbol( "SBHL-TIME-INFERENCE-ARG-P" ) ) ), makeKeyword( "COST-EXPRESSION" ), makeSymbol( "*DEFAULT-TEMPORAL-RELATION-CHECK-COST*" ),
      makeKeyword( "INPUT-EXTRACT-PATTERN" ), ConsesLow.list( makeKeyword( "TEMPLATE" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "temporallyStartedBy" ) ), ConsesLow.list( makeKeyword(
          "BIND" ), makeSymbol( "TEMPORAL-THING1" ) ), ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "TEMPORAL-THING2" ) ) ), ConsesLow.list( ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol(
              "TEMPORAL-THING1" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "TEMPORAL-THING2" ) ) ) ), makeKeyword( "INPUT-ENCODE-PATTERN" ), ConsesLow.list( makeKeyword( "TUPLE" ), ConsesLow.list(
                  makeSymbol( "TEMPORAL-THING1" ), makeSymbol( "TEMPORAL-THING2" ) ), ConsesLow.list( ConsesLow.list( makeKeyword( "CALL" ), makeSymbol( "POSSIBLY-BIND-TEMPORAL-INDEXICAL-IN-OBJECT" ), ConsesLow.list(
                      makeKeyword( "VALUE" ), makeSymbol( "TEMPORAL-THING1" ) ) ), ConsesLow.list( makeKeyword( "CALL" ), makeSymbol( "POSSIBLY-BIND-TEMPORAL-INDEXICAL-IN-OBJECT" ), ConsesLow.list( makeKeyword(
                          "VALUE" ), makeSymbol( "TEMPORAL-THING2" ) ) ) ) ), makeKeyword( "OUTPUT-CHECK-PATTERN" ), ConsesLow.list( makeKeyword( "TUPLE" ), ConsesLow.list( makeSymbol( "TEMPORAL-THING1" ), makeSymbol(
                              "TEMPORAL-THING2" ) ), ConsesLow.list( makeKeyword( "CALL" ), makeSymbol( "TEMPORALLY-STARTED-BY?" ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "TEMPORAL-THING1" ) ), ConsesLow
                                  .list( makeKeyword( "VALUE" ), makeSymbol( "TEMPORAL-THING2" ) ) ) ), makeKeyword( "SUPPORT-MODULE" ), makeKeyword( "TIME" ), makeKeyword( "DOCUMENTATION" ), makeString(
                                      "(#$temporallyStartedBy <TemporalThing> <TemporalThing>)" )
    } );
    $sym318$REMOVAL_ALL_TEMPORALLY_STARTED_BY_OUTPUT_GENERATE = makeSymbol( "REMOVAL-ALL-TEMPORALLY-STARTED-BY-OUTPUT-GENERATE" );
    $kw319$REMOVAL_ALL_TEMPORALLY_STARTED_BY = makeKeyword( "REMOVAL-ALL-TEMPORALLY-STARTED-BY" );
    $list320 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "temporallyStartedBy" ) ), makeKeyword(
        "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "temporallyStartedBy" ) ), ConsesLow.list( makeKeyword( "TEST" ), makeSymbol( "SBHL-TIME-INFERENCE-ARG-P" ) ),
            makeKeyword( "NOT-FULLY-BOUND" ) ), makeKeyword( "COST-EXPRESSION" ), makeSymbol( "*DEFAULT-ALL-TEMPORAL-RELATION-COST*" ), makeKeyword( "COMPLETENESS" ), makeKeyword( "GROSSLY-INCOMPLETE" ), makeKeyword(
                "INPUT-EXTRACT-PATTERN" ), ConsesLow.list( makeKeyword( "TEMPLATE" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "temporallyStartedBy" ) ), ConsesLow.list( makeKeyword(
                    "BIND" ), makeSymbol( "TEMPORAL-THING" ) ), makeKeyword( "ANYTHING" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "TEMPORAL-THING" ) ) ), makeKeyword( "INPUT-ENCODE-PATTERN" ), ConsesLow
                        .list( makeKeyword( "CALL" ), makeSymbol( "POSSIBLY-BIND-TEMPORAL-INDEXICAL-IN-OBJECT" ), makeKeyword( "INPUT" ) ), makeKeyword( "OUTPUT-GENERATE-PATTERN" ), ConsesLow.list( makeKeyword( "CALL" ),
                            makeSymbol( "REMOVAL-ALL-TEMPORALLY-STARTED-BY-OUTPUT-GENERATE" ), makeKeyword( "INPUT" ) ), makeKeyword( "OUTPUT-CONSTRUCT-PATTERN" ), ConsesLow.list( constant_handles
                                .reader_make_constant_shell( makeString( "temporallyStartedBy" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "TEMPORAL-THING" ) ), makeKeyword( "INPUT" ) ), makeKeyword(
                                    "SUPPORT-MODULE" ), makeKeyword( "TIME" ), makeKeyword( "DOCUMENTATION" ), makeString( "(#$temporallyStartedBy <TemporalThing> <not-fully-bound>)" )
    } );
    $kw321$ALL_TEMPORALLY_STARTED_BY_POS = makeKeyword( "ALL-TEMPORALLY-STARTED-BY-POS" );
    $list322 = ConsesLow.list( makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "temporallyStartedBy" ) ), makeKeyword(
        "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "temporallyStartedBy" ) ), makeKeyword( "ANYTHING" ), makeKeyword( "NOT-FULLY-BOUND" ) ), makeKeyword(
            "PREFERENCE-LEVEL" ), makeKeyword( "GROSSLY-DISPREFERRED" ) );
    $sym323$REMOVAL_ALL_TEMPORALLY_STARTED_BY_INVERSE_OUTPUT_GENERATE = makeSymbol( "REMOVAL-ALL-TEMPORALLY-STARTED-BY-INVERSE-OUTPUT-GENERATE" );
    $kw324$REMOVAL_ALL_TEMPORALLY_STARTED_BY_INVERSE = makeKeyword( "REMOVAL-ALL-TEMPORALLY-STARTED-BY-INVERSE" );
    $list325 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "temporallyStartedBy" ) ), makeKeyword(
        "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "temporallyStartedBy" ) ), makeKeyword( "NOT-FULLY-BOUND" ), ConsesLow.list( makeKeyword( "TEST" ), makeSymbol(
            "SBHL-TIME-INFERENCE-ARG-P" ) ) ), makeKeyword( "COST-EXPRESSION" ), makeSymbol( "*DEFAULT-ALL-TEMPORAL-RELATION-INVERSE-COST*" ), makeKeyword( "COMPLETENESS" ), makeKeyword( "GROSSLY-INCOMPLETE" ),
      makeKeyword( "INPUT-EXTRACT-PATTERN" ), ConsesLow.list( makeKeyword( "TEMPLATE" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "temporallyStartedBy" ) ), makeKeyword( "ANYTHING" ),
          ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "TEMPORAL-THING" ) ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "TEMPORAL-THING" ) ) ), makeKeyword( "INPUT-ENCODE-PATTERN" ), ConsesLow.list(
              makeKeyword( "CALL" ), makeSymbol( "POSSIBLY-BIND-TEMPORAL-INDEXICAL-IN-OBJECT" ), makeKeyword( "INPUT" ) ), makeKeyword( "OUTPUT-GENERATE-PATTERN" ), ConsesLow.list( makeKeyword( "CALL" ), makeSymbol(
                  "REMOVAL-ALL-TEMPORALLY-STARTED-BY-INVERSE-OUTPUT-GENERATE" ), makeKeyword( "INPUT" ) ), makeKeyword( "OUTPUT-CONSTRUCT-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell(
                      makeString( "temporallyStartedBy" ) ), makeKeyword( "INPUT" ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "TEMPORAL-THING" ) ) ), makeKeyword( "SUPPORT-MODULE" ), makeKeyword( "TIME" ),
      makeKeyword( "DOCUMENTATION" ), makeString( "(#$temporallyStartedBy <not-fully-bound> <TemporalThing>)" )
    } );
    $kw326$ALL_TEMPORALLY_STARTED_BY_INVERSE_POS = makeKeyword( "ALL-TEMPORALLY-STARTED-BY-INVERSE-POS" );
    $list327 = ConsesLow.list( makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "temporallyStartedBy" ) ), makeKeyword(
        "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "temporallyStartedBy" ) ), makeKeyword( "NOT-FULLY-BOUND" ), makeKeyword( "ANYTHING" ) ), makeKeyword(
            "PREFERENCE-LEVEL" ), makeKeyword( "GROSSLY-DISPREFERRED" ) );
    $kw328$REMOVAL_NOT_TEMPORALLY_STARTED_BY = makeKeyword( "REMOVAL-NOT-TEMPORALLY-STARTED-BY" );
    $list329 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "NEG" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "temporallyStartedBy" ) ), makeKeyword(
        "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "temporallyStartedBy" ) ), ConsesLow.list( makeKeyword( "TEST" ), makeSymbol( "SBHL-TIME-INFERENCE-ARG-P" ) ),
            ConsesLow.list( makeKeyword( "TEST" ), makeSymbol( "SBHL-TIME-INFERENCE-ARG-P" ) ) ), makeKeyword( "COST-EXPRESSION" ), makeSymbol( "*DEFAULT-NOT-TEMPORAL-RELATION-CHECK-COST*" ), makeKeyword( "EXPAND" ),
      makeSymbol( "REMOVAL-NOT-TEMPORALLY-STARTED-BY-EXPAND" )
    } );
    $const330$temporallyFinishedBy = constant_handles.reader_make_constant_shell( makeString( "temporallyFinishedBy" ) );
    $kw331$REMOVAL_TEMPORALLY_FINISHED_BY = makeKeyword( "REMOVAL-TEMPORALLY-FINISHED-BY" );
    $list332 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "temporallyFinishedBy" ) ),
      makeKeyword( "CHECK" ), T, makeKeyword( "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "temporallyFinishedBy" ) ), ConsesLow.list( makeKeyword( "TEST" ), makeSymbol(
          "SBHL-TIME-INFERENCE-ARG-P" ) ), ConsesLow.list( makeKeyword( "TEST" ), makeSymbol( "SBHL-TIME-INFERENCE-ARG-P" ) ) ), makeKeyword( "COST-EXPRESSION" ), makeSymbol( "*DEFAULT-TEMPORAL-RELATION-CHECK-COST*" ),
      makeKeyword( "INPUT-EXTRACT-PATTERN" ), ConsesLow.list( makeKeyword( "TEMPLATE" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "temporallyFinishedBy" ) ), ConsesLow.list( makeKeyword(
          "BIND" ), makeSymbol( "TEMPORAL-THING1" ) ), ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "TEMPORAL-THING2" ) ) ), ConsesLow.list( ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol(
              "TEMPORAL-THING1" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "TEMPORAL-THING2" ) ) ) ), makeKeyword( "INPUT-ENCODE-PATTERN" ), ConsesLow.list( makeKeyword( "TUPLE" ), ConsesLow.list(
                  makeSymbol( "TEMPORAL-THING1" ), makeSymbol( "TEMPORAL-THING2" ) ), ConsesLow.list( ConsesLow.list( makeKeyword( "CALL" ), makeSymbol( "POSSIBLY-BIND-TEMPORAL-INDEXICAL-IN-OBJECT" ), ConsesLow.list(
                      makeKeyword( "VALUE" ), makeSymbol( "TEMPORAL-THING1" ) ) ), ConsesLow.list( makeKeyword( "CALL" ), makeSymbol( "POSSIBLY-BIND-TEMPORAL-INDEXICAL-IN-OBJECT" ), ConsesLow.list( makeKeyword(
                          "VALUE" ), makeSymbol( "TEMPORAL-THING2" ) ) ) ) ), makeKeyword( "OUTPUT-CHECK-PATTERN" ), ConsesLow.list( makeKeyword( "TUPLE" ), ConsesLow.list( makeSymbol( "TEMPORAL-THING1" ), makeSymbol(
                              "TEMPORAL-THING2" ) ), ConsesLow.list( makeKeyword( "CALL" ), makeSymbol( "TEMPORALLY-FINISHED-BY?" ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "TEMPORAL-THING1" ) ), ConsesLow
                                  .list( makeKeyword( "VALUE" ), makeSymbol( "TEMPORAL-THING2" ) ) ) ), makeKeyword( "SUPPORT-MODULE" ), makeKeyword( "TIME" ), makeKeyword( "DOCUMENTATION" ), makeString(
                                      "(#$temporallyFinishedBy <TemporalThing> <TemporalThing>)" )
    } );
    $sym333$REMOVAL_ALL_TEMPORALLY_FINISHED_BY_OUTPUT_GENERATE = makeSymbol( "REMOVAL-ALL-TEMPORALLY-FINISHED-BY-OUTPUT-GENERATE" );
    $kw334$REMOVAL_ALL_TEMPORALLY_FINISHED_BY = makeKeyword( "REMOVAL-ALL-TEMPORALLY-FINISHED-BY" );
    $list335 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "temporallyFinishedBy" ) ),
      makeKeyword( "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "temporallyFinishedBy" ) ), ConsesLow.list( makeKeyword( "TEST" ), makeSymbol(
          "SBHL-TIME-INFERENCE-ARG-P" ) ), makeKeyword( "NOT-FULLY-BOUND" ) ), makeKeyword( "COST-EXPRESSION" ), makeSymbol( "*DEFAULT-ALL-TEMPORAL-RELATION-COST*" ), makeKeyword( "COMPLETENESS" ), makeKeyword(
              "GROSSLY-INCOMPLETE" ), makeKeyword( "INPUT-EXTRACT-PATTERN" ), ConsesLow.list( makeKeyword( "TEMPLATE" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
                  "temporallyFinishedBy" ) ), ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "TEMPORAL-THING" ) ), makeKeyword( "ANYTHING" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol(
                      "TEMPORAL-THING" ) ) ), makeKeyword( "INPUT-ENCODE-PATTERN" ), ConsesLow.list( makeKeyword( "CALL" ), makeSymbol( "POSSIBLY-BIND-TEMPORAL-INDEXICAL-IN-OBJECT" ), makeKeyword( "INPUT" ) ),
      makeKeyword( "OUTPUT-GENERATE-PATTERN" ), ConsesLow.list( makeKeyword( "CALL" ), makeSymbol( "REMOVAL-ALL-TEMPORALLY-FINISHED-BY-OUTPUT-GENERATE" ), makeKeyword( "INPUT" ) ), makeKeyword(
          "OUTPUT-CONSTRUCT-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "temporallyFinishedBy" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "TEMPORAL-THING" ) ),
              makeKeyword( "INPUT" ) ), makeKeyword( "SUPPORT-MODULE" ), makeKeyword( "TIME" ), makeKeyword( "DOCUMENTATION" ), makeString( "(#$temporallyFinishedBy <TemporalThing> <not-fully-bound>)" )
    } );
    $kw336$ALL_TEMPORALLY_FINISHED_BY_POS = makeKeyword( "ALL-TEMPORALLY-FINISHED-BY-POS" );
    $list337 = ConsesLow.list( makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "temporallyFinishedBy" ) ), makeKeyword(
        "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "temporallyFinishedBy" ) ), ConsesLow.list( makeKeyword( "TEST" ), makeSymbol( "SBHL-TIME-INFERENCE-ARG-P" ) ),
            makeKeyword( "NOT-FULLY-BOUND" ) ), makeKeyword( "PREFERENCE-LEVEL" ), makeKeyword( "GROSSLY-DISPREFERRED" ) );
    $sym338$REMOVAL_ALL_TEMPORALLY_FINISHED_BY_INVERSE_OUTPUT_GENERATE = makeSymbol( "REMOVAL-ALL-TEMPORALLY-FINISHED-BY-INVERSE-OUTPUT-GENERATE" );
    $kw339$REMOVAL_ALL_TEMPORALLY_FINISHED_BY_INVERSE = makeKeyword( "REMOVAL-ALL-TEMPORALLY-FINISHED-BY-INVERSE" );
    $list340 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "temporallyFinishedBy" ) ),
      makeKeyword( "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "temporallyFinishedBy" ) ), makeKeyword( "NOT-FULLY-BOUND" ), ConsesLow.list( makeKeyword( "TEST" ),
          makeSymbol( "SBHL-TIME-INFERENCE-ARG-P" ) ) ), makeKeyword( "COST-EXPRESSION" ), makeSymbol( "*DEFAULT-ALL-TEMPORAL-RELATION-INVERSE-COST*" ), makeKeyword( "COMPLETENESS" ), makeKeyword( "GROSSLY-INCOMPLETE" ),
      makeKeyword( "INPUT-EXTRACT-PATTERN" ), ConsesLow.list( makeKeyword( "TEMPLATE" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "temporallyFinishedBy" ) ), makeKeyword( "ANYTHING" ),
          ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "TEMPORAL-THING" ) ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "TEMPORAL-THING" ) ) ), makeKeyword( "INPUT-ENCODE-PATTERN" ), ConsesLow.list(
              makeKeyword( "CALL" ), makeSymbol( "POSSIBLY-BIND-TEMPORAL-INDEXICAL-IN-OBJECT" ), makeKeyword( "INPUT" ) ), makeKeyword( "OUTPUT-GENERATE-PATTERN" ), ConsesLow.list( makeKeyword( "CALL" ), makeSymbol(
                  "REMOVAL-ALL-TEMPORALLY-FINISHED-BY-INVERSE-OUTPUT-GENERATE" ), makeKeyword( "INPUT" ) ), makeKeyword( "OUTPUT-CONSTRUCT-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell(
                      makeString( "temporallyFinishedBy" ) ), makeKeyword( "INPUT" ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "TEMPORAL-THING" ) ) ), makeKeyword( "SUPPORT-MODULE" ), makeKeyword( "TIME" ),
      makeKeyword( "DOCUMENTATION" ), makeString( "(#$temporallyFinishedBy <not-fully-bound> <TemporalThing>)" )
    } );
    $kw341$ALL_TEMPORALLY_FINISHED_BY_INVERSE_POS = makeKeyword( "ALL-TEMPORALLY-FINISHED-BY-INVERSE-POS" );
    $list342 = ConsesLow.list( makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "temporallyFinishedBy" ) ), makeKeyword(
        "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "temporallyFinishedBy" ) ), makeKeyword( "NOT-FULLY-BOUND" ), makeKeyword( "ANYTHING" ) ), makeKeyword(
            "PREFERENCE-LEVEL" ), makeKeyword( "GROSSLY-DISPREFERRED" ) );
    $kw343$REMOVAL_NOT_TEMPORALLY_FINISHED_BY = makeKeyword( "REMOVAL-NOT-TEMPORALLY-FINISHED-BY" );
    $list344 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "NEG" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "temporallyFinishedBy" ) ),
      makeKeyword( "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "temporallyFinishedBy" ) ), ConsesLow.list( makeKeyword( "TEST" ), makeSymbol(
          "SBHL-TIME-INFERENCE-ARG-P" ) ), ConsesLow.list( makeKeyword( "TEST" ), makeSymbol( "SBHL-TIME-INFERENCE-ARG-P" ) ) ), makeKeyword( "COST-EXPRESSION" ), makeSymbol(
              "*DEFAULT-NOT-TEMPORAL-RELATION-CHECK-COST*" ), makeKeyword( "EXPAND" ), makeSymbol( "REMOVAL-NOT-TEMPORALLY-FINISHED-BY-EXPAND" )
    } );
    $const345$overlapsStart = constant_handles.reader_make_constant_shell( makeString( "overlapsStart" ) );
    $kw346$REMOVAL_OVERLAPS_START = makeKeyword( "REMOVAL-OVERLAPS-START" );
    $list347 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "overlapsStart" ) ), makeKeyword(
        "CHECK" ), T, makeKeyword( "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "overlapsStart" ) ), ConsesLow.list( makeKeyword( "TEST" ), makeSymbol(
            "SBHL-TIME-INFERENCE-ARG-P" ) ), ConsesLow.list( makeKeyword( "TEST" ), makeSymbol( "SBHL-TIME-INFERENCE-ARG-P" ) ) ), makeKeyword( "COST-EXPRESSION" ), makeSymbol( "*DEFAULT-TEMPORAL-RELATION-CHECK-COST*" ),
      makeKeyword( "INPUT-EXTRACT-PATTERN" ), ConsesLow.list( makeKeyword( "TEMPLATE" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "overlapsStart" ) ), ConsesLow.list( makeKeyword(
          "BIND" ), makeSymbol( "TEMPORAL-THING1" ) ), ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "TEMPORAL-THING2" ) ) ), ConsesLow.list( ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol(
              "TEMPORAL-THING1" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "TEMPORAL-THING2" ) ) ) ), makeKeyword( "INPUT-ENCODE-PATTERN" ), ConsesLow.list( makeKeyword( "TUPLE" ), ConsesLow.list(
                  makeSymbol( "TEMPORAL-THING1" ), makeSymbol( "TEMPORAL-THING2" ) ), ConsesLow.list( ConsesLow.list( makeKeyword( "CALL" ), makeSymbol( "POSSIBLY-BIND-TEMPORAL-INDEXICAL-IN-OBJECT" ), ConsesLow.list(
                      makeKeyword( "VALUE" ), makeSymbol( "TEMPORAL-THING1" ) ) ), ConsesLow.list( makeKeyword( "CALL" ), makeSymbol( "POSSIBLY-BIND-TEMPORAL-INDEXICAL-IN-OBJECT" ), ConsesLow.list( makeKeyword(
                          "VALUE" ), makeSymbol( "TEMPORAL-THING2" ) ) ) ) ), makeKeyword( "OUTPUT-CHECK-PATTERN" ), ConsesLow.list( makeKeyword( "TUPLE" ), ConsesLow.list( makeSymbol( "TEMPORAL-THING1" ), makeSymbol(
                              "TEMPORAL-THING2" ) ), ConsesLow.list( makeKeyword( "CALL" ), makeSymbol( "OVERLAPS-START?" ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "TEMPORAL-THING1" ) ), ConsesLow.list(
                                  makeKeyword( "VALUE" ), makeSymbol( "TEMPORAL-THING2" ) ) ) ), makeKeyword( "SUPPORT-MODULE" ), makeKeyword( "TIME" ), makeKeyword( "DOCUMENTATION" ), makeString(
                                      "(#$overlapsStart <TemporalThing> <TemporalThing>)" )
    } );
    $sym348$REMOVAL_ALL_OVERLAPS_START_OUTPUT_GENERATE = makeSymbol( "REMOVAL-ALL-OVERLAPS-START-OUTPUT-GENERATE" );
    $kw349$REMOVAL_ALL_OVERLAPS_START = makeKeyword( "REMOVAL-ALL-OVERLAPS-START" );
    $list350 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "overlapsStart" ) ), makeKeyword(
        "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "overlapsStart" ) ), ConsesLow.list( makeKeyword( "TEST" ), makeSymbol( "SBHL-TIME-INFERENCE-ARG-P" ) ), makeKeyword(
            "NOT-FULLY-BOUND" ) ), makeKeyword( "COST-EXPRESSION" ), makeSymbol( "*DEFAULT-ALL-TEMPORAL-RELATION-COST*" ), makeKeyword( "COMPLETENESS" ), makeKeyword( "GROSSLY-INCOMPLETE" ), makeKeyword(
                "INPUT-EXTRACT-PATTERN" ), ConsesLow.list( makeKeyword( "TEMPLATE" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "overlapsStart" ) ), ConsesLow.list( makeKeyword( "BIND" ),
                    makeSymbol( "TEMPORAL-THING" ) ), makeKeyword( "ANYTHING" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "TEMPORAL-THING" ) ) ), makeKeyword( "INPUT-ENCODE-PATTERN" ), ConsesLow.list(
                        makeKeyword( "CALL" ), makeSymbol( "POSSIBLY-BIND-TEMPORAL-INDEXICAL-IN-OBJECT" ), makeKeyword( "INPUT" ) ), makeKeyword( "OUTPUT-GENERATE-PATTERN" ), ConsesLow.list( makeKeyword( "CALL" ),
                            makeSymbol( "REMOVAL-ALL-OVERLAPS-START-OUTPUT-GENERATE" ), makeKeyword( "INPUT" ) ), makeKeyword( "OUTPUT-CONSTRUCT-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell(
                                makeString( "overlapsStart" ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "TEMPORAL-THING" ) ), makeKeyword( "INPUT" ) ), makeKeyword( "SUPPORT-MODULE" ), makeKeyword( "TIME" ),
      makeKeyword( "DOCUMENTATION" ), makeString( "(#$overlapsStart <TemporalThing> <not-fully-bound>)" )
    } );
    $kw351$ALL_OVERLAPS_START_POS = makeKeyword( "ALL-OVERLAPS-START-POS" );
    $list352 = ConsesLow.list( makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "overlapsStart" ) ), makeKeyword( "REQUIRED-PATTERN" ),
        ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "overlapsStart" ) ), makeKeyword( "ANYTHING" ), makeKeyword( "NOT-FULLY-BOUND" ) ), makeKeyword( "PREFERENCE-LEVEL" ), makeKeyword(
            "GROSSLY-DISPREFERRED" ) );
    $sym353$REMOVAL_ALL_OVERLAPS_START_INVERSE_OUTPUT_GENERATE = makeSymbol( "REMOVAL-ALL-OVERLAPS-START-INVERSE-OUTPUT-GENERATE" );
    $kw354$REMOVAL_ALL_OVERLAPS_START_INVERSE = makeKeyword( "REMOVAL-ALL-OVERLAPS-START-INVERSE" );
    $list355 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "overlapsStart" ) ), makeKeyword(
        "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "overlapsStart" ) ), makeKeyword( "NOT-FULLY-BOUND" ), ConsesLow.list( makeKeyword( "TEST" ), makeSymbol(
            "SBHL-TIME-INFERENCE-ARG-P" ) ) ), makeKeyword( "COST-EXPRESSION" ), makeSymbol( "*DEFAULT-ALL-TEMPORAL-RELATION-INVERSE-COST*" ), makeKeyword( "COMPLETENESS" ), makeKeyword( "GROSSLY-INCOMPLETE" ),
      makeKeyword( "INPUT-EXTRACT-PATTERN" ), ConsesLow.list( makeKeyword( "TEMPLATE" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "overlapsStart" ) ), makeKeyword( "ANYTHING" ), ConsesLow
          .list( makeKeyword( "BIND" ), makeSymbol( "TEMPORAL-THING" ) ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "TEMPORAL-THING" ) ) ), makeKeyword( "INPUT-ENCODE-PATTERN" ), ConsesLow.list( makeKeyword(
              "CALL" ), makeSymbol( "POSSIBLY-BIND-TEMPORAL-INDEXICAL-IN-OBJECT" ), makeKeyword( "INPUT" ) ), makeKeyword( "OUTPUT-GENERATE-PATTERN" ), ConsesLow.list( makeKeyword( "CALL" ), makeSymbol(
                  "REMOVAL-ALL-OVERLAPS-START-INVERSE-OUTPUT-GENERATE" ), makeKeyword( "INPUT" ) ), makeKeyword( "OUTPUT-CONSTRUCT-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
                      "overlapsStart" ) ), makeKeyword( "INPUT" ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "TEMPORAL-THING" ) ) ), makeKeyword( "SUPPORT-MODULE" ), makeKeyword( "TIME" ), makeKeyword(
                          "DOCUMENTATION" ), makeString( "(#$overlapsStart <not-fully-bound> <TemporalThing>)" )
    } );
    $kw356$ALL_OVERLAPS_START_INVERSE_POS = makeKeyword( "ALL-OVERLAPS-START-INVERSE-POS" );
    $list357 = ConsesLow.list( makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "overlapsStart" ) ), makeKeyword( "REQUIRED-PATTERN" ),
        ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "overlapsStart" ) ), makeKeyword( "NOT-FULLY-BOUND" ), makeKeyword( "ANYTHING" ) ), makeKeyword( "PREFERENCE-LEVEL" ), makeKeyword(
            "GROSSLY-DISPREFERRED" ) );
    $kw358$REMOVAL_NOT_OVERLAPS_START = makeKeyword( "REMOVAL-NOT-OVERLAPS-START" );
    $list359 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "NEG" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "overlapsStart" ) ), makeKeyword(
        "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "overlapsStart" ) ), ConsesLow.list( makeKeyword( "TEST" ), makeSymbol( "SBHL-TIME-INFERENCE-ARG-P" ) ), ConsesLow
            .list( makeKeyword( "TEST" ), makeSymbol( "SBHL-TIME-INFERENCE-ARG-P" ) ) ), makeKeyword( "COST-EXPRESSION" ), makeSymbol( "*DEFAULT-NOT-TEMPORAL-RELATION-CHECK-COST*" ), makeKeyword( "EXPAND" ), makeSymbol(
                "REMOVAL-NOT-OVERLAPS-START-EXPAND" )
    } );
  }
}
/*
 * 
 * Total time: 3094 ms
 * 
 */