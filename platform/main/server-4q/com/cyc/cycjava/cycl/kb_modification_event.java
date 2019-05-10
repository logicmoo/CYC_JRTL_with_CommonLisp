package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class kb_modification_event
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.kb_modification_event";
  public static final String myFingerPrint = "948e5ddae18968e72df2ba14572bb5ffdf994d2589d085f167470013d748472b";
  @SubLTranslatedFile.SubL(source = "cycl/kb-modification-event.lisp", position = 26003L)
  private static SubLSymbol $kb_modifications_event_dispatcher_lock$;
  @SubLTranslatedFile.SubL(source = "cycl/kb-modification-event.lisp", position = 26003L)
  private static SubLSymbol $kb_modifications_event_dispatcher_listeners$;
  private static final SubLSymbol $kw0$KB_MODIFICATION_EVENT;
  private static final SubLSymbol $kw1$KB_STORE_EVENT;
  private static final SubLSymbol $kw2$KB_MODIFY_CREATE_CONSTANT;
  private static final SubLList $list3;
  private static final SubLSymbol $kw4$KB_MODIFY_REMOVE_CONSTANT;
  private static final SubLList $list5;
  private static final SubLSymbol $kw6$KB_MODIFY_RENAME_CONSTANT;
  private static final SubLList $list7;
  private static final SubLSymbol $kw8$KB_MODIFY_CREATE_NART;
  private static final SubLList $list9;
  private static final SubLSymbol $kw10$KB_MODIFY_REMOVE_NART;
  private static final SubLList $list11;
  private static final SubLSymbol $kw12$KB_MODIFY_CREATE_ASSERTION;
  private static final SubLList $list13;
  private static final SubLSymbol $kw14$KB_MODIFY_REMOVE_ASSERTION;
  private static final SubLList $list15;
  private static final SubLSymbol $kw16$KB_MODIFY_SET_ASSERTION_DIRECTION;
  private static final SubLList $list17;
  private static final SubLSymbol $kw18$KB_MODIFY_SET_ASSERTION_STRENGTH;
  private static final SubLSymbol $kw19$KB_MODIFY_SET_ASSERTION_TRUTH;
  private static final SubLSymbol $kw20$KB_MODIFY_SET_ASSERTION_VARIABLE_NAMES;
  private static final SubLList $list21;
  private static final SubLSymbol $kw22$KB_MODIFY_SET_ASSERTION_ASSERTED_BY;
  private static final SubLSymbol $kw23$KB_MODIFY_SET_ASSERTION_ASSERTED_WHY;
  private static final SubLSymbol $kw24$KB_MODIFY_SET_ASSERTION_ASSERTED_WHEN;
  private static final SubLSymbol $kw25$KB_MODIFY_SET_ASSERTION_ASSERTED_SECOND;
  private static final SubLSymbol $kw26$KB_MODIFY_CREATE_ASSERTED_ARGUMENT;
  private static final SubLList $list27;
  private static final SubLSymbol $kw28$KB_MODIFY_REMOVE_ASSERTED_ARGUMENT;
  private static final SubLList $list29;
  private static final SubLSymbol $kw30$KB_MODIFY_CREATE_NEW_DEDUCTION;
  private static final SubLList $list31;
  private static final SubLSymbol $kw32$KB_MODIFY_REMOVE_DEDUCTION;
  private static final SubLList $list33;
  private static final SubLSymbol $kw34$KB_MODIFY_SET_DEDUCTION_STRENGTH;
  private static final SubLList $list35;
  private static final SubLSymbol $kw36$KB_MODIFY_CREATE_NEW_KB_HL_SUPPORT;
  private static final SubLList $list37;
  private static final SubLSymbol $kw38$KB_MODIFY_REMOVE_KB_HL_SUPPORT;
  private static final SubLList $list39;
  private static final SubLSymbol $kw40$KB_MODIFY_IRRELEVANCE;
  private static final SubLList $list41;
  private static final SubLSymbol $kw42$NAME;
  private static final SubLSymbol $kw43$EXTERNAL_ID;
  private static final SubLSymbol $sym44$EVENT_P;
  private static final SubLString $str45$Event__S_is_of_type__S__not__S_;
  private static final SubLSymbol $kw46$CONSTANT;
  private static final SubLSymbol $kw47$OLD_CONSTANT_NAME;
  private static final SubLSymbol $kw48$NEW_CONSTANT_NAME;
  private static final SubLSymbol $kw49$NART_HL_FORMULA;
  private static final SubLSymbol $kw50$CNF;
  private static final SubLSymbol $kw51$MT;
  private static final SubLObject $const52$termOfUnit;
  private static final SubLSymbol $kw53$TRUE;
  private static final SubLSymbol $kw54$SENTENCE;
  private static final SubLSymbol $kw55$GAF;
  private static final SubLSymbol $kw56$ASSERTION;
  private static final SubLSymbol $kw57$OLD_DIRECTION;
  private static final SubLSymbol $kw58$NEW_DIRECTION;
  private static final SubLSymbol $kw59$OLD_TRUTH;
  private static final SubLSymbol $kw60$NEW_TRUTH;
  private static final SubLSymbol $kw61$OLD_STRENGTH;
  private static final SubLSymbol $kw62$NEW_STRENGTH;
  private static final SubLSymbol $kw63$OLD_VAR_NAMES;
  private static final SubLSymbol $kw64$NEW_VAR_NAMES;
  private static final SubLSymbol $kw65$OLD_ASSERTED_BY;
  private static final SubLSymbol $kw66$NEW_ASSERTED_BY;
  private static final SubLSymbol $kw67$OLD_ASSERTED_WHEN;
  private static final SubLSymbol $kw68$NEW_ASSERTED_WHEN;
  private static final SubLSymbol $kw69$OLD_ASSERTED_WHY;
  private static final SubLSymbol $kw70$NEW_ASSERTED_WHY;
  private static final SubLSymbol $kw71$OLD_ASSERTED_SECOND;
  private static final SubLSymbol $kw72$NEW_ASSERTED_SECOND;
  private static final SubLSymbol $kw73$TRUTH;
  private static final SubLSymbol $kw74$STRENGTH;
  private static final SubLSymbol $kw75$ASSERTED_ARGUMENT;
  private static final SubLSymbol $kw76$SUPPORTS;
  private static final SubLSymbol $kw77$BINDINGS;
  private static final SubLSymbol $kw78$PRAGMATIC_SUPPORT_MTS;
  private static final SubLSymbol $kw79$DEDUCTION;
  private static final SubLSymbol $kw80$HL_SUPPORT;
  private static final SubLSymbol $kw81$JUSTIFICATION;
  private static final SubLSymbol $kw82$KB_HL_SUPPORT;
  private static final SubLSymbol $kw83$TERM;
  private static final SubLString $str84$KB_MODIFICATIONS_EVENT_DISPATCHER;
  private static final SubLSymbol $sym85$_KB_MODIFICATIONS_EVENT_DISPATCHER_LISTENERS_;
  private static final SubLString $str86$KB_Modification_Event;
  private static final SubLString $str87$KB_Modification_Event_Test_Suite;

  @SubLTranslatedFile.SubL(source = "cycl/kb-modification-event.lisp", position = 10577L)
  public static SubLObject post_kb_modify_create_constant_event(final SubLObject name, final SubLObject external_id)
  {
    if( NIL != anyone_interested_in_kb_modification_eventP( $kw2$KB_MODIFY_CREATE_CONSTANT ) )
    {
      return post_new_kb_modify_event( $kw2$KB_MODIFY_CREATE_CONSTANT, ConsesLow.list( $kw42$NAME, kb_modification_event_support.get_stable_description( name ), $kw43$EXTERNAL_ID, kb_modification_event_support
          .get_stable_description( external_id ) ) );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-modification-event.lisp", position = 11083L)
  public static SubLObject kb_modify_create_constant_retrieve_external_id(final SubLObject event)
  {
    assert NIL != event_model.event_p( event ) : event;
    if( event_model.event_class( event ) != $kw2$KB_MODIFY_CREATE_CONSTANT && NIL == event_utilities.event_is_handler_registration_eventP( event ) )
    {
      Errors.error( $str45$Event__S_is_of_type__S__not__S_, event, event_model.event_class( event ), $kw2$KB_MODIFY_CREATE_CONSTANT );
    }
    return conses_high.getf( event_model.event_message( event ), $kw43$EXTERNAL_ID, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-modification-event.lisp", position = 11083L)
  public static SubLObject kb_modify_create_constant_retrieve_name(final SubLObject event)
  {
    assert NIL != event_model.event_p( event ) : event;
    if( event_model.event_class( event ) != $kw2$KB_MODIFY_CREATE_CONSTANT && NIL == event_utilities.event_is_handler_registration_eventP( event ) )
    {
      Errors.error( $str45$Event__S_is_of_type__S__not__S_, event, event_model.event_class( event ), $kw2$KB_MODIFY_CREATE_CONSTANT );
    }
    return conses_high.getf( event_model.event_message( event ), $kw42$NAME, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-modification-event.lisp", position = 11204L)
  public static SubLObject post_kb_modify_rename_constant_event(final SubLObject constant, final SubLObject old_name, final SubLObject new_name)
  {
    if( NIL != anyone_interested_in_kb_modification_eventP( $kw6$KB_MODIFY_RENAME_CONSTANT ) )
    {
      return post_new_kb_modify_event( $kw6$KB_MODIFY_RENAME_CONSTANT, ConsesLow.list( $kw46$CONSTANT, kb_modification_event_support.get_stable_description( constant ), $kw47$OLD_CONSTANT_NAME,
          kb_modification_event_support.get_stable_description( old_name ), $kw48$NEW_CONSTANT_NAME, kb_modification_event_support.get_stable_description( new_name ) ) );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-modification-event.lisp", position = 11687L)
  public static SubLObject kb_modify_rename_constant_retrieve_new_constant_name(final SubLObject event)
  {
    assert NIL != event_model.event_p( event ) : event;
    if( event_model.event_class( event ) != $kw6$KB_MODIFY_RENAME_CONSTANT && NIL == event_utilities.event_is_handler_registration_eventP( event ) )
    {
      Errors.error( $str45$Event__S_is_of_type__S__not__S_, event, event_model.event_class( event ), $kw6$KB_MODIFY_RENAME_CONSTANT );
    }
    return conses_high.getf( event_model.event_message( event ), $kw48$NEW_CONSTANT_NAME, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-modification-event.lisp", position = 11687L)
  public static SubLObject kb_modify_rename_constant_retrieve_old_constant_name(final SubLObject event)
  {
    assert NIL != event_model.event_p( event ) : event;
    if( event_model.event_class( event ) != $kw6$KB_MODIFY_RENAME_CONSTANT && NIL == event_utilities.event_is_handler_registration_eventP( event ) )
    {
      Errors.error( $str45$Event__S_is_of_type__S__not__S_, event, event_model.event_class( event ), $kw6$KB_MODIFY_RENAME_CONSTANT );
    }
    return conses_high.getf( event_model.event_message( event ), $kw47$OLD_CONSTANT_NAME, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-modification-event.lisp", position = 11687L)
  public static SubLObject kb_modify_rename_constant_retrieve_constant(final SubLObject event)
  {
    assert NIL != event_model.event_p( event ) : event;
    if( event_model.event_class( event ) != $kw6$KB_MODIFY_RENAME_CONSTANT && NIL == event_utilities.event_is_handler_registration_eventP( event ) )
    {
      Errors.error( $str45$Event__S_is_of_type__S__not__S_, event, event_model.event_class( event ), $kw6$KB_MODIFY_RENAME_CONSTANT );
    }
    return conses_high.getf( event_model.event_message( event ), $kw46$CONSTANT, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-modification-event.lisp", position = 11836L)
  public static SubLObject post_kb_modify_remove_constant_event(final SubLObject constant)
  {
    if( NIL != anyone_interested_in_kb_modification_eventP( $kw4$KB_MODIFY_REMOVE_CONSTANT ) )
    {
      return post_new_kb_modify_event( $kw4$KB_MODIFY_REMOVE_CONSTANT, ConsesLow.list( $kw46$CONSTANT, kb_modification_event_support.get_stable_description( constant ), $kw43$EXTERNAL_ID, kb_modification_event_support
          .get_stable_description( constants_high.constant_external_id( constant ) ) ) );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-modification-event.lisp", position = 12271L)
  public static SubLObject kb_modify_remove_constant_retrieve_constant(final SubLObject event)
  {
    assert NIL != event_model.event_p( event ) : event;
    if( event_model.event_class( event ) != $kw4$KB_MODIFY_REMOVE_CONSTANT && NIL == event_utilities.event_is_handler_registration_eventP( event ) )
    {
      Errors.error( $str45$Event__S_is_of_type__S__not__S_, event, event_model.event_class( event ), $kw4$KB_MODIFY_REMOVE_CONSTANT );
    }
    return conses_high.getf( event_model.event_message( event ), $kw46$CONSTANT, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-modification-event.lisp", position = 12271L)
  public static SubLObject kb_modify_remove_constant_retrieve_external_id(final SubLObject event)
  {
    assert NIL != event_model.event_p( event ) : event;
    if( event_model.event_class( event ) != $kw4$KB_MODIFY_REMOVE_CONSTANT && NIL == event_utilities.event_is_handler_registration_eventP( event ) )
    {
      Errors.error( $str45$Event__S_is_of_type__S__not__S_, event, event_model.event_class( event ), $kw4$KB_MODIFY_REMOVE_CONSTANT );
    }
    return conses_high.getf( event_model.event_message( event ), $kw43$EXTERNAL_ID, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-modification-event.lisp", position = 12395L)
  public static SubLObject post_kb_modify_create_nart_event(final SubLObject nart_hl_formula)
  {
    if( NIL != anyone_interested_in_kb_modification_eventP( $kw8$KB_MODIFY_CREATE_NART ) )
    {
      return post_new_kb_modify_event( $kw8$KB_MODIFY_CREATE_NART, ConsesLow.list( $kw49$NART_HL_FORMULA, kb_modification_event_support.get_stable_description( nart_hl_formula ) ) );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-modification-event.lisp", position = 12725L)
  public static SubLObject kb_modify_create_nart_retrieve_nart_hl_formula(final SubLObject event)
  {
    assert NIL != event_model.event_p( event ) : event;
    if( event_model.event_class( event ) != $kw8$KB_MODIFY_CREATE_NART && NIL == event_utilities.event_is_handler_registration_eventP( event ) )
    {
      Errors.error( $str45$Event__S_is_of_type__S__not__S_, event, event_model.event_class( event ), $kw8$KB_MODIFY_CREATE_NART );
    }
    return conses_high.getf( event_model.event_message( event ), $kw49$NART_HL_FORMULA, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-modification-event.lisp", position = 12839L)
  public static SubLObject post_kb_modify_remove_nart_event(final SubLObject nart)
  {
    if( NIL != anyone_interested_in_kb_modification_eventP( $kw10$KB_MODIFY_REMOVE_NART ) )
    {
      return post_new_kb_modify_event( $kw10$KB_MODIFY_REMOVE_NART, ConsesLow.list( $kw49$NART_HL_FORMULA, kb_modification_event_support.get_stable_description( narts_high.nart_hl_formula( nart ) ) ) );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-modification-event.lisp", position = 13193L)
  public static SubLObject kb_modify_remove_nart_retrieve_nart_hl_formula(final SubLObject event)
  {
    assert NIL != event_model.event_p( event ) : event;
    if( event_model.event_class( event ) != $kw10$KB_MODIFY_REMOVE_NART && NIL == event_utilities.event_is_handler_registration_eventP( event ) )
    {
      Errors.error( $str45$Event__S_is_of_type__S__not__S_, event, event_model.event_class( event ), $kw10$KB_MODIFY_REMOVE_NART );
    }
    return conses_high.getf( event_model.event_message( event ), $kw49$NART_HL_FORMULA, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-modification-event.lisp", position = 13307L)
  public static SubLObject post_kb_modify_create_assertion_event(final SubLObject cnf, final SubLObject mt)
  {
    if( NIL != anyone_interested_in_kb_modification_eventP( $kw12$KB_MODIFY_CREATE_ASSERTION ) && NIL == about_to_post_strictly_implementation_assertionP( cnf ) )
    {
      return post_new_kb_modify_event( $kw12$KB_MODIFY_CREATE_ASSERTION, ConsesLow.list( $kw50$CNF, kb_modification_event_support.get_stable_description( cnf ), $kw51$MT, kb_modification_event_support
          .get_stable_description( mt ) ) );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-modification-event.lisp", position = 13810L)
  public static SubLObject about_to_post_strictly_implementation_assertionP(final SubLObject cnf)
  {
    return about_to_post_term_of_unit_assertionP( cnf );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-modification-event.lisp", position = 13942L)
  public static SubLObject about_to_post_term_of_unit_assertionP(final SubLObject cnf)
  {
    if( NIL != clause_utilities.pos_atomic_cnf_p( cnf ) )
    {
      final SubLObject pos_lit = clauses.pos_lits( cnf ).first();
      final SubLObject predicate = cycl_utilities.formula_arg0( pos_lit );
      return Equality.eql( predicate, $const52$termOfUnit );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-modification-event.lisp", position = 14182L)
  public static SubLObject kb_modify_create_assertion_retrieve_mt(final SubLObject event)
  {
    assert NIL != event_model.event_p( event ) : event;
    if( event_model.event_class( event ) != $kw12$KB_MODIFY_CREATE_ASSERTION && NIL == event_utilities.event_is_handler_registration_eventP( event ) )
    {
      Errors.error( $str45$Event__S_is_of_type__S__not__S_, event, event_model.event_class( event ), $kw12$KB_MODIFY_CREATE_ASSERTION );
    }
    return conses_high.getf( event_model.event_message( event ), $kw51$MT, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-modification-event.lisp", position = 14182L)
  public static SubLObject kb_modify_create_assertion_retrieve_cnf(final SubLObject event)
  {
    assert NIL != event_model.event_p( event ) : event;
    if( event_model.event_class( event ) != $kw12$KB_MODIFY_CREATE_ASSERTION && NIL == event_utilities.event_is_handler_registration_eventP( event ) )
    {
      Errors.error( $str45$Event__S_is_of_type__S__not__S_, event, event_model.event_class( event ), $kw12$KB_MODIFY_CREATE_ASSERTION );
    }
    return conses_high.getf( event_model.event_message( event ), $kw50$CNF, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-modification-event.lisp", position = 14294L)
  public static SubLObject post_kb_modify_remove_assertion_event(final SubLObject assertion, SubLObject gaf_truth)
  {
    if( gaf_truth == UNPROVIDED )
    {
      gaf_truth = $kw53$TRUE;
    }
    if( NIL != anyone_interested_in_kb_modification_eventP( $kw14$KB_MODIFY_REMOVE_ASSERTION ) )
    {
      return post_new_kb_modify_event( $kw14$KB_MODIFY_REMOVE_ASSERTION, ConsesLow.list( $kw54$SENTENCE, encapsulation.encapsulate( cycl_utilities.possibly_negate( uncanonicalizer.assertion_el_formula( assertion ),
          gaf_truth ) ), $kw51$MT, kb_modification_event_support.get_stable_description( assertions_high.assertion_mt( assertion ) ), $kw55$GAF, kb_modification_event_support.get_stable_description( assertions_high
              .gaf_assertionP( assertion ) ) ) );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-modification-event.lisp", position = 15013L)
  public static SubLObject kb_modify_remove_assertion_retrieve_gaf(final SubLObject event)
  {
    assert NIL != event_model.event_p( event ) : event;
    if( event_model.event_class( event ) != $kw14$KB_MODIFY_REMOVE_ASSERTION && NIL == event_utilities.event_is_handler_registration_eventP( event ) )
    {
      Errors.error( $str45$Event__S_is_of_type__S__not__S_, event, event_model.event_class( event ), $kw14$KB_MODIFY_REMOVE_ASSERTION );
    }
    return conses_high.getf( event_model.event_message( event ), $kw55$GAF, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-modification-event.lisp", position = 15013L)
  public static SubLObject kb_modify_remove_assertion_retrieve_mt(final SubLObject event)
  {
    assert NIL != event_model.event_p( event ) : event;
    if( event_model.event_class( event ) != $kw14$KB_MODIFY_REMOVE_ASSERTION && NIL == event_utilities.event_is_handler_registration_eventP( event ) )
    {
      Errors.error( $str45$Event__S_is_of_type__S__not__S_, event, event_model.event_class( event ), $kw14$KB_MODIFY_REMOVE_ASSERTION );
    }
    return conses_high.getf( event_model.event_message( event ), $kw51$MT, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-modification-event.lisp", position = 15013L)
  public static SubLObject kb_modify_remove_assertion_retrieve_sentence(final SubLObject event)
  {
    assert NIL != event_model.event_p( event ) : event;
    if( event_model.event_class( event ) != $kw14$KB_MODIFY_REMOVE_ASSERTION && NIL == event_utilities.event_is_handler_registration_eventP( event ) )
    {
      Errors.error( $str45$Event__S_is_of_type__S__not__S_, event, event_model.event_class( event ), $kw14$KB_MODIFY_REMOVE_ASSERTION );
    }
    return conses_high.getf( event_model.event_message( event ), $kw54$SENTENCE, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-modification-event.lisp", position = 15134L)
  public static SubLObject post_kb_modify_set_assertion_direction_event(final SubLObject assertion, final SubLObject old_direction, final SubLObject new_direction)
  {
    if( NIL != anyone_interested_in_kb_modification_eventP( $kw16$KB_MODIFY_SET_ASSERTION_DIRECTION ) )
    {
      return post_new_kb_modify_event( $kw16$KB_MODIFY_SET_ASSERTION_DIRECTION, ConsesLow.list( $kw56$ASSERTION, kb_modification_event_support.get_stable_description( assertion ), $kw57$OLD_DIRECTION,
          kb_modification_event_support.get_stable_description( old_direction ), $kw58$NEW_DIRECTION, kb_modification_event_support.get_stable_description( new_direction ) ) );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-modification-event.lisp", position = 15669L)
  public static SubLObject kb_modify_set_assertion_direction_retrieve_new_direction(final SubLObject event)
  {
    assert NIL != event_model.event_p( event ) : event;
    if( event_model.event_class( event ) != $kw16$KB_MODIFY_SET_ASSERTION_DIRECTION && NIL == event_utilities.event_is_handler_registration_eventP( event ) )
    {
      Errors.error( $str45$Event__S_is_of_type__S__not__S_, event, event_model.event_class( event ), $kw16$KB_MODIFY_SET_ASSERTION_DIRECTION );
    }
    return conses_high.getf( event_model.event_message( event ), $kw58$NEW_DIRECTION, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-modification-event.lisp", position = 15669L)
  public static SubLObject kb_modify_set_assertion_direction_retrieve_old_direction(final SubLObject event)
  {
    assert NIL != event_model.event_p( event ) : event;
    if( event_model.event_class( event ) != $kw16$KB_MODIFY_SET_ASSERTION_DIRECTION && NIL == event_utilities.event_is_handler_registration_eventP( event ) )
    {
      Errors.error( $str45$Event__S_is_of_type__S__not__S_, event, event_model.event_class( event ), $kw16$KB_MODIFY_SET_ASSERTION_DIRECTION );
    }
    return conses_high.getf( event_model.event_message( event ), $kw57$OLD_DIRECTION, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-modification-event.lisp", position = 15669L)
  public static SubLObject kb_modify_set_assertion_direction_retrieve_assertion(final SubLObject event)
  {
    assert NIL != event_model.event_p( event ) : event;
    if( event_model.event_class( event ) != $kw16$KB_MODIFY_SET_ASSERTION_DIRECTION && NIL == event_utilities.event_is_handler_registration_eventP( event ) )
    {
      Errors.error( $str45$Event__S_is_of_type__S__not__S_, event, event_model.event_class( event ), $kw16$KB_MODIFY_SET_ASSERTION_DIRECTION );
    }
    return conses_high.getf( event_model.event_message( event ), $kw56$ASSERTION, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-modification-event.lisp", position = 15819L)
  public static SubLObject post_kb_modify_set_assertion_truth_event(final SubLObject assertion, final SubLObject old_truth, final SubLObject new_truth)
  {
    if( NIL != anyone_interested_in_kb_modification_eventP( $kw19$KB_MODIFY_SET_ASSERTION_TRUTH ) )
    {
      return post_new_kb_modify_event( $kw19$KB_MODIFY_SET_ASSERTION_TRUTH, ConsesLow.list( $kw56$ASSERTION, kb_modification_event_support.get_stable_description( assertion ), $kw59$OLD_TRUTH,
          kb_modification_event_support.get_stable_description( old_truth ), $kw60$NEW_TRUTH, kb_modification_event_support.get_stable_description( new_truth ) ) );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-modification-event.lisp", position = 16288L)
  public static SubLObject kb_modify_set_assertion_truth_retrieve_new_truth(final SubLObject event)
  {
    assert NIL != event_model.event_p( event ) : event;
    if( event_model.event_class( event ) != $kw19$KB_MODIFY_SET_ASSERTION_TRUTH && NIL == event_utilities.event_is_handler_registration_eventP( event ) )
    {
      Errors.error( $str45$Event__S_is_of_type__S__not__S_, event, event_model.event_class( event ), $kw19$KB_MODIFY_SET_ASSERTION_TRUTH );
    }
    return conses_high.getf( event_model.event_message( event ), $kw60$NEW_TRUTH, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-modification-event.lisp", position = 16288L)
  public static SubLObject kb_modify_set_assertion_truth_retrieve_old_truth(final SubLObject event)
  {
    assert NIL != event_model.event_p( event ) : event;
    if( event_model.event_class( event ) != $kw19$KB_MODIFY_SET_ASSERTION_TRUTH && NIL == event_utilities.event_is_handler_registration_eventP( event ) )
    {
      Errors.error( $str45$Event__S_is_of_type__S__not__S_, event, event_model.event_class( event ), $kw19$KB_MODIFY_SET_ASSERTION_TRUTH );
    }
    return conses_high.getf( event_model.event_message( event ), $kw59$OLD_TRUTH, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-modification-event.lisp", position = 16288L)
  public static SubLObject kb_modify_set_assertion_truth_retrieve_assertion(final SubLObject event)
  {
    assert NIL != event_model.event_p( event ) : event;
    if( event_model.event_class( event ) != $kw19$KB_MODIFY_SET_ASSERTION_TRUTH && NIL == event_utilities.event_is_handler_registration_eventP( event ) )
    {
      Errors.error( $str45$Event__S_is_of_type__S__not__S_, event, event_model.event_class( event ), $kw19$KB_MODIFY_SET_ASSERTION_TRUTH );
    }
    return conses_high.getf( event_model.event_message( event ), $kw56$ASSERTION, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-modification-event.lisp", position = 16426L)
  public static SubLObject post_kb_modify_set_assertion_strength_event(final SubLObject assertion, final SubLObject old_strength, final SubLObject new_strength)
  {
    if( NIL != anyone_interested_in_kb_modification_eventP( $kw18$KB_MODIFY_SET_ASSERTION_STRENGTH ) )
    {
      return post_new_kb_modify_event( $kw18$KB_MODIFY_SET_ASSERTION_STRENGTH, ConsesLow.list( $kw56$ASSERTION, kb_modification_event_support.get_stable_description( assertion ), $kw61$OLD_STRENGTH,
          kb_modification_event_support.get_stable_description( old_strength ), $kw62$NEW_STRENGTH, kb_modification_event_support.get_stable_description( new_strength ) ) );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-modification-event.lisp", position = 16925L)
  public static SubLObject kb_modify_set_assertion_strength_retrieve_new_strength(final SubLObject event)
  {
    assert NIL != event_model.event_p( event ) : event;
    if( event_model.event_class( event ) != $kw18$KB_MODIFY_SET_ASSERTION_STRENGTH && NIL == event_utilities.event_is_handler_registration_eventP( event ) )
    {
      Errors.error( $str45$Event__S_is_of_type__S__not__S_, event, event_model.event_class( event ), $kw18$KB_MODIFY_SET_ASSERTION_STRENGTH );
    }
    return conses_high.getf( event_model.event_message( event ), $kw62$NEW_STRENGTH, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-modification-event.lisp", position = 16925L)
  public static SubLObject kb_modify_set_assertion_strength_retrieve_old_strength(final SubLObject event)
  {
    assert NIL != event_model.event_p( event ) : event;
    if( event_model.event_class( event ) != $kw18$KB_MODIFY_SET_ASSERTION_STRENGTH && NIL == event_utilities.event_is_handler_registration_eventP( event ) )
    {
      Errors.error( $str45$Event__S_is_of_type__S__not__S_, event, event_model.event_class( event ), $kw18$KB_MODIFY_SET_ASSERTION_STRENGTH );
    }
    return conses_high.getf( event_model.event_message( event ), $kw61$OLD_STRENGTH, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-modification-event.lisp", position = 16925L)
  public static SubLObject kb_modify_set_assertion_strength_retrieve_assertion(final SubLObject event)
  {
    assert NIL != event_model.event_p( event ) : event;
    if( event_model.event_class( event ) != $kw18$KB_MODIFY_SET_ASSERTION_STRENGTH && NIL == event_utilities.event_is_handler_registration_eventP( event ) )
    {
      Errors.error( $str45$Event__S_is_of_type__S__not__S_, event, event_model.event_class( event ), $kw18$KB_MODIFY_SET_ASSERTION_STRENGTH );
    }
    return conses_high.getf( event_model.event_message( event ), $kw56$ASSERTION, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-modification-event.lisp", position = 17072L)
  public static SubLObject post_kb_modify_set_assertion_variable_names_event(final SubLObject assertion, final SubLObject old_var_names, final SubLObject new_var_names)
  {
    if( NIL != anyone_interested_in_kb_modification_eventP( $kw20$KB_MODIFY_SET_ASSERTION_VARIABLE_NAMES ) )
    {
      return post_new_kb_modify_event( $kw20$KB_MODIFY_SET_ASSERTION_VARIABLE_NAMES, ConsesLow.list( $kw56$ASSERTION, kb_modification_event_support.get_stable_description( assertion ), $kw63$OLD_VAR_NAMES,
          kb_modification_event_support.get_stable_description( old_var_names ), $kw64$NEW_VAR_NAMES, kb_modification_event_support.get_stable_description( new_var_names ) ) );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-modification-event.lisp", position = 17601L)
  public static SubLObject kb_modify_set_assertion_variable_names_retrieve_new_var_names(final SubLObject event)
  {
    assert NIL != event_model.event_p( event ) : event;
    if( event_model.event_class( event ) != $kw20$KB_MODIFY_SET_ASSERTION_VARIABLE_NAMES && NIL == event_utilities.event_is_handler_registration_eventP( event ) )
    {
      Errors.error( $str45$Event__S_is_of_type__S__not__S_, event, event_model.event_class( event ), $kw20$KB_MODIFY_SET_ASSERTION_VARIABLE_NAMES );
    }
    return conses_high.getf( event_model.event_message( event ), $kw64$NEW_VAR_NAMES, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-modification-event.lisp", position = 17601L)
  public static SubLObject kb_modify_set_assertion_variable_names_retrieve_old_var_names(final SubLObject event)
  {
    assert NIL != event_model.event_p( event ) : event;
    if( event_model.event_class( event ) != $kw20$KB_MODIFY_SET_ASSERTION_VARIABLE_NAMES && NIL == event_utilities.event_is_handler_registration_eventP( event ) )
    {
      Errors.error( $str45$Event__S_is_of_type__S__not__S_, event, event_model.event_class( event ), $kw20$KB_MODIFY_SET_ASSERTION_VARIABLE_NAMES );
    }
    return conses_high.getf( event_model.event_message( event ), $kw63$OLD_VAR_NAMES, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-modification-event.lisp", position = 17601L)
  public static SubLObject kb_modify_set_assertion_variable_names_retrieve_assertion(final SubLObject event)
  {
    assert NIL != event_model.event_p( event ) : event;
    if( event_model.event_class( event ) != $kw20$KB_MODIFY_SET_ASSERTION_VARIABLE_NAMES && NIL == event_utilities.event_is_handler_registration_eventP( event ) )
    {
      Errors.error( $str45$Event__S_is_of_type__S__not__S_, event, event_model.event_class( event ), $kw20$KB_MODIFY_SET_ASSERTION_VARIABLE_NAMES );
    }
    return conses_high.getf( event_model.event_message( event ), $kw56$ASSERTION, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-modification-event.lisp", position = 17756L)
  public static SubLObject post_kb_modify_set_assertion_asserted_by_event(final SubLObject assertion, final SubLObject old_asserted_by, final SubLObject new_asserted_by)
  {
    if( NIL != anyone_interested_in_kb_modification_eventP( $kw22$KB_MODIFY_SET_ASSERTION_ASSERTED_BY ) )
    {
      return post_new_kb_modify_event( $kw22$KB_MODIFY_SET_ASSERTION_ASSERTED_BY, ConsesLow.list( $kw56$ASSERTION, kb_modification_event_support.get_stable_description( assertion ), $kw65$OLD_ASSERTED_BY,
          kb_modification_event_support.get_stable_description( old_asserted_by ), $kw66$NEW_ASSERTED_BY, kb_modification_event_support.get_stable_description( new_asserted_by ) ) );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-modification-event.lisp", position = 18285L)
  public static SubLObject kb_modify_set_assertion_asserted_by_retrieve_new_asserted_by(final SubLObject event)
  {
    assert NIL != event_model.event_p( event ) : event;
    if( event_model.event_class( event ) != $kw22$KB_MODIFY_SET_ASSERTION_ASSERTED_BY && NIL == event_utilities.event_is_handler_registration_eventP( event ) )
    {
      Errors.error( $str45$Event__S_is_of_type__S__not__S_, event, event_model.event_class( event ), $kw22$KB_MODIFY_SET_ASSERTION_ASSERTED_BY );
    }
    return conses_high.getf( event_model.event_message( event ), $kw66$NEW_ASSERTED_BY, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-modification-event.lisp", position = 18285L)
  public static SubLObject kb_modify_set_assertion_asserted_by_retrieve_old_asserted_by(final SubLObject event)
  {
    assert NIL != event_model.event_p( event ) : event;
    if( event_model.event_class( event ) != $kw22$KB_MODIFY_SET_ASSERTION_ASSERTED_BY && NIL == event_utilities.event_is_handler_registration_eventP( event ) )
    {
      Errors.error( $str45$Event__S_is_of_type__S__not__S_, event, event_model.event_class( event ), $kw22$KB_MODIFY_SET_ASSERTION_ASSERTED_BY );
    }
    return conses_high.getf( event_model.event_message( event ), $kw65$OLD_ASSERTED_BY, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-modification-event.lisp", position = 18285L)
  public static SubLObject kb_modify_set_assertion_asserted_by_retrieve_assertion(final SubLObject event)
  {
    assert NIL != event_model.event_p( event ) : event;
    if( event_model.event_class( event ) != $kw22$KB_MODIFY_SET_ASSERTION_ASSERTED_BY && NIL == event_utilities.event_is_handler_registration_eventP( event ) )
    {
      Errors.error( $str45$Event__S_is_of_type__S__not__S_, event, event_model.event_class( event ), $kw22$KB_MODIFY_SET_ASSERTION_ASSERTED_BY );
    }
    return conses_high.getf( event_model.event_message( event ), $kw56$ASSERTION, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-modification-event.lisp", position = 18441L)
  public static SubLObject post_kb_modify_set_assertion_asserted_when_event(final SubLObject assertion, final SubLObject old_asserted_when, final SubLObject new_asserted_when)
  {
    if( NIL != anyone_interested_in_kb_modification_eventP( $kw24$KB_MODIFY_SET_ASSERTION_ASSERTED_WHEN ) )
    {
      return post_new_kb_modify_event( $kw24$KB_MODIFY_SET_ASSERTION_ASSERTED_WHEN, ConsesLow.list( $kw56$ASSERTION, kb_modification_event_support.get_stable_description( assertion ), $kw67$OLD_ASSERTED_WHEN,
          kb_modification_event_support.get_stable_description( old_asserted_when ), $kw68$NEW_ASSERTED_WHEN, kb_modification_event_support.get_stable_description( new_asserted_when ) ) );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-modification-event.lisp", position = 18990L)
  public static SubLObject kb_modify_set_assertion_asserted_when_retrieve_new_asserted_when(final SubLObject event)
  {
    assert NIL != event_model.event_p( event ) : event;
    if( event_model.event_class( event ) != $kw24$KB_MODIFY_SET_ASSERTION_ASSERTED_WHEN && NIL == event_utilities.event_is_handler_registration_eventP( event ) )
    {
      Errors.error( $str45$Event__S_is_of_type__S__not__S_, event, event_model.event_class( event ), $kw24$KB_MODIFY_SET_ASSERTION_ASSERTED_WHEN );
    }
    return conses_high.getf( event_model.event_message( event ), $kw68$NEW_ASSERTED_WHEN, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-modification-event.lisp", position = 18990L)
  public static SubLObject kb_modify_set_assertion_asserted_when_retrieve_old_asserted_when(final SubLObject event)
  {
    assert NIL != event_model.event_p( event ) : event;
    if( event_model.event_class( event ) != $kw24$KB_MODIFY_SET_ASSERTION_ASSERTED_WHEN && NIL == event_utilities.event_is_handler_registration_eventP( event ) )
    {
      Errors.error( $str45$Event__S_is_of_type__S__not__S_, event, event_model.event_class( event ), $kw24$KB_MODIFY_SET_ASSERTION_ASSERTED_WHEN );
    }
    return conses_high.getf( event_model.event_message( event ), $kw67$OLD_ASSERTED_WHEN, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-modification-event.lisp", position = 18990L)
  public static SubLObject kb_modify_set_assertion_asserted_when_retrieve_assertion(final SubLObject event)
  {
    assert NIL != event_model.event_p( event ) : event;
    if( event_model.event_class( event ) != $kw24$KB_MODIFY_SET_ASSERTION_ASSERTED_WHEN && NIL == event_utilities.event_is_handler_registration_eventP( event ) )
    {
      Errors.error( $str45$Event__S_is_of_type__S__not__S_, event, event_model.event_class( event ), $kw24$KB_MODIFY_SET_ASSERTION_ASSERTED_WHEN );
    }
    return conses_high.getf( event_model.event_message( event ), $kw56$ASSERTION, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-modification-event.lisp", position = 19152L)
  public static SubLObject post_kb_modify_set_assertion_asserted_why_event(final SubLObject assertion, final SubLObject old_asserted_why, final SubLObject new_asserted_why)
  {
    if( NIL != anyone_interested_in_kb_modification_eventP( $kw23$KB_MODIFY_SET_ASSERTION_ASSERTED_WHY ) )
    {
      return post_new_kb_modify_event( $kw23$KB_MODIFY_SET_ASSERTION_ASSERTED_WHY, ConsesLow.list( $kw56$ASSERTION, kb_modification_event_support.get_stable_description( assertion ), $kw69$OLD_ASSERTED_WHY,
          kb_modification_event_support.get_stable_description( old_asserted_why ), $kw70$NEW_ASSERTED_WHY, kb_modification_event_support.get_stable_description( new_asserted_why ) ) );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-modification-event.lisp", position = 19692L)
  public static SubLObject kb_modify_set_assertion_asserted_why_retrieve_new_asserted_why(final SubLObject event)
  {
    assert NIL != event_model.event_p( event ) : event;
    if( event_model.event_class( event ) != $kw23$KB_MODIFY_SET_ASSERTION_ASSERTED_WHY && NIL == event_utilities.event_is_handler_registration_eventP( event ) )
    {
      Errors.error( $str45$Event__S_is_of_type__S__not__S_, event, event_model.event_class( event ), $kw23$KB_MODIFY_SET_ASSERTION_ASSERTED_WHY );
    }
    return conses_high.getf( event_model.event_message( event ), $kw70$NEW_ASSERTED_WHY, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-modification-event.lisp", position = 19692L)
  public static SubLObject kb_modify_set_assertion_asserted_why_retrieve_old_asserted_why(final SubLObject event)
  {
    assert NIL != event_model.event_p( event ) : event;
    if( event_model.event_class( event ) != $kw23$KB_MODIFY_SET_ASSERTION_ASSERTED_WHY && NIL == event_utilities.event_is_handler_registration_eventP( event ) )
    {
      Errors.error( $str45$Event__S_is_of_type__S__not__S_, event, event_model.event_class( event ), $kw23$KB_MODIFY_SET_ASSERTION_ASSERTED_WHY );
    }
    return conses_high.getf( event_model.event_message( event ), $kw69$OLD_ASSERTED_WHY, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-modification-event.lisp", position = 19692L)
  public static SubLObject kb_modify_set_assertion_asserted_why_retrieve_assertion(final SubLObject event)
  {
    assert NIL != event_model.event_p( event ) : event;
    if( event_model.event_class( event ) != $kw23$KB_MODIFY_SET_ASSERTION_ASSERTED_WHY && NIL == event_utilities.event_is_handler_registration_eventP( event ) )
    {
      Errors.error( $str45$Event__S_is_of_type__S__not__S_, event, event_model.event_class( event ), $kw23$KB_MODIFY_SET_ASSERTION_ASSERTED_WHY );
    }
    return conses_high.getf( event_model.event_message( event ), $kw56$ASSERTION, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-modification-event.lisp", position = 19851L)
  public static SubLObject post_kb_modify_set_assertion_asserted_second_event(final SubLObject assertion, final SubLObject old_asserted_second, final SubLObject new_asserted_second)
  {
    if( NIL != anyone_interested_in_kb_modification_eventP( $kw25$KB_MODIFY_SET_ASSERTION_ASSERTED_SECOND ) )
    {
      return post_new_kb_modify_event( $kw25$KB_MODIFY_SET_ASSERTION_ASSERTED_SECOND, ConsesLow.list( $kw56$ASSERTION, kb_modification_event_support.get_stable_description( assertion ), $kw71$OLD_ASSERTED_SECOND,
          kb_modification_event_support.get_stable_description( old_asserted_second ), $kw72$NEW_ASSERTED_SECOND, kb_modification_event_support.get_stable_description( new_asserted_second ) ) );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-modification-event.lisp", position = 20420L)
  public static SubLObject kb_modify_set_assertion_asserted_second_retrieve_new_asserted_second(final SubLObject event)
  {
    assert NIL != event_model.event_p( event ) : event;
    if( event_model.event_class( event ) != $kw25$KB_MODIFY_SET_ASSERTION_ASSERTED_SECOND && NIL == event_utilities.event_is_handler_registration_eventP( event ) )
    {
      Errors.error( $str45$Event__S_is_of_type__S__not__S_, event, event_model.event_class( event ), $kw25$KB_MODIFY_SET_ASSERTION_ASSERTED_SECOND );
    }
    return conses_high.getf( event_model.event_message( event ), $kw72$NEW_ASSERTED_SECOND, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-modification-event.lisp", position = 20420L)
  public static SubLObject kb_modify_set_assertion_asserted_second_retrieve_old_asserted_second(final SubLObject event)
  {
    assert NIL != event_model.event_p( event ) : event;
    if( event_model.event_class( event ) != $kw25$KB_MODIFY_SET_ASSERTION_ASSERTED_SECOND && NIL == event_utilities.event_is_handler_registration_eventP( event ) )
    {
      Errors.error( $str45$Event__S_is_of_type__S__not__S_, event, event_model.event_class( event ), $kw25$KB_MODIFY_SET_ASSERTION_ASSERTED_SECOND );
    }
    return conses_high.getf( event_model.event_message( event ), $kw71$OLD_ASSERTED_SECOND, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-modification-event.lisp", position = 20420L)
  public static SubLObject kb_modify_set_assertion_asserted_second_retrieve_assertion(final SubLObject event)
  {
    assert NIL != event_model.event_p( event ) : event;
    if( event_model.event_class( event ) != $kw25$KB_MODIFY_SET_ASSERTION_ASSERTED_SECOND && NIL == event_utilities.event_is_handler_registration_eventP( event ) )
    {
      Errors.error( $str45$Event__S_is_of_type__S__not__S_, event, event_model.event_class( event ), $kw25$KB_MODIFY_SET_ASSERTION_ASSERTED_SECOND );
    }
    return conses_high.getf( event_model.event_message( event ), $kw56$ASSERTION, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-modification-event.lisp", position = 20588L)
  public static SubLObject post_kb_modify_create_asserted_argument(final SubLObject assertion, final SubLObject truth, final SubLObject strength)
  {
    if( NIL != anyone_interested_in_kb_modification_eventP( $kw26$KB_MODIFY_CREATE_ASSERTED_ARGUMENT ) )
    {
      return post_new_kb_modify_event( $kw26$KB_MODIFY_CREATE_ASSERTED_ARGUMENT, ConsesLow.list( $kw56$ASSERTION, kb_modification_event_support.get_stable_description( assertion ), $kw73$TRUTH,
          kb_modification_event_support.get_stable_description( truth ), $kw74$STRENGTH, kb_modification_event_support.get_stable_description( strength ) ) );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-modification-event.lisp", position = 21098L)
  public static SubLObject kb_modify_create_asserted_argument_retrieve_strength(final SubLObject event)
  {
    assert NIL != event_model.event_p( event ) : event;
    if( event_model.event_class( event ) != $kw26$KB_MODIFY_CREATE_ASSERTED_ARGUMENT && NIL == event_utilities.event_is_handler_registration_eventP( event ) )
    {
      Errors.error( $str45$Event__S_is_of_type__S__not__S_, event, event_model.event_class( event ), $kw26$KB_MODIFY_CREATE_ASSERTED_ARGUMENT );
    }
    return conses_high.getf( event_model.event_message( event ), $kw74$STRENGTH, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-modification-event.lisp", position = 21098L)
  public static SubLObject kb_modify_create_asserted_argument_retrieve_truth(final SubLObject event)
  {
    assert NIL != event_model.event_p( event ) : event;
    if( event_model.event_class( event ) != $kw26$KB_MODIFY_CREATE_ASSERTED_ARGUMENT && NIL == event_utilities.event_is_handler_registration_eventP( event ) )
    {
      Errors.error( $str45$Event__S_is_of_type__S__not__S_, event, event_model.event_class( event ), $kw26$KB_MODIFY_CREATE_ASSERTED_ARGUMENT );
    }
    return conses_high.getf( event_model.event_message( event ), $kw73$TRUTH, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-modification-event.lisp", position = 21098L)
  public static SubLObject kb_modify_create_asserted_argument_retrieve_assertion(final SubLObject event)
  {
    assert NIL != event_model.event_p( event ) : event;
    if( event_model.event_class( event ) != $kw26$KB_MODIFY_CREATE_ASSERTED_ARGUMENT && NIL == event_utilities.event_is_handler_registration_eventP( event ) )
    {
      Errors.error( $str45$Event__S_is_of_type__S__not__S_, event, event_model.event_class( event ), $kw26$KB_MODIFY_CREATE_ASSERTED_ARGUMENT );
    }
    return conses_high.getf( event_model.event_message( event ), $kw56$ASSERTION, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-modification-event.lisp", position = 21236L)
  public static SubLObject post_kb_modify_remove_asserted_argument(final SubLObject assertion, final SubLObject asserted_argument)
  {
    if( NIL != anyone_interested_in_kb_modification_eventP( $kw28$KB_MODIFY_REMOVE_ASSERTED_ARGUMENT ) )
    {
      return post_new_kb_modify_event( $kw28$KB_MODIFY_REMOVE_ASSERTED_ARGUMENT, ConsesLow.list( $kw56$ASSERTION, kb_modification_event_support.get_stable_description( assertion ), $kw75$ASSERTED_ARGUMENT,
          kb_modification_event_support.get_stable_description( asserted_argument ) ) );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-modification-event.lisp", position = 21639L)
  public static SubLObject kb_modify_remove_asserted_argument_retrieve_asserted_argument(final SubLObject event)
  {
    assert NIL != event_model.event_p( event ) : event;
    if( event_model.event_class( event ) != $kw28$KB_MODIFY_REMOVE_ASSERTED_ARGUMENT && NIL == event_utilities.event_is_handler_registration_eventP( event ) )
    {
      Errors.error( $str45$Event__S_is_of_type__S__not__S_, event, event_model.event_class( event ), $kw28$KB_MODIFY_REMOVE_ASSERTED_ARGUMENT );
    }
    return conses_high.getf( event_model.event_message( event ), $kw75$ASSERTED_ARGUMENT, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-modification-event.lisp", position = 21639L)
  public static SubLObject kb_modify_remove_asserted_argument_retrieve_assertion(final SubLObject event)
  {
    assert NIL != event_model.event_p( event ) : event;
    if( event_model.event_class( event ) != $kw28$KB_MODIFY_REMOVE_ASSERTED_ARGUMENT && NIL == event_utilities.event_is_handler_registration_eventP( event ) )
    {
      Errors.error( $str45$Event__S_is_of_type__S__not__S_, event, event_model.event_class( event ), $kw28$KB_MODIFY_REMOVE_ASSERTED_ARGUMENT );
    }
    return conses_high.getf( event_model.event_message( event ), $kw56$ASSERTION, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-modification-event.lisp", position = 21779L)
  public static SubLObject post_kb_modify_create_new_deduction_event(final SubLObject assertion, final SubLObject supports, final SubLObject truth, final SubLObject strength, SubLObject v_bindings,
      SubLObject pragmatic_support_mts)
  {
    if( v_bindings == UNPROVIDED )
    {
      v_bindings = NIL;
    }
    if( pragmatic_support_mts == UNPROVIDED )
    {
      pragmatic_support_mts = NIL;
    }
    if( NIL != anyone_interested_in_kb_modification_eventP( $kw30$KB_MODIFY_CREATE_NEW_DEDUCTION ) )
    {
      return post_new_kb_modify_event( $kw30$KB_MODIFY_CREATE_NEW_DEDUCTION, ConsesLow.list( new SubLObject[] { $kw56$ASSERTION, kb_modification_event_support.get_stable_description( assertion ), $kw76$SUPPORTS,
        kb_modification_event_support.get_stable_description( supports ), $kw73$TRUTH, kb_modification_event_support.get_stable_description( truth ), $kw74$STRENGTH, kb_modification_event_support.get_stable_description(
            strength ), $kw77$BINDINGS, kb_modification_event_support.get_stable_description( v_bindings ), $kw78$PRAGMATIC_SUPPORT_MTS, kb_modification_event_support.get_stable_description( pragmatic_support_mts )
      } ) );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-modification-event.lisp", position = 22525L)
  public static SubLObject kb_modify_create_new_deduction_retrieve_truth(final SubLObject event)
  {
    assert NIL != event_model.event_p( event ) : event;
    if( event_model.event_class( event ) != $kw30$KB_MODIFY_CREATE_NEW_DEDUCTION && NIL == event_utilities.event_is_handler_registration_eventP( event ) )
    {
      Errors.error( $str45$Event__S_is_of_type__S__not__S_, event, event_model.event_class( event ), $kw30$KB_MODIFY_CREATE_NEW_DEDUCTION );
    }
    return conses_high.getf( event_model.event_message( event ), $kw73$TRUTH, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-modification-event.lisp", position = 22525L)
  public static SubLObject kb_modify_create_new_deduction_retrieve_supports(final SubLObject event)
  {
    assert NIL != event_model.event_p( event ) : event;
    if( event_model.event_class( event ) != $kw30$KB_MODIFY_CREATE_NEW_DEDUCTION && NIL == event_utilities.event_is_handler_registration_eventP( event ) )
    {
      Errors.error( $str45$Event__S_is_of_type__S__not__S_, event, event_model.event_class( event ), $kw30$KB_MODIFY_CREATE_NEW_DEDUCTION );
    }
    return conses_high.getf( event_model.event_message( event ), $kw76$SUPPORTS, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-modification-event.lisp", position = 22525L)
  public static SubLObject kb_modify_create_new_deduction_retrieve_assertion(final SubLObject event)
  {
    assert NIL != event_model.event_p( event ) : event;
    if( event_model.event_class( event ) != $kw30$KB_MODIFY_CREATE_NEW_DEDUCTION && NIL == event_utilities.event_is_handler_registration_eventP( event ) )
    {
      Errors.error( $str45$Event__S_is_of_type__S__not__S_, event, event_model.event_class( event ), $kw30$KB_MODIFY_CREATE_NEW_DEDUCTION );
    }
    return conses_high.getf( event_model.event_message( event ), $kw56$ASSERTION, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-modification-event.lisp", position = 22659L)
  public static SubLObject post_kb_modify_remove_deduction_event(final SubLObject deduction)
  {
    if( NIL != anyone_interested_in_kb_modification_eventP( $kw32$KB_MODIFY_REMOVE_DEDUCTION ) )
    {
      return post_new_kb_modify_event( $kw32$KB_MODIFY_REMOVE_DEDUCTION, ConsesLow.list( $kw79$DEDUCTION, deduction ) );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-modification-event.lisp", position = 22959L)
  public static SubLObject kb_modify_remove_deduction_retrieve_deduction(final SubLObject event)
  {
    assert NIL != event_model.event_p( event ) : event;
    if( event_model.event_class( event ) != $kw32$KB_MODIFY_REMOVE_DEDUCTION && NIL == event_utilities.event_is_handler_registration_eventP( event ) )
    {
      Errors.error( $str45$Event__S_is_of_type__S__not__S_, event, event_model.event_class( event ), $kw32$KB_MODIFY_REMOVE_DEDUCTION );
    }
    return conses_high.getf( event_model.event_message( event ), $kw79$DEDUCTION, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-modification-event.lisp", position = 23072L)
  public static SubLObject post_kb_modify_set_deduction_strength_event(final SubLObject deduction, final SubLObject old_strength, final SubLObject new_strength)
  {
    if( NIL != anyone_interested_in_kb_modification_eventP( $kw34$KB_MODIFY_SET_DEDUCTION_STRENGTH ) )
    {
      return post_new_kb_modify_event( $kw34$KB_MODIFY_SET_DEDUCTION_STRENGTH, ConsesLow.list( $kw79$DEDUCTION, deduction, $kw61$OLD_STRENGTH, old_strength, $kw62$NEW_STRENGTH, new_strength ) );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-modification-event.lisp", position = 23521L)
  public static SubLObject kb_modify_set_deduction_strength_retrieve_new_strength(final SubLObject event)
  {
    assert NIL != event_model.event_p( event ) : event;
    if( event_model.event_class( event ) != $kw34$KB_MODIFY_SET_DEDUCTION_STRENGTH && NIL == event_utilities.event_is_handler_registration_eventP( event ) )
    {
      Errors.error( $str45$Event__S_is_of_type__S__not__S_, event, event_model.event_class( event ), $kw34$KB_MODIFY_SET_DEDUCTION_STRENGTH );
    }
    return conses_high.getf( event_model.event_message( event ), $kw62$NEW_STRENGTH, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-modification-event.lisp", position = 23521L)
  public static SubLObject kb_modify_set_deduction_strength_retrieve_old_strength(final SubLObject event)
  {
    assert NIL != event_model.event_p( event ) : event;
    if( event_model.event_class( event ) != $kw34$KB_MODIFY_SET_DEDUCTION_STRENGTH && NIL == event_utilities.event_is_handler_registration_eventP( event ) )
    {
      Errors.error( $str45$Event__S_is_of_type__S__not__S_, event, event_model.event_class( event ), $kw34$KB_MODIFY_SET_DEDUCTION_STRENGTH );
    }
    return conses_high.getf( event_model.event_message( event ), $kw61$OLD_STRENGTH, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-modification-event.lisp", position = 23521L)
  public static SubLObject kb_modify_set_deduction_strength_retrieve_deduction(final SubLObject event)
  {
    assert NIL != event_model.event_p( event ) : event;
    if( event_model.event_class( event ) != $kw34$KB_MODIFY_SET_DEDUCTION_STRENGTH && NIL == event_utilities.event_is_handler_registration_eventP( event ) )
    {
      Errors.error( $str45$Event__S_is_of_type__S__not__S_, event, event_model.event_class( event ), $kw34$KB_MODIFY_SET_DEDUCTION_STRENGTH );
    }
    return conses_high.getf( event_model.event_message( event ), $kw79$DEDUCTION, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-modification-event.lisp", position = 23668L)
  public static SubLObject post_kb_modify_create_new_kb_hl_support_event(final SubLObject hl_support, final SubLObject justification)
  {
    if( NIL != anyone_interested_in_kb_modification_eventP( $kw36$KB_MODIFY_CREATE_NEW_KB_HL_SUPPORT ) )
    {
      return post_new_kb_modify_event( $kw36$KB_MODIFY_CREATE_NEW_KB_HL_SUPPORT, ConsesLow.list( $kw80$HL_SUPPORT, kb_modification_event_support.get_stable_description( hl_support ), $kw81$JUSTIFICATION,
          kb_modification_event_support.get_stable_description( justification ) ) );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-modification-event.lisp", position = 24169L)
  public static SubLObject kb_modify_create_new_kb_hl_support_retrieve_justification(final SubLObject event)
  {
    assert NIL != event_model.event_p( event ) : event;
    if( event_model.event_class( event ) != $kw36$KB_MODIFY_CREATE_NEW_KB_HL_SUPPORT && NIL == event_utilities.event_is_handler_registration_eventP( event ) )
    {
      Errors.error( $str45$Event__S_is_of_type__S__not__S_, event, event_model.event_class( event ), $kw36$KB_MODIFY_CREATE_NEW_KB_HL_SUPPORT );
    }
    return conses_high.getf( event_model.event_message( event ), $kw81$JUSTIFICATION, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-modification-event.lisp", position = 24169L)
  public static SubLObject kb_modify_create_new_kb_hl_support_retrieve_hl_support(final SubLObject event)
  {
    assert NIL != event_model.event_p( event ) : event;
    if( event_model.event_class( event ) != $kw36$KB_MODIFY_CREATE_NEW_KB_HL_SUPPORT && NIL == event_utilities.event_is_handler_registration_eventP( event ) )
    {
      Errors.error( $str45$Event__S_is_of_type__S__not__S_, event, event_model.event_class( event ), $kw36$KB_MODIFY_CREATE_NEW_KB_HL_SUPPORT );
    }
    return conses_high.getf( event_model.event_message( event ), $kw80$HL_SUPPORT, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-modification-event.lisp", position = 24306L)
  public static SubLObject post_kb_modify_remove_kb_hl_support_event(final SubLObject kb_hl_support)
  {
    if( NIL != anyone_interested_in_kb_modification_eventP( $kw38$KB_MODIFY_REMOVE_KB_HL_SUPPORT ) )
    {
      return post_new_kb_modify_event( $kw38$KB_MODIFY_REMOVE_KB_HL_SUPPORT, ConsesLow.list( $kw82$KB_HL_SUPPORT, kb_modification_event_support.get_stable_description( kb_hl_support ) ) );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-modification-event.lisp", position = 24663L)
  public static SubLObject kb_modify_remove_kb_hl_support_retrieve_kb_hl_support(final SubLObject event)
  {
    assert NIL != event_model.event_p( event ) : event;
    if( event_model.event_class( event ) != $kw38$KB_MODIFY_REMOVE_KB_HL_SUPPORT && NIL == event_utilities.event_is_handler_registration_eventP( event ) )
    {
      Errors.error( $str45$Event__S_is_of_type__S__not__S_, event, event_model.event_class( event ), $kw38$KB_MODIFY_REMOVE_KB_HL_SUPPORT );
    }
    return conses_high.getf( event_model.event_message( event ), $kw82$KB_HL_SUPPORT, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-modification-event.lisp", position = 24784L)
  public static SubLObject post_kb_modify_irrelevance_event(final SubLObject v_term, final SubLObject assertion)
  {
    return post_new_kb_modify_event( $kw40$KB_MODIFY_IRRELEVANCE, ConsesLow.list( $kw83$TERM, kb_modification_event_support.get_stable_description( v_term ), $kw56$ASSERTION, kb_modification_event_support
        .get_stable_description( assertion ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-modification-event.lisp", position = 25172L)
  public static SubLObject kb_modify_irrelevance_retrieve_assertion(final SubLObject event)
  {
    assert NIL != event_model.event_p( event ) : event;
    if( event_model.event_class( event ) != $kw40$KB_MODIFY_IRRELEVANCE && NIL == event_utilities.event_is_handler_registration_eventP( event ) )
    {
      Errors.error( $str45$Event__S_is_of_type__S__not__S_, event, event_model.event_class( event ), $kw40$KB_MODIFY_IRRELEVANCE );
    }
    return conses_high.getf( event_model.event_message( event ), $kw56$ASSERTION, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-modification-event.lisp", position = 25172L)
  public static SubLObject kb_modify_irrelevance_retrieve_term(final SubLObject event)
  {
    assert NIL != event_model.event_p( event ) : event;
    if( event_model.event_class( event ) != $kw40$KB_MODIFY_IRRELEVANCE && NIL == event_utilities.event_is_handler_registration_eventP( event ) )
    {
      Errors.error( $str45$Event__S_is_of_type__S__not__S_, event, event_model.event_class( event ), $kw40$KB_MODIFY_IRRELEVANCE );
    }
    return conses_high.getf( event_model.event_message( event ), $kw83$TERM, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-modification-event.lisp", position = 25286L)
  public static SubLObject post_new_kb_modify_event(final SubLObject event_class, final SubLObject v_arguments)
  {
    return post_kb_modify_event( new_kb_modify_event( event_class, v_arguments ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-modification-event.lisp", position = 25492L)
  public static SubLObject new_kb_modify_event(final SubLObject event_class, final SubLObject v_arguments)
  {
    return event_model.new_event( event_class, v_arguments, control_vars.cyc_image_id() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-modification-event.lisp", position = 25611L)
  public static SubLObject post_kb_modify_event(final SubLObject event)
  {
    return event_broker.post_event( event, current_kb_modification_event_broker() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-modification-event.lisp", position = 25724L)
  public static SubLObject current_kb_modification_event_broker()
  {
    return event_broker.core_event_broker();
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-modification-event.lisp", position = 25809L)
  public static SubLObject anyone_interested_in_kb_modification_eventP(final SubLObject event_class)
  {
    return event_broker.fast_has_event_class_any_transitive_listenersP( event_class, current_kb_modification_event_broker() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-modification-event.lisp", position = 26003L)
  public static SubLObject kb_modifications_event_dispatcher_runningP()
  {
    return event_utilities.generic_event_dispatcher_process_running_for_application_p( $sym85$_KB_MODIFICATIONS_EVENT_DISPATCHER_LISTENERS_ );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-modification-event.lisp", position = 26003L)
  public static SubLObject ensure_kb_modifications_event_dispatcher_running()
  {
    if( NIL == kb_modifications_event_dispatcher_runningP() )
    {
      start_kb_modifications_event_dispatcher();
    }
    return event_utilities.generic_event_dispatcher_process();
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-modification-event.lisp", position = 26003L)
  public static SubLObject register_listener_with_kb_modifications_event_dispatcher(final SubLObject listener_var)
  {
    SubLObject release = NIL;
    try
    {
      release = Locks.seize_lock( $kb_modifications_event_dispatcher_lock$.getGlobalValue() );
      if( NIL == Sequences.find( listener_var, $kb_modifications_event_dispatcher_listeners$.getGlobalValue(), EQUALP, UNPROVIDED, UNPROVIDED, UNPROVIDED ) )
      {
        $kb_modifications_event_dispatcher_listeners$.setGlobalValue( ConsesLow.cons( listener_var, $kb_modifications_event_dispatcher_listeners$.getGlobalValue() ) );
        if( NIL != kb_modifications_event_dispatcher_runningP() )
        {
          event_broker.register_event_listener( listener_var, NIL );
        }
      }
    }
    finally
    {
      if( NIL != release )
      {
        Locks.release_lock( $kb_modifications_event_dispatcher_lock$.getGlobalValue() );
      }
    }
    return listener_var;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-modification-event.lisp", position = 26003L)
  public static SubLObject deregister_listener_with_kb_modifications_event_dispatcher(final SubLObject listener_var)
  {
    SubLObject release = NIL;
    try
    {
      release = Locks.seize_lock( $kb_modifications_event_dispatcher_lock$.getGlobalValue() );
      $kb_modifications_event_dispatcher_listeners$.setGlobalValue( Sequences.remove( listener_var, $kb_modifications_event_dispatcher_listeners$.getGlobalValue(), EQUALP, UNPROVIDED, UNPROVIDED, UNPROVIDED,
          UNPROVIDED ) );
      if( NIL != kb_modifications_event_dispatcher_runningP() )
      {
        event_broker.deregister_event_listener( listener_var, NIL );
      }
    }
    finally
    {
      if( NIL != release )
      {
        Locks.release_lock( $kb_modifications_event_dispatcher_lock$.getGlobalValue() );
      }
    }
    return listener_var;
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-modification-event.lisp", position = 26003L)
  public static SubLObject stop_kb_modifications_event_dispatcher()
  {
    return event_utilities.stop_generic_event_dispatcher_process_for_application( $sym85$_KB_MODIFICATIONS_EVENT_DISPATCHER_LISTENERS_ );
  }

  @SubLTranslatedFile.SubL(source = "cycl/kb-modification-event.lisp", position = 26003L)
  public static SubLObject start_kb_modifications_event_dispatcher()
  {
    return event_utilities.start_generic_event_dispatcher_process_for_application( $sym85$_KB_MODIFICATIONS_EVENT_DISPATCHER_LISTENERS_ );
  }

  public static SubLObject declare_kb_modification_event_file()
  {
    SubLFiles.declareFunction( me, "post_kb_modify_create_constant_event", "POST-KB-MODIFY-CREATE-CONSTANT-EVENT", 2, 0, false );
    SubLFiles.declareFunction( me, "kb_modify_create_constant_retrieve_external_id", "KB-MODIFY-CREATE-CONSTANT-RETRIEVE-EXTERNAL-ID", 1, 0, false );
    SubLFiles.declareFunction( me, "kb_modify_create_constant_retrieve_name", "KB-MODIFY-CREATE-CONSTANT-RETRIEVE-NAME", 1, 0, false );
    SubLFiles.declareFunction( me, "post_kb_modify_rename_constant_event", "POST-KB-MODIFY-RENAME-CONSTANT-EVENT", 3, 0, false );
    SubLFiles.declareFunction( me, "kb_modify_rename_constant_retrieve_new_constant_name", "KB-MODIFY-RENAME-CONSTANT-RETRIEVE-NEW-CONSTANT-NAME", 1, 0, false );
    SubLFiles.declareFunction( me, "kb_modify_rename_constant_retrieve_old_constant_name", "KB-MODIFY-RENAME-CONSTANT-RETRIEVE-OLD-CONSTANT-NAME", 1, 0, false );
    SubLFiles.declareFunction( me, "kb_modify_rename_constant_retrieve_constant", "KB-MODIFY-RENAME-CONSTANT-RETRIEVE-CONSTANT", 1, 0, false );
    SubLFiles.declareFunction( me, "post_kb_modify_remove_constant_event", "POST-KB-MODIFY-REMOVE-CONSTANT-EVENT", 1, 0, false );
    SubLFiles.declareFunction( me, "kb_modify_remove_constant_retrieve_constant", "KB-MODIFY-REMOVE-CONSTANT-RETRIEVE-CONSTANT", 1, 0, false );
    SubLFiles.declareFunction( me, "kb_modify_remove_constant_retrieve_external_id", "KB-MODIFY-REMOVE-CONSTANT-RETRIEVE-EXTERNAL-ID", 1, 0, false );
    SubLFiles.declareFunction( me, "post_kb_modify_create_nart_event", "POST-KB-MODIFY-CREATE-NART-EVENT", 1, 0, false );
    SubLFiles.declareFunction( me, "kb_modify_create_nart_retrieve_nart_hl_formula", "KB-MODIFY-CREATE-NART-RETRIEVE-NART-HL-FORMULA", 1, 0, false );
    SubLFiles.declareFunction( me, "post_kb_modify_remove_nart_event", "POST-KB-MODIFY-REMOVE-NART-EVENT", 1, 0, false );
    SubLFiles.declareFunction( me, "kb_modify_remove_nart_retrieve_nart_hl_formula", "KB-MODIFY-REMOVE-NART-RETRIEVE-NART-HL-FORMULA", 1, 0, false );
    SubLFiles.declareFunction( me, "post_kb_modify_create_assertion_event", "POST-KB-MODIFY-CREATE-ASSERTION-EVENT", 2, 0, false );
    SubLFiles.declareFunction( me, "about_to_post_strictly_implementation_assertionP", "ABOUT-TO-POST-STRICTLY-IMPLEMENTATION-ASSERTION?", 1, 0, false );
    SubLFiles.declareFunction( me, "about_to_post_term_of_unit_assertionP", "ABOUT-TO-POST-TERM-OF-UNIT-ASSERTION?", 1, 0, false );
    SubLFiles.declareFunction( me, "kb_modify_create_assertion_retrieve_mt", "KB-MODIFY-CREATE-ASSERTION-RETRIEVE-MT", 1, 0, false );
    SubLFiles.declareFunction( me, "kb_modify_create_assertion_retrieve_cnf", "KB-MODIFY-CREATE-ASSERTION-RETRIEVE-CNF", 1, 0, false );
    SubLFiles.declareFunction( me, "post_kb_modify_remove_assertion_event", "POST-KB-MODIFY-REMOVE-ASSERTION-EVENT", 1, 1, false );
    SubLFiles.declareFunction( me, "kb_modify_remove_assertion_retrieve_gaf", "KB-MODIFY-REMOVE-ASSERTION-RETRIEVE-GAF", 1, 0, false );
    SubLFiles.declareFunction( me, "kb_modify_remove_assertion_retrieve_mt", "KB-MODIFY-REMOVE-ASSERTION-RETRIEVE-MT", 1, 0, false );
    SubLFiles.declareFunction( me, "kb_modify_remove_assertion_retrieve_sentence", "KB-MODIFY-REMOVE-ASSERTION-RETRIEVE-SENTENCE", 1, 0, false );
    SubLFiles.declareFunction( me, "post_kb_modify_set_assertion_direction_event", "POST-KB-MODIFY-SET-ASSERTION-DIRECTION-EVENT", 3, 0, false );
    SubLFiles.declareFunction( me, "kb_modify_set_assertion_direction_retrieve_new_direction", "KB-MODIFY-SET-ASSERTION-DIRECTION-RETRIEVE-NEW-DIRECTION", 1, 0, false );
    SubLFiles.declareFunction( me, "kb_modify_set_assertion_direction_retrieve_old_direction", "KB-MODIFY-SET-ASSERTION-DIRECTION-RETRIEVE-OLD-DIRECTION", 1, 0, false );
    SubLFiles.declareFunction( me, "kb_modify_set_assertion_direction_retrieve_assertion", "KB-MODIFY-SET-ASSERTION-DIRECTION-RETRIEVE-ASSERTION", 1, 0, false );
    SubLFiles.declareFunction( me, "post_kb_modify_set_assertion_truth_event", "POST-KB-MODIFY-SET-ASSERTION-TRUTH-EVENT", 3, 0, false );
    SubLFiles.declareFunction( me, "kb_modify_set_assertion_truth_retrieve_new_truth", "KB-MODIFY-SET-ASSERTION-TRUTH-RETRIEVE-NEW-TRUTH", 1, 0, false );
    SubLFiles.declareFunction( me, "kb_modify_set_assertion_truth_retrieve_old_truth", "KB-MODIFY-SET-ASSERTION-TRUTH-RETRIEVE-OLD-TRUTH", 1, 0, false );
    SubLFiles.declareFunction( me, "kb_modify_set_assertion_truth_retrieve_assertion", "KB-MODIFY-SET-ASSERTION-TRUTH-RETRIEVE-ASSERTION", 1, 0, false );
    SubLFiles.declareFunction( me, "post_kb_modify_set_assertion_strength_event", "POST-KB-MODIFY-SET-ASSERTION-STRENGTH-EVENT", 3, 0, false );
    SubLFiles.declareFunction( me, "kb_modify_set_assertion_strength_retrieve_new_strength", "KB-MODIFY-SET-ASSERTION-STRENGTH-RETRIEVE-NEW-STRENGTH", 1, 0, false );
    SubLFiles.declareFunction( me, "kb_modify_set_assertion_strength_retrieve_old_strength", "KB-MODIFY-SET-ASSERTION-STRENGTH-RETRIEVE-OLD-STRENGTH", 1, 0, false );
    SubLFiles.declareFunction( me, "kb_modify_set_assertion_strength_retrieve_assertion", "KB-MODIFY-SET-ASSERTION-STRENGTH-RETRIEVE-ASSERTION", 1, 0, false );
    SubLFiles.declareFunction( me, "post_kb_modify_set_assertion_variable_names_event", "POST-KB-MODIFY-SET-ASSERTION-VARIABLE-NAMES-EVENT", 3, 0, false );
    SubLFiles.declareFunction( me, "kb_modify_set_assertion_variable_names_retrieve_new_var_names", "KB-MODIFY-SET-ASSERTION-VARIABLE-NAMES-RETRIEVE-NEW-VAR-NAMES", 1, 0, false );
    SubLFiles.declareFunction( me, "kb_modify_set_assertion_variable_names_retrieve_old_var_names", "KB-MODIFY-SET-ASSERTION-VARIABLE-NAMES-RETRIEVE-OLD-VAR-NAMES", 1, 0, false );
    SubLFiles.declareFunction( me, "kb_modify_set_assertion_variable_names_retrieve_assertion", "KB-MODIFY-SET-ASSERTION-VARIABLE-NAMES-RETRIEVE-ASSERTION", 1, 0, false );
    SubLFiles.declareFunction( me, "post_kb_modify_set_assertion_asserted_by_event", "POST-KB-MODIFY-SET-ASSERTION-ASSERTED-BY-EVENT", 3, 0, false );
    SubLFiles.declareFunction( me, "kb_modify_set_assertion_asserted_by_retrieve_new_asserted_by", "KB-MODIFY-SET-ASSERTION-ASSERTED-BY-RETRIEVE-NEW-ASSERTED-BY", 1, 0, false );
    SubLFiles.declareFunction( me, "kb_modify_set_assertion_asserted_by_retrieve_old_asserted_by", "KB-MODIFY-SET-ASSERTION-ASSERTED-BY-RETRIEVE-OLD-ASSERTED-BY", 1, 0, false );
    SubLFiles.declareFunction( me, "kb_modify_set_assertion_asserted_by_retrieve_assertion", "KB-MODIFY-SET-ASSERTION-ASSERTED-BY-RETRIEVE-ASSERTION", 1, 0, false );
    SubLFiles.declareFunction( me, "post_kb_modify_set_assertion_asserted_when_event", "POST-KB-MODIFY-SET-ASSERTION-ASSERTED-WHEN-EVENT", 3, 0, false );
    SubLFiles.declareFunction( me, "kb_modify_set_assertion_asserted_when_retrieve_new_asserted_when", "KB-MODIFY-SET-ASSERTION-ASSERTED-WHEN-RETRIEVE-NEW-ASSERTED-WHEN", 1, 0, false );
    SubLFiles.declareFunction( me, "kb_modify_set_assertion_asserted_when_retrieve_old_asserted_when", "KB-MODIFY-SET-ASSERTION-ASSERTED-WHEN-RETRIEVE-OLD-ASSERTED-WHEN", 1, 0, false );
    SubLFiles.declareFunction( me, "kb_modify_set_assertion_asserted_when_retrieve_assertion", "KB-MODIFY-SET-ASSERTION-ASSERTED-WHEN-RETRIEVE-ASSERTION", 1, 0, false );
    SubLFiles.declareFunction( me, "post_kb_modify_set_assertion_asserted_why_event", "POST-KB-MODIFY-SET-ASSERTION-ASSERTED-WHY-EVENT", 3, 0, false );
    SubLFiles.declareFunction( me, "kb_modify_set_assertion_asserted_why_retrieve_new_asserted_why", "KB-MODIFY-SET-ASSERTION-ASSERTED-WHY-RETRIEVE-NEW-ASSERTED-WHY", 1, 0, false );
    SubLFiles.declareFunction( me, "kb_modify_set_assertion_asserted_why_retrieve_old_asserted_why", "KB-MODIFY-SET-ASSERTION-ASSERTED-WHY-RETRIEVE-OLD-ASSERTED-WHY", 1, 0, false );
    SubLFiles.declareFunction( me, "kb_modify_set_assertion_asserted_why_retrieve_assertion", "KB-MODIFY-SET-ASSERTION-ASSERTED-WHY-RETRIEVE-ASSERTION", 1, 0, false );
    SubLFiles.declareFunction( me, "post_kb_modify_set_assertion_asserted_second_event", "POST-KB-MODIFY-SET-ASSERTION-ASSERTED-SECOND-EVENT", 3, 0, false );
    SubLFiles.declareFunction( me, "kb_modify_set_assertion_asserted_second_retrieve_new_asserted_second", "KB-MODIFY-SET-ASSERTION-ASSERTED-SECOND-RETRIEVE-NEW-ASSERTED-SECOND", 1, 0, false );
    SubLFiles.declareFunction( me, "kb_modify_set_assertion_asserted_second_retrieve_old_asserted_second", "KB-MODIFY-SET-ASSERTION-ASSERTED-SECOND-RETRIEVE-OLD-ASSERTED-SECOND", 1, 0, false );
    SubLFiles.declareFunction( me, "kb_modify_set_assertion_asserted_second_retrieve_assertion", "KB-MODIFY-SET-ASSERTION-ASSERTED-SECOND-RETRIEVE-ASSERTION", 1, 0, false );
    SubLFiles.declareFunction( me, "post_kb_modify_create_asserted_argument", "POST-KB-MODIFY-CREATE-ASSERTED-ARGUMENT", 3, 0, false );
    SubLFiles.declareFunction( me, "kb_modify_create_asserted_argument_retrieve_strength", "KB-MODIFY-CREATE-ASSERTED-ARGUMENT-RETRIEVE-STRENGTH", 1, 0, false );
    SubLFiles.declareFunction( me, "kb_modify_create_asserted_argument_retrieve_truth", "KB-MODIFY-CREATE-ASSERTED-ARGUMENT-RETRIEVE-TRUTH", 1, 0, false );
    SubLFiles.declareFunction( me, "kb_modify_create_asserted_argument_retrieve_assertion", "KB-MODIFY-CREATE-ASSERTED-ARGUMENT-RETRIEVE-ASSERTION", 1, 0, false );
    SubLFiles.declareFunction( me, "post_kb_modify_remove_asserted_argument", "POST-KB-MODIFY-REMOVE-ASSERTED-ARGUMENT", 2, 0, false );
    SubLFiles.declareFunction( me, "kb_modify_remove_asserted_argument_retrieve_asserted_argument", "KB-MODIFY-REMOVE-ASSERTED-ARGUMENT-RETRIEVE-ASSERTED-ARGUMENT", 1, 0, false );
    SubLFiles.declareFunction( me, "kb_modify_remove_asserted_argument_retrieve_assertion", "KB-MODIFY-REMOVE-ASSERTED-ARGUMENT-RETRIEVE-ASSERTION", 1, 0, false );
    SubLFiles.declareFunction( me, "post_kb_modify_create_new_deduction_event", "POST-KB-MODIFY-CREATE-NEW-DEDUCTION-EVENT", 4, 2, false );
    SubLFiles.declareFunction( me, "kb_modify_create_new_deduction_retrieve_truth", "KB-MODIFY-CREATE-NEW-DEDUCTION-RETRIEVE-TRUTH", 1, 0, false );
    SubLFiles.declareFunction( me, "kb_modify_create_new_deduction_retrieve_supports", "KB-MODIFY-CREATE-NEW-DEDUCTION-RETRIEVE-SUPPORTS", 1, 0, false );
    SubLFiles.declareFunction( me, "kb_modify_create_new_deduction_retrieve_assertion", "KB-MODIFY-CREATE-NEW-DEDUCTION-RETRIEVE-ASSERTION", 1, 0, false );
    SubLFiles.declareFunction( me, "post_kb_modify_remove_deduction_event", "POST-KB-MODIFY-REMOVE-DEDUCTION-EVENT", 1, 0, false );
    SubLFiles.declareFunction( me, "kb_modify_remove_deduction_retrieve_deduction", "KB-MODIFY-REMOVE-DEDUCTION-RETRIEVE-DEDUCTION", 1, 0, false );
    SubLFiles.declareFunction( me, "post_kb_modify_set_deduction_strength_event", "POST-KB-MODIFY-SET-DEDUCTION-STRENGTH-EVENT", 3, 0, false );
    SubLFiles.declareFunction( me, "kb_modify_set_deduction_strength_retrieve_new_strength", "KB-MODIFY-SET-DEDUCTION-STRENGTH-RETRIEVE-NEW-STRENGTH", 1, 0, false );
    SubLFiles.declareFunction( me, "kb_modify_set_deduction_strength_retrieve_old_strength", "KB-MODIFY-SET-DEDUCTION-STRENGTH-RETRIEVE-OLD-STRENGTH", 1, 0, false );
    SubLFiles.declareFunction( me, "kb_modify_set_deduction_strength_retrieve_deduction", "KB-MODIFY-SET-DEDUCTION-STRENGTH-RETRIEVE-DEDUCTION", 1, 0, false );
    SubLFiles.declareFunction( me, "post_kb_modify_create_new_kb_hl_support_event", "POST-KB-MODIFY-CREATE-NEW-KB-HL-SUPPORT-EVENT", 2, 0, false );
    SubLFiles.declareFunction( me, "kb_modify_create_new_kb_hl_support_retrieve_justification", "KB-MODIFY-CREATE-NEW-KB-HL-SUPPORT-RETRIEVE-JUSTIFICATION", 1, 0, false );
    SubLFiles.declareFunction( me, "kb_modify_create_new_kb_hl_support_retrieve_hl_support", "KB-MODIFY-CREATE-NEW-KB-HL-SUPPORT-RETRIEVE-HL-SUPPORT", 1, 0, false );
    SubLFiles.declareFunction( me, "post_kb_modify_remove_kb_hl_support_event", "POST-KB-MODIFY-REMOVE-KB-HL-SUPPORT-EVENT", 1, 0, false );
    SubLFiles.declareFunction( me, "kb_modify_remove_kb_hl_support_retrieve_kb_hl_support", "KB-MODIFY-REMOVE-KB-HL-SUPPORT-RETRIEVE-KB-HL-SUPPORT", 1, 0, false );
    SubLFiles.declareFunction( me, "post_kb_modify_irrelevance_event", "POST-KB-MODIFY-IRRELEVANCE-EVENT", 2, 0, false );
    SubLFiles.declareFunction( me, "kb_modify_irrelevance_retrieve_assertion", "KB-MODIFY-IRRELEVANCE-RETRIEVE-ASSERTION", 1, 0, false );
    SubLFiles.declareFunction( me, "kb_modify_irrelevance_retrieve_term", "KB-MODIFY-IRRELEVANCE-RETRIEVE-TERM", 1, 0, false );
    SubLFiles.declareFunction( me, "post_new_kb_modify_event", "POST-NEW-KB-MODIFY-EVENT", 2, 0, false );
    SubLFiles.declareFunction( me, "new_kb_modify_event", "NEW-KB-MODIFY-EVENT", 2, 0, false );
    SubLFiles.declareFunction( me, "post_kb_modify_event", "POST-KB-MODIFY-EVENT", 1, 0, false );
    SubLFiles.declareFunction( me, "current_kb_modification_event_broker", "CURRENT-KB-MODIFICATION-EVENT-BROKER", 0, 0, false );
    SubLFiles.declareFunction( me, "anyone_interested_in_kb_modification_eventP", "ANYONE-INTERESTED-IN-KB-MODIFICATION-EVENT?", 1, 0, false );
    SubLFiles.declareFunction( me, "kb_modifications_event_dispatcher_runningP", "KB-MODIFICATIONS-EVENT-DISPATCHER-RUNNING?", 0, 0, false );
    SubLFiles.declareFunction( me, "ensure_kb_modifications_event_dispatcher_running", "ENSURE-KB-MODIFICATIONS-EVENT-DISPATCHER-RUNNING", 0, 0, false );
    SubLFiles.declareFunction( me, "register_listener_with_kb_modifications_event_dispatcher", "REGISTER-LISTENER-WITH-KB-MODIFICATIONS-EVENT-DISPATCHER", 1, 0, false );
    SubLFiles.declareFunction( me, "deregister_listener_with_kb_modifications_event_dispatcher", "DEREGISTER-LISTENER-WITH-KB-MODIFICATIONS-EVENT-DISPATCHER", 1, 0, false );
    SubLFiles.declareFunction( me, "stop_kb_modifications_event_dispatcher", "STOP-KB-MODIFICATIONS-EVENT-DISPATCHER", 0, 0, false );
    SubLFiles.declareFunction( me, "start_kb_modifications_event_dispatcher", "START-KB-MODIFICATIONS-EVENT-DISPATCHER", 0, 0, false );
    return NIL;
  }

  public static SubLObject init_kb_modification_event_file()
  {
    $kb_modifications_event_dispatcher_lock$ = SubLFiles.deflexical( "*KB-MODIFICATIONS-EVENT-DISPATCHER-LOCK*", Locks.make_lock( $str84$KB_MODIFICATIONS_EVENT_DISPATCHER ) );
    $kb_modifications_event_dispatcher_listeners$ = SubLFiles.deflexical( "*KB-MODIFICATIONS-EVENT-DISPATCHER-LISTENERS*", ( maybeDefault( $sym85$_KB_MODIFICATIONS_EVENT_DISPATCHER_LISTENERS_,
        $kb_modifications_event_dispatcher_listeners$, NIL ) ) );
    return NIL;
  }

  public static SubLObject setup_kb_modification_event_file()
  {
    event_model.register_event_class( $kw0$KB_MODIFICATION_EVENT, $kw1$KB_STORE_EVENT, NIL );
    kb_modification_event_support.note_kb_modification_event_class_properties( $kw0$KB_MODIFICATION_EVENT, NIL );
    event_model.register_event_class( $kw2$KB_MODIFY_CREATE_CONSTANT, $kw0$KB_MODIFICATION_EVENT, NIL );
    kb_modification_event_support.note_kb_modification_event_class_properties( $kw2$KB_MODIFY_CREATE_CONSTANT, $list3 );
    event_model.register_event_class( $kw4$KB_MODIFY_REMOVE_CONSTANT, $kw0$KB_MODIFICATION_EVENT, NIL );
    kb_modification_event_support.note_kb_modification_event_class_properties( $kw4$KB_MODIFY_REMOVE_CONSTANT, $list5 );
    event_model.register_event_class( $kw6$KB_MODIFY_RENAME_CONSTANT, $kw0$KB_MODIFICATION_EVENT, NIL );
    kb_modification_event_support.note_kb_modification_event_class_properties( $kw6$KB_MODIFY_RENAME_CONSTANT, $list7 );
    event_model.register_event_class( $kw8$KB_MODIFY_CREATE_NART, $kw0$KB_MODIFICATION_EVENT, NIL );
    kb_modification_event_support.note_kb_modification_event_class_properties( $kw8$KB_MODIFY_CREATE_NART, $list9 );
    event_model.register_event_class( $kw10$KB_MODIFY_REMOVE_NART, $kw0$KB_MODIFICATION_EVENT, NIL );
    kb_modification_event_support.note_kb_modification_event_class_properties( $kw10$KB_MODIFY_REMOVE_NART, $list11 );
    event_model.register_event_class( $kw12$KB_MODIFY_CREATE_ASSERTION, $kw0$KB_MODIFICATION_EVENT, NIL );
    kb_modification_event_support.note_kb_modification_event_class_properties( $kw12$KB_MODIFY_CREATE_ASSERTION, $list13 );
    event_model.register_event_class( $kw14$KB_MODIFY_REMOVE_ASSERTION, $kw0$KB_MODIFICATION_EVENT, NIL );
    kb_modification_event_support.note_kb_modification_event_class_properties( $kw14$KB_MODIFY_REMOVE_ASSERTION, $list15 );
    event_model.register_event_class( $kw16$KB_MODIFY_SET_ASSERTION_DIRECTION, $kw0$KB_MODIFICATION_EVENT, NIL );
    kb_modification_event_support.note_kb_modification_event_class_properties( $kw16$KB_MODIFY_SET_ASSERTION_DIRECTION, $list17 );
    event_model.register_event_class( $kw18$KB_MODIFY_SET_ASSERTION_STRENGTH, $kw0$KB_MODIFICATION_EVENT, NIL );
    kb_modification_event_support.note_kb_modification_event_class_properties( $kw18$KB_MODIFY_SET_ASSERTION_STRENGTH, $list17 );
    event_model.register_event_class( $kw19$KB_MODIFY_SET_ASSERTION_TRUTH, $kw0$KB_MODIFICATION_EVENT, NIL );
    kb_modification_event_support.note_kb_modification_event_class_properties( $kw19$KB_MODIFY_SET_ASSERTION_TRUTH, $list17 );
    event_model.register_event_class( $kw20$KB_MODIFY_SET_ASSERTION_VARIABLE_NAMES, $kw0$KB_MODIFICATION_EVENT, NIL );
    kb_modification_event_support.note_kb_modification_event_class_properties( $kw20$KB_MODIFY_SET_ASSERTION_VARIABLE_NAMES, $list21 );
    event_model.register_event_class( $kw22$KB_MODIFY_SET_ASSERTION_ASSERTED_BY, $kw0$KB_MODIFICATION_EVENT, NIL );
    kb_modification_event_support.note_kb_modification_event_class_properties( $kw22$KB_MODIFY_SET_ASSERTION_ASSERTED_BY, $list21 );
    event_model.register_event_class( $kw23$KB_MODIFY_SET_ASSERTION_ASSERTED_WHY, $kw0$KB_MODIFICATION_EVENT, NIL );
    kb_modification_event_support.note_kb_modification_event_class_properties( $kw23$KB_MODIFY_SET_ASSERTION_ASSERTED_WHY, $list21 );
    event_model.register_event_class( $kw24$KB_MODIFY_SET_ASSERTION_ASSERTED_WHEN, $kw0$KB_MODIFICATION_EVENT, NIL );
    kb_modification_event_support.note_kb_modification_event_class_properties( $kw24$KB_MODIFY_SET_ASSERTION_ASSERTED_WHEN, $list21 );
    event_model.register_event_class( $kw25$KB_MODIFY_SET_ASSERTION_ASSERTED_SECOND, $kw0$KB_MODIFICATION_EVENT, NIL );
    kb_modification_event_support.note_kb_modification_event_class_properties( $kw25$KB_MODIFY_SET_ASSERTION_ASSERTED_SECOND, $list21 );
    event_model.register_event_class( $kw26$KB_MODIFY_CREATE_ASSERTED_ARGUMENT, $kw0$KB_MODIFICATION_EVENT, NIL );
    kb_modification_event_support.note_kb_modification_event_class_properties( $kw26$KB_MODIFY_CREATE_ASSERTED_ARGUMENT, $list27 );
    event_model.register_event_class( $kw28$KB_MODIFY_REMOVE_ASSERTED_ARGUMENT, $kw0$KB_MODIFICATION_EVENT, NIL );
    kb_modification_event_support.note_kb_modification_event_class_properties( $kw28$KB_MODIFY_REMOVE_ASSERTED_ARGUMENT, $list29 );
    event_model.register_event_class( $kw30$KB_MODIFY_CREATE_NEW_DEDUCTION, $kw0$KB_MODIFICATION_EVENT, NIL );
    kb_modification_event_support.note_kb_modification_event_class_properties( $kw30$KB_MODIFY_CREATE_NEW_DEDUCTION, $list31 );
    event_model.register_event_class( $kw32$KB_MODIFY_REMOVE_DEDUCTION, $kw0$KB_MODIFICATION_EVENT, NIL );
    kb_modification_event_support.note_kb_modification_event_class_properties( $kw32$KB_MODIFY_REMOVE_DEDUCTION, $list33 );
    event_model.register_event_class( $kw34$KB_MODIFY_SET_DEDUCTION_STRENGTH, $kw0$KB_MODIFICATION_EVENT, NIL );
    kb_modification_event_support.note_kb_modification_event_class_properties( $kw34$KB_MODIFY_SET_DEDUCTION_STRENGTH, $list35 );
    event_model.register_event_class( $kw36$KB_MODIFY_CREATE_NEW_KB_HL_SUPPORT, $kw0$KB_MODIFICATION_EVENT, NIL );
    kb_modification_event_support.note_kb_modification_event_class_properties( $kw36$KB_MODIFY_CREATE_NEW_KB_HL_SUPPORT, $list37 );
    event_model.register_event_class( $kw38$KB_MODIFY_REMOVE_KB_HL_SUPPORT, $kw0$KB_MODIFICATION_EVENT, NIL );
    kb_modification_event_support.note_kb_modification_event_class_properties( $kw38$KB_MODIFY_REMOVE_KB_HL_SUPPORT, $list39 );
    event_model.register_event_class( $kw40$KB_MODIFY_IRRELEVANCE, $kw0$KB_MODIFICATION_EVENT, NIL );
    kb_modification_event_support.note_kb_modification_event_class_properties( $kw40$KB_MODIFY_IRRELEVANCE, $list41 );
    subl_macro_promotions.declare_defglobal( $sym85$_KB_MODIFICATIONS_EVENT_DISPATCHER_LISTENERS_ );
    sunit_external.define_test_category( $str86$KB_Modification_Event, UNPROVIDED );
    sunit_external.define_test_suite( $str87$KB_Modification_Event_Test_Suite, ConsesLow.list( $str86$KB_Modification_Event ), UNPROVIDED, UNPROVIDED );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_kb_modification_event_file();
  }

  @Override
  public void initializeVariables()
  {
    init_kb_modification_event_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_kb_modification_event_file();
  }
  static
  {
    me = new kb_modification_event();
    $kb_modifications_event_dispatcher_lock$ = null;
    $kb_modifications_event_dispatcher_listeners$ = null;
    $kw0$KB_MODIFICATION_EVENT = makeKeyword( "KB-MODIFICATION-EVENT" );
    $kw1$KB_STORE_EVENT = makeKeyword( "KB-STORE-EVENT" );
    $kw2$KB_MODIFY_CREATE_CONSTANT = makeKeyword( "KB-MODIFY-CREATE-CONSTANT" );
    $list3 = ConsesLow.list( makeKeyword( "EXISTENCE" ), makeKeyword( "CREATION" ), makeKeyword( "FORT" ), makeKeyword( "CONSTANT" ) );
    $kw4$KB_MODIFY_REMOVE_CONSTANT = makeKeyword( "KB-MODIFY-REMOVE-CONSTANT" );
    $list5 = ConsesLow.list( makeKeyword( "EXISTENCE" ), makeKeyword( "REMOVAL" ), makeKeyword( "FORT" ), makeKeyword( "CONSTANT" ) );
    $kw6$KB_MODIFY_RENAME_CONSTANT = makeKeyword( "KB-MODIFY-RENAME-CONSTANT" );
    $list7 = ConsesLow.list( makeKeyword( "PROPERTY-CHANGE" ), makeKeyword( "FORT" ), makeKeyword( "CONSTANT" ) );
    $kw8$KB_MODIFY_CREATE_NART = makeKeyword( "KB-MODIFY-CREATE-NART" );
    $list9 = ConsesLow.list( makeKeyword( "EXISTENCE" ), makeKeyword( "CREATION" ), makeKeyword( "FORT" ), makeKeyword( "NART" ) );
    $kw10$KB_MODIFY_REMOVE_NART = makeKeyword( "KB-MODIFY-REMOVE-NART" );
    $list11 = ConsesLow.list( makeKeyword( "EXISTENCE" ), makeKeyword( "REMOVAL" ), makeKeyword( "FORT" ), makeKeyword( "NART" ) );
    $kw12$KB_MODIFY_CREATE_ASSERTION = makeKeyword( "KB-MODIFY-CREATE-ASSERTION" );
    $list13 = ConsesLow.list( makeKeyword( "EXISTENCE" ), makeKeyword( "CREATION" ), makeKeyword( "ASSERTION" ) );
    $kw14$KB_MODIFY_REMOVE_ASSERTION = makeKeyword( "KB-MODIFY-REMOVE-ASSERTION" );
    $list15 = ConsesLow.list( makeKeyword( "EXISTENCE" ), makeKeyword( "REMOVAL" ), makeKeyword( "ASSERTION" ) );
    $kw16$KB_MODIFY_SET_ASSERTION_DIRECTION = makeKeyword( "KB-MODIFY-SET-ASSERTION-DIRECTION" );
    $list17 = ConsesLow.list( makeKeyword( "ASSERTION" ), makeKeyword( "PROPERTY-CHANGE" ) );
    $kw18$KB_MODIFY_SET_ASSERTION_STRENGTH = makeKeyword( "KB-MODIFY-SET-ASSERTION-STRENGTH" );
    $kw19$KB_MODIFY_SET_ASSERTION_TRUTH = makeKeyword( "KB-MODIFY-SET-ASSERTION-TRUTH" );
    $kw20$KB_MODIFY_SET_ASSERTION_VARIABLE_NAMES = makeKeyword( "KB-MODIFY-SET-ASSERTION-VARIABLE-NAMES" );
    $list21 = ConsesLow.list( makeKeyword( "ASSERTION" ), makeKeyword( "META-PROPERTY-CHANGE" ) );
    $kw22$KB_MODIFY_SET_ASSERTION_ASSERTED_BY = makeKeyword( "KB-MODIFY-SET-ASSERTION-ASSERTED-BY" );
    $kw23$KB_MODIFY_SET_ASSERTION_ASSERTED_WHY = makeKeyword( "KB-MODIFY-SET-ASSERTION-ASSERTED-WHY" );
    $kw24$KB_MODIFY_SET_ASSERTION_ASSERTED_WHEN = makeKeyword( "KB-MODIFY-SET-ASSERTION-ASSERTED-WHEN" );
    $kw25$KB_MODIFY_SET_ASSERTION_ASSERTED_SECOND = makeKeyword( "KB-MODIFY-SET-ASSERTION-ASSERTED-SECOND" );
    $kw26$KB_MODIFY_CREATE_ASSERTED_ARGUMENT = makeKeyword( "KB-MODIFY-CREATE-ASSERTED-ARGUMENT" );
    $list27 = ConsesLow.list( makeKeyword( "ASSERTED-ARGUMENT" ), makeKeyword( "CREATION" ), makeKeyword( "EXISTENCE" ) );
    $kw28$KB_MODIFY_REMOVE_ASSERTED_ARGUMENT = makeKeyword( "KB-MODIFY-REMOVE-ASSERTED-ARGUMENT" );
    $list29 = ConsesLow.list( makeKeyword( "ASSERTED-ARGUMENT" ), makeKeyword( "REMOVAL" ), makeKeyword( "EXISTENCE" ) );
    $kw30$KB_MODIFY_CREATE_NEW_DEDUCTION = makeKeyword( "KB-MODIFY-CREATE-NEW-DEDUCTION" );
    $list31 = ConsesLow.list( makeKeyword( "DEDUCTION" ), makeKeyword( "CREATION" ), makeKeyword( "EXISTENCE" ) );
    $kw32$KB_MODIFY_REMOVE_DEDUCTION = makeKeyword( "KB-MODIFY-REMOVE-DEDUCTION" );
    $list33 = ConsesLow.list( makeKeyword( "DEDUCTION" ), makeKeyword( "REMOVAL" ), makeKeyword( "EXISTENCE" ) );
    $kw34$KB_MODIFY_SET_DEDUCTION_STRENGTH = makeKeyword( "KB-MODIFY-SET-DEDUCTION-STRENGTH" );
    $list35 = ConsesLow.list( makeKeyword( "DEDUCTION" ), makeKeyword( "PROPERTY-CHANGE" ) );
    $kw36$KB_MODIFY_CREATE_NEW_KB_HL_SUPPORT = makeKeyword( "KB-MODIFY-CREATE-NEW-KB-HL-SUPPORT" );
    $list37 = ConsesLow.list( makeKeyword( "KB-HL-SUPPORT" ), makeKeyword( "CREATION" ), makeKeyword( "EXISTENCE" ) );
    $kw38$KB_MODIFY_REMOVE_KB_HL_SUPPORT = makeKeyword( "KB-MODIFY-REMOVE-KB-HL-SUPPORT" );
    $list39 = ConsesLow.list( makeKeyword( "KB-HL-SUPPORT" ), makeKeyword( "REMOVAL" ), makeKeyword( "EXISTENCE" ) );
    $kw40$KB_MODIFY_IRRELEVANCE = makeKeyword( "KB-MODIFY-IRRELEVANCE" );
    $list41 = ConsesLow.list( makeKeyword( "TERM" ), makeKeyword( "ASSERTION" ) );
    $kw42$NAME = makeKeyword( "NAME" );
    $kw43$EXTERNAL_ID = makeKeyword( "EXTERNAL-ID" );
    $sym44$EVENT_P = makeSymbol( "EVENT-P" );
    $str45$Event__S_is_of_type__S__not__S_ = makeString( "Event ~S is of type ~S, not ~S." );
    $kw46$CONSTANT = makeKeyword( "CONSTANT" );
    $kw47$OLD_CONSTANT_NAME = makeKeyword( "OLD-CONSTANT-NAME" );
    $kw48$NEW_CONSTANT_NAME = makeKeyword( "NEW-CONSTANT-NAME" );
    $kw49$NART_HL_FORMULA = makeKeyword( "NART-HL-FORMULA" );
    $kw50$CNF = makeKeyword( "CNF" );
    $kw51$MT = makeKeyword( "MT" );
    $const52$termOfUnit = constant_handles.reader_make_constant_shell( makeString( "termOfUnit" ) );
    $kw53$TRUE = makeKeyword( "TRUE" );
    $kw54$SENTENCE = makeKeyword( "SENTENCE" );
    $kw55$GAF = makeKeyword( "GAF" );
    $kw56$ASSERTION = makeKeyword( "ASSERTION" );
    $kw57$OLD_DIRECTION = makeKeyword( "OLD-DIRECTION" );
    $kw58$NEW_DIRECTION = makeKeyword( "NEW-DIRECTION" );
    $kw59$OLD_TRUTH = makeKeyword( "OLD-TRUTH" );
    $kw60$NEW_TRUTH = makeKeyword( "NEW-TRUTH" );
    $kw61$OLD_STRENGTH = makeKeyword( "OLD-STRENGTH" );
    $kw62$NEW_STRENGTH = makeKeyword( "NEW-STRENGTH" );
    $kw63$OLD_VAR_NAMES = makeKeyword( "OLD-VAR-NAMES" );
    $kw64$NEW_VAR_NAMES = makeKeyword( "NEW-VAR-NAMES" );
    $kw65$OLD_ASSERTED_BY = makeKeyword( "OLD-ASSERTED-BY" );
    $kw66$NEW_ASSERTED_BY = makeKeyword( "NEW-ASSERTED-BY" );
    $kw67$OLD_ASSERTED_WHEN = makeKeyword( "OLD-ASSERTED-WHEN" );
    $kw68$NEW_ASSERTED_WHEN = makeKeyword( "NEW-ASSERTED-WHEN" );
    $kw69$OLD_ASSERTED_WHY = makeKeyword( "OLD-ASSERTED-WHY" );
    $kw70$NEW_ASSERTED_WHY = makeKeyword( "NEW-ASSERTED-WHY" );
    $kw71$OLD_ASSERTED_SECOND = makeKeyword( "OLD-ASSERTED-SECOND" );
    $kw72$NEW_ASSERTED_SECOND = makeKeyword( "NEW-ASSERTED-SECOND" );
    $kw73$TRUTH = makeKeyword( "TRUTH" );
    $kw74$STRENGTH = makeKeyword( "STRENGTH" );
    $kw75$ASSERTED_ARGUMENT = makeKeyword( "ASSERTED-ARGUMENT" );
    $kw76$SUPPORTS = makeKeyword( "SUPPORTS" );
    $kw77$BINDINGS = makeKeyword( "BINDINGS" );
    $kw78$PRAGMATIC_SUPPORT_MTS = makeKeyword( "PRAGMATIC-SUPPORT-MTS" );
    $kw79$DEDUCTION = makeKeyword( "DEDUCTION" );
    $kw80$HL_SUPPORT = makeKeyword( "HL-SUPPORT" );
    $kw81$JUSTIFICATION = makeKeyword( "JUSTIFICATION" );
    $kw82$KB_HL_SUPPORT = makeKeyword( "KB-HL-SUPPORT" );
    $kw83$TERM = makeKeyword( "TERM" );
    $str84$KB_MODIFICATIONS_EVENT_DISPATCHER = makeString( "KB-MODIFICATIONS-EVENT-DISPATCHER Lock" );
    $sym85$_KB_MODIFICATIONS_EVENT_DISPATCHER_LISTENERS_ = makeSymbol( "*KB-MODIFICATIONS-EVENT-DISPATCHER-LISTENERS*" );
    $str86$KB_Modification_Event = makeString( "KB Modification Event" );
    $str87$KB_Modification_Event_Test_Suite = makeString( "KB Modification Event Test Suite" );
  }
}
/*
 * 
 * Total time: 322 ms
 * 
 */