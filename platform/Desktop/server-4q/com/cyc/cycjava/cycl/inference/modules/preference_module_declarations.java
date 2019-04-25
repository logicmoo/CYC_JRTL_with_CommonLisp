package com.cyc.cycjava.cycl.inference.modules;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class preference_module_declarations
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.inference.modules.preference_module_declarations";
  public static final String myFingerPrint = "1230d3a84dde5f6b3fcfc688beaf0bccbc1563481458e2b3afdc6f1c259a6999";
  private static final SubLSymbol $kw0$ABNORMAL_DELAY_POS;
  private static final SubLList $list1;
  private static final SubLSymbol $kw2$INCREASE_OR_DECREASE_IN_VALUE_RETURNED_BY_NOT_FULLY_BOUND;
  private static final SubLList $list3;
  private static final SubLSymbol $kw4$REQUIRE_ARG1_FULLY_BOUND_GENERAL;
  private static final SubLList $list5;

  public static SubLObject declare_preference_module_declarations_file()
  {
    return NIL;
  }

  public static SubLObject init_preference_module_declarations_file()
  {
    return NIL;
  }

  public static SubLObject setup_preference_module_declarations_file()
  {
    preference_modules.inference_preference_module( $kw0$ABNORMAL_DELAY_POS, $list1 );
    preference_modules.inference_preference_module( $kw2$INCREASE_OR_DECREASE_IN_VALUE_RETURNED_BY_NOT_FULLY_BOUND, $list3 );
    preference_modules.inference_preference_module( $kw4$REQUIRE_ARG1_FULLY_BOUND_GENERAL, $list5 );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_preference_module_declarations_file();
  }

  @Override
  public void initializeVariables()
  {
    init_preference_module_declarations_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_preference_module_declarations_file();
  }
  static
  {
    me = new preference_module_declarations();
    $kw0$ABNORMAL_DELAY_POS = makeKeyword( "ABNORMAL-DELAY-POS" );
    $list1 = ConsesLow.list( makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "abnormal" ) ), makeKeyword( "REQUIRED-PATTERN" ), ConsesLow
        .cons( constant_handles.reader_make_constant_shell( makeString( "abnormal" ) ), makeKeyword( "NOT-FULLY-BOUND" ) ), makeKeyword( "PREFERENCE-LEVEL" ), makeKeyword( "DISALLOWED" ) );
    $kw2$INCREASE_OR_DECREASE_IN_VALUE_RETURNED_BY_NOT_FULLY_BOUND = makeKeyword( "INCREASE-OR-DECREASE-IN-VALUE-RETURNED-BY-NOT-FULLY-BOUND" );
    $list3 = ConsesLow.list( makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "ANY-PREDICATES" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "decreaseInValueReturnedBy" ) ),
        constant_handles.reader_make_constant_shell( makeString( "increaseInValueReturnedBy" ) ) ), makeKeyword( "REQUIRED-PATTERN" ), ConsesLow.list( makeKeyword( "OR" ), ConsesLow.list( makeKeyword( "ANYTHING" ),
            makeKeyword( "NOT-FULLY-BOUND" ), makeKeyword( "ANYTHING" ), makeKeyword( "NOT-FULLY-BOUND" ) ), ConsesLow.list( makeKeyword( "ANYTHING" ), makeKeyword( "ANYTHING" ), makeKeyword( "NOT-FULLY-BOUND" ),
                makeKeyword( "NOT-FULLY-BOUND" ) ) ), makeKeyword( "PREFERENCE-LEVEL" ), makeKeyword( "GROSSLY-DISPREFERRED" ) );
    $kw4$REQUIRE_ARG1_FULLY_BOUND_GENERAL = makeKeyword( "REQUIRE-ARG1-FULLY-BOUND-GENERAL" );
    $list5 = ConsesLow.list( makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "ANY-PREDICATES" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "candidateTriggerSituationTypes" ) ) ),
        makeKeyword( "REQUIRED-PATTERN" ), ConsesLow.listS( makeKeyword( "ANYTHING" ), makeKeyword( "NOT-FULLY-BOUND" ), makeKeyword( "ANYTHING" ) ), makeKeyword( "PREFERENCE-LEVEL" ), makeKeyword( "DISALLOWED" ) );
  }
}
/*
 * 
 * Total time: 65 ms
 * 
 */