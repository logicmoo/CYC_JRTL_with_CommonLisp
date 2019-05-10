package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Packages;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class classes_utilities
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.classes_utilities";
  public static final String myFingerPrint = "8af3552e672d321be5f5a4e4c36f42a2fda03f1b4a55140ca3c1c61f1ba35cad";
  @SubLTranslatedFile.SubL(source = "cycl/classes-utilities.lisp", position = 940L)
  public static SubLSymbol $classes_utilities_undefined_class_method_message$;
  @SubLTranslatedFile.SubL(source = "cycl/classes-utilities.lisp", position = 1084L)
  public static SubLSymbol $classes_utilities_undefined_class_super_method_message$;
  @SubLTranslatedFile.SubL(source = "cycl/classes-utilities.lisp", position = 1240L)
  public static SubLSymbol $classes_utilities_illegal_access_message$;
  @SubLTranslatedFile.SubL(source = "cycl/classes-utilities.lisp", position = 20719L)
  private static SubLSymbol $method_call_stack$;
  @SubLTranslatedFile.SubL(source = "cycl/classes-utilities.lisp", position = 24705L)
  private static SubLSymbol $valid_subloop_safe_funcaller_error_values$;
  private static final SubLString $str0$Attempt_to_invoke_the_undefined_m;
  private static final SubLString $str1$Attempt_to_invoke_the_undefined_s;
  private static final SubLString $str2$Method__S_cannot_be_called_within;
  private static final SubLList $list3;
  private static final SubLSymbol $sym4$DEFINE_PUBLIC;
  private static final SubLSymbol $sym5$CLASS_NAME_OR_CLASS;
  private static final SubLSymbol $sym6$METHOD_NAME;
  private static final SubLSymbol $sym7$CLET;
  private static final SubLList $list8;
  private static final SubLList $list9;
  private static final SubLList $list10;
  private static final SubLList $list11;
  private static final SubLList $list12;
  private static final SubLList $list13;
  private static final SubLSymbol $sym14$RET;
  private static final SubLSymbol $sym15$FUNCALL;
  private static final SubLList $list16;
  private static final SubLSymbol $sym17$CLASS;
  private static final SubLList $list18;
  private static final SubLString $str19$ARG_S;
  private static final SubLSymbol $sym20$PROGN;
  private static final SubLList $list21;
  private static final SubLList $list22;
  private static final SubLList $list23;
  private static final SubLList $list24;
  private static final SubLList $list25;
  private static final SubLSymbol $sym26$INSTANCE;
  private static final SubLList $list27;
  private static final SubLList $list28;
  private static final SubLSymbol $sym29$PIF;
  private static final SubLSymbol $sym30$METHOD;
  private static final SubLList $list31;
  private static final SubLSymbol $sym32$CLASS_OR_INSTANCE;
  private static final SubLList $list33;
  private static final SubLList $list34;
  private static final SubLList $list35;
  private static final SubLList $list36;
  private static final SubLList $list37;
  private static final SubLList $list38;
  private static final SubLList $list39;
  private static final SubLSymbol $sym40$FUNCALL_CLASS_METHOD_WITH_0_ARGS;
  private static final SubLSymbol $sym41$FUNCALL_CLASS_METHOD_WITH_1_ARGS;
  private static final SubLSymbol $sym42$FUNCALL_CLASS_METHOD_WITH_2_ARGS;
  private static final SubLSymbol $sym43$FUNCALL_CLASS_METHOD_WITH_3_ARGS;
  private static final SubLSymbol $sym44$FUNCALL_CLASS_METHOD_WITH_4_ARGS;
  private static final SubLSymbol $sym45$FUNCALL_CLASS_METHOD_WITH_5_ARGS;
  private static final SubLSymbol $sym46$FUNCALL_CLASS_METHOD_WITH_6_ARGS;
  private static final SubLSymbol $sym47$FUNCALL_CLASS_METHOD_WITH_7_ARGS;
  private static final SubLSymbol $sym48$FUNCALL_CLASS_METHOD_WITH_8_ARGS;
  private static final SubLSymbol $sym49$FUNCALL_CLASS_METHOD_WITH_9_ARGS;
  private static final SubLSymbol $sym50$FUNCALL_CLASS_METHOD_WITH_10_ARGS;
  private static final SubLSymbol $sym51$FUNCALL_CLASS_METHOD_WITH_11_ARGS;
  private static final SubLSymbol $sym52$FUNCALL_CLASS_METHOD_WITH_12_ARGS;
  private static final SubLSymbol $sym53$FUNCALL_CLASS_METHOD_WITH_13_ARGS;
  private static final SubLSymbol $sym54$FUNCALL_CLASS_METHOD_WITH_14_ARGS;
  private static final SubLSymbol $sym55$FUNCALL_CLASS_METHOD_WITH_15_ARGS;
  private static final SubLSymbol $sym56$FUNCALL_CLASS_METHOD_WITH_16_ARGS;
  private static final SubLSymbol $sym57$FUNCALL_CLASS_METHOD_WITH_17_ARGS;
  private static final SubLSymbol $sym58$FUNCALL_CLASS_METHOD_WITH_18_ARGS;
  private static final SubLSymbol $sym59$FUNCALL_CLASS_METHOD_WITH_19_ARGS;
  private static final SubLSymbol $sym60$FUNCALL_CLASS_METHOD_WITH_20_ARGS;
  private static final SubLSymbol $sym61$FUNCALL_CLASS_METHOD;
  private static final SubLSymbol $sym62$FUNCALL_CLASS_SUPER_METHOD_WITH_0_ARGS;
  private static final SubLSymbol $sym63$FUNCALL_CLASS_SUPER_METHOD_WITH_1_ARGS;
  private static final SubLSymbol $sym64$FUNCALL_CLASS_SUPER_METHOD_WITH_2_ARGS;
  private static final SubLSymbol $sym65$FUNCALL_CLASS_SUPER_METHOD_WITH_3_ARGS;
  private static final SubLSymbol $sym66$FUNCALL_CLASS_SUPER_METHOD_WITH_4_ARGS;
  private static final SubLSymbol $sym67$FUNCALL_CLASS_SUPER_METHOD_WITH_5_ARGS;
  private static final SubLSymbol $sym68$FUNCALL_CLASS_SUPER_METHOD_WITH_6_ARGS;
  private static final SubLSymbol $sym69$FUNCALL_CLASS_SUPER_METHOD_WITH_7_ARGS;
  private static final SubLSymbol $sym70$FUNCALL_CLASS_SUPER_METHOD_WITH_8_ARGS;
  private static final SubLSymbol $sym71$FUNCALL_CLASS_SUPER_METHOD_WITH_9_ARGS;
  private static final SubLSymbol $sym72$FUNCALL_CLASS_SUPER_METHOD_WITH_10_ARGS;
  private static final SubLSymbol $sym73$FUNCALL_CLASS_SUPER_METHOD_WITH_11_ARGS;
  private static final SubLSymbol $sym74$FUNCALL_CLASS_SUPER_METHOD_WITH_12_ARGS;
  private static final SubLSymbol $sym75$FUNCALL_CLASS_SUPER_METHOD_WITH_13_ARGS;
  private static final SubLSymbol $sym76$FUNCALL_CLASS_SUPER_METHOD_WITH_14_ARGS;
  private static final SubLSymbol $sym77$FUNCALL_CLASS_SUPER_METHOD_WITH_15_ARGS;
  private static final SubLSymbol $sym78$FUNCALL_CLASS_SUPER_METHOD_WITH_16_ARGS;
  private static final SubLSymbol $sym79$FUNCALL_CLASS_SUPER_METHOD_WITH_17_ARGS;
  private static final SubLSymbol $sym80$FUNCALL_CLASS_SUPER_METHOD_WITH_18_ARGS;
  private static final SubLSymbol $sym81$FUNCALL_CLASS_SUPER_METHOD_WITH_19_ARGS;
  private static final SubLSymbol $sym82$FUNCALL_CLASS_SUPER_METHOD_WITH_20_ARGS;
  private static final SubLSymbol $sym83$FUNCALL_CLASS_SUPER_METHOD;
  private static final SubLList $list84;
  private static final SubLSymbol $sym85$FUNCALL_INSTANCE_METHOD_WITH_0_ARGS;
  private static final SubLSymbol $sym86$FUNCALL_INSTANCE_METHOD_WITH_1_ARGS;
  private static final SubLSymbol $sym87$FUNCALL_INSTANCE_METHOD_WITH_2_ARGS;
  private static final SubLSymbol $sym88$FUNCALL_INSTANCE_METHOD_WITH_3_ARGS;
  private static final SubLSymbol $sym89$FUNCALL_INSTANCE_METHOD_WITH_4_ARGS;
  private static final SubLSymbol $sym90$FUNCALL_INSTANCE_METHOD_WITH_5_ARGS;
  private static final SubLSymbol $sym91$FUNCALL_INSTANCE_METHOD_WITH_6_ARGS;
  private static final SubLSymbol $sym92$FUNCALL_INSTANCE_METHOD_WITH_7_ARGS;
  private static final SubLSymbol $sym93$FUNCALL_INSTANCE_METHOD_WITH_8_ARGS;
  private static final SubLSymbol $sym94$FUNCALL_INSTANCE_METHOD_WITH_9_ARGS;
  private static final SubLSymbol $sym95$FUNCALL_INSTANCE_METHOD_WITH_10_ARGS;
  private static final SubLSymbol $sym96$FUNCALL_INSTANCE_METHOD_WITH_11_ARGS;
  private static final SubLSymbol $sym97$FUNCALL_INSTANCE_METHOD_WITH_12_ARGS;
  private static final SubLSymbol $sym98$FUNCALL_INSTANCE_METHOD_WITH_13_ARGS;
  private static final SubLSymbol $sym99$FUNCALL_INSTANCE_METHOD_WITH_14_ARGS;
  private static final SubLSymbol $sym100$FUNCALL_INSTANCE_METHOD_WITH_15_ARGS;
  private static final SubLSymbol $sym101$FUNCALL_INSTANCE_METHOD_WITH_16_ARGS;
  private static final SubLSymbol $sym102$FUNCALL_INSTANCE_METHOD_WITH_17_ARGS;
  private static final SubLSymbol $sym103$FUNCALL_INSTANCE_METHOD_WITH_18_ARGS;
  private static final SubLSymbol $sym104$FUNCALL_INSTANCE_METHOD_WITH_19_ARGS;
  private static final SubLSymbol $sym105$FUNCALL_INSTANCE_METHOD_WITH_20_ARGS;
  private static final SubLSymbol $sym106$FUNCALL_INSTANCE_METHOD;
  private static final SubLSymbol $sym107$FUNCALL_INSTANCE_SUPER_METHOD_WITH_0_ARGS;
  private static final SubLSymbol $sym108$FUNCALL_INSTANCE_SUPER_METHOD_WITH_1_ARGS;
  private static final SubLSymbol $sym109$FUNCALL_INSTANCE_SUPER_METHOD_WITH_2_ARGS;
  private static final SubLSymbol $sym110$FUNCALL_INSTANCE_SUPER_METHOD_WITH_3_ARGS;
  private static final SubLSymbol $sym111$FUNCALL_INSTANCE_SUPER_METHOD_WITH_4_ARGS;
  private static final SubLSymbol $sym112$FUNCALL_INSTANCE_SUPER_METHOD_WITH_5_ARGS;
  private static final SubLSymbol $sym113$FUNCALL_INSTANCE_SUPER_METHOD_WITH_6_ARGS;
  private static final SubLSymbol $sym114$FUNCALL_INSTANCE_SUPER_METHOD_WITH_7_ARGS;
  private static final SubLSymbol $sym115$FUNCALL_INSTANCE_SUPER_METHOD_WITH_8_ARGS;
  private static final SubLSymbol $sym116$FUNCALL_INSTANCE_SUPER_METHOD_WITH_9_ARGS;
  private static final SubLSymbol $sym117$FUNCALL_INSTANCE_SUPER_METHOD_WITH_10_ARGS;
  private static final SubLSymbol $sym118$FUNCALL_INSTANCE_SUPER_METHOD_WITH_11_ARGS;
  private static final SubLSymbol $sym119$FUNCALL_INSTANCE_SUPER_METHOD_WITH_12_ARGS;
  private static final SubLSymbol $sym120$FUNCALL_INSTANCE_SUPER_METHOD_WITH_13_ARGS;
  private static final SubLSymbol $sym121$FUNCALL_INSTANCE_SUPER_METHOD_WITH_14_ARGS;
  private static final SubLSymbol $sym122$FUNCALL_INSTANCE_SUPER_METHOD_WITH_15_ARGS;
  private static final SubLSymbol $sym123$FUNCALL_INSTANCE_SUPER_METHOD_WITH_16_ARGS;
  private static final SubLSymbol $sym124$FUNCALL_INSTANCE_SUPER_METHOD_WITH_17_ARGS;
  private static final SubLSymbol $sym125$FUNCALL_INSTANCE_SUPER_METHOD_WITH_18_ARGS;
  private static final SubLSymbol $sym126$FUNCALL_INSTANCE_SUPER_METHOD_WITH_19_ARGS;
  private static final SubLSymbol $sym127$FUNCALL_INSTANCE_SUPER_METHOD_WITH_20_ARGS;
  private static final SubLSymbol $sym128$FUNCALL_INSTANCE_SUPER_METHOD;
  private static final SubLSymbol $sym129$FUNCALL_CLASS_OR_INSTANCE_METHOD_WITH_0_ARGS;
  private static final SubLSymbol $sym130$FUNCALL_CLASS_OR_INSTANCE_METHOD_WITH_1_ARGS;
  private static final SubLSymbol $sym131$FUNCALL_CLASS_OR_INSTANCE_METHOD_WITH_2_ARGS;
  private static final SubLSymbol $sym132$FUNCALL_CLASS_OR_INSTANCE_METHOD_WITH_3_ARGS;
  private static final SubLSymbol $sym133$FUNCALL_CLASS_OR_INSTANCE_METHOD_WITH_4_ARGS;
  private static final SubLSymbol $sym134$FUNCALL_CLASS_OR_INSTANCE_METHOD_WITH_5_ARGS;
  private static final SubLSymbol $sym135$FUNCALL_CLASS_OR_INSTANCE_METHOD_WITH_6_ARGS;
  private static final SubLSymbol $sym136$FUNCALL_CLASS_OR_INSTANCE_METHOD_WITH_7_ARGS;
  private static final SubLSymbol $sym137$FUNCALL_CLASS_OR_INSTANCE_METHOD_WITH_8_ARGS;
  private static final SubLSymbol $sym138$FUNCALL_CLASS_OR_INSTANCE_METHOD_WITH_9_ARGS;
  private static final SubLSymbol $sym139$FUNCALL_CLASS_OR_INSTANCE_METHOD_WITH_10_ARGS;
  private static final SubLSymbol $sym140$FUNCALL_CLASS_OR_INSTANCE_METHOD_WITH_11_ARGS;
  private static final SubLSymbol $sym141$FUNCALL_CLASS_OR_INSTANCE_METHOD_WITH_12_ARGS;
  private static final SubLSymbol $sym142$FUNCALL_CLASS_OR_INSTANCE_METHOD_WITH_13_ARGS;
  private static final SubLSymbol $sym143$FUNCALL_CLASS_OR_INSTANCE_METHOD_WITH_14_ARGS;
  private static final SubLSymbol $sym144$FUNCALL_CLASS_OR_INSTANCE_METHOD_WITH_15_ARGS;
  private static final SubLSymbol $sym145$FUNCALL_CLASS_OR_INSTANCE_METHOD_WITH_16_ARGS;
  private static final SubLSymbol $sym146$FUNCALL_CLASS_OR_INSTANCE_METHOD_WITH_17_ARGS;
  private static final SubLSymbol $sym147$FUNCALL_CLASS_OR_INSTANCE_METHOD_WITH_18_ARGS;
  private static final SubLSymbol $sym148$FUNCALL_CLASS_OR_INSTANCE_METHOD_WITH_19_ARGS;
  private static final SubLSymbol $sym149$FUNCALL_CLASS_OR_INSTANCE_METHOD_WITH_20_ARGS;
  private static final SubLString $str150$APPLY_INSTANCE_METHOD__either_ins;
  private static final SubLString $str151$APPLY_INSTANCE_METHOD__No__S_meth;
  private static final SubLSymbol $sym152$FUNCALL_INSTANCE_METHOD_W_O_RECURSION;
  private static final SubLSymbol $sym153$CAR;
  private static final SubLSymbol $sym154$_;
  private static final SubLSymbol $sym155$STRING_EQUAL;
  private static final SubLList $list156;
  private static final SubLString $str157$item;
  private static final SubLString $str158$match_list;
  private static final SubLString $str159$not_match_list;
  private static final SubLString $str160$element;
  private static final SubLString $str161$sublist;
  private static final SubLList $list162;
  private static final SubLSymbol $sym163$CDOLIST_AND_SUBLISTS_CAREFULLY;
  private static final SubLSymbol $sym164$RPLACD;
  private static final SubLSymbol $sym165$CSETQ;
  private static final SubLSymbol $sym166$CSETF;
  private static final SubLSymbol $sym167$NREVERSE;
  private static final SubLString $str168$DO_CLASSES_IN_ORDER___S_is_not_a_;
  private static final SubLString $str169$DO_CLASSES_IN_ORDER___S_is_not_a_;
  private static final SubLString $str170$DO_CLASSES_IN_ORDER___S_is_not_a_;
  private static final SubLString $str171$Class__A_not_recognized_;
  private static final SubLList $list172;
  private static final SubLSymbol $sym173$SUBLOOP_SAFE_FUNCALLER_ERROR_VALUE;
  private static final SubLString $str174$_S___S_is_not_a_member_of_the__S_;
  private static final SubLSymbol $sym175$ENCODE_SUBLOOP_SAFE_FUNCALLER_ERROR_VALUE;
  private static final SubLString $str176$_S___S_is_not_a_valid_encoding_of;
  private static final SubLSymbol $sym177$DECODE_SUBLOOP_SAFE_FUNCALLER_ERROR_VALUE;
  private static final SubLString $str178$_S___S_was_expected_to_be_a_membe;
  private static final SubLSymbol $sym179$SUBLOOP_SAFE_FUNCALLER_ERROR_VALUE_P;
  private static final SubLList $list180;
  private static final SubLList $list181;
  private static final SubLList $list182;
  private static final SubLList $list183;
  private static final SubLList $list184;
  private static final SubLList $list185;
  private static final SubLSymbol $sym186$VALUES;
  private static final SubLSymbol $sym187$FUNCTION_REF;
  private static final SubLList $list188;
  private static final SubLList $list189;
  private static final SubLList $list190;
  private static final SubLList $list191;
  private static final SubLList $list192;
  private static final SubLSymbol $sym193$SAFE_FUNCALL_CLASS_METHOD_WITH_0_ARGS;
  private static final SubLSymbol $sym194$SAFE_FUNCALL_CLASS_METHOD_WITH_1_ARGS;
  private static final SubLSymbol $sym195$SAFE_FUNCALL_CLASS_METHOD_WITH_2_ARGS;
  private static final SubLSymbol $sym196$SAFE_FUNCALL_CLASS_METHOD_WITH_3_ARGS;
  private static final SubLSymbol $sym197$SAFE_FUNCALL_CLASS_METHOD_WITH_4_ARGS;
  private static final SubLSymbol $sym198$SAFE_FUNCALL_CLASS_METHOD_WITH_5_ARGS;
  private static final SubLSymbol $sym199$SAFE_FUNCALL_CLASS_METHOD_WITH_6_ARGS;
  private static final SubLSymbol $sym200$SAFE_FUNCALL_CLASS_METHOD_WITH_7_ARGS;
  private static final SubLSymbol $sym201$SAFE_FUNCALL_CLASS_METHOD_WITH_8_ARGS;
  private static final SubLSymbol $sym202$SAFE_FUNCALL_CLASS_METHOD_WITH_9_ARGS;
  private static final SubLSymbol $sym203$SAFE_FUNCALL_CLASS_METHOD_WITH_10_ARGS;
  private static final SubLSymbol $sym204$SAFE_FUNCALL_CLASS_METHOD_WITH_11_ARGS;
  private static final SubLSymbol $sym205$SAFE_FUNCALL_CLASS_METHOD_WITH_12_ARGS;
  private static final SubLSymbol $sym206$SAFE_FUNCALL_CLASS_METHOD_WITH_13_ARGS;
  private static final SubLSymbol $sym207$SAFE_FUNCALL_CLASS_METHOD_WITH_14_ARGS;
  private static final SubLSymbol $sym208$SAFE_FUNCALL_CLASS_METHOD_WITH_15_ARGS;
  private static final SubLSymbol $sym209$SAFE_FUNCALL_CLASS_METHOD_WITH_16_ARGS;
  private static final SubLSymbol $sym210$SAFE_FUNCALL_CLASS_METHOD_WITH_17_ARGS;
  private static final SubLSymbol $sym211$SAFE_FUNCALL_CLASS_METHOD_WITH_18_ARGS;
  private static final SubLSymbol $sym212$SAFE_FUNCALL_CLASS_METHOD_WITH_19_ARGS;
  private static final SubLSymbol $sym213$SAFE_FUNCALL_CLASS_METHOD_WITH_20_ARGS;
  private static final SubLSymbol $sym214$SAFE_FUNCALL_CLASS_METHOD;
  private static final SubLSymbol $sym215$SAFE_FUNCALL_CLASS_SUPER_METHOD_WITH_0_ARGS;
  private static final SubLSymbol $sym216$SAFE_FUNCALL_CLASS_SUPER_METHOD_WITH_1_ARGS;
  private static final SubLSymbol $sym217$SAFE_FUNCALL_CLASS_SUPER_METHOD_WITH_2_ARGS;
  private static final SubLSymbol $sym218$SAFE_FUNCALL_CLASS_SUPER_METHOD_WITH_3_ARGS;
  private static final SubLSymbol $sym219$SAFE_FUNCALL_CLASS_SUPER_METHOD_WITH_4_ARGS;
  private static final SubLSymbol $sym220$SAFE_FUNCALL_CLASS_SUPER_METHOD_WITH_5_ARGS;
  private static final SubLSymbol $sym221$SAFE_FUNCALL_CLASS_SUPER_METHOD_WITH_6_ARGS;
  private static final SubLSymbol $sym222$SAFE_FUNCALL_CLASS_SUPER_METHOD_WITH_7_ARGS;
  private static final SubLSymbol $sym223$SAFE_FUNCALL_CLASS_SUPER_METHOD_WITH_8_ARGS;
  private static final SubLSymbol $sym224$SAFE_FUNCALL_CLASS_SUPER_METHOD_WITH_9_ARGS;
  private static final SubLSymbol $sym225$SAFE_FUNCALL_CLASS_SUPER_METHOD_WITH_10_ARGS;
  private static final SubLSymbol $sym226$SAFE_FUNCALL_CLASS_SUPER_METHOD_WITH_11_ARGS;
  private static final SubLSymbol $sym227$SAFE_FUNCALL_CLASS_SUPER_METHOD_WITH_12_ARGS;
  private static final SubLSymbol $sym228$SAFE_FUNCALL_CLASS_SUPER_METHOD_WITH_13_ARGS;
  private static final SubLSymbol $sym229$SAFE_FUNCALL_CLASS_SUPER_METHOD_WITH_14_ARGS;
  private static final SubLSymbol $sym230$SAFE_FUNCALL_CLASS_SUPER_METHOD_WITH_15_ARGS;
  private static final SubLSymbol $sym231$SAFE_FUNCALL_CLASS_SUPER_METHOD_WITH_16_ARGS;
  private static final SubLSymbol $sym232$SAFE_FUNCALL_CLASS_SUPER_METHOD_WITH_17_ARGS;
  private static final SubLSymbol $sym233$SAFE_FUNCALL_CLASS_SUPER_METHOD_WITH_18_ARGS;
  private static final SubLSymbol $sym234$SAFE_FUNCALL_CLASS_SUPER_METHOD_WITH_19_ARGS;
  private static final SubLSymbol $sym235$SAFE_FUNCALL_CLASS_SUPER_METHOD_WITH_20_ARGS;
  private static final SubLSymbol $sym236$SAFE_FUNCALL_CLASS_SUPER_METHOD;
  private static final SubLSymbol $sym237$SAFE_FUNCALL_INSTANCE_METHOD_WITH_0_ARGS;
  private static final SubLSymbol $sym238$SAFE_FUNCALL_INSTANCE_METHOD_WITH_1_ARGS;
  private static final SubLSymbol $sym239$SAFE_FUNCALL_INSTANCE_METHOD_WITH_2_ARGS;
  private static final SubLSymbol $sym240$SAFE_FUNCALL_INSTANCE_METHOD_WITH_3_ARGS;
  private static final SubLSymbol $sym241$SAFE_FUNCALL_INSTANCE_METHOD_WITH_4_ARGS;
  private static final SubLSymbol $sym242$SAFE_FUNCALL_INSTANCE_METHOD_WITH_5_ARGS;
  private static final SubLSymbol $sym243$SAFE_FUNCALL_INSTANCE_METHOD_WITH_6_ARGS;
  private static final SubLSymbol $sym244$SAFE_FUNCALL_INSTANCE_METHOD_WITH_7_ARGS;
  private static final SubLSymbol $sym245$SAFE_FUNCALL_INSTANCE_METHOD_WITH_8_ARGS;
  private static final SubLSymbol $sym246$SAFE_FUNCALL_INSTANCE_METHOD_WITH_9_ARGS;
  private static final SubLSymbol $sym247$SAFE_FUNCALL_INSTANCE_METHOD_WITH_10_ARGS;
  private static final SubLSymbol $sym248$SAFE_FUNCALL_INSTANCE_METHOD_WITH_11_ARGS;
  private static final SubLSymbol $sym249$SAFE_FUNCALL_INSTANCE_METHOD_WITH_12_ARGS;
  private static final SubLSymbol $sym250$SAFE_FUNCALL_INSTANCE_METHOD_WITH_13_ARGS;
  private static final SubLSymbol $sym251$SAFE_FUNCALL_INSTANCE_METHOD_WITH_14_ARGS;
  private static final SubLSymbol $sym252$SAFE_FUNCALL_INSTANCE_METHOD_WITH_15_ARGS;
  private static final SubLSymbol $sym253$SAFE_FUNCALL_INSTANCE_METHOD_WITH_16_ARGS;
  private static final SubLSymbol $sym254$SAFE_FUNCALL_INSTANCE_METHOD_WITH_17_ARGS;
  private static final SubLSymbol $sym255$SAFE_FUNCALL_INSTANCE_METHOD_WITH_18_ARGS;
  private static final SubLSymbol $sym256$SAFE_FUNCALL_INSTANCE_METHOD_WITH_19_ARGS;
  private static final SubLSymbol $sym257$SAFE_FUNCALL_INSTANCE_METHOD_WITH_20_ARGS;
  private static final SubLSymbol $sym258$SAFE_FUNCALL_INSTANCE_METHOD;
  private static final SubLSymbol $sym259$SAFE_FUNCALL_INSTANCE_SUPER_METHOD_WITH_0_ARGS;
  private static final SubLSymbol $sym260$SAFE_FUNCALL_INSTANCE_SUPER_METHOD_WITH_1_ARGS;
  private static final SubLSymbol $sym261$SAFE_FUNCALL_INSTANCE_SUPER_METHOD_WITH_2_ARGS;
  private static final SubLSymbol $sym262$SAFE_FUNCALL_INSTANCE_SUPER_METHOD_WITH_3_ARGS;
  private static final SubLSymbol $sym263$SAFE_FUNCALL_INSTANCE_SUPER_METHOD_WITH_4_ARGS;
  private static final SubLSymbol $sym264$SAFE_FUNCALL_INSTANCE_SUPER_METHOD_WITH_5_ARGS;
  private static final SubLSymbol $sym265$SAFE_FUNCALL_INSTANCE_SUPER_METHOD_WITH_6_ARGS;
  private static final SubLSymbol $sym266$SAFE_FUNCALL_INSTANCE_SUPER_METHOD_WITH_7_ARGS;
  private static final SubLSymbol $sym267$SAFE_FUNCALL_INSTANCE_SUPER_METHOD_WITH_8_ARGS;
  private static final SubLSymbol $sym268$SAFE_FUNCALL_INSTANCE_SUPER_METHOD_WITH_9_ARGS;
  private static final SubLSymbol $sym269$SAFE_FUNCALL_INSTANCE_SUPER_METHOD_WITH_10_ARGS;
  private static final SubLSymbol $sym270$SAFE_FUNCALL_INSTANCE_SUPER_METHOD_WITH_11_ARGS;
  private static final SubLSymbol $sym271$SAFE_FUNCALL_INSTANCE_SUPER_METHOD_WITH_12_ARGS;
  private static final SubLSymbol $sym272$SAFE_FUNCALL_INSTANCE_SUPER_METHOD_WITH_13_ARGS;
  private static final SubLSymbol $sym273$SAFE_FUNCALL_INSTANCE_SUPER_METHOD_WITH_14_ARGS;
  private static final SubLSymbol $sym274$SAFE_FUNCALL_INSTANCE_SUPER_METHOD_WITH_15_ARGS;
  private static final SubLSymbol $sym275$SAFE_FUNCALL_INSTANCE_SUPER_METHOD_WITH_16_ARGS;
  private static final SubLSymbol $sym276$SAFE_FUNCALL_INSTANCE_SUPER_METHOD_WITH_17_ARGS;
  private static final SubLSymbol $sym277$SAFE_FUNCALL_INSTANCE_SUPER_METHOD_WITH_18_ARGS;
  private static final SubLSymbol $sym278$SAFE_FUNCALL_INSTANCE_SUPER_METHOD_WITH_19_ARGS;
  private static final SubLSymbol $sym279$SAFE_FUNCALL_INSTANCE_SUPER_METHOD_WITH_20_ARGS;
  private static final SubLSymbol $sym280$SAFE_FUNCALL_INSTANCE_SUPER_METHOD;
  private static final SubLSymbol $sym281$SAFE_FUNCALL_CLASS_OR_INSTANCE_METHOD_WITH_0_ARGS;
  private static final SubLSymbol $sym282$SAFE_FUNCALL_CLASS_OR_INSTANCE_METHOD_WITH_1_ARGS;
  private static final SubLSymbol $sym283$SAFE_FUNCALL_CLASS_OR_INSTANCE_METHOD_WITH_2_ARGS;
  private static final SubLSymbol $sym284$SAFE_FUNCALL_CLASS_OR_INSTANCE_METHOD_WITH_3_ARGS;
  private static final SubLSymbol $sym285$SAFE_FUNCALL_CLASS_OR_INSTANCE_METHOD_WITH_4_ARGS;
  private static final SubLSymbol $sym286$SAFE_FUNCALL_CLASS_OR_INSTANCE_METHOD_WITH_5_ARGS;
  private static final SubLSymbol $sym287$SAFE_FUNCALL_CLASS_OR_INSTANCE_METHOD_WITH_6_ARGS;
  private static final SubLSymbol $sym288$SAFE_FUNCALL_CLASS_OR_INSTANCE_METHOD_WITH_7_ARGS;
  private static final SubLSymbol $sym289$SAFE_FUNCALL_CLASS_OR_INSTANCE_METHOD_WITH_8_ARGS;
  private static final SubLSymbol $sym290$SAFE_FUNCALL_CLASS_OR_INSTANCE_METHOD_WITH_9_ARGS;
  private static final SubLSymbol $sym291$SAFE_FUNCALL_CLASS_OR_INSTANCE_METHOD_WITH_10_ARGS;
  private static final SubLSymbol $sym292$SAFE_FUNCALL_CLASS_OR_INSTANCE_METHOD_WITH_11_ARGS;
  private static final SubLSymbol $sym293$SAFE_FUNCALL_CLASS_OR_INSTANCE_METHOD_WITH_12_ARGS;
  private static final SubLSymbol $sym294$SAFE_FUNCALL_CLASS_OR_INSTANCE_METHOD_WITH_13_ARGS;
  private static final SubLSymbol $sym295$SAFE_FUNCALL_CLASS_OR_INSTANCE_METHOD_WITH_14_ARGS;
  private static final SubLSymbol $sym296$SAFE_FUNCALL_CLASS_OR_INSTANCE_METHOD_WITH_15_ARGS;
  private static final SubLSymbol $sym297$SAFE_FUNCALL_CLASS_OR_INSTANCE_METHOD_WITH_16_ARGS;
  private static final SubLSymbol $sym298$SAFE_FUNCALL_CLASS_OR_INSTANCE_METHOD_WITH_17_ARGS;
  private static final SubLSymbol $sym299$SAFE_FUNCALL_CLASS_OR_INSTANCE_METHOD_WITH_18_ARGS;
  private static final SubLSymbol $sym300$SAFE_FUNCALL_CLASS_OR_INSTANCE_METHOD_WITH_19_ARGS;
  private static final SubLSymbol $sym301$SAFE_FUNCALL_CLASS_OR_INSTANCE_METHOD_WITH_20_ARGS;

  @SubLTranslatedFile.SubL(source = "cycl/classes-utilities.lisp", position = 1371L)
  public static SubLObject define_class_method_funcallers(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject name_template = NIL;
    SubLObject max_args = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list3 );
    name_template = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list3 );
    max_args = current.first();
    current = current.rest();
    if( NIL == current )
    {
      SubLObject function_defs = NIL;
      SubLObject arg_list = NIL;
      SubLObject function_name = NIL;
      SubLObject function_def = NIL;
      SubLObject cdotimes_end_var;
      SubLObject i;
      for( cdotimes_end_var = Numbers.add( max_args, ONE_INTEGER ), i = NIL, i = ZERO_INTEGER; i.numL( cdotimes_end_var ); i = Numbers.add( i, ONE_INTEGER ) )
      {
        function_name = Packages.intern( PrintLow.format( NIL, name_template, i ), UNPROVIDED );
        function_def = conses_high.copy_tree( ConsesLow.listS( $sym4$DEFINE_PUBLIC, function_name, ConsesLow.listS( $sym5$CLASS_NAME_OR_CLASS, $sym6$METHOD_NAME, arg_list ), ConsesLow.list( $sym7$CLET, $list8, $list9,
            $list10, ConsesLow.list( $sym7$CLET, $list11, $list12, $list13, ConsesLow.list( $sym14$RET, ConsesLow.listS( $sym15$FUNCALL, $list16, $sym17$CLASS, arg_list ) ) ) ), $list18 ) );
        function_defs = ConsesLow.cons( function_def, function_defs );
        arg_list = Sequences.nreverse( ConsesLow.cons( Packages.intern( PrintLow.format( NIL, $str19$ARG_S, i ), UNPROVIDED ), Sequences.nreverse( arg_list ) ) );
      }
      return reader.bq_cons( $sym20$PROGN, Sequences.nreverse( function_defs ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list3 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/classes-utilities.lisp", position = 2855L)
  public static SubLObject define_class_super_method_funcallers(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject name_template = NIL;
    SubLObject max_args = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list3 );
    name_template = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list3 );
    max_args = current.first();
    current = current.rest();
    if( NIL == current )
    {
      SubLObject function_defs = NIL;
      SubLObject arg_list = NIL;
      SubLObject function_name = NIL;
      SubLObject function_def = NIL;
      SubLObject cdotimes_end_var;
      SubLObject i;
      for( cdotimes_end_var = Numbers.add( max_args, ONE_INTEGER ), i = NIL, i = ZERO_INTEGER; i.numL( cdotimes_end_var ); i = Numbers.add( i, ONE_INTEGER ) )
      {
        function_name = Packages.intern( PrintLow.format( NIL, name_template, i ), UNPROVIDED );
        function_def = conses_high.copy_tree( ConsesLow.listS( $sym4$DEFINE_PUBLIC, function_name, ConsesLow.listS( $sym5$CLASS_NAME_OR_CLASS, $sym6$METHOD_NAME, arg_list ), ConsesLow.list( $sym7$CLET, $list8, $list21,
            $list22, ConsesLow.list( $sym7$CLET, $list23, $list24, $list13, ConsesLow.list( $sym14$RET, ConsesLow.listS( $sym15$FUNCALL, $list16, $sym17$CLASS, arg_list ) ) ) ), $list18 ) );
        function_defs = ConsesLow.cons( function_def, function_defs );
        arg_list = Sequences.nreverse( ConsesLow.cons( Packages.intern( PrintLow.format( NIL, $str19$ARG_S, i ), UNPROVIDED ), Sequences.nreverse( arg_list ) ) );
      }
      return reader.bq_cons( $sym20$PROGN, Sequences.nreverse( function_defs ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list3 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/classes-utilities.lisp", position = 4379L)
  public static SubLObject define_instance_method_funcallers(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject name_template = NIL;
    SubLObject class_name_template = NIL;
    SubLObject max_args = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list25 );
    name_template = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list25 );
    class_name_template = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list25 );
    max_args = current.first();
    current = current.rest();
    if( NIL == current )
    {
      SubLObject function_defs = NIL;
      SubLObject arg_list = NIL;
      SubLObject function_name = NIL;
      SubLObject class_function_name = NIL;
      SubLObject function_def = NIL;
      SubLObject cdotimes_end_var;
      SubLObject i;
      for( cdotimes_end_var = Numbers.add( max_args, ONE_INTEGER ), i = NIL, i = ZERO_INTEGER; i.numL( cdotimes_end_var ); i = Numbers.add( i, ONE_INTEGER ) )
      {
        function_name = Packages.intern( PrintLow.format( NIL, name_template, i ), UNPROVIDED );
        class_function_name = Packages.intern( PrintLow.format( NIL, class_name_template, i ), UNPROVIDED );
        function_def = conses_high.copy_tree( ConsesLow.list( $sym4$DEFINE_PUBLIC, function_name, ConsesLow.listS( $sym26$INSTANCE, $sym6$METHOD_NAME, arg_list ), $list27, ConsesLow.list( $sym7$CLET, $list28, ConsesLow
            .list( $sym29$PIF, $sym30$METHOD, ConsesLow.list( $sym20$PROGN, $list13, ConsesLow.list( $sym14$RET, ConsesLow.listS( $sym15$FUNCALL, $list16, $sym26$INSTANCE, arg_list ) ) ), ConsesLow.list( $sym14$RET,
                ConsesLow.listS( class_function_name, $sym17$CLASS, $sym6$METHOD_NAME, arg_list ) ) ) ) ) );
        function_defs = ConsesLow.cons( function_def, function_defs );
        arg_list = Sequences.nreverse( ConsesLow.cons( Packages.intern( PrintLow.format( NIL, $str19$ARG_S, i ), UNPROVIDED ), Sequences.nreverse( arg_list ) ) );
      }
      return reader.bq_cons( $sym20$PROGN, Sequences.nreverse( function_defs ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list25 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/classes-utilities.lisp", position = 5648L)
  public static SubLObject define_instance_super_method_funcallers(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject name_template = NIL;
    SubLObject class_name_template = NIL;
    SubLObject max_args = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list25 );
    name_template = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list25 );
    class_name_template = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list25 );
    max_args = current.first();
    current = current.rest();
    if( NIL == current )
    {
      SubLObject function_defs = NIL;
      SubLObject arg_list = NIL;
      SubLObject function_name = NIL;
      SubLObject class_function_name = NIL;
      SubLObject function_def = NIL;
      SubLObject cdotimes_end_var;
      SubLObject i;
      for( cdotimes_end_var = Numbers.add( max_args, ONE_INTEGER ), i = NIL, i = ZERO_INTEGER; i.numL( cdotimes_end_var ); i = Numbers.add( i, ONE_INTEGER ) )
      {
        function_name = Packages.intern( PrintLow.format( NIL, name_template, i ), UNPROVIDED );
        class_function_name = Packages.intern( PrintLow.format( NIL, class_name_template, i ), UNPROVIDED );
        function_def = conses_high.copy_tree( ConsesLow.list( $sym4$DEFINE_PUBLIC, function_name, ConsesLow.listS( $sym26$INSTANCE, $sym6$METHOD_NAME, arg_list ), $list27, ConsesLow.list( $sym7$CLET, $list31, ConsesLow
            .list( $sym29$PIF, $sym30$METHOD, ConsesLow.list( $sym20$PROGN, $list13, ConsesLow.list( $sym14$RET, ConsesLow.listS( $sym15$FUNCALL, $list16, $sym26$INSTANCE, arg_list ) ) ), ConsesLow.list( $sym14$RET,
                ConsesLow.listS( class_function_name, $sym17$CLASS, $sym6$METHOD_NAME, arg_list ) ) ) ) ) );
        function_defs = ConsesLow.cons( function_def, function_defs );
        arg_list = Sequences.nreverse( ConsesLow.cons( Packages.intern( PrintLow.format( NIL, $str19$ARG_S, i ), UNPROVIDED ), Sequences.nreverse( arg_list ) ) );
      }
      return reader.bq_cons( $sym20$PROGN, Sequences.nreverse( function_defs ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list25 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/classes-utilities.lisp", position = 6953L)
  public static SubLObject define_class_or_instance_method_funcallers(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject name_template = NIL;
    SubLObject max_args = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list3 );
    name_template = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list3 );
    max_args = current.first();
    current = current.rest();
    if( NIL == current )
    {
      SubLObject function_defs = NIL;
      SubLObject arg_list = NIL;
      SubLObject function_name = NIL;
      SubLObject function_def = NIL;
      SubLObject cdotimes_end_var;
      SubLObject i;
      for( cdotimes_end_var = Numbers.add( max_args, ONE_INTEGER ), i = NIL, i = ZERO_INTEGER; i.numL( cdotimes_end_var ); i = Numbers.add( i, ONE_INTEGER ) )
      {
        function_name = Packages.intern( PrintLow.format( NIL, name_template, i ), UNPROVIDED );
        function_def = conses_high.copy_tree( ConsesLow.list( $sym4$DEFINE_PUBLIC, function_name, ConsesLow.listS( $sym32$CLASS_OR_INSTANCE, $sym6$METHOD_NAME, arg_list ), $list33, ConsesLow.list( $sym29$PIF, $list34,
            ConsesLow.list( $sym7$CLET, $list35, ConsesLow.listS( $sym29$PIF, $sym30$METHOD, ConsesLow.list( $sym20$PROGN, $list13, ConsesLow.list( $sym14$RET, ConsesLow.listS( $sym15$FUNCALL, $list16,
                $sym32$CLASS_OR_INSTANCE, arg_list ) ) ), $list36 ) ), ConsesLow.list( $sym7$CLET, $list37, $list38, $list12, $list13, ConsesLow.list( $sym14$RET, ConsesLow.listS( $sym15$FUNCALL, $list16, $sym17$CLASS,
                    arg_list ) ) ) ) ) );
        function_defs = ConsesLow.cons( function_def, function_defs );
        arg_list = Sequences.nreverse( ConsesLow.cons( Packages.intern( PrintLow.format( NIL, $str19$ARG_S, i ), UNPROVIDED ), Sequences.nreverse( arg_list ) ) );
      }
      return reader.bq_cons( $sym20$PROGN, Sequences.nreverse( function_defs ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list3 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/classes-utilities.lisp", position = 8892L)
  public static SubLObject funcall_class_method(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject v_class = NIL;
    SubLObject method_name = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list39 );
    v_class = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list39 );
    method_name = current.first();
    final SubLObject args;
    current = ( args = current.rest() );
    final SubLObject pcase_var;
    final SubLObject arg_count = pcase_var = Sequences.length( args );
    if( pcase_var.eql( ZERO_INTEGER ) )
    {
      return ConsesLow.list( $sym40$FUNCALL_CLASS_METHOD_WITH_0_ARGS, v_class, method_name );
    }
    if( pcase_var.eql( ONE_INTEGER ) )
    {
      return ConsesLow.listS( $sym41$FUNCALL_CLASS_METHOD_WITH_1_ARGS, v_class, method_name, args );
    }
    if( pcase_var.eql( TWO_INTEGER ) )
    {
      return ConsesLow.listS( $sym42$FUNCALL_CLASS_METHOD_WITH_2_ARGS, v_class, method_name, args );
    }
    if( pcase_var.eql( THREE_INTEGER ) )
    {
      return ConsesLow.listS( $sym43$FUNCALL_CLASS_METHOD_WITH_3_ARGS, v_class, method_name, args );
    }
    if( pcase_var.eql( FOUR_INTEGER ) )
    {
      return ConsesLow.listS( $sym44$FUNCALL_CLASS_METHOD_WITH_4_ARGS, v_class, method_name, args );
    }
    if( pcase_var.eql( FIVE_INTEGER ) )
    {
      return ConsesLow.listS( $sym45$FUNCALL_CLASS_METHOD_WITH_5_ARGS, v_class, method_name, args );
    }
    if( pcase_var.eql( SIX_INTEGER ) )
    {
      return ConsesLow.listS( $sym46$FUNCALL_CLASS_METHOD_WITH_6_ARGS, v_class, method_name, args );
    }
    if( pcase_var.eql( SEVEN_INTEGER ) )
    {
      return ConsesLow.listS( $sym47$FUNCALL_CLASS_METHOD_WITH_7_ARGS, v_class, method_name, args );
    }
    if( pcase_var.eql( EIGHT_INTEGER ) )
    {
      return ConsesLow.listS( $sym48$FUNCALL_CLASS_METHOD_WITH_8_ARGS, v_class, method_name, args );
    }
    if( pcase_var.eql( NINE_INTEGER ) )
    {
      return ConsesLow.listS( $sym49$FUNCALL_CLASS_METHOD_WITH_9_ARGS, v_class, method_name, args );
    }
    if( pcase_var.eql( TEN_INTEGER ) )
    {
      return ConsesLow.listS( $sym50$FUNCALL_CLASS_METHOD_WITH_10_ARGS, v_class, method_name, args );
    }
    if( pcase_var.eql( ELEVEN_INTEGER ) )
    {
      return ConsesLow.listS( $sym51$FUNCALL_CLASS_METHOD_WITH_11_ARGS, v_class, method_name, args );
    }
    if( pcase_var.eql( TWELVE_INTEGER ) )
    {
      return ConsesLow.listS( $sym52$FUNCALL_CLASS_METHOD_WITH_12_ARGS, v_class, method_name, args );
    }
    if( pcase_var.eql( THIRTEEN_INTEGER ) )
    {
      return ConsesLow.listS( $sym53$FUNCALL_CLASS_METHOD_WITH_13_ARGS, v_class, method_name, args );
    }
    if( pcase_var.eql( FOURTEEN_INTEGER ) )
    {
      return ConsesLow.listS( $sym54$FUNCALL_CLASS_METHOD_WITH_14_ARGS, v_class, method_name, args );
    }
    if( pcase_var.eql( FIFTEEN_INTEGER ) )
    {
      return ConsesLow.listS( $sym55$FUNCALL_CLASS_METHOD_WITH_15_ARGS, v_class, method_name, args );
    }
    if( pcase_var.eql( SIXTEEN_INTEGER ) )
    {
      return ConsesLow.listS( $sym56$FUNCALL_CLASS_METHOD_WITH_16_ARGS, v_class, method_name, args );
    }
    if( pcase_var.eql( SEVENTEEN_INTEGER ) )
    {
      return ConsesLow.listS( $sym57$FUNCALL_CLASS_METHOD_WITH_17_ARGS, v_class, method_name, args );
    }
    if( pcase_var.eql( EIGHTEEN_INTEGER ) )
    {
      return ConsesLow.listS( $sym58$FUNCALL_CLASS_METHOD_WITH_18_ARGS, v_class, method_name, args );
    }
    if( pcase_var.eql( NINETEEN_INTEGER ) )
    {
      return ConsesLow.listS( $sym59$FUNCALL_CLASS_METHOD_WITH_19_ARGS, v_class, method_name, args );
    }
    if( pcase_var.eql( TWENTY_INTEGER ) )
    {
      return ConsesLow.listS( $sym60$FUNCALL_CLASS_METHOD_WITH_20_ARGS, v_class, method_name, args );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/classes-utilities.lisp", position = 10737L)
  public static SubLObject fcm(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject v_class = NIL;
    SubLObject method_name = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list39 );
    v_class = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list39 );
    method_name = current.first();
    final SubLObject args;
    current = ( args = current.rest() );
    return ConsesLow.listS( $sym61$FUNCALL_CLASS_METHOD, v_class, method_name, args );
  }

  @SubLTranslatedFile.SubL(source = "cycl/classes-utilities.lisp", position = 10991L)
  public static SubLObject funcall_class_super_method(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject v_class = NIL;
    SubLObject method_name = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list39 );
    v_class = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list39 );
    method_name = current.first();
    final SubLObject args;
    current = ( args = current.rest() );
    final SubLObject pcase_var;
    final SubLObject arg_count = pcase_var = Sequences.length( args );
    if( pcase_var.eql( ZERO_INTEGER ) )
    {
      return ConsesLow.list( $sym62$FUNCALL_CLASS_SUPER_METHOD_WITH_0_ARGS, v_class, method_name );
    }
    if( pcase_var.eql( ONE_INTEGER ) )
    {
      return ConsesLow.listS( $sym63$FUNCALL_CLASS_SUPER_METHOD_WITH_1_ARGS, v_class, method_name, args );
    }
    if( pcase_var.eql( TWO_INTEGER ) )
    {
      return ConsesLow.listS( $sym64$FUNCALL_CLASS_SUPER_METHOD_WITH_2_ARGS, v_class, method_name, args );
    }
    if( pcase_var.eql( THREE_INTEGER ) )
    {
      return ConsesLow.listS( $sym65$FUNCALL_CLASS_SUPER_METHOD_WITH_3_ARGS, v_class, method_name, args );
    }
    if( pcase_var.eql( FOUR_INTEGER ) )
    {
      return ConsesLow.listS( $sym66$FUNCALL_CLASS_SUPER_METHOD_WITH_4_ARGS, v_class, method_name, args );
    }
    if( pcase_var.eql( FIVE_INTEGER ) )
    {
      return ConsesLow.listS( $sym67$FUNCALL_CLASS_SUPER_METHOD_WITH_5_ARGS, v_class, method_name, args );
    }
    if( pcase_var.eql( SIX_INTEGER ) )
    {
      return ConsesLow.listS( $sym68$FUNCALL_CLASS_SUPER_METHOD_WITH_6_ARGS, v_class, method_name, args );
    }
    if( pcase_var.eql( SEVEN_INTEGER ) )
    {
      return ConsesLow.listS( $sym69$FUNCALL_CLASS_SUPER_METHOD_WITH_7_ARGS, v_class, method_name, args );
    }
    if( pcase_var.eql( EIGHT_INTEGER ) )
    {
      return ConsesLow.listS( $sym70$FUNCALL_CLASS_SUPER_METHOD_WITH_8_ARGS, v_class, method_name, args );
    }
    if( pcase_var.eql( NINE_INTEGER ) )
    {
      return ConsesLow.listS( $sym71$FUNCALL_CLASS_SUPER_METHOD_WITH_9_ARGS, v_class, method_name, args );
    }
    if( pcase_var.eql( TEN_INTEGER ) )
    {
      return ConsesLow.listS( $sym72$FUNCALL_CLASS_SUPER_METHOD_WITH_10_ARGS, v_class, method_name, args );
    }
    if( pcase_var.eql( ELEVEN_INTEGER ) )
    {
      return ConsesLow.listS( $sym73$FUNCALL_CLASS_SUPER_METHOD_WITH_11_ARGS, v_class, method_name, args );
    }
    if( pcase_var.eql( TWELVE_INTEGER ) )
    {
      return ConsesLow.listS( $sym74$FUNCALL_CLASS_SUPER_METHOD_WITH_12_ARGS, v_class, method_name, args );
    }
    if( pcase_var.eql( THIRTEEN_INTEGER ) )
    {
      return ConsesLow.listS( $sym75$FUNCALL_CLASS_SUPER_METHOD_WITH_13_ARGS, v_class, method_name, args );
    }
    if( pcase_var.eql( FOURTEEN_INTEGER ) )
    {
      return ConsesLow.listS( $sym76$FUNCALL_CLASS_SUPER_METHOD_WITH_14_ARGS, v_class, method_name, args );
    }
    if( pcase_var.eql( FIFTEEN_INTEGER ) )
    {
      return ConsesLow.listS( $sym77$FUNCALL_CLASS_SUPER_METHOD_WITH_15_ARGS, v_class, method_name, args );
    }
    if( pcase_var.eql( SIXTEEN_INTEGER ) )
    {
      return ConsesLow.listS( $sym78$FUNCALL_CLASS_SUPER_METHOD_WITH_16_ARGS, v_class, method_name, args );
    }
    if( pcase_var.eql( SEVENTEEN_INTEGER ) )
    {
      return ConsesLow.listS( $sym79$FUNCALL_CLASS_SUPER_METHOD_WITH_17_ARGS, v_class, method_name, args );
    }
    if( pcase_var.eql( EIGHTEEN_INTEGER ) )
    {
      return ConsesLow.listS( $sym80$FUNCALL_CLASS_SUPER_METHOD_WITH_18_ARGS, v_class, method_name, args );
    }
    if( pcase_var.eql( NINETEEN_INTEGER ) )
    {
      return ConsesLow.listS( $sym81$FUNCALL_CLASS_SUPER_METHOD_WITH_19_ARGS, v_class, method_name, args );
    }
    if( pcase_var.eql( TWENTY_INTEGER ) )
    {
      return ConsesLow.listS( $sym82$FUNCALL_CLASS_SUPER_METHOD_WITH_20_ARGS, v_class, method_name, args );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/classes-utilities.lisp", position = 12968L)
  public static SubLObject fcsm(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject v_class = NIL;
    SubLObject method_name = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list39 );
    v_class = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list39 );
    method_name = current.first();
    final SubLObject args;
    current = ( args = current.rest() );
    return ConsesLow.listS( $sym83$FUNCALL_CLASS_SUPER_METHOD, v_class, method_name, args );
  }

  @SubLTranslatedFile.SubL(source = "cycl/classes-utilities.lisp", position = 13229L)
  public static SubLObject funcall_instance_method(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject instance = NIL;
    SubLObject method_name = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list84 );
    instance = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list84 );
    method_name = current.first();
    final SubLObject args;
    current = ( args = current.rest() );
    final SubLObject pcase_var;
    final SubLObject arg_count = pcase_var = Sequences.length( args );
    if( pcase_var.eql( ZERO_INTEGER ) )
    {
      return ConsesLow.list( $sym85$FUNCALL_INSTANCE_METHOD_WITH_0_ARGS, instance, method_name );
    }
    if( pcase_var.eql( ONE_INTEGER ) )
    {
      return ConsesLow.listS( $sym86$FUNCALL_INSTANCE_METHOD_WITH_1_ARGS, instance, method_name, args );
    }
    if( pcase_var.eql( TWO_INTEGER ) )
    {
      return ConsesLow.listS( $sym87$FUNCALL_INSTANCE_METHOD_WITH_2_ARGS, instance, method_name, args );
    }
    if( pcase_var.eql( THREE_INTEGER ) )
    {
      return ConsesLow.listS( $sym88$FUNCALL_INSTANCE_METHOD_WITH_3_ARGS, instance, method_name, args );
    }
    if( pcase_var.eql( FOUR_INTEGER ) )
    {
      return ConsesLow.listS( $sym89$FUNCALL_INSTANCE_METHOD_WITH_4_ARGS, instance, method_name, args );
    }
    if( pcase_var.eql( FIVE_INTEGER ) )
    {
      return ConsesLow.listS( $sym90$FUNCALL_INSTANCE_METHOD_WITH_5_ARGS, instance, method_name, args );
    }
    if( pcase_var.eql( SIX_INTEGER ) )
    {
      return ConsesLow.listS( $sym91$FUNCALL_INSTANCE_METHOD_WITH_6_ARGS, instance, method_name, args );
    }
    if( pcase_var.eql( SEVEN_INTEGER ) )
    {
      return ConsesLow.listS( $sym92$FUNCALL_INSTANCE_METHOD_WITH_7_ARGS, instance, method_name, args );
    }
    if( pcase_var.eql( EIGHT_INTEGER ) )
    {
      return ConsesLow.listS( $sym93$FUNCALL_INSTANCE_METHOD_WITH_8_ARGS, instance, method_name, args );
    }
    if( pcase_var.eql( NINE_INTEGER ) )
    {
      return ConsesLow.listS( $sym94$FUNCALL_INSTANCE_METHOD_WITH_9_ARGS, instance, method_name, args );
    }
    if( pcase_var.eql( TEN_INTEGER ) )
    {
      return ConsesLow.listS( $sym95$FUNCALL_INSTANCE_METHOD_WITH_10_ARGS, instance, method_name, args );
    }
    if( pcase_var.eql( ELEVEN_INTEGER ) )
    {
      return ConsesLow.listS( $sym96$FUNCALL_INSTANCE_METHOD_WITH_11_ARGS, instance, method_name, args );
    }
    if( pcase_var.eql( TWELVE_INTEGER ) )
    {
      return ConsesLow.listS( $sym97$FUNCALL_INSTANCE_METHOD_WITH_12_ARGS, instance, method_name, args );
    }
    if( pcase_var.eql( THIRTEEN_INTEGER ) )
    {
      return ConsesLow.listS( $sym98$FUNCALL_INSTANCE_METHOD_WITH_13_ARGS, instance, method_name, args );
    }
    if( pcase_var.eql( FOURTEEN_INTEGER ) )
    {
      return ConsesLow.listS( $sym99$FUNCALL_INSTANCE_METHOD_WITH_14_ARGS, instance, method_name, args );
    }
    if( pcase_var.eql( FIFTEEN_INTEGER ) )
    {
      return ConsesLow.listS( $sym100$FUNCALL_INSTANCE_METHOD_WITH_15_ARGS, instance, method_name, args );
    }
    if( pcase_var.eql( SIXTEEN_INTEGER ) )
    {
      return ConsesLow.listS( $sym101$FUNCALL_INSTANCE_METHOD_WITH_16_ARGS, instance, method_name, args );
    }
    if( pcase_var.eql( SEVENTEEN_INTEGER ) )
    {
      return ConsesLow.listS( $sym102$FUNCALL_INSTANCE_METHOD_WITH_17_ARGS, instance, method_name, args );
    }
    if( pcase_var.eql( EIGHTEEN_INTEGER ) )
    {
      return ConsesLow.listS( $sym103$FUNCALL_INSTANCE_METHOD_WITH_18_ARGS, instance, method_name, args );
    }
    if( pcase_var.eql( NINETEEN_INTEGER ) )
    {
      return ConsesLow.listS( $sym104$FUNCALL_INSTANCE_METHOD_WITH_19_ARGS, instance, method_name, args );
    }
    if( pcase_var.eql( TWENTY_INTEGER ) )
    {
      return ConsesLow.listS( $sym105$FUNCALL_INSTANCE_METHOD_WITH_20_ARGS, instance, method_name, args );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/classes-utilities.lisp", position = 15206L)
  public static SubLObject fim(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject v_class = NIL;
    SubLObject method_name = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list39 );
    v_class = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list39 );
    method_name = current.first();
    final SubLObject args;
    current = ( args = current.rest() );
    return ConsesLow.listS( $sym106$FUNCALL_INSTANCE_METHOD, v_class, method_name, args );
  }

  @SubLTranslatedFile.SubL(source = "cycl/classes-utilities.lisp", position = 15463L)
  public static SubLObject funcall_instance_super_method(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject instance = NIL;
    SubLObject method_name = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list84 );
    instance = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list84 );
    method_name = current.first();
    final SubLObject args;
    current = ( args = current.rest() );
    final SubLObject pcase_var;
    final SubLObject arg_count = pcase_var = Sequences.length( args );
    if( pcase_var.eql( ZERO_INTEGER ) )
    {
      return ConsesLow.list( $sym107$FUNCALL_INSTANCE_SUPER_METHOD_WITH_0_ARGS, instance, method_name );
    }
    if( pcase_var.eql( ONE_INTEGER ) )
    {
      return ConsesLow.listS( $sym108$FUNCALL_INSTANCE_SUPER_METHOD_WITH_1_ARGS, instance, method_name, args );
    }
    if( pcase_var.eql( TWO_INTEGER ) )
    {
      return ConsesLow.listS( $sym109$FUNCALL_INSTANCE_SUPER_METHOD_WITH_2_ARGS, instance, method_name, args );
    }
    if( pcase_var.eql( THREE_INTEGER ) )
    {
      return ConsesLow.listS( $sym110$FUNCALL_INSTANCE_SUPER_METHOD_WITH_3_ARGS, instance, method_name, args );
    }
    if( pcase_var.eql( FOUR_INTEGER ) )
    {
      return ConsesLow.listS( $sym111$FUNCALL_INSTANCE_SUPER_METHOD_WITH_4_ARGS, instance, method_name, args );
    }
    if( pcase_var.eql( FIVE_INTEGER ) )
    {
      return ConsesLow.listS( $sym112$FUNCALL_INSTANCE_SUPER_METHOD_WITH_5_ARGS, instance, method_name, args );
    }
    if( pcase_var.eql( SIX_INTEGER ) )
    {
      return ConsesLow.listS( $sym113$FUNCALL_INSTANCE_SUPER_METHOD_WITH_6_ARGS, instance, method_name, args );
    }
    if( pcase_var.eql( SEVEN_INTEGER ) )
    {
      return ConsesLow.listS( $sym114$FUNCALL_INSTANCE_SUPER_METHOD_WITH_7_ARGS, instance, method_name, args );
    }
    if( pcase_var.eql( EIGHT_INTEGER ) )
    {
      return ConsesLow.listS( $sym115$FUNCALL_INSTANCE_SUPER_METHOD_WITH_8_ARGS, instance, method_name, args );
    }
    if( pcase_var.eql( NINE_INTEGER ) )
    {
      return ConsesLow.listS( $sym116$FUNCALL_INSTANCE_SUPER_METHOD_WITH_9_ARGS, instance, method_name, args );
    }
    if( pcase_var.eql( TEN_INTEGER ) )
    {
      return ConsesLow.listS( $sym117$FUNCALL_INSTANCE_SUPER_METHOD_WITH_10_ARGS, instance, method_name, args );
    }
    if( pcase_var.eql( ELEVEN_INTEGER ) )
    {
      return ConsesLow.listS( $sym118$FUNCALL_INSTANCE_SUPER_METHOD_WITH_11_ARGS, instance, method_name, args );
    }
    if( pcase_var.eql( TWELVE_INTEGER ) )
    {
      return ConsesLow.listS( $sym119$FUNCALL_INSTANCE_SUPER_METHOD_WITH_12_ARGS, instance, method_name, args );
    }
    if( pcase_var.eql( THIRTEEN_INTEGER ) )
    {
      return ConsesLow.listS( $sym120$FUNCALL_INSTANCE_SUPER_METHOD_WITH_13_ARGS, instance, method_name, args );
    }
    if( pcase_var.eql( FOURTEEN_INTEGER ) )
    {
      return ConsesLow.listS( $sym121$FUNCALL_INSTANCE_SUPER_METHOD_WITH_14_ARGS, instance, method_name, args );
    }
    if( pcase_var.eql( FIFTEEN_INTEGER ) )
    {
      return ConsesLow.listS( $sym122$FUNCALL_INSTANCE_SUPER_METHOD_WITH_15_ARGS, instance, method_name, args );
    }
    if( pcase_var.eql( SIXTEEN_INTEGER ) )
    {
      return ConsesLow.listS( $sym123$FUNCALL_INSTANCE_SUPER_METHOD_WITH_16_ARGS, instance, method_name, args );
    }
    if( pcase_var.eql( SEVENTEEN_INTEGER ) )
    {
      return ConsesLow.listS( $sym124$FUNCALL_INSTANCE_SUPER_METHOD_WITH_17_ARGS, instance, method_name, args );
    }
    if( pcase_var.eql( EIGHTEEN_INTEGER ) )
    {
      return ConsesLow.listS( $sym125$FUNCALL_INSTANCE_SUPER_METHOD_WITH_18_ARGS, instance, method_name, args );
    }
    if( pcase_var.eql( NINETEEN_INTEGER ) )
    {
      return ConsesLow.listS( $sym126$FUNCALL_INSTANCE_SUPER_METHOD_WITH_19_ARGS, instance, method_name, args );
    }
    if( pcase_var.eql( TWENTY_INTEGER ) )
    {
      return ConsesLow.listS( $sym127$FUNCALL_INSTANCE_SUPER_METHOD_WITH_20_ARGS, instance, method_name, args );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/classes-utilities.lisp", position = 17572L)
  public static SubLObject fism(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject v_class = NIL;
    SubLObject method_name = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list39 );
    v_class = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list39 );
    method_name = current.first();
    final SubLObject args;
    current = ( args = current.rest() );
    return ConsesLow.listS( $sym128$FUNCALL_INSTANCE_SUPER_METHOD, v_class, method_name, args );
  }

  @SubLTranslatedFile.SubL(source = "cycl/classes-utilities.lisp", position = 17836L)
  public static SubLObject funcall_class_or_instance_method(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject instance = NIL;
    SubLObject method_name = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list84 );
    instance = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list84 );
    method_name = current.first();
    final SubLObject args;
    current = ( args = current.rest() );
    final SubLObject pcase_var;
    final SubLObject arg_count = pcase_var = Sequences.length( args );
    if( pcase_var.eql( ZERO_INTEGER ) )
    {
      return ConsesLow.list( $sym129$FUNCALL_CLASS_OR_INSTANCE_METHOD_WITH_0_ARGS, instance, method_name );
    }
    if( pcase_var.eql( ONE_INTEGER ) )
    {
      return ConsesLow.listS( $sym130$FUNCALL_CLASS_OR_INSTANCE_METHOD_WITH_1_ARGS, instance, method_name, args );
    }
    if( pcase_var.eql( TWO_INTEGER ) )
    {
      return ConsesLow.listS( $sym131$FUNCALL_CLASS_OR_INSTANCE_METHOD_WITH_2_ARGS, instance, method_name, args );
    }
    if( pcase_var.eql( THREE_INTEGER ) )
    {
      return ConsesLow.listS( $sym132$FUNCALL_CLASS_OR_INSTANCE_METHOD_WITH_3_ARGS, instance, method_name, args );
    }
    if( pcase_var.eql( FOUR_INTEGER ) )
    {
      return ConsesLow.listS( $sym133$FUNCALL_CLASS_OR_INSTANCE_METHOD_WITH_4_ARGS, instance, method_name, args );
    }
    if( pcase_var.eql( FIVE_INTEGER ) )
    {
      return ConsesLow.listS( $sym134$FUNCALL_CLASS_OR_INSTANCE_METHOD_WITH_5_ARGS, instance, method_name, args );
    }
    if( pcase_var.eql( SIX_INTEGER ) )
    {
      return ConsesLow.listS( $sym135$FUNCALL_CLASS_OR_INSTANCE_METHOD_WITH_6_ARGS, instance, method_name, args );
    }
    if( pcase_var.eql( SEVEN_INTEGER ) )
    {
      return ConsesLow.listS( $sym136$FUNCALL_CLASS_OR_INSTANCE_METHOD_WITH_7_ARGS, instance, method_name, args );
    }
    if( pcase_var.eql( EIGHT_INTEGER ) )
    {
      return ConsesLow.listS( $sym137$FUNCALL_CLASS_OR_INSTANCE_METHOD_WITH_8_ARGS, instance, method_name, args );
    }
    if( pcase_var.eql( NINE_INTEGER ) )
    {
      return ConsesLow.listS( $sym138$FUNCALL_CLASS_OR_INSTANCE_METHOD_WITH_9_ARGS, instance, method_name, args );
    }
    if( pcase_var.eql( TEN_INTEGER ) )
    {
      return ConsesLow.listS( $sym139$FUNCALL_CLASS_OR_INSTANCE_METHOD_WITH_10_ARGS, instance, method_name, args );
    }
    if( pcase_var.eql( ELEVEN_INTEGER ) )
    {
      return ConsesLow.listS( $sym140$FUNCALL_CLASS_OR_INSTANCE_METHOD_WITH_11_ARGS, instance, method_name, args );
    }
    if( pcase_var.eql( TWELVE_INTEGER ) )
    {
      return ConsesLow.listS( $sym141$FUNCALL_CLASS_OR_INSTANCE_METHOD_WITH_12_ARGS, instance, method_name, args );
    }
    if( pcase_var.eql( THIRTEEN_INTEGER ) )
    {
      return ConsesLow.listS( $sym142$FUNCALL_CLASS_OR_INSTANCE_METHOD_WITH_13_ARGS, instance, method_name, args );
    }
    if( pcase_var.eql( FOURTEEN_INTEGER ) )
    {
      return ConsesLow.listS( $sym143$FUNCALL_CLASS_OR_INSTANCE_METHOD_WITH_14_ARGS, instance, method_name, args );
    }
    if( pcase_var.eql( FIFTEEN_INTEGER ) )
    {
      return ConsesLow.listS( $sym144$FUNCALL_CLASS_OR_INSTANCE_METHOD_WITH_15_ARGS, instance, method_name, args );
    }
    if( pcase_var.eql( SIXTEEN_INTEGER ) )
    {
      return ConsesLow.listS( $sym145$FUNCALL_CLASS_OR_INSTANCE_METHOD_WITH_16_ARGS, instance, method_name, args );
    }
    if( pcase_var.eql( SEVENTEEN_INTEGER ) )
    {
      return ConsesLow.listS( $sym146$FUNCALL_CLASS_OR_INSTANCE_METHOD_WITH_17_ARGS, instance, method_name, args );
    }
    if( pcase_var.eql( EIGHTEEN_INTEGER ) )
    {
      return ConsesLow.listS( $sym147$FUNCALL_CLASS_OR_INSTANCE_METHOD_WITH_18_ARGS, instance, method_name, args );
    }
    if( pcase_var.eql( NINETEEN_INTEGER ) )
    {
      return ConsesLow.listS( $sym148$FUNCALL_CLASS_OR_INSTANCE_METHOD_WITH_19_ARGS, instance, method_name, args );
    }
    if( pcase_var.eql( TWENTY_INTEGER ) )
    {
      return ConsesLow.listS( $sym149$FUNCALL_CLASS_OR_INSTANCE_METHOD_WITH_20_ARGS, instance, method_name, args );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/classes-utilities.lisp", position = 20011L)
  public static SubLObject apply_instance_method(final SubLObject instance, final SubLObject method_name, final SubLObject args)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && ( NIL == subloop_structures.instance_p( instance ) || !method_name.isSymbol() ) )
    {
      Errors.error( $str150$APPLY_INSTANCE_METHOD__either_ins, instance, method_name );
    }
    final SubLObject v_class = subloop_structures.instance_class( instance );
    final SubLObject method = Hashtables.gethash( method_name, subloop_structures.class_tablified_instance_methods( v_class ), UNPROVIDED );
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == method )
    {
      Errors.error( $str151$APPLY_INSTANCE_METHOD__No__S_meth, method_name, subloop_structures.class_name( v_class ), instance );
    }
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == instances.instances_access_check_method( v_class, method ) )
    {
      Errors.error( $classes_utilities_illegal_access_message$.getGlobalValue(), method_name, subloop_structures.class_name( v_class ) );
    }
    return Functions.apply( subloop_structures.method_function_name( method ), instance, args );
  }

  @SubLTranslatedFile.SubL(source = "cycl/classes-utilities.lisp", position = 20792L)
  public static SubLObject fim_nr(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject instance = NIL;
    SubLObject method_name = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list84 );
    instance = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list84 );
    method_name = current.first();
    final SubLObject args;
    current = ( args = current.rest() );
    return ConsesLow.list( $sym152$FUNCALL_INSTANCE_METHOD_W_O_RECURSION, instance, method_name, args );
  }

  @SubLTranslatedFile.SubL(source = "cycl/classes-utilities.lisp", position = 20930L)
  public static SubLObject funcall_instance_method_wXo_recursion(final SubLObject instance, final SubLObject method_name, final SubLObject args)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject result = NIL;
    final SubLObject key = ConsesLow.list( instance, method_name, args );
    final SubLObject _prev_bind_0 = $method_call_stack$.currentBinding( thread );
    try
    {
      $method_call_stack$.bind( ( NIL != $method_call_stack$.getDynamicValue( thread ) ) ? $method_call_stack$.getDynamicValue( thread ) : Hashtables.make_hash_table( TWENTY_INTEGER, EQUAL, UNPROVIDED ), thread );
      if( NIL == Hashtables.gethash( key, $method_call_stack$.getDynamicValue( thread ), UNPROVIDED ) )
      {
        try
        {
          Hashtables.sethash( key, $method_call_stack$.getDynamicValue( thread ), T );
          result = apply_instance_method( instance, method_name, args );
        }
        finally
        {
          final SubLObject _prev_bind_0_$1 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
          try
          {
            Threads.$is_thread_performing_cleanupP$.bind( T, thread );
            final SubLObject _values = Values.getValuesAsVector();
            Hashtables.remhash( key, $method_call_stack$.getDynamicValue( thread ) );
            Values.restoreValuesFromVector( _values );
          }
          finally
          {
            Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$1, thread );
          }
        }
      }
    }
    finally
    {
      $method_call_stack$.rebind( _prev_bind_0, thread );
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/classes-utilities.lisp", position = 21447L)
  public static SubLObject classes_symbol_list_p(final SubLObject v_object)
  {
    if( NIL == v_object )
    {
      return T;
    }
    if( v_object.isCons() )
    {
      SubLObject cdolist_list_var = v_object;
      SubLObject element = NIL;
      element = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        if( !element.isSymbol() )
        {
          return NIL;
        }
        cdolist_list_var = cdolist_list_var.rest();
        element = cdolist_list_var.first();
      }
      return T;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/classes-utilities.lisp", position = 21652L)
  public static SubLObject classes_npartition_list(final SubLObject item, final SubLObject sequence, SubLObject key, SubLObject test)
  {
    if( key == UNPROVIDED )
    {
      key = IDENTITY;
    }
    if( test == UNPROVIDED )
    {
      test = EQ;
    }
    SubLObject match_list = NIL;
    SubLObject not_match_list = NIL;
    SubLObject element_dekeyed = NIL;
    SubLObject match = NIL;
    SubLObject next_cons_var = NIL;
    SubLObject sublist = NIL;
    SubLObject element = NIL;
    sublist = sequence;
    element = sublist.first();
    while ( NIL != sublist)
    {
      next_cons_var = sublist.rest();
      SubLObject pcase_var = key;
      if( pcase_var.eql( IDENTITY ) )
      {
        element_dekeyed = Equality.identity( element );
      }
      else if( pcase_var.eql( $sym153$CAR ) )
      {
        element_dekeyed = element.first();
      }
      else
      {
        element_dekeyed = Functions.funcall( key, element );
      }
      pcase_var = test;
      if( pcase_var.eql( EQ ) )
      {
        match = Equality.eq( item, element_dekeyed );
      }
      else if( pcase_var.eql( EQL ) )
      {
        match = Equality.eql( item, element_dekeyed );
      }
      else if( pcase_var.eql( EQUAL ) )
      {
        match = Equality.equal( item, element_dekeyed );
      }
      else if( pcase_var.eql( $sym154$_ ) )
      {
        match = Numbers.numE( item, element_dekeyed );
      }
      else if( pcase_var.eql( $sym155$STRING_EQUAL ) )
      {
        match = Strings.string_equal( item, element_dekeyed, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      }
      else
      {
        match = Functions.funcall( test, item, element_dekeyed );
      }
      if( NIL != match )
      {
        ConsesLow.rplacd( sublist, match_list );
        match_list = sublist;
      }
      else
      {
        ConsesLow.rplacd( sublist, not_match_list );
        not_match_list = sublist;
      }
      sublist = next_cons_var;
      element = sublist.first();
    }
    return Values.values( Sequences.nreverse( match_list ), Sequences.nreverse( not_match_list ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/classes-utilities.lisp", position = 22295L)
  public static SubLObject classes_npartition_list_macro(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list156 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject settable_match_loc = NIL;
    SubLObject settable_no_match_loc = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list156 );
    settable_match_loc = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list156 );
    settable_no_match_loc = current.first();
    current = current.rest();
    if( NIL == current )
    {
      current = temp;
      SubLObject item = NIL;
      SubLObject sequence = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list156 );
      item = current.first();
      current = current.rest();
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list156 );
      sequence = current.first();
      current = current.rest();
      final SubLObject key = current.isCons() ? current.first() : IDENTITY;
      cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list156 );
      current = current.rest();
      final SubLObject test = current.isCons() ? current.first() : EQ;
      cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list156 );
      current = current.rest();
      if( NIL == current )
      {
        final SubLObject item_var = Symbols.make_symbol( $str157$item );
        final SubLObject match_list_var = Symbols.make_symbol( $str158$match_list );
        final SubLObject not_match_list_var = Symbols.make_symbol( $str159$not_match_list );
        final SubLObject element_var = Symbols.make_symbol( $str160$element );
        final SubLObject sublist_var = Symbols.make_symbol( $str161$sublist );
        return ConsesLow.list( $sym7$CLET, ConsesLow.list( ConsesLow.list( item_var, item ), reader.bq_cons( match_list_var, $list162 ), reader.bq_cons( not_match_list_var, $list162 ) ), ConsesLow.list(
            $sym163$CDOLIST_AND_SUBLISTS_CAREFULLY, ConsesLow.list( element_var, sublist_var, sequence ), ConsesLow.list( $sym29$PIF, ConsesLow.list( test, ConsesLow.list( key, element_var ), item_var ), ConsesLow.list(
                $sym20$PROGN, ConsesLow.list( $sym164$RPLACD, sublist_var, match_list_var ), ConsesLow.list( $sym165$CSETQ, match_list_var, sublist_var ) ), ConsesLow.list( $sym20$PROGN, ConsesLow.list( $sym164$RPLACD,
                    sublist_var, not_match_list_var ), ConsesLow.list( $sym165$CSETQ, not_match_list_var, sublist_var ) ) ) ), ConsesLow.list( $sym166$CSETF, settable_match_loc, ConsesLow.list( $sym167$NREVERSE,
                        match_list_var ) ), ConsesLow.list( $sym166$CSETF, settable_no_match_loc, ConsesLow.list( $sym167$NREVERSE, not_match_list_var ) ) );
      }
      cdestructuring_bind.cdestructuring_bind_error( datum, $list156 );
    }
    else
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list156 );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/classes-utilities.lisp", position = 23214L)
  public static SubLObject classes_check_do_classes_in_order_parameters(final SubLObject var, final SubLObject base_class, final SubLObject listed_optional_depth_var, final SubLObject forms)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && ( !var.isSymbol() || NIL == var ) )
    {
      Errors.error( $str168$DO_CLASSES_IN_ORDER___S_is_not_a_, var );
    }
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL != listed_optional_depth_var && ( !listed_optional_depth_var.isCons() || !listed_optional_depth_var.first().isSymbol()
        || NIL == listed_optional_depth_var.first() || NIL != listed_optional_depth_var.rest() ) )
    {
      Errors.error( $str169$DO_CLASSES_IN_ORDER___S_is_not_a_, listed_optional_depth_var );
    }
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && !forms.isList() )
    {
      Errors.error( $str170$DO_CLASSES_IN_ORDER___S_is_not_a_, forms );
    }
    return T;
  }

  @SubLTranslatedFile.SubL(source = "cycl/classes-utilities.lisp", position = 23988L)
  public static SubLObject method_bound_p(final SubLObject class_or_class_symbol, final SubLObject method_symbol)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject v_class = class_or_class_symbol;
    if( v_class.isSymbol() )
    {
      v_class = classes.classes_retrieve_class( v_class );
    }
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == subloop_structures.class_p( v_class ) )
    {
      Errors.error( $str171$Class__A_not_recognized_, class_or_class_symbol );
    }
    final SubLObject method = Hashtables.gethash( method_symbol, subloop_structures.class_tablified_instance_methods( v_class ), UNPROVIDED );
    if( NIL == subloop_structures.method_p( method ) )
    {
      return NIL;
    }
    final SubLObject method_function = subloop_structures.method_function_name( method );
    return Symbols.fboundp( method_function );
  }

  @SubLTranslatedFile.SubL(source = "cycl/classes-utilities.lisp", position = 24705L)
  public static SubLObject valid_subloop_safe_funcaller_error_values()
  {
    return $valid_subloop_safe_funcaller_error_values$.getGlobalValue();
  }

  @SubLTranslatedFile.SubL(source = "cycl/classes-utilities.lisp", position = 24705L)
  public static SubLObject subloop_safe_funcaller_error_value_p(final SubLObject v_object)
  {
    return ( NIL != conses_high.member( v_object, $valid_subloop_safe_funcaller_error_values$.getGlobalValue(), UNPROVIDED, UNPROVIDED ) ) ? T : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/classes-utilities.lisp", position = 24705L)
  public static SubLObject encode_subloop_safe_funcaller_error_value(final SubLObject value)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject pos = Sequences.position( value, $valid_subloop_safe_funcaller_error_values$.getGlobalValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == pos )
    {
      Errors.error( $str174$_S___S_is_not_a_member_of_the__S_, $sym175$ENCODE_SUBLOOP_SAFE_FUNCALLER_ERROR_VALUE, value, $sym173$SUBLOOP_SAFE_FUNCALLER_ERROR_VALUE );
    }
    return pos;
  }

  @SubLTranslatedFile.SubL(source = "cycl/classes-utilities.lisp", position = 24705L)
  public static SubLObject decode_subloop_safe_funcaller_error_value(final SubLObject value)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject element = ConsesLow.nth( value, $valid_subloop_safe_funcaller_error_values$.getGlobalValue() );
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == element )
    {
      Errors.error( $str176$_S___S_is_not_a_valid_encoding_of, $sym177$DECODE_SUBLOOP_SAFE_FUNCALLER_ERROR_VALUE, value, $sym173$SUBLOOP_SAFE_FUNCALLER_ERROR_VALUE );
    }
    return element;
  }

  @SubLTranslatedFile.SubL(source = "cycl/classes-utilities.lisp", position = 24705L)
  public static SubLObject subloop_safe_funcaller_error_value_less_p(final SubLObject value1, final SubLObject value2)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == subloop_safe_funcaller_error_value_p( value1 ) )
    {
      Errors.error( $str178$_S___S_was_expected_to_be_a_membe, $sym179$SUBLOOP_SAFE_FUNCALLER_ERROR_VALUE_P, value1, $sym173$SUBLOOP_SAFE_FUNCALLER_ERROR_VALUE );
    }
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == subloop_safe_funcaller_error_value_p( value2 ) )
    {
      Errors.error( $str178$_S___S_was_expected_to_be_a_membe, $sym179$SUBLOOP_SAFE_FUNCALLER_ERROR_VALUE_P, value2, $sym173$SUBLOOP_SAFE_FUNCALLER_ERROR_VALUE );
    }
    SubLObject cdolist_list_var = $valid_subloop_safe_funcaller_error_values$.getGlobalValue();
    SubLObject value3 = NIL;
    value3 = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( value3.eql( value1 ) )
      {
        return makeBoolean( !value3.eql( value2 ) );
      }
      if( value3.eql( value2 ) )
      {
        return NIL;
      }
      cdolist_list_var = cdolist_list_var.rest();
      value3 = cdolist_list_var.first();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/classes-utilities.lisp", position = 24705L)
  public static SubLObject subloop_safe_funcaller_error_value_greater_p(final SubLObject value1, final SubLObject value2)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == subloop_safe_funcaller_error_value_p( value1 ) )
    {
      Errors.error( $str178$_S___S_was_expected_to_be_a_membe, $sym179$SUBLOOP_SAFE_FUNCALLER_ERROR_VALUE_P, value1, $sym173$SUBLOOP_SAFE_FUNCALLER_ERROR_VALUE );
    }
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == subloop_safe_funcaller_error_value_p( value2 ) )
    {
      Errors.error( $str178$_S___S_was_expected_to_be_a_membe, $sym179$SUBLOOP_SAFE_FUNCALLER_ERROR_VALUE_P, value2, $sym173$SUBLOOP_SAFE_FUNCALLER_ERROR_VALUE );
    }
    SubLObject cdolist_list_var = $valid_subloop_safe_funcaller_error_values$.getGlobalValue();
    SubLObject value3 = NIL;
    value3 = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( value3.eql( value2 ) )
      {
        return makeBoolean( !value3.eql( value1 ) );
      }
      if( value3.eql( value1 ) )
      {
        return NIL;
      }
      cdolist_list_var = cdolist_list_var.rest();
      value3 = cdolist_list_var.first();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/classes-utilities.lisp", position = 24978L)
  public static SubLObject define_safe_class_method_funcallers(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject name_template = NIL;
    SubLObject max_args = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list3 );
    name_template = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list3 );
    max_args = current.first();
    current = current.rest();
    if( NIL == current )
    {
      SubLObject function_defs = NIL;
      SubLObject arg_list = NIL;
      SubLObject function_name = NIL;
      SubLObject function_def = NIL;
      SubLObject cdotimes_end_var;
      SubLObject i;
      for( cdotimes_end_var = Numbers.add( max_args, ONE_INTEGER ), i = NIL, i = ZERO_INTEGER; i.numL( cdotimes_end_var ); i = Numbers.add( i, ONE_INTEGER ) )
      {
        function_name = Packages.intern( PrintLow.format( NIL, name_template, i ), UNPROVIDED );
        function_def = conses_high.copy_tree( ConsesLow.list( $sym4$DEFINE_PUBLIC, function_name, ConsesLow.listS( $sym5$CLASS_NAME_OR_CLASS, $sym6$METHOD_NAME, arg_list ), ConsesLow.list( $sym7$CLET, $list8, $list180,
            $list181, ConsesLow.list( $sym7$CLET, $list11, $list182, $list183, ConsesLow.list( $sym7$CLET, $list184, $list185, ConsesLow.list( $sym14$RET, ConsesLow.listS( $sym186$VALUES, ConsesLow.listS( $sym15$FUNCALL,
                $sym187$FUNCTION_REF, $sym17$CLASS, arg_list ), $list162 ) ) ) ) ) ) );
        function_defs = ConsesLow.cons( function_def, function_defs );
        arg_list = Sequences.nreverse( ConsesLow.cons( Packages.intern( PrintLow.format( NIL, $str19$ARG_S, i ), UNPROVIDED ), Sequences.nreverse( arg_list ) ) );
      }
      return reader.bq_cons( $sym20$PROGN, Sequences.nreverse( function_defs ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list3 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/classes-utilities.lisp", position = 26448L)
  public static SubLObject define_safe_class_super_method_funcallers(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject name_template = NIL;
    SubLObject max_args = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list3 );
    name_template = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list3 );
    max_args = current.first();
    current = current.rest();
    if( NIL == current )
    {
      SubLObject function_defs = NIL;
      SubLObject arg_list = NIL;
      SubLObject function_name = NIL;
      SubLObject function_def = NIL;
      SubLObject cdotimes_end_var;
      SubLObject i;
      for( cdotimes_end_var = Numbers.add( max_args, ONE_INTEGER ), i = NIL, i = ZERO_INTEGER; i.numL( cdotimes_end_var ); i = Numbers.add( i, ONE_INTEGER ) )
      {
        function_name = Packages.intern( PrintLow.format( NIL, name_template, i ), UNPROVIDED );
        function_def = conses_high.copy_tree( ConsesLow.list( $sym4$DEFINE_PUBLIC, function_name, ConsesLow.listS( $sym5$CLASS_NAME_OR_CLASS, $sym6$METHOD_NAME, arg_list ), ConsesLow.list( $sym7$CLET, $list8, $list180,
            $list181, ConsesLow.list( $sym7$CLET, $list23, $list182, $list183, ConsesLow.list( $sym7$CLET, $list184, $list185, ConsesLow.list( $sym14$RET, ConsesLow.listS( $sym186$VALUES, ConsesLow.listS( $sym15$FUNCALL,
                $sym187$FUNCTION_REF, $sym17$CLASS, arg_list ), $list162 ) ) ) ) ) ) );
        function_defs = ConsesLow.cons( function_def, function_defs );
        arg_list = Sequences.nreverse( ConsesLow.cons( Packages.intern( PrintLow.format( NIL, $str19$ARG_S, i ), UNPROVIDED ), Sequences.nreverse( arg_list ) ) );
      }
      return reader.bq_cons( $sym20$PROGN, Sequences.nreverse( function_defs ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list3 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/classes-utilities.lisp", position = 27940L)
  public static SubLObject define_safe_instance_method_funcallers(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject name_template = NIL;
    SubLObject class_name_template = NIL;
    SubLObject max_args = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list25 );
    name_template = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list25 );
    class_name_template = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list25 );
    max_args = current.first();
    current = current.rest();
    if( NIL == current )
    {
      SubLObject function_defs = NIL;
      SubLObject arg_list = NIL;
      SubLObject function_name = NIL;
      SubLObject class_function_name = NIL;
      SubLObject function_def = NIL;
      SubLObject cdotimes_end_var;
      SubLObject i;
      for( cdotimes_end_var = Numbers.add( max_args, ONE_INTEGER ), i = NIL, i = ZERO_INTEGER; i.numL( cdotimes_end_var ); i = Numbers.add( i, ONE_INTEGER ) )
      {
        function_name = Packages.intern( PrintLow.format( NIL, name_template, i ), UNPROVIDED );
        class_function_name = Packages.intern( PrintLow.format( NIL, class_name_template, i ), UNPROVIDED );
        function_def = conses_high.copy_tree( ConsesLow.list( $sym4$DEFINE_PUBLIC, function_name, ConsesLow.listS( $sym26$INSTANCE, $sym6$METHOD_NAME, arg_list ), $list188, $list181, ConsesLow.list( $sym7$CLET, $list28,
            ConsesLow.list( $sym29$PIF, $sym30$METHOD, ConsesLow.list( $sym20$PROGN, $list183, ConsesLow.list( $sym7$CLET, $list184, $list185, ConsesLow.list( $sym14$RET, ConsesLow.listS( $sym186$VALUES, ConsesLow.listS(
                $sym15$FUNCALL, $sym187$FUNCTION_REF, $sym26$INSTANCE, arg_list ), $list162 ) ) ) ), ConsesLow.list( $sym14$RET, ConsesLow.listS( class_function_name, $sym17$CLASS, $sym6$METHOD_NAME,
                    arg_list ) ) ) ) ) );
        function_defs = ConsesLow.cons( function_def, function_defs );
        arg_list = Sequences.nreverse( ConsesLow.cons( Packages.intern( PrintLow.format( NIL, $str19$ARG_S, i ), UNPROVIDED ), Sequences.nreverse( arg_list ) ) );
      }
      return reader.bq_cons( $sym20$PROGN, Sequences.nreverse( function_defs ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list25 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/classes-utilities.lisp", position = 29337L)
  public static SubLObject define_safe_instance_super_method_funcallers(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject name_template = NIL;
    SubLObject class_name_template = NIL;
    SubLObject max_args = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list25 );
    name_template = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list25 );
    class_name_template = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list25 );
    max_args = current.first();
    current = current.rest();
    if( NIL == current )
    {
      SubLObject function_defs = NIL;
      SubLObject arg_list = NIL;
      SubLObject function_name = NIL;
      SubLObject class_function_name = NIL;
      SubLObject function_def = NIL;
      SubLObject cdotimes_end_var;
      SubLObject i;
      for( cdotimes_end_var = Numbers.add( max_args, ONE_INTEGER ), i = NIL, i = ZERO_INTEGER; i.numL( cdotimes_end_var ); i = Numbers.add( i, ONE_INTEGER ) )
      {
        function_name = Packages.intern( PrintLow.format( NIL, name_template, i ), UNPROVIDED );
        class_function_name = Packages.intern( PrintLow.format( NIL, class_name_template, i ), UNPROVIDED );
        function_def = conses_high.copy_tree( ConsesLow.list( $sym4$DEFINE_PUBLIC, function_name, ConsesLow.listS( $sym26$INSTANCE, $sym6$METHOD_NAME, arg_list ), $list188, $list189, ConsesLow.list( $sym7$CLET, $list31,
            ConsesLow.list( $sym29$PIF, $sym30$METHOD, ConsesLow.list( $sym20$PROGN, $list183, ConsesLow.list( $sym7$CLET, $list184, $list185, ConsesLow.list( $sym14$RET, ConsesLow.listS( $sym186$VALUES, ConsesLow.listS(
                $sym15$FUNCALL, $sym187$FUNCTION_REF, $sym26$INSTANCE, arg_list ), $list162 ) ) ) ), ConsesLow.list( $sym14$RET, ConsesLow.listS( class_function_name, $sym17$CLASS, $sym6$METHOD_NAME,
                    arg_list ) ) ) ) ) );
        function_defs = ConsesLow.cons( function_def, function_defs );
        arg_list = Sequences.nreverse( ConsesLow.cons( Packages.intern( PrintLow.format( NIL, $str19$ARG_S, i ), UNPROVIDED ), Sequences.nreverse( arg_list ) ) );
      }
      return reader.bq_cons( $sym20$PROGN, Sequences.nreverse( function_defs ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list25 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/classes-utilities.lisp", position = 30751L)
  public static SubLObject define_safe_class_or_instance_method_funcallers(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject name_template = NIL;
    SubLObject max_args = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list3 );
    name_template = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list3 );
    max_args = current.first();
    current = current.rest();
    if( NIL == current )
    {
      SubLObject function_defs = NIL;
      SubLObject arg_list = NIL;
      SubLObject function_name = NIL;
      SubLObject function_def = NIL;
      SubLObject cdotimes_end_var;
      SubLObject i;
      for( cdotimes_end_var = Numbers.add( max_args, ONE_INTEGER ), i = NIL, i = ZERO_INTEGER; i.numL( cdotimes_end_var ); i = Numbers.add( i, ONE_INTEGER ) )
      {
        function_name = Packages.intern( PrintLow.format( NIL, name_template, i ), UNPROVIDED );
        function_def = conses_high.copy_tree( ConsesLow.list( $sym4$DEFINE_PUBLIC, function_name, ConsesLow.listS( $sym32$CLASS_OR_INSTANCE, $sym6$METHOD_NAME, arg_list ), $list181, ConsesLow.list( $sym29$PIF, $list34,
            ConsesLow.list( $sym7$CLET, $list35, ConsesLow.listS( $sym29$PIF, $sym30$METHOD, ConsesLow.list( $sym20$PROGN, $list183, ConsesLow.list( $sym7$CLET, $list184, $list185, ConsesLow.list( $sym14$RET, ConsesLow
                .listS( $sym186$VALUES, ConsesLow.listS( $sym15$FUNCALL, $sym187$FUNCTION_REF, $sym32$CLASS_OR_INSTANCE, arg_list ), $list162 ) ) ) ), $list190 ) ), ConsesLow.list( $sym7$CLET, $list37, $list180,
                    $list191, $list192, ConsesLow.list( $sym7$CLET, $list184, $list185, ConsesLow.list( $sym14$RET, ConsesLow.listS( $sym186$VALUES, ConsesLow.listS( $sym15$FUNCALL, $sym187$FUNCTION_REF, $sym17$CLASS,
                        arg_list ), $list162 ) ) ) ) ) ) );
        function_defs = ConsesLow.cons( function_def, function_defs );
        arg_list = Sequences.nreverse( ConsesLow.cons( Packages.intern( PrintLow.format( NIL, $str19$ARG_S, i ), UNPROVIDED ), Sequences.nreverse( arg_list ) ) );
      }
      return reader.bq_cons( $sym20$PROGN, Sequences.nreverse( function_defs ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list3 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/classes-utilities.lisp", position = 32722L)
  public static SubLObject safe_funcall_class_method(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject v_class = NIL;
    SubLObject method_name = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list39 );
    v_class = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list39 );
    method_name = current.first();
    final SubLObject args;
    current = ( args = current.rest() );
    final SubLObject pcase_var;
    final SubLObject arg_count = pcase_var = Sequences.length( args );
    if( pcase_var.eql( ZERO_INTEGER ) )
    {
      return ConsesLow.list( $sym193$SAFE_FUNCALL_CLASS_METHOD_WITH_0_ARGS, v_class, method_name );
    }
    if( pcase_var.eql( ONE_INTEGER ) )
    {
      return ConsesLow.listS( $sym194$SAFE_FUNCALL_CLASS_METHOD_WITH_1_ARGS, v_class, method_name, args );
    }
    if( pcase_var.eql( TWO_INTEGER ) )
    {
      return ConsesLow.listS( $sym195$SAFE_FUNCALL_CLASS_METHOD_WITH_2_ARGS, v_class, method_name, args );
    }
    if( pcase_var.eql( THREE_INTEGER ) )
    {
      return ConsesLow.listS( $sym196$SAFE_FUNCALL_CLASS_METHOD_WITH_3_ARGS, v_class, method_name, args );
    }
    if( pcase_var.eql( FOUR_INTEGER ) )
    {
      return ConsesLow.listS( $sym197$SAFE_FUNCALL_CLASS_METHOD_WITH_4_ARGS, v_class, method_name, args );
    }
    if( pcase_var.eql( FIVE_INTEGER ) )
    {
      return ConsesLow.listS( $sym198$SAFE_FUNCALL_CLASS_METHOD_WITH_5_ARGS, v_class, method_name, args );
    }
    if( pcase_var.eql( SIX_INTEGER ) )
    {
      return ConsesLow.listS( $sym199$SAFE_FUNCALL_CLASS_METHOD_WITH_6_ARGS, v_class, method_name, args );
    }
    if( pcase_var.eql( SEVEN_INTEGER ) )
    {
      return ConsesLow.listS( $sym200$SAFE_FUNCALL_CLASS_METHOD_WITH_7_ARGS, v_class, method_name, args );
    }
    if( pcase_var.eql( EIGHT_INTEGER ) )
    {
      return ConsesLow.listS( $sym201$SAFE_FUNCALL_CLASS_METHOD_WITH_8_ARGS, v_class, method_name, args );
    }
    if( pcase_var.eql( NINE_INTEGER ) )
    {
      return ConsesLow.listS( $sym202$SAFE_FUNCALL_CLASS_METHOD_WITH_9_ARGS, v_class, method_name, args );
    }
    if( pcase_var.eql( TEN_INTEGER ) )
    {
      return ConsesLow.listS( $sym203$SAFE_FUNCALL_CLASS_METHOD_WITH_10_ARGS, v_class, method_name, args );
    }
    if( pcase_var.eql( ELEVEN_INTEGER ) )
    {
      return ConsesLow.listS( $sym204$SAFE_FUNCALL_CLASS_METHOD_WITH_11_ARGS, v_class, method_name, args );
    }
    if( pcase_var.eql( TWELVE_INTEGER ) )
    {
      return ConsesLow.listS( $sym205$SAFE_FUNCALL_CLASS_METHOD_WITH_12_ARGS, v_class, method_name, args );
    }
    if( pcase_var.eql( THIRTEEN_INTEGER ) )
    {
      return ConsesLow.listS( $sym206$SAFE_FUNCALL_CLASS_METHOD_WITH_13_ARGS, v_class, method_name, args );
    }
    if( pcase_var.eql( FOURTEEN_INTEGER ) )
    {
      return ConsesLow.listS( $sym207$SAFE_FUNCALL_CLASS_METHOD_WITH_14_ARGS, v_class, method_name, args );
    }
    if( pcase_var.eql( FIFTEEN_INTEGER ) )
    {
      return ConsesLow.listS( $sym208$SAFE_FUNCALL_CLASS_METHOD_WITH_15_ARGS, v_class, method_name, args );
    }
    if( pcase_var.eql( SIXTEEN_INTEGER ) )
    {
      return ConsesLow.listS( $sym209$SAFE_FUNCALL_CLASS_METHOD_WITH_16_ARGS, v_class, method_name, args );
    }
    if( pcase_var.eql( SEVENTEEN_INTEGER ) )
    {
      return ConsesLow.listS( $sym210$SAFE_FUNCALL_CLASS_METHOD_WITH_17_ARGS, v_class, method_name, args );
    }
    if( pcase_var.eql( EIGHTEEN_INTEGER ) )
    {
      return ConsesLow.listS( $sym211$SAFE_FUNCALL_CLASS_METHOD_WITH_18_ARGS, v_class, method_name, args );
    }
    if( pcase_var.eql( NINETEEN_INTEGER ) )
    {
      return ConsesLow.listS( $sym212$SAFE_FUNCALL_CLASS_METHOD_WITH_19_ARGS, v_class, method_name, args );
    }
    if( pcase_var.eql( TWENTY_INTEGER ) )
    {
      return ConsesLow.listS( $sym213$SAFE_FUNCALL_CLASS_METHOD_WITH_20_ARGS, v_class, method_name, args );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/classes-utilities.lisp", position = 34698L)
  public static SubLObject sfcm(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject v_class = NIL;
    SubLObject method_name = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list39 );
    v_class = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list39 );
    method_name = current.first();
    final SubLObject args;
    current = ( args = current.rest() );
    return ConsesLow.listS( $sym214$SAFE_FUNCALL_CLASS_METHOD, v_class, method_name, args );
  }

  @SubLTranslatedFile.SubL(source = "cycl/classes-utilities.lisp", position = 34958L)
  public static SubLObject safe_funcall_class_super_method(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject v_class = NIL;
    SubLObject method_name = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list39 );
    v_class = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list39 );
    method_name = current.first();
    final SubLObject args;
    current = ( args = current.rest() );
    final SubLObject pcase_var;
    final SubLObject arg_count = pcase_var = Sequences.length( args );
    if( pcase_var.eql( ZERO_INTEGER ) )
    {
      return ConsesLow.list( $sym215$SAFE_FUNCALL_CLASS_SUPER_METHOD_WITH_0_ARGS, v_class, method_name );
    }
    if( pcase_var.eql( ONE_INTEGER ) )
    {
      return ConsesLow.listS( $sym216$SAFE_FUNCALL_CLASS_SUPER_METHOD_WITH_1_ARGS, v_class, method_name, args );
    }
    if( pcase_var.eql( TWO_INTEGER ) )
    {
      return ConsesLow.listS( $sym217$SAFE_FUNCALL_CLASS_SUPER_METHOD_WITH_2_ARGS, v_class, method_name, args );
    }
    if( pcase_var.eql( THREE_INTEGER ) )
    {
      return ConsesLow.listS( $sym218$SAFE_FUNCALL_CLASS_SUPER_METHOD_WITH_3_ARGS, v_class, method_name, args );
    }
    if( pcase_var.eql( FOUR_INTEGER ) )
    {
      return ConsesLow.listS( $sym219$SAFE_FUNCALL_CLASS_SUPER_METHOD_WITH_4_ARGS, v_class, method_name, args );
    }
    if( pcase_var.eql( FIVE_INTEGER ) )
    {
      return ConsesLow.listS( $sym220$SAFE_FUNCALL_CLASS_SUPER_METHOD_WITH_5_ARGS, v_class, method_name, args );
    }
    if( pcase_var.eql( SIX_INTEGER ) )
    {
      return ConsesLow.listS( $sym221$SAFE_FUNCALL_CLASS_SUPER_METHOD_WITH_6_ARGS, v_class, method_name, args );
    }
    if( pcase_var.eql( SEVEN_INTEGER ) )
    {
      return ConsesLow.listS( $sym222$SAFE_FUNCALL_CLASS_SUPER_METHOD_WITH_7_ARGS, v_class, method_name, args );
    }
    if( pcase_var.eql( EIGHT_INTEGER ) )
    {
      return ConsesLow.listS( $sym223$SAFE_FUNCALL_CLASS_SUPER_METHOD_WITH_8_ARGS, v_class, method_name, args );
    }
    if( pcase_var.eql( NINE_INTEGER ) )
    {
      return ConsesLow.listS( $sym224$SAFE_FUNCALL_CLASS_SUPER_METHOD_WITH_9_ARGS, v_class, method_name, args );
    }
    if( pcase_var.eql( TEN_INTEGER ) )
    {
      return ConsesLow.listS( $sym225$SAFE_FUNCALL_CLASS_SUPER_METHOD_WITH_10_ARGS, v_class, method_name, args );
    }
    if( pcase_var.eql( ELEVEN_INTEGER ) )
    {
      return ConsesLow.listS( $sym226$SAFE_FUNCALL_CLASS_SUPER_METHOD_WITH_11_ARGS, v_class, method_name, args );
    }
    if( pcase_var.eql( TWELVE_INTEGER ) )
    {
      return ConsesLow.listS( $sym227$SAFE_FUNCALL_CLASS_SUPER_METHOD_WITH_12_ARGS, v_class, method_name, args );
    }
    if( pcase_var.eql( THIRTEEN_INTEGER ) )
    {
      return ConsesLow.listS( $sym228$SAFE_FUNCALL_CLASS_SUPER_METHOD_WITH_13_ARGS, v_class, method_name, args );
    }
    if( pcase_var.eql( FOURTEEN_INTEGER ) )
    {
      return ConsesLow.listS( $sym229$SAFE_FUNCALL_CLASS_SUPER_METHOD_WITH_14_ARGS, v_class, method_name, args );
    }
    if( pcase_var.eql( FIFTEEN_INTEGER ) )
    {
      return ConsesLow.listS( $sym230$SAFE_FUNCALL_CLASS_SUPER_METHOD_WITH_15_ARGS, v_class, method_name, args );
    }
    if( pcase_var.eql( SIXTEEN_INTEGER ) )
    {
      return ConsesLow.listS( $sym231$SAFE_FUNCALL_CLASS_SUPER_METHOD_WITH_16_ARGS, v_class, method_name, args );
    }
    if( pcase_var.eql( SEVENTEEN_INTEGER ) )
    {
      return ConsesLow.listS( $sym232$SAFE_FUNCALL_CLASS_SUPER_METHOD_WITH_17_ARGS, v_class, method_name, args );
    }
    if( pcase_var.eql( EIGHTEEN_INTEGER ) )
    {
      return ConsesLow.listS( $sym233$SAFE_FUNCALL_CLASS_SUPER_METHOD_WITH_18_ARGS, v_class, method_name, args );
    }
    if( pcase_var.eql( NINETEEN_INTEGER ) )
    {
      return ConsesLow.listS( $sym234$SAFE_FUNCALL_CLASS_SUPER_METHOD_WITH_19_ARGS, v_class, method_name, args );
    }
    if( pcase_var.eql( TWENTY_INTEGER ) )
    {
      return ConsesLow.listS( $sym235$SAFE_FUNCALL_CLASS_SUPER_METHOD_WITH_20_ARGS, v_class, method_name, args );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/classes-utilities.lisp", position = 37045L)
  public static SubLObject sfcsm(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject v_class = NIL;
    SubLObject method_name = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list39 );
    v_class = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list39 );
    method_name = current.first();
    final SubLObject args;
    current = ( args = current.rest() );
    return ConsesLow.listS( $sym236$SAFE_FUNCALL_CLASS_SUPER_METHOD, v_class, method_name, args );
  }

  @SubLTranslatedFile.SubL(source = "cycl/classes-utilities.lisp", position = 37312L)
  public static SubLObject safe_funcall_instance_method(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject instance = NIL;
    SubLObject method_name = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list84 );
    instance = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list84 );
    method_name = current.first();
    final SubLObject args;
    current = ( args = current.rest() );
    final SubLObject pcase_var;
    final SubLObject arg_count = pcase_var = Sequences.length( args );
    if( pcase_var.eql( ZERO_INTEGER ) )
    {
      return ConsesLow.list( $sym237$SAFE_FUNCALL_INSTANCE_METHOD_WITH_0_ARGS, instance, method_name );
    }
    if( pcase_var.eql( ONE_INTEGER ) )
    {
      return ConsesLow.listS( $sym238$SAFE_FUNCALL_INSTANCE_METHOD_WITH_1_ARGS, instance, method_name, args );
    }
    if( pcase_var.eql( TWO_INTEGER ) )
    {
      return ConsesLow.listS( $sym239$SAFE_FUNCALL_INSTANCE_METHOD_WITH_2_ARGS, instance, method_name, args );
    }
    if( pcase_var.eql( THREE_INTEGER ) )
    {
      return ConsesLow.listS( $sym240$SAFE_FUNCALL_INSTANCE_METHOD_WITH_3_ARGS, instance, method_name, args );
    }
    if( pcase_var.eql( FOUR_INTEGER ) )
    {
      return ConsesLow.listS( $sym241$SAFE_FUNCALL_INSTANCE_METHOD_WITH_4_ARGS, instance, method_name, args );
    }
    if( pcase_var.eql( FIVE_INTEGER ) )
    {
      return ConsesLow.listS( $sym242$SAFE_FUNCALL_INSTANCE_METHOD_WITH_5_ARGS, instance, method_name, args );
    }
    if( pcase_var.eql( SIX_INTEGER ) )
    {
      return ConsesLow.listS( $sym243$SAFE_FUNCALL_INSTANCE_METHOD_WITH_6_ARGS, instance, method_name, args );
    }
    if( pcase_var.eql( SEVEN_INTEGER ) )
    {
      return ConsesLow.listS( $sym244$SAFE_FUNCALL_INSTANCE_METHOD_WITH_7_ARGS, instance, method_name, args );
    }
    if( pcase_var.eql( EIGHT_INTEGER ) )
    {
      return ConsesLow.listS( $sym245$SAFE_FUNCALL_INSTANCE_METHOD_WITH_8_ARGS, instance, method_name, args );
    }
    if( pcase_var.eql( NINE_INTEGER ) )
    {
      return ConsesLow.listS( $sym246$SAFE_FUNCALL_INSTANCE_METHOD_WITH_9_ARGS, instance, method_name, args );
    }
    if( pcase_var.eql( TEN_INTEGER ) )
    {
      return ConsesLow.listS( $sym247$SAFE_FUNCALL_INSTANCE_METHOD_WITH_10_ARGS, instance, method_name, args );
    }
    if( pcase_var.eql( ELEVEN_INTEGER ) )
    {
      return ConsesLow.listS( $sym248$SAFE_FUNCALL_INSTANCE_METHOD_WITH_11_ARGS, instance, method_name, args );
    }
    if( pcase_var.eql( TWELVE_INTEGER ) )
    {
      return ConsesLow.listS( $sym249$SAFE_FUNCALL_INSTANCE_METHOD_WITH_12_ARGS, instance, method_name, args );
    }
    if( pcase_var.eql( THIRTEEN_INTEGER ) )
    {
      return ConsesLow.listS( $sym250$SAFE_FUNCALL_INSTANCE_METHOD_WITH_13_ARGS, instance, method_name, args );
    }
    if( pcase_var.eql( FOURTEEN_INTEGER ) )
    {
      return ConsesLow.listS( $sym251$SAFE_FUNCALL_INSTANCE_METHOD_WITH_14_ARGS, instance, method_name, args );
    }
    if( pcase_var.eql( FIFTEEN_INTEGER ) )
    {
      return ConsesLow.listS( $sym252$SAFE_FUNCALL_INSTANCE_METHOD_WITH_15_ARGS, instance, method_name, args );
    }
    if( pcase_var.eql( SIXTEEN_INTEGER ) )
    {
      return ConsesLow.listS( $sym253$SAFE_FUNCALL_INSTANCE_METHOD_WITH_16_ARGS, instance, method_name, args );
    }
    if( pcase_var.eql( SEVENTEEN_INTEGER ) )
    {
      return ConsesLow.listS( $sym254$SAFE_FUNCALL_INSTANCE_METHOD_WITH_17_ARGS, instance, method_name, args );
    }
    if( pcase_var.eql( EIGHTEEN_INTEGER ) )
    {
      return ConsesLow.listS( $sym255$SAFE_FUNCALL_INSTANCE_METHOD_WITH_18_ARGS, instance, method_name, args );
    }
    if( pcase_var.eql( NINETEEN_INTEGER ) )
    {
      return ConsesLow.listS( $sym256$SAFE_FUNCALL_INSTANCE_METHOD_WITH_19_ARGS, instance, method_name, args );
    }
    if( pcase_var.eql( TWENTY_INTEGER ) )
    {
      return ConsesLow.listS( $sym257$SAFE_FUNCALL_INSTANCE_METHOD_WITH_20_ARGS, instance, method_name, args );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/classes-utilities.lisp", position = 39399L)
  public static SubLObject sfim(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject v_class = NIL;
    SubLObject method_name = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list39 );
    v_class = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list39 );
    method_name = current.first();
    final SubLObject args;
    current = ( args = current.rest() );
    return ConsesLow.listS( $sym258$SAFE_FUNCALL_INSTANCE_METHOD, v_class, method_name, args );
  }

  @SubLTranslatedFile.SubL(source = "cycl/classes-utilities.lisp", position = 39662L)
  public static SubLObject safe_funcall_instance_super_method(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject instance = NIL;
    SubLObject method_name = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list84 );
    instance = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list84 );
    method_name = current.first();
    final SubLObject args;
    current = ( args = current.rest() );
    final SubLObject pcase_var;
    final SubLObject arg_count = pcase_var = Sequences.length( args );
    if( pcase_var.eql( ZERO_INTEGER ) )
    {
      return ConsesLow.list( $sym259$SAFE_FUNCALL_INSTANCE_SUPER_METHOD_WITH_0_ARGS, instance, method_name );
    }
    if( pcase_var.eql( ONE_INTEGER ) )
    {
      return ConsesLow.listS( $sym260$SAFE_FUNCALL_INSTANCE_SUPER_METHOD_WITH_1_ARGS, instance, method_name, args );
    }
    if( pcase_var.eql( TWO_INTEGER ) )
    {
      return ConsesLow.listS( $sym261$SAFE_FUNCALL_INSTANCE_SUPER_METHOD_WITH_2_ARGS, instance, method_name, args );
    }
    if( pcase_var.eql( THREE_INTEGER ) )
    {
      return ConsesLow.listS( $sym262$SAFE_FUNCALL_INSTANCE_SUPER_METHOD_WITH_3_ARGS, instance, method_name, args );
    }
    if( pcase_var.eql( FOUR_INTEGER ) )
    {
      return ConsesLow.listS( $sym263$SAFE_FUNCALL_INSTANCE_SUPER_METHOD_WITH_4_ARGS, instance, method_name, args );
    }
    if( pcase_var.eql( FIVE_INTEGER ) )
    {
      return ConsesLow.listS( $sym264$SAFE_FUNCALL_INSTANCE_SUPER_METHOD_WITH_5_ARGS, instance, method_name, args );
    }
    if( pcase_var.eql( SIX_INTEGER ) )
    {
      return ConsesLow.listS( $sym265$SAFE_FUNCALL_INSTANCE_SUPER_METHOD_WITH_6_ARGS, instance, method_name, args );
    }
    if( pcase_var.eql( SEVEN_INTEGER ) )
    {
      return ConsesLow.listS( $sym266$SAFE_FUNCALL_INSTANCE_SUPER_METHOD_WITH_7_ARGS, instance, method_name, args );
    }
    if( pcase_var.eql( EIGHT_INTEGER ) )
    {
      return ConsesLow.listS( $sym267$SAFE_FUNCALL_INSTANCE_SUPER_METHOD_WITH_8_ARGS, instance, method_name, args );
    }
    if( pcase_var.eql( NINE_INTEGER ) )
    {
      return ConsesLow.listS( $sym268$SAFE_FUNCALL_INSTANCE_SUPER_METHOD_WITH_9_ARGS, instance, method_name, args );
    }
    if( pcase_var.eql( TEN_INTEGER ) )
    {
      return ConsesLow.listS( $sym269$SAFE_FUNCALL_INSTANCE_SUPER_METHOD_WITH_10_ARGS, instance, method_name, args );
    }
    if( pcase_var.eql( ELEVEN_INTEGER ) )
    {
      return ConsesLow.listS( $sym270$SAFE_FUNCALL_INSTANCE_SUPER_METHOD_WITH_11_ARGS, instance, method_name, args );
    }
    if( pcase_var.eql( TWELVE_INTEGER ) )
    {
      return ConsesLow.listS( $sym271$SAFE_FUNCALL_INSTANCE_SUPER_METHOD_WITH_12_ARGS, instance, method_name, args );
    }
    if( pcase_var.eql( THIRTEEN_INTEGER ) )
    {
      return ConsesLow.listS( $sym272$SAFE_FUNCALL_INSTANCE_SUPER_METHOD_WITH_13_ARGS, instance, method_name, args );
    }
    if( pcase_var.eql( FOURTEEN_INTEGER ) )
    {
      return ConsesLow.listS( $sym273$SAFE_FUNCALL_INSTANCE_SUPER_METHOD_WITH_14_ARGS, instance, method_name, args );
    }
    if( pcase_var.eql( FIFTEEN_INTEGER ) )
    {
      return ConsesLow.listS( $sym274$SAFE_FUNCALL_INSTANCE_SUPER_METHOD_WITH_15_ARGS, instance, method_name, args );
    }
    if( pcase_var.eql( SIXTEEN_INTEGER ) )
    {
      return ConsesLow.listS( $sym275$SAFE_FUNCALL_INSTANCE_SUPER_METHOD_WITH_16_ARGS, instance, method_name, args );
    }
    if( pcase_var.eql( SEVENTEEN_INTEGER ) )
    {
      return ConsesLow.listS( $sym276$SAFE_FUNCALL_INSTANCE_SUPER_METHOD_WITH_17_ARGS, instance, method_name, args );
    }
    if( pcase_var.eql( EIGHTEEN_INTEGER ) )
    {
      return ConsesLow.listS( $sym277$SAFE_FUNCALL_INSTANCE_SUPER_METHOD_WITH_18_ARGS, instance, method_name, args );
    }
    if( pcase_var.eql( NINETEEN_INTEGER ) )
    {
      return ConsesLow.listS( $sym278$SAFE_FUNCALL_INSTANCE_SUPER_METHOD_WITH_19_ARGS, instance, method_name, args );
    }
    if( pcase_var.eql( TWENTY_INTEGER ) )
    {
      return ConsesLow.listS( $sym279$SAFE_FUNCALL_INSTANCE_SUPER_METHOD_WITH_20_ARGS, instance, method_name, args );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/classes-utilities.lisp", position = 41881L)
  public static SubLObject sfism(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject v_class = NIL;
    SubLObject method_name = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list39 );
    v_class = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list39 );
    method_name = current.first();
    final SubLObject args;
    current = ( args = current.rest() );
    return ConsesLow.listS( $sym280$SAFE_FUNCALL_INSTANCE_SUPER_METHOD, v_class, method_name, args );
  }

  @SubLTranslatedFile.SubL(source = "cycl/classes-utilities.lisp", position = 42151L)
  public static SubLObject safe_funcall_class_or_instance_method(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject instance = NIL;
    SubLObject method_name = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list84 );
    instance = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list84 );
    method_name = current.first();
    final SubLObject args;
    current = ( args = current.rest() );
    final SubLObject pcase_var;
    final SubLObject arg_count = pcase_var = Sequences.length( args );
    if( pcase_var.eql( ZERO_INTEGER ) )
    {
      return ConsesLow.list( $sym281$SAFE_FUNCALL_CLASS_OR_INSTANCE_METHOD_WITH_0_ARGS, instance, method_name );
    }
    if( pcase_var.eql( ONE_INTEGER ) )
    {
      return ConsesLow.listS( $sym282$SAFE_FUNCALL_CLASS_OR_INSTANCE_METHOD_WITH_1_ARGS, instance, method_name, args );
    }
    if( pcase_var.eql( TWO_INTEGER ) )
    {
      return ConsesLow.listS( $sym283$SAFE_FUNCALL_CLASS_OR_INSTANCE_METHOD_WITH_2_ARGS, instance, method_name, args );
    }
    if( pcase_var.eql( THREE_INTEGER ) )
    {
      return ConsesLow.listS( $sym284$SAFE_FUNCALL_CLASS_OR_INSTANCE_METHOD_WITH_3_ARGS, instance, method_name, args );
    }
    if( pcase_var.eql( FOUR_INTEGER ) )
    {
      return ConsesLow.listS( $sym285$SAFE_FUNCALL_CLASS_OR_INSTANCE_METHOD_WITH_4_ARGS, instance, method_name, args );
    }
    if( pcase_var.eql( FIVE_INTEGER ) )
    {
      return ConsesLow.listS( $sym286$SAFE_FUNCALL_CLASS_OR_INSTANCE_METHOD_WITH_5_ARGS, instance, method_name, args );
    }
    if( pcase_var.eql( SIX_INTEGER ) )
    {
      return ConsesLow.listS( $sym287$SAFE_FUNCALL_CLASS_OR_INSTANCE_METHOD_WITH_6_ARGS, instance, method_name, args );
    }
    if( pcase_var.eql( SEVEN_INTEGER ) )
    {
      return ConsesLow.listS( $sym288$SAFE_FUNCALL_CLASS_OR_INSTANCE_METHOD_WITH_7_ARGS, instance, method_name, args );
    }
    if( pcase_var.eql( EIGHT_INTEGER ) )
    {
      return ConsesLow.listS( $sym289$SAFE_FUNCALL_CLASS_OR_INSTANCE_METHOD_WITH_8_ARGS, instance, method_name, args );
    }
    if( pcase_var.eql( NINE_INTEGER ) )
    {
      return ConsesLow.listS( $sym290$SAFE_FUNCALL_CLASS_OR_INSTANCE_METHOD_WITH_9_ARGS, instance, method_name, args );
    }
    if( pcase_var.eql( TEN_INTEGER ) )
    {
      return ConsesLow.listS( $sym291$SAFE_FUNCALL_CLASS_OR_INSTANCE_METHOD_WITH_10_ARGS, instance, method_name, args );
    }
    if( pcase_var.eql( ELEVEN_INTEGER ) )
    {
      return ConsesLow.listS( $sym292$SAFE_FUNCALL_CLASS_OR_INSTANCE_METHOD_WITH_11_ARGS, instance, method_name, args );
    }
    if( pcase_var.eql( TWELVE_INTEGER ) )
    {
      return ConsesLow.listS( $sym293$SAFE_FUNCALL_CLASS_OR_INSTANCE_METHOD_WITH_12_ARGS, instance, method_name, args );
    }
    if( pcase_var.eql( THIRTEEN_INTEGER ) )
    {
      return ConsesLow.listS( $sym294$SAFE_FUNCALL_CLASS_OR_INSTANCE_METHOD_WITH_13_ARGS, instance, method_name, args );
    }
    if( pcase_var.eql( FOURTEEN_INTEGER ) )
    {
      return ConsesLow.listS( $sym295$SAFE_FUNCALL_CLASS_OR_INSTANCE_METHOD_WITH_14_ARGS, instance, method_name, args );
    }
    if( pcase_var.eql( FIFTEEN_INTEGER ) )
    {
      return ConsesLow.listS( $sym296$SAFE_FUNCALL_CLASS_OR_INSTANCE_METHOD_WITH_15_ARGS, instance, method_name, args );
    }
    if( pcase_var.eql( SIXTEEN_INTEGER ) )
    {
      return ConsesLow.listS( $sym297$SAFE_FUNCALL_CLASS_OR_INSTANCE_METHOD_WITH_16_ARGS, instance, method_name, args );
    }
    if( pcase_var.eql( SEVENTEEN_INTEGER ) )
    {
      return ConsesLow.listS( $sym298$SAFE_FUNCALL_CLASS_OR_INSTANCE_METHOD_WITH_17_ARGS, instance, method_name, args );
    }
    if( pcase_var.eql( EIGHTEEN_INTEGER ) )
    {
      return ConsesLow.listS( $sym299$SAFE_FUNCALL_CLASS_OR_INSTANCE_METHOD_WITH_18_ARGS, instance, method_name, args );
    }
    if( pcase_var.eql( NINETEEN_INTEGER ) )
    {
      return ConsesLow.listS( $sym300$SAFE_FUNCALL_CLASS_OR_INSTANCE_METHOD_WITH_19_ARGS, instance, method_name, args );
    }
    if( pcase_var.eql( TWENTY_INTEGER ) )
    {
      return ConsesLow.listS( $sym301$SAFE_FUNCALL_CLASS_OR_INSTANCE_METHOD_WITH_20_ARGS, instance, method_name, args );
    }
    return NIL;
  }

  public static SubLObject declare_classes_utilities_file()
  {
    SubLFiles.declareMacro( me, "define_class_method_funcallers", "DEFINE-CLASS-METHOD-FUNCALLERS" );
    SubLFiles.declareMacro( me, "define_class_super_method_funcallers", "DEFINE-CLASS-SUPER-METHOD-FUNCALLERS" );
    SubLFiles.declareMacro( me, "define_instance_method_funcallers", "DEFINE-INSTANCE-METHOD-FUNCALLERS" );
    SubLFiles.declareMacro( me, "define_instance_super_method_funcallers", "DEFINE-INSTANCE-SUPER-METHOD-FUNCALLERS" );
    SubLFiles.declareMacro( me, "define_class_or_instance_method_funcallers", "DEFINE-CLASS-OR-INSTANCE-METHOD-FUNCALLERS" );
    SubLFiles.declareMacro( me, "funcall_class_method", "FUNCALL-CLASS-METHOD" );
    SubLFiles.declareMacro( me, "fcm", "FCM" );
    SubLFiles.declareMacro( me, "funcall_class_super_method", "FUNCALL-CLASS-SUPER-METHOD" );
    SubLFiles.declareMacro( me, "fcsm", "FCSM" );
    SubLFiles.declareMacro( me, "funcall_instance_method", "FUNCALL-INSTANCE-METHOD" );
    SubLFiles.declareMacro( me, "fim", "FIM" );
    SubLFiles.declareMacro( me, "funcall_instance_super_method", "FUNCALL-INSTANCE-SUPER-METHOD" );
    SubLFiles.declareMacro( me, "fism", "FISM" );
    SubLFiles.declareMacro( me, "funcall_class_or_instance_method", "FUNCALL-CLASS-OR-INSTANCE-METHOD" );
    SubLFiles.declareFunction( me, "apply_instance_method", "APPLY-INSTANCE-METHOD", 3, 0, false );
    SubLFiles.declareMacro( me, "fim_nr", "FIM-NR" );
    SubLFiles.declareFunction( me, "funcall_instance_method_wXo_recursion", "FUNCALL-INSTANCE-METHOD-W/O-RECURSION", 3, 0, false );
    SubLFiles.declareFunction( me, "classes_symbol_list_p", "CLASSES-SYMBOL-LIST-P", 1, 0, false );
    SubLFiles.declareFunction( me, "classes_npartition_list", "CLASSES-NPARTITION-LIST", 2, 2, false );
    SubLFiles.declareMacro( me, "classes_npartition_list_macro", "CLASSES-NPARTITION-LIST-MACRO" );
    SubLFiles.declareFunction( me, "classes_check_do_classes_in_order_parameters", "CLASSES-CHECK-DO-CLASSES-IN-ORDER-PARAMETERS", 4, 0, false );
    SubLFiles.declareFunction( me, "method_bound_p", "METHOD-BOUND-P", 2, 0, false );
    SubLFiles.declareFunction( me, "valid_subloop_safe_funcaller_error_values", "VALID-SUBLOOP-SAFE-FUNCALLER-ERROR-VALUES", 0, 0, false );
    SubLFiles.declareFunction( me, "subloop_safe_funcaller_error_value_p", "SUBLOOP-SAFE-FUNCALLER-ERROR-VALUE-P", 1, 0, false );
    SubLFiles.declareFunction( me, "encode_subloop_safe_funcaller_error_value", "ENCODE-SUBLOOP-SAFE-FUNCALLER-ERROR-VALUE", 1, 0, false );
    SubLFiles.declareFunction( me, "decode_subloop_safe_funcaller_error_value", "DECODE-SUBLOOP-SAFE-FUNCALLER-ERROR-VALUE", 1, 0, false );
    SubLFiles.declareFunction( me, "subloop_safe_funcaller_error_value_less_p", "SUBLOOP-SAFE-FUNCALLER-ERROR-VALUE-LESS-P", 2, 0, false );
    SubLFiles.declareFunction( me, "subloop_safe_funcaller_error_value_greater_p", "SUBLOOP-SAFE-FUNCALLER-ERROR-VALUE-GREATER-P", 2, 0, false );
    SubLFiles.declareMacro( me, "define_safe_class_method_funcallers", "DEFINE-SAFE-CLASS-METHOD-FUNCALLERS" );
    SubLFiles.declareMacro( me, "define_safe_class_super_method_funcallers", "DEFINE-SAFE-CLASS-SUPER-METHOD-FUNCALLERS" );
    SubLFiles.declareMacro( me, "define_safe_instance_method_funcallers", "DEFINE-SAFE-INSTANCE-METHOD-FUNCALLERS" );
    SubLFiles.declareMacro( me, "define_safe_instance_super_method_funcallers", "DEFINE-SAFE-INSTANCE-SUPER-METHOD-FUNCALLERS" );
    SubLFiles.declareMacro( me, "define_safe_class_or_instance_method_funcallers", "DEFINE-SAFE-CLASS-OR-INSTANCE-METHOD-FUNCALLERS" );
    SubLFiles.declareMacro( me, "safe_funcall_class_method", "SAFE-FUNCALL-CLASS-METHOD" );
    SubLFiles.declareMacro( me, "sfcm", "SFCM" );
    SubLFiles.declareMacro( me, "safe_funcall_class_super_method", "SAFE-FUNCALL-CLASS-SUPER-METHOD" );
    SubLFiles.declareMacro( me, "sfcsm", "SFCSM" );
    SubLFiles.declareMacro( me, "safe_funcall_instance_method", "SAFE-FUNCALL-INSTANCE-METHOD" );
    SubLFiles.declareMacro( me, "sfim", "SFIM" );
    SubLFiles.declareMacro( me, "safe_funcall_instance_super_method", "SAFE-FUNCALL-INSTANCE-SUPER-METHOD" );
    SubLFiles.declareMacro( me, "sfism", "SFISM" );
    SubLFiles.declareMacro( me, "safe_funcall_class_or_instance_method", "SAFE-FUNCALL-CLASS-OR-INSTANCE-METHOD" );
    return NIL;
  }

  public static SubLObject init_classes_utilities_file()
  {
    $classes_utilities_undefined_class_method_message$ = SubLFiles.defconstant( "*CLASSES-UTILITIES-UNDEFINED-CLASS-METHOD-MESSAGE*", $str0$Attempt_to_invoke_the_undefined_m );
    $classes_utilities_undefined_class_super_method_message$ = SubLFiles.defconstant( "*CLASSES-UTILITIES-UNDEFINED-CLASS-SUPER-METHOD-MESSAGE*", $str1$Attempt_to_invoke_the_undefined_s );
    $classes_utilities_illegal_access_message$ = SubLFiles.defconstant( "*CLASSES-UTILITIES-ILLEGAL-ACCESS-MESSAGE*", $str2$Method__S_cannot_be_called_within );
    $method_call_stack$ = SubLFiles.defparameter( "*METHOD-CALL-STACK*", NIL );
    $valid_subloop_safe_funcaller_error_values$ = SubLFiles.defconstant( "*VALID-SUBLOOP-SAFE-FUNCALLER-ERROR-VALUES*", $list172 );
    return NIL;
  }

  public static SubLObject setup_classes_utilities_file()
  {
    enumerations.enumerations_incorporate_definition( $sym173$SUBLOOP_SAFE_FUNCALLER_ERROR_VALUE, $list172 );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_classes_utilities_file();
  }

  @Override
  public void initializeVariables()
  {
    init_classes_utilities_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_classes_utilities_file();
  }
  static
  {
    me = new classes_utilities();
    $classes_utilities_undefined_class_method_message$ = null;
    $classes_utilities_undefined_class_super_method_message$ = null;
    $classes_utilities_illegal_access_message$ = null;
    $method_call_stack$ = null;
    $valid_subloop_safe_funcaller_error_values$ = null;
    $str0$Attempt_to_invoke_the_undefined_m = makeString( "Attempt to invoke the undefined method ~S on class ~S failed." );
    $str1$Attempt_to_invoke_the_undefined_s = makeString( "Attempt to invoke the undefined super method ~S on class ~S failed." );
    $str2$Method__S_cannot_be_called_within = makeString( "Method ~S cannot be called within the scope of class ~S." );
    $list3 = ConsesLow.list( makeSymbol( "NAME-TEMPLATE" ), makeSymbol( "MAX-ARGS" ) );
    $sym4$DEFINE_PUBLIC = makeSymbol( "DEFINE-PUBLIC" );
    $sym5$CLASS_NAME_OR_CLASS = makeSymbol( "CLASS-NAME-OR-CLASS" );
    $sym6$METHOD_NAME = makeSymbol( "METHOD-NAME" );
    $sym7$CLET = makeSymbol( "CLET" );
    $list8 = ConsesLow.list( ConsesLow.list( makeSymbol( "CLASS" ), ConsesLow.list( makeSymbol( "FIF" ), ConsesLow.list( makeSymbol( "SYMBOLP" ), makeSymbol( "CLASS-NAME-OR-CLASS" ) ), ConsesLow.list( makeSymbol(
        "CLASSES-RETRIEVE-CLASS" ), makeSymbol( "CLASS-NAME-OR-CLASS" ) ), ConsesLow.list( makeSymbol( "FIF" ), ConsesLow.list( makeSymbol( "INSTANCE-P" ), makeSymbol( "CLASS-NAME-OR-CLASS" ) ), ConsesLow.list(
            makeSymbol( "INSTANCE-CLASS" ), makeSymbol( "CLASS-NAME-OR-CLASS" ) ), makeSymbol( "CLASS-NAME-OR-CLASS" ) ) ) ) );
    $list9 = ConsesLow.list( makeSymbol( "MUST" ), ConsesLow.list( makeSymbol( "CLASS-P" ), makeSymbol( "CLASS" ) ), makeString( "FUNCALL-CLASS-METHOD: ~S is not a defined class." ), makeSymbol(
        "CLASS-NAME-OR-CLASS" ) );
    $list10 = ConsesLow.list( makeSymbol( "MUST" ), ConsesLow.list( makeSymbol( "CAND" ), makeSymbol( "METHOD-NAME" ), ConsesLow.list( makeSymbol( "SYMBOLP" ), makeSymbol( "METHOD-NAME" ) ) ), makeString(
        "FUNCALL-CLASS-METHOD: ~S is not a method of class ~S." ), makeSymbol( "METHOD-NAME" ), ConsesLow.list( makeSymbol( "CLASS-NAME" ), makeSymbol( "CLASS" ) ) );
    $list11 = ConsesLow.list( ConsesLow.list( makeSymbol( "METHOD" ), ConsesLow.list( makeSymbol( "METHOD-ASSOC" ), makeSymbol( "METHOD-NAME" ), ConsesLow.list( makeSymbol( "CLASS-COMPILED-CLASS-METHOD-ACCESS-ALIST" ),
        makeSymbol( "CLASS" ) ) ) ) );
    $list12 = ConsesLow.list( makeSymbol( "MUST" ), makeSymbol( "METHOD" ), makeSymbol( "*CLASSES-UTILITIES-UNDEFINED-CLASS-METHOD-MESSAGE*" ), makeSymbol( "METHOD-NAME" ), makeSymbol( "CLASS" ) );
    $list13 = ConsesLow.list( makeSymbol( "MUST" ), ConsesLow.list( makeSymbol( "INSTANCES-ACCESS-CHECK-METHOD" ), makeSymbol( "CLASS" ), makeSymbol( "METHOD" ) ), makeSymbol(
        "*CLASSES-UTILITIES-ILLEGAL-ACCESS-MESSAGE*" ), makeSymbol( "METHOD-NAME" ), ConsesLow.list( makeSymbol( "CLASS-NAME" ), makeSymbol( "CLASS" ) ) );
    $sym14$RET = makeSymbol( "RET" );
    $sym15$FUNCALL = makeSymbol( "FUNCALL" );
    $list16 = ConsesLow.list( makeSymbol( "METHOD-FUNCTION-NAME" ), makeSymbol( "METHOD" ) );
    $sym17$CLASS = makeSymbol( "CLASS" );
    $list18 = ConsesLow.list( ConsesLow.list( makeSymbol( "RET" ), NIL ) );
    $str19$ARG_S = makeString( "ARG~S" );
    $sym20$PROGN = makeSymbol( "PROGN" );
    $list21 = ConsesLow.list( makeSymbol( "MUST" ), ConsesLow.list( makeSymbol( "CLASS-P" ), makeSymbol( "CLASS" ) ), makeString( "FUNCALL-CLASS-SUPER-METHOD: ~S is not a defined class." ), makeSymbol(
        "CLASS-NAME-OR-CLASS" ) );
    $list22 = ConsesLow.list( makeSymbol( "MUST" ), ConsesLow.list( makeSymbol( "CAND" ), makeSymbol( "METHOD-NAME" ), ConsesLow.list( makeSymbol( "SYMBOLP" ), makeSymbol( "METHOD-NAME" ) ) ), makeString(
        "FUNCALL-CLASS-SUPER-METHOD: ~S is not a method of class ~S." ), makeSymbol( "METHOD-NAME" ), ConsesLow.list( makeSymbol( "CLASS-NAME" ), makeSymbol( "CLASS" ) ) );
    $list23 = ConsesLow.list( ConsesLow.list( makeSymbol( "METHOD" ), ConsesLow.list( makeSymbol( "METHOD-SHADOWED-ASSOC" ), makeSymbol( "METHOD-NAME" ), ConsesLow.list( makeSymbol(
        "CLASS-COMPILED-CLASS-METHOD-ACCESS-ALIST" ), makeSymbol( "CLASS" ) ) ) ) );
    $list24 = ConsesLow.list( makeSymbol( "MUST" ), makeSymbol( "METHOD" ), makeSymbol( "*CLASSES-UTILITIES-UNDEFINED-CLASS-SUPER-METHOD-MESSAGE*" ), makeSymbol( "METHOD-NAME" ), makeSymbol( "CLASS" ) );
    $list25 = ConsesLow.list( makeSymbol( "NAME-TEMPLATE" ), makeSymbol( "CLASS-NAME-TEMPLATE" ), makeSymbol( "MAX-ARGS" ) );
    $sym26$INSTANCE = makeSymbol( "INSTANCE" );
    $list27 = ConsesLow.list( makeSymbol( "MUST" ), ConsesLow.list( makeSymbol( "CAND" ), ConsesLow.list( makeSymbol( "INSTANCE-P" ), makeSymbol( "INSTANCE" ) ), ConsesLow.list( makeSymbol( "SYMBOLP" ), makeSymbol(
        "METHOD-NAME" ) ) ), makeString( "~%FUNCALL-INSTANCE-METHOD: either instance ~S or method ~S are invalid." ), makeSymbol( "INSTANCE" ), makeSymbol( "METHOD-NAME" ) );
    $list28 = ConsesLow.list( ConsesLow.list( makeSymbol( "CLASS" ), ConsesLow.list( makeSymbol( "INSTANCE-CLASS" ), makeSymbol( "INSTANCE" ) ) ), ConsesLow.list( makeSymbol( "METHOD" ), ConsesLow.list( makeSymbol(
        "GETHASH" ), makeSymbol( "METHOD-NAME" ), ConsesLow.list( makeSymbol( "CLASS-TABLIFIED-INSTANCE-METHODS" ), makeSymbol( "CLASS" ) ) ) ) );
    $sym29$PIF = makeSymbol( "PIF" );
    $sym30$METHOD = makeSymbol( "METHOD" );
    $list31 = ConsesLow.list( ConsesLow.list( makeSymbol( "CLASS" ), ConsesLow.list( makeSymbol( "INSTANCE-CLASS" ), makeSymbol( "INSTANCE" ) ) ), ConsesLow.list( makeSymbol( "METHOD" ), ConsesLow.list( makeSymbol(
        "METHOD-SHADOWED-ASSOC" ), makeSymbol( "METHOD-NAME" ), ConsesLow.list( makeSymbol( "CLASS-COMPILED-INSTANCE-METHOD-ACCESS-ALIST" ), makeSymbol( "CLASS" ) ) ) ) );
    $sym32$CLASS_OR_INSTANCE = makeSymbol( "CLASS-OR-INSTANCE" );
    $list33 = ConsesLow.list( makeSymbol( "MUST" ), ConsesLow.list( makeSymbol( "CAND" ), makeSymbol( "METHOD-NAME" ), ConsesLow.list( makeSymbol( "SYMBOLP" ), makeSymbol( "METHOD-NAME" ) ) ), makeString(
        "~%FUNCALL-CLASS-OR-INSTANCE-METHOD: Method ~S is invalid." ), makeSymbol( "METHOD-NAME" ) );
    $list34 = ConsesLow.list( makeSymbol( "INSTANCE-P" ), makeSymbol( "CLASS-OR-INSTANCE" ) );
    $list35 = ConsesLow.list( ConsesLow.list( makeSymbol( "CLASS" ), ConsesLow.list( makeSymbol( "INSTANCE-CLASS" ), makeSymbol( "CLASS-OR-INSTANCE" ) ) ), ConsesLow.list( makeSymbol( "METHOD" ), ConsesLow.list(
        makeSymbol( "GETHASH" ), makeSymbol( "METHOD-NAME" ), ConsesLow.list( makeSymbol( "CLASS-TABLIFIED-INSTANCE-METHODS" ), makeSymbol( "CLASS" ) ) ) ) );
    $list36 = ConsesLow.list( ConsesLow.list( makeSymbol( "PROGN" ), ConsesLow.list( makeSymbol( "ERROR" ), makeString( "~%FUNCALL-CLASS-OR-INSTANCE-METHOD: Method ~S is invalid." ), makeSymbol( "METHOD-NAME" ) ),
        ConsesLow.list( makeSymbol( "RET" ), NIL ) ) );
    $list37 = ConsesLow.list( ConsesLow.list( makeSymbol( "CLASS" ), ConsesLow.list( makeSymbol( "FIF" ), ConsesLow.list( makeSymbol( "CLASS-P" ), makeSymbol( "CLASS-OR-INSTANCE" ) ), makeSymbol( "CLASS-OR-INSTANCE" ),
        ConsesLow.list( makeSymbol( "CLASSES-RETRIEVE-CLASS" ), makeSymbol( "CLASS-OR-INSTANCE" ) ) ) ), ConsesLow.list( makeSymbol( "METHOD" ), ConsesLow.list( makeSymbol( "FIF" ), makeSymbol( "CLASS" ), ConsesLow.list(
            makeSymbol( "METHOD-ASSOC" ), makeSymbol( "METHOD-NAME" ), ConsesLow.list( makeSymbol( "CLASS-COMPILED-CLASS-METHOD-ACCESS-ALIST" ), makeSymbol( "CLASS" ) ) ), NIL ) ) );
    $list38 = ConsesLow.list( makeSymbol( "MUST" ), makeSymbol( "CLASS" ), makeString( "FUNCALL-CLASS-OR-INSTANCE-METHOD: ~S is not a valid class." ), makeSymbol( "CLASS" ) );
    $list39 = ConsesLow.list( makeSymbol( "CLASS" ), makeSymbol( "METHOD-NAME" ), makeSymbol( "&REST" ), makeSymbol( "ARGS" ) );
    $sym40$FUNCALL_CLASS_METHOD_WITH_0_ARGS = makeSymbol( "FUNCALL-CLASS-METHOD-WITH-0-ARGS" );
    $sym41$FUNCALL_CLASS_METHOD_WITH_1_ARGS = makeSymbol( "FUNCALL-CLASS-METHOD-WITH-1-ARGS" );
    $sym42$FUNCALL_CLASS_METHOD_WITH_2_ARGS = makeSymbol( "FUNCALL-CLASS-METHOD-WITH-2-ARGS" );
    $sym43$FUNCALL_CLASS_METHOD_WITH_3_ARGS = makeSymbol( "FUNCALL-CLASS-METHOD-WITH-3-ARGS" );
    $sym44$FUNCALL_CLASS_METHOD_WITH_4_ARGS = makeSymbol( "FUNCALL-CLASS-METHOD-WITH-4-ARGS" );
    $sym45$FUNCALL_CLASS_METHOD_WITH_5_ARGS = makeSymbol( "FUNCALL-CLASS-METHOD-WITH-5-ARGS" );
    $sym46$FUNCALL_CLASS_METHOD_WITH_6_ARGS = makeSymbol( "FUNCALL-CLASS-METHOD-WITH-6-ARGS" );
    $sym47$FUNCALL_CLASS_METHOD_WITH_7_ARGS = makeSymbol( "FUNCALL-CLASS-METHOD-WITH-7-ARGS" );
    $sym48$FUNCALL_CLASS_METHOD_WITH_8_ARGS = makeSymbol( "FUNCALL-CLASS-METHOD-WITH-8-ARGS" );
    $sym49$FUNCALL_CLASS_METHOD_WITH_9_ARGS = makeSymbol( "FUNCALL-CLASS-METHOD-WITH-9-ARGS" );
    $sym50$FUNCALL_CLASS_METHOD_WITH_10_ARGS = makeSymbol( "FUNCALL-CLASS-METHOD-WITH-10-ARGS" );
    $sym51$FUNCALL_CLASS_METHOD_WITH_11_ARGS = makeSymbol( "FUNCALL-CLASS-METHOD-WITH-11-ARGS" );
    $sym52$FUNCALL_CLASS_METHOD_WITH_12_ARGS = makeSymbol( "FUNCALL-CLASS-METHOD-WITH-12-ARGS" );
    $sym53$FUNCALL_CLASS_METHOD_WITH_13_ARGS = makeSymbol( "FUNCALL-CLASS-METHOD-WITH-13-ARGS" );
    $sym54$FUNCALL_CLASS_METHOD_WITH_14_ARGS = makeSymbol( "FUNCALL-CLASS-METHOD-WITH-14-ARGS" );
    $sym55$FUNCALL_CLASS_METHOD_WITH_15_ARGS = makeSymbol( "FUNCALL-CLASS-METHOD-WITH-15-ARGS" );
    $sym56$FUNCALL_CLASS_METHOD_WITH_16_ARGS = makeSymbol( "FUNCALL-CLASS-METHOD-WITH-16-ARGS" );
    $sym57$FUNCALL_CLASS_METHOD_WITH_17_ARGS = makeSymbol( "FUNCALL-CLASS-METHOD-WITH-17-ARGS" );
    $sym58$FUNCALL_CLASS_METHOD_WITH_18_ARGS = makeSymbol( "FUNCALL-CLASS-METHOD-WITH-18-ARGS" );
    $sym59$FUNCALL_CLASS_METHOD_WITH_19_ARGS = makeSymbol( "FUNCALL-CLASS-METHOD-WITH-19-ARGS" );
    $sym60$FUNCALL_CLASS_METHOD_WITH_20_ARGS = makeSymbol( "FUNCALL-CLASS-METHOD-WITH-20-ARGS" );
    $sym61$FUNCALL_CLASS_METHOD = makeSymbol( "FUNCALL-CLASS-METHOD" );
    $sym62$FUNCALL_CLASS_SUPER_METHOD_WITH_0_ARGS = makeSymbol( "FUNCALL-CLASS-SUPER-METHOD-WITH-0-ARGS" );
    $sym63$FUNCALL_CLASS_SUPER_METHOD_WITH_1_ARGS = makeSymbol( "FUNCALL-CLASS-SUPER-METHOD-WITH-1-ARGS" );
    $sym64$FUNCALL_CLASS_SUPER_METHOD_WITH_2_ARGS = makeSymbol( "FUNCALL-CLASS-SUPER-METHOD-WITH-2-ARGS" );
    $sym65$FUNCALL_CLASS_SUPER_METHOD_WITH_3_ARGS = makeSymbol( "FUNCALL-CLASS-SUPER-METHOD-WITH-3-ARGS" );
    $sym66$FUNCALL_CLASS_SUPER_METHOD_WITH_4_ARGS = makeSymbol( "FUNCALL-CLASS-SUPER-METHOD-WITH-4-ARGS" );
    $sym67$FUNCALL_CLASS_SUPER_METHOD_WITH_5_ARGS = makeSymbol( "FUNCALL-CLASS-SUPER-METHOD-WITH-5-ARGS" );
    $sym68$FUNCALL_CLASS_SUPER_METHOD_WITH_6_ARGS = makeSymbol( "FUNCALL-CLASS-SUPER-METHOD-WITH-6-ARGS" );
    $sym69$FUNCALL_CLASS_SUPER_METHOD_WITH_7_ARGS = makeSymbol( "FUNCALL-CLASS-SUPER-METHOD-WITH-7-ARGS" );
    $sym70$FUNCALL_CLASS_SUPER_METHOD_WITH_8_ARGS = makeSymbol( "FUNCALL-CLASS-SUPER-METHOD-WITH-8-ARGS" );
    $sym71$FUNCALL_CLASS_SUPER_METHOD_WITH_9_ARGS = makeSymbol( "FUNCALL-CLASS-SUPER-METHOD-WITH-9-ARGS" );
    $sym72$FUNCALL_CLASS_SUPER_METHOD_WITH_10_ARGS = makeSymbol( "FUNCALL-CLASS-SUPER-METHOD-WITH-10-ARGS" );
    $sym73$FUNCALL_CLASS_SUPER_METHOD_WITH_11_ARGS = makeSymbol( "FUNCALL-CLASS-SUPER-METHOD-WITH-11-ARGS" );
    $sym74$FUNCALL_CLASS_SUPER_METHOD_WITH_12_ARGS = makeSymbol( "FUNCALL-CLASS-SUPER-METHOD-WITH-12-ARGS" );
    $sym75$FUNCALL_CLASS_SUPER_METHOD_WITH_13_ARGS = makeSymbol( "FUNCALL-CLASS-SUPER-METHOD-WITH-13-ARGS" );
    $sym76$FUNCALL_CLASS_SUPER_METHOD_WITH_14_ARGS = makeSymbol( "FUNCALL-CLASS-SUPER-METHOD-WITH-14-ARGS" );
    $sym77$FUNCALL_CLASS_SUPER_METHOD_WITH_15_ARGS = makeSymbol( "FUNCALL-CLASS-SUPER-METHOD-WITH-15-ARGS" );
    $sym78$FUNCALL_CLASS_SUPER_METHOD_WITH_16_ARGS = makeSymbol( "FUNCALL-CLASS-SUPER-METHOD-WITH-16-ARGS" );
    $sym79$FUNCALL_CLASS_SUPER_METHOD_WITH_17_ARGS = makeSymbol( "FUNCALL-CLASS-SUPER-METHOD-WITH-17-ARGS" );
    $sym80$FUNCALL_CLASS_SUPER_METHOD_WITH_18_ARGS = makeSymbol( "FUNCALL-CLASS-SUPER-METHOD-WITH-18-ARGS" );
    $sym81$FUNCALL_CLASS_SUPER_METHOD_WITH_19_ARGS = makeSymbol( "FUNCALL-CLASS-SUPER-METHOD-WITH-19-ARGS" );
    $sym82$FUNCALL_CLASS_SUPER_METHOD_WITH_20_ARGS = makeSymbol( "FUNCALL-CLASS-SUPER-METHOD-WITH-20-ARGS" );
    $sym83$FUNCALL_CLASS_SUPER_METHOD = makeSymbol( "FUNCALL-CLASS-SUPER-METHOD" );
    $list84 = ConsesLow.list( makeSymbol( "INSTANCE" ), makeSymbol( "METHOD-NAME" ), makeSymbol( "&REST" ), makeSymbol( "ARGS" ) );
    $sym85$FUNCALL_INSTANCE_METHOD_WITH_0_ARGS = makeSymbol( "FUNCALL-INSTANCE-METHOD-WITH-0-ARGS" );
    $sym86$FUNCALL_INSTANCE_METHOD_WITH_1_ARGS = makeSymbol( "FUNCALL-INSTANCE-METHOD-WITH-1-ARGS" );
    $sym87$FUNCALL_INSTANCE_METHOD_WITH_2_ARGS = makeSymbol( "FUNCALL-INSTANCE-METHOD-WITH-2-ARGS" );
    $sym88$FUNCALL_INSTANCE_METHOD_WITH_3_ARGS = makeSymbol( "FUNCALL-INSTANCE-METHOD-WITH-3-ARGS" );
    $sym89$FUNCALL_INSTANCE_METHOD_WITH_4_ARGS = makeSymbol( "FUNCALL-INSTANCE-METHOD-WITH-4-ARGS" );
    $sym90$FUNCALL_INSTANCE_METHOD_WITH_5_ARGS = makeSymbol( "FUNCALL-INSTANCE-METHOD-WITH-5-ARGS" );
    $sym91$FUNCALL_INSTANCE_METHOD_WITH_6_ARGS = makeSymbol( "FUNCALL-INSTANCE-METHOD-WITH-6-ARGS" );
    $sym92$FUNCALL_INSTANCE_METHOD_WITH_7_ARGS = makeSymbol( "FUNCALL-INSTANCE-METHOD-WITH-7-ARGS" );
    $sym93$FUNCALL_INSTANCE_METHOD_WITH_8_ARGS = makeSymbol( "FUNCALL-INSTANCE-METHOD-WITH-8-ARGS" );
    $sym94$FUNCALL_INSTANCE_METHOD_WITH_9_ARGS = makeSymbol( "FUNCALL-INSTANCE-METHOD-WITH-9-ARGS" );
    $sym95$FUNCALL_INSTANCE_METHOD_WITH_10_ARGS = makeSymbol( "FUNCALL-INSTANCE-METHOD-WITH-10-ARGS" );
    $sym96$FUNCALL_INSTANCE_METHOD_WITH_11_ARGS = makeSymbol( "FUNCALL-INSTANCE-METHOD-WITH-11-ARGS" );
    $sym97$FUNCALL_INSTANCE_METHOD_WITH_12_ARGS = makeSymbol( "FUNCALL-INSTANCE-METHOD-WITH-12-ARGS" );
    $sym98$FUNCALL_INSTANCE_METHOD_WITH_13_ARGS = makeSymbol( "FUNCALL-INSTANCE-METHOD-WITH-13-ARGS" );
    $sym99$FUNCALL_INSTANCE_METHOD_WITH_14_ARGS = makeSymbol( "FUNCALL-INSTANCE-METHOD-WITH-14-ARGS" );
    $sym100$FUNCALL_INSTANCE_METHOD_WITH_15_ARGS = makeSymbol( "FUNCALL-INSTANCE-METHOD-WITH-15-ARGS" );
    $sym101$FUNCALL_INSTANCE_METHOD_WITH_16_ARGS = makeSymbol( "FUNCALL-INSTANCE-METHOD-WITH-16-ARGS" );
    $sym102$FUNCALL_INSTANCE_METHOD_WITH_17_ARGS = makeSymbol( "FUNCALL-INSTANCE-METHOD-WITH-17-ARGS" );
    $sym103$FUNCALL_INSTANCE_METHOD_WITH_18_ARGS = makeSymbol( "FUNCALL-INSTANCE-METHOD-WITH-18-ARGS" );
    $sym104$FUNCALL_INSTANCE_METHOD_WITH_19_ARGS = makeSymbol( "FUNCALL-INSTANCE-METHOD-WITH-19-ARGS" );
    $sym105$FUNCALL_INSTANCE_METHOD_WITH_20_ARGS = makeSymbol( "FUNCALL-INSTANCE-METHOD-WITH-20-ARGS" );
    $sym106$FUNCALL_INSTANCE_METHOD = makeSymbol( "FUNCALL-INSTANCE-METHOD" );
    $sym107$FUNCALL_INSTANCE_SUPER_METHOD_WITH_0_ARGS = makeSymbol( "FUNCALL-INSTANCE-SUPER-METHOD-WITH-0-ARGS" );
    $sym108$FUNCALL_INSTANCE_SUPER_METHOD_WITH_1_ARGS = makeSymbol( "FUNCALL-INSTANCE-SUPER-METHOD-WITH-1-ARGS" );
    $sym109$FUNCALL_INSTANCE_SUPER_METHOD_WITH_2_ARGS = makeSymbol( "FUNCALL-INSTANCE-SUPER-METHOD-WITH-2-ARGS" );
    $sym110$FUNCALL_INSTANCE_SUPER_METHOD_WITH_3_ARGS = makeSymbol( "FUNCALL-INSTANCE-SUPER-METHOD-WITH-3-ARGS" );
    $sym111$FUNCALL_INSTANCE_SUPER_METHOD_WITH_4_ARGS = makeSymbol( "FUNCALL-INSTANCE-SUPER-METHOD-WITH-4-ARGS" );
    $sym112$FUNCALL_INSTANCE_SUPER_METHOD_WITH_5_ARGS = makeSymbol( "FUNCALL-INSTANCE-SUPER-METHOD-WITH-5-ARGS" );
    $sym113$FUNCALL_INSTANCE_SUPER_METHOD_WITH_6_ARGS = makeSymbol( "FUNCALL-INSTANCE-SUPER-METHOD-WITH-6-ARGS" );
    $sym114$FUNCALL_INSTANCE_SUPER_METHOD_WITH_7_ARGS = makeSymbol( "FUNCALL-INSTANCE-SUPER-METHOD-WITH-7-ARGS" );
    $sym115$FUNCALL_INSTANCE_SUPER_METHOD_WITH_8_ARGS = makeSymbol( "FUNCALL-INSTANCE-SUPER-METHOD-WITH-8-ARGS" );
    $sym116$FUNCALL_INSTANCE_SUPER_METHOD_WITH_9_ARGS = makeSymbol( "FUNCALL-INSTANCE-SUPER-METHOD-WITH-9-ARGS" );
    $sym117$FUNCALL_INSTANCE_SUPER_METHOD_WITH_10_ARGS = makeSymbol( "FUNCALL-INSTANCE-SUPER-METHOD-WITH-10-ARGS" );
    $sym118$FUNCALL_INSTANCE_SUPER_METHOD_WITH_11_ARGS = makeSymbol( "FUNCALL-INSTANCE-SUPER-METHOD-WITH-11-ARGS" );
    $sym119$FUNCALL_INSTANCE_SUPER_METHOD_WITH_12_ARGS = makeSymbol( "FUNCALL-INSTANCE-SUPER-METHOD-WITH-12-ARGS" );
    $sym120$FUNCALL_INSTANCE_SUPER_METHOD_WITH_13_ARGS = makeSymbol( "FUNCALL-INSTANCE-SUPER-METHOD-WITH-13-ARGS" );
    $sym121$FUNCALL_INSTANCE_SUPER_METHOD_WITH_14_ARGS = makeSymbol( "FUNCALL-INSTANCE-SUPER-METHOD-WITH-14-ARGS" );
    $sym122$FUNCALL_INSTANCE_SUPER_METHOD_WITH_15_ARGS = makeSymbol( "FUNCALL-INSTANCE-SUPER-METHOD-WITH-15-ARGS" );
    $sym123$FUNCALL_INSTANCE_SUPER_METHOD_WITH_16_ARGS = makeSymbol( "FUNCALL-INSTANCE-SUPER-METHOD-WITH-16-ARGS" );
    $sym124$FUNCALL_INSTANCE_SUPER_METHOD_WITH_17_ARGS = makeSymbol( "FUNCALL-INSTANCE-SUPER-METHOD-WITH-17-ARGS" );
    $sym125$FUNCALL_INSTANCE_SUPER_METHOD_WITH_18_ARGS = makeSymbol( "FUNCALL-INSTANCE-SUPER-METHOD-WITH-18-ARGS" );
    $sym126$FUNCALL_INSTANCE_SUPER_METHOD_WITH_19_ARGS = makeSymbol( "FUNCALL-INSTANCE-SUPER-METHOD-WITH-19-ARGS" );
    $sym127$FUNCALL_INSTANCE_SUPER_METHOD_WITH_20_ARGS = makeSymbol( "FUNCALL-INSTANCE-SUPER-METHOD-WITH-20-ARGS" );
    $sym128$FUNCALL_INSTANCE_SUPER_METHOD = makeSymbol( "FUNCALL-INSTANCE-SUPER-METHOD" );
    $sym129$FUNCALL_CLASS_OR_INSTANCE_METHOD_WITH_0_ARGS = makeSymbol( "FUNCALL-CLASS-OR-INSTANCE-METHOD-WITH-0-ARGS" );
    $sym130$FUNCALL_CLASS_OR_INSTANCE_METHOD_WITH_1_ARGS = makeSymbol( "FUNCALL-CLASS-OR-INSTANCE-METHOD-WITH-1-ARGS" );
    $sym131$FUNCALL_CLASS_OR_INSTANCE_METHOD_WITH_2_ARGS = makeSymbol( "FUNCALL-CLASS-OR-INSTANCE-METHOD-WITH-2-ARGS" );
    $sym132$FUNCALL_CLASS_OR_INSTANCE_METHOD_WITH_3_ARGS = makeSymbol( "FUNCALL-CLASS-OR-INSTANCE-METHOD-WITH-3-ARGS" );
    $sym133$FUNCALL_CLASS_OR_INSTANCE_METHOD_WITH_4_ARGS = makeSymbol( "FUNCALL-CLASS-OR-INSTANCE-METHOD-WITH-4-ARGS" );
    $sym134$FUNCALL_CLASS_OR_INSTANCE_METHOD_WITH_5_ARGS = makeSymbol( "FUNCALL-CLASS-OR-INSTANCE-METHOD-WITH-5-ARGS" );
    $sym135$FUNCALL_CLASS_OR_INSTANCE_METHOD_WITH_6_ARGS = makeSymbol( "FUNCALL-CLASS-OR-INSTANCE-METHOD-WITH-6-ARGS" );
    $sym136$FUNCALL_CLASS_OR_INSTANCE_METHOD_WITH_7_ARGS = makeSymbol( "FUNCALL-CLASS-OR-INSTANCE-METHOD-WITH-7-ARGS" );
    $sym137$FUNCALL_CLASS_OR_INSTANCE_METHOD_WITH_8_ARGS = makeSymbol( "FUNCALL-CLASS-OR-INSTANCE-METHOD-WITH-8-ARGS" );
    $sym138$FUNCALL_CLASS_OR_INSTANCE_METHOD_WITH_9_ARGS = makeSymbol( "FUNCALL-CLASS-OR-INSTANCE-METHOD-WITH-9-ARGS" );
    $sym139$FUNCALL_CLASS_OR_INSTANCE_METHOD_WITH_10_ARGS = makeSymbol( "FUNCALL-CLASS-OR-INSTANCE-METHOD-WITH-10-ARGS" );
    $sym140$FUNCALL_CLASS_OR_INSTANCE_METHOD_WITH_11_ARGS = makeSymbol( "FUNCALL-CLASS-OR-INSTANCE-METHOD-WITH-11-ARGS" );
    $sym141$FUNCALL_CLASS_OR_INSTANCE_METHOD_WITH_12_ARGS = makeSymbol( "FUNCALL-CLASS-OR-INSTANCE-METHOD-WITH-12-ARGS" );
    $sym142$FUNCALL_CLASS_OR_INSTANCE_METHOD_WITH_13_ARGS = makeSymbol( "FUNCALL-CLASS-OR-INSTANCE-METHOD-WITH-13-ARGS" );
    $sym143$FUNCALL_CLASS_OR_INSTANCE_METHOD_WITH_14_ARGS = makeSymbol( "FUNCALL-CLASS-OR-INSTANCE-METHOD-WITH-14-ARGS" );
    $sym144$FUNCALL_CLASS_OR_INSTANCE_METHOD_WITH_15_ARGS = makeSymbol( "FUNCALL-CLASS-OR-INSTANCE-METHOD-WITH-15-ARGS" );
    $sym145$FUNCALL_CLASS_OR_INSTANCE_METHOD_WITH_16_ARGS = makeSymbol( "FUNCALL-CLASS-OR-INSTANCE-METHOD-WITH-16-ARGS" );
    $sym146$FUNCALL_CLASS_OR_INSTANCE_METHOD_WITH_17_ARGS = makeSymbol( "FUNCALL-CLASS-OR-INSTANCE-METHOD-WITH-17-ARGS" );
    $sym147$FUNCALL_CLASS_OR_INSTANCE_METHOD_WITH_18_ARGS = makeSymbol( "FUNCALL-CLASS-OR-INSTANCE-METHOD-WITH-18-ARGS" );
    $sym148$FUNCALL_CLASS_OR_INSTANCE_METHOD_WITH_19_ARGS = makeSymbol( "FUNCALL-CLASS-OR-INSTANCE-METHOD-WITH-19-ARGS" );
    $sym149$FUNCALL_CLASS_OR_INSTANCE_METHOD_WITH_20_ARGS = makeSymbol( "FUNCALL-CLASS-OR-INSTANCE-METHOD-WITH-20-ARGS" );
    $str150$APPLY_INSTANCE_METHOD__either_ins = makeString( "APPLY-INSTANCE-METHOD: either instance ~S or method ~S are invalid." );
    $str151$APPLY_INSTANCE_METHOD__No__S_meth = makeString( "APPLY-INSTANCE-METHOD: No ~S method is associated with the class ~S of instance ~S." );
    $sym152$FUNCALL_INSTANCE_METHOD_W_O_RECURSION = makeSymbol( "FUNCALL-INSTANCE-METHOD-W/O-RECURSION" );
    $sym153$CAR = makeSymbol( "CAR" );
    $sym154$_ = makeSymbol( "=" );
    $sym155$STRING_EQUAL = makeSymbol( "STRING-EQUAL" );
    $list156 = ConsesLow.list( ConsesLow.list( makeSymbol( "SETTABLE-MATCH-LOC" ), makeSymbol( "SETTABLE-NO-MATCH-LOC" ) ), makeSymbol( "ITEM" ), makeSymbol( "SEQUENCE" ), makeSymbol( "&OPTIONAL" ), ConsesLow.list(
        makeSymbol( "KEY" ), ConsesLow.list( makeSymbol( "QUOTE" ), IDENTITY ) ), ConsesLow.list( makeSymbol( "TEST" ), ConsesLow.list( makeSymbol( "QUOTE" ), EQ ) ) );
    $str157$item = makeString( "item" );
    $str158$match_list = makeString( "match-list" );
    $str159$not_match_list = makeString( "not-match-list" );
    $str160$element = makeString( "element" );
    $str161$sublist = makeString( "sublist" );
    $list162 = ConsesLow.list( NIL );
    $sym163$CDOLIST_AND_SUBLISTS_CAREFULLY = makeSymbol( "CDOLIST-AND-SUBLISTS-CAREFULLY" );
    $sym164$RPLACD = makeSymbol( "RPLACD" );
    $sym165$CSETQ = makeSymbol( "CSETQ" );
    $sym166$CSETF = makeSymbol( "CSETF" );
    $sym167$NREVERSE = makeSymbol( "NREVERSE" );
    $str168$DO_CLASSES_IN_ORDER___S_is_not_a_ = makeString( "DO-CLASSES-IN-ORDER: ~S is not a legal variable.  A non nil symbol was expected." );
    $str169$DO_CLASSES_IN_ORDER___S_is_not_a_ = makeString( "DO-CLASSES-IN-ORDER: ~S is not a legal optional extension for a listed depth var.~%~\n     A listed non null symbol or nil was expected." );
    $str170$DO_CLASSES_IN_ORDER___S_is_not_a_ = makeString( "DO-CLASSES-IN-ORDER: ~S is not a legal body." );
    $str171$Class__A_not_recognized_ = makeString( "Class ~A not recognized." );
    $list172 = ConsesLow.list( makeKeyword( "TARGET-NOT-A-CLASS" ), makeKeyword( "TARGET-NOT-AN-INSTANCE" ), makeKeyword( "TARGET-METHOD-CONFLICT" ), makeKeyword( "ACCESS-LEVEL-CONFLICT" ), makeKeyword(
        "INVALID-METHOD-NAME" ), makeKeyword( "UNDECLARED-METHOD" ), makeKeyword( "UNDEFINED-METHOD" ) );
    $sym173$SUBLOOP_SAFE_FUNCALLER_ERROR_VALUE = makeSymbol( "SUBLOOP-SAFE-FUNCALLER-ERROR-VALUE" );
    $str174$_S___S_is_not_a_member_of_the__S_ = makeString( "~S: ~S is not a member of the ~S enumeration." );
    $sym175$ENCODE_SUBLOOP_SAFE_FUNCALLER_ERROR_VALUE = makeSymbol( "ENCODE-SUBLOOP-SAFE-FUNCALLER-ERROR-VALUE" );
    $str176$_S___S_is_not_a_valid_encoding_of = makeString( "~S: ~S is not a valid encoding of the ~S enumeration." );
    $sym177$DECODE_SUBLOOP_SAFE_FUNCALLER_ERROR_VALUE = makeSymbol( "DECODE-SUBLOOP-SAFE-FUNCALLER-ERROR-VALUE" );
    $str178$_S___S_was_expected_to_be_a_membe = makeString( "~S: ~S was expected to be a member of the enumeration ~S." );
    $sym179$SUBLOOP_SAFE_FUNCALLER_ERROR_VALUE_P = makeSymbol( "SUBLOOP-SAFE-FUNCALLER-ERROR-VALUE-P" );
    $list180 = ConsesLow.list( makeSymbol( "PUNLESS" ), ConsesLow.list( makeSymbol( "CLASS-P" ), makeSymbol( "CLASS" ) ), ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "VALUES" ), NIL, makeKeyword(
        "TARGET-NOT-A-CLASS" ) ) ) );
    $list181 = ConsesLow.list( makeSymbol( "PUNLESS" ), ConsesLow.list( makeSymbol( "CAND" ), makeSymbol( "METHOD-NAME" ), ConsesLow.list( makeSymbol( "SYMBOLP" ), makeSymbol( "METHOD-NAME" ) ) ), ConsesLow.list(
        makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "VALUES" ), NIL, makeKeyword( "INVALID-METHOD-NAME" ) ) ) );
    $list182 = ConsesLow.list( makeSymbol( "PUNLESS" ), makeSymbol( "METHOD" ), ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "VALUES" ), NIL, makeKeyword( "UNDECLARED-METHOD" ) ) ) );
    $list183 = ConsesLow.list( makeSymbol( "PUNLESS" ), ConsesLow.list( makeSymbol( "INSTANCES-ACCESS-CHECK-METHOD" ), makeSymbol( "CLASS" ), makeSymbol( "METHOD" ) ), ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list(
        makeSymbol( "VALUES" ), NIL, makeKeyword( "ACCESS-LEVEL-CONFLICT" ) ) ) );
    $list184 = ConsesLow.list( ConsesLow.list( makeSymbol( "FUNCTION-REF" ), ConsesLow.list( makeSymbol( "METHOD-FUNCTION-NAME" ), makeSymbol( "METHOD" ) ) ) );
    $list185 = ConsesLow.list( makeSymbol( "PUNLESS" ), ConsesLow.list( makeSymbol( "FBOUNDP" ), makeSymbol( "FUNCTION-REF" ) ), ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "VALUES" ), NIL,
        makeKeyword( "UNDEFINED-METHOD" ) ) ) );
    $sym186$VALUES = makeSymbol( "VALUES" );
    $sym187$FUNCTION_REF = makeSymbol( "FUNCTION-REF" );
    $list188 = ConsesLow.list( makeSymbol( "PUNLESS" ), ConsesLow.list( makeSymbol( "INSTANCE-P" ), makeSymbol( "INSTANCE" ) ), ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "VALUES" ), NIL,
        makeKeyword( "TARGET-NOT-AN-INSTANCE" ) ) ) );
    $list189 = ConsesLow.list( makeSymbol( "PUNLESS" ), ConsesLow.list( makeSymbol( "SYMBOLP" ), makeSymbol( "METHOD-NAME" ) ), ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "VALUES" ), NIL,
        makeKeyword( "INVALID-METHOD-NAME" ) ) ) );
    $list190 = ConsesLow.list( ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "VALUES" ), NIL, makeKeyword( "UNDECLARED-METHOD" ) ) ) );
    $list191 = ConsesLow.list( makeSymbol( "PUNLESS" ), makeSymbol( "METHOD" ), ConsesLow.list( makeSymbol( "VALUES" ), NIL, makeKeyword( "UNDECLARED-METHOD" ) ) );
    $list192 = ConsesLow.list( makeSymbol( "PUNLESS" ), ConsesLow.list( makeSymbol( "INSTANCES-ACCESS-CHECK-METHOD" ), makeSymbol( "CLASS" ), makeSymbol( "METHOD" ) ), ConsesLow.list( makeSymbol( "VALUES" ), NIL,
        makeKeyword( "ACCESS-LEVEL-CONFLICT" ) ) );
    $sym193$SAFE_FUNCALL_CLASS_METHOD_WITH_0_ARGS = makeSymbol( "SAFE-FUNCALL-CLASS-METHOD-WITH-0-ARGS" );
    $sym194$SAFE_FUNCALL_CLASS_METHOD_WITH_1_ARGS = makeSymbol( "SAFE-FUNCALL-CLASS-METHOD-WITH-1-ARGS" );
    $sym195$SAFE_FUNCALL_CLASS_METHOD_WITH_2_ARGS = makeSymbol( "SAFE-FUNCALL-CLASS-METHOD-WITH-2-ARGS" );
    $sym196$SAFE_FUNCALL_CLASS_METHOD_WITH_3_ARGS = makeSymbol( "SAFE-FUNCALL-CLASS-METHOD-WITH-3-ARGS" );
    $sym197$SAFE_FUNCALL_CLASS_METHOD_WITH_4_ARGS = makeSymbol( "SAFE-FUNCALL-CLASS-METHOD-WITH-4-ARGS" );
    $sym198$SAFE_FUNCALL_CLASS_METHOD_WITH_5_ARGS = makeSymbol( "SAFE-FUNCALL-CLASS-METHOD-WITH-5-ARGS" );
    $sym199$SAFE_FUNCALL_CLASS_METHOD_WITH_6_ARGS = makeSymbol( "SAFE-FUNCALL-CLASS-METHOD-WITH-6-ARGS" );
    $sym200$SAFE_FUNCALL_CLASS_METHOD_WITH_7_ARGS = makeSymbol( "SAFE-FUNCALL-CLASS-METHOD-WITH-7-ARGS" );
    $sym201$SAFE_FUNCALL_CLASS_METHOD_WITH_8_ARGS = makeSymbol( "SAFE-FUNCALL-CLASS-METHOD-WITH-8-ARGS" );
    $sym202$SAFE_FUNCALL_CLASS_METHOD_WITH_9_ARGS = makeSymbol( "SAFE-FUNCALL-CLASS-METHOD-WITH-9-ARGS" );
    $sym203$SAFE_FUNCALL_CLASS_METHOD_WITH_10_ARGS = makeSymbol( "SAFE-FUNCALL-CLASS-METHOD-WITH-10-ARGS" );
    $sym204$SAFE_FUNCALL_CLASS_METHOD_WITH_11_ARGS = makeSymbol( "SAFE-FUNCALL-CLASS-METHOD-WITH-11-ARGS" );
    $sym205$SAFE_FUNCALL_CLASS_METHOD_WITH_12_ARGS = makeSymbol( "SAFE-FUNCALL-CLASS-METHOD-WITH-12-ARGS" );
    $sym206$SAFE_FUNCALL_CLASS_METHOD_WITH_13_ARGS = makeSymbol( "SAFE-FUNCALL-CLASS-METHOD-WITH-13-ARGS" );
    $sym207$SAFE_FUNCALL_CLASS_METHOD_WITH_14_ARGS = makeSymbol( "SAFE-FUNCALL-CLASS-METHOD-WITH-14-ARGS" );
    $sym208$SAFE_FUNCALL_CLASS_METHOD_WITH_15_ARGS = makeSymbol( "SAFE-FUNCALL-CLASS-METHOD-WITH-15-ARGS" );
    $sym209$SAFE_FUNCALL_CLASS_METHOD_WITH_16_ARGS = makeSymbol( "SAFE-FUNCALL-CLASS-METHOD-WITH-16-ARGS" );
    $sym210$SAFE_FUNCALL_CLASS_METHOD_WITH_17_ARGS = makeSymbol( "SAFE-FUNCALL-CLASS-METHOD-WITH-17-ARGS" );
    $sym211$SAFE_FUNCALL_CLASS_METHOD_WITH_18_ARGS = makeSymbol( "SAFE-FUNCALL-CLASS-METHOD-WITH-18-ARGS" );
    $sym212$SAFE_FUNCALL_CLASS_METHOD_WITH_19_ARGS = makeSymbol( "SAFE-FUNCALL-CLASS-METHOD-WITH-19-ARGS" );
    $sym213$SAFE_FUNCALL_CLASS_METHOD_WITH_20_ARGS = makeSymbol( "SAFE-FUNCALL-CLASS-METHOD-WITH-20-ARGS" );
    $sym214$SAFE_FUNCALL_CLASS_METHOD = makeSymbol( "SAFE-FUNCALL-CLASS-METHOD" );
    $sym215$SAFE_FUNCALL_CLASS_SUPER_METHOD_WITH_0_ARGS = makeSymbol( "SAFE-FUNCALL-CLASS-SUPER-METHOD-WITH-0-ARGS" );
    $sym216$SAFE_FUNCALL_CLASS_SUPER_METHOD_WITH_1_ARGS = makeSymbol( "SAFE-FUNCALL-CLASS-SUPER-METHOD-WITH-1-ARGS" );
    $sym217$SAFE_FUNCALL_CLASS_SUPER_METHOD_WITH_2_ARGS = makeSymbol( "SAFE-FUNCALL-CLASS-SUPER-METHOD-WITH-2-ARGS" );
    $sym218$SAFE_FUNCALL_CLASS_SUPER_METHOD_WITH_3_ARGS = makeSymbol( "SAFE-FUNCALL-CLASS-SUPER-METHOD-WITH-3-ARGS" );
    $sym219$SAFE_FUNCALL_CLASS_SUPER_METHOD_WITH_4_ARGS = makeSymbol( "SAFE-FUNCALL-CLASS-SUPER-METHOD-WITH-4-ARGS" );
    $sym220$SAFE_FUNCALL_CLASS_SUPER_METHOD_WITH_5_ARGS = makeSymbol( "SAFE-FUNCALL-CLASS-SUPER-METHOD-WITH-5-ARGS" );
    $sym221$SAFE_FUNCALL_CLASS_SUPER_METHOD_WITH_6_ARGS = makeSymbol( "SAFE-FUNCALL-CLASS-SUPER-METHOD-WITH-6-ARGS" );
    $sym222$SAFE_FUNCALL_CLASS_SUPER_METHOD_WITH_7_ARGS = makeSymbol( "SAFE-FUNCALL-CLASS-SUPER-METHOD-WITH-7-ARGS" );
    $sym223$SAFE_FUNCALL_CLASS_SUPER_METHOD_WITH_8_ARGS = makeSymbol( "SAFE-FUNCALL-CLASS-SUPER-METHOD-WITH-8-ARGS" );
    $sym224$SAFE_FUNCALL_CLASS_SUPER_METHOD_WITH_9_ARGS = makeSymbol( "SAFE-FUNCALL-CLASS-SUPER-METHOD-WITH-9-ARGS" );
    $sym225$SAFE_FUNCALL_CLASS_SUPER_METHOD_WITH_10_ARGS = makeSymbol( "SAFE-FUNCALL-CLASS-SUPER-METHOD-WITH-10-ARGS" );
    $sym226$SAFE_FUNCALL_CLASS_SUPER_METHOD_WITH_11_ARGS = makeSymbol( "SAFE-FUNCALL-CLASS-SUPER-METHOD-WITH-11-ARGS" );
    $sym227$SAFE_FUNCALL_CLASS_SUPER_METHOD_WITH_12_ARGS = makeSymbol( "SAFE-FUNCALL-CLASS-SUPER-METHOD-WITH-12-ARGS" );
    $sym228$SAFE_FUNCALL_CLASS_SUPER_METHOD_WITH_13_ARGS = makeSymbol( "SAFE-FUNCALL-CLASS-SUPER-METHOD-WITH-13-ARGS" );
    $sym229$SAFE_FUNCALL_CLASS_SUPER_METHOD_WITH_14_ARGS = makeSymbol( "SAFE-FUNCALL-CLASS-SUPER-METHOD-WITH-14-ARGS" );
    $sym230$SAFE_FUNCALL_CLASS_SUPER_METHOD_WITH_15_ARGS = makeSymbol( "SAFE-FUNCALL-CLASS-SUPER-METHOD-WITH-15-ARGS" );
    $sym231$SAFE_FUNCALL_CLASS_SUPER_METHOD_WITH_16_ARGS = makeSymbol( "SAFE-FUNCALL-CLASS-SUPER-METHOD-WITH-16-ARGS" );
    $sym232$SAFE_FUNCALL_CLASS_SUPER_METHOD_WITH_17_ARGS = makeSymbol( "SAFE-FUNCALL-CLASS-SUPER-METHOD-WITH-17-ARGS" );
    $sym233$SAFE_FUNCALL_CLASS_SUPER_METHOD_WITH_18_ARGS = makeSymbol( "SAFE-FUNCALL-CLASS-SUPER-METHOD-WITH-18-ARGS" );
    $sym234$SAFE_FUNCALL_CLASS_SUPER_METHOD_WITH_19_ARGS = makeSymbol( "SAFE-FUNCALL-CLASS-SUPER-METHOD-WITH-19-ARGS" );
    $sym235$SAFE_FUNCALL_CLASS_SUPER_METHOD_WITH_20_ARGS = makeSymbol( "SAFE-FUNCALL-CLASS-SUPER-METHOD-WITH-20-ARGS" );
    $sym236$SAFE_FUNCALL_CLASS_SUPER_METHOD = makeSymbol( "SAFE-FUNCALL-CLASS-SUPER-METHOD" );
    $sym237$SAFE_FUNCALL_INSTANCE_METHOD_WITH_0_ARGS = makeSymbol( "SAFE-FUNCALL-INSTANCE-METHOD-WITH-0-ARGS" );
    $sym238$SAFE_FUNCALL_INSTANCE_METHOD_WITH_1_ARGS = makeSymbol( "SAFE-FUNCALL-INSTANCE-METHOD-WITH-1-ARGS" );
    $sym239$SAFE_FUNCALL_INSTANCE_METHOD_WITH_2_ARGS = makeSymbol( "SAFE-FUNCALL-INSTANCE-METHOD-WITH-2-ARGS" );
    $sym240$SAFE_FUNCALL_INSTANCE_METHOD_WITH_3_ARGS = makeSymbol( "SAFE-FUNCALL-INSTANCE-METHOD-WITH-3-ARGS" );
    $sym241$SAFE_FUNCALL_INSTANCE_METHOD_WITH_4_ARGS = makeSymbol( "SAFE-FUNCALL-INSTANCE-METHOD-WITH-4-ARGS" );
    $sym242$SAFE_FUNCALL_INSTANCE_METHOD_WITH_5_ARGS = makeSymbol( "SAFE-FUNCALL-INSTANCE-METHOD-WITH-5-ARGS" );
    $sym243$SAFE_FUNCALL_INSTANCE_METHOD_WITH_6_ARGS = makeSymbol( "SAFE-FUNCALL-INSTANCE-METHOD-WITH-6-ARGS" );
    $sym244$SAFE_FUNCALL_INSTANCE_METHOD_WITH_7_ARGS = makeSymbol( "SAFE-FUNCALL-INSTANCE-METHOD-WITH-7-ARGS" );
    $sym245$SAFE_FUNCALL_INSTANCE_METHOD_WITH_8_ARGS = makeSymbol( "SAFE-FUNCALL-INSTANCE-METHOD-WITH-8-ARGS" );
    $sym246$SAFE_FUNCALL_INSTANCE_METHOD_WITH_9_ARGS = makeSymbol( "SAFE-FUNCALL-INSTANCE-METHOD-WITH-9-ARGS" );
    $sym247$SAFE_FUNCALL_INSTANCE_METHOD_WITH_10_ARGS = makeSymbol( "SAFE-FUNCALL-INSTANCE-METHOD-WITH-10-ARGS" );
    $sym248$SAFE_FUNCALL_INSTANCE_METHOD_WITH_11_ARGS = makeSymbol( "SAFE-FUNCALL-INSTANCE-METHOD-WITH-11-ARGS" );
    $sym249$SAFE_FUNCALL_INSTANCE_METHOD_WITH_12_ARGS = makeSymbol( "SAFE-FUNCALL-INSTANCE-METHOD-WITH-12-ARGS" );
    $sym250$SAFE_FUNCALL_INSTANCE_METHOD_WITH_13_ARGS = makeSymbol( "SAFE-FUNCALL-INSTANCE-METHOD-WITH-13-ARGS" );
    $sym251$SAFE_FUNCALL_INSTANCE_METHOD_WITH_14_ARGS = makeSymbol( "SAFE-FUNCALL-INSTANCE-METHOD-WITH-14-ARGS" );
    $sym252$SAFE_FUNCALL_INSTANCE_METHOD_WITH_15_ARGS = makeSymbol( "SAFE-FUNCALL-INSTANCE-METHOD-WITH-15-ARGS" );
    $sym253$SAFE_FUNCALL_INSTANCE_METHOD_WITH_16_ARGS = makeSymbol( "SAFE-FUNCALL-INSTANCE-METHOD-WITH-16-ARGS" );
    $sym254$SAFE_FUNCALL_INSTANCE_METHOD_WITH_17_ARGS = makeSymbol( "SAFE-FUNCALL-INSTANCE-METHOD-WITH-17-ARGS" );
    $sym255$SAFE_FUNCALL_INSTANCE_METHOD_WITH_18_ARGS = makeSymbol( "SAFE-FUNCALL-INSTANCE-METHOD-WITH-18-ARGS" );
    $sym256$SAFE_FUNCALL_INSTANCE_METHOD_WITH_19_ARGS = makeSymbol( "SAFE-FUNCALL-INSTANCE-METHOD-WITH-19-ARGS" );
    $sym257$SAFE_FUNCALL_INSTANCE_METHOD_WITH_20_ARGS = makeSymbol( "SAFE-FUNCALL-INSTANCE-METHOD-WITH-20-ARGS" );
    $sym258$SAFE_FUNCALL_INSTANCE_METHOD = makeSymbol( "SAFE-FUNCALL-INSTANCE-METHOD" );
    $sym259$SAFE_FUNCALL_INSTANCE_SUPER_METHOD_WITH_0_ARGS = makeSymbol( "SAFE-FUNCALL-INSTANCE-SUPER-METHOD-WITH-0-ARGS" );
    $sym260$SAFE_FUNCALL_INSTANCE_SUPER_METHOD_WITH_1_ARGS = makeSymbol( "SAFE-FUNCALL-INSTANCE-SUPER-METHOD-WITH-1-ARGS" );
    $sym261$SAFE_FUNCALL_INSTANCE_SUPER_METHOD_WITH_2_ARGS = makeSymbol( "SAFE-FUNCALL-INSTANCE-SUPER-METHOD-WITH-2-ARGS" );
    $sym262$SAFE_FUNCALL_INSTANCE_SUPER_METHOD_WITH_3_ARGS = makeSymbol( "SAFE-FUNCALL-INSTANCE-SUPER-METHOD-WITH-3-ARGS" );
    $sym263$SAFE_FUNCALL_INSTANCE_SUPER_METHOD_WITH_4_ARGS = makeSymbol( "SAFE-FUNCALL-INSTANCE-SUPER-METHOD-WITH-4-ARGS" );
    $sym264$SAFE_FUNCALL_INSTANCE_SUPER_METHOD_WITH_5_ARGS = makeSymbol( "SAFE-FUNCALL-INSTANCE-SUPER-METHOD-WITH-5-ARGS" );
    $sym265$SAFE_FUNCALL_INSTANCE_SUPER_METHOD_WITH_6_ARGS = makeSymbol( "SAFE-FUNCALL-INSTANCE-SUPER-METHOD-WITH-6-ARGS" );
    $sym266$SAFE_FUNCALL_INSTANCE_SUPER_METHOD_WITH_7_ARGS = makeSymbol( "SAFE-FUNCALL-INSTANCE-SUPER-METHOD-WITH-7-ARGS" );
    $sym267$SAFE_FUNCALL_INSTANCE_SUPER_METHOD_WITH_8_ARGS = makeSymbol( "SAFE-FUNCALL-INSTANCE-SUPER-METHOD-WITH-8-ARGS" );
    $sym268$SAFE_FUNCALL_INSTANCE_SUPER_METHOD_WITH_9_ARGS = makeSymbol( "SAFE-FUNCALL-INSTANCE-SUPER-METHOD-WITH-9-ARGS" );
    $sym269$SAFE_FUNCALL_INSTANCE_SUPER_METHOD_WITH_10_ARGS = makeSymbol( "SAFE-FUNCALL-INSTANCE-SUPER-METHOD-WITH-10-ARGS" );
    $sym270$SAFE_FUNCALL_INSTANCE_SUPER_METHOD_WITH_11_ARGS = makeSymbol( "SAFE-FUNCALL-INSTANCE-SUPER-METHOD-WITH-11-ARGS" );
    $sym271$SAFE_FUNCALL_INSTANCE_SUPER_METHOD_WITH_12_ARGS = makeSymbol( "SAFE-FUNCALL-INSTANCE-SUPER-METHOD-WITH-12-ARGS" );
    $sym272$SAFE_FUNCALL_INSTANCE_SUPER_METHOD_WITH_13_ARGS = makeSymbol( "SAFE-FUNCALL-INSTANCE-SUPER-METHOD-WITH-13-ARGS" );
    $sym273$SAFE_FUNCALL_INSTANCE_SUPER_METHOD_WITH_14_ARGS = makeSymbol( "SAFE-FUNCALL-INSTANCE-SUPER-METHOD-WITH-14-ARGS" );
    $sym274$SAFE_FUNCALL_INSTANCE_SUPER_METHOD_WITH_15_ARGS = makeSymbol( "SAFE-FUNCALL-INSTANCE-SUPER-METHOD-WITH-15-ARGS" );
    $sym275$SAFE_FUNCALL_INSTANCE_SUPER_METHOD_WITH_16_ARGS = makeSymbol( "SAFE-FUNCALL-INSTANCE-SUPER-METHOD-WITH-16-ARGS" );
    $sym276$SAFE_FUNCALL_INSTANCE_SUPER_METHOD_WITH_17_ARGS = makeSymbol( "SAFE-FUNCALL-INSTANCE-SUPER-METHOD-WITH-17-ARGS" );
    $sym277$SAFE_FUNCALL_INSTANCE_SUPER_METHOD_WITH_18_ARGS = makeSymbol( "SAFE-FUNCALL-INSTANCE-SUPER-METHOD-WITH-18-ARGS" );
    $sym278$SAFE_FUNCALL_INSTANCE_SUPER_METHOD_WITH_19_ARGS = makeSymbol( "SAFE-FUNCALL-INSTANCE-SUPER-METHOD-WITH-19-ARGS" );
    $sym279$SAFE_FUNCALL_INSTANCE_SUPER_METHOD_WITH_20_ARGS = makeSymbol( "SAFE-FUNCALL-INSTANCE-SUPER-METHOD-WITH-20-ARGS" );
    $sym280$SAFE_FUNCALL_INSTANCE_SUPER_METHOD = makeSymbol( "SAFE-FUNCALL-INSTANCE-SUPER-METHOD" );
    $sym281$SAFE_FUNCALL_CLASS_OR_INSTANCE_METHOD_WITH_0_ARGS = makeSymbol( "SAFE-FUNCALL-CLASS-OR-INSTANCE-METHOD-WITH-0-ARGS" );
    $sym282$SAFE_FUNCALL_CLASS_OR_INSTANCE_METHOD_WITH_1_ARGS = makeSymbol( "SAFE-FUNCALL-CLASS-OR-INSTANCE-METHOD-WITH-1-ARGS" );
    $sym283$SAFE_FUNCALL_CLASS_OR_INSTANCE_METHOD_WITH_2_ARGS = makeSymbol( "SAFE-FUNCALL-CLASS-OR-INSTANCE-METHOD-WITH-2-ARGS" );
    $sym284$SAFE_FUNCALL_CLASS_OR_INSTANCE_METHOD_WITH_3_ARGS = makeSymbol( "SAFE-FUNCALL-CLASS-OR-INSTANCE-METHOD-WITH-3-ARGS" );
    $sym285$SAFE_FUNCALL_CLASS_OR_INSTANCE_METHOD_WITH_4_ARGS = makeSymbol( "SAFE-FUNCALL-CLASS-OR-INSTANCE-METHOD-WITH-4-ARGS" );
    $sym286$SAFE_FUNCALL_CLASS_OR_INSTANCE_METHOD_WITH_5_ARGS = makeSymbol( "SAFE-FUNCALL-CLASS-OR-INSTANCE-METHOD-WITH-5-ARGS" );
    $sym287$SAFE_FUNCALL_CLASS_OR_INSTANCE_METHOD_WITH_6_ARGS = makeSymbol( "SAFE-FUNCALL-CLASS-OR-INSTANCE-METHOD-WITH-6-ARGS" );
    $sym288$SAFE_FUNCALL_CLASS_OR_INSTANCE_METHOD_WITH_7_ARGS = makeSymbol( "SAFE-FUNCALL-CLASS-OR-INSTANCE-METHOD-WITH-7-ARGS" );
    $sym289$SAFE_FUNCALL_CLASS_OR_INSTANCE_METHOD_WITH_8_ARGS = makeSymbol( "SAFE-FUNCALL-CLASS-OR-INSTANCE-METHOD-WITH-8-ARGS" );
    $sym290$SAFE_FUNCALL_CLASS_OR_INSTANCE_METHOD_WITH_9_ARGS = makeSymbol( "SAFE-FUNCALL-CLASS-OR-INSTANCE-METHOD-WITH-9-ARGS" );
    $sym291$SAFE_FUNCALL_CLASS_OR_INSTANCE_METHOD_WITH_10_ARGS = makeSymbol( "SAFE-FUNCALL-CLASS-OR-INSTANCE-METHOD-WITH-10-ARGS" );
    $sym292$SAFE_FUNCALL_CLASS_OR_INSTANCE_METHOD_WITH_11_ARGS = makeSymbol( "SAFE-FUNCALL-CLASS-OR-INSTANCE-METHOD-WITH-11-ARGS" );
    $sym293$SAFE_FUNCALL_CLASS_OR_INSTANCE_METHOD_WITH_12_ARGS = makeSymbol( "SAFE-FUNCALL-CLASS-OR-INSTANCE-METHOD-WITH-12-ARGS" );
    $sym294$SAFE_FUNCALL_CLASS_OR_INSTANCE_METHOD_WITH_13_ARGS = makeSymbol( "SAFE-FUNCALL-CLASS-OR-INSTANCE-METHOD-WITH-13-ARGS" );
    $sym295$SAFE_FUNCALL_CLASS_OR_INSTANCE_METHOD_WITH_14_ARGS = makeSymbol( "SAFE-FUNCALL-CLASS-OR-INSTANCE-METHOD-WITH-14-ARGS" );
    $sym296$SAFE_FUNCALL_CLASS_OR_INSTANCE_METHOD_WITH_15_ARGS = makeSymbol( "SAFE-FUNCALL-CLASS-OR-INSTANCE-METHOD-WITH-15-ARGS" );
    $sym297$SAFE_FUNCALL_CLASS_OR_INSTANCE_METHOD_WITH_16_ARGS = makeSymbol( "SAFE-FUNCALL-CLASS-OR-INSTANCE-METHOD-WITH-16-ARGS" );
    $sym298$SAFE_FUNCALL_CLASS_OR_INSTANCE_METHOD_WITH_17_ARGS = makeSymbol( "SAFE-FUNCALL-CLASS-OR-INSTANCE-METHOD-WITH-17-ARGS" );
    $sym299$SAFE_FUNCALL_CLASS_OR_INSTANCE_METHOD_WITH_18_ARGS = makeSymbol( "SAFE-FUNCALL-CLASS-OR-INSTANCE-METHOD-WITH-18-ARGS" );
    $sym300$SAFE_FUNCALL_CLASS_OR_INSTANCE_METHOD_WITH_19_ARGS = makeSymbol( "SAFE-FUNCALL-CLASS-OR-INSTANCE-METHOD-WITH-19-ARGS" );
    $sym301$SAFE_FUNCALL_CLASS_OR_INSTANCE_METHOD_WITH_20_ARGS = makeSymbol( "SAFE-FUNCALL-CLASS-OR-INSTANCE-METHOD-WITH-20-ARGS" );
  }
}
/*
 * 
 * Total time: 552 ms
 * 
 */