package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
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

public final class classes_utilities extends SubLTranslatedFile
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
    public static SubLObject define_class_method_funcallers(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject name_template = (SubLObject)classes_utilities.NIL;
        SubLObject max_args = (SubLObject)classes_utilities.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)classes_utilities.$list3);
        name_template = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)classes_utilities.$list3);
        max_args = current.first();
        current = current.rest();
        if (classes_utilities.NIL == current) {
            SubLObject function_defs = (SubLObject)classes_utilities.NIL;
            SubLObject arg_list = (SubLObject)classes_utilities.NIL;
            SubLObject function_name = (SubLObject)classes_utilities.NIL;
            SubLObject function_def = (SubLObject)classes_utilities.NIL;
            SubLObject cdotimes_end_var;
            SubLObject i;
            for (cdotimes_end_var = Numbers.add(max_args, (SubLObject)classes_utilities.ONE_INTEGER), i = (SubLObject)classes_utilities.NIL, i = (SubLObject)classes_utilities.ZERO_INTEGER; i.numL(cdotimes_end_var); i = Numbers.add(i, (SubLObject)classes_utilities.ONE_INTEGER)) {
                function_name = Packages.intern(PrintLow.format((SubLObject)classes_utilities.NIL, name_template, i), (SubLObject)classes_utilities.UNPROVIDED);
                function_def = conses_high.copy_tree((SubLObject)ConsesLow.listS((SubLObject)classes_utilities.$sym4$DEFINE_PUBLIC, function_name, (SubLObject)ConsesLow.listS((SubLObject)classes_utilities.$sym5$CLASS_NAME_OR_CLASS, (SubLObject)classes_utilities.$sym6$METHOD_NAME, arg_list), (SubLObject)ConsesLow.list((SubLObject)classes_utilities.$sym7$CLET, (SubLObject)classes_utilities.$list8, (SubLObject)classes_utilities.$list9, (SubLObject)classes_utilities.$list10, (SubLObject)ConsesLow.list((SubLObject)classes_utilities.$sym7$CLET, (SubLObject)classes_utilities.$list11, (SubLObject)classes_utilities.$list12, (SubLObject)classes_utilities.$list13, (SubLObject)ConsesLow.list((SubLObject)classes_utilities.$sym14$RET, (SubLObject)ConsesLow.listS((SubLObject)classes_utilities.$sym15$FUNCALL, (SubLObject)classes_utilities.$list16, (SubLObject)classes_utilities.$sym17$CLASS, arg_list)))), (SubLObject)classes_utilities.$list18));
                function_defs = (SubLObject)ConsesLow.cons(function_def, function_defs);
                arg_list = Sequences.nreverse((SubLObject)ConsesLow.cons(Packages.intern(PrintLow.format((SubLObject)classes_utilities.NIL, (SubLObject)classes_utilities.$str19$ARG_S, i), (SubLObject)classes_utilities.UNPROVIDED), Sequences.nreverse(arg_list)));
            }
            return reader.bq_cons((SubLObject)classes_utilities.$sym20$PROGN, Sequences.nreverse(function_defs));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)classes_utilities.$list3);
        return (SubLObject)classes_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/classes-utilities.lisp", position = 2855L)
    public static SubLObject define_class_super_method_funcallers(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject name_template = (SubLObject)classes_utilities.NIL;
        SubLObject max_args = (SubLObject)classes_utilities.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)classes_utilities.$list3);
        name_template = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)classes_utilities.$list3);
        max_args = current.first();
        current = current.rest();
        if (classes_utilities.NIL == current) {
            SubLObject function_defs = (SubLObject)classes_utilities.NIL;
            SubLObject arg_list = (SubLObject)classes_utilities.NIL;
            SubLObject function_name = (SubLObject)classes_utilities.NIL;
            SubLObject function_def = (SubLObject)classes_utilities.NIL;
            SubLObject cdotimes_end_var;
            SubLObject i;
            for (cdotimes_end_var = Numbers.add(max_args, (SubLObject)classes_utilities.ONE_INTEGER), i = (SubLObject)classes_utilities.NIL, i = (SubLObject)classes_utilities.ZERO_INTEGER; i.numL(cdotimes_end_var); i = Numbers.add(i, (SubLObject)classes_utilities.ONE_INTEGER)) {
                function_name = Packages.intern(PrintLow.format((SubLObject)classes_utilities.NIL, name_template, i), (SubLObject)classes_utilities.UNPROVIDED);
                function_def = conses_high.copy_tree((SubLObject)ConsesLow.listS((SubLObject)classes_utilities.$sym4$DEFINE_PUBLIC, function_name, (SubLObject)ConsesLow.listS((SubLObject)classes_utilities.$sym5$CLASS_NAME_OR_CLASS, (SubLObject)classes_utilities.$sym6$METHOD_NAME, arg_list), (SubLObject)ConsesLow.list((SubLObject)classes_utilities.$sym7$CLET, (SubLObject)classes_utilities.$list8, (SubLObject)classes_utilities.$list21, (SubLObject)classes_utilities.$list22, (SubLObject)ConsesLow.list((SubLObject)classes_utilities.$sym7$CLET, (SubLObject)classes_utilities.$list23, (SubLObject)classes_utilities.$list24, (SubLObject)classes_utilities.$list13, (SubLObject)ConsesLow.list((SubLObject)classes_utilities.$sym14$RET, (SubLObject)ConsesLow.listS((SubLObject)classes_utilities.$sym15$FUNCALL, (SubLObject)classes_utilities.$list16, (SubLObject)classes_utilities.$sym17$CLASS, arg_list)))), (SubLObject)classes_utilities.$list18));
                function_defs = (SubLObject)ConsesLow.cons(function_def, function_defs);
                arg_list = Sequences.nreverse((SubLObject)ConsesLow.cons(Packages.intern(PrintLow.format((SubLObject)classes_utilities.NIL, (SubLObject)classes_utilities.$str19$ARG_S, i), (SubLObject)classes_utilities.UNPROVIDED), Sequences.nreverse(arg_list)));
            }
            return reader.bq_cons((SubLObject)classes_utilities.$sym20$PROGN, Sequences.nreverse(function_defs));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)classes_utilities.$list3);
        return (SubLObject)classes_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/classes-utilities.lisp", position = 4379L)
    public static SubLObject define_instance_method_funcallers(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject name_template = (SubLObject)classes_utilities.NIL;
        SubLObject class_name_template = (SubLObject)classes_utilities.NIL;
        SubLObject max_args = (SubLObject)classes_utilities.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)classes_utilities.$list25);
        name_template = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)classes_utilities.$list25);
        class_name_template = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)classes_utilities.$list25);
        max_args = current.first();
        current = current.rest();
        if (classes_utilities.NIL == current) {
            SubLObject function_defs = (SubLObject)classes_utilities.NIL;
            SubLObject arg_list = (SubLObject)classes_utilities.NIL;
            SubLObject function_name = (SubLObject)classes_utilities.NIL;
            SubLObject class_function_name = (SubLObject)classes_utilities.NIL;
            SubLObject function_def = (SubLObject)classes_utilities.NIL;
            SubLObject cdotimes_end_var;
            SubLObject i;
            for (cdotimes_end_var = Numbers.add(max_args, (SubLObject)classes_utilities.ONE_INTEGER), i = (SubLObject)classes_utilities.NIL, i = (SubLObject)classes_utilities.ZERO_INTEGER; i.numL(cdotimes_end_var); i = Numbers.add(i, (SubLObject)classes_utilities.ONE_INTEGER)) {
                function_name = Packages.intern(PrintLow.format((SubLObject)classes_utilities.NIL, name_template, i), (SubLObject)classes_utilities.UNPROVIDED);
                class_function_name = Packages.intern(PrintLow.format((SubLObject)classes_utilities.NIL, class_name_template, i), (SubLObject)classes_utilities.UNPROVIDED);
                function_def = conses_high.copy_tree((SubLObject)ConsesLow.list((SubLObject)classes_utilities.$sym4$DEFINE_PUBLIC, function_name, (SubLObject)ConsesLow.listS((SubLObject)classes_utilities.$sym26$INSTANCE, (SubLObject)classes_utilities.$sym6$METHOD_NAME, arg_list), (SubLObject)classes_utilities.$list27, (SubLObject)ConsesLow.list((SubLObject)classes_utilities.$sym7$CLET, (SubLObject)classes_utilities.$list28, (SubLObject)ConsesLow.list((SubLObject)classes_utilities.$sym29$PIF, (SubLObject)classes_utilities.$sym30$METHOD, (SubLObject)ConsesLow.list((SubLObject)classes_utilities.$sym20$PROGN, (SubLObject)classes_utilities.$list13, (SubLObject)ConsesLow.list((SubLObject)classes_utilities.$sym14$RET, (SubLObject)ConsesLow.listS((SubLObject)classes_utilities.$sym15$FUNCALL, (SubLObject)classes_utilities.$list16, (SubLObject)classes_utilities.$sym26$INSTANCE, arg_list))), (SubLObject)ConsesLow.list((SubLObject)classes_utilities.$sym14$RET, (SubLObject)ConsesLow.listS(class_function_name, (SubLObject)classes_utilities.$sym17$CLASS, (SubLObject)classes_utilities.$sym6$METHOD_NAME, arg_list))))));
                function_defs = (SubLObject)ConsesLow.cons(function_def, function_defs);
                arg_list = Sequences.nreverse((SubLObject)ConsesLow.cons(Packages.intern(PrintLow.format((SubLObject)classes_utilities.NIL, (SubLObject)classes_utilities.$str19$ARG_S, i), (SubLObject)classes_utilities.UNPROVIDED), Sequences.nreverse(arg_list)));
            }
            return reader.bq_cons((SubLObject)classes_utilities.$sym20$PROGN, Sequences.nreverse(function_defs));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)classes_utilities.$list25);
        return (SubLObject)classes_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/classes-utilities.lisp", position = 5648L)
    public static SubLObject define_instance_super_method_funcallers(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject name_template = (SubLObject)classes_utilities.NIL;
        SubLObject class_name_template = (SubLObject)classes_utilities.NIL;
        SubLObject max_args = (SubLObject)classes_utilities.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)classes_utilities.$list25);
        name_template = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)classes_utilities.$list25);
        class_name_template = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)classes_utilities.$list25);
        max_args = current.first();
        current = current.rest();
        if (classes_utilities.NIL == current) {
            SubLObject function_defs = (SubLObject)classes_utilities.NIL;
            SubLObject arg_list = (SubLObject)classes_utilities.NIL;
            SubLObject function_name = (SubLObject)classes_utilities.NIL;
            SubLObject class_function_name = (SubLObject)classes_utilities.NIL;
            SubLObject function_def = (SubLObject)classes_utilities.NIL;
            SubLObject cdotimes_end_var;
            SubLObject i;
            for (cdotimes_end_var = Numbers.add(max_args, (SubLObject)classes_utilities.ONE_INTEGER), i = (SubLObject)classes_utilities.NIL, i = (SubLObject)classes_utilities.ZERO_INTEGER; i.numL(cdotimes_end_var); i = Numbers.add(i, (SubLObject)classes_utilities.ONE_INTEGER)) {
                function_name = Packages.intern(PrintLow.format((SubLObject)classes_utilities.NIL, name_template, i), (SubLObject)classes_utilities.UNPROVIDED);
                class_function_name = Packages.intern(PrintLow.format((SubLObject)classes_utilities.NIL, class_name_template, i), (SubLObject)classes_utilities.UNPROVIDED);
                function_def = conses_high.copy_tree((SubLObject)ConsesLow.list((SubLObject)classes_utilities.$sym4$DEFINE_PUBLIC, function_name, (SubLObject)ConsesLow.listS((SubLObject)classes_utilities.$sym26$INSTANCE, (SubLObject)classes_utilities.$sym6$METHOD_NAME, arg_list), (SubLObject)classes_utilities.$list27, (SubLObject)ConsesLow.list((SubLObject)classes_utilities.$sym7$CLET, (SubLObject)classes_utilities.$list31, (SubLObject)ConsesLow.list((SubLObject)classes_utilities.$sym29$PIF, (SubLObject)classes_utilities.$sym30$METHOD, (SubLObject)ConsesLow.list((SubLObject)classes_utilities.$sym20$PROGN, (SubLObject)classes_utilities.$list13, (SubLObject)ConsesLow.list((SubLObject)classes_utilities.$sym14$RET, (SubLObject)ConsesLow.listS((SubLObject)classes_utilities.$sym15$FUNCALL, (SubLObject)classes_utilities.$list16, (SubLObject)classes_utilities.$sym26$INSTANCE, arg_list))), (SubLObject)ConsesLow.list((SubLObject)classes_utilities.$sym14$RET, (SubLObject)ConsesLow.listS(class_function_name, (SubLObject)classes_utilities.$sym17$CLASS, (SubLObject)classes_utilities.$sym6$METHOD_NAME, arg_list))))));
                function_defs = (SubLObject)ConsesLow.cons(function_def, function_defs);
                arg_list = Sequences.nreverse((SubLObject)ConsesLow.cons(Packages.intern(PrintLow.format((SubLObject)classes_utilities.NIL, (SubLObject)classes_utilities.$str19$ARG_S, i), (SubLObject)classes_utilities.UNPROVIDED), Sequences.nreverse(arg_list)));
            }
            return reader.bq_cons((SubLObject)classes_utilities.$sym20$PROGN, Sequences.nreverse(function_defs));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)classes_utilities.$list25);
        return (SubLObject)classes_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/classes-utilities.lisp", position = 6953L)
    public static SubLObject define_class_or_instance_method_funcallers(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject name_template = (SubLObject)classes_utilities.NIL;
        SubLObject max_args = (SubLObject)classes_utilities.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)classes_utilities.$list3);
        name_template = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)classes_utilities.$list3);
        max_args = current.first();
        current = current.rest();
        if (classes_utilities.NIL == current) {
            SubLObject function_defs = (SubLObject)classes_utilities.NIL;
            SubLObject arg_list = (SubLObject)classes_utilities.NIL;
            SubLObject function_name = (SubLObject)classes_utilities.NIL;
            SubLObject function_def = (SubLObject)classes_utilities.NIL;
            SubLObject cdotimes_end_var;
            SubLObject i;
            for (cdotimes_end_var = Numbers.add(max_args, (SubLObject)classes_utilities.ONE_INTEGER), i = (SubLObject)classes_utilities.NIL, i = (SubLObject)classes_utilities.ZERO_INTEGER; i.numL(cdotimes_end_var); i = Numbers.add(i, (SubLObject)classes_utilities.ONE_INTEGER)) {
                function_name = Packages.intern(PrintLow.format((SubLObject)classes_utilities.NIL, name_template, i), (SubLObject)classes_utilities.UNPROVIDED);
                function_def = conses_high.copy_tree((SubLObject)ConsesLow.list((SubLObject)classes_utilities.$sym4$DEFINE_PUBLIC, function_name, (SubLObject)ConsesLow.listS((SubLObject)classes_utilities.$sym32$CLASS_OR_INSTANCE, (SubLObject)classes_utilities.$sym6$METHOD_NAME, arg_list), (SubLObject)classes_utilities.$list33, (SubLObject)ConsesLow.list((SubLObject)classes_utilities.$sym29$PIF, (SubLObject)classes_utilities.$list34, (SubLObject)ConsesLow.list((SubLObject)classes_utilities.$sym7$CLET, (SubLObject)classes_utilities.$list35, (SubLObject)ConsesLow.listS((SubLObject)classes_utilities.$sym29$PIF, (SubLObject)classes_utilities.$sym30$METHOD, (SubLObject)ConsesLow.list((SubLObject)classes_utilities.$sym20$PROGN, (SubLObject)classes_utilities.$list13, (SubLObject)ConsesLow.list((SubLObject)classes_utilities.$sym14$RET, (SubLObject)ConsesLow.listS((SubLObject)classes_utilities.$sym15$FUNCALL, (SubLObject)classes_utilities.$list16, (SubLObject)classes_utilities.$sym32$CLASS_OR_INSTANCE, arg_list))), (SubLObject)classes_utilities.$list36)), (SubLObject)ConsesLow.list((SubLObject)classes_utilities.$sym7$CLET, (SubLObject)classes_utilities.$list37, (SubLObject)classes_utilities.$list38, (SubLObject)classes_utilities.$list12, (SubLObject)classes_utilities.$list13, (SubLObject)ConsesLow.list((SubLObject)classes_utilities.$sym14$RET, (SubLObject)ConsesLow.listS((SubLObject)classes_utilities.$sym15$FUNCALL, (SubLObject)classes_utilities.$list16, (SubLObject)classes_utilities.$sym17$CLASS, arg_list))))));
                function_defs = (SubLObject)ConsesLow.cons(function_def, function_defs);
                arg_list = Sequences.nreverse((SubLObject)ConsesLow.cons(Packages.intern(PrintLow.format((SubLObject)classes_utilities.NIL, (SubLObject)classes_utilities.$str19$ARG_S, i), (SubLObject)classes_utilities.UNPROVIDED), Sequences.nreverse(arg_list)));
            }
            return reader.bq_cons((SubLObject)classes_utilities.$sym20$PROGN, Sequences.nreverse(function_defs));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)classes_utilities.$list3);
        return (SubLObject)classes_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/classes-utilities.lisp", position = 8892L)
    public static SubLObject funcall_class_method(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject v_class = (SubLObject)classes_utilities.NIL;
        SubLObject method_name = (SubLObject)classes_utilities.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)classes_utilities.$list39);
        v_class = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)classes_utilities.$list39);
        method_name = current.first();
        final SubLObject args;
        current = (args = current.rest());
        final SubLObject pcase_var;
        final SubLObject arg_count = pcase_var = Sequences.length(args);
        if (pcase_var.eql((SubLObject)classes_utilities.ZERO_INTEGER)) {
            return (SubLObject)ConsesLow.list((SubLObject)classes_utilities.$sym40$FUNCALL_CLASS_METHOD_WITH_0_ARGS, v_class, method_name);
        }
        if (pcase_var.eql((SubLObject)classes_utilities.ONE_INTEGER)) {
            return (SubLObject)ConsesLow.listS((SubLObject)classes_utilities.$sym41$FUNCALL_CLASS_METHOD_WITH_1_ARGS, v_class, method_name, args);
        }
        if (pcase_var.eql((SubLObject)classes_utilities.TWO_INTEGER)) {
            return (SubLObject)ConsesLow.listS((SubLObject)classes_utilities.$sym42$FUNCALL_CLASS_METHOD_WITH_2_ARGS, v_class, method_name, args);
        }
        if (pcase_var.eql((SubLObject)classes_utilities.THREE_INTEGER)) {
            return (SubLObject)ConsesLow.listS((SubLObject)classes_utilities.$sym43$FUNCALL_CLASS_METHOD_WITH_3_ARGS, v_class, method_name, args);
        }
        if (pcase_var.eql((SubLObject)classes_utilities.FOUR_INTEGER)) {
            return (SubLObject)ConsesLow.listS((SubLObject)classes_utilities.$sym44$FUNCALL_CLASS_METHOD_WITH_4_ARGS, v_class, method_name, args);
        }
        if (pcase_var.eql((SubLObject)classes_utilities.FIVE_INTEGER)) {
            return (SubLObject)ConsesLow.listS((SubLObject)classes_utilities.$sym45$FUNCALL_CLASS_METHOD_WITH_5_ARGS, v_class, method_name, args);
        }
        if (pcase_var.eql((SubLObject)classes_utilities.SIX_INTEGER)) {
            return (SubLObject)ConsesLow.listS((SubLObject)classes_utilities.$sym46$FUNCALL_CLASS_METHOD_WITH_6_ARGS, v_class, method_name, args);
        }
        if (pcase_var.eql((SubLObject)classes_utilities.SEVEN_INTEGER)) {
            return (SubLObject)ConsesLow.listS((SubLObject)classes_utilities.$sym47$FUNCALL_CLASS_METHOD_WITH_7_ARGS, v_class, method_name, args);
        }
        if (pcase_var.eql((SubLObject)classes_utilities.EIGHT_INTEGER)) {
            return (SubLObject)ConsesLow.listS((SubLObject)classes_utilities.$sym48$FUNCALL_CLASS_METHOD_WITH_8_ARGS, v_class, method_name, args);
        }
        if (pcase_var.eql((SubLObject)classes_utilities.NINE_INTEGER)) {
            return (SubLObject)ConsesLow.listS((SubLObject)classes_utilities.$sym49$FUNCALL_CLASS_METHOD_WITH_9_ARGS, v_class, method_name, args);
        }
        if (pcase_var.eql((SubLObject)classes_utilities.TEN_INTEGER)) {
            return (SubLObject)ConsesLow.listS((SubLObject)classes_utilities.$sym50$FUNCALL_CLASS_METHOD_WITH_10_ARGS, v_class, method_name, args);
        }
        if (pcase_var.eql((SubLObject)classes_utilities.ELEVEN_INTEGER)) {
            return (SubLObject)ConsesLow.listS((SubLObject)classes_utilities.$sym51$FUNCALL_CLASS_METHOD_WITH_11_ARGS, v_class, method_name, args);
        }
        if (pcase_var.eql((SubLObject)classes_utilities.TWELVE_INTEGER)) {
            return (SubLObject)ConsesLow.listS((SubLObject)classes_utilities.$sym52$FUNCALL_CLASS_METHOD_WITH_12_ARGS, v_class, method_name, args);
        }
        if (pcase_var.eql((SubLObject)classes_utilities.THIRTEEN_INTEGER)) {
            return (SubLObject)ConsesLow.listS((SubLObject)classes_utilities.$sym53$FUNCALL_CLASS_METHOD_WITH_13_ARGS, v_class, method_name, args);
        }
        if (pcase_var.eql((SubLObject)classes_utilities.FOURTEEN_INTEGER)) {
            return (SubLObject)ConsesLow.listS((SubLObject)classes_utilities.$sym54$FUNCALL_CLASS_METHOD_WITH_14_ARGS, v_class, method_name, args);
        }
        if (pcase_var.eql((SubLObject)classes_utilities.FIFTEEN_INTEGER)) {
            return (SubLObject)ConsesLow.listS((SubLObject)classes_utilities.$sym55$FUNCALL_CLASS_METHOD_WITH_15_ARGS, v_class, method_name, args);
        }
        if (pcase_var.eql((SubLObject)classes_utilities.SIXTEEN_INTEGER)) {
            return (SubLObject)ConsesLow.listS((SubLObject)classes_utilities.$sym56$FUNCALL_CLASS_METHOD_WITH_16_ARGS, v_class, method_name, args);
        }
        if (pcase_var.eql((SubLObject)classes_utilities.SEVENTEEN_INTEGER)) {
            return (SubLObject)ConsesLow.listS((SubLObject)classes_utilities.$sym57$FUNCALL_CLASS_METHOD_WITH_17_ARGS, v_class, method_name, args);
        }
        if (pcase_var.eql((SubLObject)classes_utilities.EIGHTEEN_INTEGER)) {
            return (SubLObject)ConsesLow.listS((SubLObject)classes_utilities.$sym58$FUNCALL_CLASS_METHOD_WITH_18_ARGS, v_class, method_name, args);
        }
        if (pcase_var.eql((SubLObject)classes_utilities.NINETEEN_INTEGER)) {
            return (SubLObject)ConsesLow.listS((SubLObject)classes_utilities.$sym59$FUNCALL_CLASS_METHOD_WITH_19_ARGS, v_class, method_name, args);
        }
        if (pcase_var.eql((SubLObject)classes_utilities.TWENTY_INTEGER)) {
            return (SubLObject)ConsesLow.listS((SubLObject)classes_utilities.$sym60$FUNCALL_CLASS_METHOD_WITH_20_ARGS, v_class, method_name, args);
        }
        return (SubLObject)classes_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/classes-utilities.lisp", position = 10737L)
    public static SubLObject fcm(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject v_class = (SubLObject)classes_utilities.NIL;
        SubLObject method_name = (SubLObject)classes_utilities.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)classes_utilities.$list39);
        v_class = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)classes_utilities.$list39);
        method_name = current.first();
        final SubLObject args;
        current = (args = current.rest());
        return (SubLObject)ConsesLow.listS((SubLObject)classes_utilities.$sym61$FUNCALL_CLASS_METHOD, v_class, method_name, args);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/classes-utilities.lisp", position = 10991L)
    public static SubLObject funcall_class_super_method(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject v_class = (SubLObject)classes_utilities.NIL;
        SubLObject method_name = (SubLObject)classes_utilities.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)classes_utilities.$list39);
        v_class = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)classes_utilities.$list39);
        method_name = current.first();
        final SubLObject args;
        current = (args = current.rest());
        final SubLObject pcase_var;
        final SubLObject arg_count = pcase_var = Sequences.length(args);
        if (pcase_var.eql((SubLObject)classes_utilities.ZERO_INTEGER)) {
            return (SubLObject)ConsesLow.list((SubLObject)classes_utilities.$sym62$FUNCALL_CLASS_SUPER_METHOD_WITH_0_ARGS, v_class, method_name);
        }
        if (pcase_var.eql((SubLObject)classes_utilities.ONE_INTEGER)) {
            return (SubLObject)ConsesLow.listS((SubLObject)classes_utilities.$sym63$FUNCALL_CLASS_SUPER_METHOD_WITH_1_ARGS, v_class, method_name, args);
        }
        if (pcase_var.eql((SubLObject)classes_utilities.TWO_INTEGER)) {
            return (SubLObject)ConsesLow.listS((SubLObject)classes_utilities.$sym64$FUNCALL_CLASS_SUPER_METHOD_WITH_2_ARGS, v_class, method_name, args);
        }
        if (pcase_var.eql((SubLObject)classes_utilities.THREE_INTEGER)) {
            return (SubLObject)ConsesLow.listS((SubLObject)classes_utilities.$sym65$FUNCALL_CLASS_SUPER_METHOD_WITH_3_ARGS, v_class, method_name, args);
        }
        if (pcase_var.eql((SubLObject)classes_utilities.FOUR_INTEGER)) {
            return (SubLObject)ConsesLow.listS((SubLObject)classes_utilities.$sym66$FUNCALL_CLASS_SUPER_METHOD_WITH_4_ARGS, v_class, method_name, args);
        }
        if (pcase_var.eql((SubLObject)classes_utilities.FIVE_INTEGER)) {
            return (SubLObject)ConsesLow.listS((SubLObject)classes_utilities.$sym67$FUNCALL_CLASS_SUPER_METHOD_WITH_5_ARGS, v_class, method_name, args);
        }
        if (pcase_var.eql((SubLObject)classes_utilities.SIX_INTEGER)) {
            return (SubLObject)ConsesLow.listS((SubLObject)classes_utilities.$sym68$FUNCALL_CLASS_SUPER_METHOD_WITH_6_ARGS, v_class, method_name, args);
        }
        if (pcase_var.eql((SubLObject)classes_utilities.SEVEN_INTEGER)) {
            return (SubLObject)ConsesLow.listS((SubLObject)classes_utilities.$sym69$FUNCALL_CLASS_SUPER_METHOD_WITH_7_ARGS, v_class, method_name, args);
        }
        if (pcase_var.eql((SubLObject)classes_utilities.EIGHT_INTEGER)) {
            return (SubLObject)ConsesLow.listS((SubLObject)classes_utilities.$sym70$FUNCALL_CLASS_SUPER_METHOD_WITH_8_ARGS, v_class, method_name, args);
        }
        if (pcase_var.eql((SubLObject)classes_utilities.NINE_INTEGER)) {
            return (SubLObject)ConsesLow.listS((SubLObject)classes_utilities.$sym71$FUNCALL_CLASS_SUPER_METHOD_WITH_9_ARGS, v_class, method_name, args);
        }
        if (pcase_var.eql((SubLObject)classes_utilities.TEN_INTEGER)) {
            return (SubLObject)ConsesLow.listS((SubLObject)classes_utilities.$sym72$FUNCALL_CLASS_SUPER_METHOD_WITH_10_ARGS, v_class, method_name, args);
        }
        if (pcase_var.eql((SubLObject)classes_utilities.ELEVEN_INTEGER)) {
            return (SubLObject)ConsesLow.listS((SubLObject)classes_utilities.$sym73$FUNCALL_CLASS_SUPER_METHOD_WITH_11_ARGS, v_class, method_name, args);
        }
        if (pcase_var.eql((SubLObject)classes_utilities.TWELVE_INTEGER)) {
            return (SubLObject)ConsesLow.listS((SubLObject)classes_utilities.$sym74$FUNCALL_CLASS_SUPER_METHOD_WITH_12_ARGS, v_class, method_name, args);
        }
        if (pcase_var.eql((SubLObject)classes_utilities.THIRTEEN_INTEGER)) {
            return (SubLObject)ConsesLow.listS((SubLObject)classes_utilities.$sym75$FUNCALL_CLASS_SUPER_METHOD_WITH_13_ARGS, v_class, method_name, args);
        }
        if (pcase_var.eql((SubLObject)classes_utilities.FOURTEEN_INTEGER)) {
            return (SubLObject)ConsesLow.listS((SubLObject)classes_utilities.$sym76$FUNCALL_CLASS_SUPER_METHOD_WITH_14_ARGS, v_class, method_name, args);
        }
        if (pcase_var.eql((SubLObject)classes_utilities.FIFTEEN_INTEGER)) {
            return (SubLObject)ConsesLow.listS((SubLObject)classes_utilities.$sym77$FUNCALL_CLASS_SUPER_METHOD_WITH_15_ARGS, v_class, method_name, args);
        }
        if (pcase_var.eql((SubLObject)classes_utilities.SIXTEEN_INTEGER)) {
            return (SubLObject)ConsesLow.listS((SubLObject)classes_utilities.$sym78$FUNCALL_CLASS_SUPER_METHOD_WITH_16_ARGS, v_class, method_name, args);
        }
        if (pcase_var.eql((SubLObject)classes_utilities.SEVENTEEN_INTEGER)) {
            return (SubLObject)ConsesLow.listS((SubLObject)classes_utilities.$sym79$FUNCALL_CLASS_SUPER_METHOD_WITH_17_ARGS, v_class, method_name, args);
        }
        if (pcase_var.eql((SubLObject)classes_utilities.EIGHTEEN_INTEGER)) {
            return (SubLObject)ConsesLow.listS((SubLObject)classes_utilities.$sym80$FUNCALL_CLASS_SUPER_METHOD_WITH_18_ARGS, v_class, method_name, args);
        }
        if (pcase_var.eql((SubLObject)classes_utilities.NINETEEN_INTEGER)) {
            return (SubLObject)ConsesLow.listS((SubLObject)classes_utilities.$sym81$FUNCALL_CLASS_SUPER_METHOD_WITH_19_ARGS, v_class, method_name, args);
        }
        if (pcase_var.eql((SubLObject)classes_utilities.TWENTY_INTEGER)) {
            return (SubLObject)ConsesLow.listS((SubLObject)classes_utilities.$sym82$FUNCALL_CLASS_SUPER_METHOD_WITH_20_ARGS, v_class, method_name, args);
        }
        return (SubLObject)classes_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/classes-utilities.lisp", position = 12968L)
    public static SubLObject fcsm(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject v_class = (SubLObject)classes_utilities.NIL;
        SubLObject method_name = (SubLObject)classes_utilities.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)classes_utilities.$list39);
        v_class = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)classes_utilities.$list39);
        method_name = current.first();
        final SubLObject args;
        current = (args = current.rest());
        return (SubLObject)ConsesLow.listS((SubLObject)classes_utilities.$sym83$FUNCALL_CLASS_SUPER_METHOD, v_class, method_name, args);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/classes-utilities.lisp", position = 13229L)
    public static SubLObject funcall_instance_method(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject instance = (SubLObject)classes_utilities.NIL;
        SubLObject method_name = (SubLObject)classes_utilities.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)classes_utilities.$list84);
        instance = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)classes_utilities.$list84);
        method_name = current.first();
        final SubLObject args;
        current = (args = current.rest());
        final SubLObject pcase_var;
        final SubLObject arg_count = pcase_var = Sequences.length(args);
        if (pcase_var.eql((SubLObject)classes_utilities.ZERO_INTEGER)) {
            return (SubLObject)ConsesLow.list((SubLObject)classes_utilities.$sym85$FUNCALL_INSTANCE_METHOD_WITH_0_ARGS, instance, method_name);
        }
        if (pcase_var.eql((SubLObject)classes_utilities.ONE_INTEGER)) {
            return (SubLObject)ConsesLow.listS((SubLObject)classes_utilities.$sym86$FUNCALL_INSTANCE_METHOD_WITH_1_ARGS, instance, method_name, args);
        }
        if (pcase_var.eql((SubLObject)classes_utilities.TWO_INTEGER)) {
            return (SubLObject)ConsesLow.listS((SubLObject)classes_utilities.$sym87$FUNCALL_INSTANCE_METHOD_WITH_2_ARGS, instance, method_name, args);
        }
        if (pcase_var.eql((SubLObject)classes_utilities.THREE_INTEGER)) {
            return (SubLObject)ConsesLow.listS((SubLObject)classes_utilities.$sym88$FUNCALL_INSTANCE_METHOD_WITH_3_ARGS, instance, method_name, args);
        }
        if (pcase_var.eql((SubLObject)classes_utilities.FOUR_INTEGER)) {
            return (SubLObject)ConsesLow.listS((SubLObject)classes_utilities.$sym89$FUNCALL_INSTANCE_METHOD_WITH_4_ARGS, instance, method_name, args);
        }
        if (pcase_var.eql((SubLObject)classes_utilities.FIVE_INTEGER)) {
            return (SubLObject)ConsesLow.listS((SubLObject)classes_utilities.$sym90$FUNCALL_INSTANCE_METHOD_WITH_5_ARGS, instance, method_name, args);
        }
        if (pcase_var.eql((SubLObject)classes_utilities.SIX_INTEGER)) {
            return (SubLObject)ConsesLow.listS((SubLObject)classes_utilities.$sym91$FUNCALL_INSTANCE_METHOD_WITH_6_ARGS, instance, method_name, args);
        }
        if (pcase_var.eql((SubLObject)classes_utilities.SEVEN_INTEGER)) {
            return (SubLObject)ConsesLow.listS((SubLObject)classes_utilities.$sym92$FUNCALL_INSTANCE_METHOD_WITH_7_ARGS, instance, method_name, args);
        }
        if (pcase_var.eql((SubLObject)classes_utilities.EIGHT_INTEGER)) {
            return (SubLObject)ConsesLow.listS((SubLObject)classes_utilities.$sym93$FUNCALL_INSTANCE_METHOD_WITH_8_ARGS, instance, method_name, args);
        }
        if (pcase_var.eql((SubLObject)classes_utilities.NINE_INTEGER)) {
            return (SubLObject)ConsesLow.listS((SubLObject)classes_utilities.$sym94$FUNCALL_INSTANCE_METHOD_WITH_9_ARGS, instance, method_name, args);
        }
        if (pcase_var.eql((SubLObject)classes_utilities.TEN_INTEGER)) {
            return (SubLObject)ConsesLow.listS((SubLObject)classes_utilities.$sym95$FUNCALL_INSTANCE_METHOD_WITH_10_ARGS, instance, method_name, args);
        }
        if (pcase_var.eql((SubLObject)classes_utilities.ELEVEN_INTEGER)) {
            return (SubLObject)ConsesLow.listS((SubLObject)classes_utilities.$sym96$FUNCALL_INSTANCE_METHOD_WITH_11_ARGS, instance, method_name, args);
        }
        if (pcase_var.eql((SubLObject)classes_utilities.TWELVE_INTEGER)) {
            return (SubLObject)ConsesLow.listS((SubLObject)classes_utilities.$sym97$FUNCALL_INSTANCE_METHOD_WITH_12_ARGS, instance, method_name, args);
        }
        if (pcase_var.eql((SubLObject)classes_utilities.THIRTEEN_INTEGER)) {
            return (SubLObject)ConsesLow.listS((SubLObject)classes_utilities.$sym98$FUNCALL_INSTANCE_METHOD_WITH_13_ARGS, instance, method_name, args);
        }
        if (pcase_var.eql((SubLObject)classes_utilities.FOURTEEN_INTEGER)) {
            return (SubLObject)ConsesLow.listS((SubLObject)classes_utilities.$sym99$FUNCALL_INSTANCE_METHOD_WITH_14_ARGS, instance, method_name, args);
        }
        if (pcase_var.eql((SubLObject)classes_utilities.FIFTEEN_INTEGER)) {
            return (SubLObject)ConsesLow.listS((SubLObject)classes_utilities.$sym100$FUNCALL_INSTANCE_METHOD_WITH_15_ARGS, instance, method_name, args);
        }
        if (pcase_var.eql((SubLObject)classes_utilities.SIXTEEN_INTEGER)) {
            return (SubLObject)ConsesLow.listS((SubLObject)classes_utilities.$sym101$FUNCALL_INSTANCE_METHOD_WITH_16_ARGS, instance, method_name, args);
        }
        if (pcase_var.eql((SubLObject)classes_utilities.SEVENTEEN_INTEGER)) {
            return (SubLObject)ConsesLow.listS((SubLObject)classes_utilities.$sym102$FUNCALL_INSTANCE_METHOD_WITH_17_ARGS, instance, method_name, args);
        }
        if (pcase_var.eql((SubLObject)classes_utilities.EIGHTEEN_INTEGER)) {
            return (SubLObject)ConsesLow.listS((SubLObject)classes_utilities.$sym103$FUNCALL_INSTANCE_METHOD_WITH_18_ARGS, instance, method_name, args);
        }
        if (pcase_var.eql((SubLObject)classes_utilities.NINETEEN_INTEGER)) {
            return (SubLObject)ConsesLow.listS((SubLObject)classes_utilities.$sym104$FUNCALL_INSTANCE_METHOD_WITH_19_ARGS, instance, method_name, args);
        }
        if (pcase_var.eql((SubLObject)classes_utilities.TWENTY_INTEGER)) {
            return (SubLObject)ConsesLow.listS((SubLObject)classes_utilities.$sym105$FUNCALL_INSTANCE_METHOD_WITH_20_ARGS, instance, method_name, args);
        }
        return (SubLObject)classes_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/classes-utilities.lisp", position = 15206L)
    public static SubLObject fim(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject v_class = (SubLObject)classes_utilities.NIL;
        SubLObject method_name = (SubLObject)classes_utilities.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)classes_utilities.$list39);
        v_class = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)classes_utilities.$list39);
        method_name = current.first();
        final SubLObject args;
        current = (args = current.rest());
        return (SubLObject)ConsesLow.listS((SubLObject)classes_utilities.$sym106$FUNCALL_INSTANCE_METHOD, v_class, method_name, args);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/classes-utilities.lisp", position = 15463L)
    public static SubLObject funcall_instance_super_method(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject instance = (SubLObject)classes_utilities.NIL;
        SubLObject method_name = (SubLObject)classes_utilities.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)classes_utilities.$list84);
        instance = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)classes_utilities.$list84);
        method_name = current.first();
        final SubLObject args;
        current = (args = current.rest());
        final SubLObject pcase_var;
        final SubLObject arg_count = pcase_var = Sequences.length(args);
        if (pcase_var.eql((SubLObject)classes_utilities.ZERO_INTEGER)) {
            return (SubLObject)ConsesLow.list((SubLObject)classes_utilities.$sym107$FUNCALL_INSTANCE_SUPER_METHOD_WITH_0_ARGS, instance, method_name);
        }
        if (pcase_var.eql((SubLObject)classes_utilities.ONE_INTEGER)) {
            return (SubLObject)ConsesLow.listS((SubLObject)classes_utilities.$sym108$FUNCALL_INSTANCE_SUPER_METHOD_WITH_1_ARGS, instance, method_name, args);
        }
        if (pcase_var.eql((SubLObject)classes_utilities.TWO_INTEGER)) {
            return (SubLObject)ConsesLow.listS((SubLObject)classes_utilities.$sym109$FUNCALL_INSTANCE_SUPER_METHOD_WITH_2_ARGS, instance, method_name, args);
        }
        if (pcase_var.eql((SubLObject)classes_utilities.THREE_INTEGER)) {
            return (SubLObject)ConsesLow.listS((SubLObject)classes_utilities.$sym110$FUNCALL_INSTANCE_SUPER_METHOD_WITH_3_ARGS, instance, method_name, args);
        }
        if (pcase_var.eql((SubLObject)classes_utilities.FOUR_INTEGER)) {
            return (SubLObject)ConsesLow.listS((SubLObject)classes_utilities.$sym111$FUNCALL_INSTANCE_SUPER_METHOD_WITH_4_ARGS, instance, method_name, args);
        }
        if (pcase_var.eql((SubLObject)classes_utilities.FIVE_INTEGER)) {
            return (SubLObject)ConsesLow.listS((SubLObject)classes_utilities.$sym112$FUNCALL_INSTANCE_SUPER_METHOD_WITH_5_ARGS, instance, method_name, args);
        }
        if (pcase_var.eql((SubLObject)classes_utilities.SIX_INTEGER)) {
            return (SubLObject)ConsesLow.listS((SubLObject)classes_utilities.$sym113$FUNCALL_INSTANCE_SUPER_METHOD_WITH_6_ARGS, instance, method_name, args);
        }
        if (pcase_var.eql((SubLObject)classes_utilities.SEVEN_INTEGER)) {
            return (SubLObject)ConsesLow.listS((SubLObject)classes_utilities.$sym114$FUNCALL_INSTANCE_SUPER_METHOD_WITH_7_ARGS, instance, method_name, args);
        }
        if (pcase_var.eql((SubLObject)classes_utilities.EIGHT_INTEGER)) {
            return (SubLObject)ConsesLow.listS((SubLObject)classes_utilities.$sym115$FUNCALL_INSTANCE_SUPER_METHOD_WITH_8_ARGS, instance, method_name, args);
        }
        if (pcase_var.eql((SubLObject)classes_utilities.NINE_INTEGER)) {
            return (SubLObject)ConsesLow.listS((SubLObject)classes_utilities.$sym116$FUNCALL_INSTANCE_SUPER_METHOD_WITH_9_ARGS, instance, method_name, args);
        }
        if (pcase_var.eql((SubLObject)classes_utilities.TEN_INTEGER)) {
            return (SubLObject)ConsesLow.listS((SubLObject)classes_utilities.$sym117$FUNCALL_INSTANCE_SUPER_METHOD_WITH_10_ARGS, instance, method_name, args);
        }
        if (pcase_var.eql((SubLObject)classes_utilities.ELEVEN_INTEGER)) {
            return (SubLObject)ConsesLow.listS((SubLObject)classes_utilities.$sym118$FUNCALL_INSTANCE_SUPER_METHOD_WITH_11_ARGS, instance, method_name, args);
        }
        if (pcase_var.eql((SubLObject)classes_utilities.TWELVE_INTEGER)) {
            return (SubLObject)ConsesLow.listS((SubLObject)classes_utilities.$sym119$FUNCALL_INSTANCE_SUPER_METHOD_WITH_12_ARGS, instance, method_name, args);
        }
        if (pcase_var.eql((SubLObject)classes_utilities.THIRTEEN_INTEGER)) {
            return (SubLObject)ConsesLow.listS((SubLObject)classes_utilities.$sym120$FUNCALL_INSTANCE_SUPER_METHOD_WITH_13_ARGS, instance, method_name, args);
        }
        if (pcase_var.eql((SubLObject)classes_utilities.FOURTEEN_INTEGER)) {
            return (SubLObject)ConsesLow.listS((SubLObject)classes_utilities.$sym121$FUNCALL_INSTANCE_SUPER_METHOD_WITH_14_ARGS, instance, method_name, args);
        }
        if (pcase_var.eql((SubLObject)classes_utilities.FIFTEEN_INTEGER)) {
            return (SubLObject)ConsesLow.listS((SubLObject)classes_utilities.$sym122$FUNCALL_INSTANCE_SUPER_METHOD_WITH_15_ARGS, instance, method_name, args);
        }
        if (pcase_var.eql((SubLObject)classes_utilities.SIXTEEN_INTEGER)) {
            return (SubLObject)ConsesLow.listS((SubLObject)classes_utilities.$sym123$FUNCALL_INSTANCE_SUPER_METHOD_WITH_16_ARGS, instance, method_name, args);
        }
        if (pcase_var.eql((SubLObject)classes_utilities.SEVENTEEN_INTEGER)) {
            return (SubLObject)ConsesLow.listS((SubLObject)classes_utilities.$sym124$FUNCALL_INSTANCE_SUPER_METHOD_WITH_17_ARGS, instance, method_name, args);
        }
        if (pcase_var.eql((SubLObject)classes_utilities.EIGHTEEN_INTEGER)) {
            return (SubLObject)ConsesLow.listS((SubLObject)classes_utilities.$sym125$FUNCALL_INSTANCE_SUPER_METHOD_WITH_18_ARGS, instance, method_name, args);
        }
        if (pcase_var.eql((SubLObject)classes_utilities.NINETEEN_INTEGER)) {
            return (SubLObject)ConsesLow.listS((SubLObject)classes_utilities.$sym126$FUNCALL_INSTANCE_SUPER_METHOD_WITH_19_ARGS, instance, method_name, args);
        }
        if (pcase_var.eql((SubLObject)classes_utilities.TWENTY_INTEGER)) {
            return (SubLObject)ConsesLow.listS((SubLObject)classes_utilities.$sym127$FUNCALL_INSTANCE_SUPER_METHOD_WITH_20_ARGS, instance, method_name, args);
        }
        return (SubLObject)classes_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/classes-utilities.lisp", position = 17572L)
    public static SubLObject fism(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject v_class = (SubLObject)classes_utilities.NIL;
        SubLObject method_name = (SubLObject)classes_utilities.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)classes_utilities.$list39);
        v_class = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)classes_utilities.$list39);
        method_name = current.first();
        final SubLObject args;
        current = (args = current.rest());
        return (SubLObject)ConsesLow.listS((SubLObject)classes_utilities.$sym128$FUNCALL_INSTANCE_SUPER_METHOD, v_class, method_name, args);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/classes-utilities.lisp", position = 17836L)
    public static SubLObject funcall_class_or_instance_method(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject instance = (SubLObject)classes_utilities.NIL;
        SubLObject method_name = (SubLObject)classes_utilities.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)classes_utilities.$list84);
        instance = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)classes_utilities.$list84);
        method_name = current.first();
        final SubLObject args;
        current = (args = current.rest());
        final SubLObject pcase_var;
        final SubLObject arg_count = pcase_var = Sequences.length(args);
        if (pcase_var.eql((SubLObject)classes_utilities.ZERO_INTEGER)) {
            return (SubLObject)ConsesLow.list((SubLObject)classes_utilities.$sym129$FUNCALL_CLASS_OR_INSTANCE_METHOD_WITH_0_ARGS, instance, method_name);
        }
        if (pcase_var.eql((SubLObject)classes_utilities.ONE_INTEGER)) {
            return (SubLObject)ConsesLow.listS((SubLObject)classes_utilities.$sym130$FUNCALL_CLASS_OR_INSTANCE_METHOD_WITH_1_ARGS, instance, method_name, args);
        }
        if (pcase_var.eql((SubLObject)classes_utilities.TWO_INTEGER)) {
            return (SubLObject)ConsesLow.listS((SubLObject)classes_utilities.$sym131$FUNCALL_CLASS_OR_INSTANCE_METHOD_WITH_2_ARGS, instance, method_name, args);
        }
        if (pcase_var.eql((SubLObject)classes_utilities.THREE_INTEGER)) {
            return (SubLObject)ConsesLow.listS((SubLObject)classes_utilities.$sym132$FUNCALL_CLASS_OR_INSTANCE_METHOD_WITH_3_ARGS, instance, method_name, args);
        }
        if (pcase_var.eql((SubLObject)classes_utilities.FOUR_INTEGER)) {
            return (SubLObject)ConsesLow.listS((SubLObject)classes_utilities.$sym133$FUNCALL_CLASS_OR_INSTANCE_METHOD_WITH_4_ARGS, instance, method_name, args);
        }
        if (pcase_var.eql((SubLObject)classes_utilities.FIVE_INTEGER)) {
            return (SubLObject)ConsesLow.listS((SubLObject)classes_utilities.$sym134$FUNCALL_CLASS_OR_INSTANCE_METHOD_WITH_5_ARGS, instance, method_name, args);
        }
        if (pcase_var.eql((SubLObject)classes_utilities.SIX_INTEGER)) {
            return (SubLObject)ConsesLow.listS((SubLObject)classes_utilities.$sym135$FUNCALL_CLASS_OR_INSTANCE_METHOD_WITH_6_ARGS, instance, method_name, args);
        }
        if (pcase_var.eql((SubLObject)classes_utilities.SEVEN_INTEGER)) {
            return (SubLObject)ConsesLow.listS((SubLObject)classes_utilities.$sym136$FUNCALL_CLASS_OR_INSTANCE_METHOD_WITH_7_ARGS, instance, method_name, args);
        }
        if (pcase_var.eql((SubLObject)classes_utilities.EIGHT_INTEGER)) {
            return (SubLObject)ConsesLow.listS((SubLObject)classes_utilities.$sym137$FUNCALL_CLASS_OR_INSTANCE_METHOD_WITH_8_ARGS, instance, method_name, args);
        }
        if (pcase_var.eql((SubLObject)classes_utilities.NINE_INTEGER)) {
            return (SubLObject)ConsesLow.listS((SubLObject)classes_utilities.$sym138$FUNCALL_CLASS_OR_INSTANCE_METHOD_WITH_9_ARGS, instance, method_name, args);
        }
        if (pcase_var.eql((SubLObject)classes_utilities.TEN_INTEGER)) {
            return (SubLObject)ConsesLow.listS((SubLObject)classes_utilities.$sym139$FUNCALL_CLASS_OR_INSTANCE_METHOD_WITH_10_ARGS, instance, method_name, args);
        }
        if (pcase_var.eql((SubLObject)classes_utilities.ELEVEN_INTEGER)) {
            return (SubLObject)ConsesLow.listS((SubLObject)classes_utilities.$sym140$FUNCALL_CLASS_OR_INSTANCE_METHOD_WITH_11_ARGS, instance, method_name, args);
        }
        if (pcase_var.eql((SubLObject)classes_utilities.TWELVE_INTEGER)) {
            return (SubLObject)ConsesLow.listS((SubLObject)classes_utilities.$sym141$FUNCALL_CLASS_OR_INSTANCE_METHOD_WITH_12_ARGS, instance, method_name, args);
        }
        if (pcase_var.eql((SubLObject)classes_utilities.THIRTEEN_INTEGER)) {
            return (SubLObject)ConsesLow.listS((SubLObject)classes_utilities.$sym142$FUNCALL_CLASS_OR_INSTANCE_METHOD_WITH_13_ARGS, instance, method_name, args);
        }
        if (pcase_var.eql((SubLObject)classes_utilities.FOURTEEN_INTEGER)) {
            return (SubLObject)ConsesLow.listS((SubLObject)classes_utilities.$sym143$FUNCALL_CLASS_OR_INSTANCE_METHOD_WITH_14_ARGS, instance, method_name, args);
        }
        if (pcase_var.eql((SubLObject)classes_utilities.FIFTEEN_INTEGER)) {
            return (SubLObject)ConsesLow.listS((SubLObject)classes_utilities.$sym144$FUNCALL_CLASS_OR_INSTANCE_METHOD_WITH_15_ARGS, instance, method_name, args);
        }
        if (pcase_var.eql((SubLObject)classes_utilities.SIXTEEN_INTEGER)) {
            return (SubLObject)ConsesLow.listS((SubLObject)classes_utilities.$sym145$FUNCALL_CLASS_OR_INSTANCE_METHOD_WITH_16_ARGS, instance, method_name, args);
        }
        if (pcase_var.eql((SubLObject)classes_utilities.SEVENTEEN_INTEGER)) {
            return (SubLObject)ConsesLow.listS((SubLObject)classes_utilities.$sym146$FUNCALL_CLASS_OR_INSTANCE_METHOD_WITH_17_ARGS, instance, method_name, args);
        }
        if (pcase_var.eql((SubLObject)classes_utilities.EIGHTEEN_INTEGER)) {
            return (SubLObject)ConsesLow.listS((SubLObject)classes_utilities.$sym147$FUNCALL_CLASS_OR_INSTANCE_METHOD_WITH_18_ARGS, instance, method_name, args);
        }
        if (pcase_var.eql((SubLObject)classes_utilities.NINETEEN_INTEGER)) {
            return (SubLObject)ConsesLow.listS((SubLObject)classes_utilities.$sym148$FUNCALL_CLASS_OR_INSTANCE_METHOD_WITH_19_ARGS, instance, method_name, args);
        }
        if (pcase_var.eql((SubLObject)classes_utilities.TWENTY_INTEGER)) {
            return (SubLObject)ConsesLow.listS((SubLObject)classes_utilities.$sym149$FUNCALL_CLASS_OR_INSTANCE_METHOD_WITH_20_ARGS, instance, method_name, args);
        }
        return (SubLObject)classes_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/classes-utilities.lisp", position = 20011L)
    public static SubLObject apply_instance_method(final SubLObject instance, final SubLObject method_name, final SubLObject args) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (classes_utilities.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && (classes_utilities.NIL == subloop_structures.instance_p(instance) || !method_name.isSymbol())) {
            Errors.error((SubLObject)classes_utilities.$str150$APPLY_INSTANCE_METHOD__either_ins, instance, method_name);
        }
        final SubLObject v_class = subloop_structures.instance_class(instance);
        final SubLObject method = Hashtables.gethash(method_name, subloop_structures.class_tablified_instance_methods(v_class), (SubLObject)classes_utilities.UNPROVIDED);
        if (classes_utilities.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && classes_utilities.NIL == method) {
            Errors.error((SubLObject)classes_utilities.$str151$APPLY_INSTANCE_METHOD__No__S_meth, method_name, subloop_structures.class_name(v_class), instance);
        }
        if (classes_utilities.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && classes_utilities.NIL == instances.instances_access_check_method(v_class, method)) {
            Errors.error(classes_utilities.$classes_utilities_illegal_access_message$.getGlobalValue(), method_name, subloop_structures.class_name(v_class));
        }
        return Functions.apply(subloop_structures.method_function_name(method), instance, args);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/classes-utilities.lisp", position = 20792L)
    public static SubLObject fim_nr(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject instance = (SubLObject)classes_utilities.NIL;
        SubLObject method_name = (SubLObject)classes_utilities.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)classes_utilities.$list84);
        instance = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)classes_utilities.$list84);
        method_name = current.first();
        final SubLObject args;
        current = (args = current.rest());
        return (SubLObject)ConsesLow.list((SubLObject)classes_utilities.$sym152$FUNCALL_INSTANCE_METHOD_W_O_RECURSION, instance, method_name, args);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/classes-utilities.lisp", position = 20930L)
    public static SubLObject funcall_instance_method_wXo_recursion(final SubLObject instance, final SubLObject method_name, final SubLObject args) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)classes_utilities.NIL;
        final SubLObject key = (SubLObject)ConsesLow.list(instance, method_name, args);
        final SubLObject _prev_bind_0 = classes_utilities.$method_call_stack$.currentBinding(thread);
        try {
            classes_utilities.$method_call_stack$.bind((classes_utilities.NIL != classes_utilities.$method_call_stack$.getDynamicValue(thread)) ? classes_utilities.$method_call_stack$.getDynamicValue(thread) : Hashtables.make_hash_table((SubLObject)classes_utilities.TWENTY_INTEGER, (SubLObject)classes_utilities.EQUAL, (SubLObject)classes_utilities.UNPROVIDED), thread);
            if (classes_utilities.NIL == Hashtables.gethash(key, classes_utilities.$method_call_stack$.getDynamicValue(thread), (SubLObject)classes_utilities.UNPROVIDED)) {
                try {
                    Hashtables.sethash(key, classes_utilities.$method_call_stack$.getDynamicValue(thread), (SubLObject)classes_utilities.T);
                    result = apply_instance_method(instance, method_name, args);
                }
                finally {
                    final SubLObject _prev_bind_0_$1 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)classes_utilities.T, thread);
                        final SubLObject _values = Values.getValuesAsVector();
                        Hashtables.remhash(key, classes_utilities.$method_call_stack$.getDynamicValue(thread));
                        Values.restoreValuesFromVector(_values);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$1, thread);
                    }
                }
            }
        }
        finally {
            classes_utilities.$method_call_stack$.rebind(_prev_bind_0, thread);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/classes-utilities.lisp", position = 21447L)
    public static SubLObject classes_symbol_list_p(final SubLObject v_object) {
        if (classes_utilities.NIL == v_object) {
            return (SubLObject)classes_utilities.T;
        }
        if (v_object.isCons()) {
            SubLObject cdolist_list_var = v_object;
            SubLObject element = (SubLObject)classes_utilities.NIL;
            element = cdolist_list_var.first();
            while (classes_utilities.NIL != cdolist_list_var) {
                if (!element.isSymbol()) {
                    return (SubLObject)classes_utilities.NIL;
                }
                cdolist_list_var = cdolist_list_var.rest();
                element = cdolist_list_var.first();
            }
            return (SubLObject)classes_utilities.T;
        }
        return (SubLObject)classes_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/classes-utilities.lisp", position = 21652L)
    public static SubLObject classes_npartition_list(final SubLObject item, final SubLObject sequence, SubLObject key, SubLObject test) {
        if (key == classes_utilities.UNPROVIDED) {
            key = (SubLObject)classes_utilities.IDENTITY;
        }
        if (test == classes_utilities.UNPROVIDED) {
            test = (SubLObject)classes_utilities.EQ;
        }
        SubLObject match_list = (SubLObject)classes_utilities.NIL;
        SubLObject not_match_list = (SubLObject)classes_utilities.NIL;
        SubLObject element_dekeyed = (SubLObject)classes_utilities.NIL;
        SubLObject match = (SubLObject)classes_utilities.NIL;
        SubLObject next_cons_var = (SubLObject)classes_utilities.NIL;
        SubLObject sublist = (SubLObject)classes_utilities.NIL;
        SubLObject element = (SubLObject)classes_utilities.NIL;
        sublist = sequence;
        element = sublist.first();
        while (classes_utilities.NIL != sublist) {
            next_cons_var = sublist.rest();
            SubLObject pcase_var = key;
            if (pcase_var.eql((SubLObject)classes_utilities.IDENTITY)) {
                element_dekeyed = Equality.identity(element);
            }
            else if (pcase_var.eql((SubLObject)classes_utilities.$sym153$CAR)) {
                element_dekeyed = element.first();
            }
            else {
                element_dekeyed = Functions.funcall(key, element);
            }
            pcase_var = test;
            if (pcase_var.eql((SubLObject)classes_utilities.EQ)) {
                match = Equality.eq(item, element_dekeyed);
            }
            else if (pcase_var.eql((SubLObject)classes_utilities.EQL)) {
                match = Equality.eql(item, element_dekeyed);
            }
            else if (pcase_var.eql((SubLObject)classes_utilities.EQUAL)) {
                match = Equality.equal(item, element_dekeyed);
            }
            else if (pcase_var.eql((SubLObject)classes_utilities.$sym154$_)) {
                match = Numbers.numE(item, element_dekeyed);
            }
            else if (pcase_var.eql((SubLObject)classes_utilities.$sym155$STRING_EQUAL)) {
                match = Strings.string_equal(item, element_dekeyed, (SubLObject)classes_utilities.UNPROVIDED, (SubLObject)classes_utilities.UNPROVIDED, (SubLObject)classes_utilities.UNPROVIDED, (SubLObject)classes_utilities.UNPROVIDED);
            }
            else {
                match = Functions.funcall(test, item, element_dekeyed);
            }
            if (classes_utilities.NIL != match) {
                ConsesLow.rplacd(sublist, match_list);
                match_list = sublist;
            }
            else {
                ConsesLow.rplacd(sublist, not_match_list);
                not_match_list = sublist;
            }
            sublist = next_cons_var;
            element = sublist.first();
        }
        return Values.values(Sequences.nreverse(match_list), Sequences.nreverse(not_match_list));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/classes-utilities.lisp", position = 22295L)
    public static SubLObject classes_npartition_list_macro(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)classes_utilities.$list156);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject settable_match_loc = (SubLObject)classes_utilities.NIL;
        SubLObject settable_no_match_loc = (SubLObject)classes_utilities.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)classes_utilities.$list156);
        settable_match_loc = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)classes_utilities.$list156);
        settable_no_match_loc = current.first();
        current = current.rest();
        if (classes_utilities.NIL == current) {
            current = temp;
            SubLObject item = (SubLObject)classes_utilities.NIL;
            SubLObject sequence = (SubLObject)classes_utilities.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)classes_utilities.$list156);
            item = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)classes_utilities.$list156);
            sequence = current.first();
            current = current.rest();
            final SubLObject key = (SubLObject)(current.isCons() ? current.first() : classes_utilities.IDENTITY);
            cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)classes_utilities.$list156);
            current = current.rest();
            final SubLObject test = (SubLObject)(current.isCons() ? current.first() : classes_utilities.EQ);
            cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)classes_utilities.$list156);
            current = current.rest();
            if (classes_utilities.NIL == current) {
                final SubLObject item_var = Symbols.make_symbol((SubLObject)classes_utilities.$str157$item);
                final SubLObject match_list_var = Symbols.make_symbol((SubLObject)classes_utilities.$str158$match_list);
                final SubLObject not_match_list_var = Symbols.make_symbol((SubLObject)classes_utilities.$str159$not_match_list);
                final SubLObject element_var = Symbols.make_symbol((SubLObject)classes_utilities.$str160$element);
                final SubLObject sublist_var = Symbols.make_symbol((SubLObject)classes_utilities.$str161$sublist);
                return (SubLObject)ConsesLow.list((SubLObject)classes_utilities.$sym7$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(item_var, item), reader.bq_cons(match_list_var, (SubLObject)classes_utilities.$list162), reader.bq_cons(not_match_list_var, (SubLObject)classes_utilities.$list162)), (SubLObject)ConsesLow.list((SubLObject)classes_utilities.$sym163$CDOLIST_AND_SUBLISTS_CAREFULLY, (SubLObject)ConsesLow.list(element_var, sublist_var, sequence), (SubLObject)ConsesLow.list((SubLObject)classes_utilities.$sym29$PIF, (SubLObject)ConsesLow.list(test, (SubLObject)ConsesLow.list(key, element_var), item_var), (SubLObject)ConsesLow.list((SubLObject)classes_utilities.$sym20$PROGN, (SubLObject)ConsesLow.list((SubLObject)classes_utilities.$sym164$RPLACD, sublist_var, match_list_var), (SubLObject)ConsesLow.list((SubLObject)classes_utilities.$sym165$CSETQ, match_list_var, sublist_var)), (SubLObject)ConsesLow.list((SubLObject)classes_utilities.$sym20$PROGN, (SubLObject)ConsesLow.list((SubLObject)classes_utilities.$sym164$RPLACD, sublist_var, not_match_list_var), (SubLObject)ConsesLow.list((SubLObject)classes_utilities.$sym165$CSETQ, not_match_list_var, sublist_var)))), (SubLObject)ConsesLow.list((SubLObject)classes_utilities.$sym166$CSETF, settable_match_loc, (SubLObject)ConsesLow.list((SubLObject)classes_utilities.$sym167$NREVERSE, match_list_var)), (SubLObject)ConsesLow.list((SubLObject)classes_utilities.$sym166$CSETF, settable_no_match_loc, (SubLObject)ConsesLow.list((SubLObject)classes_utilities.$sym167$NREVERSE, not_match_list_var)));
            }
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)classes_utilities.$list156);
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)classes_utilities.$list156);
        }
        return (SubLObject)classes_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/classes-utilities.lisp", position = 23214L)
    public static SubLObject classes_check_do_classes_in_order_parameters(final SubLObject var, final SubLObject base_class, final SubLObject listed_optional_depth_var, final SubLObject forms) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (classes_utilities.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && (!var.isSymbol() || classes_utilities.NIL == var)) {
            Errors.error((SubLObject)classes_utilities.$str168$DO_CLASSES_IN_ORDER___S_is_not_a_, var);
        }
        if (classes_utilities.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && classes_utilities.NIL != listed_optional_depth_var && (!listed_optional_depth_var.isCons() || !listed_optional_depth_var.first().isSymbol() || classes_utilities.NIL == listed_optional_depth_var.first() || classes_utilities.NIL != listed_optional_depth_var.rest())) {
            Errors.error((SubLObject)classes_utilities.$str169$DO_CLASSES_IN_ORDER___S_is_not_a_, listed_optional_depth_var);
        }
        if (classes_utilities.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && !forms.isList()) {
            Errors.error((SubLObject)classes_utilities.$str170$DO_CLASSES_IN_ORDER___S_is_not_a_, forms);
        }
        return (SubLObject)classes_utilities.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/classes-utilities.lisp", position = 23988L)
    public static SubLObject method_bound_p(final SubLObject class_or_class_symbol, final SubLObject method_symbol) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject v_class = class_or_class_symbol;
        if (v_class.isSymbol()) {
            v_class = classes.classes_retrieve_class(v_class);
        }
        if (classes_utilities.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && classes_utilities.NIL == subloop_structures.class_p(v_class)) {
            Errors.error((SubLObject)classes_utilities.$str171$Class__A_not_recognized_, class_or_class_symbol);
        }
        final SubLObject method = Hashtables.gethash(method_symbol, subloop_structures.class_tablified_instance_methods(v_class), (SubLObject)classes_utilities.UNPROVIDED);
        if (classes_utilities.NIL == subloop_structures.method_p(method)) {
            return (SubLObject)classes_utilities.NIL;
        }
        final SubLObject method_function = subloop_structures.method_function_name(method);
        return Symbols.fboundp(method_function);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/classes-utilities.lisp", position = 24705L)
    public static SubLObject valid_subloop_safe_funcaller_error_values() {
        return classes_utilities.$valid_subloop_safe_funcaller_error_values$.getGlobalValue();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/classes-utilities.lisp", position = 24705L)
    public static SubLObject subloop_safe_funcaller_error_value_p(final SubLObject v_object) {
        return (SubLObject)((classes_utilities.NIL != conses_high.member(v_object, classes_utilities.$valid_subloop_safe_funcaller_error_values$.getGlobalValue(), (SubLObject)classes_utilities.UNPROVIDED, (SubLObject)classes_utilities.UNPROVIDED)) ? classes_utilities.T : classes_utilities.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/classes-utilities.lisp", position = 24705L)
    public static SubLObject encode_subloop_safe_funcaller_error_value(final SubLObject value) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject pos = Sequences.position(value, classes_utilities.$valid_subloop_safe_funcaller_error_values$.getGlobalValue(), (SubLObject)classes_utilities.UNPROVIDED, (SubLObject)classes_utilities.UNPROVIDED, (SubLObject)classes_utilities.UNPROVIDED, (SubLObject)classes_utilities.UNPROVIDED);
        if (classes_utilities.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && classes_utilities.NIL == pos) {
            Errors.error((SubLObject)classes_utilities.$str174$_S___S_is_not_a_member_of_the__S_, (SubLObject)classes_utilities.$sym175$ENCODE_SUBLOOP_SAFE_FUNCALLER_ERROR_VALUE, value, (SubLObject)classes_utilities.$sym173$SUBLOOP_SAFE_FUNCALLER_ERROR_VALUE);
        }
        return pos;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/classes-utilities.lisp", position = 24705L)
    public static SubLObject decode_subloop_safe_funcaller_error_value(final SubLObject value) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject element = ConsesLow.nth(value, classes_utilities.$valid_subloop_safe_funcaller_error_values$.getGlobalValue());
        if (classes_utilities.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && classes_utilities.NIL == element) {
            Errors.error((SubLObject)classes_utilities.$str176$_S___S_is_not_a_valid_encoding_of, (SubLObject)classes_utilities.$sym177$DECODE_SUBLOOP_SAFE_FUNCALLER_ERROR_VALUE, value, (SubLObject)classes_utilities.$sym173$SUBLOOP_SAFE_FUNCALLER_ERROR_VALUE);
        }
        return element;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/classes-utilities.lisp", position = 24705L)
    public static SubLObject subloop_safe_funcaller_error_value_less_p(final SubLObject value1, final SubLObject value2) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (classes_utilities.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && classes_utilities.NIL == subloop_safe_funcaller_error_value_p(value1)) {
            Errors.error((SubLObject)classes_utilities.$str178$_S___S_was_expected_to_be_a_membe, (SubLObject)classes_utilities.$sym179$SUBLOOP_SAFE_FUNCALLER_ERROR_VALUE_P, value1, (SubLObject)classes_utilities.$sym173$SUBLOOP_SAFE_FUNCALLER_ERROR_VALUE);
        }
        if (classes_utilities.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && classes_utilities.NIL == subloop_safe_funcaller_error_value_p(value2)) {
            Errors.error((SubLObject)classes_utilities.$str178$_S___S_was_expected_to_be_a_membe, (SubLObject)classes_utilities.$sym179$SUBLOOP_SAFE_FUNCALLER_ERROR_VALUE_P, value2, (SubLObject)classes_utilities.$sym173$SUBLOOP_SAFE_FUNCALLER_ERROR_VALUE);
        }
        SubLObject cdolist_list_var = classes_utilities.$valid_subloop_safe_funcaller_error_values$.getGlobalValue();
        SubLObject value3 = (SubLObject)classes_utilities.NIL;
        value3 = cdolist_list_var.first();
        while (classes_utilities.NIL != cdolist_list_var) {
            if (value3.eql(value1)) {
                return (SubLObject)SubLObjectFactory.makeBoolean(!value3.eql(value2));
            }
            if (value3.eql(value2)) {
                return (SubLObject)classes_utilities.NIL;
            }
            cdolist_list_var = cdolist_list_var.rest();
            value3 = cdolist_list_var.first();
        }
        return (SubLObject)classes_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/classes-utilities.lisp", position = 24705L)
    public static SubLObject subloop_safe_funcaller_error_value_greater_p(final SubLObject value1, final SubLObject value2) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (classes_utilities.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && classes_utilities.NIL == subloop_safe_funcaller_error_value_p(value1)) {
            Errors.error((SubLObject)classes_utilities.$str178$_S___S_was_expected_to_be_a_membe, (SubLObject)classes_utilities.$sym179$SUBLOOP_SAFE_FUNCALLER_ERROR_VALUE_P, value1, (SubLObject)classes_utilities.$sym173$SUBLOOP_SAFE_FUNCALLER_ERROR_VALUE);
        }
        if (classes_utilities.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && classes_utilities.NIL == subloop_safe_funcaller_error_value_p(value2)) {
            Errors.error((SubLObject)classes_utilities.$str178$_S___S_was_expected_to_be_a_membe, (SubLObject)classes_utilities.$sym179$SUBLOOP_SAFE_FUNCALLER_ERROR_VALUE_P, value2, (SubLObject)classes_utilities.$sym173$SUBLOOP_SAFE_FUNCALLER_ERROR_VALUE);
        }
        SubLObject cdolist_list_var = classes_utilities.$valid_subloop_safe_funcaller_error_values$.getGlobalValue();
        SubLObject value3 = (SubLObject)classes_utilities.NIL;
        value3 = cdolist_list_var.first();
        while (classes_utilities.NIL != cdolist_list_var) {
            if (value3.eql(value2)) {
                return (SubLObject)SubLObjectFactory.makeBoolean(!value3.eql(value1));
            }
            if (value3.eql(value1)) {
                return (SubLObject)classes_utilities.NIL;
            }
            cdolist_list_var = cdolist_list_var.rest();
            value3 = cdolist_list_var.first();
        }
        return (SubLObject)classes_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/classes-utilities.lisp", position = 24978L)
    public static SubLObject define_safe_class_method_funcallers(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject name_template = (SubLObject)classes_utilities.NIL;
        SubLObject max_args = (SubLObject)classes_utilities.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)classes_utilities.$list3);
        name_template = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)classes_utilities.$list3);
        max_args = current.first();
        current = current.rest();
        if (classes_utilities.NIL == current) {
            SubLObject function_defs = (SubLObject)classes_utilities.NIL;
            SubLObject arg_list = (SubLObject)classes_utilities.NIL;
            SubLObject function_name = (SubLObject)classes_utilities.NIL;
            SubLObject function_def = (SubLObject)classes_utilities.NIL;
            SubLObject cdotimes_end_var;
            SubLObject i;
            for (cdotimes_end_var = Numbers.add(max_args, (SubLObject)classes_utilities.ONE_INTEGER), i = (SubLObject)classes_utilities.NIL, i = (SubLObject)classes_utilities.ZERO_INTEGER; i.numL(cdotimes_end_var); i = Numbers.add(i, (SubLObject)classes_utilities.ONE_INTEGER)) {
                function_name = Packages.intern(PrintLow.format((SubLObject)classes_utilities.NIL, name_template, i), (SubLObject)classes_utilities.UNPROVIDED);
                function_def = conses_high.copy_tree((SubLObject)ConsesLow.list((SubLObject)classes_utilities.$sym4$DEFINE_PUBLIC, function_name, (SubLObject)ConsesLow.listS((SubLObject)classes_utilities.$sym5$CLASS_NAME_OR_CLASS, (SubLObject)classes_utilities.$sym6$METHOD_NAME, arg_list), (SubLObject)ConsesLow.list((SubLObject)classes_utilities.$sym7$CLET, (SubLObject)classes_utilities.$list8, (SubLObject)classes_utilities.$list180, (SubLObject)classes_utilities.$list181, (SubLObject)ConsesLow.list((SubLObject)classes_utilities.$sym7$CLET, (SubLObject)classes_utilities.$list11, (SubLObject)classes_utilities.$list182, (SubLObject)classes_utilities.$list183, (SubLObject)ConsesLow.list((SubLObject)classes_utilities.$sym7$CLET, (SubLObject)classes_utilities.$list184, (SubLObject)classes_utilities.$list185, (SubLObject)ConsesLow.list((SubLObject)classes_utilities.$sym14$RET, (SubLObject)ConsesLow.listS((SubLObject)classes_utilities.$sym186$VALUES, (SubLObject)ConsesLow.listS((SubLObject)classes_utilities.$sym15$FUNCALL, (SubLObject)classes_utilities.$sym187$FUNCTION_REF, (SubLObject)classes_utilities.$sym17$CLASS, arg_list), (SubLObject)classes_utilities.$list162)))))));
                function_defs = (SubLObject)ConsesLow.cons(function_def, function_defs);
                arg_list = Sequences.nreverse((SubLObject)ConsesLow.cons(Packages.intern(PrintLow.format((SubLObject)classes_utilities.NIL, (SubLObject)classes_utilities.$str19$ARG_S, i), (SubLObject)classes_utilities.UNPROVIDED), Sequences.nreverse(arg_list)));
            }
            return reader.bq_cons((SubLObject)classes_utilities.$sym20$PROGN, Sequences.nreverse(function_defs));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)classes_utilities.$list3);
        return (SubLObject)classes_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/classes-utilities.lisp", position = 26448L)
    public static SubLObject define_safe_class_super_method_funcallers(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject name_template = (SubLObject)classes_utilities.NIL;
        SubLObject max_args = (SubLObject)classes_utilities.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)classes_utilities.$list3);
        name_template = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)classes_utilities.$list3);
        max_args = current.first();
        current = current.rest();
        if (classes_utilities.NIL == current) {
            SubLObject function_defs = (SubLObject)classes_utilities.NIL;
            SubLObject arg_list = (SubLObject)classes_utilities.NIL;
            SubLObject function_name = (SubLObject)classes_utilities.NIL;
            SubLObject function_def = (SubLObject)classes_utilities.NIL;
            SubLObject cdotimes_end_var;
            SubLObject i;
            for (cdotimes_end_var = Numbers.add(max_args, (SubLObject)classes_utilities.ONE_INTEGER), i = (SubLObject)classes_utilities.NIL, i = (SubLObject)classes_utilities.ZERO_INTEGER; i.numL(cdotimes_end_var); i = Numbers.add(i, (SubLObject)classes_utilities.ONE_INTEGER)) {
                function_name = Packages.intern(PrintLow.format((SubLObject)classes_utilities.NIL, name_template, i), (SubLObject)classes_utilities.UNPROVIDED);
                function_def = conses_high.copy_tree((SubLObject)ConsesLow.list((SubLObject)classes_utilities.$sym4$DEFINE_PUBLIC, function_name, (SubLObject)ConsesLow.listS((SubLObject)classes_utilities.$sym5$CLASS_NAME_OR_CLASS, (SubLObject)classes_utilities.$sym6$METHOD_NAME, arg_list), (SubLObject)ConsesLow.list((SubLObject)classes_utilities.$sym7$CLET, (SubLObject)classes_utilities.$list8, (SubLObject)classes_utilities.$list180, (SubLObject)classes_utilities.$list181, (SubLObject)ConsesLow.list((SubLObject)classes_utilities.$sym7$CLET, (SubLObject)classes_utilities.$list23, (SubLObject)classes_utilities.$list182, (SubLObject)classes_utilities.$list183, (SubLObject)ConsesLow.list((SubLObject)classes_utilities.$sym7$CLET, (SubLObject)classes_utilities.$list184, (SubLObject)classes_utilities.$list185, (SubLObject)ConsesLow.list((SubLObject)classes_utilities.$sym14$RET, (SubLObject)ConsesLow.listS((SubLObject)classes_utilities.$sym186$VALUES, (SubLObject)ConsesLow.listS((SubLObject)classes_utilities.$sym15$FUNCALL, (SubLObject)classes_utilities.$sym187$FUNCTION_REF, (SubLObject)classes_utilities.$sym17$CLASS, arg_list), (SubLObject)classes_utilities.$list162)))))));
                function_defs = (SubLObject)ConsesLow.cons(function_def, function_defs);
                arg_list = Sequences.nreverse((SubLObject)ConsesLow.cons(Packages.intern(PrintLow.format((SubLObject)classes_utilities.NIL, (SubLObject)classes_utilities.$str19$ARG_S, i), (SubLObject)classes_utilities.UNPROVIDED), Sequences.nreverse(arg_list)));
            }
            return reader.bq_cons((SubLObject)classes_utilities.$sym20$PROGN, Sequences.nreverse(function_defs));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)classes_utilities.$list3);
        return (SubLObject)classes_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/classes-utilities.lisp", position = 27940L)
    public static SubLObject define_safe_instance_method_funcallers(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject name_template = (SubLObject)classes_utilities.NIL;
        SubLObject class_name_template = (SubLObject)classes_utilities.NIL;
        SubLObject max_args = (SubLObject)classes_utilities.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)classes_utilities.$list25);
        name_template = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)classes_utilities.$list25);
        class_name_template = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)classes_utilities.$list25);
        max_args = current.first();
        current = current.rest();
        if (classes_utilities.NIL == current) {
            SubLObject function_defs = (SubLObject)classes_utilities.NIL;
            SubLObject arg_list = (SubLObject)classes_utilities.NIL;
            SubLObject function_name = (SubLObject)classes_utilities.NIL;
            SubLObject class_function_name = (SubLObject)classes_utilities.NIL;
            SubLObject function_def = (SubLObject)classes_utilities.NIL;
            SubLObject cdotimes_end_var;
            SubLObject i;
            for (cdotimes_end_var = Numbers.add(max_args, (SubLObject)classes_utilities.ONE_INTEGER), i = (SubLObject)classes_utilities.NIL, i = (SubLObject)classes_utilities.ZERO_INTEGER; i.numL(cdotimes_end_var); i = Numbers.add(i, (SubLObject)classes_utilities.ONE_INTEGER)) {
                function_name = Packages.intern(PrintLow.format((SubLObject)classes_utilities.NIL, name_template, i), (SubLObject)classes_utilities.UNPROVIDED);
                class_function_name = Packages.intern(PrintLow.format((SubLObject)classes_utilities.NIL, class_name_template, i), (SubLObject)classes_utilities.UNPROVIDED);
                function_def = conses_high.copy_tree((SubLObject)ConsesLow.list((SubLObject)classes_utilities.$sym4$DEFINE_PUBLIC, function_name, (SubLObject)ConsesLow.listS((SubLObject)classes_utilities.$sym26$INSTANCE, (SubLObject)classes_utilities.$sym6$METHOD_NAME, arg_list), (SubLObject)classes_utilities.$list188, (SubLObject)classes_utilities.$list181, (SubLObject)ConsesLow.list((SubLObject)classes_utilities.$sym7$CLET, (SubLObject)classes_utilities.$list28, (SubLObject)ConsesLow.list((SubLObject)classes_utilities.$sym29$PIF, (SubLObject)classes_utilities.$sym30$METHOD, (SubLObject)ConsesLow.list((SubLObject)classes_utilities.$sym20$PROGN, (SubLObject)classes_utilities.$list183, (SubLObject)ConsesLow.list((SubLObject)classes_utilities.$sym7$CLET, (SubLObject)classes_utilities.$list184, (SubLObject)classes_utilities.$list185, (SubLObject)ConsesLow.list((SubLObject)classes_utilities.$sym14$RET, (SubLObject)ConsesLow.listS((SubLObject)classes_utilities.$sym186$VALUES, (SubLObject)ConsesLow.listS((SubLObject)classes_utilities.$sym15$FUNCALL, (SubLObject)classes_utilities.$sym187$FUNCTION_REF, (SubLObject)classes_utilities.$sym26$INSTANCE, arg_list), (SubLObject)classes_utilities.$list162)))), (SubLObject)ConsesLow.list((SubLObject)classes_utilities.$sym14$RET, (SubLObject)ConsesLow.listS(class_function_name, (SubLObject)classes_utilities.$sym17$CLASS, (SubLObject)classes_utilities.$sym6$METHOD_NAME, arg_list))))));
                function_defs = (SubLObject)ConsesLow.cons(function_def, function_defs);
                arg_list = Sequences.nreverse((SubLObject)ConsesLow.cons(Packages.intern(PrintLow.format((SubLObject)classes_utilities.NIL, (SubLObject)classes_utilities.$str19$ARG_S, i), (SubLObject)classes_utilities.UNPROVIDED), Sequences.nreverse(arg_list)));
            }
            return reader.bq_cons((SubLObject)classes_utilities.$sym20$PROGN, Sequences.nreverse(function_defs));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)classes_utilities.$list25);
        return (SubLObject)classes_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/classes-utilities.lisp", position = 29337L)
    public static SubLObject define_safe_instance_super_method_funcallers(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject name_template = (SubLObject)classes_utilities.NIL;
        SubLObject class_name_template = (SubLObject)classes_utilities.NIL;
        SubLObject max_args = (SubLObject)classes_utilities.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)classes_utilities.$list25);
        name_template = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)classes_utilities.$list25);
        class_name_template = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)classes_utilities.$list25);
        max_args = current.first();
        current = current.rest();
        if (classes_utilities.NIL == current) {
            SubLObject function_defs = (SubLObject)classes_utilities.NIL;
            SubLObject arg_list = (SubLObject)classes_utilities.NIL;
            SubLObject function_name = (SubLObject)classes_utilities.NIL;
            SubLObject class_function_name = (SubLObject)classes_utilities.NIL;
            SubLObject function_def = (SubLObject)classes_utilities.NIL;
            SubLObject cdotimes_end_var;
            SubLObject i;
            for (cdotimes_end_var = Numbers.add(max_args, (SubLObject)classes_utilities.ONE_INTEGER), i = (SubLObject)classes_utilities.NIL, i = (SubLObject)classes_utilities.ZERO_INTEGER; i.numL(cdotimes_end_var); i = Numbers.add(i, (SubLObject)classes_utilities.ONE_INTEGER)) {
                function_name = Packages.intern(PrintLow.format((SubLObject)classes_utilities.NIL, name_template, i), (SubLObject)classes_utilities.UNPROVIDED);
                class_function_name = Packages.intern(PrintLow.format((SubLObject)classes_utilities.NIL, class_name_template, i), (SubLObject)classes_utilities.UNPROVIDED);
                function_def = conses_high.copy_tree((SubLObject)ConsesLow.list((SubLObject)classes_utilities.$sym4$DEFINE_PUBLIC, function_name, (SubLObject)ConsesLow.listS((SubLObject)classes_utilities.$sym26$INSTANCE, (SubLObject)classes_utilities.$sym6$METHOD_NAME, arg_list), (SubLObject)classes_utilities.$list188, (SubLObject)classes_utilities.$list189, (SubLObject)ConsesLow.list((SubLObject)classes_utilities.$sym7$CLET, (SubLObject)classes_utilities.$list31, (SubLObject)ConsesLow.list((SubLObject)classes_utilities.$sym29$PIF, (SubLObject)classes_utilities.$sym30$METHOD, (SubLObject)ConsesLow.list((SubLObject)classes_utilities.$sym20$PROGN, (SubLObject)classes_utilities.$list183, (SubLObject)ConsesLow.list((SubLObject)classes_utilities.$sym7$CLET, (SubLObject)classes_utilities.$list184, (SubLObject)classes_utilities.$list185, (SubLObject)ConsesLow.list((SubLObject)classes_utilities.$sym14$RET, (SubLObject)ConsesLow.listS((SubLObject)classes_utilities.$sym186$VALUES, (SubLObject)ConsesLow.listS((SubLObject)classes_utilities.$sym15$FUNCALL, (SubLObject)classes_utilities.$sym187$FUNCTION_REF, (SubLObject)classes_utilities.$sym26$INSTANCE, arg_list), (SubLObject)classes_utilities.$list162)))), (SubLObject)ConsesLow.list((SubLObject)classes_utilities.$sym14$RET, (SubLObject)ConsesLow.listS(class_function_name, (SubLObject)classes_utilities.$sym17$CLASS, (SubLObject)classes_utilities.$sym6$METHOD_NAME, arg_list))))));
                function_defs = (SubLObject)ConsesLow.cons(function_def, function_defs);
                arg_list = Sequences.nreverse((SubLObject)ConsesLow.cons(Packages.intern(PrintLow.format((SubLObject)classes_utilities.NIL, (SubLObject)classes_utilities.$str19$ARG_S, i), (SubLObject)classes_utilities.UNPROVIDED), Sequences.nreverse(arg_list)));
            }
            return reader.bq_cons((SubLObject)classes_utilities.$sym20$PROGN, Sequences.nreverse(function_defs));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)classes_utilities.$list25);
        return (SubLObject)classes_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/classes-utilities.lisp", position = 30751L)
    public static SubLObject define_safe_class_or_instance_method_funcallers(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject name_template = (SubLObject)classes_utilities.NIL;
        SubLObject max_args = (SubLObject)classes_utilities.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)classes_utilities.$list3);
        name_template = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)classes_utilities.$list3);
        max_args = current.first();
        current = current.rest();
        if (classes_utilities.NIL == current) {
            SubLObject function_defs = (SubLObject)classes_utilities.NIL;
            SubLObject arg_list = (SubLObject)classes_utilities.NIL;
            SubLObject function_name = (SubLObject)classes_utilities.NIL;
            SubLObject function_def = (SubLObject)classes_utilities.NIL;
            SubLObject cdotimes_end_var;
            SubLObject i;
            for (cdotimes_end_var = Numbers.add(max_args, (SubLObject)classes_utilities.ONE_INTEGER), i = (SubLObject)classes_utilities.NIL, i = (SubLObject)classes_utilities.ZERO_INTEGER; i.numL(cdotimes_end_var); i = Numbers.add(i, (SubLObject)classes_utilities.ONE_INTEGER)) {
                function_name = Packages.intern(PrintLow.format((SubLObject)classes_utilities.NIL, name_template, i), (SubLObject)classes_utilities.UNPROVIDED);
                function_def = conses_high.copy_tree((SubLObject)ConsesLow.list((SubLObject)classes_utilities.$sym4$DEFINE_PUBLIC, function_name, (SubLObject)ConsesLow.listS((SubLObject)classes_utilities.$sym32$CLASS_OR_INSTANCE, (SubLObject)classes_utilities.$sym6$METHOD_NAME, arg_list), (SubLObject)classes_utilities.$list181, (SubLObject)ConsesLow.list((SubLObject)classes_utilities.$sym29$PIF, (SubLObject)classes_utilities.$list34, (SubLObject)ConsesLow.list((SubLObject)classes_utilities.$sym7$CLET, (SubLObject)classes_utilities.$list35, (SubLObject)ConsesLow.listS((SubLObject)classes_utilities.$sym29$PIF, (SubLObject)classes_utilities.$sym30$METHOD, (SubLObject)ConsesLow.list((SubLObject)classes_utilities.$sym20$PROGN, (SubLObject)classes_utilities.$list183, (SubLObject)ConsesLow.list((SubLObject)classes_utilities.$sym7$CLET, (SubLObject)classes_utilities.$list184, (SubLObject)classes_utilities.$list185, (SubLObject)ConsesLow.list((SubLObject)classes_utilities.$sym14$RET, (SubLObject)ConsesLow.listS((SubLObject)classes_utilities.$sym186$VALUES, (SubLObject)ConsesLow.listS((SubLObject)classes_utilities.$sym15$FUNCALL, (SubLObject)classes_utilities.$sym187$FUNCTION_REF, (SubLObject)classes_utilities.$sym32$CLASS_OR_INSTANCE, arg_list), (SubLObject)classes_utilities.$list162)))), (SubLObject)classes_utilities.$list190)), (SubLObject)ConsesLow.list((SubLObject)classes_utilities.$sym7$CLET, (SubLObject)classes_utilities.$list37, (SubLObject)classes_utilities.$list180, (SubLObject)classes_utilities.$list191, (SubLObject)classes_utilities.$list192, (SubLObject)ConsesLow.list((SubLObject)classes_utilities.$sym7$CLET, (SubLObject)classes_utilities.$list184, (SubLObject)classes_utilities.$list185, (SubLObject)ConsesLow.list((SubLObject)classes_utilities.$sym14$RET, (SubLObject)ConsesLow.listS((SubLObject)classes_utilities.$sym186$VALUES, (SubLObject)ConsesLow.listS((SubLObject)classes_utilities.$sym15$FUNCALL, (SubLObject)classes_utilities.$sym187$FUNCTION_REF, (SubLObject)classes_utilities.$sym17$CLASS, arg_list), (SubLObject)classes_utilities.$list162)))))));
                function_defs = (SubLObject)ConsesLow.cons(function_def, function_defs);
                arg_list = Sequences.nreverse((SubLObject)ConsesLow.cons(Packages.intern(PrintLow.format((SubLObject)classes_utilities.NIL, (SubLObject)classes_utilities.$str19$ARG_S, i), (SubLObject)classes_utilities.UNPROVIDED), Sequences.nreverse(arg_list)));
            }
            return reader.bq_cons((SubLObject)classes_utilities.$sym20$PROGN, Sequences.nreverse(function_defs));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)classes_utilities.$list3);
        return (SubLObject)classes_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/classes-utilities.lisp", position = 32722L)
    public static SubLObject safe_funcall_class_method(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject v_class = (SubLObject)classes_utilities.NIL;
        SubLObject method_name = (SubLObject)classes_utilities.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)classes_utilities.$list39);
        v_class = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)classes_utilities.$list39);
        method_name = current.first();
        final SubLObject args;
        current = (args = current.rest());
        final SubLObject pcase_var;
        final SubLObject arg_count = pcase_var = Sequences.length(args);
        if (pcase_var.eql((SubLObject)classes_utilities.ZERO_INTEGER)) {
            return (SubLObject)ConsesLow.list((SubLObject)classes_utilities.$sym193$SAFE_FUNCALL_CLASS_METHOD_WITH_0_ARGS, v_class, method_name);
        }
        if (pcase_var.eql((SubLObject)classes_utilities.ONE_INTEGER)) {
            return (SubLObject)ConsesLow.listS((SubLObject)classes_utilities.$sym194$SAFE_FUNCALL_CLASS_METHOD_WITH_1_ARGS, v_class, method_name, args);
        }
        if (pcase_var.eql((SubLObject)classes_utilities.TWO_INTEGER)) {
            return (SubLObject)ConsesLow.listS((SubLObject)classes_utilities.$sym195$SAFE_FUNCALL_CLASS_METHOD_WITH_2_ARGS, v_class, method_name, args);
        }
        if (pcase_var.eql((SubLObject)classes_utilities.THREE_INTEGER)) {
            return (SubLObject)ConsesLow.listS((SubLObject)classes_utilities.$sym196$SAFE_FUNCALL_CLASS_METHOD_WITH_3_ARGS, v_class, method_name, args);
        }
        if (pcase_var.eql((SubLObject)classes_utilities.FOUR_INTEGER)) {
            return (SubLObject)ConsesLow.listS((SubLObject)classes_utilities.$sym197$SAFE_FUNCALL_CLASS_METHOD_WITH_4_ARGS, v_class, method_name, args);
        }
        if (pcase_var.eql((SubLObject)classes_utilities.FIVE_INTEGER)) {
            return (SubLObject)ConsesLow.listS((SubLObject)classes_utilities.$sym198$SAFE_FUNCALL_CLASS_METHOD_WITH_5_ARGS, v_class, method_name, args);
        }
        if (pcase_var.eql((SubLObject)classes_utilities.SIX_INTEGER)) {
            return (SubLObject)ConsesLow.listS((SubLObject)classes_utilities.$sym199$SAFE_FUNCALL_CLASS_METHOD_WITH_6_ARGS, v_class, method_name, args);
        }
        if (pcase_var.eql((SubLObject)classes_utilities.SEVEN_INTEGER)) {
            return (SubLObject)ConsesLow.listS((SubLObject)classes_utilities.$sym200$SAFE_FUNCALL_CLASS_METHOD_WITH_7_ARGS, v_class, method_name, args);
        }
        if (pcase_var.eql((SubLObject)classes_utilities.EIGHT_INTEGER)) {
            return (SubLObject)ConsesLow.listS((SubLObject)classes_utilities.$sym201$SAFE_FUNCALL_CLASS_METHOD_WITH_8_ARGS, v_class, method_name, args);
        }
        if (pcase_var.eql((SubLObject)classes_utilities.NINE_INTEGER)) {
            return (SubLObject)ConsesLow.listS((SubLObject)classes_utilities.$sym202$SAFE_FUNCALL_CLASS_METHOD_WITH_9_ARGS, v_class, method_name, args);
        }
        if (pcase_var.eql((SubLObject)classes_utilities.TEN_INTEGER)) {
            return (SubLObject)ConsesLow.listS((SubLObject)classes_utilities.$sym203$SAFE_FUNCALL_CLASS_METHOD_WITH_10_ARGS, v_class, method_name, args);
        }
        if (pcase_var.eql((SubLObject)classes_utilities.ELEVEN_INTEGER)) {
            return (SubLObject)ConsesLow.listS((SubLObject)classes_utilities.$sym204$SAFE_FUNCALL_CLASS_METHOD_WITH_11_ARGS, v_class, method_name, args);
        }
        if (pcase_var.eql((SubLObject)classes_utilities.TWELVE_INTEGER)) {
            return (SubLObject)ConsesLow.listS((SubLObject)classes_utilities.$sym205$SAFE_FUNCALL_CLASS_METHOD_WITH_12_ARGS, v_class, method_name, args);
        }
        if (pcase_var.eql((SubLObject)classes_utilities.THIRTEEN_INTEGER)) {
            return (SubLObject)ConsesLow.listS((SubLObject)classes_utilities.$sym206$SAFE_FUNCALL_CLASS_METHOD_WITH_13_ARGS, v_class, method_name, args);
        }
        if (pcase_var.eql((SubLObject)classes_utilities.FOURTEEN_INTEGER)) {
            return (SubLObject)ConsesLow.listS((SubLObject)classes_utilities.$sym207$SAFE_FUNCALL_CLASS_METHOD_WITH_14_ARGS, v_class, method_name, args);
        }
        if (pcase_var.eql((SubLObject)classes_utilities.FIFTEEN_INTEGER)) {
            return (SubLObject)ConsesLow.listS((SubLObject)classes_utilities.$sym208$SAFE_FUNCALL_CLASS_METHOD_WITH_15_ARGS, v_class, method_name, args);
        }
        if (pcase_var.eql((SubLObject)classes_utilities.SIXTEEN_INTEGER)) {
            return (SubLObject)ConsesLow.listS((SubLObject)classes_utilities.$sym209$SAFE_FUNCALL_CLASS_METHOD_WITH_16_ARGS, v_class, method_name, args);
        }
        if (pcase_var.eql((SubLObject)classes_utilities.SEVENTEEN_INTEGER)) {
            return (SubLObject)ConsesLow.listS((SubLObject)classes_utilities.$sym210$SAFE_FUNCALL_CLASS_METHOD_WITH_17_ARGS, v_class, method_name, args);
        }
        if (pcase_var.eql((SubLObject)classes_utilities.EIGHTEEN_INTEGER)) {
            return (SubLObject)ConsesLow.listS((SubLObject)classes_utilities.$sym211$SAFE_FUNCALL_CLASS_METHOD_WITH_18_ARGS, v_class, method_name, args);
        }
        if (pcase_var.eql((SubLObject)classes_utilities.NINETEEN_INTEGER)) {
            return (SubLObject)ConsesLow.listS((SubLObject)classes_utilities.$sym212$SAFE_FUNCALL_CLASS_METHOD_WITH_19_ARGS, v_class, method_name, args);
        }
        if (pcase_var.eql((SubLObject)classes_utilities.TWENTY_INTEGER)) {
            return (SubLObject)ConsesLow.listS((SubLObject)classes_utilities.$sym213$SAFE_FUNCALL_CLASS_METHOD_WITH_20_ARGS, v_class, method_name, args);
        }
        return (SubLObject)classes_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/classes-utilities.lisp", position = 34698L)
    public static SubLObject sfcm(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject v_class = (SubLObject)classes_utilities.NIL;
        SubLObject method_name = (SubLObject)classes_utilities.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)classes_utilities.$list39);
        v_class = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)classes_utilities.$list39);
        method_name = current.first();
        final SubLObject args;
        current = (args = current.rest());
        return (SubLObject)ConsesLow.listS((SubLObject)classes_utilities.$sym214$SAFE_FUNCALL_CLASS_METHOD, v_class, method_name, args);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/classes-utilities.lisp", position = 34958L)
    public static SubLObject safe_funcall_class_super_method(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject v_class = (SubLObject)classes_utilities.NIL;
        SubLObject method_name = (SubLObject)classes_utilities.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)classes_utilities.$list39);
        v_class = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)classes_utilities.$list39);
        method_name = current.first();
        final SubLObject args;
        current = (args = current.rest());
        final SubLObject pcase_var;
        final SubLObject arg_count = pcase_var = Sequences.length(args);
        if (pcase_var.eql((SubLObject)classes_utilities.ZERO_INTEGER)) {
            return (SubLObject)ConsesLow.list((SubLObject)classes_utilities.$sym215$SAFE_FUNCALL_CLASS_SUPER_METHOD_WITH_0_ARGS, v_class, method_name);
        }
        if (pcase_var.eql((SubLObject)classes_utilities.ONE_INTEGER)) {
            return (SubLObject)ConsesLow.listS((SubLObject)classes_utilities.$sym216$SAFE_FUNCALL_CLASS_SUPER_METHOD_WITH_1_ARGS, v_class, method_name, args);
        }
        if (pcase_var.eql((SubLObject)classes_utilities.TWO_INTEGER)) {
            return (SubLObject)ConsesLow.listS((SubLObject)classes_utilities.$sym217$SAFE_FUNCALL_CLASS_SUPER_METHOD_WITH_2_ARGS, v_class, method_name, args);
        }
        if (pcase_var.eql((SubLObject)classes_utilities.THREE_INTEGER)) {
            return (SubLObject)ConsesLow.listS((SubLObject)classes_utilities.$sym218$SAFE_FUNCALL_CLASS_SUPER_METHOD_WITH_3_ARGS, v_class, method_name, args);
        }
        if (pcase_var.eql((SubLObject)classes_utilities.FOUR_INTEGER)) {
            return (SubLObject)ConsesLow.listS((SubLObject)classes_utilities.$sym219$SAFE_FUNCALL_CLASS_SUPER_METHOD_WITH_4_ARGS, v_class, method_name, args);
        }
        if (pcase_var.eql((SubLObject)classes_utilities.FIVE_INTEGER)) {
            return (SubLObject)ConsesLow.listS((SubLObject)classes_utilities.$sym220$SAFE_FUNCALL_CLASS_SUPER_METHOD_WITH_5_ARGS, v_class, method_name, args);
        }
        if (pcase_var.eql((SubLObject)classes_utilities.SIX_INTEGER)) {
            return (SubLObject)ConsesLow.listS((SubLObject)classes_utilities.$sym221$SAFE_FUNCALL_CLASS_SUPER_METHOD_WITH_6_ARGS, v_class, method_name, args);
        }
        if (pcase_var.eql((SubLObject)classes_utilities.SEVEN_INTEGER)) {
            return (SubLObject)ConsesLow.listS((SubLObject)classes_utilities.$sym222$SAFE_FUNCALL_CLASS_SUPER_METHOD_WITH_7_ARGS, v_class, method_name, args);
        }
        if (pcase_var.eql((SubLObject)classes_utilities.EIGHT_INTEGER)) {
            return (SubLObject)ConsesLow.listS((SubLObject)classes_utilities.$sym223$SAFE_FUNCALL_CLASS_SUPER_METHOD_WITH_8_ARGS, v_class, method_name, args);
        }
        if (pcase_var.eql((SubLObject)classes_utilities.NINE_INTEGER)) {
            return (SubLObject)ConsesLow.listS((SubLObject)classes_utilities.$sym224$SAFE_FUNCALL_CLASS_SUPER_METHOD_WITH_9_ARGS, v_class, method_name, args);
        }
        if (pcase_var.eql((SubLObject)classes_utilities.TEN_INTEGER)) {
            return (SubLObject)ConsesLow.listS((SubLObject)classes_utilities.$sym225$SAFE_FUNCALL_CLASS_SUPER_METHOD_WITH_10_ARGS, v_class, method_name, args);
        }
        if (pcase_var.eql((SubLObject)classes_utilities.ELEVEN_INTEGER)) {
            return (SubLObject)ConsesLow.listS((SubLObject)classes_utilities.$sym226$SAFE_FUNCALL_CLASS_SUPER_METHOD_WITH_11_ARGS, v_class, method_name, args);
        }
        if (pcase_var.eql((SubLObject)classes_utilities.TWELVE_INTEGER)) {
            return (SubLObject)ConsesLow.listS((SubLObject)classes_utilities.$sym227$SAFE_FUNCALL_CLASS_SUPER_METHOD_WITH_12_ARGS, v_class, method_name, args);
        }
        if (pcase_var.eql((SubLObject)classes_utilities.THIRTEEN_INTEGER)) {
            return (SubLObject)ConsesLow.listS((SubLObject)classes_utilities.$sym228$SAFE_FUNCALL_CLASS_SUPER_METHOD_WITH_13_ARGS, v_class, method_name, args);
        }
        if (pcase_var.eql((SubLObject)classes_utilities.FOURTEEN_INTEGER)) {
            return (SubLObject)ConsesLow.listS((SubLObject)classes_utilities.$sym229$SAFE_FUNCALL_CLASS_SUPER_METHOD_WITH_14_ARGS, v_class, method_name, args);
        }
        if (pcase_var.eql((SubLObject)classes_utilities.FIFTEEN_INTEGER)) {
            return (SubLObject)ConsesLow.listS((SubLObject)classes_utilities.$sym230$SAFE_FUNCALL_CLASS_SUPER_METHOD_WITH_15_ARGS, v_class, method_name, args);
        }
        if (pcase_var.eql((SubLObject)classes_utilities.SIXTEEN_INTEGER)) {
            return (SubLObject)ConsesLow.listS((SubLObject)classes_utilities.$sym231$SAFE_FUNCALL_CLASS_SUPER_METHOD_WITH_16_ARGS, v_class, method_name, args);
        }
        if (pcase_var.eql((SubLObject)classes_utilities.SEVENTEEN_INTEGER)) {
            return (SubLObject)ConsesLow.listS((SubLObject)classes_utilities.$sym232$SAFE_FUNCALL_CLASS_SUPER_METHOD_WITH_17_ARGS, v_class, method_name, args);
        }
        if (pcase_var.eql((SubLObject)classes_utilities.EIGHTEEN_INTEGER)) {
            return (SubLObject)ConsesLow.listS((SubLObject)classes_utilities.$sym233$SAFE_FUNCALL_CLASS_SUPER_METHOD_WITH_18_ARGS, v_class, method_name, args);
        }
        if (pcase_var.eql((SubLObject)classes_utilities.NINETEEN_INTEGER)) {
            return (SubLObject)ConsesLow.listS((SubLObject)classes_utilities.$sym234$SAFE_FUNCALL_CLASS_SUPER_METHOD_WITH_19_ARGS, v_class, method_name, args);
        }
        if (pcase_var.eql((SubLObject)classes_utilities.TWENTY_INTEGER)) {
            return (SubLObject)ConsesLow.listS((SubLObject)classes_utilities.$sym235$SAFE_FUNCALL_CLASS_SUPER_METHOD_WITH_20_ARGS, v_class, method_name, args);
        }
        return (SubLObject)classes_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/classes-utilities.lisp", position = 37045L)
    public static SubLObject sfcsm(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject v_class = (SubLObject)classes_utilities.NIL;
        SubLObject method_name = (SubLObject)classes_utilities.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)classes_utilities.$list39);
        v_class = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)classes_utilities.$list39);
        method_name = current.first();
        final SubLObject args;
        current = (args = current.rest());
        return (SubLObject)ConsesLow.listS((SubLObject)classes_utilities.$sym236$SAFE_FUNCALL_CLASS_SUPER_METHOD, v_class, method_name, args);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/classes-utilities.lisp", position = 37312L)
    public static SubLObject safe_funcall_instance_method(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject instance = (SubLObject)classes_utilities.NIL;
        SubLObject method_name = (SubLObject)classes_utilities.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)classes_utilities.$list84);
        instance = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)classes_utilities.$list84);
        method_name = current.first();
        final SubLObject args;
        current = (args = current.rest());
        final SubLObject pcase_var;
        final SubLObject arg_count = pcase_var = Sequences.length(args);
        if (pcase_var.eql((SubLObject)classes_utilities.ZERO_INTEGER)) {
            return (SubLObject)ConsesLow.list((SubLObject)classes_utilities.$sym237$SAFE_FUNCALL_INSTANCE_METHOD_WITH_0_ARGS, instance, method_name);
        }
        if (pcase_var.eql((SubLObject)classes_utilities.ONE_INTEGER)) {
            return (SubLObject)ConsesLow.listS((SubLObject)classes_utilities.$sym238$SAFE_FUNCALL_INSTANCE_METHOD_WITH_1_ARGS, instance, method_name, args);
        }
        if (pcase_var.eql((SubLObject)classes_utilities.TWO_INTEGER)) {
            return (SubLObject)ConsesLow.listS((SubLObject)classes_utilities.$sym239$SAFE_FUNCALL_INSTANCE_METHOD_WITH_2_ARGS, instance, method_name, args);
        }
        if (pcase_var.eql((SubLObject)classes_utilities.THREE_INTEGER)) {
            return (SubLObject)ConsesLow.listS((SubLObject)classes_utilities.$sym240$SAFE_FUNCALL_INSTANCE_METHOD_WITH_3_ARGS, instance, method_name, args);
        }
        if (pcase_var.eql((SubLObject)classes_utilities.FOUR_INTEGER)) {
            return (SubLObject)ConsesLow.listS((SubLObject)classes_utilities.$sym241$SAFE_FUNCALL_INSTANCE_METHOD_WITH_4_ARGS, instance, method_name, args);
        }
        if (pcase_var.eql((SubLObject)classes_utilities.FIVE_INTEGER)) {
            return (SubLObject)ConsesLow.listS((SubLObject)classes_utilities.$sym242$SAFE_FUNCALL_INSTANCE_METHOD_WITH_5_ARGS, instance, method_name, args);
        }
        if (pcase_var.eql((SubLObject)classes_utilities.SIX_INTEGER)) {
            return (SubLObject)ConsesLow.listS((SubLObject)classes_utilities.$sym243$SAFE_FUNCALL_INSTANCE_METHOD_WITH_6_ARGS, instance, method_name, args);
        }
        if (pcase_var.eql((SubLObject)classes_utilities.SEVEN_INTEGER)) {
            return (SubLObject)ConsesLow.listS((SubLObject)classes_utilities.$sym244$SAFE_FUNCALL_INSTANCE_METHOD_WITH_7_ARGS, instance, method_name, args);
        }
        if (pcase_var.eql((SubLObject)classes_utilities.EIGHT_INTEGER)) {
            return (SubLObject)ConsesLow.listS((SubLObject)classes_utilities.$sym245$SAFE_FUNCALL_INSTANCE_METHOD_WITH_8_ARGS, instance, method_name, args);
        }
        if (pcase_var.eql((SubLObject)classes_utilities.NINE_INTEGER)) {
            return (SubLObject)ConsesLow.listS((SubLObject)classes_utilities.$sym246$SAFE_FUNCALL_INSTANCE_METHOD_WITH_9_ARGS, instance, method_name, args);
        }
        if (pcase_var.eql((SubLObject)classes_utilities.TEN_INTEGER)) {
            return (SubLObject)ConsesLow.listS((SubLObject)classes_utilities.$sym247$SAFE_FUNCALL_INSTANCE_METHOD_WITH_10_ARGS, instance, method_name, args);
        }
        if (pcase_var.eql((SubLObject)classes_utilities.ELEVEN_INTEGER)) {
            return (SubLObject)ConsesLow.listS((SubLObject)classes_utilities.$sym248$SAFE_FUNCALL_INSTANCE_METHOD_WITH_11_ARGS, instance, method_name, args);
        }
        if (pcase_var.eql((SubLObject)classes_utilities.TWELVE_INTEGER)) {
            return (SubLObject)ConsesLow.listS((SubLObject)classes_utilities.$sym249$SAFE_FUNCALL_INSTANCE_METHOD_WITH_12_ARGS, instance, method_name, args);
        }
        if (pcase_var.eql((SubLObject)classes_utilities.THIRTEEN_INTEGER)) {
            return (SubLObject)ConsesLow.listS((SubLObject)classes_utilities.$sym250$SAFE_FUNCALL_INSTANCE_METHOD_WITH_13_ARGS, instance, method_name, args);
        }
        if (pcase_var.eql((SubLObject)classes_utilities.FOURTEEN_INTEGER)) {
            return (SubLObject)ConsesLow.listS((SubLObject)classes_utilities.$sym251$SAFE_FUNCALL_INSTANCE_METHOD_WITH_14_ARGS, instance, method_name, args);
        }
        if (pcase_var.eql((SubLObject)classes_utilities.FIFTEEN_INTEGER)) {
            return (SubLObject)ConsesLow.listS((SubLObject)classes_utilities.$sym252$SAFE_FUNCALL_INSTANCE_METHOD_WITH_15_ARGS, instance, method_name, args);
        }
        if (pcase_var.eql((SubLObject)classes_utilities.SIXTEEN_INTEGER)) {
            return (SubLObject)ConsesLow.listS((SubLObject)classes_utilities.$sym253$SAFE_FUNCALL_INSTANCE_METHOD_WITH_16_ARGS, instance, method_name, args);
        }
        if (pcase_var.eql((SubLObject)classes_utilities.SEVENTEEN_INTEGER)) {
            return (SubLObject)ConsesLow.listS((SubLObject)classes_utilities.$sym254$SAFE_FUNCALL_INSTANCE_METHOD_WITH_17_ARGS, instance, method_name, args);
        }
        if (pcase_var.eql((SubLObject)classes_utilities.EIGHTEEN_INTEGER)) {
            return (SubLObject)ConsesLow.listS((SubLObject)classes_utilities.$sym255$SAFE_FUNCALL_INSTANCE_METHOD_WITH_18_ARGS, instance, method_name, args);
        }
        if (pcase_var.eql((SubLObject)classes_utilities.NINETEEN_INTEGER)) {
            return (SubLObject)ConsesLow.listS((SubLObject)classes_utilities.$sym256$SAFE_FUNCALL_INSTANCE_METHOD_WITH_19_ARGS, instance, method_name, args);
        }
        if (pcase_var.eql((SubLObject)classes_utilities.TWENTY_INTEGER)) {
            return (SubLObject)ConsesLow.listS((SubLObject)classes_utilities.$sym257$SAFE_FUNCALL_INSTANCE_METHOD_WITH_20_ARGS, instance, method_name, args);
        }
        return (SubLObject)classes_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/classes-utilities.lisp", position = 39399L)
    public static SubLObject sfim(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject v_class = (SubLObject)classes_utilities.NIL;
        SubLObject method_name = (SubLObject)classes_utilities.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)classes_utilities.$list39);
        v_class = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)classes_utilities.$list39);
        method_name = current.first();
        final SubLObject args;
        current = (args = current.rest());
        return (SubLObject)ConsesLow.listS((SubLObject)classes_utilities.$sym258$SAFE_FUNCALL_INSTANCE_METHOD, v_class, method_name, args);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/classes-utilities.lisp", position = 39662L)
    public static SubLObject safe_funcall_instance_super_method(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject instance = (SubLObject)classes_utilities.NIL;
        SubLObject method_name = (SubLObject)classes_utilities.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)classes_utilities.$list84);
        instance = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)classes_utilities.$list84);
        method_name = current.first();
        final SubLObject args;
        current = (args = current.rest());
        final SubLObject pcase_var;
        final SubLObject arg_count = pcase_var = Sequences.length(args);
        if (pcase_var.eql((SubLObject)classes_utilities.ZERO_INTEGER)) {
            return (SubLObject)ConsesLow.list((SubLObject)classes_utilities.$sym259$SAFE_FUNCALL_INSTANCE_SUPER_METHOD_WITH_0_ARGS, instance, method_name);
        }
        if (pcase_var.eql((SubLObject)classes_utilities.ONE_INTEGER)) {
            return (SubLObject)ConsesLow.listS((SubLObject)classes_utilities.$sym260$SAFE_FUNCALL_INSTANCE_SUPER_METHOD_WITH_1_ARGS, instance, method_name, args);
        }
        if (pcase_var.eql((SubLObject)classes_utilities.TWO_INTEGER)) {
            return (SubLObject)ConsesLow.listS((SubLObject)classes_utilities.$sym261$SAFE_FUNCALL_INSTANCE_SUPER_METHOD_WITH_2_ARGS, instance, method_name, args);
        }
        if (pcase_var.eql((SubLObject)classes_utilities.THREE_INTEGER)) {
            return (SubLObject)ConsesLow.listS((SubLObject)classes_utilities.$sym262$SAFE_FUNCALL_INSTANCE_SUPER_METHOD_WITH_3_ARGS, instance, method_name, args);
        }
        if (pcase_var.eql((SubLObject)classes_utilities.FOUR_INTEGER)) {
            return (SubLObject)ConsesLow.listS((SubLObject)classes_utilities.$sym263$SAFE_FUNCALL_INSTANCE_SUPER_METHOD_WITH_4_ARGS, instance, method_name, args);
        }
        if (pcase_var.eql((SubLObject)classes_utilities.FIVE_INTEGER)) {
            return (SubLObject)ConsesLow.listS((SubLObject)classes_utilities.$sym264$SAFE_FUNCALL_INSTANCE_SUPER_METHOD_WITH_5_ARGS, instance, method_name, args);
        }
        if (pcase_var.eql((SubLObject)classes_utilities.SIX_INTEGER)) {
            return (SubLObject)ConsesLow.listS((SubLObject)classes_utilities.$sym265$SAFE_FUNCALL_INSTANCE_SUPER_METHOD_WITH_6_ARGS, instance, method_name, args);
        }
        if (pcase_var.eql((SubLObject)classes_utilities.SEVEN_INTEGER)) {
            return (SubLObject)ConsesLow.listS((SubLObject)classes_utilities.$sym266$SAFE_FUNCALL_INSTANCE_SUPER_METHOD_WITH_7_ARGS, instance, method_name, args);
        }
        if (pcase_var.eql((SubLObject)classes_utilities.EIGHT_INTEGER)) {
            return (SubLObject)ConsesLow.listS((SubLObject)classes_utilities.$sym267$SAFE_FUNCALL_INSTANCE_SUPER_METHOD_WITH_8_ARGS, instance, method_name, args);
        }
        if (pcase_var.eql((SubLObject)classes_utilities.NINE_INTEGER)) {
            return (SubLObject)ConsesLow.listS((SubLObject)classes_utilities.$sym268$SAFE_FUNCALL_INSTANCE_SUPER_METHOD_WITH_9_ARGS, instance, method_name, args);
        }
        if (pcase_var.eql((SubLObject)classes_utilities.TEN_INTEGER)) {
            return (SubLObject)ConsesLow.listS((SubLObject)classes_utilities.$sym269$SAFE_FUNCALL_INSTANCE_SUPER_METHOD_WITH_10_ARGS, instance, method_name, args);
        }
        if (pcase_var.eql((SubLObject)classes_utilities.ELEVEN_INTEGER)) {
            return (SubLObject)ConsesLow.listS((SubLObject)classes_utilities.$sym270$SAFE_FUNCALL_INSTANCE_SUPER_METHOD_WITH_11_ARGS, instance, method_name, args);
        }
        if (pcase_var.eql((SubLObject)classes_utilities.TWELVE_INTEGER)) {
            return (SubLObject)ConsesLow.listS((SubLObject)classes_utilities.$sym271$SAFE_FUNCALL_INSTANCE_SUPER_METHOD_WITH_12_ARGS, instance, method_name, args);
        }
        if (pcase_var.eql((SubLObject)classes_utilities.THIRTEEN_INTEGER)) {
            return (SubLObject)ConsesLow.listS((SubLObject)classes_utilities.$sym272$SAFE_FUNCALL_INSTANCE_SUPER_METHOD_WITH_13_ARGS, instance, method_name, args);
        }
        if (pcase_var.eql((SubLObject)classes_utilities.FOURTEEN_INTEGER)) {
            return (SubLObject)ConsesLow.listS((SubLObject)classes_utilities.$sym273$SAFE_FUNCALL_INSTANCE_SUPER_METHOD_WITH_14_ARGS, instance, method_name, args);
        }
        if (pcase_var.eql((SubLObject)classes_utilities.FIFTEEN_INTEGER)) {
            return (SubLObject)ConsesLow.listS((SubLObject)classes_utilities.$sym274$SAFE_FUNCALL_INSTANCE_SUPER_METHOD_WITH_15_ARGS, instance, method_name, args);
        }
        if (pcase_var.eql((SubLObject)classes_utilities.SIXTEEN_INTEGER)) {
            return (SubLObject)ConsesLow.listS((SubLObject)classes_utilities.$sym275$SAFE_FUNCALL_INSTANCE_SUPER_METHOD_WITH_16_ARGS, instance, method_name, args);
        }
        if (pcase_var.eql((SubLObject)classes_utilities.SEVENTEEN_INTEGER)) {
            return (SubLObject)ConsesLow.listS((SubLObject)classes_utilities.$sym276$SAFE_FUNCALL_INSTANCE_SUPER_METHOD_WITH_17_ARGS, instance, method_name, args);
        }
        if (pcase_var.eql((SubLObject)classes_utilities.EIGHTEEN_INTEGER)) {
            return (SubLObject)ConsesLow.listS((SubLObject)classes_utilities.$sym277$SAFE_FUNCALL_INSTANCE_SUPER_METHOD_WITH_18_ARGS, instance, method_name, args);
        }
        if (pcase_var.eql((SubLObject)classes_utilities.NINETEEN_INTEGER)) {
            return (SubLObject)ConsesLow.listS((SubLObject)classes_utilities.$sym278$SAFE_FUNCALL_INSTANCE_SUPER_METHOD_WITH_19_ARGS, instance, method_name, args);
        }
        if (pcase_var.eql((SubLObject)classes_utilities.TWENTY_INTEGER)) {
            return (SubLObject)ConsesLow.listS((SubLObject)classes_utilities.$sym279$SAFE_FUNCALL_INSTANCE_SUPER_METHOD_WITH_20_ARGS, instance, method_name, args);
        }
        return (SubLObject)classes_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/classes-utilities.lisp", position = 41881L)
    public static SubLObject sfism(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject v_class = (SubLObject)classes_utilities.NIL;
        SubLObject method_name = (SubLObject)classes_utilities.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)classes_utilities.$list39);
        v_class = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)classes_utilities.$list39);
        method_name = current.first();
        final SubLObject args;
        current = (args = current.rest());
        return (SubLObject)ConsesLow.listS((SubLObject)classes_utilities.$sym280$SAFE_FUNCALL_INSTANCE_SUPER_METHOD, v_class, method_name, args);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/classes-utilities.lisp", position = 42151L)
    public static SubLObject safe_funcall_class_or_instance_method(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject instance = (SubLObject)classes_utilities.NIL;
        SubLObject method_name = (SubLObject)classes_utilities.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)classes_utilities.$list84);
        instance = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)classes_utilities.$list84);
        method_name = current.first();
        final SubLObject args;
        current = (args = current.rest());
        final SubLObject pcase_var;
        final SubLObject arg_count = pcase_var = Sequences.length(args);
        if (pcase_var.eql((SubLObject)classes_utilities.ZERO_INTEGER)) {
            return (SubLObject)ConsesLow.list((SubLObject)classes_utilities.$sym281$SAFE_FUNCALL_CLASS_OR_INSTANCE_METHOD_WITH_0_ARGS, instance, method_name);
        }
        if (pcase_var.eql((SubLObject)classes_utilities.ONE_INTEGER)) {
            return (SubLObject)ConsesLow.listS((SubLObject)classes_utilities.$sym282$SAFE_FUNCALL_CLASS_OR_INSTANCE_METHOD_WITH_1_ARGS, instance, method_name, args);
        }
        if (pcase_var.eql((SubLObject)classes_utilities.TWO_INTEGER)) {
            return (SubLObject)ConsesLow.listS((SubLObject)classes_utilities.$sym283$SAFE_FUNCALL_CLASS_OR_INSTANCE_METHOD_WITH_2_ARGS, instance, method_name, args);
        }
        if (pcase_var.eql((SubLObject)classes_utilities.THREE_INTEGER)) {
            return (SubLObject)ConsesLow.listS((SubLObject)classes_utilities.$sym284$SAFE_FUNCALL_CLASS_OR_INSTANCE_METHOD_WITH_3_ARGS, instance, method_name, args);
        }
        if (pcase_var.eql((SubLObject)classes_utilities.FOUR_INTEGER)) {
            return (SubLObject)ConsesLow.listS((SubLObject)classes_utilities.$sym285$SAFE_FUNCALL_CLASS_OR_INSTANCE_METHOD_WITH_4_ARGS, instance, method_name, args);
        }
        if (pcase_var.eql((SubLObject)classes_utilities.FIVE_INTEGER)) {
            return (SubLObject)ConsesLow.listS((SubLObject)classes_utilities.$sym286$SAFE_FUNCALL_CLASS_OR_INSTANCE_METHOD_WITH_5_ARGS, instance, method_name, args);
        }
        if (pcase_var.eql((SubLObject)classes_utilities.SIX_INTEGER)) {
            return (SubLObject)ConsesLow.listS((SubLObject)classes_utilities.$sym287$SAFE_FUNCALL_CLASS_OR_INSTANCE_METHOD_WITH_6_ARGS, instance, method_name, args);
        }
        if (pcase_var.eql((SubLObject)classes_utilities.SEVEN_INTEGER)) {
            return (SubLObject)ConsesLow.listS((SubLObject)classes_utilities.$sym288$SAFE_FUNCALL_CLASS_OR_INSTANCE_METHOD_WITH_7_ARGS, instance, method_name, args);
        }
        if (pcase_var.eql((SubLObject)classes_utilities.EIGHT_INTEGER)) {
            return (SubLObject)ConsesLow.listS((SubLObject)classes_utilities.$sym289$SAFE_FUNCALL_CLASS_OR_INSTANCE_METHOD_WITH_8_ARGS, instance, method_name, args);
        }
        if (pcase_var.eql((SubLObject)classes_utilities.NINE_INTEGER)) {
            return (SubLObject)ConsesLow.listS((SubLObject)classes_utilities.$sym290$SAFE_FUNCALL_CLASS_OR_INSTANCE_METHOD_WITH_9_ARGS, instance, method_name, args);
        }
        if (pcase_var.eql((SubLObject)classes_utilities.TEN_INTEGER)) {
            return (SubLObject)ConsesLow.listS((SubLObject)classes_utilities.$sym291$SAFE_FUNCALL_CLASS_OR_INSTANCE_METHOD_WITH_10_ARGS, instance, method_name, args);
        }
        if (pcase_var.eql((SubLObject)classes_utilities.ELEVEN_INTEGER)) {
            return (SubLObject)ConsesLow.listS((SubLObject)classes_utilities.$sym292$SAFE_FUNCALL_CLASS_OR_INSTANCE_METHOD_WITH_11_ARGS, instance, method_name, args);
        }
        if (pcase_var.eql((SubLObject)classes_utilities.TWELVE_INTEGER)) {
            return (SubLObject)ConsesLow.listS((SubLObject)classes_utilities.$sym293$SAFE_FUNCALL_CLASS_OR_INSTANCE_METHOD_WITH_12_ARGS, instance, method_name, args);
        }
        if (pcase_var.eql((SubLObject)classes_utilities.THIRTEEN_INTEGER)) {
            return (SubLObject)ConsesLow.listS((SubLObject)classes_utilities.$sym294$SAFE_FUNCALL_CLASS_OR_INSTANCE_METHOD_WITH_13_ARGS, instance, method_name, args);
        }
        if (pcase_var.eql((SubLObject)classes_utilities.FOURTEEN_INTEGER)) {
            return (SubLObject)ConsesLow.listS((SubLObject)classes_utilities.$sym295$SAFE_FUNCALL_CLASS_OR_INSTANCE_METHOD_WITH_14_ARGS, instance, method_name, args);
        }
        if (pcase_var.eql((SubLObject)classes_utilities.FIFTEEN_INTEGER)) {
            return (SubLObject)ConsesLow.listS((SubLObject)classes_utilities.$sym296$SAFE_FUNCALL_CLASS_OR_INSTANCE_METHOD_WITH_15_ARGS, instance, method_name, args);
        }
        if (pcase_var.eql((SubLObject)classes_utilities.SIXTEEN_INTEGER)) {
            return (SubLObject)ConsesLow.listS((SubLObject)classes_utilities.$sym297$SAFE_FUNCALL_CLASS_OR_INSTANCE_METHOD_WITH_16_ARGS, instance, method_name, args);
        }
        if (pcase_var.eql((SubLObject)classes_utilities.SEVENTEEN_INTEGER)) {
            return (SubLObject)ConsesLow.listS((SubLObject)classes_utilities.$sym298$SAFE_FUNCALL_CLASS_OR_INSTANCE_METHOD_WITH_17_ARGS, instance, method_name, args);
        }
        if (pcase_var.eql((SubLObject)classes_utilities.EIGHTEEN_INTEGER)) {
            return (SubLObject)ConsesLow.listS((SubLObject)classes_utilities.$sym299$SAFE_FUNCALL_CLASS_OR_INSTANCE_METHOD_WITH_18_ARGS, instance, method_name, args);
        }
        if (pcase_var.eql((SubLObject)classes_utilities.NINETEEN_INTEGER)) {
            return (SubLObject)ConsesLow.listS((SubLObject)classes_utilities.$sym300$SAFE_FUNCALL_CLASS_OR_INSTANCE_METHOD_WITH_19_ARGS, instance, method_name, args);
        }
        if (pcase_var.eql((SubLObject)classes_utilities.TWENTY_INTEGER)) {
            return (SubLObject)ConsesLow.listS((SubLObject)classes_utilities.$sym301$SAFE_FUNCALL_CLASS_OR_INSTANCE_METHOD_WITH_20_ARGS, instance, method_name, args);
        }
        return (SubLObject)classes_utilities.NIL;
    }
    
    public static SubLObject declare_classes_utilities_file() {
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.classes_utilities", "define_class_method_funcallers", "DEFINE-CLASS-METHOD-FUNCALLERS");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.classes_utilities", "define_class_super_method_funcallers", "DEFINE-CLASS-SUPER-METHOD-FUNCALLERS");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.classes_utilities", "define_instance_method_funcallers", "DEFINE-INSTANCE-METHOD-FUNCALLERS");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.classes_utilities", "define_instance_super_method_funcallers", "DEFINE-INSTANCE-SUPER-METHOD-FUNCALLERS");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.classes_utilities", "define_class_or_instance_method_funcallers", "DEFINE-CLASS-OR-INSTANCE-METHOD-FUNCALLERS");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.classes_utilities", "funcall_class_method", "FUNCALL-CLASS-METHOD");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.classes_utilities", "fcm", "FCM");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.classes_utilities", "funcall_class_super_method", "FUNCALL-CLASS-SUPER-METHOD");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.classes_utilities", "fcsm", "FCSM");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.classes_utilities", "funcall_instance_method", "FUNCALL-INSTANCE-METHOD");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.classes_utilities", "fim", "FIM");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.classes_utilities", "funcall_instance_super_method", "FUNCALL-INSTANCE-SUPER-METHOD");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.classes_utilities", "fism", "FISM");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.classes_utilities", "funcall_class_or_instance_method", "FUNCALL-CLASS-OR-INSTANCE-METHOD");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.classes_utilities", "apply_instance_method", "APPLY-INSTANCE-METHOD", 3, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.classes_utilities", "fim_nr", "FIM-NR");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.classes_utilities", "funcall_instance_method_wXo_recursion", "FUNCALL-INSTANCE-METHOD-W/O-RECURSION", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.classes_utilities", "classes_symbol_list_p", "CLASSES-SYMBOL-LIST-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.classes_utilities", "classes_npartition_list", "CLASSES-NPARTITION-LIST", 2, 2, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.classes_utilities", "classes_npartition_list_macro", "CLASSES-NPARTITION-LIST-MACRO");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.classes_utilities", "classes_check_do_classes_in_order_parameters", "CLASSES-CHECK-DO-CLASSES-IN-ORDER-PARAMETERS", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.classes_utilities", "method_bound_p", "METHOD-BOUND-P", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.classes_utilities", "valid_subloop_safe_funcaller_error_values", "VALID-SUBLOOP-SAFE-FUNCALLER-ERROR-VALUES", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.classes_utilities", "subloop_safe_funcaller_error_value_p", "SUBLOOP-SAFE-FUNCALLER-ERROR-VALUE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.classes_utilities", "encode_subloop_safe_funcaller_error_value", "ENCODE-SUBLOOP-SAFE-FUNCALLER-ERROR-VALUE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.classes_utilities", "decode_subloop_safe_funcaller_error_value", "DECODE-SUBLOOP-SAFE-FUNCALLER-ERROR-VALUE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.classes_utilities", "subloop_safe_funcaller_error_value_less_p", "SUBLOOP-SAFE-FUNCALLER-ERROR-VALUE-LESS-P", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.classes_utilities", "subloop_safe_funcaller_error_value_greater_p", "SUBLOOP-SAFE-FUNCALLER-ERROR-VALUE-GREATER-P", 2, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.classes_utilities", "define_safe_class_method_funcallers", "DEFINE-SAFE-CLASS-METHOD-FUNCALLERS");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.classes_utilities", "define_safe_class_super_method_funcallers", "DEFINE-SAFE-CLASS-SUPER-METHOD-FUNCALLERS");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.classes_utilities", "define_safe_instance_method_funcallers", "DEFINE-SAFE-INSTANCE-METHOD-FUNCALLERS");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.classes_utilities", "define_safe_instance_super_method_funcallers", "DEFINE-SAFE-INSTANCE-SUPER-METHOD-FUNCALLERS");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.classes_utilities", "define_safe_class_or_instance_method_funcallers", "DEFINE-SAFE-CLASS-OR-INSTANCE-METHOD-FUNCALLERS");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.classes_utilities", "safe_funcall_class_method", "SAFE-FUNCALL-CLASS-METHOD");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.classes_utilities", "sfcm", "SFCM");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.classes_utilities", "safe_funcall_class_super_method", "SAFE-FUNCALL-CLASS-SUPER-METHOD");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.classes_utilities", "sfcsm", "SFCSM");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.classes_utilities", "safe_funcall_instance_method", "SAFE-FUNCALL-INSTANCE-METHOD");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.classes_utilities", "sfim", "SFIM");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.classes_utilities", "safe_funcall_instance_super_method", "SAFE-FUNCALL-INSTANCE-SUPER-METHOD");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.classes_utilities", "sfism", "SFISM");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.classes_utilities", "safe_funcall_class_or_instance_method", "SAFE-FUNCALL-CLASS-OR-INSTANCE-METHOD");
        return (SubLObject)classes_utilities.NIL;
    }
    
    public static SubLObject init_classes_utilities_file() {
        classes_utilities.$classes_utilities_undefined_class_method_message$ = SubLFiles.defconstant("*CLASSES-UTILITIES-UNDEFINED-CLASS-METHOD-MESSAGE*", (SubLObject)classes_utilities.$str0$Attempt_to_invoke_the_undefined_m);
        classes_utilities.$classes_utilities_undefined_class_super_method_message$ = SubLFiles.defconstant("*CLASSES-UTILITIES-UNDEFINED-CLASS-SUPER-METHOD-MESSAGE*", (SubLObject)classes_utilities.$str1$Attempt_to_invoke_the_undefined_s);
        classes_utilities.$classes_utilities_illegal_access_message$ = SubLFiles.defconstant("*CLASSES-UTILITIES-ILLEGAL-ACCESS-MESSAGE*", (SubLObject)classes_utilities.$str2$Method__S_cannot_be_called_within);
        classes_utilities.$method_call_stack$ = SubLFiles.defparameter("*METHOD-CALL-STACK*", (SubLObject)classes_utilities.NIL);
        classes_utilities.$valid_subloop_safe_funcaller_error_values$ = SubLFiles.defconstant("*VALID-SUBLOOP-SAFE-FUNCALLER-ERROR-VALUES*", (SubLObject)classes_utilities.$list172);
        return (SubLObject)classes_utilities.NIL;
    }
    
    public static SubLObject setup_classes_utilities_file() {
        enumerations.enumerations_incorporate_definition((SubLObject)classes_utilities.$sym173$SUBLOOP_SAFE_FUNCALLER_ERROR_VALUE, (SubLObject)classes_utilities.$list172);
        return (SubLObject)classes_utilities.NIL;
    }
    
    public void declareFunctions() {
        declare_classes_utilities_file();
    }
    
    public void initializeVariables() {
        init_classes_utilities_file();
    }
    
    public void runTopLevelForms() {
        setup_classes_utilities_file();
    }
    
    static {
        me = (SubLFile)new classes_utilities();
        classes_utilities.$classes_utilities_undefined_class_method_message$ = null;
        classes_utilities.$classes_utilities_undefined_class_super_method_message$ = null;
        classes_utilities.$classes_utilities_illegal_access_message$ = null;
        classes_utilities.$method_call_stack$ = null;
        classes_utilities.$valid_subloop_safe_funcaller_error_values$ = null;
        $str0$Attempt_to_invoke_the_undefined_m = SubLObjectFactory.makeString("Attempt to invoke the undefined method ~S on class ~S failed.");
        $str1$Attempt_to_invoke_the_undefined_s = SubLObjectFactory.makeString("Attempt to invoke the undefined super method ~S on class ~S failed.");
        $str2$Method__S_cannot_be_called_within = SubLObjectFactory.makeString("Method ~S cannot be called within the scope of class ~S.");
        $list3 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NAME-TEMPLATE"), (SubLObject)SubLObjectFactory.makeSymbol("MAX-ARGS"));
        $sym4$DEFINE_PUBLIC = SubLObjectFactory.makeSymbol("DEFINE-PUBLIC");
        $sym5$CLASS_NAME_OR_CLASS = SubLObjectFactory.makeSymbol("CLASS-NAME-OR-CLASS");
        $sym6$METHOD_NAME = SubLObjectFactory.makeSymbol("METHOD-NAME");
        $sym7$CLET = SubLObjectFactory.makeSymbol("CLET");
        $list8 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLASS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SYMBOLP"), (SubLObject)SubLObjectFactory.makeSymbol("CLASS-NAME-OR-CLASS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLASSES-RETRIEVE-CLASS"), (SubLObject)SubLObjectFactory.makeSymbol("CLASS-NAME-OR-CLASS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INSTANCE-P"), (SubLObject)SubLObjectFactory.makeSymbol("CLASS-NAME-OR-CLASS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INSTANCE-CLASS"), (SubLObject)SubLObjectFactory.makeSymbol("CLASS-NAME-OR-CLASS")), (SubLObject)SubLObjectFactory.makeSymbol("CLASS-NAME-OR-CLASS")))));
        $list9 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MUST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLASS-P"), (SubLObject)SubLObjectFactory.makeSymbol("CLASS")), (SubLObject)SubLObjectFactory.makeString("FUNCALL-CLASS-METHOD: ~S is not a defined class."), (SubLObject)SubLObjectFactory.makeSymbol("CLASS-NAME-OR-CLASS"));
        $list10 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MUST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CAND"), (SubLObject)SubLObjectFactory.makeSymbol("METHOD-NAME"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SYMBOLP"), (SubLObject)SubLObjectFactory.makeSymbol("METHOD-NAME"))), (SubLObject)SubLObjectFactory.makeString("FUNCALL-CLASS-METHOD: ~S is not a method of class ~S."), (SubLObject)SubLObjectFactory.makeSymbol("METHOD-NAME"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLASS-NAME"), (SubLObject)SubLObjectFactory.makeSymbol("CLASS")));
        $list11 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("METHOD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("METHOD-ASSOC"), (SubLObject)SubLObjectFactory.makeSymbol("METHOD-NAME"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLASS-COMPILED-CLASS-METHOD-ACCESS-ALIST"), (SubLObject)SubLObjectFactory.makeSymbol("CLASS")))));
        $list12 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MUST"), (SubLObject)SubLObjectFactory.makeSymbol("METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("*CLASSES-UTILITIES-UNDEFINED-CLASS-METHOD-MESSAGE*"), (SubLObject)SubLObjectFactory.makeSymbol("METHOD-NAME"), (SubLObject)SubLObjectFactory.makeSymbol("CLASS"));
        $list13 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MUST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INSTANCES-ACCESS-CHECK-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("CLASS"), (SubLObject)SubLObjectFactory.makeSymbol("METHOD")), (SubLObject)SubLObjectFactory.makeSymbol("*CLASSES-UTILITIES-ILLEGAL-ACCESS-MESSAGE*"), (SubLObject)SubLObjectFactory.makeSymbol("METHOD-NAME"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLASS-NAME"), (SubLObject)SubLObjectFactory.makeSymbol("CLASS")));
        $sym14$RET = SubLObjectFactory.makeSymbol("RET");
        $sym15$FUNCALL = SubLObjectFactory.makeSymbol("FUNCALL");
        $list16 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("METHOD-FUNCTION-NAME"), (SubLObject)SubLObjectFactory.makeSymbol("METHOD"));
        $sym17$CLASS = SubLObjectFactory.makeSymbol("CLASS");
        $list18 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)classes_utilities.NIL));
        $str19$ARG_S = SubLObjectFactory.makeString("ARG~S");
        $sym20$PROGN = SubLObjectFactory.makeSymbol("PROGN");
        $list21 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MUST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLASS-P"), (SubLObject)SubLObjectFactory.makeSymbol("CLASS")), (SubLObject)SubLObjectFactory.makeString("FUNCALL-CLASS-SUPER-METHOD: ~S is not a defined class."), (SubLObject)SubLObjectFactory.makeSymbol("CLASS-NAME-OR-CLASS"));
        $list22 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MUST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CAND"), (SubLObject)SubLObjectFactory.makeSymbol("METHOD-NAME"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SYMBOLP"), (SubLObject)SubLObjectFactory.makeSymbol("METHOD-NAME"))), (SubLObject)SubLObjectFactory.makeString("FUNCALL-CLASS-SUPER-METHOD: ~S is not a method of class ~S."), (SubLObject)SubLObjectFactory.makeSymbol("METHOD-NAME"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLASS-NAME"), (SubLObject)SubLObjectFactory.makeSymbol("CLASS")));
        $list23 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("METHOD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("METHOD-SHADOWED-ASSOC"), (SubLObject)SubLObjectFactory.makeSymbol("METHOD-NAME"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLASS-COMPILED-CLASS-METHOD-ACCESS-ALIST"), (SubLObject)SubLObjectFactory.makeSymbol("CLASS")))));
        $list24 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MUST"), (SubLObject)SubLObjectFactory.makeSymbol("METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("*CLASSES-UTILITIES-UNDEFINED-CLASS-SUPER-METHOD-MESSAGE*"), (SubLObject)SubLObjectFactory.makeSymbol("METHOD-NAME"), (SubLObject)SubLObjectFactory.makeSymbol("CLASS"));
        $list25 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NAME-TEMPLATE"), (SubLObject)SubLObjectFactory.makeSymbol("CLASS-NAME-TEMPLATE"), (SubLObject)SubLObjectFactory.makeSymbol("MAX-ARGS"));
        $sym26$INSTANCE = SubLObjectFactory.makeSymbol("INSTANCE");
        $list27 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MUST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CAND"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INSTANCE-P"), (SubLObject)SubLObjectFactory.makeSymbol("INSTANCE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SYMBOLP"), (SubLObject)SubLObjectFactory.makeSymbol("METHOD-NAME"))), (SubLObject)SubLObjectFactory.makeString("~%FUNCALL-INSTANCE-METHOD: either instance ~S or method ~S are invalid."), (SubLObject)SubLObjectFactory.makeSymbol("INSTANCE"), (SubLObject)SubLObjectFactory.makeSymbol("METHOD-NAME"));
        $list28 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLASS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INSTANCE-CLASS"), (SubLObject)SubLObjectFactory.makeSymbol("INSTANCE"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("METHOD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GETHASH"), (SubLObject)SubLObjectFactory.makeSymbol("METHOD-NAME"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLASS-TABLIFIED-INSTANCE-METHODS"), (SubLObject)SubLObjectFactory.makeSymbol("CLASS")))));
        $sym29$PIF = SubLObjectFactory.makeSymbol("PIF");
        $sym30$METHOD = SubLObjectFactory.makeSymbol("METHOD");
        $list31 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLASS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INSTANCE-CLASS"), (SubLObject)SubLObjectFactory.makeSymbol("INSTANCE"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("METHOD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("METHOD-SHADOWED-ASSOC"), (SubLObject)SubLObjectFactory.makeSymbol("METHOD-NAME"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLASS-COMPILED-INSTANCE-METHOD-ACCESS-ALIST"), (SubLObject)SubLObjectFactory.makeSymbol("CLASS")))));
        $sym32$CLASS_OR_INSTANCE = SubLObjectFactory.makeSymbol("CLASS-OR-INSTANCE");
        $list33 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MUST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CAND"), (SubLObject)SubLObjectFactory.makeSymbol("METHOD-NAME"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SYMBOLP"), (SubLObject)SubLObjectFactory.makeSymbol("METHOD-NAME"))), (SubLObject)SubLObjectFactory.makeString("~%FUNCALL-CLASS-OR-INSTANCE-METHOD: Method ~S is invalid."), (SubLObject)SubLObjectFactory.makeSymbol("METHOD-NAME"));
        $list34 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INSTANCE-P"), (SubLObject)SubLObjectFactory.makeSymbol("CLASS-OR-INSTANCE"));
        $list35 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLASS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INSTANCE-CLASS"), (SubLObject)SubLObjectFactory.makeSymbol("CLASS-OR-INSTANCE"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("METHOD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GETHASH"), (SubLObject)SubLObjectFactory.makeSymbol("METHOD-NAME"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLASS-TABLIFIED-INSTANCE-METHODS"), (SubLObject)SubLObjectFactory.makeSymbol("CLASS")))));
        $list36 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PROGN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ERROR"), (SubLObject)SubLObjectFactory.makeString("~%FUNCALL-CLASS-OR-INSTANCE-METHOD: Method ~S is invalid."), (SubLObject)SubLObjectFactory.makeSymbol("METHOD-NAME")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)classes_utilities.NIL)));
        $list37 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLASS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLASS-P"), (SubLObject)SubLObjectFactory.makeSymbol("CLASS-OR-INSTANCE")), (SubLObject)SubLObjectFactory.makeSymbol("CLASS-OR-INSTANCE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLASSES-RETRIEVE-CLASS"), (SubLObject)SubLObjectFactory.makeSymbol("CLASS-OR-INSTANCE")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("METHOD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIF"), (SubLObject)SubLObjectFactory.makeSymbol("CLASS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("METHOD-ASSOC"), (SubLObject)SubLObjectFactory.makeSymbol("METHOD-NAME"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLASS-COMPILED-CLASS-METHOD-ACCESS-ALIST"), (SubLObject)SubLObjectFactory.makeSymbol("CLASS"))), (SubLObject)classes_utilities.NIL)));
        $list38 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MUST"), (SubLObject)SubLObjectFactory.makeSymbol("CLASS"), (SubLObject)SubLObjectFactory.makeString("FUNCALL-CLASS-OR-INSTANCE-METHOD: ~S is not a valid class."), (SubLObject)SubLObjectFactory.makeSymbol("CLASS"));
        $list39 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLASS"), (SubLObject)SubLObjectFactory.makeSymbol("METHOD-NAME"), (SubLObject)SubLObjectFactory.makeSymbol("&REST"), (SubLObject)SubLObjectFactory.makeSymbol("ARGS"));
        $sym40$FUNCALL_CLASS_METHOD_WITH_0_ARGS = SubLObjectFactory.makeSymbol("FUNCALL-CLASS-METHOD-WITH-0-ARGS");
        $sym41$FUNCALL_CLASS_METHOD_WITH_1_ARGS = SubLObjectFactory.makeSymbol("FUNCALL-CLASS-METHOD-WITH-1-ARGS");
        $sym42$FUNCALL_CLASS_METHOD_WITH_2_ARGS = SubLObjectFactory.makeSymbol("FUNCALL-CLASS-METHOD-WITH-2-ARGS");
        $sym43$FUNCALL_CLASS_METHOD_WITH_3_ARGS = SubLObjectFactory.makeSymbol("FUNCALL-CLASS-METHOD-WITH-3-ARGS");
        $sym44$FUNCALL_CLASS_METHOD_WITH_4_ARGS = SubLObjectFactory.makeSymbol("FUNCALL-CLASS-METHOD-WITH-4-ARGS");
        $sym45$FUNCALL_CLASS_METHOD_WITH_5_ARGS = SubLObjectFactory.makeSymbol("FUNCALL-CLASS-METHOD-WITH-5-ARGS");
        $sym46$FUNCALL_CLASS_METHOD_WITH_6_ARGS = SubLObjectFactory.makeSymbol("FUNCALL-CLASS-METHOD-WITH-6-ARGS");
        $sym47$FUNCALL_CLASS_METHOD_WITH_7_ARGS = SubLObjectFactory.makeSymbol("FUNCALL-CLASS-METHOD-WITH-7-ARGS");
        $sym48$FUNCALL_CLASS_METHOD_WITH_8_ARGS = SubLObjectFactory.makeSymbol("FUNCALL-CLASS-METHOD-WITH-8-ARGS");
        $sym49$FUNCALL_CLASS_METHOD_WITH_9_ARGS = SubLObjectFactory.makeSymbol("FUNCALL-CLASS-METHOD-WITH-9-ARGS");
        $sym50$FUNCALL_CLASS_METHOD_WITH_10_ARGS = SubLObjectFactory.makeSymbol("FUNCALL-CLASS-METHOD-WITH-10-ARGS");
        $sym51$FUNCALL_CLASS_METHOD_WITH_11_ARGS = SubLObjectFactory.makeSymbol("FUNCALL-CLASS-METHOD-WITH-11-ARGS");
        $sym52$FUNCALL_CLASS_METHOD_WITH_12_ARGS = SubLObjectFactory.makeSymbol("FUNCALL-CLASS-METHOD-WITH-12-ARGS");
        $sym53$FUNCALL_CLASS_METHOD_WITH_13_ARGS = SubLObjectFactory.makeSymbol("FUNCALL-CLASS-METHOD-WITH-13-ARGS");
        $sym54$FUNCALL_CLASS_METHOD_WITH_14_ARGS = SubLObjectFactory.makeSymbol("FUNCALL-CLASS-METHOD-WITH-14-ARGS");
        $sym55$FUNCALL_CLASS_METHOD_WITH_15_ARGS = SubLObjectFactory.makeSymbol("FUNCALL-CLASS-METHOD-WITH-15-ARGS");
        $sym56$FUNCALL_CLASS_METHOD_WITH_16_ARGS = SubLObjectFactory.makeSymbol("FUNCALL-CLASS-METHOD-WITH-16-ARGS");
        $sym57$FUNCALL_CLASS_METHOD_WITH_17_ARGS = SubLObjectFactory.makeSymbol("FUNCALL-CLASS-METHOD-WITH-17-ARGS");
        $sym58$FUNCALL_CLASS_METHOD_WITH_18_ARGS = SubLObjectFactory.makeSymbol("FUNCALL-CLASS-METHOD-WITH-18-ARGS");
        $sym59$FUNCALL_CLASS_METHOD_WITH_19_ARGS = SubLObjectFactory.makeSymbol("FUNCALL-CLASS-METHOD-WITH-19-ARGS");
        $sym60$FUNCALL_CLASS_METHOD_WITH_20_ARGS = SubLObjectFactory.makeSymbol("FUNCALL-CLASS-METHOD-WITH-20-ARGS");
        $sym61$FUNCALL_CLASS_METHOD = SubLObjectFactory.makeSymbol("FUNCALL-CLASS-METHOD");
        $sym62$FUNCALL_CLASS_SUPER_METHOD_WITH_0_ARGS = SubLObjectFactory.makeSymbol("FUNCALL-CLASS-SUPER-METHOD-WITH-0-ARGS");
        $sym63$FUNCALL_CLASS_SUPER_METHOD_WITH_1_ARGS = SubLObjectFactory.makeSymbol("FUNCALL-CLASS-SUPER-METHOD-WITH-1-ARGS");
        $sym64$FUNCALL_CLASS_SUPER_METHOD_WITH_2_ARGS = SubLObjectFactory.makeSymbol("FUNCALL-CLASS-SUPER-METHOD-WITH-2-ARGS");
        $sym65$FUNCALL_CLASS_SUPER_METHOD_WITH_3_ARGS = SubLObjectFactory.makeSymbol("FUNCALL-CLASS-SUPER-METHOD-WITH-3-ARGS");
        $sym66$FUNCALL_CLASS_SUPER_METHOD_WITH_4_ARGS = SubLObjectFactory.makeSymbol("FUNCALL-CLASS-SUPER-METHOD-WITH-4-ARGS");
        $sym67$FUNCALL_CLASS_SUPER_METHOD_WITH_5_ARGS = SubLObjectFactory.makeSymbol("FUNCALL-CLASS-SUPER-METHOD-WITH-5-ARGS");
        $sym68$FUNCALL_CLASS_SUPER_METHOD_WITH_6_ARGS = SubLObjectFactory.makeSymbol("FUNCALL-CLASS-SUPER-METHOD-WITH-6-ARGS");
        $sym69$FUNCALL_CLASS_SUPER_METHOD_WITH_7_ARGS = SubLObjectFactory.makeSymbol("FUNCALL-CLASS-SUPER-METHOD-WITH-7-ARGS");
        $sym70$FUNCALL_CLASS_SUPER_METHOD_WITH_8_ARGS = SubLObjectFactory.makeSymbol("FUNCALL-CLASS-SUPER-METHOD-WITH-8-ARGS");
        $sym71$FUNCALL_CLASS_SUPER_METHOD_WITH_9_ARGS = SubLObjectFactory.makeSymbol("FUNCALL-CLASS-SUPER-METHOD-WITH-9-ARGS");
        $sym72$FUNCALL_CLASS_SUPER_METHOD_WITH_10_ARGS = SubLObjectFactory.makeSymbol("FUNCALL-CLASS-SUPER-METHOD-WITH-10-ARGS");
        $sym73$FUNCALL_CLASS_SUPER_METHOD_WITH_11_ARGS = SubLObjectFactory.makeSymbol("FUNCALL-CLASS-SUPER-METHOD-WITH-11-ARGS");
        $sym74$FUNCALL_CLASS_SUPER_METHOD_WITH_12_ARGS = SubLObjectFactory.makeSymbol("FUNCALL-CLASS-SUPER-METHOD-WITH-12-ARGS");
        $sym75$FUNCALL_CLASS_SUPER_METHOD_WITH_13_ARGS = SubLObjectFactory.makeSymbol("FUNCALL-CLASS-SUPER-METHOD-WITH-13-ARGS");
        $sym76$FUNCALL_CLASS_SUPER_METHOD_WITH_14_ARGS = SubLObjectFactory.makeSymbol("FUNCALL-CLASS-SUPER-METHOD-WITH-14-ARGS");
        $sym77$FUNCALL_CLASS_SUPER_METHOD_WITH_15_ARGS = SubLObjectFactory.makeSymbol("FUNCALL-CLASS-SUPER-METHOD-WITH-15-ARGS");
        $sym78$FUNCALL_CLASS_SUPER_METHOD_WITH_16_ARGS = SubLObjectFactory.makeSymbol("FUNCALL-CLASS-SUPER-METHOD-WITH-16-ARGS");
        $sym79$FUNCALL_CLASS_SUPER_METHOD_WITH_17_ARGS = SubLObjectFactory.makeSymbol("FUNCALL-CLASS-SUPER-METHOD-WITH-17-ARGS");
        $sym80$FUNCALL_CLASS_SUPER_METHOD_WITH_18_ARGS = SubLObjectFactory.makeSymbol("FUNCALL-CLASS-SUPER-METHOD-WITH-18-ARGS");
        $sym81$FUNCALL_CLASS_SUPER_METHOD_WITH_19_ARGS = SubLObjectFactory.makeSymbol("FUNCALL-CLASS-SUPER-METHOD-WITH-19-ARGS");
        $sym82$FUNCALL_CLASS_SUPER_METHOD_WITH_20_ARGS = SubLObjectFactory.makeSymbol("FUNCALL-CLASS-SUPER-METHOD-WITH-20-ARGS");
        $sym83$FUNCALL_CLASS_SUPER_METHOD = SubLObjectFactory.makeSymbol("FUNCALL-CLASS-SUPER-METHOD");
        $list84 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INSTANCE"), (SubLObject)SubLObjectFactory.makeSymbol("METHOD-NAME"), (SubLObject)SubLObjectFactory.makeSymbol("&REST"), (SubLObject)SubLObjectFactory.makeSymbol("ARGS"));
        $sym85$FUNCALL_INSTANCE_METHOD_WITH_0_ARGS = SubLObjectFactory.makeSymbol("FUNCALL-INSTANCE-METHOD-WITH-0-ARGS");
        $sym86$FUNCALL_INSTANCE_METHOD_WITH_1_ARGS = SubLObjectFactory.makeSymbol("FUNCALL-INSTANCE-METHOD-WITH-1-ARGS");
        $sym87$FUNCALL_INSTANCE_METHOD_WITH_2_ARGS = SubLObjectFactory.makeSymbol("FUNCALL-INSTANCE-METHOD-WITH-2-ARGS");
        $sym88$FUNCALL_INSTANCE_METHOD_WITH_3_ARGS = SubLObjectFactory.makeSymbol("FUNCALL-INSTANCE-METHOD-WITH-3-ARGS");
        $sym89$FUNCALL_INSTANCE_METHOD_WITH_4_ARGS = SubLObjectFactory.makeSymbol("FUNCALL-INSTANCE-METHOD-WITH-4-ARGS");
        $sym90$FUNCALL_INSTANCE_METHOD_WITH_5_ARGS = SubLObjectFactory.makeSymbol("FUNCALL-INSTANCE-METHOD-WITH-5-ARGS");
        $sym91$FUNCALL_INSTANCE_METHOD_WITH_6_ARGS = SubLObjectFactory.makeSymbol("FUNCALL-INSTANCE-METHOD-WITH-6-ARGS");
        $sym92$FUNCALL_INSTANCE_METHOD_WITH_7_ARGS = SubLObjectFactory.makeSymbol("FUNCALL-INSTANCE-METHOD-WITH-7-ARGS");
        $sym93$FUNCALL_INSTANCE_METHOD_WITH_8_ARGS = SubLObjectFactory.makeSymbol("FUNCALL-INSTANCE-METHOD-WITH-8-ARGS");
        $sym94$FUNCALL_INSTANCE_METHOD_WITH_9_ARGS = SubLObjectFactory.makeSymbol("FUNCALL-INSTANCE-METHOD-WITH-9-ARGS");
        $sym95$FUNCALL_INSTANCE_METHOD_WITH_10_ARGS = SubLObjectFactory.makeSymbol("FUNCALL-INSTANCE-METHOD-WITH-10-ARGS");
        $sym96$FUNCALL_INSTANCE_METHOD_WITH_11_ARGS = SubLObjectFactory.makeSymbol("FUNCALL-INSTANCE-METHOD-WITH-11-ARGS");
        $sym97$FUNCALL_INSTANCE_METHOD_WITH_12_ARGS = SubLObjectFactory.makeSymbol("FUNCALL-INSTANCE-METHOD-WITH-12-ARGS");
        $sym98$FUNCALL_INSTANCE_METHOD_WITH_13_ARGS = SubLObjectFactory.makeSymbol("FUNCALL-INSTANCE-METHOD-WITH-13-ARGS");
        $sym99$FUNCALL_INSTANCE_METHOD_WITH_14_ARGS = SubLObjectFactory.makeSymbol("FUNCALL-INSTANCE-METHOD-WITH-14-ARGS");
        $sym100$FUNCALL_INSTANCE_METHOD_WITH_15_ARGS = SubLObjectFactory.makeSymbol("FUNCALL-INSTANCE-METHOD-WITH-15-ARGS");
        $sym101$FUNCALL_INSTANCE_METHOD_WITH_16_ARGS = SubLObjectFactory.makeSymbol("FUNCALL-INSTANCE-METHOD-WITH-16-ARGS");
        $sym102$FUNCALL_INSTANCE_METHOD_WITH_17_ARGS = SubLObjectFactory.makeSymbol("FUNCALL-INSTANCE-METHOD-WITH-17-ARGS");
        $sym103$FUNCALL_INSTANCE_METHOD_WITH_18_ARGS = SubLObjectFactory.makeSymbol("FUNCALL-INSTANCE-METHOD-WITH-18-ARGS");
        $sym104$FUNCALL_INSTANCE_METHOD_WITH_19_ARGS = SubLObjectFactory.makeSymbol("FUNCALL-INSTANCE-METHOD-WITH-19-ARGS");
        $sym105$FUNCALL_INSTANCE_METHOD_WITH_20_ARGS = SubLObjectFactory.makeSymbol("FUNCALL-INSTANCE-METHOD-WITH-20-ARGS");
        $sym106$FUNCALL_INSTANCE_METHOD = SubLObjectFactory.makeSymbol("FUNCALL-INSTANCE-METHOD");
        $sym107$FUNCALL_INSTANCE_SUPER_METHOD_WITH_0_ARGS = SubLObjectFactory.makeSymbol("FUNCALL-INSTANCE-SUPER-METHOD-WITH-0-ARGS");
        $sym108$FUNCALL_INSTANCE_SUPER_METHOD_WITH_1_ARGS = SubLObjectFactory.makeSymbol("FUNCALL-INSTANCE-SUPER-METHOD-WITH-1-ARGS");
        $sym109$FUNCALL_INSTANCE_SUPER_METHOD_WITH_2_ARGS = SubLObjectFactory.makeSymbol("FUNCALL-INSTANCE-SUPER-METHOD-WITH-2-ARGS");
        $sym110$FUNCALL_INSTANCE_SUPER_METHOD_WITH_3_ARGS = SubLObjectFactory.makeSymbol("FUNCALL-INSTANCE-SUPER-METHOD-WITH-3-ARGS");
        $sym111$FUNCALL_INSTANCE_SUPER_METHOD_WITH_4_ARGS = SubLObjectFactory.makeSymbol("FUNCALL-INSTANCE-SUPER-METHOD-WITH-4-ARGS");
        $sym112$FUNCALL_INSTANCE_SUPER_METHOD_WITH_5_ARGS = SubLObjectFactory.makeSymbol("FUNCALL-INSTANCE-SUPER-METHOD-WITH-5-ARGS");
        $sym113$FUNCALL_INSTANCE_SUPER_METHOD_WITH_6_ARGS = SubLObjectFactory.makeSymbol("FUNCALL-INSTANCE-SUPER-METHOD-WITH-6-ARGS");
        $sym114$FUNCALL_INSTANCE_SUPER_METHOD_WITH_7_ARGS = SubLObjectFactory.makeSymbol("FUNCALL-INSTANCE-SUPER-METHOD-WITH-7-ARGS");
        $sym115$FUNCALL_INSTANCE_SUPER_METHOD_WITH_8_ARGS = SubLObjectFactory.makeSymbol("FUNCALL-INSTANCE-SUPER-METHOD-WITH-8-ARGS");
        $sym116$FUNCALL_INSTANCE_SUPER_METHOD_WITH_9_ARGS = SubLObjectFactory.makeSymbol("FUNCALL-INSTANCE-SUPER-METHOD-WITH-9-ARGS");
        $sym117$FUNCALL_INSTANCE_SUPER_METHOD_WITH_10_ARGS = SubLObjectFactory.makeSymbol("FUNCALL-INSTANCE-SUPER-METHOD-WITH-10-ARGS");
        $sym118$FUNCALL_INSTANCE_SUPER_METHOD_WITH_11_ARGS = SubLObjectFactory.makeSymbol("FUNCALL-INSTANCE-SUPER-METHOD-WITH-11-ARGS");
        $sym119$FUNCALL_INSTANCE_SUPER_METHOD_WITH_12_ARGS = SubLObjectFactory.makeSymbol("FUNCALL-INSTANCE-SUPER-METHOD-WITH-12-ARGS");
        $sym120$FUNCALL_INSTANCE_SUPER_METHOD_WITH_13_ARGS = SubLObjectFactory.makeSymbol("FUNCALL-INSTANCE-SUPER-METHOD-WITH-13-ARGS");
        $sym121$FUNCALL_INSTANCE_SUPER_METHOD_WITH_14_ARGS = SubLObjectFactory.makeSymbol("FUNCALL-INSTANCE-SUPER-METHOD-WITH-14-ARGS");
        $sym122$FUNCALL_INSTANCE_SUPER_METHOD_WITH_15_ARGS = SubLObjectFactory.makeSymbol("FUNCALL-INSTANCE-SUPER-METHOD-WITH-15-ARGS");
        $sym123$FUNCALL_INSTANCE_SUPER_METHOD_WITH_16_ARGS = SubLObjectFactory.makeSymbol("FUNCALL-INSTANCE-SUPER-METHOD-WITH-16-ARGS");
        $sym124$FUNCALL_INSTANCE_SUPER_METHOD_WITH_17_ARGS = SubLObjectFactory.makeSymbol("FUNCALL-INSTANCE-SUPER-METHOD-WITH-17-ARGS");
        $sym125$FUNCALL_INSTANCE_SUPER_METHOD_WITH_18_ARGS = SubLObjectFactory.makeSymbol("FUNCALL-INSTANCE-SUPER-METHOD-WITH-18-ARGS");
        $sym126$FUNCALL_INSTANCE_SUPER_METHOD_WITH_19_ARGS = SubLObjectFactory.makeSymbol("FUNCALL-INSTANCE-SUPER-METHOD-WITH-19-ARGS");
        $sym127$FUNCALL_INSTANCE_SUPER_METHOD_WITH_20_ARGS = SubLObjectFactory.makeSymbol("FUNCALL-INSTANCE-SUPER-METHOD-WITH-20-ARGS");
        $sym128$FUNCALL_INSTANCE_SUPER_METHOD = SubLObjectFactory.makeSymbol("FUNCALL-INSTANCE-SUPER-METHOD");
        $sym129$FUNCALL_CLASS_OR_INSTANCE_METHOD_WITH_0_ARGS = SubLObjectFactory.makeSymbol("FUNCALL-CLASS-OR-INSTANCE-METHOD-WITH-0-ARGS");
        $sym130$FUNCALL_CLASS_OR_INSTANCE_METHOD_WITH_1_ARGS = SubLObjectFactory.makeSymbol("FUNCALL-CLASS-OR-INSTANCE-METHOD-WITH-1-ARGS");
        $sym131$FUNCALL_CLASS_OR_INSTANCE_METHOD_WITH_2_ARGS = SubLObjectFactory.makeSymbol("FUNCALL-CLASS-OR-INSTANCE-METHOD-WITH-2-ARGS");
        $sym132$FUNCALL_CLASS_OR_INSTANCE_METHOD_WITH_3_ARGS = SubLObjectFactory.makeSymbol("FUNCALL-CLASS-OR-INSTANCE-METHOD-WITH-3-ARGS");
        $sym133$FUNCALL_CLASS_OR_INSTANCE_METHOD_WITH_4_ARGS = SubLObjectFactory.makeSymbol("FUNCALL-CLASS-OR-INSTANCE-METHOD-WITH-4-ARGS");
        $sym134$FUNCALL_CLASS_OR_INSTANCE_METHOD_WITH_5_ARGS = SubLObjectFactory.makeSymbol("FUNCALL-CLASS-OR-INSTANCE-METHOD-WITH-5-ARGS");
        $sym135$FUNCALL_CLASS_OR_INSTANCE_METHOD_WITH_6_ARGS = SubLObjectFactory.makeSymbol("FUNCALL-CLASS-OR-INSTANCE-METHOD-WITH-6-ARGS");
        $sym136$FUNCALL_CLASS_OR_INSTANCE_METHOD_WITH_7_ARGS = SubLObjectFactory.makeSymbol("FUNCALL-CLASS-OR-INSTANCE-METHOD-WITH-7-ARGS");
        $sym137$FUNCALL_CLASS_OR_INSTANCE_METHOD_WITH_8_ARGS = SubLObjectFactory.makeSymbol("FUNCALL-CLASS-OR-INSTANCE-METHOD-WITH-8-ARGS");
        $sym138$FUNCALL_CLASS_OR_INSTANCE_METHOD_WITH_9_ARGS = SubLObjectFactory.makeSymbol("FUNCALL-CLASS-OR-INSTANCE-METHOD-WITH-9-ARGS");
        $sym139$FUNCALL_CLASS_OR_INSTANCE_METHOD_WITH_10_ARGS = SubLObjectFactory.makeSymbol("FUNCALL-CLASS-OR-INSTANCE-METHOD-WITH-10-ARGS");
        $sym140$FUNCALL_CLASS_OR_INSTANCE_METHOD_WITH_11_ARGS = SubLObjectFactory.makeSymbol("FUNCALL-CLASS-OR-INSTANCE-METHOD-WITH-11-ARGS");
        $sym141$FUNCALL_CLASS_OR_INSTANCE_METHOD_WITH_12_ARGS = SubLObjectFactory.makeSymbol("FUNCALL-CLASS-OR-INSTANCE-METHOD-WITH-12-ARGS");
        $sym142$FUNCALL_CLASS_OR_INSTANCE_METHOD_WITH_13_ARGS = SubLObjectFactory.makeSymbol("FUNCALL-CLASS-OR-INSTANCE-METHOD-WITH-13-ARGS");
        $sym143$FUNCALL_CLASS_OR_INSTANCE_METHOD_WITH_14_ARGS = SubLObjectFactory.makeSymbol("FUNCALL-CLASS-OR-INSTANCE-METHOD-WITH-14-ARGS");
        $sym144$FUNCALL_CLASS_OR_INSTANCE_METHOD_WITH_15_ARGS = SubLObjectFactory.makeSymbol("FUNCALL-CLASS-OR-INSTANCE-METHOD-WITH-15-ARGS");
        $sym145$FUNCALL_CLASS_OR_INSTANCE_METHOD_WITH_16_ARGS = SubLObjectFactory.makeSymbol("FUNCALL-CLASS-OR-INSTANCE-METHOD-WITH-16-ARGS");
        $sym146$FUNCALL_CLASS_OR_INSTANCE_METHOD_WITH_17_ARGS = SubLObjectFactory.makeSymbol("FUNCALL-CLASS-OR-INSTANCE-METHOD-WITH-17-ARGS");
        $sym147$FUNCALL_CLASS_OR_INSTANCE_METHOD_WITH_18_ARGS = SubLObjectFactory.makeSymbol("FUNCALL-CLASS-OR-INSTANCE-METHOD-WITH-18-ARGS");
        $sym148$FUNCALL_CLASS_OR_INSTANCE_METHOD_WITH_19_ARGS = SubLObjectFactory.makeSymbol("FUNCALL-CLASS-OR-INSTANCE-METHOD-WITH-19-ARGS");
        $sym149$FUNCALL_CLASS_OR_INSTANCE_METHOD_WITH_20_ARGS = SubLObjectFactory.makeSymbol("FUNCALL-CLASS-OR-INSTANCE-METHOD-WITH-20-ARGS");
        $str150$APPLY_INSTANCE_METHOD__either_ins = SubLObjectFactory.makeString("APPLY-INSTANCE-METHOD: either instance ~S or method ~S are invalid.");
        $str151$APPLY_INSTANCE_METHOD__No__S_meth = SubLObjectFactory.makeString("APPLY-INSTANCE-METHOD: No ~S method is associated with the class ~S of instance ~S.");
        $sym152$FUNCALL_INSTANCE_METHOD_W_O_RECURSION = SubLObjectFactory.makeSymbol("FUNCALL-INSTANCE-METHOD-W/O-RECURSION");
        $sym153$CAR = SubLObjectFactory.makeSymbol("CAR");
        $sym154$_ = SubLObjectFactory.makeSymbol("=");
        $sym155$STRING_EQUAL = SubLObjectFactory.makeSymbol("STRING-EQUAL");
        $list156 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SETTABLE-MATCH-LOC"), (SubLObject)SubLObjectFactory.makeSymbol("SETTABLE-NO-MATCH-LOC")), (SubLObject)SubLObjectFactory.makeSymbol("ITEM"), (SubLObject)SubLObjectFactory.makeSymbol("SEQUENCE"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("KEY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)classes_utilities.IDENTITY)), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TEST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)classes_utilities.EQ)));
        $str157$item = SubLObjectFactory.makeString("item");
        $str158$match_list = SubLObjectFactory.makeString("match-list");
        $str159$not_match_list = SubLObjectFactory.makeString("not-match-list");
        $str160$element = SubLObjectFactory.makeString("element");
        $str161$sublist = SubLObjectFactory.makeString("sublist");
        $list162 = ConsesLow.list((SubLObject)classes_utilities.NIL);
        $sym163$CDOLIST_AND_SUBLISTS_CAREFULLY = SubLObjectFactory.makeSymbol("CDOLIST-AND-SUBLISTS-CAREFULLY");
        $sym164$RPLACD = SubLObjectFactory.makeSymbol("RPLACD");
        $sym165$CSETQ = SubLObjectFactory.makeSymbol("CSETQ");
        $sym166$CSETF = SubLObjectFactory.makeSymbol("CSETF");
        $sym167$NREVERSE = SubLObjectFactory.makeSymbol("NREVERSE");
        $str168$DO_CLASSES_IN_ORDER___S_is_not_a_ = SubLObjectFactory.makeString("DO-CLASSES-IN-ORDER: ~S is not a legal variable.  A non nil symbol was expected.");
        $str169$DO_CLASSES_IN_ORDER___S_is_not_a_ = SubLObjectFactory.makeString("DO-CLASSES-IN-ORDER: ~S is not a legal optional extension for a listed depth var.~%~\n     A listed non null symbol or nil was expected.");
        $str170$DO_CLASSES_IN_ORDER___S_is_not_a_ = SubLObjectFactory.makeString("DO-CLASSES-IN-ORDER: ~S is not a legal body.");
        $str171$Class__A_not_recognized_ = SubLObjectFactory.makeString("Class ~A not recognized.");
        $list172 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TARGET-NOT-A-CLASS"), (SubLObject)SubLObjectFactory.makeKeyword("TARGET-NOT-AN-INSTANCE"), (SubLObject)SubLObjectFactory.makeKeyword("TARGET-METHOD-CONFLICT"), (SubLObject)SubLObjectFactory.makeKeyword("ACCESS-LEVEL-CONFLICT"), (SubLObject)SubLObjectFactory.makeKeyword("INVALID-METHOD-NAME"), (SubLObject)SubLObjectFactory.makeKeyword("UNDECLARED-METHOD"), (SubLObject)SubLObjectFactory.makeKeyword("UNDEFINED-METHOD"));
        $sym173$SUBLOOP_SAFE_FUNCALLER_ERROR_VALUE = SubLObjectFactory.makeSymbol("SUBLOOP-SAFE-FUNCALLER-ERROR-VALUE");
        $str174$_S___S_is_not_a_member_of_the__S_ = SubLObjectFactory.makeString("~S: ~S is not a member of the ~S enumeration.");
        $sym175$ENCODE_SUBLOOP_SAFE_FUNCALLER_ERROR_VALUE = SubLObjectFactory.makeSymbol("ENCODE-SUBLOOP-SAFE-FUNCALLER-ERROR-VALUE");
        $str176$_S___S_is_not_a_valid_encoding_of = SubLObjectFactory.makeString("~S: ~S is not a valid encoding of the ~S enumeration.");
        $sym177$DECODE_SUBLOOP_SAFE_FUNCALLER_ERROR_VALUE = SubLObjectFactory.makeSymbol("DECODE-SUBLOOP-SAFE-FUNCALLER-ERROR-VALUE");
        $str178$_S___S_was_expected_to_be_a_membe = SubLObjectFactory.makeString("~S: ~S was expected to be a member of the enumeration ~S.");
        $sym179$SUBLOOP_SAFE_FUNCALLER_ERROR_VALUE_P = SubLObjectFactory.makeSymbol("SUBLOOP-SAFE-FUNCALLER-ERROR-VALUE-P");
        $list180 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PUNLESS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLASS-P"), (SubLObject)SubLObjectFactory.makeSymbol("CLASS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("VALUES"), (SubLObject)classes_utilities.NIL, (SubLObject)SubLObjectFactory.makeKeyword("TARGET-NOT-A-CLASS"))));
        $list181 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PUNLESS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CAND"), (SubLObject)SubLObjectFactory.makeSymbol("METHOD-NAME"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SYMBOLP"), (SubLObject)SubLObjectFactory.makeSymbol("METHOD-NAME"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("VALUES"), (SubLObject)classes_utilities.NIL, (SubLObject)SubLObjectFactory.makeKeyword("INVALID-METHOD-NAME"))));
        $list182 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PUNLESS"), (SubLObject)SubLObjectFactory.makeSymbol("METHOD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("VALUES"), (SubLObject)classes_utilities.NIL, (SubLObject)SubLObjectFactory.makeKeyword("UNDECLARED-METHOD"))));
        $list183 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PUNLESS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INSTANCES-ACCESS-CHECK-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("CLASS"), (SubLObject)SubLObjectFactory.makeSymbol("METHOD")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("VALUES"), (SubLObject)classes_utilities.NIL, (SubLObject)SubLObjectFactory.makeKeyword("ACCESS-LEVEL-CONFLICT"))));
        $list184 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCTION-REF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("METHOD-FUNCTION-NAME"), (SubLObject)SubLObjectFactory.makeSymbol("METHOD"))));
        $list185 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PUNLESS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FBOUNDP"), (SubLObject)SubLObjectFactory.makeSymbol("FUNCTION-REF")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("VALUES"), (SubLObject)classes_utilities.NIL, (SubLObject)SubLObjectFactory.makeKeyword("UNDEFINED-METHOD"))));
        $sym186$VALUES = SubLObjectFactory.makeSymbol("VALUES");
        $sym187$FUNCTION_REF = SubLObjectFactory.makeSymbol("FUNCTION-REF");
        $list188 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PUNLESS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INSTANCE-P"), (SubLObject)SubLObjectFactory.makeSymbol("INSTANCE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("VALUES"), (SubLObject)classes_utilities.NIL, (SubLObject)SubLObjectFactory.makeKeyword("TARGET-NOT-AN-INSTANCE"))));
        $list189 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PUNLESS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SYMBOLP"), (SubLObject)SubLObjectFactory.makeSymbol("METHOD-NAME")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("VALUES"), (SubLObject)classes_utilities.NIL, (SubLObject)SubLObjectFactory.makeKeyword("INVALID-METHOD-NAME"))));
        $list190 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("VALUES"), (SubLObject)classes_utilities.NIL, (SubLObject)SubLObjectFactory.makeKeyword("UNDECLARED-METHOD"))));
        $list191 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PUNLESS"), (SubLObject)SubLObjectFactory.makeSymbol("METHOD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("VALUES"), (SubLObject)classes_utilities.NIL, (SubLObject)SubLObjectFactory.makeKeyword("UNDECLARED-METHOD")));
        $list192 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PUNLESS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INSTANCES-ACCESS-CHECK-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("CLASS"), (SubLObject)SubLObjectFactory.makeSymbol("METHOD")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("VALUES"), (SubLObject)classes_utilities.NIL, (SubLObject)SubLObjectFactory.makeKeyword("ACCESS-LEVEL-CONFLICT")));
        $sym193$SAFE_FUNCALL_CLASS_METHOD_WITH_0_ARGS = SubLObjectFactory.makeSymbol("SAFE-FUNCALL-CLASS-METHOD-WITH-0-ARGS");
        $sym194$SAFE_FUNCALL_CLASS_METHOD_WITH_1_ARGS = SubLObjectFactory.makeSymbol("SAFE-FUNCALL-CLASS-METHOD-WITH-1-ARGS");
        $sym195$SAFE_FUNCALL_CLASS_METHOD_WITH_2_ARGS = SubLObjectFactory.makeSymbol("SAFE-FUNCALL-CLASS-METHOD-WITH-2-ARGS");
        $sym196$SAFE_FUNCALL_CLASS_METHOD_WITH_3_ARGS = SubLObjectFactory.makeSymbol("SAFE-FUNCALL-CLASS-METHOD-WITH-3-ARGS");
        $sym197$SAFE_FUNCALL_CLASS_METHOD_WITH_4_ARGS = SubLObjectFactory.makeSymbol("SAFE-FUNCALL-CLASS-METHOD-WITH-4-ARGS");
        $sym198$SAFE_FUNCALL_CLASS_METHOD_WITH_5_ARGS = SubLObjectFactory.makeSymbol("SAFE-FUNCALL-CLASS-METHOD-WITH-5-ARGS");
        $sym199$SAFE_FUNCALL_CLASS_METHOD_WITH_6_ARGS = SubLObjectFactory.makeSymbol("SAFE-FUNCALL-CLASS-METHOD-WITH-6-ARGS");
        $sym200$SAFE_FUNCALL_CLASS_METHOD_WITH_7_ARGS = SubLObjectFactory.makeSymbol("SAFE-FUNCALL-CLASS-METHOD-WITH-7-ARGS");
        $sym201$SAFE_FUNCALL_CLASS_METHOD_WITH_8_ARGS = SubLObjectFactory.makeSymbol("SAFE-FUNCALL-CLASS-METHOD-WITH-8-ARGS");
        $sym202$SAFE_FUNCALL_CLASS_METHOD_WITH_9_ARGS = SubLObjectFactory.makeSymbol("SAFE-FUNCALL-CLASS-METHOD-WITH-9-ARGS");
        $sym203$SAFE_FUNCALL_CLASS_METHOD_WITH_10_ARGS = SubLObjectFactory.makeSymbol("SAFE-FUNCALL-CLASS-METHOD-WITH-10-ARGS");
        $sym204$SAFE_FUNCALL_CLASS_METHOD_WITH_11_ARGS = SubLObjectFactory.makeSymbol("SAFE-FUNCALL-CLASS-METHOD-WITH-11-ARGS");
        $sym205$SAFE_FUNCALL_CLASS_METHOD_WITH_12_ARGS = SubLObjectFactory.makeSymbol("SAFE-FUNCALL-CLASS-METHOD-WITH-12-ARGS");
        $sym206$SAFE_FUNCALL_CLASS_METHOD_WITH_13_ARGS = SubLObjectFactory.makeSymbol("SAFE-FUNCALL-CLASS-METHOD-WITH-13-ARGS");
        $sym207$SAFE_FUNCALL_CLASS_METHOD_WITH_14_ARGS = SubLObjectFactory.makeSymbol("SAFE-FUNCALL-CLASS-METHOD-WITH-14-ARGS");
        $sym208$SAFE_FUNCALL_CLASS_METHOD_WITH_15_ARGS = SubLObjectFactory.makeSymbol("SAFE-FUNCALL-CLASS-METHOD-WITH-15-ARGS");
        $sym209$SAFE_FUNCALL_CLASS_METHOD_WITH_16_ARGS = SubLObjectFactory.makeSymbol("SAFE-FUNCALL-CLASS-METHOD-WITH-16-ARGS");
        $sym210$SAFE_FUNCALL_CLASS_METHOD_WITH_17_ARGS = SubLObjectFactory.makeSymbol("SAFE-FUNCALL-CLASS-METHOD-WITH-17-ARGS");
        $sym211$SAFE_FUNCALL_CLASS_METHOD_WITH_18_ARGS = SubLObjectFactory.makeSymbol("SAFE-FUNCALL-CLASS-METHOD-WITH-18-ARGS");
        $sym212$SAFE_FUNCALL_CLASS_METHOD_WITH_19_ARGS = SubLObjectFactory.makeSymbol("SAFE-FUNCALL-CLASS-METHOD-WITH-19-ARGS");
        $sym213$SAFE_FUNCALL_CLASS_METHOD_WITH_20_ARGS = SubLObjectFactory.makeSymbol("SAFE-FUNCALL-CLASS-METHOD-WITH-20-ARGS");
        $sym214$SAFE_FUNCALL_CLASS_METHOD = SubLObjectFactory.makeSymbol("SAFE-FUNCALL-CLASS-METHOD");
        $sym215$SAFE_FUNCALL_CLASS_SUPER_METHOD_WITH_0_ARGS = SubLObjectFactory.makeSymbol("SAFE-FUNCALL-CLASS-SUPER-METHOD-WITH-0-ARGS");
        $sym216$SAFE_FUNCALL_CLASS_SUPER_METHOD_WITH_1_ARGS = SubLObjectFactory.makeSymbol("SAFE-FUNCALL-CLASS-SUPER-METHOD-WITH-1-ARGS");
        $sym217$SAFE_FUNCALL_CLASS_SUPER_METHOD_WITH_2_ARGS = SubLObjectFactory.makeSymbol("SAFE-FUNCALL-CLASS-SUPER-METHOD-WITH-2-ARGS");
        $sym218$SAFE_FUNCALL_CLASS_SUPER_METHOD_WITH_3_ARGS = SubLObjectFactory.makeSymbol("SAFE-FUNCALL-CLASS-SUPER-METHOD-WITH-3-ARGS");
        $sym219$SAFE_FUNCALL_CLASS_SUPER_METHOD_WITH_4_ARGS = SubLObjectFactory.makeSymbol("SAFE-FUNCALL-CLASS-SUPER-METHOD-WITH-4-ARGS");
        $sym220$SAFE_FUNCALL_CLASS_SUPER_METHOD_WITH_5_ARGS = SubLObjectFactory.makeSymbol("SAFE-FUNCALL-CLASS-SUPER-METHOD-WITH-5-ARGS");
        $sym221$SAFE_FUNCALL_CLASS_SUPER_METHOD_WITH_6_ARGS = SubLObjectFactory.makeSymbol("SAFE-FUNCALL-CLASS-SUPER-METHOD-WITH-6-ARGS");
        $sym222$SAFE_FUNCALL_CLASS_SUPER_METHOD_WITH_7_ARGS = SubLObjectFactory.makeSymbol("SAFE-FUNCALL-CLASS-SUPER-METHOD-WITH-7-ARGS");
        $sym223$SAFE_FUNCALL_CLASS_SUPER_METHOD_WITH_8_ARGS = SubLObjectFactory.makeSymbol("SAFE-FUNCALL-CLASS-SUPER-METHOD-WITH-8-ARGS");
        $sym224$SAFE_FUNCALL_CLASS_SUPER_METHOD_WITH_9_ARGS = SubLObjectFactory.makeSymbol("SAFE-FUNCALL-CLASS-SUPER-METHOD-WITH-9-ARGS");
        $sym225$SAFE_FUNCALL_CLASS_SUPER_METHOD_WITH_10_ARGS = SubLObjectFactory.makeSymbol("SAFE-FUNCALL-CLASS-SUPER-METHOD-WITH-10-ARGS");
        $sym226$SAFE_FUNCALL_CLASS_SUPER_METHOD_WITH_11_ARGS = SubLObjectFactory.makeSymbol("SAFE-FUNCALL-CLASS-SUPER-METHOD-WITH-11-ARGS");
        $sym227$SAFE_FUNCALL_CLASS_SUPER_METHOD_WITH_12_ARGS = SubLObjectFactory.makeSymbol("SAFE-FUNCALL-CLASS-SUPER-METHOD-WITH-12-ARGS");
        $sym228$SAFE_FUNCALL_CLASS_SUPER_METHOD_WITH_13_ARGS = SubLObjectFactory.makeSymbol("SAFE-FUNCALL-CLASS-SUPER-METHOD-WITH-13-ARGS");
        $sym229$SAFE_FUNCALL_CLASS_SUPER_METHOD_WITH_14_ARGS = SubLObjectFactory.makeSymbol("SAFE-FUNCALL-CLASS-SUPER-METHOD-WITH-14-ARGS");
        $sym230$SAFE_FUNCALL_CLASS_SUPER_METHOD_WITH_15_ARGS = SubLObjectFactory.makeSymbol("SAFE-FUNCALL-CLASS-SUPER-METHOD-WITH-15-ARGS");
        $sym231$SAFE_FUNCALL_CLASS_SUPER_METHOD_WITH_16_ARGS = SubLObjectFactory.makeSymbol("SAFE-FUNCALL-CLASS-SUPER-METHOD-WITH-16-ARGS");
        $sym232$SAFE_FUNCALL_CLASS_SUPER_METHOD_WITH_17_ARGS = SubLObjectFactory.makeSymbol("SAFE-FUNCALL-CLASS-SUPER-METHOD-WITH-17-ARGS");
        $sym233$SAFE_FUNCALL_CLASS_SUPER_METHOD_WITH_18_ARGS = SubLObjectFactory.makeSymbol("SAFE-FUNCALL-CLASS-SUPER-METHOD-WITH-18-ARGS");
        $sym234$SAFE_FUNCALL_CLASS_SUPER_METHOD_WITH_19_ARGS = SubLObjectFactory.makeSymbol("SAFE-FUNCALL-CLASS-SUPER-METHOD-WITH-19-ARGS");
        $sym235$SAFE_FUNCALL_CLASS_SUPER_METHOD_WITH_20_ARGS = SubLObjectFactory.makeSymbol("SAFE-FUNCALL-CLASS-SUPER-METHOD-WITH-20-ARGS");
        $sym236$SAFE_FUNCALL_CLASS_SUPER_METHOD = SubLObjectFactory.makeSymbol("SAFE-FUNCALL-CLASS-SUPER-METHOD");
        $sym237$SAFE_FUNCALL_INSTANCE_METHOD_WITH_0_ARGS = SubLObjectFactory.makeSymbol("SAFE-FUNCALL-INSTANCE-METHOD-WITH-0-ARGS");
        $sym238$SAFE_FUNCALL_INSTANCE_METHOD_WITH_1_ARGS = SubLObjectFactory.makeSymbol("SAFE-FUNCALL-INSTANCE-METHOD-WITH-1-ARGS");
        $sym239$SAFE_FUNCALL_INSTANCE_METHOD_WITH_2_ARGS = SubLObjectFactory.makeSymbol("SAFE-FUNCALL-INSTANCE-METHOD-WITH-2-ARGS");
        $sym240$SAFE_FUNCALL_INSTANCE_METHOD_WITH_3_ARGS = SubLObjectFactory.makeSymbol("SAFE-FUNCALL-INSTANCE-METHOD-WITH-3-ARGS");
        $sym241$SAFE_FUNCALL_INSTANCE_METHOD_WITH_4_ARGS = SubLObjectFactory.makeSymbol("SAFE-FUNCALL-INSTANCE-METHOD-WITH-4-ARGS");
        $sym242$SAFE_FUNCALL_INSTANCE_METHOD_WITH_5_ARGS = SubLObjectFactory.makeSymbol("SAFE-FUNCALL-INSTANCE-METHOD-WITH-5-ARGS");
        $sym243$SAFE_FUNCALL_INSTANCE_METHOD_WITH_6_ARGS = SubLObjectFactory.makeSymbol("SAFE-FUNCALL-INSTANCE-METHOD-WITH-6-ARGS");
        $sym244$SAFE_FUNCALL_INSTANCE_METHOD_WITH_7_ARGS = SubLObjectFactory.makeSymbol("SAFE-FUNCALL-INSTANCE-METHOD-WITH-7-ARGS");
        $sym245$SAFE_FUNCALL_INSTANCE_METHOD_WITH_8_ARGS = SubLObjectFactory.makeSymbol("SAFE-FUNCALL-INSTANCE-METHOD-WITH-8-ARGS");
        $sym246$SAFE_FUNCALL_INSTANCE_METHOD_WITH_9_ARGS = SubLObjectFactory.makeSymbol("SAFE-FUNCALL-INSTANCE-METHOD-WITH-9-ARGS");
        $sym247$SAFE_FUNCALL_INSTANCE_METHOD_WITH_10_ARGS = SubLObjectFactory.makeSymbol("SAFE-FUNCALL-INSTANCE-METHOD-WITH-10-ARGS");
        $sym248$SAFE_FUNCALL_INSTANCE_METHOD_WITH_11_ARGS = SubLObjectFactory.makeSymbol("SAFE-FUNCALL-INSTANCE-METHOD-WITH-11-ARGS");
        $sym249$SAFE_FUNCALL_INSTANCE_METHOD_WITH_12_ARGS = SubLObjectFactory.makeSymbol("SAFE-FUNCALL-INSTANCE-METHOD-WITH-12-ARGS");
        $sym250$SAFE_FUNCALL_INSTANCE_METHOD_WITH_13_ARGS = SubLObjectFactory.makeSymbol("SAFE-FUNCALL-INSTANCE-METHOD-WITH-13-ARGS");
        $sym251$SAFE_FUNCALL_INSTANCE_METHOD_WITH_14_ARGS = SubLObjectFactory.makeSymbol("SAFE-FUNCALL-INSTANCE-METHOD-WITH-14-ARGS");
        $sym252$SAFE_FUNCALL_INSTANCE_METHOD_WITH_15_ARGS = SubLObjectFactory.makeSymbol("SAFE-FUNCALL-INSTANCE-METHOD-WITH-15-ARGS");
        $sym253$SAFE_FUNCALL_INSTANCE_METHOD_WITH_16_ARGS = SubLObjectFactory.makeSymbol("SAFE-FUNCALL-INSTANCE-METHOD-WITH-16-ARGS");
        $sym254$SAFE_FUNCALL_INSTANCE_METHOD_WITH_17_ARGS = SubLObjectFactory.makeSymbol("SAFE-FUNCALL-INSTANCE-METHOD-WITH-17-ARGS");
        $sym255$SAFE_FUNCALL_INSTANCE_METHOD_WITH_18_ARGS = SubLObjectFactory.makeSymbol("SAFE-FUNCALL-INSTANCE-METHOD-WITH-18-ARGS");
        $sym256$SAFE_FUNCALL_INSTANCE_METHOD_WITH_19_ARGS = SubLObjectFactory.makeSymbol("SAFE-FUNCALL-INSTANCE-METHOD-WITH-19-ARGS");
        $sym257$SAFE_FUNCALL_INSTANCE_METHOD_WITH_20_ARGS = SubLObjectFactory.makeSymbol("SAFE-FUNCALL-INSTANCE-METHOD-WITH-20-ARGS");
        $sym258$SAFE_FUNCALL_INSTANCE_METHOD = SubLObjectFactory.makeSymbol("SAFE-FUNCALL-INSTANCE-METHOD");
        $sym259$SAFE_FUNCALL_INSTANCE_SUPER_METHOD_WITH_0_ARGS = SubLObjectFactory.makeSymbol("SAFE-FUNCALL-INSTANCE-SUPER-METHOD-WITH-0-ARGS");
        $sym260$SAFE_FUNCALL_INSTANCE_SUPER_METHOD_WITH_1_ARGS = SubLObjectFactory.makeSymbol("SAFE-FUNCALL-INSTANCE-SUPER-METHOD-WITH-1-ARGS");
        $sym261$SAFE_FUNCALL_INSTANCE_SUPER_METHOD_WITH_2_ARGS = SubLObjectFactory.makeSymbol("SAFE-FUNCALL-INSTANCE-SUPER-METHOD-WITH-2-ARGS");
        $sym262$SAFE_FUNCALL_INSTANCE_SUPER_METHOD_WITH_3_ARGS = SubLObjectFactory.makeSymbol("SAFE-FUNCALL-INSTANCE-SUPER-METHOD-WITH-3-ARGS");
        $sym263$SAFE_FUNCALL_INSTANCE_SUPER_METHOD_WITH_4_ARGS = SubLObjectFactory.makeSymbol("SAFE-FUNCALL-INSTANCE-SUPER-METHOD-WITH-4-ARGS");
        $sym264$SAFE_FUNCALL_INSTANCE_SUPER_METHOD_WITH_5_ARGS = SubLObjectFactory.makeSymbol("SAFE-FUNCALL-INSTANCE-SUPER-METHOD-WITH-5-ARGS");
        $sym265$SAFE_FUNCALL_INSTANCE_SUPER_METHOD_WITH_6_ARGS = SubLObjectFactory.makeSymbol("SAFE-FUNCALL-INSTANCE-SUPER-METHOD-WITH-6-ARGS");
        $sym266$SAFE_FUNCALL_INSTANCE_SUPER_METHOD_WITH_7_ARGS = SubLObjectFactory.makeSymbol("SAFE-FUNCALL-INSTANCE-SUPER-METHOD-WITH-7-ARGS");
        $sym267$SAFE_FUNCALL_INSTANCE_SUPER_METHOD_WITH_8_ARGS = SubLObjectFactory.makeSymbol("SAFE-FUNCALL-INSTANCE-SUPER-METHOD-WITH-8-ARGS");
        $sym268$SAFE_FUNCALL_INSTANCE_SUPER_METHOD_WITH_9_ARGS = SubLObjectFactory.makeSymbol("SAFE-FUNCALL-INSTANCE-SUPER-METHOD-WITH-9-ARGS");
        $sym269$SAFE_FUNCALL_INSTANCE_SUPER_METHOD_WITH_10_ARGS = SubLObjectFactory.makeSymbol("SAFE-FUNCALL-INSTANCE-SUPER-METHOD-WITH-10-ARGS");
        $sym270$SAFE_FUNCALL_INSTANCE_SUPER_METHOD_WITH_11_ARGS = SubLObjectFactory.makeSymbol("SAFE-FUNCALL-INSTANCE-SUPER-METHOD-WITH-11-ARGS");
        $sym271$SAFE_FUNCALL_INSTANCE_SUPER_METHOD_WITH_12_ARGS = SubLObjectFactory.makeSymbol("SAFE-FUNCALL-INSTANCE-SUPER-METHOD-WITH-12-ARGS");
        $sym272$SAFE_FUNCALL_INSTANCE_SUPER_METHOD_WITH_13_ARGS = SubLObjectFactory.makeSymbol("SAFE-FUNCALL-INSTANCE-SUPER-METHOD-WITH-13-ARGS");
        $sym273$SAFE_FUNCALL_INSTANCE_SUPER_METHOD_WITH_14_ARGS = SubLObjectFactory.makeSymbol("SAFE-FUNCALL-INSTANCE-SUPER-METHOD-WITH-14-ARGS");
        $sym274$SAFE_FUNCALL_INSTANCE_SUPER_METHOD_WITH_15_ARGS = SubLObjectFactory.makeSymbol("SAFE-FUNCALL-INSTANCE-SUPER-METHOD-WITH-15-ARGS");
        $sym275$SAFE_FUNCALL_INSTANCE_SUPER_METHOD_WITH_16_ARGS = SubLObjectFactory.makeSymbol("SAFE-FUNCALL-INSTANCE-SUPER-METHOD-WITH-16-ARGS");
        $sym276$SAFE_FUNCALL_INSTANCE_SUPER_METHOD_WITH_17_ARGS = SubLObjectFactory.makeSymbol("SAFE-FUNCALL-INSTANCE-SUPER-METHOD-WITH-17-ARGS");
        $sym277$SAFE_FUNCALL_INSTANCE_SUPER_METHOD_WITH_18_ARGS = SubLObjectFactory.makeSymbol("SAFE-FUNCALL-INSTANCE-SUPER-METHOD-WITH-18-ARGS");
        $sym278$SAFE_FUNCALL_INSTANCE_SUPER_METHOD_WITH_19_ARGS = SubLObjectFactory.makeSymbol("SAFE-FUNCALL-INSTANCE-SUPER-METHOD-WITH-19-ARGS");
        $sym279$SAFE_FUNCALL_INSTANCE_SUPER_METHOD_WITH_20_ARGS = SubLObjectFactory.makeSymbol("SAFE-FUNCALL-INSTANCE-SUPER-METHOD-WITH-20-ARGS");
        $sym280$SAFE_FUNCALL_INSTANCE_SUPER_METHOD = SubLObjectFactory.makeSymbol("SAFE-FUNCALL-INSTANCE-SUPER-METHOD");
        $sym281$SAFE_FUNCALL_CLASS_OR_INSTANCE_METHOD_WITH_0_ARGS = SubLObjectFactory.makeSymbol("SAFE-FUNCALL-CLASS-OR-INSTANCE-METHOD-WITH-0-ARGS");
        $sym282$SAFE_FUNCALL_CLASS_OR_INSTANCE_METHOD_WITH_1_ARGS = SubLObjectFactory.makeSymbol("SAFE-FUNCALL-CLASS-OR-INSTANCE-METHOD-WITH-1-ARGS");
        $sym283$SAFE_FUNCALL_CLASS_OR_INSTANCE_METHOD_WITH_2_ARGS = SubLObjectFactory.makeSymbol("SAFE-FUNCALL-CLASS-OR-INSTANCE-METHOD-WITH-2-ARGS");
        $sym284$SAFE_FUNCALL_CLASS_OR_INSTANCE_METHOD_WITH_3_ARGS = SubLObjectFactory.makeSymbol("SAFE-FUNCALL-CLASS-OR-INSTANCE-METHOD-WITH-3-ARGS");
        $sym285$SAFE_FUNCALL_CLASS_OR_INSTANCE_METHOD_WITH_4_ARGS = SubLObjectFactory.makeSymbol("SAFE-FUNCALL-CLASS-OR-INSTANCE-METHOD-WITH-4-ARGS");
        $sym286$SAFE_FUNCALL_CLASS_OR_INSTANCE_METHOD_WITH_5_ARGS = SubLObjectFactory.makeSymbol("SAFE-FUNCALL-CLASS-OR-INSTANCE-METHOD-WITH-5-ARGS");
        $sym287$SAFE_FUNCALL_CLASS_OR_INSTANCE_METHOD_WITH_6_ARGS = SubLObjectFactory.makeSymbol("SAFE-FUNCALL-CLASS-OR-INSTANCE-METHOD-WITH-6-ARGS");
        $sym288$SAFE_FUNCALL_CLASS_OR_INSTANCE_METHOD_WITH_7_ARGS = SubLObjectFactory.makeSymbol("SAFE-FUNCALL-CLASS-OR-INSTANCE-METHOD-WITH-7-ARGS");
        $sym289$SAFE_FUNCALL_CLASS_OR_INSTANCE_METHOD_WITH_8_ARGS = SubLObjectFactory.makeSymbol("SAFE-FUNCALL-CLASS-OR-INSTANCE-METHOD-WITH-8-ARGS");
        $sym290$SAFE_FUNCALL_CLASS_OR_INSTANCE_METHOD_WITH_9_ARGS = SubLObjectFactory.makeSymbol("SAFE-FUNCALL-CLASS-OR-INSTANCE-METHOD-WITH-9-ARGS");
        $sym291$SAFE_FUNCALL_CLASS_OR_INSTANCE_METHOD_WITH_10_ARGS = SubLObjectFactory.makeSymbol("SAFE-FUNCALL-CLASS-OR-INSTANCE-METHOD-WITH-10-ARGS");
        $sym292$SAFE_FUNCALL_CLASS_OR_INSTANCE_METHOD_WITH_11_ARGS = SubLObjectFactory.makeSymbol("SAFE-FUNCALL-CLASS-OR-INSTANCE-METHOD-WITH-11-ARGS");
        $sym293$SAFE_FUNCALL_CLASS_OR_INSTANCE_METHOD_WITH_12_ARGS = SubLObjectFactory.makeSymbol("SAFE-FUNCALL-CLASS-OR-INSTANCE-METHOD-WITH-12-ARGS");
        $sym294$SAFE_FUNCALL_CLASS_OR_INSTANCE_METHOD_WITH_13_ARGS = SubLObjectFactory.makeSymbol("SAFE-FUNCALL-CLASS-OR-INSTANCE-METHOD-WITH-13-ARGS");
        $sym295$SAFE_FUNCALL_CLASS_OR_INSTANCE_METHOD_WITH_14_ARGS = SubLObjectFactory.makeSymbol("SAFE-FUNCALL-CLASS-OR-INSTANCE-METHOD-WITH-14-ARGS");
        $sym296$SAFE_FUNCALL_CLASS_OR_INSTANCE_METHOD_WITH_15_ARGS = SubLObjectFactory.makeSymbol("SAFE-FUNCALL-CLASS-OR-INSTANCE-METHOD-WITH-15-ARGS");
        $sym297$SAFE_FUNCALL_CLASS_OR_INSTANCE_METHOD_WITH_16_ARGS = SubLObjectFactory.makeSymbol("SAFE-FUNCALL-CLASS-OR-INSTANCE-METHOD-WITH-16-ARGS");
        $sym298$SAFE_FUNCALL_CLASS_OR_INSTANCE_METHOD_WITH_17_ARGS = SubLObjectFactory.makeSymbol("SAFE-FUNCALL-CLASS-OR-INSTANCE-METHOD-WITH-17-ARGS");
        $sym299$SAFE_FUNCALL_CLASS_OR_INSTANCE_METHOD_WITH_18_ARGS = SubLObjectFactory.makeSymbol("SAFE-FUNCALL-CLASS-OR-INSTANCE-METHOD-WITH-18-ARGS");
        $sym300$SAFE_FUNCALL_CLASS_OR_INSTANCE_METHOD_WITH_19_ARGS = SubLObjectFactory.makeSymbol("SAFE-FUNCALL-CLASS-OR-INSTANCE-METHOD-WITH-19-ARGS");
        $sym301$SAFE_FUNCALL_CLASS_OR_INSTANCE_METHOD_WITH_20_ARGS = SubLObjectFactory.makeSymbol("SAFE-FUNCALL-CLASS-OR-INSTANCE-METHOD-WITH-20-ARGS");
    }
}

/*

	Total time: 552 ms
	
*/