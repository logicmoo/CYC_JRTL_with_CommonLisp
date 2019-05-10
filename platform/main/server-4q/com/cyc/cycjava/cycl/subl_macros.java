package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class subl_macros
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.subl_macros";
  public static final String myFingerPrint = "83c70bf0e3123160608f92d661c9ab0ea0f69353ab9d704f32c0457e35519520";
  @SubLTranslatedFile.SubL(source = "cycl/subl-macros.lisp", position = 19527L)
  public static SubLSymbol $ignore_assert_typesP$;
  private static final SubLSymbol $sym0$UNTIL;
  private static final SubLList $list1;
  private static final SubLSymbol $sym2$CDO;
  private static final SubLSymbol $sym3$WHILE;
  private static final SubLSymbol $sym4$CNOT;
  private static final SubLSymbol $sym5$REPEAT_FOREVER;
  private static final SubLSymbol $sym6$DO_NUMBERS;
  private static final SubLList $list7;
  private static final SubLList $list8;
  private static final SubLSymbol $kw9$ALLOW_OTHER_KEYS;
  private static final SubLSymbol $kw10$START;
  private static final SubLSymbol $kw11$END;
  private static final SubLSymbol $kw12$DELTA;
  private static final SubLSymbol $kw13$DONE;
  private static final SubLSymbol $sym14$CDOTIMES;
  private static final SubLSymbol $sym15$1_;
  private static final SubLSymbol $sym16$_;
  private static final SubLSymbol $sym17$DELTA_VAR;
  private static final SubLSymbol $sym18$END_VAR;
  private static final SubLSymbol $sym19$DO_NUMBERS_ENDTEST_MACRO;
  private static final SubLSymbol $sym20$COR;
  private static final SubLSymbol $sym21$CLET;
  private static final SubLSymbol $sym22$PUNLESS;
  private static final SubLList $list23;
  private static final SubLSymbol $sym24$__;
  private static final SubLSymbol $sym25$__;
  private static final SubLSymbol $sym26$_;
  private static final SubLSymbol $sym27$DO_NUMBERS_ENDTEST;
  private static final SubLSymbol $sym28$DO_LIST;
  private static final SubLList $list29;
  private static final SubLList $list30;
  private static final SubLSymbol $kw31$PROGRESS_MESSAGE;
  private static final SubLSymbol $sym32$MESSAGE_VAR;
  private static final SubLSymbol $sym33$LIST_VAR;
  private static final SubLSymbol $sym34$SOFAR;
  private static final SubLSymbol $sym35$TOTAL;
  private static final SubLList $list36;
  private static final SubLSymbol $sym37$LENGTH;
  private static final SubLSymbol $sym38$NOTING_PERCENT_PROGRESS;
  private static final SubLSymbol $sym39$NOTE_PERCENT_PROGRESS;
  private static final SubLSymbol $sym40$CINC;
  private static final SubLSymbol $sym41$REST;
  private static final SubLSymbol $sym42$CDR;
  private static final SubLSymbol $sym43$NULL;
  private static final SubLSymbol $sym44$CAR;
  private static final SubLSymbol $sym45$CDOLIST;
  private static final SubLSymbol $sym46$DO_LIST_INDEX;
  private static final SubLList $list47;
  private static final SubLList $list48;
  private static final SubLSymbol $sym49$LIST_VAR;
  private static final SubLSymbol $sym50$DO_ALIST;
  private static final SubLList $list51;
  private static final SubLList $list52;
  private static final SubLSymbol $kw53$INDEX;
  private static final SubLSymbol $sym54$CONS;
  private static final SubLSymbol $sym55$CDESTRUCTURING_BIND;
  private static final SubLSymbol $sym56$DO_ALIST_VALUES;
  private static final SubLList $list57;
  private static final SubLSymbol $sym58$KEY;
  private static final SubLSymbol $sym59$IGNORE;
  private static final SubLSymbol $sym60$DO_ALIST_KEYS;
  private static final SubLList $list61;
  private static final SubLSymbol $sym62$VALUE;
  private static final SubLSymbol $sym63$CINC_ALIST;
  private static final SubLList $list64;
  private static final SubLSymbol $sym65$ENTRY;
  private static final SubLSymbol $sym66$ASSOC;
  private static final SubLSymbol $sym67$QUOTE;
  private static final SubLSymbol $sym68$CSETQ;
  private static final SubLSymbol $sym69$CONS;
  private static final SubLSymbol $sym70$CPUSH;
  private static final SubLSymbol $sym71$RPLACD;
  private static final SubLSymbol $sym72$CDEC_ALIST;
  private static final SubLList $list73;
  private static final SubLSymbol $sym74$DO_PLIST;
  private static final SubLList $list75;
  private static final SubLSymbol $sym76$REMAINDER;
  private static final SubLSymbol $sym77$CDDR;
  private static final SubLSymbol $sym78$CADR;
  private static final SubLSymbol $sym79$DO_PLIST_PROPERTIES;
  private static final SubLList $list80;
  private static final SubLSymbol $sym81$VALUE;
  private static final SubLSymbol $sym82$DO_PLIST_VALUES;
  private static final SubLList $list83;
  private static final SubLSymbol $sym84$PROPERTY;
  private static final SubLList $list85;
  private static final SubLSymbol $sym86$CDOCONS;
  private static final SubLList $list87;
  private static final SubLSymbol $sym88$ATOM;
  private static final SubLSymbol $sym89$DO_PAIRS;
  private static final SubLList $list90;
  private static final SubLSymbol $sym91$LIST;
  private static final SubLSymbol $sym92$FIRST;
  private static final SubLSymbol $sym93$CSOME;
  private static final SubLSymbol $sym94$REST;
  private static final SubLSymbol $sym95$DO_LIST_WITH_TAIL;
  private static final SubLList $list96;
  private static final SubLSymbol $sym97$CDR_VAR;
  private static final SubLSymbol $sym98$DOLISTS;
  private static final SubLList $list99;
  private static final SubLString $str100$CURRENT__A;
  private static final SubLSymbol $sym101$CAND;
  private static final SubLSymbol $sym102$DO_STRING;
  private static final SubLList $list103;
  private static final SubLList $list104;
  private static final SubLSymbol $kw105$CHAR_NUM;
  private static final SubLSymbol $sym106$DO_STRING_INDEX;
  private static final SubLSymbol $sym107$CHAR_NUM;
  private static final SubLList $list108;
  private static final SubLList $list109;
  private static final SubLSymbol $sym110$STRING_VAR;
  private static final SubLSymbol $sym111$END_VAR;
  private static final SubLSymbol $sym112$FIF;
  private static final SubLSymbol $sym113$CHAR;
  private static final SubLSymbol $sym114$DO_VECTOR;
  private static final SubLList $list115;
  private static final SubLList $list116;
  private static final SubLSymbol $kw117$ELEMENT_NUM;
  private static final SubLSymbol $kw118$BACKWARD_;
  private static final SubLSymbol $sym119$DO_VECTOR_INDEX;
  private static final SubLSymbol $sym120$ELEMENT_NUM;
  private static final SubLList $list121;
  private static final SubLList $list122;
  private static final SubLSymbol $sym123$VECTOR_VAR;
  private static final SubLSymbol $sym124$BACKWARD__VAR;
  private static final SubLSymbol $sym125$LENGTH;
  private static final SubLSymbol $sym126$START;
  private static final SubLSymbol $sym127$END;
  private static final SubLSymbol $sym128$DELTA;
  private static final SubLSymbol $sym129$LIST;
  private static final SubLSymbol $sym130$_;
  private static final SubLList $list131;
  private static final SubLList $list132;
  private static final SubLSymbol $sym133$AREF;
  private static final SubLSymbol $sym134$ITERATION;
  private static final SubLSymbol $sym135$CDOVECTOR;
  private static final SubLList $list136;
  private static final SubLSymbol $sym137$CSOME_VECTOR;
  private static final SubLList $list138;
  private static final SubLSymbol $sym139$SMART_CSOMEVECTOR;
  private static final SubLSymbol $sym140$DO_SEQUENCE;
  private static final SubLList $list141;
  private static final SubLList $list142;
  private static final SubLSymbol $sym143$DO_SEQUENCE_INDEX;
  private static final SubLSymbol $sym144$ELEMENT_NUM;
  private static final SubLList $list145;
  private static final SubLSymbol $sym146$SEQUENCE_VAR;
  private static final SubLSymbol $sym147$END_INDEX;
  private static final SubLSymbol $sym148$SEQUENCE_DONE_;
  private static final SubLSymbol $sym149$FUNLESS;
  private static final SubLSymbol $sym150$LISTP;
  private static final SubLSymbol $sym151$DO_SEQUENCE_INDEX_DONE_;
  private static final SubLSymbol $sym152$DO_SEQUENCE_INDEX_VALUE_;
  private static final SubLSymbol $sym153$PROGN;
  private static final SubLSymbol $sym154$DO_SEQUENCE_INDEX_UPDATE;
  private static final SubLSymbol $sym155$DO_HASH_TABLE;
  private static final SubLList $list156;
  private static final SubLSymbol $sym157$MESSAGE_VAR;
  private static final SubLSymbol $sym158$SILENT_;
  private static final SubLSymbol $sym159$TABLE_VAR;
  private static final SubLSymbol $sym160$INDEX_VAR;
  private static final SubLSymbol $sym161$COUNT_VAR;
  private static final SubLList $list162;
  private static final SubLSymbol $sym163$_SILENT_PROGRESS__;
  private static final SubLSymbol $sym164$FIRST_OF;
  private static final SubLList $list165;
  private static final SubLSymbol $sym166$HASH_TABLE_COUNT;
  private static final SubLSymbol $sym167$CCATCH_IGNORE;
  private static final SubLSymbol $kw168$DO_HASH_TABLE;
  private static final SubLSymbol $sym169$DO_HASH_TABLE_DONE_CHECK;
  private static final SubLSymbol $sym170$CDOHASH;
  private static final SubLSymbol $sym171$DO_HASH_TABLE_KEYS;
  private static final SubLList $list172;
  private static final SubLSymbol $sym173$NO_VALUE;
  private static final SubLList $list174;
  private static final SubLSymbol $sym175$CATCH_VAR;
  private static final SubLSymbol $sym176$CCATCH;
  private static final SubLSymbol $sym177$PUNLESS_ERROR;
  private static final SubLList $list178;
  private static final SubLSymbol $sym179$ERROR;
  private static final SubLSymbol $sym180$CATCH_ERROR_MESSAGE;
  private static final SubLSymbol $sym181$PWHEN_ERROR;
  private static final SubLSymbol $sym182$ERROR;
  private static final SubLSymbol $sym183$PWHEN;
  private static final SubLSymbol $sym184$WARN_ON_ERRORS;
  private static final SubLSymbol $sym185$MESSAGE_VAR;
  private static final SubLSymbol $sym186$WITHOUT_APPENDING_STACK_TRACES_TO_ERROR_MESSAGES;
  private static final SubLSymbol $sym187$STRINGP;
  private static final SubLSymbol $sym188$WARN;
  private static final SubLString $str189$_A;
  private static final SubLSymbol $sym190$POSSIBLY_WARN_ON_ERRORS;
  private static final SubLList $list191;
  private static final SubLSymbol $sym192$PIF;
  private static final SubLSymbol $sym193$POSSIBLY_IGNORE_ERRORS;
  private static final SubLSymbol $sym194$IGNORE_ERRORS;
  private static final SubLSymbol $sym195$WARN_OR_IGNORE_ERRORS;
  private static final SubLSymbol $sym196$WITH_DEFAULT_ERROR_HANDLING;
  private static final SubLSymbol $sym197$WITH_ERROR_HANDLER;
  private static final SubLSymbol $sym198$CUNWIND_ON_FAILURE;
  private static final SubLList $list199;
  private static final SubLSymbol $sym200$SUCCESS_VAR;
  private static final SubLSymbol $sym201$CUNWIND_PROTECT;
  private static final SubLList $list202;
  private static final SubLSymbol $sym203$CUNWIND_PROTECT_WITH_FAIL_CLAUSE;
  private static final SubLList $list204;
  private static final SubLSymbol $sym205$SUCCESS_VAR;
  private static final SubLSymbol $sym206$_IGNORE_ASSERT_TYPES__;
  private static final SubLSymbol $sym207$ASSERT_TYPE;
  private static final SubLList $list208;
  private static final SubLSymbol $sym209$CHECK_TYPE;
  private static final SubLSymbol $sym210$ASSERT_TYPE_IF_PRESENT;
  private static final SubLSymbol $sym211$CHECK_TYPE_IF_PRESENT;
  private static final SubLSymbol $sym212$ASSERT_LIST_TYPE;
  private static final SubLList $list213;
  private static final SubLSymbol $sym214$CHECK_LIST_TYPE;
  private static final SubLSymbol $sym215$ASSERT_PLIST_TYPE;
  private static final SubLList $list216;
  private static final SubLSymbol $sym217$CHECK_PLIST_TYPE;
  private static final SubLSymbol $sym218$ASSERT_MUST;
  private static final SubLList $list219;
  private static final SubLList $list220;
  private static final SubLSymbol $sym221$MUST;
  private static final SubLSymbol $sym222$PCASE_FEATURE;
  private static final SubLList $list223;
  private static final SubLSymbol $sym224$OTHERWISE;
  private static final SubLSymbol $sym225$PIF_FEATURE;
  private static final SubLList $list226;
  private static final SubLList $list227;
  private static final SubLSymbol $sym228$PWHEN_FEATURE;
  private static final SubLList $list229;
  private static final SubLSymbol $sym230$PUNLESS_FEATURE;
  private static final SubLSymbol $sym231$FCASE_FEATURE;
  private static final SubLList $list232;
  private static final SubLSymbol $sym233$FIF_FEATURE;
  private static final SubLSymbol $sym234$FWHEN_FEATURE;
  private static final SubLSymbol $sym235$FEATURE_MATCH;
  private static final SubLList $list236;
  private static final SubLSymbol $sym237$FUNLESS_FEATURE;
  private static final SubLList $list238;
  private static final SubLSymbol $sym239$FIMPLIES_FEATURE;
  private static final SubLList $list240;
  private static final SubLSymbol $sym241$ATOMIC_FEATURE_MATCH;
  private static final SubLSymbol $sym242$FEATURE_EXPRESSION_MATCH;
  private static final SubLList $list243;
  private static final SubLSymbol $kw244$NOT;
  private static final SubLSymbol $sym245$NOT;
  private static final SubLSymbol $kw246$OR;
  private static final SubLSymbol $sym247$OR;
  private static final SubLSymbol $kw248$AND;
  private static final SubLSymbol $sym249$AND;
  private static final SubLString $str250$_S_is_not_a_well_formed_feature_e;
  private static final SubLSymbol $sym251$FUNCALL_IF;
  private static final SubLList $list252;
  private static final SubLList $list253;
  private static final SubLSymbol $sym254$FWHEN;
  private static final SubLSymbol $sym255$FUNCALL;
  private static final SubLSymbol $sym256$CPUSH_IF;
  private static final SubLList $list257;
  private static final SubLSymbol $sym258$VAR;
  private static final SubLSymbol $sym259$CPUSHNEW_IF;
  private static final SubLList $list260;
  private static final SubLList $list261;
  private static final SubLList $list262;
  private static final SubLSymbol $sym263$VAR;
  private static final SubLSymbol $sym264$CPUSHNEW;
  private static final SubLSymbol $sym265$CPUSH_ALL;
  private static final SubLList $list266;
  private static final SubLSymbol $sym267$ITEM;
  private static final SubLSymbol $sym268$ITEMS_VAR;
  private static final SubLSymbol $sym269$VECTORP;
  private static final SubLSymbol $sym270$CPUSHNEW_ALL;
  private static final SubLList $list271;
  private static final SubLSymbol $sym272$ITEM;
  private static final SubLSymbol $sym273$ITEMS_VAR;
  private static final SubLSymbol $sym274$CSETF_DELETE;
  private static final SubLList $list275;
  private static final SubLList $list276;
  private static final SubLSymbol $kw277$TEST;
  private static final SubLSymbol $kw278$KEY;
  private static final SubLSymbol $sym279$CSETF;
  private static final SubLSymbol $sym280$DELETE;
  private static final SubLSymbol $sym281$CPUSH_END;
  private static final SubLSymbol $sym282$NEW_CONS;
  private static final SubLSymbol $sym283$LIST;
  private static final SubLSymbol $sym284$RPLACD_LAST;
  private static final SubLSymbol $sym285$CPUSHNEW_END;
  private static final SubLSymbol $sym286$ITEM_VAR;
  private static final SubLSymbol $sym287$MEMBER;
  private static final SubLSymbol $sym288$WAS_APPENDING_;
  private static final SubLSymbol $kw289$SL2JAVA;
  private static final SubLList $list290;
  private static final SubLList $list291;
  private static final SubLSymbol $sym292$EVAL;
  private static final SubLList $list293;
  private static final SubLList $list294;
  private static final SubLSymbol $sym295$SILENTLY;
  private static final SubLList $list296;
  private static final SubLSymbol $sym297$FIMPLIES;
  private static final SubLList $list298;
  private static final SubLSymbol $sym299$FXOR;
  private static final SubLList $list300;
  private static final SubLSymbol $sym301$FEQUIV;
  private static final SubLList $list302;
  private static final SubLSymbol $sym303$WITH_STATIC_AREA;

  @SubLTranslatedFile.SubL(source = "cycl/subl-macros.lisp", position = 660L)
  public static SubLObject until(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject test = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list1 );
    test = current.first();
    final SubLObject body;
    current = ( body = current.rest() );
    return ConsesLow.listS( $sym2$CDO, NIL, ConsesLow.list( test ), ConsesLow.append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subl-macros.lisp", position = 826L)
  public static SubLObject sublisp_while(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject test = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list1 );
    test = current.first();
    final SubLObject body;
    current = ( body = current.rest() );
    return ConsesLow.listS( $sym0$UNTIL, ConsesLow.list( $sym4$CNOT, test ), ConsesLow.append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subl-macros.lisp", position = 961L)
  public static SubLObject repeat_forever(final SubLObject macroform, final SubLObject environment)
  {
    final SubLObject datum = macroform.rest();
    final SubLObject body;
    final SubLObject current = body = datum;
    return ConsesLow.listS( $sym3$WHILE, T, ConsesLow.append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subl-macros.lisp", position = 1074L)
  public static SubLObject do_numbers(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list7 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject number_var = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list7 );
    number_var = current.first();
    current = current.rest();
    SubLObject allow_other_keys_p = NIL;
    SubLObject rest = current;
    SubLObject bad = NIL;
    SubLObject current_$1 = NIL;
    while ( NIL != rest)
    {
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list7 );
      current_$1 = rest.first();
      rest = rest.rest();
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list7 );
      if( NIL == conses_high.member( current_$1, $list8, UNPROVIDED, UNPROVIDED ) )
      {
        bad = T;
      }
      if( current_$1 == $kw9$ALLOW_OTHER_KEYS )
      {
        allow_other_keys_p = rest.first();
      }
      rest = rest.rest();
    }
    if( NIL != bad && NIL == allow_other_keys_p )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list7 );
    }
    final SubLObject start_tail = cdestructuring_bind.property_list_member( $kw10$START, current );
    final SubLObject start = ( NIL != start_tail ) ? conses_high.cadr( start_tail ) : ZERO_INTEGER;
    final SubLObject end_tail = cdestructuring_bind.property_list_member( $kw11$END, current );
    final SubLObject end = ( NIL != end_tail ) ? conses_high.cadr( end_tail ) : NIL;
    final SubLObject delta_tail = cdestructuring_bind.property_list_member( $kw12$DELTA, current );
    final SubLObject delta = ( NIL != delta_tail ) ? conses_high.cadr( delta_tail ) : ONE_INTEGER;
    final SubLObject done_tail = cdestructuring_bind.property_list_member( $kw13$DONE, current );
    final SubLObject done = ( NIL != done_tail ) ? conses_high.cadr( done_tail ) : NIL;
    final SubLObject body;
    current = ( body = temp );
    if( ZERO_INTEGER.eql( start ) && end.isInteger() && !end.isNegative() && ONE_INTEGER.eql( delta ) && NIL == done )
    {
      return ConsesLow.listS( $sym14$CDOTIMES, ConsesLow.list( number_var, end ), ConsesLow.append( body, NIL ) );
    }
    SubLObject clet_initializations = NIL;
    SubLObject delta_form = NIL;
    SubLObject update_form = NIL;
    SubLObject end_test_form = NIL;
    SubLObject iteration_form = NIL;
    if( ONE_INTEGER.eql( delta ) )
    {
      delta_form = ONE_INTEGER;
      update_form = ConsesLow.list( $sym15$1_, number_var );
    }
    else if( delta.isAtom() )
    {
      delta_form = delta;
      update_form = ConsesLow.list( $sym16$_, number_var, delta );
    }
    else
    {
      final SubLObject delta_var = $sym17$DELTA_VAR;
      clet_initializations = ConsesLow.cons( ConsesLow.list( delta_var, delta ), clet_initializations );
      delta_form = delta_var;
      update_form = ConsesLow.list( $sym16$_, number_var, delta_var );
    }
    if( NIL != end )
    {
      final SubLObject end_var = $sym18$END_VAR;
      clet_initializations = ConsesLow.cons( ConsesLow.list( end_var, end ), clet_initializations );
      end_test_form = ConsesLow.list( $sym19$DO_NUMBERS_ENDTEST_MACRO, number_var, delta_form, end_var );
    }
    if( NIL != done )
    {
      if( NIL != end_test_form )
      {
        end_test_form = ConsesLow.list( $sym20$COR, done, end_test_form );
      }
      else
      {
        end_test_form = done;
      }
    }
    iteration_form = ConsesLow.listS( $sym2$CDO, ConsesLow.list( ConsesLow.list( number_var, start, update_form ) ), ConsesLow.list( end_test_form ), ConsesLow.append( body, NIL ) );
    if( NIL != clet_initializations )
    {
      iteration_form = ConsesLow.list( $sym21$CLET, clet_initializations, iteration_form );
    }
    if( NIL != done )
    {
      iteration_form = ConsesLow.list( $sym22$PUNLESS, done, iteration_form );
    }
    return iteration_form;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subl-macros.lisp", position = 3260L)
  public static SubLObject do_numbers_endtest_macro(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject number_var = NIL;
    SubLObject delta_form = NIL;
    SubLObject end_var = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list23 );
    number_var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list23 );
    delta_form = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list23 );
    end_var = current.first();
    current = current.rest();
    if( NIL != current )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list23 );
      return NIL;
    }
    if( !delta_form.isNumber() )
    {
      return ConsesLow.list( $sym27$DO_NUMBERS_ENDTEST, number_var, delta_form, end_var );
    }
    if( delta_form.isPositive() )
    {
      return ConsesLow.list( $sym24$__, number_var, end_var );
    }
    if( delta_form.isNegative() )
    {
      return ConsesLow.list( $sym25$__, number_var, end_var );
    }
    return ConsesLow.list( $sym26$_, number_var, end_var );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subl-macros.lisp", position = 3658L)
  public static SubLObject do_numbers_endtest(final SubLObject number, final SubLObject delta, final SubLObject end)
  {
    if( delta.isPositive() )
    {
      return Numbers.numGE( number, end );
    }
    if( delta.isNegative() )
    {
      return Numbers.numLE( number, end );
    }
    return Numbers.numE( number, end );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subl-macros.lisp", position = 3875L)
  public static SubLObject do_list(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list29 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject var = NIL;
    SubLObject list = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list29 );
    var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list29 );
    list = current.first();
    current = current.rest();
    SubLObject allow_other_keys_p = NIL;
    SubLObject rest = current;
    SubLObject bad = NIL;
    SubLObject current_$2 = NIL;
    while ( NIL != rest)
    {
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list29 );
      current_$2 = rest.first();
      rest = rest.rest();
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list29 );
      if( NIL == conses_high.member( current_$2, $list30, UNPROVIDED, UNPROVIDED ) )
      {
        bad = T;
      }
      if( current_$2 == $kw9$ALLOW_OTHER_KEYS )
      {
        allow_other_keys_p = rest.first();
      }
      rest = rest.rest();
    }
    if( NIL != bad && NIL == allow_other_keys_p )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list29 );
    }
    final SubLObject done_tail = cdestructuring_bind.property_list_member( $kw13$DONE, current );
    final SubLObject done = ( NIL != done_tail ) ? conses_high.cadr( done_tail ) : NIL;
    final SubLObject progress_message_tail = cdestructuring_bind.property_list_member( $kw31$PROGRESS_MESSAGE, current );
    final SubLObject progress_message = ( NIL != progress_message_tail ) ? conses_high.cadr( progress_message_tail ) : NIL;
    final SubLObject body;
    current = ( body = temp );
    if( NIL != progress_message )
    {
      final SubLObject message_var = $sym32$MESSAGE_VAR;
      final SubLObject list_var = $sym33$LIST_VAR;
      final SubLObject sofar = $sym34$SOFAR;
      final SubLObject total = $sym35$TOTAL;
      return ConsesLow.list( $sym21$CLET, ConsesLow.list( ConsesLow.list( message_var, progress_message ), ConsesLow.list( list_var, list ), reader.bq_cons( sofar, $list36 ), ConsesLow.list( total, ConsesLow.list(
          $sym37$LENGTH, list_var ) ) ), ConsesLow.list( $sym38$NOTING_PERCENT_PROGRESS, message_var, ConsesLow.listS( $sym28$DO_LIST, ConsesLow.list( var, list_var, $kw13$DONE, done ), ConsesLow.list(
              $sym39$NOTE_PERCENT_PROGRESS, sofar, total ), ConsesLow.list( $sym40$CINC, sofar ), ConsesLow.append( body, NIL ) ) ) );
    }
    if( NIL != done )
    {
      final SubLObject rest_$3 = $sym41$REST;
      return ConsesLow.list( $sym2$CDO, ConsesLow.list( ConsesLow.list( rest_$3, list, ConsesLow.list( $sym42$CDR, rest_$3 ) ) ), ConsesLow.list( ConsesLow.list( $sym20$COR, done, ConsesLow.list( $sym43$NULL,
          rest_$3 ) ) ), ConsesLow.listS( $sym21$CLET, ConsesLow.list( ConsesLow.list( var, ConsesLow.list( $sym44$CAR, rest_$3 ) ) ), ConsesLow.append( body, NIL ) ) );
    }
    return ConsesLow.listS( $sym45$CDOLIST, ConsesLow.list( var, list ), ConsesLow.append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subl-macros.lisp", position = 4635L)
  public static SubLObject do_list_index(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list47 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject key = NIL;
    SubLObject value = NIL;
    SubLObject list = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list47 );
    key = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list47 );
    value = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list47 );
    list = current.first();
    current = current.rest();
    SubLObject allow_other_keys_p = NIL;
    SubLObject rest = current;
    SubLObject bad = NIL;
    SubLObject current_$4 = NIL;
    while ( NIL != rest)
    {
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list47 );
      current_$4 = rest.first();
      rest = rest.rest();
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list47 );
      if( NIL == conses_high.member( current_$4, $list48, UNPROVIDED, UNPROVIDED ) )
      {
        bad = T;
      }
      if( current_$4 == $kw9$ALLOW_OTHER_KEYS )
      {
        allow_other_keys_p = rest.first();
      }
      rest = rest.rest();
    }
    if( NIL != bad && NIL == allow_other_keys_p )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list47 );
    }
    final SubLObject done_tail = cdestructuring_bind.property_list_member( $kw13$DONE, current );
    final SubLObject done = ( NIL != done_tail ) ? conses_high.cadr( done_tail ) : NIL;
    final SubLObject body;
    current = ( body = temp );
    final SubLObject list_var = $sym49$LIST_VAR;
    return ConsesLow.listS( $sym2$CDO, ConsesLow.list( ConsesLow.list( list_var, list, ConsesLow.list( $sym42$CDR, list_var ) ), ConsesLow.list( value, ConsesLow.list( $sym44$CAR, list_var ), ConsesLow.list( $sym44$CAR,
        list_var ) ), ConsesLow.list( key, ZERO_INTEGER, ConsesLow.list( $sym15$1_, key ) ) ), ConsesLow.list( ConsesLow.list( $sym20$COR, done, ConsesLow.list( $sym43$NULL, list_var ) ) ), ConsesLow.append( body,
            NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subl-macros.lisp", position = 4992L)
  public static SubLObject do_alist(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list51 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject key = NIL;
    SubLObject value = NIL;
    SubLObject alist = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list51 );
    key = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list51 );
    value = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list51 );
    alist = current.first();
    current = current.rest();
    SubLObject allow_other_keys_p = NIL;
    SubLObject rest = current;
    SubLObject bad = NIL;
    SubLObject current_$5 = NIL;
    while ( NIL != rest)
    {
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list51 );
      current_$5 = rest.first();
      rest = rest.rest();
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list51 );
      if( NIL == conses_high.member( current_$5, $list52, UNPROVIDED, UNPROVIDED ) )
      {
        bad = T;
      }
      if( current_$5 == $kw9$ALLOW_OTHER_KEYS )
      {
        allow_other_keys_p = rest.first();
      }
      rest = rest.rest();
    }
    if( NIL != bad && NIL == allow_other_keys_p )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list51 );
    }
    final SubLObject index_tail = cdestructuring_bind.property_list_member( $kw53$INDEX, current );
    final SubLObject index = ( NIL != index_tail ) ? conses_high.cadr( index_tail ) : NIL;
    final SubLObject done_tail = cdestructuring_bind.property_list_member( $kw13$DONE, current );
    final SubLObject done = ( NIL != done_tail ) ? conses_high.cadr( done_tail ) : NIL;
    final SubLObject body;
    current = ( body = temp );
    if( NIL != index )
    {
      return ConsesLow.list( $sym21$CLET, ConsesLow.list( reader.bq_cons( index, $list36 ) ), ConsesLow.listS( $sym50$DO_ALIST, ConsesLow.list( key, value, alist, $kw13$DONE, done ), ConsesLow.append( body, ConsesLow
          .list( ConsesLow.list( $sym40$CINC, index ) ) ) ) );
    }
    final SubLObject cons = $sym54$CONS;
    return ConsesLow.list( $sym28$DO_LIST, ConsesLow.list( cons, alist, $kw13$DONE, done ), ConsesLow.listS( $sym55$CDESTRUCTURING_BIND, reader.bq_cons( key, value ), cons, ConsesLow.append( body, NIL ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subl-macros.lisp", position = 5409L)
  public static SubLObject do_alist_values(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list57 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject value = NIL;
    SubLObject alist = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list57 );
    value = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list57 );
    alist = current.first();
    current = current.rest();
    SubLObject allow_other_keys_p = NIL;
    SubLObject rest = current;
    SubLObject bad = NIL;
    SubLObject current_$6 = NIL;
    while ( NIL != rest)
    {
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list57 );
      current_$6 = rest.first();
      rest = rest.rest();
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list57 );
      if( NIL == conses_high.member( current_$6, $list48, UNPROVIDED, UNPROVIDED ) )
      {
        bad = T;
      }
      if( current_$6 == $kw9$ALLOW_OTHER_KEYS )
      {
        allow_other_keys_p = rest.first();
      }
      rest = rest.rest();
    }
    if( NIL != bad && NIL == allow_other_keys_p )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list57 );
    }
    final SubLObject done_tail = cdestructuring_bind.property_list_member( $kw13$DONE, current );
    final SubLObject done = ( NIL != done_tail ) ? conses_high.cadr( done_tail ) : NIL;
    final SubLObject body;
    current = ( body = temp );
    final SubLObject key = $sym58$KEY;
    return ConsesLow.listS( $sym50$DO_ALIST, ConsesLow.list( key, value, alist, $kw13$DONE, done ), ConsesLow.list( $sym59$IGNORE, key ), ConsesLow.append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subl-macros.lisp", position = 5594L)
  public static SubLObject do_alist_keys(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list61 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject key = NIL;
    SubLObject alist = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list61 );
    key = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list61 );
    alist = current.first();
    current = current.rest();
    SubLObject allow_other_keys_p = NIL;
    SubLObject rest = current;
    SubLObject bad = NIL;
    SubLObject current_$7 = NIL;
    while ( NIL != rest)
    {
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list61 );
      current_$7 = rest.first();
      rest = rest.rest();
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list61 );
      if( NIL == conses_high.member( current_$7, $list48, UNPROVIDED, UNPROVIDED ) )
      {
        bad = T;
      }
      if( current_$7 == $kw9$ALLOW_OTHER_KEYS )
      {
        allow_other_keys_p = rest.first();
      }
      rest = rest.rest();
    }
    if( NIL != bad && NIL == allow_other_keys_p )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list61 );
    }
    final SubLObject done_tail = cdestructuring_bind.property_list_member( $kw13$DONE, current );
    final SubLObject done = ( NIL != done_tail ) ? conses_high.cadr( done_tail ) : NIL;
    final SubLObject body;
    current = ( body = temp );
    final SubLObject value = $sym62$VALUE;
    return ConsesLow.listS( $sym50$DO_ALIST, ConsesLow.list( key, value, alist, $kw13$DONE, done ), ConsesLow.list( $sym59$IGNORE, value ), ConsesLow.append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subl-macros.lisp", position = 5779L)
  public static SubLObject cinc_alist(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject key = NIL;
    SubLObject alist = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list64 );
    key = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list64 );
    alist = current.first();
    current = current.rest();
    final SubLObject test = current.isCons() ? current.first() : EQL;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list64 );
    current = current.rest();
    final SubLObject increment = current.isCons() ? current.first() : ONE_INTEGER;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list64 );
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject entry = $sym65$ENTRY;
      return ConsesLow.list( $sym21$CLET, ConsesLow.list( ConsesLow.list( entry, ConsesLow.list( $sym66$ASSOC, key, alist, ConsesLow.list( $sym67$QUOTE, test ) ) ) ), ConsesLow.list( $sym22$PUNLESS, entry, ConsesLow
          .list( $sym68$CSETQ, entry, ConsesLow.listS( $sym69$CONS, key, $list36 ) ), ConsesLow.list( $sym70$CPUSH, entry, alist ) ), ConsesLow.list( $sym71$RPLACD, entry, ConsesLow.list( $sym16$_, ConsesLow.list(
              $sym42$CDR, entry ), increment ) ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list64 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subl-macros.lisp", position = 6324L)
  public static SubLObject cdec_alist(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject key = NIL;
    SubLObject alist = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list73 );
    key = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list73 );
    alist = current.first();
    current = current.rest();
    final SubLObject test = current.isCons() ? current.first() : EQL;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list73 );
    current = current.rest();
    final SubLObject decrement = current.isCons() ? current.first() : ONE_INTEGER;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list73 );
    current = current.rest();
    if( NIL == current )
    {
      return ConsesLow.list( $sym63$CINC_ALIST, key, alist, test, Numbers.minus( decrement ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list73 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subl-macros.lisp", position = 6709L)
  public static SubLObject do_plist(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list75 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject property = NIL;
    SubLObject value = NIL;
    SubLObject plist = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list75 );
    property = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list75 );
    value = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list75 );
    plist = current.first();
    current = current.rest();
    SubLObject allow_other_keys_p = NIL;
    SubLObject rest = current;
    SubLObject bad = NIL;
    SubLObject current_$8 = NIL;
    while ( NIL != rest)
    {
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list75 );
      current_$8 = rest.first();
      rest = rest.rest();
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list75 );
      if( NIL == conses_high.member( current_$8, $list48, UNPROVIDED, UNPROVIDED ) )
      {
        bad = T;
      }
      if( current_$8 == $kw9$ALLOW_OTHER_KEYS )
      {
        allow_other_keys_p = rest.first();
      }
      rest = rest.rest();
    }
    if( NIL != bad && NIL == allow_other_keys_p )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list75 );
    }
    final SubLObject done_tail = cdestructuring_bind.property_list_member( $kw13$DONE, current );
    final SubLObject done = ( NIL != done_tail ) ? conses_high.cadr( done_tail ) : NIL;
    final SubLObject body;
    current = ( body = temp );
    final SubLObject remainder = $sym76$REMAINDER;
    return ConsesLow.list( $sym2$CDO, ConsesLow.list( ConsesLow.list( remainder, plist, ConsesLow.list( $sym77$CDDR, remainder ) ) ), ConsesLow.list( ConsesLow.list( $sym20$COR, done, ConsesLow.list( $sym43$NULL,
        remainder ) ) ), ConsesLow.listS( $sym21$CLET, ConsesLow.list( ConsesLow.list( property, ConsesLow.list( $sym44$CAR, remainder ) ), ConsesLow.list( value, ConsesLow.list( $sym78$CADR, remainder ) ) ), ConsesLow
            .append( body, NIL ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subl-macros.lisp", position = 7134L)
  public static SubLObject do_plist_properties(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list80 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject property = NIL;
    SubLObject plist = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list80 );
    property = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list80 );
    plist = current.first();
    current = current.rest();
    SubLObject allow_other_keys_p = NIL;
    SubLObject rest = current;
    SubLObject bad = NIL;
    SubLObject current_$9 = NIL;
    while ( NIL != rest)
    {
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list80 );
      current_$9 = rest.first();
      rest = rest.rest();
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list80 );
      if( NIL == conses_high.member( current_$9, $list48, UNPROVIDED, UNPROVIDED ) )
      {
        bad = T;
      }
      if( current_$9 == $kw9$ALLOW_OTHER_KEYS )
      {
        allow_other_keys_p = rest.first();
      }
      rest = rest.rest();
    }
    if( NIL != bad && NIL == allow_other_keys_p )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list80 );
    }
    final SubLObject done_tail = cdestructuring_bind.property_list_member( $kw13$DONE, current );
    final SubLObject done = ( NIL != done_tail ) ? conses_high.cadr( done_tail ) : NIL;
    final SubLObject body;
    current = ( body = temp );
    final SubLObject value = $sym81$VALUE;
    return ConsesLow.listS( $sym74$DO_PLIST, ConsesLow.list( property, value, plist, $kw13$DONE, done ), ConsesLow.list( $sym59$IGNORE, value ), ConsesLow.append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subl-macros.lisp", position = 7335L)
  public static SubLObject do_plist_values(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list83 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject value = NIL;
    SubLObject plist = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list83 );
    value = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list83 );
    plist = current.first();
    current = current.rest();
    SubLObject allow_other_keys_p = NIL;
    SubLObject rest = current;
    SubLObject bad = NIL;
    SubLObject current_$10 = NIL;
    while ( NIL != rest)
    {
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list83 );
      current_$10 = rest.first();
      rest = rest.rest();
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list83 );
      if( NIL == conses_high.member( current_$10, $list48, UNPROVIDED, UNPROVIDED ) )
      {
        bad = T;
      }
      if( current_$10 == $kw9$ALLOW_OTHER_KEYS )
      {
        allow_other_keys_p = rest.first();
      }
      rest = rest.rest();
    }
    if( NIL != bad && NIL == allow_other_keys_p )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list83 );
    }
    final SubLObject done_tail = cdestructuring_bind.property_list_member( $kw13$DONE, current );
    final SubLObject done = ( NIL != done_tail ) ? conses_high.cadr( done_tail ) : NIL;
    final SubLObject body;
    current = ( body = temp );
    final SubLObject property = $sym84$PROPERTY;
    return ConsesLow.listS( $sym74$DO_PLIST, ConsesLow.list( property, value, plist, $kw13$DONE, done ), ConsesLow.list( $sym59$IGNORE, property ), ConsesLow.append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subl-macros.lisp", position = 7535L)
  public static SubLObject smart_csome(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list85 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject var = NIL;
    SubLObject list = NIL;
    SubLObject donevar = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list85 );
    var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list85 );
    list = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list85 );
    donevar = current.first();
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      return ConsesLow.listS( $sym28$DO_LIST, ConsesLow.list( var, list, $kw13$DONE, donevar ), ConsesLow.append( body, NIL ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list85 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subl-macros.lisp", position = 7683L)
  public static SubLObject cdocons(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list87 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject var = NIL;
    SubLObject listform = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list87 );
    var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list87 );
    listform = current.first();
    current = current.rest();
    SubLObject allow_other_keys_p = NIL;
    SubLObject rest = current;
    SubLObject bad = NIL;
    SubLObject current_$11 = NIL;
    while ( NIL != rest)
    {
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list87 );
      current_$11 = rest.first();
      rest = rest.rest();
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list87 );
      if( NIL == conses_high.member( current_$11, $list48, UNPROVIDED, UNPROVIDED ) )
      {
        bad = T;
      }
      if( current_$11 == $kw9$ALLOW_OTHER_KEYS )
      {
        allow_other_keys_p = rest.first();
      }
      rest = rest.rest();
    }
    if( NIL != bad && NIL == allow_other_keys_p )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list87 );
    }
    final SubLObject done_tail = cdestructuring_bind.property_list_member( $kw13$DONE, current );
    final SubLObject done = ( NIL != done_tail ) ? conses_high.cadr( done_tail ) : NIL;
    final SubLObject body;
    current = ( body = temp );
    if( NIL != done )
    {
      return ConsesLow.listS( $sym2$CDO, ConsesLow.list( ConsesLow.list( var, listform, ConsesLow.list( $sym42$CDR, var ) ) ), ConsesLow.list( ConsesLow.list( $sym20$COR, done, ConsesLow.list( $sym88$ATOM, var ) ) ),
          ConsesLow.append( body, NIL ) );
    }
    return ConsesLow.listS( $sym2$CDO, ConsesLow.list( ConsesLow.list( var, listform, ConsesLow.list( $sym42$CDR, var ) ) ), ConsesLow.list( ConsesLow.list( $sym88$ATOM, var ) ), ConsesLow.append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subl-macros.lisp", position = 8078L)
  public static SubLObject do_pairs(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list90 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject var1 = NIL;
    SubLObject var2 = NIL;
    SubLObject listform = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list90 );
    var1 = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list90 );
    var2 = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list90 );
    listform = current.first();
    current = current.rest();
    SubLObject allow_other_keys_p = NIL;
    SubLObject rest = current;
    SubLObject bad = NIL;
    SubLObject current_$12 = NIL;
    while ( NIL != rest)
    {
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list90 );
      current_$12 = rest.first();
      rest = rest.rest();
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list90 );
      if( NIL == conses_high.member( current_$12, $list48, UNPROVIDED, UNPROVIDED ) )
      {
        bad = T;
      }
      if( current_$12 == $kw9$ALLOW_OTHER_KEYS )
      {
        allow_other_keys_p = rest.first();
      }
      rest = rest.rest();
    }
    if( NIL != bad && NIL == allow_other_keys_p )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list90 );
    }
    final SubLObject done_tail = cdestructuring_bind.property_list_member( $kw13$DONE, current );
    final SubLObject done = ( NIL != done_tail ) ? conses_high.cadr( done_tail ) : NIL;
    final SubLObject body;
    current = ( body = temp );
    final SubLObject list = $sym91$LIST;
    return ConsesLow.list( $sym86$CDOCONS, ConsesLow.list( list, listform, $kw13$DONE, done ), ConsesLow.list( $sym21$CLET, ConsesLow.list( ConsesLow.list( var1, ConsesLow.list( $sym92$FIRST, list ) ) ), ConsesLow.listS(
        $sym93$CSOME, ConsesLow.list( var2, ConsesLow.list( $sym94$REST, list ), done ), ConsesLow.append( body, NIL ) ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subl-macros.lisp", position = 8419L)
  public static SubLObject do_list_with_tail(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list96 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject item = NIL;
    SubLObject tail = NIL;
    SubLObject listform = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list96 );
    item = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list96 );
    tail = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list96 );
    listform = current.first();
    current = current.rest();
    SubLObject allow_other_keys_p = NIL;
    SubLObject rest = current;
    SubLObject bad = NIL;
    SubLObject current_$13 = NIL;
    while ( NIL != rest)
    {
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list96 );
      current_$13 = rest.first();
      rest = rest.rest();
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list96 );
      if( NIL == conses_high.member( current_$13, $list48, UNPROVIDED, UNPROVIDED ) )
      {
        bad = T;
      }
      if( current_$13 == $kw9$ALLOW_OTHER_KEYS )
      {
        allow_other_keys_p = rest.first();
      }
      rest = rest.rest();
    }
    if( NIL != bad && NIL == allow_other_keys_p )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list96 );
    }
    final SubLObject done_tail = cdestructuring_bind.property_list_member( $kw13$DONE, current );
    final SubLObject done = ( NIL != done_tail ) ? conses_high.cadr( done_tail ) : NIL;
    final SubLObject body;
    current = ( body = temp );
    final SubLObject cdr_var = $sym97$CDR_VAR;
    return ConsesLow.list( $sym86$CDOCONS, ConsesLow.list( cdr_var, listform, $kw13$DONE, done ), ConsesLow.listS( $sym21$CLET, ConsesLow.list( ConsesLow.list( item, ConsesLow.list( $sym44$CAR, cdr_var ) ), ConsesLow
        .list( tail, ConsesLow.list( $sym42$CDR, cdr_var ) ) ), ConsesLow.append( body, NIL ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subl-macros.lisp", position = 8664L)
  public static SubLObject dolists(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list99 );
    final SubLObject temp = current.rest();
    final SubLObject specs;
    current = ( specs = current.first() );
    final SubLObject body;
    current = ( body = temp );
    SubLObject forms = NIL;
    SubLObject steppers = NIL;
    SubLObject cdolist_list_var = specs;
    SubLObject spec = NIL;
    spec = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject var = spec.first();
      final SubLObject list = conses_high.cadr( spec );
      final SubLObject listvar = Symbols.make_symbol( PrintLow.format( NIL, $str100$CURRENT__A, var ) );
      forms = ConsesLow.cons( ConsesLow.list( listvar, list, ConsesLow.list( $sym42$CDR, listvar ) ), forms );
      forms = ConsesLow.cons( ConsesLow.list( var, ConsesLow.list( $sym44$CAR, listvar ), ConsesLow.list( $sym44$CAR, listvar ) ), forms );
      cdolist_list_var = cdolist_list_var.rest();
      spec = cdolist_list_var.first();
    }
    forms = Sequences.nreverse( forms );
    SubLObject current_forms = NIL;
    SubLObject stepper = NIL;
    current_forms = forms;
    stepper = conses_high.caar( current_forms );
    while ( NIL != current_forms)
    {
      steppers = ConsesLow.cons( stepper, steppers );
      current_forms = conses_high.cddr( current_forms );
      stepper = conses_high.caar( current_forms );
    }
    return ConsesLow.listS( $sym2$CDO, forms, ConsesLow.list( ConsesLow.list( $sym4$CNOT, reader.bq_cons( $sym101$CAND, ConsesLow.append( steppers, NIL ) ) ) ), ConsesLow.append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subl-macros.lisp", position = 9265L)
  public static SubLObject do_string(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list103 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject v_char = NIL;
    SubLObject string = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list103 );
    v_char = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list103 );
    string = current.first();
    current = current.rest();
    SubLObject allow_other_keys_p = NIL;
    SubLObject rest = current;
    SubLObject bad = NIL;
    SubLObject current_$14 = NIL;
    while ( NIL != rest)
    {
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list103 );
      current_$14 = rest.first();
      rest = rest.rest();
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list103 );
      if( NIL == conses_high.member( current_$14, $list104, UNPROVIDED, UNPROVIDED ) )
      {
        bad = T;
      }
      if( current_$14 == $kw9$ALLOW_OTHER_KEYS )
      {
        allow_other_keys_p = rest.first();
      }
      rest = rest.rest();
    }
    if( NIL != bad && NIL == allow_other_keys_p )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list103 );
    }
    final SubLObject start_tail = cdestructuring_bind.property_list_member( $kw10$START, current );
    final SubLObject start = ( NIL != start_tail ) ? conses_high.cadr( start_tail ) : ZERO_INTEGER;
    final SubLObject end_tail = cdestructuring_bind.property_list_member( $kw11$END, current );
    final SubLObject end = ( NIL != end_tail ) ? conses_high.cadr( end_tail ) : NIL;
    final SubLObject char_num_tail = cdestructuring_bind.property_list_member( $kw105$CHAR_NUM, current );
    final SubLObject char_num = ( NIL != char_num_tail ) ? conses_high.cadr( char_num_tail ) : NIL;
    final SubLObject done_tail = cdestructuring_bind.property_list_member( $kw13$DONE, current );
    final SubLObject done = ( NIL != done_tail ) ? conses_high.cadr( done_tail ) : NIL;
    final SubLObject body;
    current = ( body = temp );
    if( NIL != char_num )
    {
      return ConsesLow.listS( $sym106$DO_STRING_INDEX, ConsesLow.list( new SubLObject[] { char_num, v_char, string, $kw10$START, start, $kw11$END, end, $kw13$DONE, done
      } ), ConsesLow.append( body, NIL ) );
    }
    final SubLObject char_num_$15 = $sym107$CHAR_NUM;
    return ConsesLow.listS( $sym102$DO_STRING, ConsesLow.list( new SubLObject[] { v_char, string, $kw105$CHAR_NUM, char_num_$15, $kw10$START, start, $kw11$END, end, $kw13$DONE, done
    } ), ConsesLow.list( $sym59$IGNORE, char_num_$15 ), ConsesLow.append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subl-macros.lisp", position = 10034L)
  public static SubLObject do_string_index(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list108 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject char_num = NIL;
    SubLObject v_char = NIL;
    SubLObject string = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list108 );
    char_num = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list108 );
    v_char = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list108 );
    string = current.first();
    current = current.rest();
    SubLObject allow_other_keys_p = NIL;
    SubLObject rest = current;
    SubLObject bad = NIL;
    SubLObject current_$16 = NIL;
    while ( NIL != rest)
    {
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list108 );
      current_$16 = rest.first();
      rest = rest.rest();
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list108 );
      if( NIL == conses_high.member( current_$16, $list109, UNPROVIDED, UNPROVIDED ) )
      {
        bad = T;
      }
      if( current_$16 == $kw9$ALLOW_OTHER_KEYS )
      {
        allow_other_keys_p = rest.first();
      }
      rest = rest.rest();
    }
    if( NIL != bad && NIL == allow_other_keys_p )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list108 );
    }
    final SubLObject start_tail = cdestructuring_bind.property_list_member( $kw10$START, current );
    final SubLObject start = ( NIL != start_tail ) ? conses_high.cadr( start_tail ) : ZERO_INTEGER;
    final SubLObject end_tail = cdestructuring_bind.property_list_member( $kw11$END, current );
    final SubLObject end = ( NIL != end_tail ) ? conses_high.cadr( end_tail ) : NIL;
    final SubLObject done_tail = cdestructuring_bind.property_list_member( $kw13$DONE, current );
    final SubLObject done = ( NIL != done_tail ) ? conses_high.cadr( done_tail ) : NIL;
    final SubLObject body;
    current = ( body = temp );
    final SubLObject string_var = $sym110$STRING_VAR;
    final SubLObject end_var = $sym111$END_VAR;
    SubLObject end_init_form = NIL;
    if( end.isInteger() )
    {
      end_init_form = end;
    }
    else if( NIL == end )
    {
      end_init_form = ConsesLow.list( $sym37$LENGTH, string_var );
    }
    else
    {
      end_init_form = ConsesLow.list( $sym112$FIF, end, end, ConsesLow.list( $sym37$LENGTH, string_var ) );
    }
    return ConsesLow.list( $sym21$CLET, ConsesLow.list( ConsesLow.list( string_var, string ), ConsesLow.list( end_var, end_init_form ) ), ConsesLow.list( $sym6$DO_NUMBERS, ConsesLow.list( char_num, $kw10$START, start,
        $kw11$END, end_var, $kw13$DONE, done ), ConsesLow.listS( $sym21$CLET, ConsesLow.list( ConsesLow.list( v_char, ConsesLow.list( $sym113$CHAR, string_var, char_num ) ) ), ConsesLow.append( body, NIL ) ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subl-macros.lisp", position = 10849L)
  public static SubLObject do_vector(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list115 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject var = NIL;
    SubLObject vector = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list115 );
    var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list115 );
    vector = current.first();
    current = current.rest();
    SubLObject allow_other_keys_p = NIL;
    SubLObject rest = current;
    SubLObject bad = NIL;
    SubLObject current_$17 = NIL;
    while ( NIL != rest)
    {
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list115 );
      current_$17 = rest.first();
      rest = rest.rest();
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list115 );
      if( NIL == conses_high.member( current_$17, $list116, UNPROVIDED, UNPROVIDED ) )
      {
        bad = T;
      }
      if( current_$17 == $kw9$ALLOW_OTHER_KEYS )
      {
        allow_other_keys_p = rest.first();
      }
      rest = rest.rest();
    }
    if( NIL != bad && NIL == allow_other_keys_p )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list115 );
    }
    final SubLObject element_num_tail = cdestructuring_bind.property_list_member( $kw117$ELEMENT_NUM, current );
    final SubLObject element_num = ( NIL != element_num_tail ) ? conses_high.cadr( element_num_tail ) : NIL;
    final SubLObject done_tail = cdestructuring_bind.property_list_member( $kw13$DONE, current );
    final SubLObject done = ( NIL != done_tail ) ? conses_high.cadr( done_tail ) : NIL;
    final SubLObject backwardP_tail = cdestructuring_bind.property_list_member( $kw118$BACKWARD_, current );
    final SubLObject backwardP = ( NIL != backwardP_tail ) ? conses_high.cadr( backwardP_tail ) : NIL;
    final SubLObject body;
    current = ( body = temp );
    if( NIL != element_num )
    {
      return ConsesLow.listS( $sym119$DO_VECTOR_INDEX, ConsesLow.list( element_num, var, vector, $kw13$DONE, done, $kw118$BACKWARD_, backwardP ), ConsesLow.append( body, NIL ) );
    }
    final SubLObject element_num_$18 = $sym120$ELEMENT_NUM;
    return ConsesLow.listS( $sym119$DO_VECTOR_INDEX, ConsesLow.list( element_num_$18, var, vector, $kw13$DONE, done, $kw118$BACKWARD_, backwardP ), ConsesLow.list( $sym59$IGNORE, element_num_$18 ), ConsesLow.append(
        body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subl-macros.lisp", position = 11518L)
  public static SubLObject do_vector_index(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list121 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject key = NIL;
    SubLObject value = NIL;
    SubLObject vector = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list121 );
    key = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list121 );
    value = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list121 );
    vector = current.first();
    current = current.rest();
    SubLObject allow_other_keys_p = NIL;
    SubLObject rest = current;
    SubLObject bad = NIL;
    SubLObject current_$19 = NIL;
    while ( NIL != rest)
    {
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list121 );
      current_$19 = rest.first();
      rest = rest.rest();
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list121 );
      if( NIL == conses_high.member( current_$19, $list122, UNPROVIDED, UNPROVIDED ) )
      {
        bad = T;
      }
      if( current_$19 == $kw9$ALLOW_OTHER_KEYS )
      {
        allow_other_keys_p = rest.first();
      }
      rest = rest.rest();
    }
    if( NIL != bad && NIL == allow_other_keys_p )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list121 );
    }
    final SubLObject done_tail = cdestructuring_bind.property_list_member( $kw13$DONE, current );
    final SubLObject done = ( NIL != done_tail ) ? conses_high.cadr( done_tail ) : NIL;
    final SubLObject backwardP_tail = cdestructuring_bind.property_list_member( $kw118$BACKWARD_, current );
    final SubLObject backwardP = ( NIL != backwardP_tail ) ? conses_high.cadr( backwardP_tail ) : NIL;
    final SubLObject body;
    current = ( body = temp );
    final SubLObject vector_var = $sym123$VECTOR_VAR;
    final SubLObject backwardP_var = $sym124$BACKWARD__VAR;
    final SubLObject length = $sym125$LENGTH;
    if( NIL != done )
    {
      final SubLObject start = $sym126$START;
      final SubLObject end = $sym127$END;
      final SubLObject delta = $sym128$DELTA;
      return ConsesLow.list( $sym21$CLET, ConsesLow.list( ConsesLow.list( vector_var, vector ), ConsesLow.list( backwardP_var, backwardP ), ConsesLow.list( length, ConsesLow.list( $sym37$LENGTH, vector_var ) ) ),
          ConsesLow.list( $sym55$CDESTRUCTURING_BIND, ConsesLow.list( start, end, delta ), ConsesLow.list( $sym112$FIF, backwardP_var, ConsesLow.listS( $sym129$LIST, ConsesLow.listS( $sym130$_, length, $list131 ),
              $list132 ), ConsesLow.listS( $sym129$LIST, ZERO_INTEGER, length, $list131 ) ), ConsesLow.list( $sym6$DO_NUMBERS, ConsesLow.list( new SubLObject[]
              { key, $kw10$START, start, $kw11$END, end, $kw13$DONE, done, $kw12$DELTA, delta
          } ), ConsesLow.listS( $sym21$CLET, ConsesLow.list( ConsesLow.list( value, ConsesLow.list( $sym133$AREF, vector_var, key ) ) ), ConsesLow.append( body, NIL ) ) ) ) );
    }
    final SubLObject v_iteration = $sym134$ITERATION;
    return ConsesLow.list( $sym21$CLET, ConsesLow.list( ConsesLow.list( vector_var, vector ), ConsesLow.list( backwardP_var, backwardP ), ConsesLow.list( length, ConsesLow.list( $sym37$LENGTH, vector_var ) ) ), ConsesLow
        .list( $sym14$CDOTIMES, ConsesLow.list( v_iteration, length ), ConsesLow.listS( $sym21$CLET, ConsesLow.list( ConsesLow.list( key, ConsesLow.list( $sym112$FIF, backwardP_var, ConsesLow.listS( $sym130$_, length,
            v_iteration, $list131 ), v_iteration ) ), ConsesLow.list( value, ConsesLow.list( $sym133$AREF, vector_var, key ) ) ), ConsesLow.append( body, NIL ) ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subl-macros.lisp", position = 12500L)
  public static SubLObject cdovector(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list136 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject var = NIL;
    SubLObject vector = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list136 );
    var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list136 );
    vector = current.first();
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      return ConsesLow.listS( $sym114$DO_VECTOR, ConsesLow.list( var, vector ), ConsesLow.append( body, NIL ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list136 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subl-macros.lisp", position = 12641L)
  public static SubLObject csome_vector(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list138 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject var = NIL;
    SubLObject vector = NIL;
    SubLObject donevar = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list138 );
    var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list138 );
    vector = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list138 );
    donevar = current.first();
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      return ConsesLow.listS( $sym114$DO_VECTOR, ConsesLow.list( var, vector, $kw13$DONE, donevar ), ConsesLow.append( body, NIL ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list138 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subl-macros.lisp", position = 12807L)
  public static SubLObject smart_csomevector(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list138 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject var = NIL;
    SubLObject vector = NIL;
    SubLObject donevar = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list138 );
    var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list138 );
    vector = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list138 );
    donevar = current.first();
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      return ConsesLow.listS( $sym114$DO_VECTOR, ConsesLow.list( var, vector, $kw13$DONE, donevar ), ConsesLow.append( body, NIL ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list138 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subl-macros.lisp", position = 12978L)
  public static SubLObject do_sequence(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list141 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject var = NIL;
    SubLObject sequence = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list141 );
    var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list141 );
    sequence = current.first();
    current = current.rest();
    SubLObject allow_other_keys_p = NIL;
    SubLObject rest = current;
    SubLObject bad = NIL;
    SubLObject current_$20 = NIL;
    while ( NIL != rest)
    {
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list141 );
      current_$20 = rest.first();
      rest = rest.rest();
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list141 );
      if( NIL == conses_high.member( current_$20, $list142, UNPROVIDED, UNPROVIDED ) )
      {
        bad = T;
      }
      if( current_$20 == $kw9$ALLOW_OTHER_KEYS )
      {
        allow_other_keys_p = rest.first();
      }
      rest = rest.rest();
    }
    if( NIL != bad && NIL == allow_other_keys_p )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list141 );
    }
    final SubLObject element_num_tail = cdestructuring_bind.property_list_member( $kw117$ELEMENT_NUM, current );
    final SubLObject element_num = ( NIL != element_num_tail ) ? conses_high.cadr( element_num_tail ) : NIL;
    final SubLObject done_tail = cdestructuring_bind.property_list_member( $kw13$DONE, current );
    final SubLObject done = ( NIL != done_tail ) ? conses_high.cadr( done_tail ) : NIL;
    final SubLObject body;
    current = ( body = temp );
    if( NIL != element_num )
    {
      return ConsesLow.listS( $sym143$DO_SEQUENCE_INDEX, ConsesLow.list( element_num, var, sequence, $kw13$DONE, done ), ConsesLow.append( body, NIL ) );
    }
    final SubLObject element_num_$21 = $sym144$ELEMENT_NUM;
    return ConsesLow.listS( $sym143$DO_SEQUENCE_INDEX, ConsesLow.list( element_num_$21, var, sequence, $kw13$DONE, done ), ConsesLow.list( $sym59$IGNORE, element_num_$21 ), ConsesLow.append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subl-macros.lisp", position = 13552L)
  public static SubLObject do_sequence_index(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list145 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject key_var = NIL;
    SubLObject value_var = NIL;
    SubLObject sequence = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list145 );
    key_var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list145 );
    value_var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list145 );
    sequence = current.first();
    current = current.rest();
    SubLObject allow_other_keys_p = NIL;
    SubLObject rest = current;
    SubLObject bad = NIL;
    SubLObject current_$22 = NIL;
    while ( NIL != rest)
    {
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list145 );
      current_$22 = rest.first();
      rest = rest.rest();
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list145 );
      if( NIL == conses_high.member( current_$22, $list48, UNPROVIDED, UNPROVIDED ) )
      {
        bad = T;
      }
      if( current_$22 == $kw9$ALLOW_OTHER_KEYS )
      {
        allow_other_keys_p = rest.first();
      }
      rest = rest.rest();
    }
    if( NIL != bad && NIL == allow_other_keys_p )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list145 );
    }
    final SubLObject done_tail = cdestructuring_bind.property_list_member( $kw13$DONE, current );
    final SubLObject done = ( NIL != done_tail ) ? conses_high.cadr( done_tail ) : NIL;
    final SubLObject body;
    current = ( body = temp );
    final SubLObject sequence_var = $sym146$SEQUENCE_VAR;
    final SubLObject end_index = $sym147$END_INDEX;
    final SubLObject sequence_doneP = $sym148$SEQUENCE_DONE_;
    return ConsesLow.list( $sym21$CLET, ConsesLow.list( ConsesLow.list( sequence_var, sequence ), ConsesLow.list( end_index, ConsesLow.list( $sym149$FUNLESS, ConsesLow.list( $sym150$LISTP, sequence_var ), ConsesLow.list(
        $sym37$LENGTH, sequence_var ) ) ), reader.bq_cons( key_var, $list36 ), ConsesLow.list( sequence_doneP, ConsesLow.list( $sym151$DO_SEQUENCE_INDEX_DONE_, key_var, end_index, sequence_var ) ) ), ConsesLow.list(
            $sym3$WHILE, ConsesLow.list( $sym101$CAND, ConsesLow.list( $sym4$CNOT, sequence_doneP ), ConsesLow.list( $sym4$CNOT, done ) ), ConsesLow.listS( $sym21$CLET, ConsesLow.list( ConsesLow.list( value_var,
                ConsesLow.list( $sym152$DO_SEQUENCE_INDEX_VALUE_, key_var, sequence_var ) ) ), ConsesLow.append( body, ConsesLow.list( ConsesLow.list( $sym153$PROGN, ConsesLow.list( $sym68$CSETQ, sequence_var, ConsesLow
                    .list( $sym154$DO_SEQUENCE_INDEX_UPDATE, sequence_var ) ), ConsesLow.list( $sym40$CINC, key_var ), ConsesLow.list( $sym68$CSETQ, sequence_doneP, ConsesLow.list( $sym151$DO_SEQUENCE_INDEX_DONE_,
                        key_var, end_index, sequence_var ) ) ) ) ) ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subl-macros.lisp", position = 14352L)
  public static SubLObject do_sequence_index_doneP(final SubLObject index, final SubLObject end_index, final SubLObject sequence)
  {
    if( sequence.isList() )
    {
      return Types.sublisp_null( sequence );
    }
    return Numbers.numE( index, end_index );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subl-macros.lisp", position = 14560L)
  public static SubLObject do_sequence_index_valueP(final SubLObject index, final SubLObject sequence)
  {
    if( sequence.isList() )
    {
      return sequence.first();
    }
    if( sequence.isVector() )
    {
      return Vectors.aref( sequence, index );
    }
    return Strings.sublisp_char( sequence, index );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subl-macros.lisp", position = 14830L)
  public static SubLObject do_sequence_index_update(final SubLObject sequence)
  {
    if( sequence.isList() )
    {
      return sequence.rest();
    }
    return sequence;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subl-macros.lisp", position = 14994L)
  public static SubLObject do_hash_table(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list156 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject key = NIL;
    SubLObject value = NIL;
    SubLObject hash_table = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list156 );
    key = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list156 );
    value = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list156 );
    hash_table = current.first();
    current = current.rest();
    SubLObject allow_other_keys_p = NIL;
    SubLObject rest = current;
    SubLObject bad = NIL;
    SubLObject current_$23 = NIL;
    while ( NIL != rest)
    {
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list156 );
      current_$23 = rest.first();
      rest = rest.rest();
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list156 );
      if( NIL == conses_high.member( current_$23, $list30, UNPROVIDED, UNPROVIDED ) )
      {
        bad = T;
      }
      if( current_$23 == $kw9$ALLOW_OTHER_KEYS )
      {
        allow_other_keys_p = rest.first();
      }
      rest = rest.rest();
    }
    if( NIL != bad && NIL == allow_other_keys_p )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list156 );
    }
    final SubLObject done_tail = cdestructuring_bind.property_list_member( $kw13$DONE, current );
    final SubLObject done = ( NIL != done_tail ) ? conses_high.cadr( done_tail ) : NIL;
    final SubLObject progress_message_tail = cdestructuring_bind.property_list_member( $kw31$PROGRESS_MESSAGE, current );
    final SubLObject progress_message = ( NIL != progress_message_tail ) ? conses_high.cadr( progress_message_tail ) : NIL;
    final SubLObject body;
    current = ( body = temp );
    if( NIL != progress_message )
    {
      final SubLObject message_var = $sym157$MESSAGE_VAR;
      final SubLObject silentP = $sym158$SILENT_;
      final SubLObject table_var = $sym159$TABLE_VAR;
      final SubLObject index_var = $sym160$INDEX_VAR;
      final SubLObject count_var = $sym161$COUNT_VAR;
      return ConsesLow.list( $sym21$CLET, ConsesLow.list( ConsesLow.list( message_var, progress_message ), reader.bq_cons( silentP, $list162 ), ConsesLow.list( $sym163$_SILENT_PROGRESS__, ConsesLow.list( $sym20$COR,
          silentP, ConsesLow.list( $sym43$NULL, message_var ) ) ) ), ConsesLow.list( $sym38$NOTING_PERCENT_PROGRESS, ConsesLow.listS( $sym164$FIRST_OF, message_var, $list165 ), ConsesLow.list( $sym21$CLET, ConsesLow
              .list( ConsesLow.list( table_var, hash_table ), reader.bq_cons( index_var, $list36 ), ConsesLow.list( count_var, ConsesLow.list( $sym166$HASH_TABLE_COUNT, table_var ) ) ), ConsesLow.list(
                  $sym155$DO_HASH_TABLE, ConsesLow.list( key, value, table_var, $kw13$DONE, done ), ConsesLow.listS( $sym21$CLET, ConsesLow.list( ConsesLow.list( $sym163$_SILENT_PROGRESS__, silentP ) ), ConsesLow.append(
                      body, NIL ) ), ConsesLow.list( $sym68$CSETQ, index_var, ConsesLow.list( $sym15$1_, index_var ) ), ConsesLow.list( $sym39$NOTE_PERCENT_PROGRESS, index_var, count_var ) ) ) ) );
    }
    if( NIL != done )
    {
      return ConsesLow.list( $sym22$PUNLESS, done, ConsesLow.list( $sym167$CCATCH_IGNORE, $kw168$DO_HASH_TABLE, ConsesLow.listS( $sym155$DO_HASH_TABLE, ConsesLow.list( key, value, hash_table ), ConsesLow.list(
          $sym169$DO_HASH_TABLE_DONE_CHECK, done ), ConsesLow.append( body, NIL ) ) ) );
    }
    return ConsesLow.listS( $sym170$CDOHASH, ConsesLow.list( key, value, hash_table ), ConsesLow.append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subl-macros.lisp", position = 16171L)
  public static SubLObject do_hash_table_done_check(final SubLObject done)
  {
    if( NIL != done )
    {
      Dynamic.sublisp_throw( $kw168$DO_HASH_TABLE, NIL );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subl-macros.lisp", position = 16305L)
  public static SubLObject do_hash_table_keys(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list172 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject key = NIL;
    SubLObject hash_table = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list172 );
    key = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list172 );
    hash_table = current.first();
    current = current.rest();
    SubLObject allow_other_keys_p = NIL;
    SubLObject rest = current;
    SubLObject bad = NIL;
    SubLObject current_$24 = NIL;
    while ( NIL != rest)
    {
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list172 );
      current_$24 = rest.first();
      rest = rest.rest();
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list172 );
      if( NIL == conses_high.member( current_$24, $list30, UNPROVIDED, UNPROVIDED ) )
      {
        bad = T;
      }
      if( current_$24 == $kw9$ALLOW_OTHER_KEYS )
      {
        allow_other_keys_p = rest.first();
      }
      rest = rest.rest();
    }
    if( NIL != bad && NIL == allow_other_keys_p )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list172 );
    }
    final SubLObject done_tail = cdestructuring_bind.property_list_member( $kw13$DONE, current );
    final SubLObject done = ( NIL != done_tail ) ? conses_high.cadr( done_tail ) : NIL;
    final SubLObject progress_message_tail = cdestructuring_bind.property_list_member( $kw31$PROGRESS_MESSAGE, current );
    final SubLObject progress_message = ( NIL != progress_message_tail ) ? conses_high.cadr( progress_message_tail ) : NIL;
    final SubLObject body;
    current = ( body = temp );
    final SubLObject no_value = $sym173$NO_VALUE;
    return ConsesLow.listS( $sym155$DO_HASH_TABLE, ConsesLow.list( key, no_value, hash_table, $kw13$DONE, done, $kw31$PROGRESS_MESSAGE, progress_message ), ConsesLow.list( $sym59$IGNORE, no_value ), ConsesLow.append(
        body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subl-macros.lisp", position = 16572L)
  public static SubLObject ccatch_ignore(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject tag = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list174 );
    tag = current.first();
    final SubLObject body;
    current = ( body = current.rest() );
    final SubLObject catch_var = $sym175$CATCH_VAR;
    return ConsesLow.list( $sym21$CLET, ConsesLow.list( catch_var ), ConsesLow.list( $sym59$IGNORE, catch_var ), ConsesLow.listS( $sym176$CCATCH, tag, catch_var, ConsesLow.append( body, NIL ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subl-macros.lisp", position = 16896L)
  public static SubLObject punless_error(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject form = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list178 );
    form = current.first();
    final SubLObject body;
    current = ( body = current.rest() );
    final SubLObject error = $sym179$ERROR;
    return ConsesLow.list( $sym21$CLET, ConsesLow.list( error ), ConsesLow.list( $sym180$CATCH_ERROR_MESSAGE, ConsesLow.list( error ), form ), ConsesLow.listS( $sym22$PUNLESS, error, ConsesLow.append( body, NIL ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subl-macros.lisp", position = 17187L)
  public static SubLObject pwhen_error(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject form = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list178 );
    form = current.first();
    final SubLObject body;
    current = ( body = current.rest() );
    final SubLObject error = $sym182$ERROR;
    return ConsesLow.list( $sym21$CLET, ConsesLow.list( error ), ConsesLow.list( $sym180$CATCH_ERROR_MESSAGE, ConsesLow.list( error ), form ), ConsesLow.listS( $sym183$PWHEN, error, ConsesLow.append( body, NIL ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subl-macros.lisp", position = 17419L)
  public static SubLObject warn_on_errors(final SubLObject macroform, final SubLObject environment)
  {
    final SubLObject datum = macroform.rest();
    final SubLObject body;
    final SubLObject current = body = datum;
    final SubLObject message_var = $sym185$MESSAGE_VAR;
    return ConsesLow.list( $sym21$CLET, ConsesLow.list( message_var ), ConsesLow.list( $sym186$WITHOUT_APPENDING_STACK_TRACES_TO_ERROR_MESSAGES, ConsesLow.listS( $sym180$CATCH_ERROR_MESSAGE, ConsesLow.list(
        message_var ), ConsesLow.append( body, NIL ) ) ), ConsesLow.list( $sym183$PWHEN, ConsesLow.list( $sym187$STRINGP, message_var ), ConsesLow.list( $sym188$WARN, $str189$_A, message_var ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subl-macros.lisp", position = 17841L)
  public static SubLObject possibly_warn_on_errors(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject var = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list191 );
    var = current.first();
    final SubLObject body;
    current = ( body = current.rest() );
    return ConsesLow.list( $sym192$PIF, var, reader.bq_cons( $sym184$WARN_ON_ERRORS, ConsesLow.append( body, NIL ) ), reader.bq_cons( $sym153$PROGN, ConsesLow.append( body, NIL ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subl-macros.lisp", position = 18019L)
  public static SubLObject possibly_ignore_errors(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject var = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list191 );
    var = current.first();
    final SubLObject body;
    current = ( body = current.rest() );
    return ConsesLow.list( $sym192$PIF, var, reader.bq_cons( $sym194$IGNORE_ERRORS, ConsesLow.append( body, NIL ) ), reader.bq_cons( $sym153$PROGN, ConsesLow.append( body, NIL ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subl-macros.lisp", position = 18166L)
  public static SubLObject warn_or_ignore_errors(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject var = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list191 );
    var = current.first();
    final SubLObject body;
    current = ( body = current.rest() );
    return ConsesLow.list( $sym192$PIF, var, reader.bq_cons( $sym184$WARN_ON_ERRORS, ConsesLow.append( body, NIL ) ), reader.bq_cons( $sym194$IGNORE_ERRORS, ConsesLow.append( body, NIL ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subl-macros.lisp", position = 18421L)
  public static SubLObject with_default_error_handling(final SubLObject macroform, final SubLObject environment)
  {
    final SubLObject datum = macroform.rest();
    final SubLObject body;
    final SubLObject current = body = datum;
    return ConsesLow.listS( $sym197$WITH_ERROR_HANDLER, NIL, ConsesLow.append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subl-macros.lisp", position = 18577L)
  public static SubLObject cunwind_on_failure(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject protected_form = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list199 );
    protected_form = current.first();
    final SubLObject body;
    current = ( body = current.rest() );
    final SubLObject success_var = $sym200$SUCCESS_VAR;
    return ConsesLow.list( $sym21$CLET, ConsesLow.list( success_var ), ConsesLow.list( $sym201$CUNWIND_PROTECT, ConsesLow.list( $sym153$PROGN, protected_form, ConsesLow.listS( $sym68$CSETQ, success_var, $list202 ) ),
        ConsesLow.listS( $sym22$PUNLESS, success_var, ConsesLow.append( body, NIL ) ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subl-macros.lisp", position = 18955L)
  public static SubLObject cunwind_protect_with_fail_clause(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject protected_form = NIL;
    SubLObject failure_form = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list204 );
    protected_form = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list204 );
    failure_form = current.first();
    final SubLObject body;
    current = ( body = current.rest() );
    final SubLObject success_var = $sym205$SUCCESS_VAR;
    return ConsesLow.list( $sym21$CLET, ConsesLow.list( success_var ), ConsesLow.list( $sym201$CUNWIND_PROTECT, ConsesLow.list( $sym153$PROGN, protected_form, ConsesLow.listS( $sym68$CSETQ, success_var, $list202 ) ),
        ConsesLow.listS( $sym201$CUNWIND_PROTECT, ConsesLow.list( $sym22$PUNLESS, success_var, failure_form ), ConsesLow.append( body, NIL ) ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subl-macros.lisp", position = 19827L)
  public static SubLObject assert_type(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject v_object = NIL;
    SubLObject pred = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list208 );
    v_object = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list208 );
    pred = current.first();
    current = current.rest();
    if( NIL != current )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list208 );
      return NIL;
    }
    if( NIL != $ignore_assert_typesP$.getGlobalValue() )
    {
      return ConsesLow.list( $sym59$IGNORE, v_object );
    }
    return ConsesLow.list( $sym209$CHECK_TYPE, v_object, pred );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subl-macros.lisp", position = 20030L)
  public static SubLObject assert_type_if_present(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject v_object = NIL;
    SubLObject pred = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list208 );
    v_object = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list208 );
    pred = current.first();
    current = current.rest();
    if( NIL != current )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list208 );
      return NIL;
    }
    if( NIL != $ignore_assert_typesP$.getGlobalValue() )
    {
      return ConsesLow.list( $sym59$IGNORE, v_object );
    }
    return ConsesLow.list( $sym211$CHECK_TYPE_IF_PRESENT, v_object, pred );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subl-macros.lisp", position = 20279L)
  public static SubLObject assert_list_type(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject list = NIL;
    SubLObject pred = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list213 );
    list = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list213 );
    pred = current.first();
    current = current.rest();
    if( NIL != current )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list213 );
      return NIL;
    }
    if( NIL != $ignore_assert_typesP$.getGlobalValue() )
    {
      return ConsesLow.list( $sym59$IGNORE, list );
    }
    return ConsesLow.list( $sym214$CHECK_LIST_TYPE, list, pred );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subl-macros.lisp", position = 20554L)
  public static SubLObject assert_plist_type(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject plist = NIL;
    SubLObject pred = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list216 );
    plist = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list216 );
    pred = current.first();
    current = current.rest();
    if( NIL != current )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list216 );
      return NIL;
    }
    if( NIL != $ignore_assert_typesP$.getGlobalValue() )
    {
      return ConsesLow.list( $sym59$IGNORE, plist );
    }
    return ConsesLow.list( $sym217$CHECK_PLIST_TYPE, plist, pred );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subl-macros.lisp", position = 20835L)
  public static SubLObject assert_must(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject form = NIL;
    SubLObject format_string = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list219 );
    form = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list219 );
    format_string = current.first();
    final SubLObject v_arguments;
    current = ( v_arguments = current.rest() );
    if( NIL != $ignore_assert_typesP$.getGlobalValue() )
    {
      return $list220;
    }
    return ConsesLow.listS( $sym221$MUST, form, format_string, ConsesLow.append( v_arguments, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subl-macros.lisp", position = 21012L)
  public static SubLObject pcase_feature(final SubLObject macroform, final SubLObject environment)
  {
    final SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject cdolist_list_var;
    final SubLObject feature_clauses = cdolist_list_var = current;
    SubLObject feature_clause = NIL;
    feature_clause = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject current_$26;
      final SubLObject datum_$25 = current_$26 = feature_clause;
      SubLObject feature_expression = NIL;
      SubLObject body = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( current_$26, datum_$25, $list223 );
      feature_expression = current_$26.first();
      current_$26 = ( body = current_$26.rest() );
      if( $sym224$OTHERWISE == feature_expression || NIL != feature_expression_match( feature_expression ) )
      {
        return reader.bq_cons( $sym153$PROGN, ConsesLow.append( body, NIL ) );
      }
      cdolist_list_var = cdolist_list_var.rest();
      feature_clause = cdolist_list_var.first();
    }
    return $list220;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subl-macros.lisp", position = 22127L)
  public static SubLObject pif_feature(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject feature_clause = NIL;
    SubLObject action = NIL;
    SubLObject else_action = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list226 );
    feature_clause = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list226 );
    action = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list226 );
    else_action = current.first();
    current = current.rest();
    if( NIL == current )
    {
      return ConsesLow.list( $sym222$PCASE_FEATURE, ConsesLow.list( feature_clause, action ), ConsesLow.list( $sym224$OTHERWISE, else_action ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list226 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subl-macros.lisp", position = 22491L)
  public static SubLObject pwhen_feature(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject feature_clause = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list229 );
    feature_clause = current.first();
    final SubLObject body;
    current = ( body = current.rest() );
    return ConsesLow.list( $sym222$PCASE_FEATURE, reader.bq_cons( feature_clause, ConsesLow.append( body, NIL ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subl-macros.lisp", position = 22668L)
  public static SubLObject punless_feature(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject feature_clause = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list229 );
    feature_clause = current.first();
    final SubLObject body;
    current = ( body = current.rest() );
    return ConsesLow.list( $sym222$PCASE_FEATURE, ConsesLow.list( feature_clause ), reader.bq_cons( $sym224$OTHERWISE, ConsesLow.append( body, NIL ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subl-macros.lisp", position = 22871L)
  public static SubLObject fcase_feature(final SubLObject macroform, final SubLObject environment)
  {
    final SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject cdolist_list_var;
    final SubLObject feature_clauses = cdolist_list_var = current;
    SubLObject feature_clause = NIL;
    feature_clause = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject current_$28;
      final SubLObject datum_$27 = current_$28 = feature_clause;
      SubLObject feature_expression = NIL;
      SubLObject form = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( current_$28, datum_$27, $list232 );
      feature_expression = current_$28.first();
      current_$28 = current_$28.rest();
      cdestructuring_bind.destructuring_bind_must_consp( current_$28, datum_$27, $list232 );
      form = current_$28.first();
      current_$28 = current_$28.rest();
      if( NIL == current_$28 )
      {
        if( $sym224$OTHERWISE == feature_expression || NIL != feature_expression_match( feature_expression ) )
        {
          return form;
        }
      }
      else
      {
        cdestructuring_bind.cdestructuring_bind_error( datum_$27, $list232 );
      }
      cdolist_list_var = cdolist_list_var.rest();
      feature_clause = cdolist_list_var.first();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subl-macros.lisp", position = 23615L)
  public static SubLObject fif_feature(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject feature_clause = NIL;
    SubLObject action = NIL;
    SubLObject else_action = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list226 );
    feature_clause = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list226 );
    action = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list226 );
    else_action = current.first();
    current = current.rest();
    if( NIL == current )
    {
      return ConsesLow.list( $sym231$FCASE_FEATURE, ConsesLow.list( feature_clause, action ), ConsesLow.list( $sym224$OTHERWISE, else_action ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list226 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subl-macros.lisp", position = 23967L)
  public static SubLObject fwhen_feature(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject feature_clause = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list229 );
    feature_clause = current.first();
    final SubLObject body;
    current = ( body = current.rest() );
    return ConsesLow.list( $sym231$FCASE_FEATURE, reader.bq_cons( feature_clause, ConsesLow.append( body, NIL ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subl-macros.lisp", position = 24144L)
  public static SubLObject feature_match(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject feature_clause = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list236 );
    feature_clause = current.first();
    current = current.rest();
    if( NIL == current )
    {
      return ConsesLow.listS( $sym234$FWHEN_FEATURE, feature_clause, $list202 );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list236 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subl-macros.lisp", position = 24296L)
  public static SubLObject funless_feature(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject feature_clause = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list229 );
    feature_clause = current.first();
    final SubLObject body;
    current = ( body = current.rest() );
    return ConsesLow.list( $sym231$FCASE_FEATURE, reader.bq_cons( feature_clause, $list238 ), reader.bq_cons( $sym224$OTHERWISE, ConsesLow.append( body, NIL ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subl-macros.lisp", position = 24507L)
  public static SubLObject fimplies_feature(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject feature_clause = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list229 );
    feature_clause = current.first();
    final SubLObject body;
    current = ( body = current.rest() );
    return ConsesLow.listS( $sym231$FCASE_FEATURE, reader.bq_cons( feature_clause, ConsesLow.append( body, NIL ) ), $list240 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subl-macros.lisp", position = 24715L)
  public static SubLObject atomic_feature_match(final SubLObject atomic_feature)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return ( NIL != conses_high.member( atomic_feature, reader.$features$.getDynamicValue( thread ), UNPROVIDED, UNPROVIDED ) ) ? T : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subl-macros.lisp", position = 24897L)
  public static SubLObject feature_expression_match(final SubLObject feature_expression)
  {
    if( feature_expression.isAtom() )
    {
      if( feature_expression.isSymbol() )
      {
        return atomic_feature_match( feature_expression );
      }
    }
    else
    {
      SubLObject operator = NIL;
      SubLObject subexpressions = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( feature_expression, feature_expression, $list243 );
      operator = feature_expression.first();
      final SubLObject current = subexpressions = feature_expression.rest();
      final SubLObject pcase_var = operator;
      if( pcase_var.eql( $kw244$NOT ) || pcase_var.eql( $sym245$NOT ) || pcase_var.eql( $sym4$CNOT ) )
      {
        return makeBoolean( NIL == feature_expression_match( subexpressions.first() ) );
      }
      if( pcase_var.eql( $kw246$OR ) || pcase_var.eql( $sym247$OR ) || pcase_var.eql( $sym20$COR ) )
      {
        SubLObject some_sub_match_succeeds = NIL;
        if( NIL == some_sub_match_succeeds )
        {
          SubLObject csome_list_var;
          SubLObject subexpression;
          for( csome_list_var = subexpressions, subexpression = NIL, subexpression = csome_list_var.first(); NIL == some_sub_match_succeeds && NIL != csome_list_var; some_sub_match_succeeds = feature_expression_match(
              subexpression ), csome_list_var = csome_list_var.rest(), subexpression = csome_list_var.first() )
          {
          }
        }
        return some_sub_match_succeeds;
      }
      if( pcase_var.eql( $kw248$AND ) || pcase_var.eql( $sym249$AND ) || pcase_var.eql( $sym101$CAND ) )
      {
        SubLObject some_sub_match_fails = NIL;
        if( NIL == some_sub_match_fails )
        {
          SubLObject csome_list_var;
          SubLObject subexpression;
          for( csome_list_var = subexpressions, subexpression = NIL, subexpression = csome_list_var.first(); NIL == some_sub_match_fails && NIL != csome_list_var; some_sub_match_fails = makeBoolean(
              NIL == feature_expression_match( subexpression ) ), csome_list_var = csome_list_var.rest(), subexpression = csome_list_var.first() )
          {
          }
        }
        return makeBoolean( NIL == some_sub_match_fails );
      }
    }
    Errors.error( $str250$_S_is_not_a_well_formed_feature_e, feature_expression );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subl-macros.lisp", position = 26122L)
  public static SubLObject funcall_if(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject func = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list252 );
    func = current.first();
    final SubLObject args;
    current = ( args = current.rest() );
    if( NIL == func )
    {
      return $list253;
    }
    return ConsesLow.list( $sym254$FWHEN, func, ConsesLow.listS( $sym255$FUNCALL, func, ConsesLow.append( args, NIL ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subl-macros.lisp", position = 26347L)
  public static SubLObject cpush_if(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject item = NIL;
    SubLObject place = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list257 );
    item = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list257 );
    place = current.first();
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject var = $sym258$VAR;
      return ConsesLow.list( $sym21$CLET, ConsesLow.list( ConsesLow.list( var, item ) ), ConsesLow.list( $sym183$PWHEN, var, ConsesLow.list( $sym70$CPUSH, var, place ) ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list257 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subl-macros.lisp", position = 26493L)
  public static SubLObject cpushnew_if(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject item = NIL;
    SubLObject place = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list260 );
    item = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list260 );
    place = current.first();
    current = current.rest();
    final SubLObject test = current.isCons() ? current.first() : $list261;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list260 );
    current = current.rest();
    final SubLObject key = current.isCons() ? current.first() : $list262;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list260 );
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject var = $sym263$VAR;
      return ConsesLow.list( $sym21$CLET, ConsesLow.list( ConsesLow.list( var, item ) ), ConsesLow.list( $sym183$PWHEN, var, ConsesLow.list( $sym264$CPUSHNEW, var, place, test, key ) ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list260 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subl-macros.lisp", position = 26698L)
  public static SubLObject cpush_all(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject items = NIL;
    SubLObject place = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list266 );
    items = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list266 );
    place = current.first();
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject item = $sym267$ITEM;
      final SubLObject items_var = $sym268$ITEMS_VAR;
      return ConsesLow.list( $sym21$CLET, ConsesLow.list( ConsesLow.list( items_var, items ) ), ConsesLow.list( $sym192$PIF, ConsesLow.list( $sym269$VECTORP, items_var ), ConsesLow.list( $sym114$DO_VECTOR, ConsesLow
          .list( item, items_var ), ConsesLow.list( $sym70$CPUSH, item, place ) ), ConsesLow.list( $sym45$CDOLIST, ConsesLow.list( item, items_var ), ConsesLow.list( $sym70$CPUSH, item, place ) ) ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list266 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subl-macros.lisp", position = 26964L)
  public static SubLObject cpushnew_all(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject items = NIL;
    SubLObject place = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list271 );
    items = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list271 );
    place = current.first();
    current = current.rest();
    final SubLObject test = current.isCons() ? current.first() : $list261;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list271 );
    current = current.rest();
    final SubLObject key = current.isCons() ? current.first() : $list262;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list271 );
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject item = $sym272$ITEM;
      final SubLObject items_var = $sym273$ITEMS_VAR;
      return ConsesLow.list( $sym21$CLET, ConsesLow.list( ConsesLow.list( items_var, items ) ), ConsesLow.list( $sym192$PIF, ConsesLow.list( $sym269$VECTORP, items_var ), ConsesLow.list( $sym114$DO_VECTOR, ConsesLow
          .list( item, items_var ), ConsesLow.list( $sym264$CPUSHNEW, item, place, test, key ) ), ConsesLow.list( $sym45$CDOLIST, ConsesLow.list( item, items_var ), ConsesLow.list( $sym264$CPUSHNEW, item, place, test,
              key ) ) ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list271 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subl-macros.lisp", position = 27325L)
  public static SubLObject csetf_delete(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject item = NIL;
    SubLObject place = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list275 );
    item = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list275 );
    place = current.first();
    current = current.rest();
    SubLObject allow_other_keys_p = NIL;
    SubLObject rest = current;
    SubLObject bad = NIL;
    SubLObject current_$29 = NIL;
    while ( NIL != rest)
    {
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list275 );
      current_$29 = rest.first();
      rest = rest.rest();
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list275 );
      if( NIL == conses_high.member( current_$29, $list276, UNPROVIDED, UNPROVIDED ) )
      {
        bad = T;
      }
      if( current_$29 == $kw9$ALLOW_OTHER_KEYS )
      {
        allow_other_keys_p = rest.first();
      }
      rest = rest.rest();
    }
    if( NIL != bad && NIL == allow_other_keys_p )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list275 );
    }
    final SubLObject test_tail = cdestructuring_bind.property_list_member( $kw277$TEST, current );
    final SubLObject test = ( NIL != test_tail ) ? conses_high.cadr( test_tail ) : $list261;
    final SubLObject key_tail = cdestructuring_bind.property_list_member( $kw278$KEY, current );
    final SubLObject key = ( NIL != key_tail ) ? conses_high.cadr( key_tail ) : $list262;
    if( !key.equal( $list262 ) )
    {
      return ConsesLow.list( $sym279$CSETF, place, ConsesLow.list( $sym280$DELETE, item, place, test, key ) );
    }
    if( test.equal( $list261 ) )
    {
      return ConsesLow.list( $sym279$CSETF, place, ConsesLow.list( $sym280$DELETE, item, place ) );
    }
    return ConsesLow.list( $sym279$CSETF, place, ConsesLow.list( $sym280$DELETE, item, place, test ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subl-macros.lisp", position = 27640L)
  public static SubLObject cpush_end(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject item = NIL;
    SubLObject place = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list257 );
    item = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list257 );
    place = current.first();
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject new_cons = $sym282$NEW_CONS;
      final SubLObject list = $sym283$LIST;
      return ConsesLow.list( $sym21$CLET, ConsesLow.list( ConsesLow.list( new_cons, ConsesLow.listS( $sym69$CONS, item, $list238 ) ), ConsesLow.list( list, place ) ), ConsesLow.list( $sym192$PIF, list, ConsesLow.list(
          $sym284$RPLACD_LAST, list, new_cons ), ConsesLow.list( $sym279$CSETF, place, new_cons ) ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list257 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subl-macros.lisp", position = 28000L)
  public static SubLObject cpushnew_end(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject item = NIL;
    SubLObject place = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list275 );
    item = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list275 );
    place = current.first();
    current = current.rest();
    SubLObject allow_other_keys_p = NIL;
    SubLObject rest = current;
    SubLObject bad = NIL;
    SubLObject current_$30 = NIL;
    while ( NIL != rest)
    {
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list275 );
      current_$30 = rest.first();
      rest = rest.rest();
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list275 );
      if( NIL == conses_high.member( current_$30, $list276, UNPROVIDED, UNPROVIDED ) )
      {
        bad = T;
      }
      if( current_$30 == $kw9$ALLOW_OTHER_KEYS )
      {
        allow_other_keys_p = rest.first();
      }
      rest = rest.rest();
    }
    if( NIL != bad && NIL == allow_other_keys_p )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list275 );
    }
    final SubLObject test_tail = cdestructuring_bind.property_list_member( $kw277$TEST, current );
    final SubLObject test = ( NIL != test_tail ) ? conses_high.cadr( test_tail ) : $list261;
    final SubLObject key_tail = cdestructuring_bind.property_list_member( $kw278$KEY, current );
    final SubLObject key = ( NIL != key_tail ) ? conses_high.cadr( key_tail ) : $list262;
    final SubLObject item_var = $sym286$ITEM_VAR;
    return ConsesLow.list( $sym21$CLET, ConsesLow.list( ConsesLow.list( item_var, item ) ), ConsesLow.list( $sym22$PUNLESS, ConsesLow.list( $sym287$MEMBER, item_var, place, test, key ), ConsesLow.list( $sym281$CPUSH_END,
        item_var, place ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subl-macros.lisp", position = 28443L)
  public static SubLObject rplacd_last(final SubLObject non_empty_list, final SubLObject new_last_cdr)
  {
    return ConsesLow.rplacd( conses_high.last( non_empty_list, UNPROVIDED ), new_last_cdr );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subl-macros.lisp", position = 28651L)
  public static SubLObject without_appending_stack_traces_to_error_messages(final SubLObject macroform, final SubLObject environment)
  {
    final SubLObject datum = macroform.rest();
    final SubLObject body;
    final SubLObject current = body = datum;
    final SubLObject was_appendingP = $sym288$WAS_APPENDING_;
    return ConsesLow.list( $sym225$PIF_FEATURE, $kw289$SL2JAVA, ConsesLow.list( $sym21$CLET, ConsesLow.list( reader.bq_cons( was_appendingP, $list290 ) ), $list291, ConsesLow.list( $sym201$CUNWIND_PROTECT, reader
        .bq_cons( $sym153$PROGN, ConsesLow.append( body, NIL ) ), ConsesLow.list( $sym292$EVAL, ConsesLow.list( $sym129$LIST, $list293, $list294, was_appendingP ) ) ) ), reader.bq_cons( $sym153$PROGN, ConsesLow.append(
            body, NIL ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subl-macros.lisp", position = 29170L)
  public static SubLObject silently(final SubLObject macroform, final SubLObject environment)
  {
    final SubLObject datum = macroform.rest();
    final SubLObject body;
    final SubLObject current = body = datum;
    return ConsesLow.listS( $sym21$CLET, $list296, ConsesLow.append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subl-macros.lisp", position = 29643L)
  public static SubLObject fimplies(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject lhs = NIL;
    SubLObject rhs = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list298 );
    lhs = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list298 );
    rhs = current.first();
    current = current.rest();
    if( NIL == current )
    {
      return ConsesLow.list( $sym20$COR, ConsesLow.list( $sym4$CNOT, lhs ), rhs );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list298 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subl-macros.lisp", position = 29764L)
  public static SubLObject fxor(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject a = NIL;
    SubLObject b = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list300 );
    a = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list300 );
    b = current.first();
    current = current.rest();
    if( NIL == current )
    {
      return ConsesLow.list( $sym4$CNOT, ConsesLow.list( EQ, ConsesLow.list( $sym4$CNOT, a ), ConsesLow.list( $sym4$CNOT, b ) ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list300 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subl-macros.lisp", position = 29953L)
  public static SubLObject fequiv(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject a = NIL;
    SubLObject b = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list300 );
    a = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list300 );
    b = current.first();
    current = current.rest();
    if( NIL == current )
    {
      return ConsesLow.list( EQ, ConsesLow.list( $sym4$CNOT, a ), ConsesLow.list( $sym4$CNOT, b ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list300 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subl-macros.lisp", position = 30146L)
  public static SubLObject possibly_with_static_area(final SubLObject macroform, final SubLObject environment)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject varP = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list302 );
    varP = current.first();
    final SubLObject body;
    current = ( body = current.rest() );
    if( NIL != Sequences.find( $kw289$SL2JAVA, reader.$features$.getDynamicValue( thread ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) )
    {
      return reader.bq_cons( $sym153$PROGN, ConsesLow.append( body, NIL ) );
    }
    return ConsesLow.list( $sym192$PIF, varP, reader.bq_cons( $sym303$WITH_STATIC_AREA, ConsesLow.append( body, NIL ) ), reader.bq_cons( $sym153$PROGN, ConsesLow.append( body, NIL ) ) );
  }

  public static SubLObject declare_subl_macros_file()
  {
    SubLFiles.declareMacro( me, "until", "UNTIL" );
    SubLFiles.declareMacro( me, "sublisp_while", "WHILE" );
    SubLFiles.declareMacro( me, "repeat_forever", "REPEAT-FOREVER" );
    SubLFiles.declareMacro( me, "do_numbers", "DO-NUMBERS" );
    SubLFiles.declareMacro( me, "do_numbers_endtest_macro", "DO-NUMBERS-ENDTEST-MACRO" );
    SubLFiles.declareFunction( me, "do_numbers_endtest", "DO-NUMBERS-ENDTEST", 3, 0, false );
    SubLFiles.declareMacro( me, "do_list", "DO-LIST" );
    SubLFiles.declareMacro( me, "do_list_index", "DO-LIST-INDEX" );
    SubLFiles.declareMacro( me, "do_alist", "DO-ALIST" );
    SubLFiles.declareMacro( me, "do_alist_values", "DO-ALIST-VALUES" );
    SubLFiles.declareMacro( me, "do_alist_keys", "DO-ALIST-KEYS" );
    SubLFiles.declareMacro( me, "cinc_alist", "CINC-ALIST" );
    SubLFiles.declareMacro( me, "cdec_alist", "CDEC-ALIST" );
    SubLFiles.declareMacro( me, "do_plist", "DO-PLIST" );
    SubLFiles.declareMacro( me, "do_plist_properties", "DO-PLIST-PROPERTIES" );
    SubLFiles.declareMacro( me, "do_plist_values", "DO-PLIST-VALUES" );
    SubLFiles.declareMacro( me, "smart_csome", "SMART-CSOME" );
    SubLFiles.declareMacro( me, "cdocons", "CDOCONS" );
    SubLFiles.declareMacro( me, "do_pairs", "DO-PAIRS" );
    SubLFiles.declareMacro( me, "do_list_with_tail", "DO-LIST-WITH-TAIL" );
    SubLFiles.declareMacro( me, "dolists", "DOLISTS" );
    SubLFiles.declareMacro( me, "do_string", "DO-STRING" );
    SubLFiles.declareMacro( me, "do_string_index", "DO-STRING-INDEX" );
    SubLFiles.declareMacro( me, "do_vector", "DO-VECTOR" );
    SubLFiles.declareMacro( me, "do_vector_index", "DO-VECTOR-INDEX" );
    SubLFiles.declareMacro( me, "cdovector", "CDOVECTOR" );
    SubLFiles.declareMacro( me, "csome_vector", "CSOME-VECTOR" );
    SubLFiles.declareMacro( me, "smart_csomevector", "SMART-CSOMEVECTOR" );
    SubLFiles.declareMacro( me, "do_sequence", "DO-SEQUENCE" );
    SubLFiles.declareMacro( me, "do_sequence_index", "DO-SEQUENCE-INDEX" );
    SubLFiles.declareFunction( me, "do_sequence_index_doneP", "DO-SEQUENCE-INDEX-DONE?", 3, 0, false );
    SubLFiles.declareFunction( me, "do_sequence_index_valueP", "DO-SEQUENCE-INDEX-VALUE?", 2, 0, false );
    SubLFiles.declareFunction( me, "do_sequence_index_update", "DO-SEQUENCE-INDEX-UPDATE", 1, 0, false );
    SubLFiles.declareMacro( me, "do_hash_table", "DO-HASH-TABLE" );
    SubLFiles.declareFunction( me, "do_hash_table_done_check", "DO-HASH-TABLE-DONE-CHECK", 1, 0, false );
    SubLFiles.declareMacro( me, "do_hash_table_keys", "DO-HASH-TABLE-KEYS" );
    SubLFiles.declareMacro( me, "ccatch_ignore", "CCATCH-IGNORE" );
    SubLFiles.declareMacro( me, "punless_error", "PUNLESS-ERROR" );
    SubLFiles.declareMacro( me, "pwhen_error", "PWHEN-ERROR" );
    SubLFiles.declareMacro( me, "warn_on_errors", "WARN-ON-ERRORS" );
    SubLFiles.declareMacro( me, "possibly_warn_on_errors", "POSSIBLY-WARN-ON-ERRORS" );
    SubLFiles.declareMacro( me, "possibly_ignore_errors", "POSSIBLY-IGNORE-ERRORS" );
    SubLFiles.declareMacro( me, "warn_or_ignore_errors", "WARN-OR-IGNORE-ERRORS" );
    SubLFiles.declareMacro( me, "with_default_error_handling", "WITH-DEFAULT-ERROR-HANDLING" );
    SubLFiles.declareMacro( me, "cunwind_on_failure", "CUNWIND-ON-FAILURE" );
    SubLFiles.declareMacro( me, "cunwind_protect_with_fail_clause", "CUNWIND-PROTECT-WITH-FAIL-CLAUSE" );
    SubLFiles.declareMacro( me, "assert_type", "ASSERT-TYPE" );
    SubLFiles.declareMacro( me, "assert_type_if_present", "ASSERT-TYPE-IF-PRESENT" );
    SubLFiles.declareMacro( me, "assert_list_type", "ASSERT-LIST-TYPE" );
    SubLFiles.declareMacro( me, "assert_plist_type", "ASSERT-PLIST-TYPE" );
    SubLFiles.declareMacro( me, "assert_must", "ASSERT-MUST" );
    SubLFiles.declareMacro( me, "pcase_feature", "PCASE-FEATURE" );
    SubLFiles.declareMacro( me, "pif_feature", "PIF-FEATURE" );
    SubLFiles.declareMacro( me, "pwhen_feature", "PWHEN-FEATURE" );
    SubLFiles.declareMacro( me, "punless_feature", "PUNLESS-FEATURE" );
    SubLFiles.declareMacro( me, "fcase_feature", "FCASE-FEATURE" );
    SubLFiles.declareMacro( me, "fif_feature", "FIF-FEATURE" );
    SubLFiles.declareMacro( me, "fwhen_feature", "FWHEN-FEATURE" );
    SubLFiles.declareMacro( me, "feature_match", "FEATURE-MATCH" );
    SubLFiles.declareMacro( me, "funless_feature", "FUNLESS-FEATURE" );
    SubLFiles.declareMacro( me, "fimplies_feature", "FIMPLIES-FEATURE" );
    SubLFiles.declareFunction( me, "atomic_feature_match", "ATOMIC-FEATURE-MATCH", 1, 0, false );
    SubLFiles.declareFunction( me, "feature_expression_match", "FEATURE-EXPRESSION-MATCH", 1, 0, false );
    SubLFiles.declareMacro( me, "funcall_if", "FUNCALL-IF" );
    SubLFiles.declareMacro( me, "cpush_if", "CPUSH-IF" );
    SubLFiles.declareMacro( me, "cpushnew_if", "CPUSHNEW-IF" );
    SubLFiles.declareMacro( me, "cpush_all", "CPUSH-ALL" );
    SubLFiles.declareMacro( me, "cpushnew_all", "CPUSHNEW-ALL" );
    SubLFiles.declareMacro( me, "csetf_delete", "CSETF-DELETE" );
    SubLFiles.declareMacro( me, "cpush_end", "CPUSH-END" );
    SubLFiles.declareMacro( me, "cpushnew_end", "CPUSHNEW-END" );
    SubLFiles.declareFunction( me, "rplacd_last", "RPLACD-LAST", 2, 0, false );
    SubLFiles.declareMacro( me, "without_appending_stack_traces_to_error_messages", "WITHOUT-APPENDING-STACK-TRACES-TO-ERROR-MESSAGES" );
    SubLFiles.declareMacro( me, "silently", "SILENTLY" );
    SubLFiles.declareMacro( me, "fimplies", "FIMPLIES" );
    SubLFiles.declareMacro( me, "fxor", "FXOR" );
    SubLFiles.declareMacro( me, "fequiv", "FEQUIV" );
    SubLFiles.declareMacro( me, "possibly_with_static_area", "POSSIBLY-WITH-STATIC-AREA" );
    return NIL;
  }

  public static SubLObject init_subl_macros_file()
  {
    $ignore_assert_typesP$ = SubLFiles.deflexical( "*IGNORE-ASSERT-TYPES?*", T );
    return NIL;
  }

  public static SubLObject setup_subl_macros_file()
  {
    access_macros.register_external_symbol( $sym0$UNTIL );
    access_macros.register_external_symbol( $sym3$WHILE );
    access_macros.register_external_symbol( $sym5$REPEAT_FOREVER );
    access_macros.register_external_symbol( $sym6$DO_NUMBERS );
    access_macros.register_macro_helper( $sym19$DO_NUMBERS_ENDTEST_MACRO, $sym6$DO_NUMBERS );
    access_macros.register_macro_helper( $sym27$DO_NUMBERS_ENDTEST, $sym6$DO_NUMBERS );
    access_macros.register_external_symbol( $sym28$DO_LIST );
    access_macros.register_external_symbol( $sym46$DO_LIST_INDEX );
    access_macros.register_external_symbol( $sym50$DO_ALIST );
    access_macros.register_external_symbol( $sym56$DO_ALIST_VALUES );
    access_macros.register_external_symbol( $sym60$DO_ALIST_KEYS );
    access_macros.register_external_symbol( $sym63$CINC_ALIST );
    access_macros.register_external_symbol( $sym72$CDEC_ALIST );
    access_macros.register_external_symbol( $sym74$DO_PLIST );
    access_macros.register_external_symbol( $sym79$DO_PLIST_PROPERTIES );
    access_macros.register_external_symbol( $sym82$DO_PLIST_VALUES );
    access_macros.register_external_symbol( $sym86$CDOCONS );
    access_macros.register_external_symbol( $sym89$DO_PAIRS );
    access_macros.register_external_symbol( $sym95$DO_LIST_WITH_TAIL );
    access_macros.register_external_symbol( $sym98$DOLISTS );
    access_macros.register_external_symbol( $sym102$DO_STRING );
    access_macros.register_external_symbol( $sym106$DO_STRING_INDEX );
    access_macros.register_external_symbol( $sym114$DO_VECTOR );
    access_macros.register_external_symbol( $sym119$DO_VECTOR_INDEX );
    access_macros.register_external_symbol( $sym135$CDOVECTOR );
    access_macros.register_external_symbol( $sym137$CSOME_VECTOR );
    access_macros.register_external_symbol( $sym139$SMART_CSOMEVECTOR );
    access_macros.register_external_symbol( $sym140$DO_SEQUENCE );
    access_macros.register_external_symbol( $sym143$DO_SEQUENCE_INDEX );
    access_macros.register_macro_helper( $sym151$DO_SEQUENCE_INDEX_DONE_, $sym143$DO_SEQUENCE_INDEX );
    access_macros.register_macro_helper( $sym152$DO_SEQUENCE_INDEX_VALUE_, $sym143$DO_SEQUENCE_INDEX );
    access_macros.register_macro_helper( $sym154$DO_SEQUENCE_INDEX_UPDATE, $sym143$DO_SEQUENCE_INDEX );
    access_macros.register_external_symbol( $sym155$DO_HASH_TABLE );
    access_macros.register_macro_helper( $sym169$DO_HASH_TABLE_DONE_CHECK, $sym155$DO_HASH_TABLE );
    access_macros.register_external_symbol( $sym171$DO_HASH_TABLE_KEYS );
    access_macros.register_external_symbol( $sym167$CCATCH_IGNORE );
    access_macros.register_external_symbol( $sym177$PUNLESS_ERROR );
    access_macros.register_external_symbol( $sym181$PWHEN_ERROR );
    access_macros.register_external_symbol( $sym184$WARN_ON_ERRORS );
    access_macros.register_external_symbol( $sym190$POSSIBLY_WARN_ON_ERRORS );
    access_macros.register_external_symbol( $sym193$POSSIBLY_IGNORE_ERRORS );
    access_macros.register_external_symbol( $sym195$WARN_OR_IGNORE_ERRORS );
    access_macros.register_external_symbol( $sym196$WITH_DEFAULT_ERROR_HANDLING );
    access_macros.register_external_symbol( $sym198$CUNWIND_ON_FAILURE );
    access_macros.register_external_symbol( $sym203$CUNWIND_PROTECT_WITH_FAIL_CLAUSE );
    access_macros.register_external_symbol( $sym206$_IGNORE_ASSERT_TYPES__ );
    access_macros.register_external_symbol( $sym207$ASSERT_TYPE );
    access_macros.register_external_symbol( $sym210$ASSERT_TYPE_IF_PRESENT );
    access_macros.register_external_symbol( $sym212$ASSERT_LIST_TYPE );
    access_macros.register_external_symbol( $sym215$ASSERT_PLIST_TYPE );
    access_macros.register_external_symbol( $sym218$ASSERT_MUST );
    access_macros.register_external_symbol( $sym222$PCASE_FEATURE );
    access_macros.register_external_symbol( $sym225$PIF_FEATURE );
    meta_macros.declare_indention_pattern( $sym225$PIF_FEATURE, $list227 );
    access_macros.register_external_symbol( $sym228$PWHEN_FEATURE );
    access_macros.register_external_symbol( $sym230$PUNLESS_FEATURE );
    access_macros.register_external_symbol( $sym231$FCASE_FEATURE );
    access_macros.register_external_symbol( $sym233$FIF_FEATURE );
    meta_macros.declare_indention_pattern( $sym233$FIF_FEATURE, $list227 );
    access_macros.register_external_symbol( $sym234$FWHEN_FEATURE );
    access_macros.register_external_symbol( $sym235$FEATURE_MATCH );
    access_macros.register_external_symbol( $sym237$FUNLESS_FEATURE );
    access_macros.register_external_symbol( $sym239$FIMPLIES_FEATURE );
    access_macros.register_external_symbol( $sym241$ATOMIC_FEATURE_MATCH );
    access_macros.register_external_symbol( $sym242$FEATURE_EXPRESSION_MATCH );
    access_macros.register_external_symbol( $sym251$FUNCALL_IF );
    access_macros.register_external_symbol( $sym256$CPUSH_IF );
    access_macros.register_external_symbol( $sym259$CPUSHNEW_IF );
    access_macros.register_external_symbol( $sym265$CPUSH_ALL );
    access_macros.register_external_symbol( $sym270$CPUSHNEW_ALL );
    access_macros.register_external_symbol( $sym274$CSETF_DELETE );
    access_macros.register_external_symbol( $sym281$CPUSH_END );
    access_macros.register_external_symbol( $sym285$CPUSHNEW_END );
    access_macros.register_external_symbol( $sym295$SILENTLY );
    access_macros.register_external_symbol( $sym297$FIMPLIES );
    access_macros.register_external_symbol( $sym299$FXOR );
    access_macros.register_external_symbol( $sym301$FEQUIV );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_subl_macros_file();
  }

  @Override
  public void initializeVariables()
  {
    init_subl_macros_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_subl_macros_file();
  }
  static
  {
    me = new subl_macros();
    $ignore_assert_typesP$ = null;
    $sym0$UNTIL = makeSymbol( "UNTIL" );
    $list1 = ConsesLow.list( makeSymbol( "TEST" ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym2$CDO = makeSymbol( "CDO" );
    $sym3$WHILE = makeSymbol( "WHILE" );
    $sym4$CNOT = makeSymbol( "CNOT" );
    $sym5$REPEAT_FOREVER = makeSymbol( "REPEAT-FOREVER" );
    $sym6$DO_NUMBERS = makeSymbol( "DO-NUMBERS" );
    $list7 = ConsesLow.list( ConsesLow.list( makeSymbol( "NUMBER-VAR" ), makeSymbol( "&KEY" ), ConsesLow.list( makeSymbol( "START" ), ZERO_INTEGER ), makeSymbol( "END" ), ConsesLow.list( makeSymbol( "DELTA" ),
        ONE_INTEGER ), makeSymbol( "DONE" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $list8 = ConsesLow.list( makeKeyword( "START" ), makeKeyword( "END" ), makeKeyword( "DELTA" ), makeKeyword( "DONE" ) );
    $kw9$ALLOW_OTHER_KEYS = makeKeyword( "ALLOW-OTHER-KEYS" );
    $kw10$START = makeKeyword( "START" );
    $kw11$END = makeKeyword( "END" );
    $kw12$DELTA = makeKeyword( "DELTA" );
    $kw13$DONE = makeKeyword( "DONE" );
    $sym14$CDOTIMES = makeSymbol( "CDOTIMES" );
    $sym15$1_ = makeSymbol( "1+" );
    $sym16$_ = makeSymbol( "+" );
    $sym17$DELTA_VAR = makeUninternedSymbol( "DELTA-VAR" );
    $sym18$END_VAR = makeUninternedSymbol( "END-VAR" );
    $sym19$DO_NUMBERS_ENDTEST_MACRO = makeSymbol( "DO-NUMBERS-ENDTEST-MACRO" );
    $sym20$COR = makeSymbol( "COR" );
    $sym21$CLET = makeSymbol( "CLET" );
    $sym22$PUNLESS = makeSymbol( "PUNLESS" );
    $list23 = ConsesLow.list( makeSymbol( "NUMBER-VAR" ), makeSymbol( "DELTA-FORM" ), makeSymbol( "END-VAR" ) );
    $sym24$__ = makeSymbol( ">=" );
    $sym25$__ = makeSymbol( "<=" );
    $sym26$_ = makeSymbol( "=" );
    $sym27$DO_NUMBERS_ENDTEST = makeSymbol( "DO-NUMBERS-ENDTEST" );
    $sym28$DO_LIST = makeSymbol( "DO-LIST" );
    $list29 = ConsesLow.list( ConsesLow.list( makeSymbol( "VAR" ), makeSymbol( "LIST" ), makeSymbol( "&KEY" ), makeSymbol( "DONE" ), makeSymbol( "PROGRESS-MESSAGE" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $list30 = ConsesLow.list( makeKeyword( "DONE" ), makeKeyword( "PROGRESS-MESSAGE" ) );
    $kw31$PROGRESS_MESSAGE = makeKeyword( "PROGRESS-MESSAGE" );
    $sym32$MESSAGE_VAR = makeUninternedSymbol( "MESSAGE-VAR" );
    $sym33$LIST_VAR = makeUninternedSymbol( "LIST-VAR" );
    $sym34$SOFAR = makeUninternedSymbol( "SOFAR" );
    $sym35$TOTAL = makeUninternedSymbol( "TOTAL" );
    $list36 = ConsesLow.list( ZERO_INTEGER );
    $sym37$LENGTH = makeSymbol( "LENGTH" );
    $sym38$NOTING_PERCENT_PROGRESS = makeSymbol( "NOTING-PERCENT-PROGRESS" );
    $sym39$NOTE_PERCENT_PROGRESS = makeSymbol( "NOTE-PERCENT-PROGRESS" );
    $sym40$CINC = makeSymbol( "CINC" );
    $sym41$REST = makeUninternedSymbol( "REST" );
    $sym42$CDR = makeSymbol( "CDR" );
    $sym43$NULL = makeSymbol( "NULL" );
    $sym44$CAR = makeSymbol( "CAR" );
    $sym45$CDOLIST = makeSymbol( "CDOLIST" );
    $sym46$DO_LIST_INDEX = makeSymbol( "DO-LIST-INDEX" );
    $list47 = ConsesLow.list( ConsesLow.list( makeSymbol( "KEY" ), makeSymbol( "VALUE" ), makeSymbol( "LIST" ), makeSymbol( "&KEY" ), makeSymbol( "DONE" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $list48 = ConsesLow.list( makeKeyword( "DONE" ) );
    $sym49$LIST_VAR = makeUninternedSymbol( "LIST-VAR" );
    $sym50$DO_ALIST = makeSymbol( "DO-ALIST" );
    $list51 = ConsesLow.list( ConsesLow.list( makeSymbol( "KEY" ), makeSymbol( "VALUE" ), makeSymbol( "ALIST" ), makeSymbol( "&KEY" ), makeSymbol( "INDEX" ), makeSymbol( "DONE" ) ), makeSymbol( "&BODY" ), makeSymbol(
        "BODY" ) );
    $list52 = ConsesLow.list( makeKeyword( "INDEX" ), makeKeyword( "DONE" ) );
    $kw53$INDEX = makeKeyword( "INDEX" );
    $sym54$CONS = makeUninternedSymbol( "CONS" );
    $sym55$CDESTRUCTURING_BIND = makeSymbol( "CDESTRUCTURING-BIND" );
    $sym56$DO_ALIST_VALUES = makeSymbol( "DO-ALIST-VALUES" );
    $list57 = ConsesLow.list( ConsesLow.list( makeSymbol( "VALUE" ), makeSymbol( "ALIST" ), makeSymbol( "&KEY" ), makeSymbol( "DONE" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym58$KEY = makeUninternedSymbol( "KEY" );
    $sym59$IGNORE = makeSymbol( "IGNORE" );
    $sym60$DO_ALIST_KEYS = makeSymbol( "DO-ALIST-KEYS" );
    $list61 = ConsesLow.list( ConsesLow.list( makeSymbol( "KEY" ), makeSymbol( "ALIST" ), makeSymbol( "&KEY" ), makeSymbol( "DONE" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym62$VALUE = makeUninternedSymbol( "VALUE" );
    $sym63$CINC_ALIST = makeSymbol( "CINC-ALIST" );
    $list64 = ConsesLow.list( makeSymbol( "KEY" ), makeSymbol( "ALIST" ), makeSymbol( "&OPTIONAL" ), ConsesLow.list( makeSymbol( "TEST" ), ConsesLow.list( makeSymbol( "QUOTE" ), EQL ) ), ConsesLow.list( makeSymbol(
        "INCREMENT" ), ONE_INTEGER ) );
    $sym65$ENTRY = makeUninternedSymbol( "ENTRY" );
    $sym66$ASSOC = makeSymbol( "ASSOC" );
    $sym67$QUOTE = makeSymbol( "QUOTE" );
    $sym68$CSETQ = makeSymbol( "CSETQ" );
    $sym69$CONS = makeSymbol( "CONS" );
    $sym70$CPUSH = makeSymbol( "CPUSH" );
    $sym71$RPLACD = makeSymbol( "RPLACD" );
    $sym72$CDEC_ALIST = makeSymbol( "CDEC-ALIST" );
    $list73 = ConsesLow.list( makeSymbol( "KEY" ), makeSymbol( "ALIST" ), makeSymbol( "&OPTIONAL" ), ConsesLow.list( makeSymbol( "TEST" ), ConsesLow.list( makeSymbol( "QUOTE" ), EQL ) ), ConsesLow.list( makeSymbol(
        "DECREMENT" ), ONE_INTEGER ) );
    $sym74$DO_PLIST = makeSymbol( "DO-PLIST" );
    $list75 = ConsesLow.list( ConsesLow.list( makeSymbol( "PROPERTY" ), makeSymbol( "VALUE" ), makeSymbol( "PLIST" ), makeSymbol( "&KEY" ), makeSymbol( "DONE" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym76$REMAINDER = makeUninternedSymbol( "REMAINDER" );
    $sym77$CDDR = makeSymbol( "CDDR" );
    $sym78$CADR = makeSymbol( "CADR" );
    $sym79$DO_PLIST_PROPERTIES = makeSymbol( "DO-PLIST-PROPERTIES" );
    $list80 = ConsesLow.list( ConsesLow.list( makeSymbol( "PROPERTY" ), makeSymbol( "PLIST" ), makeSymbol( "&KEY" ), makeSymbol( "DONE" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym81$VALUE = makeUninternedSymbol( "VALUE" );
    $sym82$DO_PLIST_VALUES = makeSymbol( "DO-PLIST-VALUES" );
    $list83 = ConsesLow.list( ConsesLow.list( makeSymbol( "VALUE" ), makeSymbol( "PLIST" ), makeSymbol( "&KEY" ), makeSymbol( "DONE" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym84$PROPERTY = makeUninternedSymbol( "PROPERTY" );
    $list85 = ConsesLow.list( ConsesLow.list( makeSymbol( "VAR" ), makeSymbol( "LIST" ), makeSymbol( "DONEVAR" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym86$CDOCONS = makeSymbol( "CDOCONS" );
    $list87 = ConsesLow.list( ConsesLow.list( makeSymbol( "VAR" ), makeSymbol( "LISTFORM" ), makeSymbol( "&KEY" ), makeSymbol( "DONE" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym88$ATOM = makeSymbol( "ATOM" );
    $sym89$DO_PAIRS = makeSymbol( "DO-PAIRS" );
    $list90 = ConsesLow.list( ConsesLow.list( makeSymbol( "VAR1" ), makeSymbol( "VAR2" ), makeSymbol( "LISTFORM" ), makeSymbol( "&KEY" ), makeSymbol( "DONE" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym91$LIST = makeUninternedSymbol( "LIST" );
    $sym92$FIRST = makeSymbol( "FIRST" );
    $sym93$CSOME = makeSymbol( "CSOME" );
    $sym94$REST = makeSymbol( "REST" );
    $sym95$DO_LIST_WITH_TAIL = makeSymbol( "DO-LIST-WITH-TAIL" );
    $list96 = ConsesLow.list( ConsesLow.list( makeSymbol( "ITEM" ), makeSymbol( "TAIL" ), makeSymbol( "LISTFORM" ), makeSymbol( "&KEY" ), makeSymbol( "DONE" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym97$CDR_VAR = makeUninternedSymbol( "CDR-VAR" );
    $sym98$DOLISTS = makeSymbol( "DOLISTS" );
    $list99 = ConsesLow.list( ConsesLow.list( makeSymbol( "&REST" ), makeSymbol( "SPECS" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $str100$CURRENT__A = makeString( "CURRENT-~A" );
    $sym101$CAND = makeSymbol( "CAND" );
    $sym102$DO_STRING = makeSymbol( "DO-STRING" );
    $list103 = ConsesLow.list( ConsesLow.list( makeSymbol( "CHAR" ), makeSymbol( "STRING" ), makeSymbol( "&KEY" ), ConsesLow.list( makeSymbol( "START" ), ZERO_INTEGER ), makeSymbol( "END" ), makeSymbol( "CHAR-NUM" ),
        makeSymbol( "DONE" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $list104 = ConsesLow.list( makeKeyword( "START" ), makeKeyword( "END" ), makeKeyword( "CHAR-NUM" ), makeKeyword( "DONE" ) );
    $kw105$CHAR_NUM = makeKeyword( "CHAR-NUM" );
    $sym106$DO_STRING_INDEX = makeSymbol( "DO-STRING-INDEX" );
    $sym107$CHAR_NUM = makeUninternedSymbol( "CHAR-NUM" );
    $list108 = ConsesLow.list( ConsesLow.list( makeSymbol( "CHAR-NUM" ), makeSymbol( "CHAR" ), makeSymbol( "STRING" ), makeSymbol( "&KEY" ), ConsesLow.list( makeSymbol( "START" ), ZERO_INTEGER ), makeSymbol( "END" ),
        makeSymbol( "DONE" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $list109 = ConsesLow.list( makeKeyword( "START" ), makeKeyword( "END" ), makeKeyword( "DONE" ) );
    $sym110$STRING_VAR = makeUninternedSymbol( "STRING-VAR" );
    $sym111$END_VAR = makeUninternedSymbol( "END-VAR" );
    $sym112$FIF = makeSymbol( "FIF" );
    $sym113$CHAR = makeSymbol( "CHAR" );
    $sym114$DO_VECTOR = makeSymbol( "DO-VECTOR" );
    $list115 = ConsesLow.list( ConsesLow.list( makeSymbol( "VAR" ), makeSymbol( "VECTOR" ), makeSymbol( "&KEY" ), makeSymbol( "ELEMENT-NUM" ), makeSymbol( "DONE" ), makeSymbol( "BACKWARD?" ) ), makeSymbol( "&BODY" ),
        makeSymbol( "BODY" ) );
    $list116 = ConsesLow.list( makeKeyword( "ELEMENT-NUM" ), makeKeyword( "DONE" ), makeKeyword( "BACKWARD?" ) );
    $kw117$ELEMENT_NUM = makeKeyword( "ELEMENT-NUM" );
    $kw118$BACKWARD_ = makeKeyword( "BACKWARD?" );
    $sym119$DO_VECTOR_INDEX = makeSymbol( "DO-VECTOR-INDEX" );
    $sym120$ELEMENT_NUM = makeUninternedSymbol( "ELEMENT-NUM" );
    $list121 = ConsesLow.list( ConsesLow.list( makeSymbol( "KEY" ), makeSymbol( "VALUE" ), makeSymbol( "VECTOR" ), makeSymbol( "&KEY" ), makeSymbol( "DONE" ), makeSymbol( "BACKWARD?" ) ), makeSymbol( "&BODY" ),
        makeSymbol( "BODY" ) );
    $list122 = ConsesLow.list( makeKeyword( "DONE" ), makeKeyword( "BACKWARD?" ) );
    $sym123$VECTOR_VAR = makeUninternedSymbol( "VECTOR-VAR" );
    $sym124$BACKWARD__VAR = makeUninternedSymbol( "BACKWARD?-VAR" );
    $sym125$LENGTH = makeUninternedSymbol( "LENGTH" );
    $sym126$START = makeUninternedSymbol( "START" );
    $sym127$END = makeUninternedSymbol( "END" );
    $sym128$DELTA = makeUninternedSymbol( "DELTA" );
    $sym129$LIST = makeSymbol( "LIST" );
    $sym130$_ = makeSymbol( "-" );
    $list131 = ConsesLow.list( ONE_INTEGER );
    $list132 = ConsesLow.list( MINUS_ONE_INTEGER, MINUS_ONE_INTEGER );
    $sym133$AREF = makeSymbol( "AREF" );
    $sym134$ITERATION = makeUninternedSymbol( "ITERATION" );
    $sym135$CDOVECTOR = makeSymbol( "CDOVECTOR" );
    $list136 = ConsesLow.list( ConsesLow.list( makeSymbol( "VAR" ), makeSymbol( "VECTOR" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym137$CSOME_VECTOR = makeSymbol( "CSOME-VECTOR" );
    $list138 = ConsesLow.list( ConsesLow.list( makeSymbol( "VAR" ), makeSymbol( "VECTOR" ), makeSymbol( "DONEVAR" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym139$SMART_CSOMEVECTOR = makeSymbol( "SMART-CSOMEVECTOR" );
    $sym140$DO_SEQUENCE = makeSymbol( "DO-SEQUENCE" );
    $list141 = ConsesLow.list( ConsesLow.list( makeSymbol( "VAR" ), makeSymbol( "SEQUENCE" ), makeSymbol( "&KEY" ), makeSymbol( "ELEMENT-NUM" ), makeSymbol( "DONE" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $list142 = ConsesLow.list( makeKeyword( "ELEMENT-NUM" ), makeKeyword( "DONE" ) );
    $sym143$DO_SEQUENCE_INDEX = makeSymbol( "DO-SEQUENCE-INDEX" );
    $sym144$ELEMENT_NUM = makeUninternedSymbol( "ELEMENT-NUM" );
    $list145 = ConsesLow.list( ConsesLow.list( makeSymbol( "KEY-VAR" ), makeSymbol( "VALUE-VAR" ), makeSymbol( "SEQUENCE" ), makeSymbol( "&KEY" ), makeSymbol( "DONE" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym146$SEQUENCE_VAR = makeUninternedSymbol( "SEQUENCE-VAR" );
    $sym147$END_INDEX = makeUninternedSymbol( "END-INDEX" );
    $sym148$SEQUENCE_DONE_ = makeUninternedSymbol( "SEQUENCE-DONE?" );
    $sym149$FUNLESS = makeSymbol( "FUNLESS" );
    $sym150$LISTP = makeSymbol( "LISTP" );
    $sym151$DO_SEQUENCE_INDEX_DONE_ = makeSymbol( "DO-SEQUENCE-INDEX-DONE?" );
    $sym152$DO_SEQUENCE_INDEX_VALUE_ = makeSymbol( "DO-SEQUENCE-INDEX-VALUE?" );
    $sym153$PROGN = makeSymbol( "PROGN" );
    $sym154$DO_SEQUENCE_INDEX_UPDATE = makeSymbol( "DO-SEQUENCE-INDEX-UPDATE" );
    $sym155$DO_HASH_TABLE = makeSymbol( "DO-HASH-TABLE" );
    $list156 = ConsesLow.list( ConsesLow.list( makeSymbol( "KEY" ), makeSymbol( "VALUE" ), makeSymbol( "HASH-TABLE" ), makeSymbol( "&KEY" ), makeSymbol( "DONE" ), makeSymbol( "PROGRESS-MESSAGE" ) ), makeSymbol(
        "&BODY" ), makeSymbol( "BODY" ) );
    $sym157$MESSAGE_VAR = makeUninternedSymbol( "MESSAGE-VAR" );
    $sym158$SILENT_ = makeUninternedSymbol( "SILENT?" );
    $sym159$TABLE_VAR = makeUninternedSymbol( "TABLE-VAR" );
    $sym160$INDEX_VAR = makeUninternedSymbol( "INDEX-VAR" );
    $sym161$COUNT_VAR = makeUninternedSymbol( "COUNT-VAR" );
    $list162 = ConsesLow.list( makeSymbol( "*SILENT-PROGRESS?*" ) );
    $sym163$_SILENT_PROGRESS__ = makeSymbol( "*SILENT-PROGRESS?*" );
    $sym164$FIRST_OF = makeSymbol( "FIRST-OF" );
    $list165 = ConsesLow.list( makeString( "" ) );
    $sym166$HASH_TABLE_COUNT = makeSymbol( "HASH-TABLE-COUNT" );
    $sym167$CCATCH_IGNORE = makeSymbol( "CCATCH-IGNORE" );
    $kw168$DO_HASH_TABLE = makeKeyword( "DO-HASH-TABLE" );
    $sym169$DO_HASH_TABLE_DONE_CHECK = makeSymbol( "DO-HASH-TABLE-DONE-CHECK" );
    $sym170$CDOHASH = makeSymbol( "CDOHASH" );
    $sym171$DO_HASH_TABLE_KEYS = makeSymbol( "DO-HASH-TABLE-KEYS" );
    $list172 = ConsesLow.list( ConsesLow.list( makeSymbol( "KEY" ), makeSymbol( "HASH-TABLE" ), makeSymbol( "&KEY" ), makeSymbol( "DONE" ), makeSymbol( "PROGRESS-MESSAGE" ) ), makeSymbol( "&BODY" ), makeSymbol(
        "BODY" ) );
    $sym173$NO_VALUE = makeUninternedSymbol( "NO-VALUE" );
    $list174 = ConsesLow.list( makeSymbol( "TAG" ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym175$CATCH_VAR = makeUninternedSymbol( "CATCH-VAR" );
    $sym176$CCATCH = makeSymbol( "CCATCH" );
    $sym177$PUNLESS_ERROR = makeSymbol( "PUNLESS-ERROR" );
    $list178 = ConsesLow.list( makeSymbol( "FORM" ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym179$ERROR = makeUninternedSymbol( "ERROR" );
    $sym180$CATCH_ERROR_MESSAGE = makeSymbol( "CATCH-ERROR-MESSAGE" );
    $sym181$PWHEN_ERROR = makeSymbol( "PWHEN-ERROR" );
    $sym182$ERROR = makeUninternedSymbol( "ERROR" );
    $sym183$PWHEN = makeSymbol( "PWHEN" );
    $sym184$WARN_ON_ERRORS = makeSymbol( "WARN-ON-ERRORS" );
    $sym185$MESSAGE_VAR = makeUninternedSymbol( "MESSAGE-VAR" );
    $sym186$WITHOUT_APPENDING_STACK_TRACES_TO_ERROR_MESSAGES = makeSymbol( "WITHOUT-APPENDING-STACK-TRACES-TO-ERROR-MESSAGES" );
    $sym187$STRINGP = makeSymbol( "STRINGP" );
    $sym188$WARN = makeSymbol( "WARN" );
    $str189$_A = makeString( "~A" );
    $sym190$POSSIBLY_WARN_ON_ERRORS = makeSymbol( "POSSIBLY-WARN-ON-ERRORS" );
    $list191 = ConsesLow.list( makeSymbol( "VAR" ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym192$PIF = makeSymbol( "PIF" );
    $sym193$POSSIBLY_IGNORE_ERRORS = makeSymbol( "POSSIBLY-IGNORE-ERRORS" );
    $sym194$IGNORE_ERRORS = makeSymbol( "IGNORE-ERRORS" );
    $sym195$WARN_OR_IGNORE_ERRORS = makeSymbol( "WARN-OR-IGNORE-ERRORS" );
    $sym196$WITH_DEFAULT_ERROR_HANDLING = makeSymbol( "WITH-DEFAULT-ERROR-HANDLING" );
    $sym197$WITH_ERROR_HANDLER = makeSymbol( "WITH-ERROR-HANDLER" );
    $sym198$CUNWIND_ON_FAILURE = makeSymbol( "CUNWIND-ON-FAILURE" );
    $list199 = ConsesLow.list( makeSymbol( "PROTECTED-FORM" ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym200$SUCCESS_VAR = makeUninternedSymbol( "SUCCESS-VAR" );
    $sym201$CUNWIND_PROTECT = makeSymbol( "CUNWIND-PROTECT" );
    $list202 = ConsesLow.list( T );
    $sym203$CUNWIND_PROTECT_WITH_FAIL_CLAUSE = makeSymbol( "CUNWIND-PROTECT-WITH-FAIL-CLAUSE" );
    $list204 = ConsesLow.list( makeSymbol( "PROTECTED-FORM" ), makeSymbol( "FAILURE-FORM" ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym205$SUCCESS_VAR = makeUninternedSymbol( "SUCCESS-VAR" );
    $sym206$_IGNORE_ASSERT_TYPES__ = makeSymbol( "*IGNORE-ASSERT-TYPES?*" );
    $sym207$ASSERT_TYPE = makeSymbol( "ASSERT-TYPE" );
    $list208 = ConsesLow.list( makeSymbol( "OBJECT" ), makeSymbol( "PRED" ) );
    $sym209$CHECK_TYPE = makeSymbol( "CHECK-TYPE" );
    $sym210$ASSERT_TYPE_IF_PRESENT = makeSymbol( "ASSERT-TYPE-IF-PRESENT" );
    $sym211$CHECK_TYPE_IF_PRESENT = makeSymbol( "CHECK-TYPE-IF-PRESENT" );
    $sym212$ASSERT_LIST_TYPE = makeSymbol( "ASSERT-LIST-TYPE" );
    $list213 = ConsesLow.list( makeSymbol( "LIST" ), makeSymbol( "PRED" ) );
    $sym214$CHECK_LIST_TYPE = makeSymbol( "CHECK-LIST-TYPE" );
    $sym215$ASSERT_PLIST_TYPE = makeSymbol( "ASSERT-PLIST-TYPE" );
    $list216 = ConsesLow.list( makeSymbol( "PLIST" ), makeSymbol( "PRED" ) );
    $sym217$CHECK_PLIST_TYPE = makeSymbol( "CHECK-PLIST-TYPE" );
    $sym218$ASSERT_MUST = makeSymbol( "ASSERT-MUST" );
    $list219 = ConsesLow.list( makeSymbol( "FORM" ), makeSymbol( "FORMAT-STRING" ), makeSymbol( "&REST" ), makeSymbol( "ARGUMENTS" ) );
    $list220 = ConsesLow.list( makeSymbol( "PROGN" ) );
    $sym221$MUST = makeSymbol( "MUST" );
    $sym222$PCASE_FEATURE = makeSymbol( "PCASE-FEATURE" );
    $list223 = ConsesLow.cons( makeSymbol( "FEATURE-EXPRESSION" ), makeSymbol( "BODY" ) );
    $sym224$OTHERWISE = makeSymbol( "OTHERWISE" );
    $sym225$PIF_FEATURE = makeSymbol( "PIF-FEATURE" );
    $list226 = ConsesLow.list( makeSymbol( "FEATURE-CLAUSE" ), makeSymbol( "ACTION" ), makeSymbol( "ELSE-ACTION" ) );
    $list227 = ConsesLow.list( makeSymbol( "FEATURE-CLAUSE" ), makeSymbol( "&BODY" ), makeSymbol( "FEATURE-CLAUSES" ) );
    $sym228$PWHEN_FEATURE = makeSymbol( "PWHEN-FEATURE" );
    $list229 = ConsesLow.list( makeSymbol( "FEATURE-CLAUSE" ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym230$PUNLESS_FEATURE = makeSymbol( "PUNLESS-FEATURE" );
    $sym231$FCASE_FEATURE = makeSymbol( "FCASE-FEATURE" );
    $list232 = ConsesLow.list( makeSymbol( "FEATURE-EXPRESSION" ), makeSymbol( "FORM" ) );
    $sym233$FIF_FEATURE = makeSymbol( "FIF-FEATURE" );
    $sym234$FWHEN_FEATURE = makeSymbol( "FWHEN-FEATURE" );
    $sym235$FEATURE_MATCH = makeSymbol( "FEATURE-MATCH" );
    $list236 = ConsesLow.list( makeSymbol( "FEATURE-CLAUSE" ) );
    $sym237$FUNLESS_FEATURE = makeSymbol( "FUNLESS-FEATURE" );
    $list238 = ConsesLow.list( NIL );
    $sym239$FIMPLIES_FEATURE = makeSymbol( "FIMPLIES-FEATURE" );
    $list240 = ConsesLow.list( ConsesLow.list( makeSymbol( "OTHERWISE" ), T ) );
    $sym241$ATOMIC_FEATURE_MATCH = makeSymbol( "ATOMIC-FEATURE-MATCH" );
    $sym242$FEATURE_EXPRESSION_MATCH = makeSymbol( "FEATURE-EXPRESSION-MATCH" );
    $list243 = ConsesLow.cons( makeSymbol( "OPERATOR" ), makeSymbol( "SUBEXPRESSIONS" ) );
    $kw244$NOT = makeKeyword( "NOT" );
    $sym245$NOT = makeSymbol( "NOT" );
    $kw246$OR = makeKeyword( "OR" );
    $sym247$OR = makeSymbol( "OR" );
    $kw248$AND = makeKeyword( "AND" );
    $sym249$AND = makeSymbol( "AND" );
    $str250$_S_is_not_a_well_formed_feature_e = makeString( "~S is not a well-formed feature expression" );
    $sym251$FUNCALL_IF = makeSymbol( "FUNCALL-IF" );
    $list252 = ConsesLow.list( makeSymbol( "FUNC" ), makeSymbol( "&REST" ), makeSymbol( "ARGS" ) );
    $list253 = ConsesLow.list( makeSymbol( "FALSE" ) );
    $sym254$FWHEN = makeSymbol( "FWHEN" );
    $sym255$FUNCALL = makeSymbol( "FUNCALL" );
    $sym256$CPUSH_IF = makeSymbol( "CPUSH-IF" );
    $list257 = ConsesLow.list( makeSymbol( "ITEM" ), makeSymbol( "PLACE" ) );
    $sym258$VAR = makeUninternedSymbol( "VAR" );
    $sym259$CPUSHNEW_IF = makeSymbol( "CPUSHNEW-IF" );
    $list260 = ConsesLow.list( makeSymbol( "ITEM" ), makeSymbol( "PLACE" ), makeSymbol( "&OPTIONAL" ), ConsesLow.list( makeSymbol( "TEST" ), ConsesLow.list( makeSymbol( "QUOTE" ), ConsesLow.list( makeSymbol(
        "FUNCTION" ), EQL ) ) ), ConsesLow.list( makeSymbol( "KEY" ), ConsesLow.list( makeSymbol( "QUOTE" ), ConsesLow.list( makeSymbol( "FUNCTION" ), IDENTITY ) ) ) );
    $list261 = ConsesLow.list( makeSymbol( "FUNCTION" ), EQL );
    $list262 = ConsesLow.list( makeSymbol( "FUNCTION" ), IDENTITY );
    $sym263$VAR = makeUninternedSymbol( "VAR" );
    $sym264$CPUSHNEW = makeSymbol( "CPUSHNEW" );
    $sym265$CPUSH_ALL = makeSymbol( "CPUSH-ALL" );
    $list266 = ConsesLow.list( makeSymbol( "ITEMS" ), makeSymbol( "PLACE" ) );
    $sym267$ITEM = makeUninternedSymbol( "ITEM" );
    $sym268$ITEMS_VAR = makeUninternedSymbol( "ITEMS-VAR" );
    $sym269$VECTORP = makeSymbol( "VECTORP" );
    $sym270$CPUSHNEW_ALL = makeSymbol( "CPUSHNEW-ALL" );
    $list271 = ConsesLow.list( makeSymbol( "ITEMS" ), makeSymbol( "PLACE" ), makeSymbol( "&OPTIONAL" ), ConsesLow.list( makeSymbol( "TEST" ), ConsesLow.list( makeSymbol( "QUOTE" ), ConsesLow.list( makeSymbol(
        "FUNCTION" ), EQL ) ) ), ConsesLow.list( makeSymbol( "KEY" ), ConsesLow.list( makeSymbol( "QUOTE" ), ConsesLow.list( makeSymbol( "FUNCTION" ), IDENTITY ) ) ) );
    $sym272$ITEM = makeUninternedSymbol( "ITEM" );
    $sym273$ITEMS_VAR = makeUninternedSymbol( "ITEMS-VAR" );
    $sym274$CSETF_DELETE = makeSymbol( "CSETF-DELETE" );
    $list275 = ConsesLow.list( makeSymbol( "ITEM" ), makeSymbol( "PLACE" ), makeSymbol( "&KEY" ), ConsesLow.list( makeSymbol( "TEST" ), ConsesLow.list( makeSymbol( "QUOTE" ), ConsesLow.list( makeSymbol( "FUNCTION" ),
        EQL ) ) ), ConsesLow.list( makeSymbol( "KEY" ), ConsesLow.list( makeSymbol( "QUOTE" ), ConsesLow.list( makeSymbol( "FUNCTION" ), IDENTITY ) ) ) );
    $list276 = ConsesLow.list( makeKeyword( "TEST" ), makeKeyword( "KEY" ) );
    $kw277$TEST = makeKeyword( "TEST" );
    $kw278$KEY = makeKeyword( "KEY" );
    $sym279$CSETF = makeSymbol( "CSETF" );
    $sym280$DELETE = makeSymbol( "DELETE" );
    $sym281$CPUSH_END = makeSymbol( "CPUSH-END" );
    $sym282$NEW_CONS = makeUninternedSymbol( "NEW-CONS" );
    $sym283$LIST = makeUninternedSymbol( "LIST" );
    $sym284$RPLACD_LAST = makeSymbol( "RPLACD-LAST" );
    $sym285$CPUSHNEW_END = makeSymbol( "CPUSHNEW-END" );
    $sym286$ITEM_VAR = makeUninternedSymbol( "ITEM-VAR" );
    $sym287$MEMBER = makeSymbol( "MEMBER" );
    $sym288$WAS_APPENDING_ = makeUninternedSymbol( "WAS-APPENDING?" );
    $kw289$SL2JAVA = makeKeyword( "SL2JAVA" );
    $list290 = ConsesLow.list( ConsesLow.list( makeSymbol( "EVAL" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "*APPEND-STACK-TRACES-TO-ERROR-MESSAGES?*" ) ) ) );
    $list291 = ConsesLow.list( makeSymbol( "EVAL" ), ConsesLow.list( makeSymbol( "QUOTE" ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "*APPEND-STACK-TRACES-TO-ERROR-MESSAGES?*" ), NIL ) ) );
    $sym292$EVAL = makeSymbol( "EVAL" );
    $list293 = ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "CSETQ" ) );
    $list294 = ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "*APPEND-STACK-TRACES-TO-ERROR-MESSAGES?*" ) );
    $sym295$SILENTLY = makeSymbol( "SILENTLY" );
    $list296 = ConsesLow.list( ConsesLow.list( makeSymbol( "*IGNORE-WARNS?*" ), T ), ConsesLow.list( makeSymbol( "*IGNORE-BREAKS?*" ), T ), ConsesLow.list( makeSymbol( "*SILENT-PROGRESS?*" ), T ), ConsesLow.list(
        makeSymbol( "*CONTINUE-CERROR?*" ), T ), ConsesLow.list( makeSymbol( "*STANDARD-OUTPUT*" ), makeSymbol( "*NULL-OUTPUT*" ) ), ConsesLow.list( makeSymbol( "*ERROR-OUTPUT*" ), makeSymbol( "*NULL-OUTPUT*" ) ) );
    $sym297$FIMPLIES = makeSymbol( "FIMPLIES" );
    $list298 = ConsesLow.list( makeSymbol( "LHS" ), makeSymbol( "RHS" ) );
    $sym299$FXOR = makeSymbol( "FXOR" );
    $list300 = ConsesLow.list( makeSymbol( "A" ), makeSymbol( "B" ) );
    $sym301$FEQUIV = makeSymbol( "FEQUIV" );
    $list302 = ConsesLow.list( makeSymbol( "VAR?" ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym303$WITH_STATIC_AREA = makeSymbol( "WITH-STATIC-AREA" );
  }
}
/*
 * 
 * Total time: 734 ms
 * 
 */