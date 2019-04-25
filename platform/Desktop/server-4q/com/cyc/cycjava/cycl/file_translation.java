package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.cycjava.cycl.cyc_testing.generic_testing;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Packages;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.stream_macros;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.StreamsLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Filesys;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sxhash;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_macros;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class file_translation
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.file_translation";
  public static final String myFingerPrint = "b4fd021b446e81d7d56b52c973004c861ca4f1c979c64c12b13299802d63cb12";
  @SubLTranslatedFile.SubL(source = "cycl/file-translation.lisp", position = 1009L)
  public static SubLSymbol $current_ts_file$;
  @SubLTranslatedFile.SubL(source = "cycl/file-translation.lisp", position = 1583L)
  public static SubLSymbol $dtp_trans_subl_file$;
  @SubLTranslatedFile.SubL(source = "cycl/file-translation.lisp", position = 9475L)
  private static SubLSymbol $trans_subl_global_definers$;
  @SubLTranslatedFile.SubL(source = "cycl/file-translation.lisp", position = 26520L)
  private static SubLSymbol $predefined_constants$;
  private static final SubLSymbol $sym0$TRANS_SUBL_FILE;
  private static final SubLSymbol $sym1$TRANS_SUBL_FILE_P;
  private static final SubLList $list2;
  private static final SubLList $list3;
  private static final SubLList $list4;
  private static final SubLList $list5;
  private static final SubLSymbol $sym6$PRINT_TRANS_SUBL_FILE;
  private static final SubLSymbol $sym7$TRANS_SUBL_FILE_PRINT_FUNCTION_TRAMPOLINE;
  private static final SubLList $list8;
  private static final SubLSymbol $sym9$TSF_MODULE_NAME;
  private static final SubLSymbol $sym10$_CSETF_TSF_MODULE_NAME;
  private static final SubLSymbol $sym11$TSF_FILENAME;
  private static final SubLSymbol $sym12$_CSETF_TSF_FILENAME;
  private static final SubLSymbol $sym13$TSF_INTERNAL_CONSTANTS;
  private static final SubLSymbol $sym14$_CSETF_TSF_INTERNAL_CONSTANTS;
  private static final SubLSymbol $sym15$TSF_REFERENCED_GLOBALS;
  private static final SubLSymbol $sym16$_CSETF_TSF_REFERENCED_GLOBALS;
  private static final SubLSymbol $sym17$TSF_REFERENCED_FUNCTIONS;
  private static final SubLSymbol $sym18$_CSETF_TSF_REFERENCED_FUNCTIONS;
  private static final SubLSymbol $sym19$TSF_DEFINITIONS;
  private static final SubLSymbol $sym20$_CSETF_TSF_DEFINITIONS;
  private static final SubLSymbol $sym21$TSF_TOP_LEVEL_FORMS;
  private static final SubLSymbol $sym22$_CSETF_TSF_TOP_LEVEL_FORMS;
  private static final SubLSymbol $sym23$TSF_DEFINED_GLOBALS;
  private static final SubLSymbol $sym24$_CSETF_TSF_DEFINED_GLOBALS;
  private static final SubLSymbol $sym25$TSF_DEFINED_FUNCTIONS;
  private static final SubLSymbol $sym26$_CSETF_TSF_DEFINED_FUNCTIONS;
  private static final SubLSymbol $sym27$TSF_DEFINED_MACROS;
  private static final SubLSymbol $sym28$_CSETF_TSF_DEFINED_MACROS;
  private static final SubLSymbol $sym29$TSF_ARGLIST_TABLE;
  private static final SubLSymbol $sym30$_CSETF_TSF_ARGLIST_TABLE;
  private static final SubLSymbol $sym31$TSF_BINDING_TYPE_TABLE;
  private static final SubLSymbol $sym32$_CSETF_TSF_BINDING_TYPE_TABLE;
  private static final SubLSymbol $sym33$TSF_METHOD_VISIBILITY_TABLE;
  private static final SubLSymbol $sym34$_CSETF_TSF_METHOD_VISIBILITY_TABLE;
  private static final SubLSymbol $sym35$TSF_GLOBAL_VISIBILITY_TABLE;
  private static final SubLSymbol $sym36$_CSETF_TSF_GLOBAL_VISIBILITY_TABLE;
  private static final SubLSymbol $sym37$TSF_RWBC_METHODS;
  private static final SubLSymbol $sym38$_CSETF_TSF_RWBC_METHODS;
  private static final SubLSymbol $kw39$MODULE_NAME;
  private static final SubLSymbol $kw40$FILENAME;
  private static final SubLSymbol $kw41$INTERNAL_CONSTANTS;
  private static final SubLSymbol $kw42$REFERENCED_GLOBALS;
  private static final SubLSymbol $kw43$REFERENCED_FUNCTIONS;
  private static final SubLSymbol $kw44$DEFINITIONS;
  private static final SubLSymbol $kw45$TOP_LEVEL_FORMS;
  private static final SubLSymbol $kw46$DEFINED_GLOBALS;
  private static final SubLSymbol $kw47$DEFINED_FUNCTIONS;
  private static final SubLSymbol $kw48$DEFINED_MACROS;
  private static final SubLSymbol $kw49$ARGLIST_TABLE;
  private static final SubLSymbol $kw50$BINDING_TYPE_TABLE;
  private static final SubLSymbol $kw51$METHOD_VISIBILITY_TABLE;
  private static final SubLSymbol $kw52$GLOBAL_VISIBILITY_TABLE;
  private static final SubLSymbol $kw53$RWBC_METHODS;
  private static final SubLString $str54$Invalid_slot__S_for_construction_;
  private static final SubLSymbol $kw55$BEGIN;
  private static final SubLSymbol $sym56$MAKE_TRANS_SUBL_FILE;
  private static final SubLSymbol $kw57$SLOT;
  private static final SubLSymbol $kw58$END;
  private static final SubLSymbol $sym59$VISIT_DEFSTRUCT_OBJECT_TRANS_SUBL_FILE_METHOD;
  private static final SubLSymbol $sym60$SXHASH_TRANS_SUBL_FILE_METHOD;
  private static final SubLSymbol $sym61$STRINGP;
  private static final SubLSymbol $kw62$FREE;
  private static final SubLSymbol $sym63$_;
  private static final SubLSymbol $sym64$CDR;
  private static final SubLSymbol $sym65$STRING_LESSP;
  private static final SubLSymbol $sym66$SYMBOL_NAME;
  private static final SubLSymbol $kw67$UNSPECIFIED;
  private static final SubLSymbol $sym68$PROTECTED;
  private static final SubLSymbol $sym69$PRIVATE;
  private static final SubLList $list70;
  private static final SubLList $list71;
  private static final SubLList $list72;
  private static final SubLSymbol $sym73$FILENAME_VAR;
  private static final SubLSymbol $sym74$WITH_STREAM_BUFFER_SIZE;
  private static final SubLList $list75;
  private static final SubLSymbol $sym76$CLET;
  private static final SubLSymbol $sym77$WITH_PRIVATE_TEXT_FILE;
  private static final SubLList $list78;
  private static final SubLString $str79$_dev_null;
  private static final SubLSymbol $kw80$DOWNCASE;
  private static final SubLSymbol $sym81$DOUBLE_FLOAT;
  private static final SubLString $str82$___Trans_SubL_File____S;
  private static final SubLString $str83$_____Location___________S;
  private static final SubLString $str84$_______Referenced_Globals__;
  private static final SubLString $str85$_______Referenced_Functions__;
  private static final SubLString $str86$_______Internal_Constants__;
  private static final SubLList $list87;
  private static final SubLString $str88$___S____S;
  private static final SubLString $str89$_______Definitions__;
  private static final SubLSymbol $sym90$_OPTIONAL;
  private static final SubLSymbol $sym91$_REST;
  private static final SubLSymbol $sym92$_PC;
  private static final SubLSymbol $sym93$_IC;
  private static final SubLSymbol $sym94$SYMBOLP;
  private static final SubLSymbol $sym95$LISTP;
  private static final SubLSymbol $sym96$KEYWORDP;
  private static final SubLSymbol $kw97$INPUT;
  private static final SubLString $str98$Unable_to_open__S;
  private static final SubLSymbol $kw99$EOF;
  private static final SubLSymbol $sym100$NON_NEGATIVE_INTEGER_P;
  private static final SubLSymbol $sym101$PROGN;
  private static final SubLSymbol $sym102$DEFINE;
  private static final SubLSymbol $sym103$DEFINE_MACROEXPANDER;
  private static final SubLSymbol $sym104$DEFVAR;
  private static final SubLSymbol $sym105$DEFPARAMETER;
  private static final SubLSymbol $sym106$DEFLEXICAL;
  private static final SubLSymbol $sym107$DEFCONSTANT;
  private static final SubLSymbol $sym108$_DEFSTRUCT_CLASS;
  private static final SubLSymbol $kw109$NAME;
  private static final SubLSymbol $sym110$IN_PACKAGE;
  private static final SubLList $list111;
  private static final SubLSymbol $sym112$_INTERNAL_CONSTANT;
  private static final SubLList $list113;
  private static final SubLSymbol $sym114$_REGISTER_MACRO;
  private static final SubLList $list115;
  private static final SubLSymbol $sym116$_REGISTER_FUNCTION;
  private static final SubLList $list117;
  private static final SubLSymbol $sym118$_REGISTER_GLOBAL;
  private static final SubLString $str119$DECLARE_;
  private static final SubLString $str120$_FILE;
  private static final SubLSymbol $sym121$RET;
  private static final SubLString $str122$INIT_;
  private static final SubLString $str123$SETUP_;
  private static final SubLSymbol $sym124$VECTOR;
  private static final SubLSymbol $sym125$LIST;
  private static final SubLSymbol $sym126$CONS;
  private static final SubLSymbol $sym127$LIST_;
  private static final SubLSymbol $sym128$SYMBOL_FUNCTION;
  private static final SubLSymbol $sym129$READER_MAKE_CONSTANT_SHELL;
  private static final SubLSymbol $sym130$_LF;
  private static final SubLString $str131$Time_to_implement_function_consta;
  private static final SubLList $list132;
  private static final SubLSymbol $sym133$FUNCTION_ARGLIST_SIGNATURE_INFO;
  private static final SubLSymbol $kw134$TEST;
  private static final SubLSymbol $kw135$OWNER;
  private static final SubLSymbol $kw136$CLASSES;
  private static final SubLSymbol $kw137$KB;
  private static final SubLSymbol $kw138$TINY;
  private static final SubLSymbol $kw139$WORKING_;
  private static final SubLList $list140;
  private static final SubLSymbol $sym141$TRANSLATE_CONSTANT_INITIALIZATION_FORM;
  private static final SubLList $list142;

  @SubLTranslatedFile.SubL(source = "cycl/file-translation.lisp", position = 1057L)
  public static SubLObject current_ts_file()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return $current_ts_file$.getDynamicValue( thread );
  }

  @SubLTranslatedFile.SubL(source = "cycl/file-translation.lisp", position = 1583L)
  public static SubLObject trans_subl_file_print_function_trampoline(final SubLObject v_object, final SubLObject stream)
  {
    print_trans_subl_file( v_object, stream, ZERO_INTEGER );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/file-translation.lisp", position = 1583L)
  public static SubLObject trans_subl_file_p(final SubLObject v_object)
  {
    return ( v_object.getClass() == $trans_subl_file_native.class ) ? T : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/file-translation.lisp", position = 1583L)
  public static SubLObject tsf_module_name(final SubLObject v_object)
  {
    assert NIL != trans_subl_file_p( v_object ) : v_object;
    return v_object.getField2();
  }

  @SubLTranslatedFile.SubL(source = "cycl/file-translation.lisp", position = 1583L)
  public static SubLObject tsf_filename(final SubLObject v_object)
  {
    assert NIL != trans_subl_file_p( v_object ) : v_object;
    return v_object.getField3();
  }

  @SubLTranslatedFile.SubL(source = "cycl/file-translation.lisp", position = 1583L)
  public static SubLObject tsf_internal_constants(final SubLObject v_object)
  {
    assert NIL != trans_subl_file_p( v_object ) : v_object;
    return v_object.getField4();
  }

  @SubLTranslatedFile.SubL(source = "cycl/file-translation.lisp", position = 1583L)
  public static SubLObject tsf_referenced_globals(final SubLObject v_object)
  {
    assert NIL != trans_subl_file_p( v_object ) : v_object;
    return v_object.getField5();
  }

  @SubLTranslatedFile.SubL(source = "cycl/file-translation.lisp", position = 1583L)
  public static SubLObject tsf_referenced_functions(final SubLObject v_object)
  {
    assert NIL != trans_subl_file_p( v_object ) : v_object;
    return v_object.getField6();
  }

  @SubLTranslatedFile.SubL(source = "cycl/file-translation.lisp", position = 1583L)
  public static SubLObject tsf_definitions(final SubLObject v_object)
  {
    assert NIL != trans_subl_file_p( v_object ) : v_object;
    return v_object.getField7();
  }

  @SubLTranslatedFile.SubL(source = "cycl/file-translation.lisp", position = 1583L)
  public static SubLObject tsf_top_level_forms(final SubLObject v_object)
  {
    assert NIL != trans_subl_file_p( v_object ) : v_object;
    return v_object.getField8();
  }

  @SubLTranslatedFile.SubL(source = "cycl/file-translation.lisp", position = 1583L)
  public static SubLObject tsf_defined_globals(final SubLObject v_object)
  {
    assert NIL != trans_subl_file_p( v_object ) : v_object;
    return v_object.getField9();
  }

  @SubLTranslatedFile.SubL(source = "cycl/file-translation.lisp", position = 1583L)
  public static SubLObject tsf_defined_functions(final SubLObject v_object)
  {
    assert NIL != trans_subl_file_p( v_object ) : v_object;
    return v_object.getField10();
  }

  @SubLTranslatedFile.SubL(source = "cycl/file-translation.lisp", position = 1583L)
  public static SubLObject tsf_defined_macros(final SubLObject v_object)
  {
    assert NIL != trans_subl_file_p( v_object ) : v_object;
    return v_object.getField11();
  }

  @SubLTranslatedFile.SubL(source = "cycl/file-translation.lisp", position = 1583L)
  public static SubLObject tsf_arglist_table(final SubLObject v_object)
  {
    assert NIL != trans_subl_file_p( v_object ) : v_object;
    return v_object.getField12();
  }

  @SubLTranslatedFile.SubL(source = "cycl/file-translation.lisp", position = 1583L)
  public static SubLObject tsf_binding_type_table(final SubLObject v_object)
  {
    assert NIL != trans_subl_file_p( v_object ) : v_object;
    return v_object.getField13();
  }

  @SubLTranslatedFile.SubL(source = "cycl/file-translation.lisp", position = 1583L)
  public static SubLObject tsf_method_visibility_table(final SubLObject v_object)
  {
    assert NIL != trans_subl_file_p( v_object ) : v_object;
    return v_object.getField14();
  }

  @SubLTranslatedFile.SubL(source = "cycl/file-translation.lisp", position = 1583L)
  public static SubLObject tsf_global_visibility_table(final SubLObject v_object)
  {
    assert NIL != trans_subl_file_p( v_object ) : v_object;
    return v_object.getField15();
  }

  @SubLTranslatedFile.SubL(source = "cycl/file-translation.lisp", position = 1583L)
  public static SubLObject tsf_rwbc_methods(final SubLObject v_object)
  {
    assert NIL != trans_subl_file_p( v_object ) : v_object;
    return v_object.getField16();
  }

  @SubLTranslatedFile.SubL(source = "cycl/file-translation.lisp", position = 1583L)
  public static SubLObject _csetf_tsf_module_name(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != trans_subl_file_p( v_object ) : v_object;
    return v_object.setField2( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/file-translation.lisp", position = 1583L)
  public static SubLObject _csetf_tsf_filename(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != trans_subl_file_p( v_object ) : v_object;
    return v_object.setField3( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/file-translation.lisp", position = 1583L)
  public static SubLObject _csetf_tsf_internal_constants(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != trans_subl_file_p( v_object ) : v_object;
    return v_object.setField4( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/file-translation.lisp", position = 1583L)
  public static SubLObject _csetf_tsf_referenced_globals(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != trans_subl_file_p( v_object ) : v_object;
    return v_object.setField5( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/file-translation.lisp", position = 1583L)
  public static SubLObject _csetf_tsf_referenced_functions(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != trans_subl_file_p( v_object ) : v_object;
    return v_object.setField6( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/file-translation.lisp", position = 1583L)
  public static SubLObject _csetf_tsf_definitions(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != trans_subl_file_p( v_object ) : v_object;
    return v_object.setField7( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/file-translation.lisp", position = 1583L)
  public static SubLObject _csetf_tsf_top_level_forms(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != trans_subl_file_p( v_object ) : v_object;
    return v_object.setField8( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/file-translation.lisp", position = 1583L)
  public static SubLObject _csetf_tsf_defined_globals(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != trans_subl_file_p( v_object ) : v_object;
    return v_object.setField9( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/file-translation.lisp", position = 1583L)
  public static SubLObject _csetf_tsf_defined_functions(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != trans_subl_file_p( v_object ) : v_object;
    return v_object.setField10( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/file-translation.lisp", position = 1583L)
  public static SubLObject _csetf_tsf_defined_macros(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != trans_subl_file_p( v_object ) : v_object;
    return v_object.setField11( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/file-translation.lisp", position = 1583L)
  public static SubLObject _csetf_tsf_arglist_table(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != trans_subl_file_p( v_object ) : v_object;
    return v_object.setField12( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/file-translation.lisp", position = 1583L)
  public static SubLObject _csetf_tsf_binding_type_table(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != trans_subl_file_p( v_object ) : v_object;
    return v_object.setField13( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/file-translation.lisp", position = 1583L)
  public static SubLObject _csetf_tsf_method_visibility_table(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != trans_subl_file_p( v_object ) : v_object;
    return v_object.setField14( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/file-translation.lisp", position = 1583L)
  public static SubLObject _csetf_tsf_global_visibility_table(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != trans_subl_file_p( v_object ) : v_object;
    return v_object.setField15( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/file-translation.lisp", position = 1583L)
  public static SubLObject _csetf_tsf_rwbc_methods(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != trans_subl_file_p( v_object ) : v_object;
    return v_object.setField16( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/file-translation.lisp", position = 1583L)
  public static SubLObject make_trans_subl_file(SubLObject arglist)
  {
    if( arglist == UNPROVIDED )
    {
      arglist = NIL;
    }
    final SubLObject v_new = new $trans_subl_file_native();
    SubLObject next;
    SubLObject current_arg;
    SubLObject current_value;
    SubLObject pcase_var;
    for( next = NIL, next = arglist; NIL != next; next = conses_high.cddr( next ) )
    {
      current_arg = next.first();
      current_value = conses_high.cadr( next );
      pcase_var = current_arg;
      if( pcase_var.eql( $kw39$MODULE_NAME ) )
      {
        _csetf_tsf_module_name( v_new, current_value );
      }
      else if( pcase_var.eql( $kw40$FILENAME ) )
      {
        _csetf_tsf_filename( v_new, current_value );
      }
      else if( pcase_var.eql( $kw41$INTERNAL_CONSTANTS ) )
      {
        _csetf_tsf_internal_constants( v_new, current_value );
      }
      else if( pcase_var.eql( $kw42$REFERENCED_GLOBALS ) )
      {
        _csetf_tsf_referenced_globals( v_new, current_value );
      }
      else if( pcase_var.eql( $kw43$REFERENCED_FUNCTIONS ) )
      {
        _csetf_tsf_referenced_functions( v_new, current_value );
      }
      else if( pcase_var.eql( $kw44$DEFINITIONS ) )
      {
        _csetf_tsf_definitions( v_new, current_value );
      }
      else if( pcase_var.eql( $kw45$TOP_LEVEL_FORMS ) )
      {
        _csetf_tsf_top_level_forms( v_new, current_value );
      }
      else if( pcase_var.eql( $kw46$DEFINED_GLOBALS ) )
      {
        _csetf_tsf_defined_globals( v_new, current_value );
      }
      else if( pcase_var.eql( $kw47$DEFINED_FUNCTIONS ) )
      {
        _csetf_tsf_defined_functions( v_new, current_value );
      }
      else if( pcase_var.eql( $kw48$DEFINED_MACROS ) )
      {
        _csetf_tsf_defined_macros( v_new, current_value );
      }
      else if( pcase_var.eql( $kw49$ARGLIST_TABLE ) )
      {
        _csetf_tsf_arglist_table( v_new, current_value );
      }
      else if( pcase_var.eql( $kw50$BINDING_TYPE_TABLE ) )
      {
        _csetf_tsf_binding_type_table( v_new, current_value );
      }
      else if( pcase_var.eql( $kw51$METHOD_VISIBILITY_TABLE ) )
      {
        _csetf_tsf_method_visibility_table( v_new, current_value );
      }
      else if( pcase_var.eql( $kw52$GLOBAL_VISIBILITY_TABLE ) )
      {
        _csetf_tsf_global_visibility_table( v_new, current_value );
      }
      else if( pcase_var.eql( $kw53$RWBC_METHODS ) )
      {
        _csetf_tsf_rwbc_methods( v_new, current_value );
      }
      else
      {
        Errors.error( $str54$Invalid_slot__S_for_construction_, current_arg );
      }
    }
    return v_new;
  }

  @SubLTranslatedFile.SubL(source = "cycl/file-translation.lisp", position = 1583L)
  public static SubLObject visit_defstruct_trans_subl_file(final SubLObject obj, final SubLObject visitor_fn)
  {
    Functions.funcall( visitor_fn, obj, $kw55$BEGIN, $sym56$MAKE_TRANS_SUBL_FILE, FIFTEEN_INTEGER );
    Functions.funcall( visitor_fn, obj, $kw57$SLOT, $kw39$MODULE_NAME, tsf_module_name( obj ) );
    Functions.funcall( visitor_fn, obj, $kw57$SLOT, $kw40$FILENAME, tsf_filename( obj ) );
    Functions.funcall( visitor_fn, obj, $kw57$SLOT, $kw41$INTERNAL_CONSTANTS, tsf_internal_constants( obj ) );
    Functions.funcall( visitor_fn, obj, $kw57$SLOT, $kw42$REFERENCED_GLOBALS, tsf_referenced_globals( obj ) );
    Functions.funcall( visitor_fn, obj, $kw57$SLOT, $kw43$REFERENCED_FUNCTIONS, tsf_referenced_functions( obj ) );
    Functions.funcall( visitor_fn, obj, $kw57$SLOT, $kw44$DEFINITIONS, tsf_definitions( obj ) );
    Functions.funcall( visitor_fn, obj, $kw57$SLOT, $kw45$TOP_LEVEL_FORMS, tsf_top_level_forms( obj ) );
    Functions.funcall( visitor_fn, obj, $kw57$SLOT, $kw46$DEFINED_GLOBALS, tsf_defined_globals( obj ) );
    Functions.funcall( visitor_fn, obj, $kw57$SLOT, $kw47$DEFINED_FUNCTIONS, tsf_defined_functions( obj ) );
    Functions.funcall( visitor_fn, obj, $kw57$SLOT, $kw48$DEFINED_MACROS, tsf_defined_macros( obj ) );
    Functions.funcall( visitor_fn, obj, $kw57$SLOT, $kw49$ARGLIST_TABLE, tsf_arglist_table( obj ) );
    Functions.funcall( visitor_fn, obj, $kw57$SLOT, $kw50$BINDING_TYPE_TABLE, tsf_binding_type_table( obj ) );
    Functions.funcall( visitor_fn, obj, $kw57$SLOT, $kw51$METHOD_VISIBILITY_TABLE, tsf_method_visibility_table( obj ) );
    Functions.funcall( visitor_fn, obj, $kw57$SLOT, $kw52$GLOBAL_VISIBILITY_TABLE, tsf_global_visibility_table( obj ) );
    Functions.funcall( visitor_fn, obj, $kw57$SLOT, $kw53$RWBC_METHODS, tsf_rwbc_methods( obj ) );
    Functions.funcall( visitor_fn, obj, $kw58$END, $sym56$MAKE_TRANS_SUBL_FILE, FIFTEEN_INTEGER );
    return obj;
  }

  @SubLTranslatedFile.SubL(source = "cycl/file-translation.lisp", position = 1583L)
  public static SubLObject visit_defstruct_object_trans_subl_file_method(final SubLObject obj, final SubLObject visitor_fn)
  {
    return visit_defstruct_trans_subl_file( obj, visitor_fn );
  }

  @SubLTranslatedFile.SubL(source = "cycl/file-translation.lisp", position = 3191L)
  public static SubLObject print_trans_subl_file(final SubLObject v_object, final SubLObject stream, final SubLObject depth)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != print_high.$print_readably$.getDynamicValue( thread ) )
    {
      print_high.print_not_readable( v_object, stream );
    }
    else
    {
      print_macros.print_unreadable_object_preamble( stream, v_object, T, T );
      print_high.princ( tsf_module_name( v_object ), stream );
      print_macros.print_unreadable_object_postamble( stream, v_object, T, T );
    }
    return v_object;
  }

  @SubLTranslatedFile.SubL(source = "cycl/file-translation.lisp", position = 3393L)
  public static SubLObject sxhash_trans_subl_file_method(final SubLObject v_object)
  {
    return Sxhash.sxhash( tsf_module_name( v_object ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/file-translation.lisp", position = 3486L)
  public static SubLObject new_ts_file(final SubLObject module_name, final SubLObject filename)
  {
    assert NIL != Types.stringp( filename ) : filename;
    final SubLObject ts_file = make_trans_subl_file( UNPROVIDED );
    _csetf_tsf_module_name( ts_file, module_name );
    _csetf_tsf_filename( ts_file, filename );
    _csetf_tsf_internal_constants( ts_file, dictionary.new_dictionary( Symbols.symbol_function( EQUAL ), ZERO_INTEGER ) );
    _csetf_tsf_referenced_globals( ts_file, set.new_set( Symbols.symbol_function( EQ ), ZERO_INTEGER ) );
    _csetf_tsf_referenced_functions( ts_file, set.new_set( Symbols.symbol_function( EQ ), ZERO_INTEGER ) );
    _csetf_tsf_definitions( ts_file, NIL );
    _csetf_tsf_top_level_forms( ts_file, NIL );
    _csetf_tsf_defined_globals( ts_file, NIL );
    _csetf_tsf_defined_functions( ts_file, NIL );
    _csetf_tsf_defined_macros( ts_file, NIL );
    _csetf_tsf_arglist_table( ts_file, dictionary.new_dictionary( Symbols.symbol_function( EQ ), ZERO_INTEGER ) );
    _csetf_tsf_binding_type_table( ts_file, dictionary.new_dictionary( Symbols.symbol_function( EQ ), ZERO_INTEGER ) );
    _csetf_tsf_method_visibility_table( ts_file, dictionary.new_dictionary( Symbols.symbol_function( EQ ), ZERO_INTEGER ) );
    _csetf_tsf_global_visibility_table( ts_file, dictionary.new_dictionary( Symbols.symbol_function( EQ ), ZERO_INTEGER ) );
    _csetf_tsf_rwbc_methods( ts_file, set.new_set( Symbols.symbol_function( EQ ), ZERO_INTEGER ) );
    return ts_file;
  }

  @SubLTranslatedFile.SubL(source = "cycl/file-translation.lisp", position = 4570L)
  public static SubLObject destroy_trans_subl_file(final SubLObject ts_file)
  {
    _csetf_tsf_filename( ts_file, $kw62$FREE );
    dictionary.clear_dictionary( tsf_internal_constants( ts_file ) );
    _csetf_tsf_internal_constants( ts_file, $kw62$FREE );
    set.clear_set( tsf_referenced_globals( ts_file ) );
    _csetf_tsf_referenced_globals( ts_file, $kw62$FREE );
    set.clear_set( tsf_referenced_functions( ts_file ) );
    _csetf_tsf_referenced_functions( ts_file, $kw62$FREE );
    _csetf_tsf_definitions( ts_file, $kw62$FREE );
    _csetf_tsf_top_level_forms( ts_file, $kw62$FREE );
    _csetf_tsf_defined_globals( ts_file, $kw62$FREE );
    _csetf_tsf_defined_functions( ts_file, $kw62$FREE );
    _csetf_tsf_defined_macros( ts_file, $kw62$FREE );
    dictionary.clear_dictionary( tsf_arglist_table( ts_file ) );
    _csetf_tsf_arglist_table( ts_file, $kw62$FREE );
    dictionary.clear_dictionary( tsf_binding_type_table( ts_file ) );
    _csetf_tsf_binding_type_table( ts_file, $kw62$FREE );
    dictionary.clear_dictionary( tsf_method_visibility_table( ts_file ) );
    _csetf_tsf_method_visibility_table( ts_file, $kw62$FREE );
    dictionary.clear_dictionary( tsf_global_visibility_table( ts_file ) );
    _csetf_tsf_global_visibility_table( ts_file, $kw62$FREE );
    set.clear_set( tsf_rwbc_methods( ts_file ) );
    _csetf_tsf_rwbc_methods( ts_file, $kw62$FREE );
    return ts_file;
  }

  @SubLTranslatedFile.SubL(source = "cycl/file-translation.lisp", position = 6028L)
  public static SubLObject ts_file_module_name(final SubLObject ts_file)
  {
    return tsf_module_name( ts_file );
  }

  @SubLTranslatedFile.SubL(source = "cycl/file-translation.lisp", position = 6124L)
  public static SubLObject ts_file_filename(final SubLObject ts_file)
  {
    return tsf_filename( ts_file );
  }

  @SubLTranslatedFile.SubL(source = "cycl/file-translation.lisp", position = 6202L)
  public static SubLObject ts_file_definitions(final SubLObject ts_file)
  {
    return tsf_definitions( ts_file );
  }

  @SubLTranslatedFile.SubL(source = "cycl/file-translation.lisp", position = 6286L)
  public static SubLObject ts_file_internal_constant_count(final SubLObject ts_file)
  {
    return dictionary.dictionary_length( tsf_internal_constants( ts_file ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/file-translation.lisp", position = 6435L)
  public static SubLObject ts_file_next_internal_constant_id(final SubLObject ts_file)
  {
    return ts_file_internal_constant_count( ts_file );
  }

  @SubLTranslatedFile.SubL(source = "cycl/file-translation.lisp", position = 6547L)
  public static SubLObject ts_file_internal_constants_info(final SubLObject ts_file)
  {
    return Sort.sort( dictionary_utilities.dictionary_to_alist( tsf_internal_constants( ts_file ) ), Symbols.symbol_function( $sym63$_ ), Symbols.symbol_function( $sym64$CDR ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/file-translation.lisp", position = 6687L)
  public static SubLObject ts_file_all_referenced_globals(final SubLObject ts_file)
  {
    return Sort.sort( set.set_element_list( tsf_referenced_globals( ts_file ) ), Symbols.symbol_function( $sym65$STRING_LESSP ), Symbols.symbol_function( $sym66$SYMBOL_NAME ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/file-translation.lisp", position = 6845L)
  public static SubLObject ts_file_all_defined_globals(final SubLObject ts_file)
  {
    return tsf_defined_globals( ts_file );
  }

  @SubLTranslatedFile.SubL(source = "cycl/file-translation.lisp", position = 6941L)
  public static SubLObject ts_file_all_referenced_functions(final SubLObject ts_file)
  {
    return Sort.sort( set.set_element_list( tsf_referenced_functions( ts_file ) ), Symbols.symbol_function( $sym65$STRING_LESSP ), Symbols.symbol_function( $sym66$SYMBOL_NAME ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/file-translation.lisp", position = 7103L)
  public static SubLObject ts_file_all_defined_functions(final SubLObject ts_file)
  {
    return tsf_defined_functions( ts_file );
  }

  @SubLTranslatedFile.SubL(source = "cycl/file-translation.lisp", position = 7203L)
  public static SubLObject ts_file_all_defined_private_functions(final SubLObject ts_file)
  {
    SubLObject private_functions = NIL;
    SubLObject cdolist_list_var = ts_file_all_defined_functions( ts_file );
    SubLObject function = NIL;
    function = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL != ts_file_defined_private_method_p( ts_file, function ) )
      {
        private_functions = ConsesLow.cons( function, private_functions );
      }
      cdolist_list_var = cdolist_list_var.rest();
      function = cdolist_list_var.first();
    }
    return Sequences.nreverse( private_functions );
  }

  @SubLTranslatedFile.SubL(source = "cycl/file-translation.lisp", position = 7511L)
  public static SubLObject ts_file_function_arglist(final SubLObject ts_file, final SubLObject function)
  {
    return dictionary.dictionary_lookup( tsf_arglist_table( ts_file ), function, $kw67$UNSPECIFIED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/file-translation.lisp", position = 7652L)
  public static SubLObject current_ts_file_defined_function_arglist(final SubLObject function)
  {
    final SubLObject ts_file = current_ts_file();
    return ( NIL != ts_file ) ? ts_file_function_arglist( ts_file, function ) : $kw67$UNSPECIFIED;
  }

  @SubLTranslatedFile.SubL(source = "cycl/file-translation.lisp", position = 7844L)
  public static SubLObject ts_file_defined_global_binding_type(final SubLObject ts_file, final SubLObject global)
  {
    return dictionary.dictionary_lookup( tsf_binding_type_table( ts_file ), global, $kw67$UNSPECIFIED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/file-translation.lisp", position = 7997L)
  public static SubLObject ts_file_global_binding_type(final SubLObject ts_file, final SubLObject global)
  {
    final SubLObject binding_type = ts_file_defined_global_binding_type( ts_file, global );
    if( binding_type != $kw67$UNSPECIFIED )
    {
      return binding_type;
    }
    return form_translation.global_binding_type( global );
  }

  @SubLTranslatedFile.SubL(source = "cycl/file-translation.lisp", position = 8240L)
  public static SubLObject current_ts_file_global_binding_type(final SubLObject global)
  {
    final SubLObject ts_file = current_ts_file();
    if( NIL != ts_file )
    {
      return ts_file_global_binding_type( ts_file, global );
    }
    return form_translation.global_binding_type( global );
  }

  @SubLTranslatedFile.SubL(source = "cycl/file-translation.lisp", position = 8503L)
  public static SubLObject ts_file_defined_method_visibility(final SubLObject ts_file, final SubLObject method)
  {
    return dictionary.dictionary_lookup( tsf_method_visibility_table( ts_file ), method, $sym68$PROTECTED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/file-translation.lisp", position = 8657L)
  public static SubLObject ts_file_defined_private_method_p(final SubLObject ts_file, final SubLObject method)
  {
    return Equality.eq( $sym69$PRIVATE, ts_file_defined_method_visibility( ts_file, method ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/file-translation.lisp", position = 8800L)
  public static SubLObject current_ts_file_defined_private_method_p(final SubLObject method)
  {
    final SubLObject ts_file = current_ts_file();
    return ( NIL != ts_file ) ? ts_file_defined_private_method_p( ts_file, method ) : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/file-translation.lisp", position = 8989L)
  public static SubLObject ts_file_defined_global_visibility(final SubLObject ts_file, final SubLObject global)
  {
    return dictionary.dictionary_lookup( tsf_global_visibility_table( ts_file ), global, $sym68$PROTECTED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/file-translation.lisp", position = 9143L)
  public static SubLObject ts_file_defined_private_global_p(final SubLObject ts_file, final SubLObject global)
  {
    return Equality.eq( $sym69$PRIVATE, ts_file_defined_global_visibility( ts_file, global ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/file-translation.lisp", position = 9286L)
  public static SubLObject current_ts_file_defined_private_global_p(final SubLObject global)
  {
    final SubLObject ts_file = current_ts_file();
    return ( NIL != ts_file ) ? ts_file_defined_private_global_p( ts_file, global ) : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/file-translation.lisp", position = 9586L)
  public static SubLObject ts_file_private_global_definition_p(final SubLObject ts_file, final SubLObject definition)
  {
    if( definition.isCons() )
    {
      final SubLObject operator = definition.first();
      if( NIL != list_utilities.member_eqP( operator, $trans_subl_global_definers$.getGlobalValue() ) )
      {
        SubLObject definer = NIL;
        SubLObject global = NIL;
        cdestructuring_bind.destructuring_bind_must_consp( definition, definition, $list71 );
        definer = definition.first();
        SubLObject current = definition.rest();
        cdestructuring_bind.destructuring_bind_must_consp( current, definition, $list71 );
        global = current.first();
        current = current.rest();
        final SubLObject init_form = current.isCons() ? current.first() : NIL;
        cdestructuring_bind.destructuring_bind_must_listp( current, definition, $list71 );
        current = current.rest();
        final SubLObject documentation = current.isCons() ? current.first() : NIL;
        cdestructuring_bind.destructuring_bind_must_listp( current, definition, $list71 );
        current = current.rest();
        if( NIL == current )
        {
          return ts_file_defined_private_global_p( ts_file, global );
        }
        cdestructuring_bind.cdestructuring_bind_error( definition, $list71 );
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/file-translation.lisp", position = 9988L)
  public static SubLObject ts_file_private_global_definitions(final SubLObject ts_file)
  {
    SubLObject private_global_definitions = NIL;
    SubLObject cdolist_list_var = ts_file_definitions( ts_file );
    SubLObject definition = NIL;
    definition = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL != ts_file_private_global_definition_p( ts_file, definition ) )
      {
        private_global_definitions = ConsesLow.cons( definition, private_global_definitions );
      }
      cdolist_list_var = cdolist_list_var.rest();
      definition = cdolist_list_var.first();
    }
    return Sequences.nreverse( private_global_definitions );
  }

  @SubLTranslatedFile.SubL(source = "cycl/file-translation.lisp", position = 10319L)
  public static SubLObject ts_file_method_returns_within_binding_constructP(final SubLObject ts_file, final SubLObject method)
  {
    return set.set_memberP( method, tsf_rwbc_methods( ts_file ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/file-translation.lisp", position = 10461L)
  public static SubLObject ts_file_internal_constant_id_lookup(final SubLObject ts_file, final SubLObject constant_form)
  {
    SubLObject internal_constant_id = dictionary.dictionary_lookup_without_values( tsf_internal_constants( ts_file ), constant_form, UNPROVIDED );
    if( NIL == internal_constant_id )
    {
      internal_constant_id = ts_file_next_internal_constant_id( ts_file );
      dictionary.dictionary_enter( tsf_internal_constants( ts_file ), constant_form, internal_constant_id );
    }
    return internal_constant_id;
  }

  @SubLTranslatedFile.SubL(source = "cycl/file-translation.lisp", position = 10909L)
  public static SubLObject ts_file_note_function_definition(final SubLObject ts_file, final SubLObject function_name, final SubLObject translated_form)
  {
    _csetf_tsf_definitions( ts_file, ConsesLow.cons( translated_form, tsf_definitions( ts_file ) ) );
    _csetf_tsf_defined_functions( ts_file, ConsesLow.cons( function_name, tsf_defined_functions( ts_file ) ) );
    return translated_form;
  }

  @SubLTranslatedFile.SubL(source = "cycl/file-translation.lisp", position = 11140L)
  public static SubLObject ts_file_note_macro_definition(final SubLObject ts_file, final SubLObject macro_name, final SubLObject translated_form)
  {
    _csetf_tsf_definitions( ts_file, ConsesLow.cons( translated_form, tsf_definitions( ts_file ) ) );
    _csetf_tsf_defined_macros( ts_file, ConsesLow.cons( macro_name, tsf_defined_macros( ts_file ) ) );
    return translated_form;
  }

  @SubLTranslatedFile.SubL(source = "cycl/file-translation.lisp", position = 11363L)
  public static SubLObject ts_file_note_global_definition(final SubLObject ts_file, final SubLObject global_name, final SubLObject translated_form)
  {
    _csetf_tsf_definitions( ts_file, ConsesLow.cons( translated_form, tsf_definitions( ts_file ) ) );
    _csetf_tsf_defined_globals( ts_file, ConsesLow.cons( global_name, tsf_defined_globals( ts_file ) ) );
    return translated_form;
  }

  @SubLTranslatedFile.SubL(source = "cycl/file-translation.lisp", position = 11588L)
  public static SubLObject ts_file_note_class_definition(final SubLObject ts_file, final SubLObject class_name, final SubLObject translated_form)
  {
    _csetf_tsf_definitions( ts_file, ConsesLow.cons( translated_form, tsf_definitions( ts_file ) ) );
    return translated_form;
  }

  @SubLTranslatedFile.SubL(source = "cycl/file-translation.lisp", position = 11865L)
  public static SubLObject ts_file_note_top_level_form(final SubLObject ts_file, final SubLObject translated_form)
  {
    _csetf_tsf_top_level_forms( ts_file, ConsesLow.cons( translated_form, tsf_top_level_forms( ts_file ) ) );
    return translated_form;
  }

  @SubLTranslatedFile.SubL(source = "cycl/file-translation.lisp", position = 12021L)
  public static SubLObject with_translator_output_file(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list72 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject stream_var = NIL;
    SubLObject filename = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list72 );
    stream_var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list72 );
    filename = current.first();
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      final SubLObject filename_var = $sym73$FILENAME_VAR;
      return ConsesLow.list( $sym74$WITH_STREAM_BUFFER_SIZE, $list75, ConsesLow.list( $sym76$CLET, ConsesLow.list( ConsesLow.list( filename_var, filename ) ), ConsesLow.listS( $sym77$WITH_PRIVATE_TEXT_FILE, ConsesLow
          .listS( stream_var, filename_var, $list78 ), ConsesLow.append( body, NIL ) ) ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list72 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/file-translation.lisp", position = 12334L)
  public static SubLObject possibly_delete_file(final SubLObject filename)
  {
    if( !filename.equal( $str79$_dev_null ) && NIL != Filesys.probe_file( filename ) )
    {
      Filesys.delete_file( filename );
      return T;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/file-translation.lisp", position = 12504L)
  public static SubLObject show_trans_subl_file(final SubLObject ts_file, SubLObject stream)
  {
    if( stream == UNPROVIDED )
    {
      stream = StreamsLow.$standard_output$.getDynamicValue();
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject _prev_bind_0 = print_high.$print_case$.currentBinding( thread );
    final SubLObject _prev_bind_2 = reader.$read_default_float_format$.currentBinding( thread );
    try
    {
      print_high.$print_case$.bind( $kw80$DOWNCASE, thread );
      reader.$read_default_float_format$.bind( $sym81$DOUBLE_FLOAT, thread );
      PrintLow.format( stream, $str82$___Trans_SubL_File____S, tsf_module_name( ts_file ) );
      PrintLow.format( stream, $str83$_____Location___________S, tsf_filename( ts_file ) );
      final SubLObject referenced_globals = ts_file_all_referenced_globals( ts_file );
      if( NIL != referenced_globals )
      {
        PrintLow.format( stream, $str84$_______Referenced_Globals__ );
        SubLObject cdolist_list_var = referenced_globals;
        SubLObject global = NIL;
        global = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          print_high.print( global, stream );
          cdolist_list_var = cdolist_list_var.rest();
          global = cdolist_list_var.first();
        }
      }
      final SubLObject referenced_functions = ts_file_all_referenced_functions( ts_file );
      if( NIL != referenced_functions )
      {
        PrintLow.format( stream, $str85$_______Referenced_Functions__ );
        SubLObject cdolist_list_var = referenced_functions;
        SubLObject function = NIL;
        function = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          print_high.print( function, stream );
          cdolist_list_var = cdolist_list_var.rest();
          function = cdolist_list_var.first();
        }
      }
      final SubLObject internal_constant_info = ts_file_internal_constants_info( ts_file );
      if( NIL != internal_constant_info )
      {
        PrintLow.format( stream, $str86$_______Internal_Constants__ );
        SubLObject cdolist_list_var = internal_constant_info;
        SubLObject cons = NIL;
        cons = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          SubLObject current;
          final SubLObject datum = current = cons;
          SubLObject constant = NIL;
          SubLObject internal_id = NIL;
          cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list87 );
          constant = current.first();
          current = ( internal_id = current.rest() );
          PrintLow.format( stream, $str88$___S____S, internal_id, constant );
          cdolist_list_var = cdolist_list_var.rest();
          cons = cdolist_list_var.first();
        }
      }
      final SubLObject definitions = tsf_definitions( ts_file );
      if( NIL != definitions )
      {
        PrintLow.format( stream, $str89$_______Definitions__ );
      }
      SubLObject cdolist_list_var = definitions;
      SubLObject definition = NIL;
      definition = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        streams_high.terpri( UNPROVIDED );
        print_subl_expression( definition, stream, UNPROVIDED );
        cdolist_list_var = cdolist_list_var.rest();
        definition = cdolist_list_var.first();
      }
    }
    finally
    {
      reader.$read_default_float_format$.rebind( _prev_bind_2, thread );
      print_high.$print_case$.rebind( _prev_bind_0, thread );
    }
    return ts_file;
  }

  @SubLTranslatedFile.SubL(source = "cycl/file-translation.lisp", position = 13790L)
  public static SubLObject print_subl_expression(final SubLObject form, SubLObject stream, SubLObject depth)
  {
    if( stream == UNPROVIDED )
    {
      stream = StreamsLow.$standard_output$.getDynamicValue();
    }
    if( depth == UNPROVIDED )
    {
      depth = ZERO_INTEGER;
    }
    return format_cycl_expression.format_cycl_expression( form, stream, depth );
  }

  @SubLTranslatedFile.SubL(source = "cycl/file-translation.lisp", position = 13937L)
  public static SubLObject function_signature_info(final SubLObject function_symbol)
  {
    return function_arglist_signature_info( subl_promotions.function_symbol_arglist( function_symbol ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/file-translation.lisp", position = 14084L)
  public static SubLObject function_arglist_signature_info(final SubLObject arglist)
  {
    final SubLObject optional_position = Sequences.position( $sym90$_OPTIONAL, arglist, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    final SubLObject rest_position = Sequences.position( $sym91$_REST, arglist, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    if( NIL != optional_position )
    {
      if( NIL != rest_position )
      {
        return Values.values( optional_position, Numbers.subtract( rest_position, optional_position, ONE_INTEGER ), T );
      }
      return Values.values( optional_position, Numbers.subtract( Sequences.length( arglist ), optional_position, ONE_INTEGER ), NIL );
    }
    else
    {
      if( NIL != rest_position )
      {
        return Values.values( rest_position, ZERO_INTEGER, T );
      }
      return Values.values( Sequences.length( arglist ), ZERO_INTEGER, NIL );
    }
  }

  @SubLTranslatedFile.SubL(source = "cycl/file-translation.lisp", position = 14587L)
  public static SubLObject tsf_possibly_convert_internal_constant(final SubLObject constant_form)
  {
    final SubLObject ts_file = current_ts_file();
    if( NIL != predefined_constant_p( constant_form ) )
    {
      return ConsesLow.list( $sym92$_PC, constant_form );
    }
    if( NIL == ts_file )
    {
      return translate_constant_initialization_form( constant_form );
    }
    final SubLObject internal_id = ts_file_internal_constant_id_lookup( ts_file, constant_form );
    return ConsesLow.list( $sym93$_IC, internal_id, constant_form );
  }

  @SubLTranslatedFile.SubL(source = "cycl/file-translation.lisp", position = 15155L)
  public static SubLObject tsf_possibly_note_referenced_global(final SubLObject global)
  {
    assert NIL != Types.symbolp( global ) : global;
    final SubLObject ts_file = current_ts_file();
    if( NIL != ts_file )
    {
      set.set_add( global, tsf_referenced_globals( ts_file ) );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/file-translation.lisp", position = 15377L)
  public static SubLObject tsf_possibly_note_referenced_function(final SubLObject function)
  {
    assert NIL != Types.symbolp( function ) : function;
    final SubLObject ts_file = current_ts_file();
    if( NIL != ts_file )
    {
      set.set_add( function, tsf_referenced_functions( ts_file ) );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/file-translation.lisp", position = 15609L)
  public static SubLObject tsf_possibly_note_defined_function_arglist(final SubLObject function, final SubLObject arglist)
  {
    assert NIL != Types.symbolp( function ) : function;
    assert NIL != Types.listp( arglist ) : arglist;
    final SubLObject ts_file = current_ts_file();
    if( NIL != ts_file )
    {
      dictionary.dictionary_enter( tsf_arglist_table( ts_file ), function, arglist );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/file-translation.lisp", position = 15894L)
  public static SubLObject tsf_possibly_note_defined_global_binding_type(final SubLObject global, final SubLObject binding_type)
  {
    assert NIL != Types.symbolp( global ) : global;
    assert NIL != Types.keywordp( binding_type ) : binding_type;
    final SubLObject ts_file = current_ts_file();
    if( NIL != ts_file )
    {
      dictionary.dictionary_enter( tsf_binding_type_table( ts_file ), global, binding_type );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/file-translation.lisp", position = 16239L)
  public static SubLObject tsf_possibly_note_defined_method_visibility(final SubLObject method, final SubLObject visibility)
  {
    assert NIL != Types.symbolp( method ) : method;
    assert NIL != Types.symbolp( visibility ) : visibility;
    final SubLObject ts_file = current_ts_file();
    if( NIL != ts_file )
    {
      dictionary.dictionary_enter( tsf_method_visibility_table( ts_file ), method, visibility );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/file-translation.lisp", position = 16569L)
  public static SubLObject tsf_possibly_note_defined_global_visibility(final SubLObject global, final SubLObject visibility)
  {
    assert NIL != Types.symbolp( global ) : global;
    assert NIL != Types.symbolp( visibility ) : visibility;
    final SubLObject ts_file = current_ts_file();
    if( NIL != ts_file )
    {
      dictionary.dictionary_enter( tsf_global_visibility_table( ts_file ), global, visibility );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/file-translation.lisp", position = 16899L)
  public static SubLObject tsf_possibly_note_method_returns_within_binding_construct(final SubLObject method)
  {
    assert NIL != Types.symbolp( method ) : method;
    final SubLObject ts_file = current_ts_file();
    if( NIL != ts_file )
    {
      set.set_add( method, tsf_rwbc_methods( ts_file ) );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/file-translation.lisp", position = 17137L)
  public static SubLObject translate_file(final SubLObject module_name, final SubLObject filename)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != Types.stringp( module_name ) : module_name;
    assert NIL != Types.stringp( filename ) : filename;
    SubLObject ts_file = new_ts_file( module_name, filename );
    SubLObject stream = NIL;
    try
    {
      final SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding( thread );
      try
      {
        stream_macros.$stream_requires_locking$.bind( NIL, thread );
        stream = compatibility.open_text( filename, $kw97$INPUT );
      }
      finally
      {
        stream_macros.$stream_requires_locking$.rebind( _prev_bind_0, thread );
      }
      if( !stream.isStream() )
      {
        Errors.error( $str98$Unable_to_open__S, filename );
      }
      final SubLObject stream_$1 = stream;
      final SubLObject features = NIL;
      final SubLObject system_var = xref_database.current_xref_system();
      final SubLObject module_var = ( NIL != system_var ) ? xref_database.new_xref_module( system_var, module_name, features ) : NIL;
      final SubLObject _prev_bind_2 = xref_database.$current_xref_module$.currentBinding( thread );
      try
      {
        xref_database.$current_xref_module$.bind( module_var, thread );
        assert NIL != Types.stringp( module_name ) : module_name;
        final SubLObject _prev_bind_0_$2 = xref_database.$xref_module_scope$.currentBinding( thread );
        final SubLObject _prev_bind_3 = $current_ts_file$.currentBinding( thread );
        final SubLObject _prev_bind_4 = Packages.$package$.currentBinding( thread );
        final SubLObject _prev_bind_5 = reader.$read_default_float_format$.currentBinding( thread );
        final SubLObject _prev_bind_6 = control_vars.$read_require_constant_exists$.currentBinding( thread );
        try
        {
          xref_database.$xref_module_scope$.bind( module_name, thread );
          $current_ts_file$.bind( ts_file, thread );
          Packages.$package$.bind( control_vars.$sublisp_package$.getGlobalValue(), thread );
          reader.$read_default_float_format$.bind( $sym81$DOUBLE_FLOAT, thread );
          control_vars.$read_require_constant_exists$.bind( NIL, thread );
          SubLObject position = NIL;
          SubLObject form = NIL;
          position = streams_high.file_position( stream_$1, UNPROVIDED );
          for( form = reader.read( stream_$1, NIL, $kw99$EOF, UNPROVIDED ); form != $kw99$EOF; form = reader.read( stream_$1, NIL, $kw99$EOF, UNPROVIDED ) )
          {
            final SubLObject position_var = position;
            assert NIL != subl_promotions.non_negative_integer_p( position_var ) : position_var;
            final SubLObject _prev_bind_0_$3 = xref_database.$xref_file_position_scope$.currentBinding( thread );
            try
            {
              xref_database.$xref_file_position_scope$.bind( position_var, thread );
              ts_file_translate_form( ts_file, form );
            }
            finally
            {
              xref_database.$xref_file_position_scope$.rebind( _prev_bind_0_$3, thread );
            }
            position = streams_high.file_position( stream_$1, UNPROVIDED );
          }
          ts_file = finalize_ts_file( ts_file );
        }
        finally
        {
          control_vars.$read_require_constant_exists$.rebind( _prev_bind_6, thread );
          reader.$read_default_float_format$.rebind( _prev_bind_5, thread );
          Packages.$package$.rebind( _prev_bind_4, thread );
          $current_ts_file$.rebind( _prev_bind_3, thread );
          xref_database.$xref_module_scope$.rebind( _prev_bind_0_$2, thread );
        }
      }
      finally
      {
        xref_database.$current_xref_module$.rebind( _prev_bind_2, thread );
      }
      if( NIL != module_var )
      {
        xref_database.xrs_merge_xref_module( system_var, module_var );
      }
    }
    finally
    {
      final SubLObject _prev_bind_7 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
      try
      {
        Threads.$is_thread_performing_cleanupP$.bind( T, thread );
        final SubLObject _values = Values.getValuesAsVector();
        if( stream.isStream() )
        {
          streams_high.close( stream, UNPROVIDED );
        }
        Values.restoreValuesFromVector( _values );
      }
      finally
      {
        Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_7, thread );
      }
    }
    return ts_file;
  }

  @SubLTranslatedFile.SubL(source = "cycl/file-translation.lisp", position = 18155L)
  public static SubLObject ts_file_translate_form(final SubLObject ts_file, final SubLObject form)
  {
    final SubLObject translated_form = form_translation.translate_form( form );
    handle_file_form( ts_file, translated_form );
    return translated_form;
  }

  @SubLTranslatedFile.SubL(source = "cycl/file-translation.lisp", position = 18335L)
  public static SubLObject handle_file_form(final SubLObject ts_file, final SubLObject translated_form)
  {
    if( translated_form.isCons() )
    {
      final SubLObject operator = translated_form.first();
      if( operator == $sym101$PROGN )
      {
        SubLObject cdolist_list_var = translated_form.rest();
        SubLObject sub_form = NIL;
        sub_form = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          handle_file_form( ts_file, sub_form );
          cdolist_list_var = cdolist_list_var.rest();
          sub_form = cdolist_list_var.first();
        }
      }
      else if( operator == $sym102$DEFINE )
      {
        final SubLObject method_name = conses_high.second( translated_form );
        ts_file_note_function_definition( ts_file, method_name, translated_form );
      }
      else if( operator == $sym103$DEFINE_MACROEXPANDER )
      {
        final SubLObject method_name = conses_high.second( translated_form );
        ts_file_note_macro_definition( ts_file, method_name, translated_form );
      }
      else if( operator == $sym104$DEFVAR || operator == $sym105$DEFPARAMETER || operator == $sym106$DEFLEXICAL || operator == $sym107$DEFCONSTANT )
      {
        final SubLObject global_name = conses_high.second( translated_form );
        ts_file_note_global_definition( ts_file, global_name, translated_form );
      }
      else if( operator == $sym108$_DEFSTRUCT_CLASS )
      {
        final SubLObject structure_name = conses_high.getf( translated_form.rest(), $kw109$NAME, UNPROVIDED );
        ts_file_note_class_definition( ts_file, structure_name, translated_form );
      }
      else if( operator == $sym110$IN_PACKAGE )
      {
        final SubLObject package_name = conses_high.second( translated_form );
        Packages.$package$.setDynamicValue( Packages.find_package( package_name ) );
      }
      else
      {
        ts_file_note_top_level_form( ts_file, translated_form );
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/file-translation.lisp", position = 19638L)
  public static SubLObject finalize_ts_file(final SubLObject ts_file)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    _csetf_tsf_definitions( ts_file, Sequences.nreverse( tsf_definitions( ts_file ) ) );
    _csetf_tsf_top_level_forms( ts_file, Sequences.nreverse( tsf_top_level_forms( ts_file ) ) );
    _csetf_tsf_defined_globals( ts_file, Sequences.nreverse( tsf_defined_globals( ts_file ) ) );
    _csetf_tsf_defined_functions( ts_file, Sequences.nreverse( tsf_defined_functions( ts_file ) ) );
    _csetf_tsf_defined_macros( ts_file, Sequences.nreverse( tsf_defined_macros( ts_file ) ) );
    thread.resetMultipleValues();
    final SubLObject file_declare = ts_file_compute_initialization_methods( ts_file );
    final SubLObject file_init = thread.secondMultipleValue();
    final SubLObject file_setup = thread.thirdMultipleValue();
    thread.resetMultipleValues();
    final SubLObject file_declare_function = conses_high.second( file_declare );
    final SubLObject file_init_function = conses_high.second( file_init );
    final SubLObject file_setup_function = conses_high.second( file_setup );
    _csetf_tsf_definitions( ts_file, ConsesLow.nconc( tsf_definitions( ts_file ), ConsesLow.list( file_declare, file_init, file_setup ) ) );
    _csetf_tsf_defined_functions( ts_file, ConsesLow.nconc( tsf_defined_functions( ts_file ), ConsesLow.list( file_declare_function, file_init_function, file_setup_function ) ) );
    system_translation.sys_tran_possibly_note_module_initialization_methods( tsf_module_name( ts_file ), file_declare_function, file_init_function, file_setup_function );
    return ts_file;
  }

  @SubLTranslatedFile.SubL(source = "cycl/file-translation.lisp", position = 20914L)
  public static SubLObject ts_file_compute_initialization_methods(final SubLObject ts_file)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject file_declare = NIL;
    SubLObject file_init = NIL;
    SubLObject file_setup = NIL;
    final SubLObject module_name = tsf_module_name( ts_file );
    SubLObject declare_forms = NIL;
    SubLObject init_forms = NIL;
    SubLObject cdolist_list_var = ts_file_internal_constants_info( ts_file );
    SubLObject cons = NIL;
    cons = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject current;
      final SubLObject datum = current = cons;
      SubLObject constant_form = NIL;
      SubLObject internal_id = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list111 );
      constant_form = current.first();
      current = ( internal_id = current.rest() );
      final SubLObject initialization_form = translate_constant_initialization_form( constant_form );
      init_forms = ConsesLow.cons( ConsesLow.list( $sym112$_INTERNAL_CONSTANT, internal_id, constant_form, initialization_form ), init_forms );
      cdolist_list_var = cdolist_list_var.rest();
      cons = cdolist_list_var.first();
    }
    cdolist_list_var = tsf_definitions( ts_file );
    SubLObject definition = NIL;
    definition = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject current;
      final SubLObject datum = current = definition;
      SubLObject operator = NIL;
      SubLObject name = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list113 );
      operator = current.first();
      current = current.rest();
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list113 );
      name = current.first();
      final SubLObject rest;
      current = ( rest = current.rest() );
      if( operator == $sym103$DEFINE_MACROEXPANDER )
      {
        declare_forms = ConsesLow.cons( ConsesLow.list( $sym114$_REGISTER_MACRO, name ), declare_forms );
      }
      else if( operator == $sym102$DEFINE )
      {
        SubLObject current_$5;
        final SubLObject datum_$4 = current_$5 = rest;
        SubLObject arglist = NIL;
        cdestructuring_bind.destructuring_bind_must_consp( current_$5, datum_$4, $list115 );
        arglist = current_$5.first();
        final SubLObject body;
        current_$5 = ( body = current_$5.rest() );
        thread.resetMultipleValues();
        final SubLObject required_count = function_arglist_signature_info( arglist );
        final SubLObject optional_count = thread.secondMultipleValue();
        final SubLObject restP = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        declare_forms = ConsesLow.cons( ConsesLow.list( $sym116$_REGISTER_FUNCTION, name, required_count, optional_count, restP ), declare_forms );
      }
      else if( operator == $sym104$DEFVAR || operator == $sym105$DEFPARAMETER || operator == $sym106$DEFLEXICAL || operator == $sym107$DEFCONSTANT )
      {
        SubLObject current_$6;
        final SubLObject datum_$5 = current_$6 = rest;
        SubLObject initialization = NIL;
        cdestructuring_bind.destructuring_bind_must_consp( current_$6, datum_$5, $list117 );
        initialization = current_$6.first();
        current_$6 = current_$6.rest();
        final SubLObject documentation = current_$6.isCons() ? current_$6.first() : NIL;
        cdestructuring_bind.destructuring_bind_must_listp( current_$6, datum_$5, $list117 );
        current_$6 = current_$6.rest();
        if( NIL == current_$6 )
        {
          init_forms = ConsesLow.cons( ConsesLow.list( $sym118$_REGISTER_GLOBAL, operator, name, initialization ), init_forms );
        }
        else
        {
          cdestructuring_bind.cdestructuring_bind_error( datum_$5, $list117 );
        }
      }
      cdolist_list_var = cdolist_list_var.rest();
      definition = cdolist_list_var.first();
    }
    final SubLObject file_declare_name = Sequences.cconcatenate( $str119$DECLARE_, new SubLObject[] { format_nil.format_nil_a_no_copy( module_name ), $str120$_FILE
    } );
    final SubLObject file_declare_function = Packages.intern( file_declare_name, Packages.$package$.getDynamicValue( thread ) );
    tsf_possibly_note_defined_function_arglist( file_declare_function, NIL );
    file_declare = ConsesLow.listS( $sym102$DEFINE, file_declare_function, NIL, ConsesLow.append( Sequences.nreverse( declare_forms ), ConsesLow.list( ConsesLow.list( $sym121$RET, form_translation.translate_form(
        NIL ) ) ) ) );
    final SubLObject file_init_name = Sequences.cconcatenate( $str122$INIT_, new SubLObject[] { format_nil.format_nil_a_no_copy( module_name ), $str120$_FILE
    } );
    final SubLObject file_init_function = Packages.intern( file_init_name, Packages.$package$.getDynamicValue( thread ) );
    tsf_possibly_note_defined_function_arglist( file_init_function, NIL );
    file_init = ConsesLow.listS( $sym102$DEFINE, file_init_function, NIL, ConsesLow.append( Sequences.nreverse( init_forms ), ConsesLow.list( ConsesLow.list( $sym121$RET, form_translation.translate_form( NIL ) ) ) ) );
    final SubLObject file_setup_name = Sequences.cconcatenate( $str123$SETUP_, new SubLObject[] { format_nil.format_nil_a_no_copy( module_name ), $str120$_FILE
    } );
    final SubLObject file_setup_function = Packages.intern( file_setup_name, Packages.$package$.getDynamicValue( thread ) );
    tsf_possibly_note_defined_function_arglist( file_setup_function, NIL );
    file_setup = ConsesLow.listS( $sym102$DEFINE, file_setup_function, NIL, ConsesLow.append( tsf_top_level_forms( ts_file ), ConsesLow.list( ConsesLow.list( $sym121$RET, form_translation.translate_form( NIL ) ) ) ) );
    return Values.values( file_declare, file_init, file_setup );
  }

  @SubLTranslatedFile.SubL(source = "cycl/file-translation.lisp", position = 23335L)
  public static SubLObject ts_file_declare_method(final SubLObject ts_file)
  {
    final SubLObject sys_tran = system_translation.current_system_translation();
    if( NIL != sys_tran )
    {
      final SubLObject module = ts_file_module_name( ts_file );
      return system_translation.sys_tran_module_declare_function( sys_tran, module );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/file-translation.lisp", position = 23662L)
  public static SubLObject ts_file_init_method(final SubLObject ts_file)
  {
    final SubLObject sys_tran = system_translation.current_system_translation();
    if( NIL != sys_tran )
    {
      final SubLObject module = ts_file_module_name( ts_file );
      return system_translation.sys_tran_module_init_function( sys_tran, module );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/file-translation.lisp", position = 23983L)
  public static SubLObject ts_file_setup_method(final SubLObject ts_file)
  {
    final SubLObject sys_tran = system_translation.current_system_translation();
    if( NIL != sys_tran )
    {
      final SubLObject module = ts_file_module_name( ts_file );
      return system_translation.sys_tran_module_setup_function( sys_tran, module );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/file-translation.lisp", position = 24306L)
  public static SubLObject current_ts_file_initializerP(final SubLObject method)
  {
    if( method.isSymbol() )
    {
      final SubLObject ts_file = current_ts_file();
      return makeBoolean( NIL != ts_file && ( method.eql( ts_file_declare_method( ts_file ) ) || method.eql( ts_file_init_method( ts_file ) ) || method.eql( ts_file_setup_method( ts_file ) ) ) );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/file-translation.lisp", position = 24619L)
  public static SubLObject translate_constant_initialization_form(SubLObject v_object)
  {
    if( v_object.isVector() )
    {
      SubLObject translated_items = NIL;
      final SubLObject vector_var = v_object;
      final SubLObject backwardP_var = NIL;
      SubLObject length;
      SubLObject v_iteration;
      SubLObject element_num;
      SubLObject item;
      for( length = Sequences.length( vector_var ), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL( length ); v_iteration = Numbers.add( v_iteration, ONE_INTEGER ) )
      {
        element_num = ( ( NIL != backwardP_var ) ? Numbers.subtract( length, v_iteration, ONE_INTEGER ) : v_iteration );
        item = Vectors.aref( vector_var, element_num );
        translated_items = ConsesLow.cons( translate_constant_initialization_form( item ), translated_items );
      }
      return reader.bq_cons( $sym124$VECTOR, ConsesLow.append( Sequences.nreverse( translated_items ), NIL ) );
    }
    if( v_object.isCons() )
    {
      SubLObject translated_items = NIL;
      SubLObject translated_final_cdr = NIL;
      SubLObject pair;
      SubLObject item2;
      for( pair = NIL, pair = v_object; !pair.isAtom(); pair = pair.rest() )
      {
        item2 = pair.first();
        translated_items = ConsesLow.cons( translate_constant_initialization_form( item2 ), translated_items );
      }
      if( NIL != list_utilities.dotted_list_p( v_object ) )
      {
        translated_final_cdr = translate_constant_initialization_form( conses_high.last( v_object, UNPROVIDED ).rest() );
      }
      if( NIL == translated_final_cdr )
      {
        return reader.bq_cons( $sym125$LIST, ConsesLow.append( Sequences.nreverse( translated_items ), NIL ) );
      }
      if( NIL != list_utilities.singletonP( translated_items ) )
      {
        return ConsesLow.list( $sym126$CONS, translated_items.first(), translated_final_cdr );
      }
      return reader.bq_cons( $sym127$LIST_, ConsesLow.append( Sequences.nreverse( translated_items ), ConsesLow.list( translated_final_cdr ) ) );
    }
    else
    {
      if( NIL != predefined_constant_p( v_object ) )
      {
        return ConsesLow.list( $sym92$_PC, v_object );
      }
      if( v_object.isFunction() )
      {
        final SubLObject symbol = translator_symbol_for_function( v_object );
        final SubLObject translated_symbol = translate_constant_initialization_form( symbol );
        return ConsesLow.list( $sym128$SYMBOL_FUNCTION, translated_symbol );
      }
      if( NIL != constant_handles.constant_p( v_object ) )
      {
        final SubLObject name = constants_high.constant_name( v_object );
        tsf_possibly_note_referenced_function( $sym129$READER_MAKE_CONSTANT_SHELL );
        return ConsesLow.list( $sym129$READER_MAKE_CONSTANT_SHELL, translate_constant_initialization_form( name ) );
      }
      v_object = form_translation.possibly_translate_implementation_symbols( v_object );
      return ConsesLow.list( $sym130$_LF, v_object );
    }
  }

  @SubLTranslatedFile.SubL(source = "cycl/file-translation.lisp", position = 26133L)
  public static SubLObject translator_symbol_for_function(final SubLObject v_object)
  {
    if( v_object.eql( Symbols.symbol_function( EQ ) ) )
    {
      return EQ;
    }
    if( v_object.eql( Symbols.symbol_function( EQL ) ) )
    {
      return EQL;
    }
    if( v_object.eql( Symbols.symbol_function( EQUAL ) ) )
    {
      return EQUAL;
    }
    if( v_object.eql( Symbols.symbol_function( EQUALP ) ) )
    {
      return EQUALP;
    }
    return Errors.error( $str131$Time_to_implement_function_consta, v_object );
  }

  @SubLTranslatedFile.SubL(source = "cycl/file-translation.lisp", position = 27445L)
  public static SubLObject predefined_constant_p(final SubLObject v_object)
  {
    return list_utilities.member_eqP( v_object, $predefined_constants$.getGlobalValue() );
  }

  public static SubLObject declare_file_translation_file()
  {
    SubLFiles.declareFunction( me, "current_ts_file", "CURRENT-TS-FILE", 0, 0, false );
    SubLFiles.declareFunction( me, "trans_subl_file_print_function_trampoline", "TRANS-SUBL-FILE-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false );
    SubLFiles.declareFunction( me, "trans_subl_file_p", "TRANS-SUBL-FILE-P", 1, 0, false );
    new $trans_subl_file_p$UnaryFunction();
    SubLFiles.declareFunction( me, "tsf_module_name", "TSF-MODULE-NAME", 1, 0, false );
    SubLFiles.declareFunction( me, "tsf_filename", "TSF-FILENAME", 1, 0, false );
    SubLFiles.declareFunction( me, "tsf_internal_constants", "TSF-INTERNAL-CONSTANTS", 1, 0, false );
    SubLFiles.declareFunction( me, "tsf_referenced_globals", "TSF-REFERENCED-GLOBALS", 1, 0, false );
    SubLFiles.declareFunction( me, "tsf_referenced_functions", "TSF-REFERENCED-FUNCTIONS", 1, 0, false );
    SubLFiles.declareFunction( me, "tsf_definitions", "TSF-DEFINITIONS", 1, 0, false );
    SubLFiles.declareFunction( me, "tsf_top_level_forms", "TSF-TOP-LEVEL-FORMS", 1, 0, false );
    SubLFiles.declareFunction( me, "tsf_defined_globals", "TSF-DEFINED-GLOBALS", 1, 0, false );
    SubLFiles.declareFunction( me, "tsf_defined_functions", "TSF-DEFINED-FUNCTIONS", 1, 0, false );
    SubLFiles.declareFunction( me, "tsf_defined_macros", "TSF-DEFINED-MACROS", 1, 0, false );
    SubLFiles.declareFunction( me, "tsf_arglist_table", "TSF-ARGLIST-TABLE", 1, 0, false );
    SubLFiles.declareFunction( me, "tsf_binding_type_table", "TSF-BINDING-TYPE-TABLE", 1, 0, false );
    SubLFiles.declareFunction( me, "tsf_method_visibility_table", "TSF-METHOD-VISIBILITY-TABLE", 1, 0, false );
    SubLFiles.declareFunction( me, "tsf_global_visibility_table", "TSF-GLOBAL-VISIBILITY-TABLE", 1, 0, false );
    SubLFiles.declareFunction( me, "tsf_rwbc_methods", "TSF-RWBC-METHODS", 1, 0, false );
    SubLFiles.declareFunction( me, "_csetf_tsf_module_name", "_CSETF-TSF-MODULE-NAME", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_tsf_filename", "_CSETF-TSF-FILENAME", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_tsf_internal_constants", "_CSETF-TSF-INTERNAL-CONSTANTS", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_tsf_referenced_globals", "_CSETF-TSF-REFERENCED-GLOBALS", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_tsf_referenced_functions", "_CSETF-TSF-REFERENCED-FUNCTIONS", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_tsf_definitions", "_CSETF-TSF-DEFINITIONS", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_tsf_top_level_forms", "_CSETF-TSF-TOP-LEVEL-FORMS", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_tsf_defined_globals", "_CSETF-TSF-DEFINED-GLOBALS", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_tsf_defined_functions", "_CSETF-TSF-DEFINED-FUNCTIONS", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_tsf_defined_macros", "_CSETF-TSF-DEFINED-MACROS", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_tsf_arglist_table", "_CSETF-TSF-ARGLIST-TABLE", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_tsf_binding_type_table", "_CSETF-TSF-BINDING-TYPE-TABLE", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_tsf_method_visibility_table", "_CSETF-TSF-METHOD-VISIBILITY-TABLE", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_tsf_global_visibility_table", "_CSETF-TSF-GLOBAL-VISIBILITY-TABLE", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_tsf_rwbc_methods", "_CSETF-TSF-RWBC-METHODS", 2, 0, false );
    SubLFiles.declareFunction( me, "make_trans_subl_file", "MAKE-TRANS-SUBL-FILE", 0, 1, false );
    SubLFiles.declareFunction( me, "visit_defstruct_trans_subl_file", "VISIT-DEFSTRUCT-TRANS-SUBL-FILE", 2, 0, false );
    SubLFiles.declareFunction( me, "visit_defstruct_object_trans_subl_file_method", "VISIT-DEFSTRUCT-OBJECT-TRANS-SUBL-FILE-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "print_trans_subl_file", "PRINT-TRANS-SUBL-FILE", 3, 0, false );
    SubLFiles.declareFunction( me, "sxhash_trans_subl_file_method", "SXHASH-TRANS-SUBL-FILE-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "new_ts_file", "NEW-TS-FILE", 2, 0, false );
    SubLFiles.declareFunction( me, "destroy_trans_subl_file", "DESTROY-TRANS-SUBL-FILE", 1, 0, false );
    SubLFiles.declareFunction( me, "ts_file_module_name", "TS-FILE-MODULE-NAME", 1, 0, false );
    SubLFiles.declareFunction( me, "ts_file_filename", "TS-FILE-FILENAME", 1, 0, false );
    SubLFiles.declareFunction( me, "ts_file_definitions", "TS-FILE-DEFINITIONS", 1, 0, false );
    SubLFiles.declareFunction( me, "ts_file_internal_constant_count", "TS-FILE-INTERNAL-CONSTANT-COUNT", 1, 0, false );
    SubLFiles.declareFunction( me, "ts_file_next_internal_constant_id", "TS-FILE-NEXT-INTERNAL-CONSTANT-ID", 1, 0, false );
    SubLFiles.declareFunction( me, "ts_file_internal_constants_info", "TS-FILE-INTERNAL-CONSTANTS-INFO", 1, 0, false );
    SubLFiles.declareFunction( me, "ts_file_all_referenced_globals", "TS-FILE-ALL-REFERENCED-GLOBALS", 1, 0, false );
    SubLFiles.declareFunction( me, "ts_file_all_defined_globals", "TS-FILE-ALL-DEFINED-GLOBALS", 1, 0, false );
    SubLFiles.declareFunction( me, "ts_file_all_referenced_functions", "TS-FILE-ALL-REFERENCED-FUNCTIONS", 1, 0, false );
    SubLFiles.declareFunction( me, "ts_file_all_defined_functions", "TS-FILE-ALL-DEFINED-FUNCTIONS", 1, 0, false );
    SubLFiles.declareFunction( me, "ts_file_all_defined_private_functions", "TS-FILE-ALL-DEFINED-PRIVATE-FUNCTIONS", 1, 0, false );
    SubLFiles.declareFunction( me, "ts_file_function_arglist", "TS-FILE-FUNCTION-ARGLIST", 2, 0, false );
    SubLFiles.declareFunction( me, "current_ts_file_defined_function_arglist", "CURRENT-TS-FILE-DEFINED-FUNCTION-ARGLIST", 1, 0, false );
    SubLFiles.declareFunction( me, "ts_file_defined_global_binding_type", "TS-FILE-DEFINED-GLOBAL-BINDING-TYPE", 2, 0, false );
    SubLFiles.declareFunction( me, "ts_file_global_binding_type", "TS-FILE-GLOBAL-BINDING-TYPE", 2, 0, false );
    SubLFiles.declareFunction( me, "current_ts_file_global_binding_type", "CURRENT-TS-FILE-GLOBAL-BINDING-TYPE", 1, 0, false );
    SubLFiles.declareFunction( me, "ts_file_defined_method_visibility", "TS-FILE-DEFINED-METHOD-VISIBILITY", 2, 0, false );
    SubLFiles.declareFunction( me, "ts_file_defined_private_method_p", "TS-FILE-DEFINED-PRIVATE-METHOD-P", 2, 0, false );
    SubLFiles.declareFunction( me, "current_ts_file_defined_private_method_p", "CURRENT-TS-FILE-DEFINED-PRIVATE-METHOD-P", 1, 0, false );
    SubLFiles.declareFunction( me, "ts_file_defined_global_visibility", "TS-FILE-DEFINED-GLOBAL-VISIBILITY", 2, 0, false );
    SubLFiles.declareFunction( me, "ts_file_defined_private_global_p", "TS-FILE-DEFINED-PRIVATE-GLOBAL-P", 2, 0, false );
    SubLFiles.declareFunction( me, "current_ts_file_defined_private_global_p", "CURRENT-TS-FILE-DEFINED-PRIVATE-GLOBAL-P", 1, 0, false );
    SubLFiles.declareFunction( me, "ts_file_private_global_definition_p", "TS-FILE-PRIVATE-GLOBAL-DEFINITION-P", 2, 0, false );
    SubLFiles.declareFunction( me, "ts_file_private_global_definitions", "TS-FILE-PRIVATE-GLOBAL-DEFINITIONS", 1, 0, false );
    SubLFiles.declareFunction( me, "ts_file_method_returns_within_binding_constructP", "TS-FILE-METHOD-RETURNS-WITHIN-BINDING-CONSTRUCT?", 2, 0, false );
    SubLFiles.declareFunction( me, "ts_file_internal_constant_id_lookup", "TS-FILE-INTERNAL-CONSTANT-ID-LOOKUP", 2, 0, false );
    SubLFiles.declareFunction( me, "ts_file_note_function_definition", "TS-FILE-NOTE-FUNCTION-DEFINITION", 3, 0, false );
    SubLFiles.declareFunction( me, "ts_file_note_macro_definition", "TS-FILE-NOTE-MACRO-DEFINITION", 3, 0, false );
    SubLFiles.declareFunction( me, "ts_file_note_global_definition", "TS-FILE-NOTE-GLOBAL-DEFINITION", 3, 0, false );
    SubLFiles.declareFunction( me, "ts_file_note_class_definition", "TS-FILE-NOTE-CLASS-DEFINITION", 3, 0, false );
    SubLFiles.declareFunction( me, "ts_file_note_top_level_form", "TS-FILE-NOTE-TOP-LEVEL-FORM", 2, 0, false );
    SubLFiles.declareMacro( me, "with_translator_output_file", "WITH-TRANSLATOR-OUTPUT-FILE" );
    SubLFiles.declareFunction( me, "possibly_delete_file", "POSSIBLY-DELETE-FILE", 1, 0, false );
    SubLFiles.declareFunction( me, "show_trans_subl_file", "SHOW-TRANS-SUBL-FILE", 1, 1, false );
    SubLFiles.declareFunction( me, "print_subl_expression", "PRINT-SUBL-EXPRESSION", 1, 2, false );
    SubLFiles.declareFunction( me, "function_signature_info", "FUNCTION-SIGNATURE-INFO", 1, 0, false );
    SubLFiles.declareFunction( me, "function_arglist_signature_info", "FUNCTION-ARGLIST-SIGNATURE-INFO", 1, 0, false );
    SubLFiles.declareFunction( me, "tsf_possibly_convert_internal_constant", "TSF-POSSIBLY-CONVERT-INTERNAL-CONSTANT", 1, 0, false );
    SubLFiles.declareFunction( me, "tsf_possibly_note_referenced_global", "TSF-POSSIBLY-NOTE-REFERENCED-GLOBAL", 1, 0, false );
    SubLFiles.declareFunction( me, "tsf_possibly_note_referenced_function", "TSF-POSSIBLY-NOTE-REFERENCED-FUNCTION", 1, 0, false );
    SubLFiles.declareFunction( me, "tsf_possibly_note_defined_function_arglist", "TSF-POSSIBLY-NOTE-DEFINED-FUNCTION-ARGLIST", 2, 0, false );
    SubLFiles.declareFunction( me, "tsf_possibly_note_defined_global_binding_type", "TSF-POSSIBLY-NOTE-DEFINED-GLOBAL-BINDING-TYPE", 2, 0, false );
    SubLFiles.declareFunction( me, "tsf_possibly_note_defined_method_visibility", "TSF-POSSIBLY-NOTE-DEFINED-METHOD-VISIBILITY", 2, 0, false );
    SubLFiles.declareFunction( me, "tsf_possibly_note_defined_global_visibility", "TSF-POSSIBLY-NOTE-DEFINED-GLOBAL-VISIBILITY", 2, 0, false );
    SubLFiles.declareFunction( me, "tsf_possibly_note_method_returns_within_binding_construct", "TSF-POSSIBLY-NOTE-METHOD-RETURNS-WITHIN-BINDING-CONSTRUCT", 1, 0, false );
    SubLFiles.declareFunction( me, "translate_file", "TRANSLATE-FILE", 2, 0, false );
    SubLFiles.declareFunction( me, "ts_file_translate_form", "TS-FILE-TRANSLATE-FORM", 2, 0, false );
    SubLFiles.declareFunction( me, "handle_file_form", "HANDLE-FILE-FORM", 2, 0, false );
    SubLFiles.declareFunction( me, "finalize_ts_file", "FINALIZE-TS-FILE", 1, 0, false );
    SubLFiles.declareFunction( me, "ts_file_compute_initialization_methods", "TS-FILE-COMPUTE-INITIALIZATION-METHODS", 1, 0, false );
    SubLFiles.declareFunction( me, "ts_file_declare_method", "TS-FILE-DECLARE-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "ts_file_init_method", "TS-FILE-INIT-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "ts_file_setup_method", "TS-FILE-SETUP-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "current_ts_file_initializerP", "CURRENT-TS-FILE-INITIALIZER?", 1, 0, false );
    SubLFiles.declareFunction( me, "translate_constant_initialization_form", "TRANSLATE-CONSTANT-INITIALIZATION-FORM", 1, 0, false );
    SubLFiles.declareFunction( me, "translator_symbol_for_function", "TRANSLATOR-SYMBOL-FOR-FUNCTION", 1, 0, false );
    SubLFiles.declareFunction( me, "predefined_constant_p", "PREDEFINED-CONSTANT-P", 1, 0, false );
    return NIL;
  }

  public static SubLObject init_file_translation_file()
  {
    $current_ts_file$ = SubLFiles.defparameter( "*CURRENT-TS-FILE*", NIL );
    $dtp_trans_subl_file$ = SubLFiles.defconstant( "*DTP-TRANS-SUBL-FILE*", $sym0$TRANS_SUBL_FILE );
    $trans_subl_global_definers$ = SubLFiles.deflexical( "*TRANS-SUBL-GLOBAL-DEFINERS*", $list70 );
    $predefined_constants$ = SubLFiles.deflexical( "*PREDEFINED-CONSTANTS*", $list132 );
    return NIL;
  }

  public static SubLObject setup_file_translation_file()
  {
    Structures.register_method( print_high.$print_object_method_table$.getGlobalValue(), $dtp_trans_subl_file$.getGlobalValue(), Symbols.symbol_function( $sym7$TRANS_SUBL_FILE_PRINT_FUNCTION_TRAMPOLINE ) );
    SubLSpecialOperatorDeclarations.proclaim( $list8 );
    Structures.def_csetf( $sym9$TSF_MODULE_NAME, $sym10$_CSETF_TSF_MODULE_NAME );
    Structures.def_csetf( $sym11$TSF_FILENAME, $sym12$_CSETF_TSF_FILENAME );
    Structures.def_csetf( $sym13$TSF_INTERNAL_CONSTANTS, $sym14$_CSETF_TSF_INTERNAL_CONSTANTS );
    Structures.def_csetf( $sym15$TSF_REFERENCED_GLOBALS, $sym16$_CSETF_TSF_REFERENCED_GLOBALS );
    Structures.def_csetf( $sym17$TSF_REFERENCED_FUNCTIONS, $sym18$_CSETF_TSF_REFERENCED_FUNCTIONS );
    Structures.def_csetf( $sym19$TSF_DEFINITIONS, $sym20$_CSETF_TSF_DEFINITIONS );
    Structures.def_csetf( $sym21$TSF_TOP_LEVEL_FORMS, $sym22$_CSETF_TSF_TOP_LEVEL_FORMS );
    Structures.def_csetf( $sym23$TSF_DEFINED_GLOBALS, $sym24$_CSETF_TSF_DEFINED_GLOBALS );
    Structures.def_csetf( $sym25$TSF_DEFINED_FUNCTIONS, $sym26$_CSETF_TSF_DEFINED_FUNCTIONS );
    Structures.def_csetf( $sym27$TSF_DEFINED_MACROS, $sym28$_CSETF_TSF_DEFINED_MACROS );
    Structures.def_csetf( $sym29$TSF_ARGLIST_TABLE, $sym30$_CSETF_TSF_ARGLIST_TABLE );
    Structures.def_csetf( $sym31$TSF_BINDING_TYPE_TABLE, $sym32$_CSETF_TSF_BINDING_TYPE_TABLE );
    Structures.def_csetf( $sym33$TSF_METHOD_VISIBILITY_TABLE, $sym34$_CSETF_TSF_METHOD_VISIBILITY_TABLE );
    Structures.def_csetf( $sym35$TSF_GLOBAL_VISIBILITY_TABLE, $sym36$_CSETF_TSF_GLOBAL_VISIBILITY_TABLE );
    Structures.def_csetf( $sym37$TSF_RWBC_METHODS, $sym38$_CSETF_TSF_RWBC_METHODS );
    Equality.identity( $sym0$TRANS_SUBL_FILE );
    Structures.register_method( visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_trans_subl_file$.getGlobalValue(), Symbols.symbol_function(
        $sym59$VISIT_DEFSTRUCT_OBJECT_TRANS_SUBL_FILE_METHOD ) );
    Structures.register_method( Sxhash.$sxhash_method_table$.getGlobalValue(), $dtp_trans_subl_file$.getGlobalValue(), Symbols.symbol_function( $sym60$SXHASH_TRANS_SUBL_FILE_METHOD ) );
    generic_testing.define_test_case_table_int( $sym133$FUNCTION_ARGLIST_SIGNATURE_INFO, ConsesLow.list( new SubLObject[] { $kw134$TEST, Symbols.symbol_function( EQ ), $kw135$OWNER, NIL, $kw136$CLASSES, NIL, $kw137$KB,
      $kw138$TINY, $kw139$WORKING_, T
    } ), $list140 );
    generic_testing.define_test_case_table_int( $sym141$TRANSLATE_CONSTANT_INITIALIZATION_FORM, ConsesLow.list( new SubLObject[] { $kw134$TEST, Symbols.symbol_function( EQUAL ), $kw135$OWNER, NIL, $kw136$CLASSES, NIL,
      $kw137$KB, $kw138$TINY, $kw139$WORKING_, T
    } ), $list142 );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_file_translation_file();
  }

  @Override
  public void initializeVariables()
  {
    init_file_translation_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_file_translation_file();
  }
  static
  {
    me = new file_translation();
    $current_ts_file$ = null;
    $dtp_trans_subl_file$ = null;
    $trans_subl_global_definers$ = null;
    $predefined_constants$ = null;
    $sym0$TRANS_SUBL_FILE = makeSymbol( "TRANS-SUBL-FILE" );
    $sym1$TRANS_SUBL_FILE_P = makeSymbol( "TRANS-SUBL-FILE-P" );
    $list2 = ConsesLow.list( new SubLObject[] { makeSymbol( "MODULE-NAME" ), makeSymbol( "FILENAME" ), makeSymbol( "INTERNAL-CONSTANTS" ), makeSymbol( "REFERENCED-GLOBALS" ), makeSymbol( "REFERENCED-FUNCTIONS" ),
      makeSymbol( "DEFINITIONS" ), makeSymbol( "TOP-LEVEL-FORMS" ), makeSymbol( "DEFINED-GLOBALS" ), makeSymbol( "DEFINED-FUNCTIONS" ), makeSymbol( "DEFINED-MACROS" ), makeSymbol( "ARGLIST-TABLE" ), makeSymbol(
          "BINDING-TYPE-TABLE" ), makeSymbol( "METHOD-VISIBILITY-TABLE" ), makeSymbol( "GLOBAL-VISIBILITY-TABLE" ), makeSymbol( "RWBC-METHODS" )
    } );
    $list3 = ConsesLow.list( new SubLObject[] { makeKeyword( "MODULE-NAME" ), makeKeyword( "FILENAME" ), makeKeyword( "INTERNAL-CONSTANTS" ), makeKeyword( "REFERENCED-GLOBALS" ), makeKeyword( "REFERENCED-FUNCTIONS" ),
      makeKeyword( "DEFINITIONS" ), makeKeyword( "TOP-LEVEL-FORMS" ), makeKeyword( "DEFINED-GLOBALS" ), makeKeyword( "DEFINED-FUNCTIONS" ), makeKeyword( "DEFINED-MACROS" ), makeKeyword( "ARGLIST-TABLE" ), makeKeyword(
          "BINDING-TYPE-TABLE" ), makeKeyword( "METHOD-VISIBILITY-TABLE" ), makeKeyword( "GLOBAL-VISIBILITY-TABLE" ), makeKeyword( "RWBC-METHODS" )
    } );
    $list4 = ConsesLow.list( new SubLObject[] { makeSymbol( "TSF-MODULE-NAME" ), makeSymbol( "TSF-FILENAME" ), makeSymbol( "TSF-INTERNAL-CONSTANTS" ), makeSymbol( "TSF-REFERENCED-GLOBALS" ), makeSymbol(
        "TSF-REFERENCED-FUNCTIONS" ), makeSymbol( "TSF-DEFINITIONS" ), makeSymbol( "TSF-TOP-LEVEL-FORMS" ), makeSymbol( "TSF-DEFINED-GLOBALS" ), makeSymbol( "TSF-DEFINED-FUNCTIONS" ), makeSymbol( "TSF-DEFINED-MACROS" ),
      makeSymbol( "TSF-ARGLIST-TABLE" ), makeSymbol( "TSF-BINDING-TYPE-TABLE" ), makeSymbol( "TSF-METHOD-VISIBILITY-TABLE" ), makeSymbol( "TSF-GLOBAL-VISIBILITY-TABLE" ), makeSymbol( "TSF-RWBC-METHODS" )
    } );
    $list5 = ConsesLow.list( new SubLObject[] { makeSymbol( "_CSETF-TSF-MODULE-NAME" ), makeSymbol( "_CSETF-TSF-FILENAME" ), makeSymbol( "_CSETF-TSF-INTERNAL-CONSTANTS" ), makeSymbol( "_CSETF-TSF-REFERENCED-GLOBALS" ),
      makeSymbol( "_CSETF-TSF-REFERENCED-FUNCTIONS" ), makeSymbol( "_CSETF-TSF-DEFINITIONS" ), makeSymbol( "_CSETF-TSF-TOP-LEVEL-FORMS" ), makeSymbol( "_CSETF-TSF-DEFINED-GLOBALS" ), makeSymbol(
          "_CSETF-TSF-DEFINED-FUNCTIONS" ), makeSymbol( "_CSETF-TSF-DEFINED-MACROS" ), makeSymbol( "_CSETF-TSF-ARGLIST-TABLE" ), makeSymbol( "_CSETF-TSF-BINDING-TYPE-TABLE" ), makeSymbol(
              "_CSETF-TSF-METHOD-VISIBILITY-TABLE" ), makeSymbol( "_CSETF-TSF-GLOBAL-VISIBILITY-TABLE" ), makeSymbol( "_CSETF-TSF-RWBC-METHODS" )
    } );
    $sym6$PRINT_TRANS_SUBL_FILE = makeSymbol( "PRINT-TRANS-SUBL-FILE" );
    $sym7$TRANS_SUBL_FILE_PRINT_FUNCTION_TRAMPOLINE = makeSymbol( "TRANS-SUBL-FILE-PRINT-FUNCTION-TRAMPOLINE" );
    $list8 = ConsesLow.list( makeSymbol( "OPTIMIZE-FUNCALL" ), makeSymbol( "TRANS-SUBL-FILE-P" ) );
    $sym9$TSF_MODULE_NAME = makeSymbol( "TSF-MODULE-NAME" );
    $sym10$_CSETF_TSF_MODULE_NAME = makeSymbol( "_CSETF-TSF-MODULE-NAME" );
    $sym11$TSF_FILENAME = makeSymbol( "TSF-FILENAME" );
    $sym12$_CSETF_TSF_FILENAME = makeSymbol( "_CSETF-TSF-FILENAME" );
    $sym13$TSF_INTERNAL_CONSTANTS = makeSymbol( "TSF-INTERNAL-CONSTANTS" );
    $sym14$_CSETF_TSF_INTERNAL_CONSTANTS = makeSymbol( "_CSETF-TSF-INTERNAL-CONSTANTS" );
    $sym15$TSF_REFERENCED_GLOBALS = makeSymbol( "TSF-REFERENCED-GLOBALS" );
    $sym16$_CSETF_TSF_REFERENCED_GLOBALS = makeSymbol( "_CSETF-TSF-REFERENCED-GLOBALS" );
    $sym17$TSF_REFERENCED_FUNCTIONS = makeSymbol( "TSF-REFERENCED-FUNCTIONS" );
    $sym18$_CSETF_TSF_REFERENCED_FUNCTIONS = makeSymbol( "_CSETF-TSF-REFERENCED-FUNCTIONS" );
    $sym19$TSF_DEFINITIONS = makeSymbol( "TSF-DEFINITIONS" );
    $sym20$_CSETF_TSF_DEFINITIONS = makeSymbol( "_CSETF-TSF-DEFINITIONS" );
    $sym21$TSF_TOP_LEVEL_FORMS = makeSymbol( "TSF-TOP-LEVEL-FORMS" );
    $sym22$_CSETF_TSF_TOP_LEVEL_FORMS = makeSymbol( "_CSETF-TSF-TOP-LEVEL-FORMS" );
    $sym23$TSF_DEFINED_GLOBALS = makeSymbol( "TSF-DEFINED-GLOBALS" );
    $sym24$_CSETF_TSF_DEFINED_GLOBALS = makeSymbol( "_CSETF-TSF-DEFINED-GLOBALS" );
    $sym25$TSF_DEFINED_FUNCTIONS = makeSymbol( "TSF-DEFINED-FUNCTIONS" );
    $sym26$_CSETF_TSF_DEFINED_FUNCTIONS = makeSymbol( "_CSETF-TSF-DEFINED-FUNCTIONS" );
    $sym27$TSF_DEFINED_MACROS = makeSymbol( "TSF-DEFINED-MACROS" );
    $sym28$_CSETF_TSF_DEFINED_MACROS = makeSymbol( "_CSETF-TSF-DEFINED-MACROS" );
    $sym29$TSF_ARGLIST_TABLE = makeSymbol( "TSF-ARGLIST-TABLE" );
    $sym30$_CSETF_TSF_ARGLIST_TABLE = makeSymbol( "_CSETF-TSF-ARGLIST-TABLE" );
    $sym31$TSF_BINDING_TYPE_TABLE = makeSymbol( "TSF-BINDING-TYPE-TABLE" );
    $sym32$_CSETF_TSF_BINDING_TYPE_TABLE = makeSymbol( "_CSETF-TSF-BINDING-TYPE-TABLE" );
    $sym33$TSF_METHOD_VISIBILITY_TABLE = makeSymbol( "TSF-METHOD-VISIBILITY-TABLE" );
    $sym34$_CSETF_TSF_METHOD_VISIBILITY_TABLE = makeSymbol( "_CSETF-TSF-METHOD-VISIBILITY-TABLE" );
    $sym35$TSF_GLOBAL_VISIBILITY_TABLE = makeSymbol( "TSF-GLOBAL-VISIBILITY-TABLE" );
    $sym36$_CSETF_TSF_GLOBAL_VISIBILITY_TABLE = makeSymbol( "_CSETF-TSF-GLOBAL-VISIBILITY-TABLE" );
    $sym37$TSF_RWBC_METHODS = makeSymbol( "TSF-RWBC-METHODS" );
    $sym38$_CSETF_TSF_RWBC_METHODS = makeSymbol( "_CSETF-TSF-RWBC-METHODS" );
    $kw39$MODULE_NAME = makeKeyword( "MODULE-NAME" );
    $kw40$FILENAME = makeKeyword( "FILENAME" );
    $kw41$INTERNAL_CONSTANTS = makeKeyword( "INTERNAL-CONSTANTS" );
    $kw42$REFERENCED_GLOBALS = makeKeyword( "REFERENCED-GLOBALS" );
    $kw43$REFERENCED_FUNCTIONS = makeKeyword( "REFERENCED-FUNCTIONS" );
    $kw44$DEFINITIONS = makeKeyword( "DEFINITIONS" );
    $kw45$TOP_LEVEL_FORMS = makeKeyword( "TOP-LEVEL-FORMS" );
    $kw46$DEFINED_GLOBALS = makeKeyword( "DEFINED-GLOBALS" );
    $kw47$DEFINED_FUNCTIONS = makeKeyword( "DEFINED-FUNCTIONS" );
    $kw48$DEFINED_MACROS = makeKeyword( "DEFINED-MACROS" );
    $kw49$ARGLIST_TABLE = makeKeyword( "ARGLIST-TABLE" );
    $kw50$BINDING_TYPE_TABLE = makeKeyword( "BINDING-TYPE-TABLE" );
    $kw51$METHOD_VISIBILITY_TABLE = makeKeyword( "METHOD-VISIBILITY-TABLE" );
    $kw52$GLOBAL_VISIBILITY_TABLE = makeKeyword( "GLOBAL-VISIBILITY-TABLE" );
    $kw53$RWBC_METHODS = makeKeyword( "RWBC-METHODS" );
    $str54$Invalid_slot__S_for_construction_ = makeString( "Invalid slot ~S for construction function" );
    $kw55$BEGIN = makeKeyword( "BEGIN" );
    $sym56$MAKE_TRANS_SUBL_FILE = makeSymbol( "MAKE-TRANS-SUBL-FILE" );
    $kw57$SLOT = makeKeyword( "SLOT" );
    $kw58$END = makeKeyword( "END" );
    $sym59$VISIT_DEFSTRUCT_OBJECT_TRANS_SUBL_FILE_METHOD = makeSymbol( "VISIT-DEFSTRUCT-OBJECT-TRANS-SUBL-FILE-METHOD" );
    $sym60$SXHASH_TRANS_SUBL_FILE_METHOD = makeSymbol( "SXHASH-TRANS-SUBL-FILE-METHOD" );
    $sym61$STRINGP = makeSymbol( "STRINGP" );
    $kw62$FREE = makeKeyword( "FREE" );
    $sym63$_ = makeSymbol( "<" );
    $sym64$CDR = makeSymbol( "CDR" );
    $sym65$STRING_LESSP = makeSymbol( "STRING-LESSP" );
    $sym66$SYMBOL_NAME = makeSymbol( "SYMBOL-NAME" );
    $kw67$UNSPECIFIED = makeKeyword( "UNSPECIFIED" );
    $sym68$PROTECTED = makeSymbol( "PROTECTED" );
    $sym69$PRIVATE = makeSymbol( "PRIVATE" );
    $list70 = ConsesLow.list( makeSymbol( "DEFCONSTANT" ), makeSymbol( "DEFLEXICAL" ), makeSymbol( "DEFGLOBAL" ), makeSymbol( "DEFPARAMETER" ), makeSymbol( "DEFVAR" ) );
    $list71 = ConsesLow.list( makeSymbol( "DEFINER" ), makeSymbol( "GLOBAL" ), makeSymbol( "&OPTIONAL" ), makeSymbol( "INIT-FORM" ), makeSymbol( "DOCUMENTATION" ) );
    $list72 = ConsesLow.list( ConsesLow.list( makeSymbol( "STREAM-VAR" ), makeSymbol( "FILENAME" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym73$FILENAME_VAR = makeUninternedSymbol( "FILENAME-VAR" );
    $sym74$WITH_STREAM_BUFFER_SIZE = makeSymbol( "WITH-STREAM-BUFFER-SIZE" );
    $list75 = ConsesLow.list( makeInteger( 1048576 ) );
    $sym76$CLET = makeSymbol( "CLET" );
    $sym77$WITH_PRIVATE_TEXT_FILE = makeSymbol( "WITH-PRIVATE-TEXT-FILE" );
    $list78 = ConsesLow.list( makeKeyword( "OUTPUT" ) );
    $str79$_dev_null = makeString( "/dev/null" );
    $kw80$DOWNCASE = makeKeyword( "DOWNCASE" );
    $sym81$DOUBLE_FLOAT = makeSymbol( "DOUBLE-FLOAT" );
    $str82$___Trans_SubL_File____S = makeString( ";; Trans SubL File : ~S" );
    $str83$_____Location___________S = makeString( "~%;; Location        : ~S" );
    $str84$_______Referenced_Globals__ = makeString( "~%~%;; Referenced Globals :" );
    $str85$_______Referenced_Functions__ = makeString( "~%~%;; Referenced Functions :" );
    $str86$_______Internal_Constants__ = makeString( "~%~%;; Internal Constants :" );
    $list87 = ConsesLow.cons( makeSymbol( "CONSTANT" ), makeSymbol( "INTERNAL-ID" ) );
    $str88$___S____S = makeString( "~%~S : ~S" );
    $str89$_______Definitions__ = makeString( "~%~%;; Definitions :" );
    $sym90$_OPTIONAL = makeSymbol( "&OPTIONAL" );
    $sym91$_REST = makeSymbol( "&REST" );
    $sym92$_PC = makeSymbol( "%PC" );
    $sym93$_IC = makeSymbol( "%IC" );
    $sym94$SYMBOLP = makeSymbol( "SYMBOLP" );
    $sym95$LISTP = makeSymbol( "LISTP" );
    $sym96$KEYWORDP = makeSymbol( "KEYWORDP" );
    $kw97$INPUT = makeKeyword( "INPUT" );
    $str98$Unable_to_open__S = makeString( "Unable to open ~S" );
    $kw99$EOF = makeKeyword( "EOF" );
    $sym100$NON_NEGATIVE_INTEGER_P = makeSymbol( "NON-NEGATIVE-INTEGER-P" );
    $sym101$PROGN = makeSymbol( "PROGN" );
    $sym102$DEFINE = makeSymbol( "DEFINE" );
    $sym103$DEFINE_MACROEXPANDER = makeSymbol( "DEFINE-MACROEXPANDER" );
    $sym104$DEFVAR = makeSymbol( "DEFVAR" );
    $sym105$DEFPARAMETER = makeSymbol( "DEFPARAMETER" );
    $sym106$DEFLEXICAL = makeSymbol( "DEFLEXICAL" );
    $sym107$DEFCONSTANT = makeSymbol( "DEFCONSTANT" );
    $sym108$_DEFSTRUCT_CLASS = makeSymbol( "%DEFSTRUCT-CLASS" );
    $kw109$NAME = makeKeyword( "NAME" );
    $sym110$IN_PACKAGE = makeSymbol( "IN-PACKAGE" );
    $list111 = ConsesLow.cons( makeSymbol( "CONSTANT-FORM" ), makeSymbol( "INTERNAL-ID" ) );
    $sym112$_INTERNAL_CONSTANT = makeSymbol( "%INTERNAL-CONSTANT" );
    $list113 = ConsesLow.list( makeSymbol( "OPERATOR" ), makeSymbol( "NAME" ), makeSymbol( "&REST" ), makeSymbol( "REST" ) );
    $sym114$_REGISTER_MACRO = makeSymbol( "%REGISTER-MACRO" );
    $list115 = ConsesLow.list( makeSymbol( "ARGLIST" ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym116$_REGISTER_FUNCTION = makeSymbol( "%REGISTER-FUNCTION" );
    $list117 = ConsesLow.list( makeSymbol( "INITIALIZATION" ), makeSymbol( "&OPTIONAL" ), makeSymbol( "DOCUMENTATION" ) );
    $sym118$_REGISTER_GLOBAL = makeSymbol( "%REGISTER-GLOBAL" );
    $str119$DECLARE_ = makeString( "DECLARE-" );
    $str120$_FILE = makeString( "-FILE" );
    $sym121$RET = makeSymbol( "RET" );
    $str122$INIT_ = makeString( "INIT-" );
    $str123$SETUP_ = makeString( "SETUP-" );
    $sym124$VECTOR = makeSymbol( "VECTOR" );
    $sym125$LIST = makeSymbol( "LIST" );
    $sym126$CONS = makeSymbol( "CONS" );
    $sym127$LIST_ = makeSymbol( "LIST*" );
    $sym128$SYMBOL_FUNCTION = makeSymbol( "SYMBOL-FUNCTION" );
    $sym129$READER_MAKE_CONSTANT_SHELL = makeSymbol( "READER-MAKE-CONSTANT-SHELL" );
    $sym130$_LF = makeSymbol( "%LF" );
    $str131$Time_to_implement_function_consta = makeString( "Time to implement function constant translation for ~S" );
    $list132 = ConsesLow.list( new SubLObject[] { T, NIL, EQ, EQL, EQUAL, EQUALP, IDENTITY, MINUS_ONE_INTEGER, ZERO_INTEGER, ONE_INTEGER, TWO_INTEGER, THREE_INTEGER, FOUR_INTEGER, FIVE_INTEGER, SIX_INTEGER,
      SEVEN_INTEGER, EIGHT_INTEGER, NINE_INTEGER, TEN_INTEGER, ELEVEN_INTEGER, TWELVE_INTEGER, THIRTEEN_INTEGER, FOURTEEN_INTEGER, FIFTEEN_INTEGER, SIXTEEN_INTEGER, SEVENTEEN_INTEGER, EIGHTEEN_INTEGER, NINETEEN_INTEGER,
      TWENTY_INTEGER, Characters.CHAR_null, Characters.CHAR_backspace, Characters.CHAR_tab, Characters.CHAR_newline, Characters.CHAR_return, Characters.CHAR_page, Characters.CHAR_escape, Characters.CHAR_space,
      Characters.CHAR_exclamation, Characters.CHAR_quotation, Characters.CHAR_hash, Characters.CHAR_dollar, Characters.CHAR_percent, Characters.CHAR_ampersand, Characters.CHAR_quote, Characters.CHAR_lparen,
      Characters.CHAR_rparen, Characters.CHAR_asterisk, Characters.CHAR_plus, Characters.CHAR_comma, Characters.CHAR_hyphen, Characters.CHAR_period, Characters.CHAR_slash, Characters.CHAR_0, Characters.CHAR_1,
      Characters.CHAR_2, Characters.CHAR_3, Characters.CHAR_4, Characters.CHAR_5, Characters.CHAR_6, Characters.CHAR_7, Characters.CHAR_8, Characters.CHAR_9, Characters.CHAR_colon, Characters.CHAR_semicolon,
      Characters.CHAR_less, Characters.CHAR_equal, Characters.CHAR_greater, Characters.CHAR_question, Characters.CHAR_at, Characters.CHAR_A, Characters.CHAR_B, Characters.CHAR_C, Characters.CHAR_D, Characters.CHAR_E,
      Characters.CHAR_F, Characters.CHAR_G, Characters.CHAR_H, Characters.CHAR_I, Characters.CHAR_J, Characters.CHAR_K, Characters.CHAR_L, Characters.CHAR_M, Characters.CHAR_N, Characters.CHAR_O, Characters.CHAR_P,
      Characters.CHAR_Q, Characters.CHAR_R, Characters.CHAR_S, Characters.CHAR_T, Characters.CHAR_U, Characters.CHAR_V, Characters.CHAR_W, Characters.CHAR_X, Characters.CHAR_Y, Characters.CHAR_Z,
      Characters.CHAR_lbracket, Characters.CHAR_backslash, Characters.CHAR_rbracket, Characters.CHAR_caret, Characters.CHAR_underbar, Characters.CHAR_backquote, Characters.CHAR_a, Characters.CHAR_b, Characters.CHAR_c,
      Characters.CHAR_d, Characters.CHAR_e, Characters.CHAR_f, Characters.CHAR_g, Characters.CHAR_h, Characters.CHAR_i, Characters.CHAR_j, Characters.CHAR_k, Characters.CHAR_l, Characters.CHAR_m, Characters.CHAR_n,
      Characters.CHAR_o, Characters.CHAR_p, Characters.CHAR_q, Characters.CHAR_r, Characters.CHAR_s, Characters.CHAR_t, Characters.CHAR_u, Characters.CHAR_v, Characters.CHAR_w, Characters.CHAR_x, Characters.CHAR_y,
      Characters.CHAR_z, Characters.CHAR_lbrace, Characters.CHAR_vertical, Characters.CHAR_rbrace, Characters.CHAR_tilde, Characters.CHAR_rubout
    } );
    $sym133$FUNCTION_ARGLIST_SIGNATURE_INFO = makeSymbol( "FUNCTION-ARGLIST-SIGNATURE-INFO" );
    $kw134$TEST = makeKeyword( "TEST" );
    $kw135$OWNER = makeKeyword( "OWNER" );
    $kw136$CLASSES = makeKeyword( "CLASSES" );
    $kw137$KB = makeKeyword( "KB" );
    $kw138$TINY = makeKeyword( "TINY" );
    $kw139$WORKING_ = makeKeyword( "WORKING?" );
    $list140 = ConsesLow.list( new SubLObject[] { ConsesLow.list( ConsesLow.list( NIL ), ZERO_INTEGER, ZERO_INTEGER, NIL ), ConsesLow.list( ConsesLow.list( ConsesLow.list( makeSymbol( "X" ) ) ), ONE_INTEGER,
        ZERO_INTEGER, NIL ), ConsesLow.list( ConsesLow.list( ConsesLow.list( makeSymbol( "X" ), makeSymbol( "&OPTIONAL" ), makeSymbol( "Y" ) ) ), ONE_INTEGER, ONE_INTEGER, NIL ), ConsesLow.list( ConsesLow.list( ConsesLow
            .list( makeSymbol( "X" ), makeSymbol( "&OPTIONAL" ), makeSymbol( "Y" ), makeSymbol( "&REST" ), makeSymbol( "REST" ) ) ), ONE_INTEGER, ONE_INTEGER, T ), ConsesLow.list( ConsesLow.list( ConsesLow.list(
                makeSymbol( "X" ), makeSymbol( "&REST" ), makeSymbol( "REST" ) ) ), ONE_INTEGER, ZERO_INTEGER, T ), ConsesLow.list( ConsesLow.list( ConsesLow.list( makeSymbol( "X" ), makeSymbol( "A" ), makeSymbol( "B" ),
                    makeSymbol( "C" ), makeSymbol( "&REST" ), makeSymbol( "REST" ) ) ), FOUR_INTEGER, ZERO_INTEGER, T ), ConsesLow.list( ConsesLow.list( ConsesLow.list( new SubLObject[]
                    { makeSymbol( "X" ), makeSymbol( "A" ), makeSymbol( "B" ), makeSymbol( "C" ), makeSymbol( "&OPTIONAL" ), makeSymbol( "J" ), makeSymbol( "K" ), makeSymbol( "L" ), makeSymbol( "&REST" ), makeSymbol(
                        "REST" )
        } ) ), FOUR_INTEGER, THREE_INTEGER, T ), ConsesLow.list( ConsesLow.list( ConsesLow.list( makeSymbol( "X" ), makeSymbol( "A" ), makeSymbol( "B" ), makeSymbol( "C" ), makeSymbol( "&OPTIONAL" ), makeSymbol( "J" ),
            makeSymbol( "K" ), makeSymbol( "L" ) ) ), FOUR_INTEGER, THREE_INTEGER, NIL ), ConsesLow.list( ConsesLow.list( ConsesLow.list( makeSymbol( "&REST" ), makeSymbol( "REST" ) ) ), ZERO_INTEGER, ZERO_INTEGER, T )
    } );
    $sym141$TRANSLATE_CONSTANT_INITIALIZATION_FORM = makeSymbol( "TRANSLATE-CONSTANT-INITIALIZATION-FORM" );
    $list142 = ConsesLow.list( new SubLObject[] { ConsesLow.list( ConsesLow.list( makeInteger( 212 ) ), ConsesLow.list( makeSymbol( "%LF" ), makeInteger( 212 ) ) ), ConsesLow.list( ConsesLow.list( makeDouble( 1.0 ) ),
        ConsesLow.list( makeSymbol( "%LF" ), makeDouble( 1.0 ) ) ), ConsesLow.list( ConsesLow.list( makeKeyword( "TEST" ) ), ConsesLow.list( makeSymbol( "%LF" ), makeKeyword( "TEST" ) ) ), ConsesLow.list( ConsesLow.list(
            makeString( "test" ) ), ConsesLow.list( makeSymbol( "%LF" ), makeString( "test" ) ) ), ConsesLow.list( ConsesLow.list( makeSymbol( "X" ) ), ConsesLow.list( makeSymbol( "%LF" ), makeSymbol( "X" ) ) ),
      ConsesLow.list( ConsesLow.list( NIL ), ConsesLow.list( makeSymbol( "%PC" ), NIL ) ), ConsesLow.list( ConsesLow.list( ConsesLow.list( ONE_INTEGER ) ), ConsesLow.list( makeSymbol( "LIST" ), ConsesLow.list(
          makeSymbol( "%PC" ), ONE_INTEGER ) ) ), ConsesLow.list( ConsesLow.list( ConsesLow.list( ONE_INTEGER, TWO_INTEGER ) ), ConsesLow.list( makeSymbol( "LIST" ), ConsesLow.list( makeSymbol( "%PC" ), ONE_INTEGER ),
              ConsesLow.list( makeSymbol( "%PC" ), TWO_INTEGER ) ) ), ConsesLow.list( ConsesLow.list( ConsesLow.cons( ONE_INTEGER, TWO_INTEGER ) ), ConsesLow.list( makeSymbol( "CONS" ), ConsesLow.list( makeSymbol(
                  "%PC" ), ONE_INTEGER ), ConsesLow.list( makeSymbol( "%PC" ), TWO_INTEGER ) ) ), ConsesLow.list( ConsesLow.list( ConsesLow.list( ONE_INTEGER, TWO_INTEGER, THREE_INTEGER ) ), ConsesLow.list( makeSymbol(
                      "LIST" ), ConsesLow.list( makeSymbol( "%PC" ), ONE_INTEGER ), ConsesLow.list( makeSymbol( "%PC" ), TWO_INTEGER ), ConsesLow.list( makeSymbol( "%PC" ), THREE_INTEGER ) ) ), ConsesLow.list( ConsesLow
                          .list( ConsesLow.listS( ONE_INTEGER, TWO_INTEGER, THREE_INTEGER ) ), ConsesLow.list( makeSymbol( "LIST*" ), ConsesLow.list( makeSymbol( "%PC" ), ONE_INTEGER ), ConsesLow.list( makeSymbol(
                              "%PC" ), TWO_INTEGER ), ConsesLow.list( makeSymbol( "%PC" ), THREE_INTEGER ) ) )
    } );
  }

  public static final class $trans_subl_file_native
      extends
        SubLStructNative
  {
    public SubLObject $module_name;
    public SubLObject $filename;
    public SubLObject $internal_constants;
    public SubLObject $referenced_globals;
    public SubLObject $referenced_functions;
    public SubLObject $definitions;
    public SubLObject $top_level_forms;
    public SubLObject $defined_globals;
    public SubLObject $defined_functions;
    public SubLObject $defined_macros;
    public SubLObject $arglist_table;
    public SubLObject $binding_type_table;
    public SubLObject $method_visibility_table;
    public SubLObject $global_visibility_table;
    public SubLObject $rwbc_methods;
    private static final SubLStructDeclNative structDecl;

    public $trans_subl_file_native()
    {
      this.$module_name = CommonSymbols.NIL;
      this.$filename = CommonSymbols.NIL;
      this.$internal_constants = CommonSymbols.NIL;
      this.$referenced_globals = CommonSymbols.NIL;
      this.$referenced_functions = CommonSymbols.NIL;
      this.$definitions = CommonSymbols.NIL;
      this.$top_level_forms = CommonSymbols.NIL;
      this.$defined_globals = CommonSymbols.NIL;
      this.$defined_functions = CommonSymbols.NIL;
      this.$defined_macros = CommonSymbols.NIL;
      this.$arglist_table = CommonSymbols.NIL;
      this.$binding_type_table = CommonSymbols.NIL;
      this.$method_visibility_table = CommonSymbols.NIL;
      this.$global_visibility_table = CommonSymbols.NIL;
      this.$rwbc_methods = CommonSymbols.NIL;
    }

    @Override
    public SubLStructDecl getStructDecl()
    {
      return $trans_subl_file_native.structDecl;
    }

    @Override
    public SubLObject getField2()
    {
      return this.$module_name;
    }

    @Override
    public SubLObject getField3()
    {
      return this.$filename;
    }

    @Override
    public SubLObject getField4()
    {
      return this.$internal_constants;
    }

    @Override
    public SubLObject getField5()
    {
      return this.$referenced_globals;
    }

    @Override
    public SubLObject getField6()
    {
      return this.$referenced_functions;
    }

    @Override
    public SubLObject getField7()
    {
      return this.$definitions;
    }

    @Override
    public SubLObject getField8()
    {
      return this.$top_level_forms;
    }

    @Override
    public SubLObject getField9()
    {
      return this.$defined_globals;
    }

    @Override
    public SubLObject getField10()
    {
      return this.$defined_functions;
    }

    @Override
    public SubLObject getField11()
    {
      return this.$defined_macros;
    }

    @Override
    public SubLObject getField12()
    {
      return this.$arglist_table;
    }

    @Override
    public SubLObject getField13()
    {
      return this.$binding_type_table;
    }

    @Override
    public SubLObject getField14()
    {
      return this.$method_visibility_table;
    }

    @Override
    public SubLObject getField15()
    {
      return this.$global_visibility_table;
    }

    @Override
    public SubLObject getField16()
    {
      return this.$rwbc_methods;
    }

    @Override
    public SubLObject setField2(final SubLObject value)
    {
      return this.$module_name = value;
    }

    @Override
    public SubLObject setField3(final SubLObject value)
    {
      return this.$filename = value;
    }

    @Override
    public SubLObject setField4(final SubLObject value)
    {
      return this.$internal_constants = value;
    }

    @Override
    public SubLObject setField5(final SubLObject value)
    {
      return this.$referenced_globals = value;
    }

    @Override
    public SubLObject setField6(final SubLObject value)
    {
      return this.$referenced_functions = value;
    }

    @Override
    public SubLObject setField7(final SubLObject value)
    {
      return this.$definitions = value;
    }

    @Override
    public SubLObject setField8(final SubLObject value)
    {
      return this.$top_level_forms = value;
    }

    @Override
    public SubLObject setField9(final SubLObject value)
    {
      return this.$defined_globals = value;
    }

    @Override
    public SubLObject setField10(final SubLObject value)
    {
      return this.$defined_functions = value;
    }

    @Override
    public SubLObject setField11(final SubLObject value)
    {
      return this.$defined_macros = value;
    }

    @Override
    public SubLObject setField12(final SubLObject value)
    {
      return this.$arglist_table = value;
    }

    @Override
    public SubLObject setField13(final SubLObject value)
    {
      return this.$binding_type_table = value;
    }

    @Override
    public SubLObject setField14(final SubLObject value)
    {
      return this.$method_visibility_table = value;
    }

    @Override
    public SubLObject setField15(final SubLObject value)
    {
      return this.$global_visibility_table = value;
    }

    @Override
    public SubLObject setField16(final SubLObject value)
    {
      return this.$rwbc_methods = value;
    }
    static
    {
      structDecl = Structures.makeStructDeclNative( $trans_subl_file_native.class, $sym0$TRANS_SUBL_FILE, $sym1$TRANS_SUBL_FILE_P, $list2, $list3, new String[] { "$module_name", "$filename", "$internal_constants",
        "$referenced_globals", "$referenced_functions", "$definitions", "$top_level_forms", "$defined_globals", "$defined_functions", "$defined_macros", "$arglist_table", "$binding_type_table",
        "$method_visibility_table", "$global_visibility_table", "$rwbc_methods"
      }, $list4, $list5, $sym6$PRINT_TRANS_SUBL_FILE );
    }
  }

  public static final class $trans_subl_file_p$UnaryFunction
      extends
        UnaryFunction
  {
    public $trans_subl_file_p$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "TRANS-SUBL-FILE-P" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1)
    {
      return trans_subl_file_p( arg1 );
    }
  }
}
/*
 * 
 * Total time: 431 ms
 * 
 */