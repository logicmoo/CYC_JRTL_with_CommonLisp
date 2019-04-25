package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.random;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class constant_completion_high
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.constant_completion_high";
  public static final String myFingerPrint = "01d102641265db1a0c59048ec1c0f1f2bd9ac2c3e4867cb66af5c31d5c07f569";
  @SubLTranslatedFile.SubL(source = "cycl/constant-completion-high.lisp", position = 2607L)
  public static SubLSymbol $require_case_insensitive_name_uniqueness$;
  @SubLTranslatedFile.SubL(source = "cycl/constant-completion-high.lisp", position = 4382L)
  private static SubLSymbol $last_known_index_for_constant_prefix_dict$;
  private static final SubLSymbol $sym0$CHARACTERP;
  private static final SubLSymbol $sym1$VALID_CONSTANT_NAME_CHAR;
  private static final SubLList $list2;
  private static final SubLList $list3;
  private static final SubLString $str4$Deprecated_in_favor_of_valid_cons;
  private static final SubLList $list5;
  private static final SubLList $list6;
  private static final SubLString $str7$___;
  private static final SubLSymbol $sym8$VALID_CONSTANT_NAME_CHAR_P;
  private static final SubLString $str9$Return_T_iff_CHAR_is_a_character_;
  private static final SubLSymbol $sym10$VALID_CONSTANT_NAME;
  private static final SubLList $list11;
  private static final SubLList $list12;
  private static final SubLString $str13$Deprecated_in_favor_of_valid_cons;
  private static final SubLSymbol $sym14$INVALID_CONSTANT_NAME_CHAR_P;
  private static final SubLSymbol $sym15$VALID_CONSTANT_NAME_P;
  private static final SubLString $str16$Return_T_iff_STRING_is_a_valid_na;
  private static final SubLSymbol $kw17$UNNAMED;
  private static final SubLSymbol $sym18$STRINGP;
  private static final SubLSymbol $sym19$CONSTANT_NAME_AVAILABLE;
  private static final SubLList $list20;
  private static final SubLString $str21$Return_T_iff_NAME_is_a_valid_cons;
  private static final SubLList $list22;
  private static final SubLSymbol $sym23$BOOLEANP;
  private static final SubLString $str24$_;
  private static final SubLSymbol $sym25$UNIQUIFY_CONSTANT_NAME;
  private static final SubLList $list26;
  private static final SubLString $str27$Return_a_unique__currently_unused;
  private static final SubLList $list28;
  private static final SubLList $list29;
  private static final SubLSymbol $sym30$CONSTANT_NAME;
  private static final SubLSymbol $sym31$CONSTANT_NAME_CASE_COLLISIONS;
  private static final SubLString $str32$Return_a_list_of_constants_whose_;
  private static final SubLList $list33;
  private static final SubLList $list34;
  private static final SubLSymbol $sym35$CONSTANT_NAME_CASE_COLLISION;
  private static final SubLString $str36$Return_a_constant_whose_name_diff;
  private static final SubLList $list37;
  private static final SubLSymbol $sym38$FIXNUMP;
  private static final SubLSymbol $sym39$CONSTANT_COMPLETE_EXACT;
  private static final SubLList $list40;
  private static final SubLString $str41$Return_a_valid_constant_whose_nam;
  private static final SubLList $list42;
  private static final SubLSymbol $sym43$CONSTANT_COMPLETE;
  private static final SubLList $list44;
  private static final SubLString $str45$Return_all_valid_constants_with_P;
  private static final SubLList $list46;
  private static final SubLSymbol $sym47$CONSTANT_APROPOS;
  private static final SubLList $list48;
  private static final SubLString $str49$Return_all_valid_constants_with_S;
  private static final SubLList $list50;
  private static final SubLSymbol $sym51$CONSTANT_POSTFIX;
  private static final SubLList $list52;
  private static final SubLString $str53$Return_all_valid_constants_with_P;
  private static final SubLList $list54;
  private static final SubLList $list55;
  private static final SubLList $list56;
  private static final SubLSymbol $kw57$ALLOW_OTHER_KEYS;
  private static final SubLSymbol $kw58$DONE;
  private static final SubLSymbol $kw59$FORWARD;
  private static final SubLSymbol $sym60$ITERATOR;
  private static final SubLSymbol $sym61$CLET;
  private static final SubLSymbol $sym62$NEW_CONSTANT_COMPLETION_ITERATOR;
  private static final SubLSymbol $sym63$DO_ITERATOR;
  private static final SubLSymbol $sym64$ITERATION_FINALIZE;
  private static final SubLList $list65;
  private static final SubLList $list66;
  private static final SubLSymbol $kw67$CASE_SENSITIVE;
  private static final SubLSymbol $kw68$START;
  private static final SubLSymbol $kw69$END;
  private static final SubLSymbol $sym70$ITERATOR;
  private static final SubLSymbol $sym71$NEW_DIRECTED_CONSTANT_COMPLETION_ITERATOR;

  @SubLTranslatedFile.SubL(source = "cycl/constant-completion-high.lisp", position = 849L)
  public static SubLObject valid_constant_name_char(final SubLObject v_char)
  {
    enforceType( v_char, $sym0$CHARACTERP );
    return valid_constant_name_char_p( v_char );
  }

  @SubLTranslatedFile.SubL(source = "cycl/constant-completion-high.lisp", position = 1323L)
  public static SubLObject valid_constant_name_char_p(final SubLObject v_char)
  {
    enforceType( v_char, $sym0$CHARACTERP );
    return makeBoolean( ( NIL != Characters.alphanumericp( v_char ) && NIL != unicode_strings.ascii_char_p( v_char ) ) || NIL != Sequences.find( v_char, $str7$___, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/constant-completion-high.lisp", position = 1662L)
  public static SubLObject valid_constant_name(final SubLObject string)
  {
    return valid_constant_name_p( string );
  }

  @SubLTranslatedFile.SubL(source = "cycl/constant-completion-high.lisp", position = 1927L)
  public static SubLObject valid_constant_name_p(final SubLObject string)
  {
    return makeBoolean( string.isString() && Sequences.length( string ).numGE( TWO_INTEGER ) && NIL == Sequences.find_if( Symbols.symbol_function( $sym14$INVALID_CONSTANT_NAME_CHAR_P ), string, UNPROVIDED, UNPROVIDED,
        UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/constant-completion-high.lisp", position = 2179L)
  public static SubLObject invalid_constant_name_char_p(final SubLObject v_char)
  {
    return makeBoolean( NIL == valid_constant_name_char_p( v_char ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/constant-completion-high.lisp", position = 2365L)
  public static SubLObject constant_name_spec_p(final SubLObject v_object)
  {
    return makeBoolean( $kw17$UNNAMED == v_object || NIL != valid_constant_name_p( v_object ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/constant-completion-high.lisp", position = 2860L)
  public static SubLObject constant_name_available(final SubLObject name)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    enforceType( name, $sym18$STRINGP );
    if( NIL == valid_constant_name_p( name ) )
    {
      return NIL;
    }
    if( NIL != $require_case_insensitive_name_uniqueness$.getDynamicValue( thread ) )
    {
      return Types.sublisp_null( constant_complete( name, NIL, T, UNPROVIDED, UNPROVIDED ) );
    }
    return Types.sublisp_null( constant_complete_exact( name, UNPROVIDED, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/constant-completion-high.lisp", position = 3266L)
  public static SubLObject uniquify_constant_name(final SubLObject name, SubLObject sequentialP)
  {
    if( sequentialP == UNPROVIDED )
    {
      sequentialP = NIL;
    }
    enforceType( name, $sym15$VALID_CONSTANT_NAME_P );
    enforceType( sequentialP, $sym23$BOOLEANP );
    if( NIL != constant_name_available( name ) )
    {
      return name;
    }
    if( NIL != sequentialP )
    {
      final SubLObject known_previous_index = get_last_known_index_for_constant_prefix( name );
      SubLObject index = NIL;
      index = known_previous_index;
      SubLObject new_name;
      while ( true)
      {
        new_name = Sequences.cconcatenate( format_nil.format_nil_a_no_copy( name ), new SubLObject[] { $str24$_, format_nil.format_nil_a_no_copy( index )
        } );
        if( NIL != constant_name_available( new_name ) )
        {
          break;
        }
        index = number_utilities.f_1X( index );
      }
      set_last_known_index_for_constant_prefix( name, index );
      return new_name;
    }
    SubLObject suffix;
    SubLObject new_name2;
    for( suffix = number_utilities.f_1X( random.random( NINE_INTEGER ) ), new_name2 = Sequences.cconcatenate( format_nil.format_nil_a_no_copy( name ), new SubLObject[] { $str24$_, format_nil.format_nil_a_no_copy(
        suffix )
    } ); NIL == constant_name_available( new_name2 ); new_name2 = Sequences.cconcatenate( format_nil.format_nil_a_no_copy( name ), new SubLObject[] { $str24$_, format_nil.format_nil_a_no_copy( suffix )
    } ) )
    {
      suffix = Numbers.add( Numbers.multiply( TEN_INTEGER, suffix ), random.random( TEN_INTEGER ) );
    }
    return new_name2;
  }

  @SubLTranslatedFile.SubL(source = "cycl/constant-completion-high.lisp", position = 4475L)
  public static SubLObject get_last_known_index_for_constant_prefix(final SubLObject prefix)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return dictionary.dictionary_lookup( $last_known_index_for_constant_prefix_dict$.getDynamicValue( thread ), prefix, ONE_INTEGER );
  }

  @SubLTranslatedFile.SubL(source = "cycl/constant-completion-high.lisp", position = 4623L)
  public static SubLObject set_last_known_index_for_constant_prefix(final SubLObject prefix, final SubLObject value)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return dictionary.dictionary_enter( $last_known_index_for_constant_prefix_dict$.getDynamicValue( thread ), prefix, value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/constant-completion-high.lisp", position = 4780L)
  public static SubLObject constant_name_case_collisions(final SubLObject string)
  {
    enforceType( string, $sym15$VALID_CONSTANT_NAME_P );
    SubLObject uses = constant_complete( string, NIL, T, UNPROVIDED, UNPROVIDED );
    uses = Sequences.delete( string, uses, Symbols.symbol_function( EQUAL ), Symbols.symbol_function( $sym30$CONSTANT_NAME ), UNPROVIDED, UNPROVIDED, UNPROVIDED );
    return uses;
  }

  @SubLTranslatedFile.SubL(source = "cycl/constant-completion-high.lisp", position = 5224L)
  public static SubLObject constant_name_case_collision(final SubLObject string)
  {
    enforceType( string, $sym15$VALID_CONSTANT_NAME_P );
    return constant_name_case_collisions( string ).first();
  }

  @SubLTranslatedFile.SubL(source = "cycl/constant-completion-high.lisp", position = 5485L)
  public static SubLObject constant_complete_exact(final SubLObject string, SubLObject start, SubLObject end)
  {
    if( start == UNPROVIDED )
    {
      start = ZERO_INTEGER;
    }
    if( end == UNPROVIDED )
    {
      end = NIL;
    }
    // com.cyc.cycjava.cycl.constants_low.lookup_constant_by_guid();
    enforceType( string, $sym18$STRINGP );
    enforceType( start, $sym38$FIXNUMP );
    return constant_completion_interface.kb_constant_complete_exact( string, start, end );
  }

  @SubLTranslatedFile.SubL(source = "cycl/constant-completion-high.lisp", position = 6002L)
  public static SubLObject constant_complete(final SubLObject prefix, SubLObject case_sensitiveP, SubLObject exact_lengthP, SubLObject start, SubLObject end)
  {
    if( case_sensitiveP == UNPROVIDED )
    {
      case_sensitiveP = NIL;
    }
    if( exact_lengthP == UNPROVIDED )
    {
      exact_lengthP = NIL;
    }
    if( start == UNPROVIDED )
    {
      start = ZERO_INTEGER;
    }
    if( end == UNPROVIDED )
    {
      end = NIL;
    }
    enforceType( prefix, $sym18$STRINGP );
    enforceType( case_sensitiveP, $sym23$BOOLEANP );
    enforceType( exact_lengthP, $sym23$BOOLEANP );
    enforceType( start, $sym38$FIXNUMP );
    return constant_completion_interface.kb_constant_complete( prefix, case_sensitiveP, exact_lengthP, start, end );
  }

  @SubLTranslatedFile.SubL(source = "cycl/constant-completion-high.lisp", position = 6697L)
  public static SubLObject constant_apropos(final SubLObject substring, SubLObject case_sensitiveP, SubLObject start, SubLObject end)
  {
    if( case_sensitiveP == UNPROVIDED )
    {
      case_sensitiveP = NIL;
    }
    if( start == UNPROVIDED )
    {
      start = ZERO_INTEGER;
    }
    if( end == UNPROVIDED )
    {
      end = NIL;
    }
    enforceType( substring, $sym18$STRINGP );
    enforceType( case_sensitiveP, $sym23$BOOLEANP );
    enforceType( start, $sym38$FIXNUMP );
    return constant_completion_interface.kb_constant_apropos( substring, case_sensitiveP, start, end );
  }

  @SubLTranslatedFile.SubL(source = "cycl/constant-completion-high.lisp", position = 7278L)
  public static SubLObject constant_postfix(final SubLObject postfix, SubLObject case_sensitiveP, SubLObject start, SubLObject end)
  {
    if( case_sensitiveP == UNPROVIDED )
    {
      case_sensitiveP = NIL;
    }
    if( start == UNPROVIDED )
    {
      start = ZERO_INTEGER;
    }
    if( end == UNPROVIDED )
    {
      end = NIL;
    }
    enforceType( postfix, $sym18$STRINGP );
    enforceType( case_sensitiveP, $sym23$BOOLEANP );
    enforceType( start, $sym38$FIXNUMP );
    return constant_completion_interface.kb_constant_postfix( postfix, case_sensitiveP, start, end );
  }

  @SubLTranslatedFile.SubL(source = "cycl/constant-completion-high.lisp", position = 7854L)
  public static SubLObject n_constants_before(final SubLObject n, final SubLObject string, SubLObject case_sensitiveP, SubLObject start, SubLObject end, SubLObject strictP)
  {
    if( case_sensitiveP == UNPROVIDED )
    {
      case_sensitiveP = NIL;
    }
    if( start == UNPROVIDED )
    {
      start = ZERO_INTEGER;
    }
    if( end == UNPROVIDED )
    {
      end = NIL;
    }
    if( strictP == UNPROVIDED )
    {
      strictP = NIL;
    }
    return constant_completion_interface.kb_n_constants_before( n, string, case_sensitiveP, start, end, strictP );
  }

  @SubLTranslatedFile.SubL(source = "cycl/constant-completion-high.lisp", position = 8397L)
  public static SubLObject n_constants_after(final SubLObject n, final SubLObject string, SubLObject case_sensitiveP, SubLObject start, SubLObject end, SubLObject strictP)
  {
    if( case_sensitiveP == UNPROVIDED )
    {
      case_sensitiveP = NIL;
    }
    if( start == UNPROVIDED )
    {
      start = ZERO_INTEGER;
    }
    if( end == UNPROVIDED )
    {
      end = NIL;
    }
    if( strictP == UNPROVIDED )
    {
      strictP = NIL;
    }
    return constant_completion_interface.kb_n_constants_after( n, string, case_sensitiveP, start, end, strictP );
  }

  @SubLTranslatedFile.SubL(source = "cycl/constant-completion-high.lisp", position = 8935L)
  public static SubLObject new_constant_completion_iterator(SubLObject forwardP, SubLObject buffer_size)
  {
    if( forwardP == UNPROVIDED )
    {
      forwardP = T;
    }
    if( buffer_size == UNPROVIDED )
    {
      buffer_size = ONE_INTEGER;
    }
    return constant_completion_interface.kb_new_constant_completion_iterator( forwardP, buffer_size );
  }

  @SubLTranslatedFile.SubL(source = "cycl/constant-completion-high.lisp", position = 9094L)
  public static SubLObject new_directed_constant_completion_iterator(final SubLObject string, SubLObject case_sensitiveP, SubLObject start, SubLObject end, SubLObject forwardP, SubLObject buffer_size)
  {
    if( case_sensitiveP == UNPROVIDED )
    {
      case_sensitiveP = T;
    }
    if( start == UNPROVIDED )
    {
      start = ZERO_INTEGER;
    }
    if( end == UNPROVIDED )
    {
      end = NIL;
    }
    if( forwardP == UNPROVIDED )
    {
      forwardP = T;
    }
    if( buffer_size == UNPROVIDED )
    {
      buffer_size = ONE_INTEGER;
    }
    return constant_completion_interface.kb_new_directed_constant_completion_iterator( string, case_sensitiveP, start, end, forwardP, buffer_size );
  }

  @SubLTranslatedFile.SubL(source = "cycl/constant-completion-high.lisp", position = 9353L)
  public static SubLObject map_constants_in_completions(final SubLObject function)
  {
    final SubLObject iterator = new_constant_completion_iterator( UNPROVIDED, UNPROVIDED );
    return iteration.map_iterator( function, iterator );
  }

  @SubLTranslatedFile.SubL(source = "cycl/constant-completion-high.lisp", position = 9570L)
  public static SubLObject map_constant_completions_around(final SubLObject function, final SubLObject string, SubLObject v_forward, SubLObject start, SubLObject end)
  {
    if( v_forward == UNPROVIDED )
    {
      v_forward = T;
    }
    if( start == UNPROVIDED )
    {
      start = ZERO_INTEGER;
    }
    if( end == UNPROVIDED )
    {
      end = NIL;
    }
    final SubLObject iterator = new_directed_constant_completion_iterator( string, T, start, end, v_forward, UNPROVIDED );
    return iteration.map_iterator( function, iterator );
  }

  @SubLTranslatedFile.SubL(source = "cycl/constant-completion-high.lisp", position = 9962L)
  public static SubLObject do_constants_in_completions(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list55 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject constant = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list55 );
    constant = current.first();
    current = current.rest();
    SubLObject allow_other_keys_p = NIL;
    SubLObject rest = current;
    SubLObject bad = NIL;
    SubLObject current_$1 = NIL;
    while ( NIL != rest)
    {
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list55 );
      current_$1 = rest.first();
      rest = rest.rest();
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list55 );
      if( NIL == conses_high.member( current_$1, $list56, UNPROVIDED, UNPROVIDED ) )
      {
        bad = T;
      }
      if( current_$1 == $kw57$ALLOW_OTHER_KEYS )
      {
        allow_other_keys_p = rest.first();
      }
      rest = rest.rest();
    }
    if( NIL != bad && NIL == allow_other_keys_p )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list55 );
    }
    final SubLObject done_tail = cdestructuring_bind.property_list_member( $kw58$DONE, current );
    final SubLObject done = ( NIL != done_tail ) ? conses_high.cadr( done_tail ) : NIL;
    final SubLObject forward_tail = cdestructuring_bind.property_list_member( $kw59$FORWARD, current );
    final SubLObject v_forward = ( NIL != forward_tail ) ? conses_high.cadr( forward_tail ) : T;
    final SubLObject body;
    current = ( body = temp );
    final SubLObject iterator = $sym60$ITERATOR;
    return ConsesLow.list( $sym61$CLET, ConsesLow.list( ConsesLow.list( iterator, ConsesLow.list( $sym62$NEW_CONSTANT_COMPLETION_ITERATOR, v_forward ) ) ), ConsesLow.listS( $sym63$DO_ITERATOR, ConsesLow.list( constant,
        iterator, $kw58$DONE, done ), ConsesLow.append( body, NIL ) ), ConsesLow.list( $sym64$ITERATION_FINALIZE, iterator ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/constant-completion-high.lisp", position = 10265L)
  public static SubLObject do_constant_completions_around(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list65 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject constant = NIL;
    SubLObject string = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list65 );
    constant = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list65 );
    string = current.first();
    current = current.rest();
    SubLObject allow_other_keys_p = NIL;
    SubLObject rest = current;
    SubLObject bad = NIL;
    SubLObject current_$2 = NIL;
    while ( NIL != rest)
    {
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list65 );
      current_$2 = rest.first();
      rest = rest.rest();
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list65 );
      if( NIL == conses_high.member( current_$2, $list66, UNPROVIDED, UNPROVIDED ) )
      {
        bad = T;
      }
      if( current_$2 == $kw57$ALLOW_OTHER_KEYS )
      {
        allow_other_keys_p = rest.first();
      }
      rest = rest.rest();
    }
    if( NIL != bad && NIL == allow_other_keys_p )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list65 );
    }
    final SubLObject done_tail = cdestructuring_bind.property_list_member( $kw58$DONE, current );
    final SubLObject done = ( NIL != done_tail ) ? conses_high.cadr( done_tail ) : NIL;
    final SubLObject forward_tail = cdestructuring_bind.property_list_member( $kw59$FORWARD, current );
    final SubLObject v_forward = ( NIL != forward_tail ) ? conses_high.cadr( forward_tail ) : T;
    final SubLObject case_sensitive_tail = cdestructuring_bind.property_list_member( $kw67$CASE_SENSITIVE, current );
    final SubLObject case_sensitive = ( NIL != case_sensitive_tail ) ? conses_high.cadr( case_sensitive_tail ) : T;
    final SubLObject start_tail = cdestructuring_bind.property_list_member( $kw68$START, current );
    final SubLObject start = ( NIL != start_tail ) ? conses_high.cadr( start_tail ) : ZERO_INTEGER;
    final SubLObject end_tail = cdestructuring_bind.property_list_member( $kw69$END, current );
    final SubLObject end = ( NIL != end_tail ) ? conses_high.cadr( end_tail ) : NIL;
    final SubLObject body;
    current = ( body = temp );
    final SubLObject iterator = $sym70$ITERATOR;
    return ConsesLow.list( $sym61$CLET, ConsesLow.list( ConsesLow.list( iterator, ConsesLow.list( $sym71$NEW_DIRECTED_CONSTANT_COMPLETION_ITERATOR, string, case_sensitive, start, end, v_forward ) ) ), ConsesLow.listS(
        $sym63$DO_ITERATOR, ConsesLow.list( constant, iterator, $kw58$DONE, done ), ConsesLow.append( body, NIL ) ), ConsesLow.list( $sym64$ITERATION_FINALIZE, iterator ) );
  }

  public static SubLObject declare_constant_completion_high_file()
  {
    SubLFiles.declareFunction( me, "valid_constant_name_char", "VALID-CONSTANT-NAME-CHAR", 1, 0, false );
    SubLFiles.declareFunction( me, "valid_constant_name_char_p", "VALID-CONSTANT-NAME-CHAR-P", 1, 0, false );
    SubLFiles.declareFunction( me, "valid_constant_name", "VALID-CONSTANT-NAME", 1, 0, false );
    SubLFiles.declareFunction( me, "valid_constant_name_p", "VALID-CONSTANT-NAME-P", 1, 0, false );
    SubLFiles.declareFunction( me, "invalid_constant_name_char_p", "INVALID-CONSTANT-NAME-CHAR-P", 1, 0, false );
    new $invalid_constant_name_char_p$UnaryFunction();
    SubLFiles.declareFunction( me, "constant_name_spec_p", "CONSTANT-NAME-SPEC-P", 1, 0, false );
    SubLFiles.declareFunction( me, "constant_name_available", "CONSTANT-NAME-AVAILABLE", 1, 0, false );
    SubLFiles.declareFunction( me, "uniquify_constant_name", "UNIQUIFY-CONSTANT-NAME", 1, 1, false );
    SubLFiles.declareFunction( me, "get_last_known_index_for_constant_prefix", "GET-LAST-KNOWN-INDEX-FOR-CONSTANT-PREFIX", 1, 0, false );
    SubLFiles.declareFunction( me, "set_last_known_index_for_constant_prefix", "SET-LAST-KNOWN-INDEX-FOR-CONSTANT-PREFIX", 2, 0, false );
    SubLFiles.declareFunction( me, "constant_name_case_collisions", "CONSTANT-NAME-CASE-COLLISIONS", 1, 0, false );
    SubLFiles.declareFunction( me, "constant_name_case_collision", "CONSTANT-NAME-CASE-COLLISION", 1, 0, false );
    SubLFiles.declareFunction( me, "constant_complete_exact", "CONSTANT-COMPLETE-EXACT", 1, 2, false );
    SubLFiles.declareFunction( me, "constant_complete", "CONSTANT-COMPLETE", 1, 4, false );
    SubLFiles.declareFunction( me, "constant_apropos", "CONSTANT-APROPOS", 1, 3, false );
    SubLFiles.declareFunction( me, "constant_postfix", "CONSTANT-POSTFIX", 1, 3, false );
    SubLFiles.declareFunction( me, "n_constants_before", "N-CONSTANTS-BEFORE", 2, 4, false );
    SubLFiles.declareFunction( me, "n_constants_after", "N-CONSTANTS-AFTER", 2, 4, false );
    SubLFiles.declareFunction( me, "new_constant_completion_iterator", "NEW-CONSTANT-COMPLETION-ITERATOR", 0, 2, false );
    SubLFiles.declareFunction( me, "new_directed_constant_completion_iterator", "NEW-DIRECTED-CONSTANT-COMPLETION-ITERATOR", 1, 5, false );
    SubLFiles.declareFunction( me, "map_constants_in_completions", "MAP-CONSTANTS-IN-COMPLETIONS", 1, 0, false );
    SubLFiles.declareFunction( me, "map_constant_completions_around", "MAP-CONSTANT-COMPLETIONS-AROUND", 2, 3, false );
    SubLFiles.declareMacro( me, "do_constants_in_completions", "DO-CONSTANTS-IN-COMPLETIONS" );
    SubLFiles.declareMacro( me, "do_constant_completions_around", "DO-CONSTANT-COMPLETIONS-AROUND" );
    return NIL;
  }

  public static SubLObject init_constant_completion_high_file()
  {
    $require_case_insensitive_name_uniqueness$ = SubLFiles.defparameter( "*REQUIRE-CASE-INSENSITIVE-NAME-UNIQUENESS*", T );
    $last_known_index_for_constant_prefix_dict$ = SubLFiles.defparameter( "*LAST-KNOWN-INDEX-FOR-CONSTANT-PREFIX-DICT*", dictionary.new_dictionary( Symbols.symbol_function( EQUAL ), UNPROVIDED ) );
    return NIL;
  }

  public static SubLObject setup_constant_completion_high_file()
  {
    utilities_macros.register_obsolete_cyc_api_function( $sym1$VALID_CONSTANT_NAME_CHAR, $list2, $list3, $str4$Deprecated_in_favor_of_valid_cons, $list5, $list6 );
    utilities_macros.register_cyc_api_function( $sym8$VALID_CONSTANT_NAME_CHAR_P, $list3, $str9$Return_T_iff_CHAR_is_a_character_, $list5, $list6 );
    utilities_macros.register_obsolete_cyc_api_function( $sym10$VALID_CONSTANT_NAME, $list11, $list12, $str13$Deprecated_in_favor_of_valid_cons, NIL, $list6 );
    utilities_macros.register_cyc_api_function( $sym15$VALID_CONSTANT_NAME_P, $list12, $str16$Return_T_iff_STRING_is_a_valid_na, NIL, $list6 );
    utilities_macros.register_cyc_api_function( $sym19$CONSTANT_NAME_AVAILABLE, $list20, $str21$Return_T_iff_NAME_is_a_valid_cons, $list22, $list6 );
    utilities_macros.register_cyc_api_function( $sym25$UNIQUIFY_CONSTANT_NAME, $list26, $str27$Return_a_unique__currently_unused, $list28, $list29 );
    utilities_macros.register_cyc_api_function( $sym31$CONSTANT_NAME_CASE_COLLISIONS, $list12, $str32$Return_a_list_of_constants_whose_, $list33, $list34 );
    utilities_macros.register_cyc_api_function( $sym35$CONSTANT_NAME_CASE_COLLISION, $list12, $str36$Return_a_constant_whose_name_diff, $list33, $list37 );
    utilities_macros.register_cyc_api_function( $sym39$CONSTANT_COMPLETE_EXACT, $list40, $str41$Return_a_valid_constant_whose_nam, $list42, NIL );
    utilities_macros.register_cyc_api_function( $sym43$CONSTANT_COMPLETE, $list44, $str45$Return_all_valid_constants_with_P, $list46, NIL );
    utilities_macros.register_cyc_api_function( $sym47$CONSTANT_APROPOS, $list48, $str49$Return_all_valid_constants_with_S, $list50, NIL );
    utilities_macros.register_cyc_api_function( $sym51$CONSTANT_POSTFIX, $list52, $str53$Return_all_valid_constants_with_P, $list54, NIL );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_constant_completion_high_file();
  }

  @Override
  public void initializeVariables()
  {
    init_constant_completion_high_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_constant_completion_high_file();
  }
  static
  {
    me = new constant_completion_high();
    $require_case_insensitive_name_uniqueness$ = null;
    $last_known_index_for_constant_prefix_dict$ = null;
    $sym0$CHARACTERP = makeSymbol( "CHARACTERP" );
    $sym1$VALID_CONSTANT_NAME_CHAR = makeSymbol( "VALID-CONSTANT-NAME-CHAR" );
    $list2 = ConsesLow.list( makeSymbol( "VALID-CONSTANT-NAME-CHAR-P" ) );
    $list3 = ConsesLow.list( makeSymbol( "CHAR" ) );
    $str4$Deprecated_in_favor_of_valid_cons = makeString( "Deprecated in favor of valid-constant-name-char-p\n   Return T iff CHAR is a character which is allowed in a valid constant name." );
    $list5 = ConsesLow.list( ConsesLow.list( makeSymbol( "CHAR" ), makeSymbol( "CHARACTERP" ) ) );
    $list6 = ConsesLow.list( makeSymbol( "BOOLEANP" ) );
    $str7$___ = makeString( "-_:" );
    $sym8$VALID_CONSTANT_NAME_CHAR_P = makeSymbol( "VALID-CONSTANT-NAME-CHAR-P" );
    $str9$Return_T_iff_CHAR_is_a_character_ = makeString( "Return T iff CHAR is a character which is allowed in a valid constant name." );
    $sym10$VALID_CONSTANT_NAME = makeSymbol( "VALID-CONSTANT-NAME" );
    $list11 = ConsesLow.list( makeSymbol( "VALID-CONSTANT-NAME-P" ) );
    $list12 = ConsesLow.list( makeSymbol( "STRING" ) );
    $str13$Deprecated_in_favor_of_valid_cons = makeString( "Deprecated in favor of valid-constant-name-p\n   Return T iff STRING is a valid name for a constant." );
    $sym14$INVALID_CONSTANT_NAME_CHAR_P = makeSymbol( "INVALID-CONSTANT-NAME-CHAR-P" );
    $sym15$VALID_CONSTANT_NAME_P = makeSymbol( "VALID-CONSTANT-NAME-P" );
    $str16$Return_T_iff_STRING_is_a_valid_na = makeString( "Return T iff STRING is a valid name for a constant." );
    $kw17$UNNAMED = makeKeyword( "UNNAMED" );
    $sym18$STRINGP = makeSymbol( "STRINGP" );
    $sym19$CONSTANT_NAME_AVAILABLE = makeSymbol( "CONSTANT-NAME-AVAILABLE" );
    $list20 = ConsesLow.list( makeSymbol( "NAME" ) );
    $str21$Return_T_iff_NAME_is_a_valid_cons = makeString( "Return T iff NAME is a valid constant name currently available for use." );
    $list22 = ConsesLow.list( ConsesLow.list( makeSymbol( "NAME" ), makeSymbol( "STRINGP" ) ) );
    $sym23$BOOLEANP = makeSymbol( "BOOLEANP" );
    $str24$_ = makeString( "-" );
    $sym25$UNIQUIFY_CONSTANT_NAME = makeSymbol( "UNIQUIFY-CONSTANT-NAME" );
    $list26 = ConsesLow.list( makeSymbol( "NAME" ), makeSymbol( "&OPTIONAL" ), ConsesLow.list( makeSymbol( "SEQUENTIAL?" ), NIL ) );
    $str27$Return_a_unique__currently_unused = makeString(
        "Return a unique, currently unused constant name based on NAME, which must be a valid constant name. If sequential is set to true it picks the first available sequential digit if NAME is already in use (default is false)." );
    $list28 = ConsesLow.list( ConsesLow.list( makeSymbol( "NAME" ), makeSymbol( "VALID-CONSTANT-NAME-P" ) ), ConsesLow.list( makeSymbol( "SEQUENTIAL?" ), makeSymbol( "BOOLEANP" ) ) );
    $list29 = ConsesLow.list( makeSymbol( "STRINGP" ) );
    $sym30$CONSTANT_NAME = makeSymbol( "CONSTANT-NAME" );
    $sym31$CONSTANT_NAME_CASE_COLLISIONS = makeSymbol( "CONSTANT-NAME-CASE-COLLISIONS" );
    $str32$Return_a_list_of_constants_whose_ = makeString( "Return a list of constants whose names differ from STRING only by case." );
    $list33 = ConsesLow.list( ConsesLow.list( makeSymbol( "STRING" ), makeSymbol( "VALID-CONSTANT-NAME-P" ) ) );
    $list34 = ConsesLow.list( makeSymbol( "LISTP" ) );
    $sym35$CONSTANT_NAME_CASE_COLLISION = makeSymbol( "CONSTANT-NAME-CASE-COLLISION" );
    $str36$Return_a_constant_whose_name_diff = makeString( "Return a constant whose name differs from STRING only by case." );
    $list37 = ConsesLow.list( makeSymbol( "CONSTANT-P" ) );
    $sym38$FIXNUMP = makeSymbol( "FIXNUMP" );
    $sym39$CONSTANT_COMPLETE_EXACT = makeSymbol( "CONSTANT-COMPLETE-EXACT" );
    $list40 = ConsesLow.list( makeSymbol( "STRING" ), makeSymbol( "&OPTIONAL" ), ConsesLow.list( makeSymbol( "START" ), ZERO_INTEGER ), makeSymbol( "END" ) );
    $str41$Return_a_valid_constant_whose_nam = makeString(
        "Return a valid constant whose name exactly matches STRING.\nOptionally the START and END character positions can be\nspecified, such that the STRING matches characters between the START and \nEND range.  If no constant exists, return NIL." );
    $list42 = ConsesLow.list( ConsesLow.list( makeSymbol( "STRING" ), makeSymbol( "STRINGP" ) ), ConsesLow.list( makeSymbol( "START" ), makeSymbol( "FIXNUMP" ) ) );
    $sym43$CONSTANT_COMPLETE = makeSymbol( "CONSTANT-COMPLETE" );
    $list44 = ConsesLow.list( makeSymbol( "PREFIX" ), makeSymbol( "&OPTIONAL" ), makeSymbol( "CASE-SENSITIVE?" ), makeSymbol( "EXACT-LENGTH?" ), ConsesLow.list( makeSymbol( "START" ), ZERO_INTEGER ), makeSymbol(
        "END" ) );
    $str45$Return_all_valid_constants_with_P = makeString(
        "Return all valid constants with PREFIX as a prefix of their name\nWhen CASE-SENSITIVE? is non-nil, the comparison is done in a case-sensitive fashion.\nWhen EXACT-LENGTH? is non-nil, the prefix must be the entire string\nOptionally the START and END character positions can be\nspecified, such that the PREFIX matches characters between the START and \nEND range.  If no constant exists, return NIL." );
    $list46 = ConsesLow.list( ConsesLow.list( makeSymbol( "PREFIX" ), makeSymbol( "STRINGP" ) ), ConsesLow.list( makeSymbol( "CASE-SENSITIVE?" ), makeSymbol( "BOOLEANP" ) ), ConsesLow.list( makeSymbol( "EXACT-LENGTH?" ),
        makeSymbol( "BOOLEANP" ) ), ConsesLow.list( makeSymbol( "START" ), makeSymbol( "FIXNUMP" ) ) );
    $sym47$CONSTANT_APROPOS = makeSymbol( "CONSTANT-APROPOS" );
    $list48 = ConsesLow.list( makeSymbol( "SUBSTRING" ), makeSymbol( "&OPTIONAL" ), makeSymbol( "CASE-SENSITIVE?" ), ConsesLow.list( makeSymbol( "START" ), ZERO_INTEGER ), makeSymbol( "END" ) );
    $str49$Return_all_valid_constants_with_S = makeString(
        "Return all valid constants with SUBSTRING somewhere in their name\nWhen CASE-SENSITIVE? is non-nil, the comparison is done in a case-sensitive fashion.\nOptionally the START and END character positions can be\nspecified, such that the SUBSTRING matches characters between the START and \nEND range.  If no constant exists, return NIL." );
    $list50 = ConsesLow.list( ConsesLow.list( makeSymbol( "SUBSTRING" ), makeSymbol( "STRINGP" ) ), ConsesLow.list( makeSymbol( "CASE-SENSITIVE?" ), makeSymbol( "BOOLEANP" ) ), ConsesLow.list( makeSymbol( "START" ),
        makeSymbol( "FIXNUMP" ) ) );
    $sym51$CONSTANT_POSTFIX = makeSymbol( "CONSTANT-POSTFIX" );
    $list52 = ConsesLow.list( makeSymbol( "POSTFIX" ), makeSymbol( "&OPTIONAL" ), makeSymbol( "CASE-SENSITIVE?" ), ConsesLow.list( makeSymbol( "START" ), ZERO_INTEGER ), makeSymbol( "END" ) );
    $str53$Return_all_valid_constants_with_P = makeString(
        "Return all valid constants with POSTFIX as a postfix of their name\nWhen CASE-SENSITIVE? is non-nil, the comparison is done in a case-sensitive fashion.\nOptionally the START and END character positions can be\nspecified, such that the SUBSTRING matches characters between the START and \nEND range.  If no constant exists, return NIL." );
    $list54 = ConsesLow.list( ConsesLow.list( makeSymbol( "POSTFIX" ), makeSymbol( "STRINGP" ) ), ConsesLow.list( makeSymbol( "CASE-SENSITIVE?" ), makeSymbol( "BOOLEANP" ) ), ConsesLow.list( makeSymbol( "START" ),
        makeSymbol( "FIXNUMP" ) ) );
    $list55 = ConsesLow.list( ConsesLow.list( makeSymbol( "CONSTANT" ), makeSymbol( "&KEY" ), makeSymbol( "DONE" ), ConsesLow.list( makeSymbol( "FORWARD" ), T ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $list56 = ConsesLow.list( makeKeyword( "DONE" ), makeKeyword( "FORWARD" ) );
    $kw57$ALLOW_OTHER_KEYS = makeKeyword( "ALLOW-OTHER-KEYS" );
    $kw58$DONE = makeKeyword( "DONE" );
    $kw59$FORWARD = makeKeyword( "FORWARD" );
    $sym60$ITERATOR = makeUninternedSymbol( "ITERATOR" );
    $sym61$CLET = makeSymbol( "CLET" );
    $sym62$NEW_CONSTANT_COMPLETION_ITERATOR = makeSymbol( "NEW-CONSTANT-COMPLETION-ITERATOR" );
    $sym63$DO_ITERATOR = makeSymbol( "DO-ITERATOR" );
    $sym64$ITERATION_FINALIZE = makeSymbol( "ITERATION-FINALIZE" );
    $list65 = ConsesLow.list( ConsesLow.list( makeSymbol( "CONSTANT" ), makeSymbol( "STRING" ), makeSymbol( "&KEY" ), makeSymbol( "DONE" ), ConsesLow.list( makeSymbol( "FORWARD" ), T ), ConsesLow.list( makeSymbol(
        "CASE-SENSITIVE" ), T ), ConsesLow.list( makeSymbol( "START" ), ZERO_INTEGER ), makeSymbol( "END" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $list66 = ConsesLow.list( makeKeyword( "DONE" ), makeKeyword( "FORWARD" ), makeKeyword( "CASE-SENSITIVE" ), makeKeyword( "START" ), makeKeyword( "END" ) );
    $kw67$CASE_SENSITIVE = makeKeyword( "CASE-SENSITIVE" );
    $kw68$START = makeKeyword( "START" );
    $kw69$END = makeKeyword( "END" );
    $sym70$ITERATOR = makeUninternedSymbol( "ITERATOR" );
    $sym71$NEW_DIRECTED_CONSTANT_COMPLETION_ITERATOR = makeSymbol( "NEW-DIRECTED-CONSTANT-COMPLETION-ITERATOR" );
  }

  public static final class $invalid_constant_name_char_p$UnaryFunction
      extends
        UnaryFunction
  {
    public $invalid_constant_name_char_p$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "INVALID-CONSTANT-NAME-CHAR-P" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1)
    {
      return invalid_constant_name_char_p( arg1 );
    }
  }
}
/*
 * 
 * Total time: 100 ms
 * 
 */