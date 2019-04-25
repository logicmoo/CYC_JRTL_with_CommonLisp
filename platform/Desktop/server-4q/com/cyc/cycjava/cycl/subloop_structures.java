package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Packages;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class subloop_structures extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.subloop_structures";
    public static final String myFingerPrint = "f04f0b8e7475cdf199586418a2765ffe66dda06b089d44ab98ff1dc678fa508e";
    @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 885L)
    public static SubLSymbol $dtp_class$;
    @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 4726L)
    public static SubLSymbol $dtp_instance$;
    @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 5418L)
    public static SubLSymbol $dtp_interface$;
    @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 7014L)
    public static SubLSymbol $dtp_method$;
    @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 8178L)
    private static SubLSymbol $methods_initial_hashtable_size$;
    @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 8732L)
    public static SubLSymbol $method_trace_on$;
    @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 8772L)
    public static SubLSymbol $methods_current_method_trace$;
    @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 8832L)
    public static SubLSymbol $dtp_method_trace$;
    @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 10175L)
    public static SubLSymbol $dtp_method_info$;
    @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 10988L)
    public static SubLSymbol $dtp_slot_listener$;
    @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 12529L)
    public static SubLSymbol $dtp_slot_listener_registry$;
    @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 13718L)
    public static SubLSymbol $dtp_method_listener$;
    @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 14768L)
    public static SubLSymbol $dtp_function_detail$;
    @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 15413L)
    public static SubLSymbol $dtp_method_detail$;
    @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 16099L)
    public static SubLSymbol $dtp_method_listener_registry$;
    private static final SubLSymbol $sym0$CLASS;
    private static final SubLSymbol $sym1$CLASS_P;
    private static final SubLList $list2;
    private static final SubLList $list3;
    private static final SubLList $list4;
    private static final SubLList $list5;
    private static final SubLSymbol $sym6$PRINT_CLASS;
    private static final SubLInteger $int7$21;
    private static final SubLInteger $int8$22;
    private static final SubLInteger $int9$23;
    private static final SubLInteger $int10$24;
    private static final SubLInteger $int11$25;
    private static final SubLInteger $int12$26;
    private static final SubLInteger $int13$27;
    private static final SubLInteger $int14$28;
    private static final SubLInteger $int15$29;
    private static final SubLSymbol $sym16$CLASS_PRINT_FUNCTION_TRAMPOLINE;
    private static final SubLList $list17;
    private static final SubLSymbol $sym18$CLASS_NAME;
    private static final SubLSymbol $sym19$_CSETF_CLASS_NAME;
    private static final SubLSymbol $sym20$CLASS_PARENT;
    private static final SubLSymbol $sym21$_CSETF_CLASS_PARENT;
    private static final SubLSymbol $sym22$CLASS_SUBCLASSES;
    private static final SubLSymbol $sym23$_CSETF_CLASS_SUBCLASSES;
    private static final SubLSymbol $sym24$CLASS_INTERFACE_NAMES;
    private static final SubLSymbol $sym25$_CSETF_CLASS_INTERFACE_NAMES;
    private static final SubLSymbol $sym26$CLASS_INTERFACES;
    private static final SubLSymbol $sym27$_CSETF_CLASS_INTERFACES;
    private static final SubLSymbol $sym28$CLASS_COMPILED_INHERITANCE_PATH;
    private static final SubLSymbol $sym29$_CSETF_CLASS_COMPILED_INHERITANCE_PATH;
    private static final SubLSymbol $sym30$CLASS_INSTANCE_VAR_DECLS;
    private static final SubLSymbol $sym31$_CSETF_CLASS_INSTANCE_VAR_DECLS;
    private static final SubLSymbol $sym32$CLASS_CLASS_VAR_DECLS;
    private static final SubLSymbol $sym33$_CSETF_CLASS_CLASS_VAR_DECLS;
    private static final SubLSymbol $sym34$CLASS_COMPILED_INSTANCE_SLOT_ACCESS_ALIST;
    private static final SubLSymbol $sym35$_CSETF_CLASS_COMPILED_INSTANCE_SLOT_ACCESS_ALIST;
    private static final SubLSymbol $sym36$CLASS_COMPILED_INSTANCE_BOOLEAN_SLOT_ACCESS_ALIST;
    private static final SubLSymbol $sym37$_CSETF_CLASS_COMPILED_INSTANCE_BOOLEAN_SLOT_ACCESS_ALIST;
    private static final SubLSymbol $sym38$CLASS_COMPILED_CLASS_SLOT_ACCESS_ALIST;
    private static final SubLSymbol $sym39$_CSETF_CLASS_COMPILED_CLASS_SLOT_ACCESS_ALIST;
    private static final SubLSymbol $sym40$CLASS_COMPILED_CLASS_BOOLEAN_SLOT_ACCESS_ALIST;
    private static final SubLSymbol $sym41$_CSETF_CLASS_COMPILED_CLASS_BOOLEAN_SLOT_ACCESS_ALIST;
    private static final SubLSymbol $sym42$CLASS_SLOT_ACCESSOR_ALIST;
    private static final SubLSymbol $sym43$_CSETF_CLASS_SLOT_ACCESSOR_ALIST;
    private static final SubLSymbol $sym44$CLASS_INSTANCE_METHOD_DECLS;
    private static final SubLSymbol $sym45$_CSETF_CLASS_INSTANCE_METHOD_DECLS;
    private static final SubLSymbol $sym46$CLASS_CLASS_METHOD_DECLS;
    private static final SubLSymbol $sym47$_CSETF_CLASS_CLASS_METHOD_DECLS;
    private static final SubLSymbol $sym48$CLASS_BOOLEAN_SLOTS;
    private static final SubLSymbol $sym49$_CSETF_CLASS_BOOLEAN_SLOTS;
    private static final SubLSymbol $sym50$CLASS_ANY_SLOTS;
    private static final SubLSymbol $sym51$_CSETF_CLASS_ANY_SLOTS;
    private static final SubLSymbol $sym52$CLASS_COMPILED_INSTANCE_METHOD_ACCESS_ALIST;
    private static final SubLSymbol $sym53$_CSETF_CLASS_COMPILED_INSTANCE_METHOD_ACCESS_ALIST;
    private static final SubLSymbol $sym54$CLASS_COMPILED_CLASS_METHOD_ACCESS_ALIST;
    private static final SubLSymbol $sym55$_CSETF_CLASS_COMPILED_CLASS_METHOD_ACCESS_ALIST;
    private static final SubLSymbol $sym56$CLASS_TABLIFIED_INSTANCE_METHODS;
    private static final SubLSymbol $sym57$_CSETF_CLASS_TABLIFIED_INSTANCE_METHODS;
    private static final SubLSymbol $sym58$CLASS_DEFINITION_LOCK;
    private static final SubLSymbol $sym59$_CSETF_CLASS_DEFINITION_LOCK;
    private static final SubLSymbol $sym60$CLASS_ACCESS_LOCK;
    private static final SubLSymbol $sym61$_CSETF_CLASS_ACCESS_LOCK;
    private static final SubLSymbol $sym62$CLASS_SYNCHRONIZED_SLOTS_P;
    private static final SubLSymbol $sym63$_CSETF_CLASS_SYNCHRONIZED_SLOTS_P;
    private static final SubLSymbol $sym64$CLASS_PLIST;
    private static final SubLSymbol $sym65$_CSETF_CLASS_PLIST;
    private static final SubLSymbol $sym66$CLASS_CLASS_INITIALIZATION_FUNCTION;
    private static final SubLSymbol $sym67$_CSETF_CLASS_CLASS_INITIALIZATION_FUNCTION;
    private static final SubLSymbol $sym68$CLASS_CLASS_INITIALIZED_P;
    private static final SubLSymbol $sym69$_CSETF_CLASS_CLASS_INITIALIZED_P;
    private static final SubLSymbol $sym70$CLASS_INSTANCE_INITIALIZATION_FUNCTION;
    private static final SubLSymbol $sym71$_CSETF_CLASS_INSTANCE_INITIALIZATION_FUNCTION;
    private static final SubLSymbol $sym72$CLASS_CLASS_PROPERTIES;
    private static final SubLSymbol $sym73$_CSETF_CLASS_CLASS_PROPERTIES;
    private static final SubLSymbol $kw74$NAME;
    private static final SubLSymbol $kw75$PARENT;
    private static final SubLSymbol $kw76$SUBCLASSES;
    private static final SubLSymbol $kw77$INTERFACE_NAMES;
    private static final SubLSymbol $kw78$INTERFACES;
    private static final SubLSymbol $kw79$COMPILED_INHERITANCE_PATH;
    private static final SubLSymbol $kw80$INSTANCE_VAR_DECLS;
    private static final SubLSymbol $kw81$CLASS_VAR_DECLS;
    private static final SubLSymbol $kw82$COMPILED_INSTANCE_SLOT_ACCESS_ALIST;
    private static final SubLSymbol $kw83$COMPILED_INSTANCE_BOOLEAN_SLOT_ACCESS_ALIST;
    private static final SubLSymbol $kw84$COMPILED_CLASS_SLOT_ACCESS_ALIST;
    private static final SubLSymbol $kw85$COMPILED_CLASS_BOOLEAN_SLOT_ACCESS_ALIST;
    private static final SubLSymbol $kw86$SLOT_ACCESSOR_ALIST;
    private static final SubLSymbol $kw87$INSTANCE_METHOD_DECLS;
    private static final SubLSymbol $kw88$CLASS_METHOD_DECLS;
    private static final SubLSymbol $kw89$BOOLEAN_SLOTS;
    private static final SubLSymbol $kw90$ANY_SLOTS;
    private static final SubLSymbol $kw91$COMPILED_INSTANCE_METHOD_ACCESS_ALIST;
    private static final SubLSymbol $kw92$COMPILED_CLASS_METHOD_ACCESS_ALIST;
    private static final SubLSymbol $kw93$TABLIFIED_INSTANCE_METHODS;
    private static final SubLSymbol $kw94$DEFINITION_LOCK;
    private static final SubLSymbol $kw95$ACCESS_LOCK;
    private static final SubLSymbol $kw96$SYNCHRONIZED_SLOTS_P;
    private static final SubLSymbol $kw97$PLIST;
    private static final SubLSymbol $kw98$CLASS_INITIALIZATION_FUNCTION;
    private static final SubLSymbol $kw99$CLASS_INITIALIZED_P;
    private static final SubLSymbol $kw100$INSTANCE_INITIALIZATION_FUNCTION;
    private static final SubLSymbol $kw101$CLASS_PROPERTIES;
    private static final SubLString $str102$Invalid_slot__S_for_construction_;
    private static final SubLSymbol $kw103$BEGIN;
    private static final SubLSymbol $sym104$MAKE_CLASS;
    private static final SubLSymbol $kw105$SLOT;
    private static final SubLSymbol $kw106$END;
    private static final SubLSymbol $sym107$VISIT_DEFSTRUCT_OBJECT_CLASS_METHOD;
    private static final SubLList $list108;
    private static final SubLString $str109$class;
    private static final SubLSymbol $sym110$CLASS_;
    private static final SubLList $list111;
    private static final SubLString $str112$__CLASS__S_;
    private static final SubLList $list113;
    private static final SubLString $str114$SUBLOOP_CLASS_PROPERTY_;
    private static final SubLString $str115$GET_;
    private static final SubLString $str116$SET_;
    private static final SubLSymbol $sym117$PROGN;
    private static final SubLSymbol $sym118$DEFINE_PROTECTED;
    private static final SubLList $list119;
    private static final SubLSymbol $sym120$RET;
    private static final SubLSymbol $sym121$LDB_TEST;
    private static final SubLSymbol $sym122$BYTE;
    private static final SubLList $list123;
    private static final SubLList $list124;
    private static final SubLSymbol $sym125$CSETF;
    private static final SubLList $list126;
    private static final SubLSymbol $sym127$DPB;
    private static final SubLList $list128;
    private static final SubLList $list129;
    private static final SubLSymbol $sym130$INSTANCE;
    private static final SubLSymbol $sym131$INSTANCE_P;
    private static final SubLList $list132;
    private static final SubLList $list133;
    private static final SubLList $list134;
    private static final SubLList $list135;
    private static final SubLSymbol $sym136$PRINT_INSTANCE;
    private static final SubLSymbol $sym137$INSTANCE_PRINT_FUNCTION_TRAMPOLINE;
    private static final SubLList $list138;
    private static final SubLSymbol $sym139$INSTANCE_CLASS;
    private static final SubLSymbol $sym140$_CSETF_INSTANCE_CLASS;
    private static final SubLSymbol $sym141$INSTANCE_BOOLEAN_SLOTS;
    private static final SubLSymbol $sym142$_CSETF_INSTANCE_BOOLEAN_SLOTS;
    private static final SubLSymbol $sym143$INSTANCE_ANY_SLOTS;
    private static final SubLSymbol $sym144$_CSETF_INSTANCE_ANY_SLOTS;
    private static final SubLSymbol $sym145$INSTANCE_PLIST;
    private static final SubLSymbol $sym146$_CSETF_INSTANCE_PLIST;
    private static final SubLSymbol $kw147$CLASS;
    private static final SubLSymbol $sym148$MAKE_INSTANCE;
    private static final SubLSymbol $sym149$VISIT_DEFSTRUCT_OBJECT_INSTANCE_METHOD;
    private static final SubLList $list150;
    private static final SubLString $str151$instance;
    private static final SubLSymbol $sym152$INSTANCE_;
    private static final SubLSymbol $sym153$OBJECT;
    private static final SubLSymbol $sym154$PRINT;
    private static final SubLString $str155$__Instance_of__S_;
    private static final SubLSymbol $sym156$INTERFACE;
    private static final SubLSymbol $sym157$INTERFACE_P;
    private static final SubLList $list158;
    private static final SubLList $list159;
    private static final SubLList $list160;
    private static final SubLList $list161;
    private static final SubLSymbol $sym162$PRINT_INTERFACE;
    private static final SubLSymbol $sym163$INTERFACE_PRINT_FUNCTION_TRAMPOLINE;
    private static final SubLList $list164;
    private static final SubLSymbol $sym165$INTERFACE_NAME;
    private static final SubLSymbol $sym166$_CSETF_INTERFACE_NAME;
    private static final SubLSymbol $sym167$INTERFACE_PARENTS;
    private static final SubLSymbol $sym168$_CSETF_INTERFACE_PARENTS;
    private static final SubLSymbol $sym169$INTERFACE_COMPILED_INHERITANCE_PATH;
    private static final SubLSymbol $sym170$_CSETF_INTERFACE_COMPILED_INHERITANCE_PATH;
    private static final SubLSymbol $sym171$INTERFACE_SUBINTERFACES;
    private static final SubLSymbol $sym172$_CSETF_INTERFACE_SUBINTERFACES;
    private static final SubLSymbol $sym173$INTERFACE_IMPLEMENTERS;
    private static final SubLSymbol $sym174$_CSETF_INTERFACE_IMPLEMENTERS;
    private static final SubLSymbol $sym175$INTERFACE_INSTANCE_METHOD_DECLS;
    private static final SubLSymbol $sym176$_CSETF_INTERFACE_INSTANCE_METHOD_DECLS;
    private static final SubLSymbol $sym177$INTERFACE_CLASS_METHOD_DECLS;
    private static final SubLSymbol $sym178$_CSETF_INTERFACE_CLASS_METHOD_DECLS;
    private static final SubLSymbol $sym179$INTERFACE_COMPILED_INSTANCE_METHOD_DECLS;
    private static final SubLSymbol $sym180$_CSETF_INTERFACE_COMPILED_INSTANCE_METHOD_DECLS;
    private static final SubLSymbol $sym181$INTERFACE_COMPILED_CLASS_METHOD_DECLS;
    private static final SubLSymbol $sym182$_CSETF_INTERFACE_COMPILED_CLASS_METHOD_DECLS;
    private static final SubLSymbol $sym183$INTERFACE_LOCAL_CLASS_METHODS;
    private static final SubLSymbol $sym184$_CSETF_INTERFACE_LOCAL_CLASS_METHODS;
    private static final SubLSymbol $sym185$INTERFACE_LOCAL_INSTANCE_METHODS;
    private static final SubLSymbol $sym186$_CSETF_INTERFACE_LOCAL_INSTANCE_METHODS;
    private static final SubLSymbol $sym187$INTERFACE_MARK_LIST;
    private static final SubLSymbol $sym188$_CSETF_INTERFACE_MARK_LIST;
    private static final SubLSymbol $sym189$INTERFACE_PLIST;
    private static final SubLSymbol $sym190$_CSETF_INTERFACE_PLIST;
    private static final SubLSymbol $sym191$INTERFACE_DEFINITION_LOCK;
    private static final SubLSymbol $sym192$_CSETF_INTERFACE_DEFINITION_LOCK;
    private static final SubLSymbol $kw193$PARENTS;
    private static final SubLSymbol $kw194$SUBINTERFACES;
    private static final SubLSymbol $kw195$IMPLEMENTERS;
    private static final SubLSymbol $kw196$COMPILED_INSTANCE_METHOD_DECLS;
    private static final SubLSymbol $kw197$COMPILED_CLASS_METHOD_DECLS;
    private static final SubLSymbol $kw198$LOCAL_CLASS_METHODS;
    private static final SubLSymbol $kw199$LOCAL_INSTANCE_METHODS;
    private static final SubLSymbol $kw200$MARK_LIST;
    private static final SubLSymbol $sym201$MAKE_INTERFACE;
    private static final SubLSymbol $sym202$VISIT_DEFSTRUCT_OBJECT_INTERFACE_METHOD;
    private static final SubLList $list203;
    private static final SubLString $str204$interface;
    private static final SubLSymbol $sym205$INTERFACE_;
    private static final SubLList $list206;
    private static final SubLString $str207$__Interface__S_PARENTS___S_;
    private static final SubLSymbol $sym208$METHOD;
    private static final SubLSymbol $sym209$METHOD_P;
    private static final SubLList $list210;
    private static final SubLList $list211;
    private static final SubLList $list212;
    private static final SubLList $list213;
    private static final SubLSymbol $sym214$PRINT_METHOD;
    private static final SubLSymbol $sym215$METHOD_PRINT_FUNCTION_TRAMPOLINE;
    private static final SubLList $list216;
    private static final SubLSymbol $sym217$METHOD_NAME;
    private static final SubLSymbol $sym218$_CSETF_METHOD_NAME;
    private static final SubLSymbol $sym219$METHOD_CLASS_NAME;
    private static final SubLSymbol $sym220$_CSETF_METHOD_CLASS_NAME;
    private static final SubLSymbol $sym221$METHOD_LAMBDA_LIST;
    private static final SubLSymbol $sym222$_CSETF_METHOD_LAMBDA_LIST;
    private static final SubLSymbol $sym223$METHOD_BODY;
    private static final SubLSymbol $sym224$_CSETF_METHOD_BODY;
    private static final SubLSymbol $sym225$METHOD_PROTECTION;
    private static final SubLSymbol $sym226$_CSETF_METHOD_PROTECTION;
    private static final SubLSymbol $sym227$METHOD_SCOPE;
    private static final SubLSymbol $sym228$_CSETF_METHOD_SCOPE;
    private static final SubLSymbol $sym229$METHOD_UPDATE_TYPE;
    private static final SubLSymbol $sym230$_CSETF_METHOD_UPDATE_TYPE;
    private static final SubLSymbol $sym231$METHOD_FUNCTION_NAME;
    private static final SubLSymbol $sym232$_CSETF_METHOD_FUNCTION_NAME;
    private static final SubLSymbol $sym233$METHOD_FUNCTION_DEF;
    private static final SubLSymbol $sym234$_CSETF_METHOD_FUNCTION_DEF;
    private static final SubLSymbol $sym235$METHOD_BEFORE_LISTENERS;
    private static final SubLSymbol $sym236$_CSETF_METHOD_BEFORE_LISTENERS;
    private static final SubLSymbol $sym237$METHOD_AFTER_LISTENERS;
    private static final SubLSymbol $sym238$_CSETF_METHOD_AFTER_LISTENERS;
    private static final SubLSymbol $sym239$METHOD_INSTANTIATE_TEMPLATE;
    private static final SubLSymbol $sym240$_CSETF_METHOD_INSTANTIATE_TEMPLATE;
    private static final SubLSymbol $kw241$CLASS_NAME;
    private static final SubLSymbol $kw242$LAMBDA_LIST;
    private static final SubLSymbol $kw243$BODY;
    private static final SubLSymbol $kw244$PROTECTION;
    private static final SubLSymbol $kw245$SCOPE;
    private static final SubLSymbol $kw246$UPDATE_TYPE;
    private static final SubLSymbol $kw247$FUNCTION_NAME;
    private static final SubLSymbol $kw248$FUNCTION_DEF;
    private static final SubLSymbol $kw249$BEFORE_LISTENERS;
    private static final SubLSymbol $kw250$AFTER_LISTENERS;
    private static final SubLSymbol $kw251$INSTANTIATE_TEMPLATE;
    private static final SubLSymbol $sym252$MAKE_METHOD;
    private static final SubLSymbol $sym253$VISIT_DEFSTRUCT_OBJECT_METHOD_METHOD;
    private static final SubLList $list254;
    private static final SubLString $str255$method;
    private static final SubLSymbol $sym256$METHOD_;
    private static final SubLString $str257$__METHOD____S__S___S_;
    private static final SubLInteger $int258$100;
    private static final SubLSymbol $sym259$METHOD_TRACE;
    private static final SubLSymbol $sym260$METHOD_TRACE_P;
    private static final SubLList $list261;
    private static final SubLList $list262;
    private static final SubLList $list263;
    private static final SubLList $list264;
    private static final SubLSymbol $sym265$PRINT_METHOD_TRACE;
    private static final SubLSymbol $sym266$METHOD_TRACE_PRINT_FUNCTION_TRAMPOLINE;
    private static final SubLList $list267;
    private static final SubLSymbol $sym268$METHOD_TRACE_NAME;
    private static final SubLSymbol $sym269$_CSETF_METHOD_TRACE_NAME;
    private static final SubLSymbol $sym270$METHOD_TRACE_CLASS_NAME;
    private static final SubLSymbol $sym271$_CSETF_METHOD_TRACE_CLASS_NAME;
    private static final SubLSymbol $sym272$METHOD_TRACE_FUNCTION;
    private static final SubLSymbol $sym273$_CSETF_METHOD_TRACE_FUNCTION;
    private static final SubLSymbol $sym274$METHOD_TRACE_OUTER;
    private static final SubLSymbol $sym275$_CSETF_METHOD_TRACE_OUTER;
    private static final SubLSymbol $kw276$FUNCTION;
    private static final SubLSymbol $kw277$OUTER;
    private static final SubLSymbol $sym278$MAKE_METHOD_TRACE;
    private static final SubLSymbol $sym279$VISIT_DEFSTRUCT_OBJECT_METHOD_TRACE_METHOD;
    private static final SubLList $list280;
    private static final SubLString $str281$method_trace;
    private static final SubLSymbol $sym282$METHOD_TRACE_;
    private static final SubLString $str283$__METHOD_TRACE____S__S__;
    private static final SubLSymbol $sym284$METHOD_INFO;
    private static final SubLSymbol $sym285$METHOD_INFO_P;
    private static final SubLList $list286;
    private static final SubLList $list287;
    private static final SubLList $list288;
    private static final SubLList $list289;
    private static final SubLSymbol $sym290$DEFAULT_STRUCT_PRINT_FUNCTION;
    private static final SubLSymbol $sym291$METHOD_INFO_PRINT_FUNCTION_TRAMPOLINE;
    private static final SubLList $list292;
    private static final SubLSymbol $sym293$MI_METHOD_NAME;
    private static final SubLSymbol $sym294$_CSETF_MI_METHOD_NAME;
    private static final SubLSymbol $sym295$MI_CLASS_NAME;
    private static final SubLSymbol $sym296$_CSETF_MI_CLASS_NAME;
    private static final SubLSymbol $sym297$MI_MV_USED_IN_BODY;
    private static final SubLSymbol $sym298$_CSETF_MI_MV_USED_IN_BODY;
    private static final SubLSymbol $sym299$MI_MV_MODIFIED_IN_BODY;
    private static final SubLSymbol $sym300$_CSETF_MI_MV_MODIFIED_IN_BODY;
    private static final SubLSymbol $sym301$MI_METHODS_USED_IN_BODY;
    private static final SubLSymbol $sym302$_CSETF_MI_METHODS_USED_IN_BODY;
    private static final SubLSymbol $kw303$METHOD_NAME;
    private static final SubLSymbol $kw304$MV_USED_IN_BODY;
    private static final SubLSymbol $kw305$MV_MODIFIED_IN_BODY;
    private static final SubLSymbol $kw306$METHODS_USED_IN_BODY;
    private static final SubLSymbol $sym307$MAKE_METHOD_INFO;
    private static final SubLSymbol $sym308$VISIT_DEFSTRUCT_OBJECT_METHOD_INFO_METHOD;
    private static final SubLList $list309;
    private static final SubLString $str310$method_info;
    private static final SubLSymbol $sym311$MI_;
    private static final SubLSymbol $sym312$SLOT_LISTENER;
    private static final SubLSymbol $sym313$SLOT_LISTENER_P;
    private static final SubLList $list314;
    private static final SubLList $list315;
    private static final SubLList $list316;
    private static final SubLList $list317;
    private static final SubLSymbol $sym318$PRINT_SLOT_LISTENER;
    private static final SubLSymbol $sym319$SLOT_LISTENER_PRINT_FUNCTION_TRAMPOLINE;
    private static final SubLList $list320;
    private static final SubLSymbol $sym321$SL_SLOT_NAME;
    private static final SubLSymbol $sym322$_CSETF_SL_SLOT_NAME;
    private static final SubLSymbol $sym323$SL_DEMON_TYPE;
    private static final SubLSymbol $sym324$_CSETF_SL_DEMON_TYPE;
    private static final SubLSymbol $sym325$SL_VALUE_TRIGGER;
    private static final SubLSymbol $sym326$_CSETF_SL_VALUE_TRIGGER;
    private static final SubLSymbol $sym327$SL_FUNCTIONAL_TYPE;
    private static final SubLSymbol $sym328$_CSETF_SL_FUNCTIONAL_TYPE;
    private static final SubLSymbol $sym329$SL_ISA_METHOD;
    private static final SubLSymbol $sym330$_CSETF_SL_ISA_METHOD;
    private static final SubLSymbol $sym331$SL_TARGET_INSTANCE;
    private static final SubLSymbol $sym332$_CSETF_SL_TARGET_INSTANCE;
    private static final SubLSymbol $kw333$SLOT_NAME;
    private static final SubLSymbol $kw334$DEMON_TYPE;
    private static final SubLSymbol $kw335$VALUE_TRIGGER;
    private static final SubLSymbol $kw336$FUNCTIONAL_TYPE;
    private static final SubLSymbol $kw337$ISA_METHOD;
    private static final SubLSymbol $kw338$TARGET_INSTANCE;
    private static final SubLSymbol $sym339$MAKE_SLOT_LISTENER;
    private static final SubLSymbol $sym340$VISIT_DEFSTRUCT_OBJECT_SLOT_LISTENER_METHOD;
    private static final SubLString $str341$__SLOT_LISTENER_for_Slot__S___S__;
    private static final SubLList $list342;
    private static final SubLString $str343$slot_listener;
    private static final SubLSymbol $sym344$SL_;
    private static final SubLSymbol $sym345$SLOT_LISTENER_REGISTRY;
    private static final SubLSymbol $sym346$SLOT_LISTENER_REGISTRY_P;
    private static final SubLList $list347;
    private static final SubLList $list348;
    private static final SubLList $list349;
    private static final SubLList $list350;
    private static final SubLSymbol $sym351$SLOT_LISTENER_REGISTRY_PRINT_FUNCTION_TRAMPOLINE;
    private static final SubLList $list352;
    private static final SubLSymbol $sym353$SLR_INSTANCE;
    private static final SubLSymbol $sym354$_CSETF_SLR_INSTANCE;
    private static final SubLSymbol $sym355$SLR_SLOT_COUNT;
    private static final SubLSymbol $sym356$_CSETF_SLR_SLOT_COUNT;
    private static final SubLSymbol $sym357$SLR_LISTENERS_VECTOR;
    private static final SubLSymbol $sym358$_CSETF_SLR_LISTENERS_VECTOR;
    private static final SubLSymbol $kw359$INSTANCE;
    private static final SubLSymbol $kw360$SLOT_COUNT;
    private static final SubLSymbol $kw361$LISTENERS_VECTOR;
    private static final SubLSymbol $sym362$MAKE_SLOT_LISTENER_REGISTRY;
    private static final SubLSymbol $sym363$VISIT_DEFSTRUCT_OBJECT_SLOT_LISTENER_REGISTRY_METHOD;
    private static final SubLString $str364$__SLOT_LISTENER_REGISTRY___S__SLO;
    private static final SubLList $list365;
    private static final SubLString $str366$slot_listener_registry;
    private static final SubLSymbol $sym367$SLR_;
    private static final SubLSymbol $sym368$METHOD_LISTENER;
    private static final SubLSymbol $sym369$METHOD_LISTENER_P;
    private static final SubLList $list370;
    private static final SubLList $list371;
    private static final SubLList $list372;
    private static final SubLList $list373;
    private static final SubLSymbol $sym374$PRINT_METHOD_LISTENER;
    private static final SubLSymbol $sym375$METHOD_LISTENER_PRINT_FUNCTION_TRAMPOLINE;
    private static final SubLList $list376;
    private static final SubLSymbol $sym377$ML_OWNING_METHOD_NAME;
    private static final SubLSymbol $sym378$_CSETF_ML_OWNING_METHOD_NAME;
    private static final SubLSymbol $sym379$ML_OWNING_CLASS_NAME;
    private static final SubLSymbol $sym380$_CSETF_ML_OWNING_CLASS_NAME;
    private static final SubLSymbol $sym381$ML_DEMON_TYPE;
    private static final SubLSymbol $sym382$_CSETF_ML_DEMON_TYPE;
    private static final SubLSymbol $sym383$ML_DETAIL;
    private static final SubLSymbol $sym384$_CSETF_ML_DETAIL;
    private static final SubLSymbol $kw385$OWNING_METHOD_NAME;
    private static final SubLSymbol $kw386$OWNING_CLASS_NAME;
    private static final SubLSymbol $kw387$DETAIL;
    private static final SubLSymbol $sym388$MAKE_METHOD_LISTENER;
    private static final SubLSymbol $sym389$VISIT_DEFSTRUCT_OBJECT_METHOD_LISTENER_METHOD;
    private static final SubLList $list390;
    private static final SubLString $str391$method_listener;
    private static final SubLSymbol $sym392$ML_;
    private static final SubLSymbol $sym393$FUNCTION_DETAIL;
    private static final SubLSymbol $sym394$FUNCTION_DETAIL_P;
    private static final SubLList $list395;
    private static final SubLList $list396;
    private static final SubLList $list397;
    private static final SubLList $list398;
    private static final SubLSymbol $sym399$FUNCTION_DETAIL_PRINT_FUNCTION_TRAMPOLINE;
    private static final SubLList $list400;
    private static final SubLSymbol $sym401$FD_FUNCTION_NAME;
    private static final SubLSymbol $sym402$_CSETF_FD_FUNCTION_NAME;
    private static final SubLSymbol $sym403$FD_ARGLIST;
    private static final SubLSymbol $sym404$_CSETF_FD_ARGLIST;
    private static final SubLSymbol $kw405$ARGLIST;
    private static final SubLSymbol $sym406$MAKE_FUNCTION_DETAIL;
    private static final SubLSymbol $sym407$VISIT_DEFSTRUCT_OBJECT_FUNCTION_DETAIL_METHOD;
    private static final SubLList $list408;
    private static final SubLString $str409$function_detail;
    private static final SubLSymbol $sym410$FD_;
    private static final SubLSymbol $sym411$METHOD_DETAIL;
    private static final SubLSymbol $sym412$METHOD_DETAIL_P;
    private static final SubLList $list413;
    private static final SubLList $list414;
    private static final SubLList $list415;
    private static final SubLList $list416;
    private static final SubLSymbol $sym417$METHOD_DETAIL_PRINT_FUNCTION_TRAMPOLINE;
    private static final SubLList $list418;
    private static final SubLSymbol $sym419$MD_METHOD_NAME;
    private static final SubLSymbol $sym420$_CSETF_MD_METHOD_NAME;
    private static final SubLSymbol $sym421$MD_FUNCTION_NAME;
    private static final SubLSymbol $sym422$_CSETF_MD_FUNCTION_NAME;
    private static final SubLSymbol $sym423$MD_ARGLIST;
    private static final SubLSymbol $sym424$_CSETF_MD_ARGLIST;
    private static final SubLSymbol $sym425$MD_INSTANCE;
    private static final SubLSymbol $sym426$_CSETF_MD_INSTANCE;
    private static final SubLSymbol $sym427$MAKE_METHOD_DETAIL;
    private static final SubLSymbol $sym428$VISIT_DEFSTRUCT_OBJECT_METHOD_DETAIL_METHOD;
    private static final SubLList $list429;
    private static final SubLString $str430$method_detail;
    private static final SubLSymbol $sym431$MD_;
    private static final SubLSymbol $sym432$METHOD_LISTENER_REGISTRY;
    private static final SubLSymbol $sym433$METHOD_LISTENER_REGISTRY_P;
    private static final SubLList $list434;
    private static final SubLList $list435;
    private static final SubLList $list436;
    private static final SubLList $list437;
    private static final SubLSymbol $sym438$METHOD_LISTENER_REGISTRY_PRINT_FUNCTION_TRAMPOLINE;
    private static final SubLList $list439;
    private static final SubLSymbol $sym440$MLR_INSTANCE;
    private static final SubLSymbol $sym441$_CSETF_MLR_INSTANCE;
    private static final SubLSymbol $sym442$MLR_LISTENER_ALIST;
    private static final SubLSymbol $sym443$_CSETF_MLR_LISTENER_ALIST;
    private static final SubLSymbol $kw444$LISTENER_ALIST;
    private static final SubLSymbol $sym445$MAKE_METHOD_LISTENER_REGISTRY;
    private static final SubLSymbol $sym446$VISIT_DEFSTRUCT_OBJECT_METHOD_LISTENER_REGISTRY_METHOD;
    private static final SubLList $list447;
    private static final SubLString $str448$method_listener_registry;
    private static final SubLSymbol $sym449$MLR_;
    private static final SubLString $str450$__METHOD_LISTENER____S__S_;
    private static final SubLString $str451$_monitored_by_function__S_;
    private static final SubLString $str452$_monitored_by_method___S__S__;
    private static final SubLString $str453$_;
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 885L)
    public static SubLObject class_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        print_class(v_object, stream, (SubLObject)subloop_structures.ZERO_INTEGER);
        return (SubLObject)subloop_structures.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 885L)
    public static SubLObject class_p(final SubLObject v_object) {
        return (SubLObject)((v_object.getClass() == $class_native.class) ? subloop_structures.T : subloop_structures.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 885L)
    public static SubLObject class_name(final SubLObject v_object) {
        assert subloop_structures.NIL != class_p(v_object) : v_object;
        return v_object.getField2();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 885L)
    public static SubLObject class_parent(final SubLObject v_object) {
        assert subloop_structures.NIL != class_p(v_object) : v_object;
        return v_object.getField3();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 885L)
    public static SubLObject class_subclasses(final SubLObject v_object) {
        assert subloop_structures.NIL != class_p(v_object) : v_object;
        return v_object.getField4();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 885L)
    public static SubLObject class_interface_names(final SubLObject v_object) {
        assert subloop_structures.NIL != class_p(v_object) : v_object;
        return v_object.getField5();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 885L)
    public static SubLObject class_interfaces(final SubLObject v_object) {
        assert subloop_structures.NIL != class_p(v_object) : v_object;
        return v_object.getField6();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 885L)
    public static SubLObject class_compiled_inheritance_path(final SubLObject v_object) {
        assert subloop_structures.NIL != class_p(v_object) : v_object;
        return v_object.getField7();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 885L)
    public static SubLObject class_instance_var_decls(final SubLObject v_object) {
        assert subloop_structures.NIL != class_p(v_object) : v_object;
        return v_object.getField8();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 885L)
    public static SubLObject class_class_var_decls(final SubLObject v_object) {
        assert subloop_structures.NIL != class_p(v_object) : v_object;
        return v_object.getField9();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 885L)
    public static SubLObject class_compiled_instance_slot_access_alist(final SubLObject v_object) {
        assert subloop_structures.NIL != class_p(v_object) : v_object;
        return v_object.getField10();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 885L)
    public static SubLObject class_compiled_instance_boolean_slot_access_alist(final SubLObject v_object) {
        assert subloop_structures.NIL != class_p(v_object) : v_object;
        return v_object.getField11();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 885L)
    public static SubLObject class_compiled_class_slot_access_alist(final SubLObject v_object) {
        assert subloop_structures.NIL != class_p(v_object) : v_object;
        return v_object.getField12();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 885L)
    public static SubLObject class_compiled_class_boolean_slot_access_alist(final SubLObject v_object) {
        assert subloop_structures.NIL != class_p(v_object) : v_object;
        return v_object.getField13();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 885L)
    public static SubLObject class_slot_accessor_alist(final SubLObject v_object) {
        assert subloop_structures.NIL != class_p(v_object) : v_object;
        return v_object.getField14();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 885L)
    public static SubLObject class_instance_method_decls(final SubLObject v_object) {
        assert subloop_structures.NIL != class_p(v_object) : v_object;
        return v_object.getField15();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 885L)
    public static SubLObject class_class_method_decls(final SubLObject v_object) {
        assert subloop_structures.NIL != class_p(v_object) : v_object;
        return v_object.getField16();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 885L)
    public static SubLObject class_boolean_slots(final SubLObject v_object) {
        assert subloop_structures.NIL != class_p(v_object) : v_object;
        return v_object.getField17();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 885L)
    public static SubLObject class_any_slots(final SubLObject v_object) {
        assert subloop_structures.NIL != class_p(v_object) : v_object;
        return v_object.getField18();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 885L)
    public static SubLObject class_compiled_instance_method_access_alist(final SubLObject v_object) {
        assert subloop_structures.NIL != class_p(v_object) : v_object;
        return v_object.getField19();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 885L)
    public static SubLObject class_compiled_class_method_access_alist(final SubLObject v_object) {
        assert subloop_structures.NIL != class_p(v_object) : v_object;
        return v_object.getField20();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 885L)
    public static SubLObject class_tablified_instance_methods(final SubLObject v_object) {
        assert subloop_structures.NIL != class_p(v_object) : v_object;
        return (($class_native)v_object).$tablified_instance_methods;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 885L)
    public static SubLObject class_definition_lock(final SubLObject v_object) {
        assert subloop_structures.NIL != class_p(v_object) : v_object;
        return (($class_native)v_object).$definition_lock;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 885L)
    public static SubLObject class_access_lock(final SubLObject v_object) {
        assert subloop_structures.NIL != class_p(v_object) : v_object;
        return (($class_native)v_object).$access_lock;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 885L)
    public static SubLObject class_synchronized_slots_p(final SubLObject v_object) {
        assert subloop_structures.NIL != class_p(v_object) : v_object;
        return (($class_native)v_object).$synchronized_slots_p;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 885L)
    public static SubLObject class_plist(final SubLObject v_object) {
        assert subloop_structures.NIL != class_p(v_object) : v_object;
        return (($class_native)v_object).$plist;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 885L)
    public static SubLObject class_class_initialization_function(final SubLObject v_object) {
        assert subloop_structures.NIL != class_p(v_object) : v_object;
        return (($class_native)v_object).$class_initialization_function;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 885L)
    public static SubLObject class_class_initialized_p(final SubLObject v_object) {
        assert subloop_structures.NIL != class_p(v_object) : v_object;
        return (($class_native)v_object).$class_initialized_p;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 885L)
    public static SubLObject class_instance_initialization_function(final SubLObject v_object) {
        assert subloop_structures.NIL != class_p(v_object) : v_object;
        return (($class_native)v_object).$instance_initialization_function;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 885L)
    public static SubLObject class_class_properties(final SubLObject v_object) {
        assert subloop_structures.NIL != class_p(v_object) : v_object;
        return (($class_native)v_object).$class_properties;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 885L)
    public static SubLObject _csetf_class_name(final SubLObject v_object, final SubLObject value) {
        assert subloop_structures.NIL != class_p(v_object) : v_object;
        return v_object.setField2(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 885L)
    public static SubLObject _csetf_class_parent(final SubLObject v_object, final SubLObject value) {
        assert subloop_structures.NIL != class_p(v_object) : v_object;
        return v_object.setField3(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 885L)
    public static SubLObject _csetf_class_subclasses(final SubLObject v_object, final SubLObject value) {
        assert subloop_structures.NIL != class_p(v_object) : v_object;
        return v_object.setField4(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 885L)
    public static SubLObject _csetf_class_interface_names(final SubLObject v_object, final SubLObject value) {
        assert subloop_structures.NIL != class_p(v_object) : v_object;
        return v_object.setField5(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 885L)
    public static SubLObject _csetf_class_interfaces(final SubLObject v_object, final SubLObject value) {
        assert subloop_structures.NIL != class_p(v_object) : v_object;
        return v_object.setField6(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 885L)
    public static SubLObject _csetf_class_compiled_inheritance_path(final SubLObject v_object, final SubLObject value) {
        assert subloop_structures.NIL != class_p(v_object) : v_object;
        return v_object.setField7(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 885L)
    public static SubLObject _csetf_class_instance_var_decls(final SubLObject v_object, final SubLObject value) {
        assert subloop_structures.NIL != class_p(v_object) : v_object;
        return v_object.setField8(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 885L)
    public static SubLObject _csetf_class_class_var_decls(final SubLObject v_object, final SubLObject value) {
        assert subloop_structures.NIL != class_p(v_object) : v_object;
        return v_object.setField9(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 885L)
    public static SubLObject _csetf_class_compiled_instance_slot_access_alist(final SubLObject v_object, final SubLObject value) {
        assert subloop_structures.NIL != class_p(v_object) : v_object;
        return v_object.setField10(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 885L)
    public static SubLObject _csetf_class_compiled_instance_boolean_slot_access_alist(final SubLObject v_object, final SubLObject value) {
        assert subloop_structures.NIL != class_p(v_object) : v_object;
        return v_object.setField11(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 885L)
    public static SubLObject _csetf_class_compiled_class_slot_access_alist(final SubLObject v_object, final SubLObject value) {
        assert subloop_structures.NIL != class_p(v_object) : v_object;
        return v_object.setField12(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 885L)
    public static SubLObject _csetf_class_compiled_class_boolean_slot_access_alist(final SubLObject v_object, final SubLObject value) {
        assert subloop_structures.NIL != class_p(v_object) : v_object;
        return v_object.setField13(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 885L)
    public static SubLObject _csetf_class_slot_accessor_alist(final SubLObject v_object, final SubLObject value) {
        assert subloop_structures.NIL != class_p(v_object) : v_object;
        return v_object.setField14(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 885L)
    public static SubLObject _csetf_class_instance_method_decls(final SubLObject v_object, final SubLObject value) {
        assert subloop_structures.NIL != class_p(v_object) : v_object;
        return v_object.setField15(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 885L)
    public static SubLObject _csetf_class_class_method_decls(final SubLObject v_object, final SubLObject value) {
        assert subloop_structures.NIL != class_p(v_object) : v_object;
        return v_object.setField16(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 885L)
    public static SubLObject _csetf_class_boolean_slots(final SubLObject v_object, final SubLObject value) {
        assert subloop_structures.NIL != class_p(v_object) : v_object;
        return v_object.setField17(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 885L)
    public static SubLObject _csetf_class_any_slots(final SubLObject v_object, final SubLObject value) {
        assert subloop_structures.NIL != class_p(v_object) : v_object;
        return v_object.setField18(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 885L)
    public static SubLObject _csetf_class_compiled_instance_method_access_alist(final SubLObject v_object, final SubLObject value) {
        assert subloop_structures.NIL != class_p(v_object) : v_object;
        return v_object.setField19(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 885L)
    public static SubLObject _csetf_class_compiled_class_method_access_alist(final SubLObject v_object, final SubLObject value) {
        assert subloop_structures.NIL != class_p(v_object) : v_object;
        return v_object.setField20(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 885L)
    public static SubLObject _csetf_class_tablified_instance_methods(final SubLObject v_object, final SubLObject value) {
        assert subloop_structures.NIL != class_p(v_object) : v_object;
        return (($class_native)v_object).$tablified_instance_methods = value;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 885L)
    public static SubLObject _csetf_class_definition_lock(final SubLObject v_object, final SubLObject value) {
        assert subloop_structures.NIL != class_p(v_object) : v_object;
        return (($class_native)v_object).$definition_lock = value;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 885L)
    public static SubLObject _csetf_class_access_lock(final SubLObject v_object, final SubLObject value) {
        assert subloop_structures.NIL != class_p(v_object) : v_object;
        return (($class_native)v_object).$access_lock = value;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 885L)
    public static SubLObject _csetf_class_synchronized_slots_p(final SubLObject v_object, final SubLObject value) {
        assert subloop_structures.NIL != class_p(v_object) : v_object;
        return (($class_native)v_object).$synchronized_slots_p = value;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 885L)
    public static SubLObject _csetf_class_plist(final SubLObject v_object, final SubLObject value) {
        assert subloop_structures.NIL != class_p(v_object) : v_object;
        return (($class_native)v_object).$plist = value;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 885L)
    public static SubLObject _csetf_class_class_initialization_function(final SubLObject v_object, final SubLObject value) {
        assert subloop_structures.NIL != class_p(v_object) : v_object;
        return (($class_native)v_object).$class_initialization_function = value;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 885L)
    public static SubLObject _csetf_class_class_initialized_p(final SubLObject v_object, final SubLObject value) {
        assert subloop_structures.NIL != class_p(v_object) : v_object;
        return (($class_native)v_object).$class_initialized_p = value;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 885L)
    public static SubLObject _csetf_class_instance_initialization_function(final SubLObject v_object, final SubLObject value) {
        assert subloop_structures.NIL != class_p(v_object) : v_object;
        return (($class_native)v_object).$instance_initialization_function = value;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 885L)
    public static SubLObject _csetf_class_class_properties(final SubLObject v_object, final SubLObject value) {
        assert subloop_structures.NIL != class_p(v_object) : v_object;
        return (($class_native)v_object).$class_properties = value;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 885L)
    public static SubLObject make_class(SubLObject arglist) {
        if (arglist == subloop_structures.UNPROVIDED) {
            arglist = (SubLObject)subloop_structures.NIL;
        }
        final SubLObject v_new = (SubLObject)new $class_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = (SubLObject)subloop_structures.NIL, next = arglist; subloop_structures.NIL != next; next = conses_high.cddr(next)) {
            current_arg = next.first();
            current_value = conses_high.cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql((SubLObject)subloop_structures.$kw74$NAME)) {
                _csetf_class_name(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)subloop_structures.$kw75$PARENT)) {
                _csetf_class_parent(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)subloop_structures.$kw76$SUBCLASSES)) {
                _csetf_class_subclasses(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)subloop_structures.$kw77$INTERFACE_NAMES)) {
                _csetf_class_interface_names(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)subloop_structures.$kw78$INTERFACES)) {
                _csetf_class_interfaces(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)subloop_structures.$kw79$COMPILED_INHERITANCE_PATH)) {
                _csetf_class_compiled_inheritance_path(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)subloop_structures.$kw80$INSTANCE_VAR_DECLS)) {
                _csetf_class_instance_var_decls(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)subloop_structures.$kw81$CLASS_VAR_DECLS)) {
                _csetf_class_class_var_decls(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)subloop_structures.$kw82$COMPILED_INSTANCE_SLOT_ACCESS_ALIST)) {
                _csetf_class_compiled_instance_slot_access_alist(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)subloop_structures.$kw83$COMPILED_INSTANCE_BOOLEAN_SLOT_ACCESS_ALIST)) {
                _csetf_class_compiled_instance_boolean_slot_access_alist(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)subloop_structures.$kw84$COMPILED_CLASS_SLOT_ACCESS_ALIST)) {
                _csetf_class_compiled_class_slot_access_alist(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)subloop_structures.$kw85$COMPILED_CLASS_BOOLEAN_SLOT_ACCESS_ALIST)) {
                _csetf_class_compiled_class_boolean_slot_access_alist(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)subloop_structures.$kw86$SLOT_ACCESSOR_ALIST)) {
                _csetf_class_slot_accessor_alist(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)subloop_structures.$kw87$INSTANCE_METHOD_DECLS)) {
                _csetf_class_instance_method_decls(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)subloop_structures.$kw88$CLASS_METHOD_DECLS)) {
                _csetf_class_class_method_decls(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)subloop_structures.$kw89$BOOLEAN_SLOTS)) {
                _csetf_class_boolean_slots(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)subloop_structures.$kw90$ANY_SLOTS)) {
                _csetf_class_any_slots(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)subloop_structures.$kw91$COMPILED_INSTANCE_METHOD_ACCESS_ALIST)) {
                _csetf_class_compiled_instance_method_access_alist(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)subloop_structures.$kw92$COMPILED_CLASS_METHOD_ACCESS_ALIST)) {
                _csetf_class_compiled_class_method_access_alist(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)subloop_structures.$kw93$TABLIFIED_INSTANCE_METHODS)) {
                _csetf_class_tablified_instance_methods(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)subloop_structures.$kw94$DEFINITION_LOCK)) {
                _csetf_class_definition_lock(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)subloop_structures.$kw95$ACCESS_LOCK)) {
                _csetf_class_access_lock(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)subloop_structures.$kw96$SYNCHRONIZED_SLOTS_P)) {
                _csetf_class_synchronized_slots_p(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)subloop_structures.$kw97$PLIST)) {
                _csetf_class_plist(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)subloop_structures.$kw98$CLASS_INITIALIZATION_FUNCTION)) {
                _csetf_class_class_initialization_function(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)subloop_structures.$kw99$CLASS_INITIALIZED_P)) {
                _csetf_class_class_initialized_p(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)subloop_structures.$kw100$INSTANCE_INITIALIZATION_FUNCTION)) {
                _csetf_class_instance_initialization_function(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)subloop_structures.$kw101$CLASS_PROPERTIES)) {
                _csetf_class_class_properties(v_new, current_value);
            }
            else {
                Errors.error((SubLObject)subloop_structures.$str102$Invalid_slot__S_for_construction_, current_arg);
            }
        }
        return v_new;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 885L)
    public static SubLObject visit_defstruct_class(final SubLObject obj, final SubLObject visitor_fn) {
        Functions.funcall(visitor_fn, obj, (SubLObject)subloop_structures.$kw103$BEGIN, (SubLObject)subloop_structures.$sym104$MAKE_CLASS, (SubLObject)subloop_structures.$int14$28);
        Functions.funcall(visitor_fn, obj, (SubLObject)subloop_structures.$kw105$SLOT, (SubLObject)subloop_structures.$kw74$NAME, class_name(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)subloop_structures.$kw105$SLOT, (SubLObject)subloop_structures.$kw75$PARENT, class_parent(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)subloop_structures.$kw105$SLOT, (SubLObject)subloop_structures.$kw76$SUBCLASSES, class_subclasses(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)subloop_structures.$kw105$SLOT, (SubLObject)subloop_structures.$kw77$INTERFACE_NAMES, class_interface_names(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)subloop_structures.$kw105$SLOT, (SubLObject)subloop_structures.$kw78$INTERFACES, class_interfaces(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)subloop_structures.$kw105$SLOT, (SubLObject)subloop_structures.$kw79$COMPILED_INHERITANCE_PATH, class_compiled_inheritance_path(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)subloop_structures.$kw105$SLOT, (SubLObject)subloop_structures.$kw80$INSTANCE_VAR_DECLS, class_instance_var_decls(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)subloop_structures.$kw105$SLOT, (SubLObject)subloop_structures.$kw81$CLASS_VAR_DECLS, class_class_var_decls(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)subloop_structures.$kw105$SLOT, (SubLObject)subloop_structures.$kw82$COMPILED_INSTANCE_SLOT_ACCESS_ALIST, class_compiled_instance_slot_access_alist(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)subloop_structures.$kw105$SLOT, (SubLObject)subloop_structures.$kw83$COMPILED_INSTANCE_BOOLEAN_SLOT_ACCESS_ALIST, class_compiled_instance_boolean_slot_access_alist(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)subloop_structures.$kw105$SLOT, (SubLObject)subloop_structures.$kw84$COMPILED_CLASS_SLOT_ACCESS_ALIST, class_compiled_class_slot_access_alist(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)subloop_structures.$kw105$SLOT, (SubLObject)subloop_structures.$kw85$COMPILED_CLASS_BOOLEAN_SLOT_ACCESS_ALIST, class_compiled_class_boolean_slot_access_alist(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)subloop_structures.$kw105$SLOT, (SubLObject)subloop_structures.$kw86$SLOT_ACCESSOR_ALIST, class_slot_accessor_alist(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)subloop_structures.$kw105$SLOT, (SubLObject)subloop_structures.$kw87$INSTANCE_METHOD_DECLS, class_instance_method_decls(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)subloop_structures.$kw105$SLOT, (SubLObject)subloop_structures.$kw88$CLASS_METHOD_DECLS, class_class_method_decls(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)subloop_structures.$kw105$SLOT, (SubLObject)subloop_structures.$kw89$BOOLEAN_SLOTS, class_boolean_slots(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)subloop_structures.$kw105$SLOT, (SubLObject)subloop_structures.$kw90$ANY_SLOTS, class_any_slots(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)subloop_structures.$kw105$SLOT, (SubLObject)subloop_structures.$kw91$COMPILED_INSTANCE_METHOD_ACCESS_ALIST, class_compiled_instance_method_access_alist(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)subloop_structures.$kw105$SLOT, (SubLObject)subloop_structures.$kw92$COMPILED_CLASS_METHOD_ACCESS_ALIST, class_compiled_class_method_access_alist(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)subloop_structures.$kw105$SLOT, (SubLObject)subloop_structures.$kw93$TABLIFIED_INSTANCE_METHODS, class_tablified_instance_methods(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)subloop_structures.$kw105$SLOT, (SubLObject)subloop_structures.$kw94$DEFINITION_LOCK, class_definition_lock(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)subloop_structures.$kw105$SLOT, (SubLObject)subloop_structures.$kw95$ACCESS_LOCK, class_access_lock(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)subloop_structures.$kw105$SLOT, (SubLObject)subloop_structures.$kw96$SYNCHRONIZED_SLOTS_P, class_synchronized_slots_p(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)subloop_structures.$kw105$SLOT, (SubLObject)subloop_structures.$kw97$PLIST, class_plist(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)subloop_structures.$kw105$SLOT, (SubLObject)subloop_structures.$kw98$CLASS_INITIALIZATION_FUNCTION, class_class_initialization_function(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)subloop_structures.$kw105$SLOT, (SubLObject)subloop_structures.$kw99$CLASS_INITIALIZED_P, class_class_initialized_p(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)subloop_structures.$kw105$SLOT, (SubLObject)subloop_structures.$kw100$INSTANCE_INITIALIZATION_FUNCTION, class_instance_initialization_function(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)subloop_structures.$kw105$SLOT, (SubLObject)subloop_structures.$kw101$CLASS_PROPERTIES, class_class_properties(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)subloop_structures.$kw106$END, (SubLObject)subloop_structures.$sym104$MAKE_CLASS, (SubLObject)subloop_structures.$int14$28);
        return obj;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 885L)
    public static SubLObject visit_defstruct_object_class_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_class(obj, visitor_fn);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 2103L)
    public static SubLObject create_class() {
        final SubLObject new_class = make_class((SubLObject)subloop_structures.UNPROVIDED);
        _csetf_class_class_properties(new_class, (SubLObject)subloop_structures.ZERO_INTEGER);
        return new_class;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 2244L)
    public static SubLObject with_class(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject v_class = (SubLObject)subloop_structures.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)subloop_structures.$list108);
        v_class = current.first();
        final SubLObject forms;
        current = (forms = current.rest());
        final SubLObject class_var = Symbols.make_symbol((SubLObject)subloop_structures.$str109$class);
        return utilities_macros.generate_instance_variable_bindings_for_structure_slots(class_var, v_class, (SubLObject)subloop_structures.$sym110$CLASS_, (SubLObject)subloop_structures.$list111, forms, (SubLObject)subloop_structures.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 3060L)
    public static SubLObject with_class_private(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject v_class = (SubLObject)subloop_structures.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)subloop_structures.$list108);
        v_class = current.first();
        final SubLObject forms;
        current = (forms = current.rest());
        final SubLObject class_var = Symbols.make_symbol((SubLObject)subloop_structures.$str109$class);
        return utilities_macros.generate_instance_variable_bindings_for_structure_slots(class_var, v_class, (SubLObject)subloop_structures.$sym110$CLASS_, (SubLObject)subloop_structures.$list111, forms, (SubLObject)subloop_structures.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 3888L)
    public static SubLObject print_class(final SubLObject v_object, final SubLObject stream, final SubLObject depth) {
        PrintLow.format(stream, (SubLObject)subloop_structures.$str112$__CLASS__S_, class_name(v_object));
        return v_object;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 4023L)
    public static SubLObject def_class_property(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject property_name = (SubLObject)subloop_structures.NIL;
        SubLObject offset = (SubLObject)subloop_structures.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)subloop_structures.$list113);
        property_name = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)subloop_structures.$list113);
        offset = current.first();
        current = current.rest();
        if (subloop_structures.NIL == current) {
            final SubLObject accessor_base_name = Sequences.cconcatenate((SubLObject)subloop_structures.$str114$SUBLOOP_CLASS_PROPERTY_, Symbols.symbol_name(property_name));
            final SubLObject getter_name = Packages.intern(Sequences.cconcatenate((SubLObject)subloop_structures.$str115$GET_, accessor_base_name), (SubLObject)subloop_structures.UNPROVIDED);
            final SubLObject setter_name = Packages.intern(Sequences.cconcatenate((SubLObject)subloop_structures.$str116$SET_, accessor_base_name), (SubLObject)subloop_structures.UNPROVIDED);
            return (SubLObject)ConsesLow.list((SubLObject)subloop_structures.$sym117$PROGN, (SubLObject)ConsesLow.list((SubLObject)subloop_structures.$sym118$DEFINE_PROTECTED, getter_name, (SubLObject)subloop_structures.$list119, (SubLObject)ConsesLow.list((SubLObject)subloop_structures.$sym120$RET, (SubLObject)ConsesLow.listS((SubLObject)subloop_structures.$sym121$LDB_TEST, (SubLObject)ConsesLow.list((SubLObject)subloop_structures.$sym122$BYTE, (SubLObject)subloop_structures.ONE_INTEGER, offset), (SubLObject)subloop_structures.$list123))), (SubLObject)ConsesLow.listS((SubLObject)subloop_structures.$sym118$DEFINE_PROTECTED, setter_name, (SubLObject)subloop_structures.$list124, (SubLObject)ConsesLow.list((SubLObject)subloop_structures.$sym125$CSETF, (SubLObject)subloop_structures.$list126, (SubLObject)ConsesLow.listS((SubLObject)subloop_structures.$sym127$DPB, (SubLObject)subloop_structures.$list128, (SubLObject)ConsesLow.list((SubLObject)subloop_structures.$sym122$BYTE, (SubLObject)subloop_structures.ONE_INTEGER, offset), (SubLObject)subloop_structures.$list123)), (SubLObject)subloop_structures.$list129));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)subloop_structures.$list113);
        return (SubLObject)subloop_structures.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 4726L)
    public static SubLObject instance_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        print_instance(v_object, stream, (SubLObject)subloop_structures.ZERO_INTEGER);
        return (SubLObject)subloop_structures.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 4726L)
    public static SubLObject instance_p(final SubLObject v_object) {
        return (SubLObject)((v_object.getClass() == $instance_native.class) ? subloop_structures.T : subloop_structures.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 4726L)
    public static SubLObject instance_class(final SubLObject v_object) {
        assert subloop_structures.NIL != instance_p(v_object) : v_object;
        return v_object.getField2();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 4726L)
    public static SubLObject instance_boolean_slots(final SubLObject v_object) {
        assert subloop_structures.NIL != instance_p(v_object) : v_object;
        return v_object.getField3();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 4726L)
    public static SubLObject instance_any_slots(final SubLObject v_object) {
        assert subloop_structures.NIL != instance_p(v_object) : v_object;
        return v_object.getField4();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 4726L)
    public static SubLObject instance_plist(final SubLObject v_object) {
        assert subloop_structures.NIL != instance_p(v_object) : v_object;
        return v_object.getField5();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 4726L)
    public static SubLObject _csetf_instance_class(final SubLObject v_object, final SubLObject value) {
        assert subloop_structures.NIL != instance_p(v_object) : v_object;
        return v_object.setField2(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 4726L)
    public static SubLObject _csetf_instance_boolean_slots(final SubLObject v_object, final SubLObject value) {
        assert subloop_structures.NIL != instance_p(v_object) : v_object;
        return v_object.setField3(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 4726L)
    public static SubLObject _csetf_instance_any_slots(final SubLObject v_object, final SubLObject value) {
        assert subloop_structures.NIL != instance_p(v_object) : v_object;
        return v_object.setField4(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 4726L)
    public static SubLObject _csetf_instance_plist(final SubLObject v_object, final SubLObject value) {
        assert subloop_structures.NIL != instance_p(v_object) : v_object;
        return v_object.setField5(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 4726L)
    public static SubLObject make_instance(SubLObject arglist) {
        if (arglist == subloop_structures.UNPROVIDED) {
            arglist = (SubLObject)subloop_structures.NIL;
        }
        final SubLObject v_new = (SubLObject)new $instance_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = (SubLObject)subloop_structures.NIL, next = arglist; subloop_structures.NIL != next; next = conses_high.cddr(next)) {
            current_arg = next.first();
            current_value = conses_high.cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql((SubLObject)subloop_structures.$kw147$CLASS)) {
                _csetf_instance_class(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)subloop_structures.$kw89$BOOLEAN_SLOTS)) {
                _csetf_instance_boolean_slots(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)subloop_structures.$kw90$ANY_SLOTS)) {
                _csetf_instance_any_slots(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)subloop_structures.$kw97$PLIST)) {
                _csetf_instance_plist(v_new, current_value);
            }
            else {
                Errors.error((SubLObject)subloop_structures.$str102$Invalid_slot__S_for_construction_, current_arg);
            }
        }
        return v_new;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 4726L)
    public static SubLObject visit_defstruct_instance(final SubLObject obj, final SubLObject visitor_fn) {
        Functions.funcall(visitor_fn, obj, (SubLObject)subloop_structures.$kw103$BEGIN, (SubLObject)subloop_structures.$sym148$MAKE_INSTANCE, (SubLObject)subloop_structures.FOUR_INTEGER);
        Functions.funcall(visitor_fn, obj, (SubLObject)subloop_structures.$kw105$SLOT, (SubLObject)subloop_structures.$kw147$CLASS, instance_class(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)subloop_structures.$kw105$SLOT, (SubLObject)subloop_structures.$kw89$BOOLEAN_SLOTS, instance_boolean_slots(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)subloop_structures.$kw105$SLOT, (SubLObject)subloop_structures.$kw90$ANY_SLOTS, instance_any_slots(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)subloop_structures.$kw105$SLOT, (SubLObject)subloop_structures.$kw97$PLIST, instance_plist(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)subloop_structures.$kw106$END, (SubLObject)subloop_structures.$sym148$MAKE_INSTANCE, (SubLObject)subloop_structures.FOUR_INTEGER);
        return obj;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 4726L)
    public static SubLObject visit_defstruct_object_instance_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_instance(obj, visitor_fn);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 4845L)
    public static SubLObject with_instance(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject instance = (SubLObject)subloop_structures.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)subloop_structures.$list150);
        instance = current.first();
        final SubLObject forms;
        current = (forms = current.rest());
        final SubLObject instance_var = Symbols.make_symbol((SubLObject)subloop_structures.$str151$instance);
        return utilities_macros.generate_instance_variable_bindings_for_structure_slots(instance_var, instance, (SubLObject)subloop_structures.$sym152$INSTANCE_, (SubLObject)subloop_structures.$list132, forms, (SubLObject)subloop_structures.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 5100L)
    public static SubLObject print_instance(final SubLObject v_object, final SubLObject stream, final SubLObject depth) {
        final SubLObject v_class = instance_class(v_object);
        final SubLObject class_name = class_name(v_class);
        if (subloop_structures.NIL != classes.subclassp(class_name, (SubLObject)subloop_structures.$sym153$OBJECT)) {
            methods.funcall_instance_method_with_2_args(v_object, (SubLObject)subloop_structures.$sym154$PRINT, stream, depth);
        }
        else {
            PrintLow.format(stream, (SubLObject)subloop_structures.$str155$__Instance_of__S_, class_name(v_class));
        }
        return v_object;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 5418L)
    public static SubLObject interface_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        print_interface(v_object, stream, (SubLObject)subloop_structures.ZERO_INTEGER);
        return (SubLObject)subloop_structures.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 5418L)
    public static SubLObject interface_p(final SubLObject v_object) {
        return (SubLObject)((v_object.getClass() == $interface_native.class) ? subloop_structures.T : subloop_structures.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 5418L)
    public static SubLObject interface_name(final SubLObject v_object) {
        assert subloop_structures.NIL != interface_p(v_object) : v_object;
        return v_object.getField2();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 5418L)
    public static SubLObject interface_parents(final SubLObject v_object) {
        assert subloop_structures.NIL != interface_p(v_object) : v_object;
        return v_object.getField3();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 5418L)
    public static SubLObject interface_compiled_inheritance_path(final SubLObject v_object) {
        assert subloop_structures.NIL != interface_p(v_object) : v_object;
        return v_object.getField4();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 5418L)
    public static SubLObject interface_subinterfaces(final SubLObject v_object) {
        assert subloop_structures.NIL != interface_p(v_object) : v_object;
        return v_object.getField5();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 5418L)
    public static SubLObject interface_implementers(final SubLObject v_object) {
        assert subloop_structures.NIL != interface_p(v_object) : v_object;
        return v_object.getField6();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 5418L)
    public static SubLObject interface_instance_method_decls(final SubLObject v_object) {
        assert subloop_structures.NIL != interface_p(v_object) : v_object;
        return v_object.getField7();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 5418L)
    public static SubLObject interface_class_method_decls(final SubLObject v_object) {
        assert subloop_structures.NIL != interface_p(v_object) : v_object;
        return v_object.getField8();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 5418L)
    public static SubLObject interface_compiled_instance_method_decls(final SubLObject v_object) {
        assert subloop_structures.NIL != interface_p(v_object) : v_object;
        return v_object.getField9();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 5418L)
    public static SubLObject interface_compiled_class_method_decls(final SubLObject v_object) {
        assert subloop_structures.NIL != interface_p(v_object) : v_object;
        return v_object.getField10();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 5418L)
    public static SubLObject interface_local_class_methods(final SubLObject v_object) {
        assert subloop_structures.NIL != interface_p(v_object) : v_object;
        return v_object.getField11();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 5418L)
    public static SubLObject interface_local_instance_methods(final SubLObject v_object) {
        assert subloop_structures.NIL != interface_p(v_object) : v_object;
        return v_object.getField12();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 5418L)
    public static SubLObject interface_mark_list(final SubLObject v_object) {
        assert subloop_structures.NIL != interface_p(v_object) : v_object;
        return v_object.getField13();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 5418L)
    public static SubLObject interface_plist(final SubLObject v_object) {
        assert subloop_structures.NIL != interface_p(v_object) : v_object;
        return v_object.getField14();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 5418L)
    public static SubLObject interface_definition_lock(final SubLObject v_object) {
        assert subloop_structures.NIL != interface_p(v_object) : v_object;
        return v_object.getField15();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 5418L)
    public static SubLObject _csetf_interface_name(final SubLObject v_object, final SubLObject value) {
        assert subloop_structures.NIL != interface_p(v_object) : v_object;
        return v_object.setField2(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 5418L)
    public static SubLObject _csetf_interface_parents(final SubLObject v_object, final SubLObject value) {
        assert subloop_structures.NIL != interface_p(v_object) : v_object;
        return v_object.setField3(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 5418L)
    public static SubLObject _csetf_interface_compiled_inheritance_path(final SubLObject v_object, final SubLObject value) {
        assert subloop_structures.NIL != interface_p(v_object) : v_object;
        return v_object.setField4(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 5418L)
    public static SubLObject _csetf_interface_subinterfaces(final SubLObject v_object, final SubLObject value) {
        assert subloop_structures.NIL != interface_p(v_object) : v_object;
        return v_object.setField5(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 5418L)
    public static SubLObject _csetf_interface_implementers(final SubLObject v_object, final SubLObject value) {
        assert subloop_structures.NIL != interface_p(v_object) : v_object;
        return v_object.setField6(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 5418L)
    public static SubLObject _csetf_interface_instance_method_decls(final SubLObject v_object, final SubLObject value) {
        assert subloop_structures.NIL != interface_p(v_object) : v_object;
        return v_object.setField7(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 5418L)
    public static SubLObject _csetf_interface_class_method_decls(final SubLObject v_object, final SubLObject value) {
        assert subloop_structures.NIL != interface_p(v_object) : v_object;
        return v_object.setField8(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 5418L)
    public static SubLObject _csetf_interface_compiled_instance_method_decls(final SubLObject v_object, final SubLObject value) {
        assert subloop_structures.NIL != interface_p(v_object) : v_object;
        return v_object.setField9(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 5418L)
    public static SubLObject _csetf_interface_compiled_class_method_decls(final SubLObject v_object, final SubLObject value) {
        assert subloop_structures.NIL != interface_p(v_object) : v_object;
        return v_object.setField10(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 5418L)
    public static SubLObject _csetf_interface_local_class_methods(final SubLObject v_object, final SubLObject value) {
        assert subloop_structures.NIL != interface_p(v_object) : v_object;
        return v_object.setField11(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 5418L)
    public static SubLObject _csetf_interface_local_instance_methods(final SubLObject v_object, final SubLObject value) {
        assert subloop_structures.NIL != interface_p(v_object) : v_object;
        return v_object.setField12(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 5418L)
    public static SubLObject _csetf_interface_mark_list(final SubLObject v_object, final SubLObject value) {
        assert subloop_structures.NIL != interface_p(v_object) : v_object;
        return v_object.setField13(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 5418L)
    public static SubLObject _csetf_interface_plist(final SubLObject v_object, final SubLObject value) {
        assert subloop_structures.NIL != interface_p(v_object) : v_object;
        return v_object.setField14(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 5418L)
    public static SubLObject _csetf_interface_definition_lock(final SubLObject v_object, final SubLObject value) {
        assert subloop_structures.NIL != interface_p(v_object) : v_object;
        return v_object.setField15(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 5418L)
    public static SubLObject make_interface(SubLObject arglist) {
        if (arglist == subloop_structures.UNPROVIDED) {
            arglist = (SubLObject)subloop_structures.NIL;
        }
        final SubLObject v_new = (SubLObject)new $interface_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = (SubLObject)subloop_structures.NIL, next = arglist; subloop_structures.NIL != next; next = conses_high.cddr(next)) {
            current_arg = next.first();
            current_value = conses_high.cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql((SubLObject)subloop_structures.$kw74$NAME)) {
                _csetf_interface_name(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)subloop_structures.$kw193$PARENTS)) {
                _csetf_interface_parents(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)subloop_structures.$kw79$COMPILED_INHERITANCE_PATH)) {
                _csetf_interface_compiled_inheritance_path(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)subloop_structures.$kw194$SUBINTERFACES)) {
                _csetf_interface_subinterfaces(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)subloop_structures.$kw195$IMPLEMENTERS)) {
                _csetf_interface_implementers(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)subloop_structures.$kw87$INSTANCE_METHOD_DECLS)) {
                _csetf_interface_instance_method_decls(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)subloop_structures.$kw88$CLASS_METHOD_DECLS)) {
                _csetf_interface_class_method_decls(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)subloop_structures.$kw196$COMPILED_INSTANCE_METHOD_DECLS)) {
                _csetf_interface_compiled_instance_method_decls(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)subloop_structures.$kw197$COMPILED_CLASS_METHOD_DECLS)) {
                _csetf_interface_compiled_class_method_decls(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)subloop_structures.$kw198$LOCAL_CLASS_METHODS)) {
                _csetf_interface_local_class_methods(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)subloop_structures.$kw199$LOCAL_INSTANCE_METHODS)) {
                _csetf_interface_local_instance_methods(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)subloop_structures.$kw200$MARK_LIST)) {
                _csetf_interface_mark_list(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)subloop_structures.$kw97$PLIST)) {
                _csetf_interface_plist(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)subloop_structures.$kw94$DEFINITION_LOCK)) {
                _csetf_interface_definition_lock(v_new, current_value);
            }
            else {
                Errors.error((SubLObject)subloop_structures.$str102$Invalid_slot__S_for_construction_, current_arg);
            }
        }
        return v_new;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 5418L)
    public static SubLObject visit_defstruct_interface(final SubLObject obj, final SubLObject visitor_fn) {
        Functions.funcall(visitor_fn, obj, (SubLObject)subloop_structures.$kw103$BEGIN, (SubLObject)subloop_structures.$sym201$MAKE_INTERFACE, (SubLObject)subloop_structures.FOURTEEN_INTEGER);
        Functions.funcall(visitor_fn, obj, (SubLObject)subloop_structures.$kw105$SLOT, (SubLObject)subloop_structures.$kw74$NAME, interface_name(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)subloop_structures.$kw105$SLOT, (SubLObject)subloop_structures.$kw193$PARENTS, interface_parents(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)subloop_structures.$kw105$SLOT, (SubLObject)subloop_structures.$kw79$COMPILED_INHERITANCE_PATH, interface_compiled_inheritance_path(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)subloop_structures.$kw105$SLOT, (SubLObject)subloop_structures.$kw194$SUBINTERFACES, interface_subinterfaces(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)subloop_structures.$kw105$SLOT, (SubLObject)subloop_structures.$kw195$IMPLEMENTERS, interface_implementers(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)subloop_structures.$kw105$SLOT, (SubLObject)subloop_structures.$kw87$INSTANCE_METHOD_DECLS, interface_instance_method_decls(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)subloop_structures.$kw105$SLOT, (SubLObject)subloop_structures.$kw88$CLASS_METHOD_DECLS, interface_class_method_decls(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)subloop_structures.$kw105$SLOT, (SubLObject)subloop_structures.$kw196$COMPILED_INSTANCE_METHOD_DECLS, interface_compiled_instance_method_decls(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)subloop_structures.$kw105$SLOT, (SubLObject)subloop_structures.$kw197$COMPILED_CLASS_METHOD_DECLS, interface_compiled_class_method_decls(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)subloop_structures.$kw105$SLOT, (SubLObject)subloop_structures.$kw198$LOCAL_CLASS_METHODS, interface_local_class_methods(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)subloop_structures.$kw105$SLOT, (SubLObject)subloop_structures.$kw199$LOCAL_INSTANCE_METHODS, interface_local_instance_methods(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)subloop_structures.$kw105$SLOT, (SubLObject)subloop_structures.$kw200$MARK_LIST, interface_mark_list(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)subloop_structures.$kw105$SLOT, (SubLObject)subloop_structures.$kw97$PLIST, interface_plist(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)subloop_structures.$kw105$SLOT, (SubLObject)subloop_structures.$kw94$DEFINITION_LOCK, interface_definition_lock(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)subloop_structures.$kw106$END, (SubLObject)subloop_structures.$sym201$MAKE_INTERFACE, (SubLObject)subloop_structures.FOURTEEN_INTEGER);
        return obj;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 5418L)
    public static SubLObject visit_defstruct_object_interface_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_interface(obj, visitor_fn);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 5766L)
    public static SubLObject with_interface(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject v_interface = (SubLObject)subloop_structures.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)subloop_structures.$list203);
        v_interface = current.first();
        final SubLObject forms;
        current = (forms = current.rest());
        final SubLObject interface_var = Symbols.make_symbol((SubLObject)subloop_structures.$str204$interface);
        return utilities_macros.generate_instance_variable_bindings_for_structure_slots(interface_var, v_interface, (SubLObject)subloop_structures.$sym205$INTERFACE_, (SubLObject)subloop_structures.$list206, forms, (SubLObject)subloop_structures.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 6290L)
    public static SubLObject with_interface_private(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject v_interface = (SubLObject)subloop_structures.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)subloop_structures.$list203);
        v_interface = current.first();
        final SubLObject forms;
        current = (forms = current.rest());
        final SubLObject interface_var = Symbols.make_symbol((SubLObject)subloop_structures.$str204$interface);
        return utilities_macros.generate_instance_variable_bindings_for_structure_slots(interface_var, v_interface, (SubLObject)subloop_structures.$sym205$INTERFACE_, (SubLObject)subloop_structures.$list206, forms, (SubLObject)subloop_structures.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 6787L)
    public static SubLObject print_interface(final SubLObject v_object, final SubLObject stream, final SubLObject depth) {
        PrintLow.format(stream, (SubLObject)subloop_structures.$str207$__Interface__S_PARENTS___S_, interface_name(v_object), interface_parents(v_object));
        return v_object;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 7014L)
    public static SubLObject method_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        print_method(v_object, stream, (SubLObject)subloop_structures.ZERO_INTEGER);
        return (SubLObject)subloop_structures.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 7014L)
    public static SubLObject method_p(final SubLObject v_object) {
        return (SubLObject)((v_object.getClass() == $method_native.class) ? subloop_structures.T : subloop_structures.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 7014L)
    public static SubLObject method_name(final SubLObject v_object) {
        assert subloop_structures.NIL != method_p(v_object) : v_object;
        return v_object.getField2();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 7014L)
    public static SubLObject method_class_name(final SubLObject v_object) {
        assert subloop_structures.NIL != method_p(v_object) : v_object;
        return v_object.getField3();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 7014L)
    public static SubLObject method_lambda_list(final SubLObject v_object) {
        assert subloop_structures.NIL != method_p(v_object) : v_object;
        return v_object.getField4();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 7014L)
    public static SubLObject method_body(final SubLObject v_object) {
        assert subloop_structures.NIL != method_p(v_object) : v_object;
        return v_object.getField5();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 7014L)
    public static SubLObject method_protection(final SubLObject v_object) {
        assert subloop_structures.NIL != method_p(v_object) : v_object;
        return v_object.getField6();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 7014L)
    public static SubLObject method_scope(final SubLObject v_object) {
        assert subloop_structures.NIL != method_p(v_object) : v_object;
        return v_object.getField7();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 7014L)
    public static SubLObject method_update_type(final SubLObject v_object) {
        assert subloop_structures.NIL != method_p(v_object) : v_object;
        return v_object.getField8();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 7014L)
    public static SubLObject method_function_name(final SubLObject v_object) {
        assert subloop_structures.NIL != method_p(v_object) : v_object;
        return v_object.getField9();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 7014L)
    public static SubLObject method_function_def(final SubLObject v_object) {
        assert subloop_structures.NIL != method_p(v_object) : v_object;
        return v_object.getField10();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 7014L)
    public static SubLObject method_before_listeners(final SubLObject v_object) {
        assert subloop_structures.NIL != method_p(v_object) : v_object;
        return v_object.getField11();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 7014L)
    public static SubLObject method_after_listeners(final SubLObject v_object) {
        assert subloop_structures.NIL != method_p(v_object) : v_object;
        return v_object.getField12();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 7014L)
    public static SubLObject method_instantiate_template(final SubLObject v_object) {
        assert subloop_structures.NIL != method_p(v_object) : v_object;
        return v_object.getField13();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 7014L)
    public static SubLObject _csetf_method_name(final SubLObject v_object, final SubLObject value) {
        assert subloop_structures.NIL != method_p(v_object) : v_object;
        return v_object.setField2(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 7014L)
    public static SubLObject _csetf_method_class_name(final SubLObject v_object, final SubLObject value) {
        assert subloop_structures.NIL != method_p(v_object) : v_object;
        return v_object.setField3(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 7014L)
    public static SubLObject _csetf_method_lambda_list(final SubLObject v_object, final SubLObject value) {
        assert subloop_structures.NIL != method_p(v_object) : v_object;
        return v_object.setField4(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 7014L)
    public static SubLObject _csetf_method_body(final SubLObject v_object, final SubLObject value) {
        assert subloop_structures.NIL != method_p(v_object) : v_object;
        return v_object.setField5(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 7014L)
    public static SubLObject _csetf_method_protection(final SubLObject v_object, final SubLObject value) {
        assert subloop_structures.NIL != method_p(v_object) : v_object;
        return v_object.setField6(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 7014L)
    public static SubLObject _csetf_method_scope(final SubLObject v_object, final SubLObject value) {
        assert subloop_structures.NIL != method_p(v_object) : v_object;
        return v_object.setField7(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 7014L)
    public static SubLObject _csetf_method_update_type(final SubLObject v_object, final SubLObject value) {
        assert subloop_structures.NIL != method_p(v_object) : v_object;
        return v_object.setField8(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 7014L)
    public static SubLObject _csetf_method_function_name(final SubLObject v_object, final SubLObject value) {
        assert subloop_structures.NIL != method_p(v_object) : v_object;
        return v_object.setField9(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 7014L)
    public static SubLObject _csetf_method_function_def(final SubLObject v_object, final SubLObject value) {
        assert subloop_structures.NIL != method_p(v_object) : v_object;
        return v_object.setField10(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 7014L)
    public static SubLObject _csetf_method_before_listeners(final SubLObject v_object, final SubLObject value) {
        assert subloop_structures.NIL != method_p(v_object) : v_object;
        return v_object.setField11(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 7014L)
    public static SubLObject _csetf_method_after_listeners(final SubLObject v_object, final SubLObject value) {
        assert subloop_structures.NIL != method_p(v_object) : v_object;
        return v_object.setField12(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 7014L)
    public static SubLObject _csetf_method_instantiate_template(final SubLObject v_object, final SubLObject value) {
        assert subloop_structures.NIL != method_p(v_object) : v_object;
        return v_object.setField13(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 7014L)
    public static SubLObject make_method(SubLObject arglist) {
        if (arglist == subloop_structures.UNPROVIDED) {
            arglist = (SubLObject)subloop_structures.NIL;
        }
        final SubLObject v_new = (SubLObject)new $method_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = (SubLObject)subloop_structures.NIL, next = arglist; subloop_structures.NIL != next; next = conses_high.cddr(next)) {
            current_arg = next.first();
            current_value = conses_high.cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql((SubLObject)subloop_structures.$kw74$NAME)) {
                _csetf_method_name(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)subloop_structures.$kw241$CLASS_NAME)) {
                _csetf_method_class_name(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)subloop_structures.$kw242$LAMBDA_LIST)) {
                _csetf_method_lambda_list(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)subloop_structures.$kw243$BODY)) {
                _csetf_method_body(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)subloop_structures.$kw244$PROTECTION)) {
                _csetf_method_protection(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)subloop_structures.$kw245$SCOPE)) {
                _csetf_method_scope(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)subloop_structures.$kw246$UPDATE_TYPE)) {
                _csetf_method_update_type(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)subloop_structures.$kw247$FUNCTION_NAME)) {
                _csetf_method_function_name(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)subloop_structures.$kw248$FUNCTION_DEF)) {
                _csetf_method_function_def(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)subloop_structures.$kw249$BEFORE_LISTENERS)) {
                _csetf_method_before_listeners(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)subloop_structures.$kw250$AFTER_LISTENERS)) {
                _csetf_method_after_listeners(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)subloop_structures.$kw251$INSTANTIATE_TEMPLATE)) {
                _csetf_method_instantiate_template(v_new, current_value);
            }
            else {
                Errors.error((SubLObject)subloop_structures.$str102$Invalid_slot__S_for_construction_, current_arg);
            }
        }
        return v_new;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 7014L)
    public static SubLObject visit_defstruct_method(final SubLObject obj, final SubLObject visitor_fn) {
        Functions.funcall(visitor_fn, obj, (SubLObject)subloop_structures.$kw103$BEGIN, (SubLObject)subloop_structures.$sym252$MAKE_METHOD, (SubLObject)subloop_structures.TWELVE_INTEGER);
        Functions.funcall(visitor_fn, obj, (SubLObject)subloop_structures.$kw105$SLOT, (SubLObject)subloop_structures.$kw74$NAME, method_name(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)subloop_structures.$kw105$SLOT, (SubLObject)subloop_structures.$kw241$CLASS_NAME, method_class_name(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)subloop_structures.$kw105$SLOT, (SubLObject)subloop_structures.$kw242$LAMBDA_LIST, method_lambda_list(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)subloop_structures.$kw105$SLOT, (SubLObject)subloop_structures.$kw243$BODY, method_body(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)subloop_structures.$kw105$SLOT, (SubLObject)subloop_structures.$kw244$PROTECTION, method_protection(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)subloop_structures.$kw105$SLOT, (SubLObject)subloop_structures.$kw245$SCOPE, method_scope(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)subloop_structures.$kw105$SLOT, (SubLObject)subloop_structures.$kw246$UPDATE_TYPE, method_update_type(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)subloop_structures.$kw105$SLOT, (SubLObject)subloop_structures.$kw247$FUNCTION_NAME, method_function_name(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)subloop_structures.$kw105$SLOT, (SubLObject)subloop_structures.$kw248$FUNCTION_DEF, method_function_def(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)subloop_structures.$kw105$SLOT, (SubLObject)subloop_structures.$kw249$BEFORE_LISTENERS, method_before_listeners(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)subloop_structures.$kw105$SLOT, (SubLObject)subloop_structures.$kw250$AFTER_LISTENERS, method_after_listeners(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)subloop_structures.$kw105$SLOT, (SubLObject)subloop_structures.$kw251$INSTANTIATE_TEMPLATE, method_instantiate_template(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)subloop_structures.$kw106$END, (SubLObject)subloop_structures.$sym252$MAKE_METHOD, (SubLObject)subloop_structures.TWELVE_INTEGER);
        return obj;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 7014L)
    public static SubLObject visit_defstruct_object_method_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_method(obj, visitor_fn);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 7251L)
    public static SubLObject with_method(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject method = (SubLObject)subloop_structures.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)subloop_structures.$list254);
        method = current.first();
        final SubLObject forms;
        current = (forms = current.rest());
        final SubLObject method_var = Symbols.make_symbol((SubLObject)subloop_structures.$str255$method);
        return utilities_macros.generate_instance_variable_bindings_for_structure_slots(method_var, method, (SubLObject)subloop_structures.$sym256$METHOD_, (SubLObject)subloop_structures.$list210, forms, (SubLObject)subloop_structures.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 7619L)
    public static SubLObject with_method_private(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject method = (SubLObject)subloop_structures.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)subloop_structures.$list254);
        method = current.first();
        final SubLObject forms;
        current = (forms = current.rest());
        final SubLObject method_var = Symbols.make_symbol((SubLObject)subloop_structures.$str255$method);
        return utilities_macros.generate_instance_variable_bindings_for_structure_slots(method_var, method, (SubLObject)subloop_structures.$sym256$METHOD_, (SubLObject)subloop_structures.$list210, forms, (SubLObject)subloop_structures.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 7999L)
    public static SubLObject print_method(final SubLObject v_object, final SubLObject stream, final SubLObject depth) {
        final SubLObject name = method_name(v_object);
        final SubLObject class_name = method_class_name(v_object);
        final SubLObject lambda_list = method_lambda_list(v_object);
        PrintLow.format(stream, (SubLObject)subloop_structures.$str257$__METHOD____S__S___S_, new SubLObject[] { name, class_name, lambda_list });
        return v_object;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 8238L)
    public static SubLObject tablify_method_list(final SubLObject method_list) {
        final SubLObject method_list_length = Sequences.length(method_list);
        final SubLObject hashtable_size = method_list_length.isZero() ? subloop_structures.$methods_initial_hashtable_size$.getGlobalValue() : Numbers.add(method_list_length, Numbers.floor(method_list_length, (SubLObject)subloop_structures.FOUR_INTEGER));
        final SubLObject hashtable = Hashtables.make_hash_table(hashtable_size, Symbols.symbol_function((SubLObject)subloop_structures.EQ), (SubLObject)subloop_structures.UNPROVIDED);
        SubLObject cdolist_list_var;
        final SubLObject reversed_method_list = cdolist_list_var = Sequences.reverse(method_list);
        SubLObject method = (SubLObject)subloop_structures.NIL;
        method = cdolist_list_var.first();
        while (subloop_structures.NIL != cdolist_list_var) {
            final SubLObject method_$1 = method;
            final SubLObject name = method_name(method_$1);
            Hashtables.sethash(name, hashtable, method);
            cdolist_list_var = cdolist_list_var.rest();
            method = cdolist_list_var.first();
        }
        return hashtable;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 8832L)
    public static SubLObject method_trace_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        print_method_trace(v_object, stream, (SubLObject)subloop_structures.ZERO_INTEGER);
        return (SubLObject)subloop_structures.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 8832L)
    public static SubLObject method_trace_p(final SubLObject v_object) {
        return (SubLObject)((v_object.getClass() == $method_trace_native.class) ? subloop_structures.T : subloop_structures.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 8832L)
    public static SubLObject method_trace_name(final SubLObject v_object) {
        assert subloop_structures.NIL != method_trace_p(v_object) : v_object;
        return v_object.getField2();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 8832L)
    public static SubLObject method_trace_class_name(final SubLObject v_object) {
        assert subloop_structures.NIL != method_trace_p(v_object) : v_object;
        return v_object.getField3();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 8832L)
    public static SubLObject method_trace_function(final SubLObject v_object) {
        assert subloop_structures.NIL != method_trace_p(v_object) : v_object;
        return v_object.getField4();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 8832L)
    public static SubLObject method_trace_outer(final SubLObject v_object) {
        assert subloop_structures.NIL != method_trace_p(v_object) : v_object;
        return v_object.getField5();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 8832L)
    public static SubLObject _csetf_method_trace_name(final SubLObject v_object, final SubLObject value) {
        assert subloop_structures.NIL != method_trace_p(v_object) : v_object;
        return v_object.setField2(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 8832L)
    public static SubLObject _csetf_method_trace_class_name(final SubLObject v_object, final SubLObject value) {
        assert subloop_structures.NIL != method_trace_p(v_object) : v_object;
        return v_object.setField3(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 8832L)
    public static SubLObject _csetf_method_trace_function(final SubLObject v_object, final SubLObject value) {
        assert subloop_structures.NIL != method_trace_p(v_object) : v_object;
        return v_object.setField4(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 8832L)
    public static SubLObject _csetf_method_trace_outer(final SubLObject v_object, final SubLObject value) {
        assert subloop_structures.NIL != method_trace_p(v_object) : v_object;
        return v_object.setField5(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 8832L)
    public static SubLObject make_method_trace(SubLObject arglist) {
        if (arglist == subloop_structures.UNPROVIDED) {
            arglist = (SubLObject)subloop_structures.NIL;
        }
        final SubLObject v_new = (SubLObject)new $method_trace_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = (SubLObject)subloop_structures.NIL, next = arglist; subloop_structures.NIL != next; next = conses_high.cddr(next)) {
            current_arg = next.first();
            current_value = conses_high.cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql((SubLObject)subloop_structures.$kw74$NAME)) {
                _csetf_method_trace_name(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)subloop_structures.$kw241$CLASS_NAME)) {
                _csetf_method_trace_class_name(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)subloop_structures.$kw276$FUNCTION)) {
                _csetf_method_trace_function(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)subloop_structures.$kw277$OUTER)) {
                _csetf_method_trace_outer(v_new, current_value);
            }
            else {
                Errors.error((SubLObject)subloop_structures.$str102$Invalid_slot__S_for_construction_, current_arg);
            }
        }
        return v_new;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 8832L)
    public static SubLObject visit_defstruct_method_trace(final SubLObject obj, final SubLObject visitor_fn) {
        Functions.funcall(visitor_fn, obj, (SubLObject)subloop_structures.$kw103$BEGIN, (SubLObject)subloop_structures.$sym278$MAKE_METHOD_TRACE, (SubLObject)subloop_structures.FOUR_INTEGER);
        Functions.funcall(visitor_fn, obj, (SubLObject)subloop_structures.$kw105$SLOT, (SubLObject)subloop_structures.$kw74$NAME, method_trace_name(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)subloop_structures.$kw105$SLOT, (SubLObject)subloop_structures.$kw241$CLASS_NAME, method_trace_class_name(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)subloop_structures.$kw105$SLOT, (SubLObject)subloop_structures.$kw276$FUNCTION, method_trace_function(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)subloop_structures.$kw105$SLOT, (SubLObject)subloop_structures.$kw277$OUTER, method_trace_outer(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)subloop_structures.$kw106$END, (SubLObject)subloop_structures.$sym278$MAKE_METHOD_TRACE, (SubLObject)subloop_structures.FOUR_INTEGER);
        return obj;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 8832L)
    public static SubLObject visit_defstruct_object_method_trace_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_method_trace(obj, visitor_fn);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 8941L)
    public static SubLObject with_method_trace(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject method_trace = (SubLObject)subloop_structures.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)subloop_structures.$list280);
        method_trace = current.first();
        final SubLObject forms;
        current = (forms = current.rest());
        final SubLObject method_trace_var = Symbols.make_symbol((SubLObject)subloop_structures.$str281$method_trace);
        return utilities_macros.generate_instance_variable_bindings_for_structure_slots(method_trace_var, method_trace, (SubLObject)subloop_structures.$sym282$METHOD_TRACE_, (SubLObject)subloop_structures.$list261, forms, (SubLObject)subloop_structures.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 9229L)
    public static SubLObject with_method_trace_private(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject method_trace = (SubLObject)subloop_structures.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)subloop_structures.$list280);
        method_trace = current.first();
        final SubLObject forms;
        current = (forms = current.rest());
        final SubLObject method_trace_var = Symbols.make_symbol((SubLObject)subloop_structures.$str281$method_trace);
        return utilities_macros.generate_instance_variable_bindings_for_structure_slots(method_trace_var, method_trace, (SubLObject)subloop_structures.$sym282$METHOD_TRACE_, (SubLObject)subloop_structures.$list261, forms, (SubLObject)subloop_structures.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 9529L)
    public static SubLObject print_method_trace(final SubLObject v_object, final SubLObject stream, final SubLObject depth) {
        final SubLObject name = method_trace_name(v_object);
        final SubLObject class_name = method_trace_class_name(v_object);
        PrintLow.format(stream, (SubLObject)subloop_structures.$str283$__METHOD_TRACE____S__S__, name, class_name);
        return v_object;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 9711L)
    public static SubLObject push_method_trace(final SubLObject name, final SubLObject class_name, final SubLObject function) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (subloop_structures.NIL != subloop_structures.$method_trace_on$.getDynamicValue(thread)) {
            final SubLObject new_method_trace = make_method_trace((SubLObject)subloop_structures.UNPROVIDED);
            _csetf_method_trace_name(new_method_trace, name);
            _csetf_method_trace_class_name(new_method_trace, class_name);
            _csetf_method_trace_function(new_method_trace, function);
            _csetf_method_trace_outer(new_method_trace, subloop_structures.$methods_current_method_trace$.getDynamicValue(thread));
            return new_method_trace;
        }
        return (SubLObject)subloop_structures.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 10175L)
    public static SubLObject method_info_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        compatibility.default_struct_print_function(v_object, stream, (SubLObject)subloop_structures.ZERO_INTEGER);
        return (SubLObject)subloop_structures.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 10175L)
    public static SubLObject method_info_p(final SubLObject v_object) {
        return (SubLObject)((v_object.getClass() == $method_info_native.class) ? subloop_structures.T : subloop_structures.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 10175L)
    public static SubLObject mi_method_name(final SubLObject v_object) {
        assert subloop_structures.NIL != method_info_p(v_object) : v_object;
        return v_object.getField2();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 10175L)
    public static SubLObject mi_class_name(final SubLObject v_object) {
        assert subloop_structures.NIL != method_info_p(v_object) : v_object;
        return v_object.getField3();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 10175L)
    public static SubLObject mi_mv_used_in_body(final SubLObject v_object) {
        assert subloop_structures.NIL != method_info_p(v_object) : v_object;
        return v_object.getField4();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 10175L)
    public static SubLObject mi_mv_modified_in_body(final SubLObject v_object) {
        assert subloop_structures.NIL != method_info_p(v_object) : v_object;
        return v_object.getField5();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 10175L)
    public static SubLObject mi_methods_used_in_body(final SubLObject v_object) {
        assert subloop_structures.NIL != method_info_p(v_object) : v_object;
        return v_object.getField6();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 10175L)
    public static SubLObject _csetf_mi_method_name(final SubLObject v_object, final SubLObject value) {
        assert subloop_structures.NIL != method_info_p(v_object) : v_object;
        return v_object.setField2(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 10175L)
    public static SubLObject _csetf_mi_class_name(final SubLObject v_object, final SubLObject value) {
        assert subloop_structures.NIL != method_info_p(v_object) : v_object;
        return v_object.setField3(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 10175L)
    public static SubLObject _csetf_mi_mv_used_in_body(final SubLObject v_object, final SubLObject value) {
        assert subloop_structures.NIL != method_info_p(v_object) : v_object;
        return v_object.setField4(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 10175L)
    public static SubLObject _csetf_mi_mv_modified_in_body(final SubLObject v_object, final SubLObject value) {
        assert subloop_structures.NIL != method_info_p(v_object) : v_object;
        return v_object.setField5(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 10175L)
    public static SubLObject _csetf_mi_methods_used_in_body(final SubLObject v_object, final SubLObject value) {
        assert subloop_structures.NIL != method_info_p(v_object) : v_object;
        return v_object.setField6(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 10175L)
    public static SubLObject make_method_info(SubLObject arglist) {
        if (arglist == subloop_structures.UNPROVIDED) {
            arglist = (SubLObject)subloop_structures.NIL;
        }
        final SubLObject v_new = (SubLObject)new $method_info_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = (SubLObject)subloop_structures.NIL, next = arglist; subloop_structures.NIL != next; next = conses_high.cddr(next)) {
            current_arg = next.first();
            current_value = conses_high.cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql((SubLObject)subloop_structures.$kw303$METHOD_NAME)) {
                _csetf_mi_method_name(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)subloop_structures.$kw241$CLASS_NAME)) {
                _csetf_mi_class_name(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)subloop_structures.$kw304$MV_USED_IN_BODY)) {
                _csetf_mi_mv_used_in_body(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)subloop_structures.$kw305$MV_MODIFIED_IN_BODY)) {
                _csetf_mi_mv_modified_in_body(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)subloop_structures.$kw306$METHODS_USED_IN_BODY)) {
                _csetf_mi_methods_used_in_body(v_new, current_value);
            }
            else {
                Errors.error((SubLObject)subloop_structures.$str102$Invalid_slot__S_for_construction_, current_arg);
            }
        }
        return v_new;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 10175L)
    public static SubLObject visit_defstruct_method_info(final SubLObject obj, final SubLObject visitor_fn) {
        Functions.funcall(visitor_fn, obj, (SubLObject)subloop_structures.$kw103$BEGIN, (SubLObject)subloop_structures.$sym307$MAKE_METHOD_INFO, (SubLObject)subloop_structures.FIVE_INTEGER);
        Functions.funcall(visitor_fn, obj, (SubLObject)subloop_structures.$kw105$SLOT, (SubLObject)subloop_structures.$kw303$METHOD_NAME, mi_method_name(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)subloop_structures.$kw105$SLOT, (SubLObject)subloop_structures.$kw241$CLASS_NAME, mi_class_name(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)subloop_structures.$kw105$SLOT, (SubLObject)subloop_structures.$kw304$MV_USED_IN_BODY, mi_mv_used_in_body(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)subloop_structures.$kw105$SLOT, (SubLObject)subloop_structures.$kw305$MV_MODIFIED_IN_BODY, mi_mv_modified_in_body(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)subloop_structures.$kw105$SLOT, (SubLObject)subloop_structures.$kw306$METHODS_USED_IN_BODY, mi_methods_used_in_body(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)subloop_structures.$kw106$END, (SubLObject)subloop_structures.$sym307$MAKE_METHOD_INFO, (SubLObject)subloop_structures.FIVE_INTEGER);
        return obj;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 10175L)
    public static SubLObject visit_defstruct_object_method_info_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_method_info(obj, visitor_fn);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 10314L)
    public static SubLObject with_method_info(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject method_info = (SubLObject)subloop_structures.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)subloop_structures.$list309);
        method_info = current.first();
        final SubLObject forms;
        current = (forms = current.rest());
        final SubLObject method_info_var = Symbols.make_symbol((SubLObject)subloop_structures.$str310$method_info);
        return utilities_macros.generate_instance_variable_bindings_for_structure_slots(method_info_var, method_info, (SubLObject)subloop_structures.$sym311$MI_, (SubLObject)subloop_structures.$list286, forms, (SubLObject)subloop_structures.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 10645L)
    public static SubLObject with_method_info_private(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject method_info = (SubLObject)subloop_structures.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)subloop_structures.$list309);
        method_info = current.first();
        final SubLObject forms;
        current = (forms = current.rest());
        final SubLObject method_info_var = Symbols.make_symbol((SubLObject)subloop_structures.$str310$method_info);
        return utilities_macros.generate_instance_variable_bindings_for_structure_slots(method_info_var, method_info, (SubLObject)subloop_structures.$sym311$MI_, (SubLObject)subloop_structures.$list286, forms, (SubLObject)subloop_structures.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 10988L)
    public static SubLObject slot_listener_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        print_slot_listener(v_object, stream, (SubLObject)subloop_structures.ZERO_INTEGER);
        return (SubLObject)subloop_structures.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 10988L)
    public static SubLObject slot_listener_p(final SubLObject v_object) {
        return (SubLObject)((v_object.getClass() == $slot_listener_native.class) ? subloop_structures.T : subloop_structures.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 10988L)
    public static SubLObject sl_slot_name(final SubLObject v_object) {
        assert subloop_structures.NIL != slot_listener_p(v_object) : v_object;
        return v_object.getField2();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 10988L)
    public static SubLObject sl_demon_type(final SubLObject v_object) {
        assert subloop_structures.NIL != slot_listener_p(v_object) : v_object;
        return v_object.getField3();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 10988L)
    public static SubLObject sl_value_trigger(final SubLObject v_object) {
        assert subloop_structures.NIL != slot_listener_p(v_object) : v_object;
        return v_object.getField4();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 10988L)
    public static SubLObject sl_functional_type(final SubLObject v_object) {
        assert subloop_structures.NIL != slot_listener_p(v_object) : v_object;
        return v_object.getField5();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 10988L)
    public static SubLObject sl_isa_method(final SubLObject v_object) {
        assert subloop_structures.NIL != slot_listener_p(v_object) : v_object;
        return v_object.getField6();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 10988L)
    public static SubLObject sl_target_instance(final SubLObject v_object) {
        assert subloop_structures.NIL != slot_listener_p(v_object) : v_object;
        return v_object.getField7();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 10988L)
    public static SubLObject _csetf_sl_slot_name(final SubLObject v_object, final SubLObject value) {
        assert subloop_structures.NIL != slot_listener_p(v_object) : v_object;
        return v_object.setField2(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 10988L)
    public static SubLObject _csetf_sl_demon_type(final SubLObject v_object, final SubLObject value) {
        assert subloop_structures.NIL != slot_listener_p(v_object) : v_object;
        return v_object.setField3(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 10988L)
    public static SubLObject _csetf_sl_value_trigger(final SubLObject v_object, final SubLObject value) {
        assert subloop_structures.NIL != slot_listener_p(v_object) : v_object;
        return v_object.setField4(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 10988L)
    public static SubLObject _csetf_sl_functional_type(final SubLObject v_object, final SubLObject value) {
        assert subloop_structures.NIL != slot_listener_p(v_object) : v_object;
        return v_object.setField5(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 10988L)
    public static SubLObject _csetf_sl_isa_method(final SubLObject v_object, final SubLObject value) {
        assert subloop_structures.NIL != slot_listener_p(v_object) : v_object;
        return v_object.setField6(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 10988L)
    public static SubLObject _csetf_sl_target_instance(final SubLObject v_object, final SubLObject value) {
        assert subloop_structures.NIL != slot_listener_p(v_object) : v_object;
        return v_object.setField7(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 10988L)
    public static SubLObject make_slot_listener(SubLObject arglist) {
        if (arglist == subloop_structures.UNPROVIDED) {
            arglist = (SubLObject)subloop_structures.NIL;
        }
        final SubLObject v_new = (SubLObject)new $slot_listener_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = (SubLObject)subloop_structures.NIL, next = arglist; subloop_structures.NIL != next; next = conses_high.cddr(next)) {
            current_arg = next.first();
            current_value = conses_high.cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql((SubLObject)subloop_structures.$kw333$SLOT_NAME)) {
                _csetf_sl_slot_name(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)subloop_structures.$kw334$DEMON_TYPE)) {
                _csetf_sl_demon_type(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)subloop_structures.$kw335$VALUE_TRIGGER)) {
                _csetf_sl_value_trigger(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)subloop_structures.$kw336$FUNCTIONAL_TYPE)) {
                _csetf_sl_functional_type(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)subloop_structures.$kw337$ISA_METHOD)) {
                _csetf_sl_isa_method(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)subloop_structures.$kw338$TARGET_INSTANCE)) {
                _csetf_sl_target_instance(v_new, current_value);
            }
            else {
                Errors.error((SubLObject)subloop_structures.$str102$Invalid_slot__S_for_construction_, current_arg);
            }
        }
        return v_new;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 10988L)
    public static SubLObject visit_defstruct_slot_listener(final SubLObject obj, final SubLObject visitor_fn) {
        Functions.funcall(visitor_fn, obj, (SubLObject)subloop_structures.$kw103$BEGIN, (SubLObject)subloop_structures.$sym339$MAKE_SLOT_LISTENER, (SubLObject)subloop_structures.SIX_INTEGER);
        Functions.funcall(visitor_fn, obj, (SubLObject)subloop_structures.$kw105$SLOT, (SubLObject)subloop_structures.$kw333$SLOT_NAME, sl_slot_name(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)subloop_structures.$kw105$SLOT, (SubLObject)subloop_structures.$kw334$DEMON_TYPE, sl_demon_type(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)subloop_structures.$kw105$SLOT, (SubLObject)subloop_structures.$kw335$VALUE_TRIGGER, sl_value_trigger(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)subloop_structures.$kw105$SLOT, (SubLObject)subloop_structures.$kw336$FUNCTIONAL_TYPE, sl_functional_type(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)subloop_structures.$kw105$SLOT, (SubLObject)subloop_structures.$kw337$ISA_METHOD, sl_isa_method(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)subloop_structures.$kw105$SLOT, (SubLObject)subloop_structures.$kw338$TARGET_INSTANCE, sl_target_instance(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)subloop_structures.$kw106$END, (SubLObject)subloop_structures.$sym339$MAKE_SLOT_LISTENER, (SubLObject)subloop_structures.SIX_INTEGER);
        return obj;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 10988L)
    public static SubLObject visit_defstruct_object_slot_listener_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_slot_listener(obj, visitor_fn);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 11653L)
    public static SubLObject print_slot_listener(final SubLObject v_object, final SubLObject stream, final SubLObject depth) {
        PrintLow.format(stream, (SubLObject)subloop_structures.$str341$__SLOT_LISTENER_for_Slot__S___S__, new SubLObject[] { sl_slot_name(v_object), sl_demon_type(v_object), sl_value_trigger(v_object) });
        return v_object;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 11875L)
    public static SubLObject with_slot_listener(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject slot_listener = (SubLObject)subloop_structures.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)subloop_structures.$list342);
        slot_listener = current.first();
        final SubLObject forms;
        current = (forms = current.rest());
        final SubLObject slot_listener_var = Symbols.make_symbol((SubLObject)subloop_structures.$str343$slot_listener);
        return utilities_macros.generate_instance_variable_bindings_for_structure_slots(slot_listener_var, slot_listener, (SubLObject)subloop_structures.$sym344$SL_, (SubLObject)subloop_structures.$list314, forms, (SubLObject)subloop_structures.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 12196L)
    public static SubLObject with_slot_listener_private(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject slot_listener = (SubLObject)subloop_structures.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)subloop_structures.$list342);
        slot_listener = current.first();
        final SubLObject forms;
        current = (forms = current.rest());
        final SubLObject slot_listener_var = Symbols.make_symbol((SubLObject)subloop_structures.$str343$slot_listener);
        return utilities_macros.generate_instance_variable_bindings_for_structure_slots(slot_listener_var, slot_listener, (SubLObject)subloop_structures.$sym344$SL_, (SubLObject)subloop_structures.$list314, forms, (SubLObject)subloop_structures.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 12529L)
    public static SubLObject slot_listener_registry_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        compatibility.default_struct_print_function(v_object, stream, (SubLObject)subloop_structures.ZERO_INTEGER);
        return (SubLObject)subloop_structures.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 12529L)
    public static SubLObject slot_listener_registry_p(final SubLObject v_object) {
        return (SubLObject)((v_object.getClass() == $slot_listener_registry_native.class) ? subloop_structures.T : subloop_structures.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 12529L)
    public static SubLObject slr_instance(final SubLObject v_object) {
        assert subloop_structures.NIL != slot_listener_registry_p(v_object) : v_object;
        return v_object.getField2();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 12529L)
    public static SubLObject slr_slot_count(final SubLObject v_object) {
        assert subloop_structures.NIL != slot_listener_registry_p(v_object) : v_object;
        return v_object.getField3();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 12529L)
    public static SubLObject slr_listeners_vector(final SubLObject v_object) {
        assert subloop_structures.NIL != slot_listener_registry_p(v_object) : v_object;
        return v_object.getField4();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 12529L)
    public static SubLObject _csetf_slr_instance(final SubLObject v_object, final SubLObject value) {
        assert subloop_structures.NIL != slot_listener_registry_p(v_object) : v_object;
        return v_object.setField2(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 12529L)
    public static SubLObject _csetf_slr_slot_count(final SubLObject v_object, final SubLObject value) {
        assert subloop_structures.NIL != slot_listener_registry_p(v_object) : v_object;
        return v_object.setField3(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 12529L)
    public static SubLObject _csetf_slr_listeners_vector(final SubLObject v_object, final SubLObject value) {
        assert subloop_structures.NIL != slot_listener_registry_p(v_object) : v_object;
        return v_object.setField4(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 12529L)
    public static SubLObject make_slot_listener_registry(SubLObject arglist) {
        if (arglist == subloop_structures.UNPROVIDED) {
            arglist = (SubLObject)subloop_structures.NIL;
        }
        final SubLObject v_new = (SubLObject)new $slot_listener_registry_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = (SubLObject)subloop_structures.NIL, next = arglist; subloop_structures.NIL != next; next = conses_high.cddr(next)) {
            current_arg = next.first();
            current_value = conses_high.cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql((SubLObject)subloop_structures.$kw359$INSTANCE)) {
                _csetf_slr_instance(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)subloop_structures.$kw360$SLOT_COUNT)) {
                _csetf_slr_slot_count(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)subloop_structures.$kw361$LISTENERS_VECTOR)) {
                _csetf_slr_listeners_vector(v_new, current_value);
            }
            else {
                Errors.error((SubLObject)subloop_structures.$str102$Invalid_slot__S_for_construction_, current_arg);
            }
        }
        return v_new;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 12529L)
    public static SubLObject visit_defstruct_slot_listener_registry(final SubLObject obj, final SubLObject visitor_fn) {
        Functions.funcall(visitor_fn, obj, (SubLObject)subloop_structures.$kw103$BEGIN, (SubLObject)subloop_structures.$sym362$MAKE_SLOT_LISTENER_REGISTRY, (SubLObject)subloop_structures.THREE_INTEGER);
        Functions.funcall(visitor_fn, obj, (SubLObject)subloop_structures.$kw105$SLOT, (SubLObject)subloop_structures.$kw359$INSTANCE, slr_instance(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)subloop_structures.$kw105$SLOT, (SubLObject)subloop_structures.$kw360$SLOT_COUNT, slr_slot_count(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)subloop_structures.$kw105$SLOT, (SubLObject)subloop_structures.$kw361$LISTENERS_VECTOR, slr_listeners_vector(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)subloop_structures.$kw106$END, (SubLObject)subloop_structures.$sym362$MAKE_SLOT_LISTENER_REGISTRY, (SubLObject)subloop_structures.THREE_INTEGER);
        return obj;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 12529L)
    public static SubLObject visit_defstruct_object_slot_listener_registry_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_slot_listener_registry(obj, visitor_fn);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 12822L)
    public static SubLObject print_slot_listener_registry(final SubLObject v_object, final SubLObject stream, final SubLObject depth) {
        PrintLow.format(stream, (SubLObject)subloop_structures.$str364$__SLOT_LISTENER_REGISTRY___S__SLO, slr_instance(v_object), slr_slot_count(v_object));
        return v_object;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 13036L)
    public static SubLObject with_slot_listener_registry(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject slot_listener_registry = (SubLObject)subloop_structures.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)subloop_structures.$list365);
        slot_listener_registry = current.first();
        final SubLObject forms;
        current = (forms = current.rest());
        final SubLObject slot_listener_registry_var = Symbols.make_symbol((SubLObject)subloop_structures.$str366$slot_listener_registry);
        return utilities_macros.generate_instance_variable_bindings_for_structure_slots(slot_listener_registry_var, slot_listener_registry, (SubLObject)subloop_structures.$sym367$SLR_, (SubLObject)subloop_structures.$list347, forms, (SubLObject)subloop_structures.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 13371L)
    public static SubLObject with_slot_listener_registry_private(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject slot_listener_registry = (SubLObject)subloop_structures.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)subloop_structures.$list365);
        slot_listener_registry = current.first();
        final SubLObject forms;
        current = (forms = current.rest());
        final SubLObject slot_listener_registry_var = Symbols.make_symbol((SubLObject)subloop_structures.$str366$slot_listener_registry);
        return utilities_macros.generate_instance_variable_bindings_for_structure_slots(slot_listener_registry_var, slot_listener_registry, (SubLObject)subloop_structures.$sym367$SLR_, (SubLObject)subloop_structures.$list347, forms, (SubLObject)subloop_structures.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 13718L)
    public static SubLObject method_listener_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        print_method_listener(v_object, stream, (SubLObject)subloop_structures.ZERO_INTEGER);
        return (SubLObject)subloop_structures.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 13718L)
    public static SubLObject method_listener_p(final SubLObject v_object) {
        return (SubLObject)((v_object.getClass() == $method_listener_native.class) ? subloop_structures.T : subloop_structures.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 13718L)
    public static SubLObject ml_owning_method_name(final SubLObject v_object) {
        assert subloop_structures.NIL != method_listener_p(v_object) : v_object;
        return v_object.getField2();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 13718L)
    public static SubLObject ml_owning_class_name(final SubLObject v_object) {
        assert subloop_structures.NIL != method_listener_p(v_object) : v_object;
        return v_object.getField3();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 13718L)
    public static SubLObject ml_demon_type(final SubLObject v_object) {
        assert subloop_structures.NIL != method_listener_p(v_object) : v_object;
        return v_object.getField4();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 13718L)
    public static SubLObject ml_detail(final SubLObject v_object) {
        assert subloop_structures.NIL != method_listener_p(v_object) : v_object;
        return v_object.getField5();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 13718L)
    public static SubLObject _csetf_ml_owning_method_name(final SubLObject v_object, final SubLObject value) {
        assert subloop_structures.NIL != method_listener_p(v_object) : v_object;
        return v_object.setField2(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 13718L)
    public static SubLObject _csetf_ml_owning_class_name(final SubLObject v_object, final SubLObject value) {
        assert subloop_structures.NIL != method_listener_p(v_object) : v_object;
        return v_object.setField3(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 13718L)
    public static SubLObject _csetf_ml_demon_type(final SubLObject v_object, final SubLObject value) {
        assert subloop_structures.NIL != method_listener_p(v_object) : v_object;
        return v_object.setField4(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 13718L)
    public static SubLObject _csetf_ml_detail(final SubLObject v_object, final SubLObject value) {
        assert subloop_structures.NIL != method_listener_p(v_object) : v_object;
        return v_object.setField5(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 13718L)
    public static SubLObject make_method_listener(SubLObject arglist) {
        if (arglist == subloop_structures.UNPROVIDED) {
            arglist = (SubLObject)subloop_structures.NIL;
        }
        final SubLObject v_new = (SubLObject)new $method_listener_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = (SubLObject)subloop_structures.NIL, next = arglist; subloop_structures.NIL != next; next = conses_high.cddr(next)) {
            current_arg = next.first();
            current_value = conses_high.cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql((SubLObject)subloop_structures.$kw385$OWNING_METHOD_NAME)) {
                _csetf_ml_owning_method_name(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)subloop_structures.$kw386$OWNING_CLASS_NAME)) {
                _csetf_ml_owning_class_name(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)subloop_structures.$kw334$DEMON_TYPE)) {
                _csetf_ml_demon_type(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)subloop_structures.$kw387$DETAIL)) {
                _csetf_ml_detail(v_new, current_value);
            }
            else {
                Errors.error((SubLObject)subloop_structures.$str102$Invalid_slot__S_for_construction_, current_arg);
            }
        }
        return v_new;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 13718L)
    public static SubLObject visit_defstruct_method_listener(final SubLObject obj, final SubLObject visitor_fn) {
        Functions.funcall(visitor_fn, obj, (SubLObject)subloop_structures.$kw103$BEGIN, (SubLObject)subloop_structures.$sym388$MAKE_METHOD_LISTENER, (SubLObject)subloop_structures.FOUR_INTEGER);
        Functions.funcall(visitor_fn, obj, (SubLObject)subloop_structures.$kw105$SLOT, (SubLObject)subloop_structures.$kw385$OWNING_METHOD_NAME, ml_owning_method_name(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)subloop_structures.$kw105$SLOT, (SubLObject)subloop_structures.$kw386$OWNING_CLASS_NAME, ml_owning_class_name(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)subloop_structures.$kw105$SLOT, (SubLObject)subloop_structures.$kw334$DEMON_TYPE, ml_demon_type(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)subloop_structures.$kw105$SLOT, (SubLObject)subloop_structures.$kw387$DETAIL, ml_detail(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)subloop_structures.$kw106$END, (SubLObject)subloop_structures.$sym388$MAKE_METHOD_LISTENER, (SubLObject)subloop_structures.FOUR_INTEGER);
        return obj;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 13718L)
    public static SubLObject visit_defstruct_object_method_listener_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_method_listener(obj, visitor_fn);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 14066L)
    public static SubLObject with_method_listener(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject method_listener = (SubLObject)subloop_structures.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)subloop_structures.$list390);
        method_listener = current.first();
        final SubLObject forms;
        current = (forms = current.rest());
        final SubLObject method_listener_var = Symbols.make_symbol((SubLObject)subloop_structures.$str391$method_listener);
        return utilities_macros.generate_instance_variable_bindings_for_structure_slots(method_listener_var, method_listener, (SubLObject)subloop_structures.$sym392$ML_, (SubLObject)subloop_structures.$list370, forms, (SubLObject)subloop_structures.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 14446L)
    public static SubLObject with_method_listener_private(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject method_listener = (SubLObject)subloop_structures.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)subloop_structures.$list390);
        method_listener = current.first();
        final SubLObject forms;
        current = (forms = current.rest());
        final SubLObject method_listener_var = Symbols.make_symbol((SubLObject)subloop_structures.$str391$method_listener);
        return utilities_macros.generate_instance_variable_bindings_for_structure_slots(method_listener_var, method_listener, (SubLObject)subloop_structures.$sym392$ML_, (SubLObject)subloop_structures.$list370, forms, (SubLObject)subloop_structures.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 14768L)
    public static SubLObject function_detail_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        compatibility.default_struct_print_function(v_object, stream, (SubLObject)subloop_structures.ZERO_INTEGER);
        return (SubLObject)subloop_structures.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 14768L)
    public static SubLObject function_detail_p(final SubLObject v_object) {
        return (SubLObject)((v_object.getClass() == $function_detail_native.class) ? subloop_structures.T : subloop_structures.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 14768L)
    public static SubLObject fd_function_name(final SubLObject v_object) {
        assert subloop_structures.NIL != function_detail_p(v_object) : v_object;
        return v_object.getField2();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 14768L)
    public static SubLObject fd_arglist(final SubLObject v_object) {
        assert subloop_structures.NIL != function_detail_p(v_object) : v_object;
        return v_object.getField3();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 14768L)
    public static SubLObject _csetf_fd_function_name(final SubLObject v_object, final SubLObject value) {
        assert subloop_structures.NIL != function_detail_p(v_object) : v_object;
        return v_object.setField2(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 14768L)
    public static SubLObject _csetf_fd_arglist(final SubLObject v_object, final SubLObject value) {
        assert subloop_structures.NIL != function_detail_p(v_object) : v_object;
        return v_object.setField3(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 14768L)
    public static SubLObject make_function_detail(SubLObject arglist) {
        if (arglist == subloop_structures.UNPROVIDED) {
            arglist = (SubLObject)subloop_structures.NIL;
        }
        final SubLObject v_new = (SubLObject)new $function_detail_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = (SubLObject)subloop_structures.NIL, next = arglist; subloop_structures.NIL != next; next = conses_high.cddr(next)) {
            current_arg = next.first();
            current_value = conses_high.cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql((SubLObject)subloop_structures.$kw247$FUNCTION_NAME)) {
                _csetf_fd_function_name(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)subloop_structures.$kw405$ARGLIST)) {
                _csetf_fd_arglist(v_new, current_value);
            }
            else {
                Errors.error((SubLObject)subloop_structures.$str102$Invalid_slot__S_for_construction_, current_arg);
            }
        }
        return v_new;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 14768L)
    public static SubLObject visit_defstruct_function_detail(final SubLObject obj, final SubLObject visitor_fn) {
        Functions.funcall(visitor_fn, obj, (SubLObject)subloop_structures.$kw103$BEGIN, (SubLObject)subloop_structures.$sym406$MAKE_FUNCTION_DETAIL, (SubLObject)subloop_structures.TWO_INTEGER);
        Functions.funcall(visitor_fn, obj, (SubLObject)subloop_structures.$kw105$SLOT, (SubLObject)subloop_structures.$kw247$FUNCTION_NAME, fd_function_name(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)subloop_structures.$kw105$SLOT, (SubLObject)subloop_structures.$kw405$ARGLIST, fd_arglist(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)subloop_structures.$kw106$END, (SubLObject)subloop_structures.$sym406$MAKE_FUNCTION_DETAIL, (SubLObject)subloop_structures.TWO_INTEGER);
        return obj;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 14768L)
    public static SubLObject visit_defstruct_object_function_detail_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_function_detail(obj, visitor_fn);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 14847L)
    public static SubLObject with_function_detail(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject function_detail = (SubLObject)subloop_structures.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)subloop_structures.$list408);
        function_detail = current.first();
        final SubLObject forms;
        current = (forms = current.rest());
        final SubLObject function_detail_var = Symbols.make_symbol((SubLObject)subloop_structures.$str409$function_detail);
        return utilities_macros.generate_instance_variable_bindings_for_structure_slots(function_detail_var, function_detail, (SubLObject)subloop_structures.$sym410$FD_, (SubLObject)subloop_structures.$list395, forms, (SubLObject)subloop_structures.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 15124L)
    public static SubLObject with_function_detail_private(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject function_detail = (SubLObject)subloop_structures.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)subloop_structures.$list408);
        function_detail = current.first();
        final SubLObject forms;
        current = (forms = current.rest());
        final SubLObject function_detail_var = Symbols.make_symbol((SubLObject)subloop_structures.$str409$function_detail);
        return utilities_macros.generate_instance_variable_bindings_for_structure_slots(function_detail_var, function_detail, (SubLObject)subloop_structures.$sym410$FD_, (SubLObject)subloop_structures.$list395, forms, (SubLObject)subloop_structures.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 15413L)
    public static SubLObject method_detail_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        compatibility.default_struct_print_function(v_object, stream, (SubLObject)subloop_structures.ZERO_INTEGER);
        return (SubLObject)subloop_structures.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 15413L)
    public static SubLObject method_detail_p(final SubLObject v_object) {
        return (SubLObject)((v_object.getClass() == $method_detail_native.class) ? subloop_structures.T : subloop_structures.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 15413L)
    public static SubLObject md_method_name(final SubLObject v_object) {
        assert subloop_structures.NIL != method_detail_p(v_object) : v_object;
        return v_object.getField2();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 15413L)
    public static SubLObject md_function_name(final SubLObject v_object) {
        assert subloop_structures.NIL != method_detail_p(v_object) : v_object;
        return v_object.getField3();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 15413L)
    public static SubLObject md_arglist(final SubLObject v_object) {
        assert subloop_structures.NIL != method_detail_p(v_object) : v_object;
        return v_object.getField4();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 15413L)
    public static SubLObject md_instance(final SubLObject v_object) {
        assert subloop_structures.NIL != method_detail_p(v_object) : v_object;
        return v_object.getField5();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 15413L)
    public static SubLObject _csetf_md_method_name(final SubLObject v_object, final SubLObject value) {
        assert subloop_structures.NIL != method_detail_p(v_object) : v_object;
        return v_object.setField2(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 15413L)
    public static SubLObject _csetf_md_function_name(final SubLObject v_object, final SubLObject value) {
        assert subloop_structures.NIL != method_detail_p(v_object) : v_object;
        return v_object.setField3(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 15413L)
    public static SubLObject _csetf_md_arglist(final SubLObject v_object, final SubLObject value) {
        assert subloop_structures.NIL != method_detail_p(v_object) : v_object;
        return v_object.setField4(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 15413L)
    public static SubLObject _csetf_md_instance(final SubLObject v_object, final SubLObject value) {
        assert subloop_structures.NIL != method_detail_p(v_object) : v_object;
        return v_object.setField5(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 15413L)
    public static SubLObject make_method_detail(SubLObject arglist) {
        if (arglist == subloop_structures.UNPROVIDED) {
            arglist = (SubLObject)subloop_structures.NIL;
        }
        final SubLObject v_new = (SubLObject)new $method_detail_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = (SubLObject)subloop_structures.NIL, next = arglist; subloop_structures.NIL != next; next = conses_high.cddr(next)) {
            current_arg = next.first();
            current_value = conses_high.cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql((SubLObject)subloop_structures.$kw303$METHOD_NAME)) {
                _csetf_md_method_name(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)subloop_structures.$kw247$FUNCTION_NAME)) {
                _csetf_md_function_name(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)subloop_structures.$kw405$ARGLIST)) {
                _csetf_md_arglist(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)subloop_structures.$kw359$INSTANCE)) {
                _csetf_md_instance(v_new, current_value);
            }
            else {
                Errors.error((SubLObject)subloop_structures.$str102$Invalid_slot__S_for_construction_, current_arg);
            }
        }
        return v_new;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 15413L)
    public static SubLObject visit_defstruct_method_detail(final SubLObject obj, final SubLObject visitor_fn) {
        Functions.funcall(visitor_fn, obj, (SubLObject)subloop_structures.$kw103$BEGIN, (SubLObject)subloop_structures.$sym427$MAKE_METHOD_DETAIL, (SubLObject)subloop_structures.FOUR_INTEGER);
        Functions.funcall(visitor_fn, obj, (SubLObject)subloop_structures.$kw105$SLOT, (SubLObject)subloop_structures.$kw303$METHOD_NAME, md_method_name(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)subloop_structures.$kw105$SLOT, (SubLObject)subloop_structures.$kw247$FUNCTION_NAME, md_function_name(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)subloop_structures.$kw105$SLOT, (SubLObject)subloop_structures.$kw405$ARGLIST, md_arglist(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)subloop_structures.$kw105$SLOT, (SubLObject)subloop_structures.$kw359$INSTANCE, md_instance(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)subloop_structures.$kw106$END, (SubLObject)subloop_structures.$sym427$MAKE_METHOD_DETAIL, (SubLObject)subloop_structures.FOUR_INTEGER);
        return obj;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 15413L)
    public static SubLObject visit_defstruct_object_method_detail_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_method_detail(obj, visitor_fn);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 15515L)
    public static SubLObject with_method_detail(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject method_detail = (SubLObject)subloop_structures.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)subloop_structures.$list429);
        method_detail = current.first();
        final SubLObject forms;
        current = (forms = current.rest());
        final SubLObject method_detail_var = Symbols.make_symbol((SubLObject)subloop_structures.$str430$method_detail);
        return utilities_macros.generate_instance_variable_bindings_for_structure_slots(method_detail_var, method_detail, (SubLObject)subloop_structures.$sym431$MD_, (SubLObject)subloop_structures.$list413, forms, (SubLObject)subloop_structures.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 15801L)
    public static SubLObject with_method_detail_private(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject method_detail = (SubLObject)subloop_structures.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)subloop_structures.$list429);
        method_detail = current.first();
        final SubLObject forms;
        current = (forms = current.rest());
        final SubLObject method_detail_var = Symbols.make_symbol((SubLObject)subloop_structures.$str430$method_detail);
        return utilities_macros.generate_instance_variable_bindings_for_structure_slots(method_detail_var, method_detail, (SubLObject)subloop_structures.$sym431$MD_, (SubLObject)subloop_structures.$list413, forms, (SubLObject)subloop_structures.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 16099L)
    public static SubLObject method_listener_registry_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        compatibility.default_struct_print_function(v_object, stream, (SubLObject)subloop_structures.ZERO_INTEGER);
        return (SubLObject)subloop_structures.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 16099L)
    public static SubLObject method_listener_registry_p(final SubLObject v_object) {
        return (SubLObject)((v_object.getClass() == $method_listener_registry_native.class) ? subloop_structures.T : subloop_structures.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 16099L)
    public static SubLObject mlr_instance(final SubLObject v_object) {
        assert subloop_structures.NIL != method_listener_registry_p(v_object) : v_object;
        return v_object.getField2();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 16099L)
    public static SubLObject mlr_listener_alist(final SubLObject v_object) {
        assert subloop_structures.NIL != method_listener_registry_p(v_object) : v_object;
        return v_object.getField3();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 16099L)
    public static SubLObject _csetf_mlr_instance(final SubLObject v_object, final SubLObject value) {
        assert subloop_structures.NIL != method_listener_registry_p(v_object) : v_object;
        return v_object.setField2(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 16099L)
    public static SubLObject _csetf_mlr_listener_alist(final SubLObject v_object, final SubLObject value) {
        assert subloop_structures.NIL != method_listener_registry_p(v_object) : v_object;
        return v_object.setField3(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 16099L)
    public static SubLObject make_method_listener_registry(SubLObject arglist) {
        if (arglist == subloop_structures.UNPROVIDED) {
            arglist = (SubLObject)subloop_structures.NIL;
        }
        final SubLObject v_new = (SubLObject)new $method_listener_registry_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = (SubLObject)subloop_structures.NIL, next = arglist; subloop_structures.NIL != next; next = conses_high.cddr(next)) {
            current_arg = next.first();
            current_value = conses_high.cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql((SubLObject)subloop_structures.$kw359$INSTANCE)) {
                _csetf_mlr_instance(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)subloop_structures.$kw444$LISTENER_ALIST)) {
                _csetf_mlr_listener_alist(v_new, current_value);
            }
            else {
                Errors.error((SubLObject)subloop_structures.$str102$Invalid_slot__S_for_construction_, current_arg);
            }
        }
        return v_new;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 16099L)
    public static SubLObject visit_defstruct_method_listener_registry(final SubLObject obj, final SubLObject visitor_fn) {
        Functions.funcall(visitor_fn, obj, (SubLObject)subloop_structures.$kw103$BEGIN, (SubLObject)subloop_structures.$sym445$MAKE_METHOD_LISTENER_REGISTRY, (SubLObject)subloop_structures.TWO_INTEGER);
        Functions.funcall(visitor_fn, obj, (SubLObject)subloop_structures.$kw105$SLOT, (SubLObject)subloop_structures.$kw359$INSTANCE, mlr_instance(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)subloop_structures.$kw105$SLOT, (SubLObject)subloop_structures.$kw444$LISTENER_ALIST, mlr_listener_alist(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)subloop_structures.$kw106$END, (SubLObject)subloop_structures.$sym445$MAKE_METHOD_LISTENER_REGISTRY, (SubLObject)subloop_structures.TWO_INTEGER);
        return obj;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 16099L)
    public static SubLObject visit_defstruct_object_method_listener_registry_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_method_listener_registry(obj, visitor_fn);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 16190L)
    public static SubLObject with_method_listener_registry(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject method_listener_registry = (SubLObject)subloop_structures.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)subloop_structures.$list447);
        method_listener_registry = current.first();
        final SubLObject forms;
        current = (forms = current.rest());
        final SubLObject mlr_var = Symbols.make_symbol((SubLObject)subloop_structures.$str448$method_listener_registry);
        return utilities_macros.generate_instance_variable_bindings_for_structure_slots(mlr_var, method_listener_registry, (SubLObject)subloop_structures.$sym449$MLR_, (SubLObject)subloop_structures.$list434, forms, (SubLObject)subloop_structures.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 16482L)
    public static SubLObject with_method_listener_registry_private(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject method_listener_registry = (SubLObject)subloop_structures.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)subloop_structures.$list447);
        method_listener_registry = current.first();
        final SubLObject forms;
        current = (forms = current.rest());
        final SubLObject mlr_var = Symbols.make_symbol((SubLObject)subloop_structures.$str448$method_listener_registry);
        return utilities_macros.generate_instance_variable_bindings_for_structure_slots(mlr_var, method_listener_registry, (SubLObject)subloop_structures.$sym449$MLR_, (SubLObject)subloop_structures.$list434, forms, (SubLObject)subloop_structures.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/subloop-structures.lisp", position = 16786L)
    public static SubLObject print_method_listener(final SubLObject v_object, final SubLObject stream, final SubLObject depth) {
        final SubLObject owning_method_name = ml_owning_method_name(v_object);
        final SubLObject owning_class_name = ml_owning_class_name(v_object);
        final SubLObject detail = ml_detail(v_object);
        PrintLow.format(stream, (SubLObject)subloop_structures.$str450$__METHOD_LISTENER____S__S_, owning_method_name, owning_class_name);
        if (subloop_structures.NIL != function_detail_p(detail)) {
            PrintLow.format(stream, (SubLObject)subloop_structures.$str451$_monitored_by_function__S_, fd_function_name(detail));
        }
        else if (subloop_structures.NIL != method_detail_p(detail)) {
            final SubLObject method_detail = detail;
            final SubLObject method_name = md_method_name(method_detail);
            final SubLObject instance = md_instance(method_detail);
            PrintLow.format(stream, (SubLObject)subloop_structures.$str452$_monitored_by_method___S__S__, method_name, instance);
        }
        else {
            PrintLow.format(stream, (SubLObject)subloop_structures.$str453$_);
        }
        return v_object;
    }
    
    public static SubLObject declare_subloop_structures_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_structures", "class_print_function_trampoline", "CLASS-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_structures", "class_p", "CLASS-P", 1, 0, false);
        new $class_p$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_structures", "class_name", "CLASS-NAME", 1, 0, false);
        new $class_name$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_structures", "class_parent", "CLASS-PARENT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_structures", "class_subclasses", "CLASS-SUBCLASSES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_structures", "class_interface_names", "CLASS-INTERFACE-NAMES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_structures", "class_interfaces", "CLASS-INTERFACES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_structures", "class_compiled_inheritance_path", "CLASS-COMPILED-INHERITANCE-PATH", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_structures", "class_instance_var_decls", "CLASS-INSTANCE-VAR-DECLS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_structures", "class_class_var_decls", "CLASS-CLASS-VAR-DECLS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_structures", "class_compiled_instance_slot_access_alist", "CLASS-COMPILED-INSTANCE-SLOT-ACCESS-ALIST", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_structures", "class_compiled_instance_boolean_slot_access_alist", "CLASS-COMPILED-INSTANCE-BOOLEAN-SLOT-ACCESS-ALIST", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_structures", "class_compiled_class_slot_access_alist", "CLASS-COMPILED-CLASS-SLOT-ACCESS-ALIST", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_structures", "class_compiled_class_boolean_slot_access_alist", "CLASS-COMPILED-CLASS-BOOLEAN-SLOT-ACCESS-ALIST", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_structures", "class_slot_accessor_alist", "CLASS-SLOT-ACCESSOR-ALIST", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_structures", "class_instance_method_decls", "CLASS-INSTANCE-METHOD-DECLS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_structures", "class_class_method_decls", "CLASS-CLASS-METHOD-DECLS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_structures", "class_boolean_slots", "CLASS-BOOLEAN-SLOTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_structures", "class_any_slots", "CLASS-ANY-SLOTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_structures", "class_compiled_instance_method_access_alist", "CLASS-COMPILED-INSTANCE-METHOD-ACCESS-ALIST", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_structures", "class_compiled_class_method_access_alist", "CLASS-COMPILED-CLASS-METHOD-ACCESS-ALIST", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_structures", "class_tablified_instance_methods", "CLASS-TABLIFIED-INSTANCE-METHODS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_structures", "class_definition_lock", "CLASS-DEFINITION-LOCK", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_structures", "class_access_lock", "CLASS-ACCESS-LOCK", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_structures", "class_synchronized_slots_p", "CLASS-SYNCHRONIZED-SLOTS-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_structures", "class_plist", "CLASS-PLIST", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_structures", "class_class_initialization_function", "CLASS-CLASS-INITIALIZATION-FUNCTION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_structures", "class_class_initialized_p", "CLASS-CLASS-INITIALIZED-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_structures", "class_instance_initialization_function", "CLASS-INSTANCE-INITIALIZATION-FUNCTION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_structures", "class_class_properties", "CLASS-CLASS-PROPERTIES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_structures", "_csetf_class_name", "_CSETF-CLASS-NAME", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_structures", "_csetf_class_parent", "_CSETF-CLASS-PARENT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_structures", "_csetf_class_subclasses", "_CSETF-CLASS-SUBCLASSES", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_structures", "_csetf_class_interface_names", "_CSETF-CLASS-INTERFACE-NAMES", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_structures", "_csetf_class_interfaces", "_CSETF-CLASS-INTERFACES", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_structures", "_csetf_class_compiled_inheritance_path", "_CSETF-CLASS-COMPILED-INHERITANCE-PATH", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_structures", "_csetf_class_instance_var_decls", "_CSETF-CLASS-INSTANCE-VAR-DECLS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_structures", "_csetf_class_class_var_decls", "_CSETF-CLASS-CLASS-VAR-DECLS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_structures", "_csetf_class_compiled_instance_slot_access_alist", "_CSETF-CLASS-COMPILED-INSTANCE-SLOT-ACCESS-ALIST", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_structures", "_csetf_class_compiled_instance_boolean_slot_access_alist", "_CSETF-CLASS-COMPILED-INSTANCE-BOOLEAN-SLOT-ACCESS-ALIST", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_structures", "_csetf_class_compiled_class_slot_access_alist", "_CSETF-CLASS-COMPILED-CLASS-SLOT-ACCESS-ALIST", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_structures", "_csetf_class_compiled_class_boolean_slot_access_alist", "_CSETF-CLASS-COMPILED-CLASS-BOOLEAN-SLOT-ACCESS-ALIST", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_structures", "_csetf_class_slot_accessor_alist", "_CSETF-CLASS-SLOT-ACCESSOR-ALIST", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_structures", "_csetf_class_instance_method_decls", "_CSETF-CLASS-INSTANCE-METHOD-DECLS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_structures", "_csetf_class_class_method_decls", "_CSETF-CLASS-CLASS-METHOD-DECLS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_structures", "_csetf_class_boolean_slots", "_CSETF-CLASS-BOOLEAN-SLOTS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_structures", "_csetf_class_any_slots", "_CSETF-CLASS-ANY-SLOTS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_structures", "_csetf_class_compiled_instance_method_access_alist", "_CSETF-CLASS-COMPILED-INSTANCE-METHOD-ACCESS-ALIST", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_structures", "_csetf_class_compiled_class_method_access_alist", "_CSETF-CLASS-COMPILED-CLASS-METHOD-ACCESS-ALIST", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_structures", "_csetf_class_tablified_instance_methods", "_CSETF-CLASS-TABLIFIED-INSTANCE-METHODS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_structures", "_csetf_class_definition_lock", "_CSETF-CLASS-DEFINITION-LOCK", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_structures", "_csetf_class_access_lock", "_CSETF-CLASS-ACCESS-LOCK", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_structures", "_csetf_class_synchronized_slots_p", "_CSETF-CLASS-SYNCHRONIZED-SLOTS-P", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_structures", "_csetf_class_plist", "_CSETF-CLASS-PLIST", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_structures", "_csetf_class_class_initialization_function", "_CSETF-CLASS-CLASS-INITIALIZATION-FUNCTION", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_structures", "_csetf_class_class_initialized_p", "_CSETF-CLASS-CLASS-INITIALIZED-P", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_structures", "_csetf_class_instance_initialization_function", "_CSETF-CLASS-INSTANCE-INITIALIZATION-FUNCTION", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_structures", "_csetf_class_class_properties", "_CSETF-CLASS-CLASS-PROPERTIES", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_structures", "make_class", "MAKE-CLASS", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_structures", "visit_defstruct_class", "VISIT-DEFSTRUCT-CLASS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_structures", "visit_defstruct_object_class_method", "VISIT-DEFSTRUCT-OBJECT-CLASS-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_structures", "create_class", "CREATE-CLASS", 0, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.subloop_structures", "with_class", "WITH-CLASS");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.subloop_structures", "with_class_private", "WITH-CLASS-PRIVATE");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_structures", "print_class", "PRINT-CLASS", 3, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.subloop_structures", "def_class_property", "DEF-CLASS-PROPERTY");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_structures", "instance_print_function_trampoline", "INSTANCE-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_structures", "instance_p", "INSTANCE-P", 1, 0, false);
        new $instance_p$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_structures", "instance_class", "INSTANCE-CLASS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_structures", "instance_boolean_slots", "INSTANCE-BOOLEAN-SLOTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_structures", "instance_any_slots", "INSTANCE-ANY-SLOTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_structures", "instance_plist", "INSTANCE-PLIST", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_structures", "_csetf_instance_class", "_CSETF-INSTANCE-CLASS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_structures", "_csetf_instance_boolean_slots", "_CSETF-INSTANCE-BOOLEAN-SLOTS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_structures", "_csetf_instance_any_slots", "_CSETF-INSTANCE-ANY-SLOTS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_structures", "_csetf_instance_plist", "_CSETF-INSTANCE-PLIST", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_structures", "make_instance", "MAKE-INSTANCE", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_structures", "visit_defstruct_instance", "VISIT-DEFSTRUCT-INSTANCE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_structures", "visit_defstruct_object_instance_method", "VISIT-DEFSTRUCT-OBJECT-INSTANCE-METHOD", 2, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.subloop_structures", "with_instance", "WITH-INSTANCE");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_structures", "print_instance", "PRINT-INSTANCE", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_structures", "interface_print_function_trampoline", "INTERFACE-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_structures", "interface_p", "INTERFACE-P", 1, 0, false);
        new $interface_p$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_structures", "interface_name", "INTERFACE-NAME", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_structures", "interface_parents", "INTERFACE-PARENTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_structures", "interface_compiled_inheritance_path", "INTERFACE-COMPILED-INHERITANCE-PATH", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_structures", "interface_subinterfaces", "INTERFACE-SUBINTERFACES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_structures", "interface_implementers", "INTERFACE-IMPLEMENTERS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_structures", "interface_instance_method_decls", "INTERFACE-INSTANCE-METHOD-DECLS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_structures", "interface_class_method_decls", "INTERFACE-CLASS-METHOD-DECLS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_structures", "interface_compiled_instance_method_decls", "INTERFACE-COMPILED-INSTANCE-METHOD-DECLS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_structures", "interface_compiled_class_method_decls", "INTERFACE-COMPILED-CLASS-METHOD-DECLS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_structures", "interface_local_class_methods", "INTERFACE-LOCAL-CLASS-METHODS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_structures", "interface_local_instance_methods", "INTERFACE-LOCAL-INSTANCE-METHODS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_structures", "interface_mark_list", "INTERFACE-MARK-LIST", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_structures", "interface_plist", "INTERFACE-PLIST", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_structures", "interface_definition_lock", "INTERFACE-DEFINITION-LOCK", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_structures", "_csetf_interface_name", "_CSETF-INTERFACE-NAME", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_structures", "_csetf_interface_parents", "_CSETF-INTERFACE-PARENTS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_structures", "_csetf_interface_compiled_inheritance_path", "_CSETF-INTERFACE-COMPILED-INHERITANCE-PATH", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_structures", "_csetf_interface_subinterfaces", "_CSETF-INTERFACE-SUBINTERFACES", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_structures", "_csetf_interface_implementers", "_CSETF-INTERFACE-IMPLEMENTERS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_structures", "_csetf_interface_instance_method_decls", "_CSETF-INTERFACE-INSTANCE-METHOD-DECLS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_structures", "_csetf_interface_class_method_decls", "_CSETF-INTERFACE-CLASS-METHOD-DECLS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_structures", "_csetf_interface_compiled_instance_method_decls", "_CSETF-INTERFACE-COMPILED-INSTANCE-METHOD-DECLS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_structures", "_csetf_interface_compiled_class_method_decls", "_CSETF-INTERFACE-COMPILED-CLASS-METHOD-DECLS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_structures", "_csetf_interface_local_class_methods", "_CSETF-INTERFACE-LOCAL-CLASS-METHODS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_structures", "_csetf_interface_local_instance_methods", "_CSETF-INTERFACE-LOCAL-INSTANCE-METHODS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_structures", "_csetf_interface_mark_list", "_CSETF-INTERFACE-MARK-LIST", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_structures", "_csetf_interface_plist", "_CSETF-INTERFACE-PLIST", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_structures", "_csetf_interface_definition_lock", "_CSETF-INTERFACE-DEFINITION-LOCK", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_structures", "make_interface", "MAKE-INTERFACE", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_structures", "visit_defstruct_interface", "VISIT-DEFSTRUCT-INTERFACE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_structures", "visit_defstruct_object_interface_method", "VISIT-DEFSTRUCT-OBJECT-INTERFACE-METHOD", 2, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.subloop_structures", "with_interface", "WITH-INTERFACE");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.subloop_structures", "with_interface_private", "WITH-INTERFACE-PRIVATE");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_structures", "print_interface", "PRINT-INTERFACE", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_structures", "method_print_function_trampoline", "METHOD-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_structures", "method_p", "METHOD-P", 1, 0, false);
        new $method_p$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_structures", "method_name", "METHOD-NAME", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_structures", "method_class_name", "METHOD-CLASS-NAME", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_structures", "method_lambda_list", "METHOD-LAMBDA-LIST", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_structures", "method_body", "METHOD-BODY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_structures", "method_protection", "METHOD-PROTECTION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_structures", "method_scope", "METHOD-SCOPE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_structures", "method_update_type", "METHOD-UPDATE-TYPE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_structures", "method_function_name", "METHOD-FUNCTION-NAME", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_structures", "method_function_def", "METHOD-FUNCTION-DEF", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_structures", "method_before_listeners", "METHOD-BEFORE-LISTENERS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_structures", "method_after_listeners", "METHOD-AFTER-LISTENERS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_structures", "method_instantiate_template", "METHOD-INSTANTIATE-TEMPLATE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_structures", "_csetf_method_name", "_CSETF-METHOD-NAME", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_structures", "_csetf_method_class_name", "_CSETF-METHOD-CLASS-NAME", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_structures", "_csetf_method_lambda_list", "_CSETF-METHOD-LAMBDA-LIST", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_structures", "_csetf_method_body", "_CSETF-METHOD-BODY", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_structures", "_csetf_method_protection", "_CSETF-METHOD-PROTECTION", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_structures", "_csetf_method_scope", "_CSETF-METHOD-SCOPE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_structures", "_csetf_method_update_type", "_CSETF-METHOD-UPDATE-TYPE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_structures", "_csetf_method_function_name", "_CSETF-METHOD-FUNCTION-NAME", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_structures", "_csetf_method_function_def", "_CSETF-METHOD-FUNCTION-DEF", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_structures", "_csetf_method_before_listeners", "_CSETF-METHOD-BEFORE-LISTENERS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_structures", "_csetf_method_after_listeners", "_CSETF-METHOD-AFTER-LISTENERS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_structures", "_csetf_method_instantiate_template", "_CSETF-METHOD-INSTANTIATE-TEMPLATE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_structures", "make_method", "MAKE-METHOD", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_structures", "visit_defstruct_method", "VISIT-DEFSTRUCT-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_structures", "visit_defstruct_object_method_method", "VISIT-DEFSTRUCT-OBJECT-METHOD-METHOD", 2, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.subloop_structures", "with_method", "WITH-METHOD");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.subloop_structures", "with_method_private", "WITH-METHOD-PRIVATE");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_structures", "print_method", "PRINT-METHOD", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_structures", "tablify_method_list", "TABLIFY-METHOD-LIST", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_structures", "method_trace_print_function_trampoline", "METHOD-TRACE-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_structures", "method_trace_p", "METHOD-TRACE-P", 1, 0, false);
        new $method_trace_p$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_structures", "method_trace_name", "METHOD-TRACE-NAME", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_structures", "method_trace_class_name", "METHOD-TRACE-CLASS-NAME", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_structures", "method_trace_function", "METHOD-TRACE-FUNCTION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_structures", "method_trace_outer", "METHOD-TRACE-OUTER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_structures", "_csetf_method_trace_name", "_CSETF-METHOD-TRACE-NAME", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_structures", "_csetf_method_trace_class_name", "_CSETF-METHOD-TRACE-CLASS-NAME", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_structures", "_csetf_method_trace_function", "_CSETF-METHOD-TRACE-FUNCTION", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_structures", "_csetf_method_trace_outer", "_CSETF-METHOD-TRACE-OUTER", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_structures", "make_method_trace", "MAKE-METHOD-TRACE", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_structures", "visit_defstruct_method_trace", "VISIT-DEFSTRUCT-METHOD-TRACE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_structures", "visit_defstruct_object_method_trace_method", "VISIT-DEFSTRUCT-OBJECT-METHOD-TRACE-METHOD", 2, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.subloop_structures", "with_method_trace", "WITH-METHOD-TRACE");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.subloop_structures", "with_method_trace_private", "WITH-METHOD-TRACE-PRIVATE");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_structures", "print_method_trace", "PRINT-METHOD-TRACE", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_structures", "push_method_trace", "PUSH-METHOD-TRACE", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_structures", "method_info_print_function_trampoline", "METHOD-INFO-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_structures", "method_info_p", "METHOD-INFO-P", 1, 0, false);
        new $method_info_p$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_structures", "mi_method_name", "MI-METHOD-NAME", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_structures", "mi_class_name", "MI-CLASS-NAME", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_structures", "mi_mv_used_in_body", "MI-MV-USED-IN-BODY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_structures", "mi_mv_modified_in_body", "MI-MV-MODIFIED-IN-BODY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_structures", "mi_methods_used_in_body", "MI-METHODS-USED-IN-BODY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_structures", "_csetf_mi_method_name", "_CSETF-MI-METHOD-NAME", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_structures", "_csetf_mi_class_name", "_CSETF-MI-CLASS-NAME", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_structures", "_csetf_mi_mv_used_in_body", "_CSETF-MI-MV-USED-IN-BODY", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_structures", "_csetf_mi_mv_modified_in_body", "_CSETF-MI-MV-MODIFIED-IN-BODY", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_structures", "_csetf_mi_methods_used_in_body", "_CSETF-MI-METHODS-USED-IN-BODY", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_structures", "make_method_info", "MAKE-METHOD-INFO", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_structures", "visit_defstruct_method_info", "VISIT-DEFSTRUCT-METHOD-INFO", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_structures", "visit_defstruct_object_method_info_method", "VISIT-DEFSTRUCT-OBJECT-METHOD-INFO-METHOD", 2, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.subloop_structures", "with_method_info", "WITH-METHOD-INFO");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.subloop_structures", "with_method_info_private", "WITH-METHOD-INFO-PRIVATE");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_structures", "slot_listener_print_function_trampoline", "SLOT-LISTENER-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_structures", "slot_listener_p", "SLOT-LISTENER-P", 1, 0, false);
        new $slot_listener_p$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_structures", "sl_slot_name", "SL-SLOT-NAME", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_structures", "sl_demon_type", "SL-DEMON-TYPE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_structures", "sl_value_trigger", "SL-VALUE-TRIGGER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_structures", "sl_functional_type", "SL-FUNCTIONAL-TYPE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_structures", "sl_isa_method", "SL-ISA-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_structures", "sl_target_instance", "SL-TARGET-INSTANCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_structures", "_csetf_sl_slot_name", "_CSETF-SL-SLOT-NAME", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_structures", "_csetf_sl_demon_type", "_CSETF-SL-DEMON-TYPE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_structures", "_csetf_sl_value_trigger", "_CSETF-SL-VALUE-TRIGGER", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_structures", "_csetf_sl_functional_type", "_CSETF-SL-FUNCTIONAL-TYPE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_structures", "_csetf_sl_isa_method", "_CSETF-SL-ISA-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_structures", "_csetf_sl_target_instance", "_CSETF-SL-TARGET-INSTANCE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_structures", "make_slot_listener", "MAKE-SLOT-LISTENER", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_structures", "visit_defstruct_slot_listener", "VISIT-DEFSTRUCT-SLOT-LISTENER", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_structures", "visit_defstruct_object_slot_listener_method", "VISIT-DEFSTRUCT-OBJECT-SLOT-LISTENER-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_structures", "print_slot_listener", "PRINT-SLOT-LISTENER", 3, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.subloop_structures", "with_slot_listener", "WITH-SLOT-LISTENER");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.subloop_structures", "with_slot_listener_private", "WITH-SLOT-LISTENER-PRIVATE");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_structures", "slot_listener_registry_print_function_trampoline", "SLOT-LISTENER-REGISTRY-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_structures", "slot_listener_registry_p", "SLOT-LISTENER-REGISTRY-P", 1, 0, false);
        new $slot_listener_registry_p$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_structures", "slr_instance", "SLR-INSTANCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_structures", "slr_slot_count", "SLR-SLOT-COUNT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_structures", "slr_listeners_vector", "SLR-LISTENERS-VECTOR", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_structures", "_csetf_slr_instance", "_CSETF-SLR-INSTANCE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_structures", "_csetf_slr_slot_count", "_CSETF-SLR-SLOT-COUNT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_structures", "_csetf_slr_listeners_vector", "_CSETF-SLR-LISTENERS-VECTOR", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_structures", "make_slot_listener_registry", "MAKE-SLOT-LISTENER-REGISTRY", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_structures", "visit_defstruct_slot_listener_registry", "VISIT-DEFSTRUCT-SLOT-LISTENER-REGISTRY", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_structures", "visit_defstruct_object_slot_listener_registry_method", "VISIT-DEFSTRUCT-OBJECT-SLOT-LISTENER-REGISTRY-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_structures", "print_slot_listener_registry", "PRINT-SLOT-LISTENER-REGISTRY", 3, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.subloop_structures", "with_slot_listener_registry", "WITH-SLOT-LISTENER-REGISTRY");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.subloop_structures", "with_slot_listener_registry_private", "WITH-SLOT-LISTENER-REGISTRY-PRIVATE");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_structures", "method_listener_print_function_trampoline", "METHOD-LISTENER-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_structures", "method_listener_p", "METHOD-LISTENER-P", 1, 0, false);
        new $method_listener_p$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_structures", "ml_owning_method_name", "ML-OWNING-METHOD-NAME", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_structures", "ml_owning_class_name", "ML-OWNING-CLASS-NAME", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_structures", "ml_demon_type", "ML-DEMON-TYPE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_structures", "ml_detail", "ML-DETAIL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_structures", "_csetf_ml_owning_method_name", "_CSETF-ML-OWNING-METHOD-NAME", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_structures", "_csetf_ml_owning_class_name", "_CSETF-ML-OWNING-CLASS-NAME", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_structures", "_csetf_ml_demon_type", "_CSETF-ML-DEMON-TYPE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_structures", "_csetf_ml_detail", "_CSETF-ML-DETAIL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_structures", "make_method_listener", "MAKE-METHOD-LISTENER", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_structures", "visit_defstruct_method_listener", "VISIT-DEFSTRUCT-METHOD-LISTENER", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_structures", "visit_defstruct_object_method_listener_method", "VISIT-DEFSTRUCT-OBJECT-METHOD-LISTENER-METHOD", 2, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.subloop_structures", "with_method_listener", "WITH-METHOD-LISTENER");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.subloop_structures", "with_method_listener_private", "WITH-METHOD-LISTENER-PRIVATE");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_structures", "function_detail_print_function_trampoline", "FUNCTION-DETAIL-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_structures", "function_detail_p", "FUNCTION-DETAIL-P", 1, 0, false);
        new $function_detail_p$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_structures", "fd_function_name", "FD-FUNCTION-NAME", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_structures", "fd_arglist", "FD-ARGLIST", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_structures", "_csetf_fd_function_name", "_CSETF-FD-FUNCTION-NAME", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_structures", "_csetf_fd_arglist", "_CSETF-FD-ARGLIST", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_structures", "make_function_detail", "MAKE-FUNCTION-DETAIL", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_structures", "visit_defstruct_function_detail", "VISIT-DEFSTRUCT-FUNCTION-DETAIL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_structures", "visit_defstruct_object_function_detail_method", "VISIT-DEFSTRUCT-OBJECT-FUNCTION-DETAIL-METHOD", 2, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.subloop_structures", "with_function_detail", "WITH-FUNCTION-DETAIL");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.subloop_structures", "with_function_detail_private", "WITH-FUNCTION-DETAIL-PRIVATE");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_structures", "method_detail_print_function_trampoline", "METHOD-DETAIL-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_structures", "method_detail_p", "METHOD-DETAIL-P", 1, 0, false);
        new $method_detail_p$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_structures", "md_method_name", "MD-METHOD-NAME", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_structures", "md_function_name", "MD-FUNCTION-NAME", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_structures", "md_arglist", "MD-ARGLIST", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_structures", "md_instance", "MD-INSTANCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_structures", "_csetf_md_method_name", "_CSETF-MD-METHOD-NAME", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_structures", "_csetf_md_function_name", "_CSETF-MD-FUNCTION-NAME", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_structures", "_csetf_md_arglist", "_CSETF-MD-ARGLIST", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_structures", "_csetf_md_instance", "_CSETF-MD-INSTANCE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_structures", "make_method_detail", "MAKE-METHOD-DETAIL", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_structures", "visit_defstruct_method_detail", "VISIT-DEFSTRUCT-METHOD-DETAIL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_structures", "visit_defstruct_object_method_detail_method", "VISIT-DEFSTRUCT-OBJECT-METHOD-DETAIL-METHOD", 2, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.subloop_structures", "with_method_detail", "WITH-METHOD-DETAIL");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.subloop_structures", "with_method_detail_private", "WITH-METHOD-DETAIL-PRIVATE");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_structures", "method_listener_registry_print_function_trampoline", "METHOD-LISTENER-REGISTRY-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_structures", "method_listener_registry_p", "METHOD-LISTENER-REGISTRY-P", 1, 0, false);
        new $method_listener_registry_p$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_structures", "mlr_instance", "MLR-INSTANCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_structures", "mlr_listener_alist", "MLR-LISTENER-ALIST", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_structures", "_csetf_mlr_instance", "_CSETF-MLR-INSTANCE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_structures", "_csetf_mlr_listener_alist", "_CSETF-MLR-LISTENER-ALIST", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_structures", "make_method_listener_registry", "MAKE-METHOD-LISTENER-REGISTRY", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_structures", "visit_defstruct_method_listener_registry", "VISIT-DEFSTRUCT-METHOD-LISTENER-REGISTRY", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_structures", "visit_defstruct_object_method_listener_registry_method", "VISIT-DEFSTRUCT-OBJECT-METHOD-LISTENER-REGISTRY-METHOD", 2, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.subloop_structures", "with_method_listener_registry", "WITH-METHOD-LISTENER-REGISTRY");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.subloop_structures", "with_method_listener_registry_private", "WITH-METHOD-LISTENER-REGISTRY-PRIVATE");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.subloop_structures", "print_method_listener", "PRINT-METHOD-LISTENER", 3, 0, false);
        return (SubLObject)subloop_structures.NIL;
    }
    
    public static SubLObject init_subloop_structures_file() {
        subloop_structures.$dtp_class$ = SubLFiles.defconstant("*DTP-CLASS*", (SubLObject)subloop_structures.$sym0$CLASS);
        subloop_structures.$dtp_instance$ = SubLFiles.defconstant("*DTP-INSTANCE*", (SubLObject)subloop_structures.$sym130$INSTANCE);
        subloop_structures.$dtp_interface$ = SubLFiles.defconstant("*DTP-INTERFACE*", (SubLObject)subloop_structures.$sym156$INTERFACE);
        subloop_structures.$dtp_method$ = SubLFiles.defconstant("*DTP-METHOD*", (SubLObject)subloop_structures.$sym208$METHOD);
        subloop_structures.$methods_initial_hashtable_size$ = SubLFiles.defconstant("*METHODS-INITIAL-HASHTABLE-SIZE*", (SubLObject)subloop_structures.$int258$100);
        subloop_structures.$method_trace_on$ = SubLFiles.defvar("*METHOD-TRACE-ON*", (SubLObject)subloop_structures.T);
        subloop_structures.$methods_current_method_trace$ = SubLFiles.defparameter("*METHODS-CURRENT-METHOD-TRACE*", (SubLObject)subloop_structures.NIL);
        subloop_structures.$dtp_method_trace$ = SubLFiles.defconstant("*DTP-METHOD-TRACE*", (SubLObject)subloop_structures.$sym259$METHOD_TRACE);
        subloop_structures.$dtp_method_info$ = SubLFiles.defconstant("*DTP-METHOD-INFO*", (SubLObject)subloop_structures.$sym284$METHOD_INFO);
        subloop_structures.$dtp_slot_listener$ = SubLFiles.defconstant("*DTP-SLOT-LISTENER*", (SubLObject)subloop_structures.$sym312$SLOT_LISTENER);
        subloop_structures.$dtp_slot_listener_registry$ = SubLFiles.defconstant("*DTP-SLOT-LISTENER-REGISTRY*", (SubLObject)subloop_structures.$sym345$SLOT_LISTENER_REGISTRY);
        subloop_structures.$dtp_method_listener$ = SubLFiles.defconstant("*DTP-METHOD-LISTENER*", (SubLObject)subloop_structures.$sym368$METHOD_LISTENER);
        subloop_structures.$dtp_function_detail$ = SubLFiles.defconstant("*DTP-FUNCTION-DETAIL*", (SubLObject)subloop_structures.$sym393$FUNCTION_DETAIL);
        subloop_structures.$dtp_method_detail$ = SubLFiles.defconstant("*DTP-METHOD-DETAIL*", (SubLObject)subloop_structures.$sym411$METHOD_DETAIL);
        subloop_structures.$dtp_method_listener_registry$ = SubLFiles.defconstant("*DTP-METHOD-LISTENER-REGISTRY*", (SubLObject)subloop_structures.$sym432$METHOD_LISTENER_REGISTRY);
        return (SubLObject)subloop_structures.NIL;
    }
    
    public static SubLObject setup_subloop_structures_file() {
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), subloop_structures.$dtp_class$.getGlobalValue(), Symbols.symbol_function((SubLObject)subloop_structures.$sym16$CLASS_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)subloop_structures.$list17);
        Structures.def_csetf((SubLObject)subloop_structures.$sym18$CLASS_NAME, (SubLObject)subloop_structures.$sym19$_CSETF_CLASS_NAME);
        Structures.def_csetf((SubLObject)subloop_structures.$sym20$CLASS_PARENT, (SubLObject)subloop_structures.$sym21$_CSETF_CLASS_PARENT);
        Structures.def_csetf((SubLObject)subloop_structures.$sym22$CLASS_SUBCLASSES, (SubLObject)subloop_structures.$sym23$_CSETF_CLASS_SUBCLASSES);
        Structures.def_csetf((SubLObject)subloop_structures.$sym24$CLASS_INTERFACE_NAMES, (SubLObject)subloop_structures.$sym25$_CSETF_CLASS_INTERFACE_NAMES);
        Structures.def_csetf((SubLObject)subloop_structures.$sym26$CLASS_INTERFACES, (SubLObject)subloop_structures.$sym27$_CSETF_CLASS_INTERFACES);
        Structures.def_csetf((SubLObject)subloop_structures.$sym28$CLASS_COMPILED_INHERITANCE_PATH, (SubLObject)subloop_structures.$sym29$_CSETF_CLASS_COMPILED_INHERITANCE_PATH);
        Structures.def_csetf((SubLObject)subloop_structures.$sym30$CLASS_INSTANCE_VAR_DECLS, (SubLObject)subloop_structures.$sym31$_CSETF_CLASS_INSTANCE_VAR_DECLS);
        Structures.def_csetf((SubLObject)subloop_structures.$sym32$CLASS_CLASS_VAR_DECLS, (SubLObject)subloop_structures.$sym33$_CSETF_CLASS_CLASS_VAR_DECLS);
        Structures.def_csetf((SubLObject)subloop_structures.$sym34$CLASS_COMPILED_INSTANCE_SLOT_ACCESS_ALIST, (SubLObject)subloop_structures.$sym35$_CSETF_CLASS_COMPILED_INSTANCE_SLOT_ACCESS_ALIST);
        Structures.def_csetf((SubLObject)subloop_structures.$sym36$CLASS_COMPILED_INSTANCE_BOOLEAN_SLOT_ACCESS_ALIST, (SubLObject)subloop_structures.$sym37$_CSETF_CLASS_COMPILED_INSTANCE_BOOLEAN_SLOT_ACCESS_ALIST);
        Structures.def_csetf((SubLObject)subloop_structures.$sym38$CLASS_COMPILED_CLASS_SLOT_ACCESS_ALIST, (SubLObject)subloop_structures.$sym39$_CSETF_CLASS_COMPILED_CLASS_SLOT_ACCESS_ALIST);
        Structures.def_csetf((SubLObject)subloop_structures.$sym40$CLASS_COMPILED_CLASS_BOOLEAN_SLOT_ACCESS_ALIST, (SubLObject)subloop_structures.$sym41$_CSETF_CLASS_COMPILED_CLASS_BOOLEAN_SLOT_ACCESS_ALIST);
        Structures.def_csetf((SubLObject)subloop_structures.$sym42$CLASS_SLOT_ACCESSOR_ALIST, (SubLObject)subloop_structures.$sym43$_CSETF_CLASS_SLOT_ACCESSOR_ALIST);
        Structures.def_csetf((SubLObject)subloop_structures.$sym44$CLASS_INSTANCE_METHOD_DECLS, (SubLObject)subloop_structures.$sym45$_CSETF_CLASS_INSTANCE_METHOD_DECLS);
        Structures.def_csetf((SubLObject)subloop_structures.$sym46$CLASS_CLASS_METHOD_DECLS, (SubLObject)subloop_structures.$sym47$_CSETF_CLASS_CLASS_METHOD_DECLS);
        Structures.def_csetf((SubLObject)subloop_structures.$sym48$CLASS_BOOLEAN_SLOTS, (SubLObject)subloop_structures.$sym49$_CSETF_CLASS_BOOLEAN_SLOTS);
        Structures.def_csetf((SubLObject)subloop_structures.$sym50$CLASS_ANY_SLOTS, (SubLObject)subloop_structures.$sym51$_CSETF_CLASS_ANY_SLOTS);
        Structures.def_csetf((SubLObject)subloop_structures.$sym52$CLASS_COMPILED_INSTANCE_METHOD_ACCESS_ALIST, (SubLObject)subloop_structures.$sym53$_CSETF_CLASS_COMPILED_INSTANCE_METHOD_ACCESS_ALIST);
        Structures.def_csetf((SubLObject)subloop_structures.$sym54$CLASS_COMPILED_CLASS_METHOD_ACCESS_ALIST, (SubLObject)subloop_structures.$sym55$_CSETF_CLASS_COMPILED_CLASS_METHOD_ACCESS_ALIST);
        Structures.def_csetf((SubLObject)subloop_structures.$sym56$CLASS_TABLIFIED_INSTANCE_METHODS, (SubLObject)subloop_structures.$sym57$_CSETF_CLASS_TABLIFIED_INSTANCE_METHODS);
        Structures.def_csetf((SubLObject)subloop_structures.$sym58$CLASS_DEFINITION_LOCK, (SubLObject)subloop_structures.$sym59$_CSETF_CLASS_DEFINITION_LOCK);
        Structures.def_csetf((SubLObject)subloop_structures.$sym60$CLASS_ACCESS_LOCK, (SubLObject)subloop_structures.$sym61$_CSETF_CLASS_ACCESS_LOCK);
        Structures.def_csetf((SubLObject)subloop_structures.$sym62$CLASS_SYNCHRONIZED_SLOTS_P, (SubLObject)subloop_structures.$sym63$_CSETF_CLASS_SYNCHRONIZED_SLOTS_P);
        Structures.def_csetf((SubLObject)subloop_structures.$sym64$CLASS_PLIST, (SubLObject)subloop_structures.$sym65$_CSETF_CLASS_PLIST);
        Structures.def_csetf((SubLObject)subloop_structures.$sym66$CLASS_CLASS_INITIALIZATION_FUNCTION, (SubLObject)subloop_structures.$sym67$_CSETF_CLASS_CLASS_INITIALIZATION_FUNCTION);
        Structures.def_csetf((SubLObject)subloop_structures.$sym68$CLASS_CLASS_INITIALIZED_P, (SubLObject)subloop_structures.$sym69$_CSETF_CLASS_CLASS_INITIALIZED_P);
        Structures.def_csetf((SubLObject)subloop_structures.$sym70$CLASS_INSTANCE_INITIALIZATION_FUNCTION, (SubLObject)subloop_structures.$sym71$_CSETF_CLASS_INSTANCE_INITIALIZATION_FUNCTION);
        Structures.def_csetf((SubLObject)subloop_structures.$sym72$CLASS_CLASS_PROPERTIES, (SubLObject)subloop_structures.$sym73$_CSETF_CLASS_CLASS_PROPERTIES);
        Equality.identity((SubLObject)subloop_structures.$sym0$CLASS);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), subloop_structures.$dtp_class$.getGlobalValue(), Symbols.symbol_function((SubLObject)subloop_structures.$sym107$VISIT_DEFSTRUCT_OBJECT_CLASS_METHOD));
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), subloop_structures.$dtp_instance$.getGlobalValue(), Symbols.symbol_function((SubLObject)subloop_structures.$sym137$INSTANCE_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)subloop_structures.$list138);
        Structures.def_csetf((SubLObject)subloop_structures.$sym139$INSTANCE_CLASS, (SubLObject)subloop_structures.$sym140$_CSETF_INSTANCE_CLASS);
        Structures.def_csetf((SubLObject)subloop_structures.$sym141$INSTANCE_BOOLEAN_SLOTS, (SubLObject)subloop_structures.$sym142$_CSETF_INSTANCE_BOOLEAN_SLOTS);
        Structures.def_csetf((SubLObject)subloop_structures.$sym143$INSTANCE_ANY_SLOTS, (SubLObject)subloop_structures.$sym144$_CSETF_INSTANCE_ANY_SLOTS);
        Structures.def_csetf((SubLObject)subloop_structures.$sym145$INSTANCE_PLIST, (SubLObject)subloop_structures.$sym146$_CSETF_INSTANCE_PLIST);
        Equality.identity((SubLObject)subloop_structures.$sym130$INSTANCE);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), subloop_structures.$dtp_instance$.getGlobalValue(), Symbols.symbol_function((SubLObject)subloop_structures.$sym149$VISIT_DEFSTRUCT_OBJECT_INSTANCE_METHOD));
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), subloop_structures.$dtp_interface$.getGlobalValue(), Symbols.symbol_function((SubLObject)subloop_structures.$sym163$INTERFACE_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)subloop_structures.$list164);
        Structures.def_csetf((SubLObject)subloop_structures.$sym165$INTERFACE_NAME, (SubLObject)subloop_structures.$sym166$_CSETF_INTERFACE_NAME);
        Structures.def_csetf((SubLObject)subloop_structures.$sym167$INTERFACE_PARENTS, (SubLObject)subloop_structures.$sym168$_CSETF_INTERFACE_PARENTS);
        Structures.def_csetf((SubLObject)subloop_structures.$sym169$INTERFACE_COMPILED_INHERITANCE_PATH, (SubLObject)subloop_structures.$sym170$_CSETF_INTERFACE_COMPILED_INHERITANCE_PATH);
        Structures.def_csetf((SubLObject)subloop_structures.$sym171$INTERFACE_SUBINTERFACES, (SubLObject)subloop_structures.$sym172$_CSETF_INTERFACE_SUBINTERFACES);
        Structures.def_csetf((SubLObject)subloop_structures.$sym173$INTERFACE_IMPLEMENTERS, (SubLObject)subloop_structures.$sym174$_CSETF_INTERFACE_IMPLEMENTERS);
        Structures.def_csetf((SubLObject)subloop_structures.$sym175$INTERFACE_INSTANCE_METHOD_DECLS, (SubLObject)subloop_structures.$sym176$_CSETF_INTERFACE_INSTANCE_METHOD_DECLS);
        Structures.def_csetf((SubLObject)subloop_structures.$sym177$INTERFACE_CLASS_METHOD_DECLS, (SubLObject)subloop_structures.$sym178$_CSETF_INTERFACE_CLASS_METHOD_DECLS);
        Structures.def_csetf((SubLObject)subloop_structures.$sym179$INTERFACE_COMPILED_INSTANCE_METHOD_DECLS, (SubLObject)subloop_structures.$sym180$_CSETF_INTERFACE_COMPILED_INSTANCE_METHOD_DECLS);
        Structures.def_csetf((SubLObject)subloop_structures.$sym181$INTERFACE_COMPILED_CLASS_METHOD_DECLS, (SubLObject)subloop_structures.$sym182$_CSETF_INTERFACE_COMPILED_CLASS_METHOD_DECLS);
        Structures.def_csetf((SubLObject)subloop_structures.$sym183$INTERFACE_LOCAL_CLASS_METHODS, (SubLObject)subloop_structures.$sym184$_CSETF_INTERFACE_LOCAL_CLASS_METHODS);
        Structures.def_csetf((SubLObject)subloop_structures.$sym185$INTERFACE_LOCAL_INSTANCE_METHODS, (SubLObject)subloop_structures.$sym186$_CSETF_INTERFACE_LOCAL_INSTANCE_METHODS);
        Structures.def_csetf((SubLObject)subloop_structures.$sym187$INTERFACE_MARK_LIST, (SubLObject)subloop_structures.$sym188$_CSETF_INTERFACE_MARK_LIST);
        Structures.def_csetf((SubLObject)subloop_structures.$sym189$INTERFACE_PLIST, (SubLObject)subloop_structures.$sym190$_CSETF_INTERFACE_PLIST);
        Structures.def_csetf((SubLObject)subloop_structures.$sym191$INTERFACE_DEFINITION_LOCK, (SubLObject)subloop_structures.$sym192$_CSETF_INTERFACE_DEFINITION_LOCK);
        Equality.identity((SubLObject)subloop_structures.$sym156$INTERFACE);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), subloop_structures.$dtp_interface$.getGlobalValue(), Symbols.symbol_function((SubLObject)subloop_structures.$sym202$VISIT_DEFSTRUCT_OBJECT_INTERFACE_METHOD));
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), subloop_structures.$dtp_method$.getGlobalValue(), Symbols.symbol_function((SubLObject)subloop_structures.$sym215$METHOD_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)subloop_structures.$list216);
        Structures.def_csetf((SubLObject)subloop_structures.$sym217$METHOD_NAME, (SubLObject)subloop_structures.$sym218$_CSETF_METHOD_NAME);
        Structures.def_csetf((SubLObject)subloop_structures.$sym219$METHOD_CLASS_NAME, (SubLObject)subloop_structures.$sym220$_CSETF_METHOD_CLASS_NAME);
        Structures.def_csetf((SubLObject)subloop_structures.$sym221$METHOD_LAMBDA_LIST, (SubLObject)subloop_structures.$sym222$_CSETF_METHOD_LAMBDA_LIST);
        Structures.def_csetf((SubLObject)subloop_structures.$sym223$METHOD_BODY, (SubLObject)subloop_structures.$sym224$_CSETF_METHOD_BODY);
        Structures.def_csetf((SubLObject)subloop_structures.$sym225$METHOD_PROTECTION, (SubLObject)subloop_structures.$sym226$_CSETF_METHOD_PROTECTION);
        Structures.def_csetf((SubLObject)subloop_structures.$sym227$METHOD_SCOPE, (SubLObject)subloop_structures.$sym228$_CSETF_METHOD_SCOPE);
        Structures.def_csetf((SubLObject)subloop_structures.$sym229$METHOD_UPDATE_TYPE, (SubLObject)subloop_structures.$sym230$_CSETF_METHOD_UPDATE_TYPE);
        Structures.def_csetf((SubLObject)subloop_structures.$sym231$METHOD_FUNCTION_NAME, (SubLObject)subloop_structures.$sym232$_CSETF_METHOD_FUNCTION_NAME);
        Structures.def_csetf((SubLObject)subloop_structures.$sym233$METHOD_FUNCTION_DEF, (SubLObject)subloop_structures.$sym234$_CSETF_METHOD_FUNCTION_DEF);
        Structures.def_csetf((SubLObject)subloop_structures.$sym235$METHOD_BEFORE_LISTENERS, (SubLObject)subloop_structures.$sym236$_CSETF_METHOD_BEFORE_LISTENERS);
        Structures.def_csetf((SubLObject)subloop_structures.$sym237$METHOD_AFTER_LISTENERS, (SubLObject)subloop_structures.$sym238$_CSETF_METHOD_AFTER_LISTENERS);
        Structures.def_csetf((SubLObject)subloop_structures.$sym239$METHOD_INSTANTIATE_TEMPLATE, (SubLObject)subloop_structures.$sym240$_CSETF_METHOD_INSTANTIATE_TEMPLATE);
        Equality.identity((SubLObject)subloop_structures.$sym208$METHOD);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), subloop_structures.$dtp_method$.getGlobalValue(), Symbols.symbol_function((SubLObject)subloop_structures.$sym253$VISIT_DEFSTRUCT_OBJECT_METHOD_METHOD));
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), subloop_structures.$dtp_method_trace$.getGlobalValue(), Symbols.symbol_function((SubLObject)subloop_structures.$sym266$METHOD_TRACE_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)subloop_structures.$list267);
        Structures.def_csetf((SubLObject)subloop_structures.$sym268$METHOD_TRACE_NAME, (SubLObject)subloop_structures.$sym269$_CSETF_METHOD_TRACE_NAME);
        Structures.def_csetf((SubLObject)subloop_structures.$sym270$METHOD_TRACE_CLASS_NAME, (SubLObject)subloop_structures.$sym271$_CSETF_METHOD_TRACE_CLASS_NAME);
        Structures.def_csetf((SubLObject)subloop_structures.$sym272$METHOD_TRACE_FUNCTION, (SubLObject)subloop_structures.$sym273$_CSETF_METHOD_TRACE_FUNCTION);
        Structures.def_csetf((SubLObject)subloop_structures.$sym274$METHOD_TRACE_OUTER, (SubLObject)subloop_structures.$sym275$_CSETF_METHOD_TRACE_OUTER);
        Equality.identity((SubLObject)subloop_structures.$sym259$METHOD_TRACE);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), subloop_structures.$dtp_method_trace$.getGlobalValue(), Symbols.symbol_function((SubLObject)subloop_structures.$sym279$VISIT_DEFSTRUCT_OBJECT_METHOD_TRACE_METHOD));
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), subloop_structures.$dtp_method_info$.getGlobalValue(), Symbols.symbol_function((SubLObject)subloop_structures.$sym291$METHOD_INFO_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)subloop_structures.$list292);
        Structures.def_csetf((SubLObject)subloop_structures.$sym293$MI_METHOD_NAME, (SubLObject)subloop_structures.$sym294$_CSETF_MI_METHOD_NAME);
        Structures.def_csetf((SubLObject)subloop_structures.$sym295$MI_CLASS_NAME, (SubLObject)subloop_structures.$sym296$_CSETF_MI_CLASS_NAME);
        Structures.def_csetf((SubLObject)subloop_structures.$sym297$MI_MV_USED_IN_BODY, (SubLObject)subloop_structures.$sym298$_CSETF_MI_MV_USED_IN_BODY);
        Structures.def_csetf((SubLObject)subloop_structures.$sym299$MI_MV_MODIFIED_IN_BODY, (SubLObject)subloop_structures.$sym300$_CSETF_MI_MV_MODIFIED_IN_BODY);
        Structures.def_csetf((SubLObject)subloop_structures.$sym301$MI_METHODS_USED_IN_BODY, (SubLObject)subloop_structures.$sym302$_CSETF_MI_METHODS_USED_IN_BODY);
        Equality.identity((SubLObject)subloop_structures.$sym284$METHOD_INFO);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), subloop_structures.$dtp_method_info$.getGlobalValue(), Symbols.symbol_function((SubLObject)subloop_structures.$sym308$VISIT_DEFSTRUCT_OBJECT_METHOD_INFO_METHOD));
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), subloop_structures.$dtp_slot_listener$.getGlobalValue(), Symbols.symbol_function((SubLObject)subloop_structures.$sym319$SLOT_LISTENER_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)subloop_structures.$list320);
        Structures.def_csetf((SubLObject)subloop_structures.$sym321$SL_SLOT_NAME, (SubLObject)subloop_structures.$sym322$_CSETF_SL_SLOT_NAME);
        Structures.def_csetf((SubLObject)subloop_structures.$sym323$SL_DEMON_TYPE, (SubLObject)subloop_structures.$sym324$_CSETF_SL_DEMON_TYPE);
        Structures.def_csetf((SubLObject)subloop_structures.$sym325$SL_VALUE_TRIGGER, (SubLObject)subloop_structures.$sym326$_CSETF_SL_VALUE_TRIGGER);
        Structures.def_csetf((SubLObject)subloop_structures.$sym327$SL_FUNCTIONAL_TYPE, (SubLObject)subloop_structures.$sym328$_CSETF_SL_FUNCTIONAL_TYPE);
        Structures.def_csetf((SubLObject)subloop_structures.$sym329$SL_ISA_METHOD, (SubLObject)subloop_structures.$sym330$_CSETF_SL_ISA_METHOD);
        Structures.def_csetf((SubLObject)subloop_structures.$sym331$SL_TARGET_INSTANCE, (SubLObject)subloop_structures.$sym332$_CSETF_SL_TARGET_INSTANCE);
        Equality.identity((SubLObject)subloop_structures.$sym312$SLOT_LISTENER);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), subloop_structures.$dtp_slot_listener$.getGlobalValue(), Symbols.symbol_function((SubLObject)subloop_structures.$sym340$VISIT_DEFSTRUCT_OBJECT_SLOT_LISTENER_METHOD));
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), subloop_structures.$dtp_slot_listener_registry$.getGlobalValue(), Symbols.symbol_function((SubLObject)subloop_structures.$sym351$SLOT_LISTENER_REGISTRY_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)subloop_structures.$list352);
        Structures.def_csetf((SubLObject)subloop_structures.$sym353$SLR_INSTANCE, (SubLObject)subloop_structures.$sym354$_CSETF_SLR_INSTANCE);
        Structures.def_csetf((SubLObject)subloop_structures.$sym355$SLR_SLOT_COUNT, (SubLObject)subloop_structures.$sym356$_CSETF_SLR_SLOT_COUNT);
        Structures.def_csetf((SubLObject)subloop_structures.$sym357$SLR_LISTENERS_VECTOR, (SubLObject)subloop_structures.$sym358$_CSETF_SLR_LISTENERS_VECTOR);
        Equality.identity((SubLObject)subloop_structures.$sym345$SLOT_LISTENER_REGISTRY);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), subloop_structures.$dtp_slot_listener_registry$.getGlobalValue(), Symbols.symbol_function((SubLObject)subloop_structures.$sym363$VISIT_DEFSTRUCT_OBJECT_SLOT_LISTENER_REGISTRY_METHOD));
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), subloop_structures.$dtp_method_listener$.getGlobalValue(), Symbols.symbol_function((SubLObject)subloop_structures.$sym375$METHOD_LISTENER_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)subloop_structures.$list376);
        Structures.def_csetf((SubLObject)subloop_structures.$sym377$ML_OWNING_METHOD_NAME, (SubLObject)subloop_structures.$sym378$_CSETF_ML_OWNING_METHOD_NAME);
        Structures.def_csetf((SubLObject)subloop_structures.$sym379$ML_OWNING_CLASS_NAME, (SubLObject)subloop_structures.$sym380$_CSETF_ML_OWNING_CLASS_NAME);
        Structures.def_csetf((SubLObject)subloop_structures.$sym381$ML_DEMON_TYPE, (SubLObject)subloop_structures.$sym382$_CSETF_ML_DEMON_TYPE);
        Structures.def_csetf((SubLObject)subloop_structures.$sym383$ML_DETAIL, (SubLObject)subloop_structures.$sym384$_CSETF_ML_DETAIL);
        Equality.identity((SubLObject)subloop_structures.$sym368$METHOD_LISTENER);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), subloop_structures.$dtp_method_listener$.getGlobalValue(), Symbols.symbol_function((SubLObject)subloop_structures.$sym389$VISIT_DEFSTRUCT_OBJECT_METHOD_LISTENER_METHOD));
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), subloop_structures.$dtp_function_detail$.getGlobalValue(), Symbols.symbol_function((SubLObject)subloop_structures.$sym399$FUNCTION_DETAIL_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)subloop_structures.$list400);
        Structures.def_csetf((SubLObject)subloop_structures.$sym401$FD_FUNCTION_NAME, (SubLObject)subloop_structures.$sym402$_CSETF_FD_FUNCTION_NAME);
        Structures.def_csetf((SubLObject)subloop_structures.$sym403$FD_ARGLIST, (SubLObject)subloop_structures.$sym404$_CSETF_FD_ARGLIST);
        Equality.identity((SubLObject)subloop_structures.$sym393$FUNCTION_DETAIL);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), subloop_structures.$dtp_function_detail$.getGlobalValue(), Symbols.symbol_function((SubLObject)subloop_structures.$sym407$VISIT_DEFSTRUCT_OBJECT_FUNCTION_DETAIL_METHOD));
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), subloop_structures.$dtp_method_detail$.getGlobalValue(), Symbols.symbol_function((SubLObject)subloop_structures.$sym417$METHOD_DETAIL_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)subloop_structures.$list418);
        Structures.def_csetf((SubLObject)subloop_structures.$sym419$MD_METHOD_NAME, (SubLObject)subloop_structures.$sym420$_CSETF_MD_METHOD_NAME);
        Structures.def_csetf((SubLObject)subloop_structures.$sym421$MD_FUNCTION_NAME, (SubLObject)subloop_structures.$sym422$_CSETF_MD_FUNCTION_NAME);
        Structures.def_csetf((SubLObject)subloop_structures.$sym423$MD_ARGLIST, (SubLObject)subloop_structures.$sym424$_CSETF_MD_ARGLIST);
        Structures.def_csetf((SubLObject)subloop_structures.$sym425$MD_INSTANCE, (SubLObject)subloop_structures.$sym426$_CSETF_MD_INSTANCE);
        Equality.identity((SubLObject)subloop_structures.$sym411$METHOD_DETAIL);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), subloop_structures.$dtp_method_detail$.getGlobalValue(), Symbols.symbol_function((SubLObject)subloop_structures.$sym428$VISIT_DEFSTRUCT_OBJECT_METHOD_DETAIL_METHOD));
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), subloop_structures.$dtp_method_listener_registry$.getGlobalValue(), Symbols.symbol_function((SubLObject)subloop_structures.$sym438$METHOD_LISTENER_REGISTRY_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)subloop_structures.$list439);
        Structures.def_csetf((SubLObject)subloop_structures.$sym440$MLR_INSTANCE, (SubLObject)subloop_structures.$sym441$_CSETF_MLR_INSTANCE);
        Structures.def_csetf((SubLObject)subloop_structures.$sym442$MLR_LISTENER_ALIST, (SubLObject)subloop_structures.$sym443$_CSETF_MLR_LISTENER_ALIST);
        Equality.identity((SubLObject)subloop_structures.$sym432$METHOD_LISTENER_REGISTRY);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), subloop_structures.$dtp_method_listener_registry$.getGlobalValue(), Symbols.symbol_function((SubLObject)subloop_structures.$sym446$VISIT_DEFSTRUCT_OBJECT_METHOD_LISTENER_REGISTRY_METHOD));
        return (SubLObject)subloop_structures.NIL;
    }
    
    @Override
	public void declareFunctions() {
        declare_subloop_structures_file();
    }
    
    @Override
	public void initializeVariables() {
        init_subloop_structures_file();
    }
    
    @Override
	public void runTopLevelForms() {
        setup_subloop_structures_file();
    }
    
    static {
        me = (SubLFile)new subloop_structures();
        subloop_structures.$dtp_class$ = null;
        subloop_structures.$dtp_instance$ = null;
        subloop_structures.$dtp_interface$ = null;
        subloop_structures.$dtp_method$ = null;
        subloop_structures.$methods_initial_hashtable_size$ = null;
        subloop_structures.$method_trace_on$ = null;
        subloop_structures.$methods_current_method_trace$ = null;
        subloop_structures.$dtp_method_trace$ = null;
        subloop_structures.$dtp_method_info$ = null;
        subloop_structures.$dtp_slot_listener$ = null;
        subloop_structures.$dtp_slot_listener_registry$ = null;
        subloop_structures.$dtp_method_listener$ = null;
        subloop_structures.$dtp_function_detail$ = null;
        subloop_structures.$dtp_method_detail$ = null;
        subloop_structures.$dtp_method_listener_registry$ = null;
        $sym0$CLASS = SubLObjectFactory.makeSymbol("CLASS");
        $sym1$CLASS_P = SubLObjectFactory.makeSymbol("CLASS-P");
        $list2 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("NAME"), SubLObjectFactory.makeSymbol("PARENT"), SubLObjectFactory.makeSymbol("SUBCLASSES"), SubLObjectFactory.makeSymbol("INTERFACE-NAMES"), SubLObjectFactory.makeSymbol("INTERFACES"), SubLObjectFactory.makeSymbol("COMPILED-INHERITANCE-PATH"), SubLObjectFactory.makeSymbol("INSTANCE-VAR-DECLS"), SubLObjectFactory.makeSymbol("CLASS-VAR-DECLS"), SubLObjectFactory.makeSymbol("COMPILED-INSTANCE-SLOT-ACCESS-ALIST"), SubLObjectFactory.makeSymbol("COMPILED-INSTANCE-BOOLEAN-SLOT-ACCESS-ALIST"), SubLObjectFactory.makeSymbol("COMPILED-CLASS-SLOT-ACCESS-ALIST"), SubLObjectFactory.makeSymbol("COMPILED-CLASS-BOOLEAN-SLOT-ACCESS-ALIST"), SubLObjectFactory.makeSymbol("SLOT-ACCESSOR-ALIST"), SubLObjectFactory.makeSymbol("INSTANCE-METHOD-DECLS"), SubLObjectFactory.makeSymbol("CLASS-METHOD-DECLS"), SubLObjectFactory.makeSymbol("BOOLEAN-SLOTS"), SubLObjectFactory.makeSymbol("ANY-SLOTS"), SubLObjectFactory.makeSymbol("COMPILED-INSTANCE-METHOD-ACCESS-ALIST"), SubLObjectFactory.makeSymbol("COMPILED-CLASS-METHOD-ACCESS-ALIST"), SubLObjectFactory.makeSymbol("TABLIFIED-INSTANCE-METHODS"), SubLObjectFactory.makeSymbol("DEFINITION-LOCK"), SubLObjectFactory.makeSymbol("ACCESS-LOCK"), SubLObjectFactory.makeSymbol("SYNCHRONIZED-SLOTS-P"), SubLObjectFactory.makeSymbol("PLIST"), SubLObjectFactory.makeSymbol("CLASS-INITIALIZATION-FUNCTION"), SubLObjectFactory.makeSymbol("CLASS-INITIALIZED-P"), SubLObjectFactory.makeSymbol("INSTANCE-INITIALIZATION-FUNCTION"), SubLObjectFactory.makeSymbol("CLASS-PROPERTIES") });
        $list3 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("NAME"), SubLObjectFactory.makeKeyword("PARENT"), SubLObjectFactory.makeKeyword("SUBCLASSES"), SubLObjectFactory.makeKeyword("INTERFACE-NAMES"), SubLObjectFactory.makeKeyword("INTERFACES"), SubLObjectFactory.makeKeyword("COMPILED-INHERITANCE-PATH"), SubLObjectFactory.makeKeyword("INSTANCE-VAR-DECLS"), SubLObjectFactory.makeKeyword("CLASS-VAR-DECLS"), SubLObjectFactory.makeKeyword("COMPILED-INSTANCE-SLOT-ACCESS-ALIST"), SubLObjectFactory.makeKeyword("COMPILED-INSTANCE-BOOLEAN-SLOT-ACCESS-ALIST"), SubLObjectFactory.makeKeyword("COMPILED-CLASS-SLOT-ACCESS-ALIST"), SubLObjectFactory.makeKeyword("COMPILED-CLASS-BOOLEAN-SLOT-ACCESS-ALIST"), SubLObjectFactory.makeKeyword("SLOT-ACCESSOR-ALIST"), SubLObjectFactory.makeKeyword("INSTANCE-METHOD-DECLS"), SubLObjectFactory.makeKeyword("CLASS-METHOD-DECLS"), SubLObjectFactory.makeKeyword("BOOLEAN-SLOTS"), SubLObjectFactory.makeKeyword("ANY-SLOTS"), SubLObjectFactory.makeKeyword("COMPILED-INSTANCE-METHOD-ACCESS-ALIST"), SubLObjectFactory.makeKeyword("COMPILED-CLASS-METHOD-ACCESS-ALIST"), SubLObjectFactory.makeKeyword("TABLIFIED-INSTANCE-METHODS"), SubLObjectFactory.makeKeyword("DEFINITION-LOCK"), SubLObjectFactory.makeKeyword("ACCESS-LOCK"), SubLObjectFactory.makeKeyword("SYNCHRONIZED-SLOTS-P"), SubLObjectFactory.makeKeyword("PLIST"), SubLObjectFactory.makeKeyword("CLASS-INITIALIZATION-FUNCTION"), SubLObjectFactory.makeKeyword("CLASS-INITIALIZED-P"), SubLObjectFactory.makeKeyword("INSTANCE-INITIALIZATION-FUNCTION"), SubLObjectFactory.makeKeyword("CLASS-PROPERTIES") });
        $list4 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("CLASS-NAME"), SubLObjectFactory.makeSymbol("CLASS-PARENT"), SubLObjectFactory.makeSymbol("CLASS-SUBCLASSES"), SubLObjectFactory.makeSymbol("CLASS-INTERFACE-NAMES"), SubLObjectFactory.makeSymbol("CLASS-INTERFACES"), SubLObjectFactory.makeSymbol("CLASS-COMPILED-INHERITANCE-PATH"), SubLObjectFactory.makeSymbol("CLASS-INSTANCE-VAR-DECLS"), SubLObjectFactory.makeSymbol("CLASS-CLASS-VAR-DECLS"), SubLObjectFactory.makeSymbol("CLASS-COMPILED-INSTANCE-SLOT-ACCESS-ALIST"), SubLObjectFactory.makeSymbol("CLASS-COMPILED-INSTANCE-BOOLEAN-SLOT-ACCESS-ALIST"), SubLObjectFactory.makeSymbol("CLASS-COMPILED-CLASS-SLOT-ACCESS-ALIST"), SubLObjectFactory.makeSymbol("CLASS-COMPILED-CLASS-BOOLEAN-SLOT-ACCESS-ALIST"), SubLObjectFactory.makeSymbol("CLASS-SLOT-ACCESSOR-ALIST"), SubLObjectFactory.makeSymbol("CLASS-INSTANCE-METHOD-DECLS"), SubLObjectFactory.makeSymbol("CLASS-CLASS-METHOD-DECLS"), SubLObjectFactory.makeSymbol("CLASS-BOOLEAN-SLOTS"), SubLObjectFactory.makeSymbol("CLASS-ANY-SLOTS"), SubLObjectFactory.makeSymbol("CLASS-COMPILED-INSTANCE-METHOD-ACCESS-ALIST"), SubLObjectFactory.makeSymbol("CLASS-COMPILED-CLASS-METHOD-ACCESS-ALIST"), SubLObjectFactory.makeSymbol("CLASS-TABLIFIED-INSTANCE-METHODS"), SubLObjectFactory.makeSymbol("CLASS-DEFINITION-LOCK"), SubLObjectFactory.makeSymbol("CLASS-ACCESS-LOCK"), SubLObjectFactory.makeSymbol("CLASS-SYNCHRONIZED-SLOTS-P"), SubLObjectFactory.makeSymbol("CLASS-PLIST"), SubLObjectFactory.makeSymbol("CLASS-CLASS-INITIALIZATION-FUNCTION"), SubLObjectFactory.makeSymbol("CLASS-CLASS-INITIALIZED-P"), SubLObjectFactory.makeSymbol("CLASS-INSTANCE-INITIALIZATION-FUNCTION"), SubLObjectFactory.makeSymbol("CLASS-CLASS-PROPERTIES") });
        $list5 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("_CSETF-CLASS-NAME", "SUBLISP"), SubLObjectFactory.makeSymbol("_CSETF-CLASS-PARENT"), SubLObjectFactory.makeSymbol("_CSETF-CLASS-SUBCLASSES"), SubLObjectFactory.makeSymbol("_CSETF-CLASS-INTERFACE-NAMES"), SubLObjectFactory.makeSymbol("_CSETF-CLASS-INTERFACES"), SubLObjectFactory.makeSymbol("_CSETF-CLASS-COMPILED-INHERITANCE-PATH"), SubLObjectFactory.makeSymbol("_CSETF-CLASS-INSTANCE-VAR-DECLS"), SubLObjectFactory.makeSymbol("_CSETF-CLASS-CLASS-VAR-DECLS"), SubLObjectFactory.makeSymbol("_CSETF-CLASS-COMPILED-INSTANCE-SLOT-ACCESS-ALIST"), SubLObjectFactory.makeSymbol("_CSETF-CLASS-COMPILED-INSTANCE-BOOLEAN-SLOT-ACCESS-ALIST"), SubLObjectFactory.makeSymbol("_CSETF-CLASS-COMPILED-CLASS-SLOT-ACCESS-ALIST"), SubLObjectFactory.makeSymbol("_CSETF-CLASS-COMPILED-CLASS-BOOLEAN-SLOT-ACCESS-ALIST"), SubLObjectFactory.makeSymbol("_CSETF-CLASS-SLOT-ACCESSOR-ALIST"), SubLObjectFactory.makeSymbol("_CSETF-CLASS-INSTANCE-METHOD-DECLS"), SubLObjectFactory.makeSymbol("_CSETF-CLASS-CLASS-METHOD-DECLS"), SubLObjectFactory.makeSymbol("_CSETF-CLASS-BOOLEAN-SLOTS"), SubLObjectFactory.makeSymbol("_CSETF-CLASS-ANY-SLOTS"), SubLObjectFactory.makeSymbol("_CSETF-CLASS-COMPILED-INSTANCE-METHOD-ACCESS-ALIST"), SubLObjectFactory.makeSymbol("_CSETF-CLASS-COMPILED-CLASS-METHOD-ACCESS-ALIST"), SubLObjectFactory.makeSymbol("_CSETF-CLASS-TABLIFIED-INSTANCE-METHODS"), SubLObjectFactory.makeSymbol("_CSETF-CLASS-DEFINITION-LOCK"), SubLObjectFactory.makeSymbol("_CSETF-CLASS-ACCESS-LOCK"), SubLObjectFactory.makeSymbol("_CSETF-CLASS-SYNCHRONIZED-SLOTS-P"), SubLObjectFactory.makeSymbol("_CSETF-CLASS-PLIST"), SubLObjectFactory.makeSymbol("_CSETF-CLASS-CLASS-INITIALIZATION-FUNCTION"), SubLObjectFactory.makeSymbol("_CSETF-CLASS-CLASS-INITIALIZED-P"), SubLObjectFactory.makeSymbol("_CSETF-CLASS-INSTANCE-INITIALIZATION-FUNCTION"), SubLObjectFactory.makeSymbol("_CSETF-CLASS-CLASS-PROPERTIES") });
        $sym6$PRINT_CLASS = SubLObjectFactory.makeSymbol("PRINT-CLASS");
        $int7$21 = SubLObjectFactory.makeInteger(21);
        $int8$22 = SubLObjectFactory.makeInteger(22);
        $int9$23 = SubLObjectFactory.makeInteger(23);
        $int10$24 = SubLObjectFactory.makeInteger(24);
        $int11$25 = SubLObjectFactory.makeInteger(25);
        $int12$26 = SubLObjectFactory.makeInteger(26);
        $int13$27 = SubLObjectFactory.makeInteger(27);
        $int14$28 = SubLObjectFactory.makeInteger(28);
        $int15$29 = SubLObjectFactory.makeInteger(29);
        $sym16$CLASS_PRINT_FUNCTION_TRAMPOLINE = SubLObjectFactory.makeSymbol("CLASS-PRINT-FUNCTION-TRAMPOLINE");
        $list17 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("CLASS-P"));
        $sym18$CLASS_NAME = SubLObjectFactory.makeSymbol("CLASS-NAME");
        $sym19$_CSETF_CLASS_NAME = SubLObjectFactory.makeSymbol("_CSETF-CLASS-NAME", "SUBLISP");
        $sym20$CLASS_PARENT = SubLObjectFactory.makeSymbol("CLASS-PARENT");
        $sym21$_CSETF_CLASS_PARENT = SubLObjectFactory.makeSymbol("_CSETF-CLASS-PARENT");
        $sym22$CLASS_SUBCLASSES = SubLObjectFactory.makeSymbol("CLASS-SUBCLASSES");
        $sym23$_CSETF_CLASS_SUBCLASSES = SubLObjectFactory.makeSymbol("_CSETF-CLASS-SUBCLASSES");
        $sym24$CLASS_INTERFACE_NAMES = SubLObjectFactory.makeSymbol("CLASS-INTERFACE-NAMES");
        $sym25$_CSETF_CLASS_INTERFACE_NAMES = SubLObjectFactory.makeSymbol("_CSETF-CLASS-INTERFACE-NAMES");
        $sym26$CLASS_INTERFACES = SubLObjectFactory.makeSymbol("CLASS-INTERFACES");
        $sym27$_CSETF_CLASS_INTERFACES = SubLObjectFactory.makeSymbol("_CSETF-CLASS-INTERFACES");
        $sym28$CLASS_COMPILED_INHERITANCE_PATH = SubLObjectFactory.makeSymbol("CLASS-COMPILED-INHERITANCE-PATH");
        $sym29$_CSETF_CLASS_COMPILED_INHERITANCE_PATH = SubLObjectFactory.makeSymbol("_CSETF-CLASS-COMPILED-INHERITANCE-PATH");
        $sym30$CLASS_INSTANCE_VAR_DECLS = SubLObjectFactory.makeSymbol("CLASS-INSTANCE-VAR-DECLS");
        $sym31$_CSETF_CLASS_INSTANCE_VAR_DECLS = SubLObjectFactory.makeSymbol("_CSETF-CLASS-INSTANCE-VAR-DECLS");
        $sym32$CLASS_CLASS_VAR_DECLS = SubLObjectFactory.makeSymbol("CLASS-CLASS-VAR-DECLS");
        $sym33$_CSETF_CLASS_CLASS_VAR_DECLS = SubLObjectFactory.makeSymbol("_CSETF-CLASS-CLASS-VAR-DECLS");
        $sym34$CLASS_COMPILED_INSTANCE_SLOT_ACCESS_ALIST = SubLObjectFactory.makeSymbol("CLASS-COMPILED-INSTANCE-SLOT-ACCESS-ALIST");
        $sym35$_CSETF_CLASS_COMPILED_INSTANCE_SLOT_ACCESS_ALIST = SubLObjectFactory.makeSymbol("_CSETF-CLASS-COMPILED-INSTANCE-SLOT-ACCESS-ALIST");
        $sym36$CLASS_COMPILED_INSTANCE_BOOLEAN_SLOT_ACCESS_ALIST = SubLObjectFactory.makeSymbol("CLASS-COMPILED-INSTANCE-BOOLEAN-SLOT-ACCESS-ALIST");
        $sym37$_CSETF_CLASS_COMPILED_INSTANCE_BOOLEAN_SLOT_ACCESS_ALIST = SubLObjectFactory.makeSymbol("_CSETF-CLASS-COMPILED-INSTANCE-BOOLEAN-SLOT-ACCESS-ALIST");
        $sym38$CLASS_COMPILED_CLASS_SLOT_ACCESS_ALIST = SubLObjectFactory.makeSymbol("CLASS-COMPILED-CLASS-SLOT-ACCESS-ALIST");
        $sym39$_CSETF_CLASS_COMPILED_CLASS_SLOT_ACCESS_ALIST = SubLObjectFactory.makeSymbol("_CSETF-CLASS-COMPILED-CLASS-SLOT-ACCESS-ALIST");
        $sym40$CLASS_COMPILED_CLASS_BOOLEAN_SLOT_ACCESS_ALIST = SubLObjectFactory.makeSymbol("CLASS-COMPILED-CLASS-BOOLEAN-SLOT-ACCESS-ALIST");
        $sym41$_CSETF_CLASS_COMPILED_CLASS_BOOLEAN_SLOT_ACCESS_ALIST = SubLObjectFactory.makeSymbol("_CSETF-CLASS-COMPILED-CLASS-BOOLEAN-SLOT-ACCESS-ALIST");
        $sym42$CLASS_SLOT_ACCESSOR_ALIST = SubLObjectFactory.makeSymbol("CLASS-SLOT-ACCESSOR-ALIST");
        $sym43$_CSETF_CLASS_SLOT_ACCESSOR_ALIST = SubLObjectFactory.makeSymbol("_CSETF-CLASS-SLOT-ACCESSOR-ALIST");
        $sym44$CLASS_INSTANCE_METHOD_DECLS = SubLObjectFactory.makeSymbol("CLASS-INSTANCE-METHOD-DECLS");
        $sym45$_CSETF_CLASS_INSTANCE_METHOD_DECLS = SubLObjectFactory.makeSymbol("_CSETF-CLASS-INSTANCE-METHOD-DECLS");
        $sym46$CLASS_CLASS_METHOD_DECLS = SubLObjectFactory.makeSymbol("CLASS-CLASS-METHOD-DECLS");
        $sym47$_CSETF_CLASS_CLASS_METHOD_DECLS = SubLObjectFactory.makeSymbol("_CSETF-CLASS-CLASS-METHOD-DECLS");
        $sym48$CLASS_BOOLEAN_SLOTS = SubLObjectFactory.makeSymbol("CLASS-BOOLEAN-SLOTS");
        $sym49$_CSETF_CLASS_BOOLEAN_SLOTS = SubLObjectFactory.makeSymbol("_CSETF-CLASS-BOOLEAN-SLOTS");
        $sym50$CLASS_ANY_SLOTS = SubLObjectFactory.makeSymbol("CLASS-ANY-SLOTS");
        $sym51$_CSETF_CLASS_ANY_SLOTS = SubLObjectFactory.makeSymbol("_CSETF-CLASS-ANY-SLOTS");
        $sym52$CLASS_COMPILED_INSTANCE_METHOD_ACCESS_ALIST = SubLObjectFactory.makeSymbol("CLASS-COMPILED-INSTANCE-METHOD-ACCESS-ALIST");
        $sym53$_CSETF_CLASS_COMPILED_INSTANCE_METHOD_ACCESS_ALIST = SubLObjectFactory.makeSymbol("_CSETF-CLASS-COMPILED-INSTANCE-METHOD-ACCESS-ALIST");
        $sym54$CLASS_COMPILED_CLASS_METHOD_ACCESS_ALIST = SubLObjectFactory.makeSymbol("CLASS-COMPILED-CLASS-METHOD-ACCESS-ALIST");
        $sym55$_CSETF_CLASS_COMPILED_CLASS_METHOD_ACCESS_ALIST = SubLObjectFactory.makeSymbol("_CSETF-CLASS-COMPILED-CLASS-METHOD-ACCESS-ALIST");
        $sym56$CLASS_TABLIFIED_INSTANCE_METHODS = SubLObjectFactory.makeSymbol("CLASS-TABLIFIED-INSTANCE-METHODS");
        $sym57$_CSETF_CLASS_TABLIFIED_INSTANCE_METHODS = SubLObjectFactory.makeSymbol("_CSETF-CLASS-TABLIFIED-INSTANCE-METHODS");
        $sym58$CLASS_DEFINITION_LOCK = SubLObjectFactory.makeSymbol("CLASS-DEFINITION-LOCK");
        $sym59$_CSETF_CLASS_DEFINITION_LOCK = SubLObjectFactory.makeSymbol("_CSETF-CLASS-DEFINITION-LOCK");
        $sym60$CLASS_ACCESS_LOCK = SubLObjectFactory.makeSymbol("CLASS-ACCESS-LOCK");
        $sym61$_CSETF_CLASS_ACCESS_LOCK = SubLObjectFactory.makeSymbol("_CSETF-CLASS-ACCESS-LOCK");
        $sym62$CLASS_SYNCHRONIZED_SLOTS_P = SubLObjectFactory.makeSymbol("CLASS-SYNCHRONIZED-SLOTS-P");
        $sym63$_CSETF_CLASS_SYNCHRONIZED_SLOTS_P = SubLObjectFactory.makeSymbol("_CSETF-CLASS-SYNCHRONIZED-SLOTS-P");
        $sym64$CLASS_PLIST = SubLObjectFactory.makeSymbol("CLASS-PLIST");
        $sym65$_CSETF_CLASS_PLIST = SubLObjectFactory.makeSymbol("_CSETF-CLASS-PLIST");
        $sym66$CLASS_CLASS_INITIALIZATION_FUNCTION = SubLObjectFactory.makeSymbol("CLASS-CLASS-INITIALIZATION-FUNCTION");
        $sym67$_CSETF_CLASS_CLASS_INITIALIZATION_FUNCTION = SubLObjectFactory.makeSymbol("_CSETF-CLASS-CLASS-INITIALIZATION-FUNCTION");
        $sym68$CLASS_CLASS_INITIALIZED_P = SubLObjectFactory.makeSymbol("CLASS-CLASS-INITIALIZED-P");
        $sym69$_CSETF_CLASS_CLASS_INITIALIZED_P = SubLObjectFactory.makeSymbol("_CSETF-CLASS-CLASS-INITIALIZED-P");
        $sym70$CLASS_INSTANCE_INITIALIZATION_FUNCTION = SubLObjectFactory.makeSymbol("CLASS-INSTANCE-INITIALIZATION-FUNCTION");
        $sym71$_CSETF_CLASS_INSTANCE_INITIALIZATION_FUNCTION = SubLObjectFactory.makeSymbol("_CSETF-CLASS-INSTANCE-INITIALIZATION-FUNCTION");
        $sym72$CLASS_CLASS_PROPERTIES = SubLObjectFactory.makeSymbol("CLASS-CLASS-PROPERTIES");
        $sym73$_CSETF_CLASS_CLASS_PROPERTIES = SubLObjectFactory.makeSymbol("_CSETF-CLASS-CLASS-PROPERTIES");
        $kw74$NAME = SubLObjectFactory.makeKeyword("NAME");
        $kw75$PARENT = SubLObjectFactory.makeKeyword("PARENT");
        $kw76$SUBCLASSES = SubLObjectFactory.makeKeyword("SUBCLASSES");
        $kw77$INTERFACE_NAMES = SubLObjectFactory.makeKeyword("INTERFACE-NAMES");
        $kw78$INTERFACES = SubLObjectFactory.makeKeyword("INTERFACES");
        $kw79$COMPILED_INHERITANCE_PATH = SubLObjectFactory.makeKeyword("COMPILED-INHERITANCE-PATH");
        $kw80$INSTANCE_VAR_DECLS = SubLObjectFactory.makeKeyword("INSTANCE-VAR-DECLS");
        $kw81$CLASS_VAR_DECLS = SubLObjectFactory.makeKeyword("CLASS-VAR-DECLS");
        $kw82$COMPILED_INSTANCE_SLOT_ACCESS_ALIST = SubLObjectFactory.makeKeyword("COMPILED-INSTANCE-SLOT-ACCESS-ALIST");
        $kw83$COMPILED_INSTANCE_BOOLEAN_SLOT_ACCESS_ALIST = SubLObjectFactory.makeKeyword("COMPILED-INSTANCE-BOOLEAN-SLOT-ACCESS-ALIST");
        $kw84$COMPILED_CLASS_SLOT_ACCESS_ALIST = SubLObjectFactory.makeKeyword("COMPILED-CLASS-SLOT-ACCESS-ALIST");
        $kw85$COMPILED_CLASS_BOOLEAN_SLOT_ACCESS_ALIST = SubLObjectFactory.makeKeyword("COMPILED-CLASS-BOOLEAN-SLOT-ACCESS-ALIST");
        $kw86$SLOT_ACCESSOR_ALIST = SubLObjectFactory.makeKeyword("SLOT-ACCESSOR-ALIST");
        $kw87$INSTANCE_METHOD_DECLS = SubLObjectFactory.makeKeyword("INSTANCE-METHOD-DECLS");
        $kw88$CLASS_METHOD_DECLS = SubLObjectFactory.makeKeyword("CLASS-METHOD-DECLS");
        $kw89$BOOLEAN_SLOTS = SubLObjectFactory.makeKeyword("BOOLEAN-SLOTS");
        $kw90$ANY_SLOTS = SubLObjectFactory.makeKeyword("ANY-SLOTS");
        $kw91$COMPILED_INSTANCE_METHOD_ACCESS_ALIST = SubLObjectFactory.makeKeyword("COMPILED-INSTANCE-METHOD-ACCESS-ALIST");
        $kw92$COMPILED_CLASS_METHOD_ACCESS_ALIST = SubLObjectFactory.makeKeyword("COMPILED-CLASS-METHOD-ACCESS-ALIST");
        $kw93$TABLIFIED_INSTANCE_METHODS = SubLObjectFactory.makeKeyword("TABLIFIED-INSTANCE-METHODS");
        $kw94$DEFINITION_LOCK = SubLObjectFactory.makeKeyword("DEFINITION-LOCK");
        $kw95$ACCESS_LOCK = SubLObjectFactory.makeKeyword("ACCESS-LOCK");
        $kw96$SYNCHRONIZED_SLOTS_P = SubLObjectFactory.makeKeyword("SYNCHRONIZED-SLOTS-P");
        $kw97$PLIST = SubLObjectFactory.makeKeyword("PLIST");
        $kw98$CLASS_INITIALIZATION_FUNCTION = SubLObjectFactory.makeKeyword("CLASS-INITIALIZATION-FUNCTION");
        $kw99$CLASS_INITIALIZED_P = SubLObjectFactory.makeKeyword("CLASS-INITIALIZED-P");
        $kw100$INSTANCE_INITIALIZATION_FUNCTION = SubLObjectFactory.makeKeyword("INSTANCE-INITIALIZATION-FUNCTION");
        $kw101$CLASS_PROPERTIES = SubLObjectFactory.makeKeyword("CLASS-PROPERTIES");
        $str102$Invalid_slot__S_for_construction_ = SubLObjectFactory.makeString("Invalid slot ~S for construction function");
        $kw103$BEGIN = SubLObjectFactory.makeKeyword("BEGIN");
        $sym104$MAKE_CLASS = SubLObjectFactory.makeSymbol("MAKE-CLASS");
        $kw105$SLOT = SubLObjectFactory.makeKeyword("SLOT");
        $kw106$END = SubLObjectFactory.makeKeyword("END");
        $sym107$VISIT_DEFSTRUCT_OBJECT_CLASS_METHOD = SubLObjectFactory.makeSymbol("VISIT-DEFSTRUCT-OBJECT-CLASS-METHOD");
        $list108 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLASS"), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("FORMS"));
        $str109$class = SubLObjectFactory.makeString("class");
        $sym110$CLASS_ = SubLObjectFactory.makeSymbol("CLASS-");
        $list111 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("NAME"), SubLObjectFactory.makeSymbol("PARENT"), SubLObjectFactory.makeSymbol("SUBCLASSES"), SubLObjectFactory.makeSymbol("INTERFACE-NAMES"), SubLObjectFactory.makeSymbol("INTERFACES"), SubLObjectFactory.makeSymbol("COMPILED-INHERITANCE-PATH"), SubLObjectFactory.makeSymbol("INSTANCE-VAR-DECLS"), SubLObjectFactory.makeSymbol("CLASS-VAR-DECLS"), SubLObjectFactory.makeSymbol("COMPILED-INSTANCE-SLOT-ACCESS-ALIST"), SubLObjectFactory.makeSymbol("COMPILED-INSTANCE-BOOLEAN-SLOT-ACCESS-ALIST"), SubLObjectFactory.makeSymbol("COMPILED-CLASS-SLOT-ACCESS-ALIST"), SubLObjectFactory.makeSymbol("COMPILED-CLASS-BOOLEAN-SLOT-ACCESS-ALIST"), SubLObjectFactory.makeSymbol("SLOT-ACCESSOR-ALIST"), SubLObjectFactory.makeSymbol("INSTANCE-METHOD-DECLS"), SubLObjectFactory.makeSymbol("CLASS-METHOD-DECLS"), SubLObjectFactory.makeSymbol("BOOLEAN-SLOTS"), SubLObjectFactory.makeSymbol("ANY-SLOTS"), SubLObjectFactory.makeSymbol("COMPILED-INSTANCE-METHOD-ACCESS-ALIST"), SubLObjectFactory.makeSymbol("COMPILED-CLASS-METHOD-ACCESS-ALIST"), SubLObjectFactory.makeSymbol("TABLIFIED-INSTANCE-METHODS"), SubLObjectFactory.makeSymbol("CLASS-INITIALIZATION-FUNCTION"), SubLObjectFactory.makeSymbol("INSTANCE-INITIALIZATION-FUNCTION") });
        $str112$__CLASS__S_ = SubLObjectFactory.makeString("#<CLASS:~S>");
        $list113 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PROPERTY-NAME"), (SubLObject)SubLObjectFactory.makeSymbol("OFFSET"));
        $str114$SUBLOOP_CLASS_PROPERTY_ = SubLObjectFactory.makeString("SUBLOOP-CLASS-PROPERTY-");
        $str115$GET_ = SubLObjectFactory.makeString("GET-");
        $str116$SET_ = SubLObjectFactory.makeString("SET-");
        $sym117$PROGN = SubLObjectFactory.makeSymbol("PROGN");
        $sym118$DEFINE_PROTECTED = SubLObjectFactory.makeSymbol("DEFINE-PROTECTED");
        $list119 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLASS-STRUCTURE"));
        $sym120$RET = SubLObjectFactory.makeSymbol("RET");
        $sym121$LDB_TEST = SubLObjectFactory.makeSymbol("LDB-TEST");
        $sym122$BYTE = SubLObjectFactory.makeSymbol("BYTE");
        $list123 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLASS-CLASS-PROPERTIES"), (SubLObject)SubLObjectFactory.makeSymbol("CLASS-STRUCTURE")));
        $list124 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLASS-STRUCTURE"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-VALUE"));
        $sym125$CSETF = SubLObjectFactory.makeSymbol("CSETF");
        $list126 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLASS-CLASS-PROPERTIES"), (SubLObject)SubLObjectFactory.makeSymbol("CLASS-STRUCTURE"));
        $sym127$DPB = SubLObjectFactory.makeSymbol("DPB");
        $list128 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIF"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-VALUE"), (SubLObject)subloop_structures.ONE_INTEGER, (SubLObject)subloop_structures.ZERO_INTEGER);
        $list129 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-VALUE")));
        $sym130$INSTANCE = SubLObjectFactory.makeSymbol("INSTANCE");
        $sym131$INSTANCE_P = SubLObjectFactory.makeSymbol("INSTANCE-P");
        $list132 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLASS"), (SubLObject)SubLObjectFactory.makeSymbol("BOOLEAN-SLOTS"), (SubLObject)SubLObjectFactory.makeSymbol("ANY-SLOTS"), (SubLObject)SubLObjectFactory.makeSymbol("PLIST"));
        $list133 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CLASS"), (SubLObject)SubLObjectFactory.makeKeyword("BOOLEAN-SLOTS"), (SubLObject)SubLObjectFactory.makeKeyword("ANY-SLOTS"), (SubLObject)SubLObjectFactory.makeKeyword("PLIST"));
        $list134 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INSTANCE-CLASS"), (SubLObject)SubLObjectFactory.makeSymbol("INSTANCE-BOOLEAN-SLOTS"), (SubLObject)SubLObjectFactory.makeSymbol("INSTANCE-ANY-SLOTS"), (SubLObject)SubLObjectFactory.makeSymbol("INSTANCE-PLIST"));
        $list135 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("_CSETF-INSTANCE-CLASS"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-INSTANCE-BOOLEAN-SLOTS"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-INSTANCE-ANY-SLOTS"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-INSTANCE-PLIST"));
        $sym136$PRINT_INSTANCE = SubLObjectFactory.makeSymbol("PRINT-INSTANCE");
        $sym137$INSTANCE_PRINT_FUNCTION_TRAMPOLINE = SubLObjectFactory.makeSymbol("INSTANCE-PRINT-FUNCTION-TRAMPOLINE");
        $list138 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("INSTANCE-P"));
        $sym139$INSTANCE_CLASS = SubLObjectFactory.makeSymbol("INSTANCE-CLASS");
        $sym140$_CSETF_INSTANCE_CLASS = SubLObjectFactory.makeSymbol("_CSETF-INSTANCE-CLASS");
        $sym141$INSTANCE_BOOLEAN_SLOTS = SubLObjectFactory.makeSymbol("INSTANCE-BOOLEAN-SLOTS");
        $sym142$_CSETF_INSTANCE_BOOLEAN_SLOTS = SubLObjectFactory.makeSymbol("_CSETF-INSTANCE-BOOLEAN-SLOTS");
        $sym143$INSTANCE_ANY_SLOTS = SubLObjectFactory.makeSymbol("INSTANCE-ANY-SLOTS");
        $sym144$_CSETF_INSTANCE_ANY_SLOTS = SubLObjectFactory.makeSymbol("_CSETF-INSTANCE-ANY-SLOTS");
        $sym145$INSTANCE_PLIST = SubLObjectFactory.makeSymbol("INSTANCE-PLIST");
        $sym146$_CSETF_INSTANCE_PLIST = SubLObjectFactory.makeSymbol("_CSETF-INSTANCE-PLIST");
        $kw147$CLASS = SubLObjectFactory.makeKeyword("CLASS");
        $sym148$MAKE_INSTANCE = SubLObjectFactory.makeSymbol("MAKE-INSTANCE");
        $sym149$VISIT_DEFSTRUCT_OBJECT_INSTANCE_METHOD = SubLObjectFactory.makeSymbol("VISIT-DEFSTRUCT-OBJECT-INSTANCE-METHOD");
        $list150 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INSTANCE"), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("FORMS"));
        $str151$instance = SubLObjectFactory.makeString("instance");
        $sym152$INSTANCE_ = SubLObjectFactory.makeSymbol("INSTANCE-");
        $sym153$OBJECT = SubLObjectFactory.makeSymbol("OBJECT");
        $sym154$PRINT = SubLObjectFactory.makeSymbol("PRINT");
        $str155$__Instance_of__S_ = SubLObjectFactory.makeString("#<Instance of ~S>");
        $sym156$INTERFACE = SubLObjectFactory.makeSymbol("INTERFACE");
        $sym157$INTERFACE_P = SubLObjectFactory.makeSymbol("INTERFACE-P");
        $list158 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("NAME"), SubLObjectFactory.makeSymbol("PARENTS"), SubLObjectFactory.makeSymbol("COMPILED-INHERITANCE-PATH"), SubLObjectFactory.makeSymbol("SUBINTERFACES"), SubLObjectFactory.makeSymbol("IMPLEMENTERS"), SubLObjectFactory.makeSymbol("INSTANCE-METHOD-DECLS"), SubLObjectFactory.makeSymbol("CLASS-METHOD-DECLS"), SubLObjectFactory.makeSymbol("COMPILED-INSTANCE-METHOD-DECLS"), SubLObjectFactory.makeSymbol("COMPILED-CLASS-METHOD-DECLS"), SubLObjectFactory.makeSymbol("LOCAL-CLASS-METHODS"), SubLObjectFactory.makeSymbol("LOCAL-INSTANCE-METHODS"), SubLObjectFactory.makeSymbol("MARK-LIST"), SubLObjectFactory.makeSymbol("PLIST"), SubLObjectFactory.makeSymbol("DEFINITION-LOCK") });
        $list159 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("NAME"), SubLObjectFactory.makeKeyword("PARENTS"), SubLObjectFactory.makeKeyword("COMPILED-INHERITANCE-PATH"), SubLObjectFactory.makeKeyword("SUBINTERFACES"), SubLObjectFactory.makeKeyword("IMPLEMENTERS"), SubLObjectFactory.makeKeyword("INSTANCE-METHOD-DECLS"), SubLObjectFactory.makeKeyword("CLASS-METHOD-DECLS"), SubLObjectFactory.makeKeyword("COMPILED-INSTANCE-METHOD-DECLS"), SubLObjectFactory.makeKeyword("COMPILED-CLASS-METHOD-DECLS"), SubLObjectFactory.makeKeyword("LOCAL-CLASS-METHODS"), SubLObjectFactory.makeKeyword("LOCAL-INSTANCE-METHODS"), SubLObjectFactory.makeKeyword("MARK-LIST"), SubLObjectFactory.makeKeyword("PLIST"), SubLObjectFactory.makeKeyword("DEFINITION-LOCK") });
        $list160 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("INTERFACE-NAME"), SubLObjectFactory.makeSymbol("INTERFACE-PARENTS"), SubLObjectFactory.makeSymbol("INTERFACE-COMPILED-INHERITANCE-PATH"), SubLObjectFactory.makeSymbol("INTERFACE-SUBINTERFACES"), SubLObjectFactory.makeSymbol("INTERFACE-IMPLEMENTERS"), SubLObjectFactory.makeSymbol("INTERFACE-INSTANCE-METHOD-DECLS"), SubLObjectFactory.makeSymbol("INTERFACE-CLASS-METHOD-DECLS"), SubLObjectFactory.makeSymbol("INTERFACE-COMPILED-INSTANCE-METHOD-DECLS"), SubLObjectFactory.makeSymbol("INTERFACE-COMPILED-CLASS-METHOD-DECLS"), SubLObjectFactory.makeSymbol("INTERFACE-LOCAL-CLASS-METHODS"), SubLObjectFactory.makeSymbol("INTERFACE-LOCAL-INSTANCE-METHODS"), SubLObjectFactory.makeSymbol("INTERFACE-MARK-LIST"), SubLObjectFactory.makeSymbol("INTERFACE-PLIST"), SubLObjectFactory.makeSymbol("INTERFACE-DEFINITION-LOCK") });
        $list161 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("_CSETF-INTERFACE-NAME"), SubLObjectFactory.makeSymbol("_CSETF-INTERFACE-PARENTS"), SubLObjectFactory.makeSymbol("_CSETF-INTERFACE-COMPILED-INHERITANCE-PATH"), SubLObjectFactory.makeSymbol("_CSETF-INTERFACE-SUBINTERFACES"), SubLObjectFactory.makeSymbol("_CSETF-INTERFACE-IMPLEMENTERS"), SubLObjectFactory.makeSymbol("_CSETF-INTERFACE-INSTANCE-METHOD-DECLS"), SubLObjectFactory.makeSymbol("_CSETF-INTERFACE-CLASS-METHOD-DECLS"), SubLObjectFactory.makeSymbol("_CSETF-INTERFACE-COMPILED-INSTANCE-METHOD-DECLS"), SubLObjectFactory.makeSymbol("_CSETF-INTERFACE-COMPILED-CLASS-METHOD-DECLS"), SubLObjectFactory.makeSymbol("_CSETF-INTERFACE-LOCAL-CLASS-METHODS"), SubLObjectFactory.makeSymbol("_CSETF-INTERFACE-LOCAL-INSTANCE-METHODS"), SubLObjectFactory.makeSymbol("_CSETF-INTERFACE-MARK-LIST"), SubLObjectFactory.makeSymbol("_CSETF-INTERFACE-PLIST"), SubLObjectFactory.makeSymbol("_CSETF-INTERFACE-DEFINITION-LOCK") });
        $sym162$PRINT_INTERFACE = SubLObjectFactory.makeSymbol("PRINT-INTERFACE");
        $sym163$INTERFACE_PRINT_FUNCTION_TRAMPOLINE = SubLObjectFactory.makeSymbol("INTERFACE-PRINT-FUNCTION-TRAMPOLINE");
        $list164 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("INTERFACE-P"));
        $sym165$INTERFACE_NAME = SubLObjectFactory.makeSymbol("INTERFACE-NAME");
        $sym166$_CSETF_INTERFACE_NAME = SubLObjectFactory.makeSymbol("_CSETF-INTERFACE-NAME");
        $sym167$INTERFACE_PARENTS = SubLObjectFactory.makeSymbol("INTERFACE-PARENTS");
        $sym168$_CSETF_INTERFACE_PARENTS = SubLObjectFactory.makeSymbol("_CSETF-INTERFACE-PARENTS");
        $sym169$INTERFACE_COMPILED_INHERITANCE_PATH = SubLObjectFactory.makeSymbol("INTERFACE-COMPILED-INHERITANCE-PATH");
        $sym170$_CSETF_INTERFACE_COMPILED_INHERITANCE_PATH = SubLObjectFactory.makeSymbol("_CSETF-INTERFACE-COMPILED-INHERITANCE-PATH");
        $sym171$INTERFACE_SUBINTERFACES = SubLObjectFactory.makeSymbol("INTERFACE-SUBINTERFACES");
        $sym172$_CSETF_INTERFACE_SUBINTERFACES = SubLObjectFactory.makeSymbol("_CSETF-INTERFACE-SUBINTERFACES");
        $sym173$INTERFACE_IMPLEMENTERS = SubLObjectFactory.makeSymbol("INTERFACE-IMPLEMENTERS");
        $sym174$_CSETF_INTERFACE_IMPLEMENTERS = SubLObjectFactory.makeSymbol("_CSETF-INTERFACE-IMPLEMENTERS");
        $sym175$INTERFACE_INSTANCE_METHOD_DECLS = SubLObjectFactory.makeSymbol("INTERFACE-INSTANCE-METHOD-DECLS");
        $sym176$_CSETF_INTERFACE_INSTANCE_METHOD_DECLS = SubLObjectFactory.makeSymbol("_CSETF-INTERFACE-INSTANCE-METHOD-DECLS");
        $sym177$INTERFACE_CLASS_METHOD_DECLS = SubLObjectFactory.makeSymbol("INTERFACE-CLASS-METHOD-DECLS");
        $sym178$_CSETF_INTERFACE_CLASS_METHOD_DECLS = SubLObjectFactory.makeSymbol("_CSETF-INTERFACE-CLASS-METHOD-DECLS");
        $sym179$INTERFACE_COMPILED_INSTANCE_METHOD_DECLS = SubLObjectFactory.makeSymbol("INTERFACE-COMPILED-INSTANCE-METHOD-DECLS");
        $sym180$_CSETF_INTERFACE_COMPILED_INSTANCE_METHOD_DECLS = SubLObjectFactory.makeSymbol("_CSETF-INTERFACE-COMPILED-INSTANCE-METHOD-DECLS");
        $sym181$INTERFACE_COMPILED_CLASS_METHOD_DECLS = SubLObjectFactory.makeSymbol("INTERFACE-COMPILED-CLASS-METHOD-DECLS");
        $sym182$_CSETF_INTERFACE_COMPILED_CLASS_METHOD_DECLS = SubLObjectFactory.makeSymbol("_CSETF-INTERFACE-COMPILED-CLASS-METHOD-DECLS");
        $sym183$INTERFACE_LOCAL_CLASS_METHODS = SubLObjectFactory.makeSymbol("INTERFACE-LOCAL-CLASS-METHODS");
        $sym184$_CSETF_INTERFACE_LOCAL_CLASS_METHODS = SubLObjectFactory.makeSymbol("_CSETF-INTERFACE-LOCAL-CLASS-METHODS");
        $sym185$INTERFACE_LOCAL_INSTANCE_METHODS = SubLObjectFactory.makeSymbol("INTERFACE-LOCAL-INSTANCE-METHODS");
        $sym186$_CSETF_INTERFACE_LOCAL_INSTANCE_METHODS = SubLObjectFactory.makeSymbol("_CSETF-INTERFACE-LOCAL-INSTANCE-METHODS");
        $sym187$INTERFACE_MARK_LIST = SubLObjectFactory.makeSymbol("INTERFACE-MARK-LIST");
        $sym188$_CSETF_INTERFACE_MARK_LIST = SubLObjectFactory.makeSymbol("_CSETF-INTERFACE-MARK-LIST");
        $sym189$INTERFACE_PLIST = SubLObjectFactory.makeSymbol("INTERFACE-PLIST");
        $sym190$_CSETF_INTERFACE_PLIST = SubLObjectFactory.makeSymbol("_CSETF-INTERFACE-PLIST");
        $sym191$INTERFACE_DEFINITION_LOCK = SubLObjectFactory.makeSymbol("INTERFACE-DEFINITION-LOCK");
        $sym192$_CSETF_INTERFACE_DEFINITION_LOCK = SubLObjectFactory.makeSymbol("_CSETF-INTERFACE-DEFINITION-LOCK");
        $kw193$PARENTS = SubLObjectFactory.makeKeyword("PARENTS");
        $kw194$SUBINTERFACES = SubLObjectFactory.makeKeyword("SUBINTERFACES");
        $kw195$IMPLEMENTERS = SubLObjectFactory.makeKeyword("IMPLEMENTERS");
        $kw196$COMPILED_INSTANCE_METHOD_DECLS = SubLObjectFactory.makeKeyword("COMPILED-INSTANCE-METHOD-DECLS");
        $kw197$COMPILED_CLASS_METHOD_DECLS = SubLObjectFactory.makeKeyword("COMPILED-CLASS-METHOD-DECLS");
        $kw198$LOCAL_CLASS_METHODS = SubLObjectFactory.makeKeyword("LOCAL-CLASS-METHODS");
        $kw199$LOCAL_INSTANCE_METHODS = SubLObjectFactory.makeKeyword("LOCAL-INSTANCE-METHODS");
        $kw200$MARK_LIST = SubLObjectFactory.makeKeyword("MARK-LIST");
        $sym201$MAKE_INTERFACE = SubLObjectFactory.makeSymbol("MAKE-INTERFACE");
        $sym202$VISIT_DEFSTRUCT_OBJECT_INTERFACE_METHOD = SubLObjectFactory.makeSymbol("VISIT-DEFSTRUCT-OBJECT-INTERFACE-METHOD");
        $list203 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INTERFACE"), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("FORMS"));
        $str204$interface = SubLObjectFactory.makeString("interface");
        $sym205$INTERFACE_ = SubLObjectFactory.makeSymbol("INTERFACE-");
        $list206 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("NAME"), SubLObjectFactory.makeSymbol("PARENTS"), SubLObjectFactory.makeSymbol("COMPILED-INHERITANCE-PATH"), SubLObjectFactory.makeSymbol("SUBINTERFACES"), SubLObjectFactory.makeSymbol("IMPLEMENTERS"), SubLObjectFactory.makeSymbol("INSTANCE-METHOD-DECLS"), SubLObjectFactory.makeSymbol("CLASS-METHOD-DECLS"), SubLObjectFactory.makeSymbol("COMPILED-INSTANCE-METHOD-DECLS"), SubLObjectFactory.makeSymbol("COMPILED-CLASS-METHOD-DECLS"), SubLObjectFactory.makeSymbol("LOCAL-CLASS-METHODS"), SubLObjectFactory.makeSymbol("LOCAL-INSTANCE-METHODS") });
        $str207$__Interface__S_PARENTS___S_ = SubLObjectFactory.makeString("#<Interface:~S PARENTS: ~S>");
        $sym208$METHOD = SubLObjectFactory.makeSymbol("METHOD");
        $sym209$METHOD_P = SubLObjectFactory.makeSymbol("METHOD-P");
        $list210 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("NAME"), SubLObjectFactory.makeSymbol("CLASS-NAME"), SubLObjectFactory.makeSymbol("LAMBDA-LIST"), SubLObjectFactory.makeSymbol("BODY"), SubLObjectFactory.makeSymbol("PROTECTION"), SubLObjectFactory.makeSymbol("SCOPE"), SubLObjectFactory.makeSymbol("UPDATE-TYPE"), SubLObjectFactory.makeSymbol("FUNCTION-NAME"), SubLObjectFactory.makeSymbol("FUNCTION-DEF"), SubLObjectFactory.makeSymbol("BEFORE-LISTENERS"), SubLObjectFactory.makeSymbol("AFTER-LISTENERS"), SubLObjectFactory.makeSymbol("INSTANTIATE-TEMPLATE") });
        $list211 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("NAME"), SubLObjectFactory.makeKeyword("CLASS-NAME"), SubLObjectFactory.makeKeyword("LAMBDA-LIST"), SubLObjectFactory.makeKeyword("BODY"), SubLObjectFactory.makeKeyword("PROTECTION"), SubLObjectFactory.makeKeyword("SCOPE"), SubLObjectFactory.makeKeyword("UPDATE-TYPE"), SubLObjectFactory.makeKeyword("FUNCTION-NAME"), SubLObjectFactory.makeKeyword("FUNCTION-DEF"), SubLObjectFactory.makeKeyword("BEFORE-LISTENERS"), SubLObjectFactory.makeKeyword("AFTER-LISTENERS"), SubLObjectFactory.makeKeyword("INSTANTIATE-TEMPLATE") });
        $list212 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("METHOD-NAME"), SubLObjectFactory.makeSymbol("METHOD-CLASS-NAME"), SubLObjectFactory.makeSymbol("METHOD-LAMBDA-LIST"), SubLObjectFactory.makeSymbol("METHOD-BODY"), SubLObjectFactory.makeSymbol("METHOD-PROTECTION"), SubLObjectFactory.makeSymbol("METHOD-SCOPE"), SubLObjectFactory.makeSymbol("METHOD-UPDATE-TYPE"), SubLObjectFactory.makeSymbol("METHOD-FUNCTION-NAME"), SubLObjectFactory.makeSymbol("METHOD-FUNCTION-DEF"), SubLObjectFactory.makeSymbol("METHOD-BEFORE-LISTENERS"), SubLObjectFactory.makeSymbol("METHOD-AFTER-LISTENERS"), SubLObjectFactory.makeSymbol("METHOD-INSTANTIATE-TEMPLATE") });
        $list213 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("_CSETF-METHOD-NAME"), SubLObjectFactory.makeSymbol("_CSETF-METHOD-CLASS-NAME"), SubLObjectFactory.makeSymbol("_CSETF-METHOD-LAMBDA-LIST"), SubLObjectFactory.makeSymbol("_CSETF-METHOD-BODY"), SubLObjectFactory.makeSymbol("_CSETF-METHOD-PROTECTION"), SubLObjectFactory.makeSymbol("_CSETF-METHOD-SCOPE"), SubLObjectFactory.makeSymbol("_CSETF-METHOD-UPDATE-TYPE"), SubLObjectFactory.makeSymbol("_CSETF-METHOD-FUNCTION-NAME"), SubLObjectFactory.makeSymbol("_CSETF-METHOD-FUNCTION-DEF"), SubLObjectFactory.makeSymbol("_CSETF-METHOD-BEFORE-LISTENERS"), SubLObjectFactory.makeSymbol("_CSETF-METHOD-AFTER-LISTENERS"), SubLObjectFactory.makeSymbol("_CSETF-METHOD-INSTANTIATE-TEMPLATE") });
        $sym214$PRINT_METHOD = SubLObjectFactory.makeSymbol("PRINT-METHOD");
        $sym215$METHOD_PRINT_FUNCTION_TRAMPOLINE = SubLObjectFactory.makeSymbol("METHOD-PRINT-FUNCTION-TRAMPOLINE");
        $list216 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("METHOD-P"));
        $sym217$METHOD_NAME = SubLObjectFactory.makeSymbol("METHOD-NAME");
        $sym218$_CSETF_METHOD_NAME = SubLObjectFactory.makeSymbol("_CSETF-METHOD-NAME");
        $sym219$METHOD_CLASS_NAME = SubLObjectFactory.makeSymbol("METHOD-CLASS-NAME");
        $sym220$_CSETF_METHOD_CLASS_NAME = SubLObjectFactory.makeSymbol("_CSETF-METHOD-CLASS-NAME");
        $sym221$METHOD_LAMBDA_LIST = SubLObjectFactory.makeSymbol("METHOD-LAMBDA-LIST");
        $sym222$_CSETF_METHOD_LAMBDA_LIST = SubLObjectFactory.makeSymbol("_CSETF-METHOD-LAMBDA-LIST");
        $sym223$METHOD_BODY = SubLObjectFactory.makeSymbol("METHOD-BODY");
        $sym224$_CSETF_METHOD_BODY = SubLObjectFactory.makeSymbol("_CSETF-METHOD-BODY");
        $sym225$METHOD_PROTECTION = SubLObjectFactory.makeSymbol("METHOD-PROTECTION");
        $sym226$_CSETF_METHOD_PROTECTION = SubLObjectFactory.makeSymbol("_CSETF-METHOD-PROTECTION");
        $sym227$METHOD_SCOPE = SubLObjectFactory.makeSymbol("METHOD-SCOPE");
        $sym228$_CSETF_METHOD_SCOPE = SubLObjectFactory.makeSymbol("_CSETF-METHOD-SCOPE");
        $sym229$METHOD_UPDATE_TYPE = SubLObjectFactory.makeSymbol("METHOD-UPDATE-TYPE");
        $sym230$_CSETF_METHOD_UPDATE_TYPE = SubLObjectFactory.makeSymbol("_CSETF-METHOD-UPDATE-TYPE");
        $sym231$METHOD_FUNCTION_NAME = SubLObjectFactory.makeSymbol("METHOD-FUNCTION-NAME");
        $sym232$_CSETF_METHOD_FUNCTION_NAME = SubLObjectFactory.makeSymbol("_CSETF-METHOD-FUNCTION-NAME");
        $sym233$METHOD_FUNCTION_DEF = SubLObjectFactory.makeSymbol("METHOD-FUNCTION-DEF");
        $sym234$_CSETF_METHOD_FUNCTION_DEF = SubLObjectFactory.makeSymbol("_CSETF-METHOD-FUNCTION-DEF");
        $sym235$METHOD_BEFORE_LISTENERS = SubLObjectFactory.makeSymbol("METHOD-BEFORE-LISTENERS");
        $sym236$_CSETF_METHOD_BEFORE_LISTENERS = SubLObjectFactory.makeSymbol("_CSETF-METHOD-BEFORE-LISTENERS");
        $sym237$METHOD_AFTER_LISTENERS = SubLObjectFactory.makeSymbol("METHOD-AFTER-LISTENERS");
        $sym238$_CSETF_METHOD_AFTER_LISTENERS = SubLObjectFactory.makeSymbol("_CSETF-METHOD-AFTER-LISTENERS");
        $sym239$METHOD_INSTANTIATE_TEMPLATE = SubLObjectFactory.makeSymbol("METHOD-INSTANTIATE-TEMPLATE");
        $sym240$_CSETF_METHOD_INSTANTIATE_TEMPLATE = SubLObjectFactory.makeSymbol("_CSETF-METHOD-INSTANTIATE-TEMPLATE");
        $kw241$CLASS_NAME = SubLObjectFactory.makeKeyword("CLASS-NAME");
        $kw242$LAMBDA_LIST = SubLObjectFactory.makeKeyword("LAMBDA-LIST");
        $kw243$BODY = SubLObjectFactory.makeKeyword("BODY");
        $kw244$PROTECTION = SubLObjectFactory.makeKeyword("PROTECTION");
        $kw245$SCOPE = SubLObjectFactory.makeKeyword("SCOPE");
        $kw246$UPDATE_TYPE = SubLObjectFactory.makeKeyword("UPDATE-TYPE");
        $kw247$FUNCTION_NAME = SubLObjectFactory.makeKeyword("FUNCTION-NAME");
        $kw248$FUNCTION_DEF = SubLObjectFactory.makeKeyword("FUNCTION-DEF");
        $kw249$BEFORE_LISTENERS = SubLObjectFactory.makeKeyword("BEFORE-LISTENERS");
        $kw250$AFTER_LISTENERS = SubLObjectFactory.makeKeyword("AFTER-LISTENERS");
        $kw251$INSTANTIATE_TEMPLATE = SubLObjectFactory.makeKeyword("INSTANTIATE-TEMPLATE");
        $sym252$MAKE_METHOD = SubLObjectFactory.makeSymbol("MAKE-METHOD");
        $sym253$VISIT_DEFSTRUCT_OBJECT_METHOD_METHOD = SubLObjectFactory.makeSymbol("VISIT-DEFSTRUCT-OBJECT-METHOD-METHOD");
        $list254 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("FORMS"));
        $str255$method = SubLObjectFactory.makeString("method");
        $sym256$METHOD_ = SubLObjectFactory.makeSymbol("METHOD-");
        $str257$__METHOD____S__S___S_ = SubLObjectFactory.makeString("#<METHOD: (~S ~S) ~S>");
        $int258$100 = SubLObjectFactory.makeInteger(100);
        $sym259$METHOD_TRACE = SubLObjectFactory.makeSymbol("METHOD-TRACE");
        $sym260$METHOD_TRACE_P = SubLObjectFactory.makeSymbol("METHOD-TRACE-P");
        $list261 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NAME"), (SubLObject)SubLObjectFactory.makeSymbol("CLASS-NAME"), (SubLObject)SubLObjectFactory.makeSymbol("FUNCTION"), (SubLObject)SubLObjectFactory.makeSymbol("OUTER"));
        $list262 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NAME"), (SubLObject)SubLObjectFactory.makeKeyword("CLASS-NAME"), (SubLObject)SubLObjectFactory.makeKeyword("FUNCTION"), (SubLObject)SubLObjectFactory.makeKeyword("OUTER"));
        $list263 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("METHOD-TRACE-NAME"), (SubLObject)SubLObjectFactory.makeSymbol("METHOD-TRACE-CLASS-NAME"), (SubLObject)SubLObjectFactory.makeSymbol("METHOD-TRACE-FUNCTION"), (SubLObject)SubLObjectFactory.makeSymbol("METHOD-TRACE-OUTER"));
        $list264 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("_CSETF-METHOD-TRACE-NAME"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-METHOD-TRACE-CLASS-NAME"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-METHOD-TRACE-FUNCTION"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-METHOD-TRACE-OUTER"));
        $sym265$PRINT_METHOD_TRACE = SubLObjectFactory.makeSymbol("PRINT-METHOD-TRACE");
        $sym266$METHOD_TRACE_PRINT_FUNCTION_TRAMPOLINE = SubLObjectFactory.makeSymbol("METHOD-TRACE-PRINT-FUNCTION-TRAMPOLINE");
        $list267 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("METHOD-TRACE-P"));
        $sym268$METHOD_TRACE_NAME = SubLObjectFactory.makeSymbol("METHOD-TRACE-NAME");
        $sym269$_CSETF_METHOD_TRACE_NAME = SubLObjectFactory.makeSymbol("_CSETF-METHOD-TRACE-NAME");
        $sym270$METHOD_TRACE_CLASS_NAME = SubLObjectFactory.makeSymbol("METHOD-TRACE-CLASS-NAME");
        $sym271$_CSETF_METHOD_TRACE_CLASS_NAME = SubLObjectFactory.makeSymbol("_CSETF-METHOD-TRACE-CLASS-NAME");
        $sym272$METHOD_TRACE_FUNCTION = SubLObjectFactory.makeSymbol("METHOD-TRACE-FUNCTION");
        $sym273$_CSETF_METHOD_TRACE_FUNCTION = SubLObjectFactory.makeSymbol("_CSETF-METHOD-TRACE-FUNCTION");
        $sym274$METHOD_TRACE_OUTER = SubLObjectFactory.makeSymbol("METHOD-TRACE-OUTER");
        $sym275$_CSETF_METHOD_TRACE_OUTER = SubLObjectFactory.makeSymbol("_CSETF-METHOD-TRACE-OUTER");
        $kw276$FUNCTION = SubLObjectFactory.makeKeyword("FUNCTION");
        $kw277$OUTER = SubLObjectFactory.makeKeyword("OUTER");
        $sym278$MAKE_METHOD_TRACE = SubLObjectFactory.makeSymbol("MAKE-METHOD-TRACE");
        $sym279$VISIT_DEFSTRUCT_OBJECT_METHOD_TRACE_METHOD = SubLObjectFactory.makeSymbol("VISIT-DEFSTRUCT-OBJECT-METHOD-TRACE-METHOD");
        $list280 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("METHOD-TRACE"), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("FORMS"));
        $str281$method_trace = SubLObjectFactory.makeString("method-trace");
        $sym282$METHOD_TRACE_ = SubLObjectFactory.makeSymbol("METHOD-TRACE-");
        $str283$__METHOD_TRACE____S__S__ = SubLObjectFactory.makeString("#<METHOD-TRACE: (~S ~S)>");
        $sym284$METHOD_INFO = SubLObjectFactory.makeSymbol("METHOD-INFO");
        $sym285$METHOD_INFO_P = SubLObjectFactory.makeSymbol("METHOD-INFO-P");
        $list286 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("METHOD-NAME"), (SubLObject)SubLObjectFactory.makeSymbol("CLASS-NAME"), (SubLObject)SubLObjectFactory.makeSymbol("MV-USED-IN-BODY"), (SubLObject)SubLObjectFactory.makeSymbol("MV-MODIFIED-IN-BODY"), (SubLObject)SubLObjectFactory.makeSymbol("METHODS-USED-IN-BODY"));
        $list287 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("METHOD-NAME"), (SubLObject)SubLObjectFactory.makeKeyword("CLASS-NAME"), (SubLObject)SubLObjectFactory.makeKeyword("MV-USED-IN-BODY"), (SubLObject)SubLObjectFactory.makeKeyword("MV-MODIFIED-IN-BODY"), (SubLObject)SubLObjectFactory.makeKeyword("METHODS-USED-IN-BODY"));
        $list288 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MI-METHOD-NAME"), (SubLObject)SubLObjectFactory.makeSymbol("MI-CLASS-NAME"), (SubLObject)SubLObjectFactory.makeSymbol("MI-MV-USED-IN-BODY"), (SubLObject)SubLObjectFactory.makeSymbol("MI-MV-MODIFIED-IN-BODY"), (SubLObject)SubLObjectFactory.makeSymbol("MI-METHODS-USED-IN-BODY"));
        $list289 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("_CSETF-MI-METHOD-NAME"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-MI-CLASS-NAME"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-MI-MV-USED-IN-BODY"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-MI-MV-MODIFIED-IN-BODY"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-MI-METHODS-USED-IN-BODY"));
        $sym290$DEFAULT_STRUCT_PRINT_FUNCTION = SubLObjectFactory.makeSymbol("DEFAULT-STRUCT-PRINT-FUNCTION");
        $sym291$METHOD_INFO_PRINT_FUNCTION_TRAMPOLINE = SubLObjectFactory.makeSymbol("METHOD-INFO-PRINT-FUNCTION-TRAMPOLINE");
        $list292 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("METHOD-INFO-P"));
        $sym293$MI_METHOD_NAME = SubLObjectFactory.makeSymbol("MI-METHOD-NAME");
        $sym294$_CSETF_MI_METHOD_NAME = SubLObjectFactory.makeSymbol("_CSETF-MI-METHOD-NAME");
        $sym295$MI_CLASS_NAME = SubLObjectFactory.makeSymbol("MI-CLASS-NAME");
        $sym296$_CSETF_MI_CLASS_NAME = SubLObjectFactory.makeSymbol("_CSETF-MI-CLASS-NAME");
        $sym297$MI_MV_USED_IN_BODY = SubLObjectFactory.makeSymbol("MI-MV-USED-IN-BODY");
        $sym298$_CSETF_MI_MV_USED_IN_BODY = SubLObjectFactory.makeSymbol("_CSETF-MI-MV-USED-IN-BODY");
        $sym299$MI_MV_MODIFIED_IN_BODY = SubLObjectFactory.makeSymbol("MI-MV-MODIFIED-IN-BODY");
        $sym300$_CSETF_MI_MV_MODIFIED_IN_BODY = SubLObjectFactory.makeSymbol("_CSETF-MI-MV-MODIFIED-IN-BODY");
        $sym301$MI_METHODS_USED_IN_BODY = SubLObjectFactory.makeSymbol("MI-METHODS-USED-IN-BODY");
        $sym302$_CSETF_MI_METHODS_USED_IN_BODY = SubLObjectFactory.makeSymbol("_CSETF-MI-METHODS-USED-IN-BODY");
        $kw303$METHOD_NAME = SubLObjectFactory.makeKeyword("METHOD-NAME");
        $kw304$MV_USED_IN_BODY = SubLObjectFactory.makeKeyword("MV-USED-IN-BODY");
        $kw305$MV_MODIFIED_IN_BODY = SubLObjectFactory.makeKeyword("MV-MODIFIED-IN-BODY");
        $kw306$METHODS_USED_IN_BODY = SubLObjectFactory.makeKeyword("METHODS-USED-IN-BODY");
        $sym307$MAKE_METHOD_INFO = SubLObjectFactory.makeSymbol("MAKE-METHOD-INFO");
        $sym308$VISIT_DEFSTRUCT_OBJECT_METHOD_INFO_METHOD = SubLObjectFactory.makeSymbol("VISIT-DEFSTRUCT-OBJECT-METHOD-INFO-METHOD");
        $list309 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("METHOD-INFO"), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("FORMS"));
        $str310$method_info = SubLObjectFactory.makeString("method-info");
        $sym311$MI_ = SubLObjectFactory.makeSymbol("MI-");
        $sym312$SLOT_LISTENER = SubLObjectFactory.makeSymbol("SLOT-LISTENER");
        $sym313$SLOT_LISTENER_P = SubLObjectFactory.makeSymbol("SLOT-LISTENER-P");
        $list314 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SLOT-NAME"), (SubLObject)SubLObjectFactory.makeSymbol("DEMON-TYPE"), (SubLObject)SubLObjectFactory.makeSymbol("VALUE-TRIGGER"), (SubLObject)SubLObjectFactory.makeSymbol("FUNCTIONAL-TYPE"), (SubLObject)SubLObjectFactory.makeSymbol("ISA-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("TARGET-INSTANCE"));
        $list315 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("SLOT-NAME"), (SubLObject)SubLObjectFactory.makeKeyword("DEMON-TYPE"), (SubLObject)SubLObjectFactory.makeKeyword("VALUE-TRIGGER"), (SubLObject)SubLObjectFactory.makeKeyword("FUNCTIONAL-TYPE"), (SubLObject)SubLObjectFactory.makeKeyword("ISA-METHOD"), (SubLObject)SubLObjectFactory.makeKeyword("TARGET-INSTANCE"));
        $list316 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SL-SLOT-NAME"), (SubLObject)SubLObjectFactory.makeSymbol("SL-DEMON-TYPE"), (SubLObject)SubLObjectFactory.makeSymbol("SL-VALUE-TRIGGER"), (SubLObject)SubLObjectFactory.makeSymbol("SL-FUNCTIONAL-TYPE"), (SubLObject)SubLObjectFactory.makeSymbol("SL-ISA-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("SL-TARGET-INSTANCE"));
        $list317 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("_CSETF-SL-SLOT-NAME"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-SL-DEMON-TYPE"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-SL-VALUE-TRIGGER"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-SL-FUNCTIONAL-TYPE"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-SL-ISA-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-SL-TARGET-INSTANCE"));
        $sym318$PRINT_SLOT_LISTENER = SubLObjectFactory.makeSymbol("PRINT-SLOT-LISTENER");
        $sym319$SLOT_LISTENER_PRINT_FUNCTION_TRAMPOLINE = SubLObjectFactory.makeSymbol("SLOT-LISTENER-PRINT-FUNCTION-TRAMPOLINE");
        $list320 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("SLOT-LISTENER-P"));
        $sym321$SL_SLOT_NAME = SubLObjectFactory.makeSymbol("SL-SLOT-NAME");
        $sym322$_CSETF_SL_SLOT_NAME = SubLObjectFactory.makeSymbol("_CSETF-SL-SLOT-NAME");
        $sym323$SL_DEMON_TYPE = SubLObjectFactory.makeSymbol("SL-DEMON-TYPE");
        $sym324$_CSETF_SL_DEMON_TYPE = SubLObjectFactory.makeSymbol("_CSETF-SL-DEMON-TYPE");
        $sym325$SL_VALUE_TRIGGER = SubLObjectFactory.makeSymbol("SL-VALUE-TRIGGER");
        $sym326$_CSETF_SL_VALUE_TRIGGER = SubLObjectFactory.makeSymbol("_CSETF-SL-VALUE-TRIGGER");
        $sym327$SL_FUNCTIONAL_TYPE = SubLObjectFactory.makeSymbol("SL-FUNCTIONAL-TYPE");
        $sym328$_CSETF_SL_FUNCTIONAL_TYPE = SubLObjectFactory.makeSymbol("_CSETF-SL-FUNCTIONAL-TYPE");
        $sym329$SL_ISA_METHOD = SubLObjectFactory.makeSymbol("SL-ISA-METHOD");
        $sym330$_CSETF_SL_ISA_METHOD = SubLObjectFactory.makeSymbol("_CSETF-SL-ISA-METHOD");
        $sym331$SL_TARGET_INSTANCE = SubLObjectFactory.makeSymbol("SL-TARGET-INSTANCE");
        $sym332$_CSETF_SL_TARGET_INSTANCE = SubLObjectFactory.makeSymbol("_CSETF-SL-TARGET-INSTANCE");
        $kw333$SLOT_NAME = SubLObjectFactory.makeKeyword("SLOT-NAME");
        $kw334$DEMON_TYPE = SubLObjectFactory.makeKeyword("DEMON-TYPE");
        $kw335$VALUE_TRIGGER = SubLObjectFactory.makeKeyword("VALUE-TRIGGER");
        $kw336$FUNCTIONAL_TYPE = SubLObjectFactory.makeKeyword("FUNCTIONAL-TYPE");
        $kw337$ISA_METHOD = SubLObjectFactory.makeKeyword("ISA-METHOD");
        $kw338$TARGET_INSTANCE = SubLObjectFactory.makeKeyword("TARGET-INSTANCE");
        $sym339$MAKE_SLOT_LISTENER = SubLObjectFactory.makeSymbol("MAKE-SLOT-LISTENER");
        $sym340$VISIT_DEFSTRUCT_OBJECT_SLOT_LISTENER_METHOD = SubLObjectFactory.makeSymbol("VISIT-DEFSTRUCT-OBJECT-SLOT-LISTENER-METHOD");
        $str341$__SLOT_LISTENER_for_Slot__S___S__ = SubLObjectFactory.makeString("#<SLOT-LISTENER for Slot ~S; ~S; ~S>");
        $list342 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SLOT-LISTENER"), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("FORMS"));
        $str343$slot_listener = SubLObjectFactory.makeString("slot-listener");
        $sym344$SL_ = SubLObjectFactory.makeSymbol("SL-");
        $sym345$SLOT_LISTENER_REGISTRY = SubLObjectFactory.makeSymbol("SLOT-LISTENER-REGISTRY");
        $sym346$SLOT_LISTENER_REGISTRY_P = SubLObjectFactory.makeSymbol("SLOT-LISTENER-REGISTRY-P");
        $list347 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INSTANCE"), (SubLObject)SubLObjectFactory.makeSymbol("SLOT-COUNT"), (SubLObject)SubLObjectFactory.makeSymbol("LISTENERS-VECTOR"));
        $list348 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("INSTANCE"), (SubLObject)SubLObjectFactory.makeKeyword("SLOT-COUNT"), (SubLObject)SubLObjectFactory.makeKeyword("LISTENERS-VECTOR"));
        $list349 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SLR-INSTANCE"), (SubLObject)SubLObjectFactory.makeSymbol("SLR-SLOT-COUNT"), (SubLObject)SubLObjectFactory.makeSymbol("SLR-LISTENERS-VECTOR"));
        $list350 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("_CSETF-SLR-INSTANCE"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-SLR-SLOT-COUNT"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-SLR-LISTENERS-VECTOR"));
        $sym351$SLOT_LISTENER_REGISTRY_PRINT_FUNCTION_TRAMPOLINE = SubLObjectFactory.makeSymbol("SLOT-LISTENER-REGISTRY-PRINT-FUNCTION-TRAMPOLINE");
        $list352 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("SLOT-LISTENER-REGISTRY-P"));
        $sym353$SLR_INSTANCE = SubLObjectFactory.makeSymbol("SLR-INSTANCE");
        $sym354$_CSETF_SLR_INSTANCE = SubLObjectFactory.makeSymbol("_CSETF-SLR-INSTANCE");
        $sym355$SLR_SLOT_COUNT = SubLObjectFactory.makeSymbol("SLR-SLOT-COUNT");
        $sym356$_CSETF_SLR_SLOT_COUNT = SubLObjectFactory.makeSymbol("_CSETF-SLR-SLOT-COUNT");
        $sym357$SLR_LISTENERS_VECTOR = SubLObjectFactory.makeSymbol("SLR-LISTENERS-VECTOR");
        $sym358$_CSETF_SLR_LISTENERS_VECTOR = SubLObjectFactory.makeSymbol("_CSETF-SLR-LISTENERS-VECTOR");
        $kw359$INSTANCE = SubLObjectFactory.makeKeyword("INSTANCE");
        $kw360$SLOT_COUNT = SubLObjectFactory.makeKeyword("SLOT-COUNT");
        $kw361$LISTENERS_VECTOR = SubLObjectFactory.makeKeyword("LISTENERS-VECTOR");
        $sym362$MAKE_SLOT_LISTENER_REGISTRY = SubLObjectFactory.makeSymbol("MAKE-SLOT-LISTENER-REGISTRY");
        $sym363$VISIT_DEFSTRUCT_OBJECT_SLOT_LISTENER_REGISTRY_METHOD = SubLObjectFactory.makeSymbol("VISIT-DEFSTRUCT-OBJECT-SLOT-LISTENER-REGISTRY-METHOD");
        $str364$__SLOT_LISTENER_REGISTRY___S__SLO = SubLObjectFactory.makeString("#<SLOT-LISTENER-REGISTRY: ~S; SLOT-COUNT ~S>");
        $list365 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SLOT-LISTENER-REGISTRY"), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("FORMS"));
        $str366$slot_listener_registry = SubLObjectFactory.makeString("slot-listener-registry");
        $sym367$SLR_ = SubLObjectFactory.makeSymbol("SLR-");
        $sym368$METHOD_LISTENER = SubLObjectFactory.makeSymbol("METHOD-LISTENER");
        $sym369$METHOD_LISTENER_P = SubLObjectFactory.makeSymbol("METHOD-LISTENER-P");
        $list370 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OWNING-METHOD-NAME"), (SubLObject)SubLObjectFactory.makeSymbol("OWNING-CLASS-NAME"), (SubLObject)SubLObjectFactory.makeSymbol("DEMON-TYPE"), (SubLObject)SubLObjectFactory.makeSymbol("DETAIL"));
        $list371 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("OWNING-METHOD-NAME"), (SubLObject)SubLObjectFactory.makeKeyword("OWNING-CLASS-NAME"), (SubLObject)SubLObjectFactory.makeKeyword("DEMON-TYPE"), (SubLObject)SubLObjectFactory.makeKeyword("DETAIL"));
        $list372 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ML-OWNING-METHOD-NAME"), (SubLObject)SubLObjectFactory.makeSymbol("ML-OWNING-CLASS-NAME"), (SubLObject)SubLObjectFactory.makeSymbol("ML-DEMON-TYPE"), (SubLObject)SubLObjectFactory.makeSymbol("ML-DETAIL"));
        $list373 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("_CSETF-ML-OWNING-METHOD-NAME"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-ML-OWNING-CLASS-NAME"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-ML-DEMON-TYPE"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-ML-DETAIL"));
        $sym374$PRINT_METHOD_LISTENER = SubLObjectFactory.makeSymbol("PRINT-METHOD-LISTENER");
        $sym375$METHOD_LISTENER_PRINT_FUNCTION_TRAMPOLINE = SubLObjectFactory.makeSymbol("METHOD-LISTENER-PRINT-FUNCTION-TRAMPOLINE");
        $list376 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("METHOD-LISTENER-P"));
        $sym377$ML_OWNING_METHOD_NAME = SubLObjectFactory.makeSymbol("ML-OWNING-METHOD-NAME");
        $sym378$_CSETF_ML_OWNING_METHOD_NAME = SubLObjectFactory.makeSymbol("_CSETF-ML-OWNING-METHOD-NAME");
        $sym379$ML_OWNING_CLASS_NAME = SubLObjectFactory.makeSymbol("ML-OWNING-CLASS-NAME");
        $sym380$_CSETF_ML_OWNING_CLASS_NAME = SubLObjectFactory.makeSymbol("_CSETF-ML-OWNING-CLASS-NAME");
        $sym381$ML_DEMON_TYPE = SubLObjectFactory.makeSymbol("ML-DEMON-TYPE");
        $sym382$_CSETF_ML_DEMON_TYPE = SubLObjectFactory.makeSymbol("_CSETF-ML-DEMON-TYPE");
        $sym383$ML_DETAIL = SubLObjectFactory.makeSymbol("ML-DETAIL");
        $sym384$_CSETF_ML_DETAIL = SubLObjectFactory.makeSymbol("_CSETF-ML-DETAIL");
        $kw385$OWNING_METHOD_NAME = SubLObjectFactory.makeKeyword("OWNING-METHOD-NAME");
        $kw386$OWNING_CLASS_NAME = SubLObjectFactory.makeKeyword("OWNING-CLASS-NAME");
        $kw387$DETAIL = SubLObjectFactory.makeKeyword("DETAIL");
        $sym388$MAKE_METHOD_LISTENER = SubLObjectFactory.makeSymbol("MAKE-METHOD-LISTENER");
        $sym389$VISIT_DEFSTRUCT_OBJECT_METHOD_LISTENER_METHOD = SubLObjectFactory.makeSymbol("VISIT-DEFSTRUCT-OBJECT-METHOD-LISTENER-METHOD");
        $list390 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("METHOD-LISTENER"), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("FORMS"));
        $str391$method_listener = SubLObjectFactory.makeString("method-listener");
        $sym392$ML_ = SubLObjectFactory.makeSymbol("ML-");
        $sym393$FUNCTION_DETAIL = SubLObjectFactory.makeSymbol("FUNCTION-DETAIL");
        $sym394$FUNCTION_DETAIL_P = SubLObjectFactory.makeSymbol("FUNCTION-DETAIL-P");
        $list395 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCTION-NAME"), (SubLObject)SubLObjectFactory.makeSymbol("ARGLIST"));
        $list396 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("FUNCTION-NAME"), (SubLObject)SubLObjectFactory.makeKeyword("ARGLIST"));
        $list397 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FD-FUNCTION-NAME"), (SubLObject)SubLObjectFactory.makeSymbol("FD-ARGLIST"));
        $list398 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("_CSETF-FD-FUNCTION-NAME"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-FD-ARGLIST"));
        $sym399$FUNCTION_DETAIL_PRINT_FUNCTION_TRAMPOLINE = SubLObjectFactory.makeSymbol("FUNCTION-DETAIL-PRINT-FUNCTION-TRAMPOLINE");
        $list400 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("FUNCTION-DETAIL-P"));
        $sym401$FD_FUNCTION_NAME = SubLObjectFactory.makeSymbol("FD-FUNCTION-NAME");
        $sym402$_CSETF_FD_FUNCTION_NAME = SubLObjectFactory.makeSymbol("_CSETF-FD-FUNCTION-NAME");
        $sym403$FD_ARGLIST = SubLObjectFactory.makeSymbol("FD-ARGLIST");
        $sym404$_CSETF_FD_ARGLIST = SubLObjectFactory.makeSymbol("_CSETF-FD-ARGLIST");
        $kw405$ARGLIST = SubLObjectFactory.makeKeyword("ARGLIST");
        $sym406$MAKE_FUNCTION_DETAIL = SubLObjectFactory.makeSymbol("MAKE-FUNCTION-DETAIL");
        $sym407$VISIT_DEFSTRUCT_OBJECT_FUNCTION_DETAIL_METHOD = SubLObjectFactory.makeSymbol("VISIT-DEFSTRUCT-OBJECT-FUNCTION-DETAIL-METHOD");
        $list408 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCTION-DETAIL"), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("FORMS"));
        $str409$function_detail = SubLObjectFactory.makeString("function-detail");
        $sym410$FD_ = SubLObjectFactory.makeSymbol("FD-");
        $sym411$METHOD_DETAIL = SubLObjectFactory.makeSymbol("METHOD-DETAIL");
        $sym412$METHOD_DETAIL_P = SubLObjectFactory.makeSymbol("METHOD-DETAIL-P");
        $list413 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("METHOD-NAME"), (SubLObject)SubLObjectFactory.makeSymbol("FUNCTION-NAME"), (SubLObject)SubLObjectFactory.makeSymbol("ARGLIST"), (SubLObject)SubLObjectFactory.makeSymbol("INSTANCE"));
        $list414 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("METHOD-NAME"), (SubLObject)SubLObjectFactory.makeKeyword("FUNCTION-NAME"), (SubLObject)SubLObjectFactory.makeKeyword("ARGLIST"), (SubLObject)SubLObjectFactory.makeKeyword("INSTANCE"));
        $list415 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MD-METHOD-NAME"), (SubLObject)SubLObjectFactory.makeSymbol("MD-FUNCTION-NAME"), (SubLObject)SubLObjectFactory.makeSymbol("MD-ARGLIST"), (SubLObject)SubLObjectFactory.makeSymbol("MD-INSTANCE"));
        $list416 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("_CSETF-MD-METHOD-NAME"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-MD-FUNCTION-NAME"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-MD-ARGLIST"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-MD-INSTANCE"));
        $sym417$METHOD_DETAIL_PRINT_FUNCTION_TRAMPOLINE = SubLObjectFactory.makeSymbol("METHOD-DETAIL-PRINT-FUNCTION-TRAMPOLINE");
        $list418 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("METHOD-DETAIL-P"));
        $sym419$MD_METHOD_NAME = SubLObjectFactory.makeSymbol("MD-METHOD-NAME");
        $sym420$_CSETF_MD_METHOD_NAME = SubLObjectFactory.makeSymbol("_CSETF-MD-METHOD-NAME");
        $sym421$MD_FUNCTION_NAME = SubLObjectFactory.makeSymbol("MD-FUNCTION-NAME");
        $sym422$_CSETF_MD_FUNCTION_NAME = SubLObjectFactory.makeSymbol("_CSETF-MD-FUNCTION-NAME");
        $sym423$MD_ARGLIST = SubLObjectFactory.makeSymbol("MD-ARGLIST");
        $sym424$_CSETF_MD_ARGLIST = SubLObjectFactory.makeSymbol("_CSETF-MD-ARGLIST");
        $sym425$MD_INSTANCE = SubLObjectFactory.makeSymbol("MD-INSTANCE");
        $sym426$_CSETF_MD_INSTANCE = SubLObjectFactory.makeSymbol("_CSETF-MD-INSTANCE");
        $sym427$MAKE_METHOD_DETAIL = SubLObjectFactory.makeSymbol("MAKE-METHOD-DETAIL");
        $sym428$VISIT_DEFSTRUCT_OBJECT_METHOD_DETAIL_METHOD = SubLObjectFactory.makeSymbol("VISIT-DEFSTRUCT-OBJECT-METHOD-DETAIL-METHOD");
        $list429 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("METHOD-DETAIL"), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("FORMS"));
        $str430$method_detail = SubLObjectFactory.makeString("method-detail");
        $sym431$MD_ = SubLObjectFactory.makeSymbol("MD-");
        $sym432$METHOD_LISTENER_REGISTRY = SubLObjectFactory.makeSymbol("METHOD-LISTENER-REGISTRY");
        $sym433$METHOD_LISTENER_REGISTRY_P = SubLObjectFactory.makeSymbol("METHOD-LISTENER-REGISTRY-P");
        $list434 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INSTANCE"), (SubLObject)SubLObjectFactory.makeSymbol("LISTENER-ALIST"));
        $list435 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("INSTANCE"), (SubLObject)SubLObjectFactory.makeKeyword("LISTENER-ALIST"));
        $list436 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MLR-INSTANCE"), (SubLObject)SubLObjectFactory.makeSymbol("MLR-LISTENER-ALIST"));
        $list437 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("_CSETF-MLR-INSTANCE"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-MLR-LISTENER-ALIST"));
        $sym438$METHOD_LISTENER_REGISTRY_PRINT_FUNCTION_TRAMPOLINE = SubLObjectFactory.makeSymbol("METHOD-LISTENER-REGISTRY-PRINT-FUNCTION-TRAMPOLINE");
        $list439 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("METHOD-LISTENER-REGISTRY-P"));
        $sym440$MLR_INSTANCE = SubLObjectFactory.makeSymbol("MLR-INSTANCE");
        $sym441$_CSETF_MLR_INSTANCE = SubLObjectFactory.makeSymbol("_CSETF-MLR-INSTANCE");
        $sym442$MLR_LISTENER_ALIST = SubLObjectFactory.makeSymbol("MLR-LISTENER-ALIST");
        $sym443$_CSETF_MLR_LISTENER_ALIST = SubLObjectFactory.makeSymbol("_CSETF-MLR-LISTENER-ALIST");
        $kw444$LISTENER_ALIST = SubLObjectFactory.makeKeyword("LISTENER-ALIST");
        $sym445$MAKE_METHOD_LISTENER_REGISTRY = SubLObjectFactory.makeSymbol("MAKE-METHOD-LISTENER-REGISTRY");
        $sym446$VISIT_DEFSTRUCT_OBJECT_METHOD_LISTENER_REGISTRY_METHOD = SubLObjectFactory.makeSymbol("VISIT-DEFSTRUCT-OBJECT-METHOD-LISTENER-REGISTRY-METHOD");
        $list447 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("METHOD-LISTENER-REGISTRY"), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("FORMS"));
        $str448$method_listener_registry = SubLObjectFactory.makeString("method-listener-registry");
        $sym449$MLR_ = SubLObjectFactory.makeSymbol("MLR-");
        $str450$__METHOD_LISTENER____S__S_ = SubLObjectFactory.makeString("#<METHOD-LISTENER: (~S ~S)");
        $str451$_monitored_by_function__S_ = SubLObjectFactory.makeString(" monitored by function ~S>");
        $str452$_monitored_by_method___S__S__ = SubLObjectFactory.makeString(" monitored by method (~S ~S)>");
        $str453$_ = SubLObjectFactory.makeString(">");
    }
    
    public static final class $class_native extends SubLStructNative
    {
        public SubLObject $name;
        public SubLObject $parent;
        public SubLObject $subclasses;
        public SubLObject $interface_names;
        public SubLObject $interfaces;
        public SubLObject $compiled_inheritance_path;
        public SubLObject $instance_var_decls;
        public SubLObject $class_var_decls;
        public SubLObject $compiled_instance_slot_access_alist;
        public SubLObject $compiled_instance_boolean_slot_access_alist;
        public SubLObject $compiled_class_slot_access_alist;
        public SubLObject $compiled_class_boolean_slot_access_alist;
        public SubLObject $slot_accessor_alist;
        public SubLObject $instance_method_decls;
        public SubLObject $class_method_decls;
        public SubLObject $boolean_slots;
        public SubLObject $any_slots;
        public SubLObject $compiled_instance_method_access_alist;
        public SubLObject $compiled_class_method_access_alist;
        public SubLObject $tablified_instance_methods;
        public SubLObject $definition_lock;
        public SubLObject $access_lock;
        public SubLObject $synchronized_slots_p;
        public SubLObject $plist;
        public SubLObject $class_initialization_function;
        public SubLObject $class_initialized_p;
        public SubLObject $instance_initialization_function;
        public SubLObject $class_properties;
        private static final SubLStructDeclNative structDecl;
        
        public $class_native() {
            this.$name = (SubLObject)CommonSymbols.NIL;
            this.$parent = (SubLObject)CommonSymbols.NIL;
            this.$subclasses = (SubLObject)CommonSymbols.NIL;
            this.$interface_names = (SubLObject)CommonSymbols.NIL;
            this.$interfaces = (SubLObject)CommonSymbols.NIL;
            this.$compiled_inheritance_path = (SubLObject)CommonSymbols.NIL;
            this.$instance_var_decls = (SubLObject)CommonSymbols.NIL;
            this.$class_var_decls = (SubLObject)CommonSymbols.NIL;
            this.$compiled_instance_slot_access_alist = (SubLObject)CommonSymbols.NIL;
            this.$compiled_instance_boolean_slot_access_alist = (SubLObject)CommonSymbols.NIL;
            this.$compiled_class_slot_access_alist = (SubLObject)CommonSymbols.NIL;
            this.$compiled_class_boolean_slot_access_alist = (SubLObject)CommonSymbols.NIL;
            this.$slot_accessor_alist = (SubLObject)CommonSymbols.NIL;
            this.$instance_method_decls = (SubLObject)CommonSymbols.NIL;
            this.$class_method_decls = (SubLObject)CommonSymbols.NIL;
            this.$boolean_slots = (SubLObject)CommonSymbols.NIL;
            this.$any_slots = (SubLObject)CommonSymbols.NIL;
            this.$compiled_instance_method_access_alist = (SubLObject)CommonSymbols.NIL;
            this.$compiled_class_method_access_alist = (SubLObject)CommonSymbols.NIL;
            this.$tablified_instance_methods = (SubLObject)CommonSymbols.NIL;
            this.$definition_lock = (SubLObject)CommonSymbols.NIL;
            this.$access_lock = (SubLObject)CommonSymbols.NIL;
            this.$synchronized_slots_p = (SubLObject)CommonSymbols.NIL;
            this.$plist = (SubLObject)CommonSymbols.NIL;
            this.$class_initialization_function = (SubLObject)CommonSymbols.NIL;
            this.$class_initialized_p = (SubLObject)CommonSymbols.NIL;
            this.$instance_initialization_function = (SubLObject)CommonSymbols.NIL;
            this.$class_properties = (SubLObject)CommonSymbols.NIL;
        }
        
        @Override
		public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$class_native.structDecl;
        }
        
        @Override
		public SubLObject getField2() {
            return this.$name;
        }
        
        @Override
		public SubLObject getField3() {
            return this.$parent;
        }
        
        @Override
		public SubLObject getField4() {
            return this.$subclasses;
        }
        
        @Override
		public SubLObject getField5() {
            return this.$interface_names;
        }
        
        @Override
		public SubLObject getField6() {
            return this.$interfaces;
        }
        
        @Override
		public SubLObject getField7() {
            return this.$compiled_inheritance_path;
        }
        
        @Override
		public SubLObject getField8() {
            return this.$instance_var_decls;
        }
        
        @Override
		public SubLObject getField9() {
            return this.$class_var_decls;
        }
        
        @Override
		public SubLObject getField10() {
            return this.$compiled_instance_slot_access_alist;
        }
        
        @Override
		public SubLObject getField11() {
            return this.$compiled_instance_boolean_slot_access_alist;
        }
        
        @Override
		public SubLObject getField12() {
            return this.$compiled_class_slot_access_alist;
        }
        
        @Override
		public SubLObject getField13() {
            return this.$compiled_class_boolean_slot_access_alist;
        }
        
        @Override
		public SubLObject getField14() {
            return this.$slot_accessor_alist;
        }
        
        @Override
		public SubLObject getField15() {
            return this.$instance_method_decls;
        }
        
        @Override
		public SubLObject getField16() {
            return this.$class_method_decls;
        }
        
        @Override
		public SubLObject getField17() {
            return this.$boolean_slots;
        }
        
        @Override
		public SubLObject getField18() {
            return this.$any_slots;
        }
        
        @Override
		public SubLObject getField19() {
            return this.$compiled_instance_method_access_alist;
        }
        
        @Override
		public SubLObject getField20() {
            return this.$compiled_class_method_access_alist;
        }
        
        public SubLObject getField21() {
            return this.$tablified_instance_methods;
        }
        
        public SubLObject getField22() {
            return this.$definition_lock;
        }
        
        public SubLObject getField23() {
            return this.$access_lock;
        }
        
        public SubLObject getField24() {
            return this.$synchronized_slots_p;
        }
        
        public SubLObject getField25() {
            return this.$plist;
        }
        
        public SubLObject getField26() {
            return this.$class_initialization_function;
        }
        
        public SubLObject getField27() {
            return this.$class_initialized_p;
        }
        
        public SubLObject getField28() {
            return this.$instance_initialization_function;
        }
        
        public SubLObject getField29() {
            return this.$class_properties;
        }
        
        @Override
		public SubLObject setField2(final SubLObject value) {
            return this.$name = value;
        }
        
        @Override
		public SubLObject setField3(final SubLObject value) {
            return this.$parent = value;
        }
        
        @Override
		public SubLObject setField4(final SubLObject value) {
            return this.$subclasses = value;
        }
        
        @Override
		public SubLObject setField5(final SubLObject value) {
            return this.$interface_names = value;
        }
        
        @Override
		public SubLObject setField6(final SubLObject value) {
            return this.$interfaces = value;
        }
        
        @Override
		public SubLObject setField7(final SubLObject value) {
            return this.$compiled_inheritance_path = value;
        }
        
        @Override
		public SubLObject setField8(final SubLObject value) {
            return this.$instance_var_decls = value;
        }
        
        @Override
		public SubLObject setField9(final SubLObject value) {
            return this.$class_var_decls = value;
        }
        
        @Override
		public SubLObject setField10(final SubLObject value) {
            return this.$compiled_instance_slot_access_alist = value;
        }
        
        @Override
		public SubLObject setField11(final SubLObject value) {
            return this.$compiled_instance_boolean_slot_access_alist = value;
        }
        
        @Override
		public SubLObject setField12(final SubLObject value) {
            return this.$compiled_class_slot_access_alist = value;
        }
        
        @Override
		public SubLObject setField13(final SubLObject value) {
            return this.$compiled_class_boolean_slot_access_alist = value;
        }
        
        @Override
		public SubLObject setField14(final SubLObject value) {
            return this.$slot_accessor_alist = value;
        }
        
        @Override
		public SubLObject setField15(final SubLObject value) {
            return this.$instance_method_decls = value;
        }
        
        @Override
		public SubLObject setField16(final SubLObject value) {
            return this.$class_method_decls = value;
        }
        
        @Override
		public SubLObject setField17(final SubLObject value) {
            return this.$boolean_slots = value;
        }
        
        @Override
		public SubLObject setField18(final SubLObject value) {
            return this.$any_slots = value;
        }
        
        @Override
		public SubLObject setField19(final SubLObject value) {
            return this.$compiled_instance_method_access_alist = value;
        }
        
        @Override
		public SubLObject setField20(final SubLObject value) {
            return this.$compiled_class_method_access_alist = value;
        }
        
        public SubLObject setField21(final SubLObject value) {
            return this.$tablified_instance_methods = value;
        }
        
        public SubLObject setField22(final SubLObject value) {
            return this.$definition_lock = value;
        }
        
        public SubLObject setField23(final SubLObject value) {
            return this.$access_lock = value;
        }
        
        public SubLObject setField24(final SubLObject value) {
            return this.$synchronized_slots_p = value;
        }
        
        public SubLObject setField25(final SubLObject value) {
            return this.$plist = value;
        }
        
        public SubLObject setField26(final SubLObject value) {
            return this.$class_initialization_function = value;
        }
        
        public SubLObject setField27(final SubLObject value) {
            return this.$class_initialized_p = value;
        }
        
        public SubLObject setField28(final SubLObject value) {
            return this.$instance_initialization_function = value;
        }
        
        public SubLObject setField29(final SubLObject value) {
            return this.$class_properties = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$class_native.class, subloop_structures.$sym0$CLASS, subloop_structures.$sym1$CLASS_P, subloop_structures.$list2, subloop_structures.$list3, new String[] { "$name", "$parent", "$subclasses", "$interface_names", "$interfaces", "$compiled_inheritance_path", "$instance_var_decls", "$class_var_decls", "$compiled_instance_slot_access_alist", "$compiled_instance_boolean_slot_access_alist", "$compiled_class_slot_access_alist", "$compiled_class_boolean_slot_access_alist", "$slot_accessor_alist", "$instance_method_decls", "$class_method_decls", "$boolean_slots", "$any_slots", "$compiled_instance_method_access_alist", "$compiled_class_method_access_alist", "$tablified_instance_methods", "$definition_lock", "$access_lock", "$synchronized_slots_p", "$plist", "$class_initialization_function", "$class_initialized_p", "$instance_initialization_function", "$class_properties" }, subloop_structures.$list4, subloop_structures.$list5, subloop_structures.$sym6$PRINT_CLASS);
        }
    }
    
    public static final class $class_p$UnaryFunction extends UnaryFunction
    {
        public $class_p$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("CLASS-P"));
        }
        
        @Override
		public SubLObject processItem(final SubLObject arg1) {
            return subloop_structures.class_p(arg1);
        }
    }
    
    public static final class $class_name$UnaryFunction extends UnaryFunction
    {
        public $class_name$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("CLASS-NAME"));
        }
        
        @Override
		public SubLObject processItem(final SubLObject arg1) {
            return subloop_structures.class_name(arg1);
        }
    }
    
    public static final class $instance_native extends SubLStructNative
    {
        public SubLObject $class;
        public SubLObject $boolean_slots;
        public SubLObject $any_slots;
        public SubLObject $plist;
        private static final SubLStructDeclNative structDecl;
        
        public $instance_native() {
            this.$class = (SubLObject)CommonSymbols.NIL;
            this.$boolean_slots = (SubLObject)CommonSymbols.NIL;
            this.$any_slots = (SubLObject)CommonSymbols.NIL;
            this.$plist = (SubLObject)CommonSymbols.NIL;
        }
        
        @Override
		public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$instance_native.structDecl;
        }
        
        @Override
		public SubLObject getField2() {
            return this.$class;
        }
        
        @Override
		public SubLObject getField3() {
            return this.$boolean_slots;
        }
        
        @Override
		public SubLObject getField4() {
            return this.$any_slots;
        }
        
        @Override
		public SubLObject getField5() {
            return this.$plist;
        }
        
        @Override
		public SubLObject setField2(final SubLObject value) {
            return this.$class = value;
        }
        
        @Override
		public SubLObject setField3(final SubLObject value) {
            return this.$boolean_slots = value;
        }
        
        @Override
		public SubLObject setField4(final SubLObject value) {
            return this.$any_slots = value;
        }
        
        @Override
		public SubLObject setField5(final SubLObject value) {
            return this.$plist = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$instance_native.class, subloop_structures.$sym130$INSTANCE, subloop_structures.$sym131$INSTANCE_P, subloop_structures.$list132, subloop_structures.$list133, new String[] { "$class", "$boolean_slots", "$any_slots", "$plist" }, subloop_structures.$list134, subloop_structures.$list135, subloop_structures.$sym136$PRINT_INSTANCE);
        }
    }
    
    public static final class $instance_p$UnaryFunction extends UnaryFunction
    {
        public $instance_p$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("INSTANCE-P"));
        }
        
        @Override
		public SubLObject processItem(final SubLObject arg1) {
            return subloop_structures.instance_p(arg1);
        }
    }
    
    public static final class $interface_native extends SubLStructNative
    {
        public SubLObject $name;
        public SubLObject $parents;
        public SubLObject $compiled_inheritance_path;
        public SubLObject $subinterfaces;
        public SubLObject $implementers;
        public SubLObject $instance_method_decls;
        public SubLObject $class_method_decls;
        public SubLObject $compiled_instance_method_decls;
        public SubLObject $compiled_class_method_decls;
        public SubLObject $local_class_methods;
        public SubLObject $local_instance_methods;
        public SubLObject $mark_list;
        public SubLObject $plist;
        public SubLObject $definition_lock;
        private static final SubLStructDeclNative structDecl;
        
        public $interface_native() {
            this.$name = (SubLObject)CommonSymbols.NIL;
            this.$parents = (SubLObject)CommonSymbols.NIL;
            this.$compiled_inheritance_path = (SubLObject)CommonSymbols.NIL;
            this.$subinterfaces = (SubLObject)CommonSymbols.NIL;
            this.$implementers = (SubLObject)CommonSymbols.NIL;
            this.$instance_method_decls = (SubLObject)CommonSymbols.NIL;
            this.$class_method_decls = (SubLObject)CommonSymbols.NIL;
            this.$compiled_instance_method_decls = (SubLObject)CommonSymbols.NIL;
            this.$compiled_class_method_decls = (SubLObject)CommonSymbols.NIL;
            this.$local_class_methods = (SubLObject)CommonSymbols.NIL;
            this.$local_instance_methods = (SubLObject)CommonSymbols.NIL;
            this.$mark_list = (SubLObject)CommonSymbols.NIL;
            this.$plist = (SubLObject)CommonSymbols.NIL;
            this.$definition_lock = (SubLObject)CommonSymbols.NIL;
        }
        
        @Override
		public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$interface_native.structDecl;
        }
        
        @Override
		public SubLObject getField2() {
            return this.$name;
        }
        
        @Override
		public SubLObject getField3() {
            return this.$parents;
        }
        
        @Override
		public SubLObject getField4() {
            return this.$compiled_inheritance_path;
        }
        
        @Override
		public SubLObject getField5() {
            return this.$subinterfaces;
        }
        
        @Override
		public SubLObject getField6() {
            return this.$implementers;
        }
        
        @Override
		public SubLObject getField7() {
            return this.$instance_method_decls;
        }
        
        @Override
		public SubLObject getField8() {
            return this.$class_method_decls;
        }
        
        @Override
		public SubLObject getField9() {
            return this.$compiled_instance_method_decls;
        }
        
        @Override
		public SubLObject getField10() {
            return this.$compiled_class_method_decls;
        }
        
        @Override
		public SubLObject getField11() {
            return this.$local_class_methods;
        }
        
        @Override
		public SubLObject getField12() {
            return this.$local_instance_methods;
        }
        
        @Override
		public SubLObject getField13() {
            return this.$mark_list;
        }
        
        @Override
		public SubLObject getField14() {
            return this.$plist;
        }
        
        @Override
		public SubLObject getField15() {
            return this.$definition_lock;
        }
        
        @Override
		public SubLObject setField2(final SubLObject value) {
            return this.$name = value;
        }
        
        @Override
		public SubLObject setField3(final SubLObject value) {
            return this.$parents = value;
        }
        
        @Override
		public SubLObject setField4(final SubLObject value) {
            return this.$compiled_inheritance_path = value;
        }
        
        @Override
		public SubLObject setField5(final SubLObject value) {
            return this.$subinterfaces = value;
        }
        
        @Override
		public SubLObject setField6(final SubLObject value) {
            return this.$implementers = value;
        }
        
        @Override
		public SubLObject setField7(final SubLObject value) {
            return this.$instance_method_decls = value;
        }
        
        @Override
		public SubLObject setField8(final SubLObject value) {
            return this.$class_method_decls = value;
        }
        
        @Override
		public SubLObject setField9(final SubLObject value) {
            return this.$compiled_instance_method_decls = value;
        }
        
        @Override
		public SubLObject setField10(final SubLObject value) {
            return this.$compiled_class_method_decls = value;
        }
        
        @Override
		public SubLObject setField11(final SubLObject value) {
            return this.$local_class_methods = value;
        }
        
        @Override
		public SubLObject setField12(final SubLObject value) {
            return this.$local_instance_methods = value;
        }
        
        @Override
		public SubLObject setField13(final SubLObject value) {
            return this.$mark_list = value;
        }
        
        @Override
		public SubLObject setField14(final SubLObject value) {
            return this.$plist = value;
        }
        
        @Override
		public SubLObject setField15(final SubLObject value) {
            return this.$definition_lock = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$interface_native.class, subloop_structures.$sym156$INTERFACE, subloop_structures.$sym157$INTERFACE_P, subloop_structures.$list158, subloop_structures.$list159, new String[] { "$name", "$parents", "$compiled_inheritance_path", "$subinterfaces", "$implementers", "$instance_method_decls", "$class_method_decls", "$compiled_instance_method_decls", "$compiled_class_method_decls", "$local_class_methods", "$local_instance_methods", "$mark_list", "$plist", "$definition_lock" }, subloop_structures.$list160, subloop_structures.$list161, subloop_structures.$sym162$PRINT_INTERFACE);
        }
    }
    
    public static final class $interface_p$UnaryFunction extends UnaryFunction
    {
        public $interface_p$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("INTERFACE-P"));
        }
        
        @Override
		public SubLObject processItem(final SubLObject arg1) {
            return subloop_structures.interface_p(arg1);
        }
    }
    
    public static final class $method_native extends SubLStructNative
    {
        public SubLObject $name;
        public SubLObject $class_name;
        public SubLObject $lambda_list;
        public SubLObject $body;
        public SubLObject $protection;
        public SubLObject $scope;
        public SubLObject $update_type;
        public SubLObject $function_name;
        public SubLObject $function_def;
        public SubLObject $before_listeners;
        public SubLObject $after_listeners;
        public SubLObject $instantiate_template;
        private static final SubLStructDeclNative structDecl;
        
        public $method_native() {
            this.$name = (SubLObject)CommonSymbols.NIL;
            this.$class_name = (SubLObject)CommonSymbols.NIL;
            this.$lambda_list = (SubLObject)CommonSymbols.NIL;
            this.$body = (SubLObject)CommonSymbols.NIL;
            this.$protection = (SubLObject)CommonSymbols.NIL;
            this.$scope = (SubLObject)CommonSymbols.NIL;
            this.$update_type = (SubLObject)CommonSymbols.NIL;
            this.$function_name = (SubLObject)CommonSymbols.NIL;
            this.$function_def = (SubLObject)CommonSymbols.NIL;
            this.$before_listeners = (SubLObject)CommonSymbols.NIL;
            this.$after_listeners = (SubLObject)CommonSymbols.NIL;
            this.$instantiate_template = (SubLObject)CommonSymbols.NIL;
        }
        
        @Override
		public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$method_native.structDecl;
        }
        
        @Override
		public SubLObject getField2() {
            return this.$name;
        }
        
        @Override
		public SubLObject getField3() {
            return this.$class_name;
        }
        
        @Override
		public SubLObject getField4() {
            return this.$lambda_list;
        }
        
        @Override
		public SubLObject getField5() {
            return this.$body;
        }
        
        @Override
		public SubLObject getField6() {
            return this.$protection;
        }
        
        @Override
		public SubLObject getField7() {
            return this.$scope;
        }
        
        @Override
		public SubLObject getField8() {
            return this.$update_type;
        }
        
        @Override
		public SubLObject getField9() {
            return this.$function_name;
        }
        
        @Override
		public SubLObject getField10() {
            return this.$function_def;
        }
        
        @Override
		public SubLObject getField11() {
            return this.$before_listeners;
        }
        
        @Override
		public SubLObject getField12() {
            return this.$after_listeners;
        }
        
        @Override
		public SubLObject getField13() {
            return this.$instantiate_template;
        }
        
        @Override
		public SubLObject setField2(final SubLObject value) {
            return this.$name = value;
        }
        
        @Override
		public SubLObject setField3(final SubLObject value) {
            return this.$class_name = value;
        }
        
        @Override
		public SubLObject setField4(final SubLObject value) {
            return this.$lambda_list = value;
        }
        
        @Override
		public SubLObject setField5(final SubLObject value) {
            return this.$body = value;
        }
        
        @Override
		public SubLObject setField6(final SubLObject value) {
            return this.$protection = value;
        }
        
        @Override
		public SubLObject setField7(final SubLObject value) {
            return this.$scope = value;
        }
        
        @Override
		public SubLObject setField8(final SubLObject value) {
            return this.$update_type = value;
        }
        
        @Override
		public SubLObject setField9(final SubLObject value) {
            return this.$function_name = value;
        }
        
        @Override
		public SubLObject setField10(final SubLObject value) {
            return this.$function_def = value;
        }
        
        @Override
		public SubLObject setField11(final SubLObject value) {
            return this.$before_listeners = value;
        }
        
        @Override
		public SubLObject setField12(final SubLObject value) {
            return this.$after_listeners = value;
        }
        
        @Override
		public SubLObject setField13(final SubLObject value) {
            return this.$instantiate_template = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$method_native.class, subloop_structures.$sym208$METHOD, subloop_structures.$sym209$METHOD_P, subloop_structures.$list210, subloop_structures.$list211, new String[] { "$name", "$class_name", "$lambda_list", "$body", "$protection", "$scope", "$update_type", "$function_name", "$function_def", "$before_listeners", "$after_listeners", "$instantiate_template" }, subloop_structures.$list212, subloop_structures.$list213, subloop_structures.$sym214$PRINT_METHOD);
        }
    }
    
    public static final class $method_p$UnaryFunction extends UnaryFunction
    {
        public $method_p$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("METHOD-P"));
        }
        
        @Override
		public SubLObject processItem(final SubLObject arg1) {
            return subloop_structures.method_p(arg1);
        }
    }
    
    public static final class $method_trace_native extends SubLStructNative
    {
        public SubLObject $name;
        public SubLObject $class_name;
        public SubLObject $function;
        public SubLObject $outer;
        private static final SubLStructDeclNative structDecl;
        
        public $method_trace_native() {
            this.$name = (SubLObject)CommonSymbols.NIL;
            this.$class_name = (SubLObject)CommonSymbols.NIL;
            this.$function = (SubLObject)CommonSymbols.NIL;
            this.$outer = (SubLObject)CommonSymbols.NIL;
        }
        
        @Override
		public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$method_trace_native.structDecl;
        }
        
        @Override
		public SubLObject getField2() {
            return this.$name;
        }
        
        @Override
		public SubLObject getField3() {
            return this.$class_name;
        }
        
        @Override
		public SubLObject getField4() {
            return this.$function;
        }
        
        @Override
		public SubLObject getField5() {
            return this.$outer;
        }
        
        @Override
		public SubLObject setField2(final SubLObject value) {
            return this.$name = value;
        }
        
        @Override
		public SubLObject setField3(final SubLObject value) {
            return this.$class_name = value;
        }
        
        @Override
		public SubLObject setField4(final SubLObject value) {
            return this.$function = value;
        }
        
        @Override
		public SubLObject setField5(final SubLObject value) {
            return this.$outer = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$method_trace_native.class, subloop_structures.$sym259$METHOD_TRACE, subloop_structures.$sym260$METHOD_TRACE_P, subloop_structures.$list261, subloop_structures.$list262, new String[] { "$name", "$class_name", "$function", "$outer" }, subloop_structures.$list263, subloop_structures.$list264, subloop_structures.$sym265$PRINT_METHOD_TRACE);
        }
    }
    
    public static final class $method_trace_p$UnaryFunction extends UnaryFunction
    {
        public $method_trace_p$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("METHOD-TRACE-P"));
        }
        
        @Override
		public SubLObject processItem(final SubLObject arg1) {
            return subloop_structures.method_trace_p(arg1);
        }
    }
    
    public static final class $method_info_native extends SubLStructNative
    {
        public SubLObject $method_name;
        public SubLObject $class_name;
        public SubLObject $mv_used_in_body;
        public SubLObject $mv_modified_in_body;
        public SubLObject $methods_used_in_body;
        private static final SubLStructDeclNative structDecl;
        
        public $method_info_native() {
            this.$method_name = (SubLObject)CommonSymbols.NIL;
            this.$class_name = (SubLObject)CommonSymbols.NIL;
            this.$mv_used_in_body = (SubLObject)CommonSymbols.NIL;
            this.$mv_modified_in_body = (SubLObject)CommonSymbols.NIL;
            this.$methods_used_in_body = (SubLObject)CommonSymbols.NIL;
        }
        
        @Override
		public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$method_info_native.structDecl;
        }
        
        @Override
		public SubLObject getField2() {
            return this.$method_name;
        }
        
        @Override
		public SubLObject getField3() {
            return this.$class_name;
        }
        
        @Override
		public SubLObject getField4() {
            return this.$mv_used_in_body;
        }
        
        @Override
		public SubLObject getField5() {
            return this.$mv_modified_in_body;
        }
        
        @Override
		public SubLObject getField6() {
            return this.$methods_used_in_body;
        }
        
        @Override
		public SubLObject setField2(final SubLObject value) {
            return this.$method_name = value;
        }
        
        @Override
		public SubLObject setField3(final SubLObject value) {
            return this.$class_name = value;
        }
        
        @Override
		public SubLObject setField4(final SubLObject value) {
            return this.$mv_used_in_body = value;
        }
        
        @Override
		public SubLObject setField5(final SubLObject value) {
            return this.$mv_modified_in_body = value;
        }
        
        @Override
		public SubLObject setField6(final SubLObject value) {
            return this.$methods_used_in_body = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$method_info_native.class, subloop_structures.$sym284$METHOD_INFO, subloop_structures.$sym285$METHOD_INFO_P, subloop_structures.$list286, subloop_structures.$list287, new String[] { "$method_name", "$class_name", "$mv_used_in_body", "$mv_modified_in_body", "$methods_used_in_body" }, subloop_structures.$list288, subloop_structures.$list289, subloop_structures.$sym290$DEFAULT_STRUCT_PRINT_FUNCTION);
        }
    }
    
    public static final class $method_info_p$UnaryFunction extends UnaryFunction
    {
        public $method_info_p$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("METHOD-INFO-P"));
        }
        
        @Override
		public SubLObject processItem(final SubLObject arg1) {
            return subloop_structures.method_info_p(arg1);
        }
    }
    
    public static final class $slot_listener_native extends SubLStructNative
    {
        public SubLObject $slot_name;
        public SubLObject $demon_type;
        public SubLObject $value_trigger;
        public SubLObject $functional_type;
        public SubLObject $isa_method;
        public SubLObject $target_instance;
        private static final SubLStructDeclNative structDecl;
        
        public $slot_listener_native() {
            this.$slot_name = (SubLObject)CommonSymbols.NIL;
            this.$demon_type = (SubLObject)CommonSymbols.NIL;
            this.$value_trigger = (SubLObject)CommonSymbols.NIL;
            this.$functional_type = (SubLObject)CommonSymbols.NIL;
            this.$isa_method = (SubLObject)CommonSymbols.NIL;
            this.$target_instance = (SubLObject)CommonSymbols.NIL;
        }
        
        @Override
		public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$slot_listener_native.structDecl;
        }
        
        @Override
		public SubLObject getField2() {
            return this.$slot_name;
        }
        
        @Override
		public SubLObject getField3() {
            return this.$demon_type;
        }
        
        @Override
		public SubLObject getField4() {
            return this.$value_trigger;
        }
        
        @Override
		public SubLObject getField5() {
            return this.$functional_type;
        }
        
        @Override
		public SubLObject getField6() {
            return this.$isa_method;
        }
        
        @Override
		public SubLObject getField7() {
            return this.$target_instance;
        }
        
        @Override
		public SubLObject setField2(final SubLObject value) {
            return this.$slot_name = value;
        }
        
        @Override
		public SubLObject setField3(final SubLObject value) {
            return this.$demon_type = value;
        }
        
        @Override
		public SubLObject setField4(final SubLObject value) {
            return this.$value_trigger = value;
        }
        
        @Override
		public SubLObject setField5(final SubLObject value) {
            return this.$functional_type = value;
        }
        
        @Override
		public SubLObject setField6(final SubLObject value) {
            return this.$isa_method = value;
        }
        
        @Override
		public SubLObject setField7(final SubLObject value) {
            return this.$target_instance = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$slot_listener_native.class, subloop_structures.$sym312$SLOT_LISTENER, subloop_structures.$sym313$SLOT_LISTENER_P, subloop_structures.$list314, subloop_structures.$list315, new String[] { "$slot_name", "$demon_type", "$value_trigger", "$functional_type", "$isa_method", "$target_instance" }, subloop_structures.$list316, subloop_structures.$list317, subloop_structures.$sym318$PRINT_SLOT_LISTENER);
        }
    }
    
    public static final class $slot_listener_p$UnaryFunction extends UnaryFunction
    {
        public $slot_listener_p$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("SLOT-LISTENER-P"));
        }
        
        @Override
		public SubLObject processItem(final SubLObject arg1) {
            return subloop_structures.slot_listener_p(arg1);
        }
    }
    
    public static final class $slot_listener_registry_native extends SubLStructNative
    {
        public SubLObject $instance;
        public SubLObject $slot_count;
        public SubLObject $listeners_vector;
        private static final SubLStructDeclNative structDecl;
        
        public $slot_listener_registry_native() {
            this.$instance = (SubLObject)CommonSymbols.NIL;
            this.$slot_count = (SubLObject)CommonSymbols.NIL;
            this.$listeners_vector = (SubLObject)CommonSymbols.NIL;
        }
        
        @Override
		public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$slot_listener_registry_native.structDecl;
        }
        
        @Override
		public SubLObject getField2() {
            return this.$instance;
        }
        
        @Override
		public SubLObject getField3() {
            return this.$slot_count;
        }
        
        @Override
		public SubLObject getField4() {
            return this.$listeners_vector;
        }
        
        @Override
		public SubLObject setField2(final SubLObject value) {
            return this.$instance = value;
        }
        
        @Override
		public SubLObject setField3(final SubLObject value) {
            return this.$slot_count = value;
        }
        
        @Override
		public SubLObject setField4(final SubLObject value) {
            return this.$listeners_vector = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$slot_listener_registry_native.class, subloop_structures.$sym345$SLOT_LISTENER_REGISTRY, subloop_structures.$sym346$SLOT_LISTENER_REGISTRY_P, subloop_structures.$list347, subloop_structures.$list348, new String[] { "$instance", "$slot_count", "$listeners_vector" }, subloop_structures.$list349, subloop_structures.$list350, subloop_structures.$sym290$DEFAULT_STRUCT_PRINT_FUNCTION);
        }
    }
    
    public static final class $slot_listener_registry_p$UnaryFunction extends UnaryFunction
    {
        public $slot_listener_registry_p$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("SLOT-LISTENER-REGISTRY-P"));
        }
        
        @Override
		public SubLObject processItem(final SubLObject arg1) {
            return subloop_structures.slot_listener_registry_p(arg1);
        }
    }
    
    public static final class $method_listener_native extends SubLStructNative
    {
        public SubLObject $owning_method_name;
        public SubLObject $owning_class_name;
        public SubLObject $demon_type;
        public SubLObject $detail;
        private static final SubLStructDeclNative structDecl;
        
        public $method_listener_native() {
            this.$owning_method_name = (SubLObject)CommonSymbols.NIL;
            this.$owning_class_name = (SubLObject)CommonSymbols.NIL;
            this.$demon_type = (SubLObject)CommonSymbols.NIL;
            this.$detail = (SubLObject)CommonSymbols.NIL;
        }
        
        @Override
		public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$method_listener_native.structDecl;
        }
        
        @Override
		public SubLObject getField2() {
            return this.$owning_method_name;
        }
        
        @Override
		public SubLObject getField3() {
            return this.$owning_class_name;
        }
        
        @Override
		public SubLObject getField4() {
            return this.$demon_type;
        }
        
        @Override
		public SubLObject getField5() {
            return this.$detail;
        }
        
        @Override
		public SubLObject setField2(final SubLObject value) {
            return this.$owning_method_name = value;
        }
        
        @Override
		public SubLObject setField3(final SubLObject value) {
            return this.$owning_class_name = value;
        }
        
        @Override
		public SubLObject setField4(final SubLObject value) {
            return this.$demon_type = value;
        }
        
        @Override
		public SubLObject setField5(final SubLObject value) {
            return this.$detail = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$method_listener_native.class, subloop_structures.$sym368$METHOD_LISTENER, subloop_structures.$sym369$METHOD_LISTENER_P, subloop_structures.$list370, subloop_structures.$list371, new String[] { "$owning_method_name", "$owning_class_name", "$demon_type", "$detail" }, subloop_structures.$list372, subloop_structures.$list373, subloop_structures.$sym374$PRINT_METHOD_LISTENER);
        }
    }
    
    public static final class $method_listener_p$UnaryFunction extends UnaryFunction
    {
        public $method_listener_p$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("METHOD-LISTENER-P"));
        }
        
        @Override
		public SubLObject processItem(final SubLObject arg1) {
            return subloop_structures.method_listener_p(arg1);
        }
    }
    
    public static final class $function_detail_native extends SubLStructNative
    {
        public SubLObject $function_name;
        public SubLObject $arglist;
        private static final SubLStructDeclNative structDecl;
        
        public $function_detail_native() {
            this.$function_name = (SubLObject)CommonSymbols.NIL;
            this.$arglist = (SubLObject)CommonSymbols.NIL;
        }
        
        @Override
		public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$function_detail_native.structDecl;
        }
        
        @Override
		public SubLObject getField2() {
            return this.$function_name;
        }
        
        @Override
		public SubLObject getField3() {
            return this.$arglist;
        }
        
        @Override
		public SubLObject setField2(final SubLObject value) {
            return this.$function_name = value;
        }
        
        @Override
		public SubLObject setField3(final SubLObject value) {
            return this.$arglist = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$function_detail_native.class, subloop_structures.$sym393$FUNCTION_DETAIL, subloop_structures.$sym394$FUNCTION_DETAIL_P, subloop_structures.$list395, subloop_structures.$list396, new String[] { "$function_name", "$arglist" }, subloop_structures.$list397, subloop_structures.$list398, subloop_structures.$sym290$DEFAULT_STRUCT_PRINT_FUNCTION);
        }
    }
    
    public static final class $function_detail_p$UnaryFunction extends UnaryFunction
    {
        public $function_detail_p$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("FUNCTION-DETAIL-P"));
        }
        
        @Override
		public SubLObject processItem(final SubLObject arg1) {
            return subloop_structures.function_detail_p(arg1);
        }
    }
    
    public static final class $method_detail_native extends SubLStructNative
    {
        public SubLObject $method_name;
        public SubLObject $function_name;
        public SubLObject $arglist;
        public SubLObject $instance;
        private static final SubLStructDeclNative structDecl;
        
        public $method_detail_native() {
            this.$method_name = (SubLObject)CommonSymbols.NIL;
            this.$function_name = (SubLObject)CommonSymbols.NIL;
            this.$arglist = (SubLObject)CommonSymbols.NIL;
            this.$instance = (SubLObject)CommonSymbols.NIL;
        }
        
        @Override
		public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$method_detail_native.structDecl;
        }
        
        @Override
		public SubLObject getField2() {
            return this.$method_name;
        }
        
        @Override
		public SubLObject getField3() {
            return this.$function_name;
        }
        
        @Override
		public SubLObject getField4() {
            return this.$arglist;
        }
        
        @Override
		public SubLObject getField5() {
            return this.$instance;
        }
        
        @Override
		public SubLObject setField2(final SubLObject value) {
            return this.$method_name = value;
        }
        
        @Override
		public SubLObject setField3(final SubLObject value) {
            return this.$function_name = value;
        }
        
        @Override
		public SubLObject setField4(final SubLObject value) {
            return this.$arglist = value;
        }
        
        @Override
		public SubLObject setField5(final SubLObject value) {
            return this.$instance = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$method_detail_native.class, subloop_structures.$sym411$METHOD_DETAIL, subloop_structures.$sym412$METHOD_DETAIL_P, subloop_structures.$list413, subloop_structures.$list414, new String[] { "$method_name", "$function_name", "$arglist", "$instance" }, subloop_structures.$list415, subloop_structures.$list416, subloop_structures.$sym290$DEFAULT_STRUCT_PRINT_FUNCTION);
        }
    }
    
    public static final class $method_detail_p$UnaryFunction extends UnaryFunction
    {
        public $method_detail_p$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("METHOD-DETAIL-P"));
        }
        
        @Override
		public SubLObject processItem(final SubLObject arg1) {
            return subloop_structures.method_detail_p(arg1);
        }
    }
    
    public static final class $method_listener_registry_native extends SubLStructNative
    {
        public SubLObject $instance;
        public SubLObject $listener_alist;
        private static final SubLStructDeclNative structDecl;
        
        public $method_listener_registry_native() {
            this.$instance = (SubLObject)CommonSymbols.NIL;
            this.$listener_alist = (SubLObject)CommonSymbols.NIL;
        }
        
        @Override
		public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$method_listener_registry_native.structDecl;
        }
        
        @Override
		public SubLObject getField2() {
            return this.$instance;
        }
        
        @Override
		public SubLObject getField3() {
            return this.$listener_alist;
        }
        
        @Override
		public SubLObject setField2(final SubLObject value) {
            return this.$instance = value;
        }
        
        @Override
		public SubLObject setField3(final SubLObject value) {
            return this.$listener_alist = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$method_listener_registry_native.class, subloop_structures.$sym432$METHOD_LISTENER_REGISTRY, subloop_structures.$sym433$METHOD_LISTENER_REGISTRY_P, subloop_structures.$list434, subloop_structures.$list435, new String[] { "$instance", "$listener_alist" }, subloop_structures.$list436, subloop_structures.$list437, subloop_structures.$sym290$DEFAULT_STRUCT_PRINT_FUNCTION);
        }
    }
    
    public static final class $method_listener_registry_p$UnaryFunction extends UnaryFunction
    {
        public $method_listener_registry_p$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("METHOD-LISTENER-REGISTRY-P"));
        }
        
        @Override
		public SubLObject processItem(final SubLObject arg1) {
            return subloop_structures.method_listener_registry_p(arg1);
        }
    }
}

/*

	Total time: 1308 ms
	
*/