package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class constant_completion_interface
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.constant_completion_interface";
  public static final String myFingerPrint = "19be7027efccf598d4148d8970f0f917a121ea7805de0483c33f599d58cef964";
  private static final SubLSymbol $sym0$STRINGP;
  private static final SubLSymbol $sym1$FIXNUMP;
  private static final SubLSymbol $sym2$KB_CONSTANT_COMPLETE_EXACT;
  private static final SubLSymbol $sym3$QUOTE;
  private static final SubLList $list4;
  private static final SubLString $str5$Return_a_valid_constant_whose_nam;
  private static final SubLList $list6;
  private static final SubLList $list7;
  private static final SubLSymbol $sym8$BOOLEANP;
  private static final SubLSymbol $sym9$KB_CONSTANT_COMPLETE;
  private static final SubLList $list10;
  private static final SubLString $str11$Return_all_valid_constants_with_P;
  private static final SubLList $list12;
  private static final SubLList $list13;
  private static final SubLSymbol $sym14$KB_CONSTANT_APROPOS;
  private static final SubLList $list15;
  private static final SubLString $str16$Return_all_valid_constants_with_S;
  private static final SubLList $list17;
  private static final SubLSymbol $sym18$KB_CONSTANT_POSTFIX;
  private static final SubLList $list19;
  private static final SubLString $str20$Return_all_valid_constants_with_P;
  private static final SubLList $list21;
  private static final SubLSymbol $sym22$NON_NEGATIVE_INTEGER_P;
  private static final SubLSymbol $sym23$KB_N_CONSTANTS_BEFORE;
  private static final SubLList $list24;
  private static final SubLString $str25$Return_the_N_constants_with_names;
  private static final SubLList $list26;
  private static final SubLSymbol $sym27$KB_N_CONSTANTS_AFTER;
  private static final SubLString $str28$Return_the_N_constants_with_names;
  private static final SubLSymbol $sym29$KB_NEW_CONSTANT_COMPLETION_ITERATOR_INTERNAL;
  private static final SubLSymbol $sym30$KB_NEW_DIRECTED_CONSTANT_COMPLETION_ITERATOR_INTERNAL;

  @SubLTranslatedFile.SubL(source = "cycl/constant-completion-interface.lisp", position = 846L)
  public static SubLObject kb_constant_complete_exact(final SubLObject string, SubLObject start, SubLObject end)
  {
    if( start == UNPROVIDED )
    {
      start = ZERO_INTEGER;
    }
    if( end == UNPROVIDED )
    {
      end = NIL;
    }
    enforceType( string, $sym0$STRINGP );
    enforceType( start, $sym1$FIXNUMP );
    if( NIL != end )
    {
      enforceType( end, $sym1$FIXNUMP );
    }
    if( NIL != hl_interface_infrastructure.hl_access_remoteP() )
    {
      return hl_interface_infrastructure.hl_store_remote_eval( ConsesLow.list( $sym2$KB_CONSTANT_COMPLETE_EXACT, ConsesLow.list( $sym3$QUOTE, string ), ConsesLow.list( $sym3$QUOTE, start ), ConsesLow.list( $sym3$QUOTE,
          end ) ) );
    }
    final SubLObject result = constant_completion_low.kb_constant_complete_exact_internal( string, start, end );
    if( NIL != result )
    {
      return result;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/constant-completion-interface.lisp", position = 1651L)
  public static SubLObject kb_constant_complete(final SubLObject prefix, SubLObject case_sensitiveP, SubLObject exact_lengthP, SubLObject start, SubLObject end)
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
    enforceType( prefix, $sym0$STRINGP );
    enforceType( case_sensitiveP, $sym8$BOOLEANP );
    enforceType( exact_lengthP, $sym8$BOOLEANP );
    enforceType( start, $sym1$FIXNUMP );
    if( NIL != end )
    {
      enforceType( end, $sym1$FIXNUMP );
    }
    if( NIL != hl_interface_infrastructure.hl_access_remoteP() )
    {
      return hl_interface_infrastructure.hl_store_remote_eval( ConsesLow.list( $sym9$KB_CONSTANT_COMPLETE, ConsesLow.list( $sym3$QUOTE, prefix ), ConsesLow.list( $sym3$QUOTE, case_sensitiveP ), ConsesLow.list(
          $sym3$QUOTE, exact_lengthP ), ConsesLow.list( $sym3$QUOTE, start ), ConsesLow.list( $sym3$QUOTE, end ) ) );
    }
    final SubLObject result = constant_completion_low.kb_constant_complete_internal( prefix, case_sensitiveP, exact_lengthP, start, end );
    if( NIL != result )
    {
      return result;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/constant-completion-interface.lisp", position = 2765L)
  public static SubLObject kb_constant_apropos(final SubLObject substring, SubLObject case_sensitiveP, SubLObject start, SubLObject end)
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
    enforceType( substring, $sym0$STRINGP );
    enforceType( case_sensitiveP, $sym8$BOOLEANP );
    enforceType( start, $sym1$FIXNUMP );
    if( NIL != end )
    {
      enforceType( end, $sym1$FIXNUMP );
    }
    if( NIL != hl_interface_infrastructure.hl_access_remoteP() )
    {
      return hl_interface_infrastructure.hl_store_remote_eval( ConsesLow.list( $sym14$KB_CONSTANT_APROPOS, ConsesLow.list( $sym3$QUOTE, substring ), ConsesLow.list( $sym3$QUOTE, case_sensitiveP ), ConsesLow.list(
          $sym3$QUOTE, start ), ConsesLow.list( $sym3$QUOTE, end ) ) );
    }
    final SubLObject result = constant_completion_low.kb_constant_apropos_internal( substring, case_sensitiveP, start, end );
    if( NIL != result )
    {
      return result;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/constant-completion-interface.lisp", position = 3745L)
  public static SubLObject kb_constant_postfix(final SubLObject postfix, SubLObject case_sensitiveP, SubLObject start, SubLObject end)
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
    enforceType( postfix, $sym0$STRINGP );
    enforceType( case_sensitiveP, $sym8$BOOLEANP );
    enforceType( start, $sym1$FIXNUMP );
    if( NIL != end )
    {
      enforceType( end, $sym1$FIXNUMP );
    }
    if( NIL != hl_interface_infrastructure.hl_access_remoteP() )
    {
      return hl_interface_infrastructure.hl_store_remote_eval( ConsesLow.list( $sym18$KB_CONSTANT_POSTFIX, ConsesLow.list( $sym3$QUOTE, postfix ), ConsesLow.list( $sym3$QUOTE, case_sensitiveP ), ConsesLow.list(
          $sym3$QUOTE, start ), ConsesLow.list( $sym3$QUOTE, end ) ) );
    }
    final SubLObject result = constant_completion_low.kb_constant_postfix_internal( postfix, case_sensitiveP, start, end );
    if( NIL != result )
    {
      return result;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/constant-completion-interface.lisp", position = 4720L)
  public static SubLObject kb_n_constants_before(final SubLObject n, final SubLObject string, SubLObject case_sensitiveP, SubLObject start, SubLObject end, SubLObject strictP)
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
    enforceType( n, $sym22$NON_NEGATIVE_INTEGER_P );
    enforceType( string, $sym0$STRINGP );
    enforceType( case_sensitiveP, $sym8$BOOLEANP );
    enforceType( start, $sym1$FIXNUMP );
    if( NIL != end )
    {
      enforceType( end, $sym1$FIXNUMP );
    }
    if( NIL != hl_interface_infrastructure.hl_access_remoteP() )
    {
      return hl_interface_infrastructure.hl_store_remote_eval( ConsesLow.list( $sym23$KB_N_CONSTANTS_BEFORE, ConsesLow.list( $sym3$QUOTE, n ), ConsesLow.list( $sym3$QUOTE, string ), ConsesLow.list( $sym3$QUOTE,
          case_sensitiveP ), ConsesLow.list( $sym3$QUOTE, start ), ConsesLow.list( $sym3$QUOTE, end ), ConsesLow.list( $sym3$QUOTE, strictP ) ) );
    }
    final SubLObject result = constant_completion_low.kb_n_constants_before_internal( n, string, case_sensitiveP, start, end, strictP );
    if( NIL != result )
    {
      return result;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/constant-completion-interface.lisp", position = 5798L)
  public static SubLObject kb_n_constants_after(final SubLObject n, final SubLObject string, SubLObject case_sensitiveP, SubLObject start, SubLObject end, SubLObject strictP)
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
    enforceType( n, $sym22$NON_NEGATIVE_INTEGER_P );
    enforceType( string, $sym0$STRINGP );
    enforceType( case_sensitiveP, $sym8$BOOLEANP );
    enforceType( start, $sym1$FIXNUMP );
    if( NIL != end )
    {
      enforceType( end, $sym1$FIXNUMP );
    }
    if( NIL != hl_interface_infrastructure.hl_access_remoteP() )
    {
      return hl_interface_infrastructure.hl_store_remote_eval( ConsesLow.list( $sym27$KB_N_CONSTANTS_AFTER, ConsesLow.list( $sym3$QUOTE, n ), ConsesLow.list( $sym3$QUOTE, string ), ConsesLow.list( $sym3$QUOTE,
          case_sensitiveP ), ConsesLow.list( $sym3$QUOTE, start ), ConsesLow.list( $sym3$QUOTE, end ), ConsesLow.list( $sym3$QUOTE, strictP ) ) );
    }
    final SubLObject result = constant_completion_low.kb_n_constants_after_internal( n, string, case_sensitiveP, start, end, strictP );
    if( NIL != result )
    {
      return result;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/constant-completion-interface.lisp", position = 6871L)
  public static SubLObject kb_new_constant_completion_iterator(SubLObject forwardP, SubLObject buffer_size)
  {
    if( forwardP == UNPROVIDED )
    {
      forwardP = T;
    }
    if( buffer_size == UNPROVIDED )
    {
      buffer_size = ONE_INTEGER;
    }
    return hl_interface_infrastructure.new_hl_store_iterator( ConsesLow.list( $sym29$KB_NEW_CONSTANT_COMPLETION_ITERATOR_INTERNAL, list_utilities.quotify( forwardP ) ), buffer_size );
  }

  @SubLTranslatedFile.SubL(source = "cycl/constant-completion-interface.lisp", position = 7153L)
  public static SubLObject kb_new_directed_constant_completion_iterator(final SubLObject string, SubLObject case_sensitiveP, SubLObject start, SubLObject end, SubLObject forwardP, SubLObject buffer_size)
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
    return hl_interface_infrastructure.new_hl_store_iterator( ConsesLow.list( $sym30$KB_NEW_DIRECTED_CONSTANT_COMPLETION_ITERATOR_INTERNAL, list_utilities.quotify( string ), list_utilities.quotify( case_sensitiveP ),
        list_utilities.quotify( start ), list_utilities.quotify( end ), list_utilities.quotify( forwardP ) ), buffer_size );
  }

  public static SubLObject declare_constant_completion_interface_file()
  {
    SubLFiles.declareFunction( me, "kb_constant_complete_exact", "KB-CONSTANT-COMPLETE-EXACT", 1, 2, false );
    SubLFiles.declareFunction( me, "kb_constant_complete", "KB-CONSTANT-COMPLETE", 1, 4, false );
    SubLFiles.declareFunction( me, "kb_constant_apropos", "KB-CONSTANT-APROPOS", 1, 3, false );
    SubLFiles.declareFunction( me, "kb_constant_postfix", "KB-CONSTANT-POSTFIX", 1, 3, false );
    SubLFiles.declareFunction( me, "kb_n_constants_before", "KB-N-CONSTANTS-BEFORE", 2, 4, false );
    SubLFiles.declareFunction( me, "kb_n_constants_after", "KB-N-CONSTANTS-AFTER", 2, 4, false );
    SubLFiles.declareFunction( me, "kb_new_constant_completion_iterator", "KB-NEW-CONSTANT-COMPLETION-ITERATOR", 0, 2, false );
    SubLFiles.declareFunction( me, "kb_new_directed_constant_completion_iterator", "KB-NEW-DIRECTED-CONSTANT-COMPLETION-ITERATOR", 1, 5, false );
    return NIL;
  }

  public static SubLObject init_constant_completion_interface_file()
  {
    return NIL;
  }

  public static SubLObject setup_constant_completion_interface_file()
  {
    utilities_macros.register_cyc_api_function( $sym2$KB_CONSTANT_COMPLETE_EXACT, $list4, $str5$Return_a_valid_constant_whose_nam, $list6, $list7 );
    utilities_macros.register_cyc_api_function( $sym9$KB_CONSTANT_COMPLETE, $list10, $str11$Return_all_valid_constants_with_P, $list12, $list13 );
    utilities_macros.register_cyc_api_function( $sym14$KB_CONSTANT_APROPOS, $list15, $str16$Return_all_valid_constants_with_S, $list17, $list13 );
    utilities_macros.register_cyc_api_function( $sym18$KB_CONSTANT_POSTFIX, $list19, $str20$Return_all_valid_constants_with_P, $list21, $list13 );
    utilities_macros.register_cyc_api_function( $sym23$KB_N_CONSTANTS_BEFORE, $list24, $str25$Return_the_N_constants_with_names, $list26, $list13 );
    utilities_macros.register_cyc_api_function( $sym27$KB_N_CONSTANTS_AFTER, $list24, $str28$Return_the_N_constants_with_names, $list26, $list13 );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_constant_completion_interface_file();
  }

  @Override
  public void initializeVariables()
  {
    init_constant_completion_interface_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_constant_completion_interface_file();
  }
  static
  {
    me = new constant_completion_interface();
    $sym0$STRINGP = makeSymbol( "STRINGP" );
    $sym1$FIXNUMP = makeSymbol( "FIXNUMP" );
    $sym2$KB_CONSTANT_COMPLETE_EXACT = makeSymbol( "KB-CONSTANT-COMPLETE-EXACT" );
    $sym3$QUOTE = makeSymbol( "QUOTE" );
    $list4 = ConsesLow.list( makeSymbol( "STRING" ), makeSymbol( "&OPTIONAL" ), ConsesLow.list( makeSymbol( "START" ), ZERO_INTEGER ), makeSymbol( "END" ) );
    $str5$Return_a_valid_constant_whose_nam = makeString(
        "Return a valid constant whose name exactly matches STRING.\n   Optionally the START and END character positions can be\n   specified, such that the STRING matches characters between the START and \n   END range.  If no constant exists, return NIL." );
    $list6 = ConsesLow.list( ConsesLow.list( makeSymbol( "STRING" ), makeSymbol( "STRINGP" ) ), ConsesLow.list( makeSymbol( "START" ), makeSymbol( "FIXNUMP" ) ), ConsesLow.list( makeSymbol( "END" ), ConsesLow.list(
        makeSymbol( "NIL-OR" ), makeSymbol( "FIXNUMP" ) ) ) );
    $list7 = ConsesLow.list( ConsesLow.list( makeSymbol( "NIL-OR" ), makeSymbol( "CONSTANT-P" ) ) );
    $sym8$BOOLEANP = makeSymbol( "BOOLEANP" );
    $sym9$KB_CONSTANT_COMPLETE = makeSymbol( "KB-CONSTANT-COMPLETE" );
    $list10 = ConsesLow.list( makeSymbol( "PREFIX" ), makeSymbol( "&OPTIONAL" ), makeSymbol( "CASE-SENSITIVE?" ), makeSymbol( "EXACT-LENGTH?" ), ConsesLow.list( makeSymbol( "START" ), ZERO_INTEGER ), makeSymbol(
        "END" ) );
    $str11$Return_all_valid_constants_with_P = makeString(
        "Return all valid constants with PREFIX as a prefix of their name\n   When CASE-SENSITIVE? is non-nil, the comparison is done in a case-sensitive fashion.\n   When EXACT-LENGTH? is non-nil, the prefix must be the entire string\n   Optionally the START and END character positions can be\n   specified, such that the PREFIX matches characters between the START and \n   END range.  If no constant exists, return NIL." );
    $list12 = ConsesLow.list( ConsesLow.list( makeSymbol( "PREFIX" ), makeSymbol( "STRINGP" ) ), ConsesLow.list( makeSymbol( "CASE-SENSITIVE?" ), makeSymbol( "BOOLEANP" ) ), ConsesLow.list( makeSymbol( "EXACT-LENGTH?" ),
        makeSymbol( "BOOLEANP" ) ), ConsesLow.list( makeSymbol( "START" ), makeSymbol( "FIXNUMP" ) ), ConsesLow.list( makeSymbol( "END" ), ConsesLow.list( makeSymbol( "NIL-OR" ), makeSymbol( "FIXNUMP" ) ) ) );
    $list13 = ConsesLow.list( ConsesLow.list( makeSymbol( "LIST" ), makeSymbol( "CONSTANT-P" ) ) );
    $sym14$KB_CONSTANT_APROPOS = makeSymbol( "KB-CONSTANT-APROPOS" );
    $list15 = ConsesLow.list( makeSymbol( "SUBSTRING" ), makeSymbol( "&OPTIONAL" ), makeSymbol( "CASE-SENSITIVE?" ), ConsesLow.list( makeSymbol( "START" ), ZERO_INTEGER ), makeSymbol( "END" ) );
    $str16$Return_all_valid_constants_with_S = makeString(
        "Return all valid constants with SUBSTRING somewhere in their name\n   When CASE-SENSITIVE? is non-nil, the comparison is done in a case-sensitive fashion.\n   Optionally the START and END character positions can be\n   specified, such that the SUBSTRING matches characters between the START and \n   END range.  If no constant exists, return NIL." );
    $list17 = ConsesLow.list( ConsesLow.list( makeSymbol( "SUBSTRING" ), makeSymbol( "STRINGP" ) ), ConsesLow.list( makeSymbol( "CASE-SENSITIVE?" ), makeSymbol( "BOOLEANP" ) ), ConsesLow.list( makeSymbol( "START" ),
        makeSymbol( "FIXNUMP" ) ), ConsesLow.list( makeSymbol( "END" ), ConsesLow.list( makeSymbol( "NIL-OR" ), makeSymbol( "FIXNUMP" ) ) ) );
    $sym18$KB_CONSTANT_POSTFIX = makeSymbol( "KB-CONSTANT-POSTFIX" );
    $list19 = ConsesLow.list( makeSymbol( "POSTFIX" ), makeSymbol( "&OPTIONAL" ), makeSymbol( "CASE-SENSITIVE?" ), ConsesLow.list( makeSymbol( "START" ), ZERO_INTEGER ), makeSymbol( "END" ) );
    $str20$Return_all_valid_constants_with_P = makeString(
        "Return all valid constants with POSTFIX as a postfix of their name\n   When CASE-SENSITIVE? is non-nil, the comparison is done in a case-sensitive fashion.\n   Optionally the START and END character positions can be\n   specified, such that the SUBSTRING matches characters between the START and \n   END range.  If no constant exists, return NIL." );
    $list21 = ConsesLow.list( ConsesLow.list( makeSymbol( "POSTFIX" ), makeSymbol( "STRINGP" ) ), ConsesLow.list( makeSymbol( "CASE-SENSITIVE?" ), makeSymbol( "BOOLEANP" ) ), ConsesLow.list( makeSymbol( "START" ),
        makeSymbol( "FIXNUMP" ) ), ConsesLow.list( makeSymbol( "END" ), ConsesLow.list( makeSymbol( "NIL-OR" ), makeSymbol( "FIXNUMP" ) ) ) );
    $sym22$NON_NEGATIVE_INTEGER_P = makeSymbol( "NON-NEGATIVE-INTEGER-P" );
    $sym23$KB_N_CONSTANTS_BEFORE = makeSymbol( "KB-N-CONSTANTS-BEFORE" );
    $list24 = ConsesLow.list( makeSymbol( "N" ), makeSymbol( "STRING" ), makeSymbol( "&OPTIONAL" ), makeSymbol( "CASE-SENSITIVE?" ), ConsesLow.list( makeSymbol( "START" ), ZERO_INTEGER ), makeSymbol( "END" ), makeSymbol(
        "STRICT?" ) );
    $str25$Return_the_N_constants_with_names = makeString(
        "Return the N constants with names before STRING.  When CASE-SENSITIVE? is non-nil,\n   the comparison is done in a case-sensitive fashion.  Optionally the START and END\n   character positions can be specified, such that STRING matches characters between\n   the START and END range.  If STRICT? is non-nil, then only constants strictly\n   before the string are returned." );
    $list26 = ConsesLow.list( ConsesLow.list( makeSymbol( "N" ), makeSymbol( "NON-NEGATIVE-INTEGER-P" ) ), ConsesLow.list( makeSymbol( "STRING" ), makeSymbol( "STRINGP" ) ), ConsesLow.list( makeSymbol(
        "CASE-SENSITIVE?" ), makeSymbol( "BOOLEANP" ) ), ConsesLow.list( makeSymbol( "START" ), makeSymbol( "FIXNUMP" ) ), ConsesLow.list( makeSymbol( "END" ), ConsesLow.list( makeSymbol( "NIL-OR" ), makeSymbol(
            "FIXNUMP" ) ) ) );
    $sym27$KB_N_CONSTANTS_AFTER = makeSymbol( "KB-N-CONSTANTS-AFTER" );
    $str28$Return_the_N_constants_with_names = makeString(
        "Return the N constants with names after STRING.  When CASE-SENSITIVE? is non-nil,\n   the comparison is done in a case-sensitive fashion.  Optionally the START and END\n   character positions can be specified, such that STRING matches characters between\n   the START and END range.  If STRICT? is non-nil, then only constants strictly after\n   the string are returned." );
    $sym29$KB_NEW_CONSTANT_COMPLETION_ITERATOR_INTERNAL = makeSymbol( "KB-NEW-CONSTANT-COMPLETION-ITERATOR-INTERNAL" );
    $sym30$KB_NEW_DIRECTED_CONSTANT_COMPLETION_ITERATOR_INTERNAL = makeSymbol( "KB-NEW-DIRECTED-CONSTANT-COMPLETION-ITERATOR-INTERNAL" );
  }
}
/*
 * 
 * Total time: 55 ms
 * 
 */