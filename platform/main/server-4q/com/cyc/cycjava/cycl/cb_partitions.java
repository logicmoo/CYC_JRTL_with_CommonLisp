package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Filesys;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class cb_partitions
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.cb_partitions";
  public static final String myFingerPrint = "219722b85db7e85fcfe5f437f9876d339a5672f9a321667cebc20199bef6b9d4";
  @SubLTranslatedFile.SubL(source = "cycl/cb-partitions.lisp", position = 840L)
  private static SubLSymbol $cb_partition_extension$;
  @SubLTranslatedFile.SubL(source = "cycl/cb-partitions.lisp", position = 2751L)
  public static SubLSymbol $dtp_cb_partition_save$;
  @SubLTranslatedFile.SubL(source = "cycl/cb-partitions.lisp", position = 9065L)
  private static SubLSymbol $cb_partition_method_table$;
  @SubLTranslatedFile.SubL(source = "cycl/cb-partitions.lisp", position = 11058L)
  private static SubLSymbol $cb_current_partition_save$;
  private static final SubLString $str0$cpart;
  private static final SubLString $str1$_;
  private static final SubLSymbol $sym2$DIRECTORY_P;
  private static final SubLSymbol $sym3$CB_PARTITION_SAVE;
  private static final SubLSymbol $sym4$CB_PARTITION_SAVE_P;
  private static final SubLList $list5;
  private static final SubLList $list6;
  private static final SubLList $list7;
  private static final SubLList $list8;
  private static final SubLSymbol $sym9$DEFAULT_STRUCT_PRINT_FUNCTION;
  private static final SubLSymbol $sym10$CB_PARTITION_SAVE_PRINT_FUNCTION_TRAMPOLINE;
  private static final SubLList $list11;
  private static final SubLSymbol $sym12$CB_PART_SAVE_SPECIFIED_DIRECTORY;
  private static final SubLSymbol $sym13$_CSETF_CB_PART_SAVE_SPECIFIED_DIRECTORY;
  private static final SubLSymbol $sym14$CB_PART_SAVE_PERSONAL_DIRECTORY;
  private static final SubLSymbol $sym15$_CSETF_CB_PART_SAVE_PERSONAL_DIRECTORY;
  private static final SubLSymbol $sym16$CB_PART_SAVE_PUBLIC_DIRECTORY;
  private static final SubLSymbol $sym17$_CSETF_CB_PART_SAVE_PUBLIC_DIRECTORY;
  private static final SubLSymbol $sym18$CB_PART_SAVE_FILENAME;
  private static final SubLSymbol $sym19$_CSETF_CB_PART_SAVE_FILENAME;
  private static final SubLSymbol $sym20$CB_PART_SAVE_PREDEFINED_METHODS;
  private static final SubLSymbol $sym21$_CSETF_CB_PART_SAVE_PREDEFINED_METHODS;
  private static final SubLSymbol $sym22$CB_PART_SAVE_ONTOLOGIES;
  private static final SubLSymbol $sym23$_CSETF_CB_PART_SAVE_ONTOLOGIES;
  private static final SubLSymbol $sym24$CB_PART_SAVE_QUOTED_ONTOLOGIES;
  private static final SubLSymbol $sym25$_CSETF_CB_PART_SAVE_QUOTED_ONTOLOGIES;
  private static final SubLSymbol $sym26$CB_PART_SAVE_TERMS;
  private static final SubLSymbol $sym27$_CSETF_CB_PART_SAVE_TERMS;
  private static final SubLSymbol $kw28$SPECIFIED_DIRECTORY;
  private static final SubLSymbol $kw29$PERSONAL_DIRECTORY;
  private static final SubLSymbol $kw30$PUBLIC_DIRECTORY;
  private static final SubLSymbol $kw31$FILENAME;
  private static final SubLSymbol $kw32$PREDEFINED_METHODS;
  private static final SubLSymbol $kw33$ONTOLOGIES;
  private static final SubLSymbol $kw34$QUOTED_ONTOLOGIES;
  private static final SubLSymbol $kw35$TERMS;
  private static final SubLString $str36$Invalid_slot__S_for_construction_;
  private static final SubLSymbol $kw37$BEGIN;
  private static final SubLSymbol $sym38$MAKE_CB_PARTITION_SAVE;
  private static final SubLSymbol $kw39$SLOT;
  private static final SubLSymbol $kw40$END;
  private static final SubLSymbol $sym41$VISIT_DEFSTRUCT_OBJECT_CB_PARTITION_SAVE_METHOD;
  private static final SubLSymbol $sym42$STRINGP;
  private static final SubLSymbol $sym43$LISTP;
  private static final SubLSymbol $kw44$FUNCTION;
  private static final SubLSymbol $kw45$ONTOLOGY;
  private static final SubLSymbol $kw46$QUOTED_ONTOLOGY;
  private static final SubLSymbol $kw47$TERM;
  private static final SubLSymbol $sym48$FORT_P;
  private static final SubLString $str49$;
  private static final SubLList $list50;
  private static final SubLSymbol $sym51$FIRST;
  private static final SubLSymbol $sym52$SCOPE_PARTITION_ALL_KB_ADDITIONS;
  private static final SubLSymbol $sym53$SCOPE_PARTITION_ALL_ASSERTIONS_IN_HLMT_NAUT;
  private static final SubLString $str54$Scoping_assertions_in_microtheori;
  private static final SubLSymbol $kw55$SKIP;
  private static final SubLSymbol $sym56$_CB_CURRENT_PARTITION_SAVE_;
  private static final SubLSymbol $sym57$CATCH_ERROR_MESSAGE_HANDLER;
  private static final SubLSymbol $kw58$HTML_HANDLER;
  private static final SubLString $str59$_Partition_Save_;
  private static final SubLSymbol $kw60$MAIN;
  private static final SubLString $str61$cb_partition_save;
  private static final SubLSymbol $kw62$PARTITION_SAVE;
  private static final SubLSymbol $sym63$CB_LINK_PARTITION_SAVE;
  private static final SubLString $str64$Partition_Save;
  private static final SubLString $str65$PartSave;
  private static final SubLString $str66$Save_out_a_KB_partition;
  private static final SubLString $str67$__DOCTYPE_html_PUBLIC_____W3C__DT;
  private static final SubLString $str68$_meta_http_equiv__X_UA_Compatible;
  private static final SubLSymbol $kw69$UNINITIALIZED;
  private static final SubLSymbol $kw70$CB_CYC;
  private static final SubLSymbol $kw71$SAM_AUTOCOMPLETE_CSS;
  private static final SubLSymbol $kw72$SHA1;
  private static final SubLString $str73$yui_skin_sam;
  private static final SubLString $str74$reloadFrameButton;
  private static final SubLString $str75$button;
  private static final SubLString $str76$reload;
  private static final SubLString $str77$Refresh_Frames;
  private static final SubLString $str78$post;
  private static final SubLString $str79$cb_handle_partition_save;
  private static final SubLSymbol $kw80$CB_PARTITION_SAVE;
  private static final SubLString $str81$cb_partition_save_html;
  private static final SubLString $str82$Reset_Form;
  private static final SubLString $str83$Update_Partition_Scope;
  private static final SubLString $str84$update;
  private static final SubLString $str85$Save_Partition;
  private static final SubLString $str86$save;
  private static final SubLString $str87$Partition_Filename;
  private static final SubLString $str88$Choose_or_specify_a_directory__;
  private static final SubLString $str89$directory;
  private static final SubLString $str90$personal;
  private static final SubLString $str91$public;
  private static final SubLString $str92$specified_directory;
  private static final SubLString $str93$specified;
  private static final SubLInteger $int94$60;
  private static final SubLString $str95$Clear;
  private static final SubLSymbol $kw96$LEFT;
  private static final SubLString $str97$Specify_the_filename__;
  private static final SubLString $str98$Extension;
  private static final SubLString $str99$partition_filename;
  private static final SubLInteger $int100$40;
  private static final SubLString $str101$Partition_Scope;
  private static final SubLString $str102$Clear_Partition_Scope;
  private static final SubLString $str103$reset_scope;
  private static final SubLString $str104$Predefined_Methods___;
  private static final SubLString $str105$method__A;
  private static final SubLString $str106$Ontologies__instances_and_specs__;
  private static final SubLString $str107$None;
  private static final SubLString $str108$ontology__A;
  private static final SubLString $str109$Add_Ontology__;
  private static final SubLString $str110$ontology;
  private static final SubLString $str111$Complete;
  private static final SubLObject $const112$Collection;
  private static final SubLString $str113$Quoted_Ontologies__quoted_instanc;
  private static final SubLString $str114$quoted_ontology__A;
  private static final SubLString $str115$Add_Quoted_Ontology__;
  private static final SubLString $str116$quoted_ontology;
  private static final SubLString $str117$Terms___;
  private static final SubLString $str118$term__A;
  private static final SubLString $str119$Add_Term___;
  private static final SubLString $str120$term;
  private static final SubLSymbol $kw121$ERROR;
  private static final SubLString $str122$_S_does_not_specify_a_Cyc_collect;
  private static final SubLString $str123$Partition_has_been_saved_;
  private static final SubLSymbol $sym124$CB_HANDLE_PARTITION_SAVE;
  private static final SubLString $str125$method_;
  private static final SubLString $str126$ontology_;
  private static final SubLString $str127$quoted_ontology_;
  private static final SubLString $str128$term_;
  private static final SubLSymbol $sym129$CB_PARTITION_LOAD;
  private static final SubLString $str130$_Partition_Load_;
  private static final SubLString $str131$cb_partition_load;
  private static final SubLSymbol $kw132$PARTITION_LOAD;
  private static final SubLSymbol $sym133$CB_LINK_PARTITION_LOAD;
  private static final SubLString $str134$Partition_Load;
  private static final SubLString $str135$PartLoad;
  private static final SubLString $str136$Load_a_KB_partition;
  private static final SubLString $str137$the_Partition_Load_page;
  private static final SubLString $str138$cb_handle_partition_load;
  private static final SubLString $str139$Specify_or_select_one_or_more_par;
  private static final SubLSymbol $kw140$CB_PARTITION_LOAD;
  private static final SubLString $str141$cb_partition_load_html;
  private static final SubLString $str142$Load_Partitions;
  private static final SubLString $str143$load;
  private static final SubLString $str144$Full_pathname_of_a_partition_file;
  private static final SubLString $str145$specified_filename;
  private static final SubLInteger $int146$80;
  private static final SubLString $str147$finalize;
  private static final SubLString $str148$_Clean_up_after_load____Only_unch;
  private static final SubLSymbol $kw149$TOP;
  private static final SubLString $str150$Personal_partitions_from;
  private static final SubLString $str151$personal__A;
  private static final SubLSymbol $kw152$RIGHT;
  private static final SubLString $str153$Public_partitions_from;
  private static final SubLString $str154$public__A;
  private static final SubLString $str155$The_specified_filename__S_could_n;
  private static final SubLString $str156$Partition_has_been_loaded_;
  private static final SubLString $str157$Partition_files_have_been_loaded_;
  private static final SubLSymbol $sym158$CB_HANDLE_PARTITION_LOAD;
  private static final SubLList $list159;
  private static final SubLString $str160$personal_;
  private static final SubLString $str161$public_;

  @SubLTranslatedFile.SubL(source = "cycl/cb-partitions.lisp", position = 996L)
  public static SubLObject make_partition_filename(final SubLObject directory_string, final SubLObject filename, SubLObject extension)
  {
    if( extension == UNPROVIDED )
    {
      extension = NIL;
    }
    if( NIL == extension )
    {
      extension = $cb_partition_extension$.getGlobalValue();
    }
    return Sequences.cconcatenate( directory_string, new SubLObject[] { filename, $str1$_, extension
    } );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-partitions.lisp", position = 1273L)
  public static SubLObject directory_partition_files(final SubLObject directory)
  {
    assert NIL != Filesys.directory_p( directory ) : directory;
    SubLObject partition_files = NIL;
    SubLObject cdolist_list_var = Filesys.directory( directory, UNPROVIDED );
    SubLObject partition_file = NIL;
    partition_file = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL != string_utilities.ends_with( partition_file, $cb_partition_extension$.getGlobalValue(), UNPROVIDED ) )
      {
        partition_files = ConsesLow.cons( partition_file, partition_files );
      }
      cdolist_list_var = cdolist_list_var.rest();
      partition_file = cdolist_list_var.first();
    }
    return partition_files;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-partitions.lisp", position = 1700L)
  public static SubLObject cb_compute_partition_save_public_directory()
  {
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-partitions.lisp", position = 1837L)
  public static SubLObject cb_compute_partition_save_personal_directory()
  {
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-partitions.lisp", position = 2079L)
  public static SubLObject cb_compute_partition_load_public_directory()
  {
    return cb_compute_partition_save_public_directory();
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-partitions.lisp", position = 2196L)
  public static SubLObject cb_compute_partition_load_personal_directory()
  {
    return cb_compute_partition_save_personal_directory();
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-partitions.lisp", position = 2751L)
  public static SubLObject cb_partition_save_print_function_trampoline(final SubLObject v_object, final SubLObject stream)
  {
    compatibility.default_struct_print_function( v_object, stream, ZERO_INTEGER );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-partitions.lisp", position = 2751L)
  public static SubLObject cb_partition_save_p(final SubLObject v_object)
  {
    return ( v_object.getClass() == $cb_partition_save_native.class ) ? T : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-partitions.lisp", position = 2751L)
  public static SubLObject cb_part_save_specified_directory(final SubLObject v_object)
  {
    assert NIL != cb_partition_save_p( v_object ) : v_object;
    return v_object.getField2();
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-partitions.lisp", position = 2751L)
  public static SubLObject cb_part_save_personal_directory(final SubLObject v_object)
  {
    assert NIL != cb_partition_save_p( v_object ) : v_object;
    return v_object.getField3();
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-partitions.lisp", position = 2751L)
  public static SubLObject cb_part_save_public_directory(final SubLObject v_object)
  {
    assert NIL != cb_partition_save_p( v_object ) : v_object;
    return v_object.getField4();
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-partitions.lisp", position = 2751L)
  public static SubLObject cb_part_save_filename(final SubLObject v_object)
  {
    assert NIL != cb_partition_save_p( v_object ) : v_object;
    return v_object.getField5();
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-partitions.lisp", position = 2751L)
  public static SubLObject cb_part_save_predefined_methods(final SubLObject v_object)
  {
    assert NIL != cb_partition_save_p( v_object ) : v_object;
    return v_object.getField6();
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-partitions.lisp", position = 2751L)
  public static SubLObject cb_part_save_ontologies(final SubLObject v_object)
  {
    assert NIL != cb_partition_save_p( v_object ) : v_object;
    return v_object.getField7();
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-partitions.lisp", position = 2751L)
  public static SubLObject cb_part_save_quoted_ontologies(final SubLObject v_object)
  {
    assert NIL != cb_partition_save_p( v_object ) : v_object;
    return v_object.getField8();
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-partitions.lisp", position = 2751L)
  public static SubLObject cb_part_save_terms(final SubLObject v_object)
  {
    assert NIL != cb_partition_save_p( v_object ) : v_object;
    return v_object.getField9();
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-partitions.lisp", position = 2751L)
  public static SubLObject _csetf_cb_part_save_specified_directory(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != cb_partition_save_p( v_object ) : v_object;
    return v_object.setField2( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-partitions.lisp", position = 2751L)
  public static SubLObject _csetf_cb_part_save_personal_directory(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != cb_partition_save_p( v_object ) : v_object;
    return v_object.setField3( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-partitions.lisp", position = 2751L)
  public static SubLObject _csetf_cb_part_save_public_directory(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != cb_partition_save_p( v_object ) : v_object;
    return v_object.setField4( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-partitions.lisp", position = 2751L)
  public static SubLObject _csetf_cb_part_save_filename(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != cb_partition_save_p( v_object ) : v_object;
    return v_object.setField5( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-partitions.lisp", position = 2751L)
  public static SubLObject _csetf_cb_part_save_predefined_methods(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != cb_partition_save_p( v_object ) : v_object;
    return v_object.setField6( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-partitions.lisp", position = 2751L)
  public static SubLObject _csetf_cb_part_save_ontologies(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != cb_partition_save_p( v_object ) : v_object;
    return v_object.setField7( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-partitions.lisp", position = 2751L)
  public static SubLObject _csetf_cb_part_save_quoted_ontologies(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != cb_partition_save_p( v_object ) : v_object;
    return v_object.setField8( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-partitions.lisp", position = 2751L)
  public static SubLObject _csetf_cb_part_save_terms(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != cb_partition_save_p( v_object ) : v_object;
    return v_object.setField9( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-partitions.lisp", position = 2751L)
  public static SubLObject make_cb_partition_save(SubLObject arglist)
  {
    if( arglist == UNPROVIDED )
    {
      arglist = NIL;
    }
    final SubLObject v_new = new $cb_partition_save_native();
    SubLObject next;
    SubLObject current_arg;
    SubLObject current_value;
    SubLObject pcase_var;
    for( next = NIL, next = arglist; NIL != next; next = conses_high.cddr( next ) )
    {
      current_arg = next.first();
      current_value = conses_high.cadr( next );
      pcase_var = current_arg;
      if( pcase_var.eql( $kw28$SPECIFIED_DIRECTORY ) )
      {
        _csetf_cb_part_save_specified_directory( v_new, current_value );
      }
      else if( pcase_var.eql( $kw29$PERSONAL_DIRECTORY ) )
      {
        _csetf_cb_part_save_personal_directory( v_new, current_value );
      }
      else if( pcase_var.eql( $kw30$PUBLIC_DIRECTORY ) )
      {
        _csetf_cb_part_save_public_directory( v_new, current_value );
      }
      else if( pcase_var.eql( $kw31$FILENAME ) )
      {
        _csetf_cb_part_save_filename( v_new, current_value );
      }
      else if( pcase_var.eql( $kw32$PREDEFINED_METHODS ) )
      {
        _csetf_cb_part_save_predefined_methods( v_new, current_value );
      }
      else if( pcase_var.eql( $kw33$ONTOLOGIES ) )
      {
        _csetf_cb_part_save_ontologies( v_new, current_value );
      }
      else if( pcase_var.eql( $kw34$QUOTED_ONTOLOGIES ) )
      {
        _csetf_cb_part_save_quoted_ontologies( v_new, current_value );
      }
      else if( pcase_var.eql( $kw35$TERMS ) )
      {
        _csetf_cb_part_save_terms( v_new, current_value );
      }
      else
      {
        Errors.error( $str36$Invalid_slot__S_for_construction_, current_arg );
      }
    }
    return v_new;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-partitions.lisp", position = 2751L)
  public static SubLObject visit_defstruct_cb_partition_save(final SubLObject obj, final SubLObject visitor_fn)
  {
    Functions.funcall( visitor_fn, obj, $kw37$BEGIN, $sym38$MAKE_CB_PARTITION_SAVE, EIGHT_INTEGER );
    Functions.funcall( visitor_fn, obj, $kw39$SLOT, $kw28$SPECIFIED_DIRECTORY, cb_part_save_specified_directory( obj ) );
    Functions.funcall( visitor_fn, obj, $kw39$SLOT, $kw29$PERSONAL_DIRECTORY, cb_part_save_personal_directory( obj ) );
    Functions.funcall( visitor_fn, obj, $kw39$SLOT, $kw30$PUBLIC_DIRECTORY, cb_part_save_public_directory( obj ) );
    Functions.funcall( visitor_fn, obj, $kw39$SLOT, $kw31$FILENAME, cb_part_save_filename( obj ) );
    Functions.funcall( visitor_fn, obj, $kw39$SLOT, $kw32$PREDEFINED_METHODS, cb_part_save_predefined_methods( obj ) );
    Functions.funcall( visitor_fn, obj, $kw39$SLOT, $kw33$ONTOLOGIES, cb_part_save_ontologies( obj ) );
    Functions.funcall( visitor_fn, obj, $kw39$SLOT, $kw34$QUOTED_ONTOLOGIES, cb_part_save_quoted_ontologies( obj ) );
    Functions.funcall( visitor_fn, obj, $kw39$SLOT, $kw35$TERMS, cb_part_save_terms( obj ) );
    Functions.funcall( visitor_fn, obj, $kw40$END, $sym38$MAKE_CB_PARTITION_SAVE, EIGHT_INTEGER );
    return obj;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-partitions.lisp", position = 2751L)
  public static SubLObject visit_defstruct_object_cb_partition_save_method(final SubLObject obj, final SubLObject visitor_fn)
  {
    return visit_defstruct_cb_partition_save( obj, visitor_fn );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-partitions.lisp", position = 3034L)
  public static SubLObject new_cb_partition_save()
  {
    final SubLObject part_save = make_cb_partition_save( UNPROVIDED );
    cb_reset_partition_save_file_info( part_save );
    cb_reset_partition_save_scope_info( part_save );
    return part_save;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-partitions.lisp", position = 3263L)
  public static SubLObject cb_partition_save_specified_directory(final SubLObject part_save)
  {
    assert NIL != cb_partition_save_p( part_save ) : part_save;
    return cb_part_save_specified_directory( part_save );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-partitions.lisp", position = 3441L)
  public static SubLObject cb_partition_save_personal_directory(final SubLObject part_save)
  {
    assert NIL != cb_partition_save_p( part_save ) : part_save;
    return cb_part_save_personal_directory( part_save );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-partitions.lisp", position = 3605L)
  public static SubLObject cb_partition_save_public_directory(final SubLObject part_save)
  {
    assert NIL != cb_partition_save_p( part_save ) : part_save;
    return cb_part_save_public_directory( part_save );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-partitions.lisp", position = 3765L)
  public static SubLObject cb_partition_save_filename(final SubLObject part_save)
  {
    assert NIL != cb_partition_save_p( part_save ) : part_save;
    return cb_part_save_filename( part_save );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-partitions.lisp", position = 3909L)
  public static SubLObject cb_partition_save_predefined_methods(final SubLObject part_save)
  {
    assert NIL != cb_partition_save_p( part_save ) : part_save;
    return cb_part_save_predefined_methods( part_save );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-partitions.lisp", position = 4074L)
  public static SubLObject cb_partition_save_ontologies(final SubLObject part_save)
  {
    assert NIL != cb_partition_save_p( part_save ) : part_save;
    return cb_part_save_ontologies( part_save );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-partitions.lisp", position = 4222L)
  public static SubLObject cb_partition_save_quoted_ontologies(final SubLObject part_save)
  {
    assert NIL != cb_partition_save_p( part_save ) : part_save;
    return cb_part_save_quoted_ontologies( part_save );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-partitions.lisp", position = 4384L)
  public static SubLObject cb_partition_save_terms(final SubLObject part_save)
  {
    assert NIL != cb_partition_save_p( part_save ) : part_save;
    return cb_part_save_terms( part_save );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-partitions.lisp", position = 4522L)
  public static SubLObject cb_set_partition_save_specified_directory(final SubLObject part_save, final SubLObject directory)
  {
    assert NIL != cb_partition_save_p( part_save ) : part_save;
    assert NIL != Types.stringp( directory ) : directory;
    _csetf_cb_part_save_specified_directory( part_save, directory );
    return part_save;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-partitions.lisp", position = 4777L)
  public static SubLObject cb_set_partition_save_personal_directory(final SubLObject part_save, final SubLObject directory)
  {
    assert NIL != cb_partition_save_p( part_save ) : part_save;
    if( NIL != directory && !assertionsDisabledInClass && NIL == Types.stringp( directory ) )
    {
      throw new AssertionError( directory );
    }
    _csetf_cb_part_save_personal_directory( part_save, directory );
    return part_save;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-partitions.lisp", position = 5029L)
  public static SubLObject cb_set_partition_save_public_directory(final SubLObject part_save, final SubLObject directory)
  {
    assert NIL != cb_partition_save_p( part_save ) : part_save;
    if( NIL != directory && !assertionsDisabledInClass && NIL == Types.stringp( directory ) )
    {
      throw new AssertionError( directory );
    }
    _csetf_cb_part_save_public_directory( part_save, directory );
    return part_save;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-partitions.lisp", position = 5277L)
  public static SubLObject cb_set_partition_save_filename(final SubLObject part_save, final SubLObject filename)
  {
    assert NIL != cb_partition_save_p( part_save ) : part_save;
    assert NIL != Types.stringp( filename ) : filename;
    _csetf_cb_part_save_filename( part_save, filename );
    return part_save;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-partitions.lisp", position = 5495L)
  public static SubLObject cb_set_partition_save_predefined_methods(final SubLObject part_save, final SubLObject v_methods)
  {
    assert NIL != cb_partition_save_p( part_save ) : part_save;
    _csetf_cb_part_save_predefined_methods( part_save, v_methods );
    return part_save;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-partitions.lisp", position = 5700L)
  public static SubLObject cb_set_partition_save_ontologies(final SubLObject part_save, final SubLObject ontologies)
  {
    assert NIL != cb_partition_save_p( part_save ) : part_save;
    assert NIL != Types.listp( ontologies ) : ontologies;
    _csetf_cb_part_save_ontologies( part_save, ontologies );
    return part_save;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-partitions.lisp", position = 5926L)
  public static SubLObject cb_set_partition_save_quoted_ontologies(final SubLObject part_save, final SubLObject quoted_ontologies)
  {
    assert NIL != cb_partition_save_p( part_save ) : part_save;
    assert NIL != Types.listp( quoted_ontologies ) : quoted_ontologies;
    _csetf_cb_part_save_quoted_ontologies( part_save, quoted_ontologies );
    return part_save;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-partitions.lisp", position = 6187L)
  public static SubLObject cb_set_partition_save_terms(final SubLObject part_save, final SubLObject terms)
  {
    assert NIL != cb_partition_save_p( part_save ) : part_save;
    assert NIL != Types.listp( terms ) : terms;
    _csetf_cb_part_save_terms( part_save, terms );
    return part_save;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-partitions.lisp", position = 6388L)
  public static SubLObject cb_partition_save_compute_partition(final SubLObject part_save)
  {
    assert NIL != cb_partition_save_p( part_save ) : part_save;
    SubLObject partition = NIL;
    SubLObject cdolist_list_var = cb_partition_save_predefined_methods( part_save );
    SubLObject method = NIL;
    method = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      partition = ConsesLow.cons( ConsesLow.list( $kw44$FUNCTION, method ), partition );
      cdolist_list_var = cdolist_list_var.rest();
      method = cdolist_list_var.first();
    }
    cdolist_list_var = cb_partition_save_ontologies( part_save );
    SubLObject ontology = NIL;
    ontology = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      partition = ConsesLow.cons( ConsesLow.list( $kw45$ONTOLOGY, ontology ), partition );
      cdolist_list_var = cdolist_list_var.rest();
      ontology = cdolist_list_var.first();
    }
    cdolist_list_var = cb_partition_save_quoted_ontologies( part_save );
    SubLObject quoted_ontology = NIL;
    quoted_ontology = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      partition = ConsesLow.cons( ConsesLow.list( $kw46$QUOTED_ONTOLOGY, quoted_ontology ), partition );
      cdolist_list_var = cdolist_list_var.rest();
      quoted_ontology = cdolist_list_var.first();
    }
    cdolist_list_var = cb_partition_save_terms( part_save );
    SubLObject v_term = NIL;
    v_term = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      partition = ConsesLow.cons( ConsesLow.list( $kw47$TERM, v_term ), partition );
      cdolist_list_var = cdolist_list_var.rest();
      v_term = cdolist_list_var.first();
    }
    partition = Sequences.nreverse( partition );
    return partition;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-partitions.lisp", position = 7071L)
  public static SubLObject cb_add_partition_save_ontology(final SubLObject part_save, final SubLObject ontology)
  {
    assert NIL != cb_partition_save_p( part_save ) : part_save;
    assert NIL != forts.fort_p( ontology ) : ontology;
    if( NIL == conses_high.member( ontology, cb_part_save_ontologies( part_save ), Symbols.symbol_function( EQUAL ), Symbols.symbol_function( IDENTITY ) ) )
    {
      final SubLObject new_cons = ConsesLow.cons( ontology, NIL );
      final SubLObject list = cb_part_save_ontologies( part_save );
      if( NIL != list )
      {
        subl_macros.rplacd_last( list, new_cons );
      }
      else
      {
        _csetf_cb_part_save_ontologies( part_save, new_cons );
      }
    }
    return part_save;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-partitions.lisp", position = 7325L)
  public static SubLObject cb_add_partition_save_quoted_ontology(final SubLObject part_save, final SubLObject quoted_ontology)
  {
    assert NIL != cb_partition_save_p( part_save ) : part_save;
    assert NIL != forts.fort_p( quoted_ontology ) : quoted_ontology;
    if( NIL == conses_high.member( quoted_ontology, cb_part_save_quoted_ontologies( part_save ), Symbols.symbol_function( EQUAL ), Symbols.symbol_function( IDENTITY ) ) )
    {
      final SubLObject new_cons = ConsesLow.cons( quoted_ontology, NIL );
      final SubLObject list = cb_part_save_quoted_ontologies( part_save );
      if( NIL != list )
      {
        subl_macros.rplacd_last( list, new_cons );
      }
      else
      {
        _csetf_cb_part_save_quoted_ontologies( part_save, new_cons );
      }
    }
    return part_save;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-partitions.lisp", position = 7600L)
  public static SubLObject cb_add_partition_save_term(final SubLObject part_save, final SubLObject v_term)
  {
    assert NIL != cb_partition_save_p( part_save ) : part_save;
    assert NIL != forts.fort_p( v_term ) : v_term;
    if( NIL == conses_high.member( v_term, cb_part_save_terms( part_save ), Symbols.symbol_function( EQUAL ), Symbols.symbol_function( IDENTITY ) ) )
    {
      final SubLObject new_cons = ConsesLow.cons( v_term, NIL );
      final SubLObject list = cb_part_save_terms( part_save );
      if( NIL != list )
      {
        subl_macros.rplacd_last( list, new_cons );
      }
      else
      {
        _csetf_cb_part_save_terms( part_save, new_cons );
      }
    }
    return part_save;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-partitions.lisp", position = 7819L)
  public static SubLObject cb_reset_partition_save_file_info(final SubLObject part_save)
  {
    cb_set_partition_save_specified_directory( part_save, $str49$ );
    cb_set_partition_save_public_directory( part_save, cb_compute_partition_save_public_directory() );
    cb_set_partition_save_personal_directory( part_save, cb_compute_partition_save_personal_directory() );
    cb_set_partition_save_filename( part_save, $str49$ );
    return part_save;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-partitions.lisp", position = 8223L)
  public static SubLObject cb_reset_partition_save_scope_info(final SubLObject part_save)
  {
    cb_set_partition_save_predefined_methods( part_save, NIL );
    cb_set_partition_save_ontologies( part_save, NIL );
    cb_set_partition_save_quoted_ontologies( part_save, NIL );
    cb_set_partition_save_terms( part_save, NIL );
    return part_save;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-partitions.lisp", position = 8520L)
  public static SubLObject cb_perform_partition_save(final SubLObject filename, final SubLObject part_save)
  {
    final SubLObject partition = cb_partition_save_compute_partition( part_save );
    partitions.save_partition( filename, partition );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-partitions.lisp", position = 8841L)
  public static SubLObject cb_perform_partition_load(final SubLObject partition_files)
  {
    SubLObject cdolist_list_var = partition_files;
    SubLObject filename = NIL;
    filename = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      partitions.load_partition( filename, UNPROVIDED );
      cdolist_list_var = cdolist_list_var.rest();
      filename = cdolist_list_var.first();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-partitions.lisp", position = 9475L)
  public static SubLObject cb_all_partition_methods()
  {
    return Mapping.mapcar( Symbols.symbol_function( $sym51$FIRST ), $cb_partition_method_table$.getGlobalValue() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-partitions.lisp", position = 9574L)
  public static SubLObject cb_partition_save_method_id(final SubLObject method)
  {
    return Sequences.position( method, $cb_partition_method_table$.getGlobalValue(), Symbols.symbol_function( EQ ), Symbols.symbol_function( $sym51$FIRST ), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-partitions.lisp", position = 9696L)
  public static SubLObject cb_partition_save_method_description(final SubLObject method)
  {
    return conses_high.second( Sequences.find( method, $cb_partition_method_table$.getGlobalValue(), Symbols.symbol_function( EQ ), Symbols.symbol_function( $sym51$FIRST ), UNPROVIDED, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-partitions.lisp", position = 9832L)
  public static SubLObject scope_partition_all_kb_additions()
  {
    SubLObject start = constant_handles.new_constant_suid_threshold();
    SubLObject table_var = constant_handles.do_constants_table();
    SubLObject end_var;
    SubLObject end;
    SubLObject id;
    SubLObject constant;
    for( end = ( end_var = id_index.id_index_next_id( table_var ) ), id = NIL, id = start; !id.numGE( end_var ); id = number_utilities.f_1X( id ) )
    {
      constant = id_index.id_index_lookup( table_var, id, UNPROVIDED );
      if( NIL != constant )
      {
        partitions.scope_partition_term( constant );
      }
    }
    start = nart_handles.new_nart_id_threshold();
    table_var = nart_handles.do_narts_table();
    SubLObject nart;
    for( end = ( end_var = id_index.id_index_next_id( table_var ) ), id = NIL, id = start; !id.numGE( end_var ); id = number_utilities.f_1X( id ) )
    {
      nart = id_index.id_index_lookup( table_var, id, UNPROVIDED );
      if( NIL != nart )
      {
        partitions.scope_partition_term( nart );
      }
    }
    start = assertion_handles.get_file_backed_assertion_internal_id_threshold();
    table_var = assertion_handles.do_assertions_table();
    SubLObject assertion;
    for( end = ( end_var = id_index.id_index_next_id( table_var ) ), id = NIL, id = start; !id.numGE( end_var ); id = number_utilities.f_1X( id ) )
    {
      assertion = id_index.id_index_lookup( table_var, id, UNPROVIDED );
      if( NIL != assertion )
      {
        partitions.scope_partition_assertion( assertion );
      }
    }
    start = deduction_handles.get_file_backed_deduction_internal_id_threshold();
    table_var = deduction_handles.do_deductions_table();
    SubLObject deduction;
    for( end = ( end_var = id_index.id_index_next_id( table_var ) ), id = NIL, id = start; !id.numGE( end_var ); id = number_utilities.f_1X( id ) )
    {
      deduction = id_index.id_index_lookup( table_var, id, UNPROVIDED );
      if( NIL != deduction )
      {
        partitions.scope_partition_deduction( deduction );
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-partitions.lisp", position = 10384L)
  public static SubLObject scope_partition_all_assertions_in_hlmt_naut()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject idx = assertion_handles.do_assertions_table();
    final SubLObject mess = $str54$Scoping_assertions_in_microtheori;
    final SubLObject total = id_index.id_index_count( idx );
    SubLObject sofar = ZERO_INTEGER;
    assert NIL != Types.stringp( mess ) : mess;
    final SubLObject _prev_bind_0 = utilities_macros.$last_percent_progress_index$.currentBinding( thread );
    final SubLObject _prev_bind_2 = utilities_macros.$last_percent_progress_prediction$.currentBinding( thread );
    final SubLObject _prev_bind_3 = utilities_macros.$within_noting_percent_progress$.currentBinding( thread );
    final SubLObject _prev_bind_4 = utilities_macros.$percent_progress_start_time$.currentBinding( thread );
    try
    {
      utilities_macros.$last_percent_progress_index$.bind( ZERO_INTEGER, thread );
      utilities_macros.$last_percent_progress_prediction$.bind( NIL, thread );
      utilities_macros.$within_noting_percent_progress$.bind( T, thread );
      utilities_macros.$percent_progress_start_time$.bind( Time.get_universal_time(), thread );
      try
      {
        utilities_macros.noting_percent_progress_preamble( mess );
        final SubLObject idx_$1 = idx;
        if( NIL == id_index.id_index_objects_empty_p( idx_$1, $kw55$SKIP ) )
        {
          final SubLObject idx_$2 = idx_$1;
          if( NIL == id_index.id_index_dense_objects_empty_p( idx_$2, $kw55$SKIP ) )
          {
            final SubLObject vector_var = id_index.id_index_dense_objects( idx_$2 );
            final SubLObject backwardP_var = NIL;
            SubLObject length;
            SubLObject v_iteration;
            SubLObject a_id;
            SubLObject a_handle;
            SubLObject assertion;
            for( length = Sequences.length( vector_var ), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL( length ); v_iteration = Numbers.add( v_iteration, ONE_INTEGER ) )
            {
              a_id = ( ( NIL != backwardP_var ) ? Numbers.subtract( length, v_iteration, ONE_INTEGER ) : v_iteration );
              a_handle = Vectors.aref( vector_var, a_id );
              if( NIL == id_index.id_index_tombstone_p( a_handle ) || NIL == id_index.id_index_skip_tombstones_p( $kw55$SKIP ) )
              {
                if( NIL != id_index.id_index_tombstone_p( a_handle ) )
                {
                  a_handle = $kw55$SKIP;
                }
                assertion = assertion_handles.resolve_assertion_id_value_pair( a_id, a_handle );
                if( NIL != assertion_in_hlmt_naut_p( assertion ) )
                {
                  partitions.scope_partition_assertion_and_meta_assertions( assertion );
                }
                sofar = Numbers.add( sofar, ONE_INTEGER );
                utilities_macros.note_percent_progress( sofar, total );
              }
            }
          }
          final SubLObject idx_$3 = idx_$1;
          if( NIL == id_index.id_index_sparse_objects_empty_p( idx_$3 ) || NIL == id_index.id_index_skip_tombstones_p( $kw55$SKIP ) )
          {
            final SubLObject sparse = id_index.id_index_sparse_objects( idx_$3 );
            SubLObject a_id2 = id_index.id_index_sparse_id_threshold( idx_$3 );
            final SubLObject end_id = id_index.id_index_next_id( idx_$3 );
            final SubLObject v_default = ( NIL != id_index.id_index_skip_tombstones_p( $kw55$SKIP ) ) ? NIL : $kw55$SKIP;
            while ( a_id2.numL( end_id ))
            {
              final SubLObject a_handle2 = Hashtables.gethash_without_values( a_id2, sparse, v_default );
              if( NIL == id_index.id_index_skip_tombstones_p( $kw55$SKIP ) || NIL == id_index.id_index_tombstone_p( a_handle2 ) )
              {
                final SubLObject assertion2 = assertion_handles.resolve_assertion_id_value_pair( a_id2, a_handle2 );
                if( NIL != assertion_in_hlmt_naut_p( assertion2 ) )
                {
                  partitions.scope_partition_assertion_and_meta_assertions( assertion2 );
                }
                sofar = Numbers.add( sofar, ONE_INTEGER );
                utilities_macros.note_percent_progress( sofar, total );
              }
              a_id2 = Numbers.add( a_id2, ONE_INTEGER );
            }
          }
        }
      }
      finally
      {
        final SubLObject _prev_bind_0_$4 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          utilities_macros.noting_percent_progress_postamble();
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$4, thread );
        }
      }
    }
    finally
    {
      utilities_macros.$percent_progress_start_time$.rebind( _prev_bind_4, thread );
      utilities_macros.$within_noting_percent_progress$.rebind( _prev_bind_3, thread );
      utilities_macros.$last_percent_progress_prediction$.rebind( _prev_bind_2, thread );
      utilities_macros.$last_percent_progress_index$.rebind( _prev_bind_0, thread );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-partitions.lisp", position = 10665L)
  public static SubLObject assertion_in_hlmt_naut_p(final SubLObject v_object)
  {
    return makeBoolean( NIL != assertion_handles.assertion_p( v_object ) && NIL != hlmt.hlmt_naut_p( assertions_high.assertion_mt( v_object ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-partitions.lisp", position = 11104L)
  public static SubLObject cb_current_partition_save()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return $cb_current_partition_save$.getDynamicValue( thread );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-partitions.lisp", position = 11187L)
  public static SubLObject cb_ensure_current_partition_save()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == $cb_current_partition_save$.getDynamicValue( thread ) )
    {
      $cb_current_partition_save$.setDynamicValue( new_cb_partition_save(), thread );
    }
    SubLObject error = NIL;
    try
    {
      thread.throwStack.push( subl_macro_promotions.$catch_error_message_target$.getGlobalValue() );
      final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding( thread );
      try
      {
        Errors.$error_handler$.bind( $sym57$CATCH_ERROR_MESSAGE_HANDLER, thread );
        try
        {
          cb_partition_save_terms( $cb_current_partition_save$.getDynamicValue( thread ) );
        }
        catch( final Throwable catch_var )
        {
          Errors.handleThrowable( catch_var, NIL );
        }
      }
      finally
      {
        Errors.$error_handler$.rebind( _prev_bind_0, thread );
      }
    }
    catch( final Throwable ccatch_env_var )
    {
      error = Errors.handleThrowable( ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue() );
    }
    finally
    {
      thread.throwStack.pop();
    }
    if( NIL != error )
    {
      $cb_current_partition_save$.setDynamicValue( new_cb_partition_save(), thread );
    }
    return cb_current_partition_save();
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-partitions.lisp", position = 11654L)
  public static SubLObject cb_partition_save(SubLObject args)
  {
    if( args == UNPROVIDED )
    {
      args = NIL;
    }
    return cb_partition_save_guts();
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-partitions.lisp", position = 11816L)
  public static SubLObject cb_link_partition_save(SubLObject linktext)
  {
    if( linktext == UNPROVIDED )
    {
      linktext = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == linktext )
    {
      linktext = $str59$_Partition_Save_;
    }
    final SubLObject frame_name_var = cb_utilities.cb_frame_name( $kw60$MAIN );
    html_utilities.html_markup( html_macros.$html_anchor_head$.getGlobalValue() );
    html_utilities.html_markup( html_macros.$html_anchor_href$.getGlobalValue() );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    cb_parameters.cyc_cgi_url_int();
    html_utilities.html_princ( $str61$cb_partition_save );
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
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-partitions.lisp", position = 12127L)
  public static SubLObject cb_partition_save_guts()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    cb_ensure_current_partition_save();
    final SubLObject part_save = cb_current_partition_save();
    final SubLObject title_var = $str64$Partition_Save;
    final SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding( thread );
    try
    {
      html_macros.$html_id_space_id_generator$.bind( ( NIL != integer_sequence_generator.integer_sequence_generator_p( html_macros.$html_id_space_id_generator$.getDynamicValue( thread ) ) )
          ? html_macros.$html_id_space_id_generator$.getDynamicValue( thread )
          : integer_sequence_generator.new_integer_sequence_generator( UNPROVIDED, UNPROVIDED, UNPROVIDED ), thread );
      html_utilities.html_markup( $str67$__DOCTYPE_html_PUBLIC_____W3C__DT );
      if( NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue( thread ) )
      {
        html_utilities.html_source_readability_terpri( UNPROVIDED );
        html_utilities.html_markup( $str68$_meta_http_equiv__X_UA_Compatible );
      }
      html_utilities.html_source_readability_terpri( UNPROVIDED );
      final SubLObject _prev_bind_0_$5 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding( thread );
      try
      {
        cyc_file_dependencies.$html_emitted_file_dependencies$.bind( ( cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue( thread ) == $kw69$UNINITIALIZED ) ? ConsesLow.list( EMPTY_SUBL_OBJECT_ARRAY )
            : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue( thread ), thread );
        html_utilities.html_markup( html_macros.$html_html_head$.getGlobalValue() );
        html_utilities.html_markup( html_macros.$html_head_head$.getGlobalValue() );
        html_macros.html_head_content_type();
        cb_parameters.cb_head_shortcut_icon();
        html_utilities.html_meta_robot_instructions( cb_parameters.$cb_permit_robots_to_indexP$.getDynamicValue( thread ), cb_parameters.$cb_permit_robots_to_followP$.getDynamicValue( thread ) );
        cyc_file_dependencies.css( $kw70$CB_CYC );
        dhtml_macros.html_basic_cb_scripts();
        if( NIL != title_var )
        {
          html_utilities.html_source_readability_terpri( UNPROVIDED );
          html_utilities.html_markup( html_macros.$html_title_head$.getGlobalValue() );
          html_utilities.html_princ( title_var );
          html_utilities.html_markup( html_macros.$html_title_tail$.getGlobalValue() );
        }
        html_complete.html_complete_script();
        cyc_file_dependencies.css( $kw71$SAM_AUTOCOMPLETE_CSS );
        html_utilities.html_markup( html_macros.$html_head_tail$.getGlobalValue() );
        html_utilities.html_source_readability_terpri( UNPROVIDED );
        final SubLObject _prev_bind_0_$6 = html_macros.$html_inside_bodyP$.currentBinding( thread );
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
          html_utilities.html_markup( $str73$yui_skin_sam );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
          final SubLObject _prev_bind_0_$7 = html_macros.$html_safe_print$.currentBinding( thread );
          try
          {
            html_macros.$html_safe_print$.bind( T, thread );
            html_utilities.html_markup( html_macros.$html_div_head$.getGlobalValue() );
            html_utilities.html_markup( html_macros.$html_attribute_id$.getGlobalValue() );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_markup( $str74$reloadFrameButton );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            final SubLObject _prev_bind_0_$8 = html_macros.$html_safe_print$.currentBinding( thread );
            try
            {
              html_macros.$html_safe_print$.bind( T, thread );
              html_utilities.html_markup( html_macros.$html_input_head$.getGlobalValue() );
              html_utilities.html_markup( html_macros.$html_input_type$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( $str75$button );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( html_macros.$html_input_name$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( $str76$reload );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( html_macros.$html_input_value$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_princ( $str77$Refresh_Frames );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              if( NIL != html_macros.$html_input_disabledP$.getDynamicValue( thread ) )
              {
                html_utilities.html_simple_attribute( html_macros.$html_input_disabled$.getGlobalValue() );
              }
              html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            }
            finally
            {
              html_macros.$html_safe_print$.rebind( _prev_bind_0_$8, thread );
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
            html_utilities.html_markup( $str78$post );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            if( NIL != frame_name_var )
            {
              html_utilities.html_markup( html_macros.$html_form_target$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( frame_name_var );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            }
            html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            final SubLObject _prev_bind_0_$9 = html_macros.$html_safe_print$.currentBinding( thread );
            final SubLObject _prev_bind_2 = html_macros.$within_html_form$.currentBinding( thread );
            final SubLObject _prev_bind_3 = html_macros.$html_form_field_uniquifier_code$.currentBinding( thread );
            try
            {
              html_macros.$html_safe_print$.bind( T, thread );
              html_macros.$within_html_form$.bind( T, thread );
              html_macros.$html_form_field_uniquifier_code$.bind( html_macros.next_html_form_field_uniquifier_code(), thread );
              html_utilities.html_hidden_input( $str79$cb_handle_partition_save, T, UNPROVIDED );
              cb_partition_save_header( part_save );
              html_utilities.html_hr( UNPROVIDED, UNPROVIDED );
              cb_partition_save_filename_section( part_save );
              html_utilities.html_hr( UNPROVIDED, UNPROVIDED );
              cb_partition_save_scope_section( part_save );
              html_macros.embed_form_field_code( html_macros.$html_form_field_uniquifier_code$.getDynamicValue( thread ) );
            }
            finally
            {
              html_macros.$html_form_field_uniquifier_code$.rebind( _prev_bind_3, thread );
              html_macros.$within_html_form$.rebind( _prev_bind_2, thread );
              html_macros.$html_safe_print$.rebind( _prev_bind_0_$9, thread );
            }
            html_utilities.html_markup( html_macros.$html_form_tail$.getGlobalValue() );
            html_utilities.html_source_readability_terpri( UNPROVIDED );
            html_utilities.html_copyright_notice();
          }
          finally
          {
            html_macros.$html_safe_print$.rebind( _prev_bind_0_$7, thread );
          }
          html_utilities.html_markup( html_macros.$html_body_tail$.getGlobalValue() );
          html_utilities.html_source_readability_terpri( UNPROVIDED );
        }
        finally
        {
          html_macros.$html_inside_bodyP$.rebind( _prev_bind_0_$6, thread );
        }
        html_utilities.html_markup( html_macros.$html_html_tail$.getGlobalValue() );
      }
      finally
      {
        cyc_file_dependencies.$html_emitted_file_dependencies$.rebind( _prev_bind_0_$5, thread );
      }
      html_utilities.html_source_readability_terpri( UNPROVIDED );
    }
    finally
    {
      html_macros.$html_id_space_id_generator$.rebind( _prev_bind_0, thread );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-partitions.lisp", position = 12648L)
  public static SubLObject cb_partition_save_header(final SubLObject part_save)
  {
    cb_utilities.cb_help_preamble( $kw80$CB_PARTITION_SAVE, UNPROVIDED, UNPROVIDED );
    html_utilities.html_reset_input( $str82$Reset_Form );
    html_utilities.html_indent( UNPROVIDED );
    html_utilities.html_submit_input( $str83$Update_Partition_Scope, $str84$update, UNPROVIDED );
    html_utilities.html_indent( UNPROVIDED );
    html_utilities.html_submit_input( $str85$Save_Partition, $str86$save, UNPROVIDED );
    html_utilities.html_indent( UNPROVIDED );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-partitions.lisp", position = 13032L)
  public static SubLObject cb_partition_save_filename_section(final SubLObject part_save)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    html_utilities.html_markup( html_macros.$html_big_head$.getGlobalValue() );
    html_utilities.html_princ_strong( $str87$Partition_Filename );
    html_utilities.html_markup( html_macros.$html_big_tail$.getGlobalValue() );
    final SubLObject personal_directory = cb_partition_save_personal_directory( part_save );
    final SubLObject public_directory = cb_partition_save_public_directory( part_save );
    final SubLObject specified_directory = cb_partition_save_specified_directory( part_save );
    html_utilities.html_newline( TWO_INTEGER );
    html_utilities.html_princ_strong( $str88$Choose_or_specify_a_directory__ );
    html_utilities.html_markup( html_macros.$html_table_head$.getGlobalValue() );
    html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
    final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding( thread );
    try
    {
      html_macros.$html_safe_print$.bind( T, thread );
      if( NIL != personal_directory )
      {
        html_utilities.html_markup( html_macros.$html_table_row_head$.getGlobalValue() );
        html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
        final SubLObject _prev_bind_0_$10 = html_macros.$html_safe_print$.currentBinding( thread );
        try
        {
          html_macros.$html_safe_print$.bind( T, thread );
          html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
          html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
          final SubLObject _prev_bind_0_$11 = html_macros.$html_safe_print$.currentBinding( thread );
          try
          {
            html_macros.$html_safe_print$.bind( T, thread );
            html_utilities.html_radio_input( $str89$directory, $str90$personal, string_utilities.empty_string_p( specified_directory ), UNPROVIDED );
            html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
            html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            final SubLObject _prev_bind_0_$12 = html_macros.$html_safe_print$.currentBinding( thread );
            try
            {
              html_macros.$html_safe_print$.bind( T, thread );
              html_utilities.html_markup( html_macros.$html_teletype_head$.getGlobalValue() );
              html_utilities.html_princ( personal_directory );
              html_utilities.html_markup( html_macros.$html_teletype_tail$.getGlobalValue() );
            }
            finally
            {
              html_macros.$html_safe_print$.rebind( _prev_bind_0_$12, thread );
            }
            html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
          }
          finally
          {
            html_macros.$html_safe_print$.rebind( _prev_bind_0_$11, thread );
          }
          html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
        }
        finally
        {
          html_macros.$html_safe_print$.rebind( _prev_bind_0_$10, thread );
        }
        html_utilities.html_markup( html_macros.$html_table_row_tail$.getGlobalValue() );
        html_utilities.html_source_readability_terpri( UNPROVIDED );
      }
      if( NIL != public_directory )
      {
        html_utilities.html_markup( html_macros.$html_table_row_head$.getGlobalValue() );
        html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
        final SubLObject _prev_bind_0_$13 = html_macros.$html_safe_print$.currentBinding( thread );
        try
        {
          html_macros.$html_safe_print$.bind( T, thread );
          html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
          html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
          final SubLObject _prev_bind_0_$14 = html_macros.$html_safe_print$.currentBinding( thread );
          try
          {
            html_macros.$html_safe_print$.bind( T, thread );
            html_utilities.html_radio_input( $str89$directory, $str91$public, makeBoolean( NIL != string_utilities.empty_string_p( specified_directory ) && NIL == personal_directory ), UNPROVIDED );
          }
          finally
          {
            html_macros.$html_safe_print$.rebind( _prev_bind_0_$14, thread );
          }
          html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
          html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
          html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
          final SubLObject _prev_bind_0_$15 = html_macros.$html_safe_print$.currentBinding( thread );
          try
          {
            html_macros.$html_safe_print$.bind( T, thread );
            html_utilities.html_markup( html_macros.$html_teletype_head$.getGlobalValue() );
            html_utilities.html_princ( public_directory );
            html_utilities.html_markup( html_macros.$html_teletype_tail$.getGlobalValue() );
          }
          finally
          {
            html_macros.$html_safe_print$.rebind( _prev_bind_0_$15, thread );
          }
          html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
        }
        finally
        {
          html_macros.$html_safe_print$.rebind( _prev_bind_0_$13, thread );
        }
        html_utilities.html_markup( html_macros.$html_table_row_tail$.getGlobalValue() );
        html_utilities.html_source_readability_terpri( UNPROVIDED );
      }
      html_utilities.html_markup( html_macros.$html_table_row_head$.getGlobalValue() );
      html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
      final SubLObject _prev_bind_0_$16 = html_macros.$html_safe_print$.currentBinding( thread );
      try
      {
        html_macros.$html_safe_print$.bind( T, thread );
        html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
        html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
        final SubLObject _prev_bind_0_$17 = html_macros.$html_safe_print$.currentBinding( thread );
        try
        {
          html_macros.$html_safe_print$.bind( T, thread );
          html_script_utilities.html_focus_radio_input( $str89$directory, $str92$specified_directory, $str93$specified, makeBoolean( NIL == string_utilities.empty_string_p( specified_directory ) ), UNPROVIDED );
        }
        finally
        {
          html_macros.$html_safe_print$.rebind( _prev_bind_0_$17, thread );
        }
        html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
        html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
        html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
        final SubLObject _prev_bind_0_$18 = html_macros.$html_safe_print$.currentBinding( thread );
        try
        {
          html_macros.$html_safe_print$.bind( T, thread );
          html_utilities.html_text_input( $str92$specified_directory, specified_directory, $int94$60 );
          html_script_utilities.html_clear_input_button( $str92$specified_directory, $str95$Clear, UNPROVIDED );
        }
        finally
        {
          html_macros.$html_safe_print$.rebind( _prev_bind_0_$18, thread );
        }
        html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
      }
      finally
      {
        html_macros.$html_safe_print$.rebind( _prev_bind_0_$16, thread );
      }
      html_utilities.html_markup( html_macros.$html_table_row_tail$.getGlobalValue() );
      html_utilities.html_source_readability_terpri( UNPROVIDED );
    }
    finally
    {
      html_macros.$html_safe_print$.rebind( _prev_bind_0, thread );
    }
    html_utilities.html_markup( html_macros.$html_table_tail$.getGlobalValue() );
    final SubLObject filename = cb_partition_save_filename( part_save );
    final SubLObject extension = $cb_partition_extension$.getGlobalValue();
    html_utilities.html_newline( UNPROVIDED );
    html_utilities.html_markup( html_macros.$html_table_head$.getGlobalValue() );
    html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
    final SubLObject _prev_bind_2 = html_macros.$html_safe_print$.currentBinding( thread );
    try
    {
      html_macros.$html_safe_print$.bind( T, thread );
      html_utilities.html_markup( html_macros.$html_table_row_head$.getGlobalValue() );
      html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
      final SubLObject _prev_bind_0_$19 = html_macros.$html_safe_print$.currentBinding( thread );
      try
      {
        html_macros.$html_safe_print$.bind( T, thread );
        html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
        html_utilities.html_markup( html_macros.$html_table_data_align$.getGlobalValue() );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        html_utilities.html_markup( html_utilities.html_align( $kw96$LEFT ) );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
        final SubLObject _prev_bind_0_$20 = html_macros.$html_safe_print$.currentBinding( thread );
        try
        {
          html_macros.$html_safe_print$.bind( T, thread );
          html_utilities.html_princ_strong( $str97$Specify_the_filename__ );
        }
        finally
        {
          html_macros.$html_safe_print$.rebind( _prev_bind_0_$20, thread );
        }
        html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
        html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
        html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
        final SubLObject _prev_bind_0_$21 = html_macros.$html_safe_print$.currentBinding( thread );
        try
        {
          html_macros.$html_safe_print$.bind( T, thread );
        }
        finally
        {
          html_macros.$html_safe_print$.rebind( _prev_bind_0_$21, thread );
        }
        html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
        html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
        html_utilities.html_markup( html_macros.$html_table_data_align$.getGlobalValue() );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        html_utilities.html_markup( html_utilities.html_align( $kw96$LEFT ) );
        html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
        html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
        final SubLObject _prev_bind_0_$22 = html_macros.$html_safe_print$.currentBinding( thread );
        try
        {
          html_macros.$html_safe_print$.bind( T, thread );
          html_utilities.html_princ_strong( $str98$Extension );
        }
        finally
        {
          html_macros.$html_safe_print$.rebind( _prev_bind_0_$22, thread );
        }
        html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
      }
      finally
      {
        html_macros.$html_safe_print$.rebind( _prev_bind_0_$19, thread );
      }
      html_utilities.html_markup( html_macros.$html_table_row_tail$.getGlobalValue() );
      html_utilities.html_source_readability_terpri( UNPROVIDED );
      html_utilities.html_markup( html_macros.$html_table_row_head$.getGlobalValue() );
      html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
      final SubLObject _prev_bind_0_$23 = html_macros.$html_safe_print$.currentBinding( thread );
      try
      {
        html_macros.$html_safe_print$.bind( T, thread );
        html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
        html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
        final SubLObject _prev_bind_0_$24 = html_macros.$html_safe_print$.currentBinding( thread );
        try
        {
          html_macros.$html_safe_print$.bind( T, thread );
          html_script_utilities.html_clear_input_button( $str99$partition_filename, $str95$Clear, UNPROVIDED );
          html_utilities.html_text_input( $str99$partition_filename, filename, $int100$40 );
        }
        finally
        {
          html_macros.$html_safe_print$.rebind( _prev_bind_0_$24, thread );
        }
        html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
        html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
        html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
        final SubLObject _prev_bind_0_$25 = html_macros.$html_safe_print$.currentBinding( thread );
        try
        {
          html_macros.$html_safe_print$.bind( T, thread );
          html_utilities.html_markup( html_macros.$html_teletype_head$.getGlobalValue() );
          html_utilities.html_princ( $str1$_ );
          html_utilities.html_markup( html_macros.$html_teletype_tail$.getGlobalValue() );
        }
        finally
        {
          html_macros.$html_safe_print$.rebind( _prev_bind_0_$25, thread );
        }
        html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
        html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
        html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
        final SubLObject _prev_bind_0_$26 = html_macros.$html_safe_print$.currentBinding( thread );
        try
        {
          html_macros.$html_safe_print$.bind( T, thread );
          html_utilities.html_markup( html_macros.$html_teletype_head$.getGlobalValue() );
          html_utilities.html_princ( extension );
          html_utilities.html_markup( html_macros.$html_teletype_tail$.getGlobalValue() );
        }
        finally
        {
          html_macros.$html_safe_print$.rebind( _prev_bind_0_$26, thread );
        }
        html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
      }
      finally
      {
        html_macros.$html_safe_print$.rebind( _prev_bind_0_$23, thread );
      }
      html_utilities.html_markup( html_macros.$html_table_row_tail$.getGlobalValue() );
      html_utilities.html_source_readability_terpri( UNPROVIDED );
    }
    finally
    {
      html_macros.$html_safe_print$.rebind( _prev_bind_2, thread );
    }
    html_utilities.html_markup( html_macros.$html_table_tail$.getGlobalValue() );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-partitions.lisp", position = 15028L)
  public static SubLObject cb_partition_save_scope_section(final SubLObject part_save)
  {
    html_utilities.html_markup( html_macros.$html_big_head$.getGlobalValue() );
    html_utilities.html_princ_strong( $str101$Partition_Scope );
    html_utilities.html_markup( html_macros.$html_big_tail$.getGlobalValue() );
    html_utilities.html_indent( FOUR_INTEGER );
    html_utilities.html_submit_input( $str102$Clear_Partition_Scope, $str103$reset_scope, UNPROVIDED );
    html_utilities.html_newline( TWO_INTEGER );
    cb_partition_save_predefined_methods_section( part_save );
    html_utilities.html_newline( TWO_INTEGER );
    cb_partition_save_ontologies_section( part_save );
    html_utilities.html_newline( TWO_INTEGER );
    cb_partition_save_quoted_ontologies_section( part_save );
    html_utilities.html_newline( TWO_INTEGER );
    cb_partition_save_terms_section( part_save );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-partitions.lisp", position = 15615L)
  public static SubLObject cb_partition_save_predefined_methods_section(final SubLObject part_save)
  {
    final SubLObject partition_methods = cb_partition_save_predefined_methods( part_save );
    final SubLObject all_partition_methods = cb_all_partition_methods();
    html_utilities.html_markup( html_macros.$html_strong_head$.getGlobalValue() );
    html_utilities.html_princ( $str104$Predefined_Methods___ );
    html_utilities.html_markup( html_macros.$html_strong_tail$.getGlobalValue() );
    SubLObject cdolist_list_var = all_partition_methods;
    SubLObject method = NIL;
    method = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject currentP = subl_promotions.memberP( method, partition_methods, UNPROVIDED, UNPROVIDED );
      html_utilities.html_newline( UNPROVIDED );
      cb_partition_save_method_checkbox( method, currentP );
      cdolist_list_var = cdolist_list_var.rest();
      method = cdolist_list_var.first();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-partitions.lisp", position = 16071L)
  public static SubLObject cb_partition_save_method_checkbox(final SubLObject method, final SubLObject checkedP)
  {
    final SubLObject id = cb_partition_save_method_id( method );
    final SubLObject description = cb_partition_save_method_description( method );
    final SubLObject name = PrintLow.format( NIL, $str105$method__A, id );
    html_utilities.html_checkbox_input( name, id, checkedP, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    html_utilities.html_princ( description );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-partitions.lisp", position = 16386L)
  public static SubLObject cb_partition_save_ontologies_section(final SubLObject part_save)
  {
    final SubLObject partition_ontologies = cb_partition_save_ontologies( part_save );
    html_utilities.html_markup( html_macros.$html_strong_head$.getGlobalValue() );
    html_utilities.html_princ( $str106$Ontologies__instances_and_specs__ );
    html_utilities.html_markup( html_macros.$html_strong_tail$.getGlobalValue() );
    if( NIL == partition_ontologies )
    {
      html_utilities.html_princ( $str107$None );
    }
    else
    {
      html_utilities.html_newline( UNPROVIDED );
      SubLObject list_var = NIL;
      SubLObject ontology = NIL;
      SubLObject index = NIL;
      list_var = partition_ontologies;
      ontology = list_var.first();
      for( index = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest(), ontology = list_var.first(), index = Numbers.add( ONE_INTEGER, index ) )
      {
        final SubLObject id = cb_utilities.cb_fort_identifier( ontology );
        final SubLObject name = PrintLow.format( NIL, $str108$ontology__A, index );
        html_utilities.html_markup( html_macros.$html_no_break_head$.getGlobalValue() );
        html_utilities.html_checkbox_input( name, id, T, UNPROVIDED, UNPROVIDED, UNPROVIDED );
        cb_utilities.cb_form( ontology, UNPROVIDED, UNPROVIDED );
        html_utilities.html_markup( html_macros.$html_no_break_tail$.getGlobalValue() );
        html_utilities.html_indent( TWO_INTEGER );
      }
    }
    html_utilities.html_newline( UNPROVIDED );
    html_utilities.html_princ_strong( $str109$Add_Ontology__ );
    html_utilities.html_indent( FOUR_INTEGER );
    html_utilities.html_submit_input( $str83$Update_Partition_Scope, $str84$update, UNPROVIDED );
    html_utilities.html_newline( UNPROVIDED );
    html_complete.html_complete_button( $str110$ontology, $str111$Complete, $const112$Collection, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    html_utilities.html_text_input( $str110$ontology, NIL, $int100$40 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-partitions.lisp", position = 17275L)
  public static SubLObject cb_partition_save_quoted_ontologies_section(final SubLObject part_save)
  {
    final SubLObject partition_quoted_ontologies = cb_partition_save_quoted_ontologies( part_save );
    html_utilities.html_markup( html_macros.$html_strong_head$.getGlobalValue() );
    html_utilities.html_princ( $str113$Quoted_Ontologies__quoted_instanc );
    html_utilities.html_markup( html_macros.$html_strong_tail$.getGlobalValue() );
    if( NIL == partition_quoted_ontologies )
    {
      html_utilities.html_princ( $str107$None );
    }
    else
    {
      html_utilities.html_newline( UNPROVIDED );
      SubLObject list_var = NIL;
      SubLObject quoted_ontology = NIL;
      SubLObject index = NIL;
      list_var = partition_quoted_ontologies;
      quoted_ontology = list_var.first();
      for( index = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest(), quoted_ontology = list_var.first(), index = Numbers.add( ONE_INTEGER, index ) )
      {
        final SubLObject id = cb_utilities.cb_fort_identifier( quoted_ontology );
        final SubLObject name = PrintLow.format( NIL, $str114$quoted_ontology__A, index );
        html_utilities.html_markup( html_macros.$html_no_break_head$.getGlobalValue() );
        html_utilities.html_checkbox_input( name, id, T, UNPROVIDED, UNPROVIDED, UNPROVIDED );
        cb_utilities.cb_form( quoted_ontology, UNPROVIDED, UNPROVIDED );
        html_utilities.html_markup( html_macros.$html_no_break_tail$.getGlobalValue() );
        html_utilities.html_indent( TWO_INTEGER );
      }
    }
    html_utilities.html_newline( UNPROVIDED );
    html_utilities.html_princ_strong( $str115$Add_Quoted_Ontology__ );
    html_utilities.html_indent( FOUR_INTEGER );
    html_utilities.html_submit_input( $str83$Update_Partition_Scope, $str84$update, UNPROVIDED );
    html_utilities.html_newline( UNPROVIDED );
    html_complete.html_complete_button( $str116$quoted_ontology, $str111$Complete, $const112$Collection, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    html_utilities.html_text_input( $str116$quoted_ontology, NIL, $int100$40 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-partitions.lisp", position = 18252L)
  public static SubLObject cb_partition_save_terms_section(final SubLObject part_save)
  {
    final SubLObject partition_terms = cb_partition_save_terms( part_save );
    html_utilities.html_markup( html_macros.$html_strong_head$.getGlobalValue() );
    html_utilities.html_princ( $str117$Terms___ );
    html_utilities.html_markup( html_macros.$html_strong_tail$.getGlobalValue() );
    if( NIL == partition_terms )
    {
      html_utilities.html_princ( $str107$None );
    }
    else
    {
      html_utilities.html_newline( UNPROVIDED );
      SubLObject list_var = NIL;
      SubLObject v_term = NIL;
      SubLObject index = NIL;
      list_var = partition_terms;
      v_term = list_var.first();
      for( index = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest(), v_term = list_var.first(), index = Numbers.add( ONE_INTEGER, index ) )
      {
        final SubLObject id = cb_utilities.cb_fort_identifier( v_term );
        final SubLObject name = PrintLow.format( NIL, $str118$term__A, index );
        html_utilities.html_markup( html_macros.$html_no_break_head$.getGlobalValue() );
        html_utilities.html_checkbox_input( name, id, T, UNPROVIDED, UNPROVIDED, UNPROVIDED );
        cb_utilities.cb_form( v_term, UNPROVIDED, UNPROVIDED );
        html_utilities.html_markup( html_macros.$html_no_break_tail$.getGlobalValue() );
        html_utilities.html_indent( TWO_INTEGER );
      }
    }
    html_utilities.html_newline( UNPROVIDED );
    html_utilities.html_princ_strong( $str119$Add_Term___ );
    html_utilities.html_indent( FOUR_INTEGER );
    html_utilities.html_submit_input( $str83$Update_Partition_Scope, $str84$update, UNPROVIDED );
    html_utilities.html_newline( UNPROVIDED );
    html_complete.html_complete_button( $str120$term, $str111$Complete, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    html_utilities.html_text_input( $str120$term, NIL, $int100$40 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-partitions.lisp", position = 19049L)
  public static SubLObject cb_handle_partition_save(final SubLObject args)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject part_save = cb_current_partition_save();
    SubLObject specified_directory = html_utilities.html_extract_input( $str92$specified_directory, args );
    SubLObject filename = html_utilities.html_extract_input( $str99$partition_filename, args );
    if( NIL != specified_directory )
    {
      specified_directory = string_utilities.trim_whitespace( specified_directory );
      cb_set_partition_save_specified_directory( part_save, specified_directory );
    }
    else
    {
      cb_set_partition_save_specified_directory( part_save, $str49$ );
    }
    if( NIL != filename )
    {
      filename = string_utilities.trim_whitespace( filename );
      cb_set_partition_save_filename( part_save, filename );
    }
    else
    {
      cb_set_partition_save_filename( part_save, $str49$ );
    }
    if( NIL != html_utilities.html_extract_input( $str103$reset_scope, args ) )
    {
      cb_reset_partition_save_scope_info( part_save );
      return cb_partition_save_guts();
    }
    final SubLObject v_methods = cb_extract_save_partition_methods( args );
    SubLObject preserved_ontologies = NIL;
    SubLObject new_ontology = NIL;
    SubLObject preserved_quoted_ontologies = NIL;
    SubLObject new_quoted_ontology = NIL;
    SubLObject preserved_terms = NIL;
    SubLObject new_term = NIL;
    thread.resetMultipleValues();
    final SubLObject preserved_ontologies_$27 = cb_extract_save_partition_ontologies( args );
    final SubLObject new_ontology_$28 = thread.secondMultipleValue();
    thread.resetMultipleValues();
    preserved_ontologies = preserved_ontologies_$27;
    new_ontology = new_ontology_$28;
    if( $kw121$ERROR == new_ontology )
    {
      final SubLObject ontology_string = html_utilities.html_extract_input( $str110$ontology, args );
      return cb_utilities.cb_error( $str122$_S_does_not_specify_a_Cyc_collect, ontology_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    }
    thread.resetMultipleValues();
    final SubLObject preserved_quoted_ontologies_$29 = cb_extract_save_partition_quoted_ontologies( args );
    final SubLObject new_quoted_ontology_$30 = thread.secondMultipleValue();
    thread.resetMultipleValues();
    preserved_quoted_ontologies = preserved_quoted_ontologies_$29;
    new_quoted_ontology = new_quoted_ontology_$30;
    if( $kw121$ERROR == new_quoted_ontology )
    {
      final SubLObject quoted_ontology_string = html_utilities.html_extract_input( $str116$quoted_ontology, args );
      return cb_utilities.cb_error( $str122$_S_does_not_specify_a_Cyc_collect, quoted_ontology_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    }
    thread.resetMultipleValues();
    final SubLObject preserved_terms_$31 = cb_extract_save_partition_terms( args );
    final SubLObject new_term_$32 = thread.secondMultipleValue();
    thread.resetMultipleValues();
    preserved_terms = preserved_terms_$31;
    new_term = new_term_$32;
    if( $kw121$ERROR == new_term )
    {
      final SubLObject term_string = html_utilities.html_extract_input( $str120$term, args );
      return cb_utilities.cb_error( $str122$_S_does_not_specify_a_Cyc_collect, term_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    }
    cb_set_partition_save_predefined_methods( part_save, v_methods );
    cb_set_partition_save_ontologies( part_save, preserved_ontologies );
    cb_set_partition_save_quoted_ontologies( part_save, preserved_quoted_ontologies );
    cb_set_partition_save_terms( part_save, preserved_terms );
    if( NIL != new_ontology )
    {
      cb_add_partition_save_ontology( part_save, new_ontology );
    }
    if( NIL != new_quoted_ontology )
    {
      cb_add_partition_save_quoted_ontology( part_save, new_quoted_ontology );
    }
    if( NIL != new_term )
    {
      cb_add_partition_save_term( part_save, new_term );
    }
    if( NIL != html_utilities.html_extract_input( $str84$update, args ) )
    {
      return cb_partition_save_guts();
    }
    if( NIL != html_utilities.html_extract_input( $str86$save, args ) )
    {
      final SubLObject filename2 = cb_partition_save_filename( part_save );
      final SubLObject destination_type = html_utilities.html_extract_input( $str89$directory, args );
      SubLObject destination_directory = NIL;
      if( destination_type.equal( $str90$personal ) )
      {
        destination_directory = cb_partition_save_personal_directory( part_save );
      }
      else if( destination_type.equal( $str91$public ) )
      {
        destination_directory = cb_partition_save_public_directory( part_save );
      }
      else if( destination_type.equal( $str93$specified ) )
      {
        destination_directory = cb_partition_save_specified_directory( part_save );
      }
      final SubLObject full_filename = make_partition_filename( destination_directory, filename2, UNPROVIDED );
      cb_perform_partition_save( full_filename, part_save );
      return cb_utilities.cb_message_page_with_history( $str123$Partition_has_been_saved_, NIL );
    }
    return cb_partition_save_guts();
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-partitions.lisp", position = 22603L)
  public static SubLObject cb_extract_save_partition_methods(final SubLObject args)
  {
    SubLObject method_ids = NIL;
    SubLObject cdolist_list_var = args;
    SubLObject arg = NIL;
    arg = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( arg.isCons() && NIL != string_utilities.starts_with( arg.first(), $str125$method_ ) )
      {
        final SubLObject method_id_string = conses_high.second( arg );
        final SubLObject var = reader.parse_integer( method_id_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
        if( NIL != var )
        {
          method_ids = ConsesLow.cons( var, method_ids );
        }
      }
      cdolist_list_var = cdolist_list_var.rest();
      arg = cdolist_list_var.first();
    }
    SubLObject v_methods = NIL;
    SubLObject cdolist_list_var2 = cb_all_partition_methods();
    SubLObject method = NIL;
    method = cdolist_list_var2.first();
    while ( NIL != cdolist_list_var2)
    {
      final SubLObject method_id = cb_partition_save_method_id( method );
      if( NIL != subl_promotions.memberP( method_id, method_ids, UNPROVIDED, UNPROVIDED ) )
      {
        v_methods = ConsesLow.cons( method, v_methods );
      }
      cdolist_list_var2 = cdolist_list_var2.rest();
      method = cdolist_list_var2.first();
    }
    return Sequences.nreverse( v_methods );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-partitions.lisp", position = 23121L)
  public static SubLObject cb_extract_save_partition_ontologies(final SubLObject args)
  {
    SubLObject preserved_ontologies = NIL;
    SubLObject cdolist_list_var = args;
    SubLObject arg = NIL;
    arg = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( arg.isCons() && NIL != string_utilities.starts_with( arg.first(), $str126$ontology_ ) )
      {
        final SubLObject id = conses_high.second( arg );
        final SubLObject preserved_ontology = cb_utilities.cb_guess_fort( id, UNPROVIDED );
        if( NIL != forts.fort_p( preserved_ontology ) )
        {
          preserved_ontologies = ConsesLow.cons( preserved_ontology, preserved_ontologies );
        }
      }
      cdolist_list_var = cdolist_list_var.rest();
      arg = cdolist_list_var.first();
    }
    preserved_ontologies = Sequences.nreverse( preserved_ontologies );
    SubLObject new_ontology_string = html_utilities.html_extract_input( $str110$ontology, args );
    SubLObject new_ontology = NIL;
    if( NIL != new_ontology_string )
    {
      new_ontology_string = string_utilities.trim_whitespace( new_ontology_string );
    }
    if( NIL == string_utilities.empty_stringP( new_ontology_string ) )
    {
      new_ontology = cb_utilities.cb_guess_fort( new_ontology_string, UNPROVIDED );
      if( NIL == new_ontology || NIL == fort_types_interface.collectionP( new_ontology ) )
      {
        new_ontology = $kw121$ERROR;
      }
    }
    return Values.values( preserved_ontologies, new_ontology );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-partitions.lisp", position = 24002L)
  public static SubLObject cb_extract_save_partition_quoted_ontologies(final SubLObject args)
  {
    SubLObject preserved_quoted_ontologies = NIL;
    SubLObject cdolist_list_var = args;
    SubLObject arg = NIL;
    arg = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( arg.isCons() && NIL != string_utilities.starts_with( arg.first(), $str127$quoted_ontology_ ) )
      {
        final SubLObject id = conses_high.second( arg );
        final SubLObject preserved_quoted_ontology = cb_utilities.cb_guess_fort( id, UNPROVIDED );
        if( NIL != forts.fort_p( preserved_quoted_ontology ) )
        {
          preserved_quoted_ontologies = ConsesLow.cons( preserved_quoted_ontology, preserved_quoted_ontologies );
        }
      }
      cdolist_list_var = cdolist_list_var.rest();
      arg = cdolist_list_var.first();
    }
    preserved_quoted_ontologies = Sequences.nreverse( preserved_quoted_ontologies );
    SubLObject new_quoted_ontology_string = html_utilities.html_extract_input( $str116$quoted_ontology, args );
    SubLObject new_quoted_ontology = NIL;
    if( NIL != new_quoted_ontology_string )
    {
      new_quoted_ontology_string = string_utilities.trim_whitespace( new_quoted_ontology_string );
    }
    if( NIL == string_utilities.empty_stringP( new_quoted_ontology_string ) )
    {
      new_quoted_ontology = cb_utilities.cb_guess_fort( new_quoted_ontology_string, UNPROVIDED );
      if( NIL == new_quoted_ontology || NIL == fort_types_interface.collectionP( new_quoted_ontology ) )
      {
        new_quoted_ontology = $kw121$ERROR;
      }
    }
    return Values.values( preserved_quoted_ontologies, new_quoted_ontology );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-partitions.lisp", position = 25044L)
  public static SubLObject cb_extract_save_partition_terms(final SubLObject args)
  {
    SubLObject preserved_terms = NIL;
    SubLObject cdolist_list_var = args;
    SubLObject arg = NIL;
    arg = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( arg.isCons() && NIL != string_utilities.starts_with( arg.first(), $str128$term_ ) )
      {
        final SubLObject id = conses_high.second( arg );
        final SubLObject preserved_term = cb_utilities.cb_guess_fort( id, UNPROVIDED );
        if( NIL != forts.fort_p( preserved_term ) )
        {
          preserved_terms = ConsesLow.cons( preserved_term, preserved_terms );
        }
      }
      cdolist_list_var = cdolist_list_var.rest();
      arg = cdolist_list_var.first();
    }
    preserved_terms = Sequences.nreverse( preserved_terms );
    SubLObject new_term_string = html_utilities.html_extract_input( $str120$term, args );
    SubLObject new_term = NIL;
    if( NIL != new_term_string )
    {
      new_term_string = string_utilities.trim_whitespace( new_term_string );
    }
    if( NIL == string_utilities.empty_stringP( new_term_string ) )
    {
      new_term = cb_utilities.cb_guess_fort( new_term_string, UNPROVIDED );
      if( NIL == new_term )
      {
        new_term = $kw121$ERROR;
      }
    }
    return Values.values( preserved_terms, new_term );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-partitions.lisp", position = 25788L)
  public static SubLObject cb_partition_load(SubLObject args)
  {
    if( args == UNPROVIDED )
    {
      args = NIL;
    }
    return cb_partition_load_guts();
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-partitions.lisp", position = 25950L)
  public static SubLObject cb_link_partition_load(SubLObject linktext)
  {
    if( linktext == UNPROVIDED )
    {
      linktext = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == linktext )
    {
      linktext = $str130$_Partition_Load_;
    }
    final SubLObject frame_name_var = cb_utilities.cb_frame_name( $kw60$MAIN );
    html_utilities.html_markup( html_macros.$html_anchor_head$.getGlobalValue() );
    html_utilities.html_markup( html_macros.$html_anchor_href$.getGlobalValue() );
    html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
    cb_parameters.cyc_cgi_url_int();
    html_utilities.html_princ( $str131$cb_partition_load );
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
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-partitions.lisp", position = 26257L)
  public static SubLObject cb_partition_load_guts()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != ke.cyclist_is_guest() )
    {
      return cyc_navigator_internals.guest_warn( $str137$the_Partition_Load_page );
    }
    final SubLObject title_var = $str134$Partition_Load;
    final SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding( thread );
    try
    {
      html_macros.$html_id_space_id_generator$.bind( ( NIL != integer_sequence_generator.integer_sequence_generator_p( html_macros.$html_id_space_id_generator$.getDynamicValue( thread ) ) )
          ? html_macros.$html_id_space_id_generator$.getDynamicValue( thread )
          : integer_sequence_generator.new_integer_sequence_generator( UNPROVIDED, UNPROVIDED, UNPROVIDED ), thread );
      html_utilities.html_markup( $str67$__DOCTYPE_html_PUBLIC_____W3C__DT );
      if( NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue( thread ) )
      {
        html_utilities.html_source_readability_terpri( UNPROVIDED );
        html_utilities.html_markup( $str68$_meta_http_equiv__X_UA_Compatible );
      }
      html_utilities.html_source_readability_terpri( UNPROVIDED );
      final SubLObject _prev_bind_0_$33 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding( thread );
      try
      {
        cyc_file_dependencies.$html_emitted_file_dependencies$.bind( ( cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue( thread ) == $kw69$UNINITIALIZED ) ? ConsesLow.list( EMPTY_SUBL_OBJECT_ARRAY )
            : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue( thread ), thread );
        html_utilities.html_markup( html_macros.$html_html_head$.getGlobalValue() );
        html_utilities.html_markup( html_macros.$html_head_head$.getGlobalValue() );
        html_macros.html_head_content_type();
        cb_parameters.cb_head_shortcut_icon();
        html_utilities.html_meta_robot_instructions( cb_parameters.$cb_permit_robots_to_indexP$.getDynamicValue( thread ), cb_parameters.$cb_permit_robots_to_followP$.getDynamicValue( thread ) );
        cyc_file_dependencies.css( $kw70$CB_CYC );
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
        final SubLObject _prev_bind_0_$34 = html_macros.$html_inside_bodyP$.currentBinding( thread );
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
          html_utilities.html_markup( $str73$yui_skin_sam );
          html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
          html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
          final SubLObject _prev_bind_0_$35 = html_macros.$html_safe_print$.currentBinding( thread );
          try
          {
            html_macros.$html_safe_print$.bind( T, thread );
            html_utilities.html_markup( html_macros.$html_div_head$.getGlobalValue() );
            html_utilities.html_markup( html_macros.$html_attribute_id$.getGlobalValue() );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_markup( $str74$reloadFrameButton );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            final SubLObject _prev_bind_0_$36 = html_macros.$html_safe_print$.currentBinding( thread );
            try
            {
              html_macros.$html_safe_print$.bind( T, thread );
              html_utilities.html_markup( html_macros.$html_input_head$.getGlobalValue() );
              html_utilities.html_markup( html_macros.$html_input_type$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( $str75$button );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( html_macros.$html_input_name$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( $str76$reload );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( html_macros.$html_input_value$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_princ( $str77$Refresh_Frames );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              if( NIL != html_macros.$html_input_disabledP$.getDynamicValue( thread ) )
              {
                html_utilities.html_simple_attribute( html_macros.$html_input_disabled$.getGlobalValue() );
              }
              html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            }
            finally
            {
              html_macros.$html_safe_print$.rebind( _prev_bind_0_$36, thread );
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
            html_utilities.html_markup( $str78$post );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            if( NIL != frame_name_var )
            {
              html_utilities.html_markup( html_macros.$html_form_target$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( frame_name_var );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            }
            html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            final SubLObject _prev_bind_0_$37 = html_macros.$html_safe_print$.currentBinding( thread );
            final SubLObject _prev_bind_2 = html_macros.$within_html_form$.currentBinding( thread );
            final SubLObject _prev_bind_3 = html_macros.$html_form_field_uniquifier_code$.currentBinding( thread );
            try
            {
              html_macros.$html_safe_print$.bind( T, thread );
              html_macros.$within_html_form$.bind( T, thread );
              html_macros.$html_form_field_uniquifier_code$.bind( html_macros.next_html_form_field_uniquifier_code(), thread );
              html_utilities.html_hidden_input( $str138$cb_handle_partition_load, T, UNPROVIDED );
              cb_partition_load_header();
              html_utilities.html_newline( TWO_INTEGER );
              html_utilities.html_princ_strong( $str139$Specify_or_select_one_or_more_par );
              html_utilities.html_newline( TWO_INTEGER );
              cb_partition_load_filename_section();
              html_utilities.html_newline( UNPROVIDED );
              cb_partition_finalize_section();
              html_utilities.html_newline( UNPROVIDED );
              cb_partition_load_personal_section();
              cb_partition_load_public_section();
              html_macros.embed_form_field_code( html_macros.$html_form_field_uniquifier_code$.getDynamicValue( thread ) );
            }
            finally
            {
              html_macros.$html_form_field_uniquifier_code$.rebind( _prev_bind_3, thread );
              html_macros.$within_html_form$.rebind( _prev_bind_2, thread );
              html_macros.$html_safe_print$.rebind( _prev_bind_0_$37, thread );
            }
            html_utilities.html_markup( html_macros.$html_form_tail$.getGlobalValue() );
            html_utilities.html_source_readability_terpri( UNPROVIDED );
            html_utilities.html_copyright_notice();
          }
          finally
          {
            html_macros.$html_safe_print$.rebind( _prev_bind_0_$35, thread );
          }
          html_utilities.html_markup( html_macros.$html_body_tail$.getGlobalValue() );
          html_utilities.html_source_readability_terpri( UNPROVIDED );
        }
        finally
        {
          html_macros.$html_inside_bodyP$.rebind( _prev_bind_0_$34, thread );
        }
        html_utilities.html_markup( html_macros.$html_html_tail$.getGlobalValue() );
      }
      finally
      {
        cyc_file_dependencies.$html_emitted_file_dependencies$.rebind( _prev_bind_0_$33, thread );
      }
      html_utilities.html_source_readability_terpri( UNPROVIDED );
    }
    finally
    {
      html_macros.$html_id_space_id_generator$.rebind( _prev_bind_0, thread );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-partitions.lisp", position = 26969L)
  public static SubLObject cb_partition_load_header()
  {
    cb_utilities.cb_help_preamble( $kw140$CB_PARTITION_LOAD, UNPROVIDED, UNPROVIDED );
    html_utilities.html_reset_input( $str82$Reset_Form );
    html_utilities.html_indent( UNPROVIDED );
    html_utilities.html_submit_input( $str142$Load_Partitions, $str143$load, UNPROVIDED );
    html_utilities.html_indent( UNPROVIDED );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-partitions.lisp", position = 27208L)
  public static SubLObject cb_partition_load_filename_section()
  {
    html_utilities.html_princ( $str144$Full_pathname_of_a_partition_file );
    html_utilities.html_newline( UNPROVIDED );
    html_utilities.html_filename_input( $str145$specified_filename, $str49$, $int146$80 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-partitions.lisp", position = 27419L)
  public static SubLObject cb_partition_finalize_section()
  {
    html_utilities.html_checkbox_input( $str147$finalize, T, T, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    html_utilities.html_princ( $str148$_Clean_up_after_load____Only_unch );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-partitions.lisp", position = 27662L)
  public static SubLObject cb_partition_load_personal_section()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject personal_directory = cb_compute_partition_load_personal_directory();
    if( NIL != personal_directory && NIL != Filesys.directory_p( personal_directory ) )
    {
      final SubLObject partition_files = directory_partition_files( personal_directory );
      if( NIL != partition_files )
      {
        html_utilities.html_newline( UNPROVIDED );
        html_utilities.html_markup( html_macros.$html_table_head$.getGlobalValue() );
        html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding( thread );
        try
        {
          html_macros.$html_safe_print$.bind( T, thread );
          html_utilities.html_markup( html_macros.$html_table_row_head$.getGlobalValue() );
          html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
          final SubLObject _prev_bind_0_$38 = html_macros.$html_safe_print$.currentBinding( thread );
          try
          {
            html_macros.$html_safe_print$.bind( T, thread );
            html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
            html_utilities.html_markup( html_macros.$html_table_data_colspan$.getGlobalValue() );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_markup( FOUR_INTEGER );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_markup( html_macros.$html_table_data_align$.getGlobalValue() );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_markup( html_utilities.html_align( $kw96$LEFT ) );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_markup( html_macros.$html_table_data_valign$.getGlobalValue() );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_markup( html_utilities.html_align( $kw149$TOP ) );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            final SubLObject _prev_bind_0_$39 = html_macros.$html_safe_print$.currentBinding( thread );
            try
            {
              html_macros.$html_safe_print$.bind( T, thread );
              html_utilities.html_princ_strong( $str150$Personal_partitions_from );
              html_utilities.html_indent( UNPROVIDED );
              html_utilities.html_markup( html_macros.$html_teletype_head$.getGlobalValue() );
              html_utilities.html_princ( personal_directory );
              html_utilities.html_markup( html_macros.$html_teletype_tail$.getGlobalValue() );
            }
            finally
            {
              html_macros.$html_safe_print$.rebind( _prev_bind_0_$39, thread );
            }
            html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
          }
          finally
          {
            html_macros.$html_safe_print$.rebind( _prev_bind_0_$38, thread );
          }
          html_utilities.html_markup( html_macros.$html_table_row_tail$.getGlobalValue() );
          html_utilities.html_source_readability_terpri( UNPROVIDED );
          SubLObject list_var = NIL;
          SubLObject partition_file = NIL;
          SubLObject index = NIL;
          list_var = partition_files;
          partition_file = list_var.first();
          for( index = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest(), partition_file = list_var.first(), index = Numbers.add( ONE_INTEGER, index ) )
          {
            final SubLObject full_filename = Sequences.cconcatenate( personal_directory, partition_file );
            final SubLObject write_time = Filesys.file_write_date( full_filename );
            html_utilities.html_markup( html_macros.$html_table_row_head$.getGlobalValue() );
            html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            final SubLObject _prev_bind_0_$40 = html_macros.$html_safe_print$.currentBinding( thread );
            try
            {
              html_macros.$html_safe_print$.bind( T, thread );
              html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
              html_utilities.html_markup( html_macros.$html_table_data_align$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( html_utilities.html_align( $kw96$LEFT ) );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( html_macros.$html_table_data_valign$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( html_utilities.html_align( $kw149$TOP ) );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
              final SubLObject _prev_bind_0_$41 = html_macros.$html_safe_print$.currentBinding( thread );
              try
              {
                html_macros.$html_safe_print$.bind( T, thread );
                final SubLObject checkbox_name = PrintLow.format( NIL, $str151$personal__A, index );
                html_utilities.html_checkbox_input( checkbox_name, index, NIL, UNPROVIDED, UNPROVIDED, UNPROVIDED );
              }
              finally
              {
                html_macros.$html_safe_print$.rebind( _prev_bind_0_$41, thread );
              }
              html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
              html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
              html_utilities.html_markup( html_macros.$html_table_data_align$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( html_utilities.html_align( $kw96$LEFT ) );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( html_macros.$html_table_data_valign$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( html_utilities.html_align( $kw149$TOP ) );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
              final SubLObject _prev_bind_0_$42 = html_macros.$html_safe_print$.currentBinding( thread );
              try
              {
                html_macros.$html_safe_print$.bind( T, thread );
                html_utilities.html_markup( html_macros.$html_teletype_head$.getGlobalValue() );
                html_utilities.html_princ( partition_file );
                html_utilities.html_markup( html_macros.$html_teletype_tail$.getGlobalValue() );
              }
              finally
              {
                html_macros.$html_safe_print$.rebind( _prev_bind_0_$42, thread );
              }
              html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
              html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
              final SubLObject _prev_bind_0_$43 = html_macros.$html_safe_print$.currentBinding( thread );
              try
              {
                html_macros.$html_safe_print$.bind( T, thread );
                html_utilities.html_indent( TWO_INTEGER );
              }
              finally
              {
                html_macros.$html_safe_print$.rebind( _prev_bind_0_$43, thread );
              }
              html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
              html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
              html_utilities.html_markup( html_macros.$html_table_data_align$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( html_utilities.html_align( $kw152$RIGHT ) );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( html_macros.$html_table_data_valign$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( html_utilities.html_align( $kw149$TOP ) );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
              final SubLObject _prev_bind_0_$44 = html_macros.$html_safe_print$.currentBinding( thread );
              try
              {
                html_macros.$html_safe_print$.bind( T, thread );
                html_utilities.html_markup( html_macros.$html_small_head$.getGlobalValue() );
                html_utilities.html_princ( numeric_date_utilities.safe_timestring( write_time ) );
                html_utilities.html_markup( html_macros.$html_small_tail$.getGlobalValue() );
              }
              finally
              {
                html_macros.$html_safe_print$.rebind( _prev_bind_0_$44, thread );
              }
              html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
            }
            finally
            {
              html_macros.$html_safe_print$.rebind( _prev_bind_0_$40, thread );
            }
            html_utilities.html_markup( html_macros.$html_table_row_tail$.getGlobalValue() );
            html_utilities.html_source_readability_terpri( UNPROVIDED );
          }
        }
        finally
        {
          html_macros.$html_safe_print$.rebind( _prev_bind_0, thread );
        }
        html_utilities.html_markup( html_macros.$html_table_tail$.getGlobalValue() );
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-partitions.lisp", position = 28909L)
  public static SubLObject cb_partition_load_public_section()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject public_directory = cb_compute_partition_load_public_directory();
    if( NIL != public_directory && NIL != Filesys.directory_p( public_directory ) )
    {
      final SubLObject partition_files = directory_partition_files( public_directory );
      if( NIL != partition_files )
      {
        html_utilities.html_newline( UNPROVIDED );
        html_utilities.html_markup( html_macros.$html_table_head$.getGlobalValue() );
        html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding( thread );
        try
        {
          html_macros.$html_safe_print$.bind( T, thread );
          html_utilities.html_markup( html_macros.$html_table_row_head$.getGlobalValue() );
          html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
          final SubLObject _prev_bind_0_$45 = html_macros.$html_safe_print$.currentBinding( thread );
          try
          {
            html_macros.$html_safe_print$.bind( T, thread );
            html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
            html_utilities.html_markup( html_macros.$html_table_data_colspan$.getGlobalValue() );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_markup( FOUR_INTEGER );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_markup( html_macros.$html_table_data_align$.getGlobalValue() );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_markup( html_utilities.html_align( $kw96$LEFT ) );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_markup( html_macros.$html_table_data_valign$.getGlobalValue() );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_markup( html_utilities.html_align( $kw149$TOP ) );
            html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
            html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            final SubLObject _prev_bind_0_$46 = html_macros.$html_safe_print$.currentBinding( thread );
            try
            {
              html_macros.$html_safe_print$.bind( T, thread );
              html_utilities.html_princ_strong( $str153$Public_partitions_from );
              html_utilities.html_indent( UNPROVIDED );
              html_utilities.html_markup( html_macros.$html_teletype_head$.getGlobalValue() );
              html_utilities.html_princ( public_directory );
              html_utilities.html_markup( html_macros.$html_teletype_tail$.getGlobalValue() );
            }
            finally
            {
              html_macros.$html_safe_print$.rebind( _prev_bind_0_$46, thread );
            }
            html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
          }
          finally
          {
            html_macros.$html_safe_print$.rebind( _prev_bind_0_$45, thread );
          }
          html_utilities.html_markup( html_macros.$html_table_row_tail$.getGlobalValue() );
          html_utilities.html_source_readability_terpri( UNPROVIDED );
          SubLObject list_var = NIL;
          SubLObject partition_file = NIL;
          SubLObject index = NIL;
          list_var = partition_files;
          partition_file = list_var.first();
          for( index = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest(), partition_file = list_var.first(), index = Numbers.add( ONE_INTEGER, index ) )
          {
            final SubLObject full_filename = Sequences.cconcatenate( public_directory, partition_file );
            final SubLObject write_time = Filesys.file_write_date( full_filename );
            html_utilities.html_markup( html_macros.$html_table_row_head$.getGlobalValue() );
            html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
            final SubLObject _prev_bind_0_$47 = html_macros.$html_safe_print$.currentBinding( thread );
            try
            {
              html_macros.$html_safe_print$.bind( T, thread );
              html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
              html_utilities.html_markup( html_macros.$html_table_data_align$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( html_utilities.html_align( $kw96$LEFT ) );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( html_macros.$html_table_data_valign$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( html_utilities.html_align( $kw149$TOP ) );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
              final SubLObject _prev_bind_0_$48 = html_macros.$html_safe_print$.currentBinding( thread );
              try
              {
                html_macros.$html_safe_print$.bind( T, thread );
                final SubLObject checkbox_name = PrintLow.format( NIL, $str154$public__A, index );
                html_utilities.html_checkbox_input( checkbox_name, index, NIL, UNPROVIDED, UNPROVIDED, UNPROVIDED );
              }
              finally
              {
                html_macros.$html_safe_print$.rebind( _prev_bind_0_$48, thread );
              }
              html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
              html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
              html_utilities.html_markup( html_macros.$html_table_data_align$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( html_utilities.html_align( $kw96$LEFT ) );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( html_macros.$html_table_data_valign$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( html_utilities.html_align( $kw149$TOP ) );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
              final SubLObject _prev_bind_0_$49 = html_macros.$html_safe_print$.currentBinding( thread );
              try
              {
                html_macros.$html_safe_print$.bind( T, thread );
                html_utilities.html_markup( html_macros.$html_teletype_head$.getGlobalValue() );
                html_utilities.html_princ( partition_file );
                html_utilities.html_markup( html_macros.$html_teletype_tail$.getGlobalValue() );
              }
              finally
              {
                html_macros.$html_safe_print$.rebind( _prev_bind_0_$49, thread );
              }
              html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
              html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
              final SubLObject _prev_bind_0_$50 = html_macros.$html_safe_print$.currentBinding( thread );
              try
              {
                html_macros.$html_safe_print$.bind( T, thread );
                html_utilities.html_indent( TWO_INTEGER );
              }
              finally
              {
                html_macros.$html_safe_print$.rebind( _prev_bind_0_$50, thread );
              }
              html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
              html_utilities.html_markup( html_macros.$html_table_data_head$.getGlobalValue() );
              html_utilities.html_markup( html_macros.$html_table_data_align$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( html_utilities.html_align( $kw152$RIGHT ) );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( html_macros.$html_table_data_valign$.getGlobalValue() );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_markup( html_utilities.html_align( $kw149$TOP ) );
              html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
              html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
              final SubLObject _prev_bind_0_$51 = html_macros.$html_safe_print$.currentBinding( thread );
              try
              {
                html_macros.$html_safe_print$.bind( T, thread );
                html_utilities.html_markup( html_macros.$html_small_head$.getGlobalValue() );
                html_utilities.html_princ( numeric_date_utilities.safe_timestring( write_time ) );
                html_utilities.html_markup( html_macros.$html_small_tail$.getGlobalValue() );
              }
              finally
              {
                html_macros.$html_safe_print$.rebind( _prev_bind_0_$51, thread );
              }
              html_utilities.html_markup( html_macros.$html_table_data_tail$.getGlobalValue() );
            }
            finally
            {
              html_macros.$html_safe_print$.rebind( _prev_bind_0_$47, thread );
            }
            html_utilities.html_markup( html_macros.$html_table_row_tail$.getGlobalValue() );
            html_utilities.html_source_readability_terpri( UNPROVIDED );
          }
        }
        finally
        {
          html_macros.$html_safe_print$.rebind( _prev_bind_0, thread );
        }
        html_utilities.html_markup( html_macros.$html_table_tail$.getGlobalValue() );
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-partitions.lisp", position = 30134L)
  public static SubLObject cb_handle_partition_load(final SubLObject args)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject partition_files = NIL;
    thread.resetMultipleValues();
    final SubLObject specified_filename = cb_partition_load_extract_specified_filename( args );
    final SubLObject non_existentP = thread.secondMultipleValue();
    thread.resetMultipleValues();
    if( NIL != non_existentP )
    {
      return cb_utilities.cb_error( $str155$The_specified_filename__S_could_n, specified_filename, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    }
    if( NIL != specified_filename )
    {
      partition_files = ConsesLow.cons( specified_filename, partition_files );
    }
    SubLObject cdolist_list_var;
    final SubLObject personal_filenames = cdolist_list_var = cb_partition_load_extract_personal_filenames( args );
    SubLObject filename = NIL;
    filename = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      partition_files = ConsesLow.cons( filename, partition_files );
      cdolist_list_var = cdolist_list_var.rest();
      filename = cdolist_list_var.first();
    }
    final SubLObject public_filenames = cdolist_list_var = cb_partition_load_extract_public_filenames( args );
    filename = NIL;
    filename = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      partition_files = ConsesLow.cons( filename, partition_files );
      cdolist_list_var = cdolist_list_var.rest();
      filename = cdolist_list_var.first();
    }
    partition_files = Sequences.nreverse( partition_files );
    if( NIL == partition_files )
    {
      return cb_partition_load_guts();
    }
    cb_perform_partition_load( partition_files );
    if( NIL != cb_partition_load_extract_finalize( args ) )
    {
      partitions.partition_load_kb_cleanup();
    }
    if( NIL != list_utilities.singletonP( partition_files ) )
    {
      return cb_utilities.cb_message_page_with_history( $str156$Partition_has_been_loaded_, NIL );
    }
    return cb_utilities.cb_message_page_with_history( $str157$Partition_files_have_been_loaded_, NIL );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-partitions.lisp", position = 31392L)
  public static SubLObject cb_partition_load_extract_specified_filename(final SubLObject args)
  {
    SubLObject specified_filename = html_utilities.html_extract_input( $str145$specified_filename, args );
    SubLObject non_existentP = NIL;
    if( NIL != specified_filename )
    {
      specified_filename = string_utilities.trim_whitespace( specified_filename );
      if( NIL != string_utilities.empty_stringP( specified_filename ) )
      {
        specified_filename = NIL;
      }
    }
    if( NIL != specified_filename )
    {
      non_existentP = makeBoolean( NIL == Filesys.probe_file( specified_filename ) );
    }
    return Values.values( specified_filename, non_existentP );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-partitions.lisp", position = 31893L)
  public static SubLObject cb_partition_load_extract_finalize(final SubLObject args)
  {
    return html_utilities.html_extract_input( $str147$finalize, args );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-partitions.lisp", position = 32002L)
  public static SubLObject cb_partition_load_extract_personal_filenames(final SubLObject args)
  {
    final SubLObject personal_directory = cb_compute_partition_load_personal_directory();
    if( NIL != personal_directory && NIL != Filesys.directory_p( personal_directory ) )
    {
      final SubLObject partition_files = directory_partition_files( personal_directory );
      if( NIL != partition_files )
      {
        SubLObject selected_partitions = NIL;
        SubLObject cdolist_list_var = args;
        SubLObject arg = NIL;
        arg = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          if( arg.isCons() )
          {
            SubLObject current;
            final SubLObject datum = current = arg;
            SubLObject input = NIL;
            SubLObject value = NIL;
            cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list159 );
            input = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list159 );
            value = current.first();
            current = current.rest();
            if( NIL == current )
            {
              if( NIL != string_utilities.starts_with( input, $str160$personal_ ) )
              {
                final SubLObject index = reader.parse_integer( value, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
                if( index.isInteger() )
                {
                  final SubLObject filename = ConsesLow.nth( index, partition_files );
                  if( NIL != filename )
                  {
                    final SubLObject full_filename = Sequences.cconcatenate( personal_directory, filename );
                    if( NIL != Filesys.probe_file( full_filename ) )
                    {
                      selected_partitions = ConsesLow.cons( full_filename, selected_partitions );
                    }
                  }
                }
              }
            }
            else
            {
              cdestructuring_bind.cdestructuring_bind_error( datum, $list159 );
            }
          }
          cdolist_list_var = cdolist_list_var.rest();
          arg = cdolist_list_var.first();
        }
        return Sequences.nreverse( selected_partitions );
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-partitions.lisp", position = 32866L)
  public static SubLObject cb_partition_load_extract_public_filenames(final SubLObject args)
  {
    final SubLObject public_directory = cb_compute_partition_load_public_directory();
    if( NIL != public_directory && NIL != Filesys.directory_p( public_directory ) )
    {
      final SubLObject partition_files = directory_partition_files( public_directory );
      if( NIL != partition_files )
      {
        SubLObject selected_partitions = NIL;
        SubLObject cdolist_list_var = args;
        SubLObject arg = NIL;
        arg = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          if( arg.isCons() )
          {
            SubLObject current;
            final SubLObject datum = current = arg;
            SubLObject input = NIL;
            SubLObject value = NIL;
            cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list159 );
            input = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list159 );
            value = current.first();
            current = current.rest();
            if( NIL == current )
            {
              if( NIL != string_utilities.starts_with( input, $str161$public_ ) )
              {
                final SubLObject index = reader.parse_integer( value, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
                if( index.isInteger() )
                {
                  final SubLObject filename = ConsesLow.nth( index, partition_files );
                  if( NIL != filename )
                  {
                    final SubLObject full_filename = Sequences.cconcatenate( public_directory, filename );
                    if( NIL != Filesys.probe_file( full_filename ) )
                    {
                      selected_partitions = ConsesLow.cons( full_filename, selected_partitions );
                    }
                  }
                }
              }
            }
            else
            {
              cdestructuring_bind.cdestructuring_bind_error( datum, $list159 );
            }
          }
          cdolist_list_var = cdolist_list_var.rest();
          arg = cdolist_list_var.first();
        }
        return Sequences.nreverse( selected_partitions );
      }
    }
    return NIL;
  }

  public static SubLObject declare_cb_partitions_file()
  {
    SubLFiles.declareFunction( me, "make_partition_filename", "MAKE-PARTITION-FILENAME", 2, 1, false );
    SubLFiles.declareFunction( me, "directory_partition_files", "DIRECTORY-PARTITION-FILES", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_compute_partition_save_public_directory", "CB-COMPUTE-PARTITION-SAVE-PUBLIC-DIRECTORY", 0, 0, false );
    SubLFiles.declareFunction( me, "cb_compute_partition_save_personal_directory", "CB-COMPUTE-PARTITION-SAVE-PERSONAL-DIRECTORY", 0, 0, false );
    SubLFiles.declareFunction( me, "cb_compute_partition_load_public_directory", "CB-COMPUTE-PARTITION-LOAD-PUBLIC-DIRECTORY", 0, 0, false );
    SubLFiles.declareFunction( me, "cb_compute_partition_load_personal_directory", "CB-COMPUTE-PARTITION-LOAD-PERSONAL-DIRECTORY", 0, 0, false );
    SubLFiles.declareFunction( me, "cb_partition_save_print_function_trampoline", "CB-PARTITION-SAVE-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false );
    SubLFiles.declareFunction( me, "cb_partition_save_p", "CB-PARTITION-SAVE-P", 1, 0, false );
    new $cb_partition_save_p$UnaryFunction();
    SubLFiles.declareFunction( me, "cb_part_save_specified_directory", "CB-PART-SAVE-SPECIFIED-DIRECTORY", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_part_save_personal_directory", "CB-PART-SAVE-PERSONAL-DIRECTORY", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_part_save_public_directory", "CB-PART-SAVE-PUBLIC-DIRECTORY", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_part_save_filename", "CB-PART-SAVE-FILENAME", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_part_save_predefined_methods", "CB-PART-SAVE-PREDEFINED-METHODS", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_part_save_ontologies", "CB-PART-SAVE-ONTOLOGIES", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_part_save_quoted_ontologies", "CB-PART-SAVE-QUOTED-ONTOLOGIES", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_part_save_terms", "CB-PART-SAVE-TERMS", 1, 0, false );
    SubLFiles.declareFunction( me, "_csetf_cb_part_save_specified_directory", "_CSETF-CB-PART-SAVE-SPECIFIED-DIRECTORY", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_cb_part_save_personal_directory", "_CSETF-CB-PART-SAVE-PERSONAL-DIRECTORY", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_cb_part_save_public_directory", "_CSETF-CB-PART-SAVE-PUBLIC-DIRECTORY", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_cb_part_save_filename", "_CSETF-CB-PART-SAVE-FILENAME", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_cb_part_save_predefined_methods", "_CSETF-CB-PART-SAVE-PREDEFINED-METHODS", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_cb_part_save_ontologies", "_CSETF-CB-PART-SAVE-ONTOLOGIES", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_cb_part_save_quoted_ontologies", "_CSETF-CB-PART-SAVE-QUOTED-ONTOLOGIES", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_cb_part_save_terms", "_CSETF-CB-PART-SAVE-TERMS", 2, 0, false );
    SubLFiles.declareFunction( me, "make_cb_partition_save", "MAKE-CB-PARTITION-SAVE", 0, 1, false );
    SubLFiles.declareFunction( me, "visit_defstruct_cb_partition_save", "VISIT-DEFSTRUCT-CB-PARTITION-SAVE", 2, 0, false );
    SubLFiles.declareFunction( me, "visit_defstruct_object_cb_partition_save_method", "VISIT-DEFSTRUCT-OBJECT-CB-PARTITION-SAVE-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "new_cb_partition_save", "NEW-CB-PARTITION-SAVE", 0, 0, false );
    SubLFiles.declareFunction( me, "cb_partition_save_specified_directory", "CB-PARTITION-SAVE-SPECIFIED-DIRECTORY", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_partition_save_personal_directory", "CB-PARTITION-SAVE-PERSONAL-DIRECTORY", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_partition_save_public_directory", "CB-PARTITION-SAVE-PUBLIC-DIRECTORY", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_partition_save_filename", "CB-PARTITION-SAVE-FILENAME", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_partition_save_predefined_methods", "CB-PARTITION-SAVE-PREDEFINED-METHODS", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_partition_save_ontologies", "CB-PARTITION-SAVE-ONTOLOGIES", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_partition_save_quoted_ontologies", "CB-PARTITION-SAVE-QUOTED-ONTOLOGIES", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_partition_save_terms", "CB-PARTITION-SAVE-TERMS", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_set_partition_save_specified_directory", "CB-SET-PARTITION-SAVE-SPECIFIED-DIRECTORY", 2, 0, false );
    SubLFiles.declareFunction( me, "cb_set_partition_save_personal_directory", "CB-SET-PARTITION-SAVE-PERSONAL-DIRECTORY", 2, 0, false );
    SubLFiles.declareFunction( me, "cb_set_partition_save_public_directory", "CB-SET-PARTITION-SAVE-PUBLIC-DIRECTORY", 2, 0, false );
    SubLFiles.declareFunction( me, "cb_set_partition_save_filename", "CB-SET-PARTITION-SAVE-FILENAME", 2, 0, false );
    SubLFiles.declareFunction( me, "cb_set_partition_save_predefined_methods", "CB-SET-PARTITION-SAVE-PREDEFINED-METHODS", 2, 0, false );
    SubLFiles.declareFunction( me, "cb_set_partition_save_ontologies", "CB-SET-PARTITION-SAVE-ONTOLOGIES", 2, 0, false );
    SubLFiles.declareFunction( me, "cb_set_partition_save_quoted_ontologies", "CB-SET-PARTITION-SAVE-QUOTED-ONTOLOGIES", 2, 0, false );
    SubLFiles.declareFunction( me, "cb_set_partition_save_terms", "CB-SET-PARTITION-SAVE-TERMS", 2, 0, false );
    SubLFiles.declareFunction( me, "cb_partition_save_compute_partition", "CB-PARTITION-SAVE-COMPUTE-PARTITION", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_add_partition_save_ontology", "CB-ADD-PARTITION-SAVE-ONTOLOGY", 2, 0, false );
    SubLFiles.declareFunction( me, "cb_add_partition_save_quoted_ontology", "CB-ADD-PARTITION-SAVE-QUOTED-ONTOLOGY", 2, 0, false );
    SubLFiles.declareFunction( me, "cb_add_partition_save_term", "CB-ADD-PARTITION-SAVE-TERM", 2, 0, false );
    SubLFiles.declareFunction( me, "cb_reset_partition_save_file_info", "CB-RESET-PARTITION-SAVE-FILE-INFO", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_reset_partition_save_scope_info", "CB-RESET-PARTITION-SAVE-SCOPE-INFO", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_perform_partition_save", "CB-PERFORM-PARTITION-SAVE", 2, 0, false );
    SubLFiles.declareFunction( me, "cb_perform_partition_load", "CB-PERFORM-PARTITION-LOAD", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_all_partition_methods", "CB-ALL-PARTITION-METHODS", 0, 0, false );
    SubLFiles.declareFunction( me, "cb_partition_save_method_id", "CB-PARTITION-SAVE-METHOD-ID", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_partition_save_method_description", "CB-PARTITION-SAVE-METHOD-DESCRIPTION", 1, 0, false );
    SubLFiles.declareFunction( me, "scope_partition_all_kb_additions", "SCOPE-PARTITION-ALL-KB-ADDITIONS", 0, 0, false );
    SubLFiles.declareFunction( me, "scope_partition_all_assertions_in_hlmt_naut", "SCOPE-PARTITION-ALL-ASSERTIONS-IN-HLMT-NAUT", 0, 0, false );
    SubLFiles.declareFunction( me, "assertion_in_hlmt_naut_p", "ASSERTION-IN-HLMT-NAUT-P", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_current_partition_save", "CB-CURRENT-PARTITION-SAVE", 0, 0, false );
    SubLFiles.declareFunction( me, "cb_ensure_current_partition_save", "CB-ENSURE-CURRENT-PARTITION-SAVE", 0, 0, false );
    SubLFiles.declareFunction( me, "cb_partition_save", "CB-PARTITION-SAVE", 0, 1, false );
    SubLFiles.declareFunction( me, "cb_link_partition_save", "CB-LINK-PARTITION-SAVE", 0, 1, false );
    SubLFiles.declareFunction( me, "cb_partition_save_guts", "CB-PARTITION-SAVE-GUTS", 0, 0, false );
    SubLFiles.declareFunction( me, "cb_partition_save_header", "CB-PARTITION-SAVE-HEADER", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_partition_save_filename_section", "CB-PARTITION-SAVE-FILENAME-SECTION", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_partition_save_scope_section", "CB-PARTITION-SAVE-SCOPE-SECTION", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_partition_save_predefined_methods_section", "CB-PARTITION-SAVE-PREDEFINED-METHODS-SECTION", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_partition_save_method_checkbox", "CB-PARTITION-SAVE-METHOD-CHECKBOX", 2, 0, false );
    SubLFiles.declareFunction( me, "cb_partition_save_ontologies_section", "CB-PARTITION-SAVE-ONTOLOGIES-SECTION", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_partition_save_quoted_ontologies_section", "CB-PARTITION-SAVE-QUOTED-ONTOLOGIES-SECTION", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_partition_save_terms_section", "CB-PARTITION-SAVE-TERMS-SECTION", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_handle_partition_save", "CB-HANDLE-PARTITION-SAVE", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_extract_save_partition_methods", "CB-EXTRACT-SAVE-PARTITION-METHODS", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_extract_save_partition_ontologies", "CB-EXTRACT-SAVE-PARTITION-ONTOLOGIES", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_extract_save_partition_quoted_ontologies", "CB-EXTRACT-SAVE-PARTITION-QUOTED-ONTOLOGIES", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_extract_save_partition_terms", "CB-EXTRACT-SAVE-PARTITION-TERMS", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_partition_load", "CB-PARTITION-LOAD", 0, 1, false );
    SubLFiles.declareFunction( me, "cb_link_partition_load", "CB-LINK-PARTITION-LOAD", 0, 1, false );
    SubLFiles.declareFunction( me, "cb_partition_load_guts", "CB-PARTITION-LOAD-GUTS", 0, 0, false );
    SubLFiles.declareFunction( me, "cb_partition_load_header", "CB-PARTITION-LOAD-HEADER", 0, 0, false );
    SubLFiles.declareFunction( me, "cb_partition_load_filename_section", "CB-PARTITION-LOAD-FILENAME-SECTION", 0, 0, false );
    SubLFiles.declareFunction( me, "cb_partition_finalize_section", "CB-PARTITION-FINALIZE-SECTION", 0, 0, false );
    SubLFiles.declareFunction( me, "cb_partition_load_personal_section", "CB-PARTITION-LOAD-PERSONAL-SECTION", 0, 0, false );
    SubLFiles.declareFunction( me, "cb_partition_load_public_section", "CB-PARTITION-LOAD-PUBLIC-SECTION", 0, 0, false );
    SubLFiles.declareFunction( me, "cb_handle_partition_load", "CB-HANDLE-PARTITION-LOAD", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_partition_load_extract_specified_filename", "CB-PARTITION-LOAD-EXTRACT-SPECIFIED-FILENAME", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_partition_load_extract_finalize", "CB-PARTITION-LOAD-EXTRACT-FINALIZE", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_partition_load_extract_personal_filenames", "CB-PARTITION-LOAD-EXTRACT-PERSONAL-FILENAMES", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_partition_load_extract_public_filenames", "CB-PARTITION-LOAD-EXTRACT-PUBLIC-FILENAMES", 1, 0, false );
    return NIL;
  }

  public static SubLObject init_cb_partitions_file()
  {
    $cb_partition_extension$ = SubLFiles.deflexical( "*CB-PARTITION-EXTENSION*", $str0$cpart );
    $dtp_cb_partition_save$ = SubLFiles.defconstant( "*DTP-CB-PARTITION-SAVE*", $sym3$CB_PARTITION_SAVE );
    $cb_partition_method_table$ = SubLFiles.deflexical( "*CB-PARTITION-METHOD-TABLE*", $list50 );
    $cb_current_partition_save$ = SubLFiles.defvar( "*CB-CURRENT-PARTITION-SAVE*", NIL );
    return NIL;
  }

  public static SubLObject setup_cb_partitions_file()
  {
    Structures.register_method( print_high.$print_object_method_table$.getGlobalValue(), $dtp_cb_partition_save$.getGlobalValue(), Symbols.symbol_function( $sym10$CB_PARTITION_SAVE_PRINT_FUNCTION_TRAMPOLINE ) );
    SubLSpecialOperatorDeclarations.proclaim( $list11 );
    Structures.def_csetf( $sym12$CB_PART_SAVE_SPECIFIED_DIRECTORY, $sym13$_CSETF_CB_PART_SAVE_SPECIFIED_DIRECTORY );
    Structures.def_csetf( $sym14$CB_PART_SAVE_PERSONAL_DIRECTORY, $sym15$_CSETF_CB_PART_SAVE_PERSONAL_DIRECTORY );
    Structures.def_csetf( $sym16$CB_PART_SAVE_PUBLIC_DIRECTORY, $sym17$_CSETF_CB_PART_SAVE_PUBLIC_DIRECTORY );
    Structures.def_csetf( $sym18$CB_PART_SAVE_FILENAME, $sym19$_CSETF_CB_PART_SAVE_FILENAME );
    Structures.def_csetf( $sym20$CB_PART_SAVE_PREDEFINED_METHODS, $sym21$_CSETF_CB_PART_SAVE_PREDEFINED_METHODS );
    Structures.def_csetf( $sym22$CB_PART_SAVE_ONTOLOGIES, $sym23$_CSETF_CB_PART_SAVE_ONTOLOGIES );
    Structures.def_csetf( $sym24$CB_PART_SAVE_QUOTED_ONTOLOGIES, $sym25$_CSETF_CB_PART_SAVE_QUOTED_ONTOLOGIES );
    Structures.def_csetf( $sym26$CB_PART_SAVE_TERMS, $sym27$_CSETF_CB_PART_SAVE_TERMS );
    Equality.identity( $sym3$CB_PARTITION_SAVE );
    Structures.register_method( visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_cb_partition_save$.getGlobalValue(), Symbols.symbol_function(
        $sym41$VISIT_DEFSTRUCT_OBJECT_CB_PARTITION_SAVE_METHOD ) );
    access_macros.register_external_symbol( $sym52$SCOPE_PARTITION_ALL_KB_ADDITIONS );
    access_macros.register_external_symbol( $sym53$SCOPE_PARTITION_ALL_ASSERTIONS_IN_HLMT_NAUT );
    utilities_macros.register_html_state_variable( $sym56$_CB_CURRENT_PARTITION_SAVE_ );
    html_macros.note_cgi_handler_function( $sym3$CB_PARTITION_SAVE, $kw58$HTML_HANDLER );
    cb_utilities.setup_cb_link_method( $kw62$PARTITION_SAVE, $sym63$CB_LINK_PARTITION_SAVE, ONE_INTEGER );
    cb_utilities.declare_cb_tool( $kw62$PARTITION_SAVE, $str64$Partition_Save, $str65$PartSave, $str66$Save_out_a_KB_partition );
    Hashtables.sethash( $kw80$CB_PARTITION_SAVE, cyc_file_dependencies.$cb_help_definitions$.getGlobalValue(), ConsesLow.list( $str81$cb_partition_save_html, NIL ) );
    html_macros.note_cgi_handler_function( $sym124$CB_HANDLE_PARTITION_SAVE, $kw58$HTML_HANDLER );
    html_macros.note_cgi_handler_function( $sym129$CB_PARTITION_LOAD, $kw58$HTML_HANDLER );
    cb_utilities.setup_cb_link_method( $kw132$PARTITION_LOAD, $sym133$CB_LINK_PARTITION_LOAD, ONE_INTEGER );
    cb_utilities.declare_cb_tool( $kw132$PARTITION_LOAD, $str134$Partition_Load, $str135$PartLoad, $str136$Load_a_KB_partition );
    Hashtables.sethash( $kw140$CB_PARTITION_LOAD, cyc_file_dependencies.$cb_help_definitions$.getGlobalValue(), ConsesLow.list( $str141$cb_partition_load_html, NIL ) );
    html_macros.note_cgi_handler_function( $sym158$CB_HANDLE_PARTITION_LOAD, $kw58$HTML_HANDLER );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_cb_partitions_file();
  }

  @Override
  public void initializeVariables()
  {
    init_cb_partitions_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_cb_partitions_file();
  }
  static
  {
    me = new cb_partitions();
    $cb_partition_extension$ = null;
    $dtp_cb_partition_save$ = null;
    $cb_partition_method_table$ = null;
    $cb_current_partition_save$ = null;
    $str0$cpart = makeString( "cpart" );
    $str1$_ = makeString( "." );
    $sym2$DIRECTORY_P = makeSymbol( "DIRECTORY-P" );
    $sym3$CB_PARTITION_SAVE = makeSymbol( "CB-PARTITION-SAVE" );
    $sym4$CB_PARTITION_SAVE_P = makeSymbol( "CB-PARTITION-SAVE-P" );
    $list5 = ConsesLow.list( makeSymbol( "SPECIFIED-DIRECTORY" ), makeSymbol( "PERSONAL-DIRECTORY" ), makeSymbol( "PUBLIC-DIRECTORY" ), makeSymbol( "FILENAME" ), makeSymbol( "PREDEFINED-METHODS" ), makeSymbol(
        "ONTOLOGIES" ), makeSymbol( "QUOTED-ONTOLOGIES" ), makeSymbol( "TERMS" ) );
    $list6 = ConsesLow.list( makeKeyword( "SPECIFIED-DIRECTORY" ), makeKeyword( "PERSONAL-DIRECTORY" ), makeKeyword( "PUBLIC-DIRECTORY" ), makeKeyword( "FILENAME" ), makeKeyword( "PREDEFINED-METHODS" ), makeKeyword(
        "ONTOLOGIES" ), makeKeyword( "QUOTED-ONTOLOGIES" ), makeKeyword( "TERMS" ) );
    $list7 = ConsesLow.list( makeSymbol( "CB-PART-SAVE-SPECIFIED-DIRECTORY" ), makeSymbol( "CB-PART-SAVE-PERSONAL-DIRECTORY" ), makeSymbol( "CB-PART-SAVE-PUBLIC-DIRECTORY" ), makeSymbol( "CB-PART-SAVE-FILENAME" ),
        makeSymbol( "CB-PART-SAVE-PREDEFINED-METHODS" ), makeSymbol( "CB-PART-SAVE-ONTOLOGIES" ), makeSymbol( "CB-PART-SAVE-QUOTED-ONTOLOGIES" ), makeSymbol( "CB-PART-SAVE-TERMS" ) );
    $list8 = ConsesLow.list( makeSymbol( "_CSETF-CB-PART-SAVE-SPECIFIED-DIRECTORY" ), makeSymbol( "_CSETF-CB-PART-SAVE-PERSONAL-DIRECTORY" ), makeSymbol( "_CSETF-CB-PART-SAVE-PUBLIC-DIRECTORY" ), makeSymbol(
        "_CSETF-CB-PART-SAVE-FILENAME" ), makeSymbol( "_CSETF-CB-PART-SAVE-PREDEFINED-METHODS" ), makeSymbol( "_CSETF-CB-PART-SAVE-ONTOLOGIES" ), makeSymbol( "_CSETF-CB-PART-SAVE-QUOTED-ONTOLOGIES" ), makeSymbol(
            "_CSETF-CB-PART-SAVE-TERMS" ) );
    $sym9$DEFAULT_STRUCT_PRINT_FUNCTION = makeSymbol( "DEFAULT-STRUCT-PRINT-FUNCTION" );
    $sym10$CB_PARTITION_SAVE_PRINT_FUNCTION_TRAMPOLINE = makeSymbol( "CB-PARTITION-SAVE-PRINT-FUNCTION-TRAMPOLINE" );
    $list11 = ConsesLow.list( makeSymbol( "OPTIMIZE-FUNCALL" ), makeSymbol( "CB-PARTITION-SAVE-P" ) );
    $sym12$CB_PART_SAVE_SPECIFIED_DIRECTORY = makeSymbol( "CB-PART-SAVE-SPECIFIED-DIRECTORY" );
    $sym13$_CSETF_CB_PART_SAVE_SPECIFIED_DIRECTORY = makeSymbol( "_CSETF-CB-PART-SAVE-SPECIFIED-DIRECTORY" );
    $sym14$CB_PART_SAVE_PERSONAL_DIRECTORY = makeSymbol( "CB-PART-SAVE-PERSONAL-DIRECTORY" );
    $sym15$_CSETF_CB_PART_SAVE_PERSONAL_DIRECTORY = makeSymbol( "_CSETF-CB-PART-SAVE-PERSONAL-DIRECTORY" );
    $sym16$CB_PART_SAVE_PUBLIC_DIRECTORY = makeSymbol( "CB-PART-SAVE-PUBLIC-DIRECTORY" );
    $sym17$_CSETF_CB_PART_SAVE_PUBLIC_DIRECTORY = makeSymbol( "_CSETF-CB-PART-SAVE-PUBLIC-DIRECTORY" );
    $sym18$CB_PART_SAVE_FILENAME = makeSymbol( "CB-PART-SAVE-FILENAME" );
    $sym19$_CSETF_CB_PART_SAVE_FILENAME = makeSymbol( "_CSETF-CB-PART-SAVE-FILENAME" );
    $sym20$CB_PART_SAVE_PREDEFINED_METHODS = makeSymbol( "CB-PART-SAVE-PREDEFINED-METHODS" );
    $sym21$_CSETF_CB_PART_SAVE_PREDEFINED_METHODS = makeSymbol( "_CSETF-CB-PART-SAVE-PREDEFINED-METHODS" );
    $sym22$CB_PART_SAVE_ONTOLOGIES = makeSymbol( "CB-PART-SAVE-ONTOLOGIES" );
    $sym23$_CSETF_CB_PART_SAVE_ONTOLOGIES = makeSymbol( "_CSETF-CB-PART-SAVE-ONTOLOGIES" );
    $sym24$CB_PART_SAVE_QUOTED_ONTOLOGIES = makeSymbol( "CB-PART-SAVE-QUOTED-ONTOLOGIES" );
    $sym25$_CSETF_CB_PART_SAVE_QUOTED_ONTOLOGIES = makeSymbol( "_CSETF-CB-PART-SAVE-QUOTED-ONTOLOGIES" );
    $sym26$CB_PART_SAVE_TERMS = makeSymbol( "CB-PART-SAVE-TERMS" );
    $sym27$_CSETF_CB_PART_SAVE_TERMS = makeSymbol( "_CSETF-CB-PART-SAVE-TERMS" );
    $kw28$SPECIFIED_DIRECTORY = makeKeyword( "SPECIFIED-DIRECTORY" );
    $kw29$PERSONAL_DIRECTORY = makeKeyword( "PERSONAL-DIRECTORY" );
    $kw30$PUBLIC_DIRECTORY = makeKeyword( "PUBLIC-DIRECTORY" );
    $kw31$FILENAME = makeKeyword( "FILENAME" );
    $kw32$PREDEFINED_METHODS = makeKeyword( "PREDEFINED-METHODS" );
    $kw33$ONTOLOGIES = makeKeyword( "ONTOLOGIES" );
    $kw34$QUOTED_ONTOLOGIES = makeKeyword( "QUOTED-ONTOLOGIES" );
    $kw35$TERMS = makeKeyword( "TERMS" );
    $str36$Invalid_slot__S_for_construction_ = makeString( "Invalid slot ~S for construction function" );
    $kw37$BEGIN = makeKeyword( "BEGIN" );
    $sym38$MAKE_CB_PARTITION_SAVE = makeSymbol( "MAKE-CB-PARTITION-SAVE" );
    $kw39$SLOT = makeKeyword( "SLOT" );
    $kw40$END = makeKeyword( "END" );
    $sym41$VISIT_DEFSTRUCT_OBJECT_CB_PARTITION_SAVE_METHOD = makeSymbol( "VISIT-DEFSTRUCT-OBJECT-CB-PARTITION-SAVE-METHOD" );
    $sym42$STRINGP = makeSymbol( "STRINGP" );
    $sym43$LISTP = makeSymbol( "LISTP" );
    $kw44$FUNCTION = makeKeyword( "FUNCTION" );
    $kw45$ONTOLOGY = makeKeyword( "ONTOLOGY" );
    $kw46$QUOTED_ONTOLOGY = makeKeyword( "QUOTED-ONTOLOGY" );
    $kw47$TERM = makeKeyword( "TERM" );
    $sym48$FORT_P = makeSymbol( "FORT-P" );
    $str49$ = makeString( "" );
    $list50 = ConsesLow.list( ConsesLow.list( makeSymbol( "SCOPE-PARTITION-ALL-KB-ADDITIONS" ), makeString( "All additions to this KB since it was initially built." ) ), ConsesLow.list( makeSymbol(
        "SCOPE-PARTITION-ALL-ASSERTIONS-IN-HLMT-NAUT" ), makeString( "All assertions in MT space microtheories." ) ) );
    $sym51$FIRST = makeSymbol( "FIRST" );
    $sym52$SCOPE_PARTITION_ALL_KB_ADDITIONS = makeSymbol( "SCOPE-PARTITION-ALL-KB-ADDITIONS" );
    $sym53$SCOPE_PARTITION_ALL_ASSERTIONS_IN_HLMT_NAUT = makeSymbol( "SCOPE-PARTITION-ALL-ASSERTIONS-IN-HLMT-NAUT" );
    $str54$Scoping_assertions_in_microtheori = makeString( "Scoping assertions in microtheories that are a HLMT NAUT." );
    $kw55$SKIP = makeKeyword( "SKIP" );
    $sym56$_CB_CURRENT_PARTITION_SAVE_ = makeSymbol( "*CB-CURRENT-PARTITION-SAVE*" );
    $sym57$CATCH_ERROR_MESSAGE_HANDLER = makeSymbol( "CATCH-ERROR-MESSAGE-HANDLER" );
    $kw58$HTML_HANDLER = makeKeyword( "HTML-HANDLER" );
    $str59$_Partition_Save_ = makeString( "[Partition Save]" );
    $kw60$MAIN = makeKeyword( "MAIN" );
    $str61$cb_partition_save = makeString( "cb-partition-save" );
    $kw62$PARTITION_SAVE = makeKeyword( "PARTITION-SAVE" );
    $sym63$CB_LINK_PARTITION_SAVE = makeSymbol( "CB-LINK-PARTITION-SAVE" );
    $str64$Partition_Save = makeString( "Partition Save" );
    $str65$PartSave = makeString( "PartSave" );
    $str66$Save_out_a_KB_partition = makeString( "Save out a KB partition" );
    $str67$__DOCTYPE_html_PUBLIC_____W3C__DT = makeString( "<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">" );
    $str68$_meta_http_equiv__X_UA_Compatible = makeString( "<meta http-equiv=\"X-UA-Compatible\" content=\"IE=Edge\" >" );
    $kw69$UNINITIALIZED = makeKeyword( "UNINITIALIZED" );
    $kw70$CB_CYC = makeKeyword( "CB-CYC" );
    $kw71$SAM_AUTOCOMPLETE_CSS = makeKeyword( "SAM-AUTOCOMPLETE-CSS" );
    $kw72$SHA1 = makeKeyword( "SHA1" );
    $str73$yui_skin_sam = makeString( "yui-skin-sam" );
    $str74$reloadFrameButton = makeString( "reloadFrameButton" );
    $str75$button = makeString( "button" );
    $str76$reload = makeString( "reload" );
    $str77$Refresh_Frames = makeString( "Refresh Frames" );
    $str78$post = makeString( "post" );
    $str79$cb_handle_partition_save = makeString( "cb-handle-partition-save" );
    $kw80$CB_PARTITION_SAVE = makeKeyword( "CB-PARTITION-SAVE" );
    $str81$cb_partition_save_html = makeString( "cb-partition-save.html" );
    $str82$Reset_Form = makeString( "Reset Form" );
    $str83$Update_Partition_Scope = makeString( "Update Partition Scope" );
    $str84$update = makeString( "update" );
    $str85$Save_Partition = makeString( "Save Partition" );
    $str86$save = makeString( "save" );
    $str87$Partition_Filename = makeString( "Partition Filename" );
    $str88$Choose_or_specify_a_directory__ = makeString( "Choose or specify a directory :" );
    $str89$directory = makeString( "directory" );
    $str90$personal = makeString( "personal" );
    $str91$public = makeString( "public" );
    $str92$specified_directory = makeString( "specified_directory" );
    $str93$specified = makeString( "specified" );
    $int94$60 = makeInteger( 60 );
    $str95$Clear = makeString( "Clear" );
    $kw96$LEFT = makeKeyword( "LEFT" );
    $str97$Specify_the_filename__ = makeString( "Specify the filename :" );
    $str98$Extension = makeString( "Extension" );
    $str99$partition_filename = makeString( "partition_filename" );
    $int100$40 = makeInteger( 40 );
    $str101$Partition_Scope = makeString( "Partition Scope" );
    $str102$Clear_Partition_Scope = makeString( "Clear Partition Scope" );
    $str103$reset_scope = makeString( "reset_scope" );
    $str104$Predefined_Methods___ = makeString( "Predefined Methods : " );
    $str105$method__A = makeString( "method-~A" );
    $str106$Ontologies__instances_and_specs__ = makeString( "Ontologies (instances and specs) : " );
    $str107$None = makeString( "None" );
    $str108$ontology__A = makeString( "ontology-~A" );
    $str109$Add_Ontology__ = makeString( "Add Ontology :" );
    $str110$ontology = makeString( "ontology" );
    $str111$Complete = makeString( "Complete" );
    $const112$Collection = constant_handles.reader_make_constant_shell( makeString( "Collection" ) );
    $str113$Quoted_Ontologies__quoted_instanc = makeString( "Quoted Ontologies (quoted instances) : " );
    $str114$quoted_ontology__A = makeString( "quoted-ontology-~A" );
    $str115$Add_Quoted_Ontology__ = makeString( "Add Quoted Ontology :" );
    $str116$quoted_ontology = makeString( "quoted-ontology" );
    $str117$Terms___ = makeString( "Terms : " );
    $str118$term__A = makeString( "term-~A" );
    $str119$Add_Term___ = makeString( "Add Term : " );
    $str120$term = makeString( "term" );
    $kw121$ERROR = makeKeyword( "ERROR" );
    $str122$_S_does_not_specify_a_Cyc_collect = makeString( "~S does not specify a Cyc collection." );
    $str123$Partition_has_been_saved_ = makeString( "Partition has been saved." );
    $sym124$CB_HANDLE_PARTITION_SAVE = makeSymbol( "CB-HANDLE-PARTITION-SAVE" );
    $str125$method_ = makeString( "method-" );
    $str126$ontology_ = makeString( "ontology-" );
    $str127$quoted_ontology_ = makeString( "quoted-ontology-" );
    $str128$term_ = makeString( "term-" );
    $sym129$CB_PARTITION_LOAD = makeSymbol( "CB-PARTITION-LOAD" );
    $str130$_Partition_Load_ = makeString( "[Partition Load]" );
    $str131$cb_partition_load = makeString( "cb-partition-load" );
    $kw132$PARTITION_LOAD = makeKeyword( "PARTITION-LOAD" );
    $sym133$CB_LINK_PARTITION_LOAD = makeSymbol( "CB-LINK-PARTITION-LOAD" );
    $str134$Partition_Load = makeString( "Partition Load" );
    $str135$PartLoad = makeString( "PartLoad" );
    $str136$Load_a_KB_partition = makeString( "Load a KB partition" );
    $str137$the_Partition_Load_page = makeString( "the Partition Load page" );
    $str138$cb_handle_partition_load = makeString( "cb-handle-partition-load" );
    $str139$Specify_or_select_one_or_more_par = makeString( "Specify or select one or more partitions to load." );
    $kw140$CB_PARTITION_LOAD = makeKeyword( "CB-PARTITION-LOAD" );
    $str141$cb_partition_load_html = makeString( "cb-partition-load.html" );
    $str142$Load_Partitions = makeString( "Load Partitions" );
    $str143$load = makeString( "load" );
    $str144$Full_pathname_of_a_partition_file = makeString( "Full pathname of a partition file to load :" );
    $str145$specified_filename = makeString( "specified_filename" );
    $int146$80 = makeInteger( 80 );
    $str147$finalize = makeString( "finalize" );
    $str148$_Clean_up_after_load____Only_unch = makeString( " Clean up after load.  (Only uncheck when more partitions will be loaded after these and those partitions depend on these.)" );
    $kw149$TOP = makeKeyword( "TOP" );
    $str150$Personal_partitions_from = makeString( "Personal partitions from" );
    $str151$personal__A = makeString( "personal-~A" );
    $kw152$RIGHT = makeKeyword( "RIGHT" );
    $str153$Public_partitions_from = makeString( "Public partitions from" );
    $str154$public__A = makeString( "public-~A" );
    $str155$The_specified_filename__S_could_n = makeString( "The specified filename ~S could not be found." );
    $str156$Partition_has_been_loaded_ = makeString( "Partition has been loaded." );
    $str157$Partition_files_have_been_loaded_ = makeString( "Partition files have been loaded." );
    $sym158$CB_HANDLE_PARTITION_LOAD = makeSymbol( "CB-HANDLE-PARTITION-LOAD" );
    $list159 = ConsesLow.list( makeSymbol( "INPUT" ), makeSymbol( "VALUE" ) );
    $str160$personal_ = makeString( "personal-" );
    $str161$public_ = makeString( "public-" );
  }

  public static final class $cb_partition_save_native
      extends
        SubLStructNative
  {
    public SubLObject $specified_directory;
    public SubLObject $personal_directory;
    public SubLObject $public_directory;
    public SubLObject $filename;
    public SubLObject $predefined_methods;
    public SubLObject $ontologies;
    public SubLObject $quoted_ontologies;
    public SubLObject $terms;
    private static final SubLStructDeclNative structDecl;

    public $cb_partition_save_native()
    {
      this.$specified_directory = CommonSymbols.NIL;
      this.$personal_directory = CommonSymbols.NIL;
      this.$public_directory = CommonSymbols.NIL;
      this.$filename = CommonSymbols.NIL;
      this.$predefined_methods = CommonSymbols.NIL;
      this.$ontologies = CommonSymbols.NIL;
      this.$quoted_ontologies = CommonSymbols.NIL;
      this.$terms = CommonSymbols.NIL;
    }

    @Override
    public SubLStructDecl getStructDecl()
    {
      return $cb_partition_save_native.structDecl;
    }

    @Override
    public SubLObject getField2()
    {
      return this.$specified_directory;
    }

    @Override
    public SubLObject getField3()
    {
      return this.$personal_directory;
    }

    @Override
    public SubLObject getField4()
    {
      return this.$public_directory;
    }

    @Override
    public SubLObject getField5()
    {
      return this.$filename;
    }

    @Override
    public SubLObject getField6()
    {
      return this.$predefined_methods;
    }

    @Override
    public SubLObject getField7()
    {
      return this.$ontologies;
    }

    @Override
    public SubLObject getField8()
    {
      return this.$quoted_ontologies;
    }

    @Override
    public SubLObject getField9()
    {
      return this.$terms;
    }

    @Override
    public SubLObject setField2(final SubLObject value)
    {
      return this.$specified_directory = value;
    }

    @Override
    public SubLObject setField3(final SubLObject value)
    {
      return this.$personal_directory = value;
    }

    @Override
    public SubLObject setField4(final SubLObject value)
    {
      return this.$public_directory = value;
    }

    @Override
    public SubLObject setField5(final SubLObject value)
    {
      return this.$filename = value;
    }

    @Override
    public SubLObject setField6(final SubLObject value)
    {
      return this.$predefined_methods = value;
    }

    @Override
    public SubLObject setField7(final SubLObject value)
    {
      return this.$ontologies = value;
    }

    @Override
    public SubLObject setField8(final SubLObject value)
    {
      return this.$quoted_ontologies = value;
    }

    @Override
    public SubLObject setField9(final SubLObject value)
    {
      return this.$terms = value;
    }
    static
    {
      structDecl = Structures.makeStructDeclNative( $cb_partition_save_native.class, $sym3$CB_PARTITION_SAVE, $sym4$CB_PARTITION_SAVE_P, $list5, $list6, new String[] { "$specified_directory", "$personal_directory",
        "$public_directory", "$filename", "$predefined_methods", "$ontologies", "$quoted_ontologies", "$terms"
      }, $list7, $list8, $sym9$DEFAULT_STRUCT_PRINT_FUNCTION );
    }
  }

  public static final class $cb_partition_save_p$UnaryFunction
      extends
        UnaryFunction
  {
    public $cb_partition_save_p$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "CB-PARTITION-SAVE-P" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1)
    {
      return cb_partition_save_p( arg1 );
    }
  }
}
/*
 * 
 * Total time: 809 ms synthetic
 */