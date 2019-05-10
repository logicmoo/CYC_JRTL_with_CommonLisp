package com.cyc.cycjava.cycl.inference.modules.removal;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.cycjava.cycl.inference.modules.preference_modules;
import com.cyc.cycjava.cycl.inference.harness.inference_modules;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.cycjava.cycl.iteration;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class removal_modules_member_of_list
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_member_of_list";
  public static final String myFingerPrint = "25a320dc88bfc478418ec060a75ec7b0fdd0acf6e70184f8c63dcc8915e242ff";
  private static final SubLObject $const0$memberOfList;
  private static final SubLSymbol $kw1$POS;
  private static final SubLSymbol $kw2$NEG;
  private static final SubLList $list3;
  private static final SubLSymbol $kw4$REMOVAL_MEMBER_OF_LIST_CHECK;
  private static final SubLList $list5;
  private static final SubLSymbol $kw6$REMOVAL_NOT_MEMBER_OF_LIST_CHECK;
  private static final SubLList $list7;
  private static final SubLSymbol $kw8$REMOVAL_MEMBER_OF_LIST_UNIFY;
  private static final SubLList $list9;

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-member-of-list.lisp", position = 1020L)
  public static SubLObject removal_member_of_list_check_int(final SubLObject asent)
  {
    SubLObject current;
    final SubLObject datum = current = cycl_utilities.atomic_sentence_args( asent, UNPROVIDED );
    SubLObject element = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list3 );
    element = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list3 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject thelist = NIL;
    SubLObject elements = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list3 );
    thelist = current.first();
    current = ( elements = current.rest() );
    current = temp;
    if( NIL == current )
    {
      return conses_high.member( element, elements, Symbols.symbol_function( EQUAL ), UNPROVIDED );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list3 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-member-of-list.lisp", position = 1493L)
  public static SubLObject removal_member_of_list_check(final SubLObject asent, SubLObject sense)
  {
    if( sense == UNPROVIDED )
    {
      sense = NIL;
    }
    return removal_member_of_list_check_int( asent );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-member-of-list.lisp", position = 2298L)
  public static SubLObject removal_not_member_of_list_check(final SubLObject asent, SubLObject sense)
  {
    if( sense == UNPROVIDED )
    {
      sense = NIL;
    }
    return makeBoolean( NIL == removal_member_of_list_check_int( asent ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-member-of-list.lisp", position = 3161L)
  public static SubLObject removal_member_of_list_unify_cost(final SubLObject asent, SubLObject sense)
  {
    if( sense == UNPROVIDED )
    {
      sense = NIL;
    }
    SubLObject current;
    final SubLObject datum = current = cycl_utilities.atomic_sentence_args( asent, UNPROVIDED );
    SubLObject element = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list3 );
    element = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list3 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject thelist = NIL;
    SubLObject elements = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list3 );
    thelist = current.first();
    current = ( elements = current.rest() );
    current = temp;
    if( NIL == current )
    {
      return Sequences.length( elements );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list3 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-member-of-list.lisp", position = 3572L)
  public static SubLObject removal_member_of_list_unify_generate(final SubLObject the_list)
  {
    return iteration.new_list_iterator( cycl_utilities.formula_args( the_list, UNPROVIDED ) );
  }

  public static SubLObject declare_removal_modules_member_of_list_file()
  {
    SubLFiles.declareFunction( me, "removal_member_of_list_check_int", "REMOVAL-MEMBER-OF-LIST-CHECK-INT", 1, 0, false );
    SubLFiles.declareFunction( me, "removal_member_of_list_check", "REMOVAL-MEMBER-OF-LIST-CHECK", 1, 1, false );
    SubLFiles.declareFunction( me, "removal_not_member_of_list_check", "REMOVAL-NOT-MEMBER-OF-LIST-CHECK", 1, 1, false );
    SubLFiles.declareFunction( me, "removal_member_of_list_unify_cost", "REMOVAL-MEMBER-OF-LIST-UNIFY-COST", 1, 1, false );
    SubLFiles.declareFunction( me, "removal_member_of_list_unify_generate", "REMOVAL-MEMBER-OF-LIST-UNIFY-GENERATE", 1, 0, false );
    return NIL;
  }

  public static SubLObject init_removal_modules_member_of_list_file()
  {
    return NIL;
  }

  public static SubLObject setup_removal_modules_member_of_list_file()
  {
    inference_modules.register_solely_specific_removal_module_predicate( $const0$memberOfList );
    preference_modules.doomed_unless_arg_bindable( $kw1$POS, $const0$memberOfList, TWO_INTEGER );
    preference_modules.doomed_unless_all_args_bindable( $kw2$NEG, $const0$memberOfList );
    inference_modules.inference_removal_module( $kw4$REMOVAL_MEMBER_OF_LIST_CHECK, $list5 );
    inference_modules.inference_removal_module( $kw6$REMOVAL_NOT_MEMBER_OF_LIST_CHECK, $list7 );
    inference_modules.inference_removal_module( $kw8$REMOVAL_MEMBER_OF_LIST_UNIFY, $list9 );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_removal_modules_member_of_list_file();
  }

  @Override
  public void initializeVariables()
  {
    init_removal_modules_member_of_list_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_removal_modules_member_of_list_file();
  }
  static
  {
    me = new removal_modules_member_of_list();
    $const0$memberOfList = constant_handles.reader_make_constant_shell( makeString( "memberOfList" ) );
    $kw1$POS = makeKeyword( "POS" );
    $kw2$NEG = makeKeyword( "NEG" );
    $list3 = ConsesLow.list( makeSymbol( "ELEMENT" ), ConsesLow.cons( makeSymbol( "THELIST" ), makeSymbol( "ELEMENTS" ) ) );
    $kw4$REMOVAL_MEMBER_OF_LIST_CHECK = makeKeyword( "REMOVAL-MEMBER-OF-LIST-CHECK" );
    $list5 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "memberOfList" ) ), makeKeyword(
        "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "memberOfList" ) ), makeKeyword( "FULLY-BOUND" ), ConsesLow.cons( constant_handles.reader_make_constant_shell(
            makeString( "TheList" ) ), makeKeyword( "FULLY-BOUND" ) ) ), makeKeyword( "COST-EXPRESSION" ), makeSymbol( "*CHEAP-HL-MODULE-CHECK-COST*" ), makeKeyword( "COMPLETENESS" ), makeKeyword( "COMPLETE" ),
      makeKeyword( "OUTPUT-CHECK-PATTERN" ), ConsesLow.list( makeKeyword( "CALL" ), makeSymbol( "REMOVAL-MEMBER-OF-LIST-CHECK" ), makeKeyword( "INPUT" ) ), makeKeyword( "DOCUMENTATION" ), makeString(
          "(#$memberOfList <fully-bound> (#$TheList . <fully-bound>))" ), makeKeyword( "EXAMPLE" ), makeString( "(#$memberOfList #$Dog (#$TheList #$Dog #$Cat))" )
    } );
    $kw6$REMOVAL_NOT_MEMBER_OF_LIST_CHECK = makeKeyword( "REMOVAL-NOT-MEMBER-OF-LIST-CHECK" );
    $list7 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "NEG" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "memberOfList" ) ), makeKeyword(
        "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "memberOfList" ) ), makeKeyword( "FULLY-BOUND" ), ConsesLow.cons( constant_handles.reader_make_constant_shell(
            makeString( "TheList" ) ), makeKeyword( "FULLY-BOUND" ) ) ), makeKeyword( "COST-EXPRESSION" ), makeSymbol( "*CHEAP-HL-MODULE-CHECK-COST*" ), makeKeyword( "COMPLETENESS" ), makeKeyword( "COMPLETE" ),
      makeKeyword( "OUTPUT-CHECK-PATTERN" ), ConsesLow.list( makeKeyword( "CALL" ), makeSymbol( "REMOVAL-NOT-MEMBER-OF-LIST-CHECK" ), makeKeyword( "INPUT" ) ), makeKeyword( "DOCUMENTATION" ), makeString(
          "(#$not (#$memberOfList <fully-bound> (#$TheList . <fully-bound>)))" ), makeKeyword( "EXAMPLE" ), makeString( "(#$not (#$memberOfList #$Bird (#$TheList #$Dog #$Cat)))" )
    } );
    $kw8$REMOVAL_MEMBER_OF_LIST_UNIFY = makeKeyword( "REMOVAL-MEMBER-OF-LIST-UNIFY" );
    $list9 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "memberOfList" ) ), makeKeyword(
        "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "memberOfList" ) ), makeKeyword( "NOT-FULLY-BOUND" ), ConsesLow.cons( constant_handles.reader_make_constant_shell(
            makeString( "TheList" ) ), makeKeyword( "FULLY-BOUND" ) ) ), makeKeyword( "COST" ), makeSymbol( "REMOVAL-MEMBER-OF-LIST-UNIFY-COST" ), makeKeyword( "COMPLETENESS" ), makeKeyword( "COMPLETE" ), makeKeyword(
                "INPUT-EXTRACT-PATTERN" ), ConsesLow.list( makeKeyword( "TEMPLATE" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "memberOfList" ) ), makeKeyword( "ANYTHING" ), ConsesLow
                    .list( makeKeyword( "BIND" ), makeSymbol( "THE-LIST" ) ) ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "THE-LIST" ) ) ), makeKeyword( "OUTPUT-GENERATE-PATTERN" ), ConsesLow.list( makeKeyword(
                        "CALL" ), makeSymbol( "REMOVAL-MEMBER-OF-LIST-UNIFY-GENERATE" ), makeKeyword( "INPUT" ) ), makeKeyword( "OUTPUT-CONSTRUCT-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell(
                            makeString( "memberOfList" ) ), makeKeyword( "INPUT" ), ConsesLow.list( makeKeyword( "VALUE" ), makeSymbol( "THE-LIST" ) ) ), makeKeyword( "DOCUMENTATION" ), makeString(
                                "(#$memberOfList <not fully-bound> (#$TheList . <fully-bound>))" ), makeKeyword( "EXAMPLE" ), makeString( "(#$memberOfList ?WHAT (#$TheList #$Dog #$Cat))" )
    } );
  }
}
/*
 * 
 * Total time: 30 ms
 * 
 */