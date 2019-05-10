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
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.cycjava.cycl.inference.browser.cb_query;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_macros;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class cb_adornments
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.cb_adornments";
  public static final String myFingerPrint = "25b72a1f20f9f861d397f5a2654b958eea4b067e6c3a73a414511e3c9a385e57";
  @SubLTranslatedFile.SubL(source = "cycl/cb-adornments.lisp", position = 420L)
  private static SubLSymbol $adornment_display$;
  @SubLTranslatedFile.SubL(source = "cycl/cb-adornments.lisp", position = 643L)
  private static SubLSymbol $adorn_thingo$;
  @SubLTranslatedFile.SubL(source = "cycl/cb-adornments.lisp", position = 726L)
  private static SubLSymbol $adorn_arg$;
  @SubLTranslatedFile.SubL(source = "cycl/cb-adornments.lisp", position = 839L)
  private static SubLSymbol $adorn_pred$;
  @SubLTranslatedFile.SubL(source = "cycl/cb-adornments.lisp", position = 953L)
  private static SubLSymbol $adorn_mt$;
  @SubLTranslatedFile.SubL(source = "cycl/cb-adornments.lisp", position = 1064L)
  private static SubLSymbol $adornment_type$;
  @SubLTranslatedFile.SubL(source = "cycl/cb-adornments.lisp", position = 1165L)
  private static SubLSymbol $adornment_sorted_list$;
  @SubLTranslatedFile.SubL(source = "cycl/cb-adornments.lisp", position = 2440L)
  public static SubLSymbol $dtp_adornment$;
  @SubLTranslatedFile.SubL(source = "cycl/cb-adornments.lisp", position = 4962L)
  public static SubLSymbol $cb_adornment_table$;
  @SubLTranslatedFile.SubL(source = "cycl/cb-adornments.lisp", position = 20395L)
  public static SubLSymbol $debug_adornments_p$;
  private static final SubLSymbol $kw0$MAIN;
  private static final SubLList $list1;
  private static final SubLString $str2$_;
  private static final SubLSymbol $sym3$ADORNMENT;
  private static final SubLSymbol $sym4$ADORNMENT_P;
  private static final SubLList $list5;
  private static final SubLList $list6;
  private static final SubLList $list7;
  private static final SubLList $list8;
  private static final SubLSymbol $sym9$PRINT_ADORNMENT;
  private static final SubLSymbol $sym10$ADORNMENT_PRINT_FUNCTION_TRAMPOLINE;
  private static final SubLList $list11;
  private static final SubLSymbol $sym12$ADORNMENT_NAME;
  private static final SubLSymbol $sym13$_CSETF_ADORNMENT_NAME;
  private static final SubLSymbol $sym14$ADORNMENT_TYPE;
  private static final SubLSymbol $sym15$_CSETF_ADORNMENT_TYPE;
  private static final SubLSymbol $sym16$ADORNMENT_ACTIVE_P;
  private static final SubLSymbol $sym17$_CSETF_ADORNMENT_ACTIVE_P;
  private static final SubLSymbol $sym18$ADORNMENT_IMAGE;
  private static final SubLSymbol $sym19$_CSETF_ADORNMENT_IMAGE;
  private static final SubLSymbol $sym20$ADORNMENT_IMAGE_DISABLED;
  private static final SubLSymbol $sym21$_CSETF_ADORNMENT_IMAGE_DISABLED;
  private static final SubLSymbol $sym22$ADORNMENT_IMAGE_ALT;
  private static final SubLSymbol $sym23$_CSETF_ADORNMENT_IMAGE_ALT;
  private static final SubLSymbol $sym24$ADORNMENT_DYNAMIC_TAGFN;
  private static final SubLSymbol $sym25$_CSETF_ADORNMENT_DYNAMIC_TAGFN;
  private static final SubLSymbol $sym26$ADORNMENT_COLOR;
  private static final SubLSymbol $sym27$_CSETF_ADORNMENT_COLOR;
  private static final SubLSymbol $sym28$ADORNMENT_LETTER;
  private static final SubLSymbol $sym29$_CSETF_ADORNMENT_LETTER;
  private static final SubLSymbol $sym30$ADORNMENT_EFFECTIVE_FN;
  private static final SubLSymbol $sym31$_CSETF_ADORNMENT_EFFECTIVE_FN;
  private static final SubLSymbol $sym32$ADORNMENT_HANDLER;
  private static final SubLSymbol $sym33$_CSETF_ADORNMENT_HANDLER;
  private static final SubLSymbol $sym34$ADORNMENT_TOOL;
  private static final SubLSymbol $sym35$_CSETF_ADORNMENT_TOOL;
  private static final SubLSymbol $sym36$ADORNMENT_COMMENT;
  private static final SubLSymbol $sym37$_CSETF_ADORNMENT_COMMENT;
  private static final SubLSymbol $sym38$ADORNMENT_DYNAMIC_COMMENT;
  private static final SubLSymbol $sym39$_CSETF_ADORNMENT_DYNAMIC_COMMENT;
  private static final SubLSymbol $sym40$ADORNMENT_TITLE;
  private static final SubLSymbol $sym41$_CSETF_ADORNMENT_TITLE;
  private static final SubLSymbol $kw42$NAME;
  private static final SubLSymbol $kw43$TYPE;
  private static final SubLSymbol $kw44$ACTIVE_P;
  private static final SubLSymbol $kw45$IMAGE;
  private static final SubLSymbol $kw46$IMAGE_DISABLED;
  private static final SubLSymbol $kw47$IMAGE_ALT;
  private static final SubLSymbol $kw48$DYNAMIC_TAGFN;
  private static final SubLSymbol $kw49$COLOR;
  private static final SubLSymbol $kw50$LETTER;
  private static final SubLSymbol $kw51$EFFECTIVE_FN;
  private static final SubLSymbol $kw52$HANDLER;
  private static final SubLSymbol $kw53$TOOL;
  private static final SubLSymbol $kw54$COMMENT;
  private static final SubLSymbol $kw55$DYNAMIC_COMMENT;
  private static final SubLSymbol $kw56$TITLE;
  private static final SubLString $str57$Invalid_slot__S_for_construction_;
  private static final SubLSymbol $kw58$BEGIN;
  private static final SubLSymbol $sym59$MAKE_ADORNMENT;
  private static final SubLSymbol $kw60$SLOT;
  private static final SubLSymbol $kw61$END;
  private static final SubLSymbol $sym62$VISIT_DEFSTRUCT_OBJECT_ADORNMENT_METHOD;
  private static final SubLSymbol $sym63$_CB_ADORNMENT_TABLE_;
  private static final SubLList $list64;
  private static final SubLSymbol $sym65$OLD;
  private static final SubLSymbol $sym66$NEW;
  private static final SubLSymbol $sym67$CLET;
  private static final SubLList $list68;
  private static final SubLSymbol $sym69$QUOTE;
  private static final SubLSymbol $sym70$CSETF;
  private static final SubLSymbol $sym71$CSETQ;
  private static final SubLSymbol $sym72$CONS;
  private static final SubLSymbol $sym73$DELETE;
  private static final SubLList $list74;
  private static final SubLSymbol $sym75$ACTIVE_ADORNMENT_STRUCT_P;
  private static final SubLSymbol $kw76$ASSERTION;
  private static final SubLSymbol $kw77$DEDUCTION;
  private static final SubLSymbol $kw78$INDEX_CONSTANT_NAME;
  private static final SubLSymbol $kw79$INDEX_FORT;
  private static final SubLSymbol $kw80$INDEX_CONSTANT;
  private static final SubLSymbol $kw81$CONSTANT;
  private static final SubLSymbol $kw82$GAF_ARG_PREDICATE;
  private static final SubLSymbol $kw83$INDEX_TERM;
  private static final SubLSymbol $kw84$TOP;
  private static final SubLString $str85$cb_start_;
  private static final SubLString $str86$_;
  private static final SubLSymbol $kw87$CENTER;
  private static final SubLSymbol $sym88$DISPLAY_ADORNMENT;
  private static final SubLSymbol $sym89$ACTIVATE_ADORNMENT;
  private static final SubLSymbol $kw90$INDEX_BROWSER;
  private static final SubLString $str91$index_browser_gif;
  private static final SubLSymbol $kw92$INDEX_BROWSER_DISABLED;
  private static final SubLString $str93$index_browser_disabled_gif;
  private static final SubLList $list94;
  private static final SubLSymbol $sym95$INDEX_BROWSER;
  private static final SubLList $list96;
  private static final SubLSymbol $sym97$META_AXIOMS;
  private static final SubLSymbol $kw98$CY_MENU;
  private static final SubLString $str99$cy_menu_gif;
  private static final SubLList $list100;
  private static final SubLSymbol $sym101$ASSERTION_REVIEW;
  private static final SubLSymbol $kw102$BL_MENU;
  private static final SubLString $str103$bl_menu_gif;
  private static final SubLList $list104;
  private static final SubLSymbol $sym105$RELEVANT_MT_IS_EVERYTHING;
  private static final SubLObject $const106$EverythingPSC;
  private static final SubLSymbol $kw107$RED_DIAMOND;
  private static final SubLString $str108$red_diam_gif;
  private static final SubLList $list109;
  private static final SubLSymbol $sym110$HIERARCHY_LINK;
  private static final SubLSymbol $kw111$HIERARCHY_BROWSER;
  private static final SubLString $str112$hierarchy_browser_gif;
  private static final SubLSymbol $kw113$HIERARCHY_BROWSER_DISABLED;
  private static final SubLString $str114$hierarchy_browser_disabled_gif;
  private static final SubLList $list115;
  private static final SubLSymbol $sym116$HIERARCHY_DEFAULT;
  private static final SubLSymbol $kw117$ALPHA_BROWSER;
  private static final SubLString $str118$alpha_browser_gif;
  private static final SubLSymbol $kw119$ALPHA_BROWSER_DISABLED;
  private static final SubLString $str120$alpha_browser_disabled_gif;
  private static final SubLList $list121;
  private static final SubLSymbol $sym122$ALPHABETICAL_SEARCH;
  private static final SubLSymbol $kw123$PLUS_GREEN;
  private static final SubLString $str124$plus_green_gif;
  private static final SubLString $str125$_LitQ_;
  private static final SubLSymbol $kw126$PLUS_YELLOW;
  private static final SubLString $str127$plus_yellow_gif;
  private static final SubLSymbol $kw128$PLUS_PURPLE;
  private static final SubLString $str129$plus_purple_gif;
  private static final SubLSymbol $kw130$LIKELY;
  private static final SubLSymbol $kw131$KNOWN;
  private static final SubLSymbol $kw132$POSSIBLE;
  private static final SubLSymbol $kw133$INDEX;
  private static final SubLList $list134;
  private static final SubLSymbol $sym135$LITERAL_QUERY_INDEX;
  private static final SubLSymbol $kw136$NORMAL;
  private static final SubLList $list137;
  private static final SubLSymbol $sym138$LITERAL_QUERY_NORMAL;
  private static final SubLSymbol $kw139$INDEX_DISPLAY;
  private static final SubLList $list140;
  private static final SubLSymbol $sym141$LITERAL_QUERY_INDEX_DISPLAY;
  private static final SubLString $str142$_Asserted_Argument_;
  private static final SubLSymbol $sym143$CONVERT_DEDUCTION_TO_FORMULA;
  private static final SubLString $str144$_Assertion_Deductions_;
  private static final SubLSymbol $kw145$BL_SDI;
  private static final SubLString $str146$bl_sdi_gif;
  private static final SubLList $list147;
  private static final SubLSymbol $sym148$ASSERTED_ASSERTION;
  private static final SubLSymbol $kw149$GR_SDI;
  private static final SubLString $str150$gr_sdi_gif;
  private static final SubLList $list151;
  private static final SubLSymbol $sym152$DEDUCED_ASSERTION;
  private static final SubLSymbol $sym153$_DEBUG_ADORNMENTS_P_;
  private static final SubLSymbol $kw154$CB_VIEW_ADORN;
  private static final SubLString $str155$cb_view_adorn_html;
  private static final SubLList $list156;
  private static final SubLString $str157$_a_does_not_specify_an_index;
  private static final SubLString $str158$Adornments;
  private static final SubLString $str159$__DOCTYPE_html_PUBLIC_____W3C__DT;
  private static final SubLString $str160$_meta_http_equiv__X_UA_Compatible;
  private static final SubLSymbol $kw161$UNINITIALIZED;
  private static final SubLSymbol $kw162$CB_CYC;
  private static final SubLSymbol $kw163$SAM_AUTOCOMPLETE_CSS;
  private static final SubLSymbol $kw164$SHA1;
  private static final SubLString $str165$yui_skin_sam;
  private static final SubLString $str166$reloadFrameButton;
  private static final SubLString $str167$button;
  private static final SubLString $str168$reload;
  private static final SubLString $str169$Refresh_Frames;
  private static final SubLString $str170$post;
  private static final SubLString $str171$cb_adornment_handler;
  private static final SubLString $str172$Current_Values;
  private static final SubLString $str173$Update_Adornment_Settings;
  private static final SubLString $str174$Currently_Active_Adornments__;
  private static final SubLString $str175$Adornment_Associations;
  private static final SubLSymbol $kw176$MIDDLE;
  private static final SubLString $str177$Icon;
  private static final SubLString $str178$Active_;
  private static final SubLSymbol $kw179$LEFT;
  private static final SubLString $str180$Name;
  private static final SubLString $str181$Dynamic_;
  private static final SubLString $str182$Has_Link_;
  private static final SubLString $str183$Type;
  private static final SubLString $str184$Tool;
  private static final SubLString $str185$effective_fn;
  private static final SubLSymbol $sym186$ADORNMENT_;
  private static final SubLString $str187$_dddddd;
  private static final SubLString $str188$_cccccc;
  private static final SubLString $str189$_dynamic;
  private static final SubLString $str190$_;
  private static final SubLString $str191$No;
  private static final SubLString $str192$Yes;
  private static final SubLSymbol $kw193$NBSP;
  private static final SubLSymbol $sym194$CB_VIEW_ADORN;
  private static final SubLSymbol $kw195$HTML_HANDLER;
  private static final SubLString $str196$debug;
  private static final SubLString $str197$_;
  private static final SubLString $str198$_;
  private static final SubLString $str199$Active_adornments_have_been_chang;
  private static final SubLSymbol $sym200$CB_ADORNMENT_HANDLER;
  private static final SubLString $str201$_View_Adornments_;
  private static final SubLString $str202$cb_view_adorn__A;
  private static final SubLSymbol $kw203$VIEW_ADORN;
  private static final SubLSymbol $sym204$CB_LINK_VIEW_ADORN;
  private static final SubLString $str205$___;

  @SubLTranslatedFile.SubL(source = "cycl/cb-adornments.lisp", position = 1738L)
  public static SubLObject bookkeeping_assertion_p(final SubLObject assertion)
  {
    return makeBoolean( NIL != assertions_high.gaf_assertionP( assertion ) && NIL != fort_types_interface.bookkeeping_predicate_p( assertions_high.gaf_predicate( assertion ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-adornments.lisp", position = 1957L)
  public static SubLObject documentation_assertion_p(final SubLObject assertion)
  {
    return makeBoolean( NIL != assertions_high.gaf_assertionP( assertion ) && NIL != kb_accessors.documentation_predicate_in_any_mt_p( assertions_high.gaf_predicate( assertion ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-adornments.lisp", position = 2167L)
  public static SubLObject print_adornment(final SubLObject v_object, final SubLObject stream, final SubLObject depth)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != print_high.$print_level$.getDynamicValue( thread ) && depth.numG( print_high.$print_level$.getDynamicValue( thread ) ) )
    {
      print_high.princ( $str2$_, stream );
    }
    else if( NIL != print_high.$print_readably$.getDynamicValue( thread ) )
    {
      print_high.print_not_readable( v_object, stream );
    }
    else
    {
      print_macros.print_unreadable_object_preamble( stream, v_object, T, T );
      print_high.princ( adornment_name( v_object ), stream );
      print_macros.print_unreadable_object_postamble( stream, v_object, NIL, NIL );
    }
    return v_object;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-adornments.lisp", position = 2440L)
  public static SubLObject adornment_print_function_trampoline(final SubLObject v_object, final SubLObject stream)
  {
    print_adornment( v_object, stream, ZERO_INTEGER );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-adornments.lisp", position = 2440L)
  public static SubLObject adornment_p(final SubLObject v_object)
  {
    return ( v_object.getClass() == $adornment_native.class ) ? T : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-adornments.lisp", position = 2440L)
  public static SubLObject adornment_name(final SubLObject v_object)
  {
    assert NIL != adornment_p( v_object ) : v_object;
    return v_object.getField2();
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-adornments.lisp", position = 2440L)
  public static SubLObject adornment_type(final SubLObject v_object)
  {
    assert NIL != adornment_p( v_object ) : v_object;
    return v_object.getField3();
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-adornments.lisp", position = 2440L)
  public static SubLObject adornment_active_p(final SubLObject v_object)
  {
    assert NIL != adornment_p( v_object ) : v_object;
    return v_object.getField4();
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-adornments.lisp", position = 2440L)
  public static SubLObject adornment_image(final SubLObject v_object)
  {
    assert NIL != adornment_p( v_object ) : v_object;
    return v_object.getField5();
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-adornments.lisp", position = 2440L)
  public static SubLObject adornment_image_disabled(final SubLObject v_object)
  {
    assert NIL != adornment_p( v_object ) : v_object;
    return v_object.getField6();
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-adornments.lisp", position = 2440L)
  public static SubLObject adornment_image_alt(final SubLObject v_object)
  {
    assert NIL != adornment_p( v_object ) : v_object;
    return v_object.getField7();
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-adornments.lisp", position = 2440L)
  public static SubLObject adornment_dynamic_tagfn(final SubLObject v_object)
  {
    assert NIL != adornment_p( v_object ) : v_object;
    return v_object.getField8();
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-adornments.lisp", position = 2440L)
  public static SubLObject adornment_color(final SubLObject v_object)
  {
    assert NIL != adornment_p( v_object ) : v_object;
    return v_object.getField9();
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-adornments.lisp", position = 2440L)
  public static SubLObject adornment_letter(final SubLObject v_object)
  {
    assert NIL != adornment_p( v_object ) : v_object;
    return v_object.getField10();
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-adornments.lisp", position = 2440L)
  public static SubLObject adornment_effective_fn(final SubLObject v_object)
  {
    assert NIL != adornment_p( v_object ) : v_object;
    return v_object.getField11();
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-adornments.lisp", position = 2440L)
  public static SubLObject adornment_handler(final SubLObject v_object)
  {
    assert NIL != adornment_p( v_object ) : v_object;
    return v_object.getField12();
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-adornments.lisp", position = 2440L)
  public static SubLObject adornment_tool(final SubLObject v_object)
  {
    assert NIL != adornment_p( v_object ) : v_object;
    return v_object.getField13();
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-adornments.lisp", position = 2440L)
  public static SubLObject adornment_comment(final SubLObject v_object)
  {
    assert NIL != adornment_p( v_object ) : v_object;
    return v_object.getField14();
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-adornments.lisp", position = 2440L)
  public static SubLObject adornment_dynamic_comment(final SubLObject v_object)
  {
    assert NIL != adornment_p( v_object ) : v_object;
    return v_object.getField15();
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-adornments.lisp", position = 2440L)
  public static SubLObject adornment_title(final SubLObject v_object)
  {
    assert NIL != adornment_p( v_object ) : v_object;
    return v_object.getField16();
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-adornments.lisp", position = 2440L)
  public static SubLObject _csetf_adornment_name(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != adornment_p( v_object ) : v_object;
    return v_object.setField2( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-adornments.lisp", position = 2440L)
  public static SubLObject _csetf_adornment_type(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != adornment_p( v_object ) : v_object;
    return v_object.setField3( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-adornments.lisp", position = 2440L)
  public static SubLObject _csetf_adornment_active_p(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != adornment_p( v_object ) : v_object;
    return v_object.setField4( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-adornments.lisp", position = 2440L)
  public static SubLObject _csetf_adornment_image(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != adornment_p( v_object ) : v_object;
    return v_object.setField5( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-adornments.lisp", position = 2440L)
  public static SubLObject _csetf_adornment_image_disabled(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != adornment_p( v_object ) : v_object;
    return v_object.setField6( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-adornments.lisp", position = 2440L)
  public static SubLObject _csetf_adornment_image_alt(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != adornment_p( v_object ) : v_object;
    return v_object.setField7( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-adornments.lisp", position = 2440L)
  public static SubLObject _csetf_adornment_dynamic_tagfn(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != adornment_p( v_object ) : v_object;
    return v_object.setField8( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-adornments.lisp", position = 2440L)
  public static SubLObject _csetf_adornment_color(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != adornment_p( v_object ) : v_object;
    return v_object.setField9( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-adornments.lisp", position = 2440L)
  public static SubLObject _csetf_adornment_letter(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != adornment_p( v_object ) : v_object;
    return v_object.setField10( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-adornments.lisp", position = 2440L)
  public static SubLObject _csetf_adornment_effective_fn(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != adornment_p( v_object ) : v_object;
    return v_object.setField11( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-adornments.lisp", position = 2440L)
  public static SubLObject _csetf_adornment_handler(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != adornment_p( v_object ) : v_object;
    return v_object.setField12( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-adornments.lisp", position = 2440L)
  public static SubLObject _csetf_adornment_tool(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != adornment_p( v_object ) : v_object;
    return v_object.setField13( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-adornments.lisp", position = 2440L)
  public static SubLObject _csetf_adornment_comment(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != adornment_p( v_object ) : v_object;
    return v_object.setField14( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-adornments.lisp", position = 2440L)
  public static SubLObject _csetf_adornment_dynamic_comment(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != adornment_p( v_object ) : v_object;
    return v_object.setField15( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-adornments.lisp", position = 2440L)
  public static SubLObject _csetf_adornment_title(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != adornment_p( v_object ) : v_object;
    return v_object.setField16( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-adornments.lisp", position = 2440L)
  public static SubLObject make_adornment(SubLObject arglist)
  {
    if( arglist == UNPROVIDED )
    {
      arglist = NIL;
    }
    final SubLObject v_new = new $adornment_native();
    SubLObject next;
    SubLObject current_arg;
    SubLObject current_value;
    SubLObject pcase_var;
    for( next = NIL, next = arglist; NIL != next; next = conses_high.cddr( next ) )
    {
      current_arg = next.first();
      current_value = conses_high.cadr( next );
      pcase_var = current_arg;
      if( pcase_var.eql( $kw42$NAME ) )
      {
        _csetf_adornment_name( v_new, current_value );
      }
      else if( pcase_var.eql( $kw43$TYPE ) )
      {
        _csetf_adornment_type( v_new, current_value );
      }
      else if( pcase_var.eql( $kw44$ACTIVE_P ) )
      {
        _csetf_adornment_active_p( v_new, current_value );
      }
      else if( pcase_var.eql( $kw45$IMAGE ) )
      {
        _csetf_adornment_image( v_new, current_value );
      }
      else if( pcase_var.eql( $kw46$IMAGE_DISABLED ) )
      {
        _csetf_adornment_image_disabled( v_new, current_value );
      }
      else if( pcase_var.eql( $kw47$IMAGE_ALT ) )
      {
        _csetf_adornment_image_alt( v_new, current_value );
      }
      else if( pcase_var.eql( $kw48$DYNAMIC_TAGFN ) )
      {
        _csetf_adornment_dynamic_tagfn( v_new, current_value );
      }
      else if( pcase_var.eql( $kw49$COLOR ) )
      {
        _csetf_adornment_color( v_new, current_value );
      }
      else if( pcase_var.eql( $kw50$LETTER ) )
      {
        _csetf_adornment_letter( v_new, current_value );
      }
      else if( pcase_var.eql( $kw51$EFFECTIVE_FN ) )
      {
        _csetf_adornment_effective_fn( v_new, current_value );
      }
      else if( pcase_var.eql( $kw52$HANDLER ) )
      {
        _csetf_adornment_handler( v_new, current_value );
      }
      else if( pcase_var.eql( $kw53$TOOL ) )
      {
        _csetf_adornment_tool( v_new, current_value );
      }
      else if( pcase_var.eql( $kw54$COMMENT ) )
      {
        _csetf_adornment_comment( v_new, current_value );
      }
      else if( pcase_var.eql( $kw55$DYNAMIC_COMMENT ) )
      {
        _csetf_adornment_dynamic_comment( v_new, current_value );
      }
      else if( pcase_var.eql( $kw56$TITLE ) )
      {
        _csetf_adornment_title( v_new, current_value );
      }
      else
      {
        Errors.error( $str57$Invalid_slot__S_for_construction_, current_arg );
      }
    }
    return v_new;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-adornments.lisp", position = 2440L)
  public static SubLObject visit_defstruct_adornment(final SubLObject obj, final SubLObject visitor_fn)
  {
    Functions.funcall( visitor_fn, obj, $kw58$BEGIN, $sym59$MAKE_ADORNMENT, FIFTEEN_INTEGER );
    Functions.funcall( visitor_fn, obj, $kw60$SLOT, $kw42$NAME, adornment_name( obj ) );
    Functions.funcall( visitor_fn, obj, $kw60$SLOT, $kw43$TYPE, adornment_type( obj ) );
    Functions.funcall( visitor_fn, obj, $kw60$SLOT, $kw44$ACTIVE_P, adornment_active_p( obj ) );
    Functions.funcall( visitor_fn, obj, $kw60$SLOT, $kw45$IMAGE, adornment_image( obj ) );
    Functions.funcall( visitor_fn, obj, $kw60$SLOT, $kw46$IMAGE_DISABLED, adornment_image_disabled( obj ) );
    Functions.funcall( visitor_fn, obj, $kw60$SLOT, $kw47$IMAGE_ALT, adornment_image_alt( obj ) );
    Functions.funcall( visitor_fn, obj, $kw60$SLOT, $kw48$DYNAMIC_TAGFN, adornment_dynamic_tagfn( obj ) );
    Functions.funcall( visitor_fn, obj, $kw60$SLOT, $kw49$COLOR, adornment_color( obj ) );
    Functions.funcall( visitor_fn, obj, $kw60$SLOT, $kw50$LETTER, adornment_letter( obj ) );
    Functions.funcall( visitor_fn, obj, $kw60$SLOT, $kw51$EFFECTIVE_FN, adornment_effective_fn( obj ) );
    Functions.funcall( visitor_fn, obj, $kw60$SLOT, $kw52$HANDLER, adornment_handler( obj ) );
    Functions.funcall( visitor_fn, obj, $kw60$SLOT, $kw53$TOOL, adornment_tool( obj ) );
    Functions.funcall( visitor_fn, obj, $kw60$SLOT, $kw54$COMMENT, adornment_comment( obj ) );
    Functions.funcall( visitor_fn, obj, $kw60$SLOT, $kw55$DYNAMIC_COMMENT, adornment_dynamic_comment( obj ) );
    Functions.funcall( visitor_fn, obj, $kw60$SLOT, $kw56$TITLE, adornment_title( obj ) );
    Functions.funcall( visitor_fn, obj, $kw61$END, $sym59$MAKE_ADORNMENT, FIFTEEN_INTEGER );
    return obj;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-adornments.lisp", position = 2440L)
  public static SubLObject visit_defstruct_object_adornment_method(final SubLObject obj, final SubLObject visitor_fn)
  {
    return visit_defstruct_adornment( obj, visitor_fn );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-adornments.lisp", position = 5081L)
  public static SubLObject active_adornment_struct_p(final SubLObject adornment, SubLObject type)
  {
    if( type == UNPROVIDED )
    {
      type = $adornment_type$.getDynamicValue();
    }
    if( NIL != type )
    {
      if( adornment_type( adornment ).eql( type ) && NIL != active_adornment_p( adornment ) )
      {
        return ConsesLow.list( adornment );
      }
    }
    else if( NIL != active_adornment_p( adornment ) )
    {
      return ConsesLow.list( adornment );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-adornments.lisp", position = 5403L)
  public static SubLObject active_adornment_p(final SubLObject adornment)
  {
    final SubLObject active_p = adornment_active_p( adornment );
    if( active_p.isFunctionSpec() )
    {
      return Functions.funcall( active_p );
    }
    return active_p;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-adornments.lisp", position = 5626L)
  public static SubLObject enable_adornment(final SubLObject adornment_name, SubLObject enable_p)
  {
    if( enable_p == UNPROVIDED )
    {
      enable_p = T;
    }
    final SubLObject adornment = find_adornment( adornment_name );
    if( NIL != adornment )
    {
      _csetf_adornment_active_p( adornment, enable_p );
      return enable_p;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-adornments.lisp", position = 5893L)
  public static SubLObject defadornment(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject name = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list64 );
    name = current.first();
    final SubLObject arglist;
    current = ( arglist = current.rest() );
    final SubLObject old = $sym65$OLD;
    final SubLObject v_new = $sym66$NEW;
    return ConsesLow.list( $sym67$CLET, ConsesLow.list( reader.bq_cons( old, $list68 ), ConsesLow.list( v_new, ConsesLow.list( $sym59$MAKE_ADORNMENT, ConsesLow.list( $sym69$QUOTE, arglist ) ) ) ), ConsesLow.list(
        $sym70$CSETF, ConsesLow.list( $sym12$ADORNMENT_NAME, v_new ), ConsesLow.list( $sym69$QUOTE, name ) ), ConsesLow.list( $sym71$CSETQ, $sym63$_CB_ADORNMENT_TABLE_, ConsesLow.list( $sym72$CONS, v_new, ConsesLow
            .listS( $sym73$DELETE, ConsesLow.list( $sym69$QUOTE, name ), old, $list74 ) ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-adornments.lisp", position = 6538L)
  public static SubLObject find_adornment(final SubLObject name)
  {
    return Sequences.find( name, $cb_adornment_table$.getGlobalValue(), Symbols.symbol_function( EQUAL ), Symbols.symbol_function( $sym12$ADORNMENT_NAME ), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-adornments.lisp", position = 6646L)
  public static SubLObject active_adornments(final SubLObject type)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject result = NIL;
    final SubLObject _prev_bind_0 = $adornment_type$.currentBinding( thread );
    try
    {
      $adornment_type$.bind( type, thread );
      result = Mapping.mapcan( Symbols.symbol_function( $sym75$ACTIVE_ADORNMENT_STRUCT_P ), $cb_adornment_table$.getGlobalValue(), EMPTY_SUBL_OBJECT_ARRAY );
    }
    finally
    {
      $adornment_type$.rebind( _prev_bind_0, thread );
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-adornments.lisp", position = 6887L)
  public static SubLObject id_for_type(final SubLObject type, final SubLObject thingo)
  {
    if( type.eql( $kw76$ASSERTION ) )
    {
      return assertion_handles.assertion_id( thingo );
    }
    if( type.eql( $kw77$DEDUCTION ) )
    {
      return deduction_handles.deduction_id( thingo );
    }
    if( type.eql( $kw78$INDEX_CONSTANT_NAME ) )
    {
      return constants_high.constant_name( thingo );
    }
    if( type.eql( $kw79$INDEX_FORT ) || type.eql( $kw80$INDEX_CONSTANT ) || type.eql( $kw81$CONSTANT ) || type.eql( $kw82$GAF_ARG_PREDICATE ) )
    {
      return cb_utilities.cb_fort_identifier( thingo );
    }
    if( type.eql( $kw83$INDEX_TERM ) )
    {
      return cb_utilities.cb_term_identifier( thingo );
    }
    return cb_utilities.cb_term_identifier( thingo );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-adornments.lisp", position = 7359L)
  public static SubLObject calc_adornment_image_alt(final SubLObject adornment, final SubLObject thingo, SubLObject arg, SubLObject pred)
  {
    if( arg == UNPROVIDED )
    {
      arg = NIL;
    }
    if( pred == UNPROVIDED )
    {
      pred = NIL;
    }
    final SubLObject image_alt = adornment_image_alt( adornment );
    if( NIL == image_alt || image_alt.isString() )
    {
      return image_alt;
    }
    if( NIL != arg )
    {
      return Functions.funcall( adornment_image_alt( adornment ), thingo, arg, pred );
    }
    return Functions.funcall( adornment_image_alt( adornment ), thingo );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-adornments.lisp", position = 7729L)
  public static SubLObject display_linked_adornment(final SubLObject adornment, final SubLObject type, final SubLObject thingo, final SubLObject arg, final SubLObject pred, final SubLObject mt)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject handler = adornment_handler( adornment );
    final SubLObject id = id_for_type( type, thingo );
    final SubLObject image = adornment_image( adornment );
    final SubLObject alt = calc_adornment_image_alt( adornment, thingo, arg, pred );
    if( $adornment_display$.getDynamicValue( thread ).eql( $kw84$TOP ) )
    {
      handler = Sequences.cconcatenate( $str85$cb_start_, handler );
    }
    SubLObject handler_string = Sequences.cconcatenate( format_nil.format_nil_a_no_copy( handler ), new SubLObject[] { $str86$_, format_nil.format_nil_a_no_copy( id )
    } );
    final SubLObject title = adornment_title( adornment );
    if( NIL != arg )
    {
      if( NIL != mt )
      {
        handler_string = Sequences.cconcatenate( format_nil.format_nil_a_no_copy( handler_string ), new SubLObject[] { $str86$_, format_nil.format_nil_a_no_copy( arg ), $str86$_, format_nil.format_nil_a_no_copy(
            cb_utilities.cb_fort_identifier( pred ) ), $str86$_, format_nil.format_nil_a_no_copy( cb_utilities.cb_fort_identifier( mt ) )
        } );
      }
      else
      {
        handler_string = Sequences.cconcatenate( format_nil.format_nil_a_no_copy( handler_string ), new SubLObject[] { $str86$_, format_nil.format_nil_a_no_copy( arg ), $str86$_, format_nil.format_nil_a_no_copy(
            cb_utilities.cb_fort_identifier( pred ) )
        } );
      }
    }
    if( NIL != image )
    {
      final SubLObject resolved_image = resolved_adornment_image( image, adornment, thingo, arg, pred );
      final SubLObject frame_name_var = cb_utilities.cb_frame_name( $adornment_display$.getDynamicValue( thread ) );
      html_utilities.html_markup( html_macros.$html_anchor_head$.getGlobalValue() );
      html_utilities.html_markup( html_macros.$html_anchor_href$.getGlobalValue() );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      cb_parameters.cyc_cgi_url_int();
      html_utilities.html_princ( handler_string );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      if( NIL != title )
      {
        html_utilities.html_markup( html_macros.$html_anchor_title$.getGlobalValue() );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        html_utilities.html_markup( title );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      }
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
        html_utilities.html_basic_image( resolved_image, alt, $kw87$CENTER, UNPROVIDED );
      }
      finally
      {
        html_macros.$html_safe_print$.rebind( _prev_bind_0, thread );
      }
      html_utilities.html_markup( html_macros.$html_anchor_tail$.getGlobalValue() );
    }
    else
    {
      final SubLObject frame_name_var2 = cb_utilities.cb_frame_name( $adornment_display$.getDynamicValue( thread ) );
      html_utilities.html_markup( html_macros.$html_anchor_head$.getGlobalValue() );
      html_utilities.html_markup( html_macros.$html_anchor_href$.getGlobalValue() );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      cb_parameters.cyc_cgi_url_int();
      html_utilities.html_princ( handler_string );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      if( NIL != title )
      {
        html_utilities.html_markup( html_macros.$html_anchor_title$.getGlobalValue() );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        html_utilities.html_markup( title );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      }
      if( NIL != frame_name_var2 )
      {
        html_utilities.html_markup( html_macros.$html_anchor_target$.getGlobalValue() );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        html_utilities.html_markup( frame_name_var2 );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      }
      html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
      final SubLObject _prev_bind_2 = html_macros.$html_safe_print$.currentBinding( thread );
      try
      {
        html_macros.$html_safe_print$.bind( T, thread );
        final SubLObject color = adornment_color( adornment );
        html_utilities.html_markup( html_macros.$html_font_head$.getGlobalValue() );
        if( NIL != color )
        {
          html_utilities.html_markup( html_macros.$html_font_color$.getGlobalValue() );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_markup( html_utilities.html_color( color ) );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        }
        html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
        final SubLObject _prev_bind_0_$1 = html_macros.$html_safe_print$.currentBinding( thread );
        try
        {
          html_macros.$html_safe_print$.bind( T, thread );
          html_utilities.html_princ( adornment_letter( adornment ) );
        }
        finally
        {
          html_macros.$html_safe_print$.rebind( _prev_bind_0_$1, thread );
        }
        html_utilities.html_markup( html_macros.$html_font_tail$.getGlobalValue() );
      }
      finally
      {
        html_macros.$html_safe_print$.rebind( _prev_bind_2, thread );
      }
      html_utilities.html_markup( html_macros.$html_anchor_tail$.getGlobalValue() );
    }
    return thingo;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-adornments.lisp", position = 9136L)
  public static SubLObject display_adornment_disabled(final SubLObject adornment, SubLObject type, SubLObject thingo, SubLObject arg, SubLObject pred, SubLObject mt)
  {
    if( type == UNPROVIDED )
    {
      type = NIL;
    }
    if( thingo == UNPROVIDED )
    {
      thingo = NIL;
    }
    if( arg == UNPROVIDED )
    {
      arg = NIL;
    }
    if( pred == UNPROVIDED )
    {
      pred = NIL;
    }
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    final SubLObject image = resolved_adornment_image( adornment_image_disabled( adornment ), adornment, thingo, arg, pred );
    html_utilities.html_basic_image( image, calc_adornment_image_alt( adornment, thingo, arg, pred ), $kw84$TOP, UNPROVIDED );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-adornments.lisp", position = 9456L)
  public static SubLObject display_adornment(final SubLObject adornment, SubLObject type, SubLObject thingo, SubLObject arg, SubLObject pred, SubLObject mt)
  {
    if( type == UNPROVIDED )
    {
      type = NIL;
    }
    if( thingo == UNPROVIDED )
    {
      thingo = NIL;
    }
    if( arg == UNPROVIDED )
    {
      arg = NIL;
    }
    if( pred == UNPROVIDED )
    {
      pred = NIL;
    }
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject image = adornment_image( adornment );
    if( NIL != adornment_handler( adornment ) && NIL != thingo )
    {
      display_linked_adornment( adornment, type, thingo, arg, pred, mt );
    }
    else if( NIL != image )
    {
      final SubLObject resolved_image = resolved_adornment_image( image, adornment, thingo, arg, pred );
      html_utilities.html_basic_image( resolved_image, calc_adornment_image_alt( adornment, thingo, arg, pred ), $kw84$TOP, UNPROVIDED );
    }
    else
    {
      final SubLObject color = adornment_color( adornment );
      html_utilities.html_markup( html_macros.$html_font_head$.getGlobalValue() );
      if( NIL != color )
      {
        html_utilities.html_markup( html_macros.$html_font_color$.getGlobalValue() );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        html_utilities.html_markup( html_utilities.html_color( color ) );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      }
      html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
      final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding( thread );
      try
      {
        html_macros.$html_safe_print$.bind( T, thread );
        html_utilities.html_princ( adornment_letter( adornment ) );
      }
      finally
      {
        html_macros.$html_safe_print$.rebind( _prev_bind_0, thread );
      }
      html_utilities.html_markup( html_macros.$html_font_tail$.getGlobalValue() );
    }
    return thingo;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-adornments.lisp", position = 10176L)
  public static SubLObject display_active_adornments(SubLObject type)
  {
    if( type == UNPROVIDED )
    {
      type = NIL;
    }
    Mapping.mapc( Symbols.symbol_function( $sym88$DISPLAY_ADORNMENT ), active_adornments( type ), EMPTY_SUBL_OBJECT_ARRAY );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-adornments.lisp", position = 10305L)
  public static SubLObject resolved_adornment_image(final SubLObject image, SubLObject adornment, SubLObject thingo, SubLObject arg, SubLObject pred)
  {
    if( adornment == UNPROVIDED )
    {
      adornment = NIL;
    }
    if( thingo == UNPROVIDED )
    {
      thingo = NIL;
    }
    if( arg == UNPROVIDED )
    {
      arg = NIL;
    }
    if( pred == UNPROVIDED )
    {
      pred = NIL;
    }
    if( NIL != adornment && !assertionsDisabledInClass && NIL == adornment_p( adornment ) )
    {
      throw new AssertionError( adornment );
    }
    if( image.isKeyword() )
    {
      return cyc_file_dependencies.cb_icon_src( image );
    }
    if( image.isString() )
    {
      return image;
    }
    if( image.isFunctionSpec() )
    {
      return resolved_adornment_image( Functions.funcall( image, ( NIL != thingo ) ? adorn_thingo_p( adornment, thingo, arg, pred ) : NIL ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    }
    return cyc_file_dependencies.cb_missing_icon();
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-adornments.lisp", position = 10922L)
  public static SubLObject adorn_thingo_p(final SubLObject adornment, final SubLObject thingo, SubLObject arg, SubLObject pred)
  {
    if( arg == UNPROVIDED )
    {
      arg = NIL;
    }
    if( pred == UNPROVIDED )
    {
      pred = NIL;
    }
    if( !adornment_effective_fn( adornment ).isFunctionSpec() )
    {
      return NIL;
    }
    if( NIL != arg )
    {
      return Functions.funcall( adornment_effective_fn( adornment ), thingo, arg, pred );
    }
    return Functions.funcall( adornment_effective_fn( adornment ), thingo );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-adornments.lisp", position = 11285L)
  public static SubLObject activate_adornment(final SubLObject adornment)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject thingo = $adorn_thingo$.getDynamicValue( thread );
    final SubLObject arg = $adorn_arg$.getDynamicValue( thread );
    final SubLObject pred = $adorn_pred$.getDynamicValue( thread );
    final SubLObject mt = $adorn_mt$.getDynamicValue( thread );
    final SubLObject type = $adornment_type$.getDynamicValue( thread );
    if( NIL != adorn_thingo_p( adornment, thingo, arg, pred ) )
    {
      display_adornment( adornment, type, thingo, arg, pred, mt );
      return T;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-adornments.lisp", position = 11634L)
  public static SubLObject handle_adornments(final SubLObject type, final SubLObject adornment_display, final SubLObject thingo, SubLObject arg, SubLObject pred, SubLObject mt)
  {
    if( arg == UNPROVIDED )
    {
      arg = NIL;
    }
    if( pred == UNPROVIDED )
    {
      pred = NIL;
    }
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject active_adornments = active_adornments( type );
    final SubLObject _prev_bind_0 = $adornment_display$.currentBinding( thread );
    final SubLObject _prev_bind_2 = $adorn_thingo$.currentBinding( thread );
    final SubLObject _prev_bind_3 = $adorn_arg$.currentBinding( thread );
    final SubLObject _prev_bind_4 = $adorn_pred$.currentBinding( thread );
    final SubLObject _prev_bind_5 = $adorn_mt$.currentBinding( thread );
    final SubLObject _prev_bind_6 = $adornment_type$.currentBinding( thread );
    try
    {
      $adornment_display$.bind( adornment_display, thread );
      $adorn_thingo$.bind( thingo, thread );
      $adorn_arg$.bind( arg, thread );
      $adorn_pred$.bind( pred, thread );
      $adorn_mt$.bind( mt, thread );
      $adornment_type$.bind( type, thread );
      Mapping.mapc( $sym89$ACTIVATE_ADORNMENT, active_adornments, EMPTY_SUBL_OBJECT_ARRAY );
    }
    finally
    {
      $adornment_type$.rebind( _prev_bind_6, thread );
      $adorn_mt$.rebind( _prev_bind_5, thread );
      $adorn_pred$.rebind( _prev_bind_4, thread );
      $adorn_arg$.rebind( _prev_bind_3, thread );
      $adorn_thingo$.rebind( _prev_bind_2, thread );
      $adornment_display$.rebind( _prev_bind_0, thread );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-adornments.lisp", position = 12080L)
  public static SubLObject handle_specific_adornment(final SubLObject type, final SubLObject name, final SubLObject adornment_display, final SubLObject thingo, SubLObject arg, SubLObject pred, SubLObject mt)
  {
    if( arg == UNPROVIDED )
    {
      arg = NIL;
    }
    if( pred == UNPROVIDED )
    {
      pred = NIL;
    }
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject _prev_bind_0 = $adornment_display$.currentBinding( thread );
    final SubLObject _prev_bind_2 = $adorn_thingo$.currentBinding( thread );
    final SubLObject _prev_bind_3 = $adorn_arg$.currentBinding( thread );
    final SubLObject _prev_bind_4 = $adorn_pred$.currentBinding( thread );
    final SubLObject _prev_bind_5 = $adorn_mt$.currentBinding( thread );
    final SubLObject _prev_bind_6 = $adornment_type$.currentBinding( thread );
    try
    {
      $adornment_display$.bind( adornment_display, thread );
      $adorn_thingo$.bind( thingo, thread );
      $adorn_arg$.bind( arg, thread );
      $adorn_pred$.bind( pred, thread );
      $adorn_mt$.bind( mt, thread );
      $adornment_type$.bind( type, thread );
      final SubLObject adornment = find_adornment( name );
      if( NIL != active_adornment_struct_p( adornment, type ) )
      {
        activate_adornment( adornment );
      }
    }
    finally
    {
      $adornment_type$.rebind( _prev_bind_6, thread );
      $adorn_mt$.rebind( _prev_bind_5, thread );
      $adorn_pred$.rebind( _prev_bind_4, thread );
      $adorn_arg$.rebind( _prev_bind_3, thread );
      $adorn_thingo$.rebind( _prev_bind_2, thread );
      $adornment_display$.rebind( _prev_bind_0, thread );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-adornments.lisp", position = 14279L)
  public static SubLObject cb_include_hierarchy_linkP(final SubLObject arg, final SubLObject predicate)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != subl_promotions.memberP( arg, $list104, UNPROVIDED, UNPROVIDED ) )
    {
      SubLObject transitiveP = NIL;
      final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
      final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
      try
      {
        mt_relevance_macros.$relevant_mt_function$.bind( $sym105$RELEVANT_MT_IS_EVERYTHING, thread );
        mt_relevance_macros.$mt$.bind( $const106$EverythingPSC, thread );
        transitiveP = kb_accessors.transitive_predicateP( predicate );
      }
      finally
      {
        mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
        mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
      }
      return transitiveP;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-adornments.lisp", position = 14655L)
  public static SubLObject hierarchy_link_effective_fn(final SubLObject index_hook, final SubLObject arg, final SubLObject pred)
  {
    return makeBoolean( NIL != forts.fort_p( index_hook ) && NIL != cb_include_hierarchy_linkP( arg, pred ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-adornments.lisp", position = 15720L)
  public static SubLObject cb_show_alphabetic_searchP(final SubLObject fort)
  {
    return constant_handles.constant_p( fort );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-adornments.lisp", position = 16583L)
  public static SubLObject literal_query_index_effective_fn(final SubLObject index_hook, final SubLObject arg, final SubLObject pred, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( NIL != forts.fort_p( index_hook ) )
    {
      return cb_query.cb_include_literal_query_linkP( index_hook, arg, pred, $kw133$INDEX );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-adornments.lisp", position = 17181L)
  public static SubLObject literal_query_normal_effective_fn(final SubLObject index_hook, final SubLObject arg, final SubLObject pred)
  {
    if( NIL != forts.fort_p( index_hook ) )
    {
      return cb_query.cb_include_literal_query_linkP( index_hook, arg, pred, $kw136$NORMAL );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-adornments.lisp", position = 17358L)
  public static SubLObject literal_query_marker_else_green(final SubLObject type)
  {
    if( NIL != type )
    {
      return type;
    }
    return $kw123$PLUS_GREEN;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-adornments.lisp", position = 17473L)
  public static SubLObject literal_query_marker_else_yellow(final SubLObject type)
  {
    if( NIL != type )
    {
      return type;
    }
    return $kw126$PLUS_YELLOW;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-adornments.lisp", position = 17636L)
  public static SubLObject literal_query_marker_else_purple(final SubLObject type)
  {
    if( NIL != type )
    {
      return type;
    }
    return $kw128$PLUS_PURPLE;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-adornments.lisp", position = 18266L)
  public static SubLObject literal_query_index_display_effective_fn(final SubLObject index_hook, final SubLObject arg, final SubLObject pred)
  {
    if( NIL != forts.fort_p( index_hook ) )
    {
      return cb_query.cb_include_literal_query_linkP( index_hook, arg, pred, $kw139$INDEX_DISPLAY );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-adornments.lisp", position = 18956L)
  public static SubLObject cb_get_asserted_argument(final SubLObject assertion)
  {
    if( NIL != assertion )
    {
      return assertions_high.get_asserted_argument( assertion );
    }
    return $str142$_Asserted_Argument_;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-adornments.lisp", position = 19232L)
  public static SubLObject convert_deduction_to_formula(final SubLObject deduction)
  {
    final SubLObject assertion = deductions_high.deduction_assertion( deduction );
    return uncanonicalizer.assertion_el_formula( assertion );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-adornments.lisp", position = 19391L)
  public static SubLObject cb_assertion_deductions(final SubLObject assertion)
  {
    if( NIL != assertion )
    {
      return Mapping.mapcar( Symbols.symbol_function( $sym143$CONVERT_DEDUCTION_TO_FORMULA ), assertions_high.assertion_deductions( assertion ) );
    }
    return $str144$_Assertion_Deductions_;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-adornments.lisp", position = 20531L)
  public static SubLObject adornmentL(final SubLObject adornment1, final SubLObject adornment2)
  {
    final SubLObject pos1 = Sequences.position( adornment_name( adornment1 ), $adornment_sorted_list$.getGlobalValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    final SubLObject pos2 = Sequences.position( adornment_name( adornment2 ), $adornment_sorted_list$.getGlobalValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    if( NIL == pos1 || NIL == pos2 )
    {
      return NIL;
    }
    return Numbers.numL( pos1, pos2 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-adornments.lisp", position = 20874L)
  public static SubLObject cb_view_adorn(SubLObject args)
  {
    if( args == UNPROVIDED )
    {
      args = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject current;
    final SubLObject datum = current = args;
    SubLObject index_spec = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list156 );
    index_spec = current.first();
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject index_hook = cb_utilities.cb_guess_index( index_spec );
      if( NIL == cb_utilities.cb_index_hook_p( index_hook ) )
      {
        cb_utilities.cb_error( $str157$_a_does_not_specify_an_index, index_hook, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
        return NIL;
      }
      final SubLObject title_var = $str158$Adornments;
      final SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding( thread );
      try
      {
        html_macros.$html_id_space_id_generator$.bind( ( NIL != integer_sequence_generator.integer_sequence_generator_p( html_macros.$html_id_space_id_generator$.getDynamicValue( thread ) ) )
            ? html_macros.$html_id_space_id_generator$.getDynamicValue( thread )
            : integer_sequence_generator.new_integer_sequence_generator( UNPROVIDED, UNPROVIDED, UNPROVIDED ), thread );
        html_utilities.html_markup( $str159$__DOCTYPE_html_PUBLIC_____W3C__DT );
        if( NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue( thread ) )
        {
          html_utilities.html_source_readability_terpri( UNPROVIDED );
          html_utilities.html_markup( $str160$_meta_http_equiv__X_UA_Compatible );
        }
        html_utilities.html_source_readability_terpri( UNPROVIDED );
        final SubLObject _prev_bind_0_$2 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding( thread );
        try
        {
          cyc_file_dependencies.$html_emitted_file_dependencies$.bind( ( cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue( thread ) == $kw161$UNINITIALIZED ) ? ConsesLow.list(
              EMPTY_SUBL_OBJECT_ARRAY ) : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue( thread ), thread );
          html_utilities.html_markup( html_macros.$html_html_head$.getGlobalValue() );
          html_utilities.html_markup( html_macros.$html_head_head$.getGlobalValue() );
          html_macros.html_head_content_type();
          cb_parameters.cb_head_shortcut_icon();
          html_utilities.html_meta_robot_instructions( cb_parameters.$cb_permit_robots_to_indexP$.getDynamicValue( thread ), cb_parameters.$cb_permit_robots_to_followP$.getDynamicValue( thread ) );
          cyc_file_dependencies.css( $kw162$CB_CYC );
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
          final SubLObject _prev_bind_0_$3 = html_macros.$html_inside_bodyP$.currentBinding( thread );
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
            html_utilities.html_markup( $str165$yui_skin_sam );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            final SubLObject _prev_bind_0_$4 = html_macros.$html_safe_print$.currentBinding( thread );
            try
            {
              html_macros.$html_safe_print$.bind( T, thread );
              html_utilities.html_markup( html_macros.$html_div_head$.getGlobalValue() );
              html_utilities.html_markup( html_macros.$html_attribute_id$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( $str166$reloadFrameButton );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
              final SubLObject _prev_bind_0_$5 = html_macros.$html_safe_print$.currentBinding( thread );
              try
              {
                html_macros.$html_safe_print$.bind( T, thread );
                html_utilities.html_markup( html_macros.$html_input_head$.getGlobalValue() );
                html_utilities.html_markup( html_macros.$html_input_type$.getGlobalValue() );
                html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                html_utilities.html_markup( $str167$button );
                html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                html_utilities.html_markup( html_macros.$html_input_name$.getGlobalValue() );
                html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                html_utilities.html_markup( $str168$reload );
                html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                html_utilities.html_markup( html_macros.$html_input_value$.getGlobalValue() );
                html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                html_utilities.html_princ( $str169$Refresh_Frames );
                html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                if( NIL != html_macros.$html_input_disabledP$.getDynamicValue( thread ) )
                {
                  html_utilities.html_simple_attribute( html_macros.$html_input_disabled$.getGlobalValue() );
                }
                html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
              }
              finally
              {
                html_macros.$html_safe_print$.rebind( _prev_bind_0_$5, thread );
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
              html_utilities.html_markup( $str170$post );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              if( NIL != frame_name_var )
              {
                html_utilities.html_markup( html_macros.$html_form_target$.getGlobalValue() );
                html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                html_utilities.html_markup( frame_name_var );
                html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              }
              html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
              final SubLObject _prev_bind_0_$6 = html_macros.$html_safe_print$.currentBinding( thread );
              final SubLObject _prev_bind_2 = html_macros.$within_html_form$.currentBinding( thread );
              final SubLObject _prev_bind_3 = html_macros.$html_form_field_uniquifier_code$.currentBinding( thread );
              try
              {
                html_macros.$html_safe_print$.bind( T, thread );
                html_macros.$within_html_form$.bind( T, thread );
                html_macros.$html_form_field_uniquifier_code$.bind( html_macros.next_html_form_field_uniquifier_code(), thread );
                html_utilities.html_hidden_input( $str171$cb_adornment_handler, T, UNPROVIDED );
                cb_utilities.cb_help_preamble( $kw154$CB_VIEW_ADORN, UNPROVIDED, UNPROVIDED );
                html_utilities.html_newline( TWO_INTEGER );
                html_utilities.html_reset_input( $str172$Current_Values );
                html_utilities.html_indent( UNPROVIDED );
                html_utilities.html_submit_input( $str173$Update_Adornment_Settings, UNPROVIDED, UNPROVIDED );
                html_utilities.html_newline( UNPROVIDED );
                html_utilities.html_hr( UNPROVIDED, UNPROVIDED );
                html_utilities.html_newline( UNPROVIDED );
                html_utilities.html_markup( html_macros.$html_strong_head$.getGlobalValue() );
                html_utilities.html_princ( $str174$Currently_Active_Adornments__ );
                html_utilities.html_markup( html_macros.$html_strong_tail$.getGlobalValue() );
                display_active_adornments( UNPROVIDED );
                html_utilities.html_newline( TWO_INTEGER );
                html_utilities.html_markup( html_macros.$html_strong_head$.getGlobalValue() );
                html_utilities.html_princ( $str175$Adornment_Associations );
                html_utilities.html_markup( html_macros.$html_strong_tail$.getGlobalValue() );
                html_utilities.html_newline( UNPROVIDED );
                html_utilities.html_markup( html_macros.$html_table_head$.getGlobalValue() );
                html_utilities.html_markup( html_macros.$html_table_border$.getGlobalValue() );
                html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                html_utilities.html_markup( TWO_INTEGER );
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
                final SubLObject _prev_bind_0_$7 = html_macros.$html_safe_print$.currentBinding( thread );
                try
                {
                  html_macros.$html_safe_print$.bind( T, thread );
                  html_utilities.html_markup( html_macros.$html_table_row_head$.getGlobalValue() );
                  html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
                  final SubLObject _prev_bind_0_$8 = html_macros.$html_safe_print$.currentBinding( thread );
                  try
                  {
                    html_macros.$html_safe_print$.bind( T, thread );
                    html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
                    html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
                    final SubLObject _prev_bind_0_$9 = html_macros.$html_safe_print$.currentBinding( thread );
                    try
                    {
                      html_macros.$html_safe_print$.bind( T, thread );
                      html_utilities.html_markup( html_macros.$html_table_head$.getGlobalValue() );
                      html_utilities.html_simple_attribute( html_macros.$html_table_noflow$.getGlobalValue() );
                      html_utilities.html_markup( html_macros.$html_table_border$.getGlobalValue() );
                      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                      html_utilities.html_markup( ZERO_INTEGER );
                      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                      html_utilities.html_markup( html_macros.$html_table_cellpadding$.getGlobalValue() );
                      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                      html_utilities.html_markup( THREE_INTEGER );
                      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                      html_utilities.html_markup( html_macros.$html_table_cellspacing$.getGlobalValue() );
                      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                      html_utilities.html_markup( ZERO_INTEGER );
                      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                      html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
                      final SubLObject _prev_bind_0_$10 = html_macros.$html_safe_print$.currentBinding( thread );
                      try
                      {
                        html_macros.$html_safe_print$.bind( T, thread );
                        html_utilities.html_markup( html_macros.$html_table_row_head$.getGlobalValue() );
                        html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
                        final SubLObject _prev_bind_0_$11 = html_macros.$html_safe_print$.currentBinding( thread );
                        try
                        {
                          html_macros.$html_safe_print$.bind( T, thread );
                          html_utilities.html_markup( html_macros.$html_table_header_head$.getGlobalValue() );
                          html_utilities.html_markup( html_macros.$html_table_data_align$.getGlobalValue() );
                          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                          html_utilities.html_markup( html_utilities.html_align( $kw176$MIDDLE ) );
                          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                          html_utilities.html_markup( html_macros.$html_table_data_valign$.getGlobalValue() );
                          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                          html_utilities.html_markup( html_utilities.html_align( $kw84$TOP ) );
                          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                          html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
                          final SubLObject _prev_bind_0_$12 = html_macros.$html_safe_print$.currentBinding( thread );
                          try
                          {
                            html_macros.$html_safe_print$.bind( T, thread );
                            html_utilities.html_markup( html_macros.$html_strong_head$.getGlobalValue() );
                            html_utilities.html_princ( $str177$Icon );
                            html_utilities.html_markup( html_macros.$html_strong_tail$.getGlobalValue() );
                          }
                          finally
                          {
                            html_macros.$html_safe_print$.rebind( _prev_bind_0_$12, thread );
                          }
                          html_utilities.html_markup( html_macros.$html_table_header_tail$.getGlobalValue() );
                          html_utilities.html_markup( html_macros.$html_table_header_head$.getGlobalValue() );
                          html_utilities.html_markup( html_macros.$html_table_data_align$.getGlobalValue() );
                          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                          html_utilities.html_markup( html_utilities.html_align( $kw176$MIDDLE ) );
                          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                          html_utilities.html_markup( html_macros.$html_table_data_valign$.getGlobalValue() );
                          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                          html_utilities.html_markup( html_utilities.html_align( $kw84$TOP ) );
                          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                          html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
                          final SubLObject _prev_bind_0_$13 = html_macros.$html_safe_print$.currentBinding( thread );
                          try
                          {
                            html_macros.$html_safe_print$.bind( T, thread );
                            html_utilities.html_markup( html_macros.$html_strong_head$.getGlobalValue() );
                            html_utilities.html_princ( $str178$Active_ );
                            html_utilities.html_markup( html_macros.$html_strong_tail$.getGlobalValue() );
                          }
                          finally
                          {
                            html_macros.$html_safe_print$.rebind( _prev_bind_0_$13, thread );
                          }
                          html_utilities.html_markup( html_macros.$html_table_header_tail$.getGlobalValue() );
                          html_utilities.html_markup( html_macros.$html_table_header_head$.getGlobalValue() );
                          html_utilities.html_markup( html_macros.$html_table_data_align$.getGlobalValue() );
                          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                          html_utilities.html_markup( html_utilities.html_align( $kw179$LEFT ) );
                          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                          html_utilities.html_markup( html_macros.$html_table_data_valign$.getGlobalValue() );
                          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                          html_utilities.html_markup( html_utilities.html_align( $kw84$TOP ) );
                          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                          html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
                          final SubLObject _prev_bind_0_$14 = html_macros.$html_safe_print$.currentBinding( thread );
                          try
                          {
                            html_macros.$html_safe_print$.bind( T, thread );
                            html_utilities.html_markup( html_macros.$html_strong_head$.getGlobalValue() );
                            html_utilities.html_princ( $str180$Name );
                            html_utilities.html_markup( html_macros.$html_strong_tail$.getGlobalValue() );
                          }
                          finally
                          {
                            html_macros.$html_safe_print$.rebind( _prev_bind_0_$14, thread );
                          }
                          html_utilities.html_markup( html_macros.$html_table_header_tail$.getGlobalValue() );
                          html_utilities.html_markup( html_macros.$html_table_header_head$.getGlobalValue() );
                          html_utilities.html_markup( html_macros.$html_table_data_align$.getGlobalValue() );
                          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                          html_utilities.html_markup( html_utilities.html_align( $kw179$LEFT ) );
                          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                          html_utilities.html_markup( html_macros.$html_table_data_valign$.getGlobalValue() );
                          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                          html_utilities.html_markup( html_utilities.html_align( $kw84$TOP ) );
                          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                          html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
                          final SubLObject _prev_bind_0_$15 = html_macros.$html_safe_print$.currentBinding( thread );
                          try
                          {
                            html_macros.$html_safe_print$.bind( T, thread );
                            html_utilities.html_markup( html_macros.$html_strong_head$.getGlobalValue() );
                            html_utilities.html_princ( $str181$Dynamic_ );
                            html_utilities.html_markup( html_macros.$html_strong_tail$.getGlobalValue() );
                          }
                          finally
                          {
                            html_macros.$html_safe_print$.rebind( _prev_bind_0_$15, thread );
                          }
                          html_utilities.html_markup( html_macros.$html_table_header_tail$.getGlobalValue() );
                          html_utilities.html_markup( html_macros.$html_table_header_head$.getGlobalValue() );
                          html_utilities.html_markup( html_macros.$html_table_data_align$.getGlobalValue() );
                          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                          html_utilities.html_markup( html_utilities.html_align( $kw179$LEFT ) );
                          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                          html_utilities.html_markup( html_macros.$html_table_data_valign$.getGlobalValue() );
                          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                          html_utilities.html_markup( html_utilities.html_align( $kw84$TOP ) );
                          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                          html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
                          final SubLObject _prev_bind_0_$16 = html_macros.$html_safe_print$.currentBinding( thread );
                          try
                          {
                            html_macros.$html_safe_print$.bind( T, thread );
                            html_utilities.html_markup( html_macros.$html_strong_head$.getGlobalValue() );
                            html_utilities.html_princ( $str182$Has_Link_ );
                            html_utilities.html_markup( html_macros.$html_strong_tail$.getGlobalValue() );
                          }
                          finally
                          {
                            html_macros.$html_safe_print$.rebind( _prev_bind_0_$16, thread );
                          }
                          html_utilities.html_markup( html_macros.$html_table_header_tail$.getGlobalValue() );
                          html_utilities.html_markup( html_macros.$html_table_header_head$.getGlobalValue() );
                          html_utilities.html_markup( html_macros.$html_table_data_align$.getGlobalValue() );
                          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                          html_utilities.html_markup( html_utilities.html_align( $kw179$LEFT ) );
                          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                          html_utilities.html_markup( html_macros.$html_table_data_valign$.getGlobalValue() );
                          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                          html_utilities.html_markup( html_utilities.html_align( $kw84$TOP ) );
                          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                          html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
                          final SubLObject _prev_bind_0_$17 = html_macros.$html_safe_print$.currentBinding( thread );
                          try
                          {
                            html_macros.$html_safe_print$.bind( T, thread );
                            html_utilities.html_markup( html_macros.$html_strong_head$.getGlobalValue() );
                            html_utilities.html_princ( $str183$Type );
                            html_utilities.html_markup( html_macros.$html_strong_tail$.getGlobalValue() );
                          }
                          finally
                          {
                            html_macros.$html_safe_print$.rebind( _prev_bind_0_$17, thread );
                          }
                          html_utilities.html_markup( html_macros.$html_table_header_tail$.getGlobalValue() );
                          html_utilities.html_markup( html_macros.$html_table_header_head$.getGlobalValue() );
                          html_utilities.html_markup( html_macros.$html_table_data_align$.getGlobalValue() );
                          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                          html_utilities.html_markup( html_utilities.html_align( $kw179$LEFT ) );
                          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                          html_utilities.html_markup( html_macros.$html_table_data_valign$.getGlobalValue() );
                          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                          html_utilities.html_markup( html_utilities.html_align( $kw84$TOP ) );
                          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                          html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
                          final SubLObject _prev_bind_0_$18 = html_macros.$html_safe_print$.currentBinding( thread );
                          try
                          {
                            html_macros.$html_safe_print$.bind( T, thread );
                            html_utilities.html_markup( html_macros.$html_strong_head$.getGlobalValue() );
                            html_utilities.html_princ( $str184$Tool );
                            html_utilities.html_markup( html_macros.$html_strong_tail$.getGlobalValue() );
                          }
                          finally
                          {
                            html_macros.$html_safe_print$.rebind( _prev_bind_0_$18, thread );
                          }
                          html_utilities.html_markup( html_macros.$html_table_header_tail$.getGlobalValue() );
                          if( NIL != $debug_adornments_p$.getDynamicValue( thread ) )
                          {
                            html_utilities.html_markup( html_macros.$html_table_header_head$.getGlobalValue() );
                            html_utilities.html_markup( html_macros.$html_table_data_align$.getGlobalValue() );
                            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                            html_utilities.html_markup( html_utilities.html_align( $kw176$MIDDLE ) );
                            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                            html_utilities.html_markup( html_macros.$html_table_data_valign$.getGlobalValue() );
                            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                            html_utilities.html_markup( html_utilities.html_align( $kw84$TOP ) );
                            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                            html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
                            final SubLObject _prev_bind_0_$19 = html_macros.$html_safe_print$.currentBinding( thread );
                            try
                            {
                              html_macros.$html_safe_print$.bind( T, thread );
                              html_utilities.html_markup( html_macros.$html_strong_head$.getGlobalValue() );
                              html_utilities.html_princ( $str185$effective_fn );
                              html_utilities.html_markup( html_macros.$html_strong_tail$.getGlobalValue() );
                            }
                            finally
                            {
                              html_macros.$html_safe_print$.rebind( _prev_bind_0_$19, thread );
                            }
                            html_utilities.html_markup( html_macros.$html_table_header_tail$.getGlobalValue() );
                          }
                        }
                        finally
                        {
                          html_macros.$html_safe_print$.rebind( _prev_bind_0_$11, thread );
                        }
                        html_utilities.html_markup( html_macros.$html_table_row_tail$.getGlobalValue() );
                        html_utilities.html_source_readability_terpri( UNPROVIDED );
                        SubLObject bgcolor = NIL;
                        SubLObject color_toggle = NIL;
                        SubLObject list_var = NIL;
                        SubLObject entry = NIL;
                        SubLObject ignore_me = NIL;
                        list_var = Sort.sort( conses_high.copy_list( $cb_adornment_table$.getGlobalValue() ), Symbols.symbol_function( $sym186$ADORNMENT_ ), UNPROVIDED );
                        entry = list_var.first();
                        for( ignore_me = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest(), entry = list_var.first(), ignore_me = Numbers.add( ONE_INTEGER, ignore_me ) )
                        {
                          if( NIL != color_toggle )
                          {
                            color_toggle = NIL;
                          }
                          else
                          {
                            color_toggle = T;
                          }
                          bgcolor = ( NIL != color_toggle ) ? $str187$_dddddd : $str188$_cccccc;
                          final SubLObject name = Strings.string( adornment_name( entry ) );
                          html_utilities.html_markup( html_macros.$html_table_row_head$.getGlobalValue() );
                          if( NIL != bgcolor )
                          {
                            html_utilities.html_markup( html_macros.$html_table_row_bgcolor$.getGlobalValue() );
                            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                            html_utilities.html_markup( bgcolor );
                            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                          }
                          html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
                          final SubLObject _prev_bind_0_$20 = html_macros.$html_safe_print$.currentBinding( thread );
                          try
                          {
                            html_macros.$html_safe_print$.bind( T, thread );
                            html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
                            html_utilities.html_simple_attribute( html_macros.$html_table_data_nowrap$.getGlobalValue() );
                            html_utilities.html_markup( html_macros.$html_table_data_align$.getGlobalValue() );
                            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                            html_utilities.html_markup( html_utilities.html_align( $kw176$MIDDLE ) );
                            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                            html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
                            final SubLObject _prev_bind_0_$21 = html_macros.$html_safe_print$.currentBinding( thread );
                            try
                            {
                              html_macros.$html_safe_print$.bind( T, thread );
                              display_adornment( entry, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
                            }
                            finally
                            {
                              html_macros.$html_safe_print$.rebind( _prev_bind_0_$21, thread );
                            }
                            html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
                            html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
                            html_utilities.html_simple_attribute( html_macros.$html_table_data_nowrap$.getGlobalValue() );
                            html_utilities.html_markup( html_macros.$html_table_data_align$.getGlobalValue() );
                            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                            html_utilities.html_markup( html_utilities.html_align( $kw176$MIDDLE ) );
                            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                            html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
                            final SubLObject _prev_bind_0_$22 = html_macros.$html_safe_print$.currentBinding( thread );
                            try
                            {
                              html_macros.$html_safe_print$.bind( T, thread );
                              html_utilities.html_checkbox_input( Strings.string( name ), Strings.string( name ), adornment_active_p( entry ), UNPROVIDED, UNPROVIDED, UNPROVIDED );
                            }
                            finally
                            {
                              html_macros.$html_safe_print$.rebind( _prev_bind_0_$22, thread );
                            }
                            html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
                            html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
                            html_utilities.html_simple_attribute( html_macros.$html_table_data_nowrap$.getGlobalValue() );
                            html_utilities.html_markup( html_macros.$html_table_data_align$.getGlobalValue() );
                            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                            html_utilities.html_markup( html_utilities.html_align( $kw179$LEFT ) );
                            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                            html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
                            final SubLObject _prev_bind_0_$23 = html_macros.$html_safe_print$.currentBinding( thread );
                            try
                            {
                              html_macros.$html_safe_print$.bind( T, thread );
                              html_utilities.html_markup( html_macros.$html_bold_head$.getGlobalValue() );
                              html_utilities.html_princ( Strings.string_downcase( name, UNPROVIDED, UNPROVIDED ) );
                              html_utilities.html_markup( html_macros.$html_bold_tail$.getGlobalValue() );
                            }
                            finally
                            {
                              html_macros.$html_safe_print$.rebind( _prev_bind_0_$23, thread );
                            }
                            html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
                            html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
                            html_utilities.html_simple_attribute( html_macros.$html_table_data_nowrap$.getGlobalValue() );
                            html_utilities.html_markup( html_macros.$html_table_data_align$.getGlobalValue() );
                            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                            html_utilities.html_markup( html_utilities.html_align( $kw179$LEFT ) );
                            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                            html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
                            final SubLObject _prev_bind_0_$24 = html_macros.$html_safe_print$.currentBinding( thread );
                            try
                            {
                              html_macros.$html_safe_print$.bind( T, thread );
                              if( NIL != adornment_dynamic_tagfn( entry ) )
                              {
                                html_utilities.html_checkbox_input( Sequences.cconcatenate( format_nil.format_nil_a_no_copy( name ), $str189$_dynamic ), Sequences.cconcatenate( format_nil.format_nil_a_no_copy( name ),
                                    $str189$_dynamic ), makeBoolean( NIL != adornment_image_alt( entry ) && !adornment_image_alt( entry ).isString() ), UNPROVIDED, UNPROVIDED, UNPROVIDED );
                                html_utilities.html_indent( UNPROVIDED );
                                if( NIL != adornment_dynamic_comment( entry ) )
                                {
                                  html_utilities.html_princ( adornment_dynamic_comment( entry ) );
                                }
                                else
                                {
                                  html_utilities.html_princ( $str190$_ );
                                }
                              }
                              else
                              {
                                html_utilities.html_princ( $str191$No );
                              }
                            }
                            finally
                            {
                              html_macros.$html_safe_print$.rebind( _prev_bind_0_$24, thread );
                            }
                            html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
                            html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
                            html_utilities.html_simple_attribute( html_macros.$html_table_data_nowrap$.getGlobalValue() );
                            html_utilities.html_markup( html_macros.$html_table_data_align$.getGlobalValue() );
                            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                            html_utilities.html_markup( html_utilities.html_align( $kw179$LEFT ) );
                            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                            html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
                            final SubLObject _prev_bind_0_$25 = html_macros.$html_safe_print$.currentBinding( thread );
                            try
                            {
                              html_macros.$html_safe_print$.bind( T, thread );
                              html_utilities.html_princ( ( NIL != adornment_handler( entry ) ) ? $str192$Yes : $str191$No );
                            }
                            finally
                            {
                              html_macros.$html_safe_print$.rebind( _prev_bind_0_$25, thread );
                            }
                            html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
                            html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
                            html_utilities.html_simple_attribute( html_macros.$html_table_data_nowrap$.getGlobalValue() );
                            html_utilities.html_markup( html_macros.$html_table_data_align$.getGlobalValue() );
                            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                            html_utilities.html_markup( html_utilities.html_align( $kw179$LEFT ) );
                            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                            html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
                            final SubLObject _prev_bind_0_$26 = html_macros.$html_safe_print$.currentBinding( thread );
                            try
                            {
                              html_macros.$html_safe_print$.bind( T, thread );
                              html_utilities.html_princ( Strings.string_downcase( Strings.string( adornment_type( entry ) ), UNPROVIDED, UNPROVIDED ) );
                            }
                            finally
                            {
                              html_macros.$html_safe_print$.rebind( _prev_bind_0_$26, thread );
                            }
                            html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
                            html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
                            html_utilities.html_markup( html_macros.$html_table_data_align$.getGlobalValue() );
                            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                            html_utilities.html_markup( html_utilities.html_align( $kw179$LEFT ) );
                            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                            html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
                            final SubLObject _prev_bind_0_$27 = html_macros.$html_safe_print$.currentBinding( thread );
                            try
                            {
                              html_macros.$html_safe_print$.bind( T, thread );
                              final SubLObject tool = adornment_tool( entry );
                              if( NIL != tool && NIL != cb_utilities.cb_link_method( tool ) )
                              {
                                cb_utilities.cb_link( tool, cb_utilities.cb_tool_abbreviation( tool ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
                              }
                              else
                              {
                                html_utilities.html_glyph( $kw193$NBSP, UNPROVIDED );
                              }
                            }
                            finally
                            {
                              html_macros.$html_safe_print$.rebind( _prev_bind_0_$27, thread );
                            }
                            html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
                            if( NIL != $debug_adornments_p$.getDynamicValue( thread ) )
                            {
                              html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
                              html_utilities.html_simple_attribute( html_macros.$html_table_data_nowrap$.getGlobalValue() );
                              html_utilities.html_markup( html_macros.$html_table_data_align$.getGlobalValue() );
                              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                              html_utilities.html_markup( html_utilities.html_align( $kw179$LEFT ) );
                              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                              html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
                              final SubLObject _prev_bind_0_$28 = html_macros.$html_safe_print$.currentBinding( thread );
                              try
                              {
                                html_macros.$html_safe_print$.bind( T, thread );
                                html_utilities.html_princ( Strings.string( adornment_effective_fn( entry ) ) );
                              }
                              finally
                              {
                                html_macros.$html_safe_print$.rebind( _prev_bind_0_$28, thread );
                              }
                              html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
                            }
                          }
                          finally
                          {
                            html_macros.$html_safe_print$.rebind( _prev_bind_0_$20, thread );
                          }
                          html_utilities.html_markup( html_macros.$html_table_row_tail$.getGlobalValue() );
                          html_utilities.html_source_readability_terpri( UNPROVIDED );
                          html_utilities.html_markup( html_macros.$html_table_row_head$.getGlobalValue() );
                          if( NIL != bgcolor )
                          {
                            html_utilities.html_markup( html_macros.$html_table_row_bgcolor$.getGlobalValue() );
                            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                            html_utilities.html_markup( bgcolor );
                            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                          }
                          html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
                          final SubLObject _prev_bind_0_$29 = html_macros.$html_safe_print$.currentBinding( thread );
                          try
                          {
                            html_macros.$html_safe_print$.bind( T, thread );
                            html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
                            html_utilities.html_markup( html_macros.$html_table_data_colspan$.getGlobalValue() );
                            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                            html_utilities.html_markup( TWO_INTEGER );
                            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                            html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
                            final SubLObject _prev_bind_0_$30 = html_macros.$html_safe_print$.currentBinding( thread );
                            try
                            {
                              html_macros.$html_safe_print$.bind( T, thread );
                              html_utilities.html_br();
                            }
                            finally
                            {
                              html_macros.$html_safe_print$.rebind( _prev_bind_0_$30, thread );
                            }
                            html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
                            html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
                            html_utilities.html_markup( html_macros.$html_table_data_colspan$.getGlobalValue() );
                            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                            html_utilities.html_markup( FIVE_INTEGER );
                            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                            html_utilities.html_markup( html_macros.$html_table_data_align$.getGlobalValue() );
                            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                            html_utilities.html_markup( html_utilities.html_align( $kw179$LEFT ) );
                            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                            html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
                            final SubLObject _prev_bind_0_$31 = html_macros.$html_safe_print$.currentBinding( thread );
                            try
                            {
                              html_macros.$html_safe_print$.bind( T, thread );
                              if( NIL != adornment_comment( entry ) )
                              {
                                html_utilities.html_princ( adornment_comment( entry ) );
                              }
                              else
                              {
                                html_utilities.html_princ( $str190$_ );
                              }
                            }
                            finally
                            {
                              html_macros.$html_safe_print$.rebind( _prev_bind_0_$31, thread );
                            }
                            html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
                            html_utilities.html_markup( html_macros.$html_table_row_head$.getGlobalValue() );
                            if( NIL != bgcolor )
                            {
                              html_utilities.html_markup( html_macros.$html_table_row_bgcolor$.getGlobalValue() );
                              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                              html_utilities.html_markup( bgcolor );
                              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                            }
                            html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
                            final SubLObject _prev_bind_0_$32 = html_macros.$html_safe_print$.currentBinding( thread );
                            try
                            {
                              html_macros.$html_safe_print$.bind( T, thread );
                              html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
                              html_utilities.html_markup( html_macros.$html_table_data_colspan$.getGlobalValue() );
                              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                              html_utilities.html_markup( SEVEN_INTEGER );
                              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
                              html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
                              final SubLObject _prev_bind_0_$33 = html_macros.$html_safe_print$.currentBinding( thread );
                              try
                              {
                                html_macros.$html_safe_print$.bind( T, thread );
                                html_utilities.html_br();
                              }
                              finally
                              {
                                html_macros.$html_safe_print$.rebind( _prev_bind_0_$33, thread );
                              }
                              html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
                            }
                            finally
                            {
                              html_macros.$html_safe_print$.rebind( _prev_bind_0_$32, thread );
                            }
                            html_utilities.html_markup( html_macros.$html_table_row_tail$.getGlobalValue() );
                            html_utilities.html_source_readability_terpri( UNPROVIDED );
                          }
                          finally
                          {
                            html_macros.$html_safe_print$.rebind( _prev_bind_0_$29, thread );
                          }
                          html_utilities.html_markup( html_macros.$html_table_row_tail$.getGlobalValue() );
                          html_utilities.html_source_readability_terpri( UNPROVIDED );
                        }
                      }
                      finally
                      {
                        html_macros.$html_safe_print$.rebind( _prev_bind_0_$10, thread );
                      }
                      html_utilities.html_markup( html_macros.$html_table_tail$.getGlobalValue() );
                    }
                    finally
                    {
                      html_macros.$html_safe_print$.rebind( _prev_bind_0_$9, thread );
                    }
                    html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
                  }
                  finally
                  {
                    html_macros.$html_safe_print$.rebind( _prev_bind_0_$8, thread );
                  }
                  html_utilities.html_markup( html_macros.$html_table_row_tail$.getGlobalValue() );
                  html_utilities.html_source_readability_terpri( UNPROVIDED );
                }
                finally
                {
                  html_macros.$html_safe_print$.rebind( _prev_bind_0_$7, thread );
                }
                html_utilities.html_markup( html_macros.$html_table_tail$.getGlobalValue() );
                html_utilities.html_newline( UNPROVIDED );
                html_utilities.html_reset_input( $str172$Current_Values );
                html_utilities.html_indent( UNPROVIDED );
                html_utilities.html_submit_input( $str173$Update_Adornment_Settings, UNPROVIDED, UNPROVIDED );
                html_macros.embed_form_field_code( html_macros.$html_form_field_uniquifier_code$.getDynamicValue( thread ) );
              }
              finally
              {
                html_macros.$html_form_field_uniquifier_code$.rebind( _prev_bind_3, thread );
                html_macros.$within_html_form$.rebind( _prev_bind_2, thread );
                html_macros.$html_safe_print$.rebind( _prev_bind_0_$6, thread );
              }
              html_utilities.html_markup( html_macros.$html_form_tail$.getGlobalValue() );
              html_utilities.html_source_readability_terpri( UNPROVIDED );
              html_utilities.html_copyright_notice();
            }
            finally
            {
              html_macros.$html_safe_print$.rebind( _prev_bind_0_$4, thread );
            }
            html_utilities.html_markup( html_macros.$html_body_tail$.getGlobalValue() );
            html_utilities.html_source_readability_terpri( UNPROVIDED );
          }
          finally
          {
            html_macros.$html_inside_bodyP$.rebind( _prev_bind_0_$3, thread );
          }
          html_utilities.html_markup( html_macros.$html_html_tail$.getGlobalValue() );
        }
        finally
        {
          cyc_file_dependencies.$html_emitted_file_dependencies$.rebind( _prev_bind_0_$2, thread );
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
      cdestructuring_bind.cdestructuring_bind_error( datum, $list156 );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-adornments.lisp", position = 25680L)
  public static SubLObject cb_adornment_handler(final SubLObject args)
  {
    $debug_adornments_p$.setDynamicValue( makeBoolean( NIL != html_utilities.html_extract_input( $str196$debug, args ) ) );
    SubLObject cdolist_list_var = Mapping.mapcar( Symbols.symbol_function( $sym12$ADORNMENT_NAME ), $cb_adornment_table$.getGlobalValue() );
    SubLObject name = NIL;
    name = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject dynamic_tag = Sequences.cconcatenate( format_nil.format_nil_a_no_copy( name ), $str189$_dynamic );
      final SubLObject adornment = find_adornment( name );
      if( NIL != html_utilities.html_extract_input( Strings.string( name ), args ) )
      {
        enable_adornment( name, T );
      }
      else
      {
        enable_adornment( name, NIL );
      }
      if( NIL != html_utilities.html_extract_input( dynamic_tag, args ) )
      {
        _csetf_adornment_image_alt( adornment, adornment_dynamic_tagfn( adornment ) );
      }
      else
      {
        _csetf_adornment_image_alt( adornment, Sequences.cconcatenate( $str197$_, new SubLObject[] { format_nil.format_nil_a_no_copy( adornment_name( adornment ) ), $str198$_
        } ) );
      }
      cdolist_list_var = cdolist_list_var.rest();
      name = cdolist_list_var.first();
    }
    cb_utilities.cb_message_page_with_history( $str199$Active_adornments_have_been_chang, UNPROVIDED );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-adornments.lisp", position = 26519L)
  public static SubLObject cb_link_view_adorn(final SubLObject index_hook, SubLObject linktext)
  {
    if( linktext == UNPROVIDED )
    {
      linktext = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == linktext )
    {
      linktext = $str201$_View_Adornments_;
    }
    final SubLObject frame_name_var = cb_utilities.cb_frame_name( $kw0$MAIN );
    html_utilities.html_markup( html_macros.$html_anchor_head$.getGlobalValue() );
    html_utilities.html_markup( html_macros.$html_anchor_href$.getGlobalValue() );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    cb_parameters.cyc_cgi_url_int();
    PrintLow.format( html_macros.$html_stream$.getDynamicValue( thread ), $str202$cb_view_adorn__A, cb_utilities.cb_index_identifier( index_hook ) );
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

  @SubLTranslatedFile.SubL(source = "cycl/cb-adornments.lisp", position = 26788L)
  public static SubLObject cb_c_index_adornments(final SubLObject index_hook)
  {
    html_utilities.html_markup( html_macros.$html_bold_head$.getGlobalValue() );
    cb_utilities.cb_link( $kw203$VIEW_ADORN, index_hook, $str158$Adornments, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    html_utilities.html_princ( $str205$___ );
    html_utilities.html_markup( html_macros.$html_bold_tail$.getGlobalValue() );
    display_active_adornments( UNPROVIDED );
    html_utilities.html_newline( TWO_INTEGER );
    return NIL;
  }

  public static SubLObject declare_cb_adornments_file()
  {
    SubLFiles.declareFunction( me, "bookkeeping_assertion_p", "BOOKKEEPING-ASSERTION-P", 1, 0, false );
    SubLFiles.declareFunction( me, "documentation_assertion_p", "DOCUMENTATION-ASSERTION-P", 1, 0, false );
    SubLFiles.declareFunction( me, "print_adornment", "PRINT-ADORNMENT", 3, 0, false );
    SubLFiles.declareFunction( me, "adornment_print_function_trampoline", "ADORNMENT-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false );
    SubLFiles.declareFunction( me, "adornment_p", "ADORNMENT-P", 1, 0, false );
    new $adornment_p$UnaryFunction();
    SubLFiles.declareFunction( me, "adornment_name", "ADORNMENT-NAME", 1, 0, false );
    SubLFiles.declareFunction( me, "adornment_type", "ADORNMENT-TYPE", 1, 0, false );
    SubLFiles.declareFunction( me, "adornment_active_p", "ADORNMENT-ACTIVE-P", 1, 0, false );
    SubLFiles.declareFunction( me, "adornment_image", "ADORNMENT-IMAGE", 1, 0, false );
    SubLFiles.declareFunction( me, "adornment_image_disabled", "ADORNMENT-IMAGE-DISABLED", 1, 0, false );
    SubLFiles.declareFunction( me, "adornment_image_alt", "ADORNMENT-IMAGE-ALT", 1, 0, false );
    SubLFiles.declareFunction( me, "adornment_dynamic_tagfn", "ADORNMENT-DYNAMIC-TAGFN", 1, 0, false );
    SubLFiles.declareFunction( me, "adornment_color", "ADORNMENT-COLOR", 1, 0, false );
    SubLFiles.declareFunction( me, "adornment_letter", "ADORNMENT-LETTER", 1, 0, false );
    SubLFiles.declareFunction( me, "adornment_effective_fn", "ADORNMENT-EFFECTIVE-FN", 1, 0, false );
    SubLFiles.declareFunction( me, "adornment_handler", "ADORNMENT-HANDLER", 1, 0, false );
    SubLFiles.declareFunction( me, "adornment_tool", "ADORNMENT-TOOL", 1, 0, false );
    SubLFiles.declareFunction( me, "adornment_comment", "ADORNMENT-COMMENT", 1, 0, false );
    SubLFiles.declareFunction( me, "adornment_dynamic_comment", "ADORNMENT-DYNAMIC-COMMENT", 1, 0, false );
    SubLFiles.declareFunction( me, "adornment_title", "ADORNMENT-TITLE", 1, 0, false );
    SubLFiles.declareFunction( me, "_csetf_adornment_name", "_CSETF-ADORNMENT-NAME", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_adornment_type", "_CSETF-ADORNMENT-TYPE", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_adornment_active_p", "_CSETF-ADORNMENT-ACTIVE-P", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_adornment_image", "_CSETF-ADORNMENT-IMAGE", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_adornment_image_disabled", "_CSETF-ADORNMENT-IMAGE-DISABLED", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_adornment_image_alt", "_CSETF-ADORNMENT-IMAGE-ALT", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_adornment_dynamic_tagfn", "_CSETF-ADORNMENT-DYNAMIC-TAGFN", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_adornment_color", "_CSETF-ADORNMENT-COLOR", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_adornment_letter", "_CSETF-ADORNMENT-LETTER", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_adornment_effective_fn", "_CSETF-ADORNMENT-EFFECTIVE-FN", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_adornment_handler", "_CSETF-ADORNMENT-HANDLER", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_adornment_tool", "_CSETF-ADORNMENT-TOOL", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_adornment_comment", "_CSETF-ADORNMENT-COMMENT", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_adornment_dynamic_comment", "_CSETF-ADORNMENT-DYNAMIC-COMMENT", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_adornment_title", "_CSETF-ADORNMENT-TITLE", 2, 0, false );
    SubLFiles.declareFunction( me, "make_adornment", "MAKE-ADORNMENT", 0, 1, false );
    SubLFiles.declareFunction( me, "visit_defstruct_adornment", "VISIT-DEFSTRUCT-ADORNMENT", 2, 0, false );
    SubLFiles.declareFunction( me, "visit_defstruct_object_adornment_method", "VISIT-DEFSTRUCT-OBJECT-ADORNMENT-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "active_adornment_struct_p", "ACTIVE-ADORNMENT-STRUCT-P", 1, 1, false );
    SubLFiles.declareFunction( me, "active_adornment_p", "ACTIVE-ADORNMENT-P", 1, 0, false );
    SubLFiles.declareFunction( me, "enable_adornment", "ENABLE-ADORNMENT", 1, 1, false );
    SubLFiles.declareMacro( me, "defadornment", "DEFADORNMENT" );
    SubLFiles.declareFunction( me, "find_adornment", "FIND-ADORNMENT", 1, 0, false );
    SubLFiles.declareFunction( me, "active_adornments", "ACTIVE-ADORNMENTS", 1, 0, false );
    SubLFiles.declareFunction( me, "id_for_type", "ID-FOR-TYPE", 2, 0, false );
    SubLFiles.declareFunction( me, "calc_adornment_image_alt", "CALC-ADORNMENT-IMAGE-ALT", 2, 2, false );
    SubLFiles.declareFunction( me, "display_linked_adornment", "DISPLAY-LINKED-ADORNMENT", 6, 0, false );
    SubLFiles.declareFunction( me, "display_adornment_disabled", "DISPLAY-ADORNMENT-DISABLED", 1, 5, false );
    SubLFiles.declareFunction( me, "display_adornment", "DISPLAY-ADORNMENT", 1, 5, false );
    SubLFiles.declareFunction( me, "display_active_adornments", "DISPLAY-ACTIVE-ADORNMENTS", 0, 1, false );
    SubLFiles.declareFunction( me, "resolved_adornment_image", "RESOLVED-ADORNMENT-IMAGE", 1, 4, false );
    SubLFiles.declareFunction( me, "adorn_thingo_p", "ADORN-THINGO-P", 2, 2, false );
    SubLFiles.declareFunction( me, "activate_adornment", "ACTIVATE-ADORNMENT", 1, 0, false );
    SubLFiles.declareFunction( me, "handle_adornments", "HANDLE-ADORNMENTS", 3, 3, false );
    SubLFiles.declareFunction( me, "handle_specific_adornment", "HANDLE-SPECIFIC-ADORNMENT", 4, 3, false );
    SubLFiles.declareFunction( me, "cb_include_hierarchy_linkP", "CB-INCLUDE-HIERARCHY-LINK?", 2, 0, false );
    SubLFiles.declareFunction( me, "hierarchy_link_effective_fn", "HIERARCHY-LINK-EFFECTIVE-FN", 3, 0, false );
    SubLFiles.declareFunction( me, "cb_show_alphabetic_searchP", "CB-SHOW-ALPHABETIC-SEARCH?", 1, 0, false );
    SubLFiles.declareFunction( me, "literal_query_index_effective_fn", "LITERAL-QUERY-INDEX-EFFECTIVE-FN", 3, 1, false );
    SubLFiles.declareFunction( me, "literal_query_normal_effective_fn", "LITERAL-QUERY-NORMAL-EFFECTIVE-FN", 3, 0, false );
    SubLFiles.declareFunction( me, "literal_query_marker_else_green", "LITERAL-QUERY-MARKER-ELSE-GREEN", 1, 0, false );
    SubLFiles.declareFunction( me, "literal_query_marker_else_yellow", "LITERAL-QUERY-MARKER-ELSE-YELLOW", 1, 0, false );
    SubLFiles.declareFunction( me, "literal_query_marker_else_purple", "LITERAL-QUERY-MARKER-ELSE-PURPLE", 1, 0, false );
    SubLFiles.declareFunction( me, "literal_query_index_display_effective_fn", "LITERAL-QUERY-INDEX-DISPLAY-EFFECTIVE-FN", 3, 0, false );
    SubLFiles.declareFunction( me, "cb_get_asserted_argument", "CB-GET-ASSERTED-ARGUMENT", 1, 0, false );
    SubLFiles.declareFunction( me, "convert_deduction_to_formula", "CONVERT-DEDUCTION-TO-FORMULA", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_assertion_deductions", "CB-ASSERTION-DEDUCTIONS", 1, 0, false );
    SubLFiles.declareFunction( me, "adornmentL", "ADORNMENT<", 2, 0, false );
    SubLFiles.declareFunction( me, "cb_view_adorn", "CB-VIEW-ADORN", 0, 1, false );
    SubLFiles.declareFunction( me, "cb_adornment_handler", "CB-ADORNMENT-HANDLER", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_link_view_adorn", "CB-LINK-VIEW-ADORN", 1, 1, false );
    SubLFiles.declareFunction( me, "cb_c_index_adornments", "CB-C-INDEX-ADORNMENTS", 1, 0, false );
    return NIL;
  }

  public static SubLObject init_cb_adornments_file()
  {
    $adornment_display$ = SubLFiles.defparameter( "*ADORNMENT-DISPLAY*", $kw0$MAIN );
    $adorn_thingo$ = SubLFiles.defparameter( "*ADORN-THINGO*", NIL );
    $adorn_arg$ = SubLFiles.defparameter( "*ADORN-ARG*", NIL );
    $adorn_pred$ = SubLFiles.defparameter( "*ADORN-PRED*", NIL );
    $adorn_mt$ = SubLFiles.defparameter( "*ADORN-MT*", NIL );
    $adornment_type$ = SubLFiles.defparameter( "*ADORNMENT-TYPE*", NIL );
    $adornment_sorted_list$ = SubLFiles.deflexical( "*ADORNMENT-SORTED-LIST*", $list1 );
    $dtp_adornment$ = SubLFiles.defconstant( "*DTP-ADORNMENT*", $sym3$ADORNMENT );
    $cb_adornment_table$ = SubLFiles.deflexical( "*CB-ADORNMENT-TABLE*", ( maybeDefault( $sym63$_CB_ADORNMENT_TABLE_, $cb_adornment_table$, NIL ) ) );
    $debug_adornments_p$ = SubLFiles.defparameter( "*DEBUG-ADORNMENTS-P*", NIL );
    return NIL;
  }

  public static SubLObject setup_cb_adornments_file()
  {
    Structures.register_method( print_high.$print_object_method_table$.getGlobalValue(), $dtp_adornment$.getGlobalValue(), Symbols.symbol_function( $sym10$ADORNMENT_PRINT_FUNCTION_TRAMPOLINE ) );
    SubLSpecialOperatorDeclarations.proclaim( $list11 );
    Structures.def_csetf( $sym12$ADORNMENT_NAME, $sym13$_CSETF_ADORNMENT_NAME );
    Structures.def_csetf( $sym14$ADORNMENT_TYPE, $sym15$_CSETF_ADORNMENT_TYPE );
    Structures.def_csetf( $sym16$ADORNMENT_ACTIVE_P, $sym17$_CSETF_ADORNMENT_ACTIVE_P );
    Structures.def_csetf( $sym18$ADORNMENT_IMAGE, $sym19$_CSETF_ADORNMENT_IMAGE );
    Structures.def_csetf( $sym20$ADORNMENT_IMAGE_DISABLED, $sym21$_CSETF_ADORNMENT_IMAGE_DISABLED );
    Structures.def_csetf( $sym22$ADORNMENT_IMAGE_ALT, $sym23$_CSETF_ADORNMENT_IMAGE_ALT );
    Structures.def_csetf( $sym24$ADORNMENT_DYNAMIC_TAGFN, $sym25$_CSETF_ADORNMENT_DYNAMIC_TAGFN );
    Structures.def_csetf( $sym26$ADORNMENT_COLOR, $sym27$_CSETF_ADORNMENT_COLOR );
    Structures.def_csetf( $sym28$ADORNMENT_LETTER, $sym29$_CSETF_ADORNMENT_LETTER );
    Structures.def_csetf( $sym30$ADORNMENT_EFFECTIVE_FN, $sym31$_CSETF_ADORNMENT_EFFECTIVE_FN );
    Structures.def_csetf( $sym32$ADORNMENT_HANDLER, $sym33$_CSETF_ADORNMENT_HANDLER );
    Structures.def_csetf( $sym34$ADORNMENT_TOOL, $sym35$_CSETF_ADORNMENT_TOOL );
    Structures.def_csetf( $sym36$ADORNMENT_COMMENT, $sym37$_CSETF_ADORNMENT_COMMENT );
    Structures.def_csetf( $sym38$ADORNMENT_DYNAMIC_COMMENT, $sym39$_CSETF_ADORNMENT_DYNAMIC_COMMENT );
    Structures.def_csetf( $sym40$ADORNMENT_TITLE, $sym41$_CSETF_ADORNMENT_TITLE );
    Equality.identity( $sym3$ADORNMENT );
    Structures.register_method( visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_adornment$.getGlobalValue(), Symbols.symbol_function( $sym62$VISIT_DEFSTRUCT_OBJECT_ADORNMENT_METHOD ) );
    subl_macro_promotions.declare_defglobal( $sym63$_CB_ADORNMENT_TABLE_ );
    Hashtables.sethash( $kw90$INDEX_BROWSER, cyc_file_dependencies.$cb_icon_definitions$.getGlobalValue(), ConsesLow.list( $str91$index_browser_gif, NIL ) );
    Hashtables.sethash( $kw92$INDEX_BROWSER_DISABLED, cyc_file_dependencies.$cb_icon_definitions$.getGlobalValue(), ConsesLow.list( $str93$index_browser_disabled_gif, NIL ) );
    SubLObject old = $cb_adornment_table$.getGlobalValue();
    SubLObject v_new = make_adornment( $list94 );
    _csetf_adornment_name( v_new, $sym95$INDEX_BROWSER );
    $cb_adornment_table$.setGlobalValue( ConsesLow.cons( v_new, Sequences.delete( $sym95$INDEX_BROWSER, old, Symbols.symbol_function( EQUAL ), Symbols.symbol_function( $sym12$ADORNMENT_NAME ), UNPROVIDED, UNPROVIDED,
        UNPROVIDED ) ) );
    old = $cb_adornment_table$.getGlobalValue();
    v_new = make_adornment( $list96 );
    _csetf_adornment_name( v_new, $sym97$META_AXIOMS );
    $cb_adornment_table$.setGlobalValue( ConsesLow.cons( v_new, Sequences.delete( $sym97$META_AXIOMS, old, Symbols.symbol_function( EQUAL ), Symbols.symbol_function( $sym12$ADORNMENT_NAME ), UNPROVIDED, UNPROVIDED,
        UNPROVIDED ) ) );
    Hashtables.sethash( $kw98$CY_MENU, cyc_file_dependencies.$cb_icon_definitions$.getGlobalValue(), ConsesLow.list( $str99$cy_menu_gif, NIL ) );
    old = $cb_adornment_table$.getGlobalValue();
    v_new = make_adornment( $list100 );
    _csetf_adornment_name( v_new, $sym101$ASSERTION_REVIEW );
    $cb_adornment_table$.setGlobalValue( ConsesLow.cons( v_new, Sequences.delete( $sym101$ASSERTION_REVIEW, old, Symbols.symbol_function( EQUAL ), Symbols.symbol_function( $sym12$ADORNMENT_NAME ), UNPROVIDED, UNPROVIDED,
        UNPROVIDED ) ) );
    Hashtables.sethash( $kw102$BL_MENU, cyc_file_dependencies.$cb_icon_definitions$.getGlobalValue(), ConsesLow.list( $str103$bl_menu_gif, NIL ) );
    Hashtables.sethash( $kw107$RED_DIAMOND, cyc_file_dependencies.$cb_icon_definitions$.getGlobalValue(), ConsesLow.list( $str108$red_diam_gif, NIL ) );
    old = $cb_adornment_table$.getGlobalValue();
    v_new = make_adornment( $list109 );
    _csetf_adornment_name( v_new, $sym110$HIERARCHY_LINK );
    $cb_adornment_table$.setGlobalValue( ConsesLow.cons( v_new, Sequences.delete( $sym110$HIERARCHY_LINK, old, Symbols.symbol_function( EQUAL ), Symbols.symbol_function( $sym12$ADORNMENT_NAME ), UNPROVIDED, UNPROVIDED,
        UNPROVIDED ) ) );
    Hashtables.sethash( $kw111$HIERARCHY_BROWSER, cyc_file_dependencies.$cb_icon_definitions$.getGlobalValue(), ConsesLow.list( $str112$hierarchy_browser_gif, NIL ) );
    Hashtables.sethash( $kw113$HIERARCHY_BROWSER_DISABLED, cyc_file_dependencies.$cb_icon_definitions$.getGlobalValue(), ConsesLow.list( $str114$hierarchy_browser_disabled_gif, NIL ) );
    old = $cb_adornment_table$.getGlobalValue();
    v_new = make_adornment( $list115 );
    _csetf_adornment_name( v_new, $sym116$HIERARCHY_DEFAULT );
    $cb_adornment_table$.setGlobalValue( ConsesLow.cons( v_new, Sequences.delete( $sym116$HIERARCHY_DEFAULT, old, Symbols.symbol_function( EQUAL ), Symbols.symbol_function( $sym12$ADORNMENT_NAME ), UNPROVIDED,
        UNPROVIDED, UNPROVIDED ) ) );
    Hashtables.sethash( $kw117$ALPHA_BROWSER, cyc_file_dependencies.$cb_icon_definitions$.getGlobalValue(), ConsesLow.list( $str118$alpha_browser_gif, NIL ) );
    Hashtables.sethash( $kw119$ALPHA_BROWSER_DISABLED, cyc_file_dependencies.$cb_icon_definitions$.getGlobalValue(), ConsesLow.list( $str120$alpha_browser_disabled_gif, NIL ) );
    old = $cb_adornment_table$.getGlobalValue();
    v_new = make_adornment( $list121 );
    _csetf_adornment_name( v_new, $sym122$ALPHABETICAL_SEARCH );
    $cb_adornment_table$.setGlobalValue( ConsesLow.cons( v_new, Sequences.delete( $sym122$ALPHABETICAL_SEARCH, old, Symbols.symbol_function( EQUAL ), Symbols.symbol_function( $sym12$ADORNMENT_NAME ), UNPROVIDED,
        UNPROVIDED, UNPROVIDED ) ) );
    Hashtables.sethash( $kw123$PLUS_GREEN, cyc_file_dependencies.$cb_icon_definitions$.getGlobalValue(), ConsesLow.list( $str124$plus_green_gif, $str125$_LitQ_ ) );
    Hashtables.sethash( $kw126$PLUS_YELLOW, cyc_file_dependencies.$cb_icon_definitions$.getGlobalValue(), ConsesLow.list( $str127$plus_yellow_gif, $str125$_LitQ_ ) );
    Hashtables.sethash( $kw128$PLUS_PURPLE, cyc_file_dependencies.$cb_icon_definitions$.getGlobalValue(), ConsesLow.list( $str129$plus_purple_gif, $str125$_LitQ_ ) );
    Hashtables.sethash( $kw130$LIKELY, cyc_file_dependencies.$cb_icon_definitions$.getGlobalValue(), ConsesLow.list( $str124$plus_green_gif, $str125$_LitQ_ ) );
    Hashtables.sethash( $kw131$KNOWN, cyc_file_dependencies.$cb_icon_definitions$.getGlobalValue(), ConsesLow.list( $str127$plus_yellow_gif, $str125$_LitQ_ ) );
    Hashtables.sethash( $kw132$POSSIBLE, cyc_file_dependencies.$cb_icon_definitions$.getGlobalValue(), ConsesLow.list( $str129$plus_purple_gif, $str125$_LitQ_ ) );
    old = $cb_adornment_table$.getGlobalValue();
    v_new = make_adornment( $list134 );
    _csetf_adornment_name( v_new, $sym135$LITERAL_QUERY_INDEX );
    $cb_adornment_table$.setGlobalValue( ConsesLow.cons( v_new, Sequences.delete( $sym135$LITERAL_QUERY_INDEX, old, Symbols.symbol_function( EQUAL ), Symbols.symbol_function( $sym12$ADORNMENT_NAME ), UNPROVIDED,
        UNPROVIDED, UNPROVIDED ) ) );
    old = $cb_adornment_table$.getGlobalValue();
    v_new = make_adornment( $list137 );
    _csetf_adornment_name( v_new, $sym138$LITERAL_QUERY_NORMAL );
    $cb_adornment_table$.setGlobalValue( ConsesLow.cons( v_new, Sequences.delete( $sym138$LITERAL_QUERY_NORMAL, old, Symbols.symbol_function( EQUAL ), Symbols.symbol_function( $sym12$ADORNMENT_NAME ), UNPROVIDED,
        UNPROVIDED, UNPROVIDED ) ) );
    old = $cb_adornment_table$.getGlobalValue();
    v_new = make_adornment( $list140 );
    _csetf_adornment_name( v_new, $sym141$LITERAL_QUERY_INDEX_DISPLAY );
    $cb_adornment_table$.setGlobalValue( ConsesLow.cons( v_new, Sequences.delete( $sym141$LITERAL_QUERY_INDEX_DISPLAY, old, Symbols.symbol_function( EQUAL ), Symbols.symbol_function( $sym12$ADORNMENT_NAME ), UNPROVIDED,
        UNPROVIDED, UNPROVIDED ) ) );
    Hashtables.sethash( $kw145$BL_SDI, cyc_file_dependencies.$cb_icon_definitions$.getGlobalValue(), ConsesLow.list( $str146$bl_sdi_gif, NIL ) );
    old = $cb_adornment_table$.getGlobalValue();
    v_new = make_adornment( $list147 );
    _csetf_adornment_name( v_new, $sym148$ASSERTED_ASSERTION );
    $cb_adornment_table$.setGlobalValue( ConsesLow.cons( v_new, Sequences.delete( $sym148$ASSERTED_ASSERTION, old, Symbols.symbol_function( EQUAL ), Symbols.symbol_function( $sym12$ADORNMENT_NAME ), UNPROVIDED,
        UNPROVIDED, UNPROVIDED ) ) );
    Hashtables.sethash( $kw149$GR_SDI, cyc_file_dependencies.$cb_icon_definitions$.getGlobalValue(), ConsesLow.list( $str150$gr_sdi_gif, NIL ) );
    old = $cb_adornment_table$.getGlobalValue();
    v_new = make_adornment( $list151 );
    _csetf_adornment_name( v_new, $sym152$DEDUCED_ASSERTION );
    $cb_adornment_table$.setGlobalValue( ConsesLow.cons( v_new, Sequences.delete( $sym152$DEDUCED_ASSERTION, old, Symbols.symbol_function( EQUAL ), Symbols.symbol_function( $sym12$ADORNMENT_NAME ), UNPROVIDED,
        UNPROVIDED, UNPROVIDED ) ) );
    utilities_macros.register_html_state_variable( $sym153$_DEBUG_ADORNMENTS_P_ );
    Hashtables.sethash( $kw154$CB_VIEW_ADORN, cyc_file_dependencies.$cb_help_definitions$.getGlobalValue(), ConsesLow.list( $str155$cb_view_adorn_html, NIL ) );
    html_macros.note_cgi_handler_function( $sym194$CB_VIEW_ADORN, $kw195$HTML_HANDLER );
    html_macros.note_cgi_handler_function( $sym200$CB_ADORNMENT_HANDLER, $kw195$HTML_HANDLER );
    cb_utilities.setup_cb_link_method( $kw203$VIEW_ADORN, $sym204$CB_LINK_VIEW_ADORN, TWO_INTEGER );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_cb_adornments_file();
  }

  @Override
  public void initializeVariables()
  {
    init_cb_adornments_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_cb_adornments_file();
  }
  static
  {
    me = new cb_adornments();
    $adornment_display$ = null;
    $adorn_thingo$ = null;
    $adorn_arg$ = null;
    $adorn_pred$ = null;
    $adorn_mt$ = null;
    $adornment_type$ = null;
    $adornment_sorted_list$ = null;
    $dtp_adornment$ = null;
    $cb_adornment_table$ = null;
    $debug_adornments_p$ = null;
    $kw0$MAIN = makeKeyword( "MAIN" );
    $list1 = ConsesLow.list( new SubLObject[] { makeSymbol( "ALPHABETICAL-SEARCH" ), makeSymbol( "VFACETS" ), makeSymbol( "WORDNET-SYNSET" ), makeSymbol( "HIERARCHY-DEFAULT" ), makeSymbol( "HIERARCHY-LINK" ), makeSymbol(
        "LITERAL-QUERY-INDEX-DISPLAY" ), makeSymbol( "LITERAL-QUERY-NORMAL" ), makeSymbol( "LITERAL-QUERY-INDEX" ), makeSymbol( "CONSTANT-REVIEW" ), makeSymbol( "ASSERTION-REVIEW" ), makeSymbol( "META-AXIOMS" ),
      makeSymbol( "DEDUCED-ASSERTION" ), makeSymbol( "ASSERTED-ASSERTION" )
    } );
    $str2$_ = makeString( "#" );
    $sym3$ADORNMENT = makeSymbol( "ADORNMENT" );
    $sym4$ADORNMENT_P = makeSymbol( "ADORNMENT-P" );
    $list5 = ConsesLow.list( new SubLObject[] { makeSymbol( "NAME" ), makeSymbol( "TYPE" ), makeSymbol( "ACTIVE-P" ), makeSymbol( "IMAGE" ), makeSymbol( "IMAGE-DISABLED" ), makeSymbol( "IMAGE-ALT" ), makeSymbol(
        "DYNAMIC-TAGFN" ), makeSymbol( "COLOR" ), makeSymbol( "LETTER" ), makeSymbol( "EFFECTIVE-FN" ), makeSymbol( "HANDLER" ), makeSymbol( "TOOL" ), makeSymbol( "COMMENT" ), makeSymbol( "DYNAMIC-COMMENT" ), makeSymbol(
            "TITLE" )
    } );
    $list6 = ConsesLow.list( new SubLObject[] { makeKeyword( "NAME" ), makeKeyword( "TYPE" ), makeKeyword( "ACTIVE-P" ), makeKeyword( "IMAGE" ), makeKeyword( "IMAGE-DISABLED" ), makeKeyword( "IMAGE-ALT" ), makeKeyword(
        "DYNAMIC-TAGFN" ), makeKeyword( "COLOR" ), makeKeyword( "LETTER" ), makeKeyword( "EFFECTIVE-FN" ), makeKeyword( "HANDLER" ), makeKeyword( "TOOL" ), makeKeyword( "COMMENT" ), makeKeyword( "DYNAMIC-COMMENT" ),
      makeKeyword( "TITLE" )
    } );
    $list7 = ConsesLow.list( new SubLObject[] { makeSymbol( "ADORNMENT-NAME" ), makeSymbol( "ADORNMENT-TYPE" ), makeSymbol( "ADORNMENT-ACTIVE-P" ), makeSymbol( "ADORNMENT-IMAGE" ), makeSymbol(
        "ADORNMENT-IMAGE-DISABLED" ), makeSymbol( "ADORNMENT-IMAGE-ALT" ), makeSymbol( "ADORNMENT-DYNAMIC-TAGFN" ), makeSymbol( "ADORNMENT-COLOR" ), makeSymbol( "ADORNMENT-LETTER" ), makeSymbol(
            "ADORNMENT-EFFECTIVE-FN" ), makeSymbol( "ADORNMENT-HANDLER" ), makeSymbol( "ADORNMENT-TOOL" ), makeSymbol( "ADORNMENT-COMMENT" ), makeSymbol( "ADORNMENT-DYNAMIC-COMMENT" ), makeSymbol( "ADORNMENT-TITLE" )
    } );
    $list8 = ConsesLow.list( new SubLObject[] { makeSymbol( "_CSETF-ADORNMENT-NAME" ), makeSymbol( "_CSETF-ADORNMENT-TYPE" ), makeSymbol( "_CSETF-ADORNMENT-ACTIVE-P" ), makeSymbol( "_CSETF-ADORNMENT-IMAGE" ), makeSymbol(
        "_CSETF-ADORNMENT-IMAGE-DISABLED" ), makeSymbol( "_CSETF-ADORNMENT-IMAGE-ALT" ), makeSymbol( "_CSETF-ADORNMENT-DYNAMIC-TAGFN" ), makeSymbol( "_CSETF-ADORNMENT-COLOR" ), makeSymbol( "_CSETF-ADORNMENT-LETTER" ),
      makeSymbol( "_CSETF-ADORNMENT-EFFECTIVE-FN" ), makeSymbol( "_CSETF-ADORNMENT-HANDLER" ), makeSymbol( "_CSETF-ADORNMENT-TOOL" ), makeSymbol( "_CSETF-ADORNMENT-COMMENT" ), makeSymbol(
          "_CSETF-ADORNMENT-DYNAMIC-COMMENT" ), makeSymbol( "_CSETF-ADORNMENT-TITLE" )
    } );
    $sym9$PRINT_ADORNMENT = makeSymbol( "PRINT-ADORNMENT" );
    $sym10$ADORNMENT_PRINT_FUNCTION_TRAMPOLINE = makeSymbol( "ADORNMENT-PRINT-FUNCTION-TRAMPOLINE" );
    $list11 = ConsesLow.list( makeSymbol( "OPTIMIZE-FUNCALL" ), makeSymbol( "ADORNMENT-P" ) );
    $sym12$ADORNMENT_NAME = makeSymbol( "ADORNMENT-NAME" );
    $sym13$_CSETF_ADORNMENT_NAME = makeSymbol( "_CSETF-ADORNMENT-NAME" );
    $sym14$ADORNMENT_TYPE = makeSymbol( "ADORNMENT-TYPE" );
    $sym15$_CSETF_ADORNMENT_TYPE = makeSymbol( "_CSETF-ADORNMENT-TYPE" );
    $sym16$ADORNMENT_ACTIVE_P = makeSymbol( "ADORNMENT-ACTIVE-P" );
    $sym17$_CSETF_ADORNMENT_ACTIVE_P = makeSymbol( "_CSETF-ADORNMENT-ACTIVE-P" );
    $sym18$ADORNMENT_IMAGE = makeSymbol( "ADORNMENT-IMAGE" );
    $sym19$_CSETF_ADORNMENT_IMAGE = makeSymbol( "_CSETF-ADORNMENT-IMAGE" );
    $sym20$ADORNMENT_IMAGE_DISABLED = makeSymbol( "ADORNMENT-IMAGE-DISABLED" );
    $sym21$_CSETF_ADORNMENT_IMAGE_DISABLED = makeSymbol( "_CSETF-ADORNMENT-IMAGE-DISABLED" );
    $sym22$ADORNMENT_IMAGE_ALT = makeSymbol( "ADORNMENT-IMAGE-ALT" );
    $sym23$_CSETF_ADORNMENT_IMAGE_ALT = makeSymbol( "_CSETF-ADORNMENT-IMAGE-ALT" );
    $sym24$ADORNMENT_DYNAMIC_TAGFN = makeSymbol( "ADORNMENT-DYNAMIC-TAGFN" );
    $sym25$_CSETF_ADORNMENT_DYNAMIC_TAGFN = makeSymbol( "_CSETF-ADORNMENT-DYNAMIC-TAGFN" );
    $sym26$ADORNMENT_COLOR = makeSymbol( "ADORNMENT-COLOR" );
    $sym27$_CSETF_ADORNMENT_COLOR = makeSymbol( "_CSETF-ADORNMENT-COLOR" );
    $sym28$ADORNMENT_LETTER = makeSymbol( "ADORNMENT-LETTER" );
    $sym29$_CSETF_ADORNMENT_LETTER = makeSymbol( "_CSETF-ADORNMENT-LETTER" );
    $sym30$ADORNMENT_EFFECTIVE_FN = makeSymbol( "ADORNMENT-EFFECTIVE-FN" );
    $sym31$_CSETF_ADORNMENT_EFFECTIVE_FN = makeSymbol( "_CSETF-ADORNMENT-EFFECTIVE-FN" );
    $sym32$ADORNMENT_HANDLER = makeSymbol( "ADORNMENT-HANDLER" );
    $sym33$_CSETF_ADORNMENT_HANDLER = makeSymbol( "_CSETF-ADORNMENT-HANDLER" );
    $sym34$ADORNMENT_TOOL = makeSymbol( "ADORNMENT-TOOL" );
    $sym35$_CSETF_ADORNMENT_TOOL = makeSymbol( "_CSETF-ADORNMENT-TOOL" );
    $sym36$ADORNMENT_COMMENT = makeSymbol( "ADORNMENT-COMMENT" );
    $sym37$_CSETF_ADORNMENT_COMMENT = makeSymbol( "_CSETF-ADORNMENT-COMMENT" );
    $sym38$ADORNMENT_DYNAMIC_COMMENT = makeSymbol( "ADORNMENT-DYNAMIC-COMMENT" );
    $sym39$_CSETF_ADORNMENT_DYNAMIC_COMMENT = makeSymbol( "_CSETF-ADORNMENT-DYNAMIC-COMMENT" );
    $sym40$ADORNMENT_TITLE = makeSymbol( "ADORNMENT-TITLE" );
    $sym41$_CSETF_ADORNMENT_TITLE = makeSymbol( "_CSETF-ADORNMENT-TITLE" );
    $kw42$NAME = makeKeyword( "NAME" );
    $kw43$TYPE = makeKeyword( "TYPE" );
    $kw44$ACTIVE_P = makeKeyword( "ACTIVE-P" );
    $kw45$IMAGE = makeKeyword( "IMAGE" );
    $kw46$IMAGE_DISABLED = makeKeyword( "IMAGE-DISABLED" );
    $kw47$IMAGE_ALT = makeKeyword( "IMAGE-ALT" );
    $kw48$DYNAMIC_TAGFN = makeKeyword( "DYNAMIC-TAGFN" );
    $kw49$COLOR = makeKeyword( "COLOR" );
    $kw50$LETTER = makeKeyword( "LETTER" );
    $kw51$EFFECTIVE_FN = makeKeyword( "EFFECTIVE-FN" );
    $kw52$HANDLER = makeKeyword( "HANDLER" );
    $kw53$TOOL = makeKeyword( "TOOL" );
    $kw54$COMMENT = makeKeyword( "COMMENT" );
    $kw55$DYNAMIC_COMMENT = makeKeyword( "DYNAMIC-COMMENT" );
    $kw56$TITLE = makeKeyword( "TITLE" );
    $str57$Invalid_slot__S_for_construction_ = makeString( "Invalid slot ~S for construction function" );
    $kw58$BEGIN = makeKeyword( "BEGIN" );
    $sym59$MAKE_ADORNMENT = makeSymbol( "MAKE-ADORNMENT" );
    $kw60$SLOT = makeKeyword( "SLOT" );
    $kw61$END = makeKeyword( "END" );
    $sym62$VISIT_DEFSTRUCT_OBJECT_ADORNMENT_METHOD = makeSymbol( "VISIT-DEFSTRUCT-OBJECT-ADORNMENT-METHOD" );
    $sym63$_CB_ADORNMENT_TABLE_ = makeSymbol( "*CB-ADORNMENT-TABLE*" );
    $list64 = ConsesLow.list( makeSymbol( "NAME" ), makeSymbol( "&REST" ), makeSymbol( "ARGLIST" ) );
    $sym65$OLD = makeUninternedSymbol( "OLD" );
    $sym66$NEW = makeUninternedSymbol( "NEW" );
    $sym67$CLET = makeSymbol( "CLET" );
    $list68 = ConsesLow.list( makeSymbol( "*CB-ADORNMENT-TABLE*" ) );
    $sym69$QUOTE = makeSymbol( "QUOTE" );
    $sym70$CSETF = makeSymbol( "CSETF" );
    $sym71$CSETQ = makeSymbol( "CSETQ" );
    $sym72$CONS = makeSymbol( "CONS" );
    $sym73$DELETE = makeSymbol( "DELETE" );
    $list74 = ConsesLow.list( ConsesLow.list( makeSymbol( "FUNCTION" ), EQUAL ), ConsesLow.list( makeSymbol( "FUNCTION" ), makeSymbol( "ADORNMENT-NAME" ) ) );
    $sym75$ACTIVE_ADORNMENT_STRUCT_P = makeSymbol( "ACTIVE-ADORNMENT-STRUCT-P" );
    $kw76$ASSERTION = makeKeyword( "ASSERTION" );
    $kw77$DEDUCTION = makeKeyword( "DEDUCTION" );
    $kw78$INDEX_CONSTANT_NAME = makeKeyword( "INDEX-CONSTANT-NAME" );
    $kw79$INDEX_FORT = makeKeyword( "INDEX-FORT" );
    $kw80$INDEX_CONSTANT = makeKeyword( "INDEX-CONSTANT" );
    $kw81$CONSTANT = makeKeyword( "CONSTANT" );
    $kw82$GAF_ARG_PREDICATE = makeKeyword( "GAF-ARG-PREDICATE" );
    $kw83$INDEX_TERM = makeKeyword( "INDEX-TERM" );
    $kw84$TOP = makeKeyword( "TOP" );
    $str85$cb_start_ = makeString( "cb-start|" );
    $str86$_ = makeString( "&" );
    $kw87$CENTER = makeKeyword( "CENTER" );
    $sym88$DISPLAY_ADORNMENT = makeSymbol( "DISPLAY-ADORNMENT" );
    $sym89$ACTIVATE_ADORNMENT = makeSymbol( "ACTIVATE-ADORNMENT" );
    $kw90$INDEX_BROWSER = makeKeyword( "INDEX-BROWSER" );
    $str91$index_browser_gif = makeString( "index-browser.gif" );
    $kw92$INDEX_BROWSER_DISABLED = makeKeyword( "INDEX-BROWSER-DISABLED" );
    $str93$index_browser_disabled_gif = makeString( "index-browser-disabled.gif" );
    $list94 = ConsesLow.list( new SubLObject[] { makeKeyword( "TYPE" ), makeKeyword( "INDEX-TERM" ), makeKeyword( "ACTIVE-P" ), T, makeKeyword( "IMAGE" ), makeKeyword( "INDEX-BROWSER" ), makeKeyword( "IMAGE-DISABLED" ),
      makeKeyword( "INDEX-BROWSER-DISABLED" ), makeKeyword( "IMAGE-ALT" ), makeString( "[Indices]" ), makeKeyword( "EFFECTIVE-FN" ), makeSymbol( "CYC-TERM" ), makeKeyword( "HANDLER" ), makeString( "cb-cf" ), makeKeyword(
          "TITLE" ), makeString( "Index Browser" ), makeKeyword( "COMMENT" ), makeString( "Links you to the index view for a term." )
    } );
    $sym95$INDEX_BROWSER = makeSymbol( "INDEX-BROWSER" );
    $list96 = ConsesLow.list( new SubLObject[] { makeKeyword( "TYPE" ), makeKeyword( "ASSERTION" ), makeKeyword( "ACTIVE-P" ), T, makeKeyword( "COLOR" ), makeKeyword( "YELLOW" ), makeKeyword( "LETTER" ), makeString(
        "M" ), makeKeyword( "EFFECTIVE-FN" ), makeSymbol( "ASSERTION-HAS-META-ASSERTIONS?" ), makeKeyword( "COMMENT" ), makeString(
            "Indicates that some meta-assertion has been made, that is, an assertion where one of the arguments is this assertion." )
    } );
    $sym97$META_AXIOMS = makeSymbol( "META-AXIOMS" );
    $kw98$CY_MENU = makeKeyword( "CY-MENU" );
    $str99$cy_menu_gif = makeString( "cy_menu.gif" );
    $list100 = ConsesLow.list( new SubLObject[] { makeKeyword( "TYPE" ), makeKeyword( "ASSERTION" ), makeKeyword( "ACTIVE-P" ), NIL, makeKeyword( "IMAGE" ), makeKeyword( "CY-MENU" ), makeKeyword( "IMAGE-ALT" ),
      makeString( "[KE Assertion Review]" ), makeKeyword( "EFFECTIVE-FN" ), makeSymbol( "ASSERTION-NEEDS-REVIEW-P" ), makeKeyword( "HANDLER" ), makeString( "cb-taf" ), makeKeyword( "TOOL" ), makeKeyword( "KE-REVIEW" ),
      makeKeyword( "COMMENT" ), makeString( "Links to a special page for reviewing this assertion (support of #$MyReviewer)." )
    } );
    $sym101$ASSERTION_REVIEW = makeSymbol( "ASSERTION-REVIEW" );
    $kw102$BL_MENU = makeKeyword( "BL-MENU" );
    $str103$bl_menu_gif = makeString( "bl_menu.gif" );
    $list104 = ConsesLow.list( ONE_INTEGER, TWO_INTEGER );
    $sym105$RELEVANT_MT_IS_EVERYTHING = makeSymbol( "RELEVANT-MT-IS-EVERYTHING" );
    $const106$EverythingPSC = constant_handles.reader_make_constant_shell( makeString( "EverythingPSC" ) );
    $kw107$RED_DIAMOND = makeKeyword( "RED-DIAMOND" );
    $str108$red_diam_gif = makeString( "red_diam.gif" );
    $list109 = ConsesLow.list( new SubLObject[] { makeKeyword( "TYPE" ), makeKeyword( "GAF-ARG-PREDICATE" ), makeKeyword( "ACTIVE-P" ), T, makeKeyword( "IMAGE" ), makeKeyword( "RED-DIAMOND" ), makeKeyword( "IMAGE-ALT" ),
      makeString( "[Hier]" ), makeKeyword( "EFFECTIVE-FN" ), makeSymbol( "HIERARCHY-LINK-EFFECTIVE-FN" ), makeKeyword( "HANDLER" ), makeString( "cb-hier" ), makeKeyword( "TOOL" ), makeKeyword( "HIERARCHY-BROWSER" ),
      makeKeyword( "TITLE" ), makeString( "Hierarchy Browser" ), makeKeyword( "COMMENT" ), makeString( "Lets you browse the isa hierarchy." )
    } );
    $sym110$HIERARCHY_LINK = makeSymbol( "HIERARCHY-LINK" );
    $kw111$HIERARCHY_BROWSER = makeKeyword( "HIERARCHY-BROWSER" );
    $str112$hierarchy_browser_gif = makeString( "hierarchy-browser.gif" );
    $kw113$HIERARCHY_BROWSER_DISABLED = makeKeyword( "HIERARCHY-BROWSER-DISABLED" );
    $str114$hierarchy_browser_disabled_gif = makeString( "hierarchy-browser-disabled.gif" );
    $list115 = ConsesLow.list( new SubLObject[] { makeKeyword( "TYPE" ), makeKeyword( "INDEX-CONSTANT" ), makeKeyword( "ACTIVE-P" ), T, makeKeyword( "IMAGE" ), makeKeyword( "HIERARCHY-BROWSER" ), makeKeyword(
        "IMAGE-DISABLED" ), makeKeyword( "HIERARCHY-BROWSER-DISABLED" ), makeKeyword( "IMAGE-ALT" ), makeString( "[Hier]" ), makeKeyword( "EFFECTIVE-FN" ), makeSymbol( "HB-DEFAULT-METHOD-AVAILABLE?" ), makeKeyword(
            "HANDLER" ), makeString( "cb-hier-default" ), makeKeyword( "TOOL" ), makeKeyword( "HIERARCHY-BROWSER" ), makeKeyword( "TITLE" ), makeString( "Hierarchy Browser" ), makeKeyword( "COMMENT" ), makeString(
                "Lets you browse the isa hierarchy." )
    } );
    $sym116$HIERARCHY_DEFAULT = makeSymbol( "HIERARCHY-DEFAULT" );
    $kw117$ALPHA_BROWSER = makeKeyword( "ALPHA-BROWSER" );
    $str118$alpha_browser_gif = makeString( "alpha-browser.gif" );
    $kw119$ALPHA_BROWSER_DISABLED = makeKeyword( "ALPHA-BROWSER-DISABLED" );
    $str120$alpha_browser_disabled_gif = makeString( "alpha-browser-disabled.gif" );
    $list121 = ConsesLow.list( new SubLObject[] { makeKeyword( "TYPE" ), makeKeyword( "INDEX-CONSTANT-NAME" ), makeKeyword( "ACTIVE-P" ), T, makeKeyword( "IMAGE" ), makeKeyword( "ALPHA-BROWSER" ), makeKeyword(
        "IMAGE-DISABLED" ), makeKeyword( "ALPHA-BROWSER-DISABLED" ), makeKeyword( "IMAGE-ALT" ), makeString( "[Alpha]" ), makeKeyword( "EFFECTIVE-FN" ), makeSymbol( "CB-SHOW-ALPHABETIC-SEARCH?" ), makeKeyword(
            "HANDLER" ), makeString( "cb-ad" ), makeKeyword( "TOOL" ), makeKeyword( "ALPHA-TOP" ), makeKeyword( "TITLE" ), makeString( "Alphabetical Browser" ), makeKeyword( "COMMENT" ), makeString(
                "Links you to the alphabetical list of FORTs" )
    } );
    $sym122$ALPHABETICAL_SEARCH = makeSymbol( "ALPHABETICAL-SEARCH" );
    $kw123$PLUS_GREEN = makeKeyword( "PLUS-GREEN" );
    $str124$plus_green_gif = makeString( "plus-green.gif" );
    $str125$_LitQ_ = makeString( "[LitQ]" );
    $kw126$PLUS_YELLOW = makeKeyword( "PLUS-YELLOW" );
    $str127$plus_yellow_gif = makeString( "plus-yellow.gif" );
    $kw128$PLUS_PURPLE = makeKeyword( "PLUS-PURPLE" );
    $str129$plus_purple_gif = makeString( "plus-purple.gif" );
    $kw130$LIKELY = makeKeyword( "LIKELY" );
    $kw131$KNOWN = makeKeyword( "KNOWN" );
    $kw132$POSSIBLE = makeKeyword( "POSSIBLE" );
    $kw133$INDEX = makeKeyword( "INDEX" );
    $list134 = ConsesLow.list( new SubLObject[] { makeKeyword( "TYPE" ), makeKeyword( "GAF-ARG-PREDICATE-CONTENT" ), makeKeyword( "ACTIVE-P" ), T, makeKeyword( "IMAGE" ), makeSymbol( "LITERAL-QUERY-MARKER-ELSE-GREEN" ),
      makeKeyword( "IMAGE-ALT" ), makeString( "[LitQ]" ), makeKeyword( "EFFECTIVE-FN" ), makeSymbol( "LITERAL-QUERY-INDEX-EFFECTIVE-FN" ), makeKeyword( "HANDLER" ), makeString( "cb-lq" ), makeKeyword( "TOOL" ),
      makeKeyword( "ASK" ), makeKeyword( "COMMENT" ), makeString( "There are likely to be some additional derivable relations; this establishes them." )
    } );
    $sym135$LITERAL_QUERY_INDEX = makeSymbol( "LITERAL-QUERY-INDEX" );
    $kw136$NORMAL = makeKeyword( "NORMAL" );
    $list137 = ConsesLow.list( new SubLObject[] { makeKeyword( "TYPE" ), makeKeyword( "GAF-ARG-PREDICATEX" ), makeKeyword( "ACTIVE-P" ), T, makeKeyword( "IMAGE" ), makeSymbol( "LITERAL-QUERY-MARKER-ELSE-YELLOW" ),
      makeKeyword( "IMAGE-ALT" ), makeString( "[LitQ]" ), makeKeyword( "EFFECTIVE-FN" ), makeSymbol( "LITERAL-QUERY-NORMAL-EFFECTIVE-FN" ), makeKeyword( "HANDLER" ), makeString( "cb-lq" ), makeKeyword( "TOOL" ),
      makeKeyword( "ASK" ), makeKeyword( "COMMENT" ), makeString( "If Green, there are likely to be some additional derivable relations; if yellow, it is possible there are additional relations. This establishes them." )
    } );
    $sym138$LITERAL_QUERY_NORMAL = makeSymbol( "LITERAL-QUERY-NORMAL" );
    $kw139$INDEX_DISPLAY = makeKeyword( "INDEX-DISPLAY" );
    $list140 = ConsesLow.list( new SubLObject[] { makeKeyword( "TYPE" ), makeKeyword( "GAF-ARG-PREDICATEX" ), makeKeyword( "ACTIVE-P" ), T, makeKeyword( "IMAGE" ), makeSymbol( "LITERAL-QUERY-MARKER-ELSE-PURPLE" ),
      makeKeyword( "IMAGE-ALT" ), makeString( "[LitQ]" ), makeKeyword( "EFFECTIVE-FN" ), makeSymbol( "LITERAL-QUERY-INDEX-DISPLAY-EFFECTIVE-FN" ), makeKeyword( "HANDLER" ), makeString( "cb-lq" ), makeKeyword( "TOOL" ),
      makeKeyword( "ASK" ), makeKeyword( "COMMENT" ), makeString(
          "If Green, there are likely to be some additional derivable relations; if yellow, it is possible there are additional relations. If purple, additional relations are unlikely to be found (but you won't know until you try). This establishes them." )
    } );
    $sym141$LITERAL_QUERY_INDEX_DISPLAY = makeSymbol( "LITERAL-QUERY-INDEX-DISPLAY" );
    $str142$_Asserted_Argument_ = makeString( "[Asserted Argument]" );
    $sym143$CONVERT_DEDUCTION_TO_FORMULA = makeSymbol( "CONVERT-DEDUCTION-TO-FORMULA" );
    $str144$_Assertion_Deductions_ = makeString( "[Assertion Deductions]" );
    $kw145$BL_SDI = makeKeyword( "BL-SDI" );
    $str146$bl_sdi_gif = makeString( "bl_sdi.gif" );
    $list147 = ConsesLow.list( new SubLObject[] { makeKeyword( "TYPE" ), makeKeyword( "ASSERTION" ), makeKeyword( "ACTIVE-P" ), NIL, makeKeyword( "IMAGE" ), makeKeyword( "BL-SDI" ), makeKeyword( "DYNAMIC-TAGFN" ),
      makeSymbol( "CB-GET-ASSERTED-ARGUMENT" ), makeKeyword( "IMAGE-ALT" ), makeSymbol( "CB-GET-ASSERTED-ARGUMENT" ), makeKeyword( "EFFECTIVE-FN" ), makeSymbol( "ASSERTED-ASSERTION?" ), makeKeyword( "COMMENT" ),
      makeString( "effective when the assertion has some asserted argument." ), makeKeyword( "DYNAMIC-COMMENT" ), makeString( "The asserted argument" )
    } );
    $sym148$ASSERTED_ASSERTION = makeSymbol( "ASSERTED-ASSERTION" );
    $kw149$GR_SDI = makeKeyword( "GR-SDI" );
    $str150$gr_sdi_gif = makeString( "gr_sdi.gif" );
    $list151 = ConsesLow.list( new SubLObject[] { makeKeyword( "TYPE" ), makeKeyword( "ASSERTION" ), makeKeyword( "ACTIVE-P" ), NIL, makeKeyword( "IMAGE" ), makeKeyword( "GR-SDI" ), makeKeyword( "DYNAMIC-TAGFN" ),
      makeSymbol( "CB-ASSERTION-DEDUCTIONS" ), makeKeyword( "IMAGE-ALT" ), makeSymbol( "CB-ASSERTION-DEDUCTIONS" ), makeKeyword( "EFFECTIVE-FN" ), makeSymbol( "DEDUCED-ASSERTION?" ), makeKeyword( "COMMENT" ), makeString(
          "effective when the assertion has some deduced argument." ), makeKeyword( "DYNAMIC-COMMENT" ), makeString( "List of deduced formulas" )
    } );
    $sym152$DEDUCED_ASSERTION = makeSymbol( "DEDUCED-ASSERTION" );
    $sym153$_DEBUG_ADORNMENTS_P_ = makeSymbol( "*DEBUG-ADORNMENTS-P*" );
    $kw154$CB_VIEW_ADORN = makeKeyword( "CB-VIEW-ADORN" );
    $str155$cb_view_adorn_html = makeString( "cb-view-adorn.html" );
    $list156 = ConsesLow.list( makeSymbol( "INDEX-SPEC" ) );
    $str157$_a_does_not_specify_an_index = makeString( "~a does not specify an index" );
    $str158$Adornments = makeString( "Adornments" );
    $str159$__DOCTYPE_html_PUBLIC_____W3C__DT = makeString( "<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">" );
    $str160$_meta_http_equiv__X_UA_Compatible = makeString( "<meta http-equiv=\"X-UA-Compatible\" content=\"IE=Edge\" >" );
    $kw161$UNINITIALIZED = makeKeyword( "UNINITIALIZED" );
    $kw162$CB_CYC = makeKeyword( "CB-CYC" );
    $kw163$SAM_AUTOCOMPLETE_CSS = makeKeyword( "SAM-AUTOCOMPLETE-CSS" );
    $kw164$SHA1 = makeKeyword( "SHA1" );
    $str165$yui_skin_sam = makeString( "yui-skin-sam" );
    $str166$reloadFrameButton = makeString( "reloadFrameButton" );
    $str167$button = makeString( "button" );
    $str168$reload = makeString( "reload" );
    $str169$Refresh_Frames = makeString( "Refresh Frames" );
    $str170$post = makeString( "post" );
    $str171$cb_adornment_handler = makeString( "cb-adornment-handler" );
    $str172$Current_Values = makeString( "Current Values" );
    $str173$Update_Adornment_Settings = makeString( "Update Adornment Settings" );
    $str174$Currently_Active_Adornments__ = makeString( "Currently Active Adornments: " );
    $str175$Adornment_Associations = makeString( "Adornment Associations" );
    $kw176$MIDDLE = makeKeyword( "MIDDLE" );
    $str177$Icon = makeString( "Icon" );
    $str178$Active_ = makeString( "Active?" );
    $kw179$LEFT = makeKeyword( "LEFT" );
    $str180$Name = makeString( "Name" );
    $str181$Dynamic_ = makeString( "Dynamic?" );
    $str182$Has_Link_ = makeString( "Has Link?" );
    $str183$Type = makeString( "Type" );
    $str184$Tool = makeString( "Tool" );
    $str185$effective_fn = makeString( "effective-fn" );
    $sym186$ADORNMENT_ = makeSymbol( "ADORNMENT<" );
    $str187$_dddddd = makeString( "#dddddd" );
    $str188$_cccccc = makeString( "#cccccc" );
    $str189$_dynamic = makeString( "-dynamic" );
    $str190$_ = makeString( "?" );
    $str191$No = makeString( "No" );
    $str192$Yes = makeString( "Yes" );
    $kw193$NBSP = makeKeyword( "NBSP" );
    $sym194$CB_VIEW_ADORN = makeSymbol( "CB-VIEW-ADORN" );
    $kw195$HTML_HANDLER = makeKeyword( "HTML-HANDLER" );
    $str196$debug = makeString( "debug" );
    $str197$_ = makeString( "[" );
    $str198$_ = makeString( "]" );
    $str199$Active_adornments_have_been_chang = makeString( "Active adornments have been changed" );
    $sym200$CB_ADORNMENT_HANDLER = makeSymbol( "CB-ADORNMENT-HANDLER" );
    $str201$_View_Adornments_ = makeString( "[View Adornments]" );
    $str202$cb_view_adorn__A = makeString( "cb-view-adorn&~A" );
    $kw203$VIEW_ADORN = makeKeyword( "VIEW-ADORN" );
    $sym204$CB_LINK_VIEW_ADORN = makeSymbol( "CB-LINK-VIEW-ADORN" );
    $str205$___ = makeString( " : " );
  }

  public static final class $adornment_native
      extends
        SubLStructNative
  {
    public SubLObject $name;
    public SubLObject $type;
    public SubLObject $active_p;
    public SubLObject $image;
    public SubLObject $image_disabled;
    public SubLObject $image_alt;
    public SubLObject $dynamic_tagfn;
    public SubLObject $color;
    public SubLObject $letter;
    public SubLObject $effective_fn;
    public SubLObject $handler;
    public SubLObject $tool;
    public SubLObject $comment;
    public SubLObject $dynamic_comment;
    public SubLObject $title;
    private static final SubLStructDeclNative structDecl;

    public $adornment_native()
    {
      this.$name = CommonSymbols.NIL;
      this.$type = CommonSymbols.NIL;
      this.$active_p = CommonSymbols.NIL;
      this.$image = CommonSymbols.NIL;
      this.$image_disabled = CommonSymbols.NIL;
      this.$image_alt = CommonSymbols.NIL;
      this.$dynamic_tagfn = CommonSymbols.NIL;
      this.$color = CommonSymbols.NIL;
      this.$letter = CommonSymbols.NIL;
      this.$effective_fn = CommonSymbols.NIL;
      this.$handler = CommonSymbols.NIL;
      this.$tool = CommonSymbols.NIL;
      this.$comment = CommonSymbols.NIL;
      this.$dynamic_comment = CommonSymbols.NIL;
      this.$title = CommonSymbols.NIL;
    }

    @Override
    public SubLStructDecl getStructDecl()
    {
      return $adornment_native.structDecl;
    }

    @Override
    public SubLObject getField2()
    {
      return this.$name;
    }

    @Override
    public SubLObject getField3()
    {
      return this.$type;
    }

    @Override
    public SubLObject getField4()
    {
      return this.$active_p;
    }

    @Override
    public SubLObject getField5()
    {
      return this.$image;
    }

    @Override
    public SubLObject getField6()
    {
      return this.$image_disabled;
    }

    @Override
    public SubLObject getField7()
    {
      return this.$image_alt;
    }

    @Override
    public SubLObject getField8()
    {
      return this.$dynamic_tagfn;
    }

    @Override
    public SubLObject getField9()
    {
      return this.$color;
    }

    @Override
    public SubLObject getField10()
    {
      return this.$letter;
    }

    @Override
    public SubLObject getField11()
    {
      return this.$effective_fn;
    }

    @Override
    public SubLObject getField12()
    {
      return this.$handler;
    }

    @Override
    public SubLObject getField13()
    {
      return this.$tool;
    }

    @Override
    public SubLObject getField14()
    {
      return this.$comment;
    }

    @Override
    public SubLObject getField15()
    {
      return this.$dynamic_comment;
    }

    @Override
    public SubLObject getField16()
    {
      return this.$title;
    }

    @Override
    public SubLObject setField2(final SubLObject value)
    {
      return this.$name = value;
    }

    @Override
    public SubLObject setField3(final SubLObject value)
    {
      return this.$type = value;
    }

    @Override
    public SubLObject setField4(final SubLObject value)
    {
      return this.$active_p = value;
    }

    @Override
    public SubLObject setField5(final SubLObject value)
    {
      return this.$image = value;
    }

    @Override
    public SubLObject setField6(final SubLObject value)
    {
      return this.$image_disabled = value;
    }

    @Override
    public SubLObject setField7(final SubLObject value)
    {
      return this.$image_alt = value;
    }

    @Override
    public SubLObject setField8(final SubLObject value)
    {
      return this.$dynamic_tagfn = value;
    }

    @Override
    public SubLObject setField9(final SubLObject value)
    {
      return this.$color = value;
    }

    @Override
    public SubLObject setField10(final SubLObject value)
    {
      return this.$letter = value;
    }

    @Override
    public SubLObject setField11(final SubLObject value)
    {
      return this.$effective_fn = value;
    }

    @Override
    public SubLObject setField12(final SubLObject value)
    {
      return this.$handler = value;
    }

    @Override
    public SubLObject setField13(final SubLObject value)
    {
      return this.$tool = value;
    }

    @Override
    public SubLObject setField14(final SubLObject value)
    {
      return this.$comment = value;
    }

    @Override
    public SubLObject setField15(final SubLObject value)
    {
      return this.$dynamic_comment = value;
    }

    @Override
    public SubLObject setField16(final SubLObject value)
    {
      return this.$title = value;
    }
    static
    {
      structDecl = Structures.makeStructDeclNative( $adornment_native.class, $sym3$ADORNMENT, $sym4$ADORNMENT_P, $list5, $list6, new String[] { "$name", "$type", "$active_p", "$image", "$image_disabled", "$image_alt",
        "$dynamic_tagfn", "$color", "$letter", "$effective_fn", "$handler", "$tool", "$comment", "$dynamic_comment", "$title"
      }, $list7, $list8, $sym9$PRINT_ADORNMENT );
    }
  }

  public static final class $adornment_p$UnaryFunction
      extends
        UnaryFunction
  {
    public $adornment_p$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "ADORNMENT-P" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1)
    {
      return adornment_p( arg1 );
    }
  }
}
/*
 * 
 * Total time: 1444 ms synthetic
 */