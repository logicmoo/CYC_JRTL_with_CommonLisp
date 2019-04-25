package com.cyc.cycjava.cycl.sksi.corba;

import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.cycjava.cycl.el_utilities;
import com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_sks_accessors;
import com.cyc.cycjava.cycl.hl_storage_modules;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.cycjava.cycl.arguments;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.cycjava.cycl.clause_utilities;
import com.cyc.cycjava.cycl.clauses;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class corba_storage_module_utilities
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.sksi.corba.corba_storage_module_utilities";
  public static final String myFingerPrint = "527bc6cbf2e286a75eaffa79f0d8e7359030b1a714d88e113f885a709cae6836";
  private static final SubLObject $const0$corbaSetObjectMethodArgs;
  private static final SubLObject $const1$corbaSetObjectFieldArg;
  private static final SubLObject $const2$corbaSetClassMethodArgs;
  private static final SubLObject $const3$corbaSetClassFieldArg;
  private static final SubLSymbol $sym4$ASSERTED_ARGUMENT_SPEC_P;
  private static final SubLSymbol $kw5$MONOTONIC;
  private static final SubLSymbol $kw6$STRENGTH;
  private static final SubLSymbol $kw7$BACKWARD;
  private static final SubLSymbol $kw8$DIRECTION;

  @SubLTranslatedFile.SubL(source = "cycl/sksi/corba/corba-storage-module-utilities.lisp", position = 867L)
  public static SubLObject corba_set_object_method_args_hl_storage_module_applicableP(final SubLObject argument_spec, final SubLObject cnf, final SubLObject mt, final SubLObject direction, final SubLObject variable_map)
  {
    if( NIL != clauses.gaf_cnfP( cnf ) )
    {
      final SubLObject asent = clause_utilities.gaf_cnf_literal( cnf );
      return Equality.equal( cycl_utilities.sentence_arg0( asent ), $const0$corbaSetObjectMethodArgs );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/corba/corba-storage-module-utilities.lisp", position = 1293L)
  public static SubLObject corba_set_object_field_arg_hl_storage_module_applicableP(final SubLObject argument_spec, final SubLObject cnf, final SubLObject mt, final SubLObject direction, final SubLObject variable_map)
  {
    if( NIL != clauses.gaf_cnfP( cnf ) )
    {
      final SubLObject asent = clause_utilities.gaf_cnf_literal( cnf );
      return Equality.equal( cycl_utilities.sentence_arg0( asent ), $const1$corbaSetObjectFieldArg );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/corba/corba-storage-module-utilities.lisp", position = 1602L)
  public static SubLObject corba_set_class_method_args_hl_storage_module_applicableP(final SubLObject argument_spec, final SubLObject cnf, final SubLObject mt, final SubLObject direction, final SubLObject variable_map)
  {
    if( NIL != clauses.gaf_cnfP( cnf ) )
    {
      final SubLObject asent = clause_utilities.gaf_cnf_literal( cnf );
      return Equality.equal( cycl_utilities.sentence_arg0( asent ), $const2$corbaSetClassMethodArgs );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/corba/corba-storage-module-utilities.lisp", position = 1913L)
  public static SubLObject corba_set_class_field_arg_hl_storage_module_applicableP(final SubLObject argument_spec, final SubLObject cnf, final SubLObject mt, final SubLObject direction, final SubLObject variable_map)
  {
    if( NIL != clauses.gaf_cnfP( cnf ) )
    {
      final SubLObject asent = clause_utilities.gaf_cnf_literal( cnf );
      return Equality.equal( cycl_utilities.sentence_arg0( asent ), $const3$corbaSetClassFieldArg );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/corba/corba-storage-module-utilities.lisp", position = 2220L)
  public static SubLObject corba_set_hl_storage_module_incompleteness(final SubLObject argument_spec, final SubLObject cnf, final SubLObject mt, final SubLObject direction, final SubLObject variable_map)
  {
    assert NIL != arguments.asserted_argument_spec_p( argument_spec ) : argument_spec;
    SubLObject incompleteness = NIL;
    final SubLObject strength_spec = arguments.asserted_argument_spec_strength_spec( argument_spec );
    if( $kw5$MONOTONIC != strength_spec )
    {
      incompleteness = ConsesLow.cons( $kw6$STRENGTH, incompleteness );
    }
    if( $kw7$BACKWARD != direction )
    {
      incompleteness = ConsesLow.cons( $kw8$DIRECTION, incompleteness );
    }
    return incompleteness;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/corba/corba-storage-module-utilities.lisp", position = 2709L)
  public static SubLObject corba_set_hl_storage_module_assert(final SubLObject argument_spec, final SubLObject cnf, final SubLObject mt, final SubLObject direction, final SubLObject variable_map)
  {
    final SubLObject literal = clause_utilities.gaf_cnf_literal( cnf );
    final SubLObject content_mt = hl_storage_modules.hl_storage_module_required_mt( hl_storage_modules.currently_executing_hl_storage_module() );
    final SubLObject sks = sksi_sks_accessors.find_sks_by_content_mt( content_mt );
    final SubLObject corba_connection = corba_module_utilities.find_or_create_corba_connection_by_sks( sks );
    final SubLObject corba_predicate = el_utilities.literal_arg0( literal, UNPROVIDED );
    final SubLObject args = el_utilities.literal_args( literal, UNPROVIDED );
    final SubLObject result_object = corba_utilities.corba_connection_eval( corba_connection, corba_predicate, args );
    return result_object;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/corba/corba-storage-module-utilities.lisp", position = 3291L)
  public static SubLObject corba_set_object_method_args_hl_storage_module_unassert(final SubLObject argument_spec, final SubLObject cnf, final SubLObject mt)
  {
    return NIL;
  }

  public static SubLObject declare_corba_storage_module_utilities_file()
  {
    SubLFiles.declareFunction( me, "corba_set_object_method_args_hl_storage_module_applicableP", "CORBA-SET-OBJECT-METHOD-ARGS-HL-STORAGE-MODULE-APPLICABLE?", 5, 0, false );
    SubLFiles.declareFunction( me, "corba_set_object_field_arg_hl_storage_module_applicableP", "CORBA-SET-OBJECT-FIELD-ARG-HL-STORAGE-MODULE-APPLICABLE?", 5, 0, false );
    SubLFiles.declareFunction( me, "corba_set_class_method_args_hl_storage_module_applicableP", "CORBA-SET-CLASS-METHOD-ARGS-HL-STORAGE-MODULE-APPLICABLE?", 5, 0, false );
    SubLFiles.declareFunction( me, "corba_set_class_field_arg_hl_storage_module_applicableP", "CORBA-SET-CLASS-FIELD-ARG-HL-STORAGE-MODULE-APPLICABLE?", 5, 0, false );
    SubLFiles.declareFunction( me, "corba_set_hl_storage_module_incompleteness", "CORBA-SET-HL-STORAGE-MODULE-INCOMPLETENESS", 5, 0, false );
    SubLFiles.declareFunction( me, "corba_set_hl_storage_module_assert", "CORBA-SET-HL-STORAGE-MODULE-ASSERT", 5, 0, false );
    SubLFiles.declareFunction( me, "corba_set_object_method_args_hl_storage_module_unassert", "CORBA-SET-OBJECT-METHOD-ARGS-HL-STORAGE-MODULE-UNASSERT", 3, 0, false );
    return NIL;
  }

  public static SubLObject init_corba_storage_module_utilities_file()
  {
    return NIL;
  }

  public static SubLObject setup_corba_storage_module_utilities_file()
  {
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_corba_storage_module_utilities_file();
  }

  @Override
  public void initializeVariables()
  {
    init_corba_storage_module_utilities_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_corba_storage_module_utilities_file();
  }
  static
  {
    me = new corba_storage_module_utilities();
    $const0$corbaSetObjectMethodArgs = constant_handles.reader_make_constant_shell( makeString( "corbaSetObjectMethodArgs" ) );
    $const1$corbaSetObjectFieldArg = constant_handles.reader_make_constant_shell( makeString( "corbaSetObjectFieldArg" ) );
    $const2$corbaSetClassMethodArgs = constant_handles.reader_make_constant_shell( makeString( "corbaSetClassMethodArgs" ) );
    $const3$corbaSetClassFieldArg = constant_handles.reader_make_constant_shell( makeString( "corbaSetClassFieldArg" ) );
    $sym4$ASSERTED_ARGUMENT_SPEC_P = makeSymbol( "ASSERTED-ARGUMENT-SPEC-P" );
    $kw5$MONOTONIC = makeKeyword( "MONOTONIC" );
    $kw6$STRENGTH = makeKeyword( "STRENGTH" );
    $kw7$BACKWARD = makeKeyword( "BACKWARD" );
    $kw8$DIRECTION = makeKeyword( "DIRECTION" );
  }
}
/*
 * 
 * Total time: 32 ms
 * 
 */