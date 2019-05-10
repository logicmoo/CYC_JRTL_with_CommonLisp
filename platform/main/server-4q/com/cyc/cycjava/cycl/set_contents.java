package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class set_contents
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.set_contents";
  public static final String myFingerPrint = "6d25b9d3725b3d84d4d1b8977da7c78f08bbc78b3ccf8256418aca09375f3771";
  @SubLTranslatedFile.SubL(source = "cycl/set-contents.lisp", position = 825L)
  private static SubLSymbol $set_contents_grow_to_keyhash_size$;
  @SubLTranslatedFile.SubL(source = "cycl/set-contents.lisp", position = 1245L)
  private static SubLSymbol $set_contents_shrink_to_list_size$;
  private static final SubLInteger $int0$128;
  private static final SubLInteger $int1$110;
  private static final SubLList $list2;
  private static final SubLSymbol $kw3$LIST;
  private static final SubLSymbol $kw4$KEYHASH;
  private static final SubLSymbol $kw5$SINGLETON;
  private static final SubLList $list6;
  private static final SubLString $str7$Keyhash_test_conflict___S_and__S;
  private static final SubLList $list8;
  private static final SubLSymbol $sym9$FUNCTION_SPEC_P;
  private static final SubLSymbol $sym10$NON_NEGATIVE_INTEGER_P;
  private static final SubLSymbol $sym11$VALID_HASH_TEST_P;
  private static final SubLList $list12;
  private static final SubLList $list13;
  private static final SubLSymbol $kw14$ALLOW_OTHER_KEYS;
  private static final SubLSymbol $kw15$DONE;
  private static final SubLSymbol $sym16$SET_CONTENTS_VAR;
  private static final SubLSymbol $sym17$BASIS_OBJECT;
  private static final SubLSymbol $sym18$STATE;
  private static final SubLSymbol $sym19$CLET;
  private static final SubLSymbol $sym20$DO_SET_CONTENTS_BASIS_OBJECT;
  private static final SubLSymbol $sym21$CDO;
  private static final SubLSymbol $sym22$DO_SET_CONTENTS_INITIAL_STATE;
  private static final SubLSymbol $sym23$DO_SET_CONTENTS_UPDATE_STATE;
  private static final SubLSymbol $sym24$COR;
  private static final SubLSymbol $sym25$DO_SET_CONTENTS_DONE_;
  private static final SubLSymbol $sym26$DO_SET_CONTENTS_NEXT;
  private static final SubLSymbol $sym27$PWHEN;
  private static final SubLSymbol $sym28$DO_SET_CONTENTS_ELEMENT_VALID_;
  private static final SubLSymbol $sym29$DO_SET_CONTENTS;
  private static final SubLSymbol $kw30$NOT_DONE;
  private static final SubLString $str31$new_set_contents_did_not_have_siz;
  private static final SubLString $str32$set_contents_was_purported_to_con;
  private static final SubLString $str33$do_set_contents_should_not_have_i;
  private static final SubLString $str34$size_did_not_increment_to_1_when_;
  private static final SubLString $str35$set_contents_should_have_had_1_as;
  private static final SubLString $str36$do_set_contents_should_have_itera;
  private static final SubLString $str37$size_did_not_stay_1_when_a_redund;
  private static final SubLString $str38$incorrectly_thought_that_NIL_was_;
  private static final SubLString $str39$size_did_not_increment_to_2_when_;
  private static final SubLString $str40$failed_to_identify_that_NIL_is_an;
  private static final SubLString $str41$do_set_contents_should_have_itera;
  private static final SubLInteger $int42$2000;
  private static final SubLInteger $int43$2001;
  private static final SubLString $str44$size_did_not_increment_to_2001;
  private static final SubLInteger $int45$212;
  private static final SubLString $str46$212_was_not_a_member;
  private static final SubLString $str47$do_set_contents_should_have_itera;
  private static final SubLString $str48$removing_an_element_that_wasn_t_t;
  private static final SubLString $str49$removing_an_element_failed_to_dec;
  private static final SubLString $str50$do_set_contents_should_have_itera;
  private static final SubLString $str51$newly_emptied_set_contents_was_pu;
  private static final SubLString $str52$failed_to_identify_that_NIL_is_st;
  private static final SubLString $str53$size_did_not_decrement_to_1_when_;
  private static final SubLString $str54$newly_emptied_set_contents_did_no;
  private static final SubLSymbol $kw55$SUCCESS;

  @SubLTranslatedFile.SubL(source = "cycl/set-contents.lisp", position = 1368L)
  public static SubLObject set_contents_singleton_element_p(final SubLObject element)
  {
    return makeBoolean( !element.isList() && NIL == keyhash.keyhash_p( element ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/set-contents.lisp", position = 1564L)
  public static SubLObject set_contents_style(final SubLObject v_set_contents)
  {
    if( v_set_contents.isList() )
    {
      return $kw3$LIST;
    }
    if( NIL != keyhash.keyhash_p( v_set_contents ) )
    {
      return $kw4$KEYHASH;
    }
    return $kw5$SINGLETON;
  }

  @SubLTranslatedFile.SubL(source = "cycl/set-contents.lisp", position = 2112L)
  public static SubLObject set_contents_member_singleton_style(final SubLObject v_set_contents, final SubLObject element, final SubLObject test)
  {
    return Functions.funcall( test, element, v_set_contents );
  }

  @SubLTranslatedFile.SubL(source = "cycl/set-contents.lisp", position = 2273L)
  public static SubLObject set_contents_member_list_style(final SubLObject v_set_contents, final SubLObject element, final SubLObject test)
  {
    return subl_promotions.memberP( element, v_set_contents, test, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/set-contents.lisp", position = 2429L)
  public static SubLObject set_contents_nmember_list_style(final SubLObject v_set_contents, final SubLObject element, final SubLObject test)
  {
    return list_utilities.nmemberP( element, v_set_contents, test );
  }

  @SubLTranslatedFile.SubL(source = "cycl/set-contents.lisp", position = 2552L)
  public static SubLObject set_contents_member_keyhash_style(final SubLObject v_set_contents, final SubLObject element, final SubLObject test)
  {
    return keyhash.getkeyhash( element, v_set_contents );
  }

  @SubLTranslatedFile.SubL(source = "cycl/set-contents.lisp", position = 2749L)
  public static SubLObject set_contents_matching_element_singleton_style(final SubLObject v_set_contents, final SubLObject element, final SubLObject test)
  {
    if( NIL != Functions.funcall( test, element, v_set_contents ) )
    {
      return v_set_contents;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/set-contents.lisp", position = 2978L)
  public static SubLObject set_contents_matching_element_list_style(final SubLObject v_set_contents, final SubLObject element, final SubLObject test)
  {
    return Sequences.find( element, v_set_contents, test, UNPROVIDED, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/set-contents.lisp", position = 3106L)
  public static SubLObject set_contents_matching_element_keyhash_style(final SubLObject v_set_contents, final SubLObject element, final SubLObject test)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject keyhash_test = keyhash.keyhash_test( v_set_contents );
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && !hash_table_utilities.hash_test_to_symbol( test ).eql( hash_table_utilities.hash_test_to_symbol( keyhash_test ) ) )
    {
      Errors.error( $str7$Keyhash_test_conflict___S_and__S, test, keyhash_test );
    }
    return keyhash.keyhash_matching_key( element, v_set_contents );
  }

  @SubLTranslatedFile.SubL(source = "cycl/set-contents.lisp", position = 3502L)
  public static SubLObject set_contents_add_singleton_style(SubLObject v_set_contents, final SubLObject element, final SubLObject test)
  {
    final SubLObject already_thereP = set_contents_member_singleton_style( v_set_contents, element, test );
    if( NIL == already_thereP )
    {
      v_set_contents = ConsesLow.list( element, v_set_contents );
    }
    return v_set_contents;
  }

  @SubLTranslatedFile.SubL(source = "cycl/set-contents.lisp", position = 3803L)
  public static SubLObject set_contents_add_list_style(SubLObject v_set_contents, final SubLObject element, final SubLObject test)
  {
    final SubLObject already_thereP = set_contents_member_list_style( v_set_contents, element, test );
    if( NIL == already_thereP )
    {
      if( NIL == v_set_contents && NIL != set_contents_singleton_element_p( element ) )
      {
        v_set_contents = element;
      }
      else
      {
        v_set_contents = ConsesLow.cons( element, v_set_contents );
        final SubLObject size = Sequences.length( v_set_contents );
        if( size.numG( $set_contents_grow_to_keyhash_size$.getGlobalValue() ) )
        {
          v_set_contents = keyhash_utilities.keyhash_list_elements( v_set_contents, test, size );
        }
      }
    }
    return v_set_contents;
  }

  @SubLTranslatedFile.SubL(source = "cycl/set-contents.lisp", position = 4405L)
  public static SubLObject set_contents_add_keyhash_style(final SubLObject v_set_contents, final SubLObject element, final SubLObject test)
  {
    keyhash.setkeyhash( element, v_set_contents );
    return v_set_contents;
  }

  @SubLTranslatedFile.SubL(source = "cycl/set-contents.lisp", position = 4609L)
  public static SubLObject set_contents_delete_singleton_style(SubLObject v_set_contents, final SubLObject element, final SubLObject test)
  {
    final SubLObject already_thereP = set_contents_member_singleton_style( v_set_contents, element, test );
    if( NIL != already_thereP )
    {
      v_set_contents = NIL;
    }
    return v_set_contents;
  }

  @SubLTranslatedFile.SubL(source = "cycl/set-contents.lisp", position = 4900L)
  public static SubLObject set_contents_delete_list_style(SubLObject v_set_contents, final SubLObject element, final SubLObject test)
  {
    v_set_contents = Sequences.delete( element, v_set_contents, test, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    if( NIL != list_utilities.singletonP( v_set_contents ) )
    {
      final SubLObject sole_element = v_set_contents.first();
      if( NIL != set_contents_singleton_element_p( sole_element ) )
      {
        v_set_contents = sole_element;
      }
    }
    return v_set_contents;
  }

  @SubLTranslatedFile.SubL(source = "cycl/set-contents.lisp", position = 5263L)
  public static SubLObject set_contents_delete_keyhash_style(SubLObject v_set_contents, final SubLObject element, final SubLObject test)
  {
    final SubLObject already_thereP = set_contents_member_keyhash_style( v_set_contents, element, test );
    if( NIL != already_thereP )
    {
      keyhash.remkeyhash( element, v_set_contents );
      final SubLObject size = keyhash.keyhash_count( v_set_contents );
      if( size.numL( $set_contents_shrink_to_list_size$.getGlobalValue() ) )
      {
        v_set_contents = keyhash_utilities.keyhash_element_list( v_set_contents );
      }
    }
    return v_set_contents;
  }

  @SubLTranslatedFile.SubL(source = "cycl/set-contents.lisp", position = 5707L)
  public static SubLObject set_contents_p(final SubLObject v_object)
  {
    return T;
  }

  @SubLTranslatedFile.SubL(source = "cycl/set-contents.lisp", position = 6213L)
  public static SubLObject set_contents_of_type_p(final SubLObject v_object, final SubLObject type)
  {
    if( v_object.isList() || NIL != keyhash.keyhash_p( v_object ) )
    {
      return T;
    }
    assert NIL != Types.function_spec_p( type ) : type;
    return makeBoolean( NIL != set_contents_singleton_element_p( v_object ) && NIL != Functions.funcall( type, v_object ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/set-contents.lisp", position = 6608L)
  public static SubLObject new_set_contents(SubLObject size, SubLObject test)
  {
    if( size == UNPROVIDED )
    {
      size = ZERO_INTEGER;
    }
    if( test == UNPROVIDED )
    {
      test = Symbols.symbol_function( EQL );
    }
    assert NIL != subl_promotions.non_negative_integer_p( size ) : size;
    assert NIL != hash_table_utilities.valid_hash_test_p( test ) : test;
    if( size.numG( $set_contents_grow_to_keyhash_size$.getGlobalValue() ) )
    {
      return keyhash.new_keyhash( size, test );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/set-contents.lisp", position = 7071L)
  public static SubLObject copy_set_contents(final SubLObject v_set_contents)
  {
    final SubLObject pcase_var = set_contents_style( v_set_contents );
    if( pcase_var.eql( $kw5$SINGLETON ) )
    {
      return v_set_contents;
    }
    if( pcase_var.eql( $kw3$LIST ) )
    {
      return conses_high.copy_list( v_set_contents );
    }
    if( pcase_var.eql( $kw4$KEYHASH ) )
    {
      return keyhash.copy_keyhash( v_set_contents );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/set-contents.lisp", position = 7447L)
  public static SubLObject set_contents_size(final SubLObject v_set_contents)
  {
    final SubLObject pcase_var = set_contents_style( v_set_contents );
    if( pcase_var.eql( $kw5$SINGLETON ) )
    {
      return ONE_INTEGER;
    }
    if( pcase_var.eql( $kw3$LIST ) )
    {
      return Sequences.length( v_set_contents );
    }
    if( pcase_var.eql( $kw4$KEYHASH ) )
    {
      return keyhash.keyhash_count( v_set_contents );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/set-contents.lisp", position = 7839L)
  public static SubLObject set_contents_emptyP(final SubLObject v_set_contents)
  {
    final SubLObject pcase_var = set_contents_style( v_set_contents );
    if( pcase_var.eql( $kw5$SINGLETON ) )
    {
      return NIL;
    }
    if( pcase_var.eql( $kw3$LIST ) )
    {
      return Types.sublisp_null( v_set_contents );
    }
    if( pcase_var.eql( $kw4$KEYHASH ) )
    {
      return Numbers.zerop( keyhash.keyhash_count( v_set_contents ) );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/set-contents.lisp", position = 8180L)
  public static SubLObject set_contents_singletonP(final SubLObject v_set_contents)
  {
    final SubLObject pcase_var = set_contents_style( v_set_contents );
    if( pcase_var.eql( $kw5$SINGLETON ) )
    {
      return T;
    }
    if( pcase_var.eql( $kw3$LIST ) )
    {
      return NIL;
    }
    if( pcase_var.eql( $kw4$KEYHASH ) )
    {
      return NIL;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/set-contents.lisp", position = 8474L)
  public static SubLObject set_contents_memberP(final SubLObject element, final SubLObject v_set_contents, SubLObject test)
  {
    if( test == UNPROVIDED )
    {
      test = Symbols.symbol_function( EQL );
    }
    final SubLObject pcase_var = set_contents_style( v_set_contents );
    if( pcase_var.eql( $kw5$SINGLETON ) )
    {
      return set_contents_member_singleton_style( v_set_contents, element, test );
    }
    if( pcase_var.eql( $kw3$LIST ) )
    {
      return set_contents_member_list_style( v_set_contents, element, test );
    }
    if( pcase_var.eql( $kw4$KEYHASH ) )
    {
      return set_contents_member_keyhash_style( v_set_contents, element, test );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/set-contents.lisp", position = 9092L)
  public static SubLObject set_contents_nmemberP(final SubLObject element, final SubLObject v_set_contents, SubLObject test)
  {
    if( test == UNPROVIDED )
    {
      test = Symbols.symbol_function( EQL );
    }
    final SubLObject pcase_var = set_contents_style( v_set_contents );
    if( pcase_var.eql( $kw5$SINGLETON ) )
    {
      return set_contents_member_singleton_style( v_set_contents, element, test );
    }
    if( pcase_var.eql( $kw3$LIST ) )
    {
      return set_contents_nmember_list_style( v_set_contents, element, test );
    }
    if( pcase_var.eql( $kw4$KEYHASH ) )
    {
      return set_contents_member_keyhash_style( v_set_contents, element, test );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/set-contents.lisp", position = 9711L)
  public static SubLObject set_contents_matching_element(final SubLObject element, final SubLObject v_set_contents, SubLObject test)
  {
    if( test == UNPROVIDED )
    {
      test = Symbols.symbol_function( EQL );
    }
    final SubLObject pcase_var = set_contents_style( v_set_contents );
    if( pcase_var.eql( $kw5$SINGLETON ) )
    {
      return set_contents_matching_element_singleton_style( v_set_contents, element, test );
    }
    if( pcase_var.eql( $kw3$LIST ) )
    {
      return set_contents_matching_element_list_style( v_set_contents, element, test );
    }
    if( pcase_var.eql( $kw4$KEYHASH ) )
    {
      return set_contents_matching_element_keyhash_style( v_set_contents, element, test );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/set-contents.lisp", position = 10366L)
  public static SubLObject set_contents_random_element(final SubLObject v_set_contents)
  {
    final SubLObject pcase_var = set_contents_style( v_set_contents );
    if( pcase_var.eql( $kw5$SINGLETON ) )
    {
      return v_set_contents;
    }
    if( pcase_var.eql( $kw3$LIST ) )
    {
      return list_utilities.random_element( v_set_contents );
    }
    if( pcase_var.eql( $kw4$KEYHASH ) )
    {
      return keyhash.keyhash_random_key( v_set_contents );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/set-contents.lisp", position = 10722L)
  public static SubLObject singleton_set_contents_element(final SubLObject v_set_contents)
  {
    return v_set_contents;
  }

  @SubLTranslatedFile.SubL(source = "cycl/set-contents.lisp", position = 10916L)
  public static SubLObject set_contents_add(final SubLObject element, final SubLObject v_set_contents, SubLObject test)
  {
    if( test == UNPROVIDED )
    {
      test = Symbols.symbol_function( EQL );
    }
    assert NIL != hash_table_utilities.valid_hash_test_p( test ) : test;
    final SubLObject pcase_var = set_contents_style( v_set_contents );
    if( pcase_var.eql( $kw5$SINGLETON ) )
    {
      return set_contents_add_singleton_style( v_set_contents, element, test );
    }
    if( pcase_var.eql( $kw3$LIST ) )
    {
      return set_contents_add_list_style( v_set_contents, element, test );
    }
    if( pcase_var.eql( $kw4$KEYHASH ) )
    {
      return set_contents_add_keyhash_style( v_set_contents, element, test );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/set-contents.lisp", position = 11528L)
  public static SubLObject set_contents_delete(final SubLObject element, final SubLObject v_set_contents, SubLObject test)
  {
    if( test == UNPROVIDED )
    {
      test = Symbols.symbol_function( EQL );
    }
    assert NIL != hash_table_utilities.valid_hash_test_p( test ) : test;
    final SubLObject pcase_var = set_contents_style( v_set_contents );
    if( pcase_var.eql( $kw5$SINGLETON ) )
    {
      return set_contents_delete_singleton_style( v_set_contents, element, test );
    }
    if( pcase_var.eql( $kw3$LIST ) )
    {
      return set_contents_delete_list_style( v_set_contents, element, test );
    }
    if( pcase_var.eql( $kw4$KEYHASH ) )
    {
      return set_contents_delete_keyhash_style( v_set_contents, element, test );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/set-contents.lisp", position = 12145L)
  public static SubLObject clear_set_contents(final SubLObject v_set_contents)
  {
    final SubLObject pcase_var = set_contents_style( v_set_contents );
    if( pcase_var.eql( $kw4$KEYHASH ) )
    {
      keyhash.clrkeyhash( v_set_contents );
    }
    return new_set_contents( ZERO_INTEGER, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/set-contents.lisp", position = 12442L)
  public static SubLObject new_set_contents_iterator(final SubLObject v_set_contents)
  {
    final SubLObject pcase_var = set_contents_style( v_set_contents );
    if( pcase_var.eql( $kw5$SINGLETON ) )
    {
      return iteration.new_list_iterator( ConsesLow.list( v_set_contents ) );
    }
    if( pcase_var.eql( $kw3$LIST ) )
    {
      return iteration.new_list_iterator( v_set_contents );
    }
    if( pcase_var.eql( $kw4$KEYHASH ) )
    {
      return keyhash.new_keyhash_iterator( v_set_contents );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/set-contents.lisp", position = 12918L)
  public static SubLObject do_set_contents(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list12 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject element_var = NIL;
    SubLObject v_set_contents = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list12 );
    element_var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list12 );
    v_set_contents = current.first();
    current = current.rest();
    SubLObject allow_other_keys_p = NIL;
    SubLObject rest = current;
    SubLObject bad = NIL;
    SubLObject current_$1 = NIL;
    while ( NIL != rest)
    {
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list12 );
      current_$1 = rest.first();
      rest = rest.rest();
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list12 );
      if( NIL == conses_high.member( current_$1, $list13, UNPROVIDED, UNPROVIDED ) )
      {
        bad = T;
      }
      if( current_$1 == $kw14$ALLOW_OTHER_KEYS )
      {
        allow_other_keys_p = rest.first();
      }
      rest = rest.rest();
    }
    if( NIL != bad && NIL == allow_other_keys_p )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list12 );
    }
    final SubLObject done_tail = cdestructuring_bind.property_list_member( $kw15$DONE, current );
    final SubLObject done = ( NIL != done_tail ) ? conses_high.cadr( done_tail ) : NIL;
    final SubLObject body;
    current = ( body = temp );
    final SubLObject set_contents_var = $sym16$SET_CONTENTS_VAR;
    final SubLObject basis_object = $sym17$BASIS_OBJECT;
    final SubLObject state = $sym18$STATE;
    return ConsesLow.list( $sym19$CLET, ConsesLow.list( ConsesLow.list( set_contents_var, v_set_contents ), ConsesLow.list( basis_object, ConsesLow.list( $sym20$DO_SET_CONTENTS_BASIS_OBJECT, set_contents_var ) ) ),
        ConsesLow.list( $sym21$CDO, ConsesLow.list( ConsesLow.list( state, ConsesLow.list( $sym22$DO_SET_CONTENTS_INITIAL_STATE, basis_object, set_contents_var ), ConsesLow.list( $sym23$DO_SET_CONTENTS_UPDATE_STATE,
            state ) ) ), ConsesLow.list( reader.bq_cons( $sym24$COR, ConsesLow.append( ( NIL != done ) ? ConsesLow.list( done ) : NIL, ConsesLow.list( ConsesLow.list( $sym25$DO_SET_CONTENTS_DONE_, basis_object,
                state ) ) ) ) ), ConsesLow.list( $sym19$CLET, ConsesLow.list( ConsesLow.list( element_var, ConsesLow.list( $sym26$DO_SET_CONTENTS_NEXT, basis_object, state ) ) ), ConsesLow.listS( $sym27$PWHEN, ConsesLow
                    .list( $sym28$DO_SET_CONTENTS_ELEMENT_VALID_, state, element_var ), ConsesLow.append( body, NIL ) ) ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/set-contents.lisp", position = 14004L)
  public static SubLObject do_set_contents_basis_object(final SubLObject v_set_contents)
  {
    final SubLObject pcase_var = set_contents_style( v_set_contents );
    if( pcase_var.eql( $kw5$SINGLETON ) )
    {
      return v_set_contents;
    }
    if( pcase_var.eql( $kw3$LIST ) )
    {
      return v_set_contents;
    }
    if( pcase_var.eql( $kw4$KEYHASH ) )
    {
      return v_set_contents;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/set-contents.lisp", position = 14351L)
  public static SubLObject do_set_contents_initial_state(final SubLObject basis_object, final SubLObject v_set_contents)
  {
    final SubLObject pcase_var = set_contents_style( v_set_contents );
    if( pcase_var.eql( $kw5$SINGLETON ) )
    {
      return $kw30$NOT_DONE;
    }
    if( pcase_var.eql( $kw3$LIST ) )
    {
      return basis_object;
    }
    if( pcase_var.eql( $kw4$KEYHASH ) )
    {
      return keyhash.new_keyhash_iterator( basis_object );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/set-contents.lisp", position = 14708L)
  public static SubLObject do_set_contents_update_state(final SubLObject state)
  {
    if( state.isKeyword() )
    {
      return $kw15$DONE;
    }
    if( state.isList() )
    {
      return state.rest();
    }
    return state;
  }

  @SubLTranslatedFile.SubL(source = "cycl/set-contents.lisp", position = 15030L)
  public static SubLObject do_set_contents_doneP(final SubLObject basis_object, final SubLObject state)
  {
    if( state.isKeyword() )
    {
      return Equality.eq( $kw15$DONE, state );
    }
    if( state.isList() )
    {
      return Types.sublisp_null( state );
    }
    return iteration.iteration_done( state );
  }

  @SubLTranslatedFile.SubL(source = "cycl/set-contents.lisp", position = 15431L)
  public static SubLObject do_set_contents_next(final SubLObject basis_object, final SubLObject state)
  {
    if( $kw30$NOT_DONE == state )
    {
      return basis_object;
    }
    if( state.isList() )
    {
      return state.first();
    }
    return keyhash.keyhash_iterator_next( state );
  }

  @SubLTranslatedFile.SubL(source = "cycl/set-contents.lisp", position = 15811L)
  public static SubLObject do_set_contents_element_validP(final SubLObject state, final SubLObject element)
  {
    if( $kw30$NOT_DONE == state )
    {
      return T;
    }
    if( state.isList() )
    {
      return T;
    }
    return keyhash.do_keyhash_valid_key_p( element );
  }

  @SubLTranslatedFile.SubL(source = "cycl/set-contents.lisp", position = 16196L)
  public static SubLObject map_set_contents(final SubLObject function, final SubLObject v_set_contents, SubLObject args)
  {
    if( args == UNPROVIDED )
    {
      args = NIL;
    }
    assert NIL != Types.function_spec_p( function ) : function;
    SubLObject basis_object;
    SubLObject state;
    SubLObject element;
    for( basis_object = do_set_contents_basis_object( v_set_contents ), state = NIL, state = do_set_contents_initial_state( basis_object, v_set_contents ); NIL == do_set_contents_doneP( basis_object,
        state ); state = do_set_contents_update_state( state ) )
    {
      element = do_set_contents_next( basis_object, state );
      if( NIL != do_set_contents_element_validP( state, element ) )
      {
        Functions.apply( function, element, args );
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/set-contents.lisp", position = 16604L)
  public static SubLObject cfasl_input_set_contents(final SubLObject stream, final SubLObject v_set_contents, final SubLObject size, final SubLObject test)
  {
    final SubLObject pcase_var = set_contents_style( v_set_contents );
    if( pcase_var.eql( $kw5$SINGLETON ) )
    {
      return cfasl_input_set_contents_singleton_style( stream, v_set_contents, size, test );
    }
    if( pcase_var.eql( $kw3$LIST ) )
    {
      return cfasl_input_set_contents_list_style( stream, v_set_contents, size, test );
    }
    if( pcase_var.eql( $kw4$KEYHASH ) )
    {
      return cfasl_input_set_contents_keyhash_style( stream, v_set_contents, size, test );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/set-contents.lisp", position = 17160L)
  public static SubLObject cfasl_input_set_contents_singleton_style(final SubLObject stream, SubLObject v_set_contents, final SubLObject size, final SubLObject test)
  {
    if( !ONE_INTEGER.numE( size ) )
    {
      return cfasl_input_set_contents_logically( stream, v_set_contents, size, test );
    }
    final SubLObject element = cfasl.cfasl_input( stream, UNPROVIDED, UNPROVIDED );
    if( NIL != set_contents_singleton_element_p( element ) )
    {
      v_set_contents = element;
    }
    else
    {
      v_set_contents = ConsesLow.make_list( ONE_INTEGER, NIL );
      ConsesLow.rplaca( v_set_contents, element );
    }
    return v_set_contents;
  }

  @SubLTranslatedFile.SubL(source = "cycl/set-contents.lisp", position = 17655L)
  public static SubLObject cfasl_input_set_contents_list_style(final SubLObject stream, SubLObject v_set_contents, final SubLObject size, final SubLObject test)
  {
    if( ONE_INTEGER.numE( size ) )
    {
      return cfasl_input_set_contents_singleton_style( stream, v_set_contents, size, test );
    }
    v_set_contents = ConsesLow.make_list( size, NIL );
    SubLObject cons;
    SubLObject element;
    for( cons = NIL, cons = v_set_contents; !cons.isAtom(); cons = cons.rest() )
    {
      element = cfasl.cfasl_input( stream, UNPROVIDED, UNPROVIDED );
      ConsesLow.rplaca( cons, element );
    }
    return v_set_contents;
  }

  @SubLTranslatedFile.SubL(source = "cycl/set-contents.lisp", position = 18095L)
  public static SubLObject cfasl_input_set_contents_keyhash_style(final SubLObject stream, final SubLObject v_set_contents, final SubLObject size, final SubLObject test)
  {
    return cfasl_input_set_contents_logically( stream, v_set_contents, size, test );
  }

  @SubLTranslatedFile.SubL(source = "cycl/set-contents.lisp", position = 18259L)
  public static SubLObject cfasl_input_set_contents_logically(final SubLObject stream, SubLObject v_set_contents, final SubLObject size, final SubLObject test)
  {
    SubLObject i;
    SubLObject element;
    for( i = NIL, i = ZERO_INTEGER; i.numL( size ); i = Numbers.add( i, ONE_INTEGER ) )
    {
      element = cfasl.cfasl_input( stream, UNPROVIDED, UNPROVIDED );
      v_set_contents = set_contents_add( element, v_set_contents, test );
    }
    return v_set_contents;
  }

  @SubLTranslatedFile.SubL(source = "cycl/set-contents.lisp", position = 18510L)
  public static SubLObject set_contents_element_list(final SubLObject v_set_contents)
  {
    final SubLObject pcase_var = set_contents_style( v_set_contents );
    if( pcase_var.eql( $kw5$SINGLETON ) )
    {
      return ConsesLow.list( v_set_contents );
    }
    if( pcase_var.eql( $kw3$LIST ) )
    {
      return conses_high.copy_list( v_set_contents );
    }
    if( pcase_var.eql( $kw4$KEYHASH ) )
    {
      return keyhash_utilities.keyhash_element_list( v_set_contents );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/set-contents.lisp", position = 19173L)
  public static SubLObject set_contents_rebuild(final SubLObject v_set_contents)
  {
    final SubLObject pcase_var = set_contents_style( v_set_contents );
    if( !pcase_var.eql( $kw5$SINGLETON ) )
    {
      if( !pcase_var.eql( $kw3$LIST ) )
      {
        if( pcase_var.eql( $kw4$KEYHASH ) )
        {
          keyhash_utilities.keyhash_rebuild( v_set_contents );
        }
      }
    }
    return v_set_contents;
  }

  @SubLTranslatedFile.SubL(source = "cycl/set-contents.lisp", position = 19456L)
  public static SubLObject test_set_contents()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject test = Symbols.symbol_function( EQL );
    SubLObject v_set_contents = new_set_contents( ZERO_INTEGER, test );
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && !ZERO_INTEGER.numE( set_contents_size( v_set_contents ) ) )
    {
      Errors.error( $str31$new_set_contents_did_not_have_siz );
    }
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL != set_contents_memberP( ONE_INTEGER, v_set_contents, test ) )
    {
      Errors.error( $str32$set_contents_was_purported_to_con );
    }
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && !ZERO_INTEGER.numE( do_set_contents_iteration_count( v_set_contents ) ) )
    {
      Errors.error( $str33$do_set_contents_should_not_have_i );
    }
    v_set_contents = set_contents_add( ONE_INTEGER, v_set_contents, test );
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && !ONE_INTEGER.numE( set_contents_size( v_set_contents ) ) )
    {
      Errors.error( $str34$size_did_not_increment_to_1_when_ );
    }
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == set_contents_memberP( ONE_INTEGER, v_set_contents, test ) )
    {
      Errors.error( $str35$set_contents_should_have_had_1_as );
    }
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && !ONE_INTEGER.numE( do_set_contents_iteration_count( v_set_contents ) ) )
    {
      Errors.error( $str36$do_set_contents_should_have_itera );
    }
    v_set_contents = set_contents_add( ONE_INTEGER, v_set_contents, test );
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && !ONE_INTEGER.numE( set_contents_size( v_set_contents ) ) )
    {
      Errors.error( $str37$size_did_not_stay_1_when_a_redund );
    }
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL != set_contents_memberP( NIL, v_set_contents, test ) )
    {
      Errors.error( $str38$incorrectly_thought_that_NIL_was_ );
    }
    v_set_contents = set_contents_add( NIL, v_set_contents, test );
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && !TWO_INTEGER.numE( set_contents_size( v_set_contents ) ) )
    {
      Errors.error( $str39$size_did_not_increment_to_2_when_ );
    }
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == set_contents_memberP( NIL, v_set_contents, test ) )
    {
      Errors.error( $str40$failed_to_identify_that_NIL_is_an );
    }
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && !TWO_INTEGER.numE( do_set_contents_iteration_count( v_set_contents ) ) )
    {
      Errors.error( $str41$do_set_contents_should_have_itera );
    }
    SubLObject n;
    for( n = NIL, n = ZERO_INTEGER; n.numL( $int42$2000 ); n = Numbers.add( n, ONE_INTEGER ) )
    {
      v_set_contents = set_contents_add( n, v_set_contents, test );
    }
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && !$int43$2001.numE( set_contents_size( v_set_contents ) ) )
    {
      Errors.error( $str44$size_did_not_increment_to_2001 );
    }
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == set_contents_memberP( $int45$212, v_set_contents, test ) )
    {
      Errors.error( $str46$212_was_not_a_member );
    }
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && !$int43$2001.numE( do_set_contents_iteration_count( v_set_contents ) ) )
    {
      Errors.error( $str47$do_set_contents_should_have_itera );
    }
    v_set_contents = set_contents_delete( T, v_set_contents, test );
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && !$int43$2001.numE( set_contents_size( v_set_contents ) ) )
    {
      Errors.error( $str48$removing_an_element_that_wasn_t_t );
    }
    v_set_contents = set_contents_delete( $int45$212, v_set_contents, test );
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && !$int42$2000.numE( set_contents_size( v_set_contents ) ) )
    {
      Errors.error( $str49$removing_an_element_failed_to_dec );
    }
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && !$int42$2000.numE( do_set_contents_iteration_count( v_set_contents ) ) )
    {
      Errors.error( $str50$do_set_contents_should_have_itera );
    }
    for( n = NIL, n = ZERO_INTEGER; n.numL( $int42$2000 ); n = Numbers.add( n, ONE_INTEGER ) )
    {
      v_set_contents = set_contents_delete( n, v_set_contents, test );
    }
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL != set_contents_memberP( ONE_INTEGER, v_set_contents, test ) )
    {
      Errors.error( $str51$newly_emptied_set_contents_was_pu );
    }
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == set_contents_memberP( NIL, v_set_contents, test ) )
    {
      Errors.error( $str52$failed_to_identify_that_NIL_is_st );
    }
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && !ONE_INTEGER.numE( set_contents_size( v_set_contents ) ) )
    {
      Errors.error( $str53$size_did_not_decrement_to_1_when_ );
    }
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && !ONE_INTEGER.numE( do_set_contents_iteration_count( v_set_contents ) ) )
    {
      Errors.error( $str36$do_set_contents_should_have_itera );
    }
    v_set_contents = set_contents_delete( NIL, v_set_contents, test );
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && !ZERO_INTEGER.numE( set_contents_size( v_set_contents ) ) )
    {
      Errors.error( $str54$newly_emptied_set_contents_did_no );
    }
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && !ZERO_INTEGER.numE( do_set_contents_iteration_count( v_set_contents ) ) )
    {
      Errors.error( $str33$do_set_contents_should_not_have_i );
    }
    v_set_contents = set_contents_add( T, v_set_contents, test );
    v_set_contents = set_contents_delete( T, v_set_contents, test );
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && !ZERO_INTEGER.numE( set_contents_size( v_set_contents ) ) )
    {
      Errors.error( $str54$newly_emptied_set_contents_did_no );
    }
    return $kw55$SUCCESS;
  }

  @SubLTranslatedFile.SubL(source = "cycl/set-contents.lisp", position = 19456L)
  public static SubLObject do_set_contents_iteration_count(final SubLObject v_set_contents)
  {
    SubLObject count = ZERO_INTEGER;
    SubLObject basis_object;
    SubLObject state;
    SubLObject element;
    for( basis_object = do_set_contents_basis_object( v_set_contents ), state = NIL, state = do_set_contents_initial_state( basis_object, v_set_contents ); NIL == do_set_contents_doneP( basis_object,
        state ); state = do_set_contents_update_state( state ) )
    {
      element = do_set_contents_next( basis_object, state );
      if( NIL != do_set_contents_element_validP( state, element ) )
      {
        count = Numbers.add( count, ONE_INTEGER );
      }
    }
    return count;
  }

  public static SubLObject declare_set_contents_file()
  {
    SubLFiles.declareFunction( me, "set_contents_singleton_element_p", "SET-CONTENTS-SINGLETON-ELEMENT-P", 1, 0, false );
    SubLFiles.declareFunction( me, "set_contents_style", "SET-CONTENTS-STYLE", 1, 0, false );
    SubLFiles.declareFunction( me, "set_contents_member_singleton_style", "SET-CONTENTS-MEMBER-SINGLETON-STYLE", 3, 0, false );
    SubLFiles.declareFunction( me, "set_contents_member_list_style", "SET-CONTENTS-MEMBER-LIST-STYLE", 3, 0, false );
    SubLFiles.declareFunction( me, "set_contents_nmember_list_style", "SET-CONTENTS-NMEMBER-LIST-STYLE", 3, 0, false );
    SubLFiles.declareFunction( me, "set_contents_member_keyhash_style", "SET-CONTENTS-MEMBER-KEYHASH-STYLE", 3, 0, false );
    SubLFiles.declareFunction( me, "set_contents_matching_element_singleton_style", "SET-CONTENTS-MATCHING-ELEMENT-SINGLETON-STYLE", 3, 0, false );
    SubLFiles.declareFunction( me, "set_contents_matching_element_list_style", "SET-CONTENTS-MATCHING-ELEMENT-LIST-STYLE", 3, 0, false );
    SubLFiles.declareFunction( me, "set_contents_matching_element_keyhash_style", "SET-CONTENTS-MATCHING-ELEMENT-KEYHASH-STYLE", 3, 0, false );
    SubLFiles.declareFunction( me, "set_contents_add_singleton_style", "SET-CONTENTS-ADD-SINGLETON-STYLE", 3, 0, false );
    SubLFiles.declareFunction( me, "set_contents_add_list_style", "SET-CONTENTS-ADD-LIST-STYLE", 3, 0, false );
    SubLFiles.declareFunction( me, "set_contents_add_keyhash_style", "SET-CONTENTS-ADD-KEYHASH-STYLE", 3, 0, false );
    SubLFiles.declareFunction( me, "set_contents_delete_singleton_style", "SET-CONTENTS-DELETE-SINGLETON-STYLE", 3, 0, false );
    SubLFiles.declareFunction( me, "set_contents_delete_list_style", "SET-CONTENTS-DELETE-LIST-STYLE", 3, 0, false );
    SubLFiles.declareFunction( me, "set_contents_delete_keyhash_style", "SET-CONTENTS-DELETE-KEYHASH-STYLE", 3, 0, false );
    SubLFiles.declareFunction( me, "set_contents_p", "SET-CONTENTS-P", 1, 0, false );
    SubLFiles.declareFunction( me, "set_contents_of_type_p", "SET-CONTENTS-OF-TYPE-P", 2, 0, false );
    SubLFiles.declareFunction( me, "new_set_contents", "NEW-SET-CONTENTS", 0, 2, false );
    SubLFiles.declareFunction( me, "copy_set_contents", "COPY-SET-CONTENTS", 1, 0, false );
    SubLFiles.declareFunction( me, "set_contents_size", "SET-CONTENTS-SIZE", 1, 0, false );
    new $set_contents_size$UnaryFunction();
    SubLFiles.declareFunction( me, "set_contents_emptyP", "SET-CONTENTS-EMPTY?", 1, 0, false );
    SubLFiles.declareFunction( me, "set_contents_singletonP", "SET-CONTENTS-SINGLETON?", 1, 0, false );
    SubLFiles.declareFunction( me, "set_contents_memberP", "SET-CONTENTS-MEMBER?", 2, 1, false );
    SubLFiles.declareFunction( me, "set_contents_nmemberP", "SET-CONTENTS-NMEMBER?", 2, 1, false );
    SubLFiles.declareFunction( me, "set_contents_matching_element", "SET-CONTENTS-MATCHING-ELEMENT", 2, 1, false );
    SubLFiles.declareFunction( me, "set_contents_random_element", "SET-CONTENTS-RANDOM-ELEMENT", 1, 0, false );
    SubLFiles.declareFunction( me, "singleton_set_contents_element", "SINGLETON-SET-CONTENTS-ELEMENT", 1, 0, false );
    SubLFiles.declareFunction( me, "set_contents_add", "SET-CONTENTS-ADD", 2, 1, false );
    SubLFiles.declareFunction( me, "set_contents_delete", "SET-CONTENTS-DELETE", 2, 1, false );
    SubLFiles.declareFunction( me, "clear_set_contents", "CLEAR-SET-CONTENTS", 1, 0, false );
    SubLFiles.declareFunction( me, "new_set_contents_iterator", "NEW-SET-CONTENTS-ITERATOR", 1, 0, false );
    SubLFiles.declareMacro( me, "do_set_contents", "DO-SET-CONTENTS" );
    SubLFiles.declareFunction( me, "do_set_contents_basis_object", "DO-SET-CONTENTS-BASIS-OBJECT", 1, 0, false );
    SubLFiles.declareFunction( me, "do_set_contents_initial_state", "DO-SET-CONTENTS-INITIAL-STATE", 2, 0, false );
    SubLFiles.declareFunction( me, "do_set_contents_update_state", "DO-SET-CONTENTS-UPDATE-STATE", 1, 0, false );
    SubLFiles.declareFunction( me, "do_set_contents_doneP", "DO-SET-CONTENTS-DONE?", 2, 0, false );
    SubLFiles.declareFunction( me, "do_set_contents_next", "DO-SET-CONTENTS-NEXT", 2, 0, false );
    SubLFiles.declareFunction( me, "do_set_contents_element_validP", "DO-SET-CONTENTS-ELEMENT-VALID?", 2, 0, false );
    SubLFiles.declareFunction( me, "map_set_contents", "MAP-SET-CONTENTS", 2, 1, false );
    SubLFiles.declareFunction( me, "cfasl_input_set_contents", "CFASL-INPUT-SET-CONTENTS", 4, 0, false );
    SubLFiles.declareFunction( me, "cfasl_input_set_contents_singleton_style", "CFASL-INPUT-SET-CONTENTS-SINGLETON-STYLE", 4, 0, false );
    SubLFiles.declareFunction( me, "cfasl_input_set_contents_list_style", "CFASL-INPUT-SET-CONTENTS-LIST-STYLE", 4, 0, false );
    SubLFiles.declareFunction( me, "cfasl_input_set_contents_keyhash_style", "CFASL-INPUT-SET-CONTENTS-KEYHASH-STYLE", 4, 0, false );
    SubLFiles.declareFunction( me, "cfasl_input_set_contents_logically", "CFASL-INPUT-SET-CONTENTS-LOGICALLY", 4, 0, false );
    SubLFiles.declareFunction( me, "set_contents_element_list", "SET-CONTENTS-ELEMENT-LIST", 1, 0, false );
    SubLFiles.declareFunction( me, "set_contents_rebuild", "SET-CONTENTS-REBUILD", 1, 0, false );
    SubLFiles.declareFunction( me, "test_set_contents", "TEST-SET-CONTENTS", 0, 0, false );
    SubLFiles.declareFunction( me, "do_set_contents_iteration_count", "DO-SET-CONTENTS-ITERATION-COUNT", 1, 0, false );
    return NIL;
  }

  public static SubLObject init_set_contents_file()
  {
    $set_contents_grow_to_keyhash_size$ = SubLFiles.deflexical( "*SET-CONTENTS-GROW-TO-KEYHASH-SIZE*", $int0$128 );
    $set_contents_shrink_to_list_size$ = SubLFiles.deflexical( "*SET-CONTENTS-SHRINK-TO-LIST-SIZE*", $int1$110 );
    return NIL;
  }

  public static SubLObject setup_set_contents_file()
  {
    SubLSpecialOperatorDeclarations.proclaim( $list2 );
    SubLSpecialOperatorDeclarations.proclaim( $list6 );
    SubLSpecialOperatorDeclarations.proclaim( $list8 );
    access_macros.register_macro_helper( $sym20$DO_SET_CONTENTS_BASIS_OBJECT, $sym29$DO_SET_CONTENTS );
    access_macros.register_macro_helper( $sym22$DO_SET_CONTENTS_INITIAL_STATE, $sym29$DO_SET_CONTENTS );
    access_macros.register_macro_helper( $sym23$DO_SET_CONTENTS_UPDATE_STATE, $sym29$DO_SET_CONTENTS );
    access_macros.register_macro_helper( $sym25$DO_SET_CONTENTS_DONE_, $sym29$DO_SET_CONTENTS );
    access_macros.register_macro_helper( $sym26$DO_SET_CONTENTS_NEXT, $sym29$DO_SET_CONTENTS );
    access_macros.register_macro_helper( $sym28$DO_SET_CONTENTS_ELEMENT_VALID_, $sym29$DO_SET_CONTENTS );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_set_contents_file();
  }

  @Override
  public void initializeVariables()
  {
    init_set_contents_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_set_contents_file();
  }
  static
  {
    me = new set_contents();
    $set_contents_grow_to_keyhash_size$ = null;
    $set_contents_shrink_to_list_size$ = null;
    $int0$128 = makeInteger( 128 );
    $int1$110 = makeInteger( 110 );
    $list2 = ConsesLow.list( makeSymbol( "INLINE" ), makeSymbol( "SET-CONTENTS-STYLE" ) );
    $kw3$LIST = makeKeyword( "LIST" );
    $kw4$KEYHASH = makeKeyword( "KEYHASH" );
    $kw5$SINGLETON = makeKeyword( "SINGLETON" );
    $list6 = ConsesLow.list( makeSymbol( "INLINE" ), makeSymbol( "SET-CONTENTS-MEMBER-SINGLETON-STYLE" ), makeSymbol( "SET-CONTENTS-MEMBER-LIST-STYLE" ), makeSymbol( "SET-CONTENTS-MEMBER-KEYHASH-STYLE" ) );
    $str7$Keyhash_test_conflict___S_and__S = makeString( "Keyhash test conflict: ~S and ~S" );
    $list8 = ConsesLow.list( makeSymbol( "INLINE" ), makeSymbol( "SET-CONTENTS-ADD-KEYHASH-STYLE" ) );
    $sym9$FUNCTION_SPEC_P = makeSymbol( "FUNCTION-SPEC-P" );
    $sym10$NON_NEGATIVE_INTEGER_P = makeSymbol( "NON-NEGATIVE-INTEGER-P" );
    $sym11$VALID_HASH_TEST_P = makeSymbol( "VALID-HASH-TEST-P" );
    $list12 = ConsesLow.list( ConsesLow.list( makeSymbol( "ELEMENT-VAR" ), makeSymbol( "SET-CONTENTS" ), makeSymbol( "&KEY" ), makeSymbol( "DONE" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $list13 = ConsesLow.list( makeKeyword( "DONE" ) );
    $kw14$ALLOW_OTHER_KEYS = makeKeyword( "ALLOW-OTHER-KEYS" );
    $kw15$DONE = makeKeyword( "DONE" );
    $sym16$SET_CONTENTS_VAR = makeUninternedSymbol( "SET-CONTENTS-VAR" );
    $sym17$BASIS_OBJECT = makeUninternedSymbol( "BASIS-OBJECT" );
    $sym18$STATE = makeUninternedSymbol( "STATE" );
    $sym19$CLET = makeSymbol( "CLET" );
    $sym20$DO_SET_CONTENTS_BASIS_OBJECT = makeSymbol( "DO-SET-CONTENTS-BASIS-OBJECT" );
    $sym21$CDO = makeSymbol( "CDO" );
    $sym22$DO_SET_CONTENTS_INITIAL_STATE = makeSymbol( "DO-SET-CONTENTS-INITIAL-STATE" );
    $sym23$DO_SET_CONTENTS_UPDATE_STATE = makeSymbol( "DO-SET-CONTENTS-UPDATE-STATE" );
    $sym24$COR = makeSymbol( "COR" );
    $sym25$DO_SET_CONTENTS_DONE_ = makeSymbol( "DO-SET-CONTENTS-DONE?" );
    $sym26$DO_SET_CONTENTS_NEXT = makeSymbol( "DO-SET-CONTENTS-NEXT" );
    $sym27$PWHEN = makeSymbol( "PWHEN" );
    $sym28$DO_SET_CONTENTS_ELEMENT_VALID_ = makeSymbol( "DO-SET-CONTENTS-ELEMENT-VALID?" );
    $sym29$DO_SET_CONTENTS = makeSymbol( "DO-SET-CONTENTS" );
    $kw30$NOT_DONE = makeKeyword( "NOT-DONE" );
    $str31$new_set_contents_did_not_have_siz = makeString( "new set-contents did not have size zero" );
    $str32$set_contents_was_purported_to_con = makeString( "set-contents was purported to contain 1 as an element but should have been empty" );
    $str33$do_set_contents_should_not_have_i = makeString( "do-set-contents should not have iterated over set-contents." );
    $str34$size_did_not_increment_to_1_when_ = makeString( "size did not increment to 1 when an element was added" );
    $str35$set_contents_should_have_had_1_as = makeString( "set-contents should have had 1 as an element but did not" );
    $str36$do_set_contents_should_have_itera = makeString( "do-set-contents should have iterated once over set-contents." );
    $str37$size_did_not_stay_1_when_a_redund = makeString( "size did not stay 1 when a redundant element was added" );
    $str38$incorrectly_thought_that_NIL_was_ = makeString( "incorrectly thought that NIL was an element of the set-contents" );
    $str39$size_did_not_increment_to_2_when_ = makeString( "size did not increment to 2 when a new element was added" );
    $str40$failed_to_identify_that_NIL_is_an = makeString( "failed to identify that NIL is an element of the set-contents" );
    $str41$do_set_contents_should_have_itera = makeString( "do-set-contents should have iterated twice over set-contents." );
    $int42$2000 = makeInteger( 2000 );
    $int43$2001 = makeInteger( 2001 );
    $str44$size_did_not_increment_to_2001 = makeString( "size did not increment to 2001" );
    $int45$212 = makeInteger( 212 );
    $str46$212_was_not_a_member = makeString( "212 was not a member" );
    $str47$do_set_contents_should_have_itera = makeString( "do-set-contents should have iterated 2001 times over set-contents." );
    $str48$removing_an_element_that_wasn_t_t = makeString( "removing an element that wasn't there decreased the size of the set-contents" );
    $str49$removing_an_element_failed_to_dec = makeString( "removing an element failed to decrement the size of a large set-contents" );
    $str50$do_set_contents_should_have_itera = makeString( "do-set-contents should have iterated 2000 times over set-contents." );
    $str51$newly_emptied_set_contents_was_pu = makeString( "newly emptied set-contents was purported to contain 1 as an element but should have been empty except for NIL" );
    $str52$failed_to_identify_that_NIL_is_st = makeString( "failed to identify that NIL is still an element of the set-contents" );
    $str53$size_did_not_decrement_to_1_when_ = makeString( "size did not decrement to 1 when lots of elements were deleted" );
    $str54$newly_emptied_set_contents_did_no = makeString( "newly emptied set-contents did not have size zero" );
    $kw55$SUCCESS = makeKeyword( "SUCCESS" );
  }

  public static final class $set_contents_size$UnaryFunction
      extends
        UnaryFunction
  {
    public $set_contents_size$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "SET-CONTENTS-SIZE" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1)
    {
      return set_contents_size( arg1 );
    }
  }
}
/*
 * 
 * Total time: 229 ms
 * 
 */