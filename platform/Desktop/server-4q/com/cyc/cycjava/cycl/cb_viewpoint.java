package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Packages;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_macros;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class cb_viewpoint
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.cb_viewpoint";
  public static final String myFingerPrint = "7fd2b4efe971053d54e42d9c3106e025b7bbd040c86989485f2ad4b24317d97d";
  @SubLTranslatedFile.SubL(source = "cycl/cb-viewpoint.lisp", position = 510L)
  private static SubLSymbol $viewpoint_type$;
  @SubLTranslatedFile.SubL(source = "cycl/cb-viewpoint.lisp", position = 1482L)
  public static SubLSymbol $dtp_viewpoint$;
  @SubLTranslatedFile.SubL(source = "cycl/cb-viewpoint.lisp", position = 3983L)
  public static SubLSymbol $cb_viewpoint_table$;
  @SubLTranslatedFile.SubL(source = "cycl/cb-viewpoint.lisp", position = 4100L)
  public static SubLSymbol $cb_viewpoint_summary_alist$;
  @SubLTranslatedFile.SubL(source = "cycl/cb-viewpoint.lisp", position = 4180L)
  private static SubLSymbol $index_hook$;
  @SubLTranslatedFile.SubL(source = "cycl/cb-viewpoint.lisp", position = 4887L)
  private static SubLSymbol $viewpoint_cache$;
  @SubLTranslatedFile.SubL(source = "cycl/cb-viewpoint.lisp", position = 11693L)
  private static SubLSymbol $dash_nil$;
  @SubLTranslatedFile.SubL(source = "cycl/cb-viewpoint.lisp", position = 25151L)
  public static SubLSymbol $cb_use_mycreator_filter$;
  @SubLTranslatedFile.SubL(source = "cycl/cb-viewpoint.lisp", position = 25151L)
  public static SubLSymbol $cb_mycreator_filter$;
  @SubLTranslatedFile.SubL(source = "cycl/cb-viewpoint.lisp", position = 25374L)
  public static SubLSymbol $cb_use_myreviewer_filter$;
  @SubLTranslatedFile.SubL(source = "cycl/cb-viewpoint.lisp", position = 25374L)
  public static SubLSymbol $cb_myreviewer_filter$;
  @SubLTranslatedFile.SubL(source = "cycl/cb-viewpoint.lisp", position = 25616L)
  public static SubLSymbol $cb_use_assertion_start_date_filter$;
  @SubLTranslatedFile.SubL(source = "cycl/cb-viewpoint.lisp", position = 25616L)
  public static SubLSymbol $cb_assertion_start_date_filter$;
  @SubLTranslatedFile.SubL(source = "cycl/cb-viewpoint.lisp", position = 25912L)
  public static SubLSymbol $cb_use_assertion_end_date_filter$;
  @SubLTranslatedFile.SubL(source = "cycl/cb-viewpoint.lisp", position = 25912L)
  public static SubLSymbol $cb_assertion_end_date_filter$;
  @SubLTranslatedFile.SubL(source = "cycl/cb-viewpoint.lisp", position = 26208L)
  public static SubLSymbol $cb_use_mts_filter$;
  @SubLTranslatedFile.SubL(source = "cycl/cb-viewpoint.lisp", position = 26208L)
  public static SubLSymbol $cb_mts_filter$;
  @SubLTranslatedFile.SubL(source = "cycl/cb-viewpoint.lisp", position = 26439L)
  public static SubLSymbol $cb_use_mycreationpurpose_filter$;
  @SubLTranslatedFile.SubL(source = "cycl/cb-viewpoint.lisp", position = 26439L)
  public static SubLSymbol $cb_mycreationpurpose_filter$;
  private static final SubLString $str0$_;
  private static final SubLSymbol $sym1$VIEWPOINT;
  private static final SubLSymbol $sym2$VIEWPOINT_P;
  private static final SubLList $list3;
  private static final SubLList $list4;
  private static final SubLList $list5;
  private static final SubLList $list6;
  private static final SubLSymbol $sym7$PRINT_VIEWPOINT;
  private static final SubLSymbol $sym8$VIEWPOINT_PRINT_FUNCTION_TRAMPOLINE;
  private static final SubLList $list9;
  private static final SubLSymbol $sym10$VIEWPOINT_NAME;
  private static final SubLSymbol $sym11$_CSETF_VIEWPOINT_NAME;
  private static final SubLSymbol $sym12$VIEWPOINT_SUMMARY_NAME;
  private static final SubLSymbol $sym13$_CSETF_VIEWPOINT_SUMMARY_NAME;
  private static final SubLSymbol $sym14$VIEWPOINT_LINKABLE_NAME;
  private static final SubLSymbol $sym15$_CSETF_VIEWPOINT_LINKABLE_NAME;
  private static final SubLSymbol $sym16$VIEWPOINT_LINKNAME_PREFIX;
  private static final SubLSymbol $sym17$_CSETF_VIEWPOINT_LINKNAME_PREFIX;
  private static final SubLSymbol $sym18$VIEWPOINT_FILTER_GETTER;
  private static final SubLSymbol $sym19$_CSETF_VIEWPOINT_FILTER_GETTER;
  private static final SubLSymbol $sym20$VIEWPOINT_FILTER_SETTER;
  private static final SubLSymbol $sym21$_CSETF_VIEWPOINT_FILTER_SETTER;
  private static final SubLSymbol $sym22$VIEWPOINT_TYPE;
  private static final SubLSymbol $sym23$_CSETF_VIEWPOINT_TYPE;
  private static final SubLSymbol $sym24$VIEWPOINT_ACTIVE_P;
  private static final SubLSymbol $sym25$_CSETF_VIEWPOINT_ACTIVE_P;
  private static final SubLSymbol $sym26$VIEWPOINT_EFFECTIVE_FN;
  private static final SubLSymbol $sym27$_CSETF_VIEWPOINT_EFFECTIVE_FN;
  private static final SubLSymbol $sym28$VIEWPOINT_VALUE_PROMPT_FN;
  private static final SubLSymbol $sym29$_CSETF_VIEWPOINT_VALUE_PROMPT_FN;
  private static final SubLSymbol $sym30$VIEWPOINT_VALUE_UPDATE_FN;
  private static final SubLSymbol $sym31$_CSETF_VIEWPOINT_VALUE_UPDATE_FN;
  private static final SubLSymbol $sym32$VIEWPOINT_INITIAL_FILTER_VALUE;
  private static final SubLSymbol $sym33$_CSETF_VIEWPOINT_INITIAL_FILTER_VALUE;
  private static final SubLSymbol $sym34$VIEWPOINT_EFFECTIVE_FN_SLOTNAME;
  private static final SubLSymbol $sym35$_CSETF_VIEWPOINT_EFFECTIVE_FN_SLOTNAME;
  private static final SubLSymbol $kw36$NAME;
  private static final SubLSymbol $kw37$SUMMARY_NAME;
  private static final SubLSymbol $kw38$LINKABLE_NAME;
  private static final SubLSymbol $kw39$LINKNAME_PREFIX;
  private static final SubLSymbol $kw40$FILTER_GETTER;
  private static final SubLSymbol $kw41$FILTER_SETTER;
  private static final SubLSymbol $kw42$TYPE;
  private static final SubLSymbol $kw43$ACTIVE_P;
  private static final SubLSymbol $kw44$EFFECTIVE_FN;
  private static final SubLSymbol $kw45$VALUE_PROMPT_FN;
  private static final SubLSymbol $kw46$VALUE_UPDATE_FN;
  private static final SubLSymbol $kw47$INITIAL_FILTER_VALUE;
  private static final SubLSymbol $kw48$EFFECTIVE_FN_SLOTNAME;
  private static final SubLString $str49$Invalid_slot__S_for_construction_;
  private static final SubLSymbol $kw50$BEGIN;
  private static final SubLSymbol $sym51$MAKE_VIEWPOINT;
  private static final SubLSymbol $kw52$SLOT;
  private static final SubLSymbol $kw53$END;
  private static final SubLSymbol $sym54$VISIT_DEFSTRUCT_OBJECT_VIEWPOINT_METHOD;
  private static final SubLSymbol $sym55$_CB_VIEWPOINT_TABLE_;
  private static final SubLSymbol $sym56$_CB_VIEWPOINT_SUMMARY_ALIST_;
  private static final SubLSymbol $sym57$ACTIVE_VIEWPOINT_STRUCT_P;
  private static final SubLList $list58;
  private static final SubLString $str59$_A_FILTER;
  private static final SubLString $str60$CB__A;
  private static final SubLString $str61$SET__A;
  private static final SubLString $str62$_A_EFFECTIVE_FN;
  private static final SubLSymbol $sym63$PROGN;
  private static final SubLSymbol $sym64$DEFFILTERSET;
  private static final SubLList $list65;
  private static final SubLSymbol $kw66$LIST_OF_FORMS;
  private static final SubLSymbol $sym67$DEFVIEWPOINT_INTERNAL;
  private static final SubLSymbol $sym68$QUOTE;
  private static final SubLSymbol $sym69$DEFINE;
  private static final SubLList $list70;
  private static final SubLList $list71;
  private static final SubLList $list72;
  private static final SubLSymbol $sym73$CLET;
  private static final SubLSymbol $sym74$FIND_VIEWPOINT;
  private static final SubLList $list75;
  private static final SubLList $list76;
  private static final SubLSymbol $sym77$CAR;
  private static final SubLString $str78$activate__A;
  private static final SubLString $str79$_;
  private static final SubLSymbol $kw80$NBSP;
  private static final SubLSymbol $kw81$SINGLE_SIMPLE_DATE;
  private static final SubLString $str82$_D;
  private static final SubLSymbol $kw83$EDIT_VIEWPOINT;
  private static final SubLString $str84$Edit;
  private static final SubLSymbol $sym85$DISPLAY_VIEWPOINT;
  private static final SubLString $str86$Complete;
  private static final SubLString $str87$;
  private static final SubLString $str88$cb_show_cyclist__A;
  private static final SubLObject $const89$Cyclist;
  private static final SubLInteger $int90$24;
  private static final SubLString $str91$cb_show_cyclist1__A;
  private static final SubLString $str92$cb_show_cyclist2__A;
  private static final SubLString $str93$________;
  private static final SubLString $str94$Unknown__A___S;
  private static final SubLString $str95$cyclist;
  private static final SubLObject $const96$Cyc_BasedProject;
  private static final SubLObject $const97$isa;
  private static final SubLString $str98$project1__A;
  private static final SubLString $str99$project2__A;
  private static final SubLString $str100$project3__A;
  private static final SubLString $str101$project;
  private static final SubLSymbol $kw102$CB_VIEWPOINT;
  private static final SubLString $str103$cb_viewpoint_html;
  private static final SubLList $list104;
  private static final SubLString $str105$_a_does_not_specify_an_index;
  private static final SubLString $str106$Viewpoint_Filter_Summary;
  private static final SubLString $str107$__DOCTYPE_html_PUBLIC_____W3C__DT;
  private static final SubLString $str108$_meta_http_equiv__X_UA_Compatible;
  private static final SubLSymbol $kw109$UNINITIALIZED;
  private static final SubLSymbol $kw110$CB_CYC;
  private static final SubLSymbol $kw111$SAM_AUTOCOMPLETE_CSS;
  private static final SubLSymbol $kw112$SHA1;
  private static final SubLString $str113$yui_skin_sam;
  private static final SubLString $str114$reloadFrameButton;
  private static final SubLString $str115$button;
  private static final SubLString $str116$reload;
  private static final SubLString $str117$Refresh_Frames;
  private static final SubLString $str118$post;
  private static final SubLString $str119$cb_viewpoint_summary_handler;
  private static final SubLString $str120$Current_Values;
  private static final SubLString $str121$Update_Filter_Settings;
  private static final SubLString $str122$always_show_comments;
  private static final SubLString $str123$Always_show_comments__regardless_;
  private static final SubLString $str124$always_show_bookkeeping;
  private static final SubLString $str125$Always_show_bookkeeping_predicate;
  private static final SubLSymbol $sym126$DISPLAY_VIEWPOINT_1;
  private static final SubLSymbol $sym127$CB_VIEWPOINT;
  private static final SubLSymbol $kw128$HTML_HANDLER;
  private static final SubLList $list129;
  private static final SubLString $str130$Viewpoint_Filters;
  private static final SubLString $str131$cb_viewpoint_handler;
  private static final SubLSymbol $sym132$CB_EV;
  private static final SubLString $str133$Summary_filters_have_been_changed;
  private static final SubLSymbol $sym134$CB_VIEWPOINT_SUMMARY_HANDLER;
  private static final SubLSymbol $sym135$CB_VIEWPOINT_HANDLER;
  private static final SubLString $str136$_Viewpoint_;
  private static final SubLSymbol $kw137$MAIN;
  private static final SubLString $str138$cb_viewpoint__A;
  private static final SubLSymbol $kw139$VIEWPOINT;
  private static final SubLSymbol $sym140$CB_LINK_VIEWPOINT;
  private static final SubLString $str141$_;
  private static final SubLString $str142$_Filter;
  private static final SubLString $str143$_Only_those_terms_whose_;
  private static final SubLString $str144$_field_has_a_value_equal_to_a_ter;
  private static final SubLSymbol $sym145$CB_PROMPT_CYCLISTS;
  private static final SubLString $str146$Activate_Filter;
  private static final SubLString $str147$all_dates__A;
  private static final SubLString $str148$no;
  private static final SubLString $str149$cb_show_start__A;
  private static final SubLString $str150$all;
  private static final SubLString $str151$yes;
  private static final SubLSymbol $sym152$MTS;
  private static final SubLString $str153$All_Mts;
  private static final SubLString $str154$Specify_Mts;
  private static final SubLString $str155$use_genl_mt;
  private static final SubLString $str156$Include_All_Genl_Mts;
  private static final SubLString $str157$new_mt;
  private static final SubLSymbol $sym158$CB_PROMPT_PROJECTS;
  private static final SubLObject $const159$EverythingPSC;
  private static final SubLSymbol $sym160$_CB_USE_MYCREATOR_FILTER_;
  private static final SubLSymbol $sym161$_CB_MYCREATOR_FILTER_;
  private static final SubLSymbol $sym162$MYCREATOR;
  private static final SubLList $list163;
  private static final SubLSymbol $sym164$CB_MYCREATOR_FILTER;
  private static final SubLSymbol $sym165$SET_CB_MYCREATOR_FILTER;
  private static final SubLSymbol $sym166$MYCREATOR_EFFECTIVE_FN;
  private static final SubLString $str167$not_an_assertion;
  private static final SubLSymbol $sym168$_CB_USE_MYREVIEWER_FILTER_;
  private static final SubLSymbol $sym169$_CB_MYREVIEWER_FILTER_;
  private static final SubLSymbol $sym170$MYREVIEWER;
  private static final SubLList $list171;
  private static final SubLSymbol $sym172$CB_MYREVIEWER_FILTER;
  private static final SubLSymbol $sym173$SET_CB_MYREVIEWER_FILTER;
  private static final SubLSymbol $sym174$MYREVIEWER_EFFECTIVE_FN;
  private static final SubLSymbol $sym175$_CB_USE_ASSERTION_START_DATE_FILTER_;
  private static final SubLSymbol $sym176$_CB_ASSERTION_START_DATE_FILTER_;
  private static final SubLSymbol $sym177$ASSERTION_START_DATE;
  private static final SubLList $list178;
  private static final SubLSymbol $sym179$CB_ASSERTION_START_DATE_FILTER;
  private static final SubLSymbol $sym180$SET_CB_ASSERTION_START_DATE_FILTER;
  private static final SubLSymbol $sym181$_CB_USE_ASSERTION_END_DATE_FILTER_;
  private static final SubLSymbol $sym182$_CB_ASSERTION_END_DATE_FILTER_;
  private static final SubLSymbol $sym183$ASSERTION_END_DATE;
  private static final SubLList $list184;
  private static final SubLSymbol $sym185$CB_ASSERTION_END_DATE_FILTER;
  private static final SubLSymbol $sym186$SET_CB_ASSERTION_END_DATE_FILTER;
  private static final SubLSymbol $sym187$_CB_USE_MTS_FILTER_;
  private static final SubLSymbol $sym188$_CB_MTS_FILTER_;
  private static final SubLList $list189;
  private static final SubLSymbol $sym190$CB_MTS_FILTER;
  private static final SubLSymbol $sym191$SET_CB_MTS_FILTER;
  private static final SubLSymbol $sym192$_CB_USE_MYCREATIONPURPOSE_FILTER_;
  private static final SubLSymbol $sym193$_CB_MYCREATIONPURPOSE_FILTER_;
  private static final SubLSymbol $sym194$MYCREATIONPURPOSE;
  private static final SubLList $list195;
  private static final SubLSymbol $sym196$CB_MYCREATIONPURPOSE_FILTER;
  private static final SubLSymbol $sym197$SET_CB_MYCREATIONPURPOSE_FILTER;
  private static final SubLSymbol $sym198$MYCREATIONPURPOSE_EFFECTIVE_FN;
  private static final SubLSymbol $sym199$CB_ONLINE_FILTER_HOOKS;
  private static final SubLList $list200;
  private static final SubLList $list201;
  private static final SubLList $list202;
  private static final SubLSymbol $kw203$ALLOW_OTHER_KEYS;
  private static final SubLSymbol $kw204$SPECIFIED_MT;
  private static final SubLSymbol $sym205$WITH_ASSERTION_FILTERS;
  private static final SubLSymbol $sym206$PCOND;
  private static final SubLSymbol $sym207$CAND;
  private static final SubLList $list208;
  private static final SubLSymbol $sym209$CNOT;
  private static final SubLSymbol $sym210$PIF;
  private static final SubLList $list211;
  private static final SubLSymbol $sym212$WITH_MT_LIST_AND_GENL_MTS;
  private static final SubLList $list213;
  private static final SubLSymbol $sym214$CSETQ;
  private static final SubLSymbol $sym215$WITH_MT_LIST;
  private static final SubLList $list216;
  private static final SubLSymbol $sym217$RESULT;
  private static final SubLSymbol $sym218$RET;
  private static final SubLString $str219$cb_ev;
  private static final SubLSymbol $kw220$TOP;
  private static final SubLString $str221$cb_start_cb_ev;
  private static final SubLString $str222$_a__a__a;
  private static final SubLString $str223$_a__a;
  private static final SubLSymbol $sym224$CB_LINK_EDIT_VIEWPOINT;

  @SubLTranslatedFile.SubL(source = "cycl/cb-viewpoint.lisp", position = 1216L)
  public static SubLObject print_viewpoint(final SubLObject v_object, final SubLObject stream, final SubLObject depth)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != print_high.$print_level$.getDynamicValue( thread ) && depth.numG( print_high.$print_level$.getDynamicValue( thread ) ) )
    {
      print_high.princ( $str0$_, stream );
    }
    else if( NIL != print_high.$print_readably$.getDynamicValue( thread ) )
    {
      print_high.print_not_readable( v_object, stream );
    }
    else
    {
      print_macros.print_unreadable_object_preamble( stream, v_object, T, T );
      print_high.princ( viewpoint_name( v_object ), stream );
      print_macros.print_unreadable_object_postamble( stream, v_object, NIL, NIL );
    }
    return v_object;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-viewpoint.lisp", position = 1482L)
  public static SubLObject viewpoint_print_function_trampoline(final SubLObject v_object, final SubLObject stream)
  {
    print_viewpoint( v_object, stream, ZERO_INTEGER );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-viewpoint.lisp", position = 1482L)
  public static SubLObject viewpoint_p(final SubLObject v_object)
  {
    return ( v_object.getClass() == $viewpoint_native.class ) ? T : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-viewpoint.lisp", position = 1482L)
  public static SubLObject viewpoint_name(final SubLObject v_object)
  {
    assert NIL != viewpoint_p( v_object ) : v_object;
    return v_object.getField2();
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-viewpoint.lisp", position = 1482L)
  public static SubLObject viewpoint_summary_name(final SubLObject v_object)
  {
    assert NIL != viewpoint_p( v_object ) : v_object;
    return v_object.getField3();
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-viewpoint.lisp", position = 1482L)
  public static SubLObject viewpoint_linkable_name(final SubLObject v_object)
  {
    assert NIL != viewpoint_p( v_object ) : v_object;
    return v_object.getField4();
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-viewpoint.lisp", position = 1482L)
  public static SubLObject viewpoint_linkname_prefix(final SubLObject v_object)
  {
    assert NIL != viewpoint_p( v_object ) : v_object;
    return v_object.getField5();
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-viewpoint.lisp", position = 1482L)
  public static SubLObject viewpoint_filter_getter(final SubLObject v_object)
  {
    assert NIL != viewpoint_p( v_object ) : v_object;
    return v_object.getField6();
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-viewpoint.lisp", position = 1482L)
  public static SubLObject viewpoint_filter_setter(final SubLObject v_object)
  {
    assert NIL != viewpoint_p( v_object ) : v_object;
    return v_object.getField7();
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-viewpoint.lisp", position = 1482L)
  public static SubLObject viewpoint_type(final SubLObject v_object)
  {
    assert NIL != viewpoint_p( v_object ) : v_object;
    return v_object.getField8();
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-viewpoint.lisp", position = 1482L)
  public static SubLObject viewpoint_active_p(final SubLObject v_object)
  {
    assert NIL != viewpoint_p( v_object ) : v_object;
    return v_object.getField9();
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-viewpoint.lisp", position = 1482L)
  public static SubLObject viewpoint_effective_fn(final SubLObject v_object)
  {
    assert NIL != viewpoint_p( v_object ) : v_object;
    return v_object.getField10();
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-viewpoint.lisp", position = 1482L)
  public static SubLObject viewpoint_value_prompt_fn(final SubLObject v_object)
  {
    assert NIL != viewpoint_p( v_object ) : v_object;
    return v_object.getField11();
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-viewpoint.lisp", position = 1482L)
  public static SubLObject viewpoint_value_update_fn(final SubLObject v_object)
  {
    assert NIL != viewpoint_p( v_object ) : v_object;
    return v_object.getField12();
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-viewpoint.lisp", position = 1482L)
  public static SubLObject viewpoint_initial_filter_value(final SubLObject v_object)
  {
    assert NIL != viewpoint_p( v_object ) : v_object;
    return v_object.getField13();
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-viewpoint.lisp", position = 1482L)
  public static SubLObject viewpoint_effective_fn_slotname(final SubLObject v_object)
  {
    assert NIL != viewpoint_p( v_object ) : v_object;
    return v_object.getField14();
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-viewpoint.lisp", position = 1482L)
  public static SubLObject _csetf_viewpoint_name(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != viewpoint_p( v_object ) : v_object;
    return v_object.setField2( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-viewpoint.lisp", position = 1482L)
  public static SubLObject _csetf_viewpoint_summary_name(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != viewpoint_p( v_object ) : v_object;
    return v_object.setField3( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-viewpoint.lisp", position = 1482L)
  public static SubLObject _csetf_viewpoint_linkable_name(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != viewpoint_p( v_object ) : v_object;
    return v_object.setField4( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-viewpoint.lisp", position = 1482L)
  public static SubLObject _csetf_viewpoint_linkname_prefix(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != viewpoint_p( v_object ) : v_object;
    return v_object.setField5( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-viewpoint.lisp", position = 1482L)
  public static SubLObject _csetf_viewpoint_filter_getter(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != viewpoint_p( v_object ) : v_object;
    return v_object.setField6( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-viewpoint.lisp", position = 1482L)
  public static SubLObject _csetf_viewpoint_filter_setter(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != viewpoint_p( v_object ) : v_object;
    return v_object.setField7( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-viewpoint.lisp", position = 1482L)
  public static SubLObject _csetf_viewpoint_type(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != viewpoint_p( v_object ) : v_object;
    return v_object.setField8( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-viewpoint.lisp", position = 1482L)
  public static SubLObject _csetf_viewpoint_active_p(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != viewpoint_p( v_object ) : v_object;
    return v_object.setField9( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-viewpoint.lisp", position = 1482L)
  public static SubLObject _csetf_viewpoint_effective_fn(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != viewpoint_p( v_object ) : v_object;
    return v_object.setField10( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-viewpoint.lisp", position = 1482L)
  public static SubLObject _csetf_viewpoint_value_prompt_fn(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != viewpoint_p( v_object ) : v_object;
    return v_object.setField11( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-viewpoint.lisp", position = 1482L)
  public static SubLObject _csetf_viewpoint_value_update_fn(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != viewpoint_p( v_object ) : v_object;
    return v_object.setField12( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-viewpoint.lisp", position = 1482L)
  public static SubLObject _csetf_viewpoint_initial_filter_value(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != viewpoint_p( v_object ) : v_object;
    return v_object.setField13( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-viewpoint.lisp", position = 1482L)
  public static SubLObject _csetf_viewpoint_effective_fn_slotname(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != viewpoint_p( v_object ) : v_object;
    return v_object.setField14( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-viewpoint.lisp", position = 1482L)
  public static SubLObject make_viewpoint(SubLObject arglist)
  {
    if( arglist == UNPROVIDED )
    {
      arglist = NIL;
    }
    final SubLObject v_new = new $viewpoint_native();
    SubLObject next;
    SubLObject current_arg;
    SubLObject current_value;
    SubLObject pcase_var;
    for( next = NIL, next = arglist; NIL != next; next = conses_high.cddr( next ) )
    {
      current_arg = next.first();
      current_value = conses_high.cadr( next );
      pcase_var = current_arg;
      if( pcase_var.eql( $kw36$NAME ) )
      {
        _csetf_viewpoint_name( v_new, current_value );
      }
      else if( pcase_var.eql( $kw37$SUMMARY_NAME ) )
      {
        _csetf_viewpoint_summary_name( v_new, current_value );
      }
      else if( pcase_var.eql( $kw38$LINKABLE_NAME ) )
      {
        _csetf_viewpoint_linkable_name( v_new, current_value );
      }
      else if( pcase_var.eql( $kw39$LINKNAME_PREFIX ) )
      {
        _csetf_viewpoint_linkname_prefix( v_new, current_value );
      }
      else if( pcase_var.eql( $kw40$FILTER_GETTER ) )
      {
        _csetf_viewpoint_filter_getter( v_new, current_value );
      }
      else if( pcase_var.eql( $kw41$FILTER_SETTER ) )
      {
        _csetf_viewpoint_filter_setter( v_new, current_value );
      }
      else if( pcase_var.eql( $kw42$TYPE ) )
      {
        _csetf_viewpoint_type( v_new, current_value );
      }
      else if( pcase_var.eql( $kw43$ACTIVE_P ) )
      {
        _csetf_viewpoint_active_p( v_new, current_value );
      }
      else if( pcase_var.eql( $kw44$EFFECTIVE_FN ) )
      {
        _csetf_viewpoint_effective_fn( v_new, current_value );
      }
      else if( pcase_var.eql( $kw45$VALUE_PROMPT_FN ) )
      {
        _csetf_viewpoint_value_prompt_fn( v_new, current_value );
      }
      else if( pcase_var.eql( $kw46$VALUE_UPDATE_FN ) )
      {
        _csetf_viewpoint_value_update_fn( v_new, current_value );
      }
      else if( pcase_var.eql( $kw47$INITIAL_FILTER_VALUE ) )
      {
        _csetf_viewpoint_initial_filter_value( v_new, current_value );
      }
      else if( pcase_var.eql( $kw48$EFFECTIVE_FN_SLOTNAME ) )
      {
        _csetf_viewpoint_effective_fn_slotname( v_new, current_value );
      }
      else
      {
        Errors.error( $str49$Invalid_slot__S_for_construction_, current_arg );
      }
    }
    return v_new;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-viewpoint.lisp", position = 1482L)
  public static SubLObject visit_defstruct_viewpoint(final SubLObject obj, final SubLObject visitor_fn)
  {
    Functions.funcall( visitor_fn, obj, $kw50$BEGIN, $sym51$MAKE_VIEWPOINT, THIRTEEN_INTEGER );
    Functions.funcall( visitor_fn, obj, $kw52$SLOT, $kw36$NAME, viewpoint_name( obj ) );
    Functions.funcall( visitor_fn, obj, $kw52$SLOT, $kw37$SUMMARY_NAME, viewpoint_summary_name( obj ) );
    Functions.funcall( visitor_fn, obj, $kw52$SLOT, $kw38$LINKABLE_NAME, viewpoint_linkable_name( obj ) );
    Functions.funcall( visitor_fn, obj, $kw52$SLOT, $kw39$LINKNAME_PREFIX, viewpoint_linkname_prefix( obj ) );
    Functions.funcall( visitor_fn, obj, $kw52$SLOT, $kw40$FILTER_GETTER, viewpoint_filter_getter( obj ) );
    Functions.funcall( visitor_fn, obj, $kw52$SLOT, $kw41$FILTER_SETTER, viewpoint_filter_setter( obj ) );
    Functions.funcall( visitor_fn, obj, $kw52$SLOT, $kw42$TYPE, viewpoint_type( obj ) );
    Functions.funcall( visitor_fn, obj, $kw52$SLOT, $kw43$ACTIVE_P, viewpoint_active_p( obj ) );
    Functions.funcall( visitor_fn, obj, $kw52$SLOT, $kw44$EFFECTIVE_FN, viewpoint_effective_fn( obj ) );
    Functions.funcall( visitor_fn, obj, $kw52$SLOT, $kw45$VALUE_PROMPT_FN, viewpoint_value_prompt_fn( obj ) );
    Functions.funcall( visitor_fn, obj, $kw52$SLOT, $kw46$VALUE_UPDATE_FN, viewpoint_value_update_fn( obj ) );
    Functions.funcall( visitor_fn, obj, $kw52$SLOT, $kw47$INITIAL_FILTER_VALUE, viewpoint_initial_filter_value( obj ) );
    Functions.funcall( visitor_fn, obj, $kw52$SLOT, $kw48$EFFECTIVE_FN_SLOTNAME, viewpoint_effective_fn_slotname( obj ) );
    Functions.funcall( visitor_fn, obj, $kw53$END, $sym51$MAKE_VIEWPOINT, THIRTEEN_INTEGER );
    return obj;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-viewpoint.lisp", position = 1482L)
  public static SubLObject visit_defstruct_object_viewpoint_method(final SubLObject obj, final SubLObject visitor_fn)
  {
    return visit_defstruct_viewpoint( obj, visitor_fn );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-viewpoint.lisp", position = 4253L)
  public static SubLObject find_viewpoint(final SubLObject name)
  {
    return Sequences.find( name, $cb_viewpoint_table$.getGlobalValue(), Symbols.symbol_function( EQUAL ), Symbols.symbol_function( $sym10$VIEWPOINT_NAME ), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-viewpoint.lisp", position = 4361L)
  public static SubLObject active_filter_p(final SubLObject viewpoint_name)
  {
    final SubLObject viewpoint = find_viewpoint( viewpoint_name );
    if( NIL != viewpoint )
    {
      return viewpoint_active_p( viewpoint );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-viewpoint.lisp", position = 4554L)
  public static SubLObject active_viewpoint_struct_p(final SubLObject viewpoint, SubLObject type)
  {
    if( type == UNPROVIDED )
    {
      type = $viewpoint_type$.getDynamicValue();
    }
    if( NIL != type )
    {
      if( NIL != active_filter_p( viewpoint ) && viewpoint_type( viewpoint ).eql( type ) )
      {
        return ConsesLow.list( viewpoint );
      }
    }
    else if( NIL != viewpoint_active_p( viewpoint ) )
    {
      return ConsesLow.list( viewpoint );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-viewpoint.lisp", position = 4957L)
  public static SubLObject clear_viewpoint_cache()
  {
    $viewpoint_cache$.setGlobalValue( NIL );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-viewpoint.lisp", position = 5046L)
  public static SubLObject active_filters(SubLObject type)
  {
    if( type == UNPROVIDED )
    {
      type = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject cache_hit = conses_high.assoc( type, $viewpoint_cache$.getGlobalValue(), UNPROVIDED, UNPROVIDED ).rest();
    if( NIL != cache_hit )
    {
      return cache_hit;
    }
    SubLObject result = NIL;
    final SubLObject _prev_bind_0 = $viewpoint_type$.currentBinding( thread );
    try
    {
      $viewpoint_type$.bind( type, thread );
      result = Mapping.mapcan( Symbols.symbol_function( $sym57$ACTIVE_VIEWPOINT_STRUCT_P ), $cb_viewpoint_table$.getGlobalValue(), EMPTY_SUBL_OBJECT_ARRAY );
    }
    finally
    {
      $viewpoint_type$.rebind( _prev_bind_0, thread );
    }
    if( NIL != result )
    {
      $viewpoint_cache$.setGlobalValue( conses_high.acons( type, result, $viewpoint_cache$.getGlobalValue() ) );
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-viewpoint.lisp", position = 5477L)
  public static SubLObject enable_filter(final SubLObject filter_name, SubLObject enable_p)
  {
    if( enable_p == UNPROVIDED )
    {
      enable_p = T;
    }
    clear_viewpoint_cache();
    final SubLObject viewpoint = find_viewpoint( filter_name );
    if( NIL != viewpoint )
    {
      _csetf_viewpoint_active_p( viewpoint, enable_p );
      return enable_p;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-viewpoint.lisp", position = 5807L)
  public static SubLObject doc_predicate_p(final SubLObject assertion)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return makeBoolean( ( NIL != cb_parameters.$cb_viewpoint_show_doc_preds$.getDynamicValue( thread ) && NIL != cb_adornments.documentation_assertion_p( assertion ) )
        || ( NIL != cb_parameters.$cb_viewpoint_show_book_preds$.getDynamicValue( thread ) && NIL != cb_adornments.bookkeeping_assertion_p( assertion ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-viewpoint.lisp", position = 6066L)
  public static SubLObject defviewpoint(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject name = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list58 );
    name = current.first();
    final SubLObject arglist;
    current = ( arglist = current.rest() );
    final SubLObject filtername = Packages.intern( PrintLow.format( NIL, $str59$_A_FILTER, Strings.string_upcase( Strings.string( name ), UNPROVIDED, UNPROVIDED ) ), UNPROVIDED );
    final SubLObject gettername = Packages.intern( PrintLow.format( NIL, $str60$CB__A, filtername ), UNPROVIDED );
    final SubLObject settername = Packages.intern( PrintLow.format( NIL, $str61$SET__A, gettername ), UNPROVIDED );
    final SubLObject effective_fn_name = Packages.intern( PrintLow.format( NIL, $str62$_A_EFFECTIVE_FN, name ), UNPROVIDED );
    final SubLObject type = cb_macros.extract_keyword( $kw42$TYPE, arglist, UNPROVIDED );
    return ConsesLow.list( $sym63$PROGN, ConsesLow.listS( $sym64$DEFFILTERSET, filtername, $list65 ), ( NIL != cb_macros.extract_keyword( $kw48$EFFECTIVE_FN_SLOTNAME, arglist, UNPROVIDED ) )
        ? ( ( type == $kw66$LIST_OF_FORMS ) ? ConsesLow.list( $sym63$PROGN, ConsesLow.list( $sym67$DEFVIEWPOINT_INTERNAL, ConsesLow.list( $sym68$QUOTE, name ), ConsesLow.list( $sym68$QUOTE, arglist ), ConsesLow.list(
            $sym68$QUOTE, gettername ), ConsesLow.list( $sym68$QUOTE, settername ), ConsesLow.list( $sym68$QUOTE, effective_fn_name ) ), ConsesLow.list( $sym69$DEFINE, effective_fn_name, $list70, $list71, $list72,
                ConsesLow.listS( $sym73$CLET, ConsesLow.list( ConsesLow.list( $sym1$VIEWPOINT, ConsesLow.list( $sym74$FIND_VIEWPOINT, ConsesLow.list( $sym68$QUOTE, name ) ) ) ), $list75 ) ) )
            : ConsesLow.listS( $sym67$DEFVIEWPOINT_INTERNAL, ConsesLow.list( $sym68$QUOTE, name ), ConsesLow.list( $sym68$QUOTE, arglist ), ConsesLow.list( $sym68$QUOTE, gettername ), ConsesLow.list( $sym68$QUOTE,
                settername ), $list76 ) )
        : ConsesLow.listS( $sym67$DEFVIEWPOINT_INTERNAL, ConsesLow.list( $sym68$QUOTE, name ), ConsesLow.list( $sym68$QUOTE, arglist ), ConsesLow.list( $sym68$QUOTE, gettername ), ConsesLow.list( $sym68$QUOTE,
            settername ), $list76 ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-viewpoint.lisp", position = 7778L)
  public static SubLObject defviewpoint_internal(final SubLObject name, final SubLObject arglist, final SubLObject gettername, final SubLObject settername, final SubLObject effective_fn_name)
  {
    clear_viewpoint_cache();
    final SubLObject old = $cb_viewpoint_table$.getGlobalValue();
    final SubLObject v_new = make_viewpoint( arglist );
    _csetf_viewpoint_name( v_new, name );
    if( NIL == viewpoint_summary_name( v_new ) )
    {
      _csetf_viewpoint_summary_name( v_new, name );
    }
    _csetf_viewpoint_filter_getter( v_new, gettername );
    _csetf_viewpoint_filter_setter( v_new, settername );
    Functions.funcall( settername, viewpoint_initial_filter_value( v_new ) );
    $cb_viewpoint_table$.setGlobalValue( ConsesLow.cons( v_new, Sequences.delete( name, old, Symbols.symbol_function( EQUAL ), Symbols.symbol_function( $sym10$VIEWPOINT_NAME ), UNPROVIDED, UNPROVIDED, UNPROVIDED ) ) );
    $cb_viewpoint_summary_alist$.setGlobalValue( conses_high.acons( viewpoint_summary_name( v_new ), ConsesLow.cons( v_new, Sequences.delete( name, conses_high.assoc( viewpoint_summary_name( v_new ),
        $cb_viewpoint_summary_alist$.getGlobalValue(), UNPROVIDED, UNPROVIDED ).rest(), Symbols.symbol_function( EQUAL ), Symbols.symbol_function( $sym10$VIEWPOINT_NAME ), UNPROVIDED, UNPROVIDED, UNPROVIDED ) ),
        Sequences.delete( viewpoint_summary_name( v_new ), $cb_viewpoint_summary_alist$.getGlobalValue(), Symbols.symbol_function( EQUAL ), Symbols.symbol_function( $sym77$CAR ), UNPROVIDED, UNPROVIDED, UNPROVIDED ) ) );
    if( NIL != effective_fn_name )
    {
      _csetf_viewpoint_effective_fn( v_new, effective_fn_name );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-viewpoint.lisp", position = 9124L)
  public static SubLObject display_viewpoint(final SubLObject viewpoint, SubLObject for_summary)
  {
    if( for_summary == UNPROVIDED )
    {
      for_summary = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != for_summary )
    {
      final SubLObject checkbox_name = PrintLow.format( NIL, $str78$activate__A, viewpoint_name( viewpoint ) );
      html_utilities.html_checkbox_input( checkbox_name, checkbox_name, active_viewpoint_struct_p( viewpoint, UNPROVIDED ), UNPROVIDED, UNPROVIDED, UNPROVIDED );
      html_utilities.html_indent( UNPROVIDED );
    }
    else
    {
      html_utilities.html_newline( UNPROVIDED );
      html_utilities.html_indent( TWO_INTEGER );
    }
    if( NIL != viewpoint_linkname_prefix( viewpoint ) )
    {
      html_utilities.html_princ( viewpoint_linkname_prefix( viewpoint ) );
    }
    cb_utilities.cb_form( viewpoint_linkable_name( viewpoint ), UNPROVIDED, UNPROVIDED );
    html_utilities.html_princ( $str79$_ );
    final SubLObject pcase_var;
    final SubLObject type = pcase_var = viewpoint_type( viewpoint );
    if( pcase_var.eql( $kw66$LIST_OF_FORMS ) )
    {
      SubLObject cdolist_list_var = Functions.funcall( viewpoint_filter_getter( viewpoint ) );
      SubLObject thingy = NIL;
      thingy = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        html_utilities.html_glyph( $kw80$NBSP, UNPROVIDED );
        cb_utilities.cb_form( thingy, UNPROVIDED, UNPROVIDED );
        if( NIL != for_summary )
        {
          html_utilities.html_newline( UNPROVIDED );
        }
        else
        {
          html_utilities.html_indent( UNPROVIDED );
        }
        cdolist_list_var = cdolist_list_var.rest();
        thingy = cdolist_list_var.first();
      }
    }
    else if( pcase_var.eql( $kw81$SINGLE_SIMPLE_DATE ) )
    {
      html_utilities.html_glyph( $kw80$NBSP, UNPROVIDED );
      PrintLow.format( html_macros.$html_stream$.getDynamicValue( thread ), $str82$_D, Functions.funcall( viewpoint_filter_getter( viewpoint ) ) );
    }
    if( NIL != for_summary )
    {
      html_utilities.html_indent( TWO_INTEGER );
      cb_utilities.cb_link( $kw83$EDIT_VIEWPOINT, viewpoint, $str84$Edit, cb_utilities.cb_index_identifier( $index_hook$.getDynamicValue( thread ) ), UNPROVIDED, UNPROVIDED );
    }
    if( NIL != for_summary )
    {
      html_utilities.html_newline( UNPROVIDED );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-viewpoint.lisp", position = 10601L)
  public static SubLObject cb_display_viewpoint_filters()
  {
    if( NIL != active_filters( UNPROVIDED ) )
    {
      html_utilities.html_princ( $str79$_ );
      Mapping.mapc( Symbols.symbol_function( $sym85$DISPLAY_VIEWPOINT ), active_filters( UNPROVIDED ), EMPTY_SUBL_OBJECT_ARRAY );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-viewpoint.lisp", position = 10808L)
  public static SubLObject prompt_with_completion(final SubLObject button, final SubLObject type, final SubLObject v_default, final SubLObject size)
  {
    html_utilities.html_newline( UNPROVIDED );
    html_utilities.html_indent( THREE_INTEGER );
    html_complete.html_complete_button( button, $str86$Complete, type, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    html_utilities.html_indent( UNPROVIDED );
    html_utilities.html_text_input( button, v_default, size );
    html_utilities.html_indent( UNPROVIDED );
    html_script_utilities.html_clear_input_button( button, UNPROVIDED, UNPROVIDED );
    html_utilities.html_newline( UNPROVIDED );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-viewpoint.lisp", position = 11265L)
  public static SubLObject cb_prompt_cyclists(final SubLObject id, SubLObject default1, SubLObject default2, SubLObject default3)
  {
    if( default1 == UNPROVIDED )
    {
      default1 = $str87$;
    }
    if( default2 == UNPROVIDED )
    {
      default2 = $str87$;
    }
    if( default3 == UNPROVIDED )
    {
      default3 = $str87$;
    }
    prompt_with_completion( PrintLow.format( NIL, $str88$cb_show_cyclist__A, id ), $const89$Cyclist, default1, $int90$24 );
    prompt_with_completion( PrintLow.format( NIL, $str91$cb_show_cyclist1__A, id ), $const89$Cyclist, default2, $int90$24 );
    prompt_with_completion( PrintLow.format( NIL, $str92$cb_show_cyclist2__A, id ), $const89$Cyclist, default3, $int90$24 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-viewpoint.lisp", position = 11813L)
  public static SubLObject extract_fort_input(final SubLObject key, final SubLObject args, final SubLObject typestring)
  {
    SubLObject value = string_utilities.trim_whitespace( html_utilities.html_extract_input( key, args ) );
    if( $str87$.equalp( value ) || $dash_nil$.getGlobalValue().equalp( value ) )
    {
      value = NIL;
    }
    else
    {
      value = cb_utilities.cb_guess_fort( value, UNPROVIDED );
      if( NIL == forts.fort_p( value ) )
      {
        cb_utilities.cb_error( $str94$Unknown__A___S, typestring, value, UNPROVIDED, UNPROVIDED, UNPROVIDED );
        return NIL;
      }
    }
    return value;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-viewpoint.lisp", position = 12239L)
  public static SubLObject cb_get_cyclists(final SubLObject id, final SubLObject args)
  {
    return Sequences.delete( NIL, ConsesLow.list( extract_fort_input( PrintLow.format( NIL, $str88$cb_show_cyclist__A, id ), args, $str95$cyclist ), extract_fort_input( PrintLow.format( NIL, $str91$cb_show_cyclist1__A,
        id ), args, $str95$cyclist ), extract_fort_input( PrintLow.format( NIL, $str92$cb_show_cyclist2__A, id ), args, $str95$cyclist ) ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-viewpoint.lisp", position = 12655L)
  public static SubLObject cb_prompt_projects(final SubLObject id, SubLObject default1, SubLObject default2, SubLObject default3)
  {
    if( default1 == UNPROVIDED )
    {
      default1 = $dash_nil$.getGlobalValue();
    }
    if( default2 == UNPROVIDED )
    {
      default2 = $dash_nil$.getGlobalValue();
    }
    if( default3 == UNPROVIDED )
    {
      default3 = $dash_nil$.getGlobalValue();
    }
    final SubLObject all_projects = ConsesLow.cons( $dash_nil$.getGlobalValue(), kb_mapping_utilities.pred_values_in_any_mt( $const96$Cyc_BasedProject, $const97$isa, TWO_INTEGER, ONE_INTEGER, UNPROVIDED ) );
    html_utilities.html_select_from_list( PrintLow.format( NIL, $str98$project1__A, id ), default1, all_projects, UNPROVIDED );
    html_utilities.html_select_from_list( PrintLow.format( NIL, $str99$project2__A, id ), default2, all_projects, UNPROVIDED );
    html_utilities.html_select_from_list( PrintLow.format( NIL, $str100$project3__A, id ), default3, all_projects, UNPROVIDED );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-viewpoint.lisp", position = 13234L)
  public static SubLObject cb_get_projects(final SubLObject id, final SubLObject args)
  {
    return Sequences.delete( NIL, ConsesLow.list( extract_fort_input( PrintLow.format( NIL, $str98$project1__A, id ), args, $str101$project ), extract_fort_input( PrintLow.format( NIL, $str99$project2__A, id ), args,
        $str101$project ), extract_fort_input( PrintLow.format( NIL, $str100$project3__A, id ), args, $str101$project ) ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-viewpoint.lisp", position = 13627L)
  public static SubLObject display_viewpoint_1(final SubLObject arg)
  {
    return display_viewpoint( arg, T );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-viewpoint.lisp", position = 13803L)
  public static SubLObject cb_viewpoint(SubLObject args)
  {
    if( args == UNPROVIDED )
    {
      args = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject current;
    final SubLObject datum = current = args;
    SubLObject index_spec = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list104 );
    index_spec = current.first();
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject index_hook = cb_utilities.cb_guess_index( index_spec );
      if( NIL == cb_utilities.cb_index_hook_p( index_hook ) )
      {
        cb_utilities.cb_error( $str105$_a_does_not_specify_an_index, index_hook, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
        return NIL;
      }
      final SubLObject title_var = $str106$Viewpoint_Filter_Summary;
      final SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding( thread );
      try
      {
        html_macros.$html_id_space_id_generator$.bind( ( NIL != integer_sequence_generator.integer_sequence_generator_p( html_macros.$html_id_space_id_generator$.getDynamicValue( thread ) ) )
            ? html_macros.$html_id_space_id_generator$.getDynamicValue( thread )
            : integer_sequence_generator.new_integer_sequence_generator( UNPROVIDED, UNPROVIDED, UNPROVIDED ), thread );
        html_utilities.html_markup( $str107$__DOCTYPE_html_PUBLIC_____W3C__DT );
        if( NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue( thread ) )
        {
          html_utilities.html_source_readability_terpri( UNPROVIDED );
          html_utilities.html_markup( $str108$_meta_http_equiv__X_UA_Compatible );
        }
        html_utilities.html_source_readability_terpri( UNPROVIDED );
        final SubLObject _prev_bind_0_$1 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding( thread );
        try
        {
          cyc_file_dependencies.$html_emitted_file_dependencies$.bind( ( cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue( thread ) == $kw109$UNINITIALIZED ) ? ConsesLow.list(
              EMPTY_SUBL_OBJECT_ARRAY ) : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue( thread ), thread );
          html_utilities.html_markup( html_macros.$html_html_head$.getGlobalValue() );
          html_utilities.html_markup( html_macros.$html_head_head$.getGlobalValue() );
          html_macros.html_head_content_type();
          cb_parameters.cb_head_shortcut_icon();
          html_utilities.html_meta_robot_instructions( cb_parameters.$cb_permit_robots_to_indexP$.getDynamicValue( thread ), cb_parameters.$cb_permit_robots_to_followP$.getDynamicValue( thread ) );
          cyc_file_dependencies.css( $kw110$CB_CYC );
          dhtml_macros.html_basic_cb_scripts();
          if( NIL != title_var )
          {
            html_utilities.html_source_readability_terpri( UNPROVIDED );
            html_utilities.html_markup( html_macros.$html_title_head$.getGlobalValue() );
            html_utilities.html_princ( title_var );
            html_utilities.html_markup( html_macros.$html_title_tail$.getGlobalValue() );
          }
          html_utilities.html_markup( html_macros.$html_head_tail$.getGlobalValue() );
          html_utilities.html_source_readability_terpri( UNPROVIDED );
          final SubLObject _prev_bind_0_$2 = html_macros.$html_inside_bodyP$.currentBinding( thread );
          try
          {
            html_macros.$html_inside_bodyP$.bind( T, thread );
            html_utilities.html_markup( html_macros.$html_body_head$.getGlobalValue() );
            if( NIL != html_macros.$html_default_bgcolor$.getDynamicValue( thread ) )
            {
              html_utilities.html_markup( html_macros.$html_body_bgcolor$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( html_utilities.html_color( html_macros.$html_default_bgcolor$.getDynamicValue( thread ) ) );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            }
            html_utilities.html_markup( html_macros.$html_body_class$.getGlobalValue() );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_markup( $str113$yui_skin_sam );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            final SubLObject _prev_bind_0_$3 = html_macros.$html_safe_print$.currentBinding( thread );
            try
            {
              html_macros.$html_safe_print$.bind( T, thread );
              html_utilities.html_markup( html_macros.$html_div_head$.getGlobalValue() );
              html_utilities.html_markup( html_macros.$html_attribute_id$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( $str114$reloadFrameButton );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
              final SubLObject _prev_bind_0_$4 = html_macros.$html_safe_print$.currentBinding( thread );
              try
              {
                html_macros.$html_safe_print$.bind( T, thread );
                html_utilities.html_markup( html_macros.$html_input_head$.getGlobalValue() );
                html_utilities.html_markup( html_macros.$html_input_type$.getGlobalValue() );
                html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                html_utilities.html_markup( $str115$button );
                html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                html_utilities.html_markup( html_macros.$html_input_name$.getGlobalValue() );
                html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                html_utilities.html_markup( $str116$reload );
                html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                html_utilities.html_markup( html_macros.$html_input_value$.getGlobalValue() );
                html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                html_utilities.html_princ( $str117$Refresh_Frames );
                html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                if( NIL != html_macros.$html_input_disabledP$.getDynamicValue( thread ) )
                {
                  html_utilities.html_simple_attribute( html_macros.$html_input_disabled$.getGlobalValue() );
                }
                html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
              }
              finally
              {
                html_macros.$html_safe_print$.rebind( _prev_bind_0_$4, thread );
              }
              html_utilities.html_markup( html_macros.$html_div_tail$.getGlobalValue() );
              if( NIL != title_var )
              {
                html_utilities.html_markup( html_macros.$html_heading_head$.getGlobalValue() );
                html_utilities.html_markup( TWO_INTEGER );
                html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
                html_utilities.html_princ( title_var );
                html_utilities.html_markup( html_macros.$html_heading_tail$.getGlobalValue() );
                html_utilities.html_markup( TWO_INTEGER );
                html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
              }
              final SubLObject frame_name_var = cb_utilities.cb_frame_name( NIL );
              html_utilities.html_markup( html_macros.$html_form_head$.getGlobalValue() );
              html_utilities.html_markup( html_macros.$html_form_action$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( system_parameters.$cyc_cgi_program$.getDynamicValue( thread ) );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( html_macros.$html_form_method$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( $str118$post );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              if( NIL != frame_name_var )
              {
                html_utilities.html_markup( html_macros.$html_form_target$.getGlobalValue() );
                html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                html_utilities.html_markup( frame_name_var );
                html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              }
              html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
              final SubLObject _prev_bind_0_$5 = html_macros.$html_safe_print$.currentBinding( thread );
              final SubLObject _prev_bind_2 = html_macros.$within_html_form$.currentBinding( thread );
              final SubLObject _prev_bind_3 = html_macros.$html_form_field_uniquifier_code$.currentBinding( thread );
              try
              {
                html_macros.$html_safe_print$.bind( T, thread );
                html_macros.$within_html_form$.bind( T, thread );
                html_macros.$html_form_field_uniquifier_code$.bind( html_macros.next_html_form_field_uniquifier_code(), thread );
                html_utilities.html_hidden_input( $str119$cb_viewpoint_summary_handler, T, UNPROVIDED );
                cb_utilities.cb_help_preamble( $kw102$CB_VIEWPOINT, UNPROVIDED, UNPROVIDED );
                html_utilities.html_newline( TWO_INTEGER );
                html_utilities.html_reset_input( $str120$Current_Values );
                html_utilities.html_indent( UNPROVIDED );
                html_utilities.html_submit_input( $str121$Update_Filter_Settings, UNPROVIDED, UNPROVIDED );
                html_utilities.html_newline( UNPROVIDED );
                cb_adornments.cb_c_index_adornments( index_hook );
                html_utilities.html_newline( UNPROVIDED );
                html_utilities.html_checkbox_input( $str122$always_show_comments, $str122$always_show_comments, cb_parameters.$cb_viewpoint_show_doc_preds$.getDynamicValue( thread ), UNPROVIDED, UNPROVIDED, UNPROVIDED );
                html_utilities.html_glyph( $kw80$NBSP, UNPROVIDED );
                html_utilities.html_princ( $str123$Always_show_comments__regardless_ );
                html_utilities.html_newline( UNPROVIDED );
                html_utilities.html_checkbox_input( $str124$always_show_bookkeeping, $str124$always_show_bookkeeping, cb_parameters.$cb_viewpoint_show_book_preds$.getDynamicValue( thread ), UNPROVIDED, UNPROVIDED,
                    UNPROVIDED );
                html_utilities.html_glyph( $kw80$NBSP, UNPROVIDED );
                html_utilities.html_princ( $str125$Always_show_bookkeeping_predicate );
                html_utilities.html_newline( TWO_INTEGER );
                SubLObject cdolist_list_var = $cb_viewpoint_summary_alist$.getGlobalValue();
                SubLObject viewpoint_summaries = NIL;
                viewpoint_summaries = cdolist_list_var.first();
                while ( NIL != cdolist_list_var)
                {
                  final SubLObject _prev_bind_0_$6 = $index_hook$.currentBinding( thread );
                  try
                  {
                    $index_hook$.bind( index_hook, thread );
                    if( NIL != conses_high.endp( conses_high.cddr( viewpoint_summaries ) ) )
                    {
                      display_viewpoint( conses_high.cadr( viewpoint_summaries ), T );
                    }
                    else
                    {
                      Mapping.mapc( Symbols.symbol_function( $sym126$DISPLAY_VIEWPOINT_1 ), viewpoint_summaries.rest(), EMPTY_SUBL_OBJECT_ARRAY );
                    }
                  }
                  finally
                  {
                    $index_hook$.rebind( _prev_bind_0_$6, thread );
                  }
                  html_utilities.html_newline( UNPROVIDED );
                  cdolist_list_var = cdolist_list_var.rest();
                  viewpoint_summaries = cdolist_list_var.first();
                }
                html_macros.embed_form_field_code( html_macros.$html_form_field_uniquifier_code$.getDynamicValue( thread ) );
              }
              finally
              {
                html_macros.$html_form_field_uniquifier_code$.rebind( _prev_bind_3, thread );
                html_macros.$within_html_form$.rebind( _prev_bind_2, thread );
                html_macros.$html_safe_print$.rebind( _prev_bind_0_$5, thread );
              }
              html_utilities.html_markup( html_macros.$html_form_tail$.getGlobalValue() );
              html_utilities.html_source_readability_terpri( UNPROVIDED );
              html_utilities.html_copyright_notice();
            }
            finally
            {
              html_macros.$html_safe_print$.rebind( _prev_bind_0_$3, thread );
            }
            html_utilities.html_markup( html_macros.$html_body_tail$.getGlobalValue() );
            html_utilities.html_source_readability_terpri( UNPROVIDED );
          }
          finally
          {
            html_macros.$html_inside_bodyP$.rebind( _prev_bind_0_$2, thread );
          }
          html_utilities.html_markup( html_macros.$html_html_tail$.getGlobalValue() );
        }
        finally
        {
          cyc_file_dependencies.$html_emitted_file_dependencies$.rebind( _prev_bind_0_$1, thread );
        }
        html_utilities.html_source_readability_terpri( UNPROVIDED );
      }
      finally
      {
        html_macros.$html_id_space_id_generator$.rebind( _prev_bind_0, thread );
      }
    }
    else
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list104 );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-viewpoint.lisp", position = 15479L)
  public static SubLObject cb_ev(SubLObject args)
  {
    if( args == UNPROVIDED )
    {
      args = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject current;
    final SubLObject datum = current = args;
    SubLObject summary_name = NIL;
    SubLObject index_spec = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list129 );
    summary_name = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list129 );
    index_spec = current.first();
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject index_hook = cb_utilities.cb_guess_index( index_spec );
      final SubLObject viewpoints = conses_high.assoc( Packages.intern( summary_name, UNPROVIDED ), $cb_viewpoint_summary_alist$.getGlobalValue(), UNPROVIDED, UNPROVIDED ).rest();
      if( NIL == cb_utilities.cb_index_hook_p( index_hook ) )
      {
        cb_utilities.cb_error( $str105$_a_does_not_specify_an_index, index_hook, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
        return NIL;
      }
      final SubLObject title_var = $str130$Viewpoint_Filters;
      final SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding( thread );
      try
      {
        html_macros.$html_id_space_id_generator$.bind( ( NIL != integer_sequence_generator.integer_sequence_generator_p( html_macros.$html_id_space_id_generator$.getDynamicValue( thread ) ) )
            ? html_macros.$html_id_space_id_generator$.getDynamicValue( thread )
            : integer_sequence_generator.new_integer_sequence_generator( UNPROVIDED, UNPROVIDED, UNPROVIDED ), thread );
        html_utilities.html_markup( $str107$__DOCTYPE_html_PUBLIC_____W3C__DT );
        if( NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue( thread ) )
        {
          html_utilities.html_source_readability_terpri( UNPROVIDED );
          html_utilities.html_markup( $str108$_meta_http_equiv__X_UA_Compatible );
        }
        html_utilities.html_source_readability_terpri( UNPROVIDED );
        final SubLObject _prev_bind_0_$7 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding( thread );
        try
        {
          cyc_file_dependencies.$html_emitted_file_dependencies$.bind( ( cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue( thread ) == $kw109$UNINITIALIZED ) ? ConsesLow.list(
              EMPTY_SUBL_OBJECT_ARRAY ) : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue( thread ), thread );
          html_utilities.html_markup( html_macros.$html_html_head$.getGlobalValue() );
          html_utilities.html_markup( html_macros.$html_head_head$.getGlobalValue() );
          html_macros.html_head_content_type();
          cb_parameters.cb_head_shortcut_icon();
          html_utilities.html_meta_robot_instructions( cb_parameters.$cb_permit_robots_to_indexP$.getDynamicValue( thread ), cb_parameters.$cb_permit_robots_to_followP$.getDynamicValue( thread ) );
          cyc_file_dependencies.css( $kw110$CB_CYC );
          dhtml_macros.html_basic_cb_scripts();
          if( NIL != title_var )
          {
            html_utilities.html_source_readability_terpri( UNPROVIDED );
            html_utilities.html_markup( html_macros.$html_title_head$.getGlobalValue() );
            html_utilities.html_princ( title_var );
            html_utilities.html_markup( html_macros.$html_title_tail$.getGlobalValue() );
          }
          html_complete.html_complete_script();
          cyc_file_dependencies.css( $kw111$SAM_AUTOCOMPLETE_CSS );
          html_utilities.html_markup( html_macros.$html_head_tail$.getGlobalValue() );
          html_utilities.html_source_readability_terpri( UNPROVIDED );
          final SubLObject _prev_bind_0_$8 = html_macros.$html_inside_bodyP$.currentBinding( thread );
          try
          {
            html_macros.$html_inside_bodyP$.bind( T, thread );
            html_utilities.html_markup( html_macros.$html_body_head$.getGlobalValue() );
            if( NIL != html_macros.$html_default_bgcolor$.getDynamicValue( thread ) )
            {
              html_utilities.html_markup( html_macros.$html_body_bgcolor$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( html_utilities.html_color( html_macros.$html_default_bgcolor$.getDynamicValue( thread ) ) );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            }
            html_utilities.html_markup( html_macros.$html_body_class$.getGlobalValue() );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_markup( $str113$yui_skin_sam );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            final SubLObject _prev_bind_0_$9 = html_macros.$html_safe_print$.currentBinding( thread );
            try
            {
              html_macros.$html_safe_print$.bind( T, thread );
              html_utilities.html_markup( html_macros.$html_div_head$.getGlobalValue() );
              html_utilities.html_markup( html_macros.$html_attribute_id$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( $str114$reloadFrameButton );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
              final SubLObject _prev_bind_0_$10 = html_macros.$html_safe_print$.currentBinding( thread );
              try
              {
                html_macros.$html_safe_print$.bind( T, thread );
                html_utilities.html_markup( html_macros.$html_input_head$.getGlobalValue() );
                html_utilities.html_markup( html_macros.$html_input_type$.getGlobalValue() );
                html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                html_utilities.html_markup( $str115$button );
                html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                html_utilities.html_markup( html_macros.$html_input_name$.getGlobalValue() );
                html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                html_utilities.html_markup( $str116$reload );
                html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                html_utilities.html_markup( html_macros.$html_input_value$.getGlobalValue() );
                html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                html_utilities.html_princ( $str117$Refresh_Frames );
                html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                if( NIL != html_macros.$html_input_disabledP$.getDynamicValue( thread ) )
                {
                  html_utilities.html_simple_attribute( html_macros.$html_input_disabled$.getGlobalValue() );
                }
                html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
              }
              finally
              {
                html_macros.$html_safe_print$.rebind( _prev_bind_0_$10, thread );
              }
              html_utilities.html_markup( html_macros.$html_div_tail$.getGlobalValue() );
              if( NIL != title_var )
              {
                html_utilities.html_markup( html_macros.$html_heading_head$.getGlobalValue() );
                html_utilities.html_markup( TWO_INTEGER );
                html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
                html_utilities.html_princ( title_var );
                html_utilities.html_markup( html_macros.$html_heading_tail$.getGlobalValue() );
                html_utilities.html_markup( TWO_INTEGER );
                html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
              }
              final SubLObject frame_name_var = cb_utilities.cb_frame_name( NIL );
              html_utilities.html_markup( html_macros.$html_form_head$.getGlobalValue() );
              html_utilities.html_markup( html_macros.$html_form_action$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( system_parameters.$cyc_cgi_program$.getDynamicValue( thread ) );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( html_macros.$html_form_method$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( $str118$post );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              if( NIL != frame_name_var )
              {
                html_utilities.html_markup( html_macros.$html_form_target$.getGlobalValue() );
                html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                html_utilities.html_markup( frame_name_var );
                html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              }
              html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
              final SubLObject _prev_bind_0_$11 = html_macros.$html_safe_print$.currentBinding( thread );
              final SubLObject _prev_bind_2 = html_macros.$within_html_form$.currentBinding( thread );
              final SubLObject _prev_bind_3 = html_macros.$html_form_field_uniquifier_code$.currentBinding( thread );
              try
              {
                html_macros.$html_safe_print$.bind( T, thread );
                html_macros.$within_html_form$.bind( T, thread );
                html_macros.$html_form_field_uniquifier_code$.bind( html_macros.next_html_form_field_uniquifier_code(), thread );
                html_utilities.html_hidden_input( $str131$cb_viewpoint_handler, ConsesLow.list( summary_name, index_spec ), UNPROVIDED );
                cb_utilities.cb_back_button( UNPROVIDED, UNPROVIDED );
                html_utilities.html_indent( UNPROVIDED );
                html_utilities.html_reset_input( $str120$Current_Values );
                html_utilities.html_indent( UNPROVIDED );
                html_utilities.html_submit_input( $str121$Update_Filter_Settings, UNPROVIDED, UNPROVIDED );
                html_utilities.html_newline( UNPROVIDED );
                SubLObject cdolist_list_var = viewpoints;
                SubLObject viewpoint = NIL;
                viewpoint = cdolist_list_var.first();
                while ( NIL != cdolist_list_var)
                {
                  if( NIL != viewpoint_value_prompt_fn( viewpoint ) )
                  {
                    Functions.funcall( viewpoint_value_prompt_fn( viewpoint ), viewpoint, index_hook );
                  }
                  cdolist_list_var = cdolist_list_var.rest();
                  viewpoint = cdolist_list_var.first();
                }
                html_utilities.html_newline( UNPROVIDED );
                html_utilities.html_hr( UNPROVIDED, UNPROVIDED );
                html_utilities.html_newline( UNPROVIDED );
                html_utilities.html_reset_input( $str120$Current_Values );
                html_utilities.html_indent( UNPROVIDED );
                html_utilities.html_submit_input( $str121$Update_Filter_Settings, UNPROVIDED, UNPROVIDED );
                html_macros.embed_form_field_code( html_macros.$html_form_field_uniquifier_code$.getDynamicValue( thread ) );
              }
              finally
              {
                html_macros.$html_form_field_uniquifier_code$.rebind( _prev_bind_3, thread );
                html_macros.$within_html_form$.rebind( _prev_bind_2, thread );
                html_macros.$html_safe_print$.rebind( _prev_bind_0_$11, thread );
              }
              html_utilities.html_markup( html_macros.$html_form_tail$.getGlobalValue() );
              html_utilities.html_source_readability_terpri( UNPROVIDED );
              html_utilities.html_copyright_notice();
            }
            finally
            {
              html_macros.$html_safe_print$.rebind( _prev_bind_0_$9, thread );
            }
            html_utilities.html_markup( html_macros.$html_body_tail$.getGlobalValue() );
            html_utilities.html_source_readability_terpri( UNPROVIDED );
          }
          finally
          {
            html_macros.$html_inside_bodyP$.rebind( _prev_bind_0_$8, thread );
          }
          html_utilities.html_markup( html_macros.$html_html_tail$.getGlobalValue() );
        }
        finally
        {
          cyc_file_dependencies.$html_emitted_file_dependencies$.rebind( _prev_bind_0_$7, thread );
        }
        html_utilities.html_source_readability_terpri( UNPROVIDED );
      }
      finally
      {
        html_macros.$html_id_space_id_generator$.rebind( _prev_bind_0, thread );
      }
    }
    else
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list129 );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-viewpoint.lisp", position = 16628L)
  public static SubLObject cb_viewpoint_summary_handler(final SubLObject args)
  {
    cb_parameters.$cb_viewpoint_show_doc_preds$.setDynamicValue( makeBoolean( NIL != html_utilities.html_extract_input( $str122$always_show_comments, args ) ) );
    cb_parameters.$cb_viewpoint_show_book_preds$.setDynamicValue( makeBoolean( NIL != html_utilities.html_extract_input( $str124$always_show_bookkeeping, args ) ) );
    SubLObject cdolist_list_var = $cb_viewpoint_table$.getGlobalValue();
    SubLObject viewpoint = NIL;
    viewpoint = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      _csetf_viewpoint_active_p( viewpoint, makeBoolean( NIL != html_utilities.html_extract_input( PrintLow.format( NIL, $str78$activate__A, viewpoint_name( viewpoint ) ), args ) ) );
      cdolist_list_var = cdolist_list_var.rest();
      viewpoint = cdolist_list_var.first();
    }
    clear_viewpoint_cache();
    cb_utilities.cb_message_page_with_history( $str133$Summary_filters_have_been_changed, UNPROVIDED );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-viewpoint.lisp", position = 17201L)
  public static SubLObject cb_viewpoint_handler(final SubLObject args)
  {
    final SubLObject input = reader.read_from_string( args.first(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    final SubLObject summary_name = Strings.string( input.first() );
    final SubLObject index_spec = conses_high.cadr( input );
    SubLObject cdolist_list_var;
    final SubLObject viewpoints = cdolist_list_var = conses_high.assoc( Packages.intern( summary_name, UNPROVIDED ), $cb_viewpoint_summary_alist$.getGlobalValue(), UNPROVIDED, UNPROVIDED ).rest();
    SubLObject viewpoint = NIL;
    viewpoint = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL != viewpoint_value_update_fn( viewpoint ) )
      {
        Functions.funcall( viewpoint_value_update_fn( viewpoint ), viewpoint, args );
      }
      cdolist_list_var = cdolist_list_var.rest();
      viewpoint = cdolist_list_var.first();
    }
    clear_viewpoint_cache();
    cb_viewpoint( ConsesLow.list( index_spec ) );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-viewpoint.lisp", position = 17793L)
  public static SubLObject cb_link_viewpoint(final SubLObject index_hook, SubLObject linktext)
  {
    if( linktext == UNPROVIDED )
    {
      linktext = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == linktext )
    {
      linktext = $str136$_Viewpoint_;
    }
    final SubLObject frame_name_var = cb_utilities.cb_frame_name( $kw137$MAIN );
    html_utilities.html_markup( html_macros.$html_anchor_head$.getGlobalValue() );
    html_utilities.html_markup( html_macros.$html_anchor_href$.getGlobalValue() );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    cb_parameters.cyc_cgi_url_int();
    PrintLow.format( html_macros.$html_stream$.getDynamicValue( thread ), $str138$cb_viewpoint__A, cb_utilities.cb_index_identifier( index_hook ) );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    if( NIL != frame_name_var )
    {
      html_utilities.html_markup( html_macros.$html_anchor_target$.getGlobalValue() );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_utilities.html_markup( frame_name_var );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    }
    html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
    final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding( thread );
    try
    {
      html_macros.$html_safe_print$.bind( T, thread );
      html_utilities.html_princ( linktext );
    }
    finally
    {
      html_macros.$html_safe_print$.rebind( _prev_bind_0, thread );
    }
    html_utilities.html_markup( html_macros.$html_anchor_tail$.getGlobalValue() );
    return index_hook;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-viewpoint.lisp", position = 18056L)
  public static SubLObject common_prompt_prefix(final SubLObject viewpoint, final SubLObject index_hook)
  {
    html_utilities.html_hr( UNPROVIDED, UNPROVIDED );
    html_utilities.html_markup( html_macros.$html_strong_head$.getGlobalValue() );
    if( NIL != viewpoint_linkname_prefix( viewpoint ) )
    {
      html_utilities.html_princ( viewpoint_linkname_prefix( viewpoint ) );
    }
    html_utilities.html_princ( $str141$_ );
    cb_utilities.cb_form( viewpoint_linkable_name( viewpoint ), UNPROVIDED, UNPROVIDED );
    html_utilities.html_princ( $str142$_Filter );
    html_utilities.html_markup( html_macros.$html_strong_tail$.getGlobalValue() );
    html_utilities.html_newline( UNPROVIDED );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-viewpoint.lisp", position = 18468L)
  public static SubLObject prompt_for_list_of_cyclists(final SubLObject viewpoint, final SubLObject index_hook)
  {
    common_prompt_prefix( viewpoint, index_hook );
    html_utilities.html_indent( TWO_INTEGER );
    html_utilities.html_princ( $str143$_Only_those_terms_whose_ );
    cb_utilities.cb_form( viewpoint_linkable_name( viewpoint ), UNPROVIDED, UNPROVIDED );
    html_utilities.html_princ( $str144$_field_has_a_value_equal_to_a_ter );
    html_utilities.html_newline( UNPROVIDED );
    Functions.apply( Symbols.symbol_function( $sym145$CB_PROMPT_CYCLISTS ), ConsesLow.cons( viewpoint_name( viewpoint ), Functions.funcall( viewpoint_filter_getter( viewpoint ) ) ) );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-viewpoint.lisp", position = 18947L)
  public static SubLObject prompt_for_date(final SubLObject viewpoint, final SubLObject index_hook)
  {
    common_prompt_prefix( viewpoint, index_hook );
    html_utilities.html_markup( html_macros.$html_strong_head$.getGlobalValue() );
    html_utilities.html_princ( $str146$Activate_Filter );
    html_utilities.html_markup( html_macros.$html_strong_tail$.getGlobalValue() );
    html_utilities.html_newline( UNPROVIDED );
    html_utilities.html_indent( SIX_INTEGER );
    html_utilities.html_checkbox_input( PrintLow.format( NIL, $str147$all_dates__A, viewpoint_name( viewpoint ) ), $str148$no, viewpoint_active_p( viewpoint ), UNPROVIDED, UNPROVIDED, UNPROVIDED );
    html_utilities.html_indent( FOUR_INTEGER );
    cb_utilities.prompt_for_simple_date( Functions.funcall( viewpoint_filter_getter( viewpoint ) ), PrintLow.format( NIL, $str149$cb_show_start__A, viewpoint_name( viewpoint ) ) );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-viewpoint.lisp", position = 19432L)
  public static SubLObject prompt_for_mt(final SubLObject viewpoint, final SubLObject index_hook)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    common_prompt_prefix( viewpoint, index_hook );
    html_utilities.html_newline( UNPROVIDED );
    final SubLObject relevant_mts = kb_indexing.mts_of_indexed_term( index_hook );
    final SubLObject temp_list = conses_high.copy_list( relevant_mts );
    final SubLObject mts_list = kb_utilities.sort_terms( conses_high.union( temp_list, conses_high.copy_list( cb_mts_filter() ), UNPROVIDED, UNPROVIDED ), NIL, NIL, T, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    html_utilities.html_markup( html_macros.$html_table_head$.getGlobalValue() );
    html_utilities.html_markup( html_macros.$html_table_border$.getGlobalValue() );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    html_utilities.html_markup( ZERO_INTEGER );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    html_utilities.html_markup( html_macros.$html_table_cellpadding$.getGlobalValue() );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    html_utilities.html_markup( ZERO_INTEGER );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    html_utilities.html_markup( html_macros.$html_table_cellspacing$.getGlobalValue() );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    html_utilities.html_markup( ZERO_INTEGER );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
    final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding( thread );
    final SubLObject _prev_bind_2 = html_macros.$html_indent_table_max$.currentBinding( thread );
    try
    {
      html_macros.$html_safe_print$.bind( T, thread );
      html_macros.$html_indent_table_max$.bind( THREE_INTEGER, thread );
      SubLObject indent = ZERO_INTEGER;
      SubLObject span = Numbers.max( ONE_INTEGER, Numbers.subtract( html_macros.$html_indent_table_max$.getDynamicValue( thread ), indent ) );
      html_utilities.html_markup( html_macros.$html_table_row_head$.getGlobalValue() );
      html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
      final SubLObject _prev_bind_0_$12 = html_macros.$html_safe_print$.currentBinding( thread );
      try
      {
        html_macros.$html_safe_print$.bind( T, thread );
        html_utilities.html_indent_row_internal( indent );
        html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
        if( NIL != span )
        {
          html_utilities.html_markup( html_macros.$html_table_data_colspan$.getGlobalValue() );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_markup( span );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        }
        html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
        final SubLObject _prev_bind_0_$13 = html_macros.$html_safe_print$.currentBinding( thread );
        try
        {
          html_macros.$html_safe_print$.bind( T, thread );
          html_utilities.html_radio_input( $str150$all, $str151$yes, makeBoolean( NIL == active_filter_p( $sym152$MTS ) ), UNPROVIDED );
          html_utilities.html_indent( UNPROVIDED );
          html_utilities.html_markup( html_macros.$html_strong_head$.getGlobalValue() );
          html_utilities.html_princ( $str153$All_Mts );
          html_utilities.html_markup( html_macros.$html_strong_tail$.getGlobalValue() );
          html_utilities.html_newline( UNPROVIDED );
          html_utilities.html_radio_input( $str150$all, $str148$no, active_filter_p( $sym152$MTS ), UNPROVIDED );
          html_utilities.html_indent( UNPROVIDED );
          html_utilities.html_markup( html_macros.$html_strong_head$.getGlobalValue() );
          html_utilities.html_princ( $str154$Specify_Mts );
          html_utilities.html_markup( html_macros.$html_strong_tail$.getGlobalValue() );
        }
        finally
        {
          html_macros.$html_safe_print$.rebind( _prev_bind_0_$13, thread );
        }
        html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
      }
      finally
      {
        html_macros.$html_safe_print$.rebind( _prev_bind_0_$12, thread );
      }
      html_utilities.html_markup( html_macros.$html_table_row_tail$.getGlobalValue() );
      html_utilities.html_source_readability_terpri( UNPROVIDED );
      indent = ONE_INTEGER;
      span = Numbers.max( ONE_INTEGER, Numbers.subtract( html_macros.$html_indent_table_max$.getDynamicValue( thread ), indent ) );
      html_utilities.html_markup( html_macros.$html_table_row_head$.getGlobalValue() );
      html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
      final SubLObject _prev_bind_0_$14 = html_macros.$html_safe_print$.currentBinding( thread );
      try
      {
        html_macros.$html_safe_print$.bind( T, thread );
        html_utilities.html_indent_row_internal( indent );
        html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
        if( NIL != span )
        {
          html_utilities.html_markup( html_macros.$html_table_data_colspan$.getGlobalValue() );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_markup( span );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        }
        html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
        final SubLObject _prev_bind_0_$15 = html_macros.$html_safe_print$.currentBinding( thread );
        try
        {
          html_macros.$html_safe_print$.bind( T, thread );
          html_utilities.html_checkbox_input( $str155$use_genl_mt, $str151$yes, cb_parameters.cb_mts_filter_use_genlmt(), UNPROVIDED, UNPROVIDED, UNPROVIDED );
          html_utilities.html_indent( UNPROVIDED );
          html_utilities.html_markup( html_macros.$html_strong_head$.getGlobalValue() );
          html_utilities.html_princ( $str156$Include_All_Genl_Mts );
          html_utilities.html_markup( html_macros.$html_strong_tail$.getGlobalValue() );
          html_utilities.html_newline( UNPROVIDED );
          SubLObject cdolist_list_var = mts_list;
          SubLObject mt = NIL;
          mt = cdolist_list_var.first();
          while ( NIL != cdolist_list_var)
          {
            html_utilities.html_markup( html_macros.$html_no_break_head$.getGlobalValue() );
            html_utilities.html_checkbox_input( $str157$new_mt, mt, conses_high.member( mt, cb_mts_filter(), UNPROVIDED, UNPROVIDED ), UNPROVIDED, UNPROVIDED, UNPROVIDED );
            html_utilities.html_markup( html_macros.$html_no_break_tail$.getGlobalValue() );
            if( NIL != subl_promotions.memberP( mt, relevant_mts, UNPROVIDED, UNPROVIDED ) )
            {
              html_utilities.html_markup( html_macros.$html_strong_head$.getGlobalValue() );
              cb_utilities.cb_form( mt, UNPROVIDED, UNPROVIDED );
              html_utilities.html_markup( html_macros.$html_strong_tail$.getGlobalValue() );
            }
            else
            {
              cb_utilities.cb_form( mt, UNPROVIDED, UNPROVIDED );
            }
            html_utilities.html_indent( TWO_INTEGER );
            cdolist_list_var = cdolist_list_var.rest();
            mt = cdolist_list_var.first();
          }
        }
        finally
        {
          html_macros.$html_safe_print$.rebind( _prev_bind_0_$15, thread );
        }
        html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
      }
      finally
      {
        html_macros.$html_safe_print$.rebind( _prev_bind_0_$14, thread );
      }
      html_utilities.html_markup( html_macros.$html_table_row_tail$.getGlobalValue() );
      html_utilities.html_source_readability_terpri( UNPROVIDED );
      html_utilities.html_indent_table_internal( THREE_INTEGER );
    }
    finally
    {
      html_macros.$html_indent_table_max$.rebind( _prev_bind_2, thread );
      html_macros.$html_safe_print$.rebind( _prev_bind_0, thread );
    }
    html_utilities.html_markup( html_macros.$html_table_tail$.getGlobalValue() );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-viewpoint.lisp", position = 21622L)
  public static SubLObject prompt_for_cycbasedproject(final SubLObject viewpoint, final SubLObject index_hook)
  {
    common_prompt_prefix( viewpoint, index_hook );
    html_utilities.html_newline( UNPROVIDED );
    html_utilities.html_princ( $str143$_Only_those_terms_whose_ );
    cb_utilities.cb_form( viewpoint_linkable_name( viewpoint ), UNPROVIDED, UNPROVIDED );
    html_utilities.html_princ( $str144$_field_has_a_value_equal_to_a_ter );
    html_utilities.html_newline( UNPROVIDED );
    Functions.apply( Symbols.symbol_function( $sym158$CB_PROMPT_PROJECTS ), ConsesLow.cons( viewpoint_name( viewpoint ), Functions.funcall( viewpoint_filter_getter( viewpoint ) ) ) );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-viewpoint.lisp", position = 22099L)
  public static SubLObject receive_list_of_cyclists(final SubLObject viewpoint, final SubLObject args)
  {
    final SubLObject v_new = cb_get_cyclists( viewpoint_name( viewpoint ), args );
    Functions.funcall( viewpoint_filter_setter( viewpoint ), v_new );
    _csetf_viewpoint_active_p( viewpoint, makeBoolean( NIL != v_new ) );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-viewpoint.lisp", position = 22353L)
  public static SubLObject receive_list_of_projects(final SubLObject viewpoint, final SubLObject args)
  {
    final SubLObject v_new = cb_get_projects( viewpoint_name( viewpoint ), args );
    Functions.funcall( viewpoint_filter_setter( viewpoint ), v_new );
    _csetf_viewpoint_active_p( viewpoint, makeBoolean( NIL != v_new ) );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-viewpoint.lisp", position = 22609L)
  public static SubLObject receive_date(final SubLObject viewpoint, final SubLObject args)
  {
    final SubLObject all_datesP = html_utilities.html_extract_input( PrintLow.format( NIL, $str147$all_dates__A, viewpoint_name( viewpoint ) ), args );
    if( all_datesP.equal( $str148$no ) )
    {
      _csetf_viewpoint_active_p( viewpoint, T );
      Functions.funcall( viewpoint_filter_setter( viewpoint ), cb_utilities.read_args_for_simple_date( PrintLow.format( NIL, $str149$cb_show_start__A, viewpoint_name( viewpoint ) ), args ) );
    }
    else
    {
      _csetf_viewpoint_active_p( viewpoint, NIL );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-viewpoint.lisp", position = 23138L)
  public static SubLObject receive_mt(final SubLObject viewpoint, final SubLObject args)
  {
    final SubLObject selected_allP = html_utilities.html_extract_input( $str150$all, args );
    final SubLObject selected_use_genlsP = html_utilities.html_extract_input( $str155$use_genl_mt, args );
    final SubLObject selections = html_utilities.html_extract_input_values( $str157$new_mt, args );
    if( NIL != selected_use_genlsP )
    {
      cb_parameters.set_cb_mts_filter_use_genlmt( T );
    }
    else
    {
      cb_parameters.set_cb_mts_filter_use_genlmt( NIL );
    }
    if( selected_allP.equal( $str151$yes ) )
    {
      _csetf_viewpoint_active_p( viewpoint, NIL );
      Functions.funcall( viewpoint_filter_setter( viewpoint ), NIL );
    }
    else
    {
      _csetf_viewpoint_active_p( viewpoint, T );
      Functions.funcall( viewpoint_filter_setter( viewpoint ), NIL );
      SubLObject cdolist_list_var = selections;
      SubLObject new_mt = NIL;
      new_mt = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        Functions.funcall( viewpoint_filter_setter( viewpoint ), ConsesLow.cons( cb_utilities.cb_guess_fort( new_mt, UNPROVIDED ), Functions.funcall( viewpoint_filter_getter( viewpoint ) ) ) );
        cdolist_list_var = cdolist_list_var.rest();
        new_mt = cdolist_list_var.first();
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-viewpoint.lisp", position = 24133L)
  public static SubLObject cb_set_microtheory_browsing_filter_viewpoint(final SubLObject mt)
  {
    final SubLObject viewpoint = find_viewpoint( $sym152$MTS );
    if( NIL != kb_utilities.kbeq( mt, $const159$EverythingPSC ) )
    {
      _csetf_viewpoint_active_p( viewpoint, NIL );
      cb_parameters.set_cb_mts_filter_use_genlmt( NIL );
      Functions.funcall( viewpoint_filter_setter( viewpoint ), NIL );
    }
    else
    {
      _csetf_viewpoint_active_p( viewpoint, T );
      cb_parameters.set_cb_mts_filter_use_genlmt( T );
      Functions.funcall( viewpoint_filter_setter( viewpoint ), ConsesLow.list( mt ) );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-viewpoint.lisp", position = 24700L)
  public static SubLObject assertion_before_date(final SubLObject assertion)
  {
    return makeBoolean( NIL != doc_predicate_p( assertion ) || NIL == assertions_high.asserted_when( assertion ) || assertions_high.asserted_when( assertion ).numLE( cb_assertion_end_date_filter() ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-viewpoint.lisp", position = 24915L)
  public static SubLObject assertion_after_date(final SubLObject assertion)
  {
    return makeBoolean( NIL != doc_predicate_p( assertion ) || NIL == assertions_high.asserted_when( assertion ) || cb_assertion_start_date_filter().numLE( assertions_high.asserted_when( assertion ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-viewpoint.lisp", position = 25151L)
  public static SubLObject cb_use_mycreator_filter()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return $cb_use_mycreator_filter$.getDynamicValue( thread );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-viewpoint.lisp", position = 25151L)
  public static SubLObject set_cb_use_mycreator_filter(final SubLObject new_value)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    $cb_use_mycreator_filter$.setDynamicValue( new_value, thread );
    return $cb_use_mycreator_filter$.getDynamicValue( thread );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-viewpoint.lisp", position = 25151L)
  public static SubLObject cb_mycreator_filter()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return $cb_mycreator_filter$.getDynamicValue( thread );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-viewpoint.lisp", position = 25151L)
  public static SubLObject set_cb_mycreator_filter(final SubLObject new_value)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    $cb_mycreator_filter$.setDynamicValue( new_value, thread );
    return $cb_mycreator_filter$.getDynamicValue( thread );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-viewpoint.lisp", position = 25151L)
  public static SubLObject mycreator_effective_fn(final SubLObject assertion)
  {
    if( NIL == assertion_handles.assertion_p( assertion ) )
    {
      Errors.sublisp_break( $str167$not_an_assertion, EMPTY_SUBL_OBJECT_ARRAY );
    }
    if( NIL != doc_predicate_p( assertion ) )
    {
      return T;
    }
    final SubLObject viewpoint = find_viewpoint( $sym162$MYCREATOR );
    return conses_high.member( Functions.funcall( viewpoint_effective_fn_slotname( viewpoint ), assertion ), Functions.funcall( viewpoint_filter_getter( viewpoint ) ), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-viewpoint.lisp", position = 25374L)
  public static SubLObject cb_use_myreviewer_filter()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return $cb_use_myreviewer_filter$.getDynamicValue( thread );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-viewpoint.lisp", position = 25374L)
  public static SubLObject set_cb_use_myreviewer_filter(final SubLObject new_value)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    $cb_use_myreviewer_filter$.setDynamicValue( new_value, thread );
    return $cb_use_myreviewer_filter$.getDynamicValue( thread );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-viewpoint.lisp", position = 25374L)
  public static SubLObject cb_myreviewer_filter()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return $cb_myreviewer_filter$.getDynamicValue( thread );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-viewpoint.lisp", position = 25374L)
  public static SubLObject set_cb_myreviewer_filter(final SubLObject new_value)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    $cb_myreviewer_filter$.setDynamicValue( new_value, thread );
    return $cb_myreviewer_filter$.getDynamicValue( thread );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-viewpoint.lisp", position = 25374L)
  public static SubLObject myreviewer_effective_fn(final SubLObject assertion)
  {
    if( NIL == assertion_handles.assertion_p( assertion ) )
    {
      Errors.sublisp_break( $str167$not_an_assertion, EMPTY_SUBL_OBJECT_ARRAY );
    }
    if( NIL != doc_predicate_p( assertion ) )
    {
      return T;
    }
    final SubLObject viewpoint = find_viewpoint( $sym170$MYREVIEWER );
    return conses_high.member( Functions.funcall( viewpoint_effective_fn_slotname( viewpoint ), assertion ), Functions.funcall( viewpoint_filter_getter( viewpoint ) ), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-viewpoint.lisp", position = 25616L)
  public static SubLObject cb_use_assertion_start_date_filter()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return $cb_use_assertion_start_date_filter$.getDynamicValue( thread );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-viewpoint.lisp", position = 25616L)
  public static SubLObject set_cb_use_assertion_start_date_filter(final SubLObject new_value)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    $cb_use_assertion_start_date_filter$.setDynamicValue( new_value, thread );
    return $cb_use_assertion_start_date_filter$.getDynamicValue( thread );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-viewpoint.lisp", position = 25616L)
  public static SubLObject cb_assertion_start_date_filter()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return $cb_assertion_start_date_filter$.getDynamicValue( thread );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-viewpoint.lisp", position = 25616L)
  public static SubLObject set_cb_assertion_start_date_filter(final SubLObject new_value)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    $cb_assertion_start_date_filter$.setDynamicValue( new_value, thread );
    return $cb_assertion_start_date_filter$.getDynamicValue( thread );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-viewpoint.lisp", position = 25912L)
  public static SubLObject cb_use_assertion_end_date_filter()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return $cb_use_assertion_end_date_filter$.getDynamicValue( thread );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-viewpoint.lisp", position = 25912L)
  public static SubLObject set_cb_use_assertion_end_date_filter(final SubLObject new_value)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    $cb_use_assertion_end_date_filter$.setDynamicValue( new_value, thread );
    return $cb_use_assertion_end_date_filter$.getDynamicValue( thread );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-viewpoint.lisp", position = 25912L)
  public static SubLObject cb_assertion_end_date_filter()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return $cb_assertion_end_date_filter$.getDynamicValue( thread );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-viewpoint.lisp", position = 25912L)
  public static SubLObject set_cb_assertion_end_date_filter(final SubLObject new_value)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    $cb_assertion_end_date_filter$.setDynamicValue( new_value, thread );
    return $cb_assertion_end_date_filter$.getDynamicValue( thread );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-viewpoint.lisp", position = 26208L)
  public static SubLObject cb_use_mts_filter()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return $cb_use_mts_filter$.getDynamicValue( thread );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-viewpoint.lisp", position = 26208L)
  public static SubLObject set_cb_use_mts_filter(final SubLObject new_value)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    $cb_use_mts_filter$.setDynamicValue( new_value, thread );
    return $cb_use_mts_filter$.getDynamicValue( thread );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-viewpoint.lisp", position = 26208L)
  public static SubLObject cb_mts_filter()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return $cb_mts_filter$.getDynamicValue( thread );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-viewpoint.lisp", position = 26208L)
  public static SubLObject set_cb_mts_filter(final SubLObject new_value)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    $cb_mts_filter$.setDynamicValue( new_value, thread );
    return $cb_mts_filter$.getDynamicValue( thread );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-viewpoint.lisp", position = 26439L)
  public static SubLObject cb_use_mycreationpurpose_filter()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return $cb_use_mycreationpurpose_filter$.getDynamicValue( thread );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-viewpoint.lisp", position = 26439L)
  public static SubLObject set_cb_use_mycreationpurpose_filter(final SubLObject new_value)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    $cb_use_mycreationpurpose_filter$.setDynamicValue( new_value, thread );
    return $cb_use_mycreationpurpose_filter$.getDynamicValue( thread );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-viewpoint.lisp", position = 26439L)
  public static SubLObject cb_mycreationpurpose_filter()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return $cb_mycreationpurpose_filter$.getDynamicValue( thread );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-viewpoint.lisp", position = 26439L)
  public static SubLObject set_cb_mycreationpurpose_filter(final SubLObject new_value)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    $cb_mycreationpurpose_filter$.setDynamicValue( new_value, thread );
    return $cb_mycreationpurpose_filter$.getDynamicValue( thread );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-viewpoint.lisp", position = 26439L)
  public static SubLObject mycreationpurpose_effective_fn(final SubLObject assertion)
  {
    if( NIL == assertion_handles.assertion_p( assertion ) )
    {
      Errors.sublisp_break( $str167$not_an_assertion, EMPTY_SUBL_OBJECT_ARRAY );
    }
    if( NIL != doc_predicate_p( assertion ) )
    {
      return T;
    }
    final SubLObject viewpoint = find_viewpoint( $sym194$MYCREATIONPURPOSE );
    return conses_high.member( Functions.funcall( viewpoint_effective_fn_slotname( viewpoint ), assertion ), Functions.funcall( viewpoint_filter_getter( viewpoint ) ), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-viewpoint.lisp", position = 26689L)
  public static SubLObject cb_calc_filter_hooks()
  {
    final SubLObject active = active_filters( UNPROVIDED );
    if( NIL == active )
    {
      return NIL;
    }
    if( NIL != conses_high.endp( active.rest() ) )
    {
      return viewpoint_effective_fn( active.first() );
    }
    return $sym199$CB_ONLINE_FILTER_HOOKS;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-viewpoint.lisp", position = 27090L)
  public static SubLObject cb_online_filter_hooks(final SubLObject assertion)
  {
    SubLObject cdolist_list_var;
    final SubLObject active = cdolist_list_var = active_filters( UNPROVIDED );
    SubLObject filter = NIL;
    filter = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL == Functions.funcall( viewpoint_effective_fn( filter ), assertion ) )
      {
        return NIL;
      }
      cdolist_list_var = cdolist_list_var.rest();
      filter = cdolist_list_var.first();
    }
    return T;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-viewpoint.lisp", position = 27383L)
  public static SubLObject with_assertion_filters(final SubLObject macroform, final SubLObject environment)
  {
    final SubLObject datum = macroform.rest();
    final SubLObject body;
    final SubLObject current = body = datum;
    return ConsesLow.list( $sym73$CLET, $list200, reader.bq_cons( $sym63$PROGN, ConsesLow.append( body, NIL ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-viewpoint.lisp", position = 27523L)
  public static SubLObject find_relevant_key(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject answer_list = NIL;
    SubLObject mt_getter = NIL;
    SubLObject getter = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list201 );
    answer_list = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list201 );
    mt_getter = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list201 );
    getter = current.first();
    current = current.rest();
    SubLObject allow_other_keys_p = NIL;
    SubLObject rest = current;
    SubLObject bad = NIL;
    SubLObject current_$16 = NIL;
    while ( NIL != rest)
    {
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list201 );
      current_$16 = rest.first();
      rest = rest.rest();
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list201 );
      if( NIL == conses_high.member( current_$16, $list202, UNPROVIDED, UNPROVIDED ) )
      {
        bad = T;
      }
      if( current_$16 == $kw203$ALLOW_OTHER_KEYS )
      {
        allow_other_keys_p = rest.first();
      }
      rest = rest.rest();
    }
    if( NIL != bad && NIL == allow_other_keys_p )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list201 );
    }
    final SubLObject specified_mt_tail = cdestructuring_bind.property_list_member( $kw204$SPECIFIED_MT, current );
    final SubLObject specified_mt = ( NIL != specified_mt_tail ) ? conses_high.cadr( specified_mt_tail ) : NIL;
    return ConsesLow.list( $sym205$WITH_ASSERTION_FILTERS, ConsesLow.list( $sym206$PCOND, ConsesLow.list( ConsesLow.list( $sym207$CAND, $list208, ConsesLow.list( $sym209$CNOT, specified_mt ) ), ConsesLow.list(
        $sym210$PIF, $list211, ConsesLow.list( $sym212$WITH_MT_LIST_AND_GENL_MTS, $list213, ConsesLow.list( $sym214$CSETQ, answer_list, mt_getter ) ), ConsesLow.list( $sym215$WITH_MT_LIST, $list213, ConsesLow.list(
            $sym214$CSETQ, answer_list, mt_getter ) ) ) ), ConsesLow.list( T, ConsesLow.list( $sym214$CSETQ, answer_list, getter ) ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-viewpoint.lisp", position = 28127L)
  public static SubLObject count_relevant(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject filtered = NIL;
    SubLObject unfiltered = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list216 );
    filtered = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list216 );
    unfiltered = current.first();
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject result = $sym217$RESULT;
      return ConsesLow.list( $sym73$CLET, ConsesLow.list( result ), ConsesLow.list( $sym205$WITH_ASSERTION_FILTERS, ConsesLow.list( $sym210$PIF, $list208, ConsesLow.list( $sym214$CSETQ, result, filtered ), ConsesLow
          .list( $sym214$CSETQ, result, unfiltered ) ) ), ConsesLow.list( $sym218$RET, result ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list216 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-viewpoint.lisp", position = 28442L)
  public static SubLObject cb_link_edit_viewpoint(final SubLObject viewpoint, SubLObject linktext, SubLObject index_hook)
  {
    if( linktext == UNPROVIDED )
    {
      linktext = NIL;
    }
    if( index_hook == UNPROVIDED )
    {
      index_hook = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == linktext )
    {
      linktext = viewpoint_name( viewpoint );
    }
    SubLObject handler = $str219$cb_ev;
    final SubLObject frame = cb_parameters.$cb_default_term_frame$.getDynamicValue( thread );
    if( frame == $kw220$TOP )
    {
      handler = $str221$cb_start_cb_ev;
    }
    final SubLObject frame_name_var = cb_utilities.cb_frame_name( frame );
    html_utilities.html_markup( html_macros.$html_anchor_head$.getGlobalValue() );
    html_utilities.html_markup( html_macros.$html_anchor_href$.getGlobalValue() );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    cb_parameters.cyc_cgi_url_int();
    if( NIL != index_hook )
    {
      PrintLow.format( html_macros.$html_stream$.getDynamicValue( thread ), $str222$_a__a__a, new SubLObject[] { handler, viewpoint_summary_name( viewpoint ), index_hook
      } );
    }
    else
    {
      PrintLow.format( html_macros.$html_stream$.getDynamicValue( thread ), $str223$_a__a, handler, viewpoint_summary_name( viewpoint ) );
    }
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    if( NIL != frame_name_var )
    {
      html_utilities.html_markup( html_macros.$html_anchor_target$.getGlobalValue() );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_utilities.html_markup( frame_name_var );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    }
    html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
    final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding( thread );
    try
    {
      html_macros.$html_safe_print$.bind( T, thread );
      html_utilities.html_princ( linktext );
    }
    finally
    {
      html_macros.$html_safe_print$.rebind( _prev_bind_0, thread );
    }
    html_utilities.html_markup( html_macros.$html_anchor_tail$.getGlobalValue() );
    return viewpoint;
  }

  public static SubLObject declare_cb_viewpoint_file()
  {
    SubLFiles.declareFunction( me, "print_viewpoint", "PRINT-VIEWPOINT", 3, 0, false );
    SubLFiles.declareFunction( me, "viewpoint_print_function_trampoline", "VIEWPOINT-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false );
    SubLFiles.declareFunction( me, "viewpoint_p", "VIEWPOINT-P", 1, 0, false );
    new $viewpoint_p$UnaryFunction();
    SubLFiles.declareFunction( me, "viewpoint_name", "VIEWPOINT-NAME", 1, 0, false );
    SubLFiles.declareFunction( me, "viewpoint_summary_name", "VIEWPOINT-SUMMARY-NAME", 1, 0, false );
    SubLFiles.declareFunction( me, "viewpoint_linkable_name", "VIEWPOINT-LINKABLE-NAME", 1, 0, false );
    SubLFiles.declareFunction( me, "viewpoint_linkname_prefix", "VIEWPOINT-LINKNAME-PREFIX", 1, 0, false );
    SubLFiles.declareFunction( me, "viewpoint_filter_getter", "VIEWPOINT-FILTER-GETTER", 1, 0, false );
    SubLFiles.declareFunction( me, "viewpoint_filter_setter", "VIEWPOINT-FILTER-SETTER", 1, 0, false );
    SubLFiles.declareFunction( me, "viewpoint_type", "VIEWPOINT-TYPE", 1, 0, false );
    SubLFiles.declareFunction( me, "viewpoint_active_p", "VIEWPOINT-ACTIVE-P", 1, 0, false );
    SubLFiles.declareFunction( me, "viewpoint_effective_fn", "VIEWPOINT-EFFECTIVE-FN", 1, 0, false );
    SubLFiles.declareFunction( me, "viewpoint_value_prompt_fn", "VIEWPOINT-VALUE-PROMPT-FN", 1, 0, false );
    SubLFiles.declareFunction( me, "viewpoint_value_update_fn", "VIEWPOINT-VALUE-UPDATE-FN", 1, 0, false );
    SubLFiles.declareFunction( me, "viewpoint_initial_filter_value", "VIEWPOINT-INITIAL-FILTER-VALUE", 1, 0, false );
    SubLFiles.declareFunction( me, "viewpoint_effective_fn_slotname", "VIEWPOINT-EFFECTIVE-FN-SLOTNAME", 1, 0, false );
    SubLFiles.declareFunction( me, "_csetf_viewpoint_name", "_CSETF-VIEWPOINT-NAME", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_viewpoint_summary_name", "_CSETF-VIEWPOINT-SUMMARY-NAME", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_viewpoint_linkable_name", "_CSETF-VIEWPOINT-LINKABLE-NAME", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_viewpoint_linkname_prefix", "_CSETF-VIEWPOINT-LINKNAME-PREFIX", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_viewpoint_filter_getter", "_CSETF-VIEWPOINT-FILTER-GETTER", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_viewpoint_filter_setter", "_CSETF-VIEWPOINT-FILTER-SETTER", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_viewpoint_type", "_CSETF-VIEWPOINT-TYPE", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_viewpoint_active_p", "_CSETF-VIEWPOINT-ACTIVE-P", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_viewpoint_effective_fn", "_CSETF-VIEWPOINT-EFFECTIVE-FN", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_viewpoint_value_prompt_fn", "_CSETF-VIEWPOINT-VALUE-PROMPT-FN", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_viewpoint_value_update_fn", "_CSETF-VIEWPOINT-VALUE-UPDATE-FN", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_viewpoint_initial_filter_value", "_CSETF-VIEWPOINT-INITIAL-FILTER-VALUE", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_viewpoint_effective_fn_slotname", "_CSETF-VIEWPOINT-EFFECTIVE-FN-SLOTNAME", 2, 0, false );
    SubLFiles.declareFunction( me, "make_viewpoint", "MAKE-VIEWPOINT", 0, 1, false );
    SubLFiles.declareFunction( me, "visit_defstruct_viewpoint", "VISIT-DEFSTRUCT-VIEWPOINT", 2, 0, false );
    SubLFiles.declareFunction( me, "visit_defstruct_object_viewpoint_method", "VISIT-DEFSTRUCT-OBJECT-VIEWPOINT-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "find_viewpoint", "FIND-VIEWPOINT", 1, 0, false );
    SubLFiles.declareFunction( me, "active_filter_p", "ACTIVE-FILTER-P", 1, 0, false );
    SubLFiles.declareFunction( me, "active_viewpoint_struct_p", "ACTIVE-VIEWPOINT-STRUCT-P", 1, 1, false );
    SubLFiles.declareFunction( me, "clear_viewpoint_cache", "CLEAR-VIEWPOINT-CACHE", 0, 0, false );
    SubLFiles.declareFunction( me, "active_filters", "ACTIVE-FILTERS", 0, 1, false );
    SubLFiles.declareFunction( me, "enable_filter", "ENABLE-FILTER", 1, 1, false );
    SubLFiles.declareFunction( me, "doc_predicate_p", "DOC-PREDICATE-P", 1, 0, false );
    SubLFiles.declareMacro( me, "defviewpoint", "DEFVIEWPOINT" );
    SubLFiles.declareFunction( me, "defviewpoint_internal", "DEFVIEWPOINT-INTERNAL", 5, 0, false );
    SubLFiles.declareFunction( me, "display_viewpoint", "DISPLAY-VIEWPOINT", 1, 1, false );
    SubLFiles.declareFunction( me, "cb_display_viewpoint_filters", "CB-DISPLAY-VIEWPOINT-FILTERS", 0, 0, false );
    SubLFiles.declareFunction( me, "prompt_with_completion", "PROMPT-WITH-COMPLETION", 4, 0, false );
    SubLFiles.declareFunction( me, "cb_prompt_cyclists", "CB-PROMPT-CYCLISTS", 1, 3, false );
    SubLFiles.declareFunction( me, "extract_fort_input", "EXTRACT-FORT-INPUT", 3, 0, false );
    SubLFiles.declareFunction( me, "cb_get_cyclists", "CB-GET-CYCLISTS", 2, 0, false );
    SubLFiles.declareFunction( me, "cb_prompt_projects", "CB-PROMPT-PROJECTS", 1, 3, false );
    SubLFiles.declareFunction( me, "cb_get_projects", "CB-GET-PROJECTS", 2, 0, false );
    SubLFiles.declareFunction( me, "display_viewpoint_1", "DISPLAY-VIEWPOINT-1", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_viewpoint", "CB-VIEWPOINT", 0, 1, false );
    SubLFiles.declareFunction( me, "cb_ev", "CB-EV", 0, 1, false );
    SubLFiles.declareFunction( me, "cb_viewpoint_summary_handler", "CB-VIEWPOINT-SUMMARY-HANDLER", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_viewpoint_handler", "CB-VIEWPOINT-HANDLER", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_link_viewpoint", "CB-LINK-VIEWPOINT", 1, 1, false );
    SubLFiles.declareFunction( me, "common_prompt_prefix", "COMMON-PROMPT-PREFIX", 2, 0, false );
    SubLFiles.declareFunction( me, "prompt_for_list_of_cyclists", "PROMPT-FOR-LIST-OF-CYCLISTS", 2, 0, false );
    SubLFiles.declareFunction( me, "prompt_for_date", "PROMPT-FOR-DATE", 2, 0, false );
    SubLFiles.declareFunction( me, "prompt_for_mt", "PROMPT-FOR-MT", 2, 0, false );
    SubLFiles.declareFunction( me, "prompt_for_cycbasedproject", "PROMPT-FOR-CYCBASEDPROJECT", 2, 0, false );
    SubLFiles.declareFunction( me, "receive_list_of_cyclists", "RECEIVE-LIST-OF-CYCLISTS", 2, 0, false );
    SubLFiles.declareFunction( me, "receive_list_of_projects", "RECEIVE-LIST-OF-PROJECTS", 2, 0, false );
    SubLFiles.declareFunction( me, "receive_date", "RECEIVE-DATE", 2, 0, false );
    SubLFiles.declareFunction( me, "receive_mt", "RECEIVE-MT", 2, 0, false );
    SubLFiles.declareFunction( me, "cb_set_microtheory_browsing_filter_viewpoint", "CB-SET-MICROTHEORY-BROWSING-FILTER-VIEWPOINT", 1, 0, false );
    SubLFiles.declareFunction( me, "assertion_before_date", "ASSERTION-BEFORE-DATE", 1, 0, false );
    SubLFiles.declareFunction( me, "assertion_after_date", "ASSERTION-AFTER-DATE", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_use_mycreator_filter", "CB-USE-MYCREATOR-FILTER", 0, 0, false );
    SubLFiles.declareFunction( me, "set_cb_use_mycreator_filter", "SET-CB-USE-MYCREATOR-FILTER", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_mycreator_filter", "CB-MYCREATOR-FILTER", 0, 0, false );
    SubLFiles.declareFunction( me, "set_cb_mycreator_filter", "SET-CB-MYCREATOR-FILTER", 1, 0, false );
    SubLFiles.declareFunction( me, "mycreator_effective_fn", "MYCREATOR-EFFECTIVE-FN", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_use_myreviewer_filter", "CB-USE-MYREVIEWER-FILTER", 0, 0, false );
    SubLFiles.declareFunction( me, "set_cb_use_myreviewer_filter", "SET-CB-USE-MYREVIEWER-FILTER", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_myreviewer_filter", "CB-MYREVIEWER-FILTER", 0, 0, false );
    SubLFiles.declareFunction( me, "set_cb_myreviewer_filter", "SET-CB-MYREVIEWER-FILTER", 1, 0, false );
    SubLFiles.declareFunction( me, "myreviewer_effective_fn", "MYREVIEWER-EFFECTIVE-FN", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_use_assertion_start_date_filter", "CB-USE-ASSERTION-START-DATE-FILTER", 0, 0, false );
    SubLFiles.declareFunction( me, "set_cb_use_assertion_start_date_filter", "SET-CB-USE-ASSERTION-START-DATE-FILTER", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_assertion_start_date_filter", "CB-ASSERTION-START-DATE-FILTER", 0, 0, false );
    SubLFiles.declareFunction( me, "set_cb_assertion_start_date_filter", "SET-CB-ASSERTION-START-DATE-FILTER", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_use_assertion_end_date_filter", "CB-USE-ASSERTION-END-DATE-FILTER", 0, 0, false );
    SubLFiles.declareFunction( me, "set_cb_use_assertion_end_date_filter", "SET-CB-USE-ASSERTION-END-DATE-FILTER", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_assertion_end_date_filter", "CB-ASSERTION-END-DATE-FILTER", 0, 0, false );
    SubLFiles.declareFunction( me, "set_cb_assertion_end_date_filter", "SET-CB-ASSERTION-END-DATE-FILTER", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_use_mts_filter", "CB-USE-MTS-FILTER", 0, 0, false );
    SubLFiles.declareFunction( me, "set_cb_use_mts_filter", "SET-CB-USE-MTS-FILTER", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_mts_filter", "CB-MTS-FILTER", 0, 0, false );
    SubLFiles.declareFunction( me, "set_cb_mts_filter", "SET-CB-MTS-FILTER", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_use_mycreationpurpose_filter", "CB-USE-MYCREATIONPURPOSE-FILTER", 0, 0, false );
    SubLFiles.declareFunction( me, "set_cb_use_mycreationpurpose_filter", "SET-CB-USE-MYCREATIONPURPOSE-FILTER", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_mycreationpurpose_filter", "CB-MYCREATIONPURPOSE-FILTER", 0, 0, false );
    SubLFiles.declareFunction( me, "set_cb_mycreationpurpose_filter", "SET-CB-MYCREATIONPURPOSE-FILTER", 1, 0, false );
    SubLFiles.declareFunction( me, "mycreationpurpose_effective_fn", "MYCREATIONPURPOSE-EFFECTIVE-FN", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_calc_filter_hooks", "CB-CALC-FILTER-HOOKS", 0, 0, false );
    SubLFiles.declareFunction( me, "cb_online_filter_hooks", "CB-ONLINE-FILTER-HOOKS", 1, 0, false );
    SubLFiles.declareMacro( me, "with_assertion_filters", "WITH-ASSERTION-FILTERS" );
    SubLFiles.declareMacro( me, "find_relevant_key", "FIND-RELEVANT-KEY" );
    SubLFiles.declareMacro( me, "count_relevant", "COUNT-RELEVANT" );
    SubLFiles.declareFunction( me, "cb_link_edit_viewpoint", "CB-LINK-EDIT-VIEWPOINT", 1, 2, false );
    return NIL;
  }

  public static SubLObject init_cb_viewpoint_file()
  {
    $viewpoint_type$ = SubLFiles.defparameter( "*VIEWPOINT-TYPE*", NIL );
    $dtp_viewpoint$ = SubLFiles.defconstant( "*DTP-VIEWPOINT*", $sym1$VIEWPOINT );
    $cb_viewpoint_table$ = SubLFiles.deflexical( "*CB-VIEWPOINT-TABLE*", ( maybeDefault( $sym55$_CB_VIEWPOINT_TABLE_, $cb_viewpoint_table$, NIL ) ) );
    $cb_viewpoint_summary_alist$ = SubLFiles.deflexical( "*CB-VIEWPOINT-SUMMARY-ALIST*", ( maybeDefault( $sym56$_CB_VIEWPOINT_SUMMARY_ALIST_, $cb_viewpoint_summary_alist$, NIL ) ) );
    $index_hook$ = SubLFiles.defparameter( "*INDEX-HOOK*", NIL );
    $viewpoint_cache$ = SubLFiles.deflexical( "*VIEWPOINT-CACHE*", NIL );
    $dash_nil$ = SubLFiles.deflexical( "*DASH-NIL*", $str93$________ );
    $cb_use_mycreator_filter$ = SubLFiles.defparameter( "*CB-USE-MYCREATOR-FILTER*", NIL );
    $cb_mycreator_filter$ = SubLFiles.defparameter( "*CB-MYCREATOR-FILTER*", NIL );
    $cb_use_myreviewer_filter$ = SubLFiles.defparameter( "*CB-USE-MYREVIEWER-FILTER*", NIL );
    $cb_myreviewer_filter$ = SubLFiles.defparameter( "*CB-MYREVIEWER-FILTER*", NIL );
    $cb_use_assertion_start_date_filter$ = SubLFiles.defparameter( "*CB-USE-ASSERTION-START-DATE-FILTER*", NIL );
    $cb_assertion_start_date_filter$ = SubLFiles.defparameter( "*CB-ASSERTION-START-DATE-FILTER*", NIL );
    $cb_use_assertion_end_date_filter$ = SubLFiles.defparameter( "*CB-USE-ASSERTION-END-DATE-FILTER*", NIL );
    $cb_assertion_end_date_filter$ = SubLFiles.defparameter( "*CB-ASSERTION-END-DATE-FILTER*", NIL );
    $cb_use_mts_filter$ = SubLFiles.defparameter( "*CB-USE-MTS-FILTER*", NIL );
    $cb_mts_filter$ = SubLFiles.defparameter( "*CB-MTS-FILTER*", NIL );
    $cb_use_mycreationpurpose_filter$ = SubLFiles.defparameter( "*CB-USE-MYCREATIONPURPOSE-FILTER*", NIL );
    $cb_mycreationpurpose_filter$ = SubLFiles.defparameter( "*CB-MYCREATIONPURPOSE-FILTER*", NIL );
    return NIL;
  }

  public static SubLObject setup_cb_viewpoint_file()
  {
    Structures.register_method( print_high.$print_object_method_table$.getGlobalValue(), $dtp_viewpoint$.getGlobalValue(), Symbols.symbol_function( $sym8$VIEWPOINT_PRINT_FUNCTION_TRAMPOLINE ) );
    SubLSpecialOperatorDeclarations.proclaim( $list9 );
    Structures.def_csetf( $sym10$VIEWPOINT_NAME, $sym11$_CSETF_VIEWPOINT_NAME );
    Structures.def_csetf( $sym12$VIEWPOINT_SUMMARY_NAME, $sym13$_CSETF_VIEWPOINT_SUMMARY_NAME );
    Structures.def_csetf( $sym14$VIEWPOINT_LINKABLE_NAME, $sym15$_CSETF_VIEWPOINT_LINKABLE_NAME );
    Structures.def_csetf( $sym16$VIEWPOINT_LINKNAME_PREFIX, $sym17$_CSETF_VIEWPOINT_LINKNAME_PREFIX );
    Structures.def_csetf( $sym18$VIEWPOINT_FILTER_GETTER, $sym19$_CSETF_VIEWPOINT_FILTER_GETTER );
    Structures.def_csetf( $sym20$VIEWPOINT_FILTER_SETTER, $sym21$_CSETF_VIEWPOINT_FILTER_SETTER );
    Structures.def_csetf( $sym22$VIEWPOINT_TYPE, $sym23$_CSETF_VIEWPOINT_TYPE );
    Structures.def_csetf( $sym24$VIEWPOINT_ACTIVE_P, $sym25$_CSETF_VIEWPOINT_ACTIVE_P );
    Structures.def_csetf( $sym26$VIEWPOINT_EFFECTIVE_FN, $sym27$_CSETF_VIEWPOINT_EFFECTIVE_FN );
    Structures.def_csetf( $sym28$VIEWPOINT_VALUE_PROMPT_FN, $sym29$_CSETF_VIEWPOINT_VALUE_PROMPT_FN );
    Structures.def_csetf( $sym30$VIEWPOINT_VALUE_UPDATE_FN, $sym31$_CSETF_VIEWPOINT_VALUE_UPDATE_FN );
    Structures.def_csetf( $sym32$VIEWPOINT_INITIAL_FILTER_VALUE, $sym33$_CSETF_VIEWPOINT_INITIAL_FILTER_VALUE );
    Structures.def_csetf( $sym34$VIEWPOINT_EFFECTIVE_FN_SLOTNAME, $sym35$_CSETF_VIEWPOINT_EFFECTIVE_FN_SLOTNAME );
    Equality.identity( $sym1$VIEWPOINT );
    Structures.register_method( visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_viewpoint$.getGlobalValue(), Symbols.symbol_function( $sym54$VISIT_DEFSTRUCT_OBJECT_VIEWPOINT_METHOD ) );
    subl_macro_promotions.declare_defglobal( $sym55$_CB_VIEWPOINT_TABLE_ );
    subl_macro_promotions.declare_defglobal( $sym56$_CB_VIEWPOINT_SUMMARY_ALIST_ );
    Hashtables.sethash( $kw102$CB_VIEWPOINT, cyc_file_dependencies.$cb_help_definitions$.getGlobalValue(), ConsesLow.list( $str103$cb_viewpoint_html, NIL ) );
    html_macros.note_cgi_handler_function( $sym127$CB_VIEWPOINT, $kw128$HTML_HANDLER );
    html_macros.note_cgi_handler_function( $sym132$CB_EV, $kw128$HTML_HANDLER );
    html_macros.note_cgi_handler_function( $sym134$CB_VIEWPOINT_SUMMARY_HANDLER, $kw128$HTML_HANDLER );
    html_macros.note_cgi_handler_function( $sym135$CB_VIEWPOINT_HANDLER, $kw128$HTML_HANDLER );
    cb_utilities.setup_cb_link_method( $kw139$VIEWPOINT, $sym140$CB_LINK_VIEWPOINT, TWO_INTEGER );
    utilities_macros.register_html_state_variable( $sym160$_CB_USE_MYCREATOR_FILTER_ );
    utilities_macros.register_html_state_variable( $sym161$_CB_MYCREATOR_FILTER_ );
    defviewpoint_internal( $sym162$MYCREATOR, $list163, $sym164$CB_MYCREATOR_FILTER, $sym165$SET_CB_MYCREATOR_FILTER, $sym166$MYCREATOR_EFFECTIVE_FN );
    utilities_macros.register_html_state_variable( $sym168$_CB_USE_MYREVIEWER_FILTER_ );
    utilities_macros.register_html_state_variable( $sym169$_CB_MYREVIEWER_FILTER_ );
    defviewpoint_internal( $sym170$MYREVIEWER, $list171, $sym172$CB_MYREVIEWER_FILTER, $sym173$SET_CB_MYREVIEWER_FILTER, $sym174$MYREVIEWER_EFFECTIVE_FN );
    utilities_macros.register_html_state_variable( $sym175$_CB_USE_ASSERTION_START_DATE_FILTER_ );
    utilities_macros.register_html_state_variable( $sym176$_CB_ASSERTION_START_DATE_FILTER_ );
    defviewpoint_internal( $sym177$ASSERTION_START_DATE, $list178, $sym179$CB_ASSERTION_START_DATE_FILTER, $sym180$SET_CB_ASSERTION_START_DATE_FILTER, NIL );
    utilities_macros.register_html_state_variable( $sym181$_CB_USE_ASSERTION_END_DATE_FILTER_ );
    utilities_macros.register_html_state_variable( $sym182$_CB_ASSERTION_END_DATE_FILTER_ );
    defviewpoint_internal( $sym183$ASSERTION_END_DATE, $list184, $sym185$CB_ASSERTION_END_DATE_FILTER, $sym186$SET_CB_ASSERTION_END_DATE_FILTER, NIL );
    utilities_macros.register_html_state_variable( $sym187$_CB_USE_MTS_FILTER_ );
    utilities_macros.register_html_state_variable( $sym188$_CB_MTS_FILTER_ );
    defviewpoint_internal( $sym152$MTS, $list189, $sym190$CB_MTS_FILTER, $sym191$SET_CB_MTS_FILTER, NIL );
    utilities_macros.register_html_state_variable( $sym192$_CB_USE_MYCREATIONPURPOSE_FILTER_ );
    utilities_macros.register_html_state_variable( $sym193$_CB_MYCREATIONPURPOSE_FILTER_ );
    defviewpoint_internal( $sym194$MYCREATIONPURPOSE, $list195, $sym196$CB_MYCREATIONPURPOSE_FILTER, $sym197$SET_CB_MYCREATIONPURPOSE_FILTER, $sym198$MYCREATIONPURPOSE_EFFECTIVE_FN );
    cb_utilities.setup_cb_link_method( $kw83$EDIT_VIEWPOINT, $sym224$CB_LINK_EDIT_VIEWPOINT, THREE_INTEGER );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_cb_viewpoint_file();
  }

  @Override
  public void initializeVariables()
  {
    init_cb_viewpoint_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_cb_viewpoint_file();
  }
  static
  {
    me = new cb_viewpoint();
    $viewpoint_type$ = null;
    $dtp_viewpoint$ = null;
    $cb_viewpoint_table$ = null;
    $cb_viewpoint_summary_alist$ = null;
    $index_hook$ = null;
    $viewpoint_cache$ = null;
    $dash_nil$ = null;
    $cb_use_mycreator_filter$ = null;
    $cb_mycreator_filter$ = null;
    $cb_use_myreviewer_filter$ = null;
    $cb_myreviewer_filter$ = null;
    $cb_use_assertion_start_date_filter$ = null;
    $cb_assertion_start_date_filter$ = null;
    $cb_use_assertion_end_date_filter$ = null;
    $cb_assertion_end_date_filter$ = null;
    $cb_use_mts_filter$ = null;
    $cb_mts_filter$ = null;
    $cb_use_mycreationpurpose_filter$ = null;
    $cb_mycreationpurpose_filter$ = null;
    $str0$_ = makeString( "#" );
    $sym1$VIEWPOINT = makeSymbol( "VIEWPOINT" );
    $sym2$VIEWPOINT_P = makeSymbol( "VIEWPOINT-P" );
    $list3 = ConsesLow.list( new SubLObject[] { makeSymbol( "NAME" ), makeSymbol( "SUMMARY-NAME" ), makeSymbol( "LINKABLE-NAME" ), makeSymbol( "LINKNAME-PREFIX" ), makeSymbol( "FILTER-GETTER" ), makeSymbol(
        "FILTER-SETTER" ), makeSymbol( "TYPE" ), makeSymbol( "ACTIVE-P" ), makeSymbol( "EFFECTIVE-FN" ), makeSymbol( "VALUE-PROMPT-FN" ), makeSymbol( "VALUE-UPDATE-FN" ), makeSymbol( "INITIAL-FILTER-VALUE" ), makeSymbol(
            "EFFECTIVE-FN-SLOTNAME" )
    } );
    $list4 = ConsesLow.list( new SubLObject[] { makeKeyword( "NAME" ), makeKeyword( "SUMMARY-NAME" ), makeKeyword( "LINKABLE-NAME" ), makeKeyword( "LINKNAME-PREFIX" ), makeKeyword( "FILTER-GETTER" ), makeKeyword(
        "FILTER-SETTER" ), makeKeyword( "TYPE" ), makeKeyword( "ACTIVE-P" ), makeKeyword( "EFFECTIVE-FN" ), makeKeyword( "VALUE-PROMPT-FN" ), makeKeyword( "VALUE-UPDATE-FN" ), makeKeyword( "INITIAL-FILTER-VALUE" ),
      makeKeyword( "EFFECTIVE-FN-SLOTNAME" )
    } );
    $list5 = ConsesLow.list( new SubLObject[] { makeSymbol( "VIEWPOINT-NAME" ), makeSymbol( "VIEWPOINT-SUMMARY-NAME" ), makeSymbol( "VIEWPOINT-LINKABLE-NAME" ), makeSymbol( "VIEWPOINT-LINKNAME-PREFIX" ), makeSymbol(
        "VIEWPOINT-FILTER-GETTER" ), makeSymbol( "VIEWPOINT-FILTER-SETTER" ), makeSymbol( "VIEWPOINT-TYPE" ), makeSymbol( "VIEWPOINT-ACTIVE-P" ), makeSymbol( "VIEWPOINT-EFFECTIVE-FN" ), makeSymbol(
            "VIEWPOINT-VALUE-PROMPT-FN" ), makeSymbol( "VIEWPOINT-VALUE-UPDATE-FN" ), makeSymbol( "VIEWPOINT-INITIAL-FILTER-VALUE" ), makeSymbol( "VIEWPOINT-EFFECTIVE-FN-SLOTNAME" )
    } );
    $list6 = ConsesLow.list( new SubLObject[] { makeSymbol( "_CSETF-VIEWPOINT-NAME" ), makeSymbol( "_CSETF-VIEWPOINT-SUMMARY-NAME" ), makeSymbol( "_CSETF-VIEWPOINT-LINKABLE-NAME" ), makeSymbol(
        "_CSETF-VIEWPOINT-LINKNAME-PREFIX" ), makeSymbol( "_CSETF-VIEWPOINT-FILTER-GETTER" ), makeSymbol( "_CSETF-VIEWPOINT-FILTER-SETTER" ), makeSymbol( "_CSETF-VIEWPOINT-TYPE" ), makeSymbol(
            "_CSETF-VIEWPOINT-ACTIVE-P" ), makeSymbol( "_CSETF-VIEWPOINT-EFFECTIVE-FN" ), makeSymbol( "_CSETF-VIEWPOINT-VALUE-PROMPT-FN" ), makeSymbol( "_CSETF-VIEWPOINT-VALUE-UPDATE-FN" ), makeSymbol(
                "_CSETF-VIEWPOINT-INITIAL-FILTER-VALUE" ), makeSymbol( "_CSETF-VIEWPOINT-EFFECTIVE-FN-SLOTNAME" )
    } );
    $sym7$PRINT_VIEWPOINT = makeSymbol( "PRINT-VIEWPOINT" );
    $sym8$VIEWPOINT_PRINT_FUNCTION_TRAMPOLINE = makeSymbol( "VIEWPOINT-PRINT-FUNCTION-TRAMPOLINE" );
    $list9 = ConsesLow.list( makeSymbol( "OPTIMIZE-FUNCALL" ), makeSymbol( "VIEWPOINT-P" ) );
    $sym10$VIEWPOINT_NAME = makeSymbol( "VIEWPOINT-NAME" );
    $sym11$_CSETF_VIEWPOINT_NAME = makeSymbol( "_CSETF-VIEWPOINT-NAME" );
    $sym12$VIEWPOINT_SUMMARY_NAME = makeSymbol( "VIEWPOINT-SUMMARY-NAME" );
    $sym13$_CSETF_VIEWPOINT_SUMMARY_NAME = makeSymbol( "_CSETF-VIEWPOINT-SUMMARY-NAME" );
    $sym14$VIEWPOINT_LINKABLE_NAME = makeSymbol( "VIEWPOINT-LINKABLE-NAME" );
    $sym15$_CSETF_VIEWPOINT_LINKABLE_NAME = makeSymbol( "_CSETF-VIEWPOINT-LINKABLE-NAME" );
    $sym16$VIEWPOINT_LINKNAME_PREFIX = makeSymbol( "VIEWPOINT-LINKNAME-PREFIX" );
    $sym17$_CSETF_VIEWPOINT_LINKNAME_PREFIX = makeSymbol( "_CSETF-VIEWPOINT-LINKNAME-PREFIX" );
    $sym18$VIEWPOINT_FILTER_GETTER = makeSymbol( "VIEWPOINT-FILTER-GETTER" );
    $sym19$_CSETF_VIEWPOINT_FILTER_GETTER = makeSymbol( "_CSETF-VIEWPOINT-FILTER-GETTER" );
    $sym20$VIEWPOINT_FILTER_SETTER = makeSymbol( "VIEWPOINT-FILTER-SETTER" );
    $sym21$_CSETF_VIEWPOINT_FILTER_SETTER = makeSymbol( "_CSETF-VIEWPOINT-FILTER-SETTER" );
    $sym22$VIEWPOINT_TYPE = makeSymbol( "VIEWPOINT-TYPE" );
    $sym23$_CSETF_VIEWPOINT_TYPE = makeSymbol( "_CSETF-VIEWPOINT-TYPE" );
    $sym24$VIEWPOINT_ACTIVE_P = makeSymbol( "VIEWPOINT-ACTIVE-P" );
    $sym25$_CSETF_VIEWPOINT_ACTIVE_P = makeSymbol( "_CSETF-VIEWPOINT-ACTIVE-P" );
    $sym26$VIEWPOINT_EFFECTIVE_FN = makeSymbol( "VIEWPOINT-EFFECTIVE-FN" );
    $sym27$_CSETF_VIEWPOINT_EFFECTIVE_FN = makeSymbol( "_CSETF-VIEWPOINT-EFFECTIVE-FN" );
    $sym28$VIEWPOINT_VALUE_PROMPT_FN = makeSymbol( "VIEWPOINT-VALUE-PROMPT-FN" );
    $sym29$_CSETF_VIEWPOINT_VALUE_PROMPT_FN = makeSymbol( "_CSETF-VIEWPOINT-VALUE-PROMPT-FN" );
    $sym30$VIEWPOINT_VALUE_UPDATE_FN = makeSymbol( "VIEWPOINT-VALUE-UPDATE-FN" );
    $sym31$_CSETF_VIEWPOINT_VALUE_UPDATE_FN = makeSymbol( "_CSETF-VIEWPOINT-VALUE-UPDATE-FN" );
    $sym32$VIEWPOINT_INITIAL_FILTER_VALUE = makeSymbol( "VIEWPOINT-INITIAL-FILTER-VALUE" );
    $sym33$_CSETF_VIEWPOINT_INITIAL_FILTER_VALUE = makeSymbol( "_CSETF-VIEWPOINT-INITIAL-FILTER-VALUE" );
    $sym34$VIEWPOINT_EFFECTIVE_FN_SLOTNAME = makeSymbol( "VIEWPOINT-EFFECTIVE-FN-SLOTNAME" );
    $sym35$_CSETF_VIEWPOINT_EFFECTIVE_FN_SLOTNAME = makeSymbol( "_CSETF-VIEWPOINT-EFFECTIVE-FN-SLOTNAME" );
    $kw36$NAME = makeKeyword( "NAME" );
    $kw37$SUMMARY_NAME = makeKeyword( "SUMMARY-NAME" );
    $kw38$LINKABLE_NAME = makeKeyword( "LINKABLE-NAME" );
    $kw39$LINKNAME_PREFIX = makeKeyword( "LINKNAME-PREFIX" );
    $kw40$FILTER_GETTER = makeKeyword( "FILTER-GETTER" );
    $kw41$FILTER_SETTER = makeKeyword( "FILTER-SETTER" );
    $kw42$TYPE = makeKeyword( "TYPE" );
    $kw43$ACTIVE_P = makeKeyword( "ACTIVE-P" );
    $kw44$EFFECTIVE_FN = makeKeyword( "EFFECTIVE-FN" );
    $kw45$VALUE_PROMPT_FN = makeKeyword( "VALUE-PROMPT-FN" );
    $kw46$VALUE_UPDATE_FN = makeKeyword( "VALUE-UPDATE-FN" );
    $kw47$INITIAL_FILTER_VALUE = makeKeyword( "INITIAL-FILTER-VALUE" );
    $kw48$EFFECTIVE_FN_SLOTNAME = makeKeyword( "EFFECTIVE-FN-SLOTNAME" );
    $str49$Invalid_slot__S_for_construction_ = makeString( "Invalid slot ~S for construction function" );
    $kw50$BEGIN = makeKeyword( "BEGIN" );
    $sym51$MAKE_VIEWPOINT = makeSymbol( "MAKE-VIEWPOINT" );
    $kw52$SLOT = makeKeyword( "SLOT" );
    $kw53$END = makeKeyword( "END" );
    $sym54$VISIT_DEFSTRUCT_OBJECT_VIEWPOINT_METHOD = makeSymbol( "VISIT-DEFSTRUCT-OBJECT-VIEWPOINT-METHOD" );
    $sym55$_CB_VIEWPOINT_TABLE_ = makeSymbol( "*CB-VIEWPOINT-TABLE*" );
    $sym56$_CB_VIEWPOINT_SUMMARY_ALIST_ = makeSymbol( "*CB-VIEWPOINT-SUMMARY-ALIST*" );
    $sym57$ACTIVE_VIEWPOINT_STRUCT_P = makeSymbol( "ACTIVE-VIEWPOINT-STRUCT-P" );
    $list58 = ConsesLow.list( makeSymbol( "NAME" ), makeSymbol( "&REST" ), makeSymbol( "ARGLIST" ) );
    $str59$_A_FILTER = makeString( "~A-FILTER" );
    $str60$CB__A = makeString( "CB-~A" );
    $str61$SET__A = makeString( "SET-~A" );
    $str62$_A_EFFECTIVE_FN = makeString( "~A-EFFECTIVE-FN" );
    $sym63$PROGN = makeSymbol( "PROGN" );
    $sym64$DEFFILTERSET = makeSymbol( "DEFFILTERSET" );
    $list65 = ConsesLow.list( NIL, makeString( "Automatically generated filter" ) );
    $kw66$LIST_OF_FORMS = makeKeyword( "LIST-OF-FORMS" );
    $sym67$DEFVIEWPOINT_INTERNAL = makeSymbol( "DEFVIEWPOINT-INTERNAL" );
    $sym68$QUOTE = makeSymbol( "QUOTE" );
    $sym69$DEFINE = makeSymbol( "DEFINE" );
    $list70 = ConsesLow.list( makeSymbol( "ASSERTION" ) );
    $list71 = ConsesLow.list( makeSymbol( "PUNLESS" ), ConsesLow.list( makeSymbol( "ASSERTION-P" ), makeSymbol( "ASSERTION" ) ), ConsesLow.list( makeSymbol( "BREAK" ), makeString( "not an assertion" ) ) );
    $list72 = ConsesLow.list( makeSymbol( "PWHEN" ), ConsesLow.list( makeSymbol( "DOC-PREDICATE-P" ), makeSymbol( "ASSERTION" ) ), ConsesLow.list( makeSymbol( "RET" ), T ) );
    $sym73$CLET = makeSymbol( "CLET" );
    $sym74$FIND_VIEWPOINT = makeSymbol( "FIND-VIEWPOINT" );
    $list75 = ConsesLow.list( ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "MEMBER" ), ConsesLow.list( makeSymbol( "FUNCALL" ), ConsesLow.list( makeSymbol( "VIEWPOINT-EFFECTIVE-FN-SLOTNAME" ),
        makeSymbol( "VIEWPOINT" ) ), makeSymbol( "ASSERTION" ) ), ConsesLow.list( makeSymbol( "FUNCALL" ), ConsesLow.list( makeSymbol( "VIEWPOINT-FILTER-GETTER" ), makeSymbol( "VIEWPOINT" ) ) ) ) ) );
    $list76 = ConsesLow.list( NIL );
    $sym77$CAR = makeSymbol( "CAR" );
    $str78$activate__A = makeString( "activate-~A" );
    $str79$_ = makeString( ":" );
    $kw80$NBSP = makeKeyword( "NBSP" );
    $kw81$SINGLE_SIMPLE_DATE = makeKeyword( "SINGLE-SIMPLE-DATE" );
    $str82$_D = makeString( "~D" );
    $kw83$EDIT_VIEWPOINT = makeKeyword( "EDIT-VIEWPOINT" );
    $str84$Edit = makeString( "Edit" );
    $sym85$DISPLAY_VIEWPOINT = makeSymbol( "DISPLAY-VIEWPOINT" );
    $str86$Complete = makeString( "Complete" );
    $str87$ = makeString( "" );
    $str88$cb_show_cyclist__A = makeString( "cb-show-cyclist-~A" );
    $const89$Cyclist = constant_handles.reader_make_constant_shell( makeString( "Cyclist" ) );
    $int90$24 = makeInteger( 24 );
    $str91$cb_show_cyclist1__A = makeString( "cb-show-cyclist1-~A" );
    $str92$cb_show_cyclist2__A = makeString( "cb-show-cyclist2-~A" );
    $str93$________ = makeString( "--------" );
    $str94$Unknown__A___S = makeString( "Unknown ~A: ~S" );
    $str95$cyclist = makeString( "cyclist" );
    $const96$Cyc_BasedProject = constant_handles.reader_make_constant_shell( makeString( "Cyc-BasedProject" ) );
    $const97$isa = constant_handles.reader_make_constant_shell( makeString( "isa" ) );
    $str98$project1__A = makeString( "project1-~A" );
    $str99$project2__A = makeString( "project2-~A" );
    $str100$project3__A = makeString( "project3-~A" );
    $str101$project = makeString( "project" );
    $kw102$CB_VIEWPOINT = makeKeyword( "CB-VIEWPOINT" );
    $str103$cb_viewpoint_html = makeString( "cb-viewpoint.html" );
    $list104 = ConsesLow.list( makeSymbol( "INDEX-SPEC" ) );
    $str105$_a_does_not_specify_an_index = makeString( "~a does not specify an index" );
    $str106$Viewpoint_Filter_Summary = makeString( "Viewpoint Filter Summary" );
    $str107$__DOCTYPE_html_PUBLIC_____W3C__DT = makeString( "<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">" );
    $str108$_meta_http_equiv__X_UA_Compatible = makeString( "<meta http-equiv=\"X-UA-Compatible\" content=\"IE=Edge\" >" );
    $kw109$UNINITIALIZED = makeKeyword( "UNINITIALIZED" );
    $kw110$CB_CYC = makeKeyword( "CB-CYC" );
    $kw111$SAM_AUTOCOMPLETE_CSS = makeKeyword( "SAM-AUTOCOMPLETE-CSS" );
    $kw112$SHA1 = makeKeyword( "SHA1" );
    $str113$yui_skin_sam = makeString( "yui-skin-sam" );
    $str114$reloadFrameButton = makeString( "reloadFrameButton" );
    $str115$button = makeString( "button" );
    $str116$reload = makeString( "reload" );
    $str117$Refresh_Frames = makeString( "Refresh Frames" );
    $str118$post = makeString( "post" );
    $str119$cb_viewpoint_summary_handler = makeString( "cb-viewpoint-summary-handler" );
    $str120$Current_Values = makeString( "Current Values" );
    $str121$Update_Filter_Settings = makeString( "Update Filter Settings" );
    $str122$always_show_comments = makeString( "always-show-comments" );
    $str123$Always_show_comments__regardless_ = makeString( "Always show comments, regardless of other filter settings." );
    $str124$always_show_bookkeeping = makeString( "always-show-bookkeeping" );
    $str125$Always_show_bookkeeping_predicate = makeString( "Always show bookkeeping predicates, regardless of other filter settings." );
    $sym126$DISPLAY_VIEWPOINT_1 = makeSymbol( "DISPLAY-VIEWPOINT-1" );
    $sym127$CB_VIEWPOINT = makeSymbol( "CB-VIEWPOINT" );
    $kw128$HTML_HANDLER = makeKeyword( "HTML-HANDLER" );
    $list129 = ConsesLow.list( makeSymbol( "SUMMARY-NAME" ), makeSymbol( "INDEX-SPEC" ) );
    $str130$Viewpoint_Filters = makeString( "Viewpoint Filters" );
    $str131$cb_viewpoint_handler = makeString( "cb-viewpoint-handler" );
    $sym132$CB_EV = makeSymbol( "CB-EV" );
    $str133$Summary_filters_have_been_changed = makeString( "Summary filters have been changed" );
    $sym134$CB_VIEWPOINT_SUMMARY_HANDLER = makeSymbol( "CB-VIEWPOINT-SUMMARY-HANDLER" );
    $sym135$CB_VIEWPOINT_HANDLER = makeSymbol( "CB-VIEWPOINT-HANDLER" );
    $str136$_Viewpoint_ = makeString( "[Viewpoint]" );
    $kw137$MAIN = makeKeyword( "MAIN" );
    $str138$cb_viewpoint__A = makeString( "cb-viewpoint&~A" );
    $kw139$VIEWPOINT = makeKeyword( "VIEWPOINT" );
    $sym140$CB_LINK_VIEWPOINT = makeSymbol( "CB-LINK-VIEWPOINT" );
    $str141$_ = makeString( " " );
    $str142$_Filter = makeString( " Filter" );
    $str143$_Only_those_terms_whose_ = makeString( "(Only those terms whose " );
    $str144$_field_has_a_value_equal_to_a_ter = makeString( " field has a value equal to a term below will be presented. Leave blank to disable this filter.)" );
    $sym145$CB_PROMPT_CYCLISTS = makeSymbol( "CB-PROMPT-CYCLISTS" );
    $str146$Activate_Filter = makeString( "Activate Filter" );
    $str147$all_dates__A = makeString( "all-dates-~A" );
    $str148$no = makeString( "no" );
    $str149$cb_show_start__A = makeString( "cb-show-start-~A" );
    $str150$all = makeString( "all" );
    $str151$yes = makeString( "yes" );
    $sym152$MTS = makeSymbol( "MTS" );
    $str153$All_Mts = makeString( "All Mts" );
    $str154$Specify_Mts = makeString( "Specify Mts" );
    $str155$use_genl_mt = makeString( "use-genl-mt" );
    $str156$Include_All_Genl_Mts = makeString( "Include All Genl Mts" );
    $str157$new_mt = makeString( "new-mt" );
    $sym158$CB_PROMPT_PROJECTS = makeSymbol( "CB-PROMPT-PROJECTS" );
    $const159$EverythingPSC = constant_handles.reader_make_constant_shell( makeString( "EverythingPSC" ) );
    $sym160$_CB_USE_MYCREATOR_FILTER_ = makeSymbol( "*CB-USE-MYCREATOR-FILTER*" );
    $sym161$_CB_MYCREATOR_FILTER_ = makeSymbol( "*CB-MYCREATOR-FILTER*" );
    $sym162$MYCREATOR = makeSymbol( "MYCREATOR" );
    $list163 = ConsesLow.list( new SubLObject[] { makeKeyword( "LINKABLE-NAME" ), constant_handles.reader_make_constant_shell( makeString( "myCreator" ) ), makeKeyword( "TYPE" ), makeKeyword( "LIST-OF-FORMS" ),
      makeKeyword( "ACTIVE-P" ), NIL, makeKeyword( "VALUE-PROMPT-FN" ), makeSymbol( "PROMPT-FOR-LIST-OF-CYCLISTS" ), makeKeyword( "VALUE-UPDATE-FN" ), makeSymbol( "RECEIVE-LIST-OF-CYCLISTS" ), makeKeyword(
          "EFFECTIVE-FN-SLOTNAME" ), makeSymbol( "ASSERTED-BY" )
    } );
    $sym164$CB_MYCREATOR_FILTER = makeSymbol( "CB-MYCREATOR-FILTER" );
    $sym165$SET_CB_MYCREATOR_FILTER = makeSymbol( "SET-CB-MYCREATOR-FILTER" );
    $sym166$MYCREATOR_EFFECTIVE_FN = makeSymbol( "MYCREATOR-EFFECTIVE-FN" );
    $str167$not_an_assertion = makeString( "not an assertion" );
    $sym168$_CB_USE_MYREVIEWER_FILTER_ = makeSymbol( "*CB-USE-MYREVIEWER-FILTER*" );
    $sym169$_CB_MYREVIEWER_FILTER_ = makeSymbol( "*CB-MYREVIEWER-FILTER*" );
    $sym170$MYREVIEWER = makeSymbol( "MYREVIEWER" );
    $list171 = ConsesLow.list( new SubLObject[] { makeKeyword( "LINKABLE-NAME" ), constant_handles.reader_make_constant_shell( makeString( "myReviewer" ) ), makeKeyword( "TYPE" ), makeKeyword( "LIST-OF-FORMS" ),
      makeKeyword( "ACTIVE-P" ), NIL, makeKeyword( "EFFECTIVE-FN-SLOTNAME" ), makeSymbol( "ASSERTED-REVIEWER" ), makeKeyword( "VALUE-PROMPT-FN" ), makeSymbol( "PROMPT-FOR-LIST-OF-CYCLISTS" ), makeKeyword(
          "VALUE-UPDATE-FN" ), makeSymbol( "RECEIVE-LIST-OF-CYCLISTS" )
    } );
    $sym172$CB_MYREVIEWER_FILTER = makeSymbol( "CB-MYREVIEWER-FILTER" );
    $sym173$SET_CB_MYREVIEWER_FILTER = makeSymbol( "SET-CB-MYREVIEWER-FILTER" );
    $sym174$MYREVIEWER_EFFECTIVE_FN = makeSymbol( "MYREVIEWER-EFFECTIVE-FN" );
    $sym175$_CB_USE_ASSERTION_START_DATE_FILTER_ = makeSymbol( "*CB-USE-ASSERTION-START-DATE-FILTER*" );
    $sym176$_CB_ASSERTION_START_DATE_FILTER_ = makeSymbol( "*CB-ASSERTION-START-DATE-FILTER*" );
    $sym177$ASSERTION_START_DATE = makeSymbol( "ASSERTION-START-DATE" );
    $list178 = ConsesLow.list( new SubLObject[] { makeKeyword( "LINKNAME-PREFIX" ), makeString( "After " ), makeKeyword( "LINKABLE-NAME" ), constant_handles.reader_make_constant_shell( makeString( "myCreationTime" ) ),
      makeKeyword( "TYPE" ), makeKeyword( "SINGLE-SIMPLE-DATE" ), makeKeyword( "ACTIVE-P" ), NIL, makeKeyword( "EFFECTIVE-FN" ), makeSymbol( "ASSERTION-AFTER-DATE" ), makeKeyword( "VALUE-PROMPT-FN" ), makeSymbol(
          "PROMPT-FOR-DATE" ), makeKeyword( "VALUE-UPDATE-FN" ), makeSymbol( "RECEIVE-DATE" ), makeKeyword( "INITIAL-FILTER-VALUE" ), makeInteger( 19800101 )
    } );
    $sym179$CB_ASSERTION_START_DATE_FILTER = makeSymbol( "CB-ASSERTION-START-DATE-FILTER" );
    $sym180$SET_CB_ASSERTION_START_DATE_FILTER = makeSymbol( "SET-CB-ASSERTION-START-DATE-FILTER" );
    $sym181$_CB_USE_ASSERTION_END_DATE_FILTER_ = makeSymbol( "*CB-USE-ASSERTION-END-DATE-FILTER*" );
    $sym182$_CB_ASSERTION_END_DATE_FILTER_ = makeSymbol( "*CB-ASSERTION-END-DATE-FILTER*" );
    $sym183$ASSERTION_END_DATE = makeSymbol( "ASSERTION-END-DATE" );
    $list184 = ConsesLow.list( new SubLObject[] { makeKeyword( "LINKNAME-PREFIX" ), makeString( "Before " ), makeKeyword( "LINKABLE-NAME" ), constant_handles.reader_make_constant_shell( makeString( "myCreationTime" ) ),
      makeKeyword( "TYPE" ), makeKeyword( "SINGLE-SIMPLE-DATE" ), makeKeyword( "ACTIVE-P" ), NIL, makeKeyword( "EFFECTIVE-FN" ), makeSymbol( "ASSERTION-BEFORE-DATE" ), makeKeyword( "VALUE-PROMPT-FN" ), makeSymbol(
          "PROMPT-FOR-DATE" ), makeKeyword( "VALUE-UPDATE-FN" ), makeSymbol( "RECEIVE-DATE" ), makeKeyword( "INITIAL-FILTER-VALUE" ), makeInteger( 29991231 )
    } );
    $sym185$CB_ASSERTION_END_DATE_FILTER = makeSymbol( "CB-ASSERTION-END-DATE-FILTER" );
    $sym186$SET_CB_ASSERTION_END_DATE_FILTER = makeSymbol( "SET-CB-ASSERTION-END-DATE-FILTER" );
    $sym187$_CB_USE_MTS_FILTER_ = makeSymbol( "*CB-USE-MTS-FILTER*" );
    $sym188$_CB_MTS_FILTER_ = makeSymbol( "*CB-MTS-FILTER*" );
    $list189 = ConsesLow.list( new SubLObject[] { makeKeyword( "LINKABLE-NAME" ), constant_handles.reader_make_constant_shell( makeString( "Microtheory" ) ), makeKeyword( "TYPE" ), makeKeyword( "LIST-OF-FORMS" ),
      makeKeyword( "ACTIVE-P" ), NIL, makeKeyword( "EFFECTIVE-FN" ), NIL, makeKeyword( "VALUE-PROMPT-FN" ), makeSymbol( "PROMPT-FOR-MT" ), makeKeyword( "VALUE-UPDATE-FN" ), makeSymbol( "RECEIVE-MT" )
    } );
    $sym190$CB_MTS_FILTER = makeSymbol( "CB-MTS-FILTER" );
    $sym191$SET_CB_MTS_FILTER = makeSymbol( "SET-CB-MTS-FILTER" );
    $sym192$_CB_USE_MYCREATIONPURPOSE_FILTER_ = makeSymbol( "*CB-USE-MYCREATIONPURPOSE-FILTER*" );
    $sym193$_CB_MYCREATIONPURPOSE_FILTER_ = makeSymbol( "*CB-MYCREATIONPURPOSE-FILTER*" );
    $sym194$MYCREATIONPURPOSE = makeSymbol( "MYCREATIONPURPOSE" );
    $list195 = ConsesLow.list( new SubLObject[] { makeKeyword( "LINKABLE-NAME" ), constant_handles.reader_make_constant_shell( makeString( "myCreationPurpose" ) ), makeKeyword( "TYPE" ), makeKeyword( "LIST-OF-FORMS" ),
      makeKeyword( "ACTIVE-P" ), NIL, makeKeyword( "VALUE-PROMPT-FN" ), makeSymbol( "PROMPT-FOR-CYCBASEDPROJECT" ), makeKeyword( "VALUE-UPDATE-FN" ), makeSymbol( "RECEIVE-LIST-OF-PROJECTS" ), makeKeyword(
          "EFFECTIVE-FN-SLOTNAME" ), makeSymbol( "ASSERTED-WHY" )
    } );
    $sym196$CB_MYCREATIONPURPOSE_FILTER = makeSymbol( "CB-MYCREATIONPURPOSE-FILTER" );
    $sym197$SET_CB_MYCREATIONPURPOSE_FILTER = makeSymbol( "SET-CB-MYCREATIONPURPOSE-FILTER" );
    $sym198$MYCREATIONPURPOSE_EFFECTIVE_FN = makeSymbol( "MYCREATIONPURPOSE-EFFECTIVE-FN" );
    $sym199$CB_ONLINE_FILTER_HOOKS = makeSymbol( "CB-ONLINE-FILTER-HOOKS" );
    $list200 = ConsesLow.list( ConsesLow.list( makeSymbol( "*ASSERTION-FILTER-HOOK*" ), ConsesLow.list( makeSymbol( "CB-CALC-FILTER-HOOKS" ) ) ) );
    $list201 = ConsesLow.list( makeSymbol( "ANSWER-LIST" ), makeSymbol( "MT-GETTER" ), makeSymbol( "GETTER" ), makeSymbol( "&KEY" ), makeSymbol( "SPECIFIED-MT" ) );
    $list202 = ConsesLow.list( makeKeyword( "SPECIFIED-MT" ) );
    $kw203$ALLOW_OTHER_KEYS = makeKeyword( "ALLOW-OTHER-KEYS" );
    $kw204$SPECIFIED_MT = makeKeyword( "SPECIFIED-MT" );
    $sym205$WITH_ASSERTION_FILTERS = makeSymbol( "WITH-ASSERTION-FILTERS" );
    $sym206$PCOND = makeSymbol( "PCOND" );
    $sym207$CAND = makeSymbol( "CAND" );
    $list208 = ConsesLow.list( makeSymbol( "ACTIVE-FILTER-P" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "MTS" ) ) );
    $sym209$CNOT = makeSymbol( "CNOT" );
    $sym210$PIF = makeSymbol( "PIF" );
    $list211 = ConsesLow.list( makeSymbol( "CB-MTS-FILTER-USE-GENLMT" ) );
    $sym212$WITH_MT_LIST_AND_GENL_MTS = makeSymbol( "WITH-MT-LIST-AND-GENL-MTS" );
    $list213 = ConsesLow.list( makeSymbol( "CB-MTS-FILTER" ) );
    $sym214$CSETQ = makeSymbol( "CSETQ" );
    $sym215$WITH_MT_LIST = makeSymbol( "WITH-MT-LIST" );
    $list216 = ConsesLow.list( makeSymbol( "FILTERED" ), makeSymbol( "UNFILTERED" ) );
    $sym217$RESULT = makeUninternedSymbol( "RESULT" );
    $sym218$RET = makeSymbol( "RET" );
    $str219$cb_ev = makeString( "cb-ev" );
    $kw220$TOP = makeKeyword( "TOP" );
    $str221$cb_start_cb_ev = makeString( "cb-start|cb-ev" );
    $str222$_a__a__a = makeString( "~a&~a&~a" );
    $str223$_a__a = makeString( "~a&~a" );
    $sym224$CB_LINK_EDIT_VIEWPOINT = makeSymbol( "CB-LINK-EDIT-VIEWPOINT" );
  }

  public static final class $viewpoint_native
      extends
        SubLStructNative
  {
    public SubLObject $name;
    public SubLObject $summary_name;
    public SubLObject $linkable_name;
    public SubLObject $linkname_prefix;
    public SubLObject $filter_getter;
    public SubLObject $filter_setter;
    public SubLObject $type;
    public SubLObject $active_p;
    public SubLObject $effective_fn;
    public SubLObject $value_prompt_fn;
    public SubLObject $value_update_fn;
    public SubLObject $initial_filter_value;
    public SubLObject $effective_fn_slotname;
    private static final SubLStructDeclNative structDecl;

    public $viewpoint_native()
    {
      this.$name = CommonSymbols.NIL;
      this.$summary_name = CommonSymbols.NIL;
      this.$linkable_name = CommonSymbols.NIL;
      this.$linkname_prefix = CommonSymbols.NIL;
      this.$filter_getter = CommonSymbols.NIL;
      this.$filter_setter = CommonSymbols.NIL;
      this.$type = CommonSymbols.NIL;
      this.$active_p = CommonSymbols.NIL;
      this.$effective_fn = CommonSymbols.NIL;
      this.$value_prompt_fn = CommonSymbols.NIL;
      this.$value_update_fn = CommonSymbols.NIL;
      this.$initial_filter_value = CommonSymbols.NIL;
      this.$effective_fn_slotname = CommonSymbols.NIL;
    }

    @Override
    public SubLStructDecl getStructDecl()
    {
      return $viewpoint_native.structDecl;
    }

    @Override
    public SubLObject getField2()
    {
      return this.$name;
    }

    @Override
    public SubLObject getField3()
    {
      return this.$summary_name;
    }

    @Override
    public SubLObject getField4()
    {
      return this.$linkable_name;
    }

    @Override
    public SubLObject getField5()
    {
      return this.$linkname_prefix;
    }

    @Override
    public SubLObject getField6()
    {
      return this.$filter_getter;
    }

    @Override
    public SubLObject getField7()
    {
      return this.$filter_setter;
    }

    @Override
    public SubLObject getField8()
    {
      return this.$type;
    }

    @Override
    public SubLObject getField9()
    {
      return this.$active_p;
    }

    @Override
    public SubLObject getField10()
    {
      return this.$effective_fn;
    }

    @Override
    public SubLObject getField11()
    {
      return this.$value_prompt_fn;
    }

    @Override
    public SubLObject getField12()
    {
      return this.$value_update_fn;
    }

    @Override
    public SubLObject getField13()
    {
      return this.$initial_filter_value;
    }

    @Override
    public SubLObject getField14()
    {
      return this.$effective_fn_slotname;
    }

    @Override
    public SubLObject setField2(final SubLObject value)
    {
      return this.$name = value;
    }

    @Override
    public SubLObject setField3(final SubLObject value)
    {
      return this.$summary_name = value;
    }

    @Override
    public SubLObject setField4(final SubLObject value)
    {
      return this.$linkable_name = value;
    }

    @Override
    public SubLObject setField5(final SubLObject value)
    {
      return this.$linkname_prefix = value;
    }

    @Override
    public SubLObject setField6(final SubLObject value)
    {
      return this.$filter_getter = value;
    }

    @Override
    public SubLObject setField7(final SubLObject value)
    {
      return this.$filter_setter = value;
    }

    @Override
    public SubLObject setField8(final SubLObject value)
    {
      return this.$type = value;
    }

    @Override
    public SubLObject setField9(final SubLObject value)
    {
      return this.$active_p = value;
    }

    @Override
    public SubLObject setField10(final SubLObject value)
    {
      return this.$effective_fn = value;
    }

    @Override
    public SubLObject setField11(final SubLObject value)
    {
      return this.$value_prompt_fn = value;
    }

    @Override
    public SubLObject setField12(final SubLObject value)
    {
      return this.$value_update_fn = value;
    }

    @Override
    public SubLObject setField13(final SubLObject value)
    {
      return this.$initial_filter_value = value;
    }

    @Override
    public SubLObject setField14(final SubLObject value)
    {
      return this.$effective_fn_slotname = value;
    }
    static
    {
      structDecl = Structures.makeStructDeclNative( $viewpoint_native.class, $sym1$VIEWPOINT, $sym2$VIEWPOINT_P, $list3, $list4, new String[] { "$name", "$summary_name", "$linkable_name", "$linkname_prefix",
        "$filter_getter", "$filter_setter", "$type", "$active_p", "$effective_fn", "$value_prompt_fn", "$value_update_fn", "$initial_filter_value", "$effective_fn_slotname"
      }, $list5, $list6, $sym7$PRINT_VIEWPOINT );
    }
  }

  public static final class $viewpoint_p$UnaryFunction
      extends
        UnaryFunction
  {
    public $viewpoint_p$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "VIEWPOINT-P" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1)
    {
      return viewpoint_p( arg1 );
    }
  }
}
/*
 * 
 * Total time: 662 ms
 * 
 */