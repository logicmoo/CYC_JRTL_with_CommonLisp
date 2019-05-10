package com.cyc.cycjava.cycl.inference.modules.removal;

import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.cycjava.cycl.inference.modules.preference_modules;
import com.cyc.cycjava.cycl.inference.harness.inference_modules;
import com.cyc.cycjava.cycl.control_vars;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.cycjava.cycl.numeric_date_utilities;
import com.cyc.cycjava.cycl.date_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.cycjava.cycl.bindings;
import com.cyc.cycjava.cycl.unification_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.cycjava.cycl.backward;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.cycjava.cycl.bookkeeping_store;
import com.cyc.cycjava.cycl.mt_relevance_macros;
import com.cyc.cycjava.cycl.arguments;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class removal_modules_bookkeeping
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_bookkeeping";
  public static final String myFingerPrint = "96048f2e20e82611ed9d099eddc09f88c7e1a057ed9124e68ea54ba98ed13404";
  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-bookkeeping.lisp", position = 884L)
  private static SubLSymbol $bookkeeping_check_default_cost$;
  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-bookkeeping.lisp", position = 2013L)
  private static SubLSymbol $my_creator_check_default_cost$;
  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-bookkeeping.lisp", position = 4447L)
  private static SubLSymbol $my_creator_unify_arg2_default_cost$;
  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-bookkeeping.lisp", position = 7377L)
  private static SubLSymbol $my_creation_time_check_default_cost$;
  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-bookkeeping.lisp", position = 10039L)
  private static SubLSymbol $my_creation_time_unify_arg2_default_cost$;
  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-bookkeeping.lisp", position = 11824L)
  private static SubLSymbol $my_creation_purpose_check_default_cost$;
  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-bookkeeping.lisp", position = 14544L)
  private static SubLSymbol $my_creation_purpose_unify_arg2_default_cost$;
  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-bookkeeping.lisp", position = 17705L)
  private static SubLSymbol $my_creation_second_check_default_cost$;
  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-bookkeeping.lisp", position = 20444L)
  private static SubLSymbol $my_creation_second_unify_arg2_default_cost$;
  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-bookkeeping.lisp", position = 21910L)
  private static SubLSymbol $my_creation_date_check_default_cost$;
  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-bookkeeping.lisp", position = 21910L)
  private static SubLSymbol $my_creation_date_unify_arg2_default_cost$;
  private static final SubLSymbol $kw0$BOOKKEEPING;
  private static final SubLObject $const1$BookkeepingMt;
  private static final SubLSymbol $kw2$TRUE_MON;
  private static final SubLObject $const3$myCreator;
  private static final SubLSymbol $kw4$POS;
  private static final SubLSymbol $kw5$NEG;
  private static final SubLSymbol $kw6$REMOVAL_MY_CREATOR_CHECK_POS;
  private static final SubLList $list7;
  private static final SubLSymbol $kw8$REMOVAL_MY_CREATOR_CHECK_NEG;
  private static final SubLList $list9;
  private static final SubLSymbol $kw10$REMOVAL_MY_CREATOR_UNIFY_ARG2;
  private static final SubLList $list11;
  private static final SubLSymbol $kw12$REMOVAL_MY_CREATOR_UNIFY_ARG1;
  private static final SubLList $list13;
  private static final SubLObject $const14$myCreationTime;
  private static final SubLSymbol $kw15$REMOVAL_MY_CREATION_TIME_CHECK_POS;
  private static final SubLList $list16;
  private static final SubLSymbol $kw17$REMOVAL_MY_CREATION_TIME_CHECK_NEG;
  private static final SubLList $list18;
  private static final SubLSymbol $kw19$REMOVAL_MY_CREATION_TIME_UNIFY_ARG2;
  private static final SubLList $list20;
  private static final SubLObject $const21$myCreationPurpose;
  private static final SubLSymbol $kw22$REMOVAL_MY_CREATION_PURPOSE_CHECK_POS;
  private static final SubLList $list23;
  private static final SubLSymbol $kw24$REMOVAL_MY_CREATION_PURPOSE_CHECK_NEG;
  private static final SubLList $list25;
  private static final SubLSymbol $kw26$REMOVAL_MY_CREATION_PURPOSE_UNIFY_ARG2;
  private static final SubLList $list27;
  private static final SubLSymbol $kw28$REMOVAL_MY_CREATION_PURPOSE_UNIFY_ARG1;
  private static final SubLList $list29;
  private static final SubLObject $const30$myCreationSecond;
  private static final SubLSymbol $kw31$REMOVAL_MY_CREATION_SECOND_CHECK_POS;
  private static final SubLList $list32;
  private static final SubLSymbol $kw33$REMOVAL_MY_CREATION_SECOND_CHECK_NEG;
  private static final SubLList $list34;
  private static final SubLSymbol $kw35$REMOVAL_MY_CREATION_SECOND_UNIFY_ARG2;
  private static final SubLList $list36;
  private static final SubLObject $const37$myCreationDate;
  private static final SubLSymbol $kw38$REMOVAL_MY_CREATION_DATE_CHECK_POS;
  private static final SubLList $list39;
  private static final SubLObject $const40$not;
  private static final SubLSymbol $kw41$REMOVAL_MY_CREATION_DATE_CHECK_NEG;
  private static final SubLList $list42;
  private static final SubLSymbol $kw43$REMOVAL_MY_CREATION_DATE_UNIFY_ARG2;
  private static final SubLList $list44;

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-bookkeeping.lisp", position = 1539L)
  public static SubLObject make_bookkeeping_hl_support(final SubLObject asent)
  {
    return arguments.make_hl_support( $kw0$BOOKKEEPING, asent, $const1$BookkeepingMt, $kw2$TRUE_MON );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-bookkeeping.lisp", position = 2126L)
  public static SubLObject removal_my_creator_check_cost(final SubLObject asent)
  {
    if( NIL != mt_relevance_macros.relevant_mtP( $const1$BookkeepingMt ) )
    {
      return $my_creator_check_default_cost$.getGlobalValue();
    }
    return ZERO_INTEGER;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-bookkeeping.lisp", position = 2298L)
  public static SubLObject my_creator_arg2_lookup(final SubLObject arg1)
  {
    return bookkeeping_store.creator( arg1, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-bookkeeping.lisp", position = 2369L)
  public static SubLObject make_my_creator_hl_support(final SubLObject asent)
  {
    return make_bookkeeping_hl_support( asent );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-bookkeeping.lisp", position = 2466L)
  public static SubLObject removal_my_creator_check_pos_cost(final SubLObject asent, SubLObject sense)
  {
    if( sense == UNPROVIDED )
    {
      sense = NIL;
    }
    return removal_my_creator_check_cost( asent );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-bookkeeping.lisp", position = 2657L)
  public static SubLObject removal_my_creator_check_pos_expand(final SubLObject asent, SubLObject sense)
  {
    if( sense == UNPROVIDED )
    {
      sense = NIL;
    }
    if( NIL != mt_relevance_macros.relevant_mtP( $const1$BookkeepingMt ) )
    {
      final SubLObject asent_arg1 = cycl_utilities.sentence_arg1( asent, UNPROVIDED );
      final SubLObject asent_arg2 = cycl_utilities.sentence_arg2( asent, UNPROVIDED );
      final SubLObject lookup_arg2 = my_creator_arg2_lookup( asent_arg1 );
      if( asent_arg2.eql( lookup_arg2 ) )
      {
        backward.removal_add_node( make_my_creator_hl_support( asent ), UNPROVIDED, UNPROVIDED );
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-bookkeeping.lisp", position = 3448L)
  public static SubLObject removal_my_creator_check_neg_cost(final SubLObject asent, SubLObject sense)
  {
    if( sense == UNPROVIDED )
    {
      sense = NIL;
    }
    return removal_my_creator_check_cost( asent );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-bookkeeping.lisp", position = 3601L)
  public static SubLObject removal_my_creator_check_neg_expand(final SubLObject asent, SubLObject sense)
  {
    if( sense == UNPROVIDED )
    {
      sense = NIL;
    }
    if( NIL != mt_relevance_macros.relevant_mtP( $const1$BookkeepingMt ) )
    {
      final SubLObject asent_arg1 = cycl_utilities.sentence_arg1( asent, UNPROVIDED );
      final SubLObject asent_arg2 = cycl_utilities.sentence_arg2( asent, UNPROVIDED );
      final SubLObject lookup_arg2 = my_creator_arg2_lookup( asent_arg1 );
      if( NIL != lookup_arg2 && !asent_arg2.eql( lookup_arg2 ) )
      {
        backward.removal_add_node( make_my_creator_hl_support( cycl_utilities.negate( asent ) ), UNPROVIDED, UNPROVIDED );
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-bookkeeping.lisp", position = 4558L)
  public static SubLObject removal_my_creator_unify_arg2_cost(final SubLObject asent, SubLObject sense)
  {
    if( sense == UNPROVIDED )
    {
      sense = NIL;
    }
    if( NIL != mt_relevance_macros.relevant_mtP( $const1$BookkeepingMt ) )
    {
      return $my_creator_unify_arg2_default_cost$.getGlobalValue();
    }
    return ZERO_INTEGER;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-bookkeeping.lisp", position = 4819L)
  public static SubLObject removal_my_creator_unify_arg2_expand(final SubLObject asent, SubLObject sense)
  {
    if( sense == UNPROVIDED )
    {
      sense = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != mt_relevance_macros.relevant_mtP( $const1$BookkeepingMt ) )
    {
      final SubLObject arg1 = cycl_utilities.sentence_arg1( asent, UNPROVIDED );
      final SubLObject arg2 = cycl_utilities.sentence_arg2( asent, UNPROVIDED );
      final SubLObject cyclist = my_creator_arg2_lookup( arg1 );
      if( NIL != cyclist )
      {
        thread.resetMultipleValues();
        final SubLObject v_bindings = unification_utilities.term_unify( cyclist, arg2, T, T );
        final SubLObject unify_justification = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if( NIL != v_bindings )
        {
          final SubLObject ground_asent = bindings.subst_bindings( v_bindings, asent );
          backward.removal_add_node( make_my_creator_hl_support( ground_asent ), v_bindings, unify_justification );
        }
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-bookkeeping.lisp", position = 5820L)
  public static SubLObject removal_my_creator_unify_arg1_cost(final SubLObject asent, SubLObject sense)
  {
    if( sense == UNPROVIDED )
    {
      sense = NIL;
    }
    if( NIL != mt_relevance_macros.relevant_mtP( $const1$BookkeepingMt ) )
    {
      return bookkeeping_store.num_terms_created_by( cycl_utilities.sentence_arg2( asent, UNPROVIDED ), UNPROVIDED );
    }
    return ZERO_INTEGER;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-bookkeeping.lisp", position = 6041L)
  public static SubLObject removal_my_creator_unify_arg1_expand(final SubLObject asent, SubLObject sense)
  {
    if( sense == UNPROVIDED )
    {
      sense = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != mt_relevance_macros.relevant_mtP( $const1$BookkeepingMt ) )
    {
      final SubLObject arg1 = cycl_utilities.sentence_arg1( asent, UNPROVIDED );
      final SubLObject arg2 = cycl_utilities.sentence_arg2( asent, UNPROVIDED );
      final SubLObject terms = bookkeeping_store.terms_created_by( arg2, UNPROVIDED );
      if( NIL != terms )
      {
        SubLObject cdolist_list_var = terms;
        SubLObject v_term = NIL;
        v_term = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          thread.resetMultipleValues();
          final SubLObject v_bindings = unification_utilities.term_unify( v_term, arg1, T, T );
          final SubLObject unify_justification = thread.secondMultipleValue();
          thread.resetMultipleValues();
          if( NIL != v_bindings )
          {
            final SubLObject ground_asent = bindings.subst_bindings( v_bindings, asent );
            backward.removal_add_node( make_my_creator_hl_support( ground_asent ), v_bindings, unify_justification );
          }
          cdolist_list_var = cdolist_list_var.rest();
          v_term = cdolist_list_var.first();
        }
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-bookkeeping.lisp", position = 7501L)
  public static SubLObject removal_my_creation_time_check_cost(final SubLObject asent)
  {
    if( NIL != mt_relevance_macros.relevant_mtP( $const1$BookkeepingMt ) )
    {
      return $my_creation_time_check_default_cost$.getGlobalValue();
    }
    return ZERO_INTEGER;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-bookkeeping.lisp", position = 7685L)
  public static SubLObject my_creation_time_arg2_lookup(final SubLObject arg1)
  {
    return bookkeeping_store.creation_time( arg1, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-bookkeeping.lisp", position = 7768L)
  public static SubLObject make_my_creation_time_hl_support(final SubLObject asent)
  {
    return make_bookkeeping_hl_support( asent );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-bookkeeping.lisp", position = 7871L)
  public static SubLObject removal_my_creation_time_check_pos_cost(final SubLObject asent, SubLObject sense)
  {
    if( sense == UNPROVIDED )
    {
      sense = NIL;
    }
    return removal_my_creation_time_check_cost( asent );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-bookkeeping.lisp", position = 8074L)
  public static SubLObject removal_my_creation_time_check_pos_expand(final SubLObject asent, SubLObject sense)
  {
    if( sense == UNPROVIDED )
    {
      sense = NIL;
    }
    if( NIL != mt_relevance_macros.relevant_mtP( $const1$BookkeepingMt ) )
    {
      final SubLObject asent_arg1 = cycl_utilities.sentence_arg1( asent, UNPROVIDED );
      final SubLObject asent_arg2 = cycl_utilities.sentence_arg2( asent, UNPROVIDED );
      final SubLObject lookup_arg2 = my_creation_time_arg2_lookup( asent_arg1 );
      if( asent_arg2.eql( lookup_arg2 ) )
      {
        backward.removal_add_node( make_my_creation_time_hl_support( asent ), UNPROVIDED, UNPROVIDED );
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-bookkeeping.lisp", position = 8946L)
  public static SubLObject removal_my_creation_time_check_neg_cost(final SubLObject asent, SubLObject sense)
  {
    if( sense == UNPROVIDED )
    {
      sense = NIL;
    }
    return removal_my_creation_time_check_cost( asent );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-bookkeeping.lisp", position = 9111L)
  public static SubLObject removal_my_creation_time_check_neg_expand(final SubLObject asent, SubLObject sense)
  {
    if( sense == UNPROVIDED )
    {
      sense = NIL;
    }
    if( NIL != mt_relevance_macros.relevant_mtP( $const1$BookkeepingMt ) )
    {
      final SubLObject asent_arg1 = cycl_utilities.sentence_arg1( asent, UNPROVIDED );
      final SubLObject asent_arg2 = cycl_utilities.sentence_arg2( asent, UNPROVIDED );
      final SubLObject lookup_arg2 = my_creation_time_arg2_lookup( asent_arg1 );
      if( NIL != lookup_arg2 && !asent_arg2.eql( lookup_arg2 ) )
      {
        backward.removal_add_node( make_my_creation_time_hl_support( cycl_utilities.negate( asent ) ), UNPROVIDED, UNPROVIDED );
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-bookkeeping.lisp", position = 10156L)
  public static SubLObject removal_my_creation_time_unify_arg2_cost(final SubLObject asent, SubLObject sense)
  {
    if( sense == UNPROVIDED )
    {
      sense = NIL;
    }
    if( NIL != mt_relevance_macros.relevant_mtP( $const1$BookkeepingMt ) )
    {
      return $my_creation_time_unify_arg2_default_cost$.getGlobalValue();
    }
    return ZERO_INTEGER;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-bookkeeping.lisp", position = 10429L)
  public static SubLObject removal_my_creation_time_unify_arg2_expand(final SubLObject asent, SubLObject sense)
  {
    if( sense == UNPROVIDED )
    {
      sense = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != mt_relevance_macros.relevant_mtP( $const1$BookkeepingMt ) )
    {
      final SubLObject arg1 = cycl_utilities.sentence_arg1( asent, UNPROVIDED );
      final SubLObject variable = cycl_utilities.sentence_arg2( asent, UNPROVIDED );
      final SubLObject arg2 = my_creation_time_arg2_lookup( arg1 );
      if( NIL != arg2 )
      {
        thread.resetMultipleValues();
        final SubLObject v_bindings = unification_utilities.term_unify( arg2, variable, T, T );
        final SubLObject unify_justification = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if( NIL != v_bindings )
        {
          final SubLObject ground_asent = bindings.subst_bindings( v_bindings, asent );
          backward.removal_add_node( make_my_creation_time_hl_support( ground_asent ), v_bindings, unify_justification );
        }
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-bookkeeping.lisp", position = 11954L)
  public static SubLObject removal_my_creation_purpose_check_cost(final SubLObject asent)
  {
    if( NIL != mt_relevance_macros.relevant_mtP( $const1$BookkeepingMt ) )
    {
      return $my_creation_purpose_check_default_cost$.getGlobalValue();
    }
    return ZERO_INTEGER;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-bookkeeping.lisp", position = 12144L)
  public static SubLObject my_creation_purpose_arg2_lookup(final SubLObject arg1)
  {
    return bookkeeping_store.creation_purpose( arg1, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-bookkeeping.lisp", position = 12233L)
  public static SubLObject make_my_creation_purpose_hl_support(final SubLObject asent)
  {
    return make_bookkeeping_hl_support( asent );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-bookkeeping.lisp", position = 12339L)
  public static SubLObject removal_my_creation_purpose_check_pos_cost(final SubLObject asent, SubLObject sense)
  {
    if( sense == UNPROVIDED )
    {
      sense = NIL;
    }
    return removal_my_creation_purpose_check_cost( asent );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-bookkeeping.lisp", position = 12548L)
  public static SubLObject removal_my_creation_purpose_check_pos_expand(final SubLObject asent, SubLObject sense)
  {
    if( sense == UNPROVIDED )
    {
      sense = NIL;
    }
    if( NIL != mt_relevance_macros.relevant_mtP( $const1$BookkeepingMt ) )
    {
      final SubLObject asent_arg1 = cycl_utilities.sentence_arg1( asent, UNPROVIDED );
      final SubLObject asent_arg2 = cycl_utilities.sentence_arg2( asent, UNPROVIDED );
      final SubLObject lookup_arg2 = my_creation_purpose_arg2_lookup( asent_arg1 );
      if( asent_arg2.eql( lookup_arg2 ) )
      {
        backward.removal_add_node( make_my_creation_purpose_hl_support( asent ), UNPROVIDED, UNPROVIDED );
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-bookkeeping.lisp", position = 13428L)
  public static SubLObject removal_my_creation_purpose_check_neg_cost(final SubLObject asent, SubLObject sense)
  {
    if( sense == UNPROVIDED )
    {
      sense = NIL;
    }
    return removal_my_creation_purpose_check_cost( asent );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-bookkeeping.lisp", position = 13599L)
  public static SubLObject removal_my_creation_purpose_check_neg_expand(final SubLObject asent, SubLObject sense)
  {
    if( sense == UNPROVIDED )
    {
      sense = NIL;
    }
    if( NIL != mt_relevance_macros.relevant_mtP( $const1$BookkeepingMt ) )
    {
      final SubLObject asent_arg1 = cycl_utilities.sentence_arg1( asent, UNPROVIDED );
      final SubLObject asent_arg2 = cycl_utilities.sentence_arg2( asent, UNPROVIDED );
      final SubLObject lookup_arg2 = my_creation_purpose_arg2_lookup( asent_arg1 );
      if( NIL != lookup_arg2 && !asent_arg2.eql( lookup_arg2 ) )
      {
        backward.removal_add_node( make_my_creation_purpose_hl_support( cycl_utilities.negate( asent ) ), UNPROVIDED, UNPROVIDED );
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-bookkeeping.lisp", position = 14664L)
  public static SubLObject removal_my_creation_purpose_unify_arg2_cost(final SubLObject asent, SubLObject sense)
  {
    if( sense == UNPROVIDED )
    {
      sense = NIL;
    }
    if( NIL != mt_relevance_macros.relevant_mtP( $const1$BookkeepingMt ) )
    {
      return $my_creation_purpose_unify_arg2_default_cost$.getGlobalValue();
    }
    return ZERO_INTEGER;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-bookkeeping.lisp", position = 14943L)
  public static SubLObject removal_my_creation_purpose_unify_arg2_expand(final SubLObject asent, SubLObject sense)
  {
    if( sense == UNPROVIDED )
    {
      sense = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != mt_relevance_macros.relevant_mtP( $const1$BookkeepingMt ) )
    {
      final SubLObject arg1 = cycl_utilities.sentence_arg1( asent, UNPROVIDED );
      final SubLObject not_fully_bound = cycl_utilities.sentence_arg2( asent, UNPROVIDED );
      final SubLObject arg2 = my_creation_purpose_arg2_lookup( arg1 );
      if( NIL != arg2 )
      {
        thread.resetMultipleValues();
        final SubLObject v_bindings = unification_utilities.term_unify( arg2, not_fully_bound, T, T );
        final SubLObject unify_justification = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if( NIL != v_bindings )
        {
          final SubLObject ground_asent = bindings.subst_bindings( v_bindings, asent );
          backward.removal_add_node( make_my_creation_purpose_hl_support( ground_asent ), v_bindings, unify_justification );
        }
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-bookkeeping.lisp", position = 16045L)
  public static SubLObject removal_my_creation_purpose_unify_arg1_cost(final SubLObject asent, SubLObject sense)
  {
    if( sense == UNPROVIDED )
    {
      sense = NIL;
    }
    if( NIL != mt_relevance_macros.relevant_mtP( $const1$BookkeepingMt ) )
    {
      return bookkeeping_store.num_terms_created_for( cycl_utilities.sentence_arg2( asent, UNPROVIDED ), UNPROVIDED );
    }
    return ZERO_INTEGER;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-bookkeeping.lisp", position = 16276L)
  public static SubLObject removal_my_creation_purpose_unify_arg1_expand(final SubLObject asent, SubLObject sense)
  {
    if( sense == UNPROVIDED )
    {
      sense = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != mt_relevance_macros.relevant_mtP( $const1$BookkeepingMt ) )
    {
      final SubLObject arg1 = cycl_utilities.sentence_arg1( asent, UNPROVIDED );
      final SubLObject arg2 = cycl_utilities.sentence_arg2( asent, UNPROVIDED );
      final SubLObject terms = bookkeeping_store.terms_created_for( arg2, UNPROVIDED );
      if( NIL != terms )
      {
        SubLObject cdolist_list_var = terms;
        SubLObject v_term = NIL;
        v_term = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          thread.resetMultipleValues();
          final SubLObject v_bindings = unification_utilities.term_unify( v_term, arg1, T, T );
          final SubLObject unify_justification = thread.secondMultipleValue();
          thread.resetMultipleValues();
          if( NIL != v_bindings )
          {
            final SubLObject ground_asent = bindings.subst_bindings( v_bindings, asent );
            backward.removal_add_node( make_my_creation_purpose_hl_support( ground_asent ), v_bindings, unify_justification );
          }
          cdolist_list_var = cdolist_list_var.rest();
          v_term = cdolist_list_var.first();
        }
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-bookkeeping.lisp", position = 17833L)
  public static SubLObject removal_my_creation_second_check_cost(final SubLObject asent)
  {
    if( NIL != mt_relevance_macros.relevant_mtP( $const1$BookkeepingMt ) )
    {
      return $my_creation_second_check_default_cost$.getGlobalValue();
    }
    return ZERO_INTEGER;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-bookkeeping.lisp", position = 18021L)
  public static SubLObject my_creation_second_arg2_lookup(final SubLObject arg1)
  {
    return bookkeeping_store.creation_second( arg1, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-bookkeeping.lisp", position = 18108L)
  public static SubLObject make_my_creation_second_hl_support(final SubLObject asent)
  {
    return make_bookkeeping_hl_support( asent );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-bookkeeping.lisp", position = 18213L)
  public static SubLObject removal_my_creation_second_check_pos_cost(final SubLObject asent, SubLObject sense)
  {
    if( sense == UNPROVIDED )
    {
      sense = NIL;
    }
    return removal_my_creation_second_check_cost( asent );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-bookkeeping.lisp", position = 18420L)
  public static SubLObject removal_my_creation_second_check_pos_expand(final SubLObject asent, SubLObject sense)
  {
    if( sense == UNPROVIDED )
    {
      sense = NIL;
    }
    if( NIL != mt_relevance_macros.relevant_mtP( $const1$BookkeepingMt ) )
    {
      final SubLObject asent_arg1 = cycl_utilities.sentence_arg1( asent, UNPROVIDED );
      final SubLObject asent_arg2 = cycl_utilities.sentence_arg2( asent, UNPROVIDED );
      final SubLObject lookup_arg2 = my_creation_second_arg2_lookup( asent_arg1 );
      if( asent_arg2.eql( lookup_arg2 ) )
      {
        backward.removal_add_node( make_my_creation_second_hl_support( asent ), UNPROVIDED, UNPROVIDED );
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-bookkeeping.lisp", position = 19321L)
  public static SubLObject removal_my_creation_second_check_neg_cost(final SubLObject asent, SubLObject sense)
  {
    if( sense == UNPROVIDED )
    {
      sense = NIL;
    }
    return removal_my_creation_second_check_cost( asent );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-bookkeeping.lisp", position = 19490L)
  public static SubLObject removal_my_creation_second_check_neg_expand(final SubLObject asent, SubLObject sense)
  {
    if( sense == UNPROVIDED )
    {
      sense = NIL;
    }
    if( NIL != mt_relevance_macros.relevant_mtP( $const1$BookkeepingMt ) )
    {
      final SubLObject asent_arg1 = cycl_utilities.sentence_arg1( asent, UNPROVIDED );
      final SubLObject asent_arg2 = cycl_utilities.sentence_arg2( asent, UNPROVIDED );
      final SubLObject lookup_arg2 = my_creation_second_arg2_lookup( asent_arg1 );
      if( NIL != lookup_arg2 && !asent_arg2.eql( lookup_arg2 ) )
      {
        backward.removal_add_node( make_my_creation_second_hl_support( cycl_utilities.negate( asent ) ), UNPROVIDED, UNPROVIDED );
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-bookkeeping.lisp", position = 20563L)
  public static SubLObject removal_my_creation_second_unify_arg2_cost(final SubLObject asent, SubLObject sense)
  {
    if( sense == UNPROVIDED )
    {
      sense = NIL;
    }
    if( NIL != mt_relevance_macros.relevant_mtP( $const1$BookkeepingMt ) )
    {
      return $my_creation_second_unify_arg2_default_cost$.getGlobalValue();
    }
    return ZERO_INTEGER;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-bookkeeping.lisp", position = 20840L)
  public static SubLObject removal_my_creation_second_unify_arg2_expand(final SubLObject asent, SubLObject sense)
  {
    if( sense == UNPROVIDED )
    {
      sense = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != mt_relevance_macros.relevant_mtP( $const1$BookkeepingMt ) )
    {
      final SubLObject arg1 = cycl_utilities.sentence_arg1( asent, UNPROVIDED );
      final SubLObject variable = cycl_utilities.sentence_arg2( asent, UNPROVIDED );
      final SubLObject arg2 = my_creation_second_arg2_lookup( arg1 );
      if( NIL != arg2 )
      {
        thread.resetMultipleValues();
        final SubLObject v_bindings = unification_utilities.term_unify( arg2, variable, T, T );
        final SubLObject unify_justification = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if( NIL != v_bindings )
        {
          final SubLObject ground_asent = bindings.subst_bindings( v_bindings, asent );
          backward.removal_add_node( make_my_creation_second_hl_support( ground_asent ), v_bindings, unify_justification );
        }
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-bookkeeping.lisp", position = 21910L)
  public static SubLObject removal_my_creation_date_check_cost(final SubLObject asent)
  {
    if( NIL != mt_relevance_macros.relevant_mtP( $const1$BookkeepingMt ) )
    {
      return $my_creation_date_check_default_cost$.getGlobalValue();
    }
    return ZERO_INTEGER;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-bookkeeping.lisp", position = 21910L)
  public static SubLObject my_creation_date_arg2_lookup(final SubLObject arg1)
  {
    final SubLObject date = bookkeeping_store.creation_time( arg1, UNPROVIDED );
    final SubLObject second = bookkeeping_store.creation_second( arg1, UNPROVIDED );
    if( NIL == date )
    {
      return NIL;
    }
    if( NIL == second )
    {
      return date_utilities.universal_date_to_cycl_date( date );
    }
    final SubLObject time = numeric_date_utilities.universal_time_from_date_and_second( date, second );
    return date_utilities.universal_time_to_cycl_date( time );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-bookkeeping.lisp", position = 21910L)
  public static SubLObject removal_my_creation_date_check_pos_cost(final SubLObject asent, SubLObject sense)
  {
    if( sense == UNPROVIDED )
    {
      sense = NIL;
    }
    return removal_my_creation_date_check_cost( asent );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-bookkeeping.lisp", position = 21910L)
  public static SubLObject removal_my_creation_date_check_pos_expand(final SubLObject asent, SubLObject sense)
  {
    if( sense == UNPROVIDED )
    {
      sense = NIL;
    }
    if( NIL != mt_relevance_macros.relevant_mtP( $const1$BookkeepingMt ) )
    {
      final SubLObject asent_arg1 = cycl_utilities.sentence_arg1( asent, UNPROVIDED );
      final SubLObject asent_arg2 = cycl_utilities.sentence_arg2( asent, UNPROVIDED );
      final SubLObject lookup_arg2 = my_creation_date_arg2_lookup( asent_arg1 );
      if( asent_arg2.equal( lookup_arg2 ) )
      {
        final SubLObject time = my_creation_time_arg2_lookup( asent_arg1 );
        final SubLObject second = my_creation_second_arg2_lookup( asent_arg1 );
        backward.removal_add_node( make_my_creation_time_hl_support( ConsesLow.list( $const14$myCreationTime, asent_arg1, time ) ), NIL, ( NIL != second ) ? ConsesLow.list( make_my_creation_second_hl_support( ConsesLow
            .list( $const30$myCreationSecond, asent_arg1, second ) ) ) : NIL );
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-bookkeeping.lisp", position = 21910L)
  public static SubLObject removal_my_creation_date_check_neg_cost(final SubLObject asent, SubLObject sense)
  {
    if( sense == UNPROVIDED )
    {
      sense = NIL;
    }
    return removal_my_creation_date_check_cost( asent );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-bookkeeping.lisp", position = 21910L)
  public static SubLObject removal_my_creation_date_check_neg_expand(final SubLObject asent, SubLObject sense)
  {
    if( sense == UNPROVIDED )
    {
      sense = NIL;
    }
    if( NIL != mt_relevance_macros.relevant_mtP( $const1$BookkeepingMt ) )
    {
      final SubLObject asent_arg1 = cycl_utilities.sentence_arg1( asent, UNPROVIDED );
      final SubLObject asent_arg2 = cycl_utilities.sentence_arg2( asent, UNPROVIDED );
      final SubLObject lookup_arg2 = my_creation_date_arg2_lookup( asent_arg1 );
      if( NIL != lookup_arg2 && !asent_arg2.equal( lookup_arg2 ) )
      {
        final SubLObject actual_date = my_creation_time_arg2_lookup( asent_arg1 );
        final SubLObject actual_second = my_creation_second_arg2_lookup( asent_arg1 );
        final SubLObject queried_date = date_utilities.cycl_date_to_universal_date( asent_arg2 );
        final SubLObject queried_second = date_utilities.cycl_date_to_universal_second( asent_arg2 );
        SubLObject supports = NIL;
        if( !actual_second.equal( queried_second ) )
        {
          supports = ConsesLow.cons( make_my_creation_second_hl_support( ConsesLow.list( $const40$not, ConsesLow.list( $const30$myCreationSecond, asent_arg1, queried_second ) ) ), supports );
        }
        if( !actual_date.equal( queried_date ) )
        {
          supports = ConsesLow.cons( make_my_creation_second_hl_support( ConsesLow.list( $const40$not, ConsesLow.list( $const14$myCreationTime, asent_arg1, queried_date ) ) ), supports );
        }
        backward.removal_add_node( supports.first(), NIL, supports.rest() );
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-bookkeeping.lisp", position = 21910L)
  public static SubLObject removal_my_creation_date_unify_arg2_cost(final SubLObject asent, SubLObject sense)
  {
    if( sense == UNPROVIDED )
    {
      sense = NIL;
    }
    if( NIL != mt_relevance_macros.relevant_mtP( $const1$BookkeepingMt ) )
    {
      return $my_creation_date_unify_arg2_default_cost$.getGlobalValue();
    }
    return ZERO_INTEGER;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-bookkeeping.lisp", position = 21910L)
  public static SubLObject removal_my_creation_date_unify_arg2_expand(final SubLObject asent, SubLObject sense)
  {
    if( sense == UNPROVIDED )
    {
      sense = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != mt_relevance_macros.relevant_mtP( $const1$BookkeepingMt ) )
    {
      final SubLObject arg1 = cycl_utilities.sentence_arg1( asent, UNPROVIDED );
      final SubLObject variable = cycl_utilities.sentence_arg2( asent, UNPROVIDED );
      final SubLObject arg2 = my_creation_date_arg2_lookup( arg1 );
      if( NIL != arg2 )
      {
        thread.resetMultipleValues();
        final SubLObject v_bindings = unification_utilities.term_unify( arg2, variable, T, T );
        final SubLObject unify_justification = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if( NIL != v_bindings )
        {
          final SubLObject time = my_creation_time_arg2_lookup( arg1 );
          final SubLObject second = my_creation_second_arg2_lookup( arg1 );
          final SubLObject second_just = ( NIL != second ) ? ConsesLow.list( make_my_creation_second_hl_support( ConsesLow.list( $const30$myCreationSecond, arg1, second ) ) ) : NIL;
          final SubLObject support = make_my_creation_time_hl_support( ConsesLow.list( $const14$myCreationTime, arg1, time ) );
          final SubLObject more_supports = ConsesLow.append( unify_justification, second_just );
          backward.removal_add_node( support, v_bindings, more_supports );
        }
      }
    }
    return NIL;
  }

  public static SubLObject declare_removal_modules_bookkeeping_file()
  {
    SubLFiles.declareFunction( me, "make_bookkeeping_hl_support", "MAKE-BOOKKEEPING-HL-SUPPORT", 1, 0, false );
    SubLFiles.declareFunction( me, "removal_my_creator_check_cost", "REMOVAL-MY-CREATOR-CHECK-COST", 1, 0, false );
    SubLFiles.declareFunction( me, "my_creator_arg2_lookup", "MY-CREATOR-ARG2-LOOKUP", 1, 0, false );
    SubLFiles.declareFunction( me, "make_my_creator_hl_support", "MAKE-MY-CREATOR-HL-SUPPORT", 1, 0, false );
    SubLFiles.declareFunction( me, "removal_my_creator_check_pos_cost", "REMOVAL-MY-CREATOR-CHECK-POS-COST", 1, 1, false );
    SubLFiles.declareFunction( me, "removal_my_creator_check_pos_expand", "REMOVAL-MY-CREATOR-CHECK-POS-EXPAND", 1, 1, false );
    SubLFiles.declareFunction( me, "removal_my_creator_check_neg_cost", "REMOVAL-MY-CREATOR-CHECK-NEG-COST", 1, 1, false );
    SubLFiles.declareFunction( me, "removal_my_creator_check_neg_expand", "REMOVAL-MY-CREATOR-CHECK-NEG-EXPAND", 1, 1, false );
    SubLFiles.declareFunction( me, "removal_my_creator_unify_arg2_cost", "REMOVAL-MY-CREATOR-UNIFY-ARG2-COST", 1, 1, false );
    SubLFiles.declareFunction( me, "removal_my_creator_unify_arg2_expand", "REMOVAL-MY-CREATOR-UNIFY-ARG2-EXPAND", 1, 1, false );
    SubLFiles.declareFunction( me, "removal_my_creator_unify_arg1_cost", "REMOVAL-MY-CREATOR-UNIFY-ARG1-COST", 1, 1, false );
    SubLFiles.declareFunction( me, "removal_my_creator_unify_arg1_expand", "REMOVAL-MY-CREATOR-UNIFY-ARG1-EXPAND", 1, 1, false );
    SubLFiles.declareFunction( me, "removal_my_creation_time_check_cost", "REMOVAL-MY-CREATION-TIME-CHECK-COST", 1, 0, false );
    SubLFiles.declareFunction( me, "my_creation_time_arg2_lookup", "MY-CREATION-TIME-ARG2-LOOKUP", 1, 0, false );
    SubLFiles.declareFunction( me, "make_my_creation_time_hl_support", "MAKE-MY-CREATION-TIME-HL-SUPPORT", 1, 0, false );
    SubLFiles.declareFunction( me, "removal_my_creation_time_check_pos_cost", "REMOVAL-MY-CREATION-TIME-CHECK-POS-COST", 1, 1, false );
    SubLFiles.declareFunction( me, "removal_my_creation_time_check_pos_expand", "REMOVAL-MY-CREATION-TIME-CHECK-POS-EXPAND", 1, 1, false );
    SubLFiles.declareFunction( me, "removal_my_creation_time_check_neg_cost", "REMOVAL-MY-CREATION-TIME-CHECK-NEG-COST", 1, 1, false );
    SubLFiles.declareFunction( me, "removal_my_creation_time_check_neg_expand", "REMOVAL-MY-CREATION-TIME-CHECK-NEG-EXPAND", 1, 1, false );
    SubLFiles.declareFunction( me, "removal_my_creation_time_unify_arg2_cost", "REMOVAL-MY-CREATION-TIME-UNIFY-ARG2-COST", 1, 1, false );
    SubLFiles.declareFunction( me, "removal_my_creation_time_unify_arg2_expand", "REMOVAL-MY-CREATION-TIME-UNIFY-ARG2-EXPAND", 1, 1, false );
    SubLFiles.declareFunction( me, "removal_my_creation_purpose_check_cost", "REMOVAL-MY-CREATION-PURPOSE-CHECK-COST", 1, 0, false );
    SubLFiles.declareFunction( me, "my_creation_purpose_arg2_lookup", "MY-CREATION-PURPOSE-ARG2-LOOKUP", 1, 0, false );
    SubLFiles.declareFunction( me, "make_my_creation_purpose_hl_support", "MAKE-MY-CREATION-PURPOSE-HL-SUPPORT", 1, 0, false );
    SubLFiles.declareFunction( me, "removal_my_creation_purpose_check_pos_cost", "REMOVAL-MY-CREATION-PURPOSE-CHECK-POS-COST", 1, 1, false );
    SubLFiles.declareFunction( me, "removal_my_creation_purpose_check_pos_expand", "REMOVAL-MY-CREATION-PURPOSE-CHECK-POS-EXPAND", 1, 1, false );
    SubLFiles.declareFunction( me, "removal_my_creation_purpose_check_neg_cost", "REMOVAL-MY-CREATION-PURPOSE-CHECK-NEG-COST", 1, 1, false );
    SubLFiles.declareFunction( me, "removal_my_creation_purpose_check_neg_expand", "REMOVAL-MY-CREATION-PURPOSE-CHECK-NEG-EXPAND", 1, 1, false );
    SubLFiles.declareFunction( me, "removal_my_creation_purpose_unify_arg2_cost", "REMOVAL-MY-CREATION-PURPOSE-UNIFY-ARG2-COST", 1, 1, false );
    SubLFiles.declareFunction( me, "removal_my_creation_purpose_unify_arg2_expand", "REMOVAL-MY-CREATION-PURPOSE-UNIFY-ARG2-EXPAND", 1, 1, false );
    SubLFiles.declareFunction( me, "removal_my_creation_purpose_unify_arg1_cost", "REMOVAL-MY-CREATION-PURPOSE-UNIFY-ARG1-COST", 1, 1, false );
    SubLFiles.declareFunction( me, "removal_my_creation_purpose_unify_arg1_expand", "REMOVAL-MY-CREATION-PURPOSE-UNIFY-ARG1-EXPAND", 1, 1, false );
    SubLFiles.declareFunction( me, "removal_my_creation_second_check_cost", "REMOVAL-MY-CREATION-SECOND-CHECK-COST", 1, 0, false );
    SubLFiles.declareFunction( me, "my_creation_second_arg2_lookup", "MY-CREATION-SECOND-ARG2-LOOKUP", 1, 0, false );
    SubLFiles.declareFunction( me, "make_my_creation_second_hl_support", "MAKE-MY-CREATION-SECOND-HL-SUPPORT", 1, 0, false );
    SubLFiles.declareFunction( me, "removal_my_creation_second_check_pos_cost", "REMOVAL-MY-CREATION-SECOND-CHECK-POS-COST", 1, 1, false );
    SubLFiles.declareFunction( me, "removal_my_creation_second_check_pos_expand", "REMOVAL-MY-CREATION-SECOND-CHECK-POS-EXPAND", 1, 1, false );
    SubLFiles.declareFunction( me, "removal_my_creation_second_check_neg_cost", "REMOVAL-MY-CREATION-SECOND-CHECK-NEG-COST", 1, 1, false );
    SubLFiles.declareFunction( me, "removal_my_creation_second_check_neg_expand", "REMOVAL-MY-CREATION-SECOND-CHECK-NEG-EXPAND", 1, 1, false );
    SubLFiles.declareFunction( me, "removal_my_creation_second_unify_arg2_cost", "REMOVAL-MY-CREATION-SECOND-UNIFY-ARG2-COST", 1, 1, false );
    SubLFiles.declareFunction( me, "removal_my_creation_second_unify_arg2_expand", "REMOVAL-MY-CREATION-SECOND-UNIFY-ARG2-EXPAND", 1, 1, false );
    SubLFiles.declareFunction( me, "removal_my_creation_date_check_cost", "REMOVAL-MY-CREATION-DATE-CHECK-COST", 1, 0, false );
    SubLFiles.declareFunction( me, "my_creation_date_arg2_lookup", "MY-CREATION-DATE-ARG2-LOOKUP", 1, 0, false );
    SubLFiles.declareFunction( me, "removal_my_creation_date_check_pos_cost", "REMOVAL-MY-CREATION-DATE-CHECK-POS-COST", 1, 1, false );
    SubLFiles.declareFunction( me, "removal_my_creation_date_check_pos_expand", "REMOVAL-MY-CREATION-DATE-CHECK-POS-EXPAND", 1, 1, false );
    SubLFiles.declareFunction( me, "removal_my_creation_date_check_neg_cost", "REMOVAL-MY-CREATION-DATE-CHECK-NEG-COST", 1, 1, false );
    SubLFiles.declareFunction( me, "removal_my_creation_date_check_neg_expand", "REMOVAL-MY-CREATION-DATE-CHECK-NEG-EXPAND", 1, 1, false );
    SubLFiles.declareFunction( me, "removal_my_creation_date_unify_arg2_cost", "REMOVAL-MY-CREATION-DATE-UNIFY-ARG2-COST", 1, 1, false );
    SubLFiles.declareFunction( me, "removal_my_creation_date_unify_arg2_expand", "REMOVAL-MY-CREATION-DATE-UNIFY-ARG2-EXPAND", 1, 1, false );
    return NIL;
  }

  public static SubLObject init_removal_modules_bookkeeping_file()
  {
    $bookkeeping_check_default_cost$ = SubLFiles.deflexical( "*BOOKKEEPING-CHECK-DEFAULT-COST*", control_vars.$hl_module_check_cost$.getDynamicValue() );
    $my_creator_check_default_cost$ = SubLFiles.deflexical( "*MY-CREATOR-CHECK-DEFAULT-COST*", $bookkeeping_check_default_cost$.getGlobalValue() );
    $my_creator_unify_arg2_default_cost$ = SubLFiles.deflexical( "*MY-CREATOR-UNIFY-ARG2-DEFAULT-COST*", $bookkeeping_check_default_cost$.getGlobalValue() );
    $my_creation_time_check_default_cost$ = SubLFiles.deflexical( "*MY-CREATION-TIME-CHECK-DEFAULT-COST*", $bookkeeping_check_default_cost$.getGlobalValue() );
    $my_creation_time_unify_arg2_default_cost$ = SubLFiles.deflexical( "*MY-CREATION-TIME-UNIFY-ARG2-DEFAULT-COST*", $bookkeeping_check_default_cost$.getGlobalValue() );
    $my_creation_purpose_check_default_cost$ = SubLFiles.deflexical( "*MY-CREATION-PURPOSE-CHECK-DEFAULT-COST*", $bookkeeping_check_default_cost$.getGlobalValue() );
    $my_creation_purpose_unify_arg2_default_cost$ = SubLFiles.deflexical( "*MY-CREATION-PURPOSE-UNIFY-ARG2-DEFAULT-COST*", $bookkeeping_check_default_cost$.getGlobalValue() );
    $my_creation_second_check_default_cost$ = SubLFiles.deflexical( "*MY-CREATION-SECOND-CHECK-DEFAULT-COST*", $bookkeeping_check_default_cost$.getGlobalValue() );
    $my_creation_second_unify_arg2_default_cost$ = SubLFiles.deflexical( "*MY-CREATION-SECOND-UNIFY-ARG2-DEFAULT-COST*", $bookkeeping_check_default_cost$.getGlobalValue() );
    $my_creation_date_check_default_cost$ = SubLFiles.deflexical( "*MY-CREATION-DATE-CHECK-DEFAULT-COST*", $bookkeeping_check_default_cost$.getGlobalValue() );
    $my_creation_date_unify_arg2_default_cost$ = SubLFiles.deflexical( "*MY-CREATION-DATE-UNIFY-ARG2-DEFAULT-COST*", $bookkeeping_check_default_cost$.getGlobalValue() );
    return NIL;
  }

  public static SubLObject setup_removal_modules_bookkeeping_file()
  {
    inference_modules.register_solely_specific_removal_module_predicate( $const3$myCreator );
    preference_modules.doomed_unless_either_arg_bindable( $kw4$POS, $const3$myCreator );
    preference_modules.doomed_unless_all_args_bindable( $kw5$NEG, $const3$myCreator );
    inference_modules.inference_removal_module( $kw6$REMOVAL_MY_CREATOR_CHECK_POS, $list7 );
    inference_modules.inference_removal_module( $kw8$REMOVAL_MY_CREATOR_CHECK_NEG, $list9 );
    inference_modules.inference_removal_module( $kw10$REMOVAL_MY_CREATOR_UNIFY_ARG2, $list11 );
    inference_modules.inference_removal_module( $kw12$REMOVAL_MY_CREATOR_UNIFY_ARG1, $list13 );
    inference_modules.register_solely_specific_removal_module_predicate( $const14$myCreationTime );
    preference_modules.doomed_unless_arg_bindable( $kw4$POS, $const14$myCreationTime, ONE_INTEGER );
    preference_modules.doomed_unless_all_args_bindable( $kw5$NEG, $const14$myCreationTime );
    inference_modules.inference_removal_module( $kw15$REMOVAL_MY_CREATION_TIME_CHECK_POS, $list16 );
    inference_modules.inference_removal_module( $kw17$REMOVAL_MY_CREATION_TIME_CHECK_NEG, $list18 );
    inference_modules.inference_removal_module( $kw19$REMOVAL_MY_CREATION_TIME_UNIFY_ARG2, $list20 );
    inference_modules.register_solely_specific_removal_module_predicate( $const21$myCreationPurpose );
    preference_modules.doomed_unless_either_arg_bindable( $kw4$POS, $const21$myCreationPurpose );
    preference_modules.doomed_unless_all_args_bindable( $kw5$NEG, $const21$myCreationPurpose );
    inference_modules.inference_removal_module( $kw22$REMOVAL_MY_CREATION_PURPOSE_CHECK_POS, $list23 );
    inference_modules.inference_removal_module( $kw24$REMOVAL_MY_CREATION_PURPOSE_CHECK_NEG, $list25 );
    inference_modules.inference_removal_module( $kw26$REMOVAL_MY_CREATION_PURPOSE_UNIFY_ARG2, $list27 );
    inference_modules.inference_removal_module( $kw28$REMOVAL_MY_CREATION_PURPOSE_UNIFY_ARG1, $list29 );
    inference_modules.register_solely_specific_removal_module_predicate( $const30$myCreationSecond );
    preference_modules.doomed_unless_arg_bindable( $kw4$POS, $const30$myCreationSecond, ONE_INTEGER );
    preference_modules.doomed_unless_all_args_bindable( $kw5$NEG, $const30$myCreationSecond );
    inference_modules.inference_removal_module( $kw31$REMOVAL_MY_CREATION_SECOND_CHECK_POS, $list32 );
    inference_modules.inference_removal_module( $kw33$REMOVAL_MY_CREATION_SECOND_CHECK_NEG, $list34 );
    inference_modules.inference_removal_module( $kw35$REMOVAL_MY_CREATION_SECOND_UNIFY_ARG2, $list36 );
    inference_modules.register_solely_specific_removal_module_predicate( $const37$myCreationDate );
    preference_modules.doomed_unless_arg_bindable( $kw4$POS, $const37$myCreationDate, ONE_INTEGER );
    preference_modules.doomed_unless_all_args_bindable( $kw5$NEG, $const37$myCreationDate );
    inference_modules.inference_removal_module( $kw38$REMOVAL_MY_CREATION_DATE_CHECK_POS, $list39 );
    inference_modules.inference_removal_module( $kw41$REMOVAL_MY_CREATION_DATE_CHECK_NEG, $list42 );
    inference_modules.inference_removal_module( $kw43$REMOVAL_MY_CREATION_DATE_UNIFY_ARG2, $list44 );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_removal_modules_bookkeeping_file();
  }

  @Override
  public void initializeVariables()
  {
    init_removal_modules_bookkeeping_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_removal_modules_bookkeeping_file();
  }
  static
  {
    me = new removal_modules_bookkeeping();
    $bookkeeping_check_default_cost$ = null;
    $my_creator_check_default_cost$ = null;
    $my_creator_unify_arg2_default_cost$ = null;
    $my_creation_time_check_default_cost$ = null;
    $my_creation_time_unify_arg2_default_cost$ = null;
    $my_creation_purpose_check_default_cost$ = null;
    $my_creation_purpose_unify_arg2_default_cost$ = null;
    $my_creation_second_check_default_cost$ = null;
    $my_creation_second_unify_arg2_default_cost$ = null;
    $my_creation_date_check_default_cost$ = null;
    $my_creation_date_unify_arg2_default_cost$ = null;
    $kw0$BOOKKEEPING = makeKeyword( "BOOKKEEPING" );
    $const1$BookkeepingMt = constant_handles.reader_make_constant_shell( makeString( "BookkeepingMt" ) );
    $kw2$TRUE_MON = makeKeyword( "TRUE-MON" );
    $const3$myCreator = constant_handles.reader_make_constant_shell( makeString( "myCreator" ) );
    $kw4$POS = makeKeyword( "POS" );
    $kw5$NEG = makeKeyword( "NEG" );
    $kw6$REMOVAL_MY_CREATOR_CHECK_POS = makeKeyword( "REMOVAL-MY-CREATOR-CHECK-POS" );
    $list7 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "myCreator" ) ), makeKeyword(
        "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "myCreator" ) ), makeKeyword( "FORT" ), makeKeyword( "FORT" ) ), makeKeyword( "COST" ), makeSymbol(
            "REMOVAL-MY-CREATOR-CHECK-POS-COST" ), makeKeyword( "COMPLETENESS" ), makeKeyword( "COMPLETE" ), makeKeyword( "EXPAND" ), makeSymbol( "REMOVAL-MY-CREATOR-CHECK-POS-EXPAND" ), makeKeyword( "DOCUMENTATION" ),
      makeString( "(#$myCreator <fort-p> <fort-p>)" ), makeKeyword( "EXAMPLE" ), makeString( "(#$myCreator #$Dog #$Guzman)" )
    } );
    $kw8$REMOVAL_MY_CREATOR_CHECK_NEG = makeKeyword( "REMOVAL-MY-CREATOR-CHECK-NEG" );
    $list9 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "NEG" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "myCreator" ) ), makeKeyword(
        "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "myCreator" ) ), makeKeyword( "FORT" ), makeKeyword( "FORT" ) ), makeKeyword( "COST" ), makeSymbol(
            "REMOVAL-MY-CREATOR-CHECK-NEG-COST" ), makeKeyword( "COMPLETENESS" ), makeKeyword( "COMPLETE" ), makeKeyword( "EXPAND" ), makeSymbol( "REMOVAL-MY-CREATOR-CHECK-NEG-EXPAND" ), makeKeyword( "DOCUMENTATION" ),
      makeString( "(#$not (#$myCreator <fort-p> <fort-p>))" ), makeKeyword( "EXAMPLE" ), makeString( "(#$not (#$myCreator #$Dog #$Muffet))" )
    } );
    $kw10$REMOVAL_MY_CREATOR_UNIFY_ARG2 = makeKeyword( "REMOVAL-MY-CREATOR-UNIFY-ARG2" );
    $list11 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "myCreator" ) ), makeKeyword(
        "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "myCreator" ) ), makeKeyword( "FORT" ), makeKeyword( "NOT-FULLY-BOUND" ) ), makeKeyword( "COST" ), makeSymbol(
            "REMOVAL-MY-CREATOR-UNIFY-ARG2-COST" ), makeKeyword( "COMPLETENESS" ), makeKeyword( "COMPLETE" ), makeKeyword( "EXPAND" ), makeSymbol( "REMOVAL-MY-CREATOR-UNIFY-ARG2-EXPAND" ), makeKeyword( "DOCUMENTATION" ),
      makeString( "(#$myCreator <fort-p> <not-fully-bound-p>)" ), makeKeyword( "EXAMPLE" ), makeString( "(#$myCreator #$Dog ?WHO)" )
    } );
    $kw12$REMOVAL_MY_CREATOR_UNIFY_ARG1 = makeKeyword( "REMOVAL-MY-CREATOR-UNIFY-ARG1" );
    $list13 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "myCreator" ) ), makeKeyword(
        "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "myCreator" ) ), makeKeyword( "NOT-FULLY-BOUND" ), makeKeyword( "FORT" ) ), makeKeyword( "COST" ), makeSymbol(
            "REMOVAL-MY-CREATOR-UNIFY-ARG1-COST" ), makeKeyword( "COMPLETENESS" ), makeKeyword( "COMPLETE" ), makeKeyword( "EXPAND" ), makeSymbol( "REMOVAL-MY-CREATOR-UNIFY-ARG1-EXPAND" ), makeKeyword( "DOCUMENTATION" ),
      makeString( "(#$myCreator <not-fully-bound-p> <fort>)" ), makeKeyword( "EXAMPLE" ), makeString( "(#$myCreator ?WHAT #$Guzman)" )
    } );
    $const14$myCreationTime = constant_handles.reader_make_constant_shell( makeString( "myCreationTime" ) );
    $kw15$REMOVAL_MY_CREATION_TIME_CHECK_POS = makeKeyword( "REMOVAL-MY-CREATION-TIME-CHECK-POS" );
    $list16 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "myCreationTime" ) ), makeKeyword(
        "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "myCreationTime" ) ), makeKeyword( "FORT" ), ConsesLow.list( makeKeyword( "TEST" ), makeSymbol(
            "UNIVERSAL-DATE-P" ) ) ), makeKeyword( "COST" ), makeSymbol( "REMOVAL-MY-CREATION-TIME-CHECK-POS-COST" ), makeKeyword( "COMPLETENESS" ), makeKeyword( "COMPLETE" ), makeKeyword( "EXPAND" ), makeSymbol(
                "REMOVAL-MY-CREATION-TIME-CHECK-POS-EXPAND" ), makeKeyword( "DOCUMENTATION" ), makeString( "(#$myCreationTime <fort-p> <universal-date-p>)" ), makeKeyword( "EXAMPLE" ), makeString(
                    "(#$myCreationTime #$Dog 19871011)" )
    } );
    $kw17$REMOVAL_MY_CREATION_TIME_CHECK_NEG = makeKeyword( "REMOVAL-MY-CREATION-TIME-CHECK-NEG" );
    $list18 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "NEG" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "myCreationTime" ) ), makeKeyword(
        "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "myCreationTime" ) ), makeKeyword( "FORT" ), ConsesLow.list( makeKeyword( "TEST" ), makeSymbol(
            "UNIVERSAL-DATE-P" ) ) ), makeKeyword( "COST" ), makeSymbol( "REMOVAL-MY-CREATION-TIME-CHECK-NEG-COST" ), makeKeyword( "COMPLETENESS" ), makeKeyword( "COMPLETE" ), makeKeyword( "EXPAND" ), makeSymbol(
                "REMOVAL-MY-CREATION-TIME-CHECK-NEG-EXPAND" ), makeKeyword( "DOCUMENTATION" ), makeString( "(#$not (#$myCreationTime <fort-p> <universal-date-p>))" ), makeKeyword( "EXAMPLE" ), makeString(
                    "(#$not (#$myCreationTime #$Dog 19770717))" )
    } );
    $kw19$REMOVAL_MY_CREATION_TIME_UNIFY_ARG2 = makeKeyword( "REMOVAL-MY-CREATION-TIME-UNIFY-ARG2" );
    $list20 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "myCreationTime" ) ), makeKeyword(
        "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "myCreationTime" ) ), makeKeyword( "FORT" ), makeKeyword( "VARIABLE" ) ), makeKeyword( "COST" ), makeSymbol(
            "REMOVAL-MY-CREATION-TIME-UNIFY-ARG2-COST" ), makeKeyword( "COMPLETENESS" ), makeKeyword( "COMPLETE" ), makeKeyword( "EXPAND" ), makeSymbol( "REMOVAL-MY-CREATION-TIME-UNIFY-ARG2-EXPAND" ), makeKeyword(
                "DOCUMENTATION" ), makeString( "(#$myCreationTime <fort-p> <variable-p>)" ), makeKeyword( "EXAMPLE" ), makeString( "(#$myCreationTime #$Dog ?WHEN)" )
    } );
    $const21$myCreationPurpose = constant_handles.reader_make_constant_shell( makeString( "myCreationPurpose" ) );
    $kw22$REMOVAL_MY_CREATION_PURPOSE_CHECK_POS = makeKeyword( "REMOVAL-MY-CREATION-PURPOSE-CHECK-POS" );
    $list23 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "myCreationPurpose" ) ), makeKeyword(
        "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "myCreationPurpose" ) ), makeKeyword( "FORT" ), makeKeyword( "FORT" ) ), makeKeyword( "COST" ), makeSymbol(
            "REMOVAL-MY-CREATION-PURPOSE-CHECK-POS-COST" ), makeKeyword( "COMPLETENESS" ), makeKeyword( "COMPLETE" ), makeKeyword( "EXPAND" ), makeSymbol( "REMOVAL-MY-CREATION-PURPOSE-CHECK-POS-EXPAND" ), makeKeyword(
                "DOCUMENTATION" ), makeString( "(#$myCreationPurpose <fort-p> <fort-p>)" ), makeKeyword( "EXAMPLE" ), makeString( "(#$myCreationPurpose #$Shrew #$GeneralCycKE)" )
    } );
    $kw24$REMOVAL_MY_CREATION_PURPOSE_CHECK_NEG = makeKeyword( "REMOVAL-MY-CREATION-PURPOSE-CHECK-NEG" );
    $list25 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "NEG" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "myCreationPurpose" ) ), makeKeyword(
        "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "myCreationPurpose" ) ), makeKeyword( "FORT" ), makeKeyword( "FORT" ) ), makeKeyword( "COST" ), makeSymbol(
            "REMOVAL-MY-CREATION-PURPOSE-CHECK-NEG-COST" ), makeKeyword( "COMPLETENESS" ), makeKeyword( "COMPLETE" ), makeKeyword( "EXPAND" ), makeSymbol( "REMOVAL-MY-CREATION-PURPOSE-CHECK-NEG-EXPAND" ), makeKeyword(
                "DOCUMENTATION" ), makeString( "(#$not (#$myCreationPurpose <fort-p> <fort-p>))" ), makeKeyword( "EXAMPLE" ), makeString( "(#$not (#$myCreationPurpose #$BritneySpears #$GeneralCycKE))" )
    } );
    $kw26$REMOVAL_MY_CREATION_PURPOSE_UNIFY_ARG2 = makeKeyword( "REMOVAL-MY-CREATION-PURPOSE-UNIFY-ARG2" );
    $list27 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "myCreationPurpose" ) ), makeKeyword(
        "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "myCreationPurpose" ) ), makeKeyword( "FORT" ), makeKeyword( "NOT-FULLY-BOUND" ) ), makeKeyword( "COST" ),
      makeSymbol( "REMOVAL-MY-CREATION-PURPOSE-UNIFY-ARG2-COST" ), makeKeyword( "COMPLETENESS" ), makeKeyword( "COMPLETE" ), makeKeyword( "EXPAND" ), makeSymbol( "REMOVAL-MY-CREATION-PURPOSE-UNIFY-ARG2-EXPAND" ),
      makeKeyword( "DOCUMENTATION" ), makeString( "(#$myCreationPurpose <fort-p> <not-fully-bound-p>)" ), makeKeyword( "EXAMPLE" ), makeString( "(#$myCreationPurpose #$Shrew ?WHY)" )
    } );
    $kw28$REMOVAL_MY_CREATION_PURPOSE_UNIFY_ARG1 = makeKeyword( "REMOVAL-MY-CREATION-PURPOSE-UNIFY-ARG1" );
    $list29 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "myCreationPurpose" ) ), makeKeyword(
        "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "myCreationPurpose" ) ), makeKeyword( "NOT-FULLY-BOUND" ), makeKeyword( "FORT" ) ), makeKeyword( "COST" ),
      makeSymbol( "REMOVAL-MY-CREATION-PURPOSE-UNIFY-ARG1-COST" ), makeKeyword( "COMPLETENESS" ), makeKeyword( "COMPLETE" ), makeKeyword( "EXPAND" ), makeSymbol( "REMOVAL-MY-CREATION-PURPOSE-UNIFY-ARG1-EXPAND" ),
      makeKeyword( "DOCUMENTATION" ), makeString( "(#$myCreationPurpose <not-fully-bound-p> <fort>)" ), makeKeyword( "EXAMPLE" ), makeString( "(#$myCreationPurpose ?WHAT #$GeneralCycKE)" )
    } );
    $const30$myCreationSecond = constant_handles.reader_make_constant_shell( makeString( "myCreationSecond" ) );
    $kw31$REMOVAL_MY_CREATION_SECOND_CHECK_POS = makeKeyword( "REMOVAL-MY-CREATION-SECOND-CHECK-POS" );
    $list32 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "myCreationSecond" ) ), makeKeyword(
        "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "myCreationSecond" ) ), makeKeyword( "FORT" ), ConsesLow.list( makeKeyword( "TEST" ), makeSymbol(
            "UNIVERSAL-SECOND-P" ) ) ), makeKeyword( "COST" ), makeSymbol( "REMOVAL-MY-CREATION-SECOND-CHECK-POS-COST" ), makeKeyword( "COMPLETENESS" ), makeKeyword( "COMPLETE" ), makeKeyword( "EXPAND" ), makeSymbol(
                "REMOVAL-MY-CREATION-SECOND-CHECK-POS-EXPAND" ), makeKeyword( "DOCUMENTATION" ), makeString( "(#$myCreationSecond <fort-p> <universal-second-p>)" ), makeKeyword( "EXAMPLE" ), makeString(
                    "(#$myCreationSecond #$MauveColor 162525)" )
    } );
    $kw33$REMOVAL_MY_CREATION_SECOND_CHECK_NEG = makeKeyword( "REMOVAL-MY-CREATION-SECOND-CHECK-NEG" );
    $list34 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "NEG" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "myCreationSecond" ) ), makeKeyword(
        "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "myCreationSecond" ) ), makeKeyword( "FORT" ), ConsesLow.list( makeKeyword( "TEST" ), makeSymbol(
            "UNIVERSAL-SECOND-P" ) ) ), makeKeyword( "COST" ), makeSymbol( "REMOVAL-MY-CREATION-SECOND-CHECK-NEG-COST" ), makeKeyword( "COMPLETENESS" ), makeKeyword( "COMPLETE" ), makeKeyword( "EXPAND" ), makeSymbol(
                "REMOVAL-MY-CREATION-SECOND-CHECK-NEG-EXPAND" ), makeKeyword( "DOCUMENTATION" ), makeString( "(#$not (#$myCreationSecond <fort-p> <universal-second-p>))" ), makeKeyword( "EXAMPLE" ), makeString(
                    "(#$not (#$myCreationSecond #$MauveColor 212))" )
    } );
    $kw35$REMOVAL_MY_CREATION_SECOND_UNIFY_ARG2 = makeKeyword( "REMOVAL-MY-CREATION-SECOND-UNIFY-ARG2" );
    $list36 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "myCreationSecond" ) ), makeKeyword(
        "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "myCreationSecond" ) ), makeKeyword( "FORT" ), makeKeyword( "VARIABLE" ) ), makeKeyword( "COST" ), makeSymbol(
            "REMOVAL-MY-CREATION-SECOND-UNIFY-ARG2-COST" ), makeKeyword( "COMPLETENESS" ), makeKeyword( "COMPLETE" ), makeKeyword( "EXPAND" ), makeSymbol( "REMOVAL-MY-CREATION-SECOND-UNIFY-ARG2-EXPAND" ), makeKeyword(
                "DOCUMENTATION" ), makeString( "(#$myCreationSecond <fort-p> <variable-p>)" ), makeKeyword( "EXAMPLE" ), makeString( "(#$myCreationSecond #$MauveColor ?WHEN)" )
    } );
    $const37$myCreationDate = constant_handles.reader_make_constant_shell( makeString( "myCreationDate" ) );
    $kw38$REMOVAL_MY_CREATION_DATE_CHECK_POS = makeKeyword( "REMOVAL-MY-CREATION-DATE-CHECK-POS" );
    $list39 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "myCreationDate" ) ), makeKeyword(
        "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "myCreationDate" ) ), makeKeyword( "FORT" ), ConsesLow.list( makeKeyword( "TEST" ), makeSymbol( "DATE-P" ) ) ),
      makeKeyword( "COST" ), makeSymbol( "REMOVAL-MY-CREATION-DATE-CHECK-POS-COST" ), makeKeyword( "COMPLETENESS" ), makeKeyword( "COMPLETE" ), makeKeyword( "EXPAND" ), makeSymbol(
          "REMOVAL-MY-CREATION-DATE-CHECK-POS-EXPAND" ), makeKeyword( "DOCUMENTATION" ), makeString( "(#$myCreationDate <fort-p> <date-p>)" ), makeKeyword( "EXAMPLE" ), makeString(
              "(#$myCreationDate #$Martini (#$SecondFn 51 (#$MinuteFn 29 (#$HourFn 18 (#$DayFn 29 (#$MonthFn #$June (#$YearFn 2001)))))))" )
    } );
    $const40$not = constant_handles.reader_make_constant_shell( makeString( "not" ) );
    $kw41$REMOVAL_MY_CREATION_DATE_CHECK_NEG = makeKeyword( "REMOVAL-MY-CREATION-DATE-CHECK-NEG" );
    $list42 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "NEG" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "myCreationDate" ) ), makeKeyword(
        "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "myCreationDate" ) ), makeKeyword( "FORT" ), ConsesLow.list( makeKeyword( "TEST" ), makeSymbol( "DATE-P" ) ) ),
      makeKeyword( "COST" ), makeSymbol( "REMOVAL-MY-CREATION-DATE-CHECK-NEG-COST" ), makeKeyword( "COMPLETENESS" ), makeKeyword( "COMPLETE" ), makeKeyword( "EXPAND" ), makeSymbol(
          "REMOVAL-MY-CREATION-DATE-CHECK-NEG-EXPAND" ), makeKeyword( "DOCUMENTATION" ), makeString( "(#$not (#$myCreationDate <fort-p> <date-p>))" ), makeKeyword( "EXAMPLE" ), makeString(
              "(#$not (#$myCreationDate #$Dog (#$SecondFn 51 (#$MinuteFn 29 (#$HourFn 18 (#$DayFn 29 (#$MonthFn #$June (#$YearFn 2001))))))))" )
    } );
    $kw43$REMOVAL_MY_CREATION_DATE_UNIFY_ARG2 = makeKeyword( "REMOVAL-MY-CREATION-DATE-UNIFY-ARG2" );
    $list44 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "myCreationDate" ) ), makeKeyword(
        "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "myCreationDate" ) ), makeKeyword( "FORT" ), makeKeyword( "NOT-FULLY-BOUND" ) ), makeKeyword( "COST" ), makeSymbol(
            "REMOVAL-MY-CREATION-DATE-UNIFY-ARG2-COST" ), makeKeyword( "COMPLETENESS" ), makeKeyword( "COMPLETE" ), makeKeyword( "EXPAND" ), makeSymbol( "REMOVAL-MY-CREATION-DATE-UNIFY-ARG2-EXPAND" ), makeKeyword(
                "DOCUMENTATION" ), makeString( "(#$myCreationDate <fort-p> <not-fully-bound>)" ), makeKeyword( "EXAMPLE" ), makeString( "(#$myCreationDate #$Martini ?WHEN)" )
    } );
  }
}
/*
 * 
 * Total time: 162 ms
 * 
 */