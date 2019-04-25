package com.cyc.cycjava.cycl.sbhl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ZeroArityFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.cycjava.cycl.utilities_macros;
import com.cyc.cycjava.cycl.subl_macro_promotions;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.cycjava.cycl.dumper;
import com.cyc.cycjava.cycl.subl_promotions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.dictionary_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.cycjava.cycl.dictionary;
import com.cyc.cycjava.cycl.forts;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class sbhl_module_vars
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.sbhl.sbhl_module_vars";
  public static final String myFingerPrint = "d8962980822faaf31e70b4a215871f7b4e343a82c455cdb5c97702617994a39e";
  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-module-vars.lisp", position = 1257L)
  public static SubLSymbol $dtp_sbhl_module$;
  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-module-vars.lisp", position = 6986L)
  private static SubLSymbol $sbhl_module_key_test$;
  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-module-vars.lisp", position = 7181L)
  public static SubLSymbol $sbhl_modules$;
  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-module-vars.lisp", position = 9801L)
  public static SubLSymbol $sbhl_module_types$;
  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-module-vars.lisp", position = 12445L)
  private static SubLSymbol $sbhl_module_properties$;
  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-module-vars.lisp", position = 16814L)
  private static SubLSymbol $sbhl_module_required_properties$;
  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-module-vars.lisp", position = 17730L)
  public static SubLSymbol $sbhl_module$;
  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-module-vars.lisp", position = 19137L)
  public static SubLSymbol $sbhl_module_vars$;
  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-module-vars.lisp", position = 19226L)
  public static SubLSymbol $fort_denoting_sbhl_directed_graph$;
  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-module-vars.lisp", position = 19463L)
  public static SubLSymbol $fort_denoting_sbhl_undirected_graph$;
  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-module-vars.lisp", position = 20286L)
  public static SubLSymbol $assume_sbhl_extensions_nonempty$;
  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-module-vars.lisp", position = 20878L)
  private static SubLSymbol $sbhl_module_link_pred_preference_order$;
  private static final SubLSymbol $sym0$SBHL_MODULE;
  private static final SubLSymbol $sym1$SBHL_MODULE_P;
  private static final SubLList $list2;
  private static final SubLList $list3;
  private static final SubLList $list4;
  private static final SubLList $list5;
  private static final SubLSymbol $sym6$PRINT_SBHL_MODULE;
  private static final SubLSymbol $sym7$SBHL_MODULE_PRINT_FUNCTION_TRAMPOLINE;
  private static final SubLList $list8;
  private static final SubLSymbol $sym9$SBHL_MOD_LINK_PRED;
  private static final SubLSymbol $sym10$_CSETF_SBHL_MOD_LINK_PRED;
  private static final SubLSymbol $sym11$SBHL_MOD_ACCESSIBLE_LINK_PREDS;
  private static final SubLSymbol $sym12$_CSETF_SBHL_MOD_ACCESSIBLE_LINK_PREDS;
  private static final SubLSymbol $sym13$SBHL_MOD_GRAPH;
  private static final SubLSymbol $sym14$_CSETF_SBHL_MOD_GRAPH;
  private static final SubLSymbol $sym15$SBHL_MOD_LINK_STYLE;
  private static final SubLSymbol $sym16$_CSETF_SBHL_MOD_LINK_STYLE;
  private static final SubLSymbol $sym17$SBHL_MOD_INDEX_ARG;
  private static final SubLSymbol $sym18$_CSETF_SBHL_MOD_INDEX_ARG;
  private static final SubLSymbol $sym19$SBHL_MOD_MODULE_TYPE;
  private static final SubLSymbol $sym20$_CSETF_SBHL_MOD_MODULE_TYPE;
  private static final SubLSymbol $sym21$SBHL_MOD_TYPE_TEST;
  private static final SubLSymbol $sym22$_CSETF_SBHL_MOD_TYPE_TEST;
  private static final SubLSymbol $sym23$SBHL_MOD_PATH_TERMINATING_MARK_FN;
  private static final SubLSymbol $sym24$_CSETF_SBHL_MOD_PATH_TERMINATING_MARK_FN;
  private static final SubLSymbol $sym25$SBHL_MOD_MARKING_FN;
  private static final SubLSymbol $sym26$_CSETF_SBHL_MOD_MARKING_FN;
  private static final SubLSymbol $sym27$SBHL_MOD_UNMARKING_FN;
  private static final SubLSymbol $sym28$_CSETF_SBHL_MOD_UNMARKING_FN;
  private static final SubLSymbol $sym29$SBHL_MOD_VAR_BINDINGS;
  private static final SubLSymbol $sym30$_CSETF_SBHL_MOD_VAR_BINDINGS;
  private static final SubLSymbol $sym31$SBHL_MOD_MISC_PROPERTIES;
  private static final SubLSymbol $sym32$_CSETF_SBHL_MOD_MISC_PROPERTIES;
  private static final SubLSymbol $kw33$LINK_PRED;
  private static final SubLSymbol $kw34$ACCESSIBLE_LINK_PREDS;
  private static final SubLSymbol $kw35$GRAPH;
  private static final SubLSymbol $kw36$LINK_STYLE;
  private static final SubLSymbol $kw37$INDEX_ARG;
  private static final SubLSymbol $kw38$MODULE_TYPE;
  private static final SubLSymbol $kw39$TYPE_TEST;
  private static final SubLSymbol $kw40$PATH_TERMINATING_MARK_FN;
  private static final SubLSymbol $kw41$MARKING_FN;
  private static final SubLSymbol $kw42$UNMARKING_FN;
  private static final SubLSymbol $kw43$VAR_BINDINGS;
  private static final SubLSymbol $kw44$MISC_PROPERTIES;
  private static final SubLString $str45$Invalid_slot__S_for_construction_;
  private static final SubLSymbol $kw46$BEGIN;
  private static final SubLSymbol $sym47$MAKE_SBHL_MODULE;
  private static final SubLSymbol $kw48$SLOT;
  private static final SubLSymbol $kw49$END;
  private static final SubLSymbol $sym50$VISIT_DEFSTRUCT_OBJECT_SBHL_MODULE_METHOD;
  private static final SubLString $str51$__SBHL_MODULE__;
  private static final SubLString $str52$_;
  private static final SubLSymbol $sym53$FORT_P;
  private static final SubLSymbol $kw54$ERROR;
  private static final SubLString $str55$_A_is_not_a__A;
  private static final SubLSymbol $sym56$SBHL_MODULE_PROPERTY_P;
  private static final SubLSymbol $kw57$CERROR;
  private static final SubLString $str58$continue_anyway;
  private static final SubLSymbol $kw59$WARN;
  private static final SubLString $str60$_A_is_not_a_valid__sbhl_type_erro;
  private static final SubLSymbol $kw61$PATH_TERMINATING_MARK__FN;
  private static final SubLSymbol $sym62$_SBHL_MODULES_;
  private static final SubLString $str63$____SBHL_module_store_has_been_co;
  private static final SubLString $str64$____No_KB_has_been_loaded__SBHL_m;
  private static final SubLString $str65$____Unexpected_SBHL_module_store_;
  private static final SubLSymbol $kw66$CHECKED;
  private static final SubLSymbol $sym67$SBHL_PREDICATE_OBJECT_P;
  private static final SubLSymbol $sym68$SBHL_MODULE_OBJECT_P;
  private static final SubLList $list69;
  private static final SubLSymbol $sym70$KEY;
  private static final SubLSymbol $sym71$DO_ALIST;
  private static final SubLList $list72;
  private static final SubLSymbol $kw73$DONE;
  private static final SubLSymbol $sym74$IGNORE;
  private static final SubLList $list75;
  private static final SubLSymbol $kw76$SIMPLE_REFLEXIVE;
  private static final SubLSymbol $kw77$SIMPLE_NON_REFLEXIVE;
  private static final SubLSymbol $kw78$TRANSFERS_THROUGH;
  private static final SubLSymbol $kw79$DISJOINS;
  private static final SubLSymbol $kw80$TIME;
  private static final SubLSymbol $sym81$MODULE;
  private static final SubLSymbol $sym82$DO_SBHL_MODULES;
  private static final SubLSymbol $sym83$PWHEN;
  private static final SubLSymbol $sym84$SBHL_SIMPLE_MODULE_P;
  private static final SubLSymbol $sym85$CLET;
  private static final SubLSymbol $sym86$GET_SBHL_LINK_PRED;
  private static final SubLSymbol $sym87$MODULE;
  private static final SubLSymbol $sym88$SBHL_TIME_MODULE_P;
  private static final SubLList $list89;
  private static final SubLSymbol $sym90$MODULE;
  private static final SubLSymbol $sym91$_SBHL_MODULE_PROPERTIES_;
  private static final SubLSymbol $sym92$SBHL_LINK_STYLE_SPECIFIER_P;
  private static final SubLSymbol $kw93$NAUT_FORWARD_TRUE_GENERATORS;
  private static final SubLSymbol $sym94$FUNCTION_SYMBOL_LIST_P;
  private static final SubLSymbol $sym95$SBHL_MODULE_TYPE_P;
  private static final SubLSymbol $sym96$FUNCTION_SYMBOL_P;
  private static final SubLSymbol $kw97$MODULE_INVERTS_ARGUMENTS;
  private static final SubLSymbol $sym98$SBHL_MODULE_OR_PREDICATE_P;
  private static final SubLSymbol $kw99$INVERTS_ARGUMENTS_OF_MODULE;
  private static final SubLSymbol $kw100$DISJOINS_MODULE;
  private static final SubLSymbol $kw101$MARKING_INCREMENT;
  private static final SubLSymbol $sym102$INTEGERP;
  private static final SubLSymbol $sym103$LISTP;
  private static final SubLSymbol $kw104$TRANSFERS_THROUGH_MODULE;
  private static final SubLSymbol $kw105$TRANSFERS_VIA_ARG;
  private static final SubLSymbol $kw106$ADD_NODE_TO_RESULT_TEST;
  private static final SubLSymbol $kw107$ADD_UNMARKED_NODE_TO_RESULT_TEST;
  private static final SubLSymbol $kw108$PREDICATE_SEARCH_P;
  private static final SubLSymbol $sym109$BOOLEANP;
  private static final SubLSymbol $kw110$MODULE_TAG;
  private static final SubLSymbol $sym111$KEYWORDP;
  private static final SubLSymbol $kw112$ROOT;
  private static final SubLSymbol $sym113$SBHL_NODE_OBJECT_P;
  private static final SubLSymbol $sym114$HASH_TABLE_P;
  private static final SubLSymbol $kw115$SBHL_MARKING_PARAMETERS;
  private static final SubLList $list116;
  private static final SubLSymbol $sym117$DO_DICTIONARY;
  private static final SubLList $list118;
  private static final SubLList $list119;
  private static final SubLList $list120;
  private static final SubLSymbol $sym121$SMART_CSOME;
  private static final SubLList $list122;
  private static final SubLString $str123$_A_is_not_a_valid_sbhl_predicate_;
  private static final SubLList $list124;
  private static final SubLSymbol $sym125$_SBHL_MODULE_;
  private static final SubLSymbol $sym126$FIF;
  private static final SubLList $list127;
  private static final SubLObject $const128$DirectedMultigraph;
  private static final SubLObject $const129$Multigraph;
  private static final SubLString $str130$Term___a__is_not_used_to_specify_;
  private static final SubLList $list131;
  private static final SubLSymbol $sym132$SBHL_MODULES_LINK_PRED__;
  private static final SubLSymbol $sym133$_;
  private static final SubLSymbol $sym134$SECOND;
  private static final SubLSymbol $sym135$FIRST;
  private static final SubLObject $const136$genls;

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-module-vars.lisp", position = 1257L)
  public static SubLObject sbhl_module_print_function_trampoline(final SubLObject v_object, final SubLObject stream)
  {
    print_sbhl_module( v_object, stream, ZERO_INTEGER );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-module-vars.lisp", position = 1257L)
  public static SubLObject sbhl_module_p(final SubLObject v_object)
  {
    return ( v_object.getClass() == $sbhl_module_native.class ) ? T : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-module-vars.lisp", position = 1257L)
  public static SubLObject sbhl_mod_link_pred(final SubLObject v_object)
  {
    assert NIL != sbhl_module_p( v_object ) : v_object;
    return v_object.getField2();
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-module-vars.lisp", position = 1257L)
  public static SubLObject sbhl_mod_accessible_link_preds(final SubLObject v_object)
  {
    assert NIL != sbhl_module_p( v_object ) : v_object;
    return v_object.getField3();
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-module-vars.lisp", position = 1257L)
  public static SubLObject sbhl_mod_graph(final SubLObject v_object)
  {
    assert NIL != sbhl_module_p( v_object ) : v_object;
    return v_object.getField4();
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-module-vars.lisp", position = 1257L)
  public static SubLObject sbhl_mod_link_style(final SubLObject v_object)
  {
    assert NIL != sbhl_module_p( v_object ) : v_object;
    return v_object.getField5();
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-module-vars.lisp", position = 1257L)
  public static SubLObject sbhl_mod_index_arg(final SubLObject v_object)
  {
    assert NIL != sbhl_module_p( v_object ) : v_object;
    return v_object.getField6();
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-module-vars.lisp", position = 1257L)
  public static SubLObject sbhl_mod_module_type(final SubLObject v_object)
  {
    assert NIL != sbhl_module_p( v_object ) : v_object;
    return v_object.getField7();
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-module-vars.lisp", position = 1257L)
  public static SubLObject sbhl_mod_type_test(final SubLObject v_object)
  {
    assert NIL != sbhl_module_p( v_object ) : v_object;
    return v_object.getField8();
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-module-vars.lisp", position = 1257L)
  public static SubLObject sbhl_mod_path_terminating_mark_fn(final SubLObject v_object)
  {
    assert NIL != sbhl_module_p( v_object ) : v_object;
    return v_object.getField9();
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-module-vars.lisp", position = 1257L)
  public static SubLObject sbhl_mod_marking_fn(final SubLObject v_object)
  {
    assert NIL != sbhl_module_p( v_object ) : v_object;
    return v_object.getField10();
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-module-vars.lisp", position = 1257L)
  public static SubLObject sbhl_mod_unmarking_fn(final SubLObject v_object)
  {
    assert NIL != sbhl_module_p( v_object ) : v_object;
    return v_object.getField11();
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-module-vars.lisp", position = 1257L)
  public static SubLObject sbhl_mod_var_bindings(final SubLObject v_object)
  {
    assert NIL != sbhl_module_p( v_object ) : v_object;
    return v_object.getField12();
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-module-vars.lisp", position = 1257L)
  public static SubLObject sbhl_mod_misc_properties(final SubLObject v_object)
  {
    assert NIL != sbhl_module_p( v_object ) : v_object;
    return v_object.getField13();
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-module-vars.lisp", position = 1257L)
  public static SubLObject _csetf_sbhl_mod_link_pred(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != sbhl_module_p( v_object ) : v_object;
    return v_object.setField2( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-module-vars.lisp", position = 1257L)
  public static SubLObject _csetf_sbhl_mod_accessible_link_preds(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != sbhl_module_p( v_object ) : v_object;
    return v_object.setField3( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-module-vars.lisp", position = 1257L)
  public static SubLObject _csetf_sbhl_mod_graph(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != sbhl_module_p( v_object ) : v_object;
    return v_object.setField4( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-module-vars.lisp", position = 1257L)
  public static SubLObject _csetf_sbhl_mod_link_style(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != sbhl_module_p( v_object ) : v_object;
    return v_object.setField5( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-module-vars.lisp", position = 1257L)
  public static SubLObject _csetf_sbhl_mod_index_arg(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != sbhl_module_p( v_object ) : v_object;
    return v_object.setField6( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-module-vars.lisp", position = 1257L)
  public static SubLObject _csetf_sbhl_mod_module_type(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != sbhl_module_p( v_object ) : v_object;
    return v_object.setField7( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-module-vars.lisp", position = 1257L)
  public static SubLObject _csetf_sbhl_mod_type_test(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != sbhl_module_p( v_object ) : v_object;
    return v_object.setField8( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-module-vars.lisp", position = 1257L)
  public static SubLObject _csetf_sbhl_mod_path_terminating_mark_fn(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != sbhl_module_p( v_object ) : v_object;
    return v_object.setField9( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-module-vars.lisp", position = 1257L)
  public static SubLObject _csetf_sbhl_mod_marking_fn(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != sbhl_module_p( v_object ) : v_object;
    return v_object.setField10( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-module-vars.lisp", position = 1257L)
  public static SubLObject _csetf_sbhl_mod_unmarking_fn(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != sbhl_module_p( v_object ) : v_object;
    return v_object.setField11( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-module-vars.lisp", position = 1257L)
  public static SubLObject _csetf_sbhl_mod_var_bindings(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != sbhl_module_p( v_object ) : v_object;
    return v_object.setField12( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-module-vars.lisp", position = 1257L)
  public static SubLObject _csetf_sbhl_mod_misc_properties(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != sbhl_module_p( v_object ) : v_object;
    return v_object.setField13( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-module-vars.lisp", position = 1257L)
  public static SubLObject make_sbhl_module(SubLObject arglist)
  {
    if( arglist == UNPROVIDED )
    {
      arglist = NIL;
    }
    final SubLObject v_new = new $sbhl_module_native();
    SubLObject next;
    SubLObject current_arg;
    SubLObject current_value;
    SubLObject pcase_var;
    for( next = NIL, next = arglist; NIL != next; next = conses_high.cddr( next ) )
    {
      current_arg = next.first();
      current_value = conses_high.cadr( next );
      pcase_var = current_arg;
      if( pcase_var.eql( $kw33$LINK_PRED ) )
      {
        _csetf_sbhl_mod_link_pred( v_new, current_value );
      }
      else if( pcase_var.eql( $kw34$ACCESSIBLE_LINK_PREDS ) )
      {
        _csetf_sbhl_mod_accessible_link_preds( v_new, current_value );
      }
      else if( pcase_var.eql( $kw35$GRAPH ) )
      {
        _csetf_sbhl_mod_graph( v_new, current_value );
      }
      else if( pcase_var.eql( $kw36$LINK_STYLE ) )
      {
        _csetf_sbhl_mod_link_style( v_new, current_value );
      }
      else if( pcase_var.eql( $kw37$INDEX_ARG ) )
      {
        _csetf_sbhl_mod_index_arg( v_new, current_value );
      }
      else if( pcase_var.eql( $kw38$MODULE_TYPE ) )
      {
        _csetf_sbhl_mod_module_type( v_new, current_value );
      }
      else if( pcase_var.eql( $kw39$TYPE_TEST ) )
      {
        _csetf_sbhl_mod_type_test( v_new, current_value );
      }
      else if( pcase_var.eql( $kw40$PATH_TERMINATING_MARK_FN ) )
      {
        _csetf_sbhl_mod_path_terminating_mark_fn( v_new, current_value );
      }
      else if( pcase_var.eql( $kw41$MARKING_FN ) )
      {
        _csetf_sbhl_mod_marking_fn( v_new, current_value );
      }
      else if( pcase_var.eql( $kw42$UNMARKING_FN ) )
      {
        _csetf_sbhl_mod_unmarking_fn( v_new, current_value );
      }
      else if( pcase_var.eql( $kw43$VAR_BINDINGS ) )
      {
        _csetf_sbhl_mod_var_bindings( v_new, current_value );
      }
      else if( pcase_var.eql( $kw44$MISC_PROPERTIES ) )
      {
        _csetf_sbhl_mod_misc_properties( v_new, current_value );
      }
      else
      {
        Errors.error( $str45$Invalid_slot__S_for_construction_, current_arg );
      }
    }
    return v_new;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-module-vars.lisp", position = 1257L)
  public static SubLObject visit_defstruct_sbhl_module(final SubLObject obj, final SubLObject visitor_fn)
  {
    Functions.funcall( visitor_fn, obj, $kw46$BEGIN, $sym47$MAKE_SBHL_MODULE, TWELVE_INTEGER );
    Functions.funcall( visitor_fn, obj, $kw48$SLOT, $kw33$LINK_PRED, sbhl_mod_link_pred( obj ) );
    Functions.funcall( visitor_fn, obj, $kw48$SLOT, $kw34$ACCESSIBLE_LINK_PREDS, sbhl_mod_accessible_link_preds( obj ) );
    Functions.funcall( visitor_fn, obj, $kw48$SLOT, $kw35$GRAPH, sbhl_mod_graph( obj ) );
    Functions.funcall( visitor_fn, obj, $kw48$SLOT, $kw36$LINK_STYLE, sbhl_mod_link_style( obj ) );
    Functions.funcall( visitor_fn, obj, $kw48$SLOT, $kw37$INDEX_ARG, sbhl_mod_index_arg( obj ) );
    Functions.funcall( visitor_fn, obj, $kw48$SLOT, $kw38$MODULE_TYPE, sbhl_mod_module_type( obj ) );
    Functions.funcall( visitor_fn, obj, $kw48$SLOT, $kw39$TYPE_TEST, sbhl_mod_type_test( obj ) );
    Functions.funcall( visitor_fn, obj, $kw48$SLOT, $kw40$PATH_TERMINATING_MARK_FN, sbhl_mod_path_terminating_mark_fn( obj ) );
    Functions.funcall( visitor_fn, obj, $kw48$SLOT, $kw41$MARKING_FN, sbhl_mod_marking_fn( obj ) );
    Functions.funcall( visitor_fn, obj, $kw48$SLOT, $kw42$UNMARKING_FN, sbhl_mod_unmarking_fn( obj ) );
    Functions.funcall( visitor_fn, obj, $kw48$SLOT, $kw43$VAR_BINDINGS, sbhl_mod_var_bindings( obj ) );
    Functions.funcall( visitor_fn, obj, $kw48$SLOT, $kw44$MISC_PROPERTIES, sbhl_mod_misc_properties( obj ) );
    Functions.funcall( visitor_fn, obj, $kw49$END, $sym47$MAKE_SBHL_MODULE, TWELVE_INTEGER );
    return obj;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-module-vars.lisp", position = 1257L)
  public static SubLObject visit_defstruct_object_sbhl_module_method(final SubLObject obj, final SubLObject visitor_fn)
  {
    return visit_defstruct_sbhl_module( obj, visitor_fn );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-module-vars.lisp", position = 2332L)
  public static SubLObject print_sbhl_module(final SubLObject v_object, final SubLObject stream, final SubLObject depth)
  {
    if( NIL != sbhl_module_p( v_object ) )
    {
      PrintLow.format( stream, $str51$__SBHL_MODULE__ );
      print_high.prin1( sbhl_mod_link_pred( v_object ), stream );
      PrintLow.format( stream, $str52$_ );
    }
    else
    {
      compatibility.default_struct_print_function( v_object, stream, depth );
    }
    return v_object;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-module-vars.lisp", position = 2630L)
  public static SubLObject new_sbhl_module(final SubLObject pred)
  {
    assert NIL != forts.fort_p( pred ) : pred;
    final SubLObject module = make_sbhl_module( UNPROVIDED );
    _csetf_sbhl_mod_link_pred( module, pred );
    _csetf_sbhl_mod_misc_properties( module, dictionary.new_dictionary( EQL, ZERO_INTEGER ) );
    return module;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-module-vars.lisp", position = 2871L)
  public static SubLObject set_sbhl_module_property(final SubLObject module, final SubLObject property, final SubLObject value)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != sbhl_paranoia.sbhl_object_type_checking_p() && NIL == sbhl_module_property_p( property ) )
    {
      final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue( thread );
      if( pcase_var.eql( $kw54$ERROR ) )
      {
        sbhl_paranoia.sbhl_error( ONE_INTEGER, $str55$_A_is_not_a__A, property, $sym56$SBHL_MODULE_PROPERTY_P, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      }
      else if( pcase_var.eql( $kw57$CERROR ) )
      {
        sbhl_paranoia.sbhl_cerror( ONE_INTEGER, $str58$continue_anyway, $str55$_A_is_not_a__A, property, $sym56$SBHL_MODULE_PROPERTY_P, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      }
      else if( pcase_var.eql( $kw59$WARN ) )
      {
        Errors.warn( $str55$_A_is_not_a__A, property, $sym56$SBHL_MODULE_PROPERTY_P );
      }
      else
      {
        Errors.warn( $str60$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue( thread ) );
        Errors.cerror( $str58$continue_anyway, $str55$_A_is_not_a__A, property, $sym56$SBHL_MODULE_PROPERTY_P );
      }
    }
    if( NIL != sbhl_paranoia.sbhl_object_type_checking_p() && NIL == sbhl_module_p( module ) )
    {
      final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue( thread );
      if( pcase_var.eql( $kw54$ERROR ) )
      {
        sbhl_paranoia.sbhl_error( ONE_INTEGER, $str55$_A_is_not_a__A, module, $sym1$SBHL_MODULE_P, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      }
      else if( pcase_var.eql( $kw57$CERROR ) )
      {
        sbhl_paranoia.sbhl_cerror( ONE_INTEGER, $str58$continue_anyway, $str55$_A_is_not_a__A, module, $sym1$SBHL_MODULE_P, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      }
      else if( pcase_var.eql( $kw59$WARN ) )
      {
        Errors.warn( $str55$_A_is_not_a__A, module, $sym1$SBHL_MODULE_P );
      }
      else
      {
        Errors.warn( $str60$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue( thread ) );
        Errors.cerror( $str58$continue_anyway, $str55$_A_is_not_a__A, module, $sym1$SBHL_MODULE_P );
      }
    }
    if( property.eql( $kw33$LINK_PRED ) )
    {
      _csetf_sbhl_mod_link_pred( module, value );
    }
    else if( property.eql( $kw34$ACCESSIBLE_LINK_PREDS ) )
    {
      _csetf_sbhl_mod_accessible_link_preds( module, value );
    }
    else if( property.eql( $kw35$GRAPH ) )
    {
      _csetf_sbhl_mod_graph( module, value );
    }
    else if( property.eql( $kw36$LINK_STYLE ) )
    {
      _csetf_sbhl_mod_link_style( module, value );
    }
    else if( property.eql( $kw37$INDEX_ARG ) )
    {
      _csetf_sbhl_mod_index_arg( module, value );
    }
    else if( property.eql( $kw38$MODULE_TYPE ) )
    {
      _csetf_sbhl_mod_module_type( module, value );
    }
    else if( property.eql( $kw39$TYPE_TEST ) )
    {
      _csetf_sbhl_mod_type_test( module, value );
    }
    else if( property.eql( $kw61$PATH_TERMINATING_MARK__FN ) )
    {
      _csetf_sbhl_mod_path_terminating_mark_fn( module, value );
    }
    else if( property.eql( $kw41$MARKING_FN ) )
    {
      _csetf_sbhl_mod_marking_fn( module, value );
    }
    else if( property.eql( $kw42$UNMARKING_FN ) )
    {
      _csetf_sbhl_mod_unmarking_fn( module, value );
    }
    else
    {
      dictionary.dictionary_enter( sbhl_mod_misc_properties( module ), property, value );
    }
    return module;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-module-vars.lisp", position = 3997L)
  public static SubLObject get_sbhl_module_property(final SubLObject module, final SubLObject property)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != sbhl_paranoia.sbhl_object_type_checking_p() && NIL == sbhl_module_p( module ) )
    {
      final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue( thread );
      if( pcase_var.eql( $kw54$ERROR ) )
      {
        sbhl_paranoia.sbhl_error( ONE_INTEGER, $str55$_A_is_not_a__A, module, $sym1$SBHL_MODULE_P, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      }
      else if( pcase_var.eql( $kw57$CERROR ) )
      {
        sbhl_paranoia.sbhl_cerror( ONE_INTEGER, $str58$continue_anyway, $str55$_A_is_not_a__A, module, $sym1$SBHL_MODULE_P, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      }
      else if( pcase_var.eql( $kw59$WARN ) )
      {
        Errors.warn( $str55$_A_is_not_a__A, module, $sym1$SBHL_MODULE_P );
      }
      else
      {
        Errors.warn( $str60$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue( thread ) );
        Errors.cerror( $str58$continue_anyway, $str55$_A_is_not_a__A, module, $sym1$SBHL_MODULE_P );
      }
    }
    if( property.eql( $kw33$LINK_PRED ) )
    {
      return sbhl_mod_link_pred( module );
    }
    if( property.eql( $kw34$ACCESSIBLE_LINK_PREDS ) )
    {
      return sbhl_mod_accessible_link_preds( module );
    }
    if( property.eql( $kw35$GRAPH ) )
    {
      return sbhl_mod_graph( module );
    }
    if( property.eql( $kw36$LINK_STYLE ) )
    {
      return sbhl_mod_link_style( module );
    }
    if( property.eql( $kw37$INDEX_ARG ) )
    {
      return sbhl_mod_index_arg( module );
    }
    if( property.eql( $kw38$MODULE_TYPE ) )
    {
      return sbhl_mod_module_type( module );
    }
    if( property.eql( $kw39$TYPE_TEST ) )
    {
      return sbhl_mod_type_test( module );
    }
    if( property.eql( $kw61$PATH_TERMINATING_MARK__FN ) )
    {
      return sbhl_mod_path_terminating_mark_fn( module );
    }
    if( property.eql( $kw41$MARKING_FN ) )
    {
      return sbhl_mod_marking_fn( module );
    }
    if( property.eql( $kw42$UNMARKING_FN ) )
    {
      return sbhl_mod_unmarking_fn( module );
    }
    return dictionary.dictionary_lookup_without_values( sbhl_mod_misc_properties( module ), property, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-module-vars.lisp", position = 5039L)
  public static SubLObject get_sbhl_module_link_pred(final SubLObject module)
  {
    assert NIL != sbhl_module_p( module ) : module;
    return sbhl_mod_link_pred( module );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-module-vars.lisp", position = 5228L)
  public static SubLObject get_sbhl_module_accessible_link_preds(final SubLObject module)
  {
    assert NIL != sbhl_module_p( module ) : module;
    return sbhl_mod_accessible_link_preds( module );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-module-vars.lisp", position = 5441L)
  public static SubLObject get_sbhl_module_graph(final SubLObject module)
  {
    assert NIL != sbhl_module_p( module ) : module;
    return sbhl_mod_graph( module );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-module-vars.lisp", position = 5622L)
  public static SubLObject get_sbhl_module_link_style(final SubLObject module)
  {
    assert NIL != sbhl_module_p( module ) : module;
    return sbhl_mod_link_style( module );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-module-vars.lisp", position = 5813L)
  public static SubLObject get_sbhl_module_index_arg(final SubLObject module)
  {
    assert NIL != sbhl_module_p( module ) : module;
    return sbhl_mod_index_arg( module );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-module-vars.lisp", position = 6002L)
  public static SubLObject get_sbhl_module_module_type(final SubLObject module)
  {
    assert NIL != sbhl_module_p( module ) : module;
    return sbhl_mod_module_type( module );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-module-vars.lisp", position = 6195L)
  public static SubLObject get_sbhl_module_type_test(final SubLObject module)
  {
    assert NIL != sbhl_module_p( module ) : module;
    return sbhl_mod_type_test( module );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-module-vars.lisp", position = 6384L)
  public static SubLObject get_sbhl_module_path_terminating_mark(final SubLObject module)
  {
    assert NIL != sbhl_module_p( module ) : module;
    return sbhl_mod_path_terminating_mark_fn( module );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-module-vars.lisp", position = 6600L)
  public static SubLObject get_sbhl_module_marking_fn(final SubLObject module)
  {
    assert NIL != sbhl_module_p( module ) : module;
    return sbhl_mod_marking_fn( module );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-module-vars.lisp", position = 6791L)
  public static SubLObject get_sbhl_module_unmarking_fn(final SubLObject module)
  {
    assert NIL != sbhl_module_p( module ) : module;
    return sbhl_mod_unmarking_fn( module );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-module-vars.lisp", position = 7319L)
  public static SubLObject check_sbhl_modules_store_for_legacy_format()
  {
    if( NIL != dictionary.dictionary_p( $sbhl_modules$.getGlobalValue() ) )
    {
      $sbhl_modules$.setGlobalValue( dictionary_utilities.dictionary_to_alist( $sbhl_modules$.getGlobalValue() ) );
      Errors.warn( $str63$____SBHL_module_store_has_been_co );
    }
    else if( NIL == list_utilities.alist_p( $sbhl_modules$.getGlobalValue() ) )
    {
      if( NIL == $sbhl_modules$.getGlobalValue() )
      {
        Errors.warn( $str64$____No_KB_has_been_loaded__SBHL_m );
      }
      else
      {
        Errors.warn( $str65$____Unexpected_SBHL_module_store_, Types.type_of( $sbhl_modules$.getGlobalValue() ) );
      }
    }
    return $kw66$CHECKED;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-module-vars.lisp", position = 7900L)
  public static SubLObject sbhl_module_object_p(final SubLObject v_object)
  {
    return sbhl_module_p( v_object );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-module-vars.lisp", position = 8043L)
  public static SubLObject reset_sbhl_modules()
  {
    $sbhl_modules$.setGlobalValue( NIL );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-module-vars.lisp", position = 8126L)
  public static SubLObject rebuild_sbhl_modules()
  {
    return T;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-module-vars.lisp", position = 8237L)
  public static SubLObject get_sbhl_modules()
  {
    return $sbhl_modules$.getGlobalValue();
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-module-vars.lisp", position = 8418L)
  public static SubLObject add_sbhl_module(final SubLObject predicate, final SubLObject module)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != sbhl_paranoia.sbhl_object_type_checking_p() && NIL == sbhl_predicate_object_p( predicate ) )
    {
      final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue( thread );
      if( pcase_var.eql( $kw54$ERROR ) )
      {
        sbhl_paranoia.sbhl_error( ONE_INTEGER, $str55$_A_is_not_a__A, predicate, $sym67$SBHL_PREDICATE_OBJECT_P, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      }
      else if( pcase_var.eql( $kw57$CERROR ) )
      {
        sbhl_paranoia.sbhl_cerror( ONE_INTEGER, $str58$continue_anyway, $str55$_A_is_not_a__A, predicate, $sym67$SBHL_PREDICATE_OBJECT_P, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      }
      else if( pcase_var.eql( $kw59$WARN ) )
      {
        Errors.warn( $str55$_A_is_not_a__A, predicate, $sym67$SBHL_PREDICATE_OBJECT_P );
      }
      else
      {
        Errors.warn( $str60$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue( thread ) );
        Errors.cerror( $str58$continue_anyway, $str55$_A_is_not_a__A, predicate, $sym67$SBHL_PREDICATE_OBJECT_P );
      }
    }
    if( NIL != sbhl_paranoia.sbhl_object_type_checking_p() && NIL == sbhl_module_object_p( module ) )
    {
      final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue( thread );
      if( pcase_var.eql( $kw54$ERROR ) )
      {
        sbhl_paranoia.sbhl_error( ONE_INTEGER, $str55$_A_is_not_a__A, module, $sym68$SBHL_MODULE_OBJECT_P, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      }
      else if( pcase_var.eql( $kw57$CERROR ) )
      {
        sbhl_paranoia.sbhl_cerror( ONE_INTEGER, $str58$continue_anyway, $str55$_A_is_not_a__A, module, $sym68$SBHL_MODULE_OBJECT_P, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      }
      else if( pcase_var.eql( $kw59$WARN ) )
      {
        Errors.warn( $str55$_A_is_not_a__A, module, $sym68$SBHL_MODULE_OBJECT_P );
      }
      else
      {
        Errors.warn( $str60$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue( thread ) );
        Errors.cerror( $str58$continue_anyway, $str55$_A_is_not_a__A, module, $sym68$SBHL_MODULE_OBJECT_P );
      }
    }
    $sbhl_modules$.setGlobalValue( conses_high.acons( predicate, module, $sbhl_modules$.getGlobalValue() ) );
    sbhl_module_utilities.clear_get_sbhl_predicates();
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-module-vars.lisp", position = 8858L)
  public static SubLObject remove_sbhl_module(final SubLObject predicate)
  {
    $sbhl_modules$.setGlobalValue( list_utilities.alist_delete_without_values( $sbhl_modules$.getGlobalValue(), predicate, UNPROVIDED ) );
    sbhl_module_utilities.clear_get_sbhl_predicates();
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-module-vars.lisp", position = 9108L)
  public static SubLObject do_sbhl_modules(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list69 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject module_var = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list69 );
    module_var = current.first();
    current = current.rest();
    final SubLObject done_var = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list69 );
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      final SubLObject key = $sym70$KEY;
      return ConsesLow.listS( $sym71$DO_ALIST, ConsesLow.list( key, module_var, $list72, $kw73$DONE, done_var ), ConsesLow.list( $sym74$IGNORE, key ), ConsesLow.append( body, NIL ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list69 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-module-vars.lisp", position = 9365L)
  public static SubLObject get_sbhl_predicates_int()
  {
    return list_utilities.alist_keys( get_sbhl_modules() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-module-vars.lisp", position = 9520L)
  public static SubLObject get_sbhl_module_list()
  {
    return list_utilities.alist_values( get_sbhl_modules() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-module-vars.lisp", position = 9679L)
  public static SubLObject sbhl_predicate_object_p(final SubLObject v_object)
  {
    return forts.fort_p( v_object );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-module-vars.lisp", position = 10004L)
  public static SubLObject sbhl_simple_reflexive_module_type_p(final SubLObject module_type)
  {
    return Equality.eq( module_type, $kw76$SIMPLE_REFLEXIVE );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-module-vars.lisp", position = 10210L)
  public static SubLObject sbhl_simple_non_reflexive_module_type_p(final SubLObject module_type)
  {
    return Equality.eq( module_type, $kw77$SIMPLE_NON_REFLEXIVE );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-module-vars.lisp", position = 10426L)
  public static SubLObject sbhl_transfers_through_module_type_p(final SubLObject module_type)
  {
    return Equality.eq( module_type, $kw78$TRANSFERS_THROUGH );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-module-vars.lisp", position = 10636L)
  public static SubLObject sbhl_disjoins_module_type_p(final SubLObject module_type)
  {
    return Equality.eq( module_type, $kw79$DISJOINS );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-module-vars.lisp", position = 10817L)
  public static SubLObject sbhl_time_module_type_p(final SubLObject module_type)
  {
    return Equality.eq( module_type, $kw80$TIME );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-module-vars.lisp", position = 10986L)
  public static SubLObject sbhl_transitive_module_type_p(final SubLObject module_type)
  {
    return makeBoolean( module_type == $kw76$SIMPLE_REFLEXIVE || module_type == $kw77$SIMPLE_NON_REFLEXIVE || module_type == $kw80$TIME );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-module-vars.lisp", position = 11269L)
  public static SubLObject sbhl_module_type_p(final SubLObject module_type)
  {
    return subl_promotions.memberP( module_type, $sbhl_module_types$.getGlobalValue(), Symbols.symbol_function( EQ ), UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-module-vars.lisp", position = 11460L)
  public static SubLObject do_sbhl_simple_modules(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list69 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject module_var = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list69 );
    module_var = current.first();
    current = current.rest();
    final SubLObject done_var = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list69 );
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      final SubLObject module = $sym81$MODULE;
      return ConsesLow.list( $sym82$DO_SBHL_MODULES, ConsesLow.list( module, done_var ), ConsesLow.list( $sym83$PWHEN, ConsesLow.list( $sym84$SBHL_SIMPLE_MODULE_P, module ), ConsesLow.listS( $sym85$CLET, ConsesLow.list(
          ConsesLow.list( module_var, ConsesLow.list( $sym86$GET_SBHL_LINK_PRED, module ) ) ), ConsesLow.append( body, NIL ) ) ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list69 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-module-vars.lisp", position = 11791L)
  public static SubLObject do_sbhl_time_modules(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list69 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject module_var = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list69 );
    module_var = current.first();
    current = current.rest();
    final SubLObject done_var = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list69 );
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      final SubLObject module = $sym87$MODULE;
      return ConsesLow.list( $sym82$DO_SBHL_MODULES, ConsesLow.list( module, done_var ), ConsesLow.list( $sym83$PWHEN, ConsesLow.list( $sym88$SBHL_TIME_MODULE_P, module ), ConsesLow.listS( $sym85$CLET, ConsesLow.list(
          ConsesLow.list( module_var, module ) ), ConsesLow.append( body, NIL ) ) ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list69 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-module-vars.lisp", position = 12107L)
  public static SubLObject do_sbhl_time_predicates(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list89 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject pred_var = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list89 );
    pred_var = current.first();
    current = current.rest();
    final SubLObject done_var = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list89 );
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      final SubLObject module = $sym90$MODULE;
      return ConsesLow.list( $sym82$DO_SBHL_MODULES, ConsesLow.list( module, done_var ), ConsesLow.list( $sym83$PWHEN, ConsesLow.list( $sym88$SBHL_TIME_MODULE_P, module ), ConsesLow.listS( $sym85$CLET, ConsesLow.list(
          ConsesLow.list( pred_var, ConsesLow.list( $sym86$GET_SBHL_LINK_PRED, module ) ) ), ConsesLow.append( body, NIL ) ) ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list89 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-module-vars.lisp", position = 12812L)
  public static SubLObject init_sbhl_module_properties(final SubLObject property_list)
  {
    SubLObject cdolist_list_var = property_list;
    SubLObject property_test_pair = NIL;
    property_test_pair = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject property = property_test_pair.first();
      final SubLObject test_fn = conses_high.second( property_test_pair );
      dictionary.dictionary_enter( $sbhl_module_properties$.getGlobalValue(), property, test_fn );
      cdolist_list_var = cdolist_list_var.rest();
      property_test_pair = cdolist_list_var.first();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-module-vars.lisp", position = 15997L)
  public static SubLObject get_sbhl_module_properties()
  {
    return $sbhl_module_properties$.getGlobalValue();
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-module-vars.lisp", position = 16139L)
  public static SubLObject add_sbhl_module_property(final SubLObject property, final SubLObject test)
  {
    dictionary.dictionary_enter( $sbhl_module_properties$.getGlobalValue(), property, test );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-module-vars.lisp", position = 16360L)
  public static SubLObject sbhl_module_property_p(final SubLObject property)
  {
    return dictionary.dictionary_lookup_without_values( $sbhl_module_properties$.getGlobalValue(), property, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-module-vars.lisp", position = 16570L)
  public static SubLObject do_sbhl_module_properties(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list116 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject property_var = NIL;
    SubLObject test_var = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list116 );
    property_var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list116 );
    test_var = current.first();
    current = current.rest();
    final SubLObject done_var = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list116 );
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      return ConsesLow.listS( $sym117$DO_DICTIONARY, ConsesLow.list( property_var, test_var, $list118, done_var ), ConsesLow.append( body, NIL ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list116 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-module-vars.lisp", position = 17094L)
  public static SubLObject get_sbhl_module_required_properties()
  {
    return $sbhl_module_required_properties$.getGlobalValue();
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-module-vars.lisp", position = 17262L)
  public static SubLObject sbhl_module_required_property_p(final SubLObject property)
  {
    return subl_promotions.memberP( property, $sbhl_module_required_properties$.getGlobalValue(), Symbols.symbol_function( EQL ), UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-module-vars.lisp", position = 17480L)
  public static SubLObject do_sbhl_module_required_properties(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list120 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject property_var = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list120 );
    property_var = current.first();
    current = current.rest();
    final SubLObject done_var = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list120 );
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      return ConsesLow.listS( $sym121$SMART_CSOME, ConsesLow.list( property_var, $list122, done_var ), ConsesLow.append( body, NIL ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list120 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-module-vars.lisp", position = 17955L)
  public static SubLObject get_sbhl_module(SubLObject predicate)
  {
    if( predicate == UNPROVIDED )
    {
      predicate = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == predicate )
    {
      return $sbhl_module$.getDynamicValue( thread );
    }
    if( NIL != sbhl_module_p( $sbhl_module$.getDynamicValue( thread ) ) && predicate.eql( sbhl_module_utilities.get_sbhl_link_pred( $sbhl_module$.getDynamicValue( thread ) ) ) )
    {
      return $sbhl_module$.getDynamicValue( thread );
    }
    final SubLObject module = list_utilities.alist_lookup_without_values( get_sbhl_modules(), predicate, UNPROVIDED, UNPROVIDED );
    if( NIL == module )
    {
      return sbhl_paranoia.sbhl_warn( ZERO_INTEGER, $str123$_A_is_not_a_valid_sbhl_predicate_, predicate, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    }
    return module;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-module-vars.lisp", position = 18797L)
  public static SubLObject with_sbhl_module(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject module = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list124 );
    module = current.first();
    final SubLObject body;
    current = ( body = current.rest() );
    return ConsesLow.listS( $sym85$CLET, ConsesLow.list( ConsesLow.list( $sym125$_SBHL_MODULE_, module ) ), ConsesLow.append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-module-vars.lisp", position = 18962L)
  public static SubLObject possibly_with_sbhl_module(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject module = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list124 );
    module = current.first();
    final SubLObject body;
    current = ( body = current.rest() );
    return ConsesLow.listS( $sym85$CLET, ConsesLow.list( ConsesLow.list( $sym125$_SBHL_MODULE_, ConsesLow.listS( $sym126$FIF, module, module, $list127 ) ) ), ConsesLow.append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-module-vars.lisp", position = 19619L)
  public static SubLObject fort_denotes_sbhl_directed_graph_p(final SubLObject fort)
  {
    if( fort.eql( $fort_denoting_sbhl_directed_graph$.getGlobalValue() ) )
    {
      return T;
    }
    if( fort.eql( $fort_denoting_sbhl_undirected_graph$.getGlobalValue() ) )
    {
      return NIL;
    }
    if( NIL != sbhl_paranoia.sbhl_error( ONE_INTEGER, $str130$Term___a__is_not_used_to_specify_, fort, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) )
    {
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-module-vars.lisp", position = 20004L)
  public static SubLObject sbhl_link_style_specifier_p(final SubLObject fort)
  {
    return makeBoolean( fort.eql( $fort_denoting_sbhl_directed_graph$.getGlobalValue() ) || fort.eql( $fort_denoting_sbhl_undirected_graph$.getGlobalValue() ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-module-vars.lisp", position = 20563L)
  public static SubLObject clean_sbhl_modules()
  {
    SubLObject cdolist_list_var = get_sbhl_modules();
    SubLObject cons = NIL;
    cons = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject current;
      final SubLObject datum = current = cons;
      SubLObject key = NIL;
      SubLObject module = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list131 );
      key = current.first();
      current = ( module = current.rest() );
      final SubLObject predicate = sbhl_module_utilities.get_sbhl_link_pred( module );
      if( NIL == forts.valid_fortP( predicate ) )
      {
        remove_sbhl_module( module );
      }
      cdolist_list_var = cdolist_list_var.rest();
      cons = cdolist_list_var.first();
    }
    dumper.recompute_missing_sbhl_graphs();
    optimize_sbhl_modules();
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-module-vars.lisp", position = 20946L)
  public static SubLObject optimize_sbhl_modules()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject _prev_bind_0 = $sbhl_module_link_pred_preference_order$.currentBinding( thread );
    try
    {
      $sbhl_module_link_pred_preference_order$.bind( sbhl_module_link_pred_preference_order(), thread );
      list_utilities.alist_optimize( get_sbhl_modules(), Symbols.symbol_function( $sym132$SBHL_MODULES_LINK_PRED__ ) );
    }
    finally
    {
      $sbhl_module_link_pred_preference_order$.rebind( _prev_bind_0, thread );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-module-vars.lisp", position = 21204L)
  public static SubLObject sbhl_modules_link_pred_L(final SubLObject pred1, final SubLObject pred2)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return list_utilities.position_L( pred1, pred2, $sbhl_module_link_pred_preference_order$.getDynamicValue( thread ), Symbols.symbol_function( EQL ), UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-module-vars.lisp", position = 21349L)
  public static SubLObject sbhl_module_link_pred_preference_order()
  {
    SubLObject tuples = NIL;
    SubLObject cdolist_list_var = get_sbhl_modules();
    SubLObject cons = NIL;
    cons = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject current;
      final SubLObject datum = current = cons;
      SubLObject key = NIL;
      SubLObject module = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list131 );
      key = current.first();
      current = ( module = current.rest() );
      final SubLObject link_pred = sbhl_module_utilities.get_sbhl_link_pred( module );
      final SubLObject v_graph = sbhl_module_utilities.get_sbhl_graph( module );
      final SubLObject graph_size = Hashtables.hash_table_size( v_graph );
      tuples = ConsesLow.cons( ConsesLow.list( link_pred, graph_size ), tuples );
      cdolist_list_var = cdolist_list_var.rest();
      cons = cdolist_list_var.first();
    }
    tuples = Sort.stable_sort( tuples, Symbols.symbol_function( $sym133$_ ), Symbols.symbol_function( $sym134$SECOND ) );
    SubLObject link_preds = list_utilities.nmapcar( Symbols.symbol_function( $sym135$FIRST ), tuples );
    link_preds = ConsesLow.cons( $const136$genls, Sequences.delete( $const136$genls, link_preds, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) );
    return link_preds;
  }

  public static SubLObject declare_sbhl_module_vars_file()
  {
    SubLFiles.declareFunction( me, "sbhl_module_print_function_trampoline", "SBHL-MODULE-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false );
    SubLFiles.declareFunction( me, "sbhl_module_p", "SBHL-MODULE-P", 1, 0, false );
    new $sbhl_module_p$UnaryFunction();
    SubLFiles.declareFunction( me, "sbhl_mod_link_pred", "SBHL-MOD-LINK-PRED", 1, 0, false );
    SubLFiles.declareFunction( me, "sbhl_mod_accessible_link_preds", "SBHL-MOD-ACCESSIBLE-LINK-PREDS", 1, 0, false );
    SubLFiles.declareFunction( me, "sbhl_mod_graph", "SBHL-MOD-GRAPH", 1, 0, false );
    SubLFiles.declareFunction( me, "sbhl_mod_link_style", "SBHL-MOD-LINK-STYLE", 1, 0, false );
    SubLFiles.declareFunction( me, "sbhl_mod_index_arg", "SBHL-MOD-INDEX-ARG", 1, 0, false );
    SubLFiles.declareFunction( me, "sbhl_mod_module_type", "SBHL-MOD-MODULE-TYPE", 1, 0, false );
    SubLFiles.declareFunction( me, "sbhl_mod_type_test", "SBHL-MOD-TYPE-TEST", 1, 0, false );
    SubLFiles.declareFunction( me, "sbhl_mod_path_terminating_mark_fn", "SBHL-MOD-PATH-TERMINATING-MARK-FN", 1, 0, false );
    SubLFiles.declareFunction( me, "sbhl_mod_marking_fn", "SBHL-MOD-MARKING-FN", 1, 0, false );
    SubLFiles.declareFunction( me, "sbhl_mod_unmarking_fn", "SBHL-MOD-UNMARKING-FN", 1, 0, false );
    SubLFiles.declareFunction( me, "sbhl_mod_var_bindings", "SBHL-MOD-VAR-BINDINGS", 1, 0, false );
    SubLFiles.declareFunction( me, "sbhl_mod_misc_properties", "SBHL-MOD-MISC-PROPERTIES", 1, 0, false );
    SubLFiles.declareFunction( me, "_csetf_sbhl_mod_link_pred", "_CSETF-SBHL-MOD-LINK-PRED", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_sbhl_mod_accessible_link_preds", "_CSETF-SBHL-MOD-ACCESSIBLE-LINK-PREDS", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_sbhl_mod_graph", "_CSETF-SBHL-MOD-GRAPH", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_sbhl_mod_link_style", "_CSETF-SBHL-MOD-LINK-STYLE", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_sbhl_mod_index_arg", "_CSETF-SBHL-MOD-INDEX-ARG", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_sbhl_mod_module_type", "_CSETF-SBHL-MOD-MODULE-TYPE", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_sbhl_mod_type_test", "_CSETF-SBHL-MOD-TYPE-TEST", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_sbhl_mod_path_terminating_mark_fn", "_CSETF-SBHL-MOD-PATH-TERMINATING-MARK-FN", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_sbhl_mod_marking_fn", "_CSETF-SBHL-MOD-MARKING-FN", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_sbhl_mod_unmarking_fn", "_CSETF-SBHL-MOD-UNMARKING-FN", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_sbhl_mod_var_bindings", "_CSETF-SBHL-MOD-VAR-BINDINGS", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_sbhl_mod_misc_properties", "_CSETF-SBHL-MOD-MISC-PROPERTIES", 2, 0, false );
    SubLFiles.declareFunction( me, "make_sbhl_module", "MAKE-SBHL-MODULE", 0, 1, false );
    SubLFiles.declareFunction( me, "visit_defstruct_sbhl_module", "VISIT-DEFSTRUCT-SBHL-MODULE", 2, 0, false );
    SubLFiles.declareFunction( me, "visit_defstruct_object_sbhl_module_method", "VISIT-DEFSTRUCT-OBJECT-SBHL-MODULE-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "print_sbhl_module", "PRINT-SBHL-MODULE", 3, 0, false );
    SubLFiles.declareFunction( me, "new_sbhl_module", "NEW-SBHL-MODULE", 1, 0, false );
    SubLFiles.declareFunction( me, "set_sbhl_module_property", "SET-SBHL-MODULE-PROPERTY", 3, 0, false );
    SubLFiles.declareFunction( me, "get_sbhl_module_property", "GET-SBHL-MODULE-PROPERTY", 2, 0, false );
    SubLFiles.declareFunction( me, "get_sbhl_module_link_pred", "GET-SBHL-MODULE-LINK-PRED", 1, 0, false );
    SubLFiles.declareFunction( me, "get_sbhl_module_accessible_link_preds", "GET-SBHL-MODULE-ACCESSIBLE-LINK-PREDS", 1, 0, false );
    SubLFiles.declareFunction( me, "get_sbhl_module_graph", "GET-SBHL-MODULE-GRAPH", 1, 0, false );
    SubLFiles.declareFunction( me, "get_sbhl_module_link_style", "GET-SBHL-MODULE-LINK-STYLE", 1, 0, false );
    SubLFiles.declareFunction( me, "get_sbhl_module_index_arg", "GET-SBHL-MODULE-INDEX-ARG", 1, 0, false );
    SubLFiles.declareFunction( me, "get_sbhl_module_module_type", "GET-SBHL-MODULE-MODULE-TYPE", 1, 0, false );
    SubLFiles.declareFunction( me, "get_sbhl_module_type_test", "GET-SBHL-MODULE-TYPE-TEST", 1, 0, false );
    SubLFiles.declareFunction( me, "get_sbhl_module_path_terminating_mark", "GET-SBHL-MODULE-PATH-TERMINATING-MARK", 1, 0, false );
    SubLFiles.declareFunction( me, "get_sbhl_module_marking_fn", "GET-SBHL-MODULE-MARKING-FN", 1, 0, false );
    SubLFiles.declareFunction( me, "get_sbhl_module_unmarking_fn", "GET-SBHL-MODULE-UNMARKING-FN", 1, 0, false );
    SubLFiles.declareFunction( me, "check_sbhl_modules_store_for_legacy_format", "CHECK-SBHL-MODULES-STORE-FOR-LEGACY-FORMAT", 0, 0, false );
    SubLFiles.declareFunction( me, "sbhl_module_object_p", "SBHL-MODULE-OBJECT-P", 1, 0, false );
    SubLFiles.declareFunction( me, "reset_sbhl_modules", "RESET-SBHL-MODULES", 0, 0, false );
    SubLFiles.declareFunction( me, "rebuild_sbhl_modules", "REBUILD-SBHL-MODULES", 0, 0, false );
    SubLFiles.declareFunction( me, "get_sbhl_modules", "GET-SBHL-MODULES", 0, 0, false );
    SubLFiles.declareFunction( me, "add_sbhl_module", "ADD-SBHL-MODULE", 2, 0, false );
    SubLFiles.declareFunction( me, "remove_sbhl_module", "REMOVE-SBHL-MODULE", 1, 0, false );
    SubLFiles.declareMacro( me, "do_sbhl_modules", "DO-SBHL-MODULES" );
    SubLFiles.declareFunction( me, "get_sbhl_predicates_int", "GET-SBHL-PREDICATES-INT", 0, 0, false );
    SubLFiles.declareFunction( me, "get_sbhl_module_list", "GET-SBHL-MODULE-LIST", 0, 0, false );
    SubLFiles.declareFunction( me, "sbhl_predicate_object_p", "SBHL-PREDICATE-OBJECT-P", 1, 0, false );
    SubLFiles.declareFunction( me, "sbhl_simple_reflexive_module_type_p", "SBHL-SIMPLE-REFLEXIVE-MODULE-TYPE-P", 1, 0, false );
    SubLFiles.declareFunction( me, "sbhl_simple_non_reflexive_module_type_p", "SBHL-SIMPLE-NON-REFLEXIVE-MODULE-TYPE-P", 1, 0, false );
    SubLFiles.declareFunction( me, "sbhl_transfers_through_module_type_p", "SBHL-TRANSFERS-THROUGH-MODULE-TYPE-P", 1, 0, false );
    SubLFiles.declareFunction( me, "sbhl_disjoins_module_type_p", "SBHL-DISJOINS-MODULE-TYPE-P", 1, 0, false );
    SubLFiles.declareFunction( me, "sbhl_time_module_type_p", "SBHL-TIME-MODULE-TYPE-P", 1, 0, false );
    SubLFiles.declareFunction( me, "sbhl_transitive_module_type_p", "SBHL-TRANSITIVE-MODULE-TYPE-P", 1, 0, false );
    SubLFiles.declareFunction( me, "sbhl_module_type_p", "SBHL-MODULE-TYPE-P", 1, 0, false );
    SubLFiles.declareMacro( me, "do_sbhl_simple_modules", "DO-SBHL-SIMPLE-MODULES" );
    SubLFiles.declareMacro( me, "do_sbhl_time_modules", "DO-SBHL-TIME-MODULES" );
    SubLFiles.declareMacro( me, "do_sbhl_time_predicates", "DO-SBHL-TIME-PREDICATES" );
    SubLFiles.declareFunction( me, "init_sbhl_module_properties", "INIT-SBHL-MODULE-PROPERTIES", 1, 0, false );
    SubLFiles.declareFunction( me, "get_sbhl_module_properties", "GET-SBHL-MODULE-PROPERTIES", 0, 0, false );
    SubLFiles.declareFunction( me, "add_sbhl_module_property", "ADD-SBHL-MODULE-PROPERTY", 2, 0, false );
    SubLFiles.declareFunction( me, "sbhl_module_property_p", "SBHL-MODULE-PROPERTY-P", 1, 0, false );
    SubLFiles.declareMacro( me, "do_sbhl_module_properties", "DO-SBHL-MODULE-PROPERTIES" );
    SubLFiles.declareFunction( me, "get_sbhl_module_required_properties", "GET-SBHL-MODULE-REQUIRED-PROPERTIES", 0, 0, false );
    SubLFiles.declareFunction( me, "sbhl_module_required_property_p", "SBHL-MODULE-REQUIRED-PROPERTY-P", 1, 0, false );
    SubLFiles.declareMacro( me, "do_sbhl_module_required_properties", "DO-SBHL-MODULE-REQUIRED-PROPERTIES" );
    SubLFiles.declareFunction( me, "get_sbhl_module", "GET-SBHL-MODULE", 0, 1, false );
    new $get_sbhl_module$ZeroArityFunction();
    new $get_sbhl_module$UnaryFunction();
    SubLFiles.declareMacro( me, "with_sbhl_module", "WITH-SBHL-MODULE" );
    SubLFiles.declareMacro( me, "possibly_with_sbhl_module", "POSSIBLY-WITH-SBHL-MODULE" );
    SubLFiles.declareFunction( me, "fort_denotes_sbhl_directed_graph_p", "FORT-DENOTES-SBHL-DIRECTED-GRAPH-P", 1, 0, false );
    SubLFiles.declareFunction( me, "sbhl_link_style_specifier_p", "SBHL-LINK-STYLE-SPECIFIER-P", 1, 0, false );
    SubLFiles.declareFunction( me, "clean_sbhl_modules", "CLEAN-SBHL-MODULES", 0, 0, false );
    SubLFiles.declareFunction( me, "optimize_sbhl_modules", "OPTIMIZE-SBHL-MODULES", 0, 0, false );
    SubLFiles.declareFunction( me, "sbhl_modules_link_pred_L", "SBHL-MODULES-LINK-PRED-<", 2, 0, false );
    SubLFiles.declareFunction( me, "sbhl_module_link_pred_preference_order", "SBHL-MODULE-LINK-PRED-PREFERENCE-ORDER", 0, 0, false );
    return NIL;
  }

  public static SubLObject init_sbhl_module_vars_file()
  {
    $dtp_sbhl_module$ = SubLFiles.defconstant( "*DTP-SBHL-MODULE*", $sym0$SBHL_MODULE );
    $sbhl_module_key_test$ = SubLFiles.deflexical( "*SBHL-MODULE-KEY-TEST*", Symbols.symbol_function( EQL ) );
    $sbhl_modules$ = SubLFiles.deflexical( "*SBHL-MODULES*", ( maybeDefault( $sym62$_SBHL_MODULES_, $sbhl_modules$, NIL ) ) );
    $sbhl_module_types$ = SubLFiles.deflexical( "*SBHL-MODULE-TYPES*", $list75 );
    $sbhl_module_properties$ = SubLFiles.deflexical( "*SBHL-MODULE-PROPERTIES*", maybeDefault( $sym91$_SBHL_MODULE_PROPERTIES_, $sbhl_module_properties$, () -> ( dictionary.new_dictionary( Symbols.symbol_function( EQ ),
        UNPROVIDED ) ) ) );
    $sbhl_module_required_properties$ = SubLFiles.deflexical( "*SBHL-MODULE-REQUIRED-PROPERTIES*", $list119 );
    $sbhl_module$ = SubLFiles.defparameter( "*SBHL-MODULE*", NIL );
    $sbhl_module_vars$ = SubLFiles.defvar( "*SBHL-MODULE-VARS*", NIL );
    $fort_denoting_sbhl_directed_graph$ = SubLFiles.deflexical( "*FORT-DENOTING-SBHL-DIRECTED-GRAPH*", $const128$DirectedMultigraph );
    $fort_denoting_sbhl_undirected_graph$ = SubLFiles.deflexical( "*FORT-DENOTING-SBHL-UNDIRECTED-GRAPH*", $const129$Multigraph );
    $assume_sbhl_extensions_nonempty$ = SubLFiles.defparameter( "*ASSUME-SBHL-EXTENSIONS-NONEMPTY*", T );
    $sbhl_module_link_pred_preference_order$ = SubLFiles.defparameter( "*SBHL-MODULE-LINK-PRED-PREFERENCE-ORDER*", NIL );
    return NIL;
  }

  public static SubLObject setup_sbhl_module_vars_file()
  {
    Structures.register_method( print_high.$print_object_method_table$.getGlobalValue(), $dtp_sbhl_module$.getGlobalValue(), Symbols.symbol_function( $sym7$SBHL_MODULE_PRINT_FUNCTION_TRAMPOLINE ) );
    SubLSpecialOperatorDeclarations.proclaim( $list8 );
    Structures.def_csetf( $sym9$SBHL_MOD_LINK_PRED, $sym10$_CSETF_SBHL_MOD_LINK_PRED );
    Structures.def_csetf( $sym11$SBHL_MOD_ACCESSIBLE_LINK_PREDS, $sym12$_CSETF_SBHL_MOD_ACCESSIBLE_LINK_PREDS );
    Structures.def_csetf( $sym13$SBHL_MOD_GRAPH, $sym14$_CSETF_SBHL_MOD_GRAPH );
    Structures.def_csetf( $sym15$SBHL_MOD_LINK_STYLE, $sym16$_CSETF_SBHL_MOD_LINK_STYLE );
    Structures.def_csetf( $sym17$SBHL_MOD_INDEX_ARG, $sym18$_CSETF_SBHL_MOD_INDEX_ARG );
    Structures.def_csetf( $sym19$SBHL_MOD_MODULE_TYPE, $sym20$_CSETF_SBHL_MOD_MODULE_TYPE );
    Structures.def_csetf( $sym21$SBHL_MOD_TYPE_TEST, $sym22$_CSETF_SBHL_MOD_TYPE_TEST );
    Structures.def_csetf( $sym23$SBHL_MOD_PATH_TERMINATING_MARK_FN, $sym24$_CSETF_SBHL_MOD_PATH_TERMINATING_MARK_FN );
    Structures.def_csetf( $sym25$SBHL_MOD_MARKING_FN, $sym26$_CSETF_SBHL_MOD_MARKING_FN );
    Structures.def_csetf( $sym27$SBHL_MOD_UNMARKING_FN, $sym28$_CSETF_SBHL_MOD_UNMARKING_FN );
    Structures.def_csetf( $sym29$SBHL_MOD_VAR_BINDINGS, $sym30$_CSETF_SBHL_MOD_VAR_BINDINGS );
    Structures.def_csetf( $sym31$SBHL_MOD_MISC_PROPERTIES, $sym32$_CSETF_SBHL_MOD_MISC_PROPERTIES );
    Equality.identity( $sym0$SBHL_MODULE );
    Structures.register_method( visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_sbhl_module$.getGlobalValue(), Symbols.symbol_function( $sym50$VISIT_DEFSTRUCT_OBJECT_SBHL_MODULE_METHOD ) );
    subl_macro_promotions.declare_defglobal( $sym62$_SBHL_MODULES_ );
    subl_macro_promotions.declare_defglobal( $sym91$_SBHL_MODULE_PROPERTIES_ );
    init_sbhl_module_properties( ConsesLow.list( new SubLObject[] { ConsesLow.list( $kw33$LINK_PRED, $sym67$SBHL_PREDICATE_OBJECT_P ), ConsesLow.list( $kw36$LINK_STYLE, $sym92$SBHL_LINK_STYLE_SPECIFIER_P ), ConsesLow
        .list( $kw93$NAUT_FORWARD_TRUE_GENERATORS, $sym94$FUNCTION_SYMBOL_LIST_P ), ConsesLow.list( $kw38$MODULE_TYPE, $sym95$SBHL_MODULE_TYPE_P ), ConsesLow.list( $kw39$TYPE_TEST, $sym96$FUNCTION_SYMBOL_P ), ConsesLow
            .list( $kw97$MODULE_INVERTS_ARGUMENTS, $sym98$SBHL_MODULE_OR_PREDICATE_P ), ConsesLow.list( $kw99$INVERTS_ARGUMENTS_OF_MODULE, $sym98$SBHL_MODULE_OR_PREDICATE_P ), ConsesLow.list( $kw100$DISJOINS_MODULE,
                $sym98$SBHL_MODULE_OR_PREDICATE_P ), ConsesLow.list( $kw61$PATH_TERMINATING_MARK__FN, $sym96$FUNCTION_SYMBOL_P ), ConsesLow.list( $kw41$MARKING_FN, $sym96$FUNCTION_SYMBOL_P ), ConsesLow.list(
                    $kw42$UNMARKING_FN, $sym96$FUNCTION_SYMBOL_P ), ConsesLow.list( $kw101$MARKING_INCREMENT, $sym102$INTEGERP ), ConsesLow.list( $kw34$ACCESSIBLE_LINK_PREDS, $sym103$LISTP ), ConsesLow.list(
                        $kw104$TRANSFERS_THROUGH_MODULE, $sym98$SBHL_MODULE_OR_PREDICATE_P ), ConsesLow.list( $kw105$TRANSFERS_VIA_ARG, $sym102$INTEGERP ), ConsesLow.list( $kw106$ADD_NODE_TO_RESULT_TEST,
                            $sym96$FUNCTION_SYMBOL_P ), ConsesLow.list( $kw107$ADD_UNMARKED_NODE_TO_RESULT_TEST, $sym96$FUNCTION_SYMBOL_P ), ConsesLow.list( $kw108$PREDICATE_SEARCH_P, $sym109$BOOLEANP ), ConsesLow.list(
                                $kw110$MODULE_TAG, $sym111$KEYWORDP ), ConsesLow.list( $kw37$INDEX_ARG, $sym102$INTEGERP ), ConsesLow.list( $kw112$ROOT, $sym113$SBHL_NODE_OBJECT_P ), ConsesLow.list( $kw35$GRAPH,
                                    $sym114$HASH_TABLE_P ), ConsesLow.list( $kw115$SBHL_MARKING_PARAMETERS, $sym103$LISTP )
    } ) );
    utilities_macros.note_funcall_helper_function( $sym132$SBHL_MODULES_LINK_PRED__ );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_sbhl_module_vars_file();
  }

  @Override
  public void initializeVariables()
  {
    init_sbhl_module_vars_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_sbhl_module_vars_file();
  }
  static
  {
    me = new sbhl_module_vars();
    $dtp_sbhl_module$ = null;
    $sbhl_module_key_test$ = null;
    $sbhl_modules$ = null;
    $sbhl_module_types$ = null;
    $sbhl_module_properties$ = null;
    $sbhl_module_required_properties$ = null;
    $sbhl_module$ = null;
    $sbhl_module_vars$ = null;
    $fort_denoting_sbhl_directed_graph$ = null;
    $fort_denoting_sbhl_undirected_graph$ = null;
    $assume_sbhl_extensions_nonempty$ = null;
    $sbhl_module_link_pred_preference_order$ = null;
    $sym0$SBHL_MODULE = makeSymbol( "SBHL-MODULE" );
    $sym1$SBHL_MODULE_P = makeSymbol( "SBHL-MODULE-P" );
    $list2 = ConsesLow.list( new SubLObject[] { makeSymbol( "LINK-PRED" ), makeSymbol( "ACCESSIBLE-LINK-PREDS" ), makeSymbol( "GRAPH" ), makeSymbol( "LINK-STYLE" ), makeSymbol( "INDEX-ARG" ), makeSymbol( "MODULE-TYPE" ),
      makeSymbol( "TYPE-TEST" ), makeSymbol( "PATH-TERMINATING-MARK-FN" ), makeSymbol( "MARKING-FN" ), makeSymbol( "UNMARKING-FN" ), makeSymbol( "VAR-BINDINGS" ), makeSymbol( "MISC-PROPERTIES" )
    } );
    $list3 = ConsesLow.list( new SubLObject[] { makeKeyword( "LINK-PRED" ), makeKeyword( "ACCESSIBLE-LINK-PREDS" ), makeKeyword( "GRAPH" ), makeKeyword( "LINK-STYLE" ), makeKeyword( "INDEX-ARG" ), makeKeyword(
        "MODULE-TYPE" ), makeKeyword( "TYPE-TEST" ), makeKeyword( "PATH-TERMINATING-MARK-FN" ), makeKeyword( "MARKING-FN" ), makeKeyword( "UNMARKING-FN" ), makeKeyword( "VAR-BINDINGS" ), makeKeyword( "MISC-PROPERTIES" )
    } );
    $list4 = ConsesLow.list( new SubLObject[] { makeSymbol( "SBHL-MOD-LINK-PRED" ), makeSymbol( "SBHL-MOD-ACCESSIBLE-LINK-PREDS" ), makeSymbol( "SBHL-MOD-GRAPH" ), makeSymbol( "SBHL-MOD-LINK-STYLE" ), makeSymbol(
        "SBHL-MOD-INDEX-ARG" ), makeSymbol( "SBHL-MOD-MODULE-TYPE" ), makeSymbol( "SBHL-MOD-TYPE-TEST" ), makeSymbol( "SBHL-MOD-PATH-TERMINATING-MARK-FN" ), makeSymbol( "SBHL-MOD-MARKING-FN" ), makeSymbol(
            "SBHL-MOD-UNMARKING-FN" ), makeSymbol( "SBHL-MOD-VAR-BINDINGS" ), makeSymbol( "SBHL-MOD-MISC-PROPERTIES" )
    } );
    $list5 = ConsesLow.list( new SubLObject[] { makeSymbol( "_CSETF-SBHL-MOD-LINK-PRED" ), makeSymbol( "_CSETF-SBHL-MOD-ACCESSIBLE-LINK-PREDS" ), makeSymbol( "_CSETF-SBHL-MOD-GRAPH" ), makeSymbol(
        "_CSETF-SBHL-MOD-LINK-STYLE" ), makeSymbol( "_CSETF-SBHL-MOD-INDEX-ARG" ), makeSymbol( "_CSETF-SBHL-MOD-MODULE-TYPE" ), makeSymbol( "_CSETF-SBHL-MOD-TYPE-TEST" ), makeSymbol(
            "_CSETF-SBHL-MOD-PATH-TERMINATING-MARK-FN" ), makeSymbol( "_CSETF-SBHL-MOD-MARKING-FN" ), makeSymbol( "_CSETF-SBHL-MOD-UNMARKING-FN" ), makeSymbol( "_CSETF-SBHL-MOD-VAR-BINDINGS" ), makeSymbol(
                "_CSETF-SBHL-MOD-MISC-PROPERTIES" )
    } );
    $sym6$PRINT_SBHL_MODULE = makeSymbol( "PRINT-SBHL-MODULE" );
    $sym7$SBHL_MODULE_PRINT_FUNCTION_TRAMPOLINE = makeSymbol( "SBHL-MODULE-PRINT-FUNCTION-TRAMPOLINE" );
    $list8 = ConsesLow.list( makeSymbol( "OPTIMIZE-FUNCALL" ), makeSymbol( "SBHL-MODULE-P" ) );
    $sym9$SBHL_MOD_LINK_PRED = makeSymbol( "SBHL-MOD-LINK-PRED" );
    $sym10$_CSETF_SBHL_MOD_LINK_PRED = makeSymbol( "_CSETF-SBHL-MOD-LINK-PRED" );
    $sym11$SBHL_MOD_ACCESSIBLE_LINK_PREDS = makeSymbol( "SBHL-MOD-ACCESSIBLE-LINK-PREDS" );
    $sym12$_CSETF_SBHL_MOD_ACCESSIBLE_LINK_PREDS = makeSymbol( "_CSETF-SBHL-MOD-ACCESSIBLE-LINK-PREDS" );
    $sym13$SBHL_MOD_GRAPH = makeSymbol( "SBHL-MOD-GRAPH" );
    $sym14$_CSETF_SBHL_MOD_GRAPH = makeSymbol( "_CSETF-SBHL-MOD-GRAPH" );
    $sym15$SBHL_MOD_LINK_STYLE = makeSymbol( "SBHL-MOD-LINK-STYLE" );
    $sym16$_CSETF_SBHL_MOD_LINK_STYLE = makeSymbol( "_CSETF-SBHL-MOD-LINK-STYLE" );
    $sym17$SBHL_MOD_INDEX_ARG = makeSymbol( "SBHL-MOD-INDEX-ARG" );
    $sym18$_CSETF_SBHL_MOD_INDEX_ARG = makeSymbol( "_CSETF-SBHL-MOD-INDEX-ARG" );
    $sym19$SBHL_MOD_MODULE_TYPE = makeSymbol( "SBHL-MOD-MODULE-TYPE" );
    $sym20$_CSETF_SBHL_MOD_MODULE_TYPE = makeSymbol( "_CSETF-SBHL-MOD-MODULE-TYPE" );
    $sym21$SBHL_MOD_TYPE_TEST = makeSymbol( "SBHL-MOD-TYPE-TEST" );
    $sym22$_CSETF_SBHL_MOD_TYPE_TEST = makeSymbol( "_CSETF-SBHL-MOD-TYPE-TEST" );
    $sym23$SBHL_MOD_PATH_TERMINATING_MARK_FN = makeSymbol( "SBHL-MOD-PATH-TERMINATING-MARK-FN" );
    $sym24$_CSETF_SBHL_MOD_PATH_TERMINATING_MARK_FN = makeSymbol( "_CSETF-SBHL-MOD-PATH-TERMINATING-MARK-FN" );
    $sym25$SBHL_MOD_MARKING_FN = makeSymbol( "SBHL-MOD-MARKING-FN" );
    $sym26$_CSETF_SBHL_MOD_MARKING_FN = makeSymbol( "_CSETF-SBHL-MOD-MARKING-FN" );
    $sym27$SBHL_MOD_UNMARKING_FN = makeSymbol( "SBHL-MOD-UNMARKING-FN" );
    $sym28$_CSETF_SBHL_MOD_UNMARKING_FN = makeSymbol( "_CSETF-SBHL-MOD-UNMARKING-FN" );
    $sym29$SBHL_MOD_VAR_BINDINGS = makeSymbol( "SBHL-MOD-VAR-BINDINGS" );
    $sym30$_CSETF_SBHL_MOD_VAR_BINDINGS = makeSymbol( "_CSETF-SBHL-MOD-VAR-BINDINGS" );
    $sym31$SBHL_MOD_MISC_PROPERTIES = makeSymbol( "SBHL-MOD-MISC-PROPERTIES" );
    $sym32$_CSETF_SBHL_MOD_MISC_PROPERTIES = makeSymbol( "_CSETF-SBHL-MOD-MISC-PROPERTIES" );
    $kw33$LINK_PRED = makeKeyword( "LINK-PRED" );
    $kw34$ACCESSIBLE_LINK_PREDS = makeKeyword( "ACCESSIBLE-LINK-PREDS" );
    $kw35$GRAPH = makeKeyword( "GRAPH" );
    $kw36$LINK_STYLE = makeKeyword( "LINK-STYLE" );
    $kw37$INDEX_ARG = makeKeyword( "INDEX-ARG" );
    $kw38$MODULE_TYPE = makeKeyword( "MODULE-TYPE" );
    $kw39$TYPE_TEST = makeKeyword( "TYPE-TEST" );
    $kw40$PATH_TERMINATING_MARK_FN = makeKeyword( "PATH-TERMINATING-MARK-FN" );
    $kw41$MARKING_FN = makeKeyword( "MARKING-FN" );
    $kw42$UNMARKING_FN = makeKeyword( "UNMARKING-FN" );
    $kw43$VAR_BINDINGS = makeKeyword( "VAR-BINDINGS" );
    $kw44$MISC_PROPERTIES = makeKeyword( "MISC-PROPERTIES" );
    $str45$Invalid_slot__S_for_construction_ = makeString( "Invalid slot ~S for construction function" );
    $kw46$BEGIN = makeKeyword( "BEGIN" );
    $sym47$MAKE_SBHL_MODULE = makeSymbol( "MAKE-SBHL-MODULE" );
    $kw48$SLOT = makeKeyword( "SLOT" );
    $kw49$END = makeKeyword( "END" );
    $sym50$VISIT_DEFSTRUCT_OBJECT_SBHL_MODULE_METHOD = makeSymbol( "VISIT-DEFSTRUCT-OBJECT-SBHL-MODULE-METHOD" );
    $str51$__SBHL_MODULE__ = makeString( "#<SBHL-MODULE: " );
    $str52$_ = makeString( ">" );
    $sym53$FORT_P = makeSymbol( "FORT-P" );
    $kw54$ERROR = makeKeyword( "ERROR" );
    $str55$_A_is_not_a__A = makeString( "~A is not a ~A" );
    $sym56$SBHL_MODULE_PROPERTY_P = makeSymbol( "SBHL-MODULE-PROPERTY-P" );
    $kw57$CERROR = makeKeyword( "CERROR" );
    $str58$continue_anyway = makeString( "continue anyway" );
    $kw59$WARN = makeKeyword( "WARN" );
    $str60$_A_is_not_a_valid__sbhl_type_erro = makeString( "~A is not a valid *sbhl-type-error-action* value" );
    $kw61$PATH_TERMINATING_MARK__FN = makeKeyword( "PATH-TERMINATING-MARK?-FN" );
    $sym62$_SBHL_MODULES_ = makeSymbol( "*SBHL-MODULES*" );
    $str63$____SBHL_module_store_has_been_co = makeString( ";;; SBHL module store has been converted to new format.~&" );
    $str64$____No_KB_has_been_loaded__SBHL_m = makeString( ";;; No KB has been loaded, SBHL module store format is fine.~&" );
    $str65$____Unexpected_SBHL_module_store_ = makeString( ";;; Unexpected SBHL module store format ~A ... SBHL may not work.~&" );
    $kw66$CHECKED = makeKeyword( "CHECKED" );
    $sym67$SBHL_PREDICATE_OBJECT_P = makeSymbol( "SBHL-PREDICATE-OBJECT-P" );
    $sym68$SBHL_MODULE_OBJECT_P = makeSymbol( "SBHL-MODULE-OBJECT-P" );
    $list69 = ConsesLow.list( ConsesLow.list( makeSymbol( "MODULE-VAR" ), makeSymbol( "&OPTIONAL" ), makeSymbol( "DONE-VAR" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym70$KEY = makeUninternedSymbol( "KEY" );
    $sym71$DO_ALIST = makeSymbol( "DO-ALIST" );
    $list72 = ConsesLow.list( makeSymbol( "GET-SBHL-MODULES" ) );
    $kw73$DONE = makeKeyword( "DONE" );
    $sym74$IGNORE = makeSymbol( "IGNORE" );
    $list75 = ConsesLow.list( makeKeyword( "SIMPLE-REFLEXIVE" ), makeKeyword( "SIMPLE-NON-REFLEXIVE" ), makeKeyword( "TRANSFERS-THROUGH" ), makeKeyword( "DISJOINS" ), makeKeyword( "TIME" ) );
    $kw76$SIMPLE_REFLEXIVE = makeKeyword( "SIMPLE-REFLEXIVE" );
    $kw77$SIMPLE_NON_REFLEXIVE = makeKeyword( "SIMPLE-NON-REFLEXIVE" );
    $kw78$TRANSFERS_THROUGH = makeKeyword( "TRANSFERS-THROUGH" );
    $kw79$DISJOINS = makeKeyword( "DISJOINS" );
    $kw80$TIME = makeKeyword( "TIME" );
    $sym81$MODULE = makeUninternedSymbol( "MODULE" );
    $sym82$DO_SBHL_MODULES = makeSymbol( "DO-SBHL-MODULES" );
    $sym83$PWHEN = makeSymbol( "PWHEN" );
    $sym84$SBHL_SIMPLE_MODULE_P = makeSymbol( "SBHL-SIMPLE-MODULE-P" );
    $sym85$CLET = makeSymbol( "CLET" );
    $sym86$GET_SBHL_LINK_PRED = makeSymbol( "GET-SBHL-LINK-PRED" );
    $sym87$MODULE = makeUninternedSymbol( "MODULE" );
    $sym88$SBHL_TIME_MODULE_P = makeSymbol( "SBHL-TIME-MODULE-P" );
    $list89 = ConsesLow.list( ConsesLow.list( makeSymbol( "PRED-VAR" ), makeSymbol( "&OPTIONAL" ), makeSymbol( "DONE-VAR" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym90$MODULE = makeUninternedSymbol( "MODULE" );
    $sym91$_SBHL_MODULE_PROPERTIES_ = makeSymbol( "*SBHL-MODULE-PROPERTIES*" );
    $sym92$SBHL_LINK_STYLE_SPECIFIER_P = makeSymbol( "SBHL-LINK-STYLE-SPECIFIER-P" );
    $kw93$NAUT_FORWARD_TRUE_GENERATORS = makeKeyword( "NAUT-FORWARD-TRUE-GENERATORS" );
    $sym94$FUNCTION_SYMBOL_LIST_P = makeSymbol( "FUNCTION-SYMBOL-LIST-P" );
    $sym95$SBHL_MODULE_TYPE_P = makeSymbol( "SBHL-MODULE-TYPE-P" );
    $sym96$FUNCTION_SYMBOL_P = makeSymbol( "FUNCTION-SYMBOL-P" );
    $kw97$MODULE_INVERTS_ARGUMENTS = makeKeyword( "MODULE-INVERTS-ARGUMENTS" );
    $sym98$SBHL_MODULE_OR_PREDICATE_P = makeSymbol( "SBHL-MODULE-OR-PREDICATE-P" );
    $kw99$INVERTS_ARGUMENTS_OF_MODULE = makeKeyword( "INVERTS-ARGUMENTS-OF-MODULE" );
    $kw100$DISJOINS_MODULE = makeKeyword( "DISJOINS-MODULE" );
    $kw101$MARKING_INCREMENT = makeKeyword( "MARKING-INCREMENT" );
    $sym102$INTEGERP = makeSymbol( "INTEGERP" );
    $sym103$LISTP = makeSymbol( "LISTP" );
    $kw104$TRANSFERS_THROUGH_MODULE = makeKeyword( "TRANSFERS-THROUGH-MODULE" );
    $kw105$TRANSFERS_VIA_ARG = makeKeyword( "TRANSFERS-VIA-ARG" );
    $kw106$ADD_NODE_TO_RESULT_TEST = makeKeyword( "ADD-NODE-TO-RESULT-TEST" );
    $kw107$ADD_UNMARKED_NODE_TO_RESULT_TEST = makeKeyword( "ADD-UNMARKED-NODE-TO-RESULT-TEST" );
    $kw108$PREDICATE_SEARCH_P = makeKeyword( "PREDICATE-SEARCH-P" );
    $sym109$BOOLEANP = makeSymbol( "BOOLEANP" );
    $kw110$MODULE_TAG = makeKeyword( "MODULE-TAG" );
    $sym111$KEYWORDP = makeSymbol( "KEYWORDP" );
    $kw112$ROOT = makeKeyword( "ROOT" );
    $sym113$SBHL_NODE_OBJECT_P = makeSymbol( "SBHL-NODE-OBJECT-P" );
    $sym114$HASH_TABLE_P = makeSymbol( "HASH-TABLE-P" );
    $kw115$SBHL_MARKING_PARAMETERS = makeKeyword( "SBHL-MARKING-PARAMETERS" );
    $list116 = ConsesLow.list( ConsesLow.list( makeSymbol( "PROPERTY-VAR" ), makeSymbol( "TEST-VAR" ), makeSymbol( "&OPTIONAL" ), makeSymbol( "DONE-VAR" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym117$DO_DICTIONARY = makeSymbol( "DO-DICTIONARY" );
    $list118 = ConsesLow.list( makeSymbol( "GET-SBHL-MODULE-PROPERTIES" ) );
    $list119 = ConsesLow.list( makeKeyword( "LINK-PRED" ), makeKeyword( "LINK-STYLE" ), makeKeyword( "MODULE-TYPE" ), makeKeyword( "PATH-TERMINATING-MARK?-FN" ), makeKeyword( "MARKING-FN" ), makeKeyword(
        "UNMARKING-FN" ), makeKeyword( "INDEX-ARG" ), makeKeyword( "GRAPH" ) );
    $list120 = ConsesLow.list( ConsesLow.list( makeSymbol( "PROPERTY-VAR" ), makeSymbol( "&OPTIONAL" ), makeSymbol( "DONE-VAR" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym121$SMART_CSOME = makeSymbol( "SMART-CSOME" );
    $list122 = ConsesLow.list( makeSymbol( "GET-SBHL-MODULE-REQUIRED-PROPERTIES" ) );
    $str123$_A_is_not_a_valid_sbhl_predicate_ = makeString( "~A is not a valid sbhl-predicate-p" );
    $list124 = ConsesLow.list( makeSymbol( "MODULE" ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym125$_SBHL_MODULE_ = makeSymbol( "*SBHL-MODULE*" );
    $sym126$FIF = makeSymbol( "FIF" );
    $list127 = ConsesLow.list( makeSymbol( "*SBHL-MODULE*" ) );
    $const128$DirectedMultigraph = constant_handles.reader_make_constant_shell( makeString( "DirectedMultigraph" ) );
    $const129$Multigraph = constant_handles.reader_make_constant_shell( makeString( "Multigraph" ) );
    $str130$Term___a__is_not_used_to_specify_ = makeString( "Term, ~a, is not used to specify directed nor undirected graphs" );
    $list131 = ConsesLow.cons( makeUninternedSymbol( "KEY" ), makeSymbol( "MODULE" ) );
    $sym132$SBHL_MODULES_LINK_PRED__ = makeSymbol( "SBHL-MODULES-LINK-PRED-<" );
    $sym133$_ = makeSymbol( ">" );
    $sym134$SECOND = makeSymbol( "SECOND" );
    $sym135$FIRST = makeSymbol( "FIRST" );
    $const136$genls = constant_handles.reader_make_constant_shell( makeString( "genls" ) );
  }

  public static final class $sbhl_module_native
      extends
        SubLStructNative
  {
    public SubLObject $link_pred;
    public SubLObject $accessible_link_preds;
    public SubLObject $graph;
    public SubLObject $link_style;
    public SubLObject $index_arg;
    public SubLObject $module_type;
    public SubLObject $type_test;
    public SubLObject $path_terminating_mark_fn;
    public SubLObject $marking_fn;
    public SubLObject $unmarking_fn;
    public SubLObject $var_bindings;
    public SubLObject $misc_properties;
    private static final SubLStructDeclNative structDecl;

    public $sbhl_module_native()
    {
      this.$link_pred = CommonSymbols.NIL;
      this.$accessible_link_preds = CommonSymbols.NIL;
      this.$graph = CommonSymbols.NIL;
      this.$link_style = CommonSymbols.NIL;
      this.$index_arg = CommonSymbols.NIL;
      this.$module_type = CommonSymbols.NIL;
      this.$type_test = CommonSymbols.NIL;
      this.$path_terminating_mark_fn = CommonSymbols.NIL;
      this.$marking_fn = CommonSymbols.NIL;
      this.$unmarking_fn = CommonSymbols.NIL;
      this.$var_bindings = CommonSymbols.NIL;
      this.$misc_properties = CommonSymbols.NIL;
    }

    @Override
    public SubLStructDecl getStructDecl()
    {
      return $sbhl_module_native.structDecl;
    }

    @Override
    public SubLObject getField2()
    {
      return this.$link_pred;
    }

    @Override
    public SubLObject getField3()
    {
      return this.$accessible_link_preds;
    }

    @Override
    public SubLObject getField4()
    {
      return this.$graph;
    }

    @Override
    public SubLObject getField5()
    {
      return this.$link_style;
    }

    @Override
    public SubLObject getField6()
    {
      return this.$index_arg;
    }

    @Override
    public SubLObject getField7()
    {
      return this.$module_type;
    }

    @Override
    public SubLObject getField8()
    {
      return this.$type_test;
    }

    @Override
    public SubLObject getField9()
    {
      return this.$path_terminating_mark_fn;
    }

    @Override
    public SubLObject getField10()
    {
      return this.$marking_fn;
    }

    @Override
    public SubLObject getField11()
    {
      return this.$unmarking_fn;
    }

    @Override
    public SubLObject getField12()
    {
      return this.$var_bindings;
    }

    @Override
    public SubLObject getField13()
    {
      return this.$misc_properties;
    }

    @Override
    public SubLObject setField2(final SubLObject value)
    {
      return this.$link_pred = value;
    }

    @Override
    public SubLObject setField3(final SubLObject value)
    {
      return this.$accessible_link_preds = value;
    }

    @Override
    public SubLObject setField4(final SubLObject value)
    {
      return this.$graph = value;
    }

    @Override
    public SubLObject setField5(final SubLObject value)
    {
      return this.$link_style = value;
    }

    @Override
    public SubLObject setField6(final SubLObject value)
    {
      return this.$index_arg = value;
    }

    @Override
    public SubLObject setField7(final SubLObject value)
    {
      return this.$module_type = value;
    }

    @Override
    public SubLObject setField8(final SubLObject value)
    {
      return this.$type_test = value;
    }

    @Override
    public SubLObject setField9(final SubLObject value)
    {
      return this.$path_terminating_mark_fn = value;
    }

    @Override
    public SubLObject setField10(final SubLObject value)
    {
      return this.$marking_fn = value;
    }

    @Override
    public SubLObject setField11(final SubLObject value)
    {
      return this.$unmarking_fn = value;
    }

    @Override
    public SubLObject setField12(final SubLObject value)
    {
      return this.$var_bindings = value;
    }

    @Override
    public SubLObject setField13(final SubLObject value)
    {
      return this.$misc_properties = value;
    }
    static
    {
      structDecl = Structures.makeStructDeclNative( $sbhl_module_native.class, $sym0$SBHL_MODULE, $sym1$SBHL_MODULE_P, $list2, $list3, new String[] { "$link_pred", "$accessible_link_preds", "$graph", "$link_style",
        "$index_arg", "$module_type", "$type_test", "$path_terminating_mark_fn", "$marking_fn", "$unmarking_fn", "$var_bindings", "$misc_properties"
      }, $list4, $list5, $sym6$PRINT_SBHL_MODULE );
    }
  }

  public static final class $sbhl_module_p$UnaryFunction
      extends
        UnaryFunction
  {
    public $sbhl_module_p$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "SBHL-MODULE-P" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1)
    {
      return sbhl_module_p( arg1 );
    }
  }

  public static final class $get_sbhl_module$ZeroArityFunction
      extends
        ZeroArityFunction
  {
    public $get_sbhl_module$ZeroArityFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "GET-SBHL-MODULE" ) );
    }

    @Override
    public SubLObject processItem()
    {
      return get_sbhl_module( $get_sbhl_module$ZeroArityFunction.UNPROVIDED );
    }
  }

  public static final class $get_sbhl_module$UnaryFunction
      extends
        UnaryFunction
  {
    public $get_sbhl_module$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "GET-SBHL-MODULE" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1)
    {
      return get_sbhl_module( arg1 );
    }
  }
}
/*
 * 
 * Total time: 251 ms
 * 
 */